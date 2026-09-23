package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCornersIntro {

    const val BOOK_ID = "four_corners_intro"

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
            title = "Hello!",
            titlePersian = "سلام!",
            objectives = listOf(
                "Introduce yourself",
                "Ask and answer basic personal questions",
                "Use the verb be with I, you, he, and she",
                "Say where you are from",
                "Spell names and simple words",
                "Use polite expressions in first meetings"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "name",
                    persian = "نام",
                    pronunciation = "/neɪm/",
                    partOfSpeech = "noun",
                    example = "My name is Sara.",
                    examplePersian = "اسم من سارا است."
                ),
                VocabWord(
                    english = "first name",
                    persian = "نام کوچک",
                    pronunciation = "/ˌfɜːrst ˈneɪm/",
                    partOfSpeech = "noun",
                    example = "My first name is Ali.",
                    examplePersian = "نام کوچک من علی است."
                ),
                VocabWord(
                    english = "last name",
                    persian = "نام خانوادگی",
                    pronunciation = "/ˌlæst ˈneɪm/",
                    partOfSpeech = "noun",
                    example = "My last name is Smith.",
                    examplePersian = "نام خانوادگی من اسمیت است."
                ),
                VocabWord(
                    english = "country",
                    persian = "کشور",
                    pronunciation = "/ˈkʌntri/",
                    partOfSpeech = "noun",
                    example = "Iran is my country.",
                    examplePersian = "ایران کشور من است."
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
                    english = "student",
                    persian = "دانش‌آموز / دانشجو",
                    pronunciation = "/ˈstuːdənt/",
                    partOfSpeech = "noun",
                    example = "I am a student.",
                    examplePersian = "من دانش‌آموز / دانشجو هستم."
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
                    example = "He is my new friend.",
                    examplePersian = "او دوست جدید من است."
                ),
                VocabWord(
                    english = "from",
                    persian = "از",
                    pronunciation = "/frəm/",
                    partOfSpeech = "preposition",
                    example = "I am from Azerbaijan.",
                    examplePersian = "من اهل آذربایجان هستم."
                ),
                VocabWord(
                    english = "welcome",
                    persian = "خوش آمدید",
                    pronunciation = "/ˈwelkəm/",
                    partOfSpeech = "expression",
                    example = "Welcome to our class!",
                    examplePersian = "به کلاس ما خوش آمدید!"
                ),
                VocabWord(
                    english = "nice",
                    persian = "خوب / خوشایند",
                    pronunciation = "/naɪs/",
                    partOfSpeech = "adjective",
                    example = "Nice to meet you.",
                    examplePersian = "از آشنایی با شما خوشحالم."
                ),
                VocabWord(
                    english = "meet",
                    persian = "ملاقات کردن / آشنا شدن",
                    pronunciation = "/miːt/",
                    partOfSpeech = "verb",
                    example = "It's nice to meet you.",
                    examplePersian = "از آشنایی با شما خوشحالم."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "Nice to meet you.",
                    persian = "از آشنایی با شما خوشحالم.",
                    example = "Hello, I'm David. Nice to meet you.",
                    examplePersian = "سلام، من دیوید هستم. از آشنایی با شما خوشحالم.",
                    register = "polite"
                ),
                IdiomExpression(
                    english = "See you later.",
                    persian = "بعداً می‌بینمت.",
                    example = "Goodbye! See you later.",
                    examplePersian = "خداحافظ! بعداً می‌بینمت.",
                    register = "informal"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "I'm",
                    content = "I'm شکل کوتاه I am است. در مکالمه روزمره معمولاً به صورت /aɪm/ تلفظ می‌شود."
                ),
                PronunciationTip(
                    title = "You're",
                    content = "You're شکل کوتاه you are است و نباید با your اشتباه گرفته شود."
                ),
                PronunciationTip(
                    title = "حروف انگلیسی",
                    content = "در هنگام spelling نام‌ها، حروف را جدا و واضح تلفظ کنید؛ برای مثال A-L-I."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "First meetings",
                    content = "در بسیاری از موقعیت‌های انگلیسی‌زبان، گفتن Nice to meet you هنگام اولین آشنایی یک عبارت مؤدبانه و رایج است."
                ),
                CulturalNote(
                    title = "First name and last name",
                    content = "First name معمولاً به نام کوچک و last name یا family name به نام خانوادگی اشاره دارد."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Verb Be: I am",
                    content = """
                        برای معرفی خودمان از am استفاده می‌کنیم:

                        I am Ali.
                        I am a student.
                        I am from Iran.

                        شکل کوتاه:

                        I am → I'm

                        مثال:
                        I'm Sara.
                        I'm a teacher.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Verb Be: You are",
                    content = """
                        برای you از are استفاده می‌کنیم:

                        You are a student.
                        You are from Turkey.

                        شکل کوتاه:

                        You are → You're
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "He and She",
                    content = """
                        برای he و she از is استفاده می‌کنیم:

                        He is Ali.
                        He is a student.

                        She is Sara.
                        She is a teacher.

                        شکل کوتاه:

                        He is → He's
                        She is → She's
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Basic Questions",
                    content = """
                        برای پرسیدن نام:

                        What's your name?
                        My name is Reza.

                        برای پرسیدن کشور:

                        Where are you from?
                        I'm from Iran.

                        برای پرسیدن شغل یا وضعیت:

                        Are you a student?
                        Yes, I am.

                        Is she a teacher?
                        Yes, she is.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I is a student.",
                    correct = "I am a student.",
                    explanation = "با I همیشه از am استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "You is from Iran.",
                    correct = "You are from Iran.",
                    explanation = "با you از are استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "She are a teacher.",
                    correct = "She is a teacher.",
                    explanation = "با she از is استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "Where you are from?",
                    correct = "Where are you from?",
                    explanation = "در سؤال با be، فعل قبل از فاعل قرار می‌گیرد."
                ),
                CommonMistake(
                    wrong = "Nice meet you.",
                    correct = "Nice to meet you.",
                    explanation = "ساختار درست عبارت Nice to meet you است."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Teacher",
                    english = "Good morning, everyone. Welcome to the English class.",
                    persian = "صبح بخیر، همه. به کلاس انگلیسی خوش آمدید."
                ),
                DialogueLine(
                    speaker = "Ali",
                    english = "Good morning.",
                    persian = "صبح بخیر."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Let's start by introducing ourselves. What's your name?",
                    persian = "بیایید با معرفی خودمان شروع کنیم. اسمت چیست؟"
                ),
                DialogueLine(
                    speaker = "Ali",
                    english = "My name is Ali.",
                    persian = "اسم من علی است."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Nice to meet you, Ali. Where are you from?",
                    persian = "از آشنایی با تو خوشحالم، علی. اهل کجا هستی؟"
                ),
                DialogueLine(
                    speaker = "Ali",
                    english = "I'm from Iran.",
                    persian = "من اهل ایران هستم."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Are you a student?",
                    persian = "آیا دانش‌آموز یا دانشجو هستی؟"
                ),
                DialogueLine(
                    speaker = "Ali",
                    english = "Yes, I am. I'm a university student.",
                    persian = "بله، هستم. من دانشجوی دانشگاه هستم."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Great. Please meet Sara. She's also a student.",
                    persian = "عالی. با سارا آشنا شو. او هم دانشجو است."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Hi, Ali. I'm Sara.",
                    persian = "سلام علی. من سارا هستم."
                ),
                DialogueLine(
                    speaker = "Ali",
                    english = "Hi, Sara. Nice to meet you.",
                    persian = "سلام سارا. از آشنایی با تو خوشحالم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Nice to meet you, too.",
                    persian = "من هم از آشنایی با تو خوشحالم."
                ),
                DialogueLine(
                    speaker = "Ali",
                    english = "