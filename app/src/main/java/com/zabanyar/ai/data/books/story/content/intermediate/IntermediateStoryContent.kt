package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 جمع‌کننده همه گروه‌های داستان متوسط
 *
 * هر گروه = ۳ داستان
 * برای اضافه کردن گروه جدید، فقط یک خط به لیست اضافه کن
 */
object IntermediateStoryContent {

    fun getAll(): List<StoryContent> = listOf(
        // Group1: ۱، ۲، ۳ — شرلوک هلمز
        // Group2: ۴، ۵، ۶
        // Group3: ۷، ۸، ۹
        // ...
        // Group10: ۲۸، ۲۹، ۳۰
    ).flatMap { it }
        .let { emptyList() }  // موقتاً خالی

    // ⚠️ وقتی گروه ۱ رو ساختی، این خطوط رو باز کن:
    // private val groups = listOf(
    //     Group1.getAll(),
    //     // Group2.getAll(),
    //     // Group3.getAll(),
    // )
    // fun getAll(): List<StoryContent> = groups.flatten()
}