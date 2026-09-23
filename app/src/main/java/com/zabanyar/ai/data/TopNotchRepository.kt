package com.zabanyar.ai.data

data class VocabWord(
    val english: String,
    val persian: String,
    val pronunciation: String = ""
)

data class DialogueLine(
    val speaker: String,
    val english: String,
    val persian: String
)

data class GrammarSection(
    val title: String,
    val content: String
)

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctIndex: Int
)

data class LessonContent(
    val bookId: String,
    val chapterNumber: Int,
    val title: String,
    val titlePersian: String,
    val vocabulary: List<VocabWord>,
    val grammar: List<GrammarSection>,
    val conversation: List<DialogueLine>,
    val quiz: List<QuizQuestion>
)

fun getDefaultContent(bookId: String, chapter: Int): LessonContent {
    return LessonContent(
        bookId = bookId,
        chapterNumber = chapter,
        title = "Coming Soon",
        titlePersian = "به زودی...",
        vocabulary = emptyList(),
        grammar = emptyList(),
        conversation = emptyList(),
        quiz = emptyList()
    )
}

object LessonContentRepository {

    fun getLessonContent(bookId: String, chapterNumber: Int): LessonContent {
        return when (bookId) {
            "top_notch_1", "top_notch_2", "top_notch_3" ->
                TopNotchRepository.getContent(bookId, chapterNumber)

            "four_corners_1", "four_corners_2", "four_corners_3",
            "english_file_1", "english_file_2", "english_file_3", "english_file_4", "english_file_5",
            "evolve_1", "evolve_2", "evolve_3", "evolve_5", "evolve_6" ->
                AdditionalLessonContentRepository.getAdditionalContent(bookId, chapterNumber)

            else -> getDefaultContent(bookId, chapterNumber)
        }
    }
}