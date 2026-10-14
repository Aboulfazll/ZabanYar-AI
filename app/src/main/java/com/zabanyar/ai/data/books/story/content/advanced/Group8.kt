package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۸ پیشرفته — ادبیات اروپایی و آفریقایی
 *  ۲۲. طبل حلبی — گونتر گراس (۶ فصل)
 *  ۲۳. مرگ در ونیز — توماس مان (۷ فصل)
 *  ۲۴. آدم‌های ناچیز — چینوا آچه‌به (۵ فصل)
 */
object Group8 {

    fun getAll(): List<StoryContent> = listOf(
        Story22.get(),
        Story23.get(),
        Story24.get(),
    )

    fun getById(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }
}