package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۱ پیشرفته — ادبیات روسی و آلمانی
 *  ۱. نفوس مرده — نیکلای گوگول (۶ فصل)
 *  ۲. یادداشت‌های زیرزمینی — فیودور داستایفسکی (۶ فصل)
 *  ۳. مسخ — فرانتس کافکا (۵ فصل)
 */
object Group1 {

    fun getAll(): List<StoryContent> = listOf(
        Story1.get(),
        Story2.get(),
        Story3.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}