package com.zabanyar.ai.data.books.story

/**
 * 📖 مدل‌های محتوای داستان (دوزبانه)
 */

data class StoryParagraph(
    val english: String,
    val persian: String
)

data class StoryChapter(
    val number: Int,
    val title: String,
    val titlePersian: String,
    val paragraphs: List<StoryParagraph>
)

data class StoryContent(
    val storyId: String,
    val chapters: List<StoryChapter>
)