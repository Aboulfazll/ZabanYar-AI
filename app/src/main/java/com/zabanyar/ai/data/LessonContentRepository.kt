package com.zabanyar.ai.data

import com.zabanyar.ai.data.books.conversation.*
import com.zabanyar.ai.data.books.grammar.*

object LessonContentRepository {

    fun hasContent(bookId: String): Boolean {
        return when (bookId) {
            // 💬 مکالمه
            "top_notch_fundamentals", "top_notch_1", "top_notch_2", "top_notch_3",
            "evolve_1", "evolve_2", "evolve_3", "evolve_4", "evolve_5", "evolve_6",
            "english_file_starter",
            "english_file_1", "english_file_2", "english_file_3", "english_file_4", "english_file_5",
            "empower_c1",
            "four_corners_1", "four_corners_2", "four_corners_3", "four_corners_4",
            "passages_1", "passages_2",
            "summit_1", "summit_2",
            "basic_grammar", "understanding_grammar", "advanced_grammar",

            // ✨ American English File 4th Edition (NEW)
            "american_english_file_4th_starter",
            "american_english_file_4th_level1",
            "american_english_file_4th_level2",
            "american_english_file_4th_level3",
            "american_english_file_4th_level4",
            "american_english_file_4th_level5"

            -> true
            else -> false
        }
    }

    fun getLessonContent(bookId: String, chapterNumber: Int): LessonContent {
        return when (bookId) {
            // ==================== TopNotch ====================
            "top_notch_fundamentals" -> TopNotchFundamentals.getContent(chapterNumber)
            "top_notch_1" -> TopNotch1.getContent(chapterNumber)
            "top_notch_2" -> TopNotch2.getContent(chapterNumber)
            "top_notch_3" -> TopNotch3.getContent(chapterNumber)

            // ==================== Evolve ====================
            "evolve_1" -> Evolve1.getContent(chapterNumber)
            "evolve_2" -> Evolve2.getChapter(chapterNumber)
            "evolve_3" -> Evolve3.getChapter(chapterNumber)
            "evolve_4" -> Evolve4.getChapter(chapterNumber)
            "evolve_5" -> Evolve5.getChapter(chapterNumber)
            "evolve_6" -> Evolve6.getChapter(chapterNumber)

            // ==================== American English File (قدیمی) ====================
            "english_file_starter" -> AmericanEnglishFileStarter.getContent(chapterNumber)
            "english_file_1" -> AmericanEnglishFile1.getContent(chapterNumber)
            "english_file_2" -> AmericanEnglishFile2.getContent(chapterNumber)
            "english_file_3" -> AmericanEnglishFile3.getContent(chapterNumber)
            "english_file_4" -> AmericanEnglishFile4.getContent(chapterNumber)
            "english_file_5" -> AmericanEnglishFile5.getContent(chapterNumber)

            // ==================== ✨ American English File 4th Edition (NEW) ====================
            "american_english_file_4th_starter" -> AmericanEnglishFile4thStarter.getContent(chapterNumber)
            "american_english_file_4th_level1" -> AmericanEnglishFile4thLevel1.getContent(chapterNumber)
            "american_english_file_4th_level2" -> AmericanEnglishFile4thLevel2.getContent(chapterNumber)
            "american_english_file_4th_level3" -> AmericanEnglishFile4thLevel3.getContent(chapterNumber)
            "american_english_file_4th_level4" -> AmericanEnglishFile4thLevel4.getContent(chapterNumber)
            "american_english_file_4th_level5" -> AmericanEnglishFile4thLevel5.getContent(chapterNumber)

            // ==================== Empower ====================
            "empower_c1" -> EmpowerC1.getChapter(chapterNumber)

            // ==================== Four Corners ====================
            "four_corners_1" -> FourCorners1.getContent(chapterNumber)
            "four_corners_2" -> FourCorners2.getContent(chapterNumber)
            "four_corners_3" -> FourCorners3.getContent(chapterNumber)
            "four_corners_4" -> FourCorners4.getContent(chapterNumber)

            // ==================== Passages & Summit ====================
            "passages_1" -> Passages1.getContent(chapterNumber)
            "passages_2" -> Passages2.getContent(chapterNumber)
            "summit_1" -> Summit1.getContent(chapterNumber)
            "summit_2" -> Summit2.getContent(chapterNumber)

            // ==================== گرامر ====================
            "basic_grammar" -> BasicGrammar.getChapter(chapterNumber)
            "understanding_grammar" -> UnderstandingGrammar.getChapter(chapterNumber)
            "advanced_grammar" -> AdvancedGrammar.getChapter(chapterNumber)

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