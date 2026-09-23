package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCorners1 {

    const val BOOK_ID = "four_corners_1"

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
            title = "Welcome to Class",
            titlePersian = "به کلاس خوش آمدید",

            objectives = listOf(
                "Introduce yourself and other people",
                "Ask for and give personal information",
                "Use subject pronouns and the verb be",
                "Ask basic yes/no and Wh- questions",
                "Use common classroom expressions",
                "Have a short conversation with a new classmate"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "classmate",
                    persian = "همکلاسی",
                    pronunciation = "/ˈklæsmeɪt/",
                    partOfSpeech = "noun",
                    example = "My new classmate is very friendly.",
                    examplePersian = "همکلاسی جدید من خیلی صمیمی است."
                ),
                VocabWord(
                    english = "class",
                    persian = "کلاس",
                    pronunciation = "/klæs/",
                    partOfSpeech = "noun",
                    example = "Our English class starts at nine.",
                    examplePersian = "کلاس انگلیسی ما ساعت نه شروع می‌شود."
                ),
                VocabWord(
                    english = "student",
                    persian = "دانش‌آموز / دانشجو",
                    pronunciation = "/ˈstuːdənt/",
                    partOfSpeech = "noun",
                    example = "I'm a new student.",
                    examplePersian = "من دانش‌آموز جدید هستم."
                ),
                VocabWord(
                    english = "teacher",
                    persian = "معلم",
                    pronunciation = "/ˈtiːtʃər/",
                    partOfSpeech = "noun",
                    example = "Our teacher is from Canada.",
                    examplePersian = "معلم ما اهل کانادا است."
                ),
                VocabWord(
                    english = "classroom",
                    persian = "کلاس درس",
                    pronunciation = "/ˈklæsruːm/",
                    partOfSpeech = "noun",
                    example = "The classroom is on the second floor.",
                    examplePersian = "کلاس درس در طبقه دوم است."
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
                    english = "city",
                    persian = "شهر",
                    pronunciation = "/ˈsɪti/",
                    partOfSpeech = "noun",
                    example = "I live in a small city.",
                    examplePersian = "من در یک شهر کوچک زندگی می‌کنم."
                ),
                VocabWord(
                    english = "language",
                    persian = "زبان",
                    pronunciation = "/ˈlæŋɡwɪdʒ/",
                    partOfSpeech = "noun",
                    example = "English is an international language.",
                    examplePersian = "انگلیسی یک زبان بین‌المللی است."
                ),
                VocabWord(
                    english = "partner",
                    persian = "هم‌گروهی / شریک",
                    pronunciation = "/ˈpɑːrtnər/",
                    partOfSpeech = "noun",
                    example = "Work with your partner.",
                    examplePersian = "با هم‌گروهی خود کار کنید."
                ),
                VocabWord(
                    english = "repeat",
                    persian = "تکرار کردن",
                    pronunciation = "/rɪˈpiːt/",
                    partOfSpeech = "verb",
                    example = "Please repeat the question.",
                    examplePersian = "لطفاً سؤال را تکرار کنید."
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
                    english = "practice",
                    persian = "تمرین کردن",
                    pronunciation = "/ˈpræktɪs/",
                    partOfSpeech = "verb/noun",
                    example = "We practice English every day.",
                    examplePersian = "ما هر روز انگلیسی تمرین می‌کنیم."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "Nice to meet you.",
                    persian = "از آشنایی با شما خوشحالم.",
                    example = "Hi, I'm David. Nice to meet you.",
                    examplePersian = "سلام، من دیوید هستم. از آشنایی با شما خوشحالم.",
                    register = "polite"
                ),
                IdiomExpression(
                    english = "See you later.",
                    persian = "بعداً می‌بینمت.",
                    example = "Thanks for your help. See you later.",
                    examplePersian = "ممنون از کمکت. بعداً می‌بینمت.",
                    register = "informal"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "I'm و You're",
                    content = "در مکالمه طبیعی I am معمولاً به I'm و You are به You're کوتاه می‌شوند."
                ),
                PronunciationTip(
                    title = "تلفظ student",
                    content = "در student صدای /st/ در ابتدای کلمه باید واضح باشد."
                ),
                PronunciationTip(
                    title = "سؤال‌های کوتاه",
                    content = "در سؤال‌هایی مانند What's your name? روی کلمات اصلی مثل name تأکید بیشتری قرار می‌گیرد."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Introducing yourself",
                    content = "در اولین دیدار معمولاً گفتن نام و استفاده از عبارتی مانند Nice to meet you یک روش طبیعی و مؤدبانه برای شروع آشنایی است."
                ),
                CulturalNote(
                    title = "Using first names",
                    content = "در بسیاری از محیط‌های آموزشی انگلیسی‌زبان، دانش‌آموزان و معلمان ممکن است از نام کوچک یکدیگر استفاده کنند؛ اما این موضوع به فرهنگ و محیط بستگی دارد."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Subject Pronouns",
                    content = """
                        ضمایر فاعلی اصلی:

                        I = من
                        You = تو / شما
                        He = او، مذکر
                        She = او، مؤنث
                        We = ما
                        They = آنها

                        مثال:

                        I am a student.
                        She is my teacher.
                        They are classmates.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "The Verb Be",
                    content = """
                        شکل‌های فعل be در زمان حال:

                        I am
                        You are
                        He is
                        She is
                        We are
                        They are

                        مثال:

                        I am from Iran.
                        You are a student.
                        He is my friend.
                        She is a teacher.
                        We are classmates.
                        They are from Turkey.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Negative Forms",
                    content = """
                        برای منفی کردن فعل be از not استفاده می‌کنیم:

                        I am not a teacher.
                        You are not from Canada.
                        He is not a student.

                        شکل کوتاه:

                        is not → isn't
                        are not → aren't

                        مثال:

                        She isn't a student.
                        They aren't from Spain.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Basic Questions",
                    content = """
                        با جابه‌جایی فعل be و فاعل سؤال می‌سازیم:

                        Are you a student?
                        Yes, I am.

                        Is she your teacher?
                        Yes, she is.

                        برای سؤال‌های اطلاعاتی:

                        What's your name?
                        Where are you from?
                        Who is he?
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I are a student.",
                    correct = "I am a student.",
                    explanation = "با I از am استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "She are my teacher.",
                    correct = "She is my teacher.",
                    explanation = "با he و she از is استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "They is students.",
                    correct = "They are students.",
                    explanation = "با they از are استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "Are she a student?",
                    correct = "Is she a student?",
                    explanation = "با she باید از is استفاده کنیم."
                ),
                CommonMistake(
                    wrong = "Where you are from?",
                    correct = "Where are you from?",
                    explanation = "در سؤال با فعل be، فعل قبل از فاعل می‌آید."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Teacher",
                    english = "Good morning, everyone. Welcome to the English class.",
                    persian = "صبح بخیر، همه. به کلاس انگلیسی خوش آمدید."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "My name is Mr. Brown. I'm your English teacher.",
                    persian = "اسم من آقای براون است. من معلم انگلیسی شما هستم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Good morning. I'm Emma.",
                    persian = "صبح بخیر. من اِما هستم."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Nice to meet you, Emma. Are you a new student?",
                    persian = "از آشنایی با تو خوشحالم، اِما. آیا دانش‌آموز جدیدی هستی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Yes, I am. This is my first English class here.",
                    persian = "بله. این اولین کلاس انگلیسی من اینجاست."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Great. Where are you from?",
                    persian = "عالی. اهل کجا هستی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm from Turkey. I live in Baku now.",
                    persian = "من اهل ترکیه هستم. الان در باکو زندگی می‌کنم."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "That's interesting. Please meet Daniel. He's your classmate.",
                    persian = "جالب است. با دنیل آشنا شو. او همکلاسی توست."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Hi, Emma. I'm Daniel.",
                    persian = "سلام اِما. من دنیل هستم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Hi, Daniel. Nice to meet you.",
                    persian = "سلام دنیل. از آشنایی با تو خوشحالم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Nice to meet you, too. Where are you from?",
                    persian = "من هم از آشنایی با تو خوشحالم. اهل کجا هستی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm from Turkey. How about you?",
                    persian = "من اهل ترکیه هستم. تو چطور؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "I'm from Azerbaijan. I live near the city center.",
                    persian = "من اهل آذربایجان هستم. نزدیک مرکز شهر زندگی می‌کنم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Oh, nice. Are you a university student?",
                    persian = "آهان، خوبه. دانشجوی دانشگاه هستی؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Yes, I am. I'm studying computer science.",
                    persian = "بله. من علوم کامپیوتر می‌خوانم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "That's interesting. I'm studying business.",
                    persian = "جالب است. من مدیریت بازرگانی می‌خوانم."
                ),
                DialogueLine(
                    speaker = "Teacher",
                    english = "Okay, everyone. Now work with your partner and introduce yourselves.",
                    persian = "خب، همه. حالا با هم‌گروهی خود کار کنید و خودتان را معرفی کنید."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Emma, can you spell your last name?",
                    persian = "اِما، می‌توانی نام خانوادگی‌ات را هجی کنی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Sure. It's K-A-R-I-M-I.",
                    persian = "حتماً. K-A-R-I-M-I است."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Thanks. And what's your phone number?",
                    persian = "ممنون. شماره تلفنت چیست؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'll write it down for you.",
                    persian = "آن را برایت می‌نویسم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Thanks. I think we're going to be good classmates.",
                    persian = "ممنون. فکر می‌کنم همکلاسی‌های خوبی برای هم خواهیم بود."
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Who is Mr. Brown?",
                    answer = "He is the English teacher."
                ),
                ComprehensionQuestion(
                    question = "Is Emma a new student?",
                    answer = "Yes, she is."
                ),
                ComprehensionQuestion(
                    question = "Where is Emma from?",
                    answer = "She is from Turkey."
                ),
                ComprehensionQuestion(
                    question = "Where does Emma live now?",
                    answer = "She lives in Baku."
                ),
                ComprehensionQuestion(
                    question = "Where is Daniel from?",
                    answer = "He is from Azerbaijan."
                ),
                ComprehensionQuestion(
                    question = "What is Daniel studying?",
                    answer = "He is studying computer science."
                ),
                ComprehensionQuestion(
                    question = "What is Emma studying?",
                    answer = "She is studying business."
                )
            ),

            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Introduce yourself to a new classmate.",
                    promptPersian = "خودت را به یک همکلاسی جدید معرفی کن.",
                    hints = "My name is... / I'm from... / I live in... / I'm a student..."
                ),
                SpeakingTask(
                    prompt = "Ask your partner about their name, country, city, and studies.",
                    promptPersian = "درباره نام، کشور، شهر و تحصیلات دوستت سؤال بپرس.",
                    hints = "What's your name? / Where are you from? / Where do you live? / Are you a student?"
                ),
                SpeakingTask(
                    prompt = "Spell your first and last name in English.",
                    promptPersian = "نام و نام خانوادگی خودت را به انگلیسی هجی کن.",
                    hints = "My first name is... / That's... / My last name is..."
                )
            ),

            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a short introduction about yourself for your new English classmates.",
                    promptPersian = "یک معرفی کوتاه برای همکلاسی‌های جدید انگلیسی‌ات بنویس.",
                    wordCount = 70,
                    hints = "name, country, city, student/job, language"
                )
            ),

            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I ___ a student.",
                    options = listOf("is", "are", "am", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: She ___ my teacher.",
                    options = listOf("am", "are", "is", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct question.",
                    options = listOf(
                        "Where you are from?",
                        "Where are you from?",
                        "Where from are you?",
                        "Where you from?"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: They ___ classmates.",
                    options = listOf("is", "am", "are", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct negative sentence.",
                    options = listOf(
                        "She not is a teacher.",
                        "She isn't a teacher.",
                        "She aren't a teacher.",
                        "She don't a teacher."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'classmate' mean?",
                    options = listOf(
                        "A teacher",
                        "A person in the same class",
                        "A family member",
                        "A school building"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct response: Nice to meet you.",
                    options = listOf(
                        "Nice to meet you, too.",
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
}