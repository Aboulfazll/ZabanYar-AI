package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۹ پیشرفته — ادبیات پست‌مدرن
 *
 *  ۲۵. پرواز بر فراز آشیانه فاخته — کِن کِیزی
 *  ۲۶. کشتارگاه پنج — کورت ونه‌گات
 *  ۲۷. تحمل‌ناپذیری هستی — میلان کوندرا
 */
object Group9 {

    fun getAll(): List<StoryContent> = listOf(
        Story25.get(),
        Story26.get(),
        Story27.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}