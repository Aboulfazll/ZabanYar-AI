package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 4th Edition — Level 3
 * 10 Files × 3 Lessons (A/B/C) + 5 PE + 5 R&C = 40 Lessons | B1 Intermediate
 * مکالمه: ۱۴-۱۶ خط
 */
object AmericanEnglishFile4thLevel3 {
    const val BOOK_ID = "american_english_file_4th_level3"

    fun getContent(n: Int): LessonContent = when (n) {
        1 -> f1A(); 2 -> f1B(); 3 -> f1C()
        4 -> pe1(); 5 -> rc12()
        6 -> f2A(); 7 -> f2B(); 8 -> f2C()
        9 -> pe2(); 10 -> rc34()
        11 -> f3A(); 12 -> f3B(); 13 -> f3C()
        14 -> pe3(); 15 -> rc56()
        16 -> f4A(); 17 -> f4B(); 18 -> f4C()
        19 -> pe4(); 20 -> rc78()
        21 -> f5A(); 22 -> f5B(); 23 -> f5C()
        24 -> pe5(); 25 -> rc910()
        26 -> f6A(); 27 -> f6B(); 28 -> f6C()
        29 -> f7A(); 30 -> f7B(); 31 -> f7C()
        32 -> f8A(); 33 -> f8B(); 34 -> f8C()
        35 -> f9A(); 36 -> f9B(); 37 -> f9C()
        38 -> f10A(); 39 -> f10B(); 40 -> f10C()
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

    // ═══════════ FILE 1 — Moods and feelings ═══════════

    private fun f1A() = base(1, "1A Questions and answers", "۱A سوال و جواب",
        listOf(
            "Review question formation",
            "Use auxiliary verbs correctly",
            "Show interest in a conversation",
            "Use friendly intonation"
        ),
        listOf(
            v("auxiliary", "کمکی", "Auxiliary verbs help form questions.", "افعال کمکی به ساخت سوال کمک می‌کنند."),
            v("curious", "کنجکاو", "She's very curious about everything.", "او درباره همه چیز خیلی کنجکاوست.", "adjective"),
            v("catch up", "خبر گرفتن", "Let's catch up sometime.", "یک وقت خبر بگیریم.", "verb"),
            v("keep in touch", "در تماس بودن", "We keep in touch on social media.", "در شبکه‌های اجتماعی در تماسیم.", "verb"),
            v("gossip", "غیبت کردن", "They love to gossip about celebrities.", "عاشق غیبت درباره سلبریتی‌ها هستند.", "verb"),
            v("small talk", "گفتگوی کوتاه", "The British are good at small talk.", "بریتانیایی‌ها در گفتگوی کوتاه خوب هستند."),
            v("topic", "موضوع", "That's a sensitive topic.", "این موضوع حساسی است."),
            v("awkward", "معذب‌کننده", "There was an awkward silence.", "سکوت معذب‌کننده‌ای بود.", "adjective"),
            v("genuine", "واقعی", "She showed genuine interest.", "او علاقه واقعی نشان داد.", "adjective"),
            v("respond", "پاسخ دادن", "He didn't respond to my question.", "او به سوال من پاسخ نداد.", "verb")
        ),
        listOf(
            GrammarSection("Question formation", "Auxiliary + subject + main verb. Where do you live? What are you doing? How long have you been...?"),
            GrammarSection("Auxiliary verbs", "do/does/did for present/past simple. be for continuous. have for perfect."),
            GrammarSection("Short answers with auxiliaries", "Yes, I do. No, I don't. Yes, I have. No, I haven't.")
        ),
        listOf(
            d("A", "So, how long have you been living in London?", "خب، چند وقته در لندن زندگی می‌کنی؟"),
            d("B", "About three years now. I moved here for work.", "حدود سه سال. برای کار اومدم."),
            d("A", "Really? What do you do?", "واقعاً؟ شغلت چیه؟"),
            d("B", "I work for a tech company. I'm a project manager.", "در یک شرکت فناوری کار می‌کنم. مدیر پروژه‌ام."),
            d("A", "That sounds interesting. Do you enjoy it?", "جالبه. دوستش داری؟"),
            d("B", "Most of the time, yes. But it can be stressful.", "بیشتر وقت‌ها بله. ولی می‌تونه پر استرس باشه."),
            d("A", "I can imagine. And where are you from originally?", "می‌تونم تصور کنم. اصالتاً اهل کجایی؟"),
            d("B", "I'm from Manchester. But I've lived in several cities.", "اهل منچسترم. ولی در چند شهر زندگی کرده‌ام."),
            d("A", "Have you? Which ones?", "واقعاً؟ کدام‌ها؟"),
            d("B", "Edinburgh, Bristol, and now London. I love moving around.", "ادینبرا، بریستول، و الان لندن. عاشق جابجایی‌ام."),
            d("A", "You must be very adaptable. Do you miss Manchester?", "باید خیلی انعطاف‌پذیر باشی. منچستر رو دلت می‌گیره؟"),
            d("B", "Sometimes. The people are friendlier there. But London has more opportunities.", "گاهی. مردم اونجا خوش‌برخوردترن. ولی لندن فرصت‌های بیشتری داره."),
            d("A", "That's true. Well, we should catch up properly sometime.", "درسته. خب، باید یک وقت مفصل خبر بگیریم."),
            d("B", "I'd like that. Let's exchange numbers.", "خیلی دوست دارم. بیا شماره‌ها رو رد و بدل کنیم.")
        ),
        listOf(
            q("How long has B lived in London?", listOf("1 year", "3 years", "5 years"), 1),
            q("Where is B from originally?", listOf("London", "Manchester", "Edinburgh"), 1),
            q("How long ___ you been living here?", listOf("do", "have", "are"), 1),
            q("___ she enjoy her job?", listOf("Do", "Does", "Is"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Catch up", "خبر گرفتن", "Let's catch up sometime.", "یک وقت خبر بگیریم."),
            IdiomExpression("Move around", "جابجا شدن", "I love moving around.", "عاشق جابجایی‌ام."),
            IdiomExpression("That's true", "درسته", "That's true.", "درسته.")
        ),
        pron = listOf(
            PronunciationTip("Auxiliary stress", "In questions we often stress the auxiliary: WHERE do you LIVE? ↘"),
            PronunciationTip("Rising intonation", "In yes/no questions, intonation rises: Do you ENjoy it? ↗")
        ),
        cult = listOf(
            CulturalNote("Small talk rules", "Safe topics: weather, travel, jobs. Avoid: salary, age, politics.")
        ),
        mis = listOf(
            CommonMistake("How long you live here?", "How long have you lived here?", "Use auxiliary 'have'."),
            CommonMistake("What you do?", "What do you do?", "Use auxiliary 'do'.")
        )
    )

    private fun f1B() = base(2, "1B Do you believe in it?", "۱B بهش اعتقاد داری؟",
        listOf(
            "Use auxiliary verbs in short responses",
            "Talk about beliefs and superstitions",
            "Use so/neither to agree"
        ),
        listOf(
            v("superstition", "خرافه", "It's an old superstition.", "یک خرافات قدیمی است."),
            v("believable", "قابل باور", "That story isn't believable.", "آن داستان باورپذیر نیست.", "adjective"),
            v("skeptical", "شک‌گرا", "I'm skeptical about it.", "من درباره‌اش شک‌گرام.", "adjective"),
            v("coincidence", "تصادف", "What a strange coincidence!", "چه تصادف عجیبی!"),
            v("psychic", "روح‌بین", "She claims to be psychic.", "او ادعا می‌کند روح‌بین است."),
            v("supernatural", "فراطبیعی", "Supernatural phenomena.", "پدیده‌های فراطبیعی.", "adjective"),
            v("ritual", "آیین", "A morning ritual.", "آیین صبحگاهی."),
            v("lucky charm", "طلسم", "He carries a lucky charm.", "او یک طلسم همراه دارد."),
            v("horoscope", "طالع‌بینی", "Do you read your horoscope?", "طالع‌بینی می‌خوانی؟"),
            v("fate", "سرنوشت", "Everything is decided by fate.", "همه چیز توسط سرنوشت تعیین می‌شود.")
        ),
        listOf(
            GrammarSection("So / Neither for agreement", "So do I. So am I. So have I. Neither do I. Neither am I."),
            GrammarSection("Auxiliary verbs in responses", "I do believe. I don't believe. You are, aren't you?"),
            GrammarSection("Question tags", "You believe in ghosts, don't you? She doesn't, does she?")
        ),
        listOf(
            d("A", "Do you believe in ghosts?", "به ارواح اعتقاد داری؟"),
            d("B", "No, I don't. I'm quite skeptical about the supernatural.", "نه، ندارم. درباره فراطبیعی شک‌گرام."),
            d("A", "Really? My sister does. She says she's seen one.", "واقعاً؟ خواهرم داره. می‌گه یکی رو دیده."),
            d("B", "Has she? What happened?", "واقعاً؟ چی شد؟"),
            d("A", "She was staying in an old house. In the middle of the night, she felt someone touch her shoulder.", "در یک خانه قدیمی می‌ماند. نصف شب، حس کرد کسی شانه‌اش رو لمس کرد."),
            d("B", "That would scare me to death. But I still don't believe it.", "این منو از ترس می‌کشت. ولی هنوز باور نمی‌کنم."),
            d("A", "What about superstitions? Do you walk under ladders?", "خرافات چطور؟ زیر نردبان راه می‌روی؟"),
            d("B", "No, I don't. And I always avoid black cats at night.", "نه. و همیشه شب‌ها از گربه سیاه دوری می‌کنم."),
            d("A", "So do I! I also carry a lucky coin.", "من هم! یک سکه شانس هم همراه دارم."),
            d("B", "Do you really? I thought you were skeptical.", "واقعاً؟ فکر می‌کردم شک‌گرایی."),
            d("A", "I am about ghosts, but not about luck. Nobody's completely logical.", "درباره ارواح شک‌گرام، ولی نه درباره شانس. هیچ‌کس کاملاً منطقی نیست."),
            d("B", "That's true. I have a horoscope app, but I don't believe it.", "درسته. یک اپ طالع‌بینی دارم، ولی باورش ندارم."),
            d("A", "Neither do I. But I read mine every morning anyway.", "من هم. ولی هر صبح مال خودم رو می‌خونم."),
            d("B", "You're a funny person!", "آدم بامزه‌ای هستی!")
        ),
        listOf(
            q("Does B believe in ghosts?", listOf("yes", "no", "sometimes"), 1),
            q("What does A carry for luck?", listOf("a ring", "a coin", "a photo"), 1),
            q("I don't believe. ___ do I.", listOf("So", "Neither", "Either"), 1),
            q("You believe in ghosts, ___ you?", listOf("do", "don't", "are"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Scare me to death", "از ترس مردن", "That would scare me to death.", "این منو از ترس می‌کشت."),
            IdiomExpression("So do I", "من هم", "So do I!", "من هم!"),
            IdiomExpression("Neither do I", "من هم (منفی)", "Neither do I.", "من هم.")
        ),
        pron = listOf(
            PronunciationTip("Question tags", "Rising for real questions, falling for agreement: You're Italian, AREN'T you? ↘")
        ),
        cult = listOf(
            CulturalNote("Superstitions", "In the UK, black cats are lucky; in the US, they're unlucky. Friday the 13th is unlucky in both.")
        ),
        mis = listOf(
            CommonMistake("So I do.", "So do I.", "Auxiliary before subject."),
            CommonMistake("Neither I do.", "Neither do I.", "Auxiliary before subject.")
        )
    )

    private fun f1C() = base(3, "1C The story behind the photo", "۱C داستان پشت عکس",
        listOf(
            "Use narrative tenses",
            "Describe past events and background",
            "Set the scene in a story"
        ),
        listOf(
            v("background", "پیش‌زمینه", "The background of the photo.", "پیش‌زمینه عکس."),
            v("capture", "ثبت کردن", "The photo captures a moment.", "عکس یک لحظه را ثبت می‌کند.", "verb"),
            v("memorable", "به‌یادماندنی", "A memorable moment.", "لحظه‌ای به‌یادماندنی.", "adjective"),
            v("occasion", "مناسبت", "A special occasion.", "مناسبت خاصی."),
            v("celebrate", "جشن گرفتن", "We were celebrating her birthday.", "تولدش را جشن می‌گرفتیم.", "verb"),
            v("suddenly", "ناگهان", "Suddenly, everything changed.", "ناگهان همه چیز تغییر کرد.", "adverb"),
            v("meanwhile", "در همین حال", "Meanwhile, I was preparing dinner.", "در همین حال، داشتم شام آماده می‌کردم.", "adverb"),
            v("atmosphere", "جو", "A relaxed atmosphere.", "جوی آرام."),
            v("nostalgic", "نوستالژیک", "A nostalgic feeling.", "احساس نوستالژیک.", "adjective"),
            v("look back", "به عقب نگاه کردن", "Looking back, it was a great day.", "به عقب نگاه می‌کنم، روز عالی بود.", "verb")
        ),
        listOf(
            GrammarSection("Narrative tenses", "Past simple for main events. Past continuous for background actions. Past perfect for earlier events."),
            GrammarSection("Time linkers", "while, when, as soon as, meanwhile, at first, in the end, eventually."),
            GrammarSection("Setting the scene", "It was a beautiful day. We were celebrating... The sun was shining...")
        ),
        listOf(
            d("A", "Who's in this photo?", "این عکس مال کیه؟"),
            d("B", "That's my family. It was taken at my grandmother's 80th birthday.", "خانواده منه. در ۸۰ سالگی مادربزرگم گرفته شده."),
            d("A", "It looks like a lovely occasion. Where was it?", "مناسبت قشنگی به نظر می‌رسد. کجا بود؟"),
            d("B", "At a restaurant in Tuscany. We had rented the whole place.", "در یک رستوران در توسکانی. کل جا رو اجاره کرده بودیم."),
            d("A", "Wow. Who organized it?", "واو. کی سازماندهی کرد؟"),
            d("B", "My aunt. She had been planning it for months.", "خاله‌ام. ماه‌ها برنامه‌ریزی کرده بود."),
            d("A", "What were people doing in the photo?", "مردم در عکس چه کار می‌کردند؟"),
            d("B", "Everyone was laughing. My cousin had just told a joke.", "همه می‌خندیدند. پسرخاله‌ام تازه یک جوک گفته بود."),
            d("A", "It really captures the mood. Was the food good?", "واقعاً حال و هوا رو ثبت کرده. غذا خوب بود؟"),
            d("B", "Amazing. While we were eating, a musician played the piano.", "عالی. وقتی غذا می‌خوردیم، یک نوازنده پیانو می‌نواخت."),
            d("A", "That sounds magical. Do you see your grandmother often?", "جادویی به نظر می‌رسد. مادربزرگت رو زیاد می‌بینی؟"),
            d("B", "Not as often as I'd like. She lives in Italy and I live in London.", "نه به اندازه‌ای که دوست دارم. او در ایتالیا و من در لندن."),
            d("A", "Looking back, what do you remember most?", "به عقب نگاه می‌کنی، بیشتر چی یادت میاد؟"),
            d("B", "The warmth. Not just the weather — the atmosphere. Everyone felt loved.", "گرما. نه فقط هوا — جو. همه احساس می‌کردند دوست‌داشتنی هستند.")
        ),
        listOf(
            q("Whose birthday was it?", listOf("grandmother's 80th", "aunt's 50th", "mother's 70th"), 0),
            q("Where was the party?", listOf("Rome", "Tuscany", "Milan"), 1),
            q("While we ___ eating, a musician played.", listOf("was", "were", "are"), 1),
            q("She had been ___ it for months.", listOf("plan", "planning", "planned"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Look back", "به عقب نگاه کردن", "Looking back, it was wonderful.", "به عقب که نگاه می‌کنم، فوق‌العاده بود."),
            IdiomExpression("Capture the mood", "حال و هوا را ثبت کردن", "It captures the mood.", "حال و هوا رو ثبت کرده.")
        ),
        pron = listOf(
            PronunciationTip("Narrative intonation", "In storytelling, we use a mix of rises and falls to keep listeners engaged.")
        ),
        cult = listOf(
            CulturalNote("Family celebrations", "In Italy, family gatherings often last for hours. In the UK, they're usually shorter.")
        ),
        mis = listOf(
            CommonMistake("While we ate, a musician was played.", "While we were eating, a musician played.", "Continuous for background, simple for interrupting event."),
            CommonMistake("She had planned for months before.", "She had been planning it for months.", "Past perfect continuous for duration before another past event.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 1 ═══════════

    private fun pe1() = base(4, "PE1 Meeting the parents", "انگلیسی کاربردی ۱ — ملاقات والدین",
        listOf(
            "Make polite small talk",
            "Use formal and informal language appropriately",
            "Show respect and interest"
        ),
        listOf(
            v("pleased", "خوشحال", "Pleased to meet you.", "از آشنایی خوشحالم.", "adjective"),
            v("colleague", "همکار", "She's my colleague.", "او همکارمه."),
            v("challenging", "چالش‌برانگیز", "A challenging job.", "شغل چالش‌برانگیز.", "adjective"),
            v("rewarding", "رضایت‌بخش", "A rewarding career.", "حرفه رضایت‌بخش.", "adjective"),
            v("charming", "دلربا", "A charming home.", "خانه دلربا.", "adjective"),
            v("hospitality", "مهمان‌نوازی", "Thank you for your hospitality.", "ممنون از مهمان‌نوازی‌تان."),
            v("compliment", "تعریف", "Give a compliment.", "تعریف کن."),
            v("genuine", "صادقانه", "Genuine interest.", "علاقه صادقانه.", "adjective"),
            v("well-mannered", "خوش‌رفتار", "A well-mannered young man.", "جوانی خوش‌رفتار.", "adjective"),
            v("at ease", "راحت", "He made me feel at ease.", "او باعث شد احساس راحتی کنم.", "phrase")
        ),
        listOf(
            GrammarSection("Formal vs informal language", "Formal: Pleased to meet you. How do you do? Informal: Hi, nice to meet you."),
            GrammarSection("Polite offers and responses", "Can I get you...? Would you like...? That would be lovely, thank you."),
            GrammarSection("Compliments", "What a lovely home! That's a beautiful dress. You have a wonderful garden.")
        ),
        listOf(
            d("A", "Mum, this is my colleague Tom.", "مامان، این همکارم تامه."),
            d("B", "Pleased to meet you, Tom. Sarah has told me a lot about you.", "از آشنایی خوشحالم تام. سارا خیلی ازت گفته."),
            d("C", "All good things, I hope, Mrs. Smith.", "امیدوارم همه چیز خوب، خانم اسمیت."),
            d("B", "Please, call me Helen. Can I get you something to drink?", "لطفاً منو هلن صدا کن. چیزی برای نوشیدن بیارم؟"),
            d("C", "A cup of tea would be lovely, thank you.", "یک فنجان چای عالی می‌شه، ممنون."),
            d("B", "So, how long have you worked with Sarah?", "خب، چند وقته با سارا کار می‌کنی؟"),
            d("C", "About two years now. She's a wonderful colleague.", "حدود دو سال. همکار فوق‌العاده‌ایه."),
            d("B", "That's lovely to hear. What exactly do you do?", "خوبه که می‌شنوم. دقیقاً چیکار می‌کنی؟"),
            d("C", "I'm a structural engineer. I design bridges and tunnels.", "مهندس عمرانم. پل و تونل طراحی می‌کنم."),
            d("B", "How interesting! That must be very challenging.", "چقدر جالب! باید خیلی چالش‌برانگیز باشه."),
            d("C", "It is. But I find it very rewarding.", "هست. ولی خیلی رضایت‌بخشه."),
            d("B", "I can imagine. And this is a charming house, by the way.", "می‌تونم تصور کنم. و این خانه دلرباییه، راستی."),
            d("B", "Oh, thank you! We've lived here for thirty years.", "اوه، ممنون! سی سال اینجا زندگی می‌کنیم."),
            d("C", "It shows. There's a lovely atmosphere.", "معلومه. جو دلپذیری داره."),
            d("B", "You're very kind. Please, make yourself at home.", "خیلی مهربانی. لطفاً راحت باش."),
            d("C", "Thank you for your hospitality, Helen.", "ممنون از مهمان‌نوازی‌ات هلن.")
        ),
        listOf(
            q("Who is Tom?", listOf("Sarah's brother", "Sarah's colleague", "Sarah's boss"), 1),
            q("What does Tom do?", listOf("teacher", "engineer", "doctor"), 1),
            q("Pleased to ___ you.", listOf("meet", "meeting", "met"), 0),
            q("How long ___ you worked there?", listOf("do", "have", "are"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Make yourself at home", "راحت باش", "Please, make yourself at home.", "لطفاً راحت باش."),
            IdiomExpression("By the way", "راستی", "By the way, this is lovely.", "راستی، این قشنگه."),
            IdiomExpression("All good things", "همه چیز خوب", "All good things, I hope.", "امیدوارم همه چیز خوب.")
        ),
        pron = listOf(
            PronunciationTip("Formal politeness", "In formal speech, keep a steady, warm tone: PLEASED to MEET you.")
        ),
        cult = listOf(
            CulturalNote("Meeting parents", "In the UK and US, a small gift (flowers, wine, chocolate) is polite when meeting a partner's parents.")
        ),
        mis = listOf(
            CommonMistake("Pleased to meeting you.", "Pleased to meet you.", "Use base verb after 'to'."),
            CommonMistake("Call to me Helen.", "Call me Helen.", "No 'to' with 'call'.")
        )
    )

    // ═══════════ REVIEW 1 ═══════════

    private fun rc12() = base(5, "R&C 1&2", "مرور ۱ و ۲",
        listOf("Review question formation", "Review narrative tenses", "Review small talk"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("summarize", "خلاصه کردن", "Summarize the main points.", "نکات اصلی را خلاصه کن.", "verb"),
            v("improve", "بهبود دادن", "Improve your pronunciation.", "تلفظت را بهبود بده.", "verb"),
            v("accuracy", "دقت", "Focus on accuracy.", "روی دقت تمرکز کن."),
            v("fluency", "روانی", "Work on fluency.", "روی روانی کار کن."),
            v("confident", "با اعتماد به نفس", "Feel more confident.", "با اعتماد به نفس‌تر باش.", "adjective")
        ),
        listOf(
            GrammarSection("Question formation review", "Auxiliary + subject + verb. Question tags. Short answers."),
            GrammarSection("Narrative tenses review", "Past simple, past continuous, past perfect."),
            GrammarSection("Auxiliary agreement", "So do I. Neither do I. So am I.")
        ),
        listOf(
            d("T", "Let's review what we've covered.", "بیایید مرور کنیم چیزهایی که پوشش دادیم."),
            d("A", "We studied question formation with auxiliaries.", "ساخت سوال با افعال کمکی رو مطالعه کردیم."),
            d("B", "And narrative tenses for telling stories.", "و زمان‌های روایی برای داستان گفتن."),
            d("T", "Give me an example of each.", "برای هر کدام مثالی بزنید."),
            d("A", "Where have you been living?", "Where have you been living?"),
            d("B", "While I was walking, I saw an old friend.", "While I was walking, I saw an old friend."),
            d("T", "Excellent. What about short answers?", "عالی. پاسخ‌های کوتاه چطور؟"),
            d("A", "Do you like coffee? Yes, I do. No, I don't.", "Do you like coffee? Yes, I do. No, I don't."),
            d("T", "And with 'so' and 'neither'?", "و با 'so' و 'neither'؟"),
            d("B", "I love jazz. So do I. I don't smoke. Neither do I.", "I love jazz. So do I. I don't smoke. Neither do I."),
            d("T", "Very good. Question tags?", "خیلی خوب. سوالات تأییدی؟"),
            d("A", "You're British, aren't you?", "You're British, aren't you?"),
            d("T", "Correct. You're ready for File 3.", "درسته. برای فایل ۳ آماده‌اید."),
            d("B", "Great! Let's keep going.", "عالی! بیایید ادامه بدیم.")
        ),
        listOf(
            q("Which is a question tag?", listOf("You're British", "aren't you?", "British you"), 1),
            q("Past continuous example?", listOf("I saw", "I was walking", "I have seen"), 1),
            q("How long ___ you been living here?", listOf("do", "have", "are"), 1),
            q("You like tea, ___ you?", listOf("do", "don't", "are"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Keep going", "ادامه دادن", "Let's keep going.", "بیایید ادامه بدیم.")
        ),
        pron = listOf(
            PronunciationTip("Tag intonation", "Rising = real question. Falling = seeking agreement.")
        ),
        cult = listOf(
            CulturalNote("Review style", "Effective review alternates grammar, vocabulary, and fluency practice.")
        ),
        mis = listOf(
            CommonMistake("You're British, isn't it?", "You're British, aren't you?", "Match tag to subject.")
        )
    )

    // ═══════════ FILE 2 — Health ═══════════

    private fun f2A() = base(6, "2A Call the doctor?", "۲A به دکتر زنگ بزنم؟",
        listOf(
            "Use present perfect simple vs continuous",
            "Talk about health and symptoms",
            "Give advice about health"
        ),
        listOf(
            v("symptom", "علامت", "A common symptom of flu.", "علامت شایع آنفولانزا."),
            v("prescription", "نسخه", "The doctor wrote a prescription.", "دکتر نسخه نوشت."),
            v("painkiller", "مسکن", "Take a painkiller for the headache.", "برای سردرد مسکن بخور."),
            v("dizzy", "گیج", "I've been feeling dizzy.", "احساس سرگیجه دارم.", "adjective"),
            v("exhausted", "خیلی خسته", "I'm absolutely exhausted.", "کاملاً خسته‌ام.", "adjective"),
            v("under the weather", "ناخوش", "I'm feeling under the weather.", "احساس ناخوشی می‌کنم.", "phrase"),
            v("recover", "بهبود یافتن", "She's recovering from the flu.", "او از آنفولانزا بهبود می‌یابد.", "verb"),
            v("chronic", "مزمن", "A chronic illness.", "بیماری مزمن.", "adjective"),
            v("treatment", "درمان", "The treatment takes two weeks.", "درمان دو هفته طول می‌کشد."),
            v("check-up", "معاینه", "An annual check-up.", "معاینه سالانه.")
        ),
        listOf(
            GrammarSection("Present perfect simple", "Focus on result/completion: I've broken my arm. She's taken her medicine."),
            GrammarSection("Present perfect continuous", "Focus on duration/ongoing: I've been feeling tired. She's been coughing all week."),
            GrammarSection("Contrast", "I've taken aspirin (result). I've been taking aspirin (repeated action).")
        ),
        listOf(
            d("A", "You don't look well. What's wrong?", "خوب به نظر نمی‌رسی. چی شده؟"),
            d("B", "I've been feeling terrible for days. I've had a terrible headache.", "چند روزه حالم خیلی بده. سردرد وحشتناکی دارم."),
            d("A", "Have you taken anything for it?", "چیزی براش خوردی؟"),
            d("B", "Yes, I've been taking painkillers, but they haven't helped.", "بله، مسکن می‌خورم، ولی فایده نداشته."),
            d("A", "Have you seen a doctor yet?", "دکتر رفتی؟"),
            d("B", "No, I haven't. I've been putting it off, to be honest.", "نه، نرفته‌ام. راستش، مدام به تعویق می‌اندازم."),
            d("A", "You really should. It might be something serious.", "واقعاً باید بروی. ممکنه چیز جدی باشه."),
            d("B", "Do you think so? I've also been feeling dizzy.", "فکر می‌کنی؟ سرگیجه هم دارم."),
            d("A", "That settles it. I'm taking you to the doctor right now.", "این قطعی‌اش کرد. همین الان می‌برمت دکتر."),
            d("B", "Alright, alright. But I've been to the doctor three times this year already.", "باشه، باشه. ولی امسال سه بار دکتر رفته‌ام."),
            d("A", "That doesn't matter. Your health comes first.", "مهم نیست. سلامتی‌ات اولویت داره."),
            d("B", "You're right. I've been ignoring it for too long.", "حق با توست. خیلی وقته نادیده‌اش می‌گیرم."),
            d("A", "Let's go. And I've already called a taxi.", "بریم. و قبلاً تاکسی صدا زده‌ام."),
            d("B", "Thanks. You've always been a good friend.", "ممنون. تو همیشه دوست خوبی بوده‌ای.")
        ),
        listOf(
            q("What's B's symptom?", listOf("headache and dizziness", "stomachache", "back pain"), 0),
            q("Has B seen a doctor?", listOf("yes", "no", "not recently"), 1),
            q("I've ___ feeling tired.", listOf("be", "been", "being"), 1),
            q("She's ___ taking painkillers.", listOf("be", "been", "being"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Under the weather", "ناخوش", "I'm feeling under the weather.", "احساس ناخوشی می‌کنم."),
            IdiomExpression("Put off", "به تعویق انداختن", "I've been putting it off.", "مدام به تعویق می‌اندازم."),
            IdiomExpression("That settles it", "این قطعی‌اش کرد", "That settles it.", "این قطعی‌اش کرد.")
        ),
        pron = listOf(
            PronunciationTip("Present perfect", "Contractions: I've /aɪv/, she's /ʃiːz/, they've /ðeɪv/.")
        ),
        cult = listOf(
            CulturalNote("Healthcare", "In the UK, NHS provides free healthcare. In the US, health insurance is essential.")
        ),
        mis = listOf(
            CommonMistake("I've been feel tired.", "I've been feeling tired.", "Use -ing after 'been'."),
            CommonMistake("I've taken painkillers since two days.", "I've been taking painkillers for two days.", "For + duration, continuous for repeated action.")
        )
    )

    private fun f2B() = base(7, "2B Older and wiser?", "۲B بزرگ‌تر و عاقل‌تر؟",
        listOf(
            "Use adjectives as nouns",
            "Use correct adjective order",
            "Talk about age and life stages"
        ),
        listOf(
            v("elderly", "سالمند", "The elderly need care.", "سالمندان به مراقبت نیاز دارند.", "adjective"),
            v("wealthy", "ثروتمند", "The wealthy have influence.", "ثروتمندان نفوذ دارند.", "adjective"),
            v("homeless", "بی‌خانمان", "Help the homeless.", "به بی‌خانمان‌ها کمک کن.", "adjective"),
            v("middle-aged", "میان‌سال", "Middle-aged people.", "افراد میان‌سال.", "adjective"),
            v("retired", "بازنشسته", "A retired teacher.", "معلم بازنشسته.", "adjective"),
            v("generation", "نسل", "A new generation.", "نسل جدید."),
            v("wisdom", "خرد", "Wisdom comes with age.", "خرد با سن می‌آید."),
            v("responsibility", "مسئولیت", "Family responsibilities.", "مسئولیت‌های خانوادگی."),
            v("respect", "احترام", "Respect your elders.", "به بزرگ‌ترها احترام بگذار.", "verb"),
            v("independent", "مستقل", "Live independently.", "مستقل زندگی کن.", "adjective")
        ),
        listOf(
            GrammarSection("Adjectives as nouns", "The rich, the poor, the elderly, the young, the homeless. Plural verb."),
            GrammarSection("Adjective order", "Opinion → Size → Age → Shape → Color → Origin → Material. A beautiful old Italian leather bag."),
            GrammarSection("Comparative with age", "The older I get, the wiser I become.")
        ),
        listOf(
            d("A", "Do you think the young respect the elderly today?", "فکر می‌کنی جوانان امروز به سالمندان احترام می‌گذارند؟"),
            d("B", "Not always. Society has changed a lot.", "نه همیشه. جامعه خیلی تغییر کرده."),
            d("A", "In my country, three generations often live together.", "در کشور من، سه نسل اغلب با هم زندگی می‌کنند."),
            d("B", "That's becoming rare here. The elderly often live alone.", "اینجا داره نادر می‌شه. سالمندان اغلب تنها زندگی می‌کنند."),
            d("A", "That's sad. But I suppose the young want independence.", "غمگین‌کننده‌ست. ولی فکر می‌کنم جوانان استقلال می‌خواهند."),
            d("B", "Exactly. And the elderly don't want to be a burden.", "دقیقاً. و سالمندان نمی‌خواهند سربار باشند."),
            d("A", "Do you think wisdom comes with age?", "فکر می‌کنی خرد با سن می‌آید؟"),
            d("B", "I think so. The older I get, the more patient I become.", "فکر می‌کنم. هرچی بزرگ‌تر می‌شم، صبورتر می‌شم."),
            d("A", "That's a nice way to look at it. I'm learning to be more patient too.", "نگاه قشنگیه. من هم دارم یاد می‌گیرم صبورتر باشم."),
            d("B", "It takes practice. My grandmother taught me that.", "تمرین لازم داره. مادربزرگم این رو یادم داد."),
            d("A", "She sounds like a wise woman.", "به نظر زن عاقلی میاد."),
            d("B", "She is. She always says: 'Listen more, speak less.'", "هست. همیشه می‌گه: 'بیشتر گوش کن، کمتر حرف بزن.'"),
            d("A", "Beautiful advice. I should follow it.", "توصیه زیبایی. باید دنبالش کنم."),
            d("B", "So should I.", "من هم.")
        ),
        listOf(
            q("In A's country, how many generations live together?", listOf("two", "three", "four"), 1),
            q("What did B's grandmother teach?", listOf("cooking", "patience", "music"), 1),
            q("The rich ___ more influence.", listOf("have", "has", "having"), 0),
            q("A beautiful old ___ table.", listOf("wooden", "wooden old", "old wooden"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Come with age", "با سن آمدن", "Wisdom comes with age.", "خرد با سن می‌آید."),
            IdiomExpression("Be a burden", "سربار بودن", "I don't want to be a burden.", "نمی‌خواهم سربار باشم.")
        ),
        pron = listOf(
            PronunciationTip("Adjective order", "Opinion, Size, Age, Shape, Color, Origin, Material (OPSHACOM).")
        ),
        cult = listOf(
            CulturalNote("Elderly care", "In many Asian and Latin cultures, elderly parents live with family. In the West, nursing homes are common.")
        ),
        mis = listOf(
            CommonMistake("The rich pays taxes.", "The rich pay taxes.", "Adjectives as nouns take plural verb."),
            CommonMistake("An old beautiful table.", "A beautiful old table.", "Opinion before age.")
        )
    )

    private fun f2C() = base(8, "2C The truth about air travel", "۲C حقیقت درباره سفر هوایی",
        listOf(
            "Use past perfect continuous",
            "Talk about travel experiences",
            "Use narrative linkers"
        ),
        listOf(
            v("delay", "تأخیر", "A four-hour delay.", "چهار ساعت تأخیر."),
            v("connection", "اتصال", "I missed my connection.", "پرواز اتصالم را از دست دادم."),
            v("boarding", "سوار شدن", "Boarding starts at 6.", "سوار شدن ساعت ۶ شروع می‌شود."),
            v("turbulence", "تلاطم", "Severe turbulence.", "تلاطم شدید."),
            v("cabin", "کابین", "The cabin crew.", "خدمه کابین."),
            v("runway", "باند", "The plane waited on the runway.", "هواپیما روی باند منتظر ماند."),
            v("jet lag", "خستگی پرواز", "I have terrible jet lag.", "خستگی پرواز وحشتناکی دارم."),
            v("checked", "چک‌شده", "Checked luggage.", "چمدان چک‌شده.", "adjective"),
            v("overhead", "بالای سر", "Overhead compartment.", "محفظه بالای سر.", "adjective"),
            v("aisle", "راهرو", "An aisle seat.", "صندلی کنار راهرو.")
        ),
        listOf(
            GrammarSection("Past perfect continuous", "I had been waiting for hours when they announced the delay."),
            GrammarSection("Past perfect vs past perfect continuous", "I had waited (completed) vs I had been waiting (duration)."),
            GrammarSection("Narrative linkers", "by the time, as soon as, when, while, after, before.")
        ),
        listOf(
            d("A", "How was your flight to Tokyo?", "پروازت به توکیو چطور بود؟"),
            d("B", "Honestly, terrible. I had been waiting at the airport for six hours.", "راستش، افتضاح. شش ساعت در فرودگاه منتظر بودم."),
            d("A", "Six hours? What happened?", "شش ساعت؟ چی شد؟"),
            d("B", "There was a technical issue. By the time they fixed it, I'd missed my connection.", "مشکل فنی بود. تا درستش کردند، اتصالم رو از دست داده بودم."),
            d("A", "So what did you do?", "پس چیکار کردی؟"),
            d("B", "I had to take a later flight. I finally arrived at midnight.", "مجبور شدم پرواز بعدی بگیرم. در نهایت نصف شب رسیدم."),
            d("A", "That sounds exhausting. Was the flight itself OK?", "خسته‌کننده به نظر می‌رسد. خود پرواز خوب بود؟"),
            d("B", "Not really. We had been flying for two hours when we hit severe turbulence.", "نه زیاد. دو ساعت پرواز کرده بودیم که تلاطم شدید گرفتیم."),
            d("A", "Oh no. Were you scared?", "اوه نه. ترسیدی؟"),
            d("B", "A little. The cabin crew had been trying to calm everyone down.", "کمی. خدمه سعی می‌کردند همه را آرام کنند."),
            d("A", "Did you sleep at all?", "اصلاً خوابیدی؟"),
            d("B", "Not much. I had been hoping to rest, but it was impossible.", "زیاد نه. امیدوار بودم استراحت کنم، ولی غیرممکن بود."),
            d("A", "You must be exhausted now.", "الان باید خیلی خسته باشی."),
            d("B", "I am. I've been trying to adjust my body clock.", "هستم. دارم سعی می‌کنم ساعت بدنم رو تنظیم کنم."),
            d("A", "Well, you're here now. Welcome to Tokyo!", "خب، الان اینجایی. به توکیو خوش آمدی!"),
            d("B", "Thanks. I'm just glad to be on solid ground.", "ممنون. فقط خوشحالم روی زمین محکم هستم.")
        ),
        listOf(
            q("How long did B wait at the airport?", listOf("2 hours", "4 hours", "6 hours"), 2),
            q("Why was the flight delayed?", listOf("weather", "technical issue", "crew"), 1),
            q("I had been ___ for hours.", listOf("wait", "waiting", "waited"), 1),
            q("By the time they fixed it, I ___ missed my connection.", listOf("have", "had", "was"), 1)
        ),
        idioms = listOf(
            IdiomExpression("On solid ground", "روی زمین محکم", "Glad to be on solid ground.", "خوشحالم روی زمین محکم هستم."),
            IdiomExpression("Jet lag", "خستگی پرواز", "I have terrible jet lag.", "خستگی پرواز وحشتناکی دارم.")
        ),
        pron = listOf(
            PronunciationTip("Past perfect continuous", "Stress 'been': I had BEEN WAITing.")
        ),
        cult = listOf(
            CulturalNote("Flight compensation", "In the EU, passengers can claim compensation for delays over 3 hours.")
        ),
        mis = listOf(
            CommonMistake("I had been wait for six hours.", "I had been waiting for six hours.", "Add -ing."),
            CommonMistake("By the time they fixed it, I missed my connection.", "By the time they fixed it, I had missed my connection.", "Past perfect for earlier action.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 2 ═══════════

    private fun pe2() = base(9, "PE2 A difficult celebrity", "انگلیسی کاربردی ۲ — یک سلبریتی دشوار",
        listOf(
            "Make polite and indirect requests",
            "Express annoyance politely",
            "Handle customer service situations"
        ),
        listOf(
            v("demanding", "سختگیر", "A demanding customer.", "مشتری سختگیر.", "adjective"),
            v("request", "درخواست", "A polite request.", "درخواست مؤدبانه."),
            v("annoying", "آزاردهنده", "Very annoying behaviour.", "رفتار خیلی آزاردهنده.", "adjective"),
            v("reasonable", "منطقی", "A reasonable request.", "درخواست منطقی.", "adjective"),
            v("manager", "مدیر", "Ask for the manager.", "مدیر را خبر کن."),
            v("complaint", "شکایت", "Make a complaint.", "شکایت کن."),
            v("apologize", "عذر خواهی کردن", "I apologize sincerely.", "صمیمانه عذرخواهی می‌کنم.", "verb"),
            v("sort out", "حل کردن", "We'll sort it out.", "حلش می‌کنیم.", "verb"),
            v("come across", "برخورد کردن", "He came across as rude.", "او بی‌ادب به نظر می‌رسید.", "verb"),
            v("maintain", "حفظ کردن", "Maintain your composure.", "آرامشت را حفظ کن.", "verb")
        ),
        listOf(
            GrammarSection("Indirect questions", "Could you tell me where...? Do you know if...? I wonder if..."),
            GrammarSection("Polite requests", "Would you mind + -ing? Could you possibly...? I'd appreciate it if..."),
            GrammarSection("Softening complaints", "I'm afraid there's a problem. I'm not entirely happy with...")
        ),
        listOf(
            d("A", "Excuse me. Could you tell me where the changing rooms are?", "ببخشید. می‌تونید بگید اتاق‌های تعویض کجاست؟"),
            d("B", "Of course, madam. They're just around the corner on your left.", "البته خانم. همین دور پیچ سمت چپ."),
            d("A", "Thank you. And I wonder if you could bring me some water?", "ممنون. و نمی‌دانم می‌تونید کمی آب بیارید؟"),
            d("B", "Certainly. Still or sparkling?", "قطعاً. بدون گاز یا گازدار؟"),
            d("A", "Sparkling, please. And could you possibly turn up the air conditioning?", "گازدار لطفاً. و می‌تونید کولر رو زیاد کنید؟"),
            d("B", "I'm afraid it's already at maximum, madam.", "متأسفانه در حال حاضر روی حداکثر است خانم."),
            d("A", "That's very annoying. I'm a celebrity, you know.", "این خیلی آزاردهنده‌ست. من سلبریتی هستم، می‌دانی."),
            d("B", "I understand completely. Would you like me to get the manager?", "کاملاً می‌فهمم. می‌خواهید مدیر را خبر کنم؟"),
            d("A", "Yes, please. And while you're at it, could you tell him the service has been slow?", "بله لطفاً. و در همین حین، می‌تونید بهش بگید خدمات کند بوده؟"),
            d("B", "Of course. I do apologize for any inconvenience.", "البته. برای هرگونه ناراحتی عذرخواهی می‌کنم."),
            d("A", "It's not your fault. I just expect better.", "تقصیر تو نیست. فقط انتظار بهتری دارم."),
            d("B", "I appreciate your understanding. I'll fetch the manager immediately.", "قدردان درکت هستم. فوراً مدیر را می‌آورم."),
            d("A", "Thank you. And please, bring the water first.", "ممنون. و لطفاً اول آب را بیاور."),
            d("B", "Right away, madam.", "همین حالا، خانم."),
            d("A", "Good. Maybe this place isn't so bad after all.", "خوبه. شاید اینجا اونقدرها هم بد نیست."),
            d("B", "We do our best, madam.", "ما نهایت تلاشمان را می‌کنیم خانم.")
        ),
        listOf(
            q("What does A want first?", listOf("food", "water", "coffee"), 1),
            q("What's wrong with the AC?", listOf("broken", "at maximum", "off"), 1),
            q("Could you ___ me where the room is?", listOf("tell", "say", "speak"), 0),
            q("Would you mind ___ the door?", listOf("close", "closing", "to close"), 1)
        ),
        idioms = listOf(
            IdiomExpression("While you're at it", "در همین حین", "While you're at it, could you...", "در همین حین، می‌تونید..."),
            IdiomExpression("After all", "بعد از همه چیز", "Maybe it's not so bad after all.", "شاید بعد از همه چیز اونقدر بد نیست."),
            IdiomExpression("Do our best", "نهایت تلاش را کردن", "We do our best.", "نهایت تلاشمان را می‌کنیم.")
        ),
        pron = listOf(
            PronunciationTip("Polite requests", "Rising intonation: Could you POSsibly... ↗")
        ),
        cult = listOf(
            CulturalNote("Customer service", "In the US, 'the customer is always right' is a common motto. In the UK, service is usually more reserved.")
        ),
        mis = listOf(
            CommonMistake("Could you tell me where is the room?", "Could you tell me where the room is?", "Indirect: subject before verb."),
            CommonMistake("Would you mind to close the door?", "Would you mind closing the door?", "Would you mind + -ing.")
        )
    )

    // ═══════════ REVIEW 2 ═══════════

    private fun rc34() = base(10, "R&C 3&4", "مرور ۳ و ۴",
        listOf("Review present perfect", "Review adjectives as nouns", "Review indirect questions"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("summarize", "خلاصه کردن", "Summarize the chapter.", "فصل را خلاصه کن.", "verb"),
            v("improve", "بهبود دادن", "Improve your writing.", "نوشتنت را بهبود بده.", "verb"),
            v("vocabulary", "واژگان", "Expand your vocabulary.", "واژگانت را گسترش بده."),
            v("grammar", "گرامر", "Practice grammar.", "گرامر تمرین کن."),
            v("progress", "پیشرفت", "Make progress.", "پیشرفت کن.")
        ),
        listOf(
            GrammarSection("Present perfect simple/continuous", "I've broken. I've been feeling."),
            GrammarSection("Adjectives as nouns", "The rich, the poor, the elderly."),
            GrammarSection("Indirect questions", "Could you tell me where...?")
        ),
        listOf(
            d("T", "Let's review Files 3 and 4.", "بیایید فایل‌های ۳ و ۴ را مرور کنیم."),
            d("A", "We learned present perfect simple and continuous.", "حال کامل ساده و استمراری یاد گرفتیم."),
            d("B", "And the difference: result vs duration.", "و تفاوت: نتیجه در برابر مدت."),
            d("T", "Example?", "مثال؟"),
            d("A", "I've broken my leg. That's the result. I've been limping for weeks. That's duration.", "I've broken my leg. این نتیجه. I've been limping for weeks. این مدت."),
            d("T", "Excellent. Adjectives as nouns?", "عالی. صفت‌ها به عنوان اسم؟"),
            d("B", "The rich, the poor, the elderly. They take plural verbs.", "The rich، the poor، the elderly. فعل جمع می‌گیرند."),
            d("T", "Indirect questions?", "سوالات غیرمستقیم؟"),
            d("A", "Could you tell me where the station is?", "Could you tell me where the station is?"),
            d("T", "Very good. Anything else?", "خیلی خوب. چیز دیگری؟"),
            d("B", "We also learned narrative tenses with past perfect continuous.", "همچنین زمان‌های روایی با گذشته کامل استمراری یاد گرفتیم."),
            d("T", "Excellent. You're ready for File 5.", "عالی. برای فایل ۵ آماده‌اید."),
            d("A", "Great. Let's keep going.", "عالی. بیایید ادامه بدیم."),
            d("B", "I'm enjoying this course.", "دارم از این دوره لذت می‌برم.")
        ),
        listOf(
            q("Present perfect continuous example?", listOf("I've broken", "I've been limping", "I limped"), 1),
            q("The rich ___ a lot of power.", listOf("has", "have", "having"), 1),
            q("Could you tell me where the room ___?", listOf("is", "are", "be"), 0),
            q("I've ___ feeling tired.", listOf("be", "been", "being"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Keep going", "ادامه دادن", "Let's keep going.", "بیایید ادامه بدیم.")
        ),
        pron = listOf(
            PronunciationTip("Review intonation", "Keep questions rising, statements falling.")
        ),
        cult = listOf(
            CulturalNote("Progress", "Consistency beats intensity in language learning.")
        ),
        mis = listOf(
            CommonMistake("The rich pays.", "The rich pay.", "Plural verb."),
            CommonMistake("Could you tell me where is the station?", "Could you tell me where the station is?", "Indirect question word order.")
        )
    )

    // ═══════════ FILE 3 — Tales and stories ═══════════

    private fun f3A() = base(11, "3A The story of the Titanic", "۳A داستان تایتانیک",
        listOf(
            "Use narrative tenses in storytelling",
            "Use past perfect for background events",
            "Order past events chronologically"
        ),
        listOf(
            v("voyage", "سفر دریایی", "The maiden voyage.", "اولین سفر دریایی."),
            v("sink", "غرق شدن", "The ship sank in 1912.", "کشتی در ۱۹۱۲ غرق شد.", "verb"),
            v("iceberg", "کوه یخ", "It hit an iceberg.", "به کوه یخ برخورد کرد."),
            v("survivor", "بازمانده", "Only 700 survivors.", "فقط ۷۰۰ بازمانده."),
            v("tragedy", "فاجعه", "A terrible tragedy.", "فاجعه وحشتناکی."),
            v("luxurious", "لوکس", "A luxurious ship.", "کشتی لوکس.", "adjective"),
            v("crew", "خدمه", "The crew warned passengers.", "خدمه به مسافران هشدار دادند."),
            v("warn", "هشدار دادن", "They had warned about ice.", "درباره یخ هشدار داده بودند.", "verb"),
            v("ignore", "نادیده گرفتن", "They ignored the warnings.", "هشدارها را نادیده گرفتند.", "verb"),
            v("sail", "حرکت کردن با کشتی", "The ship sailed from Southampton.", "کشتی از ساوتهمپتون حرکت کرد.", "verb")
        ),
        listOf(
            GrammarSection("Narrative tenses", "Past simple for main events. Past continuous for background. Past perfect for earlier events."),
            GrammarSection("Sequencing", "First, then, after that, by the time, meanwhile, eventually, in the end."),
            GrammarSection("Past perfect in narratives", "By the time help arrived, the ship had already sunk.")
        ),
        listOf(
            d("A", "Have you ever read about the Titanic?", "تا حالا درباره تایتانیک خوانده‌ای؟"),
            d("B", "Of course. It's one of the most famous maritime disasters.", "البته. یکی از معروف‌ترین فاجعه‌های دریایی است."),
            d("A", "Do you remember the details?", "جزئیاتش یادت هست؟"),
            d("B", "Roughly. It set sail from Southampton in April 1912.", "تقریباً. در آوریل ۱۹۱۲ از ساوتهمپتون حرکت کرد."),
            d("A", "Was it the biggest ship at the time?", "بزرگ‌ترین کشتی آن زمان بود؟"),
            d("B", "Yes. Everyone believed it was unsinkable.", "بله. همه باور داشتند غرق‌نشدنی است."),
            d("A", "What happened next?", "بعد چه شد؟"),
            d("B", "The crew had been warned about icebergs, but they ignored the warnings.", "به خدمه درباره کوه‌های یخ هشدار داده بودند، ولی هشدارها را نادیده گرفتند."),
            d("A", "That's terrible. When did it hit the iceberg?", "این وحشتناکه. کی به کوه یخ برخورد؟"),
            d("B", "Late at night on April 14th. While passengers were sleeping, the ship struck the iceberg.", "اواخر شب ۱۴ آوریل. در حالی که مسافران خواب بودند، کشتی به کوه یخ خورد."),
            d("A", "How long did it take to sink?", "چقدر طول کشید غرق شود؟"),
            d("B", "Less than three hours. By the time help arrived, the ship had already sunk.", "کمتر از سه ساعت. تا کمک رسید، کشتی قبلاً غرق شده بود."),
            d("A", "How many people died?", "چند نفر مردند؟"),
            d("B", "Over 1,500. Only about 700 survived.", "بیش از ۱۵۰۰. فقط حدود ۷۰۰ نفر جان سالم بردند."),
            d("A", "That's heartbreaking. Did it change anything?", "این دلخراشه. چیزی را تغییر داد؟"),
            d("B", "Absolutely. Safety rules changed completely. Lifeboats became mandatory.", "قطعاً. قوانین ایمنی کامل تغییر کرد. قایق‌های نجات اجباری شد.")
        ),
        listOf(
            q("When did the Titanic sail?", listOf("1910", "1912", "1915"), 1),
            q("How many people died?", listOf("700", "1000", "1500+"), 2),
            q("By the time help arrived, the ship ___ already sunk.", listOf("has", "had", "was"), 1),
            q("While passengers ___ sleeping, the ship struck the iceberg.", listOf("was", "were", "are"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Set sail", "حرکت کردن با کشتی", "It set sail from Southampton.", "از ساوتهمپتون حرکت کرد."),
            IdiomExpression("Go down in history", "در تاریخ ثبت شدن", "The Titanic went down in history.", "تایتانیک در تاریخ ثبت شد.")
        ),
        pron = listOf(
            PronunciationTip("Past perfect", "Weak forms: had /həd/ in fast speech. By the time help arrived, the ship had already sunk.")
        ),
        cult = listOf(
            CulturalNote("Maritime safety", "After the Titanic, the SOLAS (Safety of Life at Sea) convention was created in 1914.")
        ),
        mis = listOf(
            CommonMistake("By the time help arrived, the ship has already sunk.", "By the time help arrived, the ship had already sunk.", "Past perfect for the earlier past."),
            CommonMistake("They had ignored the warnings when they warned them.", "They had been warned, but they ignored the warnings.", "Different actions need clear tenses.")
        )
    )

    private fun f3B() = base(12, "3B A tale of two cities", "۳B داستان دو شهر",
        listOf(
            "Use comparatives and superlatives",
            "Compare cities and places",
            "Express preferences about places"
        ),
        listOf(
            v("crowded", "شلوغ", "A crowded city.", "شهر شلوغ.", "adjective"),
            v("peaceful", "آرام", "A peaceful village.", "روستای آرام.", "adjective"),
            v("lively", "پرجنب و جوش", "A lively atmosphere.", "جوی پرجنب و جوش.", "adjective"),
            v("atmosphere", "جو", "A unique atmosphere.", "جوی منحصربه‌فرد."),
            v("neighborhood", "محله", "A safe neighborhood.", "محله امن."),
            v("cost of living", "هزینه زندگی", "A high cost of living.", "هزینه بالای زندگی."),
            v("public transport", "حمل و نقل عمومی", "Efficient public transport.", "حمل و نقل عمومی کارآمد."),
            v("pollution", "آلودگی", "Serious pollution.", "آلودگی جدی."),
            v("nightlife", "زندگی شبانه", "Amazing nightlife.", "زندگی شبانه فوق‌العاده."),
            v("pace", "سرعت", "The pace of life.", "سرعت زندگی.")
        ),
        listOf(
            GrammarSection("Comparatives", "adjective + -er / more + adjective + than. As + adjective + as."),
            GrammarSection("Superlatives", "the + -est / the most + adjective."),
            GrammarSection("Modifying comparisons", "much bigger, slightly more expensive, far better, a bit quieter.")
        ),
        listOf(
            d("A", "Which do you prefer, London or Paris?", "کدام را ترجیح می‌دهی، لندن یا پاریس؟"),
            d("B", "Honestly, Paris. It's much more beautiful than London.", "راستش، پاریس. خیلی زیباتر از لندنه."),
            d("A", "Really? I find London more exciting, actually.", "واقعاً؟ من لندن رو هیجان‌انگیزتر می‌بینم."),
            d("B", "In what way?", "از چه نظر؟"),
            d("A", "It's more multicultural, and the nightlife is better.", "چندفرهنگی‌تره، و زندگی شبانه‌اش بهتره."),
            d("B", "That's true. But London is far more expensive.", "درسته. ولی لندن خیلی گران‌تره."),
            d("A", "Absolutely. The cost of living is one of the highest in the world.", "کاملاً. هزینه زندگی یکی از بالاترین‌ها در جهانه."),
            d("B", "And the pollution is much worse than in Paris.", "و آلودگی خیلی بدتر از پاریسه."),
            d("A", "Sadly, yes. What about public transport?", "متأسفانه بله. حمل و نقل عمومی چطور؟"),
            d("B", "London's is better, I think. The Underground is incredibly efficient.", "فکر می‌کنم مال لندن بهتره. مترو فوق‌العاده کارآمده."),
            d("A", "True. The Paris Metro is older and often crowded.", "درسته. مترو پاریس قدیمی‌تره و اغلب شلوغه."),
            d("B", "But Paris has a more relaxed pace of life.", "ولی پاریس سرعت زندگی آرام‌تری داره."),
            d("A", "Agreed. So which one is better overall?", "موافقم. پس کدام کلاً بهتره؟"),
            d("B", "I don't think there's a right answer. It depends on what you value.", "فکر نمی‌کنم جواب درستی باشد. بستگی دارد به چیزهایی که ارزش می‌گذاری."),
            d("A", "That's a fair point. Both are amazing cities.", "نکته منصفانه‌ای است. هر دو شهرهای فوق‌العاده‌ای هستند.")
        ),
        listOf(
            q("Which city does B prefer?", listOf("London", "Paris", "Neither"), 1),
            q("What is better about London?", listOf("cheaper", "more multicultural", "quieter"), 1),
            q("London is ___ than Paris.", listOf("expensive", "more expensive", "most expensive"), 1),
            q("Paris has a ___ pace of life.", listOf("more relaxed", "relaxedest", "most relaxed"), 0)
        ),
        idioms = listOf(
            IdiomExpression("A fair point", "نکته منصفانه", "That's a fair point.", "نکته منصفانه‌ای است."),
            IdiomExpression("It depends", "بستگی دارد", "It depends on what you value.", "بستگی به چیزهایی دارد که ارزش می‌گذاری.")
        ),
        pron = listOf(
            PronunciationTip("Comparatives", "Stress 'much/more': It's MUCH bigGER than. It's far MORE expensive.")
        ),
        cult = listOf(
            CulturalNote("London vs Paris", "A historic rivalry. London is more business-focused; Paris more lifestyle-focused.")
        ),
        mis = listOf(
            CommonMistake("London is more bigger.", "London is much bigger.", "No double comparative."),
            CommonMistake("Paris is more beautiful that London.", "Paris is more beautiful than London.", "Than, not that.")
        )
    )

    private fun f3C() = base(13, "3C The end of the story", "۳C پایان داستان",
        listOf(
            "Use narrative devices",
            "Tell a story with an unexpected ending",
            "Use adverbs and adverbial phrases in narratives"
        ),
        listOf(
            v("plot twist", "پیچش داستان", "A surprising plot twist.", "پیچش داستانی غافلگیرکننده."),
            v("unexpected", "غیرمنتظره", "An unexpected ending.", "پایان غیرمنتظره.", "adjective"),
            v("reveal", "فاش کردن", "The truth was finally revealed.", "حقیقت در نهایت فاش شد.", "verb"),
            v("coincidence", "تصادف", "An incredible coincidence.", "تصادف باورنکردنی."),
            v("outcome", "نتیجه", "An unexpected outcome.", "نتیجه غیرمنتظره."),
            v("eventually", "در نهایت", "Eventually, we found out.", "در نهایت فهمیدیم.", "adverb"),
            v("to my surprise", "در کمال تعجب من", "To my surprise, he agreed.", "در کمال تعجب، قبول کرد.", "phrase"),
            v("in the end", "در پایان", "In the end, everything worked out.", "در پایان، همه چیز درست شد.", "phrase"),
            v("turn out", "معلوم شدن", "It turned out to be a mistake.", "معلوم شد اشتباهی بود.", "verb"),
            v("plot", "طرح داستان", "A complex plot.", "طرح داستانی پیچیده.")
        ),
        listOf(
            GrammarSection("Narrative adverbs", "suddenly, eventually, fortunately, surprisingly, amazingly."),
            GrammarSection("Adverbial phrases", "to my surprise, in the end, as it turned out, without warning."),
            GrammarSection("Building suspense", "Little did I know... I had no idea that...")
        ),
        listOf(
            d("A", "Tell me about your strangest travel experience.", "از عجیب‌ترین تجربه سفرت بگو."),
            d("B", "Well, this happened in Rome a few years ago.", "خب، چند سال پیش در رم اتفاق افتاد."),
            d("A", "What were you doing there?", "آنجا چیکار می‌کردی؟"),
            d("B", "I was on holiday with my sister. We had booked a small hotel near the Vatican.", "با خواهرم در تعطیلات بودم. یک هتل کوچک نزدیک واتیکان رزرو کرده بودیم."),
            d("A", "Sounds nice. What went wrong?", "خوبه. چی خراب شد؟"),
            d("B", "Everything, at first. When we arrived, the hotel had no record of our booking.", "اولش همه چیز. وقتی رسیدیم، هتل هیچ سابقه‌ای از رزرو ما نداشت."),
            d("A", "Oh no. What did you do?", "اوه نه. چیکار کردید؟"),
            d("B", "We were standing in the lobby, exhausted, when a woman approached us.", "در لابی ایستاده بودیم، خسته، که یک خانم به ما نزدیک شد."),
            d("A", "Who was she?", "او کی بود؟"),
            d("B", "Amazingly, she was the owner of a small guesthouse nearby. She'd overheard our conversation.", "در کمال تعجب، صاحب یک مهمان‌خانه کوچک نزدیک بود. مکالمه‌مان را شنیده بود."),
            d("A", "That's such a coincidence!", "چه تصادفی!"),
            d("B", "It gets better. She offered us two rooms at half price. To our surprise, they were beautiful.", "بهتر هم می‌شه. دو اتاق با نصف قیمت پیشنهاد داد. در کمال تعجب، زیبا بودند."),
            d("A", "So it turned out well?", "پس خوب تموم شد؟"),
            d("B", "It did. In the end, it was the best part of the trip.", "بله. در پایان، بهترین بخش سفر بود."),
            d("A", "What a great ending!", "چه پایان عالی‌ای!"),
            d("B", "And the funny thing is, we're still in touch with her today.", "و نکته خنده‌دار اینه که هنوز با اون در تماس هستیم.")
        ),
        listOf(
            q("Where did the story happen?", listOf("Florence", "Rome", "Venice"), 1),
            q("What was the problem at the hotel?", listOf("no booking record", "no rooms", "expensive"), 0),
            q("___ my surprise, they were beautiful.", listOf("In", "To", "At"), 1),
            q("It ___ out to be the best part.", listOf("turn", "turned", "turning"), 1)
        ),
        idioms = listOf(
            IdiomExpression("To my surprise", "در کمال تعجب من", "To my surprise, he agreed.", "در کمال تعجب، قبول کرد."),
            IdiomExpression("Turn out", "معلوم شدن", "It turned out well.", "خوب از آب درآمد."),
            IdiomExpression("In the end", "در پایان", "In the end, it was great.", "در پایان، عالی بود."),
            IdiomExpression("Little did I know", "نمی‌دانستم که", "Little did I know...", "نمی‌دانستم که...")
        ),
        pron = listOf(
            PronunciationTip("Narrative adverbs", "Stress the adverb: SUDDenly, eVENtually, aMAZingly.")
        ),
        cult = listOf(
            CulturalNote("Italian hospitality", "Small guesthouses (pensioni) are common in Italy. Personal connections matter more than contracts.")
        ),
        mis = listOf(
            CommonMistake("In my surprise, it was beautiful.", "To my surprise, it was beautiful.", "Use 'to my surprise'.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 3 ═══════════

    private fun pe3() = base(14, "PE3 Old friends", "انگلیسی کاربردی ۳ — دوستان قدیمی",
        listOf(
            "Talk about memories and past habits",
            "Use used to and would",
            "Express nostalgia and change"
        ),
        listOf(
            v("used to", "قبلاً", "I used to live here.", "قبلاً اینجا زندگی می‌کردم.", "verb"),
            v("nostalgic", "نوستالژیک", "A nostalgic feeling.", "احساس نوستالژیک.", "adjective"),
            v("childhood", "کودکی", "A happy childhood.", "کودکی شاد."),
            v("memories", "خاطرات", "Childhood memories.", "خاطرات کودکی."),
            v("grow up", "بزرگ شدن", "I grew up in London.", "در لندن بزرگ شدم.", "verb"),
            v("back then", "آن زمان", "Back then, life was simpler.", "آن زمان، زندگی ساده‌تر بود."),
            v("reunion", "دیدار مجدد", "A school reunion.", "دیدار مجدد مدرسه."),
            v("catch up", "خبر گرفتن", "Catch up on old times.", "خبر قدیمی‌ها را گرفتن.", "verb"),
            v("miss", "دلتنگ شدن", "I miss those days.", "دلتنگ آن روزها می‌شوم.", "verb"),
            v("change", "تغییر", "People change over time.", "مردم با زمان تغییر می‌کنند.")
        ),
        listOf(
            GrammarSection("Used to", "Past habit: I used to play football. Negative: didn't use to."),
            GrammarSection("Would for past habits", "We would play for hours. (actions, not states)"),
            GrammarSection("Used to vs would", "Used to for both states and habits. Would only for repeated actions.")
        ),
        listOf(
            d("A", "Is that you, Tom? I can't believe it!", "تویی تام؟ باور نمی‌کنم!"),
            d("B", "Maria! Wow, how long has it been?", "ماریا! وای، چقدر گذشته؟"),
            d("A", "At least fifteen years. Since we left school.", "حداقل پانزده سال. از وقتی مدرسه را ترک کردیم."),
            d("B", "Unbelievable. You look exactly the same.", "باورنکردنی. دقیقاً همون شکلی هستی."),
            d("A", "You too! Do you remember old times?", "تو هم! روزهای قدیم یادت هست؟"),
            d("B", "Of course. We used to play football every afternoon.", "البته. هر بعدازظهر فوتبال بازی می‌کردیم."),
            d("A", "And we would stay out until dark. Our mothers were always worried.", "و تا تاریکی بیرون می‌موندیم. مادرهامون همیشه نگران بودند."),
            d("B", "Those were the days. What do you do now?", "چه روزهایی بود. الان چیکار می‌کنی؟"),
            d("A", "I'm a lawyer. And you?", "وکیلم. تو چطور؟"),
            d("B", "I'm a teacher. I teach history.", "معلمم. تاریخ درس می‌دهم."),
            d("A", "I remember you used to love history class.", "یادم هست عاشق کلاس تاریخ بودی."),
            d("B", "I still do. Some things never change.", "هنوز هم هستم. بعضی چیزها هرگز تغییر نمی‌کنند."),
            d("A", "Do you ever go back to our old neighborhood?", "هرگز به محله قدیمی‌مان برمی‌گردی؟"),
            d("B", "I did last year. Almost everything has changed.", "سال پیش رفتم. تقریباً همه چیز تغییر کرده."),
            d("A", "I know. The old park is a shopping mall now.", "می‌دانم. پارک قدیمی الان یک مرکز خرید است."),
            d("B", "That's a shame. But it's nice to see you again.", "حیف شد. ولی خوبه که دوباره می‌بینمت.")
        ),
        listOf(
            q("How long since they last met?", listOf("5 years", "10 years", "15 years"), 2),
            q("What did they use to do?", listOf("study", "play football", "swim"), 1),
            q("We ___ to play football every day.", listOf("use", "used", "using"), 1),
            q("We ___ stay out until dark.", listOf("would", "will", "did"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Those were the days", "چه روزهایی بود", "Those were the days!", "چه روزهایی بود!"),
            IdiomExpression("That's a shame", "حیف شد", "That's a shame.", "حیف شد."),
            IdiomExpression("Catch up", "خبر گرفتن", "Let's catch up properly.", "بیا مفصل خبر بگیریم.")
        ),
        pron = listOf(
            PronunciationTip("Used to", "Weak form: used to /ˈjuːstə/ in natural speech.")
        ),
        cult = listOf(
            CulturalNote("School reunions", "In the UK and US, school reunions are common. In many cultures, classmates stay in touch throughout life.")
        ),
        mis = listOf(
            CommonMistake("I use to live there.", "I used to live there.", "Past: used to."),
            CommonMistake("I would have a car.", "I used to have a car.", "Would cannot express past states.")
        )
    )

    // ═══════════ REVIEW 3 ═══════════

    private fun rc56() = base(15, "R&C 5&6", "مرور ۵ و ۶",
        listOf("Review narrative tenses", "Review comparatives", "Review used to/would"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("narrative", "روایت", "A narrative text.", "متن روایی."),
            v("comparison", "مقایسه", "Make a comparison.", "مقایسه کن."),
            v("progress", "پیشرفت", "You've made great progress.", "پیشرفت عالی کرده‌ای."),
            v("accuracy", "دقت", "Focus on accuracy.", "روی دقت تمرکز کن."),
            v("fluency", "روانی", "Work on fluency.", "روی روانی کار کن.")
        ),
        listOf(
            GrammarSection("Narrative tenses", "Past simple, past continuous, past perfect, past perfect continuous."),
            GrammarSection("Comparatives and superlatives", "much bigger, more expensive, the best."),
            GrammarSection("Used to / Would", "I used to live there. We would play every day.")
        ),
        listOf(
            d("T", "Let's review Files 5 and 6.", "بیایید فایل‌های ۵ و ۶ را مرور کنیم."),
            d("A", "We practiced narrative tenses with past perfect.", "زمان‌های روایی با گذشته کامل تمرین کردیم."),
            d("B", "By the time help arrived, the ship had already sunk.", "تا کمک رسید، کشتی قبلاً غرق شده بود."),
            d("T", "Good. What about comparatives?", "خوبه. مقایسه‌ای‌ها چطور؟"),
            d("A", "Paris is more beautiful than London. London is much bigger.", "پاریس زیباتر از لندنه. لندن خیلی بزرگ‌تره."),
            d("T", "And superlatives?", "و عالی‌ها؟"),
            d("B", "London has one of the highest costs of living in the world.", "لندن یکی از بالاترین هزینه‌های زندگی در جهان را دارد."),
            d("T", "Used to / would?", "Used to / would؟"),
            d("A", "I used to play football. We would stay out until dark.", "I used to play football. We would stay out until dark."),
            d("T", "Excellent. You're making great progress.", "عالی. پیشرفت عالی داری."),
            d("B", "Thank you! We've been practicing every day.", "ممنون! هر روز تمرین می‌کنیم."),
            d("T", "It shows. Ready for File 7?", "معلومه. برای فایل ۷ آماده‌اید؟"),
            d("A", "Definitely. Let's continue.", "قطعاً. بیایید ادامه دهیم.")
        ),
        listOf(
            q("Past perfect example?", listOf("I saw", "I had seen", "I was seeing"), 1),
            q("Comparative of 'beautiful'?", listOf("beautifuler", "more beautiful", "most beautiful"), 1),
            q("We ___ to play every day.", listOf("use", "used", "using"), 1),
            q("___ the time help arrived, the ship had sunk.", listOf("At", "By", "In"), 1)
        ),
        idioms = listOf(IdiomExpression("Make progress", "پیشرفت کردن", "You're making progress.", "داری پیشرفت می‌کنی.")),
        pron = listOf(PronunciationTip("Review", "Focus on sentence stress and linking in fast speech.")),
        cult = listOf(CulturalNote("Review", "Effective review alternates between recognition and production.")),
        mis = listOf(CommonMistake("I had saw it before.", "I had seen it before.", "Past participle, not past simple."))
    )

    // ═══════════ FILE 4 — Money and shopping ═══════════

    private fun f4A() = base(16, "4A The psychology of shopping", "۴A روانشناسی خرید",
        listOf(
            "Use gerunds and infinitives",
            "Talk about shopping habits",
            "Express purpose and reason"
        ),
        listOf(
            v("impulse", "لحظه‌ای", "Impulse buying.", "خرید لحظه‌ای.", "adjective"),
            v("bargain", "معامله خوب", "A real bargain.", "معامله واقعی."),
            v("budget", "بودجه", "Stick to a budget.", "به بودجه پایبند باش."),
            v("splurge", "خرج زیاد کردن", "Splurge on something special.", "روی چیز خاصی خرج زیاد کن.", "verb"),
            v("worth", "ارزش", "It's worth the money.", "ارزش پول را دارد.", "adjective"),
            v("afford", "توانستن از عهده برآمدن", "I can't afford it.", "نمی‌توانم از عهده‌اش برآیم.", "verb"),
            v("tempting", "وسوسه‌کننده", "A tempting offer.", "پیشنهاد وسوسه‌کننده.", "adjective"),
            v("resist", "مقاومت کردن", "I couldn't resist buying it.", "نمی‌توانستم مقاومت کنم.", "verb"),
            v("spend", "خرج کردن", "I spent too much money.", "پول زیادی خرج کردم.", "verb"),
            v("save", "پس‌انداز کردن", "Save money for a rainy day.", "برای روز مبادا پول پس‌انداز کن.", "verb")
        ),
        listOf(
            GrammarSection("Gerunds and infinitives", "enjoy + -ing (I enjoy shopping). want + to (I want to buy)."),
            GrammarSection("Verbs + gerund", "enjoy, avoid, suggest, finish, mind, miss, practise, recommend."),
            GrammarSection("Verbs + infinitive", "want, decide, hope, plan, need, promise, choose, offer, manage.")
        ),
        listOf(
            d("A", "Do you ever buy things on impulse?", "هرگز چیزهایی به صورت لحظه‌ای می‌خری؟"),
            d("B", "Unfortunately, yes. I can't resist a good sale.", "متأسفانه بله. نمی‌توانم در برابر حراج خوب مقاومت کنم."),
            d("A", "What do you usually splurge on?", "معمولاً روی چی خرج زیاد می‌کنی؟"),
            d("B", "Shoes, without a doubt. And I regret spending so much on them sometimes.", "کفش، بدون شک. و گاهی از خرج کردن اینقدر پول روی آنها پشیمان می‌شوم."),
            d("A", "Do you have a monthly budget?", "بودجه ماهانه داری؟"),
            d("B", "I try to. But it's difficult to stick to it.", "سعی می‌کنم. ولی پایبند بودنش سخته."),
            d("A", "Same here. I keep promising to save money, but then I see something I like.", "من هم همین. مدام قول می‌دهم پول پس‌انداز کنم، ولی بعد چیزی می‌بینم که دوست دارم."),
            d("B", "Do you enjoy shopping online?", "خرید آنلاین را دوست داری؟"),
            d("A", "Not really. I prefer going to shops. I like trying things on first.", "نه زیاد. ترجیح می‌دهم به مغازه بروم. دوست دارم اول چیزها را پرو کنم."),
            d("B", "I don't mind shopping online, but I always end up buying more than I planned.", "خرید آنلاین را دوست دارم، ولی همیشه بیشتر از برنامه‌ام می‌خرم."),
            d("A", "That's the problem with online shopping. It's too tempting.", "مشکل خرید آنلاین همینه. خیلی وسوسه‌کننده‌ست."),
            d("B", "Exactly. Last week I bought three jackets I don't need.", "دقیقاً. هفته پیش سه کاپشن خریدم که لازم ندارم."),
            d("A", "Do you ever return them?", "هرگز برشان می‌گردانی؟"),
            d("B", "Sometimes. But I often forget to. It's worth the effort though.", "گاهی. ولی اغلب فراموش می‌کنم. هرچند ارزشش را دارد."),
            d("A", "I recommend making a list before you shop. It really helps.", "توصیه می‌کنم قبل از خرید لیست درست کنی. واقعاً کمک می‌کنه.")
        ),
        listOf(
            q("What does B splurge on?", listOf("clothes", "shoes", "electronics"), 1),
            q("What does A prefer?", listOf("online shopping", "in-store shopping", "not shopping"), 1),
            q("I enjoy ___ online.", listOf("shop", "shopping", "to shop"), 1),
            q("I want ___ a new phone.", listOf("buy", "buying", "to buy"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Splurge on", "خرج زیاد کردن روی", "I splurge on shoes.", "روی کفش خرج زیاد می‌کنم."),
            IdiomExpression("Stick to", "پایبند بودن به", "Stick to your budget.", "به بودجه‌ات پایبند باش."),
            IdiomExpression("End up", "در نهایت انجام دادن", "I end up buying more.", "در نهایت بیشتر می‌خرم.")
        ),
        pron = listOf(
            PronunciationTip("Gerund vs infinitive", "Listen for the different rhythm: I enjoy SHOPping vs I want to BUY.")
        ),
        cult = listOf(
            CulturalNote("Shopping culture", "The US has more 'impulse buy' culture. In some European countries, shopping is more planned.")
        ),
        mis = listOf(
            CommonMistake("I enjoy to shop.", "I enjoy shopping.", "Enjoy + gerund."),
            CommonMistake("I want buying a car.", "I want to buy a car.", "Want + infinitive.")
        )
    )

    private fun f4B() = base(17, "4B Money and happiness", "۴B پول و خوشبختی",
        listOf(
            "Use second conditional",
            "Talk about hypothetical situations",
            "Discuss money and values"
        ),
        listOf(
            v("wealthy", "ثروتمند", "A wealthy family.", "خانواده ثروتمند.", "adjective"),
            v("generous", "بخشنده", "She's very generous.", "او خیلی بخشنده است.", "adjective"),
            v("stingy", "خسیس", "He's quite stingy.", "او کاملاً خسیس است.", "adjective"),
            v("charity", "خیریه", "Give to charity.", "به خیریه بده."),
            v("donate", "اهداء کردن", "Donate money to charity.", "پول به خیریه اهدا کن.", "verb"),
            v("invest", "سرمایه‌گذاری کردن", "Invest in property.", "در املاک سرمایه‌گذاری کن.", "verb"),
            v("debt", "بدهی", "Pay off debt.", "بدهی را پرداخت کن."),
            v("loan", "وام", "A bank loan.", "وام بانکی."),
            v("materialistic", "مادی‌گرا", "A materialistic society.", "جامعه‌ای مادی‌گرا.", "adjective"),
            v("content", "قانع", "Content with what I have.", "قانع به آنچه دارم.", "adjective")
        ),
        listOf(
            GrammarSection("Second conditional", "If + past simple, would + verb. If I had money, I would travel."),
            GrammarSection("Would for hypotheticals", "What would you do if...? I would buy... She wouldn't say..."),
            GrammarSection("Unless", "Unless you save money, you'll never buy a house.")
        ),
        listOf(
            d("A", "If you suddenly won a million dollars, what would you do?", "اگر ناگهان یک میلیون دلار برنده می‌شدی، چیکار می‌کردی؟"),
            d("B", "That's easy. I'd buy a house and travel the world.", "آسونه. یک خانه می‌خریدم و دنیا را سفر می‌کردم."),
            d("A", "Would you give any to charity?", "به خیریه چیزی می‌دادی؟"),
            d("B", "Of course. If I had that much money, I'd definitely donate some.", "البته. اگر آنقدر پول داشتم، قطعاً مقداری اهدا می‌کردم."),
            d("A", "How much?", "چقدر؟"),
            d("B", "Maybe twenty percent. What about you?", "شاید بیست درصد. تو چطور؟"),
            d("A", "I'd save most of it. I'd only spend a little on myself.", "بیشترش را پس‌انداز می‌کردم. فقط کمی برای خودم خرج می‌کردم."),
            d("B", "Really? Wouldn't you splurge a bit?", "واقعاً؟ کمی خرج زیاد نمی‌کردی؟"),
            d("A", "Maybe on a nice car. But I wouldn't go crazy.", "شاید روی یک ماشین قشنگ. ولی دیوانه‌وار خرج نمی‌کردم."),
            d("B", "Do you think money brings happiness?", "فکر می‌کنی پول خوشبختی می‌آورد؟"),
            d("A", "Up to a point. If you don't worry about bills, you're happier.", "تا حدی. اگر نگران قبض‌ها نباشی، خوشحال‌تری."),
            d("B", "I agree. But if you're too materialistic, more money doesn't help.", "موافقم. ولی اگر خیلی مادی‌گرا باشی، پول بیشتر کمکی نمی‌کند."),
            d("A", "True. Being content with what you have is important.", "درسته. قانع بودن به آنچه داری مهم است."),
            d("B", "Unless you're too content, and then you never try to improve.", "مگر اینکه خیلی قانع باشی، و بعد هرگز برای بهبود تلاش نکنی."),
            d("A", "That's a good point. It's all about balance.", "نکته خوبی‌ست. همه چیز تعادل است.")
        ),
        listOf(
            q("What would B do first?", listOf("charity", "buy a house", "invest"), 1),
            q("How much would B donate?", listOf("10%", "20%", "50%"), 1),
            q("If I ___ money, I'd travel.", listOf("have", "had", "having"), 1),
            q("I ___ buy a house if I won.", listOf("will", "would", "am"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Go crazy", "دیوانه‌وار خرج کردن", "I wouldn't go crazy.", "دیوانه‌وار خرج نمی‌کردم."),
            IdiomExpression("Up to a point", "تا حدی", "Up to a point, yes.", "تا حدی، بله."),
            IdiomExpression("Content with", "قانع به", "Content with what I have.", "قانع به آنچه دارم.")
        ),
        pron = listOf(
            PronunciationTip("Second conditional", "Would is usually contracted: I'd /aɪd/, you'd /juːd/, he'd /hiːd/.")
        ),
        cult = listOf(
            CulturalNote("Money and happiness", "Studies show that beyond a certain income, more money doesn't increase happiness. Relationships matter more.")
        ),
        mis = listOf(
            CommonMistake("If I would have money", "If I had money", "Use past simple in if-clause."),
            CommonMistake("I will buy a house if I won.", "I would buy a house if I won.", "Would in main clause.")
        )
    )

    private fun f4C() = base(18, "4C Ethical shopping", "۴C خرید اخلاقی",
        listOf(
            "Use relative clauses",
            "Discuss ethical issues",
            "Express opinions about consumerism"
        ),
        listOf(
            v("ethical", "اخلاقی", "Ethical shopping.", "خرید اخلاقی.", "adjective"),
            v("sustainable", "پایدار", "Sustainable fashion.", "مد پایدار.", "adjective"),
            v("fair trade", "تجارت منصفانه", "Fair trade coffee.", "قهوه تجارت منصفانه."),
            v("organic", "ارگانیک", "Organic vegetables.", "سبزیجات ارگانیک.", "adjective"),
            v("carbon footprint", "رد پای کربن", "Reduce your carbon footprint.", "رد پای کربن را کاهش بده."),
            v("exploit", "بهره‌کشی کردن", "Companies exploit workers.", "شرکت‌ها از کارگران بهره‌کشی می‌کنند.", "verb"),
            v("sweatshop", "کارگاه استثماری", "Sweatshops in developing countries.", "کارگاه‌های استثماری در کشورهای در حال توسعه."),
            v("conscious", "آگاه", "A conscious consumer.", "مصرف‌کننده آگاه.", "adjective"),
            v("purchase", "خرید", "Make a purchase.", "خرید کن."),
            v("impact", "تأثیر", "Environmental impact.", "تأثیر زیست‌محیطی.")
        ),
        listOf(
            GrammarSection("Defining relative clauses", "The man who sells coffee. The shop that I like. The product which is ethical."),
            GrammarSection("Non-defining relative clauses", "My brother, who lives in Paris, is a chef. Use commas."),
            GrammarSection("Whose", "The company whose products I buy is ethical.")
        ),
        listOf(
            d("A", "Do you think about ethics when you shop?", "وقتی خرید می‌کنی به اخلاق فکر می‌کنی؟"),
            d("B", "Increasingly, yes. I try to buy products that are sustainable.", "بیشتر و بیشتر، بله. سعی می‌کنم محصولاتی بخرم که پایدار هستند."),
            d("A", "What kind of things do you look for?", "دنبال چه چیزهایی می‌گردی؟"),
            d("B", "Fair trade labels, organic food, and clothes which aren't made in sweatshops.", "برچسب‌های تجارت منصفانه، غذای ارگانیک، و لباس‌هایی که در کارگاه‌های استثماری ساخته نشده‌اند."),
            d("A", "Isn't that expensive?", "گران نیست؟"),
            d("B", "It can be. But I'd rather buy fewer things that last longer.", "می‌تونه باشه. ولی ترجیح می‌دهم چیزهای کمتری بخرم که بیشتر دوام می‌آورند."),
            d("A", "That's a good philosophy. Do you ever buy from big brands?", "فلسفه خوبیه. هرگز از برندهای بزرگ می‌خری؟"),
            d("B", "Sometimes. Not all big companies are bad.", "گاهی. همه شرکت‌های بزرگ بد نیستند."),
            d("A", "But many of them exploit workers.", "ولی خیلی‌هاشون از کارگران بهره‌کشی می‌کنند."),
            d("B", "True. That's why I try to research before I buy.", "درسته. برای همین سعی می‌کنم قبل از خرید تحقیق کنم."),
            d("A", "I admire that. I'm not as conscious as you.", "تحسین می‌کنم. من به اندازه تو آگاه نیستم."),
            d("B", "It's not about being perfect. Even small changes reduce your impact.", "در مورد کامل بودن نیست. حتی تغییرات کوچک تأثیرت رو کاهش می‌دن."),
            d("A", "What's the easiest change someone could make?", "آسون‌ترین تغییری که کسی می‌تونه بکنه چیه؟"),
            d("B", "Buying second-hand clothes, which saves money and resources.", "خرید لباس دست دوم، که پول و منابع رو ذخیره می‌کنه."),
            d("A", "That's a great tip. I'll start doing that.", "نکته عالی‌ایه. شروع می‌کنم به این کار."),
            d("B", "You won't regret it. It's also more fun!", "پشیمان نمی‌شی. سرگرم‌کننده‌تر هم هست!")
        ),
        listOf(
            q("What does B look for?", listOf("cheap prices", "fair trade labels", "popular brands"), 1),
            q("What's the easiest change?", listOf("buy organic", "second-hand clothes", "no shopping"), 1),
            q("I buy products ___ are sustainable.", listOf("who", "which", "whose"), 1),
            q("The company ___ products I buy is ethical.", listOf("who", "which", "whose"), 2)
        ),
        idioms = listOf(
            IdiomExpression("I'd rather", "ترجیح می‌دهم", "I'd rather buy fewer things.", "ترجیح می‌دهم چیزهای کمتری بخرم."),
            IdiomExpression("Carbon footprint", "رد پای کربن", "Reduce your carbon footprint.", "رد پای کربن را کاهش بده.")
        ),
        pron = listOf(
            PronunciationTip("Relative clauses", "No pause in defining: The man who sells coffee. Pause in non-defining: My brother, | who lives in Paris, | is a chef.")
        ),
        cult = listOf(
            CulturalNote("Ethical consumption", "Growing movement globally. Fair Trade, B Corps, and slow fashion are gaining popularity.")
        ),
        mis = listOf(
            CommonMistake("The man which sells coffee.", "The man who sells coffee.", "Who for people."),
            CommonMistake("The company who products I buy.", "The company whose products I buy.", "Whose for possession.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 4 ═══════════

    private fun pe4() = base(19, "PE4 At the bank", "انگلیسی کاربردی ۴ — در بانک",
        listOf(
            "Open a bank account",
            "Discuss financial services",
            "Understand banking vocabulary"
        ),
        listOf(
            v("account", "حساب", "Open a bank account.", "حساب بانکی باز کن."),
            v("deposit", "واریز", "Make a deposit.", "واریز کن.", "verb"),
            v("withdraw", "برداشت کردن", "Withdraw cash.", "پول نقد برداشت کن.", "verb"),
            v("transfer", "انتقال", "Transfer money.", "پول انتقال بده.", "verb"),
            v("balance", "موجودی", "Check your balance.", "موجودی‌ات را چک کن."),
            v("interest rate", "نرخ بهره", "A low interest rate.", "نرخ بهره پایین."),
            v("statement", "صورت‌حساب", "A bank statement.", "صورت‌حساب بانکی."),
            v("PIN", "رمز", "Enter your PIN.", "رمز را وارد کن."),
            v("overdraft", "اضافه برداشت", "An overdraft fee.", "هزینه اضافه برداشت."),
            v("mortgage", "وام مسکن", "Apply for a mortgage.", "برای وام مسکن درخواست بده.")
        ),
        listOf(
            GrammarSection("Polite requests in banking", "I'd like to... Could I...? Would you mind...?"),
            GrammarSection("Conditional offers", "If you open a savings account, you'll get a better rate."),
            GrammarSection("Explaining procedures", "First, you need to... Then, we'll... After that, you'll receive...")
        ),
        listOf(
            d("A", "Good morning. I'd like to open a bank account, please.", "صبح بخیر. می‌خواهم حساب بانکی باز کنم، لطفاً."),
            d("B", "Certainly. What kind of account are you looking for?", "قطعاً. چه نوع حسابی می‌خواهید؟"),
            d("A", "A current account, I think. And maybe a savings account too.", "فکر می‌کنم جاری. و شاید یک حساب پس‌انداز هم."),
            d("B", "Good choice. If you open both, you'll get a better interest rate.", "انتخاب خوبی. اگر هر دو را باز کنید، نرخ بهره بهتری می‌گیرید."),
            d("A", "That sounds good. What do I need to bring?", "خوبه. چه چیزی باید بیاورم؟"),
            d("B", "You'll need your passport and proof of address.", "پاسپورت و مدرک آدرس لازم دارید."),
            d("A", "I have my passport. But I just moved, so I don't have proof of address yet.", "پاسپورتم را دارم. ولی تازه اسباب‌کشی کرده‌ام، پس هنوز مدرک آدرس ندارم."),
            d("B", "In that case, you could use a utility bill or a tenancy agreement.", "در آن صورت، می‌توانید از قبض خدمات یا قرارداد اجاره استفاده کنید."),
            d("A", "I have a tenancy agreement. Will that work?", "قرارداد اجاره دارم. کار می‌کند؟"),
            d("B", "Yes, that's perfect. Would you mind filling in this form?", "بله، عالیه. می‌شود این فرم را پر کنید؟"),
            d("A", "Not at all. Could you help me with a couple of questions?", "حتماً. می‌توانید با چند سؤال کمکم کنید؟"),
            d("B", "Of course. What would you like to know?", "البته. چه چیزی می‌خواهید بدانید؟"),
            d("A", "How long does it take to get a card?", "چقدر طول می‌کشد تا کارت بگیرم؟"),
            d("B", "Usually about five working days. We'll send it to your address.", "معمولاً حدود پنج روز کاری. به آدرس شما می‌فرستیم."),
            d("A", "Great. And can I deposit cash today?", "عالی. و می‌توانم امروز پول نقد واریز کنم؟"),
            d("B", "Absolutely. Once the account is open, you can deposit immediately.", "قطعاً. به محض باز شدن حساب، می‌توانید فوراً واریز کنید."),
            d("A", "Perfect. Thank you so much for your help.", "عالی. خیلی ممنون از کمکتان."),
            d("B", "My pleasure. Welcome to the bank!", "خواهش می‌کنم. به بانک خوش آمدید!")
        ),
        listOf(
            q("What kind of account does A want?", listOf("business", "current + savings", "student"), 1),
            q("What proof of address does A have?", listOf("utility bill", "tenancy agreement", "none"), 1),
            q("I'd like ___ a bank account.", listOf("open", "opening", "to open"), 2),
            q("Would you mind ___ this form?", listOf("fill", "filling", "to fill"), 1)
        ),
        idioms = listOf(
            IdiomExpression("In that case", "در آن صورت", "In that case, use this.", "در آن صورت، از این استفاده کن."),
            IdiomExpression("My pleasure", "خواهش می‌کنم", "My pleasure.", "خواهش می‌کنم.")
        ),
        pron = listOf(
            PronunciationTip("Polite requests", "Would you MIND FILLing in this form? ↗")
        ),
        cult = listOf(
            CulturalNote("Banking in the UK", "It's common to need proof of address. Utility bills or tenancy agreements are standard.")
        ),
        mis = listOf(
            CommonMistake("I'd like opening an account.", "I'd like to open an account.", "Would like + infinitive."),
            CommonMistake("Would you mind to help me?", "Would you mind helping me?", "Would you mind + gerund.")
        )
    )

    // ═══════════ REVIEW 4 ═══════════

    private fun rc78() = base(20, "R&C 7&8", "مرور ۷ و ۸",
        listOf("Review gerunds/infinitives", "Review second conditional", "Review relative clauses"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("summarize", "خلاصه کردن", "Summarize the lesson.", "درس را خلاصه کن.", "verb"),
            v("practice", "تمرین", "Practice daily.", "هر روز تمرین کن.", "verb"),
            v("progress", "پیشرفت", "Great progress.", "پیشرفت عالی."),
            v("confidence", "اعتماد به نفس", "Speak with confidence.", "با اعتماد به نفس صحبت کن."),
            v("fluency", "روانی", "Improve fluency.", "روانی را بهبود بده.")
        ),
        listOf(
            GrammarSection("Gerunds and infinitives", "enjoy shopping, want to buy, decide to go, avoid eating."),
            GrammarSection("Second conditional", "If I had money, I would travel."),
            GrammarSection("Relative clauses", "The man who... The shop that... The woman whose...")
        ),
        listOf(
            d("T", "Files 7 and 8 review. What did we cover?", "مرور فایل‌های ۷ و ۸. چه چیزهایی پوشش دادیم؟"),
            d("A", "Gerunds and infinitives. I enjoy shopping. I want to buy.", "حالت استمراری و مصدر. I enjoy shopping. I want to buy."),
            d("B", "And the second conditional: If I had money, I'd travel.", "و شرطی نوع دوم: If I had money, I'd travel."),
            d("T", "Give me a relative clause example.", "مثال جمله وصفی بزنید."),
            d("A", "The man who sells coffee is my friend.", "مردی که قهوه می‌فروشد دوست من است."),
            d("B", "The shop which I like is closing.", "مغازه‌ای که دوست دارم بسته می‌شود."),
            d("T", "Non-defining?", "غیرتخصیصی؟"),
            d("A", "My brother, who lives in Paris, is a chef.", "برادرم، که در پاریس زندگی می‌کند، آشپز است."),
            d("T", "Excellent. Any questions?", "عالی. سؤالی هست؟"),
            d("B", "When do we use 'whose'?", "کِی از 'whose' استفاده می‌کنیم؟"),
            d("T", "When we talk about possession. The woman whose car was stolen called the police.", "وقتی درباره مالکیت صحبت می‌کنیم. زنی که ماشینش دزدیده شد پلیس را خبر کرد."),
            d("B", "Got it. Thank you.", "فهمیدم. ممنون."),
            d("T", "You're all making great progress.", "همه شما پیشرفت عالی دارید."),
            d("A", "Thanks to your teaching!", "به لطف تدریس شما!")
        ),
        listOf(
            q("Which verb takes gerund?", listOf("want", "enjoy", "decide"), 1),
            q("Second conditional uses:", listOf("would in if-clause", "past simple in if-clause", "will in if-clause"), 1),
            q("I enjoy ___.", listOf("read", "reading", "to read"), 1),
            q("The man ___ sells coffee is my friend.", listOf("which", "who", "whose"), 1)
        ),
        idioms = listOf(IdiomExpression("Got it", "فهمیدم", "Got it, thank you.", "فهمیدم، ممنون.")),
        pron = listOf(PronunciationTip("Contrast", "I enjoy SHOPping (gerund). I want to BUY (infinitive).")),
        cult = listOf(CulturalNote("Review", "Consistency is key to language learning.")),
        mis = listOf(
            CommonMistake("I want buying.", "I want to buy.", "Want + infinitive."),
            CommonMistake("If I would have money.", "If I had money.", "No 'would' in if-clause.")
        )
    )

    // ═══════════ FILE 5 — Work and study ═══════════

    private fun f5A() = base(21, "5A The ideal job", "۵A شغل ایده‌آل",
        listOf(
            "Use modals for obligation and advice",
            "Talk about careers and work",
            "Express preferences about jobs"
        ),
        listOf(
            v("career", "حرفه", "A successful career.", "حرفه موفق."),
            v("salary", "حقوق", "A good salary.", "حقوق خوب."),
            v("work-life balance", "تعادل کار و زندگی", "Important work-life balance.", "تعادل مهم کار و زندگی."),
            v("promotion", "ارتقاء", "Get a promotion.", "ارتقاء بگیر."),
            v("deadline", "مهلت", "Meet a deadline.", "مهلت را رعایت کن."),
            v("colleague", "همکار", "Friendly colleagues.", "همکاران خوش‌برخورد."),
            v("overtime", "اضافه‌کاری", "Work overtime.", "اضافه‌کاری کن."),
            v("flexible", "انعطاف‌پذیر", "Flexible hours.", "ساعات انعطاف‌پذیر.", "adjective"),
            v("rewarding", "رضایت‌بخش", "A rewarding job.", "شغل رضایت‌بخش.", "adjective"),
            v("stressful", "پر استرس", "A stressful job.", "شغل پر استرس.", "adjective")
        ),
        listOf(
            GrammarSection("Must / Have to", "Must: internal obligation. Have to: external obligation."),
            GrammarSection("Should / Ought to", "Advice: You should apply. You ought to ask for a raise."),
            GrammarSection("Don't have to vs Mustn't", "Don't have to = no obligation. Mustn't = prohibition.")
        ),
        listOf(
            d("A", "If you could design your ideal job, what would it be?", "اگر می‌توانستی شغل ایده‌آلت رو طراحی کنی، چی می‌بود؟"),
            d("B", "Something creative, with flexible hours and a good salary.", "چیزی خلاقانه، با ساعات انعطاف‌پذیر و حقوق خوب."),
            d("A", "Do you think that exists?", "فکر می‌کنی وجود داره؟"),
            d("B", "Maybe, but it's rare. Most jobs have trade-offs.", "شاید، ولی نادره. بیشتر شغل‌ها مبادله دارند."),
            d("A", "True. Would you rather have a high salary or more free time?", "درسته. ترجیح می‌دی حقوق بالا داشته باشی یا وقت آزاد بیشتر؟"),
            d("B", "More free time, definitely. I don't have to be rich.", "وقت آزاد بیشتر، قطعاً. لازم نیست ثروتمند باشم."),
            d("A", "But you must earn enough to live comfortably.", "ولی باید به اندازه کافی درآمد داشته باشی که راحت زندگی کنی."),
            d("B", "Of course. I'd just rather work to live than live to work.", "البته. فقط ترجیح می‌دهم کار کنم تا زندگی کنم، نه اینکه زندگی کنم تا کار کنم."),
            d("A", "You mustn't forget about career growth though.", "نباید رشد شغلی را فراموش کنی."),
            d("B", "I haven't. I think you should always be learning.", "فراموش نکرده‌ام. فکر می‌کنم همیشه باید در حال یادگیری باشی."),
            d("A", "What skills do you think matter most?", "فکر می‌کنی چه مهارت‌هایی بیشترین اهمیت را دارند؟"),
            d("B", "Communication, I'd say. You have to work with people in every job.", "ارتباطات، می‌گویم. در هر شغلی باید با مردم کار کنی."),
            d("A", "I agree. What about stress?", "موافقم. استرس چطور؟"),
            d("B", "You shouldn't ignore it. I used to work overtime every week, and it nearly burned me out.", "نباید نادیده‌اش بگیری. قبلاً هر هفته اضافه‌کاری می‌کردم و تقریباً خسته و فرسوده شدم."),
            d("A", "What changed?", "چی عوض شد؟"),
            d("B", "I started saying no. You don't have to accept everything.", "شروع کردم به نه گفتن. لازم نیست همه چیز را قبول کنی."),
            d("A", "That's great advice.", "توصیه عالی‌ایه.")
        ),
        listOf(
            q("What does B prefer?", listOf("high salary", "more free time", "fame"), 1),
            q("What skill matters most according to B?", listOf("technical", "communication", "math"), 1),
            q("You ___ to work with people.", listOf("have", "must", "should"), 0),
            q("You ___ ignore stress.", listOf("mustn't", "don't have to", "shouldn't"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Trade-off", "مبادله", "Every job has trade-offs.", "هر شغلی مبادله دارد."),
            IdiomExpression("Burn out", "فرسوده شدن", "It nearly burned me out.", "تقریباً فرسوده‌ام کرد."),
            IdiomExpression("Work to live, not live to work", "کار برای زندگی، نه زندگی برای کار", "I work to live, not live to work.", "کار می‌کنم تا زندگی کنم، نه زندگی کنم تا کار کنم.")
        ),
        pron = listOf(
            PronunciationTip("Must / Have to", "Must is more formal and often stressed. Have to often reduces to 'hafta' in speech.")
        ),
        cult = listOf(
            CulturalNote("Work culture", "In Japan and Korea, overtime is common. In Scandinavia, work-life balance is prioritised.")
        ),
        mis = listOf(
            CommonMistake("You must to rest.", "You must rest.", "No 'to' after must."),
            CommonMistake("I don't must work.", "I don't have to work.", "Use 'don't have to'.")
        )
    )

    private fun f5B() = base(22, "5B Learning for life", "۵B یادگیری برای زندگی",
        listOf(
            "Use gerunds and infinitives after verbs",
            "Talk about learning and education",
            "Express purpose"
        ),
        listOf(
            v("qualification", "مدرک", "A teaching qualification.", "مدرک تدریس."),
            v("degree", "مدرک دانشگاهی", "A university degree.", "مدرک دانشگاهی."),
            v("course", "دوره", "Take a course.", "دوره بگیر."),
            v("progress", "پیشرفت", "Make progress.", "پیشرفت کن."),
            v("skill", "مهارت", "Learn new skills.", "مهارت‌های جدید یاد بگیر."),
            v("motivation", "انگیزه", "Lack of motivation.", "کمبود انگیزه."),
            v("lifelong", "مادام‌العمر", "Lifelong learning.", "یادگیری مادام‌العمر.", "adjective"),
            v("memorize", "حفظ کردن", "Memorize vocabulary.", "واژگان را حفظ کن.", "verb"),
            v("revise", "مرور کردن", "Revise before exams.", "قبل از امتحان مرور کن.", "verb"),
            v("motivate", "انگیزه دادن", "Motivate students.", "به دانش‌آموزان انگیزه بده.", "verb")
        ),
        listOf(
            GrammarSection("Verb + gerund", "enjoy, avoid, suggest, finish, mind, keep, practise, recommend."),
            GrammarSection("Verb + infinitive", "want, decide, hope, plan, need, promise, choose, offer, manage, agree."),
            GrammarSection("Purpose", "to + infinitive: I study to improve my English.")
        ),
        listOf(
            d("A", "What are you studying at the moment?", "الان چی می‌خوانی؟"),
            d("B", "I'm taking an online course to improve my programming skills.", "یک دوره آنلاین برای بهبود مهارت‌های برنامه‌نویسی‌ام می‌گیرم."),
            d("A", "Nice. Do you enjoy learning online?", "خوبه. یادگیری آنلاین را دوست داری؟"),
            d("B", "I do, actually. I can study whenever I want.", "واقعاً بله. هر وقت بخواهم می‌توانم مطالعه کنم."),
            d("A", "But isn't it hard to stay motivated?", "ولی سخت نیست انگیزه‌ات را حفظ کنی؟"),
            d("B", "Sometimes. But I try to avoid procrastinating.", "گاهی. ولی سعی می‌کنم به تعویق نیندازم."),
            d("A", "How do you manage to stay on track?", "چطور موفق می‌شوی روی مسیر بمانی؟"),
            d("B", "I set small goals. And I always finish what I start.", "اهداف کوچک تعیین می‌کنم. و همیشه آنچه را شروع می‌کنم تمام می‌کنم."),
            d("A", "That's a good approach. Do you plan to get a qualification?", "رویکرد خوبیه. قصد داری مدرک بگیری؟"),
            d("B", "Yes, eventually. I've decided to take a certification exam next year.", "بله، در نهایت. تصمیم گرفته‌ام سال بعد در یک امتحان صدور گواهی شرکت کنم."),
            d("A", "Do you recommend online learning?", "یادگیری آنلاین را توصیه می‌کنی؟"),
            d("B", "I suggest trying both. Online is flexible, but classroom learning keeps you disciplined.", "توصیه می‌کنم هر دو را امتحان کنی. آنلاین انعطاف‌پذیره، ولی یادگیری کلاسی تو را منظم نگه می‌دارد."),
            d("A", "Have you ever thought about learning a language?", "هرگز به یادگیری یک زبان فکر کرده‌ای؟"),
            d("B", "I've been meaning to learn Spanish. But I keep putting it off.", "قصد داشته‌ام اسپانیایی یاد بگیرم. ولی مدام به تعویق می‌اندازم."),
            d("A", "You should just start. Even ten minutes a day helps.", "باید فقط شروع کنی. حتی روزی ده دقیقه کمک می‌کند."),
            d("B", "You're right. I'll download an app tonight.", "حق با توست. امشب یک اپ دانلود می‌کنم.")
        ),
        listOf(
            q("What's B studying?", listOf("languages", "programming", "history"), 1),
            q("How does B stay motivated?", listOf("rewards", "small goals", "friends"), 1),
            q("I enjoy ___.", listOf("learn", "learning", "to learn"), 1),
            q("I've decided ___ a course.", listOf("take", "taking", "to take"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Stay on track", "روی مسیر ماندن", "Stay on track.", "روی مسیر بمان."),
            IdiomExpression("Put off", "به تعویق انداختن", "I keep putting it off.", "مدام به تعویق می‌اندازم."),
            IdiomExpression("On track", "طبق برنامه", "I'm on track.", "طبق برنامه پیش می‌روم.")
        ),
        pron = listOf(
            PronunciationTip("Verb patterns", "Listen to the linking: I enjoy LEARNing. I decided TO TAKE.")
        ),
        cult = listOf(
            CulturalNote("Lifelong learning", "Adults increasingly change careers. Continuous learning is essential in the modern economy.")
        ),
        mis = listOf(
            CommonMistake("I enjoy to learn.", "I enjoy learning.", "Enjoy + gerund."),
            CommonMistake("I decided taking a course.", "I decided to take a course.", "Decide + infinitive.")
        )
    )

    private fun f5C() = base(23, "5C The future of work", "۵C آینده کار",
        listOf(
            "Use will/won't for predictions",
            "Make future predictions",
            "Discuss future trends"
        ),
        listOf(
            v("automation", "اتوماسیون", "Automation is increasing.", "اتوماسیون در حال افزایش است."),
            v("remote", "دور", "Remote work.", "کار از راه دور.", "adjective"),
            v("artificial intelligence", "هوش مصنوعی", "AI is changing everything.", "هوش مصنوعی همه چیز را تغییر می‌دهد."),
            v("displace", "جابجا کردن", "Automation may displace jobs.", "اتوماسیون ممکن است مشاغل را جابجا کند.", "verb"),
            v("adapt", "سازگار شدن", "Adapt to change.", "با تغییر سازگار شو.", "verb"),
            v("gig economy", "اقتصاد گیگ", "The gig economy is growing.", "اقتصاد گیگ در حال رشد است."),
            v("freelance", "فریلنس", "Work as a freelancer.", "به عنوان فریلنسر کار کن.", "adjective"),
            v("innovation", "نوآوری", "Constant innovation.", "نوآوری مداوم."),
            v("unemployment", "بیکاری", "Rising unemployment.", "بیکاری در حال افزایش."),
            v("skill set", "مجموعه مهارت‌ها", "Update your skill set.", "مجموعه مهارت‌هایت را به‌روز کن.")
        ),
        listOf(
            GrammarSection("Will / Won't for predictions", "I think automation will replace many jobs."),
            GrammarSection("May / Might for possibility", "It might happen sooner than expected."),
            GrammarSection("Future continuous", "This time next year, I'll be working remotely.")
        ),
        listOf(
            d("A", "Do you think automation will replace most jobs?", "فکر می‌کنی اتوماسیون بیشتر مشاغل را جایگزین خواهد کرد؟"),
            d("B", "Many jobs, yes. But not all. Some things need a human touch.", "بسیاری از مشاغل، بله. ولی نه همه. بعضی چیزها نیاز به لمس انسانی دارند."),
            d("A", "What kind of jobs will disappear?", "چه نوع شغل‌هایی ناپدید می‌شوند؟"),
            d("B", "Probably repetitive ones. Factory jobs, basic data entry.", "احتمالاً کارهای تکراری. کارهای کارخانه‌ای، ورود داده‌های اولیه."),
            d("A", "And what will grow?", "و چه چیزی رشد می‌کند؟"),
            d("B", "Anything involving creativity, empathy, or complex decision-making.", "هر چیزی که شامل خلاقیت، همدلی یا تصمیم‌گیری پیچیده باشد."),
            d("A", "Do you think remote work is here to stay?", "فکر می‌کنی کار از راه دور ماندنی است؟"),
            d("B", "Definitely. Companies have realized it saves money and makes employees happier.", "قطعاً. شرکت‌ها فهمیده‌اند که پول ذخیره می‌کند و کارمندان را خوشحال‌تر می‌کند."),
            d("A", "But some people feel isolated working from home.", "ولی بعضی‌ها از کار در خانه احساس انزوا می‌کنند."),
            d("B", "That's true. Hybrid models might work best in the future.", "درسته. مدل‌های ترکیبی ممکن است در آینده بهتر عمل کنند."),
            d("A", "What skills will matter most in ten years?", "چه مهارت‌هایی در ده سال آینده بیشترین اهمیت را خواهند داشت؟"),
            d("B", "Adaptability. If you can't adapt, you'll struggle.", "سازگاری. اگر نتوانی سازگار شوی، سخت خواهی داشت."),
            d("A", "I agree. What will you be doing in ten years?", "موافقم. تو ده سال آینده چیکار می‌کنی؟"),
            d("B", "Hopefully I'll be running my own business. I'm already planning it.", "امیدوارم کسب و کار خودم رو اداره کنم. الان هم برنامه‌ریزی می‌کنم."),
            d("A", "That sounds exciting. Good luck!", "هیجان‌انگیز به نظر می‌رسد. موفق باشی!"),
            d("B", "Thanks. And you?", "ممنون. تو چطور؟"),
            d("A", "I'll probably still be teaching. But maybe online!", "احتمالاً هنوز درس می‌دهم. ولی شاید آنلاین!")
        ),
        listOf(
            q("What jobs will disappear according to B?", listOf("creative", "repetitive", "managerial"), 1),
            q("What skills will matter most?", listOf("technical", "adaptability", "physical"), 1),
            q("Automation ___ replace many jobs.", listOf("will", "is", "does"), 0),
            q("I ___ be working remotely next year.", listOf("will", "am", "do"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Here to stay", "ماندنی", "Remote work is here to stay.", "کار از راه دور ماندنی است."),
            IdiomExpression("Human touch", "لمس انسانی", "Some things need a human touch.", "بعضی چیزها نیاز به لمس انسانی دارند.")
        ),
        pron = listOf(
            PronunciationTip("Contractions", "I'll /aɪl/, won't /woʊnt/, they'll /ðeɪl/.")
        ),
        cult = listOf(
            CulturalNote("Future of work", "The pandemic accelerated remote work. Hybrid models are now the norm in many sectors.")
        ),
        mis = listOf(
            CommonMistake("I will to work remotely.", "I will work remotely.", "No 'to' after will."),
            CommonMistake("Automation will replaces jobs.", "Automation will replace jobs.", "Base verb after will.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 5 ═══════════

    private fun pe5() = base(24, "PE5 A job interview", "انگلیسی کاربردی ۵ — مصاحبه شغلی",
        listOf(
            "Prepare for a job interview",
            "Answer common interview questions",
            "Ask questions about the role"
        ),
        listOf(
            v("interview", "مصاحبه", "A job interview.", "مصاحبه شغلی."),
            v("CV", "رزومه", "Send your CV.", "رزومه‌ات را بفرست."),
            v("experience", "تجربه", "Relevant experience.", "تجربه مرتبط."),
            v("strength", "نقطه قوت", "My main strength.", "نقطه قوت اصلی‌ام."),
            v("weakness", "نقطه ضعف", "My weakness.", "نقطه ضعفم."),
            v("team player", "کار تیمی", "A good team player.", "کار تیمی خوب."),
            v("challenge", "چالش", "Enjoy challenges.", "از چالش‌ها لذت ببر."),
            v("deadline", "مهلت", "Meet deadlines.", "مهلت‌ها را رعایت کن."),
            v("role", "نقش", "The role of a manager.", "نقش یک مدیر."),
            v("opportunity", "فرصت", "An exciting opportunity.", "فرصت هیجان‌انگیز.")
        ),
        listOf(
            GrammarSection("Present perfect for experience", "I've worked in marketing for five years. I've managed teams."),
            GrammarSection("Talking about strengths", "I'm good at... My strength is... I'm particularly skilled in..."),
            GrammarSection("Polite questions", "Could you tell me more about...? What would my responsibilities be?")
        ),
        listOf(
            d("A", "Good morning. Please, have a seat. Tell me a little about yourself.", "صبح بخیر. لطفاً بنشینید. کمی از خودتان بگویید."),
            d("B", "Thank you. I've been working in marketing for six years, mostly in the tech sector.", "ممنون. شش سال است که در بازاریابی کار می‌کنم، بیشتر در بخش فناوری."),
            d("A", "Interesting. What made you apply for this role?", "جالب. چه چیزی باعث شد برای این نقش درخواست دهید؟"),
            d("B", "I've followed your company for a long time. I admire your focus on sustainability.", "مدت‌هاست شرکت شما را دنبال می‌کنم. تمرکزتان روی پایداری را تحسین می‌کنم."),
            d("A", "What would you say your main strength is?", "فکر می‌کنید نقطه قوت اصلی‌تان چیست؟"),
            d("B", "I'm very good at managing deadlines. I've never missed one in my career.", "در مدیریت مهلت‌ها خیلی خوب هستم. در حرفه‌ام هرگز یکی را از دست نداده‌ام."),
            d("A", "And your weakness?", "و نقطه ضعف‌تان؟"),
            d("B", "I used to take on too much. But I've learned to delegate.", "قبلاً بیش از حد کار قبول می‌کردم. ولی یاد گرفته‌ام تفویض کنم."),
            d("A", "Good answer. Do you work well in a team?", "پاسخ خوبی. در تیم خوب کار می‌کنید؟"),
            d("B", "Yes, I enjoy collaborating. I've led several cross-functional projects.", "بله، از همکاری لذت می‌برم. چندین پروژه بین‌وظیفه‌ای رهبری کرده‌ام."),
            d("A", "Could you tell me about a challenge you've faced?", "می‌توانید از چالشی که با آن روبرو شده‌اید بگویید؟"),
            d("B", "Last year we lost a key client. I organized a team effort to win them back.", "سال گذشته یک مشتری کلیدی را از دست دادیم. تلاش تیمی سازماندهی کردم تا آنها را بازگردانیم."),
            d("A", "And did you succeed?", "و موفق شدید؟"),
            d("B", "We did. It took three months, but they signed a bigger contract.", "بله. سه ماه طول کشید، ولی قرارداد بزرگ‌تری امضا کردند."),
            d("A", "Impressive. Do you have any questions for us?", "تحسین‌برانگیز. سؤالی از ما دارید؟"),
            d("B", "Yes, could you tell me more about the team I'd be working with?", "بله، می‌توانید بیشتر درباره تیمی که با آن کار خواهم کرد بگویید؟"),
            d("A", "Of course. We'll contact you by Friday.", "البته. تا جمعه با شما تماس می‌گیریم."),
            d("B", "Thank you for your time.", "ممنون از وقتی که گذاشتید.")
        ),
        listOf(
            q("How long has B worked in marketing?", listOf("3 years", "6 years", "10 years"), 1),
            q("What is B's strength?", listOf("creativity", "managing deadlines", "leadership"), 1),
            q("I've ___ in marketing for six years.", listOf("work", "worked", "working"), 1),
            q("Could you tell me more ___ the team?", listOf("about", "of", "for"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Have a seat", "بنشینید", "Please, have a seat.", "لطفاً بنشینید."),
            IdiomExpression("Take on", "قبول کردن", "I used to take on too much.", "قبلاً بیش از حد قبول می‌کردم."),
            IdiomExpression("Win back", "بازگرداندن", "We won them back.", "آنها را بازگرداندیم.")
        ),
        pron = listOf(
            PronunciationTip("Interview tone", "Speak clearly, not too fast. Use pauses for emphasis. Stress key achievements.")
        ),
        cult = listOf(
            CulturalNote("Job interviews", "In the US and UK, it's common to talk positively about yourself. In some cultures, this may seem boastful.")
        ),
        mis = listOf(
            CommonMistake("I've work here for 5 years.", "I've worked here for 5 years.", "Past participle."),
            CommonMistake("Could you tell me about the team what I'd work with?", "Could you tell me about the team I'd work with?", "No 'what' in relative clause.")
        )
    )

    // ═══════════ REVIEW 5 ═══════════

    private fun rc910() = base(25, "R&C 9&10", "مرور ۹ و ۱۰",
        listOf("Review modals", "Review gerunds/infinitives", "Review future forms"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("consolidate", "تثبیت کردن", "Consolidate your learning.", "یادگیری‌ات را تثبیت کن.", "verb"),
            v("confidence", "اعتماد به نفس", "Speak with confidence.", "با اعتماد به نفس صحبت کن."),
            v("progress", "پیشرفت", "Steady progress.", "پیشرفت پیوسته."),
            v("weakness", "نقطه ضعف", "Identify your weaknesses.", "نقاط ضعفت را شناسایی کن."),
            v("strength", "نقطه قوت", "Build on your strengths.", "روی نقاط قوتت بساز.")
        ),
        listOf(
            GrammarSection("Modals review", "Must, have to, should, ought to, don't have to, mustn't."),
            GrammarSection("Gerunds and infinitives", "enjoy + -ing, want + to, suggest + -ing, decide + to."),
            GrammarSection("Future forms", "Will, going to, present continuous for future, future continuous.")
        ),
        listOf(
            d("T", "Let's review the last four files.", "بیایید چهار فایل آخر را مرور کنیم."),
            d("A", "We covered modals for obligation and advice.", "افعال وجهی برای الزام و توصیه را پوشش دادیم."),
            d("B", "You must rest. You should apply. You don't have to come.", "You must rest. You should apply. You don't have to come."),
            d("T", "Give me a gerund and an infinitive example.", "مثال یک gerund و یک infinitive بزنید."),
            d("A", "I enjoy reading. I want to travel.", "I enjoy reading. I want to travel."),
            d("T", "Future forms?", "شکل‌های آینده؟"),
            d("B", "I'll help you. I'm going to study. I'm meeting Tom tomorrow.", "I'll help you. I'm going to study. I'm meeting Tom tomorrow."),
            d("T", "Excellent. When do we use each?", "عالی. کِی از هر کدام استفاده می‌کنیم؟"),
            d("A", "Will for decisions and predictions. Going to for plans. Present continuous for arrangements.", "Will برای تصمیمات و پیش‌بینی‌ها. Going to برای برنامه‌ها. حال استمراری برای ترتیبات."),
            d("T", "Perfect. You're ready for Level 4.", "عالی. برای سطح ۴ آماده‌اید."),
            d("B", "We're excited to continue.", "برای ادامه هیجان‌زده‌ایم."),
            d("A", "Yes, but first let's celebrate finishing Level 3!", "بله، ولی اول بیایید اتمام سطح ۳ را جشن بگیریم!"),
            d("T", "Congratulations, everyone!", "تبریک به همه!"),
            d("A", "Thank you for everything!", "ممنون از همه چیز!")
        ),
        listOf(
            q("Which is advice?", listOf("must", "should", "will"), 1),
            q("Future for arrangements?", listOf("will", "going to", "present continuous"), 2),
            q("I enjoy ___.", listOf("read", "reading", "to read"), 1),
            q("You ___ to come if you don't want.", listOf("mustn't", "don't have", "shouldn't"), 1)
        ),
        idioms = listOf(IdiomExpression("Ready for", "آماده برای", "Ready for Level 4!", "آماده برای سطح ۴!")),
        pron = listOf(PronunciationTip("Contractions", "I'll, I'm, won't, don't have to.")),
        cult = listOf(CulturalNote("Level completion", "Congratulations on completing Level 3!")),
        mis = listOf(
            CommonMistake("You must to rest.", "You must rest.", "No 'to' after must."),
            CommonMistake("I enjoy to read.", "I enjoy reading.", "Enjoy + gerund.")
        )
    )

    // ═══════════ FILE 6 — Relationships ═══════════

    private fun f6A() = base(26, "6A Love and marriage", "۶A عشق و ازدواج",
        listOf("Use relative clauses", "Talk about relationships", "Express opinions about marriage"),
        listOf(
            v("engaged", "نامزد", "They got engaged last month.", "ماه پیش نامزد کردند.", "adjective"),
            v("partner", "شریک", "My partner and I.", "من و شریکم."),
            v("commitment", "تعهد", "A serious commitment.", "تعهد جدی."),
            v("ceremony", "مراسم", "A wedding ceremony.", "مراسم عروسی."),
            v("get on well", "رابطه خوب داشتن", "We get on well.", "رابطه خوبی داریم.", "verb"),
            v("fall in love", "عاشق شدن", "They fell in love instantly.", "بلافاصله عاشق شدند.", "verb"),
            v("argue", "بحث کردن", "Couples argue sometimes.", "زوج‌ها گاهی بحث می‌کنند.", "verb"),
            v("make up", "آشتی کردن", "They always make up quickly.", "همیشه سریع آشتی می‌کنند.", "verb"),
            v("supportive", "حمایتگر", "A supportive partner.", "شریک حمایتگر.", "adjective"),
            v("split up", "جدا شدن", "They split up last year.", "سال پیش جدا شدند.", "verb")
        ),
        listOf(
            GrammarSection("Relative clauses", "The man who I met. The woman whose smile... A person that I trust."),
            GrammarSection("Defining vs non-defining", "The man who lives next door (defining). My brother, who lives in Paris, (non-defining)."),
            GrammarSection("Relative pronouns", "who (people), which (things), that (both), whose (possession), where (places).")
        ),
        listOf(
            d("A", "Have you heard? Tom and Anna got engaged!", "شنیدی؟ تام و آنا نامزد کردند!"),
            d("B", "Really? That's wonderful news. They've been together for years.", "واقعاً؟ خبر فوق‌العاده‌ایه. سال‌هاست با هم هستند."),
            d("A", "Five years, I think. Since university.", "فکر می‌کنم پنج سال. از دانشگاه."),
            d("B", "What's their secret, do you think?", "فکر می‌کنی رازشون چیه؟"),
            d("A", "They communicate well. Tom's the kind of person who always listens.", "خوب ارتباط برقرار می‌کنند. تام از آن آدم‌هایی‌ست که همیشه گوش می‌دهد."),
            d("B", "And Anna is very supportive. She's the one who encouraged him to change careers.", "و آنا خیلی حمایتگره. او کسی‌ست که تشویقش کرد شغلش را عوض کند."),
            d("A", "Right. Do you think they'll have a big wedding?", "درسته. فکر می‌کنی عروسی بزرگی خواهند داشت؟"),
            d("B", "Probably not. They're not the kind of couple that enjoys big ceremonies.", "احتمالاً نه. از آن زوج‌هایی نیستند که مراسم بزرگ دوست داشته باشند."),
            d("A", "That sounds sensible. Weddings are so expensive.", "منطقی به نظر می‌رسد. عروسی‌ها خیلی گرانند."),
            d("B", "Tell me about it. My cousin spent a fortune on hers.", "بگو برام. پسرخاله‌ام ثروتی روی عروسی‌اش خرج کرد."),
            d("A", "Do you think marriage is still important today?", "فکر می‌کنی ازدواج هنوز امروز مهم است؟"),
            d("B", "For some people, yes. For others, a commitment is enough.", "برای بعضی‌ها بله. برای دیگران، تعهد کافیه."),
            d("A", "I agree. It's a personal choice.", "موافقم. انتخاب شخصی‌ست."),
            d("B", "Exactly. What matters is that they're happy.", "دقیقاً. مهم اینه که خوشحال باشند."),
            d("A", "Well said. I'm going to send them a card.", "خوب گفتی. برایشان کارت می‌فرستم."),
            d("B", "Me too. Let's sign it together.", "من هم. بیا با هم امضا کنیم.")
        ),
        listOf(
            q("How long have Tom and Anna been together?", listOf("2 years", "5 years", "10 years"), 1),
            q("Why are they a good couple?", listOf("money", "communication", "looks"), 1),
            q("He's the man ___ always listens.", listOf("which", "who", "whose"), 1),
            q("My brother, ___ lives in Paris, is a chef.", listOf("who", "which", "whose"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Tell me about it", "بگو برام (موافقم)", "Tell me about it.", "بگو برام."),
            IdiomExpression("Spend a fortune", "ثروتی خرج کردن", "She spent a fortune.", "او ثروتی خرج کرد.")
        ),
        pron = listOf(PronunciationTip("Relative clauses", "No pause in defining clauses. Pause for commas in non-defining.")),
        cult = listOf(CulturalNote("Marriage trends", "In many Western countries, people marry later. In some cultures, marriage is still expected early.")),
        mis = listOf(
            CommonMistake("The man which I met.", "The man who I met.", "Who for people."),
            CommonMistake("My brother, that lives in Paris.", "My brother, who lives in Paris.", "Use 'who' with commas.")
        )
    )

    private fun f6B() = base(27, "6B Friendship", "۶B دوستی",
        listOf("Use gerunds and infinitives after prepositions", "Talk about friendship", "Describe qualities of a good friend"),
        listOf(
            v("loyal", "وفادار", "A loyal friend.", "دوست وفادار.", "adjective"),
            v("trustworthy", "قابل اعتماد", "A trustworthy person.", "فرد قابل اعتماد.", "adjective"),
            v("rely on", "تکیه کردن به", "I can rely on her.", "می‌توانم بهش تکیه کنم.", "verb"),
            v("get on with", "کنار آمدن با", "I get on with everyone.", "با همه کنار می‌آیم.", "verb"),
            v("fall out", "دعوا کردن", "They fell out over money.", "سر پول دعوا کردند.", "verb"),
            v("keep in touch", "در تماس بودن", "We keep in touch online.", "آنلاین در تماسیم.", "verb"),
            v("drift apart", "از هم دور شدن", "We drifted apart after school.", "بعد از مدرسه از هم دور شدیم.", "verb"),
            v("bond", "پیوند", "A strong bond.", "پیوند قوی."),
            v("hang out", "وقت گذراندن", "We hang out every weekend.", "هر آخر هفته وقت می‌گذرانیم.", "verb"),
            v("catch up", "خبر گرفتن", "Let's catch up soon.", "به‌زودی خبر بگیریم.", "verb")
        ),
        listOf(
            GrammarSection("Gerund after prepositions", "good at listening, interested in meeting, tired of arguing."),
            GrammarSection("Infinitive after adjectives", "happy to help, easy to talk to, hard to find."),
            GrammarSection("Preposition + gerund", "I'm thinking of moving. She's keen on travelling.")
        ),
        listOf(
            d("A", "How long have you known your best friend?", "چند وقته بهترین دوستت را می‌شناسی؟"),
            d("B", "Since primary school. Almost thirty years now.", "از دبستان. الان تقریباً سی سال."),
            d("A", "That's impressive. What's the secret to a long friendship?", "تحسین‌برانگیزه. راز یک دوستی طولانی چیه؟"),
            d("B", "I think it's about being interested in staying in touch.", "فکر می‌کنم در مورد علاقه به حفظ ارتباط است."),
            d("A", "True. It's easy to drift apart when life gets busy.", "درسته. وقتی زندگی شلوغ می‌شه راحت از هم دور می‌شویم."),
            d("B", "Exactly. But we're good at making time for each other.", "دقیقاً. ولی ما در وقت گذاشتن برای هم خوبیم."),
            d("A", "What qualities do you value most in a friend?", "چه ویژگی‌هایی را بیشتر در یک دوست ارزش می‌گذاری؟"),
            d("B", "Loyalty, definitely. And being trustworthy — that's the most important thing.", "وفاداری، قطعاً. و قابل اعتماد بودن — این مهم‌ترین چیزه."),
            d("A", "Have you ever fallen out with a close friend?", "هرگز با دوست نزدیکی دعوا کرده‌ای؟"),
            d("B", "Once, over something silly. We didn't speak for a year.", "یک بار، سر چیز احمقانه‌ای. یک سال حرف نزدیم."),
            d("A", "How did you make up?", "چطور آشتی کردید؟"),
            d("B", "I apologised. It was hard, but worth it. We're closer than ever now.", "عذرخواهی کردم. سخت بود، ولی ارزشش را داشت. الان از همیشه نزدیک‌تریم."),
            d("A", "That's a great story. Do you think friendships change over time?", "داستان عالی‌ایه. فکر می‌کنی دوستی‌ها با زمان تغییر می‌کنند؟"),
            d("B", "Of course. Life changes, and so do we. Some friendships end, others grow.", "البته. زندگی تغییر می‌کند، و ما هم. بعضی دوستی‌ها تمام می‌شوند، بعضی رشد می‌کنند."),
            d("A", "Very true. What are you doing this weekend?", "خیلی درسته. این آخر هفته چیکار می‌کنی؟"),
            d("B", "Hanging out with my old friend. We always meet on Saturdays.", "با دوست قدیمی‌ام وقت می‌گذرانم. همیشه شنبه‌ها ملاقات می‌کنیم."),
            d("A", "Nice. Enjoy it!", "خوبه. لذت ببر!")
        ),
        listOf(
            q("How long have they been friends?", listOf("10 years", "20 years", "almost 30 years"), 2),
            q("What quality matters most?", listOf("funny", "trustworthy", "rich"), 1),
            q("We're good ___ making time.", listOf("at", "in", "on"), 0),
            q("I'm thinking of ___.", listOf("move", "moving", "to move"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Drift apart", "از هم دور شدن", "We drifted apart.", "از هم دور شدیم."),
            IdiomExpression("Fall out with", "دعوا کردن با", "I fell out with him.", "با او دعوا کردم."),
            IdiomExpression("Make up", "آشتی کردن", "We made up quickly.", "سریع آشتی کردیم.")
        ),
        pron = listOf(PronunciationTip("Preposition + gerund", "Listen to the link: good AT helping, thinking OF moving.")),
        cult = listOf(CulturalNote("Friendship norms", "In some cultures, friendships last a lifetime. In more mobile societies, people have different friends at different stages.")),
        mis = listOf(
            CommonMistake("I'm good at listen.", "I'm good at listening.", "Preposition + gerund."),
            CommonMistake("I'm interested in meet you.", "I'm interested in meeting you.", "Preposition + gerund.")
        )
    )

    private fun f6C() = base(28, "6C Family dynamics", "۶C روابط خانوادگی",
        listOf("Use comparatives with 'the'", "Talk about family relationships", "Discuss generational differences"),
        listOf(
            v("sibling", "خواهر و برادر", "I have three siblings.", "سه خواهر و برادر دارم."),
            v("generation gap", "شکاف نسلی", "A growing generation gap.", "شکاف نسلی در حال رشد."),
            v("strict", "سختگیر", "Strict parents.", "والدین سختگیر.", "adjective"),
            v("lenient", "آسان‌گیر", "Lenient rules.", "قوانین آسان.", "adjective"),
            v("upbringing", "تربیت", "A strict upbringing.", "تربیت سختگیرانه."),
            v("close-knit", "نزدیک", "A close-knit family.", "خانواده نزدیک.", "adjective"),
            v("rebellious", "سرکش", "A rebellious teenager.", "نوجوان سرکش.", "adjective"),
            v("obedient", "مطیع", "An obedient child.", "کودک مطیع.", "adjective"),
            v("nurture", "پرورش دادن", "Nurture talent.", "استعداد را پرورش بده.", "verb"),
            v("spoil", "لوس کردن", "Don't spoil the children.", "بچه‌ها را لوس نکن.", "verb")
        ),
        listOf(
            GrammarSection("The + comparative, the + comparative", "The older I get, the more I understand my parents."),
            GrammarSection("Comparatives with 'the'", "The more you practise, the better you get. The sooner, the better."),
            GrammarSection("Double comparatives", "more and more, less and less, better and better.")
        ),
        listOf(
            d("A", "Do you come from a big family?", "از خانواده بزرگی می‌آیی؟"),
            d("B", "Yes, I have three siblings. Two sisters and a brother.", "بله، سه خواهر و برادر دارم. دو خواهر و یک برادر."),
            d("A", "That must have been fun growing up.", "باید در بزرگ شدن سرگرم‌کننده بوده."),
            d("B", "It was. Also noisy! The more children, the more chaos.", "بود. همچنین پر سر و صدا! هرچی بچه بیشتر، آشفتگی بیشتر."),
            d("A", "Were your parents strict?", "والدینت سختگیر بودند؟"),
            d("B", "Not really. They were quite lenient. The older they got, the more relaxed they became.", "نه زیاد. کاملاً آسان‌گیر بودند. هرچی بزرگ‌تر شدند، آرام‌تر شدند."),
            d("A", "Interesting. My parents were the opposite.", "جالب. والدین من برعکس بودند."),
            d("B", "Really? In what way?", "واقعاً؟ از چه نظر؟"),
            d("A", "They were very strict. The stricter they were, the more rebellious I became.", "خیلی سختگیر بودند. هرچی سختگیرتر بودند، من سرکش‌تر شدم."),
            d("B", "That's a classic pattern. Do you think it affected your relationship?", "این یک الگوی کلاسیکه. فکر می‌کنی روی رابطه‌تان تأثیر گذاشت؟"),
            d("A", "For a while. But the older I get, the more I understand their reasons.", "برای مدتی. ولی هرچی بزرگ‌تر می‌شم، دلایلشان را بیشتر می‌فهمم."),
            d("B", "That's mature of you. Do you have a good relationship now?", "این بالغانه‌ست. الان رابطه خوبی دارید؟"),
            d("A", "Yes, much better. We're a close-knit family now.", "بله، خیلی بهتر. الان خانواده نزدیکی هستیم."),
            d("B", "Same here. Nothing beats family.", "من هم همین. هیچ چیز به پای خانواده نمی‌رسد."),
            d("A", "Absolutely. Are you close to your siblings?", "قطعاً. با خواهر و برادرانت نزدیکی؟"),
            d("B", "Very. The more time passes, the closer we get.", "خیلی. هرچی زمان می‌گذرد، نزدیک‌تر می‌شویم.")
        ),
        listOf(
            q("How many siblings does B have?", listOf("two", "three", "four"), 1),
            q("Why did A become rebellious?", listOf("strict parents", "lenient parents", "money"), 0),
            q("The ___, the better.", listOf("soon", "sooner", "soonest"), 1),
            q("The more you ___, the better you get.", listOf("practise", "practising", "practised"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Nothing beats family", "هیچ چیز به پای خانواده نمی‌رسد", "Nothing beats family.", "هیچ چیز به پای خانواده نمی‌رسد."),
            IdiomExpression("Close-knit", "نزدیک", "A close-knit family.", "خانواده نزدیک.")
        ),
        pron = listOf(PronunciationTip("The + comparative", "Stress both comparatives: The MORE you practise, the BETter you get.")),
        cult = listOf(CulturalNote("Family structures", "In Mediterranean and Latin cultures, families are often close-knit. In Northern Europe and the US, independence is emphasised earlier.")),
        mis = listOf(
            CommonMistake("The more you practise, the better you will get.", "The more you practise, the better you get.", "Both clauses use present simple."),
            CommonMistake("The soon, the better.", "The sooner, the better.", "Use comparative form.")
        )
    )

    // ═══════════ FILE 7 — Sports and fitness ═══════════

    private fun f7A() = base(29, "7A The Olympic Games", "۷A بازی‌های المپیک",
        listOf("Use the passive voice", "Talk about sports and achievements", "Use present and past passive"),
        listOf(
            v("athlete", "ورزشکار", "A professional athlete.", "ورزشکار حرفه‌ای."),
            v("compete", "رقابت کردن", "Athletes compete every four years.", "ورزشکاران هر چهار سال رقابت می‌کنند.", "verb"),
            v("medal", "مدال", "Win a gold medal.", "مدال طلا ببر."),
            v("championship", "قهرمانی", "World championship.", "قهرمانی جهان."),
            v("host", "میزبان", "Host the games.", "بازی‌ها را میزبانی کن.", "verb"),
            v("ceremony", "مراسم", "The opening ceremony.", "مراسم افتتاحیه."),
            v("record", "رکورد", "Break a record.", "رکورد بشکن."),
            v("train", "تمرین کردن", "Train for years.", "سال‌ها تمرین کن.", "verb"),
            v("sacrifice", "فداکاری", "Make sacrifices.", "فداکاری کن.", "verb"),
            v("glory", "افتخار", "A moment of glory.", "لحظه افتخار.")
        ),
        listOf(
            GrammarSection("Present passive", "The Olympic Games are held every four years. Athletes are chosen carefully."),
            GrammarSection("Past passive", "The first modern Olympics were held in Athens in 1896. The stadium was built specially."),
            GrammarSection("Passive with modals", "Records can be broken. Athletes must be trained. The games should be held fairly.")
        ),
        listOf(
            d("A", "Are you watching the Olympics?", "المپیک را تماشا می‌کنی؟"),
            d("B", "Of course! I watch them every time they're held.", "البته! هر بار برگزار می‌شوند تماشا می‌کنم."),
            d("A", "Do you know much about the history?", "از تاریخش زیاد می‌دانی؟"),
            d("B", "A bit. The first modern games were held in Athens in 1896.", "کمی. اولین بازی‌های مدرن در ۱۸۹۶ در آتن برگزار شد."),
            d("A", "And the ancient ones?", "و باستانی‌ها؟"),
            d("B", "They were held in Olympia, in Greece, for over a thousand years.", "بیش از هزار سال در المپیا، در یونان، برگزار می‌شدند."),
            d("A", "Amazing. How are the host cities chosen?", "شگفت‌انگیزه. شهرهای میزبان چطور انتخاب می‌شوند؟"),
            d("B", "They're selected by the International Olympic Committee, after a long process.", "توسط کمیته بین‌المللی المپیک، بعد از فرآیندی طولانی، انتخاب می‌شوند."),
            d("A", "Is it worth it? It costs billions.", "ارزشش را دارد؟ میلیاردها هزینه دارد."),
            d("B", "That's debated. The benefits can be exaggerated by politicians.", "بحث‌برانگیزه. مزایا ممکن است توسط سیاستمداران اغراق شود."),
            d("A", "What's your favourite event?", "رویداد مورد علاقه‌ات چیست؟"),
            d("B", "The 100-metre final. Records are often broken there.", "فینال ۱۰۰ متر. رکوردها اغلب آنجا شکسته می‌شوند."),
            d("A", "I love the swimming events myself.", "من خودم عاشق رویدادهای شنا هستم."),
            d("B", "Those are amazing too. So much sacrifice is made by the athletes.", "آن‌ها هم شگفت‌انگیزند. فداکاری زیادی توسط ورزشکاران انجام می‌شود."),
            d("A", "Definitely. They train for years just for one moment.", "قطعاً. سال‌ها فقط برای یک لحظه تمرین می‌کنند."),
            d("B", "That's what makes it so inspiring.", "این چیزی‌ست که آن را الهام‌بخش می‌کند.")
        ),
        listOf(
            q("When were the first modern Olympics held?", listOf("1896", "1900", "1912"), 0),
            q("Where were ancient games held?", listOf("Athens", "Olympia", "Sparta"), 1),
            q("The Games ___ held every four years.", listOf("are", "is", "were"), 0),
            q("The first games ___ held in Athens.", listOf("are", "were", "have"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Worth it", "ارزشش را داشتن", "Is it worth it?", "ارزشش را دارد؟"),
            IdiomExpression("Break a record", "رکورد شکستن", "She broke the world record.", "رکورد جهانی را شکست.")
        ),
        pron = listOf(PronunciationTip("Passive voice", "Focus on the past participle: The games were HELD. The city was CHOSEN.")),
        cult = listOf(CulturalNote("Olympic history", "The ancient Olympics were religious festivals. The modern games were revived in 1896 by Pierre de Coubertin.")),
        mis = listOf(
            CommonMistake("The games are hold every four years.", "The games are held every four years.", "Use past participle."),
            CommonMistake("The games was held in Athens.", "The games were held in Athens.", "Plural subject.")
        )
    )

    private fun f7B() = base(30, "7B Extreme sports", "۷B ورزش‌های خطرناک",
        listOf("Use so / such... that", "Talk about extreme sports", "Express cause and result"),
        listOf(
            v("extreme", "خطرناک", "Extreme sports.", "ورزش‌های خطرناک.", "adjective"),
            v("risky", "پرخطر", "A risky activity.", "فعالیت پرخطر.", "adjective"),
            v("adrenaline", "آدرنالین", "The adrenaline rush.", "هجوم آدرنالین."),
            v("breathtaking", "نفس‌گیر", "A breathtaking view.", "منظره نفس‌گیر.", "adjective"),
            v("terrifying", "وحشتناک", "A terrifying experience.", "تجربه وحشتناک.", "adjective"),
            v("daring", "جسورانه", "A daring jump.", "پرش جسورانه.", "adjective"),
            v("equipment", "تجهیزات", "Safety equipment.", "تجهیزات ایمنی."),
            v("endangered", "به خطر افتاده", "Endangered species.", "گونه‌های در خطر.", "adjective"),
            v("courage", "شجاعت", "Show courage.", "شجاعت نشان بده."),
            v("accomplish", "به انجام رساندن", "Accomplish a goal.", "به هدفی برس.", "verb")
        ),
        listOf(
            GrammarSection("So + adjective + that", "It was so dangerous that only experts tried it."),
            GrammarSection("Such + noun + that", "It was such a scary jump that I closed my eyes."),
            GrammarSection("So much / so many", "So much adrenaline, so many risks.")
        ),
        listOf(
            d("A", "Would you ever try an extreme sport?", "هرگز ورزش خطرناکی امتحان می‌کردی؟"),
            d("B", "I'm not sure. Some of them are so dangerous that I'd be terrified.", "مطمئن نیستم. بعضی‌هاشون آنقدر خطرناکند که وحشت می‌کنم."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Base jumping, for example. It's such a risky activity that even experienced skydivers avoid it.", "مثلاً پرش پایه. آنقدر فعالیت پرخطری‌ست که حتی چتربازهای با تجربه از آن اجتناب می‌کنند."),
            d("A", "I've seen videos. The views are breathtaking, though.", "ویدیوها را دیده‌ام. هرچند منظره‌ها نفس‌گیرند."),
            d("B", "Absolutely. There's so much adrenaline that some people get addicted.", "قطعاً. آنقدر آدرنالین هست که بعضی معتاد می‌شوند."),
            d("A", "What about less dangerous options?", "گزینه‌های کم‌خطرتر چطور؟"),
            d("B", "Rock climbing is safer if you use proper equipment.", "صخره‌نوردی امن‌تر است اگر از تجهیزات مناسب استفاده کنی."),
            d("A", "Have you ever tried it?", "هرگز امتحان کرده‌ای؟"),
            d("B", "Once. It was such a thrilling experience that I've wanted to do it again.", "یک بار. آنقدر تجربه هیجان‌انگیزی بود که خواسته‌ام دوباره انجامش دهم."),
            d("A", "What stopped you?", "چه چیزی مانعت شد؟"),
            d("B", "Time, mostly. And it's so expensive that I can only do it occasionally.", "بیشتر وقت. و آنقدر گران است که فقط گاهی می‌توانم انجامش دهم."),
            d("A", "Do you think extreme sports are worth the risk?", "فکر می‌کنی ورزش‌های خطرناک ارزش ریسک را دارند؟"),
            d("B", "For some people, yes. It gives them such a sense of accomplishment.", "برای بعضی‌ها بله. به آن‌ها چنان حس موفقیتی می‌دهد."),
            d("A", "I understand. We all need a challenge.", "می‌فهمم. همه ما به چالش نیاز داریم."),
            d("B", "Exactly. And sometimes, that courage helps you in other parts of life.", "دقیقاً. و گاهی، آن شجاعت در بخش‌های دیگر زندگی کمکت می‌کند.")
        ),
        listOf(
            q("Which sport does B mention first?", listOf("rock climbing", "base jumping", "skydiving"), 1),
            q("Has B tried rock climbing?", listOf("yes", "no", "twice"), 0),
            q("It was ___ dangerous that I was terrified.", listOf("such", "so", "very"), 1),
            q("It was ___ a risky activity.", listOf("so", "such", "very"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Adrenaline rush", "هجوم آدرنالین", "The adrenaline rush is addictive.", "هجوم آدرنالین اعتیادآور است."),
            IdiomExpression("Worth the risk", "ارزش ریسک را داشتن", "Is it worth the risk?", "ارزش ریسک را دارد؟")
        ),
        pron = listOf(PronunciationTip("So / Such", "Stress 'so': It's SO dangerous. Stress 'such': It's SUCH a risk.")),
        cult = listOf(CulturalNote("Extreme sports", "Popular in Australia, New Zealand, and California. Some countries regulate them more strictly.")),
        mis = listOf(
            CommonMistake("It was so a dangerous sport.", "It was such a dangerous sport.", "Such + a + adjective + noun."),
            CommonMistake("It was such dangerous.", "It was so dangerous.", "So + adjective alone.")
        )
    )

    private fun f7C() = base(31, "7C A healthy lifestyle", "۷C سبک زندگی سالم",
        listOf("Use quantifiers", "Talk about health and lifestyle", "Give advice about health"),
        listOf(
            v("balanced", "متعادل", "A balanced diet.", "رژیم متعادل.", "adjective"),
            v("nutritious", "مغذی", "Nutritious food.", "غذای مغذی.", "adjective"),
            v("processed", "فرآوری شده", "Processed food.", "غذای فرآوری شده.", "adjective"),
            v("portion", "بخش", "Small portions.", "بخش‌های کوچک."),
            v("work out", "ورزش کردن", "Work out three times a week.", "هفته‌ای سه بار ورزش کن.", "verb"),
            v("cut down on", "کم کردن", "Cut down on sugar.", "شکر را کم کن.", "verb"),
            v("give up", "ترک کردن", "Give up smoking.", "سیگار را ترک کن.", "verb"),
            v("stay hydrated", "آب کافی خوردن", "Stay hydrated.", "آب کافی بخور.", "verb"),
            v("cut out", "حذف کردن", "Cut out fast food.", "فست‌فود را حذف کن.", "verb"),
            v("well-being", "سلامتی", "Mental well-being.", "سلامتی روانی.")
        ),
        listOf(
            GrammarSection("Quantifiers", "a lot of, much, many, a few, a little, too much, too many, enough."),
            GrammarSection("Countable vs uncountable", "How much sugar? How many vegetables?"),
            GrammarSection("Enough", "I don't get enough sleep. I eat too much salt.")
        ),
        listOf(
            d("A", "Do you consider yourself healthy?", "خودت را سالم می‌دانی؟"),
            d("B", "Reasonably. I exercise a lot, but I eat too much sugar.", "نسبتاً. زیاد ورزش می‌کنم، ولی شکر زیاد می‌خورم."),
            d("A", "How often do you work out?", "چند وقت یکبار ورزش می‌کنی؟"),
            d("B", "About four times a week. I try to stay active.", "حدود چهار بار در هفته. سعی می‌کنم فعال بمانم."),
            d("A", "That's good. What about your diet?", "خوبه. رژیم غذایی‌ات چطور؟"),
            d("B", "It could be better. I eat too many processed foods.", "می‌تواند بهتر باشد. غذای فرآوری شده زیاد می‌خورم."),
            d("A", "Do you get enough vegetables?", "سبزیجات کافی می‌خوری؟"),
            d("B", "Not really. I have a few portions a day, but I should have more.", "نه زیاد. چند بخش در روز می‌خورم، ولی باید بیشتر بخورم."),
            d("A", "What about water?", "آب چطور؟"),
            d("B", "I drink plenty. Staying hydrated is one thing I do well.", "زیاد می‌نوشم. آب کافی خوردن یکی از کارهایی است که خوب انجام می‌دهم."),
            d("A", "Any bad habits?", "عادت بدی؟"),
            d("B", "I used to smoke, but I gave it up two years ago.", "قبلاً سیگار می‌کشیدم، ولی دو سال پیش ترک کردم."),
            d("A", "That's impressive. How did you do it?", "تحسین‌برانگیزه. چطور انجامش دادی؟"),
            d("B", "I cut down gradually. First fewer cigarettes, then none.", "تدریجاً کم کردم. اول سیگار کمتر، بعد هیچ."),
            d("A", "Smart approach. Do you feel healthier now?", "رویکرد هوشمندانه‌ای. الان سالم‌تر حس می‌کنی؟"),
            d("B", "Much. My energy levels improved a lot.", "خیلی. سطح انرژی‌ام خیلی بهتر شده.")
        ),
        listOf(
            q("How often does B work out?", listOf("2 times", "4 times", "6 times"), 1),
            q("When did B give up smoking?", listOf("last year", "two years ago", "five years ago"), 1),
            q("I eat ___ too much sugar.", listOf("much", "many", "few"), 0),
            q("I should eat ___ vegetables.", listOf("much", "more", "many"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Cut down on", "کم کردن", "Cut down on sugar.", "شکر را کم کن."),
            IdiomExpression("Give up", "ترک کردن", "Give up smoking.", "سیگار را ترک کن.")
        ),
        pron = listOf(PronunciationTip("Quantifiers", "Stress the quantity: TOO much, ENOUGH sleep, A FEW portions.")),
        cult = listOf(CulturalNote("Healthy living", "In Japan, 'Hara hachi bu' means eating until 80% full. In the Mediterranean, olive oil and fish are staples.")),
        mis = listOf(
            CommonMistake("I eat too much vegetables.", "I eat too many vegetables.", "Countable = many."),
            CommonMistake("I don't drink enough of water.", "I don't drink enough water.", "No 'of' with 'enough'.")
        )
    )

    // ═══════════ FILE 8 — Technology ═══════════

    private fun f8A() = base(32, "8A Social media", "۸A شبکه‌های اجتماعی",
        listOf("Use gerunds and infinitives", "Talk about social media", "Express opinions"),
        listOf(
            v("post", "پست کردن", "Post a photo.", "عکس پست کن.", "verb"),
            v("scroll", "اسکرول کردن", "Scroll through the feed.", "فید را اسکرول کن.", "verb"),
            v("follower", "دنبال‌کننده", "Millions of followers.", "میلیون‌ها دنبال‌کننده."),
            v("influencer", "اینفلوئنسر", "A social media influencer.", "اینفلوئنسر شبکه اجتماعی."),
            v("addictive", "اعتیادآور", "Social media is addictive.", "شبکه‌های اجتماعی اعتیادآورند.", "adjective"),
            v("cyberbullying", "قلدری اینترنتی", "Cyberbullying is a serious problem.", "قلدری اینترنتی مشکل جدی‌ست."),
            v("privacy", "حریم خصوصی", "Protect your privacy.", "حریم خصوصی‌ات را حفظ کن."),
            v("fake", "جعلی", "Fake news.", "اخبار جعلی.", "adjective"),
            v("engage", "درگیر شدن", "Engage with content.", "با محتوا درگیر شو.", "verb"),
            v("platform", "پلتفرم", "A popular platform.", "پلتفرم محبوب.")
        ),
        listOf(
            GrammarSection("Gerund as subject", "Scrolling for hours is a waste of time."),
            GrammarSection("Verbs + gerund/infinitive", "avoid posting, decide to delete, keep checking, forget to reply."),
            GrammarSection("Preposition + gerund", "interested in following, good at creating, tired of scrolling.")
        ),
        listOf(
            d("A", "How much time do you spend on social media?", "چقدر وقت در شبکه‌های اجتماعی می‌گذرانی؟"),
            d("B", "Too much, honestly. I keep telling myself to cut down.", "راستش خیلی زیاد. مدام به خودم می‌گویم کم کنم."),
            d("A", "What do you usually do on it?", "معمولاً چیکار می‌کنی؟"),
            d("B", "I scroll through Instagram and Twitter. It's so addictive.", "اینستاگرام و توییتر را اسکرول می‌کنم. خیلی اعتیادآوره."),
            d("A", "Have you ever tried deleting the apps?", "هرگز سعی کردی اپ‌ها را حذف کنی؟"),
            d("B", "Once, for a week. But I ended up reinstalling them.", "یک بار، برای یک هفته. ولی در نهایت دوباره نصبشان کردم."),
            d("A", "Why?", "چرا؟"),
            d("B", "I missed staying connected with my friends. It's hard to avoid using it.", "دلم برای ارتباط با دوستانم تنگ شد. سخت است از استفاده‌اش اجتناب کنم."),
            d("A", "Do you think it has more benefits or drawbacks?", "فکر می‌کنی مزایای بیشتری دارد یا معایب؟"),
            d("B", "Both. It's great for keeping in touch, but it's also full of fake news.", "هر دو. برای در تماس ماندن عالیه، ولی پر از اخبار جعلی هم هست."),
            d("A", "True. Have you ever been affected by cyberbullying?", "درسته. هرگز تحت تأثیر قلدری اینترنتی قرار گرفته‌ای؟"),
            d("B", "Not personally, but I've seen it happen. It's a serious issue.", "شخصاً نه، ولی دیده‌ام اتفاق بیفتد. مسئله جدی‌ایه."),
            d("A", "Do you worry about privacy?", "نگران حریم خصوصی هستی؟"),
            d("B", "A bit. I've stopped posting personal information.", "کمی. پست کردن اطلاعات شخصی را متوقف کرده‌ام."),
            d("A", "That's wise. Do you think you'll ever quit?", "عاقلانه‌ست. فکر می‌کنی هرگز ترک کنی؟"),
            d("B", "Probably not. But I'm trying to use it more mindfully.", "احتمالاً نه. ولی سعی می‌کنم آگاهانه‌تر استفاده کنم."),
            d("A", "That's a good balance.", "تعادل خوبی‌ست.")
        ),
        listOf(
            q("What does B do on social media?", listOf("post photos", "scroll", "chat"), 1),
            q("Has B ever deleted the apps?", listOf("never", "once", "many times"), 1),
            q("I keep ___ myself to cut down.", listOf("tell", "telling", "to tell"), 1),
            q("I've stopped ___ personal information.", listOf("post", "posting", "to post"), 1)
        ),
        idioms = listOf(
            IdiomExpression("End up", "در نهایت انجام دادن", "I ended up reinstalling them.", "در نهایت دوباره نصبشان کردم."),
            IdiomExpression("Cut down", "کم کردن", "I should cut down.", "باید کم کنم.")
        ),
        pron = listOf(PronunciationTip("Gerund", "The -ing ending is often reduced: postin', scrollin', doin'.")),
        cult = listOf(CulturalNote("Social media use", "Different platforms dominate in different countries. WeChat in China, Line in Japan, WhatsApp in Latin America.")),
        mis = listOf(
            CommonMistake("I stopped to post personal info.", "I stopped posting personal info.", "Stop + gerund = quit. Stop + infinitive = pause to do."),
            CommonMistake("I keep to tell myself.", "I keep telling myself.", "Keep + gerund.")
        )
    )

    private fun f8B() = base(33, "8B Digital detox", "۸B پاک‌سازی دیجیتال",
        listOf("Use used to and would for past habits", "Talk about technology in the past", "Discuss digital habits"),
        listOf(
            v("detox", "پاک‌سازی", "A digital detox.", "پاک‌سازی دیجیتال."),
            v("device", "دستگاه", "Electronic devices.", "دستگاه‌های الکترونیکی."),
            v("notification", "اعلان", "Turn off notifications.", "اعلان‌ها را خاموش کن."),
            v("screen time", "زمان صفحه", "Reduce screen time.", "زمان صفحه را کاهش بده."),
            v("unplug", "قطع کردن", "Unplug for a weekend.", "برای آخر هفته قطع کن.", "verb"),
            v("mindful", "آگاه", "Mindful use of technology.", "استفاده آگاهانه از فناوری.", "adjective"),
            v("distracted", "حواس‌پرت", "Always distracted by my phone.", "همیشه حواسم با موبایلم پرت است.", "adjective"),
            v("productivity", "بهره‌وری", "Increase productivity.", "بهره‌وری را افزایش بده."),
            v("reconnect", "دوباره ارتباط برقرار کردن", "Reconnect with nature.", "دوباره با طبیعت ارتباط برقرار کن.", "verb"),
            v("downtime", "زمان استراحت", "Needing downtime.", "نیاز به زمان استراحت.")
        ),
        listOf(
            GrammarSection("Used to + infinitive", "I used to check my phone every minute. She used to read books instead."),
            GrammarSection("Would for past habits", "We would play outside all day. On Sundays, we would visit our grandparents."),
            GrammarSection("Contrast with present", "I used to have more free time. Now I'm always busy.")
        ),
        listOf(
            d("A", "Do you ever feel you spend too much time on your phone?", "هرگز حس می‌کنی وقت زیادی روی موبایلت می‌گذرانی؟"),
            d("B", "Constantly. I used to be much better at managing it.", "مدام. قبلاً در مدیریتش خیلی بهتر بودم."),
            d("A", "What changed?", "چی عوض شد؟"),
            d("B", "Work. I used to leave my phone at home when I went out. Now I check it every minute.", "کار. قبلاً وقتی بیرون می‌رفتم موبایلم را خانه می‌گذاشتم. الان هر دقیقه چکش می‌کنم."),
            d("A", "Have you tried a digital detox?", "پاک‌سازی دیجیتال امتحان کرده‌ای؟"),
            d("B", "I did one last month, actually. For three days I unplugged completely.", "ماه پیش یکی انجام دادم، در واقع. سه روز کاملاً قطع کردم."),
            d("A", "How did it feel?", "چه حسی داشت؟"),
            d("B", "Strange at first. I kept reaching for my phone out of habit. But by day two, I felt calmer.", "اولش عجیب بود. از روی عادت مدام دستم به سمت موبایل می‌رفت. ولی روز دوم آرام‌تر شدم."),
            d("A", "Did you get more done?", "کارهای بیشتری انجام دادی؟"),
            d("B", "Much more. My productivity went up, and I reconnected with things I used to love.", "خیلی بیشتر. بهره‌وری‌ام بالا رفت، و با چیزهایی که قبلاً دوست داشتم دوباره ارتباط برقرار کردم."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Reading, mostly. I used to read a book every week. I hadn't finished one in months.", "بیشتر کتاب خواندن. قبلاً هر هفته یک کتاب می‌خواندم. ماه‌ها بود یکی را تمام نکرده بودم."),
            d("A", "That's a great outcome. Would you do it again?", "نتیجه عالی‌ایه. دوباره انجامش می‌دادی؟"),
            d("B", "Definitely. I'm thinking of having a phone-free Sunday every week.", "قطعاً. دارم به یکشنبه بدون موبایل هر هفته فکر می‌کنم."),
            d("A", "What would you do instead?", "به جایش چیکار می‌کردی؟"),
            d("B", "When I was a kid, we would go for long walks on Sundays. I'd like to bring that back.", "وقتی بچه بودم، یکشنبه‌ها پیاده‌روی‌های طولانی می‌رفتیم. دوست دارم آن را برگردانم."),
            d("A", "That sounds lovely. I might try it too.", "قشنگ به نظر می‌رسد. من هم شاید امتحان کنم."),
            d("B", "You should. It's amazing how much calmer you feel.", "باید امتحان کنی. شگفت‌انگیزه چقدر آرام‌تر حس می‌کنی.")
        ),
        listOf(
            q("How long did B's detox last?", listOf("one day", "three days", "one week"), 1),
            q("What did B used to do on Sundays?", listOf("read books", "long walks", "watch TV"), 1),
            q("I ___ check my phone every minute.", listOf("use to", "used to", "using to"), 1),
            q("We ___ play outside all day.", listOf("would", "will", "used"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Out of habit", "از روی عادت", "I did it out of habit.", "از روی عادت انجامش دادم."),
            IdiomExpression("Bring back", "برگرداندن", "I'd like to bring that back.", "دوست دارم آن را برگردانم.")
        ),
        pron = listOf(PronunciationTip("Used to / Would", "Used to reduces to /ˈjuːstə/. Would reduces to /wəd/ or /d/.")),
        cult = listOf(CulturalNote("Digital wellness", "A growing movement. Silicon Valley executives often limit their own children's screen time.")),
        mis = listOf(
            CommonMistake("I use to check my phone.", "I used to check my phone.", "Past: used to."),
            CommonMistake("I would have a Nokia phone.", "I used to have a Nokia phone.", "Would cannot express past states.")
        )
    )

    private fun f8C() = base(34, "8C AI and the future", "۸C هوش مصنوعی و آینده",
        listOf("Use future forms for predictions", "Talk about AI and technology", "Speculate about the future"),
        listOf(
            v("artificial intelligence", "هوش مصنوعی", "AI is transforming industries.", "هوش مصنوعی صنایع را متحول می‌کند."),
            v("algorithm", "الگوریتم", "A recommendation algorithm.", "الگوریتم پیشنهاد."),
            v("automate", "خودکار کردن", "Automate routine tasks.", "کارهای روتین را خودکار کن.", "verb"),
            v("replace", "جایگزین کردن", "Robots may replace workers.", "ربات‌ها ممکن است کارگران را جایگزین کنند.", "verb"),
            v("enhance", "بهبود دادن", "AI can enhance productivity.", "هوش مصنوعی می‌تواند بهره‌وری را بهبود دهد.", "verb"),
            v("unemployment", "بیکاری", "Rising unemployment.", "بیکاری در حال افزایش."),
            v("ethical", "اخلاقی", "Ethical concerns.", "نگرانی‌های اخلاقی.", "adjective"),
            v("bias", "سوگیری", "Algorithmic bias.", "سوگیری الگوریتمی."),
            v("innovative", "نوآورانه", "Innovative solutions.", "راه‌حل‌های نوآورانه.", "adjective"),
            v("adapt", "سازگار شدن", "Society must adapt.", "جامعه باید سازگار شود.", "verb")
        ),
        listOf(
            GrammarSection("Future predictions", "AI will change everything. It may replace some jobs. It might not happen quickly."),
            GrammarSection("Future continuous", "By 2030, we'll be working alongside AI."),
            GrammarSection("Future perfect", "By 2050, AI will have transformed most industries.")
        ),
        listOf(
            d("A", "Do you think AI will replace most jobs?", "فکر می‌کنی هوش مصنوعی بیشتر مشاغل را جایگزین خواهد کرد؟"),
            d("B", "Some jobs, definitely. But not all. The ones requiring creativity and empathy are safer.", "بعضی مشاغل، قطعاً. ولی نه همه. آن‌هایی که خلاقیت و همدلی می‌خواهند امن‌ترند."),
            d("A", "What kind of jobs are most at risk?", "چه نوع شغل‌هایی بیشتر در خطرند؟"),
            d("B", "Routine ones. Data entry, basic customer service, some manufacturing.", "کارهای روتین. ورود داده، خدمات مشتری پایه، بعضی تولیدات."),
            d("A", "What about doctors or teachers?", "پزشکان یا معلمان چطور؟"),
            d("B", "AI might enhance their work, but won't replace them. Human connection matters too much.", "هوش مصنوعی ممکن است کارشان را بهبود دهد، ولی جایگزینشان نمی‌شود. ارتباط انسانی خیلی مهم است."),
            d("A", "Do you think AI will create new jobs?", "فکر می‌کنی هوش مصنوعی شغل‌های جدیدی ایجاد می‌کند؟"),
            d("B", "Almost certainly. Every major technology shift has. But there'll be a transition period.", "تقریباً قطعاً. هر تغییر فناوری بزرگ این کار را کرده. ولی یک دوره گذار خواهد بود."),
            d("A", "What worries you most about AI?", "بیشترین نگرانی‌ات از هوش مصنوعی چیه؟"),
            d("B", "Bias, mostly. If the data is biased, the algorithms will be too.", "بیشتر سوگیری. اگر داده سوگیرانه باشد، الگوریتم‌ها هم خواهند بود."),
            d("A", "That's a serious concern. What about ethics?", "نگرانی جدی‌ایه. اخلاق چطور؟"),
            d("B", "We'll need new laws. By 2030, governments will have regulated AI much more heavily.", "به قوانین جدید نیاز خواهیم داشت. تا ۲۰۳۰، دولت‌ها هوش مصنوعی را خیلی شدیدتر تنظیم خواهند کرد."),
            d("A", "Do you think AI will make life better overall?", "فکر می‌کنی هوش مصنوعی زندگی را کلاً بهتر می‌کند؟"),
            d("B", "For most people, yes. Medical advances, better education, cleaner energy.", "برای بیشتر مردم، بله. پیشرفت‌های پزشکی، آموزش بهتر، انرژی پاک‌تر."),
            d("A", "But not for everyone?", "ولی نه برای همه؟"),
            d("B", "Probably not. Some people will be left behind if we don't plan carefully.", "احتمالاً نه. بعضی‌ها عقب می‌مانند اگر دقیق برنامه‌ریزی نکنیم."),
            d("A", "So what should we do?", "پس چیکار کنیم؟"),
            d("B", "Invest in education. The more people can adapt, the better off we'll all be.", "روی آموزش سرمایه‌گذاری کنیم. هرچی مردم بیشتر بتوانند سازگار شوند، همه بهتر خواهیم بود.")
        ),
        listOf(
            q("Which jobs are safest from AI?", listOf("data entry", "creative work", "manufacturing"), 1),
            q("What worries B most?", listOf("unemployment", "bias", "cost"), 1),
            q("By 2030, governments ___ have regulated AI more.", listOf("will", "would", "are"), 0),
            q("AI ___ replace some jobs.", listOf("may", "might to", "can to"), 0)
        ),
        idioms = listOf(
            IdiomExpression("At risk", "در خطر", "Some jobs are most at risk.", "بعضی مشاغل بیشتر در خطرند."),
            IdiomExpression("Left behind", "عقب مانده", "Some will be left behind.", "بعضی‌ها عقب می‌مانند."),
            IdiomExpression("Better off", "بهتر", "We'll all be better off.", "همه بهتر خواهیم بود.")
        ),
        pron = listOf(PronunciationTip("Future perfect", "By 2030, AI will have transFORMed. Stress 'have' weakly.")),
        cult = listOf(CulturalNote("AI regulation", "The EU passed the AI Act in 2024. The US and China have different approaches. Global cooperation is difficult.")),
        mis = listOf(
            CommonMistake("AI will replace most jobs, doesn't it?", "AI will replace most jobs, won't it?", "Question tag matches auxiliary."),
            CommonMistake("By 2030, they will regulate.", "By 2030, they will have regulated.", "Future perfect for completed action by a future time.")
        )
    )

    // ═══════════ FILE 9 — Environment ═══════════

    private fun f9A() = base(35, "9A Climate change", "۹A تغییرات اقلیمی",
        listOf("Use conditionals", "Talk about the environment", "Discuss solutions"),
        listOf(
            v("climate", "اقلیم", "Climate change.", "تغییر اقلیم."),
            v("emission", "انتشار", "Reduce emissions.", "انتشارها را کاهش بده."),
            v("renewable", "تجدیدپذیر", "Renewable energy.", "انرژی تجدیدپذیر.", "adjective"),
            v("fossil fuel", "سوخت فسیلی", "Burning fossil fuels.", "سوزاندن سوخت‌های فسیلی."),
            v("drought", "خشکسالی", "Severe drought.", "خشکسالی شدید."),
            v("flood", "سیل", "Massive floods.", "سیل‌های عظیم."),
            v("carbon footprint", "رد پای کربن", "Reduce your carbon footprint.", "رد پای کربن را کاهش بده."),
            v("global warming", "گرمایش جهانی", "Global warming is accelerating.", "گرمایش جهانی در حال تشدید است."),
            v("sustainable", "پایدار", "Sustainable solutions.", "راه‌حل‌های پایدار.", "adjective"),
            v("impact", "تأثیر", "Environmental impact.", "تأثیر زیست‌محیطی.")
        ),
        listOf(
            GrammarSection("First conditional", "If we don't act, temperatures will rise."),
            GrammarSection("Second conditional", "If I were in charge, I would ban fossil fuels."),
            GrammarSection("Third conditional", "If we had acted sooner, we wouldn't be in this situation.")
        ),
        listOf(
            d("A", "Do you think we can still stop climate change?", "فکر می‌کنی هنوز می‌توانیم تغییرات اقلیمی را متوقف کنیم؟"),
            d("B", "We can slow it, but not stop it. Some damage has already been done.", "می‌توانیم کندش کنیم، ولی متوقفش نه. بعضی آسیب‌ها قبلاً وارد شده."),
            d("A", "What should governments do?", "دولت‌ها چیکار باید بکنند؟"),
            d("B", "Invest in renewable energy. If they don't act now, it will be too late.", "روی انرژی تجدیدپذیر سرمایه‌گذاری کنند. اگر الان اقدام نکنند، خیلی دیر خواهد بود."),
            d("A", "What about individuals?", "افراد چطور؟"),
            d("B", "We all have a role. If everyone reduced their carbon footprint, it would make a difference.", "همه ما نقشی داریم. اگر همه رد پای کربنشان را کاهش دهند، تأثیر خواهد داشت."),
            d("A", "Is that really enough?", "واقعاً کافیه؟"),
            d("B", "Not enough alone. But if we had started thirty years ago, we wouldn't be in this crisis.", "به تنهایی کافی نیست. ولی اگر سی سال پیش شروع کرده بودیم، در این بحران نبودیم."),
            d("A", "That's depressing.", "افسرده‌کننده‌ست."),
            d("B", "It is. But it's not hopeless. Technology is improving fast.", "هست. ولی ناامیدکننده نیست. فناوری سریع در حال بهبود است."),
            d("A", "What gives you hope?", "چه چیزی بهت امید می‌دهد؟"),
            d("B", "Young people. They're more aware than any generation before.", "جوانان. آن‌ها از هر نسل قبل آگاه‌ترند."),
            d("A", "True. Do you think we'll solve it?", "درسته. فکر می‌کنی حلش می‌کنیم؟"),
            d("B", "I'm cautiously optimistic. If we work together, we can adapt.", "با احتیاط خوش‌بینم. اگر با هم کار کنیم، می‌توانیم سازگار شویم."),
            d("A", "Let's hope so. What can I do today?", "امیدواریم. امروز چیکار می‌توانم بکنم؟"),
            d("B", "Start small. Use less plastic, walk more, eat less meat.", "کوچک شروع کن. پلاستیک کمتر، بیشتر پیاده‌روی، گوشت کمتر بخور.")
        ),
        listOf(
            q("What does B think about stopping climate change?", listOf("possible", "can slow, not stop", "hopeless"), 1),
            q("What gives B hope?", listOf("technology", "young people", "government"), 1),
            q("If we ___ act now, it will be too late.", listOf("don't", "won't", "didn't"), 0),
            q("If we had started 30 years ago, we ___ be in this crisis.", listOf("wouldn't", "won't", "don't"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Make a difference", "تأثیر داشتن", "It would make a difference.", "تأثیر خواهد داشت."),
            IdiomExpression("Cautiously optimistic", "با احتیاط خوش‌بین", "I'm cautiously optimistic.", "با احتیاط خوش‌بینم.")
        ),
        pron = listOf(PronunciationTip("Third conditional", "Weak 'had': If we'd started... wouldn't have...")),
        cult = listOf(CulturalNote("Climate action", "The Paris Agreement aims to limit warming to 1.5°C. Some countries are far ahead; others lag behind.")),
        mis = listOf(
            CommonMistake("If we will not act, it will be late.", "If we don't act, it will be late.", "No 'will' in if-clause."),
            CommonMistake("If we had acted, we wouldn't be in crisis now.", "If we had acted, we wouldn't be in crisis now.", "Correct (mixed conditional).")
        )
    )

    private fun f9B() = base(36, "9B Recycling and waste", "۹B بازیافت و زباله",
        listOf("Use the passive voice", "Talk about waste and recycling", "Discuss environmental policies"),
        listOf(
            v("recycle", "بازیافت کردن", "Recycle paper and glass.", "کاغذ و شیشه را بازیافت کن.", "verb"),
            v("waste", "زباله", "Reduce waste.", "زباله را کاهش بده."),
            v("landfill", "محل دفن زباله", "Waste sent to landfill.", "زباله به محل دفن فرستاده می‌شود."),
            v("disposable", "یکبارمصرف", "Disposable cups.", "لیوان‌های یکبارمصرف.", "adjective"),
            v("biodegradable", "قابل تجزیه", "Biodegradable packaging.", "بسته‌بندی قابل تجزیه.", "adjective"),
            v("single-use", "یکبارمصرف", "Single-use plastics.", "پلاستیک‌های یکبارمصرف.", "adjective"),
            v("compost", "کمپوست", "Compost food waste.", "زباله غذایی را کمپوست کن.", "verb"),
            v("ban", "ممنوع کردن", "Ban plastic bags.", "کیسه‌های پلاستیکی را ممنوع کن.", "verb"),
            v("reusable", "قابل استفاده مجدد", "Reusable bags.", "کیسه‌های قابل استفاده مجدد.", "adjective"),
            v("container", "ظرف", "Recycling container.", "ظرف بازیافت.")
        ),
        listOf(
            GrammarSection("Passive voice review", "Plastic is recycled. Rubbish was collected. Rules must be followed."),
            GrammarSection("Passive with modals", "Waste should be reduced. Plastic bags can be banned."),
            GrammarSection("Causative", "We had our rubbish collected. I got my bike repaired.")
        ),
        listOf(
            d("A", "How much do you recycle?", "چقدر بازیافت می‌کنی؟"),
            d("B", "A lot. Paper, glass, and plastic are all recycled in my area.", "زیاد. کاغذ، شیشه و پلاستیک همه در منطقه من بازیافت می‌شوند."),
            d("A", "That's good. Does your city have strict rules?", "خوبه. شهرت قوانین سختگیرانه دارد؟"),
            d("B", "Yes. Single-use plastics have been banned in shops.", "بله. پلاستیک‌های یکبارمصرف در مغازه‌ها ممنوع شده‌اند."),
            d("A", "Really? What about restaurants?", "واقعاً؟ رستوران‌ها چطور؟"),
            d("B", "They must use biodegradable containers now. It was difficult at first, but people adapted.", "الان باید از ظروف قابل تجزیه استفاده کنند. اولش سخت بود، ولی مردم سازگار شدند."),
            d("A", "Do you think bans actually work?", "فکر می‌کنی ممنوعیت‌ها واقعاً کار می‌کنند؟"),
            d("B", "They do, if they're enforced. If nobody checks, nothing changes.", "می‌کنند، اگر اجرا شوند. اگر کسی چک نکند، چیزی تغییر نمی‌کند."),
            d("A", "What's the biggest problem in your opinion?", "بزرگ‌ترین مشکل به نظرت چیه؟"),
            d("B", "Food waste. So much food is thrown away while people go hungry.", "زباله غذایی. غذای زیادی دور ریخته می‌شود در حالی که مردم گرسنه می‌مانند."),
            d("A", "That's terrible. What can be done?", "این وحشتناکه. چیکار می‌شود کرد؟"),
            d("B", "Supermarkets should be forced to donate unsold food. Some already do.", "سوپرمارکت‌ها باید مجبور شوند غذای فروخته‌نشده را اهدا کنند. بعضی‌ها الان این کار را می‌کنند."),
            d("A", "That's a great idea. Do you compost?", "فکر عالی‌ایه. کمپوست می‌کنی؟"),
            d("B", "I try to. My food waste is composted in my garden.", "سعی می‌کنم. زباله غذایی‌ام در باغچه‌ام کمپوست می‌شود."),
            d("A", "Impressive. I don't have space for that.", "تحسین‌برانگیزه. من جا برای آن ندارم."),
            d("B", "You could use a small indoor compost bin. They're quite effective.", "می‌توانی از یک سطل کمپوست کوچک داخلی استفاده کنی. کاملاً مؤثرند.")
        ),
        listOf(
            q("What's banned in B's city?", listOf("glass", "single-use plastics", "paper"), 1),
            q("What's the biggest problem according to B?", listOf("plastic", "food waste", "paper"), 1),
            q("Plastic bags ___ banned in many countries.", listOf("have", "have been", "are been"), 1),
            q("Food waste ___ be reduced.", listOf("should", "should be", "should to be"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Throw away", "دور ریختن", "Food is thrown away.", "غذا دور ریخته می‌شود."),
            IdiomExpression("Go hungry", "گرسنه ماندن", "People go hungry.", "مردم گرسنه می‌مانند.")
        ),
        pron = listOf(PronunciationTip("Passive", "Focus on the past participle: is reCYcled, was COLlected.")),
        cult = listOf(CulturalNote("Waste management", "Germany and Sweden are leaders in recycling. Japan sorts waste into many categories.")),
        mis = listOf(
            CommonMistake("Plastic is recycle.", "Plastic is recycled.", "Past participle in passive."),
            CommonMistake("It should be ban.", "It should be banned.", "Past participle after modal passive.")
        )
    )

    private fun f9C() = base(37, "9C Green cities", "۹C شهرهای سبز",
        listOf("Use comparatives and superlatives", "Talk about sustainable cities", "Compare urban environments"),
        listOf(
            v("sustainable", "پایدار", "Sustainable cities.", "شهرهای پایدار.", "adjective"),
            v("green space", "فضای سبز", "More green space.", "فضای سبز بیشتر."),
            v("public transport", "حمل و نقل عمومی", "Efficient public transport.", "حمل و نقل عمومی کارآمد."),
            v("cycle lane", "مسیر دوچرخه", "Safe cycle lanes.", "مسیرهای دوچرخه امن."),
            v("pedestrian", "عابر پیاده", "Pedestrian zones.", "مناطق عابر پیاده."),
            v("efficient", "کارآمد", "Energy-efficient buildings.", "ساختمان‌های انرژی کارآمد.", "adjective"),
            v("emission", "انتشار", "Zero emissions.", "انتشار صفر."),
            v("urban", "شهری", "Urban planning.", "برنامه‌ریزی شهری.", "adjective"),
            v("livable", "قابل زندگی", "A livable city.", "شهر قابل زندگی.", "adjective"),
            v("commute", "رفت و آمد", "A short commute.", "رفت و آمد کوتاه.")
        ),
        listOf(
            GrammarSection("Comparatives and superlatives", "Copenhagen is one of the greenest cities. It's more sustainable than most."),
            GrammarSection("As... as", "It's not as polluted as other cities. Amsterdam is as bike-friendly as Copenhagen."),
            GrammarSection("Modifying comparisons", "far more efficient, slightly greener, much less polluted.")
        ),
        listOf(
            d("A", "Which cities do you think are the greenest?", "فکر می‌کنی کدام شهرها سبزترین هستند؟"),
            d("B", "Copenhagen is often ranked first. It's one of the most sustainable cities in the world.", "کپنهاگ اغلب اول رتبه‌بندی می‌شود. یکی از پایدارترین شهرهای جهان است."),
            d("A", "What makes it so green?", "چه چیزی آن را اینقدر سبز می‌کند؟"),
            d("B", "Cycling, mostly. There are more bikes than cars. The cycle lanes are far better than anywhere else.", "بیشتر دوچرخه‌سواری. دوچرخه بیشتر از ماشین هست. مسیرهای دوچرخه خیلی بهتر از هر جای دیگرند."),
            d("A", "That's impressive. What about Amsterdam?", "تحسین‌برانگیزه. آمستردام چطور؟"),
            d("B", "Amsterdam is as bike-friendly as Copenhagen, but slightly less ambitious on emissions.", "آمستردام به اندازه کپنهاگ دوچرخه‌دوست است، ولی روی انتشارها کمی کم‌جاه‌طلب‌تر."),
            d("A", "Which city has the best public transport?", "کدام شهر بهترین حمل و نقل عمومی را دارد؟"),
            d("B", "Tokyo, without a doubt. It's the most efficient system I've ever used.", "توکیو، بدون شک. کارآمدترین سیستمی است که تا حالا استفاده کرده‌ام."),
            d("A", "What about green space?", "فضای سبز چطور؟"),
            d("B", "Singapore is amazing. Despite being so dense, it has more green space than most cities.", "سنگاپور شگفت‌انگیزه. با وجود تراکم بالا، فضای سبز بیشتری از بیشتر شهرها دارد."),
            d("A", "How do they manage that?", "چطور این کار را می‌کنند؟"),
            d("B", "Strict urban planning. Every new building must include gardens.", "برنامه‌ریزی شهری سختگیرانه. هر ساختمان جدید باید باغ داشته باشد."),
            d("A", "Could other cities copy that?", "شهرهای دیگر می‌توانند کپی کنند؟"),
            d("B", "They could, but it's harder in older cities. Retrofitting is much more expensive.", "می‌توانند، ولی در شهرهای قدیمی‌تر سخت‌تر است. بازسازی خیلی گران‌تر است."),
            d("A", "So which city would you most like to live in?", "پس در کدام شهر بیشتر دوست داری زندگی کنی؟"),
            d("B", "Copenhagen, probably. It seems the most livable.", "احتمالاً کپنهاگ. به نظر قابل زندگی‌ترین است."),
            d("A", "Good choice. I'd pick Tokyo myself.", "انتخاب خوبی. من خودم توکیو را انتخاب می‌کنم.")
        ),
        listOf(
            q("Which city is often ranked first for sustainability?", listOf("Tokyo", "Copenhagen", "Singapore"), 1),
            q("Which has the most efficient public transport?", listOf("Amsterdam", "Tokyo", "Copenhagen"), 1),
            q("Copenhagen is one of ___ greenest cities.", listOf("a", "the", "an"), 1),
            q("Tokyo's system is ___ efficient than most.", listOf("more", "most", "much"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Without a doubt", "بدون شک", "Tokyo, without a doubt.", "توکیو، بدون شک."),
            IdiomExpression("Ranked first", "رتبه اول", "It's ranked first.", "رتبه اول است.")
        ),
        pron = listOf(PronunciationTip("Superlatives", "Stress 'the' before superlative: THE MOST efficient, THE greenest.")),
        cult = listOf(CulturalNote("Green cities", "Copenhagen aims to be carbon-neutral by 2025. Singapore's 'City in a Garden' plan transformed urban planning.")),
        mis = listOf(
            CommonMistake("Copenhagen is the most greenest.", "Copenhagen is the greenest.", "No double superlative."),
            CommonMistake("It's more efficient that Tokyo.", "It's more efficient than Tokyo.", "Than, not that.")
        )
    )

    // ═══════════ FILE 10 — Travel and adventure ═══════════

    private fun f10A() = base(38, "10A Around the world", "۱۰A دور دنیا",
        listOf("Use future forms", "Talk about travel plans", "Use travel vocabulary"),
        listOf(
            v("destination", "مقصد", "A popular destination.", "مقصد محبوب."),
            v("itinerary", "برنامه سفر", "A detailed itinerary.", "برنامه سفر مفصل."),
            v("book", "رزرو کردن", "Book a flight.", "پرواز رزرو کن.", "verb"),
            v("accommodation", "اقامت", "Find accommodation.", "اقامت پیدا کن."),
            v("sightseeing", "بازدید از جاذبه‌ها", "Go sightseeing.", "به بازدید جاذبه‌ها برو."),
            v("backpacking", "سفر با کوله‌پشتی", "Backpacking in Asia.", "سفر با کوله‌پشتی در آسیا."),
            v("off the beaten track", "دور از مسیر معمول", "Travel off the beaten track.", "دور از مسیر معمول سفر کن."),
            v("local", "محلی", "Local cuisine.", "غذای محلی.", "adjective"),
            v("explore", "کاوش کردن", "Explore new places.", "مکان‌های جدید را کاوش کن.", "verb"),
            v("guided tour", "تور با راهنما", "A guided tour of the city.", "تور با راهنمای شهر.")
        ),
        listOf(
            GrammarSection("Future forms review", "Will, going to, present continuous for future, future continuous."),
            GrammarSection("Future continuous", "This time next week, I'll be flying to Bangkok."),
            GrammarSection("Future perfect", "By the time I get back, I'll have visited five countries.")
        ),
        listOf(
            d("A", "What are your plans for the summer?", "برنامه‌هایت برای تابستان چیه؟"),
            d("B", "I'm going backpacking in Southeast Asia for two months!", "قرار است دو ماه با کوله‌پشتی به جنوب شرق آسیا بروم!"),
            d("A", "Wow! Which countries are you visiting?", "واو! کدام کشورها را می‌بینی؟"),
            d("B", "Thailand, Vietnam, and Cambodia. This time next week, I'll be flying to Bangkok.", "تایلند، ویتنام، و کامبوج. این موقع هفته بعد، دارم به بانکوک پرواز می‌کنم."),
            d("A", "Have you booked everything?", "همه چیز را رزرو کرده‌ای؟"),
            d("B", "Not yet. I've booked the flight, but I'm going to find accommodation when I arrive.", "هنوز نه. پرواز را رزرو کرده‌ام، ولی قصد دارم وقتی رسیدم اقامت پیدا کنم."),
            d("A", "That's risky, isn't it?", "این پرخطر نیست؟"),
            d("B", "A bit. But I prefer it that way. It gives me more freedom.", "کمی. ولی ترجیح می‌دهم اینطور باشد. آزادی بیشتری به من می‌دهد."),
            d("A", "Do you have an itinerary?", "برنامه سفر داری؟"),
            d("B", "Just a rough one. I want to go off the beaten track when possible.", "فقط یک برنامه کلی. می‌خواهم وقتی ممکن است دور از مسیر معمول بروم."),
            d("A", "What are you most looking forward to?", "بیشتر منتظر چه چیزی هستی؟"),
            d("B", "Local food, definitely. I'm going to try everything.", "غذای محلی، قطعاً. قصد دارم همه چیز را امتحان کنم."),
            d("A", "Have you had any vaccinations?", "هر واکسنی زده‌ای؟"),
            d("B", "Yes, I got them last month. I've also bought travel insurance.", "بله، ماه پیش زدم. بیمه سفر هم خریده‌ام."),
            d("A", "Smart. What will you do when you come back?", "هوشمندانه. وقتی برگشتی چیکار می‌کنی؟"),
            d("B", "By the time I get back, I'll have visited five countries. Then it's back to work.", "تا برگردم، پنج کشور را دیدم. بعدش برگشت به کار."),
            d("A", "Sounds amazing. Take lots of photos!", "شگفت‌انگیز به نظر می‌رسد. عکس‌های زیادی بگیر!")
        ),
        listOf(
            q("How long is B backpacking?", listOf("1 month", "2 months", "3 months"), 1),
            q("Which countries is B visiting?", listOf("Thailand, Vietnam, Cambodia", "Japan, Korea, China", "India, Nepal, Bhutan"), 0),
            q("This time next week, I ___ be flying.", listOf("will", "am", "going to"), 0),
            q("By the time I get back, I ___ have visited five countries.", listOf("will", "am", "going to"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Off the beaten track", "دور از مسیر معمول", "Go off the beaten track.", "دور از مسیر معمول برو."),
            IdiomExpression("Look forward to", "منتظر بودن", "I'm looking forward to it.", "منتظرش هستم.")
        ),
        pron = listOf(PronunciationTip("Future continuous", "Stress 'be' weakly: I'll be FLYing. This time next week.")),
        cult = listOf(CulturalNote("Backpacking", "Popular with young travelers from Europe, Australia, and North America. Southeast Asia is a common destination.")),
        mis = listOf(
            CommonMistake("I'm going to backpacking.", "I'm going backpacking.", "Going + -ing for activities."),
            CommonMistake("By the time I get back, I will visit five countries.", "By the time I get back, I will have visited five countries.", "Future perfect for completed action.")
        )
    )

    private fun f10B() = base(39, "10B Cultural differences", "۱۰B تفاوت‌های فرهنگی",
        listOf("Use modals for advice and obligation", "Talk about cultural norms", "Discuss cultural differences"),
        listOf(
            v("custom", "رسم", "Local customs.", "رسوم محلی."),
            v("etiquette", "آداب", "Business etiquette.", "آداب تجاری."),
            v("taboo", "تابو", "A cultural taboo.", "تابوی فرهنگی."),
            v("appropriate", "مناسب", "Appropriate behaviour.", "رفتار مناسب.", "adjective"),
            v("offend", "آزردن", "Don't offend anyone.", "کسی را نیازار.", "verb"),
            v("greeting", "احوال‌پرسی", "Traditional greeting.", "احوال‌پرسی سنتی."),
            v("bow", "تعظیم کردن", "Bow when you greet.", "هنگام سلام تعظیم کن.", "verb"),
            v("handshake", "دست دادن", "A firm handshake.", "دست دادن محکم."),
            v("personal space", "فضای شخصی", "Respect personal space.", "به فضای شخصی احترام بگذار."),
            v("misunderstand", "بد فهمیدن", "Easy to misunderstand.", "راحت بد فهمیده می‌شود.", "verb")
        ),
        listOf(
            GrammarSection("Modals for advice", "You should bow. You shouldn't point. You mustn't use your left hand."),
            GrammarSection("Modals for obligation", "You have to remove your shoes. You don't have to tip."),
            GrammarSection("Cultural norms", "In Japan, you should... In some countries, you mustn't...")
        ),
        listOf(
            d("A", "Have you ever made a cultural mistake abroad?", "هرگز در خارج اشتباه فرهنگی کرده‌ای؟"),
            d("B", "Yes, in Japan. I didn't know I should bow when greeting someone.", "بله، در ژاپن. نمی‌دانستم هنگام سلام باید تعظیم کنم."),
            d("A", "What happened?", "چی شد؟"),
            d("B", "I offered a handshake. The person looked surprised. Later a colleague explained.", "دست دادم. طرف متعجب به نظر رسید. بعداً همکاری توضیح داد."),
            d("A", "Did they seem offended?", "آزرده به نظر می‌رسیدند؟"),
            d("B", "Not offended, just confused. In Japan, you should bow — especially to older people.", "آزرده نه، فقط گیج. در ژاپن، باید تعظیم کنی — مخصوصاً به افراد مسن‌تر."),
            d("A", "That's good to know. What other rules should travellers know?", "خوبه که بدانیم. چه قوانین دیگری مسافران باید بدانند؟"),
            d("B", "In many Asian countries, you mustn't touch someone's head. It's considered sacred.", "در بسیاری از کشورهای آسیایی، نباید سر کسی را لمس کنی. مقدس شمرده می‌شود."),
            d("A", "Interesting. What about personal space?", "جالب. فضای شخصی چطور؟"),
            d("B", "In northern Europe, people need more space. In Latin America, they stand much closer.", "در شمال اروپا، مردم فضای بیشتری می‌خواهند. در آمریکای لاتین، خیلی نزدیک‌تر می‌ایستند."),
            d("A", "So you have to adapt depending on where you are.", "پس باید بسته به جایی که هستی سازگار شوی."),
            d("B", "Exactly. And you don't have to be perfect. Just show respect.", "دقیقاً. و لازم نیست کامل باشی. فقط احترام نشان بده."),
            d("A", "What's the biggest mistake tourists make?", "بزرگ‌ترین اشتباهی که توریست‌ها می‌کنند چیه؟"),
            d("B", "Assuming everyone does things the same way. That's how misunderstandings happen.", "فرض کردن اینکه همه چیز را یکسان انجام می‌دهند. اینگونه سوءتفاهم‌ها پیش می‌آید."),
            d("A", "Very true. What should I do before visiting a new country?", "خیلی درسته. قبل از سفر به کشور جدید چیکار کنم؟"),
            d("B", "Read about local customs. Watch videos. Talk to people who've been there.", "درباره رسوم محلی بخوان. ویدیو ببین. با کسانی که آنجا بوده‌اند صحبت کن.")
        ),
        listOf(
            q("Where did B make a cultural mistake?", listOf("China", "Japan", "Korea"), 1),
            q("What should you NOT touch in many Asian countries?", listOf("hands", "head", "shoulders"), 1),
            q("In Japan, you ___ bow when greeting.", listOf("should", "shouldn't", "don't have to"), 0),
            q("You ___ be perfect. Just show respect.", listOf("mustn't", "shouldn't", "don't have to"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Good to know", "خوبه که بدانیم", "That's good to know.", "خوبه که بدانیم."),
            IdiomExpression("Show respect", "احترام نشان دادن", "Just show respect.", "فقط احترام نشان بده.")
        ),
        pron = listOf(PronunciationTip("Modal stress", "Stress the modal for emphasis: You SHOULD bow. You MUSTN'T point.")),
        cult = listOf(CulturalNote("Cultural awareness", "In Thailand, don't touch someone's head. In the Middle East, don't use your left hand for eating. In Japan, remove shoes indoors.")),
        mis = listOf(
            CommonMistake("You should to bow.", "You should bow.", "No 'to' after should."),
            CommonMistake("You mustn't to point.", "You mustn't point.", "No 'to' after mustn't.")
        )
    )

    private fun f10C() = base(40, "10C Adventure travel", "۱۰C سفر ماجراجویانه",
        listOf("Review conditionals and modals", "Talk about adventures", "Share travel stories"),
        listOf(
            v("adventure", "ماجراجویی", "A great adventure.", "ماجراجویی عالی."),
            v("remote", "دورافتاده", "A remote village.", "روستای دورافتاده.", "adjective"),
            v("wilderness", "بیابان", "The wilderness.", "بیابان."),
            v("survive", "زنده ماندن", "Survive the wilderness.", "در بیابان زنده بمان.", "verb"),
            v("shelter", "سرپناه", "Find shelter.", "سرپناه پیدا کن."),
            v("landscape", "منظره", "Breathtaking landscape.", "منظره نفس‌گیر."),
            v("journey", "سفر", "A long journey.", "سفر طولانی."),
            v("challenge", "چالش", "Face challenges.", "با چالش‌ها روبرو شو."),
            v("unforgettable", "فراموش‌نشدنی", "An unforgettable experience.", "تجربه فراموش‌نشدنی.", "adjective"),
            v("bucket list", "لیست آرزوها", "On my bucket list.", "در لیست آرزوهایم.")
        ),
        listOf(
            GrammarSection("Third conditional", "If I hadn't gone, I would have regretted it forever."),
            GrammarSection("Mixed conditionals", "If I had studied harder, I would be in a better job now."),
            GrammarSection("Wishes and regrets", "I wish I had more time. If only I could go again.")
        ),
        listOf(
            d("A", "What's the most adventurous thing you've ever done?", "ماجراجویانه‌ترین کاری که تا حالا کرده‌ای چیه؟"),
            d("B", "I once spent two weeks hiking in Patagonia with just a backpack.", "یک بار دو هفته با فقط یک کوله‌پشتی در پاتاگونیا پیاده‌روی کردم."),
            d("A", "Wow! Was it difficult?", "واو! سخت بود؟"),
            d("B", "Extremely. The weather was unpredictable, and we had to carry all our food.", "فوق‌العاده. هوا غیرقابل پیش‌بینی بود، و باید تمام غذایمان را حمل می‌کردیم."),
            d("A", "Were you ever scared?", "هرگز ترسیدی؟"),
            d("B", "Once. We got lost in the mountains. If we hadn't found shelter, we would have been in serious trouble.", "یک بار. در کوه‌ها گم شدیم. اگر سرپناه پیدا نکرده بودیم، در دردسر جدی بودیم."),
            d("A", "That sounds terrifying. What did you do?", "وحشتناک به نظر می‌رسد. چیکار کردید؟"),
            d("B", "We stayed calm and used a compass. Eventually, we found a small cabin.", "آرام ماندیم و از قطب‌نما استفاده کردیم. در نهایت کلبه کوچکی پیدا کردیم."),
            d("A", "Amazing. Would you do it again?", "شگفت‌انگیز. دوباره انجامش می‌دادی؟"),
            d("B", "In a heartbeat. If I hadn't gone, I would have regretted it forever.", "بلافاصله. اگر نرفته بودم، تا ابد پشیمان می‌شدم."),
            d("A", "What did you learn from the experience?", "از تجربه چه یاد گرفتی؟"),
            d("B", "That you can survive much more than you think. It changed how I see challenges.", "اینکه می‌توانی خیلی بیشتر از آنچه فکر می‌کنی تحمل کنی. دیدم به چالش‌ها را تغییر داد."),
            d("A", "Do you have other adventures on your bucket list?", "ماجراجویی‌های دیگری در لیست آرزوهایت داری؟"),
            d("B", "Yes. I'd love to trek in the Himalayas. If I had more money, I would go tomorrow.", "بله. دوست دارم در هیمالیا کوه‌پیمایی کنم. اگر پول بیشتری داشتم، فردا می‌رفتم."),
            d("A", "What's stopping you?", "چه چیزی مانعت می‌شود؟"),
            d("B", "Time and money, mostly. But someday I'll do it.", "بیشتر وقت و پول. ولی یک روز انجامش می‌دهم."),
            d("A", "I hope you do. Life is too short for regrets.", "امیدوارم انجامش دهی. زندگی برای پشیمانی کوتاه‌ست."),
            d("B", "Exactly. That's why I travel whenever I can.", "دقیقاً. برای همین هر وقت می‌توانم سفر می‌کنم."),
            d("A", "You've inspired me. Maybe I'll plan a trip too.", "الهامم دادی. شاید من هم سفری برنامه‌ریزی کنم.")
        ),
        listOf(
            q("Where did B hike?", listOf("Himalayas", "Patagonia", "Alps"), 1),
            q("What happened in the mountains?", listOf("got lost", "got injured", "met a bear"), 0),
            q("If we ___ found shelter, we would have been in trouble.", listOf("didn't", "hadn't", "haven't"), 1),
            q("I wish I ___ more time.", listOf("have", "had", "having"), 1)
        ),
        idioms = listOf(
            IdiomExpression("In a heartbeat", "بلافاصله", "I'd do it in a heartbeat.", "بلافاصله انجامش می‌دهم."),
            IdiomExpression("Bucket list", "لیست آرزوها", "On my bucket list.", "در لیست آرزوهایم."),
            IdiomExpression("Life is too short", "زندگی کوتاه است", "Life is too short for regrets.", "زندگی برای پشیمانی کوتاه‌ست.")
        ),
        pron = listOf(PronunciationTip("Third conditional", "Weak 'had': If we'd found shelter. Stress the result clause: we would have been in TROUBLE.")),
        cult = listOf(CulturalNote("Adventure travel", "Popular with solo travelers and young professionals. Safety and preparation are crucial.")),
        mis = listOf(
            CommonMistake("If I would have gone, I would have regretted it.", "If I had gone, I would have regretted it.", "Never 'would have' in if-clause."),
            CommonMistake("I wish I have more time.", "I wish I had more time.", "Wish + past simple for present.")
        )
    )
}   // ← ✅ پایان object