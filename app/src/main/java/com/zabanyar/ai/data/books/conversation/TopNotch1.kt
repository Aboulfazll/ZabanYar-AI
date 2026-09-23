package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object TopNotch1 {

    const val BOOK_ID = "top_notch_1"

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
            title = "Names and Occupations",
            titlePersian = "نام‌ها و شغل‌ها",

            objectives = listOf(
                "Introduce yourself and other people",
                "Ask and answer questions about names",
                "Talk about occupations",
                "Use the verb be with I, you, he, and she",
                "Spell names and simple words"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "name",
                    persian = "نام",
                    pronunciation = "/neɪm/",
                    partOfSpeech = "noun",
                    example = "My name is Sara.",
                    examplePersian = "اسم من سارا است.",
                    collocations = "first name, last name, full name",
                    synonyms = "identity",
                    usageTip = "Use 'name' when asking who someone is."
                ),

                VocabWord(
                    english = "student",
                    persian = "دانش‌آموز / دانشجو",
                    pronunciation = "/ˈstuːdənt/",
                    partOfSpeech = "noun",
                    example = "I am a student.",
                    examplePersian = "من دانشجو هستم.",
                    collocations = "college student, university student",
                    usageTip = "Use 'a student' when talking about one person."
                ),

                VocabWord(
                    english = "teacher",
                    persian = "معلم",
                    pronunciation = "/ˈtiːtʃər/",
                    partOfSpeech = "noun",
                    example = "She is a teacher.",
                    examplePersian = "او معلم است.",
                    collocations = "English teacher, school teacher"
                ),

                VocabWord(
                    english = "doctor",
                    persian = "پزشک",
                    pronunciation = "/ˈdɑːktər/",
                    partOfSpeech = "noun",
                    example = "He is a doctor.",
                    examplePersian = "او پزشک است.",
                    collocations = "medical doctor, family doctor"
                ),

                VocabWord(
                    english = "engineer",
                    persian = "مهندس",
                    pronunciation = "/ˌendʒɪˈnɪr/",
                    partOfSpeech = "noun",
                    example = "My brother is an engineer.",
                    examplePersian = "برادرم مهندس است.",
                    collocations = "software engineer, civil engineer"
                ),

                VocabWord(
                    english = "designer",
                    persian = "طراح",
                    pronunciation = "/dɪˈzaɪnər/",
                    partOfSpeech = "noun",
                    example = "She is a graphic designer.",
                    examplePersian = "او طراح گرافیک است."
                ),

                VocabWord(
                    english = "manager",
                    persian = "مدیر",
                    pronunciation = "/ˈmænɪdʒər/",
                    partOfSpeech = "noun",
                    example = "He is a hotel manager.",
                    examplePersian = "او مدیر هتل است."
                ),

                VocabWord(
                    english = "nurse",
                    persian = "پرستار",
                    pronunciation = "/nɜːrs/",
                    partOfSpeech = "noun",
                    example = "My sister is a nurse.",
                    examplePersian = "خواهرم پرستار است."
                ),

                VocabWord(
                    english = "classmate",
                    persian = "همکلاسی",
                    pronunciation = "/ˈklæsmeɪt/",
                    partOfSpeech = "noun",
                    example = "Ali is my classmate.",
                    examplePersian = "علی همکلاسی من است.",
                    collocations = "new classmate, old classmate"
                ),

                VocabWord(
                    english = "friend",
                    persian = "دوست",
                    pronunciation = "/frend/",
                    partOfSpeech = "noun",
                    example = "This is my friend, David.",
                    examplePersian = "این دوست من، دیوید است.",
                    collocations = "close friend, best friend"
                ),

                VocabWord(
                    english = "country",
                    persian = "کشور",
                    pronunciation = "/ˈkʌntri/",
                    partOfSpeech = "noun",
                    example = "I am from Iran.",
                    examplePersian = "من اهل ایران هستم."
                ),

                VocabWord(
                    english = "city",
                    persian = "شهر",
                    pronunciation = "/ˈsɪti/",
                    partOfSpeech = "noun",
                    example = "I live in Baku.",
                    examplePersian = "من در باکو زندگی می‌کنم."
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "صدای /iː/ در teacher",
                    content = "در واژه teacher صدای کشیده /iː/ داریم. زبان را کمی بالا نگه دارید و صدا را کوتاه و قطع‌شده تلفظ نکنید."
                ),
                PronunciationTip(
                    title = "تفاوت a و an",
                    content = "قبل از صدای صامت معمولاً a و قبل از صدای مصوت an می‌آید؛ مانند a teacher و an engineer."
                ),
                PronunciationTip(
                    title = "استرس در engineer",
                    content = "در engineer استرس اصلی روی بخش پایانی واژه قرار می‌گیرد."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "First names",
                    content = "در بسیاری از موقعیت‌های انگلیسی‌زبان، افراد بعد از معرفی اولیه خیلی زود از نام کوچک یکدیگر استفاده می‌کنند."
                ),
                CulturalNote(
                    title = "Polite introductions",
                    content = "برای معرفی رسمی می‌توان از عبارت‌هایی مانند Nice to meet you استفاده کرد."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Verb Be: I am / You are",
                    content = """
                        برای معرفی خود از am استفاده می‌کنیم:

                        I am Sara.
                        I am a student.

                        برای you از are استفاده می‌کنیم:

                        You are a teacher.
                        You are my classmate.

                        شکل کوتاه:
                        I am → I'm
                        You are → You're
                    """.trimIndent()
                ),

                GrammarSection(
                    title = "He is / She is",
                    content = """
                        برای یک مرد از he و برای یک زن از she استفاده می‌کنیم.

                        He is a doctor.
                        She is a teacher.

                        شکل کوتاه:
                        He is → He's
                        She is → She's
                    """.trimIndent()
                ),

                GrammarSection(
                    title = "Questions with Be",
                    content = """
                        برای سؤال ساختن، فعل be را قبل از فاعل قرار می‌دهیم.

                        Are you a student?
                        Yes, I am.

                        Is she a teacher?
                        Yes, she is.

                        Is he a doctor?
                        No, he isn't.
                    """.trimIndent()
                ),

                GrammarSection(
                    title = "Articles: a / an",
                    content = """
                        برای یک شغل یا اسم مفرد قابل شمارش معمولاً از a یا an استفاده می‌کنیم.

                        a teacher
                        a doctor
                        a student

                        an engineer
                        an artist

                        اگر واژه با صدای مصوت شروع شود، معمولاً an استفاده می‌شود.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I is a student.",
                    correct = "I am a student.",
                    explanation = "با I باید از am استفاده کنیم."
                ),
                CommonMistake(
                    wrong = "She are a teacher.",
                    correct = "She is a teacher.",
                    explanation = "با he و she از is استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "He is engineer.",
                    correct = "He is an engineer.",
                    explanation = "قبل از engineer به an نیاز داریم."
                ),
                CommonMistake(
                    wrong = "Are she a doctor?",
                    correct = "Is she a doctor?",
                    explanation = "برای she در سؤال باید is استفاده شود."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Emma",
                    english = "Hi! My name is Emma. What's your name?",
                    persian = "سلام! اسم من اماست. اسم تو چیه؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Hi, Emma. I'm Daniel. Nice to meet you.",
                    persian = "سلام اما. من دنیل هستم. از آشنایی با تو خوشحالم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Nice to meet you, too. Are you a student?",
                    persian = "من هم از آشنایی با تو خوشحالم. دانشجو هستی؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Yes, I am. I'm a university student.",
                    persian = "بله، هستم. من دانشجوی دانشگاه هستم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "That's nice. What do you study?",
                    persian = "خوبه. چی می‌خونی؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "I study computer science. How about you?",
                    persian = "من علوم کامپیوتر می‌خونم. تو چطور؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm an English teacher.",
                    persian = "من معلم زبان انگلیسی هستم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Really? Where do you teach?",
                    persian = "واقعاً؟ کجا تدریس می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I teach at a language school near the city center.",
                    persian = "من در یک آموزشگاه زبان نزدیک مرکز شهر تدریس می‌کنم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "That sounds interesting. Is this your first year there?",
                    persian = "جالب به نظر می‌رسه. این اولین سالته اونجا؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Yes, it is. I'm happy to work there.",
                    persian = "بله. خوشحالم که آنجا کار می‌کنم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "It was nice talking to you, Emma.",
                    persian = "از صحبت کردن با تو خوشحال شدم، اما."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Nice talking to you, too. See you later!",
                    persian = "من هم از صحبت با تو خوشحال شدم. بعداً می‌بینمت!"
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is the man's name?",
                    answer = "His name is Daniel."
                ),
                ComprehensionQuestion(
                    question = "Is Daniel a university student?",
                    answer = "Yes, he is."
                ),
                ComprehensionQuestion(
                    question = "What does Daniel study?",
                    answer = "He studies computer science."
                ),
                ComprehensionQuestion(
                    question = "What is Emma's job?",
                    answer = "She is an English teacher."
                ),
                ComprehensionQuestion(
                    question = "Where does Emma teach?",
                    answer = "She teaches at a language school."
                )
            ),

            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Introduce yourself. Say your name, your job or field of study, and your city.",
                    promptPersian = "خودت را معرفی کن. نام، شغل یا رشته تحصیلی و شهرت را بگو.",
                    hints = "My name is... / I'm a... / I study... / I live in..."
                ),
                SpeakingTask(
                    prompt = "Introduce a friend or family member.",
                    promptPersian = "یکی از دوستان یا اعضای خانواده‌ات را معرفی کن.",
                    hints = "This is my... / His name is... / Her name is... / He is... / She is..."
                )
            ),

            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a short introduction about yourself. Include your name, city, occupation or field of study, and one thing you enjoy.",
                    promptPersian = "یک معرفی کوتاه درباره خودت بنویس. نام، شهر، شغل یا رشته تحصیلی و یک علاقه‌مندی را بنویس.",
                    wordCount = 60,
                    hints = "My name is... / I am... / I live in... / I like..."
                )
            ),

            quiz = listOf(
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "I is a student.",
                        "I am a student.",
                        "I are a student.",
                        "I be a student."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "She are a teacher.",
                        "She am a teacher.",
                        "She is a teacher.",
                        "She be a teacher."
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: He is ___ engineer.",
                    options = listOf(
                        "a",
                        "an",
                        "the",
                        "are"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: ___ you a student?",
                    options = listOf(
                        "Is",
                        "Am",
                        "Are",
                        "Be"
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "What is the correct short form of 'She is'?",
                    options = listOf(
                        "She's",
                        "She're",
                        "She'm",
                        "Shes"
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "He are a doctor.",
                        "He is a doctor.",
                        "He am a doctor.",
                        "He be doctor."
                    ),
                    correctIndex = 1
                )
            )
        )
    }
}