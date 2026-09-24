package com.zabanyar.ai.data

import android.content.Context
import android.content.SharedPreferences

object ProgressManager {

    // ==================== ثابت‌های کلیدی ====================
    const val CHAPTERS_PER_GROUP = 3
    const val QUESTIONS_PER_QUIZ = 20
    const val PASS_THRESHOLD_PERCENT = 90

    // ==================== SharedPreferences ====================
    private const val PROGRESS_PREFS = "zabanyar_progress"
    private const val SETTINGS_PREFS = "zabanyar_settings"

    private const val KEY_CHAPTER_PREFIX = "chapter_"
    private const val KEY_QUIZ_PREFIX = "quiz_"
    private const val KEY_UNLOCKED_GROUPS = "unlocked_groups_"

    private const val KEY_SHOW_TRANSLATION = "show_translation"
    private const val KEY_DARK_MODE = "dark_mode"
    private const val KEY_SOUND_ENABLED = "sound_enabled"
    private const val KEY_AUTO_PLAY = "auto_play"

    private fun getProgressPrefs(context: Context): SharedPreferences =
        context.getSharedPreferences(PROGRESS_PREFS, Context.MODE_PRIVATE)

    private fun getSettingsPrefs(context: Context): SharedPreferences =
        context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)


    // ============================================================
    // 📊 دیتاکلاس‌ها
    // ============================================================

    data class ChapterState(
        val chapterNumber: Int,
        val isRead: Boolean,
        val isUnlocked: Boolean
    )

    data class QuizState(
        val quizIndex: Int,
        val firstChapter: Int,
        val lastChapter: Int,
        val isUnlocked: Boolean,
        val isPassed: Boolean,
        val bestScore: Int,
        val attempts: Int
    )

    data class BookProgressSummary(
        val readChapters: Int,
        val totalChapters: Int,
        val overallProgressPercent: Int,
        val quizzesPassed: Int,
        val totalQuizzes: Int,
        val unlockedGroups: Int,
        val totalGroups: Int
    )

    data class QuizResult(
        val bookId: String,
        val quizIndex: Int,
        val score: Int,
        val total: Int,
        val passed: Boolean,
        val attemptDate: Long = System.currentTimeMillis()
    )


    // ============================================================
    // ✅ بخش اول: متدهای ساده (قفل و پیشرفت)
    // ============================================================

    fun markChapterAsRead(context: Context, bookId: String, chapterNumber: Int) {
        getProgressPrefs(context).edit()
            .putBoolean("${KEY_CHAPTER_PREFIX}${bookId}_$chapterNumber", true)
            .apply()
    }

    fun isChapterRead(context: Context, bookId: String, chapterNumber: Int): Boolean {
        return getProgressPrefs(context)
            .getBoolean("${KEY_CHAPTER_PREFIX}${bookId}_$chapterNumber", false)
    }

    fun isChapterUnlocked(context: Context, bookId: String, chapterNumber: Int): Boolean {
        if (chapterNumber == 1) return true
        return isChapterRead(context, bookId, chapterNumber - 1)
    }

    fun isQuizUnlocked(
        context: Context,
        bookId: String,
        quizIndex: Int,
        totalChapters: Int
    ): Boolean {
        val groupEndChapter = quizIndex * CHAPTERS_PER_GROUP
        if (groupEndChapter > totalChapters) return false
        for (i in (groupEndChapter - CHAPTERS_PER_GROUP + 1)..groupEndChapter) {
            if (!isChapterRead(context, bookId, i)) return false
        }
        return true
    }

    fun isQuizPassed(context: Context, bookId: String, quizIndex: Int): Boolean {
        return getProgressPrefs(context)
            .getBoolean("${KEY_QUIZ_PREFIX}passed_${bookId}_$quizIndex", false)
    }

    fun saveQuizResult(
        context: Context,
        bookId: String,
        quizIndex: Int,
        score: Int,
        total: Int
    ) {
        val percent = (score.toFloat() / total.toFloat()) * 100
        val passed = percent >= PASS_THRESHOLD_PERCENT
        val oldAttempts = getQuizAttempts(context, bookId, quizIndex)
        val oldBest = getQuizBestScore(context, bookId, quizIndex)

        getProgressPrefs(context).edit().apply {
            putBoolean("${KEY_QUIZ_PREFIX}passed_${bookId}_$quizIndex", passed || isQuizPassed(context, bookId, quizIndex))
            putInt("${KEY_QUIZ_PREFIX}score_${bookId}_$quizIndex", maxOf(score, oldBest))
            putInt("${KEY_QUIZ_PREFIX}attempts_${bookId}_$quizIndex", oldAttempts + 1)
        }.apply()

        // اگه قبول شد، گروه بعدی رو باز کن
        if (passed) {
            unlockNextGroup(context, bookId)
        }
    }

    fun getQuizBestScore(context: Context, bookId: String, quizIndex: Int): Int {
        return getProgressPrefs(context)
            .getInt("${KEY_QUIZ_PREFIX}score_${bookId}_$quizIndex", 0)
    }

    fun getQuizAttempts(context: Context, bookId: String, quizIndex: Int): Int {
        return getProgressPrefs(context)
            .getInt("${KEY_QUIZ_PREFIX}attempts_${bookId}_$quizIndex", 0)
    }

    fun getUnlockedGroupsCount(context: Context, bookId: String): Int {
        return getProgressPrefs(context).getInt("${KEY_UNLOCKED_GROUPS}$bookId", 1)
    }

    fun unlockNextGroup(context: Context, bookId: String) {
        val current = getUnlockedGroupsCount(context, bookId)
        getProgressPrefs(context).edit()
            .putInt("${KEY_UNLOCKED_GROUPS}$bookId", current + 1)
            .apply()
    }


    // ============================================================
    // 🚀 بخش دوم: متدهای فوق پیشرفته (برای BookDetailScreen)
    // ============================================================

    /**
     * دریافت وضعیت تمام درس‌های یک کتاب
     */
    fun getChapterStates(
        context: Context,
        bookId: String,
        totalChapters: Int
    ): List<ChapterState> {
        val states = mutableListOf<ChapterState>()
        for (i in 1..totalChapters) {
            val isRead = isChapterRead(context, bookId, i)
            val isUnlocked = isChapterUnlocked(context, bookId, i)
            states.add(
                ChapterState(
                    chapterNumber = i,
                    isRead = isRead,
                    isUnlocked = isUnlocked
                )
            )
        }
        return states
    }

    /**
     * دریافت وضعیت تمام آزمون‌های یک کتاب
     */
    fun getQuizStates(
        context: Context,
        bookId: String,
        totalChapters: Int
    ): List<QuizState> {
        val states = mutableListOf<QuizState>()
        val totalGroups = (totalChapters + CHAPTERS_PER_GROUP - 1) / CHAPTERS_PER_GROUP

        for (groupIndex in 0 until totalGroups - 1) {
            val firstCh = groupIndex * CHAPTERS_PER_GROUP + 1
            val lastCh = minOf(firstCh + CHAPTERS_PER_GROUP - 1, totalChapters)

            val isUnlocked = isQuizUnlocked(context, bookId, groupIndex, totalChapters)
            val isPassed = isQuizPassed(context, bookId, groupIndex)
            val bestScore = getQuizBestScore(context, bookId, groupIndex)
            val attempts = getQuizAttempts(context, bookId, groupIndex)

            states.add(
                QuizState(
                    quizIndex = groupIndex,
                    firstChapter = firstCh,
                    lastChapter = lastCh,
                    isUnlocked = isUnlocked,
                    isPassed = isPassed,
                    bestScore = bestScore,
                    attempts = attempts
                )
            )
        }
        return states
    }

    /**
     * خلاصه پیشرفت کامل یک کتاب
     */
    fun getBookProgress(
        context: Context,
        bookId: String,
        totalChapters: Int
    ): BookProgressSummary {
        var readCount = 0
        for (i in 1..totalChapters) {
            if (isChapterRead(context, bookId, i)) readCount++
        }

        val totalGroups = (totalChapters + CHAPTERS_PER_GROUP - 1) / CHAPTERS_PER_GROUP
        val totalQuizzes = maxOf(0, totalGroups - 1)
        var quizzesPassed = 0
        for (i in 0 until totalQuizzes) {
            if (isQuizPassed(context, bookId, i)) quizzesPassed++
        }

        val unlockedGroups = getUnlockedGroupsCount(context, bookId)
        val percent = if (totalChapters > 0) (readCount * 100) / totalChapters else 0

        return BookProgressSummary(
            readChapters = readCount,
            totalChapters = totalChapters,
            overallProgressPercent = percent,
            quizzesPassed = quizzesPassed,
            totalQuizzes = totalQuizzes,
            unlockedGroups = minOf(unlockedGroups, totalGroups),
            totalGroups = totalGroups
        )
    }

    /**
     * دریافت درصد پیشرفت (فقط عدد، برای جاهایی که Float لازمه)
     */
    fun getBookProgressPercent(
        context: Context,
        bookId: String,
        totalChapters: Int
    ): Float {
        var readCount = 0
        for (i in 1..totalChapters) {
            if (isChapterRead(context, bookId, i)) readCount++
        }
        return if (totalChapters > 0) readCount.toFloat() / totalChapters.toFloat() else 0f
    }

    /**
     * ریست کامل پیشرفت یک کتاب
     */
    fun resetBookProgress(context: Context, bookId: String, totalChapters: Int) {
        val editor = getProgressPrefs(context).edit()
        for (i in 1..totalChapters) {
            editor.remove("${KEY_CHAPTER_PREFIX}${bookId}_$i")
        }
        for (i in 0 until totalChapters) {
            editor.remove("${KEY_QUIZ_PREFIX}passed_${bookId}_$i")
            editor.remove("${KEY_QUIZ_PREFIX}score_${bookId}_$i")
            editor.remove("${KEY_QUIZ_PREFIX}attempts_${bookId}_$i")
        }
        editor.remove("${KEY_UNLOCKED_GROUPS}$bookId")
        editor.apply()
    }


    // ============================================================
    // ⚙️ بخش سوم: تنظیمات کاربر
    // ============================================================

    fun setShowTranslation(context: Context, show: Boolean) {
        getSettingsPrefs(context).edit().putBoolean(KEY_SHOW_TRANSLATION, show).apply()
    }
    fun isShowTranslation(context: Context): Boolean {
        return getSettingsPrefs(context).getBoolean(KEY_SHOW_TRANSLATION, true)
    }

    fun setDarkMode(context: Context, enabled: Boolean) {
        getSettingsPrefs(context).edit().putBoolean(KEY_DARK_MODE, enabled).apply()
    }
    fun isDarkMode(context: Context): Boolean {
        return getSettingsPrefs(context).getBoolean(KEY_DARK_MODE, false)
    }

    fun setSoundEnabled(context: Context, enabled: Boolean) {
        getSettingsPrefs(context).edit().putBoolean(KEY_SOUND_ENABLED, enabled).apply()
    }
    fun isSoundEnabled(context: Context): Boolean {
        return getSettingsPrefs(context).getBoolean(KEY_SOUND_ENABLED, true)
    }

    fun setAutoPlay(context: Context, enabled: Boolean) {
        getSettingsPrefs(context).edit().putBoolean(KEY_AUTO_PLAY, enabled).apply()
    }
    fun isAutoPlay(context: Context): Boolean {
        return getSettingsPrefs(context).getBoolean(KEY_AUTO_PLAY, true)
    }
}