package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۷ پیشرفته — مدرنیسم قرن بیستم
 *
 *  ۱۹. کوه جادو — توماس مان (۶ فصل)
 *  ۲۰. لولیتا — ولادیمیر ناباکوف (۶ فصل)
 *  ۲۱. استاد و مارگاریتا — میخائیل بولگاکف (۷ فصل)
 */
object Group7 {

    fun getAll(): List<StoryContent> = listOf(
        Story19.get(),
        Story20.get(),
        Story21.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}