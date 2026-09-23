package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object Evolve3 {

    const val BOOK_ID = "evolve_3"

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
    // CHAPTER 1 — Life Changes
    // ═══════════════════════════════════════════════════════════
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Life Changes",
            titlePersian = "تغییرات زندگی",
            objectives = listOf(
                "Talk about changes in your life",
                "Describe past and present situations",
                "Use present perfect and simple past",
                "Ask follow-up questions in conversations"
            ),
            vocabulary = listOf(
                VocabWord("change", "تغییر", "/tʃeɪndʒ/", "noun",
                    "Moving was a big change.", "نقل مکان تغییر بزرگی بود."),
                VocabWord("experience", "تجربه", "/ɪkˈspɪəriəns/", "noun",
                    "It was an interesting experience.", "تجربه جالبی بود."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun",
                    "It's a great opportunity.", "فرصت عالیه."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "Learning a language is a challenge.", "یادگیری زبان یه چالشه."),
                VocabWord("decision", "تصمیم", "/dɪˈsɪʒən/", "noun",
                    "It was a difficult decision.", "تصمیم سختی بود."),
                VocabWord("improve", "بهبود دادن", "/ɪmˈpruːv/", "verb",
                    "My English has improved.", "انگلیسی‌ام بهتر شده."),
                VocabWord("adjust", "سازگار شدن", "/əˈdʒʌst/", "verb",
                    "It took time to adjust.", "سازگاری زمان برد."),
                VocabWord("independent", "مستقل", "/ˌɪndɪˈpendənt/", "adjective",
                    "Living alone made me independent.", "تنها زندگی کردن مستقل‌ترم کرد."),
                VocabWord("comfortable", "راحت", "/ˈkʌmftərbəl/", "adjective",
                    "I feel comfortable now.", "الان احساس راحتی می‌کنم."),
                VocabWord("recently", "اخیراً", "/ˈriːsəntli/", "adverb",
                    "I recently started a course.", "اخیراً یه دوره شروع کردم."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "My goal is to speak fluently.", "هدفم روان صحبت کردنه."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "I'm happy with my progress.", "از پیشرفتم راضی‌ام."),
                VocabWord("settle", "جا افتادن", "/ˈsetəl/", "verb",
                    "It took months to settle in.", "جا افتادن ماه‌ها طول کشید.")
            ),
            idioms = listOf(
                IdiomExpression("turning point", "نقطه عطف",
                    "Moving abroad was a turning point.", "مهاجرت نقطه عطفی بود.", "neutral"),
                IdiomExpression("step out of your comfort zone", "از محدوده امن خارج شدن",
                    "Learning English helps you step out of your comfort zone.", "یادگیری انگلیسی به خارج شدن از محدوده امن کمک می‌کنه.", "neutral"),
                IdiomExpression("a fresh start", "شروع تازه",
                    "The new city gave him a fresh start.", "شهر جدید شروع تازه‌ای داد.", "neutral")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("settle in", "جا افتادن", "جا افتادن در جای جدید",
                    "It took me a month to settle in.", "یک ماه طول کشید تا جا بیفتم.", "No"),
                PhrasalVerb("take up", "شروع کردن سرگرمی", "شروع کردن",
                    "I recently took up photography.", "اخیراً عکاسی رو شروع کردم.", "Yes"),
                PhrasalVerb("give up", "رها کردن", "دست کشیدن",
                    "I don't want to give up my studies.", "نمی‌خوام از درس دست بکشم.", "Yes"),
                PhrasalVerb("catch up", "به‌روز شدن", "خود را رساندن",
                    "Let's meet and catch up soon.", "بیا به‌زودی ببینیم و به‌روز شیم.", "No")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Present Perfect contractions",
                    "have → 've، has → 's در گفتار طبیعی."),
                PronunciationTip("Have you...?",
                    "در سؤال Have you ever...؟ کلمات را پیوسته تلفظ کن."),
                PronunciationTip("Past Participles",
                    "been، gone، seen را واضح تلفظ کن.")
            ),
            culturalNotes = listOf(
                CulturalNote("Talking about personal change",
                    "پرسیدن درباره تغییرات اخیر موضوع طبیعی مکالمه‌ست."),
                CulturalNote("Follow-up questions",
                    "بعد از تجربه، سؤال تکمیلی مثل What happened next? مکالمه رو طبیعی‌تر می‌کنه."),
                CulturalNote("Sharing experiences",
                    "افراد ابتدا تجربه کلی را با present perfect و جزئیات را با past simple می‌گویند.")
            ),
            grammar = listOf(
                GrammarSection("Present Perfect for Life Experiences",
                    """
                        have/has + past participle

                        I have visited several countries.
                        She has tried Japanese food.
                        Have you ever lived abroad?
                    """.trimIndent()),
                GrammarSection("Present Perfect vs Simple Past",
                    """
                        Present Perfect: I've visited London.
                        Simple Past: I visited London in 2023.
                    """.trimIndent()),
                GrammarSection("For and Since",
                    """
                        for + مدت: for three years
                        since + نقطه شروع: since 2023
                    """.trimIndent()),
                GrammarSection("Recently and Lately",
                    """
                        I've recently started a new course.
                        I've been very busy lately.
                    """.trimIndent()),
                GrammarSection("Follow-up Questions",
                    """
                        What happened? / When did that happen?
                        How did you feel? / What was it like?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have visited London last year.", "I visited London last year.", "زمان مشخص = simple past."),
                CommonMistake("I have lived here since three years.", "I have lived here for three years.", "for مدت، since نقطه شروع."),
                CommonMistake("She has went to Canada.", "She has gone to Canada.", "past participle."),
                CommonMistake("Did you ever visit Spain?", "Have you ever visited Spain?", "ever با present perfect.")
            ),
            conversation = listOf(
                DialogueLine("Maya", "You seem really busy. What's new?", "سرت شلوغ به نظر می‌رسه. چه خبر؟"),
                DialogueLine("Daniel", "A lot has changed. I've started a new job.", "خیلی چیزها عوض شده. یه شغل جدید شروع کردم."),
                DialogueLine("Maya", "Really? How long have you been there?", "واقعاً؟ چند وقته اونجایی؟"),
                DialogueLine("Daniel", "About three months.", "حدود سه ماه."),
                DialogueLine("Maya", "How do you like it?", "چطوره؟ راضی هستی؟"),
                DialogueLine("Daniel", "I like it a lot. The work is challenging.", "خیلی دوستش دارم. کار چالش‌برانگیزه."),
                DialogueLine("Maya", "Have you worked in that field before?", "قبلاً در این زمینه کار کرده‌ای؟"),
                DialogueLine("Daniel", "No, this is my first job in this field.", "نه، اولین شغلم در این زمینه‌ست."),
                DialogueLine("Maya", "That must have been a big change.", "حتماً تغییر بزرگی بوده."),
                DialogueLine("Daniel", "It was. I also moved to a new apartment.", "بود. به آپارتمان جدیدی هم نقل مکان کردم."),
                DialogueLine("Maya", "Have you settled in yet?", "هنوز جا افتادی؟"),
                DialogueLine("Daniel", "Mostly. I still have boxes to unpack.", "تقریباً. هنوز جعبه‌هایی برای باز کردن دارم."),
                DialogueLine("Maya", "Do you like the neighborhood?", "محله رو دوست داری؟"),
                DialogueLine("Daniel", "Yes. It's quieter than my old one.", "بله. از محله قبلی آرام‌تره."),
                DialogueLine("Maya", "Have you met many people?", "با افراد زیادی آشنا شدی؟"),
                DialogueLine("Daniel", "I've met a few neighbors, but no close friends yet.", "با چند همسایه آشنا شدم ولی هنوز دوست صمیمی نه."),
                DialogueLine("Maya", "Maybe you should take up a new hobby.", "شاید باید یه سرگرمی جدید شروع کنی."),
                DialogueLine("Daniel", "Good idea. I've always wanted to learn photography.", "فکر خوبی. همیشه می‌خواستم عکاسی یاد بگیرم."),
                DialogueLine("Maya", "There's a photography club near my house.", "یه باشگاه عکاسی نزدیک خونه‌ام هست."),
                DialogueLine("Daniel", "Have you ever joined a club?", "تا حالا عضو باشگاهی شده‌ای؟"),
                DialogueLine("Maya", "Yes, I joined a book club last year.", "بله، پارسال عضو یه باشگاه کتاب شدم."),
                DialogueLine("Daniel", "Did you enjoy it?", "لذت بردی؟"),
                DialogueLine("Maya", "I did. I made two good friends.", "بله. دو تا دوست خوب پیدا کردم."),
                DialogueLine("Daniel", "Then a new hobby is what I need.", "پس یه سرگرمی جدید چیزیه که لازم دارم."),
                DialogueLine("Maya", "A small change can make a big difference.", "یه تغییر کوچک می‌تونه تفاوت بزرگی ایجاد کنه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Daniel چه چیزی را اخیراً شروع کرده؟", "شغل جدید."),
                ComprehensionQuestion("چند وقت است که در شغل جدیدش است؟", "حدود سه ماه."),
                ComprehensionQuestion("Daniel به کجا نقل مکان کرده؟", "آپارتمان جدید."),
                ComprehensionQuestion("Maya چه پیشنهادی به Daniel می‌دهد؟", "شروع یه سرگرمی جدید مثل عکاسی."),
                ComprehensionQuestion("Maya چه باشگاهی را تجربه کرده؟", "باشگاه کتاب.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a recent change in your life.",
                    "درباره یک تغییر اخیر در زندگی‌ات صحبت کن.",
                    "I've recently... / I decided to..."),
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
                QuizQuestion("Complete: I ___ started a new course.",
                    listOf("have", "has", "am", "was"), 0),
                QuizQuestion("Complete: She ___ been there for 3 months.",
                    listOf("have", "has", "is", "was"), 1),
                QuizQuestion("Complete: I ___ to Paris last year.",
                    listOf("have been", "went", "go", "going"), 1),
                QuizQuestion("Complete: Have you ever ___ abroad?",
                    listOf("be", "being", "been", "was"), 2),
                QuizQuestion("What does 'turning point' mean?",
                    listOf("نقطه عطف", "پایان", "شروع", "میانه"), 0),
                QuizQuestion("Complete: I've lived here ___ three years.",
                    listOf("since", "for", "in", "at"), 1),
                QuizQuestion("Complete: I've lived here ___ 2020.",
                    listOf("since", "for", "in", "at"), 0),
                QuizQuestion("Complete: I ___ to improve my English.",
                    listOf("want", "wants", "wanting", "wanted"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 2 — Technology and Life
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Technology and Life",
            titlePersian = "تکنولوژی و زندگی",
            objectives = listOf(
                "Talk about technology in daily life",
                "Use comparatives and superlatives",
                "Discuss pros and cons",
                "Give opinions about technology"
            ),
            vocabulary = listOf(
                VocabWord("device", "دستگاه", "/dɪˈvaɪs/", "noun",
                    "I use many devices.", "از دستگاه‌های زیادی استفاده می‌کنم."),
                VocabWord("screen", "صفحه", "/skriːn/", "noun",
                    "The screen is bright.", "صفحه روشنه."),
                VocabWord("app", "اپلیکیشن", "/æp/", "noun",
                    "This app is useful.", "این اپ مفیده."),
                VocabWord("download", "دانلود کردن", "/ˌdaʊnˈloʊd/", "verb",
                    "I downloaded a game.", "یه بازی دانلود کردم."),
                VocabWord("upload", "آپلود کردن", "/ˌʌpˈloʊd/", "verb",
                    "She uploaded photos.", "عکس‌ها رو آپلود کرد."),
                VocabWord("internet", "اینترنت", "/ˈɪntərnet/", "noun",
                    "The internet is fast.", "اینترنت سریه."),
                VocabWord("online", "آنلاین", "/ˈɑːnlaɪn/", "adverb",
                    "I shop online.", "آنلاین خرید می‌کنم."),
                VocabWord("password", "رمز", "/ˈpæswɜːrd/", "noun",
                    "Choose a strong password.", "رمز قوی انتخاب کن."),
                VocabWord("update", "به‌روزرسانی", "/ˈʌpdeɪt/", "noun",
                    "I updated my phone.", "گوشیم رو به‌روزرسانی کردم."),
                VocabWord("useful", "مفید", "/ˈjuːsfəl/", "adjective",
                    "Technology is useful.", "تکنولوژی مفیده."),
                VocabWord("addicted", "معتاد", "/əˈdɪktɪd/", "adjective",
                    "I'm addicted to my phone.", "به گوشیم معتادم."),
                VocabWord("digital", "دیجیتال", "/ˈdɪdʒɪtəl/", "adjective",
                    "We live in a digital age.", "در عصر دیجیتال زندگی می‌کنیم.")
            ),
            idioms = listOf(
                IdiomExpression("user-friendly", "کاربرپسند",
                    "This app is user-friendly.", "این اپ کاربرپسنده.", "neutral"),
                IdiomExpression("cutting-edge", "پیشرو",
                    "This is cutting-edge tech.", "این تکنولوژی پیشروست.", "neutral"),
                IdiomExpression("break down", "خراب شدن",
                    "My computer broke down.", "کامپیوترم خراب شد.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Compound nouns",
                    "در website، استرس روی first syllable."),
                PronunciationTip("Silent letters",
                    "در Wednesday، d تلفظ نمی‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Technology culture",
                    "تکنولوژی بخش جدایی‌ناپذیر زندگی غربیه."),
                CulturalNote("Online privacy",
                    "حریم خصوصی آنلاین مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Comparatives",
                    """
                        faster than
                        cheaper than
                        more useful than
                    """.trimIndent()),
                GrammarSection("Superlatives",
                    """
                        the fastest
                        the most useful
                    """.trimIndent()),
                GrammarSection("Present perfect with technology",
                    """
                        I've used this app for two years.
                        She's never tried VR.
                    """.trimIndent()),
                GrammarSection("Opinions about technology",
                    """
                        I think technology is...
                        In my opinion...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She is more tall.", "She is taller.", "صفت کوتاه: -er."),
                CommonMistake("This is the most fast.", "This is the fastest.", "صفت کوتاه: -est."),
                CommonMistake("I have download the app.", "I have downloaded the app.", "past participle.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you use technology a lot?", "زیاد از تکنولوژی استفاده می‌کنی؟"),
                DialogueLine("B", "Yes, I use my phone for everything.", "بله، از گوشیم برای همه چیز استفاده می‌کنم."),
                DialogueLine("A", "What apps do you use most?", "بیشتر از چه اپ‌هایی استفاده می‌کنی؟"),
                DialogueLine("B", "Social media, maps, and a language app.", "شبکه‌های اجتماعی، نقشه و اپ زبان."),
                DialogueLine("A", "Which is the most useful?", "کدوم مفیدتره؟"),
                DialogueLine("B", "The language app. I've improved a lot.", "اپ زبان. خیلی پیشرفت کردم."),
                DialogueLine("A", "Do you feel addicted to your phone?", "احساس اعتیاد به گوشی داری؟"),
                DialogueLine("B", "Sometimes. It's hard to disconnect.", "گاهی. قطع کردن سخته."),
                DialogueLine("A", "I try to take breaks.", "سعی می‌کنم استراحت بدم."),
                DialogueLine("B", "That's smart. What's the biggest tech change?", "هوشمندانه‌ست. بزرگ‌ترین تغییر تکنولوژی چیه؟"),
                DialogueLine("A", "Probably smartphones.", "احتمالاً گوشی‌های هوشمند."),
                DialogueLine("B", "I agree. Life was different before.", "موافقم. زندگی قبلشون متفاوت بود."),
                DialogueLine("A", "Sometimes I miss simpler times.", "گاهی دلم برای زمان‌های ساده‌تر تنگ می‌شه."),
                DialogueLine("B", "Me too. But tech has advantages too.", "منم. ولی تکنولوژی مزایا هم داره."),
                DialogueLine("A", "It's about balance.", "موضوع تعادله."),
                DialogueLine("B", "Use it, don't let it use you.", "ازش استفاده کن، نذار ازت استفاده کنه."),
                DialogueLine("A", "Well said!", "خوب گفتی!"),
                DialogueLine("B", "Let's try a phone-free day.", "بیا یه روز بدون گوشی داشته باشیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B از چه اپ‌هایی استفاده می‌کند؟", "شبکه‌های اجتماعی، نقشه، اپ زبان."),
                ComprehensionQuestion("کدام اپ مفیدتر است؟", "اپ زبان."),
                ComprehensionQuestion("B چرا احساس اعتیاد می‌کند؟", "چون قطع کردن سخت است."),
                ComprehensionQuestion("A چه راه‌حلی پیشنهاد می‌کند؟", "استراحت دادن و تعادل.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about technology in your life.",
                    "درباره تکنولوژی در زندگی‌ات صحبت کن.",
                    "I use... / I've used..."),
                SpeakingTask("Discuss pros and cons of social media.",
                    "درباره مزایا و معایب شبکه‌های اجتماعی صحبت کن.",
                    "It's useful... / But it can be...")
            ),
            writingTasks = listOf(
                WritingTask("Write about pros and cons of smartphones.",
                    "درباره مزایا و معایب گوشی‌های هوشمند بنویس.",
                    150,
                    "Use comparatives and superlatives.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: This phone is ___ than mine.",
                    listOf("fast", "faster", "fastest", "more fast"), 1),
                QuizQuestion("Complete: This is the ___ phone.",
                    listOf("good", "better", "best", "goodest"), 2),
                QuizQuestion("Complete: I have ___ this app for two years.",
                    listOf("use", "used", "using", "uses"), 1),
                QuizQuestion("What does 'user-friendly' mean?",
                    listOf("کاربرپسند", "دشوار", "قدیمی", "گران"), 0),
                QuizQuestion("Complete: She ___ never tried VR.",
                    listOf("have", "has", "is", "was"), 1),
                QuizQuestion("Complete: It's the ___ useful app.",
                    listOf("more", "most", "much", "many"), 1),
                QuizQuestion("Complete: I ___ my phone yesterday.",
                    listOf("update", "updates", "updated", "updating"), 2),
                QuizQuestion("What does 'addicted' mean?",
                    listOf("معتاد", "خسته", "مشغول", "خوشحال"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 3 — Health and Wellness
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Health and Wellness",
            titlePersian = "سلامت و تندرستی",
            objectives = listOf(
                "Talk about health and habits",
                "Use modal verbs for advice",
                "Discuss lifestyle choices",
                "Talk about stress and relaxation"
            ),
            vocabulary = listOf(
                VocabWord("lifestyle", "سبک زندگی", "/ˈlaɪfstaɪl/", "noun",
                    "She has a healthy lifestyle.", "سبک زندگی سالمی داره."),
                VocabWord("diet", "رژیم", "/ˈdaɪət/", "noun",
                    "I'm on a diet.", "رژیم دارم."),
                VocabWord("exercise", "ورزش", "/ˈeksərsaɪz/", "noun",
                    "Exercise is important.", "ورزش مهمه."),
                VocabWord("stress", "استرس", "/stres/", "noun",
                    "Work gives me stress.", "کار استرس می‌ده."),
                VocabWord("relax", "استراحت کردن", "/rɪˈlæks/", "verb",
                    "I relax by reading.", "با کتاب خوندن استراحت می‌کنم."),
                VocabWord("sleep", "خواب", "/sliːp/", "noun",
                    "I need more sleep.", "خواب بیشتری لازم دارم."),
                VocabWord("balance", "تعادل", "/ˈbæləns/", "noun",
                    "Work-life balance is important.", "تعادل کار و زندگی مهمه."),
                VocabWord("mental health", "سلامت روان", "/ˈmentl helθ/", "noun",
                    "Mental health matters.", "سلامت روان مهمه."),
                VocabWord("habit", "عادت", "/ˈhæbɪt/", "noun",
                    "I have a bad habit.", "عادت بدی دارم."),
                VocabWord("routine", "روتین", "/ruːˈtiːn/", "noun",
                    "I have a morning routine.", "روتین صبحگاهی دارم."),
                VocabWord("energetic", "پرانرژی", "/ˌenərˈdʒetɪk/", "adjective",
                    "I feel energetic today.", "امروز پرانرژی‌ام."),
                VocabWord("tired", "خسته", "/ˈtaɪərd/", "adjective",
                    "I'm always tired.", "همیشه خسته‌ام.")
            ),
            idioms = listOf(
                IdiomExpression("burn out", "فرسوده شدن",
                    "Many people burn out from work.", "بسیاری از کار فرسوده می‌شن.", "informal"),
                IdiomExpression("under the weather", "حالش خوب نبودن",
                    "I'm feeling under the weather.", "حالم خوب نیست.", "informal"),
                IdiomExpression("take it easy", "سخت نگیر",
                    "Take it easy this weekend.", "این آخر هفته سخت نگیر.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("stress",
                    "stress /stres/ — ترکیب st+r."),
                PronunciationTip("lifestyle",
                    "lifestyle /ˈlaɪfstaɪl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Mental health",
                    "سلامت روان در غرب مهمه."),
                CulturalNote("Gym culture",
                    "عضویت در باشگاه رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Modal verbs for advice",
                    """
                        You should exercise more.
                        You shouldn't eat junk food.
                    """.trimIndent()),
                GrammarSection("Present perfect for lifestyle",
                    """
                        I've started going to the gym.
                        She's quit smoking.
                    """.trimIndent()),
                GrammarSection("Gerunds after prepositions",
                    """
                        I'm good at relaxing.
                        She's interested in yoga.
                    """.trimIndent()),
                GrammarSection("Want to / need to",
                    """
                        I want to lose weight.
                        I need to sleep more.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("You should to exercise.", "You should exercise.", "بعد از should فعل ساده."),
                CommonMistake("I'm interesting in yoga.", "I'm interested in yoga.", "interested."),
                CommonMistake("I want lose weight.", "I want to lose weight.", "بعد از want از to.")
            ),
            conversation = listOf(
                DialogueLine("A", "You look tired. Are you OK?", "خسته به نظر می‌رسی. حالت خوبه؟"),
                DialogueLine("B", "I'm stressed. I've been working too much.", "استرس دارم. خیلی کار کرده‌ام."),
                DialogueLine("A", "You should take a break.", "باید استراحت کنی."),
                DialogueLine("B", "I know, but I have deadlines.", "می‌دونم، ولی ضرب‌الاجل دارم."),
                DialogueLine("A", "Try to find balance.", "سعی کن تعادل پیدا کنی."),
                DialogueLine("B", "What do you do to relax?", "برای استراحت چیکار می‌کنی؟"),
                DialogueLine("A", "I go for walks and do yoga.", "پیاده‌روی و یوگا."),
                DialogueLine("B", "That sounds nice. I've never tried yoga.", "خوبه. یوگا امتحان نکرده‌ام."),
                DialogueLine("A", "You should try it.", "باید امتحان کنی."),
                DialogueLine("B", "Maybe I will. Do you exercise often?", "شاید. زیاد ورزش می‌کنی؟"),
                DialogueLine("A", "Yes, three times a week.", "بله، هفته‌ای سه بار."),
                DialogueLine("B", "That's great. I need to start too.", "عالیه. منم باید شروع کنم."),
                DialogueLine("A", "It's never too late. What about your diet?", "هیچ‌وقت دیر نیست. رژیمت چطور؟"),
                DialogueLine("B", "Not great. I eat too much fast food.", "خوب نیست. فست‌فود زیاد می‌خورم."),
                DialogueLine("A", "You should eat more fruits and vegetables.", "باید میوه و سبزیجات بیشتری بخوری."),
                DialogueLine("B", "I know. I'll try.", "می‌دونم. تلاش می‌کنم."),
                DialogueLine("A", "Take care of yourself.", "از خودت مراقبت کن."),
                DialogueLine("B", "I will. You too!", "می‌کنم. تو هم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چرا استرس دارد؟", "زیاد کار کرده."),
                ComprehensionQuestion("A چه راه‌حل‌هایی پیشنهاد می‌کند؟", "استراحت، یوگا، پیاده‌روی، تغذیه سالم."),
                ComprehensionQuestion("A هفته‌ای چند بار ورزش می‌کند؟", "سه بار."),
                ComprehensionQuestion("رژیم B چطور است؟", "خوب نیست.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your lifestyle.",
                    "درباره سبک زندگی‌ات صحبت کن.",
                    "I usually... / I've started..."),
                SpeakingTask("Give advice about reducing stress.",
                    "درباره کاهش استرس توصیه کن.",
                    "You should...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a healthy lifestyle.",
                    "درباره سبک زندگی سالم بنویس.",
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
    // CHAPTER 4 — Travel and Adventure
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Travel and Adventure",
            titlePersian = "سفر و ماجراجویی",
            objectives = listOf(
                "Talk about travel experiences",
                "Use the passive voice",
                "Describe places",
                "Plan a trip"
            ),
            vocabulary = listOf(
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb",
                    "I love traveling.", "عاشق سفرم."),
                VocabWord("trip", "سفر", "/trɪp/", "noun",
                    "How was your trip?", "سفرت چطور بود؟"),
                VocabWord("adventure", "ماجراجویی", "/ədˈventʃər/", "noun",
                    "It was an adventure.", "ماجراجویی بود."),
                VocabWord("destination", "مقصد", "/ˌdestɪˈneɪʃən/", "noun",
                    "What's your destination?", "مقصدت کجاست؟"),
                VocabWord("landmark", "نقطه دیدنی", "/ˈlændmɑːrk/", "noun",
                    "It's a famous landmark.", "نقطه دیدنی معروفیه."),
                VocabWord("guide", "راهنما", "/ɡaɪd/", "noun",
                    "The guide was helpful.", "راهنما کمک‌کننده بود."),
                VocabWord("luggage", "چمدان", "/ˈlʌɡɪdʒ/", "noun",
                    "My luggage is heavy.", "چمدانم سنگینه."),
                VocabWord("passport", "پاسپورت", "/ˈpæspɔːrt/", "noun",
                    "Don't forget your passport!", "پاسپورتت رو فراموش نکن!"),
                VocabWord("sightseeing", "بازدید", "/ˈsaɪtsiːɪŋ/", "noun",
                    "We went sightseeing.", "رفتیم بازدید."),
                VocabWord("souvenir", "سوغات", "/ˌsuːvəˈnɪr/", "noun",
                    "I bought souvenirs.", "سوغات خریدم."),
                VocabWord("explore", "کاوش کردن", "/ɪkˈsplɔːr/", "verb",
                    "Let's explore the city.", "بیا شهر رو کاوش کنیم."),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun",
                    "It was a long journey.", "سفر طولانی بود.")
            ),
            idioms = listOf(
                IdiomExpression("off the beaten path", "دور از مسیر معمول",
                    "We visited places off the beaten path.", "از مکان‌های دور از مسیر معمول بازدید کردیم.", "idiom"),
                IdiomExpression("hit the road", "راه افتادن",
                    "Let's hit the road early.", "بیا زود راه بیفتیم.", "informal"),
                IdiomExpression("catch a flight", "به پرواز رسیدن",
                    "We need to catch a flight at 6.", "باید ساعت ۶ به پرواز برسیم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("travel vs trip",
                    "travel /ˈtrævəl/، trip /trɪp/."),
                PronunciationTip("passport",
                    "passport /ˈpæspɔːrt/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Travel insurance",
                    "بیمه سفر رایجه."),
                CulturalNote("Airport etiquette",
                    "customs و immigration جدا هستند.")
            ),
            grammar = listOf(
                GrammarSection("Passive voice",
                    """
                        Present: The city is visited by millions.
                        Past: The temple was built in 1400.
                    """.trimIndent()),
                GrammarSection("Present perfect for travel",
                    """
                        I've visited 20 countries.
                        She's been to Japan three times.
                    """.trimIndent()),
                GrammarSection("Past simple for travel",
                    """
                        I went to Paris last year.
                        We saw the Eiffel Tower.
                    """.trimIndent()),
                GrammarSection("Future plans",
                    """
                        I'm going to visit Italy.
                        We'll travel next summer.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The temple built in 1400.", "The temple was built in 1400.", "passive: was + pp."),
                CommonMistake("I've been to Japan last year.", "I went to Japan last year.", "زمان مشخص = past simple."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you traveled abroad?", "خارج سفر کرده‌ای؟"),
                DialogueLine("B", "Yes, I've been to several countries.", "بله، به چندین کشور رفته‌ام."),
                DialogueLine("A", "Which was the most interesting?", "کدوم جالب‌تر بود؟"),
                DialogueLine("B", "Japan. It has a fascinating culture.", "ژاپن. فرهنگ جذابی داره."),
                DialogueLine("A", "What did you like most?", "چی بیشتر دوست داشتی؟"),
                DialogueLine("B", "The temples and gardens.", "معابد و باغ‌ها."),
                DialogueLine("A", "How did you adapt?", "چطور سازگار شدی؟"),
                DialogueLine("B", "I learned a few words and followed local customs.", "چند کلمه یاد گرفتم و رسوم محلی رو رعایت کردم."),
                DialogueLine("A", "What's your favorite place?", "مکان مورد علاقه‌ات کجاست؟"),
                DialogueLine("B", "Kyoto. It's a mix of traditional and modern.", "کیوتو. ترکیبی از سنتی و مدرن."),
                DialogueLine("A", "Any tips?", "توصیه‌ای داری؟"),
                DialogueLine("B", "Learn some phrases and try local food.", "چند عبارت یاد بگیر و غذای محلی امتحان کن."),
                DialogueLine("A", "What about food?", "غذا چطور؟"),
                DialogueLine("B", "Amazing! Sushi and ramen were the best.", "فوق‌العاده! سوشی و رامن بهترین بودن."),
                DialogueLine("A", "You're making me hungry!", "داری گشنه‌ام می‌کنی!"),
                DialogueLine("B", "You should go. It's worth it.", "باید بری. ارزشش رو داره."),
                DialogueLine("A", "I'll add it to my list.", "به لیستم اضافه می‌کنم."),
                DialogueLine("B", "Let me know if you need advice.", "اگه مشاوره خواستی خبرم کن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B کجاها سفر کرده؟", "چندین کشور، از جمله ژاپن."),
                ComprehensionQuestion("B چه چیزی را در ژاپن دوست داشت؟", "معابد و باغ‌ها."),
                ComprehensionQuestion("B چطور سازگار شد؟", "چند کلمه یاد گرفت و رسوم محلی را رعایت کرد."),
                ComprehensionQuestion("غذای مورد علاقه B چه بود؟", "سوشی و رامن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a country you've visited.",
                    "درباره کشوری که رفتی صحبت کن.",
                    "I've been to... / It was..."),
                SpeakingTask("Discuss cultural differences.",
                    "درباره تفاوت‌های فرهنگی صحبت کن.",
                    "In my culture...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable travel experience.",
                    "درباره یک تجربه سفر بنویس.",
                    180,
                    "Use passive voice and present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The temple ___ built in 1400.",
                    listOf("is", "was", "were", "been"), 1),
                QuizQuestion("Complete: English ___ spoken here.",
                    listOf("is", "are", "was", "were"), 0),
                QuizQuestion("Complete: The tickets must ___ booked.",
                    listOf("be", "is", "was", "been"), 0),
                QuizQuestion("What does 'culture shock' mean?",
                    listOf("شوک برقی", "شوک فرهنگی", "تغییر فرهنگ", "فرهنگ غنی"), 1),
                QuizQuestion("Complete: I've ___ to 20 countries.",
                    listOf("be", "being", "been", "was"), 2),
                QuizQuestion("Complete: This dish ___ in traditional way.",
                    listOf("is cooked", "cooks", "cooking", "cook"), 0),
                QuizQuestion("What does 'off the beaten path' mean?",
                    listOf("دور از مسیر معمول", "توی مسیر", "کنار جاده", "توی شهر"), 0),
                QuizQuestion("Complete: English is ___ all over the world.",
                    listOf("speak", "spoke", "spoken", "speaking"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 5 — Culture and Society
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Culture and Society",
            titlePersian = "فرهنگ و جامعه",
            objectives = listOf(
                "Discuss cultural differences",
                "Use relative clauses",
                "Express opinions about society",
                "Talk about traditions"
            ),
            vocabulary = listOf(
                VocabWord("culture", "فرهنگ", "/ˈkʌltʃər/", "noun",
                    "Culture shapes identity.", "فرهنگ هویت را شکل می‌دهد."),
                VocabWord("tradition", "سنت", "/trəˈdɪʃən/", "noun",
                    "Traditions are important.", "سنت‌ها مهمند."),
                VocabWord("custom", "رسم", "/ˈkʌstəm/", "noun",
                    "Every country has customs.", "هر کشوری رسوم داره."),
                VocabWord("society", "جامعه", "/səˈsaɪəti/", "noun",
                    "Society is changing.", "جامعه در حال تغییره."),
                VocabWord("generation", "نسل", "/ˌdʒenəˈreɪʃən/", "noun",
                    "Younger generations think differently.", "نسل‌های جوان متفاوت فکر می‌کنن."),
                VocabWord("values", "ارزش‌ها", "/ˈvæljuːz/", "noun",
                    "Family values matter.", "ارزش‌های خانوادگی مهمند."),
                VocabWord("diversity", "تنوع", "/daɪˈvɜːrsəti/", "noun",
                    "Diversity makes us stronger.", "تنوع ما را قوی‌تر می‌کنه."),
                VocabWord("equality", "برابری", "/ɪˈkwɑːləti/", "noun",
                    "Equality is essential.", "برابری ضروریه."),
                VocabWord("community", "جامعه محلی", "/kəˈmjuːnəti/", "noun",
                    "The community supported us.", "جامعه محلی حمایت کرد."),
                VocabWord("belief", "باور", "/bɪˈliːf/", "noun",
                    "Beliefs guide behavior.", "باورها رفتار را هدایت می‌کنند."),
                VocabWord("identity", "هویت", "/aɪˈdentəti/", "noun",
                    "Language is part of identity.", "زبان بخشی از هویته."),
                VocabWord("respect", "احترام", "/rɪˈspekt/", "noun",
                    "Respect is important.", "احترام مهمه.")
            ),
            idioms = listOf(
                IdiomExpression("when in Rome", "با مردم شهر هم‌رنگ شو",
                    "When in Rome, do as the Romans do.", "با مردم شهر هم‌رنگ شو.", "idiom"),
                IdiomExpression("bridge the gap", "پر کردن شکاف",
                    "We need to bridge the gap.", "باید شکاف رو پر کنیم.", "idiom"),
                IdiomExpression("break the mold", "شکستن قالب",
                    "She broke the mold in her industry.", "در صنعتش قالب‌ها رو شکست.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("culture",
                    "culture /ˈkʌltʃər/ — استرس روی cul."),
                PronunciationTip("generation",
                    "generation /ˌdʒenəˈreɪʃən/ — استرس روی ra.")
            ),
            culturalNotes = listOf(
                CulturalNote("Cultural differences",
                    "آداب و رسوم در فرهنگ‌ها متفاوته."),
                CulturalNote("Social change",
                    "تغییرات اجتماعی در غرب رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Relative clauses",
                    """
                        Defining: The people who live here are friendly.
                        Non-defining: My brother, who lives in London, is a teacher.
                    """.trimIndent()),
                GrammarSection("Passive for social contexts",
                    """
                        Many laws were changed.
                        Awareness is being raised.
                    """.trimIndent()),
                GrammarSection("Expressing opinions",
                    """
                        I think society...
                        In my opinion...
                        It seems to me that...
                    """.trimIndent()),
                GrammarSection("Cause and effect",
                    """
                        because of, due to, as a result, therefore
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The people which live here...", "The people who live here...", "برای افراد از who."),
                CommonMistake("Society are changing.", "Society is changing.", "society مفرد."),
                CommonMistake("Because of the change happened...", "Because of the change,...", "because of + noun.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you think society is changing fast?", "فکر می‌کنی جامعه سریع تغییر می‌کنه؟"),
                DialogueLine("B", "In some ways yes, others no.", "از بعضی جهات بله، از بعضی نه."),
                DialogueLine("A", "What needs to change most?", "چی بیشتر باید عوض بشه؟"),
                DialogueLine("B", "Inequality. It's a global problem.", "نابرابری. مسئله جهانیه."),
                DialogueLine("A", "What can we do about it?", "چیکار می‌تونیم بکنیم؟"),
                DialogueLine("B", "Raise awareness and support movements.", "آگاهی‌بخشی و حمایت از جنبش‌ها."),
                DialogueLine("A", "Do younger generations care more?", "نسل‌های جوان بیشتر اهمیت می‌دن؟"),
                DialogueLine("B", "Definitely. They're more aware.", "قطعاً. آگاه‌ترن."),
                DialogueLine("A", "That's encouraging.", "دلگرم‌کننده‌ست."),
                DialogueLine("B", "We need to bridge the gap with older generations.", "باید شکاف با نسل‌های قدیمی‌تر رو پر کنیم."),
                DialogueLine("A", "Change needs everyone.", "تغییر به همه نیاز داره."),
                DialogueLine("B", "Exactly. And traditions matter too.", "دقیقاً. سنت‌ها هم مهمند."),
                DialogueLine("A", "Balance is key.", "تعادل کلیدیه."),
                DialogueLine("B", "Progress without losing our values.", "پیشرفت بدون از دست دادن ارزش‌ها."),
                DialogueLine("A", "What's your biggest hope?", "بزرگ‌ترین امیدت چیه؟"),
                DialogueLine("B", "A fairer society for everyone.", "جامعه‌ای عادلانه‌تر برای همه."),
                DialogueLine("A", "That's beautiful.", "زیباست."),
                DialogueLine("B", "It starts with each of us.", "از هر کدوم ما شروع می‌شه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("به نظر B چه چیزی باید تغییر کند؟", "نابرابری."),
                ComprehensionQuestion("نسل‌های جوان چطورند؟", "آگاه‌ترند."),
                ComprehensionQuestion("B چه چیزی را مهم می‌داند؟", "پر کردن شکاف بین نسل‌ها."),
                ComprehensionQuestion("بزرگ‌ترین امید B چیست؟", "جامعه‌ای عادلانه‌تر.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss social issues.",
                    "درباره مسائل اجتماعی صحبت کن.",
                    "I think... / In my opinion..."),
                SpeakingTask("Talk about generational differences.",
                    "درباره تفاوت‌های نسلی صحبت کن.",
                    "Younger generations... / Older generations...")
            ),
            writingTasks = listOf(
                WritingTask("Write about an important social change.",
                    "درباره یک تغییر اجتماعی مهم بنویس.",
                    200,
                    "Use relative clauses and cause-effect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The people ___ live here are friendly.",
                    listOf("which", "who", "whose", "where"), 1),
                QuizQuestion("Complete: Society ___ changing.",
                    listOf("are", "is", "were", "have"), 1),
                QuizQuestion("What does 'bridge the gap' mean?",
                    listOf("ساختن پل", "پر کردن شکاف", "شکستن پل", "عبور کردن"), 1),
                QuizQuestion("Complete: Many laws ___ changed.",
                    listOf("was", "were", "have", "is"), 1),
                QuizQuestion("Complete: We must stand ___ for what's right.",
                    listOf("up", "on", "at", "in"), 0),
                QuizQuestion("What does 'break the mold' mean?",
                    listOf("شکستن قالب", "شکستن قالب‌های سنتی", "قالب‌سازی", "خراب کردن"), 1),
                QuizQuestion("Complete: ___ of the change, we adapted.",
                    listOf("Because", "Because of", "Although", "Despite"), 1),
                QuizQuestion("Complete: Equality must ___ protected.",
                    listOf("be", "is", "been", "being"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 6 — Work and Careers
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Work and Careers",
            titlePersian = "کار و حرفه",
            objectives = listOf(
                "Talk about careers",
                "Use present perfect for work experience",
                "Discuss career goals",
                "Talk about workplace skills"
            ),
            vocabulary = listOf(
                VocabWord("career", "حرفه", "/kəˈrɪr/", "noun",
                    "I want a successful career.", "حرفه موفقی می‌خوام."),
                VocabWord("colleague", "همکار", "/ˈkɑːliːɡ/", "noun",
                    "Colleagues are helpful.", "همکارها کمک‌کننده‌اند."),
                VocabWord("salary", "حقوق", "/ˈsæləri/", "noun",
                    "The salary is good.", "حقوق خوبه."),
                VocabWord("promotion", "ترفیع", "/prəˈmoʊʃən/", "noun",
                    "She got a promotion.", "ترفیع گرفت."),
                VocabWord("skill", "مهارت", "/skɪl/", "noun",
                    "Communication is important.", "ارتباطات مهمه."),
                VocabWord("interview", "مصاحبه", "/ˈɪntərvjuː/", "noun",
                    "I have an interview.", "مصاحبه دارم."),
                VocabWord("apply", "درخواست دادن", "/əˈplaɪ/", "verb",
                    "I applied for the job.", "درخواست دادم."),
                VocabWord("hire", "استخدام کردن", "/ˈhaɪər/", "verb",
                    "They hired three people.", "سه نفر استخدام کردن."),
                VocabWord("resign", "استعفا دادن", "/rɪˈzaɪn/", "verb",
                    "He resigned.", "استعفا داد."),
                VocabWord("retire", "بازنشسته شدن", "/rɪˈtaɪər/", "verb",
                    "My father retired.", "پدرم بازنشسته شد."),
                VocabWord("team", "تیم", "/tiːm/", "noun",
                    "I work in a team.", "در تیم کار می‌کنم."),
                VocabWord("lead", "رهبری کردن", "/liːd/", "verb",
                    "She leads the project.", "او پروژه رو رهبری می‌کنه.")
            ),
            idioms = listOf(
                IdiomExpression("climb the ladder", "پیشرفت کردن",
                    "He's climbing the ladder.", "داره پیشرفت می‌کنه.", "idiom"),
                IdiomExpression("work like a dog", "مثل سگ کار کردن",
                    "She works like a dog.", "مثل سگ کار می‌کنه.", "informal"),
                IdiomExpression("dead-end job", "شغل بی‌آینده",
                    "He's stuck in a dead-end job.", "در شغل بی‌آینده گیر افتاده.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("career",
                    "career /kəˈrɪr/ — استرس روی rir."),
                PronunciationTip("colleague",
                    "colleague /ˈkɑːliːɡ/ — ue تلفظ نمی‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("CV vs Resume",
                    "آمریکا resume، بریتانیا CV."),
                CulturalNote("Job interviews",
                    "مصاحبه‌ها رسمی و ساختارمندند.")
            ),
            grammar = listOf(
                GrammarSection("Present Perfect for experience",
                    """
                        I've worked in three companies.
                        She's never had a promotion.
                    """.trimIndent()),
                GrammarSection("Present Perfect with for/since",
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
                        I'll ask for a promotion.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have 5 years experience.", "I have 5 years of experience.", "of لازمه."),
                CommonMistake("I am work here for 3 years.", "I have worked here for 3 years.", "present perfect."),
                CommonMistake("I applied the job.", "I applied for the job.", "apply for.")
            ),
            conversation = listOf(
                DialogueLine("A", "How long have you worked here?", "چند وقته اینجا کار می‌کنی؟"),
                DialogueLine("B", "I've worked here for five years.", "پنج ساله اینجا کار می‌کنم."),
                DialogueLine("A", "Do you enjoy it?", "لذت می‌بری؟"),
                DialogueLine("B", "Mostly yes. But I'm thinking about a change.", "بیشتر بله. ولی به تغییر فکر می‌کنم."),
                DialogueLine("A", "What kind of change?", "چه نوع تغییری؟"),
                DialogueLine("B", "I'd like to work abroad.", "دوست دارم در خارج کار کنم."),
                DialogueLine("A", "Have you applied anywhere?", "جایی درخواست دادی؟"),
                DialogueLine("B", "Not yet. I'm updating my resume.", "هنوز نه. رزومه رو آپدیت می‌کنم."),
                DialogueLine("A", "What skills do you have?", "چه مهارت‌هایی داری؟"),
                DialogueLine("B", "Communication and project management.", "ارتباطات و مدیریت پروژه."),
                DialogueLine("A", "What about languages?", "زبان چطور؟"),
                DialogueLine("B", "I speak English and a bit of French.", "انگلیسی و کمی فرانسه."),
                DialogueLine("A", "What's your dream job?", "شغل رویایی‌ات چیه؟"),
                DialogueLine("B", "I'd love to work for an international company.", "دوست دارم برای شرکت بین‌المللی کار کنم."),
                DialogueLine("A", "That's a great goal.", "هدف عالیه."),
                DialogueLine("B", "Thanks! I'll need luck.", "ممنون! به شانس نیاز دارم."),
                DialogueLine("A", "Let me know if you need help.", "اگه کمک خواستی خبرم کن."),
                DialogueLine("B", "Thanks so much!", "خیلی ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند وقت است که کار می‌کند؟", "پنج سال."),
                ComprehensionQuestion("B چه تغییری می‌خواهد؟", "کار در خارج."),
                ComprehensionQuestion("B چه مهارت‌هایی دارد؟", "ارتباطات و مدیریت پروژه."),
                ComprehensionQuestion("شغل رویایی B چیست؟", "کار برای شرکت بین‌المللی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your job.",
                    "درباره شغلت صحبت کن.",
                    "I've worked... / I want to..."),
                SpeakingTask("Practice a job interview.",
                    "نقش‌بازی: مصاحبه شغلی.",
                    "Tell me about yourself.")
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
                    listOf("بالا رفتن", "پیشرفت کردن", "کاهش دادن", "جا ماندن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 7 — The Environment
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "The Environment",
            titlePersian = "محیط زیست",
            objectives = listOf(
                "Discuss environmental issues",
                "Use conditionals",
                "Talk about sustainability",
                "Express responsibility"
            ),
            vocabulary = listOf(
                VocabWord("environment", "محیط زیست", "/ɪnˈvaɪrənmənt/", "noun",
                    "Protect the environment.", "از محیط زیست محافظت کن."),
                VocabWord("climate", "اقلیم", "/ˈklaɪmət/", "noun",
                    "Climate change is serious.", "تغییر اقلیم جدیه."),
                VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun",
                    "Pollution is harmful.", "آلودگی مضره."),
                VocabWord("renewable", "تجدیدپذیر", "/rɪˈnuːəbəl/", "adjective",
                    "Renewable energy is clean.", "انرژی تجدیدپذیر پاکه."),
                VocabWord("sustainable", "پایدار", "/səˈsteɪnəbəl/", "adjective",
                    "We need sustainable solutions.", "به راه‌حل پایدار نیاز داریم."),
                VocabWord("recycle", "بازیافت", "/ˌriːˈsaɪkəl/", "verb",
                    "We recycle paper.", "کاغذ بازیافت می‌کنیم."),
                VocabWord("protect", "محافظت کردن", "/prəˈtekt/", "verb",
                    "Protect nature.", "از طبیعت محافظت کن."),
                VocabWord("waste", "زباله", "/weɪst/", "noun",
                    "Waste is a problem.", "زباله مشکله."),
                VocabWord("carbon footprint", "ردپای کربن", "/ˈkɑːrbən ˈfʊtprɪnt/", "noun",
                    "Reduce your footprint.", "ردپات رو کم کن."),
                VocabWord("emission", "انتشار", "/ɪˈmɪʃən/", "noun",
                    "Reduce emissions.", "انتشارها رو کم کن."),
                VocabWord("aware", "آگاه", "/əˈwer/", "adjective",
                    "Be aware.", "آگاه باش."),
                VocabWord("responsibility", "مسئولیت", "/rɪˌspɑːnsəˈbɪləti/", "noun",
                    "We have responsibility.", "مسئولیت داریم.")
            ),
            idioms = listOf(
                IdiomExpression("go green", "دوستدار محیط زیست شدن",
                    "Companies are going green.", "شرکت‌ها سبز می‌شن.", "informal"),
                IdiomExpression("take responsibility", "مسئولیت پذیرفتن",
                    "Take responsibility.", "مسئولیت بپذیر.", "neutral"),
                IdiomExpression("walk the talk", "عمل کردن به حرف",
                    "Walk the talk.", "به حرفت عمل کن.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("environment",
                    "environment /ɪnˈvaɪrənmənt/."),
                PronunciationTip("sustainable",
                    "sustainable /səˈsteɪnəbəl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Climate agreements",
                    "توافق‌نامه‌های اقلیمی مهمند."),
                CulturalNote("Green products",
                    "محصولات سبز محبوبند.")
            ),
            grammar = listOf(
                GrammarSection("First conditional",
                    """
                        If + present simple, will + verb
                        If we recycle, we will help.
                    """.trimIndent()),
                GrammarSection("Should",
                    """
                        We should recycle more.
                        We shouldn't waste water.
                    """.trimIndent()),
                GrammarSection("Passive for environmental issues",
                    """
                        Forests are being destroyed.
                        Emissions must be reduced.
                    """.trimIndent()),
                GrammarSection("Imperatives",
                    """
                        Reduce, reuse, recycle.
                        Save energy.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If we will recycle, we help.", "If we recycle, we will help.", "در if از present simple."),
                CommonMistake("We should to protect.", "We should protect.", "بعد از should فعل ساده."),
                CommonMistake("Plastic is throwing.", "Plastic is being thrown.", "passive.")
            ),
            conversation = listOf(
                DialogueLine("A", "Are you worried about climate change?", "نگران تغییر اقلیمی؟"),
                DialogueLine("B", "Yes, it's a huge problem.", "بله، مشکل بزرگیه."),
                DialogueLine("A", "What do you do for the environment?", "برای محیط زیست چیکار می‌کنی؟"),
                DialogueLine("B", "I recycle, save water, use public transport.", "بازیافت، ذخیره آب، حمل و نقل عمومی."),
                DialogueLine("A", "Do you use renewable energy?", "از انرژی تجدیدپذیر استفاده می‌کنی؟"),
                DialogueLine("B", "Not yet, but I'm thinking about solar.", "هنوز نه، ولی به خورشیدی فکر می‌کنم."),
                DialogueLine("A", "What does the future hold?", "آینده چی داره؟"),
                DialogueLine("B", "If we don't act, it will get worse.", "اگه اقدام نکنیم، بدتر می‌شه."),
                DialogueLine("A", "What should we do first?", "اول باید چیکار کنیم؟"),
                DialogueLine("B", "Reduce waste, use green energy, educate.", "کاهش زباله، انرژی سبز، آموزش."),
                DialogueLine("A", "Should governments do more?", "دولت‌ها باید بیشتر کنن؟"),
                DialogueLine("B", "Definitely. Policies make a difference.", "قطعاً. سیاست‌ها تفاوت ایجاد می‌کنن."),
                DialogueLine("A", "What about individuals?", "افراد چطور؟"),
                DialogueLine("B", "Small changes add up.", "تغییرات کوچک جمع می‌شن."),
                DialogueLine("A", "I'll do more.", "منم بیشتر انجام می‌دم."),
                DialogueLine("B", "Together we can make a difference.", "با هم می‌تونیم تفاوت ایجاد کنیم."),
                DialogueLine("A", "The planet needs us.", "سیاره به ما نیاز داره."),
                DialogueLine("B", "Let's protect it.", "بیا محافظتش کنیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B برای محیط زیست چیکار می‌کند؟", "بازیافت، ذخیره آب، حمل و نقل عمومی."),
                ComprehensionQuestion("B به چه چیزی فکر می‌کند؟", "پنل خورشیدی."),
                ComprehensionQuestion("اگر اقدام نکنیم چه می‌شود؟", "بدتر می‌شود."),
                ComprehensionQuestion("راه‌حل‌های B چیست؟", "کاهش زباله، انرژی سبز، آموزش.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about environmental problems.",
                    "درباره مشکلات زیست‌محیطی صحبت کن.",
                    "The environment is... / We should..."),
                SpeakingTask("Discuss solutions.",
                    "درباره راه‌حل‌ها صحبت کن.",
                    "If we..., we could...")
            ),
            writingTasks = listOf(
                WritingTask("Write about protecting the environment.",
                    "درباره حفاظت از محیط زیست بنویس.",
                    180,
                    "Use first conditional and should.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If we recycle, we ___ help.",
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
    // CHAPTER 8 — Personal Growth
    // ═══════════════════════════════════════════════════════════
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Personal Growth",
            titlePersian = "رشد شخصی",
            objectives = listOf(
                "Discuss personal development",
                "Use wish and regret",
                "Talk about goals",
                "Express reflection"
            ),
            vocabulary = listOf(
                VocabWord("growth", "رشد", "/ɡroʊθ/", "noun",
                    "Personal growth takes time.", "رشد زمان می‌بره."),
                VocabWord("self-awareness", "خودآگاهی", "/ˌself əˈwernəs/", "noun",
                    "Self-awareness is key.", "خودآگاهی کلیدیه."),
                VocabWord("mindset", "ذهنیت", "/ˈmaɪndset/", "noun",
                    "Positive mindset helps.", "ذهنیت مثبت کمک می‌کنه."),
                VocabWord("habit", "عادت", "/ˈhæbɪt/", "noun",
                    "Good habits change lives.", "عادت‌های خوب زندگی رو تغییر می‌دن."),
                VocabWord("discipline", "نظم", "/ˈdɪsəplɪn/", "noun",
                    "Discipline is key.", "نظم کلیدیه."),
                VocabWord("reflection", "بازنگری", "/rɪˈflekʃən/", "noun",
                    "Take time for reflection.", "وقت بذار برای بازنگری."),
                VocabWord("improvement", "بهبود", "/ɪmˈpruːvmənt/", "noun",
                    "Small improvements matter.", "بهبودهای کوچک مهمند."),
                VocabWord("failure", "شکست", "/ˈfeɪljər/", "noun",
                    "Failure teaches us.", "شکست آموزش می‌ده."),
                VocabWord("resilience", "تاب‌آوری", "/rɪˈzɪliəns/", "noun",
                    "Resilience helps recover.", "تاب‌آوری به بهبودی کمک می‌کنه."),
                VocabWord("purpose", "هدف", "/ˈpɜːrpəs/", "noun",
                    "Find your purpose.", "هدفت رو پیدا کن."),
                VocabWord("balance", "تعادل", "/ˈbæləns/", "noun",
                    "Life balance matters.", "تعادل زندگی مهمه."),
                VocabWord("gratitude", "سپاسگزاری", "/ˈɡrætɪtuːd/", "noun",
                    "Practice gratitude.", "سپاسگزاری کن.")
            ),
            idioms = listOf(
                IdiomExpression("turn over a new leaf", "شروع تازه",
                    "He turned over a new leaf.", "شروع تازه‌ای کرد.", "idiom"),
                IdiomExpression("grow as a person", "رشد شخصی",
                    "Travel helps you grow as a person.", "سفر به رشد شخصی کمک می‌کنه.", "neutral"),
                IdiomExpression("learn the hard way", "با سختی یاد گرفتن",
                    "I learned the hard way.", "با سختی یاد گرفتم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("resilience",
                    "resilience /rɪˈzɪliəns/."),
                PronunciationTip("gratitude",
                    "gratitude /ˈɡrætɪtuːd/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Self-help culture",
                    "خودیاری در غرب رایجه."),
                CulturalNote("Therapy",
                    "تراپی عادیه.")
            ),
            grammar = listOf(
                GrammarSection("Wish + past simple",
                    """
                        I wish I had more time.
                        She wishes she could travel.
                    """.trimIndent()),
                GrammarSection("Wish + past perfect",
                    """
                        I wish I had studied harder.
                        He wishes he hadn't quit.
                    """.trimIndent()),
                GrammarSection("Regret + verb-ing",
                    """
                        I regret not traveling more.
                    """.trimIndent()),
                GrammarSection("Present perfect for growth",
                    """
                        I've grown a lot this year.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I wish I have more time.", "I wish I had more time.", "wish + past simple."),
                CommonMistake("I regret to leave.", "I regret leaving.", "regret + verb-ing."),
                CommonMistake("I wish I didn't do that.", "I wish I hadn't done that.", "past perfect.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you grown this year?", "امسال رشد کردی؟"),
                DialogueLine("B", "Definitely. I've learned so much.", "قطعاً. چیزهای زیادی یاد گرفتم."),
                DialogueLine("A", "What helped you grow?", "چی کمک کرد؟"),
                DialogueLine("B", "Challenges made me stronger.", "چالش‌ها قوی‌ترم کردن."),
                DialogueLine("A", "What do you wish you'd done differently?", "ای کاش چه کاری متفاوت می‌کردی؟"),
                DialogueLine("B", "I wish I had asked for help sooner.", "ای کاش زودتر کمک خواسته بودم."),
                DialogueLine("A", "Any regrets?", "پشیمانی داری؟"),
                DialogueLine("B", "I regret not starting therapy earlier.", "پشیمانم که زودتر تراپی رو شروع نکردم."),
                DialogueLine("A", "Goals now?", "اهدافت الان؟"),
                DialogueLine("B", "Be present and practice gratitude.", "حاضر بودن و سپاسگزاری."),
                DialogueLine("A", "Routine?", "روتین؟"),
                DialogueLine("B", "I journal every morning.", "هر صبح ژورنال می‌نویسم."),
                DialogueLine("A", "Motivation?", "انگیزه؟"),
                DialogueLine("B", "Remembering why I started.", "یادم میاد چرا شروع کردم."),
                DialogueLine("A", "What would you tell your younger self?", "به خود جوان‌ترت چی می‌گفتی؟"),
                DialogueLine("B", "Don't be afraid to fail.", "از شکست نترس."),
                DialogueLine("A", "That's powerful.", "قدرتمنده."),
                DialogueLine("B", "We learn the hard way sometimes.", "گاهی با سختی یاد می‌گیریم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور رشد کرده؟", "از طریق چالش‌ها."),
                ComprehensionQuestion("B چه پشیمانی دارد؟", "زودتر کمک نخواستن."),
                ComprehensionQuestion("اهداف B چیست؟", "حاضر بودن و سپاسگزاری."),
                ComprehensionQuestion("B به خود جوان‌ترش چه می‌گوید؟", "از شکست نترس.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about personal growth.",
                    "درباره رشد شخصی صحبت کن.",
                    "I've grown... / I've learned..."),
                SpeakingTask("Express wishes and regrets.",
                    "آرزوها و پشیمانی‌ات را بیان کن.",
                    "I wish... / I regret...")
            ),
            writingTasks = listOf(
                WritingTask("Write about how you've grown.",
                    "درباره رشدت بنویس.",
                    180,
                    "Use wish, regret, present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I wish I ___ more time.",
                    listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: I wish I ___ studied harder.",
                    listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: I regret ___ my job.",
                    listOf("leave", "leaving", "to leave", "left"), 1),
                QuizQuestion("What does 'turn over a new leaf' mean?",
                    listOf("برگ زدن", "شروع تازه", "برگ ریختن", "کتاب خواندن"), 1),
                QuizQuestion("Complete: I've ___ a lot this year.",
                    listOf("grow", "grew", "grown", "growing"), 2),
                QuizQuestion("What does 'learn the hard way' mean?",
                    listOf("با آسانی", "با سختی", "به کسی یاد دادن", "درس خواندن"), 1),
                QuizQuestion("Complete: She ___ leaving her job.",
                    listOf("regret", "regrets", "regretting", "regretted"), 1),
                QuizQuestion("Complete: He wishes he ___ quit.",
                    listOf("didn't", "hadn't", "hasn't", "won't"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 9 — Media and Communication
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Media and Communication",
            titlePersian = "رسانه و ارتباطات",
            objectives = listOf(
                "Discuss media",
                "Use reported speech",
                "Talk about communication",
                "Express opinions"
            ),
            vocabulary = listOf(
                VocabWord("media", "رسانه", "/ˈmiːdiə/", "noun",
                    "Media is powerful.", "رسانه قدرتمنده."),
                VocabWord("message", "پیام", "/ˈmesɪdʒ/", "noun",
                    "I sent a message.", "پیام فرستادم."),
                VocabWord("news", "اخبار", "/nuːz/", "noun",
                    "I watch the news.", "اخبار می‌بینم."),
                VocabWord("article", "مقاله", "/ˈɑːrtɪkəl/", "noun",
                    "I read an article.", "مقاله خوندم."),
                VocabWord("platform", "پلتفرم", "/ˈplætfɔːrm/", "noun",
                    "Many platforms exist.", "پلتفرم‌های زیادی هست."),
                VocabWord("content", "محتوا", "/ˈkɑːntent/", "noun",
                    "Content matters.", "محتوا مهمه."),
                VocabWord("audience", "مخاطب", "/ˈɔːdiəns/", "noun",
                    "Know your audience.", "مخاطبت رو بشناس."),
                VocabWord("influence", "تأثیر", "/ˈɪnfluəns/", "noun",
                    "Influencers have influence.", "اینفلوئنسرها تأثیر دارن."),
                VocabWord("privacy", "حریم خصوصی", "/ˈpraɪvəsi/", "noun",
                    "Privacy is important.", "حریم خصوصی مهمه."),
                VocabWord("misinformation", "اطلاعات نادرست", "/ˌmɪsɪnfərˈmeɪʃən/", "noun",
                    "Misinformation spreads fast.", "اطلاعات نادرست سریع پخش می‌شه."),
                VocabWord("source", "منبع", "/sɔːrs/", "noun",
                    "Check your sources.", "منابعت رو چک کن."),
                VocabWord("share", "به اشتراک گذاشتن", "/ʃer/", "verb",
                    "Don't share fake news.", "اخبار جعلی به اشتراک نذار.")
            ),
            idioms = listOf(
                IdiomExpression("word of mouth", "شفاهی",
                    "It spread by word of mouth.", "شفاهی پخش شد.", "neutral"),
                IdiomExpression("get the message", "پیام را گرفتن",
                    "I got the message.", "پیام رو گرفتم.", "informal"),
                IdiomExpression("break the news", "خبر را گفتن",
                    "She broke the news.", "خبر رو گفت.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("communication",
                    "communication /kəˌmjuːnɪˈkeɪʃən/."),
                PronunciationTip("information",
                    "information /ˌɪnfərˈmeɪʃən/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Media literacy",
                    "سواد رسانه‌ای مهمه."),
                CulturalNote("Digital privacy",
                    "حریم خصوصی دیجیتال دغدغه‌ست.")
            ),
            grammar = listOf(
                GrammarSection("Reported speech",
                    """
                        He said that he was busy.
                        She told me she would come.
                    """.trimIndent()),
                GrammarSection("Reporting verbs",
                    """
                        claim, admit, deny, suggest, promise, warn
                    """.trimIndent()),
                GrammarSection("Passive in media",
                    """
                        The news was reported yesterday.
                        The article has been published.
                    """.trimIndent()),
                GrammarSection("Expressing opinions",
                    """
                        I think... / In my opinion...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("He said me...", "He told me...", "tell + ضمیر مفعولی."),
                CommonMistake("He said he will come.", "He said he would come.", "will → would."),
                CommonMistake("The news are important.", "The news is important.", "news غیرقابل شمارش.")
            ),
            conversation = listOf(
                DialogueLine("A", "How do you get your news?", "اخبار رو از کجا می‌گیری؟"),
                DialogueLine("B", "Mostly social media.", "بیشتر شبکه‌های اجتماعی."),
                DialogueLine("A", "I use multiple sources.", "من چند منبع."),
                DialogueLine("B", "Smart. So much misinformation.", "هوشمندانه. اطلاعات نادرست زیاده."),
                DialogueLine("A", "Do you trust social media?", "به شبکه‌های اجتماعی اعتماد داری؟"),
                DialogueLine("B", "Only partly. I verify first.", "فقط تا حدی. اول تأیید می‌کنم."),
                DialogueLine("A", "What about influencers?", "اینفلوئنسرها چطور؟"),
                DialogueLine("B", "Some spread misinformation.", "بعضی اطلاعات نادرست پخش می‌کنن."),
                DialogueLine("A", "Should governments regulate?", "دولت‌ها باید تنظیم کنن؟"),
                DialogueLine("B", "Maybe to a degree.", "شاید تا حدی."),
                DialogueLine("A", "What about privacy?", "حریم خصوصی چطور؟"),
                DialogueLine("B", "Companies collect too much data.", "شرکت‌ها داده‌های زیادی جمع می‌کنن."),
                DialogueLine("A", "We should be careful.", "باید محتاط باشیم."),
                DialogueLine("B", "Being aware is key.", "آگاه بودن کلیدیه."),
                DialogueLine("A", "Any advice?", "توصیه‌ای؟"),
                DialogueLine("B", "Check sources, think critically.", "منابع رو چک کن، انتقادی فکر کن."),
                DialogueLine("A", "Great advice.", "توصیه عالی."),
                DialogueLine("B", "Stay informed!", "آگاه بمون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B اخبار را از کجا می‌گیرد؟", "شبکه‌های اجتماعی."),
                ComprehensionQuestion("B قبل از به اشتراک گذاشتن چیکار می‌کند؟", "تأیید می‌کند."),
                ComprehensionQuestion("نگرانی اصلی B چیست؟", "حریم خصوصی و اطلاعات نادرست."),
                ComprehensionQuestion("توصیه B چیست؟", "چک منابع و تفکر انتقادی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss media in your life.",
                    "درباره رسانه صحبت کن.",
                    "I use... / I check..."),
                SpeakingTask("Express opinions on social media.",
                    "نظرت درباره شبکه‌های اجتماعی را بیان کن.",
                    "I think... / In my opinion...")
            ),
            writingTasks = listOf(
                WritingTask("Write about pros and cons of social media.",
                    "درباره مزایا و معایب شبکه‌های اجتماعی بنویس.",
                    180,
                    "Use reported speech and passive.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: He ___ me he was tired.",
                    listOf("said", "told", "spoke", "talked"), 1),
                QuizQuestion("Complete: He said he ___ come.",
                    listOf("will", "would", "can", "could"), 1),
                QuizQuestion("Complete: The news ___ important.",
                    listOf("are", "is", "were", "have"), 1),
                QuizQuestion("What does 'word of mouth' mean?",
                    listOf("کلمه دهان", "شفاهی", "نوشتاری", "رسمی"), 1),
                QuizQuestion("Complete: The article has been ___.",
                    listOf("publish", "published", "publishing", "publishes"), 1),
                QuizQuestion("Complete: She ___ that she was wrong.",
                    listOf("admits", "admitted", "admitting", "admit"), 1),
                QuizQuestion("What does 'break the news' mean?",
                    listOf("شکستن خبر", "خبر را گفتن", "خبر را پنهان کردن", "خبر بد"), 1),
                QuizQuestion("Complete: The video is ___ shared.",
                    listOf("be", "being", "been", "is"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 10 — Education and Learning
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Education and Learning",
            titlePersian = "آموزش و یادگیری",
            objectives = listOf(
                "Talk about education",
                "Use conditionals",
                "Discuss learning methods",
                "Talk about future education"
            ),
            vocabulary = listOf(
                VocabWord("education", "آموزش", "/ˌedʒuˈkeɪʃən/", "noun",
                    "Education is important.", "آموزش مهمه."),
                VocabWord("degree", "مدرک", "/dɪˈɡriː/", "noun",
                    "She has a degree.", "مدرک داره."),
                VocabWord("university", "دانشگاه", "/ˌjuːnɪˈvɜːrsəti/", "noun",
                    "He studies at university.", "در دانشگاه درس می‌خونه."),
                VocabWord("course", "دوره", "/kɔːrs/", "noun",
                    "I'm taking a course.", "دارم یه دوره می‌گذرونم."),
                VocabWord("exam", "امتحان", "/ɪɡˈzæm/", "noun",
                    "I have an exam.", "امتحان دارم."),
                VocabWord("pass", "قبول شدن", "/pæs/", "verb",
                    "I passed!", "قبول شدم!"),
                VocabWord("fail", "رد شدن", "/feɪl/", "verb",
                    "He failed.", "رد شد."),
                VocabWord("graduate", "فارغ‌التحصیل", "/ˈɡrædʒueɪt/", "verb",
                    "She graduated.", "فارغ‌التحصیل شد."),
                VocabWord("scholarship", "بورسیه", "/ˈskɑːlərʃɪp/", "noun",
                    "He got a scholarship.", "بورسیه گرفت."),
                VocabWord("knowledge", "دانش", "/ˈnɑːlɪdʒ/", "noun",
                    "Knowledge is power.", "دانش قدرته."),
                VocabWord("subject", "درس", "/ˈsʌbdʒɪkt/", "noun",
                    "Math is my favorite subject.", "ریاضی درس مورد علاقه‌مه."),
                VocabWord("skill", "مهارت", "/skɪl/", "noun",
                    "Communication is a skill.", "ارتباطات یه مهارته.")
            ),
            idioms = listOf(
                IdiomExpression("hit the books", "درس خواندن",
                    "I need to hit the books.", "باید درس بخونم.", "informal"),
                IdiomExpression("learn by heart", "حفظ کردن",
                    "She learned it by heart.", "حفظش کرد.", "neutral"),
                IdiomExpression("pass with flying colors", "با نمره عالی قبول شدن",
                    "He passed with flying colors.", "با نمره عالی قبول شد.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("education",
                    "education /ˌedʒuˈkeɪʃən/."),
                PronunciationTip("university",
                    "university /ˌjuːnɪˈvɜːrsəti/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Education systems",
                    "سیستم‌های آموزشی متفاوتن."),
                CulturalNote("Lifelong learning",
                    "یادگیری مادام‌العمر ارزشمنده.")
            ),
            grammar = listOf(
                GrammarSection("First conditional",
                    """
                        If + present simple, will + verb
                        If I study, I will pass.
                    """.trimIndent()),
                GrammarSection("Second conditional",
                    """
                        If + past simple, would + verb
                        If I had time, I would learn more.
                    """.trimIndent()),
                GrammarSection("Present perfect for education",
                    """
                        I've graduated.
                        She's studied in three countries.
                    """.trimIndent()),
                GrammarSection("Future plans",
                    """
                        I'm going to apply for a scholarship.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If I will study, I pass.", "If I study, I will pass.", "در if از present simple."),
                CommonMistake("If I was rich...", "If I were rich...", "second conditional از were."),
                CommonMistake("I have graduated last year.", "I graduated last year.", "زمان مشخص = simple past.")
            ),
            conversation = listOf(
                DialogueLine("A", "What are you studying?", "چی می‌خونی؟"),
                DialogueLine("B", "Economics at university.", "اقتصاد در دانشگاه."),
                DialogueLine("A", "How's it going?", "چطور پیش می‌ره؟"),
                DialogueLine("B", "Challenging but interesting.", "چالش‌برانگیز ولی جالب."),
                DialogueLine("A", "What do you want to do after?", "بعدش چیکار می‌خوای بکنی؟"),
                DialogueLine("B", "Work in finance or continue studying.", "کار در مالی یا ادامه تحصیل."),
                DialogueLine("A", "A master's?", "فوق لیسانس؟"),
                DialogueLine("B", "If I get good grades, I'll apply for a scholarship.", "اگه نمره‌های خوبی بگیرم، برای بورسیه درخواست می‌دم."),
                DialogueLine("A", "Languages?", "زبان؟"),
                DialogueLine("B", "I've been learning English for years.", "سال‌هاست انگلیسی یاد می‌گیرم."),
                DialogueLine("A", "If I had time, I'd learn another language.", "اگه وقت داشتم، یه زبان دیگه یاد می‌گرفتم."),
                DialogueLine("B", "You should! It's never too late.", "باید بکنی! هیچ‌وقت دیر نیست."),
                DialogueLine("A", "Favorite subject?", "درس مورد علاقه؟"),
                DialogueLine("B", "Statistics.", "آمار."),
                DialogueLine("A", "Hardest?", "سخت‌ترین؟"),
                DialogueLine("B", "Calculus. I have to hit the books.", "حساب دیفرانسیل. باید درس بخونم."),
                DialogueLine("A", "Good luck!", "موفق باشی!"),
                DialogueLine("B", "Thanks!", "ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه رشته‌ای می‌خواند؟", "اقتصاد."),
                ComprehensionQuestion("بعد از فارغ‌التحصیلی چه برنامه‌ای دارد؟", "کار یا ادامه تحصیل."),
                ComprehensionQuestion("چه زبانی یاد می‌گیرد؟", "انگلیسی."),
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
                    "Use conditionals and future.")
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
                    listOf("با نمره عالی", "رد شدن", "متوسط", "دیر رسیدن"), 0),
                QuizQuestion("Complete: If I had time, I ___ another language.",
                    listOf("will learn", "would learn", "learn", "learned"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 11 — Culture and Arts
    // ═══════════════════════════════════════════════════════════
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Culture and Arts",
            titlePersian = "فرهنگ و هنر",
            objectives = listOf(
                "Discuss art and culture",
                "Use inversion for emphasis",
                "Talk about cultural experiences",
                "Express appreciation"
            ),
            vocabulary = listOf(
                VocabWord("art", "هنر", "/ɑːrt/", "noun",
                    "Art expresses emotions.", "هنر احساسات رو بیان می‌کنه."),
                VocabWord("culture", "فرهنگ", "/ˈkʌltʃər/", "noun",
                    "Culture shapes identity.", "فرهنگ هویت رو شکل می‌ده."),
                VocabWord("tradition", "سنت", "/trəˈdɪʃən/", "noun",
                    "Traditions connect.", "سنت‌ها وصل می‌کنن."),
                VocabWord("performance", "اجرا", "/pərˈfɔːrməns/", "noun",
                    "The performance was amazing.", "اجرا فوق‌العاده بود."),
                VocabWord("exhibition", "نمایشگاه", "/ˌeksɪˈbɪʃən/", "noun",
                    "We visited an exhibition.", "از نمایشگاه بازدید کردیم."),
                VocabWord("heritage", "میراث", "/ˈherɪtɪdʒ/", "noun",
                    "Heritage is precious.", "میراث ارزشمنده."),
                VocabWord("creative", "خلاق", "/kriˈeɪtɪv/", "adjective",
                    "Artists are creative.", "هنرمندان خلاقند."),
                VocabWord("inspire", "الهام بخشیدن", "/ɪnˈspaɪər/", "verb",
                    "Art inspires.", "هنر الهام می‌بخشه."),
                VocabWord("masterpiece", "شاهکار", "/ˈmæstərpiːs/", "noun",
                    "This is a masterpiece.", "این یه شاهکاره."),
                VocabWord("perform", "اجرا کردن", "/pərˈfɔːrm/", "verb",
                    "She performs beautifully.", "زیبا اجرا می‌کنه."),
                VocabWord("appreciate", "قدردانی کردن", "/əˈpriːʃieɪt/", "verb",
                    "Appreciate art.", "هنر رو قدردانی کن."),
                VocabWord("audience", "مخاطب", "/ˈɔːdiəns/", "noun",
                    "The audience loved it.", "مخاطب عاشقش شد.")
            ),
            idioms = listOf(
                IdiomExpression("state of the art", "پیشرفته‌ترین",
                    "State-of-the-art tech.", "پیشرفته‌ترین تکنولوژی.", "neutral"),
                IdiomExpression("food for thought", "مایه تفکر",
                    "The film gave me food for thought.", "فیلم مایه تفکر داد.", "idiom"),
                IdiomExpression("a work of art", "اثر هنری",
                    "This building is a work of art.", "این ساختمان یه اثر هنریه.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("exhibition",
                    "exhibition /ˌeksɪˈbɪʃən/."),
                PronunciationTip("masterpiece",
                    "masterpiece /ˈmæstərpiːs/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Museums",
                    "موزه‌ها بخش مهمی از فرهنگند."),
                CulturalNote("Cultural heritage",
                    "میراث فرهنگی اولویت داره.")
            ),
            grammar = listOf(
                GrammarSection("Inversion for emphasis",
                    """
                        Rarely have I seen such beauty.
                        Not only is it beautiful, but meaningful.
                    """.trimIndent()),
                GrammarSection("Passive for art",
                    """
                        The painting was created in 1900.
                    """.trimIndent()),
                GrammarSection("Expressing appreciation",
                    """
                        I really appreciate...
                        It's truly remarkable.
                    """.trimIndent()),
                GrammarSection("Cleft sentences",
                    """
                        What impressed me was the colors.
                        It was the music that moved me.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The painting was create in 1900.", "The painting was created in 1900.", "past participle."),
                CommonMistake("It was the music what moved me.", "It was the music that moved me.", "it-cleft با that."),
                CommonMistake("Rarely I have seen...", "Rarely have I seen...", "inversion.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you enjoy art?", "از هنر لذت می‌بری؟"),
                DialogueLine("B", "Very much.", "خیلی زیاد."),
                DialogueLine("A", "What kind?", "چه نوعی؟"),
                DialogueLine("B", "Paintings and music.", "نقاشی و موسیقی."),
                DialogueLine("A", "Any good performances?", "اجرای خوبی دیدی؟"),
                DialogueLine("B", "I saw a play last month.", "ماه پیش یه نمایش دیدم."),
                DialogueLine("A", "What impressed you?", "چی تحت تأثیرت قرار داد؟"),
                DialogueLine("B", "It was the acting that moved me.", "بازیگری بود."),
                DialogueLine("A", "Rarely do we see such talent.", "به‌ندرت چنین استعدادی می‌بینیم."),
                DialogueLine("B", "What about museums?", "موزه‌ها چطور؟"),
                DialogueLine("A", "I love them. Heritage is precious.", "عاشقشونم. میراث ارزشمنده."),
                DialogueLine("B", "Favorite museum?", "موزه مورد علاقه؟"),
                DialogueLine("A", "The Louvre.", "لوور."),
                DialogueLine("B", "I'd love to go.", "دوست دارم برم."),
                DialogueLine("A", "Start with the Mona Lisa.", "با مونالیزا شروع کن."),
                DialogueLine("B", "Thanks for the tip.", "ممنون."),
                DialogueLine("A", "Art should be appreciated slowly.", "هنر باید آروم قدردانی بشه."),
                DialogueLine("B", "Well said.", "خوب گفتی.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه نوع هنری را دوست دارد؟", "نقاشی و موسیقی."),
                ComprehensionQuestion("A از چه چیزی در نمایش لذت برد؟", "بازیگری."),
                ComprehensionQuestion("موزه مورد علاقه A چیست؟", "لوور."),
                ComprehensionQuestion("توصیه A چیست؟", "آرام قدردانی کن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss your favorite art form.",
                    "درباره هنر مورد علاقه‌ات صحبت کن.",
                    "I love... / What impresses me is..."),
                SpeakingTask("Talk about a cultural experience.",
                    "درباره یک تجربه فرهنگی صحبت کن.",
                    "I visited... / It was...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a cultural experience.",
                    "درباره یک تجربه فرهنگی بنویس.",
                    180,
                    "Use inversion and cleft sentences.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The painting was ___ in 1900.",
                    listOf("create", "created", "creating", "creates"), 1),
                QuizQuestion("Complete: It was the music ___ moved me.",
                    listOf("what", "that", "who", "which"), 1),
                QuizQuestion("Complete: Rarely ___ I seen such beauty.",
                    listOf("have", "has", "had", "having"), 0),
                QuizQuestion("What does 'food for thought' mean?",
                    listOf("غذا", "مایه تفکر", "فکر کردن", "غذا خوردن"), 1),
                QuizQuestion("Complete: Masterpieces are ___ by museums.",
                    listOf("protect", "protected", "protecting", "protects"), 1),
                QuizQuestion("What does 'state of the art' mean?",
                    listOf("وضعیت هنر", "پیشرفته‌ترین", "هنری", "قدیمی"), 1),
                QuizQuestion("Complete: Not only ___ it beautiful, but meaningful.",
                    listOf("is", "are", "was", "were"), 0),
                QuizQuestion("What does 'a work of art' mean?",
                    listOf("اثر هنری", "کار کردن", "هنر", "شغل"), 0)
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
                "Review all grammar",
                "Practice conversations",
                "Use all structures",
                "Set future goals"
            ),
            vocabulary = listOf(
                VocabWord("review", "مرور", "/rɪˈvjuː/", "noun",
                    "Let's review.", "بیا مرور کنیم."),
                VocabWord("practice", "تمرین", "/ˈpræktɪs/", "noun",
                    "Practice makes perfect.", "تمرین باعث پیشرفت."),
                VocabWord("improve", "بهتر کردن", "/ɪmˈpruːv/", "verb",
                    "I want to improve.", "می‌خوام بهتر شم."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective",
                    "I feel confident.", "با اعتماد به نفس‌ام."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "You're making progress.", "داری پیشرفت می‌کنی."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "English is a challenge.", "انگلیسی یه چالشه."),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun",
                    "It's OK to make mistakes.", "اشتباه کردن اشکالی نداره."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb",
                    "Continue practicing.", "تمرین رو ادامه بده."),
                VocabWord("succeed", "موفق شدن", "/səkˈsiːd/", "verb",
                    "You will succeed.", "موفق می‌شی."),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun",
                    "Learning is a journey.", "یادگیری یه سفره."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "My goal is fluency.", "هدفم روانی‌ه."),
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun",
                    "The future is bright.", "آینده روشنه.")
            ),
            idioms = listOf(
                IdiomExpression("practice makes perfect", "تمرین باعث پیشرفت",
                    "Practice makes perfect!", "تمرین باعث پیشرفت!", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد",
                    "Don't give up.", "تسلیم نشو.", "idiom"),
                IdiomExpression("break a leg", "موفق باشی",
                    "Break a leg!", "موفق باشی!", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Intonation",
                    "در سؤال‌ها صدای پایان جمله بالا می‌رود."),
                PronunciationTip("Linking",
                    "کلمات در گفتار طبیعی به هم می‌چسبند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Language learning",
                    "یادگیری زبان فرایندی طولانیه."),
                CulturalNote("Mistakes",
                    "اشتباه بخش طبیعی یادگیریه.")
            ),
            grammar = listOf(
                GrammarSection("Review: Present simple",
                    """
                        I work every day.
                    """.trimIndent()),
                GrammarSection("Review: Past simple",
                    """
                        I went to Paris.
                    """.trimIndent()),
                GrammarSection("Review: Present perfect",
                    """
                        I've been to London.
                        Have you ever eaten sushi?
                    """.trimIndent()),
                GrammarSection("Review: Conditionals",
                    """
                        If I study, I will pass.
                        If I studied, I would pass.
                        If I had studied, I would have passed.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I am agree.", "I agree.", "agree فعل است."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده."),
                CommonMistake("He don't like it.", "He doesn't like it.", "برای he/she/it از doesn't.")
            ),
            conversation = listOf(
                DialogueLine("A", "How's your English?", "انگلیسی‌ت چطوره؟"),
                DialogueLine("B", "Pretty well! I've been practicing.", "خیلی خوب! تمرین کرده‌ام."),
                DialogueLine("A", "More confident?", "با اعتماد به نفس‌تر؟"),
                DialogueLine("B", "Yes, much more.", "بله، خیلی بیشتر."),
                DialogueLine("A", "Hardest part?", "سخت‌ترین قسمت؟"),
                DialogueLine("B", "The grammar.", "گرامر."),
                DialogueLine("A", "What helped?", "چی کمک کرد؟"),
                DialogueLine("B", "Movies and conversations.", "فیلم و مکالمه."),
                DialogueLine("A", "Next goal?", "هدف بعدی؟"),
                DialogueLine("B", "Fluent in two years.", "روانی در دو سال."),
                DialogueLine("A", "How?", "چطور؟"),
                DialogueLine("B", "Daily practice and classes.", "تمرین روزانه و کلاس."),
                DialogueLine("A", "Good plan.", "برنامه خوب."),
                DialogueLine("B", "Practice makes perfect.", "تمرین باعث پیشرفت."),
                DialogueLine("A", "Rome wasn't built in a day.", "رم در یک روز ساخته نشد."),
                DialogueLine("B", "I'll be patient.", "صبور خواهم بود."),
                DialogueLine("A", "That's the spirit!", "همین روحیه رو می‌خوام!"),
                DialogueLine("B", "Thanks!", "ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور انگلیسی‌اش را تقویت کرده؟", "تمرین روزانه، فیلم، مکالمه."),
                ComprehensionQuestion("سخت‌ترین بخش چه بود؟", "گرامر."),
                ComprehensionQuestion("هدف B چیست؟", "روانی در دو سال."),
                ComprehensionQuestion("B چطور به هدفش می‌رسد؟", "تمرین روزانه و کلاس.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your English journey.",
                    "درباره مسیر انگلیسی‌ات صحبت کن.",
                    "I started... / I've learned..."),
                SpeakingTask("Give advice to a beginner.",
                    "به یک مبتدی توصیه کن.",
                    "You should... / Don't give up...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your English goals.",
                    "درباره اهداف انگلیسی‌ات بنویس.",
                    150,
                    "Use all structures you've learned.")
            ),
            quiz = listOf(
                QuizQuestion("What does 'practice makes perfect' mean?",
                    listOf("تمرین سخت است", "تمرین باعث پیشرفت", "تمرین بی‌فایده", "تمرین طولانی"), 1),
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
}ههل