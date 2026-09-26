package com.zabanyar.ai.data

import java.net.URLEncoder

/**
 * 🖼️ تولید URL جلد کتاب
 * ۱. اگه coverUrl دستی تنظیم شده باشه (کتاب‌های درسی)، از Google Books استفاده می‌کنه
 * ۲. اگه نه (داستان‌ها)، از Open Library بر اساس عنوان استفاده می‌کنه
 */
fun Book.getCoverUrl(): String {
    // ۱. اگه coverUrl تنظیم شده باشه، همون رو برگردون
    if (coverUrl.isNotBlank()) {
        return coverUrl
    }

    // ۲. برای داستان‌ها: Open Library بر اساس عنوان
    val cleanTitle = title
        .replace(":", "")
        .replace("&", "and")
        .trim()

    val encodedTitle = URLEncoder.encode(cleanTitle, "UTF-8").replace("+", "%20")
    return "https://covers.openlibrary.org/b/title/$encodedTitle-L.jpg"
}