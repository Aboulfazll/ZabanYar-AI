package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object Evolve1 {

    const val BOOK_ID = "evolve_1"

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
            title = "Getting to Know You",
            titlePersian = "آشنایی با یکدیگر",

            objectives = listOf(
                "Introduce yourself and other people",
                "Ask and answer basic personal questions",
                "Talk about countries, cities, and nationalities",
                "Use the verb be correctly",
                "Spell names and simple words",
                "Use common greetings and leave-taking expressions",
                "Understand short everyday introductions"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "introduce",
                    persian = "معرفی کردن",
                    pronunciation = "/ˌɪntrəˈduːs/",
                    partOfSpeech = "verb",
                    example = "Let me introduce my friend.",
                    examplePersian = "اجازه بده دوستم را معرفی کنم.",
                    collocations = "introduce yourself, introduce someone"
                ),
                VocabWord(
                    english = "name",
                    persian = "نام",
                    pronunciation = "/neɪm/",
                    partOfSpeech = "noun",
                    example = "What's your name?",
                    examplePersian = "اسمت چیست؟"
                ),
                VocabWord(
                    english = "first name",
                    persian = "نام کوچک",
                    pronunciation = "/fɜːrst neɪm/",
                    partOfSpeech = "noun",
                    example = "My first name is Sara.",
                    examplePersian = "نام کوچک من سارا است."
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
                    example = "Which country are you from?",
                    examplePersian = "اهل کدام کشور هستی؟"
                ),
                VocabWord(
                    english = "nationality",
                    persian = "ملیت",
                    pronunciation = "/ˌnæʃəˈnæləti/",
                    partOfSpeech = "noun",
                    example = "What's your nationality?",
                    examplePersian = "ملیتت چیست؟"
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
                    example = "I'm a university student.",
                    examplePersian = "من دانشجوی دانشگاه هستم."
                ),
                VocabWord(
                    english = "teacher",
                    persian = "معلم / مدرس",
                    pronunciation = "/ˈtiːtʃər/",
                    partOfSpeech = "noun",
                    example = "She's an English teacher.",
                    examplePersian = "او معلم زبان انگلیسی است."
                ),
                VocabWord(
                    english = "classmate",
                    persian = "همکلاسی",
                    pronunciation = "/ˈklæsmeɪt/",
                    partOfSpeech = "noun",
                    example = "Ali is my new classmate.",
                    examplePersian = "علی همکلاسی جدید من است."
                ),
                VocabWord(
                    english = "friendly",
                    persian = "دوستانه / خوش‌برخورد",
                    pronunciation = "/ˈfrendli/",
                    partOfSpeech = "adjective",
                    example = "Everyone in the class is friendly.",
                    examplePersian = "همه در کلاس خوش‌برخورد هستند."
                ),
                VocabWord(
                    english = "language",
                    persian = "زبان",
                    pronunciation = "/ˈlæŋɡwɪdʒ/",
                    partOfSpeech = "noun",
                    example = "English is an international language.",
                    examplePersian = "انگلیسی یک زبان بین‌المللی است."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "Nice to meet you",
                    persian = "از آشنایی با شما خوشحالم",
                    example = "Nice to meet you. I'm Daniel.",
                    examplePersian = "از آشنایی با شما خوشحالم. من دانیل هستم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "How's it going?",
                    persian = "اوضاع چطوره؟",
                    example = "Hi! How's it going?",
                    examplePersian = "سلام! اوضاع چطوره؟",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "See you around",
                    persian = "بعداً می‌بینمت",
                    example = "I have to go now. See you around!",
                    examplePersian = "الان باید بروم. بعداً می‌بینمت!",
                    register = "informal"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "come from",
                    meaning = "to be originally from a place",
                    persian = "اهل جایی بودن",
                    example = "I come from Brazil.",
                    examplePersian = "من اهل برزیل هستم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "live in",
                    meaning = "to have your home in a place",
                    persian = "در جایی زندگی کردن",
                    example = "I live in Baku.",
                    examplePersian = "من در باکو زندگی می‌کنم.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "I'm / You're / He's",
                    content = "در گفتار طبیعی، شکل کوتاه فعل be بسیار رایج است: I'm, you're, he's, she's."
                ),
                PronunciationTip(
                    title = "Final consonants",
                    content = "به صداهای پایانی کلمات مانند name، friend و student توجه کن و آنها را حذف نکن."
                ),
                PronunciationTip(
                    title = "Spelling aloud",
                    content = "هنگام هجی کردن، حروف را واضح و جداگانه تلفظ کن؛ مخصوصاً حروفی مثل E، I و A."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "First introductions",
                    content = "در بسیاری از موقعیت‌های انگلیسی‌زبان، گفتن نام و سپس پرسیدن نام طرف مقابل یک شروع طبیعی برای آشنایی است."
                ),
                CulturalNote(
                    title = "Formal and informal greetings",
                    content = "Hello و Good morning برای موقعیت‌های عمومی مناسب‌اند؛ Hi و Hey معمولاً دوستانه‌تر و غیررسمی‌تر هستند."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Verb Be",
                    content = """
                        فعل be در زمان حال:

                        I am
                        You are
                        He is
                        She is
                        It is
                        We are
                        They are

                        مثال:

                        I am a student.
                        She is from Canada.
                        They are classmates.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Short Forms",
                    content = """
                        در مکالمه از شکل کوتاه استفاده می‌کنیم:

                        I am → I'm
                        You are → You're
                        He is → He's
                        She is → She's
                        We are → We're
                        They are → They're

                        مثال:
                        I'm from Iran.
                        She's a teacher.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Negative Forms",
                    content = """
                        برای منفی کردن:

                        I am not → I'm not
                        You are not → You aren't
                        He is not → He isn't
                        She is not → She isn't
                        They are not → They aren't

                        مثال:

                        I'm not a teacher.
                        He isn't from Spain.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Questions with Be",
                    content = """
                        برای سؤال، فعل be قبل از فاعل می‌آید:

                        Are you a student?
                        Is she from Turkey?
                        Are they classmates?

                        پاسخ کوتاه:

                        Yes, I am.
                        No, I'm not.

                        Yes, she is.
                        No, she isn't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Wh- Questions",
                    content = """
                        برای پرسیدن اطلاعات از کلمات پرسشی استفاده می‌کنیم:

                        What is your name?
                        Where are you from?
                        Who is your teacher?
                        What is your nationality?

                        ساختار رایج:

                        Wh-word + be + subject?
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I from Iran.",
                    correct = "I'm from Iran.",
                    explanation = "در جمله اسمی انگلیسی به فعل be نیاز داریم."
                ),
                CommonMistake(
                    wrong = "She are a student.",
                    correct = "She is a student.",
                    explanation = "با فاعل مفرد سوم‌شخص از is استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "Are you from where?",
                    correct = "Where are you from?",
                    explanation = "در سؤال‌های Wh، کلمه پرسشی معمولاً در ابتدای جمله قرار می‌گیرد."
                ),
                CommonMistake(
                    wrong = "My name are Ali.",
                    correct = "My name is Ali.",
                    explanation = "فاعل my name مفرد است، بنابراین از is استفاده می‌شود."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Emma",
                    english = "Hi! Is this your first English class?",
                    persian = "سلام! این اولین کلاس انگلیسی توست؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Yes, it is. I'm Omar.",
                    persian = "بله. من عمر هستم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Nice to meet you, Omar. I'm Emma.",
                    persian = "از آشنایی با تو خوشحالم، عمر. من اِما هستم."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Nice to meet you, too.",
                    persian = "من هم از آشنایی با تو خوشحالم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Where are you from?",
                    persian = "اهل کجایی؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "I'm from Azerbaijan. How about you?",
                    persian = "من اهل آذربایجان هستم. تو چطور؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm from Canada, but I live here now.",
                    persian = "من اهل کانادا هستم، اما الان اینجا زندگی می‌کنم."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Really? Which city are you from?",
                    persian = "واقعاً؟ اهل کدام شهر هستی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm from Toronto. Have you ever been there?",
                    persian = "من اهل تورنتو هستم. تا حالا آنجا بوده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "No, I haven't. Is it a big city?",
                    persian = "نه، نبوده‌ام. شهر بزرگی است؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Yes, it is. It's much bigger than this city.",
                    persian = "بله. خیلی بزرگ‌تر از این شهر است."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Are you a student here?",
                    persian = "اینجا دانشجو هستی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Yes. I'm studying business.",
                    persian = "بله. دارم مدیریت بازرگانی می‌خوانم."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "That's interesting. I'm studying computer science.",
                    persian = "جالب است. من علوم کامپیوتر می‌خوانم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Do you speak any other languages?",
                    persian = "زبان دیگری هم صحبت می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "I speak Azerbaijani and some Russian. I'm learning English now.",
                    persian = "آذربایجانی و کمی روسی صحبت می‌کنم. الان دارم انگلیسی یاد می‌گیرم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "That's great. I'm learning a little Azerbaijani.",
                    persian = "عالیه. من هم کمی آذربایجانی یاد می‌گیرم."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Really? Can you say something?",
                    persian = "واقعاً؟ می‌توانی چیزی بگویی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Only a few words!",
                    persian = "فقط چند کلمه!"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Don't worry. Your pronunciation is good.",
                    persian = "نگران نباش. تلفظت خوب است."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Thanks! I hope we can practice together.",
                    persian = "ممنون! امیدوارم بتوانیم با هم تمرین کنیم."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Sure. See you in class tomorrow.",
                    persian = "حتماً. فردا در کلاس می‌بینمت."
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Where is Omar from?",
                    answer = "He is from Azerbaijan."
                ),
                ComprehensionQuestion(
                    question = "Where is Emma from?",
                    answer = "She is from Canada."
                ),
                ComprehensionQuestion(
                    question = "What is Emma studying?",
                    answer = "She is studying business."
                ),
                ComprehensionQuestion(
                    question = "What is Omar studying?",
                    answer = "He is studying computer science."
                ),
                ComprehensionQuestion(
                    question = "Which languages does Omar speak?",
                    answer = "He speaks Azerbaijani and some Russian, and he is learning English."
                ),
                ComprehensionQuestion(
                    question = "What do Emma and Omar decide to do?",
                    answer = "They decide to practice languages together."
                )
            ),

            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Introduce yourself to a new classmate.",
                    promptPersian = "خودت را به یک همکلاسی جدید معرفی کن.",
                    hints = "My name is... / I'm from... / I live in... / I'm a..."
                ),
                SpeakingTask(
                    prompt = "Ask and answer five questions about personal information.",
                    promptPersian = "پنج سؤال درباره اطلاعات شخصی بپرس و جواب بده.",
                    hints = "What's your...? / Where are you...? / Are you...?"
                ),
                SpeakingTask(
                    prompt = "Talk for one minute about your city and your language.",
                    promptPersian = "یک دقیقه درباره شهر و زبانت صحبت کن.",
                    hints = "I live in... / My city is... / I speak..."
                )
            ),

            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a short introduction about yourself for a new English class.",
                    promptPersian = "یک معرفی کوتاه درباره خودت برای یک کلاس انگلیسی جدید بنویس.",
                    wordCount = 80,
                    hints = "Name, country, city, studies/work, languages, interests"
                )
            ),

            quiz = listOf(
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "I from Iran.",
                        "I am from Iran.",
                        "I is from Iran.",
                        "I are from Iran."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She ___ a student.",
                    options = listOf(
                        "am",
                        "are",
                        "is",
                        "be"
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct question.",
                    options = listOf(
                        "Where you are from?",
                        "Where are you from?",
                        "Where from are you?",
                        "You are from where?"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct negative sentence.",
                    options = listOf(
                        "He aren't a teacher.",
                        "He isn't a teacher.",
                        "He not is a teacher.",
                        "He am not a teacher."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'Nice to meet you' mean?",
                    options = listOf(
                        "Goodbye",
                        "How old are you?",
                        "I'm pleased to meet you",
                        "Where do you live?"
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: They ___ classmates.",
                    options = listOf(
                        "is",
                        "am",
                        "are",
                        "be"
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Which question asks about nationality?",
                    options = listOf(
                        "What's your name?",
                        "Where do you live?",
                        "What's your nationality?",
                        "Who is your teacher?"
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct short form.",
                    options = listOf(
                        "I'am",
                        "Im",
                        "I'm",
                        "I's"
                    ),
                    correctIndex = 2
                )
            )
        )
    }
}