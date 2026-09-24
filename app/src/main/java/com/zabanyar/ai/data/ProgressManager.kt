package com.zabanyar.ai.data

import android.content.Context
import android.content.SharedPreferences
import java.util.Calendar

object ProgressManager {

    // ==================== ثابت‌ها ====================
    const val CHAPTERS_PER_GROUP = 3
    const val QUESTIONS_PER_QUIZ = 20
    const val PASS_THRESHOLD_PERCENT = 90
    const val STARS_PER_QUIZ_PASS = 20
    const val STARS_PER_QUIZ_ATTEMPT = 2

    // ==================== SharedPreferences ====================
    private const val PROGRESS_PREFS = "zabanyar_progress"
    private const val SETTINGS_PREFS = "zabanyar_settings"

    private const val KEY_CHAPTER_PREFIX = "chapter_"
    private const val KEY_QUIZ_PREFIX = "quiz_"
    private const val KEY_UNLOCKED_GROUPS = "unlocked_groups_"
    private const val KEY_TOTAL_STARS = "total_stars"
    private const val KEY_LESSONS_COMPLETED = "lessons_completed"
    private const val KEY_DAILY_STREAK = "daily_streak"
    private const val KEY_LAST_ACTIVITY_DATE = "last_activity_date"
    private const val KEY_STUDY_MINUTES_PREFIX = "study_minutes_"

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
    // ✅ بخش ۱: توابع پایه (قفل و پیشرفت هر کتاب)
    // ============================================================

    fun markChapterAsRead(context: Context, bookId: String, chapterNumber: Int) {
        val prefs = getProgressPrefs(context)
        val wasRead = prefs.getBoolean("${KEY_CHAPTER_PREFIX}${bookId}_$chapterNumber", false)

        prefs.edit()
            .putBoolean("${KEY_CHAPTER_PREFIX}${bookId}_$chapterNumber", true)
            .apply()

        // اگه تازه خونده شد، آمار کلی رو زیاد کن
        if (!wasRead) {
            incrementLessonsCompleted(context)
            recordDailyActivity(context)
            addStars(context, 5) // ۵ ستاره برای هر درس
        }
    }

    fun isChapterRead(context: Context, bookId: String, chapterNumber: Int): Boolean {
        return getProgressPrefs(context).getBoolean("${KEY_CHAPTER_PREFIX}${bookId}_$chapterNumber", false)
    }

    fun isChapterUnlocked(context: Context, bookId: String, chapterNumber: Int): Boolean {
        if (chapterNumber == 1) return true
        return isChapterRead(context, bookId, chapterNumber - 1)
    }

    fun isQuizUnlocked(context: Context, bookId: String, quizIndex: Int, totalChapters: Int): Boolean {
        val groupEndChapter = quizIndex * CHAPTERS_PER_GROUP
        if (groupEndChapter > totalChapters) return false
        for (i in (groupEndChapter - CHAPTERS_PER_GROUP + 1)..groupEndChapter) {
            if (!isChapterRead(context, bookId, i)) return false
        }
        return true
    }

    fun isQuizPassed(context: Context, bookId: String, quizIndex: Int): Boolean {
        return getProgressPrefs(context).getBoolean("${KEY_QUIZ_PREFIX}passed_${bookId}_$quizIndex", false)
    }

    fun saveQuizResult(context: Context, bookId: String, quizIndex: Int, score: Int, total: Int) {
        val percent = (score.toFloat() / total.toFloat()) * 100
        val passed = percent >= PASS_THRESHOLD_PERCENT
        val wasPassed = isQuizPassed(context, bookId, quizIndex)
        val oldAttempts = getQuizAttempts(context, bookId, quizIndex)
        val oldBest = getQuizBestScore(context, bookId, quizIndex)

        getProgressPrefs(context).edit().apply {
            putBoolean("${KEY_QUIZ_PREFIX}passed_${bookId}_$quizIndex", passed || wasPassed)
            putInt("${KEY_QUIZ_PREFIX}score_${bookId}_$quizIndex", maxOf(score, oldBest))
            putInt("${KEY_QUIZ_PREFIX}attempts_${bookId}_$quizIndex", oldAttempts + 1)
        }.apply()

        recordDailyActivity(context)

        if (passed && !wasPassed) {
            addStars(context, STARS_PER_QUIZ_PASS) // پاداش قبولی: ۲۰ ستاره
            unlockNextGroup(context, bookId)
        } else if (!passed) {
            addStars(context, STARS_PER_QUIZ_ATTEMPT) // پاداش تلاش: ۲ ستاره
        }
    }

