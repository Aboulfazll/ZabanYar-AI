package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File Starter — Complete Course Content
 * 12 Files | Beginner (A1)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles match the official Oxford Scope & Sequence
 * Dialogue length: ~50 lines each (~5 minutes)
 */
object AmericanEnglishFileStarter {
    const val BOOK_ID = "american_english_file_starter"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> file1()
        2 -> file2()
        3 -> file3()
        4 -> file4()
        5 -> file5()
        6 -> file6()
        7 -> file7()
        8 -> file8()
        9 -> file9()
        10 -> file10()
        11 -> file11()
        12 -> file12()
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
    // FILE 1 — Hello! | سلام!  (≈ 55 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file1() = base(
        1, "Hello!", "سلام!",
        listOf(
            "Greet people and introduce yourself",
            "Use verb be (singular): I and you",
            "Say numbers 0–10 and days of the week",
            "Say goodbye in different ways"
        ),
        listOf(
            v("hello", "سلام", "Hello, I'm Tom.", "سلام، من تام هستم.", "interjection"),
            v("hi", "سلام (غیررسمی)", "Hi, how are you?", "سلام، چطوری؟", "interjection"),
            v("name", "نام", "What's your name?", "نامت چیست؟"),
            v("nice to meet you", "از آشنایی خوشحالم", "Nice to meet you, Helen.", "از آشنایی خوشحالم، هلن."),
            v("goodbye", "خداحافظ", "Goodbye, see you tomorrow.", "خداحافظ، فردا می‌بینمت."),
            v("cappuccino", "کاپوچینو", "A cappuccino, please.", "یک کاپوچینو، لطفاً."),
            v("tea", "چای", "A tea, please.", "یک چای، لطفاً."),
            v("coffee", "قهوه", "A coffee, please.", "یک قهوه، لطفاً."),
            v("day", "روز", "What day is it today?", "امروز چه روزی است؟"),
            v("number", "عدد", "What's your phone number?", "شماره تلفنت چیست؟")
        ),
        listOf(
            GrammarSection("Verb be (singular): I and you", "Use am for I and are for you. I am Tom. You are Helen. Contractions: I'm, you're."),
            GrammarSection("Verb be (singular): he, she, it", "Use is for he, she, it. He is Tom. She is Helen. It is a cappuccino. Contractions: he's, she's, it's."),
            GrammarSection("Numbers 0–10", "Zero, one, two, three, four, five, six, seven, eight, nine, ten."),
            GrammarSection("Days of the week", "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.")
        ),
        listOf(
            d("A", "Hello. A cappuccino, please.", "سلام. یک کاپوچینو، لطفاً."),
            d("B", "What's your name?", "نامت چیست؟"),
            d("A", "Helen.", "هلن."),
            d("B", "Ellen?", "الن؟"),
            d("A", "No, Helen. H-E-L-E-N.", "نه، هلن. ه-ل-ن."),
            d("B", "Helen. OK. Just a minute.", "هلن. باشه. یک دقیقه."),
            d("A", "Thank you.", "ممنون."),
            d("C", "Hi. Are you Helen?", "سلام. تو هلن هستی؟"),
            d("A", "Yes, I am.", "بله."),
            d("C", "I'm Tom. Nice to meet you.", "من تام هستم. از آشنایی خوشحالم."),
            d("A", "Nice to meet you, too.", "من هم خوشحالم."),
            d("C", "Are you on vacation?", "در تعطیلاتی؟"),
            d("A", "No, I'm not. I'm a student.", "نه. من دانشجو هستم."),
            d("C", "Oh, what do you study?", "اوه، چه چیزی می‌خوانی؟"),
            d("A", "Art. And you?", "هنر. تو چطور؟"),
            d("C", "I'm a teacher. I teach English.", "من معلم هستم. انگلیسی درس می‌دهم."),
            d("A", "That's great. Where are you from?", "عالیه. اهل کجایی؟"),
            d("C", "I'm from Canada. And you?", "اهل کانادا هستم. تو چطور؟"),
            d("A", "I'm from Italy.", "اهل ایتالیا هستم."),
            d("C", "Nice. Well, I have to go. See you later!", "عالی. خب، باید بروم. بعداً می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!")
        ),
        listOf(
            q("What does Helen order?", listOf("a tea", "a coffee", "a cappuccino", "a water"), 2),
            q("What is Tom's job?", listOf("student", "teacher", "doctor", "artist"), 1),
            q("Where is Tom from?", listOf("Italy", "Canada", "England", "America"), 1),
            q("What does Helen study?", listOf("English", "Art", "Math", "Science"), 1),
            q("Choose the correct sentence.", listOf("I is Tom.", "I am Tom.", "I are Tom.", "I be Tom."), 1),
            q("Choose the correct sentence.", listOf("She are Helen.", "She is Helen.", "She am Helen.", "She be Helen."), 1),
            q("What's the contraction for 'I am'?", listOf("I'm", "I're", "I's", "I'll"), 0),
            q("What's the contraction for 'he is'?", listOf("he're", "he's", "he'am", "he'll"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you, Helen.", "از آشنایی خوشحالم، هلن."),
            IdiomExpression("See you later", "بعداً می‌بینمت", "See you later!", "بعداً می‌بینمت!"),
            IdiomExpression("Just a minute", "یک دقیقه", "Just a minute, please.", "یک دقیقه، لطفاً.")
        ),
        pronunciation = listOf(
            PronunciationTip("Vowel sounds", "Practice the difference between /aɪ/ (I) and /i/ (she)."),
            PronunciationTip("Contractions", "Practice natural contractions: I'm /aɪm/, you're /jʊr/, he's /hiːz/, she's /ʃiːz/.")
        ),
        culture = listOf(
            CulturalNote("Coffee culture", "In many English-speaking countries, ordering coffee is a common social activity. 'A cappuccino, please' is a polite and natural way to order."),
            CulturalNote("First names", "In casual settings, English speakers usually use first names immediately. In formal situations, titles (Mr., Ms.) are used.")
        ),
        mistakes = listOf(
            CommonMistake("I is Tom.", "I am Tom.", "Use 'am' with 'I'."),
            CommonMistake("She are Helen.", "She is Helen.", "Use 'is' with 'she'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does Helen order?", "A cappuccino."),
            ComprehensionQuestion("What are Tom and Helen's jobs?", "Tom is a teacher; Helen is a student.")
        ),
        speaking = listOf(
            SpeakingTask("Introduce yourself to a partner.", "خودت را به یک دوست معرفی کن.", "Hello, I'm... / Nice to meet you."),
            SpeakingTask("Order a drink at a café.", "در یک کافه نوشیدنی سفارش بده.", "A coffee, please. / What's your name?")
        ),
        writing = listOf(
            WritingTask("Write a short self-introduction.", "یک معرفی کوتاه از خودت بنویس.", 50, "Include your name, job, and where you're from.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 2 — World Music | موسیقی جهانی  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file2() = base(
        2, "World Music", "موسیقی جهانی",
        listOf(
            "Use verb be (singular): he, she, it",
            "Say countries and nationalities",
            "Talk about music and musicians",
            "Ask and answer about origin"
        ),
        listOf(
            v("country", "کشور", "Which country are you from?", "اهل کدام کشور هستی؟"),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیست؟"),
            v("music", "موسیقی", "I love music.", "عاشق موسیقی هستم."),
            v("musician", "موسیقی‌دان", "She's a famous musician.", "او موسیقی‌دان معروفی است."),
            v("singer", "خواننده", "The singer has a beautiful voice.", "خواننده صدای زیبایی دارد."),
            v("band", "گروه موسیقی", "Their band is very popular.", "گروهشان خیلی محبوب است."),
            v("famous", "معروف", "He's a famous actor.", "او بازیگر معروفی است.", "adjective"),
            v("concert", "کنسرت", "The concert starts at eight.", "کنسرت ساعت هشت شروع می‌شود."),
            v("song", "آهنگ", "This song is beautiful.", "این آهنگ زیباست."),
            v("guitar", "گیتار", "He plays the guitar.", "او گیتار می‌نوازد.")
        ),
        listOf(
            GrammarSection("Verb be (singular): he, she, it", "Use is for he, she, it. He is a singer. She is from Brazil. It is a famous band."),
            GrammarSection("Countries and nationalities", "Mexico — Mexican. Brazil — Brazilian. Japan — Japanese. Italy — Italian."),
            GrammarSection("Questions about origin", "Where is he from? Where is she from? Where are they from?")
        ),
        listOf(
            d("A", "Who's your favorite singer?", "خواننده مورد علاقه‌ات کیست؟"),
            d("B", "I love Adele. She's amazing.", "عاشق ادل هستم. فوق‌العاده است."),
            d("A", "Where is she from?", "اهل کجاست؟"),
            d("B", "She's from England. She's British.", "اهل انگلستان است. بریتانیایی است."),
            d("A", "What about you? What music do you like?", "تو چطور؟ چه موسیقی دوست داری؟"),
            d("B", "I like a lot of Latin music.", "موسیقی لاتین زیاد دوست دارم."),
            d("A", "Really? Who's your favorite Latin singer?", "واقعاً؟ خواننده لاتین مورد علاقه‌ات کیست؟"),
            d("B", "Shakira. She's from Colombia.", "شکیرا. اهل کلمبیا است."),
            d("A", "She's very famous. Her songs are popular all over the world.", "خیلی معروف است. آهنگ‌هایش در سراسر جهان محبوب هستند."),
            d("B", "Yes, she's a global star. And her music is great.", "بله، او یک ستاره جهانی است. و موسیقی‌اش عالی است."),
            d("A", "Do you play any instrument?", "سازی می‌نوازی؟"),
            d("B", "A little guitar. But I'm not very good.", "کمی گیتار. ولی خیلی خوب نیستم."),
            d("A", "That's cool. I can't play anything.", "باحال است. من هیچ‌کاری نمی‌توانم بکنم."),
            d("B", "It's never too late to learn!", "برای یادگیری هرگز دیر نیست!"),
            d("A", "Maybe I'll try. See you later.", "شاید امتحان کنم. بعداً می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where is Adele from?", listOf("America", "England", "Colombia", "Brazil"), 1),
            q("Where is Shakira from?", listOf("Mexico", "Colombia", "Spain", "Argentina"), 1),
            q("What instrument does B play?", listOf("piano", "guitar", "violin", "drums"), 1),
            q("What is Adele's nationality?", listOf("American", "British", "Colombian", "Mexican"), 1),
            q("___ is she from?", listOf("What", "Who", "Where", "How"), 2),
            q("She ___ from England.", listOf("am", "is", "are", "be"), 1),
            q("He ___ a famous singer.", listOf("am", "is", "are", "be"), 1),
            q("What's the contraction for 'it is'?", listOf("it're", "it's", "it'am", "it'll"), 1)
        ),
        idioms = listOf(
            IdiomExpression("All over the world", "در سراسر جهان", "Her songs are popular all over the world.", "آهنگ‌هایش در سراسر جهان محبوب هستند."),
            IdiomExpression("Never too late", "هرگز دیر نیست", "It's never too late to learn!", "برای یادگیری هرگز دیر نیست!"),
            IdiomExpression("Global star", "ستاره جهانی", "She's a global star.", "او یک ستاره جهانی است.")
        ),
        pronunciation = listOf(
            PronunciationTip("Word stress in nationalities", "Stress the first syllable: MEXican, BRItish, COLOMbian."),
            PronunciationTip("The /ɪ/ sound", "Practice: British /ˈbrɪtɪʃ/, Italian /ɪˈtæliən/.")
        ),
        culture = listOf(
            CulturalNote("Music around the world", "Music is a universal language. Different countries have different musical traditions, but many artists achieve global popularity."),
            CulturalNote("Nationalities and language", "In English, nationalities are always capitalized: British, Mexican, Brazilian, Japanese.")
        ),
        mistakes = listOf(
            CommonMistake("Where she is from?", "Where is she from?", "In questions, the verb comes before the subject."),
            CommonMistake("She is from England? Yes, she does.", "She is from England? Yes, she is.", "Use 'is' in the short answer, not 'does'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Who is B's favorite Latin singer?", "Shakira, from Colombia."),
            ComprehensionQuestion("What instrument does B play?", "A little guitar.")
        ),
        speaking = listOf(
            SpeakingTask("Ask a partner about their favorite singer.", "از یک دوست درباره خواننده مورد علاقه‌اش بپرس.", "Who's your favorite singer? / Where is he/she from?"),
            SpeakingTask("Talk about music you like.", "درباره موسیقی‌ای که دوست داری صحبت کن.", "I like... / My favorite band is...")
        ),
        writing = listOf(
            WritingTask("Write about your favorite singer or band.", "درباره خواننده یا گروه مورد علاقه‌ات بنویس.", 60, "Include their name, nationality, and why you like them.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 3 — Are you on vacation? | در تعطیلاتی؟  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file3() = base(
        3, "Are you on vacation?", "در تعطیلاتی؟",
        listOf(
            "Use verb be (plural): we, you, they",
            "Ask Wh- and How questions with be",
            "Say numbers 11–100 and phone numbers",
            "Talk about vacations and travel"
        ),
        listOf(
            v("vacation", "تعطیلات", "I'm on vacation.", "در تعطیلات هستم."),
            v("tourist", "گردشگر", "Many tourists visit this city.", "گردشگران زیادی به این شهر می‌آیند."),
            v("hotel", "هتل", "The hotel is near the station.", "هتل نزدیک ایستگاه است."),
            v("city", "شهر", "What city are you from?", "اهل کدام شهری؟"),
            v("phone number", "شماره تلفن", "What's your phone number?", "شماره تلفنت چیست؟"),
            v("bus", "اتوبوس", "That's my bus!", "آن اتوبوس من است!"),
            v("friend", "دوست", "My friends are from New Zealand.", "دوستانم اهل نیوزیلند هستند."),
            v("group", "گروه", "We're a group of four.", "ما یک گروه چهار نفره هستیم."),
            v("museum", "موزه", "We're visiting museums.", "داریم موزه‌ها را می‌بینیم."),
            v("local", "محلی", "We're trying local food.", "داریم غذای محلی امتحان می‌کنیم.", "adjective")
        ),
        listOf(
            GrammarSection("Verb be (plural): we, you, they", "Use are for we, you, they. We are students. You are teachers. They are from Japan."),
            GrammarSection("Wh- and How questions with be", "What's your name? Where are you from? How old are you? Who is she?"),
            GrammarSection("Numbers 11–100", "Eleven, twelve, thirteen, twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety, one hundred."),
            GrammarSection("Phone numbers", "In English, phone numbers are usually said digit by digit: 5-5-5, 1-2-3-4.")
        ),
        listOf(
            d("A", "Excuse me, are you on vacation?", "ببخشید، در تعطیلاتی؟"),
            d("B", "Yes, we are. And you?", "بله. تو چطور؟"),
            d("A", "No, I live here. Where are you from?", "نه، من اینجا زندگی می‌کنم. اهل کجایید؟"),
            d("B", "I'm from Australia. And my friends are from New Zealand.", "من اهل استرالیا هستم. و دوستانم اهل نیوزیلند هستند."),
            d("A", "That's interesting! How long are you here for?", "جالب است! چند وقت اینجایید؟"),
            d("B", "Two weeks. We're visiting the museums and trying local food.", "دو هفته. داریم موزه‌ها را می‌بینیم و غذای محلی امتحان می‌کنیم."),
            d("A", "Sounds great. What's your phone number? Maybe I can show you around.", "عالی به نظر می‌رسد. شماره تلفنت چیست؟ شاید بتوانم دور و بر را نشانت بدهم."),
            d("B", "It's 5-5-5, 1-2-3-4.", "۵-۵-۵، ۱-۲-۳-۴."),
            d("A", "OK, I'll call you. By the way, are your friends on vacation too?", "باشه، بهت زنگ می‌زنم. راستی، دوستانت هم در تعطیلات هستند؟"),
            d("B", "Yes, they are. They're teachers on summer break.", "بله. آن‌ها معلمانی هستند که در تعطیلات تابستانی هستند."),
            d("A", "How many of you are there?", "چند نفر هستید؟"),
            d("B", "Four of us. We're all from the same city.", "چهار نفر. همه اهل یک شهر هستیم."),
            d("A", "Cool. Well, enjoy your trip! See you soon.", "باحال. خب، از سفرت لذت ببر! به‌زودی می‌بینمت."),
            d("B", "Thanks. See you!", "ممنون. می‌بینمت!")
        ),
        listOf(
            q("Where is B from?", listOf("Australia", "New Zealand", "America", "Canada"), 0),
            q("How long are they staying?", listOf("one week", "two weeks", "a month", "three days"), 1),
            q("How many people are in B's group?", listOf("two", "three", "four", "five"), 2),
            q("What are B's friends' jobs?", listOf("doctors", "teachers", "students", "artists"), 1),
            q("Where ___ you from?", listOf("am", "is", "are", "be"), 2),
            q("They ___ from Japan.", listOf("am", "is", "are", "be"), 2),
            q("___ is she?", listOf("What", "Who", "Where", "How"), 1),
            q("___ old are you?", listOf("What", "Who", "Where", "How"), 3)
        ),
        idioms = listOf(
            IdiomExpression("Show you around", "دور و بر را نشان دادن", "Maybe I can show you around.", "شاید بتوانم دور و بر را نشانت بدهم."),
            IdiomExpression("By the way", "راستی", "By the way, are your friends on vacation too?", "راستی، دوستانت هم در تعطیلات هستند؟"),
            IdiomExpression("Enjoy your trip", "از سفرت لذت ببر", "Enjoy your trip!", "از سفرت لذت ببر!")
        ),
        pronunciation = listOf(
            PronunciationTip("Sentence stress", "In Wh- questions, stress the information word: WHERE are you from?"),
            PronunciationTip("Numbers", "Practice the difference between -teen and -ty: thirteen /ˌθɜːrˈtiːn/ vs. thirty /ˈθɜːrti/.")
        ),
        culture = listOf(
            CulturalNote("Small talk with tourists", "Asking where someone is from is a common and friendly way to start a conversation in English-speaking countries."),
            CulturalNote("Phone numbers", "In English, phone numbers are usually said digit by digit. For example, 555-1234 is 'five five five, one two three four'.")
        ),
        mistakes = listOf(
            CommonMistake("Where you are from?", "Where are you from?", "In questions, the verb comes before the subject."),
            CommonMistake("They is from Japan.", "They are from Japan.", "Use 'are' with 'they'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where are B and B's friends from?", "B is from Australia; the friends are from New Zealand."),
            ComprehensionQuestion("What does B plan to do during the vacation?", "Visit museums and try local food.")
        ),
        speaking = listOf(
            SpeakingTask("Ask a partner about their nationality and hometown.", "از یک دوست درباره ملیت و شهرش بپرس.", "Where are you from? / What city are you from?"),
            SpeakingTask("Practice saying phone numbers.", "تمرین کن شماره تلفن بگویی.", "It's 5-5-5, 1-2-3-4.")
        ),
        writing = listOf(
            WritingTask("Write a short paragraph about your friends.", "یک پاراگراف کوتاه درباره دوستانت بنویس.", 60, "Use we, you, they and nationalities.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 4 — Meet the family | با خانواده آشنا شو  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file4() = base(
        4, "Meet the family", "با خانواده آشنا شو",
        listOf(
            "Use possessive adjectives and possessive 's",
            "Talk about family members",
            "Describe people using adjectives",
            "Say colors and common adjectives"
        ),
        listOf(
            v("mother", "مادر", "My mother is a doctor.", "مادرم پزشک است."),
            v("father", "پدر", "My father works at home.", "پدرم در خانه کار می‌کند."),
            v("sister", "خواهر", "I have one sister.", "من یک خواهر دارم."),
            v("brother", "برادر", "My brother is twelve.", "برادرم دوازده ساله است."),
            v("family", "خانواده", "My family is very important to me.", "خانواده‌ام برای من خیلی مهم است."),
            v("parents", "والدین", "My parents live nearby.", "والدینم نزدیک زندگی می‌کنند."),
            v("children", "فرزندان", "They have two children.", "آن‌ها دو فرزند دارند."),
            v("cousin", "پسرخاله / دخترخاله", "I have many cousins.", "من پسرخاله و دخترخاله‌های زیادی دارم."),
            v("aunt", "خاله / عمه", "My aunt lives in London.", "خاله‌ام در لندن زندگی می‌کند."),
            v("uncle", "دایی / عمو", "His uncle is a teacher.", "عمویش معلم است.")
        ),
        listOf(
            GrammarSection("Possessive adjectives", "my, your, his, her, our, their. My mother is a teacher. Her name is Maria."),
            GrammarSection("Possessive 's", "Use 's to show possession: Tom's sister, my father's car, Maria's mother."),
            GrammarSection("Adjectives for describing people", "Colors: red, blue, green. Common adjectives: tall, short, old, young, big, small.")
        ),
        listOf(
            d("A", "Who's that in the photo?", "آن در عکس کیست؟"),
            d("B", "That's my sister. Her name is Maria.", "آن خواهرم است. نامش ماریا است."),
            d("A", "She's very pretty. Is she older or younger than you?", "خیلی زیباست. از تو بزرگ‌تر است یا کوچک‌تر؟"),
            d("B", "She's older. She's 30.", "بزرگ‌تر است. ۳۰ ساله است."),
            d("A", "What does she do?", "شغلش چیست؟"),
            d("B", "She's a doctor. She works at a hospital downtown.", "او پزشک است. در یک بیمارستان در مرکز شهر کار می‌کند."),
            d("A", "That's great. And who's this?", "عالی است. و این کیست؟"),
            d("B", "That's my brother, David. He's younger. He's 22.", "آن برادرم دیوید است. کوچک‌تر است. ۲۲ ساله است."),
            d("A", "What does he do?", "شغلش چیست؟"),
            d("B", "He's a student. He studies engineering.", "او دانشجو است. مهندسی می‌خواند."),
            d("A", "Do you have any other brothers or sisters?", "برادر یا خواهر دیگری داری؟"),
            d("B", "No, just Maria and David.", "نه، فقط ماریا و دیوید."),
            d("A", "What about your parents? Where are they?", "والدینت چطور؟ کجا هستند؟"),
            d("B", "They live in the same city. My father's a teacher, and my mother's a nurse.", "آن‌ها در همان شهر زندگی می‌کنند. پدرم معلم است، و مادرم پرستار."),
            d("A", "That's a nice family.", "خانواده خوبی است."),
            d("B", "Thanks. What about your family?", "ممنون. خانواده تو چطور؟"),
            d("A", "I have one brother. He's married with two children.", "من یک برادر دارم. متأهل است و دو فرزند دارد."),
            d("B", "Nice. Do they live nearby?", "عالی. نزدیک زندگی می‌کنند؟"),
            d("A", "Yes, they live close. We see each other often.", "بله، نزدیک زندگی می‌کنند. اغلب همدیگر را می‌بینیم."),
            d("B", "That's lovely. Family is important.", "زیباست. خانواده مهم است."),
            d("A", "It is. Well, I should go. See you later.", "هست. خب، باید بروم. بعداً می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What is Maria's job?", listOf("teacher", "doctor", "nurse", "student"), 1),
            q("How old is David?", listOf("20", "22", "24", "30"), 1),
            q("What does David study?", listOf("medicine", "engineering", "art", "business"), 1),
            q("What is B's mother's job?", listOf("teacher", "doctor", "nurse", "engineer"), 2),
            q("___ name is Maria.", listOf("She", "Her", "Hers", "She's"), 1),
            q("___ mother is a doctor.", listOf("My", "I", "Me", "Mine"), 0),
            q("Tom's ___ is a teacher.", listOf("father", "fathers", "father's", "fathers'"), 0),
            q("She is very ___.", listOf("beauty", "pretty", "prettily", "prettiness"), 1)
        ),
        idioms = listOf(
            IdiomExpression("See each other", "همدیگر را دیدن", "We see each other often.", "اغلب همدیگر را می‌بینیم."),
            IdiomExpression("Live nearby", "نزدیک زندگی کردن", "Do they live nearby?", "نزدیک زندگی می‌کنند؟"),
            IdiomExpression("That's lovely", "زیباست", "That's lovely.", "زیباست.")
        ),
        pronunciation = listOf(
            PronunciationTip("The schwa /ə/", "Practice the weak sound in possessives: my mother /maɪ ˈmʌðər/, her name /hər neɪm/."),
            PronunciationTip("Possessive 's", "The 's sound is clear: Tom's /tɑːmz/, Maria's /məˈriːəz/.")
        ),
        culture = listOf(
            CulturalNote("Family terms", "English uses specific terms for family members: mother, father, sister, brother, aunt, uncle, cousin. 'Cousin' is used for both male and female."),
            CulturalNote("Possessive 's", "The possessive 's is used for people and animals: my sister's car, the dog's tail. For things, use 'of': the color of the house.")
        ),
        mistakes = listOf(
            CommonMistake("She name is Maria.", "Her name is Maria.", "Use 'her' for female possession."),
            CommonMistake("My father mother is my grandmother.", "My father's mother is my grandmother.", "Use possessive 's."),
            CommonMistake("He have two children.", "He has two children.", "Use 'has' with he, she, and it.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Maria and David's jobs?", "Maria is a doctor; David is a student."),
            ComprehensionQuestion("What are B's parents' jobs?", "B's father is a teacher; B's mother is a nurse.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your family to a partner.", "خانواده‌ات را به یک دوست توصیف کن.", "I have... / My mother is... / His/Her name is..."),
            SpeakingTask("Ask a partner about their family.", "از یک دوست درباره خانواده‌اش بپرس.", "Do you have...? / What does he/she do?")
        ),
        writing = listOf(
            WritingTask("Write a paragraph about your family.", "یک پاراگراف درباره خانواده‌ات بنویس.", 70, "Use possessive adjectives and possessive 's.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 5 — A big breakfast? | صبحانه مفصل؟  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file5() = base(
        5, "A big breakfast?", "صبحانه مفصل؟",
        listOf(
            "Use simple present: I, you, we, they",
            "Talk about food and drink",
            "Describe meals and eating habits",
            "Use common verb phrases"
        ),
        listOf(
            v("breakfast", "صبحانه", "I have breakfast at 7 AM.", "ساعت ۷ صبح صبحانه می‌خورم."),
            v("lunch", "ناهار", "We have lunch at noon.", "سر ظهر ناهار می‌خوریم."),
            v("dinner", "شام", "Dinner is at 7 PM.", "شام ساعت ۷ عصر است."),
            v("coffee", "قهوه", "I drink coffee in the morning.", "صبح قهوه می‌نوشم."),
            v("tea", "چای", "She drinks tea every day.", "او هر روز چای می‌نوشد."),
            v("bread", "نان", "I eat bread for breakfast.", "برای صبحانه نان می‌خورم."),
            v("egg", "تخم‌مرغ", "I have eggs for breakfast.", "برای صبحانه تخم‌مرغ می‌خورم."),
            v("fruit", "میوه", "I eat fruit every day.", "هر روز میوه می‌خورم."),
            v("vegetable", "سبزیجات", "Eat your vegetables!", "سبزیجاتت را بخور!"),
            v("water", "آب", "I drink a lot of water.", "آب زیادی می‌نوشم.")
        ),
        listOf(
            GrammarSection("Simple present: I, you, we, they", "Use the base verb for I, you, we, they. I eat breakfast. You drink coffee. We have lunch. They like tea."),
            GrammarSection("Wh- questions with simple present", "What do you have for breakfast? Where do you eat lunch? When do you have dinner?"),
            GrammarSection("Common verb phrases", "have breakfast / lunch / dinner, drink coffee / tea / water, eat bread / fruit / vegetables.")
        ),
        listOf(
            d("A", "What do you have for breakfast?", "برای صبحانه چه می‌خوری؟"),
            d("B", "I usually have eggs and toast. And I drink coffee.", "معمولاً تخم‌مرغ و نان تست می‌خورم. و قهوه می‌نوشم."),
            d("A", "That's a big breakfast. I just have a cup of coffee.", "صبحانه مفصل است. من فقط یک فنجان قهوه می‌خورم."),
            d("B", "Really? Don't you get hungry?", "واقعاً؟ گرسنه نمی‌شوی؟"),
            d("A", "Sometimes. But I don't like eating early.", "گاهی. ولی دوست ندارم صبح زود غذا بخورم."),
            d("B", "What about lunch?", "ناهار چطور؟"),
            d("A", "I have a big lunch. Usually rice and vegetables.", "ناهار مفصل می‌خورم. معمولاً برنج و سبزیجات."),
            d("B", "And dinner?", "و شام؟"),
            d("A", "I usually have soup and bread. Something light.", "معمولاً سوپ و نان. چیز سبکی."),
            d("B", "That sounds healthy. Do you cook at home?", "سالم به نظر می‌رسد. در خانه آشپزی می‌کنی؟"),
            d("A", "Yes, I do. I like cooking. And you?", "بله. آشپزی دوست دارم. تو چطور؟"),
            d("B", "I don't cook much. I usually eat out.", "زیاد آشپزی نمی‌کنم. معمولاً بیرون غذا می‌خورم."),
            d("A", "Eating out can be expensive.", "بیرون غذا خوردن گران است."),
            d("B", "I know. But I'm busy. I don't have time to cook.", "می‌دانم. ولی مشغولم. وقت آشپزی ندارم."),
            d("A", "Maybe you can cook on weekends?", "شاید آخر هفته‌ها بتوانی آشپزی کنی؟"),
            d("B", "That's a good idea. I'll try.", "فکر خوبی است. امتحان می‌کنم."),
            d("A", "What's your favorite food?", "غذای مورد علاقه‌ات چیست؟"),
            d("B", "I love Italian food. Pizza and pasta.", "عاشق غذای ایتالیایی هستم. پیتزا و پاستا."),
            d("A", "Me too. Let's have lunch together sometime.", "من هم. بیا یک وقت با هم ناهار بخوریم."),
            d("B", "Sure! That sounds great.", "حتماً! عالی به نظر می‌رسد.")
        ),
        listOf(
            q("What does B have for breakfast?", listOf("just coffee", "eggs and toast", "fruit", "soup"), 1),
            q("What does A have for lunch?", listOf("soup and bread", "eggs", "rice and vegetables", "pizza"), 2),
            q("Does B cook at home?", listOf("yes, always", "no, rarely", "only on weekends", "never"), 1),
            q("What is B's favorite food?", listOf("Mexican", "Chinese", "Italian", "French"), 2),
            q("I ___ coffee every morning.", listOf("drink", "drinks", "drinking", "drank"), 0),
            q("We ___ lunch at noon.", listOf("have", "has", "having", "had"), 0),
            q("What ___ you have for breakfast?", listOf("do", "does", "did", "are"), 0),
            q("They ___ eat meat.", listOf("doesn't", "don't", "isn't", "not"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Eat out", "بیرون غذا خوردن", "I usually eat out.", "معمولاً بیرون غذا می‌خورم."),
            IdiomExpression("Get hungry", "گرسنه شدن", "Don't you get hungry?", "گرسنه نمی‌شوی؟"),
            IdiomExpression("Something light", "چیز سبک", "I have something light for dinner.", "برای شام چیز سبکی می‌خورم.")
        ),
        pronunciation = listOf(
            PronunciationTip("Third-person -s", "Listen for the final sound in eats, drinks, likes."),
            PronunciationTip("Linking", "Link words naturally: What do you → /wʌtʃə/, have a → /hævə/.")
        ),
        culture = listOf(
            CulturalNote("Meal times", "Meal times vary by country. In many English-speaking countries, breakfast is at 7-8 AM, lunch at 12-1 PM, and dinner at 6-7 PM."),
            CulturalNote("Eating out", "In many English-speaking countries, eating out is common. Restaurants offer takeaway (US) or takeaway (UK) options.")
        ),
        mistakes = listOf(
            CommonMistake("I drinks coffee.", "I drink coffee.", "Use the base verb with 'I'."),
            CommonMistake("She have breakfast at 7.", "She has breakfast at 7.", "Use 'has' with she, he, it."),
            CommonMistake("What you have for breakfast?", "What do you have for breakfast?", "Use 'do' in questions with I, you, we, they.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does A have for breakfast and lunch?", "A has just coffee for breakfast and rice and vegetables for lunch."),
            ComprehensionQuestion("Why doesn't B cook much?", "B is busy and doesn't have time to cook.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your eating habits.", "درباره عادات غذایی‌ات صحبت کن.", "I usually have... / I don't eat... / I like..."),
            SpeakingTask("Ask a partner about their meals.", "از یک دوست درباره وعده‌های غذایی‌اش بپرس.", "What do you have for...? / Do you cook?")
        ),
        writing = listOf(
            WritingTask("Write about your daily meals.", "درباره وعده‌های غذایی روزانه‌ات بنویس.", 70, "Use simple present and food vocabulary.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 6 — He speaks English at work | او در محل کار انگلیسی صحبت می‌کند  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file6() = base(
        6, "He speaks English at work", "او در محل کار انگلیسی صحبت می‌کند",
        listOf(
            "Use simple present: he, she, it",
            "Talk about jobs and places of work",
            "Use adverbs of frequency",
            "Describe a typical day"
        ),
        listOf(
            v("job", "شغل", "What's your job?", "شغلت چیست؟"),
            v("teacher", "معلم", "He's a teacher.", "او معلم است."),
            v("doctor", "پزشک", "She's a doctor.", "او پزشک است."),
            v("engineer", "مهندس", "He's an engineer.", "او مهندس است."),
            v("office", "دفتر", "She works in an office.", "او در یک دفتر کار می‌کند."),
            v("hospital", "بیمارستان", "He works at a hospital.", "او در یک بیمارستان کار می‌کند."),
            v("school", "مدرسه", "She works at a school.", "او در یک مدرسه کار می‌کند."),
            v("always", "همیشه", "She always exercises in the morning.", "او همیشه صبح ورزش می‌کند.", "adverb"),
            v("usually", "معمولاً", "I usually study in the morning.", "من معمولاً صبح درس می‌خوانم.", "adverb"),
            v("sometimes", "گاهی", "Sometimes I watch movies.", "گاهی فیلم می‌بینم.", "adverb")
        ),
        listOf(
            GrammarSection("Simple present: he, she, it", "Add -s or -es to the verb for he, she, it. He works. She teaches. It rains."),
            GrammarSection("Simple present questions: he, she, it", "Use does in questions: Does he work? Does she teach? Where does he work?"),
            GrammarSection("Adverbs of frequency", "Always, usually, often, sometimes, never. They come before the main verb: I always eat breakfast."),
            GrammarSection("Places of work", "work at a hospital / school / office, work in a bank / store.")
        ),
        listOf(
            d("A", "What does your father do?", "پدرت چه کار می‌کند؟"),
            d("B", "He's a teacher. He teaches English at a high school.", "او معلم است. در یک دبیرستان انگلیسی درس می‌دهد."),
            d("A", "Where does he work?", "کجا کار می‌کند؟"),
            d("B", "At Jefferson High School. It's near our house.", "در دبیرستان جفرسون. نزدیک خانه ماست."),
            d("A", "Does he like his job?", "از کارش راضی است؟"),
            d("B", "Yes, he loves it. He always comes home happy.", "بله، عاشقش است. همیشه خوشحال به خانه می‌آید."),
            d("A", "What about your mother?", "مادرت چطور؟"),
            d("B", "She's a doctor. She works at a hospital downtown.", "او پزشک است. در یک بیمارستان در مرکز شهر کار می‌کند."),
            d("A", "Does she work every day?", "هر روز کار می‌کند؟"),
            d("B", "No, she usually works five days a week. Sometimes she works on Saturdays.", "نه، معمولاً پنج روز در هفته کار می‌کند. گاهی شنبه‌ها هم کار می‌کند."),
            d("A", "That's a busy schedule.", "برنامه شلوغی است."),
            d("B", "Yes, it is. But she likes helping people.", "بله. ولی کمک به مردم را دوست دارد."),
            d("A", "What about you? What do you do?", "تو چطور؟ شغلت چیست؟"),
            d("B", "I'm a student. I study business.", "من دانشجو هستم. تجارت می‌خوانم."),
            d("A", "Do you work part-time?", "پاره‌وقت کار می‌کنی؟"),
            d("B", "Yes, I work at a café on weekends.", "بله، آخر هفته‌ها در یک کافه کار می‌کنم."),
            d("A", "That sounds nice. Do you like it?", "خوب به نظر می‌رسد. دوستش داری؟"),
            d("B", "It's okay. The pay isn't great, but I meet a lot of people.", "بد نیست. حقوقش عالی نیست، ولی با افراد زیادی آشنا می‌شوم."),
            d("A", "That's a good experience.", "تجربه خوبی است."),
            d("B", "Yes, I think so too.", "بله، من هم فکر می‌کنم.")
        ),
        listOf(
            q("What does B's father do?", listOf("doctor", "teacher", "engineer", "banker"), 1),
            q("Where does B's mother work?", listOf("at a school", "at a hospital", "in an office", "in a bank"), 1),
            q("How often does B's mother work on Saturdays?", listOf("always", "never", "sometimes", "usually"), 2),
            q("Where does B work part-time?", listOf("at a restaurant", "at a café", "at a school", "at a store"), 1),
            q("He ___ English at a high school.", listOf("teach", "teaches", "teaching", "taught"), 1),
            q("She ___ at a hospital.", listOf("work", "works", "working", "worked"), 1),
            q("___ he like his job?", listOf("Do", "Does", "Is", "Are"), 1),
            q("She ___ exercises in the morning.", listOf("always", "never", "sometimes", "usually"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Part-time", "پاره‌وقت", "I work part-time at a café.", "پاره‌وقت در یک کافه کار می‌کنم."),
            IdiomExpression("Busy schedule", "برنامه شلوغ", "That's a busy schedule.", "برنامه شلوغی است."),
            IdiomExpression("Meet a lot of people", "با افراد زیادی آشنا شدن", "I meet a lot of people.", "با افراد زیادی آشنا می‌شوم.")
        ),
        pronunciation = listOf(
            PronunciationTip("Third-person -s", "Listen for the final sound: works /wɜːrks/, teaches /ˈtiːtʃɪz/, goes /ɡoʊz/."),
            PronunciationTip("Sentence stress with adverbs", "Stress the adverb: She ALways exercises.")
        ),
        culture = listOf(
            CulturalNote("Work schedules", "In many English-speaking countries, the standard work week is 40 hours (Monday-Friday). Part-time work is common for students."),
            CulturalNote("Jobs and titles", "When talking about jobs, use 'a/an' for singular: He's a teacher. She's an engineer. He's a doctor.")
        ),
        mistakes = listOf(
            CommonMistake("He teach English.", "He teaches English.", "Add -es for he, she, it with verbs ending in -ch, -sh, -s."),
            CommonMistake("Does he works at a hospital?", "Does he work at a hospital?", "After 'does', use the base verb."),
            CommonMistake("She always is happy.", "She is always happy.", "Adverbs of frequency come after 'be'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are B's parents' jobs?", "B's father is a teacher; B's mother is a doctor."),
            ComprehensionQuestion("What does B do part-time?", "B works at a café on weekends.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your job or studies.", "درباره شغل یا تحصیلت صحبت کن.", "I'm a... / I work at... / I usually..."),
            SpeakingTask("Ask a partner about their daily routine.", "از یک دوست درباره برنامه روزانه‌اش بپرس.", "What do you do? / Do you work...?")
        ),
        writing = listOf(
            WritingTask("Write about a family member's job.", "درباره شغل یکی از اعضای خانواده‌ات بنویس.", 70, "Use simple present and adverbs of frequency.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 7 — Life at the end of the world | زندگی در انتهای جهان  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file7() = base(
        7, "Life at the end of the world", "زندگی در انتهای جهان",
        listOf(
            "Use word order in questions",
            "Talk about daily life and routines",
            "Use common verbs",
            "Ask and answer about habits"
        ),
        listOf(
            v("island", "جزیره", "They live on a small island.", "آن‌ها در یک جزیره کوچک زندگی می‌کنند."),
            v("village", "روستا", "The village is very quiet.", "روستا خیلی ساکت است."),
            v("weather", "هوا", "The weather is cold here.", "هوا اینجا سرد است."),
            v("cold", "سرد", "It's very cold in winter.", "زمستان خیلی سرد است.", "adjective"),
            v("warm", "گرم", "The summers are warm.", "تابستان‌ها گرم هستند.", "adjective"),
            v("quiet", "ساکت", "The village is quiet.", "روستا ساکت است.", "adjective"),
            v("nature", "طبیعت", "They love nature.", "آن‌ها عاشق طبیعت هستند."),
            v("fish", "ماهی", "They catch fish for dinner.", "برای شام ماهی می‌گیرند."),
            v("boat", "قایق", "They travel by boat.", "با قایق سفر می‌کنند."),
            v("mountains", "کوه‌ها", "There are mountains everywhere.", "همه جا کوه هست.")
        ),
        listOf(
            GrammarSection("Word order in questions", "In questions, the auxiliary verb comes before the subject: Where do you live? What do you do? How do you get to work?"),
            GrammarSection("Simple present review", "Use the base verb for I, you, we, they and add -s for he, she, it."),
            GrammarSection("Common verbs", "live, work, study, eat, drink, go, come, have, like, love.")
        ),
        listOf(
            d("A", "Where do you live?", "کجا زندگی می‌کنی؟"),
            d("B", "I live on a small island. It's in the north.", "در یک جزیره کوچک زندگی می‌کنم. در شمال است."),
            d("A", "Wow, that's interesting. What's it like?", "واو، جالب است. چطور جایی است؟"),
            d("B", "It's very quiet and beautiful. There are only 200 people.", "خیلی ساکت و زیباست. فقط ۲۰۰ نفر هستند."),
            d("A", "200 people! That's small.", "۲۰۰ نفر! کوچک است."),
            d("B", "Yes, everyone knows everyone.", "بله، همه همه را می‌شناسند."),
            d("A", "What do you do there?", "آنجا چه کار می‌کنی؟"),
            d("B", "My family has a small fishing business.", "خانواده‌ام یک کسب‌وکار کوچک ماهیگیری دارد."),
            d("A", "That sounds nice. Do you like it?", "خوب به نظر می‌رسد. دوستش داری؟"),
            d("B", "I love it. It's peaceful. But it can be lonely sometimes.", "عاشقش هستم. آرام است. ولی گاهی می‌تواند تنها باشد."),
            d("A", "How do you get to the mainland?", "چطور به سرزمین اصلی می‌رسی؟"),
            d("B", "By boat. It takes about an hour.", "با قایق. حدود یک ساعت طول می‌کشد."),
            d("A", "What do you do for fun?", "برای سرگرمی چه می‌کنی؟"),
            d("B", "We go fishing, hiking in the mountains, and sometimes we have parties.", "ماهیگیری می‌رویم، در کوه‌ها پیاده‌روی می‌کنیم، و گاهی مهمانی داریم."),
            d("A", "That sounds lovely. What's the weather like?", "زیبا به نظر می‌رسد. هوا چطور است؟"),
            d("B", "Cold in winter, warm in summer. We get a lot of rain.", "زمستان سرد، تابستان گرم. باران زیادی می‌گیریم."),
            d("A", "Would you ever leave?", "هرگز ترک می‌کنی؟"),
            d("B", "Maybe for a while. But this is home. I'll always come back.", "شاید برای مدتی. ولی اینجا خانه است. همیشه برمی‌گردم."),
            d("A", "That's beautiful. Thanks for sharing.", "زیباست. ممنون که به اشتراک گذاشتی."),
            d("B", "You're welcome. Come visit sometime!", "خواهش می‌کنم. یک وقت بیا دیدن!"),
            d("A", "I'd love to!", "خیلی دوست دارم!")
        ),
        listOf(
            q("How many people live on the island?", listOf("50", "100", "200", "500"), 2),
            q("What is B's family business?", listOf("farming", "fishing", "tourism", "teaching"), 1),
            q("How does B get to the mainland?", listOf("by plane", "by boat", "by car", "by train"), 1),
            q("What is the weather like?", listOf("hot all year", "cold all year", "cold in winter, warm in summer", "always rainy"), 2),
            q("Where ___ you live?", listOf("do", "does", "are", "is"), 0),
            q("What ___ you do there?", listOf("do", "does", "are", "is"), 0),
            q("It ___ about an hour.", listOf("take", "takes", "taking", "took"), 1),
            q("We ___ fishing for fun.", listOf("go", "goes", "going", "went"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Everyone knows everyone", "همه همه را می‌شناسند", "Everyone knows everyone.", "همه همه را می‌شناسند."),
            IdiomExpression("For a while", "برای مدتی", "Maybe for a while.", "شاید برای مدتی."),
            IdiomExpression("Come visit", "بیا دیدن", "Come visit sometime!", "یک وقت بیا دیدن!")
        ),
        pronunciation = listOf(
            PronunciationTip("Question intonation", "Wh- questions: falling at the end (Where do you live? ↘)"),
            PronunciationTip("The /aɪ/ sound", "Practice: island /ˈaɪlənd/, nice /naɪs/, like /laɪk/.")
        ),
        culture = listOf(
            CulturalNote("Life on an island", "Life on a small island is very different from city life. People often know each other well, and community is important."),
            CulturalNote("Asking about daily life", "Questions like 'What do you do?' and 'How do you get to...?' are common ways to learn about someone's daily life.")
        ),
        mistakes = listOf(
            CommonMistake("Where you live?", "Where do you live?", "Use 'do' in questions with I, you, we, they."),
            CommonMistake("It take an hour.", "It takes an hour.", "Add -s for it.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is life like on the island?", "Quiet, beautiful, with only 200 people who all know each other."),
            ComprehensionQuestion("What does B do for fun?", "Fishing, hiking, and parties.")
        ),
        speaking = listOf(
            SpeakingTask("Describe where you live.", "جایی که زندگی می‌کنی را توصیف کن.", "I live in... / It's... / There are..."),
            SpeakingTask("Ask a partner about their daily life.", "از یک دوست درباره زندگی روزانه‌اش بپرس.", "Where do you live? / What do you do for fun?")
        ),
        writing = listOf(
            WritingTask("Write about your town or city.", "درباره شهر یا روستای خودت بنویس.", 80, "Include location, size, and what you do there.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 8 — What are they doing? | آن‌ها چه کار می‌کنند؟  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file8() = base(
        8, "What are they doing?", "آن‌ها چه کار می‌کنند؟",
        listOf(
            "Use present continuous",
            "Talk about actions happening now",
            "Describe the weather",
            "Use verb phrases"
        ),
        listOf(
            v("doing", "انجام دادن", "What are you doing?", "چه کار می‌کنی؟", "verb"),
            v("wearing", "پوشیدن", "She's wearing a red dress.", "او یک لباس قرمز پوشیده است.", "verb"),
            v("reading", "خواندن", "He's reading a book.", "او یک کتاب می‌خواند.", "verb"),
            v("writing", "نوشتن", "I'm writing a letter.", "دارم نامه می‌نویسم.", "verb"),
            v("sleeping", "خوابیدن", "The baby is sleeping.", "بچه خواب است.", "verb"),
            v("raining", "باران آمدن", "It's raining now.", "الان باران می‌آید.", "verb"),
            v("sunny", "آفتابی", "It's sunny today.", "امروز آفتابی است.", "adjective"),
            v("cloudy", "ابری", "It's cloudy this morning.", "امروز صبح ابری است.", "adjective"),
            v("windy", "بادی", "It's very windy.", "خیلی بادی است.", "adjective"),
            v("snowing", "برف آمدن", "It's snowing outside.", "بیرون برف می‌آید.", "verb")
        ),
        listOf(
            GrammarSection("Present continuous", "Use am/is/are + verb-ing for actions happening now. I'm reading. She's wearing a dress. They're playing."),
            GrammarSection("Present continuous questions", "What are you doing? What is he doing? What are they doing?"),
            GrammarSection("Present continuous vs. simple present", "Present continuous: action now (I'm eating). Simple present: habit (I eat breakfast every day)."),
            GrammarSection("Weather", "It's raining / snowing / sunny / cloudy / windy.")
        ),
        listOf(
            d("A", "Hello? This is Anna.", "سلام؟ آنّا هستم."),
            d("B", "Hi, Anna. It's Mike. What are you doing?", "سلام آنّا. مایک هستم. چه کار می‌کنی؟"),
            d("A", "I'm cooking dinner. What about you?", "دارم شام می‌پزم. تو چطور؟"),
            d("B", "I'm watching TV. It's raining outside, so I'm staying home.", "دارم تلویزیون تماشا می‌کنم. بیرون باران می‌آید، پس خانه مانده‌ام."),
            d("A", "Is it raining? It's sunny here.", "باران می‌آید؟ اینجا آفتابی است."),
            d("B", "Really? The weather is so different.", "واقعاً؟ هوا اینقدر متفاوت است."),
            d("A", "What are your kids doing?", "بچه‌هایت چه کار می‌کنند؟"),
            d("B", "They're playing a game. My son is winning.", "دارند بازی می‌کنند. پسرم دارد می‌برد."),
            d("A", "That's fun. Are you cooking anything special?", "سرگرم‌کننده است. چیز خاصی می‌پزی؟"),
            d("B", "Just pasta. What are you making?", "فقط پاستا. تو چه درست می‌کنی؟"),
            d("A", "Chicken and vegetables.", "مرغ و سبزیجات."),
            d("B", "That sounds delicious.", "خوشمزه به نظر می‌رسد."),
            d("A", "Thanks. Do you want to come over for dinner?", "ممنون. می‌خواهی برای شام بیایی؟"),
            d("B", "I'd love to, but it's raining. Maybe tomorrow?", "خیلی دوست دارم، ولی باران می‌آید. شاید فردا؟"),
            d("A", "Sure. Tomorrow is fine.", "حتماً. فردا خوب است."),
            d("B", "Great. What are you doing tomorrow?", "عالی. فردا چه کار می‌کنی؟"),
            d("A", "I'm working in the morning. But I'm free after 6.", "صبح کار می‌کنم. ولی بعد از ۶ آزادم."),
            d("B", "Perfect. See you tomorrow!", "عالی. فردا می‌بینمت!"),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What is Anna doing?", listOf("watching TV", "cooking dinner", "reading", "sleeping"), 1),
            q("What is the weather like at Mike's house?", listOf("sunny", "cloudy", "raining", "snowing"), 2),
            q("What are Mike's kids doing?", listOf("sleeping", "playing a game", "eating", "studying"), 1),
            q("When will they meet?", listOf("today", "tomorrow", "next week", "never"), 1),
            q("What ___ you doing?", listOf("are", "is", "am", "do"), 0),
            q("She ___ wearing a red dress.", listOf("are", "is", "am", "do"), 1),
            q("They ___ playing a game.", listOf("are", "is", "am", "do"), 0),
            q("It ___ raining outside.", listOf("are", "is", "am", "do"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Come over", "به خانه کسی آمدن", "Do you want to come over?", "می‌خواهی بیایی؟"),
            IdiomExpression("What about you?", "تو چطور؟", "What about you?", "تو چطور؟"),
            IdiomExpression("That sounds delicious", "خوشمزه به نظر می‌رسد", "That sounds delicious.", "خوشمزه به نظر می‌رسد.")
        ),
        pronunciation = listOf(
            PronunciationTip("The -ing sound", "Practice the /ɪŋ/ sound: cooking /ˈkʊkɪŋ/, raining /ˈreɪnɪŋ/, playing /ˈpleɪɪŋ/."),
            PronunciationTip("Contractions", "Practice natural contractions: I'm /aɪm/, she's /ʃiːz/, they're /ðer/.")
        ),
        culture = listOf(
            CulturalNote("Phone conversations", "When calling someone in English, it's common to say 'This is [name]' instead of 'I am [name]'."),
            CulturalNote("Weather small talk", "The weather is a very common topic of small talk in English-speaking countries, especially in the UK."),
        ),
        mistakes = listOf(
            CommonMistake("What you are doing?", "What are you doing?", "In questions, the verb comes before the subject."),
            CommonMistake("She wearing a dress.", "She is wearing a dress.", "Present continuous needs 'be + verb-ing'."),
            CommonMistake("It raining.", "It is raining.", "Use 'is' before the -ing verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is Anna doing and what is Mike doing?", "Anna is cooking dinner; Mike is watching TV."),
            ComprehensionQuestion("Why can't Mike come over for dinner?", "It's raining at his house.")
        ),
        speaking = listOf(
            SpeakingTask("Describe what you are doing right now.", "توصیف کن الان چه کار می‌کنی.", "I'm... / I'm not..."),
            SpeakingTask("Role-play a phone conversation with a partner.", "نقش‌بازی یک مکالمه تلفنی با یک دوست.", "Hello? This is... / What are you doing?")
        ),
        writing = listOf(
            WritingTask("Write a short message to a friend about what you're doing.", "یک پیام کوتاه به یک دوست بنویس و بگو چه کار می‌کنی.", 60, "Use present continuous.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 9 — In the jungle in Guatemala | در جنگل گواتمالا  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file9() = base(
        9, "In the jungle in Guatemala", "در جنگل گواتمالا",
        listOf(
            "Use there is / there are",
            "Use prepositions of place: in, on, under",
            "Talk about places and locations",
            "Describe a place"
        ),
        listOf(
            v("jungle", "جنگل", "The jungle is very green.", "جنگل خیلی سبز است."),
            v("tree", "درخت", "There are many trees here.", "اینجا درختان زیادی هست."),
            v("river", "رودخانه", "The river is beautiful.", "رودخانه زیباست."),
            v("animal", "حیوان", "There are many animals in the jungle.", "حیوانات زیادی در جنگل هستند."),
            v("bird", "پرنده", "The birds are singing.", "پرنده‌ها آواز می‌خوانند."),
            v("flower", "گل", "The flowers are colorful.", "گل‌ها رنگارنگ هستند."),
            v("mountain", "کوه", "There's a mountain in the distance.", "کوهی در دوردست هست."),
            v("village", "روستا", "There's a small village nearby.", "روستای کوچکی نزدیک است."),
            v("house", "خانه", "Their house is near the river.", "خانه‌شان نزدیک رودخانه است."),
            v("bridge", "پل", "There's a bridge over the river.", "پلی روی رودخانه هست.")
        ),
        listOf(
            GrammarSection("There is / There are", "Use 'there is' for singular things and 'there are' for plural things. There is a river. There are many trees."),
            GrammarSection("Prepositions of place: in, on, under", "The cat is in the box. The book is on the table. The ball is under the chair."),
            GrammarSection("Questions with there is / there are", "Is there a bank near here? Are there any restaurants? How many people are there?")
        ),
        listOf(
            d("A", "Where are you from?", "اهل کجایی؟"),
            d("B", "I'm from Guatemala. I live in a small village in the jungle.", "اهل گواتمالا هستم. در یک روستای کوچک در جنگل زندگی می‌کنم."),
            d("A", "In the jungle? That sounds amazing!", "در جنگل؟ شگفت‌انگیز به نظر می‌رسد!"),
            d("B", "It is. There are trees everywhere and a beautiful river.", "هست. همه جا درخت هست و یک رودخانه زیبا."),
            d("A", "Are there many animals?", "حیوانات زیادی هستند؟"),
            d("B", "Yes, there are. Birds, monkeys, and sometimes jaguars.", "بله. پرنده‌ها، میمون‌ها، و گاهی جگوارها."),
            d("A", "Jaguars! That's a little scary.", "جگوارها! کمی ترسناک است."),
            d("B", "They don't come near the village. They stay in the forest.", "به روستا نزدیک نمی‌شوند. در جنگل می‌مانند."),
            d("A", "What's in your village?", "در روستای شما چیست؟"),
            d("B", "There's a school, a church, and a small market.", "یک مدرسه، یک کلیسا، و یک بازار کوچک هست."),
            d("A", "Is there a hospital?", "بیمارستانی هست؟"),
            d("B", "No, there isn't. The nearest hospital is two hours away.", "نه، نیست. نزدیک‌ترین بیمارستان دو ساعت دورتر است."),
            d("A", "That's far. What do you do for fun?", "دور است. برای سرگرمی چه می‌کنید؟"),
            d("B", "We swim in the river and play soccer. There's a soccer field near the school.", "در رودخانه شنا می‌کنیم و فوتبال بازی می‌کنیم. یک زمین فوتبال نزدیک مدرسه هست."),
            d("A", "That sounds fun. Is there internet?", "سرگرم‌کننده به نظر می‌رسد. اینترنت هست؟"),
            d("B", "Sometimes. It's very slow.", "گاهی. خیلی کند است."),
            d("A", "Life in the jungle is so different.", "زندگی در جنگل خیلی متفاوت است."),
            d("B", "Yes, but it's beautiful. You should visit.", "بله، ولی زیباست. باید بیایی."),
            d("A", "I'd love to!", "خیلی دوست دارم!"),
            d("B", "Come in the dry season. The weather is perfect.", "در فصل خشک بیا. هوا عالی است."),
            d("A", "I will. Thanks!", "می‌آیم. ممنون!")
        ),
        listOf(
            q("Where does B live?", listOf("in a city", "in a village in the jungle", "on an island", "in the mountains"), 1),
            q("What animals are in the jungle?", listOf("lions and tigers", "birds, monkeys, and jaguars", "elephants", "bears"), 1),
            q("Is there a hospital in B's village?", listOf("yes", "no", "sometimes", "only on weekends"), 1),
            q("What does B do for fun?", listOf("watch TV", "swim and play soccer", "read books", "go shopping"), 1),
            q("___ there a river?", listOf("Is", "Are", "Am", "Do"), 0),
            q("___ there many trees?", listOf("Is", "Are", "Am", "Do"), 1),
            q("The cat is ___ the box.", listOf("in", "on", "under", "at"), 0),
            q("The book is ___ the table.", listOf("in", "on", "under", "at"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Nearby", "نزدیک", "There's a small village nearby.", "روستای کوچکی نزدیک است."),
            IdiomExpression("In the distance", "در دوردست", "There's a mountain in the distance.", "کوهی در دوردست هست."),
            IdiomExpression("Dry season", "فصل خشک", "Come in the dry season.", "در فصل خشک بیا.")
        ),
        pronunciation = listOf(
            PronunciationTip("There is / There are", "Link the words: There_is, There_are."),
            PronunciationTip("The /dʒ/ sound", "Practice: jungle /ˈdʒʌŋɡəl/, jaguar /ˈdʒæɡwɑːr/.")
        ),
        culture = listOf(
            CulturalNote("Life in Guatemala", "Guatemala is a country in Central America with beautiful jungles, mountains, and ancient Mayan ruins."),
            CulturalNote("There is / There are", "Use 'there is' for singular and 'there are' for plural. This is a very common structure for describing places.")
        ),
        mistakes = listOf(
            CommonMistake("There is many trees.", "There are many trees.", "Use 'there are' with plural nouns."),
            CommonMistake("Is there any restaurants?", "Are there any restaurants?", "Use 'are' with plural nouns.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is there in B's village?", "A school, a church, a small market, and a soccer field."),
            ComprehensionQuestion("What does B do for fun?", "Swims in the river and plays soccer.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your town or neighborhood using there is / there are.", "شهر یا محله‌ات را با there is / there are توصیف کن.", "There's a... / There are..."),
            SpeakingTask("Ask a partner about their hometown.", "از یک دوست درباره زادگاهش بپرس.", "Is there...? / Are there...?")
        ),
        writing = listOf(
            WritingTask("Write a description of a place you know well.", "توصیفی از جایی که خوب می‌شناسی بنویس.", 80, "Use there is / there are and prepositions of place.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 10 — Before they were stars | قبل از اینکه ستاره شوند  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file10() = base(
        10, "Before they were stars", "قبل از اینکه ستاره شوند",
        listOf(
            "Use simple past: be",
            "Use prepositions of place: in, at, on",
            "Talk about past situations",
            "Describe where people were"
        ),
        listOf(
            v("yesterday", "دیروز", "I was tired yesterday.", "دیروز خسته بودم."),
            v("last night", "دیشب", "We were at home last night.", "دیشب خانه بودیم."),
            v("last week", "هفته پیش", "She was in New York last week.", "هفته پیش در نیویورک بود."),
            v("born", "متولد شدن", "He was born in 1990.", "او در سال ۱۹۹۰ متولد شد."),
            v("child", "کودک", "When I was a child, I lived in London.", "وقتی کودک بودم، در لندن زندگی می‌کردم."),
            v("young", "جوان", "She was very young when she became famous.", "او وقتی معروف شد خیلی جوان بود."),
            v("poor", "فقیر", "They were very poor.", "آن‌ها خیلی فقیر بودند."),
            v("rich", "ثروتمند", "Now they're rich and famous.", "الان ثروتمند و معروف هستند."),
            v("famous", "معروف", "Before they were famous, they were students.", "قبل از اینکه معروف شوند، دانشجو بودند."),
            v("school", "مدرسه", "They were at school together.", "آن‌ها با هم در مدرسه بودند.")
        ),
        listOf(
            GrammarSection("Simple past: be", "Use was for I, he, she, it. Use were for you, we, they. I was tired. They were at home."),
            GrammarSection("Simple past: be negative", "Use wasn't and weren't. He wasn't at school. We weren't ready."),
            GrammarSection("Prepositions of place: in, at, on", "in a city / country, at home / school / work, on a street / beach."),
            GrammarSection("Time expressions for the past", "yesterday, last night, last week, last year, in 2010, when I was a child.")
        ),
        listOf(
            d("A", "Where were you yesterday?", "دیروز کجا بودی؟"),
            d("B", "I was at home. I wasn't feeling well.", "خانه بودم. حالم خوب نبود."),
            d("A", "Oh, I'm sorry. Are you better now?", "اوه، متأسفم. الان بهتر هستی؟"),
            d("B", "Yes, much better. Where were you?", "بله، خیلی بهتر. تو کجا بودی؟"),
            d("A", "I was at the library. I was studying for an exam.", "کتابخانه بودم. برای امتحان درس می‌خواندم."),
            d("B", "Did you study a lot?", "زیاد درس خواندی؟"),
            d("A", "Yes, I was there for five hours.", "بله، پنج ساعت آنجا بودم."),
            d("B", "Wow. That's a long time.", "واو. زمان زیادی است."),
            d("A", "I know. But the exam is important.", "می‌دانم. ولی امتحان مهم است."),
            d("B", "When is it?", "کی است؟"),
            d("A", "Next Monday. I'm a little nervous.", "دوشنبه آینده. کمی مضطربم."),
            d("B", "You'll do great. You always study hard.", "عالی عمل می‌کنی. همیشه سخت درس می‌خوانی."),
            d("A", "Thanks. What about you? Where were you last week?", "ممنون. تو چطور؟ هفته پیش کجا بودی؟"),
            d("B", "I was in New York for work.", "برای کار در نیویورک بودم."),
            d("A", "That's exciting. Was it your first time?", "هیجان‌انگیز است. اولین بارت بود؟"),
            d("B", "No, I was there last year too. I love the city.", "نه، سال پیش هم آنجا بودم. عاشق شهر هستم."),
            d("A", "What did you do there?", "آنجا چه کار کردی؟"),
            d("B", "I had meetings, but I also visited some museums.", "جلسه داشتم، ولی از چند موزه هم دیدن کردم."),
            d("A", "That sounds nice.", "خوب به نظر می‌رسد."),
            d("B", "It was. Well, I should go. See you tomorrow.", "همینطور بود. خب، باید بروم. فردا می‌بینمت."),
            d("A", "See you. Good luck with your studying!", "می‌بینمت. با درس خواندنت موفق باشی!"),
            d("B", "Thanks. Good luck with your work!", "ممنون. با کارت موفق باشی!")
        ),
        listOf(
            q("Where was A yesterday?", listOf("at home", "at the library", "at school", "in New York"), 1),
            q("How long was A at the library?", listOf("2 hours", "3 hours", "5 hours", "all day"), 2),
            q("Where was B last week?", listOf("in London", "in New York", "at home", "at work"), 1),
            q("When is A's exam?", listOf("today", "tomorrow", "next Monday", "next month"), 2),
            q("I ___ tired yesterday.", listOf("am", "is", "was", "were"), 2),
            q("They ___ at home last night.", listOf("was", "were", "am", "is"), 1),
            q("She ___ at school yesterday.", listOf("was", "were", "am", "is"), 0),
            q("We ___ ready.", listOf("wasn't", "weren't", "aren't", "isn't"), 1)
        ),
        idioms = listOf(
            IdiomExpression("I'm sorry", "متأسفم", "I'm sorry you weren't feeling well.", "متأسفم که حالت خوب نبود."),
            IdiomExpression("Do great", "عالی عمل کردن", "You'll do great.", "عالی عمل می‌کنی."),
            IdiomExpression("Study hard", "سخت درس خواندن", "You always study hard.", "همیشه سخت درس می‌خوانی.")
        ),
        pronunciation = listOf(
            PronunciationTip("The /w/ sound", "Practice: was /wʌz/, were /wɜːr/, we /wiː/."),
            PronunciationTip("Weak forms", "In natural speech, 'was' and 'were' are often weak: was /wəz/, were /wər/.")
        ),
        culture = listOf(
            CulturalNote("Famous people's past", "Many celebrities were not always rich or famous. Learning about their past helps us understand their journey."),
            CulturalNote("Prepositions of place", "In English, we say 'in New York' (city), 'at home' (specific place), 'on Main Street' (street).")
        ),
        mistakes = listOf(
            CommonMistake("I were tired.", "I was tired.", "Use 'was' with 'I'."),
            CommonMistake("They was at home.", "They were at home.", "Use 'were' with 'they'."),
            CommonMistake("He was born in 1990 in London.", "He was born in 1990. OR He was born in London.", "Use one prepositional phrase at a time.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where were A and B yesterday?", "A was at the library; B was at home."),
            ComprehensionQuestion("Where was B last week?", "In New York for work.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about where you were yesterday.", "درباره اینکه دیروز کجا بودی صحبت کن.", "I was... / I wasn't..."),
            SpeakingTask("Ask a partner about their past activities.", "از یک دوست درباره فعالیت‌های گذشته‌اش بپرس.", "Where were you...? / Were you...?")
        ),
        writing = listOf(
            WritingTask("Write about what you did last weekend.", "درباره آخر هفته گذشته‌ات بنویس.", 80, "Use simple past be and time expressions.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 11 — It changed my life | زندگی‌ام را تغییر داد  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file11() = base(
        11, "It changed my life", "زندگی‌ام را تغییر داد",
        listOf(
            "Use simple past: regular verbs",
            "Talk about past experiences",
            "Use time expressions for the past",
            "Ask and answer about past events"
        ),
        listOf(
            v("change", "تغییر دادن", "The trip changed my life.", "سفر زندگی‌ام را تغییر داد.", "verb"),
            v("travel", "سفر کردن", "I traveled to Africa last year.", "سال گذشته به آفریقا سفر کردم.", "verb"),
            v("visit", "بازدید کردن", "We visited many museums.", "از موزه‌های زیادی بازدید کردیم.", "verb"),
            v("start", "شروع کردن", "I started a new job.", "یک شغل جدید شروع کردم.", "verb"),
            v("finish", "تمام کردن", "She finished her studies.", "او تحصیلاتش را تمام کرد.", "verb"),
            v("work", "کار کردن", "He worked in a hospital.", "او در یک بیمارستان کار کرد.", "verb"),
            v("learn", "یاد گرفتن", "I learned to speak English.", "یاد گرفتم انگلیسی صحبت کنم.", "verb"),
            v("move", "نقل مکان کردن", "They moved to a new city.", "آن‌ها به شهر جدیدی نقل مکان کردند.", "verb"),
            v("marry", "ازدواج کردن", "She married her college boyfriend.", "او با دوست‌پسر دانشگاهش ازدواج کرد.", "verb"),
            v("meet", "ملاقات کردن", "I met my best friend at work.", "بهترین دوستم را در محل کار ملاقات کردم.", "verb")
        ),
        listOf(
            GrammarSection("Simple past: regular verbs", "Add -ed to most regular verbs: visit → visited, work → worked, start → started."),
            GrammarSection("Simple past: spelling rules", "Add -ed, but for verbs ending in -e, add -d (like → liked). For verbs ending in consonant + y, change y to i and add -ed (study → studied)."),
            GrammarSection("Simple past questions", "Use did + base verb: Did you travel? Did she work? Where did you go?"),
            GrammarSection("Time expressions", "yesterday, last night, last week, last month, last year, in 2015, two years ago.")
        ),
        listOf(
            d("A", "Did you travel last year?", "سال گذشته سفر کردی؟"),
            d("B", "Yes, I did. I went to Africa.", "بله. به آفریقا رفتم."),
            d("A", "Wow! What did you do there?", "واو! آنجا چه کار کردی؟"),
            d("B", "I visited Kenya and Tanzania. I saw wild animals on a safari.", "از کنیا و تانزانیا بازدید کردم. در یک سافاری حیوانات وحشی دیدم."),
            d("A", "That sounds amazing. Did you like it?", "شگفت‌انگیز به نظر می‌رسد. دوستش داشتی؟"),
            d("B", "I loved it. It changed my life.", "عاشقش شدم. زندگی‌ام را تغییر داد."),
            d("A", "How did it change your life?", "چطور زندگی‌ات را تغییر داد؟"),
            d("B", "I decided to study biology. I want to help protect animals.", "تصمیم گرفتم زیست‌شناسی بخوانم. می‌خواهم به محافظت از حیوانات کمک کنم."),
            d("A", "That's wonderful. What did you study before?", "فوق‌العاده است. قبلش چه می‌خواندی؟"),
            d("B", "Business. But I wasn't happy.", "تجارت. ولی خوشحال نبودم."),
            d("A", "So the trip really changed everything.", "پس سفر واقعاً همه چیز را تغییر داد."),
            d("B", "Yes. What about you? Did you travel anywhere?", "بله. تو چطور؟ جایی سفر کردی؟"),
            d("A", "I didn't travel, but I started a new job.", "سفر نکردم، ولی یک شغل جدید شروع کردم."),
            d("B", "That's exciting. What do you do now?", "هیجان‌انگیز است. الان چه کار می‌کنی؟"),
            d("A", "I work at a tech company. I'm a designer.", "در یک شرکت فناوری کار می‌کنم. طراح هستم."),
            d("B", "Nice. Do you like it?", "عالی. دوستش داری؟"),
            d("A", "I love it. It was a good change.", "عاشقش هستم. تغییر خوبی بود."),
            d("B", "That's great. Life is full of changes.", "عالی است. زندگی پر از تغییر است."),
            d("A", "It is. Well, I should go. See you later.", "هست. خب، باید بروم. بعداً می‌بینمت."),
            d("B", "See you. Good luck with your new job!", "می‌بینمت. با شغل جدیدت موفق باشی!"),
            d("A", "Thanks!", "ممنون!")
        ),
        listOf(
            q("Where did B travel?", listOf("Asia", "Africa", "Europe", "South America"), 1),
            q("What did B see on the safari?", listOf("birds", "wild animals", "mountains", "beaches"), 1),
            q("What did B decide to study?", listOf("business", "biology", "history", "art"), 1),
            q("What is A's new job?", listOf("teacher", "doctor", "designer", "engineer"), 2),
            q("Did you ___ last year?", listOf("traveled", "travel", "traveling", "travels"), 1),
            q("I ___ to Africa.", listOf("go", "went", "going", "goes"), 1),
            q("She ___ a new job.", listOf("start", "started", "starting", "starts"), 1),
            q("They ___ to a new city.", listOf("move", "moved", "moving", "moves"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Change my life", "زندگی‌ام را تغییر دادن", "It changed my life.", "زندگی‌ام را تغییر داد."),
            IdiomExpression("Full of changes", "پر از تغییر", "Life is full of changes.", "زندگی پر از تغییر است."),
            IdiomExpression("Good change", "تغییر خوب", "It was a good change.", "تغییر خوبی بود.")
        ),
        pronunciation = listOf(
            PronunciationTip("-ed endings", "The -ed ending has three sounds: /t/ (worked), /d/ (traveled), /ɪd/ (visited)."),
            PronunciationTip("Irregular past verbs", "Practice: go → went, see → saw, have → had, do → did.")
        ),
        culture = listOf(
            CulturalNote("Life-changing experiences", "Travel is often described as life-changing. It opens our eyes to new cultures and perspectives."),
            CulturalNote("Career changes", "Changing careers is becoming more common. People often seek work that aligns with their values and passions.")
        ),
        mistakes = listOf(
            CommonMistake("Did you traveled?", "Did you travel?", "After 'did', use the base verb."),
            CommonMistake("I didn't went.", "I didn't go.", "After 'didn't', use the base verb."),
            CommonMistake("She study biology.", "She studied biology.", "Change y to i and add -ed for verbs ending in consonant + y.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How did B's trip to Africa change their life?", "B decided to study biology and help protect animals."),
            ComprehensionQuestion("What change did A make?", "A started a new job as a designer at a tech company.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a trip or experience that changed you.", "درباره سفری یا تجربه‌ای که تو را تغییر داد صحبت کن.", "It changed my life. / I decided to..."),
            SpeakingTask("Ask a partner about a past experience.", "از یک دوست درباره یک تجربه گذشته بپرس.", "Did you ever...? / What happened?")
        ),
        writing = listOf(
            WritingTask("Write about a past experience that changed your life.", "درباره تجربه‌ای در گذشته که زندگی‌ات را تغییر داد بنویس.", 90, "Use simple past regular verbs.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 12 — What did you do? | چه کار کردی؟  (≈ 50 خط)
    // ═══════════════════════════════════════════════════════════
    private fun file12() = base(
        12, "What did you do?", "چه کار کردی؟",
        listOf(
            "Use simple past: irregular verbs",
            "Talk about daily routines in the past",
            "Ask and answer about past activities",
            "Describe what you did"
        ),
        listOf(
            v("went", "رفت", "I went to the store.", "به فروشگاه رفتم.", "verb"),
            v("saw", "دید", "I saw a great movie.", "فیلم عالی‌ای دیدم.", "verb"),
            v("had", "داشت", "We had a good time.", "اوقات خوبی داشتیم.", "verb"),
            v("made", "درست کرد", "She made dinner.", "او شام درست کرد.", "verb"),
            v("took", "گرفت", "I took a taxi.", "تاکسی گرفتم.", "verb"),
            v("came", "آمد", "He came late.", "او دیر آمد.", "verb"),
            v("got", "گرفت", "I got a new phone.", "گوشی جدیدی گرفتم.", "verb"),
            v("said", "گفت", "She said hello.", "او سلام کرد.", "verb"),
            v("ate", "خورد", "We ate pizza.", "پیتزا خوردیم.", "verb"),
            v("drank", "نوشید", "I drank coffee.", "قهوه نوشیدم.", "verb")
        ),
        listOf(
            GrammarSection("Simple past: irregular verbs", "Many common verbs are irregular: go → went, see → saw, have → had, make → made, take → took, come → came, get → got, say → said, eat → ate, drink → drank."),
            GrammarSection("Simple past questions with irregular verbs", "Did you go? Did she see? Where did you eat?"),
            GrammarSection("Daily routine in the past", "Use the simple past to talk about what you did yesterday or last week.")
        ),
        listOf(
            d("A", "What did you do yesterday?", "دیروز چه کار کردی؟"),
            d("B", "I went to the beach with my family.", "با خانواده‌ام به ساحل رفتم."),
            d("A", "That sounds nice. What did you do there?", "خوب به نظر می‌رسد. آنجا چه کار کردید؟"),
            d("B", "We swam, played volleyball, and had a picnic.", "شنا کردیم، والیبال بازی کردیم، و پیک‌نیک داشتیم."),
            d("A", "Did you eat anything good?", "چیز خوبی خوردید؟"),
            d("B", "Yes, we ate sandwiches and fruit. And we drank lemonade.", "بله، ساندویچ و میوه خوردیم. و لیموناد نوشیدیم."),
            d("A", "That sounds perfect. What time did you get home?", "عالی به نظر می‌رسد. چه ساعتی به خانه رسیدید؟"),
            d("B", "We got home around 6 PM. We were tired but happy.", "حدود ۶ عصر رسیدیم. خسته ولی خوشحال بودیم."),
            d("A", "What about you? What did you do?", "تو چطور؟ چه کار کردی؟"),
            d("B", "I stayed home. I saw a movie and made dinner.", "خانه ماندم. فیلم دیدم و شام درست کردم."),
            d("A", "What did you make?", "چه درست کردی؟"),
            d("B", "I made pasta. It was delicious.", "پاستا درست کردم. خوشمزه بود."),
            d("A", "Nice. Did you go out at all?", "عالی. اصلاً بیرون رفتی؟"),
            d("B", "No, I didn't. I just relaxed.", "نه. فقط استراحت کردم."),
            d("A", "Sometimes that's the best.", "گاهی همین بهترین است."),
            d("B", "I agree. What about you? Did you do anything fun?", "موافقم. تو چطور؟ کار سرگرم‌کننده‌ای کردی؟"),
            d("A", "I went to a concert with friends.", "با دوستان به کنسرت رفتم."),
            d("B", "That sounds great. Who did you see?", "عالی به نظر می‌رسد. کی را دیدی؟"),
            d("A", "A local band. They were really good.", "یک گروه محلی. واقعاً خوب بودند."),
            d("B", "Sounds like a great weekend.", "آخر هفته عالی‌ای به نظر می‌رسد."),
            d("A", "It was. Well, I should go. See you later.", "همینطور بود. خب، باید بروم. بعداً می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where did B go yesterday?", listOf("to the mountains", "to the beach", "to a concert", "to a restaurant"), 1),
            q("What did B eat at the beach?", listOf("pizza", "sandwiches and fruit", "pasta", "burgers"), 1),
            q("What did A make for dinner?", listOf("pizza", "soup", "pasta", "salad"), 2),
            q("Where did A go with friends?", listOf("to a movie", "to a concert", "to a restaurant", "to the beach"), 1),
            q("What ___ you do yesterday?", listOf("do", "did", "does", "are"), 1),
            q("I ___ to the beach.", listOf("go", "went", "going", "goes"), 1),
            q("We ___ sandwiches.", listOf("eat", "ate", "eating", "eats"), 1),
            q("She ___ dinner.", listOf("make", "made", "making", "makes"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Have a picnic", "پیک‌نیک داشتن", "We had a picnic.", "پیک‌نیک داشتیم."),
            IdiomExpression("Get home", "به خانه رسیدن", "What time did you get home?", "چه ساعتی به خانه رسیدی؟"),
            IdiomExpression("Go out", "بیرون رفتن", "Did you go out?", "بیرون رفتی؟")
        ),
        pronunciation = listOf(
            PronunciationTip("Irregular past verbs", "Practice: went /went/, saw /sɔː/, ate /eɪt/, drank /dræŋk/."),
            PronunciationTip("Did reduction", "In questions, 'did you' is often reduced: Did you → /dɪdʒə/.")
        ),
        culture = listOf(
            CulturalNote("Weekend activities", "In many English-speaking countries, weekends are for relaxation, family, and hobbies. Asking 'What did you do?' is a common Monday morning question."),
            CulturalNote("Picnics", "Picnics are a popular summer activity in many countries. Families and friends gather in parks or beaches to eat outdoors.")
        ),
        mistakes = listOf(
            CommonMistake("What you did yesterday?", "What did you do yesterday?", "Use 'did' in questions about the past."),
            CommonMistake("I go to the beach yesterday.", "I went to the beach yesterday.", "Use the past form 'went' for past actions."),
            CommonMistake("Did you ate?", "Did you eat?", "After 'did', use the base verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did B do at the beach?", "Swam, played volleyball, and had a picnic."),
            ComprehensionQuestion("What did A do yesterday?", "A stayed home, saw a movie, made dinner, and went to a concert with friends.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about what you did last weekend.", "درباره آخر هفته گذشته‌ات صحبت کن.", "I went... / I saw... / I had..."),
            SpeakingTask("Ask a partner about their weekend.", "از یک دوست درباره آخر هفته‌اش بپرس.", "What did you do? / Did you...?")
        ),
        writing = listOf(
            WritingTask("Write about your last weekend.", "درباره آخر هفته گذشته‌ات بنویس.", 90, "Use simple past irregular verbs.")
        )
    )
}