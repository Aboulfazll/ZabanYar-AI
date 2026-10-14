package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۴ پیشرفته — ادبیات جنگ و وجود
 *  ۱۰. وداع با اسلحه — ارنست همینگوی
 *  ۱۱. طاعون — آلبر کامو
 *  ۱۲. هرگز رهایم مکن — کازوئو ایشی‌گورو
 */
object Group4 {

    fun getAll(): List<StoryContent> = listOf(
        Story10.get(),
        Story11.get(),
        Story12.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}