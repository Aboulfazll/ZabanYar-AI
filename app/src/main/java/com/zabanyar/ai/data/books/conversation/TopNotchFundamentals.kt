package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Top Notch Fundamentals — Complete Course Content
 * 14 Lessons | Absolute Beginner (A1)
 * Original educational content (no copyrighted material reproduced)
 */
object TopNotchFundamentals {
    const val BOOK_ID = "top_notch_fundamentals"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> lesson1()
        2 -> lesson2()
        3 -> lesson3()
        4 -> lesson4()
        5 -> lesson5()
        6 -> lesson6()
        7 -> lesson7()
        8 -> lesson8()
        9 -> lesson9()
        10 -> lesson10()
        11 -> lesson11()
        12 -> lesson12()
        13 -> lesson13()
        14 -> lesson14()
        else -> LessonContent(
            BOOK_ID, chapterNumber, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList()
        )
    }

    // ═══════════════════════════════════════════════════════════
    // BASE BUILDER & HELPERS
    // ═══════════════════════════════════════════════════════════

    private fun base(
        n: Int, title: String, fa: String,
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

    private fun v(e: String, p: String, ex: String, ep: String, pos: String = "noun") =
        VocabWord(e, p, partOfSpeech = pos, example = ex, examplePersian = ep)

    private fun d(s: String, e: String, p: String) = DialogueLine(s, e, p)

    private fun q(question: String, options: List<String>, correct: Int) =
        QuizQuestion(question, options, correct)

    // ═══════════════════════════════════════════════════════════
    // LESSON 1 — Hello! | سلام!
    // ═══════════════════════════════════════════════════════════
    private fun lesson1() = base(
        1, "Hello!", "سلام!",
        listOf(
            "Say hello and goodbye",
            "Introduce yourself with your first name",
            "Ask someone's name",
            "Use the verb be with I and you",
            "Use basic greetings for different times of day"
        ),
        listOf(
            v("hello", "سلام", "Hello! I'm Sara.", "سلام! من سارا هستم."),
            v("hi", "سلام (دوستانه)", "Hi! How are you?", "سلام! حالت چطوره؟", "interjection"),
            v("good morning", "صبح بخیر", "Good morning, class!", "صبح بخیر، کلاس!"),
            v("good afternoon", "عصر بخیر", "Good afternoon, everyone.", "عصر بخیر، همه."),
            v("good evening", "شب بخیر (ورود)", "Good evening, Mr. Brown.", "شب بخیر، آقای براون."),
            v("good night", "شب بخیر (خداحافظی)", "Good night. See you tomorrow.", "شب بخیر. فردا می‌بینمت."),
            v("goodbye", "خداحافظ", "Goodbye! Have a nice day.", "خداحافظ! روز خوبی داشته باشی."),
            v("bye", "خداحافظ (دوستانه)", "Bye! See you later.", "خداحافظ! بعداً می‌بینمت.", "interjection"),
            v("see you", "می‌بینمت", "See you tomorrow!", "فردا می‌بینمت!"),
            v("name", "اسم", "My name is Ali.", "اسم من علی است."),
            v("first name", "نام کوچک", "My first name is Sara.", "نام کوچک من سارا است."),
            v("class", "کلاس", "Welcome to the class!", "به کلاس خوش آمدید!"),
            v("teacher", "معلم", "The teacher is here.", "معلم اینجاست."),
            v("student", "دانش‌آموز", "I'm a student.", "من دانش‌آموز هستم."),
            v("friend", "دوست", "This is my friend.", "این دوست من است.")
        ),
        listOf(
            GrammarSection(
                "Verb be: I am / You are",
                "Use am with I and are with you. I am Sara. You are Ali. Contractions: I'm, you're."
            ),
            GrammarSection(
                "Asking names: What's your name?",
                "Use 'What's your name?' to ask someone's name. Answer: 'My name is...' or 'I'm...'"
            ),
            GrammarSection(
                "Informal vs formal greetings",
                "Hi and Hello are both greetings. Hi is more informal. Good morning, Good afternoon, and Good evening are more formal."
            ),
            GrammarSection(
                "Saying goodbye",
                "Common ways: Goodbye, Bye, See you, See you later, Good night (only at night)."
            )
        ),
        listOf(
            d("A", "Good morning! I'm Sara.", "صبح بخیر! من سارا هستم."),
            d("B", "Good morning, Sara. I'm Ali.", "صبح بخیر، سارا. من علی هستم."),
            d("A", "Nice to meet you, Ali.", "از آشنایی با تو خوشحالم، علی."),
            d("B", "Nice to meet you, too. How are you?", "من هم خوشحال شدم. حالت چطوره؟"),
            d("A", "I'm fine, thank you. And you?", "خوبم، ممنون. تو چطور؟"),
            d("B", "I'm fine, thanks.", "خوبم، ممنون."),
            d("A", "What's your last name, Ali?", "نام خانوادگی‌ات چیه، علی؟"),
            d("B", "It's Rezaei. R-E-Z-A-E-I.", "رضایی. ر-ض-ا-ی-ی."),
            d("A", "Thank you. Are you a student?", "ممنون. دانش‌آموزی؟"),
            d("B", "Yes, I am. Are you a student too?", "بله. تو هم دانش‌آموزی؟"),
            d("A", "Yes, I am. We're in the same class.", "بله. ما تو یه کلاس هستیم."),
            d("B", "Great! Who is our teacher?", "عالی! معلممون کیه؟"),
            d("A", "Her name is Mrs. Smith.", "اسمش خانم اسمیت است."),
            d("B", "Is she from America?", "اهل آمریکاست؟"),
            d("A", "Yes, she is. She's from New York.", "بله. اهل نیویورک است."),
            d("B", "Nice. What time does the class start?", "خوبه. کلاس چه ساعتی شروع می‌شه؟"),
            d("A", "At nine o'clock.", "ساعت نه."),
            d("B", "Perfect. See you in class!", "عالی. تو کلاس می‌بینمت!"),
            d("A", "See you! Goodbye!", "می‌بینمت! خداحافظ!"),
            d("B", "Goodbye!", "خداحافظ!")
        ),
        listOf(
            q("What's the correct response to 'What's your name?'", listOf("I'm fine.", "My name is Ali.", "Good morning.", "See you."), 1),
            q("Which greeting is used in the morning?", listOf("Good night", "Good afternoon", "Good morning", "Goodbye"), 2),
            q("Complete: I ___ Sara.", listOf("are", "am", "is", "be"), 1),
            q("Complete: You ___ Ali.", listOf("am", "is", "are", "be"), 2),
            q("Which is informal?", listOf("Good morning", "Good afternoon", "Hi", "Good evening"), 2),
            q("What does 'See you' mean?", listOf("می‌بینمت", "خداحافظ (شب)", "سلام", "ممنون"), 0),
            q("When do we say 'Good night'?", listOf("in the morning", "at night when leaving", "at noon", "at lunch"), 1),
            q("Complete the response: Nice to meet you. — ___", listOf("Nice to meet you, too.", "See you.", "Goodbye.", "Fine, thanks."), 0)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی با شما خوشحالم", "Nice to meet you, Ali.", "از آشنایی با تو خوشحالم، علی."),
            IdiomExpression("How are you?", "حالت چطوره؟", "How are you?", "حالت چطوره؟"),
            IdiomExpression("I'm fine, thanks", "خوبم، ممنون", "I'm fine, thanks. And you?", "خوبم، ممنون. تو چطور؟"),
            IdiomExpression("See you later", "بعداً می‌بینمت", "See you later!", "بعداً می‌بینمت!"),
            IdiomExpression("Have a nice day", "روز خوبی داشته باشی", "Goodbye! Have a nice day.", "خداحافظ! روز خوبی داشته باشی.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "see you", "می‌بینمت", "informal goodbye",
                "See you tomorrow!", "فردا می‌بینمت!", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("I'm vs I am", "In natural speech, use the contraction I'm /aɪm/ most of the time."),
            PronunciationTip("Question intonation for 'How are you?'", "Use falling intonation: How are you? ↘"),
            PronunciationTip("Silent letters", "In 'morning', the 'r' is soft in American English: /ˈmɔːrnɪŋ/"),
            PronunciationTip("Th sound in 'thank you'", "Put your tongue between your teeth: /θæŋk juː/")
        ),
        culture = listOf(
            CulturalNote(
                "Greetings around the world",
                "In English-speaking countries, handshakes are common in formal situations. Hugs are common between friends."
            ),
            CulturalNote(
                "First names",
                "In informal situations, English speakers often use first names right away. In formal situations, use Mr., Ms., or Mrs. + last name."
            ),
            CulturalNote(
                "Small talk",
                "'How are you?' is often just a friendly greeting. The answer is usually 'Fine, thanks' — not a detailed health report!"
            )
        ),
        mistakes = listOf(
            CommonMistake("I name is Ali.", "My name is Ali.", "Use 'my', not 'I', before 'name'."),
            CommonMistake("I Ali.", "I'm Ali.", "You need the verb 'am'."),
            CommonMistake("How you are?", "How are you?", "Verb comes before subject in questions."),
            CommonMistake("Good night! (as a greeting)", "Good evening! (as a greeting)", "Good night is only for saying goodbye at night.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is the man's name?", "Ali Rezaei."),
            ComprehensionQuestion("Where is the teacher from?", "She's from New York, in the United States.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Greet a partner and introduce yourself.",
                "به یک دوست سلام کن و خودت را معرفی کن.",
                "Good morning! I'm... / What's your name?"
            ),
            SpeakingTask(
                "Practice saying hello and goodbye at different times of day.",
                "تمرین کن در ساعات مختلف روز سلام و خداحافظی کنی.",
                "Good morning / afternoon / evening / night"
            )
        ),
        writing = listOf(
            WritingTask(
                "Write three ways to say hello and three ways to say goodbye.",
                "سه روش سلام و سه روش خداحافظی بنویس.",
                50,
                "Include both formal and informal greetings."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 2 — Names and Titles | اسم‌ها و عناوین
    // ═══════════════════════════════════════════════════════════
    private fun lesson2() = base(
        2, "Names and Titles", "اسم‌ها و عناوین",
        listOf(
            "Use first name and last name correctly",
            "Use titles Mr., Mrs., Miss, and Ms.",
            "Spell names in English",
            "Ask and answer where someone is from",
            "Use possessive adjectives my, your, his, her"
        ),
        listOf(
            v("Mr.", "آقای", "Mr. Brown is our teacher.", "آقای براون معلم ماست."),
            v("Mrs.", "خانم (متأهل)", "Mrs. Smith is married.", "خانم اسمیت متأهل است."),
            v("Miss", "خانم (مجرد)", "Miss Lee is young.", "خانم لی جوان است."),
            v("Ms.", "خانم (بدون اشاره به وضعیت)", "Ms. Jones is our boss.", "خانم جونز رئیس ماست."),
            v("first name", "نام کوچک", "Her first name is Sara.", "نام کوچکش سارا است."),
            v("last name", "نام خانوادگی", "His last name is Brown.", "نام خانوادگی‌اش براون است."),
            v("title", "عنوان", "What's your title?", "عنوانت چیه؟"),
            v("spell", "هجی کردن", "How do you spell your name?", "اسمت رو چطور هجی می‌کنی؟", "verb"),
            v("from", "از (اهل)", "I'm from Iran.", "من اهل ایرانم.", "preposition"),
            v("country", "کشور", "Which country are you from?", "اهل کدام کشوری؟"),
            v("city", "شهر", "I live in a big city.", "در شهر بزرگی زندگی می‌کنم."),
            v("capital", "پایتخت", "Tehran is the capital of Iran.", "تهران پایتخت ایران است."),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟"),
            v("phone number", "شماره تلفن", "My phone number is 555-1234.", "شماره تلفنم ۵۵۵-۱۲۳۴ است."),
            v("letter", "حرف (الفبا)", "How many letters are in your name?", "اسمت چند حرف داره؟")
        ),
        listOf(
            GrammarSection(
                "Titles: Mr., Mrs., Miss, Ms.",
                "Use Mr. for men, Mrs. for married women, Miss for unmarried women, and Ms. for any woman (when unsure). Ms. is the safest choice."
            ),
            GrammarSection(
                "First name vs last name",
                "In English, the first name is your given name, and the last name is your family name. Example: 'Sara Brown' — Sara is the first name, Brown is the last name."
            ),
            GrammarSection(
                "Possessive adjectives: my, your, his, her",
                "Use my for I, your for you, his for he, her for she. My name is Ali. Your name is Sara. His name is Reza. Her name is Maryam."
            ),
            GrammarSection(
                "Asking about origin: Where are you from?",
                "Use 'Where are you from?' to ask about origin. Answer: 'I'm from + country/city.'"
            )
        ),
        listOf(
            d("A", "Hello. Are you Mr. Brown?", "سلام. شما آقای براون هستید؟"),
            d("B", "No, I'm not. I'm Mr. Smith.", "نه. من آقای اسمیت هستم."),
            d("A", "Oh, I'm sorry. Mr. Smith, nice to meet you.", "اوه، متأسفم. آقای اسمیت، از آشنایی خوشحالم."),
            d("B", "Nice to meet you, too. What's your name?", "من هم خوشحالم. اسم شما چیه؟"),
            d("A", "My name is Anna Lopez. I'm a new student.", "اسم من آنا لوپز است. من دانش‌آموز جدیدم."),
            d("B", "Welcome, Anna. How do you spell your last name?", "خوش آمدی، آنا. نام خانوادگی‌ات رو چطور هجی می‌کنی؟"),
            d("A", "L-O-P-E-Z.", "ل-و-پ-ز."),
            d("B", "Thank you. And where are you from?", "ممنون. اهل کجایی؟"),
            d("A", "I'm from Mexico. I live in Mexico City.", "من اهل مکزیکم. در مکزیکو سیتی زندگی می‌کنم."),
            d("B", "Mexico City! That's the capital of Mexico, right?", "مکزیکو سیتی! پایتخت مکزیکه، درسته؟"),
            d("A", "Yes, that's right.", "بله، درسته."),
            d("B", "Great. What's your phone number, Anna?", "عالی. شماره تلفنت چیه، آنا؟"),
            d("A", "It's 555-7890.", "۵۵۵-۷۸۹۰."),
            d("B", "And your address?", "و آدرست؟"),
            d("A", "It's 25 Park Street.", "خیابان پارک، شماره ۲۵."),
            d("B", "Perfect. Let me check... Here's your student card.", "عالی. بذار چک کنم... این کارت دانش‌آموزیته."),
            d("A", "Thank you, Mr. Smith.", "ممنون، آقای اسمیت."),
            d("B", "You're welcome. If you need anything, just ask me.", "خواهش می‌کنم. اگر چیزی لازم داشتی، فقط از من بپرس."),
            d("A", "I will. Thanks again!", "می‌کنم. بازم ممنون!"),
            d("B", "Have a good first day, Anna.", "روز اول خوبی داشته باشی، آنا."),
            d("A", "Thank you! Goodbye!", "ممنون! خداحافظ!")
        ),
        listOf(
            q("Which title is for a married woman?", listOf("Miss", "Mrs.", "Ms.", "Mr."), 1),
            q("Which title is safe for any woman?", listOf("Miss", "Mrs.", "Ms.", "Mr."), 2),
            q("Anna's last name is...", listOf("Anna", "Lopez", "Mexico", "Smith"), 1),
            q("Where is Anna from?", listOf("Spain", "Mexico", "America", "Brazil"), 1),
            q("Complete: ___ name is Sara.", listOf("I", "My", "Me", "Mine"), 1),
            q("Complete: Her name ___ Maryam.", listOf("am", "is", "are", "be"), 1),
            q("What's the capital of Mexico?", listOf("Cancún", "Guadalajara", "Mexico City", "Monterrey"), 2),
            q("Complete: Where ___ you from?", listOf("is", "am", "are", "be"), 2)
        ),
        idioms = listOf(
            IdiomExpression("That's right", "درسته", "Mexico City is the capital, right? — Yes, that's right.", "مکزیکو سیتی پایتخته، درسته؟ — بله، درسته."),
            IdiomExpression("Let me check", "بذار چک کنم", "Let me check... Here's your card.", "بذار چک کنم... این کارتته."),
            IdiomExpression("You're welcome", "خواهش می‌کنم", "Thank you! — You're welcome.", "ممنون! — خواهش می‌کنم."),
            IdiomExpression("If you need anything", "اگر چیزی لازم داشتی", "If you need anything, just ask.", "اگر چیزی لازم داشتی، فقط بپرس.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "come from", "اهل جایی بودن", "be from a place",
                "I come from Mexico.", "من اهل مکزیکم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Spelling names", "When spelling, use letters clearly. Common letters: A /eɪ/, B /biː/, C /siː/, D /diː/, E /iː/."),
            PronunciationTip("Silent letters in names", "In 'Smith', the 'h' is silent. In 'Lopez', the 'z' is soft."),
            PronunciationTip("Stress in country names", "Mexico: MEX-i-co /ˈmɛksɪkoʊ/. America: a-MER-i-ca /əˈmɛrɪkə/.")
        ),
        culture = listOf(
            CulturalNote(
                "Using titles",
                "In formal situations, use titles with last names. In casual situations, first names are fine. If unsure, ask: 'What should I call you?'"
            ),
            CulturalNote(
                "Ms. — a safe choice",
                "The title 'Ms.' is used for any woman, regardless of marital status. It's the safest choice when you don't know."
            )
        ),
        mistakes = listOf(
            CommonMistake("Mr. Anna", "Ms. Anna or Miss Anna", "Use the correct title for women."),
            CommonMistake("Her name is Mr. Brown.", "Her name is Mrs. Brown.", "Match title with gender."),
            CommonMistake("I am from the Iran.", "I am from Iran.", "Don't use 'the' with country names (except a few, like the United States).")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's Anna's last name and how is it spelled?", "Lopez. L-O-P-E-Z."),
            ComprehensionQuestion("What is Anna's phone number?", "555-7890.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Introduce yourself with your first name, last name, and country.",
                "خودت را با نام کوچک، نام خانوادگی و کشورت معرفی کن.",
                "My first name is... My last name is... I'm from..."
            ),
            SpeakingTask(
                "Spell your name to a partner.",
                "اسمت رو برای یک دوست هجی کن.",
                "My name is spelled..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write your full name, address, phone number, and country.",
                "نام کامل، آدرس، شماره تلفن و کشورت رو بنویس.",
                50,
                "Include title (Mr./Ms./etc.) and spell your name."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 3 — Countries and Nationalities | کشورها و ملیت‌ها
    // ═══════════════════════════════════════════════════════════
    private fun lesson3() = base(
        3, "Countries and Nationalities", "کشورها و ملیت‌ها",
        listOf(
            "Name countries and nationalities",
            "Ask and answer where someone is from",
            "Use plural nouns for nationalities",
            "Use the verb be with we, they"
        ),
        listOf(
            v("Iran", "ایران", "I'm from Iran.", "من اهل ایرانم."),
            v("Iranian", "ایرانی", "She's Iranian.", "او ایرانیه.", "adjective"),
            v("America", "آمریکا", "He's from America.", "او اهل آمریکاست."),
            v("American", "آمریکایی", "She's American.", "او آمریکاییه.", "adjective"),
            v("England", "انگلستان", "They're from England.", "اونا اهل انگلستانن."),
            v("English", "انگلیسی", "He's English.", "او انگلیسیه.", "adjective"),
            v("Turkey", "ترکیه", "I'm from Turkey.", "من اهل ترکیه‌ام."),
            v("Turkish", "ترکی", "She's Turkish.", "او ترکیه.", "adjective"),
            v("Japan", "ژاپن", "He's from Japan.", "او اهل ژاپنه."),
            v("Japanese", "ژاپنی", "She's Japanese.", "او ژاپنیه.", "adjective"),
            v("France", "فرانسه", "We're from France.", "ما اهل فرانسه‌ایم."),
            v("French", "فرانسوی", "They're French.", "اونا فرانسوین.", "adjective"),
            v("China", "چین", "He's from China.", "او اهل چینه."),
            v("Chinese", "چینی", "She's Chinese.", "او چینیه.", "adjective"),
            v("Russia", "روسیه", "They're from Russia.", "اونا اهل روسیه‌ان."),
            v("Russian", "روسی", "He's Russian.", "او روسیه.", "adjective"),
            v("country", "کشور", "What country are you from?", "اهل کدام کشوری؟"),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیه؟"),
            v("capital", "پایتخت", "What's the capital of France?", "پایتخت فرانسه کجاست؟"),
            v("language", "زبان", "What language do they speak?", "چه زبانی صحبت می‌کنن؟")
        ),
        listOf(
            GrammarSection(
                "Countries and nationalities",
                "Countries end in different ways: Iran → Iranian, Turkey → Turkish. Many nationalities end in -ish, -an, -ese, or -i."
            ),
            GrammarSection(
                "Verb be: We are / They are",
                "Use are with we and they. We are from Iran. They are from Turkey. Contractions: we're, they're."
            ),
            GrammarSection(
                "Questions about origin",
                "Where are you from? Where is he from? Where are they from? Answer: I'm/He's/They're from + country."
            ),
            GrammarSection(
                "What language do they speak?",
                "Use 'speak' to talk about languages. I speak Persian. She speaks English."
            )
        ),
        listOf(
            d("A", "Hi! Are you from Turkey?", "سلام! اهل ترکیه‌ای؟"),
            d("B", "No, I'm not. I'm from Iran.", "نه. من اهل ایرانم."),
            d("A", "Oh, I'm sorry. Iran is a beautiful country.", "اوه، متأسفم. ایران کشور زیبایی است."),
            d("B", "Yes, it is. Where are you from?", "بله، هست. تو اهل کجایی؟"),
            d("A", "I'm from France. I'm French.", "من اهل فرانسه‌ام. فرانسوی‌ام."),
            d("B", "Nice! What's the capital of France?", "خوبه! پایتخت فرانسه کجاست؟"),
            d("A", "It's Paris. Have you been there?", "پاریس. اونجا بوده‌ای؟"),
            d("B", "No, I haven't. But I'd love to go.", "نه، نبوده‌ام. ولی دوست دارم برم."),
            d("A", "It's a wonderful city. What language do you speak?", "شهر فوق‌العاده‌ایه. چه زبانی صحبت می‌کنی؟"),
            d("B", "I speak Persian and a little English.", "فارسی و یه کم انگلیسی صحبت می‌کنم."),
            d("A", "Your English is very good!", "انگلیسی‌ت خیلی خوبه!"),
            d("B", "Thank you. Do you speak French?", "ممنون. تو فرانسوی صحبت می‌کنی؟"),
            d("A", "Yes, it's my first language. And I speak some English too.", "بله، زبان مادری‌مه. و یه کم انگلیسی هم صحبت می‌کنم."),
            d("B", "Are you here on vacation?", "اینجا برای تعطیلاتی؟"),
            d("A", "Yes, I am. I'm visiting for two weeks.", "بله. دو هفته است که اینجام."),
            d("B", "Nice! Are your friends here too?", "خوبه! دوستات هم اینجان؟"),
            d("A", "Yes, they are. They're from England.", "بله. اونا اهل انگلستانن."),
            d("B", "Oh, so they're English?", "اوه، پس انگلیسی‌ان؟"),
            d("A", "Yes, they're English. But they live in France now.", "بله، انگلیسی‌ان. ولی الان تو فرانسه زندگی می‌کنن."),
            d("B", "That's interesting. We have international friends!", "جالبه. ما دوستای بین‌المللی داریم!")
        ),
        listOf(
            q("Where is B from?", listOf("Turkey", "France", "Iran", "England"), 2),
            q("Where is A from?", listOf("Turkey", "France", "Iran", "England"), 1),
            q("What's the capital of France?", listOf("London", "Berlin", "Paris", "Rome"), 2),
            q("Where are A's friends from?", listOf("Iran", "France", "England", "America"), 2),
            q("Complete: We ___ from Iran.", listOf("am", "is", "are", "be"), 2),
            q("Complete: They ___ from Turkey.", listOf("am", "is", "are", "be"), 2),
            q("What nationality is someone from Japan?", listOf("Japanese", "Japan", "Japanish", "Japanian"), 0),
            q("What language do Iranians speak?", listOf("Arabic", "Persian", "Turkish", "English"), 1)
        ),
        idioms = listOf(
            IdiomExpression("I'd love to", "خیلی دوست دارم", "I'd love to visit Paris.", "خیلی دوست دارم پاریس رو ببینم."),
            IdiomExpression("That's interesting", "جالبه", "That's interesting. Tell me more.", "جالبه. بیشتر بگو."),
            IdiomExpression("Have you been there?", "اونجا بوده‌ای؟", "Paris? Have you been there?", "پاریس؟ اونجا بوده‌ای؟"),
            IdiomExpression("First language", "زبان مادری", "French is my first language.", "فرانسوی زبان مادری‌مه.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "come from", "اهل جایی بودن", "be from",
                "I come from Iran.", "من اهل ایرانم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Nationality endings", "Common endings: -ish (English), -an (Iranian, American), -ese (Japanese, Chinese), -i (Iraqi, Saudi)."),
            PronunciationTip("Stress in country names", "Iran: i-RAN /ɪˈræn/. Japan: ja-PAN /dʒəˈpæn/. America: a-MER-i-ca /əˈmɛrɪkə/."),
            PronunciationTip("Capital stress", "Capital: CAP-i-tal /ˈkæpɪtl/. The stress is on the first syllable.")
        ),
        culture = listOf(
            CulturalNote(
                "Asking about origin",
                "'Where are you from?' is a very common and friendly question. It's a good way to start a conversation with a new person."
            ),
            CulturalNote(
                "Nationality vs ethnicity",
                "Nationality refers to the country you're a citizen of. Ethnicity is different. In casual conversation, people often use nationality loosely."
            )
        ),
        mistakes = listOf(
            CommonMistake("I'm from the Iran.", "I'm from Iran.", "Don't use 'the' with country names."),
            CommonMistake("He's a Iranian.", "He's Iranian.", "Don't use 'a/an' with nationalities when used as adjectives."),
            CommonMistake("What country you from?", "What country are you from?", "In questions with 'be', the verb comes before the subject.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where is A from and what language does A speak?", "A is from France and speaks French and some English."),
            ComprehensionQuestion("Where are A's friends from?", "They're from England but live in France now.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Talk about your country and nationality with a partner.",
                "درباره کشور و ملیتت با یک دوست صحبت کن.",
                "I'm from... / I'm... / My country is..."
            ),
            SpeakingTask(
                "Ask a partner about their country, language, and capital.",
                "از یک دوست درباره کشور، زبان و پایتختش بپرس.",
                "Where are you from? / What language do you speak? / What's the capital?"
            )
        ),
        writing = listOf(
            WritingTask(
                "Write about your country and one other country.",
                "درباره کشور خودت و یک کشور دیگر بنویس.",
                80,
                "Include country, nationality, language, and capital."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 4 — Family | خانواده
    // ═══════════════════════════════════════════════════════════
    private fun lesson4() = base(
        4, "Family", "خانواده",
        listOf(
            "Name family members",
            "Talk about your family",
            "Use possessive 's",
            "Use have/has for family"
        ),
        listOf(
            v("mother", "مادر", "My mother is at home.", "مادرم خونه‌ست."),
            v("father", "پدر", "My father works here.", "پدرم اینجا کار می‌کنه."),
            v("mom", "مامان", "My mom is a teacher.", "مامانم معلمه."),
            v("dad", "بابا", "My dad is a doctor.", "بابام دکتره."),
            v("parents", "والدین", "My parents live in Tehran.", "والدینم تو تهران زندگی می‌کنن."),
            v("brother", "برادر", "I have one brother.", "من یه برادر دارم."),
            v("sister", "خواهر", "She has two sisters.", "او دو خواهر داره."),
            v("son", "پسر", "Their son is ten.", "پسرشون ده سالشه."),
            v("daughter", "دختر", "Her daughter is a student.", "دخترش دانش‌آموزه."),
            v("grandmother", "مادربزرگ", "My grandmother is 70.", "مادربزرگم ۷۰ سالشه."),
            v("grandfather", "پدربزرگ", "My grandfather is retired.", "پدربزرگم بازنشسته‌ست."),
            v("grandparents", "پدربزرگ و مادربزرگ", "My grandparents live with us.", "پدربزرگ و مادربزرگم با ما زندگی می‌کنن."),
            v("uncle", "عمو/دایی", "My uncle is from Canada.", "عمویم اهل کاناداست."),
            v("aunt", "عمه/خاله", "My aunt is a nurse.", "خاله‌ام پرستاره."),
            v("cousin", "پسرعمو/دخترخاله", "I have five cousins.", "من پنج تا پسرعمو دارم."),
            v("husband", "شوهر", "Her husband is a teacher.", "شوهرش معلمه."),
            v("wife", "همسر (زن)", "His wife is from Iran.", "همسرش اهل ایرانه."),
            v("family", "خانواده", "I have a big family.", "من خانواده بزرگی دارم."),
            v("married", "متأهل", "She's married.", "او متأهله.", "adjective"),
            v("single", "مجرد", "He's single.", "او مجرده.", "adjective")
        ),
        listOf(
            GrammarSection(
                "Possessive 's",
                "Use 's to show family relationships. Ali's brother = the brother of Ali. My father's name = the name of my father."
            ),
            GrammarSection(
                "Have / Has for family",
                "Use 'have' with I, you, we, they and 'has' with he, she, it. I have two brothers. She has one sister."
            ),
            GrammarSection(
                "This is my...",
                "Use 'This is my...' to introduce family members. This is my mother. This is my sister. These are my parents."
            ),
            GrammarSection(
                "Questions about family",
                "Do you have brothers or sisters? How many brothers do you have? Is he married?"
            )
        ),
        listOf(
            d("A", "Hi, Samira! Is this a photo of your family?", "سلام، سمیرا! این عکس خانوادته؟"),
            d("B", "Yes, it is. This is my mother and father.", "بله. این مادرم و پدرمه."),
            d("A", "They look nice. What does your mother do?", "خوب به نظر میان. مادرت چه‌کاره‌ست؟"),
            d("B", "She's a teacher. She teaches math.", "معلمه. ریاضی درس می‌ده."),
            d("A", "And your father?", "و پدرت؟"),
            d("B", "He's an engineer. He works at a company.", "مهندسه. تو یه شرکت کار می‌کنه."),
            d("A", "Who's this next to your mother?", "کی کنار مادرته؟"),
            d("B", "That's my sister, Leyla.", "اون خواهرم، لیلاست."),
            d("A", "Is she older or younger than you?", "از تو بزرگ‌تره یا کوچک‌تر؟"),
            d("B", "She's older. She's 25.", "بزرگ‌تره. ۲۵ سالشه."),
            d("A", "Is she married?", "متأهله؟"),
            d("B", "Yes, she is. Her husband is a doctor.", "بله. شوهرش دکتره."),
            d("A", "That's great. Do you have any brothers?", "عالیه. برادر هم داری؟"),
            d("B", "Yes, I have one brother. He's younger.", "بله، یه برادر دارم. کوچک‌تره."),
            d("A", "How old is he?", "چند سالشه؟"),
            d("B", "He's 15. He's a student.", "۱۵ سالشه. دانش‌آموزه."),
            d("A", "Nice. And who's this little girl?", "خوبه. و این دختر کوچولو کیه؟"),
            d("B", "That's my cousin's daughter. Her name is Mina.", "دختر عمو/خاله‌ام. اسمش میناست."),
            d("A", "What a lovely family!", "چه خانواده دوست‌داشتنی‌ای!"),
            d("B", "Thank you! Do you have a big family?", "ممنون! تو خانواده بزرگی داری؟"),
            d("A", "Not really. Just my parents and me.", "نه زیاد. فقط والدینم و خودم.")
        ),
        listOf(
            q("What does Samira's mother do?", listOf("engineer", "teacher", "doctor", "nurse"), 1),
            q("How old is Samira's sister?", listOf("15", "20", "25", "30"), 2),
            q("Is Samira's sister married?", listOf("Yes", "No", "Not yet", "We don't know"), 0),
            q("How old is Samira's brother?", listOf("15", "20", "25", "12"), 0),
            q("Complete: She ___ one sister.", listOf("have", "has", "haves", "having"), 1),
            q("Complete: I ___ two brothers.", listOf("has", "have", "haves", "having"), 1),
            q("Complete: This is my ___ house.", listOf("mother", "mother's", "mothers", "of mother"), 1),
            q("Complete: They ___ three children.", listOf("has", "have", "haves", "having"), 1)
        ),
        idioms = listOf(
            IdiomExpression("This is...", "این ... است", "This is my mother.", "این مادرمه."),
            IdiomExpression("These are...", "این‌ها ... هستند", "These are my parents.", "این‌ها والدینمن."),
            IdiomExpression("What a lovely family!", "چه خانواده دوست‌داشتنی‌ای!", "What a lovely family!", "چه خانواده دوست‌داشتنی‌ای!"),
            IdiomExpression("Older/younger than", "بزرگ‌تر/کوچک‌تر از", "She's older than me.", "از من بزرگ‌تره.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "look after", "مراقبت کردن", "take care of",
                "She looks after her little brother.", "او مراقب برادر کوچکشه.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("th sound", "Mother /ˈmʌðər/ and father /ˈfɑːðər/ — tongue between teeth."),
            PronunciationTip("Possessive 's", "Ali's /ˈæliz/ — if a name ends in 's', the sound is /ɪz/: Chris's /ˈkrɪsɪz/."),
            PronunciationTip("Compound family words", "Grandmother: GRAND-mother. Grandfather: GRAND-father.")
        ),
        culture = listOf(
            CulturalNote(
                "Family structure in English-speaking countries",
                "In many English-speaking countries, 'nuclear family' means parents and children. 'Extended family' includes grandparents, uncles, aunts, and cousins."
            ),
            CulturalNote(
                "Asking about family",
                "'Do you have any brothers or sisters?' is a very common and friendly question in many cultures."
            )
        ),
        mistakes = listOf(
            CommonMistake("She have one sister.", "She has one sister.", "Use 'has' with she/he/it."),
            CommonMistake("This is mother's Ali.", "This is Ali's mother.", "Possessive 's comes after the owner's name."),
            CommonMistake("I have 25 years.", "I'm 25 years old.", "Use 'I am... years old' for age.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Who is in Samira's family photo?", "Her mother, father, sister Leyla, brother, and her cousin's daughter Mina."),
            ComprehensionQuestion("What does Samira's sister's husband do?", "He's a doctor.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Introduce your family members to a partner.",
                "اعضای خانواده‌ات رو به یک دوست معرفی کن.",
                "This is my... / These are my..."
            ),
            SpeakingTask(
                "Ask a partner about their family.",
                "از یک دوست درباره خانواده‌اش بپرس.",
                "Do you have...? / How many...? / Is he/she married?"
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a paragraph about your family.",
                "یه پاراگراف درباره خانواده‌ات بنویس.",
                80,
                "Include at least 4 family members and their ages."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 5 — Numbers and Age | اعداد و سن
    // ═══════════════════════════════════════════════════════════
    private fun lesson5() = base(
        5, "Numbers and Age", "اعداد و سن",
        listOf(
            "Count from 0 to 100",
            "Say your age and ask about age",
            "Use numbers in phone numbers and addresses",
            "Use 'How old are you?'"
        ),
        listOf(
            v("zero", "صفر", "My phone number starts with zero.", "شماره تلفنم با صفر شروع می‌شه."),
            v("one", "یک", "I have one brother.", "من یه برادر دارم."),
            v("two", "دو", "She has two cats.", "اون دو تا گربه داره."),
            v("three", "سه", "There are three books.", "سه تا کتاب هست."),
            v("four", "چهار", "We have four classes.", "ما چهار تا کلاس داریم."),
            v("five", "پنج", "I'm five minutes late.", "پنج دقیقه دیر کردم."),
            v("six", "شش", "The class starts at six.", "کلاس ساعت شش شروع می‌شه."),
            v("seven", "هفت", "I wake up at seven.", "ساعت هفت بیدار می‌شم."),
            v("eight", "هشت", "The store opens at eight.", "مغازه ساعت هشت باز می‌شه."),
            v("nine", "نه", "The class is at nine.", "کلاس ساعت نه‌ست."),
            v("ten", "ده", "I have ten fingers.", "من ده تا انگشت دارم."),
            v("eleven", "یازده", "He's eleven years old.", "اون یازده سالشه."),
            v("twelve", "دوازده", "There are twelve months.", "دوازده ماه هست."),
            v("twenty", "بیست", "I have twenty books.", "من بیست تا کتاب دارم."),
            v("thirty", "سی", "She's thirty years old.", "اون سی سالشه."),
            v("forty", "چهل", "My father is forty.", "پدرم چهل سالشه."),
            v("fifty", "پنجاه", "The bag is fifty dollars.", "کیف پنجاه دلاره."),
            v("hundred", "صد", "I have a hundred dollars.", "من صد دلار دارم."),
            v("age", "سن", "What's your age?", "سنت چنده؟"),
            v("old", "سال (داشتن)", "How old are you?", "چند سالته؟", "adjective"),
            v("years old", "سال سن", "I'm 25 years old.", "من ۲۵ سالمه."),
            v("birthday", "تولد", "My birthday is in May.", "تولدم تو ماه مه‌ست."),
            v("phone number", "شماره تلفن", "What's your phone number?", "شماره تلفنت چیه؟"),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟")
        ),
        listOf(
            GrammarSection(
                "Numbers 1-100",
                "Learn the basic numbers. 13-19: thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen. Tens: twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety, one hundred."
            ),
            GrammarSection(
                "How old are you?",
                "Use 'How old are you?' to ask someone's age. Answer: 'I'm + number + (years old).'"
            ),
            GrammarSection(
                "Numbers in phone numbers and addresses",
                "Read phone numbers digit by digit: 5-5-5, 7-8-9-0. For addresses, use numbers and street names."
            ),
            GrammarSection(
                "Verb be with age",
                "Use the verb 'be' for age, not 'have'. I'm 25. NOT: I have 25."
            )
        ),
        listOf(
            d("A", "Hi! Are you the new student?", "سلام! تو دانش‌آموز جدیدی؟"),
            d("B", "Yes, I am. My name is Kian.", "بله. اسم من کیانه."),
            d("A", "Nice to meet you, Kian. How old are you?", "از آشنایی خوشحالم، کیان. چند سالته؟"),
            d("B", "I'm twenty years old. And you?", "بیست سالمه. تو چطور؟"),
            d("A", "I'm twenty-two.", "من بیست و دو سالمه."),
            d("B", "When is your birthday?", "تولدت کِیه؟"),
            d("A", "It's on May 5th.", "پنجم مه."),
            d("B", "Nice! Mine is in November.", "خوبه! مال من نوامبره."),
            d("A", "How many brothers and sisters do you have?", "چند تا خواهر و برادر داری؟"),
            d("B", "I have two sisters and one brother.", "دو خواهر و یه برادر دارم."),
            d("A", "How old are they?", "چند سالشونه؟"),
            d("B", "My sisters are eighteen and twenty. My brother is twelve.", "خواهرام هجده و بیست سالشونه. برادرم دوازده سالشه."),
            d("A", "That's a nice mix of ages.", "ترکیب سنی خوبیه."),
            d("B", "Yes, it is. What's your phone number? We can study together.", "بله. شماره تلفنت چیه؟ می‌تونیم با هم درس بخونیم."),
            d("A", "Great idea! It's 555-2468.", "فکر عالی! ۵۵۵-۲۴۶۸."),
            d("B", "Let me write that down. 5-5-5, 2-4-6-8?", "بذار یادداشت کنم. ۵-۵-۵، ۲-۴-۶-۸؟"),
            d("A", "Yes, that's right. What about your number?", "بله، درسته. شماره تو چیه؟"),
            d("B", "It's 555-1357.", "۵۵۵-۱۳۵۷."),
            d("A", "Got it. Let's meet on Saturday at 10.", "گرفتم. شنبه ساعت ۱۰ قرار بذاریم."),
            d("B", "Perfect. See you Saturday!", "عالی. شنبه می‌بینمت!")
        ),
        listOf(
            q("How old is Kian?", listOf("18", "20", "22", "25"), 1),
            q("When is A's birthday?", listOf("May 5th", "November", "March", "August"), 0),
            q("How many sisters does Kian have?", listOf("one", "two", "three", "four"), 1),
            q("What is Kian's phone number?", listOf("555-2468", "555-1357", "555-1234", "555-5678"), 1),
            q("Complete: I ___ twenty years old.", listOf("have", "has", "am", "is"), 2),
            q("Complete: She ___ two brothers.", listOf("have", "has", "is", "am"), 1),
            q("How do you write 40?", listOf("fourty", "forty", "fourteen", "four"), 1),
            q("What number is this: eighteen?", listOf("80", "8", "18", "88"), 2)
        ),
        idioms = listOf(
            IdiomExpression("How old are you?", "چند سالته؟", "How old are you?", "چند سالته؟"),
            IdiomExpression("Let me write that down", "بذار یادداشت کنم", "Let me write that down.", "بذار یادداشت کنم."),
            IdiomExpression("Got it", "گرفتم / فهمیدم", "Got it. See you Saturday!", "گرفتم. شنبه می‌بینمت!"),
            IdiomExpression("What about...?", "...چطور؟", "What about your number?", "شماره تو چیه؟")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "write down", "یادداشت کردن", "write on paper",
                "Let me write that down.", "بذار یادداشت کنم.", "Yes"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Teens vs tens", "13 = thirTEEN (stress on second syllable). 30 = THIRty (stress on first syllable)."),
            PronunciationTip("-teen numbers", "Thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen. Note the change in five → fifteen, eight → eighteen."),
            PronunciationTip("Phone number rhythm", "Say phone numbers in small groups: 555-1234 = 'five five five, one two three four'.")
        ),
        culture = listOf(
            CulturalNote(
                "Asking about age",
                "In many English-speaking countries, asking someone's age directly is considered fine in casual situations but may be sensitive with older adults. In formal contexts, it's often avoided."
            ),
            CulturalNote(
                "Numbers in addresses",
                "In English-speaking countries, addresses are usually: number + street name + street type (e.g., 25 Park Street)."
            )
        ),
        mistakes = listOf(
            CommonMistake("I have 25 years.", "I'm 25 years old.", "Use 'be' for age, not 'have'."),
            CommonMistake("fourty", "forty", "The correct spelling is 'forty' — no 'u'."),
            CommonMistake("I'm 25 years.", "I'm 25 (years old).", "'Years old' is optional.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How old is Kian and when is his birthday?", "He's 20 and his birthday is in November."),
            ComprehensionQuestion("What are Kian's siblings' ages?", "His sisters are 18 and 20, and his brother is 12.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Say your age and ask a partner theirs.",
                "سنت رو بگو و از یک دوست بپرس.",
                "I'm... years old. How old are you?"
            ),
            SpeakingTask(
                "Practice saying phone numbers with a partner.",
                "تمرین کن شماره تلفن رو با یک دوست بگی.",
                "My phone number is..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write your age, birthday, and phone number.",
                "سنت، تاریخ تولد و شماره تلفنت رو بنویس.",
                50,
                "Use complete sentences."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 6 — Jobs | شغل‌ها
    // ═══════════════════════════════════════════════════════════
    private fun lesson6() = base(
        6, "Jobs", "شغل‌ها",
        listOf(
            "Name common jobs",
            "Ask and answer about jobs",
            "Use a/an with jobs",
            "Use 'What do you do?'"
        ),
        listOf(
            v("teacher", "معلم", "My mother is a teacher.", "مادرم معلمه."),
            v("student", "دانش‌آموز", "I'm a student.", "من دانش‌آموزم."),
            v("doctor", "دکتر", "He's a doctor.", "اون دکتره."),
            v("nurse", "پرستار", "She's a nurse.", "اون پرستاره."),
            v("engineer", "مهندس", "My father is an engineer.", "پدرم مهندسه."),
            v("driver", "راننده", "He's a bus driver.", "اون راننده اتوبوسه."),
            v("cook", "آشپز", "She's a cook at a restaurant.", "اون آشپز یه رستورانه."),
            v("waiter", "پیشخدمت", "He's a waiter.", "اون پیشخدمته."),
            v("police officer", "پلیس", "The police officer is here.", "افسر پلیس اینجاست."),
            v("firefighter", "آتش‌نشان", "Firefighters are brave.", "آتش‌نشان‌ها شجاعن."),
            v("singer", "خواننده", "She's a famous singer.", "اون خواننده معروفیه."),
            v("artist", "هنرمند", "He's an artist.", "اون هنرمنده."),
            v("writer", "نویسنده", "She's a writer.", "اون نویسنده‌ست."),
            v("businessman", "تاجر", "He's a businessman.", "اون تاجره."),
            v("businesswoman", "تاجر (زن)", "She's a businesswoman.", "اون تاجره."),
            v("housewife", "خانه‌دار", "My mother is a housewife.", "مادرم خانه‌داره."),
            v("job", "شغل", "What's your job?", "شغلت چیه؟"),
            v("work", "کار کردن", "I work at a bank.", "من تو یه بانک کار می‌کنم.", "verb"),
            v("office", "دفتر", "She works in an office.", "اون تو یه دفتر کار می‌کنه."),
            v("hospital", "بیمارستان", "He works at a hospital.", "اون تو یه بیمارستان کار می‌کنه.")
        ),
        listOf(
            GrammarSection(
                "A / An with jobs",
                "Use 'a' before consonant sounds and 'an' before vowel sounds. He's a doctor. She's an engineer. He's an artist."
            ),
            GrammarSection(
                "What do you do?",
                "Use 'What do you do?' to ask about jobs. Answer: 'I'm a/an + job.'"
            ),
            GrammarSection(
                "Where do you work?",
                "Use 'Where do you work?' to ask about workplace. Answer: 'I work at/in + place.'"
            ),
            GrammarSection(
                "Verb be with jobs",
                "Use 'be' for jobs, not 'have'. I'm a teacher. NOT: I have a teacher."
            )
        ),
        listOf(
            d("A", "Hi! What do you do?", "سلام! شغلت چیه؟"),
            d("B", "I'm a nurse. I work at a hospital.", "پرستارم. تو یه بیمارستان کار می‌کنم."),
            d("A", "That's a great job! Is it hard?", "شغل عالیه! سخته؟"),
            d("B", "Sometimes. But I love helping people.", "گاهی. ولی عاشق کمک به مردمم."),
            d("A", "How long have you been a nurse?", "چند وقته پرستاری؟"),
            d("B", "For about five years. And you? What do you do?", "حدود پنج سال. تو چطور؟ شغلت چیه؟"),
            d("A", "I'm a teacher. I teach English.", "معلمم. انگلیسی درس می‌دم."),
            d("B", "That's interesting! Where do you work?", "جالبه! کجا کار می‌کنی؟"),
            d("A", "At a language school downtown.", "یه آموزشگاه زبان تو مرکز شهر."),
            d("B", "Do you like your job?", "شغلت رو دوست داری؟"),
            d("A", "Yes, I love it. My students are great.", "بله، عاشقشم. دانش‌آموزام عالی‌ان."),
            d("B", "How many students do you have?", "چند تا دانش‌آموز داری؟"),
            d("A", "About thirty. They're from many countries.", "حدود سی تا. از کشورهای زیادی‌ان."),
            d("B", "Wow! Are you a full-time teacher?", "واو! معلم تمام‌وقتی هستی؟"),
            d("A", "No, I'm part-time. I also work as a writer.", "نه، پاره‌وقتم. به عنوان نویسنده هم کار می‌کنم."),
            d("B", "Really? What do you write?", "واقعاً؟ چی می‌نویسی؟"),
            d("A", "Short stories and articles. It's my hobby too.", "داستان کوتاه و مقاله. سرگرمیم هم هست."),
            d("B", "That's wonderful. You have two jobs!", "فوق‌العاده‌ست. دو تا شغل داری!"),
            d("A", "Yes, but they're both fun. What about your family?", "بله، ولی هر دو سرگرم‌کننده‌ان. خانواده‌ات چطور؟"),
            d("B", "My husband is a chef. He works at a restaurant.", "شوهرم سرآشپزه. تو یه رستوران کار می‌کنه."),
            d("A", "Nice! What kind of food does he cook?", "خوبه! چه نوع غذایی می‌پزه؟"),
            d("B", "He cooks Italian and French food. It's delicious!", "غذای ایتالیایی و فرانسوی می‌پزه. خوشمزه‌ست!")
        ),
        listOf(
            q("What does B do?", listOf("teacher", "doctor", "nurse", "chef"), 2),
            q("Where does B work?", listOf("at a school", "at a hospital", "at a restaurant", "at an office"), 1),
            q("What does A do?", listOf("nurse", "teacher and writer", "doctor", "chef"), 1),
            q("What does B's husband do?", listOf("teacher", "doctor", "chef", "writer"), 2),
            q("Complete: She's ___ engineer.", listOf("a", "an", "the", "some"), 1),
            q("Complete: He's ___ doctor.", listOf("a", "an", "the", "some"), 0),
            q("Complete: What ___ you do?", listOf("is", "am", "are", "do"), 3),
            q("Complete: Where ___ you work?", listOf("is", "am", "are", "do"), 3)
        ),
        idioms = listOf(
            IdiomExpression("What do you do?", "شغلت چیه؟", "What do you do?", "شغلت چیه؟"),
            IdiomExpression("Full-time / Part-time", "تمام‌وقت / پاره‌وقت", "I'm a full-time teacher.", "من معلم تمام‌وقتم."),
            IdiomExpression("That's a great job!", "شغل عالیه!", "That's a great job!", "شغل عالیه!"),
            IdiomExpression("Work as a...", "کار کردن به عنوان...", "I work as a writer.", "به عنوان نویسنده کار می‌کنم.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "work as", "کار کردن به عنوان", "have a job as",
                "I work as a nurse.", "من به عنوان پرستار کار می‌کنم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Job word stress", "TEACHer, DOCtor, ENgineer (but: engiNEER has stress on last syllable)."),
            PronunciationTip("A vs An with jobs", "A DOCTOR /ə ˈdɒktər/. An ENGINEER /ən ˌɛndʒɪˈnɪər/. Listen to the sound, not the spelling."),
            PronunciationTip("Hospital", "HOS-pi-tal /ˈhɒspɪtl/ — three syllables, stress on first.")
        ),
        culture = listOf(
            CulturalNote(
                "Talking about jobs",
                "'What do you do?' is one of the most common questions when meeting someone new. It's a polite way to start a conversation."
            ),
            CulturalNote(
                "Job titles and gender",
                "Modern English often uses gender-neutral job titles: firefighter (not fireman), police officer (not policeman), flight attendant (not stewardess)."
            )
        ),
        mistakes = listOf(
            CommonMistake("I'm teacher.", "I'm a teacher.", "Use 'a/an' before jobs."),
            CommonMistake("I'm a engineer.", "I'm an engineer.", "Use 'an' before vowel sounds."),
            CommonMistake("What you do?", "What do you do?", "In questions, use do + subject + verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does A do?", "A is a teacher and a writer."),
            ComprehensionQuestion("What does B's husband do?", "He's a chef at a restaurant.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Talk about your job or your dream job.",
                "درباره شغلت یا شغل رویایی‌ات صحبت کن.",
                "I'm a... / I work as a... / I want to be a..."
            ),
            SpeakingTask(
                "Ask a partner about their job and workplace.",
                "از یک دوست درباره شغل و محل کارش بپرس.",
                "What do you do? / Where do you work? / Do you like your job?"
            )
        ),
        writing = listOf(
            WritingTask(
                "Write about your job or the job of a family member.",
                "درباره شغلت یا شغل یکی از اعضای خانواده‌ات بنویس.",
                80,
                "Include job title, workplace, and why you like it."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 7 — Colors and Clothes | رنگ‌ها و لباس
    // ═══════════════════════════════════════════════════════════
    private fun lesson7() = base(
        7, "Colors and Clothes", "رنگ‌ها و لباس",
        listOf(
            "Name common colors",
            "Name common clothes items",
            "Describe what people are wearing",
            "Use color + clothing combinations"
        ),
        listOf(
            v("red", "قرمز", "Her shirt is red.", "پیراهنش قرمزه.", "adjective"),
            v("blue", "آبی", "The sky is blue.", "آسمون آبیه.", "adjective"),
            v("green", "سبز", "The grass is green.", "چمن سبزه.", "adjective"),
            v("yellow", "زرد", "The sun is yellow.", "خورشید زرده.", "adjective"),
            v("black", "مشکی", "His shoes are black.", "کفشاش مشکی‌ان.", "adjective"),
            v("white", "سفید", "She has a white dress.", "یه لباس سفید داره.", "adjective"),
            v("brown", "قهوه‌ای", "Her hair is brown.", "موهاش قهوه‌ایه.", "adjective"),
            v("orange", "نارنجی", "He likes orange shirts.", "پیراهن‌های نارنجی دوست داره.", "adjective"),
            v("pink", "صورتی", "The flower is pink.", "گل صورتیه.", "adjective"),
            v("gray", "خاکستری", "The cat is gray.", "گربه خاکستریه.", "adjective"),
            v("shirt", "پیراهن", "I'm wearing a blue shirt.", "پیراهن آبی پوشیدم."),
            v("T-shirt", "تی‌شرت", "This T-shirt is nice.", "این تی‌شرت قشنگه."),
            v("pants", "شلوار", "These pants are new.", "این شلوار نوئه."),
            v("jeans", "شلوار جین", "I wear jeans every day.", "هر روز جین می‌پوشم."),
            v("shoes", "کفش", "My shoes are black.", "کفشام مشکی‌ان."),
            v("dress", "لباس زنانه", "Her dress is beautiful.", "لباسش زیباست."),
            v("skirt", "دامن", "She's wearing a skirt.", "دامن پوشیده."),
            v("hat", "کلاه", "His hat is brown.", "کلاهش قهوه‌ایه."),
            v("jacket", "کاپشن / ژاکت", "This jacket is warm.", "این کاپشن گرمه."),
            v("socks", "جوراب", "My socks are white.", "جورابام سفیدن."),
            v("wear", "پوشیدن", "I wear a uniform to work.", "برای کار لباس فرم می‌پوشم.", "verb"),
            v("color", "رنگ", "What color is your shirt?", "پیراهنت چه رنگیه؟")
        ),
        listOf(
            GrammarSection(
                "Color + noun",
                "In English, the color comes before the noun. A red shirt. Blue shoes. NOT: a shirt red."
            ),
            GrammarSection(
                "This / These with clothes",
                "Use 'this' with singular clothes: This shirt is nice. Use 'these' with plural clothes: These shoes are new."
            ),
            GrammarSection(
                "Present continuous for wearing",
                "Use 'be + verb-ing' to describe what someone is wearing now. I'm wearing a blue shirt. She's wearing a red dress."
            ),
            GrammarSection(
                "Plural clothes",
                "Some clothes items are always plural in English: pants, shoes, socks, jeans, glasses. Use 'they are' / 'these are'."
            )
        ),
        listOf(
            d("A", "Wow! I love your outfit today.", "واو! امروز لباست رو دوست دارم."),
            d("B", "Thanks! I'm wearing my new clothes.", "ممنون! لباسای جدیدم رو پوشیدم."),
            d("A", "Is that a red T-shirt?", "این تی‌شرت قرمزه؟"),
            d("B", "Yes, it is. I love red. What about you?", "بله. عاشق قرمزم. تو چطور؟"),
            d("A", "I like blue and green. Green is my favorite.", "من آبی و سبز دوست دارم. سبز مورد علاقه‌مه."),
            d("B", "Nice! What color are your shoes?", "خوبه! کفشات چه رنگیه؟"),
            d("A", "They're black. What color are yours?", "مشکی‌ان. مال تو چه رنگیه؟"),
            d("B", "Mine are white. I like white shoes.", "مال من سفیدن. کفش سفید دوست دارم."),
            d("A", "White gets dirty easily!", "سفید زود کثیف می‌شه!"),
            d("B", "That's true. Do you have a favorite color?", "درسته. رنگ مورد علاقه داری؟"),
            d("A", "I really like brown. It's calm.", "قهوه‌ای رو واقعاً دوست دارم. آرومه."),
            d("B", "Brow is nice. What about pink?", "قهوه‌ای خوبه. صورتی چطور؟"),
            d("A", "Pink is OK for flowers, not for clothes!", "صورتی برای گل خوبه، نه برای لباس!"),
            d("B", "Haha! I agree. What are you wearing to the party?", "هاها! موافقم. به مهمونی چی می‌پوشی؟"),
            d("A", "I don't know yet. Maybe a black dress and silver shoes.", "هنوز نمی‌دونم. شاید لباس مشکی و کفش نقره‌ای."),
            d("B", "That sounds elegant.", "شیک به نظر می‌رسه."),
            d("A", "Thanks. What about you?", "ممنون. تو چطور؟"),
            d("B", "I'll wear a white shirt and blue jeans.", "من پیراهن سفید و شلوار جین آبی می‌پوشم."),
            d("A", "Simple and stylish. See you at the party!", "ساده و شیک. تو مهمونی می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What color is B's T-shirt?", listOf("blue", "red", "white", "black"), 1),
            q("What's A's favorite color?", listOf("blue", "green", "brown", "red"), 1),
            q("What color are B's shoes?", listOf("black", "white", "brown", "red"), 1),
            q("What will B wear to the party?", listOf("black dress", "white shirt and jeans", "red T-shirt", "green skirt"), 1),
            q("Complete: ___ shirt is red.", listOf("These", "This", "Those", "Them"), 1),
            q("Complete: ___ shoes are black.", listOf("This", "That", "These", "It"), 2),
            q("What color is 'yellow' in Persian?", listOf("آبی", "زرد", "قرمز", "سبز"), 1),
            q("What color is 'brown' in Persian?", listOf("قهوه‌ای", "نارنجی", "صورتی", "خاکستری"), 0)
        ),
        idioms = listOf(
            IdiomExpression("I love your outfit", "لباست رو دوست دارم", "I love your outfit today.", "امروز لباست رو دوست دارم."),
            IdiomExpression("What are you wearing?", "چی پوشیدی؟", "What are you wearing to the party?", "به مهمونی چی می‌پوشی؟"),
            IdiomExpression("That's true", "درسته", "That's true. White gets dirty easily.", "درسته. سفید زود کثیف می‌شه."),
            IdiomExpression("Simple and stylish", "ساده و شیک", "Simple and stylish. See you at the party!", "ساده و شیک. تو مهمونی می‌بینمت!")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "put on", "پوشیدن", "wear clothes",
                "Put on your jacket.", "کاپشنت رو بپوش.", "Yes"
            ),
            PhrasalVerb(
                "take off", "در آوردن", "remove clothes",
                "Take off your shoes.", "کفشات رو در بیار.", "Yes"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Colors and th", "Brown /braʊn/ has no 'th'. But 'white' has a silent 'h': /waɪt/."),
            PronunciationTip("Clothes", "Clothes /kloʊðz/ — the 'th' is voiced, and the final 's' sounds like /z/."),
            PronunciationTip("This / These vowel sound", "This /ðɪs/ (short 'i'). These /ðiːz/ (long 'ee').")
        ),
        culture = listOf(
            CulturalNote(
                "Colors and culture",
                "Colors have different meanings in different cultures. In many Western countries, black is formal or elegant. White is often used for weddings. Red can mean love or danger."
            ),
            CulturalNote(
                "Casual vs formal dress",
                "In many English-speaking countries, work and social dress code varies. Casual is common in daily life; formal suits or dresses are for special occasions."
            )
        ),
        mistakes = listOf(
            CommonMistake("A shirt red", "A red shirt", "Color comes before the noun."),
            CommonMistake("A pants", "Pants / A pair of pants", "Pants is plural. Use 'a pair of pants'."),
            CommonMistake("He wear a blue shirt.", "He's wearing a blue shirt.", "Use present continuous for wearing now.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is B wearing today?", "A red T-shirt and white shoes."),
            ComprehensionQuestion("What is A's favorite color?", "Brown — A says it's calm.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Describe what you're wearing today.",
                "توصیف کن امروز چی پوشیدی.",
                "I'm wearing... / My... is... / These... are..."
            ),
            SpeakingTask(
                "Talk about your favorite colors.",
                "درباره رنگ‌های مورد علاقه‌ات صحبت کن.",
                "I love... / My favorite color is... / I don't like..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a description of what your friend is wearing.",
                "توصیفی از لباس دوستت بنویس.",
                60,
                "Include at least 3 colors and 3 clothing items."
            )
        )
    )    // ═══════════════════════════════════════════════════════════
    // LESSON 8 — Days and Time | روزها و ساعت
    // ═══════════════════════════════════════════════════════════
    private fun lesson8() = base(
        8, "Days and Time", "روزها و ساعت",
        listOf(
            "Name the days of the week",
            "Tell the time",
            "Ask and answer about the time",
            "Use prepositions at, on, in with time"
        ),
        listOf(
            v("Monday", "دوشنبه", "I have class on Monday.", "دوشنبه کلاس دارم."),
            v("Tuesday", "سه‌شنبه", "Tuesday is my busy day.", "سه‌شنبه روز شلوغمه."),
            v("Wednesday", "چهارشنبه", "See you on Wednesday.", "چهارشنبه می‌بینمت."),
            v("Thursday", "پنجشنبه", "Thursday is almost the weekend.", "پنجشنبه تقریباً آخر هفته‌ست."),
            v("Friday", "جمعه", "Friday is my favorite day.", "جمعه روز مورد علاقه‌مه."),
            v("Saturday", "شنبه", "On Saturday, I rest.", "شنبه استراحت می‌کنم."),
            v("Sunday", "یکشنبه", "Sunday is a family day.", "یکشنبه روز خانواده‌ست."),
            v("morning", "صبح", "I wake up in the morning.", "صبح بیدار می‌شم."),
            v("afternoon", "بعدازظهر", "We have class in the afternoon.", "بعدازظهر کلاس داریم."),
            v("evening", "عصر", "I study in the evening.", "عصر درس می‌خونم."),
            v("night", "شب", "I sleep at night.", "شب می‌خوابم."),
            v("o'clock", "ساعت", "It's 7 o'clock.", "ساعت هفته."),
            v("hour", "ساعت (مدت)", "The class is one hour.", "کلاس یه ساعته."),
            v("minute", "دقیقه", "Wait a minute, please.", "یه دقیقه صبر کن، لطفاً."),
            v("time", "زمان / ساعت", "What time is it?", "ساعت چنده؟"),
            v("half past", "و نیم", "It's half past three.", "ساعت سه و نیمه."),
            v("quarter past", "و ربع", "It's quarter past five.", "ساعت پنج و ربع‌ه."),
            v("quarter to", "ربع به", "It's quarter to nine.", "ساعت نه کم ربع‌ه."),
            v("week", "هفته", "I have 7 days a week.", "هفته‌ای هفت روز دارم."),
            v("weekend", "آخر هفته", "I rest on the weekend.", "آخر هفته استراحت می‌کنم.")
        ),
        listOf(
            GrammarSection(
                "Days of the week",
                "Days always start with capital letters in English: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday."
            ),
            GrammarSection(
                "Telling the time",
                "It's + number + o'clock. It's 7 o'clock. It's half past seven (7:30). It's quarter past seven (7:15). It's quarter to eight (7:45)."
            ),
            GrammarSection(
                "At / On / In with time",
                "Use 'at' with clock times: at 7 o'clock. Use 'on' with days: on Monday. Use 'in' with parts of day: in the morning."
            ),
            GrammarSection(
                "Questions about time",
                "What time is it? What day is it? When is the class? — It's at 7. — It's on Monday."
            )
        ),
        listOf(
            d("A", "Hi! What time is it?", "سلام! ساعت چنده؟"),
            d("B", "It's half past three.", "ساعت سه و نیمه."),
            d("A", "Thanks. I have a class at four o'clock.", "ممنون. ساعت چهار کلاس دارم."),
            d("B", "Where's the class?", "کلاس کجاست؟"),
            d("A", "In room 205, on the second floor.", "اتاق ۲۰۵، طبقه دوم."),
            d("B", "What day do you have this class?", "چه روزی این کلاس رو داری؟"),
            d("A", "On Mondays and Wednesdays.", "دوشنبه‌ها و چهارشنبه‌ها."),
            d("B", "How long is the class?", "کلاس چقدر طول می‌کشه؟"),
            d("A", "It's two hours, from 4 to 6.", "دو ساعته، از ۴ تا ۶."),
            d("B", "That's long! Are you free on Friday?", "زیاده! جمعه آزادی؟"),
            d("A", "Yes, I'm free after 5 in the evening.", "بله، بعد از ۵ عصر آزادم."),
            d("B", "Great. Let's meet at 6 on Friday.", "عالی. جمعه ساعت ۶ قرار بذاریم."),
            d("A", "Perfect. Where should we meet?", "عالی. کجا قرار بذاریم؟"),
            d("B", "At the café near the park.", "کافه نزدیک پارک."),
            d("A", "Sounds good. What time do you get up on weekends?", "خوبه. آخر هفته‌ها چه ساعتی بیدار می‌شی؟"),
            d("B", "Around 9 or 10. I sleep late on Saturdays.", "حدود ۹ یا ۱۰. شنبه‌ها دیر می‌خوابم."),
            d("A", "Me too! Do you work on Sundays?", "منم! یکشنبه‌ها کار می‌کنی؟"),
            d("B", "Sometimes. But usually I rest on Sundays.", "گاهی. ولی معمولاً یکشنبه‌ها استراحت می‌کنم."),
            d("A", "Good. Well, see you on Friday at 6.", "خوبه. خب، جمعه ساعت ۶ می‌بینمت."),
            d("B", "See you then!", "تا اون موقع!")
        ),
        listOf(
            q("What time is it now?", listOf("3:00", "3:30", "4:00", "4:30"), 1),
            q("What time does A's class start?", listOf("3:00", "4:00", "5:00", "6:00"), 1),
            q("What days does A have class?", listOf("Monday, Wednesday", "Tuesday, Thursday", "Friday, Saturday", "Sunday, Monday"), 0),
            q("When will they meet?", listOf("Friday at 5", "Friday at 6", "Saturday at 6", "Sunday at 6"), 1),
            q("Complete: The class is ___ Monday.", listOf("at", "in", "on", "of"), 2),
            q("Complete: I wake up ___ 7 o'clock.", listOf("at", "on", "in", "of"), 0),
            q("Complete: We study ___ the evening.", listOf("at", "on", "in", "of"), 2),
            q("What is 7:45?", listOf("quarter past seven", "half past seven", "quarter to eight", "seven forty"), 2)
        ),
        idioms = listOf(
            IdiomExpression("What time is it?", "ساعت چنده؟", "What time is it?", "ساعت چنده؟"),
            IdiomExpression("Free time", "وقت آزاد", "Are you free on Friday?", "جمعه آزادی؟"),
            IdiomExpression("Sleep late", "دیر بیدار شدن", "I sleep late on Saturdays.", "شنبه‌ها دیر بیدار می‌شم."),
            IdiomExpression("From...to...", "از... تا...", "From 4 to 6.", "از ۴ تا ۶.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "get up", "بیدار شدن", "wake up and leave bed",
                "I get up at 7 on weekdays.", "روزهای هفته ساعت ۷ بیدار می‌شم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Days of the week stress", "MONday, TUESday, WEDNESday, THURSday, FRIday, SATurday, SUNday. Always stress the first syllable."),
            PronunciationTip("Time expressions", "O'clock /əˈklɒk/ — the first syllable is short and unstressed."),
            PronunciationTip("Quarter", "Quarter /ˈkwɔːrtər/ — the 'a' sounds like /ɔː/.")
        ),
        culture = listOf(
            CulturalNote(
                "Weekends",
                "In most English-speaking countries, the weekend is Saturday and Sunday. In some Middle Eastern countries, the weekend is Friday and Saturday."
            ),
            CulturalNote(
                "12-hour vs 24-hour clock",
                "In English-speaking countries, the 12-hour clock is common (7 AM, 7 PM). AM means morning; PM means afternoon/evening."
            )
        ),
        mistakes = listOf(
            CommonMistake("It's seven hours.", "It's seven o'clock.", "Use 'o'clock' for clock times, not 'hours'."),
            CommonMistake("I wake up in 7.", "I wake up at 7.", "Use 'at' with clock times."),
            CommonMistake("monday", "Monday", "Days of the week always start with capital letters.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What time is it now and when is A's class?", "It's 3:30 now. A's class is at 4 on Mondays and Wednesdays."),
            ComprehensionQuestion("What time will they meet?", "They'll meet at 6 on Friday.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Practice asking and telling the time with a partner.",
                "تمرین کن ساعت رو با یک دوست بپرسی و بگی.",
                "What time is it? — It's... o'clock."
            ),
            SpeakingTask(
                "Talk about your weekly schedule.",
                "درباره برنامه هفتگی‌ات صحبت کن.",
                "On Mondays, I... / I'm free on... / I work from... to..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write your weekly schedule for one week.",
                "برنامه هفتگی‌ات رو برای یه هفته بنویس.",
                100,
                "Include at least 5 days and times."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 9 — Daily Activities | فعالیت‌های روزانه
    // ═══════════════════════════════════════════════════════════
    private fun lesson9() = base(
        9, "Daily Activities", "فعالیت‌های روزانه",
        listOf(
            "Talk about your daily routine",
            "Use the present simple for routines",
            "Use adverbs of frequency (always, usually, sometimes, never)"
        ),
        listOf(
            v("wake up", "بیدار شدن", "I wake up at 7.", "ساعت ۷ بیدار می‌شم.", "verb"),
            v("get up", "از خواب بلند شدن", "I get up at 7:15.", "ساعت ۷:۱۵ بلند می‌شم.", "verb"),
            v("take a shower", "دوش گرفتن", "I take a shower every morning.", "هر صبح دوش می‌گیرم.", "verb"),
            v("have breakfast", "صبحانه خوردن", "I have breakfast at 8.", "ساعت ۸ صبحانه می‌خورم.", "verb"),
            v("go to work", "به سر کار رفتن", "I go to work at 8:30.", "ساعت ۸:۳۰ به سر کار می‌رم.", "verb"),
            v("start work", "شروع کار", "I start work at 9.", "ساعت ۹ کارم شروع می‌شه.", "verb"),
            v("have lunch", "ناهار خوردن", "I have lunch at noon.", "ظهر ناهار می‌خورم.", "verb"),
            v("finish work", "تمام کردن کار", "I finish work at 5.", "ساعت ۵ کارم تموم می‌شه.", "verb"),
            v("go home", "به خونه رفتن", "I go home at 5:30.", "ساعت ۵:۳۰ به خونه می‌رم.", "verb"),
            v("have dinner", "شام خوردن", "We have dinner at 7.", "ساعت ۷ شام می‌خوریم.", "verb"),
            v("watch TV", "تلویزیون تماشا کردن", "I watch TV in the evening.", "عصرها تلویزیون تماشا می‌کنم.", "verb"),
            v("read a book", "کتاب خواندن", "I read a book before bed.", "قبل از خواب کتاب می‌خونم.", "verb"),
            v("go to bed", "به رختخواب رفتن", "I go to bed at 11.", "ساعت ۱۱ می‌رم بخوابم.", "verb"),
            v("sleep", "خوابیدن", "I sleep for 8 hours.", "۸ ساعت می‌خوابم.", "verb"),
            v("exercise", "ورزش کردن", "I exercise three times a week.", "هفته‌ای سه بار ورزش می‌کنم.", "verb"),
            v("always", "همیشه", "I always eat breakfast.", "همیشه صبحانه می‌خورم.", "adverb"),
            v("usually", "معمولاً", "I usually walk to work.", "معمولاً پیاده به سر کار می‌رم.", "adverb"),
            v("often", "اغلب", "She often reads at night.", "اغلب شب‌ها می‌خونه.", "adverb"),
            v("sometimes", "گاهی", "I sometimes watch movies.", "گاهی فیلم می‌بینم.", "adverb"),
            v("never", "هرگز", "I never drink coffee at night.", "هرگز شب‌ها قهوه نمی‌خورم.", "adverb")
        ),
        listOf(
            GrammarSection(
                "Present simple for routines",
                "Use the present simple for daily routines. I wake up at 7. She goes to work at 9. He studies every evening."
            ),
            GrammarSection(
                "Third person -s",
                "With he, she, it, add -s to the verb. I work → she works. I go → he goes. I study → she studies."
            ),
            GrammarSection(
                "Adverbs of frequency",
                "Always, usually, often, sometimes, never. They go before the main verb but after 'be'. I always wake up early. She is always tired."
            ),
            GrammarSection(
                "Time expressions for routines",
                "Use at + time (at 7), in the + part of day (in the morning), every + period (every day, every week)."
            )
        ),
        listOf(
            d("A", "What time do you usually wake up?", "معمولاً چه ساعتی بیدار می‌شی؟"),
            d("B", "I usually wake up at 6:30. And you?", "معمولاً ساعت ۶:۳۰ بیدار می‌شم. تو چطور؟"),
            d("A", "I wake up at 7. Do you get up right away?", "من ساعت ۷ بیدار می‌شم. سریع بلند می‌شی؟"),
            d("B", "No, I usually stay in bed for 15 minutes.", "نه، معمولاً ۱۵ دقیقه تو تخت می‌مونم."),
            d("A", "Do you have breakfast at home?", "خونه صبحانه می‌خوری؟"),
            d("B", "Yes, I always have breakfast. I need energy.", "بله، همیشه صبحانه می‌خورم. به انرژی نیاز دارم."),
            d("A", "What do you usually have?", "معمولاً چی می‌خوری؟"),
            d("B", "Eggs, bread, and tea. What about you?", "تخم‌مرغ، نان و چای. تو چطور؟"),
            d("A", "I usually just have coffee.", "من معمولاً فقط قهوه می‌خورم."),
            d("B", "Really? Don't you get hungry?", "واقعاً؟ گرسنه نمی‌شی؟"),
            d("A", "Sometimes. But I have a big lunch.", "گاهی. ولی ناهار مفصل می‌خورم."),
            d("B", "What time do you start work?", "چه ساعتی کارت شروع می‌شه؟"),
            d("A", "I start at 9 and finish at 5.", "ساعت ۹ شروع می‌شه و ۵ تموم."),
            d("B", "Me too! What do you do after work?", "منم! بعد از کار چیکار می‌کنی؟"),
            d("A", "I usually go to the gym. Do you exercise?", "معمولاً می‌رم باشگاه. ورزش می‌کنی؟"),
            d("B", "Sometimes. But I often feel too tired.", "گاهی. ولی اغلب خیلی خسته‌ام."),
            d("A", "What time do you have dinner?", "چه ساعتی شام می‌خوری؟"),
            d("B", "Around 7. Then I read or watch TV.", "حدود ۷. بعدش کتاب می‌خونم یا تلویزیون می‌بینم."),
            d("A", "What time do you go to bed?", "چه ساعتی می‌خوابی؟"),
            d("B", "Around 11. I never stay up late.", "حدود ۱۱. هرگز دیر بیدار نمی‌مونم."),
            d("A", "That's a healthy routine!", "روتین سالمیه!")
        ),
        listOf(
            q("What time does B usually wake up?", listOf("6:00", "6:30", "7:00", "7:30"), 1),
            q("What does B have for breakfast?", listOf("coffee only", "eggs, bread, and tea", "just toast", "nothing"), 1),
            q("What time does A start work?", listOf("8:00", "9:00", "10:00", "11:00"), 1),
            q("What time does B go to bed?", listOf("9:00", "10:00", "11:00", "midnight"), 2),
            q("Complete: She ___ to work at 9.", listOf("go", "goes", "going", "went"), 1),
            q("Complete: I ___ eat breakfast.", listOf("usual", "usually", "usualy", "useualy"), 1),
            q("Where do adverbs of frequency go?", listOf("before the main verb", "after the main verb", "at the end", "at the start"), 0),
            q("Complete: He ___ late.", listOf("never is", "is never", "never be", "be never"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Stay up late", "دیر بیدار موندن", "I never stay up late.", "هرگز دیر بیدار نمی‌مونم."),
            IdiomExpression("Get hungry", "گرسنه شدن", "Don't you get hungry?", "گرسنه نمی‌شی؟"),
            IdiomExpression("Right away", "بلافاصله", "I get up right away.", "بلافاصله بلند می‌شم."),
            IdiomExpression("Healthy routine", "روتین سالم", "That's a healthy routine!", "روتین سالمیه!")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "stay up", "بیدار موندن", "not go to sleep",
                "I never stay up late.", "هرگز دیر بیدار نمی‌مونم.", "No"
            ),
            PhrasalVerb(
                "go to bed", "به رختخواب رفتن", "get into bed",
                "I go to bed at 11.", "ساعت ۱۱ می‌رم بخوابم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Third person -s", "Listen for the 's' sound at the end: she works /wɜːrks/, he plays /pleɪz/."),
            PronunciationTip("Frequency word stress", "Usually /ˈjuːʒuəli/ — stress on first syllable. Sometimes /ˈsʌmtaɪmz/ — stress on first."),
            PronunciationTip("Silent letters", "In 'breakfast', it's BREK-fəst — the 'a' is short and the 'k' is silent.")
        ),
        culture = listOf(
            CulturalNote(
                "Breakfast in different cultures",
                "In many Western countries, breakfast is light — cereal, toast, coffee. In some cultures, it's the main meal."
            ),
            CulturalNote(
                "Work hours",
                "The typical workday in English-speaking countries is 9 to 5. Some people work from home or have flexible schedules."
            )
        ),
        mistakes = listOf(
            CommonMistake("She go to work at 9.", "She goes to work at 9.", "Add -s with he/she/it in present simple."),
            CommonMistake("I always am tired.", "I am always tired.", "Adverbs of frequency go after 'be'."),
            CommonMistake("I have breakfast in 8.", "I have breakfast at 8.", "Use 'at' with clock times.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is B's daily routine?", "Wakes up at 6:30, has breakfast, works 9-5, has dinner at 7, goes to bed at 11."),
            ComprehensionQuestion("What does A usually have for breakfast?", "Just coffee.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Describe your daily routine to a partner.",
                "روتین روزانه‌ات رو برای یک دوست توصیف کن.",
                "I usually wake up at... / I always... / I never..."
            ),
            SpeakingTask(
                "Ask a partner about their routine and compare.",
                "از یک دوست درباره روتینش بپرس و مقایسه کن.",
                "What time do you...? / Do you...?"
            )
        ),
        writing = listOf(
            WritingTask(
                "Write your daily routine from morning to night.",
                "روتین روزانه‌ات رو از صبح تا شب بنویس.",
                100,
                "Include at least 8 activities and times."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 10 — Food and Drinks | غذا و نوشیدنی
    // ═══════════════════════════════════════════════════════════
    private fun lesson10() = base(
        10, "Food and Drinks", "غذا و نوشیدنی",
        listOf(
            "Name common foods and drinks",
            "Talk about food preferences",
            "Order food in a café",
            "Use 'I like / I don't like'"
        ),
        listOf(
            v("food", "غذا", "I love Italian food.", "عاشق غذای ایتالیایی‌ام."),
            v("bread", "نان", "I eat bread every day.", "هر روز نان می‌خورم."),
            v("rice", "برنج", "We eat rice for lunch.", "برای ناهار برنج می‌خوریم."),
            v("meat", "گوشت", "She doesn't eat meat.", "او گوشت نمی‌خوره."),
            v("chicken", "مرغ", "Grilled chicken is my favorite.", "مرغ گریل مورد علاقه‌مه."),
            v("fish", "ماهی", "We have fish on Fridays.", "جمعه‌ها ماهی داریم."),
            v("egg", "تخم‌مرغ", "I eat two eggs for breakfast.", "برای صبحانه دو تا تخم‌مرغ می‌خورم."),
            v("cheese", "پنیر", "Do you like cheese?", "پنیر دوست داری؟"),
            v("apple", "سیب", "An apple a day is healthy.", "یه سیب در روز سالم است."),
            v("banana", "موز", "Bananas are yellow.", "موزها زردن."),
            v("orange", "پرتقال", "I drink orange juice.", "آب‌پرتقال می‌خورم."),
            v("water", "آب", "I drink a lot of water.", "آب زیادی می‌خورم."),
            v("milk", "شیر", "I drink milk with breakfast.", "با صبحانه شیر می‌خورم."),
            v("tea", "چای", "Would you like some tea?", "چای میل داری؟"),
            v("coffee", "قهوه", "I love coffee in the morning.", "صبح‌ها عاشق قهوه‌ام."),
            v("juice", "آبمیوه", "Apple juice, please.", "لطفاً آب‌سیب."),
            v("breakfast", "صبحانه", "I have breakfast at 7.", "ساعت ۷ صبحانه می‌خورم."),
            v("lunch", "ناهار", "We have lunch at noon.", "ظهر ناهار می‌خوریم."),
            v("dinner", "شام", "Dinner is at 7 PM.", "شام ساعت ۷ شب است."),
            v("hungry", "گرسنه", "I'm hungry. Let's eat!", "گرسنه‌ام. بیا بخوریم!", "adjective"),
            v("thirsty", "تشنه", "I'm thirsty. Can I have water?", "تشنه‌ام. می‌تونم آب بخورم؟", "adjective"),
            v("delicious", "خوشمزه", "This food is delicious!", "این غذا خوشمزه‌ست!", "adjective")
        ),
        listOf(
            GrammarSection(
                "I like / I don't like",
                "Use 'I like' for positive preferences and 'I don't like' for negative. I like coffee. I don't like tea."
            ),
            GrammarSection(
                "Do you like...?",
                "Use 'Do you like...?' to ask about preferences. Answer: 'Yes, I do.' or 'No, I don't.'"
            ),
            GrammarSection(
                "Would you like...?",
                "Use 'Would you like...?' to offer something politely. Answer: 'Yes, please.' or 'No, thank you.'"
            ),
            GrammarSection(
                "Count vs non-count basics",
                "Count: apple, egg, banana (you can count them). Non-count: water, milk, rice (you can't say 'two waters')."
            )
        ),
        listOf(
            d("A", "Good morning! What would you like?", "صبح بخیر! چی میل داری؟"),
            d("B", "I'd like a cup of coffee, please.", "یه فنجون قهوه، لطفاً."),
            d("A", "Would you like anything to eat?", "چیزی برای خوردن می‌خوای؟"),
            d("B", "Yes, do you have eggs?", "بله، تخم‌مرغ دارید؟"),
            d("A", "Yes, we do. How would you like them?", "بله. چطور می‌خوای؟"),
            d("B", "Scrambled, please. And some bread.", "همزده، لطفاً. و یه کم نان."),
            d("A", "Anything to drink besides coffee?", "نوشیدنی دیگه‌ای علاوه بر قهوه؟"),
            d("B", "No, just coffee. Thanks.", "نه، فقط قهوه. ممنون."),
            d("A", "Here you are. That's $8.50.", "بفرمایید. ۸.۵۰ دلار."),
            d("B", "Here you go. Thanks!", "بفرمایید. ممنون!"),
            d("A", "You're welcome. Enjoy your breakfast!", "خواهش می‌کنم. صبحانه‌ات رو نوش جان کن!"),
            d("B", "Excuse me, could I have some more bread?", "ببخشید، می‌تونم نان بیشتر بگیرم؟"),
            d("A", "Of course. Here you go.", "البته. بفرمایید."),
            d("B", "Thank you. Oh, do you have milk?", "ممنون. اوه، شیر دارید؟"),
            d("A", "Yes, we do. Would you like some?", "بله. میل داری؟"),
            d("B", "Yes, please. Just a little.", "بله، لطفاً. فقط یه کم."),
            d("A", "Here you are. Anything else?", "بفرمایید. چیز دیگه‌ای؟"),
            d("B", "No, that's all. Thank you!", "نه، همین. ممنون!"),
            d("A", "You're welcome. Have a nice day!", "خواهش می‌کنم. روز خوبی داشته باشی!"),
            d("B", "You too!", "تو هم!")
        ),
        listOf(
            q("What does B order?", listOf("tea and bread", "coffee, eggs, and bread", "juice and fruit", "just coffee"), 1),
            q("How would B like the eggs?", listOf("fried", "boiled", "scrambled", "raw"), 2),
            q("How much does the breakfast cost?", listOf("$5.50", "$8.50", "$10", "$15"), 1),
            q("What else does B ask for?", listOf("juice and fruit", "more bread and milk", "tea", "nothing else"), 1),
            q("Complete: I ___ coffee.", listOf("like", "likes", "liking", "liked"), 0),
            q("Complete: ___ you like tea?", listOf("Do", "Does", "Are", "Is"), 0),
            q("Complete: Would you ___ some water?", listOf("like", "likes", "liking", "liked"), 0),
            q("Complete: I ___ like meat.", listOf("no", "not", "don't", "doesn't"), 2)
        ),
        idioms = listOf(
            IdiomExpression("I'd like...", "می‌خواهم... (مؤدبانه)", "I'd like a cup of coffee, please.", "یه فنجون قهوه، لطفاً."),
            IdiomExpression("Would you like...?", "میل داری...؟", "Would you like anything to eat?", "چیزی برای خوردن میل داری؟"),
            IdiomExpression("Here you are", "بفرمایید", "Here you are. That's $8.50.", "بفرمایید. ۸.۵۰ دلاره."),
            IdiomExpression("Just a little", "فقط یه کم", "Yes, please. Just a little.", "بله، لطفاً. فقط یه کم."),
            IdiomExpression("Enjoy your meal", "نوش جان", "Enjoy your breakfast!", "صبحانه‌ات رو نوش جان کن!")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "eat out", "بیرون غذا خوردن", "eat at a restaurant",
                "We eat out on Fridays.", "جمعه‌ها بیرون غذا می‌خوریم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Food words", "Bread /brɛd/ — short 'e'. Cheese /tʃiːz/ — long 'ee'. Fish /fɪʃ/ — short 'i'."),
            PronunciationTip("Menu words", "Menu /ˈmɛnjuː/ — two syllables, stress on first. Coffee /ˈkɒfi/ — stress on first."),
            PronunciationTip("Water vs waitress", "Water /ˈwɔːtər/. Waitress /ˈweɪtrɪs/. Different vowels.")
        ),
        culture = listOf(
            CulturalNote(
                "Meals and times",
                "In many English-speaking countries, breakfast is 7-9 AM, lunch is 12-1 PM, and dinner is 6-8 PM. Meals vary by family."
            ),
            CulturalNote(
                "Tipping in restaurants",
                "In the US, tipping 15-20% is customary in restaurants. In the UK, 10-15% is common. In some countries, no tip is expected."
            )
        ),
        mistakes = listOf(
            CommonMistake("I like apple.", "I like apples.", "Use plural for general preferences about count nouns."),
            CommonMistake("I want a water.", "I'd like some water.", "Use 'some' with non-count nouns like water."),
            CommonMistake("I like drink tea.", "I like drinking tea.", "After 'like', use verb-ing (or 'to drink').")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does B order for breakfast?", "Coffee, scrambled eggs, bread, and milk."),
            ComprehensionQuestion("How much is the breakfast and how does B pay?", "It's $8.50 and B pays with cash.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Order food at a café with a partner.",
                "نقش گارسون و مشتری رو با یک دوست بازی کنید.",
                "I'd like... / Would you like...? / Anything else?"
            ),
            SpeakingTask(
                "Talk about your favorite food and drink.",
                "درباره غذای مورد علاقه‌ات و نوشیدنی صحبت کن.",
                "I like... / I don't like... / My favorite is..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a short dialogue ordering at a restaurant.",
                "یه دیالوگ کوتاه برای سفارش در رستوران بنویس.",
                80,
                "Include at least 5 lines and a polite request."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 11 — Places | مکان‌ها
    // ═══════════════════════════════════════════════════════════
    private fun lesson11() = base(
        11, "Places", "مکان‌ها",
        listOf(
            "Name common places in a city",
            "Ask about and give locations",
            "Use there is / there are"
        ),
        listOf(
            v("bank", "بانک", "The bank is on Main Street.", "بانک تو خیابان اصلیه."),
            v("hospital", "بیمارستان", "The hospital is near here.", "بیمارستان نزدیک اینجاست."),
            v("school", "مدرسه", "My school is big.", "مدرسه‌ام بزرگه."),
            v("park", "پارک", "There's a park near my house.", "نزدیک خونم یه پارک هست."),
            v("restaurant", "رستوران", "This restaurant is good.", "این رستوران خوبه."),
            v("café", "کافه", "Let's meet at the café.", "بیا کافه قرار بذاریم."),
            v("supermarket", "سوپرمارکت", "The supermarket is open.", "سوپرمارکت بازه."),
            v("pharmacy", "داروخانه", "The pharmacy is on the corner.", "داروخانه سر خیابونه."),
            v("library", "کتابخانه", "The library is quiet.", "کتابخانه ساکته."),
            v("museum", "موزه", "The museum is interesting.", "موزه جالبه."),
            v("hotel", "هتل", "We stayed at a hotel.", "در هتل موندیم."),
            v("station", "ایستگاه", "The train station is far.", "ایستگاه قطار دوره."),
            v("street", "خیابان", "This street is busy.", "این خیابون شلوغه."),
            v("corner", "گوشه / سر خیابان", "Turn left at the corner.", "سر خیابون به چپ بپیچ."),
            v("near", "نزدیک", "The bank is near here.", "بانک نزدیک اینجاست.", "preposition"),
            v("far", "دور", "The airport is far.", "فرودگاه دوره.", "adjective"),
            v("next to", "کنارِ", "The café is next to the bank.", "کافه کنار بانکه.", "preposition"),
            v("across from", "روبروی", "The park is across from the school.", "پارک روبروی مدرسه‌ست.", "preposition"),
            v("left", "چپ", "Turn left.", "به چپ بپیچ."),
            v("right", "راست", "Turn right.", "به راست بپیچ.")
        ),
        listOf(
            GrammarSection(
                "There is / There are",
                "Use 'there is' for singular things: There is a bank. Use 'there are' for plural things: There are two cafés."
            ),
            GrammarSection(
                "Asking about places",
                "Where is the bank? Where are the restaurants? Is there a park near here? Are there any hotels?"
            ),
            GrammarSection(
                "Prepositions of place",
                "Use near, next to, across from, on the corner to describe locations. The bank is next to the café. The school is across from the park."
            ),
            GrammarSection(
                "Directions",
                "Go straight. Turn left. Turn right. It's on the corner. It's across from the park."
            )
        ),
        listOf(
            d("A", "Excuse me, is there a bank near here?", "ببخشید، نزدیک اینجا بانک هست؟"),
            d("B", "Yes, there's a bank on Main Street.", "بله، تو خیابون اصلی یه بانک هست."),
            d("A", "How do I get there?", "چطور برم اونجا؟"),
            d("B", "Go straight for two blocks, then turn left.", "دو بلوک مستقیم برو، بعد به چپ بپیچ."),
            d("A", "Turn left at the traffic light?", "پشت چراغ راهنما به چپ بپیچم؟"),
            d("B", "Yes, exactly. The bank is on the corner.", "بله، دقیقاً. بانک سر خیابونه."),
            d("A", "Is there a pharmacy nearby too?", "داروخانه هم نزدیک هست؟"),
            d("B", "Yes, it's next to the bank.", "بله، کنار بانکه."),
            d("A", "Great. And is there a park in this area?", "عالی. تو این منطقه پارک هم هست؟"),
            d("B", "Yes, there's a park across from the school.", "بله، روبروی مدرسه یه پارک هست."),
            d("A", "Where is the school?", "مدرسه کجاست؟"),
            d("B", "It's on Park Avenue. Just two blocks from here.", "خیابان پارک. فقط دو بلوک از اینجا."),
            d("A", "Perfect. Are there any good restaurants around here?", "عالی. رستوران خوب این اطراف هست؟"),
            d("B", "Yes, there are three or four on Main Street.", "بله، سه چهار تا تو خیابون اصلی هست."),
            d("A", "Which one do you recommend?", "کدوم رو توصیه می‌کنی؟"),
            d("B", "The Italian restaurant on the corner is excellent.", "رستوران ایتالیایی سر خیابون عالیه."),
            d("A", "Thanks! One more thing — is there a supermarket nearby?", "ممنون! یه چیز دیگه — سوپرمارکت نزدیک هست؟"),
            d("B", "Yes, there's one on the next street.", "بله، تو خیابون بعدی یکی هست."),
            d("A", "Thank you so much for your help!", "خیلی ممنون برای کمکت!"),
            d("B", "You're welcome. Have a nice day!", "خواهش می‌کنم. روز خوبی داشته باشی!")
        ),
        listOf(
            q("Where is the bank?", listOf("on Park Avenue", "on Main Street", "near the school", "across from the café"), 1),
            q("Where is the pharmacy?", listOf("next to the bank", "across from the school", "on the corner", "near the park"), 0),
            q("Where is the park?", listOf("on Main Street", "next to the bank", "across from the school", "near the café"), 2),
            q("Which restaurant does B recommend?", listOf("the Chinese one", "the Italian one", "the French one", "the Mexican one"), 1),
            q("Complete: There ___ a bank on Main Street.", listOf("are", "is", "have", "has"), 1),
            q("Complete: There ___ two cafés here.", listOf("is", "are", "has", "have"), 1),
            q("Complete: The bank is ___ the pharmacy.", listOf("next to", "next", "near of", "close"), 0),
            q("Complete: ___ there a park near here?", listOf("Is", "Are", "Has", "Have"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Excuse me", "ببخشید", "Excuse me, is there a bank near here?", "ببخشید، نزدیک اینجا بانک هست؟"),
            IdiomExpression("How do I get there?", "چطور برم اونجا؟", "How do I get to the bank?", "چطور به بانک برم؟"),
            IdiomExpression("Around here", "این اطراف", "Are there any restaurants around here?", "رستوران این اطراف هست؟"),
            IdiomExpression("One more thing", "یه چیز دیگه", "One more thing — is there a supermarket?", "یه چیز دیگه — سوپرمارکت هست؟")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "get to", "رسیدن به", "arrive at a place",
                "How do I get to the bank?", "چطور به بانک برم؟", "No"
            ),
            PhrasalVerb(
                "turn left / right", "به چپ / راست پیچیدن", "change direction",
                "Turn left at the corner.", "سر خیابون به چپ بپیچ.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("There is / There are", "There's /ðɛrz/ is a contraction. There are /ðɛr ɑːr/ is not usually contracted in writing."),
            PronunciationTip("Compound place names", "SUpermarket /ˈsuːpərmɑːrkɪt/. HOSpital /ˈhɒspɪtl/. Stress the first syllable."),
            PronunciationTip("Directions intonation", "Turn LEFT. Go STRAIGHT. Stress the direction word.")
        ),
        culture = listOf(
            CulturalNote(
                "Asking for directions",
                "In English-speaking countries, it's common and polite to ask strangers for directions. Always start with 'Excuse me'."
            ),
            CulturalNote(
                "Blocks and streets",
                "In many cities, distances are measured in 'blocks'. One block is the distance between two streets."
            )
        ),
        mistakes = listOf(
            CommonMistake("There is two banks.", "There are two banks.", "Use 'there are' with plural nouns."),
            CommonMistake("Where is bank?", "Where is the bank?", "Use 'the' before specific places."),
            CommonMistake("Turn to left.", "Turn left.", "No 'to' with 'turn left/right'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where is the bank and how do you get there?", "On Main Street. Go straight two blocks and turn left."),
            ComprehensionQuestion("Which restaurant does B recommend?", "The Italian restaurant on the corner.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Ask a partner about places in their city.",
                "از یک دوست درباره مکان‌های شهرش بپرس.",
                "Is there a...? / Where is...? / How do I get to...?"
            ),
            SpeakingTask(
                "Give directions to a place in your city.",
                "مسیر یه مکان تو شهرت رو بگو.",
                "Go straight... / Turn left... / It's next to..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write directions from your home to a nearby place.",
                "مسیر از خونت به یه جای نزدیک رو بنویس.",
                100,
                "Use at least 5 location words (near, next to, across from, etc.)."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 12 — Home | خانه
    // ═══════════════════════════════════════════════════════════
    private fun lesson12() = base(
        12, "Home", "خانه",
        listOf(
            "Name rooms in a house",
            "Describe your home",
            "Use there is / there are with rooms",
            "Talk about furniture"
        ),
        listOf(
            v("house", "خانه", "We live in a house.", "ما تو یه خونه زندگی می‌کنیم."),
            v("apartment", "آپارتمان", "I live in an apartment.", "من تو یه آپارتمان زندگی می‌کنم."),
            v("room", "اتاق", "There are 5 rooms in our house.", "خونه‌مون ۵ تا اتاق داره."),
            v("bedroom", "اتاق خواب", "My bedroom is upstairs.", "اتاق خوابم بالاست."),
            v("bathroom", "حمام / دستشویی", "The bathroom is clean.", "حمام تمیزه."),
            v("kitchen", "آشپزخانه", "I cook in the kitchen.", "تو آشپزخانه آشپزی می‌کنم."),
            v("living room", "اتاق نشیمن", "We watch TV in the living room.", "تو اتاق نشیمن تلویزیون می‌بینیم."),
            v("dining room", "اتاق غذاخوری", "We eat in the dining room.", "تو اتاق غذاخوری غذا می‌خوریم."),
            v("garden", "باغ / حیاط", "We have a small garden.", "یه حیاط کوچیک داریم."),
            v("garage", "گاراژ / پارکینگ", "The car is in the garage.", "ماشین تو گاراژه."),
            v("door", "در", "Please close the door.", "لطفاً در رو ببند."),
            v("window", "پنجره", "Open the window, please.", "پنجره رو باز کن، لطفاً."),
            v("table", "میز", "The book is on the table.", "کتاب رو میزه."),
            v("chair", "صندلی", "Sit on the chair, please.", "روی صندلی بشین، لطفاً."),
            v("bed", "تختخواب", "The bed is comfortable.", "تخت راحته."),
            v("sofa", "مبل", "We have a big sofa.", "مبل بزرگی داریم."),
            v("TV", "تلویزیون", "The TV is in the living room.", "تلویزیون تو اتاق نشیمنه."),
            v("lamp", "لامپ / چراغ", "Turn on the lamp.", "لامپ رو روشن کن."),
            v("mirror", "آینه", "There's a mirror in the bathroom.", "تو حمام آینه هست."),
            v("refrigerator", "یخچال", "The milk is in the refrigerator.", "شیر تو یخچاله.")
        ),
        listOf(
            GrammarSection(
                "There is / There are with rooms",
                "There is a bed in the bedroom. There are two chairs in the kitchen. Is there a garden? Are there any windows?"
            ),
            GrammarSection(
                "Prepositions of place",
                "The book is on the table. The lamp is next to the bed. The mirror is on the wall. The TV is in the living room."
            ),
            GrammarSection(
                "Describing a home",
                "I live in a small apartment. It has two bedrooms and a kitchen. There's a balcony next to the living room."
            ),
            GrammarSection(
                "Questions about homes",
                "Do you live in a house or an apartment? How many rooms does it have? Is there a garden?"
            )
        ),
        listOf(
            d("A", "Do you live in a house or an apartment?", "خونه زندگی می‌کنی یا آپارتمان؟"),
            d("B", "I live in an apartment on the third floor.", "من تو یه آپارتمان تو طبقه سوم زندگی می‌کنم."),
            d("A", "How many rooms does it have?", "چند تا اتاق داره؟"),
            d("B", "It has three rooms: a bedroom, a living room, and a kitchen.", "سه تا اتاق: یه اتاق خواب، یه اتاق نشیمن و یه آشپزخانه."),
            d("A", "Is there a balcony?", "بالکن داره؟"),
            d("B", "Yes, there is. It's next to the living room.", "بله. کنار اتاق نشیمنه."),
            d("A", "Nice! What furniture do you have?", "خوبه! چه مبلمانی داری؟"),
            d("B", "I have a bed, a sofa, a table, and four chairs.", "یه تخت، یه مبل، یه میز و چهار تا صندلی دارم."),
            d("A", "Is there a TV in the living room?", "تو اتاق نشیمن تلویزیون هست؟"),
            d("B", "Yes, there is. And there's a big mirror on the wall.", "بله. و یه آینه بزرگ رو دیوار هست."),
            d("A", "Do you have a refrigerator?", "یخچال داری؟"),
            d("B", "Yes, of course. It's in the kitchen.", "بله، البته. تو آشپزخانه‌ست."),
            d("A", "Is your apartment quiet?", "آپارتمانت ساکته؟"),
            d("B", "Yes, it's very quiet. It's on a small street.", "بله، خیلی ساکته. تو یه خیابون کوچیکه."),
            d("A", "That sounds nice. Do you like living there?", "خوبه به نظر می‌رسه. دوست داری اونجا زندگی کنی؟"),
            d("B", "Yes, I love it. The neighbors are friendly.", "بله، عاشقشم. همسایه‌ها خوش‌برخوردن."),
            d("A", "Is there a park near your apartment?", "نزدیک آپارتمانت پارک هست؟"),
            d("B", "Yes, there's a small park across the street.", "بله، روبروی خیابون یه پارک کوچیک هست."),
            d("A", "That's convenient! Do you have a garden?", "راحته! باغ داری؟"),
            d("B", "No, I don't. But the park is enough for me.", "نه. ولی پارک برام کافیه."),
            d("A", "You're lucky. My apartment doesn't have a park nearby.", "خوش‌شانسی. نزدیک آپارتمان من پارک نیست.")
        ),
        listOf(
            q("Where does B live?", listOf("a house", "an apartment", "a hotel", "a dormitory"), 1),
            q("How many rooms does B's apartment have?", listOf("two", "three", "four", "five"), 1),
            q("What furniture does B have?", listOf("only a bed", "a bed, sofa, table, and chairs", "just a sofa", "nothing"), 1),
            q("Where is the park?", listOf("next to the apartment", "across the street", "far away", "in the building"), 1),
            q("Complete: There ___ a bed in the bedroom.", listOf("are", "is", "have", "has"), 1),
            q("Complete: There ___ two chairs in the kitchen.", listOf("is", "are", "has", "have"), 1),
            q("Complete: The book is ___ the table.", listOf("in", "on", "at", "of"), 1),
            q("Complete: ___ there a garden?", listOf("Is", "Are", "Has", "Have"), 0)
        ),
        idioms = listOf(
            IdiomExpression("On the third floor", "تو طبقه سوم", "I live on the third floor.", "تو طبقه سوم زندگی می‌کنم."),
            IdiomExpression("Of course", "البته", "Do you have a fridge? — Of course.", "یخچال داری؟ — البته."),
            IdiomExpression("That sounds nice", "خوبه به نظر می‌رسه", "That sounds nice.", "خوبه به نظر می‌رسه."),
            IdiomExpression("You're lucky", "خوش‌شانسی", "You're lucky. My apartment doesn't have a park.", "خوش‌شانسی. نزدیک آپارتمان من پارک نیست.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "live in", "زندگی کردن در", "reside in a place",
                "I live in an apartment.", "من تو یه آپارتمان زندگی می‌کنم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Rooms stress", "BEDroom, BATHroom, KITchen, LIVing room. Stress the first word in compound nouns."),
            PronunciationTip("Furniture words", "Table /ˈteɪbl/. Chair /tʃɛr/. Sofa /ˈsoʊfə/. Stress the first syllable."),
            PronunciationTip("Refrigerator", "Refrigerator /rɪˈfrɪdʒəreɪtər/ — five syllables! Often shortened to 'fridge' /frɪdʒ/.")
        ),
        culture = listOf(
            CulturalNote(
                "Houses vs apartments",
                "In cities, apartments are common. In suburbs, houses are more common. 'Flat' is the British word for 'apartment'."
            ),
            CulturalNote(
                "Home sizes",
                "Homes vary widely in size. American homes tend to be larger. European and Asian apartments are often smaller."
            )
        ),
        mistakes = listOf(
            CommonMistake("I live in house.", "I live in a house.", "Use 'a' before singular nouns."),
            CommonMistake("There are a bed.", "There is a bed.", "Use 'there is' with singular nouns."),
            CommonMistake("I have 25 years old apartment.", "I have a 25-year-old apartment.", "When used as an adjective, use hyphens and no plural.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Describe B's apartment.", "It's on the third floor, has three rooms, a balcony, and is on a quiet street."),
            ComprehensionQuestion("Does B have a garden?", "No, but there's a park across the street.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Describe your home to a partner.",
                "خونت رو برای یک دوست توصیف کن.",
                "I live in... / It has... / There is... / There are..."
            ),
            SpeakingTask(
                "Ask a partner about their home.",
                "از یک دوست درباره خونش بپرس.",
                "Do you live in...? / How many rooms...? / Is there...?"
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a description of your home.",
                "توصیفی از خونت بنویس.",
                100,
                "Include rooms, furniture, and location."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 13 — Weather | آب و هوا
    // ═══════════════════════════════════════════════════════════
    private fun lesson13() = base(
        13, "Weather", "آب و هوا",
        listOf(
            "Talk about the weather",
            "Name the seasons",
            "Use weather adjectives",
            "Ask 'What's the weather like?'"
        ),
        listOf(
            v("weather", "آب و هوا", "The weather is nice today.", "امروز هوا خوبه."),
            v("sunny", "آفتابی", "It's sunny outside.", "بیرون آفتابیه.", "adjective"),
            v("rainy", "بارانی", "It's rainy today.", "امروز بارونیه.", "adjective"),
            v("cloudy", "ابری", "It's cloudy in the morning.", "صبح‌ها ابریه.", "adjective"),
            v("snowy", "برفی", "It's snowy in winter.", "زمستون برفیه.", "adjective"),
            v("windy", "بادی", "It's windy at the beach.", "ساحل بادیه.", "adjective"),
            v("hot", "گرم", "Summer is very hot.", "تابستون خیلی گرمه.", "adjective"),
            v("cold", "سرد", "Winter is cold.", "زمستون سرده.", "adjective"),
            v("warm", "ملایم / گرم", "Spring is warm.", "بهار ملایمه.", "adjective"),
            v("cool", "خنک", "Autumn is cool.", "پاییز خنکه.", "adjective"),
            v("spring", "بهار", "Spring is my favorite season.", "بهار فصل مورد علاقه‌مه."),
            v("summer", "تابستان", "We swim in summer.", "تابستون شنا می‌کنیم."),
            v("autumn", "پاییز", "Leaves fall in autumn.", "پاییز برگ‌ها می‌ریزن."),
            v("fall", "پاییز (آمریکا)", "Fall is cool and beautiful.", "پاییز خنک و زیباست."),
            v("winter", "زمستان", "It snows in winter.", "زمستون برف میاد."),
            v("season", "فصل", "There are four seasons.", "چهار فصل وجود داره."),
            v("rain", "باران", "The rain is heavy today.", "امروز بارون شدیده."),
            v("snow", "برف", "I love the snow!", "عاشق برفم!"),
            v("sun", "خورشید", "The sun is bright.", "خورشید درخشانه."),
            v("sky", "آسمان", "The sky is blue today.", "امروز آسمون آبیه.")
        ),
        listOf(
            GrammarSection(
                "What's the weather like?",
                "Use 'What's the weather like?' to ask about the weather. Answer: 'It's sunny/rainy/cold.'"
            ),
            GrammarSection(
                "It's + weather word",
                "Use 'It's' + weather adjective. It's sunny. It's hot. It's rainy. 'It' refers to the weather."
            ),
            GrammarSection(
                "In + seasons",
                "Use 'in' with seasons: in spring, in summer, in autumn, in winter. Also: in the morning, in the afternoon."
            ),
            GrammarSection(
                "Weather and clothes",
                "In cold weather, wear a coat. In hot weather, wear a T-shirt. Match your clothes to the weather."
            )
        ),
        listOf(
            d("A", "What's the weather like today?", "امروز هوا چطوره؟"),
            d("B", "It's sunny and warm. Beautiful!", "آفتابی و ملایمه. زیبا!"),
            d("A", "I love this kind of weather. What's your favorite season?", "عاشق این هوا هستم. فصل مورد علاقه‌ات چیه؟"),
            d("B", "I love spring. The flowers bloom everywhere.", "عاشق بهارم. گل‌ها همه‌جا شکوفه می‌دن."),
            d("A", "Spring is nice. What about summer?", "بهار خوبه. تابستون چطور؟"),
            d("B", "Summer is too hot for me. I prefer cooler weather.", "تابستون برام خیلی گرمه. هوای خنک‌تر رو ترجیح می‌دم."),
            d("A", "Really? I love summer! The beach, swimming, ice cream...", "واقعاً؟ من عاشق تابستونم! ساحل، شنا، بستنی..."),
            d("B", "OK, that does sound nice. What about winter?", "باشه، خوب به نظر می‌رسه. زمستون چطور؟"),
            d("A", "I don't like winter. It's too cold.", "زمستون دوست ندارم. خیلی سرده."),
            d("B", "But the snow is beautiful!", "ولی برف زیباست!"),
            d("A", "You're right. It is beautiful.", "حق داری. زیباست."),
            d("B", "What's the weather like in your city?", "هوای شهرت چطوره؟"),
            d("A", "It's usually warm. It doesn't snow there.", "معمولاً ملایمه. اونجا برف نمیاد."),
            d("B", "That sounds nice. Do you get much rain?", "خوبه به نظر می‌رسه. بارون زیاد میاد؟"),
            d("A", "Yes, in spring we get a lot of rain.", "بله، بهار بارون زیاد میاد."),
            d("B", "Do you carry an umbrella?", "چتر با خودت می‌بری؟"),
            d("A", "Always! Especially in April.", "همیشه! مخصوصاً آوریل."),
            d("B", "I should visit your city some day.", "باید یه روز شهرت رو ببینم."),
            d("A", "You should! Spring is the best time.", "باید ببینی! بهار بهترین زمانه."),
            d("B", "Great. Now, what's the forecast for tomorrow?", "عالی. حالا، پیش‌بینی فردا چیه؟"),
            d("A", "It says it'll be cloudy but warm.", "می‌گه ابری ولی ملایم می‌شه.")
        ),
        listOf(
            q("What's the weather like today?", listOf("rainy and cold", "sunny and warm", "snowy", "windy"), 1),
            q("What's B's favorite season?", listOf("summer", "winter", "spring", "autumn"), 2),
            q("Why doesn't A like winter?", listOf("it's too cold", "it's too wet", "it's too short", "it's too windy"), 0),
            q("What's the forecast for tomorrow?", listOf("sunny", "rainy", "cloudy but warm", "snowy"), 2),
            q("Complete: ___ sunny today.", listOf("He's", "She's", "It's", "They're"), 2),
            q("Complete: It's ___ in winter.", listOf("hot", "cold", "warm", "sunny"), 1),
            q("Complete: I swim ___ summer.", listOf("at", "in", "on", "of"), 1),
            q("Complete: ___ is the weather like?", listOf("How", "What", "When", "Where"), 1)
        ),
        idioms = listOf(
            IdiomExpression("What's the weather like?", "هوا چطوره؟", "What's the weather like today?", "امروز هوا چطوره؟"),
            IdiomExpression("This kind of weather", "این نوع هوا", "I love this kind of weather.", "عاشق این نوع هوا هستم."),
            IdiomExpression("Some day", "یه روز", "I should visit some day.", "باید یه روز ببینم."),
            IdiomExpression("The forecast says...", "پیش‌بینی می‌گه...", "The forecast says it'll be cloudy.", "پیش‌بینی می‌گه ابری می‌شه.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "put on", "پوشیدن", "wear",
                "Put on a jacket. It's cold.", "کاپشن بپوش. سرده.", "Yes"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Weather vs whether", "Weather /ˈwɛðər/ and whether /ˈwɛðər/ sound the same. Context tells the difference."),
            PronunciationTip("Seasons stress", "SPRing, SUMmer, AUTumn, WINter. Stress the first syllable."),
            PronunciationTip("Weather words stress", "SUNny, RAINy, CLOUDy, SNOWy, WINdy. Stress the first syllable.")
        ),
        culture = listOf(
            CulturalNote(
                "Weather small talk",
                "'What's the weather like?' is a very common and safe way to start a conversation in English-speaking countries."
            ),
            CulturalNote(
                "Four seasons",
                "Many English-speaking countries have four distinct seasons. Some countries (like Australia) have opposite seasons from the northern hemisphere."
            )
        ),
        mistakes = listOf(
            CommonMistake("How is the weather like?", "What's the weather like?", "Use 'what' with 'like', not 'how'."),
            CommonMistake("Weather is nice today.", "The weather is nice today.", "Use 'the' with weather."),
            CommonMistake("It's rain.", "It's rainy.", "Use the adjective 'rainy', not the noun 'rain'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are B's favorite and least favorite seasons?", "B loves spring and doesn't like summer (too hot)."),
            ComprehensionQuestion("What's the weather like in A's city?", "It's usually warm and doesn't snow. But there's a lot of rain in spring.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Talk about the weather in your city.",
                "درباره هوای شهرت صحبت کن.",
                "In my city, it's usually... / In summer, it's... / In winter, it's..."
            ),
            SpeakingTask(
                "Discuss your favorite season with a partner.",
                "درباره فصل مورد علاقه‌ات با یک دوست صحبت کن.",
                "I love... because... / I don't like... because..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write about the weather in your city in each season.",
                "درباره هوای شهرت تو هر فصل بنویس.",
                100,
                "Include all four seasons and weather adjectives."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 14 — Review | مرور
    // ═══════════════════════════════════════════════════════════
    private fun lesson14() = base(
        14, "Review", "مرور",
        listOf(
            "Review greetings and introductions",
            "Review family, jobs, and daily routines",
            "Review numbers, time, and colors",
            "Practice everything you've learned",
            "Build confidence in basic English"
        ),
        listOf(
            v("review", "مرور", "Let's review the lessons.", "بیا درس‌ها رو مرور کنیم."),
            v("practice", "تمرین", "Practice makes perfect.", "تمرین باعث پیشرفت."),
            v("learn", "یاد گرفتن", "I'm learning English.", "دارم انگلیسی یاد می‌گیرم.", "verb"),
            v("understand", "فهمیدن", "I understand now.", "الان می‌فهمم.", "verb"),
            v("remember", "به یاد آوردن", "I remember that word.", "اون کلمه رو به یاد میارم.", "verb"),
            v("forget", "فراموش کردن", "Don't forget!", "فراموش نکن!", "verb"),
            v("ask", "پرسیدن", "Can I ask a question?", "می‌تونم یه سؤال بپرسم؟", "verb"),
            v("answer", "جواب دادن", "Please answer the question.", "لطفاً سؤال رو جواب بده.", "verb"),
            v("speak", "صحبت کردن", "I speak a little English.", "یه کم انگلیسی صحبت می‌کنم.", "verb"),
            v("listen", "گوش دادن", "Listen carefully.", "با دقت گوش کن.", "verb"),
            v("read", "خواندن", "I read every day.", "هر روز می‌خونم.", "verb"),
            v("write", "نوشتن", "Write your name here.", "اسمت رو اینجا بنویس.", "verb"),
            v("good job", "کار خوب", "Good job! You did great.", "کار خوب! عالی بود."),
            v("well done", "آفرین", "Well done! Keep going.", "آفرین! ادامه بده."),
            v("keep going", "ادامه بده", "Keep going! You're improving.", "ادامه بده! داری پیشرفت می‌کنی.")
        ),
        listOf(
            GrammarSection(
                "Review: Verb be",
                "I am, you are, he/she/it is, we/they are. I'm a student. She's a teacher. They're from Iran."
            ),
            GrammarSection(
                "Review: Present simple",
                "Use for routines. I wake up at 7. She works at 9. He studies every day."
            ),
            GrammarSection(
                "Review: Have / Has",
                "I have two brothers. She has one sister. They have a dog."
            ),
            GrammarSection(
                "Review: There is / There are",
                "There is a bank. There are two cafés. Is there a park? Are there any shops?"
            )
        ),
        listOf(
            d("A", "Hi! How's your English class going?", "سلام! کلاس انگلیسی‌ت چطور پیش می‌ره؟"),
            d("B", "Really well! I'm learning so much.", "خیلی خوب! دارم خیلی یاد می‌گیرم."),
            d("A", "That's great! What did you learn this month?", "عالیه! این ماه چی یاد گرفتی؟"),
            d("B", "We learned greetings, family, jobs, numbers, and colors.", "سلام و احوال‌پرسی، خانواده، شغل‌ها، اعداد و رنگ‌ها یاد گرفتیم."),
            d("A", "Sounds like a lot! Can you introduce yourself in English?", "زیاد به نظر می‌رسه! می‌تونی خودت رو انگلیسی معرفی کنی؟"),
            d("B", "Sure. Hi, I'm Reza. I'm from Iran. I'm twenty years old.", "حتماً. سلام، من رضام. اهل ایرانم. بیست سالمه."),
            d("A", "Nice! Do you have a big family?", "خوبه! خانواده بزرگی داری؟"),
            d("B", "Yes, I have two brothers and one sister.", "بله، دو تا برادر و یه خواهر دارم."),
            d("A", "What does your father do?", "پدرت چه‌کاره‌ست؟"),
            d("B", "He's an engineer. He works at a company.", "مهندسه. تو یه شرکت کار می‌کنه."),
            d("A", "What about you? What's your daily routine?", "تو چطور؟ روتین روزانه‌ات چیه؟"),
            d("B", "I wake up at 7, have breakfast, and go to work at 9.", "ساعت ۷ بیدار می‌شم، صبحانه می‌خورم و ساعت ۹ می‌رم سر کار."),
            d("A", "What do you do?", "شغلت چیه؟"),
            d("B", "I'm a student. But I also work part-time at a café.", "دانش‌آموزم. ولی پاره‌وقت تو یه کافه هم کار می‌کنم."),
            d("A", "That sounds busy. What time do you finish work?", "شلوغ به نظر می‌رسه. چه ساعتی کارت تموم می‌شه؟"),
            d("B", "At 6 in the evening. Then I go home.", "ساعت ۶ عصر. بعدش می‌رم خونه."),
            d("A", "What do you do after work?", "بعد از کار چیکار می‌کنی؟"),
            d("B", "I have dinner, watch TV, or read a book.", "شام می‌خورم، تلویزیون می‌بینم یا کتاب می‌خونم."),
            d("A", "Do you speak English at work?", "سر کار انگلیسی صحبت می‌کنی؟"),
            d("B", "Sometimes. Some customers speak English.", "گاهی. بعضی مشتری‌ها انگلیسی صحبت می‌کنن."),
            d("A", "You're doing great! Keep practicing.", "عالی داری! به تمرین ادامه بده."),
            d("B", "Thank you! Well done to you too for your English!", "ممنون! تو هم برای انگلیسی‌ت آفرین!")
        ),
        listOf(
            q("What did B learn this month?", listOf("only grammar", "greetings, family, jobs, numbers, colors", "just colors", "nothing"), 1),
            q("How old is B?", listOf("18", "19", "20", "21"), 2),
            q("How many siblings does B have?", listOf("one", "two", "three", "four"), 2),
            q("When does B finish work?", listOf("5 PM", "6 PM", "7 PM", "8 PM"), 1),
            q("Complete: I ___ a student.", listOf("is", "am", "are", "be"), 1),
            q("Complete: She ___ at 9.", listOf("work", "works", "working", "worked"), 1),
            q("Complete: He ___ two brothers.", listOf("have", "has", "haves", "having"), 1),
            q("Complete: There ___ a park near here.", listOf("is", "are", "has", "have"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Well done", "آفرین", "Well done! Keep going.", "آفرین! ادامه بده."),
            IdiomExpression("Keep going", "ادامه بده", "Keep going! You're improving.", "ادامه بده! داری پیشرفت می‌کنی."),
            IdiomExpression("That sounds busy", "شلوغ به نظر می‌رسه", "That sounds busy. Take a break!", "شلوغ به نظر می‌رسه. یه استراحت بکن!"),
            IdiomExpression("You're doing great", "عالی داری", "You're doing great! Keep practicing.", "عالی داری! به تمرین ادامه بده.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "keep going", "ادامه دادن", "continue",
                "Keep going! You're improving.", "ادامه بده! داری پیشرفت می‌کنی.", "No"
            ),
            PhrasalVerb(
                "grow up", "بزرگ شدن", "become an adult",
                "I grew up in a small city.", "تو یه شهر کوچیک بزرگ شدم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Intonation in questions", "Yes/No questions: rising at the end. Do you speak English? ↗"),
            PronunciationTip("Question word stress", "What do you do? — stress WHAT. Where do you live? — stress WHERE."),
            PronunciationTip("Contractions", "I'm, you're, he's, she's, they're, we're — practice them all!")
        ),
        culture = listOf(
            CulturalNote(
                "Learning English",
                "Learning English takes time and practice. Don't be afraid to make mistakes — mistakes help you learn!"
            ),
            CulturalNote(
                "Continuing your studies",
                "After Fundamentals, the next level is Top Notch 1. Keep studying and practicing every day!"
            )
        ),
        mistakes = listOf(
            CommonMistake("I am 20 years.", "I'm 20 years old.", "Use 'years old' for age."),
            CommonMistake("She have two brothers.", "She has two brothers.", "Use 'has' with she/he/it."),
            CommonMistake("Where you are from?", "Where are you from?", "Verb comes before subject in questions.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is B's daily routine?", "Wakes up at 7, works part-time at a café, finishes at 6, eats dinner, relaxes."),
            ComprehensionQuestion("Why is B proud of their progress?", "Because B can now introduce himself and talk about family, job, and daily life in English.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Introduce yourself fully in English.",
                "خودت رو به طور کامل انگلیسی معرفی کن.",
                "Hi, I'm... / I'm from... / I'm... years old. / I have..."
            ),
            SpeakingTask(
                "Talk about your daily routine in English.",
                "روتین روزانه‌ات رو انگلیسی بگو.",
                "I wake up at... / I work... / I usually..."
            ),
            SpeakingTask(
                "Give a short presentation about your family, job, and home.",
                "یه ارائه کوتاه درباره خانواده، شغل و خونت بده.",
                "This is my family... / I work as... / I live in..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a short introduction about yourself in English.",
                "یه معرفی کوتاه انگلیسی از خودت بنویس.",
                100,
                "Include name, age, country, family, job, and daily routine."
            )
        )
    )
}