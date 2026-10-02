package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.content.advanced.Group1
import com.zabanyar.ai.data.books.story.content.advanced.Group2
import com.zabanyar.ai.data.books.story.content.advanced.Group3
import com.zabanyar.ai.data.books.story.content.advanced.Group4
import com.zabanyar.ai.data.books.story.content.advanced.Group5
import com.zabanyar.ai.data.books.story.content.advanced.Group6
import com.zabanyar.ai.data.books.story.content.advanced.Group7
import com.zabanyar.ai.data.books.story.content.advanced.Group8
import com.zabanyar.ai.data.books.story.content.advanced.Group9
import com.zabanyar.ai.data.books.story.content.advanced.Group10
import com.zabanyar.ai.data.books.story.content.advanced.Group11
import com.zabanyar.ai.data.books.story.content.advanced.Group12
import com.zabanyar.ai.data.books.story.content.advanced.Group13
import com.zabanyar.ai.data.books.story.content.advanced.Group14
import com.zabanyar.ai.data.books.story.content.advanced.Group15

object AdvancedStoryContent {

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
        Group10.getAll(),
        Group11.getAll(),
        Group12.getAll(),
        Group13.getAll(),
        Group14.getAll(),
        Group15.getAll(),
    )

    fun getAll(): List<StoryContent> = groups.flatten()

    fun getStory(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }

    fun hasContent(storyId: String): Boolean =
        getStory(storyId) != null
}