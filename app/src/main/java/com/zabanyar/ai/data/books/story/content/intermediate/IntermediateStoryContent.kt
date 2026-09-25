package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 جمع‌کننده گروه‌های داستان متوسط
 * هر گروه = ۳ داستان
 */
object IntermediateStoryContent {

    private val groups: List<List<StoryContent>> = listOf(
        Group1.getAll(),
        Group2.getAll(),
        // Group3.getAll(),
        // Group4.getAll(),
        // Group5.getAll(),
        // Group6.getAll(),
        // Group7.getAll(),
        // Group8.getAll(),
        // Group9.getAll(),
        // Group10.getAll(),
    )

    fun getAll(): List<StoryContent> = groups.flatten()
}