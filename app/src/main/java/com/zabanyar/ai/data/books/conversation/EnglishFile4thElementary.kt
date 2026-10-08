package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * English File 4th Edition — Elementary (Book 1)
 * 48 Chapters: 12 Files × 3 Lessons + 6 Practical English + 6 Revise & Check
 * British English | A1-A2
 */
object EnglishFile4thElementary {
    const val BOOK_ID = "english_file_4th_elementary"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> file1A(); 2 -> file1B(); 3 -> file1C()
        4 -> file2A(); 5 -> file2B(); 6 -> file2C()
        7 -> practicalEnglish1(); 8 -> reviseAndCheck1And2()
        9 -> file3A(); 10 -> file3B(); 11 -> file3C()
        12 -> file4A(); 13 -> file4B(); 14 -> file4C()
        15 -> practicalEnglish2(); 16 -> reviseAndCheck3And4()
        17 -> file5A(); 18 -> file5B(); 19 -> file5C()
        20 -> file6A(); 21 -> file6B(); 22 -> file6C()
        23 -> practicalEnglish3(); 24 -> reviseAndCheck5And6()
        25 -> file7A(); 26 -> file7B(); 27 -> file7C()
        28 -> file8A(); 29 -> file8B(); 30 -> file8C()
        31 -> practicalEnglish4(); 32 -> reviseAndCheck7And8()
        33 -> file9A(); 34 -> file9B(); 35 -> file9C()
        36 -> file10A(); 37 -> file10B(); 38 -> file10C()
        39 -> practicalEnglish5(); 40 -> reviseAndCheck9And10()
        41 -> file11A(); 42 -> file11B(); 43 -> file11C()
        44 -> file12A(); 45 -> file12B(); 46 -> file12C()
        47 -> practicalEnglish6(); 48 -> reviseAndCheck11And12()
        else -> LessonContent(
            BOOK_ID, chapterNumber, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList()
        )
    }

    private fun base(n: Int, title: String, fa: String,
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
    private fun q(qq: String, o: List<String>, c: Int) = QuizQuestion(qq, o, c)

    // ═══ 1A ═══
    private fun file1A() = base(1, "Welcome to the class", "به کلاس خوش آمدید",
        listOf("Greet people and introduce yourself", "Use verb be (singular)", "Use subject pronouns", "Say numbers 0-10"),
        listOf(
            v("hello","سلام","Hello, I'm David.","سلام، من دیویید هستم.","interjection"),
            v("name","نام","What's your name?","نامت چیست؟"),
            v("teacher","معلم","She's the teacher.","او معلم است."),
            v("student","دانش‌آموز","I'm a student.","من دانش‌آموز هستم."),
            v("class","کلاس","Welcome to the class.","به کلاس خوش آمدید."),
            v("friend","دوست","He's my friend.","او دوست من است."),
            v("nice","خوب","Nice to meet you.","از آشنایی خوشحالم.","adjective"),
            v("coffee","قهوه","A coffee, please.","یک قهوه، لطفاً.")
        ),
        listOf(
            GrammarSection("Verb be (singular)","I am, you are, he/she/it is. Contractions: I'm, you're, he's, she's, it's."),
            GrammarSection("Subject pronouns","I, you, he, she, it. Use 'he' for men, 'she' for women, 'it' for things.")
        ),
        listOf(
            d("Teacher","Hello. I'm Carla. I'm your teacher.","سلام. من کارلا هستم. معلم شما هستم."),
            d("David","Hi, Carla. I'm David.","سلام کارلا. من دیویید هستم."),
            d("Teacher","Nice to meet you, David. Are you a student?","از آشنایی خوشحالم دیویید. دانش‌آموزی؟"),
            d("David","Yes, I am. I'm from Italy.","بله. اهل ایتالیام."),
            d("Teacher","Welcome! Is that your friend?","خوش آمدی! آن دوستت است؟"),
            d("David","Yes, she's Maria. She's from Spain.","بله، او ماریاست. اهل اسپانیاست."),
            d("Maria","Hello. Nice to meet you.","سلام. از آشنایی خوشحالم."),
            d("Teacher","Nice to meet you too, Maria. Welcome!","من هم خوشحالم ماریا. خوش آمدی!")
        ),
        listOf(
            q("Where is David from?",listOf("Spain","Italy","France"),1),
            q("Who is the teacher?",listOf("David","Maria","Carla"),2),
            q("___ you a student?",listOf("Am","Is","Are"),2),
            q("___ is my friend. (Maria)",listOf("He","She","It"),1)
        ),
        idioms = listOf(IdiomExpression("Nice to meet you","از آشنایی خوشحالم","Nice to meet you!","از آشنایی خوشحالم!")),
        pronunciation = listOf(PronunciationTip("Contractions","Practice: I'm /aɪm/, you're /jʊər/, he's /hiːz/, she's /ʃiːz/.")),
        culture = listOf(CulturalNote("First names","In English-speaking classrooms, teachers and students often use first names.")),
        mistakes = listOf(CommonMistake("I is David.","I am David.","Use 'am' with 'I'."))
    )

    // ═══ 1B ═══
    private fun file1B() = base(2, "One world", "یک جهان",
        listOf("Talk about countries and nationalities","Use verb be (plural)","Say numbers 11-30"),
        listOf(
            v("country","کشور","Which country are you from?","اهل کدام کشوری؟"),
            v("nationality","ملیت","What's your nationality?","ملیتت چیست؟"),
            v("British","بریتانیایی","They're British.","آن‌ها بریتانیایی هستند.","adjective"),
            v("American","آمریکایی","He's American.","او آمریکایی است.","adjective"),
            v("Chinese","چینی","She's Chinese.","او چینی است.","adjective"),
            v("world","جهان","It's a small world.","جهان کوچکی است."),
            v("city","شهر","London is a big city.","لندن شهر بزرگی است."),
            v("flag","پرچم","The flag is red.","پرچم قرمز است.")
        ),
        listOf(
            GrammarSection("Verb be (plural)","We are, you are, they are. Contractions: we're, you're, they're."),
            GrammarSection("Questions with be","Where are you from? What's your nationality? Are they British?")
        ),
        listOf(
            d("Tom","Hi! Are you from Britain?","سلام! اهل بریتانیایی؟"),
            d("Lena","No, we aren't. We're from Germany.","نه. اهل آلمانیم."),
            d("Tom","Oh sorry! Are you on holiday?","اوه ببخشید! در تعطیلات هستید؟"),
            d("Lena","Yes, we are. Two weeks.","بله. دو هفته."),
            d("Tom","And who's he?","و او کیست؟"),
            d("Lena","He's my brother. He's a student in Berlin.","او برادرم است. در برلین دانشجو است."),
            d("Tom","Are you all from Germany?","همگی اهل آلمانید؟"),
            d("Lena","Yes. But our mother is Italian.","بله. ولی مادرمان ایتالیایی است."),
            d("Tom","It's a small world!","جهان کوچکی است!")
        ),
        listOf(
            q("Where is Lena from?",listOf("Britain","Germany","Italy"),1),
            q("Where is her brother a student?",listOf("Munich","Berlin","Rome"),1),
            q("We ___ from Germany.",listOf("am","is","are"),2),
            q("___ they British?",listOf("Am","Is","Are"),2)
        ),
        idioms = listOf(
            IdiomExpression("On holiday","در تعطیلات","We're on holiday.","در تعطیلات هستیم."),
            IdiomExpression("It's a small world","جهان کوچک است","It's a small world!","جهان کوچکی است!")
        ),
        pronunciation = listOf(PronunciationTip("Nationality endings","Stress shifts: GERmany → GERman, ITaly → iTALian.")),
        culture = listOf(CulturalNote("Nationalities","Nationalities in English always start with a capital letter.")),
        mistakes = listOf(CommonMistake("We is from Germany.","We are from Germany.","Use 'are' with we/you/they."))
    )

    // ═══ 1C ═══
    private fun file1C() = base(3, "What's your email?", "ایمیلت چیه؟",
        listOf("Give personal information","Use possessive adjectives","Spell names","Use numbers 20-100"),
        listOf(
            v("email","ایمیل","What's your email?","ایمیلت چیه؟"),
            v("phone number","شماره تلفن","My phone number is...","شماره تلفنم..."),
            v("address","آدرس","What's your address?","آدرست چیه؟"),
            v("spell","هجی کردن","How do you spell it?","چطور هجی می‌کنی؟","verb"),
            v("surname","نام خانوادگی","My surname is Smith.","نام خانوادگی‌ام اسمیت است."),
            v("first name","نام کوچک","My first name is Tom.","نام کوچکم تام است."),
            v("age","سن","What's your age?","سنت چقدره؟"),
            v("number","شماره","What's your number?","شمارت چیه؟")
        ),
        listOf(
            GrammarSection("Possessive adjectives","my, your, his, her. My name is... Her phone is..."),
            GrammarSection("Wh- questions with be","What's your name? Where's your address? Who's your teacher?")
        ),
        listOf(
            d("A","What's your surname?","نام خانوادگیت چیه؟"),
            d("B","It's Kowalski. K-O-W-A-L-S-K-I.","کوالسکی. ک-و-ا-ل-س-ک-ی."),
            d("A","Thanks. What's your first name?","ممنون. اسم کوچکت چیه؟"),
            d("B","Maria. M-A-R-I-A.","ماریا. م-ا-ر-ی-ا."),
            d("A","And your email?","و ایمیلت؟"),
            d("B","It's maria.kowalski@gmail.com.","ماریا.کوالسکی@gmail.com."),
            d("A","Sorry, can you repeat that?","ببخشید، تکرار می‌کنی؟"),
            d("B","M-A-R-I-A dot K-O-W-A-L-S-K-I at gmail dot com.","م-ا-ر-ی-ا نقطه ک-و-ا-ل-س-ک-ی ات gmail نقطه com."),
            d("A","Got it. And your phone number?","فهمیدم. و شماره تلفنت؟"),
            d("B","It's 07700 900456.","۰۷۷۰۰ ۹۰۰۴۵۶.")
        ),
        listOf(
            q("What's B's surname?",listOf("Maria","Kowalski","Smith"),1),
            q("What's B's email domain?",listOf("yahoo","gmail","hotmail"),1),
            q("This is Tom. ___ phone is new.",listOf("Her","His","My"),1),
            q("___ is your email?",listOf("What","Who","Where"),0)
        ),
        idioms = listOf(
            IdiomExpression("Can you repeat that?","می‌تونی تکرار کنی؟","Can you repeat that?","می‌تونی تکرار کنی؟"),
            IdiomExpression("Got it","فهمیدم","Got it, thanks.","فهمیدم، ممنون.")
        ),
        pronunciation = listOf(PronunciationTip("Spelling aloud","Vowels: A /eɪ/, E /iː/, I /aɪ/, O /oʊ/, U /juː/.")),
        culture = listOf(CulturalNote("Email addresses","'@' is 'at' and '.' is 'dot'.")),
        mistakes = listOf(CommonMistake("How you spell?","How do you spell?","Use 'do' in questions."))
    )

    // ═══ 2A ═══
    private fun file2A() = base(4, "Are you tidy or untidy?", "مرتبی یا نامرتب؟",
        listOf("Talk about objects","Use a/an and this/that/these/those","Use singular/plural nouns","Prepositions: in, on, under"),
        listOf(
            v("tidy","مرتب","My desk is tidy.","میزم مرتب است.","adjective"),
            v("untidy","نامرتب","His room is untidy.","اتاقش نامرتب است.","adjective"),
            v("desk","میز","Books on the desk.","کتاب‌ها روی میز."),
            v("charger","شارژر","I need my charger.","شارژرم را لازم دارم."),
            v("umbrella","چتر","Take an umbrella.","چتر بردار."),
            v("glasses","عینک","Where are my glasses?","عینکم کجاست؟"),
            v("keys","کلیدها","I can't find my keys.","کلیدهایم را پیدا نمی‌کنم."),
            v("bag","کیف","It's in my bag.","در کیسم است.")
        ),
        listOf(
            GrammarSection("a / an","'a' before consonants: a book. 'an' before vowels: an umbrella."),
            GrammarSection("this/that/these/those","this (near, sing), that (far, sing), these (near, pl), those (far, pl)."),
            GrammarSection("Prepositions of place","in the bag, on the desk, under the chair.")
        ),
        listOf(
            d("A","Are you tidy or untidy?","مرتبی یا نامرتب؟"),
            d("B","Very untidy! My desk is a mess.","خیلی نامرتب! میزم به هم ریخته."),
            d("A","What's on your desk?","چی روی میزته؟"),
            d("B","Books, papers, and an old coffee cup.","کتاب، کاغذ و یک فنجان قهوه قدیمی."),
            d("A","Where are your keys?","کلیدهایت کجا هستند؟"),
            d("B","I don't know! Not in my bag.","نمی‌دانم! در کیسم نیستند."),
            d("A","Are they under the papers?","زیر کاغذها هستند؟"),
            d("B","Maybe! Oh yes, here they are.","شاید! اوه بله، ایناهاشون."),
            d("A","You need to be more tidy!","باید مرتب‌تر باشی!"),
            d("B","I know. My mother says that too.","می‌دانم. مادرم هم همین را می‌گوید.")
        ),
        listOf(
            q("Where are B's keys?",listOf("in the bag","under the papers","on the desk"),1),
            q("What's on B's desk?",listOf("books and papers","a laptop","shoes"),0),
            q("There is ___ umbrella.",listOf("a","an","the"),1),
            q("___ books are mine.",listOf("This","These","That"),1)
        ),
        idioms = listOf(
            IdiomExpression("A mess","به هم ریخته","My desk is a mess.","میزم به هم ریخته است."),
            IdiomExpression("Here they are","ایناهاشون","Here they are!","ایناهاشون!")
        ),
        pronunciation = listOf(PronunciationTip("Plural -s","Three sounds: /s/ (books), /z/ (keys), /ɪz/ (watches).")),
        culture = listOf(CulturalNote("Tidiness","Attitudes to tidiness vary across cultures.")),
        mistakes = listOf(CommonMistake("a umbrella","an umbrella","Use 'an' before vowel sounds."))
    )

    // ═══ 2B ═══
    private fun file2B() = base(5, "Made in America", "ساخت آمریکا",
        listOf("Use adjectives","Talk about colours","Use modifiers: very, really, quite","Talk about brands"),
        listOf(
            v("colour","رنگ","What colour is it?","چه رنگی است؟"),
            v("red","قرمز","The flag is red.","پرچم قرمز است.","adjective"),
            v("blue","آبی","A blue jacket.","یک کاپشن آبی.","adjective"),
            v("green","سبز","Green trees.","درختان سبز.","adjective"),
            v("black","مشکی","A black bag.","یک کیف مشکی.","adjective"),
            v("big","بزرگ","Canada is big.","کانادا بزرگ است.","adjective"),
            v("small","کوچک","A small world.","جهان کوچک.","adjective"),
            v("beautiful","زیبا","A beautiful city.","شهر زیبا.","adjective")
        ),
        listOf(
            GrammarSection("Adjectives","Before nouns (a big country) or after 'be' (Canada is big)."),
            GrammarSection("Modifiers","very, really, quite. It's very big. It's really beautiful.")
        ),
        listOf(
            d("A","What colour is the American flag?","پرچم آمریکا چه رنگی است؟"),
            d("B","Red, white, and blue. Fifty stars.","قرمز، سفید و آبی. پنجاه ستاره."),
            d("A","Are there many American products here?","محصولات آمریکایی زیادی اینجاست؟"),
            d("B","Yes, a lot. iPhones, Coca-Cola, McDonald's...","بله، زیاد. آیفون، کوکاکولا، مک‌دونالد..."),
            d("A","Favourite American brand?","برند آمریکایی مورد علاقه؟"),
            d("B","I really like Apple. Their products are beautiful.","واقعاً اپل را دوست دارم. محصولاتشان زیباست."),
            d("A","Me too. But they're quite expensive.","من هم. ولی کاملاً گران هستند."),
            d("B","Yes, very expensive! But good quality.","بله، خیلی گران! ولی کیفیت خوب."),
            d("A","Is Levi's American?","لیوایز آمریکایی است؟"),
            d("B","Yes, but many jeans are made in other countries.","بله، ولی بسیاری از جین‌ها در کشورهای دیگر ساخته می‌شوند.")
        ),
        listOf(
            q("Colours of the American flag?",listOf("red, white, blue","red, yellow, green","blue, white, black"),0),
            q("Which brand does B like?",listOf("Nike","Apple","Levi's"),1),
            q("Canada is a ___ country.",listOf("big","bigger","biggest"),0),
            q("It's ___ beautiful city.",listOf("very","much","many"),0)
        ),
        idioms = listOf(
            IdiomExpression("A lot","زیاد","Yes, a lot.","بله، زیاد."),
            IdiomExpression("Me too","من هم","Me too!","من هم!")
        ),
        pronunciation = listOf(PronunciationTip("Adjective stress","Stress: a BIG country, a BEAUtiful city.")),
        culture = listOf(CulturalNote("Global brands","Many brands are American but made worldwide.")),
        mistakes = listOf(CommonMistake("a country big","a big country","Adjective comes before noun."))
    )

    // ═══ 2C ═══
    private fun file2C() = base(6, "Slow down!", "آهسته‌تر!",
        listOf("Use imperatives","Use 'let's' for suggestions","Talk about feelings","Give instructions"),
        listOf(
            v("slow down","آهسته‌تر","Slow down!","آهسته‌تر!","verb"),
            v("hungry","گرسنه","I'm hungry.","گرسنه‌ام.","adjective"),
            v("thirsty","تشنه","She's thirsty.","او تشنه است.","adjective"),
            v("hot","گرم","It's hot.","گرم است.","adjective"),
            v("cold","سرد","I'm cold.","سردم است.","adjective"),
            v("tired","خسته","We're tired.","خسته‌ایم.","adjective"),
            v("happy","خوشحال","I'm happy.","خوشحالم.","adjective"),
            v("worried","نگران","Don't be worried.","نگران نباش.","adjective")
        ),
        listOf(
            GrammarSection("Imperatives","Open the door. Don't close the window."),
            GrammarSection("Let's + verb","Let's eat. Let's go home."),
            GrammarSection("Feelings with be","I'm hungry. She's tired.")
        ),
        listOf(
            d("A","Lisa, slow down! You're driving too fast.","لیزا، آهسته‌تر! خیلی تند رانندگی می‌کنی."),
            d("B","Sorry! I'm tired. I want to get home.","ببخشید! خسته‌ام. می‌خواهم به خانه برسم."),
            d("A","Are you hungry?","گرسنه‌ای؟"),
            d("B","Yes, very hungry. And thirsty too.","بله، خیلی گرسنه. و تشنه هم."),
            d("A","Let's stop at the next cafe.","بیا در کافه بعدی توقف کنیم."),
            d("B","Good idea. I need a coffee.","فکر خوبی است. به یک قهوه نیاز دارم."),
            d("A","Don't drive so fast. The baby is sleeping.","اینقدر تند رانندگی نکن. بچه خواب است."),
            d("B","OK. You're right. I'm sorry.","باشه. حق با توست. متأسفم.")
        ),
        listOf(
            q("Why is B driving fast?",listOf("happy","tired","excited"),1),
            q("What does A suggest?",listOf("stop at a cafe","go home","drive faster"),0),
            q("___ the window. It's hot.",listOf("Open","Close","Don't open"),0),
            q("I'm ___. Let's eat.",listOf("thirsty","hungry","tired"),1)
        ),
        idioms = listOf(
            IdiomExpression("Good idea","فکر خوبی","Good idea!","فکر خوبی!"),
            IdiomExpression("You're right","حق با توست","You're right.","حق با توست.")
        ),
        pronunciation = listOf(PronunciationTip("Imperative intonation","Falling: OPEN the door. SLOW down.")),
        culture = listOf(CulturalNote("Safe driving","Driving slowly near homes is required by law.")),
        mistakes = listOf(CommonMistake("Don't to open","Don't open","Base verb after 'don't'."))
    )

    // ═══ PE1 ═══
    private fun practicalEnglish1() = base(7, "Practical English 1 — Checking in", "انگلیسی کاربردی ۱ — پذیرش هتل",
        listOf("Check into a hotel","Spell names","Ask for information","Use polite requests"),
        listOf(
            v("reception","پذیرش","Go to reception.","به پذیرش برو."),
            v("check in","پذیرش شدن","I'd like to check in.","می‌خواهم پذیرش شوم.","verb"),
            v("reservation","رزرو","I have a reservation.","رزرو دارم."),
            v("key card","کارت کلید","Here's your key card.","این کارت کلید شماست."),
            v("room","اتاق","Room 305.","اتاق ۳۰۵."),
            v("breakfast","صبحانه","Is breakfast included?","صبحانه شامل می‌شود؟"),
            v("lift","آسانسور","The lift is on the left.","آسانسور سمت چپ است."),
            v("passport","پاسپورت","Can I see your passport?","پاسپورتتان را ببینم؟")
        ),
        listOf(
            GrammarSection("Polite requests","I'd like... Can I...? Could you...?"),
            GrammarSection("Checking in","I have a reservation. My name is... Is breakfast included?")
        ),
        listOf(
            d("Receptionist","Good evening. Can I help you?","عصر بخیر. کمکی کنم؟"),
            d("Guest","Yes, I have a reservation. Kowalski.","بله، رزرو دارم. کوالسکی."),
            d("Receptionist","How do you spell that?","چطور هجی می‌کنید؟"),
            d("Guest","K-O-W-A-L-S-K-I.","ک-و-ا-ل-س-ک-ی."),
            d("Receptionist","Can I see your passport?","پاسپورتتان را ببینم؟"),
            d("Guest","Yes, here you are.","بله، بفرمایید."),
            d("Receptionist","You're in room 305.","اتاق ۳۰۵ هستید."),
            d("Guest","Is breakfast included?","صبحانه شامل می‌شود؟"),
            d("Receptionist","Yes, 7 to 10. The lift is on the left.","بله، ۷ تا ۱۰. آسانسور سمت چپ."),
            d("Guest","Thank you very much.","خیلی ممنون.")
        ),
        listOf(
            q("What room is the guest in?",listOf("305","350","503"),0),
            q("What time is breakfast?",listOf("6-9","7-10","8-11"),1),
            q("___ I see your passport?",listOf("Can","Do","Am"),0),
            q("I ___ like to check in.",listOf("would","will","am"),0)
        ),
        idioms = listOf(
            IdiomExpression("Here you are","بفرمایید","Here you are.","بفرمایید."),
            IdiomExpression("Enjoy your stay","اقامت خوبی داشته باشید","Enjoy your stay!","اقامت خوبی داشته باشید!")
        ),
        pronunciation = listOf(PronunciationTip("Polite intonation","Polite questions rise: Can I see your PASSPORT? ↗")),
        culture = listOf(CulturalNote("Hotel check-in","You need a passport or ID to check in.")),
        mistakes = listOf(CommonMistake("I have reservation.","I have a reservation.","Don't forget 'a'."))
    )

    // ═══ R&C 1&2 ═══
    private fun reviseAndCheck1And2() = base(8, "Revise & Check 1 & 2", "مرور و بررسی ۱ و ۲",
        listOf("Review verb be","Review possessives and articles","Review this/that","Review imperatives"),
        listOf(
            v("review","مرور","Let's review.","بیایید مرور کنیم.","verb"),
            v("exercise","تمرین","Do the exercises.","تمرین‌ها را انجام بده."),
            v("mistake","اشتباه","Learn from mistakes.","از اشتباهات یاد بگیر."),
            v("correct","درست","Is this correct?","این درست است؟","adjective"),
            v("remember","به یاد آوردن","Remember the grammar.","گرامر را به یاد بیاور.","verb"),
            v("practice","تمرین کردن","Practice every day.","هر روز تمرین کن.","verb")
        ),
        listOf(
            GrammarSection("Verb be review","I am, you are, he/she/it is, we/you/they are."),
            GrammarSection("Articles review","a book, an umbrella, the book."),
            GrammarSection("Possessive adjectives","my, your, his, her, its, our, their.")
        ),
        listOf(
            d("Teacher","Let's review Files 1 and 2.","بیایید فایل‌های ۱ و ۲ را مرور کنیم."),
            d("A","Verb be! I am, you are, he is...","فعل be! I am، you are، he is..."),
            d("B","And possessive adjectives. My, your, his, her.","و صفت‌های ملکی. my، your، his، her."),
            d("Teacher","What about a/an?","a/an چطور؟"),
            d("A","a before consonants, an before vowels.","a قبل از صامت، an قبل از مصوت."),
            d("B","And this/that/these/those.","و this/that/these/those."),
            d("Teacher","Now imperatives.","حالا imperativeها."),
            d("A","Open the door. Don't close it.","در را باز کن. نبندش."),
            d("B","Let's go home.","بیا به خانه برویم."),
            d("Teacher","Perfect!","عالی!")
        ),
        listOf(
            q("Which form of be with 'they'?",listOf("am","is","are"),2),
            q("Article before 'umbrella'?",listOf("a","an","the"),1),
            q("___ is my book. (near, sing.)",listOf("This","These","Those"),0),
            q("___ open the door!",listOf("Not","Don't","No"),1)
        ),
        idioms = listOf(IdiomExpression("Let's review","بیایید مرور کنیم","Let's review.","بیایید مرور کنیم.")),
        pronunciation = listOf(PronunciationTip("Review intonation","Statements fall, questions rise.")),
        culture = listOf(CulturalNote("Reviewing","Regular review is essential for language learning.")),
        mistakes = listOf(CommonMistake("They is happy.","They are happy.","Use 'are' with plural."))
    )

    // ═══ 3A ═══
    private fun file3A() = base(9, "Britain: the good and the bad", "بریتانیا: خوب و بد",
        listOf("Present simple: positive and negative","Talk about likes/dislikes","Use verb phrases"),
        listOf(
            v("weather","هوا","The weather is bad.","هوا بد است."),
            v("food","غذا","British food isn't famous.","غذای بریتانیایی معروف نیست."),
            v("people","مردم","The people are friendly.","مردم خوش‌برخورد هستند."),
            v("city","شهر","London is a great city.","لندن شهر بزرگی است."),
            v("countryside","حومه","The countryside is beautiful.","حومه زیباست."),
            v("tea","چای","British people love tea.","مردم بریتانیا عاشق چای هستند."),
            v("pub","میخانه","Pubs are important.","میخانه‌ها مهم هستند."),
            v("traffic","ترافیک","The traffic is terrible.","ترافیک وحشتناک است.")
        ),
        listOf(
            GrammarSection("Present simple (positive)","I/you/we/they like. He/she/it likes."),
            GrammarSection("Present simple (negative)","I don't like. He/she/it doesn't like.")
        ),
        listOf(
            d("A","What do you think of Britain?","نظرت درباره بریتانیا چیست؟"),
            d("B","The good thing is the people. Very friendly.","نکته خوبش مردم. خیلی خوش‌برخورد."),
            d("A","And the bad thing?","و نکته بدش؟"),
            d("B","The weather! It rains all the time.","هوا! همیشه باران می‌آید."),
            d("A","But the countryside is beautiful.","ولی حومه زیباست."),
            d("B","Yes, I love the countryside. And British tea.","بله، عاشق حومه‌ام. و چای بریتانیایی."),
            d("A","Do you like British food?","غذای بریتانیایی دوست داری؟"),
            d("B","Not really. I don't like fish and chips.","نه زیاد. ماهی و سیب‌زمینی دوست ندارم."),
            d("A","What about London?","لندن چطور؟"),
            d("B","Exciting but very expensive.","هیجان‌انگیز ولی خیلی گران.")
        ),
        listOf(
            q("What does B like?",listOf("food","people","weather"),1),
            q("What doesn't B like?",listOf("tea","fish and chips","countryside"),1),
            q("I ___ fish and chips.",listOf("not like","don't like","doesn't like"),1),
            q("She ___ British tea.",listOf("love","loves","loving"),1)
        ),
        idioms = listOf(
            IdiomExpression("Fish and chips","ماهی و سیب‌زمینی","Fish and chips.","ماهی و سیب‌زمینی."),
            IdiomExpression("All the time","همیشه","It rains all the time.","همیشه باران می‌آید.")
        ),
        pronunciation = listOf(PronunciationTip("Third-person -s","like → likes /laɪks/, love → loves /lʌvz/.")),
        culture = listOf(CulturalNote("Pubs","Pubs are important in British social life.")),
        mistakes = listOf(CommonMistake("I no like tea.","I don't like tea.","Use don't/doesn't."))
    )

    // ═══ 3B ═══
    private fun file3B() = base(10, "Love me, love my dog", "منو دوست داشته باش، سگمو هم",
        listOf("Present simple questions","Question words","Talk about pets"),
        listOf(
            v("dog","سگ","I have a dog.","سگ دارم."),
            v("cat","گربه","Two cats.","دو گربه."),
            v("pet","حیوان خانگی","Do you have pets?","حیوان خانگی داری؟"),
            v("walk","پیاده‌روی","I walk my dog.","سگم را پیاده‌روی می‌برم.","verb"),
            v("feed","غذا دادن","Who feeds the cat?","چه کسی به گربه غذا می‌دهد؟","verb"),
            v("play","بازی کردن","The dog plays.","سگ بازی می‌کند.","verb"),
            v("sleep","خوابیدن","My cat sleeps all day.","گربه‌ام تمام روز می‌خوابد.","verb"),
            v("animal","حیوان","I love animals.","عاشق حیواناتم.")
        ),
        listOf(
            GrammarSection("Present simple questions","Do you...? Does he/she/it...? Yes, I do. / No, I don't."),
            GrammarSection("Question words","What, Where, When, Who, Why, How.")
        ),
        listOf(
            d("A","Do you have any pets?","حیوان خانگی داری؟"),
            d("B","Yes, a dog. His name is Barry.","بله، یک سگ. اسمش بری است."),
            d("A","What's he like?","چه جوریه؟"),
            d("B","Very friendly. He loves people.","خیلی خوش‌برخورد. عاشق مردم است."),
            d("A","Do you walk him every day?","هر روز پیاده‌روی می‌بری‌اش؟"),
            d("B","Twice a day. Morning and evening.","دو بار در روز. صبح و عصر."),
            d("A","Where do you go?","کجا می‌روید؟"),
            d("B","To the park near my house.","به پارک نزدیک خانه‌ام."),
            d("A","Does he like other dogs?","سگ‌های دیگر را دوست دارد؟"),
            d("B","Most. But he doesn't like big dogs.","بیشترشان. ولی سگ‌های بزرگ را دوست ندارد."),
            d("A","What does he eat?","چی می‌خورد؟"),
            d("B","Dog food. Favourite is chicken.","غذای سگ. مورد علاقه‌اش مرغ.")
        ),
        listOf(
            q("What pet?",listOf("cat","dog","bird"),1),
            q("How often walk?",listOf("once","twice","three times"),1),
            q("___ you like dogs?",listOf("Do","Does","Are"),0),
            q("___ she have a cat?",listOf("Do","Does","Is"),1)
        ),
        idioms = listOf(
            IdiomExpression("Twice a day","دو بار در روز","Twice a day.","دو بار در روز."),
            IdiomExpression("Most of them","بیشترشان","Most of them.","بیشترشان.")
        ),
        pronunciation = listOf(PronunciationTip("Do / Does","Weak: Do you /də jə/, Does he /dəz i/.")),
        culture = listOf(CulturalNote("Pets","About 50% of UK households have a pet.")),
        mistakes = listOf(CommonMistake("Does she likes?","Does she like?","Base verb after 'does'."))
    )

    // ═══ 3C ═══
    private fun file3C() = base(11, "From morning to night", "از صبح تا شب",
        listOf("Daily routines","Present simple with time","Adverbs of frequency","Tell the time"),
        listOf(
            v("wake up","بیدار شدن","I wake up at 7.","ساعت ۷ بیدار می‌شوم.","verb"),
            v("get up","از خواب بلند شدن","She gets up early.","زود بلند می‌شود.","verb"),
            v("have a shower","دوش گرفتن","He has a shower.","دوش می‌گیرد.","verb"),
            v("have breakfast","صبحانه خوردن","We have breakfast at 8.","ساعت ۸ صبحانه می‌خوریم.","verb"),
            v("go to work","به سر کار رفتن","She goes to work at 9.","ساعت ۹ به سر کار می‌رود.","verb"),
            v("come home","به خانه آمدن","I come home at 6.","ساعت ۶ به خانه می‌آیم.","verb"),
            v("go to bed","به رختخواب رفتن","They go to bed at 11.","ساعت ۱۱ می‌خوابند.","verb"),
            v("early","زود","I wake up early.","زود بیدار می‌شوم.","adverb"),
            v("late","دیر","He goes to bed late.","دیر می‌خوابد.","adverb")
        ),
        listOf(
            GrammarSection("Present simple + time","I get up at 7. She has lunch at 12.30."),
            GrammarSection("Adverbs of frequency","always, usually, often, sometimes, hardly ever, never — before main verb."),
            GrammarSection("Telling the time","at 7 o'clock, at half past 8, at quarter to 9.")
        ),
        listOf(
            d("A","What time do you get up?","چه ساعتی بیدار می‌شوی؟"),
            d("B","Usually at 7 o'clock.","معمولاً ساعت ۷."),
            d("A","Do you have breakfast?","صبحانه می‌خوری؟"),
            d("B","Yes, always. Coffee and toast.","بله، همیشه. قهوه و نان تست."),
            d("A","What time do you go to work?","چه ساعتی به سر کار می‌روی؟"),
            d("B","I leave home at 8.30. Work starts at 9.","ساعت ۸:۳۰ از خانه. کار ۹ شروع."),
            d("A","When do you finish?","کی تمام می‌کنی؟"),
            d("B","At 5.30. Then the gym.","ساعت ۵:۳۰. بعد باشگاه."),
            d("A","Dinner time?","وقت شام؟"),
            d("B","About 8. Then TV.","حدود ساعت ۸. بعد تلویزیون."),
            d("A","What time do you go to bed?","چه ساعتی می‌خوابی؟"),
            d("B","Usually at 11.","معمولاً ساعت ۱۱.")
        ),
        listOf(
            q("What time get up?",listOf("6","7","8"),1),
            q("After work?",listOf("home","gym","park"),1),
            q("I ___ get up early.",listOf("usual","usually","usualy"),1),
            q("She has lunch ___ 12.30.",listOf("in","on","at"),2)
        ),
        idioms = listOf(
            IdiomExpression("At o'clock","ساعت","At 7 o'clock.","ساعت ۷."),
            IdiomExpression("Half past","نیم ساعت بعد","Half past 8.","ساعت ۸:۳۰.")
        ),
        pronunciation = listOf(PronunciationTip("Telling the time","7.15 = quarter past seven, 7.45 = quarter to eight.")),
        culture = listOf(CulturalNote("Routines","Daily routines vary widely across cultures.")),
        mistakes = listOf(CommonMistake("at 7 in the morning AM","at 7 in the morning","Don't use AM with 'in the morning'."))
    )

    // ═══ 4A ═══
    private fun file4A() = base(12, "Blue Zones", "مناطق آبی",
        listOf("Present simple review","Healthy lifestyles","Frequency expressions"),
        listOf(
            v("healthy","سالم","A healthy lifestyle.","سبک زندگی سالم.","adjective"),
            v("unhealthy","ناسالم","Fast food is unhealthy.","فست‌فود ناسالم است.","adjective"),
            v("exercise","ورزش","I exercise every day.","هر روز ورزش می‌کنم."),
            v("diet","رژیم","Mediterranean diet is healthy.","رژیم مدیترانه‌ای سالم است."),
            v("stress","استرس","Too much stress is bad.","استرس زیاد بد است."),
            v("sleep","خواب","I need 8 hours of sleep.","به ۸ ساعت خواب نیاز دارم."),
            v("vegetables","سبزیجات","Eat lots of vegetables.","سبزیجات زیادی بخور."),
            v("fruit","میوه","Fruit is good for you.","میوه برایت خوب است.")
        ),
        listOf(
            GrammarSection("Present simple review","I exercise. She doesn't smoke. Do you eat vegetables?"),
            GrammarSection("Frequency expressions","every day, once a week, twice a month.")
        ),
        listOf(
            d("A","What are Blue Zones?","مناطق آبی چیست؟"),
            d("B","Places where people live very long lives.","جاهایی که مردم عمر طولانی دارند."),
            d("A","Where?","کجا؟"),
            d("B","Japan, Italy, Greece, Costa Rica, California.","ژاپن، ایتالیا، یونان، کاستاریکا، کالیفرنیا."),
            d("A","Secret?","راز؟"),
            d("B","Healthy lifestyle. Vegetables and fruit.","سبک سالم. سبزیجات و میوه."),
            d("A","Do they exercise?","ورزش می‌کنند؟"),
            d("B","Yes, but not in a gym. They walk a lot.","بله، ولی نه در باشگاه. زیاد پیاده‌روی می‌کنند."),
            d("A","Stress?","استرس؟"),
            d("B","Not much. They relax with family.","زیاد نه. با خانواده استراحت می‌کنند."),
            d("A","How often meat?","چند وقت یکبار گوشت؟"),
            d("B","Once or twice a week. Mostly vegetables.","یک یا دو بار در هفته. بیشتر سبزیجات.")
        ),
        listOf(
            q("Where are Blue Zones?",listOf("Japan, Italy, Greece","China, Korea","France, Spain"),0),
            q("How often meat?",listOf("every day","once or twice a week","never"),1),
            q("How often ___ you exercise?",listOf("do","does","are"),0),
            q("She ___ eat fast food.",listOf("don't","doesn't","isn't"),1)
        ),
        idioms = listOf(
            IdiomExpression("Long life","زندگی طولانی","Long lives.","زندگی طولانی."),
            IdiomExpression("Spend time","وقت گذراندن","Spend time with family.","با خانواده وقت گذراندن.")
        ),
        pronunciation = listOf(PronunciationTip("Frequency stress","EVery day, TWICE a week.")),
        culture = listOf(CulturalNote("Blue Zones","Regions where people live significantly longer than average.")),
        mistakes = listOf(CommonMistake("How often you exercise?","How often do you exercise?","Use 'do'."))
    )

    // ═══ 4B ═══
    private fun file4B() = base(13, "Vote for me!", "به من رأی بده!",
        listOf("Can/can't for ability and permission","Adverbs of manner","Leadership"),
        listOf(
            v("vote","رأی دادن","Vote for me!","به من رأی بده!","verb"),
            v("leader","رهبر","A good leader.","رهبر خوب."),
            v("promise","قول دادن","I promise to help.","قول می‌دهم کمک کنم.","verb"),
            v("change","تغییر","We need change.","به تغییر نیاز داریم."),
            v("future","آینده","Think about the future.","به آینده فکر کن."),
            v("together","با هم","Work together.","با هم کار کنید.","adverb"),
            v("strong","قوی","She's strong.","او قوی است.","adjective"),
            v("honest","صادق","He's honest.","او صادق است.","adjective")
        ),
        listOf(
            GrammarSection("Can / Can't","I can speak three languages. She can't drive."),
            GrammarSection("Permission","Can I go? You can't smoke here."),
            GrammarSection("Adverbs of manner","quickly, slowly, well, badly. She speaks well.")
        ),
        listOf(
            d("A","Are you going to vote?","قرار است رأی بدهی؟"),
            d("B","Yes. But I don't know who.","بله. ولی نمی‌دانم به کی."),
            d("A","What do you want in a leader?","از رهبر چه می‌خواهی؟"),
            d("B","Honest and smart. Can make change.","صادق و باهوش. بتواند تغییر ایجاد کند."),
            d("A","Can you trust politicians?","به سیاستمداران اعتماد می‌کنی؟"),
            d("B","Not always. Some are good.","نه همیشه. بعضی خوبند."),
            d("A","Most important things?","مهم‌ترین چیزها؟"),
            d("B","Education and healthcare.","آموزش و بهداشت."),
            d("A","Can government change these?","دولت می‌تواند تغییر دهد؟"),
            d("B","Yes, but we work together.","بله، ولی با هم کار کنیم.")
        ),
        listOf(
            q("What in a leader?",listOf("rich","honest and smart","famous"),1),
            q("What is important?",listOf("education","sports","music"),0),
            q("She ___ speak 3 languages.",listOf("can","cans","can to"),0),
            q("He speaks English ___.",listOf("good","well","nice"),1)
        ),
        idioms = listOf(
            IdiomExpression("Good for you","آفرین","Good for you!","آفرین!"),
            IdiomExpression("Every vote counts","هر رأی مهم است","Every vote counts.","هر رأی مهم است.")
        ),
        pronunciation = listOf(PronunciationTip("Can / Can't","British: can /kæn/ vs. can't /kɑːnt/.")),
        culture = listOf(CulturalNote("Voting","A right and responsibility in many countries.")),
        mistakes = listOf(CommonMistake("She cans swim.","She can swim.","Modals don't take -s."))
    )

    // ═══ 4C ═══
    private fun file4C() = base(14, "A quiet life?", "یک زندگی آرام؟",
        listOf("Present continuous","Present continuous vs. simple","Actions happening now"),
        listOf(
            v("quiet","آرام","A quiet life.","زندگی آرام.","adjective"),
            v("noisy","پر سر و صدا","The city is noisy.","شهر پر سر و صداست.","adjective"),
            v("busy","شلوغ","She's busy.","او شلوغ است.","adjective"),
            v("relax","استراحت","I'm relaxing.","استراحت می‌کنم.","verb"),
            v("enjoy","لذت بردن","Enjoying the sun.","از آفتاب لذت بردن.","verb"),
            v("read","خواندن","Reading a book.","کتاب خواندن.","verb"),
            v("write","نوشتن","Writing an email.","ایمیل نوشتن.","verb"),
            v("listen","گوش دادن","Listening to music.","موسیقی گوش دادن.","verb"),
            v("watch","تماشا کردن","Watching TV.","تلویزیون تماشا کردن.","verb"),
            v("play","بازی کردن","Children are playing.","بچه‌ها بازی می‌کنند.","verb")
        ),
        listOf(
            GrammarSection("Present continuous","am/is/are + verb-ing. I'm reading. She's writing."),
            GrammarSection("Simple vs. continuous","I read every day (habit). I'm reading now (in progress)."),
            GrammarSection("Questions","What are you doing? Is she reading?")
        ),
        listOf(
            d("A","What are you doing?","چه کار می‌کنی؟"),
            d("B","Relaxing at home. Reading a book.","استراحت. کتاب می‌خوانم."),
            d("A","Good?","خوبه؟"),
            d("B","Yes. About a quiet life in the countryside.","بله. درباره زندگی آرام در حومه."),
            d("A","Family?","خانواده؟"),
            d("B","Wife is cooking. Children are playing outside.","همسرم شام می‌پزد. بچه‌ها بیرون بازی می‌کنند."),
            d("A","Playing what?","چه بازی؟"),
            d("B","Football. They love it.","فوتبال. عاشقش هستند."),
            d("A","Quiet evening?","عصر آرام؟"),
            d("B","Yes. We don't like noisy places.","بله. مکان‌های پر سر و صدا دوست نداریم."),
            d("A","Me neither.","من هم.")
        ),
        listOf(
            q("What is B doing?",listOf("TV","reading","cooking"),1),
            q("Children doing?",listOf("playing football","reading","sleeping"),0),
            q("She ___ writing.",listOf("am","is","are"),1),
            q("They ___ playing.",listOf("am","is","are"),2)
        ),
        idioms = listOf(
            IdiomExpression("Me neither","من هم (منفی)","Me neither.","من هم."),
            IdiomExpression("Sounds nice","خوبه","Sounds nice!","خوبه!")
        ),
        pronunciation = listOf(PronunciationTip("Continuous stress","I'm READing. She's WRITing.")),
        culture = listOf(CulturalNote("Quiet evenings","Many people value quiet evenings at home.")),
        mistakes = listOf(CommonMistake("What you are doing?","What are you doing?","Verb before subject."))
    )

    // ═══ PE2 ═══
    private fun practicalEnglish2() = base(15, "Practical English 2 — At a restaurant", "انگلیسی کاربردی ۲ — در رستوران",
        listOf("Order food","Ask for the bill","Polite requests"),
        listOf(
            v("menu","منو","Can I see the menu?","منو را ببینم؟"),
            v("order","سفارش","Ready to order?","آماده سفارش؟","verb"),
            v("starter","پیش‌غذا","Soup for starters.","برای پیش‌غذا سوپ."),
            v("main course","غذای اصلی","Chicken for main.","مرغ برای اصلی."),
            v("dessert","دسر","Would you like dessert?","دسر میل دارید؟"),
            v("bill","صورت‌حساب","The bill, please.","صورت‌حساب لطفاً."),
            v("tip","انعام","We left a tip.","انعام گذاشتیم."),
            v("still water","آب بدون گاز","Still or sparkling?","بدون گاز یا گازدار؟"),
            v("sparkling water","آب گازدار","Sparkling, please.","گازدار، لطفاً.")
        ),
        listOf(
            GrammarSection("Ordering","I'll have... I'd like... Can I have...?"),
            GrammarSection("Polite requests","Could I have...? Would you like...?")
        ),
        listOf(
            d("Waiter","A table for two?","میز برای دو نفر؟"),
            d("A","Yes. Can we see the menu?","بله. منو را ببینیم؟"),
            d("Waiter","Here you are. Something to drink?","بفرمایید. نوشیدنی؟"),
            d("A","Still water, please.","آب بدون گاز لطفاً."),
            d("B","Sparkling water for me.","آب گازدار برای من."),
            d("Waiter","Ready to order?","آماده سفارش؟"),
            d("A","Soup for starters.","سوپ برای پیش‌غذا."),
            d("B","Salad, please.","سالاد لطفاً."),
            d("Waiter","Main course?","غذای اصلی؟"),
            d("A","Chicken.","مرغ."),
            d("B","Vegetarian? Pasta vegetarian?","گیاه‌خوار؟ پاستا گیاه‌خواره؟"),
            d("Waiter","Yes.","بله."),
            d("B","Pasta then.","پس پاستا."),
            d("A","The bill, please.","صورت‌حساب لطفاً.")
        ),
        listOf(
            q("B orders main?",listOf("chicken","pasta","salad"),1),
            q("A wants water?",listOf("still","sparkling","hot"),0),
            q("I ___ have soup.",listOf("will","am","do"),0),
            q("Can we ___ the bill?",listOf("have","has","having"),0)
        ),
        idioms = listOf(
            IdiomExpression("Here you are","بفرمایید","Here you are.","بفرمایید."),
            IdiomExpression("Anything else?","چیز دیگری؟","Anything else?","چیز دیگری؟")
        ),
        pronunciation = listOf(PronunciationTip("Polite intonation","Rise: Could I have the MENU? ↗")),
        culture = listOf(CulturalNote("Tipping","10-15% tip common in UK restaurants.")),
        mistakes = listOf(CommonMistake("I want the chicken.","I'd like the chicken.","Use 'I'd like'."))
    )

    // ═══ R&C 3&4 ═══
    private fun reviseAndCheck3And4() = base(16, "Revise & Check 3 & 4", "مرور و بررسی ۳ و ۴",
        listOf("Review present simple","Review adverbs","Review can/can't","Review present continuous"),
        listOf(
            v("review","مرور","Let's review.","بیایید مرور کنیم.","verb"),
            v("exercise","تمرین","Do exercises.","تمرین کن."),
            v("grammar","گرامر","Grammar is important.","گرامر مهم است."),
            v("vocabulary","واژگان","New vocabulary.","واژگان جدید."),
            v("mistake","اشتباه","Correct mistakes.","اشتباهات را تصحیح کن."),
            v("practice","تمرین","Practice daily.","هر روز تمرین کن.","verb")
        ),
        listOf(
            GrammarSection("Present simple review","I work. She doesn't work. Do you work?"),
            GrammarSection("Present continuous review","I'm working. She's reading. Are they playing?"),
            GrammarSection("Simple vs. continuous","I work every day. I'm working now.")
        ),
        listOf(
            d("Teacher","Let's review Files 3 and 4.","بیایید فایل‌های ۳ و ۴ را مرور کنیم."),
            d("A","Present simple for habits.","حال ساده برای عادت‌ها."),
            d("B","Continuous for actions now.","استمراری برای کارهای الان."),
            d("Teacher","Example?","مثال؟"),
            d("A","I usually get up at 7, but today I'm getting up at 9.","معمولاً ۷ بیدار می‌شوم، ولی امروز ۹."),
            d("B","Perfect!","عالی!"),
            d("Teacher","Adverbs?","قیدها؟"),
            d("A","Always, usually, often, sometimes, never.","always، usually، often، sometimes، never."),
            d("Teacher","can/can't?","can/can't؟"),
            d("B","Ability or permission.","توانایی یا اجازه."),
            d("Teacher","Very good!","خیلی خوب!")
        ),
        listOf(
            q("Habits tense?",listOf("continuous","simple","past"),1),
            q("Adverbs position?",listOf("before verb","after verb","at end"),0),
            q("She ___ swim well.",listOf("can","cans","can to"),0),
            q("They ___ playing now.",listOf("am","is","are"),2)
        ),
        idioms = listOf(IdiomExpression("Let's review","بیایید مرور کنیم","Let's review.","بیایید مرور کنیم.")),
        pronunciation = listOf(PronunciationTip("Review intonation","Statements fall, yes/no questions rise.")),
        culture = listOf(CulturalNote("Reviewing","Regular review is essential.")),
        mistakes = listOf(CommonMistake("She can swims.","She can swim.","Base verb after 'can'."))
    )

    // ═══ 5A ═══
    private fun file5A() = base(17, "Then and now", "دیروز و امروز",
        listOf("Talk about past and present","Use was/were","Use there was/there were"),
        listOf(
            v("yesterday","دیروز","Yesterday I was at home.","دیروز خانه بودم."),
            v("last week","هفته پیش","Last week we went to London.","هفته پیش به لندن رفتیم."),
            v("ago","پیش","Two years ago.","دو سال پیش."),
            v("child","کودک","When I was a child...","وقتی بچه بودم..."),
            v("young","جوان","He was young.","او جوان بود.","adjective"),
            v("old","پیر","She's old now.","او الان پیر است.","adjective"),
            v("town","شهرستان","My town was small.","شهرستانم کوچک بود."),
            v("building","ساختمان","There were old buildings.","ساختمان‌های قدیمی بودند.")
        ),
        listOf(
            GrammarSection("Was / Were","I/he/she/it was. You/we/they were. Negative: wasn't / weren't."),
            GrammarSection("There was / There were","There was a park. There were many shops."),
            GrammarSection("Time expressions","yesterday, last week, two years ago, in 1990.")
        ),
        listOf(
            d("A","Where were you born?","کجا متولد شدی؟"),
            d("B","I was born in a small town.","در شهرستان کوچکی متولد شدم."),
            d("A","Was it nice?","خوب بود؟"),
            d("B","Yes. There was a big park. There were friendly people.","بله. پارک بزرگی بود. مردم خوش‌برخورد بودند."),
            d("A","Is it different now?","الان متفاوت است؟"),
            d("B","Very. There are new buildings now. It's bigger.","خیلی. الان ساختمان‌های جدید هستند. بزرگ‌تر است."),
            d("A","Were you happy there?","آنجا خوشحال بودی؟"),
            d("B","Yes, very happy. My family was there.","بله، خیلی. خانواده‌ام آنجا بود."),
            d("A","When did you leave?","کی رفتی؟"),
            d("B","Ten years ago. I was eighteen.","ده سال پیش. هجده ساله بودم.")
        ),
        listOf(
            q("Where was B born?",listOf("city","small town","village"),1),
            q("When did B leave?",listOf("5 years ago","10 years ago","15 years ago"),1),
            q("I ___ born in London.",listOf("am","was","were"),1),
            q("They ___ at home yesterday.",listOf("was","were","am"),1)
        ),
        idioms = listOf(
            IdiomExpression("Be born","متولد شدن","I was born in...","متولد شدم در..."),
            IdiomExpression("Years ago","سال‌ها پیش","Two years ago.","دو سال پیش.")
        ),
        pronunciation = listOf(PronunciationTip("Was / Were","Weak: was /wəz/, were /wər/.")),
        culture = listOf(CulturalNote("Talking about the past","Common way to know someone better.")),
        mistakes = listOf(CommonMistake("I were tired.","I was tired.","Use 'was' with I/he/she/it."))
    )

    // ═══ 5B ═══
    private fun file5B() = base(18, "Regular and irregular verbs", "افعال باقاعده و بی‌قاعده",
        listOf("Simple past regular verbs","Simple past irregular verbs","Talk about past actions"),
        listOf(
            v("worked","کار کرد","He worked in a bank.","در بانک کار کرد.","verb"),
            v("visited","بازدید کرد","We visited Paris.","از پاریس بازدید کردیم.","verb"),
            v("went","رفت","I went to the beach.","به ساحل رفتم.","verb"),
            v("saw","دید","She saw a movie.","فیلمی دید.","verb"),
            v("had","داشت","We had dinner.","شام خوردیم.","verb"),
            v("took","گرفت","He took a photo.","عکس گرفت.","verb"),
            v("bought","خرید","I bought a book.","کتابی خریدم.","verb"),
            v("met","ملاقات","We met yesterday.","دیروز ملاقات کردیم.","verb")
        ),
        listOf(
            GrammarSection("Regular verbs: -ed","work → worked, visit → visited, play → played."),
            GrammarSection("Irregular verbs","go → went, see → saw, have → had, take → took, buy → bought, meet → met.")
        ),
        listOf(
            d("A","What did you do last weekend?","آخر هفته گذشته چه کار کردی؟"),
            d("B","I went to the mountains with friends.","با دوستان به کوهستان رفتم."),
            d("A","What did you do there?","آنجا چه کار کردید؟"),
            d("B","We walked a lot and took photos.","زیاد پیاده‌روی کردیم و عکس گرفتیم."),
            d("A","Did you stay overnight?","شب ماندید؟"),
            d("B","Yes. We stayed in a small hotel.","بله. در هتل کوچکی ماندیم."),
            d("A","What did you eat?","چی خوردید؟"),
            d("B","We had traditional food. Delicious.","غذای سنتی خوردیم. خوشمزه."),
            d("A","Did you buy anything?","چیزی خریدی؟"),
            d("B","I bought a small souvenir.","یک سوغات کوچک خریدم.")
        ),
        listOf(
            q("Where did B go?",listOf("beach","mountains","city"),1),
            q("Where did B stay?",listOf("hotel","grandma","friend"),0),
            q("We ___ to the beach.",listOf("go","went","gone"),1),
            q("She ___ a phone last week.",listOf("buy","bought","buying"),1)
        ),
        idioms = listOf(
            IdiomExpression("Overnight","شب ماندن","We stayed overnight.","شب ماندیم."),
            IdiomExpression("Last weekend","آخر هفته گذشته","Last weekend.","آخر هفته گذشته.")
        ),
        pronunciation = listOf(PronunciationTip("-ed endings","/t/ (walked), /d/ (stayed), /ɪd/ (visited).")),
        culture = listOf(CulturalNote("Weekend activities","Many enjoy outdoor activities.")),
        mistakes = listOf(CommonMistake("I goed.","I went.","'Go' is irregular."))
    )

    // ═══ 5C ═══
    private fun file5C() = base(19, "Past simple questions", "سوالات گذشته ساده",
        listOf("Past simple questions","Did + base verb","Short answers"),
        listOf(
            v("did","آیا (گذشته)","Did you go?","رفتی؟","verb"),
            v("when","چه زمانی","When did you arrive?","چه زمانی رسیدی؟"),
            v("where","کجا","Where did you go?","کجا رفتی؟"),
            v("what","چه","What did you do?","چه کار کردی؟"),
            v("who","چه کسی","Who did you meet?","با کی ملاقات کردی؟"),
            v("why","چرا","Why did you leave?","چرا رفتی؟"),
            v("how","چطور","How did you get there?","چطور رفتی آنجا؟"),
            v("last night","دیشب","Last night I slept early.","دیشب زود خوابیدم.")
        ),
        listOf(
            GrammarSection("Past simple questions","Did + subject + base verb. Did you go? Did she work?"),
            GrammarSection("Wh- questions in past","Where did you go? What did she do?"),
            GrammarSection("Short answers","Yes, I did. / No, I didn't.")
        ),
        listOf(
            d("A","Did you have a good weekend?","آخر هفته خوبی داشتی؟"),
            d("B","Yes, I did. I visited my grandmother.","بله. به دیدن مادربزرگم رفتم."),
            d("A","Where does she live?","کجا زندگی می‌کند؟"),
            d("B","In the countryside. It's very quiet.","در حومه. خیلی آرام."),
            d("A","What did you do there?","آنجا چه کار کردید؟"),
            d("B","We cooked and talked. She told old stories.","آشپزی کردیم و صحبت کردیم. او داستان‌های قدیمی گفت."),
            d("A","Did you stay long?","زیاد ماندی؟"),
            d("B","No, just one day. I came back last night.","نه، فقط یک روز. دیشب برگشتم."),
            d("A","Did you enjoy it?","لذت بردی؟"),
            d("B","Yes, very much.","بله، خیلی زیاد.")
        ),
        listOf(
            q("Who did B visit?",listOf("mother","grandmother","aunt"),1),
            q("How long did B stay?",listOf("one day","two days","a week"),0),
            q("___ you go to the party?",listOf("Do","Did","Are"),1),
            q("Where ___ she go?",listOf("do","did","does"),1)
        ),
        idioms = listOf(
            IdiomExpression("Come back","برگشتن","I came back last night.","دیشب برگشتم."),
            IdiomExpression("Very much","خیلی زیاد","Yes, very much.","بله، خیلی زیاد.")
        ),
        pronunciation = listOf(PronunciationTip("Did questions","Weak 'did' /dɪd/ in fast speech.")),
        culture = listOf(CulturalNote("Visiting family","Common weekend activity in many cultures.")),
        mistakes = listOf(CommonMistake("Did you went?","Did you go?","Base verb after 'did'."))
    )

    // ═══ 6A ═══
    private fun file6A() = base(20, "The story behind the photo", "داستان پشت عکس",
        listOf("Past continuous","Describe past scenes","Combine past simple + past continuous"),
        listOf(
            v("photo","عکس","Look at this photo.","به این عکس نگاه کن."),
            v("was raining","باران می‌آمد","It was raining.","باران می‌آمد.","verb"),
            v("was walking","راه می‌رفت","She was walking.","او راه می‌رفت.","verb"),
            v("was wearing","پوشیده بود","He was wearing a hat.","او کلاه پوشیده بود.","verb"),
            v("while","در حالی که","While I was reading...","در حالی که می‌خواندم...","conjunction"),
            v("suddenly","ناگهان","Suddenly it stopped.","ناگهان متوقف شد.","adverb"),
            v("when","وقتی","When I arrived...","وقتی رسیدم...","conjunction"),
            v("scene","صحنه","A beautiful scene.","صحنه زیبا.")
        ),
        listOf(
            GrammarSection("Past continuous","was/were + verb-ing. I was reading. They were playing."),
            GrammarSection("Past continuous + past simple","I was reading when he called. While I was walking, I saw a friend.")
        ),
        listOf(
            d("A","What's this photo of?","این عکس چیست؟"),
            d("B","It's from my holiday. It was raining that day.","از تعطیلاتم. آن روز باران می‌آمد."),
            d("A","What were you doing?","چه کار می‌کردی؟"),
            d("B","I was walking in the old town.","در شهر قدیمی راه می‌رفتم."),
            d("A","Were you alone?","تنها بودی؟"),
            d("B","No, my sister was with me. She was wearing a red coat.","نه، خواهرم با من بود. کاپشن قرمز پوشیده بود."),
            d("A","And what happened?","و چه شد؟"),
            d("B","While we were walking, we saw a small cafe. We went in.","در حالی که راه می‌رفتیم، کافه کوچکی دیدیم. وارد شدیم."),
            d("A","Sounds lovely.","دلپذیر به نظر می‌رسد."),
            d("B","Yes, we had tea and watched the rain.","بله، چای خوردیم و باران را تماشا کردیم.")
        ),
        listOf(
            q("What was the weather?",listOf("sunny","raining","snowing"),1),
            q("What was B wearing?",listOf("red coat","blue hat","black shirt"),0),
            q("I ___ reading when he called.",listOf("am","was","were"),1),
            q("While we ___ walking, we saw a cafe.",listOf("was","were","am"),1)
        ),
        idioms = listOf(
            IdiomExpression("Go in","وارد شدن","We went in.","وارد شدیم."),
            IdiomExpression("Sounds lovely","دلپذیر به نظر می‌رسد","Sounds lovely.","دلپذیر به نظر می‌رسد.")
        ),
        pronunciation = listOf(PronunciationTip("Past continuous stress","Stress the -ing verb: I was WALKing.")),
        culture = listOf(CulturalNote("Old towns","Many European cities have historic old towns worth visiting.")),
        mistakes = listOf(CommonMistake("I was read.","I was reading.","Continuous needs -ing."))
    )

    // ═══ 6B ═══
    private fun file6B() = base(21, "What does she look like?", "او چه شکلی است؟",
        listOf("Describe appearance","Describe personality","Use adverbs"),
        listOf(
            v("tall","قدبلند","He's very tall.","خیلی قدبلند است.","adjective"),
            v("short","کوتاه","She's quite short.","کاملاً کوتاه است.","adjective"),
            v("fat","چاق","He's a bit fat.","کمی چاق است.","adjective"),
            v("thin","لاغر","She's very thin.","خیلی لاغر است.","adjective"),
            v("beard","ریش","He has a beard.","ریش دارد."),
            v("moustache","سبیل","He has a moustache.","سبیل دارد."),
            v("friendly","خوش‌برخورد","She's friendly.","خوش‌برخورد است.","adjective"),
            v("shy","خجالتی","He's shy.","خجالتی است.","adjective")
        ),
        listOf(
            GrammarSection("Describing appearance","He's tall. She has long hair. He wears glasses."),
            GrammarSection("Describing personality","She's friendly. He's shy. They're kind.")
        ),
        listOf(
            d("A","What does your brother look like?","برادرت چه شکلی است؟"),
            d("B","He's tall and thin. He has short black hair.","قدبلند و لاغر. موی کوتاه مشکی."),
            d("A","Does he wear glasses?","عینک می‌زند؟"),
            d("B","Yes, he does. And he has a beard.","بله. و ریش دارد."),
            d("A","What's he like?","چه جور آدمی است؟"),
            d("B","Very friendly and funny.","خیلی خوش‌برخورد و بامزه."),
            d("A","Is he shy?","خجالتی است؟"),
            d("B","No, quite outgoing.","نه، کاملاً برون‌گرا."),
            d("A","Does he look like you?","شبیه توست؟"),
            d("B","Yes, a little. But he's taller.","بله، کمی. ولی قدبلندتر است.")
        ),
        listOf(
            q("How does B's brother look?",listOf("tall, thin","short, fat","medium"),0),
            q("Is he shy?",listOf("yes","no","sometimes"),1),
            q("He ___ glasses.",listOf("wear","wears","wearing"),1),
            q("She's very ___.",listOf("friend","friendly","friendlily"),1)
        ),
        idioms = listOf(
            IdiomExpression("Look like","شبیه بودن","He looks like me.","شبیه من است."),
            IdiomExpression("A bit","کمی","A bit fat.","کمی چاق.")
        ),
        pronunciation = listOf(PronunciationTip("Adjective stress","He's TALL. She's FRIENDly.")),
        culture = listOf(CulturalNote("Describing people","Politeness: focus on positive traits.")),
        mistakes = listOf(CommonMistake("How is he like?","What's he like?","Use 'What' for personality."))
    )

    // ═══ 6C ═══
    private fun file6C() = base(22, "A house with a history", "خانه‌ای با تاریخ",
        listOf("Talk about houses","Use there was/were","Describe homes"),
        listOf(
            v("house","خانه","A big house.","خانه بزرگ."),
            v("flat","آپارتمان","I live in a flat.","در آپارتمان زندگی می‌کنم."),
            v("garden","باغ","A small garden.","باغ کوچک."),
            v("garage","گاراژ","A two-car garage.","گاراژ دو ماشین."),
            v("floor","طبقه","On the second floor.","طبقه دوم."),
            v("stairs","پله‌ها","Go up the stairs.","از پله‌ها بالا برو."),
            v("chimney","دودکش","An old chimney.","دودکش قدیمی."),
            v("modern","مدرن","A modern house.","خانه مدرن.","adjective")
        ),
        listOf(
            GrammarSection("There was / There were","There was a garden. There were three bedrooms."),
            GrammarSection("Describing houses","It's a big house. It has a garden. It was built in 1900.")
        ),
        listOf(
            d("A","Tell me about your house.","از خانه‌ات بگو."),
            d("B","It's an old house with a history.","خانه قدیمی با تاریخ."),
            d("A","How old?","چند ساله؟"),
            d("B","About 150 years. There was a famous writer here.","حدود ۱۵۰ سال. یک نویسنده معروف اینجا بود."),
            d("A","Really? What's it like?","واقعاً؟ چطور است؟"),
            d("B","It's big. There are five bedrooms. There's a large garden.","بزرگ است. پنج اتاق خواب. باغ بزرگ."),
            d("A","Was it always a house?","همیشه خانه بود؟"),
            d("B","No, there was a school here in the 1900s.","نه، در دهه ۱۹۰۰ مدرسه بود."),
            d("A","That's interesting!","جالبه!"),
            d("B","Yes, we love it.","بله، عاشقش هستیم.")
        ),
        listOf(
            q("How old is B's house?",listOf("50","150","250"),1),
            q("What was it before?",listOf("shop","school","church"),1),
            q("___ a big garden.",listOf("There is","There are","There was"),0),
            q("___ three bedrooms.",listOf("There is","There are","There was"),1)
        ),
        idioms = listOf(
            IdiomExpression("A house with a history","خانه‌ای با تاریخ","A house with a history.","خانه‌ای با تاریخ."),
            IdiomExpression("Go up","بالا رفتن","Go up the stairs.","از پله‌ها بالا برو.")
        ),
        pronunciation = listOf(PronunciationTip("There is / There are","Linking: there_is, there_are.")),
        culture = listOf(CulturalNote("Historic houses","Many old houses have interesting histories.")),
        mistakes = listOf(CommonMistake("There is many rooms.","There are many rooms.","'are' for plural."))
    )

    // ═══ PE3 ═══
    private fun practicalEnglish3() = base(23, "Practical English 3 — Shopping", "انگلیسی کاربردی ۳ — خرید",
        listOf("Shop for clothes","Ask about prices and sizes","Try things on"),
        listOf(
            v("size","سایز","What size are you?","چه سایزی هستید؟"),
            v("try on","پرو کردن","Can I try it on?","می‌توانم پرو کنم؟","verb"),
            v("fit","اندازه بودن","It doesn't fit.","اندازه‌ام نیست.","verb"),
            v("change","تعویض","Can I change it?","می‌توانم عوضش کنم؟","verb"),
            v("price","قیمت","What's the price?","قیمتش چقدره؟"),
            v("expensive","گران","Too expensive.","خیلی گران.","adjective"),
            v("cheap","ارزان","Very cheap.","خیلی ارزان.","adjective"),
            v("cash","نقد","Cash or card?","نقد یا کارت؟")
        ),
        listOf(
            GrammarSection("Shopping language","Can I try it on? What size? How much is it?"),
            GrammarSection("Polite requests","Could I have a bigger size? Can I pay by card?")
        ),
        listOf(
            d("Assistant","Can I help you?","کمکی کنم؟"),
            d("A","Yes, I'm looking for a shirt.","بله، دنبال پیراهن هستم."),
            d("Assistant","What size?","چه سایزی؟"),
            d("A","Medium. Can I try this on?","متوسط. می‌توانم این را پرو کنم؟"),
            d("Assistant","Of course. The fitting room is over there.","البته. اتاق پرو آنجاست."),
            d("A","It's too small. Have you got a large?","کوچک است. بزرگ دارید؟"),
            d("Assistant","Here you are.","بفرمایید."),
            d("A","This fits well. How much is it?","اندازه است. چقدر است؟"),
            d("Assistant","$45.","۴۵ دلار."),
            d("A","I'll take it. Can I pay by card?","می‌خرمش. با کارت می‌توانم پرداخت کنم؟"),
            d("Assistant","Yes, of course.","بله، البته.")
        ),
        listOf(
            q("What does A buy?",listOf("shirt","pants","jacket"),0),
            q("How much?",listOf("$35","$45","$55"),1),
            q("Can I ___ it on?",listOf("try","tries","trying"),0),
            q("It doesn't ___ me.",listOf("fit","fits","fitting"),0)
        ),
        idioms = listOf(
            IdiomExpression("Try on","پرو کردن","Try it on.","پرو کن."),
            IdiomExpression("I'll take it","می‌خرمش","I'll take it.","می‌خرمش.")
        ),
        pronunciation = listOf(PronunciationTip("Polite requests","Could I have...? Rise at the end.")),
        culture = listOf(CulturalNote("Sizes","Clothing sizes vary by country.")),
        mistakes = listOf(CommonMistake("It doesn't fit me well.","It doesn't fit me.","Fit doesn't need 'well'."))
    )

    // ═══ R&C 5&6 ═══
    private fun reviseAndCheck5And6() = base(24, "Revise & Check 5 & 6", "مرور و بررسی ۵ و ۶",
        listOf("Review was/were","Review past simple","Review past continuous","Review descriptions"),
        listOf(
            v("review","مرور","Let's review.","بیایید مرور کنیم.","verb"),
            v("was","بود","I was at home.","خانه بودم.","verb"),
            v("went","رفت","She went to Paris.","به پاریس رفت.","verb"),
            v("was walking","راه می‌رفت","He was walking.","او راه می‌رفت.","verb"),
            v("tall","قدبلند","She's tall.","او قدبلند است.","adjective"),
            v("friendly","خوش‌برخورد","He's friendly.","او خوش‌برخورد است.","adjective")
        ),
        listOf(
            GrammarSection("Was / Were","I was. You were. Was he? Were they?"),
            GrammarSection("Past simple","I went. She saw. Did you go?"),
            GrammarSection("Past continuous","I was walking. They were playing.")
        ),
        listOf(
            d("Teacher","Review Files 5 and 6.","مرور فایل‌های ۵ و ۶."),
            d("A","Was/were for the past of 'be'.","was/were برای گذشته 'be'."),
            d("B","Past simple for finished actions.","گذشته ساده برای کارهای تمام‌شده."),
            d("A","Past continuous for actions in progress.","گذشته استمراری برای کارهای در حال انجام."),
            d("Teacher","Examples?","مثال‌ها؟"),
            d("A","I was reading when he called.","داشتم می‌خواندم که او زنگ زد."),
            d("B","She was tall and friendly.","او قدبلند و خوش‌برخورد بود."),
            d("Teacher","Perfect!","عالی!")
        ),
        listOf(
            q("Past of 'be'?",listOf("was/were","went","had"),0),
            q("Which is continuous?",listOf("I went","I was walking","I walk"),1),
            q("She ___ at home yesterday.",listOf("was","were","am"),0),
            q("They ___ playing when I arrived.",listOf("was","were","am"),1)
        ),
        idioms = listOf(IdiomExpression("Let's review","بیایید مرور کنیم","Let's review.","بیایید مرور کنیم.")),
        pronunciation = listOf(PronunciationTip("Past forms","Weak forms: was /wəz/, were /wər/.")),
        culture = listOf(CulturalNote("Reviewing","Essential for retention.")),
        mistakes = listOf(CommonMistake("I were.","I was.","'was' with I/he/she/it."))
    )

    // ═══ 7A ═══
    private fun file7A() = base(25, "The best in the world", "بهترین در جهان",
        listOf("Comparatives","Superlatives","Compare places and things"),
        listOf(
            v("big","بزرگ","A big city.","شهر بزرگ.","adjective"),
            v("bigger","بزرگ‌تر","Bigger than London.","بزرگ‌تر از لندن.","adjective"),
            v("biggest","بزرگ‌ترین","The biggest city.","بزرگ‌ترین شهر.","adjective"),
            v("good","خوب","Good food.","غذای خوب.","adjective"),
            v("better","بهتر","Better than before.","بهتر از قبل.","adjective"),
            v("best","بهترین","The best!","بهترین!","adjective"),
            v("bad","بد","Bad weather.","هوای بد.","adjective"),
            v("worse","بدتر","Worse than yesterday.","بدتر از دیروز.","adjective"),
            v("worst","بدترین","The worst day.","بدترین روز.","adjective")
        ),
        listOf(
            GrammarSection("Comparatives","-er / more + adjective. bigger, more beautiful. than"),
            GrammarSection("Superlatives","-est / most + adjective. the biggest, the most beautiful."),
            GrammarSection("Irregular","good → better → best. bad → worse → worst.")
        ),
        listOf(
            d("A","What's the best city in your country?","بهترین شهر کشورت؟"),
            d("B","I think it's Istanbul. It's bigger and more exciting.","فکر می‌کنم استانبول. بزرگ‌تر و هیجان‌انگیزتر."),
            d("A","Bigger than your capital?","بزرگ‌تر از پایتختت؟"),
            d("B","Yes, much bigger.","بله، خیلی بزرگ‌تر."),
            d("A","What's the best food there?","بهترین غذایش؟"),
            d("B","Seafood. It's the freshest in the country.","غذای دریایی. تازه‌ترین در کشور."),
            d("A","And the worst thing?","و بدترین چیز؟"),
            d("B","The traffic. It's the worst in the region.","ترافیک. بدترین در منطقه."),
            d("A","Every big city has that problem.","هر شهر بزرگی این مشکل را دارد."),
            d("B","Yes, you're right.","بله، حق با توست.")
        ),
        listOf(
            q("Best city for B?",listOf("Ankara","Istanbul","Izmir"),1),
            q("Worst thing?",listOf("traffic","food","people"),0),
            q("She's ___ than me.",listOf("tall","taller","tallest"),1),
            q("It's the ___ city.",listOf("big","bigger","biggest"),2)
        ),
        idioms = listOf(
            IdiomExpression("I think","فکر می‌کنم","I think it's...","فکر می‌کنم..."),
            IdiomExpression("You're right","حق با توست","You're right.","حق با توست.")
        ),
        pronunciation = listOf(PronunciationTip("Comparatives","Stress -er: CHEAper, BETter.")),
        culture = listOf(CulturalNote("Istanbul","A major city spanning Europe and Asia.")),
        mistakes = listOf(CommonMistake("more bigger","bigger","Don't use 'more' with -er."))
    )

    // ═══ 7B ═══
    private fun file7B() = base(26, "Have you ever...?", "تا حالا...؟",
        listOf("Present perfect","Ever / never","Talk about experiences"),
        listOf(
            v("ever","تا حالا","Have you ever been?","تا حالا بوده‌ای؟","adverb"),
            v("never","هرگز","I've never seen it.","هرگز ندیده‌ام.","adverb"),
            v("been","بوده","I've been to Japan.","در ژاپن بوده‌ام.","verb"),
            v("seen","دیده","Have you seen it?","دیده‌ای؟","verb"),
            v("eaten","خورده","I've eaten sushi.","سوشی خورده‌ام.","verb"),
            v("visited","بازدید کرده","I've visited Paris.","از پاریس بازدید کرده‌ام.","verb"),
            v("tried","امتحان کرده","Have you tried it?","امتحانش کرده‌ای؟","verb"),
            v("met","ملاقات کرده","I've met her.","او را ملاقات کرده‌ام.","verb")
        ),
        listOf(
            GrammarSection("Present perfect","have/has + past participle. I've been. She's seen."),
            GrammarSection("Ever / Never","Have you ever...? I've never..."),
            GrammarSection("Present perfect vs. past simple","I've been to India. / I went in 2019.")
        ),
        listOf(
            d("A","Have you ever been abroad?","تا حالا خارج از کشور بوده‌ای؟"),
            d("B","Yes, I've been to India.","بله، در هند بوده‌ام."),
            d("A","Really? When did you go?","واقعاً؟ کی رفتی؟"),
            d("B","I went in 2020. It was amazing.","سال ۲۰۲۰ رفتم. شگفت‌انگیز بود."),
            d("A","Have you tried Indian food?","غذای هندی امتحان کردی؟"),
            d("B","Of course. It's spicy but delicious.","البته. تند ولی خوشمزه."),
            d("A","Have you seen the Taj Mahal?","تاج‌محل را دیدی؟"),
            d("B","Yes. One of the most beautiful places I've ever seen.","بله. یکی از زیباترین جاهایی که دیده‌ام."),
            d("A","Would you go again?","دوباره می‌رفتی؟"),
            d("B","Definitely! I've never been to the south.","قطعاً! هرگز جنوب نبوده‌ام.")
        ),
        listOf(
            q("Where has B been?",listOf("China","India","Japan"),1),
            q("When did B go?",listOf("2018","2019","2020"),2),
            q("Have you ever ___ to Paris?",listOf("be","been","being"),1),
            q("I ___ never seen it.",listOf("have","has","am"),0)
        ),
        idioms = listOf(
            IdiomExpression("Of course","البته","Of course!","البته!"),
            IdiomExpression("Go abroad","خارج رفتن","Have you been abroad?","خارج بوده‌ای؟")
        ),
        pronunciation = listOf(PronunciationTip("Present perfect","Contractions: I've /aɪv/, she's /ʃiːz/.")),
        culture = listOf(CulturalNote("Taj Mahal","A UNESCO World Heritage Site.")),
        mistakes = listOf(CommonMistake("I've saw it.","I've seen it.","Past participle after 'have'."))
    )

    // ═══ 7C ═══
    private fun file7C() = base(27, "Reading in English", "خواندن به انگلیسی",
        listOf("Reading skills","Talk about books","Present perfect + yet/already"),
        listOf(
            v("book","کتاب","A good book.","کتاب خوب."),
            v("novel","رمان","A famous novel.","رمان معروف."),
            v("author","نویسنده","A famous author.","نویسنده معروف."),
            v("story","داستان","A true story.","داستان واقعی."),
            v("yet","هنوز","I haven't read it yet.","هنوز نخوانده‌ام.","adverb"),
            v("already","قبلاً","I've already read it.","قبلاً خوانده‌ام.","adverb"),
            v("just","تازه","I've just finished.","تازه تمام کرده‌ام.","adverb"),
            v("recently","اخیراً","I've recently started.","اخیراً شروع کرده‌ام.","adverb")
        ),
        listOf(
            GrammarSection("Present perfect + yet","I haven't finished yet. Have you read it yet?"),
            GrammarSection("Present perfect + already/just","I've already read it. She's just arrived.")
        ),
        listOf(
            d("A","Have you read the new novel by Ali Smith?","رمان جدید علی اسمیت را خوانده‌ای؟"),
            d("B","Not yet. Is it good?","هنوز نه. خوب است؟"),
            d("A","It's excellent. I've just finished it.","فوق‌العاده. تازه تمامش کرده‌ام."),
            d("B","What's it about?","درباره چیست؟"),
            d("A","It's about family and memory. Very moving.","درباره خانواده و خاطره. خیلی تأثیرگذار."),
            d("B","I've already read two of her books.","من قبلاً دو کتاب از او خوانده‌ام."),
            d("A","Then you'll love this one.","پس این را دوست خواهی داشت."),
            d("B","I'll buy it soon.","به‌زودی می‌خرمش."),
            d("A","You won't be disappointed.","ناامید نخواهی شد.")
        ),
        listOf(
            q("Has B read the new novel?",listOf("yes","no","partly"),1),
            q("Has A finished it?",listOf("yes","no","just started"),0),
            q("I haven't read it ___.",listOf("already","yet","just"),1),
            q("She's ___ arrived.",listOf("yet","already","just"),2)
        ),
        idioms = listOf(
            IdiomExpression("Not yet","هنوز نه","Not yet.","هنوز نه."),
            IdiomExpression("Be about","درباره ... بودن","What's it about?","درباره چیست؟")
        ),
        pronunciation = listOf(PronunciationTip("Yet / Already","'Yet' often at end: I haven't read it YET.")),
        culture = listOf(CulturalNote("Reading","Reading in English improves vocabulary fast.")),
        mistakes = listOf(CommonMistake("I have read it yet.","I haven't read it yet.","'Yet' in negatives."))
    )

    // ═══ 8A ═══
    private fun file8A() = base(28, "Should I stay or should I go?", "بمانم یا بروم؟",
        listOf("Should / shouldn't","Give advice","Talk about problems"),
        listOf(
            v("should","باید","You should rest.","باید استراحت کنی.","verb"),
            v("shouldn't","نباید","You shouldn't smoke.","نباید سیگار بکشی.","verb"),
            v("advice","توصیه","Give me advice.","به من توصیه کن."),
            v("problem","مشکل","I have a problem.","مشکلی دارم."),
            v("worried","نگران","Don't be worried.","نگران نباش.","adjective"),
            v("tired","خسته","You look tired.","خسته به نظر می‌رسی.","adjective"),
            v("rest","استراحت","You should rest.","باید استراحت کنی.","verb"),
            v("doctor","پزشک","See a doctor.","به پزشک مراجعه کن.")
        ),
        listOf(
            GrammarSection("Should / Shouldn't","You should rest. You shouldn't work so much."),
            GrammarSection("Giving advice","I think you should... Maybe you should... Why don't you...?")
        ),
        listOf(
            d("A","You look tired. Are you OK?","خسته به نظر می‌رسی. خوبی؟"),
            d("B","Not really. I can't sleep well.","نه واقعاً. خوب نمی‌خوابم."),
            d("A","You should see a doctor.","باید به پزشک مراجعه کنی."),
            d("B","Maybe. But I'm very busy.","شاید. ولی خیلی سرم شلوغ است."),
            d("A","You shouldn't work so much.","نباید اینقدر کار کنی."),
            d("B","I know. But my job is stressful.","می‌دانم. ولی شغلم پر استرس است."),
            d("A","Why don't you take a holiday?","چرا تعطیلات نمی‌گیری؟"),
            d("B","That's a good idea.","فکر خوبی است."),
            d("A","You should rest. Health is important.","باید استراحت کنی. سلامتی مهم است."),
            d("B","You're right. Thanks.","حق با توست. ممنون.")
        ),
        listOf(
            q("What's B's problem?",listOf("can't sleep","no money","no friends"),0),
            q("What does A suggest?",listOf("see a doctor","work more","travel"),0),
            q("You ___ rest.",listOf("should","shouldn't","are"),0),
            q("You ___ smoke.",listOf("should","shouldn't","are"),1)
        ),
        idioms = listOf(
            IdiomExpression("Take a holiday","تعطیلات گرفتن","Take a holiday.","تعطیلات بگیر."),
            IdiomExpression("You're right","حق با توست","You're right.","حق با توست.")
        ),
        pronunciation = listOf(PronunciationTip("Should","Often reduced: /ʃʊd/ → /ʃəd/.")),
        culture = listOf(CulturalNote("Stress","Work stress is common worldwide.")),
        mistakes = listOf(CommonMistake("You should to rest.","You should rest.","No 'to' after 'should'."))
    )

    // ═══ 8B ═══
    private fun file8B() = base(29, "I've got a problem", "مشکلی دارم",
        listOf("Talk about health problems","Give advice","Use should for health"),
        listOf(
            v("headache","سردرد","I have a headache.","سردرد دارم."),
            v("stomachache","دل‌درد","She has a stomachache.","دل‌درد دارد."),
            v("cold","سرماخوردگی","I have a cold.","سرماخورده‌ام."),
            v("flu","آنفولانزا","He has the flu.","آنفولانزا دارد."),
            v("temperature","تب","Do you have a temperature?","تب داری؟"),
            v("medicine","دارو","Take this medicine.","این دارو را بخور."),
            v("pharmacy","داروخانه","Go to the pharmacy.","به داروخانه برو."),
            v("appointment","نوبت","Make an appointment.","نوبت بگیر.")
        ),
        listOf(
            GrammarSection("Health problems","I have a headache. She's got a cold. He feels sick."),
            GrammarSection("Advice for health","You should rest. You shouldn't eat that.")
        ),
        listOf(
            d("A","What's wrong?","چی شده؟"),
            d("B","I don't feel well. I have a headache.","حالم خوب نیست. سردرد دارم."),
            d("A","Do you have a temperature?","تب داری؟"),
            d("B","Yes, a little. And I'm very tired.","بله، کمی. و خیلی خسته‌ام."),
            d("A","You should go home and rest.","باید به خانه بروی و استراحت کنی."),
            d("B","I have a meeting at 3.","ساعت ۳ جلسه دارم."),
            d("A","You shouldn't go. You need to rest.","نباید بروی. باید استراحت کنی."),
            d("B","Maybe you're right.","شاید حق با توست."),
            d("A","Take some medicine and drink water.","کمی دارو بخور و آب بنوش."),
            d("B","Thanks. I'll go to the pharmacy.","ممنون. به داروخانه می‌روم.")
        ),
        listOf(
            q("What's B's problem?",listOf("headache","stomachache","cold"),0),
            q("What does A suggest?",listOf("work","rest","travel"),1),
            q("You ___ rest.",listOf("should","shouldn't","are"),0),
            q("She has ___ cold.",listOf("a","an","the"),0)
        ),
        idioms = listOf(
            IdiomExpression("Feel well","حال خوب","I don't feel well.","حالم خوب نیست."),
            IdiomExpression("What's wrong?","چی شده؟","What's wrong?","چی شده؟")
        ),
        pronunciation = listOf(PronunciationTip("Health words","Stress: HEADache, STOMachache.")),
        culture = listOf(CulturalNote("Health","Rest and hydration are common advice.")),
        mistakes = listOf(CommonMistake("I have headache.","I have a headache.","Use 'a'."))
    )

    // ═══ 8C ═══
    private fun file8C() = base(30, "Ambitions and dreams", "آرزوها و رؤیاها",
        listOf("Talk about future plans","Use going to","Talk about dreams"),
        listOf(
            v("going to","قصد داشتن","I'm going to travel.","قصد دارم سفر کنم.","verb"),
            v("plan","برنامه","What's your plan?","برنامه‌ات چیست؟"),
            v("dream","رؤیا","Follow your dreams.","رؤیاهایت را دنبال کن."),
            v("ambition","جاه‌طلبی","My ambition is to...","جاه‌طلبی من ..."),
            v("future","آینده","In the future...","در آینده..."),
            v("hope","امیدوار بودن","I hope to...","امیدوارم...","verb"),
            v("learn","یاد گرفتن","Learn a new language.","زبان جدید یاد بگیر.","verb"),
            v("travel","سفر کردن","Travel the world.","جهان را سفر کن.","verb")
        ),
        listOf(
            GrammarSection("Going to for plans","I'm going to travel. She's going to study. We're going to move."),
            GrammarSection("Future time expressions","next year, next month, tomorrow, in 2025.")
        ),
        listOf(
            d("A","What are your plans for the future?","برنامه‌هایت برای آینده؟"),
            d("B","I'm going to learn Spanish.","قصد دارم اسپانیایی یاد بگیرم."),
            d("A","Nice! Why Spanish?","خوبه! چرا اسپانیایی؟"),
            d("B","I'm going to travel in South America next year.","سال بعد قصد دارم به آمریکای جنوبی سفر کنم."),
            d("A","That sounds exciting!","هیجان‌انگیز به نظر می‌رسد!"),
            d("B","Yes. My dream is to see Machu Picchu.","بله. رؤیایم دیدن ماچو پیچو است."),
            d("A","What about work?","کار چطور؟"),
            d("B","I'm going to work online while traveling.","قصد دارم در حین سفر آنلاین کار کنم."),
            d("A","That's a good plan.","برنامه خوبی است."),
            d("B","What about you?","تو چطور؟"),
            d("A","I'm going to start my own business.","قصد دارم کسب‌وکار خودم را راه بیندازم.")
        ),
        listOf(
            q("What is B going to learn?",listOf("French","Spanish","Italian"),1),
            q("Where is B going to travel?",listOf("Asia","South America","Africa"),1),
            q("I ___ going to travel.",listOf("am","is","are"),0),
            q("She ___ going to study.",listOf("am","is","are"),1)
        ),
        idioms = listOf(
            IdiomExpression("Follow your dreams","رؤیاهایت را دنبال کن","Follow your dreams.","رؤیاهایت را دنبال کن."),
            IdiomExpression("Start a business","کسب‌وکار راه انداختن","Start a business.","کسب‌وکار راه بینداز.")
        ),
        pronunciation = listOf(PronunciationTip("Going to","Often pronounced 'gonna' in casual speech.")),
        culture = listOf(CulturalNote("Machu Picchu","An ancient Inca city in Peru.")),
        mistakes = listOf(CommonMistake("I going to travel.","I'm going to travel.","Need 'am/is/are'."))
    )

    // ═══ PE4 ═══
    private fun practicalEnglish4() = base(31, "Practical English 4 — At the doctor's", "انگلیسی کاربردی ۴ — نزد دکتر",
        listOf("Describe symptoms","Make an appointment","Understand doctor's instructions"),
        listOf(
            v("appointment","نوبت","I'd like an appointment.","نوبت می‌خواهم."),
            v("symptom","علامت","What are the symptoms?","علائم چیست؟"),
            v("pain","درد","I have pain here.","اینجا درد دارم."),
            v("prescription","نسخه","Here's your prescription.","این نسخه شماست."),
            v("pharmacy","داروخانه","Go to the pharmacy.","به داروخانه برو."),
            v("twice a day","دو بار در روز","Take it twice a day.","دو بار در روز مصرف کن."),
            v("before meals","قبل از غذا","Take before meals.","قبل از غذا مصرف کن."),
            v("allergic","حساسیت","I'm allergic to...","به ... حساسیت دارم.","adjective")
        ),
        listOf(
            GrammarSection("Describing symptoms","I have a headache. I feel sick. It hurts here."),
            GrammarSection("Doctor's instructions","Take this twice a day. Rest for two days.")
        ),
        listOf(
            d("Receptionist","Good morning. Can I help you?","صبح بخیر. کمکی کنم؟"),
            d("A","Yes, I'd like an appointment with the doctor.","بله، نوبت دکتر می‌خواهم."),
            d("Receptionist","What's the problem?","مشکل چیست؟"),
            d("A","I have a bad headache and a temperature.","سردرد شدید و تب دارم."),
            d("Receptionist","Can you come at 11?","ساعت ۱۱ می‌توانید بیایید؟"),
            d("A","Yes, thank you.","بله، ممنون."),
            d("Doctor","What's wrong?","چی شده؟"),
            d("A","I have a headache and I feel very tired.","سردرد دارم و خیلی خسته‌ام."),
            d("Doctor","Do you have a temperature?","تب داری؟"),
            d("A","Yes, since yesterday.","بله، از دیروز."),
            d("Doctor","You have the flu. Take this medicine twice a day.","آنفولانزا دارید. این دارو را دو بار در روز مصرف کنید."),
            d("A","Thank you, doctor.","ممنون دکتر.")
        ),
        listOf(
            q("What's A's problem?",listOf("headache","stomachache","cold"),0),
            q("What medicine does A need?",listOf("once a day","twice a day","three times"),1),
            q("I'd like ___ appointment.",listOf("a","an","the"),1),
            q("Take it ___ a day.",listOf("one","twice","two"),1)
        ),
        idioms = listOf(
            IdiomExpression("What's wrong?","چی شده؟","What's wrong?","چی شده؟"),
            IdiomExpression("Feel sick","حال بد","I feel sick.","حالم بد است.")
        ),
        pronunciation = listOf(PronunciationTip("Symptoms","Stress: HEADache, TEMperature.")),
        culture = listOf(CulturalNote("Doctor visits","In UK, GP visits are typically free with NHS.")),
        mistakes = listOf(CommonMistake("I have the headache.","I have a headache.","Use 'a' for symptoms."))
    )

    // ═══ R&C 7&8 ═══
    private fun reviseAndCheck7And8() = base(32, "Revise & Check 7 & 8", "مرور و بررسی ۷ و ۸",
        listOf("Review comparatives/superlatives","Review present perfect","Review should","Review going to"),
        listOf(
            v("review","مرور","Let's review.","مرور کنیم.","verb"),
            v("better","بهتر","Better than.","بهتر از.","adjective"),
            v("best","بهترین","The best.","بهترین.","adjective"),
            v("been","بوده","Have you been?","بوده‌ای؟","verb"),
            v("should","باید","You should.","باید.","verb"),
            v("going to","قصد داشتن","I'm going to.","قصد دارم.","verb")
        ),
        listOf(
            GrammarSection("Comparatives review","bigger, better, worse, more beautiful."),
            GrammarSection("Present perfect review","Have you ever...? I've never..."),
            GrammarSection("Modals review","should, shouldn't, going to.")
        ),
        listOf(
            d("Teacher","Review Files 7 and 8.","مرور فایل‌های ۷ و ۸."),
            d("A","Comparatives and superlatives.","مقایسه و بهترین."),
            d("B","Present perfect for experiences.","حال کامل برای تجربه‌ها."),
            d("A","Should for advice.","Should برای توصیه."),
            d("B","Going to for plans.","Going to برای برنامه‌ها."),
            d("Teacher","Examples?","مثال؟"),
            d("A","I've been to Paris. She's the best.","در پاریس بوده‌ام. او بهترین است."),
            d("B","You should rest. I'm going to travel.","باید استراحت کنی. قصد دارم سفر کنم."),
            d("Teacher","Excellent!","عالی!")
        ),
        listOf(
            q("Comparative of 'good'?",listOf("gooder","better","best"),1),
            q("Advice modal?",listOf("should","can","will"),0),
            q("I've ___ to Paris.",listOf("be","been","being"),1),
            q("She's ___ to study.",listOf("go","going","went"),1)
        ),
        idioms = listOf(IdiomExpression("Let's review","بیایید مرور کنیم","Let's review.","بیایید مرور کنیم.")),
        pronunciation = listOf(PronunciationTip("Review","Mixed intonation practice.")),
        culture = listOf(CulturalNote("Reviewing","Essential.")),
        mistakes = listOf(CommonMistake("She's best.","She's the best.","Need 'the' for superlatives."))
    )

    // ═══ 9A ═══
    private fun file9A() = base(33, "What are you doing tonight?", "امشب چه کار می‌کنی؟",
        listOf("Present continuous for future","Make arrangements","Talk about the near future"),
        listOf(
            v("tonight","امشب","What are you doing tonight?","امشب چه کار می‌کنی؟"),
            v("tomorrow","فردا","See you tomorrow.","فردا می‌بینمت."),
            v("meeting","جلسه","I have a meeting.","جلسه دارم."),
            v("arrangement","قرار","An arrangement with friends.","قراری با دوستان."),
            v("free","آزاد","Are you free?","آزادی؟","adjective"),
            v("busy","شلوغ","I'm busy tonight.","امشب شلوغم.","adjective"),
            v("invite","دعوت کردن","I'm inviting friends.","دوستان را دعوت می‌کنم.","verb"),
            v("plan","برنامه","What's the plan?","برنامه چیست؟")
        ),
        listOf(
            GrammarSection("Present continuous for future","I'm meeting Tom tomorrow. We're going to a concert tonight."),
            GrammarSection("Arrangements","What are you doing...? I'm seeing... They're playing...")
        ),
        listOf(
            d("A","What are you doing tonight?","امشب چه کار می‌کنی؟"),
            d("B","I'm seeing some friends. We're going to a restaurant.","دوستانم را می‌بینم. به رستوران می‌رویم."),
            d("A","Nice! What time are you meeting?","خوبه! چه ساعتی ملاقات می‌کنید؟"),
            d("B","At 8. Are you free? Come with us!","ساعت ۸. آزادی؟ با ما بیا!"),
            d("A","I'd love to, but I'm working late.","دوست دارم، ولی تا دیروقت کار می‌کنم."),
            d("B","What about tomorrow?","فردا چطور؟"),
            d("A","Tomorrow I'm playing football.","فردا فوتبال بازی می‌کنم."),
            d("B","You're very busy!","خیلی شلوغی!"),
            d("A","Yes. Saturday?","بله. شنبه؟"),
            d("B","Saturday I'm free. Let's do something.","شنبه آزادم. بیا کاری بکنیم.")
        ),
        listOf(
            q("What's B doing tonight?",listOf("working","seeing friends","playing football"),1),
            q("When is A free?",listOf("tonight","tomorrow","Saturday"),2),
            q("I ___ meeting Tom tomorrow.",listOf("am","is","are"),0),
            q("We ___ going to a concert.",listOf("am","is","are"),2)
        ),
        idioms = listOf(
            IdiomExpression("Free tonight","امشب آزاد","Are you free tonight?","امشب آزادی؟"),
            IdiomExpression("Work late","تا دیروقت کار کردن","I'm working late.","تا دیروقت کار می‌کنم.")
        ),
        pronunciation = listOf(PronunciationTip("Future continuous","Stress the -ing: I'm SEEing friends.")),
        culture = listOf(CulturalNote("Making plans","Common phrases for social arrangements.")),
        mistakes = listOf(CommonMistake("I meet Tom tomorrow.","I'm meeting Tom tomorrow.","Use continuous for arrangements."))
    )

    // ═══ 9B ═══
    private fun file9B() = base(34, "What's the weather like?", "هوا چطور است؟",
        listOf("Talk about weather","Weather forecast","Future with will"),
        listOf(
            v("sunny","آفتابی","It's sunny.","آفتابی است.","adjective"),
            v("rainy","بارانی","A rainy day.","روز بارانی.","adjective"),
            v("cloudy","ابری","It's cloudy.","ابری است.","adjective"),
            v("windy","بادی","It's windy.","بادی است.","adjective"),
            v("snowy","برفی","Snowy weather.","هوای برفی.","adjective"),
            v("forecast","پیش‌بینی","The forecast says rain.","پیش‌بینی می‌گوید باران."),
            v("degree","درجه","20 degrees.","۲۰ درجه."),
            v("will","خواهد","It will rain tomorrow.","فردا باران خواهد آمد.","verb")
        ),
        listOf(
            GrammarSection("Weather","It's sunny. It's raining. It was cold."),
            GrammarSection("Will for prediction","It will rain tomorrow. I think it'll be sunny.")
        ),
        listOf(
            d("A","What's the weather like today?","امروز هوا چطور است؟"),
            d("B","It's cloudy and a bit cold.","ابری و کمی سرد."),
            d("A","What's the forecast for tomorrow?","پیش‌بینی فردا چیست؟"),
            d("B","It will rain in the morning. But sunny in the afternoon.","صبح باران. ولی بعدازظهر آفتابی."),
            d("A","Good. I'm going to the beach.","خوبه. به ساحل می‌روم."),
            d("B","Lucky you! What's the temperature?","خوش به حالت! دما چقدره؟"),
            d("A","About 22 degrees. Perfect.","حدود ۲۲ درجه. عالی."),
            d("B","Sounds nice.","خوبه."),
            d("A","Come with me!","با من بیا!"),
            d("B","I can't. I'll be at work.","نمی‌توانم. سر کار خواهم بود.")
        ),
        listOf(
            q("Today's weather?",listOf("sunny","cloudy","rainy"),1),
            q("Tomorrow morning?",listOf("sunny","rainy","snowy"),1),
            q("It ___ rain tomorrow.",listOf("will","is","are"),0),
            q("It's ___ today.",listOf("cloud","cloudy","clouds"),1)
        ),
        idioms = listOf(
            IdiomExpression("Lucky you!","خوش به حالت!","Lucky you!","خوش به حالت!"),
            IdiomExpression("What's the weather like?","هوا چطور است؟","What's the weather like?","هوا چطور است؟")
        ),
        pronunciation = listOf(PronunciationTip("Weather","/ˈweðər/ — voiced 'th'.")),
        culture = listOf(CulturalNote("Weather small talk","Common conversation starter.")),
        mistakes = listOf(CommonMistake("It will rains.","It will rain.","Base verb after 'will'."))
    )

    // ═══ 9C ═══
    private fun file9C() = base(35, "A trip to London", "سفری به لندن",
        listOf("Plan a trip","Future arrangements","Talk about travel"),
        listOf(
            v("trip","سفر","A trip to London.","سفری به لندن."),
            v("flight","پرواز","My flight is at 9.","پروازم ساعت ۹ است."),
            v("hotel","هتل","Book a hotel.","هتل رزرو کن."),
            v("ticket","بلیت","Buy a ticket.","بلیت بخر."),
            v("sightseeing","گشت‌وگذار","Go sightseeing.","گشت‌وگذار برو."),
            v("museum","موزه","Visit a museum.","موزه را ببین."),
            v("book","رزرو کردن","Book a room.","اتاق رزرو کن.","verb"),
            v("pack","بسته‌بندی","Pack your bags.","چمدانت را ببند.","verb")
        ),
        listOf(
            GrammarSection("Future arrangements","I'm flying to London. We're staying at a hotel."),
            GrammarSection("Making plans","I'm going to visit. We're going to see.")
        ),
        listOf(
            d("A","I'm going to London next week!","هفته بعد به لندن می‌روم!"),
            d("B","Lucky you! How long are you staying?","خوش به حالت! چقدر می‌مانی؟"),
            d("A","Four days. I'm flying on Monday.","چهار روز. دوشنبه پرواز دارم."),
            d("B","Where are you staying?","کجا می‌مانی؟"),
            d("A","At a small hotel near the center.","هتل کوچکی نزدیک مرکز."),
            d("B","What are you going to do there?","آنجا چه کار می‌کنی؟"),
            d("A","I'm going to visit the British Museum and go sightseeing.","قصد دارم موزه بریتانیا را ببینم و گشت‌وگذار کنم."),
            d("B","Sounds great! Don't forget your umbrella.","عالی! چترت را فراموش نکن."),
            d("A","Good idea. It always rains there!","فکر خوبی است. همیشه آنجا باران می‌آید!"),
            d("B","Have a great trip!","سفر خوبی داشته باشی!")
        ),
        listOf(
            q("When is A flying?",listOf("Monday","Tuesday","Sunday"),0),
            q("Where is A staying?",listOf("big hotel","small hotel","hostel"),1),
            q("I ___ flying on Monday.",listOf("am","is","are"),0),
            q("We ___ staying at a hotel.",listOf("am","is","are"),2)
        ),
        idioms = listOf(
            IdiomExpression("Lucky you!","خوش به حالت!","Lucky you!","خوش به حالت!"),
            IdiomExpression("Sightseeing","گشت‌وگذار","Go sightseeing.","گشت‌وگذار برو.")
        ),
        pronunciation = listOf(PronunciationTip("Future arrangements","Stress the time: FLYing on MONday.")),
        culture = listOf(CulturalNote("British Museum","One of the world's greatest museums.")),
        mistakes = listOf(CommonMistake("I fly Monday.","I'm flying on Monday.","Use continuous."))
    )

    // ═══ 10A ═══
    private fun file10A() = base(36, "Something new", "چیزی جدید",
        listOf("Present perfect + for/since","Talk about duration","Life changes"),
        listOf(
            v("for","برای","I've lived here for 5 years.","۵ سال اینجا زندگی کرده‌ام.","preposition"),
            v("since","از","I've worked here since 2019.","از ۲۰۱۹ اینجا کار کرده‌ام.","preposition"),
            v("married","متأهل","We've been married for 10 years.","۱۰ سال است ازدواج کرده‌ایم.","adjective"),
            v("know","شناختن","I've known her since school.","از مدرسه می‌شناسمش.","verb"),
            v("change","تغییر","Life has changed.","زندگی تغییر کرده."),
            v("moved","نقل مکان","We moved here in 2020.","سال ۲۰۲۰ اینجا آمدیم.","verb"),
            v("started","شروع کرد","She started her job.","شغلش را شروع کرد.","verb"),
            v("learned","یاد گرفت","I've learned English.","انگلیسی یاد گرفته‌ام.","verb")
        ),
        listOf(
            GrammarSection("Present perfect + for/since","I've lived here for 5 years. She's worked there since 2019."),
            GrammarSection("For vs. Since","for + period (5 years). since + point (2019).")
        ),
        listOf(
            d("A","How long have you lived here?","چقدر اینجا زندگی کرده‌ای؟"),
            d("B","For about 3 years. I moved here in 2021.","حدود ۳ سال. سال ۲۰۲۱ آمدم."),
            d("A","Do you like it?","دوستش داری؟"),
            d("B","Yes, very much. I've made many friends.","بله، خیلی. دوستان زیادی پیدا کرده‌ام."),
            d("A","How long have you known them?","چقدر می‌شناسی‌شان؟"),
            d("B","Some for 3 years. Others since last year.","بعضی ۳ سال. بعضی از سال پیش."),
            d("A","Have you always lived in this city?","همیشه در این شهر زندگی کرده‌ای؟"),
            d("B","No. I've lived in 3 cities.","نه. در ۳ شهر زندگی کرده‌ام."),
            d("A","Which is your favourite?","کدام مورد علاقه‌ات است؟"),
            d("B","This one. I've been happiest here.","همین. اینجا خوشحال‌ترین بوده‌ام.")
        ),
        listOf(
            q("How long has B lived here?",listOf("1 year","3 years","5 years"),1),
            q("How many cities?",listOf("1","2","3"),2),
            q("I've lived here ___ 3 years.",listOf("since","for","in"),1),
            q("I've worked here ___ 2019.",listOf("for","since","in"),1)
        ),
        idioms = listOf(
            IdiomExpression("How long","چه مدت","How long have you...?","چه مدت...؟"),
            IdiomExpression("Make friends","دوست پیدا کردن","I've made friends.","دوستان پیدا کرده‌ام.")
        ),
        pronunciation = listOf(PronunciationTip("For / Since","Weak 'for' /fər/, strong 'since' /sɪns/.")),
        culture = listOf(CulturalNote("Moving","Moving cities is common for work/study.")),
        mistakes = listOf(CommonMistake("since 3 years","for 3 years","Use 'for' with periods."))
    )

    // ═══ 10B ═══
    private fun file10B() = base(37, "I've just seen a ghost!", "تازه یک روح دیده‌ام!",
        listOf("Present perfect + just/already/yet","News and recent events"),
        listOf(
            v("just","تازه","I've just seen him.","تازه دیده‌امش.","adverb"),
            v("already","قبلاً","She's already left.","او قبلاً رفته.","adverb"),
            v("yet","هنوز","Have you finished yet?","هنوز تمام کرده‌ای؟","adverb"),
            v("arrived","رسید","The train has arrived.","قطار رسیده.","verb"),
            v("left","رفت","He's just left.","تازه رفته.","verb"),
            v("finished","تمام کرد","I've finished.","تمام کرده‌ام.","verb"),
            v("seen","دیده","Have you seen it?","دیده‌ای؟","verb"),
            v("heard","شنیده","I've heard the news.","خبر را شنیده‌ام.","verb")
        ),
        listOf(
            GrammarSection("Present perfect + just","I've just arrived. She's just left."),
            GrammarSection("Present perfect + already/yet","I've already eaten. Have you eaten yet?")
        ),
        listOf(
            d("A","The train has just arrived.","قطار تازه رسیده."),
            d("B","Great! Let's go.","عالی! بیا برویم."),
            d("A","Wait, I haven't bought the tickets yet.","صبر کن، هنوز بلیت نخریده‌ام."),
            d("B","Hurry! I've already packed.","عجله کن! من قبلاً چمدان بسته‌ام."),
            d("A","OK, OK. Where's the ticket office?","باشه. دفتر بلیت کجاست؟"),
            d("B","Over there. I've just seen it.","آنجا. تازه دیده‌ام."),
            d("A","Perfect. Two minutes!","عالی. دو دقیقه!"),
            d("B","The train leaves in 5 minutes.","قطار در ۵ دقیقه حرکت می‌کند."),
            d("A","I've got the tickets!","بلیت‌ها را گرفتم!"),
            d("B","Perfect timing!","عالی شد!")
        ),
        listOf(
            q("What has just arrived?",listOf("bus","train","plane"),1),
            q("Has A bought tickets?",listOf("yes","no","maybe"),1),
            q("I've ___ eaten.",listOf("yet","already","still"),1),
            q("Have you finished ___?",listOf("already","yet","just"),1)
        ),
        idioms = listOf(
            IdiomExpression("Perfect timing","عالی شد","Perfect timing!","عالی شد!"),
            IdiomExpression("Hurry up","عجله کن","Hurry up!","عجله کن!")
        ),
        pronunciation = listOf(PronunciationTip("Just / Yet","'Just' stress: I've JUST arrived.")),
        culture = listOf(CulturalNote("Trains","Trains are common transport in the UK.")),
        mistakes = listOf(CommonMistake("I've already eat.","I've already eaten.","Past participle."))
    )

    // ═══ 10C ═══
    private fun file10C() = base(38, "The story of a musician", "داستان یک موسیقیدان",
        listOf("Biographies","Present perfect + past simple","Talk about achievements"),
        listOf(
            v("musician","موسیقیدان","A famous musician.","موسیقیدان معروف."),
            v("born","متولد","She was born in 1990.","سال ۱۹۹۰ متولد شد.","adjective"),
            v("began","شروع کرد","He began playing at 5.","از ۵ سالگی شروع کرد.","verb"),
            v("became","شد","She became famous.","معروف شد.","verb"),
            v("won","برد","He won a prize.","جایزه برد.","verb"),
            v("released","منتشر کرد","They released an album.","آلبومی منتشر کردند.","verb"),
            v("toured","تور داد","She toured the world.","در جهان تور داد.","verb"),
            v("achievement","دستاورد","A great achievement.","دستاورد بزرگ.")
        ),
        listOf(
            GrammarSection("Biography + present perfect","She has released 5 albums. She released the first in 2015."),
            GrammarSection("Present perfect vs. past simple","She has won many prizes (life). She won a prize in 2020 (specific).")
        ),
        listOf(
            d("A","Tell me about your favourite musician.","از موسیقیدان مورد علاقه‌ات بگو."),
            d("B","She's amazing. She was born in 1990 in Canada.","فوق‌العاده است. سال ۱۹۹۰ در کانادا متولد شد."),
            d("A","When did she start music?","کی موسیقی را شروع کرد؟"),
            d("B","She began at 5. She's played piano for 30 years.","از ۵ سالگی شروع کرد. ۳۰ سال پیانو نواخته."),
            d("A","How many albums?","چند آلبوم؟"),
            d("B","She's released 6 albums. The first was in 2012.","۶ آلبوم منتشر کرده. اولی ۲۰۱۲ بود."),
            d("A","Has she won any prizes?","جایزه‌ای برده؟"),
            d("B","Yes! She's won 3 Grammys.","بله! ۳ گرمی برده."),
            d("A","Amazing!","شگفت‌انگیز!"),
            d("B","She's also toured the world twice.","دو بار هم در جهان تور داده.")
        ),
        listOf(
            q("Where was the musician born?",listOf("USA","Canada","UK"),1),
            q("How many Grammys?",listOf("1","2","3"),2),
            q("She ___ released 6 albums.",listOf("have","has","is"),1),
            q("She ___ the first in 2012.",listOf("has released","released","release"),1)
        ),
        idioms = listOf(
            IdiomExpression("Tour the world","در جهان تور دادن","She toured the world.","در جهان تور داد."),
            IdiomExpression("Release an album","آلبوم منتشر کردن","She released an album.","آلبومی منتشر کرد.")
        ),
        pronunciation = listOf(PronunciationTip("Present perfect","She's released /ʃiːz rɪˈliːst/.")),
        culture = listOf(CulturalNote("Grammys","Major music awards in the US.")),
        mistakes = listOf(CommonMistake("She has released in 2012.","She released in 2012.","Use past simple with specific time."))
    )

    // ═══ PE5 ═══
    private fun practicalEnglish5() = base(39, "Practical English 5 — Directions", "انگلیسی کاربردی ۵ — مسیرها",
        listOf("Ask for directions","Give directions","Use prepositions of movement"),
        listOf(
            v("turn left","به چپ بپیچ","Turn left.","به چپ بپیچ.","verb"),
            v("turn right","به راست بپیچ","Turn right.","به راست بپیچ.","verb"),
            v("go straight","مستقیم برو","Go straight.","مستقیم برو.","verb"),
            v("corner","گوشه","At the corner.","در گوشه."),
            v("traffic lights","چراغ راهنما","At the traffic lights.","در چراغ راهنما."),
            v("roundabout","میدان","At the roundabout.","در میدان."),
            v("past","از کنار","Go past the bank.","از کنار بانک رد شو.","preposition"),
            v("opposite","روبه‌روی","Opposite the park.","روبه‌روی پارک.","preposition")
        ),
        listOf(
            GrammarSection("Imperatives for directions","Turn left. Go straight. Take the first right."),
            GrammarSection("Prepositions of movement","past, along, across, through, into.")
        ),
        listOf(
            d("A","Excuse me, where's the train station?","ببخشید، ایستگاه قطار کجاست؟"),
            d("B","Go straight down this street.","این خیابان را مستقیم برو."),
            d("A","Straight?","مستقیم؟"),
            d("B","Yes. Then turn left at the traffic lights.","بله. بعد در چراغ راهنما به چپ بپیچ."),
            d("A","Left at the lights.","چپ در چراغ‌ها."),
            d("B","Then go past the bank. It's opposite the post office.","بعد از کنار بانک رد شو. روبه‌روی اداره پست است."),
            d("A","How far is it?","چقدر دور است؟"),
            d("B","About 10 minutes on foot.","حدود ۱۰ دقیقه پیاده."),
            d("A","Thank you!","ممنون!"),
            d("B","You're welcome.","خواهش می‌کنم.")
        ),
        listOf(
            q("Where does A want to go?",listOf("bank","station","park"),1),
            q("Where to turn?",listOf("left","right","straight"),0),
            q("Go ___ down this street.",listOf("straight","strait","stright"),0),
            q("It's ___ the post office.",listOf("opposite","next","between"),0)
        ),
        idioms = listOf(
            IdiomExpression("Excuse me","ببخشید","Excuse me.","ببخشید."),
            IdiomExpression("On foot","پیاده","10 minutes on foot.","۱۰ دقیقه پیاده.")
        ),
        pronunciation = listOf(PronunciationTip("Directions","Falling intonation: TURN left. GO straight.")),
        culture = listOf(CulturalNote("Asking directions","Start with 'Excuse me'.")),
        mistakes = listOf(CommonMistake("Go to straight.","Go straight.","No 'to' with 'straight'."))
    )

    // ═══ R&C 9&10 ═══
    private fun reviseAndCheck9And10() = base(40, "Revise & Check 9 & 10", "مرور و بررسی ۹ و ۱۰",
        listOf("Review future forms","Review present perfect","Review duration"),
        listOf(
            v("review","مرور","Let's review.","مرور کنیم.","verb"),
            v("tonight","امشب","Tonight I'm...","امشب..."),
            v("for","برای","For 5 years.","برای ۵ سال.","preposition"),
            v("since","از","Since 2019.","از ۲۰۱۹.","preposition"),
            v("just","تازه","I've just...","تازه...","adverb"),
            v("yet","هنوز","Not yet.","هنوز نه.","adverb")
        ),
        listOf(
            GrammarSection("Future forms","Present continuous (arrangements), will (predictions), going to (plans)."),
            GrammarSection("Present perfect + for/since","For 5 years. Since 2019."),
            GrammarSection("Just / Already / Yet","I've just arrived. Have you eaten yet?")
        ),
        listOf(
            d("Teacher","Review Files 9 and 10.","مرور فایل‌های ۹ و ۱۰."),
            d("A","Future forms: continuous for arrangements.","فرم‌های آینده: استمراری برای قرارها."),
            d("B","Will for predictions, going to for plans.","Will برای پیش‌بینی، going to برای برنامه."),
            d("A","Present perfect with for/since.","حال کامل با for/since."),
            d("B","Just, already, yet.","just، already، yet."),
            d("Teacher","Examples?","مثال؟"),
            d("A","I'm meeting Tom tomorrow. I've lived here for 5 years.","فردا تام را می‌بینم. ۵ سال اینجا زندگی کرده‌ام."),
            d("B","I've just arrived. Have you finished yet?","تازه رسیده‌ام. هنوز تمام کرده‌ای؟"),
            d("Teacher","Excellent!","عالی!")
        ),
        listOf(
            q("Arrangements use?",listOf("will","present continuous","past"),1),
            q("Duration: for or since?",listOf("for 3 years","since 3 years","in 3 years"),0),
            q("I'm ___ Tom tomorrow.",listOf("meet","meeting","met"),1),
            q("I've worked here ___ 2019.",listOf("for","since","in"),1)
        ),
        idioms = listOf(IdiomExpression("Let's review","بیایید مرور کنیم","Let's review.","بیایید مرور کنیم.")),
        pronunciation = listOf(PronunciationTip("For/Since","Weak 'for' /fər/, strong 'since'.")),
        culture = listOf(CulturalNote("Reviewing","Essential.")),
        mistakes = listOf(CommonMistake("since 3 years","for 3 years","'for' + period."))
    )

    // ═══ 11A ═══
    private fun file11A() = base(41, "Have you ever been...?", "تا حالا بوده‌ای...؟",
        listOf("Present perfect for experiences","Talk about trips","Ever/never"),
        listOf(
            v("ever","تا حالا","Have you ever...?","تا حالا...؟","adverb"),
            v("never","هرگز","I've never been.","هرگز نبوده‌ام.","adverb"),
            v("been","بوده","I've been to...","بوده‌ام در...","verb"),
            v("abroad","خارج","Have you been abroad?","خارج بوده‌ای؟","adverb"),
            v("island","جزیره","A beautiful island.","جزیره زیبا."),
            v("coast","ساحل","On the coast.","در ساحل."),
            v("flight","پرواز","A long flight.","پرواز طولانی."),
            v("journey","سفر","A long journey.","سفر طولانی.")
        ),
        listOf(
            GrammarSection("Present perfect for experiences","Have you ever been to...? I've never been."),
            GrammarSection("Ever in questions, never in negatives","Have you ever...? I've never...")
        ),
        listOf(
            d("A","Have you ever been to Asia?","تا حالا آسیا بوده‌ای؟"),
            d("B","Yes, I've been to Japan twice.","بله، دو بار در ژاپن بوده‌ام."),
            d("A","Wow! Have you ever tried sushi in Japan?","واو! تا حالا سوشی در ژاپن امتحان کرده‌ای؟"),
            d("B","Yes, of course. It's amazing there.","بله، البته. آنجا فوق‌العاده است."),
            d("A","Have you ever been to China?","تا حالا چین بوده‌ای؟"),
            d("B","No, never. But I want to.","نه، هرگز. ولی می‌خواهم."),
            d("A","What about Europe?","اروپا چطور؟"),
            d("B","I've been to France and Italy.","در فرانسه و ایتالیا بوده‌ام."),
            d("A","Favourite?","مورد علاقه؟"),
            d("B","Italy. I've never seen a more beautiful country.","ایتالیا. هرگز کشور زیباتری ندیده‌ام.")
        ),
        listOf(
            q("Where has B been twice?",listOf("China","Japan","Italy"),1),
            q("Has B been to China?",listOf("yes","no","maybe"),1),
            q("Have you ___ been to Asia?",listOf("ever","never","already"),0),
            q("I've ___ been to China.",listOf("ever","never","yet"),1)
        ),
        idioms = listOf(
            IdiomExpression("Of course","البته","Of course!","البته!"),
            IdiomExpression("Twice","دو بار","Twice.","دو بار.")
        ),
        pronunciation = listOf(PronunciationTip("Ever / Never","Stress: EV-er, NEV-er.")),
        culture = listOf(CulturalNote("Travel experiences","Common conversation topic.")),
        mistakes = listOf(CommonMistake("I've ever been.","I've never been.","'Ever' in questions."))
    )

    // ═══ 11B ═══
    private fun file11B() = base(42, "Success", "موفقیت",
        listOf("Talk about success","Give opinions","Agree and disagree"),
        listOf(
            v("success","موفقیت","A big success.","موفقیت بزرگ."),
            v("successful","موفق","A successful person.","فرد موفق.","adjective"),
            v("hard work","کار سخت","Hard work pays.","کار سخت نتیجه می‌دهد."),
            v("talent","استعداد","Natural talent.","استعداد طبیعی."),
            v("luck","شانس","Good luck!","موفق باشی!"),
            v("goal","هدف","Reach your goal.","به هدفت برس."),
            v("achieve","دست یافتن","Achieve success.","به موفقیت دست یافتن.","verb"),
            v("opportunity","فرصت","A great opportunity.","فرصت عالی.")
        ),
        listOf(
            GrammarSection("Opinions","I think... In my opinion... I believe..."),
            GrammarSection("Agree / Disagree","I agree. I don't agree. You're right.")
        ),
        listOf(
            d("A","What do you think is the key to success?","به نظرت کلید موفقیت چیست؟"),
            d("B","Hard work, I think. Talent helps but work is more important.","کار سخت، فکر می‌کنم. استعداد کمک می‌کند ولی کار مهم‌تر است."),
            d("A","I don't agree. I think luck matters a lot.","موافق نیستم. فکر می‌کنم شانس خیلی مهم است."),
            d("B","Really? Luck is not enough.","واقعاً؟ شانس کافی نیست."),
            d("A","Maybe. But many successful people were just lucky.","شاید. ولی بسیاری از افراد موفق فقط خوش‌شانس بودند."),
            d("B","In my opinion, luck opens doors, but hard work keeps them open.","به نظر من شانس درها را باز می‌کند، ولی کار سخت باز نگهشان می‌دارد."),
            d("A","That's a good point.","نکته خوبی است."),
            d("B","And having a clear goal is essential.","و داشتن هدف واضح ضروری است."),
            d("A","I agree with that.","با آن موافقم.")
        ),
        listOf(
            q("What does B think is key?",listOf("luck","hard work","talent"),1),
            q("What does A think matters?",listOf("luck","work","money"),0),
            q("I ___ with that.",listOf("agree","agrees","agreeing"),0),
            q("___ my opinion, work is important.",listOf("On","In","At"),1)
        ),
        idioms = listOf(
            IdiomExpression("Key to success","کلید موفقیت","The key to success.","کلید موفقیت."),
            IdiomExpression("Good point","نکته خوبی","That's a good point.","نکته خوبی است.")
        ),
        pronunciation = listOf(PronunciationTip("Opinions","Rise then fall: I THINK it's important.")),
        culture = listOf(CulturalNote("Success","Culturally defined concept.")),
        mistakes = listOf(CommonMistake("In my opinion I think...","In my opinion...","Don't mix."))
    )

    // ═══ 11C ═══
    private fun file11C() = base(43, "Have a nice day!", "روز خوبی داشته باشی!",
        listOf("Say goodbye","Wish people well","End conversations"),
        listOf(
            v("goodbye","خداحافظ","Goodbye!","خداحافظ!"),
            v("see you","می‌بینمت","See you later.","بعداً می‌بینمت."),
            v("take care","مراقب باش","Take care!","مراقب باش!"),
            v("have a nice day","روز خوبی داشته باشی","Have a nice day!","روز خوبی داشته باشی!"),
            v("good luck","موفق باشی","Good luck!","موفق باشی!"),
            v("congratulations","تبریک","Congratulations!","تبریک!"),
            v("cheers","سلامتی (نوشیدن)","Cheers!","سلامتی!"),
            v("welcome","خوش آمدید","You're welcome.","خواهش می‌کنم.")
        ),
        listOf(
            GrammarSection("Saying goodbye","Goodbye. See you. Take care. Have a nice day."),
            GrammarSection("Wishing well","Good luck! Congratulations! Happy birthday!")
        ),
        listOf(
            d("A","I have to go now.","باید الان بروم."),
            d("B","OK. It was nice to see you.","باشه. از دیدنت خوشحال شدم."),
            d("A","You too. Take care!","من هم. مراقب باش!"),
            d("B","Thanks. Have a nice day!","ممنون. روز خوبی داشته باشی!"),
            d("A","Good luck with your exam tomorrow.","فردا در امتحانت موفق باشی."),
            d("B","Thank you! See you next week.","ممنون! هفته بعد می‌بینمت."),
            d("A","See you. Bye!","می‌بینمت. خداحافظ!"),
            d("B","Bye! Say hello to your family.","خداحافظ! به خانواده‌ات سلام برسان."),
            d("A","I will. Thanks!","می‌رسانم. ممنون!")
        ),
        listOf(
            q("What exam does B have?",listOf("math","English","none"),2),
            q("When will they meet?",listOf("tomorrow","next week","next month"),1),
            q("___ care!",listOf("Take","Have","Get"),0),
            q("Have a nice ___!",listOf("day","night","time"),0)
        ),
        idioms = listOf(
            IdiomExpression("Take care","مراقب باش","Take care!","مراقب باش!"),
            IdiomExpression("Have a nice day","روز خوبی داشته باشی","Have a nice day!","روز خوبی داشته باشی!"),
            IdiomExpression("Say hello to...","به ... سلام برسان","Say hello to your family.","به خانواده‌ات سلام برسان.")
        ),
        pronunciation = listOf(PronunciationTip("Farewells","Friendly intonation: Have a NICE day! ↗"))
        ,
        culture = listOf(CulturalNote("Say hello to...","Common polite expression when leaving.")),
        mistakes = listOf(CommonMistake("Say hello to your family from me.","Say hello to your family.","Simpler form preferred."))
    )

    // ═══ 12A ═══
    private fun file12A() = base(44, "The man who changed the world", "مردی که جهان را تغییر داد",
        listOf("Relative clauses: who/that","Describe people","Talk about important figures"),
        listOf(
            v("who","که (برای افراد)","The man who helped.","مردی که کمک کرد.","pronoun"),
            v("that","که","The book that I read.","کتابی که خواندم.","pronoun"),
            v("inventor","مخترع","A famous inventor.","مخترع معروف."),
            v("scientist","دانشمند","A great scientist.","دانشمند بزرگ."),
            v("discovered","کشف کرد","He discovered...","او کشف کرد...","verb"),
            v("invented","اختراع کرد","She invented...","او اختراع کرد...","verb"),
            v("changed","تغییر داد","It changed the world.","جهان را تغییر داد.","verb"),
            v("important","مهم","An important person.","فرد مهم.","adjective")
        ),
        listOf(
            GrammarSection("Relative clauses with who","The man who invented the phone. The woman who discovered..."),
            GrammarSection("Relative clauses with that","The book that changed my life. The idea that helped.")
        ),
        listOf(
            d("A","Who is the most important person in history?","مهم‌ترین فرد تاریخ کیست؟"),
            d("B","I think it's a scientist. Someone who changed how we live.","فکر می‌کنم یک دانشمند. کسی که زندگی ما را تغییر داد."),
            d("A","Like who?","مثل کی؟"),
            d("B","Alexander Fleming. He's the man who discovered penicillin.","الکساندر فلمینگ. مردی که پنی‌سیلین را کشف کرد."),
            d("A","That saved millions of lives.","که جان میلیون‌ها را نجات داد."),
            d("B","Exactly. Or Tim Berners-Lee, who invented the web.","دقیقاً. یا تیم برنرز-لی که وب را اختراع کرد."),
            d("A","The web changed everything.","وب همه چیز را تغییر داد."),
            d("B","Yes. He's a man who made information free.","بله. مردی که اطلاعات را آزاد کرد."),
            d("A","Great choices.","انتخاب‌های عالی.")
        ),
        listOf(
            q("Who discovered penicillin?",listOf("Einstein","Fleming","Newton"),1),
            q("Who invented the web?",listOf("Berners-Lee","Jobs","Gates"),0),
            q("The man ___ discovered it.",listOf("who","which","whose"),0),
            q("The book ___ I read.",listOf("who","that","whose"),1)
        ),
        idioms = listOf(
            IdiomExpression("Change the world","جهان را تغییر دادن","It changed the world.","جهان را تغییر داد."),
            IdiomExpression("Save lives","نجات جان","It saved lives.","جان‌ها را نجات داد.")
        ),
        pronunciation = listOf(PronunciationTip("Who / That","Weak: /huː/ → /hʊ/, /ðæt/ → /ðət/.")),
        culture = listOf(CulturalNote("Penicillin","Discovered by Alexander Fleming in 1928.")),
        mistakes = listOf(CommonMistake("The man which...","The man who...","'Who' for people."))
    )

    // ═══ 12B ═══
    private fun file12B() = base(45, "A famous landmark", "یک نشانه معروف",
        listOf("Describe places","Relative clauses: which/that","Talk about landmarks"),
        listOf(
            v("landmark","نشانه","A famous landmark.","نشانه معروف."),
            v("which","که (برای اشیاء)","The building which...","ساختمانی که...","pronoun"),
            v("tower","برج","The Eiffel Tower.","برج ایفل."),
            v("bridge","پل","A famous bridge.","پل معروف."),
            v("statue","مجسمه","A tall statue.","مجسمه بلند."),
            v("palace","کاخ","An old palace.","کاخ قدیمی."),
            v("designed","طراحی کرد","Designed by...","طراحی شده توسط...","verb"),
            v("built","ساخت","Built in 1889.","در ۱۸۸۹ ساخته شد.","verb")
        ),
        listOf(
            GrammarSection("Relative clauses with which/that","The bridge which connects... The palace that was built..."),
            GrammarSection("Passive","It was built in 1889. It was designed by Eiffel.")
        ),
        listOf(
            d("A","What's the most famous landmark in Paris?","معروف‌ترین نشانه پاریس چیست؟"),
            d("B","The Eiffel Tower. It's the tower which everyone knows.","برج ایفل. برجی که همه می‌شناسند."),
            d("A","When was it built?","کی ساخته شد؟"),
            d("B","In 1889. It was designed by Gustave Eiffel.","در ۱۸۸۹. توسط گوستاو ایفل طراحی شد."),
            d("A","How tall is it?","چقدر بلند است؟"),
            d("B","About 300 meters. It was the tallest building in the world.","حدود ۳۰۰ متر. بلندترین ساختمان جهان بود."),
            d("A","Did people like it at first?","اول مردم دوستش داشتند؟"),
            d("B","No! Many thought it was ugly.","نه! بسیاری فکر می‌کردند زشت است."),
            d("A","Really? Now it's iconic.","واقعاً؟ الان نمادین است."),
            d("B","Yes. It's the symbol which represents Paris.","بله. نمادی که پاریس را نشان می‌دهد.")
        ),
        listOf(
            q("When was Eiffel Tower built?",listOf("1789","1889","1989"),1),
            q("Who designed it?",listOf("Eiffel","Gustave","Paris"),0),
            q("It's the tower ___ is famous.",listOf("who","which","whose"),1),
            q("It ___ built in 1889.",listOf("is","was","were"),1)
        ),
        idioms = listOf(
            IdiomExpression("At first","اول","At first, no.","اول، نه."),
            IdiomExpression("Be iconic","نمادین بودن","It's iconic.","نمادین است.")
        ),
        pronunciation = listOf(PronunciationTip("Which / That","Weak: which /wɪtʃ/, that /ðət/.")),
        culture = listOf(CulturalNote("Eiffel Tower","Built for the 1889 World's Fair.")),
        mistakes = listOf(CommonMistake("It was build.","It was built.","Past participle."))
    )

    // ═══ 12C ═══
    private fun file12C() = base(46, "A year abroad", "یک سال در خارج",
        listOf("Review all tenses","Talk about experiences abroad","Future plans"),
        listOf(
            v("abroad","خارج","A year abroad.","یک سال در خارج."),
            v("exchange","تبادل","A student exchange.","تبادل دانشجویی."),
            v("university","دانشگاه","A good university.","دانشگاه خوب."),
            v("course","دوره","A language course.","دوره زبان."),
            v("host family","خانواده میزبان","Living with a host family.","زندگی با خانواده میزبان."),
            v("culture","فرهنگ","Learn about culture.","درباره فرهنگ یاد بگیر."),
            v("improve","بهبود","Improve your English.","انگلیسی‌ات را بهبود بده.","verb"),
            v("experience","تجربه","A great experience.","تجربه عالی.")
        ),
        listOf(
            GrammarSection("Review all tenses","Present, past, perfect, future."),
            GrammarSection("Talking about a year abroad","I spent a year in... I learned... I'm going to...")
        ),
        listOf(
            d("A","Have you ever studied abroad?","تا حالا خارج درس خوانده‌ای؟"),
            d("B","Yes, I spent a year in Spain.","بله، یک سال در اسپانیا گذراندم."),
            d("A","Really? What did you do there?","واقعاً؟ آنجا چه کار کردی؟"),
            d("B","I took a language course and lived with a host family.","دوره زبان گرفتم و با خانواده میزبان زندگی کردم."),
            d("A","Did your Spanish improve?","اسپانیایی‌ات بهتر شد؟"),
            d("B","A lot. I'm much more fluent now.","خیلی. الان خیلی روان‌تر هستم."),
            d("A","What was the best part?","بهترین بخشش؟"),
            d("B","The people. I made friends from all over the world.","مردم. از سراسر جهان دوست پیدا کردم."),
            d("A","Would you do it again?","دوباره انجامش می‌دادی؟"),
            d("B","Definitely. It was the best experience of my life.","قطعاً. بهترین تجربه زندگی‌ام بود."),
            d("A","Amazing!","شگفت‌انگیز!")
        ),
        listOf(
            q("Where did B study?",listOf("France","Spain","Italy"),1),
            q("What did B improve?",listOf("English","Spanish","French"),1),
            q("I ___ a year in Spain.",listOf("spend","spent","spending"),1),
            q("Did your Spanish ___?",listOf("improve","improved","improving"),0)
        ),
        idioms = listOf(
            IdiomExpression("All over the world","سراسر جهان","Friends from all over the world.","دوستان از سراسر جهان."),
            IdiomExpression("Best experience","بهترین تجربه","Best experience of my life.","بهترین تجربه زندگی‌ام.")
        ),
        pronunciation = listOf(PronunciationTip("Tenses review","Mixed practice.")),
        culture = listOf(CulturalNote("Exchange programs","Popular way to learn language and culture.")),
        mistakes = listOf(CommonMistake("Did your Spanish improved?","Did your Spanish improve?","Base verb after 'did'."))
    )

    // ═══ PE6 ═══
    private fun practicalEnglish6() = base(47, "Practical English 6 — On the phone", "انگلیسی کاربردی ۶ — تلفنی",
        listOf("Make phone calls","Take messages","Leave a message"),
        listOf(
            v("phone call","تماس","Make a phone call.","تماس بگیر."),
            v("message","پیام","Leave a message.","پیام بگذار."),
            v("speaking","صحبت می‌کند","This is Anna speaking.","آنا صحبت می‌کند."),
            v("hold on","صبر کن","Hold on, please.","لطفاً صبر کنید."),
            v("call back","بعداً زنگ بزن","I'll call back.","بعداً زنگ می‌زنم.","verb"),
            v("ring","زنگ زدن","I'll ring you.","زنگ می‌زنم.","verb"),
            v("available","در دسترس","Is she available?","در دسترس است؟","adjective"),
            v("engaged","مشغول","The line is engaged.","خط مشغول است.","adjective")
        ),
        listOf(
            GrammarSection("Phone language","Can I speak to...? Hold on. I'll call back."),
            GrammarSection("Taking messages","Can I take a message? I'll tell her.")
        ),
        listOf(
            d("A","Hello, can I speak to Anna, please?","سلام، می‌توانم با آنا صحبت کنم؟"),
            d("B","Anna speaking.","آنا صحبت می‌کند."),
            d("A","Hi Anna, this is Tom.","سلام آنا، تام هستم."),
            d("B","Oh, hi Tom! How are you?","اوه سلام تام! چطوری؟"),
            d("A","Fine, thanks. Are you free tomorrow?","خوبم، ممنون. فردا آزادی؟"),
            d("B","Let me check. Yes, I am.","بگذار ببینم. بله."),
            d("A","Great. Would you like to have lunch?","عالی. ناهار می‌خواهی بخوریم؟"),
            d("B","I'd love to. What time?","دوست دارم. چه ساعتی؟"),
            d("A","1 PM at the Italian place?","ساعت ۱ در رستوران ایتالیایی؟"),
            d("B","Perfect. See you tomorrow!","عالی. فردا می‌بینمت!"),
            d("A","Bye!","خداحافظ!")
        ),
        listOf(
            q("Who is speaking?",listOf("Anna","Tom","Sara"),0),
            q("Where will they meet?",listOf("Italian","Chinese","French"),0),
            q("Can I ___ to Anna?",listOf("speak","speaks","speaking"),0),
            q("I'll ___ back later.",listOf("call","calls","calling"),0)
        ),
        idioms = listOf(
            IdiomExpression("Hold on","صبر کن","Hold on, please.","لطفاً صبر کنید."),
            IdiomExpression("Call back","بعداً زنگ زدن","I'll call back.","بعداً زنگ می‌زنم."),
            IdiomExpression("This is... speaking","... صحبت می‌کند","This is Tom.","تام هستم.")
        ),
        pronunciation = listOf(PronunciationTip("Phone intonation","Rise at question end: Can I SPEAK to Anna? ↗")),
        culture = listOf(CulturalNote("Phone etiquette","Identify yourself first on the phone.")),
        mistakes = listOf(CommonMistake("I am Tom.","This is Tom.","Use 'This is' on phone."))
    )

    // ═══ R&C 11&12 ═══
    private fun reviseAndCheck11And12() = base(48, "Revise & Check 11 & 12", "مرور و بررسی ۱۱ و ۱۲",
        listOf("Review experiences","Review relative clauses","Review phone language"),
        listOf(
            v("review","مرور","Let's review.","مرور کنیم.","verb"),
            v("ever","تا حالا","Have you ever?","تا حالا؟","adverb"),
            v("who","که","The man who...","مردی که...","pronoun"),
            v("which","که","The book which...","کتابی که...","pronoun"),
            v("abroad","خارج","Been abroad.","خارج بوده.","adverb"),
            v("message","پیام","Leave a message.","پیام بگذار.")
        ),
        listOf(
            GrammarSection("Present perfect review","Have you ever...? I've never..."),
            GrammarSection("Relative clauses","who for people, which/that for things."),
            GrammarSection("Phone language","Can I speak to...? Hold on. Call back.")
        ),
        listOf(
            d("Teacher","Review Files 11 and 12.","مرور فایل‌های ۱۱ و ۱۲."),
            d("A","Present perfect for experiences.","حال کامل برای تجربه‌ها."),
            d("B","Relative clauses: who and which.","بندهای موصولی: who و which."),
            d("A","Phone language.","زبان تلفنی."),
            d("Teacher","Examples?","مثال؟"),
            d("A","Have you ever been abroad?","تا حالا خارج بوده‌ای؟"),
            d("B","The man who invented it. The book which changed me.","مردی که اختراعش کرد. کتابی که مرا تغییر داد."),
            d("A","Can I speak to Anna? Hold on.","می‌توانم با آنا صحبت کنم؟ صبر کن."),
            d("Teacher","Excellent! You finished the book!","عالی! کتاب را تمام کردید!")
        ),
        listOf(
            q("Who for?",listOf("things","people","places"),1),
            q("Which for?",listOf("things","people","names"),0),
            q("Have you ___ been abroad?",listOf("ever","never","yet"),0),
            q("The man ___ helped me.",listOf("which","who","whose"),1)
        ),
        idioms = listOf(IdiomExpression("Let's review","بیایید مرور کنیم","Let's review.","بیایید مرور کنیم.")),
        pronunciation = listOf(PronunciationTip("Final review","Mixed practice.")),
        culture = listOf(CulturalNote("Congratulations!","You've finished Elementary English File!")),
        mistakes = listOf(CommonMistake("The man which...","The man who...","'Who' for people."))
    )
}