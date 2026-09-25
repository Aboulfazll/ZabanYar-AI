package com.zabanyar.ai.data.books.story.content.advanced.en

data class EnChapter(
    val number: Int,
    val title: String,
    val lines: List<String>
)

data class EnStory(
    val storyId: String,
    val chapters: List<EnChapter>
)