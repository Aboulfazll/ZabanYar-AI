package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 4th Edition — Starter
 * 12 Files | A1 Beginner
 * ساختار: هر فایل شامل 2 درس (A, B) + Practical English + Review and Check
 */
object AmericanEnglishFile4thStarter {
    const val BOOK_ID = "american_english_file_4th_starter"

    fun getContent(n: Int): LessonContent = when (n) {
        1 -> f1A(); 2 -> f1B(); 3 -> pe1(); 4 -> rc1()
        5 -> f2A(); 6 -> f2B(); 7 -> pe2(); 8 -> rc2()
        9 -> f3A(); 10 -> f3B(); 11 -> pe3(); 12 -> rc3()
        13 -> f4A(); 14 -> f4B(); 15 -> pe4(); 16 -> rc4()
        17 -> f5A(); 18 -> f5B(); 19 -> pe5(); 20 -> rc5()
        21 -> f6A(); 22 -> f6B(); 23 -> pe6(); 24 -> rc6()
        25 -> f7A(); 26 -> f7B(); 27 -> pe7(); 28 -> rc7()
        29 -> f8A(); 30 -> f8B(); 31 -> pe8(); 32 -> rc8()
        33 -> f9A(); 34 -> f9B(); 35 -> pe9(); 36 -> rc9()
        37 -> f10A(); 38 -> f10B(); 39 -> pe10(); 40 -> rc10()
        41 -> f11A(); 42 -> f11B(); 43 -> pe11(); 44 -> rc11()
        45 -> f12A(); 46 -> f12B(); 47 -> pe12(); 48 -> rc12()
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
    private fun f1A() = base(1, "1A Hello!", "۱A سلام!",
        listOf("Greet people", "Use verb be (I, you)", "Say numbers 0-10"),
        listOf(
            v("hello", "سلام", "Hello, I'm Tom.", "سلام، من تامم.", "interjection"),
            v("name", "نام", "What's your name?", "نامت چیست؟"),
            v("nice to meet you", "از آشنایی خوشحالم", "Nice to meet you.", "از آشنایی خوشحالم."),
            v("goodbye", "خداحافظ", "Goodbye, see you!", "خداحافظ، می‌بینمت!", "interjection"),
            v("coffee", "قهوه", "A coffee, please.", "یک قهوه، لطفاً."),
            v("tea", "چای", "A tea, please.", "یک چای، لطفاً.")
        ),
        listOf(
            GrammarSection("Verb be: I / you", "I am Tom. You are Helen. Contractions: I'm, you're."),
            GrammarSection("Numbers 0-10", "zero, one, two, three, four, five, six, seven, eight, nine, ten.")
        ),
        listOf(
            d("A", "Hello. A coffee, please.", "سلام. یک قهوه، لطفاً."),
            d("B", "What's your name?", "نامت چیست؟"),
            d("A", "Helen.", "هلن."),
            d("B", "Just a minute, Helen.", "یک دقیقه، هلن."),
            d("A", "Thank you.", "ممنون."),
            d("C", "Hi. Are you Helen?", "سلام. تو هلن هستی؟"),
            d("A", "Yes, I am.", "بله."),
            d("C", "I'm Tom. Nice to meet you.", "من تامم. از آشنایی خوشحالم."),
            d("A", "Nice to meet you, too.", "من هم خوشحالم."),
            d("C", "See you later!", "بعداً می‌بینمت!")
        ),
        listOf(
            q("What does Helen order?", listOf("a tea", "a coffee", "water"), 1),
            q("Who is Tom?", listOf("a teacher", "a friend", "a doctor"), 1),
            q("___ am Tom.", listOf("I", "You", "He"), 0),
            q("Contraction of 'I am'?", listOf("I'm", "I're", "I's"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you!", "از آشنایی خوشحالم!"),
            IdiomExpression("See you later", "بعداً می‌بینمت", "See you later!", "بعداً می‌بینمت!")
        ),
        pron = listOf(PronunciationTip("Contractions", "I'm /aɪm/, you're /jʊr/")),
        cult = listOf(CulturalNote("First names", "English speakers use first names immediately.")),
        mis = listOf(CommonMistake("I is Tom.", "I am Tom.", "Use 'am' with I."))
    )

    private fun f1B() = base(2, "1B Where are you from?", "۱B اهل کجایی؟",
        listOf("Use verb be (he/she/it)", "Talk about countries", "Say numbers 11-20"),
        listOf(
            v("from", "اهل", "Where are you from?", "اهل کجایی؟", "preposition"),
            v("Italy", "ایتالیا", "I'm from Italy.", "اهل ایتالیام."),
            v("Canada", "کانادا", "He's from Canada.", "او اهل کاناداست."),
            v("Japan", "ژاپن", "She's from Japan.", "او اهل ژاپنه."),
            v("city", "شهر", "A big city.", "شهر بزرگ."),
            v("country", "کشور", "A beautiful country.", "کشور زیبا.")
        ),
        listOf(
            GrammarSection("Verb be: he/she/it", "He is Tom. She is Helen. Contractions: he's, she's."),
            GrammarSection("Questions with be", "Where are you from? Where is he from?")
        ),
        listOf(
            d("A", "Where are you from?", "اهل کجایی؟"),
            d("B", "I'm from Italy. And you?", "اهل ایتالیام. تو چطور؟"),
            d("A", "I'm from Canada.", "من اهل کانادام."),
            d("B", "Is she from Canada too?", "او هم اهل کاناداست؟"),
            d("A", "No, she's from Japan.", "نه، او اهل ژاپنه."),
            d("B", "What city?", "کدام شهر؟"),
            d("A", "Tokyo. It's a big city.", "توکیو. شهر بزرگیه."),
            d("B", "Nice! I want to visit Japan.", "خوبه! می‌خوام ژاپن رو ببینم."),
            d("A", "You should! It's beautiful.", "باید بیای! زیباست."),
            d("B", "Maybe one day.", "شاید یک روز.")
        ),
        listOf(
            q("Where is B from?", listOf("Canada", "Italy", "Japan"), 1),
            q("Where is the woman from?", listOf("Italy", "Japan", "Canada"), 1),
            q("___ is from Japan.", listOf("He", "She", "I"), 1),
            q("Where ___ you from?", listOf("is", "am", "are"), 2)
        ),
        idioms = listOf(IdiomExpression("One day", "یک روز", "Maybe one day.", "شاید یک روز.")),
        pron = listOf(PronunciationTip("Sentence stress", "Where ARE you FROM?")),
        cult = listOf(CulturalNote("Countries", "Nationalities always start with a capital letter.")),
        mis = listOf(CommonMistake("He are from Canada.", "He is from Canada.", "Use 'is' with he."))
    )

    // ═══════════ PRACTICAL ENGLISH 1 ═══════════
    private fun pe1() = base(3, "PE1 How do you spell it?", "انگلیسی کاربردی ۱ — چطور هجی می‌کنی؟",
        listOf("Spell names", "Use the alphabet", "Ask for repetition"),
        listOf(
            v("spell", "هجی کردن", "How do you spell it?", "چطور هجی می‌کنی؟", "verb"),
            v("repeat", "تکرار کردن", "Can you repeat that?", "می‌تونی تکرار کنی؟", "verb"),
            v("letter", "حرف", "The letter A.", "حرف A."),
            v("first name", "نام کوچک", "My first name is Tom.", "اسم کوچکم تامه."),
            v("surname", "نام خانوادگی", "My surname is Smith.", "فامیلیم اسمیته."),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟")
        ),
        listOf(
            GrammarSection("Spelling aloud", "Letters: A /eɪ/, E /iː/, I /aɪ/, O /oʊ/, U /juː/."),
            GrammarSection("Polite requests", "Can you repeat that? How do you spell it?")
        ),
        listOf(
            d("A", "What's your surname?", "فامیلیت چیه؟"),
            d("B", "Kowalski.", "کوالسکی."),
            d("A", "How do you spell that?", "چطور هجی می‌کنی؟"),
            d("B", "K-O-W-A-L-S-K-I.", "ک-و-ا-ل-س-ک-ی."),
            d("A", "And your first name?", "و اسم کوچکت؟"),
            d("B", "Maria. M-A-R-I-A.", "ماریا. م-ا-ر-ی-ا."),
            d("A", "What's your address?", "آدرست چیه؟"),
            d("B", "12 Park Street, London.", "۱۲ خیابان پارک، لندن."),
            d("A", "Can you repeat that?", "تکرار می‌کنی؟"),
            d("B", "12 Park Street.", "۱۲ خیابان پارک.")
        ),
        listOf(
            q("What's the surname?", listOf("Maria", "Kowalski", "Park"), 1),
            q("How do you spell 'Kowalski'?", listOf("K-O-W-A-L-S-K-I", "K-O-V-A-L-S-K-I", "K-O-W-A-L-S-K-Y"), 0),
            q("___ you spell it?", listOf("How do", "How", "What"), 0),
            q("Can you ___ that?", listOf("repeat", "repeat to", "repeating"), 0)
        ),
        idioms = listOf(IdiomExpression("Can you repeat that?", "می‌تونی تکرار کنی؟", "Can you repeat that?", "می‌تونی تکرار کنی؟")),
        pron = listOf(PronunciationTip("Letters", "A /eɪ/, B /biː/, C /siː/, D /diː/")),
        cult = listOf(CulturalNote("Surnames", "In English, the surname comes after the first name.")),
        mis = listOf(CommonMistake("How you spell?", "How do you spell?", "Use 'do'."))
    )

    // ═══════════ REVIEW & CHECK 1 ═══════════
    private fun rc1() = base(4, "R&C 1", "مرور ۱",
        listOf("Review verb be", "Review greetings", "Review numbers"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do the exercises.", "تمرین‌ها را انجام بده."),
            v("practice", "تمرین", "Practice every day.", "هر روز تمرین کن.", "verb"),
            v("mistake", "اشتباه", "Correct the mistakes.", "اشتباهات را تصحیح کن."),
            v("grammar", "گرامر", "Grammar is important.", "گرامر مهم است."),
            v("vocabulary", "واژگان", "Learn new vocabulary.", "واژگان جدید یاد بگیر.")
        ),
        listOf(
            GrammarSection("Verb be review", "I am, you are, he/she/it is. Negative: not. Questions: Are you...?"),
            GrammarSection("Numbers review", "0-20. Days of the week.")
        ),
        listOf(
            d("T", "Let's review. What did we learn?", "بیایید مرور کنیم. چه یاد گرفتیم؟"),
            d("A", "Verb be! I am, you are, he is...", "فعل be! I am، you are، he is..."),
            d("B", "Greetings. Hello, hi, nice to meet you.", "احوال‌پرسی. Hello، hi، nice to meet you."),
            d("T", "What about numbers?", "اعداد چطور؟"),
            d("A", "One, two, three... twenty.", "یک، دو، سه... بیست."),
            d("T", "Very good! And spelling?", "خیلی خوب! و هجی کردن؟"),
            d("B", "A, B, C, D...", "A، B، C، D..."),
            d("T", "Excellent! You remember.", "عالی! یادت هست."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Great job!", "آفرین!")
        ),
        listOf(
            q("Which be with 'I'?", listOf("am", "is", "are"), 0),
            q("Which be with 'he'?", listOf("am", "is", "are"), 1),
            q("How do you say 'hi' in English?", listOf("Goodbye", "Hello", "Thanks"), 1),
            q("___ you from Italy?", listOf("Am", "Is", "Are"), 2)
        ),
        idioms = listOf(IdiomExpression("Let's review", "بیایید مرور کنیم", "Let's review.", "بیایید مرور کنیم.")),
        pron = listOf(PronunciationTip("Review intonation", "Statements fall, questions rise.")),
        cult = listOf(CulturalNote("Review", "Regular review is essential.")),
        mis = listOf(CommonMistake("They is happy.", "They are happy.", "Use 'are' for plural."))
    )

    // ═══════════ FILE 2 ═══════════
    private fun f2A() = base(5, "2A We're Canadian", "۲A ما کانادایی هستیم",
        listOf("Use verb be (we/you/they)", "Talk about nationalities", "Use plural nouns"),
        listOf(
            v("we", "ما", "We're Canadian.", "ما کانادایی هستیم."),
            v("they", "آن‌ها", "They're American.", "آن‌ها آمریکایی هستند."),
            v("Canadian", "کانادایی", "He's Canadian.", "او کانادایی است.", "adjective"),
            v("American", "آمریکایی", "She's American.", "او آمریکایی است.", "adjective"),
            v("British", "بریتانیایی", "They're British.", "آن‌ها بریتانیایی هستند.", "adjective"),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیست؟")
        ),
        listOf(
            GrammarSection("Verb be: we/you/they", "We are, you are, they are. Contractions: we're, you're, they're."),
            GrammarSection("Plural nouns", "country → countries, city → cities.")
        ),
        listOf(
            d("A", "Are you American?", "آمریکایی هستی؟"),
            d("B", "No, we're Canadian.", "نه، ما کانادایی هستیم."),
            d("A", "Really? Where in Canada?", "واقعاً؟ کجای کانادا؟"),
            d("B", "Toronto. It's a big city.", "تورنتو. شهر بزرگیه."),
            d("A", "And they? Are they Canadian too?", "و آن‌ها؟ آن‌ها هم کانادایی هستند؟"),
            d("B", "No, they're British. From London.", "نه، بریتانیایی هستند. از لندن."),
            d("A", "Interesting! Different nationalities.", "جالب! ملیت‌های مختلف."),
            d("B", "Yes, we're an international group.", "بله، ما یک گروه بین‌المللی هستیم."),
            d("A", "That's great!", "عالیه!"),
            d("B", "Welcome to the class!", "به کلاس خوش آمدید!")
        ),
        listOf(
            q("Where is B from?", listOf("USA", "Canada", "UK"), 1),
            q("Where are 'they' from?", listOf("Canada", "USA", "UK"), 2),
            q("We ___ from Canada.", listOf("am", "is", "are"), 2),
            q("___ they British?", listOf("Am", "Is", "Are"), 2)
        ),
        idioms = listOf(IdiomExpression("International group", "گروه بین‌المللی", "We're an international group.", "ما گروه بین‌المللی هستیم.")),
        pron = listOf(PronunciationTip("Nationality stress", "caNADIan, aMERican, BRItish")),
        cult = listOf(CulturalNote("Nationalities", "Always capitalized in English.")),
        mis = listOf(CommonMistake("We is Canadian.", "We are Canadian.", "Use 'are' with we."))
    )

    private fun f2B() = base(6, "2B What's his number?", "۲B شماره‌اش چیه؟",
        listOf("Ask for personal information", "Use Wh- questions with be", "Say phone numbers"),
        listOf(
            v("phone number", "شماره تلفن", "What's his number?", "شماره‌اش چیه؟"),
            v("Wh- questions", "سوالات Wh-", "What, where, who, how.", "چه، کجا، کی، چطور."),
            v("how old", "چند ساله", "How old are you?", "چند سالته؟"),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟"),
            v("email", "ایمیل", "What's your email?", "ایمیلت چیه؟"),
            v("number", "شماره", "A phone number.", "شماره تلفن.")
        ),
        listOf(
            GrammarSection("Wh- questions with be", "What's your name? Where are you from? Who is he? How old are you?"),
            GrammarSection("Saying phone numbers", "0 = zero / oh. 07700 900123.")
        ),
        listOf(
            d("A", "What's his name?", "اسمش چیه؟"),
            d("B", "His name is Carlos.", "اسمش کارلوس است."),
            d("A", "Where's he from?", "اهل کجاست؟"),
            d("B", "He's from Brazil.", "اهل برزیله."),
            d("A", "What's his phone number?", "شماره تلفنش چیه؟"),
            d("B", "It's 07700 900456.", "۰۷۷۰۰ ۹۰۰۴۵۶."),
            d("A", "How old is he?", "چند سالشه؟"),
            d("B", "He's 25.", "۲۵ ساله."),
            d("A", "And his email?", "و ایمیلش؟"),
            d("B", "carlos@gmail.com.", "carlos@gmail.com.")
        ),
        listOf(
            q("Where is Carlos from?", listOf("Spain", "Brazil", "Mexico"), 1),
            q("How old is he?", listOf("20", "25", "30"), 1),
            q("___ is his name?", listOf("What", "Who", "Where"), 0),
            q("___ old are you?", listOf("What", "How", "Who"), 1)
        ),
        idioms = listOf(IdiomExpression("How old are you?", "چند سالته؟", "How old are you?", "چند سالته؟")),
        pron = listOf(PronunciationTip("Phone numbers", "Say each digit separately: 0-7-7-0-0...")),
        cult = listOf(CulturalNote("Phone numbers", "In the US: (area code) + number.")),
        mis = listOf(CommonMistake("How old you are?", "How old are you?", "Verb before subject."))
    )

    // ═══════════ PRACTICAL ENGLISH 2 ═══════════
    private fun pe2() = base(7, "PE2 How much is it?", "انگلیسی کاربردی ۲ — چقدره؟",
        listOf("Ask for prices", "Shop for items", "Use polite requests"),
        listOf(
            v("how much", "چقدر", "How much is it?", "چقدره؟", "adverb"),
            v("price", "قیمت", "What's the price?", "قیمتش چقدره؟"),
            v("dollar", "دلار", "It's 5 dollars.", "۵ دلاره."),
            v("cheap", "ارزان", "Very cheap.", "خیلی ارزان.", "adjective"),
            v("expensive", "گران", "Too expensive.", "خیلی گران.", "adjective"),
            v("buy", "خریدن", "I want to buy it.", "می‌خوام بخرمش.", "verb")
        ),
        listOf(
            GrammarSection("How much...?", "How much is it? How much are they?"),
            GrammarSection("Shopping phrases", "I'd like... Can I have...? Here you are.")
        ),
        listOf(
            d("A", "How much is this bag?", "این کیف چقدره؟"),
            d("B", "It's 20 dollars.", "۲۰ دلاره."),
            d("A", "That's cheap! And that watch?", "ارزونه! و اون ساعت؟"),
            d("B", "The watch is 50 dollars.", "ساعت ۵۰ دلاره."),
            d("A", "That's expensive.", "گرونه."),
            d("B", "But it's very nice.", "ولی خیلی قشنگه."),
            d("A", "OK. I'll take the bag.", "باشه. کیف رو می‌خرم."),
            d("B", "Here you are. That's 20 dollars.", "بفرمایید. ۲۰ دلار."),
            d("A", "Here you are. Thank you!", "بفرمایید. ممنون!"),
            d("B", "Thank you! Goodbye!", "ممنون! خداحافظ!")
        ),
        listOf(
            q("How much is the bag?", listOf("$10", "$20", "$50"), 1),
            q("What does A buy?", listOf("watch", "bag", "nothing"), 1),
            q("___ much is it?", listOf("What", "How", "Who"), 1),
            q("I'll ___ the bag.", listOf("take", "buy", "get"), 0)
        ),
        idioms = listOf(
            IdiomExpression("I'll take it", "می‌خرمش", "I'll take it.", "می‌خرمش."),
            IdiomExpression("Here you are", "بفرمایید", "Here you are.", "بفرمایید.")
        ),
        pron = listOf(PronunciationTip("Prices", "$20 = twenty dollars")),
        cult = listOf(CulturalNote("Shopping", "Prices are often negotiable in some cultures.")),
        mis = listOf(CommonMistake("How much it is?", "How much is it?", "Verb before subject."))
    )

    // ═══════════ REVIEW & CHECK 2 ═══════════
    private fun rc2() = base(8, "R&C 2", "مرور ۲",
        listOf("Review we/you/they", "Review Wh- questions", "Review shopping"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Verb be review", "we/you/they = are. Questions: Are they...?"),
            GrammarSection("Wh- questions", "What, Where, Who, How, How much, How old.")
        ),
        listOf(
            d("T", "Review time! Files 2.", "وقت مرور! فایل ۲."),
            d("A", "We are, you are, they are.", "We are، you are، they are."),
            d("B", "Questions with What, Where, Who.", "سوالات با What، Where، Who."),
            d("T", "How much?", "How much؟"),
            d("A", "How much is it?", "چقدره؟"),
            d("T", "How old?", "How old؟"),
            d("B", "How old are you?", "چند سالته؟"),
            d("T", "Excellent! You're ready for File 3.", "عالی! برای فایل ۳ آماده‌اید."),
            d("A", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "Great attitude!", "روحیه عالی!")
        ),
        listOf(
            q("Which be with 'they'?", listOf("am", "is", "are"), 2),
            q("How much ___ it?", listOf("is", "are", "am"), 0),
            q("___ old are you?", listOf("What", "How", "Who"), 1),
            q("___ is she from?", listOf("What", "Where", "Who"), 1)
        ),
        idioms = listOf(IdiomExpression("Review time", "وقت مرور", "Review time!", "وقت مرور!")),
        pron = listOf(PronunciationTip("Intonation", "Questions rise at the end.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("They is from Canada.", "They are from Canada.", "Use 'are'."))
    )

    // ═══════════ FILE 3 ═══════════
    private fun f3A() = base(9, "3A What's in your bag?", "۳A چی توی کیفت داری؟",
        listOf("Use a/an", "Use singular/plural nouns", "Talk about small things"),
        listOf(
            v("bag", "کیف", "What's in your bag?", "چی توی کیفت داری؟"),
            v("book", "کتاب", "A book.", "یک کتاب."),
            v("phone", "موبایل", "A phone.", "یک موبایل."),
            v("keys", "کلیدها", "My keys.", "کلیدهام."),
            v("watch", "ساعت", "A watch.", "یک ساعت."),
            v("umbrella", "چتر", "An umbrella.", "یک چتر.")
        ),
        listOf(
            GrammarSection("a / an", "a before consonants: a book. an before vowels: an umbrella."),
            GrammarSection("Singular and plural", "book → books, watch → watches, key → keys.")
        ),
        listOf(
            d("A", "What's in your bag?", "چی توی کیفت داری؟"),
            d("B", "A book, a phone, and my keys.", "یک کتاب، یک موبایل و کلیدهام."),
            d("A", "Is this an umbrella?", "این چتره؟"),
            d("B", "Yes, it's my umbrella. It's raining.", "بله، چترمه. باران می‌آید."),
            d("A", "And that's a nice watch.", "و اون ساعت قشنگیه."),
            d("B", "Thanks. It's a gift from my sister.", "ممنون. هدیه‌ای از خواهرمه."),
            d("A", "You have many things!", "چیزهای زیادی داری!"),
            d("B", "Yes, my bag is full.", "بله، کیسم پره."),
            d("A", "A full bag for a busy day!", "کیف پر برای یک روز شلوغ!"),
            d("B", "Exactly!", "دقیقاً!")
        ),
        listOf(
            q("What's in B's bag?", listOf("a book and phone", "a cat", "money"), 0),
            q("What's the weather like?", listOf("sunny", "raining", "snowing"), 1),
            q("It's ___ umbrella.", listOf("a", "an", "the"), 1),
            q("I have two ___.", listOf("watch", "watchs", "watches"), 2)
        ),
        idioms = listOf(IdiomExpression("A busy day", "روز شلوغ", "A busy day!", "روز شلوغ!")),
        pron = listOf(PronunciationTip("Plural -s", "/s/ books, /z/ keys, /ɪz/ watches")),
        cult = listOf(CulturalNote("Bags", "People carry essentials.")),
        mis = listOf(CommonMistake("a umbrella", "an umbrella", "Use 'an' before vowels."))
    )

    private fun f3B() = base(10, "3B Is that a hat?", "۳B اون کلاهه؟",
        listOf("Use this/that/these/those", "Talk about more objects", "Ask yes/no questions"),
        listOf(
            v("this", "این", "This is my bag.", "این کیف منه."),
            v("that", "آن", "That's your phone.", "آن موبایله."),
            v("these", "این‌ها", "These are my keys.", "این‌ها کلیدهام هستن."),
            v("those", "آن‌ها", "Those are your books.", "آن‌ها کتاب‌هات هستن."),
            v("hat", "کلاه", "Is that a hat?", "اون کلاهه؟"),
            v("jacket", "کاپشن", "A new jacket.", "کاپشن جدید.")
        ),
        listOf(
            GrammarSection("this / that / these / those", "this (near, sing.), that (far, sing.), these (near, pl.), those (far, pl.)."),
            GrammarSection("Yes/No questions", "Is this your bag? Are these your keys? Yes, they are. / No, they aren't.")
        ),
        listOf(
            d("A", "Is that a hat?", "اون کلاهه؟"),
            d("B", "Yes, it is. It's my hat.", "بله. کلاه منه."),
            d("A", "And are these your keys?", "و این‌ها کلیدهات هستن؟"),
            d("B", "No, they aren't. They're my sister's.", "نه، نیستن. مال خواهرمه."),
            d("A", "Is this your jacket?", "این کاپشنت هست؟"),
            d("B", "Yes, it is. Nice, right?", "بله. قشنگه، نه؟"),
            d("A", "Very nice! And those books?", "خیلی قشنگ! و اون کتاب‌ها؟"),
            d("B", "Those are my books. For school.", "اون‌ها کتاب‌هام هستن. برای مدرسه."),
            d("A", "You have many things!", "چیزهای زیادی داری!"),
            d("B", "Yes, I'm a student!", "بله، من دانشجو هستم!")
        ),
        listOf(
            q("Is that a hat?", listOf("no", "yes", "maybe"), 1),
            q("Whose keys are they?", listOf("his", "sister's", "mother's"), 1),
            q("___ is my bag. (near)", listOf("This", "That", "Those"), 0),
            q("___ are my keys. (near, plural)", listOf("This", "These", "That"), 1)
        ),
        idioms = listOf(IdiomExpression("Nice, right?", "قشنگه، نه؟", "Nice, right?", "قشنگه، نه؟")),
        pron = listOf(PronunciationTip("this / that", "/ðɪs/ vs /ðæt/")),
        cult = listOf(CulturalNote("Objects", "Common classroom vocabulary.")),
        mis = listOf(CommonMistake("This are my keys.", "These are my keys.", "Use 'these' for plural."))
    )

    // ═══════════ PRACTICAL ENGLISH 3 ═══════════
    private fun pe3() = base(11, "PE3 How much is it?", "انگلیسی کاربردی ۳ — چقدره؟",
        listOf("Shop for clothes", "Ask about prices", "Use size vocabulary"),
        listOf(
            v("size", "سایز", "What size?", "چه سایزی؟"),
            v("try on", "پرو کردن", "Can I try it on?", "می‌تونم پرو کنم؟", "verb"),
            v("fit", "اندازه بودن", "Does it fit?", "اندازه‌ست؟", "verb"),
            v("cheap", "ارزان", "It's cheap.", "ارزونه.", "adjective"),
            v("expensive", "گران", "Too expensive.", "خیلی گران.", "adjective"),
            v("buy", "خریدن", "I'll buy it.", "می‌خرمش.", "verb")
        ),
        listOf(
            GrammarSection("Shopping for clothes", "Can I try it on? What size are you? Does it fit?"),
            GrammarSection("Prices", "How much is it? It's $50. That's expensive.")
        ),
        listOf(
            d("A", "Can I try this jacket on?", "می‌تونم این کاپشن رو پرو کنم؟"),
            d("B", "Of course. What size are you?", "البته. چه سایزی هستی؟"),
            d("A", "Medium.", "متوسط."),
            d("B", "Here you are. How is it?", "بفرمایید. چطوره؟"),
            d("A", "It fits! How much is it?", "اندازه‌ست! چقدره؟"),
            d("B", "It's 80 dollars.", "۸۰ دلاره."),
            d("A", "That's a bit expensive.", "کمی گرونه."),
            d("B", "It's good quality.", "کیفیتش خوبه."),
            d("A", "OK, I'll take it.", "باشه، می‌خرمش."),
            d("B", "Great! Cash or card?", "عالی! نقد یا کارت؟")
        ),
        listOf(
            q("What size is A?", listOf("small", "medium", "large"), 1),
            q("How much is the jacket?", listOf("$50", "$80", "$100"), 1),
            q("Can I ___ it on?", listOf("try", "fit", "buy"), 0),
            q("Does it ___?", listOf("fit", "fit on", "fits"), 0)
        ),
        idioms = listOf(IdiomExpression("I'll take it", "می‌خرمش", "I'll take it.", "می‌خرمش.")),
        pron = listOf(PronunciationTip("Sizes", "small, medium, large")),
        cult = listOf(CulturalNote("Sizes", "US 6 = UK 10 = EU 36.")),
        mis = listOf(CommonMistake("I want try.", "Can I try it on?", "Complete phrase."))
    )

    // ═══════════ REVIEW & CHECK 3 ═══════════
    private fun rc3() = base(12, "R&C 3", "مرور ۳",
        listOf("Review a/an", "Review this/that/these/those", "Review shopping"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("a/an review", "a book, an umbrella."),
            GrammarSection("this/that/these/those review", "Near/far, singular/plural."),
            GrammarSection("Plural nouns", "-s, -es, -ies.")
        ),
        listOf(
            d("T", "Review time! Files 3.", "وقت مرور! فایل ۳."),
            d("A", "a book, an umbrella.", "a book، an umbrella."),
            d("B", "this, that, these, those.", "this، that، these، those."),
            d("T", "Give an example.", "یک مثال بزن."),
            d("A", "This is my phone. Those are your books.", "این موبایل منه. آن‌ها کتاب‌هات هستن."),
            d("T", "Plural?", "جمع؟"),
            d("B", "book → books, watch → watches.", "book → books، watch → watches."),
            d("T", "Perfect! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep it up!", "ادامه بده!")
        ),
        listOf(
            q("a or an before 'umbrella'?", listOf("a", "an", "the"), 1),
            q("Plural of 'watch'?", listOf("watchs", "watches", "watchies"), 1),
            q("___ is my bag. (near)", listOf("This", "That", "Those"), 0),
            q("___ are your keys. (far)", listOf("This", "These", "Those"), 2)
        ),
        idioms = listOf(IdiomExpression("Keep it up!", "ادامه بده!", "Keep it up!", "ادامه بده!")),
        pron = listOf(PronunciationTip("Plural endings", "/s/, /z/, /ɪz/")),
        cult = listOf(CulturalNote("Review", "Important for progress.")),
        mis = listOf(CommonMistake("This are keys.", "These are keys.", "Use 'these' for plural."))
    )

    // ═══════════ FILE 4 ═══════════
    private fun f4A() = base(13, "4A Family and friends", "۴A خانواده و دوستان",
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
        cult = listOf(CulturalNote("Family", "Family size varies.")),
        mis = listOf(CommonMistake("She have a sister.", "She has a sister.", "Use 'has' with she."))
    )

    private fun f4B() = base(14, "4B That's a cool car!", "۴B اون ماشین باحالیه!",
        listOf("Use adjectives", "Talk about colors", "Describe things"),
        listOf(
            v("cool", "باحال", "A cool car.", "ماشین باحال.", "adjective"),
            v("red", "قرمز", "A red bag.", "کیف قرمز.", "adjective"),
            v("blue", "آبی", "A blue phone.", "موبایل آبی.", "adjective"),
            v("green", "سبز", "A green book.", "کتاب سبز.", "adjective"),
            v("black", "مشکی", "A black watch.", "ساعت مشکی.", "adjective"),
            v("white", "سفید", "A white dress.", "لباس سفید.", "adjective")
        ),
        listOf(
            GrammarSection("Adjectives + nouns", "Adjective before noun: a red bag, a blue phone."),
            GrammarSection("Colors", "red, blue, green, black, white, yellow, orange, brown, gray, pink.")
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
            q("What color is B's car?", listOf("red", "blue", "white"), 1),
            q("What's B's favorite color?", listOf("red", "blue", "white"), 1),
            q("It's ___ red car.", listOf("a", "an", "the"), 0),
            q("What color ___ your car?", listOf("is", "are", "am"), 0)
        ),
        idioms = listOf(IdiomExpression("Cool car", "ماشین باحال", "That's a cool car!", "اون ماشین باحالیه!")),
        pron = listOf(PronunciationTip("Colors", "RED /red/, BLUE /bluː/")),
        cult = listOf(CulturalNote("Colors", "Meanings vary by culture.")),
        mis = listOf(CommonMistake("a car red", "a red car", "Adjective before noun."))
    )

    // ═══════════ PRACTICAL ENGLISH 4 ═══════════
    private fun pe4() = base(15, "PE4 What time is it?", "انگلیسی کاربردی ۴ — ساعت چنده؟",
        listOf("Tell the time", "Ask about schedules", "Use time expressions"),
        listOf(
            v("time", "زمان", "What time is it?", "ساعت چنده؟"),
            v("o'clock", "ساعت", "At 7 o'clock.", "ساعت ۷."),
            v("half past", "نیم ساعت بعد", "Half past 8.", "ساعت ۸:۳۰."),
            v("quarter past", "ربع بعد", "Quarter past 9.", "ساعت ۹:۱۵."),
            v("quarter to", "ربع به", "Quarter to 10.", "ساعت ۹:۴۵."),
            v("early", "زود", "Very early.", "خیلی زود.", "adverb")
        ),
        listOf(
            GrammarSection("Telling the time", "It's 7 o'clock. It's half past 8. It's quarter to 9."),
            GrammarSection("Time expressions", "at 7, in the morning, in the evening.")
        ),
        listOf(
            d("A", "Excuse me, what time is it?", "ببخشید، ساعت چنده؟"),
            d("B", "It's half past 3.", "ساعت ۳:۳۰."),
            d("A", "Thanks. My class starts at 4.", "ممنون. کلاسم ساعت ۴ شروع می‌شه."),
            d("B", "You have 30 minutes.", "۳۰ دقیقه وقت داری."),
            d("A", "Good. I need coffee first!", "خوبه. اول قهوه لازم دارم!"),
            d("B", "What time does the cafe close?", "کافه چه ساعتی بسته می‌شه؟"),
            d("A", "I think at 5.", "فکر کنم ساعت ۵."),
            d("B", "Perfect. Let's go!", "عالی. بریم!"),
            d("A", "What time is your class?", "کلاس تو چه ساعتیه؟"),
            d("B", "At 6. I have time too.", "ساعت ۶. من هم وقت دارم.")
        ),
        listOf(
            q("What time is it?", listOf("3:00", "3:30", "4:00"), 1),
            q("When does A's class start?", listOf("3:30", "4:00", "4:30"), 1),
            q("It's ___ past 3.", listOf("half", "quarter", "o'clock"), 0),
            q("It's quarter ___ 10.", listOf("past", "to", "half"), 1)
        ),
        idioms = listOf(IdiomExpression("Let's go", "بریم", "Let's go!", "بریم!")),
        pron = listOf(PronunciationTip("Time", "3:15 = quarter past three")),
        cult = listOf(CulturalNote("Time", "In some cultures, being late is common.")),
        mis = listOf(CommonMistake("It's 3 hours 30.", "It's half past 3.", "Use time expressions."))
    )

    // ═══════════ REVIEW & CHECK 4 ═══════════
    private fun rc4() = base(16, "R&C 4", "مرور ۴",
        listOf("Review family", "Review adjectives", "Review time"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Possessive adjectives", "my, your, his, her, our, their."),
            GrammarSection("Possessive 's", "Tom's car, my sister's book."),
            GrammarSection("Adjectives", "Adjective before noun.")
        ),
        listOf(
            d("T", "Review time! Files 4.", "وقت مرور! فایل ۴."),
            d("A", "My, your, his, her.", "My، your، his، her."),
            d("B", "Tom's car, my sister's book.", "Tom's car، my sister's book."),
            d("T", "Adjectives?", "صفت‌ها؟"),
            d("A", "A red bag, a blue phone.", "A red bag، a blue phone."),
            d("T", "Time?", "زمان؟"),
            d("B", "Half past 3, quarter to 4.", "Half past 3، quarter to 4."),
            d("T", "Excellent!", "عالی!"),
            d("A", "We're learning fast!", "داریم سریع یاد می‌گیریم!"),
            d("T", "Very fast!", "خیلی سریع!")
        ),
        listOf(
            q("Possessive of 'Tom'?", listOf("Toms", "Tom's", "Toms'"), 1),
            q("What time is 4:45?", listOf("quarter past 4", "quarter to 5", "half past 4"), 1),
            q("___ mother is a teacher.", listOf("My", "I", "Me"), 0),
            q("It's ___ red car.", listOf("a", "an", "the"), 0)
        ),
        idioms = listOf(IdiomExpression("Learning fast", "سریع یاد گرفتن", "We're learning fast!", "داریم سریع یاد می‌گیریم!")),
        pron = listOf(PronunciationTip("Possessive 's", "/s/, /z/, /ɪz/")),
        cult = listOf(CulturalNote("Review", "Important.")),
        mis = listOf(CommonMistake("Tom car", "Tom's car", "Add 's."))
    )

    // ═══════════ FILE 5 ═══════════
    private fun f5A() = base(17, "5A A bad hair day", "۵A یک روز بد",
        listOf("Use present simple (I/you)", "Talk about common verbs", "Describe daily activities"),
        listOf(
            v("work", "کار کردن", "I work in an office.", "در دفتر کار می‌کنم.", "verb"),
            v("eat", "خوردن", "I eat breakfast at 7.", "ساعت ۷ صبحانه می‌خورم.", "verb"),
            v("drink", "نوشیدن", "She drinks tea.", "او چای می‌نوشد.", "verb"),
            v("morning", "صبح", "Good morning!", "صبح بخیر!"),
            v("night", "شب", "Good night!", "شب بخیر!"),
            v("day", "روز", "Have a nice day!", "روز خوبی داشته باشی!")
        ),
        listOf(
            GrammarSection("Present simple: I/you", "I work. You eat. Do you work? Yes, I do."),
            GrammarSection("Common verbs", "work, eat, drink, live, like, have.")
        ),
        listOf(
            d("A", "What do you do?", "شغلت چیه؟"),
            d("B", "I'm a teacher. I teach English.", "معلمم. انگلیسی درس می‌دم."),
            d("A", "That's interesting. What time do you start?", "جالبه. چه ساعتی شروع می‌کنی؟"),
            d("B", "I start at 8. I usually get up at 6:30.", "ساعت ۸ شروع می‌کنم. معمولاً ۶:۳۰ بیدار می‌شم."),
            d("A", "That's early!", "زوده!"),
            d("B", "Yes. What about you?", "بله. تو چطور؟"),
            d("A", "I work in a hospital. I start at 9.", "من در بیمارستان کار می‌کنم. ساعت ۹ شروع می‌کنم."),
            d("B", "That's better! What do you do?", "بهتره! چیکار می‌کنی؟"),
            d("A", "I'm a nurse. I help doctors.", "پرستارم. به دکترها کمک می‌کنم."),
            d("B", "That's a great job!", "شغل عالیه!")
        ),
        listOf(
            q("What's B's job?", listOf("nurse", "teacher", "doctor"), 1),
            q("When does A start?", listOf("6:30", "8:00", "9:00"), 2),
            q("I ___ coffee every morning.", listOf("drink", "drinks", "drinking"), 0),
            q("___ you work in a hospital?", listOf("Do", "Does", "Are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("What do you do?", "شغلت چیه؟", "What do you do?", "شغلت چیه؟"),
            IdiomExpression("Good morning", "صبح بخیر", "Good morning!", "صبح بخیر!")
        ),
        pron = listOf(PronunciationTip("do you", "Weak: /də jə/")),
        cult = listOf(CulturalNote("Jobs", "Asking about jobs is common.")),
        mis = listOf(CommonMistake("What you do?", "What do you do?", "Use 'do'."))
    )

    private fun f5B() = base(18, "5B What do you have for breakfast?", "۵B برای صبحانه چی می‌خوری؟",
        listOf("Use present simple (we/you/they)", "Use Wh- questions", "Talk about food"),
        listOf(
            v("breakfast", "صبحانه", "I have breakfast at 7.", "ساعت ۷ صبحانه می‌خورم."),
            v("lunch", "ناهار", "Lunch at 12.", "ناهار ساعت ۱۲."),
            v("dinner", "شام", "Dinner at 8.", "شام ساعت ۸."),
            v("bread", "نان", "I eat bread.", "نان می‌خورم."),
            v("eggs", "تخم‌مرغ", "Two eggs.", "دو تخم‌مرغ."),
            v("tea", "چای", "A cup of tea.", "یک فنجان چای.")
        ),
        listOf(
            GrammarSection("Present simple: we/you/they", "We eat, you drink, they like. Do you eat...?"),
            GrammarSection("Wh- questions", "What do you have for breakfast? Where do you eat lunch?")
        ),
        listOf(
            d("A", "What do you have for breakfast?", "برای صبحانه چی می‌خوری؟"),
            d("B", "I have bread and eggs. And tea.", "نان و تخم‌مرغ می‌خورم. و چای."),
            d("A", "And your family?", "و خانواده‌ات؟"),
            d("B", "They have cereal and coffee.", "آن‌ها غلات و قهوه می‌خورند."),
            d("A", "Where do you have lunch?", "ناهار رو کجا می‌خوری؟"),
            d("B", "At work. I take a sandwich.", "سر کار. ساندویچ می‌برم."),
            d("A", "What about dinner?", "شام چطور؟"),
            d("B", "We have dinner at home. Together.", "شام رو خانه می‌خوریم. با هم."),
            d("A", "That's nice!", "خوبه!"),
            d("B", "Yes, family time is important.", "بله، وقت خانوادگی مهمه.")
        ),
        listOf(
            q("What does B have for breakfast?", listOf("cereal", "bread and eggs", "fruit"), 1),
            q("Where does B have lunch?", listOf("home", "work", "cafe"), 1),
            q("What ___ you have for breakfast?", listOf("do", "does", "are"), 0),
            q("They ___ cereal every morning.", listOf("have", "has", "having"), 0)
        ),
        idioms = listOf(IdiomExpression("Family time", "وقت خانوادگی", "Family time is important.", "وقت خانوادگی مهمه.")),
        pron = listOf(PronunciationTip("Food words", "BREAKfast, DINner")),
        cult = listOf(CulturalNote("Meals", "Dinner is usually the main meal.")),
        mis = listOf(CommonMistake("What you have?", "What do you have?", "Use 'do'."))
    )

    // ═══════════ PRACTICAL ENGLISH 5 ═══════════
    private fun pe5() = base(19, "PE5 What's the date today?", "انگلیسی کاربردی ۵ — امروز چندمه؟",
        listOf("Say dates", "Talk about months", "Use ordinal numbers"),
        listOf(
            v("date", "تاریخ", "What's the date today?", "امروز چندمه؟"),
            v("month", "ماه", "Which month?", "کدام ماه؟"),
            v("January", "ژانویه", "My birthday is in January.", "تولدم در ژانویه است."),
            v("first", "اول", "The first of May.", "اول مه.", "adjective"),
            v("second", "دوم", "The second of June.", "دوم ژوئن.", "adjective"),
            v("third", "سوم", "The third of July.", "سوم جولای.", "adjective")
        ),
        listOf(
            GrammarSection("Dates", "The first of May. May first. On May 1st."),
            GrammarSection("Ordinal numbers", "first, second, third, fourth, fifth...")
        ),
        listOf(
            d("A", "What's the date today?", "امروز چندمه؟"),
            d("B", "It's the fifth of May.", "پنجم مه."),
            d("A", "May? My birthday is in May!", "مه؟ تولد من هم در مه است!"),
            d("B", "Really? What date?", "واقعاً؟ چه تاریخی؟"),
            d("A", "The twentieth.", "بیستم."),
            d("B", "That's soon! We should celebrate.", "به‌زودی! باید جشن بگیریم."),
            d("A", "Yes! A birthday party!", "بله! یک مهمانی تولد!"),
            d("B", "When is the best day?", "بهترین روز کیه؟"),
            d("A", "The twenty-first. It's a Saturday.", "بیست و یکم. شنبه است."),
            d("B", "Perfect! Let's plan it.", "عالی! بیا برنامه‌ریزی کنیم.")
        ),
        listOf(
            q("What's the date today?", listOf("May 1st", "May 5th", "May 20th"), 1),
            q("When is A's birthday?", listOf("May 5th", "May 20th", "May 21st"), 1),
            q("It's the ___ of May.", listOf("five", "fifth", "fiveth"), 1),
            q("My birthday is ___ May.", listOf("on", "in", "at"), 1)
        ),
        idioms = listOf(IdiomExpression("Let's plan it", "بیا برنامه‌ریزی کنیم", "Let's plan it.", "بیا برنامه‌ریزی کنیم.")),
        pron = listOf(PronunciationTip("Ordinal numbers", "first /fɜːrst/, second /ˈsekənd/, third /θɜːrd/")),
        cult = listOf(CulturalNote("Dates", "In the US: month/day/year.")),
        mis = listOf(CommonMistake("the five of May", "the fifth of May", "Use ordinal numbers."))
    )

    // ═══════════ REVIEW & CHECK 5 ═══════════
    private fun rc5() = base(20, "R&C 5", "مرور ۵",
        listOf("Review present simple", "Review food", "Review dates"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present simple review", "I work. You eat. Do you work?"),
            GrammarSection("Food vocabulary", "breakfast, lunch, dinner, bread, eggs, tea."),
            GrammarSection("Dates", "The first of May. May first.")
        ),
        listOf(
            d("T", "Review time! Files 5.", "وقت مرور! فایل ۵."),
            d("A", "Present simple. I work, you eat.", "حال ساده. I work، you eat."),
            d("B", "Questions with Do.", "سوالات با Do."),
            d("T", "Food?", "غذا؟"),
            d("A", "Breakfast, lunch, dinner.", "صبحانه، ناهار، شام."),
            d("T", "Dates?", "تاریخ‌ها؟"),
            d("B", "The first of May.", "اول مه."),
            d("T", "Excellent! You're ready for File 6.", "عالی! برای فایل ۶ آماده‌اید."),
            d("A", "We're learning so much!", "داریم خیلی یاد می‌گیریم!"),
            d("T", "Keep going!", "ادامه بده!")
        ),
        listOf(
            q("Do you ___ coffee?", listOf("drinks", "drink", "drinking"), 1),
            q("They ___ cereal.", listOf("have", "has", "having"), 0),
            q("It's the ___ of May.", listOf("five", "fifth", "fiveth"), 1),
            q("What ___ you have for breakfast?", listOf("do", "does", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("Keep going!", "ادامه بده!", "Keep going!", "ادامه بده!")),
        pron = listOf(PronunciationTip("Intonation", "Questions rise.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("Do you drinks?", "Do you drink?", "Base verb after do."))
    )

    // ═══════════ FILE 6 ═══════════
    private fun f6A() = base(21, "6A He speaks English at work", "۶A او سر کار انگلیسی صحبت می‌کند",
        listOf("Use present simple (he/she/it)", "Talk about jobs", "Use third person -s"),
        listOf(
            v("speak", "صحبت کردن", "He speaks English.", "او انگلیسی صحبت می‌کند.", "verb"),
            v("job", "شغل", "What's his job?", "شغلش چیه؟"),
            v("office", "دفتر", "He works in an office.", "در دفتر کار می‌کند."),
            v("hospital", "بیمارستان", "She works in a hospital.", "در بیمارستان کار می‌کند."),
            v("school", "مدرسه", "He teaches at a school.", "در مدرسه درس می‌دهد."),
            v("work", "کار کردن", "She works every day.", "هر روز کار می‌کند.", "verb")
        ),
        listOf(
            GrammarSection("Present simple: he/she/it", "Add -s or -es: He works, she teaches, it rains."),
            GrammarSection("Third person -s", "work → works, teach → teaches, go → goes.")
        ),
        listOf(
            d("A", "What does your brother do?", "برادرت چیکار می‌کنه؟"),
            d("B", "He works in a hospital.", "در بیمارستان کار می‌کند."),
            d("A", "Is he a doctor?", "دکتره؟"),
            d("B", "No, he's a nurse. He helps doctors.", "نه، پرستاره. به دکترها کمک می‌کند."),
            d("A", "Does he like his job?", "شغلش رو دوست داره؟"),
            d("B", "Yes, he loves it. He works long hours.", "بله، عاشقشه. ساعت‌های طولانی کار می‌کند."),
            d("A", "What about your sister?", "خواهرت چطور؟"),
            d("B", "She's a teacher. She teaches English.", "او معلمه. انگلیسی درس می‌دهد."),
            d("A", "Does she speak English at work?", "سر کار انگلیسی صحبت می‌کند؟"),
            d("B", "Yes, she speaks English every day.", "بله، هر روز انگلیسی صحبت می‌کند.")
        ),
        listOf(
            q("What does B's brother do?", listOf("doctor", "nurse", "teacher"), 1),
            q("What does B's sister do?", listOf("nurse", "teacher", "doctor"), 1),
            q("He ___ in a hospital.", listOf("work", "works", "working"), 1),
            q("She ___ English.", listOf("speak", "speaks", "speaking"), 1)
        ),
        idioms = listOf(IdiomExpression("Long hours", "ساعت‌های طولانی", "He works long hours.", "ساعت‌های طولانی کار می‌کند.")),
        pron = listOf(PronunciationTip("Third -s", "works /wɜːrks/, speaks /spiːks/")),
        cult = listOf(CulturalNote("Nurses", "Important healthcare workers.")),
        mis = listOf(CommonMistake("He work in a hospital.", "He works in a hospital.", "Add -s."))
    )

    private fun f6B() = base(22, "6B Do you like mornings?", "۶B صبح‌ها رو دوست داری؟",
        listOf("Use adverbs of frequency", "Talk about routines", "Talk about likes/dislikes"),
        listOf(
            v("always", "همیشه", "I always get up early.", "همیشه زود بیدار می‌شم.", "adverb"),
            v("usually", "معمولاً", "I usually drink coffee.", "معمولاً قهوه می‌نوشم.", "adverb"),
            v("sometimes", "گاهی", "Sometimes I read.", "گاهی می‌خوانم.", "adverb"),
            v("never", "هرگز", "I never drink tea.", "هرگز چای نمی‌نوشم.", "adverb"),
            v("early", "زود", "I wake up early.", "زود بیدار می‌شم.", "adverb"),
            v("late", "دیر", "He goes to bed late.", "دیر می‌خوابد.", "adverb")
        ),
        listOf(
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, never — before main verb."),
            GrammarSection("Likes/dislikes", "I like... I love... I don't like... I hate...")
        ),
        listOf(
            d("A", "Do you like mornings?", "صبح‌ها رو دوست داری؟"),
            d("B", "Not really. I usually get up late.", "نه زیاد. معمولاً دیر بیدار می‌شم."),
            d("A", "Me too! I always drink coffee.", "من هم! همیشه قهوه می‌خورم."),
            d("B", "What time do you get up?", "چه ساعتی بیدار می‌شوی؟"),
            d("A", "Usually at 8. Sometimes at 9.", "معمولاً ساعت ۸. گاهی ۹."),
            d("B", "Do you eat breakfast?", "صبحانه می‌خوری؟"),
            d("A", "Never! Just coffee.", "هرگز! فقط قهوه."),
            d("B", "That's not healthy!", "سالم نیست!"),
            d("A", "I know. I'm always busy.", "می‌دانم. همیشه مشغولم."),
            d("B", "You should eat something!", "باید چیزی بخوری!")
        ),
        listOf(
            q("Does B like mornings?", listOf("yes", "no", "sometimes"), 1),
            q("What does A always drink?", listOf("tea", "coffee", "water"), 1),
            q("I ___ get up early.", listOf("usual", "usually", "usualy"), 1),
            q("She ___ eats breakfast.", listOf("never", "not", "no"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Not really", "نه زیاد", "Not really.", "نه زیاد."),
            IdiomExpression("You should", "باید", "You should eat.", "باید بخوری.")
        ),
        pron = listOf(PronunciationTip("Frequency stress", "ALways, USually, NEver")),
        cult = listOf(CulturalNote("Breakfast", "Important meal in many cultures.")),
        mis = listOf(CommonMistake("I drink always coffee.", "I always drink coffee.", "Before main verb."))
    )

    // ═══════════ PRACTICAL ENGLISH 6 ═══════════
    private fun pe6() = base(23, "PE6 Where are you from?", "انگلیسی کاربردی ۶ — اهل کجایی؟",
        listOf("Talk about countries", "Ask about origin", "Use nationalities"),
        listOf(
            v("from", "اهل", "Where are you from?", "اهل کجایی؟", "preposition"),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیه؟"),
            v("country", "کشور", "Which country?", "کدام کشور؟"),
            v("city", "شهر", "A big city.", "شهر بزرگ."),
            v("language", "زبان", "What language?", "چه زبانی؟"),
            v("live", "زندگی کردن", "I live in London.", "در لندن زندگی می‌کنم.", "verb")
        ),
        listOf(
            GrammarSection("Where are you from?", "I'm from Italy. He's from Japan."),
            GrammarSection("Nationalities", "Italian, Japanese, Canadian, American.")
        ),
        listOf(
            d("A", "Where are you from?", "اهل کجایی؟"),
            d("B", "I'm from Brazil. And you?", "اهل برزیلم. تو چطور؟"),
            d("A", "I'm from Mexico.", "من اهل مکزیکم."),
            d("B", "What city?", "کدام شهر؟"),
            d("A", "Mexico City. It's very big.", "مکزیکو سیتی. خیلی بزرگه."),
            d("B", "Do you speak Spanish?", "اسپانیایی صحبت می‌کنی؟"),
            d("A", "Yes, and a little English.", "بله، و کمی انگلیسی."),
            d("B", "Your English is good!", "انگلیسیت خوبه!"),
            d("A", "Thanks! I practice every day.", "ممنون! هر روز تمرین می‌کنم."),
            d("B", "That's the best way!", "بهترین راه همینه!")
        ),
        listOf(
            q("Where is B from?", listOf("Mexico", "Brazil", "Spain"), 1),
            q("Where is A from?", listOf("Brazil", "Mexico", "Argentina"), 1),
            q("Where ___ you from?", listOf("is", "am", "are"), 2),
            q("I ___ from Brazil.", listOf("am", "is", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the best way", "بهترین راه همینه", "That's the best way!", "بهترین راه همینه!")),
        pron = listOf(PronunciationTip("Countries", "BraZIL, MEXico")),
        cult = listOf(CulturalNote("Nationalities", "Always capitalized.")),
        mis = listOf(CommonMistake("Where you from?", "Where are you from?", "Use 'are'."))
    )

    // ═══════════ REVIEW & CHECK 6 ═══════════
    private fun rc6() = base(24, "R&C 6", "مرور ۶",
        listOf("Review he/she/it", "Review adverbs", "Review countries"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present simple: he/she/it", "works, speaks, teaches."),
            GrammarSection("Adverbs of frequency", "always, usually, sometimes, never."),
            GrammarSection("Countries and nationalities", "Italy → Italian, Japan → Japanese.")
        ),
        listOf(
            d("T", "Review time! Files 6.", "وقت مرور! فایل ۶."),
            d("A", "He works, she speaks.", "He works، she speaks."),
            d("B", "Always, usually, sometimes, never.", "Always، usually، sometimes، never."),
            d("T", "Countries?", "کشورها؟"),
            d("A", "Italy, Japan, Brazil, Mexico.", "Italy، Japan، Brazil، Mexico."),
            d("T", "Nationalities?", "ملیت‌ها؟"),
            d("B", "Italian, Japanese, Brazilian, Mexican.", "Italian، Japanese، Brazilian، Mexican."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Perfect!", "عالی!")
        ),
        listOf(
            q("She ___ English.", listOf("speak", "speaks", "speaking"), 1),
            q("He ___ in a hospital.", listOf("work", "works", "working"), 1),
            q("___ you from Japan?", listOf("Is", "Am", "Are"), 2),
            q("I ___ drink tea.", listOf("never", "not", "no"), 0)
        ),
        idioms = listOf(IdiomExpression("Doing great", "خوب پیش رفتن", "You're doing great!", "داری خوب پیش می‌ری!")),
        pron = listOf(PronunciationTip("Third -s", "/s/, /z/, /ɪz/")),
        cult = listOf(CulturalNote("Review", "Important.")),
        mis = listOf(CommonMistake("She speak English.", "She speaks English.", "Add -s."))
    )

    // ═══════════ FILE 7 ═══════════
    private fun f7A() = base(25, "7A Life at the end of the world", "۷A زندگی در انتهای جهان",
        listOf("Use word order in questions", "Use common verbs", "Talk about places"),
        listOf(
            v("live", "زندگی کردن", "Where do you live?", "کجا زندگی می‌کنی؟", "verb"),
            v("place", "مکان", "A beautiful place.", "مکان زیبا."),
            v("world", "جهان", "End of the world.", "انتهای جهان."),
            v("village", "روستا", "A small village.", "روستای کوچک."),
            v("quiet", "آرام", "A quiet life.", "زندگی آرام.", "adjective"),
            v("far", "دور", "Very far.", "خیلی دور.", "adverb")
        ),
        listOf(
            GrammarSection("Word order in questions", "Where do you live? What do you do? When do you start?"),
            GrammarSection("Common verbs", "live, work, eat, drink, like, have.")
        ),
        listOf(
            d("A", "Where do you live?", "کجا زندگی می‌کنی؟"),
            d("B", "I live in a small village.", "در یک روستای کوچک زندگی می‌کنم."),
            d("A", "Where is it?", "کجاست؟"),
            d("B", "In the mountains. Very far from the city.", "در کوهستان. خیلی دور از شهر."),
            d("A", "Is it quiet?", "آرامه؟"),
            d("B", "Very quiet. Only 200 people.", "خیلی آرام. فقط ۲۰۰ نفر."),
            d("A", "What do you do there?", "اونجا چیکار می‌کنی؟"),
            d("B", "I work on a farm. I love it.", "در مزرعه کار می‌کنم. عاشقشه."),
            d("A", "That sounds peaceful.", "آرامش‌بخش به نظر می‌رسد."),
            d("B", "It is. You should visit!", "هست. باید بیای!")
        ),
        listOf(
            q("Where does B live?", listOf("city", "village", "town"), 1),
            q("How many people?", listOf("100", "200", "500"), 1),
            q("Where ___ you live?", listOf("do", "does", "are"), 0),
            q("What ___ you do?", listOf("do", "does", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("End of the world", "انتهای جهان", "Life at the end of the world.", "زندگی در انتهای جهان.")),
        pron = listOf(PronunciationTip("Word order", "Where DO you LIVE?")),
        cult = listOf(CulturalNote("Villages", "Small communities.")),
        mis = listOf(CommonMistake("Where you live?", "Where do you live?", "Use 'do'."))
    )

    private fun f7B() = base(26, "7B You can't park here", "۷B نمی‌تونی اینجا پارک کنی",
        listOf("Use can/can't", "Talk about rules", "Use common verbs"),
        listOf(
            v("can", "توانستن", "I can swim.", "می‌توانم شنا کنم.", "verb"),
            v("can't", "نمی‌تواند", "You can't park here.", "نمی‌تونی اینجا پارک کنی.", "verb"),
            v("park", "پارک کردن", "Can I park here?", "می‌تونم اینجا پارک کنم؟", "verb"),
            v("smoke", "سیگار کشیدن", "You can't smoke here.", "نمی‌تونی اینجا سیگار بکشی.", "verb"),
            v("rule", "قانون", "A new rule.", "قانون جدید."),
            v("sign", "تابلو", "Look at the sign.", "به تابلو نگاه کن.")
        ),
        listOf(
            GrammarSection("Can/Can't", "Ability: I can swim. Permission: Can I park here? You can't smoke."),
            GrammarSection("Rules", "You can't park here. You can't smoke. You can't take photos.")
        ),
        listOf(
            d("A", "Can I park here?", "می‌تونم اینجا پارک کنم؟"),
            d("B", "No, you can't. Look at the sign.", "نه، نمی‌تونی. به تابلو نگاه کن."),
            d("A", "Oh, sorry. Where can I park?", "اوه، ببخشید. کجا می‌تونم پارک کنم؟"),
            d("B", "Over there. Next to the bank.", "اونجا. کنار بانک."),
            d("A", "Thanks. Can I smoke here?", "ممنون. می‌تونم اینجا سیگار بکشم؟"),
            d("B", "No! You can't smoke in public places.", "نه! نمی‌تونی در مکان‌های عمومی سیگار بکشی."),
            d("A", "OK. Can I take photos?", "باشه. می‌تونم عکس بگیرم؟"),
            d("B", "Yes, you can. Photos are fine.", "بله، می‌تونی. عکس اشکالی نداره."),
            d("A", "Good. It's a beautiful place.", "خوبه. جای زیباییه."),
            d("B", "Yes, enjoy your visit!", "بله، از بازدیدت لذت ببر!")
        ),
        listOf(
            q("Can A park here?", listOf("yes", "no", "maybe"), 1),
            q("Can A smoke?", listOf("yes", "no", "outside"), 1),
            q("You ___ park here.", listOf("can", "can't", "can to"), 1),
            q("___ I take photos?", listOf("Can", "Do", "Am"), 0)
        ),
        idioms = listOf(IdiomExpression("Public places", "مکان‌های عمومی", "You can't smoke in public places.", "نمی‌تونی در مکان‌های عمومی سیگار بکشی.")),
        pron = listOf(PronunciationTip("Can/Can't", "can /kæn/, can't /kænt/")),
        cult = listOf(CulturalNote("Rules", "Public places have rules.")),
        mis = listOf(CommonMistake("You no can park.", "You can't park.", "Use can't."))
    )

    // ═══════════ PRACTICAL ENGLISH 7 ═══════════
    private fun pe7() = base(27, "PE7 What's the date today?", "انگلیسی کاربردی ۷ — امروز چندمه؟",
        listOf("Say dates", "Talk about months", "Use ordinal numbers"),
        listOf(
            v("date", "تاریخ", "What's the date?", "تاریخ چیه؟"),
            v("month", "ماه", "Which month?", "کدام ماه؟"),
            v("year", "سال", "This year.", "امسال."),
            v("January", "ژانویه", "In January.", "در ژانویه."),
            v("December", "دسامبر", "In December.", "در دسامبر."),
            v("birthday", "تولد", "My birthday.", "تولد من.")
        ),
        listOf(
            GrammarSection("Dates", "The first of May. May first. On May 1st."),
            GrammarSection("Months", "January, February, March, April, May, June, July, August, September, October, November, December.")
        ),
        listOf(
            d("A", "What's the date today?", "امروز چندمه؟"),
            d("B", "It's the tenth of June.", "دهم ژوئن."),
            d("A", "June? My birthday is in June!", "ژوئن؟ تولد من هم در ژوئن است!"),
            d("B", "Really? What date?", "واقعاً؟ چه تاریخی؟"),
            d("A", "The fifteenth.", "پانزدهم."),
            d("B", "That's soon! How old are you?", "به‌زودی! چند سالته؟"),
            d("A", "I'll be 25.", "۲۵ ساله می‌شم."),
            d("B", "We should celebrate!", "باید جشن بگیریم!"),
            d("A", "Yes! A birthday party!", "بله! یک مهمانی تولد!"),
            d("B", "I'll bring a cake!", "من کیک میارم!")
        ),
        listOf(
            q("What's the date?", listOf("June 1st", "June 10th", "June 15th"), 1),
            q("When is A's birthday?", listOf("June 10th", "June 15th", "June 20th"), 1),
            q("It's the ___ of June.", listOf("ten", "tenth", "tenths"), 1),
            q("My birthday is ___ June.", listOf("on", "in", "at"), 1)
        ),
        idioms = listOf(IdiomExpression("We should celebrate", "باید جشن بگیریم", "We should celebrate!", "باید جشن بگیریم!")),
        pron = listOf(PronunciationTip("Months", "JANuary, FebRUary, APRIL, JUNE")),
        cult = listOf(CulturalNote("Birthdays", "Celebrated in many cultures.")),
        mis = listOf(CommonMistake("the ten of June", "the tenth of June", "Use ordinal."))
    )

    // ═══════════ REVIEW & CHECK 7 ═══════════
    private fun rc7() = base(28, "R&C 7", "مرور ۷",
        listOf("Review questions", "Review can/can't", "Review dates"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Word order in questions", "Where do you live? What do you do?"),
            GrammarSection("Can/Can't", "I can swim. You can't park here."),
            GrammarSection("Dates", "The first of May. May first.")
        ),
        listOf(
            d("T", "Review time! Files 7.", "وقت مرور! فایل ۷."),
            d("A", "Where do you live? What do you do?", "Where do you live? What do you do?"),
            d("B", "I can swim. You can't park here.", "I can swim. You can't park here."),
            d("T", "Dates?", "تاریخ‌ها؟"),
            d("A", "The first of May.", "اول مه."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("Where ___ you live?", listOf("do", "does", "are"), 0),
            q("You ___ park here.", listOf("can", "can't", "can to"), 1),
            q("It's the ___ of May.", listOf("one", "first", "fiveth"), 1),
            q("___ I take photos?", listOf("Can", "Do", "Am"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Questions", "Rise at the end.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("Where you live?", "Where do you live?", "Use 'do'."))
    )

    // ═══════════ FILE 8 ═══════════
    private fun f8A() = base(29, "8A What are they doing?", "۸A آن‌ها چیکار می‌کنند؟",
        listOf("Use present continuous", "Talk about actions now", "Describe photos"),
        listOf(
            v("doing", "انجام دادن", "What are you doing?", "چیکار می‌کنی؟", "verb"),
            v("reading", "خواندن", "She's reading.", "دارد می‌خواند.", "verb"),
            v("writing", "نوشتن", "He's writing.", "دارد می‌نویسد.", "verb"),
            v("eating", "خوردن", "They're eating.", "دارند می‌خورند.", "verb"),
            v("playing", "بازی کردن", "They're playing.", "دارند بازی می‌کنند.", "verb"),
            v("watching", "تماشا کردن", "I'm watching TV.", "دارم تلویزیون تماشا می‌کنم.", "verb")
        ),
        listOf(
            GrammarSection("Present continuous", "am/is/are + verb-ing. I'm reading. She's writing. They're playing."),
            GrammarSection("Questions", "What are you doing? What is she reading?")
        ),
        listOf(
            d("A", "What are you doing?", "چیکار می‌کنی؟"),
            d("B", "I'm reading a book. And you?", "دارم کتاب می‌خوانم. تو چطور؟"),
            d("A", "I'm watching TV.", "دارم تلویزیون تماشا می‌کنم."),
            d("B", "What's your sister doing?", "خواهرت چیکار می‌کند؟"),
            d("A", "She's cooking dinner.", "دارد شام می‌پزد."),
            d("B", "And your parents?", "و والدینت؟"),
            d("A", "They're eating in the kitchen.", "دارند در آشپزخانه غذا می‌خورند."),
            d("B", "Nice. Everyone is busy!", "خوبه. همه مشغولند!"),
            d("A", "Yes, it's a busy evening.", "بله، عصر شلوغیه."),
            d("B", "Enjoy!", "لذت ببر!")
        ),
        listOf(
            q("What's B doing?", listOf("reading", "TV", "cooking"), 0),
            q("What's A's sister doing?", listOf("reading", "cooking", "eating"), 1),
            q("She ___ reading a book.", listOf("am", "is", "are"), 1),
            q("They ___ watching TV.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(IdiomExpression("Everyone is busy", "همه مشغولند", "Everyone is busy!", "همه مشغولند!")),
        pron = listOf(PronunciationTip("-ing", "/ɪŋ/")),
        cult = listOf(CulturalNote("Multitasking", "People do several things.")),
        mis = listOf(CommonMistake("What you are doing?", "What are you doing?", "Verb before subject."))
    )

    private fun f8B() = base(30, "8B Today is different", "۸B امروز متفاوته",
        listOf("Use present continuous vs simple", "Talk about weather", "Compare now and usually"),
        listOf(
            v("today", "امروز", "Today is different.", "امروز متفاوته."),
            v("usually", "معمولاً", "I usually work.", "معمولاً کار می‌کنم.", "adverb"),
            v("now", "الان", "I'm working now.", "الان دارم کار می‌کنم.", "adverb"),
            v("weather", "هوا", "The weather is nice.", "هوا خوبه."),
            v("sunny", "آفتابی", "It's sunny.", "آفتابیه.", "adjective"),
            v("raining", "بارانی", "It's raining.", "باران می‌آید.", "verb")
        ),
        listOf(
            GrammarSection("Present continuous vs simple", "I usually work (habit). I'm working now (action)."),
            GrammarSection("Weather", "It's raining. It's sunny. It's cold.")
        ),
        listOf(
            d("A", "What are you doing?", "چیکار می‌کنی؟"),
            d("B", "I'm walking in the park.", "دارم در پارک قدم می‌زنم."),
            d("A", "But you usually work on Mondays!", "ولی تو معمولاً دوشنبه‌ها کار می‌کنی!"),
            d("B", "I know. Today is different. It's a holiday.", "می‌دانم. امروز متفاوته. تعطیله."),
            d("A", "Lucky you! What's the weather like?", "خوش به حالت! هوا چطوره؟"),
            d("B", "It's sunny and warm. Beautiful!", "آفتابیه و گرم. زیبا!"),
            d("A", "I'm working now. It's raining here.", "من دارم کار می‌کنم. اینجا باران می‌آید."),
            d("B", "Oh no! That's not fair.", "اوه نه! این عادلانه نیست."),
            d("A", "I know. But I finish at 5.", "می‌دانم. ولی ساعت ۵ تمام می‌کنم."),
            d("B", "Then enjoy your evening!", "پس از عصره‌ات لذت ببر!")
        ),
        listOf(
            q("What's B doing?", listOf("working", "walking", "reading"), 1),
            q("What's the weather like at B's?", listOf("raining", "sunny", "cold"), 1),
            q("I usually ___.", listOf("work", "working", "works"), 0),
            q("I ___ working now.", listOf("am", "is", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("Lucky you!", "خوش به حالت!", "Lucky you!", "خوش به حالت!")),
        pron = listOf(PronunciationTip("Contrast", "I USUALLY work. I'M working NOW.")),
        cult = listOf(CulturalNote("Holidays", "Vary by country.")),
        mis = listOf(CommonMistake("I working now.", "I'm working now.", "Add 'am'."))
    )

    // ═══════════ PRACTICAL ENGLISH 8 ═══════════
    private fun pe8() = base(31, "PE8 Is there a bank near here?", "انگلیسی کاربردی ۸ — بانکی این نزدیکی هست؟",
        listOf("Ask for directions", "Use prepositions of place", "Talk about locations"),
        listOf(
            v("bank", "بانک", "Is there a bank?", "بانکی هست؟"),
            v("near", "نزدیک", "Near here.", "این نزدیکی.", "preposition"),
            v("next to", "کنار", "Next to the park.", "کنار پارک.", "preposition"),
            v("opposite", "روبه‌روی", "Opposite the bank.", "روبه‌روی بانک.", "preposition"),
            v("left", "چپ", "Turn left.", "به چپ بپیچ."),
            v("right", "راست", "Turn right.", "به راست بپیچ.")
        ),
        listOf(
            GrammarSection("Prepositions of place", "near, next to, opposite, between, on, in, at."),
            GrammarSection("Directions", "Turn left. Turn right. Go straight.")
        ),
        listOf(
            d("A", "Excuse me, is there a bank near here?", "ببخشید، بانکی این نزدیکی هست؟"),
            d("B", "Yes, there's one on Main Street.", "بله، یکی در خیابان مِین هست."),
            d("A", "How do I get there?", "چطور بروم؟"),
            d("B", "Go straight, then turn left.", "مستقیم برو، بعد به چپ بپیچ."),
            d("A", "Straight, then left. Got it.", "مستقیم، بعد چپ. فهمیدم."),
            d("B", "The bank is next to the post office.", "بانک کنار اداره پست است."),
            d("A", "Is it far?", "دور است؟"),
            d("B", "No, about 5 minutes.", "نه، حدود ۵ دقیقه."),
            d("A", "Thank you!", "ممنون!"),
            d("B", "You're welcome!", "خواهش می‌کنم!")
        ),
        listOf(
            q("Where is the bank?", listOf("Main Street", "Park Street", "First Ave"), 0),
            q("How long does it take?", listOf("2 min", "5 min", "10 min"), 1),
            q("___ there a bank?", listOf("Is", "Are", "Am"), 0),
            q("The bank is ___ the post office.", listOf("next to", "opposite", "behind"), 0)
        ),
        idioms = listOf(IdiomExpression("Got it", "فهمیدم", "Got it.", "فهمیدم.")),
        pron = listOf(PronunciationTip("Directions", "TURN left. GO straight.")),
        cult = listOf(CulturalNote("Asking strangers", "Start with 'Excuse me'.")),
        mis = listOf(CommonMistake("Turn to left.", "Turn left.", "No 'to'."))
    )

    // ═══════════ REVIEW & CHECK 8 ═══════════
    private fun rc8() = base(32, "R&C 8", "مرور ۸",
        listOf("Review present continuous", "Review prepositions", "Review directions"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present continuous", "I'm reading. She's writing."),
            GrammarSection("Prepositions of place", "near, next to, opposite, between."),
            GrammarSection("Directions", "Turn left, turn right, go straight.")
        ),
        listOf(
            d("T", "Review time! Files 8.", "وقت مرور! فایل ۸."),
            d("A", "I'm reading. She's writing.", "I'm reading. She's writing."),
            d("B", "Near, next to, opposite.", "Near، next to، opposite."),
            d("T", "Directions?", "جهت‌ها؟"),
            d("A", "Turn left, turn right, go straight.", "Turn left، turn right، go straight."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("She ___ reading.", listOf("am", "is", "are"), 1),
            q("The bank is ___ the park.", listOf("next to", "opposite", "between"), 0),
            q("Turn ___ at the corner.", listOf("left", "left to", "to left"), 0),
            q("___ there a bank?", listOf("Is", "Are", "Am"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Directions", "Falling intonation.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("She are reading.", "She is reading.", "Use 'is'."))
    )

    // ═══════════ FILE 9 ═══════════
    private fun f9A() = base(33, "9A In the jungle in Guatemala", "۹A در جنگل گواتمالا",
        listOf("Use there is/there are", "Use in/on/under", "Talk about places"),
        listOf(
            v("there is", "هست", "There is a river.", "رودخانه‌ای هست."),
            v("there are", "هستند", "There are trees.", "درختانی هستند."),
            v("jungle", "جنگل", "A big jungle.", "جنگل بزرگ."),
            v("river", "رودخانه", "A long river.", "رودخانه طولانی."),
            v("animal", "حیوان", "Wild animals.", "حیوانات وحشی."),
            v("tree", "درخت", "Many trees.", "درختان زیاد.")
        ),
        listOf(
            GrammarSection("There is / There are", "There is a river. There are trees. Singular vs plural."),
            GrammarSection("Prepositions", "in the jungle, on the river, under the tree.")
        ),
        listOf(
            d("A", "Tell me about Guatemala.", "از گواتمالا بگو."),
            d("B", "It's beautiful. There are jungles and rivers.", "زیباست. جنگل‌ها و رودخانه‌ها هستند."),
            d("A", "Are there many animals?", "حیوانات زیادی هستند؟"),
            d("B", "Yes, there are. Monkeys, birds, snakes.", "بله. میمون، پرنده، مار."),
            d("A", "Is there a hotel?", "هتلی هست؟"),
            d("B", "Yes, there's a small hotel near the river.", "بله، هتل کوچکی نزدیک رودخانه هست."),
            d("A", "Is it expensive?", "گرونه؟"),
            d("B", "No, it's cheap. And very quiet.", "نه، ارزونه. و خیلی آرام."),
            d("A", "Sounds perfect!", "کامل به نظر می‌رسد!"),
            d("B", "You should visit!", "باید بیای!")
        ),
        listOf(
            q("What's in Guatemala?", listOf("desert", "jungles", "mountains"), 1),
            q("Is there a hotel?", listOf("no", "yes", "expensive"), 1),
            q("___ a river near the hotel.", listOf("There is", "There are", "It is"), 0),
            q("___ many trees.", listOf("There is", "There are", "Is"), 1)
        ),
        idioms = listOf(IdiomExpression("You should visit", "باید بیای", "You should visit!", "باید بیای!")),
        pron = listOf(PronunciationTip("There is/are", "Linking: there_is, there_are")),
        cult = listOf(CulturalNote("Guatemala", "Central American country.")),
        mis = listOf(CommonMistake("There is many trees.", "There are many trees.", "Plural = are."))
    )

    private fun f9B() = base(34, "9B Before they were stars...", "۹B قبل از اینکه ستاره بشن...",
        listOf("Use past simple: be", "Use in/at/on", "Talk about the past"),
        listOf(
            v("was", "بود", "He was a student.", "او دانشجو بود.", "verb"),
            v("were", "بودند", "They were poor.", "فقیر بودند.", "verb"),
            v("born", "متولد", "I was born in 1990.", "متولد ۱۹۹۰.", "verb"),
            v("yesterday", "دیروز", "I was tired yesterday.", "دیروز خسته بودم."),
            v("famous", "معروف", "Now she's famous.", "الان معروفه.", "adjective"),
            v("school", "مدرسه", "At school together.", "با هم در مدرسه.")
        ),
        listOf(
            GrammarSection("Past simple: was/were", "I/he/she/it was. You/we/they were. Negative: wasn't/weren't."),
            GrammarSection("Prepositions", "in a city, at home, on a street.")
        ),
        listOf(
            d("A", "Where were you born?", "کجا متولد شدی؟"),
            d("B", "I was born in a small city.", "در یک شهر کوچک متولد شدم."),
            d("A", "Were you a good student?", "شاگرد خوبی بودی؟"),
            d("B", "Yes, I was. Very quiet.", "بله. خیلی ساکت."),
            d("A", "What was your first job?", "اولین شغلت چی بود؟"),
            d("B", "A waiter. I was very poor.", "پیشخدمت. خیلی فقیر بودم."),
            d("A", "And now?", "و الان؟"),
            d("B", "Now I'm a manager. Things change!", "الان مدیرم. شرایط تغییر می‌کند!"),
            d("A", "That's inspiring!", "الهام‌بخشه!"),
            d("B", "Yes, never give up!", "بله، هرگز تسلیم نشو!")
        ),
        listOf(
            q("Where was B born?", listOf("USA", "small city", "UK"), 1),
            q("First job?", listOf("manager", "waiter", "teacher"), 1),
            q("I ___ tired yesterday.", listOf("am", "was", "were"), 1),
            q("They ___ at home.", listOf("was", "were", "am"), 1)
        ),
        idioms = listOf(IdiomExpression("Never give up", "هرگز تسلیم نشو", "Never give up!", "هرگز تسلیم نشو!")),
        pron = listOf(PronunciationTip("Was/Were", "Weak: /wəz/, /wər/")),
        cult = listOf(CulturalNote("Success", "Comes from hard work.")),
        mis = listOf(CommonMistake("I were tired.", "I was tired.", "Use 'was' with I."))
    )

    // ═══════════ PRACTICAL ENGLISH 9 ═══════════
    private fun pe9() = base(35, "PE9 What's the weather like?", "انگلیسی کاربردی ۹ — هوا چطوره؟",
        listOf("Talk about weather", "Use weather expressions", "Make small talk"),
        listOf(
            v("weather", "هوا", "What's the weather like?", "هوا چطوره؟"),
            v("sunny", "آفتابی", "It's sunny.", "آفتابیه.", "adjective"),
            v("raining", "بارانی", "It's raining.", "باران می‌آید.", "verb"),
            v("snowing", "برفی", "It's snowing.", "برف می‌آید.", "verb"),
            v("windy", "بادی", "It's windy.", "بادی است.", "adjective"),
            v("cloudy", "ابری", "It's cloudy.", "ابری است.", "adjective")
        ),
        listOf(
            GrammarSection("Weather", "It's raining. It's sunny. It's cold. What's the weather like?"),
            GrammarSection("Small talk", "Nice weather today! It's cold, isn't it?")
        ),
        listOf(
            d("A", "What's the weather like today?", "هوا امروز چطوره؟"),
            d("B", "It's raining. Take an umbrella.", "باران می‌آید. چتر بردار."),
            d("A", "Really? Yesterday it was sunny.", "واقعاً؟ دیروز آفتابی بود."),
            d("B", "I know. Weather changes fast.", "می‌دانم. هوا سریع تغییر می‌کند."),
            d("A", "What's your favorite season?", "فصل مورد علاقه‌ات چیست؟"),
            d("B", "Summer. I love hot weather.", "تابستان. هوای گرم دوست دارم."),
            d("A", "Me too. I don't like winter.", "من هم. زمستان دوست ندارم."),
            d("B", "Winter is too cold for me!", "زمستان برایم خیلی سرد است!"),
            d("A", "But snow is beautiful!", "ولی برف زیباست!"),
            d("B", "Yes, but I prefer sun!", "بله، ولی آفتاب را ترجیح می‌دهم!")
        ),
        listOf(
            q("What's the weather like?", listOf("sunny", "raining", "snowing"), 1),
            q("What's B's favorite season?", listOf("spring", "summer", "winter"), 1),
            q("It ___ raining.", listOf("am", "is", "are"), 1),
            q("It's ___ today.", listOf("sun", "sunny", "sunshine"), 1)
        ),
        idioms = listOf(IdiomExpression("Weather changes fast", "هوا سریع تغییر می‌کند", "Weather changes fast.", "هوا سریع تغییر می‌کند.")),
        pron = listOf(PronunciationTip("Weather", "/ˈweðər/")),
        cult = listOf(CulturalNote("Small talk", "Weather is common topic.")),
        mis = listOf(CommonMistake("It raining.", "It's raining.", "Add 'is'."))
    )

    // ═══════════ REVIEW & CHECK 9 ═══════════
    private fun rc9() = base(36, "R&C 9", "مرور ۹",
        listOf("Review there is/are", "Review was/were", "Review weather"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("There is/are", "There is a river. There are trees."),
            GrammarSection("Was/Were", "I was. They were."),
            GrammarSection("Weather", "It's sunny. It's raining.")
        ),
        listOf(
            d("T", "Review time! Files 9.", "وقت مرور! فایل ۹."),
            d("A", "There is a river. There are trees.", "There is a river. There are trees."),
            d("B", "I was. They were.", "I was. They were."),
            d("T", "Weather?", "هوا؟"),
            d("A", "It's sunny. It's raining.", "It's sunny. It's raining."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("___ a river near the hotel.", listOf("There is", "There are", "Is"), 0),
            q("They ___ at home.", listOf("was", "were", "am"), 1),
            q("It's ___ today.", listOf("sun", "sunny", "sunshine"), 1),
            q("I ___ tired yesterday.", listOf("am", "was", "were"), 1)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Was/Were", "Weak forms.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("There is many trees.", "There are many trees.", "Plural = are."))
    )

    // ═══════════ FILE 10 ═══════════
    private fun f10A() = base(37, "10A It changed my life", "۱۰A زندگی‌ام را تغییر داد",
        listOf("Use past simple: regular verbs", "Talk about past events", "Use time expressions"),
        listOf(
            v("changed", "تغییر داد", "It changed my life.", "زندگی‌ام را تغییر داد.", "verb"),
            v("visited", "بازدید کرد", "We visited the museum.", "از موزه بازدید کردیم.", "verb"),
            v("worked", "کار کرد", "He worked in a hospital.", "در بیمارستان کار کرد.", "verb"),
            v("started", "شروع کرد", "I started a new job.", "شغل جدیدی شروع کردم.", "verb"),
            v("learned", "یاد گرفت", "I learned English.", "انگلیسی یاد گرفتم.", "verb"),
            v("moved", "نقل مکان کرد", "They moved to London.", "به لندن نقل مکان کردند.", "verb")
        ),
        listOf(
            GrammarSection("Past simple: regular verbs", "Add -ed: visit → visited, work → worked, start → started."),
            GrammarSection("Spelling", "like → liked, study → studied, stop → stopped.")
        ),
        listOf(
            d("A", "Did you travel last year?", "سال گذشته سفر کردی؟"),
            d("B", "Yes, I did. I visited an old house in Italy.", "بله. از یک خانه قدیمی در ایتالیا بازدید کردم."),
            d("A", "Did you like it?", "دوستش داشتی؟"),
            d("B", "I loved it. The house had a long history.", "عاشقش شدم. خانه تاریخچه طولانی داشت."),
            d("A", "How old was it?", "چند ساله بود؟"),
            d("B", "About 200 years old. A famous writer lived there.", "حدود ۲۰۰ سال. یک نویسنده معروف آنجا زندگی می‌کرد."),
            d("A", "Did you learn anything?", "چیزی یاد گرفتی؟"),
            d("B", "Yes, I learned a lot about Italian culture.", "بله، چیزهای زیادی درباره فرهنگ ایتالیا یاد گرفتم."),
            d("A", "That's a great souvenir. See you later.", "سوغات خوبیه. بعداً می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where did B travel?", listOf("France", "Italy", "Spain"), 1),
            q("How old was the house?", listOf("50", "100", "200"), 2),
            q("I ___ to Africa last year.", listOf("go", "went", "going"), 1),
            q("She ___ a new job.", listOf("start", "started", "starting"), 1)
        ),
        idioms = listOf(IdiomExpression("Change my life", "زندگی‌ام را تغییر دادن", "It changed my life.", "زندگی‌ام را تغییر داد.")),
        pron = listOf(PronunciationTip("-ed endings", "/t/, /d/, /ɪd/")),
        cult = listOf(CulturalNote("Travel", "Broadens perspective.")),
        mis = listOf(CommonMistake("Did you traveled?", "Did you travel?", "Base verb after did."))
    )

    private fun f10B() = base(38, "10B What did you do?", "۱۰B چیکار کردی؟",
        listOf("Use past simple: irregular verbs", "Talk about daily routines", "Ask past questions"),
        listOf(
            v("went", "رفت", "I went to the beach.", "به ساحل رفتم.", "verb"),
            v("saw", "دید", "I saw a movie.", "فیلمی دیدم.", "verb"),
            v("had", "داشت", "I had a great time.", "وقت خوبی داشتم.", "verb"),
            v("met", "ملاقات کرد", "I met my friends.", "دوستانم را دیدم.", "verb"),
            v("ate", "خورد", "I ate pizza.", "پیتزا خوردم.", "verb"),
            v("drank", "نوشید", "I drank coffee.", "قهوه نوشیدم.", "verb")
        ),
        listOf(
            GrammarSection("Irregular past simple", "go → went, see → saw, have → had, meet → met, eat → ate."),
            GrammarSection("Past questions", "What did you do? Where did you go?")
        ),
        listOf(
            d("A", "How was your weekend?", "آخر هفته‌ات چطور بود؟"),
            d("B", "Great! I went to the beach.", "عالی! به ساحل رفتم."),
            d("A", "What did you do?", "چیکار کردی؟"),
            d("B", "I swam and met some friends.", "شنا کردم و چند دوست دیدم."),
            d("A", "What did you eat?", "چی خوردی؟"),
            d("B", "We ate fish at a restaurant.", "در رستوران ماهی خوردیم."),
            d("A", "Sounds perfect!", "کامل به نظر می‌رسد!"),
            d("B", "It was! And you?", "بود! تو چطور؟"),
            d("A", "I stayed home and watched TV.", "خانه ماندم و تلویزیون تماشا کردم."),
            d("B", "That's relaxing too!", "اون هم آرامش‌بخشه!")
        ),
        listOf(
            q("Where did B go?", listOf("mountains", "beach", "park"), 1),
            q("What did B eat?", listOf("pizza", "fish", "chicken"), 1),
            q("I ___ to the beach.", listOf("go", "went", "gone"), 1),
            q("She ___ her friends.", listOf("meet", "met", "meeting"), 1)
        ),
        idioms = listOf(IdiomExpression("Have a great time", "وقت خوبی داشتن", "I had a great time.", "وقت خوبی داشتم.")),
        pron = listOf(PronunciationTip("Irregular past", "went, saw, had")),
        cult = listOf(CulturalNote("Weekends", "People share stories.")),
        mis = listOf(CommonMistake("I goed.", "I went.", "Irregular."))
    )

    // ═══════════ PRACTICAL ENGLISH 10 ═══════════
    private fun pe10() = base(39, "PE10 What do you think of it?", "انگلیسی کاربردی ۱۰ — نظرت چیه؟",
        listOf("Give opinions", "Use opinion words", "Agree/disagree"),
        listOf(
            v("think", "فکر کردن", "I think it's good.", "فکر می‌کنم خوبه.", "verb"),
            v("agree", "موافق بودن", "I agree.", "موافقم.", "verb"),
            v("disagree", "مخالف بودن", "I disagree.", "مخالفم.", "verb"),
            v("opinion", "نظر", "In my opinion...", "به نظر من..."),
            v("great", "عالی", "It's great.", "عالیه.", "adjective"),
            v("terrible", "افتضاح", "It's terrible.", "افتضاحه.", "adjective")
        ),
        listOf(
            GrammarSection("Opinions", "I think... In my opinion... I agree/disagree."),
            GrammarSection("Agreement", "I agree with you. You're right. Exactly.")
        ),
        listOf(
            d("A", "What do you think of the movie?", "نظرت درباره فیلم چیه؟"),
            d("B", "I think it was great. What about you?", "فکر می‌کنم عالی بود. تو چطور؟"),
            d("A", "I disagree. It was too long.", "مخالفم. خیلی طولانی بود."),
            d("B", "Really? I liked the story.", "واقعاً؟ داستانش را دوست داشتم."),
            d("A", "The story was good. But three hours!", "داستان خوب بود. ولی سه ساعت!"),
            d("B", "OK, you're right. It was long.", "باشه، حق با توست. طولانی بود."),
            d("A", "But the actors were amazing.", "ولی بازیگرها فوق‌العاده بودند."),
            d("B", "I agree! They were fantastic.", "موافقم! فوق‌العاده بودند."),
            d("A", "So, good movie, but too long.", "پس فیلم خوب، ولی خیلی طولانی."),
            d("B", "Exactly! That's my opinion too.", "دقیقاً! نظر من هم همینه.")
        ),
        listOf(
            q("What does B think?", listOf("bad", "great", "long"), 1),
            q("What does A think?", listOf("great", "too long", "boring"), 1),
            q("I ___ with you.", listOf("agree", "agrees", "agreeing"), 0),
            q("You're ___.", listOf("right", "rightly", "rightness"), 0)
        ),
        idioms = listOf(
            IdiomExpression("You're right", "حق با توست", "You're right.", "حق با توست."),
            IdiomExpression("In my opinion", "به نظر من", "In my opinion...", "به نظر من...")
        ),
        pron = listOf(PronunciationTip("Opinions", "I THINK, I aGREE")),
        cult = listOf(CulturalNote("Opinions", "Expressing politely.")),
        mis = listOf(CommonMistake("I agree you.", "I agree with you.", "Add 'with'."))
    )

    // ═══════════ REVIEW & CHECK 10 ═══════════
    private fun rc10() = base(40, "R&C 10", "مرور ۱۰",
        listOf("Review past simple", "Review opinions", "Review travel"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Past simple", "Regular and irregular verbs."),
            GrammarSection("Opinions", "I think... I agree... In my opinion..."),
            GrammarSection("Travel", "visited, went, saw, ate.")
        ),
        listOf(
            d("T", "Review time! Files 10.", "وقت مرور! فایل ۱۰."),
            d("A", "Past simple. I visited, I went.", "حال گذشته. I visited، I went."),
            d("B", "I think, I agree, In my opinion.", "I think، I agree، In my opinion."),
            d("T", "Travel words?", "کلمات سفر؟"),
            d("A", "Visited, went, saw, ate.", "Visited، went، saw، ate."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("Past of 'go'?", listOf("goed", "went", "gone"), 1),
            q("I ___ with you.", listOf("agree", "agrees", "agreeing"), 0),
            q("She ___ a new job.", listOf("start", "started", "starting"), 1),
            q("They ___ to London.", listOf("move", "moved", "moving"), 1)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Past -ed", "/t/, /d/, /ɪd/")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I goed to beach.", "I went to beach.", "Irregular."))
    )

    // ═══════════ FILE 11 ═══════════
    private fun f11A() = base(41, "11A Object pronouns", "۱۱A ضمایر مفعولی",
        listOf("Use object pronouns", "Use opinion words", "Talk about things"),
        listOf(
            v("me", "من", "Help me!", "کمکم کن!"),
            v("you", "تو", "I like you.", "دوستت دارم."),
            v("him", "او (مرد)", "I know him.", "می‌شناسمش."),
            v("her", "او (زن)", "I like her.", "دوستش دارم."),
            v("it", "آن", "I bought it.", "خریدمش."),
            v("them", "آن‌ها", "I saw them.", "دیدمشون.")
        ),
        listOf(
            GrammarSection("Object pronouns", "me, you, him, her, it, us, them. I like them. She called me."),
            GrammarSection("After verbs and prepositions", "I know him. Look at her. Listen to them.")
        ),
        listOf(
            d("A", "Do you know Tom?", "تام رو می‌شناسی؟"),
            d("B", "Yes, I know him. He's my friend.", "بله، می‌شناسمش. دوستمه."),
            d("A", "And Maria?", "و ماریا؟"),
            d("B", "I like her. She's very nice.", "دوستش دارم. خیلی خوبه."),
            d("A", "Do you like them together?", "ازشون با هم خوشت میاد؟"),
            d("B", "Yes! They're a great couple.", "بله! زوج عالی هستن."),
            d("A", "I agree. I saw them yesterday.", "موافقم. دیروز دیدمشون."),
            d("B", "Really? Where?", "واقعاً؟ کجا؟"),
            d("A", "At the cafe. I said hello to them.", "در کافه. بهشون سلام کردم."),
            d("B", "Nice!", "خوبه!")
        ),
        listOf(
            q("Does B know Tom?", listOf("no", "yes", "maybe"), 1),
            q("Does B like Maria?", listOf("no", "yes", "a little"), 1),
            q("I know ___. (he)", listOf("he", "him", "his"), 1),
            q("I saw ___. (she)", listOf("she", "her", "hers"), 1)
        ),
        idioms = listOf(IdiomExpression("A great couple", "زوج عالی", "They're a great couple.", "زوج عالی هستن.")),
        pron = listOf(PronunciationTip("Object pronouns", "Weak forms: him /ɪm/, her /ər/, them /ðəm/")),
        cult = listOf(CulturalNote("Pronouns", "Important for natural speech.")),
        mis = listOf(CommonMistake("I like she.", "I like her.", "Use object pronoun."))
    )

    private fun f11B() = base(42, "11B Strangers on a train", "۱۱B غریبه‌ها در قطار",
        listOf("Use past simple: more irregular verbs", "Tell a story", "Use past questions"),
        listOf(
            v("took", "گرفت", "He took the train.", "او قطار گرفت.", "verb"),
            v("gave", "داد", "She gave me a book.", "او به من کتابی داد.", "verb"),
            v("told", "گفت", "He told me a story.", "او به من داستانی گفت.", "verb"),
            v("found", "پیدا کرد", "I found a wallet.", "یک کیف پول پیدا کردم.", "verb"),
            v("left", "ترک کرد", "She left the train.", "او قطار را ترک کرد.", "verb"),
            v("sat", "نشست", "I sat next to him.", "کنارش نشستم.", "verb")
        ),
        listOf(
            GrammarSection("Irregular past simple", "take → took, give → gave, tell → told, find → found, leave → left, sit → sat."),
            GrammarSection("Telling a story", "First, then, after that, finally.")
        ),
        listOf(
            d("A", "Did you have a good trip?", "سفر خوبی داشتی؟"),
            d("B", "Yes, I did. I met a stranger on the train.", "بله. در قطار با یک غریبه آشنا شدم."),
            d("A", "What happened?", "چی شد؟"),
            d("B", "He sat next to me and we talked.", "کنارم نشست و صحبت کردیم."),
            d("A", "What did you talk about?", "درباره چی صحبت کردید؟"),
            d("B", "Travel, work, life. He told me interesting stories.", "سفر، کار، زندگی. داستان‌های جالبی گفت."),
            d("A", "Did you exchange numbers?", "شماره‌ها را رد و بدل کردید؟"),
            d("B", "Yes! We're friends now. He gave me his number.", "بله! الان دوستیم. شماره‌اش را داد."),
            d("A", "That's amazing!", "شگفت‌انگیزه!"),
            d("B", "Yes! Strangers can become friends.", "بله! غریبه‌ها می‌تونن دوست بشن.")
        ),
        listOf(
            q("Who did B meet?", listOf("a friend", "a stranger", "a teacher"), 1),
            q("What did they talk about?", listOf("sports", "travel & life", "school"), 1),
            q("He ___ next to me.", listOf("sit", "sat", "sitting"), 1),
            q("She ___ me a book.", listOf("give", "gave", "giving"), 1)
        ),
        idioms = listOf(IdiomExpression("Exchange numbers", "شماره رد و بدل کردن", "We exchanged numbers.", "شماره رد و بدل کردیم.")),
        pron = listOf(PronunciationTip("Irregular past", "took, gave, told, found, left, sat")),
        cult = listOf(CulturalNote("Strangers", "Can become friends.")),
        mis = listOf(CommonMistake("He gived me.", "He gave me.", "Irregular."))
    )

    // ═══════════ PRACTICAL ENGLISH 11 ═══════════
    private fun pe11() = base(43, "PE11 What's on TV?", "انگلیسی کاربردی ۱۱ — تلویزیون چی داره؟",
        listOf("Talk about TV shows", "Use opinion words", "Make suggestions"),
        listOf(
            v("TV", "تلویزیون", "What's on TV?", "تلویزیون چی داره؟"),
            v("show", "برنامه", "A good show.", "برنامه خوب."),
            v("movie", "فیلم", "A great movie.", "فیلم عالی."),
            v("news", "اخبار", "The news is on.", "اخبار پخش می‌شود."),
            v("watch", "تماشا کردن", "I watch TV.", "تلویزیون تماشا می‌کنم.", "verb"),
            v("channel", "کانال", "Which channel?", "کدام کانال؟")
        ),
        listOf(
            GrammarSection("TV vocabulary", "show, movie, news, channel."),
            GrammarSection("Suggestions", "Let's watch... How about...? What about...?")
        ),
        listOf(
            d("A", "What's on TV tonight?", "امشب تلویزیون چی داره؟"),
            d("B", "There's a movie at 8.", "ساعت ۸ یک فیلم هست."),
            d("A", "What kind of movie?", "چه فیلمی؟"),
            d("B", "A comedy. Do you like comedies?", "کمدی. کمدی دوست داری؟"),
            d("A", "Yes! I love them. Let's watch it.", "بله! عاشقشونم. بیا ببینیمش."),
            d("B", "Great. And there's the news at 7.", "عالی. و اخبار ساعت ۷ هست."),
            d("A", "I don't like the news. Too sad.", "اخبار دوست ندارم. خیلی غمگینه."),
            d("B", "Me neither. Let's just watch the movie.", "من هم. بیا فقط فیلم ببینیم."),
            d("A", "Perfect. I'll make popcorn!", "عالی. من ذرت بوداده درست می‌کنم!"),
            d("B", "Sounds like a great evening!", "عصر عالی به نظر می‌رسد!")
        ),
        listOf(
            q("What's on TV at 8?", listOf("news", "movie", "sports"), 1),
            q("What kind of movie?", listOf("horror", "comedy", "drama"), 1),
            q("Let's ___ it.", listOf("watch", "watching", "watched"), 0),
            q("What's ___ TV?", listOf("on", "in", "at"), 0)
        ),
        idioms = listOf(IdiomExpression("Sounds like a great evening", "عصر عالی به نظر می‌رسد", "Sounds like a great evening!", "عصر عالی به نظر می‌رسد!")),
        pron = listOf(PronunciationTip("TV shows", "COMedy, the NEWS")),
        cult = listOf(CulturalNote("TV", "People watch different shows.")),
        mis = listOf(CommonMistake("What's in TV?", "What's on TV?", "Use 'on'."))
    )

    // ═══════════ REVIEW & CHECK 11 ═══════════
    private fun rc11() = base(44, "R&C 11", "مرور ۱۱",
        listOf("Review object pronouns", "Review irregular past", "Review TV"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Object pronouns", "me, you, him, her, it, us, them."),
            GrammarSection("Irregular past", "take → took, give → gave, tell → told."),
            GrammarSection("TV vocabulary", "show, movie, news, channel.")
        ),
        listOf(
            d("T", "Review time! Files 11.", "وقت مرور! فایل ۱۱."),
            d("A", "Me, you, him, her, it, us, them.", "Me، you، him، her، it، us، them."),
            d("B", "Took, gave, told, found.", "Took، gave، told، found."),
            d("T", "TV words?", "کلمات تلویزیون؟"),
            d("A", "Show, movie, news, channel.", "Show، movie، news، channel."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("I know ___. (he)", listOf("he", "him", "his"), 1),
            q("She ___ me a book.", listOf("give", "gave", "giving"), 1),
            q("What's ___ TV?", listOf("on", "in", "at"), 0),
            q("Let's ___ a movie.", listOf("watch", "watching", "watched"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Object pronouns", "Weak forms.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I like she.", "I like her.", "Use object pronoun."))
    )

    // ═══════════ FILE 12 ═══════════
    private fun f12A() = base(45, "12A Present perfect", "۱۲A حال کامل",
        listOf("Use present perfect", "Talk about experiences", "Use ever/never"),
        listOf(
            v("ever", "هرگز", "Have you ever been?", "تا حالا بوده‌ای؟", "adverb"),
            v("never", "هرگز", "Never been.", "هرگز نبوده‌ام.", "adverb"),
            v("been", "بوده", "I've been to Japan.", "در ژاپن بوده‌ام.", "verb"),
            v("seen", "دیده", "I've seen it.", "دیده‌ام.", "verb"),
            v("tried", "امتحان کرده", "I've tried sushi.", "سوشی امتحان کرده‌ام.", "verb"),
            v("visited", "بازدید کرده", "I've visited France.", "از فرانسه بازدید کرده‌ام.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect", "have/has + past participle. I've seen it. She's visited Paris."),
            GrammarSection("Ever/Never", "Have you ever...? I've never...")
        ),
        listOf(
            d("A", "Have you ever been to Japan?", "تا حالا ژاپن بوده‌ای؟"),
            d("B", "Yes, I have. Twice.", "بله. دو بار."),
            d("A", "Wow! Have you tried sushi?", "واو! سوشی امتحان کردی؟"),
            d("B", "Of course! It's delicious.", "البته! خوشمزه‌ست."),
            d("A", "Have you ever seen Mount Fuji?", "تا حالا کوه فوجی را دیده‌ای؟"),
            d("B", "Yes, it's beautiful. Have you ever been?", "بله، زیباست. تو بوده‌ای؟"),
            d("A", "No, I've never been. But I want to go.", "نه، هرگز. ولی می‌خواهم بروم."),
            d("B", "You should! You'll love it.", "باید! عاشقش می‌شوی."),
            d("A", "Maybe next year!", "شاید سال بعد!"),
            d("B", "I hope so!", "امیدوارم!")
        ),
        listOf(
            q("Has B been to Japan?", listOf("no", "yes twice", "once"), 1),
            q("Has A been to Japan?", listOf("yes", "no", "maybe"), 1),
            q("Have you ever ___ to Japan?", listOf("be", "been", "being"), 1),
            q("I've ___ tried sushi.", listOf("ever", "never", "already"), 1)
        ),
        idioms = listOf(IdiomExpression("I hope so", "امیدوارم", "I hope so!", "امیدوارم!")),
        pron = listOf(PronunciationTip("I've", "/aɪv/")),
        cult = listOf(CulturalNote("Travel", "Broadens perspective.")),
        mis = listOf(CommonMistake("I've went.", "I've been.", "Past participle."))
    )

    private fun f12B() = base(46, "12B Present perfect or past simple?", "۱۲B حال کامل یا گذشته ساده؟",
        listOf("Use present perfect vs past simple", "Talk about experiences", "Use time expressions"),
        listOf(
            v("already", "قبلاً", "I've already done it.", "قبلاً انجامش داده‌ام.", "adverb"),
            v("yet", "هنوز", "I haven't done it yet.", "هنوز انجامش نداده‌ام.", "adverb"),
            v("just", "تازه", "I've just arrived.", "تازه رسیده‌ام.", "adverb"),
            v("yesterday", "دیروز", "I saw it yesterday.", "دیروز دیدمش."),
            v("last week", "هفته پیش", "I went last week.", "هفته پیش رفتم."),
            v("ago", "پیش", "Two years ago.", "دو سال پیش.")
        ),
        listOf(
            GrammarSection("Present perfect vs past simple", "I've been to Japan (experience). I went there in 2020 (specific time)."),
            GrammarSection("Already/Yet/Just", "I've already done it. I haven't seen it yet. I've just arrived.")
        ),
        listOf(
            d("A", "Have you seen the new movie?", "فیلم جدید رو دیدی؟"),
            d("B", "Yes, I've already seen it.", "بله، قبلاً دیدمش."),
            d("A", "When did you see it?", "کی دیدیش؟"),
            d("B", "I saw it last week.", "هفته پیش دیدمش."),
            d("A", "Was it good?", "خوب بود؟"),
            d("B", "Yes, very good. Have you seen it yet?", "بله، خیلی خوب. تو هنوز ندیدی؟"),
            d("A", "No, not yet. I want to see it.", "نه، هنوز نه. می‌خوام ببینمش."),
            d("B", "You should! I've just bought the DVD.", "باید ببینی! تازه دی‌وی‌دی‌اش رو خریدم."),
            d("A", "Great! Let's watch it together.", "عالی! بیا با هم ببینیم."),
            d("B", "Perfect!", "عالی!")
        ),
        listOf(
            q("Has B seen the movie?", listOf("no", "yes", "maybe"), 1),
            q("When did B see it?", listOf("yesterday", "last week", "last month"), 1),
            q("I've ___ seen it.", listOf("yet", "already", "ever"), 1),
            q("I haven't seen it ___.", listOf("yet", "already", "just"), 0)
        ),
        idioms = listOf(IdiomExpression("Let's watch it together", "بیا با هم ببینیم", "Let's watch it together.", "بیا با هم ببینیم.")),
        pron = listOf(PronunciationTip("Present perfect", "I've already, I've just")),
        cult = listOf(CulturalNote("Movies", "Common entertainment.")),
        mis = listOf(CommonMistake("I've seen it last week.", "I saw it last week.", "Past simple with specific time."))
    )

    // ═══════════ PRACTICAL ENGLISH 12 ═══════════
    private fun pe12() = base(47, "PE12 Goodbye!", "انگلیسی کاربردی ۱۲ — خداحافظ!",
        listOf("Say goodbye", "Talk about future plans", "Use farewell expressions"),
        listOf(
            v("goodbye", "خداحافظ", "Goodbye!", "خداحافظ!", "interjection"),
            v("good luck", "موفق باشی", "Good luck!", "موفق باشی!", "phrase"),
            v("keep in touch", "در تماس باش", "Keep in touch.", "در تماس باش.", "verb"),
            v("miss", "دلتنگ شدن", "I'll miss you.", "دلتنگت می‌شوم.", "verb"),
            v("hope", "امیدوار بودن", "I hope to see you.", "امیدوارم ببینمت.", "verb"),
            v("soon", "به‌زودی", "See you soon!", "به‌زودی می‌بینمت!", "adverb")
        ),
        listOf(
            GrammarSection("Farewell expressions", "Goodbye. Good luck. Keep in touch. See you soon."),
            GrammarSection("Future plans", "I'm going to... I will...")
        ),
        listOf(
            d("A", "Is this your last class?", "آخرین کلاسته؟"),
            d("B", "Yes. I've finished the course!", "بله. دوره را تمام کرده‌ام!"),
            d("A", "Congratulations! What will you do now?", "تبریک! الان چیکار می‌کنی؟"),
            d("B", "I'm going to study for the next level.", "قرار است برای سطح بعدی درس بخوانم."),
            d("A", "Great! Keep in touch.", "عالی! در تماس باش."),
            d("B", "Of course. I'll miss this class.", "البته. دلتنگ این کلاس می‌شوم."),
            d("A", "Good luck with everything!", "موفق باشی در همه چیز!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye! Take care!", "خداحافظ! مراقب خودت باش!")
        ),
        listOf(
            q("Has B finished the course?", listOf("no", "yes", "almost"), 1),
            q("What will B do next?", listOf("travel", "study", "work"), 1),
            q("I'll ___ you.", listOf("miss", "missing", "missed"), 0),
            q("Keep in ___!", listOf("touch", "talk", "contact"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Good luck!", "موفق باشی!", "Good luck!", "موفق باشی!"),
            IdiomExpression("Keep in touch", "در تماس باش", "Keep in touch!", "در تماس باش!"),
            IdiomExpression("Take care", "مراقب خودت باش", "Take care!", "مراقب خودت باش!")
        ),
        pron = listOf(PronunciationTip("Goodbye", "Rising: See you SOON ↗")),
        cult = listOf(CulturalNote("Goodbyes", "Hug or handshake varies.")),
        mis = listOf(CommonMistake("I'll miss to you.", "I'll miss you.", "No 'to'."))
    )

    // ═══════════ REVIEW & CHECK 12 ═══════════
    private fun rc12() = base(48, "R&C 12", "مرور ۱۲",
        listOf("Review present perfect", "Review past simple", "Review farewells"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present perfect", "I've been. I've seen. Have you ever...?"),
            GrammarSection("Past simple", "I went. I saw. I visited."),
            GrammarSection("Farewells", "Goodbye. Good luck. Keep in touch.")
        ),
        listOf(
            d("T", "Final review! Files 12.", "مرور نهایی! فایل ۱۲."),
            d("A", "I've been, I've seen.", "I've been، I've seen."),
            d("B", "I went, I saw, I visited.", "I went، I saw، I visited."),
            d("T", "Farewells?", "خداحافظی‌ها؟"),
            d("A", "Goodbye, good luck, keep in touch.", "Goodbye، good luck، keep in touch."),
            d("T", "Excellent! You've learned so much this year!", "عالی! امسال خیلی یاد گرفتید!"),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Congratulations! You finished Starter!", "تبریک! استارتر را تمام کردید!"),
            d("B", "We're ready for Level 1!", "برای سطح ۱ آماده‌ایم!"),
            d("T", "Yes, you are! Good luck!", "بله! موفق باشید!")
        ),
        listOf(
            q("Which is present perfect?", listOf("I went", "I've been", "I visit"), 1),
            q("Which is past simple?", listOf("I've seen", "I saw", "I see"), 1),
            q("I'll ___ you.", listOf("miss", "missing", "missed"), 0),
            q("Keep in ___!", listOf("touch", "talk", "contact"), 0)
        ),
        idioms = listOf(IdiomExpression("Congratulations!", "تبریک!", "Congratulations!", "تبریک!")),
        pron = listOf(PronunciationTip("Contractions", "I've, I'll, I'm")),
        cult = listOf(CulturalNote("End of course", "Congratulations!"))
        ,
        mis = listOf(CommonMistake("I've went.", "I've been.", "Past participle."))
    )
}