package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Four Corners 1 — Complete Course Content
 * 12 Units | Basic (A1)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles and grammar points match the official Cambridge Scope & Sequence
 */
object FourCorners1 {
    const val BOOK_ID = "four_corners_1"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> unit1()
        2 -> unit2()
        3 -> unit3()
        4 -> unit4()
        5 -> unit5()
        6 -> unit6()
        7 -> unit7()
        8 -> unit8()
        9 -> unit9()
        10 -> unit10()
        11 -> unit11()
        12 -> unit12()
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

    // ═══════════════════════════════════════════════════════════════
    // UNIT 1 — New friends | دوستان جدید
    // ═══════════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "New friends", "دوستان جدید",
        listOf(
            "Introduce yourself and others",
            "Say hello and goodbye",
            "Ask for and say names; spell names",
            "Talk about where people are from and what they do"
        ),
        listOf(
            v("hello", "سلام", "Hello! I'm Sara.", "سلام! من سارا هستم.", "interjection"),
            v("hi", "سلام (غیررسمی)", "Hi! How are you?", "سلام! چطوری؟", "interjection"),
            v("good morning", "صبح بخیر", "Good morning, class!", "صبح بخیر، کلاس!", "phrase"),
            v("goodbye", "خداحافظ", "Goodbye! See you soon.", "خداحافظ! به‌زودی می‌بینمت.", "interjection"),
            v("name", "نام", "My name is Ali.", "نام من علی است."),
            v("first name", "نام کوچک", "My first name is Sara.", "نام کوچک من سارا است."),
            v("last name", "نام خانوادگی", "Her last name is Gomez.", "نام خانوادگی او گومز است."),
            v("friend", "دوست", "She's my friend.", "او دوست من است."),
            v("teacher", "معلم", "He's my teacher.", "او معلم من است."),
            v("student", "دانش‌آموز / دانشجو", "I'm a student.", "من دانش‌آموزم."),
            v("class", "کلاس", "Our class starts at 10.", "کلاس ما ساعت ۱۰ شروع می‌شود."),
            v("nice", "خوب / خوشایند", "Nice to meet you!", "از آشنایی با تو خوشحالم!", "adjective"),
            v("job", "شغل", "What's your job?", "شغلت چیست؟"),
            v("actor", "بازیگر", "He's an actor.", "او بازیگر است."),
            v("doctor", "پزشک", "She's a doctor.", "او پزشک است.")
        ),
        listOf(
            GrammarSection("The verb 'be' (present simple)", "Use am with I. Use is with he, she, it. Use are with you, we, they. I am a student. She is my teacher. They are friends."),
            GrammarSection("Possessive adjectives", "my, your, his, her, our, their. My name is Maria. His name is Ricardo. Her name is Yoko."),
            GrammarSection("Subject pronouns", "I, you, he, she, it, we, they. Use them as subjects of sentences."),
            GrammarSection("Yes/No questions with 'be'", "Invert subject and verb: Are you a student? Is she a teacher? What's your name?")
        ),
        listOf(
            d("A", "Hello! I'm Sara. Nice to meet you.", "سلام! من سارا هستم. از آشنایی با تو خوشحالم."),
            d("B", "Hi, Sara! I'm Ali. Nice to meet you too.", "سلام، سارا! من علی هستم. من هم از آشنایی با تو خوشحالم."),
            d("A", "Where are you from, Ali?", "اهل کجایی، علی؟"),
            d("B", "I'm from Iran. I'm from Tehran. And you?", "من اهل ایرانم. از تهرانم. تو چطور؟"),
            d("A", "I'm from Canada. Toronto is my city.", "من اهل کانادام. تورنتو شهر من است."),
            d("B", "Oh, Toronto! That's a beautiful city.", "اوه، تورنتو! آن شهر زیبایی است."),
            d("A", "Thank you. Are you a student here?", "ممنون. اینجا دانشجو هستی؟"),
            d("B", "Yes, I am. I study English. What about you?", "بله، هستم. انگلیسی می‌خوانم. تو چطور؟"),
            d("A", "Me too. We're in the same class!", "من هم. ما در همان کلاس هستیم!"),
            d("B", "Really? That's great. Who's our teacher?", "واقعاً؟ عالی است. معلم ما کیست؟"),
            d("A", "Ms. Johnson. She's from England.", "خانم جانسون. اهل انگلستان است."),
            d("B", "I've heard she's very kind.", "شنیده‌ام خیلی مهربان است."),
            d("A", "She is. She's also very patient.", "هست. همچنین خیلی صبور است."),
            d("B", "That's good for me. I'm a little nervous.", "این برای من خوب است. کمی مضطربم."),
            d("A", "Don't worry. Everyone is nervous on the first day.", "نگران نباش. همه در روز اول مضطرب هستند."),
            d("B", "Thanks, Sara. Is English difficult for you?", "ممنون، سارا. انگلیسی برایت سخت است؟"),
            d("A", "A little. But I practice every day.", "کمی. ولی هر روز تمرین می‌کنم."),
            d("B", "Good idea. What's your phone number?", "فکر خوبی است. شماره تلفنت چیست؟"),
            d("A", "It's 0912-345-6789. What's yours?", "۰۹۱۲-۳۴۵-۶۷۸۹ است. مال تو چیست؟"),
            d("B", "Mine is 0913-987-6543.", "مال من ۰۹۱۳-۹۸۷-۶۵۴۳ است."),
            d("A", "Perfect. Let's study together.", "عالی. بیا با هم درس بخوانیم."),
            d("B", "I'd like that. When are you free?", "دوستش دارم. کی آزادی؟"),
            d("A", "Fridays are good for me. What about you?", "جمعه‌ها برایم خوب است. تو چطور؟"),
            d("B", "Fridays work for me too. Let's meet at the library.", "جمعه‌ها برای من هم خوب است. بیا در کتابخانه ملاقات کنیم."),
            d("A", "Perfect. How about 3 o'clock?", "عالی. ساعت ۳ چطور؟"),
            d("B", "3 o'clock is fine. See you then!", "ساعت ۳ خوب است. تا اون موقع!"),
            d("A", "See you, Ali. Have a good day!", "می‌بینمت، علی. روز خوبی داشته باشی!"),
            d("B", "You too. Bye, Sara!", "تو هم. خداحافظ، سارا!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Oh, one more thing. Is the library near the school?", "اوه، یک چیز دیگر. کتابخانه نزدیک مدرسه است؟"),
            d("A", "Yes, it's very close. Just five minutes.", "بله، خیلی نزدیک است. فقط پنج دقیقه."),
            d("B", "Great. I'll be there at 3.", "عالی. ساعت ۳ آنجا هستم."),
            d("A", "See you Friday!", "جمعه می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!"),
            d("A", "Take care!", "مراقب باش!"),
            d("B", "You too!", "تو هم!")
        ),
        listOf(
            q("What is the man's name?", listOf("Ali", "Sara", "Mr. Smith", "Ms. Johnson"), 0),
            q("Where is Sara from?", listOf("Iran", "Canada", "England", "America"), 1),
            q("Who is their teacher?", listOf("Mr. Smith", "Ms. Johnson", "Mrs. Brown", "Mr. Ali"), 1),
            q("When will they meet?", listOf("Monday", "Wednesday", "Friday", "Sunday"), 2),
            q("I ___ a student.", listOf("am", "is", "are", "be"), 0),
            q("She ___ my friend.", listOf("am", "is", "are", "be"), 1),
            q("They ___ from Iran.", listOf("am", "is", "are", "be"), 2),
            q("___ you from Canada?", listOf("Am", "Is", "Are", "Be"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی با تو خوشحالم", "Nice to meet you.", "از آشنایی با تو خوشحالم."),
            IdiomExpression("Have a good day", "روز خوبی داشته باشی", "Have a good day!", "روز خوبی داشته باشی!"),
            IdiomExpression("Take care", "مراقب باش", "Take care!", "مراقب باش!"),
            IdiomExpression("See you", "می‌بینمت", "See you!", "می‌بینمت!")
        ),
        phrasal = listOf(
            PhrasalVerb("come in", "داخل شدن", "enter", "Please come in.", "لطفاً بیا داخل.", "No"),
            PhrasalVerb("sit down", "نشستن", "take a seat", "Please sit down.", "لطفاً بنشین.", "Yes"),
            PhrasalVerb("stand up", "ایستادن", "rise", "Stand up, please.", "لطفاً بایست.", "Yes"),
            PhrasalVerb("go out", "بیرون رفتن", "leave", "Let's go out tonight.", "بیا امشب بیرون برویم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Alphabet sounds", "A /eɪ/, B /biː/, C /siː/, D /diː/, E /iː/, F /ef/..."),
            PronunciationTip("Contractions with 'be'", "I'm /aɪm/, you're /jɔːr/, he's /hiːz/, she's /ʃiːz/, they're /ðeər/."),
            PronunciationTip("Question intonation", "Are you from Iran? ↗ (rising) I'm from Canada. ↘ (falling)")
        ),
        culture = listOf(
            CulturalNote("Greeting styles", "In English-speaking countries, 'Hello' and 'Hi' are common. A handshake is polite on first meeting."),
            CulturalNote("First names", "Westerners often use first names quickly. In formal settings, use titles like Mr., Mrs., Ms."),
            CulturalNote("Small talk", "Asking about hometown, school, or the weather is common in first conversations.")
        ),
        mistakes = listOf(
            CommonMistake("I is a student.", "I am a student.", "Use 'am' with 'I'."),
            CommonMistake("She are my friend.", "She is my friend.", "Use 'is' with he/she/it."),
            CommonMistake("They is from Iran.", "They are from Iran.", "Use 'are' with they/we/you."),
            CommonMistake("You is from Canada?", "Are you from Canada?", "In questions, invert subject and verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the two speakers' names?", "Ali and Sara."),
            ComprehensionQuestion("Where is each person from?", "Ali is from Tehran, Iran. Sara is from Toronto, Canada."),
            ComprehensionQuestion("What plan do they make?", "They will study at the library on Friday at 3 PM.")
        ),
        speaking = listOf(
            SpeakingTask("Introduce yourself to a new person.", "خودت را به یک فرد جدید معرفی کن.", "Hello, I'm... / Nice to meet you. / I'm from..."),
            SpeakingTask("Ask and answer about origin.", "درباره اهل کجا بودن بپرس و جواب بده.", "Where are you from? / I'm from... / Are you from...?"),
            SpeakingTask("Exchange phone numbers.", "شماره تلفن‌ها را رد و بدل کنید.", "What's your phone number? / It's... / Let's keep in touch.")
        ),
        writing = listOf(
            WritingTask("Write a short self-introduction.", "یک معرفی کوتاه از خودت بنویس.", 80, "Use the verb 'be' and subject pronouns.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 2 — People and places | مردم و مکان‌ها
    // ═══════════════════════════════════════════════════════════════
    private fun unit2() = base(
        2, "People and places", "مردم و مکان‌ها",
        listOf(
            "Ask for and say people's nationalities",
            "Ask for and give phone numbers and email addresses",
            "Identify family members and give their ages",
            "Give information about family and friends"
        ),
        listOf(
            v("people", "مردم", "How many people are there?", "چند نفر آنجا هستند؟"),
            v("place", "مکان", "This is a nice place.", "این مکان خوبی است."),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیست؟"),
            v("Mexican", "مکزیکی", "She's Mexican.", "او مکزیکی است.", "adjective"),
            v("Spanish", "اسپانیایی", "He's Spanish.", "او اسپانیایی است.", "adjective"),
            v("British", "بریتانیایی", "They're British.", "آن‌ها بریتانیایی هستند.", "adjective"),
            v("American", "آمریکایی", "I'm American.", "من آمریکایی هستم.", "adjective"),
            v("family", "خانواده", "This is my family.", "این خانواده من است."),
            v("grandfather", "پدربزرگ", "My grandfather is 80.", "پدربزرگم ۸۰ ساله است."),
            v("grandmother", "مادربزرگ", "My grandmother cooks well.", "مادربزرگم خوب آشپزی می‌کند."),
            v("email address", "آدرس ایمیل", "What's your email address?", "آدرس ایمیلت چیست؟"),
            v("phone number", "شماره تلفن", "My phone number is...", "شماره تلفنم ... است."),
            v("age", "سن", "What's your age?", "سن شما چقدر است؟"),
            v("married", "متأهل", "She's married.", "او متأهل است.", "adjective"),
            v("single", "مجرد", "He's single.", "او مجرد است.", "adjective")
        ),
        listOf(
            GrammarSection("Plural subject pronouns", "we, you, they. Use them with plural verbs: We are students. They are friends."),
            GrammarSection("Questions with 'be' (Wh-)", "What's your name? Where are you from? Who is he? How old are you?"),
            GrammarSection("Who and How old with 'be'", "Who's that? How old is she? Who are they?"),
            GrammarSection("Numbers 0–101", "Practice saying numbers: 0 zero, 1 one, 2 two... 101 one hundred and one."),
            GrammarSection("Nationalities", "Form nationality adjectives: Mexico → Mexican, Spain → Spanish, Britain → British, America → American, Canada → Canadian, China → Chinese.")
        ),
        listOf(
            d("A", "Hi, Maria! How are you?", "سلام، ماریا! چطوری؟"),
            d("B", "I'm fine, thanks. And you?", "خوبم، ممنون. تو چطور؟"),
            d("A", "Good, thanks. Who's that man over there?", "خوبم، ممنون. آن مرد آنجا کیست؟"),
            d("B", "That's my father. His name is Carlos.", "آن پدر من است. نامش کارلوس است."),
            d("A", "Oh, is he Mexican?", "اوه، او مکزیکی است؟"),
            d("B", "Yes, he is. He's from Mexico City.", "بله، هست. اهل مکزیکوسیتی است."),
            d("A", "And the woman next to him?", "و زنی که کنارش است؟"),
            d("B", "That's my mother. She's Spanish.", "آن مادر من است. او اسپانیایی است."),
            d("A", "Wow. So you speak two languages?", "واو. پس دو زبان صحبت می‌کنی؟"),
            d("B", "Yes, Spanish and English.", "بله، اسپانیایی و انگلیسی."),
            d("A", "That's great. How old are your parents?", "عالی است. والدینت چند ساله هستند؟"),
            d("B", "My father is 55 and my mother is 52.", "پدرم ۵۵ و مادرم ۵۲ ساله است."),
            d("A", "Do you have brothers or sisters?", "برادر یا خواهر داری؟"),
            d("B", "I have one brother. He's 20.", "یک برادر دارم. او ۲۰ ساله است."),
            d("A", "Is he a student?", "او دانشجو است؟"),
            d("B", "Yes, he is. He studies engineering.", "بله، هست. مهندسی می‌خواند."),
            d("A", "Nice. What's your email address?", "خوبه. آدرس ایمیلت چیست؟"),
            d("B", "It's maria at email dot com.", "ماریا اَت ایمیل دات کام است."),
            d("A", "Can you spell that for me?", "می‌توانی برایم هجی کنی؟"),
            d("B", "Sure. M-A-R-I-A at email dot com.", "مطمئناً. م-ا-ر-ی-ا اَت ایمیل دات کام."),
            d("A", "Got it. Thanks.", "گرفتم. ممنون."),
            d("B", "What about you? Are you married?", "تو چطور؟ متأهل هستی؟"),
            d("A", "No, I'm single. I'm not married.", "نه، مجردم. متأهل نیستم."),
            d("B", "Do you have a big family?", "خانواده بزرگی داری؟"),
            d("A", "Not really. Just my parents and my sister.", "نه واقعاً. فقط والدینم و خواهرم."),
            d("B", "Where do they live?", "کجا زندگی می‌کنند؟"),
            d("A", "They live in Canada. They're Canadian.", "در کانادا زندگی می‌کنند. کانادایی هستند."),
            d("B", "So you're Canadian too?", "پس تو هم کانادایی هستی؟"),
            d("A", "Yes, I am. But I live here now.", "بله، هستم. ولی الان اینجا زندگی می‌کنم."),
            d("B", "That's interesting. Do you like it here?", "جالب است. اینجا را دوست داری؟"),
            d("A", "Yes, I love it. The people are very friendly.", "بله، عاشقشم. مردم خیلی دوستانه هستند."),
            d("B", "I agree. Well, I should go. My family is waiting.", "موافقم. خب، باید بروم. خانواده‌ام منتظرند."),
            d("A", "Okay. See you tomorrow, Maria.", "باشه. فردا می‌بینمت، ماریا."),
            d("B", "See you, Ali. Bye!", "می‌بینمت، علی. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Oh, one more thing. What's your phone number?", "اوه، یک چیز دیگر. شماره تلفنت چیست؟"),
            d("A", "It's 0912-555-1234.", "۰۹۱۲-۵۵۵-۱۲۳۴ است."),
            d("B", "Thanks. I'll call you later.", "ممنون. بعداً زنگ می‌زنم."),
            d("A", "Perfect. Talk to you soon.", "عالی. به‌زودی صحبت می‌کنیم."),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Where is Maria's father from?", listOf("Spain", "Mexico", "Canada", "America"), 1),
            q("How old is Maria's mother?", listOf("50", "52", "55", "60"), 1),
            q("How many brothers does Maria have?", listOf("0", "1", "2", "3"), 1),
            q("Is Ali married?", listOf("Yes", "No", "Not mentioned", "Divorced"), 1),
            q("___ are you from?", listOf("What", "Who", "Where", "How"), 2),
            q("___ old is your brother?", listOf("What", "Who", "Where", "How"), 3),
            q("___ is that man?", listOf("What", "Who", "Where", "How"), 1),
            q("They ___ from Canada.", listOf("am", "is", "are", "be"), 2)
        ),
        idioms = listOf(
            IdiomExpression("How are you?", "چطوری؟", "How are you?", "چطوری؟"),
            IdiomExpression("See you tomorrow", "فردا می‌بینمت", "See you tomorrow.", "فردا می‌بینمت."),
            IdiomExpression("Talk to you soon", "به‌زودی صحبت می‌کنیم", "Talk to you soon.", "به‌زودی صحبت می‌کنیم."),
            IdiomExpression("I agree", "موافقم", "I agree.", "موافقم.")
        ),
        phrasal = listOf(
            PhrasalVerb("live in", "زندگی کردن در", "reside", "They live in Canada.", "آن‌ها در کانادا زندگی می‌کنند.", "No"),
            PhrasalVerb("come from", "اهل جایی بودن", "originate", "She comes from Spain.", "او اهل اسپانیا است.", "No"),
            PhrasalVerb("grow up", "بزرگ شدن", "spend childhood", "I grew up in Mexico.", "من در مکزیک بزرگ شدم.", "Yes"),
            PhrasalVerb("get married", "ازدواج کردن", "become married", "They got married last year.", "سال گذشته ازدواج کردند.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Nationality stress", "MEXican, SPAnish, BRItish, AmeRICAN, CaNADIAN, CHInese."),
            PronunciationTip("Numbers 13 vs 30", "THIRteen /ˌθɜːrˈtiːn/ vs THIRty /ˈθɜːrti/. Stress the last syllable for -teen."),
            PronunciationTip("'How old' linking", "How old are you? → /haʊˈwoʊld ɑːr juː/ (link 'how' and 'old').")
        ),
        culture = listOf(
            CulturalNote("Nationalities", "In English, nationalities are always capitalized: Mexican, Spanish, British, American."),
            CulturalNote("Family size", "Family size varies across cultures. Asking about family is common in small talk."),
            CulturalNote("Email addresses", "When giving an email address, say 'at' for @ and 'dot' for .")
        ),
        mistakes = listOf(
            CommonMistake("Where you are from?", "Where are you from?", "In questions, invert subject and verb."),
            CommonMistake("How old you are?", "How old are you?", "In questions, invert subject and verb."),
            CommonMistake("She is from Spain. She is Spain.", "She is from Spain. She is Spanish.", "Use 'from + country' or 'nationality'."),
            CommonMistake("I have 20 years.", "I am 20 years old.", "Use 'be + age + years old'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where are Maria's parents from?", "Her father is from Mexico; her mother is from Spain."),
            ComprehensionQuestion("How many languages does Maria speak?", "Two — Spanish and English."),
            ComprehensionQuestion("What does Maria want to know from Ali?", "His phone number.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your family.", "درباره خانواده‌ات صحبت کن.", "This is my... / He/She is... / They are..."),
            SpeakingTask("Ask and answer about nationalities.", "درباره ملیت‌ها بپرس و جواب بده.", "What nationality are you? / I'm... / Where are you from?"),
            SpeakingTask("Give and spell your email address.", "آدرس ایمیلت را بگو و هجی کن.", "My email is... / Can you spell that? / It's...")
        ),
        writing = listOf(
            WritingTask("Write about your family.", "درباره خانواده‌ات بنویس.", 100, "Use possessive adjectives and 'be'.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 3 — What's that? | آن چیست؟
    // ═══════════════════════════════════════════════════════════════
    private fun unit3() = base(
        3, "What's that?", "آن چیست؟",
        listOf(
            "Ask about and identify everyday items",
            "Ask what something is called in English",
            "Talk about clothes and possessions",
            "Describe favorite possessions"
        ),
        listOf(
            v("notebook", "دفتر", "Is this your notebook?", "این دفتر توست؟"),
            v("bag", "کیف", "My bag is blue.", "کیف من آبی است."),
            v("laptop", "لپ‌تاپ", "This is my laptop.", "این لپ‌تاپ من است."),
            v("watch", "ساعت مچی", "That's a nice watch.", "آن ساعت مچی قشنگی است."),
            v("keys", "کلیدها", "Where are my keys?", "کلیدهایم کجاست؟"),
            v("book", "کتاب", "This book is interesting.", "این کتاب جالب است."),
            v("pen", "خودکار", "Can I borrow your pen?", "می‌توانم خودکارت را قرض بگیرم؟"),
            v("shirt", "پیراهن", "I like your shirt.", "پیراهنت را دوست دارم."),
            v("jacket", "کاپشن", "It's cold. Wear a jacket.", "سرد است. کاپشن بپوش."),
            v("dress", "لباس زنانه", "She's wearing a red dress.", "او لباس قرمز پوشیده است."),
            v("shoes", "کفش‌ها", "These shoes are new.", "این کفش‌ها جدیدند."),
            v("color", "رنگ", "What color is it?", "چه رنگی است؟"),
            v("red", "قرمز", "The car is red.", "ماشین قرمز است.", "adjective"),
            v("blue", "آبی", "The sky is blue.", "آسمان آبی است.", "adjective"),
            v("green", "سبز", "The grass is green.", "چمن سبز است.", "adjective")
        ),
        listOf(
            GrammarSection("Demonstratives", "Use this/these for near objects. Use that/those for far objects. This is my book. These are my books. That's your bag. Those are your bags."),
            GrammarSection("Articles a and an", "Use 'a' before consonant sounds: a book, a pen. Use 'an' before vowel sounds: an apple, an umbrella."),
            GrammarSection("Plurals", "Add -s to most nouns: book → books. Add -es to nouns ending in -s, -sh, -ch, -x: box → boxes. Irregular: man → men, woman → women, child → children."),
            GrammarSection("Possessive pronouns", "mine, yours, his, hers, ours, theirs. This book is mine. Is that pen yours?"),
            GrammarSection("Whose...? and 's / s'", "Whose bag is this? It's Sara's. Whose books are these? They're the students'.")
        ),
        listOf(
            d("A", "Excuse me, is this your notebook?", "ببخشید، این دفتر توست؟"),
            d("B", "No, it isn't. Mine is blue. That one is black.", "نه، نیست. مال من آبی است. آن یکی مشکی است."),
            d("A", "Oh, whose is it then?", "اوه، پس مال کیست؟"),
            d("B", "I think it's Maria's. She has a black notebook.", "فکر می‌کنم مال ماریا است. او دفتر مشکی دارد."),
            d("A", "You're right. Thanks. And what's this?", "حق داری. ممنون. و این چیست؟"),
            d("B", "That's a laptop. Is it yours?", "آن یک لپ‌تاپ است. مال توست؟"),
            d("A", "Yes, it is. I use it for school.", "بله، هست. برای مدرسه استفاده می‌کنم."),
            d("B", "Nice. What color is it?", "خوبه. چه رنگی است؟"),
            d("A", "It's silver. I like silver.", "نقره‌ای است. نقره‌ای را دوست دارم."),
            d("B", "Me too. And those shoes? Are they new?", "من هم. و آن کفش‌ها؟ جدید هستند؟"),
            d("A", "Yes, they are. I bought them last week.", "بله، هستند. هفته پیش خریدمشان."),
            d("B", "They're nice. What are they called in English?", "قشنگند. در انگلیسی به آن‌ها چه می‌گویند؟"),
            d("A", "Sneakers. Or just shoes.", "کتانی. یا فقط کفش."),
            d("B", "Got it. And what's that on the table?", "گرفتم. و آن روی میز چیست؟"),
            d("A", "That's my watch. It's a gift from my father.", "آن ساعت مچی من است. هدیه‌ای از پدرم است."),
            d("B", "It's beautiful. Is it expensive?", "زیباست. گران است؟"),
            d("A", "Not really. But I love it.", "نه واقعاً. ولی عاشقش هستم."),
            d("B", "That's what matters. Do you have a pen?", "این مهم است. خودکار داری؟"),
            d("A", "Yes, here you are. It's a blue pen.", "بله، بفرما. خودکار آبی است."),
            d("B", "Thanks. I need to write something down.", "ممنون. باید چیزی بنویسم."),
            d("A", "What are you writing?", "چه می‌نویسی؟"),
            d("B", "My shopping list. I need a new jacket.", "لیست خریدم. به یک کاپشن جدید نیاز دارم."),
            d("A", "Oh, I like your jacket. Is it new?", "اوه، کاپشنت را دوست دارم. جدید است؟"),
            d("B", "No, it's old. But I still like it.", "نه، قدیمی است. ولی هنوز دوستش دارم."),
            d("A", "What color is it?", "چه رنگی است؟"),
            d("B", "It's dark green. My favorite color.", "سبز تیره است. رنگ مورد علاقه‌ام."),
            d("A", "Green is nice. My favorite is blue.", "سبز خوب است. مال من آبی است."),
            d("B", "Blue is nice too. Well, I should go shopping.", "آبی هم خوب است. خب، باید بروم خرید."),
            d("A", "Okay. See you later, Maria.", "باشه. بعداً می‌بینمت، ماریا."),
            d("B", "See you, Ali. Thanks for the pen.", "می‌بینمت، علی. ممنون برای خودکار."),
            d("A", "You're welcome. Bye!", "خواهش می‌کنم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Oh, wait. Is this your bag?", "اوه، صبر کن. این کیف توست؟"),
            d("B", "No, that's not mine. Mine is brown.", "نه، مال من نیست. مال من قهوه‌ای است."),
            d("A", "Whose is it?", "مال کیست؟"),
            d("B", "I don't know. Maybe it's the teacher's.", "نمی‌دانم. شاید مال معلم است."),
            d("A", "I'll ask her. Thanks.", "از او می‌پرسم. ممنون."),
            d("B", "No problem. Bye!", "مشکلی نیست. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Whose notebook is it?", listOf("Ali's", "Maria's", "the teacher's", "nobody's"), 1),
            q("What color is the laptop?", listOf("black", "blue", "silver", "green"), 2),
            q("What is Maria's favorite color?", listOf("blue", "red", "green", "black"), 2),
            q("What does Maria need to buy?", listOf("shoes", "a jacket", "a bag", "a pen"), 1),
            q("___ is this?", listOf("What", "Who", "Whose", "How"), 0),
            q("___ are these?", listOf("What", "Who", "Whose", "How"), 2),
            q("I have ___ apple.", listOf("a", "an", "the", "no article"), 1),
            q("This book is ___.", listOf("my", "mine", "me", "I"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Excuse me", "ببخشید", "Excuse me, is this your book?", "ببخشید، این کتاب شماست؟"),
            IdiomExpression("Here you are", "بفرما", "Here you are.", "بفرما."),
            IdiomExpression("What's that called in English?", "به آن در انگلیسی چه می‌گویند؟", "What's this called in English?", "به این در انگلیسی چه می‌گویند؟"),
            IdiomExpression("That's what matters", "این مهم است", "That's what matters.", "این مهم است.")
        ),
        phrasal = listOf(
            PhrasalVerb("pick up", "برداشتن", "lift", "Pick up your bag.", "کیفت را بردار.", "Yes"),
            PhrasalVerb("put on", "پوشیدن", "wear", "Put on your jacket.", "کاپشنت را بپوش.", "Yes"),
            PhrasalVerb("take off", "درآوردن", "remove", "Take off your shoes.", "کفش‌هایت را دربیاور.", "Yes"),
            PhrasalVerb("try on", "پرو کردن", "test clothes", "Can I try on this jacket?", "می‌توانم این کاپشن را پرو کنم؟", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("This vs These", "this /ðɪs/ (singular) vs these /ðiːz/ (plural)."),
            PronunciationTip("That vs Those", "that /ðæt/ (singular) vs those /ðoʊz/ (plural)."),
            PronunciationTip("Plural -s sounds", "books /s/, bags /z/, boxes /ɪz/.")
        ),
        culture = listOf(
            CulturalNote("Identifying items", "'What's this called in English?' is a useful phrase for learners."),
            CulturalNote("Clothing sizes", "Clothing sizes vary by country. Ask 'What size are you?'"),
            CulturalNote("Possessions", "Asking 'Whose is this?' is common in classrooms and shared spaces.")
        ),
        mistakes = listOf(
            CommonMistake("This are my books.", "These are my books.", "Use 'these' with plural nouns."),
            CommonMistake("That is a apple.", "That is an apple.", "Use 'an' before vowel sounds."),
            CommonMistake("This book is my.", "This book is mine.", "Use 'mine', not 'my', after the verb."),
            CommonMistake("Whose is this book? / Who's book is this?", "Whose book is this?", "Use 'whose' for possession.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Whose notebook is it?", "It's Maria's black notebook."),
            ComprehensionQuestion("What is Ali's favorite color?", "Blue."),
            ComprehensionQuestion("What does Maria need to buy?", "A new jacket.")
        ),
        speaking = listOf(
            SpeakingTask("Identify objects in the classroom.", "اشیاء کلاس را شناسایی کن.", "What's this? / It's a... / What's that called in English?"),
            SpeakingTask("Talk about your favorite possessions.", "درباره وسایل مورد علاقه‌ات صحبت کن.", "This is my... / It's a gift from... / I like it because..."),
            SpeakingTask("Ask and answer about colors and clothes.", "درباره رنگ‌ها و لباس‌ها بپرس و جواب بده.", "What color is...? / It's... / I'm wearing...")
        ),
        writing = listOf(
            WritingTask("Describe three items in your bag.", "سه شیء در کیفت را توصیف کن.", 100, "Use demonstratives and articles.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 4 — Daily life | زندگی روزمره
    // ═══════════════════════════════════════════════════════════════
    private fun unit4() = base(
        4, "Daily life", "زندگی روزمره",
        listOf(
            "Describe how people get around",
            "Ask for and tell the time",
            "Ask and answer questions about routines",
            "Describe the things they do on weekends"
        ),
        listOf(
            v("daily", "روزانه", "This is my daily routine.", "این روتین روزانه من است.", "adjective"),
            v("life", "زندگی", "Life is busy.", "زندگی مشغول است."),
            v("get up", "بیدار شدن", "I get up at 7.", "ساعت ۷ بیدار می‌شوم.", "verb"),
            v("breakfast", "صبحانه", "I have breakfast at 8.", "ساعت ۸ صبحانه می‌خورم."),
            v("lunch", "ناهار", "We have lunch at noon.", "سر ظهر ناهار می‌خوریم."),
            v("dinner", "شام", "Dinner is at 7 PM.", "شام ساعت ۷ شب است."),
            v("work", "کار", "I go to work by bus.", "با اتوبوس به کار می‌روم."),
            v("school", "مدرسه", "She walks to school.", "او پیاده به مدرسه می‌رود."),
            v("bus", "اتوبوس", "I take the bus.", "اتوبوس می‌گیرم."),
            v("train", "قطار", "The train is fast.", "قطار سریع است."),
            v("car", "ماشین", "He drives a car.", "او ماشین می‌راند."),
            v("walk", "پیاده رفتن", "I walk to work.", "پیاده به کار می‌روم.", "verb"),
            v("time", "زمان", "What time is it?", "ساعت چند است؟"),
            v("o'clock", "ساعت (در نقطه)", "It's 3 o'clock.", "ساعت ۳ است."),
            v("weekend", "آخر هفته", "What do you do on weekends?", "آخر هفته‌ها چه می‌کنی؟")
        ),
        listOf(
            GrammarSection("Simple present statements", "Use the base form for I, you, we, they. Add -s or -es for he, she, it. I work. She works. He goes. They study."),
            GrammarSection("Simple present yes/no questions", "Use do/does + subject + base verb. Do you work? Does she study? Yes, I do. No, she doesn't."),
            GrammarSection("Ways of getting around", "by bus, by train, by car, on foot, by bike, by subway. I go to work by bus."),
            GrammarSection("Days of the week and routines", "Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday. On Mondays, I..."),
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, never. I usually get up at 7. She never eats breakfast.")
        ),
        listOf(
            d("A", "What time do you get up, Maria?", "چه ساعتی بیدار می‌شوی، ماریا؟"),
            d("B", "I usually get up at 7 o'clock. And you?", "معمولاً ساعت ۷ بیدار می‌شوم. تو چطور؟"),
            d("A", "I get up at 6:30. I like to exercise in the morning.", "ساعت ۶:۳۰ بیدار می‌شوم. دوست دارم صبح‌ها ورزش کنم."),
            d("B", "That's early! Do you have breakfast?", "زوده! صبحانه می‌خوری؟"),
            d("A", "Yes, I always have breakfast. Usually eggs and toast.", "بله، همیشه صبحانه می‌خورم. معمولاً تخم‌مرغ و نان تست."),
            d("B", "I sometimes skip breakfast. I'm not hungry in the morning.", "من گاهی صبحانه را حذف می‌کنم. صبح‌ها گرسنه نیستم."),
            d("A", "You should eat something. It's important.", "باید چیزی بخوری. مهم است."),
            d("B", "I know. I'll try. How do you go to work?", "می‌دانم. تلاش می‌کنم. چطور به کار می‌روی؟"),
            d("A", "I take the bus. It's convenient. And you?", "اتوبوس می‌گیرم. راحت است. تو چطور؟"),
            d("B", "I walk. My office is close to my house.", "پیاده می‌روم. دفترم نزدیک خانه‌ام است."),
            d("A", "That's good exercise.", "ورزش خوبی است."),
            d("B", "Yes, it is. What time do you start work?", "بله، هست. چه ساعتی کارت را شروع می‌کنی؟"),
            d("A", "I start at 9. And I finish at 5.", "ساعت ۹ شروع می‌کنم. و ساعت ۵ تمام می‌شود."),
            d("B", "That's a good schedule. Do you like your job?", "برنامه خوبی است. کارت را دوست داری؟"),
            d("A", "Yes, I do. I'm a teacher. I love it.", "بله، دارم. من معلمم. عاشقش هستم."),
            d("B", "Oh, you're a teacher! What do you teach?", "اوه، تو معلمی! چه درس می‌دهی؟"),
            d("A", "I teach math. What about you?", "ریاضی درس می‌دهم. تو چطور؟"),
            d("B", "I'm a nurse. I work at the hospital.", "من پرستارم. در بیمارستان کار می‌کنم."),
            d("A", "That's a difficult job. Do you work on weekends?", "شغل سختی است. آخر هفته‌ها کار می‌کنی؟"),
            d("B", "Sometimes. It depends on my schedule.", "گاهی. به برنامه‌ام بستگی دارد."),
            d("A", "What do you do on your free weekends?", "آخر هفته‌های آزادت چه می‌کنی؟"),
            d("B", "I usually visit my family. Or I go shopping.", "معمولاً به دیدن خانواده‌ام می‌روم. یا خرید."),
            d("A", "That sounds nice. I usually play soccer with my friends.", "خوب به نظر می‌رسد. من معمولاً با دوستانم فوتبال بازی می‌کنم."),
            d("B", "Soccer? That's fun. Are you good?", "فوتبال؟ سرگرم‌کننده است. خوب هستی؟"),
            d("A", "Not really! But I enjoy it.", "نه واقعاً! ولی لذت می‌برم."),
            d("B", "That's what matters. What time is it now?", "این مهم است. الان ساعت چند است؟"),
            d("A", "It's almost 10. I have a class at 10:30.", "تقریباً ۱۰ است. ساعت ۱۰:۳۰ کلاس دارم."),
            d("B", "I should go too. I have a meeting at 11.", "من هم باید بروم. ساعت ۱۱ جلسه دارم."),
            d("A", "Okay. See you tomorrow, Maria.", "باشه. فردا می‌بینمت، ماریا."),
            d("B", "See you, Ali. Have a good day!", "می‌بینمت، علی. روز خوبی داشته باشی!"),
            d("A", "You too. Bye!", "تو هم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Oh, do you work tomorrow?", "اوه، فردا کار می‌کنی؟"),
            d("B", "No, I don't. It's my day off.", "نه، نمی‌کنم. روز تعطیلم است."),
            d("A", "Great. Maybe we can have lunch.", "عالی. شاید بتوانیم ناهار بخوریم."),
            d("B", "I'd like that. See you then!", "دوستش دارم. تا اون موقع!"),
            d("A", "See you!", "می‌بینمت!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What time does Maria get up?", listOf("6:30", "7:00", "7:30", "8:00"), 1),
            q("How does Ali go to work?", listOf("walk", "bus", "car", "train"), 1),
            q("What does Ali teach?", listOf("English", "Math", "Science", "History"), 1),
            q("What does Maria do on free weekends?", listOf("play soccer", "visit family", "stay home", "study"), 1),
            q("I ___ up at 7 every day.", listOf("get", "gets", "getting", "got"), 0),
            q("She ___ to work by bus.", listOf("go", "goes", "going", "went"), 1),
            q("___ you have breakfast?", listOf("Do", "Does", "Is", "Are"), 0),
            q("He ___ eat breakfast.", listOf("don't", "doesn't", "isn't", "aren't"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Day off", "روز تعطیل", "It's my day off.", "روز تعطیلم است."),
            IdiomExpression("What time is it?", "ساعت چند است؟", "What time is it?", "ساعت چند است؟"),
            IdiomExpression("Have a good day", "روز خوبی داشته باشی", "Have a good day!", "روز خوبی داشته باشی!"),
            IdiomExpression("That's what matters", "این مهم است", "That's what matters.", "این مهم است.")
        ),
        phrasal = listOf(
            PhrasalVerb("get up", "بیدار شدن", "rise from bed", "I get up at 7.", "ساعت ۷ بیدار می‌شوم.", "Yes"),
            PhrasalVerb("wake up", "بیدار شدن (چشم باز کردن)", "stop sleeping", "I wake up at 6:45.", "ساعت ۶:۴۵ بیدار می‌شوم.", "Yes"),
            PhrasalVerb("go to bed", "خوابیدن", "sleep", "I go to bed at 11.", "ساعت ۱۱ می‌خوابم.", "No"),
            PhrasalVerb("come home", "به خانه آمدن", "return home", "I come home at 6.", "ساعت ۶ به خانه می‌آیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Third person -s", "works /wɜːrks/, goes /ɡoʊz/, watches /ˈwɒtʃɪz/."),
            PronunciationTip("Telling time", "3:00 three o'clock, 3:15 quarter past three, 3:30 half past three, 3:45 quarter to four."),
            PronunciationTip("Do vs Does", "Do you...? /duː juː/ vs Does she...? /dʌz ʃiː/.")
        ),
        culture = listOf(
            CulturalNote("Work schedules", "Work schedules vary. In many countries, the workday is 9 to 5."),
            CulturalNote("Weekend activities", "Weekends are for rest, family, and hobbies in many cultures."),
            CulturalNote("Telling time", "Americans usually say 'quarter after' and 'quarter to' while British say 'quarter past' and 'quarter to'.")
        ),
        mistakes = listOf(
            CommonMistake("She go to work.", "She goes to work.", "Add -es for he/she/it with 'go'."),
            CommonMistake("Do she work here?", "Does she work here?", "Use 'does' with she/he/it."),
            CommonMistake("He don't like coffee.", "He doesn't like coffee.", "Use 'doesn't' with he/she/it."),
            CommonMistake("I have 20 years.", "I am 20 years old.", "Use 'be + age + years old'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What time does Ali get up?", "At 6:30."),
            ComprehensionQuestion("What are Ali's and Maria's jobs?", "Ali is a math teacher; Maria is a nurse."),
            ComprehensionQuestion("What do they plan to do?", "Have lunch together on Maria's day off.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your daily routine.", "درباره روتین روزانه‌ات صحبت کن.", "I get up at... / I have breakfast... / I go to work by..."),
            SpeakingTask("Ask and answer about free time activities.", "درباره فعالیت‌های اوقات فراغت بپرس و جواب بده.", "What do you do on weekends? / I usually... / I sometimes..."),
            SpeakingTask("Tell the time.", "ساعت را بگو.", "What time is it? / It's... / It's half past...")
        ),
        writing = listOf(
            WritingTask("Write about your daily routine.", "درباره روتین روزانه‌ات بنویس.", 120, "Use simple present and adverbs of frequency.")
        )
    )
}    ═══════════════════════════════════════════════════════════════
    // UNIT 5 — Free time | اوقات فراغت
    // ═══════════════════════════════════════════════════════════════
    private fun unit5() = base(
        5, "Free time", "اوقات فراغت",
        listOf(
            "Talk about free-time activities",
            "Talk about likes and dislikes",
            "Ask and answer questions about hobbies",
            "Invite someone to do something"
        ),
        listOf(
            v("free time", "اوقات فراغت", "What do you do in your free time?", "در اوقات فراغتت چه می‌کنی؟"),
            v("hobby", "سرگرمی", "My hobby is reading.", "سرگرمی من خواندن است."),
            v("music", "موسیقی", "I listen to music every day.", "هر روز موسیقی گوش می‌دهم."),
            v("movie", "فیلم", "We watch movies on Fridays.", "جمعه‌ها فیلم می‌بینیم."),
            v("sports", "ورزش", "He plays sports after school.", "او بعد از مدرسه ورزش می‌کند."),
            v("swim", "شنا کردن", "I can swim well.", "خوب می‌توانم شنا کنم.", "verb"),
            v("run", "دویدن", "She runs in the park.", "او در پارک می‌دود.", "verb"),
            v("dance", "رقصیدن", "They dance at parties.", "آن‌ها در مهمانی‌ها می‌رقصند.", "verb"),
            v("sing", "آواز خواندن", "He sings very well.", "او خیلی خوب آواز می‌خواند.", "verb"),
            v("read", "خواندن", "I read before bed.", "قبل از خواب می‌خوانم.", "verb"),
            v("cook", "آشپزی کردن", "She cooks on weekends.", "آخر هفته‌ها آشپزی می‌کند.", "verb"),
            v("travel", "سفر کردن", "They travel every summer.", "هر تابستان سفر می‌کنند.", "verb"),
            v("play", "بازی کردن", "Kids play in the park.", "بچه‌ها در پارک بازی می‌کنند.", "verb"),
            v("like", "دوست داشتن", "I like chocolate.", "شکلات دوست دارم.", "verb"),
            v("love", "عاشق بودن", "She loves animals.", "او عاشق حیوانات است.", "verb"),
            v("hate", "متنفر بودن", "He hates mornings.", "او از صبح‌ها متنفر است.", "verb")
        ),
        listOf(
            GrammarSection("Like + verb-ing", "Use 'like/love/enjoy/hate' + verb-ing. I like swimming. She loves dancing. He hates running."),
            GrammarSection("Object pronouns", "me, you, him, her, it, us, them. I like her. Call me later. She knows them."),
            GrammarSection("Invitations with 'Let's'", "Let's + base verb. Let's watch a movie. Let's go to the park. Let's have lunch."),
            GrammarSection("Would you like...?", "Would you like + to + base verb. Would you like to dance? Would you like to come?")
        ),
        listOf(
            d("A", "Hey, Ali! What do you do in your free time?", "هی، علی! در اوقات فراغتت چه می‌کنی؟"),
            d("B", "I like playing soccer. And I love listening to music. What about you?", "فوتبال بازی کردن را دوست دارم. و عاشق موسیقی گوش دادن هستم. تو چطور؟"),
            d("A", "I enjoy reading and cooking. I also like dancing.", "از خواندن و آشپزی لذت می‌برم. رقصیدن را هم دوست دارم."),
            d("B", "Really? You like dancing?", "واقعاً؟ رقصیدن را دوست داری؟"),
            d("A", "Yes, I love it! I dance every weekend.", "بله، عاشقشم! هر آخر هفته می‌رقصم."),
            d("B", "That's cool. I can't dance at all.", "باحاله. من اصلاً نمی‌توانم برقصم."),
            d("A", "Ha! Do you want to learn?", "ها! می‌خواهی یاد بگیری؟"),
            d("B", "Maybe. Is it difficult?", "شاید. سخت است؟"),
            d("A", "Not really. You just need to practice.", "نه واقعاً. فقط باید تمرین کنی."),
            d("B", "Okay. Maybe I'll try. Do you like sports?", "باشه. شاید امتحان کنم. ورزش دوست داری؟"),
            d("A", "Yes, I love swimming. I swim every morning.", "بله، عاشق شنا هستم. هر صبح شنا می‌کنم."),
            d("B", "Wow. That's great exercise.", "واو. ورزش عالی‌ای است."),
            d("A", "Yes, it is. Do you play any sports?", "بله، هست. ورزشی می‌کنی؟"),
            d("B", "I play soccer on Sundays. With my friends.", "یکشنبه‌ها فوتبال بازی می‌کنم. با دوستانم."),
            d("A", "That sounds fun.", "سرگرم‌کننده به نظر می‌رسد."),
            d("B", "It is. Do you want to play with us?", "هست. می‌خواهی با ما بازی کنی؟"),
            d("A", "I'd love to! But I'm not very good.", "دوست دارم! ولی خیلی خوب نیستم."),
            d("B", "Don't worry. We play for fun.", "نگران نباش. برای سرگرمی بازی می‌کنیم."),
            d("A", "Okay, great. When do you play?", "باشه، عالی. کی بازی می‌کنید؟"),
            d("B", "Every Sunday at 4 PM, at the park.", "هر یکشنبه ساعت ۴ بعدازظهر، در پارک."),
            d("A", "Perfect. I'll be there.", "عالی. آنجا هستم."),
            d("B", "Great! Oh, do you like watching movies?", "عالی! اوه، تماشای فیلم دوست داری؟"),
            d("A", "Yes, I love movies. What kind do you like?", "بله، عاشق فیلمم. چه نوعی دوست داری؟"),
            d("B", "I like action movies. And you?", "فیلم‌های اکشن دوست دارم. تو چطور؟"),
            d("A", "I prefer comedies. They make me laugh.", "کمدی ترجیح می‌دهم. باعث می‌شوند بخندم."),
            d("B", "Comedies are good too. There's a new comedy at the cinema.", "کمدی هم خوب است. یک کمدی جدید در سینما هست."),
            d("A", "Really? Let's watch it together.", "واقعاً؟ بیا با هم تماشا کنیم."),
            d("B", "Sure! When?", "حتماً! کی؟"),
            d("A", "How about Saturday evening?", "شنبه عصر چطور؟"),
            d("B", "Saturday works for me. What time?", "شنبه برایم خوب است. چه ساعتی؟"),
            d("A", "The movie starts at 7. Let's meet at 6:30.", "فیلم ساعت ۷ شروع می‌شود. بیا ساعت ۶:۳۰ ملاقات کنیم."),
            d("B", "Perfect. I'll buy the tickets online.", "عالی. بلیط‌ها را آنلاین می‌خرم."),
            d("A", "Thanks! I'll pay you back.", "ممنون! پولش را پس می‌دهم."),
            d("B", "Don't worry about it. My treat.", "نگران نباش. مهمان من."),
            d("A", "That's so nice of you. Thanks!", "خیلی مهربانی. ممنون!"),
            d("B", "Anytime. Well, I should go. See you Sunday!", "هر وقت. خب، باید بروم. یکشنبه می‌بینمت!"),
            d("A", "See you Sunday, Ali. And Saturday for the movie!", "یکشنبه می‌بینمت، علی. و شنبه برای فیلم!"),
            d("B", "Right! Busy weekend. Bye!", "درست! آخر هفته شلوغ. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Take care!", "مراقب باش!"),
            d("A", "You too!", "تو هم!")
        ),
        listOf(
            q("What does Ali like doing in his free time?", listOf("reading", "playing soccer", "cooking", "dancing"), 1),
            q("What is Maria's favorite activity?", listOf("swimming", "reading", "dancing", "cooking"), 2),
            q("When do they play soccer?", listOf("Saturdays", "Sundays", "Fridays", "Mondays"), 1),
            q("What movie will they watch?", listOf("action", "comedy", "drama", "horror"), 1),
            q("I like ___.", listOf("swim", "swimming", "swims", "swam"), 1),
            q("She loves ___.", listOf("dance", "dancing", "dances", "danced"), 1),
            q("Call ___ later.", listOf("I", "me", "my", "mine"), 1),
            q("Let's ___ a movie.", listOf("watch", "watching", "watches", "watched"), 0)
        ),
        idioms = listOf(
            IdiomExpression("My treat", "مهمان من", "My treat.", "مهمان من."),
            IdiomExpression("I'd love to", "دوست دارم", "I'd love to!", "دوست دارم!"),
            IdiomExpression("That's cool", "باحاله", "That's cool.", "باحاله."),
            IdiomExpression("What about you?", "تو چطور؟", "What about you?", "تو چطور؟")
        ),
        phrasal = listOf(
            PhrasalVerb("hang out", "وقت گذراندن", "spend time", "Let's hang out this weekend.", "بیا آخر هفته وقت بگذرانیم.", "No"),
            PhrasalVerb("go out", "بیرون رفتن", "leave home", "We go out every Friday.", "هر جمعه بیرون می‌رویم.", "No"),
            PhrasalVerb("work out", "ورزش کردن", "exercise", "I work out at the gym.", "در باشگاه ورزش می‌کنم.", "No"),
            PhrasalVerb("take up", "شروع کردن", "start", "I want to take up dancing.", "می‌خواهم رقصیدن را شروع کنم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("-ing endings", "swimming /ˈswɪmɪŋ/, dancing /ˈdænsɪŋ/, running /ˈrʌnɪŋ/."),
            PronunciationTip("Contractions with 'Let's'", "Let's = /lets/. Let's go. Let's eat."),
            PronunciationTip("Linking in questions", "What do you → /ˈwɒtʃə/. Do you like → /dʒə laɪk/.")
        ),
        culture = listOf(
            CulturalNote("Weekend activities", "In many cultures, weekends are for hobbies, sports, and socializing."),
            CulturalNote("Invitations", "'Would you like to...?' is a polite invitation. 'Let's...' is casual."),
            CulturalNote("Popular hobbies", "Common hobbies in English-speaking countries include sports, reading, and watching movies.")
        ),
        mistakes = listOf(
            CommonMistake("I like swim.", "I like swimming.", "Use verb-ing after 'like'."),
            CommonMistake("She loves to dance.", "She loves dancing. OR She loves to dance.", "Both are correct, but 'dancing' is more common."),
            CommonMistake("Call I later.", "Call me later.", "Use object pronoun 'me', not 'I'."),
            CommonMistake("Let's to watch a movie.", "Let's watch a movie.", "After 'Let's', use base verb without 'to'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Ali's and Maria's hobbies?", "Ali: soccer and music. Maria: reading, cooking, dancing, swimming."),
            ComprehensionQuestion("What two activities do they plan?", "They'll play soccer on Sunday and watch a movie on Saturday."),
            ComprehensionQuestion("Who will pay for the movie?", "Ali — it's his treat.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your free-time activities.", "درباره فعالیت‌های اوقات فراغتت صحبت کن.", "I like... / I love... / I enjoy..."),
            SpeakingTask("Invite a friend to do something.", "دوستت را برای انجام کاری دعوت کن.", "Would you like to...? / Let's... / Do you want to...?"),
            SpeakingTask("Talk about likes and dislikes.", "درباره چیزهایی که دوست داری و دوست نداری صحبت کن.", "I love... / I hate... / I don't like...")
        ),
        writing = listOf(
            WritingTask("Write about your favorite hobby.", "درباره سرگرمی مورد علاقه‌ات بنویس.", 100, "Use like/love/hate + verb-ing.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 6 — Work and play | کار و تفریح
    // ═══════════════════════════════════════════════════════════════
    private fun unit6() = base(
        6, "Work and play", "کار و تفریح",
        listOf(
            "Talk about abilities and talents",
            "Ask for and give permission",
            "Describe jobs and workplace",
            "Talk about after-school activities"
        ),
        listOf(
            v("can", "توانستن", "I can swim.", "می‌توانم شنا کنم.", "verb"),
            v("can't", "نمی‌توانم", "She can't drive.", "او نمی‌تواند رانندگی کند.", "verb"),
            v("skill", "مهارت", "Cooking is a useful skill.", "آشپزی مهارت مفیدی است."),
            v("draw", "نقاشی کشیدن", "He can draw well.", "او خوب نقاشی می‌کشد.", "verb"),
            v("paint", "نقاشی رنگ روغن", "She paints landscapes.", "او منظره نقاشی می‌کند.", "verb"),
            v("play the piano", "پیانو زدن", "Can you play the piano?", "می‌توانی پیانو بزنی؟", "verb"),
            v("play the guitar", "گیتار زدن", "I play the guitar.", "من گیتار می‌زنم.", "verb"),
            v("ride a bike", "دوچرخه سواری", "Kids ride bikes to school.", "بچه‌ها با دوچرخه به مدرسه می‌روند.", "verb"),
            v("drive", "رانندگی کردن", "Can you drive?", "می‌توانی رانندگی کنی؟", "verb"),
            v("speak", "صحبت کردن", "I speak three languages.", "سه زبان صحبت می‌کنم.", "verb"),
            v("well", "خوب", "She sings well.", "او خوب آواز می‌خواند.", "adverb"),
            v("really", "واقعاً", "He can really cook.", "او واقعاً می‌تواند آشپزی کند.", "adverb"),
            v("good at", "خوب در", "I'm good at math.", "در ریاضی خوبم.", "phrase"),
            v("bad at", "بد در", "He's bad at singing.", "در آواز خواندن بد است.", "phrase"),
            v("talented", "با استعداد", "She's very talented.", "او خیلی با استعداد است.", "adjective")
        ),
        listOf(
            GrammarSection("Can / Can't for ability", "Use can + base verb for ability. I can swim. She can't drive. Can you play the guitar? Yes, I can. No, I can't."),
            GrammarSection("Adverbs of manner", "well, badly, fast, slowly, carefully. He sings well. She drives carefully."),
            GrammarSection("Be good at / bad at + noun or verb-ing", "I'm good at math. He's bad at cooking. She's good at dancing."),
            GrammarSection("Asking for permission with 'Can I...?'", "Can I use your phone? Can I open the window? Yes, you can. No, you can't.")
        ),
        listOf(
            d("A", "Hey, Ali! Do you have any special talents?", "هی، علی! استعداد خاصی داری؟"),
            d("B", "Well, I can play the guitar. And I'm good at soccer. What about you?", "خب، می‌توانم گیتار بزنم. و در فوتبال خوبم. تو چطور؟"),
            d("A", "I can draw and paint. I'm also good at singing.", "می‌توانم نقاشی بکشم. در آواز خواندن هم خوبم."),
            d("B", "Really? Can you sing something for me?", "واقعاً؟ می‌توانی برایم چیزی بخوانی؟"),
            d("A", "Ha! Maybe later. I'm shy.", "ها! شاید بعداً. خجالتی‌ام."),
            d("B", "No problem. Can you play any instruments?", "مشکلی نیست. سازی می‌نوازی؟"),
            d("A", "No, I can't. But I want to learn the piano.", "نه، نمی‌توانم. ولی می‌خواهم پیانو یاد بگیرم."),
            d("B", "That's great. Can you read music?", "عالی است. نت می‌توانی بخوانی؟"),
            d("A", "No, I can't. Is it difficult?", "نه، نمی‌توانم. سخت است؟"),
            d("B", "A little. But you can learn quickly.", "کمی. ولی می‌توانی سریع یاد بگیری."),
            d("A", "Thanks. What about languages? Can you speak Spanish?", "ممنون. زبان‌ها چطور؟ می‌توانی اسپانیایی صحبت کنی؟"),
            d("B", "Yes, I can. I speak Spanish and English. And a little French.", "بله، می‌توانم. اسپانیایی و انگلیسی صحبت می‌کنم. و کمی فرانسوی."),
            d("A", "Wow, three languages! That's impressive.", "واو، سه زبان! تحسین‌برانگیز است."),
            d("B", "Thanks. Can you speak any other languages?", "ممنون. زبان دیگری صحبت می‌کنی؟"),
            d("A", "Just English and a little French.", "فقط انگلیسی و کمی فرانسوی."),
            d("B", "That's good. Learning languages is important.", "خوبه. یادگیری زبان‌ها مهم است."),
            d("A", "Yes, I agree. Can you cook?", "بله، موافقم. آشپزی می‌توانی؟"),
            d("B", "Not really. I can't cook at all!", "نه واقعاً. اصلاً نمی‌توانم آشپزی کنم!"),
            d("A", "Ha! Don't worry. I can cook very well.", "ها! نگران نباش. من خیلی خوب می‌توانم آشپزی کنم."),
            d("B", "Really? What's your specialty?", "واقعاً؟ تخصصت چیست؟"),
            d("A", "I make great pasta. And I bake cakes too.", "پاستای عالی می‌سازم. و کیک هم می‌پزم."),
            d("B", "Nice! Maybe you can teach me.", "خوبه! شاید بتوانی به من یاد بدهی."),
            d("A", "Sure, I can. Let's cook together sometime.", "حتماً، می‌توانم. بیا یک وقت با هم آشپزی کنیم."),
            d("B", "I'd like that. When?", "دوستش دارم. کی؟"),
            d("A", "How about Friday evening?", "جمعه عصر چطور؟"),
            d("B", "Friday works. Can I bring anything?", "جمعه خوب است. چیزی بیاورم؟"),
            d("A", "You can bring some drinks. Or dessert.", "می‌توانی نوشیدنی بیاوری. یا دسر."),
            d("B", "Perfect. I'll bring ice cream.", "عالی. بستنی می‌آورم."),
            d("A", "Sounds great. Can I ask you something else?", "عالی به نظر می‌رسد. می‌توانم چیز دیگری بپرسم؟"),
            d("B", "Sure, go ahead.", "حتماً، بپرس."),
            d("A", "Can you ride a bike?", "می‌توانی دوچرخه سواری کنی؟"),
            d("B", "Yes, I can. I ride every weekend.", "بله، می‌توانم. هر آخر هفته می‌رانم."),
            d("A", "That's fun. I can't ride a bike, actually.", "سرگرم‌کننده است. من واقعاً نمی‌توانم دوچرخه سواری کنم."),
            d("B", "Really? It's easy. I can teach you.", "واقعاً؟ آسان است. می‌توانم یادت بدهم."),
            d("A", "Thanks! Maybe next week.", "ممنون! شاید هفته بعد."),
            d("B", "Sure. Well, I have to go to work now.", "حتماً. خب، الان باید به کار بروم."),
            d("A", "Okay. See you Friday, Ali.", "باشه. جمعه می‌بینمت، علی."),
            d("B", "See you, Maria. Don't forget the ice cream!", "می‌بینمت، ماریا. بستنی را فراموش نکن!"),
            d("A", "Ha! I won't. Bye!", "ها! فراموش نمی‌کنم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Oh, can I call you later?", "اوه، می‌توانم بعداً زنگ بزنم؟"),
            d("B", "Of course. Talk to you soon!", "البته. به‌زودی صحبت می‌کنیم!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What instrument can Ali play?", listOf("piano", "guitar", "violin", "drums"), 1),
            q("What can Maria do?", listOf("cook and draw", "play soccer", "speak French", "ride a bike"), 0),
            q("What can Ali NOT do?", listOf("speak Spanish", "cook", "play soccer", "sing"), 1),
            q("What will Maria bring on Friday?", listOf("drinks", "ice cream", "cake", "pasta"), 1),
            q("I ___ swim well.", listOf("can", "cans", "canning", "to can"), 0),
            q("She ___ drive.", listOf("can't", "cannot", "can not", "both a and b"), 3),
            q("___ you play the piano?", listOf("Can", "Do", "Are", "Is"), 0),
            q("He sings ___.", listOf("good", "well", "nice", "fine"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Go ahead", "بفرما", "Sure, go ahead.", "حتماً، بفرما."),
            IdiomExpression("Specialty", "تخصص", "What's your specialty?", "تخصصت چیست؟"),
            IdiomExpression("Not at all", "اصلاً", "I can't cook at all.", "اصلاً نمی‌توانم آشپزی کنم."),
            IdiomExpression("Impressive", "تحسین‌برانگیز", "That's impressive.", "تحسین‌برانگیز است.")
        ),
        phrasal = listOf(
            PhrasalVerb("teach", "یاد دادن", "instruct", "Can you teach me?", "می‌توانی یادم بدهی؟", "No"),
            PhrasalVerb("learn", "یاد گرفتن", "acquire", "I want to learn piano.", "می‌خواهم پیانو یاد بگیرم.", "No"),
            PhrasalVerb("give up", "رها کردن", "quit", "Never give up learning.", "هرگز یادگیری را رها نکن.", "Yes"),
            PhrasalVerb("take up", "شروع کردن", "begin", "She took up painting.", "او نقاشی را شروع کرد.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Can vs Can't", "can /kæn/ (weak: /kən/) vs can't /kænt/. In American English, 'can't' has /æ/."),
            PronunciationTip("Well vs Good", "well /wel/ (adverb) vs good /ɡʊd/ (adjective)."),
            PronunciationTip("Contractions with 'can't'", "cannot → can't. I can't /aɪ kænt/.")
        ),
        culture = listOf(
            CulturalNote("Skills and talents", "Being 'good at' something is often used in job interviews and resumes."),
            CulturalNote("Music education", "Playing an instrument is a common hobby in many cultures."),
            CulturalNote("Teaching others", "Sharing skills with friends is a common way to bond.")
        ),
        mistakes = listOf(
            CommonMistake("She can sings.", "She can sing.", "After 'can', use base verb without -s."),
            CommonMistake("I can to swim.", "I can swim.", "After 'can', use base verb without 'to'."),
            CommonMistake("He sings good.", "He sings well.", "Use 'well' (adverb) after a verb."),
            CommonMistake("I'm good in math.", "I'm good at math.", "Use 'good at' for skills.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Ali's and Maria's talents?", "Ali: guitar, soccer, languages. Maria: drawing, painting, singing, cooking."),
            ComprehensionQuestion("What will they do on Friday?", "Cook pasta together at Maria's place."),
            ComprehensionQuestion("What will Ali teach Maria?", "To ride a bike.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your talents and abilities.", "درباره استعدادها و توانایی‌هایت صحبت کن.", "I can... / I can't... / I'm good at..."),
            SpeakingTask("Ask for permission.", "اجازه بخواه.", "Can I...? / Yes, you can. / No, you can't."),
            SpeakingTask("Discuss skills you want to learn.", "درباره مهارت‌هایی که می‌خواهی یاد بگیری صحبت کن.", "I want to learn... / Can you teach me? / It's difficult but...")
        ),
        writing = listOf(
            WritingTask("Write about your skills and talents.", "درباره مهارت‌ها و استعدادهایت بنویس.", 100, "Use can/can't and be good at.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 7 — Food | غذا
    // ═══════════════════════════════════════════════════════════════
    private fun unit7() = base(
        7, "Food", "غذا",
        listOf(
            "Order food and drinks in a restaurant",
            "Talk about food likes and dislikes",
            "Count and non-count nouns",
            "Read a menu and understand prices"
        ),
        listOf(
            v("food", "غذا", "I love Italian food.", "عاشق غذای ایتالیایی‌ام."),
            v("drink", "نوشیدنی", "What would you like to drink?", "چه نوشیدنی می‌خواهی؟"),
            v("water", "آب", "A glass of water, please.", "یک لیوان آب، لطفاً."),
            v("tea", "چای", "I drink tea every morning.", "هر صبح چای می‌نوشم."),
            v("coffee", "قهوه", "Do you want coffee?", "قهوه می‌خواهی؟"),
            v("bread", "نان", "We need some bread.", "کمی نان لازم داریم."),
            v("rice", "برنج", "Rice is popular in Asia.", "برنج در آسیا محبوب است."),
            v("chicken", "مرغ", "I like grilled chicken.", "مرغ کبابی دوست دارم."),
            v("fish", "ماهی", "Do you eat fish?", "ماهی می‌خوری؟"),
            v("fruit", "میوه", "Fruit is good for you.", "میوه برایت خوب است."),
            v("vegetable", "سبزیجات", "Eat more vegetables.", "سبزیجات بیشتری بخور."),
            v("menu", "منو", "Can I see the menu?", "می‌توانم منو را ببینم؟"),
            v("order", "سفارش دادن", "Are you ready to order?", "آماده سفارش هستید؟", "verb"),
            v("waiter", "پیشخدمت", "The waiter is very friendly.", "پیشخدمت خیلی دوستانه است."),
            v("bill", "صورت‌حساب", "Can I have the bill, please?", "می‌توانم صورت‌حساب را بگیرم، لطفاً؟"),
            v("delicious", "خوشمزه", "The food was delicious.", "غذا خوشمزه بود.", "adjective")
        ),
        listOf(
            GrammarSection("Count and non-count nouns", "Countable: apple → apples, egg → eggs. Non-count: rice, bread, water, coffee. Use 'some' with both. Use 'a lot of' with both. Use 'a few' with count nouns. Use 'a little' with non-count nouns."),
            GrammarSection("How much / How many", "How much + non-count: How much water? How many + count: How many apples?"),
            GrammarSection("Ordering food", "I'd like... / Can I have...? / I'll have... / Would you like...? Yes, please. / No, thank you."),
            GrammarSection("Would you like...?", "Would you like some coffee? Would you like a sandwich? Offers and polite requests.")
        ),
        listOf(
            d("A", "Good evening! Welcome to Bella Italia.", "عصر بخیر! به بلا ایتالیا خوش آمدید."),
            d("B", "Good evening. A table for two, please.", "عصر بخیر. یک میز برای دو نفر، لطفاً."),
            d("A", "Right this way. Here's the menu.", "از این طرف. این هم منو."),
            d("B", "Thank you.", "ممنون."),
            d("A", "Can I get you something to drink?", "نوشیدنی چیزی بیاورم؟"),
            d("B", "Yes, please. I'd like some water. And my friend would like tea.", "بله، لطفاً. کمی آب می‌خواهم. و دوستم چای می‌خواهد."),
            d("A", "Sure. Still or sparkling?", "حتماً. معمولی یا گازدار؟"),
            d("B", "Still, please.", "معمولی، لطفاً."),
            d("A", "Are you ready to order?", "آماده سفارش هستید؟"),
            d("B", "Yes. I'd like the pasta with tomato sauce.", "بله. پاستا با سس گوجه می‌خواهم."),
            d("A", "And for your friend?", "و برای دوستت؟"),
            d("B", "She'd like the grilled chicken with vegetables.", "او مرغ کبابی با سبزیجات می‌خواهد."),
            d("A", "Anything to start?", "چیزی برای شروع؟"),
            d("B", "Yes, a small salad, please. And some bread.", "بله، یک سالاد کوچک، لطفاً. و کمی نان."),
            d("A", "Perfect. I'll be right back.", "عالی. الان برمی‌گردم."),
            d("B", "Thank you.", "ممنون."),
            d("A", "So, how's your day going?", "خب، روزت چطور پیش می‌رود؟"),
            d("B", "Good, thanks. I'm a little tired.", "خوبه، ممنون. کمی خسته‌ام."),
            d("A", "Long day at work?", "روز طولانی در کار؟"),
            d("B", "Yes, very long. I need this dinner!", "بله، خیلی طولانی. به این شام نیاز دارم!"),
            d("A", "Ha! I understand. Here's your salad and bread.", "ها! می‌فهمم. این هم سالاد و نانتان."),
            d("B", "It looks great. Thank you.", "عالی به نظر می‌رسد. ممنون."),
            d("A", "Can I get you anything else?", "چیز دیگری بیاورم؟"),
            d("B", "No, we're fine for now.", "نه، فعلاً خوبیم."),
            d("A", "Okay. Your food will be ready soon.", "باشه. غذایتان به‌زودی آماده می‌شود."),
            d("B", "Perfect.", "عالی."),
            d("A", "Here's your pasta. And the grilled chicken for your friend.", "این هم پاستایتان. و مرغ کبابی برای دوستت."),
            d("B", "Thank you. It looks delicious.", "ممنون. خوشمزه به نظر می‌رسد."),
            d("A", "Enjoy your meal!", "نوش جان!"),
            d("B", "Thanks. Oh, can I have some more bread?", "ممنون. اوه، می‌توانم نان بیشتری بگیرم؟"),
            d("A", "Of course. I'll bring some right away.", "البته. الان می‌آورم."),
            d("B", "Thanks.", "ممنون."),
            d("A", "Here you are. Anything else?", "بفرما. چیز دیگری؟"),
            d("B", "No, that's all for now. Thanks.", "نه، فعلاً همین. ممنون."),
            d("A", "How is everything?", "همه چیز چطور است؟"),
            d("B", "Very good. The food is amazing.", "خیلی خوب. غذا شگفت‌انگیز است."),
            d("A", "I'm glad to hear it. Would you like some dessert?", "خوشحالم که این را می‌شنوم. دسر می‌خواهید؟"),
            d("B", "Maybe later. First, let's finish dinner.", "شاید بعداً. اول بگذارید شام را تمام کنیم."),
            d("A", "Of course. Take your time.", "البته. عجله نکنید."),
            d("B", "Excuse me, can we have the bill, please?", "ببخشید، می‌توانیم صورت‌حساب بگیریم، لطفاً؟"),
            d("A", "Sure. Here you are. That's $35.50.", "حتماً. بفرما. ۳۵.۵۰ دلار می‌شود."),
            d("B", "Here's $40. Keep the change.", "۴۰ دلار. بقیه‌اش مال شما."),
            d("A", "Thank you very much! Come again!", "خیلی ممنون! دوباره بیایید!"),
            d("B", "We will. Good night!", "می‌آییم. شب بخیر!"),
            d("A", "Good night!", "شب بخیر!"),
            d("B", "That was a great dinner.", "شام عالی‌ای بود."),
            d("C", "Yes, it was. Let's come back next week.", "بله، بود. بیا هفته بعد برگردیم."),
            d("B", "Deal. Bye!", "قبول. خداحافظ!"),
            d("C", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What does the first person order to drink?", listOf("coffee", "tea", "water", "juice"), 2),
            q("What does the friend order to eat?", listOf("pasta", "chicken and vegetables", "pizza", "fish"), 1),
            q("How much is the bill?", listOf("$30.50", "$35.50", "$40.00", "$45.50"), 1),
            q("How much does the customer leave for the waiter?", listOf("$4.50", "$5.00", "$10.00", "no tip"), 0),
            q("I'd like ___ water.", listOf("a", "an", "some", "many"), 2),
            q("How ___ apples do you want?", listOf("much", "many", "some", "any"), 1),
            q("How ___ water do you want?", listOf("much", "many", "some", "any"), 0),
            q("Can I ___ the menu?", listOf("see", "seeing", "saw", "seen"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Right this way", "از این طرف", "Right this way.", "از این طرف."),
            IdiomExpression("Enjoy your meal", "نوش جان", "Enjoy your meal!", "نوش جان!"),
            IdiomExpression("How's everything?", "همه چیز چطور است؟", "How's everything?", "همه چیز چطور است؟"),
            IdiomExpression("Keep the change", "بقیه‌اش مال شما", "Keep the change.", "بقیه‌اش مال شما.")
        ),
        phrasal = listOf(
            PhrasalVerb("eat out", "بیرون غذا خوردن", "eat at restaurant", "Let's eat out tonight.", "بیا امشب بیرون غذا بخوریم.", "No"),
            PhrasalVerb("order", "سفارش دادن", "request", "Are you ready to order?", "آماده سفارش هستید؟", "No"),
            PhrasalVerb("try", "امتحان کردن", "sample", "Try the soup — it's delicious.", "سوپ را امتحان کن — خوشمزه است.", "No"),
            PhrasalVerb("cut down on", "کم کردن", "reduce", "Cut down on sugar.", "شکر را کم کن.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Ordering intonation", "I'd like... ↗ (rising, polite) Yes, please. ↘ (falling)"),
            PronunciationTip("Count vs non-count stress", "a LOT of rice. a LITtle water. a FEW apples."),
            PronunciationTip("Would you like", "Would you like → /wʊdʒə laɪk/ in fast speech.")
        ),
        culture = listOf(
            CulturalNote("Tipping", "In the US, tipping waiters is customary (15-20%). In many countries, service is included."),
            CulturalNote("Meal times", "Dinner time varies: 6-7 PM in the US, 8-9 PM in many European countries."),
            CulturalNote("Restaurant etiquette", "In formal restaurants, waiters may introduce themselves by name and describe specials.")
        ),
        mistakes = listOf(
            CommonMistake("I want water.", "I'd like some water, please.", "'I'd like' is more polite than 'I want'."),
            CommonMistake("How much apples?", "How many apples?", "Use 'many' with count nouns."),
            CommonMistake("How many water?", "How much water?", "Use 'much' with non-count nouns."),
            CommonMistake("Can I have a bread?", "Can I have some bread?", "'Bread' is non-count, use 'some'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did the customers order?", "Water, tea, pasta with tomato sauce, grilled chicken, salad, and bread."),
            ComprehensionQuestion("How was the meal?", "Delicious. The customer tipped the waiter."),
            ComprehensionQuestion("What do they plan to do next week?", "Come back to the restaurant.")
        ),
        speaking = listOf(
            SpeakingTask("Role-play ordering food in a restaurant.", "نقش‌بازی سفارش دادن غذا در رستوران.", "I'd like... / Can I have...? / The bill, please."),
            SpeakingTask("Talk about your favorite food.", "درباره غذای مورد علاقه‌ات صحبت کن.", "I love... / My favorite food is... / I don't like..."),
            SpeakingTask("Discuss eating habits.", "درباره عادات غذایی صحبت کن.", "I usually eat... / I try to eat... / I never eat...")
        ),
        writing = listOf(
            WritingTask("Write about your favorite restaurant.", "درباره رستوران مورد علاقه‌ات بنویس.", 120, "Use count and non-count nouns.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 8 — In the neighborhood | در محله
    // ═══════════════════════════════════════════════════════════════
    private fun unit8() = base(
        8, "In the neighborhood", "در محله",
        listOf(
            "Ask for and give directions",
            "Talk about locations and neighborhoods",
            "Describe where things are",
            "Give directions to a place"
        ),
        listOf(
            v("neighborhood", "محله", "It's a quiet neighborhood.", "محله آرامی است."),
            v("street", "خیابان", "The street is busy.", "خیابان شلوغ است."),
            v("corner", "گوشه", "The bank is on the corner.", "بانک در گوشه است."),
            v("block", "بلوک", "Go two blocks and turn left.", "دو بلوک برو و به چپ بپیچ."),
            v("left", "چپ", "Turn left at the light.", "سر چراغ به چپ بپیچ.", "adverb"),
            v("right", "راست", "Turn right after the bank.", "بعد از بانک به راست بپیچ.", "adverb"),
            v("straight", "مستقیم", "Go straight for two blocks.", "دو بلوک مستقیم برو.", "adverb"),
            v("turn", "پیچیدن", "Turn at the corner.", "در گوشه بپیچ.", "verb"),
            v("near", "نزدیک", "Is there a bank near here?", "بانکی این نزدیک هست؟", "adverb"),
            v("next to", "کنار", "It's next to the pharmacy.", "کنار داروخانه است."),
            v("between", "بین", "It's between the bank and the café.", "بین بانک و کافه است."),
            v("across from", "روبروی", "It's across from the park.", "روبروی پارک است."),
            v("pharmacy", "داروخانه", "Where's the pharmacy?", "داروخانه کجاست؟"),
            v("hospital", "بیمارستان", "The hospital is on Main Street.", "بیمارستان در خیابان اصلی است."),
            v("post office", "اداره پست", "Is there a post office nearby?", "اداره پستی این نزدیک هست؟")
        ),
        listOf(
            GrammarSection("Prepositions of place", "next to, between, across from, in front of, behind, on, at, near. The café is next to the bank."),
            GrammarSection("There is / There are", "There is + singular: There is a bank on Main Street. There are + plural: There are two cafés here. Negative: There isn't / There aren't."),
            GrammarSection("Is there a...? / Are there any...?", "Is there a pharmacy near here? Are there any restaurants on this street?"),
            GrammarSection("Giving directions with imperatives", "Go straight. Turn left. Turn right. Walk two blocks. Take the first right. It's on your left.")
        ),
        listOf(
            d("A", "Excuse me, where's the nearest bank?", "ببخشید، نزدیک‌ترین بانک کجاست؟"),
            d("B", "There's one on Main Street. Just two blocks from here.", "یکی در خیابان اصلی هست. فقط دو بلوک از اینجا."),
            d("A", "How do I get there?", "چطور بروم آنجا؟"),
            d("B", "Go straight for one block, then turn left. You'll see it on your right.", "یک بلوک مستقیم برو، بعد به چپ بپیچ. در سمت راستت می‌بینی‌اش."),
            d("A", "Great. Is there a pharmacy nearby?", "عالی. داروخانه‌ای این نزدیک هست؟"),
            d("B", "Yes, there is. It's across from the bank.", "بله، هست. روبروی بانک است."),
            d("A", "Perfect. And a café?", "عالی. و کافه؟"),
            d("B", "There are two cafés on this street. One is next to the pharmacy.", "دو کافه در این خیابان هست. یکی کنار داروخانه است."),
            d("A", "Thank you. What about a supermarket?", "ممنون. سوپرمارکت چطور؟"),
            d("B", "There's a big one on the corner of Elm and Oak streets.", "یکی بزرگ در گوشه خیابان الم و اوک هست."),
            d("A", "Is it far?", "دور است؟"),
            d("B", "Not really. About a ten-minute walk.", "نه واقعاً. حدود ده دقیقه پیاده."),
            d("A", "Okay. Do you live around here?", "باشه. همین حدود زندگی می‌کنی؟"),
            d("B", "Yes, I do. I live on Oak Street. It's a quiet neighborhood.", "بله، می‌کنم. در خیابان اوک زندگی می‌کنم. محله آرامی است."),
            d("A", "It seems nice. Are there any good restaurants?", "خوب به نظر می‌رسد. رستوران‌های خوبی هست؟"),
            d("B", "Yes, there's a great Italian place between the bank and the post office.", "بله، یک ایتالیایی عالی بین بانک و اداره پست هست."),
            d("A", "Sounds good. I love Italian food.", "خوب به نظر می‌رسد. عاشق غذای ایتالیایی‌ام."),
            d("B", "Then you should try it. It's called Bella Vista.", "پس باید امتحان کنی. بلا ویستا نام دارد."),
            d("A", "I'll check it out. Where's the post office, by the way?", "بررسی‌اش می‌کنم. راستی، اداره پست کجاست؟"),
            d("B", "It's on Elm Street, next to the hospital.", "در خیابان الم است، کنار بیمارستان."),
            d("A", "Thanks. Is the hospital big?", "ممنون. بیمارستان بزرگ است؟"),
            d("B", "Yes, it's very big. It's the main hospital in this area.", "بله، خیلی بزرگ است. بیمارستان اصلی این منطقه است."),
            d("A", "Good to know. Do you like living here?", "خوب است بدانم. زندگی اینجا را دوست داری؟"),
            d("B", "Very much. The people are friendly and everything is close.", "خیلی زیاد. مردم دوستانه هستند و همه چیز نزدیک است."),
            d("A", "That sounds ideal. Is it expensive?", "ایده‌آل به نظر می‌رسد. گران است؟"),
            d("B", "Not too bad. The rent is reasonable.", "خیلی بد نیست. اجاره منطقی است."),
            d("A", "Great. Well, I should go. Thanks for your help.", "عالی. خب، باید بروم. ممنون برای کمکت."),
            d("B", "You're welcome. Enjoy your day!", "خواهش می‌کنم. روز خوبی داشته باشی!"),
            d("A", "You too. Bye!", "تو هم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Oh, one more thing.", "اوه، یک چیز دیگر."),
            d("B", "Yes?", "بله؟"),
            d("A", "Is there a subway station around here?", "ایستگاه مترویی این حدود هست؟"),
            d("B", "Yes. It's on Fifth Street, in front of the park.", "بله. در خیابان پنجم است، روبروی پارک."),
            d("A", "Perfect. Thank you so much!", "عالی. خیلی ممنون!"),
            d("B", "Anytime. Good luck!", "هر وقت. موفق باشی!"),
            d("A", "Thanks! Bye!", "ممنون! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Where is the bank?", listOf("on Main Street", "on Oak Street", "on Elm Street", "on Fifth Street"), 0),
            q("Where is the pharmacy?", listOf("next to the bank", "across from the bank", "behind the bank", "on Oak Street"), 1),
            q("Where is the Italian restaurant?", listOf("on Main Street", "between the bank and post office", "next to the hospital", "across from the park"), 1),
            q("Where is the subway station?", listOf("on Oak Street", "on Elm Street", "on Fifth Street", "on Main Street"), 2),
            q("___ a bank near here?", listOf("Is there", "Are there", "There is", "There are"), 0),
            q("___ two cafés on this street?", listOf("Is there", "Are there", "There is", "There are"), 1),
            q("The café is ___ the bank.", listOf("next to", "next", "near to", "beside to"), 0),
            q("___ left at the corner.", listOf("Turn", "Go", "Make", "Take"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Around here", "این حدود", "Is there a bank around here?", "بانکی این حدود هست؟"),
            IdiomExpression("Check it out", "بررسی کردن", "I'll check it out.", "بررسی‌اش می‌کنم."),
            IdiomExpression("By the way", "راستی", "Where's the post office, by the way?", "راستی، اداره پست کجاست؟"),
            IdiomExpression("Good to know", "خوب است بدانم", "Good to know.", "خوب است بدانم.")
        ),
        phrasal = listOf(
            PhrasalVerb("turn left", "به چپ پیچیدن", "go left", "Turn left at the corner.", "سر گوشه به چپ بپیچ.", "No"),
            PhrasalVerb("turn right", "به راست پیچیدن", "go right", "Turn right after the bank.", "بعد از بانک به راست بپیچ.", "No"),
            PhrasalVerb("go straight", "مستقیم رفتن", "continue", "Go straight for two blocks.", "دو بلوک مستقیم برو.", "No"),
            PhrasalVerb("get to", "رسیدن به", "arrive at", "How do I get to the bank?", "چطور به بانک برسم؟", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Preposition stress", "NEXT to, aCROSS from, beTWEEN."),
            PronunciationTip("Directions rhythm", "GO STRAIGHT, TURN LEFT, TURN RIGHT."),
            PronunciationTip("'There is' reduction", "There's → /ðerz/. There's a bank.")
        ),
        culture = listOf(
            CulturalNote("Neighborhoods", "Neighborhoods in different countries have unique characteristics — some are quiet, others lively."),
            CulturalNote("Asking for directions", "'Excuse me' is polite before asking directions. Thank the person even if they can't help."),
            CulturalNote("Landmarks", "When giving directions, use landmarks like banks, parks, and traffic lights.")
        ),
        mistakes = listOf(
            CommonMistake("There is two banks.", "There are two banks.", "Use 'are' with plural nouns."),
            CommonMistake("There are a bank.", "There is a bank.", "Use 'is' with singular nouns."),
            CommonMistake("Turn in the left.", "Turn left.", "Say 'turn left', not 'turn in the left'."),
            CommonMistake("The bank is near of the park.", "The bank is near the park.", "Use 'near' without 'of'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where is the bank?", "On Main Street, two blocks away, on the right after turning left."),
            ComprehensionQuestion("What other places are mentioned?", "Pharmacy (across from bank), cafés, supermarket, Italian restaurant, post office, hospital, subway station."),
            ComprehensionQuestion("What does the local think about the neighborhood?", "Friendly people, convenient, reasonable rent.")
        ),
        speaking = listOf(
            SpeakingTask("Ask for directions.", "درخواست مسیر کن.", "Excuse me, where's the...? / How do I get to...?"),
            SpeakingTask("Give directions to a place.", "مسیر به جایی را نشان بده.", "Go straight... / Turn left... / It's on your right."),
            SpeakingTask("Describe your neighborhood.", "محله‌ات را توصیف کن.", "There is... / There are... / It's a... neighborhood.")
        ),
        writing = listOf(
            WritingTask("Write directions from your home to a place nearby.", "از خانه‌ات تا یک مکان نزدیک مسیر بنویس.", 130, "Use imperatives and prepositions of place.")
        )
    )
}     ═══════════════════════════════════════════════════════════════
    // UNIT 9 — Experiences | تجربیات
    // ═══════════════════════════════════════════════════════════════
    private fun unit9() = base(
        9, "Experiences", "تجربیات",
        listOf(
            "Talk about past experiences",
            "Use the simple past with regular and irregular verbs",
            "Ask and answer questions about the past",
            "Describe a memorable experience"
        ),
        listOf(
            v("experience", "تجربه", "It was a great experience.", "تجربه عالی‌ای بود."),
            v("yesterday", "دیروز", "I saw her yesterday.", "دیروز او را دیدم.", "adverb"),
            v("last night", "دیشب", "We watched a movie last night.", "دیشب فیلم دیدیم.", "phrase"),
            v("last week", "هفته پیش", "I visited my aunt last week.", "هفته پیش به دیدن خاله‌ام رفتم.", "phrase"),
            v("ago", "پیش", "Two years ago, I moved here.", "دو سال پیش، اینجا اسباب‌کشی کردم.", "adverb"),
            v("visited", "بازدید کردم", "We visited the museum.", "از موزه بازدید کردیم.", "verb"),
            v("went", "رفتم", "I went to Paris.", "به پاریس رفتم.", "verb"),
            v("saw", "دیدم", "I saw a great movie.", "فیلم عالی‌ای دیدم.", "verb"),
            v("met", "ملاقات کردم", "I met her at a party.", "او را در یک مهمانی ملاقات کردم.", "verb"),
            v("ate", "خوردم", "We ate at a nice restaurant.", "در رستوران خوبی غذا خوردیم.", "verb"),
            v("bought", "خریدم", "She bought a new car.", "او ماشین جدیدی خرید.", "verb"),
            v("traveled", "سفر کردم", "I traveled to Italy.", "به ایتالیا سفر کردم.", "verb"),
            v("wonderful", "شگفت‌انگیز", "It was a wonderful trip.", "سفر شگفت‌انگیزی بود.", "adjective"),
            v("memorable", "به‌یادماندنی", "It was a memorable day.", "روز به‌یادماندنی‌ای بود.", "adjective"),
            v("memories", "خاطرات", "I have good memories of that time.", "خاطرات خوبی از آن زمان دارم.")
        ),
        listOf(
            GrammarSection("Simple past with regular verbs", "Add -ed to the base verb: visit → visited, watch → watched, play → played. I visited my grandmother. She watched a movie."),
            GrammarSection("Simple past with irregular verbs", "Common irregular verbs: go → went, see → saw, eat → ate, buy → bought, meet → met, have → had. I went home. She ate pizza."),
            GrammarSection("Simple past negatives and questions", "Use didn't + base verb. Use Did + subject + base verb. I didn't go. Did you go? Yes, I did. No, I didn't."),
            GrammarSection("Time expressions for the past", "yesterday, last night, last week, last month, last year, two days ago, in 2020.")
        ),
        listOf(
            d("A", "Hi, Ali! I didn't see you yesterday.", "سلام، علی! دیروز تو را ندیدم."),
            d("B", "Hi, Maria! I went to the beach with my family.", "سلام، ماریا! با خانواده‌ام به ساحل رفتم."),
            d("A", "Really? How was it?", "واقعاً؟ چطور بود؟"),
            d("B", "It was wonderful! The weather was perfect.", "شگفت‌انگیز بود! هوا عالی بود."),
            d("A", "That sounds great. What did you do there?", "عالی به نظر می‌رسد. آنجا چه کردید؟"),
            d("B", "We swam, played volleyball, and ate seafood.", "شنا کردیم، والیبال بازی کردیم، و غذای دریایی خوردیم."),
            d("A", "Yum! I love seafood.", "مم! عاشق غذای دریایی‌ام."),
            d("B", "It was delicious. You should come next time.", "خوشمزه بود. دفعه بعد باید بیایی."),
            d("A", "I'd love to. When did you go?", "دوست دارم. کی رفتید؟"),
            d("B", "We left on Saturday morning and came back Sunday evening.", "شنبه صبح رفتیم و یکشنبه شب برگشتیم."),
            d("A", "A short trip. What about your sister? Did she go?", "سفر کوتاهی بود. خواهرت چطور؟ او رفت؟"),
            d("B", "No, she didn't. She stayed home to study.", "نه، نرفت. خانه ماند تا درس بخواند."),
            d("A", "That's too bad. She missed a great trip.", "حیف شد. سفر عالی‌ای را از دست داد."),
            d("B", "I know. Maybe next time. What did you do on the weekend?", "می‌دانم. شاید دفعه بعد. تو آخر هفته چه کردی؟"),
            d("A", "I visited my grandmother. We cooked together.", "به دیدن مادربزرگم رفتم. با هم آشپزی کردیم."),
            d("B", "That sounds nice. What did you cook?", "خوب به نظر می‌رسد. چه پختید؟"),
            d("A", "We made a traditional stew. My grandmother's recipe.", "خورش سنتی درست کردیم. دستور پخت مادربزرگم."),
            d("B", "Wow. I'd love to try it sometime.", "واو. دوست دارم یک وقت امتحانش کنم."),
            d("A", "I'll invite you next time.", "دفعه بعد دعوتت می‌کنم."),
            d("B", "Thanks. Have you ever been to my city?", "ممنون. هیچ‌وقت به شهر من آمده‌ای؟"),
            d("A", "Yes, I have. I went there two years ago.", "بله، آمده‌ام. دو سال پیش رفتم."),
            d("B", "Really? What did you think of it?", "واقعاً؟ چه فکری درباره‌اش کردی؟"),
            d("A", "I loved it. The food was amazing and the people were friendly.", "عاشقش شدم. غذا شگفت‌انگیز بود و مردم دوستانه بودند."),
            d("B", "I'm glad to hear that. What did you visit?", "خوشحالم که این را می‌شنوم. از کجا بازدید کردی؟"),
            d("A", "I visited the old mosque and the bazaar.", "از مسجد قدیمی و بازار بازدید کردم."),
            d("B", "Those are beautiful places. Did you buy anything?", "مکان‌های زیبایی هستند. چیزی خریدی؟"),
            d("A", "Yes. I bought a beautiful carpet.", "بله. یک فرش زیبا خریدم."),
            d("B", "A carpet? That's a big purchase!", "فرش؟ خرید بزرگی است!"),
            d("A", "It was. But it was worth it.", "بود. ولی ارزشش را داشت."),
            d("B", "I'm sure it's beautiful.", "مطمئنم زیباست."),
            d("A", "It is. It's in my living room now.", "هست. الان در اتاق پذیرایی‌ام است."),
            d("B", "Nice. Well, I should go. I have a class soon.", "خوبه. خب، باید بروم. به‌زودی کلاس دارم."),
            d("A", "Okay. See you tomorrow, Ali.", "باشه. فردا می‌بینمت، علی."),
            d("B", "See you, Maria. Have a good day!", "می‌بینمت، ماریا. روز خوبی داشته باشی!"),
            d("A", "You too. Bye!", "تو هم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Oh, did you take any photos at the beach?", "اوه، در ساحل عکس گرفتی؟"),
            d("B", "Yes, I did. I'll send them to you.", "بله، گرفتم. برایت می‌فرستم."),
            d("A", "Thanks! Bye!", "ممنون! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Where did Ali go yesterday?", listOf("to the mountains", "to the beach", "to a museum", "to his grandmother's"), 1),
            q("What did Ali and his family do at the beach?", listOf("only swam", "swam, played volleyball, ate seafood", "studied", "shopped"), 1),
            q("Who didn't go with them?", listOf("Ali's brother", "Ali's sister", "Ali's mother", "Ali's father"), 1),
            q("What did Maria buy two years ago?", listOf("a carpet", "a painting", "a book", "a car"), 0),
            q("I ___ to Paris last year.", listOf("go", "goes", "went", "going"), 2),
            q("She ___ pizza yesterday.", listOf("eat", "eats", "ate", "eating"), 2),
            q("___ you see the movie?", listOf("Do", "Did", "Are", "Was"), 1),
            q("I ___ go to the party.", listOf("didn't", "don't", "not", "no"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Too bad", "حیف شد", "That's too bad.", "حیف شد."),
            IdiomExpression("Yum", "مم", "Yum! I love seafood.", "مم! عاشق غذای دریایی‌ام."),
            IdiomExpression("I'm glad to hear that", "خوشحالم که این را می‌شنوم", "I'm glad to hear that.", "خوشحالم که این را می‌شنوم."),
            IdiomExpression("Worth it", "ارزشش را داشت", "It was worth it.", "ارزشش را داشت.")
        ),
        phrasal = listOf(
            PhrasalVerb("come back", "برگشتن", "return", "We came back Sunday.", "یکشنبه برگشتیم.", "No"),
            PhrasalVerb("go away", "دور شدن", "leave", "They went away for the weekend.", "آخر هفته دور رفتند.", "No"),
            PhrasalVerb("try on", "پرو کردن", "test", "She tried on the dress.", "لباس را پرو کرد.", "Yes"),
            PhrasalVerb("find out", "فهمیدن", "discover", "I found out the truth.", "حقیقت را فهمیدم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("-ed endings", "Regular verbs: /t/ worked, /d/ played, /ɪd/ visited."),
            PronunciationTip("Irregular verbs", "go/went, see/saw, eat/ate, buy/bought, have/had, meet/met."),
            PronunciationTip("Past tense rhythm", "I WENT to the BEACH. She ATE pizza."),
        ),
        culture = listOf(
            CulturalNote("Storytelling", "Telling stories about the past is a common way to build connections."),
            CulturalNote("Travel souvenirs", "Buying a souvenir from a trip is a common way to remember a place."),
            CulturalNote("Family recipes", "Family recipes are often passed down through generations.")
        ),
        mistakes = listOf(
            CommonMistake("I go to Paris last year.", "I went to Paris last year.", "Use past simple 'went' for past actions."),
            CommonMistake("Did you went?", "Did you go?", "After 'Did', use base verb."),
            CommonMistake("She didn't ate.", "She didn't eat.", "After 'didn't', use base verb."),
            CommonMistake("I visited to my aunt.", "I visited my aunt.", "Don't use 'to' after 'visit'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did Ali do on the weekend?", "He went to the beach with his family — swam, played volleyball, ate seafood."),
            ComprehensionQuestion("What did Maria do on the weekend?", "She visited her grandmother and cooked a traditional stew."),
            ComprehensionQuestion("What did Maria buy in Ali's city two years ago?", "A beautiful carpet.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about what you did last weekend.", "درباره کاری که آخر هفته انجام دادی صحبت کن.", "I went... / I visited... / I ate..."),
            SpeakingTask("Ask and answer about a past trip.", "درباره یک سفر گذشته بپرس و جواب بده.", "Where did you go? / What did you do? / Did you like it?"),
            SpeakingTask("Tell a memorable experience.", "یک تجربه به‌یادماندنی تعریف کن.", "It was... / I went to... / It was a great experience.")
        ),
        writing = listOf(
            WritingTask("Write about a memorable trip.", "درباره یک سفر به‌یادماندنی بنویس.", 130, "Use simple past with regular and irregular verbs.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 10 — Celebrations | جشن‌ها
    // ═══════════════════════════════════════════════════════════════
    private fun unit10() = base(
        10, "Celebrations", "جشن‌ها",
        listOf(
            "Talk about holidays and celebrations",
            "Use the present continuous for ongoing actions",
            "Describe what people are doing now",
            "Invite someone to a celebration"
        ),
        listOf(
            v("celebration", "جشن", "The celebration was amazing.", "جشن شگفت‌انگیز بود."),
            v("holiday", "تعطیلات", "Happy holiday!", "تعطیلات خوش!"),
            v("birthday", "تولد", "Happy birthday!", "تولدت مبارک!"),
            v("wedding", "عروسی", "Their wedding is next week.", "عروسی‌شان هفته بعد است."),
            v("party", "مهمانی", "We're having a party.", "مهمانی داریم."),
            v("gift", "هدیه", "I got a nice gift.", "هدیه قشنگی گرفتم."),
            v("cake", "کیک", "The birthday cake was delicious.", "کیک تولد خوشمزه بود."),
            v("candle", "شمع", "Blow out the candles!", "شمع‌ها را فوت کن!"),
            v("decorate", "تزئین کردن", "We decorated the room.", "اتاق را تزئین کردیم.", "verb"),
            v("invite", "دعوت کردن", "She invited all her friends.", "همه دوستانش را دعوت کرد.", "verb"),
            v("celebrate", "جشن گرفتن", "We celebrate New Year together.", "با هم سال نو را جشن می‌گیریم.", "verb"),
            v("present", "هدیه", "She got many presents.", "هدیه‌های زیادی گرفت."),
            v("traditional", "سنتی", "It's a traditional celebration.", "جشن سنتی است.", "adjective"),
            v("fireworks", "آتش‌بازی", "The fireworks were beautiful.", "آتش‌بازی زیبا بود."),
            v("singing", "آواز", "There was singing and dancing.", "آواز و رقص بود.")
        ),
        listOf(
            GrammarSection("Present continuous", "Use am/is/are + verb-ing for actions happening now. I am studying. She is cooking. They are dancing."),
            GrammarSection("Present continuous negatives and questions", "Use isn't/aren't + verb-ing. Use Is/Are + subject + verb-ing? I'm not sleeping. Are you listening?"),
            GrammarSection("Present continuous vs simple present", "Simple present: habits and routines. I usually work. Present continuous: actions now. I'm working right now."),
            GrammarSection("Invitations with 'Would you like to...?'", "Would you like to come to my party? Would you like to join us?")
        ),
        listOf(
            d("A", "Hello? Maria speaking.", "الو؟ ماریا صحبت می‌کند."),
            d("B", "Hi, Maria! It's Ali. Am I calling at a bad time?", "سلام، ماریا! علی هستم. زمان بدی زنگ زدم؟"),
            d("A", "No, not at all. I'm just watching TV.", "نه، اصلاً. فقط دارم تلویزیون تماشا می‌کنم."),
            d("B", "Good. Listen, are you free on Saturday?", "خوبه. گوش کن، شنبه آزادی؟"),
            d("A", "Let me check. Yes, I think I am. Why?", "بگذار چک کنم. بله، فکر می‌کنم هستم. چرا؟"),
            d("B", "It's my sister's birthday. We're having a party. Would you like to come?", "تولد خواهرم است. مهمانی داریم. می‌خواهی بیایی؟"),
            d("A", "I'd love to! What time?", "دوست دارم! چه ساعتی؟"),
            d("B", "It starts at 7 PM. We're decorating the house in the afternoon.", "ساعت ۷ شب شروع می‌شود. بعدازظهر خانه را تزئین می‌کنیم."),
            d("A", "Can I help with anything?", "می‌توانم کمکی بکنم؟"),
            d("B", "That's kind of you. Maybe you can bring some music.", "مهربانی. شاید بتوانی موسیقی بیاوری."),
            d("A", "Sure! I have great playlists. What kind does she like?", "حتماً! پلی‌لیست‌های عالی دارم. چه نوعی دوست دارد؟"),
            d("B", "She loves pop music. And some traditional songs too.", "عاشق پاپ است. و چند آهنگ سنتی هم."),
            d("A", "No problem. I'll make a good mix.", "مشکلی نیست. میکس خوبی می‌سازم."),
            d("B", "Great. Oh, are you bringing anyone?", "عالی. اوه، کسی را می‌آوری؟"),
            d("A", "Can I bring my roommate? She's very friendly.", "می‌توانم هم‌اتاقی‌ام را بیاورم؟ او خیلی دوستانه است."),
            d("B", "Of course! The more, the merrier.", "البته! هر چه بیشتر، شادتر."),
            d("A", "Thanks. What should we wear?", "ممنون. چه بپوشیم؟"),
            d("B", "Something casual. It's just family and close friends.", "چیزی راحت. فقط خانواده و دوستان نزدیک هستند."),
            d("A", "Perfect. What are you doing now?", "عالی. الان چه کار می‌کنی؟"),
            d("B", "I'm baking a cake for the party. It's taking longer than I thought.", "دارم برای مهمانی کیک می‌پزم. بیشتر از آنچه فکر می‌کردم طول می‌کشد."),
            d("A", "Ha! What kind of cake?", "ها! چه نوع کیکی؟"),
            d("B", "Chocolate. My sister's favorite.", "شکلاتی. مورد علاقه خواهرم."),
            d("A", "Sounds delicious. Are you making it from scratch?", "خوشمزه به نظر می‌رسد. از صفر می‌سازی؟"),
            d("B", "Yes! It's my grandmother's recipe.", "بله! دستور پخت مادربزرگم است."),
            d("A", "That's special. Family recipes are the best.", "خاص است. دستورهای پخت خانوادگی بهترین هستند."),
            d("B", "I agree. Well, I should get back to it.", "موافقم. خب، باید برگردم به آن."),
            d("A", "Okay. See you Saturday at 7.", "باشه. شنبه ساعت ۷ می‌بینمت."),
            d("B", "See you! Don't forget the music!", "می‌بینمت! موسیقی را فراموش نکن!"),
            d("A", "I won't. Bye!", "فراموش نمی‌کنم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Oh, one more thing.", "اوه، یک چیز دیگر."),
            d("B", "Yes?", "بله؟"),
            d("A", "Should I bring a gift?", "هدیه بیاورم؟"),
            d("B", "You don't have to. But if you want, she loves books.", "لازم نیست. ولی اگر می‌خواهی، عاشق کتاب است."),
            d("A", "Perfect. I'll bring one.", "عالی. یکی می‌آورم."),
            d("B", "Great. See you Saturday!", "عالی. شنبه می‌بینمت!"),
            d("A", "See you!", "می‌بینمت!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Whose birthday is it?", listOf("Ali's", "Maria's", "Ali's sister's", "Maria's roommate's"), 2),
            q("What is Ali doing right now?", listOf("watching TV", "baking a cake", "reading", "cooking dinner"), 1),
            q("What kind of cake?", listOf("vanilla", "chocolate", "strawberry", "carrot"), 1),
            q("What will Maria bring?", listOf("cake", "gift and music", "flowers", "drinks"), 1),
            q("I ___ watching TV right now.", listOf("am", "is", "are", "be"), 0),
            q("She ___ baking a cake.", listOf("am", "is", "are", "be"), 1),
            q("They ___ decorating the house.", listOf("am", "is", "are", "be"), 2),
            q("___ you listening?", listOf("Am", "Is", "Are", "Do"), 2)
        ),
        idioms = listOf(
            IdiomExpression("The more, the merrier", "هر چه بیشتر، شادتر", "The more, the merrier.", "هر چه بیشتر، شادتر."),
            IdiomExpression("From scratch", "از صفر", "I made it from scratch.", "از صفر ساختمش."),
            IdiomExpression("Not at all", "اصلاً", "Not at all.", "اصلاً."),
            IdiomExpression("Get back to", "برگشتن به", "I should get back to it.", "باید به آن برگردم.")
        ),
        phrasal = listOf(
            PhrasalVerb("get back to", "برگشتن به", "return to", "I should get back to cooking.", "باید به آشپزی برگردم.", "No"),
            PhrasalVerb("blow out", "فوت کردن", "extinguish", "Blow out the candles!", "شمع‌ها را فوت کن!", "Yes"),
            PhrasalVerb("put up", "نصب کردن", "hang", "We put up decorations.", "تزئینات نصب کردیم.", "Yes"),
            PhrasalVerb("dress up", "لباس رسمی پوشیدن", "wear nice clothes", "They dressed up for the party.", "برای مهمانی لباس رسمی پوشیدند.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Present continuous -ing", "watching /ˈwɒtʃɪŋ/, baking /ˈbeɪkɪŋ/, decorating /ˈdekəreɪtɪŋ/."),
            PronunciationTip("Invitation intonation", "Would you like to come? ↗ (rising, friendly)"),
            PronunciationTip("Contractions", "I'm /aɪm/, you're /jɔːr/, she's /ʃiːz/, we're /wɪər/, they're /ðeər/.")
        ),
        culture = listOf(
            CulturalNote("Birthdays", "In many cultures, birthday parties include cake, candles, and singing 'Happy Birthday'."),
            CulturalNote("Gift-giving", "Gift-giving customs vary. In some cultures, gifts are opened immediately; in others, later."),
            CulturalNote("Family celebrations", "Family celebrations often include traditional foods and recipes passed down through generations.")
        ),
        mistakes = listOf(
            CommonMistake("I watching TV.", "I am watching TV.", "Use 'am/is/are' + verb-ing."),
            CommonMistake("She are cooking.", "She is cooking.", "Use 'is' with she/he/it."),
            CommonMistake("Are you listen?", "Are you listening?", "Use -ing form after 'are' in present continuous."),
            CommonMistake("I no working.", "I'm not working.", "Use 'not' after the auxiliary verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is the party for?", "Ali's sister's birthday."),
            ComprehensionQuestion("What is Ali doing when he calls?", "Baking a chocolate cake for the party."),
            ComprehensionQuestion("What does Maria offer to bring?", "Music and a gift (a book) for Ali's sister.")
        ),
        speaking = listOf(
            SpeakingTask("Invite a friend to a celebration.", "دوستت را به یک جشن دعوت کن.", "Would you like to come to...? / It's at... / You can bring..."),
            SpeakingTask("Talk about a celebration in your culture.", "درباره یک جشن در فرهنگت صحبت کن.", "We celebrate... / We eat... / It's a traditional..."),
            SpeakingTask("Describe what people are doing right now.", "توصیف کن که مردم الان چه کار می‌کنند.", "She's... / He's... / They're...")
        ),
        writing = listOf(
            WritingTask("Write about your favorite celebration.", "درباره جشن مورد علاقه‌ات بنویس.", 140, "Use present continuous and simple present.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 11 — Health | سلامتی
    // ═══════════════════════════════════════════════════════════════
    private fun unit11() = base(
        11, "Health", "سلامتی",
        listOf(
            "Talk about health and how you feel",
            "Give advice with 'should' and 'shouldn't'",
            "Describe symptoms and health problems",
            "Talk about healthy habits"
        ),
        listOf(
            v("health", "سلامتی", "Health is important.", "سلامتی مهم است."),
            v("healthy", "سالم", "She eats healthy food.", "او غذای سالم می‌خورد.", "adjective"),
            v("sick", "بیمار", "I feel sick.", "احساس بیماری می‌کنم.", "adjective"),
            v("headache", "سردرد", "I have a headache.", "سردرد دارم."),
            v("stomachache", "دل‌درد", "She has a stomachache.", "او دل‌درد دارد."),
            v("cold", "سرماخوردگی", "I have a cold.", "سرماخورده‌ام."),
            v("cough", "سرفه", "He has a bad cough.", "سرفه بدی دارد."),
            v("fever", "تب", "The child has a fever.", "بچه تب دارد."),
            v("medicine", "دارو", "Take this medicine.", "این دارو را بخور."),
            v("doctor", "پزشک", "You should see a doctor.", "باید دکتر ببینی."),
            v("tired", "خسته", "I'm very tired.", "خیلی خسته‌ام.", "adjective"),
            v("rest", "استراحت", "You need to rest.", "باید استراحت کنی."),
            v("exercise", "ورزش", "Exercise every day.", "هر روز ورزش کن."),
            v("sleep", "خواب", "Get enough sleep.", "خواب کافی داشته باش."),
            v("stress", "استرس", "Stress is bad for you.", "استرس برایت بد است.")
        ),
        listOf(
            GrammarSection("Should / Shouldn't for advice", "Use should + base verb for advice. You should rest. You shouldn't eat fast food."),
            GrammarSection("Have + health problems", "Use 'have' with health issues. I have a headache. She has a fever. Do you have a cold?"),
            GrammarSection("Feel + adjective", "Use feel + adjective. I feel sick. She feels tired. Do you feel OK?"),
            GrammarSection("Imperatives for advice", "Take this medicine. Drink water. Rest. Don't smoke.")
        ),
        listOf(
            d("A", "Hey, Ali. You don't look well. Are you OK?", "هی، علی. خوب به نظر نمی‌رسی. خوبی؟"),
            d("B", "Not really. I feel terrible.", "نه واقعاً. خیلی بد حس می‌کنم."),
            d("A", "What's wrong?", "چی شده؟"),
            d("B", "I have a bad headache and a fever. I think I have a cold.", "سردرد بدی دارم و تب. فکر می‌کنم سرماخورده‌ام."),
            d("A", "That's too bad. Have you seen a doctor?", "حیف شد. دکتر دیده‌ای؟"),
            d("B", "Not yet. I'm just drinking tea and resting.", "هنوز نه. فقط چای می‌نوشم و استراحت می‌کنم."),
            d("A", "You should see a doctor. It might be serious.", "باید دکتر ببینی. ممکن است جدی باشد."),
            d("B", "You think so? I usually feel better after a day or two.", "فکر می‌کنی؟ معمولاً بعد از یکی دو روز بهتر می‌شوم."),
            d("A", "But a fever is not a good sign. You shouldn't wait too long.", "ولی تب نشانه خوبی نیست. نباید زیاد صبر کنی."),
            d("B", "Okay. I'll call my doctor tomorrow morning.", "باشه. فردا صبح به دکترم زنگ می‌زنم."),
            d("A", "Good. Are you taking any medicine?", "خوبه. دارویی مصرف می‌کنی؟"),
            d("B", "Just some painkillers for the headache.", "فقط چند مسکن برای سردرد."),
            d("A", "That's fine. But you should also drink a lot of water.", "اشکالی ندارد. ولی باید آب هم زیاد بنوشی."),
            d("B", "I know. I'm drinking water and tea.", "می‌دانم. آب و چای می‌نوشم."),
            d("A", "And you should get plenty of sleep.", "و باید خواب کافی داشته باشی."),
            d("B", "I'm trying. But I can't sleep well with this headache.", "تلاش می‌کنم. ولی با این سردرد نمی‌توانم خوب بخوابم."),
            d("A", "Have you tried a warm shower? It helps.", "دوش گرم امتحان کرده‌ای؟ کمک می‌کند."),
            d("B", "No, I haven't. I'll try it.", "نه، نکرده‌ام. امتحان می‌کنم."),
            d("A", "And you shouldn't drink coffee. It can make it worse.", "و نباید قهوه بنوشی. می‌تواند بدترش کند."),
            d("B", "Okay. I'll have tea instead.", "باشه. به جایش چای می‌نوشم."),
            d("A", "Good. Also, you shouldn't go to work tomorrow.", "خوبه. همچنین، نباید فردا به کار بروی."),
            d("B", "But I have an important meeting!", "ولی جلسه مهمی دارم!"),
            d("A", "Your health comes first. You can reschedule.", "سلامتی‌ات اولویت دارد. می‌توانی جابجا کنی."),
            d("B", "You're right. I'll send an email.", "حق داری. ایمیلی می‌فرستم."),
            d("A", "Perfect. Do you need anything?", "عالی. چیزی نیاز داری؟"),
            d("B", "No, but thanks for asking.", "نه، ولی ممنون که پرسیدی."),
            d("A", "Do you want me to bring you some soup?", "می‌خواهی برایت سوپ بیاورم؟"),
            d("B", "That's kind of you. Chicken soup would be nice.", "مهربانی. سوپ مرغ خوب می‌شود."),
            d("A", "I'll bring some in the evening.", "عصر کمی می‌آورم."),
            d("B", "Thanks, Maria. You're a good friend.", "ممنون، ماریا. دوست خوبی هستی."),
            d("A", "Anytime. Now go rest.", "هر وقت. حالا برو استراحت کن."),
            d("B", "I will. See you later.", "می‌کنم. بعداً می‌بینمت."),
            d("A", "See you. Feel better!", "می‌بینمت. بهتر شو!"),
            d("B", "Thanks. Bye!", "ممنون. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Oh, one more thing.", "اوه، یک چیز دیگر."),
            d("A", "Yes?", "بله؟"),
            d("B", "What should I eat? I don't feel like cooking.", "چه بخورم؟ حوصله آشپزی ندارم."),
            d("A", "You should eat light food. Soup, rice, and vegetables.", "باید غذای سبک بخوری. سوپ، برنج، و سبزیجات."),
            d("B", "No pizza then?", "پس پیتزا نه؟"),
            d("A", "Ha! Not today. Maybe next week.", "ها! امروز نه. شاید هفته بعد."),
            d("B", "Okay, okay. Thanks for the advice.", "باشه، باشه. ممنون برای توصیه."),
            d("A", "Anytime. Bye!", "هر وقت. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What's wrong with Ali?", listOf("headache and fever", "stomachache", "broken arm", "toothache"), 0),
            q("What does Maria suggest?", listOf("coffee", "a warm shower", "watching TV", "going out"), 1),
            q("What shouldn't Ali drink?", listOf("water", "tea", "coffee", "juice"), 2),
            q("What will Maria bring?", listOf("pizza", "chicken soup", "medicine", "cake"), 1),
            q("You ___ see a doctor.", listOf("should", "shouldn't", "mustn't", "can't"), 0),
            q("You ___ drink coffee.", listOf("should", "shouldn't", "mustn't", "have to"), 1),
            q("I ___ a headache.", listOf("have", "has", "having", "had"), 0),
            q("She ___ a fever.", listOf("have", "has", "having", "had"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Feel terrible", "خیلی بد حس کردن", "I feel terrible.", "خیلی بد حس می‌کنم."),
            IdiomExpression("Health comes first", "سلامتی اولویت دارد", "Your health comes first.", "سلامتی‌ات اولویت دارد."),
            IdiomExpression("Feel like", "حوصله داشتن", "I don't feel like cooking.", "حوصله آشپزی ندارم."),
            IdiomExpression("Feel better", "بهتر شدن", "Feel better!", "بهتر شو!")
        ),
        phrasal = listOf(
            PhrasalVerb("look after", "مراقبت کردن", "take care of", "Look after your health.", "از سلامتی‌ات مراقبت کن.", "No"),
            PhrasalVerb("work out", "ورزش کردن", "exercise", "I work out every day.", "هر روز ورزش می‌کنم.", "No"),
            PhrasalVerb("give up", "ترک کردن", "quit", "He gave up smoking.", "سیگار را ترک کرد.", "Yes"),
            PhrasalVerb("cut down on", "کم کردن", "reduce", "Cut down on sugar.", "شکر را کم کن.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Health vocabulary", "headache /ˈhedeɪk/, stomachache /ˈstʌməkeɪk/, fever /ˈfiːvər/."),
            PronunciationTip("'Should' reduction", "'Should' is often reduced to /ʃəd/ in fast speech."),
            PronunciationTip("Advice intonation", "You SHOULD rest. ↘ You SHOULDN'T smoke. ↘")
        ),
        culture = listOf(
            CulturalNote("Health advice", "In many cultures, asking about health is a sign of caring."),
            CulturalNote("Home remedies", "Every culture has traditional home remedies — chicken soup, herbal tea, honey and lemon."),
            CulturalNote("Work-life balance", "Prioritizing health over work is increasingly valued in modern societies.")
        ),
        mistakes = listOf(
            CommonMistake("I have headache.", "I have a headache.", "Use 'a' with 'headache'."),
            CommonMistake("You should to rest.", "You should rest.", "After 'should', use base verb without 'to'."),
            CommonMistake("She have a cold.", "She has a cold.", "Use 'has' with she/he/it."),
            CommonMistake("I don't feel goodly.", "I don't feel good.", "Use 'good' (adjective) after 'feel'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Ali's symptoms?", "A bad headache and a fever — probably a cold."),
            ComprehensionQuestion("What advice does Maria give?", "See a doctor, drink water, get sleep, take a warm shower, avoid coffee, rest from work."),
            ComprehensionQuestion("What does Maria offer to do?", "Bring chicken soup in the evening.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a time you were sick.", "درباره زمانی که بیمار بودی صحبت کن.", "I had... / I felt... / I took..."),
            SpeakingTask("Give health advice to a friend.", "به دوستی توصیه سلامتی بده.", "You should... / You shouldn't... / Make sure to..."),
            SpeakingTask("Role-play a doctor's appointment.", "نقش‌بازی ملاقات با پزشک.", "I have... / What should I do? / Take this medicine.")
        ),
        writing = listOf(
            WritingTask("Write about your healthy habits.", "درباره عادات سالمت بنویس.", 130, "Use should/shouldn't and imperatives.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 12 — Plans | برنامه‌ها
    // ═══════════════════════════════════════════════════════════════
    private fun unit12() = base(
        12, "Plans", "برنامه‌ها",
        listOf(
            "Talk about future plans and intentions",
            "Use 'be going to' for plans",
            "Use 'will' for predictions and offers",
            "Make and accept invitations about future activities"
        ),
        listOf(
            v("plan", "برنامه", "What are your plans for the weekend?", "برنامه‌های آخر هفته‌ات چیست؟"),
            v("future", "آینده", "In the future, I want to travel.", "در آینده، می‌خواهم سفر کنم."),
            v("vacation", "تعطیلات", "We're going on vacation next month.", "ماه بعد به تعطیلات می‌رویم."),
            v("trip", "سفر", "We're planning a trip to Japan.", "در حال برنامه‌ریزی سفر به ژاپن هستیم."),
            v("tomorrow", "فردا", "See you tomorrow.", "فردا می‌بینمت.", "adverb"),
            v("next week", "هفته بعد", "I'll call you next week.", "هفته بعد زنگ می‌زنم.", "phrase"),
            v("next month", "ماه بعد", "We're moving next month.", "ماه بعد اسباب‌کشی می‌کنیم.", "phrase"),
            v("soon", "به‌زودی", "I'll be back soon.", "به‌زودی برمی‌گردم.", "adverb"),
            v("later", "بعداً", "Let's talk later.", "بعداً صحبت کنیم.", "adverb"),
            v("probably", "احتمالاً", "I'll probably go.", "احتمالاً می‌روم.", "adverb"),
            v("maybe", "شاید", "Maybe we'll see you there.", "شاید آنجا ببینیمت.", "adverb"),
            v("going to", "قرار است", "I'm going to study tonight.", "امشب قرار است درس بخوانم."),
            v("hope", "امیدوار بودن", "I hope you can come.", "امیدوارم بتوانی بیایی.", "verb"),
            v("exciting", "هیجان‌انگیز", "That sounds exciting!", "هیجان‌انگیز به نظر می‌رسد!", "adjective"),
            v("forward to", "منتظر بودن", "I'm looking forward to the trip.", "منتظر سفر هستم.")
        ),
        listOf(
            GrammarSection("Be going to for plans", "Use am/is/are + going to + base verb. I'm going to visit my parents. She's going to study medicine. We're going to travel."),
            GrammarSection("Will for predictions and offers", "Use will + base verb. I think it will rain. I'll help you. It'll be fun."),
            GrammarSection("Present continuous for future arrangements", "Use present continuous for fixed plans. I'm meeting my friend tomorrow. We're leaving at 6."),
            GrammarSection("Future time expressions", "tomorrow, next week, next month, next year, soon, later, in a few days, this weekend.")
        ),
        listOf(
            d("A", "Hi, Ali! What are your plans for the summer?", "سلام، علی! برنامه‌هایت برای تابستان چیست؟"),
            d("B", "I'm going to travel to Turkey with my family.", "قرار است با خانواده‌ام به ترکیه سفر کنم."),
            d("A", "Wow, that sounds exciting! Where in Turkey?", "واو، هیجان‌انگیز به نظر می‌رسد! کجای ترکیه؟"),
            d("B", "We're going to Istanbul first, then Cappadocia.", "اول به استانبول می‌رویم، بعد کاپادوکیا."),
            d("A", "Cappadocia! I've seen photos. It's beautiful.", "کاپادوکیا! عکس‌هایش را دیده‌ام. زیباست."),
            d("B", "Yes, I'm really looking forward to it.", "بله، واقعاً منتظرش هستم."),
            d("A", "How long are you going to stay?", "چقدر می‌مانید؟"),
            d("B", "Two weeks. We're going to visit many places.", "دو هفته. از مکان‌های زیادی بازدید می‌کنیم."),
            d("A", "That's a good amount of time. What about you, Maria?", "زمان خوبی است. تو چطور، ماریا؟"),
            d("B", "Well, I'm not going anywhere exotic. But I have plans too.", "خب، من جای عجیبی نمی‌روم. ولی برنامه دارم."),
            d("A", "What are you going to do?", "چه کار می‌کنی؟"),
            d("B", "I'm going to take an English course in London.", "قرار است در لندن دوره انگلیسی بگذرانم."),
            d("A", "London! That's amazing. How long?", "لندن! شگفت‌انگیز است. چقدر؟"),
            d("B", "One month. I'm leaving in July.", "یک ماه. جولای می‌روم."),
            d("A", "Will you stay with a family?", "با خانوادهای می‌مانی؟"),
            d("B", "Yes, a host family. It's part of the program.", "بله، یک خانواده میزبان. بخشی از برنامه است."),
            d("A", "That's a great way to learn English.", "روش عالی‌ای برای یادگیری انگلیسی است."),
            d("B", "I agree. I'll practice every day.", "موافقم. هر روز تمرین می‌کنم."),
            d("A", "What are you going to do on weekends?", "آخر هفته‌ها چه می‌کنی؟"),
            d("B", "I'll probably visit museums. And maybe take short trips.", "احتمالاً از موزه‌ها بازدید می‌کنم. و شاید سفرهای کوتاه."),
            d("A", "Sounds perfect. And you, Maria? What about after London?", "عالی به نظر می‌رسد. و تو، ماریا؟ بعد از لندن؟"),
            d("B", "After London, I'm going to start a new job.", "بعد از لندن، قرار است شغل جدیدی شروع کنم."),
            d("A", "Really? What kind of job?", "واقعاً؟ چه نوع شغلی؟"),
            d("B", "I'm going to work at a hospital. As a nurse.", "قرار است در بیمارستان کار کنم. به عنوان پرستار."),
            d("A", "That's wonderful! Congratulations.", "شگفت‌انگیز است! تبریک می‌گویم."),
            d("B", "Thanks. I'm a bit nervous but excited.", "ممنون. کمی مضطربم ولی هیجان‌زده."),
            d("A", "You'll do great. You're very good at your job.", "عالی می‌شوی. در کارت خیلی خوبی."),
            d("B", "Thanks, Ali. That means a lot.", "ممنون، علی. این خیلی معنی دارد."),
            d("A", "What about you, Ali? Any other plans?", "تو چطور، علی؟ برنامه دیگری داری؟"),
            d("B", "Well, after Turkey, I'm going to take guitar lessons.", "خب، بعد از ترکیه، قرار است درس گیتار بگیرم."),
            d("A", "That's a great idea. You already play well.", "فکر عالی‌ای است. الان هم خوب می‌نوازی."),
            d("B", "Thanks. But I want to improve.", "ممنون. ولی می‌خواهم بهتر شوم."),
            d("A", "What about you, Maria?", "تو چطور، ماریا؟"),
            d("B", "I'm going to learn French too. Maybe in the fall.", "قرار است فرانسوی هم یاد بگیرم. شاید پاییز."),
            d("A", "You're ambitious!", "جاه‌طلب هستی!"),
            d("B", "Ha! I just love learning new things.", "ها! فقط عاشق یادگیری چیزهای جدیدم."),
            d("A", "Well, I'm going to spend my summer relaxing.", "خب، من قرار است تابستانم را استراحت کنم."),
            d("B", "That's important too.", "این هم مهم است."),
            d("A", "Yes. We all need rest. Well, I should go.", "بله. همه به استراحت نیاز داریم. خب، باید بروم."),
            d("B", "Okay. Good luck with the plans!", "باشه. با برنامه‌ها موفق باشی!"),
            d("A", "You too. See you soon!", "تو هم. به‌زودی می‌بینمت!"),
            d("B", "See you! And send photos from Turkey!", "می‌بینمت! و از ترکیه عکس بفرست!"),
            d("A", "Ha! I will. Bye!", "ها! می‌فرستم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Oh, and I hope you enjoy London.", "اوه، و امیدوارم از لندن لذت ببری."),
            d("B", "Thanks! I'll text you from there.", "ممنون! از آنجا برایت پیام می‌دهم."),
            d("A", "Perfect. Bye!", "عالی. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Where is Ali going to travel?", listOf("London", "Turkey", "Japan", "Paris"), 1),
            q("How long will Ali stay?", listOf("1 week", "2 weeks", "1 month", "2 months"), 1),
            q("What is Maria going to do in London?", listOf("work", "study English", "visit family", "teach"), 1),
            q("What is Maria going to do after London?", listOf("travel", "start a new job", "study French", "rest"), 1),
            q("I ___ going to travel this summer.", listOf("am", "is", "are", "be"), 0),
            q("She ___ going to study medicine.", listOf("am", "is", "are", "be"), 1),
            q("We ___ going to visit Istanbul.", listOf("am", "is", "are", "be"), 2),
            q("I think it ___ rain tomorrow.", listOf("will", "going to", "is", "was"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Looking forward to", "منتظر بودن", "I'm looking forward to it.", "منتظرش هستم."),
            IdiomExpression("A good amount of time", "زمان خوبی", "That's a good amount of time.", "زمان خوبی است."),
            IdiomExpression("Means a lot", "خیلی معنی دارد", "That means a lot.", "این خیلی معنی دارد."),
            IdiomExpression("Good luck", "موفق باشی", "Good luck with the plans!", "با برنامه‌ها موفق باشی!")
        ),
        phrasal = listOf(
            PhrasalVerb("look forward to", "منتظر بودن", "anticipate", "I'm looking forward to the trip.", "منتظر سفر هستم.", "No"),
            PhrasalVerb("take up", "شروع کردن", "start", "I'm going to take up guitar.", "قرار است گیتار شروع کنم.", "Yes"),
            PhrasalVerb("go back", "برگشتن", "return", "When will you go back?", "کی برمی‌گردی؟", "No"),
            PhrasalVerb("check out", "بررسی کردن", "examine", "I'll check out the museums.", "موزه‌ها را بررسی می‌کنم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("'Going to' reduction", "'Going to' reduces to 'gonna' in informal speech. I'm gonna travel."),
            PronunciationTip("Will contraction", "'Will' contracts to 'll: I'll, you'll, she'll, we'll, they'll."),
            PronunciationTip("Future intonation", "I'm GOing to TRAvel. (stress content words)"),
        ),
        culture = listOf(
            CulturalNote("Summer vacations", "Summer vacations vary across cultures. In many countries, July and August are holiday months."),
            CulturalNote("Study abroad", "Studying abroad is a popular way to learn languages and experience new cultures."),
            CulturalNote("Future planning", "Making plans for the future is a common conversation topic among friends.")
        ),
        mistakes = listOf(
            CommonMistake("I going to travel.", "I am going to travel.", "Use 'am/is/are' + 'going to'."),
            CommonMistake("She are going to study.", "She is going to study.", "Use 'is' with she/he/it."),
            CommonMistake("I will to travel.", "I will travel.", "After 'will', use base verb without 'to'."),
            CommonMistake("We're going to visits.", "We're going to visit.", "After 'going to', use base verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Ali's summer plans?", "Travel to Turkey (Istanbul and Cappadocia), then take guitar lessons."),
            ComprehensionQuestion("What are Maria's plans?", "Study English in London for a month, then start a new nursing job, then learn French."),
            ComprehensionQuestion("How do they feel about their plans?", "Both are excited — Ali is looking forward to Turkey, Maria is nervous but excited.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your plans for next summer.", "درباره برنامه‌هایت برای تابستان بعد صحبت کن.", "I'm going to... / I'll probably... / I hope to..."),
            SpeakingTask("Make plans with a friend.", "با دوستی برنامه‌ریزی کن.", "Are you free...? / Let's... / I'll meet you at..."),
            SpeakingTask("Talk about future dreams.", "درباره رویاهای آینده صحبت کن.", "Someday I want to... / I hope I'll... / In the future...")
        ),
        writing = listOf(
            WritingTask("Write about your plans for the next year.", "درباره برنامه‌هایت برای سال آینده بنویس.", 150, "Use 'be going to' and 'will'.")
        )
    )
}