package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۱۱ — پیشرفته — ادبیات روسی
 *
 *  ۳۱. قهرمان زمان ما — میخائیل لرمانتوف
 *  ۳۲. جنایات و مکافات — فیودور داستایفسکی
 *  ۳۳. آنا کارنینا — لئو تولستوی
 */
object Group11 {

    fun getAll(): List<StoryContent> = listOf(
        Story31.get(),
        Story32.get(),
        Story33.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}