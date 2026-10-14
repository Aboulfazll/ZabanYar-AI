package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۳ پیشرفته — ادبیات وجودی و مدرن
 *  ۷. محاکمه — فرانتس کافکا
 *  ۸. بیگانه — آلبر کامو
 *  ۹. باقی‌مانده روز — کازوئو ایشی‌گورو
 */
object Group3 {

    fun getAll(): List<StoryContent> = listOf(
        Story7.get(),
        Story8.get(),
        Story9.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}