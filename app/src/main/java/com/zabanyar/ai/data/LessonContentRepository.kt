package com.zabanyar.ai.data

import com.zabanyar.ai.data.books.conversation.*
import com.zabanyar.ai.data.books.grammar.*

object LessonContentRepository {
    fun getLessonContent(bookId: String, chapterNumber: Int): LessonContent {
        return when (bookId) {
            // ==================== 💬 مکالمه ====================
            "top_notch_1", "top_notch_2", "top_notch_3" ->
                TopNotchRepository.getContent(bookId, chapterNumber)

            "evolve_1" -> Evolve1.getChapter(chapterNumber)
            "evolve_2" -> Evolve2.getChapter(chapterNumber)
            "evolve_3" -> Evolve3.getChapter(chapterNumber)
            "evolve_4" -> Evolve4.getChapter(chapterNumber)
            "evolve_5" -> Evolve5.getChapter(chapterNumber)

            "english_file_1" -> EnglishFile1.getChapter(chapterNumber)
            "english_file_2" -> EnglishFile2.getChapter(chapterNumber)
            "english_file_3" -> EnglishFile3.getChapter(chapterNumber)
            "english_file_4" -> EnglishFile4.getChapter(chapterNumber)
            "english_file_5" -> EnglishFile5.getChapter(chapterNumber)

            "four_corners_intro" -> FourCornersIntro.getChapter(chapterNumber)
            "four_corners_1" -> FourCorners1.getChapter(chapterNumber)
            "four_corners_2" -> FourCorners2.getChapter(chapterNumber)
            "four_corners_3" -> FourCorners3.getChapter(chapterNumber)
            "four_corners_4" -> FourCorners4.getChapter(chapterNumber)

            // ==================== 📝 گرامر ====================
            "basic_grammar" -> BasicGrammar.getChapter(chapterNumber)
            "understanding_grammar" -> UnderstandingGrammar.getChapter(chapterNumber)
            "advanced_grammar" -> AdvancedGrammar.getChapter(chapterNumber)

            // ==================== پیش‌فرض ====================
            else -> getDefaultContent(bookId, chapterNumber)
        }
    }
}