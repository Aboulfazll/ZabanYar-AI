package com.zabanyar.ai.data.books.story.content.advanced.en

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryParagraph

fun EnChapter.toStoryChapter(): StoryChapter = StoryChapter(
    number = this.number,
    title = this.title,
    titlePersian = this.title,
    paragraphs = this.lines.map { line ->
        StoryParagraph(english = line, persian = "")
    }
)

fun EnStory.toStoryChapters(): List<StoryChapter> =
    this.chapters.map { it.toStoryChapter() }