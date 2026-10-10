package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 4th Edition — Level 1
 * 12 Files × 3 Lessons (A/B/C) = 36 Lessons | A1+ Beginner Plus
 */
object AmericanEnglishFile4thLevel1 {
    const val BOOK_ID = "american_english_file_4th_level1"

    fun getContent(n: Int): LessonContent = when (n) {
        1 -> f1A(); 2 -> f1B(); 3 -> f1C(); 4 -> pe1(); 5 -> rc12()
        6 -> f2A(); 7 -> f2B(); 8 -> f2C(); 9 -> pe2(); 10 -> rc34()
        11 -> f3A(); 12 -> f3B(); 13 -> f3C(); 14 -> pe3(); 15 -> rc56()
        16 -> f4A(); 17 -> f4B(); 18 -> f4C(); 19 -> pe4(); 20 -> rc78()
        21 -> f5A(); 22 -> f5B(); 23 -> f5C(); 24 -> pe5(); 25 -> rc910()
        26 -> f6A(); 27 -> f6B(); 28 -> f6C(); 29 -> pe6(); 30 -> rc1112()
        31 -> f7A(); 32 -> f7B(); 33 -> f7C(); 34 -> pe7(); 35 -> rc1314()
        36 -> f8A(); 37 -> f8B(); 38 -> f8C(); 39 -> pe8(); 40 -> rc1516()
        41 -> f9A(); 42 -> f9B(); 43 -> f9C(); 44 -> pe9(); 45 -> rc1718()
        46 -> f10A(); 47 -> f10B(); 48 -> f10C(); 49 -> pe10(); 50 -> rc1920()
        51 -> f11A(); 52 -> f11B(); 53 -> f11C(); 54 -> pe11(); 55 -> rc2122()
        56 -> f12A(); 57 -> f12B(); 58 -> f12C(); 59 -> pe12(); 60 -> rc2324()
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
    private fun f1A() = base(1, "1A Where are you from?", "۱A اهل کجایی؟",
        listOf("Use verb be", "Talk about countries", "Use subject pronouns"),
        listOf(
            v("from", "اهل", "Where are you from?", "اهل کجایی؟", "preposition"),
            v("country", "کشور", "Which country?", "کدام کشور؟"),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیه؟"),
            v("American", "آمریکایی", "He's American.", "او آمریکاییه.", "adjective"),
            v("British", "بریتانیایی", "They're British.", "آن‌ها بریتانیایی هستن.", "adjective"),
            v("Japanese", "ژاپنی", "She's Japanese.", "او ژاپنیه.", "adjective")
        ),
        listOf(
            GrammarSection("Verb be: all forms", "I am, you are, he/she/it is, we/you/they are."),
            GrammarSection("Subject pronouns", "I, you, he, she, it, we, they.")
        ),
        listOf(
            d("A", "Hi! I'm Daniel. Are you a new student?", "سلام! من دانیالم. دانش‌آموز جدیدی؟"),
            d("B", "Yes, I am. My name's Yuki.", "بله. اسمم یوکیه."),
            d("A", "Nice to meet you, Yuki. Where are you from?", "از آشنایی خوشحالم یوکی. اهل کجایی؟"),
            d("B", "I'm from Japan. And you?", "اهل ژاپنم. تو چطور؟"),
            d("A", "I'm from Australia. Are you from Tokyo?", "من اهل استرالیام. اهل توکیو هستی؟"),
            d("B", "No, I'm from Osaka. It's a big city.", "نه، اهل اوزاکام. شهر بزرگیه."),
            d("A", "How interesting! What's your first language?", "چقدر جالب! زبان مادریت چیه؟"),
            d("B", "Japanese. And I speak a little English.", "ژاپنی. و کمی انگلیسی صحبت می‌کنم."),
            d("A", "Your English is good! Our teacher is British.", "انگلیسیت خوبه! معلم ما بریتانیاییه."),
            d("B", "Really? That's great. I want to learn British English.", "واقعاً؟ عالیه. می‌خوام انگلیسی بریتانیایی یاد بگیرم."),
            d("A", "Well, welcome to the class!", "خب، به کلاس خوش آمدی!"),
            d("B", "Thank you!", "ممنون!")
        ),
        listOf(
            q("Where is Yuki from?", listOf("Tokyo", "Osaka", "Kyoto"), 1),
            q("What's Daniel's nationality?", listOf("British", "American", "Australian"), 2),
            q("Where ___ you from?", listOf("is", "am", "are"), 2),
            q("This is my sister. ___ name is Sara.", listOf("His", "Her", "Their"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you!", "از آشنایی خوشحالم!"),
            IdiomExpression("A little", "کمی", "I speak a little English.", "کمی انگلیسی صحبت می‌کنم.")
        ),
        pron = listOf(PronunciationTip("Sentence stress", "Where ARE you FROM?")),
        cult = listOf(CulturalNote("Nationalities", "Always capitalized.")),
        mis = listOf(CommonMistake("I from Japan.", "I am from Japan.", "Don't forget 'am'."))
    )

    private fun f1B() = base(2, "1B Charlotte's choice", "۱B انتخاب شارلوت",
        listOf("Use possessive adjectives", "Use possessive 's", "Talk about people"),
        listOf(
            v("friend", "دوست", "My friend Tom.", "دوستم تام."),
            v("family", "خانواده", "Her family is big.", "خانواده‌اش بزرگه."),
            v("mother", "مادر", "His mother is a teacher.", "مادرش معلمه."),
            v("father", "پدر", "Her father is a doctor.", "پدرش دکتره."),
            v("brother", "برادر", "My brother is a student.", "برادرم دانشجوست."),
            v("sister", "خواهر", "His sister is nice.", "خواهرش خوبه.")
        ),
        listOf(
            GrammarSection("Possessive adjectives", "my, your, his, her, our, their."),
            GrammarSection("Possessive 's", "Tom's father, my sister's car.")
        ),
        listOf(
            d("A", "Who's Charlotte?", "شارلوت کیه؟"),
            d("B", "She's my friend. Her family is from France.", "دوستمه. خانواده‌اش اهل فرانسه‌ست."),
            d("A", "What does her father do?", "پدرش چیکار می‌کنه؟"),
            d("B", "He's a doctor. And her mother is a teacher.", "دکتره. و مادرش معلمه."),
            d("A", "Does she have brothers or sisters?", "برادر یا خواهر داره؟"),
            d("B", "Yes, she has one brother. His name is Pierre.", "بله، یک برادر داره. اسمش پی‌یره."),
            d("A", "Is this her book?", "این کتابشه؟"),
            d("B", "Yes, it's Charlotte's book.", "بله، کتابِ شارلوته."),
            d("A", "She has a nice family!", "خانواده خوبی داره!"),
            d("B", "Yes, and she's very happy.", "بله، و خیلی خوشحاله.")
        ),
        listOf(
            q("Where is Charlotte's family from?", listOf("Italy", "France", "Spain"), 1),
            q("What does her father do?", listOf("teacher", "doctor", "engineer"), 1),
            q("___ mother is a teacher.", listOf("His", "Her", "Their"), 1),
            q("This is ___ book. (Tom)", listOf("Toms", "Tom's", "Toms'"), 1)
        ),
        idioms = listOf(IdiomExpression("A nice family", "خانواده خوب", "She has a nice family!", "خانواده خوبی داره!")),
        pron = listOf(PronunciationTip("Possessive 's", "/s/, /z/, /ɪz/")),
        cult = listOf(CulturalNote("Family", "Family structures vary.")),
        mis = listOf(CommonMistake("She have a brother.", "She has a brother.", "Use 'has' with she."))
    )

    private fun f1C() = base(3, "1C Mr. and Mrs. Clark and Percy", "۱C آقا و خانم کلارک و پرسی",
        listOf("Use verb be in questions", "Ask personal questions", "Use question words"),
        listOf(
            v("married", "متأهل", "Are you married?", "متأهلی؟", "adjective"),
            v("single", "مجرد", "I'm single.", "مجردم.", "adjective"),
            v("how old", "چند ساله", "How old are you?", "چند سالته؟"),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟"),
            v("phone", "تلفن", "What's your phone number?", "شماره تلفنت چیه؟"),
            v("email", "ایمیل", "What's your email?", "ایمیلت چیه؟")
        ),
        listOf(
            GrammarSection("Questions with be", "Are you married? Is he American? Where are they from?"),
            GrammarSection("Wh- questions", "What, Where, Who, How old, How."),
            GrammarSection("Short answers", "Yes, I am. / No, I'm not.")
        ),
        listOf(
            d("A", "Are you married?", "متأهلی؟"),
            d("B", "Yes, I am. My husband is Percy.", "بله. همسرم پرسیه."),
            d("A", "How old is he?", "چند سالشه؟"),
            d("B", "He's 35. I'm 32.", "۳۵ ساله. من ۳۲."),
            d("A", "Where are you from?", "اهل کجایید؟"),
            d("B", "We're from London.", "اهل لندنیم."),
            d("A", "What's your address?", "آدرستون چیه؟"),
            d("B", "15 Park Street, London.", "۱۵ خیابان پارک، لندن."),
            d("A", "And your phone number?", "و شماره تلفنتون؟"),
            d("B", "07700 900123.", "۰۷۷۰۰ ۹۰۰۱۲۳."),
            d("A", "Thank you, Mrs. Clark.", "ممنون، خانم کلارک."),
            d("B", "You're welcome!", "خواهش می‌کنم!")
        ),
        listOf(
            q("Is B married?", listOf("no", "yes", "single"), 1),
            q("Where are they from?", listOf("Paris", "London", "New York"), 1),
            q("___ you married?", listOf("Is", "Am", "Are"), 2),
            q("How ___ is he?", listOf("old", "many", "much"), 0)
        ),
        idioms = listOf(IdiomExpression("You're welcome", "خواهش می‌کنم", "You're welcome!", "خواهش می‌کنم!")),
        pron = listOf(PronunciationTip("Short answers", "Yes, I AM. / No, I'm NOT.")),
        cult = listOf(CulturalNote("Marriage", "Marital status is personal.")),
        mis = listOf(CommonMistake("Are you married? Yes, I'm.", "Yes, I am.", "Use full form."))
    )

    // ═══════════ PRACTICAL ENGLISH 1 ═══════════
    private fun pe1() = base(4, "PE1 On the street", "انگلیسی کاربردی ۱ — در خیابان",
        listOf("Ask for information", "Give personal information", "Use polite requests"),
        listOf(
            v("excuse me", "ببخشید", "Excuse me!", "ببخشید!", "interjection"),
            v("sorry", "متأسفم", "I'm sorry.", "متأسفم.", "interjection"),
            v("repeat", "تکرار کردن", "Can you repeat that?", "می‌تونی تکرار کنی؟", "verb"),
            v("spell", "هجی کردن", "How do you spell it?", "چطور هجی می‌کنی؟", "verb"),
            v("address", "آدرس", "What's your address?", "آدرست چیه؟"),
            v("phone", "تلفن", "What's your phone number?", "شماره تلفنت چیه؟")
        ),
        listOf(
            GrammarSection("Polite requests", "Excuse me. Can you...? Could you...?"),
            GrammarSection("Personal information", "What's your name? Where are you from?")
        ),
        listOf(
            d("A", "Excuse me. Where's the station?", "ببخشید. ایستگاه کجاست؟"),
            d("B", "Sorry, I don't know. I'm not from here.", "متأسفم، نمی‌دانم. اهل اینجا نیستم."),
            d("A", "Oh, sorry. Can I ask you a question?", "اوه، ببخشید. می‌تونم یک سوال بپرسم؟"),
            d("B", "Sure.", "البته."),
            d("A", "What's your name?", "اسمت چیه؟"),
            d("B", "Maria. How do you spell it? M-A-R-I-A.", "ماریا. چطور هجی می‌شه؟ م-ا-ر-ی-ا."),
            d("A", "Where are you from?", "اهل کجایی؟"),
            d("B", "I'm from Spain. And you?", "اهل اسپانیام. تو چطور؟"),
            d("A", "I'm from Italy.", "من اهل ایتالیام."),
            d("B", "Nice to meet you!", "از آشنایی خوشحالم!"),
            d("A", "Nice to meet you too!", "من هم خوشحالم!")
        ),
        listOf(
            q("Where's the station?", listOf("on Main St", "don't know", "near here"), 1),
            q("Where is Maria from?", listOf("Italy", "Spain", "France"), 1),
            q("___ me, where's the station?", listOf("Excuse", "Sorry", "Pardon"), 0),
            q("Can you ___ that?", listOf("repeat", "repeat to", "repeating"), 0)
        ),
        idioms = listOf(IdiomExpression("Excuse me", "ببخشید", "Excuse me!", "ببخشید!")),
        pron = listOf(PronunciationTip("Polite intonation", "Rise at the end: Excuse ME? ↗")),
        cult = listOf(CulturalNote("Asking strangers", "Start with 'Excuse me'.")),
        mis = listOf(CommonMistake("Sorry me.", "Excuse me.", "Correct phrase."))
    )

    // ═══════════ REVIEW 1 ═══════════
    private fun rc12() = base(5, "R&C 1&2", "مرور ۱ و ۲",
        listOf("Review verb be", "Review possessives", "Review questions"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Verb be review", "All forms, questions, negatives."),
            GrammarSection("Possessives", "my, your, his, her. Tom's car."),
            GrammarSection("Questions", "Are you...? Where...? What...? How old...?")
        ),
        listOf(
            d("T", "Review time! Files 1-2.", "وقت مرور! فایل‌های ۱-۲."),
            d("A", "I am, you are, he is, she is.", "I am، you are، he is، she is."),
            d("B", "My, your, his, her.", "My، your، his، her."),
            d("T", "Questions?", "سوالات؟"),
            d("A", "Are you married? Where are you from?", "Are you married? Where are you from?"),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("Where ___ you from?", listOf("is", "am", "are"), 2),
            q("___ mother is a teacher.", listOf("His", "Her", "Their"), 1),
            q("___ is your name?", listOf("What", "Who", "Where"), 0),
            q("This is ___ book. (Tom)", listOf("Toms", "Tom's", "Toms'"), 1)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Intonation", "Statements fall, questions rise.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I from Japan.", "I am from Japan.", "Don't forget 'am'."))
    )

    // ═══════════ FILE 2 ═══════════
    private fun f2A() = base(6, "2A Right place, wrong person", "۲A جای درست، آدم اشتباه",
        listOf("Use present simple", "Talk about routines", "Use adverbs of frequency"),
        listOf(
            v("work", "کار کردن", "I work in an office.", "در دفتر کار می‌کنم.", "verb"),
            v("live", "زندگی کردن", "She lives in London.", "در لندن زندگی می‌کند.", "verb"),
            v("eat", "خوردن", "We eat at 8.", "ساعت ۸ غذا می‌خوریم.", "verb"),
            v("drink", "نوشیدن", "He drinks coffee.", "او قهوه می‌نوشد.", "verb"),
            v("always", "همیشه", "I always get up early.", "همیشه زود بیدار می‌شم.", "adverb"),
            v("usually", "معمولاً", "I usually walk to work.", "معمولاً پیاده به کار می‌روم.", "adverb")
        ),
        listOf(
            GrammarSection("Present simple", "I/you/we/they + base verb. He/she/it + -s."),
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, never — before main verb.")
        ),
        listOf(
            d("A", "Where do you work?", "کجا کار می‌کنی؟"),
            d("B", "I work in a hospital. I'm a nurse.", "در بیمارستان کار می‌کنم. پرستارم."),
            d("A", "What time do you start?", "چه ساعتی شروع می‌کنی؟"),
            d("B", "I usually start at 7. I always get up at 5:30.", "معمولاً ساعت ۷ شروع می‌کنم. همیشه ۵:۳۰ بیدار می‌شم."),
            d("A", "That's very early!", "خیلی زوده!"),
            d("B", "Yes, but I finish at 3.", "بله، ولی ساعت ۳ تمام می‌کنم."),
            d("A", "Do you like your job?", "شغلت رو دوست داری؟"),
            d("B", "Yes, I love it. I help people.", "بله، عاشقشم. به مردم کمک می‌کنم."),
            d("A", "That's great!", "عالیه!"),
            d("B", "What about you?", "تو چطور؟"),
            d("A", "I work in an office. I start at 9.", "در دفتر کار می‌کنم. ساعت ۹ شروع می‌کنم."),
            d("B", "That's better!", "بهتره!")
        ),
        listOf(
            q("What's B's job?", listOf("doctor", "nurse", "teacher"), 1),
            q("When does B start?", listOf("5:30", "7:00", "9:00"), 1),
            q("I ___ in an office.", listOf("work", "works", "working"), 0),
            q("She ___ in London.", listOf("live", "lives", "living"), 1)
        ),
        idioms = listOf(IdiomExpression("Help people", "کمک به مردم", "I help people.", "به مردم کمک می‌کنم.")),
        pron = listOf(PronunciationTip("Third -s", "works /wɜːrks/, lives /lɪvz/")),
        cult = listOf(CulturalNote("Nurses", "Important healthcare workers.")),
        mis = listOf(CommonMistake("She live in London.", "She lives in London.", "Add -s."))
    )

    private fun f2B() = base(7, "2B The story behind the photo", "۲B داستان پشت عکس",
        listOf("Use present continuous", "Talk about actions now", "Describe photos"),
        listOf(
            v("wearing", "پوشیدن", "She's wearing a dress.", "او لباس پوشیده.", "verb"),
            v("reading", "خواندن", "He's reading a book.", "کتاب می‌خواند.", "verb"),
            v("sitting", "نشستن", "They're sitting on a bench.", "روی نیمکت نشسته‌اند.", "verb"),
            v("standing", "ایستادن", "She's standing near the door.", "نزدیک در ایستاده.", "verb"),
            v("smiling", "لبخند زدن", "The baby is smiling.", "بچه لبخند می‌زند.", "verb"),
            v("playing", "بازی کردن", "Children are playing.", "بچه‌ها بازی می‌کنند.", "verb")
        ),
        listOf(
            GrammarSection("Present continuous", "am/is/are + verb-ing. I'm reading. She's wearing."),
            GrammarSection("Questions", "What are you doing? What is she wearing?")
        ),
        listOf(
            d("A", "What's in the photo?", "در عکس چیه؟"),
            d("B", "A family. They're having a picnic.", "یک خانواده. در حال پیک‌نیک هستند."),
            d("A", "What's the mother doing?", "مادر چیکار می‌کنه؟"),
            d("B", "She's cutting bread. And the father is playing with the kids.", "دارد نان می‌بُرد. و پدر با بچه‌ها بازی می‌کند."),
            d("A", "What are the children wearing?", "بچه‌ها چی پوشیده‌اند؟"),
            d("B", "The boy is wearing a blue shirt. The girl is wearing a red dress.", "پسر پیراهن آبی پوشیده. دختر لباس قرمز پوشیده."),
            d("A", "Is the sun shining?", "خورشید می‌تابد؟"),
            d("B", "Yes, it's a beautiful day.", "بله، روز زیباییه."),
            d("A", "Where was this taken?", "کجا گرفته شده؟"),
            d("B", "In the park, last summer.", "در پارک، تابستان گذشته."),
            d("A", "It's a lovely photo!", "عکس قشنگیه!"),
            d("B", "Thanks! I love it too.", "ممنون! من هم دوستش دارم.")
        ),
        listOf(
            q("What's the mother doing?", listOf("reading", "cutting bread", "playing"), 1),
            q("What's the boy wearing?", listOf("red dress", "blue shirt", "green hat"), 1),
            q("She ___ wearing a dress.", listOf("am", "is", "are"), 1),
            q("They ___ playing.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(IdiomExpression("A lovely photo", "عکس قشنگ", "It's a lovely photo!", "عکس قشنگیه!")),
        pron = listOf(PronunciationTip("-ing", "/ɪŋ/")),
        cult = listOf(CulturalNote("Photos", "Capture memories.")),
        mis = listOf(CommonMistake("She are wearing.", "She is wearing.", "Use 'is'."))
    )

    private fun f2C() = base(8, "2C One dark October evening", "۲C یک عصر تاریک اکتبر",
        listOf("Use present continuous vs simple", "Use time expressions", "Tell a story"),
        listOf(
            v("evening", "عصر", "One dark evening.", "یک عصر تاریک."),
            v("dark", "تاریک", "A dark night.", "شب تاریک.", "adjective"),
            v("rain", "باران", "It's raining.", "باران می‌آید.", "verb"),
            v("walk", "قدم زدن", "I'm walking home.", "دارم به خانه قدم می‌زنم.", "verb"),
            v("usually", "معمولاً", "I usually walk.", "معمولاً قدم می‌زنم.", "adverb"),
            v("tonight", "امشب", "Tonight is different.", "امشب متفاوته.", "adverb")
        ),
        listOf(
            GrammarSection("Present continuous vs simple", "I usually walk (habit). I'm walking now (action)."),
            GrammarSection("Time expressions", "tonight, now, today, this evening.")
        ),
        listOf(
            d("A", "What are you doing?", "چیکار می‌کنی؟"),
            d("B", "I'm walking home. It's raining.", "دارم به خانه قدم می‌زنم. باران می‌آید."),
            d("A", "But you usually take the bus!", "ولی تو معمولاً اتوبوس می‌گیری!"),
            d("B", "I know. Tonight is different.", "می‌دانم. امشب متفاوته."),
            d("A", "Why?", "چرا؟"),
            d("B", "I need to think. It's a dark evening.", "باید فکر کنم. عصر تاریکیه."),
            d("A", "Are you OK?", "خوبی؟"),
            d("B", "Yes, I'm fine. Just thinking about life.", "بله، خوبم. فقط دارم به زندگی فکر می‌کنم."),
            d("A", "I understand. Enjoy your walk.", "می‌فهمم. از قدم زدنت لذت ببر."),
            d("B", "Thanks. See you tomorrow.", "ممنون. فردا می‌بینمت."),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What's B doing?", listOf("taking bus", "walking", "driving"), 1),
            q("What's the weather like?", listOf("sunny", "raining", "snowing"), 1),
            q("I usually ___ the bus.", listOf("take", "taking", "takes"), 0),
            q("I ___ walking now.", listOf("am", "is", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("Just thinking about life", "فقط به زندگی فکر کردن", "Just thinking about life.", "فقط دارم به زندگی فکر می‌کنم.")),
        pron = listOf(PronunciationTip("Contrast", "I USUALLY take. I'M walking NOW.")),
        cult = listOf(CulturalNote("Evening walks", "Common in many cultures.")),
        mis = listOf(CommonMistake("I walking now.", "I'm walking now.", "Add 'am'."))
    )

    // ═══════════ PRACTICAL ENGLISH 2 ═══════════
    private fun pe2() = base(9, "PE2 At a coffee shop", "انگلیسی کاربردی ۲ — در کافه",
        listOf("Order food and drinks", "Use polite requests", "Ask for the bill"),
        listOf(
            v("menu", "منو", "Can I see the menu?", "می‌توانم منو را ببینم؟"),
            v("order", "سفارش دادن", "Are you ready to order?", "آماده سفارش هستید؟", "verb"),
            v("bill", "صورت‌حساب", "The bill, please.", "صورت‌حساب لطفاً."),
            v("coffee", "قهوه", "A coffee, please.", "یک قهوه، لطفاً."),
            v("tea", "چای", "A tea, please.", "یک چای، لطفاً."),
            v("cake", "کیک", "A piece of cake.", "یک تکه کیک.")
        ),
        listOf(
            GrammarSection("Ordering", "I'd like... Can I have...? A coffee, please."),
            GrammarSection("Polite requests", "Could I have...? Would you like...?")
        ),
        listOf(
            d("W", "Good morning. Can I help you?", "صبح بخیر. کمکی کنم؟"),
            d("A", "Yes, I'd like a coffee, please.", "بله، یک قهوه لطفاً."),
            d("W", "Small or large?", "کوچک یا بزرگ؟"),
            d("A", "Large, please. And a piece of cake.", "بزرگ، لطفاً. و یک تکه کیک."),
            d("W", "Chocolate or vanilla?", "شکلاتی یا وانیلی؟"),
            d("A", "Chocolate, please.", "شکلاتی، لطفاً."),
            d("W", "Anything else?", "چیز دیگری؟"),
            d("A", "No, thanks. How much is it?", "نه، ممنون. چقدره؟"),
            d("W", "That's $8.50.", "۸.۵۰ دلار."),
            d("A", "Here you are.", "بفرمایید."),
            d("W", "Thank you. Enjoy!", "ممنون. لذت ببرید!"),
            d("A", "Thanks!", "ممنون!")
        ),
        listOf(
            q("What does A order?", listOf("tea", "coffee and cake", "sandwich"), 1),
            q("How much is it?", listOf("$5", "$8.50", "$10"), 1),
            q("I'd ___ a coffee.", listOf("like", "likes", "liking"), 0),
            q("Can I ___ the menu?", listOf("see", "seeing", "saw"), 0)
        ),
        idioms = listOf(IdiomExpression("Anything else?", "چیز دیگری؟", "Anything else?", "چیز دیگری؟")),
        pron = listOf(PronunciationTip("Polite", "I'd like /aɪd laɪk/")),
        cult = listOf(CulturalNote("Coffee shops", "Common in many countries.")),
        mis = listOf(CommonMistake("I want coffee.", "I'd like a coffee.", "Use 'I'd like'."))
    )

    // ═══════════ REVIEW 2 ═══════════
    private fun rc34() = base(10, "R&C 3&4", "مرور ۳ و ۴",
        listOf("Review present simple", "Review present continuous", "Review ordering"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Present simple", "I work. She works."),
            GrammarSection("Present continuous", "I'm working. She's reading."),
            GrammarSection("Ordering", "I'd like... Can I have...?")
        ),
        listOf(
            d("T", "Review time! Files 3-4.", "وقت مرور! فایل‌های ۳-۴."),
            d("A", "I work, she works.", "I work، she works."),
            d("B", "I'm working, she's reading.", "I'm working، she's reading."),
            d("T", "Ordering?", "سفارش دادن؟"),
            d("A", "I'd like a coffee. Can I have the bill?", "I'd like a coffee. Can I have the bill?"),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("She ___ in London.", listOf("live", "lives", "living"), 1),
            q("I ___ reading now.", listOf("am", "is", "are"), 0),
            q("I'd ___ a coffee.", listOf("like", "likes", "liking"), 0),
            q("Can I ___ the bill?", listOf("have", "has", "having"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Contrast", "Simple vs continuous.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("She live in London.", "She lives in London.", "Add -s."))
    )

    // ═══════════ FILE 3 ═══════════
    private fun f3A() = base(11, "3A Plans and dreams", "۳A برنامه‌ها و رؤیاها",
        listOf("Use going to for future", "Talk about plans", "Use future time expressions"),
        listOf(
            v("plan", "برنامه", "What are your plans?", "برنامه‌ات چیه؟"),
            v("going to", "قرار است", "I'm going to travel.", "قرار است سفر کنم.", "verb"),
            v("tomorrow", "فردا", "See you tomorrow.", "فردا می‌بینمت."),
            v("next week", "هفته بعد", "Next week I'll...", "هفته بعد..."),
            v("summer", "تابستان", "In the summer.", "در تابستان."),
            v("dream", "رؤیا", "A dream job.", "شغل رؤیایی.")
        ),
        listOf(
            GrammarSection("Be going to", "am/is/are + going to + verb. I'm going to travel."),
            GrammarSection("Future time expressions", "tomorrow, next week, next year, this summer.")
        ),
        listOf(
            d("A", "What are your plans for the summer?", "برنامه‌ات برای تابستان چیه؟"),
            d("B", "I'm going to travel to Italy.", "قرار است به ایتالیا سفر کنم."),
            d("A", "Nice! Where exactly?", "خوبه! کجا؟"),
            d("B", "Rome and Florence. For two weeks.", "رم و فلورانس. دو هفته."),
            d("A", "That sounds amazing. Are you going alone?", "شگفت‌انگیز به نظر می‌رسد. تنها می‌روی؟"),
            d("B", "No, with my sister. She's going to learn Italian.", "نه، با خواهرم. او قرار است ایتالیایی یاد بگیرد."),
            d("A", "Are you going to learn too?", "تو هم قرار است یاد بگیری؟"),
            d("B", "A little. Just phrases.", "کمی. فقط جمله‌ها."),
            d("A", "I'm going to visit my family in Spain.", "من قرار است به خانواده‌ام در اسپانیا سر بزنم."),
            d("B", "That's nice too!", "اون هم خوبه!"),
            d("A", "Yes, family time is important.", "بله، وقت خانوادگی مهمه."),
            d("B", "I agree!", "موافقم!")
        ),
        listOf(
            q("Where is B going?", listOf("Spain", "Italy", "France"), 1),
            q("Who is B going with?", listOf("alone", "sister", "brother"), 1),
            q("I ___ going to travel.", listOf("am", "is", "are"), 0),
            q("She ___ going to learn Italian.", listOf("am", "is", "are"), 1)
        ),
        idioms = listOf(IdiomExpression("Family time", "وقت خانوادگی", "Family time is important.", "وقت خانوادگی مهمه.")),
        pron = listOf(PronunciationTip("Going to", "Often 'gonna' in fast speech")),
        cult = listOf(CulturalNote("Summer holidays", "Europeans often take long holidays.")),
        mis = listOf(CommonMistake("I going to travel.", "I'm going to travel.", "Add 'am'."))
    )

    private fun f3B() = base(12, "3B Let's meet again", "۳B بیا دوباره ملاقات کنیم",
        listOf("Use present continuous for future", "Make arrangements", "Use time expressions"),
        listOf(
            v("meet", "ملاقات کردن", "Let's meet.", "بیا ملاقات کنیم.", "verb"),
            v("arrangement", "قرار", "An arrangement.", "یک قرار."),
            v("busy", "شلوغ", "I'm busy.", "شلوغم.", "adjective"),
            v("free", "آزاد", "Are you free?", "آزادی؟", "adjective"),
            v("tonight", "امشب", "Tonight is good.", "امشب خوبه.", "adverb"),
            v("weekend", "آخر هفته", "This weekend.", "این آخر هفته.")
        ),
        listOf(
            GrammarSection("Present continuous for future", "I'm meeting Tom tomorrow. We're having a party on Saturday."),
            GrammarSection("Arrangements", "Fixed plans in the near future.")
        ),
        listOf(
            d("A", "Are you free this weekend?", "این آخر هفته آزادی؟"),
            d("B", "I'm busy on Saturday. I'm meeting my parents.", "شنبه شلوغم. دارم والدینم رو می‌بینم."),
            d("A", "What about Sunday?", "یکشنبه چطور؟"),
            d("B", "Sunday is free. What are you doing?", "یکشنبه آزادم. تو چیکار می‌کنی؟"),
            d("A", "I'm having a party. Can you come?", "دارم مهمانی می‌گیرم. می‌تونی بیای؟"),
            d("B", "I'd love to! What time?", "خیلی دوست دارم! چه ساعتی؟"),
            d("A", "At 7. At my house.", "ساعت ۷. خانه من."),
            d("B", "Great. I'm bringing a cake.", "عالی. کیک میارم."),
            d("A", "Perfect! See you Sunday.", "عالی! یکشنبه می‌بینمت."),
            d("B", "See you!", "می‌بینمت!"),
            d("A", "Don't forget!", "فراموش نکن!"),
            d("B", "I won't!", "فراموش نمی‌کنم!")
        ),
        listOf(
            q("What's B doing Saturday?", listOf("party", "meeting parents", "working"), 1),
            q("What's A doing Sunday?", listOf("party", "working", "resting"), 0),
            q("I ___ meeting Tom tomorrow.", listOf("am", "is", "are"), 0),
            q("We ___ having a party.", listOf("am", "is", "are"), 2)
        ),
        idioms = listOf(
            IdiomExpression("I'd love to!", "خیلی دوست دارم!", "I'd love to!", "خیلی دوست دارم!"),
            IdiomExpression("I won't!", "فراموش نمی‌کنم!", "I won't!", "فراموش نمی‌کنم!")
        ),
        pron = listOf(PronunciationTip("Present continuous future", "We're HAVing a party.")),
        cult = listOf(CulturalNote("Parties", "Common social activity.")),
        mis = listOf(CommonMistake("I meet Tom tomorrow.", "I'm meeting Tom tomorrow.", "Use present continuous."))
    )

    private fun f3C() = base(13, "3C What's the word?", "۳C کلمه چیه؟",
        listOf("Use question words", "Ask for definitions", "Use communication strategies"),
        listOf(
            v("word", "کلمه", "What's the word?", "کلمه چیه؟"),
            v("mean", "معنی دادن", "What does it mean?", "چه معنی می‌دهد؟", "verb"),
            v("spell", "هجی کردن", "How do you spell it?", "چطور هجی می‌کنی؟", "verb"),
            v("repeat", "تکرار کردن", "Can you repeat?", "می‌تونی تکرار کنی؟", "verb"),
            v("understand", "فهمیدن", "I don't understand.", "نمی‌فهمم.", "verb"),
            v("example", "مثال", "For example...", "برای مثال...")
        ),
        listOf(
            GrammarSection("Question words", "What, Where, When, Who, Why, How, Which."),
            GrammarSection("Communication strategies", "What does... mean? How do you spell...? Can you repeat?")
        ),
        listOf(
            d("A", "What's this word?", "این کلمه چیه؟"),
            d("B", "Which word?", "کدام کلمه؟"),
            d("A", "This one. 'Beautiful'.", "این یکی. 'زیبا'."),
            d("B", "It means 'very nice'.", "معنی‌اش 'خیلی قشنگ' است."),
            d("A", "Can you give an example?", "می‌تونی مثال بزنی؟"),
            d("B", "The sunset is beautiful.", "غروب زیباست."),
            d("A", "I understand now. Thanks!", "الان فهمیدم. ممنون!"),
            d("B", "You're welcome. Any other words?", "خواهش می‌کنم. کلمه دیگه‌ای هست؟"),
            d("A", "What does 'amazing' mean?", "'Amazing' چه معنی می‌دهد؟"),
            d("B", "It means 'very surprising and good'.", "معنی‌اش 'خیلی غافلگیرکننده و خوب' است."),
            d("A", "Like your help!", "مثل کمک تو!"),
            d("B", "Exactly!", "دقیقاً!")
        ),
        listOf(
            q("What does 'beautiful' mean?", listOf("ugly", "very nice", "big"), 1),
            q("What does 'amazing' mean?", listOf("boring", "very good", "small"), 1),
            q("What ___ this word mean?", listOf("do", "does", "is"), 1),
            q("How do you ___ it?", listOf("spell", "spelling", "spelled"), 0)
        ),
        idioms = listOf(IdiomExpression("Exactly!", "دقیقاً!", "Exactly!", "دقیقاً!")),
        pron = listOf(PronunciationTip("Question words", "WHAT, WHERE, WHEN, WHO, WHY, HOW")),
        cult = listOf(CulturalNote("Communication", "Asking for clarification is important.")),
        mis = listOf(CommonMistake("What means this word?", "What does this word mean?", "Use 'does'."))
    )

    // ═══════════ PRACTICAL ENGLISH 3 ═══════════
    private fun pe3() = base(14, "PE3 In a clothing store", "انگلیسی کاربردی ۳ — در فروشگاه لباس",
        listOf("Shop for clothes", "Ask about sizes and prices", "Try on clothes"),
        listOf(
            v("size", "سایز", "What size?", "چه سایزی؟"),
            v("try on", "پرو کردن", "Can I try it on?", "می‌تونم پرو کنم؟", "verb"),
            v("fit", "اندازه بودن", "Does it fit?", "اندازه‌ست؟", "verb"),
            v("price", "قیمت", "What's the price?", "قیمتش چقدره؟"),
            v("cheap", "ارزان", "It's cheap.", "ارزونه.", "adjective"),
            v("expensive", "گران", "Too expensive.", "خیلی گران.", "adjective")
        ),
        listOf(
            GrammarSection("Shopping for clothes", "Can I try it on? What size are you? Does it fit?"),
            GrammarSection("Prices", "How much is it? It's $50.")
        ),
        listOf(
            d("A", "Can I try this shirt on?", "می‌تونم این پیراهن رو پرو کنم؟"),
            d("B", "Of course. What size are you?", "البته. چه سایزی هستی؟"),
            d("A", "Medium.", "متوسط."),
            d("B", "Here you are. How is it?", "بفرمایید. چطوره؟"),
            d("A", "It fits! How much is it?", "اندازه‌ست! چقدره؟"),
            d("B", "It's $45.", "۴۵ دلاره."),
            d("A", "That's a bit expensive.", "کمی گرونه."),
            d("B", "It's good quality.", "کیفیتش خوبه."),
            d("A", "OK, I'll take it.", "باشه، می‌خرمش."),
            d("B", "Great! Cash or card?", "عالی! نقد یا کارت؟"),
            d("A", "Card, please.", "کارت، لطفاً."),
            d("B", "Here's your receipt. Thank you!", "اینم رسیدتون. ممنون!")
        ),
        listOf(
            q("What size is A?", listOf("small", "medium", "large"), 1),
            q("How much is the shirt?", listOf("$35", "$45", "$55"), 1),
            q("Can I ___ it on?", listOf("try", "fit", "buy"), 0),
            q("Does it ___?", listOf("fit", "fit on", "fits"), 0)
        ),
        idioms = listOf(
            IdiomExpression("I'll take it", "می‌خرمش", "I'll take it.", "می‌خرمش."),
            IdiomExpression("Cash or card?", "نقد یا کارت؟", "Cash or card?", "نقد یا کارت؟")
        ),
        pron = listOf(PronunciationTip("Sizes", "small, medium, large")),
        cult = listOf(CulturalNote("Sizes", "US 6 = UK 10 = EU 36.")),
        mis = listOf(CommonMistake("I want try.", "Can I try it on?", "Complete phrase."))
    )

    // ═══════════ REVIEW 3 ═══════════
    private fun rc56() = base(15, "R&C 5&6", "مرور ۵ و ۶",
        listOf("Review going to", "Review present continuous future", "Review shopping"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Going to", "I'm going to travel."),
            GrammarSection("Present continuous future", "I'm meeting Tom tomorrow."),
            GrammarSection("Shopping", "Can I try it on? How much is it?")
        ),
        listOf(
            d("T", "Review time! Files 5-6.", "وقت مرور! فایل‌های ۵-۶."),
            d("A", "I'm going to travel.", "I'm going to travel."),
            d("B", "I'm meeting Tom tomorrow.", "I'm meeting Tom tomorrow."),
            d("T", "Shopping?", "خرید؟"),
            d("A", "Can I try it on? How much is it?", "Can I try it on? How much is it?"),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("I ___ going to travel.", listOf("am", "is", "are"), 0),
            q("I ___ meeting Tom tomorrow.", listOf("am", "is", "are"), 0),
            q("Can I ___ it on?", listOf("try", "fit", "buy"), 0),
            q("Does it ___?", listOf("fit", "fit on", "fits"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Going to", "Gonna in fast speech.")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I going to travel.", "I'm going to travel.", "Add 'am'."))
    )

    // ═══════════ FILE 4 ═══════════
    private fun f4A() = base(16, "4A Parents and teenagers", "۴A والدین و نوجوانان",
        listOf("Use have/has got", "Talk about possessions", "Use question forms"),
        listOf(
            v("have got", "داشتن", "I've got a car.", "ماشین دارم.", "verb"),
            v("has got", "دارد", "She's got a dog.", "سگ داره.", "verb"),
            v("parents", "والدین", "My parents are nice.", "والدینم خوبن."),
            v("teenager", "نوجوان", "A teenager.", "یک نوجوان."),
            v("car", "ماشین", "A new car.", "ماشین جدید."),
            v("phone", "موبایل", "A new phone.", "موبایل جدید.")
        ),
        listOf(
            GrammarSection("Have got/Has got", "I've got, you've got, he's got, she's got."),
            GrammarSection("Questions with got", "Have you got...? Has she got...?")
        ),
        listOf(
            d("A", "Have you got a car?", "ماشین داری؟"),
            d("B", "Yes, I have. I've got a small car.", "بله. یک ماشین کوچک دارم."),
            d("A", "Has your sister got a car?", "خواهرت ماشین داره؟"),
            d("B", "No, she hasn't. She's got a bike.", "نه، نداره. دوچرخه داره."),
            d("A", "What about your parents?", "والدینت چطور؟"),
            d("B", "They've got two cars. A big one and a small one.", "دو ماشین دارن. یک بزرگ و یک کوچک."),
            d("A", "And you? Have you got a phone?", "و تو؟ موبایل داری؟"),
            d("B", "Of course! Everyone has got a phone.", "البته! همه موبایل دارن."),
            d("A", "Teenagers love phones!", "نوجوان‌ها عاشق موبایل هستن!"),
            d("B", "Yes, we do!", "بله، همینطوره!"),
            d("A", "I've got a new phone too.", "من هم موبایل جدید دارم."),
            d("B", "Nice!", "قشنگه!")
        ),
        listOf(
            q("Has B got a car?", listOf("no", "yes", "bike"), 1),
            q("What has B's sister got?", listOf("car", "bike", "phone"), 1),
            q("I ___ got a car.", listOf("have", "has", "am"), 0),
            q("She ___ got a dog.", listOf("have", "has", "is"), 1)
        ),
        idioms = listOf(IdiomExpression("Of course!", "البته!", "Of course!", "البته!")),
        pron = listOf(PronunciationTip("Have got", "I've got /aɪv ɡɒt/")),
        cult = listOf(CulturalNote("Teenagers", "Love phones everywhere.")),
        mis = listOf(CommonMistake("She have got a dog.", "She has got a dog.", "Use 'has'."))
    )

    private fun f4B() = base(17, "4B Fashion and shopping", "۴B مد و خرید",
        listOf("Use too/enough", "Talk about clothes", "Give opinions"),
        listOf(
            v("fashion", "مد", "Fashion is important.", "مد مهمه."),
            v("clothes", "لباس", "Nice clothes.", "لباس‌های قشنگ."),
            v("too", "خیلی", "Too big.", "خیلی بزرگ.", "adverb"),
            v("enough", "کافی", "Big enough.", "به اندازه کافی بزرگ.", "adverb"),
            v("style", "سبک", "Personal style.", "سبک شخصی."),
            v("wear", "پوشیدن", "I wear jeans.", "شلوار جین می‌پوشم.", "verb")
        ),
        listOf(
            GrammarSection("Too/Enough", "This is too big. That's not big enough."),
            GrammarSection("Clothes vocabulary", "shirt, dress, jacket, shoes, jeans, hat.")
        ),
        listOf(
            d("A", "Do you like fashion?", "مد دوست داری؟"),
            d("B", "Yes, I love clothes. I wear nice things.", "بله، عاشق لباسم. چیزهای قشنگ می‌پوشم."),
            d("A", "What's your style?", "سبکت چیه؟"),
            d("B", "Simple but elegant. I like black and white.", "ساده ولی شیک. مشکی و سفید دوست دارم."),
            d("A", "I like colors. Red, blue, green.", "من رنگ‌ها رو دوست دارم. قرمز، آبی، سبز."),
            d("B", "That's nice too. Do you shop a lot?", "اون هم خوبه. زیاد خرید می‌کنی؟"),
            d("A", "Sometimes. But clothes are too expensive.", "گاهی. ولی لباس‌ها خیلی گرونن."),
            d("B", "I know. I buy in sales.", "می‌دانم. در حراج می‌خرم."),
            d("A", "That's smart!", "هوشمندانه‌ست!"),
            d("B", "Yes, I love a good bargain.", "بله، عاشق خرید ارزونم."),
            d("A", "Me too!", "من هم!")
        ),
        listOf(
            q("What's B's style?", listOf("colorful", "simple elegant", "sporty"), 1),
            q("What colors does B like?", listOf("red & blue", "black & white", "green & yellow"), 1),
            q("It's ___ big.", listOf("too", "enough", "very"), 0),
            q("It's not big ___.", listOf("too", "enough", "very"), 1)
        ),
        idioms = listOf(IdiomExpression("A good bargain", "خرید ارزون", "I love a good bargain.", "عاشق خرید ارزونم.")),
        pron = listOf(PronunciationTip("Too/Enough", "too /tuː/, enough /ɪˈnʌf/")),
        cult = listOf(CulturalNote("Fashion", "Personal style varies.")),
        mis = listOf(CommonMistake("too much big", "too big", "Use 'too' + adjective."))
    )

    private fun f4C() = base(18, "4C Lost weekend", "۴C آخر هفته گمشده",
        listOf("Use past simple", "Talk about past events", "Use time expressions"),
        listOf(
            v("went", "رفت", "I went to the beach.", "به ساحل رفتم.", "verb"),
            v("saw", "دید", "I saw a movie.", "فیلمی دیدم.", "verb"),
            v("had", "داشت", "I had a great time.", "وقت خوبی داشتم.", "verb"),
            v("met", "ملاقات کرد", "I met friends.", "دوستان را دیدم.", "verb"),
            v("ate", "خورد", "I ate pizza.", "پیتزا خوردم.", "verb"),
            v("drank", "نوشید", "I drank coffee.", "قهوه نوشیدم.", "verb")
        ),
        listOf(
            GrammarSection("Past simple", "Regular: visited, worked. Irregular: went, saw, had, met, ate."),
            GrammarSection("Past time expressions", "yesterday, last night, last week, two days ago.")
        ),
        listOf(
            d("A", "How was your weekend?", "آخر هفته‌ات چطور بود؟"),
            d("B", "Great! I went to the beach.", "عالی! به ساحل رفتم."),
            d("A", "Nice. What did you do?", "خوبه. چیکار کردی؟"),
            d("B", "I swam and met some friends.", "شنا کردم و چند دوست دیدم."),
            d("A", "What did you eat?", "چی خوردی؟"),
            d("B", "We ate fish at a restaurant.", "در رستوران ماهی خوردیم."),
            d("A", "Sounds perfect!", "کامل به نظر می‌رسد!"),
            d("B", "It was! And you?", "بود! تو چطور؟"),
            d("A", "I stayed home and watched TV.", "خانه ماندم و تلویزیون تماشا کردم."),
            d("B", "That's relaxing too!", "اون هم آرامش‌بخشه!"),
            d("A", "Yes, I needed rest.", "بله، به استراحت نیاز داشتم."),
            d("B", "Weekends are for rest!", "آخر هفته‌ها برای استراحت هستن!")
        ),
        listOf(
            q("Where did B go?", listOf("mountains", "beach", "park"), 1),
            q("What did B eat?", listOf("pizza", "fish", "chicken"), 1),
            q("I ___ to the beach.", listOf("go", "went", "gone"), 1),
            q("She ___ her friends.", listOf("meet", "met", "meeting"), 1)
        ),
        idioms = listOf(IdiomExpression("Weekends are for rest", "آخر هفته‌ها برای استراحت", "Weekends are for rest!", "آخر هفته‌ها برای استراحت هستن!")),
        pron = listOf(PronunciationTip("Irregular past", "went, saw, had, met, ate")),
        cult = listOf(CulturalNote("Weekends", "People share stories.")),
        mis = listOf(CommonMistake("I goed.", "I went.", "Irregular."))
    )

    // ═══════════ PRACTICAL ENGLISH 4 ═══════════
    private fun pe4() = base(19, "PE4 Getting lost", "انگلیسی کاربردی ۴ — گم شدن",
        listOf("Ask for directions", "Give directions", "Use prepositions of place"),
        listOf(
            v("lost", "گم", "I'm lost.", "گم شده‌ام.", "adjective"),
            v("turn", "پیچیدن", "Turn left.", "به چپ بپیچ.", "verb"),
            v("straight", "مستقیم", "Go straight.", "مستقیم برو.", "adverb"),
            v("corner", "گوشه", "At the corner.", "در گوشه."),
            v("near", "نزدیک", "Near here.", "این نزدیکی.", "preposition"),
            v("far", "دور", "Is it far?", "دوره؟", "adverb")
        ),
        listOf(
            GrammarSection("Directions", "Turn left. Turn right. Go straight. Take the first right."),
            GrammarSection("Prepositions", "on, at, next to, opposite, between.")
        ),
        listOf(
            d("A", "Excuse me, I'm lost. Where's the museum?", "ببخشید، گم شده‌ام. موزه کجاست؟"),
            d("B", "Go straight down this street.", "این خیابان را مستقیم برو."),
            d("A", "Straight. OK.", "مستقیم. باشه."),
            d("B", "Then turn left at the traffic lights.", "بعد در چراغ راهنما به چپ بپیچ."),
            d("A", "Left at the lights.", "چپ در چراغ‌ها."),
            d("B", "The museum is on the right.", "موزه سمت راسته."),
            d("A", "Is it far?", "دوره؟"),
            d("B", "No, about 5 minutes on foot.", "نه، حدود ۵ دقیقه پیاده."),
            d("A", "Thank you so much!", "خیلی ممنون!"),
            d("B", "You're welcome. Enjoy the museum!", "خواهش می‌کنم. از موزه لذت ببر!"),
            d("A", "Thanks!", "ممنون!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Where's the museum?", listOf("left", "right", "straight"), 1),
            q("How long does it take?", listOf("2 min", "5 min", "10 min"), 1),
            q("Go ___ down the street.", listOf("straight", "straightly", "straighten"), 0),
            q("Turn ___ at the lights.", listOf("left", "left to", "to left"), 0)
        ),
        idioms = listOf(IdiomExpression("On foot", "پیاده", "5 minutes on foot.", "۵ دقیقه پیاده.")),
        pron = listOf(PronunciationTip("Directions", "TURN left. GO straight.")),
        cult = listOf(CulturalNote("Asking strangers", "Start with 'Excuse me'.")),
        mis = listOf(CommonMistake("Turn to left.", "Turn left.", "No 'to'."))
    )

    // ═══════════ REVIEW 4 ═══════════
    private fun rc78() = base(20, "R&C 7&8", "مرور ۷ و ۸",
        listOf("Review have got", "Review too/enough", "Review past simple"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Have got", "I've got, she's got."),
            GrammarSection("Too/Enough", "too big, big enough."),
            GrammarSection("Past simple", "went, saw, had, met.")
        ),
        listOf(
            d("T", "Review time! Files 7-8.", "وقت مرور! فایل‌های ۷-۸."),
            d("A", "I've got, she's got.", "I've got، she's got."),
            d("B", "Too big, big enough.", "Too big، big enough."),
            d("T", "Past simple?", "حال گذشته؟"),
            d("A", "I went, I saw, I had.", "I went، I saw، I had."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("I ___ got a car.", listOf("have", "has", "am"), 0),
            q("She ___ got a dog.", listOf("have", "has", "is"), 1),
            q("It's ___ big.", listOf("too", "enough", "very"), 0),
            q("I ___ to the beach.", listOf("go", "went", "gone"), 1)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Irregular past", "went, saw, had")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("She have got.", "She has got.", "Use 'has'."))
    )

    // ═══════════ FILE 5 ═══════════
    private fun f5A() = base(21, "5A No time for anything", "۵A وقت برای هیچی نیست",
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
            d("B", "I hope so!", "امیدوارم!"),
            d("A", "But I'm always busy. No time for anything.", "ولی همیشه شلوغم. وقت برای هیچی نیست."),
            d("B", "You should make time!", "باید وقت درست کنی!")
        ),
        listOf(
            q("Has B been to Japan?", listOf("no", "yes twice", "once"), 1),
            q("Has A been to Japan?", listOf("yes", "no", "maybe"), 1),
            q("Have you ever ___ to Japan?", listOf("be", "been", "being"), 1),
            q("I've ___ tried sushi.", listOf("ever", "never", "already"), 1)
        ),
        idioms = listOf(
            IdiomExpression("I hope so", "امیدوارم", "I hope so!", "امیدوارم!"),
            IdiomExpression("Make time", "وقت درست کردن", "You should make time!", "باید وقت درست کنی!")
        ),
        pron = listOf(PronunciationTip("I've", "/aɪv/")),
        cult = listOf(CulturalNote("Busy lives", "People are often busy.")),
        mis = listOf(CommonMistake("I've went.", "I've been.", "Past participle."))
    )

    private fun f5B() = base(22, "5B Superlative cities", "۵B شهرهای برتر",
        listOf("Use superlatives", "Compare cities", "Talk about places"),
        listOf(
            v("biggest", "بزرگ‌ترین", "The biggest city.", "بزرگ‌ترین شهر.", "adjective"),
            v("most beautiful", "زیباترین", "The most beautiful.", "زیباترین.", "adjective"),
            v("best", "بهترین", "The best.", "بهترین.", "adjective"),
            v("worst", "بدترین", "The worst.", "بدترین.", "adjective"),
            v("expensive", "گران", "Most expensive.", "گران‌ترین.", "adjective"),
            v("cheap", "ارزان", "Cheapest.", "ارزان‌ترین.", "adjective")
        ),
        listOf(
            GrammarSection("Superlatives", "the + -est / the most + adjective. the biggest, the most beautiful."),
            GrammarSection("Irregular", "good → the best, bad → the worst.")
        ),
        listOf(
            d("A", "What's the biggest city in the world?", "بزرگ‌ترین شهر جهان کجاست؟"),
            d("B", "Tokyo, I think. It's huge.", "توکیو، فکر می‌کنم. خیلی بزرگه."),
            d("A", "And the most beautiful?", "و زیباترین؟"),
            d("B", "Paris, for me. It's romantic.", "پاریس، برای من. رمانتیکه."),
            d("A", "What's the most expensive city?", "گران‌ترین شهر کجاست؟"),
            d("B", "Maybe New York or London.", "شاید نیویورک یا لندن."),
            d("A", "And the cheapest?", "و ارزان‌ترین؟"),
            d("B", "I don't know. Maybe Bangkok.", "نمی‌دانم. شاید بانکوک."),
            d("A", "What's the best city for food?", "بهترین شهر برای غذا کجاست؟"),
            d("B", "Rome! Italian food is the best.", "رم! غذای ایتالیایی بهترینه."),
            d("A", "I agree!", "موافقم!"),
            d("B", "Let's go together one day!", "بیا یک روز با هم بریم!")
        ),
        listOf(
            q("Biggest city?", listOf("Paris", "Tokyo", "New York"), 1),
            q("Best city for food?", listOf("Paris", "Rome", "London"), 1),
            q("Tokyo is the ___ city.", listOf("big", "bigger", "biggest"), 2),
            q("It's the ___ beautiful city.", listOf("more", "most", "much"), 1)
        ),
        idioms = listOf(IdiomExpression("Let's go together", "بیا با هم بریم", "Let's go together!", "بیا با هم بریم!")),
        pron = listOf(PronunciationTip("Superlatives", "the BIGgest, the MOST beautiful")),
        cult = listOf(CulturalNote("Cities", "Different characteristics.")),
        mis = listOf(CommonMistake("the most biggest", "the biggest", "No 'most' with -est."))
    )

    private fun f5C() = base(23, "5C How much is too much?", "۵C چقدر زیاده؟",
        listOf("Use quantifiers", "Talk about money", "Use too much/too many"),
        listOf(
            v("money", "پول", "How much money?", "چقدر پول؟"),
            v("too much", "خیلی زیاد", "Too much money.", "پول خیلی زیاد."),
            v("too many", "خیلی زیاد", "Too many people.", "افراد خیلی زیاد."),
            v("enough", "کافی", "Enough money.", "پول کافی."),
            v("expensive", "گران", "Too expensive.", "خیلی گران.", "adjective"),
            v("cheap", "ارزان", "Very cheap.", "خیلی ارزان.", "adjective")
        ),
        listOf(
            GrammarSection("Too much/Too many", "Too much + uncountable. Too many + countable."),
            GrammarSection("Enough", "Enough money. Enough people.")
        ),
        listOf(
            d("A", "How much money do you spend?", "چقدر پول خرج می‌کنی؟"),
            d("B", "Too much! Clothes are expensive.", "خیلی زیاد! لباس‌ها گرونن."),
            d("A", "Me too. I buy too many things.", "من هم. چیزهای خیلی زیاد می‌خرم."),
            d("B", "Do you have enough money?", "پول کافی داری؟"),
            d("A", "Sometimes. I work too much.", "گاهی. خیلی کار می‌کنم."),
            d("B", "That's not good. You need rest.", "خوبه نیست. به استراحت نیاز داری."),
            d("A", "I know. But everything is expensive.", "می‌دانم. ولی همه چیز گرونه."),
            d("B", "You're right. Life is expensive.", "حق با توست. زندگی گرونه."),
            d("A", "Let's be smart with money.", "بیا با پول هوشمند باشیم."),
            d("B", "Good idea!", "فکر خوبی!"),
            d("A", "No more shopping!", "دیگه خرید نه!"),
            d("B", "OK, no more!", "باشه، دیگه نه!")
        ),
        listOf(
            q("What does B spend too much on?", listOf("food", "clothes", "travel"), 1),
            q("Does B have enough money?", listOf("always", "sometimes", "never"), 1),
            q("Too ___ money.", listOf("many", "much", "enough"), 1),
            q("Too ___ people.", listOf("many", "much", "enough"), 0)
        ),
        idioms = listOf(IdiomExpression("No more shopping!", "دیگه خرید نه!", "No more shopping!", "دیگه خرید نه!")),
        pron = listOf(PronunciationTip("Too much/many", "too much /tuː mʌtʃ/, too many /tuː ˈmeni/")),
        cult = listOf(CulturalNote("Money", "Spending habits vary.")),
        mis = listOf(CommonMistake("too many money", "too much money", "Use 'much' with uncountable."))
    )

    // ═══════════ PRACTICAL ENGLISH 5 ═══════════
    private fun pe5() = base(24, "PE5 At a restaurant", "انگلیسی کاربردی ۵ — در رستوران",
        listOf("Order food", "Ask about menu items", "Ask for the bill"),
        listOf(
            v("menu", "منو", "Can I see the menu?", "می‌توانم منو را ببینم؟"),
            v("order", "سفارش", "Are you ready to order?", "آماده سفارش هستید؟", "verb"),
            v("bill", "صورت‌حساب", "The bill, please.", "صورت‌حساب لطفاً."),
            v("starter", "پیش‌غذا", "Soup for starters.", "سوپ برای پیش‌غذا."),
            v("main course", "غذای اصلی", "Chicken for main.", "مرغ برای اصلی."),
            v("dessert", "دسر", "Would you like dessert?", "دسر میل دارید؟")
        ),
        listOf(
            GrammarSection("Ordering", "I'll have... I'd like... Can I have...?"),
            GrammarSection("Polite requests", "Could I have...? Would you like...?")
        ),
        listOf(
            d("W", "Good evening. A table for two?", "عصر بخیر. میز برای دو نفر؟"),
            d("A", "Yes, please. Can we see the menu?", "بله. می‌توانیم منو را ببینیم؟"),
            d("W", "Here you are. Something to drink?", "بفرمایید. نوشیدنی؟"),
            d("A", "Still water, please.", "آب بدون گاز لطفاً."),
            d("B", "Sparkling for me.", "برای من گازدار."),
            d("W", "Are you ready to order?", "آماده سفارش؟"),
            d("A", "Yes. Soup for starters, then chicken.", "بله. سوپ برای پیش‌غذا، بعد مرغ."),
            d("B", "Vegetarian pasta, please.", "پاستای گیاهی لطفاً."),
            d("W", "Anything else?", "چیز دیگری؟"),
            d("A", "The bill, please.", "صورت‌حساب لطفاً."),
            d("W", "Here you are.", "بفرمایید."),
            d("B", "Thank you!", "ممنون!")
        ),
        listOf(
            q("B's main course?", listOf("chicken", "pasta", "salad"), 1),
            q("A's water?", listOf("still", "sparkling", "hot"), 0),
            q("I ___ have the soup.", listOf("will", "am", "do"), 0),
            q("Can we ___ the bill?", listOf("have", "has", "having"), 0)
        ),
        idioms = listOf(IdiomExpression("Here you are", "بفرمایید", "Here you are.", "بفرمایید.")),
        pron = listOf(PronunciationTip("Polite", "Could I have the MENU? ↗")),
        cult = listOf(CulturalNote("Tipping", "10-15% in UK.")),
        mis = listOf(CommonMistake("I want chicken.", "I'd like chicken.", "Polite: I'd like."))
    )

    // ═══════════ REVIEW 5 ═══════════
    private fun rc910() = base(25, "R&C 9&10", "مرور ۹ و ۱۰",
        listOf("Review present perfect", "Review superlatives", "Review quantifiers"),
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
            GrammarSection("Superlatives", "the biggest, the most beautiful."),
            GrammarSection("Quantifiers", "too much, too many, enough.")
        ),
        listOf(
            d("T", "Review time! Files 9-10.", "وقت مرور! فایل‌های ۹-۱۰."),
            d("A", "I've been, I've seen.", "I've been، I've seen."),
            d("B", "The biggest, the most beautiful.", "The biggest، the most beautiful."),
            d("T", "Quantifiers?", "کمیت‌ها؟"),
            d("A", "Too much, too many, enough.", "Too much، too many، enough."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("Have you ever ___ to Japan?", listOf("be", "been", "being"), 1),
            q("It's the ___ city.", listOf("big", "bigger", "biggest"), 2),
            q("Too ___ money.", listOf("many", "much", "enough"), 1),
            q("Too ___ people.", listOf("many", "much", "enough"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Superlatives", "the BIGgest, the MOST beautiful")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I've went.", "I've been.", "Past participle."))
    )

    // ═══════════ FILE 6 ═══════════
    private fun f6A() = base(26, "6A Are you a pessimist?", "۶A بدبین هستی؟",
        listOf("Use will/won't for predictions", "Talk about the future", "Use probably/maybe"),
        listOf(
            v("will", "خواهد", "I will travel.", "سفر خواهم کرد.", "verb"),
            v("won't", "نخواهد", "I won't go.", "نخواهم رفت.", "verb"),
            v("probably", "احتمالاً", "Probably will.", "احتمالاً خواهد.", "adverb"),
            v("maybe", "شاید", "Maybe tomorrow.", "شاید فردا.", "adverb"),
            v("future", "آینده", "The future.", "آینده."),
            v("predict", "پیش‌بینی", "Predict the future.", "آینده را پیش‌بینی کن.", "verb")
        ),
        listOf(
            GrammarSection("Will/Won't", "Predictions: It will rain. I won't go."),
            GrammarSection("Probably/Maybe", "Probably will. Maybe I'll go.")
        ),
        listOf(
            d("A", "Are you a pessimist or an optimist?", "بدبینی یا خوش‌بین؟"),
            d("B", "Optimist! I think good things will happen.", "خوش‌بین! فکر می‌کنم چیزهای خوب اتفاق می‌افتد."),
            d("A", "Will you travel this year?", "امسال سفر می‌کنی؟"),
            d("B", "Yes, probably. I'll go to Italy.", "بله، احتمالاً. به ایتالیا می‌روم."),
            d("A", "Will you learn Italian?", "ایتالیایی یاد می‌گیری؟"),
            d("B", "Maybe. But it's difficult.", "شاید. ولی سخته."),
            d("A", "I think you'll learn quickly.", "فکر می‌کنم سریع یاد می‌گیری."),
            d("B", "Thanks! What about you?", "ممنون! تو چطور؟"),
            d("A", "I won't travel. I'll work.", "سفر نمی‌کنم. کار می‌کنم."),
            d("B", "That's not fun!", "خوش نیست!"),
            d("A", "I know. But I need money.", "می‌دانم. ولی به پول نیاز دارم."),
            d("B", "Maybe next year!", "شاید سال بعد!")
        ),
        listOf(
            q("Is B an optimist?", listOf("no", "yes", "maybe"), 1),
            q("Where will B go?", listOf("France", "Italy", "Spain"), 1),
            q("I ___ travel this year.", listOf("will", "am", "do"), 0),
            q("I ___ go. Too busy.", listOf("won't", "don't", "not will"), 0)
        ),
        idioms = listOf(IdiomExpression("That's not fun", "خوش نیست", "That's not fun!", "خوش نیست!")),
        pron = listOf(PronunciationTip("Will", "I'll /aɪl/, won't /woʊnt/")),
        cult = listOf(CulturalNote("Optimism", "Attitude matters.")),
        mis = listOf(CommonMistake("I will to go.", "I will go.", "No 'to' after will."))
    )

    private fun f6B() = base(27, "6B I'll never forget you", "۶B هرگز فراموشت نمی‌کنم",
        listOf("Use will for promises", "Talk about memories", "Use never/always"),
        listOf(
            v("forget", "فراموش کردن", "I'll never forget.", "هرگز فراموش نمی‌کنم.", "verb"),
            v("remember", "به یاد آوردن", "I remember.", "به یاد می‌آورم.", "verb"),
            v("promise", "قول دادن", "I promise.", "قول می‌دهم.", "verb"),
            v("always", "همیشه", "I'll always love you.", "همیشه دوستت خواهم داشت.", "adverb"),
            v("never", "هرگز", "I'll never forget.", "هرگز فراموش نمی‌کنم.", "adverb"),
            v("memory", "خاطره", "A good memory.", "خاطره خوب.")
        ),
        listOf(
            GrammarSection("Will for promises", "I'll always remember. I'll never forget."),
            GrammarSection("Never/Always", "Position: before main verb.")
        ),
        listOf(
            d("A", "I'm leaving tomorrow.", "فردا می‌روم."),
            d("B", "I'll miss you! I'll never forget you.", "دلتنگت می‌شم! هرگز فراموشت نمی‌کنم."),
            d("A", "Me neither. We had great times.", "من هم. اوقات خوبی داشتیم."),
            d("B", "Remember the trip to Paris?", "سفر پاریس یادت هست؟"),
            d("A", "Of course! I'll always remember it.", "البته! همیشه به یادش خواهم داشت."),
            d("B", "I'll send you photos.", "عکس‌ها را برایت می‌فرستم."),
            d("A", "Please do! I'll always answer.", "لطفاً بفرست! همیشه جواب می‌دهم."),
            d("B", "Promise?", "قول می‌دهی؟"),
            d("A", "I promise!", "قول می‌دهم!"),
            d("B", "Good luck in your new city!", "موفق باشی در شهر جدیدت!"),
            d("A", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where did they travel?", listOf("Rome", "Paris", "London"), 1),
            q("Will B send photos?", listOf("no", "yes", "maybe"), 1),
            q("I'll ___ forget you.", listOf("ever", "never", "always"), 1),
            q("I'll ___ remember.", listOf("ever", "never", "always"), 2)
        ),
        idioms = listOf(IdiomExpression("Good luck", "موفق باشی", "Good luck!", "موفق باشی!")),
        pron = listOf(PronunciationTip("I'll", "/aɪl/")),
        cult = listOf(CulturalNote("Friendship", "Lasting connections.")),
        mis = listOf(CommonMistake("I'll never to forget.", "I'll never forget.", "No 'to'."))
    )

    private fun f6C() = base(28, "6C The meaning of dreaming", "۶C معنای رؤیا دیدن",
        listOf("Use first conditional", "Talk about possibilities", "Use if/will"),
        listOf(
            v("if", "اگر", "If you go...", "اگر بروی...", "conjunction"),
            v("will", "خواهد", "You'll love it.", "عاشقش می‌شوی.", "verb"),
            v("dream", "رؤیا", "I had a dream.", "رؤیا دیدم."),
            v("mean", "معنی دادن", "What does it mean?", "چه معنی می‌دهد؟", "verb"),
            v("future", "آینده", "The future.", "آینده."),
            v("maybe", "شاید", "Maybe.", "شاید.", "adverb")
        ),
        listOf(
            GrammarSection("First conditional", "If + present simple, will + verb. If it rains, we'll stay home."),
            GrammarSection("Possibilities", "If you dream about water, you'll have good luck.")
        ),
        listOf(
            d("A", "I had a strange dream.", "رؤیای عجیبی دیدم."),
            d("B", "What did you dream about?", "درباره چی رؤیا دیدی؟"),
            d("A", "Water. A big ocean.", "آب. اقیانوس بزرگ."),
            d("B", "If you dream about water, you'll have good luck.", "اگر درباره آب رؤیا ببینی، شانس میاری."),
            d("A", "Really? That's good!", "واقعاً؟ خوبه!"),
            d("B", "Yes! It means good things will happen.", "بله! یعنی چیزهای خوب اتفاق می‌افتد."),
            d("A", "I hope so! If I get a new job, I'll be happy.", "امیدوارم! اگر شغل جدیدی بگیرم، خوشحال می‌شم."),
            d("B", "You will! I'm sure.", "می‌گیری! مطمئنم."),
            d("A", "If I get the job, I'll buy a car.", "اگر شغل رو بگیرم، ماشین می‌خرم."),
            d("B", "And if you don't?", "و اگر نگیری؟"),
            d("A", "I'll try again! Never give up!", "دوباره تلاش می‌کنم! هرگز تسلیم نمی‌شم!"),
            d("B", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("What did A dream about?", listOf("fire", "water", "mountains"), 1),
            q("What does it mean?", listOf("bad luck", "good luck", "nothing"), 1),
            q("If it ___, we'll stay home.", listOf("rain", "rains", "rained"), 1),
            q("If I ___ the job, I'll buy a car.", listOf("get", "gets", "got"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Never give up", "هرگز تسلیم نشو", "Never give up!", "هرگز تسلیم نشو!"),
            IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")
        ),
        pron = listOf(PronunciationTip("First conditional", "Rise on if-clause, fall on main.")),
        cult = listOf(CulturalNote("Dreams", "Interpreted in many cultures.")),
        mis = listOf(CommonMistake("If you will go", "If you go", "No 'will' in if-clause."))
    )

    // ═══════════ PRACTICAL ENGLISH 6 ═══════════
    private fun pe6() = base(29, "PE6 Going home", "انگلیسی کاربردی ۶ — بازگشت به خانه",
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
            d("A", "Is this your last day?", "آخرین روزته؟"),
            d("B", "Yes. I'm going home tomorrow.", "بله. فردا به خانه می‌روم."),
            d("A", "We'll miss you!", "دلتنگت می‌شویم!"),
            d("B", "Me too. You've all been great.", "من هم. همه‌تان عالی بودید."),
            d("A", "Keep in touch!", "در تماس باش!"),
            d("B", "Of course. Email me anytime.", "البته. هر وقت ایمیل بزن."),
            d("A", "Good luck with everything!", "موفق باشی در همه چیز!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye! Take care!", "خداحافظ! مراقب خودت باش!"),
            d("A", "You too!", "تو هم!"),
            d("B", "Thanks!", "ممنون!")
        ),
        listOf(
            q("When is B going home?", listOf("today", "tomorrow", "next week"), 1),
            q("What will B do?", listOf("stay", "go home", "travel"), 1),
            q("I'll ___ you.", listOf("miss", "missing", "missed"), 0),
            q("Keep in ___!", listOf("touch", "talk", "contact"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Good luck!", "موفق باشی!", "Good luck!", "موفق باشی!"),
            IdiomExpression("Take care", "مراقب خودت باش", "Take care!", "مراقب خودت باش!")
        ),
        pron = listOf(PronunciationTip("Goodbye", "Rising: See you SOON ↗")),
        cult = listOf(CulturalNote("Goodbyes", "Hug or handshake varies.")),
        mis = listOf(CommonMistake("I'll miss to you.", "I'll miss you.", "No 'to'."))
    )

    // ═══════════ REVIEW 6 ═══════════
    private fun rc1112() = base(30, "R&C 11&12", "مرور ۱۱ و ۱۲",
        listOf("Review will/won't", "Review first conditional", "Review farewells"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Will/Won't", "I will. I won't."),
            GrammarSection("First conditional", "If it rains, we'll stay."),
            GrammarSection("Farewells", "Goodbye, good luck, keep in touch.")
        ),
        listOf(
            d("T", "Review time! Files 11-12.", "وقت مرور! فایل‌های ۱۱-۱۲."),
            d("A", "I will, I won't.", "I will، I won't."),
            d("B", "If it rains, we'll stay.", "If it rains, we'll stay."),
            d("T", "Farewells?", "خداحافظی‌ها؟"),
            d("A", "Goodbye, good luck, keep in touch.", "Goodbye، good luck، keep in touch."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("I ___ travel this year.", listOf("will", "am", "do"), 0),
            q("If it ___, we'll stay.", listOf("rain", "rains", "rained"), 1),
            q("I'll ___ you.", listOf("miss", "missing", "missed"), 0),
            q("Keep in ___!", listOf("touch", "talk", "contact"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Contractions", "I'll, I won't")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I will to go.", "I will go.", "No 'to' after will."))
    )

    // ═══════════ FILE 7 ═══════════
    private fun f7A() = base(31, "7A How to...", "۷A چطور...",
        listOf("Use imperatives", "Give instructions", "Use sequencing words"),
        listOf(
            v("first", "اول", "First, do this.", "اول، این کار را بکن."),
            v("then", "بعد", "Then, do that.", "بعد، آن کار را بکن."),
            v("next", "سپس", "Next, add water.", "سپس، آب اضافه کن."),
            v("finally", "در نهایت", "Finally, mix.", "در نهایت، مخلوط کن."),
            v("mix", "مخلوط کردن", "Mix the eggs.", "تخم‌مرغ‌ها را مخلوط کن.", "verb"),
            v("add", "اضافه کردن", "Add sugar.", "شکر اضافه کن.", "verb")
        ),
        listOf(
            GrammarSection("Imperatives", "Open the door. Don't close it. Mix the eggs."),
            GrammarSection("Sequencing", "First, then, next, after that, finally.")
        ),
        listOf(
            d("A", "How do you make a cake?", "چطور کیک درست می‌کنی؟"),
            d("B", "First, mix the eggs and sugar.", "اول، تخم‌مرغ‌ها و شکر را مخلوط کن."),
            d("A", "Then?", "بعد؟"),
            d("B", "Then add flour and milk. Mix well.", "بعد آرد و شیر اضافه کن. خوب مخلوط کن."),
            d("A", "Next?", "سپس؟"),
            d("B", "Next, put it in the oven.", "سپس، در فر بگذار."),
            d("A", "How long?", "چقدر؟"),
            d("B", "Thirty minutes. Finally, add chocolate.", "سی دقیقه. در نهایت، شکلات اضافه کن."),
            d("A", "Sounds easy!", "آسون به نظر می‌رسد!"),
            d("B", "It is! Try it!", "هست! امتحان کن!"),
            d("A", "I will!", "امتحان می‌کنم!"),
            d("B", "Good luck!", "موفق باشی!")
        ),
        listOf(
            q("First step?", listOf("mix eggs/sugar", "add flour", "bake"), 0),
            q("How long in oven?", listOf("15 min", "30 min", "45 min"), 1),
            q("___ the eggs.", listOf("Mix", "Mixing", "Mixed"), 0),
            q("___ add flour.", listOf("Then", "Than", "That"), 0)
        ),
        idioms = listOf(IdiomExpression("Sounds easy", "آسون به نظر می‌رسد", "Sounds easy!", "آسون به نظر می‌رسد!")),
        pron = listOf(PronunciationTip("Imperatives", "Falling: MIX the eggs.")),
        cult = listOf(CulturalNote("Recipes", "Differ by culture.")),
        mis = listOf(CommonMistake("Don't to open.", "Don't open.", "No 'to'."))
    )

    private fun f7B() = base(32, "7B Being happy", "۷B شاد بودن",
        listOf("Talk about happiness", "Use gerunds", "Express feelings"),
        listOf(
            v("happy", "خوشحال", "I'm happy.", "خوشحالم.", "adjective"),
            v("happiness", "خوشحالی", "Happiness is important.", "خوشحالی مهمه."),
            v("enjoy", "لذت بردن", "I enjoy reading.", "از خواندن لذت می‌برم.", "verb"),
            v("love", "دوست داشتن", "I love music.", "موسیقی دوست دارم.", "verb"),
            v("like", "دوست داشتن", "I like swimming.", "شنا دوست دارم.", "verb"),
            v("feel", "احساس کردن", "I feel good.", "احساس خوبی دارم.", "verb")
        ),
        listOf(
            GrammarSection("Gerunds after verbs", "I enjoy reading. I love swimming. I like cooking."),
            GrammarSection("Feelings", "I'm happy. I feel good. I love it.")
        ),
        listOf(
            d("A", "What makes you happy?", "چی خوشحالت می‌کنه؟"),
            d("B", "Many things. I enjoy reading and walking.", "چیزهای زیاد. از خواندن و قدم زدن لذت می‌برم."),
            d("A", "Me too. I love music and dancing.", "من هم. عاشق موسیقی و رقصم."),
            d("B", "Do you like cooking?", "آشپزی دوست داری؟"),
            d("A", "Yes, I enjoy cooking for friends.", "بله، از آشپزی برای دوستان لذت می‌برم."),
            d("B", "That's nice. I like eating, not cooking!", "خوبه. من خوردن رو دوست دارم، نه آشپزی!"),
            d("A", "Ha! That's funny.", "ها! بامزه‌ست."),
            d("B", "Happiness is simple things.", "خوشحالی چیزهای ساده‌ست."),
            d("A", "I agree. Family, friends, health.", "موافقم. خانواده، دوستان، سلامتی."),
            d("B", "Exactly!", "دقیقاً!"),
            d("A", "And good food!", "و غذای خوب!"),
            d("B", "Of course!", "البته!")
        ),
        listOf(
            q("What does B enjoy?", listOf("cooking", "reading/walking", "dancing"), 1),
            q("What does A love?", listOf("reading", "music/dancing", "cooking"), 1),
            q("I enjoy ___.", listOf("read", "reading", "to read"), 1),
            q("I love ___.", listOf("swim", "swimming", "to swim"), 1)
        ),
        idioms = listOf(IdiomExpression("Happiness is simple things", "خوشحالی چیزهای ساده است", "Happiness is simple things.", "خوشحالی چیزهای ساده‌ست.")),
        pron = listOf(PronunciationTip("Gerunds", "READing, SWIMming, COOKing")),
        cult = listOf(CulturalNote("Happiness", "Defined differently by everyone.")),
        mis = listOf(CommonMistake("I enjoy to read.", "I enjoy reading.", "Use gerund after enjoy."))
    )

    private fun f7C() = base(33, "7C Learn a language in a month!", "۷C در یک ماه زبان یاد بگیر!",
        listOf("Use can/can't for ability", "Talk about learning", "Give advice"),
        listOf(
            v("learn", "یاد گرفتن", "Learn English.", "انگلیسی یاد بگیر.", "verb"),
            v("practice", "تمرین کردن", "Practice every day.", "هر روز تمرین کن.", "verb"),
            v("speak", "صحبت کردن", "Speak slowly.", "آهسته صحبت کن.", "verb"),
            v("listen", "گوش دادن", "Listen to music.", "به موسیقی گوش بده.", "verb"),
            v("read", "خواندن", "Read books.", "کتاب بخوان.", "verb"),
            v("write", "نوشتن", "Write emails.", "ایمیل بنویس.", "verb")
        ),
        listOf(
            GrammarSection("Can/Can't for ability", "I can speak English. She can't drive."),
            GrammarSection("Advice", "You should practice. You should listen.")
        ),
        listOf(
            d("A", "Can you speak Spanish?", "اسپانیایی صحبت می‌تونی؟"),
            d("B", "A little. I can understand more than I can speak.", "کمی. بیشتر می‌فهمم تا بتونم صحبت کنم."),
            d("A", "How did you learn?", "چطور یاد گرفتی؟"),
            d("B", "I practice every day. I listen to Spanish music.", "هر روز تمرین می‌کنم. به موسیقی اسپانیایی گوش می‌دهم."),
            d("A", "Can you read in Spanish?", "اسپانیایی می‌تونی بخونی؟"),
            d("B", "Yes, but slowly. I read children's books.", "بله، ولی آهسته. کتاب‌های کودکان می‌خوانم."),
            d("A", "That's smart! Can you write?", "هوشمندانه‌ست! می‌تونی بنویسی؟"),
            d("B", "Not very well. Writing is difficult.", "خیلی خوب نه. نوشتن سخته."),
            d("A", "You should practice writing too.", "باید نوشتن هم تمرین کنی."),
            d("B", "I know. But speaking is more fun!", "می‌دانم. ولی صحبت کردن سرگرم‌کننده‌تره!"),
            d("A", "True! Keep practicing!", "درسته! به تمرین ادامه بده!"),
            d("B", "I will!", "ادامه می‌دهم!")
        ),
        listOf(
            q("Can B speak Spanish?", listOf("fluently", "a little", "no"), 1),
            q("How does B practice?", listOf("reading", "music/listening", "writing"), 1),
            q("I ___ speak English.", listOf("can", "cans", "can to"), 0),
            q("She ___ drive.", listOf("can't", "don't can", "not can"), 0)
        ),
        idioms = listOf(IdiomExpression("Keep practicing", "به تمرین ادامه بده", "Keep practicing!", "به تمرین ادامه بده!")),
        pron = listOf(PronunciationTip("Can/Can't", "can /kæn/, can't /kænt/")),
        cult = listOf(CulturalNote("Language learning", "Practice is key.")),
        mis = listOf(CommonMistake("She cans swim.", "She can swim.", "No -s on modals."))
    )

    // ═══════════ PRACTICAL ENGLISH 7 ═══════════
    private fun pe7() = base(34, "PE7 Arriving in London", "انگلیسی کاربردی ۷ — ورود به لندن",
        listOf("Check into a hotel", "Ask for information", "Use polite requests"),
        listOf(
            v("reception", "پذیرش", "Go to reception.", "به پذیرش برو."),
            v("check in", "پذیرش شدن", "I'd like to check in.", "می‌خواهم پذیرش شوم.", "verb"),
            v("reservation", "رزرو", "I have a reservation.", "رزرو دارم."),
            v("key", "کلید", "Here's your key.", "این کلید شماست."),
            v("lift", "آسانسور", "Take the lift.", "آسانسور بگیر."),
            v("floor", "طبقه", "Third floor.", "طبقه سوم.")
        ),
        listOf(
            GrammarSection("Checking in", "I have a reservation. My name is..."),
            GrammarSection("Polite requests", "I'd like... Can I...? Could you...?")
        ),
        listOf(
            d("R", "Good evening. Can I help you?", "عصر بخیر. کمکی کنم؟"),
            d("G", "Yes, I have a reservation. My name is Kowalski.", "بله، رزرو دارم. نامم کوالسکی است."),
            d("R", "How do you spell that?", "چطور هجی می‌کنید؟"),
            d("G", "K-O-W-A-L-S-K-I.", "ک-و-ا-ل-س-ک-ی."),
            d("R", "Can I see your passport?", "پاسپورتتان؟"),
            d("G", "Here you are.", "بفرمایید."),
            d("R", "Thank you. You're in room 305.", "ممنون. اتاق ۳۰۵."),
            d("G", "Is breakfast included?", "صبحانه شامل می‌شود؟"),
            d("R", "Yes, from 7 to 10.", "بله، از ۷ تا ۱۰."),
            d("G", "Where's the lift?", "آسانسور کجاست؟"),
            d("R", "On the left. Enjoy your stay!", "سمت چپ. اقامت خوبی داشته باشید!"),
            d("G", "Thank you!", "ممنون!")
        ),
        listOf(
            q("What room is the guest in?", listOf("305", "350", "503"), 0),
            q("What time is breakfast?", listOf("6-9", "7-10", "8-11"), 1),
            q("I have a ___.", listOf("reservation", "reserve", "reserving"), 0),
            q("Can I ___ your passport?", listOf("see", "seeing", "saw"), 0)
        ),
        idioms = listOf(IdiomExpression("Enjoy your stay", "اقامت خوبی داشته باشید", "Enjoy your stay!", "اقامت خوبی داشته باشید!")),
        pron = listOf(PronunciationTip("Polite", "Can I SEE your PASSPORT? ↗")),
        cult = listOf(CulturalNote("Hotel", "Need ID to check in.")),
        mis = listOf(CommonMistake("I have reservation.", "I have a reservation.", "Add 'a'."))
    )

    // ═══════════ REVIEW 7 ═══════════
    private fun rc1314() = base(35, "R&C 13&14", "مرور ۱۳ و ۱۴",
        listOf("Review imperatives", "Review gerunds", "Review can/can't"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Imperatives", "Mix the eggs. Don't close."),
            GrammarSection("Gerunds", "I enjoy reading. I love swimming."),
            GrammarSection("Can/Can't", "I can swim. She can't drive.")
        ),
        listOf(
            d("T", "Review time! Files 13-14.", "وقت مرور! فایل‌های ۱۳-۱۴."),
            d("A", "Mix the eggs. Don't close.", "Mix the eggs. Don't close."),
            d("B", "I enjoy reading. I love swimming.", "I enjoy reading. I love swimming."),
            d("T", "Can/Can't?", "Can/Can't؟"),
            d("A", "I can swim. She can't drive.", "I can swim. She can't drive."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("___ the eggs.", listOf("Mix", "Mixing", "Mixed"), 0),
            q("I enjoy ___.", listOf("read", "reading", "to read"), 1),
            q("She ___ swim.", listOf("can", "cans", "can to"), 0),
            q("I ___ dance.", listOf("can't", "don't can", "not can"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Gerunds", "READing, SWIMming")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I enjoy to read.", "I enjoy reading.", "Use gerund."))
    )

    // ═══════════ FILE 8 ═══════════
    private fun f8A() = base(36, "8A I don't know what to do!", "۸A نمی‌دانم چیکار کنم!",
        listOf("Use should/shouldn't", "Give advice", "Talk about problems"),
        listOf(
            v("should", "باید", "You should rest.", "باید استراحت کنی.", "verb"),
            v("shouldn't", "نباید", "You shouldn't work.", "نباید کار کنی.", "verb"),
            v("advice", "توصیه", "Give advice.", "توصیه بده."),
            v("problem", "مشکل", "A big problem.", "مشکل بزرگ."),
            v("help", "کمک کردن", "Can you help?", "می‌تونی کمک کنی؟", "verb"),
            v("worry", "نگران بودن", "Don't worry.", "نگران نباش.", "verb")
        ),
        listOf(
            GrammarSection("Should/Shouldn't", "You should rest. You shouldn't work so much."),
            GrammarSection("Giving advice", "You should... You shouldn't... Why don't you...?")
        ),
        listOf(
            d("A", "I don't know what to do. I'm so tired.", "نمی‌دانم چیکار کنم. خیلی خسته‌ام."),
            d("B", "You should rest. You work too much.", "باید استراحت کنی. خیلی کار می‌کنی."),
            d("A", "But I have so much work!", "ولی کار خیلی زیاد دارم!"),
            d("B", "You shouldn't work on weekends.", "نباید آخر هفته‌ها کار کنی."),
            d("A", "I know. But I need money.", "می‌دانم. ولی به پول نیاز دارم."),
            d("B", "You should talk to your boss.", "باید با رئیست صحبت کنی."),
            d("A", "Maybe. What should I say?", "شاید. چی بگم؟"),
            d("B", "Say you need help. Don't worry alone.", "بگو به کمک نیاز داری. تنها نگران نباش."),
            d("A", "You're right. Thanks!", "حق با توست. ممنون!"),
            d("B", "You should also take a holiday.", "باید یک تعطیلات هم بگیری."),
            d("A", "Good idea! A beach holiday!", "فکر خوبی! یک تعطیلات ساحلی!"),
            d("B", "Perfect!", "عالی!")
        ),
        listOf(
            q("What's A's problem?", listOf("money", "tired from work", "family"), 1),
            q("What should A do?", listOf("work more", "talk to boss", "quit"), 1),
            q("You ___ rest.", listOf("should", "should to", "are"), 0),
            q("You ___ work so much.", listOf("shouldn't", "don't should", "not should"), 0)
        ),
        idioms = listOf(IdiomExpression("Don't worry", "نگران نباش", "Don't worry.", "نگران نباش.")),
        pron = listOf(PronunciationTip("Should", "should /ʃʊd/, shouldn't /ˈʃʊdnt/")),
        cult = listOf(CulturalNote("Work-life balance", "Important everywhere.")),
        mis = listOf(CommonMistake("You should to rest.", "You should rest.", "No 'to'."))
    )

    private fun f8B() = base(37, "8B If something can go wrong...", "۸B اگر چیزی خراب شود...",
        listOf("Use first conditional", "Talk about possibilities", "Use if/will"),
        listOf(
            v("if", "اگر", "If it rains...", "اگر باران بیاید...", "conjunction"),
            v("will", "خواهد", "We'll stay.", "می‌مانیم.", "verb"),
            v("wrong", "اشتباه", "Go wrong.", "خراب شدن.", "adjective"),
            v("problem", "مشکل", "A problem.", "مشکل."),
            v("plan", "برنامه", "A plan.", "برنامه."),
            v("backup", "پشتیبان", "A backup plan.", "برنامه پشتیبان.")
        ),
        listOf(
            GrammarSection("First conditional", "If + present, will + verb. If it rains, we'll stay home."),
            GrammarSection("Problems", "If something goes wrong, we'll have a backup plan.")
        ),
        listOf(
            d("A", "What's the plan for the trip?", "برنامه سفر چیه؟"),
            d("B", "If the weather is good, we'll go to the beach.", "اگر هوا خوب باشد، به ساحل می‌رویم."),
            d("A", "And if it rains?", "و اگر باران بیاید؟"),
            d("B", "If it rains, we'll visit the museum.", "اگر باران بیاید، موزه می‌رویم."),
            d("A", "What if something goes wrong?", "اگر چیزی خراب شود؟"),
            d("B", "We'll have a backup plan. Don't worry.", "برنامه پشتیبان داریم. نگران نباش."),
            d("A", "What's the backup plan?", "برنامه پشتیبان چیه؟"),
            d("B", "If we get lost, we'll call a taxi.", "اگر گم شویم، تاکسی می‌گیریم."),
            d("A", "Good. And if we miss the train?", "خوبه. و اگر قطار را از دست بدهیم؟"),
            d("B", "We'll take the next one. No problem!", "بعدی را می‌گیریم. مشکلی نیست!"),
            d("A", "You're very organized!", "خیلی منظمی!"),
            d("B", "Always prepared!", "همیشه آماده!")
        ),
        listOf(
            q("If weather is good?", listOf("museum", "beach", "stay home"), 1),
            q("If it rains?", listOf("beach", "museum", "stay home"), 1),
            q("If it ___, we'll stay home.", listOf("rain", "rains", "rained"), 1),
            q("If we ___ lost, we'll call a taxi.", listOf("get", "gets", "got"), 0)
        ),
        idioms = listOf(IdiomExpression("Always prepared", "همیشه آماده", "Always prepared!", "همیشه آماده!")),
        pron = listOf(PronunciationTip("First conditional", "Rise on if-clause, fall on main.")),
        cult = listOf(CulturalNote("Planning", "Important for trips.")),
        mis = listOf(CommonMistake("If it will rain", "If it rains", "No 'will' in if-clause."))
    )

    private fun f8C() = base(38, "8C You must be mine", "۸C باید مال من باشی",
        listOf("Use must/mustn't", "Talk about rules", "Express obligation"),
        listOf(
            v("must", "باید", "You must go.", "باید بروی.", "verb"),
            v("mustn't", "نباید", "You mustn't smoke.", "نباید سیگار بکشی.", "verb"),
            v("rule", "قانون", "A rule.", "قانون."),
            v("allowed", "مجاز", "Not allowed.", "مجاز نیست.", "adjective"),
            v("forbidden", "ممنوع", "Forbidden.", "ممنوع.", "adjective"),
            v("obligation", "الزام", "An obligation.", "الزام.")
        ),
        listOf(
            GrammarSection("Must/Mustn't", "Must = obligation. Mustn't = prohibition."),
            GrammarSection("Rules", "You must wear a seatbelt. You mustn't park here.")
        ),
        listOf(
            d("A", "What are the rules here?", "قوانین اینجا چیه؟"),
            d("B", "You must wear a seatbelt in the car.", "باید در ماشین کمربند ببندی."),
            d("A", "And in the museum?", "و در موزه؟"),
            d("B", "You mustn't touch anything. You must be quiet.", "نباید چیزی را لمس کنی. باید ساکت باشی."),
            d("A", "Can I take photos?", "می‌تونم عکس بگیرم؟"),
            d("B", "No, photos are forbidden.", "نه، عکس ممنوعه."),
            d("A", "What about food?", "غذا چطور؟"),
            d("B", "You mustn't eat inside. But there's a cafe.", "نباید داخل غذا بخوری. ولی کافه هست."),
            d("A", "OK. Any other rules?", "باشه. قانون دیگه‌ای؟"),
            d("B", "You must keep your phone silent.", "باید موبایلت را سایلنت کنی."),
            d("A", "Got it. Thanks!", "فهمیدم. ممنون!"),
            d("B", "Enjoy your visit!", "از بازدیدت لذت ببر!")
        ),
        listOf(
            q("Must you wear a seatbelt?", listOf("no", "yes", "maybe"), 1),
            q("Can you take photos?", listOf("yes", "no", "outside"), 1),
            q("You ___ be quiet.", listOf("must", "mustn't", "don't have to"), 0),
            q("You ___ smoke here.", listOf("must", "mustn't", "don't have to"), 1)
        ),
        idioms = listOf(IdiomExpression("Got it", "فهمیدم", "Got it.", "فهمیدم.")),
        pron = listOf(PronunciationTip("Must", "must /mʌst/, mustn't /ˈmʌsnt/")),
        cult = listOf(CulturalNote("Rules", "Public places have rules.")),
        mis = listOf(CommonMistake("You must to go.", "You must go.", "No 'to'."))
    )

    // ═══════════ PRACTICAL ENGLISH 8 ═══════════
    private fun pe8() = base(39, "PE8 At a coffee shop", "انگلیسی کاربردی ۸ — در کافه",
        listOf("Order food and drinks", "Use polite requests", "Ask about the menu"),
        listOf(
            v("menu", "منو", "Can I see the menu?", "می‌توانم منو را ببینم؟"),
            v("order", "سفارش", "Ready to order?", "آماده سفارش؟", "verb"),
            v("coffee", "قهوه", "A coffee, please.", "یک قهوه، لطفاً."),
            v("tea", "چای", "A tea, please.", "یک چای، لطفاً."),
            v("cake", "کیک", "A piece of cake.", "یک تکه کیک."),
            v("bill", "صورت‌حساب", "The bill, please.", "صورت‌حساب لطفاً.")
        ),
        listOf(
            GrammarSection("Ordering", "I'd like... Can I have...? A coffee, please."),
            GrammarSection("Polite requests", "Could I have...? Would you like...?")
        ),
        listOf(
            d("W", "Good morning. Can I help you?", "صبح بخیر. کمکی کنم؟"),
            d("A", "Yes, I'd like a coffee, please.", "بله، یک قهوه لطفاً."),
            d("W", "Small or large?", "کوچک یا بزرگ؟"),
            d("A", "Large, please. And a piece of cake.", "بزرگ، لطفاً. و یک تکه کیک."),
            d("W", "Chocolate or vanilla?", "شکلاتی یا وانیلی؟"),
            d("A", "Chocolate, please.", "شکلاتی، لطفاً."),
            d("W", "Anything else?", "چیز دیگری؟"),
            d("A", "No, thanks. How much is it?", "نه، ممنون. چقدره؟"),
            d("W", "That's $8.50.", "۸.۵۰ دلار."),
            d("A", "Here you are.", "بفرمایید."),
            d("W", "Thank you. Enjoy!", "ممنون. لذت ببرید!"),
            d("A", "Thanks!", "ممنون!")
        ),
        listOf(
            q("What does A order?", listOf("tea", "coffee and cake", "sandwich"), 1),
            q("How much is it?", listOf("$5", "$8.50", "$10"), 1),
            q("I'd ___ a coffee.", listOf("like", "likes", "liking"), 0),
            q("Can I ___ the menu?", listOf("see", "seeing", "saw"), 0)
        ),
        idioms = listOf(IdiomExpression("Anything else?", "چیز دیگری؟", "Anything else?", "چیز دیگری؟")),
        pron = listOf(PronunciationTip("Polite", "I'd like /aɪd laɪk/")),
        cult = listOf(CulturalNote("Coffee shops", "Common in many countries.")),
        mis = listOf(CommonMistake("I want coffee.", "I'd like a coffee.", "Use 'I'd like'."))
    )

    // ═══════════ REVIEW 8 ═══════════
    private fun rc1516() = base(40, "R&C 15&16", "مرور ۱۵ و ۱۶",
        listOf("Review should", "Review first conditional", "Review must"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Should/Shouldn't", "You should rest. You shouldn't work."),
            GrammarSection("First conditional", "If it rains, we'll stay."),
            GrammarSection("Must/Mustn't", "You must wear a seatbelt. You mustn't smoke.")
        ),
        listOf(
            d("T", "Review time! Files 15-16.", "وقت مرور! فایل‌های ۱۵-۱۶."),
            d("A", "You should rest. You shouldn't work.", "You should rest. You shouldn't work."),
            d("B", "If it rains, we'll stay.", "If it rains, we'll stay."),
            d("T", "Must/Mustn't?", "Must/Mustn't؟"),
            d("A", "You must wear a seatbelt. You mustn't smoke.", "You must wear a seatbelt. You mustn't smoke."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("You ___ rest.", listOf("should", "should to", "are"), 0),
            q("If it ___, we'll stay.", listOf("rain", "rains", "rained"), 1),
            q("You ___ smoke here.", listOf("must", "mustn't", "don't have to"), 1),
            q("You ___ be quiet.", listOf("must", "mustn't", "don't have to"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Should/Must", "should /ʃʊd/, must /mʌst/")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("You should to rest.", "You should rest.", "No 'to'."))
    )

    // ═══════════ FILE 9 ═══════════
    private fun f9A() = base(41, "9A What would you do?", "۹A چیکار می‌کردی؟",
        listOf("Use would for hypotheticals", "Talk about imaginary situations", "Give opinions"),
        listOf(
            v("would", "خواهد", "What would you do?", "چیکار می‌کردی؟", "verb"),
            v("if", "اگر", "If you had...", "اگر داشتی...", "conjunction"),
            v("money", "پول", "If I had money...", "اگر پول داشتم..."),
            v("travel", "سفر کردن", "I would travel.", "سفر می‌کردم.", "verb"),
            v("buy", "خریدن", "I would buy a car.", "ماشین می‌خریدم.", "verb"),
            v("help", "کمک کردن", "I would help.", "کمک می‌کردم.", "verb")
        ),
        listOf(
            GrammarSection("Would for hypotheticals", "What would you do if...? I would travel."),
            GrammarSection("Second conditional", "If I had money, I would travel. (imaginary)")
        ),
        listOf(
            d("A", "What would you do if you had a million dollars?", "اگر یک میلیون دلار داشتی چیکار می‌کردی؟"),
            d("B", "I would travel the world.", "دنیا را سفر می‌کردم."),
            d("A", "Where would you go first?", "اول کجا می‌رفتی؟"),
            d("B", "Japan. I've always wanted to go.", "ژاپن. همیشه می‌خواستم بروم."),
            d("A", "Would you buy a house?", "خانه می‌خریدی؟"),
            d("B", "Maybe. But travel is more important.", "شاید. ولی سفر مهم‌تره."),
            d("A", "Would you help your family?", "به خانواده‌ات کمک می‌کردی؟"),
            d("B", "Of course! I would help them first.", "البته! اول به آن‌ها کمک می‌کردم."),
            d("A", "You're very kind.", "خیلی مهربانی."),
            d("B", "Thanks. What about you?", "ممنون. تو چطور؟"),
            d("A", "I would buy a big house and a fast car.", "من یک خانه بزرگ و ماشین سریع می‌خریدم."),
            d("B", "That's fun too!", "اون هم سرگرم‌کننده‌ست!")
        ),
        listOf(
            q("What would B do?", listOf("buy house", "travel", "help"), 1),
            q("Where would B go first?", listOf("Italy", "Japan", "France"), 1),
            q("What ___ you do?", listOf("would", "will", "do"), 0),
            q("I ___ travel.", listOf("would", "will", "am"), 0)
        ),
        idioms = listOf(IdiomExpression("Travel the world", "دنیا را سفر کردن", "I would travel the world.", "دنیا را سفر می‌کردم.")),
        pron = listOf(PronunciationTip("Would", "would /wʊd/, I'd /aɪd/")),
        cult = listOf(CulturalNote("Hypotheticals", "Fun to discuss.")),
        mis = listOf(CommonMistake("What you would do?", "What would you do?", "Verb before subject."))
    )

    private fun f9B() = base(42, "9B I've been afraid of it for years", "۹B سال‌ها ازش می‌ترسیدم",
        listOf("Use present perfect with for/since", "Talk about duration", "Use afraid of"),
        listOf(
            v("afraid", "ترسیده", "Afraid of heights.", "از بلندی می‌ترسم.", "adjective"),
            v("for", "به مدت", "For three years.", "سه سال."),
            v("since", "از", "Since 2020.", "از ۲۰۲۰."),
            v("years", "سال‌ها", "For many years.", "سال‌های زیاد."),
            v("always", "همیشه", "I've always been.", "همیشه بوده‌ام.", "adverb"),
            v("never", "هرگز", "I've never been.", "هرگز نبوده‌ام.", "adverb")
        ),
        listOf(
            GrammarSection("Present perfect with for/since", "I've lived here for 3 years. I've known her since 2020."),
            GrammarSection("Afraid of", "I'm afraid of heights. I've been afraid for years.")
        ),
        listOf(
            d("A", "Are you afraid of anything?", "از چیزی می‌ترسی؟"),
            d("B", "Yes, I'm afraid of heights.", "بله، از بلندی می‌ترسم."),
            d("A", "How long have you been afraid?", "چقدر است که می‌ترسی؟"),
            d("B", "For many years. Since I was a child.", "سال‌های زیاد. از بچگی."),
            d("A", "Have you ever tried to overcome it?", "تا حالا سعی کردی غلبه کنی؟"),
            d("B", "Yes, I've tried many times.", "بله، بارها سعی کردم."),
            d("A", "And?", "و؟"),
            d("B", "I've never succeeded. But I don't give up.", "هرگز موفق نشدم. ولی تسلیم نمی‌شم."),
            d("A", "That's brave!", "شجاعانه‌ست!"),
            d("B", "Thanks. What about you?", "ممنون. تو چطور؟"),
            d("A", "I've been afraid of flying for years.", "سال‌ها از پرواز می‌ترسم."),
            d("B", "We should overcome our fears together!", "باید با هم بر ترس‌هامون غلبه کنیم!")
        ),
        listOf(
            q("What is B afraid of?", listOf("flying", "heights", "water"), 1),
            q("How long?", listOf("1 year", "many years", "5 years"), 1),
            q("I've lived here ___ 3 years.", listOf("for", "since", "from"), 0),
            q("I've known her ___ 2020.", listOf("for", "since", "from"), 1)
        ),
        idioms = listOf(IdiomExpression("Overcome fears", "غلبه بر ترس", "Overcome your fears!", "بر ترسهات غلبه کن!")),
        pron = listOf(PronunciationTip("For/Since", "for /fər/, since /sɪns/")),
        cult = listOf(CulturalNote("Fears", "Common to everyone.")),
        mis = listOf(CommonMistake("I've known her since 3 years.", "I've known her for 3 years.", "For + duration."))
    )

    private fun f9C() = base(43, "9C Born to sing", "۹C برای خواندن متولد شد",
        listOf("Use present perfect with ever/never", "Talk about talents", "Use superlatives"),
        listOf(
            v("born", "متولد", "Born to sing.", "برای خواندن متولد شد.", "verb"),
            v("talent", "استعداد", "A great talent.", "استعداد عالی."),
            v("sing", "آواز خواندن", "She can sing.", "او می‌تواند آواز بخواند.", "verb"),
            v("ever", "هرگز", "Best I've ever heard.", "بهترین چیزی که شنیده‌ام.", "adverb"),
            v("never", "هرگز", "I've never heard.", "هرگز نشنیده‌ام.", "adverb"),
            v("best", "بهترین", "The best.", "بهترین.", "adjective")
        ),
        listOf(
            GrammarSection("Present perfect with ever", "Have you ever heard...? The best I've ever seen."),
            GrammarSection("Superlatives", "the best, the most talented.")
        ),
        listOf(
            d("A", "Have you ever heard Maria sing?", "تا حالا آواز ماریا را شنیدی؟"),
            d("B", "Yes! She's amazing. The best I've ever heard.", "بله! شگفت‌انگیزه. بهترین چیزی که شنیده‌ام."),
            d("A", "She was born to sing.", "او برای خواندن متولد شده."),
            d("B", "I agree. She has a natural talent.", "موافقم. استعداد طبیعی داره."),
            d("A", "Have you ever tried singing?", "تا حالا سعی کردی آواز بخوانی؟"),
            d("B", "Yes, but I'm terrible!", "بله، ولی افتضاحم!"),
            d("A", "I've never tried. I'm too shy.", "من هرگز سعی نکرده‌ام. خیلی خجالتی‌ام."),
            d("B", "You should try! It's fun.", "باید سعی کنی! سرگرم‌کننده‌ست."),
            d("A", "Maybe in the shower!", "شاید در حمام!"),
            d("B", "Ha! That's a good place!", "ها! اون جای خوبیه!"),
            d("A", "Have you ever sung in public?", "تا حالا در جمع آواز خواندی؟"),
            d("B", "Never! Too scary.", "هرگز! خیلی ترسناکه.")
        ),
        listOf(
            q("Has B heard Maria sing?", listOf("no", "yes", "maybe"), 1),
            q("Has B ever sung in public?", listOf("yes", "no", "once"), 1),
            q("Have you ever ___ her sing?", listOf("hear", "heard", "hearing"), 1),
            q("She's the ___ singer.", listOf("good", "better", "best"), 2)
        ),
        idioms = listOf(IdiomExpression("Born to sing", "برای خواندن متولد شدن", "She was born to sing.", "او برای خواندن متولد شده.")),
        pron = listOf(PronunciationTip("Present perfect", "I've /aɪv/, she's /ʃiːz/")),
        cult = listOf(CulturalNote("Talent", "Natural or learned.")),
        mis = listOf(CommonMistake("I've never hear.", "I've never heard.", "Past participle."))
    )

    // ═══════════ PRACTICAL ENGLISH 9 ═══════════
    private fun pe9() = base(44, "PE9 Getting around", "انگلیسی کاربردی ۹ — رفت و آمد",
        listOf("Ask for directions", "Use public transport", "Buy tickets"),
        listOf(
            v("bus", "اتوبوس", "Take the bus.", "اتوبوس بگیر."),
            v("train", "قطار", "Take the train.", "قطار بگیر."),
            v("ticket", "بلیت", "A ticket, please.", "یک بلیت، لطفاً."),
            v("station", "ایستگاه", "The station.", "ایستگاه."),
            v("stop", "ایستگاه", "Bus stop.", "ایستگاه اتوبوس."),
            v("platform", "سکو", "Platform 5.", "سکوی ۵.")
        ),
        listOf(
            GrammarSection("Transport vocabulary", "bus, train, taxi, ticket, station."),
            GrammarSection("Buying tickets", "A ticket to London, please. How much is it?")
        ),
        listOf(
            d("A", "Excuse me, where's the station?", "ببخشید، ایستگاه کجاست؟"),
            d("B", "Go straight and turn left.", "مستقیم برو و به چپ بپیچ."),
            d("A", "Is it far?", "دوره؟"),
            d("B", "About 10 minutes.", "حدود ۱۰ دقیقه."),
            d("A", "I need a ticket to London.", "بلیت لندن لازم دارم."),
            d("B", "The ticket office is inside.", "دفتر بلیت داخل است."),
            d("A", "What time is the next train?", "قطار بعدی چه ساعتیه؟"),
            d("B", "At 3:30. Platform 5.", "ساعت ۳:۳۰. سکوی ۵."),
            d("A", "How much is it?", "چقدره؟"),
            d("B", "£25 single.", "۲۵ پوند یک‌طرفه."),
            d("A", "Thank you!", "ممنون!"),
            d("B", "Have a good trip!", "سفر خوبی داشته باشی!")
        ),
        listOf(
            q("Where's the station?", listOf("left", "straight then left", "right"), 1),
            q("What time is the train?", listOf("3:00", "3:30", "4:00"), 1),
            q("A ticket ___ London.", listOf("to", "for", "at"), 0),
            q("What time is the ___ train?", listOf("next", "near", "now"), 0)
        ),
        idioms = listOf(IdiomExpression("Have a good trip", "سفر خوبی داشته باشی", "Have a good trip!", "سفر خوبی داشته باشی!")),
        pron = listOf(PronunciationTip("Platform", "PLATform")),
        cult = listOf(CulturalNote("Public transport", "Varies by country.")),
        mis = listOf(CommonMistake("A ticket for London.", "A ticket to London.", "Use 'to'."))
    )

    // ═══════════ REVIEW 9 ═══════════
    private fun rc1718() = base(45, "R&C 17&18", "مرور ۱۷ و ۱۸",
        listOf("Review would", "Review present perfect for/since", "Review transport"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Would", "What would you do? I would travel."),
            GrammarSection("Present perfect for/since", "I've lived here for 3 years. Since 2020."),
            GrammarSection("Transport", "bus, train, ticket, station.")
        ),
        listOf(
            d("T", "Review time! Files 17-18.", "وقت مرور! فایل‌های ۱۷-۱۸."),
            d("A", "What would you do? I would travel.", "What would you do? I would travel."),
            d("B", "I've lived here for 3 years.", "I've lived here for 3 years."),
            d("T", "Transport?", "حمل و نقل؟"),
            d("A", "Bus, train, ticket, station.", "Bus، train، ticket، station."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("What ___ you do?", listOf("would", "will", "do"), 0),
            q("I've lived here ___ 3 years.", listOf("for", "since", "from"), 0),
            q("A ticket ___ London.", listOf("to", "for", "at"), 0),
            q("What time is the ___ train?", listOf("next", "near", "now"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("For/Since", "for /fər/, since /sɪns/")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("I've known her since 3 years.", "I've known her for 3 years.", "For + duration."))
    )

    // ═══════════ FILE 10 ═══════════
    private fun f10A() = base(46, "10A The mothers of invention", "۱۰A مادران اختراع",
        listOf("Use the passive voice", "Talk about inventions", "Use past participles"),
        listOf(
            v("invent", "اختراع کردن", "Who invented it?", "کی اختراعش کرد؟", "verb"),
            v("invention", "اختراع", "A great invention.", "اختراع عالی."),
            v("create", "ساختن", "Who created it?", "کی ساختش؟", "verb"),
            v("discover", "کشف کردن", "Discover a new world.", "دنیای جدید کشف کن.", "verb"),
            v("design", "طراحی کردن", "Design a car.", "ماشین طراحی کن.", "verb"),
            v("build", "ساختن", "Build a house.", "خانه بساز.", "verb")
        ),
        listOf(
            GrammarSection("Passive voice", "It was invented by... It was created in... The telephone was invented by Bell."),
            GrammarSection("Past participles", "invented, created, discovered, designed, built.")
        ),
        listOf(
            d("A", "Who invented the telephone?", "کی تلفن را اختراع کرد؟"),
            d("B", "It was invented by Alexander Graham Bell.", "توسط الکساندر گراهام بل اختراع شد."),
            d("A", "When was it invented?", "کی اختراع شد؟"),
            d("B", "In 1876.", "در ۱۸۷۶."),
            d("A", "What about the car?", "ماشین چطور؟"),
            d("B", "The first car was designed by Karl Benz.", "اولین ماشین توسط کارل بنز طراحی شد."),
            d("A", "And the airplane?", "و هواپیما؟"),
            d("B", "It was invented by the Wright brothers.", "توسط برادران رایت اختراع شد."),
            d("A", "Who invented the computer?", "کی کامپیوتر را اختراع کرد؟"),
            d("B", "Many people. It was a long process.", "افراد زیادی. فرآیند طولانی بود."),
            d("A", "Inventions change the world!", "اختراعات دنیا را تغییر می‌دهند!"),
            d("B", "Yes, they do!", "بله، همینطوره!")
        ),
        listOf(
            q("Who invented the telephone?", listOf("Bell", "Edison", "Tesla"), 0),
            q("Who designed the first car?", listOf("Ford", "Benz", "Toyota"), 1),
            q("The telephone ___ invented by Bell.", listOf("was", "were", "is"), 0),
            q("It ___ designed in 1876.", listOf("was", "were", "is"), 0)
        ),
        idioms = listOf(IdiomExpression("Change the world", "دنیا را تغییر دادن", "Inventions change the world!", "اختراعات دنیا را تغییر می‌دهند!")),
        pron = listOf(PronunciationTip("Passive", "was /wəz/, were /wər/")),
        cult = listOf(CulturalNote("Inventions", "Change history.")),
        mis = listOf(CommonMistake("It were invented.", "It was invented.", "Singular = was."))
    )

    private fun f10B() = base(47, "10B Could do better", "۱۰B می‌توانست بهتر باشد",
        listOf("Use could/couldn't", "Talk about past ability", "Compare past and present"),
        listOf(
            v("could", "می‌توانست", "I could swim.", "می‌توانستم شنا کنم.", "verb"),
            v("couldn't", "نمی‌توانست", "I couldn't drive.", "نمی‌توانستم رانندگی کنم.", "verb"),
            v("able", "قادر", "Able to.", "قادر به."),
            v("past", "گذشته", "In the past.", "در گذشته."),
            v("learn", "یاد گرفتن", "I learned to swim.", "شنا یاد گرفتم.", "verb"),
            v("try", "تلاش کردن", "I tried to learn.", "سعی کردم یاد بگیرم.", "verb")
        ),
        listOf(
            GrammarSection("Could/Couldn't for past ability", "I could swim when I was 5. I couldn't drive."),
            GrammarSection("Past vs present", "I couldn't swim before. Now I can.")
        ),
        listOf(
            d("A", "Could you swim when you were a child?", "بچه بودی می‌توانستی شنا کنی؟"),
            d("B", "No, I couldn't. I learned at 15.", "نه، نمی‌توانستم. در ۱۵ سالگی یاد گرفتم."),
            d("A", "I could swim at 5. My father taught me.", "من در ۵ سالگی می‌توانستم. پدرم یادم داد."),
            d("B", "Could you drive when you were 18?", "۱۸ سالگی می‌توانستی رانندگی کنی؟"),
            d("A", "Yes, I could. I got my license at 17.", "بله. گواهینامه‌ام را ۱۷ سالگی گرفتم."),
            d("B", "I couldn't drive until I was 25.", "من تا ۲۵ سالگی نمی‌توانستم رانندگی کنم."),
            d("A", "Really? Why?", "واقعاً؟ چرا؟"),
            d("B", "I lived in a big city. No need for a car.", "در شهر بزرگی زندگی می‌کردم. نیازی به ماشین نبود."),
            d("A", "That makes sense.", "منطقی‌ست."),
            d("B", "Now I can drive. Things change!", "الان می‌توانم رانندگی کنم. شرایط تغییر می‌کند!"),
            d("A", "Yes, we learn new things all the time.", "بله، همیشه چیزهای جدید یاد می‌گیریم."),
            d("B", "Exactly!", "دقیقاً!")
        ),
        listOf(
            q("Could B swim as a child?", listOf("yes", "no", "maybe"), 1),
            q("When did B learn to swim?", listOf("5", "15", "25"), 1),
            q("I ___ swim when I was 5.", listOf("could", "can", "could to"), 0),
            q("I ___ drive before.", listOf("couldn't", "don't could", "not could"), 0)
        ),
        idioms = listOf(IdiomExpression("Things change", "شرایط تغییر می‌کند", "Things change!", "شرایط تغییر می‌کند!")),
        pron = listOf(PronunciationTip("Could", "could /kʊd/, couldn't /ˈkʊdnt/")),
        cult = listOf(CulturalNote("Learning", "Never stops.")),
        mis = listOf(CommonMistake("I could to swim.", "I could swim.", "No 'to'."))
    )

    private fun f10C() = base(48, "10C Mr. Indecisive", "۱۰C آقای بی‌تصمیم",
        listOf("Use too/enough", "Give advice", "Talk about decisions"),
        listOf(
            v("decide", "تصمیم گرفتن", "I can't decide.", "نمی‌توانم تصمیم بگیرم.", "verb"),
            v("choose", "انتخاب کردن", "Choose one.", "یکی را انتخاب کن.", "verb"),
            v("too", "خیلی", "Too difficult.", "خیلی سخت.", "adverb"),
            v("enough", "کافی", "Not good enough.", "به اندازه کافی خوب نیست.", "adverb"),
            v("advice", "توصیه", "Give advice.", "توصیه بده."),
            v("problem", "مشکل", "A problem.", "مشکل.")
        ),
        listOf(
            GrammarSection("Too/Enough", "Too difficult. Not easy enough."),
            GrammarSection("Advice", "You should... Why don't you...?")
        ),
        listOf(
            d("A", "I can't decide. Should I buy the red car or the blue car?", "نمی‌توانم تصمیم بگیرم. ماشین قرمز بخرم یا آبی؟"),
            d("B", "The red one is too expensive.", "قرمزه خیلی گرونه."),
            d("A", "But the blue one isn't fast enough.", "ولی آبیه به اندازه کافی سریع نیست."),
            d("B", "You should think about what you need.", "باید به چیزی که نیاز داری فکر کنی."),
            d("A", "I need a fast car. But I don't have enough money.", "ماشین سریع لازم دارم. ولی پول کافی ندارم."),
            d("B", "Then you should wait. Save more money.", "پس باید صبر کنی. پول بیشتر پس‌انداز کن."),
            d("A", "But I need a car now!", "ولی الان ماشین لازم دارم!"),
            d("B", "You're too indecisive!", "خیلی بی‌تصمیمی!"),
            d("A", "I know. It's a problem.", "می‌دانم. مشکلیه."),
            d("B", "My advice: buy the blue one.", "توصیه من: آبیه را بخر."),
            d("A", "Why?", "چرا؟"),
            d("B", "It's cheaper. And it's good enough.", "ارزان‌تره. و به اندازه کافی خوبه.")
        ),
        listOf(
            q("Which car is too expensive?", listOf("red", "blue", "both"), 0),
            q("What does B advise?", listOf("buy red", "buy blue", "wait"), 1),
            q("It's ___ expensive.", listOf("too", "enough", "very"), 0),
            q("It's not fast ___.", listOf("too", "enough", "very"), 1)
        ),
        idioms = listOf(IdiomExpression("My advice", "توصیه من", "My advice: buy the blue one.", "توصیه من: آبیه را بخر.")),
        pron = listOf(PronunciationTip("Too/Enough", "too /tuː/, enough /ɪˈnʌf/")),
        cult = listOf(CulturalNote("Decisions", "Can be difficult.")),
        mis = listOf(CommonMistake("too much expensive", "too expensive", "Use 'too' + adjective."))
    )

    // ═══════════ PRACTICAL ENGLISH 10 ═══════════
    private fun pe10() = base(49, "PE10 At the pharmacy", "انگلیسی کاربردی ۱۰ — در داروخانه",
        listOf("Describe symptoms", "Ask for medicine", "Give advice"),
        listOf(
            v("pharmacy", "داروخانه", "Go to the pharmacy.", "به داروخانه برو."),
            v("headache", "سردرد", "A headache.", "سردرد."),
            v("stomachache", "دل‌درد", "A stomachache.", "دل‌درد."),
            v("fever", "تب", "A fever.", "تب."),
            v("medicine", "دارو", "Take medicine.", "دارو بخور."),
            v("pain", "درد", "Pain in my back.", "درد در کمرم.")
        ),
        listOf(
            GrammarSection("Symptoms", "I have a headache. I feel sick. It hurts."),
            GrammarSection("Advice", "You should rest. Take this medicine.")
        ),
        listOf(
            d("A", "Good morning. Can I help you?", "صبح بخیر. کمکی کنم؟"),
            d("B", "Yes, I have a headache and a fever.", "بله، سردرد و تب دارم."),
            d("A", "How long have you had it?", "چقدر است که داری؟"),
            d("B", "Since yesterday.", "از دیروز."),
            d("A", "Any other symptoms?", "علائم دیگر؟"),
            d("B", "A sore throat too.", "گلودرد هم."),
            d("A", "You should rest and drink water.", "باید استراحت کنی و آب بخوری."),
            d("B", "Do I need medicine?", "دارو لازم دارم؟"),
            d("A", "Yes. Take this twice a day.", "بله. این را دو بار در روز بخور."),
            d("B", "How much is it?", "چقدره؟"),
            d("A", "$12.", "۱۲ دلار."),
            d("B", "Thank you!", "ممنون!")
        ),
        listOf(
            q("What symptoms?", listOf("headache/fever", "stomachache", "back pain"), 0),
            q("How long sick?", listOf("today", "since yesterday", "one week"), 1),
            q("I ___ a headache.", listOf("have", "has", "am"), 0),
            q("You ___ rest.", listOf("should", "should to", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("Any other symptoms?", "علائم دیگر؟", "Any other symptoms?", "علائم دیگر؟")),
        pron = listOf(PronunciationTip("Symptoms", "HEADache, STOMachache")),
        cult = listOf(CulturalNote("Pharmacy", "Get medicine here.")),
        mis = listOf(CommonMistake("I have headache.", "I have a headache.", "Add 'a'."))
    )

    // ═══════════ REVIEW 10 ═══════════
    private fun rc1920() = base(50, "R&C 19&20", "مرور ۱۹ و ۲۰",
        listOf("Review passive", "Review could", "Review too/enough"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Passive", "It was invented by..."),
            GrammarSection("Could/Couldn't", "I could swim. I couldn't drive."),
            GrammarSection("Too/Enough", "too expensive, good enough.")
        ),
        listOf(
            d("T", "Review time! Files 19-20.", "وقت مرور! فایل‌های ۱۹-۲۰."),
            d("A", "It was invented by Bell.", "It was invented by Bell."),
            d("B", "I could swim. I couldn't drive.", "I could swim. I couldn't drive."),
            d("T", "Too/Enough?", "Too/Enough؟"),
            d("A", "Too expensive, good enough.", "Too expensive، good enough."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("The telephone ___ invented by Bell.", listOf("was", "were", "is"), 0),
            q("I ___ swim when I was 5.", listOf("could", "can", "could to"), 0),
            q("It's ___ expensive.", listOf("too", "enough", "very"), 0),
            q("It's not fast ___.", listOf("too", "enough", "very"), 1)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Passive", "was /wəz/")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("It were invented.", "It was invented.", "Singular = was."))
    )

    // ═══════════ FILE 11 ═══════════
    private fun f11A() = base(51, "11A Bad losers", "۱۱A بازنده‌های بد",
        listOf("Use adverbs of manner", "Talk about sports", "Describe how people do things"),
        listOf(
            v("win", "بردن", "They win.", "آن‌ها می‌برند.", "verb"),
            v("lose", "باختن", "We lose.", "می‌بازیم.", "verb"),
            v("play", "بازی کردن", "Play well.", "خوب بازی کن.", "verb"),
            v("well", "خوب", "He plays well.", "خوب بازی می‌کند.", "adverb"),
            v("badly", "بد", "She plays badly.", "بد بازی می‌کند.", "adverb"),
            v("fast", "سریع", "He runs fast.", "سریع می‌دود.", "adverb")
        ),
        listOf(
            GrammarSection("Adverbs of manner", "well, badly, fast, slowly, carefully. He plays well."),
            GrammarSection("Adjective vs adverb", "good → well, bad → badly, quick → quickly.")
        ),
        listOf(
            d("A", "Do you play sports?", "ورزش می‌کنی؟"),
            d("B", "Yes, I play tennis. But I play badly.", "بله، تنیس بازی می‌کنم. ولی بد بازی می‌کنم."),
            d("A", "Really? How often do you practice?", "واقعاً؟ چند وقت یکبار تمرین می‌کنی؟"),
            d("B", "Once a week. I need to practice more.", "هفته‌ای یک بار. باید بیشتر تمرین کنم."),
            d("A", "I play football. I play well.", "من فوتبال بازی می‌کنم. خوب بازی می‌کنم."),
            d("B", "Are you a good player?", "بازیکن خوبی هستی؟"),
            d("A", "Yes, I'm very good. I play three times a week.", "بله، خیلی خوبم. هفته‌ای سه بار بازی می‌کنم."),
            d("B", "That's why you're good!", "برای همینه که خوبی!"),
            d("A", "Yes. Practice makes perfect.", "بله. تمرین باعث عالی شدن می‌شه."),
            d("B", "I should practice more.", "باید بیشتر تمرین کنم."),
            d("A", "Yes, and don't be a bad loser!", "بله، و بازنده بد نباش!"),
            d("B", "I'm not! I just want to win.", "نیستم! فقط می‌خوام ببرم.")
        ),
        listOf(
            q("How does B play tennis?", listOf("well", "badly", "okay"), 1),
            q("How often does A play football?", listOf("once", "twice", "three times"), 2),
            q("He plays ___.", listOf("good", "well", "nice"), 1),
            q("She plays ___.", listOf("bad", "badly", "badly"), 1)
        ),
        idioms = listOf(IdiomExpression("Practice makes perfect", "تمرین باعث عالی شدن می‌شود", "Practice makes perfect.", "تمرین باعث عالی شدن می‌شه.")),
        pron = listOf(PronunciationTip("Adverbs", "WELL, BADly, FAST")),
        cult = listOf(CulturalNote("Sports", "Popular worldwide.")),
        mis = listOf(CommonMistake("He plays good.", "He plays well.", "Use adverb 'well'."))
    )

    private fun f11B() = base(52, "11B Are you a morning person?", "۱۱B آدم صبح هستی؟",
        listOf("Use present simple vs continuous", "Talk about preferences", "Use time expressions"),
        listOf(
            v("morning person", "آدم صبح", "I'm a morning person.", "من آدم صبح هستم."),
            v("night person", "آدم شب", "He's a night person.", "او آدم شبه."),
            v("early", "زود", "I wake up early.", "زود بیدار می‌شوم.", "adverb"),
            v("late", "دیر", "I go to bed late.", "دیر می‌خوابم.", "adverb"),
            v("energy", "انرژی", "Full of energy.", "پر از انرژی."),
            v("tired", "خسته", "I'm tired.", "خسته‌ام.", "adjective")
        ),
        listOf(
            GrammarSection("Present simple vs continuous", "I usually get up early (habit). Today I'm getting up late."),
            GrammarSection("Preferences", "I like mornings. I prefer evenings.")
        ),
        listOf(
            d("A", "Are you a morning person?", "آدم صبح هستی؟"),
            d("B", "No, I'm a night person. I love evenings.", "نه، آدم شبم. عاشق عصرهام."),
            d("A", "Me too! I can't wake up early.", "من هم! نمی‌تونم زود بیدار شم."),
            d("B", "What time do you usually get up?", "معمولاً چه ساعتی بیدار می‌شوی؟"),
            d("A", "Usually at 9. But today I got up at 7.", "معمولاً ساعت ۹. ولی امروز ۷ بیدار شدم."),
            d("B", "Why?", "چرا؟"),
            d("A", "I have a meeting. I'm tired now.", "جلسه دارم. الان خسته‌ام."),
            d("B", "I understand. I'm always tired in the morning.", "می‌فهمم. من همیشه صبح‌ها خسته‌ام."),
            d("A", "Night people have more energy at night.", "آدم‌های شب شب‌ها انرژی بیشتری دارن."),
            d("B", "Yes! I work better at night.", "بله! شب‌ها بهتر کار می‌کنم."),
            d("A", "Me too!", "من هم!"),
            d("B", "Night people unite!", "آدم‌های شب متحد شوند!")
        ),
        listOf(
            q("Is B a morning person?", listOf("yes", "no", "maybe"), 1),
            q("What time does A usually get up?", listOf("7", "9", "11"), 1),
            q("I usually ___ up early.", listOf("get", "gets", "getting"), 0),
            q("Today I ___ up late.", listOf("get", "got", "getting"), 1)
        ),
        idioms = listOf(IdiomExpression("Night people unite!", "آدم‌های شب متحد شوند!", "Night people unite!", "آدم‌های شب متحد شوند!")),
        pron = listOf(PronunciationTip("Contrast", "I USUALLY get up at 9. TODAY I got up at 7.")),
        cult = listOf(CulturalNote("Chronotypes", "Morning vs night people.")),
        mis = listOf(CommonMistake("I am agree.", "I agree.", "No 'am'."))
    )

    private fun f11C() = base(53, "11C What a coincidence!", "۱۱C چه تصادفی!",
        listOf("Use present perfect with just", "Talk about coincidences", "Use exclamations"),
        listOf(
            v("coincidence", "تصادف", "What a coincidence!", "چه تصادفی!"),
            v("just", "تازه", "I've just seen him.", "تازه دیدمش.", "adverb"),
            v("already", "قبلاً", "I've already done it.", "قبلاً انجامش داده‌ام.", "adverb"),
            v("yet", "هنوز", "Not yet.", "هنوز نه.", "adverb"),
            v("happen", "اتفاق افتادن", "It happened.", "اتفاق افتاد.", "verb"),
            v("meet", "ملاقات کردن", "Nice to meet you.", "از آشنایی خوشحالم.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect with just/already/yet", "I've just seen him. I've already done it. Not yet."),
            GrammarSection("Exclamations", "What a coincidence! How strange! What a surprise!")
        ),
        listOf(
            d("A", "I've just seen Tom!", "تازه تام را دیدم!"),
            d("B", "Really? I've just seen him too!", "واقعاً؟ من هم تازه دیدمش!"),
            d("A", "What a coincidence!", "چه تصادفی!"),
            d("B", "Where did you see him?", "کجا دیدیش؟"),
            d("A", "At the cafe. He was with Maria.", "در کافه. با ماریا بود."),
            d("B", "I saw them too! They're together now.", "من هم دیدمشون! الان با هم هستن."),
            d("A", "Have you heard the news?", "خبر را شنیدی؟"),
            d("B", "No, not yet. What happened?", "نه، هنوز نه. چی شد؟"),
            d("A", "They're getting married!", "دارن ازدواج می‌کنن!"),
            d("B", "What a surprise! I've already bought a gift!", "چه غافلگیری! قبلاً هدیه خریدم!"),
            d("A", "You knew? I haven't bought anything yet.", "تو می‌دانستی؟ من هنوز چیزی نخریدم."),
            d("B", "Don't worry. Let's buy one together.", "نگران نباش. بیا با هم یکی بخریم.")
        ),
        listOf(
            q("Who did A just see?", listOf("Maria", "Tom", "Anna"), 1),
            q("What's the news?", listOf("they're moving", "they're getting married", "they're having a baby"), 1),
            q("I've ___ seen him.", listOf("yet", "just", "already"), 1),
            q("I haven't seen him ___.", listOf("yet", "just", "already"), 0)
        ),
        idioms = listOf(
            IdiomExpression("What a coincidence!", "چه تصادفی!", "What a coincidence!", "چه تصادفی!"),
            IdiomExpression("What a surprise!", "چه غافلگیری!", "What a surprise!", "چه غافلگیری!")
        ),
        pron = listOf(PronunciationTip("Exclamations", "What a coINcidence! ↗")),
        cult = listOf(CulturalNote("Coincidences", "Fun to share.")),
        mis = listOf(CommonMistake("I've seen him just.", "I've just seen him.", "Just before main verb."))
    )

    // ═══════════ PRACTICAL ENGLISH 11 ═══════════
    private fun pe11() = base(54, "PE11 Time to go home", "انگلیسی کاربردی ۱۱ — وقت رفتن به خانه",
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
            d("A", "Is this your last day?", "آخرین روزته؟"),
            d("B", "Yes. I'm going home tomorrow.", "بله. فردا به خانه می‌روم."),
            d("A", "We'll miss you!", "دلتنگت می‌شویم!"),
            d("B", "Me too. You've all been great.", "من هم. همه‌تان عالی بودید."),
            d("A", "Keep in touch!", "در تماس باش!"),
            d("B", "Of course. Email me anytime.", "البته. هر وقت ایمیل بزن."),
            d("A", "Good luck with everything!", "موفق باشی در همه چیز!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye! Take care!", "خداحافظ! مراقب خودت باش!"),
            d("A", "You too!", "تو هم!"),
            d("B", "Thanks!", "ممنون!")
        ),
        listOf(
            q("When is B going home?", listOf("today", "tomorrow", "next week"), 1),
            q("What will B do?", listOf("stay", "go home", "travel"), 1),
            q("I'll ___ you.", listOf("miss", "missing", "missed"), 0),
            q("Keep in ___!", listOf("touch", "talk", "contact"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Good luck!", "موفق باشی!", "Good luck!", "موفق باشی!"),
            IdiomExpression("Take care", "مراقب خودت باش", "Take care!", "مراقب خودت باش!")
        ),
        pron = listOf(PronunciationTip("Goodbye", "Rising: See you SOON ↗")),
        cult = listOf(CulturalNote("Goodbyes", "Hug or handshake varies.")),
        mis = listOf(CommonMistake("I'll miss to you.", "I'll miss you.", "No 'to'."))
    )

    // ═══════════ REVIEW 11 ═══════════
    private fun rc2122() = base(55, "R&C 21&22", "مرور ۲۱ و ۲۲",
        listOf("Review adverbs", "Review present perfect just", "Review farewells"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("exercise", "تمرین", "Do exercises.", "تمرین‌ها."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان.")
        ),
        listOf(
            GrammarSection("Adverbs of manner", "well, badly, fast."),
            GrammarSection("Present perfect just", "I've just seen him."),
            GrammarSection("Farewells", "Goodbye, good luck, keep in touch.")
        ),
        listOf(
            d("T", "Review time! Files 21-22.", "وقت مرور! فایل‌های ۲۱-۲۲."),
            d("A", "Well, badly, fast.", "Well، badly، fast."),
            d("B", "I've just seen him.", "I've just seen him."),
            d("T", "Farewells?", "خداحافظی‌ها؟"),
            d("A", "Goodbye, good luck, keep in touch.", "Goodbye، good luck، keep in touch."),
            d("T", "Excellent! You're doing great.", "عالی! داری خوب پیش می‌ری."),
            d("A", "We practice every day!", "هر روز تمرین می‌کنیم!"),
            d("T", "Keep going!", "ادامه بده!"),
            d("B", "We love English!", "عاشق انگلیسی هستیم!"),
            d("T", "That's the spirit!", "همین روحیه!")
        ),
        listOf(
            q("He plays ___.", listOf("good", "well", "nice"), 1),
            q("I've ___ seen him.", listOf("yet", "just", "already"), 1),
            q("I'll ___ you.", listOf("miss", "missing", "missed"), 0),
            q("Keep in ___!", listOf("touch", "talk", "contact"), 0)
        ),
        idioms = listOf(IdiomExpression("That's the spirit!", "همین روحیه!", "That's the spirit!", "همین روحیه!")),
        pron = listOf(PronunciationTip("Adverbs", "WELL, BADly, FAST")),
        cult = listOf(CulturalNote("Review", "Essential.")),
        mis = listOf(CommonMistake("He plays good.", "He plays well.", "Use adverb 'well'."))
    )

    // ═══════════ FILE 12 ═══════════
    private fun f12A() = base(56, "12A Strange but true!", "۱۲A عجیب ولی واقعی!",
        listOf("Use present perfect vs past simple", "Talk about experiences", "Use time expressions"),
        listOf(
            v("strange", "عجیب", "A strange story.", "داستان عجیب.", "adjective"),
            v("happen", "اتفاق افتادن", "It happened yesterday.", "دیروز اتفاق افتاد.", "verb"),
            v("ever", "هرگز", "Have you ever...?", "تا حالا...؟", "adverb"),
            v("never", "هرگز", "I've never...", "هرگز...", "adverb"),
            v("ago", "پیش", "Two years ago.", "دو سال پیش."),
            v("last", "گذشته", "Last week.", "هفته پیش.")
        ),
        listOf(
            GrammarSection("Present perfect vs past simple", "I've been to Japan (experience). I went there in 2020 (specific)."),
            GrammarSection("Time expressions", "ever, never, ago, last week, yesterday.")
        ),
        listOf(
            d("A", "Have you ever seen something strange?", "تا حالا چیز عجیبی دیدی؟"),
            d("B", "Yes, I have. Something strange happened last year.", "بله. سال پیش چیز عجیبی اتفاق افتاد."),
            d("A", "What happened?", "چی شد؟"),
            d("B", "I saw a UFO! Or maybe it was a light.", "یک بشقاب پرنده دیدم! یا شاید یک نور بود."),
            d("A", "Really? Where did you see it?", "واقعاً؟ کجا دیدیش؟"),
            d("B", "In the countryside. At night. It was very fast.", "در حومه. شب. خیلی سریع بود."),
            d("A", "Have you ever told anyone?", "به کسی گفتی؟"),
            d("B", "I've told my family. But they don't believe me.", "به خانواده‌ام گفتم. ولی باور نمی‌کنند."),
            d("A", "I believe you! Strange things happen.", "من باورت می‌کنم! چیزهای عجیب اتفاق می‌افتد."),
            d("B", "Thanks! Most people laugh.", "ممنون! بیشتر مردم می‌خندند."),
            d("A", "Have you seen it again?", "دوباره دیدیش؟"),
            d("B", "No, never. But I always look at the sky.", "نه، هرگز. ولی همیشه به آسمان نگاه می‌کنم.")
        ),
        listOf(
            q("What did B see?", listOf("a ghost", "a UFO", "a strange animal"), 1),
            q("Has B seen it again?", listOf("yes", "no", "maybe"), 1),
            q("Have you ever ___ something strange?", listOf("see", "saw", "seen"), 2),
            q("It ___ last year.", listOf("happen", "happened", "happening"), 1)
        ),
        idioms = listOf(IdiomExpression("I believe you!", "من باورت می‌کنم!", "I believe you!", "من باورت می‌کنم!")),
        pron = listOf(PronunciationTip("Present perfect", "I've /aɪv/, she's /ʃiːz/")),
        cult = listOf(CulturalNote("UFO stories", "Popular worldwide.")),
        mis = listOf(CommonMistake("I've saw it last year.", "I saw it last year.", "Past simple with specific time."))
    )

    private fun f12B() = base(57, "12B Gossip is good for you", "۱۲B غیبت برایت خوب است",
        listOf("Use present perfect with already/yet", "Talk about news", "Use gossip expressions"),
        listOf(
            v("gossip", "غیبت", "Gossip is fun.", "غیبت سرگرم‌کننده‌ست."),
            v("news", "خبر", "Have you heard the news?", "خبر را شنیدی؟"),
            v("already", "قبلاً", "I've already heard.", "قبلاً شنیده‌ام.", "adverb"),
            v("yet", "هنوز", "Not yet.", "هنوز نه.", "adverb"),
            v("hear", "شنیدن", "I heard it.", "شنیدمش.", "verb"),
            v("tell", "گفتن", "She told me.", "او به من گفت.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect with already/yet", "I've already heard. I haven't heard yet."),
            GrammarSection("Gossip expressions", "Have you heard...? Did you know...? Guess what!")
        ),
        listOf(
            d("A", "Have you heard the news?", "خبر را شنیدی؟"),
            d("B", "What news? Tell me!", "چه خبری؟ بگو!"),
            d("A", "Tom and Maria are moving to Paris!", "تام و ماریا دارن به پاریس نقل مکان می‌کنن!"),
            d("B", "No way! I haven't heard that yet.", "باور نمی‌کنم! هنوز نشنیده‌ام."),
            d("A", "I've already told everyone. It's true.", "قبلاً به همه گفتم. درسته."),
            d("B", "When are they moving?", "کی نقل مکان می‌کنن؟"),
            d("A", "Next month. Tom has a new job there.", "ماه بعد. تام یک شغل جدید اونجا داره."),
            d("B", "Have they found a house?", "خانه پیدا کرده‌اند؟"),
            d("A", "Not yet. But they're looking.", "هنوز نه. ولی دارن دنبالش می‌گردن."),
            d("B", "That's exciting! I'll miss them.", "هیجان‌انگیزه! دلتنگشون می‌شم."),
            d("A", "Me too. But Paris is beautiful!", "من هم. ولی پاریس زیباست!"),
            d("B", "True! Let's visit them!", "درسته! بیا بریم دیدنشون!")
        ),
        listOf(
            q("Where are Tom and Maria moving?", listOf("London", "Paris", "Rome"), 1),
            q("Have they found a house?", listOf("yes", "no", "maybe"), 1),
            q("I've ___ heard the news.", listOf("yet", "already", "just"), 1),
            q("I haven't heard ___.", listOf("yet", "already", "just"), 0)
        ),
        idioms = listOf(
            IdiomExpression("No way!", "باور نمی‌کنم!", "No way!", "باور نمی‌کنم!"),
            IdiomExpression("Guess what!", "حدس بزن چی!", "Guess what!", "حدس بزن چی!")
        ),
        pron = listOf(PronunciationTip("Already/Yet", "alREADY, YET")),
        cult = listOf(CulturalNote("Gossip", "Common social activity.")),
        mis = listOf(CommonMistake("I've heard already.", "I've already heard.", "Already before main verb."))
    )

    private fun f12C() = base(58, "12C The American English File quiz", "۱۲C آزمون American English File",
        listOf("Review all grammar", "Review vocabulary", "Test your knowledge"),
        listOf(
            v("quiz", "آزمون", "Take the quiz.", "آزمون بده."),
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان."),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("answer", "پاسخ", "The answer is...", "پاسخ این است...")
        ),
        listOf(
            GrammarSection("Review: all tenses", "Present, past, future, present perfect."),
            GrammarSection("Review: modals", "Can, must, should, would."),
            GrammarSection("Review: conditionals", "First and second conditional.")
        ),
        listOf(
            d("T", "Final quiz! Let's review everything.", "آزمون نهایی! بیایید همه چیز را مرور کنیم."),
            d("A", "Present simple: I work, she works.", "حال ساده: I work، she works."),
            d("B", "Present continuous: I'm working.", "حال استمراری: I'm working."),
            d("T", "Past simple?", "حال گذشته؟"),
            d("A", "I went, I saw, I had.", "I went، I saw، I had."),
            d("T", "Present perfect?", "حال کامل؟"),
            d("B", "I've been, I've seen.", "I've been، I've seen."),
            d("T", "Modals?", "افعال کمکی؟"),
            d("A", "Can, must, should, would.", "Can، must، should، would."),
            d("T", "Conditionals?", "شرطی‌ها؟"),
            d("B", "If it rains, we'll stay. If I had money, I would travel.", "If it rains, we'll stay. If I had money, I would travel."),
            d("T", "Excellent! You've learned so much this year!", "عالی! امسال خیلی یاد گرفتید!"),
            d("A", "We're ready for Level 2!", "برای سطح ۲ آماده‌ایم!"),
            d("T", "Yes, you are! Good luck!", "بله! موفق باشید!")
        ),
        listOf(
            q("Which is present simple?", listOf("I'm working", "I work", "I worked"), 1),
            q("Which is past simple?", listOf("I've seen", "I saw", "I see"), 1),
            q("She ___ in London.", listOf("live", "lives", "living"), 1),
            q("I ___ working now.", listOf("am", "is", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("Good luck!", "موفق باشی!", "Good luck!", "موفق باشی!")),
        pron = listOf(PronunciationTip("Contractions", "I've, I'll, I'm")),
        cult = listOf(CulturalNote("End of course", "Congratulations!")),
        mis = listOf(CommonMistake("I've went.", "I've been.", "Past participle."))
    )

    // ═══════════ PE12 ═══════════
    private fun pe12() = base(59, "PE12 Saying goodbye", "انگلیسی کاربردی ۱۲ — خداحافظی",
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
            d("A", "Is this your last day?", "آخرین روزته؟"),
            d("B", "Yes. I'm going home tomorrow.", "بله. فردا به خانه می‌روم."),
            d("A", "We'll miss you!", "دلتنگت می‌شویم!"),
            d("B", "Me too. You've all been great.", "من هم. همه‌تان عالی بودید."),
            d("A", "Keep in touch!", "در تماس باش!"),
            d("B", "Of course. Email me anytime.", "البته. هر وقت ایمیل بزن."),
            d("A", "Good luck with everything!", "موفق باشی در همه چیز!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye! Take care!", "خداحافظ! مراقب خودت باش!"),
            d("A", "You too!", "تو هم!"),
            d("B", "Thanks!", "ممنون!")
        ),
        listOf(
            q("When is B going home?", listOf("today", "tomorrow", "next week"), 1),
            q("What will B do?", listOf("stay", "go home", "travel"), 1),
            q("I'll ___ you.", listOf("miss", "missing", "missed"), 0),
            q("Keep in ___!", listOf("touch", "talk", "contact"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Good luck!", "موفق باشی!", "Good luck!", "موفق باشی!"),
            IdiomExpression("Take care", "مراقب خودت باش", "Take care!", "مراقب خودت باش!")
        ),
        pron = listOf(PronunciationTip("Goodbye", "Rising: See you SOON ↗")),
        cult = listOf(CulturalNote("Goodbyes", "Hug or handshake varies.")),
        mis = listOf(CommonMistake("I'll miss to you.", "I'll miss you.", "No 'to'."))
    )

    // ═══════════ R&C 23&24 ═══════════
    private fun rc2324() = base(60, "R&C 23&24", "مرور ۲۳ و ۲۴",
        listOf("Review all grammar", "Review vocabulary", "Final review"),
        listOf(
            v("review", "مرور", "Let's review.", "مرور کنیم.", "verb"),
            v("practice", "تمرین", "Practice.", "تمرین.", "verb"),
            v("grammar", "گرامر", "Grammar.", "گرامر."),
            v("vocabulary", "واژگان", "Vocabulary.", "واژگان."),
            v("mistake", "اشتباه", "Fix mistakes.", "اشتباهات."),
            v("progress", "پیشرفت", "Great progress.", "پیشرفت عالی.")
        ),
        listOf(
            GrammarSection("All tenses", "Present, past, future, present perfect."),
            GrammarSection("All modals", "Can, must, should, would."),
            GrammarSection("All conditionals", "First and second.")
        ),
        listOf(
            d("T", "Final review!", "مرور نهایی!"),
            d("A", "Present: I work, I'm working.", "حال: I work، I'm working."),
            d("B", "Past: I worked, I went.", "گذشته: I worked، I went."),
            d("T", "Present perfect?", "حال کامل؟"),
            d("A", "I've been, I've seen.", "I've been، I've seen."),
            d("T", "Future?", "آینده؟"),
            d("B", "I'll go, I'm going to travel.", "I'll go، I'm going to travel."),
            d("T", "Modals?", "افعال کمکی؟"),
            d("A", "Can, must, should, would.", "Can، must، should، would."),
            d("T", "Congratulations! You've completed Level 1!", "تبریک! سطح ۱ را تمام کردید!"),
            d("B", "Thank you! We learned so much!", "ممنون! خیلی یاد گرفتیم!"),
            d("T", "You're ready for Level 2. Good luck!", "برای سطح ۲ آماده‌اید. موفق باشید!")
        ),
        listOf(
            q("Present simple example?", listOf("I work", "I worked", "I'll work"), 0),
            q("Present perfect example?", listOf("I work", "I've been", "I'll go"), 1),
            q("She ___ in London.", listOf("live", "lives", "living"), 1),
            q("I ___ working now.", listOf("am", "is", "are"), 0)
        ),
        idioms = listOf(IdiomExpression("Congratulations!", "تبریک!", "Congratulations!", "تبریک!")),
        pron = listOf(PronunciationTip("Review", "All tenses practiced.")),
        cult = listOf(CulturalNote("Level complete", "Well done!")),
        mis = listOf(CommonMistake("I've went.", "I've been.", "Past participle."))
    )
}