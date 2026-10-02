package com.zabanyar.ai.data

import com.zabanyar.ai.data.books.conversation.TopNotch1
import com.zabanyar.ai.data.books.conversation.TopNotch2
import com.zabanyar.ai.data.books.conversation.TopNotch3

object TopNotchRepository {

    fun getContent(bookId: String, chapter: Int): LessonContent {
        return when (bookId) {
            "top_notch_1" -> TopNotch1.getContent(chapter)
            "top_notch_2" -> TopNotch2.getContent(chapter)
            "top_notch_3" -> TopNotch3.getContent(chapter)
            else -> getDefaultContent(bookId, chapter)
        }
    }

    private fun getDefaultContent(bookId: String, chapter: Int): LessonContent {
        return LessonContent(
            bookId = bookId,
            chapterNumber = chapter,
            title = "درس $chapter",
            titlePersian = "درس $chapter",
            objectives = emptyList(),
            vocabulary = emptyList(),
            idioms = emptyList(),
            phrasalVerbs = emptyList(),
            pronunciationTips = emptyList(),
            culturalNotes = emptyList(),
            grammar = emptyList(),
            commonMistakes = emptyList(),
            conversation = emptyList(),
            comprehensionQuestions = emptyList(),
            speakingTasks = emptyList(),
            writingTasks = emptyList(),
            quiz = emptyList()
        )
    }
}