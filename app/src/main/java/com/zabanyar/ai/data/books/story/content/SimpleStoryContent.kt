package com.zabanyar.ai.data.books.story.content

import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.content.simple.Group1
import com.zabanyar.ai.data.books.story.content.simple.Group2
import com.zabanyar.ai.data.books.story.content.simple.Group3
import com.zabanyar.ai.data.books.story.content.simple.Group4
import com.zabanyar.ai.data.books.story.content.simple.Group5
import com.zabanyar.ai.data.books.story.content.simple.Group6
import com.zabanyar.ai.data.books.story.content.simple.Group7
import com.zabanyar.ai.data.books.story.content.simple.Group8
import com.zabanyar.ai.data.books.story.content.simple.Group9
import com.zabanyar.ai.data.books.story.content.simple.Group10
import com.zabanyar.ai.data.books.story.content.simple.Group11
import com.zabanyar.ai.data.books.story.content.simple.Group12
import com.zabanyar.ai.data.books.story.content.simple.Group13
import com.zabanyar.ai.data.books.story.content.simple.Group14
import com.zabanyar.ai.data.books.story.content.simple.Group15

object SimpleStoryContent {

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

    fun getCount(): Int = getAll().size
}