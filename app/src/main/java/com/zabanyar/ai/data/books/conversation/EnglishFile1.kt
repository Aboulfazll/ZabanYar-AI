package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile1 {

    const val BOOK_ID = "english_file_1"

    fun getChapter(chapterNumber: Int): LessonContent {
        return when (chapterNumber) {
            1 -> chapter1()
            2 -> chapter2()
            3 -> chapter3()
            4 -> chapter4()
            5 -> chapter5()
            6 -> chapter6()
            7 -> chapter7()
            8 -> chapter8()
            9 -> chapter9()
            10 -> chapter10()
            11 -> chapter11()
            12 -> chapter12()
            else -> getDefaultContent(BOOK_ID, chapterNumber)
        }
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 1 — Hello! Nice to Meet You
    // ═══════════════════════════════════════════════════════════
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
                    title = "The verb be",
                    content = """
                        فعل be در زمان حال:

                        I am  →  I'm
                        You are  →  You're
                        He is  →  He's
                        She is  →  She's
                        It is  →  It's
                        We are  →  We're
                        They are  →  They're

                        مثال:
                        I'm from Iran.
                        She's a teacher.
                        They're students.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Questions with be",
                    content = """
                        برای ساختن سؤال، فعل be را قبل از فاعل می‌آوریم:

                        Are you a student?  →  Yes, I am. / No, I'm not.
                        Is she from Turkey?  →  Yes, she is. / No, she isn't.
                        Are they friends?  →  Yes, they are. / No, they aren't.

                        Wh- questions:
                        What's your name?
                        Where are you from?
                        Who is he?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Possessive adjectives",
                    content = """
                        my   →  my name
                        your →  your city
                        his  →  his friend
                        her  →  her country
                        our  →  our class
                        their → their teacher

                        مثال:
                        What's your name?
                        Her name is Emma.
                        Their teacher is from Canada.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Subject pronouns",
                    content = """
                        I   →  من
                        you →  تو / شما
                        he  →  او (مذکر)
                        she →  او (مؤنث)
                        it  →  آن (شیء)
                        we  →  ما
                        they →  آنها

                        مثال:
                        He is my friend.
                        We are students.
                        They are teachers.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I from Iran.",
                    correct = "I'm from Iran.",
                    explanation = "بعد از فاعل باید فعل be بیاید."
                ),
                CommonMistake(
                    wrong = "She are a teacher.",
                    correct = "She is a teacher.",
                    explanation = "با she از is استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "They is students.",
                    correct = "They are students.",
                    explanation = "با they از are استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "What your name?",
                    correct = "What's your name?",
                    explanation = "What's = What is."
                ),
                CommonMistake(
                    wrong = "How you spell it?",
                    correct = "How do you spell it?",
                    explanation = "برای پرسیدن املای کلمه از do استفاده می‌کنیم."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Teacher",
                    english = "Good morning, everyone! Welcome to our English class.",
                    persian = "صبح بخیر، همه! به کلاس انگلیسی ما خوش آمدید."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Let's start with introductions. I'm Mr. Brown.",
                    persian = "بیایید با معرفی شروع کنیم. من آقای براون هستم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Hello, Mr. Brown. I'm Emma. Nice to meet you.",
                    persian = "سلام آقای براون. من اِما هستم. از آشنایی با شما خوشحالم."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Nice to meet you too, Emma. Where are you from?",
                    persian = "من هم از آشنایی با تو خوشحالم، اِما. اهل کجایی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm from Canada. I live in Toronto.",
                    persian = "من اهل کانادا هستم. در تورنتو زندگی می‌کنم."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "And you? What's your name?",
                    persian = "و تو؟ اسمت چیه؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "I'm David. I'm from Manchester, in England.",
                    persian = "من دیوید هستم. اهل منچستر، در انگلستان."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Nice to meet you, David. Is Manchester a big city?",
                    persian = "از آشنایی با تو خوشحالم، دیوید. منچستر شهر بزرگیه؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Yes, it's quite big. About half a million people.",
                    persian = "بله، نسبتاً بزرگه. حدود نیم میلیون نفر."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "David, how do you spell your last name?",
                    persian = "دیوید، نام خانوادگی‌ات رو چطور هجی می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "It's S-M-I-T-H. Smith.",
                    persian = "این‌طور: S-M-I-T-H. اسمیت."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Thanks! And are you a student here?",
                    persian = "ممنون! و تو اینجا دانشجو هستی؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Yes, I am. I study business. And you?",
                    persian = "بله. من مدیریت بازرگانی می‌خونم. تو چطور؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm a student too. I study languages.",
                    persian = "من هم دانشجو هستم. زبان می‌خونم."
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Great! Maybe we can study together sometime.",
                    persian = "عالی! شاید بتونیم یه وقت با هم درس بخونیم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'd like that. Nice to meet you, David.",
                    persian = "خوشحال می‌شم. از آشنایی با تو خوشحالم، دیوید."
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Nice to meet you too, Emma. See you later!",
                    persian = "من هم خوشحال شدم، اِما. بعداً می‌بینمت!"
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Very good, everyone. Let's continue with the lesson.",
                    persian = "خیلی خوب، همه. بیایید درس رو ادامه بدیم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Where is Emma from?",
                    answer = "She is from Canada. She lives in Toronto."
                ),
                ComprehensionQuestion(
                    question = "Where is David from?",
                    answer = "He is from Manchester, in England."
                ),
                ComprehensionQuestion(
                    question = "How do you spell David's last name?",
                    answer = "S-M-I-T-H. Smith."
                ),
                ComprehensionQuestion(
                    question = "What does Emma study?",
                    answer = "She studies languages."
                ),
                ComprehensionQuestion(
                    question = "What does David study?",
                    answer = "He studies business."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Introduce yourself to a partner.",
                    promptPersian = "خودت را به یک همکلاسی معرفی کن.",
                    hints = "I'm... / I'm from... / I'm a student."
                ),
                SpeakingTask(
                    prompt = "Ask your partner 3 basic questions.",
                    promptPersian = "سه سوال ساده از همکلاسی‌ات بپرس.",
                    hints = "What's your name? / Where are you from? / What do you study?"
                ),
                SpeakingTask(
                    prompt = "Spell your first and last name in English.",
                    promptPersian = "نام و نام خانوادگی‌ات را به انگلیسی هجی کن.",
                    hints = "My first name is... My last name is..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a short self-introduction.",
                    promptPersian = "یک معرفی کوتاه از خودت بنویس.",
                    wordCount = 60,
                    hints = "Name, city, country, student/job"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I ___ from Iran.",
                    options = listOf("is", "are", "am", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: She ___ a teacher.",
                    options = listOf("am", "are", "is", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct question.",
                    options = listOf(
                        "What your name?",
                        "What's your name?",
                        "What are your name?",
                        "What name you?"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: They ___ students.",
                    options = listOf("is", "am", "are", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct negative.",
                    options = listOf(
                        "He not is a doctor.",
                        "He isn't a doctor.",
                        "He aren't a doctor.",
                        "He don't a doctor."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'friend' mean?",
                    options = listOf("معلم", "دوست", "دانش‌آموز", "کشور"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct response: Nice to meet you.",
                    options = listOf(
                        "Nice to meet you too.",
                        "I'm from Iran.",
                        "Yes, I am.",
                        "Good night."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: ___ she a student?",
                    options = listOf("Am", "Are", "Is", "Be"),
                    correctIndex = 2
                )
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 2 — Every Day
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Every Day",
            titlePersian = "هر روز",
            objectives = listOf(
                "Talk about daily routines",
                "Tell the time",
                "Use the present simple for habits",
                "Use adverbs of frequency",
                "Talk about your job or studies"
            ),
            vocabulary = listOf(
                VocabWord("wake up", "بیدار شدن", "/weɪk ʌp/", "phrasal verb", "I wake up at 7.", "من ساعت ۷ بیدار می‌شم."),
                VocabWord("get up", "بلند شدن از تخت", "/ɡet ʌp/", "phrasal verb", "I get up at 7:30.", "من ساعت ۷:۳۰ بلند می‌شم."),
                VocabWord("have breakfast", "صبحانه خوردن", "/hæv ˈbrekfəst/", "phrase", "I have breakfast at 8.", "من ساعت ۸ صبحانه می‌خورم."),
                VocabWord("start work", "شروع کار", "/stɑːrt wɜːrk/", "phrase", "I start work at 9.", "من ساعت ۹ کارم رو شروع می‌کنم."),
                VocabWord("finish work", "تمام کردن کار", "/ˈfɪnɪʃ wɜːrk/", "phrase", "I finish work at 5.", "من ساعت ۵ کارم تموم می‌شه."),
                VocabWord("go to bed", "به رختخواب رفتن", "/ɡoʊ tə bed/", "phrase", "I go to bed at 11.", "من ساعت ۱۱ می‌رم بخوابم."),
                VocabWord("usually", "معمولاً", "/ˈjuːʒuəli/", "adverb", "I usually get up early.", "من معمولاً زود بلند می‌شم."),
                VocabWord("sometimes", "گاهی", "/ˈsʌmtaɪmz/", "adverb", "I sometimes work late.", "من گاهی دیر کار می‌کنم."),
                VocabWord("never", "هرگز", "/ˈnevər/", "adverb", "I never drink coffee.", "من هرگز قهوه نمی‌خورم."),
                VocabWord("often", "غالباً", "/ˈɔːfən/", "adverb", "I often walk to work.", "من غالباً پیاده سر کار می‌رم."),
                VocabWord("o'clock", "ساعت (در نقطه)", "/əˈklɑːk/", "adverb", "It's 9 o'clock.", "ساعت ۹ است."),
                VocabWord("midnight", "نیمه‌شب", "/ˈmɪdnaɪt/", "noun", "I go to bed before midnight.", "من قبل از نیمه‌شب می‌خوابم.")
            ),
            idioms = listOf(
                IdiomExpression("first thing in the morning", "اولین کار صبح", "I check my emails first thing in the morning.", "صبح اول از همه ایمیل‌هام رو چک می‌کنم.", "neutral"),
                IdiomExpression("rush hour", "ساعت شلوغی", "I avoid the rush hour.", "من از ساعت شلوغی پرهیز می‌کنم.", "neutral"),
                IdiomExpression("a night owl", "آدم شب‌زنده‌دار", "He's a night owl; he stays up late.", "او شب‌زنده‌داره؛ تا دیروقت بیدار می‌مونه.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("o'clock", "تلفظ /əˈklɑːk/ است و استرس روی /klɑːk/ می‌آید."),
                PronunciationTip("Present simple -s", "در سوم شخص مفرد، فعل +s می‌گیرد: works /wɜːrks/, gets /ɡets/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Time format", "در بریتانیا معمولاً از 12-hour clock استفاده می‌کنند؛ ولی در محیط‌های رسمی گاهی از 24-hour هم استفاده می‌شود."),
                CulturalNote("Small talk about routines", "صحبت درباره روتین روزانه یکی از موضوعات رایج Small Talk در انگلیسی است.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "Present simple",
                    content = """
                        برای عادت‌ها و کارهای روزمره:

                        I/You/We/They + verb
                        He/She/It + verb + s

                        I work in an office.
                        She works in a hospital.

                        منفی:
                        I don't work on Sundays.
                        He doesn't work on weekends.

                        سوال:
                        Do you work here?
                        Does she work here?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Adverbs of frequency",
                    content = """
                        always (100%) → همیشه
                        usually (90%)  → معمولاً
                        often (70%)    → غالباً
                        sometimes (50%)→ گاهی
                        never (0%)     → هرگز

                        جای قید: قبل از فعل اصلی، بعد از فعل be.

                        I usually get up early.
                        She is always late.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Telling the time",
                    content = """
                        What time is it?
                        It's 9 o'clock.
                        It's half past nine. (9:30)
                        It's quarter past nine. (9:15)
                        It's quarter to ten. (9:45)

                        در مکالمه روزمره:
                        It's nine fifteen.
                        It's nine thirty.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Prepositions of time",
                    content = """
                        at + ساعت دقیق:  at 7 o'clock
                        on + روز:        on Monday
                        in + صبح/بعدازظهر/عصر: in the morning

                        I get up at 7 in the morning.
                        I work on Mondays.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("I work in 7 o'clock.", "I work at 7 o'clock.", "برای ساعت دقیق از at استفاده می‌کنیم."),
                CommonMistake("She work every day.", "She works every day.", "در سوم شخص مفرد فعل +s می‌گیرد."),
                CommonMistake("I go to the bed at 11.", "I go to bed at 11.", "go to bed بدون the."),
                CommonMistake("I wake up in 7.", "I wake up at 7.", "برای ساعت from at.")
            ),
            conversation = listOf(
                DialogueLine("Anna", "Hi Mark! What time do you usually get up?", "سلام مارک! معمولاً چه ساعتی بیدار می‌شی؟"),
                DialogueLine("Mark", "I usually wake up at 6:30 and get up at 7.", "من معمولاً ساعت ۶:۳۰ بیدار می‌شم و ساعت ۷ بلند می‌شم."),
                DialogueLine("Anna", "That's early! What do you do in the morning?", "زوده! صبح‌ها چیکار می‌کنی؟"),
                DialogueLine("Mark", "I have a shower, then I have breakfast at 7:30.", "دوش می‌گیرم، بعد ساعت ۷:۳۰ صبحانه می‌خورم."),
                DialogueLine("Anna", "Do you have coffee?", "قهوه می‌خوری؟"),
                DialogueLine("Mark", "Yes, I always have a cup of coffee. What about you?", "بله، همیشه یه فنجون قهوه می‌خورم. تو چطور؟"),
                DialogueLine("Anna", "I never drink coffee. I prefer tea.", "من هرگز قهوه نمی‌خورم. چای رو ترجیح می‌دم."),
                DialogueLine("Mark", "Interesting. When do you start work?", "جالب. کی کارت شروع می‌شه؟"),
                DialogueLine("Anna", "I start at 9 and finish at 5. And you?", "ساعت ۹ شروع می‌شه و ۵ تموم می‌شه. تو چطور؟"),
                DialogueLine("Mark", "I start at 8:30 and finish at 6.", "من ساعت ۸:۳۰ شروع می‌کنم و ۶ تموم می‌کنم."),
                DialogueLine("Anna", "That's a long day. Do you work on weekends?", "روز طولانیه. آخر هفته‌ها کار می‌کنی؟"),
                DialogueLine("Mark", "Sometimes. But usually I rest on Sundays.", "گاهی. ولی معمولاً یکشنبه‌ها استراحت می‌کنم."),
                DialogueLine("Anna", "Same here. What time do you go to bed?", "منم همین‌طور. چه ساعتی می‌خوابی؟"),
                DialogueLine("Mark", "Usually around 11. And you?", "معمولاً حدود ۱۱. تو چطور؟"),
                DialogueLine("Anna", "I'm a night owl — I go to bed at midnight.", "من شب‌زنده‌دارم — ساعت نیمه‌شب می‌خوابم."),
                DialogueLine("Mark", "Wow, that's late! How do you wake up so early?", "واو، دیره! چطور اینقدر زود بیدار می‌شی؟"),
                DialogueLine("Anna", "I don't! I'm always tired in the morning.", "بیدار نمی‌شم! صبح‌ها همیشه خسته‌ام."),
                DialogueLine("Mark", "Ha! Maybe you should sleep earlier.", "ها! شاید باید زودتر بخوابی."),
                DialogueLine("Anna", "You're right. Maybe I'll try.", "حق داری. شاید امتحان کنم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Mark چه ساعتی بیدار می‌شود؟", "ساعت ۶:۳۰ صبح."),
                ComprehensionQuestion("Anna چه نوشیدنی‌ای ترجیح می‌دهد؟", "چای."),
                ComprehensionQuestion("Anna چه ساعتی می‌خوابد؟", "ساعت نیمه‌شب."),
                ComprehensionQuestion("Mark آخر هفته‌ها کار می‌کند؟", "گاهی، ولی معمولاً یکشنبه‌ها استراحت می‌کند."),
                ComprehensionQuestion("Anna چرا صبح‌ها خسته است؟", "چون شب‌ها دیر می‌خوابد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your daily routine.", "روتین روزانه‌ات رو توصیف کن.", "I wake up at... / I have breakfast at..."),
                SpeakingTask("Ask a partner about their routine.", "از یک دوست درباره روتینش بپرس.", "What time do you...? / Do you...?"),
                SpeakingTask("Talk about your weekend.", "درباره آخر هفته‌ات صحبت کن.", "I usually... / I sometimes...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your typical day.", "درباره یک روز معمولی‌ات بنویس.", 100, "Use present simple and time expressions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ at 7 every day.", listOf("wake up", "wakes up", "waking up", "woke up"), 1),
                QuizQuestion("Choose: I go to bed ___ 11.", listOf("in", "on", "at", "from"), 2),
                QuizQuestion("Which is correct?", listOf("I usually get up early.", "I get up usually early.", "Usually I get up early.", "I get up early usually."), 0),
                QuizQuestion("Complete: He ___ coffee.", listOf("never drink", "never drinks", "drinks never", "never drinking"), 1),
                QuizQuestion("What does 'night owl' mean?", listOf("آدم صبح‌خیز", "آدم شب‌زنده‌دار", "آدم خسته", "آدم خواب‌آلود"), 1),
                QuizQuestion("Complete: They ___ work on Sundays.", listOf("doesn't", "don't", "isn't", "aren't"), 1),
                QuizQuestion("Choose correct: What time ___ you get up?", listOf("does", "do", "is", "are"), 1),
                QuizQuestion("Complete: I have breakfast ___ the morning.", listOf("on", "at", "in", "from"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 3 — Family and Friends
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Family and Friends",
            titlePersian = "خانواده و دوستان",
            objectives = listOf(
                "Talk about family members",
                "Use possessive 's",
                "Use have/has",
                "Describe people's appearance",
                "Use adjectives to describe personality"
            ),
            vocabulary = listOf(
                VocabWord("family", "خانواده", "/ˈfæməli/", "noun", "I have a big family.", "من خانواده بزرگی دارم."),
                VocabWord("parents", "والدین", "/ˈperənts/", "noun", "My parents live in Tehran.", "والدینم در تهران زندگی می‌کنند."),
                VocabWord("brother", "برادر", "/ˈbrʌðər/", "noun", "I have one brother.", "من یک برادر دارم."),
                VocabWord("sister", "خواهر", "/ˈsɪstər/", "noun", "My sister is a teacher.", "خواهرم معلم است."),
                VocabWord("grandmother", "مادربزرگ", "/ˈɡrænmʌðər/", "noun", "My grandmother is 80.", "مادربزرگم ۸۰ سالشه."),
                VocabWord("grandfather", "پدربزرگ", "/ˈɡrænfɑːðər/", "noun", "My grandfather was a doctor.", "پدربزرگم دکتر بود."),
                VocabWord("uncle", "عمو / دایی", "/ˈʌŋkəl/", "noun", "My uncle lives in Canada.", "عمویم در کانادا زندگی می‌کنه."),
                VocabWord("aunt", "عمه / خاله", "/ænt/", "noun", "My aunt is a nurse.", "خاله‌ام پرستار است."),
                VocabWord("cousin", "پسرعمو / دخترخاله", "/ˈkʌzən/", "noun", "I have many cousins.", "من پسرعموهای زیادی دارم."),
                VocabWord("married", "متأهل", "/ˈmerid/", "adjective", "My brother is married.", "برادرم متأهل است."),
                VocabWord("single", "مجرد", "/ˈsɪŋɡəl/", "adjective", "I'm single.", "من مجردم."),
                VocabWord("tall", "قدبلند", "/tɔːl/", "adjective", "My father is tall.", "پدرم قدبلند است.")
            ),
            idioms = listOf(
                IdiomExpression("like father, like son", "پسر رو از پدرش بشناس", "He's very hardworking, like father, like son.", "او خیلی سخت‌کوشه، پسر رو از پدرش بشناس.", "idiom"),
                IdiomExpression("get along with", "کنار آمدن با", "I get along well with my sister.", "من با خواهرم خوب کنار میام.", "neutral"),
                IdiomExpression("take after", "شبیه بودن به", "She takes after her mother.", "او شبیه مادرشه.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Possessive 's", "در Ali's /ˈæliz/، اگر اسم به s ختم شود: Chris's /ˈkrɪsɪz/."),
                PronunciationTip("th sound", "در کلماتی مثل brother و father، th صدای /ð/ دارد.")
            ),
            culturalNotes = listOf(
                CulturalNote("Family structure", "در کشورهای انگلیسی‌زبان، 'immediate family' یعنی پدر، مادر و فرزندان؛ 'extended family' یعنی پدربزرگ و مادربزرگ، عمو، خاله و..." ),
                CulturalNote("Asking about family", "پرسیدن درباره خانواده یک موضوع رایج Small Talk است، ولی در محیط کار رسمی معمولاً از سوالات شخصی پرهیز می‌شود.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "Possessive 's",
                    content = """
                        برای نشان دادن مالکیت:

                        Ali's car (ماشین علی)
                        My father's name (نام پدرم)
                        Sara's brother (برادر سارا)

                        برای جمع‌ها: parents' house
                        برای اسم‌های با s: Chris's car / Chris' car
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "have / has",
                    content = """
                        I/You/We/They + have
                        He/She/It + has

                        I have one brother.
                        She has two sisters.
                        They have a big family.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Describing people",
                    content = """
                        ظاهر: tall, short, young, old, thin, heavy
                        مو: long, short, dark, blonde
                        شخصیت: kind, funny, shy, friendly, serious

                        What does she look like? (ظاهر)
                        What is she like? (شخصیت)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Possessive adjectives",
                    content = """
                        my / your / his / her / its / our / their + noun

                        My brother is a doctor.
                        Her parents live in Shiraz.
                        Their house is big.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("She have two brothers.", "She has two brothers.", "سوم شخص مفرد has می‌گیرد."),
                CommonMistake("Ali car is new.", "Ali's car is new.", "برای مالکیت از 's استفاده می‌کنیم."),
                CommonMistake("What is she look like?", "What does she look like?", "ساختار صحیح: What does ... look like?"),
                CommonMistake("His name is Ali. His 25 years old.", "His name is Ali. He is 25 years old.", "برای سن از He/She استفاه می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you have a big family?", "خانواده بزرگی داری؟"),
                DialogueLine("B", "Yes, I have two brothers and one sister.", "بله، دو برادر و یک خواهر دارم."),
                DialogueLine("A", "What do your parents do?", "والدینت چیکار می‌کنن؟"),
                DialogueLine("B", "My father is an engineer and my mother is a teacher.", "پدرم مهندسه و مادرم معلمه."),
                DialogueLine("A", "Are you the oldest?", "تو بزرگ‌ترین هستی؟"),
                DialogueLine("B", "No, I'm the youngest. My brother is 30.", "نه، من کوچک‌ترینم. برادرم ۳۰ سالشه."),
                DialogueLine("A", "What does your brother do?", "برادرت چیکار می‌کنه؟"),
                DialogueLine("B", "He's a doctor. He works at a hospital downtown.", "اون دکتره. در یه بیمارستان مرکز شهر کار می‌کنه."),
                DialogueLine("A", "Does he look like your father?", "شبیه پدرت هست؟"),
                DialogueLine("B", "Yes, he does! He takes after my father.", "بله! او شبیه پدرمه."),
                DialogueLine("A", "And what about your sister?", "خواهرت چطور؟"),
                DialogueLine("B", "She's very funny. She's the life of every party!", "او خیلی بامزه‌ست. او روح هر مهمونیه!"),
                DialogueLine("A", "Do you get along well?", "خوب کنار میاید؟"),
                DialogueLine("B", "Usually, yes. We're very close.", "معمولاً بله. ما خیلی نزدیک هستیم."),
                DialogueLine("A", "That's nice. Family is important.", "خوبه. خانواده مهمه."),
                DialogueLine("B", "Yes, it is. Do you have siblings?", "بله. تو خواهر و برادر داری؟"),
                DialogueLine("A", "I have one sister. She's married.", "من یه خواهر دارم. اون متأهله."),
                DialogueLine("B", "Oh, nice. What does her husband do?", "اوه، خوبه. شوهرش چیکار می‌کنه؟"),
                DialogueLine("A", "He's a chef at a restaurant.", "اون سرآشپز یه رستورانه."),
                DialogueLine("B", "That's a great job!", "شغل عالیه!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند خواهر و برادر دارد؟", "دو برادر و یک خواهر."),
                ComprehensionQuestion("برادر B چه شغلی دارد؟", "او دکتر است و در بیمارستان کار می‌کند."),
                ComprehensionQuestion("آیا برادر B شبیه پدرش است؟", "بله، او شبیه پدرش است."),
                ComprehensionQuestion("خواهر A چه وضعیتی دارد؟", "متأهل است و شوهرش سرآشپز است."),
                ComprehensionQuestion("B فرزند چندم خانواده است؟", "کوچک‌ترین.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your family.", "خانواده‌ات رو توصیف کن.", "I have... / My father is..."),
                SpeakingTask("Describe a family member's appearance.", "ظاهر یکی از اعضای خانواده‌ت رو توصیف کن.", "He's tall... / She has..."),
                SpeakingTask("Talk about who you look like.", "درباره این که شبیه کی هستی صحبت کن.", "I take after my...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your family.", "درباره خانواده‌ات بنویس.", 120, "Include 3 family members and 1 comparison.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ one sister.", listOf("have", "has", "haves", "having"), 1),
                QuizQuestion("Choose correct possessive:", listOf("Ali car", "Ali's car", "Alis car", "Car Ali"), 1),
                QuizQuestion("Complete: I ___ well with my brother.", listOf("get along", "get on", "get with", "go along"), 0),
                QuizQuestion("What does 'take after' mean?", listOf("شبیه بودن", "ترک کردن", "دنبال کردن", "کنار آمدن"), 0),
                QuizQuestion("Complete: What ___ she look like?", listOf("is", "does", "do", "did"), 1),
                QuizQuestion("Complete: My brother ___ 30 years old.", listOf("have", "has", "is", "are"), 2),
                QuizQuestion("Choose correct possessive adjective:", listOf("Her brother is a doctor.", "She brother is a doctor.", "His brother is a doctor (for a female).", "Its brother is a doctor."), 0),
                QuizQuestion("Complete: They ___ a big family.", listOf("has", "have", "haves", "having"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 4 — Everyday Activities
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Everyday Activities",
            titlePersian = "فعالیت‌های روزمره",
            objectives = listOf(
                "Talk about hobbies and free time",
                "Use like/love/enjoy + verb-ing",
                "Use can/can't for ability",
                "Talk about sports and games",
                "Describe what you do in your free time"
            ),
            vocabulary = listOf(
                VocabWord("hobby", "سرگرمی", "/ˈhɑːbi/", "noun", "My hobby is reading.", "سرگرمی من کتاب خواندنه."),
                VocabWord("read", "خواندن", "/riːd/", "verb", "I like reading books.", "دوست دارم کتاب بخونم."),
                VocabWord("play", "بازی کردن", "/pleɪ/", "verb", "I play football.", "من فوتبال بازی می‌کنم."),
                VocabWord("watch", "تماشا کردن", "/wɑːtʃ/", "verb", "I watch movies.", "من فیلم تماشا می‌کنم."),
                VocabWord("listen", "گوش دادن", "/ˈlɪsən/", "verb", "I listen to music.", "من به موسیقی گوش می‌دم."),
                VocabWord("cook", "آشپزی کردن", "/kʊk/", "verb", "I love cooking.", "عاشق آشپزی هستم."),
                VocabWord("swim", "شنا کردن", "/swɪm/", "verb", "Can you swim?", "می‌تونی شنا کنی؟"),
                VocabWord("draw", "نقاشی کشیدن", "/drɔː/", "verb", "She draws very well.", "او خیلی خوب نقاشی می‌کشه."),
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb", "We travel every summer.", "ما هر تابستان سفر می‌کنیم."),
                VocabWord("meet friends", "دیدن دوستان", "/miːt frendz/", "phrase", "I meet friends on Fridays.", "جمعه‌ها دوستام رو می‌بینم."),
                VocabWord("go shopping", "خرید رفتن", "/ɡoʊ ˈʃɑːpɪŋ/", "phrase", "I go shopping on weekends.", "آخر هفته‌ها خرید می‌رم."),
                VocabWord("take photos", "عکس گرفتن", "/teɪk ˈfoʊtoʊz/", "phrase", "He takes photos of nature.", "او از طبیعت عکس می‌گیره.")
            ),
            idioms = listOf(
                IdiomExpression("kill time", "وقت کشتن", "I read magazines to kill time.", "برای کشتن وقت مجله می‌خونم.", "informal"),
                IdiomExpression("have a blast", "خیلی خوش گذروندن", "We had a blast at the party.", "توی مهمونی خیلی خوش گذروندیم.", "informal"),
                IdiomExpression("hang out", "وقت گذراندن", "I hang out with friends on weekends.", "آخر هفته‌ها با دوستام وقت می‌گذرونم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ing", "در فعل‌های مثل swimming، /ɪŋ/ تلفظ می‌شود. در انگلیسی آمریکایی گاهی /ɪn/ می‌شود."),
                PronunciationTip("can / can't", "can't در انگلیسی آمریکایی /kænt/ و در انگلیسی بریتانیایی /kɑːnt/ تلفظ می‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Weekend activities", "در غرب، آخر هفته‌ها برای ورزش، سینما، رستوران و تفریح استفاده می‌شود."),
                CulturalNote("Outdoor hobbies", "پیاده‌روی، کوه‌نوردی و پیک‌نیک از فعالیت‌های رایج آخر هفته در غرب است.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "Like + verb-ing",
                    content = """
                        بعد از like/love/enjoy/hate از فعل +ing استفاده می‌کنیم:

                        I like reading.
                        I love cooking.
                        I enjoy swimming.
                        I hate waiting.

                        سوال:
                        Do you like reading?
                        What do you like doing?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "can / can't",
                    content = """
                        برای بیان توانایی:

                        I can swim.
                        She can cook very well.
                        They can't speak French.

                        سوال:
                        Can you drive?
                        Yes, I can. / No, I can't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present simple questions",
                    content = """
                        Do you + verb...?
                        Does he/she + verb...?

                        Do you play sports?
                        Does she like cooking?

                        پاسخ کوتاه:
                        Yes, I do. / No, I don't.
                        Yes, she does. / No, she doesn't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "go + verb-ing",
                    content = """
                        برای فعالیت‌های ورزشی و تفریحی:

                        go swimming
                        go shopping
                        go dancing
                        go fishing

                        I go swimming every Sunday.
                        We go shopping on Saturdays.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("I like read books.", "I like reading books.", "بعد از like فعل +ing."),
                CommonMistake("I can to swim.", "I can swim.", "بعد از can فعل ساده می‌آید (بدون to)."),
                CommonMistake("She cans cook.", "She can cook.", "can همیشه ثابت است."),
                CommonMistake("I go to swimming.", "I go swimming.", "go + verb-ing بدون to.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you do in your free time?", "وقت آزادت چیکار می‌کنی؟"),
                DialogueLine("B", "I love reading and watching movies. What about you?", "عاشق کتاب خواندن و فیلم دیدنم. تو چطور؟"),
                DialogueLine("A", "I enjoy cooking. I try new recipes every weekend.", "من از آشپزی لذت می‌برم. هر آخر هفته دستور پخت جدید امتحان می‌کنم."),
                DialogueLine("B", "That's cool! Can you cook Persian food?", "باحاله! می‌تونی غذای ایرانی بپزی؟"),
                DialogueLine("A", "Yes, I can! My mother taught me.", "بله، می‌تونم! مادرم یادم داد."),
                DialogueLine("B", "What's your favorite dish to cook?", "غذای مورد علاقه‌ات برای پختن چیه؟"),
                DialogueLine("A", "I love making ghormeh sabzi. It's delicious.", "عاشق درست کردن قرمه سبزی هستم. خوشمزه‌ست."),
                DialogueLine("B", "I've never tried it. Maybe you can teach me!", "تا حالا امتحانش نکردم. شاید بتونی یادم بدی!"),
                DialogueLine("A", "Sure! What sports do you play?", "حتماً! چه ورزشی می‌کنی؟"),
                DialogueLine("B", "I play tennis. I go swimming too.", "تنیس بازی می‌کنم. شنا هم می‌رم."),
                DialogueLine("A", "Can you swim well?", "خوب شنا می‌کنی؟"),
                DialogueLine("B", "Yes, I can. I learned when I was five.", "بله. پنج سالگی یاد گرفتم."),
                DialogueLine("A", "That's great. Do you play any instruments?", "عالیه. ساز هم می‌زنی؟"),
                DialogueLine("B", "I play the guitar, but not very well.", "گیتار می‌زنم، ولی نه خیلی خوب."),
                DialogueLine("A", "That's still impressive! I can't play anything.", "این هم قابل تحسینه! من هیچی نمی‌تونم بزنم."),
                DialogueLine("B", "You could learn! It's never too late.", "می‌تونی یاد بگیری! هیچ‌وقت دیر نیست."),
                DialogueLine("A", "Maybe I will. Thanks for the encouragement.", "شاید یاد بگیرم. ممنون برای تشویق."),
                DialogueLine("B", "Anytime! Let me know if you want lessons.", "هر وقت! اگه کلاس خواستی خبرم کن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("A وقت آزادش چیکار می‌کنه؟", "آشپزی می‌کنه و دستور پخت جدید امتحان می‌کنه."),
                ComprehensionQuestion("B چه ورزش‌هایی می‌کنه؟", "تنیس بازی می‌کنه و شنا می‌ره."),
                ComprehensionQuestion("B چه سازی می‌زنه؟", "گیتار می‌زنه، ولی نه خیلی خوب."),
                ComprehensionQuestion("A چه غذایی رو دوست داره بپزه؟", "قرمه سبزی."),
                ComprehensionQuestion("B کِی شنا یاد گرفته؟", "پنج سالگی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your hobbies.", "درباره سرگرمی‌هات صحبت کن.", "I like... / I love... / I enjoy..."),
                SpeakingTask("Describe what you can and can't do.", "درباره چیزهایی که می‌تونی و نمی‌تونی انجام بدی صحبت کن.", "I can... / I can't..."),
                SpeakingTask("Ask a friend about their free time.", "از یک دوست درباره وقت آزادش بپرس.", "What do you do...? / Do you like...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite hobby.", "درباره سرگرمی مورد علاقه‌ات بنویس.", 100, "Use like + verb-ing.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I like ___ books.", listOf("read", "reading", "to read", "reads"), 1),
                QuizQuestion("Complete: She can ___ very well.", listOf("to cook", "cooks", "cook", "cooking"), 2),
                QuizQuestion("Complete: I go ___ on Sundays.", listOf("to swim", "swimming", "swim", "swims"), 1),
                QuizQuestion("What does 'hang out' mean?", listOf("آویزون شدن", "وقت گذراندن", "بیرون رفتن", "خرید کردن"), 1),
                QuizQuestion("Complete: ___ you play tennis?", listOf("Are", "Do", "Is", "Does"), 1),
                QuizQuestion("Choose correct:", listOf("I can to swim.", "I can swim.", "I can swimming.", "I can swims."), 1),
                QuizQuestion("Complete: She ___ play the piano.", listOf("can", "cans", "is can", "to can"), 0),
                QuizQuestion("What does 'have a blast' mean?", listOf("انفجار", "خیلی خوش گذروندن", "بیرون رفتن", "دویدن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 5 — At Home
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "At Home",
            titlePersian = "در خانه",
            objectives = listOf(
                "Name rooms and furniture",
                "Use there is / there are",
                "Use prepositions of place",
                "Describe your home",
                "Talk about your neighborhood"
            ),
            vocabulary = listOf(
                VocabWord("house", "خانه", "/haʊs/", "noun", "I live in a small house.", "من در یک خانه کوچک زندگی می‌کنم."),
                VocabWord("apartment", "آپارتمان", "/əˈpɑːrtmənt/", "noun", "We live in an apartment.", "ما در یک آپارتمان زندگی می‌کنیم."),
                VocabWord("kitchen", "آشپزخانه", "/ˈkɪtʃɪn/", "noun", "The kitchen is small.", "آشپزخانه کوچک است."),
                VocabWord("bedroom", "اتاق خواب", "/ˈbedruːm/", "noun", "My bedroom is upstairs.", "اتاق خواب من بالا است."),
                VocabWord("bathroom", "حمام", "/ˈbæθruːm/", "noun", "The bathroom is next to my room.", "حمام کنار اتاق منه."),
                VocabWord("living room", "اتاق نشیمن", "/ˈlɪvɪŋ ruːm/", "noun", "We watch TV in the living room.", "ما در اتاق نشیمن تلویزیون تماشا می‌کنیم."),
                VocabWord("table", "میز", "/ˈteɪbəl/", "noun", "There is a table in the kitchen.", "در آشپزخانه یک میز هست."),
                VocabWord("chair", "صندلی", "/tʃer/", "noun", "There are four chairs.", "چهار صندلی هست."),
                VocabWord("bed", "تخت", "/bed/", "noun", "My bed is very comfortable.", "تختم خیلی راحته."),
                VocabWord("window", "پنجره", "/ˈwɪndoʊ/", "noun", "Open the window, please.", "پنجره رو باز کن، لطفاً."),
                VocabWord("door", "در", "/dɔːr/", "noun", "Close the door.", "در رو ببند."),
                VocabWord("neighborhood", "محله", "/ˈneɪbərhʊd/", "noun", "It's a nice neighborhood.", "محله خوبیه.")
            ),
            idioms = listOf(
                IdiomExpression("home sweet home", "خونه خود آدم خوبه", "After a long trip, home sweet home!", "بعد از یه سفر طولانی، خونه خود آدم خوبه!", "idiom"),
                IdiomExpression("feel at home", "احساس راحتی کردن", "Make yourself at home.", "راحت باش.", "neutral"),
                IdiomExpression("move in", "اسباب‌کشی کردن", "We moved in last week.", "هفته پیش اسباب‌کشی کردیم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("there is / there are", "there is به صورت /ðer ɪz/ و there are به صورت /ðer ər/ تلفظ می‌شود."),
                PronunciationTip("Silent letters", "در کلماتی مثل window، حرف d تلفظ می‌شود ولی در Wednesday سایلنت است.")
            ),
            culturalNotes = listOf(
                CulturalNote("Types of homes", "در کشورهای انگلیسی‌زبان، خانه‌ها می‌توانند house (ویلایی) یا apartment/flat (آپارتمان) باشند."),
                CulturalNote("Neighborhoods", "در غرب، neighborhood هر منطقه‌ای با مغازه، مدرسه و پارک است.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "there is / there are",
                    content = """
                        برای بیان وجود چیزی:

                        There is + اسم مفرد: There is a sofa.
                        There are + اسم جمع: There are two beds.

                        منفی:
                        There isn't a garage.
                        There aren't any chairs.

                        سوال:
                        Is there a bank near here?
                        Are there any shops?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Prepositions of place",
                    content = """
                        in       →  در
                        on       →  روی
                        under    →  زیر
                        next to  →  کنار
                        between  →  بین
                        behind   →  پشت
                        in front of → جلوی

                        The book is on the table.
                        The cat is under the chair.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Articles a/an/the",
                    content = """
                        a / an → برای اسم مفرد نامشخص:
                        a book, an apple

                        the → برای اسم مشخص:
                        the book on the table

                        بدون حرف تعریف برای جمع کلی:
                        I like books.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Possessive 's and of",
                    content = """
                        Ali's house (خونه علی)
                        The door of the house (در خانه)

                        برای اشیاء معمولاً از of استفاده می‌کنیم.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("There is two beds.", "There are two beds.", "برای جمع از there are استفاده می‌کنیم."),
                CommonMistake("There have a table.", "There is a table.", "برای وجود از there is/are استفاده می‌کنیم."),
                CommonMistake("The book is in the table.", "The book is on the table.", "برای سطح از on استفاده می‌کنیم."),
                CommonMistake("I live in an house.", "I live in a house.", "قبل از صدای صامت a می‌آید.")
            ),
            conversation = listOf(
                DialogueLine("A", "Where do you live?", "کجا زندگی می‌کنی؟"),
                DialogueLine("B", "I live in an apartment in the city center.", "من در یه آپارتمان در مرکز شهر زندگی می‌کنم."),
                DialogueLine("A", "How many rooms are there?", "چند تا اتاق داره؟"),
                DialogueLine("B", "There are three rooms: a bedroom, a living room, and a kitchen.", "سه تا اتاق: یه اتاق خواب، یه نشیمن و یه آشپزخانه."),
                DialogueLine("A", "Is there a balcony?", "بالکن داره؟"),
                DialogueLine("B", "Yes, there is. It's small but nice.", "بله. کوچیکه ولی خوبه."),
                DialogueLine("A", "What's your neighborhood like?", "محله‌ات چطوره؟"),
                DialogueLine("B", "It's quiet and safe. There are shops and cafes nearby.", "ساکت و امنه. مغازه و کافه نزدیک هست."),
                DialogueLine("A", "Is there a park?", "پارک هست؟"),
                DialogueLine("B", "Yes, there's a small park next to my building.", "بله، یه پارک کوچیک کنار ساختمونمه."),
                DialogueLine("A", "Do you like living there?", "دوست داری اونجا زندگی کنی؟"),
                DialogueLine("B", "Yes, I do. It feels like home now.", "بله. الان حس خونه رو داره."),
                DialogueLine("A", "Where do your parents live?", "والدینت کجا زندگی می‌کنن؟"),
                DialogueLine("B", "They live in a house in the suburbs.", "اونا در یه خونه در حومه شهر زندگی می‌کنن."),
                DialogueLine("A", "Is their house big?", "خونشون بزرگه؟"),
                DialogueLine("B", "Yes, it's quite big. It has a garden too.", "بله، نسبتاً بزرگه. یه باغ هم داره."),
                DialogueLine("A", "That sounds lovely.", "قشنگ به نظر می‌رسه."),
                DialogueLine("B", "Yes, it is. I visit them on weekends.", "بله. آخر هفته‌ها می‌رم دیدنشون."),
                DialogueLine("A", "Do they live far from you?", "از تو دور زندگی می‌کنن؟"),
                DialogueLine("B", "About 30 minutes by car. Not too far.", "حدود ۳۰ دقیقه با ماشین. زیاد دور نیست."),
                DialogueLine("A", "That's convenient. Do they visit you too?", "این راحته. اونا هم میان دیدنت؟"),
                DialogueLine("B", "Yes, sometimes. My mom loves my neighborhood.", "بله، گاهی. مامانم محله‌ام رو دوست داره.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B در چه نوع خانه‌ای زندگی می‌کند؟", "در یک آپارتمان در مرکز شهر."),
                ComprehensionQuestion("آپارتمان B چند اتاق دارد؟", "سه اتاق: یک اتاق خواب، یک نشیمن و یک آشپزخانه."),
                ComprehensionQuestion("محله B چطور است؟", "ساکت و امن، با مغازه و کافه نزدیک."),
                ComprehensionQuestion("والدین B کجا زندگی می‌کنند؟", "در یک خانه در حومه شهر، با باغ."),
                ComprehensionQuestion("فاصله والدین B چقدر است؟", "حدود ۳۰ دقیقه با ماشین.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your home.", "خونت رو توصیف کن.", "There is... / There are..."),
                SpeakingTask("Talk about your neighborhood.", "درباره محله‌ات صحبت کن.", "It's quiet... / There are shops..."),
                SpeakingTask("Describe your dream house.", "خانه رویایی‌ات رو توصیف کن.", "I'd like a... with...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your home and neighborhood.", "خونه و محله‌ات رو توصیف کن.", 120, "Use there is/are and prepositions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: There ___ two beds.", listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: The book is ___ the table.", listOf("in", "on", "at", "from"), 1),
                QuizQuestion("Complete: ___ there a park near here?", listOf("Are", "Is", "Have", "Has"), 1),
                QuizQuestion("What does 'feel at home' mean?", listOf("دلتنگی", "احساس راحتی کردن", "خانه خریدن", "اسباب‌کشی"), 1),
                QuizQuestion("Complete: I live in ___ apartment.", listOf("a", "an", "the", "-"), 1),
                QuizQuestion("Complete: There ___ a sofa in the room.", listOf("are", "is", "have", "has"), 1),
                QuizQuestion("Choose correct:", listOf("There have two chairs.", "There is two chairs.", "There are two chairs.", "There be two chairs."), 2),
                QuizQuestion("Complete: The cat is ___ the bed.", listOf("on", "in", "of", "from"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 6 — Food and Drink
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Food and Drink",
            titlePersian = "غذا و نوشیدنی",
            objectives = listOf(
                "Name common foods and drinks",
                "Use countable and uncountable nouns",
                "Order food at a restaurant",
                "Use some / any",
                "Talk about likes and dislikes"
            ),
            vocabulary = listOf(
                VocabWord("food", "غذا", "/fuːd/", "noun", "I love Italian food.", "من عاشق غذای ایتالیایی‌ام."),
                VocabWord("water", "آب", "/ˈwɔːtər/", "noun", "Can I have some water?", "می‌تونم کمی آب داشته باشم؟"),
                VocabWord("bread", "نان", "/bred/", "noun", "We need some bread.", "ما کمی نان لازم داریم."),
                VocabWord("rice", "برنج", "/raɪs/", "noun", "I eat rice every day.", "من هر روز برنج می‌خورم."),
                VocabWord("meat", "گوشت", "/miːt/", "noun", "She doesn't eat meat.", "او گوشت نمی‌خوره."),
                VocabWord("fish", "ماهی", "/fɪʃ/", "noun", "We had fish for dinner.", "شام ماهی خوردیم."),
                VocabWord("fruit", "میوه", "/fruːt/", "noun", "Eat more fruit!", "میوه بیشتر بخور!"),
                VocabWord("vegetable", "سبزیجات", "/ˈvedʒtəbəl/", "noun", "I like green vegetables.", "من سبزیجات سبز دوست دارم."),
                VocabWord("coffee", "قهوه", "/ˈkɔːfi/", "noun", "I drink coffee every morning.", "هر صبح قهوه می‌خورم."),
                VocabWord("tea", "چای", "/tiː/", "noun", "Would you like some tea?", "چای میل دارید؟"),
                VocabWord("menu", "منو", "/ˈmenjuː/", "noun", "Can I see the menu?", "می‌تونم منو رو ببینم؟"),
                VocabWord("order", "سفارش دادن", "/ˈɔːrdər/", "verb", "Are you ready to order?", "آماده سفارش دادن هستید؟")
            ),
            idioms = listOf(
                IdiomExpression("piece of cake", "خیلی راحت", "The test was a piece of cake!", "امتحان خیلی راحت بود!", "informal"),
                IdiomExpression("eat out", "بیرون غذا خوردن", "We eat out every Friday.", "هر جمعه بیرون غذا می‌خوریم.", "neutral"),
                IdiomExpression("have a sweet tooth", "شیرینی‌دوست بودن", "She has a sweet tooth.", "او شیرینی‌دوست است.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th sound", "در کلماتی مثل thank و three، th صدای /θ/ دارد."),
                PronunciationTip("Silent letters", "در vegetable، حرف دوم e تلفظ نمی‌شود: /ˈvedʒtəbəl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Eating out", "در غرب، بیرون غذا خوردن بسیار رایج است؛ از رستوران‌های ارزان تا گران."),
                CulturalNote("Tipping", "در آمریکا، انعام ۱۵-۲۰٪ رایج است.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "Countable vs uncountable",
                    content = """
                        قابل شمارش: apple, egg, sandwich
                        غیرقابل شمارش: water, rice, bread, money

                        a / an + قابل شمارش مفرد:
                        an apple

                        some + غیرقابل شمارش یا جمع:
                        some water, some apples
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "some / any",
                    content = """
                        some → در جملات مثبت:
                        I have some bread.

                        any → در جملات منفی و سوال:
                        I don't have any milk.
                        Do you have any sugar?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Ordering food",
                    content = """
                        I'd like... please.
                        Can I have...?
                        I'll have...

                        I'd like a coffee, please.
                        Can I have the bill, please?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "How much / How many",
                    content = """
                        How much + غیرقابل شمارش:
                        How much water?

                        How many + قابل شمارش جمع:
                        How many apples?
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("I have some milks.", "I have some milk.", "milk غیرقابل شمارش است."),
                CommonMistake("I'd like a water.", "I'd like some water.", "water غیرقابل شمارش است."),
                CommonMistake("I have any bread.", "I have some bread.", "در جملات مثبت از some استفاده می‌کنیم."),
                CommonMistake("How many water?", "How much water?", "water غیرقابل شمارش است.")
            ),
            conversation = listOf(
                DialogueLine("Waiter", "Good evening. Are you ready to order?", "عصر بخیر. آماده سفارش هستید؟"),
                DialogueLine("Customer", "Yes, I'd like a chicken sandwich, please.", "بله، یه ساندویچ مرغ می‌خوام، لطفاً."),
                DialogueLine("Waiter", "Would you like anything to drink?", "نوشیدنی چیزی میل دارید؟"),
                DialogueLine("Customer", "Yes, some water, please. And a coffee after.", "بله، کمی آب، لطفاً. و بعدش یه قهوه."),
                DialogueLine("Waiter", "Anything else?", "چیز دیگه‌ای؟"),
                DialogueLine("Customer", "No, thanks. That's all.", "نه، ممنون. همین."),
                DialogueLine("Waiter", "Great. Your food will be ready soon.", "عالی. غذاتون به‌زودی آماده می‌شه."),
                DialogueLine("Customer", "Thank you. Could I have the bill after?", "ممنون. می‌تونم بعدش صورت‌حساب بگیرم؟"),
                DialogueLine("Waiter", "Of course. Cash or card?", "البته. نقد یا کارت؟"),
                DialogueLine("Customer", "Card, please.", "کارت، لطفاً."),
                DialogueLine("Waiter", "Here's your bill. Have a nice meal!", "اینم صورت‌حساب. غذای خوبی داشته باشید!"),
                DialogueLine("Customer", "Thanks. Do you have dessert?", "ممنون. دسر دارید؟"),
                DialogueLine("Waiter", "Yes, we have cake and ice cream.", "بله، کیک و بستنی داریم."),
                DialogueLine("Customer", "I'll have some chocolate cake.", "یه کم کیک شکلاتی می‌خورم."),
                DialogueLine("Waiter", "Excellent choice. Anything else?", "انتخاب عالی. چیز دیگه‌ای؟"),
                DialogueLine("Customer", "No, that's everything. Thanks!", "نه، همین. ممنون!"),
                DialogueLine("Waiter", "Enjoy your meal!", "از غذاتون لذت ببرید!"),
                DialogueLine("Customer", "Thanks, I will!", "ممنون، لذت می‌برم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("مشتری چه غذایی سفارش داد؟", "ساندویچ مرغ."),
                ComprehensionQuestion("چه نوشیدنی سفارش داد؟", "آب و بعدش قهوه."),
                ComprehensionQuestion("چطور پرداخت کرد؟", "با کارت."),
                ComprehensionQuestion("چه دسری سفارش داد؟", "کیک شکلاتی."),
                ComprehensionQuestion("گارسون چطور پاسخ داد؟", "با احترام و مؤدبانه.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Order food at a restaurant.", "نقش‌بازی: در رستوران غذا سفارش بده.", "I'd like... / Can I have...?"),
                SpeakingTask("Talk about your favorite food.", "درباره غذای مورد علاقه‌ات صحبت کن.", "I love... / My favorite is..."),
                SpeakingTask("Describe a typical meal.", "یه وعده غذایی معمولی رو توصیف کن.", "For breakfast I have...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite meal.", "درباره غذای مورد علاقه‌ات بنویس.", 100, "Describe the food, when you eat it, why you like it.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I'd like ___ water.", listOf("a", "an", "some", "many"), 2),
                QuizQuestion("Complete: Do you have ___ bread?", listOf("some", "any", "a", "many"), 1),
                QuizQuestion("Complete: How ___ water?", listOf("many", "much", "some", "any"), 1),
                QuizQuestion("Complete: I have ___ apple.", listOf("a", "an", "some", "any"), 1),
                QuizQuestion("What does 'have a sweet tooth' mean?", listOf("دندان شیرین", "شیرینی‌دوست", "دندان‌درد", "قند خون"), 1),
                QuizQuestion("Complete: I'd like ___ coffee, please.", listOf("a", "an", "some", "any"), 0),
                QuizQuestion("Complete: ___ you like some tea?", listOf("Do", "Does", "Would", "Are"), 2),
                QuizQuestion("Complete: She ___ eat meat.", listOf("don't", "doesn't", "isn't", "aren't"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 7 — Shopping
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Shopping",
            titlePersian = "خرید",
            objectives = listOf(
                "Ask about prices",
                "Use this/that/these/those",
                "Talk about clothes and colors",
                "Use the present continuous",
                "Talk about what you're wearing"
            ),
            vocabulary = listOf(
                VocabWord("shop", "مغازه", "/ʃɑːp/", "noun", "The shop is open.", "مغازه بازه."),
                VocabWord("price", "قیمت", "/praɪs/", "noun", "What's the price?", "قیمتش چنده؟"),
                VocabWord("cheap", "ارزان", "/tʃiːp/", "adjective", "This shirt is cheap.", "این پیراهن ارزونه."),
                VocabWord("expensive", "گران", "/ɪkˈspensɪv/", "adjective", "That's too expensive.", "اون خیلی گرونه."),
                VocabWord("clothes", "لباس", "/kloʊðz/", "noun", "I need new clothes.", "من لباس جدید لازم دارم."),
                VocabWord("shirt", "پیراهن", "/ʃɜːrt/", "noun", "This shirt is nice.", "این پیراهن قشنگه."),
                VocabWord("shoes", "کفش", "/ʃuːz/", "noun", "These shoes are new.", "این کفش‌ها نو هستن."),
                VocabWord("dress", "لباس زنانه", "/dres/", "noun", "She bought a red dress.", "او یه لباس قرمز خرید."),
                VocabWord("color", "رنگ", "/ˈkʌlər/", "noun", "What color is it?", "چه رنگیه؟"),
                VocabWord("size", "سایز", "/saɪz/", "noun", "What size are you?", "چه سایزی هستی؟"),
                VocabWord("buy", "خریدن", "/baɪ/", "verb", "I want to buy this.", "می‌خوام اینو بخرم."),
                VocabWord("pay", "پرداخت کردن", "/peɪ/", "verb", "How much did you pay?", "چقدر پرداخت کردی؟")
            ),
            idioms = listOf(
                IdiomExpression("on sale", "حراج", "The shoes are on sale.", "کفش‌ها حراج هستن.", "neutral"),
                IdiomExpression("window shopping", "ویترین‌گردی", "We went window shopping.", "رفتیم ویترین‌گردی.", "informal"),
                IdiomExpression("cost an arm and a leg", "خیلی گران بودن", "That bag cost an arm and a leg.", "اون کیف خیلی گرون بود.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("this / that", "this /ðɪs/، that /ðæt/ — حرف th در هر دو صدای /ð/ دارد."),
                PronunciationTip("clothes", "clothes /kloʊðz/ — th صدادار است، ولی در گفتار سریع گاهی ساده‌تر می‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Shopping in the West", "در غرب، خرید در مال‌ها و فروشگاه‌های بزرگ رایج است؛ جمعه‌ها و شنبه‌ها شلوغ‌ترند."),
                CulturalNote("Black Friday", "در آمریکا، Black Friday (جمعه بعد از Thanksgiving) بزرگ‌ترین روز تخفیف سال است.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "this / that / these / those",
                    content = """
                        این (نزدیک): this / these
                        آن (دور): that / those

                        this shirt      these shirts
                        that shirt      those shirts

                        What's this? — It's a phone.
                        What are these? — They're books.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present continuous",
                    content = """
                        am/is/are + verb-ing

                        I'm wearing a blue shirt.
                        She's buying shoes.
                        They're looking at clothes.

                        برای کار در حال انجام استفاده می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "How much is/are...?",
                    content = """
                        How much is + مفرد؟
                        How much are + جمع؟

                        How much is this shirt?
                        How much are these shoes?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Colors as adjectives",
                    content = """
                        color + noun:
                        a red car
                        a blue shirt
                        black shoes

                        What color is it? — It's red.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("How much are this shirt?", "How much is this shirt?", "برای مفرد از is استفاده می‌کنیم."),
                CommonMistake("This shoes are nice.", "These shoes are nice.", "برای جمع از these استفاده می‌کنیم."),
                CommonMistake("I'm wear a red shirt.", "I'm wearing a red shirt.", "برای Present continuous از verb-ing استفاده می‌کنیم."),
                CommonMistake("a shirt red", "a red shirt", "ترتیب صفت + اسم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Excuse me, how much is this shirt?", "ببخشید، این پیراهن چنده؟"),
                DialogueLine("B", "It's 25 dollars.", "۲۵ دلاره."),
                DialogueLine("A", "And these shoes?", "و این کفش‌ها؟"),
                DialogueLine("B", "Those are 40 dollars.", "اون‌ها ۴۰ دلارن."),
                DialogueLine("A", "That's a bit expensive. Do you have anything cheaper?", "یه کم گرونه. چیز ارزون‌تری دارید؟"),
                DialogueLine("B", "Yes, these are on sale for 30 dollars.", "بله، اینا ۳۰ دلار حراج هستن."),
                DialogueLine("A", "That's better. What sizes do you have?", "این بهتره. چه سایزهایی دارید؟"),
                DialogueLine("B", "We have small, medium, and large.", "اسمال، مدیوم و لارج داریم."),
                DialogueLine("A", "I'll take the medium. Can I try them on?", "مدیوم می‌خوام. می‌تونم امتحانشون کنم؟"),
                DialogueLine("B", "Of course. The fitting room is over there.", "البته. اتاق پرو اونجاست."),
                DialogueLine("A", "Thanks. (comes back) They fit well. I'll take them.", "ممنون. (برمی‌گردد) اندازه هستن. اینا رو می‌خرم."),
                DialogueLine("B", "Great! Cash or card?", "عالی! نقد یا کارت؟"),
                DialogueLine("A", "Card, please. And could I have a bag?", "کارت، لطفاً. و می‌تونم یه کیسه بگیرم؟"),
                DialogueLine("B", "Of course. Here you go.", "البته. بفرمایید."),
                DialogueLine("A", "Thank you. Do you have a return policy?", "ممنون. سیاست بازگشت دارید؟"),
                DialogueLine("B", "Yes, 30 days with the receipt.", "بله، ۳۰ روز با رسید."),
                DialogueLine("A", "Perfect. Thanks for your help!", "عالی. ممنون از کمکتون!"),
                DialogueLine("B", "You're welcome. Have a nice day!", "خواهش می‌کنم. روز خوبی داشته باشید!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("پیراهن چقدر بود؟", "۲۵ دلار."),
                ComprehensionQuestion("کفش‌های حراج چقدر بودند؟", "۳۰ دلار (قبلاً ۴۰ دلار)."),
                ComprehensionQuestion("مشتری چه سایزی خرید؟", "مدیوم."),
                ComprehensionQuestion("مشتری چطور پرداخت کرد؟", "با کارت."),
                ComprehensionQuestion("سیاست بازگشت چقدر است؟", "۳۰ روز با رسید.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Role-play shopping for clothes.", "نقش‌بازی: خرید لباس.", "How much is...? / Can I try...?"),
                SpeakingTask("Describe what you're wearing today.", "توصیف کن امروز چی پوشیدی.", "I'm wearing..."),
                SpeakingTask("Talk about your favorite clothes.", "درباره لباس‌های مورد علاقه‌ات صحبت کن.", "My favorite is...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your favorite clothes.", "لباس‌های مورد علاقه‌ات رو توصیف کن.", 100, "Use colors, sizes, materials.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: How much ___ these shoes?", listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: ___ shirt is nice.", listOf("This", "These", "Those", "Them"), 0),
                QuizQuestion("Complete: I'm ___ a blue shirt.", listOf("wear", "wears", "wearing", "wore"), 2),
                QuizQuestion("What does 'cost an arm and a leg' mean?", listOf("ارزون", "گرون", "متوسط", "رایگان"), 1),
                QuizQuestion("Complete: What color ___ it?", listOf("is", "are", "have", "has"), 0),
                QuizQuestion("Complete: ___ shoes are new.", listOf("This", "That", "These", "Them"), 2),
                QuizQuestion("Complete: I want to ___ this shirt.", listOf("buy", "buys", "buying", "bought"), 0),
                QuizQuestion("Complete: ___ are those?", listOf("What", "How", "Where", "Who"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 8 — Past Events
    // ═══════════════════════════════════════════════════════════
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Past Events",
            titlePersian = "رویدادهای گذشته",
            objectives = listOf(
                "Talk about the past",
                "Use was / were",
                "Use the simple past regular and irregular",
                "Ask questions with did",
                "Tell a simple story"
            ),
            vocabulary = listOf(
                VocabWord("yesterday", "دیروز", "/ˈjestərdeɪ/", "adverb", "I saw her yesterday.", "دیروز دیدمش."),
                VocabWord("last night", "دیشب", "/læst naɪt/", "phrase", "I watched a movie last night.", "دیشب یه فیلم دیدم."),
                VocabWord("ago", "پیش", "/əˈɡoʊ/", "adverb", "Two days ago.", "دو روز پیش."),
                VocabWord("weekend", "آخر هفته", "/ˈwiːkend/", "noun", "Last weekend was great.", "آخر هفته پیش عالی بود."),
                VocabWord("went", "رفت (گذشته go)", "/went/", "verb", "We went to the park.", "رفتیم پارک."),
                VocabWord("saw", "دید (گذشته see)", "/sɔː/", "verb", "I saw a film.", "من یه فیلم دیدم."),
                VocabWord("ate", "خورد (گذشته eat)", "/eɪt/", "verb", "We ate pizza.", "ما پیتزا خوردیم."),
                VocabWord("had", "داشت (گذشته have)", "/hæd/", "verb", "I had a great time.", "وقت خوبی داشتم."),
                VocabWord("came", "آمد (گذشته come)", "/keɪm/", "verb", "She came late.", "او دیر اومد."),
                VocabWord("bought", "خرید (گذشته buy)", "/bɔːt/", "verb", "I bought a book.", "یه کتاب خریدم."),
                VocabWord("felt", "احساس کرد (گذشته feel)", "/felt/", "verb", "I felt happy.", "احساس خوشحالی کردم."),
                VocabWord("thought", "فکر کرد (گذشته think)", "/θɔːt/", "verb", "I thought about you.", "بهت فکر کردم.")
            ),
            idioms = listOf(
                IdiomExpression("the day before yesterday", "پریروز", "We met the day before yesterday.", "پریروز همدیگه رو دیدیم.", "neutral"),
                IdiomExpression("once upon a time", "یکی بود یکی نبود", "Once upon a time, there was a king.", "یکی بود یکی نبود، یه پادشاهی بود.", "idiom"),
                IdiomExpression("long time ago", "خیلی وقت پیش", "That happened a long time ago.", "اون خیلی وقت پیش اتفاق افتاد.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ed endings", "در افعال با قاعده، -ed به سه صورت تلفظ می‌شود: /t/ (liked)، /d/ (lived)، /ɪd/ (wanted)."),
                PronunciationTip("irregular verbs", "افعال بی‌قاعده را باید حفظ کرد: go → went، see → saw، eat → ate.")
            ),
            culturalNotes = listOf(
                CulturalNote("Telling stories", "در غرب، تعریف داستان‌های شخصی بخش مهمی از ارتباط اجتماعی است."),
                CulturalNote("Photo sharing", "مردم اغلب عکس‌های گذشته را در شبکه‌های اجتماعی به اشتراک می‌گذارند.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "was / were",
                    content = """
                        I/He/She/It + was
                        You/We/They + were

                        I was at home.
                        They were happy.
                        She wasn't tired.
                        Were you at school?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Simple past",
                    content = """
                        با قاعده: verb + ed
                        work → worked
                        play → played
                        watch → watched

                        بی‌قاعده:
                        go → went
                        see → saw
                        eat → ate
                        have → had
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Questions with did",
                    content = """
                        Did + subject + verb?

                        Did you go to the party?
                        Yes, I did. / No, I didn't.

                        Where did you go?
                        What did you do?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Negative with didn't",
                    content = """
                        Subject + didn't + verb

                        I didn't go.
                        She didn't eat.
                        They didn't come.

                        توجه: بعد از didn't فعل به شکل ساده می‌آید.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده می‌آید."),
                CommonMistake("Did you went?", "Did you go?", "بعد از did فعل ساده می‌آید."),
                CommonMistake("I was go to school.", "I went to school.", "برای گذشته از فعل گذشته استفاده می‌کنیم."),
                CommonMistake("She were at home.", "She was at home.", "با she از was استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("A", "How was your weekend?", "آخر هفته‌ات چطور بود؟"),
                DialogueLine("B", "It was great! I went to the mountains with friends.", "عالی بود! با دوستام رفتیم کوه."),
                DialogueLine("A", "Sounds fun. What did you do there?", "خوش به نظر می‌رسه. اونجا چیکار کردید؟"),
                DialogueLine("B", "We hiked, took photos, and had a picnic.", "کوه‌نوردی کردیم، عکس گرفتیم و پیک‌نیک داشتیم."),
                DialogueLine("A", "Did you see any animals?", "حیوونی دیدید؟"),
                DialogueLine("B", "Yes, we saw some birds and a fox!", "بله، چند تا پرنده و یه روباه دیدیم!"),
                DialogueLine("A", "Wow, cool! What did you eat?", "واو، باحال! چی خوردید؟"),
                DialogueLine("B", "We ate sandwiches and fruit. It was simple but nice.", "ساندویچ و میوه خوردیم. ساده بود ولی خوب."),
                DialogueLine("A", "Did you stay overnight?", "شب موندید؟"),
                DialogueLine("B", "No, we came back in the evening. What about you?", "نه، عصر برگشتیم. تو چطور؟"),
                DialogueLine("A", "I stayed home. I wasn't feeling well.", "من خونه موندم. حالم خوب نبود."),
                DialogueLine("B", "Oh, I'm sorry to hear that. Are you better now?", "اوه، متأسفم. الان بهتری؟"),
                DialogueLine("A", "Yes, thanks. I rested all weekend.", "بله، ممنون. تمام آخر هفته استراحت کردم."),
                DialogueLine("B", "Good. Do you have plans for next weekend?", "خوبه. برای آخر هفته بعد برنامه‌ای داری؟"),
                DialogueLine("A", "I might go shopping. I need new clothes.", "شاید برم خرید. لباس جدید لازم دارم."),
                DialogueLine("B", "Nice. Where did you buy your last clothes?", "خوبه. آخرین بار لباسات رو از کجا خریدی؟"),
                DialogueLine("A", "From a shop downtown. They had a sale.", "از یه مغازه مرکز شهر. حراج داشتن."),
                DialogueLine("B", "Sounds great. Maybe I'll come too.", "خوبه. شاید منم بیام."),
                DialogueLine("A", "Sure! The more the merrier.", "حتماً! هر چی بیشتر بهتر.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B آخر هفته کجا رفت؟", "به کوه با دوستانش."),
                ComprehensionQuestion("B چه کارهایی انجام داد؟", "کوه‌نوردی، عکس‌گرفتن و پیک‌نیک."),
                ComprehensionQuestion("A آخر هفته چیکار کرد؟", "خونه موند چون حالش خوب نبود."),
                ComprehensionQuestion("B چه حیواناتی دید؟", "چند پرنده و یک روباه."),
                ComprehensionQuestion("A برای آخر هفته بعد چه برنامه‌ای دارد؟", "شاید برود خرید لباس.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your last weekend.", "درباره آخر هفته گذشته‌ات صحبت کن.", "I went... / I saw... / I had..."),
                SpeakingTask("Tell a story about a trip.", "داستانی از یک سفر تعریف کن.", "Last year I went..."),
                SpeakingTask("Ask a friend about their past week.", "از یک دوست درباره هفته گذشته‌اش بپرس.", "Did you...? / What did you...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about your last weekend.", "درباره آخر هفته گذشته‌ات بنویس.", 100, "Use past simple and time expressions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ to the park yesterday.", listOf("go", "went", "goes", "going"), 1),
                QuizQuestion("Complete: She ___ at home last night.", listOf("were", "was", "is", "are"), 1),
                QuizQuestion("Complete: ___ you see the movie?", listOf("Do", "Does", "Did", "Are"), 2),
                QuizQuestion("Complete: We ___ eat pizza.", listOf("didn't", "don't", "doesn't", "aren't"), 0),
                QuizQuestion("What does 'once upon a time' mean?", listOf("دیروز", "یکی بود یکی نبود", "آخر هفته", "حالا"), 1),
                QuizQuestion("Complete: I ___ a great time.", listOf("have", "has", "had", "having"), 2),
                QuizQuestion("Complete: They ___ to school yesterday.", listOf("go", "went", "goes", "going"), 1),
                QuizQuestion("Complete: Where ___ you go last night?", listOf("do", "does", "did", "are"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 9 — Future Plans
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Future Plans",
            titlePersian = "برنامه‌های آینده",
            objectives = listOf(
                "Talk about future plans",
                "Use going to",
                "Use will for predictions",
                "Make arrangements",
                "Talk about dreams and goals"
            ),
            vocabulary = listOf(
                VocabWord("tomorrow", "فردا", "/təˈmɑːroʊ/", "adverb", "See you tomorrow!", "فردا می‌بینمت!"),
                VocabWord("next week", "هفته بعد", "/nekst wiːk/", "phrase", "I'll travel next week.", "هفته بعد سفر می‌کنم."),
                VocabWord("soon", "به‌زودی", "/suːn/", "adverb", "I'll see you soon.", "به‌زودی می‌بینمت."),
                VocabWord("plan", "برنامه", "/plæn/", "noun", "What's your plan?", "برنامه‌ات چیه؟"),
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb", "I'm going to travel.", "می‌خوام سفر کنم."),
                VocabWord("visit", "دیدن کردن", "/ˈvɪzɪt/", "verb", "I'll visit my family.", "خانواده‌ام رو می‌بینم."),
                VocabWord("meet", "ملاقات کردن", "/miːt/", "verb", "I'm going to meet friends.", "می‌خوام دوستام رو ببینم."),
                VocabWord("start", "شروع کردن", "/stɑːrt/", "verb", "I'll start a new job.", "یه شغل جدید شروع می‌کنم."),
                VocabWord("learn", "یاد گرفتن", "/lɜːrn/", "verb", "I'm going to learn English.", "می‌خوام انگلیسی یاد بگیرم."),
                VocabWord("dream", "رویا", "/driːm/", "noun", "Follow your dreams!", "رویاهایت را دنبال کن!"),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun", "My goal is to travel.", "هدفم سفر کردنه."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun", "It's a great opportunity.", "فرصت عالیه.")
            ),
            idioms = listOf(
                IdiomExpression("look forward to", "بی‌صبرانه منتظر بودن", "I'm looking forward to the trip.", "بی‌صبرانه منتظر سفرم.", "neutral"),
                IdiomExpression("cross that bridge when we come to it", "بعداً تصمیم می‌گیریم", "Let's cross that bridge when we come to it.", "بعداً تصمیم می‌گیریم.", "idiom"),
                IdiomExpression("on the horizon", "در پیش رو", "Big changes are on the horizon.", "تغییرات بزرگی در پیشه.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("going to → gonna", "در مکالمه سریع، going to به gonna تبدیل می‌شود."),
                PronunciationTip("will contraction", "I'll /aɪl/, you'll /juːl/, we'll /wiːl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("New Year's resolutions", "در غرب، مردم در ابتدای سال اهداف و برنامه‌های جدید تعیین می‌کنند."),
                CulturalNote("Bucket list", "لیست کارهایی که می‌خواهید در زندگی انجام دهید.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "going to",
                    content = """
                        am/is/are + going to + verb

                        I'm going to travel to Japan.
                        She's going to start a new job.
                        We're going to learn French.

                        منفی: isn't / aren't / 'm not going to
                        سوال: Are you going to...?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "will",
                    content = """
                        will + verb

                        برای تصمیم لحظه‌ای و پیش‌بینی:
                        I'll help you.
                        It will rain tomorrow.

                        منفی: won't
                        سوال: Will you...?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present continuous for future",
                    content = """
                        برای قرارهای قطعی:
                        I'm meeting Ali tomorrow at 5.
                        She's flying to Paris on Monday.

                        am/is/are + verb-ing
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Time expressions",
                    content = """
                        tomorrow
                        next week / next month / next year
                        this evening / this weekend
                        soon
                        in two days

                        I'll see you next week.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("I will to travel.", "I will travel.", "بعد از will فعل ساده می‌آید."),
                CommonMistake("I'm go to travel.", "I'm going to travel.", "شکل درست going to است."),
                CommonMistake("She will travels.", "She will travel.", "بعد از will فعل ساده می‌آید."),
                CommonMistake("I'm going to meet Ali tomorrow at 5.", "I'm meeting Ali tomorrow at 5.", "برای قرار قطعی از present continuous استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you have any plans for the summer?", "برای تابستون برنامه‌ای داری؟"),
                DialogueLine("B", "Yes! I'm going to travel to Turkey.", "بله! می‌خوام برم ترکیه."),
                DialogueLine("A", "That sounds amazing! How long will you stay?", "فوق‌العاده به نظر می‌رسه! چقدر می‌مونی؟"),
                DialogueLine("B", "About two weeks. I'll visit Istanbul and Antalya.", "حدود دو هفته. استانبول و آنتالیا رو می‌بینم."),
                DialogueLine("A", "Have you booked your tickets yet?", "بلیط‌ها رو رزرو کردی؟"),
                DialogueLine("B", "Not yet. I'm going to book them next week.", "هنوز نه. می‌خوام هفته بعد رزرو کنم."),
                DialogueLine("A", "Who are you going with?", "با کی می‌ری؟"),
                DialogueLine("B", "With my brother. He's never been abroad.", "با برادرم. او هرگز خارج نبوده."),
                DialogueLine("A", "That's exciting. Will you stay in hotels?", "هیجان‌انگیزه. در هتل می‌مونید؟"),
                DialogueLine("B", "Yes, but we might try Airbnb for a few nights.", "بله، ولی ممکنه چند شب Airbnb امتحان کنیم."),
                DialogueLine("A", "Nice. What will you do there?", "خوبه. اونجا چیکار می‌کنید؟"),
                DialogueLine("B", "We'll visit historical sites, try local food, and relax on the beach.", "از جاهای تاریخی بازدید می‌کنیم، غذای محلی امتحان می‌کنیم و در ساحل استراحت می‌کنیم."),
                DialogueLine("A", "Sounds perfect. What about you — any plans?", "بی‌نقص به نظر می‌رسه. تو چطور — برنامه‌ای داری؟"),
                DialogueLine("B", "Actually, I'm going to start a new job.", "در واقع، می‌خوام یه شغل جدید شروع کنم."),
                DialogueLine("A", "Wow, big change! When do you start?", "واو، تغییر بزرگیه! کِی شروع می‌کنی؟"),
                DialogueLine("B", "Next month. I'm a little nervous but excited.", "ماه بعد. کمی مضطربم ولی هیجان‌زده."),
                DialogueLine("A", "You'll do great! Good luck!", "عالی عمل می‌کنی! موفق باشی!"),
                DialogueLine("B", "Thanks! Let's catch up after my trip.", "ممنون! بعد از سفرم با هم حرف می‌زنیم."),
                DialogueLine("A", "Sounds like a plan. Have a great trip!", "به نظر برنامه خوبیه. سفر خوبی داشته باشی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B برای تابستان چه برنامه‌ای دارد؟", "به ترکیه سفر می‌کند."),
                ComprehensionQuestion("B با کی سفر می‌کند؟", "با برادرش."),
                ComprehensionQuestion("بلیط‌ها را رزرو کرده؟", "نه، قصد دارد هفته بعد رزرو کند."),
                ComprehensionQuestion("A چه برنامه‌ای دارد؟", "شروع یک شغل جدید در ماه بعد."),
                ComprehensionQuestion("B چه کارهایی در ترکیه انجام می‌دهد؟", "بازدید تاریخی، غذاهای محلی، استراحت در ساحل.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your summer plans.", "درباره برنامه‌های تابستانی‌ات صحبت کن.", "I'm going to... / I'll..."),
                SpeakingTask("Describe your dream trip.", "سفر رویایی‌ات رو توصیف کن.", "I'd like to go..."),
                SpeakingTask("Make plans with a friend.", "با یک دوست برنامه بذار.", "Are you free...? / Let's...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your future plans.", "درباره برنامه‌های آینده‌ات بنویس.", 120, "Use going to and will.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ going to travel.", listOf("is", "am", "are", "be"), 1),
                QuizQuestion("Complete: She ___ help you.", listOf("will", "wills", "is will", "to will"), 0),
                QuizQuestion("Complete: I'm ___ Ali tomorrow.", listOf("meet", "meeting", "meets", "met"), 1),
                QuizQuestion("What does 'look forward to' mean?", listOf("منتظر بودن", "ترسیدن", "فراموش کردن", "لغو کردن"), 0),
                QuizQuestion("Complete: They ___ going to visit us.", listOf("is", "am", "are", "be"), 2),
                QuizQuestion("Complete: I ___ call you tonight.", listOf("will", "wills", "am will", "to will"), 0),
                QuizQuestion("Complete: What ___ you do tomorrow?", listOf("are", "will", "is", "do"), 1),
                QuizQuestion("Complete: She ___ travel next week.", listOf("going to", "is going to", "are going to", "will to"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 10 — Health
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Health",
            titlePersian = "سلامتی",
            objectives = listOf(
                "Talk about health and illness",
                "Name parts of the body",
                "Use should/shouldn't for advice",
                "Make an appointment with a doctor",
                "Give advice about health"
            ),
            vocabulary = listOf(
                VocabWord("head", "سر", "/hed/", "noun", "My head hurts.", "سرم درد می‌کنه."),
                VocabWord("stomach", "شکم", "/ˈstʌmək/", "noun", "I have a stomachache.", "دل‌درد دارم."),
                VocabWord("arm", "بازو", "/ɑːrm/", "noun", "My arm hurts.", "بازوم درد می‌کنه."),
                VocabWord("leg", "پا", "/leɡ/", "noun", "I broke my leg.", "پام شکست."),
                VocabWord("back", "پشت", "/bæk/", "noun", "I have back pain.", "کمرم درد می‌کنه."),
                VocabWord("fever", "تب", "/ˈfiːvər/", "noun", "She has a fever.", "او تب داره."),
                VocabWord("headache", "سردرد", "/ˈhedeɪk/", "noun", "I have a headache.", "سردرد دارم."),
                VocabWord("cold", "سرماخوردگی", "/koʊld/", "noun", "I have a cold.", "سرماخورده‌ام."),
                VocabWord("flu", "آنفلوانزا", "/fluː/", "noun", "He has the flu.", "او آنفلوانزا داره."),
                VocabWord("medicine", "دارو", "/ˈmedɪsɪn/", "noun", "Take this medicine.", "این دارو رو بخور."),
                VocabWord("doctor", "دکتر", "/ˈdɑːktər/", "noun", "You should see a doctor.", "باید دکتر بری."),
                VocabWord("hospital", "بیمارستان", "/ˈhɑːspɪtəl/", "noun", "She's in the hospital.", "او در بیمارستانه.")
            ),
            idioms = listOf(
                IdiomExpression("under the weather", "حالش خوب نبودن", "I'm feeling under the weather today.", "امروز حالم خوب نیست.", "informal"),
                IdiomExpression("as fit as a fiddle", "خیلی سالم", "My grandfather is as fit as a fiddle.", "پدربزرگم خیلی سالمه.", "idiom"),
                IdiomExpression("take it easy", "سخت نگیر", "You should take it easy for a few days.", "باید چند روز سخت نگیری.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in health", "health /helθ/، healthy /ˈhelθi/ — صدای /θ/."),
                PronunciationTip("silent h in hour", "hour /ˈaʊər/ — h تلفظ نمی‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Health systems", "در غرب، بیمه درمانی مهم است. در برخی کشورها مثل کانادا و بریتانیا، سیستم دولتی است."),
                CulturalNote("Doctor visits", "در غرب، معمولاً اول به GP (پزشک عمومی) مراجعه می‌کنند.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "should / shouldn't",
                    content = """
                        برای توصیه:

                        You should rest.
                        You shouldn't eat too much sugar.

                        You should see a doctor.
                        He should drink more water.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "have + illness",
                    content = """
                        I have a headache.
                        She has a cold.
                        They have the flu.

                        برای درد:
                        My head hurts.
                        My back hurts.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Questions about health",
                    content = """
                        What's the matter?
                        What's wrong?
                        Are you OK?
                        Do you have a fever?

                        I don't feel well.
                        I feel sick.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Imperatives for advice",
                    content = """
                        Take this medicine.
                        Drink more water.
                        Get some rest.
                        Don't eat junk food.

                        (شکل ساده فعل بدون فاعل)
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("I have headache.", "I have a headache.", "قبل از headache از a استفاده می‌کنیم."),
                CommonMistake("You should to rest.", "You should rest.", "بعد از should فعل ساده می‌آید."),
                CommonMistake("My head is pain.", "My head hurts.", "برای درد از hurt استفاده می‌کنیم."),
                CommonMistake("I have cold.", "I have a cold.", "قبل از cold از a استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Hi Sara, you don't look well. Are you OK?", "سلام سارا، خوب به نظر نمی‌رسی. حالت خوبه؟"),
                DialogueLine("B", "Not really. I have a terrible headache and a fever.", "نه واقعاً. سردرد وحشتناک و تب دارم."),
                DialogueLine("A", "Oh no. How long have you felt like this?", "اوه نه. چقدره این‌طوری؟"),
                DialogueLine("B", "Since yesterday evening. I think I have the flu.", "از دیشب. فکر کنم آنفلوانزا گرفتم."),
                DialogueLine("A", "You should see a doctor.", "باید دکتر بری."),
                DialogueLine("B", "I know. Can you take me to the clinic?", "می‌دونم. می‌تونی منو ببری کلینیک؟"),
                DialogueLine("A", "Of course. Do you want to make an appointment first?", "البته. می‌خوای اول وقت بگیریم؟"),
                DialogueLine("B", "Yes, please. I can't wait for hours.", "بله، لطفاً. نمی‌تونم ساعت‌ها صبر کنم."),
                DialogueLine("A", "I'll call now. (calls) They can see you at 3 PM.", "الان زنگ می‌زنم. (زنگ می‌زند) می‌تونن ساعت ۳ ببیننت."),
                DialogueLine("B", "Great. I'll take some medicine now.", "عالی. الان یه دارو می‌خورم."),
                DialogueLine("A", "Have you eaten anything?", "چیزی خوردی؟"),
                DialogueLine("B", "Not much. I don't have an appetite.", "زیاد نه. اشتها ندارم."),
                DialogueLine("A", "Try to drink some water and eat a little soup.", "سعی کن کمی آب بخوری و یه کم سوپ بخوری."),
                DialogueLine("B", "OK, I'll try. Thanks for helping me.", "باشه، تلاش می‌کنم. ممنون که کمکم می‌کنی."),
                DialogueLine("A", "Anytime. After the doctor, I'll take you home.", "هر وقت. بعد از دکتر، می‌برمت خونه."),
                DialogueLine("B", "You're a lifesaver.", "نجات‌دهنده‌ای."),
                DialogueLine("A", "That's what friends are for. Let's go.", "دوست برای همین است. بیا بریم."),
                DialogueLine("B", "Thank you so much.", "خیلی ممنون.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Sara چه علائمی دارد؟", "سردرد شدید و تب."),
                ComprehensionQuestion("Sara چه بیماری‌ای فکر می‌کند دارد؟", "آنفلوانزا."),
                ComprehensionQuestion("قرار ملاقات چه ساعتی است؟", "ساعت ۳ بعدازظهر."),
                ComprehensionQuestion("دوستم چه توصیه‌ای کرد؟", "آب بخور و کمی سوپ بخور."),
                ComprehensionQuestion("دوستم بعد از دکتر چه می‌کند؟", "Sara را به خانه می‌برد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your symptoms to a doctor.", "علائم‌ت رو به دکتر بگو.", "I have... / My ... hurts."),
                SpeakingTask("Give advice to a sick friend.", "به یه دوست بیمار توصیه کن.", "You should... / You shouldn't..."),
                SpeakingTask("Talk about healthy habits.", "درباره عادت‌های سالم صحبت کن.", "I try to... / I usually...")
            ),
            writingTasks = listOf(
                WritingTask("Write about what you do to stay healthy.", "درباره کارهایی که برای سالم موندن انجام می‌دی بنویس.", 120, "Use should/shouldn't and health vocabulary.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: You ___ rest.", listOf("should", "should to", "shoulds", "shoulding"), 0),
                QuizQuestion("Complete: I have ___ headache.", listOf("a", "an", "the", "-"), 0),
                QuizQuestion("Complete: My back ___.", listOf("hurt", "hurts", "is hurt", "hurting"), 1),
                QuizQuestion("What does 'under the weather' mean?", listOf("زیر بارون", "حالش خوب نیست", "خوشحال", "سلامت"), 1),
                QuizQuestion("Complete: You should ___ more water.", listOf("drink", "drinks", "drinking", "drank"), 0),
                QuizQuestion("Complete: She ___ a cold.", listOf("have", "has", "haves", "having"), 1),
                QuizQuestion("Complete: You shouldn't ___ junk food.", listOf("eat", "eats", "eating", "ate"), 0),
                QuizQuestion("What does 'take it easy' mean?", listOf("سخت بگیر", "سخت نگیر", "سریع برو", "بخواب"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 11 — Travel
    // ═══════════════════════════════════════════════════════════
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Travel",
            titlePersian = "سفر",
            objectives = listOf(
                "Talk about travel and vacations",
                "Book a hotel and buy tickets",
                "Use present perfect with ever/never",
                "Talk about travel experiences",
                "Ask for and give directions"
            ),
            vocabulary = listOf(
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb", "I love traveling.", "عاشق سفرم."),
                VocabWord("trip", "سفر", "/trɪp/", "noun", "How was your trip?", "سفرت چطور بود؟"),
                VocabWord("ticket", "بلیط", "/ˈtɪkɪt/", "noun", "I bought a ticket.", "یه بلیط خریدم."),
                VocabWord("hotel", "هتل", "/hoʊˈtel/", "noun", "We stayed in a hotel.", "ما در هتل موندیم."),
                VocabWord("airport", "فرودگاه", "/ˈerpɔːrt/", "noun", "The airport is far.", "فرودگاه دوره."),
                VocabWord("passport", "پاسپورت", "/ˈpæspɔːrt/", "noun", "Don't forget your passport!", "پاسپورتت رو فراموش نکن!"),
                VocabWord("luggage", "چمدان", "/ˈlʌɡɪdʒ/", "noun", "My luggage is heavy.", "چمدانم سنگینه."),
                VocabWord("sightseeing", "بازدید از جاهای دیدنی", "/ˈsaɪtsiːɪŋ/", "noun", "We went sightseeing.", "رفتیم بازدید."),
                VocabWord("guide", "راهنما", "/ɡaɪd/", "noun", "The guide was helpful.", "راهنما کمک‌کننده بود."),
                VocabWord("reservation", "رزرو", "/ˌrezərˈveɪʃən/", "noun", "I have a reservation.", "رزرو دارم."),
                VocabWord("check in", "پذیرش", "/tʃek ɪn/", "phrase", "We checked in at 3.", "ساعت ۳ پذیرش گرفتیم."),
                VocabWord("abroad", "خارج", "/əˈbrɔːd/", "adverb", "She lives abroad.", "او در خارج زندگی می‌کنه.")
            ),
            idioms = listOf(
                IdiomExpression("catch a flight", "به پرواز رسیدن", "We need to catch a flight at 6.", "باید ساعت ۶ به پرواز برسیم.", "neutral"),
                IdiomExpression("hit the road", "راه افتادن", "Let's hit the road early.", "بیا زود راه بیفتیم.", "informal"),
                IdiomExpression("off the beaten track", "دور از مسیرهای معمول", "We visited a village off the beaten track.", "از یه دهکده دور از مسیرهای معمول بازدید کردیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("travel vs trip", "travel /ˈtrævəl/، trip /trɪp/ — trip کوتاه‌تره."),
                PronunciationTip("passport", "passport /ˈpæspɔːrt/ — استرس روی passport.")
            ),
            culturalNotes = listOf(
                CulturalNote("Travel tips", "در غرب، خرید بیمه سفر رایج است."),
                CulturalNote("Airport customs", "در فرودگاه‌های بین‌المللی، customs و immigration جدا هستند.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "Present perfect with ever/never",
                    content = """
                        Have/Has + subject + ever + past participle?

                        Have you ever been to Paris?
                        Yes, I have. / No, I haven't.

                        I've never been to Japan.

                        ever = تا حالا
                        never = هرگز
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Past simple vs present perfect",
                    content = """
                        Past simple: زمان مشخص
                        I went to Paris in 2020.

                        Present perfect: زمان نامشخص
                        I've been to Paris. (تجربه)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Booking a hotel",
                    content = """
                        I'd like to book a room.
                        Do you have any vacancies?
                        How much is it per night?
                        Is breakfast included?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Directions",
                    content = """
                        Go straight.
                        Turn left / right.
                        It's on the corner.
                        It's across from the bank.
                        It's next to the pharmacy.

                        How do I get to...?
                        Where is...?
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("I have been to Paris last year.", "I went to Paris last year.", "با زمان مشخص از past simple استفاده می‌کنیم."),
                CommonMistake("Have you ever go to Paris?", "Have you ever been to Paris?", "بعد از have از past participle استفاده می‌کنیم."),
                CommonMistake("I am going to travel the next week.", "I am going to travel next week.", "next week بدون the."),
                CommonMistake("How I get to the station?", "How do I get to the station?", "برای پرسیدن مسیر از do استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you ever been abroad?", "تا حالا خارج بودی؟"),
                DialogueLine("B", "Yes, I have. I've been to Turkey twice.", "بله. دو بار ترکیه بودم."),
                DialogueLine("A", "Nice! When did you go?", "خوبه! کی رفتی؟"),
                DialogueLine("B", "I went last summer with my family.", "تابستان گذشته با خانواده‌ام رفتم."),
                DialogueLine("A", "How was it?", "چطور بود؟"),
                DialogueLine("B", "Amazing. The food was delicious and the people were friendly.", "فوق‌العاده. غذا خوشمزه بود و مردم خوش‌برخورد."),
                DialogueLine("A", "Did you go sightseeing?", "بازدید از جاهای دیدنی کردی؟"),
                DialogueLine("B", "Yes, we visited the Blue Mosque and Topkapi Palace.", "بله، مسجد آبی و کاخ توپکاپی رو دیدیم."),
                DialogueLine("A", "Sounds great. Where did you stay?", "عالی. کجا موندی؟"),
                DialogueLine("B", "In a small hotel near the center. It was cozy.", "در یه هتل کوچیک نزدیک مرکز. دنج بود."),
                DialogueLine("A", "Have you ever traveled alone?", "تا حالا تنها سفر کردی؟"),
                DialogueLine("B", "No, I haven't. But I'd like to try one day.", "نه. ولی دوست دارم یه روز امتحان کنم."),
                DialogueLine("A", "It's fun but sometimes lonely.", "سرگرم‌کننده‌ست ولی گاهی تنهار.")
                DialogueLine("B", "That makes sense. What about you?", "منطقیه. تو چطور؟"),
                DialogueLine("A", "I've been to Italy and France.", "من ایتالیا و فرانسه بودم."),
                DialogueLine("B", "Wow, that's nice! Which did you prefer?", "واو، خوبه! کدوم رو ترجیح دادی؟"),
                DialogueLine("A", "Italy, I think. The art and history were incredible.", "ایتالیا، فکر کنم. هنر و تاریخش باورنکردنی بود."),
                DialogueLine("B", "I'd love to go there someday.", "دوست دارم یه روز برم اونجا."),
                DialogueLine("A", "You should! You'd love it.", "باید بری! عاشقش می‌شی.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند بار ترکیه بوده؟", "دو بار."),
                ComprehensionQuestion("B کجا اقامت داشته؟", "در یه هتل کوچیک نزدیک مرکز."),
                ComprehensionQuestion("B چه جاهایی رو دیده؟", "مسجد آبی و کاخ توپکاپی."),
                ComprehensionQuestion("A کجاها بوده؟", "ایتالیا و فرانسه."),
                ComprehensionQuestion("A کدوم کشور رو ترجیح داد؟", "ایتالیا.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your travel experiences.", "درباره تجربه‌های سفرت صحبت کن.", "I've been to... / I went to..."),
                SpeakingTask("Plan a trip with a partner.", "با یه دوست یه سفر برنامه‌ریزی کن.", "Where should we...? / Let's..."),
                SpeakingTask("Ask for directions.", "نقش‌بازی: مسیر بپرس.", "How do I get to...? / Where is...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable trip.", "درباره یه سفر به‌یادماندنی بنویس.", 150, "Use past simple and present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: Have you ever ___ to Paris?", listOf("go", "went", "been", "going"), 2),
                QuizQuestion("Complete: I ___ to Paris in 2020.", listOf("have been", "went", "go", "going"), 1),
                QuizQuestion("Complete: I've ___ been to Japan.", listOf("ever", "never", "already", "yet"), 1),
                QuizQuestion("What does 'hit the road' mean?", listOf("زمین خوردن", "راه افتادن", "برگشتن", "توقف"), 1),
                QuizQuestion("Complete: I'd like to ___ a room.", listOf("book", "books", "booking", "booked"), 0),
                QuizQuestion("Complete: Where ___ the station?", listOf("are", "is", "have", "has"), 1),
                QuizQuestion("Complete: Have you ever ___ abroad?", listOf("be", "being", "been", "was"), 2),
                QuizQuestion("Complete: I ___ a ticket yesterday.", listOf("buy", "bought", "buying", "buys"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 12 — Celebrations
    // ═══════════════════════════════════════════════════════════
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Celebrations",
            titlePersian = "جشن‌ها",
            objectives = listOf(
                "Talk about celebrations and traditions",
                "Use the future with will",
                "Talk about festivals",
                "Give and accept invitations",
                "Describe a celebration"
            ),
            vocabulary = listOf(
                VocabWord("celebration", "جشن", "/ˌselɪˈbreɪʃən/", "noun", "It was a big celebration.", "یه جشن بزرگ بود."),
                VocabWord("party", "مهمانی", "/ˈpɑːrti/", "noun", "We had a party.", "ما یه مهمونی داشتیم."),
                VocabWord("birthday", "تولد", "/ˈbɜːrθdeɪ/", "noun", "Happy birthday!", "تولدت مبارک!"),
                VocabWord("wedding", "عروسی", "/ˈwedɪŋ/", "noun", "Their wedding was beautiful.", "عروسیشون زیبا بود."),
                VocabWord("guest", "مهمان", "/ɡest/", "noun", "We had 50 guests.", "۵۰ مهمان داشتیم."),
                VocabWord("present", "هدیه", "/ˈprezənt/", "noun", "I got a nice present.", "یه هدیه خوب گرفتم."),
                VocabWord("decorate", "تزئین کردن", "/ˈdekəreɪt/", "verb", "We decorated the house.", "خونه رو تزئین کردیم."),
                VocabWord("invite", "دعوت کردن", "/ɪnˈvaɪt/", "verb", "I invited my friends.", "دوستام رو دعوت کردم."),
                VocabWord("celebrate", "جشن گرفتن", "/ˈselɪbreɪt/", "verb", "We celebrated together.", "با هم جشن گرفتیم."),
                VocabWord("tradition", "سنت", "/trəˈdɪʃən/", "noun", "It's a family tradition.", "این یه سنت خانوادگیه."),
                VocabWord("gift", "هدیه", "/ɡɪft/", "noun", "She gave me a gift.", "یه هدیه بهم داد."),
                VocabWord("candle", "شمع", "/ˈkændəl/", "noun", "Blow out the candles!", "شمع‌ها رو فوت کن!")
            ),
            idioms = listOf(
                IdiomExpression("throw a party", "مهمونی گرفتن", "We're throwing a party tonight.", "امشب مهمونی می‌گیریم.", "informal"),
                IdiomExpression("get together", "دور هم جمع شدن", "Let's get together for New Year.", "بیا برای سال نو دور هم جمع شیم.", "neutral"),
                IdiomExpression("break the ice", "یخ را شکستن", "Games help break the ice at parties.", "بازی‌ها به شکستن یخ در مهمونی کمک می‌کنند.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Happy birthday!", "Happy /ˈhæpi/، birthday /ˈbɜːrθdeɪ/ — استرس روی first syllable."),
                PronunciationTip("celebrate", "celebrate /ˈselɪbreɪt/ — استرس روی cel.")
            ),
            culturalNotes = listOf(
                CulturalNote("Christmas", "در غرب، Christmas (۲۵ دسامبر) بزرگ‌ترین جشن سال است."),
                CulturalNote("New Year", "New Year's Eve (31 دسامبر) جشن بزرگی است.")
            ),
            grammar = listOf(
                GrammarSection(
                    title = "will for future",
                    content = """
                        will + verb

                        We'll have a party.
                        She'll come tomorrow.
                        They won't be late.

                        سوال: Will you come?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Invitations",
                    content = """
                        Would you like to come?
                        Do you want to join us?
                        Can you come to my party?

                        پاسخ مثبت: Yes, I'd love to!
                        پاسخ منفی: Sorry, I can't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present continuous for arrangements",
                    content = """
                        برای قرارهای قطعی:

                        I'm having a party on Saturday.
                        We're meeting at 7.

                        am/is/are + verb-ing
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Time expressions",
                    content = """
                        on + روز: on Saturday
                        at + ساعت: at 7 PM
                        in + ماه/سال: in December

                        My birthday is on May 5th.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake("I will to come.", "I will come.", "بعد از will فعل ساده می‌آید."),
                CommonMistake("I'm going to a party on Saturday.", "I'm going to a party on Saturday.", "این جمله درسته."),
                CommonMistake("My birthday is in May 5th.", "My birthday is on May 5th.", "برای تاریخ از on استفاده می‌کنیم."),
                CommonMistake("Would you like come?", "Would you like to come?", "بعد از would like to + verb.")
            ),
            conversation = listOf(
                DialogueLine("A", "Are you doing anything special this weekend?", "این آخر هفته کار خاصی داری؟"),
                DialogueLine("B", "Yes! It's my sister's birthday on Saturday.", "بله! شنبه تولد خواهرمه."),
                DialogueLine("A", "Oh nice! Are you throwing a party?", "اوه خوبه! مهمونی می‌گیرید؟"),
                DialogueLine("B", "Yes, we're having a small party at home.", "بله، یه مهمونی کوچیک خونه می‌گیریم."),
                DialogueLine("A", "That sounds fun. What will you do?", "خوب به نظر می‌رسه. چیکار می‌کنید؟"),
                DialogueLine("B", "We'll have dinner, play games, and sing.", "شام می‌خوریم، بازی می‌کنیم و آواز می‌خونیم."),
                DialogueLine("A", "Will you decorate the house?", "خونه رو تزئین می‌کنید؟"),
                DialogueLine("B", "Yes, we'll decorate with balloons and lights.", "بله، با بادکنک و چراغ تزئین می‌کنیم."),
                DialogueLine("A", "What present will you give her?", "چه هدیه‌ای بهش می‌دی؟"),
                DialogueLine("B", "I'll give her a book. She loves reading.", "یه کتاب بهش می‌دم. عاشق کتاب خوندنه."),
                DialogueLine("A", "Perfect. Would you like to come to my birthday too?", "عالی. دوست داری به تولد من هم بیای؟"),
                DialogueLine("B", "Of course! When is it?", "حتماً! کِیه؟"),
                DialogueLine("A", "Next Saturday. We're having a dinner party.", "شنبه بعد. مهمونی شام داریم."),
                DialogueLine("B", "I'd love to. What time?", "دوست دارم. چه ساعتی؟"),
                DialogueLine("A", "At 7. Will you bring your sister?", "ساعت ۷. خواهرت رو میاری؟"),
                DialogueLine("B", "Sure. What should we bring?", "حتماً. چی بیاریم؟"),
                DialogueLine("A", "Just yourselves. And a good mood!", "فقط خودتون. و یه حال خوب!"),
                DialogueLine("B", "Great, we'll be there!", "عالی، اونجا هستیم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("تولد کی است؟", "خواهر B."),
                ComprehensionQuestion("B چه نوع مهمونی می‌گیرد؟", "مهمونی کوچک در خانه."),
                ComprehensionQuestion("B چه هدیه‌ای می‌دهد؟", "کتاب."),
                ComprehensionQuestion("A چه نوع مهمونی دارد؟", "مهمونی شام."),
                ComprehensionQuestion("قرار ساعت چند است؟", "ساعت ۷.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a celebration you enjoy.", "درباره یک جشن که دوست داری صحبت کن.", "I love... / We usually..."),
                SpeakingTask("Invite a friend to a party.", "یه دوست رو به مهمونی دعوت کن.", "Would you like to...? / Can you come...?"),
                SpeakingTask("Describe a birthday party.", "یه مهمونی تولد رو توصیف کن.", "We had... / There were...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a celebration you attended.", "درباره یک جشن که رفتی بنویس.", 150, "Use past simple and will for future.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: We ___ have a party.", listOf("will", "wills", "are will", "to will"), 0),
                QuizQuestion("Complete: Would you like ___ come?", listOf("to", "for", "at", "on"), 0),
                QuizQuestion("Complete: My birthday is ___ May 5th.", listOf("in", "on", "at", "for"), 1),
                QuizQuestion("What does 'throw a party' mean?", listOf("پرت کردن", "مهمونی گرفتن", "بازی کردن", "پختن"), 1),
                QuizQuestion("Complete: I ___ having a party.", listOf("is", "am", "are", "be"), 1),
                QuizQuestion("Complete: She ___ come tomorrow.", listOf("will", "wills", "is will", "to will"), 0),
                QuizQuestion("Complete: We're meeting ___ 7 PM.", listOf("in", "on", "at", "for"), 2),
                QuizQuestion("What does 'get together' mean?", listOf("جدا شدن", "دور هم جمع شدن", "سفر کردن", "خرید کردن"), 1)
            )
        )
    }
}تاا