package com.zabanyar.ai.data

import java.net.URLEncoder

/**
 * 🖼️ تولید URL جلد کتاب
 * ۱. اگه coverUrl دستی تنظیم شده باشه، از اون استفاده می‌کنه
 * ۲. اگه نه، برای داستان‌ها از Open Library بر اساس عنوان استفاده می‌کنه
 */
fun Book.getCoverUrl(): String {
    // ۱. اگه URL دستی داریم، همون رو برگردون
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