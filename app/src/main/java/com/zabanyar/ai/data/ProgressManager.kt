package com.zabanyar.ai.data

import android.content.Context
import android.content.SharedPreferences
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

// ============================================================
// ProgressManager - Advanced Learning System
// ============================================================
object ProgressManager {

    private const val PREFS_NAME = "zabanyar_progress"

    // ============ ثابت‌های سیستم ============
    const val CHAPTERS_PER_GROUP = 3
    const val QUESTIONS_PER_QUIZ = 20
    const val PASS_THRESHOLD_PERCENT = 90

    // ============ کلیدهای ذخیره‌سازی ============
    private const val KEY_STARS = "total_stars"
    private const val KEY_LESSONS = "lessons_completed"
    private const val KEY_STREAK = "daily_streak"
    private const val KEY_LAST_DATE = "last_activity_date"
    private const val KEY_TOTAL_QUIZZES_PASSED = "total_quizzes_passed"
    private const val KEY_TOTAL_QUIZ_ATTEMPTS = "total_quiz_attempts"

    // Book-specific keys
    private fun keyChapterRead(bookId: String, ch: Int) = "ch_read_${bookId}_$ch"
    private fun keyChapterUnlocked(bookId: String, ch: Int) = "ch_unlocked_${bookId}_$ch"
    private fun keyQuizPassed(bookId: String, qIdx: Int) = "quiz_passed_${bookId}_$qIdx"
    private fun keyQuizBest(bookId: String, qIdx: Int) = "quiz_best_${bookId}_$qIdx"
    private fun keyQuizAttempts(bookId: String, qIdx: Int) = "quiz_attempts_${bookId}_$qIdx"
    private fun keyQuizLastScore(bookId: String, qIdx: Int) = "quiz_last_${bookId}_$qIdx"
    private fun keyUnlockedGroups(bookId: String) = "unlocked_groups_$bookId"
    private fun keyBookStarted(bookId: String) = "book_started_$bookId"

    // ============ Data Classes ============
    data class ChapterState(
        val chapterNumber: Int,
        val isRead: Boolean,
        val isUnlocked: Boolean,
        val groupIndex: Int,
        val isLastInGroup: Boolean
    )

    data class QuizState(
        val quizIndex: Int,
        val groupIndex: Int,
        val firstChapter: Int,
        val lastChapter: Int,
        val isUnlocked: Boolean,
        val isPassed: Boolean,
        val bestScore: Int,
        val attempts: Int,
        val lastScore: Int,
        val totalQuestions: Int
    )

    data class BookProgressSummary(
        val totalChapters: Int,
        val readChapters: Int,
        val unlockedGroups: Int,
        val totalGroups: Int,
        val quizzesPassed: Int,
        val totalQuizzes: Int,
        val overallProgressPercent: Int
    )

    data class QuizResult(
        val score: Int,
        val total: Int,
        val percent: Int,
        val passed: Boolean,
        val attempts: Int,
        val bestScore: Int,
        val timestamp: Long
    )

    // ============ Preferences ============
    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    // ============================================================
    // ⭐ امتیاز و درس‌های تکمیل‌شده
    // ============================================================
    fun getTotalStars(context: Context): Int =
        getPrefs(context).getInt(KEY_STARS, 0)

    fun addStars(context: Context, amount: Int) {
        val current = getTotalStars(context)
        getPrefs(context).edit().putInt(KEY_STARS, current + amount).apply()
    }

    fun removeStars(context: Context, amount: Int) {
        val current = getTotalStars(context)
        getPrefs(context).edit().putInt(KEY_STARS, maxOf(0, current - amount)).apply()
    }

    fun getLessonsCompleted(context: Context): Int =
        getPrefs(context).getInt(KEY_LESSONS, 0)

    // ============================================================
    // 📖 مدیریت درس‌ها (خوانده‌شده / قفل)
    // ============================================================

    fun markChapterAsRead(context: Context, bookId: String, chapterNumber: Int) {
        val prefs = getPrefs(context)
        val key = keyChapterRead(bookId, chapterNumber)
        if (!prefs.getBoolean(key, false)) {
            prefs.edit()
                .putBoolean(key, true)
                .putInt(KEY_LESSONS, getLessonsCompleted(context) + 1)
                .apply()
            updateStreak(context)
            markBookStarted(context, bookId)
        }
    }

