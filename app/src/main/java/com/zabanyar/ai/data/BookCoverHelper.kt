package com.zabanyar.ai.data

import java.net.URLEncoder

/**
 * 🖼️ تولید URL خودکار جلد کتاب از سرویس Open Library
 * بر اساس عنوان کتاب، عکس جلد رو از اینترنت پیدا می‌کنه.
 */
fun Book.getCoverUrl(): String {
    val cleanTitle = title
        .replace(":", "")
        .replace("&", "and")
        .replace("The ", "")
        .trim()

    val encodedTitle = URLEncoder.encode(cleanTitle, "UTF-8")
        .replace("+", "%20")

    return "https://covers.openlibrary.org/b/title/$encodedTitle-L.jpg"
}