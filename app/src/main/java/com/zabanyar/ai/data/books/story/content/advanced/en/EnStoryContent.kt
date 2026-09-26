package com.zabanyar.ai.data.books.story.content.advanced.en

object EnStoryContent {

    private val groups: List<List<EnStory>> = listOf(
        EnGroup1.getAll(),
        EnGroup2.getAll(),
        EnGroup3.getAll(),
        EnGroup4.getAll(),
        EnGroup5.getAll(),
        EnGroup6.getAll(),
        EnGroup7.getAll(),
        EnGroup8.getAll(),
        EnGroup9.getAll(),
        Group10.getAll() // این یکی چون توی عکس Group10 بود، بدون En هست
    )

    fun getAll(): List<EnStory> = groups.flatten()

    fun getStory(storyId: String): EnStory? =
        getAll().firstOrNull { it.storyId == storyId }

    fun getChapter(storyId: String, chapterNumber: Int): EnChapter? =
        getStory(storyId)?.chapters?.firstOrNull { it.number == chapterNumber }

    fun hasContent(storyId: String): Boolean =
        getStory(storyId) != null

    fun getCount(): Int = getAll().size
}