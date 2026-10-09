package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 4th Edition — Starter
 * 12 Files × 3 Lessons (A/B/C) = 36 Lessons | Beginner (A1)
 */
object AmericanEnglishFile4thStarter {
    const val BOOK_ID = "american_english_file_4th_starter"

    fun getContent(n: Int): LessonContent = when (n) {
        1 -> f1A(); 2 -> f1B(); 3 -> f1C()
        4 -> f2A(); 5 -> f2B(); 6 -> f2C()
        7 -> f3A(); 8 -> f3B(); 9 -> f3C()
        10 -> f4A(); 11 -> f4B(); 12 -> f4C()
        13 -> f5A(); 14 -> f5B(); 15 -> f5C()
        16 -> f6A(); 17 -> f6B(); 18 -> f6C()
        19 -> f7A(); 20 -> f7B(); 21 -> f7C()
        22 -> f8A(); 23 -> f8B(); 24 -> f8C()
        25 -> f9A(); 26 -> f9B(); 27 -> f9C()
        28 -> f10A(); 29 -> f10B(); 30 -> f10C()
        31 -> f11A(); 32 -> f11B(); 33 -> f11C()
        34 -> f12A(); 35 -> f12B(); 36 -> f12C()
        else -> LessonContent(
            BOOK_ID, n, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList()
        )
    }

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

