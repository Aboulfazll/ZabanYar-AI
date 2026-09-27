package com.zabanyar.ai.data

import java.net.URLEncoder

/**
 * 🖼️ تولید URL جلد کتاب
 * ۱. اگه coverUrl دستی تنظیم شده باشه، از همان استفاده می‌کند
 * ۲. اگه نه، از Open Library بر اساس عنوان استفاده می‌کند
 */
fun Book.getCoverUrl(): String {
    if (coverUrl.isNotBlank()) {
        return coverUrl
    }

    val cleanTitle = title
        .replace(":", "")
        .replace("&", "and")
        .trim()

    val encodedTitle = URLEncoder.encode(cleanTitle, "UTF-8").replace("+", "%20")
    return "https://covers.openlibrary.org/b/title/$encodedTitle-L.jpg"
}