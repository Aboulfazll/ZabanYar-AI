package com.zabanyar.ai.data

import com.zabanyar.ai.data.books.conversation.*
import com.zabanyar.ai.data.books.grammar.*

object LessonContentRepository {

    /**
     * بررسی می‌کنه که آیا این کتاب محتوای واقعی داره یا نه
     */
    fun hasContent(bookId: String): Boolean {
        return when (bookId) {
            // 💬 مکالمه
            "top_notch_1", "top_notch_2", "top_notch_3",
            "evolve_1", "evolve_2", "evolve_3", "evolve_4", "evolve_5",
            "english_file_1", "english_file_2", "english_file_3", "english_file_4", "english_file_5",
            "four_corners_intro", "four_corners_1", "four_corners_2", "four_corners_3", "four_corners_4",
            // 📝 گرامر
            "basic_grammar", "understanding_grammar", "advanced_grammar"
            -> true
            else -> false
        }
    }

    fun getLessonContent(bookId: String, chapterNumber: Int): LessonContent {
        return when (bookId) {
            // ==================== 💬 مکالمه ====================
            "top_notch_1", "top_notch_2", "top_notch_3" ->
                TopNotchRepository.getContent(bookId, chapterNumber)

            "evolve_1" -> Evolve1.getContent(chapterNumber)
            "evolve_2" -> Evolve2.getContent(chapterNumber)
            "evolve_3" -> Evolve3.getContent(chapterNumber)
            "evolve_4" -> Evolve4.getContent(chapterNumber)
            "evolve_5" -> Evolve5.getContent(chapterNumber)

            "english_file_1" -> AmericanEnglishFile1.getContent(chapterNumber)
            "english_file_2" -> AmericanEnglishFile2.getContent(chapterNumber)
            "english_file_3" -> AmericanEnglishFile3.getContent(chapterNumber)
            "english_file_4" -> AmericanEnglishFile4.getContent(chapterNumber)
            "english_file_5" -> AmericanEnglishFile5.getContent(chapterNumber)

            "four_corners_intro" -> FourCornersIntro.getContent(chapterNumber)
            "four_corners_1" -> FourCorners1.getContent(chapterNumber)
            "four_corners_2" -> FourCorners2.getContent(chapterNumber)
            "four_corners_3" -> FourCorners3.getContent(chapterNumber)
            "four_corners_4" -> FourCorners4.getContent(chapterNumber)

            // ==================== 📝 گرامر ====================
            "basic_grammar" -> BasicGrammar.getContent(chapterNumber)
            "understanding_grammar" -> UnderstandingGrammar.getContent(chapterNumber)
            "advanced_grammar" -> AdvancedGrammar.getContent(chapterNumber)

            // ==================== پیش‌فرض ====================
            else -> getDefaultContent(bookId, chapterNumber)
        }
    }

    private fun getDefaultContent(bookId: String, chapterNumber: Int): LessonContent {
        return LessonContent(
            bookId = bookId,
            chapterNumber = chapterNumber,
            title = "درس $chapterNumber",
            titlePersian = "درس $chapterNumber",
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