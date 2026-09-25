package com.zabanyar.ai.data.books.story.content.advanced.en

object EnStoryContent {

    private val groups: List<List<EnStory>> = listOf(
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
    )

    fun getAll(): List<EnStory> = groups.flatten()

    fun getStory(storyId: String): EnStory? =
        getAll().firstOrNull { it.storyId == storyId }

    fun getChapter(storyId: String, chapterNumber: Int): EnChapter? =
        getStory(storyId)?.chapters?.firstOrNull { it.number == chapterNumber }

    fun hasContent(storyId: String): Boolean =
        getStory(storyId) != null
}