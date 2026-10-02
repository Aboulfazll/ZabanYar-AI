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
import com.zabanyar.ai.data.books.story.content.intermediate.Group11
import com.zabanyar.ai.data.books.story.content.intermediate.Group12
import com.zabanyar.ai.data.books.story.content.intermediate.Group13
import com.zabanyar.ai.data.books.story.content.intermediate.Group14
import com.zabanyar.ai.data.books.story.content.intermediate.Group15

object IntermediateStoryContent {

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
        Group11.getAll(),   // ← جدید (جنگ و صلح، جنایت و مکافات، آنا کارنینا)
        Group12.getAll(),   // ← جدید (موبی دیک، تام سایر، پیرمرد و دریا)
        Group13.getAll(),   // ← جدید (مادام بواری، بینوایان، سه تفنگدار)
        Group14.getAll(),   // ← جدید (ماشین زمان، جنگ دنیاها، ۱۹۸۴)
        Group15.getAll(),   // ← جدید (گتسبی بزرگ، خوشه‌های خشم، بلندی‌های بادگیر)
    )

    fun getAll(): List<StoryContent> = groups.flatten()

    fun getStory(storyId: String): StoryContent? =
        getAll().firstOrNull { it.storyId == storyId }

    fun hasContent(storyId: String): Boolean =
        getStory(storyId) != null
}