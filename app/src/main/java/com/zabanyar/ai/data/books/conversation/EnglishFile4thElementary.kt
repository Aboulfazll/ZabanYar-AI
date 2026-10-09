package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * English File 4th Edition — Elementary (Book 1)
 * 12 Files (A/B/C) + 6 Practical English + 6 Revise & Check = 48 lessons
 * British English | A1-A2
 */
object EnglishFile4thElementary {
    const val BOOK_ID = "english_file_4th_elementary"

    fun getContent(n: Int): LessonContent = when (n) {
        // File 1
        1 -> f1A(); 2 -> f1B(); 3 -> f1C()
        // File 2
        4 -> f2A(); 5 -> f2B(); 6 -> f2C()
        7 -> pe1(); 8 -> rc12()
        // File 3
        9 -> f3A(); 10 -> f3B(); 11 -> f3C()
        // File 4
        12 -> f4A(); 13 -> f4B(); 14 -> f4C()
        15 -> pe2(); 16 -> rc34()
        // File 5
        17 -> f5A(); 18 -> f5B(); 19 -> f5C()
        // File 6
        20 -> f6A(); 21 -> f6B(); 22 -> f6C()
        23 -> pe3(); 24 -> rc56()
        // File 7
        25 -> f7A(); 26 -> f7B(); 27 -> f7C()
        // File 8
        28 -> f8A(); 29 -> f8B(); 30 -> f8C()
        31 -> pe4(); 32 -> rc78()
        // File 9
        33 -> f9A(); 34 -> f9B(); 35 -> f9C()
        // File 10
        36 -> f10A(); 37 -> f10B(); 38 -> f10C()
        39 -> pe5(); 40 -> rc910()
        // File 11
        41 -> f11A(); 42 -> f11B(); 43 -> f11C()
        // File 12
        44 -> f12A(); 45 -> f12B(); 46 -> f12C()
        47 -> pe6(); 48 -> rc1112()
        else -> empty(n)
    }

    private fun empty(n: Int) = LessonContent(
        BOOK_ID, n, "Coming Soon", "به‌زودی...",
        vocabulary = emptyList(), grammar = emptyList(),
        conversation = emptyList(), quiz = emptyList()
    )

    private fun base(
        n: Int, title: String, fa: String,
        obj: List<String>, vocab: List<VocabWord>,
        gr: List<GrammarSection>, dlg: List<DialogueLine>,
        qz: List<QuizQuestion>,
        idioms: List<IdiomExpression> = emptyList(),
        pron: List<PronunciationTip> = emptyList(),
        cult: List<CulturalNote> = emptyList(),
        mis: List<CommonMistake> = emptyList()
    ) = LessonContent(
        bookId = BOOK_ID, chapterNumber = n, title = title, titlePersian = fa,
        objectives = obj, vocabulary = vocab, idioms = idioms,
        pronunciationTips = pron, culturalNotes = cult,
        grammar = gr, commonMistakes = mis,
        conversation = dlg, quiz = qz
    )

    private fun v(e: String, p: String, ex: String, ep: String, pos: String = "noun") =
        VocabWord(e, p, partOfSpeech = pos, example = ex, examplePersian = ep)
    private fun d(s: String, e: String, p: String) = DialogueLine(s, e, p)
    private fun q(x: String, o: List<String>, c: Int) = QuizQuestion(x, o, c)

    // ═══════════════════ FILE 1 ═══════════════════