    // ═══════════════ FILE 1 ═══════════════
    private fun f1A() = base(
        1, "1A — Hello!", "۱A — سلام!",
        listOf("Greet people", "Use verb be (I, you)", "Say numbers 0-5"),
        listOf(
            v("hello", "سلام", "Hello, I'm Tom.", "سلام، من تامم.", "interjection"),
            v("hi", "سلام", "Hi, Anna!", "سلام آنّا!", "interjection"),
            v("name", "نام", "My name is Tom.", "نام من تام است."),
            v("nice to meet you", "خوشحالم", "Nice to meet you.", "از آشنایی خوشحالم."),
            v("goodbye", "خداحافظ", "Goodbye!", "خداحافظ!", "interjection"),
            v("coffee", "قهوه", "A coffee, please.", "یک قهوه، لطفاً.")
        ),
        listOf(
            GrammarSection("Verb be: I / you", "I am Tom. You are Anna. Contractions: I'm, you're."),
            GrammarSection("Numbers 0-5", "zero, one, two, three, four, five.")
        ),
        listOf(
            d("A", "Hello. I'm Tom.", "سلام. من تامم."),
            d("B", "Hi, Tom. I'm Anna.", "سلام تام. من آنّام."),
            d("A", "Nice to meet you, Anna.", "از آشنایی خوشحالم آنّا."),
            d("B", "Nice to meet you, too. A coffee?", "من هم خوشحالم. قهوه؟"),
            d("A", "Yes, please.", "بله، لطفاً."),
            d("B", "Here you are.", "بفرمایید."),
            d("A", "Thank you. Goodbye!", "ممنون. خداحافظ!"),
            d("B", "Goodbye!", "خداحافظ!")
        ),
        listOf(
            q("Who is Tom?", listOf("a teacher", "a man", "a woman"), 1),
            q("What does Tom order?", listOf("tea", "coffee", "water"), 1),
            q("___ am Tom.", listOf("I", "You", "He"), 0),
            q("Contraction of 'I am'?", listOf("I'm", "I're", "I's"), 0)
        ),
        idioms = listOf(IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you!", "از آشنایی خوشحالم!")),
        pron = listOf(PronunciationTip("Contractions", "I'm /aɪm/, you're /jʊr/")),
        cult = listOf(CulturalNote("First names", "English speakers use first names immediately.")),
        mis = listOf(CommonMistake("I is Tom.", "I am Tom.", "Use 'am' with I."))
    )

    private fun f1B() = base(
        2, "1B — What's your name?", "۱B — نامت چیست؟",
        listOf("Use verb be (he, she, it)", "Use my/your/his/her", "Say numbers 6-10"),
        listOf(
            v("man", "مرد", "He's a man.", "او یک مرد است."),
            v("woman", "زن", "She's a woman.", "او یک زن است."),
            v("teacher", "معلم", "She's a teacher.", "او معلم است."),
            v("student", "دانشجو", "He's a student.", "او دانشجو است."),
            v("phone", "تلفن", "What's your phone number?", "شماره تلفنت چیست؟"),
            v("friend", "دوست", "He's my friend.", "او دوست من است.")
        ),
        listOf(
            GrammarSection("Verb be: he/she/it", "He is / She is / It is. Contractions: he's, she's, it's."),
            GrammarSection("Possessive adjectives", "my, your, his, her. My name... His name..."),
            GrammarSection("Numbers 6-10", "six, seven, eight, nine, ten.")
        ),
        listOf(
            d("A", "What's your name?", "نامت چیست؟"),
            d("B", "My name is Helen.", "نام من هلن است."),
            d("A", "And who's he?", "و او کیست؟"),
            d("B", "He's my friend Tom.", "او دوستم تام است."),
            d("A", "Is she your teacher?", "او معلمت است؟"),
            d("B", "Yes, she's my English teacher.", "بله، او معلم انگلیسی من است."),
            d("A", "What's her name?", "نامش چیست؟"),
            d("B", "Her name is Carla.", "نامش کارلاست.")
        ),
        listOf(
            q("Who is Tom?", listOf("teacher", "friend", "student"), 1),
            q("What's the teacher's name?", listOf("Helen", "Carla", "Anna"), 1),
            q("___ is my friend.", listOf("He", "She", "It"), 0),
            q("This is Carla. ___ name is Carla.", listOf("His", "Her", "Its"), 1)
        ),
        idioms = listOf(IdiomExpression("Who's he?", "او کیست؟", "Who's he?", "او کیست؟")),
        pron = listOf(PronunciationTip("He's/She's", "he's /hiːz/, she's /ʃiːz/")),
        cult = listOf(CulturalNote("Titles", "Mr, Mrs, Ms are used in formal situations.")),
        mis = listOf(CommonMistake("He are Tom.", "He is Tom.", "Use 'is' with he/she/it."))
    )

    private fun f1C() = base(
        3, "1C — How are you?", "۱C — حالت چطوره؟",
        listOf("Ask and answer How are you?", "Say days of the week", "Say goodbye"),
        listOf(
            v("fine", "خوب", "I'm fine, thanks.", "خوبم، ممنون.", "adjective"),
            v("OK", "خوب", "I'm OK.", "خوبم.", "adjective"),
            v("great", "عالی", "I'm great!", "عالی‌ام!", "adjective"),
            v("tired", "خسته", "I'm tired.", "خسته‌ام.", "adjective"),
            v("Monday", "دوشنبه", "See you Monday.", "دوشنبه می‌بینمت."),
            v("Friday", "جمعه", "Friday is great.", "جمعه عالیه.")
        ),
        listOf(
            GrammarSection("How are you?", "How are you? I'm fine, thanks. / I'm OK. / I'm great."),
            GrammarSection("Days of the week", "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.")
        ),
        listOf(
            d("A", "Hi, Tom. How are you?", "سلام تام. حالت چطوره؟"),
            d("B", "I'm fine, thanks. And you?", "خوبم، ممنون. تو چطور؟"),
            d("A", "I'm tired today.", "امروز خسته‌ام."),
            d("B", "Oh, I'm sorry. What day is it?", "اوه، متأسفم. چه روزیه؟"),
            d("A", "It's Monday.", "دوشنبه."),
            d("B", "See you on Friday!", "جمعه می‌بینمت!"),
            d("A", "Yes, see you Friday. Bye!", "بله، جمعه. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How is A today?", listOf("great", "tired", "sick"), 1),
            q("What day is it?", listOf("Monday", "Friday", "Sunday"), 0),
            q("How ___ you?", listOf("is", "are", "am"), 1),
            q("I ___ fine.", listOf("am", "is", "are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("How are you?", "حالت چطوره؟", "How are you?", "حالت چطوره؟"),
            IdiomExpression("See you", "می‌بینمت", "See you Friday!", "جمعه می‌بینمت!")
        ),
        pron = listOf(PronunciationTip("Fine intonation", "Falling: I'm FINE.")),
        cult = listOf(CulturalNote("How are you?", "Often just a greeting, not a real question.")),
        mis = listOf(CommonMistake("How you are?", "How are you?", "Verb before subject."))
    )

    // ═══════════════ FILE 2 ═══════════════
    private fun f2A() = base(
        4, "2A — What's in your bag?", "۲A — چی توی کیفت داری؟",
        listOf("Talk about objects", "Use this/that", "Use a/an"),
        listOf(
            v("bag", "کیف", "What's in your bag?", "چی توی کیفت داری؟"),
            v("book", "کتاب", "This is a book.", "این یک کتاب است."),
            v("phone", "موبایل", "My phone is new.", "موبایلم جدیده."),
            v("keys", "کلیدها", "These are my keys.", "این‌ها کلیدهام هستن."),
            v("watch", "ساعت", "A nice watch.", "ساعت قشنگی."),
            v("umbrella", "چتر", "An umbrella.", "یک چتر.")
        ),
        listOf(
            GrammarSection("this / that", "this (near): This is my phone. that (far): That's your bag."),
            GrammarSection("a / an", "a before consonants: a book. an before vowels: an umbrella.")
        ),
        listOf(
            d("A", "What's in your bag?", "چی توی کیفت داری؟"),
            d("B", "This is my phone. And this is a book.", "این موبایلم. و این یک کتاب."),
            d("A", "What's that?", "آن چیست؟"),
            d("B", "That's my watch.", "آن ساعت من است."),
            d("A", "Nice. Is this an umbrella?", "قشنگه. این چتره؟"),
            d("B", "Yes, it's my umbrella. It's raining today.", "بله، چترمه. امروز باران می‌آید."),
            d("A", "Good idea!", "فکر خوبی!")
        ),
        listOf(
            q("What's in B's bag?", listOf("a phone and a book", "a cat", "money"), 0),
            q("What's the weather like?", listOf("sunny", "raining", "snowing"), 1),
            q("___ is my phone. (near)", listOf("This", "That", "These"), 0),
            q("It's ___ umbrella.", listOf("a", "an", "the"), 1)
        ),
        idioms = listOf(IdiomExpression("What's that?", "آن چیست؟", "What's that?", "آن چیست؟")),
        pron = listOf(PronunciationTip("a/an", "a /ə/, an /ən/ in fast speech.")),
        cult = listOf(CulturalNote("Bags", "People often carry a bag with essentials.")),
        mis = listOf(CommonMistake("a umbrella", "an umbrella", "Use 'an' before vowels."))
    )

    private fun f2B() = base(
        5, "2B — Family", "۲B — خانواده",
        listOf("Talk about family", "Use possessive adjectives", "Use plural nouns"),
        listOf(
            v("family", "خانواده", "My family is big.", "خانواده‌ام بزرگه."),
            v("mother", "مادر", "My mother is a teacher.", "مادرم معلمه."),
            v("father", "پدر", "His father is a doctor.", "پدرش دکتره."),
            v("brother", "برادر", "I have two brothers.", "دو برادر دارم."),
            v("sister", "خواهر", "Her sister is nice.", "خواهرش خوبه."),
            v("parents", "والدین", "My parents live in London.", "والدینم در لندن زندگی می‌کنند.")
        ),
        listOf(
            GrammarSection("Possessive adjectives", "my, your, his, her. My mother, his father, her sister."),
            GrammarSection("Plural nouns", "brother → brothers, sister → sisters."),
            GrammarSection("have/has", "I have two brothers. She has one sister.")
        ),
        listOf(
            d("A", "Do you have a big family?", "خانواده بزرگی داری؟"),
            d("B", "Yes. I have two brothers and one sister.", "بله. دو برادر و یک خواهر دارم."),
            d("A", "What do your parents do?", "والدینت چه کار می‌کنند؟"),
            d("B", "My mother is a teacher. My father is a doctor.", "مادرم معلمه. پدرم دکتره."),
            d("A", "And your sister?", "و خواهرت؟"),
            d("B", "She's a student. Her name is Emma.", "او دانشجوست. اسمش اِماست."),
            d("A", "Nice family!", "خانواده خوبی!")
        ),
        listOf(
            q("How many brothers?", listOf("one", "two", "three"), 1),
            q("What's his mother's job?", listOf("doctor", "teacher", "nurse"), 1),
            q("___ mother is a teacher.", listOf("My", "I", "Me"), 0),
            q("She ___ one sister.", listOf("have", "has", "is"), 1)
        ),
        idioms = listOf(IdiomExpression("A big family", "خانواده بزرگ", "I have a big family.", "خانواده بزرگی دارم.")),
        pron = listOf(PronunciationTip("Plural -s", "brothers /ˈbrʌðərz/, sisters /ˈsɪstərz/")),
        cult = listOf(CulturalNote("Family", "Family size varies by culture.")),
        mis = listOf(CommonMistake("She have a sister.", "She has a sister.", "Use 'has' with she/he/it."))
    )

    private fun f2C() = base(
        6, "2C — Colors and things", "۲C — رنگ‌ها و چیزها",
        listOf("Talk about colors", "Use adjectives", "Describe objects"),
        listOf(
            v("color", "رنگ", "What color is it?", "چه رنگیه؟"),
            v("red", "قرمز", "A red bag.", "کیف قرمز.", "adjective"),
            v("blue", "آبی", "A blue phone.", "موبایل آبی.", "adjective"),
            v("green", "سبز", "A green book.", "کتاب سبز.", "adjective"),
            v("black", "مشکی", "A black watch.", "ساعت مشکی.", "adjective"),
            v("white", "سفید", "A white dress.", "لباس سفید.", "adjective")
        ),
        listOf(
            GrammarSection("Adjectives + nouns", "Adjective before noun: a red bag, a blue phone."),
            GrammarSection("What color...?", "What color is your bag? It's red.")
        ),
        listOf(
            d("A", "What color is your bag?", "کیفت چه رنگیه؟"),
            d("B", "It's black. And my phone is white.", "مشکیه. و موبایلم سفیده."),
            d("A", "I like white phones. Mine is blue.", "موبایل سفید دوست دارم. مال من آبیه."),
            d("B", "What color is your watch?", "ساعتت چه رنگیه؟"),
            d("A", "It's red. My favorite color.", "قرمزه. رنگ مورد علاقه‌ام."),
            d("B", "Nice! I like red too.", "قشنگه! من هم قرمز دوست دارم.")
        ),
        listOf(
            q("What color is B's bag?", listOf("red", "black", "white"), 1),
            q("What's A's favorite color?", listOf("blue", "red", "green"), 1),
            q("It's ___ red bag.", listOf("a", "an", "the"), 0),
            q("What color ___ your phone?", listOf("is", "are", "am"), 0)
        ),
        idioms = listOf(IdiomExpression("My favorite color", "رنگ مورد علاقه‌ام", "Red is my favorite color.", "قرمز رنگ مورد علاقه‌ام است.")),
        pron = listOf(PronunciationTip("Colors", "RED /red/, BLUE /bluː/, GREEN /ɡriːn/")),
        cult = listOf(CulturalNote("Colors", "Meanings vary by culture.")),
        mis = listOf(CommonMistake("a bag red", "a red bag", "Adjective before noun."))
    )

    // ═══════════════ FILE 3 ═══════════════
    private fun f3A() = base(
        7, "3A — Jobs", "۳A — شغل‌ها",
        listOf("Talk about jobs", "Present simple: I/you/we/they", "Talk about work"),
        listOf(
            v("job", "شغل", "What's your job?", "شغلت چیه؟"),
            v("teacher", "معلم", "I'm a teacher.", "من معلمم."),
            v("doctor", "پزشک", "She's a doctor.", "او دکتره."),
            v("student", "دانشجو", "He's a student.", "او دانشجوست."),
            v("work", "کار کردن", "I work in an office.", "در دفتر کار می‌کنم.", "verb"),
            v("office", "دفتر", "A big office.", "دفتر بزرگ.")
        ),
        listOf(
            GrammarSection("Present simple: I/you/we/they", "Base verb: I work, you work, we work, they work."),
            GrammarSection("Job questions", "What do you do? I'm a teacher. What's your job?")
        ),
        listOf(
            d("A", "What do you do?", "شغلت چیه؟"),
            d("B", "I'm a teacher. I teach English.", "معلمم. انگلیسی درس می‌دم."),
            d("A", "Where do you work?", "کجا کار می‌کنی؟"),
            d("B", "I work in a school. And you?", "در مدرسه کار می‌کنم. تو چطور؟"),
            d("A", "I'm a doctor. I work in a hospital.", "من دکترم. در بیمارستان کار می‌کنم."),
            d("B", "That's a hard job!", "شغل سختیه!"),
            d("A", "Yes, but I like it.", "بله، ولی دوستش دارم.")
        ),
        listOf(
            q("What does B do?", listOf("doctor", "teacher", "student"), 1),
            q("Where does A work?", listOf("school", "hospital", "office"), 1),
            q("I ___ in an office.", listOf("works", "work", "working"), 1),
            q("What ___ you do?", listOf("do", "does", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("What do you do?", "شغلت چیه؟", "What do you do?", "شغلت چیه؟")),
        pron = listOf(PronunciationTip("do you", "Weak: /də jə/")),
        cult = listOf(CulturalNote("Jobs", "Asking about jobs is common.")),
        mis = listOf(CommonMistake("What you do?", "What do you do?", "Use 'do'."))
    )

    private fun f3B() = base(
        8, "3B — A day in the life", "۳B — یک روز از زندگی",
        listOf("Present simple: he/she/it", "Talk about routines", "Tell the time"),
        listOf(
            v("get up", "بیدار شدن", "He gets up at 7.", "ساعت ۷ بیدار می‌شود.", "verb"),
            v("eat", "خوردن", "She eats breakfast.", "او صبحانه می‌خورد.", "verb"),
            v("drink", "نوشیدن", "He drinks coffee.", "او قهوه می‌نوشد.", "verb"),
            v("start", "شروع کردن", "She starts work at 9.", "ساعت ۹ کارش را شروع می‌کند.", "verb"),
            v("finish", "تمام کردن", "He finishes at 5.", "ساعت ۵ تمام می‌کند.", "verb"),
            v("watch", "تماشا کردن", "She watches TV.", "او تلویزیون تماشا می‌کند.", "verb")
        ),
        listOf(
            GrammarSection("Present simple: he/she/it", "Add -s or -es: works, eats, drinks, watches."),
            GrammarSection("Spelling rules", "watch → watches, study → studies, go → goes.")
        ),
        listOf(
            d("A", "What time does Maria get up?", "ماریا چه ساعتی بیدار می‌شود؟"),
            d("B", "She gets up at 6:30.", "ساعت ۶:۳۰ بیدار می‌شود."),
            d("A", "What does she eat for breakfast?", "برای صبحانه چی می‌خورد؟"),
            d("B", "She eats bread and eggs.", "نان و تخم‌مرغ می‌خورد."),
            d("A", "When does she start work?", "کی کارش را شروع می‌کند؟"),
            d("B", "She starts at 8:30.", "ساعت ۸:۳۰."),
            d("A", "What does she do in the evening?", "عصرها چیکار می‌کند؟"),
            d("B", "She watches TV and reads.", "تلویزیون می‌بیند و می‌خواند.")
        ),
        listOf(
            q("When does Maria get up?", listOf("6:00", "6:30", "7:00"), 1),
            q("What does she eat?", listOf("bread and eggs", "rice", "fruit"), 0),
            q("She ___ coffee every morning.", listOf("drink", "drinks", "drinking"), 1),
            q("He ___ TV in the evening.", listOf("watch", "watchs", "watches"), 2)
        ),
        idioms = listOf(IdiomExpression("In the evening", "عصرها", "In the evening, she reads.", "عصرها می‌خواند.")),
        pron = listOf(PronunciationTip("Third -s", "-s /s/, /z/, /ɪz/")),
        cult = listOf(CulturalNote("Routines", "Daily routines vary.")),
        mis = listOf(CommonMistake("She watch TV.", "She watches TV.", "Add -es."))
    )

    private fun f3C() = base(
        9, "3C — At the restaurant", "۳C — در رستوران",
        listOf("Order food", "Ask for the bill", "Polite requests"),
        listOf(
            v("menu", "منو", "The menu, please.", "منو لطفاً."),
            v("order", "سفارش دادن", "I'd like to order.", "می‌خواهم سفارش دهم.", "verb"),
            v("bill", "صورت‌حساب", "The bill, please.", "صورت‌حساب لطفاً."),
            v("water", "آب", "A glass of water.", "یک لیوان آب."),
            v("bread", "نان", "Some bread.", "مقداری نان."),
            v("chicken", "مرغ", "The chicken, please.", "مرغ لطفاً.")
        ),
        listOf(
            GrammarSection("Ordering food", "I'd like... Can I have...? A table for two, please."),
            GrammarSection("Polite requests", "I'd like the chicken. Can I have the bill?")
        ),
        listOf(
            d("W", "Good evening. A table for two?", "عصر بخیر. میز برای دو نفر؟"),
            d("A", "Yes, please. The menu?", "بله. منو؟"),
            d("W", "Here you are.", "بفرمایید."),
            d("A", "I'd like the chicken.", "مرغ می‌خواهم."),
            d("B", "I'd like the fish, please.", "ماهی لطفاً."),
            d("W", "Something to drink?", "نوشیدنی؟"),
            d("A", "Water, please.", "آب لطفاً."),
            d("B", "The bill, please.", "صورت‌حساب لطفاً.")
        ),
        listOf(
            q("What does A order?", listOf("chicken", "fish", "bread"), 0),
            q("What does B drink?", listOf("water", "coffee", "tea"), 0),
            q("I ___ like the chicken.", listOf("would", "will", "am"), 0),
            q("___ I have the bill?", listOf("Can", "Do", "Am"), 0)
        ),
        idioms = listOf(IdiomExpression("Here you are", "بفرمایید", "Here you are.", "بفرمایید.")),
        pron = listOf(PronunciationTip("I'd like", "I'd /aɪd/")),
        cult = listOf(CulturalNote("Tipping", "10-15% in US.")),
        mis = listOf(CommonMistake("I want chicken.", "I'd like chicken.", "Use 'I'd like'."))
    )

    // ═══════════════ FILE 4 ═══════════════
    private fun f4A() = base(
        10, "4A — Do you like mornings?", "۴A — صبح‌ها رو دوست داری؟",
        listOf("Talk about likes/dislikes", "Adverbs of frequency", "Yes/No questions"),
        listOf(
            v("morning", "صبح", "I like mornings.", "صبح‌ها را دوست دارم."),
            v("always", "همیشه", "I always drink coffee.", "همیشه قهوه می‌نوشم.", "adverb"),
            v("usually", "معمولاً", "I usually get up early.", "معمولاً زود بیدار می‌شوم.", "adverb"),
            v("sometimes", "گاهی", "Sometimes I read.", "گاهی می‌خوانم.", "adverb"),
            v("never", "هرگز", "I never drink tea.", "هرگز چای نمی‌نوشم.", "adverb"),
            v("like", "دوست داشتن", "I like coffee.", "قهوه دوست دارم.", "verb")
        ),
        listOf(
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, never — before main verb."),
            GrammarSection("Do you...? Yes/No questions", "Do you like mornings? Yes, I do. / No, I don't.")
        ),
        listOf(
            d("A", "Do you like mornings?", "صبح‌ها را دوست داری؟"),
            d("B", "Not really. I usually get up late.", "نه زیاد. معمولاً دیر بیدار می‌شوم."),
            d("A", "Me too! I always drink coffee.", "من هم! همیشه قهوه می‌خورم."),
            d("B", "What time do you get up?", "چه ساعتی بیدار می‌شوی؟"),
            d("A", "Usually at 8. Sometimes at 9.", "معمولاً ساعت ۸. گاهی ساعت ۹."),
            d("B", "Do you eat breakfast?", "صبحانه می‌خوری؟"),
            d("A", "Never! Just coffee.", "هرگز! فقط قهوه."),
            d("B", "That's not healthy!", "سالم نیست!")
        ),
        listOf(
            q("Does B like mornings?", listOf("yes", "no", "sometimes"), 1),
            q("What does A always drink?", listOf("tea", "coffee", "water"), 1),
            q("I ___ get up early.", listOf("usual", "usually", "usualy"), 1),
            q("___ you like mornings?", listOf("Do", "Does", "Are"), 0)
        ),
        idioms = listOf(IdiomExpression("Not really", "نه زیاد", "Not really.", "نه زیاد.")),
        pron = listOf(PronunciationTip("Frequency stress", "ALways, USually, NEver")),
        cult = listOf(CulturalNote("Breakfast", "Important meal in many cultures.")),
        mis = listOf(CommonMistake("I drink always coffee.", "I always drink coffee.", "Before main verb."))
    )

    private fun f4B() = base(
        11, "4B — Can you...?", "۴B — می‌توانی...؟",
        listOf("Can/Can't for ability", "Talk about skills", "Ask for permission"),
        listOf(
            v("can", "توانستن", "I can swim.", "می‌توانم شنا کنم.", "verb"),
            v("swim", "شنا کردن", "She can swim.", "او می‌تواند شنا کند.", "verb"),
            v("cook", "آشپزی کردن", "He can cook well.", "او خوب آشپزی می‌کند.", "verb"),
            v("drive", "رانندگی", "I can drive.", "می‌توانم رانندگی کنم.", "verb"),
            v("sing", "آواز خواندن", "She can sing.", "او می‌تواند آواز بخواند.", "verb"),
            v("dance", "رقصیدن", "Can you dance?", "رقصیدن می‌توانی؟", "verb")
        ),
        listOf(
            GrammarSection("Can for ability", "I can swim. She can't drive. Can you cook?"),
            GrammarSection("Can for permission", "Can I go? You can't smoke here.")
        ),
        listOf(
            d("A", "Can you cook?", "آشپزی می‌توانی؟"),
            d("B", "Yes, I can. I cook every day.", "بله. هر روز آشپزی می‌کنم."),
            d("A", "Nice! Can you sing?", "عالی! آواز می‌توانی؟"),
            d("B", "No, I can't. But I can dance.", "نه، نمی‌توانم. ولی می‌توانم برقصم."),
            d("A", "Really? I can't dance at all.", "واقعاً؟ من اصلاً نمی‌توانم برقصم."),
            d("B", "Can you drive?", "رانندگی می‌توانی؟"),
            d("A", "Yes, I can. I have a car.", "بله. ماشین دارم."),
            d("B", "Lucky you!", "خوش به حالت!")
        ),
        listOf(
            q("Can B cook?", listOf("no", "yes", "sometimes"), 1),
            q("Can B sing?", listOf("yes", "no", "a little"), 1),
            q("She ___ swim very well.", listOf("can", "cans", "can to"), 0),
            q("I ___ dance.", listOf("can't", "don't can", "not can"), 0)
        ),
        idioms = listOf(IdiomExpression("Lucky you!", "خوش به حالت!", "Lucky you!", "خوش به حالت!")),
        pron = listOf(PronunciationTip("Can/Can't", "can /kæn/, can't /kænt/")),
        cult = listOf(CulturalNote("Skills", "Different cultures value different skills.")),
        mis = listOf(CommonMistake("She cans swim.", "She can swim.", "No -s on modals."))
    )

    private fun f4C() = base(
        12, "4C — Free time", "۴C — وقت آزاد",
        listOf("Talk about free time", "Present simple review", "Ask about hobbies"),
        listOf(
            v("hobby", "سرگرمی", "What's your hobby?", "سرگرمی‌ات چیست؟"),
            v("read", "خواندن", "I read books.", "کتاب می‌خوانم.", "verb"),
            v("music", "موسیقی", "I listen to music.", "به موسیقی گوش می‌دهم."),
            v("sport", "ورزش", "I play sports.", "ورزش می‌کنم."),
            v("TV", "تلویزیون", "I watch TV.", "تلویزیون تماشا می‌کنم."),
            v("friends", "دوستان", "I meet friends.", "دوستان را می‌بینم.")
        ),
        listOf(
            GrammarSection("Present simple for hobbies", "I read. She reads. Do you read? Does she read?"),
            GrammarSection("Questions about free time", "What do you do in your free time? What are your hobbies?")
        ),
        listOf(
            d("A", "What do you do in your free time?", "در وقت آزاد چیکار می‌کنی؟"),
            d("B", "I read a lot. And I listen to music.", "زیاد می‌خوانم. و به موسیقی گوش می‌دهم."),
            d("A", "What kind of music?", "چه نوع موسیقی؟"),
            d("B", "Jazz and classical. And you?", "جاز و کلاسیک. تو چطور؟"),
            d("A", "I play sports. Football and tennis.", "ورزش می‌کنم. فوتبال و تنیس."),
            d("B", "Do you play every week?", "هر هفته بازی می‌کنی؟"),
            d("A", "Yes, twice a week.", "بله، دو بار در هفته."),
            d("B", "That's great!", "عالیه!")
        ),
        listOf(
            q("What does B do?", listOf("reads & music", "sports", "cooks"), 0),
            q("What sports does A play?", listOf("tennis only", "football & tennis", "basketball"), 1),
            q("What ___ you do in free time?", listOf("do", "does", "are"), 0),
            q("She ___ jazz music.", listOf("like", "likes", "liking"), 1)
        ),
        idioms = listOf(IdiomExpression("Free time", "وقت آزاد", "In my free time, I read.", "در وقت آزادم می‌خوانم.")),
        pron = listOf(PronunciationTip("Music", "MU-sic, not mu-SIC")),
        cult = listOf(CulturalNote("Hobbies", "Hobbies vary by person.")),
        mis = listOf(CommonMistake("She like jazz.", "She likes jazz.", "Add -s."))
    )

    // ═══════════════ FILE 5 ═══════════════
    private fun f5A() = base(
        13, "5A — Before they were famous", "۵A — قبل از معروف شدن",
        listOf("Was/Were", "Talk about the past", "Time expressions"),
        listOf(
            v("born", "متولد", "I was born in 1990.", "متولد ۱۹۹۰.", "verb"),
            v("yesterday", "دیروز", "I was tired yesterday.", "دیروز خسته بودم."),
            v("famous", "معروف", "Now she's famous.", "الان معروفه.", "adjective"),
            v("child", "کودک", "When I was a child...", "وقتی بچه بودم..."),
            v("school", "مدرسه", "At school together.", "با هم در مدرسه."),
            v("poor", "فقیر", "They were poor.", "فقیر بودند.", "adjective")
        ),
        listOf(
            GrammarSection("Was/Were", "I/he/she/it was. You/we/they were. Negative: wasn't/weren't."),
            GrammarSection("Past time expressions", "yesterday, last night, in 1990, when I was a child.")
        ),
        listOf(
            d("A", "Where were you born?", "کجا متولد شدی؟"),
            d("B", "I was born in Canada.", "در کانادا متولد شدم."),
            d("A", "Were you a good student?", "شاگرد خوبی بودی؟"),
            d("B", "Yes, I was. Very quiet.", "بله. خیلی ساکت."),
            d("A", "What was your first job?", "اولین شغلت چی بود؟"),
            d("B", "A waiter. I was very poor.", "پیشخدمت. خیلی فقیر بودم."),
            d("A", "And now?", "و الان؟"),
            d("B", "Now I'm a manager. Things change!", "الان مدیرم. شرایط تغییر می‌کند!")
        ),
        listOf(
            q("Where was B born?", listOf("USA", "Canada", "UK"), 1),
            q("First job?", listOf("manager", "waiter", "teacher"), 1),
            q("I ___ tired yesterday.", listOf("am", "was", "were"), 1),
            q("They ___ at home.", listOf("was", "were", "am"), 1)
        ),
        idioms = listOf(IdiomExpression("Be born", "متولد شدن", "I was born in Canada.", "در کانادا متولد شدم.")),
        pron = listOf(PronunciationTip("was/were weak", "/wəz/, /wər/")),
        cult = listOf(CulturalNote("Past talk", "Common icebreaker.")),
        mis = listOf(CommonMistake("I were tired.", "I was tired.", "Use 'was' with I."))
    )

    private fun f5B() = base(
        14, "5B — Where were you?", "۵B — کجا بودی؟",
        listOf("Was/Were questions", "Prepositions of place", "Talk about locations"),
        listOf(
            v("at home", "در خانه", "I was at home.", "در خانه بودم."),
            v("at work", "سر کار", "He was at work.", "سر کار بود."),
            v("at school", "در مدرسه", "We were at school.", "در مدرسه بودیم."),
            v("in bed", "در تخت", "She was in bed.", "در تخت بود."),
            v("in a cafe", "در کافه", "They were in a cafe.", "در کافه بودند."),
            v("on a bus", "در اتوبوس", "I was on a bus.", "در اتوبوس بودم.")
        ),
        listOf(
            GrammarSection("Was/Were questions", "Where were you? Were you at home? Yes, I was."),
            GrammarSection("Prepositions of place", "at home, at work, in bed, on a bus, in a cafe.")
        ),
        listOf(
            d("A", "Where were you last night?", "دیشب کجا بودی؟"),
            d("B", "I was at home. And you?", "در خانه بودم. تو چطور؟"),
            d("A", "I was in a cafe with friends.", "در کافه با دوستان بودم."),
            d("B", "Was Anna there?", "آنا آنجا بود؟"),
            d("A", "No, she wasn't. She was at work.", "نه، نبود. سر کار بود."),
            d("B", "Was she tired?", "خسته بود؟"),
            d("A", "Yes, she was. She works a lot.", "بله. زیاد کار می‌کند."),
            d("B", "Poor Anna!", "بیچاره آنا!")
        ),
        listOf(
            q("Where was B last night?", listOf("cafe", "home", "work"), 1),
            q("Where was Anna?", listOf("home", "cafe", "work"), 2),
            q("___ you at home?", listOf("Was", "Were", "Am"), 1),
            q("I was ___ home.", listOf("at", "in", "on"), 0)
        ),
        idioms = listOf(IdiomExpression("Last night", "دیشب", "Where were you last night?", "دیشب کجا بودی؟")),
        pron = listOf(PronunciationTip("At/In/On", "at home, in bed, on a bus")),
        cult = listOf(CulturalNote("Where were you?", "Common question.")),
        mis = listOf(CommonMistake("I was in home.", "I was at home.", "Use 'at home'."))
    )

    private fun f5C() = base(
        15, "5C — A famous person", "۵C — یک فرد مشهور",
        listOf("Talk about famous people", "Was/Were review", "Describe past"),
        listOf(
            v("singer", "خواننده", "A famous singer.", "خواننده معروفی."),
            v("actor", "بازیگر", "A great actor.", "بازیگر بزرگی."),
            v("writer", "نویسنده", "A famous writer.", "نویسنده معروف."),
            v("artist", "هنرمند", "A talented artist.", "هنرمند بااستعداد."),
            v("born", "متولد", "Born in 1950.", "متولد ۱۹۵۰."),
            v("died", "مرد", "He died in 2000.", "در ۲۰۰۰ مرد.", "verb")
        ),
        listOf(
            GrammarSection("Was/Were with famous people", "He was a singer. She was born in 1950."),
            GrammarSection("Past simple: died, lived, worked", "Regular verbs for past events.")
        ),
        listOf(
            d("A", "Who's your favorite singer?", "خواننده مورد علاقه‌ات کیست؟"),
            d("B", "Freddie Mercury. He was amazing.", "فردی مرکوری. فوق‌العاده بود."),
            d("A", "When was he born?", "کی متولد شد؟"),
            d("B", "In 1946. He died in 1991.", "۱۹۴۶. در ۱۹۹۱ مرد."),
            d("A", "Where was he from?", "اهل کجا بود؟"),
            d("B", "He was born in Zanzibar. But he lived in London.", "در زنگبار متولد شد. ولی در لندن زندگی کرد."),
            d("A", "Was he a good singer?", "خواننده خوبی بود؟"),
            d("B", "The best! He was a legend.", "بهترین! او یک افسانه بود.")
        ),
        listOf(
            q("Who is B's favorite singer?", listOf("Elvis", "Freddie Mercury", "Bowie"), 1),
            q("When was he born?", listOf("1940", "1946", "1950"), 1),
            q("He ___ a great singer.", listOf("was", "were", "is"), 0),
            q("They ___ born in Italy.", listOf("was", "were", "are"), 1)
        ),
        idioms = listOf(IdiomExpression("A legend", "یک افسانه", "He was a legend.", "او یک افسانه بود.")),
        pron = listOf(PronunciationTip("Freddie Mercury", "/ˈfredi ˈmɜːrkjəri/")),
        cult = listOf(CulturalNote("Queen", "Famous British rock band.")),
        mis = listOf(CommonMistake("He were born.", "He was born.", "Use 'was' with he."))
    )

    // ═══════════════ FILE 6 ═══════════════
    private fun f6A() = base(
        16, "6A — On an island", "۶A — در یک جزیره",
        listOf("There is / There are", "Talk about places", "Describe a place"),
        listOf(
            v("island", "جزیره", "A small island.", "جزیره کوچکی."),
            v("village", "روستا", "A quiet village.", "روستای آرام."),
            v("river", "رودخانه", "A long river.", "رودخانه طولانی."),
            v("mountain", "کوه", "High mountains.", "کوه‌های بلند."),
            v("tree", "درخت", "Many trees.", "درختان زیاد."),
            v("house", "خانه", "Old houses.", "خانه‌های قدیمی.")
        ),
        listOf(
            GrammarSection("There is / There are", "There is a river. There are mountains. Singular vs plural."),
            GrammarSection("Negative", "There isn't a school. There aren't any shops.")
        ),
        listOf(
            d("A", "Tell me about your island.", "از جزیره‌ات بگو."),
            d("B", "It's small. There are mountains and rivers.", "کوچکه. کوه و رودخانه هست."),
            d("A", "Are there many people?", "افراد زیادی هستن؟"),
            d("B", "No, only 500 people.", "نه، فقط ۵۰۰ نفر."),
            d("A", "Is there a school?", "مدرسه هست؟"),
            d("B", "Yes, there is. And there's a small shop.", "بله. و یک مغازه کوچک هم هست."),
            d("A", "Are there any restaurants?", "رستوران هست؟"),
            d("B", "There aren't any restaurants, but there's a cafe.", "رستوران نیست، ولی یک کافه هست.")
        ),
        listOf(
            q("How many people?", listOf("200", "500", "1000"), 1),
            q("Is there a restaurant?", listOf("yes", "no", "two"), 1),
            q("___ a river near the village.", listOf("There is", "There are", "It is"), 0),
            q("___ many trees.", listOf("There is", "There are", "Is"), 1)
        ),
        idioms = listOf(IdiomExpression("Tell me about...", "از...بگو", "Tell me about your island.", "از جزیره‌ات بگو.")),
        pron = listOf(PronunciationTip("There's", "There's /ðerz/")),
        cult = listOf(CulturalNote("Small villages", "Common worldwide.")),
        mis = listOf(CommonMistake("There is many trees.", "There are many trees.", "Plural = are."))
    )

    private fun f6B() = base(
        17, "6B — My neighborhood", "۶B — محله من",
        listOf("Describe your neighborhood", "Prepositions of place", "Talk about locations"),
        listOf(
            v("near", "نزدیک", "Near my house.", "نزدیک خانه‌ام.", "preposition"),
            v("next to", "کنار", "Next to the bank.", "کنار بانک.", "preposition"),
            v("opposite", "روبه‌روی", "Opposite the park.", "روبه‌روی پارک.", "preposition"),
            v("between", "بین", "Between the bank and the cafe.", "بین بانک و کافه.", "preposition"),
            v("street", "خیابان", "A quiet street.", "خیابان آرام."),
            v("park", "پارک", "A big park.", "پارک بزرگ.")
        ),
        listOf(
            GrammarSection("Prepositions of place", "near, next to, opposite, between, on, in, at."),
            GrammarSection("Asking about places", "Is there a bank near here? Where's the park?")
        ),
        listOf(
            d("A", "Is there a bank near here?", "بانکی این نزدیکی هست؟"),
            d("B", "Yes, there's one on Main Street.", "بله، یکی در خیابان مِین."),
            d("A", "Where's the park?", "پارک کجاست؟"),
            d("B", "It's opposite the bank.", "روبه‌روی بانک."),
            d("A", "And a supermarket?", "و سوپرمارکت؟"),
            d("B", "There's one next to the park.", "یکی کنار پارک هست."),
            d("A", "Perfect. And a cafe?", "عالی. و کافه؟"),
            d("B", "Between the bank and the supermarket.", "بین بانک و سوپرمارکت.")
        ),
        listOf(
            q("Where's the bank?", listOf("Main Street", "Park Street", "First Ave"), 0),
            q("Where's the park?", listOf("next to bank", "opposite bank", "behind bank"), 1),
            q("The cafe is ___ the bank.", listOf("next to", "between", "near"), 0),
            q("It's ___ the park.", listOf("opposite", "between", "on"), 0)
        ),
        idioms = listOf(IdiomExpression("Near here", "این نزدیکی", "Is there a bank near here?", "بانکی این نزدیکی هست؟")),
        pron = listOf(PronunciationTip("Opposite", "/ˈɑːpəzɪt/")),
        cult = listOf(CulturalNote("Neighborhoods", "Have different layouts.")),
        mis = listOf(CommonMistake("next the park", "next to the park", "Add 'to'."))
    )

    private fun f6C() = base(
        18, "6C — There was / There were", "۶C — گذشته there is/are",
        listOf("There was / There were", "Talk about past places", "Describe changes"),
        listOf(
            v("was", "بود", "There was a shop.", "مغازه‌ای بود.", "verb"),
            v("were", "بودند", "There were many people.", "افراد زیادی بودند.", "verb"),
            v("old", "قدیمی", "An old house.", "خانه قدیمی.", "adjective"),
            v("new", "جدید", "A new school.", "مدرسه جدید.", "adjective"),
            v("before", "قبل", "Before, there was...", "قبل، بود...", "adverb"),
            v("now", "الان", "Now there's a park.", "الان پارکی هست.", "adverb")
        ),
        listOf(
            GrammarSection("There was / There were", "Past of there is/are. There was a shop. There were two cafes."),
            GrammarSection("Negative", "There wasn't a school. There weren't any cars.")
        ),
        listOf(
            d("A", "This street looks different.", "این خیابان متفاوت به نظر می‌رسد."),
            d("B", "Yes, before there were old houses.", "بله، قبلاً خانه‌های قدیمی بودند."),
            d("A", "And now?", "و الان؟"),
            d("B", "Now there are new shops and cafes.", "الان مغازه‌ها و کافه‌های جدید هستند."),
            d("A", "Was there a school before?", "قبلاً مدرسه بود؟"),
            d("B", "No, there wasn't. The school is new.", "نه، نبود. مدرسه جدید است."),
            d("A", "Were there many people?", "افراد زیادی بودند؟"),
            d("B", "Yes, there were. It's always busy.", "بله. همیشه شلوغ است.")
        ),
        listOf(
            q("What was here before?", listOf("shops", "old houses", "park"), 1),
            q("Was there a school before?", listOf("yes", "no", "two"), 1),
            q("___ a shop here before.", listOf("There was", "There were", "There is"), 0),
            q("___ many people last night.", listOf("There was", "There were", "Is"), 1)
        ),
        idioms = listOf(IdiomExpression("Before and now", "قبل و الان", "Before... Now...", "قبل... الان...")),
        pron = listOf(PronunciationTip("There was", "There was /ðer wəz/")),
        cult = listOf(CulturalNote("Cities change", "Over time.")),
        mis = listOf(CommonMistake("There were a shop.", "There was a shop.", "Singular = was."))
    )

    // ═══════════════ FILE 7 ═══════════════
    private fun f7A() = base(
        19, "7A — What are they doing?", "۷A — چه کار می‌کنند؟",
        listOf("Present continuous", "Actions happening now", "Describe photos"),
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
            d("B", "Nice. Everyone is busy!", "خوبه. همه مشغولند!")
        ),
        listOf(
            q("What's B doing?", listOf("reading", "TV", "cooking"), 0),
            q("What's A's sister doing?", listOf("reading", "cooking", "eating"), 1),
            q("She ___ reading a book.", listOf("am", "is", "are"), 1),
            q("They ___ watching TV.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(IdiomExpression("What are you doing?", "چیکار می‌کنی؟", "What are you doing?", "چیکار می‌کنی؟")),
        pron = listOf(PronunciationTip("-ing", "/ɪŋ/")),
        cult = listOf(CulturalNote("Multitasking", "People often do several things.")),
        mis = listOf(CommonMistake("What you are doing?", "What are you doing?", "Verb before subject."))
    )

    private fun f7B() = base(
        20, "7B — Weather and seasons", "۷B — هوا و فصل‌ها",
        listOf("Talk about weather", "Present continuous for weather", "Seasons"),
        listOf(
            v("sunny", "آفتابی", "It's sunny.", "آفتابیه.", "adjective"),
            v("raining", "بارانی", "It's raining.", "باران می‌آید.", "verb"),
            v("snowing", "برفی", "It's snowing.", "برف می‌آید.", "verb"),
            v("windy", "بادی", "It's windy.", "بادی است.", "adjective"),
            v("cloudy", "ابری", "It's cloudy.", "ابری است.", "adjective"),
            v("hot", "گرم", "It's hot today.", "امروز گرمه.", "adjective")
        ),
        listOf(
            GrammarSection("Weather with present continuous", "It's raining. It's snowing. It's sunny."),
            GrammarSection("Weather questions", "What's the weather like? How's the weather?")
        ),
        listOf(
            d("A", "What's the weather like today?", "هوا امروز چطوره؟"),
            d("B", "It's raining. Take an umbrella.", "باران می‌آید. چتر بردار."),
            d("A", "Really? Yesterday it was sunny.", "واقعاً؟ دیروز آفتابی بود."),
            d("B", "I know. Weather changes fast.", "می‌دانم. هوا سریع تغییر می‌کند."),
            d("A", "What's your favorite season?", "فصل مورد علاقه‌ات چیست؟"),
            d("B", "Summer. I love hot weather.", "تابستان. هوای گرم دوست دارم."),
            d("A", "Me too. I don't like winter.", "من هم. زمستان دوست ندارم."),
            d("B", "Winter is too cold for me!", "زمستان برایم خیلی سرد است!")
        ),
        listOf(
            q("What's the weather like?", listOf("sunny", "raining", "snowing"), 1),
            q("What's B's favorite season?", listOf("spring", "summer", "winter"), 1),
            q("It ___ raining.", listOf("am", "is", "are"), 1),
            q("It's ___ today.", listOf("sun", "sunny", "sunshine"), 1)
        ),
        idioms = listOf(IdiomExpression("What's the weather like?", "هوا چطوره؟", "What's the weather like?", "هوا چطوره؟")),
        pron = listOf(PronunciationTip("Weather", "/ˈweðər/")),
        cult = listOf(CulturalNote("Weather small talk", "Very common.")),
        mis = listOf(CommonMistake("It raining.", "It's raining.", "Don't forget 'is'."))
    )

    private fun f7C() = base(
        21, "7C — Future plans", "۷C — برنامه‌های آینده",
        listOf("Be going to", "Talk about future plans", "Arrangements"),
        listOf(
            v("going to", "قرار است", "I'm going to travel.", "قرار است سفر کنم.", "verb"),
            v("tomorrow", "فردا", "See you tomorrow.", "فردا می‌بینمت."),
            v("next week", "هفته بعد", "Next week I'll...", "هفته بعد..."),
            v("visit", "بازدید کردن", "I'm going to visit my family.", "قرار است به خانواده‌ام سر بزنم.", "verb"),
            v("travel", "سفر کردن", "I'm going to travel.", "قرار است سفر کنم.", "verb"),
            v("plan", "برنامه", "What are your plans?", "برنامه‌ات چیست؟")
        ),
        listOf(
            GrammarSection("Be going to", "am/is/are + going to + verb. I'm going to travel."),
            GrammarSection("Future plans questions", "What are you going to do? Where are you going to go?")
        ),
        listOf(
            d("A", "What are you going to do this weekend?", "این آخر هفته چیکار می‌کنی؟"),
            d("B", "I'm going to visit my parents.", "قرار است به دیدن والدینم بروم."),
            d("A", "Nice. Where do they live?", "خوبه. کجا زندگی می‌کنند؟"),
            d("B", "In the countryside. I'm going to stay two days.", "در حومه. قرار است دو روز بمانم."),
            d("A", "Sounds relaxing. And next week?", "آرامش‌بخش به نظر می‌رسد. و هفته بعد؟"),
            d("B", "I'm going to start a new job!", "قرار است شغل جدیدی شروع کنم!"),
            d("A", "Congratulations!", "تبریک!"),
            d("B", "Thanks! I'm excited.", "ممنون! هیجان‌زده‌ام.")
        ),
        listOf(
            q("What is B going to do?", listOf("travel", "visit parents", "work"), 1),
            q("When does B start new job?", listOf("this week", "next week", "next month"), 1),
            q("I ___ going to travel.", listOf("am", "is", "are"), 0),
            q("She ___ going to visit.", listOf("am", "is", "are"), 1)
        ),
        idioms = listOf(IdiomExpression("Going to", "قرار است", "I'm going to travel.", "قرار است سفر کنم.")),
        pron = listOf(PronunciationTip("Going to", "Often 'gonna'")),
        cult = listOf(CulturalNote("Weekend plans", "Common topic.")),
        mis = listOf(CommonMistake("I going to travel.", "I'm going to travel.", "Add 'am'."))
    )

    // ═══════════════ FILE 8 ═══════════════
    private fun f8A() = base(
        22, "8A — A house with a history", "۸A — خانه‌ای با تاریخچه",
        listOf("Past simple regular verbs", "Talk about past", "Time expressions"),
        listOf(
            v("visited", "بازدید کرد", "We visited the house.", "خانه را دیدیم.", "verb"),
            v("worked", "کار کرد", "She worked here.", "او اینجا کار کرد.", "verb"),
            v("started", "شروع کرد", "It started in 1800.", "در ۱۸۰۰ شروع شد.", "verb"),
            v("lived", "زندگی کرد", "A family lived here.", "خانواده‌ای اینجا زندگی کرد.", "verb"),
            v("learned", "یاد گرفت", "I learned a lot.", "زیاد یاد گرفتم.", "verb"),
            v("old", "قدیمی", "An old house.", "خانه قدیمی.", "adjective")
        ),
        listOf(
            GrammarSection("Past simple regular verbs", "Add -ed: visit → visited, work → worked, live → lived."),
            GrammarSection("Spelling", "like → liked, study → studied, stop → stopped.")
        ),
        listOf(
            d("A", "Did you visit the old house?", "از خانه قدیمی بازدید کردی؟"),
            d("B", "Yes, I did. It was amazing.", "بله. شگفت‌انگیز بود."),
            d("A", "How old is it?", "چند ساله است؟"),
            d("B", "It started in 1820. A famous family lived there.", "در ۱۸۲۰ شروع شد. خانواده معروفی آنجا زندگی می‌کرد."),
            d("A", "What did you learn?", "چی یاد گرفتی؟"),
            d("B", "I learned a lot about history.", "درباره تاریخ زیاد یاد گرفتم."),
            d("A", "Did you like it?", "دوستش داشتی؟"),
            d("B", "I loved it! I want to go back.", "عاشقش شدم! می‌خواهم برگردم.")
        ),
        listOf(
            q("When did the house start?", listOf("1800", "1820", "1850"), 1),
            q("Did B like it?", listOf("no", "yes", "maybe"), 1),
            q("I ___ the house yesterday.", listOf("visit", "visited", "visiting"), 1),
            q("She ___ in London.", listOf("live", "lived", "living"), 1)
        ),
        idioms = listOf(IdiomExpression("Go back", "برگشتن", "I want to go back.", "می‌خواهم برگردم.")),
        pron = listOf(PronunciationTip("-ed", "/t/, /d/, /ɪd/")),
        cult = listOf(CulturalNote("Historic homes", "Common in Europe.")),
        mis = listOf(CommonMistake("Did you visited?", "Did you visit?", "Base verb after did."))
    )

    private fun f8B() = base(
        23, "8B — Last weekend", "۸B — آخر هفته گذشته",
        listOf("Past simple irregular verbs", "Talk about events", "Narrate"),
        listOf(
            v("went", "رفت", "Went to the beach.", "به ساحل رفتم.", "verb"),
            v("saw", "دید", "Saw a movie.", "فیلمی دیدم.", "verb"),
            v("had", "داشت", "Had a great time.", "وقت خوبی داشتم.", "verb"),
            v("met", "ملاقات کرد", "Met my friends.", "دوستانم را دیدم.", "verb"),
            v("ate", "خورد", "Ate pizza.", "پیتزا خوردم.", "verb"),
            v("drank", "نوشید", "Drank coffee.", "قهوه نوشیدم.", "verb")
        ),
        listOf(
            GrammarSection("Irregular past simple", "go → went, see → saw, have → had, meet → met, eat → ate."),
            GrammarSection("Past questions", "What did you do? Where did you go?")
        ),
        listOf(
            d("A", "How was your weekend?", "آخر هفته‌ات چطور بود؟"),
            d("B", "Great! I went to the beach.", "عالی! به ساحل رفتم."),
            d("A", "Nice. What did you do?", "خوبه. چیکار کردی؟"),
            d("B", "I swam and met some friends.", "شنا کردم و چند دوست دیدم."),
            d("A", "What did you eat?", "چی خوردی؟"),
            d("B", "We ate fish at a restaurant.", "در رستوران ماهی خوردیم."),
            d("A", "Sounds perfect!", "کامل به نظر می‌رسد!"),
            d("B", "It was! And you?", "بود! تو چطور؟")
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

    private fun f8C() = base(
        24, "8C — A special day", "۸C — یک روز خاص",
        listOf("Past simple review", "Talk about special events", "Sequence events"),
        listOf(
            v("wedding", "عروسی", "A beautiful wedding.", "عروسی زیبا."),
            v("party", "مهمانی", "A big party.", "مهمانی بزرگ."),
            v("birthday", "تولد", "My birthday.", "تولد من."),
            v("gift", "هدیه", "A nice gift.", "هدیه قشنگ."),
            v("photo", "عکس", "Many photos.", "عکس‌های زیاد."),
            v("happy", "خوشحال", "Very happy.", "خیلی خوشحال.", "adjective")
        ),
        listOf(
            GrammarSection("Past simple review", "Regular and irregular verbs."),
            GrammarSection("Sequence words", "First, then, after that, finally.")
        ),
        listOf(
            d("A", "Tell me about your sister's wedding.", "از عروسی خواهرت بگو."),
            d("B", "It was beautiful. First, we went to the church.", "زیبا بود. اول به کلیسا رفتیم."),
            d("A", "Then?", "بعد؟"),
            d("B", "Then we had a big party at a hotel.", "بعد مهمانی بزرگی در هتل داشتیم."),
            d("A", "Did you dance?", "رقصیدی؟"),
            d("B", "Yes! We danced all night.", "بله! تمام شب رقصیدیم."),
            d("A", "What gift did you give?", "چه هدیه‌ای دادی؟"),
            d("B", "A photo album. She loved it.", "آلبوم عکس. عاشقش شد.")
        ),
        listOf(
            q("Where was the party?", listOf("home", "hotel", "park"), 1),
            q("What gift did B give?", listOf("flowers", "photo album", "money"), 1),
            q("We ___ to the church.", listOf("go", "went", "gone"), 1),
            q("She ___ the gift.", listOf("love", "loved", "loving"), 1)
        ),
        idioms = listOf(IdiomExpression("All night", "تمام شب", "We danced all night.", "تمام شب رقصیدیم.")),
        pron = listOf(PronunciationTip("Wedding", "/ˈwedɪŋ/")),
        cult = listOf(CulturalNote("Weddings", "Differ by culture.")),
        mis = listOf(CommonMistake("We dance all night.", "We danced all night.", "Past."))
    )

    // ═══════════════ FILE 9 ═══════════════
    private fun f9A() = base(
        25, "9A — Food and drinks", "۹A — غذا و نوشیدنی",
        listOf("Countable/uncountable", "some/any", "Talk about food"),
        listOf(
            v("rice", "برنج", "Some rice.", "مقداری برنج."),
            v("bread", "نان", "Some bread.", "مقداری نان."),
            v("water", "آب", "A glass of water.", "یک لیوان آب."),
            v("apple", "سیب", "An apple.", "یک سیب."),
            v("some", "مقداری", "Some cheese.", "مقداری پنیر.", "adverb"),
            v("any", "هیچ", "Any milk?", "شیر داری؟", "adverb")
        ),
        listOf(
            GrammarSection("Countable/uncountable", "Countable: apple, egg. Uncountable: rice, bread, water."),
            GrammarSection("Some/Any", "some (+) — I have some cheese. any (?/-) — Do you have any milk?")
        ),
        listOf(
            d("A", "What's for breakfast?", "صبحانه چی؟"),
            d("B", "Some bread and cheese.", "مقداری نان و پنیر."),
            d("A", "Any eggs?", "تخم‌مرغ داری؟"),
            d("B", "No, we don't have any eggs.", "نه، تخم‌مرغ نداریم."),
            d("A", "What about fruit?", "میوه چطور؟"),
            d("B", "We have some apples and oranges.", "سیب و پرتقال داریم."),
            d("A", "Perfect. And coffee?", "عالی. و قهوه؟"),
            d("B", "Yes, lots of coffee!", "بله، قهوه زیاد!")
        ),
        listOf(
            q("What do they have for breakfast?", listOf("eggs", "bread and cheese", "rice"), 1),
            q("Do they have eggs?", listOf("yes", "no", "many"), 1),
            q("I have ___ cheese.", listOf("some", "any", "much"), 0),
            q("Do you have ___ milk?", listOf("some", "any", "much"), 1)
        ),
        idioms = listOf(IdiomExpression("What's for breakfast?", "صبحانه چی؟", "What's for breakfast?", "صبحانه چی؟")),
        pron = listOf(PronunciationTip("Some/Any", "Weak: /səm/, /əni/")),
        cult = listOf(CulturalNote("Breakfast", "Differs by country.")),
        mis = listOf(CommonMistake("some apples in negative", "any apples", "Use 'any' in negative."))
    )

    private fun f9B() = base(
        26, "9B — How much / How many?", "۹B — چقدر / چند تا؟",
        listOf("How much/How many", "Quantifiers", "Prices"),
        listOf(
            v("much", "زیاد", "How much water?", "چقدر آب؟", "adverb"),
            v("many", "زیاد", "How many apples?", "چند تا سیب؟", "adverb"),
            v("cheap", "ارزان", "Very cheap.", "خیلی ارزان.", "adjective"),
            v("expensive", "گران", "Too expensive.", "خیلی گران.", "adjective"),
            v("money", "پول", "How much money?", "چقدر پول؟"),
            v("price", "قیمت", "What's the price?", "قیمتش چقدره؟")
        ),
        listOf(
            GrammarSection("How much / How many", "How much + uncountable. How many + countable."),
            GrammarSection("Prices", "How much is it? It's $5. / How much are they? They're $10.")
        ),
        listOf(
            d("A", "How much is this bread?", "این نان چقدره؟"),
            d("B", "It's $2.", "۲ دلار."),
            d("A", "And how much are those apples?", "و آن سیب‌ها چقدرن؟"),
            d("B", "$1 each. How many do you want?", "هر کدام ۱ دلار. چند تا می‌خواهی؟"),
            d("A", "Five, please. How much water do you have?", "پنج تا. چقدر آب داری؟"),
            d("B", "Two bottles. That's $4.", "دو بطری. ۴ دلار."),
            d("A", "That's cheap! Here's $10.", "ارزونه! این ۱۰ دلار."),
            d("B", "Thank you. Here's your change.", "ممنون. اینم باقی‌اش.")
        ),
        listOf(
            q("How much is the bread?", listOf("$1", "$2", "$3"), 1),
            q("How many apples?", listOf("three", "five", "ten"), 1),
            q("___ water do you drink?", listOf("How much", "How many", "How"), 0),
            q("___ apples are there?", listOf("How much", "How many", "How"), 1)
        ),
        idioms = listOf(IdiomExpression("Here's your change", "باقی‌اش", "Here's your change.", "باقی‌اش.")),
        pron = listOf(PronunciationTip("How much", "/haʊ mʌtʃ/")),
        cult = listOf(CulturalNote("Money", "Different currencies.")),
        mis = listOf(CommonMistake("How many water?", "How much water?", "Use 'much' with uncountable."))
    )

    private fun f9C() = base(
        27, "9C — #mydinnerlastnight", "۹C — #شام_دیشبم",
        listOf("Past simple with food", "Talk about meals", "Order in restaurant"),
        listOf(
            v("dinner", "شام", "For dinner...", "برای شام..."),
            v("restaurant", "رستوران", "At a restaurant.", "در رستوران."),
            v("delicious", "خوشمزه", "Very delicious.", "خیلی خوشمزه.", "adjective"),
            v("bill", "صورت‌حساب", "The bill, please.", "صورت‌حساب لطفاً."),
            v("tip", "انعام", "We left a tip.", "انعام گذاشتیم."),
            v("waiter", "پیشخدمت", "The waiter is nice.", "پیشخدمت خوبه.")
        ),
        listOf(
            GrammarSection("Past simple with food", "I ate rice. We had fish. She drank juice."),
            GrammarSection("Restaurant phrases", "The bill, please. I'd like the chicken.")
        ),
        listOf(
            d("A", "What did you have for dinner?", "برای شام چی خوردی؟"),
            d("B", "I ate at a restaurant. Pizza and salad.", "در رستوران خوردم. پیتزا و سالاد."),
            d("A", "Sounds good. Was it expensive?", "خوبه. گران بود؟"),
            d("B", "About $30. We left a tip too.", "حدود ۳۰ دلار. انعام هم گذاشتیم."),
            d("A", "Did you have dessert?", "دسر خوردی؟"),
            d("B", "Yes, chocolate cake. Delicious!", "بله، کیک شکلاتی. خوشمزه!"),
            d("A", "I love chocolate cake!", "عاشق کیک شکلاتی‌ام!"),
            d("B", "You should try this restaurant.", "باید این رستوران را امتحان کنی.")
        ),
        listOf(
            q("What did B eat?", listOf("rice", "pizza", "chicken"), 1),
            q("How much was dinner?", listOf("$20", "$30", "$50"), 1),
            q("I ___ pizza last night.", listOf("eat", "ate", "eaten"), 1),
            q("We ___ a tip.", listOf("leave", "left", "leaving"), 1)
        ),
        idioms = listOf(IdiomExpression("Leave a tip", "انعام گذاشتن", "We left a tip.", "انعام گذاشتیم.")),
        pron = listOf(PronunciationTip("Delicious", "/dɪˈlɪʃəs/")),
        cult = listOf(CulturalNote("Tipping", "15-20% in US.")),
        mis = listOf(CommonMistake("I eat pizza last night.", "I ate pizza last night.", "Past simple."))
    )

    // ═══════════════ FILE 10 ═══════════════
    private fun f10A() = base(
        28, "10A — The most dangerous place", "۱۰A — خطرناک‌ترین مکان",
        listOf("Superlatives", "Talk about records", "Compare places"),
        listOf(
            v("dangerous", "خطرناک", "Most dangerous.", "خطرناک‌ترین.", "adjective"),
            v("high", "بلند", "Highest mountain.", "بلندترین کوه.", "adjective"),
            v("deep", "عمیق", "Deepest ocean.", "عمیق‌ترین اقیانوس.", "adjective"),
            v("hot", "گرم", "Hottest place.", "گرم‌ترین جا.", "adjective"),
            v("cold", "سرد", "Coldest place.", "سردترین جا.", "adjective"),
            v("beautiful", "زیبا", "Most beautiful.", "زیباترین.", "adjective")
        ),
        listOf(
            GrammarSection("Superlatives", "the + -est / the most + adjective. the highest, the most dangerous."),
            GrammarSection("Irregular", "good → the best, bad → the worst.")
        ),
        listOf(
            d("A", "What's the highest mountain?", "بلندترین کوه چیه؟"),
            d("B", "Mount Everest. 8,848 meters.", "اورست. ۸۸۴۸ متر."),
            d("A", "What's the hottest place?", "گرم‌ترین جا کجاست؟"),
            d("B", "Death Valley in California.", "دث ولی در کالیفرنیا."),
            d("A", "The most dangerous?", "خطرناک‌ترین؟"),
            d("B", "Maybe Antarctica. Very cold.", "شاید قطب جنوب. خیلی سرد."),
            d("A", "The most beautiful?", "زیباترین؟"),
            d("B", "I think the Grand Canyon.", "فکر می‌کنم گرند کنیون.")
        ),
        listOf(
            q("Highest mountain?", listOf("K2", "Everest", "Alps"), 1),
            q("Hottest place?", listOf("Sahara", "Death Valley", "Dubai"), 1),
            q("Everest is the ___ mountain.", listOf("high", "higher", "highest"), 2),
            q("It's the ___ beautiful place.", listOf("more", "most", "much"), 1)
        ),
        idioms = listOf(IdiomExpression("The most...", "بیشترین...", "The most beautiful.", "زیباترین.")),
        pron = listOf(PronunciationTip("Superlatives", "the HIGHest")),
        cult = listOf(CulturalNote("Records", "Fascinating.")),
        mis = listOf(CommonMistake("the most highest", "the highest", "No 'most' with -est."))
    )

    private fun f10B() = base(
        29, "10B — Comparatives", "۱۰B — مقایسه‌ای‌ها",
        listOf("Comparatives", "Compare things", "Talk about differences"),
        listOf(
            v("bigger", "بزرگ‌تر", "Bigger than...", "بزرگ‌تر از...", "adjective"),
            v("smaller", "کوچک‌تر", "Smaller than...", "کوچک‌تر از...", "adjective"),
            v("better", "بهتر", "Better than...", "بهتر از...", "adjective"),
            v("worse", "بدتر", "Worse than...", "بدتر از...", "adjective"),
            v("more", "بیشتر", "More expensive.", "گران‌تر.", "adverb"),
            v("than", "از", "Bigger than...", "بزرگ‌تر از...", "conjunction")
        ),
        listOf(
            GrammarSection("Comparatives", "adj + -er / more + adj + than. bigger than, more expensive than."),
            GrammarSection("Irregular", "good → better, bad → worse.")
        ),
        listOf(
            d("A", "Is London bigger than Paris?", "لندن از پاریس بزرگ‌تره؟"),
            d("B", "Yes, London is bigger.", "بله، لندن بزرگ‌تره."),
            d("A", "Which is more expensive?", "کدام گران‌تره؟"),
            d("B", "London is more expensive than Paris.", "لندن از پاریس گران‌تره."),
            d("A", "Which is better for tourists?", "کدام برای توریست‌ها بهتره؟"),
            d("B", "Both are great. Paris is more romantic.", "هر دو عالیند. پاریس رمانتیک‌تره."),
            d("A", "And the food?", "و غذا؟"),
            d("B", "French food is better, I think.", "فکر می‌کنم غذای فرانسوی بهتره.")
        ),
        listOf(
            q("Which is bigger?", listOf("Paris", "London", "same"), 1),
            q("Which is more romantic?", listOf("London", "Paris", "same"), 1),
            q("London is ___ than Paris.", listOf("big", "bigger", "biggest"), 1),
            q("French food is ___ than English food.", listOf("good", "better", "best"), 1)
        ),
        idioms = listOf(IdiomExpression("Both are", "هر دو", "Both are great.", "هر دو عالیند.")),
        pron = listOf(PronunciationTip("than", "Weak: /ðən/")),
        cult = listOf(CulturalNote("Cities", "Different vibes.")),
        mis = listOf(CommonMistake("more bigger", "bigger", "No 'more' with -er."))
    )

    private fun f10C() = base(
        30, "10C — Have you ever...?", "۱۰C — تا حالا...؟",
        listOf("Present perfect with ever/never", "Life experiences", "Talk about travel"),
        listOf(
            v("ever", "هرگز", "Have you ever been?", "تا حالا بوده‌ای؟", "adverb"),
            v("never", "هرگز", "Never been.", "هرگز نبوده‌ام.", "adverb"),
            v("been", "بوده", "I've been to Japan.", "در ژاپن بوده‌ام.", "verb"),
            v("seen", "دیده", "I've seen it.", "دیده‌ام.", "verb"),
            v("tried", "امتحان کرده", "I've tried sushi.", "سوشی امتحان کرده‌ام.", "verb"),
            v("visited", "بازدید کرده", "I've visited France.", "از فرانسه بازدید کرده‌ام.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect with ever/never", "Have you ever...? I've never... / I've been to..."),
            GrammarSection("Contractions", "I've /aɪv/, she's /ʃiːz/, they've /ðeɪv/.")
        ),
        listOf(
            d("A", "Have you ever been to Japan?", "تا حالا ژاپن بوده‌ای؟"),
            d("B", "Yes, I have. Twice.", "بله. دو بار."),
            d("A", "Wow! Have you tried sushi?", "واو! سوشی امتحان کردی؟"),
            d("B", "Of course! It's delicious.", "البته! خوشمزه‌ست."),
            d("A", "Have you ever seen Mount Fuji?", "تا حالا کوه فوجی را دیده‌ای؟"),
            d("B", "Yes, it's beautiful. Have you ever been?", "بله، زیباست. تو بوده‌ای؟"),
            d("A", "No, I've never been. But I want to go.", "نه، هرگز. ولی می‌خواهم بروم."),
            d("B", "You should! You'll love it.", "باید! عاشقش می‌شوی.")
        ),
        listOf(
            q("Has B been to Japan?", listOf("no", "yes twice", "once"), 1),
            q("Has A been to Japan?", listOf("yes", "no", "maybe"), 1),
            q("Have you ever ___ to Japan?", listOf("be", "been", "being"), 1),
            q("I've ___ tried sushi.", listOf("ever", "never", "already"), 1)
        ),
        idioms = listOf(IdiomExpression("Have you ever...?", "تا حالا...؟", "Have you ever been?", "تا حالا بوده‌ای؟")),
        pron = listOf(PronunciationTip("I've", "/aɪv/")),
        cult = listOf(CulturalNote("Travel", "Broadens perspective.")),
        mis = listOf(CommonMistake("I've went.", "I've been.", "Past participle."))
    )

    // ═══════════════ FILE 11 ═══════════════
    private fun f11A() = base(
        31, "11A — Articles", "۱۱A — حرف تعریف",
        listOf("a/an/the", "General vs specific", "Talk about things"),
        listOf(
            v("a", "یک", "A book.", "یک کتاب.", "article"),
            v("an", "یک", "An apple.", "یک سیب.", "article"),
            v("the", "این/آن", "The book on the table.", "کتاب روی میز.", "article"),
            v("book", "کتاب", "Read a book.", "کتاب بخوان."),
            v("apple", "سیب", "An apple a day.", "یک سیب در روز."),
            v("sun", "خورشید", "The sun is hot.", "خورشید داغ است.")
        ),
        listOf(
            GrammarSection("a / an", "a before consonants: a book. an before vowels: an apple."),
            GrammarSection("the", "The = specific. The book on my desk. The sun.")
        ),
        listOf(
            d("A", "I have a new phone.", "یک موبایل جدید دارم."),
            d("B", "Nice! Is it an iPhone?", "قشنگه! آیفونه؟"),
            d("A", "Yes. And I bought a case too.", "بله. و یک قاب هم خریدم."),
            d("B", "Where's the case?", "قاب کجاست؟"),
            d("A", "The case is in my bag.", "قاب در کیسم است."),
            d("B", "Can I see the phone?", "می‌توانم موبایل را ببینم؟"),
            d("A", "Sure. Here it is.", "البته. بفرمایید."),
            d("B", "Wow! That's a beautiful phone.", "واو! موبایل زیبایی است.")
        ),
        listOf(
            q("What does A have?", listOf("a book", "a phone", "an apple"), 1),
            q("Is it an iPhone?", listOf("no", "yes", "maybe"), 1),
            q("It's ___ apple.", listOf("a", "an", "the"), 1),
            q("___ sun is hot today.", listOf("A", "An", "The"), 2)
        ),
        idioms = listOf(IdiomExpression("Here it is", "بفرمایید", "Here it is.", "بفرمایید.")),
        pron = listOf(PronunciationTip("a/an/the", "a /ə/, an /ən/, the /ðə/")),
        cult = listOf(CulturalNote("Articles", "Tricky for many learners.")),
        mis = listOf(CommonMistake("a apple", "an apple", "Use 'an' before vowels."))
    )

    private fun f11B() = base(
        32, "11B — First conditional", "۱۱B — شرطی نوع اول",
        listOf("First conditional", "Talk about possibilities", "if + present, will"),
        listOf(
            v("if", "اگر", "If you go...", "اگر بروی...", "conjunction"),
            v("will", "خواهد", "You will love it.", "عاشقش می‌شوی.", "verb"),
            v("rain", "باران", "If it rains...", "اگر باران بیاید...", "verb"),
            v("stay", "ماندن", "We'll stay home.", "خانه می‌مانیم.", "verb"),
            v("go", "رفتن", "If you go...", "اگر بروی...", "verb"),
            v("miss", "از دست دادن", "You'll miss the bus.", "اتوبوس را از دست می‌دهی.", "verb")
        ),
        listOf(
            GrammarSection("First conditional", "If + present simple, will + verb. If it rains, we'll stay home."),
            GrammarSection("Negative", "If you don't hurry, you'll miss the bus.")
        ),
        listOf(
            d("A", "What are your plans for tomorrow?", "برنامه‌ات برای فردا؟"),
            d("B", "If the weather is good, we'll go to the beach.", "اگر هوا خوب باشد، به ساحل می‌رویم."),
            d("A", "And if it rains?", "و اگر باران بیاید؟"),
            d("B", "If it rains, we'll stay home and watch movies.", "اگر باران بیاید، خانه می‌مانیم و فیلم می‌بینیم."),
            d("A", "That sounds nice too!", "آن هم خوبه!"),
            d("B", "Yes. What about you?", "بله. تو چطور؟"),
            d("A", "If I finish work early, I'll join you.", "اگر زود کارم تمام شود، به شما می‌پیوندم."),
            d("B", "Perfect! Let's hope for sun.", "عالی! امیدواریم آفتاب باشد.")
        ),
        listOf(
            q("If weather is good, where will they go?", listOf("mountains", "beach", "park"), 1),
            q("If it rains?", listOf("stay home", "go out", "swim"), 0),
            q("If it ___, we'll stay home.", listOf("rain", "rains", "rained"), 1),
            q("If you ___, you'll miss the bus.", listOf("don't hurry", "won't hurry", "not hurry"), 0)
        ),
        idioms = listOf(IdiomExpression("Let's hope", "امیدواریم", "Let's hope for sun.", "امیدواریم آفتاب باشد.")),
        pron = listOf(PronunciationTip("First conditional", "Rise on if-clause, fall on main.")),
        cult = listOf(CulturalNote("Weather-dependent", "Common for outdoor plans.")),
        mis = listOf(CommonMistake("If you will go", "If you go", "No 'will' in if-clause."))
    )

    private fun f11C() = base(
        33, "11C — Opinions", "۱۱C — نظرات",
        listOf("Give opinions", "Agree/disagree", "Express feelings"),
        listOf(
            v("think", "فکر کردن", "I think...", "فکر می‌کنم...", "verb"),
            v("agree", "موافق بودن", "I agree.", "موافقم.", "verb"),
            v("disagree", "مخالف بودن", "I disagree.", "مخالفم.", "verb"),
            v("maybe", "شاید", "Maybe yes.", "شاید بله.", "adverb"),
            v("sure", "مطمئن", "I'm sure.", "مطمئنم.", "adjective"),
            v("right", "درست", "You're right.", "حق با توست.", "adjective")
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
            d("B", "I agree! They were fantastic.", "موافقم! فوق‌العاده بودند.")
        ),
        listOf(
            q("What does B think of the movie?", listOf("bad", "great", "long"), 1),
            q("What does A think?", listOf("great", "too long", "boring"), 1),
            q("I ___ with you.", listOf("agree", "agrees", "agreeing"), 0),
            q("You're ___.", listOf("right", "rightly", "rightness"), 0)
        ),
        idioms = listOf(
            IdiomExpression("You're right", "حق با توست", "You're right.", "حق با توست."),
            IdiomExpression("I agree", "موافقم", "I agree.", "موافقم.")
        ),
        pron = listOf(PronunciationTip("Opinions", "Stress: I THINK, I aGREE")),
        cult = listOf(CulturalNote("Opinions", "Expressing politely is important.")),
        mis = listOf(CommonMistake("I agree you.", "I agree with you.", "Add 'with'."))
    )

    // ═══════════════ FILE 12 ═══════════════
    private fun f12A() = base(
        34, "12A — Experiences", "۱۲A — تجربه‌ها",
        listOf("Present perfect", "Life experiences", "Talk about achievements"),
        listOf(
            v("seen", "دیده", "I've seen it.", "دیده‌ام.", "verb"),
            v("been", "بوده", "I've been to Paris.", "در پاریس بوده‌ام.", "verb"),
            v("done", "انجام داده", "I've done it.", "انجامش داده‌ام.", "verb"),
            v("eaten", "خورده", "I've eaten sushi.", "سوشی خورده‌ام.", "verb"),
            v("visited", "بازدید کرده", "I've visited Japan.", "ژاپن را دیده‌ام.", "verb"),
            v("tried", "امتحان کرده", "I've tried it.", "امتحانش کرده‌ام.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect", "have/has + past participle. I've seen it. She's visited Paris."),
            GrammarSection("Questions", "Have you ever...? Yes, I have. / No, I haven't.")
        ),
        listOf(
            d("A", "Have you ever seen a famous person?", "تا حالا فرد معروفی دیده‌ای؟"),
            d("B", "Yes, I've seen a famous actor.", "بله، بازیگر معروفی دیده‌ام."),
            d("A", "Who?", "کی؟"),
            d("B", "Tom Hanks. He was in a restaurant.", "تام هنکس. در رستوران بود."),
            d("A", "Wow! Did you talk to him?", "واو! باهاش حرف زدی؟"),
            d("B", "No, I was too shy. But I took a photo.", "نه، خیلی خجالتی بودم. ولی عکس گرفتم."),
            d("A", "That's amazing!", "شگفت‌انگیزه!"),
            d("B", "Yes! Have you ever seen anyone famous?", "بله! تو کسی را دیده‌ای؟")
        ),
        listOf(
            q("Who has B seen?", listOf("a singer", "Tom Hanks", "a writer"), 1),
            q("Did B talk to him?", listOf("yes", "no", "a little"), 1),
            q("I ___ seen a famous person.", listOf("have", "has", "am"), 0),
            q("She ___ visited Paris.", listOf("have", "has", "is"), 1)
        ),
        idioms = listOf(IdiomExpression("Have you ever...?", "تا حالا...؟", "Have you ever seen?", "تا حالا دیده‌ای؟")),
        pron = listOf(PronunciationTip("I've /aɪv/, she's /ʃiːz/")),
        cult = listOf(CulturalNote("Celebrities", "Meeting one is exciting.")),
        mis = listOf(CommonMistake("I've saw it.", "I've seen it.", "Past participle."))
    )

    private fun f12B() = base(
        35, "12B — Already / Yet / Just", "۱۲B — قبلاً / هنوز / تازه",
        listOf("Already/Yet/Just", "Recent events", "Present perfect"),
        listOf(
            v("already", "قبلاً", "I've already done it.", "قبلاً انجامش داده‌ام.", "adverb"),
            v("yet", "هنوز", "I haven't done it yet.", "هنوز انجامش نداده‌ام.", "adverb"),
            v("just", "تازه", "I've just arrived.", "تازه رسیده‌ام.", "adverb"),
            v("finished", "تمام کرده", "I've finished.", "تمام کرده‌ام.", "verb"),
            v("arrived", "رسیده", "She's arrived.", "او رسیده.", "verb"),
            v("started", "شروع کرده", "It's just started.", "تازه شروع شده.", "verb")
        ),
        listOf(
            GrammarSection("Already", "Positive: I've already eaten. Before main verb."),
            GrammarSection("Yet", "Negative/question at end: I haven't eaten yet. Have you eaten yet?"),
            GrammarSection("Just", "Very recent: I've just arrived.")
        ),
        listOf(
            d("A", "Have you finished your homework?", "تکالیفت را تمام کردی؟"),
            d("B", "Yes, I've already finished.", "بله، قبلاً تمام کرده‌ام."),
            d("A", "Great! Have you eaten?", "عالی! غذا خوردی؟"),
            d("B", "No, not yet. I'm hungry.", "نه، هنوز نه. گرسنه‌ام."),
            d("A", "I've just made pasta. Want some?", "تازه پاستا درست کرده‌ام. می‌خواهی؟"),
            d("B", "Perfect! I'd love some.", "عالی! خیلی دوست دارم."),
            d("A", "Here you are.", "بفرمایید."),
            d("B", "Thanks! You're the best.", "ممنون! تو بهترینی.")
        ),
        listOf(
            q("Has B finished homework?", listOf("no", "yes", "almost"), 1),
            q("Has B eaten?", listOf("yes", "no", "just"), 1),
            q("I've ___ finished.", listOf("yet", "already", "ever"), 1),
            q("I haven't eaten ___.", listOf("yet", "already", "just"), 0)
        ),
        idioms = listOf(IdiomExpression("Here you are", "بفرمایید", "Here you are.", "بفرمایید.")),
        pron = listOf(PronunciationTip("Already/Yet", "alREADY, YET")),
        cult = listOf(CulturalNote("Homework", "Common in schools.")),
        mis = listOf(CommonMistake("I've eaten already yet.", "I've already eaten.", "One adverb."))
    )

    private fun f12C() = base(
        36, "12C — Goodbye!", "۱۲C — خداحافظ!",
        listOf("Review present perfect", "Say goodbye", "Talk about future"),
        listOf(
            v("goodbye", "خداحافظ", "Goodbye!", "خداحافظ!", "interjection"),
            v("good luck", "موفق باشی", "Good luck!", "موفق باشی!", "phrase"),
            v("keep in touch", "در تماس باش", "Keep in touch.", "در تماس باش.", "verb"),
            v("miss", "دلتنگ شدن", "I'll miss you.", "دلتنگت می‌شوم.", "verb"),
            v("hope", "امیدوار بودن", "I hope to see you.", "امیدوارم ببینمت.", "verb"),
            v("soon", "به‌زودی", "See you soon!", "به‌زودی می‌بینمت!", "adverb")
        ),
        listOf(
            GrammarSection("Review present perfect", "I've been. I've seen. Have you ever...?"),
            GrammarSection("Saying goodbye", "Goodbye. Good luck. Keep in touch. See you soon.")
        ),
        listOf(
            d("A", "Is this your last class?", "آخرین کلاسته؟"),
            d("B", "Yes. I've finished the course!", "بله. دوره را تمام کرده‌ام!"),
            d("A", "Congratulations! What will you do now?", "تبریک! الان چیکار می‌کنی؟"),
            d("B", "I'm going to study for the next level.", "قرار است برای سطح بعدی درس بخوانم."),
            d("A", "Great! Keep in touch.", "عالی! در تماس باش."),
            d("B", "Of course. I'll miss this class.", "البته. دلتنگ این کلاس می‌شوم."),
            d("A", "Good luck with everything!", "موفق باشی در همه چیز!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!")
        ),
        listOf(
            q("Has B finished the course?", listOf("no", "yes", "almost"), 1),
            q("What will B do next?", listOf("travel", "study", "work"), 1),
            q("I ___ finished the course.", listOf("have", "has", "am"), 0),
            q("I'll ___ you.", listOf("miss", "missing", "missed"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Good luck!", "موفق باشی!", "Good luck!", "موفق باشی!"),
            IdiomExpression("Keep in touch", "در تماس باش", "Keep in touch!", "در تماس باش!")
        ),
        pron = listOf(PronunciationTip("Good luck", "/ɡʊd lʌk/")),
        cult = listOf(CulturalNote("End of course", "Congratulations!"))
        ,
        mis = listOf(CommonMistake("I'll miss to you.", "I'll miss you.", "No 'to'."))
    )
}