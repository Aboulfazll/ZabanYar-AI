package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 4th Edition — Level 4
 * 10 Files × 3 Lessons (A/B/C) + 5 PE + 5 R&C = 40 Lessons | B2 Upper-Intermediate
 * مکالمه: ۱۶-۱۸ خط
 */
object AmericanEnglishFile4thLevel4 {
    const val BOOK_ID = "american_english_file_4th_level4"

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

    // ═══════════ FILE 1 — Communication and personality ═══════════

    private fun f1A() = base(1, "1A The art of conversation", "۱A هنر گفتگو",
        listOf(
            "Use question forms with prepositions",
            "Master polite interruption strategies",
            "Develop conversational fluency"
        ),
        listOf(
            v("articulate", "شیوا", "She's incredibly articulate.", "او فوق‌العاده شیواست.", "adjective"),
            v("eloquent", "فصیح", "An eloquent speaker.", "سخنران فصیح.", "adjective"),
            v("rapport", "ارتباط", "Build rapport quickly.", "سریع ارتباط برقرار کن."),
            v("small talk", "گفتگوی سطحی", "Master small talk.", "گفتگوی سطحی را مسلط شو."),
            v("interrupt", "وقفه انداختن", "Interrupt politely.", "مؤدبانه وقفه بینداز.", "verb"),
            v("engaging", "جذاب", "An engaging conversation.", "گفتگوی جذاب.", "adjective"),
            v("monologue", "تک‌گویی", "Avoid monologues.", "از تک‌گویی پرهیز کن."),
            v("empathize", "همدلی کردن", "Empathize with others.", "با دیگران همدلی کن.", "verb"),
            v("attentive", "توجه‌کننده", "An attentive listener.", "شنونده توجه‌کننده.", "adjective"),
            v("come across", "به نظر رسیدن", "Come across as friendly.", "دوستانه به نظر برس.", "verb")
        ),
        listOf(
            GrammarSection("Questions with prepositions", "Who are you waiting for? What are you thinking about? Where are you from?"),
            GrammarSection("Indirect questions", "Could you tell me what you mean? Do you know where he's gone?"),
            GrammarSection("Polite interruption", "Sorry to interrupt, but... If I could just say... May I add something?")
        ),
        listOf(
            d("A", "I've always admired people who are naturally good at conversation.", "همیشه افرادی را تحسین کرده‌ام که به طور طبیعی در گفتگو خوب هستند."),
            d("B", "What do you think makes someone a great conversationalist?", "فکر می‌کنی چه چیزی کسی را گفتگوگر عالی می‌کند؟"),
            d("A", "Honestly? I think it's the ability to listen, not just talk.", "راستش؟ فکر می‌کنم توانایی گوش دادن است، نه فقط حرف زدن."),
            d("B", "I couldn't agree more. The best speakers I know are also the best listeners.", "کاملاً موافقم. بهترین سخنرانانی که می‌شناسم، بهترین شنوندگان هم هستند."),
            d("A", "Exactly. They ask questions that show genuine interest.", "دقیقاً. سوالاتی می‌پرسند که علاقه واقعی نشان می‌دهد."),
            d("B", "What kind of questions?", "چه نوع سوالاتی؟"),
            d("A", "Open-ended ones. Not just 'yes or no' questions.", "سوالات باز. نه فقط سوالات بله یا خیر."),
            d("B", "So what are you thinking about when you talk to someone new?", "پس وقتی با کسی جدید صحبت می‌کنی به چه چیزی فکر می‌کنی؟"),
            d("A", "I try to find common ground. Something we both care about.", "سعی می‌کنم زمینه مشترکی پیدا کنم. چیزی که هر دو به آن اهمیت می‌دهیم."),
            d("B", "That's smart. Where did you learn that?", "هوشمندانه‌ست. از کجا یاد گرفتی؟"),
            d("A", "From my grandmother. She could talk to anyone, from any walk of life.", "از مادربزرگم. او می‌توانست با هر کسی، از هر طبقه‌ای صحبت کند."),
            d("B", "Sorry to interrupt, but that reminds me of my father.", "ببخشید وقفه می‌اندازم، ولی این پدرم را یادم می‌اندازد."),
            d("A", "Really? Tell me more.", "واقعاً؟ بیشتر بگو."),
            d("B", "He used to say that the secret was making the other person feel interesting.", "او می‌گفت راز این است که طرف مقابل را جالب حس کنی."),
            d("A", "That's brilliant. What else did he teach you?", "فوق‌العاده‌ست. چه چیز دیگری یادت داد؟"),
            d("B", "That silence isn't awkward. It's just space to think.", "اینکه سکوت معذب‌کننده نیست. فقط فضایی برای فکر کردن است."),
            d("A", "I wish more people understood that. I'm working on being more comfortable with pauses.", "کاش افراد بیشتری این را می‌فهمیدند. دارم روی راحت‌تر بودن با مکث‌ها کار می‌کنم."),
            d("B", "It takes practice, but it's worth it.", "تمرین لازم داره، ولی ارزشش را دارد.")
        ),
        listOf(
            q("What makes a great conversationalist?", listOf("talking a lot", "listening well", "being funny"), 1),
            q("Where did A learn about conversation?", listOf("school", "grandmother", "books"), 1),
            q("Who are you waiting ___?", listOf("at", "for", "with"), 1),
            q("Could you tell me what you ___?", listOf("mean", "do mean", "are meaning"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Couldn't agree more", "کاملاً موافقم", "I couldn't agree more.", "کاملاً موافقم."),
            IdiomExpression("Common ground", "زمینه مشترک", "Find common ground.", "زمینه مشترک پیدا کن."),
            IdiomExpression("Walk of life", "طبقه اجتماعی", "From any walk of life.", "از هر طبقه‌ای.")
        ),
        pron = listOf(
            PronunciationTip("Question intonation", "Wh-questions fall: WHERE are you FROM? ↘"),
            PronunciationTip("Polite interruption", "Rise before interrupting: Sorry to interRUPT? ↗")
        ),
        cult = listOf(
            CulturalNote("Conversation norms", "In Finland and Japan, silence is comfortable. In Mediterranean cultures, overlapping speech is normal and not rude.")
        ),
        mis = listOf(
            CommonMistake("Who are you waiting?", "Who are you waiting for?", "Don't drop the preposition."),
            CommonMistake("Could you tell me what do you mean?", "Could you tell me what you mean?", "Indirect: no auxiliary.")
        )
    )

    private fun f1B() = base(2, "1B Personality types", "۱B انواع شخصیت",
        listOf(
            "Use modifiers with adjectives",
            "Discuss personality traits",
            "Compare character types"
        ),
        listOf(
            v("introvert", "درون‌گرا", "A quiet introvert.", "درون‌گرای ساکت."),
            v("extrovert", "برون‌گرا", "A lively extrovert.", "برون‌گرای سرزنده."),
            v("outgoing", "برون‌گرا", "An outgoing person.", "فرد برون‌گرا.", "adjective"),
            v("reserved", "کم‌حرف", "Rather reserved.", "نسبتاً کم‌حرف.", "adjective"),
            v("assertive", "قاطع", "Assertive but polite.", "قاطع ولی مؤدب.", "adjective"),
            v("impulsive", "تکانشی", "Acting on impulse.", "بر اساس تکانش عمل کردن.", "adjective"),
            v("conscientious", "وظیفه‌شناس", "A conscientious worker.", "کارگر وظیفه‌شناس.", "adjective"),
            v("easygoing", "سهل‌گیر", "An easygoing friend.", "دوست سهل‌گیر.", "adjective"),
            v("temperamental", "دمدمی", "A temperamental artist.", "هنرمند دمدمی.", "adjective"),
            v("self-conscious", "خودآگاه", "Self-conscious about appearance.", "درباره ظاهر خودآگاه.", "adjective")
        ),
        listOf(
            GrammarSection("Modifiers with adjectives", "quite, rather, fairly, pretty, really, extremely, incredibly."),
            GrammarSection("Modifiers with strong adjectives", "absolutely exhausted (not very exhausted). completely delighted. utterly ridiculous."),
            GrammarSection("Gradable vs non-gradable", "Gradable: hot, tired, happy. Non-gradable: freezing, exhausted, delighted.")
        ),
        listOf(
            d("A", "Would you describe yourself as an introvert or an extrovert?", "خودت را درون‌گرا توصیف می‌کنی یا برون‌گرا؟"),
            d("B", "Definitely more of an introvert, though I'm not extremely shy.", "قطعاً بیشتر درون‌گرا، هرچند فوق‌العاده خجالتی نیستم."),
            d("A", "What does that mean in practice?", "در عمل یعنی چه؟"),
            d("B", "I enjoy socializing, but I need time alone to recharge. Parties are pretty exhausting for me.", "از معاشرت لذت می‌برم، ولی برای شارژ مجدد به تنهایی نیاز دارم. مهمانی‌ها برایم کاملاً خسته‌کننده‌اند."),
            d("A", "That's interesting. My partner is the opposite — incredibly outgoing.", "جالبه. شریکم برعکس است — فوق‌العاده برون‌گرا."),
            d("B", "How do you balance it?", "چطور تعادلش را حفظ می‌کنید؟"),
            d("A", "It's tricky sometimes. He wants to go out every night, and I'm fairly content at home.", "گاهی سخت است. او هر شب می‌خواهد بیرون برود، و من نسبتاً از خانه راضی‌ام."),
            d("B", "Do you ever feel pressured?", "هرگز تحت فشار حس می‌کنی؟"),
            d("A", "Occasionally. But we compromise — two nights out, three nights in.", "گاهی. ولی مصالحه می‌کنیم — دو شب بیرون، سه شب خانه."),
            d("B", "That sounds like a healthy approach. Are there other traits you admire in him?", "رویکرد سالمی به نظر می‌رسد. ویژگی دیگری هست که در او تحسین کنی؟"),
            d("A", "His confidence. He's remarkably assertive without being aggressive.", "اعتماد به نفسش. به طور قابل توجهی قاطع است بدون پرخاشگری."),
            d("B", "I envy that. I'm often too reserved to speak up.", "حسادت می‌کنم. اغلب خیلی کم‌حرفم که حرف بزنم."),
            d("A", "Really? You seem quite confident to me.", "واقعاً؟ به نظر من کاملاً با اعتماد به نفس می‌آیی."),
            d("B", "Thanks. It's a work in progress. I've been practicing being more direct.", "ممنون. در حال پیشرفت است. تمرین می‌کنم مستقیم‌تر باشم."),
            d("A", "That's admirable. What made you want to change?", "تحسین‌برانگیزه. چه چیزی باعث شد بخواهی تغییر کنی؟"),
            d("B", "I realized people respected me more when I stood up for myself.", "فهمیدم مردم وقتی از خودم دفاع کردم بیشتر احترام گذاشتند."),
            d("A", "That's absolutely true. Being assertive isn't selfish.", "کاملاً درسته. قاطع بودن خودخواهی نیست."),
            d("B", "Exactly. It took me years to learn that.", "دقیقاً. سال‌ها طول کشید تا یاد بگیرم.")
        ),
        listOf(
            q("What's B's personality type?", listOf("extrovert", "introvert", "neither"), 1),
            q("How do they balance their differences?", listOf("compromise", "argue", "separate"), 0),
            q("Parties are ___ exhausting for me.", listOf("very", "pretty", "absolutely"), 1),
            q("I'm ___ exhausted.", listOf("very", "pretty", "absolutely"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Recharge", "شارژ مجدد", "I need to recharge.", "باید شارژ مجدد کنم."),
            IdiomExpression("Work in progress", "در حال پیشرفت", "It's a work in progress.", "در حال پیشرفت است."),
            IdiomExpression("Stand up for yourself", "از خودت دفاع کن", "Stand up for yourself.", "از خودت دفاع کن.")
        ),
        pron = listOf(
            PronunciationTip("Modifier stress", "Stress the modifier or the adjective: QUITE tired. absolutely EXHAUSTED.")
        ),
        cult = listOf(
            CulturalNote("Introversion vs extroversion", "Western cultures often celebrate extroversion. In Japan and Finland, quieter personalities are valued more.")
        ),
        mis = listOf(
            CommonMistake("very exhausted", "absolutely exhausted", "Non-gradable adjectives use different modifiers."),
            CommonMistake("I need to recharge myself.", "I need to recharge.", "Recharge is used intransitively.")
        )
    )

    private fun f1C() = base(3, "1C Telling stories", "۱C داستان گفتن",
        listOf(
            "Use narrative devices and connectors",
            "Build suspense in storytelling",
            "Use intensifiers and dramatic language"
        ),
        listOf(
            v("suspense", "تعلیق", "Build suspense.", "تعلیق بساز."),
            v("plot twist", "پیچش داستان", "An unexpected plot twist.", "پیچش غیرمنتظره."),
            v("vivid", "زنده", "A vivid description.", "توصیف زنده.", "adjective"),
            v("gripping", "جذاب", "A gripping story.", "داستان جذاب.", "adjective"),
            v("dramatic", "دراماتیک", "A dramatic pause.", "مکث دراماتیک.", "adjective"),
            v("build up", "ساختن", "Build up to the climax.", "به اوج ساختن.", "verb"),
            v("come across", "برخورد کردن", "Come across an old photo.", "به عکس قدیمی برخورد کردن.", "verb"),
            v("turn out", "از آب درآمدن", "It turned out to be true.", "معلوم شد درست بود.", "verb"),
            v("in hindsight", "با نگاه به گذشته", "In hindsight, it was obvious.", "با نگاه به گذشته، واضح بود.", "phrase"),
            v("to this day", "تا امروز", "To this day, I don't know.", "تا امروز نمی‌دانم.", "phrase")
        ),
        listOf(
            GrammarSection("Narrative connectors", "at first, then, all of a sudden, before long, in the end, eventually."),
            GrammarSection("Dramatic structures", "Little did I know... Hardly had I arrived when... Never had I seen such..."),
            GrammarSection("Intensifiers", "absolutely, completely, utterly, totally, incredibly, remarkably.")
        ),
        listOf(
            d("A", "Tell me the most memorable thing that's ever happened to you.", "به‌یادماندنی‌ترین چیزی که تا حالا برایت اتفاق افتاده را بگو."),
            d("B", "That's a tough one. But I think it was the day I met my wife.", "سخته. ولی فکر می‌کنم روزی بود که همسرم را ملاقات کردم."),
            d("A", "Oh, that sounds like a story worth hearing.", "اوه، داستان ارزش شنیدن به نظر می‌رسد."),
            d("B", "It was absolutely pouring with rain. I'd completely forgotten my umbrella.", "کاملاً باران می‌بارید. چترم را کاملاً فراموش کرده بودم."),
            d("A", "Where were you going?", "کجا می‌رفتی؟"),
            d("B", "To a job interview. I was incredibly nervous, and to make matters worse, I was late.", "به مصاحبه شغلی. فوق‌العاده عصبی بودم، و بدتر از آن، دیر رسیده بودم."),
            d("A", "So what happened?", "پس چی شد؟"),
            d("B", "I ran into the building, utterly soaked, and bumped straight into someone.", "به ساختمان دویدم، کاملاً خیس، و مستقیم به کسی برخورد کردم."),
            d("A", "Oh no! Was it your future wife?", "اوه نه! همسر آینده‌ات بود؟"),
            d("B", "Hardly had I apologized when I realized she was the manager interviewing me.", "تازه عذرخواهی کرده بودم که فهمیدم او مدیر مصاحبه‌کننده‌ام بود."),
            d("A", "That's hilarious! What did she say?", "خنده‌داره! چی گفت؟"),
            d("B", "She just smiled and said, 'Well, at least you're punctual in spirit.'", "لبخند زد و گفت: 'خب، حداقل در روحیه وقت‌شناس هستی.'"),
            d("A", "Amazing. Did you get the job?", "شگفت‌انگیز. کار را گرفتی؟"),
            d("B", "I did. And three years later, we were married.", "گرفتم. و سه سال بعد، ازدواج کردیم."),
            d("A", "To this day, that must be your favourite story.", "تا امروز، باید داستان مورد علاقه‌ات باشد."),
            d("B", "Absolutely. In hindsight, being late was the best thing that ever happened to me.", "کاملاً. با نگاه به گذشته، دیر رسیدن بهترین چیزی بود که برایم اتفاق افتاد."),
            d("A", "Life has strange ways of working out.", "زندگی راه‌های عجیبی برای درست شدن دارد."),
            d("B", "It truly does. Never had I imagined such a twist.", "واقعاً همینطوره. هرگز چنین پیچشی تصور نمی‌کردم.")
        ),
        listOf(
            q("Where was B going?", listOf("to a wedding", "to a job interview", "to the airport"), 1),
            q("Who did B bump into?", listOf("a stranger", "his future wife", "his boss"), 1),
            q("Hardly had I apologized ___ I realized...", listOf("than", "when", "that"), 1),
            q("Never ___ I imagined such a twist.", listOf("have", "had", "did"), 1)
        ),
        idioms = listOf(
            IdiomExpression("To make matters worse", "بدتر از آن", "To make matters worse, I was late.", "بدتر از آن، دیر رسیده بودم."),
            IdiomExpression("Bump into", "برخورد کردن", "I bumped into someone.", "به کسی برخورد کردم."),
            IdiomExpression("Work out", "درست شدن", "Things work out.", "همه چیز درست می‌شود.")
        ),
        pron = listOf(
            PronunciationTip("Dramatic language", "Slow down for effect: It was... ABSOLUTELY... POURING with rain.")
        ),
        cult = listOf(
            CulturalNote("Storytelling style", "English storytelling often uses dramatic pauses, build-up, and emphasis on unexpected turns.")
        ),
        mis = listOf(
            CommonMistake("Never I had imagined.", "Never had I imagined.", "Inversion after negative adverbial."),
            CommonMistake("Hardly I had arrived when...", "Hardly had I arrived when...", "Inversion with hardly.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 1 ═══════════

    private fun pe1() = base(4, "PE1 A job interview", "انگلیسی کاربردی ۱ — مصاحبه شغلی",
        listOf(
            "Handle a professional job interview",
            "Answer competency-based questions",
            "Negotiate salary and conditions"
        ),
        listOf(
            v("competency", "شایستگی", "Competency-based questions.", "سوالات مبتنی بر شایستگی."),
            v("track record", "سابقه", "A proven track record.", "سابقه اثبات‌شده."),
            v("initiative", "ابتکار", "Show initiative.", "ابتکار نشان بده."),
            v("deadline", "مهلت", "Meet tight deadlines.", "مهلت‌های سخت را رعایت کن."),
            v("leverage", "استفاده کردن", "Leverage your strengths.", "از نقاط قوتت استفاده کن.", "verb"),
            v("negotiate", "مذاکره کردن", "Negotiate a salary.", "حقوق را مذاکره کن.", "verb"),
            v("prospect", "چشم‌انداز", "Career prospects.", "چشم‌انداز شغلی."),
            v("autonomy", "استقلال", "Work with autonomy.", "با استقلال کار کن."),
            v("mentorship", "منتورینگ", "Offer mentorship.", "منتورینگ ارائه بده."),
            v("benchmark", "معیار", "Industry benchmark.", "معیار صنعت.")
        ),
        listOf(
            GrammarSection("Present perfect for experience", "I've managed teams of up to 20 people."),
            GrammarSection("Polite negotiation", "Would it be possible to...? I was hoping to... Would you consider...?"),
            GrammarSection("Conditional offers", "If you offered a signing bonus, I'd be able to start sooner.")
        ),
        listOf(
            d("A", "Thank you for coming in today. I've reviewed your CV and I'm impressed.", "ممنون که امروز آمدید. رزومه‌تان را بررسی کرده‌ام و تحت تأثیر قرار گرفته‌ام."),
            d("B", "Thank you. I'm delighted to be considered for the role.", "ممنون. خوشحالم که برای این نقش در نظر گرفته شده‌ام."),
            d("A", "Tell me about a time you showed initiative.", "از زمانی بگویید که ابتکار نشان دادید."),
            d("B", "At my last company, I noticed our customer service was falling behind. I designed a training program and proposed it to my manager.", "در شرکت قبلی‌ام، متوجه شدم خدمات مشتریان عقب مانده است. یک برنامه آموزشی طراحی کردم و به مدیرم پیشنهاد دادم."),
            d("A", "And how was it received?", "و چطور استقبال شد؟"),
            d("B", "It was well-received. Within six months, our satisfaction scores went up by 30%.", "خوب استقبال شد. در عرض شش ماه، نمرات رضایت‌مان ۳۰٪ افزایش یافت."),
            d("A", "That's a strong track record. How do you handle pressure?", "سابقه قوی‌ای است. چطور فشار را مدیریت می‌کنید؟"),
            d("B", "I prioritize ruthlessly. I focus on what's urgent and important, and delegate the rest.", "بی‌رحم اولویت‌بندی می‌کنم. روی آنچه فوری و مهم است تمرکز می‌کنم و بقیه را تفویض می‌کنم."),
            d("A", "Good answer. Do you have any questions for us?", "پاسخ خوبی. سؤالی از ما دارید؟"),
            d("B", "Yes, a few. Could you tell me more about the team I'd be leading?", "بله، چندتا. می‌توانید بیشتر درباره تیمی که رهبری خواهم کرد بگویید؟"),
            d("A", "Of course. You'd manage five people, all experienced.", "البته. شما پنج نفر را مدیریت خواهید کرد، همه با تجربه."),
            d("B", "And what does the career progression look like?", "و مسیر پیشرفت شغلی چطور است؟"),
            d("A", "Within two years, you could be a senior director.", "در عرض دو سال، می‌توانید مدیر ارشد شوید."),
            d("B", "That sounds like an excellent prospect. Regarding the salary — would it be possible to discuss it further?", "چشم‌انداز عالی به نظر می‌رسد. درباره حقوق — می‌شود بیشتر بحث کنیم؟"),
            d("A", "Of course. What figure were you hoping for?", "البته. چه عددی را امیدوار بودید؟"),
            d("B", "Based on my experience, I was hoping for something in the region of $95,000, plus a signing bonus.", "بر اساس تجربه‌ام، امیدوار بودم چیزی حدود ۹۵ هزار دلار، به علاوه پاداش امضا."),
            d("A", "That's above our initial range, but for the right candidate we could be flexible.", "این بالاتر از محدوده اولیه ماست، ولی برای کاندیدای مناسب می‌توانیم انعطاف‌پذیر باشیم."),
            d("B", "I appreciate that. I'm confident I can bring real value to the team.", "قدردانم. مطمئنم می‌توانم ارزش واقعی برای تیم به ارمغان بیاورم."),
            d("A", "We'll be in touch by the end of the week.", "تا پایان هفته با شما تماس می‌گیریم.")
        ),
        listOf(
            q("How many people would B manage?", listOf("three", "five", "ten"), 1),
            q("What salary did B request?", listOf("$75k", "$95k", "$115k"), 1),
            q("I ___ managed teams of up to 20 people.", listOf("have", "has", "am"), 0),
            q("Would it ___ possible to discuss further?", listOf("be", "being", "been"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Track record", "سابقه", "A strong track record.", "سابقه قوی."),
            IdiomExpression("In the region of", "حدود", "$95k, in the region of.", "حدود ۹۵ هزار دلار."),
            IdiomExpression("Be in touch", "در تماس بودن", "We'll be in touch.", "در تماس خواهیم بود.")
        ),
        pron = listOf(
            PronunciationTip("Interview pace", "Slow down, use short sentences. Pause before key achievements.")
        ),
        cult = listOf(
            CulturalNote("Salary negotiation", "In the US and UK, negotiating salary is expected. In Japan and Germany, it's less common and can be seen as aggressive.")
        ),
        mis = listOf(
            CommonMistake("I was hoping to discussing.", "I was hoping to discuss.", "Hoping to + infinitive."),
            CommonMistake("Would be possible to discuss?", "Would it be possible to discuss?", "Don't drop 'it'.")
        )
    )

    // ═══════════ REVIEW 1 ═══════════

    private fun rc12() = base(5, "R&C 1&2", "مرور ۱ و ۲",
        listOf("Review question forms", "Review modifiers", "Review narrative devices"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("consolidate", "تثبیت کردن", "Consolidate your skills.", "مهارت‌هایت را تثبیت کن.", "verb"),
            v("fluency", "روانی", "Focus on fluency.", "روی روانی تمرکز کن."),
            v("accuracy", "دقت", "Balance accuracy and fluency.", "تعادل دقت و روانی."),
            v("confidence", "اعتماد به نفس", "Speak with confidence.", "با اعتماد به نفس صحبت کن."),
            v("progress", "پیشرفت", "Steady progress.", "پیشرفت پیوسته.")
        ),
        listOf(
            GrammarSection("Question forms with prepositions", "Who are you waiting for? What are you thinking about?"),
            GrammarSection("Modifiers with adjectives", "quite, fairly, absolutely, utterly. Gradable vs non-gradable."),
            GrammarSection("Narrative devices", "Little did I know... Hardly had I arrived when...")
        ),
        listOf(
            d("T", "Let's review. What are the key points from Files 1 and 2?", "بیایید مرور کنیم. نکات کلیدی فایل‌های ۱ و ۲ چیه؟"),
            d("A", "We practiced question forms with prepositions. Who are you waiting for, for instance.", "ساخت‌های سوال با حروف اضافه تمرین کردیم. مثلاً Who are you waiting for."),
            d("B", "And modifiers. It was absolutely fantastic, not very fantastic.", "و modifiers. It was absolutely fantastic، نه very fantastic."),
            d("T", "Why not 'very fantastic'?", "چرا نه 'very fantastic'؟"),
            d("A", "Because 'fantastic' is a strong adjective. You can't intensify it with 'very'.", "چون 'fantastic' صفت قوی است. نمی‌توان با 'very' تقویتش کرد."),
            d("T", "Perfect. What about narrative devices?", "عالی. دستگاه‌های روایی چطور؟"),
            d("B", "We learned inversion with negative adverbials. Never had I seen such a thing.", "وارونگی با قیدهای منفی یاد گرفتیم. Never had I seen such a thing."),
            d("T", "Excellent. Let's practice one more.", "عالی. یک مثال دیگر تمرین کنیم."),
            d("A", "Little did I know what would happen next.", "Little did I know what would happen next."),
            d("T", "Very good. And with 'hardly'?", "خیلی خوب. و با 'hardly'؟"),
            d("B", "Hardly had I arrived when the phone rang.", "Hardly had I arrived when the phone rang."),
            d("T", "You're making excellent progress.", "پیشرفت عالی داری."),
            d("A", "Thank you. We've been practicing every day.", "ممنون. هر روز تمرین می‌کنیم."),
            d("T", "It shows. Ready for File 3?", "معلومه. برای فایل ۳ آماده‌اید؟"),
            d("B", "Absolutely. Let's keep going.", "کاملاً. بیایید ادامه دهیم.")
        ),
        listOf(
            q("Who are you waiting ___?", listOf("at", "for", "with"), 1),
            q("Which is correct?", listOf("very fantastic", "absolutely fantastic", "much fantastic"), 1),
            q("Never ___ I seen such a thing.", listOf("have", "had", "did"), 1),
            q("Hardly had I arrived ___ the phone rang.", listOf("than", "when", "that"), 1)
        ),
        idioms = listOf(IdiomExpression("Keep going", "ادامه دادن", "Let's keep going.", "بیایید ادامه دهیم.")),
        pron = listOf(PronunciationTip("Inversion stress", "Stress the auxiliary: NEVER had I seen. HARDLY had I arrived.")),
        cult = listOf(CulturalNote("Review", "Effective review alternates grammar, vocabulary, and fluency practice.")),
        mis = listOf(
            CommonMistake("Who are you waiting?", "Who are you waiting for?", "Don't drop the preposition."),
            CommonMistake("Very exhausted.", "Absolutely exhausted.", "Non-gradable adjective.")
        )
    )

    // ═══════════ FILE 2 — Work and success ═══════════

    private fun f2A() = base(6, "2A The meaning of success", "۲A معنای موفقیت",
        listOf(
            "Use passive voice with modals",
            "Discuss success and achievement",
            "Express personal definitions of success"
        ),
        listOf(
            v("achievement", "دستاورد", "A great achievement.", "دستاورد بزرگ."),
            v("fulfillment", "رضایت", "Personal fulfillment.", "رضایت شخصی."),
            v("recognition", "شناسایی", "Public recognition.", "شناسایی عمومی."),
            v("ambition", "جاه‌طلبی", "Strong ambition.", "جاه‌طلبی قوی."),
            v("contentment", "قناعت", "True contentment.", "قناعت واقعی."),
            v("legacy", "میراث", "Leave a legacy.", "میراثی بگذار."),
            v("measure", "سنجیدن", "How do you measure success?", "موفقیت را چطور می‌سنجی؟", "verb"),
            v("sacrifice", "فداکاری", "Make sacrifices for success.", "برای موفقیت فداکاری کن.", "verb"),
            v("fulfill", "محقق کردن", "Fulfill your potential.", "پتانسیلت را محقق کن.", "verb"),
            v("setback", "شکست", "A major setback.", "شکست بزرگ."),
            v("perseverance", "پشتکار", "Perseverance is key.", "پشتکار کلید است."),
            v("gratifying", "رضایت‌بخش", "A gratifying experience.", "تجربه رضایت‌بخش.", "adjective")
        ),
        listOf(
            GrammarSection("Passive voice with modals", "Success can be measured in many ways. Sacrifices must be made. Ambition should be balanced."),
            GrammarSection("Causative passives", "He had his book published. She got her work recognized."),
            GrammarSection("Passive infinitives", "Success is said to be about happiness. She's believed to be the best.")
        ),
        listOf(
            d("A", "How would you define success?", "چطور موفقیت را تعریف می‌کنی؟"),
            d("B", "That's a big question. I used to think it was about money and recognition.", "سؤال بزرگی‌ست. قبلاً فکر می‌کردم در مورد پول و شناسایی است."),
            d("A", "And now?", "و الان؟"),
            d("B", "Now I think success is contentment. It can't be measured by external things.", "الان فکر می‌کنم موفقیت قناعت است. با چیزهای بیرونی سنجیده نمی‌شود."),
            d("A", "That's a mature view. But surely some ambition is healthy?", "دیدگاه بالغانه‌ای است. ولی قطعاً کمی جاه‌طلبی سالم است؟"),
            d("B", "Absolutely. Ambition should be encouraged, but not at the expense of health or relationships.", "کاملاً. جاه‌طلبی باید تشویق شود، ولی نه به قیمت سلامتی یا روابط."),
            d("A", "Have you ever made big sacrifices for your career?", "هرگز فداکاری‌های بزرگی برای حرفه‌ات کرده‌ای؟"),
            d("B", "Yes. I had my book published last year, but I'd spent two years barely seeing my family.", "بله. کتابم سال پیش منتشر شد، ولی دو سال به سختی خانواده‌ام را دیده بودم."),
            d("A", "Was it worth it?", "ارزشش را داشت؟"),
            d("B", "In some ways. But I wouldn't do it again. Success shouldn't cost you your health.", "از بعضی جهات. ولی دوباره انجامش نمی‌دادم. موفقیت نباید سلامتی‌ات را بگیرد."),
            d("A", "What would you tell a young person starting out?", "به یک جوان تازه‌کار چه می‌گفتی؟"),
            d("B", "I'd tell them that setbacks must be expected. Perseverance matters more than talent.", "می‌گفتم شکست‌ها باید انتظار شوند. پشتکار از استعداد مهم‌تر است."),
            d("A", "That's encouraging. Do you feel fulfilled now?", "تشویق‌کننده‌ست. الان رضایت داری؟"),
            d("B", "More than ever. Teaching, writing, being with family — those things fulfill me.", "بیشتر از همیشه. تدریس، نوشتن، با خانواده بودن — این چیزها راضی‌ام می‌کنند."),
            d("A", "What legacy do you hope to leave?", "چه میراثی امیدواری بگذاری؟"),
            d("B", "That I inspired others to find their own definition of success.", "اینکه دیگران را برای یافتن تعریف خودشان از موفقیت الهام کرده باشم."),
            d("A", "That's beautiful. And truly gratifying, I imagine.", "قشنگه. و واقعاً رضایت‌بخش، تصور می‌کنم."),
            d("B", "It is. Nothing is more rewarding than helping others grow.", "هست. هیچ چیز رضایت‌بخش‌تر از کمک به رشد دیگران نیست.")
        ),
        listOf(
            q("What does B think success is now?", listOf("money", "contentment", "fame"), 1),
            q("What did B publish?", listOf("an article", "a book", "a song"), 1),
            q("Success ___ be measured in many ways.", listOf("can", "is", "does"), 0),
            q("He had his book ___.", listOf("publish", "publishing", "published"), 2)
        ),
        idioms = listOf(
            IdiomExpression("At the expense of", "به قیمت", "Not at the expense of health.", "نه به قیمت سلامتی."),
            IdiomExpression("Worth it", "ارزشش را داشتن", "Was it worth it?", "ارزشش را داشت؟"),
            IdiomExpression("Starting out", "تازه شروع کردن", "For a young person starting out.", "برای یک جوان تازه‌کار.")
        ),
        pron = listOf(PronunciationTip("Passive", "Modal + be + past participle: can BE measured, must BE made.")),
        cult = listOf(CulturalNote("Definitions of success", "In collectivist cultures, success often means family harmony. In individualist cultures, personal achievement is emphasised.")),
        mis = listOf(
            CommonMistake("Success can measured.", "Success can be measured.", "Don't drop 'be'."),
            CommonMistake("He had his book publish.", "He had his book published.", "Causative: past participle.")
        )
    )

    private fun f2B() = base(7, "2B Work-life balance", "۲B تعادل کار و زندگی",
        listOf(
            "Use future forms for plans and predictions",
            "Discuss career and lifestyle choices",
            "Express hypothetical scenarios"
        ),
        listOf(
            v("burnout", "فرسودگی شغلی", "Avoid burnout.", "از فرسودگی شغلی اجتناب کن."),
            v("remote", "دورکار", "Remote work.", "کار از راه دور.", "adjective"),
            v("flexible", "انعطاف‌پذیر", "Flexible hours.", "ساعات انعطاف‌پذیر.", "adjective"),
            v("commute", "رفت و آمد", "A long commute.", "رفت و آمد طولانی."),
            v("productivity", "بهره‌وری", "Increase productivity.", "بهره‌وری را افزایش بده."),
            v("downtime", "زمان استراحت", "Need downtime.", "به زمان استراحت نیاز دارم."),
            v("boundary", "مرز", "Set boundaries.", "مرزها را تعیین کن."),
            v("prioritize", "اولویت‌بندی کردن", "Prioritize family.", "خانواده را اولویت‌بندی کن.", "verb"),
            v("delegate", "تفویض کردن", "Learn to delegate.", "یاد بگیر تفویض کنی.", "verb"),
            v("overwhelmed", "غرق‌شده", "Feeling overwhelmed.", "احساس غرق‌شدگی.", "adjective")
        ),
        listOf(
            GrammarSection("Future continuous", "This time next year, I'll be working from home."),
            GrammarSection("Future perfect", "By 2030, I'll have retired."),
            GrammarSection("Future time clauses", "As soon as I finish this project, I'll take a break."),
            GrammarSection("Be about to / Be on the point of", "I'm about to leave. I'm on the point of quitting.")
        ),
        listOf(
            d("A", "How do you manage work-life balance?", "چطور تعادل کار و زندگی را مدیریت می‌کنی؟"),
            d("B", "Honestly, I struggle. I've been overwhelmed lately.", "راستش، سخت می‌جنگم. اخیراً غرق شده‌ام."),
            d("A", "What's going on?", "چی شده؟"),
            d("B", "I took on too many projects. I'm about to crash if I don't change something.", "پروژه‌های زیادی قبول کرده‌ام. اگر چیزی را تغییر ندهم، دارم به دیوار می‌خورم."),
            d("A", "What would you change if you could?", "اگر می‌توانستی چه تغییری می‌دادی؟"),
            d("B", "I'd set firmer boundaries. I answer emails at midnight, which is ridiculous.", "مرزهای محکم‌تری تعیین می‌کردم. نیمه شب به ایمیل‌ها جواب می‌دهم، که مسخره است."),
            d("A", "Have you tried talking to your manager?", "با مدیرت صحبت کرده‌ای؟"),
            d("B", "Not yet. I'm on the point of doing that this week.", "هنوز نه. این هفته در آستانه انجامش هستم."),
            d("A", "Good. What are your longer-term plans?", "خوبه. برنامه‌های بلندمدتت چیست؟"),
            d("B", "By the end of the year, I'll have finished my biggest project. Then I'll take a month off.", "تا پایان سال، بزرگ‌ترین پروژه‌ام را تمام کرده‌ام. بعدش یک ماه مرخصی می‌گیرم."),
            d("A", "That sounds sensible. And beyond that?", "منطقی به نظر می‌رسد. و فراتر از آن؟"),
            d("B", "This time next year, I hope I'll be working fully remotely. No more commuting.", "این موقع سال بعد، امیدوارم کاملاً دورکار باشم. دیگر رفت و آمد نه."),
            d("A", "Would you miss the office?", "دلت برای دفتر تنگ می‌شود؟"),
            d("B", "Maybe the social side. But I wouldn't miss the two-hour commute.", "شاید جنبه اجتماعی‌اش. ولی دلم برای دو ساعت رفت و آمد تنگ نمی‌شود."),
            d("A", "Fair enough. What about your team?", "منصفانه. تیمت چطور؟"),
            d("B", "I'm learning to delegate more. If I don't, I'll never have real downtime.", "دارم یاد می‌گیرم بیشتر تفویض کنم. اگر نکنم، هرگز زمان استراحت واقعی نخواهم داشت."),
            d("A", "That's the right attitude. You have to protect your energy.", "نگرش درستی‌ست. باید انرژی‌ات را محافظت کنی."),
            d("B", "Exactly. As soon as I finish this project, I'll start saying no more often.", "دقیقاً. به محض اتمام این پروژه، بیشتر 'نه' گفتن را شروع می‌کنم."),
            d("A", "I'll hold you to that.", "بهت یادآوری می‌کنم.")
        ),
        listOf(
            q("What's B's problem?", listOf("too much work", "no friends", "bad pay"), 0),
            q("What does B plan by end of year?", listOf("quit", "finish project, take month off", "move abroad"), 1),
            q("This time next year, I ___ be working remotely.", listOf("will", "am", "would"), 0),
            q("By the end of the year, I ___ have finished.", listOf("will", "am", "would"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Take on", "قبول کردن", "I took on too many projects.", "پروژه‌های زیادی قبول کردم."),
            IdiomExpression("Fair enough", "منصفانه", "Fair enough.", "منصفانه."),
            IdiomExpression("Hold you to that", "یادآوری می‌کنم", "I'll hold you to that.", "بهت یادآوری می‌کنم.")
        ),
        pron = listOf(PronunciationTip("Future perfect", "Stress 'have': I'll HAVE finished. By the end of the year.")),
        cult = listOf(CulturalNote("Work-life balance", "Scandinavian countries lead in work-life balance. In the US and Japan, longer hours are more common.")),
        mis = listOf(
            CommonMistake("I'm about to leaving.", "I'm about to leave.", "About to + infinitive."),
            CommonMistake("By the end of the year, I will finish.", "By the end of the year, I will have finished.", "Future perfect for completed action.")
        )
    )

    private fun f2C() = base(8, "2C Changing careers", "۲C تغییر شغل",
        listOf(
            "Use wish / if only for regrets",
            "Talk about career changes",
            "Express hypothetical preferences"
        ),
        listOf(
            v("midlife", "میانسالی", "A midlife crisis.", "بحران میانسالی."),
            v("transition", "گذار", "A career transition.", "گذار شغلی."),
            v("transferable", "قابل انتقال", "Transferable skills.", "مهارت‌های قابل انتقال.", "adjective"),
            v("retrain", "بازآموزی", "Retrain for a new career.", "برای حرفه جدید بازآموزی کن.", "verb"),
            v("passion", "علاقه", "Follow your passion.", "علاقه‌ات را دنبال کن."),
            v("stable", "پایدار", "A stable job.", "شغل پایدار.", "adjective"),
            v("risk", "ریسک", "Take a risk.", "ریسک کن."),
            v("regret", "پشیمانی", "No regrets.", "بدون پشیمانی."),
            v("redundant", "اضافه", "Made redundant.", "اضافه از کار شده.", "adjective"),
            v("redundancy", "اضافه از کار", "A redundancy package.", "بسته اضافه از کار.")
        ),
        listOf(
            GrammarSection("Wish / If only + past simple", "I wish I had more time. If only I could start over."),
            GrammarSection("Wish / If only + past perfect", "I wish I had studied medicine. If only I hadn't left."),
            GrammarSection("Wish + would", "I wish he would stop complaining. Expressing irritation.")
        ),
        listOf(
            d("A", "Have you ever thought about changing careers?", "هرگز به تغییر شغل فکر کرده‌ای؟"),
            d("B", "Constantly. I wish I'd chosen a more creative field.", "مدام. کاش رشته خلاقانه‌تری انتخاب کرده بودم."),
            d("A", "What would you do if you could start over?", "اگر می‌توانستی از نو شروع کنی چیکار می‌کردی؟"),
            d("B", "If only I could go back, I'd become a writer. Or a teacher.", "کاش می‌توانستم برگردم، نویسنده می‌شدم. یا معلم."),
            d("A", "Why didn't you?", "چرا نشدی؟"),
            d("B", "I wish I'd been braver. I chose a stable job because my parents expected it.", "کاش شجاع‌تر بودم. شغل پایدار انتخاب کردم چون والدینم انتظار داشتند."),
            d("A", "But you have valuable skills now, don't you?", "ولی الان مهارت‌های ارزشمندی داری، نه؟"),
            d("B", "True. Transferable skills — communication, project management.", "درسته. مهارت‌های قابل انتقال — ارتباطات، مدیریت پروژه."),
            d("A", "So it's not too late. You could retrain part-time.", "پس خیلی دیر نیست. می‌توانی پاره‌وقت بازآموزی کنی."),
            d("B", "I've considered it. But I wish my job would give me more flexibility.", "در نظر گرفته‌ام. ولی کاش شغلم انعطاف بیشتری می‌داد."),
            d("A", "Have you asked?", "پرسیده‌ای؟"),
            d("B", "Not yet. I'm afraid of being made redundant.", "هنوز نه. می‌ترسم اضافه از کار شوم."),
            d("A", "That's understandable. But redundancy isn't always a bad thing.", "قابل درک است. ولی اضافه از کار همیشه چیز بدی نیست."),
            d("B", "How so?", "چطور؟"),
            d("A", "I know someone who was made redundant and used the payout to start her own business.", "کسی را می‌شناسم که اضافه از کار شد و از غرامت برای راه‌اندازی کسب و کار خودش استفاده کرد."),
            d("B", "I wish I had that kind of courage.", "کاش آن نوع شجاعت را داشتم."),
            d("A", "You do. You just need to trust yourself more.", "داری. فقط باید بیشتر به خودت اعتماد کنی."),
            d("B", "Thank you. Maybe I'll take a small step this month.", "ممنون. شاید این ماه یک قدم کوچک بردارم.")
        ),
        listOf(
            q("What would B become if starting over?", listOf("doctor", "writer/teacher", "engineer"), 1),
            q("Why did B choose a stable job?", listOf("passion", "parents' expectations", "money"), 1),
            q("I wish I ___ chosen differently.", listOf("have", "had", "has"), 1),
            q("If only I ___ go back.", listOf("can", "could", "would"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Start over", "از نو شروع کردن", "Start over.", "از نو شروع کن."),
            IdiomExpression("Transferable skills", "مهارت‌های قابل انتقال", "Transferable skills matter.", "مهارت‌های قابل انتقال مهم‌اند."),
            IdiomExpression("How so?", "چطور؟", "How so?", "چطور؟")
        ),
        pron = listOf(PronunciationTip("Wish", "The 'w' is pronounced: /wɪʃ/. 'If only' often reduced to /ɪf ˈəʊnli/.")),
        cult = listOf(CulturalNote("Career change", "Increasingly common. Average worker changes careers 5-7 times in a lifetime.")),
        mis = listOf(
            CommonMistake("I wish I have more time.", "I wish I had more time.", "Wish + past simple."),
            CommonMistake("I wish I would be braver.", "I wish I were braver.", "Use 'were' for hypothetical states.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 2 ═══════════

    private fun pe2() = base(9, "PE2 A business meeting", "انگلیسی کاربردی ۲ — جلسه کاری",
        listOf(
            "Participate effectively in business meetings",
            "Disagree diplomatically",
            "Propose and negotiate ideas"
        ),
        listOf(
            v("agenda", "دستور جلسه", "Set the agenda.", "دستور جلسه را تعیین کن."),
            v("minutes", "صورت‌جلسه", "Take the minutes.", "صورت‌جلسه بردار."),
            v("consensus", "اجماع", "Reach a consensus.", "به اجماع برسید."),
            v("proposal", "پیشنهاد", "Submit a proposal.", "پیشنهاد ارائه بده."),
            v("implement", "اجرا کردن", "Implement the plan.", "طرح را اجرا کن.", "verb"),
            v("postpone", "به تعویق انداختن", "Postpone the decision.", "تصمیم را به تعویق بینداز.", "verb"),
            v("come up with", "به ذهن رسیدن", "Come up with an idea.", "به فکری برس.", "verb"),
            v("bring up", "مطرح کردن", "Bring up a concern.", "نگرانی را مطرح کن.", "verb"),
            v("follow up", "پیگیری کردن", "Follow up on the email.", "ایمیل را پیگیری کن.", "verb"),
            v("deadline", "مهلت", "Tight deadline.", "مهلت سخت.")
        ),
        listOf(
            GrammarSection("Diplomatic disagreement", "I see your point, but... With respect, I think... I'm not sure I agree."),
            GrammarSection("Proposing ideas", "What if we...? I suggest that we... Have we considered...?"),
            GrammarSection("Negotiating", "Would you be willing to...? If we could agree on..., then we might...")
        ),
        listOf(
            d("A", "Thanks for joining. Let's go over the agenda. First, the Q3 marketing plan.", "ممنون که آمدید. بیایید دستور جلسه را مرور کنیم. اول، طرح بازاریابی فصل سوم."),
            d("B", "Before we start, could I bring up something?", "قبل از شروع، می‌توانم چیزی مطرح کنم؟"),
            d("A", "Of course.", "البته."),
            d("B", "The deadline for Q3 feels unrealistic. We only have three weeks.", "مهلت فصل سوم غیرواقعی به نظر می‌رسد. فقط سه هفته داریم."),
            d("C", "I see your point, but the client is insisting on it. We can't postpone.", "نکته‌ات را می‌بینم، ولی مشتری پافشاری می‌کند. نمی‌توانیم به تعویق بیندازیم."),
            d("B", "With respect, that's exactly the problem. We're setting ourselves up for failure.", "با احترام، دقیقاً همین مشکل است. داریم خودمان را برای شکست آماده می‌کنیم."),
            d("A", "Let's hear both sides. What would you propose instead?", "بیایید هر دو طرف را بشنویم. به جایش چه پیشنهاد می‌کنی؟"),
            d("B", "What if we asked for a two-week extension? Just to get the quality right.", "چه می‌شود اگر دو هفته تمدید بخواهیم؟ فقط برای کیفیت درست."),
            d("C", "That might be possible. But we'd need to justify it very clearly.", "ممکن است ممکن باشد. ولی باید خیلی واضح توجیهش کنیم."),
            d("A", "I agree with C. If we could show the trade-offs, the client might accept.", "با C موافقم. اگر بتوانیم مبادله‌ها را نشان دهیم، مشتری ممکن است قبول کند."),
            d("B", "Exactly. I suggest that we prepare a brief with two options: on-time but lower quality, or delayed with full quality.", "دقیقاً. پیشنهاد می‌کنم بریفی با دو گزینه آماده کنیم: به موقع ولی کیفیت پایین‌تر، یا با تأخیر ولی کیفیت کامل."),
            d("C", "That's a fair proposal. I could draft it by tomorrow.", "پیشنهاد منصفانه‌ای است. می‌توانم تا فردا پیش‌نویسش کنم."),
            d("A", "Great. B, would you be willing to present it to the client?", "عالی. B، می‌توانی آن را به مشتری ارائه دهی؟"),
            d("B", "I'd be happy to. As long as we're aligned internally.", "خوشحال می‌شوم. تا زمانی که داخلی هم‌راستا باشیم."),
            d("A", "We are. Let's agree on this: one brief, two options, presented together.", "هستیم. بیایید روی این توافق کنیم: یک بریف، دو گزینه، با هم ارائه شود."),
            d("C", "Agreed. I'll also follow up with the client to prepare them.", "موافقم. من هم با مشتری پیگیری می‌کنم تا آماده‌شان کنم."),
            d("A", "Perfect. Any other business before we close?", "عالی. کار دیگری قبل از بستن جلسه؟"),
            d("B", "No, that's everything. Thank you, everyone.", "نه، همین است. ممنون از همه.")
        ),
        listOf(
            q("What's B's concern?", listOf("budget", "deadline", "team"), 1),
            q("What's B's proposal?", listOf("cancel project", "two options brief", "hire more"), 1),
            q("I see your point, ___ the client insists.", listOf("and", "but", "or"), 1),
            q("What if we ___ for an extension?", listOf("ask", "asked", "asking"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Go over", "مرور کردن", "Let's go over the agenda.", "بیایید دستور جلسه را مرور کنیم."),
            IdiomExpression("Set up for failure", "آماده کردن برای شکست", "We're setting ourselves up for failure.", "داریم خودمان را برای شکست آماده می‌کنیم."),
            IdiomExpression("Aligned", "هم‌راستا", "As long as we're aligned.", "تا زمانی که هم‌راستا باشیم.")
        ),
        pron = listOf(
            PronunciationTip("Diplomatic tone", "Use a soft, measured tone for disagreement. Stress 'see': I SEE your point, but...")
        ),
        cult = listOf(
            CulturalNote("Meeting culture", "In Scandinavian countries, meetings are flat and informal. In Japan and Korea, hierarchy is respected more.")
        ),
        mis = listOf(
            CommonMistake("I suggest to prepare.", "I suggest preparing.", "Suggest + gerund."),
            CommonMistake("What if we will ask?", "What if we asked?", "Hypothetical: past simple.")
        )
    )

    // ═══════════ REVIEW 2 ═══════════

    private fun rc34() = base(10, "R&C 3&4", "مرور ۳ و ۴",
        listOf("Review passive voice", "Review wish/if only", "Review future forms"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("consolidate", "تثبیت کردن", "Consolidate grammar.", "گرامر را تثبیت کن.", "verb"),
            v("accuracy", "دقت", "Focus on accuracy.", "روی دقت تمرکز کن."),
            v("fluency", "روانی", "Build fluency.", "روانی بساز."),
            v("confidence", "اعتماد به نفس", "Grow in confidence.", "اعتماد به نفس پیدا کن."),
            v("progress", "پیشرفت", "Steady progress.", "پیشرفت پیوسته.")
        ),
        listOf(
            GrammarSection("Passive voice with modals", "Success can be measured. Sacrifices must be made."),
            GrammarSection("Wish / If only", "I wish I had more time. If only I could go back."),
            GrammarSection("Future forms", "Will, going to, future continuous, future perfect.")
        ),
        listOf(
            d("T", "Let's review Files 3 and 4.", "بیایید فایل‌های ۳ و ۴ را مرور کنیم."),
            d("A", "We studied passive with modals. Success can be measured in many ways.", "مجهول با افعال وجهی مطالعه کردیم. Success can be measured in many ways."),
            d("B", "And causative passives. He had his book published.", "و مجهول سببی. He had his book published."),
            d("T", "Excellent. Wish and if only?", "عالی. Wish و if only؟"),
            d("A", "I wish I had studied medicine. If only I could start over.", "I wish I had studied medicine. If only I could start over."),
            d("T", "Difference between them?", "تفاوتشان؟"),
            d("B", "'Wish' is more common in speech. 'If only' is more dramatic and emphatic.", "'Wish' در گفتار رایج‌تر است. 'If only' دراماتیک‌تر و تأکیدی‌تر."),
            d("T", "Perfect. Future forms?", "عالی. شکل‌های آینده؟"),
            d("A", "I'll help you. I'm going to study. This time next year, I'll be working remotely.", "I'll help you. I'm going to study. This time next year, I'll be working remotely."),
            d("B", "By 2030, I'll have retired.", "By 2030, I'll have retired."),
            d("T", "When do we use future perfect?", "کِی از future perfect استفاده می‌کنیم؟"),
            d("A", "For actions completed before a certain point in the future.", "برای کارهایی که قبل از نقطه مشخصی در آینده تمام می‌شوند."),
            d("T", "Excellent. You're making great progress.", "عالی. پیشرفت عالی داری."),
            d("B", "Thank you. We've been practicing every day.", "ممنون. هر روز تمرین می‌کنیم."),
            d("T", "It shows. Ready for File 5?", "معلومه. برای فایل ۵ آماده‌اید؟")
        ),
        listOf(
            q("Passive with modal example?", listOf("can measure", "can be measured", "measured can"), 1),
            q("Wish + past simple for:", listOf("past regrets", "present states", "future"), 1),
            q("I wish I ___ studied medicine.", listOf("have", "had", "has"), 1),
            q("By 2030, I ___ have retired.", listOf("will", "am", "would"), 0)
        ),
        idioms = listOf(IdiomExpression("It shows", "معلومه", "It shows.", "معلومه.")),
        pron = listOf(PronunciationTip("Passive", "Modal + be + past participle. Stress the participle: can be MEASured.")),
        cult = listOf(CulturalNote("Review", "Grammar accuracy and fluency should be balanced.")),
        mis = listOf(
            CommonMistake("I wish I have more time.", "I wish I had more time.", "Wish + past simple."),
            CommonMistake("Success can measured.", "Success can be measured.", "Don't drop 'be'.")
        )
    )

    // ═══════════ FILE 3 — Media and news ═══════════

    private fun f3A() = base(11, "3A Fake news", "۳A اخبار جعلی",
        listOf(
            "Use reporting verbs",
            "Discuss media and misinformation",
            "Evaluate sources critically"
        ),
        listOf(
            v("misinformation", "اطلاعات نادرست", "Spread misinformation.", "اطلاعات نادرست پخش کن."),
            v("credible", "قابل اعتماد", "A credible source.", "منبع قابل اعتماد.", "adjective"),
            v("bias", "سوگیری", "Media bias.", "سوگیری رسانه‌ای."),
            v("verify", "تأیید کردن", "Verify the facts.", "حقایق را تأیید کن.", "verb"),
            v("manipulate", "دستکاری کردن", "Manipulate public opinion.", "افکار عمومی را دستکاری کن.", "verb"),
            v("sensational", "هیجان‌انگیز", "Sensational headlines.", "تیترهای هیجان‌انگیز.", "adjective"),
            v("headline", "تیتر", "A misleading headline.", "تیتر گمراه‌کننده."),
            v("source", "منبع", "Check the source.", "منبع را بررسی کن."),
            v("controversial", "بحث‌برانگیز", "A controversial topic.", "موضوع بحث‌برانگیز.", "adjective"),
            v("fact-check", "راستی‌آزمایی", "Fact-check the claims.", "ادعاها را راستی‌آزمایی کن.", "verb"),
            v("conspiracy", "توطئه", "A conspiracy theory.", "تئوری توطئه."),
            v("echo chamber", "اتاق پژواک", "Living in an echo chamber.", "زندگی در اتاق پژواک.")
        ),
        listOf(
            GrammarSection("Reporting verbs", "claim, allege, deny, admit, insist, suggest, warn, point out."),
            GrammarSection("Reporting structures", "He claimed that... She denied doing... They warned us not to..."),
            GrammarSection("Passive reporting", "It is said that... He is believed to be... It's reported that...")
        ),
        listOf(
            d("A", "Do you trust everything you read online?", "به همه چیزهایی که آنلاین می‌خوانی اعتماد می‌کنی؟"),
            d("B", "Definitely not. I've become much more skeptical in recent years.", "قطعاً نه. در سال‌های اخیر خیلی شک‌گراتر شده‌ام."),
            d("A", "What made you change?", "چه چیزی باعث تغییرت شد؟"),
            d("B", "I shared a story that turned out to be completely false. It was embarrassing.", "داستانی را به اشتراک گذاشتم که کاملاً جعلی از آب درآمد. خجالت‌آور بود."),
            d("A", "That happens to everyone. How do you fact-check now?", "این برای همه اتفاق می‌افتد. الان چطور راستی‌آزمایی می‌کنی؟"),
            d("B", "I check multiple sources. If only one outlet is reporting something sensational, I'm suspicious.", "چندین منبع را بررسی می‌کنم. اگر فقط یک رسانه چیز هیجان‌انگیزی گزارش دهد، مشکوک می‌شوم."),
            d("A", "Do you think media bias is a serious problem?", "فکر می‌کنی سوگیری رسانه‌ای مشکل جدی‌ست؟"),
            d("B", "Absolutely. It's often said that everyone has an agenda. And they do.", "قطعاً. اغلب گفته می‌شود که همه برنامه‌ای دارند. و دارند."),
            d("A", "How do we know what's really true?", "چطور بفهمیم چه چیزی واقعاً درست است؟"),
            d("B", "It's harder than ever. Social media algorithms are designed to keep us in echo chambers.", "از همیشه سخت‌تر است. الگوریتم‌های شبکه‌های اجتماعی طراحی شده‌اند تا ما را در اتاق‌های پژواک نگه دارند."),
            d("A", "So what can we do?", "پس چیکار می‌توانیم بکنیم؟"),
            d("B", "Read widely. Challenge your own views. Follow people you disagree with.", "گسترده بخوان. دیدگاه‌هایت را به چالش بکش. افرادی را دنبال کن که مخالفی."),
            d("A", "That's easier said than done.", "این راحت گفته می‌شود تا انجام شود."),
            d("B", "True. But it's the only way to stay informed without being manipulated.", "درسته. ولی تنها راهی‌ست که آگاه بمانی بدون دستکاری شدن."),
            d("A", "Do you think governments should regulate social media?", "فکر می‌کنی دولت‌ها باید شبکه‌های اجتماعی را تنظیم کنند؟"),
            d("B", "It's controversial. Regulation could help, but it could also be abused.", "بحث‌برانگیزه. تنظیم می‌تواند کمک کند، ولی می‌تواند سوءاستفاده هم شود."),
            d("A", "Where do you draw the line?", "خط را کجا می‌کشی؟"),
            d("B", "I'd say misinformation that endangers lives should be removed. Everything else should be debated.", "می‌گویم اطلاعات نادرستی که جان‌ها را به خطر می‌اندازد باید حذف شود. بقیه باید بحث شود."),
            d("A", "That's a reasonable position.", "موضع منطقی‌ست.")
        ),
        listOf(
            q("Why did B become more skeptical?", listOf("heard news", "shared false story", "studied journalism"), 1),
            q("What does B do now to fact-check?", listOf("trust only one", "check multiple sources", "avoid news"), 1),
            q("It ___ said that everyone has an agenda.", listOf("is", "was", "has"), 0),
            q("He ___ to be an expert.", listOf("believes", "is believed", "believing"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Easier said than done", "راحت گفته می‌شود تا انجام شود", "Easier said than done.", "راحت گفته می‌شود تا انجام شود."),
            IdiomExpression("Draw the line", "خط کشیدن", "Where do you draw the line?", "خط را کجا می‌کشی؟"),
            IdiomExpression("Turn out", "از آب درآمدن", "It turned out to be false.", "جعلی از آب درآمد.")
        ),
        pron = listOf(
            PronunciationTip("Reporting verbs", "Stress the reporting verb for emphasis: He CLAIMED that... They DENIED it.")
        ),
        cult = listOf(
            CulturalNote("Media literacy", "Finland teaches media literacy in schools. It's considered essential for democracy.")
        ),
        mis = listOf(
            CommonMistake("He is said to be a liar.", "He is said to be a liar.", "Correct (passive reporting)."),
            CommonMistake("He denied to steal.", "He denied stealing.", "Deny + gerund.")
        )
    )

    private fun f3B() = base(12, "3B Advertising and persuasion", "۳B تبلیغات و متقاعدسازی",
        listOf(
            "Use persuasive language",
            "Analyse advertising techniques",
            "Discuss consumer manipulation"
        ),
        listOf(
            v("persuade", "متقاعد کردن", "Persuade customers.", "مشتریان را متقاعد کن.", "verb"),
            v("convince", "قانع کردن", "Convince the audience.", "مخاطب را قانع کن.", "verb"),
            v("target", "هدف گرفتن", "Target young people.", "جوانان را هدف بگیر.", "verb"),
            v("brand", "برند", "Build a brand.", "برند بساز."),
            v("slogan", "شعار", "Catchy slogan.", "شعار جذاب."),
            v("influence", "تأثیر", "Peer influence.", "تأثیر همتایان."),
            v("psychological", "روانشناختی", "Psychological tricks.", "ترفندهای روانشناختی.", "adjective"),
            v("testimonial", "توصیه", "Celebrity testimonial.", "توصیه سلبریتی."),
            v("subtle", "ظریف", "A subtle message.", "پیام ظریف.", "adjective"),
            v("manipulative", "دستکاری‌کننده", "Manipulative tactics.", "تاکتیک‌های دستکاری‌کننده.", "adjective"),
            v("appeal", "جذابیت", "Appeal to emotions.", "به احساسات جذابیت دارد."),
            v("consumer", "مصرف‌کننده", "The modern consumer.", "مصرف‌کننده مدرن.")
        ),
        listOf(
            GrammarSection("Persuasive language", "You deserve... Everyone is buying... Don't miss out... Limited time only."),
            GrammarSection("Causative verbs", "make, let, have, get. Adverts make us want. They get us to buy."),
            GrammarSection("Conditional persuasion", "If you buy now, you'll save 50%. Unless you act, you'll miss out.")
        ),
        listOf(
            d("A", "Do you think advertising manipulates people?", "فکر می‌کنی تبلیغات مردم را دستکاری می‌کند؟"),
            d("B", "Without a doubt. It plays on our deepest insecurities.", "بدون شک. روی عمیق‌ترین ناامنی‌های ما بازی می‌کند."),
            d("A", "Can you give an example?", "مثالی می‌زنی؟"),
            d("B", "Look at beauty ads. They make us feel inadequate so we'll buy their products.", "تبلیغات زیبایی را ببین. ما را ناکافی حس می‌دهند تا محصولاتشان را بخریم."),
            d("A", "That's true. What about celebrity endorsements?", "درسته. تأیید سلبریتی‌ها چطور؟"),
            d("B", "Those get people to buy things they don't need. It's subtle but powerful.", "آن‌ها مردم را وادار به خرید چیزهایی که نیاز ندارند می‌کنند. ظریف است ولی قدرتمند."),
            d("A", "Do you think companies should be regulated more?", "فکر می‌کنی شرکت‌ها باید بیشتر تنظیم شوند؟"),
            d("B", "Definitely. Especially ads targeting children. Those are the most manipulative.", "قطعاً. مخصوصاً تبلیغاتی که کودکان را هدف می‌گیرند. آن‌ها دستکاری‌کننده‌ترین هستند."),
            d("A", "How do they target children?", "چطور کودکان را هدف می‌گیرند؟"),
            d("B", "Bright colors, cartoon characters, catchy songs. Kids make their parents buy things.", "رنگ‌های روشن، شخصیت‌های کارتونی، آهنگ‌های جذاب. بچه‌ها والدینشان را وادار به خرید می‌کنند."),
            d("A", "Have you ever been influenced by an ad?", "هرگز تحت تأثیر تبلیغی قرار گرفته‌ای؟"),
            d("B", "Many times. I once bought a watch just because a footballer was wearing it.", "بارها. یک بار فقط چون یک فوتبالیست ساعتش را پوشیده بود، ساعت خریدم."),
            d("A", "Did you regret it?", "پشیمان شدی؟"),
            d("B", "Not really — it's a good watch. But the reason I bought it was silly.", "نه زیاد — ساعت خوبی‌ست. ولی دلیلی که خریدمش احمقانه بود."),
            d("A", "What would you tell young consumers?", "به مصرف‌کنندگان جوان چه می‌گفتی؟"),
            d("B", "I'd tell them to ask themselves: do I want this, or have I been persuaded that I want it?", "می‌گفتم از خودشان بپرسند: آیا این را می‌خواهم، یا متقاعد شده‌ام که می‌خواهم؟"),
            d("A", "That's excellent advice.", "توصیه عالی‌ایه."),
            d("B", "It takes practice. We've all been fooled at some point.", "تمرین لازم داره. همه‌مان در مقطعی فریب خورده‌ایم.")
        ),
        listOf(
            q("How does B say advertising works?", listOf("honest info", "playing on insecurities", "cheap prices"), 1),
            q("What did B buy due to an ad?", listOf("shoes", "watch", "phone"), 1),
            q("Ads make us ___ things.", listOf("to buy", "buying", "buy"), 2),
            q("If you buy now, you ___ save 50%.", listOf("will", "would", "are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Play on", "بازی کردن روی", "Play on our insecurities.", "روی ناامنی‌های ما بازی می‌کند."),
            IdiomExpression("Miss out", "از دست دادن", "Don't miss out.", "از دست نده."),
            IdiomExpression("Be fooled", "فریب خوردن", "We've all been fooled.", "همه‌مان فریب خورده‌ایم.")
        ),
        pron = listOf(
            PronunciationTip("Persuasive stress", "Adverts use emphasis on emotion words: You DESERVE this. Everyone is BUYING it.")
        ),
        cult = listOf(
            CulturalNote("Advertising regulation", "Sweden bans ads targeting children under 12. The US has fewer restrictions.")
        ),
        mis = listOf(
            CommonMistake("Ads make us to buy.", "Ads make us buy.", "Make + bare infinitive."),
            CommonMistake("They get us buy.", "They get us to buy.", "Get + object + to-infinitive.")
        )
    )

    private fun f3C() = base(13, "3C Journalism today", "۳C روزنامه‌نگاری امروز",
        listOf(
            "Use complex passive structures",
            "Discuss the future of journalism",
            "Express informed opinions"
        ),
        listOf(
            v("investigate", "تحقیق کردن", "Investigate a story.", "داستانی را تحقیق کن.", "verb"),
            v("expose", "افشا کردن", "Expose corruption.", "فساد را افشا کن.", "verb"),
            v("corruption", "فساد", "Political corruption.", "فساد سیاسی."),
            v("integrity", "صداقت", "Journalistic integrity.", "صداقت روزنامه‌نگاری."),
            v("deadline", "مهلت", "Meet the deadline.", "مهلت را رعایت کن."),
            v("freelance", "فریلنس", "A freelance journalist.", "روزنامه‌نگار فریلنس.", "adjective"),
            v("editor", "سردبیر", "The editor-in-chief.", "سردبیر اصلی."),
            v("objective", "بی‌طرف", "Objective reporting.", "گزارش بی‌طرف.", "adjective"),
            v("sensationalism", "هیجان‌گرایی", "Sensationalism sells.", "هیجان‌گرایی می‌فروشد."),
            v("clickbait", "کلیک‌بیت", "Clickbait titles.", "عناوین کلیک‌بیت."),
            v("paywall", "دیوار پرداخت", "Behind a paywall.", "پشت دیوار پرداخت."),
            v("subscriber", "مشترک", "Millions of subscribers.", "میلیون‌ها مشترک.")
        ),
        listOf(
            GrammarSection("Complex passive", "The story was being investigated. It has been reported that... He was said to have leaked."),
            GrammarSection("Passive + infinitive", "The journalist is known to have exposed corruption. The paper is expected to publish."),
            GrammarSection("Impersonal passive", "It is thought that... It's been claimed that... It's widely believed that...")
        ),
        listOf(
            d("A", "Do you think traditional journalism is dying?", "فکر می‌کنی روزنامه‌نگاری سنتی در حال مرگ است؟"),
            d("B", "Not dying exactly, but it's being forced to change dramatically.", "دقیقاً نمرده، ولی مجبور شده به شدت تغییر کند."),
            d("A", "What's driving the change?", "چه چیزی این تغییر را هدایت می‌کند؟"),
            d("B", "Social media, mostly. It's been reported that most young people now get their news from Instagram or TikTok.", "بیشتر شبکه‌های اجتماعی. گزارش شده که بیشتر جوانان الان اخبارشان را از اینستاگرام یا تیک‌تاک می‌گیرند."),
            d("A", "Is that a problem?", "این مشکل است؟"),
            d("B", "It can be. Quality journalism is expensive. If nobody pays, it disappears.", "می‌تونه باشه. روزنامه‌نگاری باکیفیت گران است. اگر کسی پرداخت نکند، ناپدید می‌شود."),
            d("A", "What about paywalls?", "دیوارهای پرداخت چطور؟"),
            d("B", "They're being adopted by many papers. It's thought that subscription models will dominate.", "توسط بسیاری از روزنامه‌ها پذیرفته می‌شوند. فکر می‌شود مدل‌های اشتراک غالب خواهند شد."),
            d("A", "Do you subscribe to any news source?", "مشترک هیچ منبع خبری هستی؟"),
            d("B", "Two, actually. I believe quality journalism should be supported.", "در واقع دو تا. معتقدم روزنامه‌نگاری باکیفیت باید حمایت شود."),
            d("A", "What worries you most about modern media?", "بیشتر از همه درباره رسانه مدرن چه چیزی نگرانت می‌کند؟"),
            d("B", "Clickbait and sensationalism. It's been shown that outrage drives engagement.", "کلیک‌بیت و هیجان‌گرایی. نشان داده شده که خشم تعامل را بالا می‌برد."),
            d("A", "That's depressing. Can anything be done?", "افسرده‌کننده‌ست. کاری می‌شود کرد؟"),
            d("B", "I believe so. Media literacy should be taught in every school.", "معتقدم بله. سواد رسانه‌ای باید در هر مدرسه‌ای تدریس شود."),
            d("A", "Have you ever considered being a journalist?", "هرگز به روزنامه‌نگار شدن فکر کرده‌ای؟"),
            d("B", "Once. But the industry is so unstable now. Freelancers are especially vulnerable.", "یک بار. ولی صنعت الان خیلی ناپایدار است. فریلنسرها مخصوصاً آسیب‌پذیرند."),
            d("A", "Do you admire investigative journalists?", "روزنامه‌نگاران تحقیقی را تحسین می‌کنی؟"),
            d("B", "Enormously. They're said to be the last line of defence against corruption.", "فوق‌العاده. گفته می‌شود آخرین خط دفاعی در برابر فساد هستند."),
            d("A", "Let's hope they survive.", "امیدواریم زنده بمانند."),
            d("B", "They must. Democracy depends on them.", "باید. دموکراسی به آن‌ها وابسته است.")
        ),
        listOf(
            q("What's driving change in journalism?", listOf("TV", "social media", "radio"), 1),
            q("What worries B most?", listOf("paywalls", "clickbait", "freelancers"), 1),
            q("The story ___ being investigated.", listOf("is", "was", "has"), 1),
            q("It ___ been reported that most get news online.", listOf("is", "has", "was"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Drive", "هدایت کردن", "What's driving the change?", "چه چیزی این تغییر را هدایت می‌کند؟"),
            IdiomExpression("Last line of defence", "آخرین خط دفاعی", "The last line of defence.", "آخرین خط دفاعی."),
            IdiomExpression("Depend on", "وابسته بودن", "Democracy depends on them.", "دموکراسی به آن‌ها وابسته است.")
        ),
        pron = listOf(
            PronunciationTip("Passive", "Complex passives are common in formal speech. Stress the past participle: It has been REported.")
        ),
        cult = listOf(
            CulturalNote("Journalism crisis", "Local newspapers have closed across the US and UK. Investigative journalism is increasingly funded by nonprofits.")
        ),
        mis = listOf(
            CommonMistake("It is thought that he is being corrupt.", "It is thought that he is corrupt.", "Stative verb, no continuous."),
            CommonMistake("He is known to exposed corruption.", "He is known to have exposed corruption.", "Perfect infinitive for earlier action.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 3 ═══════════

    private fun pe3() = base(14, "PE3 A difficult client", "انگلیسی کاربردی ۳ — مشتری دشوار",
        listOf(
            "Handle difficult customers",
            "Use diplomatic language",
            "Resolve conflicts professionally"
        ),
        listOf(
            v("complaint", "شکایت", "Lodge a complaint.", "شکایت ثبت کن."),
            v("refund", "بازپرداخت", "Request a refund.", "بازپرداخت درخواست کن."),
            v("policy", "سیاست", "Company policy.", "سیاست شرکت."),
            v("escalate", "بالا بردن", "Escalate the issue.", "مسئله را بالا ببر.", "verb"),
            v("acknowledge", "به رسمیت شناختن", "Acknowledge the problem.", "مشکل را به رسمیت بشناس.", "verb"),
            v("compensate", "جبران کردن", "Compensate the customer.", "مشتری را جبران کن.", "verb"),
            v("diplomatic", "دیپلماتیک", "A diplomatic response.", "پاسخ دیپلماتیک.", "adjective"),
            v("de-escalate", "کاهش تنش", "De-escalate the situation.", "وضعیت را آرام کن.", "verb"),
            v("retain", "حفظ کردن", "Retain customers.", "مشتریان را حفظ کن.", "verb"),
            v("goodwill", "حسن نیت", "A goodwill gesture.", "ژست حسن نیت.")
        ),
        listOf(
            GrammarSection("Diplomatic language", "I appreciate your frustration, but... I'm afraid that's against our policy."),
            GrammarSection("Softening bad news", "Unfortunately... I'm afraid... Regrettably... I wish I could, but..."),
            GrammarSection("Offering alternatives", "What I can do is... Would it help if...? Let me see what I can arrange.")
        ),
        listOf(
            d("A", "I'm extremely disappointed. This is the third time I've called about my order.", "فوق‌العاده ناامیدم. این سومین بار است که درباره سفارشم تماس می‌گیرم."),
            d("B", "I completely understand, and I sincerely apologize. Let me look into this for you right now.", "کاملاً می‌فهمم، و صمیمانه عذرخواهی می‌کنم. اجازه بدهید همین الان بررسی کنم."),
            d("A", "I ordered this two weeks ago. It should have arrived by now.", "دو هفته پیش سفارش دادم. باید تا حالا رسیده باشد."),
            d("B", "You're absolutely right. May I have your order number, please?", "کاملاً حق با شماست. می‌شود شماره سفارش‌تان را داشته باشم؟"),
            d("A", "It's 48712-B.", "۴۸۷۱۲-B."),
            d("B", "Thank you. I can see the delay was caused by a warehouse issue. That's our mistake entirely.", "ممنون. می‌بینم تأخیر به دلیل مشکل انبار بوده. کاملاً اشتباه ماست."),
            d("A", "So what are you going to do about it?", "پس چیکار می‌خواهید بکنید؟"),
            d("B", "I'd like to offer you two options. First, I can arrange express delivery for tomorrow morning.", "می‌خواهم دو گزینه پیشنهاد کنم. اول، می‌توانم تحویل اکسپرس برای فردا صبح ترتیب دهم."),
            d("A", "And the second?", "و دومی؟"),
            d("B", "I can issue a full refund, and you can reorder whenever you like.", "می‌توانم بازپرداخت کامل انجام دهم، و هر وقت خواستید دوباره سفارش دهید."),
            d("A", "I still want the item. But I want compensation for the inconvenience.", "هنوز کالا را می‌خواهم. ولی برای ناراحتی جبران می‌خواهم."),
            d("B", "That's a very reasonable request. I'm authorized to offer a 15% discount on your next order.", "درخواست کاملاً منطقی‌ای‌ست. مجازم ۱۵٪ تخفیف روی سفارش بعدی‌تان ارائه دهم."),
            d("A", "Make it 25% and I'll consider staying with your company.", "۲۵٪ کنید و در نظر می‌گیرم که با شرکتتان بمانم."),
            d("B", "Let me check with my supervisor. Would you mind holding for a moment?", "اجازه بدهید با سرپرستم چک کنم. می‌شود یک لحظه صبر کنید؟"),
            d("A", "Fine. But don't keep me waiting.", "باشه. ولی منتظرم نگذارید."),
            d("B", "Of course not. I'll be right back.", "البته که نه. همین الان برمی‌گردم."),
            d("A", "Alright. Thank you.", "بسیار خوب. ممنون.")
        ),
        listOf(
            q("What's the customer's problem?", listOf("wrong item", "delayed order", "overcharged"), 1),
            q("What does the customer want?", listOf("only refund", "express + compensation", "nothing"), 1),
            q("I wish I ___ help you more.", listOf("can", "could", "will"), 1),
            q("What I can ___ is offer a discount.", listOf("do", "doing", "did"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Look into", "بررسی کردن", "Let me look into it.", "بگذارید بررسی کنم."),
            IdiomExpression("Right back", "همین الان برگشتن", "I'll be right back.", "همین الان برمی‌گردم."),
            IdiomExpression("Goodwill gesture", "ژست حسن نیت", "As a goodwill gesture.", "به عنوان ژست حسن نیت.")
        ),
        pron = listOf(
            PronunciationTip("Empathetic tone", "Lower your pitch and slow down when dealing with complaints. Shows you care.")
        ),
        cult = listOf(
            CulturalNote("Customer service", "In the US, refunds are common and easy. In Japan, apologising is more elaborate. In Germany, policies are strictly followed.")
        ),
        mis = listOf(
            CommonMistake("I'm agree with you.", "I agree with you.", "No 'am' with agree."),
            CommonMistake("Let me to check.", "Let me check.", "No 'to' after let.")
        )
    )

    // ═══════════ REVIEW 3 ═══════════

    private fun rc56() = base(15, "R&C 5&6", "مرور ۵ و ۶",
        listOf("Review reporting verbs", "Review persuasive language", "Review complex passives"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("integrate", "ادغام کردن", "Integrate new skills.", "مهارت‌های جدید را ادغام کن.", "verb"),
            v("apply", "به کار بردن", "Apply what you've learned.", "آنچه یاد گرفته‌ای را به کار ببر.", "verb"),
            v("refine", "پالایش کردن", "Refine your understanding.", "درکت را پالایش کن.", "verb"),
            v("mastery", "تسلط", "Aim for mastery.", "به دنبال تسلط باش."),
            v("fluency", "روانی", "Build fluency.", "روانی بساز.")
        ),
        listOf(
            GrammarSection("Reporting verbs", "claim, deny, admit, insist, suggest, warn."),
            GrammarSection("Persuasive language", "You deserve... Everyone is buying... Limited time only."),
            GrammarSection("Complex passives", "It is said that... He is believed to... The story was being investigated.")
        ),
        listOf(
            d("T", "Files 5 and 6 review. Key topics?", "مرور فایل‌های ۵ و ۶. موضوعات کلیدی؟"),
            d("A", "Reporting verbs. He claimed that..., she denied doing...", "افعال نقل قول. He claimed that..., she denied doing..."),
            d("B", "And persuasive language in advertising.", "و زبان متقاعدکننده در تبلیغات."),
            d("T", "Give me an example of persuasive language.", "مثالی از زبان متقاعدکننده بزنید."),
            d("A", "You deserve this. Everyone is buying it. Don't miss out.", "You deserve this. Everyone is buying it. Don't miss out."),
            d("T", "Excellent. Complex passives?", "عالی. مجهول‌های پیچیده؟"),
            d("B", "It is said that the paper will close. He is believed to have leaked the documents.", "It is said that the paper will close. He is believed to have leaked the documents."),
            d("T", "Perfect. When do we use impersonal passives?", "عالی. کِی از مجهول‌های غیرشخصی استفاده می‌کنیم؟"),
            d("A", "When the source is unknown, obvious, or we want to sound objective.", "وقتی منبع نامعلوم، واضح، یا می‌خواهیم بی‌طرف به نظر برسیم."),
            d("T", "Very good. You're ready for File 7.", "خیلی خوب. برای فایل ۷ آماده‌اید."),
            d("B", "Great. Let's keep the momentum going.", "عالی. بیایید شتاب را حفظ کنیم."),
            d("T", "That's the spirit. Any final questions?", "همین روحیه. سؤال نهایی؟"),
            d("A", "When do we use 'deny' vs 'refuse'?", "کِی از 'deny' استفاده می‌کنیم در برابر 'refuse'؟"),
            d("T", "Deny = say something isn't true. Refuse = say you won't do something.", "Deny = گفتن اینکه چیزی درست نیست. Refuse = گفتن اینکه کاری را انجام نمی‌دهی."),
            d("B", "Got it. Thank you.", "فهمیدم. ممنون."),
            d("T", "You're very welcome.", "خواهش می‌کنم.")
        ),
        listOf(
            q("Which is a reporting verb?", listOf("deny", "refuse", "play"), 0),
            q("Which is persuasive?", listOf("You might like it", "You deserve it", "It's optional"), 1),
            q("He ___ to have leaked the documents.", listOf("is believed", "believes", "believing"), 0),
            q("She denied ___ the money.", listOf("take", "taking", "to take"), 1)
        ),
        idioms = listOf(IdiomExpression("That's the spirit", "همین روحیه", "That's the spirit.", "همین روحیه.")),
        pron = listOf(PronunciationTip("Reported speech", "Stress the reporting verb: He CLAIMED it. She DENIED it.")),
        cult = listOf(CulturalNote("Review", "Systematic review consolidates learning.")),
        mis = listOf(
            CommonMistake("He denied to take.", "He denied taking.", "Deny + gerund."),
            CommonMistake("She refused taking.", "She refused to take.", "Refuse + infinitive.")
        )
    )

    // ═══════════ FILE 4 — Society and change ═══════════

    private fun f4A() = base(16, "4A Social inequality", "۴A نابرابری اجتماعی",
        listOf(
            "Use relative clauses with quantifiers",
            "Discuss social issues",
            "Express empathy and concern"
        ),
        listOf(
            v("inequality", "نابرابری", "Social inequality.", "نابرابری اجتماعی."),
            v("privilege", "امتیاز", "Privilege and power.", "امتیاز و قدرت."),
            v("disadvantaged", "محروم", "Disadvantaged communities.", "جوامع محروم.", "adjective"),
            v("opportunity", "فرصت", "Equal opportunities.", "فرصت‌های برابر."),
            v("gap", "شکاف", "The wealth gap.", "شکاف ثروت."),
            v("upward mobility", "تحرک اجتماعی صعودی", "Limited upward mobility.", "تحرک اجتماعی صعودی محدود."),
            v("systemic", "سیستمی", "Systemic problems.", "مشکلات سیستمی.", "adjective"),
            v("empower", "توانمند کردن", "Empower communities.", "جوامع را توانمند کن.", "verb"),
            v("marginalize", "به حاشیه راندن", "Marginalized groups.", "گروه‌های به حاشیه رانده شده.", "verb"),
            v("affluent", "ثروتمند", "Affluent neighborhoods.", "محله‌های ثروتمند.", "adjective"),
            v("deprived", "محروم", "Deprived areas.", "مناطق محروم.", "adjective"),
            v("access", "دسترسی", "Access to education.", "دسترسی به آموزش.")
        ),
        listOf(
            GrammarSection("Relative clauses with quantifiers", "Many of whom... Some of which... All of whom..."),
            GrammarSection("Non-defining relatives", "The richest 1%, who own half the world's wealth..."),
            GrammarSection("Reduced relatives", "People living in poverty. Children born into disadvantage.")
        ),
        listOf(
            d("A", "Do you think social inequality is getting worse?", "فکر می‌کنی نابرابری اجتماعی در حال بدتر شدن است؟"),
            d("B", "In many countries, yes. The gap between rich and poor has widened dramatically.", "در بسیاری از کشورها، بله. شکاف بین غنی و فقیر به طور چشمگیری افزایش یافته."),
            d("A", "What's driving it?", "چه چیزی آن را هدایت می‌کند؟"),
            d("B", "Many factors. Technology, globalization, and tax policies that favor the wealthy.", "عوامل زیادی. فناوری، جهانی‌سازی، و سیاست‌های مالیاتی که ثروتمندان را ترجیح می‌دهند."),
            d("A", "Some say inequality motivates people to work harder.", "بعضی می‌گویند نابرابری مردم را برای سخت‌تر کار کردن انگیزه می‌دهد."),
            d("B", "That argument assumes everyone starts from the same place, which they clearly don't.", "این استدلال فرض می‌کند همه از یک نقطه شروع می‌کنند، که واضح است نمی‌کنند."),
            d("A", "Can you give an example?", "مثالی می‌زنی؟"),
            d("B", "Sure. Children born into affluent families, most of whom have access to private tutors, will always have an advantage.", "حتماً. کودکانی که در خانواده‌های ثروتمند متولد می‌شوند، که بیشترشان به معلم خصوصی دسترسی دارند، همیشه مزیت خواهند داشت."),
            d("A", "So how do we fix it?", "پس چطور درستش کنیم؟"),
            d("B", "Invest in public education. Provide healthcare for all. Make the tax system fairer.", "روی آموزش عمومی سرمایه‌گذاری کن. مراقبت‌های بهداشتی برای همه فراهم کن. سیستم مالیاتی را منصفانه‌تر کن."),
            d("A", "These sound like socialist ideas.", "به نظر ایده‌های سوسیالیستی می‌آیند."),
            d("B", "Perhaps. But even conservative economists now admit that extreme inequality harms growth.", "شاید. ولی حتی اقتصاددانان محافظه‌کار الان اعتراف می‌کنند که نابرابری شدید به رشد آسیب می‌زند."),
            d("A", "Do you think things will improve?", "فکر می‌کنی شرایط بهتر می‌شود؟"),
            d("B", "I'm cautiously optimistic. Young people, many of whom are politically active, are pushing for change.", "با احتیاط خوش‌بینم. جوانان، که بسیاری‌شان سیاسی فعالند، به دنبال تغییرند."),
            d("A", "What can individuals do?", "افراد چیکار می‌توانند بکنند؟"),
            d("B", "Vote. Volunteer. Support organizations working on these issues. And be aware of your own privilege.", "رأی بده. داوطلب شو. از سازمان‌هایی که روی این مسائل کار می‌کنند حمایت کن. و از امتیاز خودت آگاه باش."),
            d("A", "That's a good starting point.", "نقطه شروع خوبی‌ست."),
            d("B", "It is. Change starts with awareness.", "هست. تغییر با آگاهی شروع می‌شود.")
        ),
        listOf(
            q("What has widened dramatically?", listOf("population", "wealth gap", "education"), 1),
            q("What does B recommend?", listOf("cut taxes", "invest in public education", "reduce immigration"), 1),
            q("The richest 1%, ___ own half the wealth...", listOf("who", "which", "whose"), 0),
            q("Children born into affluent families, most of ___ have tutors...", listOf("who", "which", "whom"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Start from the same place", "از یک نقطه شروع کردن", "Everyone starts from the same place.", "همه از یک نقطه شروع می‌کنند."),
            IdiomExpression("Push for change", "به دنبال تغییر بودن", "Pushing for change.", "به دنبال تغییر بودن.")
        ),
        pron = listOf(PronunciationTip("Relative clauses", "Pause around non-defining relatives: The richest 1%, | who own half the wealth, | ...")),
        cult = listOf(
            CulturalNote("Inequality", "Scandinavian countries have lower inequality due to strong welfare systems. The US has among the highest inequality in developed nations.")
        ),
        mis = listOf(
            CommonMistake("Many of who are poor.", "Many of whom are poor.", "Whom after preposition."),
            CommonMistake("Children which are poor.", "Children who are poor.", "Who for people.")
        )
    )

    private fun f4B() = base(17, "4B Migration and identity", "۴B مهاجرت و هویت",
        listOf(
            "Use participle clauses",
            "Discuss identity and belonging",
            "Express complex ideas concisely"
        ),
        listOf(
            v("migration", "مهاجرت", "Global migration.", "مهاجرت جهانی."),
            v("immigrant", "مهاجر", "An immigrant family.", "خانواده مهاجر."),
            v("refugee", "پناهنده", "Refugees fleeing war.", "پناهندگان فراری از جنگ."),
            v("assimilate", "جذب شدن", "Assimilate into a new culture.", "در فرهنگ جدید جذب شو.", "verb"),
            v("integrate", "ادغام شدن", "Integrate into society.", "در جامعه ادغام شو.", "verb"),
            v("heritage", "میراث", "Cultural heritage.", "میراث فرهنگی."),
            v("identity", "هویت", "A sense of identity.", "حس هویت."),
            v("belonging", "تعلق", "A sense of belonging.", "حس تعلق."),
            v("dual", "دوگانه", "Dual nationality.", "تابعیت دوگانه.", "adjective"),
            v("uprooted", "از ریشه کنده", "Feeling uprooted.", "احساس از ریشه کنده شدن.", "adjective"),
            v("nostalgia", "نوستالژی", "Nostalgia for home.", "نوستالژی برای خانه."),
            v("culture shock", "شوک فرهنگی", "Experiencing culture shock.", "تجربه شوک فرهنگی.")
        ),
        listOf(
            GrammarSection("Participle clauses", "Having moved to a new country, she felt lost. Feeling homesick, he called his mother."),
            GrammarSection("Perfect participle", "Having lived abroad for years, I understand both cultures."),
            GrammarSection("Reduced relatives", "The people living abroad. The children raised bilingual.")
        ),
        listOf(
            d("A", "Where are you originally from?", "اصالتاً اهل کجایی؟"),
            d("B", "Iran, but I've lived in Canada for twelve years now.", "ایران، ولی دوازده سال است که در کانادا زندگی می‌کنم."),
            d("A", "Do you feel more Iranian or Canadian?", "بیشتر ایرانی حس می‌کنی یا کانادایی؟"),
            d("B", "Both, honestly. Having grown up in Iran but built my life in Canada, I feel dual.", "راستش هر دو. چون در ایران بزرگ شدم ولی زندگی‌ام را در کانادا ساختم، دوگانه حس می‌کنم."),
            d("A", "Is that difficult?", "سخت است؟"),
            d("B", "Sometimes. Feeling caught between two worlds, you never fully belong to either.", "گاهی. حس گرفتار بودن بین دو دنیا، هرگز کاملاً به هیچ‌کدام تعلق نداری."),
            d("A", "Do you ever feel uprooted?", "هرگز حس از ریشه کنده شدن داری؟"),
            d("B", "Often, especially in the first few years. Having left everything behind, I felt lost.", "اغلب، مخصوصاً در چند سال اول. چون همه چیز را پشت سر گذاشته بودم، گمشده حس می‌کردم."),
            d("A", "How did you cope?", "چطور کنار آمدی؟"),
            d("B", "By building community. Finding other immigrants who understood what I was going through.", "با ساختن جامعه. پیدا کردن مهاجران دیگری که می‌فهمیدند از چه چیزی می‌گذرم."),
            d("A", "Do your children speak Persian?", "فرزندانت فارسی صحبت می‌کنند؟"),
            d("B", "They understand it, but they answer in English. It's hard to maintain a language in a new country.", "می‌فهمند، ولی به انگلیسی جواب می‌دهند. حفظ زبان در کشور جدید سخت است."),
            d("A", "Do you worry about losing your heritage?", "نگران از دست دادن میراثت هستی؟"),
            d("B", "Constantly. Celebrating Nowruz helps — it reminds them where they come from.", "مدام. جشن گرفتن نوروز کمک می‌کند — به آن‌ها یادآوری می‌کند از کجا آمده‌اند."),
            d("A", "Do you ever think about moving back?", "هرگز به برگشتن فکر می‌کنی؟"),
            d("B", "Sometimes. But having put down roots here, it's complicated.", "گاهی. ولی چون اینجا ریشه دوانده‌ام، پیچیده است."),
            d("A", "What do you miss most about Iran?", "بیشتر از همه چیزی از ایران دلت می‌گیرد؟"),
            d("B", "The food, the music, the warmth of people. But most of all, the sense of ease.", "غذا، موسیقی، گرمی مردم. ولی بیشتر از همه، حس راحتی."),
            d("A", "Do you feel Canadian now?", "الان کانادایی حس می‌کنی؟"),
            d("B", "Partially. Having spent my adult life here, yes. But Iran will always be home.", "تا حدی. چون زندگی بزرگسالی‌ام را اینجا گذرانده‌ام، بله. ولی ایران همیشه خانه خواهد بود."),
            d("A", "That's a beautiful way to see it.", "روش قشنگی برای دیدن آن است."),
            d("B", "It's the only way I can see it. Otherwise, I'd be constantly grieving.", "تنها راهی‌ست که می‌توانم آن را ببینم. وگرنه، مدام سوگوار می‌بودم.")
        ),
        listOf(
            q("How long has B lived in Canada?", listOf("5 years", "12 years", "20 years"), 1),
            q("How does B feel?", listOf("purely Iranian", "purely Canadian", "dual"), 2),
            q("___ moved to a new country, she felt lost.", listOf("Have", "Having", "Has"), 1),
            q("___ lived abroad for years, I understand both cultures.", listOf("Have", "Having", "Has"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Caught between two worlds", "گرفتار بین دو دنیا", "Caught between two worlds.", "گرفتار بین دو دنیا."),
            IdiomExpression("Put down roots", "ریشه دواندن", "I've put down roots here.", "اینجا ریشه دوانده‌ام."),
            IdiomExpression("Go through", "از سر گذراندن", "What I was going through.", "چیزی که از سر می‌گذراندم.")
        ),
        pron = listOf(
            PronunciationTip("Participle clauses", "The -ing form is unstressed: HAVing grown up in Iran... The stress is on the main clause.")
        ),
        cult = listOf(
            CulturalNote("Diaspora", "Over 280 million people live outside their country of birth. Identity is often complex for second-generation immigrants.")
        ),
        mis = listOf(
            CommonMistake("Having move to a new country, ...", "Having moved to a new country, ...", "Past participle after having."),
            CommonMistake("Feeling homesick, he called to his mother.", "Feeling homesick, he called his mother.", "No 'to' with call.")
        )
    )

    private fun f4C() = base(18, "4C Protest and activism", "۴C اعتراض و کنش‌گری",
        listOf(
            "Use inversion for emphasis",
            "Discuss social movements",
            "Express strong opinions diplomatically"
        ),
        listOf(
            v("protest", "اعتراض", "A peaceful protest.", "اعتراض مسالمت‌آمیز."),
            v("activist", "فعال", "A climate activist.", "فعال اقلیمی."),
            v("demonstrate", "تظاهرات کردن", "Demonstrate peacefully.", "مسالمت‌آمیز تظاهرات کن.", "verb"),
            v("solidarity", "همبستگی", "Show solidarity.", "همبستگی نشان بده."),
            v("reform", "اصلاحات", "Push for reform.", "برای اصلاحات فشار بیاور."),
            v("petition", "طومار", "Sign a petition.", "طومار را امضا کن."),
            v("movement", "جنبش", "A social movement.", "جنبش اجتماعی."),
            v("grassroots", "مردمی", "Grassroots activism.", "کنش‌گری مردمی.", "adjective"),
            v("disobedience", "نافرمانی", "Civil disobedience.", "نافرمانی مدنی."),
            v("radical", "رادیکال", "Radical change.", "تغییر رادیکال.", "adjective"),
            v("moderate", "معتدل", "Moderate demands.", "خواسته‌های معتدل.", "adjective"),
            v("suppress", "سرکوب کردن", "Suppress dissent.", "مخالفت را سرکوب کن.", "verb")
        ),
        listOf(
            GrammarSection("Inversion for emphasis", "Never have I seen... Rarely do we... Only then did I realize... Little did they know..."),
            GrammarSection("Inversion with conditionals", "Had I known, I would have acted. Were I in charge, I would..."),
            GrammarSection("Inversion after negatives", "Not only... but also. No sooner... than. Under no circumstances...")
        ),
        listOf(
            d("A", "Do you think protests actually change anything?", "فکر می‌کنی اعتراضات واقعاً چیزی را تغییر می‌دهند؟"),
            d("B", "History suggests they do. Rarely do major reforms happen without pressure from below.", "تاریخ نشان می‌دهد بله. به ندرت اصلاحات بزرگ بدون فشار از پایین اتفاق می‌افتند."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Civil rights, women's suffrage, workers' rights — none of these were given freely.", "حقوق مدنی، حق رأی زنان، حقوق کارگران — هیچ‌کدام آزادانه داده نشدند."),
            d("A", "But some protests turn violent.", "ولی بعضی اعتراضات به خشونت می‌کشند."),
            d("B", "True, and violence usually undermines the cause. Only peaceful movements tend to gain widespread support.", "درسته، و خشونت معمولاً به هدف آسیب می‌زند. فقط جنبش‌های مسالمت‌آمیز تمایل دارند حمایت گسترده کسب کنند."),
            d("A", "Do you think civil disobedience is justified?", "فکر می‌کنی نافرمانی مدنی موجه است؟"),
            d("B", "Sometimes. Not only is it sometimes necessary, but it has a long tradition — Gandhi, Martin Luther King Jr.", "گاهی. نه تنها گاهی لازم است، بلکه سنت طولانی دارد — گاندی، مارتین لوتر کینگ جونیور."),
            d("A", "What about climate activism?", "کنش‌گری اقلیمی چطور؟"),
            d("B", "Under no circumstances can we ignore the climate crisis. Young activists are right to demand action.", "تحت هیچ شرایطی نمی‌توانیم بحران اقلیمی را نادیده بگیریم. فعالان جوان در مطالبه اقدام حق دارند."),
            d("A", "Some say they're too radical.", "بعضی می‌گویند خیلی رادیکالند."),
            d("B", "Had they been more moderate, would anyone have listened? Probably not.", "اگر معتدل‌تر بودند، کسی گوش می‌داد؟ احتمالاً نه."),
            d("A", "Do you think governments should suppress disruptive protests?", "فکر می‌کنی دولت‌ها باید اعتراضات مخل را سرکوب کنند؟"),
            d("B", "No sooner does a government suppress peaceful protest than it loses legitimacy.", "دولتی به محض سرکوب اعتراض مسالمت‌آمیز، مشروعیت خود را از دست می‌دهد."),
            d("A", "Strong words. Have you ever participated in a protest?", "حرف‌های قوی. هرگز در اعتراضی شرکت کرده‌ای؟"),
            d("B", "Yes, several. Were I younger, I'd probably do even more.", "بله، چندین. اگر جوان‌تر بودم، احتمالاً بیشتر هم می‌کردم."),
            d("A", "Does activism give you hope?", "کنش‌گری بهت امید می‌دهد؟"),
            d("B", "Absolutely. Little did I know, when I joined my first march, how many lifelong friends I'd make.", "قطعاً. وقتی در اولین راهپیمایی‌ام شرکت کردم، نمی‌دانستم چقدر دوست مادام‌العمر پیدا خواهم کرد."),
            d("A", "That's a lovely way to put it.", "بیان قشنگی‌ست."),
            d("B", "Not only is activism about politics — it's also about community.", "کنش‌گری نه تنها درباره سیاست است — درباره جامعه هم هست.")
        ),
        listOf(
            q("What does B say about peaceful protests?", listOf("useless", "gain support", "dangerous"), 1),
            q("Which movements does B mention?", listOf("only climate", "civil rights, women, workers", "sports"), 1),
            q("Never ___ I seen such courage.", listOf("have", "had", "did"), 0),
            q("Had I ___, I would have acted.", listOf("know", "knew", "known"), 2)
        ),
        idioms = listOf(
            IdiomExpression("From below", "از پایین", "Pressure from below.", "فشار از پایین."),
            IdiomExpression("Undermine the cause", "به هدف آسیب زدن", "Violence undermines the cause.", "خشونت به هدف آسیب می‌زند."),
            IdiomExpression("Lose legitimacy", "مشروعیت از دست دادن", "It loses legitimacy.", "مشروعیت از دست می‌دهد.")
        ),
        pron = listOf(
            PronunciationTip("Inversion", "Stress the auxiliary in inversions: NEVER have I seen. RARELY do we.")
        ),
        cult = listOf(
            CulturalNote("Protest rights", "In many democracies, peaceful protest is a constitutional right. In some countries, it's heavily restricted.")
        ),
        mis = listOf(
            CommonMistake("Never I have seen.", "Never have I seen.", "Invert after negative adverbial."),
            CommonMistake("If I had known, I would act.", "Had I known, I would have acted.", "Formal inversion for past conditional.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 4 ═══════════

    private fun pe4() = base(19, "PE4 A medical emergency", "انگلیسی کاربردی ۴ — اورژانس پزشکی",
        listOf(
            "Handle medical emergencies",
            "Describe symptoms clearly",
            "Communicate with medical staff"
        ),
        listOf(
            v("emergency", "اورژانس", "A medical emergency.", "اورژانس پزشکی."),
            v("ambulance", "آمبولانس", "Call an ambulance.", "آمبولانس خبر کن."),
            v("unconscious", "بی‌هوش", "He was unconscious.", "او بی‌هوش بود.", "adjective"),
            v("bleeding", "خونریزی", "Severe bleeding.", "خونریزی شدید."),
            v("allergic", "حساس", "Allergic reaction.", "واکنش حساسیتی.", "adjective"),
            v("fracture", "شکستگی", "A fracture in the arm.", "شکستگی در بازو."),
            v("symptom", "علامت", "Describe the symptoms.", "علائم را توصیف کن."),
            v("diagnosis", "تشخیص", "A correct diagnosis.", "تشخیص درست."),
            v("treatment", "درمان", "Immediate treatment.", "درمان فوری."),
            v("chronic", "مزمن", "Chronic condition.", "وضعیت مزمن.", "adjective"),
            v("prescription", "نسخه", "Write a prescription.", "نسخه بنویس."),
            v("recovery", "بهبودی", "Full recovery.", "بهبودی کامل.")
        ),
        listOf(
            GrammarSection("Describing symptoms", "I've been having sharp pains. It hurts when I breathe. I feel dizzy."),
            GrammarSection("Past continuous for onset", "I was walking when I felt a sharp pain."),
            GrammarSection("Polite but urgent requests", "Could you help me, please? I need you to call an ambulance. It's urgent.")
        ),
        listOf(
            d("A", "911, what's your emergency?", "۹۱۱، اورژانس شما چیست؟"),
            d("B", "Please help. My father collapsed. He's unconscious.", "لطفاً کمک کنید. پدرم از حال رفت. بی‌هوش است."),
            d("A", "Where are you? What's the address?", "کجایید؟ آدرس چیه؟"),
            d("B", "42 Oak Street, apartment 3B. Please hurry.", "۴۲ خیابان اوک، آپارتمان ۳B. لطفاً عجله کنید."),
            d("A", "Is he breathing?", "نفس می‌کشد؟"),
            d("B", "Yes, but barely. He was complaining of chest pain earlier, and then he just collapsed.", "بله، ولی به سختی. قبلاً از درد قفسه سینه شکایت داشت، و بعد ناگهان از حال رفت."),
            d("A", "Does he have any medical conditions?", "شرایط پزشکی خاصی دارد؟"),
            d("B", "He has high blood pressure. He takes medication for it.", "فشار خون بالا دارد. برایش دارو می‌خورد."),
            d("A", "Any allergies?", "حساسیتی دارد؟"),
            d("B", "Not that I know of. But he's allergic to penicillin, I think.", "تا آنجا که می‌دانم نه. ولی فکر می‌کنم به پنی‌سیلین حساسیت دارد."),
            d("A", "Good, that's important. An ambulance is on its way. It should be there in five minutes.", "خوبه، مهم است. آمبولانس در راه است. باید تا پنج دقیقه دیگر برسد."),
            d("B", "What should I do while I wait?", "در حین انتظار چیکار کنم؟"),
            d("A", "Keep him lying down. Loosen any tight clothing. Don't give him anything to eat or drink.", "او را دراز نگه دار. هر لباس تنگی را شل کن. چیزی برای خوردن یا نوشیدن نده."),
            d("B", "Should I try to wake him?", "باید بیدارش کنم؟"),
            d("A", "No, don't shake him. Just monitor his breathing. If he stops breathing, start CPR.", "نه، تکانش نده. فقط تنفسش را پایش کن. اگر نفس نکشید، CPR را شروع کن."),
            d("B", "I don't know how to do CPR.", "CPR را نمی‌دانم چطور انجام دهم."),
            d("A", "Stay on the line. I'll guide you through it if necessary.", "روی خط بمان. اگر لازم شد راهنمایی‌ات می‌کنم."),
            d("B", "OK. Please, just hurry.", "باشه. لطفاً، فقط عجله کنید."),
            d("A", "The ambulance is arriving now. I can hear the siren. You'll be fine.", "آمبولانس الان می‌رسد. صدای آژیر را می‌شنوم. حالتان خوب خواهد شد."),
            d("B", "Thank you. Thank you so much.", "ممنون. خیلی ممنون.")
        ),
        listOf(
            q("What happened to B's father?", listOf("fell", "collapsed", "cut himself"), 1),
            q("What medical condition does he have?", listOf("diabetes", "high blood pressure", "asthma"), 1),
            q("He was ___ when he felt the pain.", listOf("walk", "walking", "walked"), 1),
            q("Could you ___ me, please?", listOf("help", "helping", "to help"), 0)
        ),
        idioms = listOf(
            IdiomExpression("On its way", "در راه", "The ambulance is on its way.", "آمبولانس در راه است."),
            IdiomExpression("Stay on the line", "روی خط بمان", "Stay on the line.", "روی خط بمان."),
            IdiomExpression("Guide through", "راهنمایی کردن", "I'll guide you through it.", "راهنمایی‌ات می‌کنم.")
        ),
        pron = listOf(
            PronunciationTip("Emergency call", "Speak clearly and slowly. Give key info: address, condition, breathing.")
        ),
        cult = listOf(
            CulturalNote("Emergency numbers", "911 in US/Canada, 999 in UK, 112 in EU, 110 in Iran. Always know the local number.")
        ),
        mis = listOf(
            CommonMistake("He is unconscious since an hour.", "He's been unconscious for an hour.", "Use present perfect for duration."),
            CommonMistake("I don't know to do CPR.", "I don't know how to do CPR.", "Know how + infinitive.")
        )
    )

    // ═══════════ REVIEW 4 ═══════════

    private fun rc78() = base(20, "R&C 7&8", "مرور ۷ و ۸",
        listOf("Review relative clauses", "Review participle clauses", "Review inversion"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("synthesize", "ترکیب کردن", "Synthesize your knowledge.", "دانشت را ترکیب کن.", "verb"),
            v("apply", "به کار بردن", "Apply the rules.", "قوانین را به کار ببر.", "verb"),
            v("accuracy", "دقت", "Accuracy matters.", "دقت مهم است."),
            v("fluency", "روانی", "Develop fluency.", "روانی را توسعه بده."),
            v("mastery", "تسلط", "Aim for mastery.", "به دنبال تسلط باش.")
        ),
        listOf(
            GrammarSection("Relative clauses with quantifiers", "many of whom, some of which, all of whom."),
            GrammarSection("Participle clauses", "Having moved abroad... Feeling homesick..."),
            GrammarSection("Inversion", "Never have I... Rarely do we... Had I known...")
        ),
        listOf(
            d("T", "Let's review the last two files.", "بیایید دو فایل آخر را مرور کنیم."),
            d("A", "We studied relative clauses with quantifiers. Many of whom, some of which.", "بندهای موصولی با کمیت‌سنج‌ها مطالعه کردیم. Many of whom, some of which."),
            d("B", "And participle clauses. Having lived abroad, I understand both cultures.", "و بندهای وجه وصفی. Having lived abroad, I understand both cultures."),
            d("T", "Inversion?", "وارونگی؟"),
            d("A", "Never have I seen such a beautiful place. Rarely do we get such opportunities.", "Never have I seen such a beautiful place. Rarely do we get such opportunities."),
            d("B", "Had I known, I would have acted differently.", "Had I known, I would have acted differently."),
            d("T", "When do we use inversion?", "کِی از وارونگی استفاده می‌کنیم؟"),
            d("A", "After negative or limiting adverbials, for emphasis.", "بعد از قیدهای منفی یا محدودکننده، برای تأکید."),
            d("T", "Excellent. You're ready for File 9.", "عالی. برای فایل ۹ آماده‌اید."),
            d("B", "Great. We're making real progress.", "عالی. پیشرفت واقعی داریم."),
            d("T", "You are. Any questions?", "دارید. سؤالی؟"),
            d("A", "One thing. When do we use 'whom' vs 'who'?", "یک چیز. کِی از 'whom' استفاده می‌کنیم در برابر 'who'؟"),
            d("T", "Whom is more formal, especially after prepositions: many of whom.", "Whom رسمی‌تر است، مخصوصاً بعد از حروف اضافه: many of whom."),
            d("B", "Got it. Thanks.", "فهمیدم. ممنون."),
            d("T", "You're welcome. See you next time.", "خواهش می‌کنم. دفعه بعد می‌بینمتان.")
        ),
        listOf(
            q("After which adverbials do we invert?", listOf("positive", "negative", "any"), 1),
            q("Which is more formal?", listOf("who", "whom", "that"), 1),
            q("Never ___ I seen such a place.", listOf("have", "had", "did"), 0),
            q("Many of ___ are poor.", listOf("who", "which", "whom"), 2)
        ),
        idioms = listOf(IdiomExpression("Make progress", "پیشرفت کردن", "We're making real progress.", "پیشرفت واقعی داریم.")),
        pron = listOf(PronunciationTip("Inversion", "Stress the auxiliary: NEVER have I. RARELY do we.")),
        cult = listOf(CulturalNote("Review", "Regular review cements advanced structures.")),
        mis = listOf(
            CommonMistake("Never I have seen.", "Never have I seen.", "Invert after negative."),
            CommonMistake("Many of who are here.", "Many of whom are here.", "Whom after preposition.")
        )
    )

    // ═══════════ FILE 5 — Science and innovation ═══════════

    private fun f5A() = base(21, "5A Scientific discoveries", "۵A کشف‌های علمی",
        listOf(
            "Use passive voice in formal writing",
            "Discuss scientific breakthroughs",
            "Explain complex ideas simply"
        ),
        listOf(
            v("breakthrough", "پیشرفت بزرگ", "A medical breakthrough.", "پیشرفت بزرگ پزشکی."),
            v("hypothesis", "فرضیه", "Test the hypothesis.", "فرضیه را آزمایش کن."),
            v("experiment", "آزمایش", "Conduct an experiment.", "آزمایش انجام بده."),
            v("evidence", "شواهد", "Strong evidence.", "شواهد قوی."),
            v("discovery", "کشف", "A revolutionary discovery.", "کشف انقلابی."),
            v("research", "تحقیق", "Conduct research.", "تحقیق انجام بده."),
            v("significant", "قابل توجه", "A significant finding.", "یافته قابل توجه.", "adjective"),
            v("revolutionary", "انقلابی", "A revolutionary technology.", "فناوری انقلابی.", "adjective"),
            v("theory", "نظریه", "Scientific theory.", "نظریه علمی."),
            v("prove", "اثبات کردن", "Prove the theory.", "نظریه را اثبات کن.", "verb"),
            v("phenomenon", "پدیده", "A natural phenomenon.", "پدیده طبیعی."),
            v("peer review", "داوری همتا", "Peer-reviewed research.", "تحقیق داوری‌شده.")
        ),
        listOf(
            GrammarSection("Passive in formal writing", "The experiment was conducted over three years. The results have been verified."),
            GrammarSection("Passive with modals", "The hypothesis must be tested. Results should be replicated."),
            GrammarSection("Impersonal passive", "It has been demonstrated that... It is widely accepted that...")
        ),
        listOf(
            d("A", "What do you think is the most important scientific discovery of all time?", "فکر می‌کنی مهم‌ترین کشف علمی تاریخ چیه؟"),
            d("B", "That's impossible to answer definitively. It depends on how we define 'important'.", "غیرممکن است قطعی جواب داد. بستگی دارد چگونه 'مهم' را تعریف کنیم."),
            d("A", "Fair enough. What about in the last fifty years?", "منصفانه. در پنجاه سال گذشته چطور؟"),
            d("B", "I'd argue it's the discovery of DNA's structure, though that was slightly earlier.", "استدلال می‌کنم کشف ساختار DNA است، هرچند کمی قبل‌تر بود."),
            d("A", "Why DNA?", "چرا DNA؟"),
            d("B", "Because it's been shown to underpin all of biology. Modern medicine depends on it.", "چون نشان داده شده که زیربنای تمام زیست‌شناسی است. پزشکی مدرن به آن وابسته است."),
            d("A", "What about more recent breakthroughs?", "پیشرفت‌های اخیرتر چطور؟"),
            d("B", "CRISPR gene editing is revolutionary. It's being used to treat genetic diseases.", "ویرایش ژن CRISPR انقلابی است. برای درمان بیماری‌های ژنتیکی استفاده می‌شود."),
            d("A", "Are there ethical concerns?", "نگرانی‌های اخلاقی هست؟"),
            d("B", "Absolutely. It must be regulated carefully. The power to edit genes can be misused.", "قطعاً. باید با دقت تنظیم شود. قدرت ویرایش ژن‌ها می‌تواند سوءاستفاده شود."),
            d("A", "Do you think scientists should be more transparent?", "فکر می‌کنی دانشمندان باید شفاف‌تر باشند؟"),
            d("B", "Definitely. Research must be published and peer-reviewed. That's how trust is built.", "قطعاً. تحقیق باید منتشر و داوری شود. اعتماد این‌گونه ساخته می‌شود."),
            d("A", "What about science denial?", "انکار علم چطور؟"),
            d("B", "It's dangerous. It's been demonstrated repeatedly that vaccines save lives, yet denial persists.", "خطرناک است. بارها نشان داده شده که واکسن‌ها جان‌ها را نجات می‌دهند، ولی انکار ادامه دارد."),
            d("A", "Why do people deny science?", "چرا مردم علم را انکار می‌کنند؟"),
            d("B", "Many reasons. Mistrust, ideology, lack of understanding. It's complex.", "دلایل زیاد. بی‌اعتمادی، ایدئولوژی، کمبود درک. پیچیده است."),
            d("A", "What can be done?", "چیکار می‌شود کرد؟"),
            d("B", "Science communication should be improved. Scientists must learn to explain things simply.", "ارتباطات علمی باید بهبود یابد. دانشمندان باید یاد بگیرند ساده توضیح دهند."),
            d("A", "Do you follow science news?", "اخبار علمی دنبال می‌کنی؟"),
            d("B", "Constantly. It's been a lifelong passion of mine.", "مدام. اشتیاق تمام عمرم بوده."),
            d("A", "That's inspiring.", "الهام‌بخشه.")
        ),
        listOf(
            q("What does B consider the most important discovery?", listOf("electricity", "DNA", "internet"), 1),
            q("What's a recent breakthrough?", listOf("CRISPR", "penicillin", "x-rays"), 0),
            q("The experiment ___ conducted over three years.", listOf("was", "were", "is"), 0),
            q("It ___ been demonstrated that vaccines save lives.", listOf("is", "has", "was"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Fair enough", "منصفانه", "Fair enough.", "منصفانه."),
            IdiomExpression("Underpin", "زیربنا بودن", "Underpin all of biology.", "زیربنای تمام زیست‌شناسی."),
            IdiomExpression("Lifelong passion", "اشتیاق تمام عمر", "A lifelong passion.", "اشتیاق تمام عمر.")
        ),
        pron = listOf(
            PronunciationTip("Passive in science", "Stress the past participle: The experiment was conDUCted. Results have been VERified.")
        ),
        cult = listOf(
            CulturalNote("Science communication", "Trust in science varies by country. Nordic countries have high trust, others less so.")
        ),
        mis = listOf(
            CommonMistake("The experiment was conduct.", "The experiment was conducted.", "Past participle."),
            CommonMistake("Results should replicated.", "Results should be replicated.", "Don't drop 'be'.")
        )
    )

    private fun f5B() = base(22, "5B Technology and ethics", "۵B فناوری و اخلاق",
        listOf(
            "Use complex conditionals",
            "Discuss ethical dilemmas",
            "Weigh pros and cons"
        ),
        listOf(
            v("ethical", "اخلاقی", "Ethical dilemma.", "دوراهی اخلاقی.", "adjective"),
            v("dilemma", "دوراهی", "A moral dilemma.", "دوراهی اخلاقی."),
            v("surveillance", "نظارت", "Mass surveillance.", "نظارت جمعی."),
            v("autonomous", "خودمختار", "Autonomous vehicles.", "خودروهای خودمختار.", "adjective"),
            v("algorithm", "الگوریتم", "A biased algorithm.", "الگوریتم سوگیرانه."),
            v("privacy", "حریم خصوصی", "Invasion of privacy.", "نقض حریم خصوصی."),
            v("consent", "رضایت", "Informed consent.", "رضایت آگاهانه."),
            v("transparency", "شفافیت", "Algorithmic transparency.", "شفافیت الگوریتمی."),
            v("accountable", "پاسخگو", "Hold companies accountable.", "شرکت‌ها را پاسخگو کن.", "adjective"),
            v("regulate", "تنظیم کردن", "Regulate AI.", "هوش مصنوعی را تنظیم کن.", "verb"),
            v("bias", "سوگیری", "Racial bias in AI.", "سوگیری نژادی در هوش مصنوعی."),
            v("responsible", "مسئول", "Responsible innovation.", "نوآوری مسئولانه.", "adjective")
        ),
        listOf(
            GrammarSection("Mixed conditionals", "If I had studied computer science, I would be working in AI now."),
            GrammarSection("Third conditional", "If we had regulated earlier, we wouldn't have this problem."),
            GrammarSection("Unless / Provided that", "Unless we act now, it will be too late. Provided that safeguards exist, it's acceptable.")
        ),
        listOf(
            d("A", "Do you worry about the ethics of new technology?", "نگران اخلاقیات فناوری جدید هستی؟"),
            d("B", "Constantly. If I had known twenty years ago how fast AI would develop, I'd have been more worried.", "مدام. اگر بیست سال پیش می‌دانستم هوش مصنوعی چقدر سریع رشد می‌کند، نگران‌تر می‌شدم."),
            d("A", "What worries you most?", "بیشتر چه چیزی نگرانت می‌کند؟"),
            d("B", "Surveillance, mostly. If we had regulated it earlier, we wouldn't be in this situation now.", "بیشتر نظارت. اگر زودتر تنظیمش کرده بودیم، الان در این وضعیت نبودیم."),
            d("A", "Are you against all surveillance?", "مخالف تمام نظارت‌ها هستی؟"),
            d("B", "No, that's unrealistic. Provided that safeguards exist, some surveillance is acceptable.", "نه، غیرواقعی است. تا زمانی که محافظ وجود داشته باشد، بعضی نظارت‌ها قابل قبولند."),
            d("A", "What kind of safeguards?", "چه نوع محافظ‌هایی؟"),
            d("B", "Judicial oversight. Transparency. Strict limits on data collection.", "نظارت قضایی. شفافیت. محدودیت‌های سخت روی جمع‌آوری داده."),
            d("A", "Do you trust tech companies?", "به شرکت‌های فناوری اعتماد داری؟"),
            d("B", "Not really. Unless they're held accountable, they'll prioritize profit over ethics.", "نه زیاد. مگر اینکه پاسخگو باشند، سود را بر اخلاق ترجیح می‌دهند."),
            d("A", "What about autonomous vehicles? Would you ride in one?", "خودروهای خودمختار چطور؟ سوار یکی می‌شوی؟"),
            d("B", "Maybe. If they were proven safer than human drivers, I would.", "شاید. اگر اثبات شود امن‌تر از رانندگان انسانی هستند، بله."),
            d("A", "What if there's an accident? Who's responsible?", "اگر تصادفی رخ دهد؟ چه کسی مسئول است؟"),
            d("B", "That's the crux. If the algorithm fails, should the manufacturer be liable? The programmer?", "این نکته اصلی‌ست. اگر الگوریتم شکست بخورد، سازنده مسئول است؟ برنامه‌نویس؟"),
            d("A", "It's complicated.", "پیچیده است."),
            d("B", "Very. That's why we need laws before the technology is everywhere.", "بسیار. برای همین قبل از همه‌گیر شدن فناوری به قوانین نیاز داریم."),
            d("A", "Do you think we'll get it right?", "فکر می‌کنی درست انجامش می‌دهیم؟"),
            d("B", "I hope so. If we had listened to ethicists earlier, we'd be in better shape now.", "امیدوارم. اگر زودتر به اخلاق‌گرایان گوش داده بودیم، الان وضعیت بهتری داشتیم."),
            d("A", "That's a fair point.", "نکته منصفانه‌ای‌ست.")
        ),
        listOf(
            q("What worries B most?", listOf("AI", "surveillance", "robots"), 1),
            q("What safeguards does B suggest?", listOf("more AI", "judicial oversight", "less data"), 1),
            q("If we had regulated earlier, we ___ be in this situation.", listOf("won't", "wouldn't", "don't"), 1),
            q("Unless they're held ___, they'll prioritize profit.", listOf("accountable", "accounting", "accounted"), 0)
        ),
        idioms = listOf(
            IdiomExpression("The crux", "نکته اصلی", "That's the crux.", "این نکته اصلی‌ست."),
            IdiomExpression("In better shape", "در وضعیت بهتر", "We'd be in better shape.", "در وضعیت بهتری بودیم."),
            IdiomExpression("Fair point", "نکته منصفانه", "That's a fair point.", "نکته منصفانه‌ای‌ست.")
        ),
        pron = listOf(
            PronunciationTip("Mixed conditionals", "Stress both 'had' and 'would': If I HAD studied, I WOULD be working in AI.")
        ),
        cult = listOf(
            CulturalNote("AI ethics", "The EU's AI Act classifies systems by risk. The US takes a more sector-specific approach.")
        ),
        mis = listOf(
            CommonMistake("If I would have known, I would have acted.", "If I had known, I would have acted.", "Never 'would have' in if-clause."),
            CommonMistake("Unless we don't act, it will be late.", "Unless we act, it will be late.", "Unless is already negative.")
        )
    )

    private fun f5C() = base(23, "5C Innovation and creativity", "۵C نوآوری و خلاقیت",
        listOf(
            "Use cleft sentences",
            "Discuss creativity and innovation",
            "Emphasize key points"
        ),
        listOf(
            v("innovate", "نوآوری کردن", "Innovate or die.", "نوآوری کن یا بمیر.", "verb"),
            v("creativity", "خلاقیت", "Unleash creativity.", "خلاقیت را آزاد کن."),
            v("inspiration", "الهام", "A source of inspiration.", "منبع الهام."),
            v("breakthrough", "پیشرفت بزرگ", "A creative breakthrough.", "پیشرفت خلاقانه."),
            v("collaborate", "همکاری کردن", "Collaborate with others.", "با دیگران همکاری کن.", "verb"),
            v("prototype", "نمونه اولیه", "Build a prototype.", "نمونه اولیه بساز."),
            v("iterate", "تکرار کردن", "Iterate quickly.", "سریع تکرار کن.", "verb"),
            v("visionary", "آینده‌نگر", "A visionary leader.", "رهبر آینده‌نگر.", "adjective"),
            v("disruptive", "مخرب", "Disruptive technology.", "فناوری مخرب.", "adjective"),
            v("scalable", "مقیاس‌پذیر", "A scalable solution.", "راه‌حل مقیاس‌پذیر.", "adjective"),
            v("intuitive", "شهودی", "An intuitive design.", "طراحی شهودی.", "adjective"),
            v("empower", "توانمند کردن", "Empower your team.", "تیمت را توانمند کن.", "verb")
        ),
        listOf(
            GrammarSection("Cleft sentences with 'it'", "It was Steve Jobs who revolutionized phones. It's creativity that drives innovation."),
            GrammarSection("Cleft sentences with 'what'", "What we need is more time. What surprised me was his humility."),
            GrammarSection("Cleft for emphasis", "It's not money that motivates him — it's impact.")
        ),
        listOf(
            d("A", "What do you think drives innovation?", "فکر می‌کنی چه چیزی نوآوری را هدایت می‌کند؟"),
            d("B", "It's not money that drives it, in my experience. What really matters is curiosity.", "در تجربه من این پول نیست که هدایتش می‌کند. چیزی که واقعاً مهم است کنجکاوی‌ست."),
            d("A", "Interesting. Some people say it's necessity.", "جالب. بعضی می‌گویند ضرورت است."),
            d("B", "Necessity helps, certainly. But what separates innovators from the rest is persistence.", "ضرورت قطعاً کمک می‌کند. ولی چیزی که نوآوران را از دیگران جدا می‌کند پشتکار است."),
            d("A", "Can creativity be taught?", "خلاقیت آموزش‌پذیر است؟"),
            d("B", "I believe so. What schools often do is punish mistakes, which is the worst thing.", "باور دارم بله. چیزی که مدارس اغلب انجام می‌دهند تنبیه اشتباهات است، که بدترین کار است."),
            d("A", "So how should we encourage creativity?", "پس چطور باید خلاقیت را تشویق کنیم؟"),
            d("B", "It's psychological safety that matters most. People need to feel safe to fail.", "این امنیت روانی است که بیشترین اهمیت را دارد. مردم باید احساس امنیت کنند که شکست بخورند."),
            d("A", "Have you ever had a creative breakthrough?", "هرگز پیشرفت خلاقانه‌ای داشته‌ای؟"),
            d("B", "Yes. It was while I was walking in the park, actually. What triggered it was a random conversation.", "بله. در واقع وقتی در پارک قدم می‌زدم. چیزی که شروعش کرد یک گفتگوی تصادفی بود."),
            d("A", "So it wasn't at your desk?", "پس سر میزت نبود؟"),
            d("B", "No. It's when we relax that our brains make unexpected connections.", "نه. وقتی آرام می‌شویم مغزمان ارتباطات غیرمنتظره برقرار می‌کند."),
            d("A", "Do you think teams or individuals are more creative?", "فکر می‌کنی تیم‌ها یا افراد خلاق‌ترند؟"),
            d("B", "Both, differently. It's collaboration that turns ideas into products.", "هر دو، متفاوت. این همکاری است که ایده‌ها را به محصول تبدیل می‌کند."),
            d("A", "What about the role of failure?", "نقش شکست چطور؟"),
            d("B", "It's essential. What Silicon Valley understood early is that failure is data.", "ضروری‌ست. چیزی که سیلیکون ولی زود فهمید این است که شکست داده است."),
            d("A", "That's a healthy attitude.", "نگرش سالمی‌ست."),
            d("B", "It is. The companies that iterate fastest usually win.", "هست. شرکت‌هایی که سریع‌تر تکرار می‌کنند معمولاً برنده می‌شوند.")
        ),
        listOf(
            q("What drives innovation according to B?", listOf("money", "curiosity", "fame"), 1),
            q("Where did B have a breakthrough?", listOf("at desk", "walking in park", "in meeting"), 1),
            q("___ we need is more time.", listOf("That", "What", "It"), 1),
            q("It was Steve Jobs ___ revolutionized phones.", listOf("which", "who", "whose"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Separate from the rest", "جدا کردن از دیگران", "What separates them from the rest.", "چیزی که آن‌ها را از دیگران جدا می‌کند."),
            IdiomExpression("Psychological safety", "امنیت روانی", "Psychological safety matters.", "امنیت روانی مهم است."),
            IdiomExpression("Silicon Valley", "سیلیکون ولی", "Silicon Valley understood early.", "سیلیکون ولی زود فهمید.")
        ),
        pron = listOf(
            PronunciationTip("Cleft sentences", "Stress the focused element: It was STEVE JOBS who... What matters is CURIOSITY.")
        ),
        cult = listOf(
            CulturalNote("Innovation culture", "Silicon Valley's 'fail fast' ethos is unique. In Japan, failure carries more stigma. In Europe, a middle ground.")
        ),
        mis = listOf(
            CommonMistake("It's money what drives him.", "It's money that drives him.", "Use 'that', not 'what', after 'it's'."),
            CommonMistake("What matters it's curiosity.", "What matters is curiosity.", "What-clause takes 'is'.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 5 ═══════════

    private fun pe5() = base(24, "PE5 A conference presentation", "انگلیسی کاربردی ۵ — ارائه در کنفرانس",
        listOf(
            "Deliver a professional presentation",
            "Handle questions from the audience",
            "Engage and persuade an audience"
        ),
        listOf(
            v("presentation", "ارائه", "Deliver a presentation.", "ارائه بده."),
            v("audience", "مخاطب", "Engage the audience.", "مخاطب را درگیر کن."),
            v("slide", "اسلاید", "A key slide.", "اسلاید کلیدی."),
            v("highlight", "برجسته کردن", "Highlight the findings.", "یافته‌ها را برجسته کن.", "verb"),
            v("summarize", "خلاصه کردن", "Summarize the main points.", "نکات اصلی را خلاصه کن.", "verb"),
            v("address", "پرداختن به", "Address the question.", "به سوال بپرداز.", "verb"),
            v("clarify", "روشن کردن", "Clarify the point.", "نکته را روشن کن.", "verb"),
            v("engage", "درگیر کردن", "Engage with the audience.", "با مخاطب درگیر شو.", "verb"),
            v("conclude", "نتیجه‌گیری کردن", "Conclude the presentation.", "ارائه را نتیجه‌گیری کن.", "verb"),
            v("impact", "تأثیر", "A lasting impact.", "تأثیر ماندگار."),
            v("concise", "مختصر", "Be concise.", "مختصر باش.", "adjective"),
            v("credible", "قابل اعتماد", "A credible argument.", "استدلال قابل اعتماد.", "adjective")
        ),
        listOf(
            GrammarSection("Signposting language", "First, I'll discuss... Then I'll move on to... Finally, I'll conclude with..."),
            GrammarSection("Emphasis in speech", "What's crucial here is... The key point is... I'd like to draw your attention to..."),
            GrammarSection("Handling questions", "That's a great question. Let me address that. If I understand correctly, you're asking...")
        ),
        listOf(
            d("A", "Thank you all for coming. Today I'll be presenting our research on remote work productivity.", "ممنون از همه که آمدید. امروز تحقیقاتمان درباره بهره‌وری کار از راه دور را ارائه می‌دهم."),
            d("B", "Looking forward to it.", "منتظرش هستم."),
            d("A", "First, I'll discuss the methodology. Then I'll share the key findings. Finally, I'll address the implications.", "اول، روش‌شناسی را بحث می‌کنم. بعد یافته‌های کلیدی را به اشتراک می‌گذارم. در نهایت، پیامدها را بررسی می‌کنم."),
            d("B", "How long will this take?", "چقدر طول می‌کشد؟"),
            d("A", "About twenty minutes, with time for questions at the end.", "حدود بیست دقیقه، با زمان برای سؤالات در پایان."),
            d("B", "Good.", "خوبه."),
            d("A", "What's crucial here is the sample size. We studied over 3,000 employees across five countries.", "چیزی که اینجا حیاتی‌ست اندازه نمونه است. بیش از ۳۰۰۰ کارمند در پنج کشور را مطالعه کردیم."),
            d("B", "Impressive. What did you find?", "تحسین‌برانگیز. چه یافتید؟"),
            d("A", "Surprisingly, productivity increased for most workers, but decreased for junior employees who needed mentorship.", "به طور غافلگیرکننده، بهره‌وری برای بیشتر کارگران افزایش یافت، ولی برای کارمندان جوان که به منتورینگ نیاز داشتند کاهش یافت."),
            d("B", "That's fascinating. What's the takeaway?", "جذابه. نتیجه‌گیری چیه؟"),
            d("A", "That's an excellent question. The key point is that remote work isn't universally beneficial. It depends on role and experience.", "سؤال عالی‌ایه. نکته کلیدی این است که کار از راه دور به طور جهانی سودمند نیست. بستگی به نقش و تجربه دارد."),
            d("B", "Could you clarify what you mean by 'experience'?", "می‌توانید روشن کنید منظورتان از 'تجربه' چیست؟"),
            d("A", "Certainly. If I understand correctly, you're asking about seniority. Junior staff benefited from in-person learning.", "قطعاً. اگر درست متوجه شده‌ام، درباره ارشدیت می‌پرسید. کارکنان جوان از یادگیری حضوری بهره می‌بردند."),
            d("B", "Exactly. So what do you recommend?", "دقیقاً. پس چه توصیه می‌کنید؟"),
            d("A", "A hybrid model. What works best is two to three days in office, especially for new employees.", "مدل ترکیبی. آنچه بهترین کار می‌کند دو تا سه روز در دفتر است، مخصوصاً برای کارمندان جدید."),
            d("B", "Have you published the full study?", "مطالعه کامل را منتشر کرده‌اید؟"),
            d("A", "Yes, it's in the Journal of Applied Psychology. I'd be happy to share the link.", "بله، در مجله روانشناسی کاربردی. خوشحال می‌شوم لینک را به اشتراک بگذارم."),
            d("B", "Please do. Thank you for the excellent presentation.", "لطفاً این کار را بکنید. ممنون از ارائه عالی‌تان.")
        ),
        listOf(
            q("How many employees were studied?", listOf("500", "1500", "3000+"), 2),
            q("What did B ask about?", listOf("methodology", "meaning of experience", "publication"), 1),
            q("What's crucial here ___ the sample size.", listOf("is", "are", "has"), 0),
            q("What works best ___ a hybrid model.", listOf("is", "are", "has"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Takeaway", "نتیجه‌گیری", "What's the takeaway?", "نتیجه‌گیری چیه؟"),
            IdiomExpression("Looking forward to", "منتظر بودن", "Looking forward to it.", "منتظرش هستم."),
            IdiomExpression("Draw attention to", "توجه را جلب کردن", "I'd like to draw attention to...", "می‌خواهم توجه را جلب کنم به...")
        ),
        pron = listOf(
            PronunciationTip("Presentation emphasis", "Pause before key points. Raise pitch slightly. What's CRUCIAL here is...")
        ),
        cult = listOf(
            CulturalNote("Presentation styles", "US presentations are dynamic and story-driven. Japanese presentations are formal and structured. German ones are data-heavy.")
        ),
        mis = listOf(
            CommonMistake("What crucial is the sample.", "What's crucial is the sample.", "Don't drop 'is'."),
            CommonMistake("I look forward to hear.", "I look forward to hearing.", "Look forward to + gerund.")
        )
    )

    // ═══════════ REVIEW 5 ═══════════

    private fun rc910() = base(25, "R&C 9&10", "مرور ۹ و ۱۰",
        listOf("Review passive in formal writing", "Review mixed conditionals", "Review cleft sentences"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("synthesize", "ترکیب کردن", "Synthesize your knowledge.", "دانشت را ترکیب کن.", "verb"),
            v("mastery", "تسلط", "Aim for mastery.", "به دنبال تسلط باش."),
            v("progress", "پیشرفت", "Great progress.", "پیشرفت عالی."),
            v("confidence", "اعتماد به نفس", "Speak with confidence.", "با اعتماد به نفس صحبت کن."),
            v("fluency", "روانی", "Fluency matters.", "روانی مهم است.")
        ),
        listOf(
            GrammarSection("Passive in formal writing", "It has been demonstrated. Results were verified."),
            GrammarSection("Mixed conditionals", "If I had studied science, I would be working in AI."),
            GrammarSection("Cleft sentences", "It's creativity that drives innovation. What matters is persistence.")
        ),
        listOf(
            d("T", "Files 9 and 10 review. Key grammar points?", "مرور فایل‌های ۹ و ۱۰. نکات گرامری کلیدی؟"),
            d("A", "Passive in formal writing. It has been demonstrated that...", "مجهول در نوشتار رسمی. It has been demonstrated that..."),
            d("B", "Mixed conditionals. If I had studied science, I would be working in AI now.", "شرطی‌های ترکیبی. If I had studied science, I would be working in AI now."),
            d("T", "Cleft sentences?", "جملات شکافته؟"),
            d("A", "It's creativity that drives innovation. What matters most is persistence.", "It's creativity that drives innovation. What matters most is persistence."),
            d("T", "When do we use cleft sentences?", "کِی از جملات شکافته استفاده می‌کنیم؟"),
            d("B", "When we want to emphasize a specific element. Instead of 'Creativity drives innovation', we say 'It's creativity that drives innovation'.", "وقتی می‌خواهیم عنصر خاصی را تأکید کنیم. به جای 'Creativity drives innovation'، می‌گوییم 'It's creativity that drives innovation'."),
            d("T", "Excellent. You're ready for Level 5.", "عالی. برای سطح ۵ آماده‌اید."),
            d("A", "Really? That's exciting.", "واقعاً؟ هیجان‌انگیزه."),
            d("T", "Yes. Level 5 is C1 — much more challenging. But you're prepared.", "بله. سطح ۵ سطح C1 است — خیلی چالش‌برانگیزتر. ولی آماده‌اید."),
            d("B", "We'll keep practicing.", "به تمرین ادامه می‌دهیم."),
            d("T", "That's the right attitude. Congratulations on finishing Level 4!", "نگرش درستی‌ست. تبریک برای اتمام سطح ۴!"),
            d("A", "Thank you for everything.", "ممنون از همه چیز."),
            d("B", "It's been a great journey.", "سفر عالی‌ای بوده.")
        ),
        listOf(
            q("Passive in formal writing?", listOf("It's been shown", "It shows", "It shown"), 0),
            q("Cleft: It's money ___ motivates him.", listOf("what", "that", "which"), 1),
            q("If I had studied science, I ___ be in AI now.", listOf("will", "would", "am"), 1),
            q("What matters ___ persistence.", listOf("is", "are", "be"), 0)
        ),
        idioms = listOf(
            IdiomExpression("It's been a journey", "سفر بوده", "It's been a great journey.", "سفر عالی‌ای بوده.")
        ),
        pron = listOf(PronunciationTip("Cleft emphasis", "Stress the focused element strongly: It's CREATIVITY that drives innovation.")),
        cult = listOf(CulturalNote("Level completion", "Congratulations on completing Level 4!")),
        mis = listOf(
            CommonMistake("It's money what motivates him.", "It's money that motivates him.", "Use 'that' in it-cleft."),
            CommonMistake("If I would have studied, I would be working.", "If I had studied, I would be working.", "Never 'would have' in if-clause.")
        )
    )

    // ═══════════ FILE 6 — Emotions and psychology ═══════════

    private fun f6A() = base(26, "6A Understanding emotions", "۶A درک احساسات",
        listOf(
            "Use adverbs with adjectives",
            "Discuss emotional intelligence",
            "Express and interpret feelings"
        ),
        listOf(
            v("emotional intelligence", "هوش هیجانی", "High emotional intelligence.", "هوش هیجانی بالا."),
            v("empathy", "همدلی", "Show empathy.", "همدلی نشان بده."),
            v("resilience", "تاب‌آوری", "Emotional resilience.", "تاب‌آوری هیجانی."),
            v("vulnerable", "آسیب‌پذیر", "Feeling vulnerable.", "احساس آسیب‌پذیری.", "adjective"),
            v("self-aware", "خودآگاه", "Become more self-aware.", "خودآگاه‌تر شو.", "adjective"),
            v("overwhelmed", "غرق‌شده", "Feeling overwhelmed.", "احساس غرق‌شدگی.", "adjective"),
            v("suppress", "سرکوب کردن", "Suppress emotions.", "احساسات را سرکوب کن.", "verb"),
            v("acknowledge", "به رسمیت شناختن", "Acknowledge your feelings.", "احساساتت را به رسمیت بشناس.", "verb"),
            v("cope with", "کنار آمدن با", "Cope with stress.", "با استرس کنار بیا.", "verb"),
            v("trigger", "محرک", "An emotional trigger.", "محرک هیجانی."),
            v("regulate", "تنظیم کردن", "Regulate your emotions.", "احساساتت را تنظیم کن.", "verb"),
            v("genuine", "واقعی", "Genuine emotion.", "احساس واقعی.", "adjective")
        ),
        listOf(
            GrammarSection("Adverbs with adjectives", "incredibly resilient, deeply vulnerable, remarkably self-aware."),
            GrammarSection("Adverb position", "She's incredibly patient. He handles stress remarkably well."),
            GrammarSection("Adverbs of degree", "extremely, fairly, rather, somewhat, highly, deeply, utterly.")
        ),
        listOf(
            d("A", "Do you think emotional intelligence is as important as IQ?", "فکر می‌کنی هوش هیجانی به اندازه IQ مهم است؟"),
            d("B", "Honestly, I think it's more important. Especially in leadership roles.", "راستش، فکر می‌کنم مهم‌تر است. مخصوصاً در نقش‌های رهبری."),
            d("A", "Why do you say that?", "چرا این را می‌گویی؟"),
            d("B", "Because technical skills can be taught. But being incredibly self-aware — that's much harder.", "چون مهارت‌های فنی آموزش‌پذیرند. ولی فوق‌العاده خودآگاه بودن — خیلی سخت‌تر است."),
            d("A", "What does emotional intelligence actually mean?", "هوش هیجانی واقعاً یعنی چه؟"),
            d("B", "It's the ability to recognize and manage your own emotions, and to empathize with others.", "توانایی شناخت و مدیریت احساسات خودت، و همدلی با دیگران است."),
            d("A", "Have you always been good at it?", "همیشه در آن خوب بوده‌ای؟"),
            d("B", "Not at all. I used to suppress everything. It made me deeply unhappy.", "اصلاً. قبلاً همه چیز را سرکوب می‌کردم. مرا عمیقاً ناراضی می‌کرد."),
            d("A", "What changed?", "چی عوض شد؟"),
            d("B", "Therapy, mostly. Learning to acknowledge my feelings instead of hiding them.", "بیشتر درمان. یاد گرفتن اینکه احساساتم را به رسمیت بشناسم به جای پنهان کردن."),
            d("A", "That takes real courage.", "شجاعت واقعی می‌خواهد."),
            d("B", "It does. Being vulnerable is incredibly difficult for many people.", "هست. آسیب‌پذیر بودن برای بسیاری فوق‌العاده سخت است."),
            d("A", "How do you cope with stress now?", "الان چطور با استرس کنار می‌آیی؟"),
            d("B", "I've learned to regulate my emotions. When I feel triggered, I pause before reacting.", "یاد گرفته‌ام احساساتم را تنظیم کنم. وقتی احساس محرک می‌کنم، قبل از واکنش مکث می‌کنم."),
            d("A", "That sounds remarkably mature.", "فوق‌العاده بالغانه به نظر می‌رسد."),
            d("B", "It didn't happen overnight. It's taken years of practice.", "یک شبه اتفاق نیفتاد. سال‌ها تمرین لازم داشته."),
            d("A", "Do you think schools should teach it?", "فکر می‌کنی مدارس باید آموزشش دهند؟"),
            d("B", "Absolutely. It would benefit everyone. Emotional literacy is deeply undervalued.", "قطعاً. به همه سود می‌رساند. سواد هیجانی عمیقاً کم‌ارزش شمرده می‌شود."),
            d("A", "I agree completely. It should be a core subject.", "کاملاً موافقم. باید یک درس اصلی باشد.")
        ),
        listOf(
            q("What does B think is more important than IQ?", listOf("money", "emotional intelligence", "experience"), 1),
            q("How did B change?", listOf("therapy", "books", "travel"), 0),
            q("She's ___ self-aware.", listOf("very", "incredibly", "absolutely"), 1),
            q("He handles stress remarkably ___.", listOf("good", "well", "nice"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Overnight", "یک شبه", "It didn't happen overnight.", "یک شبه اتفاق نیفتاد."),
            IdiomExpression("Cope with", "کنار آمدن با", "How do you cope with stress?", "چطور با استرس کنار می‌آیی؟"),
            IdiomExpression("Undervalued", "کم‌ارزش شمرده شده", "Deeply undervalued.", "عمیقاً کم‌ارزش شمرده شده.")
        ),
        pron = listOf(
            PronunciationTip("Adverb stress", "Stress the adverb for emphasis: INCREDIBLY self-aware. DEEPLY vulnerable.")
        ),
        cult = listOf(
            CulturalNote("Emotional expression", "In Mediterranean and Latin American cultures, emotional expression is encouraged. In Northern Europe and East Asia, restraint is valued.")
        ),
        mis = listOf(
            CommonMistake("She's very self-aware.", "She's incredibly self-aware.", "Incredibly emphasizes more."),
            CommonMistake("He handles stress very well.", "He handles stress remarkably well.", "Remarkably is more formal.")
        )
    )

    private fun f6B() = base(27, "6B Memory and the brain", "۶B حافظه و مغز",
        listOf(
            "Use passive voice with complex structures",
            "Discuss memory and cognition",
            "Express certainty and doubt"
        ),
        listOf(
            v("memory", "حافظه", "Long-term memory.", "حافظه بلندمدت."),
            v("recall", "به یاد آوردن", "Recall events vividly.", "رویدادها را زنده به یاد بیاور.", "verb"),
            v("perception", "ادراک", "Distorted perception.", "ادراک تحریف‌شده."),
            v("cognitive", "شناختی", "Cognitive decline.", "افت شناختی.", "adjective"),
            v("retain", "حفظ کردن", "Retain information.", "اطلاعات را حفظ کن.", "verb"),
            v("subconscious", "ناخودآگاه", "Subconscious memories.", "خاطرات ناخودآگاه.", "adjective"),
            v("associate", "پیوند دادن", "Associate smells with memories.", "بوها را با خاطرات پیوند بده.", "verb"),
            v("repress", "سرکوب کردن", "Repressed memories.", "خاطرات سرکوب‌شده.", "verb"),
            v("flashback", "فلش‌بک", "Traumatic flashbacks.", "فلش‌بک‌های آسیب‌زا."),
            v("bias", "سوگیری", "Memory bias.", "سوگیری حافظه."),
            v("trigger", "محرک", "A memory trigger.", "محرک حافظه."),
            v("consolidate", "تثبیت کردن", "Consolidate memories during sleep.", "خاطرات را حین خواب تثبیت کن.", "verb")
        ),
        listOf(
            GrammarSection("Passive with complex structures", "Memories are believed to be stored in the hippocampus. It has been shown that..."),
            GrammarSection("Certainty and doubt", "It's certain that... It's likely that... It's thought that... It's doubtful whether..."),
            GrammarSection("Reported passive", "Sleep is said to consolidate memory. Childhood memories are thought to be unreliable.")
        ),
        listOf(
            d("A", "Do you have a good memory?", "حافظه خوبی داری؟"),
            d("B", "It's thought that I do, but honestly, I'm not sure. It depends on the type.", "فکر می‌شود خوب دارم، ولی راستش مطمئن نیستم. بستگی به نوع دارد."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "I'm excellent at recalling facts, but I'm terrible with faces. It's believed that these use different brain systems.", "در به یاد آوردن حقایق عالی‌ام، ولی با چهره‌ها افتضاحم. باور می‌شود که این‌ها سیستم‌های مغزی متفاوتی دارند."),
            d("A", "Have you ever had a memory that turned out to be false?", "هرگز حافظه‌ای داشته‌ای که جعلی از آب درآید؟"),
            d("B", "Yes, and it was frightening. It's been shown that memories can be easily distorted.", "بله، و ترسناک بود. نشان داده شده که خاطرات می‌توانند به راحتی تحریف شوند."),
            d("A", "What happened?", "چی شد؟"),
            d("B", "I was certain about something that never occurred. My sister corrected me, and I couldn't believe it.", "درباره چیزی مطمئن بودم که هرگز رخ نداده بود. خواهرم تصحیحم کرد، و باور نمی‌کردم."),
            d("A", "How is that possible?", "چطور ممکنه؟"),
            d("B", "It's thought that the brain fills in gaps with plausible details. It's called confabulation.", "باور می‌شود که مغز شکاف‌ها را با جزئیات محتمل پر می‌کند. به آن confabulation می‌گویند."),
            d("A", "That's unsettling. Can we trust any memory?", "نگران‌کننده‌ست. می‌توانیم به هیچ خاطره‌ای اعتماد کنیم؟"),
            d("B", "Rarely with complete confidence. Memories are said to be reconstructed each time we recall them.", "به ندرت با اعتماد کامل. گفته می‌شود خاطرات هر بار که به یاد می‌آوریم بازسازی می‌شوند."),
            d("A", "So the more we remember, the more we distort?", "پس هرچی بیشتر به یاد می‌آوریم، بیشتر تحریف می‌کنیم؟"),
            d("B", "Exactly. It's likely that our strongest memories are the most edited.", "دقیقاً. احتمالاً قوی‌ترین خاطرات بیشترین ویرایش را دارند."),
            d("A", "What about smell and memory?", "بو و حافظه چطور؟"),
            d("B", "That connection is deeply powerful. Smells are thought to trigger the most vivid memories.", "این ارتباط فوق‌العاده قوی‌ست. باور می‌شود بوها زنده‌ترین خاطرات را تحریک می‌کنند."),
            d("A", "I've experienced that. One smell can take me back years.", "من هم تجربه‌اش کرده‌ام. یک بو می‌تواند مرا سال‌ها به عقب ببرد."),
            d("B", "It's a beautiful aspect of being human.", "جنبه زیبایی از انسان بودن است."),
            d("A", "Does it worry you?", "نگرانت می‌کند؟"),
            d("B", "Sometimes. But it's also what makes us who we are.", "گاهی. ولی همچنین چیزی‌ست که ما را همانی می‌کند که هستیم.")
        ),
        listOf(
            q("What is B bad at remembering?", listOf("facts", "faces", "names"), 1),
            q("What is confabulation?", listOf("making up memories", "real memories", "losing memory"), 0),
            q("Memories are believed ___ stored in the hippocampus.", listOf("to be", "be", "being"), 0),
            q("Sleep is said ___ consolidate memory.", listOf("to", "for", "of"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Fill in the gaps", "شکاف‌ها را پر کردن", "The brain fills in gaps.", "مغز شکاف‌ها را پر می‌کند."),
            IdiomExpression("Take me back", "مرا به عقب بردن", "It takes me back years.", "مرا سال‌ها به عقب می‌برد."),
            IdiomExpression("Who we are", "کسی که هستیم", "It makes us who we are.", "ما را همانی می‌کند که هستیم.")
        ),
        pron = listOf(
            PronunciationTip("Impersonal passive", "Stress the past participle: It is THOUGHT that... It has been SHOWN that...")
        ),
        cult = listOf(
            CulturalNote("Memory research", "Elizabeth Loftus's work on false memories has been used in court cases to challenge eyewitness testimony.")
        ),
        mis = listOf(
            CommonMistake("It's believed that memories are store.", "It's believed that memories are stored.", "Past participle."),
            CommonMistake("It's thought that I do, but honestly I'm not sure. It's thought...", "It's thought that I do, but honestly, I'm not sure.", "Fine.")
        )
    )

    private fun f6C() = base(28, "6C Dreams and the subconscious", "۶C رؤیا و ناخودآگاه",
        listOf(
            "Use speculation and deduction",
            "Discuss dreams and the mind",
            "Express likelihood and possibility"
        ),
        listOf(
            v("subconscious", "ناخودآگاه", "The subconscious mind.", "ذهن ناخودآگاه.", "adjective"),
            v("symbolic", "نمادین", "A symbolic dream.", "رؤیای نمادین.", "adjective"),
            v("interpret", "تفسیر کردن", "Interpret dreams.", "رؤیاها را تفسیر کن.", "verb"),
            v("manifest", "آشکار شدن", "Manifest in dreams.", "در رؤیاها آشکار شدن.", "verb"),
            v("therapist", "درمانگر", "See a therapist.", "درمانگر ببین."),
            v("anxiety", "اضطراب", "Dreams about anxiety.", "رؤیاهای اضطراب."),
            v("unresolved", "حل‌نشده", "Unresolved conflicts.", "تعارض‌های حل‌نشده.", "adjective"),
            v("archetype", "کهن‌الگو", "Jungian archetypes.", "کهن‌الگوهای یونگی."),
            v("narrative", "روایت", "A dream narrative.", "روایت رؤیا."),
            v("unconscious", "ناخودآگاه", "Unconscious desires.", "خواسته‌های ناخودآگاه.", "adjective"),
            v("recurring", "تکرارشونده", "A recurring dream.", "رؤیای تکرارشونده.", "adjective"),
            v("symbol", "نماد", "A dream symbol.", "نماد رؤیا.")
        ),
        listOf(
            GrammarSection("Modals of speculation", "It might mean... It could symbolize... It must be... It can't be..."),
            GrammarSection("Perfect modals of deduction", "He must have been anxious. She might have felt trapped."),
            GrammarSection("Speculating about the past", "It may have meant something different at the time.")
        ),
        listOf(
            d("A", "Do you believe dreams have meaning?", "فکر می‌کنی رؤیاها معنا دارند؟"),
            d("B", "That's an interesting question. Some might say yes, others no. I lean towards yes, cautiously.", "سؤال جالبی‌ست. بعضی ممکن است بگویند بله، دیگران نه. من با احتیاط به سمت بله می‌روم."),
            d("A", "Why cautiously?", "چرا با احتیاط؟"),
            d("B", "Because the science is mixed. Freudians would say they reveal unconscious desires. Neuroscientists might say they're just brain activity.", "چون علم ترکیبی‌ست. فرویدی‌ها می‌گویند خواسته‌های ناخودآگاه را آشکار می‌کنند. عصب‌شناسان می‌گویند فقط فعالیت مغزی‌اند."),
            d("A", "Which view do you find more convincing?", "کدام دیدگاه را قانع‌کننده‌تر می‌یابی؟"),
            d("B", "I think both might be partly true. Dreams probably have meaning, but it may be personal, not universal.", "فکر می‌کنم هر دو ممکن است تا حدی درست باشند. رؤیاها احتمالاً معنا دارند، ولی ممکن است شخصی باشد، نه جهانی."),
            d("A", "Do you have recurring dreams?", "رؤیاهای تکرارشونده داری؟"),
            d("B", "I used to. I kept dreaming about missing a flight. It might have symbolized my fear of missing opportunities.", "قبلاً داشتم. مدام رؤیای از دست دادن پرواز می‌دیدم. ممکن است ترس از از دست دادن فرصت‌ها را نماد می‌کرد."),
            d("A", "Fascinating. Has it stopped?", "جذابه. متوقف شده؟"),
            d("B", "Yes, after I changed careers. That suggests it must have been related to my job stress.", "بله، بعد از تغییر شغل. این نشان می‌دهد که احتمالاً با استرس شغلی‌ام مرتبط بوده."),
            d("A", "Have you ever had a dream that came true?", "هرگز رؤیایی داشته‌ای که محقق شود؟"),
            d("B", "I thought so once, but it can't have been prophecy. It must have been coincidence.", "یک بار فکر کردم، ولی نمی‌تواند پیشگویی بوده باشد. باید تصادف بوده باشد."),
            d("A", "Why not?", "چرا نه؟"),
            d("B", "Because our brains are pattern-seeking machines. We remember the hits and forget the misses.", "چون مغزهای ما ماشین‌های الگو-یاب هستند. موفقیت‌ها را به یاد می‌آوریم و شکست‌ها را فراموش می‌کنیم."),
            d("A", "That's a good point. Do you write down your dreams?", "نکته خوبی‌ست. رؤیاهایت را می‌نویسی؟"),
            d("B", "Sometimes. If I wake up and remember one vividly, I jot it down. It helps with interpretation.", "گاهی. اگر بیدار شوم و یکی را زنده به یاد بیاورم، یادداشتش می‌کنم. به تفسیر کمک می‌کند."),
            d("A", "What have you learned from them?", "از آن‌ها چه یاد گرفته‌ای؟"),
            d("B", "Mostly that my anxiety manifests symbolically. Once I see that, the dreams lose their power.", "بیشتر اینکه اضطرابم نمادین آشکار می‌شود. وقتی آن را می‌بینم، رؤیاها قدرشان را از دست می‌دهند."),
            d("A", "That sounds therapeutic.", "درمانی به نظر می‌رسد."),
            d("B", "It is. Sometimes the mind speaks in symbols to protect us from what's too painful to face directly.", "هست. گاهی ذهن به نمادها صحبت می‌کند تا ما را از چیزی که مواجهه مستقیم با آن خیلی دردناک است محافظت کند."),
            d("A", "That's a beautiful thought.", "فکر زیبایی‌ست.")
        ),
        listOf(
            q("What did B's recurring dream symbolize?", listOf("success", "fear of missing opportunities", "love"), 1),
            q("Why did it stop?", listOf("therapy", "career change", "age"), 1),
            q("He ___ have been anxious.", listOf("must", "can", "will"), 0),
            q("It ___ have been coincidence.", listOf("must", "can", "will"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Jot down", "یادداشت کردن", "I jot it down.", "یادداشتش می‌کنم."),
            IdiomExpression("Pattern-seeking", "الگو-یاب", "Pattern-seeking machines.", "ماشین‌های الگو-یاب."),
            IdiomExpression("Lose their power", "قدرتشان را از دست دادن", "They lose their power.", "قدرتشان را از دست می‌دهند.")
        ),
        pron = listOf(
            PronunciationTip("Modals of deduction", "Stress the modal: It MUST have been. It CAN'T have been. It MIGHT mean.")
        ),
        cult = listOf(
            CulturalNote("Dream interpretation", "Freud's 'The Interpretation of Dreams' (1899) changed how the West understands dreams. In many indigenous cultures, dreams are spiritual guidance.")
        ),
        mis = listOf(
            CommonMistake("It must to have been.", "It must have been.", "No 'to' after must."),
            CommonMistake("It can't to be true.", "It can't be true.", "No 'to' after can't.")
        )
    )

    // ═══════════ FILE 7 — History and memory ═══════════

    private fun f7A() = base(29, "7A Historical events", "۷A رویدادهای تاریخی",
        listOf(
            "Use passive voice for historical narration",
            "Discuss historical events",
            "Evaluate historical impact"
        ),
        listOf(
            v("historical", "تاریخی", "A historical event.", "رویداد تاریخی.", "adjective"),
            v("impact", "تأثیر", "A lasting impact.", "تأثیر ماندگار."),
            v("legacy", "میراث", "A complicated legacy.", "میراث پیچیده."),
            v("era", "دوره", "A new era.", "دوره جدید."),
            v("revolution", "انقلاب", "The Industrial Revolution.", "انقلاب صنعتی."),
            v("consequence", "پیامد", "Long-term consequences.", "پیامدهای بلندمدت."),
            v("trigger", "شروع کردن", "Trigger a war.", "جنگ را شروع کن.", "verb"),
            v("era", "عصر", "The digital era.", "عصر دیجیتال."),
            v("precede", "پیشی گرفتن", "The events preceding the war.", "رویدادهای پیش از جنگ.", "verb"),
            v("aftermath", "پیامد", "The aftermath of war.", "پیامد جنگ."),
            v("commemorate", "گرامی داشتن", "Commemorate the victims.", "قربانیان را گرامی بدار.", "verb"),
            v("narrative", "روایت", "The historical narrative.", "روایت تاریخی.")
        ),
        listOf(
            GrammarSection("Passive for historical narration", "The war was declared in 1939. Millions were displaced."),
            GrammarSection("Past perfect in history", "By the time the treaty was signed, thousands had already died."),
            GrammarSection("Passive with modals", "The consequences could have been avoided. Lessons must be learned.")
        ),
        listOf(
            d("A", "What do you think is the most significant event of the 20th century?", "فکر می‌کنی مهم‌ترین رویداد قرن بیستم چیه؟"),
            d("B", "That's hotly debated. Some would say World War II. Others might argue the digital revolution.", "به شدت بحث‌برانگیزه. بعضی می‌گویند جنگ جهانی دوم. دیگران ممکن است انقلاب دیجیتال را استدلال کنند."),
            d("A", "Which would you choose?", "کدام را انتخاب می‌کنی؟"),
            d("B", "If I had to choose one, I'd say World War II. Its legacy still shapes global politics.", "اگر مجبور به انتخاب یکی باشم، جنگ جهانی دوم را می‌گویم. میراثش هنوز سیاست جهانی را شکل می‌دهد."),
            d("A", "What makes it so significant?", "چه چیزی آن را اینقدر مهم می‌کند؟"),
            d("B", "It was the deadliest conflict in history. Over 70 million people were killed.", "مرگبارترین درگیری تاریخ بود. بیش از ۷۰ میلیون نفر کشته شدند."),
            d("A", "That's staggering. What were the consequences?", "تکان‌دهنده‌ست. پیامدها چه بودند؟"),
            d("B", "The United Nations was created. The Cold War was triggered. Europe was rebuilt.", "سازمان ملل ایجاد شد. جنگ سرد شروع شد. اروپا بازسازی شد."),
            d("A", "Was there any way it could have been prevented?", "راهی برای جلوگیری‌اش وجود داشت؟"),
            d("B", "Historians still debate that. Some argue that if the Treaty of Versailles had been fairer, Hitler might never have risen.", "تاریخ‌نگاران هنوز بحث می‌کنند. بعضی استدلال می‌کنند اگر معاهده ورسای منصفانه‌تر بود، هیتلر ممکن بود هرگز بالا نیاید."),
            d("A", "That's a compelling theory. What lessons should be learned?", "نظریه قانع‌کننده‌ای‌ست. چه درس‌هایی باید گرفته شود؟"),
            d("B", "That appeasement doesn't work. That extremism must be confronted early.", "اینکه مماشات کار نمی‌کند. اینکه افراط‌گرایی باید زود مقابله شود."),
            d("A", "Do you think we've learned those lessons?", "فکر می‌کنی آن درس‌ها را گرفته‌ایم؟"),
            d("B", "Partially. The same patterns keep recurring, which suggests we haven't fully absorbed them.", "تا حدی. همان الگوها مدام تکرار می‌شوند، که نشان می‌دهد کاملاً جذبشان نکرده‌ایم."),
            d("A", "That's sobering.", "هوشیارکننده‌ست."),
            d("B", "It is. But remembering is the first step. That's why we commemorate these events.", "هست. ولی یادآوری اولین قدم است. برای همین این رویدادها را گرامی می‌داریم."),
            d("A", "Do you think remembrance actually prevents repetition?", "فکر می‌کنی یادآوری واقعاً از تکرار جلوگیری می‌کند؟"),
            d("B", "Not always. But forgetting guarantees it.", "نه همیشه. ولی فراموشی تضمینش می‌کند.")
        ),
        listOf(
            q("What does B consider most significant?", listOf("Cold War", "WWII", "digital revolution"), 1),
            q("How many died in WWII?", listOf("10M", "40M", "70M+"), 2),
            q("By the time the treaty was signed, thousands ___ died.", listOf("have", "had", "were"), 1),
            q("The war ___ declared in 1939.", listOf("was", "were", "is"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Hotly debated", "به شدت بحث‌برانگیز", "Hotly debated.", "به شدت بحث‌برانگیز."),
            IdiomExpression("Shape politics", "سیاست را شکل دادن", "Shapes global politics.", "سیاست جهانی را شکل می‌دهد."),
            IdiomExpression("Sobering", "هوشیارکننده", "That's sobering.", "هوشیارکننده‌ست.")
        ),
        pron = listOf(
            PronunciationTip("Historical passive", "Stress the past participle for events: The war was DEclared. The treaty was SIGNED.")
        ),
        cult = listOf(
            CulturalNote("Historical memory", "Germany's Vergangenheitsbewältigung (coming to terms with the past) is a model for other nations. Japan's approach has been more contested.")
        ),
        mis = listOf(
            CommonMistake("The war was declare in 1939.", "The war was declared in 1939.", "Past participle."),
            CommonMistake("If the treaty was fairer, Hitler might never rise.", "If the treaty had been fairer, Hitler might never have risen.", "Third conditional for past.")
        )
    )

    private fun f7B() = base(30, "7B Family history", "۷B تاریخچه خانوادگی",
        listOf(
            "Use past modals for speculation",
            "Discuss ancestry and heritage",
            "Talk about family roots"
        ),
        listOf(
            v("ancestor", "نیاکان", "Distant ancestors.", "نیاکان دور."),
            v("heritage", "میراث", "Cultural heritage.", "میراث فرهنگی."),
            v("genealogy", "شجره‌نامه", "Study genealogy.", "شجره‌نامه مطالعه کن."),
            v("descendant", "فرزند", "A direct descendant.", "فرزند مستقیم."),
            v("roots", "ریشه‌ها", "Family roots.", "ریشه‌های خانوادگی."),
            v("migration", "مهاجرت", "Family migration.", "مهاجرت خانوادگی."),
            v("trace", "ردیابی کردن", "Trace your ancestry.", "نیاکانت را ردیابی کن.", "verb"),
            v("lineage", "تبار", "A long lineage.", "تبار طولانی."),
            v("distant", "دور", "A distant relative.", "خویشاوند دور.", "adjective"),
            v("adopted", "فرزندخوانده", "An adopted child.", "فرزندخوانده.", "adjective"),
            v("biological", "زیستی", "Biological parents.", "والدین زیستی.", "adjective"),
            v("preserve", "حفظ کردن", "Preserve traditions.", "سنت‌ها را حفظ کن.", "verb")
        ),
        listOf(
            GrammarSection("Past modals for speculation", "They must have emigrated. They might have been farmers. They couldn't have known."),
            GrammarSection("Perfect modals of deduction", "She must have suffered. He might have been a soldier."),
            GrammarSection("Past modals of regret", "I should have asked. They could have stayed.")
        ),
        listOf(
            d("A", "Have you ever researched your family history?", "هرگز تاریخچه خانوادگی‌ات را تحقیق کرده‌ای؟"),
            d("B", "Yes, actually. It started as a pandemic project and became an obsession.", "بله، در واقع. به عنوان پروژه دوران قرنطینه شروع شد و به وسواس تبدیل شد."),
            d("A", "What did you discover?", "چی کشف کردی؟"),
            d("B", "My great-grandparents must have emigrated from Italy around 1900. The records are incomplete.", "پدربزرگ‌مادربزرگ‌هایم باید حدود ۱۹۰۰ از ایتالیا مهاجرت کرده باشند. سوابق ناقص است."),
            d("A", "How did you find out?", "چطور فهمیدی؟"),
            d("B", "I traced them through ship manifests. They might have traveled in third class.", "از طریق مانیفست کشتی‌ها ردیابی‌شان کردم. ممکن است در درجه سه سفر کرده باشند."),
            d("A", "Did you learn anything surprising?", "چیز غافلگیرکننده‌ای یاد گرفتی؟"),
            d("B", "Yes. They couldn't have had an easy life. My great-grandmother might have worked in a factory.", "بله. زندگی راحتی نمی‌توانستند داشته باشند. مادربزرگ‌مادربزرگم ممکن است در کارخانه کار کرده باشد."),
            d("A", "That's incredible. Did you find any living relatives?", "باورنکردنی‌ست. خویشاوند زنده‌ای پیدا کردی؟"),
            d("B", "A few distant cousins in the US and Argentina. We still keep in touch.", "چند پسرعموی دور در آمریکا و آرژانتین. هنوز در تماسیم."),
            d("A", "Have you been back to Italy?", "به ایتالیا برگشتی؟"),
            d("B", "Once. I should have gone sooner. Walking through their village was deeply emotional.", "یک بار. باید زودتر می‌رفتم. قدم زدن در روستایشان عمیقاً احساسی بود."),
            d("A", "Why didn't you go earlier?", "چرا زودتر نرفتی؟"),
            d("B", "I couldn't have afforded it when I was younger. Now I wish I had prioritized it.", "وقتی جوان‌تر بودم نمی‌توانستم از عهده‌اش برآیم. الان کاش اولویتش کرده بودم."),
            d("A", "Does knowing this change how you see yourself?", "دانستن این موضوع دیدت به خودت را تغییر می‌دهد؟"),
            d("B", "Enormously. It gives me a sense of continuity. Their sacrifices must have been immense.", "فوق‌العاده. به من حس تداوم می‌دهد. فداکاری‌هایشان باید عظیم بوده باشد."),
            d("A", "Have you shared this with your family?", "این را با خانواده‌ات به اشتراک گذاشته‌ای؟"),
            d("B", "Yes, and I've preserved everything digitally. Future generations should have access.", "بله، و همه چیز را دیجیتالی حفظ کرده‌ام. نسل‌های آینده باید دسترسی داشته باشند."),
            d("A", "That's a beautiful gift.", "هدیه زیبایی‌ست.")
        ),
        listOf(
            q("Where did B's great-grandparents emigrate from?", listOf("Spain", "Italy", "Greece"), 1),
            q("How did B trace them?", listOf("DNA", "ship manifests", "letters"), 1),
            q("They ___ have emigrated around 1900.", listOf("must", "can", "will"), 0),
            q("I ___ have gone sooner.", listOf("should", "can", "will"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Sense of continuity", "حس تداوم", "It gives me a sense of continuity.", "به من حس تداوم می‌دهد."),
            IdiomExpression("Became an obsession", "به وسواس تبدیل شد", "It became an obsession.", "به وسواس تبدیل شد."),
            IdiomExpression("Keep in touch", "در تماس بودن", "We still keep in touch.", "هنوز در تماسیم.")
        ),
        pron = listOf(
            PronunciationTip("Past modals of deduction", "Stress the modal: They MUST have emigrated. She MIGHT have worked. He COULDN'T have known.")
        ),
        cult = listOf(
            CulturalNote("Genealogy", "Popular in the US, UK, and Australia. DNA testing services like AncestryDNA have grown the field massively.")
        ),
        mis = listOf(
            CommonMistake("They must have emigrate.", "They must have emigrated.", "Past participle after have."),
            CommonMistake("I should went sooner.", "I should have gone sooner.", "Should have + past participle.")
        )
    )

    private fun f7C() = base(31, "7C Monuments and memory", "۷C بناها و حافظه",
        listOf(
            "Use relative clauses for complex description",
            "Discuss monuments and public memory",
            "Debate historical controversies"
        ),
        listOf(
            v("monument", "بنا", "A public monument.", "بنای عمومی."),
            v("statue", "مجسمه", "A bronze statue.", "مجسمه برنزی."),
            v("memorial", "یادبود", "A war memorial.", "یادبود جنگ."),
            v("controversial", "بحث‌برانگیز", "A controversial statue.", "مجسمه بحث‌برانگیز.", "adjective"),
            v("commemorate", "گرامی داشتن", "Commemorate the fallen.", "کشته‌شدگان را گرامی بدار.", "verb"),
            v("remove", "حذف کردن", "Remove the statue.", "مجسمه را حذف کن.", "verb"),
            v("preserve", "حفظ کردن", "Preserve history.", "تاریخ را حفظ کن.", "verb"),
            v("symbol", "نماد", "A symbol of oppression.", "نماد ظلم."),
            v("oppression", "ظلم", "A history of oppression.", "تاریخ ظلم."),
            v("vandalism", "واندالیسم", "An act of vandalism.", "عمل واندالیسم."),
            v("contextualize", "زمینه‌مند کردن", "Contextualize the monument.", "بنا را زمینه‌مند کن.", "verb"),
            v("heritage", "میراث", "Cultural heritage.", "میراث فرهنگی.")
        ),
        listOf(
            GrammarSection("Relative clauses for description", "The statue, which was erected in 1920, has become controversial."),
            GrammarSection("Non-defining relatives with commentary", "The monument, which many consider offensive, is being reviewed."),
            GrammarSection("Passive relative clauses", "The plaque that was added last year explains the context.")
        ),
        listOf(
            d("A", "What do you think about removing controversial monuments?", "نظرت درباره حذف بناهای بحث‌برانگیز چیه؟"),
            d("B", "It's complicated. The statues, which were often erected decades ago, are now being reconsidered.", "پیچیده است. مجسمه‌ها، که اغلب دهه‌ها پیش بنا شده‌اند، الان بازنگری می‌شوند."),
            d("A", "What kind of statues?", "چه نوع مجسمه‌هایی؟"),
            d("B", "Confederate monuments in the US, colonial figures in the UK, statues of dictators elsewhere.", "بناهای کنفدراسیون در آمریکا، چهره‌های استعماری در بریتانیا، مجسمه‌های دیکتاتورها جای دیگر."),
            d("A", "Should they be removed?", "باید حذف شوند؟"),
            d("B", "Some, yes. Those that glorify oppression, which cause real pain to communities, should go.", "بعضی، بله. آن‌هایی که ظلم را تجلیل می‌کنند، که درد واقعی به جوامع وارد می‌کنند، باید بروند."),
            d("A", "But isn't that erasing history?", "ولی این پاک کردن تاریخ نیست؟"),
            d("B", "Not necessarily. Historians argue that removing a statue doesn't erase history — it changes who we honor.", "لزوماً نه. تاریخ‌نگاران استدلال می‌کنند که حذف مجسمه تاریخ را پاک نمی‌کند — تغییر می‌دهد چه کسی را گرامی می‌داریم."),
            d("A", "So what should be done with them?", "پس با آن‌ها چیکار باید کرد؟"),
            d("B", "Some suggest moving them to museums, where they can be contextualized. Others want them melted down.", "بعضی پیشنهاد می‌کنند به موزه‌ها منتقل شوند، جایی که بتوان زمینه‌مندشان کرد. دیگران می‌خواهند ذوب شوند."),
            d("A", "Have you ever seen this happen?", "هرگز دیده‌ای این اتفاق بیفتد؟"),
            d("B", "Yes, in Bristol. The statue of Edward Colston, which was toppled by protesters, was later put in a museum.", "بله، در بریستول. مجسمه ادوارد کولستون، که توسط معترضان سرنگون شد، بعداً در موزه گذاشته شد."),
            d("A", "What do you think about that solution?", "نظرت درباره آن راه‌حل چیه؟"),
            d("B", "I think it's reasonable. The museum plaque that was added explains both his philanthropy and his slave trading.", "فکر می‌کنم منطقی‌ست. پلاکی که در موزه اضافه شد هم خیرخواهی‌اش و هم تجارت برده‌اش را توضیح می‌دهد."),
            d("A", "That seems balanced.", "متعادل به نظر می‌رسد."),
            d("B", "It is. But not everyone agrees. Some want complete removal, others want them restored.", "هست. ولی همه موافق نیستند. بعضی حذف کامل می‌خواهند، دیگران بازسازی می‌خواهند."),
            d("A", "Where do you stand?", "موضعت چیست؟"),
            d("B", "I lean toward contextualization. Erasing the past, which some advocate, feels like running from it.", "به سمت زمینه‌مند کردن متمایل‌ام. پاک کردن گذشته، که بعضی از آن حمایت می‌کنند، مثل فرار از آن است."),
            d("A", "That's a thoughtful position.", "موضع متفکرانه‌ای‌ست."),
            d("B", "Thank you. It's not a simple issue, and anyone who claims otherwise is oversimplifying.", "ممنون. مسئله ساده‌ای نیست، و هر کس غیر از این بگوید دارد ساده‌سازی می‌کند.")
        ),
        listOf(
            q("What kind of monuments are controversial?", listOf("religious", "Confederate, colonial", "modern"), 1),
            q("What happened to the Colston statue?", listOf("destroyed", "put in museum", "restored"), 1),
            q("The statue, ___ was erected in 1920, is controversial.", listOf("that", "which", "what"), 1),
            q("The plaque that ___ added explains context.", listOf("was", "were", "is"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Erase history", "تاریخ را پاک کردن", "It doesn't erase history.", "تاریخ را پاک نمی‌کند."),
            IdiomExpression("Where do you stand?", "موضعت چیه؟", "Where do you stand?", "موضعت چیه؟"),
            IdiomExpression("Lean toward", "متمایل بودن به", "I lean toward contextualization.", "به سمت زمینه‌مند کردن متمایل‌ام.")
        ),
        pron = listOf(
            PronunciationTip("Relative clauses", "Pause for non-defining relatives: The statue, | which was erected in 1920, | is controversial.")
        ),
        cult = listOf(
            CulturalNote("Monument debates", "Since 2020, many countries have debated colonial and Confederate monuments. Approaches vary from removal to contextualization.")
        ),
        mis = listOf(
            CommonMistake("The statue, that was erected...", "The statue, which was erected...", "Which in non-defining."),
            CommonMistake("The statue which was toppled by protesters, was put...", "The statue, which was toppled by protesters, was put...", "Use commas in non-defining.")
        )
    )

    // ═══════════ FILE 8 — Globalization ═══════════

    private fun f8A() = base(32, "8A Global culture", "۸A فرهنگ جهانی",
        listOf(
            "Use hedging language",
            "Discuss globalization and culture",
            "Express nuanced opinions"
        ),
        listOf(
            v("globalization", "جهانی‌سازی", "The effects of globalization.", "اثرات جهانی‌سازی."),
            v("homogenize", "یکسان‌سازی", "Cultures homogenize.", "فرهنگ‌ها یکسان می‌شوند.", "verb"),
            v("hybrid", "ترکیبی", "A hybrid culture.", "فرهنگ ترکیبی.", "adjective"),
            v("authentic", "اصیل", "Authentic cuisine.", "غذای اصیل.", "adjective"),
            v("preserve", "حفظ کردن", "Preserve traditions.", "سنت‌ها را حفظ کن.", "verb"),
            v("endangered", "در خطر", "Endangered languages.", "زبان‌های در خطر.", "adjective"),
            v("dominant", "غالب", "A dominant culture.", "فرهنگ غالب.", "adjective"),
            v("adapt", "سازگار شدن", "Adapt to local tastes.", "با سلیقه‌های محلی سازگار شو.", "verb"),
            v("resistance", "مقاومت", "Cultural resistance.", "مقاومت فرهنگی."),
            v("appropriation", "تصاحب فرهنگی", "Cultural appropriation.", "تصاحب فرهنگی."),
            v("blend", "ترکیب", "A blend of cultures.", "ترکیبی از فرهنگ‌ها."),
            v("imperialism", "امپریالیسم", "Cultural imperialism.", "امپریالیسم فرهنگی.")
        ),
        listOf(
            GrammarSection("Hedging", "It could be argued that... It seems likely that... There's a tendency to..."),
            GrammarSection("Softening claims", "Somewhat, rather, to some extent, in many ways, arguably."),
            GrammarSection("Balanced argument", "On the one hand... On the other hand... While it's true that...")
        ),
        listOf(
            d("A", "Is globalization destroying local cultures?", "آیا جهانی‌سازی فرهنگ‌های محلی را نابود می‌کند؟"),
            d("B", "It's a complex question. It could be argued that it's homogenizing some aspects, but not all.", "سؤال پیچیده‌ای‌ست. می‌توان استدلال کرد که بعضی جنبه‌ها را یکسان می‌کند، ولی نه همه."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "Well, you see the same brands everywhere. But at the same time, there's a tendency to blend global and local.", "خب، برندهای یکسان را همه جا می‌بینی. ولی در همان زمان، تمایلی به ترکیب جهانی و محلی وجود دارد."),
            d("A", "Can you give an example?", "مثالی می‌زنی؟"),
            d("B", "McDonald's in Japan serves teriyaki burgers. In India, they serve vegetarian options. That's arguably a form of adaptation.", "مک‌دونالد در ژاپن برگر تریاکی دارد. در هند گزینه‌های گیاهی دارد. این قابل استدلال نوعی سازگاری است."),
            d("A", "So it's not just one-way?", "پس یک‌طرفه نیست؟"),
            d("B", "Probably not. There's a tendency to think of globalization as Western dominance, but the reality is more nuanced.", "احتمالاً نه. تمایلی هست که جهانی‌سازی را تسلط غربی در نظر بگیریم، ولی واقعیت ظریف‌تر است."),
            d("A", "What about endangered languages?", "زبان‌های در خطر چطور؟"),
            d("B", "That's a real concern. It seems likely that half the world's languages will disappear this century.", "نگرانی واقعی‌ست. به نظر می‌رسد نیمی از زبان‌های جهان در این قرن ناپدید شوند."),
            d("A", "Can anything be done?", "کاری می‌شود کرد؟"),
            d("B", "To some extent. Language preservation efforts help, but the pressures are enormous.", "تا حدی. تلاش‌های حفظ زبان کمک می‌کند، ولی فشارها عظیمند."),
            d("A", "Is there a risk of cultural appropriation?", "خطر تصاحب فرهنگی هست؟"),
            d("B", "In many ways, yes. There's a fine line between appreciation and appropriation.", "از بسیاری جهات، بله. خط باریکی بین قدردانی و تصاحب وجود دارد."),
            d("A", "Where do you draw it?", "کجا خط می‌کشی؟"),
            d("B", "Arguably, it's about respect and context. Using elements of a culture without understanding is appropriation.", "قابل استدلال، درباره احترام و زمینه است. استفاده از عناصر یک فرهنگ بدون درک، تصاحب است."),
            d("A", "Do you think future cultures will be hybrid?", "فکر می‌کنی فرهنگ‌های آینده ترکیبی خواهند بود؟"),
            d("B", "I would say so. Hybrid cultures are already emerging, and they're often vibrant and creative.", "بله می‌گویم. فرهنگ‌های ترکیبی الان در حال ظهورند، و اغلب پرجنب و جوش و خلاقند."),
            d("A", "That sounds optimistic.", "خوش‌بینانه به نظر می‌رسد."),
            d("B", "It's not naive optimism. It's just that cultures have always evolved and blended.", "خوش‌بینی ساده‌لوحانه نیست. فقط اینکه فرهنگ‌ها همیشه تکامل یافته و ترکیب شده‌اند.")
        ),
        listOf(
            q("How has McDonald's adapted in Japan?", listOf("veggie burgers", "teriyaki burgers", "no change"), 1),
            q("What will happen to half the world's languages?", listOf("grow", "disappear", "stay same"), 1),
            q("It ___ be argued that globalization is homogenizing.", listOf("could", "can", "will"), 0),
            q("There's a tendency ___ blend cultures.", listOf("to", "for", "of"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Fine line", "خط باریک", "There's a fine line.", "خط باریکی وجود دارد."),
            IdiomExpression("One-way", "یک‌طرفه", "It's not just one-way.", "فقط یک‌طرفه نیست."),
            IdiomExpression("Nuanced", "ظریف", "The reality is more nuanced.", "واقعیت ظریف‌تر است.")
        ),
        pron = listOf(
            PronunciationTip("Hedging language", "Hedging softens claims. Stress the hedging word: It COULD be argued. There's a TENDENCY to.")
        ),
        cult = listOf(
            CulturalNote("Cultural globalization", "Some view it as a threat to diversity. Others see it as a catalyst for creative hybridity. The reality is complex.")
        ),
        mis = listOf(
            CommonMistake("It can be argued.", "It could be argued.", "Could is more hedged."),
            CommonMistake("There's tendency to blend.", "There's a tendency to blend.", "Add 'a'.")
        )
    )

    private fun f8B() = base(33, "8B Global economy", "۸B اقتصاد جهانی",
        listOf(
            "Use complex cause and effect structures",
            "Discuss economic issues",
            "Analyse interconnections"
        ),
        listOf(
            v("supply chain", "زنجیره تأمین", "Global supply chain.", "زنجیره تأمین جهانی."),
            v("outsource", "برون‌سپاری", "Outsource production.", "تولید را برون‌سپاری کن.", "verb"),
            v("tariff", "تعرفه", "Trade tariffs.", "تعرفه‌های تجاری."),
            v("sanctions", "تحریم", "Economic sanctions.", "تحریم‌های اقتصادی."),
            v("recession", "رکود", "A global recession.", "رکود جهانی."),
            v("inflation", "تورم", "Rising inflation.", "تورم در حال افزایش."),
            v("interdependent", "وابسته به هم", "Interdependent economies.", "اقتصادهای وابسته به هم.", "adjective"),
            v("volatile", "بی‌ثبات", "Volatile markets.", "بازارهای بی‌ثبات.", "adjective"),
            v("diversify", "تنوع بخشیدن", "Diversify the economy.", "اقتصاد را متنوع کن.", "verb"),
            v("regulation", "مقررات", "Financial regulation.", "مقررات مالی."),
            v("subsidy", "یارانه", "Agricultural subsidies.", "یارانه‌های کشاورزی."),
            v("protectionism", "حمایت‌گرایی", "Rising protectionism.", "حمایت‌گرایی در حال افزایش.")
        ),
        listOf(
            GrammarSection("Cause and effect", "Because of, due to, owing to, as a result of, consequently, therefore."),
            GrammarSection("Complex cause", "The crisis, which began in 2008, was caused by multiple factors."),
            GrammarSection("Result clauses", "So that, such that, with the result that.")
        ),
        listOf(
            d("A", "Do you think the global economy is too interconnected?", "فکر می‌کنی اقتصاد جهانی بیش از حد به هم وابسته است؟"),
            d("B", "That's the central question, isn't it? Interdependence brings benefits and risks.", "این سؤال اصلی است، نه؟ وابستگی متقابل مزایا و ریسک‌ها می‌آورد."),
            d("A", "What kind of risks?", "چه نوع ریسک‌هایی؟"),
            d("B", "As we saw in 2008, a crisis in one country can spread globally within weeks.", "همانطور که در ۲۰۰۸ دیدیم، بحران در یک کشور می‌تواند در عرض هفته‌ها جهانی شود."),
            d("A", "Was that preventable?", "قابل پیشگیری بود؟"),
            d("B", "Partly. Weak regulation, which allowed reckless lending, was a major cause.", "تا حدی. مقررات ضعیف، که وام‌دهی بی‌پروا را مجاز می‌کرد، علت اصلی بود."),
            d("A", "What changed after?", "بعدش چه عوض شد؟"),
            d("B", "Regulations tightened, causing banks to hold more capital. As a result, some say the system is safer now.", "مقررات سخت‌تر شد، باعث شد بانک‌ها سرمایه بیشتری نگه دارند. در نتیجه، بعضی می‌گویند سیستم الان امن‌تر است."),
            d("A", "Do you agree?", "موافقی؟"),
            d("B", "To some extent. But new risks have emerged — particularly from the tech sector and crypto.", "تا حدی. ولی ریسک‌های جدیدی ظهور کرده‌اند — مخصوصاً از بخش فناوری و کریپتو."),
            d("A", "What about supply chains?", "زنجیره‌های تأمین چطور؟"),
            d("B", "The pandemic exposed how fragile they are. Because of just-in-time production, a single disruption can halt everything.", "پاندمی نشان داد چقدر شکننده‌اند. به خاطر تولید به موقع، یک اختلال واحد می‌تواند همه چیز را متوقف کند."),
            d("A", "Have companies diversified?", "شرکت‌ها متنوع کرده‌اند؟"),
            d("B", "Many have. Others are moving production closer to home, which is often called 'reshoring'.", "بسیاری کرده‌اند. دیگران تولید را نزدیک‌تر به خانه منتقل می‌کنند، که اغلب 'reshoring' نامیده می‌شود."),
            d("A", "Is protectionism rising?", "حمایت‌گرایی در حال افزایش است؟"),
            d("B", "Yes, unfortunately. Tariffs and sanctions are being used more frequently. Consequently, trade is slowing.", "بله، متأسفانه. تعرفه‌ها و تحریم‌ها بیشتر استفاده می‌شوند. در نتیجه، تجارت کند می‌شود."),
            d("A", "Does that worry you?", "نگرانت می‌کند؟"),
            d("B", "Owing to past experience, yes. Trade wars historically precede recessions.", "به دلیل تجربه گذشته، بله. جنگ‌های تجاری تاریخی قبل از رکودها می‌آیند."),
            d("A", "What should be done?", "چیکار باید کرد؟"),
            d("B", "Diversification — of both economies and supply chains. So that no single shock can devastate everything.", "تنوع — هم اقتصادها و هم زنجیره‌های تأمین. تا هیچ شوک واحدی نتواند همه چیز را ویران کند."),
            d("A", "That's a sensible approach.", "رویکرد منطقی‌ست.")
        ),
        listOf(
            q("What caused the 2008 crisis?", listOf("tariffs", "weak regulation", "inflation"), 1),
            q("What is reshoring?", listOf("outsourcing", "moving production home", "tariffs"), 1),
            q("___ weak regulation, the crisis happened.", listOf("Because", "Owing to", "Due"), 1),
            q("Trade wars historically ___ recessions.", listOf("precede", "precede to", "preceding"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Just-in-time", "به موقع", "Just-in-time production.", "تولید به موقع."),
            IdiomExpression("Spread globally", "جهانی شدن", "Can spread globally.", "می‌تواند جهانی شود."),
            IdiomExpression("Trade war", "جنگ تجاری", "Trade wars precede recessions.", "جنگ‌های تجاری قبل از رکودها می‌آیند.")
        ),
        pron = listOf(
            PronunciationTip("Cause and effect", "Stress the cause linkers: OWing to the crisis. AS A RESULT, some say...")
        ),
        cult = listOf(
            CulturalNote("Global economy", "The 2008 crisis led to the Dodd-Frank Act in the US and tougher EU banking rules. But globalization remains contested.")
        ),
        mis = listOf(
            CommonMistake("Due to weak regulation allowed lending.", "Due to weak regulation, which allowed lending.", "Due to + noun or relative clause."),
            CommonMistake("Because of just-in-time, ...", "Because of just-in-time production, ...", "Complete the noun.")
        )
    )

    private fun f8C() = base(34, "8C Global challenges", "۸C چالش‌های جهانی",
        listOf(
            "Use discourse markers",
            "Discuss global problems",
            "Propose solutions and priorities"
        ),
        listOf(
            v("pandemic", "پاندمی", "A global pandemic.", "پاندمی جهانی."),
            v("humanitarian", "انسانی", "A humanitarian crisis.", "بحران انسانی.", "adjective"),
            v("sustainable", "پایدار", "Sustainable development.", "توسعه پایدار.", "adjective"),
            v("cooperation", "همکاری", "International cooperation.", "همکاری بین‌المللی."),
            v("framework", "چارچوب", "A global framework.", "چارچوب جهانی."),
            v("commitment", "تعهد", "A firm commitment.", "تعهد قاطع."),
            v("tackle", "مقابله کردن", "Tackle poverty.", "با فقر مقابله کن.", "verb"),
            v("address", "رسیدگی کردن", "Address the crisis.", "به بحران رسیدگی کن.", "verb"),
            v("erode", "فرسایش دادن", "Erode trust.", "اعتماد را فرسایش بده.", "verb"),
            v("polarize", "قطبی کردن", "Polarized politics.", "سیاست قطبی.", "verb"),
            v("advocate", "حمایت کردن", "Advocate for change.", "از تغییر حمایت کن.", "verb"),
            v("reform", "اصلاحات", "Structural reform.", "اصلاحات ساختاری.")
        ),
        listOf(
            GrammarSection("Discourse markers", "Moreover, Furthermore, Nevertheless, Consequently, In contrast, By contrast."),
            GrammarSection("Concessive clauses", "While it's true that... Although... Even though... Despite the fact that..."),
            GrammarSection("Purpose and result", "In order to, so as to, with a view to, for the purpose of.")
        ),
        listOf(
            d("A", "What do you consider the most urgent global challenge?", "فوری‌ترین چالش جهانی به نظرت چیه؟"),
            d("B", "Climate change, without a doubt. Nevertheless, pandemics, inequality, and conflict are all interconnected.", "تغییرات اقلیمی، بدون شک. با این حال، پاندمی‌ها، نابرابری و درگیری همه به هم مرتبطند."),
            d("A", "How are they connected?", "چطور مرتبطند؟"),
            d("B", "Climate change exacerbates inequality. Consequently, vulnerable communities suffer the most.", "تغییرات اقلیمی نابرابری را تشدید می‌کند. در نتیجه، جوامع آسیب‌پذیر بیشترین رنج را می‌برند."),
            d("A", "What should be the priority?", "اولویت باید چه باشد؟"),
            d("B", "In order to address climate, we need international cooperation. But trust has been eroded.", "برای رسیدگی به اقلیم، به همکاری بین‌المللی نیاز داریم. ولی اعتماد فرسایش یافته."),
            d("A", "Why has trust eroded?", "چرا اعتماد فرسایش یافته؟"),
            d("B", "Because of broken promises. Moreover, politics has become increasingly polarized.", "به خاطر وعده‌های شکسته. به علاوه، سیاست به طور فزاینده قطبی شده."),
            d("A", "Is there any hope?", "امیدی هست؟"),
            d("B", "There is, though it requires commitment. While it's true that governments move slowly, technology has transformed what's possible.", "هست، هرچند نیازمند تعهد است. هرچند درست است که دولت‌ها کند حرکت می‌کنند، فناوری ممکن‌ها را متحول کرده."),
            d("A", "What kind of technology?", "چه نوع فناوری؟"),
            d("B", "Renewable energy, AI for climate modeling, carbon capture. All these could be game-changers.", "انرژی تجدیدپذیر، هوش مصنوعی برای مدل‌سازی اقلیمی، جذب کربن. همه این‌ها می‌توانند بازی‌ساز باشند."),
            d("A", "What's stopping us?", "چه چیزی مانع ماست؟"),
            d("B", "Political will, mostly. Even though the solutions exist, we lack the collective determination.", "بیشتر اراده سیاسی. هرچند راه‌حل‌ها وجود دارند، ما عزم جمعی کم داریم."),
            d("A", "What can individuals do?", "افراد چیکار می‌توانند بکنند؟"),
            d("B", "Advocate for change. Vote for leaders with vision. Reduce our own footprint. Every action matters.", "از تغییر حمایت کنید. به رهبران با دید رأی دهید. رد پای خودمان را کاهش دهیم. هر اقدام مهم است."),
            d("A", "Do you think we'll succeed?", "فکر می‌کنی موفق می‌شویم؟"),
            d("B", "I'm cautiously optimistic. In contrast to past crises, we now have the tools. What we need is the will.", "با احتیاط خوش‌بینم. برخلاف بحران‌های گذشته، الان ابزارها را داریم. آنچه لازم داریم اراده است."),
            d("A", "That's a hopeful way to see it.", "روش امیدوارکننده‌ای برای دیدنش.")
        ),
        listOf(
            q("What's the most urgent challenge per B?", listOf("pandemics", "climate change", "inequality"), 1),
            q("What's stopping us?", listOf("technology", "political will", "money"), 1),
            q("___ the solutions exist, we lack will.", listOf("Though", "Even though", "Because"), 1),
            q("___ order to address climate, we need cooperation.", listOf("In", "For", "On"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Game-changer", "بازی‌ساز", "All these could be game-changers.", "همه این‌ها می‌توانند بازی‌ساز باشند."),
            IdiomExpression("Political will", "اراده سیاسی", "Political will is lacking.", "اراده سیاسی کم است."),
            IdiomExpression("Erode trust", "اعتماد را فرسایش دادن", "Trust has been eroded.", "اعتماد فرسایش یافته.")
        ),
        pron = listOf(
            PronunciationTip("Discourse markers", "Pause slightly after discourse markers: Nevertheless, | we must act. Moreover, | the problem is complex.")
        ),
        cult = listOf(
            CulturalNote("Global cooperation", "The Paris Agreement (2015) was a landmark. But its effectiveness depends on enforcement, which remains weak.")
        ),
        mis = listOf(
            CommonMistake("Despite of the crisis.", "Despite the crisis.", "No 'of' after despite."),
            CommonMistake("Even though the solutions exist, we lack will.", "Even though the solutions exist, we lack will.", "Fine.")
        )
    )

    // ═══════════ FILE 9 — Justice and law ═══════════

    private fun f9A() = base(35, "9A Crime and punishment", "۹A جرم و مجازات",
        listOf(
            "Use passive voice with legal language",
            "Discuss crime and justice",
            "Debate rehabilitation vs punishment"
        ),
        listOf(
            v("justice", "عدالت", "Criminal justice.", "عدالت کیفری."),
            v("offender", "مجرم", "A repeat offender.", "مجرم سابقه‌دار."),
            v("sentence", "حکم", "A long sentence.", "حکم طولانی."),
            v("rehabilitate", "توانبخشی کردن", "Rehabilitate prisoners.", "زندانیان را توانبخشی کن.", "verb"),
            v("deterrent", "بازدارنده", "A strong deterrent.", "بازدارنده قوی."),
            v("prosecute", "تحت تعقیب قرار دادن", "Prosecute crimes.", "جرایم را تحت تعقیب قرار بده.", "verb"),
            v("acquit", "تبرئه کردن", "Acquitted of all charges.", "از همه اتهامات تبرئه شد.", "verb"),
            v("convict", "محکوم کردن", "Convict the accused.", "متهم را محکوم کن.", "verb"),
            v("retribution", "مجازات", "Retribution vs rehabilitation.", "مجازات در برابر توانبخشی."),
            v("recidivism", "عود", "High recidivism rates.", "نرخ بالای عود."),
            v("prosecution", "دادستانی", "The prosecution's case.", "پرونده دادستانی."),
            v("verdict", "حکم", "Reach a verdict.", "حکم صادر کنید.")
        ),
        listOf(
            GrammarSection("Passive in legal contexts", "The suspect was arrested. He has been charged. The case will be heard."),
            GrammarSection("Passive with modals", "Offenders should be rehabilitated. Prisoners must be treated humanely."),
            GrammarSection("Impersonal structures", "It is argued that... It has been demonstrated that... It's widely believed that...")
        ),
        listOf(
            d("A", "Do you think prisons actually work?", "فکر می‌کنی زندان‌ها واقعاً کار می‌کنند؟"),
            d("B", "It depends what we mean by 'work'. If it's about punishment, yes. If it's about rehabilitation, mostly no.", "بستگی دارد 'کار کردن' چه معنایی داشته باشد. اگر در مورد مجازات باشد، بله. اگر در مورد توانبخشی باشد، بیشتر نه."),
            d("A", "What are the stats?", "آمار چطوره؟"),
            d("B", "Recidivism rates are staggering. It's been demonstrated that in some countries over 60% re-offend within three years.", "نرخ عود تکان‌دهنده‌ست. نشان داده شده که در بعضی کشورها بیش از ۶۰٪ در سه سال دوباره جرم می‌کنند."),
            d("A", "So what's the alternative?", "پس جایگزین چیه؟"),
            d("B", "Rehabilitation-focused systems, like Norway's. Prisons are being redesigned to prepare people for release.", "سیستم‌های متمرکز بر توانبخشی، مثل نروژ. زندان‌ها بازطراحی می‌شوند تا افراد را برای آزادی آماده کنند."),
            d("A", "What do they do differently?", "چه کار متفاوتی می‌کنند؟"),
            d("B", "Offenders are treated humanely. They're given education and job training. Recidivism there is among the lowest in the world.", "با مجرمان انسانی رفتار می‌شود. آموزش و آموزش شغلی می‌گیرند. عود آنجا یکی از پایین‌ترین‌ها در جهانه."),
            d("A", "But isn't that too soft?", "ولی این خیلی نرم نیست؟"),
            d("B", "It's a common view, but it's not supported by evidence. Harsh punishment, it's been argued, makes people more likely to re-offend.", "دیدگاه رایجی‌ست، ولی توسط شواهد پشتیبانی نمی‌شود. استدلال شده که مجازات سخت باعث می‌شود افراد بیشتر احتمال عود داشته باشند."),
            d("A", "So what should be done?", "پس چیکار باید کرد؟"),
            d("B", "Violent offenders should be kept away, obviously. But non-violent offenders could be rehabilitated in the community.", "مجرمین خشن باید دور نگه داشته شوند، بدیهی‌ست. ولی مجرمین غیرخشن می‌توانند در جامعه توانبخشی شوند."),
            d("A", "Do you think that's realistic?", "فکر می‌کنی واقع‌بینانه‌ست؟"),
            d("B", "It's being done in several countries. It's not utopian — it's evidence-based.", "در چندین کشور انجام می‌شود. آرمان‌شهر نیست — مبتنی بر شواهد است."),
            d("A", "What about victims' rights?", "حقوق قربانیان چطور؟"),
            d("B", "That's crucial and often overlooked. Restorative justice, where victims and offenders meet, has shown promising results.", "حیاتی‌ست و اغلب نادیده گرفته می‌شود. عدالت ترمیمی، جایی که قربانیان و مجرمان ملاقات می‌کنند، نتایج امیدوارکننده‌ای نشان داده."),
            d("A", "Do you think the system will change?", "فکر می‌کنی سیستم تغییر می‌کند؟"),
            d("B", "Slowly. Politicians fear being seen as 'soft on crime'. But evidence is mounting.", "به آرامی. سیاستمداران می‌ترسند 'نرم در برابر جرم' دیده شوند. ولی شواهد انباشته می‌شوند."),
            d("A", "That's a hopeful sign.", "نشانه امیدوارکننده‌ای‌ست.")
        ),
        listOf(
            q("What does B think of prisons?", listOf("perfect", "good for rehab", "mostly not rehab"), 2),
            q("What's Norway's approach?", listOf("harsh", "rehabilitation-focused", "no prisons"), 1),
            q("The suspect ___ arrested.", listOf("was", "were", "is"), 0),
            q("Offenders should ___ rehabilitated.", listOf("be", "been", "being"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Soft on crime", "نرم در برابر جرم", "Seen as soft on crime.", "نرم در برابر جرم دیده شدن."),
            IdiomExpression("Re-offend", "دوباره جرم کردن", "Re-offend within three years.", "در سه سال دوباره جرم کردن."),
            IdiomExpression("Restorative justice", "عدالت ترمیمی", "Restorative justice.", "عدالت ترمیمی.")
        ),
        pron = listOf(
            PronunciationTip("Passive in legal language", "Focus on the past participle: The suspect was ARRESTED. He has been CHARGED.")
        ),
        cult = listOf(
            CulturalNote("Prisons", "The US has the highest incarceration rate in the developed world. Norway, Sweden, and Japan focus on rehabilitation.")
        ),
        mis = listOf(
            CommonMistake("The suspect was arrest.", "The suspect was arrested.", "Past participle."),
            CommonMistake("Offenders should rehabilitate.", "Offenders should be rehabilitated.", "Passive with modal.")
        )
    )

    private fun f9B() = base(36, "9B Human rights", "۹B حقوق بشر",
        listOf(
            "Use concessive and contrastive structures",
            "Discuss human rights issues",
            "Debate universality vs cultural relativism"
        ),
        listOf(
            v("rights", "حقوق", "Human rights.", "حقوق بشر."),
            v("universal", "جهانی", "Universal rights.", "حقوق جهانی.", "adjective"),
            v("entitled", "محق", "Entitled to freedom.", "محق به آزادی.", "adjective"),
            v("violate", "نقض کردن", "Violate rights.", "حقوق را نقض کن.", "verb"),
            v("advocate", "حمایت کردن", "Advocate for refugees.", "از پناهندگان حمایت کن.", "verb"),
            v("persecute", "آزار و اذیت کردن", "Persecuted minorities.", "اقلیت‌های تحت آزار.", "verb"),
            v("asylum", "پناهندگی", "Seek asylum.", "پناهندگی بگیر."),
            v("fundamental", "بنیادین", "Fundamental rights.", "حقوق بنیادین.", "adjective"),
            v("compromise", "سازش", "Compromise on principles.", "در اصول سازش کن."),
            v("accountability", "پاسخگویی", "Government accountability.", "پاسخگویی دولت."),
            v("dignity", "کرامت", "Human dignity.", "کرامت انسانی."),
            v("conscience", "وجدان", "Freedom of conscience.", "آزادی وجدان.")
        ),
        listOf(
            GrammarSection("Concessive clauses", "While it's true that... Even though... Despite the fact that..."),
            GrammarSection("Contrast", "However, Nevertheless, Nonetheless, That said."),
            GrammarSection("Universal principles", "All human beings are entitled to... No one shall be subjected to...")
        ),
        listOf(
            d("A", "Do you think human rights are truly universal?", "فکر می‌کنی حقوق بشر واقعاً جهانی‌اند؟"),
            d("B", "That's a debated question. While it's true that the UN declares them universal, implementation is another matter.", "سؤال بحث‌برانگیزی‌ست. هرچند درست است که سازمان ملل آنها را جهانی اعلام می‌کند، اجرا مسئله دیگری‌ست."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "Some argue that human rights are Western constructs. Others say certain rights are fundamental regardless of culture.", "بعضی استدلال می‌کنند که حقوق بشر ساختارهای غربی‌اند. دیگران می‌گویند بعضی حقوق صرف‌نظر از فرهنگ بنیادین‌اند."),
            d("A", "Where do you stand?", "موضعت چیست؟"),
            d("B", "I lean toward universality. Even though cultures differ, the right to life, freedom from torture — these transcend culture.", "به سمت جهانی بودن متمایلم. هرچند فرهنگ‌ها متفاوتند، حق زندگی، آزادی از شکنجه — اینها فراتر از فرهنگ‌اند."),
            d("A", "But who enforces them?", "ولی چه کسی اجرایشان می‌کند؟"),
            d("B", "That's the crux. The International Criminal Court, regional courts, NGOs — all try, but enforcement remains inconsistent.", "این نکته اصلی‌ست. دادگاه کیفری بین‌المللی، دادگاه‌های منطقه‌ای، سازمان‌های غیردولتی — همه تلاش می‌کنند، ولی اجرا ناهمگون است."),
            d("A", "Do sanctions work?", "تحریم‌ها کار می‌کنند؟"),
            d("B", "Sometimes, though often they hurt the population more than the regime. That said, they can pressure governments.", "گاهی، هرچند اغلب بیشتر به جمعیت آسیب می‌زنند تا رژیم. با این حال، می‌توانند به دولت‌ها فشار بیاورند."),
            d("A", "Have you followed any recent cases?", "پرونده‌های اخیر را دنبال کرده‌ای؟"),
            d("B", "Yes, several. The Uyghur situation in China, human rights in Iran, the Rohingya in Myanmar. All deeply troubling.", "بله، چندین. وضعیت اویغورها در چین، حقوق بشر در ایران، روهینگیا در میانمار. همه عمیقاً نگران‌کننده."),
            d("A", "Why don't governments intervene more?", "چرا دولت‌ها بیشتر مداخله نمی‌کنند؟"),
            d("B", "Because intervention is costly and geopolitically complicated. Nevertheless, inaction has its own costs.", "چون مداخله پرهزینه و ژئوپلیتیکی پیچیده است. با این حال، بی‌عملی هزینه‌های خودش را دارد."),
            d("A", "What can ordinary people do?", "مردم عادی چیکار می‌توانند بکنند؟"),
            d("B", "Support NGOs. Advocate for refugees. Vote for leaders who prioritize human rights.", "از سازمان‌های غیردولتی حمایت کنید. از پناهندگان حمایت کنید. به رهبرانی رأی دهید که حقوق بشر را اولویت می‌دهند."),
            d("A", "Does that really make a difference?", "واقعاً تأثیر دارد؟"),
            d("B", "It does, even though progress is slow. History shows that sustained pressure eventually works.", "دارد، هرچند پیشرفت آهسته است. تاریخ نشان می‌دهد فشار پایدار در نهایت کار می‌کند.")
        ),
        listOf(
            q("What is the crux for B?", listOf("definition", "enforcement", "language"), 1),
            q("What does B think about universality?", listOf("Western", "universal", "irrelevant"), 1),
            q("___ it's true that the UN declares them universal, implementation varies.", listOf("While", "Because", "Since"), 0),
            q("___ the cultures differ, the right to life transcends culture.", listOf("Even though", "Because", "Since"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Where do you stand?", "موضعت چیه؟", "Where do you stand?", "موضعت چیه؟"),
            IdiomExpression("The crux", "نکته اصلی", "That's the crux.", "این نکته اصلی‌ست."),
            IdiomExpression("Make a difference", "تأثیر داشتن", "Does it make a difference?", "تأثیر دارد؟")
        ),
        pron = listOf(
            PronunciationTip("Concessive stress", "Stress the concession: WHILE it's true, ... EVEN THOUGH cultures differ, ...")
        ),
        cult = listOf(
            CulturalNote("UDHR", "The Universal Declaration of Human Rights (1948) is the foundational document. It's been translated into 500+ languages — the most translated document in history.")
        ),
        mis = listOf(
            CommonMistake("Even though cultures differ, they transcend.", "Even though cultures differ, certain rights transcend culture.", "Complete the concession."),
            CommonMistake("Despite cultures differ.", "Despite the fact that cultures differ.", "Despite + noun.")
        )
    )

    private fun f9C() = base(37, "9C Civil liberties", "۹C آزادی‌های مدنی",
        listOf(
            "Use modal perfect structures",
            "Discuss freedom and privacy",
            "Balance security and liberty"
        ),
        listOf(
            v("liberty", "آزادی", "Civil liberties.", "آزادی‌های مدنی."),
            v("surveillance", "نظارت", "Mass surveillance.", "نظارت جمعی."),
            v("censorship", "سانسور", "Internet censorship.", "سانسور اینترنت."),
            v("freedom of speech", "آزادی بیان", "Restrict freedom of speech.", "آزادی بیان را محدود کن."),
            v("protest", "اعتراض", "Right to protest.", "حق اعتراض."),
            v("detain", "بازداشت کردن", "Detained without trial.", "بدون محاکمه بازداشت شد.", "verb"),
            v("encrypt", "رمزگذاری کردن", "Encrypted communication.", "ارتباط رمزگذاری‌شده.", "verb"),
            v("whistleblower", "سوت‌زن", "A famous whistleblower.", "سوت‌زن معروف."),
            v("leak", "افشا کردن", "Leaked documents.", "اسناد افشاشده.", "verb"),
            v("invade", "نقض کردن", "Invade privacy.", "حریم خصوصی را نقض کن.", "verb"),
            v("tolerate", "تحمل کردن", "Tolerate dissent.", "مخالفت را تحمل کن.", "verb"),
            v("balance", "تعادل", "Balance security and liberty.", "تعادل امنیت و آزادی.")
        ),
        listOf(
            GrammarSection("Modal perfects", "They shouldn't have detained him. He might have been targeted. She must have known."),
            GrammarSection("Past modals of criticism", "The government should have acted sooner. They could have protected privacy."),
            GrammarSection("Speculating about the past", "It might have been leaked intentionally. She couldn't have known.")
        ),
        listOf(
            d("A", "Where should the line be drawn between security and liberty?", "خط بین امنیت و آزادی کجا باید کشیده شود؟"),
            d("B", "It's the oldest dilemma in political philosophy. Post-9/11, most countries moved toward security.", "قدیمی‌ترین دوراهی فلسفه سیاسی‌ست. بعد از ۱۱ سپتامبر، بیشتر کشورها به سمت امنیت رفتند."),
            d("A", "Was that the right call?", "تصمیم درستی بود؟"),
            d("B", "The government should have been more cautious. Mass surveillance programmes, which were rushed, may have eroded freedoms.", "دولت باید محتاط‌تر می‌بود. برنامه‌های نظارت جمعی، که با عجله اجرا شدند، ممکن است آزادی‌ها را فرسایش داده باشند."),
            d("A", "What programmes?", "چه برنامه‌هایی؟"),
            d("B", "The NSA, GCHQ, and others. They must have collected enormous amounts of data on ordinary citizens.", "NSA، GCHQ، و دیگران. باید مقادیر عظیمی داده از شهروندان عادی جمع کرده باشند."),
            d("A", "Was that legal?", "قانونی بود؟"),
            d("B", "Debatable. Snowden, the whistleblower, revealed that in some cases it wasn't.", "قابل بحث. اسنودن، سوت‌زن، فاش کرد که در بعضی موارد نبود."),
            d("A", "Do you think Snowden did the right thing?", "فکر می‌کنی اسنودن کار درستی کرد؟"),
            d("B", "That's complicated. He might have endangered agents, though he exposed genuine abuses. It's not black and white.", "پیچیده است. ممکن است مأموران را به خطر انداخته باشد، هرچند سوءاستفاده‌های واقعی را افشا کرد. سیاه و سفید نیست."),
            d("A", "What about China and Russia?", "چین و روسیه چطور؟"),
            d("B", "Their surveillance is far more extensive. In some ways, Western countries could have been more vocal about it.", "نظارت آنها بسیار گسترده‌تر است. از بعضی جهات، کشورهای غربی می‌توانستند بلندتر در این مورد صحبت کنند."),
            d("A", "Why weren't they?", "چرا نبودند؟"),
            d("B", "Because of hypocrisy. It's hard to criticize others when you're doing similar things.", "به خاطر ریاکاری. سخت است وقتی خودت کارهای مشابه می‌کنی از دیگران انتقاد کنی."),
            d("A", "What about freedom of speech?", "آزادی بیان چطور؟"),
            d("B", "It's being tested everywhere. Even in democracies, there's pressure to censor certain views.", "همه جا آزمایش می‌شود. حتی در دموکراسی‌ها، فشار برای سانسور دیدگاه‌های خاصی هست."),
            d("A", "Should we tolerate all views?", "باید همه دیدگاه‌ها را تحمل کنیم؟"),
            d("B", "Not all. Incitement to violence, obviously not. But offensive ideas must be tolerated in a free society.", "نه همه. تحریک به خشونت، بدیهی‌ست نه. ولی ایده‌های توهین‌آمیز باید در جامعه آزاد تحمل شوند."),
            d("A", "Where's the line?", "خط کجاست؟"),
            d("B", "Speech becomes action when it directly incites harm. That's the line most legal systems use.", "گفتار وقتی به عمل تبدیل می‌شود که مستقیماً تحریک به آسیب کند. این خطی‌ست که بیشتر سیستم‌های حقوقی استفاده می‌کنند.")
        ),
        listOf(
            q("What programme did B mention?", listOf("Facebook", "NSA/GCHQ", "UN"), 1),
            q("Who is Snowden?", listOf("president", "whistleblower", "journalist"), 1),
            q("The government ___ have acted sooner.", listOf("should", "would", "can"), 0),
            q("They ___ have collected enormous data.", listOf("must", "can", "will"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Black and white", "سیاه و سفید", "Not black and white.", "سیاه و سفید نیست."),
            IdiomExpression("Vocal about", "بلند صحبت کردن درباره", "More vocal about it.", "بلندتر در این مورد صحبت کردن."),
            IdiomExpression("Incitement to violence", "تحریک به خشونت", "Not incitement to violence.", "نه تحریک به خشونت.")
        ),
        pron = listOf(
            PronunciationTip("Modal perfects", "Stress both the modal and 'have': They SHOULD have acted. She MUST have known.")
        ),
        cult = listOf(
            CulturalNote("Post-9/11 surveillance", "The Patriot Act in the US and similar laws elsewhere expanded state surveillance. Snowden's 2013 leaks changed the debate.")
        ),
        mis = listOf(
            CommonMistake("They should have act.", "They should have acted.", "Past participle."),
            CommonMistake("It might have been leak.", "It might have been leaked.", "Past participle in passive.")
        )
    )

    // ═══════════ FILE 10 — The future ═══════════

    private fun f10A() = base(38, "10A Future technologies", "۱۰A فناوری‌های آینده",
        listOf(
            "Use advanced future forms",
            "Speculate about future technologies",
            "Discuss plausibility and timelines"
        ),
        listOf(
            v("quantum", "کوانتومی", "Quantum computing.", "محاسبات کوانتومی.", "adjective"),
            v("biotech", "بیوتکنولوژی", "Advances in biotech.", "پیشرفت‌های بیوتکنولوژی."),
            v("nanotech", "نانوتکنولوژی", "Nanotech applications.", "کاربردهای نانوتکنولوژی."),
            v("space tourism", "گردشگری فضایی", "Space tourism is growing.", "گردشگری فضایی در حال رشد است."),
            v("colonize", "مستعمره کردن", "Colonize Mars.", "مریخ را مستعمره کن.", "verb"),
            v("singularity", "تکینگی", "The technological singularity.", "تکینگی فناوری."),
            v("breakthrough", "پیشرفت بزرگ", "A major breakthrough.", "پیشرفت بزرگ."),
            v("futurist", "آینده‌نگر", "A prominent futurist.", "آینده‌نگر برجسته."),
            v("exponential", "نمایی", "Exponential growth.", "رشد نمایی.", "adjective"),
            v("augment", "افزایش دادن", "Augmented reality.", "واقعیت افزوده.", "verb"),
            v("integration", "ادغام", "Human-AI integration.", "ادغام انسان-هوش مصنوعی."),
            v("paradigm", "پارادایم", "A paradigm shift.", "تغییر پارادایم.")
        ),
        listOf(
            GrammarSection("Future perfect continuous", "By 2050, we will have been using AI for decades."),
            GrammarSection("Future in the past", "They thought we would have colonized Mars by now."),
            GrammarSection("Advanced speculation", "It's bound to happen. It's on the verge of becoming reality. It's only a matter of time.")
        ),
        listOf(
            d("A", "What technological breakthroughs do you expect in our lifetime?", "چه پیشرفت‌های فناوری در طول عمرمان انتظار داری؟"),
            d("B", "Many. By 2050, we will have been using AI for decades. It's bound to transform everything.", "زیاد. تا ۲۰۵۰، دهه‌ها از هوش مصنوعی استفاده کرده‌ایم. قطعاً همه چیز را متحول می‌کند."),
            d("A", "What kind of transformation?", "چه نوع تحولی؟"),
            d("B", "Healthcare, education, work. It's on the verge of becoming a general-purpose technology, like electricity.", "سلامت، آموزش، کار. در آستانه تبدیل شدن به فناوری همه‌منظوره است، مثل برق."),
            d("A", "What about quantum computing?", "محاسبات کوانتومی چطور؟"),
            d("B", "It's only a matter of time. When it matures, it will have broken modern encryption.", "فقط مسئله زمان است. وقتی بالغ شود، رمزنگاری مدرن را شکسته خواهد بود."),
            d("A", "That sounds dangerous.", "خطرناک به نظر می‌رسد."),
            d("B", "It is, in some ways. Quantum computers could also solve problems we can't even imagine.", "از بعضی جهات هست. کامپیوترهای کوانتومی می‌توانند مسائلی را حل کنند که حتی تصورشان را نمی‌توانیم."),
            d("A", "Will we colonize Mars?", "مریخ را مستعمره می‌کنیم؟"),
            d("B", "Possibly, though it will be harder than people think. Scientists had thought we'd have done it by 2020.", "احتمالاً، هرچند سخت‌تر از آنچه مردم فکر می‌کنند خواهد بود. دانشمندان فکر می‌کردند تا ۲۰۲۰ انجامش داده‌ایم."),
            d("A", "What about the singularity?", "تکینگی چطور؟"),
            d("B", "That's more speculative. Some futurists believe it will happen by 2045. Others think it's science fiction.", "این حدس‌آمیزتر است. بعضی آینده‌نگران باور دارند تا ۲۰۴۵ اتفاق می‌افتد. دیگران فکر می‌کنند داستان علمی-تخیلی‌ست."),
            d("A", "Which camp are you in?", "در کدام دسته‌ای؟"),
            d("B", "Cautiously agnostic. Exponential growth is real, but predicting its consequences is notoriously difficult.", "با احتیاط لاادری. رشد نمایی واقعی‌ست، ولی پیش‌بینی پیامدهایش به طور بدنامی سخت است."),
            d("A", "What worries you most?", "بیشتر چه چیزی نگرانت می‌کند؟"),
            d("B", "Bioweapons or unaligned AI. Either could be catastrophic if mishandled.", "سلاح‌های بیولوژیک یا هوش مصنوعی ناهم‌راستا. هرکدام می‌تواند اگر بد مدیریت شود فاجعه‌بار باشد."),
            d("A", "What excites you?", "چه چیزی هیجان‌زده‌ات می‌کند؟"),
            d("B", "Ending disease. Solving climate change. Giving everyone access to education. The potential is enormous.", "پایان دادن به بیماری. حل تغییرات اقلیمی. دسترسی همه به آموزش. پتانسیل عظیم است."),
            d("A", "Do you think we'll manage it well?", "فکر می‌کنی خوب مدیریتش می‌کنیم؟"),
            d("B", "That depends on governance. If we're wise, we'll navigate it. If not, we'll stumble through it.", "بستگی به حکمرانی دارد. اگر عاقل باشیم، از آن عبور می‌کنیم. اگر نه، در آن دست و پا می‌زنیم.")
        ),
        listOf(
            q("By 2050, what will we have been using?", listOf("quantum", "AI", "biotech"), 1),
            q("What could quantum computers break?", listOf("physics", "encryption", "AI"), 1),
            q("By 2050, we ___ have been using AI for decades.", listOf("will", "would", "are"), 0),
            q("It's only a matter of ___.", listOf("time", "when", "then"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Bound to", "قطعاً", "It's bound to happen.", "قطعاً اتفاق می‌افتد."),
            IdiomExpression("On the verge of", "در آستانه", "On the verge of becoming reality.", "در آستانه تبدیل شدن به واقعیت."),
            IdiomExpression("Only a matter of time", "فقط مسئله زمان", "Only a matter of time.", "فقط مسئله زمان است.")
        ),
        pron = listOf(
            PronunciationTip("Future perfect continuous", "Stress 'have been': By 2050, we will HAVE BEEN using AI.")
        ),
        cult = listOf(
            CulturalNote("Futurism", "Ray Kurzweil predicts the singularity by 2045. Others, like Steven Pinker, are more skeptical of dramatic predictions.")
        ),
        mis = listOf(
            CommonMistake("By 2050, we will have used AI for decades.", "By 2050, we will have been using AI for decades.", "Continuous for ongoing action."),
            CommonMistake("It's on the verge to happen.", "It's on the verge of happening.", "On the verge of + gerund.")
        )
    )

    private fun f10B() = base(39, "10B Alternative futures", "۱۰B آینده‌های جایگزین",
        listOf(
            "Use hypothetical structures",
            "Explore possible futures",
            "Debate optimistic vs pessimistic scenarios"
        ),
        listOf(
            v("scenario", "سناریو", "A plausible scenario.", "سناریوی محتمل."),
            v("dystopian", "دیستوپیایی", "A dystopian future.", "آینده دیستوپیایی.", "adjective"),
            v("utopian", "آرمان‌شهر", "A utopian vision.", "چشم‌انداز آرمان‌شهر.", "adjective"),
            v("plausible", "محتمل", "A plausible outcome.", "نتیجه محتمل.", "adjective"),
            v("speculate", "حدس زدن", "Speculate about the future.", "درباره آینده حدس بزن.", "verb"),
            v("inevitable", "اجتناب‌ناپذیر", "An inevitable shift.", "تغییر اجتناب‌ناپذیر.", "adjective"),
            v("trajectory", "مسیر", "The current trajectory.", "مسیر فعلی."),
            v("fork", "دوشاخه", "A fork in the road.", "دوشاخه در راه."),
            v("envision", "تصور کردن", "Envision a future.", "آینده‌ای را تصور کن.", "verb"),
            v("diverge", "واگرا شدن", "Futures diverge.", "آینده‌ها واگرا می‌شوند.", "verb"),
            v("downfall", "سقوط", "The downfall of civilization.", "سقوط تمدن."),
            v("resilience", "تاب‌آوری", "Societal resilience.", "تاب‌آوری اجتماعی.")
        ),
        listOf(
            GrammarSection("Hypothetical futures", "If we continue on this path, we would eventually face collapse."),
            GrammarSection("Second conditional for imagined futures", "If governments acted now, we could avoid the worst."),
            GrammarSection("Third conditional for counterfactuals", "If we had acted earlier, we wouldn't be in this position.")
        ),
        listOf(
            d("A", "What kind of future do you envision?", "چه نوع آینده‌ای تصور می‌کنی؟"),
            d("B", "It depends on which scenario plays out. If we continue on the current trajectory, it's dystopian.", "بستگی به سناریویی دارد که اتفاق می‌افتد. اگر در مسیر فعلی ادامه دهیم، دیستوپیایی‌ست."),
            d("A", "That's bleak. What would the dystopian scenario look like?", "تیره است. سناریوی دیستوپیایی چه شکلی می‌شود؟"),
            d("B", "If we continued as we are, we would eventually face climate collapse. Inequality would spiral. AI might concentrate power in a few hands.", "اگر همانطور که هستیم ادامه دهیم، در نهایت با فروپاشی اقلیمی مواجه می‌شویم. نابرابری مارپیچ می‌شود. هوش مصنوعی ممکن است قدرت را در چند دست متمرکز کند."),
            d("A", "Can we avoid that?", "می‌توانیم اجتناب کنیم؟"),
            d("B", "If governments acted decisively, yes. But they're slow and often captured by vested interests.", "اگر دولت‌ها قاطعانه عمل کنند، بله. ولی کند و اغلب توسط منافع خاص اسیرند."),
            d("A", "So what's the optimistic scenario?", "پس سناریوی خوش‌بینانه چیه؟"),
            d("B", "If we invested in clean energy, education, and equitable AI, we would enter a renaissance. Disease eradicated. Poverty halved.", "اگر روی انرژی پاک، آموزش، و هوش مصنوعی عادلانه سرمایه‌گذاری کنیم، وارد رنسانس می‌شویم. بیماری ریشه‌کن می‌شود. فقر نصف می‌شود."),
            d("A", "That sounds achievable.", "دست‌یافتنی به نظر می‌رسد."),
            d("B", "It is, though it requires cooperation. If we had acted in the 1990s, we'd be much further along now.", "هست، هرچند نیازمند همکاری است. اگر در دهه ۹۰ عمل کرده بودیم، الان خیلی جلوتر بودیم."),
            d("A", "What makes you hopeful?", "چه چیزی بهت امید می‌دهد؟"),
            d("B", "Resilience. Humans are remarkably adaptable. Even in dystopian scenarios, communities find ways to survive.", "تاب‌آوری. انسان‌ها به طور قابل توجهی سازگارند. حتی در سناریوهای دیستوپیایی، جوامع راه‌هایی برای زنده ماندن پیدا می‌کنند."),
            d("A", "Do you think we'll get it right?", "فکر می‌کنی درست انجامش می‌دهیم؟"),
            d("B", "I hope so. If we didn't try, we would be morally bankrupt.", "امیدوارم. اگر تلاش نکنیم، از نظر اخلاقی ورشکسته می‌شویم."),
            d("A", "What can we do today?", "امروز چیکار می‌توانیم بکنیم؟"),
            d("B", "Vote thoughtfully. Support research. Reduce consumption. Teach the next generation. Small actions compound.", "اندیشمندانه رأی بده. از تحقیق حمایت کن. مصرف را کاهش بده. به نسل بعد بیاموز. اقدامات کوچک تجمیع می‌شوند."),
            d("A", "That's a good reminder.", "یادآوری خوبی‌ست.")
        ),
        listOf(
            q("What would the dystopian scenario involve?", listOf("space travel", "climate collapse", "technology ban"), 1),
            q("What makes B hopeful?", listOf("technology", "resilience", "government"), 1),
            q("If we ___ as we are, we would face collapse.", listOf("continue", "continued", "will continue"), 1),
            q("If we had acted in the 1990s, we ___ be further along.", listOf("would", "will", "are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Play out", "اتفاق افتادن", "Depending on how it plays out.", "بسته به اینکه چطور اتفاق بیفتد."),
            IdiomExpression("Vested interests", "منافع خاص", "Captured by vested interests.", "توسط منافع خاص اسیر شده."),
            IdiomExpression("Morally bankrupt", "ورشکسته اخلاقی", "We would be morally bankrupt.", "از نظر اخلاقی ورشکسته می‌شویم.")
        ),
        pron = listOf(
            PronunciationTip("Hypothetical structures", "Soften the modal with a slight pause: If we continued, | we would eventually face collapse.")
        ),
        cult = listOf(
            CulturalNote("Future scenarios", "The IPCC has multiple climate scenarios. AI safety researchers discuss both optimistic and pessimistic outcomes.")
        ),
        mis = listOf(
            CommonMistake("If we continue, we would face collapse.", "If we continued, we would face collapse.", "Match tenses: past + would."),
            CommonMistake("If we had acted, we would be in this position.", "If we had acted, we wouldn't be in this position.", "Negative for the desired outcome.")
        )
    )

    private fun f10C() = base(40, "10C Review and reflection", "۱۰C مرور و بازنگری",
        listOf(
            "Integrate advanced grammar",
            "Reflect on learning journey",
            "Prepare for C1 level"
        ),
        listOf(
            v("reflection", "بازنگری", "Reflection on progress.", "بازنگری بر پیشرفت."),
            v("consolidate", "تثبیت کردن", "Consolidate learning.", "یادگیری را تثبیت کن.", "verb"),
            v("competence", "شایستگی", "Linguistic competence.", "شایستگی زبانی."),
            v("fluency", "روانی", "Natural fluency.", "روانی طبیعی."),
            v("mastery", "تسلط", "Toward mastery.", "به سمت تسلط."),
            v("milestone", "نقطه عطف", "A major milestone.", "نقطه عطف بزرگ."),
            v("trajectory", "مسیر", "On an upward trajectory.", "در مسیر صعودی."),
            v("nuance", "ظرافت", "Appreciate nuance.", "ظرافت را درک کن."),
            v("register", "لحن", "Formal register.", "لحن رسمی."),
            v("idiomatic", "اصطلاحی", "Idiomatic expression.", "بیان اصطلاحی.", "adjective"),
            v("discourse", "گفتمان", "Academic discourse.", "گفتمان دانشگاهی."),
            v("proficient", "ماهر", "Proficient user.", "کاربر ماهر.", "adjective")
        ),
        listOf(
            GrammarSection("Integration of all structures", "Passive, conditionals, inversion, cleft, modals, relative clauses."),
            GrammarSection("Register awareness", "Formal vs informal. Academic vs colloquial. Spoken vs written."),
            GrammarSection("Discourse competence", "Cohesion, coherence, topic management, turn-taking.")
        ),
        listOf(
            d("A", "We've reached the end of Level 4. How do you feel?", "به پایان سطح ۴ رسیده‌ایم. چه حسی داری؟"),
            d("B", "Remarkably different from when we started. Looking back, I can't believe how much we've learned.", "به طور قابل توجهی متفاوت از وقتی شروع کردیم. به عقب نگاه می‌کنم، باور نمی‌کنم چقدر یاد گرفته‌ایم."),
            d("A", "What stands out most?", "بیشتر چه چیزی برجسته است؟"),
            d("B", "It's not just grammar. It's the ability to express complex ideas with nuance.", "فقط گرامر نیست. توانایی بیان ایده‌های پیچیده با ظرافت است."),
            d("A", "Give me an example.", "مثالی بزن."),
            d("B", "A year ago, I might have said 'This is bad.' Now I might say 'It could be argued that this has troubling implications.'", "یک سال پیش ممکن بود بگویم 'این بده.' الان ممکن است بگویم 'می‌توان استدلال کرد که این پیامدهای نگران‌کننده دارد.'"),
            d("A", "That's a huge leap.", "جهش بزرگی‌ست."),
            d("B", "It feels that way. What I've noticed most is that I now think in English, not translate.", "همینطور حس می‌شود. چیزی که بیشتر متوجه شده‌ام این است که الان به انگلیسی فکر می‌کنم، نه ترجمه."),
            d("A", "That's the biggest milestone.", "بزرگ‌ترین نقطه عطف است."),
            d("B", "Yes. It means the language has become part of me, not something external.", "بله. یعنی زبان بخشی از من شده، نه چیزی بیرونی."),
            d("A", "What will you work on next?", "بعدش روی چه چیزی کار می‌کنی؟"),
            d("B", "Idiomatic fluency and register control. I want to sound natural across all contexts.", "روانی اصطلاحی و کنترل لحن. می‌خواهم در همه زمینه‌ها طبیعی به نظر برسم."),
            d("A", "What about accents?", "لهجه چطور؟"),
            d("B", "Less important than clarity. I don't need to sound native, just be understood.", "کمتر از وضوح مهم است. نیازی ندارم بومی به نظر برسم، فقط فهمیده شوم."),
            d("A", "Wise. Any regrets?", "عاقلانه. پشیمانی؟"),
            d("B", "Only that I didn't start sooner. If I had begun ten years ago, I'd be fluent by now.", "فقط اینکه زودتر شروع نکردم. اگر ده سال پیش شروع کرده بودم، الان روان بودم."),
            d("A", "But you're here now. That's what matters.", "ولی الان اینجایی. این چیزی‌ست که مهم است."),
            d("B", "Absolutely. Never have I been more committed to anything.", "قطعاً. هرگز به چیزی متعهدتر نبوده‌ام."),
            d("A", "Ready for Level 5?", "برای سطح ۵ آماده‌ای؟"),
            d("B", "More than ready. It's what drives me forward.", "بیشتر از آماده. چیزی‌ست که مرا به جلو می‌راند."),
            d("A", "Let's continue the journey.", "بیایید سفر را ادامه دهیم."),
            d("B", "With pleasure. This is just the beginning.", "با کمال میل. این فقط شروع است.")
        ),
        listOf(
            q("What does B now do instead of translating?", listOf("guessing", "thinking in English", "miming"), 1),
            q("What will B work on next?", listOf("grammar", "idiomatic fluency", "writing"), 1),
            q("If I ___ begun ten years ago, I'd be fluent.", listOf("have", "had", "has"), 1),
            q("Never ___ I been more committed.", listOf("have", "had", "did"), 0)
        ),
        idioms = listOf(
            IdiomExpression("That's a huge leap", "جهش بزرگی‌ست", "That's a huge leap.", "جهش بزرگی‌ست."),
            IdiomExpression("With pleasure", "با کمال میل", "With pleasure.", "با کمال میل."),
            IdiomExpression("Just the beginning", "فقط شروع", "This is just the beginning.", "این فقط شروع است.")
        ),
        pron = listOf(
            PronunciationTip("Reflective tone", "Speak slowly with warmth. Pause after key reflections.")
        ),
        cult = listOf(
            CulturalNote("Language journey", "C1 is the threshold for academic and professional fluency. It typically takes 800-1000 hours of study from B2.")
        ),
        mis = listOf(
            CommonMistake("If I would have begun.", "If I had begun.", "Never 'would have' in if-clause."),
            CommonMistake("Never I have been.", "Never have I been.", "Inversion after negative.")
        )
    )
}   // ← ✅ پایان object