    fun getQuizBestScore(context: Context, bookId: String, quizIndex: Int): Int =
        getProgressPrefs(context).getInt("${KEY_QUIZ_PREFIX}score_${bookId}_$quizIndex", 0)

    fun getQuizAttempts(context: Context, bookId: String, quizIndex: Int): Int =
        getProgressPrefs(context).getInt("${KEY_QUIZ_PREFIX}attempts_${bookId}_$quizIndex", 0)

    fun getUnlockedGroupsCount(context: Context, bookId: String): Int =
        getProgressPrefs(context).getInt("${KEY_UNLOCKED_GROUPS}$bookId", 1)

    fun unlockNextGroup(context: Context, bookId: String) {
        val current = getUnlockedGroupsCount(context, bookId)
        getProgressPrefs(context).edit().putInt("${KEY_UNLOCKED_GROUPS}$bookId", current + 1).apply()
    }


    // ============================================================
    // 🚀 بخش ۲: توابع فوق پیشرفته (برای BookDetailScreen)
    // ============================================================

    fun getChapterStates(context: Context, bookId: String, totalChapters: Int): List<ChapterState> {
        val states = mutableListOf<ChapterState>()
        for (i in 1..totalChapters) {
            states.add(
                ChapterState(
                    chapterNumber = i,
                    isRead = isChapterRead(context, bookId, i),
                    isUnlocked = isChapterUnlocked(context, bookId, i)
                )
            )
        }
        return states
    }

    fun getQuizStates(context: Context, bookId: String, totalChapters: Int): List<QuizState> {
        val states = mutableListOf<QuizState>()
        val totalGroups = (totalChapters + CHAPTERS_PER_GROUP - 1) / CHAPTERS_PER_GROUP

        for (groupIndex in 0 until maxOf(0, totalGroups - 1)) {
            val firstCh = groupIndex * CHAPTERS_PER_GROUP + 1
            val lastCh = minOf(firstCh + CHAPTERS_PER_GROUP - 1, totalChapters)

            states.add(
                QuizState(
                    quizIndex = groupIndex,
                    firstChapter = firstCh,
                    lastChapter = lastCh,
                    isUnlocked = isQuizUnlocked(context, bookId, groupIndex, totalChapters),
                    isPassed = isQuizPassed(context, bookId, groupIndex),
                    bestScore = getQuizBestScore(context, bookId, groupIndex),
                    attempts = getQuizAttempts(context, bookId, groupIndex)
                )
            )
        }
        return states
    }

