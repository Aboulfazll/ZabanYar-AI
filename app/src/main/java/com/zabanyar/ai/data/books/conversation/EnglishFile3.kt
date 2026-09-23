package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile3 {

    const val BOOK_ID = "english_file_3"

    fun getChapter(chapterNumber: Int): LessonContent {
        return when (chapterNumber) {
            1 -> chapter1()
            2 -> chapter2()
            3 -> chapter3()
            4 -> chapter4()
            5 -> chapter5()
            6 -> chapter6()
            7 -> chapter7()
            8 -> chapter8()
            9 -> chapter9()
            10 -> chapter10()
            11 -> chapter11()
            12 -> chapter12()
            else -> getDefaultContent(BOOK_ID, chapterNumber)
        }
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 1 — Experiences and Changes
    // ═══════════════════════════════════════════════════════════
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Experiences and Changes",
            titlePersian = "تجربه‌ها و تغییرات",
            objectives = listOf(
                "Talk about life experiences",
                "Describe recent changes",
                "Use the present perfect accurately",
                "Distinguish present perfect from simple past",
                "Use for and since with time expressions"
            ),
            vocabulary = listOf(
                VocabWord("experience", "تجربه", "/ɪkˈspɪəriəns/", "noun",
                    "Traveling alone was a valuable experience.",
                    "تنها سفر کردن تجربه ارزشمندی بود.",
                    "valuable experience, work experience"),
                VocabWord("recently", "اخیراً", "/ˈriːsəntli/", "adverb",
                    "I've recently started a new course.",
                    "اخیراً یک دوره جدید شروع کرده‌ام."),
                VocabWord("achievement", "دستاورد", "/əˈtʃiːvmənt/", "noun",
                    "Finishing the project was a major achievement.",
                    "تمام کردن پروژه یک دستاورد مهم بود."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun",
                    "I've had several opportunities to practice English.",
                    "چندین فرصت برای تمرین انگلیسی داشته‌ام."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "Learning a language can be a challenge.",
                    "یادگیری زبان می‌تواند یک چالش باشد."),
                VocabWord("improve", "بهبود دادن", "/ɪmˈpruːv/", "verb",
                    "My speaking has improved a lot.",
                    "مهارت صحبت کردنم خیلی بهتر شده است."),
                VocabWord("move", "نقل مکان کردن", "/muːv/", "verb",
                    "My family has moved to another city.",
                    "خانواده‌ام به شهر دیگری نقل مکان کرده‌اند."),
                VocabWord("settle", "جا افتادن", "/ˈsetl/", "verb",
                    "It took me a few months to settle into my new job.",
                    "چند ماه طول کشید تا در شغل جدیدم جا بیفتم."),
                VocabWord("adapt", "سازگار شدن", "/əˈdæpt/", "verb",
                    "It took time to adapt to the new environment.",
                    "سازگار شدن با محیط جدید زمان برد."),
                VocabWord("recent", "اخیر", "/ˈriːsənt/", "adjective",
                    "Have you heard about the recent changes?",
                    "درباره تغییرات اخیر شنیده‌ای؟"),
                VocabWord("lately", "این اواخر", "/ˈleɪtli/", "adverb",
                    "I've been very busy lately.",
                    "این اواخر خیلی مشغول بوده‌ام."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "I've made good progress this year.",
                    "امسال پیشرفت خوبی داشته‌ام.")
            ),
            idioms = listOf(
                IdiomExpression("step out of your comfort zone", "از محدوده امن خود خارج شدن",
                    "Learning a new language helped me step out of my comfort zone.",
                    "یادگیری یک زبان جدید به من کمک کرد از محدوده امن خود خارج شوم.", "neutral"),
                IdiomExpression("turning point", "نقطه عطف",
                    "Moving abroad was a turning point in my life.",
                    "مهاجرت به خارج از کشور نقطه عطفی در زندگی من بود.", "neutral"),
                IdiomExpression("come a long way", "پیشرفت زیادی کردن",
                    "You've come a long way since you started learning English.",
                    "از وقتی یادگیری انگلیسی را شروع کردی، خیلی پیشرفت کرده‌ای.", "informal")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("take up", "شروع کردن سرگرمی", "شروع کردن",
                    "I've taken up photography recently.",
                    "اخیراً عکاسی را شروع کرده‌ام.", "Sometimes"),
                PhrasalVerb("give up", "رها کردن", "دست کشیدن",
                    "I've never given up learning English.",
                    "هیچ‌وقت یادگیری انگلیسی را رها نکرده‌ام.", "Sometimes"),
                PhrasalVerb("catch up", "خود را رساندن / باخبر شدن", "خود را رساندن",
                    "Let's meet and catch up soon.",
                    "بیا به‌زودی همدیگر را ببینیم.", "No")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Present Perfect Contractions",
                    "در گفتار طبیعی، have و has کوتاه می‌شوند: I've, you've, he's, she's, we've, they've."),
                PronunciationTip("Have you...?",
                    "در گفتار سریع، Have you می‌تواند به شکل پیوسته شنیده شود."),
                PronunciationTip("Past Participles",
                    "به تلفظ شکل سوم افعال توجه کن: been، seen، written، taken.")
            ),
            culturalNotes = listOf(
                CulturalNote("Talking about experience",
                    "در مکالمات روزمره، سؤال‌هایی مانند Have you ever...? راه رایجی برای شروع صحبت درباره تجربه‌های شخصی هستند."),
                CulturalNote("Follow-up questions",
                    "بعد از یک پاسخ کوتاه، پرسیدن سؤال تکمیلی مثل When did you go? باعث طبیعی‌تر شدن مکالمه می‌شود.")
            ),
            grammar = listOf(
                GrammarSection("Present Perfect",
                    """
                        have/has + past participle

                        I have visited London.
                        She has started a new job.
                        They have moved to another city.

                        برای تجربه‌ها و اتفاق‌های گذشته با ارتباط با حال.
                    """.trimIndent()),
                GrammarSection("Have You Ever...?",
                    """
                        Have you ever traveled alone?
                        Have you ever worked abroad?

                        Yes, I have. / No, I haven't.

                        Yes, I have. I went to Japan in 2024.
                    """.trimIndent()),
                GrammarSection("Present Perfect vs Simple Past",
                    """
                        Present perfect: تجربه یا زمان نامشخص
                        I've visited Rome.

                        Simple past: زمان مشخص در گذشته
                        I visited Rome last summer.
                    """.trimIndent()),
                GrammarSection("For and Since",
                    """
                        for + مدت: I've lived here for three years.
                        since + نقطه شروع: I've lived here since 2023.

                        for two weeks / for a long time
                        since Monday / since I was a child
                    """.trimIndent()),
                GrammarSection("Present Perfect with Recently and Lately",
                    """
                        I've recently changed my job.
                        She's been very busy lately.
                        We've recently moved to a new apartment.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have visited London last year.", "I visited London last year.",
                    "وقتی زمان مشخص گذشته داریم، simple past استفاده می‌کنیم."),
                CommonMistake("I am here since 2022.", "I have been here since 2022.",
                    "برای موقعیتی که از گذشته شروع شده و هنوز ادامه دارد، present perfect."),
                CommonMistake("Have you ever went abroad?", "Have you ever gone abroad?",
                    "بعد از have/has باید past participle بیاید؛ go → gone."),
                CommonMistake("I have lived here since three years.", "I have lived here for three years.",
                    "for برای مدت، since برای نقطه شروع."),
                CommonMistake("She has seen him yesterday.", "She saw him yesterday.",
                    "yesterday زمان مشخص گذشته است.")
            ),
            conversation = listOf(
                DialogueLine("Alex", "You look different. Have you changed your hairstyle?",
                    "متفاوت به نظر می‌رسی. مدل موهایت را عوض کرده‌ای؟"),
                DialogueLine("Maya", "Yes, I have. I changed it a few weeks ago.",
                    "بله. چند هفته پیش عوضش کردم."),
                DialogueLine("Alex", "It looks nice! Have you done anything else new?",
                    "قشنگ شده! کار جدید دیگه‌ای هم کرده‌ای؟"),
                DialogueLine("Maya", "Actually, I've started a new job.",
                    "در واقع، شغل جدیدی شروع کرده‌ام."),
                DialogueLine("Alex", "Really? When did you start?",
                    "واقعاً؟ کِی شروع کردی؟"),
                DialogueLine("Maya", "I started last month. I work at a marketing company now.",
                    "ماه پیش شروع کردم. الان در یه شرکت بازاریابی کار می‌کنم."),
                DialogueLine("Alex", "How do you like it so far?",
                    "تا حالا چطور دوستش داری؟"),
                DialogueLine("Maya", "It's great. I've learned so many new things already.",
                    "عالیه. تا حالا چیزهای جدید زیادی یاد گرفته‌ام."),
                DialogueLine("Alex", "That's wonderful. Have you made new friends there?",
                    "فوق‌العاده است. اونجا دوستای جدید پیدا کرده‌ای؟"),
                DialogueLine("Maya", "Yes, I have. My colleagues are very friendly.",
                    "بله. همکارام خیلی خوش‌برخوردن."),
                DialogueLine("Alex", "What about your old job? Do you miss it?",
                    "شغل قبلی‌ات چطور؟ دلت براش تنگ شده؟"),
                DialogueLine("Maya", "Sometimes. But I've grown a lot since I moved.",
                    "گاهی. ولی از وقتی نقل مکان کردم خیلی رشد کرده‌ام."),
                DialogueLine("Alex", "I can see that. You seem more confident now.",
                    "می‌بینم. الان با اعتماد به نفس‌تر به نظر می‌رسی."),
                DialogueLine("Maya", "Thanks! I've been working on myself a lot lately.",
                    "ممنون! این اواخر خیلی روی خودم کار کرده‌ام."),
                DialogueLine("Alex", "That's great to hear. Have you traveled recently?",
                    "خوشحالم می‌شنوم. اخیراً سفر کرده‌ای؟"),
                DialogueLine("Maya", "No, not recently. I've been too busy with work.",
                    "نه، اخیراً نه. با کار خیلی مشغول بوده‌ام."),
                DialogueLine("Alex", "I understand. Maybe we can plan a trip together sometime.",
                    "می‌فهمم. شاید بتونیم یه وقت با هم سفر برنامه‌ریزی کنیم."),
                DialogueLine("Maya", "I'd love that! Let's do it soon.",
                    "خیلی دوست دارم! بیا به‌زودی انجامش بدیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Maya چه تغییراتی داشته؟",
                    "مدل مو و شغل جدید."),
                ComprehensionQuestion("Maya کِی شغل جدید را شروع کرد؟",
                    "ماه پیش."),
                ComprehensionQuestion("Maya در شغل جدیدش چطور است؟",
                    "عالی است و چیزهای زیادی یاد گرفته."),
                ComprehensionQuestion("Maya درباره خودش چه احساسی دارد؟",
                    "با اعتماد به نفس‌تر شده.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about recent changes in your life.",
                    "درباره تغییرات اخیر در زندگی‌ات صحبت کن.",
                    "I've recently... / I've started..."),
                SpeakingTask("Ask a partner about their experiences.",
                    "از یک دوست درباره تجربه‌هایش بپرس.",
                    "Have you ever...? / When did you...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about an important change in your life.",
                    "درباره یک تغییر مهم در زندگی‌ات بنویس.",
                    150,
                    "Use present perfect and simple past.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ been to London twice.",
                    listOf("have", "has", "am", "was"), 0),
                QuizQuestion("Complete: She ___ started a new job.",
                    listOf("have", "has", "is", "was"), 1),
                QuizQuestion("Complete: Have you ever ___ sushi?",
                    listOf("eat", "ate", "eaten", "eating"), 2),
                QuizQuestion("Complete: I've lived here ___ three years.",
                    listOf("since", "for", "in", "at"), 1),
                QuizQuestion("Complete: I've lived here ___ 2020.",
                    listOf("since", "for", "in", "at"), 0),
                QuizQuestion("Complete: I ___ to Paris last summer.",
                    listOf("have been", "went", "go", "going"), 1),
                QuizQuestion("What does 'turning point' mean?",
                    listOf("نقطه عطف", "پایان", "شروع", "میانه"), 0),
                QuizQuestion("Complete: I've recently ___ a new course.",
                    listOf("start", "started", "starting", "starts"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 2 — Technology
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Technology",
            titlePersian = "تکنولوژی",
            objectives = listOf(
                "Talk about technology in daily life",
                "Use comparatives and superlatives",
                "Discuss advantages and disadvantages",
                "Give opinions about technology"
            ),
            vocabulary = listOf(
                VocabWord("device", "دستگاه", "/dɪˈvaɪs/", "noun",
                    "I use many devices every day.", "هر روز از دستگاه‌های زیادی استفاده می‌کنم."),
                VocabWord("screen", "صفحه", "/skriːn/", "noun",
                    "The screen is very bright.", "صفحه خیلی روشنه."),
                VocabWord("app", "اپلیکیشن", "/æp/", "noun",
                    "This app is very useful.", "این اپ خیلی مفیده."),
                VocabWord("download", "دانلود کردن", "/ˌdaʊnˈloʊd/", "verb",
                    "I downloaded a new game.", "یه بازی جدید دانلود کردم."),
                VocabWord("upload", "آپلود کردن", "/ˌʌpˈloʊd/", "verb",
                    "She uploaded the photos.", "او عکس‌ها را آپلود کرد."),
                VocabWord("internet", "اینترنت", "/ˈɪntərnet/", "noun",
                    "The internet is very fast here.", "اینترنت اینجا خیلی سریه."),
                VocabWord("online", "آنلاین", "/ˈɑːnlaɪn/", "adverb",
                    "I shop online.", "من آنلاین خرید می‌کنم."),
                VocabWord("password", "رمز عبور", "/ˈpæswɜːrd/", "noun",
                    "Choose a strong password.", "یه رمز عبور قوی انتخاب کن."),
                VocabWord("website", "وب‌سایت", "/ˈwebsaɪt/", "noun",
                    "This website is helpful.", "این وب‌سایت مفیده."),
                VocabWord("update", "به‌روزرسانی", "/ˈʌpdeɪt/", "noun/verb",
                    "I updated my phone.", "گوشیم را به‌روزرسانی کردم."),
                VocabWord("useful", "مفید", "/ˈjuːsfəl/", "adjective",
                    "Technology is useful.", "تکنولوژی مفیده."),
                VocabWord("addicted", "معتاد", "/əˈdɪktɪd/", "adjective",
                    "I'm addicted to my phone.", "من به گوشیم معتادم.")
            ),
            idioms = listOf(
                IdiomExpression("user-friendly", "کاربرپسند",
                    "This app is very user-friendly.", "این اپ خیلی کاربرپسنده.", "neutral"),
                IdiomExpression("cutting-edge", "پیشرو",
                    "This is cutting-edge technology.", "این تکنولوژی پیشروست.", "neutral"),
                IdiomExpression("break down", "خراب شدن",
                    "My computer broke down yesterday.", "کامپیوترم دیروز خراب شد.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Compound nouns",
                    "در کلماتی مثل website، استرس روی سیلاب اول است."),
                PronunciationTip("Silent letters",
                    "در کلماتی مثل download، حرف d تلفظ می‌شود ولی در Wednesday نیست.")
            ),
            culturalNotes = listOf(
                CulturalNote("Technology culture",
                    "در غرب، استفاده از تکنولوژی بخش جدایی‌ناپذیر زندگی روزمره است."),
                CulturalNote("Online privacy",
                    "حریم خصوصی آنلاین یک موضوع مهم در غرب است.")
            ),
            grammar = listOf(
                GrammarSection("Comparatives",
                    """
                        برای مقایسه دو چیز:

                        -er + than (صفت کوتاه):
                        faster than
                        cheaper than

                        more + صفت + than (صفت بلند):
                        more expensive than
                        more useful than
                    """.trimIndent()),
                GrammarSection("Superlatives",
                    """
                        the + -est (کوتاه):
                        the fastest
                        the cheapest

                        the most + صفت (بلند):
                        the most expensive
                        the most useful
                    """.trimIndent()),
                GrammarSection("Present perfect with technology",
                    """
                        I've used this app for two years.
                        She's never tried VR.
                        Have you ever lost your phone?
                    """.trimIndent()),
                GrammarSection("Opinions about technology",
                    """
                        I think technology is...
                        In my opinion...
                        I believe...
                        I don't think...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She is more tall than me.", "She is taller than me.", "برای صفت کوتاه از -er."),
                CommonMistake("This is the most fast car.", "This is the fastest car.", "fast صفت کوتاهه، fastest."),
                CommonMistake("I have download the app.", "I have downloaded the app.", "بعد از have از past participle.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you use technology a lot?", "زیاد از تکنولوژی استفاده می‌کنی؟"),
                DialogueLine("B", "Yes, I do. I use my phone for everything.", "بله. از گوشیم برای همه چیز استفاده می‌کنم."),
                DialogueLine("A", "Me too. What apps do you use most?", "منم همینطور. بیشتر از چه اپ‌هایی استفاده می‌کنی؟"),
                DialogueLine("B", "I use social media, maps, and a language learning app.", "از شبکه‌های اجتماعی، نقشه و یه اپ آموزش زبان استفاده می‌کنم."),
                DialogueLine("A", "Which is the most useful for you?", "کدوم برات مفیدتره؟"),
                DialogueLine("B", "The language app, I think. I've improved a lot with it.", "اپ زبان، فکر کنم. باهاش خیلی پیشرفت کرده‌ام."),
                DialogueLine("A", "That's great. Do you ever feel addicted to your phone?", "عالیه. تا حالا احساس کرده‌ای به گوشیت معتاد شدی؟"),
                DialogueLine("B", "Sometimes. It's hard to disconnect.", "گاهی. سختِ که قطع کنم."),
                DialogueLine("A", "I know what you mean. I try to take breaks.", "می‌دونم چی می‌گی. سعی می‌کنم استراحت بدم."),
                DialogueLine("B", "That's smart. What do you think is the biggest tech change?", "هوشمندانه‌ست. فکر می‌کنی بزرگ‌ترین تغییر تکنولوژی چیه؟"),
                DialogueLine("A", "Probably smartphones. They've changed everything.", "احتمالاً گوشی‌های هوشمند. همه چیز رو عوض کردن."),
                DialogueLine("B", "I agree. Life was different before them.", "موافقم. زندگی قبلشون متفاوت بود."),
                DialogueLine("A", "Yeah. Sometimes I miss the simpler times.", "آره. گاهی دلم برای زمان‌های ساده‌تر تنگ می‌شه."),
                DialogueLine("B", "Me too. But technology has many advantages too.", "منم همینطور. ولی تکنولوژی مزایای زیادی هم داره."),
                DialogueLine("A", "Definitely. It's about balance.", "قطعاً. موضوع تعادله."),
                DialogueLine("B", "Exactly. Use it, don't let it use you.", "دقیقاً. ازش استفاده کن، نذار ازت استفاده کنه."),
                DialogueLine("A", "Well said! I'll remember that.", "خوب گفتی! این رو یادم می‌مونه."),
                DialogueLine("B", "Thanks! Let's try to have a phone-free day soon.", "ممنون! بیا یه روز بدون گوشی داشته باشیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B از چه اپ‌هایی استفاده می‌کند؟", "شبکه‌های اجتماعی، نقشه، اپ زبان."),
                ComprehensionQuestion("کدام اپ برای B مفیدتر است؟", "اپ زبان."),
                ComprehensionQuestion("B چرا گاهی احساس اعتیاد می‌کند؟", "چون سخت است که قطع کند."),
                ComprehensionQuestion("A چه راه‌حلی پیشنهاد می‌کند؟", "استراحت دادن و تعادل.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about technology in your life.",
                    "درباره تکنولوژی در زندگی‌ات صحبت کن.",
                    "I use... / I've used..."),
                SpeakingTask("Discuss advantages and disadvantages of social media.",
                    "درباره مزایا و معایب شبکه‌های اجتماعی صحبت کن.",
                    "It's useful because... / But it can be...")
            ),
            writingTasks = listOf(
                WritingTask("Write about the advantages and disadvantages of smartphones.",
                    "درباره مزایا و معایب گوشی‌های هوشمند بنویس.",
                    150,
                    "Use comparatives and superlatives.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: This phone is ___ than mine.",
                    listOf("fast", "faster", "fastest", "more fast"), 1),
                QuizQuestion("Complete: This is the ___ phone on the market.",
                    listOf("good", "better", "best", "goodest"), 2),
                QuizQuestion("Complete: I have ___ this app for two years.",
                    listOf("use", "used", "using", "uses"), 1),
                QuizQuestion("Complete: This is ___ than that one.",
                    listOf("expensive", "more expensive", "most expensive", "expensiver"), 1),
                QuizQuestion("What does 'user-friendly' mean?",
                    listOf("کاربرپسند", "دشوار", "قدیمی", "گران"), 0),
                QuizQuestion("Complete: She ___ never tried VR.",
                    listOf("have", "has", "is", "was"), 1),
                QuizQuestion("Complete: It's the ___ useful app.",
                    listOf("more", "most", "much", "many"), 1),
                QuizQuestion("Complete: I ___ my phone yesterday.",
                    listOf("update", "updates", "updated", "updating"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 3 — Work and Career
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Work and Career",
            titlePersian = "کار و حرفه",
            objectives = listOf(
                "Talk about jobs and careers",
                "Use the present perfect for work experience",
                "Discuss career goals",
                "Talk about skills and qualifications"
            ),
            vocabulary = listOf(
                VocabWord("career", "حرفه", "/kəˈrɪr/", "noun",
                    "I want a successful career.", "من حرفه موفقی می‌خوام."),
                VocabWord("colleague", "همکار", "/ˈkɑːliːɡ/", "noun",
                    "My colleagues are helpful.", "همکارام کمک‌کننده هستن."),
                VocabWord("salary", "حقوق", "/ˈsæləri/", "noun",
                    "The salary is competitive.", "حقوق رقابتیه."),
                VocabWord("promotion", "ترفیع", "/prəˈmoʊʃən/", "noun",
                    "She got a promotion.", "او ترفیع گرفت."),
                VocabWord("experience", "تجربه کاری", "/ɪkˈspɪəriəns/", "noun",
                    "I have five years of experience.", "من پنج سال تجربه دارم."),
                VocabWord("skill", "مهارت", "/skɪl/", "noun",
                    "Communication is an important skill.", "ارتباطات یه مهارت مهمه."),
                VocabWord("interview", "مصاحبه", "/ˈɪntərvjuː/", "noun",
                    "I have an interview tomorrow.", "فردا مصاحبه دارم."),
                VocabWord("resume", "رزومه", "/ˈrezəmeɪ/", "noun",
                    "Send me your resume.", "رزومه‌ات رو برام بفرست."),
                VocabWord("apply", "درخواست دادن", "/əˈplaɪ/", "verb",
                    "I applied for the job.", "برای شغل درخواست دادم."),
                VocabWord("hire", "استخدام کردن", "/ˈhaɪər/", "verb",
                    "They hired three new people.", "سه نفر جدید استخدام کردن."),
                VocabWord("resign", "استعفا دادن", "/rɪˈzaɪn/", "verb",
                    "He resigned last week.", "او هفته پیش استعفا داد."),
                VocabWord("retire", "بازنشسته شدن", "/rɪˈtaɪər/", "verb",
                    "My father retired last year.", "پدرم سال پیش بازنشسته شد.")
            ),
            idioms = listOf(
                IdiomExpression("climb the ladder", "پیشرفت کردن",
                    "He's climbing the career ladder.", "او در حرفه‌اش پیشرفت می‌کند.", "idiom"),
                IdiomExpression("work like a dog", "مثل سگ کار کردن",
                    "She works like a dog every day.", "او هر روز مثل سگ کار می‌کند.", "informal"),
                IdiomExpression("dead-end job", "شغل بی‌آینده",
                    "He's stuck in a dead-end job.", "او در یه شغل بی‌آینده گیر افتاده.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("career",
                    "career /kəˈrɪr/ — استرس روی سیلاب دوم."),
                PronunciationTip("colleague",
                    "colleague /ˈkɑːliːɡ/ — ue تلفظ نمی‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("CV vs Resume",
                    "در آمریکا resume و در بریتانیا CV رایج‌تره."),
                CulturalNote("Job interviews",
                    "در غرب، مصاحبه‌ها معمولاً رسمی و ساختارمند هستند.")
            ),
            grammar = listOf(
                GrammarSection("Present perfect for experience",
                    """
                        I've worked in three companies.
                        She's never had a promotion.
                        Have you ever worked abroad?
                    """.trimIndent()),
                GrammarSection("For and since with work",
                    """
                        I've worked here for five years.
                        I've been in this role since 2020.
                    """.trimIndent()),
                GrammarSection("Want to / Would like to",
                    """
                        I want to change my career.
                        I'd like to work abroad.
                    """.trimIndent()),
                GrammarSection("Future plans",
                    """
                        I'm going to apply for a new job.
                        I'll ask for a promotion next year.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have 5 years experience.", "I have 5 years of experience.", "of لازمه."),
                CommonMistake("I am work here for 3 years.", "I have worked here for 3 years.", "برای مدت، present perfect."),
                CommonMistake("I applied the job.", "I applied for the job.", "apply for.")
            ),
            conversation = listOf(
                DialogueLine("A", "How long have you worked at your company?", "چند وقته در شرکتت کار می‌کنی؟"),
                DialogueLine("B", "I've worked there for five years now.", "پنج ساله اونجا کار می‌کنم."),
                DialogueLine("A", "That's a long time! Do you enjoy it?", "زمان زیادی! ازش لذت می‌بری؟"),
                DialogueLine("B", "Mostly yes. But I'm thinking about a change.", "بیشتر بله. ولی دارم به تغییر فکر می‌کنم."),
                DialogueLine("A", "Really? What kind of change?", "واقعاً؟ چه نوع تغییری؟"),
                DialogueLine("B", "I'd like to work abroad for a while.", "دوست دارم مدتی در خارج کار کنم."),
                DialogueLine("A", "That sounds exciting! Have you applied anywhere?", "هیجان‌انگیزه! جایی درخواست دادی؟"),
                DialogueLine("B", "Not yet. I'm updating my resume first.", "هنوز نه. اول دارم رزومه‌ام رو آپدیت می‌کنم."),
                DialogueLine("A", "Good idea. What skills do you have?", "فکر خوبی! چه مهارت‌هایی داری؟"),
                DialogueLine("B", "I'm good at communication and project management.", "در ارتباطات و مدیریت پروژه خوبم."),
                DialogueLine("A", "Those are valuable skills. What about languages?", "این‌ها مهارت‌های ارزشمندی هستن. زبان چطور؟"),
                DialogueLine("B", "I speak English and a bit of French.", "انگلیسی صحبت می‌کنم و کمی فرانسه."),
                DialogueLine("A", "That'll help. What's your dream job?", "کمک می‌کنه. شغل رویایی‌ات چیه؟"),
                DialogueLine("B", "I'd love to work for an international company.", "دوست دارم برای یه شرکت بین‌المللی کار کنم."),
                DialogueLine("A", "That sounds like a great goal. Good luck!", "هدف عالی به نظر می‌رسه. موفق باشی!"),
                DialogueLine("B", "Thanks! I'll need it.", "ممنون! لازمش دارم."),
                DialogueLine("A", "Let me know if you need help with your resume.", "اگه برای رزومه کمک خواستی خبرم کن."),
                DialogueLine("B", "I will. Thanks so much!", "می‌کنم. خیلی ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند وقت است که در شرکتش کار می‌کند؟", "پنج سال."),
                ComprehensionQuestion("B چه تغییری می‌خواهد؟", "کار در خارج."),
                ComprehensionQuestion("B چه مهارت‌هایی دارد؟", "ارتباطات و مدیریت پروژه."),
                ComprehensionQuestion("شغل رویایی B چیست؟", "کار برای یه شرکت بین‌المللی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your job or career goals.",
                    "درباره شغل یا اهداف حرفه‌ای‌ات صحبت کن.",
                    "I've worked... / I want to..."),
                SpeakingTask("Practice a job interview.",
                    "نقش‌بازی: مصاحبه شغلی.",
                    "Tell me about yourself. / What are your skills?")
            ),
            writingTasks = listOf(
                WritingTask("Write about your career goals.",
                    "درباره اهداف حرفه‌ای‌ات بنویس.",
                    150,
                    "Use present perfect and future.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I've worked here ___ 5 years.",
                    listOf("since", "for", "in", "at"), 1),
                QuizQuestion("Complete: I've worked here ___ 2020.",
                    listOf("since", "for", "in", "at"), 0),
                QuizQuestion("Complete: I applied ___ the job.",
                    listOf("to", "for", "at", "on"), 1),
                QuizQuestion("What does 'dead-end job' mean?",
                    listOf("شغل خوب", "شغل بی‌آینده", "شغل دولتی", "شغل پاره‌وقت"), 1),
                QuizQuestion("Complete: She ___ never worked abroad.",
                    listOf("have", "has", "is", "was"), 1),
                QuizQuestion("Complete: I have 5 years ___ experience.",
                    listOf("of", "in", "at", "for"), 0),
                QuizQuestion("Complete: I ___ for a new job next week.",
                    listOf("will apply", "apply", "applied", "applying"), 0),
                QuizQuestion("What does 'climb the ladder' mean?",
                    listOf("بالا رفتن از نردبان", "پیشرفت کردن", "کاهش دادن", "جا ماندن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 4 — Relationships
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Relationships",
            titlePersian = "روابط",
            objectives = listOf(
                "Talk about relationships",
                "Describe personality",
                "Use relative clauses",
                "Give advice about relationships"
            ),
            vocabulary = listOf(
                VocabWord("relationship", "رابطه", "/rɪˈleɪʃənʃɪp/", "noun",
                    "They have a good relationship.", "اونا رابطه خوبی دارن."),
                VocabWord("partner", "شریک / همسر", "/ˈpɑːrtnər/", "noun",
                    "My partner is very kind.", "شریکم خیلی مهربه."),
                VocabWord("engaged", "نامزد", "/ɪnˈɡeɪdʒd/", "adjective",
                    "They got engaged last month.", "ماه پیش نامزد کردن."),
                VocabWord("married", "متأهل", "/ˈmerid/", "adjective",
                    "They've been married for ten years.", "ده ساله ازدواج کردن."),
                VocabWord("divorced", "جدا شده", "/dɪˈvɔːrst/", "adjective",
                    "She's divorced.", "او جدا شده."),
                VocabWord("trust", "اعتماد", "/trʌst/", "noun/verb",
                    "Trust is important in a relationship.", "اعتماد در رابطه مهمه."),
                VocabWord("support", "حمایت", "/səˈpɔːrt/", "noun/verb",
                    "We support each other.", "ما همدیگه رو حمایت می‌کنیم."),
                VocabWord("argue", "بحث کردن", "/ˈɑːrɡjuː/", "verb",
                    "Couples sometimes argue.", "زوج‌ها گاهی بحث می‌کنن."),
                VocabWord("forgive", "بخشیدن", "/fərˈɡɪv/", "verb",
                    "It's important to forgive.", "بخشیدن مهمه."),
                VocabWord("respect", "احترام", "/rɪˈspekt/", "noun/verb",
                    "Respect is key in any relationship.", "احترام در هر رابطه‌ای کلیدیه."),
                VocabWord("honest", "صادق", "/ˈɑːnɪst/", "adjective",
                    "Be honest with your partner.", "با شریکت صادق باش."),
                VocabWord("loyal", "وفادار", "/ˈlɔɪəl/", "adjective",
                    "She's very loyal.", "او خیلی وفاداره.")
            ),
            idioms = listOf(
                IdiomExpression("get along", "کنار آمدن",
                    "We get along very well.", "ما خیلی خوب کنار میایم.", "neutral"),
                IdiomExpression("hit it off", "سریع با کسی جور شدن",
                    "We hit it off immediately.", "ما بلافاصله با هم جور شدیم.", "informal"),
                IdiomExpression("have a lot in common", "وجه اشتراک زیاد داشتن",
                    "We have a lot in common.", "ما وجه اشتراک زیادی داریم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Relationship",
                    "relationship /rɪˈleɪʃənʃɪp/ — استرس روی la."),
                PronunciationTip("married",
                    "married /ˈmerid/ — دو سیلاب، ی نه ee.")
            ),
            culturalNotes = listOf(
                CulturalNote("Dating culture",
                    "در غرب، dating و online dating رایجه."),
                CulturalNote("Equality",
                    "برابری در روابط در فرهنگ غربی مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Relative clauses with who/that",
                    """
                        A person who/that supports you is a good friend.

                        She's the one who always helps me.
                    """.trimIndent()),
                GrammarSection("Present perfect for relationships",
                    """
                        We've been friends for ten years.
                        They've known each other since childhood.
                    """.trimIndent()),
                GrammarSection("Should for advice",
                    """
                        You should trust your partner.
                        You shouldn't argue about small things.
                    """.trimIndent()),
                GrammarSection("Verb + verb-ing",
                    """
                        I enjoy spending time with my partner.
                        I don't mind cooking together.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("We've married for 5 years.", "We've been married for 5 years.", "been married."),
                CommonMistake("He is married with Sara.", "He is married to Sara.", "married to."),
                CommonMistake("We have many commons.", "We have a lot in common.", "in common.")
            ),
            conversation = listOf(
                DialogueLine("A", "How long have you known your best friend?", "چند وقته بهترین دوستت رو می‌شناسی؟"),
                DialogueLine("B", "We've known each other since childhood.", "از بچگی همدیگه رو می‌شناسیم."),
                DialogueLine("A", "That's amazing! What makes your friendship strong?", "فوق‌العاده‌ست! چی دوستیتون رو قوی می‌کنه؟"),
                DialogueLine("B", "We trust each other and we're always honest.", "به هم اعتماد داریم و همیشه صادقیم."),
                DialogueLine("A", "That's key. Do you ever argue?", "این کلیدیه. تا حالا بحث می‌کنید؟"),
                DialogueLine("B", "Sometimes, but we always make up quickly.", "گاهی، ولی همیشه سریع آشتی می‌کنیم."),
                DialogueLine("A", "That's healthy. Do you have a lot in common?", "این سالمه. وجه اشتراک زیادی دارید؟"),
                DialogueLine("B", "Yes, but we also respect our differences.", "بله، ولی به تفاوت‌هامون هم احترام می‌گذاریم."),
                DialogueLine("A", "That's important. Do you have a partner?", "این مهمه. شریک داری؟"),
                DialogueLine("B", "Yes, I've been with my partner for three years.", "بله، سه ساله با شریکم هستم."),
                DialogueLine("A", "Nice! How did you meet?", "خوبه! چطور آشنا شدید؟"),
                DialogueLine("B", "We met at university. We hit it off immediately.", "در دانشگاه آشنا شدیم. بلافاصله با هم جور شدیم."),
                DialogueLine("A", "That's sweet. What's the secret to a good relationship?", "چه شیرین. راز یه رابطه خوب چیه؟"),
                DialogueLine("B", "Communication, trust, and respect. And a bit of patience.", "ارتباط، اعتماد و احترام. و یه کم صبر."),
                DialogueLine("A", "Great advice. Do you ever disagree?", "توصیه عالی. تا حالا مخالفت می‌کنید؟"),
                DialogueLine("B", "Of course! But we talk about it calmly.", "البته! ولی آروم درباره‌اش صحبت می‌کنیم."),
                DialogueLine("A", "That's the way. Thanks for sharing.", "همینه راهش. ممنون که گفتی."),
                DialogueLine("B", "Anytime. Relationships take work.", "هر وقت. روابط کار می‌برن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند وقت است که بهترین دوستش را می‌شناسد؟", "از بچگی."),
                ComprehensionQuestion("راز دوستی B چیست؟", "اعتماد و صداقت."),
                ComprehensionQuestion("B چند سال با شریکش است؟", "سه سال."),
                ComprehensionQuestion("راز یک رابطه خوب چیست؟", "ارتباط، اعتماد، احترام و صبر.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your best friend.",
                    "درباره بهترین دوستت صحبت کن.",
                    "We've known... / We get along..."),
                SpeakingTask("Give advice about relationships.",
                    "درباره روابط توصیه کن.",
                    "You should... / It's important to...")
            ),
            writingTasks = listOf(
                WritingTask("Write about an important relationship in your life.",
                    "درباره یک رابطه مهم در زندگی‌ات بنویس.",
                    150,
                    "Use present perfect and relative clauses.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: We've known each other ___ childhood.",
                    listOf("since", "for", "in", "at"), 0),
                QuizQuestion("Complete: They ___ married for 10 years.",
                    listOf("are", "have been", "was", "were"), 1),
                QuizQuestion("Complete: He is married ___ Sara.",
                    listOf("with", "to", "for", "at"), 1),
                QuizQuestion("What does 'hit it off' mean?",
                    listOf("کتک زدن", "سریع با کسی جور شدن", "دعوا کردن", "جدا شدن"), 1),
                QuizQuestion("Complete: A good friend is someone ___ supports you.",
                    listOf("which", "who", "whose", "where"), 1),
                QuizQuestion("Complete: We have a lot ___ common.",
                    listOf("in", "on", "at", "for"), 0),
                QuizQuestion("What does 'get along' mean?",
                    listOf("کنار آمدن", "دعوا کردن", "جدا شدن", "سفر کردن"), 0),
                QuizQuestion("Complete: You should ___ your partner.",
                    listOf("trust", "trusts", "trusting", "trusted"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 5 — Health and Lifestyle
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Health and Lifestyle",
            titlePersian = "سلامت و سبک زندگی",
            objectives = listOf(
                "Talk about health and lifestyle",
                "Use modal verbs for advice",
                "Discuss healthy habits",
                "Talk about stress and relaxation"
            ),
            vocabulary = listOf(
                VocabWord("lifestyle", "سبک زندگی", "/ˈlaɪfstaɪl/", "noun",
                    "She has a healthy lifestyle.", "او سبک زندگی سالمی داره."),
                VocabWord("diet", "رژیم غذایی", "/ˈdaɪət/", "noun",
                    "I'm on a diet.", "من رژیم دارم."),
                VocabWord("exercise", "ورزش", "/ˈeksərsaɪz/", "noun",
                    "Exercise is important.", "ورزش مهمه."),
                VocabWord("stress", "استرس", "/stres/", "noun",
                    "Work gives me stress.", "کار بهم استرس می‌ده."),
                VocabWord("relax", "استراحت کردن", "/rɪˈlæks/", "verb",
                    "I relax by reading.", "با کتاب خوندن استراحت می‌کنم."),
                VocabWord("sleep", "خواب", "/sliːp/", "noun",
                    "I need more sleep.", "خواب بیشتری لازم دارم."),
                VocabWord("balance", "تعادل", "/ˈbæləns/", "noun",
                    "Work-life balance is important.", "تعادل کار و زندگی مهمه."),
                VocabWord("mental health", "سلامت روان", "/ˈmentl helθ/", "noun",
                    "Mental health matters.", "سلامت روان مهمه."),
                VocabWord("habit", "عادت", "/ˈhæbɪt/", "noun",
                    "I have a bad habit.", "یه عادت بد دارم."),
                VocabWord("routine", "روتین", "/ruːˈtiːn/", "noun",
                    "I have a morning routine.", "یه روتین صبحگاهی دارم.")
            ),
            idioms = listOf(
                IdiomExpression("burn out", "فرسوده شدن",
                    "Many people burn out from work.", "بسیاری از افراد از کار فرسوده می‌شن.", "informal"),
                IdiomExpression("under the weather", "حالش خوب نبودن",
                    "I'm feeling under the weather today.", "امروز حالم خوب نیست.", "informal"),
                IdiomExpression("take it easy", "سخت نگیر",
                    "Take it easy this weekend.", "این آخر هفته سخت نگیر.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("stress",
                    "stress /stres/ — s + t + r ترکیب سختیه."),
                PronunciationTip("lifestyle",
                    "lifestyle /ˈlaɪfstaɪl/ — استرس روی first syllable.")
            ),
            culturalNotes = listOf(
                CulturalNote("Mental health",
                    "در غرب، سلامت روان خیلی مهمه و صحبت درباره‌اش رایجه."),
                CulturalNote("Gym culture",
                    "عضویت در باشگاه و ورزش روزانه بخشی از سبک زندگی غربیه.")
            ),
            grammar = listOf(
                GrammarSection("Modal verbs for advice",
                    """
                        You should exercise more.
                        You shouldn't eat junk food.
                        You ought to sleep more.
                        You'd better see a doctor.
                    """.trimIndent()),
                GrammarSection("Present perfect for lifestyle changes",
                    """
                        I've started going to the gym.
                        She's quit smoking.
                        They've changed their diet.
                    """.trimIndent()),
                GrammarSection("Want to / need to",
                    """
                        I want to lose weight.
                        I need to sleep more.
                        We need to relax.
                    """.trimIndent()),
                GrammarSection("Gerunds after prepositions",
                    """
                        I'm good at relaxing.
                        She's interested in yoga.
                        He's thinking about changing jobs.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("You should to exercise.", "You should exercise.", "بعد از should فعل ساده."),
                CommonMistake("I'm interesting in yoga.", "I'm interested in yoga.", "interested نه interesting."),
                CommonMistake("I want lose weight.", "I want to lose weight.", "بعد از want از to + verb.")
            ),
            conversation = listOf(
                DialogueLine("A", "You look tired. Are you OK?", "خسته به نظر می‌رسی. حالت خوبه؟"),
                DialogueLine("B", "I'm stressed. I've been working too much.", "استرس دارم. خیلی کار کرده‌ام."),
                DialogueLine("A", "You should take a break.", "باید استراحت کنی."),
                DialogueLine("B", "I know, but I have deadlines.", "می‌دونم، ولی ضرب‌الاجل دارم."),
                DialogueLine("A", "Try to find balance. Work-life balance is important.", "سعی کن تعادل پیدا کنی. تعادل کار و زندگی مهمه."),
                DialogueLine("B", "You're right. What do you do to relax?", "حق داری. تو برای استراحت چیکار می‌کنی؟"),
                DialogueLine("A", "I go for walks and do yoga. It helps a lot.", "پیاده‌روی می‌رم و یوگا می‌کنم. خیلی کمک می‌کنه."),
                DialogueLine("B", "That sounds nice. I've never tried yoga.", "خوب به نظر می‌رسه. تا حالا یوگا امتحان نکرده‌ام."),
                DialogueLine("A", "You should try it. It's great for stress.", "باید امتحان کنی. برای استرس عالیه."),
                DialogueLine("B", "Maybe I will. Do you exercise often?", "شاید امتحان کنم. زیاد ورزش می‌کنی؟"),
                DialogueLine("A", "Yes, I've been exercising three times a week.", "بله، هفته‌ای سه بار ورزش کرده‌ام."),
                DialogueLine("B", "That's great. I need to start too.", "عالیه. منم باید شروع کنم."),
                DialogueLine("A", "It's never too late. What about your diet?", "هیچ‌وقت دیر نیست. رژیمت چطور؟"),
                DialogueLine("B", "Not great. I eat too much fast food.", "خوب نیست. فست‌فود زیادی می‌خورم."),
                DialogueLine("A", "You should eat more fruits and vegetables.", "باید میوه و سبزیجات بیشتری بخوری."),
                DialogueLine("B", "I know. I'll try. Thanks for the advice.", "می‌دونم. تلاش می‌کنم. ممنون برای توصیه."),
                DialogueLine("A", "Anytime. Take care of yourself.", "هر وقت. از خودت مراقبت کن."),
                DialogueLine("B", "I will. You too!", "می‌کنم. تو هم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چرا استرس دارد؟", "چون زیاد کار کرده."),
                ComprehensionQuestion("A چه راه‌حل‌هایی پیشنهاد می‌کند؟", "استراحت، یوگا، پیاده‌روی، تغذیه سالم."),
                ComprehensionQuestion("A هفته‌ای چند بار ورزش می‌کند؟", "سه بار."),
                ComprehensionQuestion("رژیم B چطور است؟", "خوب نیست، فست‌فود زیاد می‌خورد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your lifestyle.",
                    "درباره سبک زندگی‌ات صحبت کن.",
                    "I usually... / I've started..."),
                SpeakingTask("Give advice about reducing stress.",
                    "درباره کاهش استرس توصیه کن.",
                    "You should... / You'd better...")
            ),
            writingTasks = listOf(
                WritingTask("Write about how to have a healthy lifestyle.",
                    "درباره چطور داشتن یه سبک زندگی سالم بنویس.",
                    150,
                    "Use modal verbs and gerunds.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: You ___ exercise more.",
                    listOf("should", "should to", "shoulds", "shoulding"), 0),
                QuizQuestion("Complete: I'm interested ___ yoga.",
                    listOf("on", "in", "at", "for"), 1),
                QuizQuestion("Complete: I want ___ lose weight.",
                    listOf("to", "for", "at", "on"), 0),
                QuizQuestion("What does 'burn out' mean?",
                    listOf("آتش زدن", "فرسوده شدن", "روشن شدن", "خاموش شدن"), 1),
                QuizQuestion("Complete: I've ___ going to the gym.",
                    listOf("start", "started", "starting", "starts"), 1),
                QuizQuestion("Complete: I need ___ sleep more.",
                    listOf("to", "for", "at", "on"), 0),
                QuizQuestion("Complete: She's thinking ___ changing jobs.",
                    listOf("on", "about", "at", "for"), 1),
                QuizQuestion("What does 'take it easy' mean?",
                    listOf("سخت بگیر", "سخت نگیر", "سریع برو", "کار کن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 6 — Travel and Culture
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Travel and Culture",
            titlePersian = "سفر و فرهنگ",
            objectives = listOf(
                "Talk about travel and culture",
                "Use the passive voice",
                "Discuss cultural differences",
                "Describe travel experiences"
            ),
            vocabulary = listOf(
                VocabWord("culture", "فرهنگ", "/ˈkʌltʃər/", "noun",
                    "I love learning about new cultures.", "عاشق یادگیری درباره فرهنگ‌های جدیدم."),
                VocabWord("custom", "رسم", "/ˈkʌstəm/", "noun",
                    "Every country has its customs.", "هر کشوری رسوم خودش رو داره."),
                VocabWord("traditional", "سنتی", "/trəˈdɪʃənl/", "adjective",
                    "This is a traditional dish.", "این یه غذای سنتیه."),
                VocabWord("modern", "مدرن", "/ˈmɑːdərn/", "adjective",
                    "The city is very modern.", "شهر خیلی مدرنه."),
                VocabWord("souvenir", "سوغات", "/ˌsuːvəˈnɪr/", "noun",
                    "I bought some souvenirs.", "چند تا سوغات خریدم."),
                VocabWord("landmark", "نقطه دیدنی", "/ˈlændmɑːrk/", "noun",
                    "The Eiffel Tower is a famous landmark.", "برج ایفل یه نقطه دیدنی معروفه."),
                VocabWord("sightseeing", "بازدید از جاذبه‌ها", "/ˈsaɪtsiːɪŋ/", "noun",
                    "We went sightseeing all day.", "تمام روز بازدید کردیم."),
                VocabWord("guide", "راهنما", "/ɡaɪd/", "noun",
                    "Our guide was very knowledgeable.", "راهنمای ما خیلی دانا بود."),
                VocabWord("language barrier", "مانع زبانی", "/ˈlæŋɡwɪdʒ ˈbæriər/", "noun",
                    "We faced a language barrier.", "با مانع زبانی روبرو شدیم."),
                VocabWord("adapt", "سازگار شدن", "/əˈdæpt/", "verb",
                    "It takes time to adapt to a new culture.", "سازگار شدن با فرهنگ جدید زمان می‌بره.")
            ),
            idioms = listOf(
                IdiomExpression("when in Rome", "با مردم شهر هم‌رنگ شو",
                    "When in Rome, do as the Romans do.", "با مردم شهر هم‌رنگ شو.", "idiom"),
                IdiomExpression("culture shock", "شوک فرهنگی",
                    "I had culture shock in Japan.", "در ژاپن شوک فرهنگی خوردم.", "neutral"),
                IdiomExpression("off the beaten path", "دور از مسیر معمول",
                    "We visited places off the beaten path.", "از مکان‌های دور از مسیر معمول بازدید کردیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("culture",
                    "culture /ˈkʌltʃər/ — استرس روی cul."),
                PronunciationTip("traditional",
                    "traditional /trəˈdɪʃənl/ — چهار سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Cultural differences",
                    "هر فرهنگ آداب و رسوم خاص خودش رو داره که برای سفر مهمه بدونیم."),
                CulturalNote("Globalization",
                    "جهانی شدن باعث شده فرهنگ‌ها بیشتر با هم تعامل داشته باشن.")
            ),
            grammar = listOf(
                GrammarSection("Passive voice",
                    """
                        be + past participle

                        Present: The city is visited by millions of tourists.
                        Past: The temple was built in 1400.
                        Present perfect: It has been restored recently.
                    """.trimIndent()),
                GrammarSection("Passive with modals",
                    """
                        The museum can be visited for free.
                        The tickets must be booked online.
                    """.trimIndent()),
                GrammarSection("Passive vs active",
                    """
                        Active: People speak English here.
                        Passive: English is spoken here.
                    """.trimIndent()),
                GrammarSection("Present perfect for travel",
                    """
                        I've visited 20 countries.
                        She's been to Japan three times.
                        Have you ever traveled alone?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The temple built in 1400.", "The temple was built in 1400.", "مجهول نیاز به was داره."),
                CommonMistake("English is speak here.", "English is spoken here.", "past participle لازمه."),
                CommonMistake("I've been to Japan last year.", "I went to Japan last year.", "زمان مشخص = simple past.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you traveled abroad?", "خارج سفر کرده‌ای؟"),
                DialogueLine("B", "Yes, I've been to several countries.", "بله، به چندین کشور رفته‌ام."),
                DialogueLine("A", "Which was the most interesting?", "کدومش جالب‌تر بود؟"),
                DialogueLine("B", "Japan, I think. It has a fascinating culture.", "ژاپن، فکر کنم. فرهنگ جذابی داره."),
                DialogueLine("A", "What did you like most?", "چی بیشتر دوست داشتی؟"),
                DialogueLine("B", "The temples and gardens. They're beautifully designed.", "معابد و باغ‌ها. زیبا طراحی شدن."),
                DialogueLine("A", "Did you have any problems?", "مشکلی داشتی؟"),
                DialogueLine("B", "A bit of culture shock at first. Everything felt different.", "اولش یه کم شوک فرهنگی. همه چیز متفاوت بود."),
                DialogueLine("A", "How did you adapt?", "چطور سازگار شدی؟"),
                DialogueLine("B", "I learned a few words and followed local customs.", "چند کلمه یاد گرفتم و رسوم محلی رو رعایت کردم."),
                DialogueLine("A", "That's smart. What's your favorite place?", "هوشمندانه‌ست. مکان مورد علاقه‌ات کجاست؟"),
                DialogueLine("B", "Kyoto. It's a mix of traditional and modern.", "کیوتو. ترکیبی از سنتی و مدرنه."),
                DialogueLine("A", "I'd love to go. Any tips?", "دوست دارم برم. توصیه‌ای داری؟"),
                DialogueLine("B", "Learn some Japanese phrases and try local food.", "چند عبارت ژاپنی یاد بگیر و غذای محلی امتحان کن."),
                DialogueLine("A", "Good tips. What about food?", "توصیه‌های خوبی. غذا چطور؟"),
                DialogueLine("B", "Amazing! Sushi and ramen were the best.", "فوق‌العاده! سوشی و رامن بهترین بودن."),
                DialogueLine("A", "You're making me hungry!", "داری گشنه‌ام می‌کنی!"),
                DialogueLine("B", "Ha! You should go. It's worth it.", "ها! باید بری. ارزشش رو داره."),
                DialogueLine("A", "I'll add it to my list.", "به لیستم اضافه می‌کنم."),
                DialogueLine("B", "Let me know if you need any advice.", "اگه مشاوره خواستی خبرم کن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B کجاها سفر کرده؟", "چندین کشور، از جمله ژاپن."),
                ComprehensionQuestion("B چه چیزی در ژاپن را دوست داشت؟", "معابد و باغ‌ها."),
                ComprehensionQuestion("B چطور با فرهنگ جدید سازگار شد؟", "چند کلمه یاد گرفت و رسوم محلی را رعایت کرد."),
                ComprehensionQuestion("غذای مورد علاقه B در ژاپن چه بود؟", "سوشی و رامن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a country you've visited.",
                    "درباره کشوری که رفتی صحبت کن.",
                    "I've been to... / It was..."),
                SpeakingTask("Discuss cultural differences.",
                    "درباره تفاوت‌های فرهنگی صحبت کن.",
                    "In my culture... / In other cultures...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable travel experience.",
                    "درباره یک تجربه سفر به‌یادماندنی بنویس.",
                    180,
                    "Use passive voice and present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The temple ___ built in 1400.",
                    listOf("is", "was", "were", "been"), 1),
                QuizQuestion("Complete: English ___ spoken here.",
                    listOf("is", "are", "was", "were"), 0),
                QuizQuestion("Complete: The tickets must ___ booked online.",
                    listOf("be", "is", "was", "been"), 0),
                QuizQuestion("What does 'culture shock' mean?",
                    listOf("شوک برقی", "شوک فرهنگی", "تغییر فرهنگ", "فرهنگ غنی"), 1),
                QuizQuestion("Complete: I've ___ to 20 countries.",
                    listOf("be", "being", "been", "was"), 2),
                QuizQuestion("Complete: This dish ___ in the traditional way.",
                    listOf("is cooked", "cooks", "cooking", "cook"), 0),
                QuizQuestion("What does 'off the beaten path' mean?",
                    listOf("دور از مسیر معمول", "توی مسیر", "کنار جاده", "توی شهر"), 0),
                QuizQuestion("Complete: English is ___ all over the world.",
                    listOf("speak", "spoke", "spoken", "speaking"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 7 — Media and News
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Media and News",
            titlePersian = "رسانه و اخبار",
            objectives = listOf(
                "Talk about media and news",
                "Use reported speech",
                "Discuss sources of information",
                "Express opinions about media"
            ),
            vocabulary = listOf(
                VocabWord("media", "رسانه", "/ˈmiːdiə/", "noun",
                    "The media is powerful.", "رسانه قدرتمنده."),
                VocabWord("news", "اخبار", "/nuːz/", "noun",
                    "I watch the news every night.", "هر شب اخبار می‌بینم."),
                VocabWord("article", "مقاله", "/ˈɑːrtɪkəl/", "noun",
                    "I read an interesting article.", "یه مقاله جالب خوندم."),
                VocabWord("headline", "تیتر", "/ˈhedlaɪn/", "noun",
                    "The headline was shocking.", "تیتر شوکه‌کننده بود."),
                VocabWord("journalist", "روزنامه‌نگار", "/ˈdʒɜːrnəlɪst/", "noun",
                    "She's a famous journalist.", "او یه روزنامه‌نگار معروفه."),
                VocabWord("report", "گزارش", "/rɪˈpɔːrt/", "noun/verb",
                    "The report was accurate.", "گزارش دقیق بود."),
                VocabWord("source", "منبع", "/sɔːrs/", "noun",
                    "Check your sources.", "منابعت رو چک کن."),
                VocabWord("broadcast", "پخش کردن", "/ˈbrɔːdkæst/", "verb",
                    "They broadcast the match live.", "مسابقه رو زنده پخش کردن."),
                VocabWord("interview", "مصاحبه", "/ˈɪntərvjuː/", "noun",
                    "I watched an interview with the president.", "مصاحبه‌ای با رئیس‌جمهور دیدم."),
                VocabWord("advertisement", "تبلیغات", "/ədˈvɜːrtɪsmənt/", "noun",
                    "There are too many advertisements.", "تبلیغات خیلی زیادن.")
            ),
            idioms = listOf(
                IdiomExpression("breaking news", "خبر فوری",
                    "Breaking news: the president resigned!", "خبر فوری: رئیس‌جمهور استعفا داد!", "neutral"),
                IdiomExpression("fake news", "اخبار جعلی",
                    "Be careful of fake news.", "مراقب اخبار جعلی باش.", "informal"),
                IdiomExpression("get the scoop", "خبر دست اول گرفتن",
                    "The journalist got the scoop.", "روزنامه‌نگار خبر دست اول گرفت.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("news",
                    "news /nuːz/ — s به صورت z تلفظ می‌شه."),
                PronunciationTip("media",
                    "media /ˈmiːdiə/ — استرس روی می.")
            ),
            culturalNotes = listOf(
                CulturalNote("Freedom of press",
                    "آزادی مطبوعات در غرب موضوع مهمیه."),
                CulturalNote("Trust in media",
                    "اعتماد به رسانه‌ها در غرب متفاوته و بحث‌برانگیزه.")
            ),
            grammar = listOf(
                GrammarSection("Reported speech",
                    """
                        Direct: "I'm busy," she said.
                        Reported: She said she was busy.

                        Direct: "I'll help you," he said.
                        Reported: He said he would help me.
                    """.trimIndent()),
                GrammarSection("Reported questions",
                    """
                        Direct: "Where do you live?" he asked.
                        Reported: He asked where I lived.
                    """.trimIndent()),
                GrammarSection("Passive voice in news",
                    """
                        The building was destroyed by fire.
                        The law has been approved.
                        The suspect was arrested.
                    """.trimIndent()),
                GrammarSection("Opinions about media",
                    """
                        I think the media is...
                        In my opinion...
                        I believe that...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("He said me...", "He told me...", "بعد از tell از ضمیر مفعولی استفاده می‌کنیم."),
                CommonMistake("He said he will come.", "He said he would come.", "در reported speech، will → would."),
                CommonMistake("I saw a news.", "I saw some news.", "news غیرقابل شمارشه.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you watch the news?", "اخبار می‌بینی؟"),
                DialogueLine("B", "Yes, every evening. What about you?", "بله، هر شب. تو چطور؟"),
                DialogueLine("A", "Mostly online. I read articles on my phone.", "بیشتر آنلاین. روی گوشیم مقاله می‌خونم."),
                DialogueLine("B", "Me too. Which websites do you use?", "منم همینطور. از چه سایت‌هایی استفاده می‌کنی؟"),
                DialogueLine("A", "I use a few reliable ones. What about you?", "از چند تا قابل اعتماد استفاده می‌کنم. تو چطور؟"),
                DialogueLine("B", "I try to check multiple sources.", "سعی می‌کنم چند منبع رو چک کنم."),
                DialogueLine("A", "That's smart. There's so much fake news now.", "هوشمندانه‌ست. الان اخبار جعلی زیاد شده."),
                DialogueLine("B", "I know. We have to be careful.", "می‌دونم. باید مراقب باشیم."),
                DialogueLine("A", "What did you think about the last election coverage?", "نظرت درباره پوشش انتخابات آخر چیه؟"),
                DialogueLine("B", "It was mostly good, but some channels were biased.", "بیشترش خوب بود، ولی بعضی کانال‌ها جهت‌دار بودن."),
                DialogueLine("A", "I agree. It's hard to find unbiased news.", "موافقم. پیدا کردن خبر بی‌طرف سخته."),
                DialogueLine("B", "True. I try to read from different perspectives.", "درسته. سعی می‌کنم از دیدگاه‌های مختلف بخونم."),
                DialogueLine("A", "That's a good approach.", "رویکرد خوبیه."),
                DialogueLine("B", "Do you trust the media?", "به رسانه‌ها اعتماد داری؟"),
                DialogueLine("A", "Partially. I verify things myself.", "تا حدی. خودم چیزها رو تأیید می‌کنم."),
                DialogueLine("B", "That's the way to go. Critical thinking is key.", "همینه راهش. تفکر انتقادی کلیدیه."),
                DialogueLine("A", "Exactly. Well said.", "دقیقاً. خوب گفتی."),
                DialogueLine("B", "Thanks. Let's keep each other informed!", "ممنون. بیا همدیگه رو در جریان بذاریم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور اخبار را دنبال می‌کند؟", "هر شب و از چند منبع."),
                ComprehensionQuestion("A چطور اخبار را دنبال می‌کند؟", "آنلاین و از چند سایت قابل اعتماد."),
                ComprehensionQuestion("نظر B درباره پوشش انتخابات چیست؟", "بیشترش خوب بود ولی بعضی کانال‌ها جهت‌دار بودن."),
                ComprehensionQuestion("B چه رویکردی برای اخبار دارد؟", "خواندن از دیدگاه‌های مختلف و تفکر انتقادی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about how you get news.",
                    "درباره اینکه چطور اخبار می‌گیری صحبت کن.",
                    "I usually read... / I watch..."),
                SpeakingTask("Discuss fake news.",
                    "درباره اخبار جعلی صحبت کن.",
                    "Fake news is... / We should...")
            ),
            writingTasks = listOf(
                WritingTask("Write about the role of media in society.",
                    "درباره نقش رسانه در جامعه بنویس.",
                    180,
                    "Use reported speech and passive voice.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: He said he ___ busy.",
                    listOf("is", "was", "were", "be"), 1),
                QuizQuestion("Complete: She said she ___ help me.",
                    listOf("will", "would", "can", "could"), 1),
                QuizQuestion("Complete: The building was ___ by fire.",
                    listOf("destroy", "destroyed", "destroying", "destroys"), 1),
                QuizQuestion("What does 'fake news' mean?",
                    listOf("خبر جعلی", "خبر فوری", "خبر قدیمی", "خبر خوب"), 0),
                QuizQuestion("Complete: He ___ me he was tired.",
                    listOf("said", "told", "spoke", "talked"), 1),
                QuizQuestion("Complete: The law has been ___.",
                    listOf("approve", "approved", "approving", "approves"), 1),
                QuizQuestion("What does 'breaking news' mean?",
                    listOf("خبر فوری", "خبر قدیمی", "خبر جعلی", "خبر خوب"), 0),
                QuizQuestion("Complete: I watched ___ with the president.",
                    listOf("an interview", "a interview", "interviews", "the interview"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 8 — Education
    // ═══════════════════════════════════════════════════════════
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Education",
            titlePersian = "آموزش",
            objectives = listOf(
                "Talk about education",
                "Use conditionals",
                "Discuss learning styles",
                "Talk about future education plans"
            ),
            vocabulary = listOf(
                VocabWord("education", "آموزش", "/ˌedʒuˈkeɪʃən/", "noun",
                    "Education is important.", "آموزش مهمه."),
                VocabWord("degree", "مدرک", "/dɪˈɡriː/", "noun",
                    "She has a degree in law.", "او مدرک حقوق داره."),
                VocabWord("university", "دانشگاه", "/ˌjuːnɪˈvɜːrsəti/", "noun",
                    "He studies at university.", "او در دانشگاه درس می‌خونه."),
                VocabWord("course", "دوره", "/kɔːrs/", "noun",
                    "I'm taking an online course.", "دارم یه دوره آنلاین می‌گذرونم."),
                VocabWord("exam", "امتحان", "/ɪɡˈzæm/", "noun",
                    "I have an exam tomorrow.", "فردا امتحان دارم."),
                VocabWord("pass", "قبول شدن", "/pæs/", "verb",
                    "I passed the exam!", "امتحان رو قبول شدم!"),
                VocabWord("fail", "رد شدن", "/feɪl/", "verb",
                    "He failed the test.", "او در آزمون رد شد."),
                VocabWord("graduate", "فارغ‌التحصیل شدن", "/ˈɡrædʒueɪt/", "verb",
                    "She graduated last year.", "او سال پیش فارغ‌التحصیل شد."),
                VocabWord("scholarship", "بورسیه", "/ˈskɑːlərʃɪp/", "noun",
                    "He got a scholarship.", "او بورسیه گرفت."),
                VocabWord("knowledge", "دانش", "/ˈnɑːlɪdʒ/", "noun",
                    "Knowledge is power.", "دانش قدرت است.")
            ),
            idioms = listOf(
                IdiomExpression("hit the books", "درس خواندن",
                    "I need to hit the books tonight.", "امشب باید درس بخونم.", "informal"),
                IdiomExpression("learn by heart", "حفظ کردن",
                    "She learned the poem by heart.", "او شعر رو حفظ کرد.", "neutral"),
                IdiomExpression("pass with flying colors", "با نمره عالی قبول شدن",
                    "He passed with flying colors.", "او با نمره عالی قبول شد.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("education",
                    "education /ˌedʒuˈkeɪʃən/ — استرس روی ca."),
                PronunciationTip("university",
                    "university /ˌjuːnɪˈvɜːrsəti/ — پنج سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Education systems",
                    "سیستم آموزشی در کشورهای مختلف متفاوته."),
                CulturalNote("Lifelong learning",
                    "یادگیری مادام‌العمر در غرب خیلی ارزشمنده.")
            ),
            grammar = listOf(
                GrammarSection("First conditional",
                    """
                        If + present simple, will + verb

                        If I study hard, I will pass the exam.
                        If you don't attend, you will fail.
                    """.trimIndent()),
                GrammarSection("Second conditional",
                    """
                        If + past simple, would + verb

                        If I had more time, I would learn another language.
                        If I were rich, I would study abroad.
                    """.trimIndent()),
                GrammarSection("Present perfect for education",
                    """
                        I've graduated from university.
                        She's studied in three countries.
                        Have you ever taken an online course?
                    """.trimIndent()),
                GrammarSection("Future plans",
                    """
                        I'm going to apply for a scholarship.
                        I'll continue my studies next year.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If I will study, I pass.", "If I study, I will pass.", "در if-clause از present simple."),
                CommonMistake("If I was rich...", "If I were rich...", "در second conditional از were استفاده می‌کنیم."),
                CommonMistake("I have graduated last year.", "I graduated last year.", "زمان مشخص = simple past.")
            ),
            conversation = listOf(
                DialogueLine("A", "What are you studying?", "چی می‌خونی؟"),
                DialogueLine("B", "I'm studying economics at university.", "اقتصاد در دانشگاه می‌خونم."),
                DialogueLine("A", "Nice! How's it going?", "خوبه! چطور پیش می‌ره؟"),
                DialogueLine("B", "It's challenging but interesting.", "چالش‌برانگیزه ولی جالبه."),
                DialogueLine("A", "What do you want to do after graduation?", "بعد از فارغ‌التحصیلی چیکار می‌خوای بکنی؟"),
                DialogueLine("B", "I'd like to work in finance or maybe continue studying.", "دوست دارم در مالی کار کنم یا شاید ادامه تحصیل بدم."),
                DialogueLine("A", "Have you thought about a master's degree?", "به فوق لیسانس فکر کرده‌ای؟"),
                DialogueLine("B", "Yes, if I get good grades, I'll apply for a scholarship.", "بله، اگه نمره‌های خوبی بگیرم، برای بورسیه درخواست می‌دم."),
                DialogueLine("A", "That's smart. What about learning languages?", "هوشمندانه‌ست. زبان یاد گرفتن چطور؟"),
                DialogueLine("B", "I've been learning English for years. I'd like to learn Spanish next.", "سال‌هاست انگلیسی یاد می‌گیرم. دوست دارم بعدی اسپانیایی باشه."),
                DialogueLine("A", "That'd be useful. If I had more time, I'd learn another language too.", "مفید می‌شه. اگه وقت بیشتری داشتم، منم یه زبان دیگه یاد می‌گرفتم."),
                DialogueLine("B", "You should! It's never too late.", "باید بکنی! هیچ‌وقت دیر نیست."),
                DialogueLine("A", "Maybe I will. What's your favorite subject?", "شاید بکنم. درس مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "I love statistics. It's practical and useful.", "عاشق آمارم. کاربردی و مفیده."),
                DialogueLine("A", "That's great. What's the hardest?", "عالیه. سخت‌ترین چیه؟"),
                DialogueLine("B", "Probably calculus. I have to hit the books for it.", "احتمالاً حساب دیفرانسیل. باید براش درس بخونم."),
                DialogueLine("A", "I understand. Good luck with your studies!", "می‌فهمم. برای تحصیلت موفق باشی!"),
                DialogueLine("B", "Thanks! You too!", "ممنون! تو هم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه رشته‌ای می‌خواند؟", "اقتصاد."),
                ComprehensionQuestion("B بعد از فارغ‌التحصیلی چه برنامه‌ای دارد؟", "کار در مالی یا ادامه تحصیل."),
                ComprehensionQuestion("B چه زبانی می‌خواهد بعد یاد بگیرد؟", "اسپانیایی."),
                ComprehensionQuestion("درس مورد علاقه B چیست؟", "آمار.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your education.",
                    "درباره تحصیلاتت صحبت کن.",
                    "I studied... / I'm studying..."),
                SpeakingTask("Discuss future education plans.",
                    "درباره برنامه‌های تحصیلی آینده صحبت کن.",
                    "I'm going to... / If I..., I'll...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your educational goals.",
                    "درباره اهداف آموزشی‌ات بنویس.",
                    150,
                    "Use conditionals and future forms.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If I ___ hard, I will pass.",
                    listOf("study", "will study", "studied", "studying"), 0),
                QuizQuestion("Complete: If I ___ rich, I would travel.",
                    listOf("am", "was", "were", "be"), 2),
                QuizQuestion("Complete: I have ___ from university.",
                    listOf("graduate", "graduated", "graduating", "graduates"), 1),
                QuizQuestion("What does 'hit the books' mean?",
                    listOf("کتاب زدن", "درس خواندن", "کتاب خریدن", "کتاب نوشتن"), 1),
                QuizQuestion("Complete: She has a degree ___ law.",
                    listOf("on", "in", "at", "for"), 1),
                QuizQuestion("Complete: I ___ last year.",
                    listOf("have graduated", "graduated", "graduate", "graduating"), 1),
                QuizQuestion("What does 'pass with flying colors' mean?",
                    listOf("با نمره عالی قبول شدن", "رد شدن", "متوسط بودن", "دیر رسیدن"), 0),
                QuizQuestion("Complete: If I had time, I ___ another language.",
                    listOf("will learn", "would learn", "learn", "learned"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 9 — City Life
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "City Life",
            titlePersian = "زندگی شهری",
            objectives = listOf(
                "Talk about city life",
                "Use comparatives",
                "Discuss pros and cons of city living",
                "Describe your city"
            ),
            vocabulary = listOf(
                VocabWord("city", "شهر", "/ˈsɪti/", "noun",
                    "I love living in the city.", "عاشق زندگی در شهرم."),
                VocabWord("suburb", "حومه", "/ˈsʌbɜːrb/", "noun",
                    "They live in the suburbs.", "اونا در حومه شهر زندگی می‌کنن."),
                VocabWord("downtown", "مرکز شهر", "/ˌdaʊnˈtaʊn/", "noun",
                    "Let's go downtown.", "بیا بریم مرکز شهر."),
                VocabWord("crowded", "شلوغ", "/ˈkraʊdɪd/", "adjective",
                    "The city is crowded.", "شهر شلوغه."),
                VocabWord("noisy", "پرسروصدا", "/ˈnɔɪzi/", "adjective",
                    "It's too noisy here.", "اینجا خیلی پرسروصداست."),
                VocabWord("peaceful", "آرام", "/ˈpiːsfəl/", "adjective",
                    "The suburbs are peaceful.", "حومه آرامه."),
                VocabWord("transport", "حمل و نقل", "/ˈtrænspɔːrt/", "noun",
                    "Public transport is convenient.", "حمل و نقل عمومی راحته."),
                VocabWord("convenient", "راحت", "/kənˈviːniənt/", "adjective",
                    "The location is convenient.", "موقعیت راحته."),
                VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun",
                    "City pollution is a problem.", "آلودگی شهر مشکل‌سازه."),
                VocabWord("cost of living", "هزینه زندگی", "/kɔːst əv ˈlɪvɪŋ/", "noun",
                    "The cost of living is high.", "هزینه زندگی بالاست.")
            ),
            idioms = listOf(
                IdiomExpression("the big city", "شهر بزرگ",
                    "She moved to the big city.", "او به شهر بزرگ نقل مکان کرد.", "informal"),
                IdiomExpression("bright lights", "چراغ‌های روشن شهر",
                    "He was attracted to the bright lights.", "او به چراغ‌های روشن شهر جذب شد.", "idiom"),
                IdiomExpression("concrete jungle", "جنگل بتنی",
                    "New York is a concrete jungle.", "نیویورک یه جنگل بتنیه.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("suburb",
                    "suburb /ˈsʌbɜːrb/ — دو سیلاب."),
                PronunciationTip("convenient",
                    "convenient /kənˈviːniənt/ — سه سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("City vs suburb",
                    "در غرب، انتخاب بین زندگی شهری و حومه یک تصمیم مهمه."),
                CulturalNote("Urbanization",
                    "شهرنشینی در سراسر جهان در حال افزایشه.")
            ),
            grammar = listOf(
                GrammarSection("Comparatives with cities",
                    """
                        The city is busier than the suburbs.
                        The suburbs are quieter than downtown.
                        Living downtown is more expensive than living outside.
                    """.trimIndent()),
                GrammarSection("Superlatives",
                    """
                        Tokyo is one of the biggest cities in the world.
                        It's the most crowded city I've visited.
                    """.trimIndent()),
                GrammarSection("There is / there are",
                    """
                        There are many restaurants downtown.
                        There isn't much parking.
                    """.trimIndent()),
                GrammarSection("Present perfect for experience",
                    """
                        I've lived in the city for five years.
                        She's never lived in the suburbs.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The city is more busy.", "The city is busier.", "برای صفت کوتاه از -er."),
                CommonMistake("There is many shops.", "There are many shops.", "جمع = there are."),
                CommonMistake("I've lived here since 5 years.", "I've lived here for 5 years.", "for مدت، since نقطه شروع.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you prefer living in the city or the suburbs?", "زندگی در شهر رو ترجیح می‌دی یا حومه؟"),
                DialogueLine("B", "I prefer the city. There's always something to do.", "من شهر رو ترجیح می‌دم. همیشه چیزی برای انجام دادن هست."),
                DialogueLine("A", "I can see that. But isn't it too noisy?", "می‌فهمم. ولی خیلی پرسروصدا نیست؟"),
                DialogueLine("B", "Sometimes. But the convenience is worth it.", "گاهی. ولی راحتی‌اش ارزشش رو داره."),
                DialogueLine("A", "What do you like most about the city?", "چی بیشتر در شهر دوست داری؟"),
                DialogueLine("B", "Public transport, restaurants, and cultural events.", "حمل و نقل عمومی، رستوران‌ها و رویدادهای فرهنگی."),
                DialogueLine("A", "What about the cost of living?", "هزینه زندگی چطور؟"),
                DialogueLine("B", "It's high, honestly. Rent takes most of my salary.", "صادقانه بالاست. اجاره بیشتر حقوقم رو می‌بره."),
                DialogueLine("A", "I see. Do you ever think about moving to the suburbs?", "می‌فهمم. تا حالا به نقل مکان به حومه فکر کرده‌ای؟"),
                DialogueLine("B", "Sometimes. The suburbs are quieter and more peaceful.", "گاهی. حومه ساکت‌تر و آرام‌تره."),
                DialogueLine("A", "But then you'd need a car.", "ولی اون موقع ماشین لازم داری."),
                DialogueLine("B", "True. It's a trade-off.", "درسته. یه معاوضه‌ست."),
                DialogueLine("A", "Which city do you think is the best?", "فکر می‌کنی کدوم شهر بهترینه؟"),
                DialogueLine("B", "I've heard Tokyo is amazing. I'd love to visit.", "شنیده‌ام توکیو فوق‌العاده‌ست. دوست دارم برم."),
                DialogueLine("A", "Me too. It's one of the biggest cities in the world.", "منم. یکی از بزرگ‌ترین شهرهای جهانه."),
                DialogueLine("B", "Maybe one day. For now, I'm happy here.", "شاید یه روز. فعلاً اینجا خوشحالم."),
                DialogueLine("A", "That's what matters. Home is where you feel good.", "همین مهمه. خونه جاییه که احساس خوبی داری."),
                DialogueLine("B", "Exactly. Well said.", "دقیقاً. خوب گفتی.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B شهر یا حومه را ترجیح می‌دهد؟", "شهر."),
                ComprehensionQuestion("B چه چیزی در شهر بیشتر دوست دارد؟", "حمل و نقل، رستوران، رویدادهای فرهنگی."),
                ComprehensionQuestion("چالش اصلی زندگی شهری چیست؟", "هزینه بالای زندگی."),
                ComprehensionQuestion("B کدام شهر را دوست دارد ببیند؟", "توکیو.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your city.",
                    "شهرت رو توصیف کن.",
                    "It's... / There are..."),
                SpeakingTask("Compare city and country life.",
                    "زندگی شهری و روستایی رو مقایسه کن.",
                    "City is... / Country is...")
            ),
            writingTasks = listOf(
                WritingTask("Write about the advantages and disadvantages of city life.",
                    "درباره مزایا و معایب زندگی شهری بنویس.",
                    150,
                    "Use comparatives and superlatives.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The city is ___ than the suburbs.",
                    listOf("busy", "busier", "busiest", "more busy"), 1),
                QuizQuestion("Complete: There ___ many restaurants downtown.",
                    listOf("is", "are", "was", "has"), 1),
                QuizQuestion("Complete: I've lived here ___ 5 years.",
                    listOf("since", "for", "in", "at"), 1),
                QuizQuestion("What does 'concrete jungle' mean?",
                    listOf("جنگل بتنی", "پارک", "باغ", "روستا"), 0),
                QuizQuestion("Complete: Tokyo is ___ of the biggest cities.",
                    listOf("one", "first", "a", "the"), 0),
                QuizQuestion("Complete: The suburbs are ___ than downtown.",
                    listOf("quiet", "quieter", "quietest", "more quiet"), 1),
                QuizQuestion("Complete: I've never ___ in the suburbs.",
                    listOf("live", "lived", "living", "lives"), 1),
                QuizQuestion("What does 'bright lights' mean?",
                    listOf("چراغ‌های روشن شهر", "نور خورشید", "برق", "آتش"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 10 — Emotions and Feelings
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Emotions and Feelings",
            titlePersian = "احساسات و عواطف",
            objectives = listOf(
                "Talk about emotions",
                "Use adjectives for feelings",
                "Express opinions and reactions",
                "Describe how you feel"
            ),
            vocabulary = listOf(
                VocabWord("happy", "خوشحال", "/ˈhæpi/", "adjective",
                    "I'm happy today.", "امروز خوشحالم."),
                VocabWord("sad", "غمگین", "/sæd/", "adjective",
                    "She's sad about the news.", "او از این خبر غمگینه."),
                VocabWord("angry", "عصبانی", "/ˈæŋɡri/", "adjective",
                    "He's angry with me.", "او از من عصبانیه."),
                VocabWord("excited", "هیجان‌زده", "/ɪkˈsaɪtɪd/", "adjective",
                    "I'm excited about the trip.", "درباره سفر هیجان‌زده‌ام."),
                VocabWord("nervous", "مضطرب", "/ˈnɜːrvəs/", "adjective",
                    "I'm nervous about the exam.", "درباره امتحان مضطربم."),
                VocabWord("proud", "افتخار", "/praʊd/", "adjective",
                    "I'm proud of you.", "بهت افتخار می‌کنم."),
                VocabWord("grateful", "سپاسگزار", "/ˈɡreɪtfəl/", "adjective",
                    "I'm grateful for your help.", "برای کمکت سپاسگزارم."),
                VocabWord("worried", "نگران", "/ˈwɜːrid/", "adjective",
                    "She's worried about her family.", "او نگران خانواده‌اشه."),
                VocabWord("lonely", "تنها", "/ˈloʊnli/", "adjective",
                    "Sometimes I feel lonely.", "گاهی احساس تنهایی می‌کنم."),
                VocabWord("relaxed", "آرام", "/rɪˈlækst/", "adjective",
                    "I feel relaxed after yoga.", "بعد از یوگا احساس آرامش می‌کنم.")
            ),
            idioms = listOf(
                IdiomExpression("on cloud nine", "خیلی خوشحال",
                    "She was on cloud nine after the news.", "بعد از خبر خیلی خوشحال بود.", "idiom"),
                IdiomExpression("down in the dumps", "غمگین",
                    "He's been down in the dumps lately.", "این اواخر غمگین بوده.", "idiom"),
                IdiomExpression("butterflies in my stomach", "دلشوره داشتن",
                    "I had butterflies before the interview.", "قبل از مصاحبه دلشوره داشتم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("excited",
                    "excited /ɪkˈsaɪtɪd/ — سه سیلاب."),
                PronunciationTip("grateful",
                    "grateful /ˈɡreɪtfəl/ — استرس روی great.")
            ),
            culturalNotes = listOf(
                CulturalNote("Expressing emotions",
                    "در غرب، بیان احساسات رایجه."),
                CulturalNote("Emotional intelligence",
                    "هوش هیجانی در غرب خیلی ارزشمنده.")
            ),
            grammar = listOf(
                GrammarSection("Be + adjective",
                    """
                        I am happy.
                        She is excited.
                        They were nervous.
                    """.trimIndent()),
                GrammarSection("Feel + adjective",
                    """
                        I feel tired.
                        She feels lonely.
                        We felt relieved.
                    """.trimIndent()),
                GrammarSection("Adjectives ending in -ed and -ing",
                    """
                        -ed: احساس شخص
                        I'm bored.
                        She's interested.

                        -ing: منبع احساس
                        The movie is boring.
                        The book is interesting.
                    """.trimIndent()),
                GrammarSection("Expressing reactions",
                    """
                        That's great!
                        I'm sorry to hear that.
                        How wonderful!
                        That's too bad.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I'm boring.", "I'm bored.", "bored = احساس شخص، boring = منبع."),
                CommonMistake("I have hungry.", "I'm hungry.", "گرسنگی با be."),
                CommonMistake("I feel myself happy.", "I feel happy.", "feel + adjective.")
            ),
            conversation = listOf(
                DialogueLine("A", "You look happy today!", "امروز خوشحال به نظر می‌رسی!"),
                DialogueLine("B", "I am! I got a new job.", "هستم! یه شغل جدید گرفتم."),
                DialogueLine("A", "Congratulations! How do you feel?", "تبریک! چه حسی داری؟"),
                DialogueLine("B", "Excited and a bit nervous.", "هیجان‌زده و یه کم مضطرب."),
                DialogueLine("A", "That's normal. When do you start?", "این طبیعیه. کِی شروع می‌کنی؟"),
                DialogueLine("B", "Next Monday. I'm a little worried about it.", "دوشنبه بعد. یه کم نگرانشم."),
                DialogueLine("A", "Don't worry, you'll do great.", "نگران نباش، عالی عمل می‌کنی."),
                DialogueLine("B", "Thanks. What about you? How are you feeling?", "ممنون. تو چطور؟ چه حسی داری؟"),
                DialogueLine("A", "Honestly, a bit stressed. I have exams coming up.", "صادقانه، یه کم استرس دارم. امتحان‌هام نزدیکه."),
                DialogueLine("B", "I understand. You'll get through it.", "می‌فهمم. از پسش برمیای."),
                DialogueLine("A", "Thanks for the encouragement.", "ممنون برای تشویق."),
                DialogueLine("B", "Anytime. Do you want to grab a coffee?", "هر وقت. می‌خوای بریم قهوه بخوریم؟"),
                DialogueLine("A", "That would be nice. I could use a break.", "خوب می‌شه. به استراحت نیاز دارم."),
                DialogueLine("B", "Perfect. Coffee always helps.", "عالی. قهوه همیشه کمک می‌کنه."),
                DialogueLine("A", "True! Thanks for being there.", "درسته! ممنون که هستی."),
                DialogueLine("B", "That's what friends are for.", "دوست برای همین است."),
                DialogueLine("A", "You're the best. Let's go.", "تو بهترینی. بریم."),
                DialogueLine("B", "After you!", "شما اول!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چرا خوشحاله؟", "شغل جدید گرفته."),
                ComprehensionQuestion("B چه حسی درباره شغل جدید دارد؟", "هیجان‌زده و کمی مضطرب."),
                ComprehensionQuestion("A چه حسی دارد؟", "استرس، چون امتحان دارد."),
                ComprehensionQuestion("B چطور به A کمک می‌کند؟", "تشویق می‌کند و برای قهوه دعوت می‌کند.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about how you feel today.",
                    "درباره اینکه امروز چه حسی داری صحبت کن.",
                    "I feel... / I'm..."),
                SpeakingTask("Express reactions to news.",
                    "به اخبار واکنش نشون بده.",
                    "That's great! / I'm sorry to hear that.")
            ),
            writingTasks = listOf(
                WritingTask("Write about a time when you felt very happy.",
                    "درباره زمانی که خیلی خوشحال بودی بنویس.",
                    150,
                    "Use adjectives for feelings.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I'm ___ in this book.",
                    listOf("interesting", "interested", "interest", "interests"), 1),
                QuizQuestion("Complete: The movie is ___.",
                    listOf("bored", "boring", "bore", "bores"), 1),
                QuizQuestion("Complete: I feel ___ today.",
                    listOf("happy", "happiness", "happily", "happier"), 0),
                QuizQuestion("What does 'on cloud nine' mean?",
                    listOf("در آسمان", "خیلی خوشحال", "غمگین", "خسته"), 1),
                QuizQuestion("Complete: She's ___ of her son.",
                    listOf("proud", "proudly", "pride", "prouder"), 0),
                QuizQuestion("What does 'butterflies in my stomach' mean?",
                    listOf("پروانه در شکم", "دلشوره", "گرسنگی", "مریضی"), 1),
                QuizQuestion("Complete: I'm ___ about the exam.",
                    listOf("nervous", "nerve", "nervously", "nervousness"), 0),
                QuizQuestion("Complete: I'm ___ for your help.",
                    listOf("grateful", "gratitude", "gratefully", "grate"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 11 — Environment and Future
    // ═══════════════════════════════════════════════════════════
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Environment and Future",
            titlePersian = "محیط زیست و آینده",
            objectives = listOf(
                "Talk about the environment",
                "Use the first conditional",
                "Discuss future predictions",
                "Talk about sustainable living"
            ),
            vocabulary = listOf(
                VocabWord("environment", "محیط زیست", "/ɪnˈvaɪrənmənt/", "noun",
                    "We must protect the environment.", "باید از محیط زیست محافظت کنیم."),
                VocabWord("climate", "اقلیم", "/ˈklaɪmət/", "noun",
                    "Climate change is serious.", "تغییر اقلیم جدیه."),
                VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun",
                    "Air pollution is harmful.", "آلودگی هوا مضره."),
                VocabWord("renewable", "تجدیدپذیر", "/rɪˈnuːəbəl/", "adjective",
                    "Solar is renewable energy.", "خورشیدی انرژی تجدیدپذیره."),
                VocabWord("sustainable", "پایدار", "/səˈsteɪnəbəl/", "adjective",
                    "We need sustainable solutions.", "به راه‌حل‌های پایدار نیاز داریم."),
                VocabWord("recycle", "بازیافت کردن", "/ˌriːˈsaɪkəl/", "verb",
                    "We recycle paper.", "ما کاغذ بازیافت می‌کنیم."),
                VocabWord("protect", "محافظت کردن", "/prəˈtekt/", "verb",
                    "Let's protect nature.", "بیا از طبیعت محافظت کنیم."),
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun",
                    "The future depends on us.", "آینده به ما بستگی داره."),
                VocabWord("planet", "سیاره", "/ˈplænɪt/", "noun",
                    "We must save the planet.", "باید سیاره رو نجات بدیم."),
                VocabWord("impact", "تأثیر", "/ˈɪmpækt/", "noun",
                    "Our choices have an impact.", "انتخاب‌های ما تأثیر دارن.")
            ),
            idioms = listOf(
                IdiomExpression("go green", "دوستدار محیط زیست شدن",
                    "Many companies are going green.", "بسیاری از شرکت‌ها سبز می‌شن.", "informal"),
                IdiomExpression("carbon footprint", "ردپای کربن",
                    "Reduce your carbon footprint.", "ردپای کربنت رو کم کن.", "neutral"),
                IdiomExpression("the bigger picture", "تصویر بزرگ‌تر",
                    "Look at the bigger picture.", "به تصویر بزرگ‌تر نگاه کن.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("environment",
                    "environment /ɪnˈvaɪrənmənt/ — استرس روی vi."),
                PronunciationTip("sustainable",
                    "sustainable /səˈsteɪnəbəl/ — چهار سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Earth Day",
                    "22 آپریل روز زمین است."),
                CulturalNote("Climate activism",
                    "فعالیت‌های زیست‌محیطی در غرب رایجه.")
            ),
            grammar = listOf(
                GrammarSection("First conditional",
                    """
                        If + present simple, will + verb

                        If we recycle, we will help the planet.
                        If you don't act, things will get worse.
                    """.trimIndent()),
                GrammarSection("Future predictions with will",
                    """
                        The climate will change.
                        We will run out of resources.
                        Technology will help us.
                    """.trimIndent()),
                GrammarSection("Should for environment",
                    """
                        We should recycle more.
                        We shouldn't waste water.
                        You should use public transport.
                    """.trimIndent()),
                GrammarSection("Imperatives for advice",
                    """
                        Recycle paper and plastic.
                        Save water and energy.
                        Don't waste food.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If we will recycle, we help.", "If we recycle, we will help.", "در if از present simple."),
                CommonMistake("We should to protect.", "We should protect.", "بعد از should فعل ساده."),
                CommonMistake("The environment is important for we.", "The environment is important for us.", "بعد از for ضمیر مفعولی.")
            ),
            conversation = listOf(
                DialogueLine("A", "Are you worried about climate change?", "درباره تغییر اقلیم نگرانی؟"),
                DialogueLine("B", "Yes, I am. It's one of the biggest problems we face.", "بله. یکی از بزرگ‌ترین مشکلاتیه که باهاش روبرویم."),
                DialogueLine("A", "What do you do for the environment?", "برای محیط زیست چیکار می‌کنی؟"),
                DialogueLine("B", "I recycle, save water, and use public transport.", "بازیافت می‌کنم، آب ذخیره می‌کنم و از حمل و نقل عمومی استفاده می‌کنم."),
                DialogueLine("A", "That's great. Do you use renewable energy?", "عالیه. از انرژی تجدیدپذیر استفاده می‌کنی؟"),
                DialogueLine("B", "Not yet, but I'm thinking about solar panels.", "هنوز نه، ولی دارم به پنل‌های خورشیدی فکر می‌کنم."),
                DialogueLine("A", "That's a great step. What do you think the future holds?", "قدم بزرگیه. فکر می‌کنی آینده چی داره؟"),
                DialogueLine("B", "If we don't act, it will get worse.", "اگه اقدام نکنیم، بدتر می‌شه."),
                DialogueLine("A", "I agree. What should we do first?", "موافقم. اول باید چیکار کنیم؟"),
                DialogueLine("B", "Reduce waste, use green energy, and educate people.", "کاهش زباله، استفاده از انرژی سبز، آموزش مردم."),
                DialogueLine("A", "Those are good ideas. Do you think governments should do more?", "ایده‌های خوبی هستن. فکر می‌کنی دولت‌ها باید بیشتر انجام بدن؟"),
                DialogueLine("B", "Definitely. Policies can make a big difference.", "قطعاً. سیاست‌ها می‌تونن تفاوت بزرگی ایجاد کنن."),
                DialogueLine("A", "What about individuals?", "افراد چطور؟"),
                DialogueLine("B", "Small changes add up. Every action counts.", "تغییرات کوچک جمع می‌شن. هر اقدامی مهمه."),
                DialogueLine("A", "That's encouraging. I'll do more.", "این دلگرم‌کننده‌ست. منم بیشتر انجام می‌دم."),
                DialogueLine("B", "Great! Together we can make a difference.", "عالی! با هم می‌تونیم تفاوت ایجاد کنیم."),
                DialogueLine("A", "I hope so. The planet needs us.", "امیدوارم. سیاره به ما نیاز داره."),
                DialogueLine("B", "It does. Let's protect it.", "همین‌طوره. بیا ازش محافظت کنیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B برای محیط زیست چیکار می‌کند؟", "بازیافت، ذخیره آب، حمل و نقل عمومی."),
                ComprehensionQuestion("B به چه چیزی فکر می‌کند؟", "پنل خورشیدی."),
                ComprehensionQuestion("B فکر می‌کند اگر اقدام نکنیم چه می‌شود؟", "بدتر می‌شود."),
                ComprehensionQuestion("B چه پیشنهادی برای آینده دارد؟", "کاهش زباله، انرژی سبز، آموزش مردم.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about environmental problems.",
                    "درباره مشکلات زیست‌محیطی صحبت کن.",
                    "The environment is... / We should..."),
                SpeakingTask("Discuss future predictions about climate.",
                    "درباره پیش‌بینی‌های آینده اقلیم صحبت کن.",
                    "If we don't act... / The climate will...")
            ),
            writingTasks = listOf(
                WritingTask("Write about how to protect the environment.",
                    "درباره چطور محافظت از محیط زیست بنویس.",
                    180,
                    "Use first conditional and should.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If we recycle, we ___ help the planet.",
                    listOf("will", "are", "is", "do"), 0),
                QuizQuestion("Complete: We should ___ more.",
                    listOf("recycle", "recycles", "recycling", "recycled"), 0),
                QuizQuestion("Complete: Don't waste ___.",
                    listOf("the water", "water", "waters", "a water"), 1),
                QuizQuestion("What does 'go green' mean?",
                    listOf("سبز شدن", "دوستدار محیط زیست شدن", "گیاه کاشتن", "رنگ عوض کردن"), 1),
                QuizQuestion("Complete: ___ we don't act, things will get worse.",
                    listOf("If", "When", "Because", "So"), 0),
                QuizQuestion("Complete: Pollution ___ everyone.",
                    listOf("affect", "affects", "affecting", "affected"), 1),
                QuizQuestion("What does 'carbon footprint' mean?",
                    listOf("ردپا", "ردپای کربن", "ردیابی", "گاز"), 1),
                QuizQuestion("Complete: The planet needs ___.",
                    listOf("we", "us", "our", "ours"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 12 — Review and Goals
    // ═══════════════════════════════════════════════════════════
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review and Goals",
            titlePersian = "مرور و اهداف",
            objectives = listOf(
                "Review all tenses",
                "Set personal and professional goals",
                "Use all grammar structures",
                "Prepare for advanced English"
            ),
            vocabulary = listOf(
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "My goal is to be fluent.", "هدفم روان شدنه."),
                VocabWord("review", "مرور", "/rɪˈvjuː/", "noun/verb",
                    "Let's review the lesson.", "بیا درس رو مرور کنیم."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "You've made great progress.", "پیشرفت خوبی داشته‌ای."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective",
                    "I feel confident now.", "الان با اعتماد به نفس‌ام."),
                VocabWord("fluent", "روان", "/ˈfluːənt/", "adjective",
                    "She's fluent in English.", "او در انگلیسی روانه."),
                VocabWord("achieve", "دست یافتن", "/əˈtʃiːv/", "verb",
                    "I want to achieve my goals.", "می‌خوام به اهدافم برسم."),
                VocabWord("determined", "مصمم", "/dɪˈtɜːrmɪnd/", "adjective",
                    "She's determined to succeed.", "او مصمم به موفقیته."),
                VocabWord("consistent", "پیوسته", "/kənˈsɪstənt/", "adjective",
                    "Be consistent in your practice.", "در تمرینت پیوسته باش."),
                VocabWord("improve", "بهبود دادن", "/ɪmˈpruːv/", "verb",
                    "I want to improve my speaking.", "می‌خوام مکالمه‌ام رو بهتر کنم."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "English is a fun challenge.", "انگلیسی چالش سرگرم‌کننده‌ایه.")
            ),
            idioms = listOf(
                IdiomExpression("practice makes perfect", "تمرین باعث پیشرفت می‌شه",
                    "Practice makes perfect — keep going!", "تمرین باعث پیشرفت می‌شه — ادامه بده!", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد",
                    "Don't give up. Rome wasn't built in a day.", "تسلیم نشو. رم در یک روز ساخته نشد.", "idiom"),
                IdiomExpression("break a leg", "موفق باشی",
                    "Break a leg on your exam!", "در امتحانت موفق باشی!", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Intonation",
                    "در سؤال‌ها معمولاً صدای پایان جمله بالا می‌رود."),
                PronunciationTip("Linking",
                    "در گفتار طبیعی، انگلیسی‌زبانان کلمات را به هم می‌چسبانند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Lifelong learning",
                    "یادگیری مادام‌العمر در غرب خیلی ارزشمنده."),
                CulturalNote("Mistakes",
                    "اشتباه کردن بخش طبیعی یادگیری است.")
            ),
            grammar = listOf(
                GrammarSection("Review: Present simple",
                    """
                        I work every day.
                        She studies English.
                    """.trimIndent()),
                GrammarSection("Review: Past simple",
                    """
                        I went to Paris.
                        She saw a movie.
                    """.trimIndent()),
                GrammarSection("Review: Present perfect",
                    """
                        I've been to London.
                        Have you ever eaten sushi?
                    """.trimIndent()),
                GrammarSection("Review: Future and conditionals",
                    """
                        I'll help you.
                        I'm going to travel.
                        If I study, I will pass.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I am agree.", "I agree.", "agree فعل است، بدون am."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده."),
                CommonMistake("He don't like it.", "He doesn't like it.", "برای he/she/it از doesn't.")
            ),
            conversation = listOf(
                DialogueLine("A", "How's your English going?", "انگلیسی‌ت چطور پیش می‌ره؟"),
                DialogueLine("B", "Pretty well! I've been practicing every day.", "خیلی خوب! هر روز تمرین کرده‌ام."),
                DialogueLine("A", "That's great. Do you feel more confident now?", "عالیه. الان با اعتماد به نفس‌تری؟"),
                DialogueLine("B", "Yes, much more. I can have basic conversations now.", "بله، خیلی بیشتر. الان می‌تونم مکالمات پایه داشته باشم."),
                DialogueLine("A", "Awesome! What was the hardest part?", "عالی! سخت‌ترین قسمت چی بود؟"),
                DialogueLine("B", "Probably the grammar, especially the tenses.", "احتمالاً گرامر، خصوصاً زمان‌ها."),
                DialogueLine("A", "Yeah, tenses are tricky. What helped you most?", "آره، زمان‌ها پیچیدن. چی بیشتر کمک کرد؟"),
                DialogueLine("B", "Watching movies and talking to native speakers.", "فیلم دیدن و صحبت با نیتیوها."),
                DialogueLine("A", "That makes sense. What's your next goal?", "منطقیه. هدف بعدی‌ت چیه؟"),
                DialogueLine("B", "I want to be fluent in two years.", "می‌خوام در دو سال روان بشم."),
                DialogueLine("A", "That's a great goal. How will you get there?", "هدف عالیه. چطور بهش می‌رسی؟"),
                DialogueLine("B", "Practice every day, take more classes, and read books.", "هر روز تمرین، کلاس بیشتر، و کتاب خوندن."),
                DialogueLine("A", "Sounds like a good plan. Good luck!", "برنامه خوبی به نظر می‌رسه. موفق باشی!"),
                DialogueLine("B", "Thanks! I'll keep going. Practice makes perfect.", "ممنون! ادامه می‌دم. تمرین باعث پیشرفت می‌شه."),
                DialogueLine("A", "Exactly. Rome wasn't built in a day.", "دقیقاً. رم در یک روز ساخته نشد."),
                DialogueLine("B", "True. I'll be patient and consistent.", "درسته. صبور و پیوسته خواهم بود."),
                DialogueLine("A", "That's the spirit. See you soon!", "همین روحیه رو می‌خوام. به‌زودی می‌بینمت!"),
                DialogueLine("B", "See you! Thanks for the encouragement.", "می‌بینمت! ممنون برای تشویق.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور انگلیسی‌اش را تقویت کرده؟", "تمرین روزانه، فیلم دیدن، صحبت با نیتیوها."),
                ComprehensionQuestion("سخت‌ترین بخش برای B چه بود؟", "گرامر، خصوصاً زمان‌ها."),
                ComprehensionQuestion("هدف B چیست؟", "روان شدن در دو سال."),
                ComprehensionQuestion("B چطور می‌خواهد به هدفش برسد؟", "تمرین روزانه، کلاس، کتاب خواندن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your English learning journey.",
                    "درباره مسیر یادگیری انگلیسی‌ات صحبت کن.",
                    "I started... / I've learned... / My goal is..."),
                SpeakingTask("Give advice to a beginner.",
                    "به یک مبتدی توصیه کن.",
                    "You should... / Don't give up...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your English learning goals.",
                    "درباره اهداف یادگیری انگلیسی‌ات بنویس.",
                    180,
                    "Use all tenses you've learned.")
            ),
            quiz = listOf(
                QuizQuestion("What does 'practice makes perfect' mean?",
                    listOf("تمرین سخت است", "تمرین باعث پیشرفت می‌شه", "تمرین بی‌فایده است", "تمرین طولانی است"), 1),
                QuizQuestion("Complete: I ___ him yesterday.",
                    listOf("see", "saw", "seen", "seeing"), 1),
                QuizQuestion("Complete: She ___ English every day.",
                    listOf("study", "studies", "studying", "studied"), 1),
                QuizQuestion("Complete: I ___ to London twice.",
                    listOf("was", "have been", "go", "going"), 1),
                QuizQuestion("What does 'break a leg' mean?",
                    listOf("شکستن پا", "موفق باشی", "شکست خوردن", "دویدن"), 1),
                QuizQuestion("Complete: I ___ help you tomorrow.",
                    listOf("will", "am", "do", "have"), 0),
                QuizQuestion("Complete: If you practice, you ___ improve.",
                    listOf("will", "are", "do", "have"), 0),
                QuizQuestion("Complete: ___ you ever been to Paris?",
                    listOf("Do", "Did", "Have", "Are"), 2)
            )
        )
    }
}