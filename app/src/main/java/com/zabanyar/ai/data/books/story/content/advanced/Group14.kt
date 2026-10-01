package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۱۴ — پیشرفته — ادبیات قرن بیستم
 *  ۴۰. همراه باد (مارگارت میچل)
 *  ۴۱. بیلی باد (هرمان ملویل)
 *  ۴۲. آمریکایی آرام (گراهام گرین)
 *
 *  ساختار: هر داستان ۶ فصل | هر فصل ۴۰ پاراگراف طولانی
 */
object Group14 {

    fun getAll(): List<StoryContent> = listOf(
        Story40.get(),
        Story41.get(),
        Story42.get(),
    )
}