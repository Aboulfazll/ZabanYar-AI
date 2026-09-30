package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object AmericanEnglishFile4 {
    const val BOOK_ID = "american_english_file_4"

    fun getContent(n: Int): LessonContent = when (n) {
        1 -> Chunk1.file1();   2 -> Chunk1.file2();   3 -> Chunk1.file3()
        4 -> Chunk1.file4();   5 -> Chunk1.file5();   6 -> Chunk1.file6()
        7 -> Chunk2.file7();   8 -> Chunk2.file8();   9 -> Chunk2.file9()
        10 -> Chunk2.file10(); 11 -> Chunk2.file11(); 12 -> Chunk2.file12()
        13 -> Chunk3.file13(); 14 -> Chunk3.file14(); 15 -> Chunk3.file15()
        16 -> Chunk3.file16(); 17 -> Chunk3.file17(); 18 -> Chunk3.file18()
        19 -> Chunk4.file19(); 20 -> Chunk4.file20(); 21 -> Chunk4.file21()
        22 -> Chunk4.file22(); 23 -> Chunk4.file23(); 24 -> Chunk4.file24()
        else -> LessonContent(BOOK_ID, n, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList())
    }

    fun base(n: Int, title: String, fa: String,
        objectives: List<String>, vocab: List<VocabWord>,
        grammar: List<GrammarSection>, dialogue: List<DialogueLine>,
        quiz: List<QuizQuestion>,
        idioms: List<IdiomExpression> = emptyList(),
        phrasal: List<PhrasalVerb> = emptyList(),
        pronunciation: List<PronunciationTip> = emptyList(),
        culture: List<CulturalNote> = emptyList(),
        mistakes: List<CommonMistake> = emptyList(),
        comprehension: List<ComprehensionQuestion> = emptyList(),
        speaking: List<SpeakingTask> = emptyList(),
        writing: List<WritingTask> = emptyList()
    ) = LessonContent(
        bookId = BOOK_ID, chapterNumber = n, title = title, titlePersian = fa,
        objectives = objectives, vocabulary = vocab, idioms = idioms,
        phrasalVerbs = phrasal, pronunciationTips = pronunciation,
        culturalNotes = culture, grammar = grammar, commonMistakes = mistakes,
        conversation = dialogue, comprehensionQuestions = comprehension,
        speakingTasks = speaking, writingTasks = writing, quiz = quiz
    )

    fun v(e: String, p: String, ex: String, ep: String, pos: String = "noun") =
        VocabWord(e, p, partOfSpeech = pos, example = ex, examplePersian = ep)

    fun d(s: String, e: String, p: String) = DialogueLine(s, e, p)

    fun q(question: String, options: List<String>, correct: Int) =
        QuizQuestion(question, options, correct)
}