package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۵ پیشرفته — رمان‌های کلاسیک روسی و مدرنیسم
 *  ۱۳. جنگ و صلح — لئو تولستوی
 *  ۱۴. برادران کارامازوف — فیودور داستایفسکی
 *  ۱۵. اولیس — جیمز جویس
 */
object Group5 {

    fun getAll(): List<StoryContent> = listOf(
        Story13.get(),
        Story14.get(),
        Story15.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}