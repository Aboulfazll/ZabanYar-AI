package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۲ پیشرفته — ادبیات مدرن و فلسفی
 *  ۴. صد سال تنهایی — گابریل گارسیا مارکز
 *  ۵. خانم دالووی — ویرجینیا وولف
 *  ۶. سیدارتا — هرمان هسه
 */
object Group2 {

    fun getAll(): List<StoryContent> = listOf(
        Story4.get(),
        Story5.get(),
        Story6.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}