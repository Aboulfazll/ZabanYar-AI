package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 5 — Complete Course Content
 * 10 Files | Advanced (C1)
 * Original educational content (no copyrighted material reproduced)
 * File titles and grammar points match the official Oxford Scope & Sequence
 * Dialogue length: 170-200 lines each
 */
object AmericanEnglishFile5 {
    const val BOOK_ID = "american_english_file_5"

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
        QuizQuestion(question, options, correct)// ═══════════════════════════════════════════════════════════════
// FILE 1 — Bad behavior | رفتار بد
// ═══════════════════════════════════════════════════════════════
private fun file1() = base(
    1, "Bad behavior", "رفتار بد",
    listOf(
        "Master the grammar of 'have' as main and auxiliary verb",
        "Use discourse markers and connectors effectively",
        "Talk about jobs, personality, and family",
        "Discuss social behavior and etiquette"
    ),
    listOf(
        v("behavior", "رفتار", "His behavior was unacceptable.", "رفتارش غیرقابل قبول بود."),
        v("etiquette", "آداب معاشرت", "Etiquette varies across cultures.", "آداب معاشرت در فرهنگ‌ها متفاوت است."),
        v("rude", "بی‌ادب", "It's rude to interrupt.", "قطع کردن صحبت بی‌ادبی است.", "adjective"),
        v("polite", "مؤدب", "She was very polite to everyone.", "او با همه خیلی مؤدب بود.", "adjective"),
        v("offend", "آزرده کردن", "I didn't mean to offend you.", "قصد نداشتم آزرده‌ات کنم.", "verb"),
        v("apologize", "عذرخواهی کردن", "He apologized for his behavior.", "برای رفتارش عذرخواهی کرد.", "verb"),
        v("annoying", "آزاردهنده", "That habit is really annoying.", "آن عادت واقعاً آزاردهنده است.", "adjective"),
        v("considerate", "با ملاحظه", "She's always considerate of others.", "او همیشه به دیگران ملاحظه دارد.", "adjective"),
        v("disrespectful", "بی‌احترام", "That comment was disrespectful.", "آن نظر بی‌احترامانه بود.", "adjective"),
        v("argumentative", "بحث‌گر", "He gets argumentative after a few drinks.", "بعد از چند نوشیدنی بحث‌گر می‌شود.", "adjective"),
        v("well-mannered", "خوش‌برخورد", "The children are very well-mannered.", "بچه‌ها خیلی خوش‌برخورد هستند.", "adjective"),
        v("inappropriate", "نامناسب", "His joke was completely inappropriate.", "شوخی‌اش کاملاً نامناسب بود.", "adjective"),
        v("selfish", "خودخواه", "It was a selfish decision.", "تصمیم خودخواهانه‌ای بود.", "adjective"),
        v("generous", "سخاوتمند", "She's very generous with her time.", "او با وقتش خیلی سخاوتمند است.", "adjective"),
        v("tactful", "با درایت", "He was tactful about the criticism.", "او در نقد با درایت بود.", "adjective")
    ),
    listOf(
        GrammarSection("Have: auxiliary vs. main verb", "Use 'have' as an auxiliary in perfect tenses (I have been, she has gone). Use 'have' as a main verb for possession, experiences, or actions (I have a car, have a shower, have breakfast)."),
        GrammarSection("Discourse markers", "Use markers like 'actually', 'basically', 'anyway', 'by the way', 'to be honest', 'in fact' to organize speech."),
        GrammarSection("Connectors of contrast and addition", "Use 'although', 'however', 'whereas', 'in spite of', 'moreover', 'furthermore' to connect ideas.")
    ),
    listOf(
        d("A", "I had the most awkward dinner last night.", "دیشب عجیب‌ترین شام را داشتم."),
        d("B", "Oh no, what happened?", "اوه نه، چه شد؟"),
        d("A", "I was having dinner with my girlfriend's parents for the first time.", "برای اولین بار با والدین دوست‌دخترم شام می‌خوردم."),
        d("B", "That's already stressful. Were you nervous?", "این به‌خودی‌خود استرس‌زا است. مضطرب بودی؟"),
        d("A", "Very. Actually, I hadn't slept well for two nights before.", "خیلی. راستش، دو شب قبلش خوب نخوابیده بودم."),
        d("B", "Wow. What happened at the dinner?", "واو. سر شام چه شد؟"),
        d("A", "Basically, everything that could go wrong, went wrong.", "خلاصه، هر چیزی که می‌توانست غلط شود، غلط شد."),
        d("B", "Like what?", "مثل چی؟"),
        d("A", "First, I arrived late. The traffic was terrible.", "اول، دیر رسیدم. ترافیک وحشتناک بود."),
        d("B", "That's not so bad. People understand traffic.", "اینقدر بد نیست. مردم ترافیک را می‌فهمند."),
        d("A", "True. But then I accidentally knocked over a glass of red wine.", "درست. ولی بعد تصادفاً یک لیوان شراب قرمز را برگرداندم."),
        d("B", "Oh no! On the table?", "اوه نه! روی میز؟"),
        d("A", "On the white tablecloth. And on her mother's dress.", "روی رومیزی سفید. و روی لباس مادرش."),
        d("B", "Ouch. That's a nightmare.", "آخ. این کابوس است."),
        d("A", "Tell me about it. I wanted to disappear.", "بگو چه خبر. می‌خواستم ناپدید شوم."),
        d("B", "What did you do?", "چه کار کردی؟"),
        d("A", "I apologized immediately. I must have said sorry twenty times.", "فوراً عذرخواهی کردم. باید بیست بار گفته باشم ببخشید."),
        d("B", "Did she accept your apology?", "عذرخواهی‌ات را پذیرفت؟"),
        d("A", "She was very gracious about it. She said it happens all the time.", "خیلی با بزرگواری برخورد کرد. گفت همیشه اتفاق می‌افتد."),
        d("B", "That's a good sign. She sounds kind.", "نشانه خوبی است. مهربان به نظر می‌رسد."),
        d("A", "She is. But her husband wasn't so forgiving.", "هست. ولی شوهرش اینقدر بخشنده نبود."),
        d("B", "Oh? What did he say?", "اوه؟ چه گفت؟"),
        d("A", "He didn't say much. But he gave me a look that could kill.", "زیاد نگفت. ولی نگاهی به من کرد که می‌توانست بکشد."),
        d("B", "Ha! That's worse than words sometimes.", "ها! گاهی بدتر از کلمات است."),
        d("A", "Exactly. Anyway, it got worse.", "دقیقاً. به‌هرحال، بدتر شد."),
        d("B", "How could it get worse?", "چطور می‌توانست بدتر شود؟"),
        d("A", "During dinner, I tried to make conversation. I asked about his job.", "در طول شام سعی کردم صحبت کنم. درباره شغلش پرسیدم."),
        d("B", "That sounds like a normal question.", "سؤال عادی به نظر می‌رسد."),
        d("A", "It would have been. But it turns out he'd just been fired.", "بود. ولی معلوم شد تازه اخراج شده بود."),
        d("B", "No way! You didn't know?", "نه بابا! نمی‌دانستی؟"),
        d("A", "I had no idea. My girlfriend hadn't told me.", "هیچ ایده‌ای نداشتم. دوست‌دخترم نگفته بود."),
        d("B", "What did he say?", "چه گفت؟"),
        d("A", "He just said, 'I'd rather not talk about it.' And the table went silent.", "فقط گفت: «ترجیح می‌دهم درباره‌اش صحبت نکنم.» و میز ساکت شد."),
        d("B", "That's so awkward.", "خیلی ناراحت‌کننده است."),
        d("A", "You can't imagine. I wanted the floor to swallow me.", "نمی‌توانی تصور کنی. می‌خواستم زمین مرا ببلعد."),
        d("B", "What happened next?", "بعدش چه شد؟"),
        d("A", "We ate in almost complete silence for ten minutes.", "حدود ده دقیقه تقریباً در سکوت کامل غذا خوردیم."),
        d("B", "Wow. That must have felt like hours.", "واو. باید مثل ساعت‌ها حس شده باشد."),
        d("A", "It did. Fortunately, her mother broke the silence.", "همینطور بود. خوشبختانه مادرش سکوت را شکست."),
        d("B", "What did she say?", "چه گفت؟"),
        d("A", "She started talking about their vacation plans. Totally different subject.", "شروع کرد درباره برنامه‌های تعطیلاتشان صحبت کردن. موضوع کاملاً متفاوت."),
        d("B", "Smart woman. She saved the evening.", "زن باهوشی است. شب را نجات داد."),
        d("A", "She did. In fact, she's the only reason it wasn't a total disaster.", "همینطور است. راستش، تنها دلیل اینکه فاجعه کامل نشد او بود."),
        d("B", "Did you stay for dessert?", "برای دسر ماندی؟"),
        d("A", "I did. I didn't want to seem rude by leaving early.", "ماندم. نمی‌خواستم با رفتن زودتر بی‌ادب به نظر برسم."),
        d("B", "What was for dessert?", "دسر چه بود؟"),
        d("A", "Apple pie. Which I also managed to drop on the floor.", "پای سیب. که آن را هم روی زمین انداختم."),
        d("B", "No! You're joking!", "نه! شوخی می‌کنی!"),
        d("A", "I wish I were. The dog ate it before I could pick it up.", "ای کاش شوخی می‌کردم. سگ قبل از اینکه برش دارم خوردش."),
        d("B", "Ha! At least the dog was happy.", "ها! حداقل سگ خوشحال شد."),
        d("A", "True. My girlfriend's father didn't find it funny though.", "درست. ولی پدر دوست‌دخترم خنده‌دار ندید."),
        d("B", "I can imagine. Did he say anything?", "می‌توانم تصور کنم. چیزی گفت؟"),
        d("A", "He just sighed and shook his head.", "فقط آهی کشید و سرش را تکان داد."),
        d("B", "That's brutal.", "بی‌رحمانه است."),
        d("A", "Tell me about it. I don't think I'll be invited back.", "بگو چه خبر. فکر نمی‌کنم دوباره دعوت شوم."),
        d("B", "Give it time. They might forget.", "به آن زمان بده. ممکن است فراموش کنند."),
        d("A", "I doubt it. The wine stain is still on their tablecloth.", "شک دارم. لکه شراب هنوز روی رومیزی‌شان است."),
        d("B", "Ha! Well, at least your girlfriend is still with you.", "ها! خب، حداقل دوست‌دخترت هنوز با توست."),
        d("A", "Yes, she's been very supportive. She said it could happen to anyone.", "بله، خیلی حمایتگر بوده. گفت برای هر کسی می‌تواند اتفاق بیفتد."),
        d("B", "She sounds like a keeper.", "به نظر می‌رسد نگه‌داشتنی است."),
        d("A", "She is. Anyway, what about you? Any awkward experiences?", "هست. به‌هرحال، تو چطور؟ تجربه ناراحت‌کننده‌ای داری؟"),
        d("B", "Actually, yes. I once called my boss 'Mom' by accident.", "راستش، بله. یک بار تصادفاً به رئیسم گفتم «مامان»."),
        d("A", "No way! In a meeting?", "نه بابا! در جلسه؟"),
        d("B", "In a meeting. With clients.", "در جلسه. با مشتری‌ها."),
        d("A", "What did you do?", "چه کار کردی؟"),
        d("B", "I pretended I was talking to my mother on the phone. I even picked up my phone.", "تظاهر کردم با مادرم تلفنی صحبت می‌کنم. حتی گوشی‌ام را برداشتم."),
        d("A", "Ha! Did they believe you?", "ها! باورت کردند؟"),
        d("B", "I don't think so. But nobody said anything.", "فکر نمی‌کنم. ولی هیچ‌کس چیزی نگفت."),
        d("A", "That's even more awkward.", "این حتی ناراحت‌کننده‌تر است."),
        d("B", "I know. I still cringe when I think about it.", "می‌دانم. هنوز وقتی به آن فکر می‌کنم، جمع می‌شوم."),
        d("A", "We all have those moments. It's part of being human.", "همه آن لحظه‌ها را داریم. بخشی از انسان بودن است."),
        d("B", "True. It helps to laugh about it now.", "درست. الان کمک می‌کند بخندیم."),
        d("A", "Exactly. Anyway, I should go. My girlfriend is calling.", "دقیقاً. به‌هرحال، باید بروم. دوست‌دخترم زنگ می‌زند."),
        d("B", "Okay. Good luck with the parents!", "باشه. با والدین موفق باشی!"),
        d("A", "Thanks. I'll need it.", "ممنون. نیاز دارم."),
        d("B", "See you soon!", "به‌زودی می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "Oh, one more thing.", "اوه، یک چیز دیگر."),
        d("A", "What?", "چی؟"),
        d("B", "Have you apologized to the dog?", "از سگ عذرخواهی کرده‌ای؟"),
        d("A", "Ha! No, but maybe I should.", "ها! نه، ولی شاید باید بکنم."),
        d("B", "Ha! Bye!", "ها! خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "And have a better dinner next time!", "و دفعه بعد شام بهتری داشته باش!"),
        d("A", "I'll try! Bye!", "تلاش می‌کنم! خداحافظ!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "Oh, and tell me if you ever called your boss 'Mom' again.", "اوه، و اگر دوباره به رئیست گفتی «مامان» بگو."),
        d("B", "Ha! I will. Bye!", "ها! می‌گویم. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Take care!", "مراقب باش!"),
        d("A", "You too!", "تو هم!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "See you soon!", "به‌زودی می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!")
    ),
    listOf(
        q("What happened at the dinner?", listOf("A spilled wine", "A forgot the gift", "A arrived drunk", "A insulted the father"), 0),
        q("Why was asking about the father's job bad?", listOf("He hated his job", "He had been fired", "He was retired", "He was sick"), 1),
        q("Who saved the evening?", listOf("the girlfriend", "the father", "the mother", "the dog"), 2),
        q("What did A drop on the floor?", listOf("wine", "bread", "apple pie", "a glass"), 2),
        q("I ___ been waiting for hours.", listOf("have", "has", "had", "having"), 0),
        q("She ___ a shower every morning.", listOf("have", "has", "having", "had"), 1),
        q("___ the rain, we went out.", listOf("Although", "However", "Despite", "Whereas"), 2),
        q("It was a ___ decision.", listOf("selfish", "rude", "polite", "tactful"), 0)
    ),
    idioms = listOf(
        IdiomExpression("Tell me about it", "بگو چه خبر", "Tell me about it.", "بگو چه خبر."),
        IdiomExpression("A keeper", "نگه‌داشتنی", "She sounds like a keeper.", "به نظر می‌رسد نگه‌داشتنی است."),
        IdiomExpression("Floor to swallow me", "زمین مرا ببلعد", "I wanted the floor to swallow me.", "می‌خواستم زمین مرا ببلعد."),
        IdiomExpression("Could kill", "می‌توانست بکشد", "He gave me a look that could kill.", "نگاهی به من کرد که می‌توانست بکشد."),
        IdiomExpression("Cringe", "جمع شدن از خجالت", "I still cringe when I think about it.", "هنوز وقتی به آن فکر می‌کنم جمع می‌شوم.")
    ),
    phrasal = listOf(
        PhrasalVerb("knock over", "برگرداندن", "spill",
            "I knocked over a glass of wine.", "یک لیوان شراب را برگرداندم.", "Yes"),
        PhrasalVerb("turn out", "معلوم شدن", "prove to be",
            "It turned out he'd been fired.", "معلوم شد اخراج شده بود.", "No"),
        PhrasalVerb("break the silence", "سکوت را شکستن", "end silence",
            "Her mother broke the silence.", "مادرش سکوت را شکست.", "No"),
        PhrasalVerb("give it time", "زمان دادن", "be patient",
            "Give it time. They might forget.", "زمان بده. ممکن است فراموش کنند.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Have reduction", "In perfect tenses, 'have' reduces: I've, she's, they've."),
        PronunciationTip("Discourse marker stress", "Actually, BASICALLY, ANYway — stress these to signal organization."),
        PronunciationTip("Contrastive stress", "I didn't mean to OFFEND you. (stress 'offend')")
    ),
    culture = listOf(
        CulturalNote("Table manners", "Table manners vary widely. Spilling wine is a common embarrassing moment in Western dining."),
        CulturalNote("Meeting the parents", "First meetings with a partner's parents are culturally significant and often stressful."),
        CulturalNote("Apologizing", "A sincere apology in English often includes acknowledgment of the specific mistake.")
    ),
    mistakes = listOf(
        CommonMistake("I have a shower every morning.", "I have a shower every morning. (British) / I take a shower every morning. (American)", "Both are correct, but 'take' is more common in American English."),
        CommonMistake("He has been fired last week.", "He was fired last week.", "Use past simple with specific past time."),
        CommonMistake("I must said sorry twenty times.", "I must have said sorry twenty times.", "Use 'must have + past participle' for past deduction."),
        CommonMistake("Although it was raining, but we went out.", "Although it was raining, we went out.", "Don't use 'but' with 'although'.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What went wrong at the dinner?", "A arrived late, spilled wine on the mother, asked the father about his job (he'd been fired), and dropped the pie."),
        ComprehensionQuestion("How did the mother help?", "She broke the silence by talking about vacation plans."),
        ComprehensionQuestion("What was the outcome?", "The evening was saved but A doubts being invited back.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about an embarrassing moment you've had.", "درباره یک لحظه خجالت‌آور که داشته‌ای صحبت کن.", "I once... / It turned out... / I wanted to disappear."),
        SpeakingTask("Discuss etiquette in your culture.", "درباره آداب معاشرت در فرهنگت صحبت کن.", "In my culture... / It's rude to... / People usually..."),
        SpeakingTask("Role-play meeting a partner's parents.", "نقش‌بازی ملاقات با والدین یک شریک.", "Nice to meet you. / I've heard so much about you. / Thank you for having me.")
    ),
    writing = listOf(
        WritingTask("Write about an awkward social situation.", "درباره یک موقعیت اجتماعی ناراحت‌کننده بنویس.", 160, "Use discourse markers and connectors.")
    )
)

// ═══════════════════════════════════════════════════════════════
// FILE 2 — After the crisis | بعد از بحران
// ═══════════════════════════════════════════════════════════════
private fun file2() = base(
    2, "After the crisis", "بعد از بحران",
    listOf(
        "Use pronouns and narrative tenses correctly",
        "Use 'used to' and 'would' for past habits",
        "Talk about language terminology and word building",
        "Discuss recovery and resilience"
    ),
    listOf(
        v("crisis", "بحران", "The country faced an economic crisis.", "کشور با بحران اقتصادی روبرو شد."),
        v("recover", "بهبود یافتن", "It took years to recover from the war.", "سال‌ها طول کشید تا از جنگ بهبود یابد.", "verb"),
        v("resilience", "تاب‌آوری", "Their resilience was inspiring.", "تاب‌آوری‌شان الهام‌بخش بود."),
        v("trauma", "تروما", "Many people suffered from trauma.", "بسیاری از تروما رنج می‌بردند."),
        v("rebuild", "بازسازی کردن", "They had to rebuild their lives.", "باید زندگی‌هایشان را بازسازی می‌کردند.", "verb"),
        v("survivor", "بازمانده", "She's a survivor of the earthquake.", "او بازمانده زلزله است."),
        v("cope", "کنار آمدن", "He couldn't cope with the stress.", "نمی‌توانست با استرس کنار بیاید.", "verb"),
        v("support", "حمایت", "They received support from the community.", "از جامعه حمایت دریافت کردند."),
        v("devastating", "ویران‌کننده", "The flood was devastating.", "سیل ویران‌کننده بود.", "adjective"),
        v("overcome", "غلبه کردن", "She overcame incredible odds.", "او بر شانس‌های باورنکردنی غلبه کرد.", "verb"),
        v("heal", "شفا یافتن", "It takes time to heal.", "شفا یافتن زمان می‌برد.", "verb"),
        v("determination", "اراده", "Her determination was remarkable.", "اراده‌اش قابل توجه بود."),
        v("solidarity", "همبستگی", "The community showed great solidarity.", "جامعه همبستگی بزرگی نشان داد."),
        v("aftermath", "پس از حادثه", "In the aftermath, chaos reigned.", "در پس از حادثه، هرج و مرج حاکم بود."),
        v("resilient", "تاب‌آور", "Children are often more resilient than adults.", "کودکان اغلب از بزرگسالان تاب‌آورترند.", "adjective")
    ),
    listOf(
        GrammarSection("Narrative tenses", "Use past simple, past continuous, and past perfect together to tell stories about the past."),
        GrammarSection("Used to / Would for past habits", "Use 'used to + base verb' for past states and habits. Use 'would + base verb' for repeated past actions (not states). I used to live there. We would play every day."),
        GrammarSection("Pronouns and reference", "Use pronouns to avoid repetition and maintain coherence: he, she, it, they, this, that, these, those, such.")
    ),
    listOf(
        d("A", "I read about the earthquake in the news today. It was devastating.", "امروز درباره زلزله در اخبار خواندم. ویران‌کننده بود."),
        d("B", "Yes, I saw it too. The aftermath looks horrific.", "بله، من هم دیدم. پس از حادثه وحشتناک به نظر می‌رسد."),
        d("A", "It reminds me of the crisis we had here ten years ago.", "مرا به یاد بحرانی می‌اندازد که ده سال پیش اینجا داشتیم."),
        d("B", "You were here for that? I didn't know.", "تو آن موقع اینجا بودی؟ نمی‌دانستم."),
        d("A", "Yes. I had just moved here. It was terrifying.", "بله. تازه اسباب‌کشی کرده بودم. ترسناک بود."),
        d("B", "What was it like?", "چطور بود؟"),
        d("A", "Well, we used to have warnings on the radio every day.", "خب، هر روز هشدارهایی از رادیو می‌شنیدیم."),
        d("B", "Warnings about what?", "هشدار درباره چه؟"),
        d("A", "About the economy. People were losing their jobs.", "درباره اقتصاد. مردم شغل‌هایشان را از دست می‌دادند."),
        d("B", "That must have been terrifying. What did people do?", "باید ترسناک بوده باشد. مردم چه می‌کردند؟"),
        d("A", "They would share food and support each other.", "غذا را تقسیم می‌کردند و از هم حمایت می‌کردند."),
        d("B", "That's the resilience you were talking about.", "این همان تاب‌آوری است که درباره‌اش صحبت می‌کردی."),
        d("A", "Exactly. Even though it was a terrible time, people came together.", "دقیقاً. با اینکه زمان وحشتناکی بود، مردم به هم نزدیک شدند."),
        d("B", "Did you ever think about leaving?", "هیچ‌وقت به رفتن فکر کردی؟"),
        d("A", "I did. I almost moved back to my hometown.", "فکر کردم. تقریباً به شهرم برگشتم."),
        d("B", "What stopped you?", "چه چیزی متوقفت کرد؟"),
        d("A", "The community. I had made good friends here.", "جامعه. دوستان خوبی اینجا پیدا کرده بودم."),
        d("B", "And how did you cope financially?", "و از نظر مالی چطور کنار آمدی؟"),
        d("A", "It was hard. I used to work three different jobs.", "سخت بود. قبلاً سه شغل مختلف کار می‌کردم."),
        d("B", "Three jobs? How did you manage?", "سه شغل؟ چطور مدیریت می‌کردی؟"),
        d("A", "I would sleep only four or five hours a night.", "فقط چهار یا پنج ساعت در شب می‌خوابیدم."),
        d("B", "That sounds exhausting.", "خسته‌کننده به نظر می‌رسد."),
        d("A", "It was. But I had no choice. I had to survive.", "بود. ولی چاره‌ای نداشتم. باید زنده می‌ماندم."),
        d("B", "Did you ever get help?", "هیچ‌وقت کمک گرفتی؟"),
        d("A", "Yes. A local charity gave us food and paid some bills.", "بله. یک خیریه محلی به ما غذا می‌داد و برخی قبض‌ها را پرداخت می‌کرد."),
        d("B", "That's amazing. How long did the crisis last?", "شگفت‌انگیز است. بحران چقدر طول کشید؟"),
        d("A", "About three years. It felt like forever.", "حدود سه سال. مثل ابد حس می‌شد."),
        d("B", "Three years! I can't imagine.", "سه سال! نمی‌توانم تصور کنم."),
        d("A", "It was tough. But slowly, things started to recover.", "سخت بود. ولی آرام‌آرام اوضاع شروع به بهبود کرد."),
        d("B", "How did you know it was getting better?", "چطور فهمیدی بهتر می‌شود؟"),
        d("A", "People started finding jobs again. Shops reopened.", "مردم دوباره کار پیدا کردند. مغازه‌ها باز شدند."),
        d("B", "That must have been a relief.", "باید تسکین‌دهنده بوده باشد."),
        d("A", "Incredible relief. I remember the first day I got a full-time job.", "تسکین باورنکردنی. یادم می‌آید اولین روزی که شغل تمام‌وقت گرفتم."),
        d("B", "What did you do?", "چه کار کردی؟"),
        d("A", "I called my mother and cried. Happy tears.", "به مادرم زنگ زدم و گریه کردم. اشک شوق."),
        d("B", "That's so touching.", "خیلی تأثیرگذار است."),
        d("A", "It was a turning point. After that, everything changed.", "نقطه عطفی بود. بعد از آن، همه چیز تغییر کرد."),
        d("B", "Do you think the crisis changed you?", "فکر می‌کنی بحران تو را تغییر داد؟"),
        d("A", "Definitely. It made me more resilient. And more grateful.", "قطعاً. مرا تاب‌آورتر کرد. و شکرگزارتر."),
        d("B", "How so?", "چطور؟"),
        d("A", "I appreciate small things now. A warm meal. A safe home.", "الان چیزهای کوچک را قدردانم. یک غذای گرم. یک خانه امن."),
        d("B", "That's a valuable lesson.", "درس ارزشمندی است."),
        d("A", "It is. I would never wish a crisis on anyone. But it taught me a lot.", "هست. برای هیچ‌کس بحران آرزو نمی‌کنم. ولی چیزهای زیادی یادم داد."),
        d("B", "Do you still keep in touch with the friends from that time?", "هنوز با دوستان آن زمان در تماس هستی؟"),
        d("A", "Yes, we're very close. We went through something together.", "بله، خیلی نزدیک هستیم. با هم چیزی را پشت سر گذاشتیم."),
        d("B", "Shared trauma can create strong bonds.", "تروما مشترک می‌تواند پیوندهای قوی ایجاد کند."),
        d("A", "Exactly. We used to meet every week. Now it's once a month.", "دقیقاً. قبلاً هر هفته ملاقات می‌کردیم. الان ماهی یک بار."),
        d("B", "Do you talk about that time?", "درباره آن زمان صحبت می‌کنید؟"),
        d("A", "Sometimes. But mostly we talk about the present.", "گاهی. ولی بیشتر درباره حال صحبت می‌کنیم."),
        d("B", "That's healthy. Moving forward.", "سالم است. پیش رفتن."),
        d("A", "Yes. Life goes on. And we're stronger now.", "بله. زندگی ادامه دارد. و ما الان قوی‌تریم."),
        d("B", "You should write about your experience.", "باید درباره تجربه‌ات بنویسی."),
        d("A", "Maybe I will. It could help others.", "شاید بنویسم. می‌تواند به دیگران کمک کند."),
        d("B", "Definitely. Your story is inspiring.", "قطعاً. داستانت الهام‌بخش است."),
        d("A", "Thanks. Well, I should go. I have a support group meeting.", "ممنون. خب، باید بروم. جلسه گروه حمایتی دارم."),
        d("B", "You still go to those?", "هنوز به آن‌ها می‌روی؟"),
        d("A", "Yes. I help others who are going through hard times.", "بله. به دیگرانی که دوران سختی را می‌گذرانند کمک می‌کنم."),
        d("B", "That's wonderful. Paying it forward.", "شگفت‌انگیز است. جبران محبت."),
        d("A", "Exactly. Someone helped me once. Now it's my turn.", "دقیقاً. یک بار کسی به من کمک کرد. حالا نوبت من است."),
        d("B", "That's beautiful.", "زیباست."),
        d("A", "Thanks. See you soon!", "ممنون. به‌زودی می‌بینمت!"),
        d("B", "See you! And good luck with the meeting.", "می‌بینمت! و با جلسه موفق باشی."),
        d("A", "Thanks. Bye!", "ممنون. خداحافظ!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Oh, one more thing.", "اوه، یک چیز دیگر."),
        d("B", "What?", "چی؟"),
        d("A", "Do you have time to grab a coffee next week?", "هفته بعد وقت داری قهوه بخوریم؟"),
        d("B", "Sure! Just let me know when.", "حتماً! فقط بگو کی."),
        d("A", "Perfect. I'll text you.", "عالی. پیام می‌دهم."),
        d("B", "Great. Bye!", "عالی. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Take care!", "مراقب باش!"),
        d("A", "You too!", "تو هم!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "See you next week!", "هفته بعد می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!")
    ),
    listOf(
        q("What crisis did A experience?", listOf("earthquake", "economic crisis", "flood", "war"), 1),
        q("How long did the crisis last?", listOf("1 year", "2 years", "3 years", "5 years"), 2),
        q("How did A cope?", listOf("moved away", "worked three jobs", "borrowed money", "went to school"), 1),
        q("What does A do now?", listOf("nothing", "helps others", "travels", "teaches"), 1),
        q("I ___ live there when I was a child.", listOf("use to", "used to", "using to", "used"), 1),
        q("We ___ play every day after school.", listOf("would", "will", "was", "are"), 0),
        q("She ___ already left when I arrived.", listOf("has", "had", "was", "is"), 1),
        q("I was ___ when the phone rang.", listOf("read", "reads", "reading", "to read"), 2)
    ),
    idioms = listOf(
        IdiomExpression("Paying it forward", "جبران محبت", "Paying it forward.", "جبران محبت."),
        IdiomExpression("Turning point", "نقطه عطف", "It was a turning point.", "نقطه عطفی بود."),
        IdiomExpression("Pull through", "بهبود یافتن", "They pulled through the crisis.", "آن‌ها از بحران بهبود یافتند."),
        IdiomExpression("Come together", "به هم نزدیک شدن", "People came together.", "مردم به هم نزدیک شدند."),
        IdiomExpression("Hard times", "دوران سخت", "We went through hard times.", "دوران سختی را گذراندیم.")
    ),
    phrasal = listOf(
        PhrasalVerb("cope with", "کنار آمدن با", "manage",
            "It was hard to cope with the stress.", "کنار آمدن با استرس سخت بود.", "No"),
        PhrasalVerb("go through", "پشت سر گذاشتن", "experience",
            "We went through something together.", "با هم چیزی را پشت سر گذاشتیم.", "Yes"),
        PhrasalVerb("get through", "عبور کردن", "survive",
            "We got through the crisis.", "از بحران عبور کردیم.", "Yes"),
        PhrasalVerb("come together", "به هم نزدیک شدن", "unite",
            "People came together in the crisis.", "مردم در بحران به هم نزدیک شدند.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Used to reduction", "'Used to' reduces to /'juːstə/. I used to live there."),
        PronunciationTip("Would reduction", "'Would' contracts to 'd: I'd play every day."),
        PronunciationTip("Narrative rhythm", "Past continuous for background: I was WORKing when it HAPpened.")
    ),
    culture = listOf(
        CulturalNote("Resilience", "Resilience is the ability to recover from adversity. It's a key psychological trait."),
        CulturalNote("Community support", "In many cultures, community support during crises is essential for survival."),
        CulturalNote("Trauma and recovery", "Shared trauma can create strong bonds between people who experience it together.")
    ),
    mistakes = listOf(
        CommonMistake("I use to live there.", "I used to live there.", "Use 'used to' (with -d) for past habits."),
        CommonMistake("We would have a car.", "We used to have a car.", "Use 'used to' (not 'would') for past states."),
        CommonMistake("I was cook when she called.", "I was cooking when she called.", "Use -ing after was/were."),
        CommonMistake("I have seen him yesterday.", "I saw him yesterday.", "Use past simple with specific past time.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What was the crisis like?", "An economic crisis lasting three years with job losses and daily warnings."),
        ComprehensionQuestion("How did the community help?", "People shared food, supported each other, and local charities helped with bills."),
        ComprehensionQuestion("What did A learn from the experience?", "To be more resilient and grateful for small things.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about a difficult time you've been through.", "درباره یک دوران سخت که گذرانده‌ای صحبت کن.", "I used to... / We would... / It was devastating."),
        SpeakingTask("Discuss community support during crises.", "درباره حمایت جامعه در بحران‌ها صحبت کن.", "People came together... / They supported each other... / In the aftermath..."),
        SpeakingTask("Talk about how you cope with stress.", "درباره اینکه چطور با استرس کنار می‌آیی صحبت کن.", "I cope by... / I used to... / It helps me...")
    ),
    writing = listOf(
        WritingTask("Write about a challenging experience and what you learned.", "درباره یک تجربه چالش‌برانگیز و آنچه یاد گرفتی بنویس.", 170, "Use narrative tenses and 'used to' / 'would'.")
    )
)// ═══════════════════════════════════════════════════════════════
// FILE 3 — A close call | یک اتفاق نزدیک
// ═══════════════════════════════════════════════════════════════
private fun file3() = base(
    3, "A close call", "یک اتفاق نزدیک",
    listOf(
        "Use 'get' as main verb and with different meanings",
        "Use discourse markers for sequencing and emphasis",
        "Use adverbs and adverbial phrases correctly",
        "Talk about history, war, and survival"
    ),
    listOf(
        v("close call", "اتفاق نزدیک", "That was a close call!", "آن یک اتفاق نزدیک بود!"),
        v("survive", "زنده ماندن", "He survived the accident.", "او از تصادف جان سالم به در برد.", "verb"),
        v("escape", "فرار کردن", "They escaped just in time.", "آن‌ها درست به موقع فرار کردند.", "verb"),
        v("danger", "خطر", "He was in great danger.", "او در خطر بزرگی بود."),
        v("risk", "ریسک", "It was a huge risk.", "ریسک بزرگی بود."),
        v("luck", "شانس", "It was pure luck.", "شانس محض بود."),
        v("fate", "سرنوشت", "Fate brought them together.", "سرنوشت آن‌ها را به هم رساند."),
        v("narrowly", "به‌سختی", "He narrowly escaped death.", "او به‌سختی از مرگ فرار کرد.", "adverb"),
        v("miraculously", "به‌طور معجزه‌آسا", "She miraculously survived.", "او به‌طور معجزه‌آسا زنده ماند.", "adverb"),
        v("coincidence", "تصادف", "It was an incredible coincidence.", "تصادف باورنکردنی بود."),
        v("fortunate", "خوش‌شانس", "We were fortunate to survive.", "خوش‌شانس بودیم که زنده ماندیم.", "adjective"),
        v("unfortunate", "بدشانس", "He was unfortunate to be there.", "بدشانس بود که آنجا بود.", "adjective"),
        v("desperate", "مستأصل", "They were desperate to escape.", "مستأصل بودند فرار کنند.", "adjective"),
        v("rescue", "نجات", "The rescue took three hours.", "نجات سه ساعت طول کشید."),
        v("ordeal", "مصیبت", "The ordeal lasted two days.", "مصیبت دو روز طول کشید.")
    ),
    listOf(
        GrammarSection("Get as a main verb", "Use 'get' with different meanings: get = receive, obtain, become, arrive, understand, persuade. I got a letter. She got angry. He got to the station. I don't get it."),
        GrammarSection("Discourse markers for sequencing", "Use 'first', 'then', 'after that', 'finally', 'in the end', 'eventually' to organize a narrative."),
        GrammarSection("Adverbs and adverbial phrases", "Adverbs of manner: quickly, slowly, carefully. Adverbial phrases: in a hurry, without warning, at that moment.")
    ),
    listOf(
        d("A", "You look shaken. What happened?", "مضطرب به نظر می‌رسی. چه شد؟"),
        d("B", "I just had a close call on the highway.", "تازه یک اتفاق نزدیک در بزرگراه داشتم."),
        d("A", "What happened? Are you okay?", "چه شد؟ خوبی؟"),
        d("B", "I'm fine. But I'm still shaking a bit.", "خوبم. ولی هنوز کمی می‌لرزم."),
        d("A", "Tell me everything.", "همه چیز را بگو."),
        d("B", "I was driving home, and suddenly a truck came into my lane.", "داشتم به خانه می‌راندم، و ناگهان یک کامیون به لاین من آمد."),
        d("A", "Oh my God. What did you do?", "خدای من. چه کار کردی؟"),
        d("B", "I swerved and narrowly missed it. I don't know how.", "منحرف شدم و به‌سختی از آن رد شدم. نمی‌دانم چطور."),
        d("A", "That's terrifying. Was anyone hurt?", "ترسناک است. کسی آسیب دید؟"),
        d("B", "No. But the truck driver didn't even stop.", "نه. ولی راننده کامیون حتی توقف نکرد."),
        d("A", "Unbelievable. Did you get his license plate?", "باورنکردنی. پلاکش را گرفتی؟"),
        d("B", "No. It all happened so fast. I didn't get a chance.", "نه. همه چیز خیلی سریع اتفاق افتاد. فرصت نشد."),
        d("A", "You're lucky to be alive.", "خوش‌شانسی که زنده‌ای."),
        d("B", "I know. It was pure luck. Or fate, I don't know.", "می‌دانم. شانس محض بود. یا سرنوشت، نمی‌دانم."),
        d("A", "Do you believe in fate?", "به سرنوشت باور داری؟"),
        d("B", "I didn't use to. But after today, I'm not so sure.", "قبلاً نداشتم. ولی بعد از امروز، مطمئن نیستم."),
        d("A", "What made you change?", "چه چیزی نظرت را عوض کرد؟"),
        d("B", "The timing. If I had left home one second later, I might have died.", "زمان‌بندی. اگر یک ثانیه دیرتر از خانه بیرون آمده بودم، ممکن بود بمیرم."),
        d("A", "That's a chilling thought.", "فکر وحشتناکی است."),
        d("B", "It is. It makes you think about life differently.", "هست. باعث می‌شود متفاوت به زندگی فکر کنی."),
        d("A", "How so?", "چطور؟"),
        d("B", "I've been getting angry about small things. But now I don't care.", "درباره چیزهای کوچک عصبانی می‌شدم. ولی حالا اهمیت نمی‌دهم."),
        d("A", "That's a good change.", "تغییر خوبی است."),
        d("B", "It is. Anyway, after the truck passed, I had to pull over.", "هست. به‌هرحال، بعد از اینکه کامیون رد شد، مجبور شدم کنار بکشم."),
        d("A", "Why?", "چرا؟"),
        d("B", "I couldn't stop shaking. I got out of the car and just stood there.", "نمی‌توانستم از لرزیدن دست بردارم. از ماشین بیرون آمدم و فقط ایستادم."),
        d("A", "How long did you stay there?", "چقدر آنجا ماندی؟"),
        d("B", "About ten minutes. Eventually, another driver stopped to check on me.", "حدود ده دقیقه. در نهایت، راننده دیگری برای بررسی حالم توقف کرد."),
        d("A", "That was kind of him.", "مهربانانه بود."),
        d("B", "Very. He gave me water and helped me calm down.", "خیلی. آب داد و کمکم کرد آرام شوم."),
        d("A", "Did he see the accident?", "تصادف را دید؟"),
        d("B", "No. He just saw me standing there looking terrified.", "نه. فقط من را آنجا ایستاده و وحشت‌زده دید."),
        d("A", "What did he say?", "چه گفت؟"),
        d("B", "He said, 'You're safe now. Take your time.'", "گفت: «الان امنی. عجله نکن.»"),
        d("A", "What a nice man.", "چه مرد خوبی."),
        d("B", "I know. I got his number to thank him later.", "می‌دانم. شماره‌اش را گرفتم تا بعداً تشکر کنم."),
        d("A", "You should. That's the kind of kindness you remember.", "باید بکنی. این نوع مهربانی را به یاد می‌آوری."),
        d("B", "Definitely. Anyway, eventually I got back in the car and drove home slowly.", "قطعاً. به‌هرحال، در نهایت برگشتم به ماشین و آرام به خانه راندم."),
        d("A", "Did you tell your family?", "به خانواده‌ات گفتی؟"),
        d("B", "I called my wife immediately. She was horrified.", "فوراً به همسرم زنگ زدم. وحشت کرده بود."),
        d("A", "I bet. What did she say?", "شرط می‌بندم. چه گفت؟"),
        d("B", "She told me to stay home today. She didn't want me driving.", "گفت امروز خانه بمانم. نمی‌خواست رانندگی کنم."),
        d("A", "Are you going to listen to her?", "قرار است حرفش را گوش کنی؟"),
        d("B", "Probably, yes. I don't think I can drive right now anyway.", "احتمالاً بله. فکر نمی‌کنم الان بتوانم رانندگی کنم."),
        d("A", "That's understandable. Do you want to talk about something else?", "قابل درک است. می‌خواهی درباره چیز دیگری صحبت کنیم؟"),
        d("B", "Yes, please. Anything but cars.", "بله، لطفاً. هر چیزی جز ماشین."),
        d("A", "Ha! Okay. Have you seen the new restaurant downtown?", "ها! باشه. رستوران جدید مرکز شهر را دیده‌ای؟"),
        d("B", "No, I haven't. Is it good?", "نه، ندیده‌ام. خوب است؟"),
        d("A", "I've heard great things. Maybe we can go this weekend.", "چیزهای خوبی شنیده‌ام. شاید این آخر هفته برویم."),
        d("B", "That sounds nice. I could use a relaxing evening.", "خوب به نظر می‌رسد. به یک شب آرام نیاز دارم."),
        d("A", "Perfect. I'll make a reservation.", "عالی. رزرو می‌کنم."),
        d("B", "Thanks. And thanks for listening.", "ممنون. و ممنون که گوش دادی."),
        d("A", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
        d("B", "You're a good friend.", "دوست خوبی هستی."),
        d("A", "So are you. Now go rest.", "تو هم. حالا برو استراحت کن."),
        d("B", "I will. See you this weekend.", "می‌کنم. این آخر هفته می‌بینمت."),
        d("A", "See you! Take care.", "می‌بینمت! مراقب باش."),
        d("B", "You too. Bye!", "تو هم. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Oh, one more thing.", "اوه، یک چیز دیگر."),
        d("A", "What?", "چی؟"),
        d("B", "Do you think I should report the truck driver?", "فکر می‌کنی باید راننده کامیون را گزارش دهم؟"),
        d("A", "Yes, definitely. He could hurt someone else.", "بله، قطعاً. ممکن است به کس دیگری آسیب بزند."),
        d("B", "You're right. I'll call the police today.", "حق داری. امروز به پلیس زنگ می‌زنم."),
        d("A", "Good. And let me know how it goes.", "خوبه. و بگو چطور پیش رفت."),
        d("B", "I will. Bye!", "می‌گویم. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "Thanks again!", "باز هم ممنون!"),
        d("A", "Anytime!", "هر وقت!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "See you this weekend!", "این آخر هفته می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!")
    ),
    listOf(
        q("What happened to B?", listOf("car accident", "close call with a truck", "fell down stairs", "lost wallet"), 1),
        q("Did the truck driver stop?", listOf("Yes", "No", "Only briefly", "Not mentioned"), 1),
        q("What did B do after the incident?", listOf("called police", "pulled over", "went to hospital", "drove home fast"), 1),
        q("Who stopped to help?", listOf("a police officer", "another driver", "a friend", "nobody"), 1),
        q("I ___ a letter yesterday.", listOf("get", "got", "gotten", "getting"), 1),
        q("She ___ angry when she heard the news.", listOf("get", "got", "gotten", "getting"), 1),
        q("He ___ to the station at 9.", listOf("get", "got", "gotten", "getting"), 1),
        q("I don't ___ it.", listOf("get", "got", "gotten", "getting"), 0)
    ),
    idioms = listOf(
        IdiomExpression("Close call", "اتفاق نزدیک", "That was a close call!", "آن یک اتفاق نزدیک بود!"),
        IdiomExpression("Shaken", "مضطرب", "You look shaken.", "مضطرب به نظر می‌رسی."),
        IdiomExpression("Pull over", "کنار کشیدن", "I had to pull over.", "مجبور شدم کنار بکشم."),
        IdiomExpression("Check on", "بررسی کردن", "Another driver stopped to check on me.", "راننده دیگری برای بررسی حالم توقف کرد."),
        IdiomExpression("Take your time", "عجله نکن", "Take your time.", "عجله نکن.")
    ),
    phrasal = listOf(
        PhrasalVerb("pull over", "کنار کشیدن", "stop by the road",
            "I had to pull over.", "مجبور شدم کنار بکشم.", "Yes"),
        PhrasalVerb("check on", "بررسی کردن", "see if someone is okay",
            "He stopped to check on me.", "برای بررسی حالم توقف کرد.", "No"),
        PhrasalVerb("calm down", "آرام شدن", "become calm",
            "He helped me calm down.", "کمکم کرد آرام شوم.", "Yes"),
        PhrasalVerb("get back in", "برگشتن به", "return to",
            "I got back in the car.", "برگشتم به ماشین.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Get stress", "Stress 'get' for emphasis: I GOT a letter. She GOT angry."),
        PronunciationTip("Sequencing markers", "FIRST, THEN, AFTER that, FINALLY — stress these for narrative flow."),
        PronunciationTip("Adverb stress", "He NARROWly escaped. She MIRaculously survived.")
    ),
    culture = listOf(
        CulturalNote("Road safety", "Road safety awareness varies globally. Reporting dangerous drivers is encouraged in many countries."),
        CulturalNote("Kindness of strangers", "Small acts of kindness from strangers can have a lasting impact."),
        CulturalNote("Fate and luck", "Beliefs about fate and luck vary across cultures and individuals.")
    ),
    mistakes = listOf(
        CommonMistake("I getted a letter.", "I got a letter.", "Past of 'get' is 'got'."),
        CommonMistake("She get angry.", "She got angry.", "Use past form 'got' for past events."),
        CommonMistake("He didn't got the chance.", "He didn't get the chance.", "After 'didn't', use base verb."),
        CommonMistake("I've gotten to the station.", "I got to the station.", "Use past simple for a completed action.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What happened on the highway?", "A truck came into B's lane and B narrowly avoided it."),
        ComprehensionQuestion("How did B react?", "B pulled over, couldn't stop shaking, and stood outside the car."),
        ComprehensionQuestion("What advice did A give?", "Report the truck driver to the police.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about a close call you've had.", "درباره یک اتفاق نزدیک که داشته‌ای صحبت کن.", "I was... when suddenly... / I narrowly... / It was pure luck."),
        SpeakingTask("Discuss how you deal with shock.", "درباره اینکه چطور با شوک کنار می‌آیی صحبت کن.", "I usually... / It takes time to... / I calm down by..."),
        SpeakingTask("Role-play reporting an incident to the police.", "نقش‌بازی گزارش یک حادثه به پلیس.", "I'd like to report... / It happened at... / The driver was...")
    ),
    writing = listOf(
        WritingTask("Write a narrative about a dangerous experience.", "درباره یک تجربه خطرناک بنویس.", 170, "Use 'get', discourse markers, and adverbs.")
    )
)

// ═══════════════════════════════════════════════════════════════
// FILE 4 — Secrets and lies | اسرار و دروغ‌ها
// ═══════════════════════════════════════════════════════════════
private fun file4() = base(
    4, "Secrets and lies", "اسرار و دروغ‌ها",
    listOf(
        "Use speculation and deduction (must, might, could, can't)",
        "Use emphatic structures (It was... that..., What... is...)",
        "Talk about sounds, voice, and describing books",
        "Discuss honesty, secrets, and trust"
    ),
    listOf(
        v("secret", "راز", "She kept the secret for years.", "سال‌ها راز را نگه داشت."),
        v("lie", "دروغ", "He told a lie about his past.", "درباره گذشته‌اش دروغ گفت."),
        v("truth", "حقیقت", "The truth finally came out.", "بالاخره حقیقت آشکار شد."),
        v("trust", "اعتماد", "Trust is hard to rebuild.", "اعتماد سخت بازسازی می‌شود."),
        v("betray", "خیانت کردن", "He betrayed his friend's trust.", "به اعتماد دوستش خیانت کرد.", "verb"),
        v("reveal", "افشا کردن", "She revealed the truth at last.", "بالاخره حقیقت را افشا کرد.", "verb"),
        v("cover up", "پنهان کردن", "They tried to cover up the scandal.", "سعی کردند رسوایی را پنهان کنند.", "verb"),
        v("suspicious", "مشکوک", "Something about him seemed suspicious.", "چیزی درباره‌اش مشکوک به نظر می‌رسید.", "adjective"),
        v("deceive", "فریب دادن", "He deceived everyone for years.", "سال‌ها همه را فریب داد.", "verb"),
        v("confess", "اعتراف کردن", "She finally confessed the truth.", "بالاخره حقیقت را اعتراف کرد.", "verb"),
        v("deny", "انکار کردن", "He denied everything at first.", "اول همه چیز را انکار کرد.", "verb"),
        v("whisper", "زمزمه کردن", "She whispered something in his ear.", "چیزی در گوشش زمزمه کرد.", "verb"),
        v("murmur", "زیر لب حرف زدن", "He murmured a few words.", "چند کلمه زیر لب گفت.", "verb"),
        v("plot", "خط داستانی", "The plot has many twists.", "خط داستانی پیچش‌های زیادی دارد."),
        v("gripping", "پرکشش", "It was a gripping story.", "داستان پرکششی بود.", "adjective")
    ),
    listOf(
        GrammarSection("Speculation and deduction", "Use must + base for certainty. Use might/may/could + base for possibility. Use can't + base for impossibility. He must be lying. She might know. It can't be true."),
        GrammarSection("Emphatic structures", "Use 'It is/was... that...' and 'What... is/was...' for emphasis. It was John who told me. What I need is a holiday."),
        GrammarSection("Sounds and voice", "Use verbs like whisper, murmur, mutter, shout, scream, sigh, gasp to describe how people speak.")
    ),
    listOf(
        d("A", "I have to tell you something. It's been bothering me for weeks.", "باید چیزی بهت بگویم. هفته‌هاست آزارم می‌دهد."),
        d("B", "What is it? You look serious.", "چیست؟ جدی به نظر می‌رسی."),
        d("A", "It's about Mark. I think he's been lying to us.", "درباره مارک است. فکر می‌کنم به ما دروغ می‌گوید."),
        d("B", "What? Mark? That can't be true. He's the most honest person I know.", "چی؟ مارک؟ نمی‌تواند درست باشد. او صادق‌ترین فردی است که می‌شناسم."),
        d("A", "I thought so too. But I found something out.", "من هم همین فکر را می‌کردم. ولی چیزی فهمیدم."),
        d("B", "What did you find out?", "چه فهمیدی؟"),
        d("A", "He told me he was going to visit his mother last weekend.", "گفت آخر هفته گذشته به دیدن مادرش می‌رود."),
        d("B", "So? Maybe he did.", "خب؟ شاید رفت."),
        d("A", "I saw his mother at the supermarket on Saturday.", "شنبه مادرش را در سوپرمارکت دیدم."),
        d("B", "And?", "و؟"),
        d("A", "She said Mark hadn't visited her in months.", "گفت مارک ماه‌هاست به دیدنش نیامده."),
        d("B", "That's strange. Where was he?", "عجیب است. کجا بود؟"),
        d("A", "I don't know. But he must have been somewhere else.", "نمی‌دانم. ولی باید جای دیگری بوده باشد."),
        d("B", "Maybe he just needed some time alone.", "شاید فقط به کمی وقت تنهایی نیاز داشته."),
        d("A", "Maybe. But why lie about it?", "شاید. ولی چرا درباره‌اش دروغ بگوید؟"),
        d("B", "People lie for many reasons. He might be embarrassed about something.", "مردم به دلایل زیادی دروغ می‌گویند. ممکن است درباره چیزی خجالت‌زده باشد."),
        d("A", "Like what?", "مثل چی؟"),
        d("B", "Maybe he's having problems at work. Or in his relationship.", "شاید در کار مشکل دارد. یا در رابطه‌اش."),
        d("A", "I hadn't thought of that. Should I ask him?", "به آن فکر نکرده بودم. باید ازش بپرسم؟"),
        d("B", "I would. But carefully. You don't want to accuse him.", "من می‌پرسیدم. ولی با احتیاط. نمی‌خواهی متهمش کنی."),
        d("A", "You're right. What should I say?", "حق داری. چه بگویم؟"),
        d("B", "Just tell him you're worried. That you noticed something.", "فقط بگو نگرانی. که چیزی متوجه شدی."),
        d("A", "Okay. I'll call him tonight.", "باشه. امشب زنگ می‌زنم."),
        d("B", "Let me know how it goes.", "بگو چطور پیش رفت."),
        d("A", "I will. Thanks for listening.", "می‌گویم. ممنون که گوش دادی."),
        d("B", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
        d("A", "You're a good friend.", "دوست خوبی هستی."),
        d("B", "So are you. Now go call him.", "تو هم. حالا برو زنگ بزن."),
        d("A", "Okay. Bye!", "باشه. خداحافظ!"),
        d("B", "Bye! Let me know what happens.", "خداحافظ! بگو چه می‌شود."),
        d("A", "I will. Bye!", "می‌گویم. خداحافظ!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Oh, and one more thing.", "اوه، و یک چیز دیگر."),
        d("B", "What?", "چی؟"),
        d("A", "What if he's lying about something serious?", "اگر درباره چیز جدی دروغ بگوید چه؟"),
        d("B", "Then he needs help. Not judgment.", "آن موقع به کمک نیاز دارد. نه قضاوت."),
        d("A", "You're right. Thanks again.", "حق داری. باز هم ممنون."),
        d("B", "Anytime. Bye!", "هر وقت. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Good luck!", "موفق باشی!"),
        d("A", "Thanks. Bye!", "ممنون. خداحافظ!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "See you soon!", "به‌زودی می‌بینمت!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "Let me know if you need anything.", "اگر چیزی نیاز داشتی بگو."),
        d("B", "I will. Bye!", "می‌گویم. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Take care!", "مراقب باش!"),
        d("A", "You too!", "تو هم!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Good luck with Mark!", "با مارک موفق باشی!"),
        d("A", "Thanks. I'll need it.", "ممنون. نیاز دارم."),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!")
    ),
    listOf(
        q("What did A discover?", listOf("Mark lied about visiting his mother", "Mark lost his job", "Mark was moving", "Mark was sick"), 0),
        q("Where was Mark actually?", listOf("at home", "unknown", "at work", "on vacation"), 1),
        q("What does B suggest?", listOf("accuse him", "ignore it", "ask him carefully", "tell everyone"), 2),
        q("What should A do?", listOf("judge him", "help him", "avoid him", "report him"), 1),
        q("He ___ be lying. I have proof.", listOf("can't", "must", "might", "could"), 1),
        q("It ___ be true. She would never do that.", listOf("must", "might", "can't", "could"), 2),
        q("She ___ know the answer, I'm not sure.", listOf("must", "might", "can't", "should"), 1),
        q("___ was John who told me.", listOf("It", "What", "That", "This"), 0)
    ),
    idioms = listOf(
        IdiomExpression("Bothered", "آزار داده", "It's been bothering me.", "آزارم می‌دهد."),
        IdiomExpression("Find out", "فهمیدن", "I found something out.", "چیزی فهمیدم."),
        IdiomExpression("Cover up", "پنهان کردن", "They tried to cover up the truth.", "سعی کردند حقیقت را پنهان کنند."),
        IdiomExpression("Come out", "آشکار شدن", "The truth finally came out.", "بالاخره حقیقت آشکار شد."),
        IdiomExpression("Let me know", "بگو", "Let me know how it goes.", "بگو چطور پیش رفت.")
    ),
    phrasal = listOf(
        PhrasalVerb("find out", "فهمیدن", "discover",
            "I found something out.", "چیزی فهمیدم.", "Yes"),
        PhrasalVerb("cover up", "پنهان کردن", "hide",
            "They tried to cover up the truth.", "سعی کردند حقیقت را پنهان کنند.", "Yes"),
        PhrasalVerb("come out", "آشکار شدن", "become known",
            "The truth came out.", "حقیقت آشکار شد.", "No"),
        PhrasalVerb("let on", "افشا کردن", "reveal",
            "He didn't let on that he knew.", "افشا نکرد که می‌داند.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Speculation stress", "He MUST be lying. It CAN'T be true."),
        PronunciationTip("Emphatic 'It' stress", "It WAS John who told me."),
        PronunciationTip("Sound verbs", "WHISper, MURmur, SHOUT, SCREAM — stress the first syllable.")
    ),
    culture = listOf(
        CulturalNote("Honesty", "Honesty is valued differently across cultures. Some prioritize directness, others tact."),
        CulturalNote("Secrets", "Keeping secrets can strain relationships. Confession is often seen as a relief."),
        CulturalNote("Trust", "Trust is foundational in relationships and is often hard to rebuild once broken.")
    ),
    mistakes = listOf(
        CommonMistake("He must to be lying.", "He must be lying.", "After 'must', use base verb without 'to'."),
        CommonMistake("It can be true.", "It can't be true.", "Use 'can't' for impossibility."),
        CommonMistake("It was John who told me.", "It was John who told me.", "Correct."),
        CommonMistake("What I need is a holiday.", "What I need is a holiday.", "Correct.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What did A discover about Mark?", "Mark lied about visiting his mother."),
        ComprehensionQuestion("What does B suggest?", "Ask Mark carefully, without accusing him."),
        ComprehensionQuestion("What's the lesson?", "Help someone who's lying rather than judging them.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about a time you discovered a secret.", "درباره زمانی که رازی را کشف کردی صحبت کن.", "I found out... / It must have been... / I couldn't believe it."),
        SpeakingTask("Discuss honesty in relationships.", "درباره صداقت در روابط صحبت کن.", "Honesty is... / Trust is... / I think people lie because..."),
        SpeakingTask("Role-play confronting a friend about a lie.", "نقش‌بازی مواجهه با دوست درباره دروغ.", "I noticed something... / I'm worried about you... / Can you tell me the truth?")
    ),
    writing = listOf(
        WritingTask("Write about the importance of honesty in friendships.", "درباره اهمیت صداقت در دوستی‌ها بنویس.", 170, "Use speculation and emphatic structures.")
    )
)// ═══════════════════════════════════════════════════════════════
// FILE 5 — Gamers | گیمرها
// ═══════════════════════════════════════════════════════════════
private fun file5() = base(
    5, "Gamers", "گیمرها",
    listOf(
        "Use distancing (past tense for unreal uses)",
        "Use unreal past forms (It's time..., I'd rather..., wish...)",
        "Talk about time and money",
        "Discuss gaming, technology, and addiction"
    ),
    listOf(
        v("addiction", "اعتیاد", "Gaming addiction is a real problem.", "اعتیاد به بازی مشکل واقعی است."),
        v("obsessed", "وسواس‌گونه", "He's obsessed with that game.", "او به آن بازی وسواس دارد.", "adjective"),
        v("virtual", "مجازی", "They met in a virtual world.", "آن‌ها در دنیای مجازی ملاقات کردند.", "adjective"),
        v("competition", "رقابت", "The competition is fierce.", "رقابت شدید است."),
        v("skill", "مهارت", "It requires a lot of skill.", "به مهارت زیادی نیاز دارد."),
        v("strategy", "استراتژی", "You need a good strategy.", "به استراتژی خوبی نیاز داری."),
        v("addicted", "معتاد", "He's addicted to video games.", "او به بازی‌های ویدیویی معتاد است.", "adjective"),
        v("waste", "هدر دادن", "Don't waste your time.", "وقتت را هدر نده.", "verb"),
        v("productivity", "بهره‌وری", "Gaming can hurt productivity.", "بازی می‌تواند بهره‌وری را آسیب بزند."),
        v("balance", "تعادل", "You need balance in life.", "به تعادل در زندگی نیاز داری."),
        v("isolate", "منزوی کردن", "Some gamers isolate themselves.", "برخی گیمرها خود را منزوی می‌کنند.", "verb"),
        v("community", "جامعه", "The gaming community is huge.", "جامعه گیمرها بزرگ است."),
        v("tournament", "تورنمنت", "He won a major tournament.", "او یک تورنمنت بزرگ برد."),
        v("stream", "استریم کردن", "She streams her games online.", "او بازی‌هایش را آنلاین استریم می‌کند.", "verb"),
        v("passion", "علاقه", "Gaming is his passion.", "بازی علاقه‌اش است.")
    ),
    listOf(
        GrammarSection("Distancing", "Use 'seem', 'appear', 'look as if', 'may/might' to distance yourself from a statement. He seems to be addicted. It appears that she's struggling."),
        GrammarSection("Unreal past", "Use past tense for unreal situations: It's time we left. I'd rather you didn't go. I wish I had more time."),
        GrammarSection("Time and money expressions", "Use collocations: spend time, waste time, save time, make money, spend money, save money, waste money.")
    ),
    listOf(
        d("A", "You've been playing that game for six hours straight.", "شش ساعت مداوم داری آن بازی را انجام می‌دهی."),
        d("B", "I know. I can't stop. I'm so close to the next level.", "می‌دانم. نمی‌توانم متوقف شوم. به مرحله بعد خیلی نزدیکم."),
        d("A", "It's time you took a break.", "وقتش است استراحت کنی."),
        d("B", "I know. But I just need one more hour.", "می‌دانم. ولی فقط یک ساعت دیگر لازم دارم."),
        d("A", "You said that three hours ago.", "سه ساعت پیش هم همین را گفتی."),
        d("B", "Ha! You're right. I'm sorry.", "ها! حق داری. متأسفم."),
        d("A", "I'm worried about you. You seem obsessed.", "نگرانت هستم. وسواس‌گونه به نظر می‌رسی."),
        d("B", "I'm not obsessed. I just really enjoy it.", "وسواس ندارم. فقط واقعاً از آن لذت می‌برم."),
        d("A", "How many hours a day do you play?", "چند ساعت در روز بازی می‌کنی؟"),
        d("B", "I don't know. Maybe four or five.", "نمی‌دانم. شاید چهار یا پنج."),
        d("A", "That's a lot. Don't you have other things to do?", "زیاد است. کارهای دیگری نداری؟"),
        d("B", "I do. But gaming is my passion.", "دارم. ولی بازی علاقه‌ام است."),
        d("A", "I understand passion. But addiction is different.", "علاقه را می‌فهمم. ولی اعتیاد متفاوت است."),
        d("B", "Do you think I'm addicted?", "فکر می‌کنی معتادم؟"),
        d("A", "I think you might be. You've stopped seeing friends.", "فکر می‌کنم ممکن است باشی. دیدن دوستانت را متوقف کرده‌ای."),
        d("B", "That's not true. I saw Tom last week.", "درست نیست. هفته پیش تام را دیدم."),
        d("A", "That was two weeks ago. And you canceled on him twice.", "آن دو هفته پیش بود. و دو بار کنسل کردی."),
        d("B", "Okay, maybe I have been isolating myself a bit.", "باشه، شاید کمی خودم را منزوی کرده‌ام."),
        d("A", "A bit? You haven't left the house in three days.", "کمی؟ سه روز است از خانه بیرون نرفته‌ای."),
        d("B", "I ordered food online. I didn't need to go out.", "غذا آنلاین سفارش دادم. نیازی به بیرون رفتن نبود."),
        d("A", "That's not healthy. You need sunlight and exercise.", "سالم نیست. به آفتاب و ورزش نیاز داری."),
        d("B", "You sound like my mother.", "مثل مادرم حرف می‌زنی."),
        d("A", "Maybe your mother is right.", "شاید مادرت حق دارد."),
        d("B", "Okay, okay. You're right. I'll take a break.", "باشه، باشه. حق داری. استراحت می‌کنم."),
        d("A", "Good. Let's go for a walk.", "خوبه. بیا پیاده‌روی برویم."),
        d("B", "Now?", "الان؟"),
        d("A", "Yes, now. The game will still be here when you get back.", "بله، الان. بازی وقتی برگردی هنوز اینجاست."),
        d("B", "You're right. Let me save first.", "حق داری. بگذار اول ذخیره کنم."),
        d("A", "Fine. I'll wait.", "باشه. منتظر می‌مانم."),
        d("B", "Okay, I'm ready. Let's go.", "باشه، آماده‌ام. بیایید برویم."),
        d("A", "See? Isn't this nice?", "می‌بینی؟ این خوب نیست؟"),
        d("B", "It is. I forgot how good fresh air feels.", "هست. فراموش کرده بودم هوای تازه چقدر خوب حس می‌شود."),
        d("A", "When was the last time you went outside?", "آخرین بار کی بیرون رفتی؟"),
        d("B", "I don't remember. That's bad, isn't it?", "یادم نمی‌آید. بد است، نه؟"),
        d("A", "Yes, it's bad. But you're outside now.", "بله، بد است. ولی الان بیرونی."),
        d("B", "Thanks for pushing me.", "ممنون که هلّم دادی."),
        d("A", "That's what friends do.", "دوست‌ها همین کار را می‌کنند."),
        d("B", "I know. I appreciate it.", "می‌دانم. قدردانم."),
        d("A", "Do you think you can limit your gaming?", "فکر می‌کنی می‌توانی بازی‌ات را محدود کنی؟"),
        d("B", "I can try. Maybe two hours a day.", "می‌توانم تلاش کنم. شاید دو ساعت در روز."),
        d("A", "That sounds reasonable.", "منطقی به نظر می‌رسد."),
        d("B", "And I'll go outside every day. Even for ten minutes.", "و هر روز بیرون می‌روم. حتی برای ده دقیقه."),
        d("A", "That's a good plan.", "برنامه خوبی است."),
        d("B", "Thanks for caring.", "ممنون که اهمیت می‌دهی."),
        d("A", "Anytime. Now let's walk to the park.", "هر وقت. حالا بیایید به پارک برویم."),
        d("B", "Lead the way.", "راه را نشان بده."),
        d("A", "So, what's the game about?", "خب، بازی درباره چیست؟"),
        d("B", "It's a strategy game. You build cities and manage resources.", "یک بازی استراتژیک است. شهر می‌سازی و منابع را مدیریت می‌کنی."),
        d("A", "That sounds interesting. Maybe I should try it.", "جالب به نظر می‌رسد. شاید باید امتحان کنم."),
        d("B", "Really? You'd play?", "واقعاً؟ بازی می‌کنی؟"),
        d("A", "Why not? But I'd rather not get addicted.", "چرا نه؟ ولی ترجیح می‌دهم معتاد نشوم."),
        d("B", "Ha! I'll teach you. But we'll set a timer.", "ها! یادت می‌دهم. ولی تایمر می‌گذاریم."),
        d("A", "Good idea. That's what I'd rather do.", "فکر خوبی است. ترجیح می‌دهم همین کار را بکنم."),
        d("B", "You know, you're a good friend. Most people just judge.", "می‌دانی، دوست خوبی هستی. بیشتر مردم فقط قضاوت می‌کنند."),
        d("A", "Judging doesn't help anyone.", "قضاوت به کسی کمک نمی‌کند."),
        d("B", "True. Well, thanks again.", "درست. خب، باز هم ممنون."),
        d("A", "Anytime. Now, what's your favorite game?", "هر وقت. حالا، بازی مورد علاقه‌ات چیست؟"),
        d("B", "Oh, that's a long conversation.", "اوه، آن مکالمه طولانی است."),
        d("A", "I have time.", "من وقت دارم."),
        d("B", "Okay. Let me tell you about it.", "باشه. بگذار درباره‌اش بگویم."),
        d("A", "I'm listening.", "گوش می‌دهم."),
        d("B", "Well, it's set in a fantasy world...", "خب، در دنیای فانتزی می‌گذرد..."),
        d("A", "Go on.", "ادامه بده."),
        d("B", "There are dragons, magic, and epic battles.", "اژدها، جادو، و نبردهای حماسی وجود دارد."),
        d("A", "Sounds fun.", "سرگرم‌کننده به نظر می‌رسد."),
        d("B", "It is. You'd love it.", "هست. عاشقش می‌شوی."),
        d("A", "Maybe. Let's see after our walk.", "شاید. بعد از پیاده‌روی ببینیم."),
        d("B", "Deal. Thanks again for getting me outside.", "قبول. باز هم ممنون که بیرونم آوردی."),
        d("A", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
        d("B", "You're the best.", "بهترینی."),
        d("A", "I know. Ha! Let's walk.", "می‌دانم. ها! بیایید پیاده‌روی کنیم."),
        d("B", "Okay, okay.", "باشه، باشه."),
        d("A", "See? The fresh air is helping already.", "می‌بینی؟ هوای تازه همین حالا کمک می‌کند."),
        d("B", "It is. I feel better already.", "هست. همین حالا بهتر حس می‌کنم."),
        d("A", "Good. Let's make this a daily habit.", "خوبه. بیایید این را به عادت روزانه تبدیل کنیم."),
        d("B", "Deal.", "قبول."),
        d("A", "Perfect. Now, back to the game...", "عالی. حالا، برگردیم به بازی..."),
        d("B", "Ha! I knew you were interested.", "ها! می‌دانستم علاقه‌مند شده‌ای."),
        d("A", "Maybe a little.", "شاید کمی."),
        d("B", "That's how it starts.", "اینطوری شروع می‌شود."),
        d("A", "Ha! Let's go home.", "ها! بیایید برویم خانه."),
        d("B", "Okay. But we're setting a timer.", "باشه. ولی تایمر می‌گذاریم."),
        d("A", "Absolutely.", "قطعاً."),
        d("B", "Thanks again.", "باز هم ممنون."),
        d("A", "Anytime. Bye for now.", "هر وقت. فعلاً خداحافظ."),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "See you tomorrow!", "فردا می‌بینمت!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "Don't forget the timer!", "تایمر را فراموش نکن!"),
        d("B", "Ha! I won't. Promise.", "ها! فراموش نمی‌کنم. قول."),
        d("A", "Good. Bye!", "خوبه. خداحافظ!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Bye!", "خداحافظ!")
    ),
    listOf(
        q("How long has B been playing?", listOf("1 hour", "3 hours", "6 hours", "all day"), 2),
        q("What is B's gaming habit?", listOf("healthy", "obsessive", "occasional", "professional"), 1),
        q("What does A suggest?", listOf("stop gaming forever", "take a break and walk", "sell the console", "go to therapy"), 1),
        q("What plan do they make?", listOf("no gaming", "2 hours a day and daily walks", "gaming only weekends", "nothing"), 1),
        q("It's time you ___ a break.", listOf("take", "took", "taking", "to take"), 1),
        q("I'd rather you ___ go.", listOf("don't", "didn't", "won't", "not"), 1),
        q("I wish I ___ more time.", listOf("have", "had", "will have", "having"), 1),
        q("He seems ___ addicted.", listOf("be", "to be", "being", "been"), 1)
    ),
    idioms = listOf(
        IdiomExpression("Push me", "هلم دادن", "Thanks for pushing me.", "ممنون که هلم دادی."),
        IdiomExpression("Lead the way", "راه را نشان بده", "Lead the way.", "راه را نشان بده."),
        IdiomExpression("That's how it starts", "اینطوری شروع می‌شود", "That's how it starts.", "اینطوری شروع می‌شود."),
        IdiomExpression("Six hours straight", "شش ساعت مداوم", "Six hours straight.", "شش ساعت مداوم."),
        IdiomExpression("What friends are for", "دوست برای همین است", "That's what friends are for.", "دوست برای همین است.")
    ),
    phrasal = listOf(
        PhrasalVerb("cancel on", "کنسل کردن", "cancel plans with",
            "You canceled on him twice.", "دو بار کنسل کردی.", "No"),
        PhrasalVerb("isolate", "منزوی کردن", "separate from others",
            "You've been isolating yourself.", "خودت را منزوی کرده‌ای.", "No"),
        PhrasalVerb("push", "هل دادن", "encourage",
            "Thanks for pushing me.", "ممنون که هلم دادی.", "No"),
        PhrasalVerb("set a timer", "تایمر گذاشتن", "set a limit",
            "We'll set a timer.", "تایمر می‌گذاریم.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Unreal past stress", "It's time we LEFT. I'd rather you DIDN'T go."),
        PronunciationTip("Distancing intonation", "He seems to be addicted. (falling tone = more certain)"),
        PronunciationTip("Time expressions rhythm", "SPEND time. WASTE time. SAVE time.")
    ),
    culture = listOf(
        CulturalNote("Gaming culture", "Gaming is a major global industry and cultural phenomenon, with professional esports and streaming."),
        CulturalNote("Addiction", "Gaming addiction is recognized by the WHO as a mental health condition."),
        CulturalNote("Digital balance", "Balancing screen time with physical activity is a common modern challenge.")
    ),
    mistakes = listOf(
        CommonMistake("It's time you take a break.", "It's time you took a break.", "Use past tense after 'It's time'."),
        CommonMistake("I'd rather you don't go.", "I'd rather you didn't go.", "Use past tense after 'I'd rather you'."),
        CommonMistake("I wish I have more time.", "I wish I had more time.", "Use past simple after 'wish'."),
        CommonMistake("He seems be addicted.", "He seems to be addicted.", "Use 'to be' after 'seems'.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What is B's problem?", "B plays video games for 6 hours and has been isolating himself."),
        ComprehensionQuestion("What does A do?", "A expresses concern, takes B for a walk, and helps set limits."),
        ComprehensionQuestion("What plan do they make?", "Limit gaming to 2 hours a day and go outside daily.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about your gaming or screen habits.", "درباره عادات بازی یا صفحه‌ات صحبت کن.", "I usually... / I spend... / I should limit..."),
        SpeakingTask("Discuss addiction and balance.", "درباره اعتیاد و تعادل صحبت کن.", "It's important to... / I'd rather... / It's time we..."),
        SpeakingTask("Role-play helping a friend with an unhealthy habit.", "نقش‌بازی کمک به دوست با عادت ناسالم.", "I'm worried about you... / It's time you... / Let's...")
    ),
    writing = listOf(
        WritingTask("Write about the importance of balance in life.", "درباره اهمیت تعادل در زندگی بنویس.", 170, "Use distancing and unreal past structures.")
    )
)

// ═══════════════════════════════════════════════════════════════
// FILE 6 — Nobody's perfect | هیچ‌کس کامل نیست
// ═══════════════════════════════════════════════════════════════
private fun file6() = base(
    6, "Nobody's perfect", "هیچ‌کس کامل نیست",
    listOf(
        "Use verb + object + gerund or infinitive",
        "Use conditional sentences (all types)",
        "Talk about compound adjectives and phone language",
        "Discuss perfectionism and self-acceptance"
    ),
    listOf(
        v("perfect", "کامل", "Nobody's perfect.", "هیچ‌کس کامل نیست.", "adjective"),
        v("perfectionist", "کمال‌گرا", "She's a perfectionist about work.", "او درباره کار کمال‌گراست."),
        v("flaw", "عیب", "Everyone has flaws.", "همه عیب دارند."),
        v("accept", "پذیرفتن", "You need to accept yourself.", "باید خودت را بپذیری.", "verb"),
        v("struggle", "دست و پنجه نرم کردن", "He struggles with self-doubt.", "او با خودتردیدی دست و پنجه نرم می‌کند.", "verb"),
        v("self-esteem", "عزت نفس", "Low self-esteem is common.", "عزت نفس پایین رایج است."),
        v("criticize", "انتقاد کردن", "He criticizes himself constantly.", "او مدام خودش را انتقاد می‌کند.", "verb"),
        v("comparison", "مقایسه", "Comparison is the thief of joy.", "مقایسه دزد شادی است."),
        v("imperfection", "نقص", "Embrace your imperfections.", "نقص‌هایت را بپذیر."),
        v("succeed", "موفق شدن", "She succeeded despite her doubts.", "او با وجود تردیدهایش موفق شد.", "verb"),
        v("failure", "شکست", "Failure is part of learning.", "شکست بخشی از یادگیری است."),
        v("encourage", "تشویق کردن", "She encouraged me to try again.", "مرا تشویق کرد دوباره تلاش کنم.", "verb"),
        v("remind", "یادآوری کردن", "He reminded me of my strengths.", "قوت‌هایم را یادآوری کرد.", "verb"),
        v("allow", "اجازه دادن", "Allow yourself to make mistakes.", "به خودت اجازه بده اشتباه کنی.", "verb"),
        v("convince", "قانع کردن", "I convinced her to apply.", "قانعش کردم درخواست دهد.", "verb")
    ),
    listOf(
        GrammarSection("Verb + object + gerund or infinitive", "Some verbs take object + infinitive: want, ask, tell, encourage, remind, allow, convince, persuade. I want you to try. She reminded me to call. Others take object + gerund: avoid, mind, suggest, recommend."),
        GrammarSection("Conditionals (all types)", "Zero: If you heat water, it boils. First: If it rains, I'll stay home. Second: If I had time, I would help. Third: If I had known, I would have come."),
        GrammarSection("Compound adjectives and phone language", "Compound adjectives: well-known, old-fashioned, easy-going, self-confident. Phone language: call back, hang up, get through, put through, cut off.")
    ),
    listOf(
        d("A", "I've been feeling really down lately.", "اخیراً خیلی دلگیر حس می‌کنم."),
        d("B", "Why? What's wrong?", "چرا؟ چی شده؟"),
        d("A", "I made a mistake at work. A big one.", "در کار اشتباهی کردم. یک اشتباه بزرگ."),
        d("B", "What happened?", "چه شد؟"),
        d("A", "I sent an email to the wrong client. It had confidential information.", "ایمیلی برای مشتری اشتباه فرستادم. اطلاعات محرمانه داشت."),
        d("B", "Oh no. What did your boss say?", "اوه نه. رئیست چه گفت؟"),
        d("A", "She was understanding. But I can't forgive myself.", "او فهمید. ولی نمی‌توانم خودم را ببخشم."),
        d("B", "You need to allow yourself to make mistakes.", "باید به خودت اجازه بدهی اشتباه کنی."),
        d("A", "But it was so careless. I should have checked.", "ولی خیلی بی‌دقت بود. باید چک می‌کردم."),
        d("B", "Yes, you should have. But you can't change the past.", "بله، باید می‌کردی. ولی نمی‌توانی گذشته را تغییر دهی."),
        d("A", "I know. I just keep replaying it in my head.", "می‌دانم. فقط مدام در ذهنم تکرارش می‌کنم."),
        d("B", "That's normal. But don't let it define you.", "طبیعی است. ولی نگذار تو را تعریف کند."),
        d("A", "What do you mean?", "منظورت چیست؟"),
        d("B", "One mistake doesn't mean you're a failure. Everyone makes them.", "یک اشتباه یعنی تو شکست‌خواره نیستی. همه مرتکب می‌شوند."),
        d("A", "I know. But I'm such a perfectionist.", "می‌دانم. ولی من خیلی کمال‌گرا هستم."),
        d("B", "That's the problem. Perfectionism makes you miserable.", "مشکل همین است. کمال‌گرایی بدبختت می‌کند."),
        d("A", "You're right. I criticize myself constantly.", "حق داری. مدام خودم را انتقاد می‌کنم."),
        d("B", "Would you treat a friend that way?", "با یک دوست اینطور رفتار می‌کردی؟"),
        d("A", "No, of course not.", "نه، البته که نه."),
        d("B", "Then why treat yourself that way?", "پس چرا با خودت اینطور رفتار می‌کنی؟"),
        d("A", "That's a good question. I don't know.", "سؤال خوبی است. نمی‌دانم."),
        d("B", "You should remind yourself of your strengths.", "باید قوت‌هایت را به خودت یادآوری کنی."),
        d("A", "Like what?", "مثل چی؟"),
        d("B", "You're hardworking. You're talented. Your boss told you so.", "سختکوشی. با استعدادی. رئیست هم گفت."),
        d("A", "She did. She said I was one of her best employees.", "گفت. گفت یکی از بهترین کارکنانش هستم."),
        d("B", "See? One mistake doesn't erase all of that.", "می‌بینی؟ یک اشتباه همه آن را پاک نمی‌کند."),
        d("A", "I guess you're right.", "حدس می‌زنم حق داری."),
        d("B", "I am right. Now, what are you going to do differently?", "حق دارم. حالا، چه کار متفاوتی می‌کنی؟"),
        d("A", "I'll double-check emails before sending them.", "قبل از فرستادن ایمیل‌ها دوباره چک می‌کنم."),
        d("B", "That's a good system. Anything else?", "سیستم خوبی است. چیز دیگری؟"),
        d("A", "I'll stop being so hard on myself.", "دست از سختگیری روی خودم برمی‌دارم."),
        d("B", "That's the most important one.", "این مهم‌ترین است."),
        d("A", "Thanks. I feel a bit better now.", "ممنون. الان کمی بهتر حس می‌کنم."),
        d("B", "Good. Remember, nobody's perfect.", "خوبه. یادت باشد، هیچ‌کس کامل نیست."),
        d("A", "I know. But it's hard to believe sometimes.", "می‌دانم. ولی گاهی سخت است باور کنی."),
        d("B", "That's why friends remind you.", "برای همین دوستان یادآوری می‌کنند."),
        d("A", "You're a good friend.", "دوست خوبی هستی."),
        d("B", "So are you. Now go send an email to the right client.", "تو هم. حالا برو به مشتری درست ایمیل بفرست."),
        d("A", "Ha! I will. Thanks.", "ها! می‌فرستم. ممنون."),
        d("B", "Anytime. Bye!", "هر وقت. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Oh, one more thing.", "اوه، یک چیز دیگر."),
        d("A", "What?", "چی؟"),
        d("B", "If you had checked the email, would you have caught the mistake?", "اگر ایمیل را چک کرده بودی، اشتباه را می‌فهمیدی؟"),
        d("A", "Yes, I would have. Easily.", "بله، می‌فهمیدم. به‌راحتی."),
        d("B", "Then that's your lesson. Just check next time.", "پس درسش همین است. دفعه بعد چک کن."),
        d("A", "You're right. Thanks.", "حق داری. ممنون."),
        d("B", "Anytime. Bye!", "هر وقت. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "Take care!", "مراقب باش!"),
        d("A", "You too!", "تو هم!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "See you tomorrow!", "فردا می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Good luck with the email!", "با ایمیل موفق باشی!"),
        d("A", "Thanks. I'll check it twice.", "ممنون. دو بار چکش می‌کنم."),
        d("B", "Good. Bye!", "خوبه. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!")
    ),
    listOf(
        q("What mistake did A make?", listOf("sent email to wrong client", "missed a deadline", "lost a file", "forgot a meeting"), 0),
        q("What is A's main problem?", listOf("lazy", "perfectionist", "rude", "forgetful"), 1),
        q("What does B suggest?", listOf("quit the job", "blame someone else", "allow mistakes and check emails", "ignore it"), 2),
        q("What's the lesson?", listOf("nobody's perfect", "work harder", "never make mistakes", "avoid email"), 0),
        q("I want you ___ try.", listOf("try", "to try", "trying", "tried"), 1),
        q("She reminded me ___ call.", listOf("call", "to call", "calling", "called"), 1),
        q("If I ___ known, I would have come.", listOf("have", "had", "would have", "did"), 1),
        q("If it ___, I'll stay home.", listOf("rains", "will rain", "rained", "raining"), 0)
    ),
    idioms = listOf(
        IdiomExpression("Hard on yourself", "سختگیری روی خودت", "Don't be so hard on yourself.", "اینقدر روی خودت سخت نگیر."),
        IdiomExpression("Define you", "تعریف کردن تو", "Don't let it define you.", "نگذار تو را تعریف کند."),
        IdiomExpression("Replay in my head", "تکرار در ذهن", "I keep replaying it in my head.", "مدام در ذهنم تکرارش می‌کنم."),
        IdiomExpression("Thief of joy", "دزد شادی", "Comparison is the thief of joy.", "مقایسه دزد شادی است."),
        IdiomExpression("Nobody's perfect", "هیچ‌کس کامل نیست", "Nobody's perfect.", "هیچ‌کس کامل نیست.")
    ),
    phrasal = listOf(
        PhrasalVerb("double-check", "دوباره چک کردن", "verify again",
            "I'll double-check the email.", "ایمیل را دوباره چک می‌کنم.", "No"),
        PhrasalVerb("be hard on", "سختگیری کردن", "criticize",
            "Don't be so hard on yourself.", "اینقدر روی خودت سخت نگیر.", "No"),
        PhrasalVerb("get over", "عبور کردن از", "move past",
            "You need to get over this mistake.", "باید از این اشتباه عبور کنی.", "Yes"),
        PhrasalVerb("remind of", "یادآوری کردن", "cause to remember",
            "She reminded me of my strengths.", "قوت‌هایم را یادآوری کرد.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Verb + object + infinitive stress", "I want YOU to try. She reminded ME to call."),
        PronunciationTip("Conditional rhythm", "If I HAD known, I would have COME."),
        PronunciationTip("Compound adjective stress", "WELL-known. OLD-fashioned. SELF-confident.")
    ),
    culture = listOf(
        CulturalNote("Perfectionism", "Perfectionism is associated with anxiety and burnout. Self-compassion is key to well-being."),
        CulturalNote("Self-esteem", "Self-esteem varies across cultures. Some emphasize individual achievement, others community."),
        CulturalNote("Mistakes", "Attitudes toward mistakes vary. In some cultures, mistakes are learning opportunities; in others, they're stigmatized.")
    ),
    mistakes = listOf(
        CommonMistake("I want you try.", "I want you to try.", "Use 'to + base verb' after object."),
        CommonMistake("She reminded me call.", "She reminded me to call.", "Use 'to + base verb' after 'remind'."),
        CommonMistake("If I would have known, I would have come.", "If I had known, I would have come.", "Use past perfect in third conditional if-clause."),
        CommonMistake("If it will rain, I'll stay home.", "If it rains, I'll stay home.", "Use present simple after 'if' in first conditional.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What was A's mistake?", "A sent a confidential email to the wrong client."),
        ComprehensionQuestion("How does A feel?", "Guilty and unable to forgive himself due to perfectionism."),
        ComprehensionQuestion("What advice does B give?", "Allow mistakes, focus on strengths, and double-check emails.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about a mistake you made and what you learned.", "درباره اشتباهی که کردی و آنچه یاد گرفتی صحبت کن.", "I once... / If I had... / I learned to..."),
        SpeakingTask("Discuss perfectionism with a partner.", "درباره کمال‌گرایی با یک دوست صحبت کن.", "I'm a perfectionist... / It makes me... / I wish I could..."),
        SpeakingTask("Give advice to a friend who's being too hard on themselves.", "به دوستی که روی خودش سخت می‌گیرد توصیه کن.", "You should... / Remember that... / Nobody's perfect.")
    ),
    writing = listOf(
        WritingTask("Write about learning from a mistake.", "درباره یادگیری از یک اشتباه بنویس.", 170, "Use conditionals and verb + object + infinitive.")
    )
)// ═══════════════════════════════════════════════════════════════
// FILE 7 — Behind the scenes | پشت صحنه
// ═══════════════════════════════════════════════════════════════
private fun file7() = base(
    7, "Behind the scenes", "پشت صحنه",
    listOf(
        "Use permission, obligation, and necessity modals",
        "Use verbs of the senses correctly",
        "Talk about prefixes and location/movement",
        "Discuss film, theater, and creative work"
    ),
    listOf(
        v("permission", "اجازه", "You need permission to enter.", "برای ورود به اجازه نیاز داری."),
        v("obligation", "تعهد", "It's an obligation, not a choice.", "این تعهد است، نه انتخاب."),
        v("necessity", "ضرورت", "Water is a necessity.", "آب یک ضرورت است."),
        v("forbidden", "ممنوع", "Smoking is forbidden here.", "سیگار کشیدن اینجا ممنوع است.", "adjective"),
        v("allowed", "مجاز", "Phones are not allowed.", "گوشی‌ها مجاز نیستند.", "adjective"),
        v("required", "الزامی", "A visa is required.", "ویزا الزامی است.", "adjective"),
        v("optional", "اختیاری", "The tour is optional.", "تور اختیاری است.", "adjective"),
        v("rehearsal", "تمرین", "The rehearsal starts at 9.", "تمرین ساعت ۹ شروع می‌شود."),
        v("backstage", "پشت صحنه", "We went backstage after the show.", "بعد از نمایش به پشت صحنه رفتیم."),
        v("script", "فیلم‌نامه", "The script was excellent.", "فیلم‌نامه عالی بود."),
        v("audition", "آدیشن", "She has an audition tomorrow.", "فردا آدیشن دارد."),
        v("director", "کارگردان", "The director was very demanding.", "کارگردان خیلی سختگیر بود."),
        v("understudy", "جانشین", "She's the understudy for the lead.", "او جانشین نقش اصلی است."),
        v("premiere", "نمایش اول", "The premiere is next week.", "نمایش اول هفته بعد است."),
        v("spotlight", "نورافکن", "She stood in the spotlight.", "او زیر نورافکن ایستاد.")
    ),
    listOf(
        GrammarSection("Permission, obligation, necessity", "Permission: can, may, be allowed to. Obligation: must, have to, should, be supposed to. Necessity: need to, have to. Prohibition: mustn't, can't, be not allowed to. No obligation: don't have to, needn't."),
        GrammarSection("Verbs of the senses", "Use look, sound, feel, taste, smell + adjective. Use look/sound/feel + like + noun. Use look/sound/feel + as if/as though + clause."),
        GrammarSection("Prefixes", "Common prefixes: un-, dis-, in-, im-, ir-, il-, mis-, over-, under-, re-. unhappy, disagree, incorrect, impossible, irregular, illegal, misunderstand, overwork, underestimate, rewrite.")
    ),
    listOf(
        d("A", "How was the rehearsal?", "تمرین چطور بود؟"),
        d("B", "Exhausting. The director made us repeat the same scene ten times.", "خسته‌کننده. کارگردان مجبورمان کرد همان صحنه را ده بار تکرار کنیم."),
        d("A", "Ten times? Why?", "ده بار؟ چرا؟"),
        d("B", "He said it didn't feel right. We had to keep going until it did.", "گفت درست حس نمی‌شود. باید ادامه می‌دادیم تا درست شود."),
        d("A", "That sounds intense.", "شدید به نظر می‌رسد."),
        d("B", "It is. But that's theater. You're not allowed to settle for less.", "هست. ولی تئاتر همین است. مجاز نیستی به کمتر راضی شوی."),
        d("A", "Are you supposed to be off-book by now?", "قرار است تا الان متن را حفظ کرده باشی؟"),
        d("B", "Yes, I am. But I keep forgetting one line.", "بله، هستم. ولی مدام یک خط را فراموش می‌کنم."),
        d("A", "Which line?", "کدام خط؟"),
        d("B", "The one about the letter. I don't know why.", "آن یکی درباره نامه. نمی‌دانم چرا."),
        d("A", "Maybe you need to understand the character better.", "شاید باید شخصیت را بهتر بفهمی."),
        d("B", "That's what my acting coach said. She told me to write a backstory.", "مربی بازیگری‌ام همین را گفت. گفت یک پیش‌داستان بنویسم."),
        d("A", "Did you?", "نوشتی؟"),
        d("B", "Yes. It helped a lot. I feel more connected to her now.", "بله. خیلی کمک کرد. الان بیشتر به او متصل حس می‌کنم."),
        d("A", "That's great. When is the premiere?", "عالی است. نمایش اول کی است؟"),
        d("B", "Next Friday. I'm terrified.", "جمعه آینده. وحشت‌زده‌ام."),
        d("A", "You'll be fine. You're a great actress.", "خوب می‌شوی. بازیگر عالی‌ای هستی."),
        d("B", "Thanks. But I'm the understudy for the lead. What if she gets sick?", "ممنون. ولی من جانشین نقش اصلی هستم. اگر مریض شود چه؟"),
        d("A", "Then you'll go on. And you'll be amazing.", "آن موقع روی صحنه می‌روی. و شگفت‌انگیز می‌شوی."),
        d("B", "I hope so. I've been practicing her lines too, just in case.", "امیدوارم. خطوط او را هم تمرین کرده‌ام، فقط در صورت نیاز."),
        d("A", "That's smart. Are you allowed to watch from backstage?", "هوشمندانه است. مجازی از پشت صحنه تماشا کنی؟"),
        d("B", "Yes, I can stand in the wings. It helps me learn the blocking.", "بله، می‌توانم در کناره‌ها بایستم. به یادگیری جایگیری کمک می‌کند."),
        d("A", "What's the set like?", "دکور چطور است؟"),
        d("B", "Beautiful. There's a huge staircase and a spotlight that follows the lead.", "زیبا. یک پله بزرگ و یک نورافکن که نقش اصلی را دنبال می‌کند."),
        d("A", "That sounds dramatic.", "دراماتیک به نظر می‌رسد."),
        d("B", "It is. The whole thing feels like a dream.", "هست. کل ماجرا مثل یک رویا است."),
        d("A", "I can't wait to see it.", "صبر نمی‌کنم ببینمش."),
        d("B", "You're coming to the premiere?", "به نمایش اول می‌آیی؟"),
        d("A", "Of course! I wouldn't miss it.", "البته! از دستش نمی‌دهم."),
        d("B", "Thanks. It means a lot.", "ممنون. خیلی معنی دارد."),
        d("A", "Do you have to wear a costume?", "باید لباس خاصی بپوشی؟"),
        d("B", "Yes. A long dress. It's uncomfortable but beautiful.", "بله. یک لباس بلند. ناراحت است ولی زیبا."),
        d("A", "Can you move easily in it?", "می‌توانی راحت در آن حرکت کنی؟"),
        d("B", "Not really. But I'm getting used to it.", "نه واقعاً. ولی دارم عادت می‌کنم."),
        d("A", "Practice makes perfect.", "تمرین باعث کمال می‌شود."),
        d("B", "True. Well, I should go. I have another rehearsal tonight.", "درست. خب، باید بروم. امشب تمرین دیگری دارم."),
        d("A", "Another one? You must be exhausted.", "یکی دیگر؟ باید خسته باشی."),
        d("B", "I am. But I love it. This is my dream.", "هستم. ولی عاشقش هستم. این رویای من است."),
        d("A", "That's inspiring. Go get 'em!", "الهام‌بخش است. برو موفق شو!"),
        d("B", "Thanks! See you at the premiere.", "ممنون! در نمایش اول می‌بینمت."),
        d("A", "I'll be there!", "آنجا هستم!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye! Break a leg!", "خداحافظ! موفق باشی!"),
        d("B", "Ha! Thanks. Bye!", "ها! ممنون. خداحافظ!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "Oh, one more thing.", "اوه، یک چیز دیگر."),
        d("B", "What?", "چی؟"),
        d("A", "Are you allowed to film backstage?", "مجازی پشت صحنه فیلم‌برداری کنی؟"),
        d("B", "No, absolutely forbidden. The director is very strict.", "نه، کاملاً ممنوع. کارگردان خیلی سختگیر است."),
        d("A", "Good to know. I won't ask for a tour then.", "خوب است بدانم. پس درخواست تور نمی‌کنم."),
        d("B", "Ha! Maybe after the show.", "ها! شاید بعد از نمایش."),
        d("A", "Deal. Bye!", "قبول. خداحافظ!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Good luck!", "موفق باشی!"),
        d("B", "Thanks! Bye!", "ممنون! خداحافظ!"),
        d("A", "See you Friday!", "جمعه می‌بینمت!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Break a leg!", "موفق باشی!"),
        d("B", "Thanks!", "ممنون!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Bye!", "خداحافظ!")
    ),
    listOf(
        q("How many times did they repeat the scene?", listOf("3", "5", "10", "20"), 2),
        q("What role is B?", listOf("lead", "understudy", "director", "stagehand"), 1),
        q("What is forbidden backstage?", listOf("talking", "filming", "eating", "photography"), 1),
        q("When is the premiere?", listOf("Monday", "Wednesday", "Friday", "Sunday"), 2),
        q("You ___ smoke here. It's forbidden.", listOf("mustn't", "don't have to", "needn't", "can"), 0),
        q("You ___ come if you don't want to.", listOf("mustn't", "don't have to", "can't", "shouldn't"), 1),
        q("She ___ be tired after rehearsal.", listOf("must", "can't", "might", "should"), 0),
        q("It ___ like a dream.", listOf("looks", "sounds", "feels", "tastes"), 1)
    ),
    idioms = listOf(
        IdiomExpression("Break a leg", "موفق باشی", "Break a leg!", "موفق باشی!"),
        IdiomExpression("Off-book", "حفظ کردن متن", "You're supposed to be off-book.", "قرار است متن را حفظ کرده باشی."),
        IdiomExpression("Settle for less", "به کمتر راضی شدن", "Don't settle for less.", "به کمتر راضی نشو."),
        IdiomExpression("Go on", "روی صحنه رفتن", "You'll go on.", "روی صحنه می‌روی."),
        IdiomExpression("In the wings", "در کناره‌ها", "I stand in the wings.", "در کناره‌ها می‌ایستم.")
    ),
    phrasal = listOf(
        PhrasalVerb("go on", "روی صحنه رفتن", "perform",
            "You'll go on if she's sick.", "اگر مریض باشد روی صحنه می‌روی.", "No"),
        PhrasalVerb("settle for", "راضی شدن به", "accept less",
            "Don't settle for less.", "به کمتر راضی نشو.", "No"),
        PhrasalVerb("get used to", "عادت کردن", "become accustomed",
            "I'm getting used to the costume.", "دارم به لباس عادت می‌کنم.", "No"),
        PhrasalVerb("write up", "نوشتن", "write in detail",
            "I wrote up a backstory.", "یک پیش‌داستان نوشتم.", "Yes")
    ),
    pronunciation = listOf(
        PronunciationTip("Modals of obligation stress", "You MUSTn't smoke. You DON'T have to come."),
        PronunciationTip("Senses verbs", "It LOOKS beautiful. It SOUNDS dramatic. It FEELS like a dream."),
        PronunciationTip("Prefix stress", "UNhappy. DISagree. IMpossible. IRregular.")
    ),
    culture = listOf(
        CulturalNote("Theater etiquette", "In theater, 'break a leg' is said to actors for good luck. Filming backstage is often forbidden."),
        CulturalNote("Understudies", "Understudies learn the lead role in case the main actor can't perform."),
        CulturalNote("Rehearsal process", "Theater rehearsals are intensive and repetitive, requiring patience and dedication.")
    ),
    mistakes = listOf(
        CommonMistake("You mustn't come if you don't want to.", "You don't have to come if you don't want to.", "Use 'don't have to' for no obligation, 'mustn't' for prohibition."),
        CommonMistake("She must to be tired.", "She must be tired.", "After 'must', use base verb."),
        CommonMistake("It looks like beautiful.", "It looks beautiful.", "Use adjective after 'looks', not 'like + adjective'."),
        CommonMistake("I'm used to wake up early.", "I'm used to waking up early.", "Use gerund after 'be used to'.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What is B's role in the play?", "B is the understudy for the lead role."),
        ComprehensionQuestion("How does B prepare?", "By writing a backstory, practicing lines, and watching from the wings."),
        ComprehensionQuestion("What does A plan to do?", "Attend the premiere and support B.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about a performance you've seen or been in.", "درباره نمایشی که دیده‌ای یا در آن بوده‌ای صحبت کن.", "I was... / It felt like... / We had to..."),
        SpeakingTask("Discuss rules and permissions in different places.", "درباره قوانین و مجوزها در مکان‌های مختلف صحبت کن.", "You're not allowed to... / You must... / You don't have to..."),
        SpeakingTask("Role-play a director giving instructions.", "نقش‌بازی کارگردان که دستور می‌دهد.", "I need you to... / You must... / Let's try it again.")
    ),
    writing = listOf(
        WritingTask("Write a review of a play or film.", "نقد یک نمایش یا فیلم بنویس.", 170, "Use modals of obligation and verbs of the senses.")
    )
)

// ═══════════════════════════════════════════════════════════════
// FILE 8 — Emergency! | اضطراری!
// ═══════════════════════════════════════════════════════════════
private fun file8() = base(
    8, "Emergency!", "اضطراری!",
    listOf(
        "Use gerunds and infinitives correctly",
        "Describe future plans and arrangements",
        "Talk about health, medicine, tourism, and travel",
        "Discuss emergencies and first aid"
    ),
    listOf(
        v("emergency", "اضطراری", "Call 911 in an emergency.", "در اضطراری با ۹۱۱ تماس بگیر."),
        v("ambulance", "آمبولانس", "The ambulance arrived quickly.", "آمبولانس سریع رسید."),
        v("injury", "آسیب", "She suffered a head injury.", "او آسیب سر دید."),
        v("treatment", "درمان", "He needs immediate treatment.", "به درمان فوری نیاز دارد."),
        v("symptom", "علامت", "What are the symptoms?", "علائم چیست؟"),
        v("diagnosis", "تشخیص", "The diagnosis was pneumonia.", "تشخیص ذات‌الریه بود."),
        v("recover", "بهبود یافتن", "She's recovering well.", "او خوب بهبود می‌یابد.", "verb"),
        v("tourism", "گردشگری", "Tourism is important for the economy.", "گردشگری برای اقتصاد مهم است."),
        v("destination", "مقصد", "It's a popular tourist destination.", "مقصد گردشگری محبوبی است."),
        v("accommodation", "اقامت", "We booked accommodation online.", "اقامت را آنلاین رزرو کردیم."),
        v("itinerary", "برنامه سفر", "Our itinerary is packed.", "برنامه سفرمان پر است."),
        v("sightseeing", "گشت‌وگذار", "We went sightseeing all day.", "تمام روز گشت‌وگذار کردیم."),
        v("insurance", "بیمه", "Travel insurance is essential.", "بیمه سفر ضروری است."),
        v("prescription", "نسخه", "The doctor wrote a prescription.", "دکتر نسخه نوشت."),
        v("allergic", "حساس", "I'm allergic to penicillin.", "به پنی‌سیلین حساسیت دارم.", "adjective")
    ),
    listOf(
        GrammarSection("Gerunds and infinitives", "Use gerunds after prepositions, as subjects, and after certain verbs. Use infinitives after adjectives, to express purpose, and after certain verbs. Swimming is fun. I want to travel. I went to see a doctor."),
        GrammarSection("Future plans and arrangements", "Use 'going to' for plans, present continuous for arrangements, 'will' for predictions and spontaneous decisions. I'm going to study medicine. I'm meeting the doctor at 3. I'll call you."),
        GrammarSection("Health and travel vocabulary", "Collocations: catch a cold, break a leg, take medicine, make an appointment, book a flight, pack a suitcase, check in, board a plane.")
    ),
    listOf(
        d("A", "Did you hear about Sarah?", "درباره سارا شنیدی؟"),
        d("B", "No, what happened?", "نه، چه شد؟"),
        d("A", "She had an emergency on her trip to Thailand.", "در سفرش به تایلند یک اضطراری داشت."),
        d("B", "Oh no! What happened?", "اوه نه! چه شد؟"),
        d("A", "She fell while hiking and broke her ankle.", "در حین کوه‌پیمایی افتاد و مچ پایش شکست."),
        d("B", "That's terrible. Was she alone?", "وحشتناک است. تنها بود؟"),
        d("A", "No, luckily she was with a group. They called an ambulance.", "نه، خوشبختانه با یک گروه بود. آمبولانس خبر کردند."),
        d("B", "How long did it take for help to arrive?", "چقدر طول کشید کمک برسد؟"),
        d("A", "About an hour. They were in a remote area.", "حدود یک ساعت. در منطقه دورافتاده‌ای بودند."),
        d("B", "An hour with a broken ankle? That must have been agony.", "یک ساعت با مچ شکسته؟ باید عذاب بوده باشد."),
        d("A", "She said it was the worst pain of her life.", "گفت بدترین درد زندگی‌اش بود."),
        d("B", "Did she have travel insurance?", "بیمه سفر داشت؟"),
        d("A", "Yes, thank God. Otherwise the hospital bill would have been huge.", "بله، خدا را شکر. وگرنه قبض بیمارستان نجومی می‌شد."),
        d("B", "How much was it?", "چقدر بود؟"),
        d("A", "Over ten thousand dollars. But insurance covered it.", "بیش از ده هزار دلار. ولی بیمه پوشش داد."),
        d("B", "That's why you should never travel without insurance.", "برای همین است که هرگز نباید بدون بیمه سفر کنی."),
        d("A", "Exactly. She learned that lesson the hard way.", "دقیقاً. این درس را به سختی یاد گرفت."),
        d("B", "How is she now?", "الان چطور است؟"),
        d("A", "She's recovering. She had surgery in Bangkok.", "دارد بهبود می‌یابد. در بانکوک جراحی شد."),
        d("B", "How long does she have to stay there?", "چقدر باید آنجا بماند؟"),
        d("A", "The doctor said at least two weeks. She's going to fly home after that.", "دکتر گفت حداقل دو هفته. بعد از آن به خانه پرواز می‌کند."),
        d("B", "Is she able to walk?", "می‌تواند راه برود؟"),
        d("A", "Not yet. She's using crutches and taking painkillers.", "هنوز نه. از عصا استفاده می‌کند و مسکن می‌خورد."),
        d("B", "Does she have someone helping her?", "کسی کمکش می‌کند؟"),
        d("A", "Yes, one of her friends stayed with her. She's very grateful.", "بله، یکی از دوستانش با او ماند. خیلی شکرگزار است."),
        d("B", "That's good. What was the diagnosis exactly?", "خوبه. تشخیص دقیقاً چه بود؟"),
        d("A", "A fractured ankle and some ligament damage.", "مچ شکسته و آسیب رباط."),
        d("B", "Did she need a prescription for the pain?", "برای درد نسخه لازم داشت؟"),
        d("A", "Yes. She's allergic to some medicines, so they had to be careful.", "بله. به برخی داروها حساسیت دارد، پس باید مراقب می‌بودند."),
        d("B", "That must have been complicated.", "باید پیچیده بوده باشد."),
        d("A", "It was. But the doctors were excellent.", "بود. ولی دکترها عالی بودند."),
        d("B", "Will she be able to travel again?", "می‌تواند دوباره سفر کند؟"),
        d("A", "Yes, but she's going to take it easy for a while.", "بله، ولی قرار است مدتی آرام بگیرد."),
        d("B", "I don't blame her. That experience would scare anyone.", "سرزنشش نمی‌کنم. آن تجربه هر کسی را می‌ترساند."),
        d("A", "She said she's going to buy better hiking boots.", "گفت قرار است کفش‌های کوه‌پیمایی بهتری بخرد."),
        d("B", "Ha! That's a good plan.", "ها! برنامه خوبی است."),
        d("A", "She's also going to learn basic first aid.", "همچنین قرار است کمک‌های اولیه یاد بگیرد."),
        d("B", "That's smart. Everyone should know first aid.", "هوشمندانه است. همه باید کمک‌های اولیه بدانند."),
        d("A", "I agree. I'm thinking about taking a course myself.", "موافقم. خودم به فکر گذراندن دوره‌ام."),
        d("B", "You should. It could save a life.", "باید بکنی. می‌تواند یک زندگی را نجات دهد."),
        d("A", "Exactly. Anyway, she's in good spirits now.", "دقیقاً. به‌هرحال، الان روحیه خوبی دارد."),
        d("B", "That's the most important thing.", "مهم‌ترین چیز همین است."),
        d("A", "She said she wants to go back to Thailand next year.", "گفت می‌خواهد سال بعد به تایلند برگردد."),
        d("B", "Really? After all that?", "واقعاً؟ بعد از همه آن؟"),
        d("A", "She loves it there. She's not going to let one accident stop her.", "عاشق آنجاست. نمی‌گذارد یک تصادف متوقفش کند."),
        d("B", "That's inspiring. You should tell her I said that.", "الهام‌بخش است. باید بگویی به او گفتم."),
        d("A", "I will. She'll appreciate it.", "می‌گویم. قدردان می‌شود."),
        d("B", "Well, I should go. I'm meeting a friend for lunch.", "خب، باید بروم. با دوستی برای ناهار قرار دارم."),
        d("A", "Okay. Say hi to Sarah when you talk to her.", "باشه. وقتی با سارا صحبت کردی سلام برسان."),
        d("B", "I will. See you soon!", "می‌رسانم. به‌زودی می‌بینمت!"),
        d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Oh, one more thing.", "اوه، یک چیز دیگر."),
        d("B", "What?", "چی؟"),
        d("A", "Do you know any good first aid courses?", "دوره کمک‌های اولیه خوبی می‌شناسی؟"),
        d("B", "Yes, the Red Cross offers them. I'll send you the link.", "بله، صلیب سرخ ارائه می‌دهد. لینک را می‌فرستم."),
        d("A", "Perfect. Thanks!", "عالی. ممنون!"),
        d("B", "Anytime. Bye!", "هر وقت. خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "See you!", "می‌بینمت!"),
        d("A", "See you!", "می‌بینمت!"),
        d("B", "Take care!", "مراقب باش!"),
        d("A", "You too!", "تو هم!"),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!"),
        d("B", "Good luck with the course!", "با دوره موفق باشی!"),
        d("A", "Thanks! I'll need it.", "ممنون! نیاز دارم."),
        d("B", "Bye!", "خداحافظ!"),
        d("A", "Bye!", "خداحافظ!")
    ),
    listOf(
        q("What happened to Sarah?", listOf("broke her leg", "broke her ankle", "broke her arm", "broke her wrist"), 1),
        q("Did she have travel insurance?", listOf("No", "Yes", "Only medical", "Not mentioned"), 1),
        q("How long must she stay in Bangkok?", listOf("1 week", "2 weeks", "1 month", "3 weeks"), 1),
        q("What is Sarah going to do next year?", listOf("stay home", "go back to Thailand", "move there", "never travel"), 1),
        q("I want ___ travel.", listOf("travel", "to travel", "traveling", "traveled"), 1),
        q("I'm going to ___ medicine.", listOf("study", "studying", "studied", "studies"), 0),
        q("I'm ___ the doctor at 3.", listOf("meet", "meeting", "met", "meets"), 1),
        q("I went to the store ___ milk.", listOf("buy", "to buy", "buying", "bought"), 1)
    ),
    idioms = listOf(
        IdiomExpression("The hard way", "به سختی", "She learned the lesson the hard way.", "درس را به سختی یاد گرفت."),
        IdiomExpression("In good spirits", "روحیه خوب", "She's in good spirits.", "روحیه خوبی دارد."),
        IdiomExpression("Take it easy", "آرام گرفتن", "She's going to take it easy.", "قرار است آرام بگیرد."),
        IdiomExpression("Don't blame her", "سرزنشش نمی‌کنم", "I don't blame her.", "سرزنشش نمی‌کنم."),
        IdiomExpression("Could save a life", "می‌تواند یک زندگی را نجات دهد", "It could save a life.", "می‌تواند یک زندگی را نجات دهد.")
    ),
    phrasal = listOf(
        PhrasalVerb("check in", "پذیرش شدن", "register",
            "We checked in at the hospital.", "در بیمارستان پذیرش شدیم.", "No"),
        PhrasalVerb("take up", "شروع کردن", "start",
            "She's taking up first aid.", "در حال شروع کمک‌های اولیه است.", "Yes"),
        PhrasalVerb("put off", "به تعویق انداختن", "postpone",
            "Don't put off getting insurance.", "گرفتن بیمه را به تعویق نینداز.", "Yes"),
        PhrasalVerb("look after", "مراقبت کردن", "take care of",
            "Her friend looked after her.", "دوستش از او مراقبت کرد.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Gerund vs. infinitive stress", "I enJOY traveling. I WANT to travel."),
        PronunciationTip("Future arrangements", "I'm MEETing the doctor at 3. I'm GOing to study."),
        PronunciationTip("Medical vocabulary stress", "AMbulance. DIagnosis. PREscription. ALlergic.")
    ),
    culture = listOf(
        CulturalNote("Travel insurance", "Travel insurance is essential for international trips, covering medical emergencies and cancellations."),
        CulturalNote("First aid", "Basic first aid knowledge can be life-saving in emergencies."),
        CulturalNote("Medical tourism", "Some travelers seek medical treatment abroad due to cost or quality differences.")
    ),
    mistakes = listOf(
        CommonMistake("I want travel.", "I want to travel.", "Use 'to + base verb' after 'want'."),
        CommonMistake("I enjoy to travel.", "I enjoy traveling.", "Use gerund after 'enjoy'."),
        CommonMistake("I'm going to studying medicine.", "I'm going to study medicine.", "Use base verb after 'going to'."),
        CommonMistake("I'm meet the doctor at 3.", "I'm meeting the doctor at 3.", "Use present continuous for arrangements.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What happened to Sarah in Thailand?", "She fell while hiking, broke her ankle, and needed surgery."),
        ComprehensionQuestion("What did she learn?", "She learned the importance of travel insurance and first aid."),
        ComprehensionQuestion("What are her future plans?", "She plans to return to Thailand and has bought better boots.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about a travel emergency you've had or heard about.", "درباره یک اضطراری سفر که داشته‌ای یا شنیده‌ای صحبت کن.", "I once... / It was terrifying... / I learned to..."),
        SpeakingTask("Discuss the importance of travel insurance.", "درباره اهمیت بیمه سفر صحبت کن.", "You should always... / It covers... / Without it..."),
        SpeakingTask("Role-play calling emergency services.", "نقش‌بازی تماس با خدمات اضطراری.", "I need an ambulance... / We're at... / The person is...")
    ),
    writing = listOf(
        WritingTask("Write about a travel experience that went wrong.", "درباره یک تجربه سفر که بد پیش رفت بنویس.", 170, "Use gerunds, infinitives, and future forms.")
    )
)    // ═══════════════════════════════════════════════════════════════
    // FILE 9 — A change of plan | تغییر برنامه
    // ═══════════════════════════════════════════════════════════════
    private fun file9() = base(
        9, "A change of plan", "تغییر برنامه",
        listOf(
            "Use compound and possessive noun forms",
            "Talk about food preparation and nature",
            "Discuss flexibility and adaptability",
            "Use noun phrases and compound nouns"
        ),
        listOf(
            v("plan", "برنامه", "Our plans changed suddenly.", "برنامه‌هایمان ناگهان تغییر کرد."),
            v("adapt", "انطباق پیدا کردن", "You need to adapt to changes.", "باید با تغییرات انطباق پیدا کنی.", "verb"),
            v("flexible", "منعطف", "Be flexible with your schedule.", "با برنامه‌ات منعطف باش.", "adjective"),
            v("alternative", "جایگزین", "We found an alternative route.", "مسیر جایگزینی پیدا کردیم."),
            v("ingredient", "ماده تشکیل‌دهنده", "What are the ingredients?", "مواد تشکیل‌دهنده چیست؟"),
            v("recipe", "دستور پخت", "Can you share the recipe?", "می‌توانی دستور پخت را بدهی؟"),
            v("prepare", "آماده کردن", "She prepared a delicious meal.", "او غذای خوشمزه‌ای آماده کرد.", "verb"),
            v("season", "چاشنی زدن", "Season the soup with salt.", "سوپ را با نمک چاشنی بزن.", "verb"),
            v("nature", "طبیعت", "We spent the weekend in nature.", "آخر هفته را در طبیعت گذراندیم."),
            v("wildlife", "حیات وحش", "The wildlife is protected here.", "حیات وحش اینجا محافظت می‌شود."),
            v("landscape", "منظره", "The landscape is breathtaking.", "منظره نفس‌گیر است."),
            v("environment", "محیط زیست", "We must protect the environment.", "باید از محیط زیست محافظت کنیم."),
            v("sustainable", "پایدار", "Sustainable farming is important.", "کشاورزی پایدار مهم است.", "adjective"),
            v("organic", "ارگانیک", "We buy organic vegetables.", "سبزیجات ارگانیک می‌خریم.", "adjective"),
            v("flavor", "طعم", "The flavor is incredible.", "طعمش باورنکردنی است.")
        ),
        listOf(
            GrammarSection("Compound and possessive nouns", "Compound nouns: toothbrush, haircut, football, mother-in-law. Possessive forms: John's car, the children's toys, the boss's office."),
            GrammarSection("Noun phrases", "Use articles, quantifiers, and adjectives to build noun phrases: a beautiful old wooden table, the three happy children."),
            GrammarSection("Food and nature collocations", "prepare a meal, follow a recipe, season to taste, protect the environment, enjoy nature, observe wildlife.")
        ),
        listOf(
            d("A", "Our weekend plans completely changed.", "برنامه‌های آخر هفته‌مان کاملاً عوض شد."),
            d("B", "What happened?", "چه شد؟"),
            d("A", "The weather forecast was terrible. Rain all weekend.", "پیش‌بینی هوا وحشتناک بود. تمام آخر هفته باران."),
            d("B", "Oh no. What did you do?", "اوه نه. چه کار کردی؟"),
            d("A", "We had planned to go camping. But we had to adapt.", "قرار بود کمپینگ برویم. ولی مجبور شدیم انطباق پیدا کنیم."),
            d("B", "What was your alternative?", "جایگزینت چه بود؟"),
            d("A", "We decided to have a cooking weekend at home.", "تصمیم گرفتیم آخر هفته آشپزی در خانه داشته باشیم."),
            d("B", "That sounds fun! What did you cook?", "سرگرم‌کننده به نظر می‌رسد! چه پختی؟"),
            d("A", "We tried three new recipes. All vegetarian.", "سه دستور پخت جدید امتحان کردیم. همه گیاهی."),
            d("B", "Really? What were the ingredients?", "واقعاً؟ مواد تشکیل‌دهنده چه بود؟"),
            d("A", "Lots of vegetables from the farmers' market. And organic herbs.", "سبزیجات زیاد از بازار کشاورزان. و گیاهان ارگانیک."),
            d("B", "That sounds healthy and delicious.", "سالم و خوشمزه به نظر می‌رسد."),
            d("A", "It was. My favorite was a mushroom risotto.", "بود. مورد علاقه‌ام ریزوتوی قارچ بود."),
            d("B", "Mmm. I love risotto. Was it difficult to make?", "مم. عاشق ریزوتویم. درست کردنش سخت بود؟"),
            d("A", "A bit. You have to stir it constantly. But it's worth it.", "کمی. باید مدام همش بزنی. ولی ارزشش را دارد."),
            d("B", "Did you season it with anything special?", "با چیز خاصی چاشنی‌اش کردی؟"),
            d("A", "Just salt, pepper, and a little parmesan. Simple but perfect.", "فقط نمک، فلفل، و کمی پارمزان. ساده ولی عالی."),
            d("B", "I'd love the recipe.", "دستور پخت را دوست دارم."),
            d("A", "I'll send it to you.", "برایت می‌فرستم."),
            d("B", "Thanks. So, did you miss camping?", "ممنون. خب، دلت برای کمپینگ تنگ شد؟"),
            d("A", "A little. But the cooking weekend was just as good.", "کمی. ولی آخر هفته آشپزی هم به همان خوبی بود."),
            d("B", "Do you go camping often?", "زیاد کمپینگ می‌روی؟"),
            d("A", "Yes. I love being in nature. The wildlife, the landscape.", "بله. عاشق بودن در طبیعتم. حیات وحش، منظره."),
            d("B", "Where do you usually go?", "معمولاً کجا می‌روی؟"),
            d("A", "There's a national park north of the city. It's beautiful.", "پارک ملی در شمال شهر هست. زیباست."),
            d("B", "Is it protected?", "محافظت می‌شود؟"),
            d("A", "Yes. The environment there is carefully managed.", "بله. محیط زیست آنجا با دقت مدیریت می‌شود."),
            d("B", "That's good. We need more sustainable tourism.", "خوبه. به گردشگری پایدارتر نیاز داریم."),
            d("A", "Exactly. I always follow the 'leave no trace' rule.", "دقیقاً. همیشه قانون «هیچ ردی نگذار» را رعایت می‌کنم."),
            d("B", "What's that?", "آن چیست؟"),
            d("A", "You take everything you bring. And you leave nothing behind.", "هر چیزی که می‌آوری را برمی‌داری. و هیچ چیز جا نمی‌گذاری."),
            d("B", "That's a great principle.", "اصل عالی‌ای است."),
            d("A", "It is. We need to protect these places for future generations.", "هست. باید این مکان‌ها را برای نسل‌های آینده محافظت کنیم."),
            d("B", "I agree. Maybe I'll join you next time.", "موافقم. شاید دفعه بعد به تو ملحق شوم."),
            d("A", "You should! The more, the merrier.", "باید بیایی! هر چه بیشتر، شادتر."),
            d("B", "Deal. But I'll bring my own food. I'm not a great cook.", "قبول. ولی غذای خودم را می‌آورم. آشپز خوبی نیستم."),
            d("A", "Ha! Don't worry. I'll teach you.", "ها! نگران نباش. یادت می‌دهم."),
            d("B", "Thanks. Well, I should go. I have to prepare dinner.", "ممنون. خب، باید بروم. باید شام آماده کنم."),
            d("A", "What are you making?", "چه درست می‌کنی؟"),
            d("B", "A simple pasta. Nothing fancy.", "پاستای ساده. چیز خاصی نه."),
            d("A", "Sounds good. Enjoy!", "خوب به نظر می‌رسد. لذت ببر!"),
            d("B", "Thanks. See you soon!", "ممنون. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Oh, one more thing.", "اوه، یک چیز دیگر."),
            d("B", "What?", "چی؟"),
            d("A", "Do you want the risotto recipe now?", "دستور پخت ریزوتو را الان می‌خواهی؟"),
            d("B", "Yes, please! Send it tonight.", "بله، لطفاً! امشب بفرست."),
            d("A", "I will. Bye!", "می‌فرستم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "See you!", "می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Enjoy your pasta!", "از پاستایت لذت ببر!"),
            d("B", "Thanks! Bye!", "ممنون! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "See you soon!", "به‌زودی می‌بینمت!"),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Why did plans change?", listOf("rain", "snow", "wind", "heat"), 0),
            q("What did they do instead?", listOf("stayed home and cooked", "went to a museum", "watched movies", "visited friends"), 0),
            q("What was the favorite dish?", listOf("pasta", "risotto", "pizza", "salad"), 1),
            q("What is the 'leave no trace' rule?", listOf("take everything, leave nothing", "leave food", "take photos", "leave marks"), 0),
            q("I'd love the recipe.", listOf("correct", "incorrect", "formal", "informal"), 0),
            q("We decided ___ a cooking weekend.", listOf("have", "to have", "having", "had"), 1),
            q("I'm used to ___ early.", listOf("wake", "waking", "woke", "woken"), 1),
            q("She's interested in ___ new recipes.", listOf("try", "trying", "to try", "tried"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Adapt", "انطباق پیدا کردن", "We had to adapt.", "مجبور شدیم انطباق پیدا کنیم."),
            IdiomExpression("Leave no trace", "هیچ ردی نگذار", "Follow the leave no trace rule.", "قانون هیچ ردی نگذار را رعایت کن."),
            IdiomExpression("The more the merrier", "هر چه بیشتر شادتر", "The more, the merrier.", "هر چه بیشتر، شادتر."),
            IdiomExpression("Worth it", "ارزشش را دارد", "It's worth it.", "ارزشش را دارد."),
            IdiomExpression("Nothing fancy", "چیز خاصی نه", "Nothing fancy.", "چیز خاصی نه.")
        ),
        phrasal = listOf(
            PhrasalVerb("adapt to", "انطباق با", "adjust to",
                "We adapted to the new plan.", "با برنامه جدید انطباق پیدا کردیم.", "No"),
            PhrasalVerb("join in", "ملحق شدن", "participate",
                "Join in next time.", "دفعه بعد ملحق شو.", "No"),
            PhrasalVerb("prepare for", "آماده شدن برای", "get ready for",
                "Prepare for the trip.", "برای سفر آماده شو.", "No"),
            PhrasalVerb("look after", "مراقبت کردن", "take care of",
                "Look after the environment.", "از محیط زیست مراقبت کن.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Compound noun stress", "TOOTHbrush. HAIRcut. FOOTball. MOTHER-in-law."),
            PronunciationTip("Possessive stress", "John's CAR. The CHILdren's TOYS."),
            PronunciationTip("Food vocabulary", "inGREDient. RECipe. FLAvor. ORganic.")
        ),
        culture = listOf(
            CulturalNote("Sustainable tourism", "Sustainable tourism aims to minimize environmental impact and support local communities."),
            CulturalNote("Leave no trace", "The 'leave no trace' principle is common in outdoor recreation and conservation."),
            CulturalNote("Farmers' markets", "Farmers' markets are popular for fresh, local, and organic produce.")
        ),
        mistakes = listOf(
            CommonMistake("I'd love the recipe.", "I'd love the recipe. (Correct — polite request)", "Use 'I'd love + noun' for polite requests."),
            CommonMistake("We decided having a cooking weekend.", "We decided to have a cooking weekend.", "Use infinitive after 'decide'."),
            CommonMistake("I'm interested in try new recipes.", "I'm interested in trying new recipes.", "Use gerund after prepositions."),
            CommonMistake("I'm used to wake up early.", "I'm used to waking up early.", "Use gerund after 'be used to'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What was the original plan?", "Camping, but rain forced a change."),
            ComprehensionQuestion("What did they do instead?", "Had a cooking weekend trying new vegetarian recipes."),
            ComprehensionQuestion("What principle does A follow in nature?", "The 'leave no trace' rule — take everything, leave nothing.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a time plans changed unexpectedly.", "درباره زمانی که برنامه‌ها غیرمنتظره تغییر کرد صحبت کن.", "We had planned... / But then... / We decided to..."),
            SpeakingTask("Discuss sustainable living and nature.", "درباره زندگی پایدار و طبیعت صحبت کن.", "We should... / It's important to... / Leave no trace..."),
            SpeakingTask("Give a recipe and explain how to make it.", "یک دستور پخت بده و توضیح بده چطور درست می‌شود.", "First, you... / Then... / Season with...")
        ),
        writing = listOf(
            WritingTask("Write about a time you had to adapt to a change.", "درباره زمانی که مجبور شدی با تغییری انطباق پیدا کنی بنویس.", 170, "Use compound nouns and noun phrases.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // FILE 10 — Heroes and villains | قهرمانان و تبهکاران
    // ═══════════════════════════════════════════════════════════════
    private fun file10() = base(
        10, "Heroes and villains", "قهرمانان و تبهکاران",
        listOf(
            "Use emphatic structures (cleft sentences, inversion)",
            "Use comparatives and superlatives for emphasis",
            "Talk about nouns, adjectives, and verbs",
            "Discuss heroes, villains, and morality"
        ),
        listOf(
            v("hero", "قهرمان", "He's a real hero.", "او قهرمان واقعی است."),
            v("villain", "تبهکار", "The villain was finally caught.", "تبهکار بالاخره دستگیر شد."),
            v("courage", "شجاعت", "She showed great courage.", "او شجاعت زیادی نشان داد."),
            v("sacrifice", "فداکاری", "He made the ultimate sacrifice.", "او نهایت فداکاری را کرد."),
            v("inspire", "الهام بخشیدن", "She inspired a generation.", "او به یک نسل الهام بخشید.", "verb"),
            v("admire", "تحسین کردن", "I admire her determination.", "من اراده‌اش را تحسین می‌کنم.", "verb"),
            v("integrity", "درستکاری", "He's a man of integrity.", "او مرد درستکاری است."),
            v("selfless", "فداکار", "It was a selfless act.", "عمل فداکارانه‌ای بود.", "adjective"),
            v("ruthless", "بی‌رحم", "The villain was ruthless.", "تبهکار بی‌رحم بود.", "adjective"),
            v("cunning", "حیله‌گر", "He was cunning and manipulative.", "او حیله‌گر و دستکاری‌کننده بود.", "adjective"),
            v("honorable", "شرافتمند", "That was an honorable decision.", "تصمیم شرافتمندانه‌ای بود.", "adjective"),
            v("cowardly", "بزدلانه", "It was a cowardly act.", "عمل بزدلانه‌ای بود.", "adjective"),
            v("redemption", "رستگاری", "The story is about redemption.", "داستان درباره رستگاری است."),
            v("legacy", "میراث", "His legacy lives on.", "میراثش زنده است."),
            v("role model", "الگو", "She's a role model for young girls.", "او الگوی دختران جوان است.")
        ),
        listOf(
            GrammarSection("Emphatic structures", "Cleft sentences: It was John who told me. What I need is a holiday. Inversion: Never have I seen such courage. Only then did I understand."),
            GrammarSection("Comparatives and superlatives for emphasis", "Use 'by far', 'far more', 'much less', 'the very best' for emphasis. She's by far the best candidate. It's far more complicated than that."),
            GrammarSection("Word building", "Nouns from adjectives: brave → bravery, courageous → courage. Adjectives from nouns: hero → heroic, villain → villainous. Verbs from nouns: courage → encourage.")
        ),
        listOf(
            d("A", "Who's your biggest hero?", "بزرگ‌ترین قهرمانت کیست؟"),
            d("B", "That's a tough question. Let me think.", "سؤال سختی است. بگذار فکر کنم."),
            d("A", "Take your time.", "عجله نکن."),
            d("B", "I think it's my grandmother.", "فکر می‌کنم مادربزرگم است."),
            d("A", "Really? Why?", "واقعاً؟ چرا؟"),
            d("B", "She survived the war. She lost everything but never gave up.", "او از جنگ جان سالم به در برد. همه چیز را از دست داد ولی هرگز تسلیم نشد."),
            d("A", "That's incredible. What did she do after the war?", "باورنکردنی است. بعد از جنگ چه کرد؟"),
            d("B", "She rebuilt her life from nothing. She raised three children alone.", "زندگی‌اش را از هیچ بازسازی کرد. سه فرزند را تنها بزرگ کرد."),
            d("A", "She sounds like an amazing woman.", "زن شگفت‌انگیزی به نظر می‌رسد."),
            d("B", "She was. What I admire most is her courage.", "بود. چیزی که بیشتر تحسین می‌کنم شجاعتش است."),
            d("A", "What made her so courageous?", "چه چیزی او را اینقدر شجاع کرد؟"),
            d("B", "She had no choice. It was survive or give up.", "چاره‌ای نداشت. یا زنده می‌ماندی یا تسلیم می‌شدی."),
            d("A", "Do you think everyone has that kind of courage?", "فکر می‌کنی همه آن نوع شجاعت را دارند؟"),
            d("B", "I don't know. But I believe it can be developed.", "نمی‌دانم. ولی باور دارم می‌توان پرورش داد."),
            d("A", "How?", "چطور؟"),
            d("B", "By facing challenges. By not running away.", "با روبرو شدن با چالش‌ها. با فرار نکردن."),
            d("A", "That makes sense. Who's your biggest villain?", "منطقی است. بزرگ‌ترین تبهکارت کیست؟"),
            d("B", "That's harder. Real villains aren't like in movies.", "این سخت‌تر است. تبهکاران واقعی مثل فیلم‌ها نیستند."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "They're often ordinary people who do terrible things.", "اغلب افراد عادی هستند که کارهای وحشتناک می‌کنند."),
            d("A", "Like who?", "مثل کی؟"),
            d("B", "Like dictators who order atrocities. Or people who look away.", "مثل دیکتاتورهایی که دستور جنایات می‌دهند. یا کسانی که نگاهشان را برمی‌گردانند."),
            d("A", "That's dark. Do you think people are born evil?", "تاریک است. فکر می‌کنی مردم بد ذات به دنیا می‌آیند؟"),
            d("B", "No. I think circumstances shape people. But choices matter too.", "نه. فکر می‌کنم شرایط مردم را شکل می‌دهد. ولی انتخاب‌ها هم مهم هستند."),
            d("A", "So what makes someone a hero?", "پس چه چیزی کسی را قهرمان می‌کند؟"),
            d("B", "Choosing to help others even when it's hard.", "انتخاب کمک به دیگران حتی وقتی سخت است."),
            d("A", "Like first responders?", "مثل امدادگران؟"),
            d("B", "Exactly. Firefighters, nurses, ordinary people who run toward danger.", "دقیقاً. آتش‌نشان‌ها، پرستارها، افراد عادی که به سمت خطر می‌دوند."),
            d("A", "Do you think you could do that?", "فکر می‌کنی می‌توانستی این کار را بکنی؟"),
            d("B", "I hope so. But you never know until you're tested.", "امیدوارم. ولی تا آزمایش نشوی نمی‌دانی."),
            d("A", "True. Have you ever had to be brave?", "درست. هیچ‌وقت مجبور شده‌ای شجاع باشی؟"),
            d("B", "Once. I helped a stranger who was having a heart attack.", "یک بار. به غریبه‌ای که سکته قلبی کرده بود کمک کردم."),
            d("A", "Wow. What did you do?", "واو. چه کار کردی؟"),
            d("B", "I called an ambulance and did CPR until they arrived.", "آمبولانس خبر کردم و تا رسیدنشان CPR انجام دادم."),
            d("A", "That's amazing. You saved a life.", "شگفت‌انگیز است. یک زندگی را نجات دادی."),
            d("B", "Maybe. It was terrifying. But I didn't think. I just acted.", "شاید. وحشتناک بود. ولی فکر نکردم. فقط عمل کردم."),
            d("A", "That's what heroes do.", "قهرمانان همین کار را می‌کنند."),
            d("B", "I'm not a hero. I just did what anyone would do.", "من قهرمان نیستم. فقط کاری که هر کسی می‌کرد انجام دادم."),
            d("A", "Not everyone would. Many people freeze.", "نه هر کسی. بسیاری منجمد می‌شوند."),
            d("B", "True. Well, I'm glad I could help.", "درست. خب، خوشحالم که توانستم کمک کنم."),
            d("A", "You should be proud.", "باید افتخار کنی."),
            d("B", "I am. But I don't need to be called a hero.", "افتخار می‌کنم. ولی نیازی به قهرمان خوانده شدن ندارم."),
            d("A", "That's humility. Another heroic trait.", "این فروتنی است. ویژگی قهرمانانه دیگری."),
            d("B", "Ha! You're too kind.", "ها! خیلی مهربانی."),
            d("A", "Well, I should go. This was a great conversation.", "خب، باید بروم. مکالمه عالی‌ای بود."),
            d("B", "Thanks. I enjoyed it too.", "ممنون. من هم لذت بردم."),
            d("A", "See you soon!", "به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Oh, one more thing.", "اوه، یک چیز دیگر."),
            d("A", "What?", "چی؟"),
            d("B", "Do you have a hero?", "قهرمانی داری؟"),
            d("A", "Yes. My father. He worked three jobs to support us.", "بله. پدرم. سه شغل کار می‌کرد تا ما را حمایت کند."),
            d("B", "That's a different kind of heroism.", "این نوع متفاوتی از قهرمانی است."),
            d("A", "It is. Quiet heroism. Every day.", "هست. قهرمانی خاموش. هر روز."),
            d("B", "I love that.", "دوستش دارم."),
            d("A", "Thanks. Well, really should go now. Bye!", "ممنون. خب، واقعاً باید الان بروم. خداحافظ!"),
            d("B", "Bye! Great talk!", "خداحافظ! گفتگوی عالی!"),
            d("A", "You too! Bye!", "تو هم! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "See you!", "می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Take care!", "مراقب باش!"),
            d("B", "You too!", "تو هم!"),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Who is B's hero?", listOf("father", "grandmother", "teacher", "friend"), 1),
            q("What did B do for a stranger?", listOf("called police", "did CPR", "gave money", "drove them home"), 1),
            q("What makes someone a hero according to B?", listOf("fame", "money", "choosing to help others", "strength"), 2),
            q("Who is A's hero?", listOf("mother", "father", "grandmother", "brother"), 1),
            q("It was my grandmother ___ survived the war.", listOf("who", "which", "whose", "whom"), 0),
            q("What I admire ___ is her courage.", listOf("most", "more", "much", "many"), 0),
            q("Never ___ I seen such courage.", listOf("have", "has", "had", "having"), 0),
            q("She's ___ far the best candidate.", listOf("by", "for", "with", "at"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Take your time", "عجله نکن", "Take your time.", "عجله نکن."),
            IdiomExpression("Look away", "نگاه را برگرداندن", "People looked away.", "مردم نگاهشان را برگرداندند."),
            IdiomExpression("Run toward danger", "به سمت خطر دویدن", "They run toward danger.", "آن‌ها به سمت خطر می‌دوند."),
            IdiomExpression("Be tested", "آزمایش شدن", "You never know until you're tested.", "تا آزمایش نشوی نمی‌دانی."),
            IdiomExpression("Quiet heroism", "قهرمانی خاموش", "Quiet heroism every day.", "قهرمانی خاموش هر روز.")
        ),
        phrasal = listOf(
            PhrasalVerb("give up", "تسلیم شدن", "surrender",
                "She never gave up.", "او هرگز تسلیم نشد.", "Yes"),
            PhrasalVerb("raise", "بزرگ کردن", "bring up",
                "She raised three children alone.", "سه فرزند را تنها بزرگ کرد.", "No"),
            PhrasalVerb("run toward", "دویدن به سمت", "move toward",
                "They run toward danger.", "آن‌ها به سمت خطر می‌دوند.", "No"),
            PhrasalVerb("look away", "نگاه را برگرداندن", "avoid looking",
                "People looked away.", "مردم نگاهشان را برگرداندند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Cleft sentence stress", "It WAS my grandmother who survived."),
            PronunciationTip("Inversion stress", "NEVER have I seen such courage."),
            PronunciationTip("Emphatic comparatives", "She's BY FAR the best. It's FAR more complicated.")
        ),
        culture = listOf(
            CulturalNote("Heroism", "Heroism is often defined by selfless action in the face of danger."),
            CulturalNote("Villainy", "Villains in real life are often ordinary people shaped by circumstances and choices."),
            CulturalNote("Role models", "Role models can be famous figures or ordinary people who inspire through their actions.")
        ),
        mistakes = listOf(
            CommonMistake("It was my grandmother which survived.", "It was my grandmother who survived.", "Use 'who' for people in cleft sentences."),
            CommonMistake("What I admire most is her courage.", "What I admire most is her courage.", "Correct."),
            CommonMistake("Never I have seen such courage.", "Never have I seen such courage.", "Use inversion after 'never'."),
            CommonMistake("She's by far the best candidate.", "She's by far the best candidate.", "Correct.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Who is B's hero and why?", "B's grandmother, who survived war and rebuilt her life."),
            ComprehensionQuestion("What did B do for a stranger?", "Performed CPR until an ambulance arrived."),
            ComprehensionQuestion("What is quiet heroism?", "Everyday acts of sacrifice, like A's father working three jobs.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your hero.", "درباره قهرمانت صحبت کن.", "My hero is... / What I admire most is... / She/He taught me..."),
            SpeakingTask("Discuss what makes someone a hero or villain.", "درباره اینکه چه چیزی کسی را قهرمان یا تبهکار می‌کند صحبت کن.", "A hero is someone who... / Villains are... / It's about choices..."),
            SpeakingTask("Talk about a time you had to be brave.", "درباره زمانی که مجبور شدی شجاع باشی صحبت کن.", "I once... / It was terrifying... / I just acted...")
        ),
        writing = listOf(
            WritingTask("Write about a hero in your life.", "درباره یک قهرمان در زندگی‌ات بنویس.", 180, "Use emphatic structures and comparatives.")
        )
    )
}