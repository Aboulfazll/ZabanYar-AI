package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * English File 4th Edition — Elementary (Book 1)
 * 12 Files | A1-A2
 * British English
 */
object EnglishFile4thElementary {
    const val BOOK_ID = "english_file_4th_elementary"

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
    // FILE 1 — Welcome to the class | به کلاس خوش آمدید
    // ═══════════════════════════════════════════════════════════
    private fun file1() = base(
        1, "Welcome to the class", "به کلاس خوش آمدید",
        listOf(
            "Greet people and introduce yourself",
            "Use verb be (positive): I, you, he, she, it, we, they",
            "Use subject pronouns",
            "Learn days of the week and numbers 0-20"
        ),
        listOf(
            v("welcome", "خوش آمدید", "Welcome to the class!", "به کلاس خوش آمدید!", "interjection"),
            v("name", "نام", "What's your name?", "نامت چیست؟"),
            v("teacher", "معلم", "She's our teacher.", "او معلم ماست."),
            v("student", "دانش‌آموز", "I'm a student.", "من دانش‌آموز هستم."),
            v("class", "کلاس", "We're in the same class.", "ما در یک کلاس هستیم."),
            v("Monday", "دوشنبه", "The class is on Monday.", "کلاس روز دوشنبه است."),
            v("Wednesday", "چهارشنبه", "See you on Wednesday.", "چهارشنبه می‌بینمت."),
            v("Friday", "جمعه", "Friday is my favorite day.", "جمعه روز مورد علاقه‌ام است."),
            v("number", "شماره", "What's your phone number?", "شماره تلفنت چیست؟"),
            v("friend", "دوست", "He's my friend.", "او دوست من است.")
        ),
        listOf(
            GrammarSection("Verb be (positive)", "I am, you are, he/she/it is, we/you/they are. Contractions: I'm, you're, he's, she's, it's, we're, they're."),
            GrammarSection("Subject pronouns", "I, you, he, she, it, we, they. We use them instead of names."),
            GrammarSection("Days of the week", "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday."),
            GrammarSection("Numbers 0-20", "zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty.")
        ),
        listOf(
            d("Teacher", "Hello, everybody. Welcome to the class. I'm Carla. I'm your teacher.", "سلام به همه. به کلاس خوش آمدید. من کارلا هستم. معلم شما هستم."),
            d("A", "Hi, I'm David. Nice to meet you.", "سلام، من دیوید هستم. از آشنایی خوشحالم."),
            d("B", "Hello, David. I'm Maria. Nice to meet you too.", "سلام دیوید. من ماریا هستم. من هم خوشحالم."),
            d("A", "Are you from Spain?", "اهل اسپانیا هستی؟"),
            d("B", "Yes, I am. And you?", "بله. تو چطور؟"),
            d("A", "I'm from Italy. I'm here to learn English.", "من اهل ایتالیام. برای یادگیری انگلیسی اینجا هستم."),
            d("B", "Me too! What day is the class?", "من هم! کلاس چه روزی است؟"),
            d("A", "It's on Monday and Wednesday.", "دوشنبه و چهارشنبه."),
            d("B", "Great. What's your phone number?", "عالی. شماره تلفنت چیه؟"),
            d("A", "It's 07700 900123.", "۰۷۷۰۰ ۹۰۰۱۲۳."),
            d("B", "Thanks. See you on Monday!", "ممنون. دوشنبه می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!")
        ),
        listOf(
            q("Where is Maria from?", listOf("Italy", "Spain", "France"), 1),
            q("When is the class?", listOf("Monday and Friday", "Monday and Wednesday", "Tuesday and Thursday"), 1),
            q("She ___ a teacher.", listOf("am", "is", "are"), 1),
            q("We ___ students.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you!", "از آشنایی خوشحالم!"),
            IdiomExpression("See you", "می‌بینمت", "See you on Monday!", "دوشنبه می‌بینمت!")
        ),
        pronunciation = listOf(
            PronunciationTip("Contractions", "Practice: I'm /aɪm/, you're /jʊr/, he's /hiːz/, she's /ʃiːz/.")
        ),
        culture = listOf(
            CulturalNote("First names", "In English-speaking countries, people often use first names immediately, even in class.")
        ),
        mistakes = listOf(
            CommonMistake("I is David.", "I am David.", "Use 'am' with 'I'.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 2 — One world | یک جهان
    // ═══════════════════════════════════════════════════════════
    private fun file2() = base(
        2, "One world", "یک جهان",
        listOf(
            "Talk about countries and nationalities",
            "Use verb be (negative and questions)",
            "Use possessive adjectives",
            "Talk about the Olympics"
        ),
        listOf(
            v("country", "کشور", "Which country are you from?", "اهل کدام کشوری؟"),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیست؟"),
            v("British", "بریتانیایی", "She's British.", "او بریتانیایی است.", "adjective"),
            v("American", "آمریکایی", "He's American.", "او آمریکایی است.", "adjective"),
            v("Chinese", "چینی", "They're Chinese.", "آن‌ها چینی هستند.", "adjective"),
            v("Brazilian", "برزیلی", "I'm Brazilian.", "من برزیلی هستم.", "adjective"),
            v("Olympics", "المپیک", "The Olympics are every four years.", "المپیک هر چهار سال یکبار است."),
            v("world", "جهان", "It's a small world.", "جهان کوچکی است."),
            v("language", "زبان", "How many languages do you speak?", "چند زبان صحبت می‌کنی؟"),
            v("flag", "پرچم", "The flag is red and white.", "پرچم قرمز و سفید است.")
        ),
        listOf(
            GrammarSection("Verb be (negative)", "I'm not, you aren't, he/she/it isn't, we/you/they aren't."),
            GrammarSection("Verb be (questions)", "Am I? Are you? Is he/she/it? Are we/you/they? Short answers: Yes, I am. / No, I'm not."),
            GrammarSection("Possessive adjectives", "my, your, his, her, its, our, their. My name is... Their flags are...")
        ),
        listOf(
            d("A", "Are you from Brazil?", "اهل برزیلی؟"),
            d("B", "No, I'm not. I'm from Argentina. And you?", "نه. اهل آرژانتینم. تو چطور؟"),
            d("A", "I'm from Canada. I'm Canadian.", "من اهل کانادام. کانادایی هستم."),
            d("B", "Is your first language English?", "زبان مادریت انگلیسیه؟"),
            d("A", "Yes, it is. And French too. Canada has two languages.", "بله. و فرانسوی هم. کانادا دو زبان دارد."),
            d("B", "That's interesting. My first language is Spanish.", "جالبه. زبان مادری من اسپانیاییه."),
            d("A", "Do you speak English well?", "خوب انگلیسی صحبت می‌کنی؟"),
            d("B", "I speak a little. But I'm not fluent.", "کمی صحبت می‌کنم. ولی روان نیستم."),
            d("A", "Where are your parents from?", "والدینت اهل کجا هستند؟"),
            d("B", "They're from Brazil. But I was born in Argentina.", "آن‌ها اهل برزیل هستند. ولی من در آرژانتین متولد شدم."),
            d("A", "That's a multicultural family!", "خانواده چندفرهنگی‌ایه!"),
            d("B", "Yes, it is. I love it.", "بله. عاشقش هستم.")
        ),
        listOf(
            q("Where is B from?", listOf("Brazil", "Argentina", "Canada"), 1),
            q("How many languages does A speak?", listOf("one", "two", "three"), 1),
            q("___ you from Spain?", listOf("Am", "Is", "Are"), 2),
            q("This is my sister. ___ name is Sara.", listOf("His", "Her", "Their"), 1)
        ),
        idioms = listOf(
            IdiomExpression("A little", "کمی", "I speak a little English.", "کمی انگلیسی صحبت می‌کنم."),
            IdiomExpression("It's a small world", "جهان کوچک است", "It's a small world!", "جهان کوچکی است!")
        ),
        pronunciation = listOf(
            PronunciationTip("Nationality endings", "Stress shifts: BRAzil → braZILian, CHIna → chiNESE.")
        ),
        culture = listOf(
            CulturalNote("The Olympics", "The Olympic Games bring together athletes from over 200 countries.")
        ),
        mistakes = listOf(
            CommonMistake("I no am from Brazil.", "I'm not from Brazil.", "Use 'not' after 'be'.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 3 — What's your email? | ایمیلت چیه؟
    // ═══════════════════════════════════════════════════════════
    private fun file3() = base(
        3, "What's your email?", "ایمیلت چیه؟",
        listOf(
            "Give personal information",
            "Use possessive 's and whose",
            "Spell names and email addresses",
            "Use classroom language"
        ),
        listOf(
            v("email", "ایمیل", "What's your email?", "ایمیلت چیه؟"),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟"),
            v("phone", "تلفن", "My phone number is...", "شماره تلفنم..."),
            v("spell", "هجی کردن", "How do you spell your name?", "نامت را چطور هجی می‌کنی؟", "verb"),
            v("name", "نام", "His name is Tom.", "نامش تام است."),
            v("surname", "نام خانوادگی", "My surname is Smith.", "نام خانوادگی‌ام اسمیت است."),
            v("married", "متأهل", "Are you married?", "متأهلی؟", "adjective"),
            v("single", "مجرد", "I'm single.", "مجرد هستم.", "adjective"),
            v("age", "سن", "What's your age?", "سنت چقدره؟"),
            v("birthday", "تولد", "My birthday is in May.", "تولدم در ماه مه است.")
        ),
        listOf(
            GrammarSection("Possessive 's", "Tom's email, Maria's phone, the teacher's name."),
            GrammarSection("Whose...?", "Whose bag is this? It's Tom's bag."),
            GrammarSection("Question words", "What, Where, When, Who, How, Whose.")
        ),
        listOf(
            d("A", "What's your surname?", "نام خانوادگیت چیه؟"),
            d("B", "It's Kowalski. K-O-W-A-L-S-K-I.", "کوالسکی. ک-و-ا-ل-س-ک-ی."),
            d("A", "Thanks. And what's your email?", "ممنون. ایمیلت چیه؟"),
            d("B", "It's maria.kowalski@gmail.com.", "ماریا.کوالسکی@gmail.com."),
            d("A", "Sorry, can you repeat that?", "ببخشید، می‌تونی تکرار کنی؟"),
            d("B", "Yes, of course. M-A-R-I-A dot K-O-W-A-L-S-K-I at gmail dot com.", "بله، البته. م-ا-ر-ی-ا نقطه ک-و-ا-ل-س-ک-ی ات gmail نقطه com."),
            d("A", "Got it. And your phone number?", "فهمیدم. و شماره تلفنت؟"),
            d("B", "It's 07700 900456.", "۰۷۷۰۰ ۹۰۰۴۵۶."),
            d("A", "Are you married?", "متأهلی؟"),
            d("B", "No, I'm single. And you?", "نه، مجردم. تو چطور؟"),
            d("A", "I'm married. My wife's name is Anna.", "من متأهلم. اسم همسرم آناست."),
            d("B", "That's nice. What does she do?", "خوبه. چه کار می‌کنه؟"),
            d("A", "She's a doctor.", "او دکتره.")
        ),
        listOf(
            q("What is B's surname?", listOf("Kowalski", "Kowalska", "Kowal"), 0),
            q("Is B married?", listOf("yes", "no", "not mentioned"), 1),
            q("Whose bag is this? It's ___ bag. (Tom)", listOf("Toms", "Tom's", "Toms'"), 1),
            q("___ is your email?", listOf("What", "Who", "Whose"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Can you repeat that?", "می‌تونی تکرار کنی؟", "Can you repeat that, please?", "می‌تونی لطفاً تکرار کنی؟"),
            IdiomExpression("Got it", "فهمیدم", "Got it, thanks.", "فهمیدم، ممنون.")
        ),
        pronunciation = listOf(
            PronunciationTip("Spelling aloud", "Letters: A /eɪ/, E /iː/, I /aɪ/, O /oʊ/, U /juː/.")
        ),
        culture = listOf(
            CulturalNote("Email addresses", "In English, '@' is 'at' and '.' is 'dot'.")
        ),
        mistakes = listOf(
            CommonMistake("How you spell?", "How do you spell?", "Use 'do' in questions.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 4 — Are you tidy or untidy? | مرتبی یا نامرتب؟
    // ═══════════════════════════════════════════════════════════
    private fun file4() = base(
        4, "Are you tidy or untidy?", "مرتبی یا نامرتب؟",
        listOf(
            "Use singular and plural nouns",
            "Use a/an and this/that/these/those",
            "Talk about everyday objects",
            "Use prepositions of place: in, on, under"
        ),
        listOf(
            v("tidy", "مرتب", "My desk is always tidy.", "میز من همیشه مرتب است.", "adjective"),
            v("untidy", "نامرتب", "His room is untidy.", "اتاقش نامرتب است.", "adjective"),
            v("desk", "میز", "There are books on the desk.", "کتاب‌هایی روی میز هست."),
            v("charger", "شارژر", "I need my phone charger.", "شارژر موبایلم را لازم دارم."),
            v("umbrella", "چتر", "Take an umbrella. It's raining.", "چتر بردار. باران می‌آید."),
            v("glasses", "عینک", "Where are my glasses?", "عینکم کجاست؟"),
            v("keys", "کلیدها", "I can't find my keys.", "کلیدهایم را پیدا نمی‌کنم."),
            v("diary", "دفتر خاطرات", "She writes in her diary every night.", "او هر شب در دفتر خاطراتش می‌نویسد."),
            v("tissue", "دستمال کاغذی", "There's a box of tissues on the table.", "یک جعبه دستمال کاغذی روی میز است."),
            v("laptop", "لپ‌تاپ", "My laptop is in my bag.", "لپ‌تاپم در کیفه.")
        ),
        listOf(
            GrammarSection("Singular and plural nouns", "book → books, box → boxes, watch → watches, diary → diaries."),
            GrammarSection("a / an", "Use 'a' before consonant sounds: a book. Use 'an' before vowel sounds: an umbrella."),
            GrammarSection("this / that / these / those", "this (near, singular), that (far, singular), these (near, plural), those (far, plural)."),
            GrammarSection("Prepositions of place: in, on, under", "The book is in the bag. The phone is on the desk. The cat is under the chair.")
        ),
        listOf(
            d("A", "Are you tidy or untidy?", "مرتبی یا نامرتب؟"),
            d("B", "I'm very untidy! My desk is a mess.", "خیلی نامرتبم! میزم به هم ریخته است."),
            d("A", "Really? What's on your desk?", "واقعاً؟ چی روی میزته؟"),
            d("B", "There are books, papers, and an old coffee cup.", "کتاب‌ها، کاغذها و یک فنجان قهوه قدیمی."),
            d("A", "And where are your keys?", "و کلیدهایت کجا هستند؟"),
            d("B", "I don't know! They're not in my bag.", "نمی‌دانم! در کیسم نیستند."),
            d("A", "Are they under the papers?", "زیر کاغذها هستند؟"),
            d("B", "Maybe! Oh, yes, here they are. Thanks!", "شاید! اوه، بله، اینجا هستند. ممنون!"),
            d("A", "You need to be more tidy.", "باید مرتب‌تر باشی."),
            d("B", "I know. My mother always says that.", "می‌دانم. مادرم همیشه همین را می‌گوید."),
            d("A", "Is your room tidy?", "اتاقت مرتب است؟"),
            d("B", "No! There are clothes on the floor and an old laptop on the bed.", "نه! لباس‌ها روی زمین و یک لپ‌تاپ قدیمی روی تخت هست."),
            d("A", "That's very untidy!", "خیلی نامرتب است!")
        ),
        listOf(
            q("Where are B's keys?", listOf("in the bag", "under the papers", "on the desk"), 1),
            q("What is on B's bed?", listOf("clothes", "a laptop", "books"), 1),
            q("There is ___ umbrella on the table.", listOf("a", "an", "the"), 1),
            q("___ books are mine.", listOf("This", "These", "That"), 1)
        ),
        idioms = listOf(
            IdiomExpression("A mess", "به هم ریخته", "My desk is a mess.", "میزم به هم ریخته است."),
            IdiomExpression("Here they are", "ایناهاشون", "Here they are!", "ایناهاشون!")
        ),
        pronunciation = listOf(
            PronunciationTip("Plural -s", "Three sounds: /s/ (books), /z/ (keys), /ɪz/ (watches).")
        ),
        culture = listOf(
            CulturalNote("Tidiness", "Attitudes towards tidiness vary across cultures and individuals.")
        ),
        mistakes = listOf(
            CommonMistake("a umbrella", "an umbrella", "Use 'an' before vowel sounds.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 5 — Made in America | ساخت آمریکا
    // ═══════════════════════════════════════════════════════════
    private fun file5() = base(
        5, "Made in America", "ساخت آمریکا",
        listOf(
            "Use adjectives",
            "Use colours",
            "Use modifiers: very, really, quite",
            "Talk about products and where they are made"
        ),
        listOf(
            v("colour", "رنگ", "What colour is it?", "چه رنگی است؟"),
            v("red", "قرمز", "The flag is red and white.", "پرچم قرمز و سفید است.", "adjective"),
            v("blue", "آبی", "I have a blue jacket.", "یک کاپشن آبی دارم.", "adjective"),
            v("green", "سبز", "The trees are green.", "درختان سبز هستند.", "adjective"),
            v("black", "مشکی", "She has a black bag.", "او یک کیف مشکی دارد.", "adjective"),
            v("big", "بزرگ", "Canada is a big country.", "کانادا کشور بزرگی است.", "adjective"),
            v("small", "کوچک", "It's a small world.", "جهان کوچکی است.", "adjective"),
            v("beautiful", "زیبا", "Venice is a beautiful city.", "ونیز شهر زیبایی است.", "adjective"),
            v("long", "بلند", "It's a long day.", "روز طولانی‌ای است.", "adjective"),
            v("made in", "ساخته شده در", "Made in America.", "ساخت آمریکا.", "phrase")
        ),
        listOf(
            GrammarSection("Adjectives", "Adjectives come before nouns: a big country. Or after 'be': Canada is big."),
            GrammarSection("Colours", "red, blue, green, black, white, yellow, orange, brown, grey, pink."),
            GrammarSection("Modifiers: very, really, quite", "It's very big. It's really beautiful. It's quite small.")
        ),
        listOf(
            d("A", "What colour is the American flag?", "پرچم آمریکا چه رنگی است؟"),
            d("B", "It's red, white, and blue. It has fifty stars.", "قرمز، سفید و آبی است. پنجاه ستاره دارد."),
            d("A", "Are there many American products in your country?", "محصولات آمریکایی زیادی در کشورت هست؟"),
            d("B", "Yes, a lot. iPhones, Coca-Cola, McDonald's...", "بله، زیاد. آیفون، کوکاکولا، مک‌دونالد..." ),
            d("A", "What's your favourite American brand?", "برند آمریکایی مورد علاقه‌ات چیست؟"),
            d("B", "I really like Apple. Their products are beautiful.", "واقعاً اپل را دوست دارم. محصولاتشان زیباست."),
            d("A", "Me too. But they're quite expensive.", "من هم. ولی کاملاً گران هستند."),
            d("B", "Yes, very expensive! But good quality.", "بله، خیلی گران! ولی کیفیت خوب."),
            d("A", "What about clothes?", "لباس چطور؟"),
            d("B", "Levi's is a famous American brand. Their jeans are popular.", "لیوایز برند معروف آمریکایی است. شلوارهای جینشان محبوبند."),
            d("A", "Are they made in America?", "در آمریکا ساخته می‌شوند؟"),
            d("B", "Not always. Many are made in other countries now.", "نه همیشه. بسیاری الان در کشورهای دیگر ساخته می‌شوند."),
            d("A", "That's interesting. The world is very connected.", "جالبه. جهان خیلی به هم متصل است.")
        ),
        listOf(
            q("What colours are the American flag?", listOf("red, white, blue", "red, yellow, green", "blue, white, black"), 0),
            q("Which American brand does B like?", listOf("Nike", "Apple", "Levi's"), 1),
            q("Canada is a ___ country.", listOf("big", "bigger", "biggest"), 0),
            q("It's ___ beautiful city.", listOf("very", "much", "many"), 0)
        ),
        idioms = listOf(
            IdiomExpression("A lot", "زیاد", "Yes, a lot.", "بله، زیاد."),
            IdiomExpression("Me too", "من هم", "Me too!", "من هم!")
        ),
        pronunciation = listOf(
            PronunciationTip("Adjective stress", "Stress the adjective: a BIG country, a BEAUtiful city.")
        ),
        culture = listOf(
            CulturalNote("Global brands", "Many famous brands are American, but their products are made worldwide.")
        ),
        mistakes = listOf(
            CommonMistake("a country big", "a big country", "Adjective comes before noun.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 6 — Slow down! | آهسته‌تر!
    // ═══════════════════════════════════════════════════════════
    private fun file6() = base(
        6, "Slow down!", "آهسته‌تر!",
        listOf(
            "Use imperative sentences",
            "Use let's for suggestions",
            "Talk about feelings",
            "Give advice and instructions"
        ),
        listOf(
            v("slow down", "آهسته‌تر", "Slow down! You're driving too fast.", "آهسته‌تر! خیلی تند رانندگی می‌کنی.", "verb"),
            v("hungry", "گرسنه", "I'm hungry. Let's eat.", "گرسنه‌ام. بیا غذا بخوریم.", "adjective"),
            v("thirsty", "تشنه", "She's thirsty.", "او تشنه است.", "adjective"),
            v("hot", "گرم", "It's hot today.", "امروز گرم است.", "adjective"),
            v("cold", "سرد", "I'm cold. Close the window.", "سردم است. پنجره را ببند.", "adjective"),
            v("tired", "خسته", "We're tired. Let's rest.", "خسته‌ایم. بیا استراحت کنیم.", "adjective"),
            v("happy", "خوشحال", "I'm happy today.", "امروز خوشحالم.", "adjective"),
            v("sad", "غمگین", "Why are you sad?", "چرا غمگینی؟", "adjective"),
            v("worried", "نگران", "Don't be worried.", "نگران نباش.", "adjective"),
            v("excited", "هیجان‌زده", "She's excited about the trip.", "او درباره سفر هیجان‌زده است.", "adjective")
        ),
        listOf(
            GrammarSection("Imperatives", "Open the door. Don't close the window. Turn off the TV. Let's go."),
            GrammarSection("Let's...", "Let's eat. Let's go home. Let's ask the teacher."),
            GrammarSection("Feelings with be", "I'm hungry. She's tired. They're excited. Use 'be' + adjective.")
        ),
        listOf(
            d("A", "Lisa, slow down! You're driving too fast.", "لیزا، آهسته‌تر! خیلی تند رانندگی می‌کنی."),
            d("B", "Sorry! I'm tired. I want to get home.", "ببخشید! خسته‌ام. می‌خواهم به خانه برسم."),
            d("A", "Are you hungry?", "گرسنه‌ای؟"),
            d("B", "Yes, I'm very hungry. And thirsty too.", "بله، خیلی گرسنه‌ام. و تشنه هم هستم."),
            d("A", "Let's stop at the next cafe.", "بیا در کافه بعدی توقف کنیم."),
            d("B", "Good idea. I need a coffee.", "فکر خوبی است. به یک قهوه نیاز دارم."),
            d("A", "Don't drive so fast. The baby is sleeping.", "اینقدر تند رانندگی نکن. بچه خواب است."),
            d("B", "OK, OK. You're right. I'm sorry.", "باشه، باشه. حق با توست. متأسفم."),
            d("A", "Are you cold? I can close the window.", "سردت است؟ می‌توانم پنجره را ببندم."),
            d("B", "No, I'm hot. Open the window, please.", "نه، گرمم است. لطفاً پنجره را باز کن."),
            d("A", "OK. Let's stop here. There's a cafe.", "باشه. بیا اینجا توقف کنیم. یک کافه هست."),
            d("B", "Perfect. I'm excited about the coffee!", "عالی. درباره قهوه هیجان‌زده‌ام!")
        ),
        listOf(
            q("Why is B driving fast?", listOf("happy", "tired", "excited"), 1),
            q("What does A suggest?", listOf("stop at a cafe", "go home", "drive faster"), 0),
            q("___ the window. It's hot.", listOf("Open", "Close", "Don't open"), 0),
            q("I'm ___. Let's eat.", listOf("thirsty", "hungry", "tired"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Good idea", "فکر خوبی", "Good idea!", "فکر خوبی!"),
            IdiomExpression("You're right", "حق با توست", "You're right.", "حق با توست.")
        ),
        pronunciation = listOf(
            PronunciationTip("Imperative intonation", "Imperatives usually have falling intonation: OPEN the door. SLOW down.")
        ),
        culture = listOf(
            CulturalNote("Safe driving", "In many countries, driving slowly in residential areas is required by law.")
        ),
        mistakes = listOf(
            CommonMistake("Don't to open", "Don't open", "Use base verb after 'don't'.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 7 — Britain: the good and the bad | بریتانیا: خوب و بد
    // ═══════════════════════════════════════════════════════════
    private fun file7() = base(
        7, "Britain: the good and the bad", "بریتانیا: خوب و بد",
        listOf(
            "Use present simple: positive and negative",
            "Talk about likes and dislikes",
            "Use verb phrases",
            "Talk about life in Britain"
        ),
        listOf(
            v("weather", "هوا", "The weather is often bad in Britain.", "هوا در بریتانیا اغلب بد است."),
            v("food", "غذا", "British food is not very famous.", "غذای بریتانیایی خیلی معروف نیست."),
            v("people", "مردم", "The people are very friendly.", "مردم خیلی خوش‌برخورد هستند."),
            v("city", "شهر", "London is a great city.", "لندن شهر بزرگی است."),
            v("countryside", "حومه", "The countryside is beautiful.", "حومه زیباست."),
            v("tea", "چای", "British people love tea.", "مردم بریتانیا عاشق چای هستند."),
            v("pub", "میخانه", "Pubs are important in Britain.", "میخانه‌ها در بریتانیا مهم هستند."),
            v("traffic", "ترافیک", "The traffic is terrible in London.", "ترافیک در لندن وحشتناک است."),
            v("expensive", "گران", "London is very expensive.", "لندن خیلی گران است.", "adjective"),
            v("beautiful", "زیبا", "The countryside is beautiful.", "حومه زیباست.", "adjective")
        ),
        listOf(
            GrammarSection("Present simple (positive)", "I like, you like, he/she/it likes, we/you/they like."),
            GrammarSection("Present simple (negative)", "I don't like, he/she/it doesn't like."),
            GrammarSection("Verb phrases", "live in, work in, go to, like, love, hate."),
            GrammarSection("Likes and dislikes", "I love... I like... I don't mind... I don't like... I hate...")
        ),
        listOf(
            d("A", "What do you think of Britain?", "نظرت درباره بریتانیا چیست؟"),
            d("B", "The good thing is the people. They're very friendly.", "نکته خوبش مردم هستند. خیلی خوش‌برخوردند."),
            d("A", "And the bad thing?", "و نکته بدش؟"),
            d("B", "The weather! It rains all the time.", "هوا! همیشه باران می‌آید."),
            d("A", "I know. But the countryside is beautiful.", "می‌دانم. ولی حومه زیباست."),
            d("B", "Yes, I love the countryside. And I love British tea too.", "بله، عاشق حومه‌ام. و چای بریتانیایی را هم دوست دارم."),
            d("A", "Do you like British food?", "غذای بریتانیایی دوست داری؟"),
            d("B", "Not really. I don't like fish and chips.", "نه زیاد. ماهی و سیب‌زمینی سرخ‌کرده دوست ندارم."),
            d("A", "What about London?", "لندن چطور؟"),
            d("B", "London is exciting but very expensive.", "لندن هیجان‌انگیز است ولی خیلی گران."),
            d("A", "Do you live in London?", "در لندن زندگی می‌کنی؟"),
            d("B", "No, I live in Manchester. It's smaller and cheaper.", "نه، در منچستر زندگی می‌کنم. کوچک‌تر و ارزان‌تر است."),
            d("A", "Do you like it there?", "آنجا را دوست داری؟"),
            d("B", "Yes, I love it. The people are great and the city is fun.", "بله، عاشقش هستم. مردم عالی و شهر سرگرم‌کننده است.")
        ),
        listOf(
            q("What does B like about Britain?", listOf("the food", "the people", "the weather"), 1),
            q("Where does B live?", listOf("London", "Manchester", "Liverpool"), 1),
            q("I ___ fish and chips.", listOf("not like", "don't like", "doesn't like"), 1),
            q("She ___ British tea.", listOf("love", "loves", "loving"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Fish and chips", "ماهی و سیب‌زمینی", "I don't like fish and chips.", "ماهی و سیب‌زمینی دوست ندارم."),
            IdiomExpression("All the time", "همیشه", "It rains all the time.", "همیشه باران می‌آید.")
        ),
        pronunciation = listOf(
            PronunciationTip("Third-person -s", "Listen: like → likes /laɪks/, love → loves /lʌvz/.")
        ),
        culture = listOf(
            CulturalNote("Pubs", "Pubs are an important part of British social life.")
        ),
        mistakes = listOf(
            CommonMistake("I no like tea.", "I don't like tea.", "Use don't/doesn't for negatives.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 8 — Love me, love my dog | منو دوست داشته باش، سگمو هم دوست داشته باش
    // ═══════════════════════════════════════════════════════════
    private fun file8() = base(
        8, "Love me, love my dog", "منو دوست داشته باش، سگمو هم دوست داشته باش",
        listOf(
            "Use present simple questions",
            "Use question words",
            "Ask about habits and routines",
            "Talk about pets and animals"
        ),
        listOf(
            v("dog", "سگ", "I have a dog. His name is Barry.", "یک سگ دارم. اسمش بری است."),
            v("cat", "گربه", "She has two cats.", "او دو گربه دارد."),
            v("pet", "حیوان خانگی", "Do you have any pets?", "حیوان خانگی داری؟"),
            v("walk", "پیاده‌روی", "I walk my dog every morning.", "هر صبح سگم را پیاده‌روی می‌برم.", "verb"),
            v("feed", "غذا دادن", "Who feeds the cat?", "چه کسی به گربه غذا می‌دهد؟", "verb"),
            v("play", "بازی کردن", "The dog plays in the park.", "سگ در پارک بازی می‌کند.", "verb"),
            v("sleep", "خوابیدن", "My cat sleeps all day.", "گربه‌ام تمام روز می‌خوابد.", "verb"),
            v("favourite", "مورد علاقه", "What's your favourite animal?", "حیوان مورد علاقه‌ات چیست؟", "adjective"),
            v("animal", "حیوان", "I love animals.", "عاشق حیواناتم."),
            v("park", "پارک", "They go to the park every day.", "آن‌ها هر روز به پارک می‌روند.")
        ),
        listOf(
            GrammarSection("Present simple questions", "Do you...? Does he/she/it...? Short answers: Yes, I do. / No, I don't."),
            GrammarSection("Question words", "What, Where, When, Who, Why, How, Which."),
            GrammarSection("Questions with 'like'", "Do you like dogs? Does she like cats? What do you like?")
        ),
        listOf(
            d("A", "Do you have any pets?", "حیوان خانگی داری؟"),
            d("B", "Yes, I have a dog. His name is Barry.", "بله، یک سگ دارم. اسمش بری است."),
            d("A", "A dog! What's he like?", "سگ! چه جوریه؟"),
            d("B", "He's very friendly. He loves people.", "خیلی خوش‌برخورد است. عاشق مردم است."),
            d("A", "Do you walk him every day?", "هر روز پیاده‌روی می‌بری‌اش؟"),
            d("B", "Yes, twice a day. In the morning and in the evening.", "بله، دو بار در روز. صبح و عصر."),
            d("A", "Where do you go?", "کجا می‌روید؟"),
            d("B", "We go to the park near my house.", "به پارک نزدیک خانه‌ام می‌رویم."),
            d("A", "Does he like other dogs?", "سگ‌های دیگر را دوست دارد؟"),
            d("B", "Most of them. But he doesn't like big dogs.", "بیشترشان را. ولی سگ‌های بزرگ را دوست ندارد."),
            d("A", "What does he eat?", "چی می‌خورد؟"),
            d("B", "He eats dog food, but his favourite food is chicken.", "غذای سگ می‌خورد، ولی غذای مورد علاقه‌اش مرغ است."),
            d("A", "Do you have a cat too?", "گربه هم داری؟"),
            d("B", "No, just Barry. He doesn't like cats!", "نه، فقط بری. او گربه‌ها را دوست ندارد!")
        ),
        listOf(
            q("What pet does B have?", listOf("cat", "dog", "bird"), 1),
            q("How often does B walk the dog?", listOf("once a day", "twice a day", "three times a day"), 1),
            q("___ you like dogs?", listOf("Do", "Does", "Are"), 0),
            q("___ she have a cat?", listOf("Do", "Does", "Is"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Twice a day", "دو بار در روز", "I walk him twice a day.", "دو بار در روز پیاده‌روی می‌برمش."),
            IdiomExpression("Most of them", "بیشترشان", "Most of them.", "بیشترشان.")
        ),
        pronunciation = listOf(
            PronunciationTip("Do / Does questions", "Weak forms: Do you /də jə/, Does he /dəz i/.")
        ),
        culture = listOf(
            CulturalNote("Pets", "In the UK, about 50% of households have a pet. Dogs and cats are the most popular.")
        ),
        mistakes = listOf(
            CommonMistake("Does she likes cats?", "Does she like cats?", "After 'does', use base verb.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 9 — From morning to night | از صبح تا شب
    // ═══════════════════════════════════════════════════════════
    private fun file9() = base(
        9, "From morning to night", "از صبح تا شب",
        listOf(
            "Talk about daily routines",
            "Use present simple with time expressions",
            "Use adverbs of frequency",
            "Tell the time"
        ),
        listOf(
            v("wake up", "بیدار شدن", "I wake up at 7 AM.", "ساعت ۷ صبح بیدار می‌شوم.", "verb"),
            v("get up", "از خواب بلند شدن", "She gets up early.", "او زود بلند می‌شود.", "verb"),
            v("have a shower", "دوش گرفتن", "He has a shower every morning.", "او هر صبح دوش می‌گیرد.", "verb"),
            v("get dressed", "لباس پوشیدن", "I get dressed after breakfast.", "بعد از صبحانه لباس می‌پوشم.", "verb"),
            v("have breakfast", "صبحانه خوردن", "We have breakfast at 8.", "ساعت ۸ صبحانه می‌خوریم.", "verb"),
            v("go to work", "به سر کار رفتن", "She goes to work at 9.", "ساعت ۹ به سر کار می‌رود.", "verb"),
            v("come home", "به خانه آمدن", "I come home at 6 PM.", "ساعت ۶ عصر به خانه می‌آیم.", "verb"),
            v("go to bed", "به رختخواب رفتن", "They go to bed at 11.", "ساعت ۱۱ به رختخواب می‌روند.", "verb"),
            v("early", "زود", "I wake up early.", "زود بیدار می‌شوم.", "adverb"),
            v("late", "دیر", "He goes to bed late.", "او دیر به رختخواب می‌رود.", "adverb")
        ),
        listOf(
            GrammarSection("Present simple with time expressions", "I get up at 7. She has lunch at 12.30. We go to bed at 11."),
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, hardly ever, never — before the main verb."),
            GrammarSection("Telling the time", "at 7 o'clock, at half past 8, at quarter to 9, at 10.30.")
        ),
        listOf(
            d("A", "What time do you get up?", "چه ساعتی بیدار می‌شوی؟"),
            d("B", "I usually get up at 7 o'clock.", "معمولاً ساعت ۷ بیدار می‌شوم."),
            d("A", "Do you have breakfast?", "صبحانه می‌خوری؟"),
            d("B", "Yes, I always have breakfast. I have coffee and toast.", "بله، همیشه صبحانه می‌خورم. قهوه و نان تست."),
            d("A", "What time do you go to work?", "چه ساعتی به سر کار می‌روی؟"),
            d("B", "I leave home at 8.30. I start work at 9.", "ساعت ۸:۳۰ از خانه می‌روم. ساعت ۹ کارم را شروع می‌کنم."),
            d("A", "And what time do you finish?", "و چه ساعتی تمام می‌کنی؟"),
            d("B", "At 5.30. Then I go to the gym.", "ساعت ۵:۳۰. بعد به باشگاه می‌روم."),
            d("A", "Wow, you're very active. What time do you have dinner?", "واو، خیلی فعالی. چه ساعتی شام می‌خوری؟"),
            d("B", "At about 8. Then I relax and watch TV.", "حدود ساعت ۸. بعد استراحت می‌کنم و تلویزیون تماشا می‌کنم."),
            d("A", "What time do you go to bed?", "چه ساعتی به رختخواب می‌روی؟"),
            d("B", "I usually go to bed at 11. Sometimes later.", "معمولاً ساعت ۱۱. گاهی دیرتر."),
            d("A", "That's a long day!", "روز طولانی‌ایه!"),
            d("B", "Yes, but I love my routine.", "بله، ولی عاشق روال روزانه‌ام هستم.")
        ),
        listOf(
            q("What time does B get up?", listOf("6:00", "7:00", "8:00"), 1),
            q("What does B do after work?", listOf("go home", "go to the gym", "go to the park"), 1),
            q("I ___ get up early.", listOf("usual", "usually", "usualy"), 1),
            q("She has lunch ___ 12.30.", listOf("in", "on", "at"), 2)
        ),
        idioms = listOf(
            IdiomExpression("At o'clock", "ساعت", "At 7 o'clock.", "ساعت ۷."),
            IdiomExpression("Half past", "نیم ساعت بعد", "At half past 8.", "ساعت ۸:۳۰.")
        ),
        pronunciation = listOf(
            PronunciationTip("Telling the time", "Say: 7.15 = quarter past seven, 7.45 = quarter to eight.")
        ),
        culture = listOf(
            CulturalNote("Routines", "Daily routines vary widely across cultures and professions.")
        ),
        mistakes = listOf(
            CommonMistake("I get up at 7 o'clock in the morning AM.", "I get up at 7 o'clock in the morning.", "Don't use 'AM' with 'in the morning'.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 10 — Blue Zones | مناطق آبی
    // ═══════════════════════════════════════════════════════════
    private fun file10() = base(
        10, "Blue Zones", "مناطق آبی",
        listOf(
            "Use present simple (review)",
            "Talk about healthy lifestyles",
            "Use frequency expressions",
            "Talk about longevity"
        ),
        listOf(
            v("healthy", "سالم", "She has a healthy lifestyle.", "او سبک زندگی سالمی دارد.", "adjective"),
            v("unhealthy", "ناسالم", "Fast food is unhealthy.", "غذای فست‌فود ناسالم است.", "adjective"),
            v("exercise", "ورزش", "I exercise every day.", "هر روز ورزش می‌کنم."),
            v("diet", "رژیم غذایی", "The Mediterranean diet is healthy.", "رژیم مدیترانه‌ای سالم است."),
            v("stress", "استرس", "Too much stress is bad.", "استرس زیاد بد است."),
            v("sleep", "خواب", "I need eight hours of sleep.", "به هشت ساعت خواب نیاز دارم."),
            v("vegetables", "سبزیجات", "Eat lots of vegetables.", "سبزیجات زیادی بخور."),
            v("fruit", "میوه", "Fruit is good for you.", "میوه برایت خوب است."),
            v("long life", "زندگی طولانی", "Blue Zones have people with long lives.", "مناطق آبی افرادی با زندگی طولانی دارند."),
            v("lifestyle", "سبک زندگی", "A healthy lifestyle is important.", "سبک زندگی سالم مهم است.")
        ),
        listOf(
            GrammarSection("Present simple (review)", "Positive, negative, questions. I exercise. She doesn't smoke. Do you eat vegetables?"),
            GrammarSection("Frequency expressions", "every day, once a week, twice a month, three times a year."),
            GrammarSection("How often...?", "How often do you exercise? How often does she eat fish?")
        ),
        listOf(
            d("A", "What are Blue Zones?", "مناطق آبی چیست؟"),
            d("B", "They're places in the world where people live very long lives.", "مکان‌هایی در جهان هستند که مردم زندگی خیلی طولانی دارند."),
            d("A", "Where are they?", "کجا هستند؟"),
            d("B", "In Japan, Italy, Greece, Costa Rica, and California.", "در ژاپن، ایتالیا، یونان، کاستاریکا و کالیفرنیا."),
            d("A", "What's their secret?", "رازشان چیست؟"),
            d("B", "They have a healthy lifestyle. They eat vegetables and fruit.", "سبک زندگی سالمی دارند. سبزیجات و میوه می‌خورند."),
            d("A", "Do they exercise?", "ورزش می‌کنند؟"),
            d("B", "Yes, but not in a gym. They walk and do physical work.", "بله، ولی نه در باشگاه. پیاده‌روی می‌کنند و کار فیزیکی انجام می‌دهند."),
            d("A", "Do they have stress?", "استرس دارند؟"),
            d("B", "Not much. They relax and spend time with family.", "زیاد نه. استراحت می‌کنند و با خانواده وقت می‌گذرانند."),
            d("A", "How often do they eat meat?", "چند وقت یکبار گوشت می‌خورند؟"),
            d("B", "Only once or twice a week. Mostly vegetables.", "فقط یک یا دو بار در هفته. بیشتر سبزیجات."),
            d("A", "That sounds healthy.", "سالم به نظر می‌رسد."),
            d("B", "Yes, and they're happy too. Happiness is important.", "بله، و خوشحال هم هستند. خوشحالی مهم است."),
            d("A", "I need to change my lifestyle!", "باید سبک زندگی‌ام را تغییر دهم!")
        ),
        listOf(
            q("Where are Blue Zones?", listOf("Japan, Italy, Greece", "Japan, China, Korea", "Italy, France, Spain"), 0),
            q("How often do people in Blue Zones eat meat?", listOf("every day", "once or twice a week", "never"), 1),
            q("How often ___ you exercise?", listOf("do", "does", "are"), 0),
            q("She ___ eat fast food.", listOf("don't", "doesn't", "isn't"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Long life", "زندگی طولانی", "They have long lives.", "زندگی طولانی دارند."),
            IdiomExpression("Spend time", "وقت گذراندن", "They spend time with family.", "با خانواده وقت می‌گذرانند.")
        ),
        pronunciation = listOf(
            PronunciationTip("Frequency expressions", "Stress the frequency: EVery day, TWICE a week.")
        ),
        culture = listOf(
            CulturalNote("Blue Zones", "Blue Zones are regions where people live significantly longer than average, identified by National Geographic.")
        ),
        mistakes = listOf(
            CommonMistake("How often you exercise?", "How often do you exercise?", "Use 'do' in questions.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 11 — Vote for me! | به من رأی بده!
    // ═══════════════════════════════════════════════════════════
    private fun file11() = base(
        11, "Vote for me!", "به من رأی بده!",
        listOf(
            "Use can/can't for ability and permission",
            "Talk about abilities",
            "Use adverbs of manner",
            "Talk about politics and leadership"
        ),
        listOf(
            v("vote", "رأی دادن", "Vote for me!", "به من رأی بده!", "verb"),
            v("leader", "رهبر", "She's a good leader.", "او رهبر خوبی است."),
            v("promise", "قول دادن", "I promise to help you.", "قول می‌دهم کمکت کنم.", "verb"),
            v("change", "تغییر", "We need change.", "ما به تغییر نیاز داریم."),
            v("future", "آینده", "Think about the future.", "به آینده فکر کن."),
            v("together", "با هم", "We can do it together.", "می‌توانیم با هم انجامش دهیم.", "adverb"),
            v("better", "بهتر", "A better life for everyone.", "زندگی بهتر برای همه.", "adjective"),
            v("strong", "قوی", "She's a strong person.", "او فرد قوی‌ای است.", "adjective"),
            v("honest", "صادق", "He's an honest man.", "او مرد صادقی است.", "adjective"),
            v("smart", "باهوش", "She's very smart.", "او خیلی باهوش است.", "adjective")
        ),
        listOf(
            GrammarSection("Can / Can't for ability", "I can speak three languages. She can't drive. Can you cook?"),
            GrammarSection("Can / Can't for permission", "Can I go? You can't smoke here."),
            GrammarSection("Adverbs of manner", "quickly, slowly, well, badly, carefully. She speaks English well.")
        ),
        listOf(
            d("A", "Are you going to vote in the election?", "قرار است در انتخابات رأی بدهی؟"),
            d("B", "Yes, I am. But I don't know who to vote for.", "بله. ولی نمی‌دانم به کی رأی بدهم."),
            d("A", "What do you want in a leader?", "از یک رهبر چه می‌خواهی؟"),
            d("B", "I want someone honest and smart. Someone who can make change.", "کسی صادق و باهوش می‌خواهم. کسی که بتواند تغییر ایجاد کند."),
            d("A", "Can you trust politicians?", "می‌توانی به سیاستمداران اعتماد کنی؟"),
            d("B", "Not always. But some of them are good.", "نه همیشه. ولی بعضی‌شان خوب هستند."),
            d("A", "What are the most important things for you?", "مهم‌ترین چیزها برایت چیست؟"),
            d("B", "Education and healthcare. Everyone can go to school and see a doctor.", "آموزش و بهداشت. همه بتوانند به مدرسه بروند و دکتر ببینند."),
            d("A", "Can the government change these things?", "دولت می‌تواند این вещи را تغییر دهد؟"),
            d("B", "Yes, but we need to work together.", "بله، ولی باید با هم کار کنیم."),
            d("A", "I agree. We can make a better future.", "موافقم. می‌توانیم آینده بهتری بسازیم."),
            d("B", "Yes! That's why I'm going to vote.", "بله! به همین دلیل رأی می‌دهم."),
            d("A", "Good for you. Every vote counts.", "آفرین. هر رأی مهم است.")
        ),
        listOf(
            q("What does B want in a leader?", listOf("rich", "honest and smart", "famous"), 1),
            q("What is important for B?", listOf("education and healthcare", "sports", "music"), 0),
            q("She ___ speak three languages.", listOf("can", "cans", "can to"), 0),
            q("He speaks English ___.", listOf("good", "well", "nice"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Good for you", "آفرین", "Good for you!", "آفرین!"),
            IdiomExpression("Every vote counts", "هر رأی مهم است", "Every vote counts.", "هر رأی مهم است.")
        ),
        pronunciation = listOf(
            PronunciationTip("Can / Can't", "In British English: can /kæn/ vs. can't /kɑːnt/.")
        ),
        culture = listOf(
            CulturalNote("Voting", "In many countries, voting is a right and a responsibility.")
        ),
        mistakes = listOf(
            CommonMistake("She cans swim.", "She can swim.", "Modal verbs don't add -s.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 12 — A quiet life? | یک زندگی آرام؟
    // ═══════════════════════════════════════════════════════════
    private fun file12() = base(
        12, "A quiet life?", "یک زندگی آرام؟",
        listOf(
            "Use present continuous",
            "Use present continuous vs. present simple",
            "Talk about activities happening now",
            "Describe photos and scenes"
        ),
        listOf(
            v("quiet", "آرام", "I want a quiet life.", "زندگی آرامی می‌خواهم.", "adjective"),
            v("noisy", "پر سر و صدا", "The city is very noisy.", "شهر خیلی پر سر و صداست.", "adjective"),
            v("busy", "شلوغ", "She's a busy person.", "او فرد شلوغی است.", "adjective"),
            v("relax", "استراحت کردن", "I'm relaxing at home.", "دارم در خانه استراحت می‌کنم.", "verb"),
            v("enjoy", "لذت بردن", "I'm enjoying the sunshine.", "دارم از آفتاب لذت می‌برم.", "verb"),
            v("read", "خواندن", "She's reading a book.", "او دارد کتاب می‌خواند.", "verb"),
            v("write", "نوشتن", "He's writing an email.", "او دارد ایمیل می‌نویسد.", "verb"),
            v("listen", "گوش دادن", "We're listening to music.", "داریم به موسیقی گوش می‌دهیم.", "verb"),
            v("watch", "تماشا کردن", "They're watching TV.", "آن‌ها دارند تلویزیون تماشا می‌کنند.", "verb"),
            v("play", "بازی کردن", "The children are playing outside.", "بچه‌ها بیرون بازی می‌کنند.", "verb")
        ),
        listOf(
            GrammarSection("Present continuous", "am/is/are + verb-ing. I'm reading. She's writing. They're playing."),
            GrammarSection("Present continuous vs. present simple", "I'm reading now (action in progress). I read every day (habit)."),
            GrammarSection("Present continuous questions", "What are you doing? What is she reading? Are they playing?")
        ),
        listOf(
            d("A", "Hi! What are you doing?", "سلام! چه کار می‌کنی؟"),
            d("B", "I'm relaxing at home. I'm reading a book.", "دارم در خانه استراحت می‌کنم. دارم کتاب می‌خوانم."),
            d("A", "Nice. Is it a good book?", "خوبه. کتاب خوبی است؟"),
            d("B", "Yes, very good. It's about a quiet life in the countryside.", "بله، خیلی خوب. درباره زندگی آرام در حومه است."),
            d("A", "Sounds peaceful. What's your family doing?", "آرام به نظر می‌رسد. خانواده‌ات چه کار می‌کنند؟"),
            d("B", "My wife is cooking dinner. My children are playing outside.", "همسرم دارد شام می‌پزد. بچه‌هایم بیرون بازی می‌کنند."),
            d("A", "What are they playing?", "چه بازی می‌کنند؟"),
            d("B", "Football, I think. They love football.", "فوتبال، فکر می‌کنم. عاشق فوتبال هستند."),
            d("A", "Do you usually have a quiet evening?", "معمولاً عصر آرامی دارید؟"),
            d("B", "Yes, usually. We don't like noisy places.", "بله، معمولاً. مکان‌های پر سر و صدا دوست نداریم."),
            d("A", "Me neither. I'm enjoying a quiet evening too.", "من هم. من هم دارم از یک عصر آرام لذت می‌برم."),
            d("B", "What are you doing?", "چه کار می‌کنی؟"),
            d("A", "I'm listening to music and writing emails.", "دارم موسیقی گوش می‌دهم و ایمیل می‌نویسم."),
            d("B", "That sounds nice. Enjoy your evening!", "خوبه. از عصره‌ات لذت ببر!")
        ),
        listOf(
            q("What is B doing?", listOf("watching TV", "reading a book", "cooking"), 1),
            q("What are B's children doing?", listOf("playing football", "reading", "sleeping"), 0),
            q("She ___ writing an email.", listOf("am", "is", "are"), 1),
            q("They ___ playing outside.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Me neither", "من هم (منفی)", "Me neither.", "من هم."),
            IdiomExpression("Sounds nice", "خوبه", "Sounds nice!", "خوبه!")
        ),
        pronunciation = listOf(
            PronunciationTip("Present continuous stress", "Stress the -ing verb: I'm READing. She's WRITing.")
        ),
        culture = listOf(
            CulturalNote("Quiet evenings", "Many people value quiet evenings at home after a busy day.")
        ),
        mistakes = listOf(
            CommonMistake("What you are doing?", "What are you doing?", "In questions, verb comes before subject.")
        )
    )
}