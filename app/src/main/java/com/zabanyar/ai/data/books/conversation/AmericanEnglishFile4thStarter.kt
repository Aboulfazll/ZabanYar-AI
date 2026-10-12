package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 4th Edition — Starter
 * 12 Files × 2 Lessons (A/B) + 6 PE + 6 R&C = 36 Lessons | A1 Beginner
 * مکالمه: ۸-۱۰ خط
 */
object AmericanEnglishFile4thStarter {
    const val BOOK_ID = "american_english_file_4th_starter"

    fun getContent(n: Int): LessonContent = when (n) {
        // File 1-2
        1 -> f1A(); 2 -> f1B()
        3 -> f2A(); 4 -> f2B()
        5 -> pe1(); 6 -> rc12()
        // File 3-4
        7 -> f3A(); 8 -> f3B()
        9 -> f4A(); 10 -> f4B()
        11 -> pe2(); 12 -> rc34()
        // File 5-6
        13 -> f5A(); 14 -> f5B()
        15 -> f6A(); 16 -> f6B()
        17 -> pe3(); 18 -> rc56()
        // File 7-8
        19 -> f7A(); 20 -> f7B()
        21 -> f8A(); 22 -> f8B()
        23 -> pe4(); 24 -> rc78()
        // File 9-10
        25 -> f9A(); 26 -> f9B()
        27 -> f10A(); 28 -> f10B()
        29 -> pe5(); 30 -> rc910()
        // File 11-12
        31 -> f11A(); 32 -> f11B()
        33 -> f12A(); 34 -> f12B()
        35 -> pe6(); 36 -> rc1112()
        else -> LessonContent(BOOK_ID, n, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList())
    }

    private fun base(n: Int, title: String, fa: String,
        obj: List<String>, vocab: List<VocabWord>, gr: List<GrammarSection>,
        dlg: List<DialogueLine>, qz: List<QuizQuestion>,
        idioms: List<IdiomExpression> = emptyList(),
        pron: List<PronunciationTip> = emptyList(),
        cult: List<CulturalNote> = emptyList(),
        mis: List<CommonMistake> = emptyList()
    ) = LessonContent(bookId = BOOK_ID, chapterNumber = n, title = title, titlePersian = fa,
        objectives = obj, vocabulary = vocab, idioms = idioms,
        pronunciationTips = pron, culturalNotes = cult,
        grammar = gr, commonMistakes = mis, conversation = dlg, quiz = qz)

    private fun v(e: String, p: String, ex: String, ep: String, pos: String = "noun") =
        VocabWord(e, p, partOfSpeech = pos, example = ex, examplePersian = ep)
    private fun d(s: String, e: String, p: String) = DialogueLine(s, e, p)
    private fun q(x: String, o: List<String>, c: Int) = QuizQuestion(x, o, c)

