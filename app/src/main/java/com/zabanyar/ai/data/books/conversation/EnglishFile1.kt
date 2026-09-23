package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile1 {

    const val BOOK_ID = "english_file_1"

    fun getChapter(chapterNumber: Int): LessonContent {
        return when (chapterNumber) {
            1 -> chapter1()
            else -> getDefaultContent(BOOK_ID, chapterNumber)
        }
    }

    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Hello! Nice to Meet You",
            titlePersian = "سلام! از آشنایی با شما خوشحالم",

            objectives = listOf(
                "Introduce yourself",
                "Ask and answer basic personal questions",
                "Use the verb be correctly",
                "Spell names and simple words",
                "Talk about countries and nationalities",
                "Use basic greetings and polite expressions"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "name",
                    persian = "نام",
                    pronunciation = "/neɪm/",
                    partOfSpeech = "noun",
                    example = "My name is Daniel.",
                    examplePersian = "نام من دنیل است.",
                    collocations = "first name, full name, last name"
                ),
                VocabWord(
                    english = "first name",
                    persian = "نام کوچک",
                    pronunciation = "/fɜːrst neɪm/",
                    partOfSpeech = "noun",
                    example = "What's your first name?",
                    examplePersian = "نام کوچکت چیست؟"
                ),
                VocabWord(
                    english = "last name",
                    persian = "نام خانوادگی",
                    pronunciation = "/læst neɪm/",
                    partOfSpeech = "noun",
                    example = "My last name is Brown.",
                    examplePersian = "نام خانوادگی من براون است."
                ),
                VocabWord(
                    english = "country",
                    persian = "کشور",
                    pronunciation = "/ˈkʌntri/",
                    partOfSpeech = "noun",
                    example = "What country are you from?",
                    examplePersian = "اهل کدام کشور هستی؟"
                ),
                VocabWord(
                    english = "nationality",
                    persian = "ملیت",
                    pronunciation = "/ˌnæʃəˈnæləti/",
                    partOfSpeech = "noun",
                    example = "What's your nationality?",
                    examplePersian = "ملیت شما چیست؟"
                ),
                VocabWord(
                    english = "student",
                    persian = "دانش‌آموز / دانشجو",
                    pronunciation = "/ˈstuːdənt/",
                    partOfSpeech = "noun",
                    example = "I'm a student.",
                    examplePersian = "من دانشجو هستم."
                ),
                VocabWord(
                    english = "teacher",
                    persian = "معلم",
                    pronunciation = "/ˈtiːtʃər/",
                    partOfSpeech = "noun",
                    example = "She is an English teacher.",
                    examplePersian = "او معلم زبان انگلیسی است."
                ),
                VocabWord(
                    english = "friend",
                    persian = "دوست",
                    pronunciation = "/frend/",
                    partOfSpeech = "noun",
                    example = "This is my friend, Anna.",
                    examplePersian = "این دوست من، آنا است."
                ),
                VocabWord(
                    english = "city",
                    persian = "شهر",
                    pronunciation = "/ˈsɪti/",
                    partOfSpeech = "noun",
                    example = "I live in a small city.",
                    examplePersian = "من در یک شهر کوچک زندگی می‌کنم."
                ),
                VocabWord(
                    english = "meet",
                    persian = "ملاقات کردن / آشنا شدن",
                    pronunciation = "/miːt/",
                    partOfSpeech = "verb",
                    example = "Nice to meet you.",
                    examplePersian = "از آشنایی با شما خوشحالم."
                ),
                VocabWord(
                    english = "spell",
                    persian = "هجی کردن",
                    pronunciation = "/spel/",
                    partOfSpeech = "verb",
                    example = "How do you spell your name?",
                    examplePersian = "اسمت را چطور هجی می‌کنی؟"
                ),
                VocabWord(
                    english = "welcome",
                    persian = "خوش آمدید",
                    pronunciation = "/ˈwelkəm/",
                    partOfSpeech = "expression",
                    example = "Welcome to our class.",
                    examplePersian = "به کلاس ما خوش آمدید."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "Nice to meet you",
                    persian = "از آشنایی با شما خوشحالم",
                    example = "Hi, I'm Emma. Nice to meet you.",
                    examplePersian = "سلام، من اِما هستم. از آشنایی با شما خوشحالم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "How are you?",
                    persian = "حالتان چطور است؟",
                    example = "Hello, David. How are you?",
                    examplePersian = "سلام دیوید. حالت چطور است؟",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "See you later",
                    persian = "بعداً می‌بینمت",
                    example = "I have a class now. See you later!",
                    examplePersian = "الان کلاس دارم. بعداً می‌بینمت!",
                    register = "informal"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "I'm",
                    content = "I'm شکل کوتاه I am است. در مکالمه روزمره معمولاً I'm استفاده می‌شود."
                ),
                PronunciationTip(
                    title = "You're",
                    content = "You're شکل کوتاه you are است و صدای آن تقریباً /jʊr/ یا /jər/ شنیده می‌شود."
                ),
                PronunciationTip(
                    title = "Name spelling",
                    content = "برای پرسیدن املای نام می‌توان گفت: How do you spell your name?"
                ),
                PronunciationTip(
                    title = "Final consonants",
                    content = "در کلماتی مانند friend و student صدای پایانی را حذف نکن."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Introducing yourself",
                    content = "در بسیاری از موقعیت‌های انگلیسی‌زبان، معرفی کوتاه با نام و سپس Nice to meet you یک الگوی رایج برای شروع آشنایی است."
                ),
                CulturalNote(
                    title = "First name",
                    content = "در بسیاری از کشورهای انگلیسی‌زبان، استفاده از first name در محیط‌های دوستانه و کاری رایج است؛ اما میزان صمیمیت مناسب به موقعیت و فرهنگ بستگی دارد."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "The