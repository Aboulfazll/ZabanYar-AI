package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 4th Edition — Starter
 * 12 Files | Beginner (A1)
 * آموزش مکالمه، گرامر، واژگان و تلفظ برای مبتدی‌ها
 */
object AmericanEnglishFile4thStarter {
    const val BOOK_ID = "american_english_file_4th_starter"

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
        pronunciation: List<PronunciationTip> = emptyList(),
        culture: List<CulturalNote> = emptyList(),
        mistakes: List<CommonMistake> = emptyList()
    ) = LessonContent(
        bookId = BOOK_ID, chapterNumber = n, title = title, titlePersian = fa,
        objectives = objectives, vocabulary = vocab, idioms = idioms,
        pronunciationTips = pronunciation, culturalNotes = culture,
        grammar = grammar, commonMistakes = mistakes,
        conversation = dialogue, quiz = quiz
    )

    private fun v(e: String, p: String, ex: String, ep: String, pos: String = "noun") =
        VocabWord(e, p, partOfSpeech = pos, example = ex, examplePersian = ep)

    private fun d(s: String, e: String, p: String) = DialogueLine(s, e, p)

    private fun q(question: String, options: List<String>, correct: Int) =
        QuizQuestion(question, options, correct)

    // ═══════════════════════════════════════════════════════════
    // FILE 1 — Hello! | سلام!
    // ═══════════════════════════════════════════════════════════
    private fun file1() = base(
        1, "Hello!", "سلام!",
        listOf(
            "Greet people and introduce yourself",
            "Use verb be (singular): I and you",
            "Say numbers 0–10",
            "Say goodbye in different ways"
        ),
        listOf(
            v("hello", "سلام", "Hello, I'm Tom.", "سلام، من تام هستم.", "interjection"),
            v("name", "نام", "What's your name?", "نامت چیست؟"),
            v("nice to meet you", "از آشنایی خوشحالم", "Nice to meet you, Helen.", "از آشنایی خوشحالم، هلن."),
            v("goodbye", "خداحافظ", "Goodbye, see you tomorrow.", "خداحافظ، فردا می‌بینمت."),
            v("coffee", "قهوه", "A coffee, please.", "یک قهوه، لطفاً."),
            v("tea", "چای", "A tea, please.", "یک چای، لطفاً."),
            v("day", "روز", "What day is it today?", "امروز چه روزی است؟"),
            v("phone", "تلفن", "What's your phone number?", "شماره تلفنت چیست؟")
        ),
        listOf(
            GrammarSection("Verb be (singular): I and you", "Use am for I and are for you. I am Tom. You are Helen. Contractions: I'm, you're."),
            GrammarSection("Verb be (singular): he, she, it", "Use is for he, she, it. He is Tom. She is Helen. Contractions: he's, she's, it's."),
            GrammarSection("Numbers 0–10", "Zero, one, two, three, four, five, six, seven, eight, nine, ten.")
        ),
        listOf(
            d("A", "Hello. A coffee, please.", "سلام. یک قهوه، لطفاً."),
            d("B", "What's your name?", "نامت چیست؟"),
            d("A", "Helen.", "هلن."),
            d("B", "Helen. OK. Just a minute.", "هلن. باشه. یک دقیقه."),
            d("A", "Thank you.", "ممنون."),
            d("C", "Hi. Are you Helen?", "سلام. تو هلن هستی؟"),
            d("A", "Yes, I am.", "بله."),
            d("C", "I'm Tom. Nice to meet you.", "من تام هستم. از آشنایی خوشحالم."),
            d("A", "Nice to meet you, too.", "من هم خوشحالم."),
            d("C", "Where are you from?", "اهل کجایی؟"),
            d("A", "I'm from Italy. And you?", "اهل ایتالیا هستم. تو چطور؟"),
            d("C", "I'm from Canada. Well, see you later!", "اهل کانادا هستم. خب، بعداً می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!")
        ),
        listOf(
            q("What does Helen order?", listOf("a tea", "a coffee", "a water"), 1),
            q("Where is Tom from?", listOf("Italy", "Canada", "England"), 1),
            q("Choose the correct sentence.", listOf("I is Tom.", "I am Tom.", "I are Tom."), 1),
            q("What's the contraction for 'I am'?", listOf("I'm", "I're", "I's"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you, Helen.", "از آشنایی خوشحالم، هلن."),
            IdiomExpression("See you later", "بعداً می‌بینمت", "See you later!", "بعداً می‌بینمت!"),
            IdiomExpression("Just a minute", "یک دقیقه", "Just a minute, please.", "یک دقیقه، لطفاً.")
        ),
        pronunciation = listOf(
            PronunciationTip("Contractions", "Practice natural contractions: I'm /aɪm/, you're /jʊr/, he's /hiːz/.")
        ),
        culture = listOf(
            CulturalNote("First names", "In casual settings, English speakers usually use first names immediately.")
        ),
        mistakes = listOf(
            CommonMistake("I is Tom.", "I am Tom.", "Use 'am' with 'I'.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 2 — What's in your bag? | چی توی کیفت داری؟
    // ═══════════════════════════════════════════════════════════
    private fun file2() = base(
        2, "What's in your bag?", "چی توی کیفت داری؟",
        listOf(
            "Talk about objects and possessions",
            "Use this, that, these, those",
            "Talk about family members",
            "Use adjectives and colors"
        ),
        listOf(
            v("bag", "کیف", "What's in your bag?", "چی توی کیفت داری؟"),
            v("phone", "موبایل", "This is my phone.", "این موبایل من است."),
            v("book", "کتاب", "That's a good book.", "آن کتاب خوبی است."),
            v("keys", "کلیدها", "These are my keys.", "این‌ها کلیدهای من هستند."),
            v("watch", "ساعت مچی", "That's a nice watch.", "آن ساعت مچی قشنگی است."),
            v("family", "خانواده", "My family is big.", "خانواده‌ام بزرگ است."),
            v("mother", "مادر", "My mother is a teacher.", "مادرم معلم است."),
            v("father", "پدر", "His father is a doctor.", "پدرش پزشک است."),
            v("color", "رنگ", "What color is it?", "چه رنگی است؟"),
            v("red", "قرمز", "It's red.", "قرمز است.", "adjective")
        ),
        listOf(
            GrammarSection("this / that / these / those", "Use this/these for near, that/those for far. This is my phone. Those are my keys."),
            GrammarSection("Possessive adjectives: my, your, his, her", "My mother, your father, his sister, her book."),
            GrammarSection("Adjectives and colors", "Colors come before nouns: a red bag, a blue watch.")
        ),
        listOf(
            d("A", "What's in your bag?", "چی توی کیفت داری؟"),
            d("B", "This is my phone. And these are my keys.", "این موبایل منه. و این‌ها کلیدهام هستن."),
            d("A", "Nice phone! Is that your watch?", "موبایل قشنگیه! اون ساعت مچیت هست؟"),
            d("B", "No, that's my brother's watch. He's at school.", "نه، اون ساعت برادرمه. اون مدرسه‌ست."),
            d("A", "Do you have a big family?", "خانواده بزرگی داری؟"),
            d("B", "Yes, I do. I have two brothers and one sister.", "بله. دو تا برادر و یک خواهر دارم."),
            d("A", "That's a nice family.", "خانواده خوبیه."),
            d("B", "Thanks. What about you?", "ممنون. تو چطور؟"),
            d("A", "I have one sister. Her name is Maria.", "من یک خواهر دارم. اسمش ماریاست."),
            d("B", "Nice. Well, see you later!", "خوبه. خب، بعداً می‌بینمت!"),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What is in B's bag?", listOf("a book", "a phone", "a watch"), 1),
            q("How many brothers does B have?", listOf("one", "two", "three"), 1),
            q("___ is my phone.", listOf("This", "These", "Those"), 0),
            q("___ are my keys.", listOf("This", "These", "That"), 1)
        ),
        idioms = listOf(
            IdiomExpression("At school", "در مدرسه", "He's at school.", "او در مدرسه است."),
            IdiomExpression("See you later", "بعداً می‌بینمت", "See you later!", "بعداً می‌بینمت!")
        ),
        pronunciation = listOf(
            PronunciationTip("Plural -s", "Practice the /s/ and /z/ sounds: keys /kiːz/, books /bʊks/.")
        ),
        culture = listOf(
            CulturalNote("Family", "English uses specific terms: mother, father, sister, brother, aunt, uncle, cousin.")
        ),
        mistakes = listOf(
            CommonMistake("This are my keys.", "These are my keys.", "Use 'these' for plural.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 3 — A bad hair day | یک روز بد
    // ═══════════════════════════════════════════════════════════
    private fun file3() = base(
        3, "A bad hair day", "یک روز بد",
        listOf(
            "Use present simple: I, you, we, they",
            "Talk about jobs and daily activities",
            "Order food and drinks",
            "Talk about time"
        ),
        listOf(
            v("job", "شغل", "What's your job?", "شغلت چیست؟"),
            v("teacher", "معلم", "He's a teacher.", "او معلم است."),
            v("student", "دانشجو", "She's a student.", "او دانشجو است."),
            v("doctor", "پزشک", "My mother is a doctor.", "مادرم پزشک است."),
            v("work", "کار کردن", "I work in an office.", "در یک دفتر کار می‌کنم.", "verb"),
            v("eat", "خوردن", "I eat breakfast at 7.", "ساعت ۷ صبحانه می‌خورم.", "verb"),
            v("drink", "نوشیدن", "She drinks tea.", "او چای می‌نوشد.", "verb"),
            v("morning", "صبح", "I get up early in the morning.", "صبح زود بیدار می‌شوم."),
            v("night", "شب", "Good night!", "شب بخیر!"),
            v("bread", "نان", "I eat bread for breakfast.", "برای صبحانه نان می‌خورم.")
        ),
        listOf(
            GrammarSection("Present simple: I, you, we, they", "Use the base verb: I work, you eat, we drink, they like."),
            GrammarSection("Present simple: he, she, it", "Add -s or -es: He works, she eats, it rains."),
            GrammarSection("Questions with do/does", "Do you work? Does she like tea?")
        ),
        listOf(
            d("A", "What do you do?", "شغلت چیه؟"),
            d("B", "I'm a teacher. I teach English.", "معلمم. انگلیسی درس می‌دم."),
            d("A", "That's interesting. What time do you start?", "جالبه. چه ساعتی شروع می‌کنی؟"),
            d("B", "I start at 8. I usually get up at 6:30.", "ساعت ۸ شروع می‌کنم. معمولاً ۶:۳۰ بیدار می‌شم."),
            d("A", "That's early! What do you have for breakfast?", "زوده! برای صبحانه چی می‌خوری؟"),
            d("B", "I have bread and tea. And you?", "نان و چای. تو چطور؟"),
            d("A", "I don't eat breakfast. I just have coffee.", "من صبحانه نمی‌خورم. فقط قهوه می‌خورم."),
            d("B", "Really? That's not very healthy!", "واقعاً؟ خیلی سالم نیست!"),
            d("A", "I know. But I don't have time.", "می‌دونم. ولی وقت ندارم."),
            d("B", "Well, I have to go. See you tomorrow!", "خب، باید برم. فردا می‌بینمت!"),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What is B's job?", listOf("a doctor", "a teacher", "a student"), 1),
            q("What time does B start work?", listOf("7:00", "8:00", "9:00"), 1),
            q("I ___ coffee every morning.", listOf("drinks", "drink", "drinking"), 1),
            q("She ___ tea.", listOf("drink", "drinks", "drinking"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Get up", "بیدار شدن", "I get up at 6:30.", "ساعت ۶:۳۰ بیدار می‌شم."),
            IdiomExpression("Have breakfast", "صبحانه خوردن", "I have breakfast at 7.", "ساعت ۷ صبحانه می‌خورم."),
            IdiomExpression("Have to go", "باید بروم", "I have to go.", "باید بروم.")
        ),
        pronunciation = listOf(
            PronunciationTip("Third-person -s", "Listen for the -s: works, eats, drinks, likes.")
        ),
        culture = listOf(
            CulturalNote("Meal times", "Meal times vary by country. In many English-speaking countries, breakfast is at 7-8 AM.")
        ),
        mistakes = listOf(
            CommonMistake("I drinks coffee.", "I drink coffee.", "Use base verb with 'I'."),
            CommonMistake("She have breakfast.", "She has breakfast.", "Use 'has' with she/he/it.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 4 — Do you like mornings? | صبح‌ها رو دوست داری؟
    // ═══════════════════════════════════════════════════════════
    private fun file4() = base(
        4, "Do you like mornings?", "صبح‌ها رو دوست داری؟",
        listOf(
            "Use adverbs of frequency",
            "Talk about routines and preferences",
            "Use can/can't for ability",
            "Ask and answer yes/no questions"
        ),
        listOf(
            v("always", "همیشه", "I always get up early.", "همیشه زود بیدار می‌شم.", "adverb"),
            v("usually", "معمولاً", "I usually drink coffee.", "معمولاً قهوه می‌نوشم.", "adverb"),
            v("sometimes", "گاهی", "Sometimes I read at night.", "گاهی شب‌ها مطالعه می‌کنم.", "adverb"),
            v("never", "هرگز", "I never drink tea.", "هرگز چای نمی‌نوشم.", "adverb"),
            v("can", "توانستن", "I can swim.", "می‌توانم شنا کنم.", "verb"),
            v("swim", "شنا کردن", "She can swim very well.", "او خیلی خوب شنا می‌کند.", "verb"),
            v("cook", "آشپزی کردن", "Can you cook?", "آشپزی می‌توانی؟", "verb"),
            v("drive", "رانندگی کردن", "He can drive.", "او می‌تواند رانندگی کند.", "verb"),
            v("morning", "صبح", "Do you like mornings?", "صبح‌ها رو دوست داری؟"),
            v("evening", "عصر", "I study in the evening.", "عصرها مطالعه می‌کنم.")
        ),
        listOf(
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, never. They come before the main verb: I always get up early."),
            GrammarSection("Can/Can't for ability", "I can swim. She can't drive. Can you cook? Yes, I can."),
            GrammarSection("Yes/No questions", "Do you like...? Can you...? Yes, I do. / No, I don't.")
        ),
        listOf(
            d("A", "Do you like mornings?", "صبح‌ها رو دوست داری؟"),
            d("B", "Not really. I usually get up late.", "نه زیاد. معمولاً دیر بیدار می‌شم."),
            d("A", "Me too! I always drink coffee to wake up.", "من هم! همیشه قهوه می‌خورم تا بیدار شم."),
            d("B", "Can you cook?", "آشپزی می‌تونی؟"),
            d("A", "Yes, I can. I sometimes cook dinner.", "بله. گاهی شام می‌پزم."),
            d("B", "Nice! I can't cook very well. I usually eat out.", "عالیه! من خیلی خوب نمی‌تونم آشپزی کنم. معمولاً بیرون غذا می‌خورم."),
            d("A", "That's expensive!", "گرونه!"),
            d("B", "I know. But I'm always busy.", "می‌دونم. ولی همیشه مشغولم."),
            d("A", "Well, see you tomorrow.", "خب، فردا می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("When does B get up?", listOf("early", "late", "at 6"), 1),
            q("Can B cook?", listOf("yes", "no", "sometimes"), 1),
            q("I ___ drink coffee.", listOf("always", "always drink", "drink always"), 0),
            q("She ___ swim.", listOf("can", "cans", "can to"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Wake up", "بیدار شدن", "I drink coffee to wake up.", "قهوه می‌خورم تا بیدار شم."),
            IdiomExpression("Eat out", "بیرون غذا خوردن", "I usually eat out.", "معمولاً بیرون غذا می‌خورم."),
            IdiomExpression("Not really", "نه زیاد", "Not really.", "نه زیاد.")
        ),
        pronunciation = listOf(
            PronunciationTip("Can vs. Can't", "In American English: can /kæn/, can't /kænt/. Listen for the final -t.")
        ),
        culture = listOf(
            CulturalNote("Eating out", "Eating out is common in many countries. Restaurants offer takeout options.")
        ),
        mistakes = listOf(
            CommonMistake("I drink always coffee.", "I always drink coffee.", "Adverbs go before the main verb.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 5 — Before they were famous | قبل از اینکه معروف بشن
    // ═══════════════════════════════════════════════════════════
    private fun file5() = base(
        5, "Before they were famous", "قبل از اینکه معروف بشن",
        listOf(
            "Use simple past: was/were",
            "Talk about the past",
            "Use prepositions of place",
            "Describe people and places"
        ),
        listOf(
            v("yesterday", "دیروز", "I was tired yesterday.", "دیروز خسته بودم."),
            v("born", "متولد شدن", "He was born in 1990.", "او در سال ۱۹۹۰ متولد شد."),
            v("child", "کودک", "When I was a child, I lived in London.", "وقتی بچه بودم، در لندن زندگی می‌کردم."),
            v("famous", "معروف", "Before they were famous, they were students.", "قبل از معروف شدن، دانشجو بودند.", "adjective"),
            v("poor", "فقیر", "They were very poor.", "آن‌ها خیلی فقیر بودند.", "adjective"),
            v("rich", "ثروتمند", "Now they're rich.", "الان ثروتمند هستند.", "adjective"),
            v("school", "مدرسه", "They were at school together.", "با هم در مدرسه بودند."),
            v("city", "شهر", "He was born in a small city.", "او در یک شهر کوچک متولد شد."),
            v("country", "کشور", "Which country were you born in?", "در کدام کشور متولد شدی؟"),
            v("famous", "معروف", "She's a famous singer.", "او خواننده معروفی است.", "adjective")
        ),
        listOf(
            GrammarSection("Simple past: was/were", "I was, you were, he was, she was, it was, we were, they were."),
            GrammarSection("Prepositions of place: in, at, on", "in a city, at home, on a street."),
            GrammarSection("Time expressions for the past", "yesterday, last night, last week, in 1990.")
        ),
        listOf(
            d("A", "Where were you born?", "کجا متولد شدی؟"),
            d("B", "I was born in a small city in Canada.", "در یک شهر کوچک در کانادا متولد شدم."),
            d("A", "Were you a good student?", "شاگرد خوبی بودی؟"),
            d("B", "Yes, I was. I was very quiet.", "بله. خیلی ساکت بودم."),
            d("A", "What was your first job?", "اولین شغلت چی بود؟"),
            d("B", "I was a waiter in a restaurant.", "پیشخدمت رستوران بودم."),
            d("A", "That's interesting. Were you tired?", "جالبه. خسته بودی؟"),
            d("B", "Yes, I was. But I was happy too.", "بله. ولی خوشحال هم بودم."),
            d("A", "Where were your parents?", "والدینت کجا بودند؟"),
            d("B", "They were in Canada. They still live there.", "در کانادا بودند. هنوز هم آنجا زندگی می‌کنند."),
            d("A", "Thanks for sharing. See you later.", "ممنون که گفتی. بعداً می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where was B born?", listOf("America", "Canada", "England"), 1),
            q("What was B's first job?", listOf("teacher", "waiter", "doctor"), 1),
            q("I ___ tired yesterday.", listOf("am", "was", "were"), 1),
            q("They ___ at home.", listOf("was", "were", "am"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Be born", "متولد شدن", "I was born in Canada.", "در کانادا متولد شدم."),
            IdiomExpression("Grow up", "بزرگ شدن", "I grew up in a small city.", "در یک شهر کوچک بزرگ شدم.")
        ),
        pronunciation = listOf(
            PronunciationTip("Was / Were", "Weak forms: was /wəz/, were /wər/ in fast speech.")
        ),
        culture = listOf(
            CulturalNote("Talking about the past", "Asking about someone's past is a common way to know them better.")
        ),
        mistakes = listOf(
            CommonMistake("I were tired.", "I was tired.", "Use 'was' with I/he/she/it.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 6 — On an island in Alaska | در جزیره‌ای در آلاسکا
    // ═══════════════════════════════════════════════════════════
    private fun file6() = base(
        6, "On an island in Alaska", "در جزیره‌ای در آلاسکا",
        listOf(
            "Use there is / there are",
            "Talk about places and locations",
            "Use prepositions of place",
            "Describe a place"
        ),
        listOf(
            v("island", "جزیره", "They live on a small island.", "آن‌ها در یک جزیره کوچک زندگی می‌کنند."),
            v("village", "روستا", "The village is very quiet.", "روستا خیلی ساکت است."),
            v("river", "رودخانه", "There's a river near the village.", "رودخانه‌ای نزدیک روستا هست."),
            v("mountain", "کوه", "There are mountains everywhere.", "همه جا کوه هست."),
            v("tree", "درخت", "There are many trees here.", "اینجا درختان زیادی هست."),
            v("animal", "حیوان", "There are wild animals.", "حیوانات وحشی وجود دارند."),
            v("quiet", "ساکت", "The village is quiet.", "روستا ساکت است.", "adjective"),
            v("beautiful", "زیبا", "It's a beautiful place.", "جای زیبایی است.", "adjective"),
            v("weather", "هوا", "The weather is cold.", "هوا سرد است."),
            v("small", "کوچک", "It's a small island.", "جزیره کوچکی است.", "adjective")
        ),
        listOf(
            GrammarSection("There is / There are", "Use 'there is' for singular, 'there are' for plural. There is a river. There are many trees."),
            GrammarSection("Prepositions of place", "in, on, under, near, next to, between."),
            GrammarSection("Questions with there is/are", "Is there a bank? Are there any restaurants?")
        ),
        listOf(
            d("A", "Where do you live?", "کجا زندگی می‌کنی؟"),
            d("B", "I live on a small island in Alaska.", "در یک جزیره کوچک در آلاسکا زندگی می‌کنم."),
            d("A", "Alaska! What's it like?", "آلاسکا! چطور جاییه؟"),
            d("B", "It's beautiful. There are mountains and rivers everywhere.", "زیباست. همه جا کوه و رودخانه هست."),
            d("A", "Are there many people?", "افراد زیادی هستن؟"),
            d("B", "No, there aren't. Only about 200 people.", "نه، زیاد نیستن. فقط حدود ۲۰۰ نفر."),
            d("A", "That's very small! Is there a school?", "خیلی کوچیکه! مدرسه هست؟"),
            d("B", "Yes, there is. And there's a small store too.", "بله. و یک فروشگاه کوچک هم هست."),
            d("A", "What's the weather like?", "هوا چطوره؟"),
            d("B", "It's very cold in winter. There's a lot of snow.", "زمستان خیلی سرده. برف زیادی میاد."),
            d("A", "Sounds difficult. But also beautiful.", "سخت به نظر میاد. ولی زیبا هم هست."),
            d("B", "Yes, it is. You should visit!", "بله. باید بیای!"),
            d("A", "I'd love to!", "خیلی دوست دارم!")
        ),
        listOf(
            q("Where does B live?", listOf("in a city", "on an island", "in a village in Europe"), 1),
            q("How many people live there?", listOf("200", "2000", "20"), 0),
            q("___ a river near the village.", listOf("There is", "There are", "Is there"), 0),
            q("___ many trees here.", listOf("There is", "There are", "Is there"), 1)
        ),
        idioms = listOf(
            IdiomExpression("What's it like?", "چطور جاییه؟", "What's it like?", "چطور جاییه؟"),
            IdiomExpression("A lot of", "زیاد", "There's a lot of snow.", "برف زیادی میاد.")
        ),
        pronunciation = listOf(
            PronunciationTip("There is / There are", "Linking: there_is, there_are.")
        ),
        culture = listOf(
            CulturalNote("Life in Alaska", "Alaska is a state in the US with beautiful nature and small communities.")
        ),
        mistakes = listOf(
            CommonMistake("There is many trees.", "There are many trees.", "Use 'there are' for plural.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 7 — What are they doing? | آن‌ها چه کار می‌کنند؟
    // ═══════════════════════════════════════════════════════════
    private fun file7() = base(
        7, "What are they doing?", "آن‌ها چه کار می‌کنند؟",
        listOf(
            "Use present continuous",
            "Talk about actions happening now",
            "Describe the weather",
            "Talk about future plans with be going to"
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
            GrammarSection("Present continuous", "am/is/are + verb-ing. I'm reading. She's wearing a dress. They're playing."),
            GrammarSection("Present continuous questions", "What are you doing? What is he doing?"),
            GrammarSection("Be going to for future plans", "I'm going to visit my family tomorrow."),
            GrammarSection("Weather", "It's raining / snowing / sunny / cloudy / windy.")
        ),
        listOf(
            d("A", "Hello? This is Anna.", "سلام؟ آنّا هستم."),
            d("B", "Hi, Anna. It's Mike. What are you doing?", "سلام آنّا. مایک هستم. چه کار می‌کنی؟"),
            d("A", "I'm cooking dinner. What about you?", "دارم شام می‌پزم. تو چطور؟"),
            d("B", "I'm watching TV. It's raining outside.", "دارم تلویزیون تماشا می‌کنم. بیرون باران می‌آید."),
            d("A", "Is it raining? It's sunny here.", "باران می‌آید؟ اینجا آفتابی است."),
            d("B", "Really? The weather is so different.", "واقعاً؟ هوا اینقدر متفاوت است."),
            d("A", "What are your kids doing?", "بچه‌هایت چه کار می‌کنند؟"),
            d("B", "They're playing a game. My son is winning.", "دارند بازی می‌کنند. پسرم دارد می‌برد."),
            d("A", "That's fun. Are you cooking anything special?", "سرگرم‌کننده است. چیز خاصی می‌پزی؟"),
            d("B", "Just pasta. Are you going to visit us soon?", "فقط پاستا. قراره به ما سر بزنی؟"),
            d("A", "Yes, I'm going to visit next week!", "بله، هفته بعد میام!"),
            d("B", "Great! See you soon.", "عالی! به‌زودی می‌بینمت."),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What is Anna doing?", listOf("watching TV", "cooking dinner", "reading"), 1),
            q("What is the weather like at Mike's house?", listOf("sunny", "raining", "cloudy"), 1),
            q("What ___ you doing?", listOf("is", "are", "am"), 1),
            q("She ___ wearing a red dress.", listOf("is", "are", "am"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Come over", "به خانه کسی آمدن", "Do you want to come over?", "می‌خواهی بیایی؟"),
            IdiomExpression("What about you?", "تو چطور؟", "What about you?", "تو چطور؟")
        ),
        pronunciation = listOf(
            PronunciationTip("The -ing sound", "Practice: cooking /ˈkʊkɪŋ/, raining /ˈreɪnɪŋ/.")
        ),
        culture = listOf(
            CulturalNote("Weather small talk", "The weather is a very common topic of small talk in English.")
        ),
        mistakes = listOf(
            CommonMistake("What you are doing?", "What are you doing?", "In questions, verb comes before subject.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 8 — A house with a history | خانه‌ای با تاریخچه
    // ═══════════════════════════════════════════════════════════
    private fun file8() = base(
        8, "A house with a history", "خانه‌ای با تاریخچه",
        listOf(
            "Use simple past: regular verbs",
            "Talk about past activities",
            "Use time expressions for the past",
            "Describe past events"
        ),
        listOf(
            v("visited", "بازدید کرد", "We visited many museums.", "از موزه‌های زیادی بازدید کردیم.", "verb"),
            v("started", "شروع کرد", "I started a new job.", "شغل جدیدی شروع کردم.", "verb"),
            v("finished", "تمام کرد", "She finished her studies.", "تحصیلاتش را تمام کرد.", "verb"),
            v("worked", "کار کرد", "He worked in a hospital.", "او در بیمارستان کار کرد.", "verb"),
            v("learned", "یاد گرفت", "I learned to speak English.", "یاد گرفتم انگلیسی صحبت کنم.", "verb"),
            v("moved", "نقل مکان کرد", "They moved to a new city.", "به شهر جدیدی نقل مکان کردند.", "verb"),
            v("married", "ازدواج کرد", "She married her college boyfriend.", "با دوست‌پسر دانشگاهش ازدواج کرد.", "verb"),
            v("met", "ملاقات کرد", "I met my best friend at work.", "بهترین دوستم را در محل کار ملاقات کردم.", "verb"),
            v("old", "قدیمی", "It's an old house.", "خانه قدیمی است.", "adjective"),
            v("history", "تاریخچه", "The house has a history.", "خانه تاریخچه دارد.")
        ),
        listOf(
            GrammarSection("Simple past: regular verbs", "Add -ed: visit → visited, work → worked, start → started."),
            GrammarSection("Spelling rules", "like → liked, study → studied, stop → stopped."),
            GrammarSection("Questions in past", "Did you travel? Did she work? Where did you go?")
        ),
        listOf(
            d("A", "Did you travel last year?", "سال گذشته سفر کردی؟"),
            d("B", "Yes, I did. I visited an old house in Italy.", "بله. از یک خانه قدیمی در ایتالیا بازدید کردم."),
            d("A", "That sounds interesting. Did you like it?", "جالب به نظر می‌رسد. دوستش داشتی؟"),
            d("B", "I loved it. The house had a long history.", "عاشقش شدم. خانه تاریخچه طولانی داشت."),
            d("A", "How old was it?", "چند ساله بود؟"),
            d("B", "About 200 years old. A famous writer lived there.", "حدود ۲۰۰ سال. یک نویسنده معروف آنجا زندگی می‌کرد."),
            d("A", "Wow! Did you learn anything?", "واو! چیزی یاد گرفتی؟"),
            d("B", "Yes, I learned a lot about Italian culture.", "بله، چیزهای زیادی درباره فرهنگ ایتالیا یاد گرفتم."),
            d("A", "Did you buy anything?", "چیزی خریدی؟"),
            d("B", "Yes, I bought a book about the house.", "بله، یک کتاب درباره خانه خریدم."),
            d("A", "That's a great souvenir. Well, see you later.", "سوغات خوبیه. خب، بعداً می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where did B travel?", listOf("France", "Italy", "Spain"), 1),
            q("How old was the house?", listOf("50 years", "100 years", "200 years"), 2),
            q("I ___ to Africa last year.", listOf("go", "went", "going"), 1),
            q("She ___ a new job.", listOf("start", "started", "starting"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Change my life", "زندگی‌ام را تغییر دادن", "It changed my life.", "زندگی‌ام را تغییر داد."),
            IdiomExpression("Good change", "تغییر خوب", "It was a good change.", "تغییر خوبی بود.")
        ),
        pronunciation = listOf(
            PronunciationTip("-ed endings", "Three sounds: /t/ (worked), /d/ (traveled), /ɪd/ (visited).")
        ),
        culture = listOf(
            CulturalNote("Travel", "Travel opens our eyes to new cultures and perspectives.")
        ),
        mistakes = listOf(
            CommonMistake("Did you traveled?", "Did you travel?", "After 'did', use base verb.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 9 — #mydinnerlastnight | #شام_دیشبم
    // ═══════════════════════════════════════════════════════════
    private fun file9() = base(
        9, "#mydinnerlastnight", "#شام_دیشبم",
        listOf(
            "Use countable and uncountable nouns",
            "Use quantifiers: some, any, much, many",
            "Talk about food and meals",
            "Order food in a restaurant"
        ),
        listOf(
            v("rice", "برنج", "I ate rice for dinner.", "برای شام برنج خوردم."),
            v("bread", "نان", "We bought some bread.", "مقداری نان خریدیم."),
            v("water", "آب", "I drank a lot of water.", "آب زیادی نوشیدم."),
            v("apple", "سیب", "I ate two apples.", "دو سیب خوردم."),
            v("orange", "پرتقال", "Do you want an orange?", "پرتقال می‌خواهی؟"),
            v("some", "مقداری", "I have some cheese.", "مقداری پنیر دارم.", "adverb"),
            v("any", "هیچ", "Do you have any milk?", "شیر داری؟", "adverb"),
            v("much", "زیاد", "How much water do you drink?", "چقدر آب می‌نوشی؟", "adverb"),
            v("many", "زیاد", "How many apples are there?", "چند تا سیب هست؟", "adverb"),
            v("restaurant", "رستوران", "We ate at a restaurant.", "در رستوران غذا خوردیم.")
        ),
        listOf(
            GrammarSection("Countable vs. uncountable", "Countable: apple, book, chair. Uncountable: water, bread, rice."),
            GrammarSection("Quantifiers", "some (positive), any (questions/negatives), much (uncountable), many (countable)."),
            GrammarSection("Ordering food", "I'd like... Can I have...? A table for two, please.")
        ),
        listOf(
            d("A", "What did you have for dinner last night?", "دیشب برای شام چی خوردی؟"),
            d("B", "I had rice and chicken. And some salad.", "برنج و مرغ خوردم. و مقداری سالاد."),
            d("A", "Sounds good. Did you cook?", "خوبه. خودت پختی؟"),
            d("B", "No, I ate at a restaurant. There were many people there.", "نه، در رستوران غذا خوردم. افراد زیادی اونجا بودن."),
            d("A", "Did you have any dessert?", "دسر خوردی؟"),
            d("B", "Yes, I had some ice cream. And I drank a lot of water.", "بله، مقداری بستنی خوردم. و آب زیادی نوشیدم."),
            d("A", "How much was the bill?", "صورتحساب چقدر بود؟"),
            d("B", "About 40 dollars. It wasn't cheap!", "حدود ۴۰ دلار. ارزان نبود!"),
            d("A", "That's expensive. I usually don't eat out.", "گرونه. من معمولاً بیرون غذا نمی‌خورم."),
            d("B", "Me neither. But last night was special.", "من هم. ولی دیشب خاص بود."),
            d("A", "Well, see you later.", "خب، بعداً می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What did B have for dinner?", listOf("pizza", "rice and chicken", "pasta"), 1),
            q("How much was the bill?", listOf("$20", "$40", "$60"), 1),
            q("I have ___ cheese.", listOf("some", "any", "much"), 0),
            q("Do you have ___ milk?", listOf("some", "any", "much"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Eat out", "بیرون غذا خوردن", "I usually don't eat out.", "معمولاً بیرون غذا نمی‌خورم."),
            IdiomExpression("Me neither", "من هم (منفی)", "Me neither.", "من هم.")
        ),
        pronunciation = listOf(
            PronunciationTip("Some / Any", "In fast speech, 'some' reduces to /səm/.")
        ),
        culture = listOf(
            CulturalNote("Eating out", "In many countries, eating out at restaurants is common.")
        ),
        mistakes = listOf(
            CommonMistake("How many water?", "How much water?", "Use 'much' with uncountable nouns.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 10 — The most dangerous place | خطرناک‌ترین مکان
    // ═══════════════════════════════════════════════════════════
    private fun file10() = base(
        10, "The most dangerous place", "خطرناک‌ترین مکان",
        listOf(
            "Use superlatives",
            "Use present perfect with ever",
            "Talk about experiences",
            "Use comparatives"
        ),
        listOf(
            v("dangerous", "خطرناک", "It's the most dangerous place.", "خطرناک‌ترین مکان است.", "adjective"),
            v("beautiful", "زیبا", "It's the most beautiful city.", "زیباترین شهر است.", "adjective"),
            v("high", "بلند", "It's the highest mountain.", "بلندترین کوه است.", "adjective"),
            v("deep", "عمیق", "It's the deepest ocean.", "عمیق‌ترین اقیانوس است.", "adjective"),
            v("ever", "هرگز", "Have you ever been there?", "هرگز آنجا بوده‌ای؟", "adverb"),
            v("been", "بوده", "I've been to Japan.", "من در ژاپن بوده‌ام.", "verb"),
            v("seen", "دیده", "Have you seen this movie?", "این فیلم را دیده‌ای؟", "verb"),
            v("visited", "بازدید کرده", "I've visited many countries.", "از کشورهای زیادی بازدید کرده‌ام.", "verb"),
            v("ever", "هرگز", "The best I've ever seen.", "بهترین چیزی که تا حالا دیده‌ام.", "adverb"),
            v("place", "مکان", "It's an interesting place.", "مکان جالبی است.")
        ),
        listOf(
            GrammarSection("Superlatives", "the + adjective + -est / the most + adjective. the highest, the most beautiful."),
            GrammarSection("Comparatives", "adjective + -er / more + adjective. higher, more beautiful."),
            GrammarSection("Present perfect with ever", "Have you ever been to...? I've never seen...")
        ),
        listOf(
            d("A", "What's the most dangerous place you've ever been to?", "خطرناک‌ترین جایی که تا حالا بودی کجاست؟"),
            d("B", "I've been to the Sahara Desert. It's very hot!", "در صحرای صحرا بوده‌ام. خیلی گرم است!"),
            d("A", "Wow! Have you ever been to a desert before?", "واو! قبلاً هم در صحرا بوده‌ای؟"),
            d("B", "Yes, I've been to two deserts. The Sahara is the hottest.", "بله، در دو صحرا بوده‌ام. صحرا گرم‌ترین است."),
            d("A", "What's the most beautiful place you've seen?", "زیباترین جایی که دیده‌ای کجاست؟"),
            d("B", "The Grand Canyon. It's amazing. Have you been there?", "گرند کنیون. فوق‌العاده است. آنجا بوده‌ای؟"),
            d("A", "No, I've never been. But I've seen photos.", "نه، هرگز نبوده‌ام. ولی عکس دیدم."),
            d("B", "You should go. It's one of the most beautiful places on Earth.", "باید بروی. یکی از زیباترین مکان‌های زمین است."),
            d("A", "Maybe one day. Well, see you later!", "شاید یک روز. خب، بعداً می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where has B been?", listOf("desert", "mountains", "island"), 0),
            q("What is the most beautiful place B has seen?", listOf("Sahara", "Grand Canyon", "Alps"), 1),
            q("It's the ___ mountain in the world.", listOf("high", "higher", "highest"), 2),
            q("Have you ever ___ to Japan?", listOf("be", "been", "being"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Have you ever...?", "تا حالا...؟", "Have you ever been to Japan?", "تا حالا ژاپن بوده‌ای؟"),
            IdiomExpression("One of the...", "یکی از...", "It's one of the most beautiful places.", "یکی از زیباترین مکان‌هاست.")
        ),
        pronunciation = listOf(
            PronunciationTip("Superlatives", "Stress the -est: the HIGHest, the MOST beautiful.")
        ),
        culture = listOf(
            CulturalNote("Grand Canyon", "The Grand Canyon is one of the most famous natural wonders in the world.")
        ),
        mistakes = listOf(
            CommonMistake("the most highest", "the highest", "Don't use 'most' with -est.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 11 — Culture shock | شوک فرهنگی
    // ═══════════════════════════════════════════════════════════
    private fun file11() = base(
        11, "Culture shock", "شوک فرهنگی",
        listOf(
            "Use articles a/an/the",
            "Use conditional sentences (first conditional)",
            "Talk about culture and customs",
            "Express opinions"
        ),
        listOf(
            v("culture", "فرهنگ", "Every country has its culture.", "هر کشوری فرهنگ خودش را دارد."),
            v("shock", "شوک", "It was a culture shock.", "شوک فرهنگی بود."),
            v("custom", "رسم", "It's a local custom.", "رسم محلی است."),
            v("tradition", "سنت", "It's an old tradition.", "سنت قدیمی است."),
            v("if", "اگر", "If you go, you'll love it.", "اگر بروی، عاشقش می‌شوی.", "conjunction"),
            v("will", "خواهد", "You'll enjoy it.", "لذت خواهی برد.", "verb"),
            v("food", "غذا", "The food is different here.", "غذا اینجا متفاوت است."),
            v("language", "زبان", "English is a global language.", "انگلیسی زبانی جهانی است."),
            v("polite", "مؤدب", "It's polite to say thank you.", "مؤدبانه است که ممنون بگویی.", "adjective"),
            v("rude", "بی‌ادب", "It's rude to be late.", "دیر رسیدن بی‌ادبی است.", "adjective")
        ),
        listOf(
            GrammarSection("Articles: a, an, the", "Use 'a/an' for general, 'the' for specific. a book, an apple, the book on the table."),
            GrammarSection("First conditional", "If + present simple, will + verb. If you go, you'll love it."),
            GrammarSection("Opinions", "I think... In my opinion... I agree/disagree.")
        ),
        listOf(
            d("A", "Have you ever experienced culture shock?", "تا حالا شوک فرهنگی را تجربه کرده‌ای؟"),
            d("B", "Yes, when I first moved to Japan.", "بله، وقتی اولین بار به ژاپن رفتم."),
            d("A", "What was different?", "چه چیزی متفاوت بود؟"),
            d("B", "The customs. People bow instead of shaking hands.", "رسوم. مردم به جای دست دادن تعظیم می‌کنند."),
            d("A", "That's interesting. If I go to Japan, I'll be confused too.", "جالبه. اگر من هم به ژاپن بروم، گیج می‌شوم."),
            d("B", "Don't worry. People are very polite. They'll help you.", "نگران نباش. مردم خیلی مؤدب هستند. کمکت می‌کنند."),
            d("A", "What about the food?", "غذا چطور؟"),
            d("B", "The food is amazing. But it's very different from Western food.", "غذا فوق‌العاده است. ولی خیلی با غذای غربی متفاوت است."),
            d("A", "Did you learn the language?", "زبان را یاد گرفتی؟"),
            d("B", "A little. If you live there, you'll learn quickly.", "کمی. اگر آنجا زندگی کنی، سریع یاد می‌گیری."),
            d("A", "Maybe I'll visit one day.", "شاید یک روز بیام."),
            d("B", "You should! It's a beautiful country.", "باید بیای! کشور زیبایی است.")
        ),
        listOf(
            q("Where did B experience culture shock?", listOf("Korea", "Japan", "China"), 1),
            q("What do people do in Japan instead of shaking hands?", listOf("bow", "hug", "kiss"), 0),
            q("If you ___, you'll love it.", listOf("go", "went", "going"), 0),
            q("It's ___ old tradition.", listOf("a", "an", "the"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Culture shock", "شوک فرهنگی", "It was a culture shock.", "شوک فرهنگی بود."),
            IdiomExpression("In my opinion", "به نظر من", "In my opinion, it's interesting.", "به نظر من جالبه.")
        ),
        pronunciation = listOf(
            PronunciationTip("Articles", "a /ə/, an /ən/, the /ðə/ before consonants, /ði/ before vowels.")
        ),
        culture = listOf(
            CulturalNote("Bowing in Japan", "Bowing is a traditional greeting in Japan that shows respect.")
        ),
        mistakes = listOf(
            CommonMistake("If you will go", "If you go", "Don't use 'will' in if-clause.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 12 — I've seen it ten times! | ده بار دیدمش!
    // ═══════════════════════════════════════════════════════════
    private fun file12() = base(
        12, "I've seen it ten times!", "ده بار دیدمش!",
        listOf(
            "Use present perfect",
            "Talk about experiences and achievements",
            "Use ever and never",
            "Talk about recent events"
        ),
        listOf(
            v("seen", "دیده", "I've seen that movie ten times.", "آن فیلم را ده بار دیده‌ام.", "verb"),
            v("been", "بوده", "Have you ever been to Paris?", "تا حالا پاریس بوده‌ای؟", "verb"),
            v("done", "انجام داده", "What have you done today?", "امروز چه کار کرده‌ای؟", "verb"),
            v("eaten", "خورده", "I've eaten sushi before.", "قبلاً سوشی خورده‌ام.", "verb"),
            v("visited", "بازدید کرده", "She's visited ten countries.", "او از ده کشور بازدید کرده است.", "verb"),
            v("ever", "هرگز", "Have you ever tried it?", "تا حالا امتحانش کرده‌ای؟", "adverb"),
            v("never", "هرگز", "I've never been there.", "هرگز آنجا نبوده‌ام.", "adverb"),
            v("already", "قبلاً", "I've already finished.", "قبلاً تمام کرده‌ام.", "adverb"),
            v("yet", "هنوز", "I haven't seen it yet.", "هنوز ندیده‌ام.", "adverb"),
            v("recently", "اخیراً", "I've recently started a new job.", "اخیراً شغل جدیدی شروع کرده‌ام.", "adverb")
        ),
        listOf(
            GrammarSection("Present perfect", "have/has + past participle. I've seen it. She's visited Paris."),
            GrammarSection("Ever / Never", "Have you ever...? I've never..."),
            GrammarSection("Already / Yet / Just / Recently", "I've already done it. I haven't seen it yet. I've just arrived.")
        ),
        listOf(
            d("A", "Have you ever seen the movie Titanic?", "تا حالا فیلم تایتانیک را دیده‌ای؟"),
            d("B", "Yes, I've seen it ten times! It's my favorite.", "بله، ده بار دیده‌ام! فیلم مورد علاقه‌ام است."),
            d("A", "Ten times! That's a lot.", "ده بار! زیاده."),
            d("B", "I know. Have you seen it?", "می‌دانم. تو دیدی؟"),
            d("A", "No, I haven't seen it yet. But I want to.", "نه، هنوز ندیدم. ولی می‌خوام."),
            d("B", "You should! It's amazing. Have you ever cried watching a movie?", "باید ببینی! فوق‌العاده است. تا حالا هنگام فیلم گریه کردی؟"),
            d("A", "Yes, I've cried many times!", "بله، بارها گریه کردم!"),
            d("B", "Well, this one will make you cry.", "خب، این فیلم گریه‌ات می‌ندازه."),
            d("A", "Really? I'll watch it soon.", "واقعاً؟ به‌زودی می‌بینمش."),
            d("B", "Let me know what you think!", "نظرت رو بگو!"),
            d("A", "I will. See you later.", "می‌گم. بعداً می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("How many times has B seen Titanic?", listOf("five", "ten", "twenty"), 1),
            q("Has A seen Titanic?", listOf("yes", "no", "maybe"), 1),
            q("I've ___ seen that movie.", listOf("yet", "already", "ever"), 1),
            q("Have you ___ been to Paris?", listOf("ever", "never", "already"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Have you ever...?", "تا حالا...؟", "Have you ever seen it?", "تا حالا دیدی؟"),
            IdiomExpression("Let me know", "به من بگو", "Let me know what you think.", "نظرت رو به من بگو.")
        ),
        pronunciation = listOf(
            PronunciationTip("Present perfect", "Contractions: I've /aɪv/, she's /ʃiːz/, they've /ðeɪv/.")
        ),
        culture = listOf(
            CulturalNote("Movie experiences", "Sharing movie experiences is common in many cultures.")
        ),
        mistakes = listOf(
            CommonMistake("I've saw it.", "I've seen it.", "Use past participle, not past simple.")
        )
    )
}