    fun isChapterRead(context: Context, bookId: String, chapterNumber: Int): Boolean =
        getPrefs(context).getBoolean(keyChapterRead(bookId, chapterNumber), false)

    fun isChapterUnlocked(context: Context, bookId: String, chapterNumber: Int): Boolean {
        // درس 1 همیشه باز است
        if (chapterNumber == 1) return true

        // چک قفل صریح
        val explicitUnlock = getPrefs(context).getBoolean(
            keyChapterUnlocked(bookId, chapterNumber), false
        )
        if (explicitUnlock) return true

        // محاسبه‌ای: آیا گروه این درس باز است؟
        val groupIndex = (chapterNumber - 1) / CHAPTERS_PER_GROUP
        return getUnlockedGroupsCount(context, bookId) > groupIndex
    }

    // سازگاری با کد قبلی
    fun markLessonCompleted(context: Context, lessonId: String) {
        val key = "completed_$lessonId"
        val prefs = getPrefs(context)
        if (!prefs.getBoolean(key, false)) {
            prefs.edit()
                .putBoolean(key, true)
                .putInt(KEY_LESSONS, getLessonsCompleted(context) + 1)
                .apply()
            updateStreak(context)
        }
    }

    fun isLessonCompleted(context: Context, lessonId: String): Boolean =
        getPrefs(context).getBoolean("completed_$lessonId", false)

    // ============================================================
    // 🔓 مدیریت گروه‌ها (Unlocked Groups)
    // ============================================================

    fun getUnlockedGroupsCount(context: Context, bookId: String): Int {
        return getPrefs(context).getInt(keyUnlockedGroups(bookId), 1)
    }

    fun unlockNextGroup(context: Context, bookId: String) {
        val current = getUnlockedGroupsCount(context, bookId)
        getPrefs(context).edit().putInt(keyUnlockedGroups(bookId), current + 1).apply()
    }

    fun isBookStarted(context: Context, bookId: String): Boolean =
        getPrefs(context).getBoolean(keyBookStarted(bookId), false)

    fun markBookStarted(context: Context, bookId: String) {
        if (!isBookStarted(context, bookId)) {
            getPrefs(context).edit().putBoolean(keyBookStarted(bookId), true).apply()
        }
    }

    // ============================================================
    // 📝 سیستم آزمون
    // ============================================================

    fun isQuizUnlocked(
        context: Context,
        bookId: String,
        quizIndex: Int,
        totalChapters: Int
    ): Boolean {
        val groupIndex = quizIndex
        val firstCh = groupIndex * CHAPTERS_PER_GROUP + 1
        val lastCh = minOf(firstCh + CHAPTERS_PER_GROUP - 1, totalChapters)

        if (getUnlockedGroupsCount(context, bookId) <= groupIndex) return false

        for (ch in firstCh..lastCh) {
            if (!isChapterRead(context, bookId, ch)) return false
        }
        return true
    }

    fun isQuizPassed(context: Context, bookId: String, quizIndex: Int): Boolean =
        getPrefs(context).getBoolean(keyQuizPassed(bookId, quizIndex), false)

    fun saveQuizResult(
        context: Context,
        bookId: String,
        quizIndex: Int,
        score: Int,
        total: Int
    ): QuizResult {
        val percent = (score * 100) / total
        val passed = percent >= PASS_THRESHOLD_PERCENT

        val prefs = getPrefs(context)
        val currentAttempts = prefs.getInt(keyQuizAttempts(bookId, quizIndex), 0)
        val currentBest = prefs.getInt(keyQuizBest(bookId, quizIndex), 0)
        val newBest = maxOf(currentBest, percent)
        val newAttempts = currentAttempts + 1

        val editor = prefs.edit()
        editor.putInt(keyQuizAttempts(bookId, quizIndex), newAttempts)
        editor.putInt(keyQuizLastScore(bookId, quizIndex), percent)
        if (newBest > currentBest) {
            editor.putInt(keyQuizBest(bookId, quizIndex), newBest)
        }
        if (passed) {
            editor.putBoolean(keyQuizPassed(bookId, quizIndex), true)
            editor.putInt(
                KEY_TOTAL_QUIZZES_PASSED,
                prefs.getInt(KEY_TOTAL_QUIZZES_PASSED, 0) + 1
            )
        }
        editor.putInt(
            KEY_TOTAL_QUIZ_ATTEMPTS,
            prefs.getInt(KEY_TOTAL_QUIZ_ATTEMPTS, 0) + 1
        )
        editor.apply()

        if (passed) {
            unlockNextGroup(context, bookId)
            addStars(context, 20)
            updateStreak(context)
        } else {
            addStars(context, 2)
        }

        return QuizResult(
            score = score,
            total = total,
            percent = percent,
            passed = passed,
            attempts = newAttempts,
            bestScore = newBest,
            timestamp = System.currentTimeMillis()
        )
    }

