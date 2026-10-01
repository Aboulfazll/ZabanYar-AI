package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۱۵ — پیشرفته — ادبیات اگزیستانسیالیستی و مدرن
 *  ۴۳. تولد تراژدی (فریدریش نیچه)
 *  ۴۴. انسان در جستجوی معنا (ویکتور فرانکل)
 *  ۴۵. عشق در زمان وبا (گابریل گارسیا مارکز)
 *
 *  ساختار: هر داستان ۶ فصل | هر فصل ۴۰ پاراگراف طولانی
 */
object Group15 {

    fun getAll(): List<StoryContent> = listOf(
        Story43.get(),
        Story44.get(),
        Story45.get(),
    )
}