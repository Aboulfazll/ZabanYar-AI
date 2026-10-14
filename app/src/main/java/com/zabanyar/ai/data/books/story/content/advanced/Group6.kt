package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۶ پیشرفته — مدرنیسم و ادبیات آمریکایی
 *  ۱۶. صدا و خشم — ویلیام فوکنر
 *  ۱۷. به سوی فانوس دریایی — ویرجینیا وولف
 *  ۱۸. دلبند — تونی موریسون
 */
object Group6 {

    fun getAll(): List<StoryContent> = listOf(
        Story16.get(),
        Story17.get(),
        Story18.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}