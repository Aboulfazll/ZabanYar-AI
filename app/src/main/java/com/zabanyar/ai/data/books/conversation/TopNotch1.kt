package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object TopNotch1 {

    const val BOOK_ID = "top_notch_1"

    fun getContent(chapterNumber: Int): LessonContent {
        return when (chapterNumber) {
            1 -> chapter1()
            else -> getDefaultContent(BOOK_ID, chapterNumber)
        }
    }

    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Getting Started",
            titlePersian = "شروع آشنایی",

            objectives = listOf(
                "Introduce yourself and other people",
                "Ask and answer basic personal questions",
                "Talk about names, countries, cities, and occupations",
                "Use the verb be in simple sentences",
                "Spell names and simple words",
                "Use common greetings in everyday situations"
            ),

            vocabulary = listOf(

                VocabWord(
                    english = "introduce",
                    persian = "معرفی کردن",
                    pronunciation = "/ˌɪntrəˈduːs/",
                    partOfSpeech = "verb",
                    example = "Let me introduce myself.",
                    examplePersian = "اجازه بده خودم را معرفی کنم.",
                    collocations = "introduce yourself, introduce someone",
                    synonyms = "present",
                    wordFamily = "introduction",
                    usageTip = "Use it when you present yourself or another person."
                ),

                VocabWord(
                    english = "name",
                    persian = "نام",
                    pronunciation = "/neɪm/",
                    partOfSpeech = "noun",
                    example = "My name is Daniel.",
                    examplePersian = "اسم من دنیل است.",
                    collocations = "first name, last name, full name",
                    synonyms = "title",
                    usageTip = "Use first name for the personal name and last name for the family name."
                ),

                VocabWord(
                    english = "country",
                    persian = "کشور",
                    pronunciation = "/ˈkʌntri/",
                    partOfSpeech = "noun",
                    example = "What country are you from?",
                    examplePersian = "اهل کدام کشور هستی؟",
                    collocations = "home country, foreign country",
                    usageTip = "Use from to talk about the country where someone comes from."
                ),

                VocabWord(
                    english = "city",
                    persian = "شهر",
                    pronunciation = "/ˈsɪti/",
                    partOfSpeech = "noun",
                    example = "I live in a small city.",
                    examplePersian = "من در یک شهر کوچک زندگی می‌کنم.",
                    collocations = "big city, small city, capital city",
                    usageTip = "Use in with most cities when talking about where someone lives."
                ),

                VocabWord(
                    english = "nationality",
                    persian = "ملیت",
                    pronunciation = "/ˌnæʃəˈnæləti/",
                    partOfSpeech = "noun",
                    example = "What is your nationality?",
                    examplePersian = "ملیت شما چیست؟",
                    collocations = "nationality question, different nationality",
                    usageTip = "Nationality describes the country a person is connected to legally or culturally."
                ),

                VocabWord(
                    english = "student",
                    persian = "دانش‌آموز / دانشجو",
                    pronunciation = "/ˈstuːdənt/",
                    partOfSpeech = "noun",
                    example = "I'm a university student.",
                    examplePersian = "من دانشجوی دانشگاه هستم.",
                    collocations = "university student, college student",
                    synonyms = "learner",
                    usageTip = "Student can refer to someone studying at a school, college, or university."
                ),

                VocabWord(
                    english = "teacher",
                    persian = "معلم",
                    pronunciation = "/ˈtiːtʃər/",
                    partOfSpeech = "noun",
                    example = "My English teacher is very friendly.",
                    examplePersian = "معلم انگلیسی من خیلی خوش‌برخورد است.",
                    collocations = "English teacher, school teacher",
                    synonyms = "educator",
                    usageTip = "Teacher is the normal everyday word for someone who teaches."
                ),

                VocabWord(
                    english = "classmate",
                    persian = "همکلاسی",
                    pronunciation = "/ˈklæsmeɪt/",
                    partOfSpeech = "noun",
                    example = "Sara is my new classmate.",
                    examplePersian = "سارا همکلاسی جدید من است.",
                    collocations = "new classmate, former classmate",
                    usageTip = "A classmate is someone who studies in the same class as you."
                ),

                VocabWord(
                    english = "friendly",
                    persian = "دوستانه، خوش‌برخورد",
                    pronunciation = "/ˈfrendli/",
                    partOfSpeech = "adjective",
                    example = "Everyone in the class is friendly.",
                    examplePersian = "همه در کلاس خوش‌برخورد هستند.",
                    collocations = "friendly person, friendly smile",
                    synonyms = "kind, welcoming",
                    antonyms = "unfriendly",
                    usageTip = "Friendly describes someone who behaves in a warm and pleasant way."
                ),

                VocabWord(
                    english = "language",
                    persian = "زبان",
                    pronunciation = "/ˈlæŋɡwɪdʒ/",
                    partOfSpeech = "noun",
                    example = "English is an international language.",
                    examplePersian = "انگلیسی یک زبان بین‌المللی است.",
                    collocations = "foreign language, native language",
                    usageTip = "Use native language for the language someone learns first."
                ),

                VocabWord(
                    english = "job",
                    persian = "شغل",
                    pronunciation = "/dʒɑːb/",
                    partOfSpeech = "noun",
                    example = "What is your job?",
                    examplePersian = "شغل شما چیست؟",
                    collocations = "full-time job, part-time job",
                    synonyms = "occupation, work",
                    usageTip = "Job usually refers to a particular position or type of employment."
                ),

                VocabWord(
                    english = "from",
                    persian = "از / اهل",
                    pronunciation = "/frəm/",
                    partOfSpeech = "preposition",
                    example = "I'm from Canada.",
                    examplePersian = "من اهل کانادا هستم.",
                    collocations = "be from, come from",
                    usageTip = "Use be from to say where someone originally comes from."
                )
            ),

            idioms = listOf(

                IdiomExpression(
                    english = "Nice to meet you",
                    persian = "از آشنایی با شما خوشحالم",
                    example = "Hi, I'm Anna. Nice to meet you.",
                    examplePersian = "سلام، من آنا هستم. از آشنایی با شما خوشحالم.",
                    register = "neutral"
                ),

                IdiomExpression(
                    english = "How's it going?",
                    persian = "اوضاع چطوره؟",
                    example = "Hi, Mike! How's it going?",
                    examplePersian = "سلام مایک! اوضاع چطوره؟",
                    register = "informal"
                ),

                IdiomExpression(
                    english = "See you around",
                    persian = "بعداً می‌بینمت",
                    example = "Great talking to you. See you around!",
                    examplePersian = "از صحبت با تو خوشحال شدم. بعداً می‌بینمت!",
                    register = "informal"
                )
            ),

            phrasalVerbs = listOf(

                PhrasalVerb(
                    verb = "come from",
                    meaning = "to originate from a place",
                    persian = "اهل جایی بودن",
                    example = "I come from a small town.",
                    examplePersian = "من اهل یک شهر کوچک هستم.",
                    separable = "no"
                ),

                PhrasalVerb(
                    verb = "live in",
                    meaning = "to have your home in a place",
                    persian = "در جایی زندگی کردن",
                    example = "She lives in Tehran.",
                    examplePersian = "او در تهران زندگی می‌کند.",
                    separable = "no"
                ),

                PhrasalVerb(
                    verb = "work with",
                    meaning = "to work together with someone or something",
                    persian = "با کسی یا چیزی کار کردن",
                    example = "I work with international students.",
                    examplePersian = "من با دانشجویان بین‌المللی کار می‌کنم.",
                    separable = "no"
                )
            ),

            pronunciationTips = listOf(

                PronunciationTip(
                    title = "I'm / You're",
                    content = "In natural conversation, contractions such as I'm and you're are very common. Practice saying them smoothly rather than pronouncing every word separately."
                ),

                PronunciationTip(
                    title = "Final consonants",
                    content = "Pay attention to the final sounds in words such as name, job, and student. Do not drop the final consonant."
                ),

                PronunciationTip(
                    title = "Question intonation",
                    content = "Yes/no questions often have rising intonation. Practice raising your voice slightly at the end."
                ),

                PronunciationTip(
                    title = "Spelling names",
                    content = "When spelling a name, say each letter clearly and use a natural pause between the first and last name."
                )
            ),

            culturalNotes = listOf(

                CulturalNote(
                    title = "First introductions",
                    content = "In many English-speaking situations, people commonly say their first name when introducing themselves. In formal situations, a last name may also be used."
                ),

                CulturalNote(
                    title = "Asking someone's name",
                    content = "What is your name? is neutral and widely understood. In casual conversation, What's your name? is also common."
                ),

                CulturalNote(
                    title = "Nice to meet you",
                    content = "Nice to meet you is normally used when you meet someone for the first time. After meeting the person again, Nice to see you is more natural."
                )
            ),

            grammar = listOf(

                GrammarSection(
                    title = "The verb be",
                    content = """
The verb be is used to give basic information about people and things.

I am a student.
You are my classmate.
He is from Spain.
She is a teacher.
We are friends.
They are students.

Common short forms:
I am → I'm
You are → You're
He is → He's
She is → She's
We are → We're
They are → They're
""".trimIndent()
                ),

                GrammarSection(
                    title = "Negative sentences",
                    content = """
Use not after the verb be to make a negative sentence.

I am not a teacher.
You are not late.
He is not from Italy.
They are not classmates.

Common contractions:
is not → isn't
are not → aren't

Examples:
I'm not from London.
She isn't a student.
We aren't teachers.
""".trimIndent()
                ),

                GrammarSection(
                    title = "Questions with be",
                    content = """
For questions with be, put the verb before the subject.

You are a student.
→ Are you a student?

She is from Canada.
→ Is she from Canada?

They are classmates.
→ Are they classmates?

Short answers:
Yes, I am.
No, I'm not.
Yes, he is.
No, he isn't.
Yes, they are.
No, they aren't.
""".trimIndent()
                ),

                GrammarSection(
                    title = "Wh- questions",
                    content = """
Use What, Where, Who, and How to ask for basic information.

What is your name?
Where are you from?
Who is your teacher?
How are you?

Examples:
A: Where are you from?
B: I'm from Brazil.

A: What is your job?
B: I'm a designer.
""".trimIndent()
                ),

                GrammarSection(
                    title = "Subject pronouns",
                    content = """
Subject pronouns tell us who does or is something.

I
you
he
she
it
we
they

Examples:
I am a student.
She is my teacher.
We are classmates.
They are from Mexico.
""".trimIndent()
                )
            ),

            commonMistakes = listOf(

                CommonMistake(
                    wrong = "I from Iran.",
                    correct = "I'm from Iran.",
                    explanation = "The verb be is necessary before from."
                ),

                CommonMistake(
                    wrong = "She are a student.",
                    correct = "She is a student.",
                    explanation = "Use is with he, she, and it."
                ),

                CommonMistake(
                    wrong = "Are you from Turkey? Yes, I do.",
                    correct = "Are you from Turkey? Yes, I am.",
                    explanation = "Questions with be take am/is/are in the short answer, not do."
                ),

                CommonMistake(
                    wrong = "What your name?",
                    correct = "What's your name?",
                    explanation = "The question needs the verb is."
                ),

                CommonMistake(
                    wrong = "I am live in Baku.",
                    correct = "I live in Baku.",
                    explanation = "Live is a normal verb here, so do not add am before it."
                )
            ),

            conversation = listOf(

                DialogueLine(
                    speaker = "Emma",
                    english = "Hi! I'm Emma. What's your name?",
                    persian = "سلام! من اِما هستم. اسمت چیه؟"
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "Hi, Emma. I'm Omar. Nice to meet you.",
                    persian = "سلام اِما. من عمر هستم. از آشنایی با تو خوشحالم."
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "Nice to meet you, too. Are you new here?",
                    persian = "من هم از آشنایی با تو خوشحالم. اینجا تازه‌واردی؟"
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "Yes, I am. This is my first English class.",
                    persian = "بله. این اولین کلاس انگلیسی من است."
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "Really? I'm new, too.",
                    persian = "واقعاً؟ من هم تازه‌وارد هستم."
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "Great! Where are you from?",
                    persian = "عالیه! اهل کجایی؟"
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "I'm from Australia. How about you?",
                    persian = "من اهل استرالیا هستم. تو چطور؟"
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "I'm from Jordan.",
                    persian = "من اهل اردن هستم."
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "Do you live in this city now?",
                    persian = "الان در این شهر زندگی می‌کنی؟"
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "Yes, I live near the school.",
                    persian = "بله، نزدیک مدرسه زندگی می‌کنم."
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "That's convenient. I live about twenty minutes away.",
                    persian = "این خیلی خوبه. من حدود بیست دقیقه با اینجا فاصله دارم."
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "Are you a student?",
                    persian = "دانشجو هستی؟"
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "Yes, I am. I'm a university student.",
                    persian = "بله. من دانشجوی دانشگاه هستم."
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "What do you study?",
                    persian = "چه رشته‌ای می‌خونی؟"
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "I study business. What about you?",
                    persian = "من مدیریت بازرگانی می‌خونم. تو چطور؟"
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "I'm a computer science student.",
                    persian = "من دانشجوی علوم کامپیوتر هستم."
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "Oh, nice. Do you speak any other languages?",
                    persian = "اوه، عالیه. زبان دیگری هم صحبت می‌کنی؟"
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "Yes. I speak Arabic and a little French.",
                    persian = "بله. عربی و کمی فرانسوی صحبت می‌کنم."
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "That's interesting. I speak English and a little Spanish.",
                    persian = "جالبه. من انگلیسی و کمی اسپانیایی صحبت می‌کنم."
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "Maybe we can practice English together.",
                    persian = "شاید بتوانیم با هم انگلیسی تمرین کنیم."
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "Sure! That sounds like a good idea.",
                    persian = "حتماً! ایده خوبی به نظر می‌رسه."
                ),

                DialogueLine(
                    speaker = "Omar",
                    english = "Great. See you in class tomorrow.",
                    persian = "عالیه. فردا در کلاس می‌بینمت."
                ),

                DialogueLine(
                    speaker = "Emma",
                    english = "See you tomorrow, Omar!",
                    persian = "فردا می‌بینمت، عمر!"
                )
            ),

            comprehensionQuestions = listOf(

                ComprehensionQuestion(
                    question = "What is the woman's name?",
                    answer = "Her name is Emma."
                ),

                ComprehensionQuestion(
                    question = "Where is Emma from?",
                    answer = "She is from Australia."
                ),

                ComprehensionQuestion(
                    question = "Where is Omar from?",
                    answer = "He is from Jordan."
                ),

                ComprehensionQuestion(
                    question = "What does Emma study?",
                    answer = "She studies business."
                ),

                ComprehensionQuestion(
                    question = "What does Omar study?",
                    answer = "He studies computer science."
                ),

                ComprehensionQuestion(
                    question = "What languages does Omar speak?",
                    answer = "He speaks Arabic and a little French."
                )
            ),

            speakingTasks = listOf(

                SpeakingTask(
                    prompt = "Introduce yourself to a new classmate.",
                    promptPersian = "خودت را به یک همکلاسی جدید معرفی کن.",
                    hints = "Say your name, country, city, occupation, and one language you speak."
                ),

                SpeakingTask(
                    prompt = "Ask your partner five basic personal questions.",
                    promptPersian = "پنج سؤال ساده شخصی از همکلاسی خود بپرس.",
                    hints = "Ask about name, country, city, job, and languages."
                ),

                SpeakingTask(
                    prompt = "Give a short introduction about a friend.",
                    promptPersian = "یک معرفی کوتاه درباره یکی از دوستانت ارائه بده.",
                    hints = "Use he/she, is, from, lives, student, teacher, or job."
                )
            ),

            writingTasks = listOf(

                WritingTask(
                    prompt = "Write a short introduction about yourself.",
                    promptPersian = "یک معرفی کوتاه درباره خودت بنویس.",
                    wordCount = 80,
                    hints = "Include your name, country, city, occupation, languages, and one personal detail."
                )
            ),

            quiz = listOf(

                QuizQuestion(
                    question = "Which sentence is correct?",
                    options = listOf(
                        "I from Canada.",
                        "I'm from Canada.",
                        "I from am Canada.",
                        "I'm Canada from."
                    ),
                    correctIndex = 1
                ),

                QuizQuestion(
                    question = "Choose the correct question.",
                    options = listOf(
                        "What your name?",
                        "What is your name?",
                        "What are your name?",
                        "What be your name?"
                    ),
                    correctIndex = 1
                ),

                QuizQuestion(
                    question = "Choose the correct form: She ___ a student.",
                    options = listOf(
                        "am",
                        "are",
                        "is",
                        "be"
                    ),
                    correctIndex = 2
                ),

                QuizQuestion(
                    question = "Choose the correct negative sentence.",
                    options = listOf(
                        "He aren't a teacher.",
                        "He isn't a teacher.",
                        "He not is a teacher.",
                        "He don't a teacher."
                    ),
                    correctIndex = 1
                ),

                QuizQuestion(
                    question = "What does 'classmate' mean?",
                    options = listOf(
                        "A family member",
                        "A person in the same class",
                        "A school manager",
                        "A teacher"
                    ),
                    correctIndex = 1
                ),

                QuizQuestion(
                    question = "Choose the correct question.",
                    options = listOf(
                        "Where you are from?",
                        "Where are you from?",
                        "Where from are you?",
                        "Where is you from?"
                    ),
                    correctIndex = 1
                ),

                QuizQuestion(
                    question = "Complete the sentence: They ___ from Spain.",
                    options = listOf(
                        "is",
                        "am",
                        "are",
                        "be"
                    ),
                    correctIndex = 2
                ),

                QuizQuestion(
                    question = "Which expression is commonly used when meeting someone for the first time?",
                    options = listOf(
                        "See you yesterday.",
                        "Nice to meet you.",
                        "Good night yesterday.",
                        "See you last week."
                    ),
                    correctIndex = 1
                )
            )
        )
    }

    private fun getDefaultContent(
        bookId: String,
        chapterNumber: Int
    ): LessonContent {
        return LessonContent(
            bookId = bookId,
            chapterNumber = chapterNumber,
            title = "Coming Soon",
            titlePersian = "به زودی...",
            vocabulary = emptyList(),
            grammar = emptyList(),
            conversation = emptyList(),
            quiz = emptyList()
        )
    }
}