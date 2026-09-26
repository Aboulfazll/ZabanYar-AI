package com.zabanyar.ai.data.books.story.content

import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.content.intermediate.Group1
import com.zabanyar.ai.data.books.story.content.intermediate.Group2
import com.zabanyar.ai.data.books.story.content.intermediate.Group3
import com.zabanyar.ai.data.books.story.content.intermediate.Group4
import com.zabanyar.ai.data.books.story.content.intermediate.Group5
import com.zabanyar.ai.data.books.story.content.intermediate.Group6
import com.zabanyar.ai.data.books.story.content.intermediate.Group7
import com.zabanyar.ai.data.books.story.content.intermediate.Group8
import com.zabanyar.ai.data.books.story.content.intermediate.Group9
import com.zabanyar.ai.data.books.story.content.intermediate.Group10

object IntermediateStoryContent {   // ← این خط مهمه (نه IntermediateStories)

    private val groups: List<List<StoryContent>> = listOf(
        Group1.getAll(),
        Group2.getAll(),
        Group3.getAll(),
        Group4.getAll(),
        Group5.getAll(),
        Group6.getAll(),
        Group7.getAll(),
        Group8.getAll(),
        Group9.getAll(),
        Group10.getAll()
    )

    fun getAll(): List<StoryContent> = groups.flatten()

    fun getStory(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }

    fun hasContent(storyId: String): Boolean =
        getStory(storyId) != null
}