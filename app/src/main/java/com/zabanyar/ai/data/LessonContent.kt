package com.zabanyar.ai.data

data class VocabWord(
    val english: String,
    val persian: String,
    val pronunciation: String = "",
    val partOfSpeech: String = "",
    val example: String = "",
    val examplePersian: String = "",
    val collocations: String = "",
    val synonyms: String = "",
    val antonyms: String = "",
    val wordFamily: String = "",
    val register: String = "",
    val usageTip: String = ""
)

data class IdiomExpression(
    val english: String,
    val persian: String,
    val example: String,
    val examplePersian: String,
    val register: String = "neutral"
)

data class PhrasalVerb(
    val verb: String,
    val meaning: String,
    val persian: String,
    val example: String,
    val examplePersian: String,
    val separable: String = ""
)

data class PronunciationTip(
    val title: String,
    val content: String
)

data class CulturalNote(
    val title: String,
    val content: String
)

data class CommonMistake(
    val wrong: String,
    val correct: String,
    val explanation: String
)

data class GrammarSection(
    val title: String,
    val content: String
)

data class DialogueLine(
    val speaker: String,
    val english: String,
    val persian: String
)

data class ComprehensionQuestion(
    val question: String,
    val answer: String
)

data class SpeakingTask(
    val prompt: String,
    val promptPersian: String,
    val hints: String = ""
)

data class WritingTask(
    val prompt: String,
    val promptPersian: String,
    val wordCount: Int = 100,
    val hints: String = ""
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
    val objectives: List<String> = emptyList(),
    val vocabulary: List<VocabWord>,
    val idioms: List<IdiomExpression> = emptyList(),
    val phrasalVerbs: List<PhrasalVerb> = emptyList(),
    val pronunciationTips: List<PronunciationTip> = emptyList(),
    val culturalNotes: List<CulturalNote> = emptyList(),
    val grammar: List<GrammarSection>,
    val commonMistakes: List<CommonMistake> = emptyList(),
    val conversation: List<DialogueLine>,
    val comprehensionQuestions: List<ComprehensionQuestion> = emptyList(),
    val speakingTasks: List<SpeakingTask> = emptyList(),
    val writingTasks: List<WritingTask> = emptyList(),
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