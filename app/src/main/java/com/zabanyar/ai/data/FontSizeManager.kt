package com.zabanyar.ai.data

import android.content.Context

/**
 * 🅰️ مدیریت اندازه فونت در کل اپ
 * مقدار پیش‌فرض 1.0 = اندازه معمولی
 * بازه: 0.8 (کوچک‌تر) تا 1.6 (بزرگ‌تر)
 */
object FontSizeManager {
    private const val PREFS = "zabanyar_settings"
    private const val KEY_FONT_SCALE = "font_scale"

    const val MIN_SCALE = 0.8f
    const val MAX_SCALE = 1.6f
    const val DEFAULT_SCALE = 1.0f

    fun getFontScale(context: Context): Float =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getFloat(KEY_FONT_SCALE, DEFAULT_SCALE)
            .coerceIn(MIN_SCALE, MAX_SCALE)

    fun setFontScale(context: Context, scale: Float) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putFloat(KEY_FONT_SCALE, scale.coerceIn(MIN_SCALE, MAX_SCALE))
            .apply()
    }
}