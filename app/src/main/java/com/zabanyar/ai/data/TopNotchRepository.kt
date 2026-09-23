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
}