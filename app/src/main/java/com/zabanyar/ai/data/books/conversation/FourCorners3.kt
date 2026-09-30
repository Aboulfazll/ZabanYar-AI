package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Four Corners 3 — Complete Course Content
 * 12 Units | Pre-Intermediate (B1)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles and grammar points match the official Cambridge Scope & Sequence
 */
object FourCorners3 {
    const val BOOK_ID = "four_corners_3"

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
    // UNIT 1 — Family life | زندگی خانوادگی
    // ═══════════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "Family life", "زندگی خانوادگی",
        listOf(
            "Talk about family members and relationships",
            "Use present perfect for life experiences",
            "Describe family traditions and gatherings",
            "Discuss changes in family structures"
        ),
        listOf(
            v("relative", "فامیل", "We have many relatives.", "فامیل زیادی داریم."),
            v("extended family", "خانواده گسترده", "My extended family is huge.", "خانواده گسترده‌ام بزرگ است."),
            v("nuclear family", "خانواده هسته‌ای", "Nuclear families are common now.", "خانواده‌های هسته‌ای الان رایجند."),
            v("generation", "نسل", "Three generations live here.", "سه نسل اینجا زندگی می‌کنند."),
            v("bring up", "بزرگ کردن", "She brought up four children.", "او چهار فرزند بزرگ کرد.", "verb"),
            v("raise", "بزرگ کردن", "Raising kids is hard.", "بزرگ کردن بچه‌ها سخت است.", "verb"),
            v("get along", "کنار آمدن", "We get along very well.", "خیلی خوب کنار می‌آییم.", "verb"),
            v("supportive", "حمایتگر", "My parents are supportive.", "والدینم حمایتگر هستند.", "adjective"),
            v("strict", "سختگیر", "My father was strict.", "پدرم سختگیر بود.", "adjective"),
            v("close-knit", "نزدیک به هم", "It's a close-knit family.", "خانواده نزدیکی است.", "adjective"),
            v("gathering", "دورهمی", "Family gatherings are fun.", "دورهمی‌های خانوادگی سرگرم‌کننده‌اند."),
            v("wedding anniversary", "سالگرد ازدواج", "It's their 30th anniversary.", "سی‌امین سالگردشان است."),
            v("in-laws", "خانواده همسر", "My in-laws live nearby.", "خانواده همسرم نزدیک زندگی می‌کنند."),
            v("sibling", "خواهر یا برادر", "I have three siblings.", "سه خواهر و برادر دارم."),
            v("adopt", "به فرزندی گرفتن", "They adopted two children.", "آن‌ها دو فرزند به فرزندی گرفتند.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect for life experiences", "Use have/has + past participle. I've lived in three countries. She's never met her grandfather."),
            GrammarSection("Present perfect with for/since", "Use 'for' with periods, 'since' with points. I've known him for ten years. She's been married since 2015."),
            GrammarSection("Used to for past states", "Use 'used to + base verb' for past habits that changed. We used to live with my grandparents."),
            GrammarSection("Relative clauses about family", "Use 'who' for people. My aunt, who lives in Canada, visits every year.")
        ),
        listOf(
            d("A", "Hi, Maria! How was your weekend?", "سلام، ماریا! آخر هفته‌ات چطور بود؟"),
            d("B", "Amazing! I went to my grandmother's 80th birthday party.", "شگفت‌انگیز! به جشن تولد ۸۰ سالگی مادربزرگم رفتم."),
            d("A", "Wow, 80! That's a big celebration.", "واو، ۸۰! جشن بزرگی است."),
            d("B", "Yes. All my relatives came. Even my cousins from Australia.", "بله. همه فامیل‌هایم آمدند. حتی پسرخاله‌هایم از استرالیا."),
            d("A", "Really? How many people were there?", "واقعاً؟ چند نفر بودند؟"),
            d("B", "About fifty. It was a huge family gathering.", "حدود پنجاه. دورهمی خانوادگی بزرگی بود."),
            d("A", "That's wonderful. Is your family very close?", "شگفت‌انگیز است. خانواده‌ات خیلی نزدیک هستند؟"),
            d("B", "Very. We're a close-knit family.", "خیلی. خانواده نزدیکی هستیم."),
            d("A", "How often do you all get together?", "چند وقت یک بار همه دور هم جمع می‌شوید؟"),
            d("B", "At least once a month. Usually for birthdays or holidays.", "حداقل ماهی یک بار. معمولاً برای تولدها یا تعطیلات."),
            d("A", "That's nice. Do you have a big extended family?", "خوبه. خانواده گسترده بزرگی داری؟"),
            d("B", "Huge. My mother has five siblings.", "بزرگ. مادرم پنج خواهر و برادر دارد."),
            d("A", "Five! So you have a lot of cousins.", "پنج! پس پسرخاله و دخترخاله زیادی داری."),
            d("B", "Too many to count! I've known some of them since I was born.", "بیش از حد شمارش! برخی را از بدو تولد می‌شناسم."),
            d("A", "Do you get along with all of them?", "با همه‌شان کنار می‌آیی؟"),
            d("B", "Mostly. But some are very different from me.", "بیشترشان. ولی برخی خیلی با من متفاوتند."),
            d("A", "How so?", "چطور؟"),
            d("B", "Well, some are very strict and traditional. Others are liberal.", "خب، برخی خیلی سختگیر و سنتی هستند. دیگران آزاداندیش."),
            d("A", "That's how families are. Always different personalities.", "خانواده‌ها همینطورند. همیشه شخصیت‌های متفاوت."),
            d("B", "Exactly. But we all respect each other.", "دقیقاً. ولی همه به هم احترام می‌گذاریم."),
            d("A", "Are your grandparents still alive?", "پدربزرگ و مادربزرگت هنوز زنده‌اند؟"),
            d("B", "My grandmother is. My grandfather passed away five years ago.", "مادربزرگم هست. پدربزرگم پنج سال پیش فوت کرد."),
            d("A", "I'm sorry to hear that.", "متأسفم."),
            d("B", "Thank you. They had been married for 55 years.", "ممنون. ۵۵ سال ازدواج کرده بودند."),
            d("A", "Fifty-five years! That's incredible.", "پنجاه و پنج سال! باورنکردنی است."),
            d("B", "I know. They were very much in love.", "می‌دانم. خیلی عاشق هم بودند."),
            d("A", "What's your grandmother like?", "مادربزرگت چطور است؟"),
            d("B", "She's amazing. Very strong and independent.", "شگفت‌انگیز است. خیلی قوی و مستقل."),
            d("A", "What did she do?", "چه کار می‌کرد؟"),
            d("B", "She was a teacher. She brought up four children alone after my grandfather died.", "معلم بود. بعد از فوت پدربزرگم چهار فرزند را تنها بزرگ کرد."),
            d("A", "Wow. She sounds like a hero.", "واو. مثل یک قهرمان است."),
            d("B", "She is. I admire her very much.", "هست. خیلی تحسینش می‌کنم."),
            d("A", "Do you see her often?", "زیاد می‌بینیش؟"),
            d("B", "Yes. I visit her every Sunday.", "بله. هر یکشنبه به دیدارش می‌روم."),
            d("A", "That's lovely. What do you do together?", "زیباست. با هم چه کار می‌کنید؟"),
            d("B", "We cook, talk, and look at old photos.", "آشپزی می‌کنیم، صحبت می‌کنیم، و عکس‌های قدیمی نگاه می‌کنیم."),
            d("A", "That's so sweet. Do you have any traditions?", "خیلی شیرین است. سنتی دارید؟"),
            d("B", "Yes. Every New Year, all the family has dinner at her house.", "بله. هر سال نو، همه خانواده در خانه‌اش شام می‌خورند."),
            d("A", "How long has that tradition existed?", "چند وقت این سنت وجود دارد؟"),
            d("B", "For as long as I can remember. At least 30 years.", "از زمانی که یادم می‌آید. حداقل ۳۰ سال."),
            d("A", "That's beautiful. Family traditions are important.", "زیباست. سنت‌های خانوادگی مهم هستند."),
            d("B", "I agree. They keep us connected.", "موافقم. ما را متصل نگه می‌دارند."),
            d("A", "What about your parents? Where do they live?", "والدینت چطور؟ کجا زندگی می‌کنند؟"),
            d("B", "They live nearby. About 15 minutes away.", "نزدیک زندگی می‌کنند. حدود ۱۵ دقیقه دورتر."),
            d("A", "Do you see them often?", "زیاد می‌بینیشان؟"),
            d("B", "Every week. We're a close family.", "هر هفته. خانواده نزدیکی هستیم."),
            d("A", "That's nice. Do you want children someday?", "خوبه. روزی بچه می‌خواهی؟"),
            d("B", "Maybe. I'm not sure yet. What about you?", "شاید. هنوز مطمئن نیستم. تو چطور؟"),
            d("A", "I'd like two children. Maybe three.", "دو بچه دوست دارم. شاید سه."),
            d("B", "That's a big family!", "خانواده بزرگی است!"),
            d("A", "I know. I grew up with three siblings. I loved it.", "می‌دانم. با سه خواهر و برادر بزرگ شدم. عاشقش بودم."),
            d("B", "So you want the same for your children.", "پس برای بچه‌هایت هم همین را می‌خواهی."),
            d("A", "Exactly. Family is everything.", "دقیقاً. خانواده همه چیز است."),
            d("B", "I agree. Well, I should go. My mom is calling me for dinner.", "موافقم. خب، باید بروم. مادرم برای شام صدام می‌زند."),
            d("A", "Okay. Enjoy the family dinner!", "باشه. از شام خانوادگی لذت ببر!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Whose birthday did Maria celebrate?", listOf("her mother's", "her grandmother's", "her father's", "her sister's"), 1),
            q("How old is Maria's grandmother?", listOf("70", "75", "80", "85"), 2),
            q("Where do Maria's cousins live?", listOf("America", "Australia", "Canada", "England"), 1),
            q("How often does the family get together?", listOf("every week", "once a month", "twice a year", "every day"), 1),
            q("I ___ lived here for ten years.", listOf("have", "has", "am", "was"), 0),
            q("She ___ been married since 2015.", listOf("have", "has", "is", "was"), 1),
            q("We ___ to live with my grandparents.", listOf("use", "used", "using", "uses"), 1),
            q("My aunt, ___ lives in Canada, visits often.", listOf("which", "who", "that", "where"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Close-knit", "نزدیک به هم", "We're a close-knit family.", "خانواده نزدیکی هستیم."),
            IdiomExpression("Bring up", "بزرگ کردن", "She brought up four children.", "او چهار فرزند بزرگ کرد."),
            IdiomExpression("Pass away", "فوت کردن", "He passed away five years ago.", "پنج سال پیش فوت کرد."),
            IdiomExpression("As long as I can remember", "از زمانی که یادم می‌آید", "As long as I can remember.", "از زمانی که یادم می‌آید.")
        ),
        phrasal = listOf(
            PhrasalVerb("bring up", "بزرگ کردن", "raise", "She brought up four children alone.", "او چهار فرزند را تنها بزرگ کرد.", "Yes"),
            PhrasalVerb("grow up", "بزرگ شدن", "spend childhood", "I grew up with three siblings.", "با سه خواهر و برادر بزرگ شدم.", "Yes"),
            PhrasalVerb("get together", "دور هم جمع شدن", "meet", "We get together every month.", "هر ماه دور هم جمع می‌شویم.", "No"),
            PhrasalVerb("pass away", "فوت کردن", "die", "He passed away five years ago.", "پنج سال پیش فوت کرد.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Present perfect stress", "I've LIVED here for ten years. She's BEEN married since 2015."),
            PronunciationTip("'For' vs 'since'", "for /fər/ (weak) vs since /sɪns/ (strong)."),
            PronunciationTip("Family vocabulary", "RElative, GRANDmother, SIBling, IN-laws.")
        ),
        culture = listOf(
            CulturalNote("Extended families", "In many cultures, extended families live close and gather often."),
            CulturalNote("Family traditions", "Traditions keep families connected across generations."),
            CulturalNote("Wedding anniversaries", "Long marriages are celebrated with parties and gifts.")
        ),
        mistakes = listOf(
            CommonMistake("I have lived here since ten years.", "I have lived here for ten years.", "Use 'for' with periods."),
            CommonMistake("She has been married for 2015.", "She has been married since 2015.", "Use 'since' with points."),
            CommonMistake("I use to live there.", "I used to live there.", "Use 'used to' (with -d)."),
            CommonMistake("My aunt which lives in Canada...", "My aunt who lives in Canada...", "Use 'who' for people.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Who was the birthday party for?", "Maria's grandmother's 80th birthday."),
            ComprehensionQuestion("What's Maria's grandmother like?", "Strong, independent, and a former teacher who raised four children alone."),
            ComprehensionQuestion("What tradition does the family have?", "Every New Year dinner at grandmother's house — at least 30 years old.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your family.", "درباره خانواده‌ات صحبت کن.", "I've got... / We're a close-knit family... / We get together..."),
            SpeakingTask("Describe a family tradition.", "یک سنت خانوادگی را توصیف کن.", "Every year... / We always... / It's been a tradition for..."),
            SpeakingTask("Talk about someone you admire in your family.", "درباره کسی در خانواده‌ات که تحسین می‌کنی صحبت کن.", "I admire... / She's amazing because... / She taught me...")
        ),
        writing = listOf(
            WritingTask("Write about your family and a special tradition.", "درباره خانواده‌ات و یک سنت خاص بنویس.", 180, "Use present perfect and used to.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 2 — Shopping | خرید
    // ═══════════════════════════════════════════════════════════════
    private fun unit2() = base(
        2, "Shopping", "خرید",
        listOf(
            "Talk about shopping habits and preferences",
            "Use comparatives and superlatives",
            "Discuss online shopping vs. in-store shopping",
            "Use money and price expressions"
        ),
        listOf(
            v("shopping", "خرید", "I love shopping for clothes.", "عاشق خرید لباسم."),
            v("bargain", "معامله خوب", "It was a real bargain!", "معامله خوبی بود!"),
            v("discount", "تخفیف", "There's a 20% discount.", "۲۰٪ تخفیف هست."),
            v("refund", "بازپرداخت", "Can I get a refund?", "می‌توانم بازپرداخت بگیرم؟"),
            v("exchange", "تعویض", "I'd like to exchange this.", "می‌خواهم این را تعویض کنم.", "verb"),
            v("brand", "برند", "I prefer this brand.", "این برند را ترجیح می‌دهم."),
            v("quality", "کیفیت", "Quality matters more than price.", "کیفیت مهم‌تر از قیمت است."),
            v("second-hand", "دست دوم", "I buy second-hand clothes.", "لباس دست دوم می‌خرم.", "adjective"),
            v("online shopping", "خرید آنلاین", "Online shopping is convenient.", "خرید آنلاین راحت است."),
            v("in-store", "حضوری", "In-store shopping is fun.", "خرید حضوری سرگرم‌کننده است.", "adjective"),
            v("salesperson", "فروشنده", "The salesperson was helpful.", "فروشنده کمک‌کننده بود."),
            v("fitting room", "اتاق پرو", "The fitting rooms are there.", "اتاق‌های پرو آنجا هستند."),
            v("delivery", "تحویل", "Free delivery over $50.", "تحویل رایگان بالای ۵۰ دلار."),
            v("loyalty card", "کارت وفاداری", "Do you have a loyalty card?", "کارت وفاداری داری؟"),
            v("checkout", "تسویه", "The checkout line is long.", "صف تسویه طولانی است.")
        ),
        listOf(
            GrammarSection("Comparatives and superlatives", "cheap → cheaper → the cheapest. expensive → more expensive → the most expensive."),
            GrammarSection("As...as / not as...as", "This shirt is as nice as that one. It's not as expensive as I thought."),
            GrammarSection("Too / enough", "It's too expensive. It's not cheap enough."),
            GrammarSection("Present perfect for shopping experiences", "Have you ever bought anything online? I've never returned a product.")
        ),
        listOf(
            d("A", "Hey, Ali! I haven't seen you in a while. How are you?", "هی، علی! مدتی ندیدمت. چطوری؟"),
            d("B", "Good! I've been busy. I've been shopping a lot lately.", "خوبم! مشغول بوده‌ام. اخیراً زیاد خرید کرده‌ام."),
            d("A", "Really? What have you been buying?", "واقعاً؟ چه خریدی کرده‌ای؟"),
            d("B", "Mostly clothes. I needed new things for work.", "بیشتر لباس. چیزهای جدید برای کار لازم داشتم."),
            d("A", "Do you shop online or in stores?", "آنلاین خرید می‌کنی یا حضوری؟"),
            d("B", "Both. Online is convenient but in-store is more fun.", "هر دو. آنلاین راحت است ولی حضوری سرگرم‌کننده‌تر."),
            d("A", "I agree. I love going to the mall.", "موافقم. عاشق رفتن به مال هستم."),
            d("B", "Me too. What about you? Have you bought anything recently?", "من هم. تو چطور؟ اخیراً چیزی خریده‌ای؟"),
            d("A", "Yes. I got a great jacket last week. It was on sale.", "بله. هفته پیش کاپشن عالی‌ای گرفتم. حراج بود."),
            d("B", "Nice! How much was it?", "خوبه! چقدر بود؟"),
            d("A", "Originally $150 but I paid $90. A real bargain.", "اصلاً ۱۵۰ دلار بود ولی ۹۰ پرداخت کردم. معامله خوبی."),
            d("B", "Wow, 40% off! Great deal.", "واو، ۴۰٪ تخفیف! معامله عالی."),
            d("A", "Yes. I also bought shoes. They were cheaper than my old ones.", "بله. کفش هم خریدم. از کفش‌های قدیمی‌ام ارزان‌تر بودند."),
            d("B", "You got lucky. I never find good sales.", "شانس آوردی. من هرگز حراج خوب پیدا نمی‌کنم."),
            d("A", "You need to check online first. There are sites that track sales.", "اول باید آنلاین چک کنی. سایت‌هایی هستند که حراج‌ها را ردیابی می‌کنند."),
            d("B", "Good tip. I'll try that.", "نکته خوبی. امتحان می‌کنم."),
            d("A", "What about second-hand shopping?", "خرید دست دوم چطور؟"),
            d("B", "I love it. It's cheaper and better for the environment.", "عاشقشم. ارزان‌تر و برای محیط زیست بهتر است."),
            d("A", "Exactly. Have you ever found anything really special?", "دقیقاً. هیچ‌وقت چیز واقعاً خاصی پیدا کرده‌ای؟"),
            d("B", "Yes! I found a vintage leather jacket last year.", "بله! سال گذشته یک کاپشن چرمی وینتیج پیدا کردم."),
            d("A", "How much did you pay?", "چقدر پرداخت کردی؟"),
            d("B", "Only $40. New ones cost $300.", "فقط ۴۰ دلار. نوهایش ۳۰۰ دلار است."),
            d("A", "That's an incredible deal!", "معامله باورنکردنی‌ای است!"),
            d("B", "I know. Second-hand shopping is underrated.", "می‌دانم. خرید دست دوم دست‌کم گرفته شده."),
            d("A", "Do you ever regret buying something?", "هیچ‌وقت از خریدی پشیمان می‌شوی؟"),
            d("B", "Sometimes. Especially impulse buys.", "گاهی. مخصوصاً خریدهای لحظه‌ای."),
            d("A", "What's your worst purchase?", "بدترین خریدت چیست؟"),
            d("B", "A very expensive pair of shoes that hurt my feet.", "یک جفت کفش خیلی گران که پایم را زد."),
            d("A", "Ouch. Did you return them?", "آخ. برگرداندی‌شان؟"),
            d("B", "No. It was past the return period.", "نه. از دوره بازگشت گذشته بود."),
            d("A", "That's frustrating.", "آزاردهنده است."),
            d("B", "Yes. Now I always try things on before buying.", "بله. حالا همیشه قبل از خرید پرو می‌کنم."),
            d("A", "Smart. Do you use loyalty cards?", "هوشمندانه. کارت وفاداری استفاده می‌کنی؟"),
            d("B", "Yes, at a few stores. I save a lot of money.", "بله، در چند فروشگاه. پول زیادی پس‌انداز می‌کنم."),
            d("A", "Me too. My favorite store gives me 5% back.", "من هم. فروشگاه مورد علاقه‌ام ۵٪ برمی‌گرداند."),
            d("B", "That's great. Small savings add up.", "عالی است. پس‌اندازهای کوچک جمع می‌شوند."),
            d("A", "Exactly. Well, I should go. I'm meeting someone at the mall.", "دقیقاً. خب، باید بروم. در مال قرار دارم."),
            d("B", "Shopping again?", "باز هم خرید؟"),
            d("A", "Ha! Just window shopping this time.", "ها! این بار فقط ویترین‌گردی."),
            d("B", "Sure, sure. See you!", "مطمئناً، مطمئناً. می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did Ali buy recently?", listOf("shoes only", "clothes", "books", "nothing"), 1),
            q("How much did Maria pay for her jacket?", listOf("$90", "$100", "$150", "$75"), 0),
            q("How much did Ali pay for the vintage jacket?", listOf("$30", "$40", "$50", "$300"), 1),
            q("What was Ali's worst purchase?", listOf("a jacket", "expensive shoes that hurt", "a bag", "a shirt"), 1),
            q("This is ___ than that one.", listOf("cheap", "cheaper", "cheapest", "more cheap"), 1),
            q("This is the ___ store.", listOf("good", "better", "best", "goodest"), 2),
            q("It's ___ expensive.", listOf("too", "very", "much", "a lot"), 0),
            q("It's not cheap ___.", listOf("too", "very", "enough", "much"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Real bargain", "معامله خوب", "It was a real bargain.", "معامله خوبی بود."),
            IdiomExpression("On sale", "حراج", "It was on sale.", "حراج بود."),
            IdiomExpression("Impulse buy", "خرید لحظه‌ای", "I made an impulse buy.", "خرید لحظه‌ای کردم."),
            IdiomExpression("Add up", "جمع شدن", "Small savings add up.", "پس‌اندازهای کوچک جمع می‌شوند.")
        ),
        phrasal = listOf(
            PhrasalVerb("try on", "پرو کردن", "test clothes", "I always try things on.", "همیشه چیزها را پرو می‌کنم.", "Yes"),
            PhrasalVerb("look for", "دنبال گشتن", "search for", "I'm looking for a jacket.", "دنبال کاپشن می‌گردم.", "No"),
            PhrasalVerb("pay back", "پس دادن", "return money", "I'll pay you back.", "پولت را پس می‌دهم.", "Yes"),
            PhrasalVerb("save up", "پس‌انداز کردن", "accumulate money", "I'm saving up for a car.", "برای ماشین پس‌انداز می‌کنم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Shopping stress", "BARgain, DIScount, REfund, QUAlity, BRAND."),
            PronunciationTip("Comparatives stress", "CHEAper, MORE exPENsive, BEST."),
            PronunciationTip("Prices", "$90 → NINEty dollars. 40% → FORty perCENT.")
        ),
        culture = listOf(
            CulturalNote("Online vs. in-store", "Online shopping has grown, but in-store shopping remains popular for the experience."),
            CulturalNote("Second-hand shopping", "Thrift stores and vintage shops are increasingly popular for sustainability."),
            CulturalNote("Return policies", "Most stores allow returns within 30 days with a receipt.")
        ),
        mistakes = listOf(
            CommonMistake("This is more cheaper.", "This is cheaper.", "Don't use 'more' with -er comparatives."),
            CommonMistake("It's too much expensive.", "It's too expensive.", "Use 'too' + adjective without 'much'."),
            CommonMistake("I have bought it yesterday.", "I bought it yesterday.", "Use simple past with specific time."),
            CommonMistake("I try always things on.", "I always try things on.", "Adverbs go before the main verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How do Ali and Maria differ in shopping habits?", "Maria shops online and in-store; Ali prefers both; Maria loves sales and second-hand."),
            ComprehensionQuestion("What's Ali's advice for finding sales?", "Check online sites that track sales."),
            ComprehensionQuestion("What mistake does Ali regret?", "Buying expensive shoes that hurt, past the return period.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your shopping habits.", "درباره عادات خریدت صحبت کن.", "I usually shop... / I prefer... / I've bought..."),
            SpeakingTask("Compare online and in-store shopping.", "خرید آنلاین و حضوری را مقایسه کن.", "Online is... / In-store is... / I prefer..."),
            SpeakingTask("Talk about a great bargain you found.", "درباره معامله خوبی که پیدا کردی صحبت کن.", "I found... / It cost... / It was a real bargain.")
        ),
        writing = listOf(
            WritingTask("Write about your shopping habits and preferences.", "درباره عادات و ترجیحات خریدت بنویس.", 180, "Use comparatives and present perfect.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 3 — Food | غذا
    // ═══════════════════════════════════════════════════════════════
    private fun unit3() = base(
        3, "Food", "غذا",
        listOf(
            "Talk about food and eating habits",
            "Use quantifiers with countable and uncountable nouns",
            "Order food in a restaurant",
            "Discuss healthy eating"
        ),
        listOf(
            v("cuisine", "آشپزی / غذا", "I love Italian cuisine.", "عاشق غذای ایتالیایی‌ام."),
            v("dish", "غذا", "This dish is delicious.", "این غذا خوشمزه است."),
            v("recipe", "دستور پخت", "Can you share the recipe?", "می‌توانی دستور پخت را بدهی؟"),
            v("ingredient", "ماده اولیه", "What are the ingredients?", "مواد اولیه چیست؟"),
            v("spicy", "تند", "I can't eat spicy food.", "غذای تند نمی‌توانم بخورم.", "adjective"),
            v("sweet", "شیرین", "The cake is too sweet.", "کیک خیلی شیرین است.", "adjective"),
            v("sour", "ترش", "The lemon is sour.", "لیمو ترش است.", "adjective"),
            v("bitter", "تلخ", "Black coffee is bitter.", "قهوه تلخ است.", "adjective"),
            v("salty", "شور", "The soup is too salty.", "سوپ خیلی شور است.", "adjective"),
            v("tasty", "خوشمزه", "The food was really tasty.", "غذا واقعاً خوشمزه بود.", "adjective"),
            v("vegetarian", "گیاه‌خوار", "She's vegetarian.", "او گیاه‌خوار است.", "adjective"),
            v("vegan", "وگان", "He's vegan — no animal products.", "او وگان است — هیچ محصول حیوانی نه.", "adjective"),
            v("diet", "رژیم غذایی", "I'm on a diet.", "من رژیم دارم."),
            v("portion", "پرس", "The portions are huge here.", "پرس‌های اینجا بزرگند."),
            v("leftovers", "باقیمانده غذا", "I eat leftovers for lunch.", "برای ناهار باقیمانده غذا می‌خورم.")
        ),
        listOf(
            GrammarSection("Countable and uncountable nouns", "Countable: apple → apples, egg → eggs. Uncountable: rice, bread, water, milk. How many apples? How much rice?"),
            GrammarSection("Quantifiers", "some, any, a lot of, much, many, a few, a little. There are a few apples. There's a little rice."),
            GrammarSection("Too / enough with food", "This soup is too salty. There's not enough salt. The food is good enough."),
            GrammarSection("Would like + noun or infinitive", "I'd like a coffee. I'd like to try the pasta.")
        ),
        listOf(
            d("A", "Hey, Maria! Let's have lunch. Are you hungry?", "هی، ماریا! بیایید ناهار بخوریم. گرسنه‌ای؟"),
            d("B", "Starving! I didn't have breakfast this morning.", "دارم می‌میرم از گرسنگی! امروز صبح صبحانه نخوردم."),
            d("A", "Why not?", "چرا نه؟"),
            d("B", "I woke up late. No time. You know how it is.", "دیر بیدار شدم. وقت نبود. می‌دانی چطور است."),
            d("A", "I know. But breakfast is important. It's the most important meal.", "می‌دانم. ولی صبحانه مهم است. مهم‌ترین وعده است."),
            d("B", "I know, I know. Where should we eat?", "می‌دانم، می‌دانم. کجا بخوریم؟"),
            d("A", "How about that new Italian place on Main Street?", "آن ایتالیایی جدید در خیابان اصلی چطور؟"),
            d("B", "I've heard good things about it. Let's try it.", "چیزهای خوبی درباره‌اش شنیده‌ام. بیایید امتحان کنیم."),
            d("A", "Perfect. I've been wanting to go there for weeks.", "عالی. هفته‌هاست می‌خواستم بروم."),
            d("B", "What kind of food do they have?", "چه نوع غذایی دارند؟"),
            d("A", "Mostly pasta and pizza. Classic Italian dishes.", "بیشتر پاستا و پیتزا. غذاهای کلاسیک ایتالیایی."),
            d("B", "Sounds great. I love Italian cuisine.", "عالی به نظر می‌رسد. عاشق غذای ایتالیایی‌ام."),
            d("A", "Me too. What's your favorite Italian dish?", "من هم. غذای ایتالیایی مورد علاقه‌ات چیست؟"),
            d("B", "Definitely lasagna. My grandmother makes the best lasagna.", "قطعاً لازانیا. مادربزرگم بهترین لازانیا را می‌سازد."),
            d("A", "Really? What's her secret?", "واقعاً؟ رازش چیست؟"),
            d("B", "Fresh ingredients and lots of cheese. Simple but amazing.", "مواد اولیه تازه و پنیر زیاد. ساده ولی شگفت‌انگیز."),
            d("A", "Does she use a special recipe?", "از دستور پخت خاصی استفاده می‌کند؟"),
            d("B", "It's a family recipe. Passed down for generations.", "دستور خانوادگی است. نسل‌ها منتقل شده."),
            d("A", "That's amazing. Family recipes are the best.", "شگفت‌انگیز است. دستورهای خانوادگی بهترین هستند."),
            d("B", "I agree. What about you? Do you cook?", "موافقم. تو چطور؟ آشپزی می‌کنی؟"),
            d("A", "Sometimes. I'm not very good, but I try.", "گاهی. خیلی خوب نیستم، ولی تلاش می‌کنم."),
            d("B", "What can you make?", "چه می‌توانی درست کنی؟"),
            d("A", "Simple things. Pasta, salads, sandwiches.", "چیزهای ساده. پاستا، سالاد، ساندویچ."),
            d("B", "That's a good start. Cooking takes practice.", "شروع خوبی است. آشپزی تمرین می‌خواهد."),
            d("A", "True. What about you? Are you a good cook?", "درست. تو چطور؟ آشپز خوبی هستی؟"),
            d("B", "I'm okay. I can make a few dishes really well.", "قابل قبولم. چند غذا را خیلی خوب می‌توانم درست کنم."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Grilled chicken, pasta, and stir-fry. Simple but tasty.", "مرغ کبابی، پاستا، و استیرفرای. ساده ولی خوشمزه."),
            d("A", "Sounds better than my cooking.", "از آشپزی من بهتر به نظر می‌رسد."),
            d("B", "Ha! I doubt that. We should cook together sometime.", "ها! شک دارم. باید یک وقت با هم آشپزی کنیم."),
            d("A", "Great idea. I'd love to learn from you.", "فکر خوبی. دوست دارم از تو یاد بگیرم."),
            d("B", "Sure. Do you have any dietary restrictions?", "حتماً. محدودیت غذایی داری؟"),
            d("A", "No, I eat everything. What about you?", "نه، همه چیز می‌خورم. تو چطور؟"),
            d("B", "I don't eat much red meat. But I eat chicken and fish.", "گوشت قرمز زیاد نمی‌خورم. ولی مرغ و ماهی می‌خورم."),
            d("A", "That's healthy. Do you eat a lot of vegetables?", "سالم است. سبزیجات زیاد می‌خوری؟"),
            d("B", "Yes, I love vegetables. Especially roasted ones.", "بله، عاشق سبزیجاتم. مخصوصاً کبابی‌شده‌ها."),
            d("A", "Me too. What's your favorite vegetable?", "من هم. سبزی مورد علاقه‌ات چیست؟"),
            d("B", "Broccoli or spinach. Hard to choose.", "کلم بروکلی یا اسفناج. سخت است انتخاب کنم."),
            d("A", "Both are great. What about fruit?", "هر دو عالی هستند. میوه چطور؟"),
            d("B", "I eat fruit every day. Bananas, apples, oranges.", "هر روز میوه می‌خورم. موز، سیب، پرتقال."),
            d("A", "Good habit. Do you eat dessert?", "عادت خوبی. دسر می‌خوری؟"),
            d("B", "Sometimes. I have a sweet tooth.", "گاهی. شیرینی‌دوست هستم."),
            d("A", "Me too! Chocolate is my weakness.", "من هم! شکلات نقطه ضعف من است."),
            d("B", "I can't resist ice cream.", "نمی‌توانم در برابر بستنی مقاومت کنم."),
            d("A", "Ha! Nobody can. What's your favorite flavor?", "ها! هیچ‌کس نمی‌تواند. طعم مورد علاقه‌ات چیست؟"),
            d("B", "Chocolate. Obviously.", "شکلاتی. واضح است."),
            d("A", "Classic. Mine is strawberry.", "کلاسیک. مال من توت‌فرنگی است."),
            d("B", "Also good. Well, are we going to eat or just talk?", "آن هم خوب است. خب، می‌خواهیم غذا بخوریم یا فقط صحبت کنیم؟"),
            d("A", "Ha! Let's go. I'm hungry too now.", "ها! بیایید برویم. من هم الان گرسنه‌ام."),
            d("B", "Perfect. I'll drive.", "عالی. من رانندگی می‌کنم."),
            d("A", "Great. Let's go.", "عالی. بیایید برویم."),
            d("B", "By the way, do they have vegetarian options?", "راستی، گزینه‌های گیاهی دارند؟"),
            d("A", "I think so. Most Italian places do.", "فکر می‌کنم بله. بیشتر ایتالیایی‌ها دارند."),
            d("B", "Good. Not that I'm vegetarian, but sometimes I prefer it.", "خوبه. نه اینکه گیاه‌خوار باشم، ولی گاهی ترجیح می‌دهم."),
            d("A", "Makes sense. Well, you'll see. The menu is great.", "منطقی است. خب، می‌بینی. منو عالی است."),
            d("B", "I'm looking forward to it. Let's go!", "منتظرش هستم. بیایید برویم!"),
            d("A", "Let's go! Bye for now!", "بیایید برویم! فعلاً خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Why didn't Maria have breakfast?", listOf("not hungry", "woke up late", "on a diet", "sick"), 1),
            q("What's Maria's favorite Italian dish?", listOf("pizza", "pasta", "lasagna", "risotto"), 2),
            q("What's Maria's favorite vegetable?", listOf("broccoli or spinach", "carrot", "tomato", "potato"), 0),
            q("What flavor of ice cream does Maria like?", listOf("vanilla", "strawberry", "chocolate", "mint"), 2),
            q("How ___ apples do we need?", listOf("much", "many", "some", "any"), 1),
            q("How ___ rice is there?", listOf("much", "many", "some", "any"), 0),
            q("This soup is ___ salty.", listOf("too", "very much", "many", "a lot"), 0),
            q("I'd like ___ pasta.", listOf("some", "many", "any", "a"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Starving", "دارم می‌میرم از گرسنگی", "I'm starving!", "دارم می‌میرم از گرسنگی!"),
            IdiomExpression("Sweet tooth", "شیرینی‌دوست", "I have a sweet tooth.", "شیرینی‌دوست هستم."),
            IdiomExpression("Passed down", "منتقل شده", "Passed down for generations.", "نسل‌ها منتقل شده."),
            IdiomExpression("My weakness", "نقطه ضعف من", "Chocolate is my weakness.", "شکلات نقطه ضعف من است.")
        ),
        phrasal = listOf(
            PhrasalVerb("eat out", "بیرون غذا خوردن", "eat at restaurant", "We eat out every Friday.", "هر جمعه بیرون غذا می‌خوریم.", "No"),
            PhrasalVerb("order in", "سفارش خانگی", "order delivery", "Let's order in tonight.", "بیایید امشب سفارش بدهیم.", "No"),
            PhrasalVerb("cut down on", "کم کردن", "reduce", "I should cut down on sugar.", "باید شکر را کم کنم.", "No"),
            PhrasalVerb("try out", "امتحان کردن", "test", "Let's try out the new restaurant.", "بیایید رستوران جدید را امتحان کنیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Taste adjectives", "SPIcy, SWEET, SOUR, BITter, SALty, TASTy."),
            PronunciationTip("How much vs how many", "How MUCH rice? How MANY apples?"),
            PronunciationTip("Food vocabulary", "inGREdient, RECipe, CUI-sine, PORtion.")
        ),
        culture = listOf(
            CulturalNote("Food culture", "Every culture has its own food traditions and family recipes."),
            CulturalNote("Vegetarianism", "Vegetarianism is common in many countries for health or ethical reasons."),
            CulturalNote("Desserts", "Desserts vary widely — chocolate, fruit, ice cream, and pastries.")
        ),
        mistakes = listOf(
            CommonMistake("How much apples?", "How many apples?", "Use 'many' with count nouns."),
            CommonMistake("How many rice?", "How much rice?", "Use 'much' with uncount nouns."),
            CommonMistake("This is too much salty.", "This is too salty.", "Use 'too' + adjective without 'much'."),
            CommonMistake("I'd like some pastas.", "I'd like some pasta.", "'Pasta' is uncountable.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the two friends discussing?", "Italian food, cooking skills, family recipes, and food preferences."),
            ComprehensionQuestion("What's Maria's family recipe?", "Her grandmother's lasagna recipe — passed down for generations."),
            ComprehensionQuestion("What are their food preferences?", "Maria doesn't eat much red meat; both love vegetables and dessert.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your favorite food.", "درباره غذای مورد علاقه‌ات صحبت کن.", "I love... / My favorite dish is... / I usually eat..."),
            SpeakingTask("Discuss eating habits.", "درباره عادات غذایی صحبت کن.", "I try to eat... / I never eat... / I eat a lot of..."),
            SpeakingTask("Role-play ordering food.", "نقش‌بازی سفارش غذا.", "I'd like... / Can I have...? / The bill, please.")
        ),
        writing = listOf(
            WritingTask("Write about a family recipe.", "درباره یک دستور پخت خانوادگی بنویس.", 180, "Use quantifiers and food vocabulary.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 4 — The body | بدن
    // ═══════════════════════════════════════════════════════════════
    private fun unit4() = base(
        4, "The body", "بدن",
        listOf(
            "Talk about body parts and injuries",
            "Describe health problems and symptoms",
            "Give advice about prevention",
            "Use the passive voice for injuries"
        ),
        listOf(
            v("shoulder", "شانه", "My shoulder hurts.", "شانه‌ام درد می‌کند."),
            v("elbow", "آرنج", "I hurt my elbow.", "آرنجم را زخمی کردم."),
            v("wrist", "مچ", "She broke her wrist.", "مچش را شکست."),
            v("knee", "زانو", "My knee is swollen.", "زانویم ورم کرده."),
            v("ankle", "مچ پا", "He twisted his ankle.", "مچ پایش را پیچاند."),
            v("sprain", "پیچ خوردن", "I sprained my ankle.", "مچ پام پیچ خورد.", "verb"),
            v("break", "شکستن", "She broke her leg.", "پایش را شکست.", "verb"),
            v("burn", "سوختن", "He burned his hand.", "دستش سوخت.", "verb"),
            v("swollen", "ورم کرده", "My ankle is swollen.", "مچ پام ورم کرده.", "adjective"),
            v("bruise", "کبودی", "There's a bruise on my arm.", "روی بازویم کبودی هست."),
            v("cut", "بریدگی", "I have a deep cut.", "بریدگی عمیقی دارم."),
            v("pain", "درد", "The pain is getting worse.", "درد دارد بدتر می‌شود."),
            v("hurt", "درد کردن", "It hurts when I walk.", "وقتی راه می‌روم درد می‌کند.", "verb"),
            v("injure", "آسیب زدن", "He injured his back.", "به کمرش آسیب زد.", "verb"),
            v("prevent", "پیشگیری کردن", "Exercise can prevent injuries.", "ورزش می‌تواند از آسیب جلوگیری کند.", "verb")
        ),
        listOf(
            GrammarSection("Passive voice for injuries", "Use be + past participle. My leg was broken in the accident. The window was broken."),
            GrammarSection("Have + noun + past participle", "Describing injuries. I had my ankle X-rayed. She had her arm put in a cast."),
            GrammarSection("Should/shouldn't for prevention", "You should warm up before exercise. You shouldn't ignore the pain."),
            GrammarSection("Questions about injuries", "What happened? Where does it hurt? How did it happen? When did it start?")
        ),
        listOf(
            d("A", "Hey, Ali! What happened to your arm?", "هی، علی! دستت چه شد؟"),
            d("B", "I broke it playing soccer last weekend.", "آخر هفته گذشته در فوتبال شکستمش."),
            d("A", "Oh no! That looks painful.", "اوه نه! دردناک به نظر می‌رسد."),
            d("B", "It was. But the pain is better now.", "دردناک بود. ولی الان درد بهتر است."),
            d("A", "How did it happen exactly?", "دقیقاً چطور اتفاق افتاد؟"),
            d("B", "I was running and fell. I landed on my arm.", "داشتم می‌دویدم و افتادم. روی دستم فرود آمدم."),
            d("A", "Ouch. Did you go to the hospital?", "آخ. به بیمارستان رفتی؟"),
            d("B", "Yes, immediately. They took an X-ray.", "بله، فوراً. اشعه ایکس گرفتند."),
            d("A", "What did the doctor say?", "دکتر چه گفت؟"),
            d("B", "It was a clean break. I had it put in a cast.", "شکستگی تمیزی بود. گچش کردند."),
            d("A", "How long do you have to wear the cast?", "چقدر باید گچ بپوشی؟"),
            d("B", "Six weeks. It's really annoying.", "شش هفته. واقعاً آزاردهنده است."),
            d("A", "I bet. Can you still work?", "شرط می‌بندم. هنوز می‌توانی کار کنی؟"),
            d("B", "Yes, but slowly. Everything takes twice as long.", "بله، ولی آرام. همه چیز دو برابر طول می‌کشد."),
            d("A", "That's frustrating.", "آزاردهنده است."),
            d("B", "Very. I can't even type properly.", "خیلی. حتی نمی‌توانم درست تایپ کنم."),
            d("A", "Do you need help with anything?", "کمک چیزی نیاز داری؟"),
            d("B", "Thanks, but I'm managing. My sister is helping a lot.", "ممنون، ولی دارم مدیریت می‌کنم. خواهرم زیاد کمک می‌کند."),
            d("A", "That's nice. What about sports?", "خوبه. ورزش چطور؟"),
            d("B", "I can't play anything for two months.", "دو ماه نمی‌توانم چیزی بازی کنم."),
            d("A", "Wow, that's a long time.", "واو، زمان طولانی‌ای است."),
            d("B", "I know. I'll go crazy.", "می‌دانم. دیوانه می‌شوم."),
            d("A", "Maybe you can do other things. Reading, movies...", "شاید کارهای دیگری انجام دهی. خواندن، فیلم..."),
            d("B", "I've been reading a lot actually. That's a plus.", "راستش زیاد خوانده‌ام. این نکته مثبتی است."),
            d("A", "See? Every cloud has a silver lining.", "می‌بینی؟ هر ابری نقره‌ای دارد."),
            d("B", "Ha! True. What about you? Any injuries?", "ها! درست. تو چطور؟ آسیب دیده‌ای؟"),
            d("A", "I sprained my ankle last year. It took months to heal.", "سال گذشته مچ پایم پیچ خورد. ماه‌ها طول کشید تا خوب شود."),
            d("B", "How did you do it?", "چطور انجامش دادی؟"),
            d("A", "I tripped on the stairs. Silly mistake.", "در پله‌ها لیز خوردم. اشتباه احمقانه."),
            d("B", "That can happen to anyone.", "برای هر کسی می‌تواند اتفاق بیفتد."),
            d("A", "I know. Now I'm much more careful.", "می‌دانم. حالا خیلی محتاط‌ترم."),
            d("B", "Good. What did you do while you were injured?", "خوبه. وقتی آسیب دیده بودی چه کار می‌کردی؟"),
            d("A", "Mostly watched TV. And I learned to cook.", "بیشتر تلویزیون تماشا می‌کردم. و آشپزی یاد گرفتم."),
            d("B", "Really? What can you cook now?", "واقعاً؟ الان چه می‌توانی بپزی؟"),
            d("A", "Pasta, soup, and some basic dishes.", "پاستا، سوپ، و چند غذای ساده."),
            d("B", "That's useful. Cooking is a life skill.", "مفید است. آشپزی یک مهارت زندگی است."),
            d("A", "Exactly. Now I cook every day.", "دقیقاً. حالا هر روز آشپزی می‌کنم."),
            d("B", "Good for you. Any tips for preventing injuries?", "آفرین به تو. نکته‌ای برای پیشگیری از آسیب؟"),
            d("A", "Warm up before exercise. And don't overdo it.", "قبل از ورزش گرم کن. و بیش از حد انجام نده."),
            d("B", "I'll remember that. My doctor said the same thing.", "یادم می‌ماند. دکترم همین را گفت."),
            d("A", "Doctors know best. Well, I should go.", "دکترها بهترین را می‌دانند. خب، باید بروم."),
            d("B", "Okay. Thanks for the chat. It helped.", "باشه. ممنون برای گفتگو. کمک کرد."),
            d("A", "Anytime. Take care of that arm!", "هر وقت. مراقب آن دستت باش!"),
            d("B", "I will. See you soon!", "می‌کنم. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How did Ali break his arm?", listOf("car accident", "fell while running", "playing basketball", "fell down stairs"), 1),
            q("How long will he wear the cast?", listOf("4 weeks", "6 weeks", "2 months", "3 months"), 1),
            q("What did Maria do last year?", listOf("broke her leg", "sprained her ankle", "broke her arm", "hurt her back"), 1),
            q("What did Maria learn while injured?", listOf("to paint", "to cook", "to play guitar", "to write"), 1),
            q("My leg ___ broken in the accident.", listOf("is", "was", "has", "did"), 1),
            q("I had my ankle ___.", listOf("X-ray", "X-rayed", "X-raying", "to X-ray"), 1),
            q("You ___ warm up before exercise.", listOf("should", "shouldn't", "mustn't", "can't"), 0),
            q("You ___ ignore the pain.", listOf("should", "shouldn't", "must", "have to"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Clean break", "شکستگی تمیز", "It was a clean break.", "شکستگی تمیزی بود."),
            IdiomExpression("Every cloud has a silver lining", "هر ابری نقره‌ای دارد", "Every cloud has a silver lining.", "هر ابری نقره‌ای دارد."),
            IdiomExpression("Go crazy", "دیوانه شدن", "I'll go crazy.", "دیوانه می‌شوم."),
            IdiomExpression("Twice as long", "دو برابر طولانی‌تر", "Everything takes twice as long.", "همه چیز دو برابر طول می‌کشد.")
        ),
        phrasal = listOf(
            PhrasalVerb("fall down", "افتادن", "fall to ground", "I fell down while running.", "وقتی می‌دویدم افتادم.", "No"),
            PhrasalVerb("warm up", "گرم کردن", "prepare the body", "Always warm up before exercise.", "همیشه قبل از ورزش گرم کن.", "No"),
            PhrasalVerb("get over", "بهبود یافتن از", "recover from", "It took months to get over it.", "ماه‌ها طول کشید تا بهبود یابم.", "Yes"),
            PhrasalVerb("take care of", "مراقبت کردن", "look after", "Take care of that arm.", "مراقب آن دستت باش.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Body parts", "SHOULder, ELbow, WRIST, KNEE, ANkle."),
            PronunciationTip("Injury verbs", "SPRAIN, BREAK, BURN, INjure, HURT."),
            PronunciationTip("Passive stress", "My leg was BROken. The window was BROken.")
        ),
        culture = listOf(
            CulturalNote("Sports injuries", "Sports injuries are common and often preventable with warm-ups."),
            CulturalNote("Casts", "Broken bones are often treated with casts for several weeks."),
            CulturalNote("Prevention", "Warming up and cooling down are standard advice for injury prevention.")
        ),
        mistakes = listOf(
            CommonMistake("My leg is broken yesterday.", "My leg was broken yesterday.", "Use past passive with past time."),
            CommonMistake("I have broken my leg yesterday.", "I broke my leg yesterday.", "Use simple past with specific time."),
            CommonMistake("It hurts me.", "It hurts.", "Say 'it hurts' without 'me'."),
            CommonMistake("I sprained to my ankle.", "I sprained my ankle.", "Don't use 'to' after 'sprain'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How did Ali break his arm?", "He fell while running and landed on his arm."),
            ComprehensionQuestion("What advice does Maria give for prevention?", "Warm up before exercise and don't overdo it."),
            ComprehensionQuestion("What did Maria learn while injured?", "She learned to cook — pasta, soup, and basic dishes.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about an injury you've had.", "درباره یک آسیب که داشته‌ای صحبت کن.", "I broke... / I sprained... / It took... to heal."),
            SpeakingTask("Give advice about injury prevention.", "توصیه‌هایی درباره پیشگیری از آسیب بده.", "You should... / Always warm up... / Don't overdo it."),
            SpeakingTask("Role-play a doctor's visit.", "نقش‌بازی ملاقات با پزشک.", "Where does it hurt? / What happened? / You should...")
        ),
        writing = listOf(
            WritingTask("Write about an injury and its lessons.", "درباره یک آسیب و درس‌هایش بنویس.", 180, "Use passive voice for injuries.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 5 — Health | سلامت
    // ═══════════════════════════════════════════════════════════════
    private fun unit5() = base(
        5, "Health", "سلامت",
        listOf(
            "Talk about health and lifestyle",
            "Use modal verbs for advice and obligation",
            "Discuss healthy habits and stress management",
            "Talk about mental and physical well-being"
        ),
        listOf(
            v("well-being", "سلامتی", "Mental well-being is important.", "سلامتی روانی مهم است."),
            v("stress", "استرس", "Stress causes health problems.", "استرس مشکلات سلامتی ایجاد می‌کند."),
            v("anxiety", "اضطراب", "He suffers from anxiety.", "او از اضطراب رنج می‌برد."),
            v("depression", "افسردگی", "Depression is a serious condition.", "افسردگی وضعیت جدی است."),
            v("symptom", "علامت", "What are the symptoms?", "علائم چیست؟"),
            v("treatment", "درمان", "The treatment lasts three months.", "درمان سه ماه طول می‌کشد."),
            v("therapy", "درمان / تراپی", "She's in therapy.", "او در درمان است."),
            v("meditation", "مدیتیشن", "Meditation reduces stress.", "مدیتیشن استرس را کم می‌کند."),
            v("balanced diet", "رژیم متعادل", "A balanced diet is essential.", "رژیم متعادل ضروری است."),
            v("regular exercise", "ورزش منظم", "Regular exercise improves mood.", "ورزش منظم حالت را بهبود می‌بخشد."),
            v("sleep well", "خوب خوابیدن", "I try to sleep well.", "سعی می‌کنم خوب بخوابم.", "verb"),
            v("cut down", "کم کردن", "You should cut down on caffeine.", "باید کافئین را کم کنی.", "verb"),
            v("take up", "شروع کردن", "I'm taking up yoga.", "دارم یوگا شروع می‌کنم.", "verb"),
            v("give up", "ترک کردن", "He gave up smoking.", "سیگار را ترک کرد.", "verb"),
            v("check-up", "معاینه", "I have a check-up next week.", "هفته بعد معاینه دارم.")
        ),
        listOf(
            GrammarSection("Modal verbs for advice", "should, ought to, had better. You should rest. You ought to see a doctor."),
            GrammarSection("Modal verbs for obligation", "must, have to. You must take this medicine. I have to exercise daily."),
            GrammarSection("Modal verbs for prohibition", "mustn't, can't. You mustn't skip meals. You can't smoke here."),
            GrammarSection("First conditional for health", "If you exercise, you'll feel better. If you don't sleep, you'll get sick.")
        ),
        listOf(
            d("A", "Hey, Maria! You look great! Have you been doing something different?", "هی، ماریا! عالی به نظر می‌رسی! چیز متفاوتی انجام می‌دهی؟"),
            d("B", "Thanks! Yes, I've been making changes to my lifestyle.", "ممنون! بله، تغییری در سبک زندگی‌ام ایجاد کرده‌ام."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "I've started meditating, eating better, and exercising regularly.", "شروع کرده‌ام به مدیتیشن، بهتر خوردن، و ورزش منظم."),
            d("A", "Wow, that's a lot. What made you change?", "واو، زیاد است. چه چیزی باعث تغییر شد؟"),
            d("B", "I was feeling stressed all the time. My doctor told me to make changes.", "همیشه احساس استرس می‌کردم. دکترم گفت تغییراتی بدهم."),
            d("A", "Were you sick?", "مریض بودی؟"),
            d("B", "Not physically. But mentally I was exhausted.", "نه جسمی. ولی ذهنی خسته بودم."),
            d("A", "That's serious. Mental health is important.", "جدی است. سلامت روانی مهم است."),
            d("B", "Exactly. Most people ignore it, but it affects everything.", "دقیقاً. بیشتر مردم نادیده می‌گیرند، ولی روی همه چیز تأثیر می‌گذارد."),
            d("A", "What changes did you make exactly?", "دقیقاً چه تغییراتی دادی؟"),
            d("B", "First, I cut down on caffeine. I used to drink 5 coffees a day.", "اول، کافئین را کم کردم. قبلاً روزی ۵ قهوه می‌نوشیدم."),
            d("A", "Five! That's a lot.", "پنج! زیاد است."),
            d("B", "I know. Now I have one in the morning and tea after that.", "می‌دانم. الان یکی صبح و بعدش چای."),
            d("A", "How do you feel now?", "الان چه حسی داری؟"),
            d("B", "Much better. I sleep well now.", "خیلی بهتر. الان خوب می‌خوابم."),
            d("A", "That's great. What else did you change?", "عالی است. دیگر چه تغییر دادی؟"),
            d("B", "My diet. I eat more vegetables and less processed food.", "رژیمم. سبزیجات بیشتر و غذای فرآوری‌شده کمتر."),
            d("A", "Do you still eat meat?", "هنوز گوشت می‌خوری؟"),
            d("B", "Yes, but less. Mostly chicken and fish.", "بله، ولی کمتر. بیشتر مرغ و ماهی."),
            d("A", "That's healthier. What about exercise?", "سالم‌تر است. ورزش چطور؟"),
            d("B", "I've taken up yoga. It helps with stress.", "یوگا را شروع کرده‌ام. به استرس کمک می‌کند."),
            d("A", "I've heard yoga is great. Is it hard?", "شنیده‌ام یوگا عالی است. سخت است؟"),
            d("B", "At first, yes. But you get used to it.", "اولش، بله. ولی عادت می‌کنی."),
            d("A", "How often do you practice?", "چند وقت یک بار تمرین می‌کنی؟"),
            d("B", "Three times a week. Even 20 minutes helps.", "هفته‌ای سه بار. حتی ۲۰ دقیقه کمک می‌کند."),
            d("A", "That's a good habit. What about meditation?", "عادت خوبی است. مدیتیشن چطور؟"),
            d("B", "I meditate every morning for 10 minutes. It calms my mind.", "هر صبح ۱۰ دقیقه مدیتیشن می‌کنم. ذهنم را آرام می‌کند."),
            d("A", "Does it really work?", "واقعاً کار می‌کند؟"),
            d("B", "For me, yes. I'm much calmer now.", "برای من، بله. الان خیلی آرام‌ترم."),
            d("A", "I should try it. I'm stressed too.", "باید امتحان کنم. من هم استرس دارم."),
            d("B", "You should. It's easy to start.", "باید بکنی. شروعش راحت است."),
            d("A", "How do I start?", "چطور شروع کنم؟"),
            d("B", "There are apps. Just 5 minutes a day to start.", "اپلیکیشن‌هایی هست. فقط ۵ دقیقه در روز برای شروع."),
            d("A", "That sounds doable. Any other advice?", "شدنی به نظر می‌رسد. توصیه دیگری؟"),
            d("B", "Drink more water. And get enough sleep.", "آب بیشتر بنوش. و خواب کافی."),
            d("A", "How much sleep do you get?", "چقدر می‌خوابی؟"),
            d("B", "About 8 hours. It makes a huge difference.", "حدود ۸ ساعت. تفاوت بزرگی ایجاد می‌کند."),
            d("A", "I only sleep 5 or 6 hours.", "من فقط ۵ یا ۶ ساعت می‌خوابم."),
            d("B", "That's not enough. Sleep is when your body repairs itself.", "کافی نیست. خواب زمانی است که بدنت خودش را ترمیم می‌کند."),
            d("A", "I know. But I have so much to do.", "می‌دانم. ولی کارهای زیادی دارم."),
            d("B", "You have to make time. Health comes first.", "باید وقت بسازی. سلامتی اولویت دارد."),
            d("A", "You're right. I'll try to sleep earlier.", "حق داری. سعی می‌کنم زودتر بخوابم."),
            d("B", "Good. Small changes, big results.", "خوبه. تغییرات کوچک، نتایج بزرگ."),
            d("A", "Thanks for the advice. You're inspiring.", "ممنون برای توصیه. الهام‌بخشی."),
            d("B", "Thanks. It took me a while to get here.", "ممنون. مدتی طول کشید تا به اینجا برسم."),
            d("A", "How long did it take?", "چقدر طول کشید؟"),
            d("B", "About six months. It's a journey, not a quick fix.", "حدود شش ماه. سفر است، نه راه‌حل سریع."),
            d("A", "That makes sense. Well, I should start.", "منطقی است. خب، باید شروع کنم."),
            d("B", "Yes. Start today. Not tomorrow.", "بله. امروز شروع کن. نه فردا."),
            d("A", "Ha! Okay. Thanks again.", "ها! باشه. باز هم ممنون."),
            d("B", "Anytime. Take care of yourself!", "هر وقت. از خودت مراقبت کن!"),
            d("A", "You too! See you soon.", "تو هم! به‌زودی می‌بینمت."),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Why did Maria change her lifestyle?", listOf("she was sick", "she was stressed", "her friend told her", "she gained weight"), 1),
            q("How many coffees did she used to drink?", listOf("2", "3", "4", "5"), 3),
            q("What has she taken up?", listOf("running", "yoga", "swimming", "cycling"), 1),
            q("How long did the changes take?", listOf("1 month", "3 months", "6 months", "1 year"), 2),
            q("You ___ see a doctor.", listOf("should", "shouldn't", "mustn't", "can't"), 0),
            q("You ___ skip meals.", listOf("should", "shouldn't", "must", "have to"), 1),
            q("You ___ take this medicine.", listOf("must", "mustn't", "shouldn't", "can't"), 0),
            q("If you exercise, you ___ better.", listOf("feel", "will feel", "felt", "feeling"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Small changes, big results", "تغییرات کوچک، نتایج بزرگ", "Small changes, big results.", "تغییرات کوچک، نتایج بزرگ."),
            IdiomExpression("Quick fix", "راه‌حل سریع", "It's not a quick fix.", "راه‌حل سریع نیست."),
            IdiomExpression("Make a difference", "تفاوت ایجاد کردن", "It makes a huge difference.", "تفاوت بزرگی ایجاد می‌کند."),
            IdiomExpression("Health comes first", "سلامتی اولویت دارد", "Health comes first.", "سلامتی اولویت دارد.")
        ),
        phrasal = listOf(
            PhrasalVerb("take up", "شروع کردن", "begin", "I've taken up yoga.", "یوگا را شروع کرده‌ام.", "Yes"),
            PhrasalVerb("cut down on", "کم کردن", "reduce", "I cut down on caffeine.", "کافئین را کم کردم.", "No"),
            PhrasalVerb("give up", "ترک کردن", "quit", "He gave up smoking.", "سیگار را ترک کرد.", "Yes"),
            PhrasalVerb("get used to", "عادت کردن", "become accustomed", "You get used to it.", "به آن عادت می‌کنی.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Modal stress", "You SHOULD rest. You MUST sleep."),
            PronunciationTip("Health vocabulary", "WELL-being, STREss, ANxiety, DEPRession, THErapy."),
            PronunciationTip("Conditional rhythm", "If you exercise, you'll FEEL better.")
        ),
        culture = listOf(
            CulturalNote("Mental health", "Mental health awareness has grown globally. Therapy is increasingly accepted."),
            CulturalNote("Wellness trends", "Yoga, meditation, and mindfulness are popular worldwide."),
            CulturalNote("Work-life balance", "Many cultures now prioritize work-life balance for well-being.")
        ),
        mistakes = listOf(
            CommonMistake("You should to rest.", "You should rest.", "After 'should', use base verb."),
            CommonMistake("You must to sleep.", "You must sleep.", "After 'must', use base verb."),
            CommonMistake("I'm used to wake up early.", "I'm used to waking up early.", "Use gerund after 'be used to'."),
            CommonMistake("If you will exercise, you'll feel better.", "If you exercise, you'll feel better.", "Use present simple after 'if'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What changes did Maria make?", "Cut down caffeine, better diet, yoga 3x/week, meditation daily, 8 hours sleep."),
            ComprehensionQuestion("How long did the changes take?", "About six months — it's a journey, not a quick fix."),
            ComprehensionQuestion("What's Maria's key advice?", "Small changes, big results. Start today, not tomorrow.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your healthy habits.", "درباره عادات سالمت صحبت کن.", "I try to... / I usually... / I should..."),
            SpeakingTask("Give health advice.", "توصیه سلامتی بده.", "You should... / You must... / If you..., you'll..."),
            SpeakingTask("Talk about managing stress.", "درباره مدیریت استرس صحبت کن.", "I deal with stress by... / It helps me... / I used to...")
        ),
        writing = listOf(
            WritingTask("Write about a healthy lifestyle change you want to make.", "درباره تغییر سبک زندگی سالمی که می‌خواهی انجام دهی بنویس.", 180, "Use modals and conditionals.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 6 — TV and movies | تلویزیون و فیلم
    // ═══════════════════════════════════════════════════════════════
    private fun unit6() = base(
        6, "TV and movies", "تلویزیون و فیلم",
        listOf(
            "Talk about TV shows and movies",
            "Express opinions and preferences",
            "Use gerunds and infinitives after verbs",
            "Discuss entertainment choices"
        ),
        listOf(
            v("series", "سریال", "I'm watching a new series.", "یک سریال جدید تماشا می‌کنم."),
            v("episode", "قسمت", "The new episode is tonight.", "قسمت جدید امشب است."),
            v("plot", "خط داستانی", "The plot was very clever.", "خط داستانی خیلی هوشمندانه بود."),
            v("character", "شخصیت", "The main character is amazing.", "شخصیت اصلی شگفت‌انگیز است."),
            v("acting", "بازیگری", "The acting was incredible.", "بازیگری باورنکردنی بود."),
            v("soundtrack", "موسیقی متن", "The soundtrack is beautiful.", "موسیقی متن زیباست."),
            v("director", "کارگردان", "Who's the director?", "کارگردان کیست؟"),
            v("cast", "بازیگران", "The cast is excellent.", "بازیگران عالی هستند."),
            v("review", "نقد", "The reviews are positive.", "نقدها مثبت هستند."),
            v("recommend", "توصیه کردن", "I recommend this show.", "این برنامه را توصیه می‌کنم.", "verb"),
            v("binge-watch", "پشت سر هم تماشا کردن", "I binge-watched the whole season.", "کل فصل را پشت سر هم تماشا کردم.", "verb"),
            v("plot twist", "پیچش داستانی", "The plot twist shocked me.", "پیچش داستانی شوکه‌ام کرد."),
            v("subtitle", "زیرنویس", "I watch with subtitles.", "با زیرنویس تماشا می‌کنم."),
            v("streaming", "استریم", "Streaming is very convenient.", "استریم خیلی راحت است."),
            v("screen", "صفحه", "The screen is huge.", "صفحه بزرگ است.")
        ),
        listOf(
            GrammarSection("Gerunds after certain verbs", "enjoy, avoid, finish, suggest, mind, keep. I enjoy watching series. She finished reading the book."),
            GrammarSection("Infinitives after certain verbs", "decide, hope, want, promise, plan, need. I decided to watch it. She hopes to become an actress."),
            GrammarSection("Verbs with both gerund and infinitive", "like, love, hate, prefer, start, begin. I like watching movies. I like to watch movies."),
            GrammarSection("Expressing opinions about entertainment", "In my opinion... / I think... / For me... / I find it...")
        ),
        listOf(
            d("A", "Hey, Ali! Have you watched that new series everyone's talking about?", "هی، علی! آن سریال جدیدی که همه درباره‌اش صحبت می‌کنند را دیده‌ای؟"),
            d("B", "Which one? There are so many these days.", "کدام یکی؟ این روزها خیلی زیادند."),
            d("A", "The detective one. It's on Netflix.", "آن کارآگاهی. در نتفلیکس است."),
            d("B", "Oh, yes! I binge-watched the whole season last weekend.", "اوه، بله! آخر هفته گذشته کل فصل را پشت سر هم دیدم."),
            d("A", "Really? How was it?", "واقعاً؟ چطور بود؟"),
            d("B", "Incredible. The plot twists were unexpected.", "باورنکردنی. پیچش‌های داستانی غیرمنتظره بودند."),
            d("A", "I heard the acting is amazing.", "شنیده‌ام بازیگری شگفت‌انگیز است."),
            d("B", "It is. The main actress deserves an award.", "هست. بازیگر اصلی مستحق جایزه است."),
            d("A", "How many episodes are there?", "چند قسمت دارد؟"),
            d("B", "Eight. Each one is about an hour.", "هشت. هر کدام حدود یک ساعت."),
            d("A", "Did you watch it in one sitting?", "یک‌جا تماشا کردی؟"),
            d("B", "Almost. I stopped only for food and sleep.", "تقریباً. فقط برای غذا و خواب متوقف شدم."),
            d("A", "Ha! That's addiction.", "ها! این اعتیاد است."),
            d("B", "I know. Streaming makes it too easy.", "می‌دانم. استریم خیلی راحت‌اش می‌کند."),
            d("A", "Do you prefer streaming or watching TV?", "استریم ترجیح می‌دهی یا تلویزیون؟"),
            d("B", "Streaming, definitely. I can watch when I want.", "قطعاً استریم. می‌توانم هر وقت بخواهم تماشا کنم."),
            d("A", "Me too. Do you watch with subtitles?", "من هم. با زیرنویس تماشا می‌کنی؟"),
            d("B", "Sometimes. Especially for British shows.", "گاهی. مخصوصاً برای برنامه‌های بریتانیایی."),
            d("A", "Why British?", "چرا بریتانیایی؟"),
            d("B", "The accents are harder to understand.", "لهجه‌هایشان سخت‌تر فهمیده می‌شوند."),
            d("A", "That's true. What about movies?", "درست است. فیلم‌ها چطور؟"),
            d("B", "I love movies. Especially thrillers and dramas.", "عاشق فیلمم. مخصوصاً دلهره‌آور و درام."),
            d("A", "Have you seen the new one with that famous actress?", "آن فیلم جدید با آن بازیگر معروف را دیده‌ای؟"),
            d("B", "Not yet. Is it good?", "هنوز نه. خوب است؟"),
            d("A", "The reviews are excellent. Four out of five stars.", "نقدها عالی هستند. چهار از پنج ستاره."),
            d("B", "That's high. What's it about?", "بالاست. درباره چیست؟"),
            d("A", "It's about a woman who discovers a family secret.", "درباره زنی است که یک راز خانوادگی کشف می‌کند."),
            d("B", "Sounds interesting. Who's the director?", "جالب به نظر می‌رسد. کارگردان کیست؟"),
            d("A", "I can't remember his name. But he's famous.", "نامش یادم نمی‌آید. ولی معروف است."),
            d("B", "I'll look it up. Are you going to see it?", "جستجو می‌کنم. می‌خواهی ببینی‌اش؟"),
            d("A", "Yes. Maybe this weekend. Want to come?", "بله. شاید این آخر هفته. می‌خواهی بیایی؟"),
            d("B", "Sure! Which day?", "حتماً! کدام روز؟"),
            d("A", "How about Sunday afternoon?", "یکشنبه بعدازظهر چطور؟"),
            d("B", "Perfect. I'm free then.", "عالی. آن موقع آزادم."),
            d("A", "Great. Let's meet at the cinema at 3.", "عالی. بیایید ساعت ۳ در سینما ملاقات کنیم."),
            d("B", "Sounds good. What about the soundtrack?", "خوبه. موسیقی متن چطور؟"),
            d("A", "They say it's beautiful. Composed by a famous musician.", "می‌گویند زیباست. توسط موسیقیدان معروفی ساخته شده."),
            d("B", "Nice. I love good soundtracks.", "خوبه. عاشق موسیقی متن‌های خوبم."),
            d("A", "Me too. They make movies unforgettable.", "من هم. فیلم‌ها را فراموش‌نشدنی می‌کنند."),
            d("B", "Do you ever watch movies at home?", "هیچ‌وقت در خانه فیلم تماشا می‌کنی؟"),
            d("A", "Sometimes. But the cinema is better.", "گاهی. ولی سینما بهتر است."),
            d("B", "I agree. The big screen makes a difference.", "موافقم. صفحه بزرگ تفاوت ایجاد می‌کند."),
            d("A", "Exactly. What's the best movie you've seen this year?", "دقیقاً. بهترین فیلمی که امسال دیده‌ای چیست؟"),
            d("B", "Probably a French film. Beautiful story.", "احتمالاً یک فیلم فرانسوی. داستان زیبا."),
            d("A", "What was it about?", "درباره چه بود؟"),
            d("B", "A chef who starts a new life in Paris.", "سرآشپزی که زندگی جدیدی در پاریس شروع می‌کند."),
            d("A", "Sounds lovely. I'll add it to my list.", "زیبا به نظر می‌رسد. به لیستم اضافه می‌کنم."),
            d("B", "You won't regret it. The ending is so moving.", "پشیمان نمی‌شوی. پایانش خیلی تأثیرگذار است."),
            d("A", "I've heard that. Well, see you Sunday!", "شنیده‌ام. خب، یکشنبه می‌بینمت!"),
            d("B", "See you! Don't forget the tickets!", "می‌بینمت! بلیط‌ها را فراموش نکن!"),
            d("A", "I won't. Bye!", "فراموش نمی‌کنم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did Ali do last weekend?", listOf("went to cinema", "binge-watched a series", "read a book", "played games"), 1),
            q("How many episodes are there?", listOf("6", "8", "10", "12"), 1),
            q("Why does Ali sometimes use subtitles?", listOf("hearing problem", "British accents", "background noise", "preference"), 1),
            q("When are they meeting at the cinema?", listOf("Saturday", "Sunday morning", "Sunday afternoon", "Friday"), 2),
            q("I enjoy ___ series.", listOf("watch", "watching", "to watch", "watched"), 1),
            q("She decided ___ it.", listOf("watching", "to watch", "watch", "watched"), 1),
            q("I like ___ movies.", listOf("watch", "to watch", "both a and b", "watched"), 2),
            q("What do you think ___ the movie?", listOf("of", "about", "for", "at"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Binge-watch", "پشت سر هم تماشا کردن", "I binge-watched the whole season.", "کل فصل را پشت سر هم دیدم."),
            IdiomExpression("One sitting", "یک‌جا", "I watched it in one sitting.", "یک‌جا تماشا کردم."),
            IdiomExpression("Look it up", "جستجو کردن", "I'll look it up.", "جستجو می‌کنم."),
            IdiomExpression("Make a difference", "تفاوت ایجاد کردن", "The big screen makes a difference.", "صفحه بزرگ تفاوت ایجاد می‌کند.")
        ),
        phrasal = listOf(
            PhrasalVerb("watch out", "مواظب بودن", "be careful", "Watch out — the ending is sad!", "مواظب باش — پایانش غمگین است!", "No"),
            PhrasalVerb("turn on", "روشن کردن", "switch on", "Turn on the TV.", "تلویزیون را روشن کن.", "Yes"),
            PhrasalVerb("turn off", "خاموش کردن", "switch off", "Turn off the show.", "برنامه را خاموش کن.", "Yes"),
            PhrasalVerb("find out", "فهمیدن", "discover", "Find out what happens next.", "بفهم چه اتفاقی می‌افتد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Gerund vs. infinitive", "I enJOY watching. I deCIDed to watch."),
            PronunciationTip("Entertainment stress", "SERies, EPisode, SOUNDtrack, DIrector."),
            PronunciationTip("Opinion intonation", "In my OPIion, it's BORing.")
        ),
        culture = listOf(
            CulturalNote("Streaming culture", "Streaming services have changed how people watch TV and movies."),
            CulturalNote("Binge-watching", "Watching entire seasons in one sitting has become common."),
            CulturalNote("Subtitles", "Subtitles help language learners but are also used by native speakers.")
        ),
        mistakes = listOf(
            CommonMistake("I enjoy to watch series.", "I enjoy watching series.", "Use gerund after 'enjoy'."),
            CommonMistake("I decided watching it.", "I decided to watch it.", "Use infinitive after 'decide'."),
            CommonMistake("What do you think about the movie?", "What do you think of the movie?", "'Think of' is more common."),
            CommonMistake("I have seen it yesterday.", "I saw it yesterday.", "Use simple past with specific time.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's the series about?", "A detective story with unexpected plot twists and incredible acting."),
            ComprehensionQuestion("What are the friends' preferences?", "Both prefer cinema to home viewing; Ali likes thrillers and dramas."),
            ComprehensionQuestion("What will they do Sunday?", "Watch a new movie at the cinema at 3 PM.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your favorite TV show.", "درباره برنامه تلویزیونی مورد علاقه‌ات صحبت کن.", "I enjoy... / It's about... / The acting is..."),
            SpeakingTask("Recommend a movie or show.", "یک فیلم یا برنامه توصیه کن.", "I recommend... / You should watch... / It's worth..."),
            SpeakingTask("Discuss streaming vs. cinema.", "درباره استریم و سینما صحبت کن.", "I prefer... / Streaming is... / Cinema is...")
        ),
        writing = listOf(
            WritingTask("Write a review of a movie or TV series.", "نقد یک فیلم یا سریال بنویس.", 180, "Use gerunds and infinitives.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 7 — Sports | ورزش
    // ═══════════════════════════════════════════════════════════════
    private fun unit7() = base(
        7, "Sports", "ورزش",
        listOf(
            "Talk about sports and exercise",
            "Use past simple and past continuous",
            "Describe sports events and results",
            "Discuss sports preferences"
        ),
        listOf(
            v("sport", "ورزش", "What sports do you like?", "چه ورزش‌هایی دوست داری؟"),
            v("team", "تیم", "Which team do you support?", "کدام تیم را حمایت می‌کنی؟"),
            v("player", "بازیکن", "He's the best player on the team.", "او بهترین بازیکن تیم است."),
            v("coach", "مربی", "The coach is very strict.", "مربی خیلی سختگیر است."),
            v("match", "مسابقه", "The match starts at 8.", "مسابقه ساعت ۸ شروع می‌شود."),
            v("score", "امتیاز", "What's the score?", "امتیاز چقدر است؟"),
            v("win", "بردن", "We won the game!", "بازی را بردیم!", "verb"),
            v("lose", "باختن", "They lost last night.", "دیشب باختند.", "verb"),
            v("tie", "مساوی", "The game ended in a tie.", "بازی مساوی شد.", "verb"),
            v("champion", "قهرمان", "He's a world champion.", "او قهرمان جهان است."),
            v("tournament", "تورنمنت", "The tournament starts next week.", "تورنمنت هفته بعد شروع می‌شود."),
            v("training", "تمرین", "Training starts at 6 AM.", "تمرین ساعت ۶ صبح شروع می‌شود."),
            v("goal", "گل", "He scored a beautiful goal.", "او گل زیبایی زد."),
            v("referee", "داور", "The referee made a bad call.", "داور تصمیم بدی گرفت."),
            v("fan", "طرفدار", "I'm a big football fan.", "طرفدار بزرگ فوتبالم.")
        ),
        listOf(
            GrammarSection("Past simple for completed actions", "I played tennis yesterday. She won the match."),
            GrammarSection("Past continuous for background actions", "I was watching TV when the game started. They were playing when it rained."),
            GrammarSection("Past continuous + past simple", "Use past continuous for the background, past simple for the interruption. I was running when I fell."),
            GrammarSection("Time expressions with past tenses", "yesterday, last night, at 8 PM, while, when.")
        ),
        listOf(
            d("A", "Hey, Ali! Did you watch the game last night?", "هی، علی! دیشب بازی را دیدی؟"),
            d("B", "Which game? There were several.", "کدام بازی؟ چند تا بود."),
            d("A", "The football match. The championship final!", "مسابقه فوتبال. فینال قهرمانی!"),
            d("B", "Oh yes! I watched the whole thing. It was amazing.", "اوه بله! کل مسابقه را دیدم. شگفت‌انگیز بود."),
            d("A", "What a game! It went to extra time.", "چه بازی‌ای! به وقت اضافه رفت."),
            d("B", "I know. I was on the edge of my seat.", "می‌دانم. روی لبه صندلی بودم."),
            d("A", "Who was your favorite player?", "بازیکن مورد علاقه‌ات کی بود؟"),
            d("B", "The goalkeeper. He made some incredible saves.", "دروازه‌بان. سیوهای باورنکردنی‌ای کرد."),
            d("A", "Definitely. Without him, they would have lost.", "قطعاً. بدون او می‌باختند."),
            d("B", "What was the final score?", "نتیجه نهایی چه بود؟"),
            d("A", "2-1. The winning goal was in the 118th minute.", "۲-۱. گل برنده در دقیقه ۱۱۸ بود."),
            d("B", "Wow. A last-minute winner. Classic!", "واو. برنده دقیقه آخر. کلاسیک!"),
            d("A", "The whole stadium went crazy.", "کل استادیوم دیوانه شد."),
            d("B", "I can imagine. Who was the referee?", "می‌توانم تصور کنم. داور کی بود؟"),
            d("A", "Some famous one. He made a couple of questionable calls.", "یکی معروف. چند تصمیم سوال‌برانگیز گرفت."),
            d("B", "There are always controversies in big matches.", "در مسابقات بزرگ همیشه جنجال هست."),
            d("A", "True. Did you play sports when you were younger?", "درست. وقتی جوان‌تر بودی ورزش می‌کردی؟"),
            d("B", "Yes. I used to play football every weekend.", "بله. هر آخر هفته فوتبال بازی می‌کردم."),
            d("A", "Really? What position?", "واقعاً؟ چه پستی؟"),
            d("B", "Midfielder. I loved running around the field.", "هافبک. عاشق دویدن در زمین بودم."),
            d("A", "Why did you stop?", "چرا متوقف شدی؟"),
            d("B", "I injured my knee. Never fully recovered.", "زانویم آسیب دید. هرگز کاملاً بهبود نیافت."),
            d("A", "That's too bad. Do you miss it?", "حیف شد. دلت تنگ می‌شود؟"),
            d("B", "Sometimes. Especially watching big matches.", "گاهی. مخصوصاً تماشای مسابقات بزرگ."),
            d("A", "Do you follow any teams?", "تیمی را دنبال می‌کنی؟"),
            d("B", "Yes. I'm a fan of the local team.", "بله. طرفدار تیم محلی‌ام."),
            d("A", "How are they doing this season?", "این فصل چطور پیش می‌روند؟"),
            d("B", "Not great. They're in the middle of the table.", "خیلی خوب نه. در میانه جدول هستند."),
            d("A", "Do they have a good coach?", "مربی خوبی دارند؟"),
            d("B", "He's okay, but the team needs new players.", "قابل قبول است، ولی تیم به بازیکنان جدید نیاز دارد."),
            d("A", "What about you? Do you exercise now?", "تو چطور؟ الان ورزش می‌کنی؟"),
            d("B", "I go to the gym. And I swim sometimes.", "به باشگاه می‌روم. و گاهی شنا می‌کنم."),
            d("A", "Swimming is great exercise.", "شنا ورزش عالی‌ای است."),
            d("B", "Yes. It's easy on the knees.", "بله. برای زانو راحت است."),
            d("A", "Ha! Smart choice.", "ها! انتخاب هوشمندانه."),
            d("B", "What about you? Do you play anything?", "تو چطور؟ چیزی بازی می‌کنی؟"),
            d("A", "Tennis. I play every Saturday morning.", "تنیس. هر شنبه صبح بازی می‌کنم."),
            d("B", "Nice. Is it competitive?", "خوبه. رقابتی است؟"),
            d("A", "Not really. We play for fun.", "نه واقعاً. برای سرگرمی بازی می‌کنیم."),
            d("B", "That's the best way.", "بهترین روش است."),
            d("A", "Exactly. Well, I should go. Training tomorrow morning.", "دقیقاً. خب، باید بروم. فردا صبح تمرین دارم."),
            d("B", "Good luck. Don't forget to warm up!", "موفق باشی. گرم کردن را فراموش نکن!"),
            d("A", "I won't. See you soon!", "فراموش نمی‌کنم. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What was the final score?", listOf("1-0", "2-1", "3-2", "1-1"), 1),
            q("In what minute was the winning goal?", listOf("90th", "100th", "110th", "118th"), 3),
            q("What position did Ali play?", listOf("goalkeeper", "defender", "midfielder", "striker"), 2),
            q("Why did Ali stop playing football?", listOf("no time", "knee injury", "moved away", "bored"), 1),
            q("I ___ TV when the game started.", listOf("watch", "watched", "was watching", "watches"), 2),
            q("They ___ playing when it rained.", listOf("was", "were", "are", "is"), 1),
            q("I ___ running when I fell.", listOf("was", "were", "am", "is"), 0),
            q("We ___ the game last night.", listOf("win", "wins", "won", "winning"), 2)
        ),
        idioms = listOf(
            IdiomExpression("On the edge of my seat", "روی لبه صندلی", "I was on the edge of my seat.", "روی لبه صندلی بودم."),
            IdiomExpression("Last-minute winner", "برنده دقیقه آخر", "A last-minute winner!", "برنده دقیقه آخر!"),
            IdiomExpression("Go crazy", "دیوانه شدن", "The stadium went crazy.", "استادیوم دیوانه شد."),
            IdiomExpression("Middle of the table", "میانه جدول", "They're in the middle of the table.", "در میانه جدول هستند.")
        ),
        phrasal = listOf(
            PhrasalVerb("warm up", "گرم کردن", "prepare the body", "Warm up before the match.", "قبل از مسابقه گرم کن.", "No"),
            PhrasalVerb("work out", "ورزش کردن", "exercise", "I work out three times a week.", "هفته‌ای سه بار ورزش می‌کنم.", "No"),
            PhrasalVerb("give up", "رها کردن", "quit", "He gave up football after the injury.", "بعد از آسیب فوتبال را رها کرد.", "Yes"),
            PhrasalVerb("take up", "شروع کردن", "begin", "I took up tennis last year.", "سال گذشته تنیس را شروع کردم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Sports vocabulary", "PLAYer, COACH, REFeree, TOURnament, CHAMpion."),
            PronunciationTip("Past continuous", "I was WATCHing when it STARted."),
            PronunciationTip("Match vocabulary stress", "SCORE, GOAL, TEAM, MATCH.")
        ),
        culture = listOf(
            CulturalNote("Football fans", "Football (soccer) is the most popular sport globally with passionate fans."),
            CulturalNote("Sports injuries", "Sports injuries are common, especially knee and ankle problems."),
            CulturalNote("Local teams", "Supporting local teams is a cultural tradition in many countries.")
        ),
        mistakes = listOf(
            CommonMistake("I was watch TV.", "I was watching TV.", "Use -ing after was/were."),
            CommonMistake("They was playing.", "They were playing.", "Use 'were' with they."),
            CommonMistake("We win last night.", "We won last night.", "Use past simple 'won'."),
            CommonMistake("I used to playing football.", "I used to play football.", "Use base verb after 'used to'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What happened in the match?", "Final was 2-1 with a last-minute goal in the 118th minute."),
            ComprehensionQuestion("What was Ali's sports history?", "Played football as a midfielder, stopped due to knee injury."),
            ComprehensionQuestion("How does Ali exercise now?", "Gym and swimming — easier on the knees.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your favorite sport.", "درباره ورزش مورد علاقه‌ات صحبت کن.", "I love... / I play... / I watch..."),
            SpeakingTask("Describe a memorable match.", "یک مسابقه به‌یادماندنی توصیف کن.", "It was... / The score was... / I was..."),
            SpeakingTask("Discuss sports and exercise.", "درباره ورزش و تمرین صحبت کن.", "I usually... / I used to... / I prefer...")
        ),
        writing = listOf(
            WritingTask("Write about a memorable sports event.", "درباره یک رویداد ورزشی به‌یادماندنی بنویس.", 180, "Use past simple and past continuous.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 8 — Travel | سفر
    // ═══════════════════════════════════════════════════════════════
    private fun unit8() = base(
        8, "Travel", "سفر",
        listOf(
            "Talk about travel experiences",
            "Use present perfect for travel experiences",
            "Ask and answer about destinations",
            "Describe places you've visited"
        ),
        listOf(
            v("travel", "سفر کردن", "I love to travel.", "عاشق سفر کردنم.", "verb"),
            v("destination", "مقصد", "What's your next destination?", "مقصد بعدی‌ات چیست؟"),
            v("trip", "سفر", "We're planning a trip.", "در حال برنامه‌ریزی سفریم."),
            v("journey", "سفر طولانی", "The journey was long.", "سفر طولانی بود."),
            v("abroad", "خارج از کشور", "Have you ever been abroad?", "هیچ‌وقت خارج از کشور بوده‌ای؟", "adverb"),
            v("sightseeing", "گشت‌وگذار", "We went sightseeing all day.", "تمام روز گشت‌وگذار کردیم."),
            v("landmark", "بنای تاریخی", "The Eiffel Tower is a famous landmark.", "برج ایفل بنای تاریخی معروفی است."),
            v("souvenir", "سوغات", "I bought souvenirs for my family.", "برای خانواده‌ام سوغات خریدم."),
            v("passport", "پاسپورت", "Don't forget your passport.", "پاسپورتت را فراموش نکن."),
            v("luggage", "چمدان", "My luggage was lost.", "چمدانم گم شد."),
            v("boarding pass", "کارت پرواز", "Here's your boarding pass.", "این هم کارت پروازت."),
            v("departure", "خروج", "The departure is at 9.", "خروج ساعت ۹ است."),
            v("arrival", "ورود", "Our arrival is at noon.", "ورودمان سر ظهر است."),
            v("book", "رزرو کردن", "I booked a hotel online.", "هتلی آنلاین رزرو کردم.", "verb"),
            v("explore", "کاوش کردن", "We explored the old town.", "شهر قدیمی را کاوش کردیم.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect for travel experiences", "Use have/has + past participle. I've been to 20 countries. She's never been abroad."),
            GrammarSection("Ever / never in travel questions", "Have you ever been to...? I've never been to... Have you ever tried...?"),
            GrammarSection("Present perfect vs. simple past for travel", "Use present perfect for experiences. Use simple past with specific time. I've been to Paris. I went to Paris in 2019."),
            GrammarSection("Superlatives for describing places", "the best, the most beautiful, the most interesting. It was the best trip of my life.")
        ),
        listOf(
            d("A", "Hey, Ali! I heard you just got back from a trip.", "هی، علی! شنیدم تازه از سفر برگشتی."),
            d("B", "Yes! I went to Japan for two weeks.", "بله! دو هفته به ژاپن رفتم."),
            d("A", "Wow, Japan! How was it?", "واو، ژاپن! چطور بود؟"),
            d("B", "Incredible. It was the best trip of my life.", "باورنکردنی. بهترین سفر زندگی‌ام بود."),
            d("A", "Where did you go exactly?", "دقیقاً کجا رفتی؟"),
            d("B", "Tokyo, Kyoto, and Osaka. Three very different cities.", "توکیو، کیوتو، و اوزاکا. سه شهر خیلی متفاوت."),
            d("A", "What was your favorite?", "مورد علاقه‌ات کدام بود؟"),
            d("B", "Kyoto, definitely. The old temples were amazing.", "قطعاً کیوتو. معابد قدیمی شگفت‌انگیز بودند."),
            d("A", "Have you ever been to Asia before?", "قبلاً به آسیا رفته بودی؟"),
            d("B", "No, never. It was my first time.", "نه، هرگز. اولین بارم بود."),
            d("A", "Was it difficult to communicate?", "ارتباط سخت بود؟"),
            d("B", "A little. But many people spoke some English.", "کمی. ولی خیلی‌ها کمی انگلیسی صحبت می‌کردند."),
            d("A", "That's helpful. What did you eat?", "کمک‌کننده است. چه خوردی؟"),
            d("B", "Everything! Sushi, ramen, tempura... all delicious.", "همه چیز! سوشی، رامن، تمپورا... همه خوشمزه."),
            d("A", "Did you try anything unusual?", "چیز غیرمعمولی امتحان کردی؟"),
            d("B", "Yes. I tried raw octopus. Not my favorite.", "بله. اختاپوس خام امتحان کردم. مورد علاقه‌ام نبود."),
            d("A", "Ha! I can imagine.", "ها! می‌توانم تصور کنم."),
            d("B", "What about you? Have you traveled much?", "تو چطور؟ زیاد سفر کرده‌ای؟"),
            d("A", "A fair amount. I've been to about 15 countries.", "قابل توجه. حدود ۱۵ کشور بوده‌ام."),
            d("B", "Wow, 15! What's your favorite?", "واو، ۱۵! مورد علاقه‌ات کدام است؟"),
            d("A", "Italy. The food, the history, the people. Everything.", "ایتالیا. غذا، تاریخ، مردم. همه چیز."),
            d("B", "Have you been to Rome?", "به رم رفته‌ای؟"),
            d("A", "Yes. I've been twice. The Colosseum is unforgettable.", "بله. دو بار رفته‌ام. کولوسئوم فراموش‌نشدنی است."),
            d("B", "I've seen photos. It looks amazing.", "عکس‌هایش را دیده‌ام. شگفت‌انگیز به نظر می‌رسد."),
            d("A", "It's even better in person.", "حضوری حتی بهتر است."),
            d("B", "I'll put it on my bucket list.", "به لیست آرزوهایم اضافه می‌کنم."),
            d("A", "What about your bucket list? What's next?", "لیست آرزوهایت چطور؟ بعدی چیست؟"),
            d("B", "I'd love to visit South America. Especially Peru.", "دوست دارم آمریکای جنوبی را ببینم. مخصوصاً پرو."),
            d("A", "Machu Picchu is supposed to be breathtaking.", "ماچو پیچو می‌گویند نفس‌گیر است."),
            d("B", "I've wanted to go there for years.", "سال‌ها می‌خواستم بروم."),
            d("A", "Do you travel alone or with others?", "تنها سفر می‌کنی یا با دیگران؟"),
            d("B", "Usually with friends. Sometimes alone.", "معمولاً با دوستان. گاهی تنها."),
            d("A", "Which do you prefer?", "کدام را ترجیح می‌دهی؟"),
            d("B", "With friends. It's more fun to share the experience.", "با دوستان. تجربه را به اشتراک گذاشتن سرگرم‌کننده‌تر است."),
            d("A", "I agree. Have you ever had any travel problems?", "موافقم. هیچ‌وقت مشکل سفری داشته‌ای؟"),
            d("B", "Yes. My luggage was lost on a trip to Paris.", "بله. در سفری به پاریس چمدانم گم شد."),
            d("A", "Oh no. Did you get it back?", "اوه نه. پسش گرفتی؟"),
            d("B", "Yes, three days later. It was stressful.", "بله، سه روز بعد. استرس‌زا بود."),
            d("A", "I bet. Do you have travel insurance?", "شرط می‌بندم. بیمه سفر داری؟"),
            d("B", "Always. It's essential.", "همیشه. ضروری است."),
            d("A", "Smart. What's the most beautiful place you've visited?", "هوشمندانه. زیباترین جایی که دیده‌ای کجاست؟"),
            d("B", "Probably the mountains in Switzerland. Absolutely stunning.", "احتمالاً کوه‌های سوئیس. کاملاً خیره‌کننده."),
            d("A", "I've heard that. What did you do there?", "شنیده‌ام. آنجا چه کردی؟"),
            d("B", "Hiking, mostly. The views were unbelievable.", "بیشتر کوه‌پیمایی. منظره‌ها باورنکردنی بودند."),
            d("A", "That sounds amazing. Well, I should go. Let's plan a trip together sometime!", "شگفت‌انگیز به نظر می‌رسد. خب، باید بروم. بیایید یک وقت با هم سفر برنامه‌ریزی کنیم!"),
            d("B", "I'd love that. Where should we go?", "دوست دارم. کجا برویم؟"),
            d("A", "Maybe Portugal. I've never been there.", "شاید پرتغال. هرگز آنجا نبوده‌ام."),
            d("B", "Great choice. Let's talk about it soon!", "انتخاب عالی. بیایید به‌زودی درباره‌اش صحبت کنیم!"),
            d("A", "Yes. See you soon!", "بله. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How long was Ali's trip to Japan?", listOf("one week", "two weeks", "one month", "three weeks"), 1),
            q("Which city did Ali like most?", listOf("Tokyo", "Kyoto", "Osaka", "None"), 1),
            q("How many countries has Maria been to?", listOf("10", "15", "20", "25"), 1),
            q("What happened to Ali's luggage in Paris?", listOf("stolen", "damaged", "lost", "opened"), 2),
            q("I ___ been to Japan.", listOf("have", "has", "am", "was"), 0),
            q("She ___ been abroad.", listOf("have", "has never", "is never", "was never"), 1),
            q("Have you ever ___ to Italy?", listOf("go", "went", "been", "going"), 2),
            q("It was ___ best trip of my life.", listOf("a", "the", "an", "some"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Bucket list", "لیست آرزوها", "I'll put it on my bucket list.", "به لیست آرزوهایم اضافه می‌کنم."),
            IdiomExpression("In person", "حضوری", "It's even better in person.", "حضوری حتی بهتر است."),
            IdiomExpression("Breathtaking", "نفس‌گیر", "Machu Picchu is breathtaking.", "ماچو پیچو نفس‌گیر است."),
            IdiomExpression("Absolutely stunning", "کاملاً خیره‌کننده", "Absolutely stunning.", "کاملاً خیره‌کننده.")
        ),
        phrasal = listOf(
            PhrasalVerb("get back", "برگشتن", "return", "I just got back from Japan.", "تازه از ژاپن برگشتم.", "No"),
            PhrasalVerb("set off", "راه افتادن", "start a journey", "We set off early in the morning.", "صبح زود راه افتادیم.", "No"),
            PhrasalVerb("check in", "پذیرش شدن", "register at airport/hotel", "We checked in at the hotel.", "در هتل پذیرش شدیم.", "No"),
            PhrasalVerb("look forward to", "منتظر بودن", "anticipate", "I'm looking forward to the trip.", "منتظر سفر هستم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Travel vocabulary", "DESTInation, SIGHTseeing, LANDmark, SOUvenir."),
            PronunciationTip("Present perfect stress", "I've BEEN to Japan. She's NEVER been abroad."),
            PronunciationTip("Place names", "toKYo, kyOto, oSAka, ROME, ITaly.")
        ),
        culture = listOf(
            CulturalNote("Travel experiences", "Talking about travel is a common conversation topic."),
            CulturalNote("Bucket lists", "A bucket list is a list of things to do before you die."),
            CulturalNote("Travel insurance", "Travel insurance covers medical emergencies, lost luggage, and cancellations.")
        ),
        mistakes = listOf(
            CommonMistake("I have been to Japan last year.", "I went to Japan last year.", "Use simple past with specific time."),
            CommonMistake("Have you ever went to Italy?", "Have you ever been to Italy?", "Use past participle 'been'."),
            CommonMistake("I've never went there.", "I've never been there.", "Use 'been' for experiences."),
            CommonMistake("It was best trip.", "It was the best trip.", "Use 'the' with superlatives.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did Ali do in Japan?", "Visited Tokyo, Kyoto, Osaka; tried Japanese food, temples, sightseeing."),
            ComprehensionQuestion("What's Ali's travel problem?", "Lost luggage in Paris — recovered 3 days later."),
            ComprehensionQuestion("What's on their travel wish list?", "Ali: South America (Peru). Maria: Portugal.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a trip you've taken.", "درباره سفری که رفته‌ای صحبت کن.", "I went to... / I've been to... / It was..."),
            SpeakingTask("Ask about travel experiences.", "درباره تجربیات سفر بپرس.", "Have you ever been to...? / Where did you go? / What did you do?"),
            SpeakingTask("Discuss dream destinations.", "درباره مقاصد رویایی صحبت کن.", "I'd love to visit... / It's on my bucket list. / Someday I'll...")
        ),
        writing = listOf(
            WritingTask("Write about a memorable trip.", "درباره یک سفر به‌یادماندنی بنویس.", 180, "Use present perfect and simple past.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 9 — Technology | تکنولوژی
    // ═══════════════════════════════════════════════════════════════
    private fun unit9() = base(
        9, "Technology", "تکنولوژی",
        listOf(
            "Talk about technology and devices",
            "Use the passive voice",
            "Discuss pros and cons of technology",
            "Express opinions about tech use"
        ),
        listOf(
            v("device", "دستگاه", "My phone is my favorite device.", "گوشی‌ام دستگاه مورد علاقه‌ام است."),
            v("smartphone", "گوشی هوشمند", "Everyone has a smartphone now.", "الان همه گوشی هوشمند دارند."),
            v("app", "اپلیکیشن", "I downloaded a new app.", "اپلیکیشن جدیدی دانلود کردم."),
            v("update", "به‌روزرسانی", "The app needs an update.", "اپلیکیشن به به‌روزرسانی نیاز دارد.", "verb"),
            v("download", "دانلود کردن", "I'll download the file.", "فایل را دانلود می‌کنم.", "verb"),
            v("upload", "آپلود کردن", "Upload your photos.", "عکس‌هایت را آپلود کن.", "verb"),
            v("password", "رمز عبور", "Don't share your password.", "رمزت را به اشتراک نگذار."),
            v("account", "حساب کاربری", "Create an account first.", "اول یک حساب کاربری بساز."),
            v("social media", "شبکه‌های اجتماعی", "Social media can be addictive.", "شبکه‌های اجتماعی می‌توانند اعتیادآور باشند."),
            v("screen time", "زمان صفحه", "I'm trying to reduce my screen time.", "سعی می‌کنم زمان صفحه‌ام را کم کنم."),
            v("artificial intelligence", "هوش مصنوعی", "AI is changing everything.", "هوش مصنوعی همه چیز را تغییر می‌دهد."),
            v("robot", "ربات", "Robots do many jobs now.", "ربات‌ها الان کارهای زیادی انجام می‌دهند."),
            v("convenient", "راحت", "Online banking is convenient.", "بانکداری آنلاین راحت است.", "adjective"),
            v("addictive", "اعتیادآور", "Video games are addictive.", "بازی‌های ویدیویی اعتیادآور هستند.", "adjective"),
            v("privacy", "حریم خصوصی", "Online privacy is a big concern.", "حریم خصوصی آنلاین نگرانی بزرگی است.")
        ),
        listOf(
            GrammarSection("Passive voice: present", "Use am/is/are + past participle. English is spoken here. The app is used by millions."),
            GrammarSection("Passive voice: past", "Use was/were + past participle. The phone was invented in 1973. The data was stolen."),
            GrammarSection("Passive voice with modals", "Use modal + be + past participle. It can be done. It should be fixed."),
            GrammarSection("Active vs. passive", "Active: people use smartphones everywhere. Passive: smartphones are used everywhere.")
        ),
        listOf(
            d("A", "Hey, Ali! Have you heard about the new AI app?", "هی، علی! درباره اپلیکیشن هوش مصنوعی جدید شنیده‌ای؟"),
            d("B", "Yes! I downloaded it yesterday. It's amazing.", "بله! دیروز دانلودش کردم. شگفت‌انگیز است."),
            d("A", "What does it do?", "چه کار می‌کند؟"),
            d("B", "It can write emails, translate languages, even give advice.", "می‌تواند ایمیل بنویسد، ترجمه کند، حتی مشاوره بدهد."),
            d("A", "Really? That sounds almost too powerful.", "واقعاً؟ تقریباً زیادی قدرتمند به نظر می‌رسد."),
            d("B", "I know. Some people are worried about AI.", "می‌دانم. برخی نگران هوش مصنوعی هستند."),
            d("A", "Why?", "چرا؟"),
            d("B", "Because many jobs might be replaced by robots and AI.", "چون ممکن است بسیاری از شغل‌ها توسط ربات‌ها و هوش مصنوعی جایگزین شوند."),
            d("A", "That's a real concern. But new jobs will be created too.", "نگرانی واقعی است. ولی شغل‌های جدید هم ایجاد می‌شوند."),
            d("B", "True. AI is used in medicine, education, transport...", "درست. هوش مصنوعی در پزشکی، آموزش، حمل‌ونقل استفاده می‌شود..."),
            d("A", "How is it used in medicine?", "در پزشکی چطور استفاده می‌شود؟"),
            d("B", "It's used to analyze X-rays and detect diseases early.", "برای تحلیل اشعه ایکس و تشخیص زودهنگام بیماری‌ها استفاده می‌شود."),
            d("A", "That's incredible. It saves lives.", "باورنکردنی است. جان‌ها را نجات می‌دهد."),
            d("B", "Exactly. Technology is neither good nor bad. It depends on how it's used.", "دقیقاً. تکنولوژی نه خوب است نه بد. به نحوه استفاده بستگی دارد."),
            d("A", "I agree. What apps do you use most?", "موافقم. بیشتر از چه اپلیکیشن‌هایی استفاده می‌کنی؟"),
            d("B", "Messaging apps and maps. What about you?", "اپ‌های پیام‌رسان و نقشه. تو چطور؟"),
            d("A", "Social media, unfortunately. I'm addicted.", "متأسفانه شبکه‌های اجتماعی. معتادم."),
            d("B", "Ha! Many people are. How much screen time do you have?", "ها! خیلی‌ها هستند. چقدر زمان صفحه داری؟"),
            d("A", "About five hours a day. Too much.", "حدود پنج ساعت در روز. زیاد."),
            d("B", "That's a lot. Have you tried to reduce it?", "زیاد است. سعی کرده‌ای کمش کنی؟"),
            d("A", "Yes, but it's hard. Apps are designed to be addictive.", "بله، ولی سخت است. اپ‌ها طوری طراحی شده‌اند که اعتیادآور باشند."),
            d("B", "I know. Notifications, likes, endless scrolling...", "می‌دانم. اعلان‌ها، لایک‌ها، اسکرول بی‌پایان..."),
            d("A", "Exactly. They're designed by experts to keep us hooked.", "دقیقاً. توسط متخصصان طراحی شده‌اند تا ما را معتاد نگه دارند."),
            d("B", "That's why some people take digital detoxes.", "برای همین برخی دیجیتال دیتاکس می‌گیرند."),
            d("A", "What's that?", "آن چیست؟"),
            d("B", "A period without phones or social media. Usually a few days.", "دوره‌ای بدون گوشی یا شبکه‌های اجتماعی. معمولاً چند روز."),
            d("A", "Have you ever tried it?", "هیچ‌وقت امتحانش کرده‌ای؟"),
            d("B", "Yes. Last summer, I spent a week without my phone.", "بله. تابستان گذشته، یک هفته بدون گوشی‌ام گذراندم."),
            d("A", "How was it?", "چطور بود؟"),
            d("B", "Difficult at first. But then I felt much calmer.", "اولش سخت. ولی بعد خیلی آرام‌تر حس کردم."),
            d("A", "Really? What did you do instead?", "واقعاً؟ به جایش چه کار کردی؟"),
            d("B", "Read books, went for walks, talked to people face to face.", "کتاب خواندم، پیاده‌روی کردم، رو در رو با مردم صحبت کردم."),
            d("A", "That sounds nice. Maybe I should try it.", "خوب به نظر می‌رسد. شاید باید امتحان کنم."),
            d("B", "You should. It changes your perspective.", "باید بکنی. دیدگاهت را تغییر می‌دهد."),
            d("A", "What about privacy? Do you worry about it?", "حریم خصوصی چطور؟ نگرانش هستی؟"),
            d("B", "Yes, sometimes. Too much personal data is collected.", "بله، گاهی. داده‌های شخصی زیادی جمع‌آوری می‌شود."),
            d("A", "It's used by companies for advertising, right?", "توسط شرکت‌ها برای تبلیغات استفاده می‌شود، درست است؟"),
            d("B", "Yes. Our data is sold to advertisers. It's a huge business.", "بله. داده‌هایمان به تبلیغ‌کنندگان فروخته می‌شود. کسب‌وکار بزرگی است."),
            d("A", "That's scary. How can we protect ourselves?", "ترسناک است. چطور می‌توانیم از خودمان محافظت کنیم؟"),
            d("B", "Strong passwords. Don't share personal info. Read privacy settings.", "رمزهای قوی. اطلاعات شخصی را به اشتراک نگذار. تنظیمات حریم خصوصی را بخوان."),
            d("A", "Good advice. Anything else?", "توصیه خوبی. چیز دیگری؟"),
            d("B", "Use two-factor authentication. It's very important.", "احراز هویت دو مرحله‌ای استفاده کن. خیلی مهم است."),
            d("A", "I'll set that up tonight. Thanks!", "امشب راه‌اندازی‌اش می‌کنم. ممنون!"),
            d("B", "Anytime. Technology should serve us, not control us.", "هر وقت. تکنولوژی باید به ما خدمت کند، نه کنترل کند."),
            d("A", "Well said. See you soon!", "خوب گفتی. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did Ali download yesterday?", listOf("a game", "an AI app", "music", "a movie"), 1),
            q("How is AI used in medicine?", listOf("for surgeries", "to analyze X-rays", "for prescribing", "for making beds"), 1),
            q("How much screen time does Maria have?", listOf("2 hours", "3 hours", "5 hours", "8 hours"), 2),
            q("What is a 'digital detox'?", listOf("a diet", "a period without phones", "a phone upgrade", "a new app"), 1),
            q("English ___ spoken here.", listOf("is", "are", "was", "be"), 0),
            q("The phone ___ invented in 1973.", listOf("is", "was", "are", "were"), 1),
            q("The data ___ stolen last week.", listOf("is", "was", "are", "were"), 1),
            q("It ___ be done easily.", listOf("can", "cans", "canning", "to can"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Keep us hooked", "معتاد نگه داشتن", "They keep us hooked.", "ما را معتاد نگه می‌دارند."),
            IdiomExpression("Digital detox", "دیجیتال دیتاکس", "I did a digital detox.", "دیجیتال دیتاکس گرفتم."),
            IdiomExpression("Face to face", "رو در رو", "We talked face to face.", "رو در رو صحبت کردیم."),
            IdiomExpression("Well said", "خوب گفتی", "Well said.", "خوب گفتی.")
        ),
        phrasal = listOf(
            PhrasalVerb("log in", "وارد شدن", "sign in", "Log in with your password.", "با رمزت وارد شو.", "No"),
            PhrasalVerb("log out", "خارج شدن", "sign out", "Log out when you finish.", "وقتی تمام کردی خارج شو.", "No"),
            PhrasalVerb("sign up", "ثبت‌نام کردن", "register", "Sign up for an account.", "برای یک حساب ثبت‌نام کن.", "No"),
            PhrasalVerb("turn off", "خاموش کردن", "switch off", "Turn off notifications.", "اعلان‌ها را خاموش کن.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Tech vocabulary", "deVICE, SMARTphone, APP, PASSword, PRivacy."),
            PronunciationTip("Passive voice stress", "English is SPOken. The phone was inVENted."),
            PronunciationTip("Tech acronyms", "AI /ˌeɪ ˈaɪ/, app /æp/, WiFi /ˈwaɪfaɪ/.")
        ),
        culture = listOf(
            CulturalNote("Digital wellness", "Digital detoxes and screen-time limits are growing trends."),
            CulturalNote("AI ethics", "Concerns about AI and job displacement are widely discussed."),
            CulturalNote("Online privacy", "Privacy concerns have grown with data collection by tech companies.")
        ),
        mistakes = listOf(
            CommonMistake("English is speak here.", "English is spoken here.", "Use past participle in passive."),
            CommonMistake("The phone was invent in 1973.", "The phone was invented in 1973.", "Use past participle 'invented'."),
            CommonMistake("It can be do.", "It can be done.", "Use past participle after 'be'."),
            CommonMistake("The data were stolen.", "The data was stolen. OR The data were stolen.", "Both are correct; 'data' can be singular or plural.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the concerns about AI?", "Job displacement, but new jobs are also created."),
            ComprehensionQuestion("What is a digital detox?", "A period without phones/social media — Ali did one week last summer."),
            ComprehensionQuestion("What are the advice for online privacy?", "Strong passwords, two-factor authentication, careful with personal info.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about technology in your life.", "درباره تکنولوژی در زندگی‌ات صحبت کن.", "I use... / I've downloaded... / I try to reduce..."),
            SpeakingTask("Discuss pros and cons of technology.", "درباره مزایا و معایب تکنولوژی صحبت کن.", "Technology is used for... / It can be... / It should be..."),
            SpeakingTask("Give advice about online safety.", "توصیه‌هایی درباره امنیت آنلاین بده.", "You should... / Make sure to... / Don't share...")
        ),
        writing = listOf(
            WritingTask("Write about how technology has changed your life.", "درباره اینکه تکنولوژی چطور زندگی‌ات را تغییر داده بنویس.", 180, "Use passive voice.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 10 — School | مدرسه
    // ═══════════════════════════════════════════════════════════════
    private fun unit10() = base(
        10, "School", "مدرسه",
        listOf(
            "Talk about education and school experiences",
            "Use reported speech",
            "Discuss educational systems",
            "Express opinions about learning"
        ),
        listOf(
            v("education", "تحصیلات", "Education is important.", "تحصیلات مهم است."),
            v("school", "مدرسه", "I went to a public school.", "من به مدرسه دولتی رفتم."),
            v("university", "دانشگاه", "She studies at a university.", "او در دانشگاه درس می‌خواند."),
            v("degree", "مدرک", "He has a degree in law.", "او مدرک حقوق دارد."),
            v("subject", "درس", "Math is my favorite subject.", "ریاضی درس مورد علاقه‌ام است."),
            v("exam", "امتحان", "I have an exam tomorrow.", "فردا امتحان دارم."),
            v("grade", "نمره", "She got good grades.", "نمره‌های خوبی گرفت."),
            v("graduate", "فارغ‌التحصیل شدن", "He graduated last year.", "سال گذشته فارغ‌التحصیل شد.", "verb"),
            v("professor", "استاد", "The professor is strict.", "استاد سختگیر است."),
            v("classmate", "هم‌کلاسی", "He was my classmate.", "او هم‌کلاسی من بود."),
            v("homework", "تکلیف", "I have a lot of homework.", "تکلیف زیادی دارم."),
            v("scholarship", "بورس", "She won a scholarship.", "او بورس گرفت."),
            v("semester", "ترم", "Next semester starts in September.", "ترم بعد سپتامبر شروع می‌شود."),
            v("major", "رشته", "Her major is biology.", "رشته‌اش زیست‌شناسی است."),
            v("attend", "حضور یافتن", "I attend classes every day.", "هر روز در کلاس‌ها حضور می‌یابم.", "verb")
        ),
        listOf(
            GrammarSection("Reported speech: statements", "He said (that) he was tired. She told me (that) she liked the class."),
            GrammarSection("Reported speech: tense changes", "Move tense one step back. Present → past. Past → past perfect. will → would, can → could."),
            GrammarSection("Reported speech: questions", "He asked where I lived. She asked if I liked math. Use statement word order."),
            GrammarSection("Say vs. tell", "Say + something. Tell + someone + something. He said he was tired. He told me he was tired.")
        ),
        listOf(
            d("A", "Hey, Ali! I ran into our old classmate Tom yesterday.", "هی، علی! دیروز هم‌کلاسی قدیمی‌مان تام را دیدم."),
            d("B", "Really? How is he? I haven't seen him in years.", "واقعاً؟ چطور است؟ سال‌هاست ندیده‌ام."),
            d("A", "He's good. He said he's working as a teacher now.", "خوب است. گفت الان معلمی می‌کند."),
            d("B", "A teacher! That's interesting. Where does he teach?", "معلم! جالب است. کجا درس می‌دهد؟"),
            d("A", "At a high school. He told me he teaches history.", "در دبیرستان. به من گفت تاریخ درس می‌دهد."),
            d("B", "I remember he loved history. He used to read history books for fun.", "یادم می‌آید عاشق تاریخ بود. برای سرگرمی کتاب تاریخ می‌خواند."),
            d("A", "Exactly. He said he was inspired by our old teacher, Ms. Garcia.", "دقیقاً. گفت معلم قدیمی‌مان خانم گارسیا الهامش کرده."),
            d("B", "Ms. Garcia! She was the best. Do you remember her classes?", "خانم گارسیا! بهترین بود. کلاس‌هایش را یادت می‌آید؟"),
            d("A", "Of course. She made history come alive. It was never boring.", "البته. تاریخ را زنده می‌کرد. هرگز کسل‌کننده نبود."),
            d("B", "I wish all teachers were like her.", "ای کاش همه معلم‌ها مثل او بودند."),
            d("A", "Me too. Did you like school?", "من هم. مدرسه را دوست داشتی؟"),
            d("B", "Mostly. Some subjects were boring, but I had good teachers.", "بیشترش. برخی درس‌ها کسل‌کننده بودند، ولی معلم‌های خوبی داشتم."),
            d("A", "What was your favorite subject?", "درس مورد علاقه‌ات چه بود؟"),
            d("B", "Science. Especially biology. What about you?", "علوم. مخصوصاً زیست. تو چطور؟"),
            d("A", "English. I had a teacher who inspired me too.", "انگلیسی. معلمی داشتم که او هم الهامم کرد."),
            d("B", "Interesting. So Tom became a teacher too.", "جالب است. پس تام هم معلم شد."),
            d("A", "Yes. He told me teaching was challenging but rewarding.", "بله. به من گفت معلمی چالش‌برانگیز ولی ارزشمند است."),
            d("B", "Sounds about right. Did he say anything else?", "منطقی به نظر می‌رسد. چیز دیگری گفت؟"),
            d("A", "He asked me about our other classmates.", "درباره هم‌کلاسی‌های دیگرمان پرسید."),
            d("B", "Really? What did you tell him?", "واقعاً؟ چه گفتی؟"),
            d("A", "I said most of us were doing well. Some had moved abroad.", "گفتم بیشترمان خوبیم. برخی به خارج مهاجرت کرده‌اند."),
            d("B", "Did he ask about anyone specific?", "درباره کسی خاص پرسید؟"),
            d("A", "Yes, he asked about Sarah. He wanted to know if she became a doctor.", "بله، درباره سارا پرسید. می‌خواست بداند آیا پزشک شد."),
            d("B", "And did she?", "و شد؟"),
            d("A", "Yes, she did. She's working at a hospital in Boston.", "بله، شد. در بیمارستانی در بوستون کار می‌کند."),
            d("B", "Wow, that's great. What did he say about the old school?", "واو، عالیه. درباره مدرسه قدیمی چه گفت؟"),
            d("A", "He said he had visited it last year. It was renovated.", "گفت سال گذشته بازدیدش کرده. بازسازی شده بود."),
            d("B", "Really? Did they change a lot?", "واقعاً؟ خیلی تغییر کرده؟"),
            d("A", "Apparently. He said they added a new library and science lab.", "ظاهراً. گفت کتابخانه و آزمایشگاه علوم جدید اضافه کرده‌اند."),
            d("B", "That's good news. Schools need better facilities.", "خبر خوبی است. مدارس به امکانات بهتر نیاز دارند."),
            d("A", "I agree. Education is an investment in the future.", "موافقم. تحصیلات سرمایه‌گذاری در آینده است."),
            d("B", "Well said. Did he mention if there was a reunion?", "خوب گفتی. اشاره کرد که دورهمی هست؟"),
            d("A", "Yes! He said there's a reunion next summer.", "بله! گفت تابستان بعد دورهمی هست."),
            d("B", "Perfect. I'll definitely go.", "عالی. قطعاً می‌روم."),
            d("A", "Me too. It'll be nice to see everyone.", "من هم. دیدن همه خوب می‌شود."),
            d("B", "Definitely. Are you still in touch with our old teachers?", "قطعاً. هنوز با معلم‌های قدیمی‌مان در تماسی؟"),
            d("A", "A few. Ms. Garcia, actually. She's retired now.", "چند نفر. در واقع خانم گارسیا. الان بازنشسته است."),
            d("B", "Oh, that's nice. How is she?", "اوه، خوبه. چطور است؟"),
            d("A", "She's fine. She said she missed teaching.", "خوب است. گفت دلتنگ تدریس شده."),
            d("B", "I can imagine. She was so passionate.", "می‌توانم تصور کنم. خیلی پرشور بود."),
            d("A", "Yes. She influenced many students.", "بله. به دانش‌آموزان زیادی تأثیر گذاشت."),
            d("B", "Good teachers leave a mark. Well, I should go.", "معلم‌های خوب اثر می‌گذارند. خب، باید بروم."),
            d("A", "Okay. Let's plan to go to the reunion together!", "باشه. بیایید برنامه‌ریزی کنیم با هم به دورهمی برویم!"),
            d("B", "Deal! See you soon.", "قبول! به‌زودی می‌بینمت."),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What does Tom do now?", listOf("doctor", "teacher", "engineer", "lawyer"), 1),
            q("What subject does Tom teach?", listOf("English", "Science", "History", "Math"), 2),
            q("Who inspired Tom?", listOf("Ms. Garcia", "his mother", "his principal", "his friend"), 0),
            q("Where does Sarah work?", listOf("Chicago", "Boston", "New York", "London"), 1),
            q("He said he ___ tired.", listOf("is", "was", "be", "being"), 1),
            q("She told me she ___ history.", listOf("loves", "loved", "love", "loving"), 1),
            q("He asked where I ___.", listOf("live", "lived", "do live", "living"), 1),
            q("She said she ___ come tomorrow.", listOf("will", "would", "was", "is"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Come alive", "زنده شدن", "She made history come alive.", "تاریخ را زنده می‌کرد."),
            IdiomExpression("Leave a mark", "اثر گذاشتن", "Good teachers leave a mark.", "معلم‌های خوب اثر می‌گذارند."),
            IdiomExpression("Run into", "به کسی برخوردن", "I ran into Tom yesterday.", "دیروز تام را دیدم."),
            IdiomExpression("In touch", "در تماس", "Are you still in touch?", "هنوز در تماسی؟")
        ),
        phrasal = listOf(
            PhrasalVerb("run into", "به کسی برخوردن", "meet by chance", "I ran into Tom yesterday.", "دیروز تام را دیدم.", "No"),
            PhrasalVerb("drop out", "ترک تحصیل کردن", "quit school", "He dropped out of college.", "از دانشگاه انصراف داد.", "Yes"),
            PhrasalVerb("sign up for", "ثبت‌نام کردن", "register for", "I signed up for a class.", "در یک کلاس ثبت‌نام کردم.", "No"),
            PhrasalVerb("catch up", "به‌روز شدن", "get up to date", "Let's catch up soon.", "بیایید به‌زودی به‌روز شویم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Education vocabulary", "eduCAtion, uniVERsity, PROfessor, SCHOarship."),
            PronunciationTip("Reported speech stress", "He SAID he was TIRED."),
            PronunciationTip("Tense shifts", "am → was, will → would, can → could, like → liked.")
        ),
        culture = listOf(
            CulturalNote("Education systems", "Education systems vary by country — public, private, and different structures."),
            CulturalNote("School reunions", "Class reunions are common in many cultures to reconnect."),
            CulturalNote("Inspiring teachers", "Good teachers often leave a lasting impact on their students.")
        ),
        mistakes = listOf(
            CommonMistake("He said me he was tired.", "He told me he was tired.", "Use 'tell' with an object."),
            CommonMistake("She said she will come.", "She said she would come.", "Shift 'will' to 'would' in reported speech."),
            CommonMistake("He asked where did I live.", "He asked where I lived.", "Use statement word order in reported questions."),
            CommonMistake("He said he is happy.", "He said he was happy.", "Shift present to past in reported speech.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did Tom become?", "A history teacher at a high school."),
            ComprehensionQuestion("Who inspired him?", "Ms. Garcia, their old history teacher."),
            ComprehensionQuestion("What's planned for next summer?", "A school reunion — both friends will attend.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your school experiences.", "درباره تجربیات مدرسه‌ات صحبت کن.", "I went to... / I liked... / My favorite subject was..."),
            SpeakingTask("Report a conversation.", "یک مکالمه را گزارش کن.", "He said... / She told me... / He asked..."),
            SpeakingTask("Talk about an inspiring teacher.", "درباره یک معلم الهام‌بخش صحبت کن.", "He/She made... / I learned... / He/She inspired me...")
        ),
        writing = listOf(
            WritingTask("Write about your school years and an inspiring teacher.", "درباره سال‌های مدرسه‌ات و یک معلم الهام‌بخش بنویس.", 180, "Use reported speech.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 11 — The environment | محیط زیست
    // ═══════════════════════════════════════════════════════════════
    private fun unit11() = base(
        11, "The environment", "محیط زیست",
        listOf(
            "Talk about environmental issues",
            "Use first and second conditionals",
            "Discuss solutions to environmental problems",
            "Express concern and hope"
        ),
        listOf(
            v("environment", "محیط زیست", "We must protect the environment.", "باید از محیط زیست محافظت کنیم."),
            v("pollution", "آلودگی", "Air pollution is a serious problem.", "آلودگی هوا مشکل جدی است."),
            v("climate change", "تغییرات اقلیمی", "Climate change affects everyone.", "تغییرات اقلیمی بر همه تأثیر می‌گذارد."),
            v("recycle", "بازیافت کردن", "We recycle paper and plastic.", "کاغذ و پلاستیک را بازیافت می‌کنیم.", "verb"),
            v("reuse", "استفاده مجدد", "Reuse your bags.", "کیسه‌هایت را دوباره استفاده کن.", "verb"),
            v("reduce", "کاهش دادن", "We must reduce waste.", "باید زباله را کاهش دهیم.", "verb"),
            v("waste", "زباله", "Reduce food waste.", "زباله غذایی را کاهش ده."),
            v("global warming", "گرمایش زمین", "Global warming is a big problem.", "گرمایش زمین مشکل بزرگی است."),
            v("renewable", "تجدیدپذیر", "Solar is renewable energy.", "خورشیدی انرژی تجدیدپذیر است.", "adjective"),
            v("fossil fuel", "سوخت فسیلی", "Fossil fuels harm the planet.", "سوخت‌های فسیلی به سیاره آسیب می‌زنند."),
            v("carbon footprint", "رد پای کربن", "Reduce your carbon footprint.", "رد پای کربنت را کاهش ده."),
            v("plastic", "پلاستیک", "Too much plastic ends up in oceans.", "پلاستیک زیادی در اقیانوس‌ها می‌ماند.", "adjective"),
            v("endangered", "در خطر انقراض", "Many species are endangered.", "گونه‌های زیادی در خطرند.", "adjective"),
            v("sustainable", "پایدار", "Sustainable living is essential.", "زندگی پایدار ضروری است.", "adjective"),
            v("protect", "محافظت کردن", "We must protect wildlife.", "باید از حیات وحش محافظت کنیم.", "verb")
        ),
        listOf(
            GrammarSection("First conditional", "If + present simple, will + base verb. If we recycle, we will save energy. Real possibilities."),
            GrammarSection("Second conditional", "If + past simple, would + base verb. If I had a car, I would drive less. Hypothetical situations."),
            GrammarSection("First vs. second conditional", "First: real and possible. Second: imaginary or unlikely. If it rains, I'll stay home. If I were rich, I would travel."),
            GrammarSection("Environment collocations", "reduce waste, save energy, protect the environment, cut down on plastic.")
        ),
        listOf(
            d("A", "Hey, Maria! Did you see the news about climate change?", "هی، ماریا! خبر تغییرات اقلیمی را دیدی؟"),
            d("B", "Yes. It's really worrying. Temperatures are rising fast.", "بله. واقعاً نگران‌کننده است. دما سریع بالا می‌رود."),
            d("A", "I know. Scientists say we have less than 10 years to act.", "می‌دانم. دانشمندان می‌گویند کمتر از ۱۰ سال برای اقدام داریم."),
            d("B", "That's terrifying. What can we do about it?", "ترسناک است. چه کار می‌توانیم بکنیم؟"),
            d("A", "Lots of things. If we all reduce waste, it will help.", "کارهای زیادی. اگر همه زباله را کم کنیم، کمک می‌کند."),
            d("B", "What changes have you made?", "چه تغییراتی داده‌ای؟"),
            d("A", "I recycle everything. And I take my own bags to the store.", "همه چیز را بازیافت می‌کنم. و کیسه‌های خودم را به مغازه می‌برم."),
            d("B", "That's good. Have you stopped using plastic bottles?", "خوبه. استفاده از بطری‌های پلاستیکی را متوقف کرده‌ای؟"),
            d("A", "Yes. I use a reusable bottle now.", "بله. الان از بطری قابل استفاده مجدد استفاده می‌کنم."),
            d("B", "Nice. I still use some plastic. I should change.", "خوبه. من هنوز کمی پلاستیک استفاده می‌کنم. باید تغییر دهم."),
            d("A", "Small changes add up. Every little bit helps.", "تغییرات کوچک جمع می‌شوند. هر ذره کمک می‌کند."),
            d("B", "What about transportation?", "حمل‌ونقل چطور؟"),
            d("A", "I cycle to work when the weather is good.", "وقتی هوا خوب است با دوچرخه به کار می‌روم."),
            d("B", "That's great. I usually drive. It's hard to change.", "عالی است. من معمولاً رانندگی می‌کنم. تغییر سخت است."),
            d("A", "If I were you, I would take the bus sometimes.", "اگر جای تو بودم، گاهی اتوبوس می‌گرفتم."),
            d("B", "You're right. If more people used public transport, pollution would be lower.", "حق داری. اگر مردم بیشتری از حمل‌ونقل عمومی استفاده می‌کردند، آلودگی کمتر می‌شد."),
            d("A", "Exactly. Do you eat a lot of meat?", "دقیقاً. گوشت زیاد می‌خوری؟"),
            d("B", "Yes. Is that a problem for the environment?", "بله. آیا برای محیط زیست مشکل است؟"),
            d("A", "It is. Meat production uses a lot of water and land.", "هست. تولید گوشت آب و زمین زیادی مصرف می‌کند."),
            d("B", "I didn't know that. Maybe I'll eat less meat.", "نمی‌دانستم. شاید کمتر گوشت بخورم."),
            d("A", "If everyone ate less meat, it would make a big difference.", "اگر همه کمتر گوشت می‌خوردند، تفاوت بزرگی ایجاد می‌شد."),
            d("B", "What about renewable energy?", "انرژی تجدیدپذیر چطور؟"),
            d("A", "It's growing fast. Solar and wind power are the future.", "سریع رشد می‌کند. انرژی خورشیدی و بادی آینده است."),
            d("B", "Do you have solar panels?", "پنل خورشیدی داری؟"),
            d("A", "Not yet. But I'm saving up to install some.", "هنوز نه. ولی دارم پس‌انداز می‌کنم برای نصب."),
            d("B", "That's a great investment.", "سرمایه‌گذاری عالی‌ای است."),
            d("A", "It is. It saves money and helps the planet.", "هست. پول ذخیره می‌کند و به سیاره کمک می‌کند."),
            d("B", "What about endangered animals?", "حیوانات در خطر انقراض چطور؟"),
            d("A", "That's another concern. Many species are disappearing.", "نگرانی دیگری است. گونه‌های زیادی در حال ناپدید شدن‌اند."),
            d("B", "What can we do?", "چه کار می‌توانیم بکنیم؟"),
            d("A", "Support conservation organizations. And protect natural habitats.", "از سازمان‌های حفاظت حمایت کن. و از زیستگاه‌های طبیعی محافظت کن."),
            d("B", "Do you donate to any organization?", "به سازمانی کمک مالی می‌کنی؟"),
            d("A", "Yes, to a wildlife fund. Small monthly donations.", "بله، به یک صندوق حیات وحش. کمک‌های ماهانه کوچک."),
            d("B", "That's nice. Every contribution matters.", "خوبه. هر مشارکتی مهم است."),
            d("A", "Exactly. What about you?", "دقیقاً. تو چطور؟"),
            d("B", "I don't donate, but I volunteer at a community garden.", "کمک مالی نمی‌کنم، ولی در یک باغ اجتماعی داوطلبم."),
            d("A", "That's amazing! You grow your own vegetables?", "شگفت‌انگیز است! سبزیجات خودت را می‌کاری؟"),
            d("B", "Yes. Tomatoes, lettuce, herbs. Organic and fresh.", "بله. گوجه، کاهو، سبزیجات. ارگانیک و تازه."),
            d("A", "That's very sustainable. I should join.", "خیلی پایدار است. باید ملحق شوم."),
            d("B", "You should! It's relaxing and rewarding.", "باید بکنی! آرام‌بخش و ارزشمند است."),
            d("A", "Where is the garden?", "باغ کجاست؟"),
            d("B", "Near the park. They meet every Saturday morning.", "نزدیک پارک. هر شنبه صبح دور هم جمع می‌شوند."),
            d("A", "Perfect. I'll come next Saturday.", "عالی. شنبه بعد می‌آیم."),
            d("B", "Great. Well, I should go. See you Saturday!", "عالی. خب، باید بروم. شنبه می‌بینمت!"),
            d("A", "See you! And let's hope more people start caring about the planet.", "می‌بینمت! و امیدوارم افراد بیشتری به سیاره اهمیت دهند."),
            d("B", "I hope so. Bye!", "امیدوارم. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What's the biggest concern according to the news?", listOf("sports", "climate change", "economy", "education"), 1),
            q("What does Maria do for the environment?", listOf("nothing", "recycles and uses own bags", "donates money", "volunteers"), 1),
            q("What does Maria suggest about meat?", listOf("eat more", "eat less", "only chicken", "no meat"), 1),
            q("Where does Ali volunteer?", listOf("an animal shelter", "a community garden", "a recycling center", "a library"), 1),
            q("If we recycle, we ___ save energy.", listOf("will", "would", "did", "are"), 0),
            q("If I were you, I ___ take the bus.", listOf("will", "would", "did", "am"), 1),
            q("If everyone ate less meat, it ___ a big difference.", listOf("will make", "would make", "made", "makes"), 1),
            q("If it rains, I ___ stay home.", listOf("will", "would", "did", "am"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Add up", "جمع شدن", "Small changes add up.", "تغییرات کوچک جمع می‌شوند."),
            IdiomExpression("Every little bit helps", "هر ذره کمک می‌کند", "Every little bit helps.", "هر ذره کمک می‌کند."),
            IdiomExpression("Make a difference", "تفاوت ایجاد کردن", "It would make a big difference.", "تفاوت بزرگی ایجاد می‌کرد."),
            IdiomExpression("Caring about", "اهمیت دادن به", "Caring about the planet.", "اهمیت دادن به سیاره.")
        ),
        phrasal = listOf(
            PhrasalVerb("cut down on", "کم کردن", "reduce", "We should cut down on plastic.", "باید پلاستیک را کم کنیم.", "No"),
            PhrasalVerb("throw away", "دور انداختن", "discard", "Don't throw away food.", "غذا را دور نریز.", "Yes"),
            PhrasalVerb("give off", "منتشر کردن", "emit", "Cars give off CO2.", "ماشین‌ها CO2 منتشر می‌کنند.", "No"),
            PhrasalVerb("use up", "تمام کردن", "consume all", "We've used up all the resources.", "همه منابع را استفاده کرده‌ایم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Environment vocabulary", "enVIronment, POLLution, REnewable, susTAINable."),
            PronunciationTip("Conditional stress", "If we REcycle, we'll SAVE energy."),
            PronunciationTip("Second conditional", "If I WERE you, I would TAKE the bus.")
        ),
        culture = listOf(
            CulturalNote("Environmental activism", "Environmental activism is growing globally, especially among young people."),
            CulturalNote("Sustainable living", "Sustainable living includes reducing waste, eating less meat, and using renewable energy."),
            CulturalNote("Community gardens", "Community gardens are popular for growing food and building community.")
        ),
        mistakes = listOf(
            CommonMistake("If we will recycle, we'll save energy.", "If we recycle, we'll save energy.", "Use present simple after 'if' in first conditional."),
            CommonMistake("If I would be you, I would...", "If I were you, I would...", "Use 'were' in second conditional."),
            CommonMistake("If everyone ate less meat, it will help.", "If everyone ate less meat, it would help.", "Use 'would' with second conditional."),
            CommonMistake("I suggest you to recycle.", "I suggest recycling. OR I suggest that you recycle.", "Use gerund or 'that + subject'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What changes has Maria made?", "Recycles, uses own bags, reusable bottle, cycles to work."),
            ComprehensionQuestion("What's Ali's hobby related to the environment?", "Volunteers at a community garden — grows vegetables."),
            ComprehensionQuestion("What's the shared hope?", "More people will start caring about the planet.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about environmental problems.", "درباره مشکلات زیست‌محیطی صحبت کن.", "Pollution is... / Climate change affects... / We must..."),
            SpeakingTask("Give advice about helping the environment.", "توصیه‌هایی برای کمک به محیط زیست بده.", "If you... / You should... / Try to..."),
            SpeakingTask("Discuss sustainable living.", "درباره زندگی پایدار صحبت کن.", "I recycle... / I try to... / Small changes...")
        ),
        writing = listOf(
            WritingTask("Write about what you do to help the environment.", "درباره کارهایی که برای کمک به محیط زیست انجام می‌دهی بنویس.", 180, "Use first and second conditionals.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 12 — Plans and dreams | برنامه‌ها و رویاها
    // ═══════════════════════════════════════════════════════════════
    private fun unit12() = base(
        12, "Plans and dreams", "برنامه‌ها و رویاها",
        listOf(
            "Talk about future plans and dreams",
            "Use 'will' and 'going to' for future",
            "Use 'hope' and 'wish'",
            "Express hopes and ambitions"
        ),
        listOf(
            v("plan", "برنامه", "What are your plans?", "برنامه‌هایت چیست؟"),
            v("goal", "هدف", "My goal is to learn English.", "هدفم یادگیری انگلیسی است."),
            v("dream", "رویا", "It's my dream to travel.", "سفر رویای من است."),
            v("future", "آینده", "In the future, I want...", "در آینده، می‌خواهم..."),
            v("ambition", "جاه‌طلبی", "Her ambition is inspiring.", "جاه‌طلبی‌اش الهام‌بخش است."),
            v("achieve", "دست یافتن", "He achieved his goal.", "او به هدفش دست یافت.", "verb"),
            v("succeed", "موفق شدن", "She will succeed.", "او موفق می‌شود.", "verb"),
            v("hope", "امیدوار بودن", "I hope to travel.", "امیدوارم سفر کنم.", "verb"),
            v("wish", "آرزو کردن", "I wish I could fly.", "آرزو می‌کنم می‌توانستم پرواز کنم.", "verb"),
            v("someday", "روزی", "Someday I'll live abroad.", "روزی در خارج زندگی می‌کنم.", "adverb"),
            v("eventually", "در نهایت", "I'll eventually get there.", "در نهایت می‌رسم.", "adverb"),
            v("look forward to", "منتظر بودن", "I'm looking forward to it.", "منتظرش هستم.", "verb"),
            v("hopeful", "امیدوار", "I'm hopeful about the future.", "درباره آینده امیدوارم.", "adjective"),
            v("determined", "مصمم", "She's determined to succeed.", "او مصمم به موفقیت است.", "adjective"),
            v("motivated", "باانگیزه", "I feel motivated now.", "الان باانگیزه حس می‌کنم.", "adjective")
        ),
        listOf(
            GrammarSection("Will vs. going to for future", "Use 'will' for decisions/predictions. Use 'going to' for plans. I'll help you. I'm going to study medicine."),
            GrammarSection("Hope + to / that", "I hope to travel. I hope that she comes. Expressing wishes."),
            GrammarSection("Wish + past simple", "Use 'wish + past' for present regret. I wish I had more time. I wish I could speak French."),
            GrammarSection("Future time expressions", "someday, eventually, in the future, next year, one day.")
        ),
        listOf(
            d("A", "Hey, Maria! Let's talk about the future. What are your plans?", "هی، ماریا! بیایید درباره آینده صحبت کنیم. برنامه‌هایت چیست؟"),
            d("B", "Big question! Well, I'm going to finish my nursing degree next year.", "سؤال بزرگی! خب، قرار است سال بعد مدرک پرستاری‌ام را تمام کنم."),
            d("A", "Nice! And after that?", "خوبه! و بعد از آن؟"),
            d("B", "I'd like to work abroad for a few years. Maybe in Europe.", "دوست دارم چند سال در خارج کار کنم. شاید در اروپا."),
            d("A", "That's exciting. Which country?", "هیجان‌انگیز است. کدام کشور؟"),
            d("B", "Spain, probably. I've always wanted to live there.", "احتمالاً اسپانیا. همیشه می‌خواستم آنجا زندگی کنم."),
            d("A", "You speak some Spanish, right?", "کمی اسپانیایی صحبت می‌کنی، درست است؟"),
            d("B", "Yes, a little. If I move there, I'll learn much more.", "بله، کمی. اگر به آنجا نقل مکان کنم، خیلی بیشتر یاد می‌گیرم."),
            d("A", "Good plan. What about your career long-term?", "برنامه خوبی. حرفه‌ات در بلندمدت چطور؟"),
            d("B", "I want to become a head nurse eventually.", "می‌خواهم در نهایت سرپرستار شوم."),
            d("A", "That's ambitious. Any other dreams?", "جاه‌طلبانه است. رویای دیگری داری؟"),
            d("B", "Yes. I hope to have a family someday. Maybe two kids.", "بله. امیدوارم روزی خانواده داشته باشم. شاید دو بچه."),
            d("A", "That's beautiful. What about you? What are your plans?", "زیباست. تو چطور؟ برنامه‌هایت چیست؟"),
            d("B", "Well, I'm going to open a small business next year.", "خب، قرار است سال بعد کسب‌وکار کوچکی راه بیندازم."),
            d("A", "Really? What kind?", "واقعاً؟ چه نوعی؟"),
            d("B", "A coffee shop. It's been my dream for years.", "یک کافه. سال‌ها رویای من بوده."),
            d("A", "Amazing! Where will you open it?", "شگفت‌انگیز! کجا بازش می‌کنی؟"),
            d("B", "Downtown, near the university. Lots of students there.", "مرکز شهر، نزدیک دانشگاه. دانشجوهای زیادی آنجا هستند."),
            d("A", "Good location. Do you have experience?", "موقعیت خوب. تجربه داری؟"),
            d("B", "Some. I've worked in cafés for three years.", "کمی. سه سال در کافه‌ها کار کرده‌ام."),
            d("A", "That will help. Do you need investors?", "کمک می‌کند. سرمایه‌گذار نیاز داری؟"),
            d("B", "Not really. I've saved enough money.", "نه واقعاً. پول کافی پس‌انداز کرده‌ام."),
            d("A", "Impressive! You're very determined.", "تحسین‌برانگیز! خیلی مصممی."),
            d("B", "Thanks. It took years of saving.", "ممنون. سال‌ها پس‌انداز طول کشید."),
            d("A", "What's the hardest part going to be?", "سخت‌ترین بخشش چه خواهد بود؟"),
            d("B", "Probably finding good staff. And managing finances.", "احتمالاً پیدا کردن کارکنان خوب. و مدیریت مالی."),
            d("A", "Do you have a business plan?", "طرح کسب‌وکار داری؟"),
            d("B", "Yes. I've been working on it for months.", "بله. ماه‌هاست رویش کار می‌کنم."),
            d("A", "You're really prepared. Good for you.", "واقعاً آماده‌ای. آفرین."),
            d("B", "Thank you. What about your dreams?", "ممنون. رویاهای تو چیست؟"),
            d("A", "I hope to travel more. See the world.", "امیدوارم بیشتر سفر کنم. دنیا را ببینم."),
            d("B", "Any specific places?", "مکان خاصی؟"),
            d("A", "Japan, New Zealand, and Iceland are on my list.", "ژاپن، نیوزیلند، و ایسلند در لیستم هستند."),
            d("B", "Those are all beautiful destinations.", "همه مقاصد زیبایی هستند."),
            d("A", "I know. I wish I had more time and money.", "می‌دانم. ای کاش زمان و پول بیشتری داشتم."),
            d("B", "Someday you will. Keep working toward it.", "روزی خواهی داشت. به تلاش ادامه بده."),
            d("A", "Thanks. I'm saving up now.", "ممنون. الان دارم پس‌انداز می‌کنم."),
            d("B", "That's the way. Dreams take work.", "همینه. رویاها کار می‌خواهند."),
            d("A", "Exactly. What about after the coffee shop?", "دقیقاً. بعد از کافه چطور؟"),
            d("B", "I might open a second one. Or a small bakery.", "شاید دومی باز کنم. یا یک نانوایی کوچک."),
            d("A", "Ambitious! You'll be a businesswoman.", "جاه‌طلبانه! تاجر زنی می‌شوی."),
            d("B", "Ha! Maybe. One step at a time.", "ها! شاید. قدم به قدم."),
            d("A", "That's the right approach. Well, I'm excited for you!", "رویکرد درستی است. خب، برایت هیجان‌زده‌ام!"),
            d("B", "Thanks. I'm a bit nervous but hopeful.", "ممنون. کمی مضطربم ولی امیدوار."),
            d("A", "You'll do great. You always succeed at what you set your mind to.", "عالی می‌شوی. همیشه در آنچه تصمیم می‌گیری موفق می‌شوی."),
            d("B", "Thank you. That means a lot. What's your next step?", "ممنون. این خیلی معنی دارد. قدم بعدی‌ات چیست؟"),
            d("A", "I'm going to plan a trip for next year. Maybe Japan.", "قرار است سال بعد سفری برنامه‌ریزی کنم. شاید ژاپن."),
            d("B", "Wonderful. Send me photos when you go!", "شگفت‌انگیز. وقتی رفتی عکس بفرست!"),
            d("A", "I will! Well, let's both make our dreams come true.", "می‌فرستم! خب، بیایید هر دو رویاهایمان را محقق کنیم."),
            d("B", "Deal. See you soon!", "قبول. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is Maria going to do next year?", listOf("finish degree", "start a business", "move to Spain", "travel"), 0),
            q("Where does Ali want to open his café?", listOf("downtown", "near the university", "in his neighborhood", "abroad"), 1),
            q("How long has Ali worked in cafés?", listOf("1 year", "2 years", "3 years", "5 years"), 2),
            q("What's Maria's long-term career goal?", listOf("open a café", "become head nurse", "teach", "work in Spain"), 1),
            q("I ___ study medicine next year.", listOf("am going to", "will", "going", "did"), 0),
            q("I ___ help you with that.", listOf("will", "going to", "am", "was"), 0),
            q("I hope ___ travel someday.", listOf("travel", "to travel", "traveling", "traveled"), 1),
            q("I wish I ___ more time.", listOf("have", "had", "will have", "having"), 1)
        ),
        idioms = listOf(
            IdiomExpression("One step at a time", "قدم به قدم", "One step at a time.", "قدم به قدم."),
            IdiomExpression("Keep working toward", "به تلاش ادامه بده", "Keep working toward it.", "به تلاش ادامه بده."),
            IdiomExpression("Set your mind to", "تصمیم گرفتن", "You always succeed at what you set your mind to.", "همیشه در آنچه تصمیم می‌گیری موفق می‌شوی."),
            IdiomExpression("Make dreams come true", "رویاها را محقق کردن", "Let's both make our dreams come true.", "بیایید هر دو رویاهایمان را محقق کنیم.")
        ),
        phrasal = listOf(
            PhrasalVerb("save up", "پس‌انداز کردن", "accumulate money", "I'm saving up for a trip.", "برای سفر پس‌انداز می‌کنم.", "No"),
            PhrasalVerb("look forward to", "منتظر بودن", "anticipate", "I'm looking forward to the future.", "منتظر آینده هستم.", "No"),
            PhrasalVerb("work toward", "کار کردن برای رسیدن به", "strive for", "Keep working toward your dream.", "به تلاش برای رویایت ادامه بده.", "No"),
            PhrasalVerb("set up", "راه‌اندازی کردن", "establish", "I want to set up my own business.", "می‌خواهم کسب‌وکار خودم را راه‌اندازی کنم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Future stress", "I'm GOing to TRAvel. I WILL help you."),
            PronunciationTip("'Wish' stress", "I WISH I had more time."),
            PronunciationTip("'Going to' reduction", "gonna /ˈɡənə/. I'm gonna study.")
        ),
        culture = listOf(
            CulturalNote("Career plans", "Career planning varies across cultures. Some prioritize stability, others passion."),
            CulturalNote("Entrepreneurship", "Starting a small business is a common dream in many countries."),
            CulturalNote("Life goals", "Setting life goals — family, career, travel — helps people stay motivated.")
        ),
        mistakes = listOf(
            CommonMistake("I going to study.", "I'm going to study.", "Use 'am/is/are' + going to."),
            CommonMistake("I hope traveling.", "I hope to travel.", "Use 'to + base verb' after 'hope'."),
            CommonMistake("I wish I have more time.", "I wish I had more time.", "Use past simple after 'wish'."),
            CommonMistake("I will to travel.", "I will travel.", "After 'will', use base verb without 'to'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Maria's plans?", "Finish nursing degree, work abroad (maybe Spain), become head nurse, have family."),
            ComprehensionQuestion("What are Ali's dreams?", "Open a coffee shop downtown, maybe expand or open a bakery."),
            ComprehensionQuestion("What are their attitudes toward the future?", "Both are hopeful but realistic — dreams take work, one step at a time.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your future plans.", "درباره برنامه‌های آینده‌ات صحبت کن.", "I'm going to... / I'll probably... / I hope to..."),
            SpeakingTask("Discuss your dreams.", "درباره رویاهایت صحبت کن.", "Someday I'd like to... / My dream is... / I wish I could..."),
            SpeakingTask("Give advice about achieving dreams.", "توصیه‌هایی درباره دستیابی به رویاها بده.", "You should... / Keep working toward... / One step at a time.")
        ),
        writing = listOf(
            WritingTask("Write about your plans and dreams for the future.", "درباره برنامه‌ها و رویاهایت برای آینده بنویس.", 180, "Use will, going to, hope, and wish.")
        )
    )
}