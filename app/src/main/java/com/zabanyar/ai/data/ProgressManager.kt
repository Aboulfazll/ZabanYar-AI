package com.zabanyar.ai.data

import android.content.Context
import android.content.SharedPreferences

object ProgressManager {

    // ==================== بخش اول: تنظیمات پیشرفت و قفل ====================
    private const val PROGRESS_PREFS = "zabanyar_progress"
    private const val KEY_CHAPTER_PREFIX = "chapter_"
    private const val KEY_QUIZ_PREFIX = "quiz_"
    private const val KEY_UNLOCKED_GROUPS = "unlocked_groups_"

    const val CHAPTERS_PER_GROUP = 3
    const val QUESTIONS_PER_QUIZ = 20
    const val PASS_THRESHOLD_PERCENT = 90

    private fun getProgressPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PROGRESS_PREFS, Context.MODE_PRIVATE)
    }

    fun markChapterAsRead(context: Context, bookId: String, chapterNumber: Int) {
        getProgressPrefs(context).edit().putBoolean("${KEY_CHAPTER_PREFIX}${bookId}_$chapterNumber", true).apply()
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
        getProgressPrefs(context).edit().apply {
            putBoolean("${KEY_QUIZ_PREFIX}passed_${bookId}_$quizIndex", passed)
            putInt("${KEY_QUIZ_PREFIX}score_${bookId}_$quizIndex", score)
        }.apply()
    }

    fun getUnlockedGroupsCount(context: Context, bookId: String): Int {
        return getProgressPrefs(context).getInt("${KEY_UNLOCKED_GROUPS}$bookId", 1)
    }

    fun unlockNextGroup(context: Context, bookId: String) {
        val current = getUnlockedGroupsCount(context, bookId)
        getProgressPrefs(context).edit().putInt("${KEY_UNLOCKED_GROUPS}$bookId", current + 1).apply()
    }

    fun getBookProgress(context: Context, bookId: String, totalChapters: Int): Float {
        var readCount = 0
        for (i in 1..totalChapters) {
            if (isChapterRead(context, bookId, i)) readCount++
        }
        return if (totalChapters > 0) readCount.toFloat() / totalChapters.toFloat() else 0f
    }

    // ==================== بخش دوم: تنظیمات کاربر (Settings) ====================
    private const val SETTINGS_PREFS = "zabanyar_settings"
    private const val KEY_SHOW_TRANSLATION = "show_translation"
    private const val KEY_DARK_MODE = "dark_mode"
    private const val KEY_SOUND_ENABLED = "sound_enabled"
    private const val KEY_AUTO_PLAY = "auto_play"

    private fun getSettingsPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(SETTINGS_PREFS, Context.MODE_PRIVATE)
    }

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