package com.zabanyar.ai.data

import android.content.Context
import android.content.SharedPreferences

object ProgressManager {

    private const val PREFS_NAME = "zabanyar_progress"
    private const val KEY_STARS = "total_stars"
    private const val KEY_LESSONS = "lessons_completed"
    private const val KEY_STREAK = "daily_streak"
    private const val KEY_LAST_DATE = "last_activity_date"
    private const val KEY_QUIZ_PREFIX = "quiz_score_"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    // ============ امتیاز کل ============
    fun getTotalStars(context: Context): Int {
        return getPrefs(context).getInt(KEY_STARS, 0)
    }

    fun addStars(context: Context, amount: Int) {
        val current = getTotalStars(context)
        getPrefs(context).edit().putInt(KEY_STARS, current + amount).apply()
    }

    // ============ تعداد درس‌های تکمیل‌شده ============
    fun getLessonsCompleted(context: Context): Int {
        return getPrefs(context).getInt(KEY_LESSONS, 0)
    }

    fun markLessonCompleted(context: Context, lessonId: String) {
        val key = "completed_$lessonId"
        val prefs = getPrefs(context)
        if (!prefs.getBoolean(key, false)) {
            prefs.edit()
                .putBoolean(key, true)
                .putInt(KEY_LESSONS, getLessonsCompleted(context) + 1)
                .apply()
        }
        updateStreak(context)
    }

    fun isLessonCompleted(context: Context, lessonId: String): Boolean {
        return getPrefs(context).getBoolean("completed_$lessonId", false)
    }

    // ============ امتیاز کوییز ============
    fun saveQuizScore(context: Context, lessonId: String, score: Int) {
        getPrefs(context).edit().putInt("$KEY_QUIZ_PREFIX$lessonId", score).apply()
    }

    fun getQuizScore(context: Context, lessonId: String): Int {
        return getPrefs(context).getInt("$KEY_QUIZ_PREFIX$lessonId", 0)
    }

    // ============ روزهای پیوسته (Streak) ============
    fun getDailyStreak(context: Context): Int {
        return getPrefs(context).getInt(KEY_STREAK, 0)
    }

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

    // ============ تنظیمات صوت ============
    fun getVoiceSpeed(context: Context): Float {
        return getPrefs(context).getFloat("voice_speed", 1.0f)
    }

    fun setVoiceSpeed(context: Context, speed: Float) {
        getPrefs(context).edit().putFloat("voice_speed", speed).apply()
    }

    // ============ اعلان‌ها ============
    fun isNotificationsEnabled(context: Context): Boolean {
        return getPrefs(context).getBoolean("notifications", true)
    }

    fun setNotificationsEnabled(context: Context, enabled: Boolean) {
        getPrefs(context).edit().putBoolean("notifications", enabled).apply()
    }

    // ============ پاک کردن تمام پیشرفت ============
    fun resetAllProgress(context: Context) {
        getPrefs(context).edit().clear().apply()
    }

    // ============ تاریخ‌ها ============
    private fun getToday(): String {
        val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US)
        return sdf.format(java.util.Date())
    }

    private fun getYesterday(): String {
        val cal = java.util.Calendar.getInstance()
        cal.add(java.util.Calendar.DAY_OF_YEAR, -1)
        val sdf = java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.US)
        return sdf.format(cal.time)
    }
}