    private fun f1A() = base(
        1, "1A — Welcome to the class", "۱A — به کلاس خوش آمدید",
        listOf("Greet people", "Use verb be (singular)", "Say numbers 0-10"),
        listOf(
            v("hello", "سلام", "Hello, I'm David.", "سلام، من دیویدم.", "interjection"),
            v("name", "نام", "What's your name?", "نامت چیست؟"),
            v("teacher", "معلم", "She's the teacher.", "او معلم است."),
            v("student", "دانش‌آموز", "I'm a student.", "من دانش‌آموزم."),
            v("class", "کلاس", "Welcome to the class.", "به کلاس خوش آمدید."),
            v("friend", "دوست", "He's my friend.", "او دوست من است.")
        ),
        listOf(
            GrammarSection("Verb be (singular)", "I am, you are, he/she/it is. Contractions: I'm, you're, he's, she's, it's."),
            GrammarSection("Subject pronouns", "I, you, he, she, it.")
        ),
        listOf(
            d("T", "Hello. I'm Carla. I'm your teacher.", "سلام. من کارلا هستم. معلم شما هستم."),
            d("D", "Hi, Carla. I'm David.", "سلام کارلا. من دیویدم."),
            d("T", "Nice to meet you, David. Are you a student?", "خوشحالم دیوید. دانش‌آموزی؟"),
            d("D", "Yes, I am. I'm from Italy.", "بله. اهل ایتالیام."),
            d("T", "Welcome! Is that your friend?", "خوش آمدی! آن دوستت است؟"),
            d("D", "Yes, she's Maria. She's from Spain.", "بله، ماریاست. اهل اسپانیاست."),
            d("M", "Hello. Nice to meet you.", "سلام. از آشنایی خوشحالم."),
            d("T", "Welcome to the class!", "به کلاس خوش آمدید!")
        ),
        listOf(
            q("Where is David from?", listOf("Spain", "Italy", "France"), 1),
            q("Who is the teacher?", listOf("David", "Maria", "Carla"), 2),
            q("___ you a student?", listOf("Am", "Is", "Are"), 2),
            q("___ is my friend. (Maria)", listOf("He", "She", "It"), 1)
        ),
        idioms = listOf(IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you!", "از آشنایی خوشحالم!")),
        pron = listOf(PronunciationTip("Contractions", "I'm /aɪm/, you're /jʊər/, he's /hiːz/.")),
        cult = listOf(CulturalNote("First names", "English speakers often use first names immediately.")),
        mis = listOf(CommonMistake("I is David.", "I am David.", "Use 'am' with 'I'."))
    )

    private fun f1B() = base(
        2, "1B — One world", "۱B — یک جهان",
        listOf("Talk about countries", "Use verb be (plural)", "Talk about nationalities"),
        listOf(
            v("country", "کشور", "Which country are you from?", "اهل کدام کشوری؟"),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیست؟"),
            v("British", "بریتانیایی", "They're British.", "آن‌ها بریتانیایی هستند.", "adjective"),
            v("American", "آمریکایی", "He's American.", "او آمریکایی است.", "adjective"),
            v("world", "جهان", "It's a small world.", "جهان کوچکی است."),
            v("city", "شهر", "London is big.", "لندن بزرگ است.")
        ),
        listOf(
            GrammarSection("Verb be (plural)", "We are, you are, they are. Contractions: we're, you're, they're."),
            GrammarSection("Questions with be", "Where are you from? Are they British?")
        ),
        listOf(
            d("Tom", "Are you from Britain?", "اهل بریتانیایی؟"),
            d("Lena", "No, we aren't. We're from Germany.", "نه. اهل آلمانیم."),
            d("Tom", "Are you on holiday?", "در تعطیلات هستید؟"),
            d("Lena", "Yes, we are. Two weeks.", "بله. دو هفته."),
            d("Tom", "Who's he?", "او کیست؟"),
            d("Lena", "My brother. He's a student in Berlin.", "برادرم. در برلین دانشجو است."),
            d("Tom", "Are you all from Germany?", "همگی اهل آلمانید؟"),
            d("Lena", "Yes, but our mother is Italian.", "بله، ولی مادرمان ایتالیایی است.")
        ),
        listOf(
            q("Where is Lena from?", listOf("Britain", "Germany", "Italy"), 1),
            q("Where is her brother a student?", listOf("Munich", "Berlin", "Rome"), 1),
            q("We ___ from Germany.", listOf("am", "is", "are"), 2),
            q("___ they British?", listOf("Am", "Is", "Are"), 2)
        ),
        idioms = listOf(IdiomExpression("On holiday", "در تعطیلات", "We're on holiday.", "در تعطیلاتیم.")),
        pron = listOf(PronunciationTip("Nationalities", "GERmany → iTALian → chiNESE")),
        cult = listOf(CulturalNote("Capital letters", "Nationalities start with capital letters.")),
        mis = listOf(CommonMistake("We is from Germany.", "We are from Germany.", "Use 'are' with we."))
    )

    private fun f1C() = base(
        3, "1C — What's your email?", "۱C — ایمیلت چیه؟",
        listOf("Give personal info", "Use possessive adjectives", "Spell names"),
        listOf(
            v("email", "ایمیل", "What's your email?", "ایمیلت چیه؟"),
            v("phone number", "شماره تلفن", "My phone number is...", "شماره تلفنم..."),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟"),
            v("surname", "نام خانوادگی", "My surname is Smith.", "فامیلیم اسمیت است."),
            v("spell", "هجی کردن", "How do you spell it?", "چطور هجی می‌کنی؟", "verb"),
            v("number", "شماره", "What's your number?", "شمارت چیه؟")
        ),
        listOf(
            GrammarSection("Possessive adjectives", "my, your, his, her. My name... His phone..."),
            GrammarSection("Wh- questions", "What's your name? Where's your address? Who's your teacher?")
        ),
        listOf(
            d("A", "What's your surname?", "فامیلیت چیه؟"),
            d("B", "Kowalski. K-O-W-A-L-S-K-I.", "کوالسکی. ک-و-ا-ل-س-ک-ی."),
            d("A", "And your first name?", "و اسم کوچکت؟"),
            d("B", "Maria. M-A-R-I-A.", "ماریا. م-ا-ر-ی-ا."),
            d("A", "What's your email?", "ایمیلت چیه؟"),
            d("B", "maria.kowalski@gmail.com.", "ماریا.کوالسکی@gmail.com."),
            d("A", "Can you repeat that?", "تکرار می‌کنی؟"),
            d("B", "M-A-R-I-A dot K-O-W-A-L-S-K-I at gmail dot com.", "م-ا-ر-ی-ا نقطه ک-و-ا-ل-س-ک-ی ات gmail نقطه com.")
        ),
        listOf(
            q("What's B's surname?", listOf("Maria", "Kowalski", "Smith"), 1),
            q("What's B's email domain?", listOf("yahoo", "gmail", "hotmail"), 1),
            q("This is Tom. ___ phone is new.", listOf("Her", "His", "My"), 1),
            q("___ is your email?", listOf("What", "Who", "Where"), 0)
        ),
        idioms = listOf(IdiomExpression("Got it", "فهمیدم", "Got it, thanks.", "فهمیدم، ممنون.")),
        pron = listOf(PronunciationTip("Spelling", "A /eɪ/, E /iː/, I /aɪ/, O /oʊ/, U /juː/")),
        cult = listOf(CulturalNote("Email", "'@' is 'at', '.' is 'dot'.")),
        mis = listOf(CommonMistake("How you spell?", "How do you spell?", "Use 'do'."))
    )

    // ═══════════════════ FILE 2 ═══════════════════

    private fun f2A() = base(
        4, "2A — Are you tidy or untidy?", "۲A — مرتبی یا نامرتب؟",
        listOf("Talk about objects", "Use a/an", "Use this/that/these/those"),
        listOf(
            v("tidy", "مرتب", "My desk is tidy.", "میزم مرتب است.", "adjective"),
            v("untidy", "نامرتب", "His room is untidy.", "اتاقش نامرتب است.", "adjective"),
            v("desk", "میز", "Books on the desk.", "کتاب‌ها روی میز."),
            v("charger", "شارژر", "I need my charger.", "شارژرم را لازم دارم."),
            v("umbrella", "چتر", "Take an umbrella.", "چتر بردار."),
            v("keys", "کلیدها", "Where are my keys?", "کلیدهام کجاست؟")
        ),
        listOf(
            GrammarSection("a / an", "a before consonants: a book. an before vowels: an umbrella."),
            GrammarSection("this/that/these/those", "this (near, sing.), that (far, sing.), these (near, pl.), those (far, pl.)."),
            GrammarSection("in / on / under", "in the bag, on the desk, under the chair.")
        ),
        listOf(
            d("A", "Are you tidy or untidy?", "مرتبی یا نامرتب؟"),
            d("B", "Very untidy! My desk is a mess.", "خیلی نامرتب! میزم به هم ریخته."),
            d("A", "What's on your desk?", "چی روی میزته؟"),
            d("B", "Books, papers, an old coffee cup.", "کتاب، کاغذ، یک فنجان قهوه قدیمی."),
            d("A", "Where are your keys?", "کلیدهایت کجاست؟"),
            d("B", "Not in my bag!", "در کیسم نیست!"),
            d("A", "Under the papers?", "زیر کاغذها؟"),
            d("B", "Yes! Here they are.", "بله! ایناهاشون.")
        ),
        listOf(
            q("Where are B's keys?", listOf("in the bag", "under the papers", "on the desk"), 1),
            q("What's on B's desk?", listOf("books and papers", "a laptop", "shoes"), 0),
            q("There is ___ umbrella.", listOf("a", "an", "the"), 1),
            q("___ books are mine.", listOf("This", "These", "That"), 1)
        ),
        idioms = listOf(IdiomExpression("A mess", "به هم ریخته", "My desk is a mess.", "میزم به هم ریخته.")),
        pron = listOf(PronunciationTip("Plural -s", "/s/ books, /z/ keys, /ɪz/ watches")),
        cult = listOf(CulturalNote("Tidiness", "Attitudes to tidiness vary.")),
        mis = listOf(CommonMistake("a umbrella", "an umbrella", "Use 'an' before vowels."))
    )

    private fun f2B() = base(
        5, "2B — Made in America", "۲B — ساخت آمریکا",
        listOf("Use adjectives", "Talk about colours", "Use modifiers"),
        listOf(
            v("colour", "رنگ", "What colour?", "چه رنگی؟"),
            v("red", "قرمز", "The flag is red.", "پرچم قرمز است.", "adjective"),
            v("blue", "آبی", "A blue jacket.", "یک کاپشن آبی.", "adjective"),
            v("big", "بزرگ", "Canada is big.", "کانادا بزرگ است.", "adjective"),
            v("small", "کوچک", "A small world.", "جهان کوچک.", "adjective"),
            v("beautiful", "زیبا", "A beautiful city.", "شهر زیبا.", "adjective")
        ),
        listOf(
            GrammarSection("Adjectives", "Before nouns: a big country. After be: Canada is big."),
            GrammarSection("Modifiers", "very, really, quite. It's very big.")
        ),
        listOf(
            d("A", "What colour is the American flag?", "پرچم آمریکا چه رنگیه؟"),
            d("B", "Red, white, blue. Fifty stars.", "قرمز، سفید، آبی. پنجاه ستاره."),
            d("A", "Many American products here?", "محصولات آمریکایی زیاد اینجاست؟"),
            d("B", "A lot. iPhones, Coca-Cola, McDonald's.", "زیاد. آیفون، کوکاکولا، مک‌دونالد."),
            d("A", "Favourite American brand?", "برند آمریکایی مورد علاقه؟"),
            d("B", "Apple. Their products are beautiful.", "اپل. محصولاتشان زیباست."),
            d("A", "But quite expensive.", "ولی کاملاً گران."),
            d("B", "Very expensive! But good quality.", "خیلی گران! ولی کیفیت خوب.")
        ),
        listOf(
            q("Colours of American flag?", listOf("red, white, blue", "red, yellow, green", "blue, black"), 0),
            q("Which brand does B like?", listOf("Nike", "Apple", "Levi's"), 1),
            q("Canada is a ___ country.", listOf("big", "bigger", "biggest"), 0),
            q("It's ___ beautiful city.", listOf("very", "much", "many"), 0)
        ),
        idioms = listOf(IdiomExpression("Me too", "من هم", "Me too!", "من هم!")),
        pron = listOf(PronunciationTip("Adjective stress", "a BIG country, a BEAUtiful city")),
        cult = listOf(CulturalNote("Global brands", "Many American brands make products worldwide.")),
        mis = listOf(CommonMistake("a country big", "a big country", "Adjective before noun."))
    )

    private fun f2C() = base(
        6, "2C — Slow down!", "۲C — آهسته‌تر!",
        listOf("Use imperatives", "Use let's", "Talk about feelings"),
        listOf(
            v("slow down", "آهسته‌تر", "Slow down!", "آهسته‌تر!", "verb"),
            v("hungry", "گرسنه", "I'm hungry.", "گرسنه‌ام.", "adjective"),
            v("thirsty", "تشنه", "She's thirsty.", "تشنه است.", "adjective"),
            v("hot", "گرم", "It's hot.", "گرم است.", "adjective"),
            v("cold", "سرد", "I'm cold.", "سردم است.", "adjective"),
            v("tired", "خسته", "We're tired.", "خسته‌ایم.", "adjective")
        ),
        listOf(
            GrammarSection("Imperatives", "Open the door. Don't close it. Turn off the TV."),
            GrammarSection("Let's", "Let's eat. Let's go home.")
        ),
        listOf(
            d("A", "Lisa, slow down! You're driving too fast.", "لیزا، آهسته! تند می‌رانی."),
            d("B", "Sorry! I'm tired.", "ببخشید! خسته‌ام."),
            d("A", "Are you hungry?", "گرسنه‌ای؟"),
            d("B", "Yes, very. And thirsty too.", "بله، خیلی. و تشنه."),
            d("A", "Let's stop at the next cafe.", "بیا در کافه بعدی توقف کنیم."),
            d("B", "Good idea. I need a coffee.", "فکر خوبی. قهوه لازم دارم."),
            d("A", "Are you cold?", "سردت است؟"),
            d("B", "No, hot. Open the window, please.", "نه، گرمم. پنجره را باز کن.")
        ),
        listOf(
            q("Why is B driving fast?", listOf("happy", "tired", "excited"), 1),
            q("What does A suggest?", listOf("stop at a cafe", "go home", "drive faster"), 0),
            q("___ the window. It's hot.", listOf("Open", "Close", "Don't"), 0),
            q("I'm ___. Let's eat.", listOf("thirsty", "hungry", "tired"), 1)
        ),
        idioms = listOf(IdiomExpression("Good idea", "فکر خوبی", "Good idea!", "فکر خوبی!")),
        pron = listOf(PronunciationTip("Imperatives", "Falling intonation: OPEN the door.")),
        cult = listOf(CulturalNote("Safe driving", "Drive slowly near homes.")),
        mis = listOf(CommonMistake("Don't to open", "Don't open", "Use base verb."))
    )

    // ═══════════════════ PRACTICAL ENGLISH 1 ═══════════════════

    private fun pe1() = base(
        7, "PE1 — Checking in", "انگلیسی کاربردی ۱ — پذیرش هتل",
        listOf("Check into a hotel", "Spell your name", "Polite requests"),
        listOf(
            v("reception", "پذیرش", "Go to reception.", "به پذیرش برو."),
            v("check in", "پذیرش شدن", "I'd like to check in.", "می‌خواهم پذیرش شوم.", "verb"),
            v("reservation", "رزرو", "I have a reservation.", "رزرو دارم."),
            v("key card", "کارت کلید", "Here's your key card.", "این کارت کلید."),
            v("lift", "آسانسور", "The lift is on the left.", "آسانسور سمت چپ."),
            v("passport", "پاسپورت", "Your passport, please.", "پاسپورت لطفاً.")
        ),
        listOf(
            GrammarSection("Polite requests", "I'd like... Can I...? Could you...?"),
            GrammarSection("Checking in", "I have a reservation. My name is...")
        ),
        listOf(
            d("R", "Good evening. Can I help you?", "عصر بخیر. کمکی کنم؟"),
            d("G", "Yes, I have a reservation. Kowalski.", "بله، رزرو دارم. کوالسکی."),
            d("R", "How do you spell that?", "چطور هجی می‌کنید؟"),
            d("G", "K-O-W-A-L-S-K-I.", "ک-و-ا-ل-س-ک-ی."),
            d("R", "Can I see your passport?", "پاسپورتتان؟"),
            d("G", "Here you are.", "بفرمایید."),
            d("R", "You're in room 305. Is breakfast included?", "اتاق ۳۰۵. صبحانه شامل؟"),
            d("G", "Yes, 7 to 10 in the restaurant.", "بله، ۷ تا ۱۰ در رستوران."),
            d("R", "Where's the lift?", "آسانسور کجاست؟"),
            d("G", "On the left. Enjoy your stay!", "سمت چپ. اقامت خوبی داشته باشید!")
        ),
        listOf(
            q("What room is the guest in?", listOf("305", "350", "503"), 0),
            q("What time is breakfast?", listOf("6-9", "7-10", "8-11"), 1),
            q("___ I see your passport?", listOf("Can", "Do", "Am"), 0),
            q("I ___ like to check in.", listOf("would", "will", "am"), 0)
        ),
        idioms = listOf(IdiomExpression("Here you are", "بفرمایید", "Here you are.", "بفرمایید.")),
        pron = listOf(PronunciationTip("Polite rise", "Can I see your PASSPORT? ↗")),
        cult = listOf(CulturalNote("Hotel ID", "Need passport or ID to check in.")),
        mis = listOf(CommonMistake("I have reservation.", "I have a reservation.", "Add 'a'."))
    )

    // ═══════════════════ REVISE & CHECK 1&2 ═══════════════════

    private fun rc12() = base(
        8, "R&C 1 & 2", "مرور ۱ و ۲",
        listOf("Review verb be", "Review possessives", "Review a/an and this/that"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do the exercises.", "تمرین‌ها را انجام بده."),
            v("mistake", "اشتباه", "Learn from mistakes.", "از اشتباهات یاد بگیر."),
            v("practice", "تمرین", "Practice daily.", "هر روز تمرین کن.", "verb"),
            v("grammar", "گرامر", "Grammar is important.", "گرامر مهم است."),
            v("vocabulary", "واژگان", "Learn vocabulary.", "واژگان یاد بگیر.")
        ),
        listOf(
            GrammarSection("Verb be review", "I am, you are, he/she/it is, we/you/they are."),
            GrammarSection("Articles", "a book, an umbrella, the book."),
            GrammarSection("Possessives", "my, your, his, her, its, our, their.")
        ),
        listOf(
            d("T", "Review Files 1-2. What did we learn?", "مرور فایل‌های ۱-۲. چه یاد گرفتیم؟"),
            d("A", "Verb be! I am, you are, he is...", "فعل be! I am، you are، he is..."),
            d("B", "Possessive adjectives. My, your, his, her.", "صفت ملکی. My، your، his، her."),
            d("T", "What about a/an?", "a/an چطور؟"),
            d("A", "a before consonants, an before vowels.", "a قبل از صامت، an قبل از مصوت."),
            d("T", "Excellent! You remember.", "عالی! یادت هست."),
            d("B", "And this/that/these/those.", "و this/that/these/those."),
            d("T", "Great job!", "آفرین!")
        ),
        listOf(
            q("Which be with 'they'?", listOf("am", "is", "are"), 2),
            q("Which article before 'umbrella'?", listOf("a", "an", "the"), 1),
            q("___ is my book. (near)", listOf("This", "These", "Those"), 0),
            q("___ open the door!", listOf("Not", "Don't", "No"), 1)
        ),
        idioms = listOf(IdiomExpression("Let's review", "بیایید مرور کنیم", "Let's review.", "بیایید مرور کنیم.")),
        pron = listOf(PronunciationTip("Intonation", "Statements fall, questions rise.")),
        cult = listOf(CulturalNote("Review", "Regular review is essential.")),
        mis = listOf(CommonMistake("They is happy.", "They are happy.", "Use 'are' for plural."))
    )

    // ═══════════════════ FILE 3 ═══════════════════

    private fun f3A() = base(
        9, "3A — Britain: the good and the bad", "۳A — بریتانیا: خوب و بد",
        listOf("Present simple (+/-)", "Likes and dislikes", "Talk about countries"),
        listOf(
            v("weather", "هوا", "The weather is bad.", "هوا بد است."),
            v("food", "غذا", "British food isn't famous.", "غذای بریتانیایی معروف نیست."),
            v("people", "مردم", "The people are friendly.", "مردم خوش‌برخوردند."),
            v("city", "شهر", "A great city.", "شهر بزرگی."),
            v("countryside", "حومه", "Beautiful countryside.", "حومه زیبا."),
            v("tea", "چای", "They love tea.", "عاشق چای هستند.")
        ),
        listOf(
            GrammarSection("Present simple (+)","I like, he likes."),
            GrammarSection("Present simple (-)","I don't like, he doesn't like.")
        ),
        listOf(
            d("A", "What do you think of Britain?", "نظرت درباره بریتانیا؟"),
            d("B", "The people are very friendly.", "مردم خیلی خوش‌برخوردند."),
            d("A", "And the bad thing?", "و بدی‌اش؟"),
            d("B", "The weather! It rains all the time.", "هوا! همیشه باران."),
            d("A", "But the countryside is beautiful.", "ولی حومه زیباست."),
            d("B", "Yes, and I love British tea too.", "بله، و چای بریتانیایی را هم دوست دارم."),
            d("A", "Do you like British food?", "غذای بریتانیایی دوست داری؟"),
            d("B", "Not really. I don't like fish and chips.", "نه زیاد. ماهی و سیب‌زمینی دوست ندارم.")
        ),
        listOf(
            q("What does B like?", listOf("food", "people", "weather"), 1),
            q("What doesn't B like?", listOf("tea", "fish and chips", "countryside"), 1),
            q("I ___ fish and chips.", listOf("not like", "don't like", "doesn't like"), 1),
            q("She ___ British tea.", listOf("love", "loves", "loving"), 1)
        ),
        idioms = listOf(IdiomExpression("All the time", "همیشه", "It rains all the time.", "همیشه باران می‌آید.")),
        pron = listOf(PronunciationTip("Third-person -s", "likes /laɪks/, loves /lʌvz/")),
        cult = listOf(CulturalNote("Pubs", "Important part of British social life.")),
        mis = listOf(CommonMistake("I no like tea.", "I don't like tea.", "Use don't/doesn't."))
    )

    private fun f3B() = base(
        10, "3B — Love me, love my dog", "۳B — منو دوست داشته باش، سگمو هم",
        listOf("Present simple questions", "Question words", "Talk about pets"),
        listOf(
            v("dog", "سگ", "I have a dog.", "سگ دارم."),
            v("cat", "گربه", "Two cats.", "دو گربه."),
            v("pet", "حیوان خانگی", "Any pets?", "حیوان خانگی؟"),
            v("walk", "پیاده‌روی", "Walk the dog.", "سگ را پیاده‌روی ببر.", "verb"),
            v("feed", "غذا دادن", "Who feeds the cat?", "کی به گربه غذا می‌دهد؟", "verb"),
            v("sleep", "خوابیدن", "The cat sleeps.", "گربه می‌خوابد.", "verb")
        ),
        listOf(
            GrammarSection("Present simple questions", "Do you...? Does he...? Yes, I do. / No, I don't."),
            GrammarSection("Question words", "What, Where, When, Who, Why, How.")
        ),
        listOf(
            d("A", "Do you have any pets?", "حیوان خانگی داری؟"),
            d("B", "Yes, a dog. His name is Barry.", "بله، یک سگ. اسمش بری."),
            d("A", "What's he like?", "چه جوریه؟"),
            d("B", "Very friendly. Loves people.", "خیلی خوش‌برخورد. عاشق مردم."),
            d("A", "Do you walk him every day?", "هر روز پیاده‌روی می‌بری؟"),
            d("B", "Yes, twice a day.", "بله، دو بار در روز."),
            d("A", "Does he like other dogs?", "سگ‌های دیگر دوست دارد؟"),
            d("B", "Most. But not big dogs.", "بیشترشان. ولی سگ بزرگ نه.")
        ),
        listOf(
            q("What pet does B have?", listOf("cat", "dog", "bird"), 1),
            q("How often walk?", listOf("once", "twice", "three times"), 1),
            q("___ you like dogs?", listOf("Do", "Does", "Are"), 0),
            q("___ she have a cat?", listOf("Do", "Does", "Is"), 1)
        ),
        idioms = listOf(IdiomExpression("Twice a day", "دو بار در روز", "Twice a day.", "دو بار در روز.")),
        pron = listOf(PronunciationTip("Do/Does", "Weak: Do you /də jə/")),
        cult = listOf(CulturalNote("Pets", "50% of UK homes have a pet.")),
        mis = listOf(CommonMistake("Does she likes cats?", "Does she like cats?", "Use base verb."))
    )

    private fun f3C() = base(
        11, "3C — From morning to night", "۳C — از صبح تا شب",
        listOf("Daily routines", "Time expressions", "Adverbs of frequency"),
        listOf(
            v("wake up", "بیدار شدن", "I wake up at 7.", "ساعت ۷ بیدار می‌شوم.", "verb"),
            v("get up", "بلند شدن", "She gets up early.", "زود بلند می‌شود.", "verb"),
            v("have breakfast", "صبحانه خوردن", "Have breakfast at 8.", "ساعت ۸ صبحانه.", "verb"),
            v("go to work", "به سر کار رفتن", "Go to work at 9.", "ساعت ۹ به کار.", "verb"),
            v("come home", "به خانه آمدن", "Come home at 6.", "ساعت ۶ به خانه.", "verb"),
            v("go to bed", "خوابیدن", "Go to bed at 11.", "ساعت ۱۱ خواب.", "verb")
        ),
        listOf(
            GrammarSection("Present simple + time", "I get up at 7. She has lunch at 12.30."),
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, never — before main verb."),
            GrammarSection("Telling time", "at 7, at half past 8, at quarter to 9.")
        ),
        listOf(
            d("A", "What time do you get up?", "چه ساعتی بیدار می‌شوی؟"),
            d("B", "Usually at 7.", "معمولاً ساعت ۷."),
            d("A", "Breakfast?", "صبحانه؟"),
            d("B", "Always. Coffee and toast.", "همیشه. قهوه و نان تست."),
            d("A", "Go to work?", "به سر کار؟"),
            d("B", "Leave at 8.30. Start work at 9.", "ساعت ۸:۳۰ می‌روم. ساعت ۹ شروع."),
            d("A", "Finish?", "تمام؟"),
            d("B", "5.30. Then gym.", "۵:۳۰. بعد باشگاه.")
        ),
        listOf(
            q("What time get up?", listOf("6:00", "7:00", "8:00"), 1),
            q("After work?", listOf("home", "gym", "park"), 1),
            q("I ___ get up early.", listOf("usual", "usually", "usualy"), 1),
            q("Lunch ___ 12.30.", listOf("in", "on", "at"), 2)
        ),
        idioms = listOf(IdiomExpression("Half past", "نیم ساعت بعد", "Half past 8.", "ساعت ۸:۳۰.")),
        pron = listOf(PronunciationTip("Time", "7.15 = quarter past seven")),
        cult = listOf(CulturalNote("Routines", "Vary across cultures.")),
        mis = listOf(CommonMistake("at 7 in the morning AM", "at 7 in the morning", "No 'AM' with 'in the morning'."))
    )

    // ═══════════════════ FILE 4 ═══════════════════

    private fun f4A() = base(
        12, "4A — Blue Zones", "۴A — مناطق آبی",
        listOf("Present simple review", "Healthy lifestyle", "Frequency expressions"),
        listOf(
            v("healthy", "سالم", "Healthy lifestyle.", "سبک زندگی سالم.", "adjective"),
            v("exercise", "ورزش", "Exercise daily.", "هر روز ورزش."),
            v("diet", "رژیم", "Mediterranean diet.", "رژیم مدیترانه‌ای."),
            v("stress", "استرس", "Too much stress.", "استرس زیاد."),
            v("vegetables", "سبزیجات", "Lots of vegetables.", "سبزیجات زیاد."),
            v("fruit", "میوه", "Fruit is good.", "میوه خوب است.")
        ),
        listOf(
            GrammarSection("Present simple review", "I exercise. She doesn't smoke. Do you eat vegetables?"),
            GrammarSection("Frequency", "every day, once a week, twice a month.")
        ),
        listOf(
            d("A", "What are Blue Zones?", "مناطق آبی چیست؟"),
            d("B", "Places where people live long lives.", "مکان‌هایی که مردم عمر طولانی دارند."),
            d("A", "Where?", "کجا؟"),
            d("B", "Japan, Italy, Greece, California.", "ژاپن، ایتالیا، یونان، کالیفرنیا."),
            d("A", "Secret?", "راز؟"),
            d("B", "Healthy lifestyle. Vegetables and fruit.", "سبک زندگی سالم. سبزیجات و میوه."),
            d("A", "How often meat?", "چند وقت یکبار گوشت؟"),
            d("B", "Once or twice a week.", "یک یا دو بار در هفته.")
        ),
        listOf(
            q("Where are Blue Zones?", listOf("Japan, Italy, Greece", "Japan, China, Korea", "Italy, France, Spain"), 0),
            q("How often meat?", listOf("every day", "once or twice a week", "never"), 1),
            q("How often ___ you exercise?", listOf("do", "does", "are"), 0),
            q("She ___ eat fast food.", listOf("don't", "doesn't", "isn't"), 1)
        ),
        idioms = listOf(IdiomExpression("Long life", "زندگی طولانی", "Long lives.", "زندگی طولانی.")),
        pron = listOf(PronunciationTip("Frequency", "EVery day, TWICE a week")),
        cult = listOf(CulturalNote("Blue Zones", "Regions with long-living populations.")),
        mis = listOf(CommonMistake("How often you exercise?", "How often do you exercise?", "Use 'do'."))
    )

    private fun f4B() = base(
        13, "4B — Vote for me!", "۴B — به من رأی بده!",
        listOf("Can/Can't", "Abilities", "Adverbs of manner"),
        listOf(
            v("vote", "رأی دادن", "Vote for me!", "به من رأی بده!", "verb"),
            v("leader", "رهبر", "A good leader.", "رهبر خوب."),
            v("promise", "قول دادن", "I promise.", "قول می‌دهم.", "verb"),
            v("change", "تغییر", "We need change.", "به تغییر نیاز داریم."),
            v("future", "آینده", "Think about future.", "به آینده فکر کن."),
            v("honest", "صادق", "He's honest.", "او صادق است.", "adjective")
        ),
        listOf(
            GrammarSection("Can / Can't", "Ability: I can swim. Permission: Can I go? You can't smoke."),
            GrammarSection("Adverbs of manner", "quickly, slowly, well, badly. She speaks well.")
        ),
        listOf(
            d("A", "Are you going to vote?", "رأی می‌دهی؟"),
            d("B", "Yes. But don't know who.", "بله. ولی نمی‌دانم به کی."),
            d("A", "What in a leader?", "چه چیزی در یک رهبر؟"),
            d("B", "Honest and smart. Can make change.", "صادق و باهوش. بتواند تغییر دهد."),
            d("A", "Can you trust politicians?", "به سیاستمداران اعتماد داری؟"),
            d("B", "Not always. But some are good.", "نه همیشه. ولی بعضی خوبند."),
            d("A", "Most important things?", "مهم‌ترین چیزها؟"),
            d("B", "Education, healthcare. Everyone can go to school.", "آموزش، بهداشت. همه به مدرسه بروند.")
        ),
        listOf(
            q("Leader qualities?", listOf("rich", "honest and smart", "famous"), 1),
            q("Most important?", listOf("education and healthcare", "sports", "music"), 0),
            q("She ___ speak 3 languages.", listOf("can", "cans", "can to"), 0),
            q("He speaks English ___.", listOf("good", "well", "nice"), 1)
        ),
        idioms = listOf(IdiomExpression("Good for you", "آفرین", "Good for you!", "آفرین!")),
        pron = listOf(PronunciationTip("Can/Can't", "can /kæn/ vs. can't /kɑːnt/")),
        cult = listOf(CulturalNote("Voting", "Right and responsibility.")),
        mis = listOf(CommonMistake("She cans swim.", "She can swim.", "No -s on modals."))
    )

    private fun f4C() = base(
        14, "4C — A quiet life?", "۴C — یک زندگی آرام؟",
        listOf("Present continuous", "Contrast with present simple", "Describe scenes"),
        listOf(
            v("quiet", "آرام", "A quiet life.", "زندگی آرام.", "adjective"),
            v("noisy", "پر سر و صدا", "Noisy city.", "شهر پر سر و صدا.", "adjective"),
            v("relax", "استراحت", "I'm relaxing.", "دارم استراحت می‌کنم.", "verb"),
            v("enjoy", "لذت بردن", "Enjoying sunshine.", "از آفتاب لذت می‌برم.", "verb"),
            v("read", "خواندن", "Reading a book.", "کتاب می‌خوانم.", "verb"),
            v("watch", "تماشا", "Watching TV.", "تلویزیون تماشا می‌کنم.", "verb")
        ),
        listOf(
            GrammarSection("Present continuous", "am/is/are + -ing. I'm reading. She's writing."),
            GrammarSection("vs. Present simple", "I'm reading now. I read every day."),
            GrammarSection("Questions", "What are you doing? Are they playing?")
        ),
        listOf(
            d("A", "What are you doing?", "چه کار می‌کنی؟"),
            d("B", "Relaxing. Reading a book.", "استراحت. کتاب می‌خوانم."),
            d("A", "Good?", "خوبه؟"),
            d("B", "About quiet countryside life.", "درباره زندگی آرام در حومه."),
            d("A", "Family doing?", "خانواده چه کار می‌کنند؟"),
            d("B", "Wife cooking. Children playing outside.", "همسرم آشپزی. بچه‌ها بیرون بازی."),
            d("A", "What are they playing?", "چه بازی می‌کنند؟"),
            d("B", "Football, I think.", "فوتبال، فکر می‌کنم.")
        ),
        listOf(
            q("What is B doing?", listOf("watching TV", "reading", "cooking"), 1),
            q("Children doing?", listOf("playing football", "reading", "sleeping"), 0),
            q("She ___ writing.", listOf("am", "is", "are"), 1),
            q("They ___ playing.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(IdiomExpression("Me neither", "من هم (منفی)", "Me neither.", "من هم.")),
        pron = listOf(PronunciationTip("Present continuous stress", "I'm READing")),
        cult = listOf(CulturalNote("Quiet evenings", "People value quiet time at home.")),
        mis = listOf(CommonMistake("What you are doing?", "What are you doing?", "Verb before subject."))
    )

    // ═══════════════════ PE 2 ═══════════════════

    private fun pe2() = base(
        15, "PE2 — At a restaurant", "انگلیسی کاربردی ۲ — در رستوران",
        listOf("Order food", "Ask for bill", "Polite requests"),
        listOf(
            v("menu", "منو", "See the menu?", "منو را ببینم؟"),
            v("order", "سفارش", "Ready to order?", "آماده سفارش؟", "verb"),
            v("starter", "پیش‌غذا", "Soup for starters.", "سوپ برای پیش‌غذا."),
            v("main course", "غذای اصلی", "Chicken for main.", "مرغ برای اصلی."),
            v("dessert", "دسر", "Would you like dessert?", "دسر میل دارید؟"),
            v("bill", "صورت‌حساب", "The bill, please.", "صورت‌حساب لطفاً.")
        ),
        listOf(
            GrammarSection("Ordering", "I'll have... I'd like... Can I have...?"),
            GrammarSection("Polite requests", "Could I have...? Would you like...?")
        ),
        listOf(
            d("W", "A table for two?", "میز برای دو نفر؟"),
            d("A", "Yes, please. Menu?", "بله. منو؟"),
            d("W", "Here you are. Something to drink?", "بفرمایید. نوشیدنی؟"),
            d("A", "Still water, please.", "آب بدون گاز لطفاً."),
            d("B", "Sparkling for me.", "برای من گازدار."),
            d("W", "Ready to order?", "آماده سفارش؟"),
            d("A", "Soup for starters, then chicken.", "سوپ برای پیش‌غذا، بعد مرغ."),
            d("B", "Vegetarian pasta, please.", "پاستای گیاهی لطفاً."),
            d("W", "Anything else?", "چیز دیگری؟"),
            d("A", "The bill, please.", "صورت‌حساب لطفاً.")
        ),
        listOf(
            q("B's main course?", listOf("chicken", "pasta", "salad"), 1),
            q("A's water?", listOf("still", "sparkling", "hot"), 0),
            q("I ___ have the soup.", listOf("will", "am", "do"), 0),
            q("Can we ___ the bill?", listOf("have", "has", "having"), 0)
        ),
        idioms = listOf(IdiomExpression("Anything else?", "چیز دیگری؟", "Anything else?", "چیز دیگری؟")),
        pron = listOf(PronunciationTip("Polite", "Could I have the MENU? ↗")),
        cult = listOf(CulturalNote("Tipping", "10-15% in UK.")),
        mis = listOf(CommonMistake("I want chicken.", "I'd like chicken.", "Polite: I'd like."))
    )

    private fun rc34() = base(
        16, "R&C 3 & 4", "مرور ۳ و ۴",
        listOf("Review present simple", "Review can/can't", "Review present continuous"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("practice", "تمرین", "Practice daily.", "هر روز تمرین.", "verb"),
            v("mistake", "اشتباه", "Correct mistakes.", "اشتباهات را درست کن."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present simple review", "I work. She doesn't work. Do you work?"),
            GrammarSection("Present continuous review", "I'm working. Are they playing?"),
            GrammarSection("Contrast", "I work every day. I'm working now.")
        ),
        listOf(
            d("T", "Review Files 3-4.", "مرور فایل‌های ۳-۴."),
            d("A", "Present simple for habits.", "حال ساده برای عادت."),
            d("B", "Present continuous for now.", "حال استمراری برای الان."),
            d("T", "Example?", "مثال؟"),
            d("A", "I usually get up at 7, but today at 9.", "معمولاً ۷ بیدار، امروز ۹."),
            d("T", "Adverbs of frequency?", "قیدهای تکرار؟"),
            d("B", "Always, usually, sometimes, never. Before main verb.", "always، usually، sometimes، never. قبل از فعل."),
            d("T", "Great!", "عالی!")
        ),
        listOf(
            q("Habits?", listOf("present continuous", "present simple", "past"), 1),
            q("Adverb position?", listOf("before main verb", "after main verb", "at end"), 0),
            q("She ___ swim well.", listOf("can", "cans", "can to"), 0),
            q("They ___ playing now.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(IdiomExpression("Let's review", "مرور کنیم", "Let's review.", "مرور کنیم.")),
        pron = listOf(PronunciationTip("Intonation", "Falling for statements.")),
        cult = listOf(CulturalNote("Review", "Essential for learning.")),
        mis = listOf(CommonMistake("She can swims.", "She can swim.", "Base verb after can."))
    )

    // ═══════════════════ FILE 5 ═══════════════════

    private fun f5A() = base(
        17, "5A — Past lives", "۵A — زندگی‌های گذشته",
        listOf("Past simple: was/were", "Talk about the past", "Time expressions"),
        listOf(
            v("born", "متولد", "I was born in 1990.", "متولد ۱۹۹۰.", "verb"),
            v("yesterday", "دیروز", "I was tired yesterday.", "دیروز خسته بودم."),
            v("last night", "دیشب", "Last night was fun.", "دیشب خوب بود."),
            v("famous", "معروف", "A famous writer.", "نویسنده معروف.", "adjective"),
            v("child", "کودک", "When I was a child.", "وقتی بچه بودم."),
            v("school", "مدرسه", "At school together.", "با هم در مدرسه.")
        ),
        listOf(
            GrammarSection("Past simple: was/were", "I/he/she/it was. You/we/they were. Negative: wasn't/weren't."),
            GrammarSection("Time expressions", "yesterday, last night, last week, in 1990.")
        ),
        listOf(
            d("A", "Where were you born?", "کجا متولد شدی؟"),
            d("B", "In a small city in Canada.", "در شهر کوچکی در کانادا."),
            d("A", "Were you a good student?", "شاگرد خوبی بودی؟"),
            d("B", "Yes. Very quiet.", "بله. خیلی ساکت."),
            d("A", "First job?", "اولین شغل؟"),
            d("B", "A waiter in a restaurant.", "پیشخدمت رستوران."),
            d("A", "Tired?", "خسته؟"),
            d("B", "Yes, but happy.", "بله، ولی خوشحال.")
        ),
        listOf(
            q("Where was B born?", listOf("America", "Canada", "England"), 1),
            q("First job?", listOf("teacher", "waiter", "doctor"), 1),
            q("I ___ tired yesterday.", listOf("am", "was", "were"), 1),
            q("They ___ at home.", listOf("was", "were", "am"), 1)
        ),
        idioms = listOf(IdiomExpression("Be born", "متولد شدن", "I was born in Canada.", "در کانادا متولد شدم.")),
        pron = listOf(PronunciationTip("Was/Were", "Weak: was /wəz/, were /wər/")),
        cult = listOf(CulturalNote("Past talk", "Common icebreaker.")),
        mis = listOf(CommonMistake("I were tired.", "I was tired.", "Use 'was' with I."))
    )

    private fun f5B() = base(
        18, "5B — Past simple: regular & irregular", "۵B — گذشته: باقاعده و بی‌قاعده",
        listOf("Past simple regular verbs", "Past simple irregular verbs", "Talk about events"),
        listOf(
            v("visited", "بازدید کرد", "Visited many museums.", "از موزه‌های زیادی بازدید کردم.", "verb"),
            v("worked", "کار کرد", "Worked in a hospital.", "در بیمارستان کار کردم.", "verb"),
            v("went", "رفت", "Went to the beach.", "به ساحل رفتم.", "verb"),
            v("saw", "دید", "Saw a great movie.", "فیلم عالی دیدم.", "verb"),
            v("bought", "خرید", "Bought a phone.", "موبایل خریدم.", "verb"),
            v("had", "داشت", "Had dinner at 8.", "ساعت ۸ شام خوردم.", "verb")
        ),
        listOf(
            GrammarSection("Regular verbs", "work → worked, visit → visited, stay → stayed."),
            GrammarSection("Irregular verbs", "go → went, see → saw, buy → bought, have → had."),
            GrammarSection("Past questions", "Did you...? Where did you go?")
        ),
        listOf(
            d("A", "How was your weekend?", "آخر هفته چطور بود؟"),
            d("B", "Great! Went to the mountains.", "عالی! به کوهستان رفتم."),
            d("A", "What did you do?", "چی کار کردی؟"),
            d("B", "Walked, took photos.", "پیاده‌روی، عکس گرفتم."),
            d("A", "Where did you stay?", "کجا ماندی؟"),
            d("B", "A small hotel. Very quiet.", "هتل کوچک. خیلی ساکت."),
            d("A", "Food?", "غذا؟"),
            d("B", "Traditional. Delicious.", "سنتی. خوشمزه.")
        ),
        listOf(
            q("Where did B go?", listOf("beach", "mountains", "city"), 1),
            q("Where stayed?", listOf("hotel", "grandmother's", "friend's"), 0),
            q("We ___ to the beach.", listOf("go", "went", "gone"), 1),
            q("She ___ a phone.", listOf("buy", "bought", "buying"), 1)
        ),
        idioms = listOf(IdiomExpression("Overnight", "شب ماندن", "Stayed overnight.", "شب ماندیم.")),
        pron = listOf(PronunciationTip("-ed endings", "/t/ walked, /d/ stayed, /ɪd/ visited")),
        cult = listOf(CulturalNote("Weekends", "Outdoor activities popular.")),
        mis = listOf(CommonMistake("I goed to beach.", "I went to beach.", "Go is irregular."))
    )

    private fun f5C() = base(
        19, "5C — A trip to India", "۵C — سفر به هند",
        listOf("Present perfect with ever/never", "Travel experiences", "Past simple vs present perfect"),
        listOf(
            v("trip", "سفر", "Trip to India.", "سفر به هند."),
            v("abroad", "خارج", "Been abroad?", "خارج بوده‌ای؟"),
            v("amazing", "شگفت‌انگیز", "Amazing experience.", "تجربه شگفت‌انگیز.", "adjective"),
            v("crowded", "شلوغ", "Crowded streets.", "خیابان‌های شلوغ.", "adjective"),
            v("culture", "فرهنگ", "Rich culture.", "فرهنگ غنی."),
            v("experience", "تجربه", "Amazing experience.", "تجربه شگفت‌انگیز.")
        ),
        listOf(
            GrammarSection("Present perfect with ever/never", "Have you ever been to...? I've never tried..."),
            GrammarSection("Present perfect vs past simple", "I've been to India. / I went there in 2020.")
        ),
        listOf(
            d("A", "Have you ever been to India?", "تا حالا هند بوده‌ای؟"),
            d("B", "Yes! Went last year. Amazing.", "بله! سال پیش رفتم. شگفت‌انگیز."),
            d("A", "How long were you there?", "چقدر آنجا بودی؟"),
            d("B", "Three weeks. Delhi, Agra, Mumbai.", "سه هفته. دهلی، آگرا، بمبئی."),
            d("A", "Saw the Taj Mahal?", "تاج‌محل را دیدی؟"),
            d("B", "Yes. One of the most beautiful places I've ever seen.", "بله. یکی از زیباترین مکان‌هایی که دیده‌ام."),
            d("A", "Try Indian food?", "غذای هندی امتحان کردی؟"),
            d("B", "Of course! Spicy but delicious.", "البته! تند ولی خوشمزه.")
        ),
        listOf(
            q("How long in India?", listOf("one week", "two weeks", "three weeks"), 2),
            q("Which cities?", listOf("Delhi, Agra, Mumbai", "Delhi, Kolkata, Mumbai", "Agra, Chennai, Mumbai"), 0),
            q("Have you ever ___ to Japan?", listOf("be", "been", "being"), 1),
            q("I ___ to India in 2020.", listOf("have been", "went", "go"), 1)
        ),
        idioms = listOf(IdiomExpression("Lucky you!", "خوش به حالت!", "Lucky you!", "خوش به حالت!")),
        pron = listOf(PronunciationTip("Present perfect contractions", "I've /aɪv/, you've /juːv/")),
        cult = listOf(CulturalNote("Taj Mahal", "UNESCO World Heritage Site.")),
        mis = listOf(CommonMistake("I have been to India last year.", "I went to India last year.", "Past simple with specific time."))
    )

    // ═══════════════════ FILE 6 ═══════════════════

    private fun f6A() = base(
        20, "6A — A house with a history", "۶A — خانه‌ای با تاریخچه",
        listOf("Past simple questions", "Describe past events", "Talk about houses"),
        listOf(
            v("house", "خانه", "An old house.", "خانه قدیمی."),
            v("history", "تاریخچه", "Has a history.", "تاریخچه دارد."),
            v("writer", "نویسنده", "A famous writer.", "نویسنده معروف."),
            v("lived", "زندگی کرد", "Lived there.", "آنجا زندگی کرد.", "verb"),
            v("built", "ساخت", "Built in 1800.", "در ۱۸۰۰ ساخته شد.", "verb"),
            v("old", "قدیمی", "200 years old.", "۲۰۰ ساله.", "adjective")
        ),
        listOf(
            GrammarSection("Past simple questions", "Did you...? Where did you go? What did you see?"),
            GrammarSection("Short answers", "Yes, I did. / No, I didn't.")
        ),
        listOf(
            d("A", "Did you travel last year?", "سال پیش سفر کردی؟"),
            d("B", "Yes, I did. Visited an old house in Italy.", "بله. از خانه قدیمی در ایتالیا بازدید کردم."),
            d("A", "Did you like it?", "دوستش داشتی؟"),
            d("B", "Loved it. 200 years old.", "عاشقش شدم. ۲۰۰ ساله."),
            d("A", "Who lived there?", "کی آنجا زندگی می‌کرد؟"),
            d("B", "A famous writer.", "نویسنده معروفی."),
            d("A", "Did you buy anything?", "چیزی خریدی؟"),
            d("B", "A book about the house.", "کتابی درباره خانه.")
        ),
        listOf(
            q("Where did B travel?", listOf("France", "Italy", "Spain"), 1),
            q("How old was the house?", listOf("50", "100", "200"), 2),
            q("___ you travel last year?", listOf("Did", "Do", "Are"), 0),
            q("She ___ a new job.", listOf("start", "started", "starting"), 1)
        ),
        idioms = listOf(IdiomExpression("Change my life", "زندگی‌ام را تغییر دادن", "Changed my life.", "زندگی‌ام را تغییر داد.")),
        pron = listOf(PronunciationTip("-ed", "/t/ worked, /d/ traveled, /ɪd/ visited")),
        cult = listOf(CulturalNote("Historic homes", "Many European houses are centuries old.")),
        mis = listOf(CommonMistake("Did you traveled?", "Did you travel?", "Base verb after did."))
    )

    private fun f6B() = base(
        21, "6B — #mydinnerlastnight", "۶B — #شام_دیشبم",
        listOf("Countable/uncountable", "Quantifiers", "Food and meals"),
        listOf(
            v("rice", "برنج", "Ate rice.", "برنج خوردم."),
            v("bread", "نان", "Bought bread.", "نان خریدم."),
            v("water", "آب", "Drank water.", "آب نوشیدم."),
            v("apple", "سیب", "Two apples.", "دو سیب."),
            v("some", "مقداری", "Some cheese.", "مقداری پنیر.", "adverb"),
            v("any", "هیچ", "Any milk?", "شیر داری؟", "adverb")
        ),
        listOf(
            GrammarSection("Countable vs uncountable", "Countable: apple, book. Uncountable: water, bread."),
            GrammarSection("Quantifiers", "some (+), any (?/-), much (uncountable), many (countable).")
        ),
        listOf(
            d("A", "Dinner last night?", "شام دیشب؟"),
            d("B", "Rice and chicken. Some salad.", "برنج و مرغ. کمی سالاد."),
            d("A", "Cook yourself?", "خودت پختی؟"),
            d("B", "No, restaurant. Many people there.", "نه، رستوران. افراد زیادی آنجا."),
            d("A", "Dessert?", "دسر؟"),
            d("B", "Some ice cream. And a lot of water.", "کمی بستنی. و آب زیاد."),
            d("A", "Bill?", "صورت‌حساب؟"),
            d("B", "40 dollars. Not cheap!", "۴۰ دلار. ارزان نبود!")
        ),
        listOf(
            q("Dinner?", listOf("pizza", "rice and chicken", "pasta"), 1),
            q("Bill?", listOf("$20", "$40", "$60"), 1),
            q("I have ___ cheese.", listOf("some", "any", "much"), 0),
            q("Do you have ___ milk?", listOf("some", "any", "much"), 1)
        ),
        idioms = listOf(IdiomExpression("Eat out", "بیرون غذا خوردن", "Don't eat out often.", "زیاد بیرون غذا نمی‌خورم.")),
        pron = listOf(PronunciationTip("Some/Any", "some /səm/ weak")),
        cult = listOf(CulturalNote("Eating out", "Common in many countries.")),
        mis = listOf(CommonMistake("How many water?", "How much water?", "Much with uncountable."))
    )

    private fun f6C() = base(
        22, "6C — The most dangerous place", "۶C — خطرناک‌ترین مکان",
        listOf("Superlatives", "Comparatives", "Present perfect with ever"),
        listOf(
            v("dangerous", "خطرناک", "Most dangerous.", "خطرناک‌ترین.", "adjective"),
            v("beautiful", "زیبا", "Most beautiful.", "زیباترین.", "adjective"),
            v("high", "بلند", "Highest mountain.", "بلندترین کوه.", "adjective"),
            v("deep", "عمیق", "Deepest ocean.", "عمیق‌ترین اقیانوس.", "adjective"),
            v("place", "مکان", "A place.", "مکان."),
            v("ever", "هرگز", "Best I've ever seen.", "بهترین چیزی که دیده‌ام.", "adverb")
        ),
        listOf(
            GrammarSection("Superlatives", "the + -est / the most + adj. the highest, the most beautiful."),
            GrammarSection("Present perfect with ever", "Have you ever been to...? I've never seen...")
        ),
        listOf(
            d("A", "Most dangerous place you've been to?", "خطرناک‌ترین جایی که بودی؟"),
            d("B", "Sahara Desert. Very hot!", "صحرای صحرا. خیلی گرم!"),
            d("A", "Most beautiful?", "زیباترین؟"),
            d("B", "Grand Canyon. Amazing. Have you been?", "گرند کنیون. شگفت‌انگیز. بوده‌ای؟"),
            d("A", "Never been. But seen photos.", "هرگز نبوده‌ام. ولی عکس دیده‌ام."),
            d("B", "You should go. One of the most beautiful places on Earth.", "باید بروی. یکی از زیباترین مکان‌های زمین."),
            d("A", "Maybe one day.", "شاید یک روز."),
            d("B", "You'll love it.", "عاشقش می‌شوی.")
        ),
        listOf(
            q("Where has B been?", listOf("desert", "mountains", "island"), 0),
            q("Most beautiful place B saw?", listOf("Sahara", "Grand Canyon", "Alps"), 1),
            q("___ mountain in the world.", listOf("high", "higher", "highest"), 2),
            q("Have you ever ___ to Japan?", listOf("be", "been", "being"), 1)
        ),
        idioms = listOf(IdiomExpression("One of the...", "یکی از...", "One of the most beautiful.", "یکی از زیباترین.")),
        pron = listOf(PronunciationTip("Superlatives", "the HIGHest, the MOST beautiful")),
        cult = listOf(CulturalNote("Grand Canyon", "Famous natural wonder.")),
        mis = listOf(CommonMistake("the most highest", "the highest", "No 'most' with -est."))
    )

    private fun pe3() = base(
        23, "PE3 — Shopping", "انگلیسی کاربردی ۳ — خرید",
        listOf("Shop for clothes", "Ask about prices", "Pay for items"),
        listOf(
            v("size", "سایز", "What size?", "چه سایزی؟"),
            v("try on", "پرو کردن", "Can I try it on?", "می‌توانم پرو کنم؟", "verb"),
            v("fit", "اندازه بودن", "Doesn't fit.", "اندازه نیست.", "verb"),
            v("price", "قیمت", "What's the price?", "قیمتش؟"),
            v("cash", "نقد", "Pay in cash.", "نقد پرداخت کن."),
            v("card", "کارت", "Pay by card.", "با کارت پرداخت کن.")
        ),
        listOf(
            GrammarSection("Shopping phrases", "Can I try it on? How much is it? I'll take it."),
            GrammarSection("Too/enough", "Too big. Not big enough.")
        ),
        listOf(
            d("SA", "Can I help you?", "کمکی کنم؟"),
            d("A", "Yes, looking for a jacket.", "بله، دنبال کاپشنم."),
            d("SA", "What size?", "چه سایزی؟"),
            d("A", "Medium. Can I try this on?", "متوسط. می‌توانم پرو کنم؟"),
            d("SA", "Of course.", "البته."),
            d("A", "Too small. Have a large?", "کوچک است. بزرگ دارید؟"),
            d("SA", "Here you are.", "بفرمایید."),
            d("A", "Fits. How much?", "اندازه است. چقدر؟"),
            d("SA", "$80.", "۸۰ دلار."),
            d("A", "A bit expensive. Anything cheaper?", "کمی گران. ارزان‌تر دارید؟"),
            d("SA", "Black one, $50.", "مشکی، ۵۰ دلار."),
            d("A", "I'll take it.", "همین را می‌خرم.")
        ),
        listOf(
            q("What size did A buy?", listOf("small", "medium", "large"), 2),
            q("Black jacket price?", listOf("$80", "$50", "$30"), 1),
            q("Can I ___ it on?", listOf("try", "fit", "take"), 0),
            q("I'll ___ it.", listOf("take", "get", "buy"), 0)
        ),
        idioms = listOf(IdiomExpression("I'll take it", "همین را می‌خرم", "I'll take it.", "همین را می‌خرم.")),
        pron = listOf(PronunciationTip("Polite", "Can I try it ON? ↗")),
        cult = listOf(CulturalNote("Sizes", "US 6 = UK 10 = EU 36")),
        mis = listOf(CommonMistake("I want to try.", "Can I try it on?", "Complete phrase."))
    )

    private fun rc56() = base(
        24, "R&C 5 & 6", "مرور ۵ و ۶",
        listOf("Review past simple", "Review quantifiers", "Review comparatives"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات را درست کن."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Past simple review", "was/were. Regular -ed. Irregular."),
            GrammarSection("Quantifiers", "some, any, much, many."),
            GrammarSection("Comparatives/superlatives", "bigger, the biggest, more beautiful.")
        ),
        listOf(
            d("T", "Review Files 5-6.", "مرور فایل‌های ۵-۶."),
            d("A", "Past simple for past events.", "حال گذشته برای رویدادهای گذشته."),
            d("B", "Some/any, much/many.", "some/any، much/many."),
            d("T", "Comparatives?", "مقایسه‌ای‌ها؟"),
            d("A", "bigger, the biggest, more expensive.", "bigger، the biggest، more expensive."),
            d("T", "Great job!", "آفرین!")
        ),
        listOf(
            q("Past of 'go'?", listOf("goed", "went", "gone"), 1),
            q("Countable?", listOf("water", "apple", "bread"), 1),
            q("Comparative of 'big'?", listOf("bigger", "more big", "biggest"), 0),
            q("Uncountable?", listOf("apple", "water", "book"), 1)
        ),
        idioms = listOf(IdiomExpression("Let's review", "مرور کنیم", "Let's review.", "مرور کنیم.")),
        pron = listOf(PronunciationTip("Past -ed", "/t/, /d/, /ɪd/")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("more cheaper", "cheaper", "No 'more' with -er."))
    )

    // ═══════════════════ FILE 7 ═══════════════════

    private fun f7A() = base(
        25, "7A — Firsts and lasts", "۷A — اولین‌ها و آخرین‌ها",
        listOf("Present perfect", "Life experiences", "Use ever/never"),
        listOf(
            v("first", "اولین", "First time.", "اولین بار."),
            v("last", "آخرین", "Last time.", "آخرین بار."),
            v("ever", "هرگز", "Ever been?", "هرگز بوده‌ای؟", "adverb"),
            v("never", "هرگز", "Never been.", "هرگز نبوده‌ام.", "adverb"),
            v("tried", "امتحان کرد", "Tried sushi.", "سوشی امتحان کردم.", "verb"),
            v("visited", "بازدید کرد", "Visited Paris.", "پاریس را دیدم.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect", "have/has + past participle. I've been. She's visited."),
            GrammarSection("Ever / Never", "Have you ever...? I've never...")
        ),
        listOf(
            d("A", "Have you ever tried sushi?", "تا حالا سوشی امتحان کردی؟"),
            d("B", "Yes, many times. Love it.", "بله، بارها. عاشقشم."),
            d("A", "Ever been to Japan?", "تا حالا ژاپن بوده‌ای؟"),
            d("B", "Never. But want to go.", "هرگز. ولی می‌خواهم بروم."),
            d("A", "First time you tried sushi?", "اولین بار سوشی؟"),
            d("B", "In London, 2018.", "در لندن، ۲۰۱۸."),
            d("A", "Ever tried making it yourself?", "خودت درست کردی؟"),
            d("B", "No, too difficult!", "نه، خیلی سخته!")
        ),
        listOf(
            q("Has B tried sushi?", listOf("no", "yes", "maybe"), 1),
            q("Has B been to Japan?", listOf("no", "yes", "once"), 0),
            q("I've ___ tried it.", listOf("ever", "never", "already"), 1),
            q("Have you ___ been to Paris?", listOf("ever", "never", "already"), 0)
        ),
        idioms = listOf(IdiomExpression("Have you ever...?", "تا حالا...؟", "Have you ever been?", "تا حالا بوده‌ای؟")),
        pron = listOf(PronunciationTip("Present perfect", "I've /aɪv/, she's /ʃiːz/")),
        cult = listOf(CulturalNote("Food", "Sushi is popular worldwide.")),
        mis = listOf(CommonMistake("I've saw it.", "I've seen it.", "Past participle."))
    )

    private fun f7B() = base(
        26, "7B — The name of the band", "۷B — اسم گروه",
        listOf("Present perfect with yet/already/just", "Music and entertainment", "Talk about recent events"),
        listOf(
            v("band", "گروه", "My favorite band.", "گروه مورد علاقه‌ام."),
            v("concert", "کنسرت", "A concert tonight.", "امشب کنسرت."),
            v("ticket", "بلیت", "Tickets sold out.", "بلیت‌ها تمام شد."),
            v("album", "آلبوم", "New album.", "آلبوم جدید."),
            v("song", "آهنگ", "Amazing song.", "آهنگ شگفت‌انگیز."),
            v("fan", "طرفدار", "Big fan.", "طرفدار پر و پا قرص.")
        ),
        listOf(
            GrammarSection("Yet / Already / Just", "I've already done it. I haven't seen it yet. I've just arrived."),
            GrammarSection("Present perfect vs past", "I've seen it. / I saw it yesterday.")
        ),
        listOf(
            d("A", "Seen the new Coldplay album?", "آلبوم جدید کلدپلی را دیدی؟"),
            d("B", "Yes, already. It's amazing.", "بله، قبلاً. شگفت‌انگیز."),
            d("A", "Have you heard the new song?", "آهنگ جدید را شنیدی؟"),
            d("B", "Not yet. Any good?", "هنوز نه. خوبه؟"),
            d("A", "Very good. Just listened to it.", "خیلی خوب. همین الان گوش دادم."),
            d("B", "Concert tickets?", "بلیت کنسرت؟"),
            d("A", "Sold out already!", "قبلاً تمام شد!"),
            d("B", "That's a pity.", "حیف شد.")
        ),
        listOf(
            q("Has B heard new song?", listOf("yes", "no", "maybe"), 1),
            q("Concert tickets?", listOf("available", "sold out", "cheap"), 1),
            q("I've ___ finished.", listOf("yet", "already", "ever"), 1),
            q("Haven't seen it ___.", listOf("yet", "already", "just"), 0)
        ),
        idioms = listOf(IdiomExpression("That's a pity", "حیف شد", "That's a pity.", "حیف شد.")),
        pron = listOf(PronunciationTip("Already/Yet", "Stress: alREADY, YET")),
        cult = listOf(CulturalNote("Concerts", "Popular entertainment.")),
        mis = listOf(CommonMistake("I've seen it yesterday.", "I saw it yesterday.", "Specific time = past simple."))
    )

    private fun f7C() = base(
        27, "7C — The story behind the photo", "۷C — داستان پشت عکس",
        listOf("Present perfect vs past simple", "Talk about photos", "Narrate events"),
        listOf(
            v("photo", "عکس", "A nice photo.", "عکس قشنگی."),
            v("story", "داستان", "The story behind.", "داستان پشت."),
            v("ago", "پیش", "Two years ago.", "دو سال پیش."),
            v("since", "از", "Since 2020.", "از ۲۰۲۰."),
            v("for", "به مدت", "For three years.", "سه سال."),
            v("met", "ملاقات کرد", "We met at work.", "در محل کار ملاقات کردیم.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect with for/since", "I've lived here for 3 years. I've known her since 2020."),
            GrammarSection("Present perfect vs past simple", "Life experience vs specific past event.")
        ),
        listOf(
            d("A", "Who's in this photo?", "در این عکس کیست؟"),
            d("B", "My best friend. Met him at work.", "بهترین دوستم. در محل کار ملاقاتش کردم."),
            d("A", "How long have you known him?", "چقدر است که می‌شناسی‌اش؟"),
            d("B", "For ten years.", "ده سال."),
            d("A", "Where was this taken?", "کجا گرفته شده؟"),
            d("B", "Paris, two years ago.", "پاریس، دو سال پیش."),
            d("A", "Nice! Have you been back?", "خوبه! برگشتی؟"),
            d("B", "No, not yet.", "نه، هنوز نه.")
        ),
        listOf(
            q("Who's in photo?", listOf("brother", "best friend", "teacher"), 1),
            q("How long known?", listOf("5 years", "10 years", "15 years"), 1),
            q("I've known her ___ 2020.", listOf("for", "since", "from"), 1),
            q("I've lived here ___ 3 years.", listOf("for", "since", "from"), 0)
        ),
        idioms = listOf(IdiomExpression("Not yet", "هنوز نه", "Not yet.", "هنوز نه.")),
        pron = listOf(PronunciationTip("For/Since", "Weak: for /fə/, since /sɪns/")),
        cult = listOf(CulturalNote("Photos", "Sharing photos is common.")),
        mis = listOf(CommonMistake("I've known her since 3 years.", "I've known her for 3 years.", "For + duration."))
    )

    // ═══════════════════ FILE 8 ═══════════════════

    private fun f8A() = base(
        28, "8A — Plans and dreams", "۸A — برنامه‌ها و رؤیاها",
        listOf("Going to for future", "Plans and intentions", "Talk about the future"),
        listOf(
            v("plan", "برنامه", "Plan for summer.", "برنامه تابستان."),
            v("going to", "قرار است", "Going to travel.", "قرار است سفر کنم.", "verb"),
            v("future", "آینده", "The future.", "آینده."),
            v("dream", "رؤیا", "A dream job.", "شغل رؤیایی."),
            v("holiday", "تعطیلات", "Summer holiday.", "تعطیلات تابستان."),
            v("university", "دانشگاه", "Going to university.", "به دانشگاه می‌روم.")
        ),
        listOf(
            GrammarSection("Going to", "am/is/are + going to + verb. I'm going to travel."),
            GrammarSection("Future time expressions", "tomorrow, next week, next year, this summer.")
        ),
        listOf(
            d("A", "Plans for summer?", "برنامه تابستان؟"),
            d("B", "Going to travel to Italy.", "قرار است به ایتالیا سفر کنم."),
            d("A", "Nice! Where exactly?", "خوبه! کجا؟"),
            d("B", "Rome and Florence.", "رم و فلورانس."),
            d("A", "How long?", "چقدر؟"),
            d("B", "Two weeks. Then back to work.", "دو هفته. بعد سر کار."),
            d("A", "Going to learn Italian?", "قراره ایتالیایی یاد بگیری؟"),
            d("B", "A little! Just phrases.", "کمی! فقط جمله‌ها.")
        ),
        listOf(
            q("Where is B going?", listOf("France", "Italy", "Spain"), 1),
            q("How long?", listOf("one week", "two weeks", "three weeks"), 1),
            q("I ___ going to travel.", listOf("am", "is", "are"), 0),
            q("She ___ going to study.", listOf("am", "is", "are"), 1)
        ),
        idioms = listOf(IdiomExpression("Back to work", "برگشتن به کار", "Then back to work.", "بعد برگشتن به کار.")),
        pron = listOf(PronunciationTip("Going to", "Often 'gonna' in fast speech")),
        cult = listOf(CulturalNote("Summer holidays", "Europeans often take long holidays.")),
        mis = listOf(CommonMistake("I going to travel.", "I'm going to travel.", "Don't forget 'am'."))
    )

    private fun f8B() = base(
        29, "8B — The future of travel", "۸B — آینده سفر",
        listOf("Will/won't for predictions", "Talk about future", "Compare will and going to"),
        listOf(
            v("will", "خواهد", "I will travel.", "سفر خواهم کرد.", "verb"),
            v("predict", "پیش‌بینی", "Predict the future.", "آینده را پیش‌بینی کن.", "verb"),
            v("probably", "احتمالاً", "Probably will.", "احتمالاً خواهد.", "adverb"),
            v("maybe", "شاید", "Maybe tomorrow.", "شاید فردا.", "adverb"),
            v("future", "آینده", "The future.", "آینده."),
            v("change", "تغییر", "Things will change.", "چیزها تغییر خواهند کرد.", "verb")
        ),
        listOf(
            GrammarSection("Will / Won't", "Predictions: It will rain. I won't go."),
            GrammarSection("Will vs going to", "Will = prediction. Going to = plan.")
        ),
        listOf(
            d("A", "How will travel change?", "سفر چطور تغییر خواهد کرد؟"),
            d("B", "Probably faster and cheaper.", "احتمالاً سریع‌تر و ارزان‌تر."),
            d("A", "Will we still use planes?", "هنوز از هواپیما استفاده خواهیم کرد؟"),
            d("B", "Maybe. But electric planes are coming.", "شاید. ولی هواپیماهای برقی می‌آیند."),
            d("A", "Will it be safe?", "امن خواهد بود؟"),
            d("B", "I think so. Technology will help.", "فکر می‌کنم. تکنولوژی کمک خواهد کرد."),
            d("A", "Where will you go next?", "دفعه بعد کجا خواهی رفت؟"),
            d("B", "I'm going to Japan next year.", "قرار است سال بعد به ژاپن بروم.")
        ),
        listOf(
            q("How will travel change?", listOf("slower", "faster/cheaper", "more expensive"), 1),
            q("Where is B going next year?", listOf("Italy", "Japan", "France"), 1),
            q("It ___ rain tomorrow.", listOf("will", "is", "does"), 0),
            q("I ___ go tomorrow.", listOf("won't", "don't", "not will"), 0)
        ),
        idioms = listOf(IdiomExpression("I think so", "فکر می‌کنم", "I think so.", "فکر می‌کنم.")),
        pron = listOf(PronunciationTip("Will", "Contraction: I'll /aɪl/, won't /woʊnt/")),
        cult = listOf(CulturalNote("Future tech", "Electric planes are in development.")),
        mis = listOf(CommonMistake("I will to go.", "I will go.", "No 'to' after will."))
    )

    private fun f8C() = base(
        30, "8C — A wedding in the family", "۸C — عروسی در خانواده",
        listOf("Present continuous for future", "Arrangements", "Family events"),
        listOf(
            v("wedding", "عروسی", "A wedding.", "عروسی."),
            v("marry", "ازدواج کردن", "Marrying in June.", "در ژوئن ازدواج می‌کند.", "verb"),
            v("guest", "مهمان", "Many guests.", "مهمان‌های زیاد."),
            v("ceremony", "مراسم", "At the ceremony.", "در مراسم."),
            v("party", "مهمانی", "A big party.", "مهمانی بزرگ."),
            v("dress", "لباس", "A white dress.", "لباس سفید.")
        ),
        listOf(
            GrammarSection("Present continuous for future", "I'm meeting Tom tomorrow. We're having a party on Saturday."),
            GrammarSection("Arrangements", "Fixed plans in the near future.")
        ),
        listOf(
            d("A", "What are you doing this weekend?", "این آخر هفته چه کار می‌کنی؟"),
            d("B", "My sister's wedding!", "عروسی خواهرم!"),
            d("A", "Congratulations! Where?", "تبریک! کجا؟"),
            d("B", "At a hotel in the countryside.", "در هتلی در حومه."),
            d("A", "How many guests?", "چند مهمان؟"),
            d("B", "About a hundred.", "حدود صد نفر."),
            d("A", "What are you wearing?", "چی می‌پوشی؟"),
            d("B", "A blue dress. My sister has a white one.", "لباس آبی. خواهرم سفید دارد.")
        ),
        listOf(
            q("Whose wedding?", listOf("brother", "sister", "cousin"), 1),
            q("How many guests?", listOf("50", "100", "200"), 1),
            q("I ___ meeting Tom tomorrow.", listOf("am", "is", "are"), 0),
            q("We ___ having a party.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(IdiomExpression("Congratulations!", "تبریک!", "Congratulations!", "تبریک!")),
        pron = listOf(PronunciationTip("Present continuous future", "We're HAVing a party.")),
        cult = listOf(CulturalNote("Weddings", "Vary widely across cultures.")),
        mis = listOf(CommonMistake("I meet Tom tomorrow.", "I'm meeting Tom tomorrow.", "Use present continuous for arrangements."))
    )

    private fun pe4() = base(
        31, "PE4 — At the doctor's", "انگلیسی کاربردی ۴ — پیش دکتر",
        listOf("Describe symptoms", "Make an appointment", "Give advice"),
        listOf(
            v("doctor", "دکتر", "See the doctor.", "دکتر را ببین."),
            v("appointment", "نوبت", "Make an appointment.", "نوبت بگیر."),
            v("headache", "سردرد", "A headache.", "سردرد."),
            v("stomachache", "دل‌درد", "Stomachache.", "دل‌درد."),
            v("fever", "تب", "A fever.", "تب."),
            v("medicine", "دارو", "Take medicine.", "دارو بخور.")
        ),
        listOf(
            GrammarSection("Symptoms", "I have a headache. I feel sick. It hurts."),
            GrammarSection("Advice", "You should rest. Take this medicine.")
        ),
        listOf(
            d("D", "What's the problem?", "مشکل چیست؟"),
            d("P", "I have a headache and a fever.", "سردرد و تب دارم."),
            d("D", "How long?", "چقدر؟"),
            d("P", "Since yesterday.", "از دیروز."),
            d("D", "Any other symptoms?", "علائم دیگر؟"),
            d("P", "A sore throat too.", "گلودرد هم."),
            d("D", "You should rest and drink water.", "باید استراحت کنی و آب بخوری."),
            d("P", "Do I need medicine?", "دارو لازم دارم؟"),
            d("D", "Yes. Take this twice a day.", "بله. این را دو بار در روز بخور."),
            d("P", "Thank you, doctor.", "ممنون دکتر.")
        ),
        listOf(
            q("What symptoms?", listOf("headache/fever", "stomachache", "back pain"), 0),
            q("How long sick?", listOf("today", "since yesterday", "one week"), 1),
            q("You ___ rest.", listOf("should", "should to", "are"), 0),
            q("I ___ a headache.", listOf("have", "has", "am"), 0)
        ),
        idioms = listOf(IdiomExpression("What's the problem?", "مشکل چیست؟", "What's the problem?", "مشکل چیست؟")),
        pron = listOf(PronunciationTip("Symptom stress", "HEADache, STOMachache")),
        cult = listOf(CulturalNote("Appointments", "Usually needed in UK/US.")),
        mis = listOf(CommonMistake("I have headache.", "I have a headache.", "Add 'a'."))
    )

    private fun rc78() = base(
        32, "R&C 7 & 8", "مرور ۷ و ۸",
        listOf("Review present perfect", "Review will/going to", "Review for/since"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present perfect", "have/has + pp. For/since."),
            GrammarSection("Future", "Will (prediction) / Going to (plan)."),
            GrammarSection("Present continuous future", "Arrangements.")
        ),
        listOf(
            d("T", "Review Files 7-8.", "مرور ۷-۸."),
            d("A", "Present perfect for experiences.", "حال کامل برای تجربه‌ها."),
            d("B", "Will and going to for future.", "will و going to برای آینده."),
            d("T", "Difference?", "تفاوت؟"),
            d("A", "Will = prediction. Going to = plan.", "will = پیش‌بینی. going to = برنامه."),
            d("T", "Present perfect with for/since?", "حال کامل با for/since؟"),
            d("B", "For three years. Since 2020.", "سه سال. از ۲۰۲۰."),
            d("T", "Perfect!", "عالی!")
        ),
        listOf(
            q("Life experience tense?", listOf("past simple", "present perfect", "future"), 1),
            q("Plan future?", listOf("will", "going to", "present simple"), 1),
            q("I've known her ___ 2020.", listOf("for", "since", "from"), 1),
            q("I've lived here ___ 5 years.", listOf("for", "since", "from"), 0)
        ),
        idioms = listOf(IdiomExpression("Let's review", "مرور کنیم", "Let's review.", "مرور کنیم.")),
        pron = listOf(PronunciationTip("Contractions", "I've, I'll, I'm")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I've seen yesterday.", "I saw yesterday.", "Past simple with specific time."))
    )

    // ═══════════════════ FILE 9 ═══════════════════

    private fun f9A() = base(
        33, "9A — A room with a view", "۹A — اتاقی با منظره",
        listOf("Describe places", "Prepositions of place", "There is/are"),
        listOf(
            v("view", "منظره", "A nice view.", "منظره قشنگ."),
            v("balcony", "بالکن", "A balcony.", "بالکن."),
            v("floor", "طبقه", "Third floor.", "طبقه سوم."),
            v("lift", "آسانسور", "Take the lift.", "آسانسور بگیر."),
            v("quiet", "آرام", "Quiet area.", "منطقه آرام.", "adjective"),
            v("near", "نزدیک", "Near the beach.", "نزدیک ساحل.", "preposition")
        ),
        listOf(
            GrammarSection("There is/are", "There's a view. There are two beds. Is there...? Are there...?"),
            GrammarSection("Prepositions", "in, on, under, next to, opposite, near.")
        ),
        listOf(
            d("A", "Where's your hotel?", "هتلت کجاست؟"),
            d("B", "Near the beach. Beautiful view.", "نزدیک ساحل. منظره زیبا."),
            d("A", "Which floor?", "کدام طبقه؟"),
            d("B", "Third floor. With a balcony.", "طبقه سوم. با بالکن."),
            d("A", "Is it quiet?", "آرام است؟"),
            d("B", "Yes. There are only a few rooms.", "بله. فقط چند اتاق."),
            d("A", "Is there a restaurant?", "رستوران هست؟"),
            d("B", "Yes, on the first floor.", "بله، طبقه اول.")
        ),
        listOf(
            q("Where's the hotel?", listOf("city center", "near beach", "mountains"), 1),
            q("Which floor?", listOf("first", "second", "third"), 2),
            q("___ a view from the room.", listOf("There is", "There are", "Is there"), 0),
            q("___ two beds.", listOf("There is", "There are", "Is"), 1)
        ),
        idioms = listOf(IdiomExpression("A few", "چندتا", "A few rooms.", "چند اتاق.")),
        pron = listOf(PronunciationTip("There is/are", "Linking: there_is, there_are")),
        cult = listOf(CulturalNote("Hotel floors", "UK: ground floor = US: 1st floor.")),
        mis = listOf(CommonMistake("There is many rooms.", "There are many rooms.", "Plural = there are."))
    )

    private fun f9B() = base(
        34, "9B — I need a hero", "۹B — به یک قهرمان نیاز دارم",
        listOf("Adjectives of character", "Describe people", "Question forms"),
        listOf(
            v("hero", "قهرمان", "A real hero.", "قهرمان واقعی."),
            v("brave", "شجاع", "Very brave.", "خیلی شجاع.", "adjective"),
            v("kind", "مهربان", "A kind person.", "فرد مهربان.", "adjective"),
            v("smart", "باهوش", "Smart student.", "دانش‌آموز باهوش.", "adjective"),
            v("funny", "بامزه", "Funny guy.", "پسر بامزه.", "adjective"),
            v("honest", "صادق", "Honest man.", "مرد صادق.", "adjective")
        ),
        listOf(
            GrammarSection("Character adjectives", "brave, kind, smart, funny, honest, shy."),
            GrammarSection("Questions about people", "What's he like? What does he look like?")
        ),
        listOf(
            d("A", "Who's your hero?", "قهرمانت کیست؟"),
            d("B", "My grandfather. Very brave.", "پدربزرگم. خیلی شجاع."),
            d("A", "What's he like?", "چه جور آدمی است؟"),
            d("B", "Kind, honest, funny. Everyone loves him.", "مهربان، صادق، بامزه. همه دوستش دارند."),
            d("A", "What does he do?", "چه کار می‌کند؟"),
            d("B", "Retired now. Was a doctor.", "الان بازنشسته. دکتر بود."),
            d("A", "How old is he?", "چند ساله است؟"),
            d("B", "85. Still very active.", "۸۵. هنوز خیلی فعال.")
        ),
        listOf(
            q("Who is B's hero?", listOf("father", "grandfather", "teacher"), 1),
            q("What was his job?", listOf("teacher", "doctor", "engineer"), 1),
            q("___ he like? (personality)", listOf("What's", "What does", "How"), 0),
            q("He's very ___.", listOf("kind", "kindly", "kindness"), 0)
        ),
        idioms = listOf(IdiomExpression("Everyone loves him", "همه دوستش دارند", "Everyone loves him.", "همه دوستش دارند.")),
        pron = listOf(PronunciationTip("Adjective stress", "He's KIND. He's BRAVE.")),
        cult = listOf(CulturalNote("Heroes", "Vary by culture.")),
        mis = listOf(CommonMistake("How is he like?", "What's he like?", "Use What for personality."))
    )

    private fun f9C() = base(
        35, "9C — A lucky escape", "۹C — یک فرار خوش‌شانس",
        listOf("Narrative past", "Past continuous", "Tell a story"),
        listOf(
            v("escape", "فرار", "A lucky escape.", "فرار خوش‌شانس."),
            v("when", "وقتی", "When I arrived...", "وقتی رسیدم...", "conjunction"),
            v("while", "در حالی که", "While I was walking...", "در حالی که راه می‌رفتم...", "conjunction"),
            v("suddenly", "ناگهان", "Suddenly, ...", "ناگهان، ...", "adverb"),
            v("lucky", "خوش‌شانس", "Very lucky.", "خیلی خوش‌شانس.", "adjective"),
            v("accident", "تصادف", "A car accident.", "تصادف ماشین.")
        ),
        listOf(
            GrammarSection("Past continuous", "was/were + -ing. I was walking. They were driving."),
            GrammarSection("Past continuous + past simple", "While I was walking, I saw him. When she arrived, we were eating.")
        ),
        listOf(
            d("A", "You look pale. What happened?", "رنگ‌پریده‌ای. چی شد؟"),
            d("B", "A lucky escape. Car accident.", "فرار خوش‌شانس. تصادف ماشین."),
            d("A", "What were you doing?", "چه کار می‌کردی؟"),
            d("B", "Walking. Suddenly a car came fast.", "راه می‌رفتم. ناگهان ماشین تند آمد."),
            d("A", "Were you hurt?", "آسیب دیدی؟"),
            d("B", "No. Jumped away just in time.", "نه. درست به موقع پریدم."),
            d("A", "So lucky!", "چقدر خوش‌شانس!"),
            d("B", "I know. Very scary.", "می‌دانم. خیلی ترسناک.")
        ),
        listOf(
            q("What happened?", listOf("accident", "theft", "fire"), 0),
            q("Was B hurt?", listOf("yes", "no", "a little"), 1),
            q("I ___ walking when I saw him.", listOf("was", "were", "am"), 0),
            q("They ___ driving.", listOf("was", "were", "are"), 1)
        ),
        idioms = listOf(IdiomExpression("Just in time", "درست به موقع", "Just in time.", "درست به موقع.")),
        pron = listOf(PronunciationTip("Past continuous", "was /wəz/, were /wər/")),
        cult = listOf(CulturalNote("Road safety", "Always check before crossing.")),
        mis = listOf(CommonMistake("I was walk.", "I was walking.", "Add -ing."))
    )

    // ═══════════════════ FILE 10 ═══════════════════

    private fun f10A() = base(
        36, "10A — The best medicine", "۱۰A — بهترین دارو",
        listOf("Comparatives and superlatives review", "Health", "Give opinions"),
        listOf(
            v("medicine", "دارو", "Best medicine.", "بهترین دارو."),
            v("laugh", "خندیدن", "Laughter is medicine.", "خنده داروست.", "verb"),
            v("healthy", "سالم", "Healthy food.", "غذای سالم.", "adjective"),
            v("rest", "استراحت", "Get some rest.", "استراحت کن.", "verb"),
            v("stress", "استرس", "Less stress.", "استرس کمتر."),
            v("better", "بهتر", "Feel better.", "بهتر شو.", "adjective")
        ),
        listOf(
            GrammarSection("Comparatives", "good → better, bad → worse, healthy → healthier."),
            GrammarSection("Superlatives", "the best, the worst, the healthiest.")
        ),
        listOf(
            d("A", "What's the best medicine?", "بهترین دارو چیست؟"),
            d("B", "Laughter, I think.", "خنده، فکر می‌کنم."),
            d("A", "Better than medicine?", "بهتر از دارو؟"),
            d("B", "For stress, yes. Laughing is healthier.", "برای استرس، بله. خندیدن سالم‌تر است."),
            d("A", "What else?", "چیز دیگر؟"),
            d("B", "Rest. And good food.", "استراحت. و غذای خوب."),
            d("A", "What's the worst thing?", "بدترین چیز؟"),
            d("B", "Too much stress.", "استرس زیاد.")
        ),
        listOf(
            q("Best medicine?", listOf("pills", "laughter", "sleep"), 1),
            q("Worst thing?", listOf("stress", "coffee", "rain"), 0),
            q("Laughter is ___ than medicine.", listOf("good", "better", "best"), 1),
            q("The ___ thing is stress.", listOf("bad", "worse", "worst"), 2)
        ),
        idioms = listOf(IdiomExpression("Laughter is medicine", "خنده داروست", "Laughter is medicine.", "خنده داروست.")),
        pron = listOf(PronunciationTip("Comparatives", "BETter, WORSE, BEST")),
        cult = listOf(CulturalNote("Laughter therapy", "Used in some hospitals.")),
        mis = listOf(CommonMistake("more better", "better", "No 'more' with better."))
    )

    private fun f10B() = base(
        37, "10B — The best-dressed man", "۱۰B — خوش‌پوش‌ترین مرد",
        listOf("Present perfect + superlatives", "Talk about achievements", "Fashion"),
        listOf(
            v("dressed", "پوشیده", "Well-dressed.", "خوش‌پوش."),
            v("fashion", "مد", "Fashion week.", "هفته مد."),
            v("style", "سبک", "Personal style.", "سبک شخصی."),
            v("designer", "طراح", "A designer.", "طراح."),
            v("award", "جایزه", "Won an award.", "جایزه برد."),
            v("career", "حرفه", "A long career.", "حرفه طولانی.")
        ),
        listOf(
            GrammarSection("Present perfect + superlatives", "He's the best designer I've ever seen."),
            GrammarSection("Achievements", "He's won three awards. She's worked for 20 years.")
        ),
        listOf(
            d("A", "Who's the best-dressed man?", "خوش‌پوش‌ترین مرد کیست؟"),
            d("B", "David Beckham, I think.", "دیوید بکهام، فکر می‌کنم."),
            d("A", "Why?", "چرا؟"),
            d("B", "Great style. Simple but elegant.", "سبک عالی. ساده ولی شیک."),
            d("A", "Does he design clothes?", "لباس طراحی می‌کند؟"),
            d("B", "Yes. He's worked with big brands.", "بله. با برندهای بزرگ کار کرده."),
            d("A", "The best designer you've seen?", "بهترین طراح که دیده‌ای؟"),
            d("B", "Maybe. He's had a great career.", "شاید. حرفه عالی داشته.")
        ),
        listOf(
            q("Who's best-dressed?", listOf("Beckham", "Bowie", "Styles"), 0),
            q("Does he design clothes?", listOf("no", "yes", "sometimes"), 1),
            q("He's the best I've ___ seen.", listOf("ever", "never", "already"), 0),
            q("She's ___ for 20 years.", listOf("work", "worked", "working"), 1)
        ),
        idioms = listOf(IdiomExpression("Well-dressed", "خوش‌پوش", "Well-dressed man.", "مرد خوش‌پوش.")),
        pron = listOf(PronunciationTip("Superlatives", "the BEST-dressed")),
        cult = listOf(CulturalNote("Fashion", "Beckham is a style icon.")),
        mis = listOf(CommonMistake("the most best", "the best", "Best is already superlative."))
    )

    private fun f10C() = base(
        38, "10C — Never give up", "۱۰C — هرگز تسلیم نشو",
        listOf("Imperatives", "Give advice", "Talk about motivation"),
        listOf(
            v("give up", "تسلیم شدن", "Never give up.", "هرگز تسلیم نشو.", "verb"),
            v("try", "تلاش کردن", "Keep trying.", "به تلاش ادامه بده.", "verb"),
            v("believe", "باور کردن", "Believe in yourself.", "به خودت باور داشته باش.", "verb"),
            v("success", "موفقیت", "Success comes slowly.", "موفقیت آهسته می‌آید."),
            v("fail", "شکست خوردن", "Don't be afraid to fail.", "از شکست نترس.", "verb"),
            v("dream", "رؤیا", "Follow your dreams.", "رؤیاهایت را دنبال کن.")
        ),
        listOf(
            GrammarSection("Imperatives for advice", "Never give up. Keep trying. Believe in yourself."),
            GrammarSection("Should / Shouldn't", "You should try. You shouldn't quit.")
        ),
        listOf(
            d("A", "I failed my exam.", "در امتحانم شکست خوردم."),
            d("B", "Don't give up! Try again.", "تسلیم نشو! دوباره تلاش کن."),
            d("A", "But it's so hard.", "ولی خیلی سخته."),
            d("B", "Success comes slowly. Believe in yourself.", "موفقیت آهسته می‌آید. به خودت باور داشته باش."),
            d("A", "You think I can do it?", "فکر می‌کنی می‌توانم؟"),
            d("B", "Yes. Don't be afraid to fail.", "بله. از شکست نترس."),
            d("A", "You're right. I'll try again.", "حق با توست. دوباره تلاش می‌کنم."),
            d("B", "That's the spirit!", "همین روحیه را می‌خواهم!")
        ),
        listOf(
            q("What did A fail?", listOf("exam", "test", "course"), 0),
            q("What should A do?", listOf("give up", "try again", "rest"), 1),
            q("___ give up!", listOf("Not", "Never", "No"), 1),
            q("You ___ try again.", listOf("should", "should to", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه را می‌خواهم!", "That's the spirit!", "همین روحیه را می‌خواهم!")),
        pron = listOf(PronunciationTip("Imperatives", "Falling: NEVER give UP.")),
        cult = listOf(CulturalNote("Motivation", "Common in self-help culture.")),
        mis = listOf(CommonMistake("Don't to give up.", "Don't give up.", "No 'to' after don't."))
    )

    private fun pe5() = base(
        39, "PE5 — Asking for directions", "انگلیسی کاربردی ۵ — پرسیدن آدرس",
        listOf("Ask for directions", "Give directions", "Use imperatives"),
        listOf(
            v("turn left", "به چپ بپیچ", "Turn left.", "به چپ بپیچ.", "verb"),
            v("turn right", "به راست بپیچ", "Turn right.", "به راست بپیچ.", "verb"),
            v("go straight", "مستقیم برو", "Go straight.", "مستقیم برو.", "verb"),
            v("corner", "گوشه", "At the corner.", "در گوشه."),
            v("traffic lights", "چراغ راهنما", "At the lights.", "در چراغ‌ها."),
            v("opposite", "روبه‌روی", "Opposite the bank.", "روبه‌روی بانک.", "preposition")
        ),
        listOf(
            GrammarSection("Imperatives for directions", "Turn left. Go straight. Take the second right."),
            GrammarSection("Prepositions of place", "on, at, next to, opposite, between.")
        ),
        listOf(
            d("A", "Excuse me, where's the station?", "ببخشید، ایستگاه کجاست؟"),
            d("B", "Go straight down this street.", "این خیابان را مستقیم برو."),
            d("A", "Straight. OK.", "مستقیم. باشه."),
            d("B", "Then turn left at the traffic lights.", "بعد در چراغ راهنما به چپ بپیچ."),
            d("A", "Left at the lights.", "چپ در چراغ‌ها."),
            d("B", "It's opposite the bank.", "روبه‌روی بانک است."),
            d("A", "Is it far?", "دور است؟"),
            d("B", "About five minutes on foot.", "حدود پنج دقیقه پیاده.")
        ),
        listOf(
            q("Which way to turn?", listOf("left", "right", "straight"), 0),
            q("Where's the station?", listOf("next to bank", "opposite bank", "behind bank"), 1),
            q("___ left at the lights.", listOf("Turn", "Turning", "To turn"), 0),
            q("Go ___ down the street.", listOf("straight", "straightly", "straighten"), 0)
        ),
        idioms = listOf(IdiomExpression("On foot", "پیاده", "Five minutes on foot.", "پنج دقیقه پیاده.")),
        pron = listOf(PronunciationTip("Directions", "Falling: TURN left. GO straight.")),
        cult = listOf(CulturalNote("Asking strangers", "Start with 'Excuse me'.")),
        mis = listOf(CommonMistake("Turn to left.", "Turn left.", "No 'to'."))
    )

    private fun rc910() = base(
        40, "R&C 9 & 10", "مرور ۹ و ۱۰",
        listOf("Review there is/are", "Review past continuous", "Review comparatives/superlatives"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("There is/are", "There's a book. There are books."),
            GrammarSection("Past continuous", "I was walking. They were driving."),
            GrammarSection("Comparatives/superlatives", "better, the best, more expensive.")
        ),
        listOf(
            d("T", "Review Files 9-10.", "مرور ۹-۱۰."),
            d("A", "There is/are for existence.", "there is/are برای وجود."),
            d("B", "Past continuous for actions in progress.", "حال استمراری گذشته."),
            d("T", "Example?", "مثال؟"),
            d("A", "I was walking when I saw him.", "در حال راه رفتن بودم که دیدمش."),
            d("T", "Comparatives?", "مقایسه‌ای‌ها؟"),
            d("B", "good → better → the best. bad → worse → the worst.", "good → better → the best. bad → worse → the worst."),
            d("T", "Excellent!", "عالی!")
        ),
        listOf(
            q("Existence?", listOf("there is/are", "be", "have"), 0),
            q("Action in progress past?", listOf("past simple", "past continuous", "present"), 1),
            q("Comparative of bad?", listOf("badder", "worse", "worst"), 1),
            q("Superlative of good?", listOf("gooder", "better", "best"), 2)
        ),
        idioms = listOf(IdiomExpression("Let's review", "مرور کنیم", "Let's review.", "مرور کنیم.")),
        pron = listOf(PronunciationTip("Was/Were", "Weak forms.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("There is many.", "There are many.", "Plural."))
    )

    // ═══════════════════ FILE 11 ═══════════════════

    private fun f11A() = base(
        41, "11A — The wrong shoes", "۱۱A — کفش اشتباه",
        listOf("Must / mustn't", "Have to / don't have to", "Talk about rules"),
        listOf(
            v("rule", "قانون", "House rules.", "قوانین خانه."),
            v("must", "باید", "You must be quiet.", "باید ساکت باشی.", "verb"),
            v("mustn't", "نباید", "You mustn't smoke.", "نباید سیگار بکشی.", "verb"),
            v("have to", "باید", "I have to pay.", "باید پرداخت کنم.", "verb"),
            v("permission", "اجازه", "Ask permission.", "اجازه بگیر."),
            v("rent", "اجاره", "Pay rent.", "اجاره بده.")
        ),
        listOf(
            GrammarSection("Must / Mustn't", "Must = obligation. Mustn't = prohibition."),
            GrammarSection("Have to / Don't have to", "Have to = external obligation. Don't have to = no obligation.")
        ),
        listOf(
            d("A", "Any rules in your new flat?", "قانونی در آپارتمان جدیدت هست؟"),
            d("B", "Yes. I have to pay rent on the 1st.", "بله. باید اول ماه اجاره بدهم."),
            d("A", "What else?", "چیز دیگر؟"),
            d("B", "Mustn't make noise after 10 PM.", "نباید بعد از ۱۰ شب سر و صدا کنم."),
            d("A", "Do you have to clean?", "باید تمیز کنی؟"),
            d("B", "Once a week. Not every day.", "هفته‌ای یک بار. نه هر روز."),
            d("A", "Can you have guests?", "می‌توانی مهمان بیاوری؟"),
            d("B", "Yes, but tell the landlord first.", "بله، ولی اول به صاحب‌خانه بگو.")
        ),
        listOf(
            q("When pay rent?", listOf("1st", "15th", "last"), 0),
            q("When no noise?", listOf("after 9", "after 10", "after 11"), 1),
            q("You ___ smoke inside.", listOf("must", "mustn't", "don't have to"), 1),
            q("I ___ work tomorrow. Holiday!", listOf("must", "mustn't", "don't have to"), 2)
        ),
        idioms = listOf(IdiomExpression("Move in", "اسباب‌کشی", "Moving in next week.", "هفته بعد اسباب‌کشی.")),
        pron = listOf(PronunciationTip("Have to", "'hafta' in fast speech")),
        cult = listOf(CulturalNote("Renting", "Tenants sign a lease.")),
        mis = listOf(CommonMistake("I don't must work.", "I don't have to work.", "Use don't have to."))
    )

    private fun f11B() = base(
        42, "11B — The story of the marathon", "۱۱B — داستان ماراتن",
        listOf("Past simple review", "Sports and history", "Narrate events"),
        listOf(
            v("marathon", "ماراتن", "Run a marathon.", "ماراتن بدو."),
            v("race", "مسابقه", "A long race.", "مسابقه طولانی."),
            v("win", "بردن", "Won the race.", "مسابقه را برد.", "verb"),
            v("run", "دویدن", "Ran very fast.", "خیلی تند دوید.", "verb"),
            v("history", "تاریخچه", "A long history.", "تاریخچه طولانی."),
            v("ancient", "باستانی", "Ancient Greece.", "یونان باستان.", "adjective")
        ),
        listOf(
            GrammarSection("Past simple review", "Regular and irregular verbs."),
            GrammarSection("Narrative sequencing", "First, then, after that, finally.")
        ),
        listOf(
            d("A", "Do you know the marathon story?", "داستان ماراتن را می‌دانی؟"),
            d("B", "A little. Ancient Greece.", "کمی. یونان باستان."),
            d("A", "Yes. A soldier ran to Athens.", "بله. سربازی به آتن دوید."),
            d("B", "How far?", "چقدر؟"),
            d("A", "About 40 km. Then he died.", "حدود ۴۰ کیلومتر. بعد مرد."),
            d("B", "Wow. That's why it's a marathon.", "واو. برای همین ماراتن است."),
            d("A", "Yes. Now millions run every year.", "بله. الان میلیون‌ها نفر هر سال می‌دوند."),
            d("B", "Amazing history.", "تاریخچه شگفت‌انگیز.")
        ),
        listOf(
            q("Where was marathon?", listOf("Rome", "Greece", "Egypt"), 1),
            q("How far?", listOf("20 km", "40 km", "60 km"), 1),
            q("He ___ very fast.", listOf("run", "ran", "running"), 1),
            q("She ___ the race.", listOf("win", "won", "winning"), 1)
        ),
        idioms = listOf(IdiomExpression("Ancient history", "تاریخ باستان", "Ancient Greece.", "یونان باستان.")),
        pron = listOf(PronunciationTip("-ed past", "/t/, /d/, /ɪd/")),
        cult = listOf(CulturalNote("Marathon", "42.195 km officially.")),
        mis = listOf(CommonMistake("He runned.", "He ran.", "Irregular."))
    )

    private fun f11C() = base(
        43, "11C — It's a mystery", "۱۱C — یک راز است",
        listOf("Present perfect review", "Talk about mysteries", "Express uncertainty"),
        listOf(
            v("mystery", "راز", "A mystery.", "یک راز."),
            v("clue", "سرنخ", "A clue.", "سرنخ."),
            v("solve", "حل کردن", "Solve it.", "حلش کن.", "verb"),
            v("disappear", "ناپدید شدن", "Disappeared suddenly.", "ناگهان ناپدید شد.", "verb"),
            v("strange", "عجیب", "Strange story.", "داستان عجیب.", "adjective"),
            v("maybe", "شاید", "Maybe not.", "شاید نه.", "adverb")
        ),
        listOf(
            GrammarSection("Present perfect review", "Have you ever...? I've never..."),
            GrammarSection("Uncertainty", "Maybe. I'm not sure. Perhaps.")
        ),
        listOf(
            d("A", "Have you heard the mystery?", "راز را شنیدی؟"),
            d("B", "No. What happened?", "نه. چی شد؟"),
            d("A", "A ship disappeared in 1872.", "کشتی در ۱۸۷۲ ناپدید شد."),
            d("B", "Strange. Any clues?", "عجیب. سرنخی؟"),
            d("A", "Never found. It's still a mystery.", "هرگز پیدا نشد. هنوز راز است."),
            d("B", "Have they solved it?", "حلش کرده‌اند؟"),
            d("A", "Never. Maybe aliens!", "هرگز. شاید موجودات فضایی!"),
            d("B", "Ha! Maybe just a storm.", "ها! شاید فقط طوفان.")
        ),
        listOf(
            q("When disappeared?", listOf("1772", "1872", "1972"), 1),
            q("Solved?", listOf("yes", "no", "maybe"), 1),
            q("Have they ___ it?", listOf("solve", "solved", "solving"), 1),
            q("I'm ___ sure.", listOf("no", "not", "never"), 1)
        ),
        idioms = listOf(IdiomExpression("A mystery", "یک راز", "Still a mystery.", "هنوز راز است.")),
        pron = listOf(PronunciationTip("Present perfect", "I've /aɪv/")),
        cult = listOf(CulturalNote("Mary Celeste", "Famous mystery ship.")),
        mis = listOf(CommonMistake("Have they solve?", "Have they solved?", "Past participle."))
    )

    // ═══════════════════ FILE 12 ═══════════════════

    private fun f12A() = base(
        44, "12A — A big decision", "۱۲A — یک تصمیم بزرگ",
        listOf("Present perfect with just/yet/already", "Talk about decisions", "Future plans"),
        listOf(
            v("decision", "تصمیم", "A big decision.", "تصمیم بزرگ."),
            v("decide", "تصمیم گرفتن", "Decided to move.", "تصمیم گرفتم نقل مکان کنم.", "verb"),
            v("quit", "رها کردن", "Quit my job.", "شغلم را رها کردم.", "verb"),
            v("opportunity", "فرصت", "A great opportunity.", "فرصت عالی."),
            v("advice", "توصیه", "Ask for advice.", "توصیه بخواه."),
            v("nervous", "عصبی", "Very nervous.", "خیلی عصبی.", "adjective")
        ),
        listOf(
            GrammarSection("Just / Yet / Already", "I've just decided. Have you decided yet? I've already told them."),
            GrammarSection("Future with going to", "I'm going to move to Canada.")
        ),
        listOf(
            d("A", "You look nervous. What's up?", "عصبی به نظر می‌رسی. چی شده؟"),
            d("B", "I've just decided to quit my job.", "همین الان تصمیم گرفتم شغلم را رها کنم."),
            d("A", "Really? Why?", "واقعاً؟ چرا؟"),
            d("B", "New opportunity. Going to move to Canada.", "فرصت جدید. قرار است به کانادا نقل مکان کنم."),
            d("A", "Wow! Have you told your boss yet?", "واو! به رئیست گفتی؟"),
            d("B", "Not yet. Tomorrow morning.", "هنوز نه. فردا صبح."),
            d("A", "Have you told your family?", "به خانواده‌ات گفتی؟"),
            d("B", "Already told my wife. She's excited.", "قبلاً به همسرم گفتم. هیجان‌زده است.")
        ),
        listOf(
            q("What decision?", listOf("quit job", "buy house", "get married"), 0),
            q("Where moving?", listOf("USA", "Canada", "UK"), 1),
            q("I've ___ decided.", listOf("yet", "just", "ever"), 1),
            q("Have you told him ___?", listOf("yet", "just", "already"), 0)
        ),
        idioms = listOf(IdiomExpression("What's up?", "چی شده؟", "What's up?", "چی شده؟")),
        pron = listOf(PronunciationTip("Just/Yet", "Stress: JUST, YET")),
        cult = listOf(CulturalNote("Big moves", "Common for career.")),
        mis = listOf(CommonMistake("I've decided yet.", "I've just decided.", "Yet = negative/question."))
    )

    private fun f12B() = base(
        45, "12B — The year of the snake", "۱۲B — سال مار",
        listOf("First conditional", "Talk about possibilities", "Culture and traditions"),
        listOf(
            v("if", "اگر", "If you go...", "اگر بروی...", "conjunction"),
            v("will", "خواهد", "You'll love it.", "عاشقش می‌شوی.", "verb"),
            v("tradition", "سنت", "Old tradition.", "سنت قدیمی."),
            v("celebrate", "جشن گرفتن", "Celebrate New Year.", "سال نو را جشن بگیر.", "verb"),
            v("lucky", "خوش‌شانس", "Lucky year.", "سال خوش‌شانس.", "adjective"),
            v("symbol", "نماد", "A symbol of luck.", "نماد شانس.")
        ),
        listOf(
            GrammarSection("First conditional", "If + present simple, will + verb. If you go, you'll love it."),
            GrammarSection("Possibility", "If it rains, we'll stay home.")
        ),
        listOf(
            d("A", "Do you celebrate Chinese New Year?", "سال نو چینی را جشن می‌گیری؟"),
            d("B", "Yes! This year is the Snake.", "بله! امسال مار است."),
            d("A", "What does it mean?", "چه معنایی دارد؟"),
            d("B", "Snake symbol is lucky. If you're born in it, good year.", "نماد مار خوش‌شانسی است. اگر در آن متولد شوی، سال خوب."),
            d("A", "Interesting. What do you do?", "جالب. چه کار می‌کنید؟"),
            d("B", "Family dinner. Red decorations. Fireworks.", "شام خانوادگی. تزئینات قرمز. آتش‌بازی."),
            d("A", "If I visit, will you invite me?", "اگر بیایم، دعوتم می‌کنی؟"),
            d("B", "Of course! You'll love it.", "البته! عاشقش می‌شوی.")
        ),
        listOf(
            q("Animal this year?", listOf("dragon", "snake", "tiger"), 1),
            q("What do they eat?", listOf("family dinner", "sushi", "pizza"), 0),
            q("If you ___, you'll love it.", listOf("go", "went", "going"), 0),
            q("If it ___, we'll stay home.", listOf("rain", "rains", "rained"), 1)
        ),
        idioms = listOf(IdiomExpression("You'll love it", "عاشقش می‌شوی", "You'll love it!", "عاشقش می‌شوی!")),
        pron = listOf(PronunciationTip("First conditional", "Rise on if-clause, fall on main.")),
        cult = listOf(CulturalNote("Chinese NY", "Snake is 6th animal.")),
        mis = listOf(CommonMistake("If you will go", "If you go", "No 'will' in if-clause."))
    )

    private fun f12C() = base(
        46, "12C — Goodbye and good luck", "۱۲C — خداحافظ و موفق باشی",
        listOf("Review all tenses", "Say goodbye", "Talk about the future"),
        listOf(
            v("goodbye", "خداحافظ", "Goodbye!", "خداحافظ!", "interjection"),
            v("good luck", "موفق باشی", "Good luck!", "موفق باشی!", "phrase"),
            v("keep in touch", "در تماس باش", "Keep in touch.", "در تماس باش.", "verb"),
            v("miss", "دلتنگ شدن", "I'll miss you.", "دلتنگت می‌شوم.", "verb"),
            v("hope", "امیدوار بودن", "Hope to see you.", "امیدوارم ببینمت.", "verb"),
            v("soon", "به‌زودی", "See you soon.", "به‌زودی می‌بینمت.", "adverb")
        ),
        listOf(
            GrammarSection("Review: present, past, future", "I work / I worked / I'm going to work."),
            GrammarSection("Saying goodbye", "Goodbye. Good luck. Keep in touch. See you soon.")
        ),
        listOf(
            d("A", "Is this your last class?", "آخرین کلاسته؟"),
            d("B", "Yes. Moving back to Spain next week.", "بله. هفته بعد به اسپانیا برمی‌گردم."),
            d("A", "We'll miss you!", "دلتنگت می‌شویم!"),
            d("B", "Me too. You've all been great.", "من هم. همه‌تان عالی بودید."),
            d("A", "Keep in touch!", "در تماس باش!"),
            d("B", "Of course. Email me anytime.", "البته. هر وقت ایمیل بزن."),
            d("A", "Good luck with everything!", "موفق باشی در همه چیز!"),
            d("B", "Thanks. See you soon!", "ممنون. به‌زودی می‌بینمت!")
        ),
        listOf(
            q("Where is B moving?", listOf("Italy", "Spain", "France"), 1),
            q("When?", listOf("this week", "next week", "next month"), 1),
            q("I ___ miss you.", listOf("will", "am", "do"), 0),
            q("Keep in ___!", listOf("touch", "talk", "contact"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Good luck!", "موفق باشی!", "Good luck!", "موفق باشی!"),
            IdiomExpression("Keep in touch", "در تماس باش", "Keep in touch!", "در تماس باش!")
        ),
        pron = listOf(PronunciationTip("Goodbye intonation", "Rising: See you SOON ↗")),
        cult = listOf(CulturalNote("Goodbyes", "Hug or handshake varies.")),
        mis = listOf(CommonMistake("I will miss to you.", "I will miss you.", "No 'to'."))
    )

    private fun pe6() = base(
        47, "PE6 — On the phone", "انگلیسی کاربردی ۶ — تلفنی",
        listOf("Make phone calls", "Leave messages", "Take messages"),
        listOf(
            v("call", "تماس", "Make a call.", "تماس بگیر.", "verb"),
            v("message", "پیام", "Leave a message.", "پیام بگذار."),
            v("hold on", "صبر کن", "Hold on, please.", "لطفاً صبر کن.", "verb"),
            v("wrong number", "شماره اشتباه", "Wrong number.", "شماره اشتباه."),
            v("speak to", "صحبت کردن با", "Speak to Tom.", "با تام صحبت کن.", "verb"),
            v("available", "در دسترس", "Not available.", "در دسترس نیست.", "adjective")
        ),
        listOf(
            GrammarSection("Phone phrases", "Can I speak to...? Hold on, please. Can I take a message?"),
            GrammarSection("Polite requests", "Could you...? Would you...?")
        ),
        listOf(
            d("A", "Hello, can I speak to Tom?", "سلام، می‌توانم با تام صحبت کنم؟"),
            d("B", "Hold on, please.", "لطفاً صبر کنید."),
            d("B", "Sorry, not available.", "متأسفانه، در دسترس نیست."),
            d("A", "Can I leave a message?", "می‌توانم پیام بگذارم؟"),
            d("B", "Of course.", "البته."),
            d("A", "Tell him Maria called. Call back.", "بگو ماریا زنگ زد. تماس بگیرد."),
            d("B", "Got it. Anything else?", "فهمیدم. چیز دیگر؟"),
            d("A", "No, thanks. Bye.", "نه، ممنون. خداحافظ.")
        ),
        listOf(
            q("Who's calling?", listOf("Tom", "Maria", "Anna"), 1),
            q("Is Tom available?", listOf("yes", "no", "maybe"), 1),
            q("Can I ___ to Tom?", listOf("speak", "talk", "say"), 0),
            q("___ on, please.", listOf("Hold", "Wait", "Stay"), 0)
        ),
        idioms = listOf(IdiomExpression("Hold on", "صبر کن", "Hold on, please.", "صبر کن، لطفاً.")),
        pron = listOf(PronunciationTip("Phone", "Rise: Can I SPEAK to Tom? ↗")),
        cult = listOf(CulturalNote("Phone", "Always ask politely.")),
        mis = listOf(CommonMistake("I want to speak Tom.", "I want to speak to Tom.", "Use 'to'."))
    )

    private fun rc1112() = base(
        48, "R&C 11 & 12", "مرور ۱۱ و ۱۲",
        listOf("Review all grammar", "Review all tenses", "Final review"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Review: all tenses", "Present, past, future, present perfect."),
            GrammarSection("Review: modal verbs", "Can, must, have to, should."),
            GrammarSection("Review: conditionals", "If + present, will + verb.")
        ),
        listOf(
            d("T", "Final review. Files 11-12.", "مرور نهایی. فایل‌های ۱۱-۱۲."),
            d("A", "Must/mustn't for rules.", "must/mustn't برای قوانین."),
            d("B", "Have to/don't have to for obligations.", "have to/don't have to برای الزامات."),
            d("T", "First conditional?", "شرطی نوع اول؟"),
            d("A", "If it rains, we'll stay home.", "اگر باران بیاید، خانه می‌مانیم."),
            d("T", "Present perfect?", "حال کامل؟"),
            d("B", "I've just decided. Have you told him yet?", "همین الان تصمیم گرفتم. به او گفتی؟"),
            d("T", "Excellent! You've learned so much this year!", "عالی! امسال خیلی یاد گرفتید!")
        ),
        listOf(
            q("Rules?", listOf("must", "have to", "will"), 0),
            q("No obligation?", listOf("must", "mustn't", "don't have to"), 2),
            q("If it ___, we'll stay.", listOf("rain", "rains", "rained"), 1),
            q("I've ___ decided.", listOf("yet", "just", "ever"), 1)
        ),
        idioms = listOf(IdiomExpression("Let's review", "مرور کنیم", "Let's review.", "مرور کنیم.")),
        pron = listOf(PronunciationTip("All contractions", "I'm, I've, I'll, I'd")),
        cult = listOf(CulturalNote("End of course", "Congratulations on finishing!"))
        ,
        mis = listOf(CommonMistake("I don't must.", "I don't have to.", "Correct: don't have to."))
    )
}