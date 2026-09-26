package com.zabanyar.ai.data

import android.content.Context

/**
 * 🖼️ نگاشت شناسه کتاب به عکس محلی (drawable)
 *
 * به جای استفاده از R.drawable.xxx (که اگر عکس نباشد خطا می‌دهد)،
 * از getIdentifier() استفاده می‌کنیم که در زمان اجرا بررسی می‌کند
 * عکس با این نام وجود دارد یا نه.
 *
 * ─── نحوه استفاده ───
 * فقط عکس‌ها را با نام id کتاب در res/drawable/ بگذار.
 * مثال: id = "top_notch_1" → فایل: res/drawable/top_notch_1.webp
 *
 * اگر عکس نبود، null برمی‌گرداند و UI از URL استفاده می‌کند.
 */
object BookCoverMapper {

    /**
     * عکس محلی کتاب را برمی‌گرداند یا null اگر وجود نداشت.
     *
     * @param context Context برنامه
     * @param bookId شناسه کتاب (مثلاً "top_notch_1")
     * @return resource ID عکس یا null
     */
    fun getLocalCover(context: Context, bookId: String): Int? {
        val resId = context.resources.getIdentifier(
            bookId,
            "drawable",
            context.packageName
        )
        return if (resId != 0) resId else null
    }

    /**
     * آیا کتاب عکس محلی دارد؟
     */
    fun hasLocalCover(context: Context, bookId: String): Boolean {
        return getLocalCover(context, bookId) != null
    }
}