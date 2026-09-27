package com.zabanyar.ai.data

import java.net.URLEncoder

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