    fun getQuizBestScore(context: Context, bookId: String, quizIndex: Int): Int =
        getPrefs(context).getInt(keyQuizBest(bookId, quizIndex), 0)

    fun getQuizAttempts(context: Context, bookId: String, quizIndex: Int): Int =
        getPrefs(context).getInt(keyQuizAttempts(bookId, quizIndex), 0)

    fun getQuizLastScore(context: Context, bookId: String, quizIndex: Int): Int =
        getPrefs(context).getInt(keyQuizLastScore(bookId, quizIndex), 0)

    fun resetQuizProgress(context: Context, bookId: String, quizIndex: Int) {
        getPrefs(context).edit()
            .remove(keyQuizPassed(bookId, quizIndex))
            .remove(keyQuizBest(bookId, quizIndex))
            .remove(keyQuizAttempts(bookId, quizIndex))
            .remove(keyQuizLastScore(bookId, quizIndex))
            .apply()
    }

    fun getTotalQuizzesPassed(context: Context): Int =
        getPrefs(context).getInt(KEY_TOTAL_QUIZZES_PASSED, 0)

    fun getTotalQuizAttempts(context: Context): Int =
        getPrefs(context).getInt(KEY_TOTAL_QUIZ_ATTEMPTS, 0)

    // ============================================================
    // 🔍 دریافت وضعیت کامل کتاب
    // ============================================================

    fun getChapterStates(
        context: Context,
        bookId: String,
        totalChapters: Int
    ): List<ChapterState> {
        val unlockedGroups = getUnlockedGroupsCount(context, bookId)
        return (1..totalChapters).map { ch ->
            val groupIdx = (ch - 1) / CHAPTERS_PER_GROUP
            val positionInGroup = (ch - 1) % CHAPTERS_PER_GROUP
            ChapterState(
                chapterNumber = ch,
                isRead = isChapterRead(context, bookId, ch),
                isUnlocked = groupIdx < unlockedGroups,
                groupIndex = groupIdx,
                isLastInGroup = positionInGroup == CHAPTERS_PER_GROUP - 1 ||
                        ch == totalChapters
            )
        }
    }

    fun getQuizStates(
        context: Context,
        bookId: String,
        totalChapters: Int
    ): List<QuizState> {
        val totalGroups = (totalChapters + CHAPTERS_PER_GROUP - 1) / CHAPTERS_PER_GROUP
        val totalQuizzes = maxOf(0, totalGroups - 1)
        return (0 until totalQuizzes).map { qIdx ->
            val firstCh = qIdx * CHAPTERS_PER_GROUP + 1
            val lastCh = minOf(firstCh + CHAPTERS_PER_GROUP - 1, totalChapters)
            QuizState(
                quizIndex = qIdx,
                groupIndex = qIdx,
                firstChapter = firstCh,
                lastChapter = lastCh,
                isUnlocked = isQuizUnlocked(context, bookId, qIdx, totalChapters),
                isPassed = isQuizPassed(context, bookId, qIdx),
                bestScore = getQuizBestScore(context, bookId, qIdx),
                attempts = getQuizAttempts(context, bookId, qIdx),
                lastScore = getQuizLastScore(context, bookId, qIdx),
                totalQuestions = QUESTIONS_PER_QUIZ
            )
        }
    }