    fun getBookProgress(context: Context, bookId: String, totalChapters: Int): BookProgressSummary {
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

    fun getBookProgressPercent(context: Context, bookId: String, totalChapters: Int): Float {
        var readCount = 0
        for (i in 1..totalChapters) {
            if (isChapterRead(context, bookId, i)) readCount++
        }
        return if (totalChapters > 0) readCount.toFloat() / totalChapters.toFloat() else 0f
    }

    fun isBookStarted(context: Context, bookId: String): Boolean {
        // اگه حداقل یک درس از این کتاب خونده شده باشه، یعنی شروع شده
        return getUnlockedGroupsCount(context, bookId) > 1 ||
                isChapterRead(context, bookId, 1)
    }

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
    // 🌟 بخش ۳: آمار کلی (برای HomeScreen)
    // ============================================================

    fun getTotalStars(context: Context): Int =
        getProgressPrefs(context).getInt(KEY_TOTAL_STARS, 0)

    fun addStars(context: Context, count: Int) {
        val current = getTotalStars(context)
        getProgressPrefs(context).edit().putInt(KEY_TOTAL_STARS, current + count).apply()
    }

    fun getLessonsCompleted(context: Context): Int =
        getProgressPrefs(context).getInt(KEY_LESSONS_COMPLETED, 0)

    private fun incrementLessonsCompleted(context: Context) {
        val current = getLessonsCompleted(context)
        getProgressPrefs(context).edit().putInt(KEY_LESSONS_COMPLETED, current + 1).apply()
    }

    fun getDailyStreak(context: Context): Int =
        getProgressPrefs(context).getInt(KEY_DAILY_STREAK, 0)

    fun recordDailyActivity(context: Context) {
        val prefs = getProgressPrefs(context)
        val today = getTodayDateString()
        val lastDate = prefs.getString(KEY_LAST_ACTIVITY_DATE, "") ?: ""

        if (lastDate == today) return // امروز قبلاً ثبت شده

        val yesterday = getYesterdayDateString()
        val currentStreak = getDailyStreak(context)

        val newStreak = if (lastDate == yesterday) currentStreak + 1 else 1

        prefs.edit()
            .putString(KEY_LAST_ACTIVITY_DATE, today)
            .putInt(KEY_DAILY_STREAK, newStreak)
            .apply()
    }

    fun getTotalQuizzesPassed(context: Context): Int {
        var total = 0
        for (book in BookRepository.getAllBooks()) {
            val totalGroups = (book.totalChapters + CHAPTERS_PER_GROUP - 1) / CHAPTERS_PER_GROUP
            for (i in 0 until maxOf(0, totalGroups - 1)) {
                if (isQuizPassed(context, book.id, i)) total++
            }
        }
        return total
    }

    fun getTotalQuizAttempts(context: Context): Int {
        var total = 0
        for (book in BookRepository.getAllBooks()) {
            val totalGroups = (book.totalChapters + CHAPTERS_PER_GROUP - 1) / CHAPTERS_PER_GROUP
            for (i in 0 until maxOf(0, totalGroups - 1)) {
                total += getQuizAttempts(context, book.id, i)
            }
        }
        return total
    }


    // ============================================================
    // ⚙️ بخش ۴: تنظیمات کاربر
    // ============================================================

    fun setShowTranslation(context: Context, show: Boolean) {
        getSettingsPrefs(context).edit().putBoolean(KEY_SHOW_TRANSLATION, show).apply()
    }
    fun isShowTranslation(context: Context): Boolean =
        getSettingsPrefs(context).getBoolean(KEY_SHOW_TRANSLATION, true)

    fun setDarkMode(context: Context, enabled: Boolean) {
        getSettingsPrefs(context).edit().putBoolean(KEY_DARK_MODE, enabled).apply()
    }
    fun isDarkMode(context: Context): Boolean =
        getSettingsPrefs(context).getBoolean(KEY_DARK_MODE, false)

    fun setSoundEnabled(context: Context, enabled: Boolean) {
        getSettingsPrefs(context).edit().putBoolean(KEY_SOUND_ENABLED, enabled).apply()
    }
    fun isSoundEnabled(context: Context): Boolean =
        getSettingsPrefs(context).getBoolean(KEY_SOUND_ENABLED, true)

    fun setAutoPlay(context: Context, enabled: Boolean) {
        getSettingsPrefs(context).edit().putBoolean(KEY_AUTO_PLAY, enabled).apply()
    }
    fun isAutoPlay(context: Context): Boolean =
        getSettingsPrefs(context).getBoolean(KEY_AUTO_PLAY, true)


    // ============================================================
    // 🔧 توابع کمکی داخلی
    // ============================================================

    private fun getTodayDateString(): String {
        val cal = Calendar.getInstance()
        return "${cal.get(Calendar.YEAR)}-${cal.get(Calendar.MONTH)}-${cal.get(Calendar.DAY_OF_MONTH)}"
    }

    private fun getYesterdayDateString(): String {
        val cal = Calendar.getInstance()
        cal.add(Calendar.DAY_OF_YEAR, -1)
        return "${cal.get(Calendar.YEAR)}-${cal.get(Calendar.MONTH)}-${cal.get(Calendar.DAY_OF_MONTH)}"
    }
}