    // ═══════════ FILE 1 ═══════════
    private fun f1A() = base(1, "1A A cappuccino, please", "۱A یک کاپوچینو، لطفاً",
        listOf("Order a drink in a cafe", "Use verb be (I, you)", "Say numbers 0-10 and days of the week"),
        listOf(
            v("cappuccino", "کاپوچینو", "A cappuccino, please.", "یک کاپوچینو، لطفاً."),
            v("coffee", "قهوه", "A coffee, please.", "یک قهوه، لطفاً."),
            v("tea", "چای", "A tea, please.", "یک چای، لطفاً."),
            v("hello", "سلام", "Hello, I'm Tom.", "سلام، من تامم.", "interjection"),
            v("goodbye", "خداحافظ", "Goodbye, see you!", "خداحافظ، می‌بینمت!", "interjection"),
            v("name", "نام", "What's your name?", "نامت چیست؟"),
            v("please", "لطفاً", "A coffee, please.", "یک قهوه، لطفاً.", "interjection"),
            v("thanks", "ممنون", "Thanks a lot.", "خیلی ممنون.", "interjection")
        ),
        listOf(
            GrammarSection("Verb be: I and you", "I am Tom. You are Helen. Contractions: I'm, you're."),
            GrammarSection("Numbers 0-10", "zero, one, two, three, four, five, six, seven, eight, nine, ten."),
            GrammarSection("Days of the week", "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.")
        ),
        listOf(
            d("A", "Hello. A cappuccino, please.", "سلام. یک کاپوچینو، لطفاً."),
            d("B", "What's your name?", "نامت چیست؟"),
            d("A", "Helen.", "هلن."),
            d("B", "Just a minute, Helen.", "یک دقیقه، هلن."),
            d("A", "Thank you.", "ممنون."),
            d("B", "Are you Helen?", "تو هلن هستی؟"),
            d("A", "Yes, I am.", "بله."),
            d("B", "I'm Tom. Nice to meet you.", "من تامم. از آشنایی خوشحالم."),
            d("A", "Nice to meet you, too.", "من هم خوشحالم."),
            d("B", "See you later!", "بعداً می‌بینمت!")
        ),
        listOf(
            q("What does Helen order?", listOf("a tea", "a cappuccino", "water"), 1),
            q("Who is Tom?", listOf("a waiter", "a friend", "a doctor"), 0),
            q("___ am Tom.", listOf("I", "You", "He"), 0),
            q("Contraction of 'I am'?", listOf("I'm", "I're", "I's"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you!", "از آشنایی خوشحالم!"),
            IdiomExpression("See you later", "بعداً می‌بینمت", "See you later!", "بعداً می‌بینمت!"),
            IdiomExpression("Just a minute", "یک دقیقه", "Just a minute.", "یک دقیقه.")
        ),
        pron = listOf(PronunciationTip("Contractions", "I'm /aɪm/, you're /jʊr/")),
        cult = listOf(CulturalNote("First names", "English speakers use first names immediately.")),
        mis = listOf(CommonMistake("I is Tom.", "I am Tom.", "Use 'am' with I."))
    )

    private fun f1B() = base(2, "1B World music", "۱B موسیقی جهان",
        listOf("Use verb be (he, she, it)", "Talk about countries", "Say where people are from"),
        listOf(
            v("music", "موسیقی", "World music.", "موسیقی جهان."),
            v("singer", "خواننده", "A famous singer.", "خواننده معروف."),
            v("band", "گروه موسیقی", "A great band.", "گروه عالی."),
            v("from", "اهل", "Where is she from?", "اهل کجاست؟", "preposition"),
            v("country", "کشور", "Which country?", "کدام کشور؟"),
            v("world", "جهان", "Around the world.", "در سراسر جهان.")
        ),
        listOf(
            GrammarSection("Verb be: he, she, it", "He is Tom. She is Helen. It is music. Contractions: he's, she's, it's."),
            GrammarSection("Questions with be", "Where is he from? Where's she from?")
        ),
        listOf(
            d("A", "Who's your favourite singer?", "خواننده مورد علاقه‌ات کیه؟"),
            d("B", "Shakira. She's from Colombia.", "شکیرا. اهل کلمبیاست."),
            d("A", "Where's Colombia?", "کلمبیا کجاست؟"),
            d("B", "In South America. She's very famous.", "در آمریکای جنوبی. او خیلی معروفه."),
            d("A", "And who's this?", "و این کیه؟"),
            d("B", "It's a band. They're from Japan.", "یک گروه موسیقیه. اهل ژاپنن."),
            d("A", "Is the music good?", "موسیقی‌شون خوبه؟"),
            d("B", "Yes, it's amazing.", "بله، شگفت‌انگیزه."),
            d("A", "Where are they now?", "الان کجان؟"),
            d("B", "They're in London. On tour.", "در لندنن. در تور.")
        ),
        listOf(
            q("Where is Shakira from?", listOf("Spain", "Colombia", "Mexico"), 1),
            q("Where is the band from?", listOf("Korea", "Japan", "China"), 1),
            q("___ is she from?", listOf("What", "Where", "Who"), 1),
            q("She ___ from Colombia.", listOf("am", "is", "are"), 1)
        ),
        idioms = listOf(
            IdiomExpression("On tour", "در تور", "They're on tour.", "در تور هستن."),
            IdiomExpression("Very famous", "خیلی معروف", "She's very famous.", "او خیلی معروفه.")
        ),
        pron = listOf(PronunciationTip("he's / she's", "he's /hiːz/, she's /ʃiːz/")),
        cult = listOf(CulturalNote("World music", "Popular worldwide.")),
        mis = listOf(CommonMistake("He are from Japan.", "He is from Japan.", "Use 'is' with he."))
    )

    // ═══════════ FILE 2 ═══════════
    private fun f2A() = base(3, "2A Are you on holiday?", "۲A در تعطیلاتی؟",
        listOf("Use verb be (we, you, they)", "Talk about nationalities", "Say numbers 11-100"),
        listOf(
            v("holiday", "تعطیلات", "Are you on holiday?", "در تعطیلاتی؟"),
            v("we", "ما", "We're from Spain.", "ما اهل اسپانیا هستیم."),
            v("they", "آن‌ها", "They're British.", "آن‌ها بریتانیایی هستند."),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیست؟"),
            v("British", "بریتانیایی", "They're British.", "بریتانیایی هستند.", "adjective"),
            v("American", "آمریکایی", "She's American.", "او آمریکایی است.", "adjective")
        ),
        listOf(
            GrammarSection("Verb be: we, you, they", "We are, you are, they are. Contractions: we're, you're, they're."),
            GrammarSection("Numbers 11-100", "eleven, twelve, twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety, one hundred.")
        ),
        listOf(
            d("A", "Are you on holiday?", "در تعطیلاتی؟"),
            d("B", "Yes, we are. We're from Spain.", "بله. اهل اسپانیا هستیم."),
            d("A", "Where in Spain?", "کجای اسپانیا؟"),
            d("B", "Barcelona. And you?", "بارسلونا. تو چطور؟"),
            d("A", "We're from Britain. From London.", "ما اهل بریتانیاییم. از لندن."),
            d("B", "Are they with you?", "آن‌ها با شما هستن؟"),
            d("A", "Yes, they're our friends. From Canada.", "بله، دوستانمان هستند. از کانادا."),
            d("B", "So many nationalities!", "چقدر ملیت‌های مختلف!"),
            d("A", "Yes, we're an international group.", "بله، ما گروه بین‌المللی هستیم."),
            d("B", "Have a nice holiday!", "تعطیلات خوبی داشته باشید!")
        ),
        listOf(
            q("Where is B from?", listOf("Britain", "Spain", "Canada"), 1),
            q("Where are 'they' from?", listOf("Spain", "Britain", "Canada"), 2),
            q("We ___ from Spain.", listOf("am", "is", "are"), 2),
            q("___ they British?", listOf("Am", "Is", "Are"), 2)
        ),
        idioms = listOf(
            IdiomExpression("On holiday", "در تعطیلات", "We're on holiday.", "در تعطیلات هستیم."),
            IdiomExpression("Have a nice holiday", "تعطیلات خوبی داشته باشید", "Have a nice holiday!", "تعطیلات خوبی داشته باشید!")
        ),
        pron = listOf(PronunciationTip("Nationality stress", "SPAnish, BRItish, caNADIan")),
        cult = listOf(CulturalNote("Nationalities", "Always capitalized.")),
        mis = listOf(CommonMistake("We is from Spain.", "We are from Spain.", "Use 'are' with we."))
    )

    private fun f2B() = base(4, "2B That's my bus!", "۲B اون اتوبوس منه!",
        listOf("Ask Wh- and How questions with be", "Say phone numbers", "Ask personal information"),
        listOf(
            v("bus", "اتوبوس", "That's my bus!", "اون اتوبوس منه!"),
            v("phone number", "شماره تلفن", "What's your phone number?", "شماره تلفنت چیه؟"),
            v("how old", "چند ساله", "How old are you?", "چند سالته؟"),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟"),
            v("email", "ایمیل", "What's your email?", "ایمیلت چیه؟"),
            v("number", "شماره", "A phone number.", "شماره تلفن.")
        ),
        listOf(
            GrammarSection("Wh- and How questions with be", "What's your name? Where are you from? Who is he? How old are you?"),
            GrammarSection("Saying phone numbers", "0 = zero / oh. 07700 900123.")
        ),
        listOf(
            d("A", "What's your phone number?", "شماره تلفنت چیه؟"),
            d("B", "It's 07700 900123.", "۰۷۷۰۰ ۹۰۰۱۲۳."),
            d("A", "Sorry, can you repeat that?", "ببخشید، تکرار می‌کنی؟"),
            d("B", "Yes. 0-7-7-0-0, 9-0-0-1-2-3.", "بله. ۰-۷-۷-۰-۰، ۹-۰-۰-۱-۲-۳."),
            d("A", "Thanks. How old are you?", "ممنون. چند سالته؟"),
            d("B", "I'm 22. And you?", "۲۲ سالمه. تو چطور؟"),
            d("A", "I'm 24. Where's your address?", "من ۲۴ سالمه. آدرست کجاست؟"),
            d("B", "12 Park Street. Near the bus stop.", "۱۲ خیابان پارک. نزدیک ایستگاه اتوبوس."),
            d("A", "Oh! That's my bus!", "اوه! اون اتوبوس منه!"),
            d("B", "Quick! See you later!", "سریع! بعداً می‌بینمت!")
        ),
        listOf(
            q("What's B's phone number?", listOf("07700 900123", "07700 900456", "07700 900789"), 0),
            q("How old is B?", listOf("20", "22", "24"), 1),
            q("___ old are you?", listOf("What", "How", "Who"), 1),
            q("___ is your name?", listOf("What", "Who", "Where"), 0)
        ),
        idioms = listOf(IdiomExpression("Can you repeat that?", "می‌تونی تکرار کنی؟", "Can you repeat that?", "می‌تونی تکرار کنی؟")),
        pron = listOf(PronunciationTip("Phone numbers", "Say each digit separately.")),
        cult = listOf(CulturalNote("Phone numbers", "Format varies by country.")),
        mis = listOf(CommonMistake("How old you are?", "How old are you?", "Verb before subject."))
    )

    // ═══════════ PRACTICAL ENGLISH 1 ═══════════
    private fun pe1() = base(5, "PE1 Checking into a hotel, booking a table", "انگلیسی کاربردی ۱ — پذیرش هتل و رزرو میز",
        listOf("Check into a hotel", "Book a table at a restaurant", "Use the alphabet"),
        listOf(
            v("reception", "پذیرش", "Go to reception.", "به پذیرش برو."),
            v("check in", "پذیرش شدن", "I'd like to check in.", "می‌خواهم پذیرش شوم.", "verb"),
            v("reservation", "رزرو", "I have a reservation.", "رزرو دارم."),
            v("table", "میز", "A table for two?", "میز برای دو نفر؟"),
            v("book", "رزرو کردن", "I'd like to book a table.", "می‌خواهم میز رزرو کنم.", "verb"),
            v("spell", "هجی کردن", "How do you spell it?", "چطور هجی می‌کنی؟", "verb")
        ),
        listOf(
            GrammarSection("Checking in", "I have a reservation. My name is..."),
            GrammarSection("Booking a table", "A table for two, please. At 7 o'clock."),
            GrammarSection("The alphabet", "A /eɪ/, B /biː/, C /siː/, D /diː/, E /iː/...")
        ),
        listOf(
            d("A", "Good evening. Can I help you?", "عصر بخیر. کمکی کنم؟"),
            d("B", "Yes, I have a reservation. Name: Kowalski.", "بله، رزرو دارم. نام: کوالسکی."),
            d("A", "How do you spell that?", "چطور هجی می‌کنید؟"),
            d("B", "K-O-W-A-L-S-K-I.", "ک-و-ا-ل-س-ک-ی."),
            d("A", "Thank you. Room 305. Enjoy your stay!", "ممنون. اتاق ۳۰۵. اقامت خوبی داشته باشید!"),
            d("B", "Thanks. And I'd like to book a table.", "ممنون. و می‌خواهم میز رزرو کنم."),
            d("A", "For how many people?", "برای چند نفر؟"),
            d("B", "For two. At 8 o'clock.", "برای دو نفر. ساعت ۸."),
            d("A", "Perfect. See you at 8.", "عالی. ساعت ۸ می‌بینمتان."),
            d("B", "Thank you!", "ممنون!")
        ),
        listOf(
            q("What room is the guest in?", listOf("305", "350", "503"), 0),
            q("What time is the table?", listOf("7 o'clock", "8 o'clock", "9 o'clock"), 1),
            q("I have a ___.", listOf("reservation", "reserve", "reserving"), 0),
            q("How do you ___ it?", listOf("spell", "spelling", "spelt"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Enjoy your stay", "اقامت خوبی داشته باشید", "Enjoy your stay!", "اقامت خوبی داشته باشید!"),
            IdiomExpression("Can I help you?", "کمکی کنم؟", "Can I help you?", "کمکی کنم؟")
        ),
        pron = listOf(PronunciationTip("Alphabet", "A /eɪ/, E /iː/, I /aɪ/, O /oʊ/, U /juː/")),
        cult = listOf(CulturalNote("Hotel check-in", "ID needed in most countries.")),
        mis = listOf(CommonMistake("I have reservation.", "I have a reservation.", "Add 'a'."))
    )

    // ═══════════ REVIEW 1&2 ═══════════
    private fun rc12() = base(6, "R&C 1&2", "مرور ۱ و ۲",
        listOf("Review verb be (all forms)", "Review Wh- questions", "Review numbers"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do the exercises.", "تمرین‌ها را انجام بده."),
            v("practice", "تمرین", "Practice every day.", "هر روز تمرین کن.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات را درست کن."),
            v("grammar", "گرامر", "Grammar is important.", "گرامر مهم است."),
            v("vocabulary", "واژگان", "New vocabulary.", "واژگان جدید.")
        ),
        listOf(
            GrammarSection("Verb be review", "I am, you are, he/she/it is, we/you/they are."),
            GrammarSection("Questions", "What/Where/Who/How + be."),
            GrammarSection("Numbers review", "0-100.")
        ),
        listOf(
            d("T", "Let's review Files 1 and 2.", "بیایید فایل‌های ۱ و ۲ را مرور کنیم."),
            d("A", "Verb be! I am, you are, he is...", "فعل be! I am، you are، he is..."),
            d("B", "And questions: Where are you from?", "و سوالات: Where are you from?"),
            d("T", "What about numbers?", "اعداد چطور؟"),
            d("A", "One, two... one hundred.", "یک، دو... صد."),
            d("T", "Spelling?", "هجی کردن؟"),
            d("B", "A, B, C, D, E...", "A، B، C، D، E..."),
            d("T", "Excellent! Ready for File 3?", "عالی! برای فایل ۳ آماده‌اید؟"),
            d("A", "Yes! Let's continue.", "بله! بیایید ادامه دهیم."),
            d("T", "Great job!", "آفرین!")
        ),
        listOf(
            q("Which be with 'they'?", listOf("am", "is", "are"), 2),
            q("___ are you from?", listOf("What", "Where", "Who"), 1),
            q("How ___ are you?", listOf("old", "many", "much"), 0),
            q("___ is he from?", listOf("What", "Where", "Who"), 1)
        ),
        idioms = listOf(IdiomExpression("Let's continue", "بیایید ادامه دهیم", "Let's continue.", "بیایید ادامه دهیم.")),
        pron = listOf(PronunciationTip("Intonation", "Wh- questions fall, yes/no questions rise.")),
        cult = listOf(CulturalNote("Review", "Regular practice helps.")),
        mis = listOf(CommonMistake("They is happy.", "They are happy.", "Use 'are'."))
    )

    // ═══════════ FILE 3 ═══════════
    private fun f3A() = base(7, "3A Where are my keys?", "۳A کلیدهایم کجاست؟",
        listOf("Use a/an", "Use singular and plural nouns", "Talk about small things"),
        listOf(
            v("keys", "کلیدها", "Where are my keys?", "کلیدهام کجاست؟"),
            v("phone", "موبایل", "My phone is new.", "موبایلم جدید است."),
            v("book", "کتاب", "A good book.", "کتاب خوب."),
            v("watch", "ساعت", "A nice watch.", "ساعت قشنگ."),
            v("bag", "کیف", "In my bag.", "در کیسم."),
            v("umbrella", "چتر", "An umbrella.", "یک چتر.")
        ),
        listOf(
            GrammarSection("a / an", "a before consonants: a book. an before vowels: an umbrella."),
            GrammarSection("Singular and plural", "book → books, watch → watches, key → keys.")
        ),
        listOf(
            d("A", "Where are my keys?", "کلیدهام کجاست؟"),
            d("B", "Are they in your bag?", "در کیفت هستن؟"),
            d("A", "No, they aren't.", "نه، نیستن."),
            d("B", "Are they on the table?", "روی میز هستن؟"),
            d("A", "No. Oh, here they are! On the sofa.", "نه. اوه، ایناهاشون! روی کاناپه."),
            d("B", "Good. What's this?", "خوبه. این چیه؟"),
            d("A", "It's an umbrella.", "این یک چتره."),
            d("B", "And this is a book and a phone.", "و این یک کتاب و یک موبایله."),
            d("A", "You have many things!", "چیزهای زیادی داری!"),
            d("B", "Yes, my bag is full!", "بله، کیسم پره!")
        ),
        listOf(
            q("Where are the keys?", listOf("in the bag", "on the sofa", "on the table"), 1),
            q("What's in the bag?", listOf("an umbrella and book", "a cat", "nothing"), 0),
            q("It's ___ umbrella.", listOf("a", "an", "the"), 1),
            q("I have two ___.", listOf("watch", "watchs", "watches"), 2)
        ),
        idioms = listOf(IdiomExpression("Here they are", "ایناهاشون", "Here they are!", "ایناهاشون!")),
        pron = listOf(PronunciationTip("Plural -s", "/s/ books, /z/ keys, /ɪz/ watches")),
        cult = listOf(CulturalNote("Small things", "Common everyday objects.")),
        mis = listOf(CommonMistake("a umbrella", "an umbrella", "Use 'an' before vowels."))
    )

    private fun f3B() = base(8, "3B Souvenirs", "۳B سوغات",
        listOf("Use this/that/these/those", "Talk about souvenirs", "Ask yes/no questions"),
        listOf(
            v("souvenir", "سوغات", "A nice souvenir.", "سوغات قشنگ."),
            v("this", "این", "This is my bag.", "این کیف منه."),
            v("that", "آن", "That's your phone.", "آن موبایله."),
            v("these", "این‌ها", "These are my keys.", "این‌ها کلیدهام هستن."),
            v("those", "آن‌ها", "Those are your books.", "آن‌ها کتاب‌هات هستن."),
            v("gift", "هدیه", "A gift for my family.", "هدیه‌ای برای خانواده‌ام.")
        ),
        listOf(
            GrammarSection("this / that / these / those", "this (near, sing.), that (far, sing.), these (near, pl.), those (far, pl.)."),
            GrammarSection("Yes/No questions", "Is this your bag? Are these your keys?")
        ),
        listOf(
            d("A", "Is this a souvenir?", "این سوغاته؟"),
            d("B", "Yes, it is. A gift for my family.", "بله. هدیه‌ای برای خانواده‌ام."),
            d("A", "And are these your keys?", "و این‌ها کلیدهایت هستن؟"),
            d("B", "No, they aren't. They're my sister's.", "نه، نیستن. مال خواهرمه."),
            d("A", "Is this your jacket?", "این کاپشنت هست؟"),
            d("B", "Yes. Nice, right?", "بله. قشنگه، نه؟"),
            d("A", "Very nice! And those books?", "خیلی قشنگ! و اون کتاب‌ها؟"),
            d("B", "Those are my books.", "اون‌ها کتاب‌هام هستن."),
            d("A", "You have many souvenirs!", "سوغات زیادی داری!"),
            d("B", "Yes! I love shopping!", "بله! عاشق خریدم!")
        ),
        listOf(
            q("Is this a souvenir?", listOf("no", "yes", "maybe"), 1),
            q("Whose keys are they?", listOf("his", "sister's", "mother's"), 1),
            q("___ is my bag. (near)", listOf("This", "That", "Those"), 0),
            q("___ are my keys. (near, plural)", listOf("This", "These", "That"), 1)
        ),
        idioms = listOf(IdiomExpression("Nice, right?", "قشنگه، نه؟", "Nice, right?", "قشنگه، نه؟")),
        pron = listOf(PronunciationTip("this / that", "/ðɪs/ vs /ðæt/")),
        cult = listOf(CulturalNote("Souvenirs", "Travel gifts for family.")),
        mis = listOf(CommonMistake("This are my keys.", "These are my keys.", "Use 'these' for plural."))
    )

    // ═══════════ FILE 4 ═══════════
    private fun f4A() = base(9, "4A Meet the family", "۴A با خانواده آشنا شو",
        listOf("Use possessive adjectives", "Use possessive 's", "Talk about family"),
        listOf(
            v("family", "خانواده", "My family is big.", "خانواده‌ام بزرگه."),
            v("mother", "مادر", "My mother is a teacher.", "مادرم معلمه."),
            v("father", "پدر", "His father is a doctor.", "پدرش دکتره."),
            v("brother", "برادر", "I have two brothers.", "دو برادر دارم."),
            v("sister", "خواهر", "Her sister is nice.", "خواهرش خوبه."),
            v("parents", "والدین", "My parents live in London.", "والدینم در لندن زندگی می‌کنند.")
        ),
        listOf(
            GrammarSection("Possessive adjectives", "my, your, his, her, our, their. My mother, his father."),
            GrammarSection("Possessive 's", "Tom's father, my sister's car.")
        ),
        listOf(
            d("A", "Tell me about your family.", "از خانواده‌ات بگو."),
            d("B", "I have two brothers and one sister.", "دو برادر و یک خواهر دارم."),
            d("A", "What do your parents do?", "والدینت چیکار می‌کنند؟"),
            d("B", "My mother is a teacher. My father is a doctor.", "مادرم معلمه. پدرم دکتره."),
            d("A", "And your sister?", "و خواهرت؟"),
            d("B", "She's a student. Her name is Emma.", "او دانشجوست. اسمش اِماست."),
            d("A", "Is this her book?", "این کتابشه؟"),
            d("B", "Yes, it's Emma's book.", "بله، کتابِ اِماست."),
            d("A", "Nice family!", "خانواده خوبی!"),
            d("B", "Thanks!", "ممنون!")
        ),
        listOf(
            q("How many brothers?", listOf("one", "two", "three"), 1),
            q("What's his mother's job?", listOf("doctor", "teacher", "nurse"), 1),
            q("___ mother is a teacher.", listOf("My", "I", "Me"), 0),
            q("This is ___ book. (Tom)", listOf("Toms", "Tom's", "Toms'"), 1)
        ),
        idioms = listOf(IdiomExpression("Tell me about", "از...بگو", "Tell me about your family.", "از خانواده‌ات بگو.")),
        pron = listOf(PronunciationTip("Possessive 's", "/s/, /z/, /ɪz/")),
        cult = listOf(CulturalNote("Family", "Family structures vary.")),
        mis = listOf(CommonMistake("She have a sister.", "She has a sister.", "Use 'has' with she."))
    )

    private fun f4B() = base(10, "4B The perfect car", "۴B ماشین عالی",
        listOf("Use adjectives", "Talk about colours", "Describe things"),
        listOf(
            v("car", "ماشین", "A perfect car.", "ماشین عالی."),
            v("perfect", "عالی", "Perfect!", "عالی!", "adjective"),
            v("red", "قرمز", "A red bag.", "کیف قرمز.", "adjective"),
            v("blue", "آبی", "A blue phone.", "موبایل آبی.", "adjective"),
            v("black", "مشکی", "A black watch.", "ساعت مشکی.", "adjective"),
            v("white", "سفید", "A white dress.", "لباس سفید.", "adjective")
        ),
        listOf(
            GrammarSection("Adjectives + nouns", "Adjective before noun: a red car, a blue phone."),
            GrammarSection("Colours", "red, blue, green, black, white, yellow, orange, brown, grey, pink.")
        ),
        listOf(
            d("A", "That's a cool car!", "اون ماشین باحالیه!"),
            d("B", "Yes, it's a red sports car.", "بله، یک ماشین اسپرت قرمزه."),
            d("A", "Is it fast?", "سریعه؟"),
            d("B", "Very fast! And very expensive.", "خیلی سریع! و خیلی گرون."),
            d("A", "What color is your car?", "ماشین تو چه رنگیه؟"),
            d("B", "It's blue. A small blue car.", "آبیه. یک ماشین کوچک آبی."),
            d("A", "Nice. I like blue.", "خوبه. من آبی دوست دارم."),
            d("B", "Me too. Blue is my favorite color.", "من هم. آبی رنگ مورد علاقه‌امه."),
            d("A", "And white is my favorite.", "و سفید رنگ مورد علاقه منه."),
            d("B", "White is elegant!", "سفید شیکه!")
        ),
        listOf(
            q("What colour is B's car?", listOf("red", "blue", "white"), 1),
            q("What's B's favourite colour?", listOf("red", "blue", "white"), 1),
            q("It's ___ red car.", listOf("a", "an", "the"), 0),
            q("What colour ___ your car?", listOf("is", "are", "am"), 0)
        ),
        idioms = listOf(IdiomExpression("Cool car", "ماشین باحال", "That's a cool car!", "اون ماشین باحالیه!")),
        pron = listOf(PronunciationTip("Colours", "RED /red/, BLUE /bluː/")),
        cult = listOf(CulturalNote("Colours", "Meanings vary by culture.")),
        mis = listOf(CommonMistake("a car red", "a red car", "Adjective before noun."))
    )

    // ═══════════ PRACTICAL ENGLISH 2 ═══════════
    private fun pe2() = base(11, "PE2 Understanding prices, buying lunch", "انگلیسی کاربردی ۲ — فهمیدن قیمت‌ها، خرید ناهار",
        listOf("Understand prices", "Buy lunch", "Use polite requests"),
        listOf(
            v("price", "قیمت", "What's the price?", "قیمتش چقدره؟"),
            v("how much", "چقدر", "How much is it?", "چقدره؟", "adverb"),
            v("sandwich", "ساندویچ", "A sandwich, please.", "یک ساندویچ، لطفاً."),
            v("water", "آب", "A bottle of water.", "یک بطری آب."),
            v("cheap", "ارزان", "Very cheap.", "خیلی ارزان.", "adjective"),
            v("expensive", "گران", "Too expensive.", "خیلی گران.", "adjective")
        ),
        listOf(
            GrammarSection("How much...?", "How much is it? How much are they?"),
            GrammarSection("Buying food", "I'd like... A sandwich, please. Here you are.")
        ),
        listOf(
            d("A", "Can I help you?", "کمکی کنم؟"),
            d("B", "Yes, a sandwich, please.", "بله، یک ساندویچ، لطفاً."),
            d("A", "Chicken or cheese?", "مرغ یا پنیر؟"),
            d("B", "Chicken, please. And a bottle of water.", "مرغ، لطفاً. و یک بطری آب."),
            d("A", "Anything else?", "چیز دیگری؟"),
            d("B", "No, thanks. How much is it?", "نه، ممنون. چقدره؟"),
            d("A", "That's $8.50.", "۸.۵۰ دلار."),
            d("B", "Here you are.", "بفرمایید."),
            d("A", "Thank you. Enjoy your lunch!", "ممنون. از ناهارت لذت ببر!"),
            d("B", "Thanks!", "ممنون!")
        ),
        listOf(
            q("What does B order?", listOf("cheese", "chicken sandwich", "salad"), 1),
            q("How much is it?", listOf("$5", "$8.50", "$10"), 1),
            q("___ much is it?", listOf("What", "How", "Who"), 1),
            q("A sandwich, ___.", listOf("please", "thanks", "hello"), 0)
        ),
        idioms = listOf(IdiomExpression("Anything else?", "چیز دیگری؟", "Anything else?", "چیز دیگری؟")),
        pron = listOf(PronunciationTip("Prices", "$8.50 = eight fifty")),
        cult = listOf(CulturalNote("Lunch", "Quick meal common in many countries.")),
        mis = listOf(CommonMistake("How much it is?", "How much is it?", "Verb before subject."))
    )

    // ═══════════ REVIEW 3&4 ═══════════
    private fun rc34() = base(12, "R&C 3&4", "مرور ۳ و ۴",
        listOf("Review a/an", "Review this/that/these/those", "Review possessives"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do the exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("a/an review", "a book, an umbrella."),
            GrammarSection("this/that/these/those review", "Near/far, singular/plural."),
            GrammarSection("Possessive adjectives and 's", "my, your, his, her. Tom's car.")
        ),
        listOf(
            d("T", "Review time! Files 3 and 4.", "وقت مرور! فایل‌های ۳ و ۴."),
            d("A", "a book, an umbrella.", "a book، an umbrella."),
            d("B", "this, that, these, those.", "this، that، these، those."),
            d("T", "Possessives?", "ملکی‌ها؟"),
            d("A", "My, your, his, her. Tom's car.", "My، your، his، her. Tom's car."),
            d("T", "Excellent!", "عالی!"),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("a or an before 'umbrella'?", listOf("a", "an", "the"), 1),
            q("Plural of 'watch'?", listOf("watchs", "watches", "watchies"), 1),
            q("___ is my bag. (near)", listOf("This", "That", "Those"), 0),
            q("___ are your keys. (far)", listOf("This", "These", "Those"), 2)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Plural endings", "/s/, /z/, /ɪz/")),
        cult = listOf(CulturalNote("Review", "Important for progress.")),
        mis = listOf(CommonMistake("This are keys.", "These are keys.", "Use 'these' for plural."))
    )

    // ═══════════ FILE 5 ═══════════
    private fun f5A() = base(13, "5A A big breakfast?", "۵A یک صبحانه بزرگ؟",
        listOf("Use present simple (+, -) with I, you, we, they", "Talk about food and drink", "Talk about meals"),
        listOf(
            v("breakfast", "صبحانه", "A big breakfast?", "صبحانه بزرگ؟"),
            v("food", "غذا", "I love food.", "عاشق غذا هستم."),
            v("drink", "نوشیدنی", "A cold drink.", "نوشیدنی سرد."),
            v("bread", "نان", "I eat bread.", "نان می‌خورم."),
            v("eggs", "تخم‌مرغ", "Two eggs.", "دو تخم‌مرغ."),
            v("tea", "چای", "A cup of tea.", "یک فنجان چای.")
        ),
        listOf(
            GrammarSection("Present simple (+) I/you/we/they", "I eat, you drink, we like, they have."),
            GrammarSection("Present simple (-) I/you/we/they", "I don't eat, you don't drink.")
        ),
        listOf(
            d("A", "A big breakfast?", "صبحانه بزرگ؟"),
            d("B", "Yes! I eat eggs and bread.", "بله! تخم‌مرغ و نان می‌خورم."),
            d("A", "I don't eat breakfast.", "من صبحانه نمی‌خورم."),
            d("B", "Really? Not healthy!", "واقعاً؟ سالم نیست!"),
            d("A", "I know. I just drink coffee.", "می‌دانم. فقط قهوه می‌نوشم."),
            d("B", "I don't drink coffee. I drink tea.", "من قهوه نمی‌نوشم. چای می‌نوشم."),
            d("A", "We're very different!", "ما خیلی متفاوتیم!"),
            d("B", "Yes, we are. What about lunch?", "بله. ناهار چطور؟"),
            d("A", "I eat lunch at 1. A sandwich.", "ساعت ۱ ناهار می‌خورم. ساندویچ."),
            d("B", "I eat at 12. Rice and chicken.", "من ساعت ۱۲ می‌خورم. برنج و مرغ.")
        ),
        listOf(
            q("What does B eat for breakfast?", listOf("cereal", "eggs and bread", "fruit"), 1),
            q("What does A drink?", listOf("tea", "coffee", "water"), 1),
            q("I ___ breakfast.", listOf("don't eat", "not eat", "no eat"), 0),
            q("They ___ tea.", listOf("drink", "drinks", "drinking"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Big breakfast", "صبحانه بزرگ", "A big breakfast!", "صبحانه بزرگ!"),
            IdiomExpression("Not healthy", "سالم نیست", "Not healthy!", "سالم نیست!")
        ),
        pron = listOf(PronunciationTip("do you", "Weak: /də jə/")),
        cult = listOf(CulturalNote("Breakfast", "Differs by country.")),
        mis = listOf(CommonMistake("I no eat.", "I don't eat.", "Use don't."))
    )

    private fun f5B() = base(14, "5B A very long flight", "۵B یک پرواز خیلی طولانی",
        listOf("Use present simple (?) with I, you, we, they", "Use common verb phrases", "Talk about routine"),
        listOf(
            v("flight", "پرواز", "A long flight.", "پرواز طولانی."),
            v("get up", "بیدار شدن", "I get up at 7.", "ساعت ۷ بیدار می‌شم.", "verb"),
            v("go", "رفتن", "We go to work.", "به سر کار می‌ریم.", "verb"),
            v("have", "داشتن", "I have a shower.", "دوش می‌گیرم.", "verb"),
            v("live", "زندگی کردن", "They live in Tokyo.", "در توکیو زندگی می‌کنند.", "verb"),
            v("like", "دوست داشتن", "Do you like it?", "دوستش داری؟", "verb")
        ),
        listOf(
            GrammarSection("Present simple (?) I/you/we/they", "Do you live here? Do they work here?"),
            GrammarSection("Short answers", "Yes, I do. / No, I don't.")
        ),
        listOf(
            d("A", "Do you travel a lot?", "زیاد سفر می‌کنی؟"),
            d("B", "Yes, I do. I'm a pilot.", "بله. من خلبانم."),
            d("A", "Wow! Do you like your job?", "واو! شغلت رو دوست داری؟"),
            d("B", "I love it. But the flights are long.", "عاشقشم. ولی پروازها طولانی‌ان."),
            d("A", "Do you sleep on the plane?", "در هواپیما می‌خوابی؟"),
            d("B", "No, I don't. I work!", "نه. کار می‌کنم!"),
            d("A", "Do you have time for your family?", "برای خانواده‌ات وقت داری؟"),
            d("B", "Yes, I do. I have four days free.", "بله. چهار روز آزاد دارم."),
            d("A", "That's good. Do you like London?", "خوبه. لندن رو دوست داری؟"),
            d("B", "Yes, I do. I come here every month.", "بله. هر ماه میام اینجا.")
        ),
        listOf(
            q("What does B do?", listOf("teacher", "pilot", "doctor"), 1),
            q("How many free days?", listOf("two", "three", "four"), 2),
            q("___ you live here?", listOf("Do", "Does", "Are"), 0),
            q("___ they work here?", listOf("Do", "Does", "Are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Travel a lot", "زیاد سفر کردن", "Do you travel a lot?", "زیاد سفر می‌کنی؟"),
            IdiomExpression("Time for family", "وقت برای خانواده", "Time for family.", "وقت برای خانواده.")
        ),
        pron = listOf(PronunciationTip("Do questions", "Do you /də jə/")),
        cult = listOf(CulturalNote("Pilots", "Long flights require rest.")),
        mis = listOf(CommonMistake("Do you lives here?", "Do you live here?", "Base verb after do."))
    )

    // ═══════════ FILE 6 ═══════════
    private fun f6A() = base(15, "6A A school reunion", "۶A یک دیدار مدرسه",
        listOf("Use present simple (he, she, it)", "Talk about jobs and places of work", "Use third person -s"),
        listOf(
            v("school", "مدرسه", "A school reunion.", "دیدار مدرسه."),
            v("job", "شغل", "What's his job?", "شغلش چیه؟"),
            v("teacher", "معلم", "She's a teacher.", "او معلمه."),
            v("nurse", "پرستار", "He's a nurse.", "او پرستاره."),
            v("work", "کار کردن", "She works in a hospital.", "او در بیمارستان کار می‌کند.", "verb"),
            v("office", "دفتر", "In an office.", "در دفتر.")
        ),
        listOf(
            GrammarSection("Present simple: he, she, it", "Add -s or -es: He works, she teaches, it rains."),
            GrammarSection("Third person -s", "work → works, teach → teaches, go → goes.")
        ),
        listOf(
            d("A", "It's a school reunion!", "دیدار مدرسه‌ست!"),
            d("B", "Yes! Long time no see.", "بله! خیلی وقت است ندیدم."),
            d("A", "What does your brother do?", "برادرت چیکار می‌کنه؟"),
            d("B", "He works in a hospital. He's a nurse.", "در بیمارستان کار می‌کند. پرستاره."),
            d("A", "Does he like his job?", "شغلش رو دوست داره؟"),
            d("B", "Yes, he loves it.", "بله، عاشقشه."),
            d("A", "And your sister?", "و خواهرت؟"),
            d("B", "She teaches English at a school.", "او در مدرسه انگلیسی درس می‌دهد."),
            d("A", "Does she speak English at work?", "سر کار انگلیسی صحبت می‌کند؟"),
            d("B", "Yes, every day!", "بله، هر روز!")
        ),
        listOf(
            q("What does B's brother do?", listOf("doctor", "nurse", "teacher"), 1),
            q("What does B's sister do?", listOf("nurse", "teacher", "doctor"), 1),
            q("He ___ in a hospital.", listOf("work", "works", "working"), 1),
            q("She ___ English.", listOf("speak", "speaks", "speaking"), 1)
        ),
        idioms = listOf(IdiomExpression("Long time no see", "خیلی وقت است ندیدم", "Long time no see!", "خیلی وقت است ندیدم!")),
        pron = listOf(PronunciationTip("Third -s", "works /wɜːrks/, teaches /ˈtiːtʃɪz/")),
        cult = listOf(CulturalNote("School reunions", "Common in many countries.")),
        mis = listOf(CommonMistake("He work in a hospital.", "He works in a hospital.", "Add -s."))
    )

    private fun f6B() = base(16, "6B Good morning, goodnight", "۶B صبح بخیر، شب بخیر",
        listOf("Use adverbs of frequency", "Talk about a typical day", "Talk about routines"),
        listOf(
            v("always", "همیشه", "I always get up early.", "همیشه زود بیدار می‌شم.", "adverb"),
            v("usually", "معمولاً", "I usually drink coffee.", "معمولاً قهوه می‌نوشم.", "adverb"),
            v("sometimes", "گاهی", "Sometimes I read.", "گاهی می‌خوانم.", "adverb"),
            v("never", "هرگز", "I never drink tea.", "هرگز چای نمی‌نوشم.", "adverb"),
            v("typical day", "روز معمولی", "A typical day.", "یک روز معمولی."),
            v("goodnight", "شب بخیر", "Goodnight!", "شب بخیر!", "interjection")
        ),
        listOf(
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, never — before main verb."),
            GrammarSection("Talking about routine", "I get up at 7. She has breakfast at 8.")
        ),
        listOf(
            d("A", "What's a typical day for you?", "یک روز معمولی برایت چطوره؟"),
            d("B", "I always get up at 6:30.", "همیشه ۶:۳۰ بیدار می‌شم."),
            d("A", "That's early!", "زوده!"),
            d("B", "Yes. I usually go running.", "بله. معمولاً می‌رم بدوم."),
            d("A", "What about breakfast?", "صبحانه چطور؟"),
            d("B", "I sometimes have eggs and tea.", "گاهی تخم‌مرغ و چای می‌خورم."),
            d("A", "And in the evening?", "و عصرها؟"),
            d("B", "I never work late. I go home at 5.", "هرگز دیر کار نمی‌کنم. ساعت ۵ به خانه می‌روم."),
            d("A", "Nice. Goodnight!", "خوبه. شب بخیر!"),
            d("B", "Goodnight!", "شب بخیر!")
        ),
        listOf(
            q("When does B get up?", listOf("6:00", "6:30", "7:00"), 1),
            q("Does B work late?", listOf("always", "usually", "never"), 2),
            q("I ___ get up early.", listOf("usual", "usually", "usualy"), 1),
            q("She ___ eats breakfast.", listOf("never", "not", "no"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Typical day", "روز معمولی", "A typical day.", "یک روز معمولی."),
            IdiomExpression("Work late", "دیر کار کردن", "I never work late.", "هرگز دیر کار نمی‌کنم.")
        ),
        pron = listOf(PronunciationTip("Frequency stress", "ALways, USually, NEver")),
        cult = listOf(CulturalNote("Routine", "Differs by person and culture.")),
        mis = listOf(CommonMistake("I drink always coffee.", "I always drink coffee.", "Before main verb."))
    )

    // ═══════════ PRACTICAL ENGLISH 3 ═══════════
    private fun pe3() = base(17, "PE3 Telling the time, saying how you feel", "انگلیسی کاربردی ۳ — گفتن ساعت، احوال‌پرسی",
        listOf("Tell the time", "Ask about how people feel", "Use time expressions"),
        listOf(
            v("time", "زمان", "What time is it?", "ساعت چنده؟"),
            v("o'clock", "ساعت", "At 7 o'clock.", "ساعت ۷."),
            v("half past", "نیم ساعت بعد", "Half past 8.", "ساعت ۸:۳۰."),
            v("quarter to", "ربع به", "Quarter to 10.", "ساعت ۹:۴۵."),
            v("tired", "خسته", "I'm tired.", "خسته‌ام.", "adjective"),
            v("hungry", "گرسنه", "I'm hungry.", "گرسنه‌ام.", "adjective")
        ),
        listOf(
            GrammarSection("Telling the time", "It's 7 o'clock. It's half past 8. It's quarter to 9."),
            GrammarSection("Feelings", "I'm tired. I'm hungry. I'm thirsty. I'm fine.")
        ),
        listOf(
            d("A", "Excuse me, what time is it?", "ببخشید، ساعت چنده؟"),
            d("B", "It's half past 3.", "ساعت ۳:۳۰."),
            d("A", "Thanks. Are you OK?", "ممنون. خوبی؟"),
            d("B", "I'm tired and hungry.", "خسته و گرسنه‌ام."),
            d("A", "Me too. Let's get something to eat.", "من هم. بیا چیزی بخوریم."),
            d("B", "Good idea. It's quarter to 4.", "فکر خوبی. ساعت ۳:۴۵ است."),
            d("A", "The cafe closes at 5.", "کافه ساعت ۵ بسته می‌شه."),
            d("B", "Perfect. Let's go!", "عالی. بریم!"),
            d("A", "How do you feel now?", "الان چه حسی داری؟"),
            d("B", "Better, thanks!", "بهترم، ممنون!")
        ),
        listOf(
            q("What time is it?", listOf("3:00", "3:30", "4:00"), 1),
            q("How does B feel?", listOf("fine", "tired & hungry", "thirsty"), 1),
            q("It's ___ past 3.", listOf("half", "quarter", "o'clock"), 0),
            q("I'm ___.", listOf("tired", "tire", "tiring"), 0)
        ),
        idioms = listOf(IdiomExpression("Good idea", "فکر خوبی", "Good idea.", "فکر خوبی.")),
        pron = listOf(PronunciationTip("Time", "3:15 = quarter past three")),
        cult = listOf(CulturalNote("Time", "Being on time varies by culture.")),
        mis = listOf(CommonMistake("It's 3 hours 30.", "It's half past 3.", "Use time expressions."))
    )

    // ═══════════ REVIEW 5&6 ═══════════
    private fun rc56() = base(18, "R&C 5&6", "مرور ۵ و ۶",
        listOf("Review present simple", "Review adverbs of frequency", "Review time"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present simple review", "I work, he works. Do you work? Does she work?"),
            GrammarSection("Adverbs of frequency", "always, usually, sometimes, never."),
            GrammarSection("Telling the time", "at 7, half past 8, quarter to 9.")
        ),
        listOf(
            d("T", "Review time! Files 5 and 6.", "وقت مرور! فایل‌های ۵ و ۶."),
            d("A", "Present simple. I work, she works.", "حال ساده. I work، she works."),
            d("B", "Always, usually, sometimes, never.", "Always، usually، sometimes، never."),
            d("T", "Time?", "زمان؟"),
            d("A", "Half past 8, quarter to 9.", "Half past 8، quarter to 9."),
            d("T", "Excellent!", "عالی!"),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("She ___ English.", listOf("speak", "speaks", "speaking"), 1),
            q("I ___ drink tea.", listOf("never", "not", "no"), 0),
            q("It's ___ past 3.", listOf("half", "quarter", "o'clock"), 0),
            q("___ you work here?", listOf("Do", "Does", "Are"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Third -s", "/s/, /z/, /ɪz/")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("She speak English.", "She speaks English.", "Add -s."))
    )

    // ═══════════ FILE 7 ═══════════
    private fun f7A() = base(19, "7A Have a nice weekend!", "۷A آخر هفته خوبی داشته باشی!",
        listOf("Use word order in questions", "Talk about free time", "Use common verb phrases"),
        listOf(
            v("weekend", "آخر هفته", "Have a nice weekend!", "آخر هفته خوبی داشته باش!"),
            v("free time", "وقت آزاد", "In my free time.", "در وقت آزادم."),
            v("go out", "بیرون رفتن", "I go out on Saturdays.", "شنبه‌ها بیرون می‌روم.", "verb"),
            v("watch", "تماشا کردن", "I watch TV.", "تلویزیون تماشا می‌کنم.", "verb"),
            v("play", "بازی کردن", "Play football.", "فوتبال بازی کن.", "verb"),
            v("read", "خواندن", "I read books.", "کتاب می‌خوانم.", "verb")
        ),
        listOf(
            GrammarSection("Word order in questions", "What do you do in your free time? Where do you go?"),
            GrammarSection("Common verb phrases", "go out, watch TV, play football, read books.")
        ),
        listOf(
            d("A", "What do you do in your free time?", "در وقت آزادت چیکار می‌کنی؟"),
            d("B", "I usually go out with friends.", "معمولاً با دوستان بیرون می‌روم."),
            d("A", "Where do you go?", "کجا می‌روید؟"),
            d("B", "We go to the cinema or a cafe.", "به سینما یا کافه می‌رویم."),
            d("A", "Do you play sports?", "ورزش می‌کنی؟"),
            d("B", "Yes, I play football on Sundays.", "بله، یکشنبه‌ها فوتبال بازی می‌کنم."),
            d("A", "Nice! What about weekdays?", "خوبه! روزهای هفته چطور؟"),
            d("B", "I watch TV or read.", "تلویزیون تماشا می‌کنم یا می‌خوانم."),
            d("A", "Have a nice weekend!", "آخر هفته خوبی داشته باشی!"),
            d("B", "Thanks! You too!", "ممنون! تو هم!")
        ),
        listOf(
            q("What does B do on Sundays?", listOf("reads", "plays football", "goes to cinema"), 1),
            q("What does B do on weekdays?", listOf("goes out", "TV or reading", "plays sports"), 1),
            q("What ___ you do in free time?", listOf("do", "does", "are"), 0),
            q("Where ___ you go?", listOf("do", "does", "are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Have a nice weekend", "آخر هفته خوبی داشته باشی", "Have a nice weekend!", "آخر هفته خوبی داشته باشی!"),
            IdiomExpression("You too", "تو هم", "You too!", "تو هم!")
        ),
        pron = listOf(PronunciationTip("Word order", "What DO you DO?")),
        cult = listOf(CulturalNote("Weekend activities", "Vary by person.")),
        mis = listOf(CommonMistake("What you do?", "What do you do?", "Use 'do'."))
    )

    private fun f7B() = base(20, "7B Lights, camera, action!", "۷B چراغ‌ها، دوربین، حرکت!",
        listOf("Use imperatives", "Use object pronouns", "Talk about films"),
        listOf(
            v("film", "فیلم", "A great film.", "فیلم عالی."),
            v("comedy", "کمدی", "A comedy.", "یک کمدی."),
            v("action", "اکشن", "An action film.", "فیلم اکشن."),
            v("watch", "تماشا کردن", "Watch the film.", "فیلم را تماشا کن.", "verb"),
            v("buy", "خریدن", "Buy a ticket.", "بلیت بخر.", "verb"),
            v("sit down", "نشستن", "Sit down, please.", "لطفاً بنشین.", "verb")
        ),
        listOf(
            GrammarSection("Imperatives", "Watch the film. Don't talk. Sit down."),
            GrammarSection("Object pronouns", "me, you, him, her, it, us, them. Watch it. Help me.")
        ),
        listOf(
            d("A", "What's your favourite film?", "فیلم مورد علاقه‌ات چیه؟"),
            d("B", "I love comedies. They make me laugh.", "عاشق کمدی‌هام. باعث می‌شن بخندم."),
            d("A", "Me too. I don't like action films.", "من هم. فیلم‌های اکشن دوست ندارم."),
            d("B", "Really? My brother loves them.", "واقعاً؟ برادرم عاشقشونه."),
            d("A", "Let's watch a comedy tonight.", "بیا امشب یک کمدی ببینیم."),
            d("B", "Good idea. Buy the tickets online.", "فکر خوبی. بلیت‌ها را آنلاین بخر."),
            d("A", "Which film?", "کدام فیلم؟"),
            d("B", "The new one. With Tom Hanks.", "جدیدش. با تام هنکس."),
            d("A", "Perfect. Don't be late!", "عالی. دیر نکن!"),
            d("B", "I won't. See you at 7!", "نمی‌کنم. ساعت ۷ می‌بینمت!")
        ),
        listOf(
            q("What does B love?", listOf("action", "comedies", "horror"), 1),
            q("Who loves action films?", listOf("A", "B's brother", "B"), 1),
            q("___ the tickets.", listOf("Buy", "Buying", "Bought"), 0),
            q("Watch ___. (the film)", listOf("it", "him", "her"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Make me laugh", "باعث خندیدنم شدن", "They make me laugh.", "باعث می‌شن بخندم."),
            IdiomExpression("Don't be late", "دیر نکن", "Don't be late!", "دیر نکن!")
        ),
        pron = listOf(PronunciationTip("Imperatives", "Falling intonation: WATCH the film.")),
        cult = listOf(CulturalNote("Films", "Different genres popular worldwide.")),
        mis = listOf(CommonMistake("Watch him the film.", "Watch the film.", "Object pronoun placement."))
    )

    // ═══════════ FILE 8 ═══════════
    private fun f8A() = base(21, "8A Can I park here?", "۸A می‌تونم اینجا پارک کنم؟",
        listOf("Use can/can't", "Talk about permission and ability", "Use more verb phrases"),
        listOf(
            v("can", "توانستن", "I can swim.", "می‌توانم شنا کنم.", "verb"),
            v("can't", "نمی‌تواند", "You can't park here.", "نمی‌تونی اینجا پارک کنی.", "verb"),
            v("park", "پارک کردن", "Can I park here?", "می‌تونم پارک کنم؟", "verb"),
            v("smoke", "سیگار کشیدن", "Don't smoke here.", "اینجا سیگار نکش.", "verb"),
            v("rule", "قانون", "A new rule.", "قانون جدید."),
            v("sign", "تابلو", "Look at the sign.", "به تابلو نگاه کن.")
        ),
        listOf(
            GrammarSection("Can/Can't for ability", "I can swim. She can't drive."),
            GrammarSection("Can/Can't for permission", "Can I park here? You can't smoke here.")
        ),
        listOf(
            d("A", "Can I park here?", "می‌تونم اینجا پارک کنم؟"),
            d("B", "No, you can't. Look at the sign.", "نه، نمی‌تونی. به تابلو نگاه کن."),
            d("A", "Oh, sorry. Where can I park?", "اوه، ببخشید. کجا می‌تونم پارک کنم؟"),
            d("B", "Next to the bank.", "کنار بانک."),
            d("A", "Thanks. Can I smoke here?", "ممنون. می‌تونم اینجا سیگار بکشم؟"),
            d("B", "No! You can't smoke in public places.", "نه! نمی‌تونی در مکان‌های عمومی سیگار بکشی."),
            d("A", "Can I take photos?", "می‌تونم عکس بگیرم؟"),
            d("B", "Yes, you can.", "بله، می‌تونی."),
            d("A", "Great. It's a beautiful place.", "عالی. جای زیباییه."),
            d("B", "Yes, enjoy!", "بله، لذت ببر!")
        ),
        listOf(
            q("Can A park here?", listOf("yes", "no", "maybe"), 1),
            q("Can A smoke?", listOf("yes", "no", "outside"), 1),
            q("You ___ park here.", listOf("can", "can't", "can to"), 1),
            q("___ I take photos?", listOf("Can", "Do", "Am"), 0)
        ),
        idioms = listOf(IdiomExpression("Public places", "مکان‌های عمومی", "In public places.", "در مکان‌های عمومی.")),
        pron = listOf(PronunciationTip("Can/Can't", "can /kæn/, can't /kænt/")),
        cult = listOf(CulturalNote("Rules", "Public places have rules.")),
        mis = listOf(CommonMistake("You no can park.", "You can't park.", "Use can't."))
    )

    private fun f8B() = base(22, "8B I love cooking", "۸B عاشق آشپزی‌ام",
        listOf("Use like/love/hate + verb-ing", "Talk about activities", "Express preferences"),
        listOf(
            v("love", "عاشق بودن", "I love cooking.", "عاشق آشپزی‌ام.", "verb"),
            v("like", "دوست داشتن", "I like reading.", "خواندن دوست دارم.", "verb"),
            v("hate", "متنفر بودن", "I hate running.", "از دویدن متنفرم.", "verb"),
            v("cooking", "آشپزی", "Cooking is fun.", "آشپزی سرگرم‌کننده است."),
            v("reading", "خواندن", "I enjoy reading.", "از خواندن لذت می‌برم."),
            v("activity", "فعالیت", "Free time activities.", "فعالیت‌های وقت آزاد.")
        ),
        listOf(
            GrammarSection("Like/Love/Hate + -ing", "I like swimming. She loves running. They hate losing."),
            GrammarSection("Questions", "Do you like cooking? Does she like reading?")
        ),
        listOf(
            d("A", "Do you like cooking?", "آشپزی دوست داری؟"),
            d("B", "I love it! I cook every day.", "عاشقشم! هر روز آشپزی می‌کنم."),
            d("A", "Nice! What about cleaning?", "خوبه! نظافت چطور؟"),
            d("B", "I hate it. So boring.", "متنفرم. خیلی خسته‌کننده‌ست."),
            d("A", "Me too. Do you like reading?", "من هم. خواندن دوست داری؟"),
            d("B", "Yes, I love reading. And you?", "بله، عاشق خواندنم. تو چطور؟"),
            d("A", "I like it, but I prefer watching films.", "دوست دارم، ولی فیلم دیدن را ترجیح می‌دهم."),
            d("B", "What kind of films?", "چه فیلم‌هایی؟"),
            d("A", "Comedies. I love laughing.", "کمدی. عاشق خندیدنم."),
            d("B", "Me too!", "من هم!")
        ),
        listOf(
            q("Does B like cooking?", listOf("no", "yes", "sometimes"), 1),
            q("What does B hate?", listOf("cooking", "cleaning", "reading"), 1),
            q("I love ___.", listOf("cook", "cooking", "to cook"), 1),
            q("She ___ reading.", listOf("like", "likes", "liking"), 1)
        ),
        idioms = listOf(IdiomExpression("Me too", "من هم", "Me too!", "من هم!")),
        pron = listOf(PronunciationTip("Gerunds", "COOKing, READing, SWIMming")),
        cult = listOf(CulturalNote("Hobbies", "Popular worldwide.")),
        mis = listOf(CommonMistake("I love to cooking.", "I love cooking.", "Use -ing after love."))
    )

    // ═══════════ PRACTICAL ENGLISH 4 ═══════════
    private fun pe4() = base(23, "PE4 Saying the date, talking on the phone", "انگلیسی کاربردی ۴ — گفتن تاریخ، تلفنی صحبت کردن",
        listOf("Say dates", "Talk on the phone", "Use months and ordinal numbers"),
        listOf(
            v("date", "تاریخ", "What's the date?", "تاریخ چیه؟"),
            v("month", "ماه", "Which month?", "کدام ماه؟"),
            v("January", "ژانویه", "In January.", "در ژانویه."),
            v("first", "اول", "The first of May.", "اول مه.", "adjective"),
            v("second", "دوم", "The second of June.", "دوم ژوئن.", "adjective"),
            v("hello", "الو", "Hello?", "الو؟", "interjection")
        ),
        listOf(
            GrammarSection("Dates", "The first of May. May first. On May 1st."),
            GrammarSection("Phone conversations", "Hello? Who's calling? Can I take a message?")
        ),
        listOf(
            d("A", "Hello?", "الو؟"),
            d("B", "Hi, this is Maria. Is Tom there?", "سلام، ماریا هستم. تام هست؟"),
            d("A", "No, sorry. He's out.", "نه، متأسفم. بیرونه."),
            d("B", "OK. When is he back?", "باشه. کی برمی‌گرده؟"),
            d("A", "On the twenty-first of June.", "بیست و یکم ژوئن."),
            d("B", "That's next week!", "هفته بعد!"),
            d("A", "Yes. Can I take a message?", "بله. پیام بگذارم؟"),
            d("B", "Yes, please. Tell him Maria called.", "بله، لطفاً. بگو ماریا زنگ زد."),
            d("A", "Got it. Goodbye!", "فهمیدم. خداحافظ!"),
            d("B", "Goodbye!", "خداحافظ!")
        ),
        listOf(
            q("Who's calling?", listOf("Tom", "Maria", "Anna"), 1),
            q("When is Tom back?", listOf("June 1st", "June 21st", "July 21st"), 1),
            q("It's the ___ of June.", listOf("twenty-one", "twenty-first", "twentieth"), 1),
            q("Can I take a ___?", listOf("message", "call", "phone"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Take a message", "پیام گرفتن", "Can I take a message?", "می‌تونم پیام بگیرم؟"),
            IdiomExpression("Got it", "فهمیدم", "Got it.", "فهمیدم.")
        ),
        pron = listOf(PronunciationTip("Dates", "On the 21st of June")),
        cult = listOf(CulturalNote("Phone etiquette", "Varies by culture.")),
        mis = listOf(CommonMistake("the twenty-one of June", "the twenty-first of June", "Use ordinal."))
    )

    // ═══════════ REVIEW 7&8 ═══════════
    private fun rc78() = base(24, "R&C 7&8", "مرور ۷ و ۸",
        listOf("Review questions", "Review can/can't", "Review like/love/hate"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Question word order", "What do you do? Where do you go?"),
            GrammarSection("Can/Can't", "I can swim. You can't park here."),
            GrammarSection("Like + -ing", "I love cooking. She hates running.")
        ),
        listOf(
            d("T", "Review time! Files 7 and 8.", "وقت مرور! فایل‌های ۷ و ۸."),
            d("A", "What do you do in free time?", "What do you do in free time?"),
            d("B", "I can swim. You can't park here.", "I can swim. You can't park here."),
            d("T", "Like + -ing?", "Like + -ing؟"),
            d("A", "I love cooking. She hates running.", "I love cooking. She hates running."),
            d("T", "Excellent!", "عالی!"),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("What ___ you do?", listOf("do", "does", "are"), 0),
            q("You ___ smoke here.", listOf("can", "can't", "can to"), 1),
            q("I love ___.", listOf("cook", "cooking", "to cook"), 1),
            q("___ I take photos?", listOf("Can", "Do", "Am"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Questions", "Rise at the end.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I love to cook.", "I love cooking.", "Both correct but 'cooking' more common."))
    )

    // ═══════════ FILE 9 ═══════════
    private fun f9A() = base(25, "9A Everything's fine!", "۹A همه چیز خوبه!",
        listOf("Use present continuous", "Talk about actions happening now", "Talk about travelling"),
        listOf(
            v("now", "الان", "I'm working now.", "الان دارم کار می‌کنم.", "adverb"),
            v("doing", "انجام دادن", "What are you doing?", "چیکار می‌کنی؟", "verb"),
            v("reading", "خواندن", "She's reading.", "دارد می‌خواند.", "verb"),
            v("writing", "نوشتن", "He's writing.", "دارد می‌نویسد.", "verb"),
            v("travelling", "سفر کردن", "I'm travelling.", "در حال سفرم.", "verb"),
            v("hotel", "هتل", "Staying at a hotel.", "در هتل ماندن.")
        ),
        listOf(
            GrammarSection("Present continuous", "am/is/are + verb-ing. I'm reading. She's writing."),
            GrammarSection("Questions", "What are you doing? What is she reading?")
        ),
        listOf(
            d("A", "Hi, Tom! What are you doing?", "سلام تام! چیکار می‌کنی؟"),
            d("B", "I'm travelling in Italy!", "دارم در ایتالیا سفر می‌کنم!"),
            d("A", "Amazing! Where are you now?", "شگفت‌انگیز! الان کجایی؟"),
            d("B", "In Rome. I'm sitting in a cafe.", "در رم. در یک کافه نشسته‌ام."),
            d("A", "Sounds wonderful. What's the weather like?", "فوق‌العاده به نظر می‌رسد. هوا چطوره؟"),
            d("B", "It's sunny and warm. I'm drinking coffee.", "آفتابیه و گرم. دارم قهوه می‌نوشم."),
            d("A", "Lucky you! Are you staying at a hotel?", "خوش به حالت! در هتل می‌مانی؟"),
            d("B", "No, I'm staying with friends.", "نه، پیش دوستان می‌مانم."),
            d("A", "Everything's fine then!", "پس همه چیز خوبه!"),
            d("B", "Yes, perfect!", "بله، عالی!")
        ),
        listOf(
            q("Where is B travelling?", listOf("Spain", "Italy", "France"), 1),
            q("What is B drinking?", listOf("tea", "coffee", "water"), 1),
            q("What ___ you doing?", listOf("is", "are", "am"), 1),
            q("She ___ reading.", listOf("am", "is", "are"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Lucky you!", "خوش به حالت!", "Lucky you!", "خوش به حالت!"),
            IdiomExpression("Everything's fine", "همه چیز خوبه", "Everything's fine!", "همه چیز خوبه!")
        ),
        pron = listOf(PronunciationTip("-ing", "/ɪŋ/")),
        cult = listOf(CulturalNote("Travel", "Italy popular destination.")),
        mis = listOf(CommonMistake("What you are doing?", "What are you doing?", "Verb before subject."))
    )

    private fun f9B() = base(26, "9B Working undercover", "۹B کار مخفیانه",
        listOf("Use present continuous vs present simple", "Talk about clothes", "Compare now and usually"),
        listOf(
            v("usually", "معمولاً", "I usually wear jeans.", "معمولاً جین می‌پوشم.", "adverb"),
            v("wear", "پوشیدن", "He's wearing a suit.", "کت و شلوار پوشیده.", "verb"),
            v("suit", "کت و شلوار", "A black suit.", "کت و شلوار مشکی."),
            v("work undercover", "کار مخفیانه", "He works undercover.", "کار مخفیانه می‌کند."),
            v("police officer", "افسر پلیس", "A police officer.", "یک افسر پلیس."),
            v("clothes", "لباس", "Nice clothes.", "لباس‌های قشنگ.")
        ),
        listOf(
            GrammarSection("Present continuous vs present simple", "I usually wear jeans (habit). Today I'm wearing a suit (now)."),
            GrammarSection("Questions", "What do you usually wear? What are you wearing now?")
        ),
        listOf(
            d("A", "Where's John?", "جان کجاست؟"),
            d("B", "He's in the city. He's working undercover.", "در شهره. کار مخفیانه می‌کنه."),
            d("A", "Really? Is he a police officer?", "واقعاً؟ افسر پلیسه؟"),
            d("B", "Yes. He usually wears a uniform.", "بله. معمولاً یونیفرم می‌پوشه."),
            d("A", "What's he wearing now?", "الان چی پوشیده؟"),
            d("B", "A black suit. He looks like a businessman.", "کت و شلوار مشکی. شبیه تاجرها به نظر می‌رسه."),
            d("A", "That's clever!", "هوشمندانه‌ست!"),
            d("B", "Yes. Undercover work is dangerous.", "بله. کار مخفیانه خطرناکه."),
            d("A", "Is he OK?", "خوبه؟"),
            d("B", "Yes, don't worry. He's fine.", "بله، نگران نباش. خوبه.")
        ),
        listOf(
            q("What does John usually wear?", listOf("a suit", "a uniform", "jeans"), 1),
            q("What's he wearing now?", listOf("uniform", "black suit", "jeans"), 1),
            q("I usually ___ jeans.", listOf("wear", "wearing", "wears"), 0),
            q("What ___ he wearing?", listOf("is", "are", "am"), 0)
        ),
        idioms = listOf(IdiomExpression("Look like", "شبیه بودن", "He looks like a businessman.", "شبیه تاجرهاست.")),
        pron = listOf(PronunciationTip("Contrast", "I USUALLY wear. I'M wearing NOW.")),
        cult = listOf(CulturalNote("Undercover work", "Dangerous job.")),
        mis = listOf(CommonMistake("What he is wearing?", "What is he wearing?", "Verb before subject."))
    )

    // ═══════════ FILE 10 ═══════════
    private fun f10A() = base(27, "10A A room with a view", "۱۰A اتاقی با منظره",
        listOf("Use there is / there are", "Use in, on, under", "Talk about hotels"),
        listOf(
            v("there is", "هست", "There is a view.", "منظره‌ای هست."),
            v("there are", "هستند", "There are two beds.", "دو تخت هستند."),
            v("view", "منظره", "A nice view.", "منظره قشنگ."),
            v("hotel", "هتل", "A small hotel.", "هتل کوچک."),
            v("floor", "طبقه", "Third floor.", "طبقه سوم."),
            v("in", "در", "In the room.", "در اتاق.", "preposition")
        ),
        listOf(
            GrammarSection("There is / There are", "There is a view. There are two beds. Singular vs plural."),
            GrammarSection("Prepositions of place", "in the room, on the table, under the bed.")
        ),
        listOf(
            d("A", "How's your hotel?", "هتلت چطوره؟"),
            d("B", "It's great. There's a beautiful view.", "عالیه. منظره زیبایی هست."),
            d("A", "Which floor are you on?", "کدام طبقه هستی؟"),
            d("B", "Third floor. There's a balcony too.", "طبقه سوم. بالکن هم هست."),
            d("A", "Is there a restaurant?", "رستوران هست؟"),
            d("B", "Yes, on the first floor. There's also a small gym.", "بله، طبقه اول. باشگاه کوچکی هم هست."),
            d("A", "Are there many guests?", "مهمان‌های زیادی هستند؟"),
            d("B", "No, just a few. It's very quiet.", "نه، فقط چند تا. خیلی آرامه."),
            d("A", "Sounds perfect!", "کامل به نظر می‌رسه!"),
            d("B", "Yes, I love it.", "بله، عاشقشم.")
        ),
        listOf(
            q("Which floor is B on?", listOf("first", "second", "third"), 2),
            q("Is there a gym?", listOf("no", "yes", "maybe"), 1),
            q("___ a view from the room.", listOf("There is", "There are", "Is there"), 0),
            q("___ two beds.", listOf("There is", "There are", "Is"), 1)
        ),
        idioms = listOf(IdiomExpression("A few", "چندتا", "Just a few.", "فقط چند تا.")),
        pron = listOf(PronunciationTip("There is/are", "Linking: there_is, there_are")),
        cult = listOf(CulturalNote("Hotel floors", "Ground floor in UK = 1st floor in US.")),
        mis = listOf(CommonMistake("There is two beds.", "There are two beds.", "Plural = are."))
    )

    private fun f10B() = base(28, "10B Where were you?", "۱۰B کجا بودی؟",
        listOf("Use past simple: be", "Use in, on, at", "Talk about past"),
        listOf(
            v("was", "بود", "I was at home.", "در خانه بودم.", "verb"),
            v("were", "بودند", "They were here.", "اینجا بودند.", "verb"),
            v("yesterday", "دیروز", "Yesterday I was at work.", "دیروز سر کار بودم."),
            v("last night", "دیشب", "Last night was fun.", "دیشب خوب بود."),
            v("at home", "در خانه", "I was at home.", "در خانه بودم."),
            v("at work", "سر کار", "She was at work.", "او سر کار بود.")
        ),
        listOf(
            GrammarSection("Past simple: was/were", "I/he/she/it was. You/we/they were. Negative: wasn't/weren't."),
            GrammarSection("Prepositions", "in a city, at home, at work, on a street.")
        ),
        listOf(
            d("A", "Where were you last night?", "دیشب کجا بودی؟"),
            d("B", "I was at home. And you?", "در خانه بودم. تو چطور؟"),
            d("A", "I was at a restaurant with friends.", "در رستوران با دوستان بودم."),
            d("B", "Nice! Was the food good?", "خوبه! غذا خوب بود؟"),
            d("A", "Yes, it was delicious.", "بله، خوشمزه بود."),
            d("B", "Was Maria there?", "ماریا آنجا بود؟"),
            d("A", "No, she wasn't. She was at work.", "نه، نبود. سر کار بود."),
            d("B", "Poor Maria! Was she tired?", "بیچاره ماریا! خسته بود؟"),
            d("A", "Yes, she was. She works a lot.", "بله. زیاد کار می‌کند."),
            d("B", "She should rest!", "باید استراحت کند!")
        ),
        listOf(
            q("Where was B last night?", listOf("restaurant", "home", "work"), 1),
            q("Where was Maria?", listOf("home", "restaurant", "work"), 2),
            q("I ___ at home.", listOf("am", "was", "were"), 1),
            q("They ___ at work.", listOf("was", "were", "am"), 1)
        ),
        idioms = listOf(IdiomExpression("Poor Maria!", "بیچاره ماریا!", "Poor Maria!", "بیچاره ماریا!")),
        pron = listOf(PronunciationTip("Was/Were", "Weak: /wəz/, /wər/")),
        cult = listOf(CulturalNote("Rest", "Important for health.")),
        mis = listOf(CommonMistake("I were at home.", "I was at home.", "Use 'was' with I."))
    )

    // ═══════════ PRACTICAL ENGLISH 5 ═══════════
    private fun pe5() = base(29, "PE5 Inviting and offering", "انگلیسی کاربردی ۵ — دعوت کردن و تعارف کردن",
        listOf("Invite people", "Offer food and drink", "Accept and refuse politely"),
        listOf(
            v("invite", "دعوت کردن", "I'd like to invite you.", "می‌خواهم دعوتت کنم.", "verb"),
            v("offer", "تعارف کردن", "Can I offer you a drink?", "می‌توانم نوشیدنی تعارف کنم؟", "verb"),
            v("would you like", "میل دارید", "Would you like some tea?", "چای میل دارید؟"),
            v("thanks", "ممنون", "Yes, thanks.", "بله، ممنون.", "interjection"),
            v("no thanks", "نه ممنون", "No thanks.", "نه ممنون.", "interjection"),
            v("please", "لطفاً", "Yes, please.", "بله، لطفاً.", "interjection")
        ),
        listOf(
            GrammarSection("Inviting", "Would you like to come? I'd like to invite you."),
            GrammarSection("Offering", "Would you like some...? Can I get you...?"),
            GrammarSection("Accepting/Refusing", "Yes, please. / No, thanks.")
        ),
        listOf(
            d("A", "Would you like some coffee?", "قهوه میل داری؟"),
            d("B", "Yes, please. Thanks!", "بله، لطفاً. ممنون!"),
            d("A", "Milk and sugar?", "شیر و شکر؟"),
            d("B", "Just milk, please.", "فقط شیر، لطفاً."),
            d("A", "Would you like a biscuit?", "بیسکویت میل داری؟"),
            d("B", "No, thanks. I'm not hungry.", "نه، ممنون. گرسنه نیستم."),
            d("A", "Would you like to come to my party?", "میل داری به مهمانی من بیای؟"),
            d("B", "I'd love to! When?", "خیلی دوست دارم! کی؟"),
            d("A", "Saturday, at 8.", "شنبه، ساعت ۸."),
            d("B", "Perfect. See you then!", "عالی. اون موقع می‌بینمت!")
        ),
        listOf(
            q("What does B want in the coffee?", listOf("milk and sugar", "just milk", "nothing"), 1),
            q("Does B want a biscuit?", listOf("yes", "no", "maybe"), 1),
            q("___ you like some coffee?", listOf("Would", "Do", "Are"), 0),
            q("Yes, ___.", listOf("please", "thanks", "OK"), 0)
        ),
        idioms = listOf(
            IdiomExpression("I'd love to", "خیلی دوست دارم", "I'd love to!", "خیلی دوست دارم!"),
            IdiomExpression("See you then", "اون موقع می‌بینمت", "See you then!", "اون موقع می‌بینمت!")
        ),
        pron = listOf(PronunciationTip("Polite intonation", "Would you LIKE some COFFEE?")),
        cult = listOf(CulturalNote("Offers", "Polite culture worldwide.")),
        mis = listOf(CommonMistake("Would you like some coffee? Yes, I like.", "Yes, please.", "Accept with 'please'."))
    )

    // ═══════════ REVIEW 9&10 ═══════════
    private fun rc910() = base(30, "R&C 9&10", "مرور ۹ و ۱۰",
        listOf("Review present continuous", "Review there is/are", "Review was/were"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present continuous", "I'm reading. She's writing."),
            GrammarSection("There is/are", "There is a view. There are two beds."),
            GrammarSection("Was/Were", "I was. They were.")
        ),
        listOf(
            d("T", "Review time! Files 9 and 10.", "وقت مرور! فایل‌های ۹ و ۱۰."),
            d("A", "Present continuous. I'm reading.", "Present continuous. I'm reading."),
            d("B", "There is a river. There are trees.", "There is a river. There are trees."),
            d("T", "Was/Were?", "Was/Were؟"),
            d("A", "I was. They were.", "I was. They were."),
            d("T", "Excellent!", "عالی!"),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("She ___ reading.", listOf("am", "is", "are"), 1),
            q("___ a river near the hotel.", listOf("There is", "There are", "Is"), 0),
            q("I ___ at home.", listOf("am", "was", "were"), 1),
            q("They ___ at work.", listOf("was", "were", "am"), 1)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Was/Were", "Weak forms.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("There is two beds.", "There are two beds.", "Plural = are."))
    )

    // ═══════════ FILE 11 ═══════════
    private fun f11A() = base(31, "11A A new life in the USA", "۱۱A یک زندگی جدید در آمریکا",
        listOf("Use past simple: regular verbs", "Talk about past events", "Talk about a new life"),
        listOf(
            v("moved", "نقل مکان کرد", "They moved to the USA.", "به آمریکا نقل مکان کردند.", "verb"),
            v("arrived", "رسید", "I arrived last year.", "سال پیش رسیدم.", "verb"),
            v("started", "شروع کرد", "She started a new job.", "شغل جدیدی شروع کرد.", "verb"),
            v("visited", "بازدید کرد", "We visited New York.", "نیویورک را دیدیم.", "verb"),
            v("worked", "کار کرد", "He worked in a hospital.", "در بیمارستان کار کرد.", "verb"),
            v("learned", "یاد گرفت", "I learned English.", "انگلیسی یاد گرفتم.", "verb")
        ),
        listOf(
            GrammarSection("Past simple: regular verbs", "Add -ed: visit → visited, work → worked, start → started."),
            GrammarSection("Time expressions", "yesterday, last year, two years ago.")
        ),
        listOf(
            d("A", "When did you move to the USA?", "چه زمانی به آمریکا نقل مکان کردی؟"),
            d("B", "Last year. I arrived in January.", "سال پیش. ژانویه رسیدم."),
            d("A", "Did you like it here?", "اینجا را دوست داشتی؟"),
            d("B", "Yes, I loved it. But it was hard.", "بله، عاشقش شدم. ولی سخت بود."),
            d("A", "What did you do?", "چیکار کردی؟"),
            d("B", "I worked in a restaurant and studied English.", "در رستوران کار کردم و انگلیسی خواندم."),
            d("A", "Did you visit many places?", "جاهای زیادی را دیدی؟"),
            d("B", "Yes, I visited New York and Boston.", "بله، نیویورک و بوستون را دیدم."),
            d("A", "That's a good start!", "شروع خوبیه!"),
            d("B", "Yes, and I learned a lot.", "بله، و چیزهای زیادی یاد گرفتم.")
        ),
        listOf(
            q("When did B move to USA?", listOf("last month", "last year", "two years ago"), 1),
            q("Where did B work?", listOf("hospital", "restaurant", "school"), 1),
            q("I ___ last year.", listOf("arrive", "arrived", "arriving"), 1),
            q("She ___ a new job.", listOf("start", "started", "starting"), 1)
        ),
        idioms = listOf(IdiomExpression("A good start", "شروع خوب", "A good start!", "شروع خوبیه!")),
        pron = listOf(PronunciationTip("-ed endings", "/t/ worked, /d/ arrived, /ɪd/ visited")),
        cult = listOf(CulturalNote("Immigration", "Common experience worldwide.")),
        mis = listOf(CommonMistake("Did you moved?", "Did you move?", "Base verb after did."))
    )

    private fun f11B() = base(32, "11B How was your day?", "۱۱B روزت چطور بود؟",
        listOf("Use past simple: irregular verbs", "Talk about daily events", "Ask past questions"),
        listOf(
            v("went", "رفت", "I went to work.", "به سر کار رفتم.", "verb"),
            v("had", "داشت", "I had a busy day.", "روز شلوغی داشتم.", "verb"),
            v("got", "گرفت", "I got home late.", "دیر به خانه رسیدم.", "verb"),
            v("did", "انجام داد", "What did you do?", "چیکار کردی؟", "verb"),
            v("came", "آمد", "She came home at 6.", "ساعت ۶ به خانه آمد.", "verb"),
            v("saw", "دید", "I saw my friends.", "دوستانم را دیدم.", "verb")
        ),
        listOf(
            GrammarSection("Past simple: irregular verbs", "go → went, have → had, get → got, do → did, come → came, see → saw."),
            GrammarSection("Past questions", "What did you do? Where did you go?")
        ),
        listOf(
            d("A", "How was your day?", "روزت چطور بود؟"),
            d("B", "Very busy. I had a lot of work.", "خیلی شلوغ. کار زیادی داشتم."),
            d("A", "What did you do?", "چیکار کردی؟"),
            d("B", "I went to a meeting and then I had lunch with a client.", "به جلسه رفتم و بعد با مشتری ناهار خوردم."),
            d("A", "What time did you get home?", "چه ساعتی به خانه رسیدی؟"),
            d("B", "Late. About 8. And you?", "دیر. حدود ۸. تو چطور؟"),
            d("A", "I came home at 6. I saw my friends.", "من ساعت ۶ به خانه آمدم. دوستانم را دیدم."),
            d("B", "Nice! Did you have fun?", "خوبه! خوش گذشت؟"),
            d("A", "Yes, we had dinner together.", "بله، با هم شام خوردیم."),
            d("B", "That sounds great!", "خوب به نظر میاد!")
        ),
        listOf(
            q("How was B's day?", listOf("relaxing", "busy", "boring"), 1),
            q("What time did B get home?", listOf("6", "7", "8"), 2),
            q("I ___ to work.", listOf("go", "went", "gone"), 1),
            q("She ___ home early.", listOf("come", "came", "coming"), 1)
        ),
        idioms = listOf(IdiomExpression("Have fun", "خوش گذشتن", "Did you have fun?", "خوش گذشت؟")),
        pron = listOf(PronunciationTip("Irregular past", "went, had, got, did, came, saw")),
        cult = listOf(CulturalNote("Busy days", "Common in work life.")),
        mis = listOf(CommonMistake("Did you went?", "Did you go?", "Base verb after did."))
    )

    // ═══════════ FILE 12 ═══════════
    private fun f12A() = base(33, "12A Strangers on a train", "۱۲A غریبه‌ها در قطار",
        listOf("Use past simple: regular and irregular", "Tell a story", "Use narrative linkers"),
        listOf(
            v("train", "قطار", "On a train.", "در قطار."),
            v("stranger", "غریبه", "A stranger.", "یک غریبه."),
            v("sat", "نشست", "He sat next to me.", "کنارم نشست.", "verb"),
            v("told", "گفت", "He told me a story.", "او به من داستانی گفت.", "verb"),
            v("gave", "داد", "She gave me a book.", "او به من کتابی داد.", "verb"),
            v("found", "پیدا کرد", "I found a wallet.", "یک کیف پول پیدا کردم.", "verb")
        ),
        listOf(
            GrammarSection("Past simple: regular and irregular", "Regular: visited, worked. Irregular: sat, told, gave, found."),
            GrammarSection("Telling a story", "First, then, after that, finally.")
        ),
        listOf(
            d("A", "Did you have a good trip?", "سفر خوبی داشتی؟"),
            d("B", "Yes! I met a stranger on the train.", "بله! در قطار با یک غریبه آشنا شدم."),
            d("A", "What happened?", "چی شد؟"),
            d("B", "He sat next to me and we talked.", "کنارم نشست و صحبت کردیم."),
            d("A", "What did you talk about?", "درباره چی صحبت کردید؟"),
            d("B", "Travel, work, life. He told me interesting stories.", "سفر، کار، زندگی. داستان‌های جالبی گفت."),
            d("A", "Did you exchange numbers?", "شماره‌ها را رد و بدل کردید؟"),
            d("B", "Yes! He gave me his number. Now we're friends.", "بله! شماره‌اش را داد. الان دوستیم."),
            d("A", "That's amazing!", "شگفت‌انگیزه!"),
            d("B", "Yes! Strangers can become friends.", "بله! غریبه‌ها می‌تونن دوست بشن.")
        ),
        listOf(
            q("Who did B meet?", listOf("a friend", "a stranger", "a teacher"), 1),
            q("What did they exchange?", listOf("books", "numbers", "money"), 1),
            q("He ___ next to me.", listOf("sit", "sat", "sitting"), 1),
            q("She ___ me a book.", listOf("give", "gave", "giving"), 1)
        ),
        idioms = listOf(IdiomExpression("Strangers can become friends", "غریبه‌ها می‌تونن دوست بشن", "Strangers can become friends.", "غریبه‌ها می‌تونن دوست بشن.")),
        pron = listOf(PronunciationTip("Irregular past", "sat, told, gave, found")),
        cult = listOf(CulturalNote("Train travel", "Common way to meet people.")),
        mis = listOf(CommonMistake("He gived me.", "He gave me.", "Irregular."))
    )

    private fun f12B() = base(34, "12B Revise the past", "۱۲B مرور گذشته",
        listOf("Review past simple", "Review was/were and regular/irregular verbs", "Talk about the past"),
        listOf(
            v("yesterday", "دیروز", "Yesterday I was tired.", "دیروز خسته بودم."),
            v("last week", "هفته پیش", "Last week I visited Rome.", "هفته پیش رم را دیدم."),
            v("ago", "پیش", "Two years ago.", "دو سال پیش."),
            v("regular", "باقاعده", "Regular verbs.", "افعال باقاعده.", "adjective"),
            v("irregular", "بی‌قاعده", "Irregular verbs.", "افعال بی‌قاعده.", "adjective"),
            v("past", "گذشته", "The past.", "گذشته.")
        ),
        listOf(
            GrammarSection("Was/Were review", "I was. They were."),
            GrammarSection("Past simple: regular", "worked, visited, started."),
            GrammarSection("Past simple: irregular", "went, saw, had, met, ate, drank.")
        ),
        listOf(
            d("T", "Let's review the past!", "بیایید گذشته را مرور کنیم!"),
            d("A", "I was at home yesterday.", "دیروز در خانه بودم."),
            d("B", "They were at work.", "آن‌ها سر کار بودند."),
            d("T", "Regular verbs?", "افعال باقاعده؟"),
            d("A", "Visited, worked, started.", "Visited، worked، started."),
            d("T", "Irregular verbs?", "افعال بی‌قاعده؟"),
            d("B", "Went, saw, had, met, ate.", "Went، saw، had، met، ate."),
            d("T", "Very good. Question form?", "خیلی خوب. شکل سوالی؟"),
            d("A", "Did you go? Did she work?", "Did you go? Did she work?"),
            d("T", "Excellent! You remember everything.", "عالی! همه چیز را به یاد داری.")
        ),
        listOf(
            q("Which is regular?", listOf("went", "worked", "saw"), 1),
            q("Which is irregular?", listOf("visited", "went", "started"), 1),
            q("I ___ at home.", listOf("am", "was", "were"), 1),
            q("They ___ at work.", listOf("was", "were", "am"), 1)
        ),
        idioms = listOf(IdiomExpression("Let's review", "بیایید مرور کنیم", "Let's review.", "بیایید مرور کنیم.")),
        pron = listOf(PronunciationTip("Past -ed", "/t/, /d/, /ɪd/")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("Did you went?", "Did you go?", "Base verb after did."))
    )

    // ═══════════ PRACTICAL ENGLISH 6 ═══════════
    private fun pe6() = base(35, "PE6 Asking for and giving directions", "انگلیسی کاربردی ۶ — پرسیدن و دادن آدرس",
        listOf("Ask for directions", "Give directions", "Use prepositions of place"),
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
            d("B", "The station is opposite the bank.", "ایستگاه روبه‌روی بانک است."),
            d("A", "Is it far?", "دوره؟"),
            d("B", "No, about 5 minutes on foot.", "نه، حدود ۵ دقیقه پیاده."),
            d("A", "Thank you so much!", "خیلی ممنون!"),
            d("B", "You're welcome. Have a good trip!", "خواهش می‌کنم. سفر خوبی داشته باشی!")
        ),
        listOf(
            q("Which way to turn?", listOf("left", "right", "straight"), 0),
            q("Where's the station?", listOf("next to bank", "opposite bank", "behind bank"), 1),
            q("___ left at the lights.", listOf("Turn", "Turning", "To turn"), 0),
            q("Go ___ down the street.", listOf("straight", "straightly", "straighten"), 0)
        ),
        idioms = listOf(
            IdiomExpression("On foot", "پیاده", "5 minutes on foot.", "۵ دقیقه پیاده."),
            IdiomExpression("Have a good trip", "سفر خوبی داشته باشی", "Have a good trip!", "سفر خوبی داشته باشی!")
        ),
        pron = listOf(PronunciationTip("Directions", "Falling: TURN left. GO straight.")),
        cult = listOf(CulturalNote("Asking strangers", "Start with 'Excuse me'.")),
        mis = listOf(CommonMistake("Turn to left.", "Turn left.", "No 'to'."))
    )

    // ═══════════ REVIEW 11&12 ═══════════
    private fun rc1112() = base(36, "R&C 11&12", "مرور ۱۱ و ۱۲",
        listOf("Review past simple", "Review directions", "Final review"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Past simple review", "Was/were. Regular and irregular verbs."),
            GrammarSection("Directions", "Turn left, turn right, go straight."),
            GrammarSection("Final review", "All tenses from Starter.")
        ),
        listOf(
            d("T", "Final review! Files 11 and 12.", "مرور نهایی! فایل‌های ۱۱ و ۱۲."),
            d("A", "Past simple. I was, I went.", "حال گذشته. I was، I went."),
            d("B", "Regular and irregular. Visited, saw.", "باقاعده و بی‌قاعده. Visited، saw."),
            d("T", "Directions?", "جهت‌ها؟"),
            d("A", "Turn left, turn right, go straight.", "Turn left، turn right، go straight."),
            d("T", "Excellent! You've learned so much!", "عالی! خیلی یاد گرفتید!"),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Congratulations! You finished Starter!", "تبریک! استارتر را تمام کردید!"),
            d("B", "We're ready for Level 1!", "برای سطح ۱ آماده‌ایم!"),
            d("T", "Yes, you are! Good luck!", "بله! موفق باشید!")
        ),
        listOf(
            q("Which is past?", listOf("went", "go", "going"), 0),
            q("Regular verb?", listOf("saw", "visited", "went"), 1),
            q("Turn ___ at the corner.", listOf("left", "left to", "to left"), 0),
            q("I ___ tired yesterday.", listOf("am", "was", "were"), 1)
        ),
        idioms = listOf(IdiomExpression("Congratulations!", "تبریک!", "Congratulations!", "تبریک!")),
        pron = listOf(PronunciationTip("Past forms", "Regular and irregular.")),
        cult = listOf(CulturalNote("End of course", "Congratulations!"))
        ,
        mis = listOf(CommonMistake("I goed.", "I went.", "Irregular."))
    )
}