    fun getBookProgress(
        context: Context,
        bookId: String,
        totalChapters: Int
    ): BookProgressSummary {
        val chapters = getChapterStates(context, bookId, totalChapters)
        val quizzes = getQuizStates(context, bookId, totalChapters)
        val totalGroups = (totalChapters + CHAPTERS_PER_GROUP - 1) / CHAPTERS_PER_GROUP
        val unlockedGroups = getUnlockedGroupsCount(context, bookId)
        val readCount = chapters.count { it.isRead }
        val passedQuizzes = quizzes.count { it.isPassed }
        val totalQuizzes = quizzes.size

        val chPercent = if (totalChapters > 0) (readCount * 100) / totalChapters else 0
        val quizPercent = if (totalQuizzes > 0) (passedQuizzes * 100) / totalQuizzes else 0
        val overall = if (totalQuizzes > 0) (chPercent + quizPercent) / 2 else chPercent

        return BookProgressSummary(
            totalChapters = totalChapters,
            readChapters = readCount,
            unlockedGroups = unlockedGroups,
            totalGroups = totalGroups,
            quizzesPassed = passedQuizzes,
            totalQuizzes = totalQuizzes,
            overallProgressPercent = overall
        )
    }

    // ============================================================
    // 🎯 کوییز ساده (سازگاری با کد قدیمی)
    // ============================================================
    fun saveQuizScore(context: Context, lessonId: String, score: Int) {
        getPrefs(context).edit().putInt("quiz_score_$lessonId", score).apply()
    }

    fun getQuizScore(context: Context, lessonId: String): Int =
        getPrefs(context).getInt("quiz_score_$lessonId", 0)

    // ============================================================
    // 🔥 روزهای پیوسته (Streak)
    // ============================================================
    fun getDailyStreak(context: Context): Int =
        getPrefs(context).getInt(KEY_STREAK, 0)

    private fun updateStreak(context: Context) {
        val prefs = getPrefs(context)
        val today = getToday()
        val lastDate = prefs.getString(KEY_LAST_DATE, "") ?: ""

        if (lastDate == today) return

        val yesterday = getYesterday()
        val newStreak = if (lastDate == yesterday) {
            getDailyStreak(context) + 1
        } else {
            1
        }

        prefs.edit()
            .putInt(KEY_STREAK, newStreak)
            .putString(KEY_LAST_DATE, today)
            .apply()
    }

    fun forceUpdateStreak(context: Context) = updateStreak(context)

    // ============================================================
    // 🎙️ تنظیمات صوت
    // ============================================================
    fun getVoiceSpeed(context: Context): Float =
        getPrefs(context).getFloat("voice_speed", 1.0f)

    fun setVoiceSpeed(context: Context, speed: Float) {
        getPrefs(context).edit().putFloat("voice_speed", speed).apply()
    }

    fun getVoicePitch(context: Context): Float =
        getPrefs(context).getFloat("voice_pitch", 1.0f)

    fun setVoicePitch(context: Context, pitch: Float) {
        getPrefs(context).edit().putFloat("voice_pitch", pitch).apply()
    }

    // ============================================================
    // 🔔 اعلان‌ها
    // ============================================================
    fun isNotificationsEnabled(context: Context): Boolean =
        getPrefs(context).getBoolean("notifications", true)

    fun setNotificationsEnabled(context: Context, enabled: Boolean) {
        getPrefs(context).edit().putBoolean("notifications", enabled).apply()
    }

    // ============================================================
    // 🗑️ پاک کردن پیشرفت
    // ============================================================
    fun resetAllProgress(context: Context) {
        getPrefs(context).edit().clear().apply()
    }

    fun resetBookProgress(context: Context, bookId: String) {
        val prefs = getPrefs(context)
        val editor = prefs.edit()
        val all = prefs.all
        for ((key, _) in all) {
            if (key.contains("_${bookId}_") || key.endsWith("_$bookId")) {
                editor.remove(key)
            }
        }
        editor.apply()
    }

    // ============================================================
    // 🧮 توابع کمکی
    // ============================================================
    private fun getToday(): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        return sdf.format(Date())
    }

    private fun getYesterday(): String {
        val cal = Calendar.getInstance()
        cal.add(Calendar.DAY_OF_YEAR, -1)
        val sdf = SimpleDateFormat("yyyy-MM-dd", Locale.US)
        return sdf.format(cal.time)
    }

    // ============================================================
    // 🔧 توابع کمکی برای QuizScreen
    // ============================================================

    fun calculatePassScore(totalQuestions: Int): Int =
        (totalQuestions * PASS_THRESHOLD_PERCENT + 99) / 100

    fun canTakeQuiz(
        context: Context,
        bookId: String,
        quizIndex: Int,
        totalChapters: Int
    ): Boolean {
        return isQuizUnlocked(context, bookId, quizIndex, totalChapters) &&
                !isQuizPassed(context, bookId, quizIndex)
    }
}