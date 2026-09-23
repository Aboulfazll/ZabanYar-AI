package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCorners3 {

    const val BOOK_ID = "four_corners_3"

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
    // CHAPTER 1 — New Friends
    // ═══════════════════════════════════════════════════════════
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "New Friends",
            titlePersian = "دوستان جدید",
            objectives = listOf(
                "Talk about relationships",
                "Describe personality",
                "Use present perfect for experiences",
                "Distinguish present perfect from simple past"
            ),
            vocabulary = listOf(
                VocabWord("personality", "شخصیت", "/ˌpɜːrsəˈnæləti/", "noun",
                    "Her personality is very friendly.", "شخصیتش خیلی دوستانه‌ست."),
                VocabWord("outgoing", "اجتماعی", "/ˈaʊtɡoʊɪŋ/", "adjective",
                    "He's very outgoing.", "او خیلی اجتماعیه."),
                VocabWord("reliable", "قابل اعتماد", "/rɪˈlaɪəbəl/", "adjective",
                    "A good friend should be reliable.", "دوست خوب باید قابل اعتماد باشه."),
                VocabWord("patient", "صبور", "/ˈpeɪʃənt/", "adjective",
                    "My sister is patient.", "خواهرم صبوره."),
                VocabWord("confident", "بااعتمادبه‌نفس", "/ˈkɑːnfɪdənt/", "adjective",
                    "She sounds confident.", "بااعتمادبه‌نفس به نظر می‌رسه."),
                VocabWord("impression", "برداشت", "/ɪmˈpreʃən/", "noun",
                    "He made a good impression.", "برداشت خوبی ایجاد کرد."),
                VocabWord("similar", "مشابه", "/ˈsɪmələr/", "adjective",
                    "We have similar interests.", "علایق مشابهی داریم."),
                VocabWord("different", "متفاوت", "/ˈdɪfrənt/", "adjective",
                    "Our personalities are different.", "شخصیت‌هامون متفاوته."),
                VocabWord("relationship", "رابطه", "/rɪˈleɪʃənʃɪp/", "noun",
                    "Trust is important in a relationship.", "اعتماد در رابطه مهمه."),
                VocabWord("trust", "اعتماد", "/trʌst/", "noun",
                    "It takes time to trust someone.", "اعتماد کردن زمان می‌بره."),
                VocabWord("supportive", "حمایتگر", "/səˈpɔːrtɪv/", "adjective",
                    "My friends are supportive.", "دوستام حمایتگرن."),
                VocabWord("acquaintance", "آشنا", "/əˈkweɪntəns/", "noun",
                    "He's an old acquaintance.", "او یه آشنای قدیمیه.")
            ),
            idioms = listOf(
                IdiomExpression("get along", "کنار آمدن",
                    "We get along very well.", "خیلی خوب کنار میایم.", "informal"),
                IdiomExpression("hit it off", "از اول جور شدن",
                    "We met and immediately hit it off.", "آشنا شدیم و از اول جور شدیم.", "informal"),
                IdiomExpression("first impression", "برداشت اول",
                    "First impressions can be misleading.", "برداشت‌های اول گمراه‌کننده‌اند.", "neutral")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("get to know", "شناختن تدریجی", "به‌تدریج شناختن",
                    "It takes time to get to know someone.", "شناختن یه نفر زمان می‌بره.", "No"),
                PhrasalVerb("open up", "درد دل کردن", "راحت‌تر صحبت کردن",
                    "She slowly opened up about her experience.", "کم‌کم راحت‌تر صحبت کرد.", "No")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Present Perfect contractions",
                    "have → 've، has → 's در مکالمه."),
                PronunciationTip("Reliable",
                    "reliable /rɪˈlaɪəbəl/ — استرس روی li."),
                PronunciationTip("Word stress",
                    "personality /ˌpɜːrsəˈnæləti/ — استرس روی nal.")
            ),
            culturalNotes = listOf(
                CulturalNote("First impressions",
                    "برداشت اول مهمه ولی شناخت واقعی زمان می‌بره."),
                CulturalNote("Friendship and privacy",
                    "میزان اشتراک‌گذاری شخصی در فرهنگ‌ها متفاوته.")
            ),
            grammar = listOf(
                GrammarSection("Present Perfect for experiences",
                    """
                        have/has + past participle

                        I have visited Italy.
                        She has met many people.
                        We have tried that restaurant.
                    """.trimIndent()),
                GrammarSection("Ever and Never",
                    """
                        Have you ever traveled alone?
                        I've never traveled alone.
                    """.trimIndent()),
                GrammarSection("Present Perfect vs Simple Past",
                    """
                        Past: I visited Paris last year.
                        Present Perfect: I have visited Paris.

                        Have you ever been to London?
                        When did you go? — In 2023.
                    """.trimIndent()),
                GrammarSection("For and Since",
                    """
                        for + مدت: for five years
                        since + نقطه شروع: since 2021

                        I've known her for five years.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have visited Paris last year.", "I visited Paris last year.", "زمان مشخص = simple past."),
                CommonMistake("Did you ever visit London?", "Have you ever visited London?", "ever با present perfect."),
                CommonMistake("She have met him.", "She has met him.", "برای she از has."),
                CommonMistake("I know him since 2020.", "I've known him since 2020.", "از گذشته تا حالا = present perfect.")
            ),
            conversation = listOf(
                DialogueLine("Mina", "Have you been here before?", "قبلاً اینجا بوده‌ای؟"),
                DialogueLine("Adam", "Yes, I've been here a few times. I used to work with one of the organizers.", "بله، چند بار بوده‌ام. با یکی از برگزارکنندگان کار می‌کردم."),
                DialogueLine("Mina", "That's probably why you look so comfortable.", "احتمالاً به همین دلیل راحت به نظر می‌رسی."),
                DialogueLine("Adam", "Most people here are meeting for the first time.", "بیشتر افراد اینجا برای اولین بار همدیگه رو می‌بینن."),
                DialogueLine("Mina", "I've already met two people who seem really interesting.", "من تا حالا با دو نفر آشنا شده‌ام که جالب به نظر می‌رسن."),
                DialogueLine("Adam", "Who are they?", "کی هستن؟"),
                DialogueLine("Mina", "One is a photographer, the other works at a tech company.", "یکی عکاسه، دیگری در شرکت فناوری کار می‌کنه."),
                DialogueLine("Adam", "Have you talked to them about their work?", "درباره کارشون صحبت کردی؟"),
                DialogueLine("Mina", "Yes. The photographer has traveled to more than twenty countries.", "بله. عکاس به بیش از بیست کشور سفر کرده."),
                DialogueLine("Adam", "That's impressive. Have you ever traveled for work?", "جالب. تو تا حالا برای کار سفر کرده‌ای؟"),
                DialogueLine("Mina", "A few times, but I've never traveled outside my region for work.", "چند بار، ولی هرگز خارج از منطقه‌ام برای کار سفر نکرده‌ام."),
                DialogueLine("Adam", "I think traveling for work changes how you see people.", "فکر می‌کنم سفر کاری نگاهت به مردم رو تغییر می‌ده."),
                DialogueLine("Mina", "I agree. People have very different ideas about good workplaces.", "موافقم. مردم دیدگاه‌های متفاوتی درباره محیط کاری خوب دارن."),
                DialogueLine("Adam", "Some prefer quiet, others enjoy large teams.", "بعضی آرام رو ترجیح می‌دن، بعضی تیم بزرگ رو دوست دارن."),
                DialogueLine("Mina", "What kind of people do you get along with?", "با چه نوع آدم‌هایی کنار میای؟"),
                DialogueLine("Adam", "People who are open-minded and reliable.", "افرادی که روشن‌فکر و قابل اعتمادن."),
                DialogueLine("Mina", "That's a healthy attitude.", "نگرش سالمیه."),
                DialogueLine("Adam", "Thanks. Have you made any new friends today?", "ممنون. امروز دوست جدید پیدا کردی؟"),
                DialogueLine("Mina", "Yes, I think I've met a few possible new friends.", "بله، فکر می‌کنم با چند دوست جدید احتمالی آشنا شده‌ام."),
                DialogueLine("Adam", "That's great! Let's stay in touch.", "عالیه! در تماس باشیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Adam چند بار اینجا بوده؟", "چند بار."),
                ComprehensionQuestion("Mina با چه کسانی آشنا شده؟", "یک عکاس و یک کارمند شرکت فناوری."),
                ComprehensionQuestion("عکاس به چند کشور سفر کرده؟", "بیش از بیست کشور."),
                ComprehensionQuestion("Adam با چه نوع آدم‌هایی کنار میاد؟", "روشن‌فکر و قابل اعتماد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your personality.",
                    "درباره شخصیتت صحبت کن.",
                    "I'm... / I usually..."),
                SpeakingTask("Talk about a friend.",
                    "درباره یه دوست صحبت کن.",
                    "We've known each other for...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your best friend.",
                    "درباره بهترین دوستت بنویس.",
                    120,
                    "Use present perfect and personality adjectives.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ visited Italy.",
                    listOf("have", "has", "am", "was"), 0),
                QuizQuestion("Complete: She ___ met many people.",
                    listOf("have", "has", "is", "was"), 1),
                QuizQuestion("Complete: I ___ to Paris last year.",
                    listOf("have been", "went", "go", "going"), 1),
                QuizQuestion("Complete: Have you ever ___ abroad?",
                    listOf("be", "being", "been", "was"), 2),
                QuizQuestion("What does 'get along' mean?",
                    listOf("کنار آمدن", "دعوا کردن", "جدا شدن", "سفر کردن"), 0),
                QuizQuestion("Complete: I've known her ___ five years.",
                    listOf("since", "for", "in", "at"), 1),
                QuizQuestion("Complete: I've known her ___ 2020.",
                    listOf("since", "for", "in", "at"), 0),
                QuizQuestion("What does 'hit it off' mean?",
                    listOf("کتک زدن", "از اول جور شدن", "دعوا کردن", "جدا شدن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 2 — Working Life
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Working Life",
            titlePersian = "زندگی کاری",
            objectives = listOf(
                "Talk about work and jobs",
                "Use present perfect with for/since",
                "Discuss career goals",
                "Talk about workplace skills"
            ),
            vocabulary = listOf(
                VocabWord("career", "حرفه", "/kəˈrɪr/", "noun",
                    "I want a successful career.", "حرفه موفقی می‌خوام."),
                VocabWord("colleague", "همکار", "/ˈkɑːliːɡ/", "noun",
                    "My colleagues are helpful.", "همکارام کمک‌کننده‌ن."),
                VocabWord("salary", "حقوق", "/ˈsæləri/", "noun",
                    "The salary is competitive.", "حقوق رقابتیه."),
                VocabWord("promotion", "ترفیع", "/prəˈmoʊʃən/", "noun",
                    "She got a promotion.", "ترفیع گرفت."),
                VocabWord("experience", "تجربه", "/ɪkˈspɪəriəns/", "noun",
                    "I have five years of experience.", "پنج سال تجربه دارم."),
                VocabWord("skill", "مهارت", "/skɪl/", "noun",
                    "Communication is an important skill.", "ارتباطات مهارت مهمیه."),
                VocabWord("interview", "مصاحبه", "/ˈɪntərvjuː/", "noun",
                    "I have an interview tomorrow.", "فردا مصاحبه دارم."),
                VocabWord("resume", "رزومه", "/ˈrezəmeɪ/", "noun",
                    "Send me your resume.", "رزومه‌ات رو بفرست."),
                VocabWord("apply", "درخواست دادن", "/əˈplaɪ/", "verb",
                    "I applied for the job.", "برای شغل درخواست دادم."),
                VocabWord("hire", "استخدام کردن", "/ˈhaɪər/", "verb",
                    "They hired three people.", "سه نفر استخدام کردن."),
                VocabWord("resign", "استعفا دادن", "/rɪˈzaɪn/", "verb",
                    "He resigned last week.", "هفته پیش استعفا داد."),
                VocabWord("retire", "بازنشسته شدن", "/rɪˈtaɪər/", "verb",
                    "My father retired last year.", "پدرم سال پیش بازنشسته شد.")
            ),
            idioms = listOf(
                IdiomExpression("climb the ladder", "پیشرفت کردن",
                    "He's climbing the career ladder.", "داره در حرفه‌اش پیشرفت می‌کنه.", "idiom"),
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
                    "مصاحبه‌ها در غرب رسمی و ساختارمندن.")
            ),
            grammar = listOf(
                GrammarSection("Present Perfect with for/since",
                    """
                        I've worked here for five years.
                        I've been in this role since 2020.
                    """.trimIndent()),
                GrammarSection("Present Perfect for experience",
                    """
                        I've worked in three companies.
                        She's never had a promotion.
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
                DialogueLine("A", "Do you enjoy it?", "لذت می‌بری؟"),
                DialogueLine("B", "Mostly yes. But I'm thinking about a change.", "بیشتر بله. ولی به تغییر فکر می‌کنم."),
                DialogueLine("A", "What kind of change?", "چه نوع تغییری؟"),
                DialogueLine("B", "I'd like to work abroad for a while.", "دوست دارم مدتی در خارج کار کنم."),
                DialogueLine("A", "Have you applied anywhere?", "جایی درخواست دادی؟"),
                DialogueLine("B", "Not yet. I'm updating my resume first.", "هنوز نه. اول رزومه‌ام رو آپدیت می‌کنم."),
                DialogueLine("A", "What skills do you have?", "چه مهارت‌هایی داری؟"),
                DialogueLine("B", "Communication and project management.", "ارتباطات و مدیریت پروژه."),
                DialogueLine("A", "Those are valuable. What about languages?", "ارزشمندن. زبان چطور؟"),
                DialogueLine("B", "I speak English and a bit of French.", "انگلیسی و کمی فرانسه."),
                DialogueLine("A", "What's your dream job?", "شغل رویایی‌ات چیه؟"),
                DialogueLine("B", "I'd love to work for an international company.", "دوست دارم برای شرکت بین‌المللی کار کنم."),
                DialogueLine("A", "That's a great goal. Good luck!", "هدف عالیه. موفق باشی!"),
                DialogueLine("B", "Thanks! I'll need it.", "ممنون! لازمش دارم."),
                DialogueLine("A", "Let me know if you need help.", "اگه کمک خواستی خبرم کن."),
                DialogueLine("B", "I will. Thanks so much!", "می‌کنم. خیلی ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند وقت است که در شرکتش کار می‌کند؟", "پنج سال."),
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
                    listOf("بالا رفتن از نردبان", "پیشرفت کردن", "کاهش دادن", "جا ماندن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 3 — Healthy Living
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Healthy Living",
            titlePersian = "زندگی سالم",
            objectives = listOf(
                "Talk about health and lifestyle",
                "Use modal verbs for advice",
                "Discuss healthy habits",
                "Use gerunds after prepositions"
            ),
            vocabulary = listOf(
                VocabWord("lifestyle", "سبک زندگی", "/ˈlaɪfstaɪl/", "noun",
                    "She has a healthy lifestyle.", "سبک زندگی سالمی داره."),
                VocabWord("diet", "رژیم غذایی", "/ˈdaɪət/", "noun",
                    "I'm on a diet.", "رژیم دارم."),
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
                    "I have a morning routine.", "یه روتین صبحگاهی دارم."),
                VocabWord("energetic", "پرانرژی", "/ˌenərˈdʒetɪk/", "adjective",
                    "I feel energetic today.", "امروز پرانرژی‌ام."),
                VocabWord("tired", "خسته", "/ˈtaɪərd/", "adjective",
                    "I'm always tired.", "همیشه خسته‌ام.")
            ),
            idioms = listOf(
                IdiomExpression("burn out", "فرسوده شدن",
                    "Many people burn out from work.", "بسیاری از افراد از کار فرسوده می‌شن.", "informal"),
                IdiomExpression("under the weather", "حالش خوب نبودن",
                    "I'm feeling under the weather.", "امروز حالم خوب نیست.", "informal"),
                IdiomExpression("take it easy", "سخت نگیر",
                    "Take it easy this weekend.", "این آخر هفته سخت نگیر.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("stress",
                    "stress /stres/ — ترکیب st+r سخته."),
                PronunciationTip("lifestyle",
                    "lifestyle /ˈlaɪfstaɪl/ — استرس روی first syllable.")
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
                        You ought to sleep more.
                    """.trimIndent()),
                GrammarSection("Present perfect for lifestyle changes",
                    """
                        I've started going to the gym.
                        She's quit smoking.
                    """.trimIndent()),
                GrammarSection("Gerunds after prepositions",
                    """
                        I'm good at relaxing.
                        She's interested in yoga.
                        He's thinking about changing jobs.
                    """.trimIndent()),
                GrammarSection("Want to / need to",
                    """
                        I want to lose weight.
                        I need to sleep more.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("You should to exercise.", "You should exercise.", "بعد از should فعل ساده."),
                CommonMistake("I'm interesting in yoga.", "I'm interested in yoga.", "interested نه interesting."),
                CommonMistake("I want lose weight.", "I want to lose weight.", "بعد از want از to.")
            ),
            conversation = listOf(
                DialogueLine("A", "You look tired. Are you OK?", "خسته به نظر می‌رسی. حالت خوبه؟"),
                DialogueLine("B", "I'm stressed. I've been working too much.", "استرس دارم. خیلی کار کرده‌ام."),
                DialogueLine("A", "You should take a break.", "باید استراحت کنی."),
                DialogueLine("B", "I know, but I have deadlines.", "می‌دونم، ولی ضرب‌الاجل دارم."),
                DialogueLine("A", "Try to find balance.", "سعی کن تعادل پیدا کنی."),
                DialogueLine("B", "What do you do to relax?", "تو برای استراحت چیکار می‌کنی؟"),
                DialogueLine("A", "I go for walks and do yoga.", "پیاده‌روی می‌رم و یوگا می‌کنم."),
                DialogueLine("B", "That sounds nice. I've never tried yoga.", "خوبه. یوگا امتحان نکرده‌ام."),
                DialogueLine("A", "You should try it.", "باید امتحان کنی."),
                DialogueLine("B", "Maybe I will. Do you exercise often?", "شاید امتحان کنم. زیاد ورزش می‌کنی؟"),
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
                ComprehensionQuestion("B چرا استرس دارد؟", "چون زیاد کار کرده."),
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
    // CHAPTER 4 — The Future
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "The Future",
            titlePersian = "آینده",
            objectives = listOf(
                "Talk about future plans",
                "Use will and going to",
                "Make predictions",
                "Talk about technology and the future"
            ),
            vocabulary = listOf(
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun",
                    "The future is uncertain.", "آینده نامعلومه."),
                VocabWord("prediction", "پیش‌بینی", "/prɪˈdɪkʃən/", "noun",
                    "Making predictions is difficult.", "پیش‌بینی سخته."),
                VocabWord("technology", "تکنولوژی", "/tekˈnɑːlədʒi/", "noun",
                    "Technology is changing fast.", "تکنولوژی سریع تغییر می‌کنه."),
                VocabWord("develop", "توسعه دادن", "/dɪˈveləp/", "verb",
                    "They're developing new tech.", "تکنولوژی جدید توسعه می‌دن."),
                VocabWord("improve", "بهبود دادن", "/ɪmˈpruːv/", "verb",
                    "AI will improve healthcare.", "هوش مصنوعی سلامت رو بهتر می‌کنه."),
                VocabWord("predict", "پیش‌بینی کردن", "/prɪˈdɪkt/", "verb",
                    "It's hard to predict the future.", "پیش‌بینی آینده سخته."),
                VocabWord("change", "تغییر", "/tʃeɪndʒ/", "noun/verb",
                    "Change is coming.", "تغییر در راهه."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun",
                    "It's a great opportunity.", "فرصت عالیه."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "We face many challenges.", "با چالش‌های زیادی روبرویم."),
                VocabWord("optimistic", "خوش‌بین", "/ˌɑːptɪˈmɪstɪk/", "adjective",
                    "I'm optimistic about the future.", "درباره آینده خوش‌بینم."),
                VocabWord("pessimistic", "بدبین", "/ˌpesɪˈmɪstɪk/", "adjective",
                    "Don't be so pessimistic.", "اینقدر بدبین نباش."),
                VocabWord("innovation", "نوآوری", "/ˌɪnəˈveɪʃən/", "noun",
                    "Innovation drives progress.", "نوآوری پیشرفت رو هدایت می‌کنه.")
            ),
            idioms = listOf(
                IdiomExpression("the sky's the limit", "محدودیتی وجود ندارد",
                    "With AI, the sky's the limit.", "با هوش مصنوعی محدودیتی وجود نداره.", "idiom"),
                IdiomExpression("bright future", "آینده روشن",
                    "She has a bright future.", "آینده روشنی داره.", "neutral"),
                IdiomExpression("change of pace", "تغییر سرعت",
                    "A change of pace is good.", "تغییر سرعت خوبه.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("technology",
                    "technology /tekˈnɑːlədʒi/ — استرس روی no."),
                PronunciationTip("going to → gonna",
                    "در مکالمه سریع gonna.")
            ),
            culturalNotes = listOf(
                CulturalNote("Tech optimism",
                    "در سیلیکون ولی، خوش‌بینی به تکنولوژی رایجه."),
                CulturalNote("AI debate",
                    "بحث درباره هوش مصنوعی در غرب داغه.")
            ),
            grammar = listOf(
                GrammarSection("will for predictions",
                    """
                        AI will change everything.
                        It will be different.
                        People will live longer.
                    """.trimIndent()),
                GrammarSection("going to for plans",
                    """
                        I'm going to study AI.
                        She's going to start a business.
                    """.trimIndent()),
                GrammarSection("may / might / could",
                    """
                        AI might replace some jobs.
                        We may see flying cars.
                        It could happen soon.
                    """.trimIndent()),
                GrammarSection("If clauses for future",
                    """
                        If we invest in AI, we will see results.
                        If technology continues to grow, life will change.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("AI will changes.", "AI will change.", "بعد از will فعل ساده."),
                CommonMistake("It might to happen.", "It might happen.", "بعد از might فعل ساده."),
                CommonMistake("If it will rain, we will stay.", "If it rains, we will stay.", "in if-clause: present simple.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you think the future will be like?", "فکر می‌کنی آینده چطور خواهد بود؟"),
                DialogueLine("B", "I'm optimistic. Technology will improve our lives.", "خوش‌بینم. تکنولوژی زندگی‌مون رو بهتر می‌کنه."),
                DialogueLine("A", "What about AI?", "هوش مصنوعی چطور؟"),
                DialogueLine("B", "AI will change everything — work, education, health.", "همه چیز رو تغییر می‌ده — کار، آموزش، سلامت."),
                DialogueLine("A", "Do you worry about job losses?", "نگران از دست رفتن شغل‌ها هستی؟"),
                DialogueLine("B", "Some jobs will disappear, but new ones will appear.", "بعضی شغل‌ها از بین می‌رن، ولی جدیدها ظاهر می‌شن."),
                DialogueLine("A", "What should we do?", "چیکار باید بکنیم؟"),
                DialogueLine("B", "Learn continuously and adapt.", "مداوم یاد بگیریم و سازگار شیم."),
                DialogueLine("A", "Will AI replace teachers?", "هوش مصنوعی جایگزین معلم‌ها می‌شه؟"),
                DialogueLine("B", "It might help them, but not replace them.", "ممکنه کمکشون کنه، ولی جایگزین نشه."),
                DialogueLine("A", "What about health?", "سلامت چطور؟"),
                DialogueLine("B", "AI could discover new treatments faster.", "می‌تونه سریع‌تر درمان‌های جدید کشف کنه."),
                DialogueLine("A", "That sounds promising.", "امیدوارکننده به نظر می‌رسه."),
                DialogueLine("B", "If we use it wisely, the future is bright.", "اگه عاقلانه استفاده کنیم، آینده روشنه."),
                DialogueLine("A", "What worries you most?", "چی بیشتر نگرانت می‌کنه؟"),
                DialogueLine("B", "Inequality. Not everyone will benefit equally.", "نابرابری. همه به یه اندازه بهره نمی‌برن."),
                DialogueLine("A", "True. We need to make sure it helps everyone.", "درسته. باید مطمئن شیم به همه کمک می‌کنه."),
                DialogueLine("B", "That's the challenge of our time.", "چالش زمان ما همینه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B درباره آینده چه احساسی دارد؟", "خوش‌بین."),
                ComprehensionQuestion("AI چه چیزهایی را تغییر می‌دهد؟", "کار، آموزش، سلامت."),
                ComprehensionQuestion("B درباره از دست رفتن شغل‌ها چه نظری دارد؟", "بعضی از بین می‌روند ولی جدید ظاهر می‌شوند."),
                ComprehensionQuestion("بزرگ‌ترین نگرانی B چیست؟", "نابرابری.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about the future.",
                    "درباره آینده صحبت کن.",
                    "I think... will... / It might..."),
                SpeakingTask("Predict future technology.",
                    "تکنولوژی آینده رو پیش‌بینی کن.",
                    "AI will... / We may...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your predictions for the future.",
                    "درباره پیش‌بینی‌هایت از آینده بنویس.",
                    180,
                    "Use will, going to, might.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: AI ___ change everything.",
                    listOf("will", "wills", "is will", "to will"), 0),
                QuizQuestion("Complete: It ___ happen soon.",
                    listOf("might", "mights", "is might", "to might"), 0),
                QuizQuestion("Complete: She ___ going to start a business.",
                    listOf("is", "am", "are", "be"), 0),
                QuizQuestion("Complete: If it ___, we will stay home.",
                    listOf("will rain", "rains", "rained", "raining"), 1),
                QuizQuestion("What does 'the sky's the limit' mean?",
                    listOf("آسمان محدوده", "محدودیتی وجود ندارد", "بالا رفتن", "پرواز کردن"), 1),
                QuizQuestion("Complete: Technology ___ our lives.",
                    listOf("improve", "improves", "improving", "improved"), 1),
                QuizQuestion("Complete: People ___ live longer.",
                    listOf("will", "wills", "is will", "to will"), 0),
                QuizQuestion("What does 'bright future' mean?",
                    listOf("آینده تاریک", "آینده روشن", "آینده نامعلوم", "آینده دور"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 5 — Travel and Culture
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Travel and Culture",
            titlePersian = "سفر و فرهنگ",
            objectives = listOf(
                "Talk about travel experiences",
                "Use the passive voice",
                "Discuss cultural differences",
                "Describe places"
            ),
            vocabulary = listOf(
                VocabWord("culture", "فرهنگ", "/ˈkʌltʃər/", "noun",
                    "I love new cultures.", "عاشق فرهنگ‌های جدیدم."),
                VocabWord("custom", "رسم", "/ˈkʌstəm/", "noun",
                    "Every country has customs.", "هر کشوری رسوم خودش رو داره."),
                VocabWord("traditional", "سنتی", "/trəˈdɪʃənl/", "adjective",
                    "This is a traditional dish.", "این یه غذای سنتیه."),
                VocabWord("modern", "مدرن", "/ˈmɑːdərn/", "adjective",
                    "The city is modern.", "شهر مدرنه."),
                VocabWord("souvenir", "سوغات", "/ˌsuːvəˈnɪr/", "noun",
                    "I bought souvenirs.", "سوغات خریدم."),
                VocabWord("landmark", "نقطه دیدنی", "/ˈlændmɑːrk/", "noun",
                    "The Eiffel Tower is a landmark.", "برج ایفل یه نقطه دیدنیه."),
                VocabWord("sightseeing", "بازدید", "/ˈsaɪtsiːɪŋ/", "noun",
                    "We went sightseeing.", "رفتیم بازدید."),
                VocabWord("guide", "راهنما", "/ɡaɪd/", "noun",
                    "The guide was helpful.", "راهنما کمک‌کننده بود."),
                VocabWord("landscape", "منظره", "/ˈlændskeɪp/", "noun",
                    "The landscape is beautiful.", "منظره زیباست."),
                VocabWord("adapt", "سازگار شدن", "/əˈdæpt/", "verb",
                    "It takes time to adapt.", "سازگاری زمان می‌بره."),
                VocabWord("hospitality", "مهمان‌نوازی", "/ˌhɑːspɪˈtæləti/", "noun",
                    "Their hospitality was amazing.", "مهمان‌نوازیشون عالی بود."),
                VocabWord("perspective", "دیدگاه", "/pərˈspektɪv/", "noun",
                    "Travel changes your perspective.", "سفر دیدگاهت رو تغییر می‌ده.")
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
                    "آداب و رسوم در فرهنگ‌ها متفاوته."),
                CulturalNote("Globalization",
                    "جهانی شدن فرهنگ‌ها رو نزدیک کرده.")
            ),
            grammar = listOf(
                GrammarSection("Passive voice",
                    """
                        Present: The city is visited by millions.
                        Past: The temple was built in 1400.
                        Perfect: It has been restored recently.
                    """.trimIndent()),
                GrammarSection("Passive with modals",
                    """
                        The museum can be visited for free.
                        The tickets must be booked online.
                    """.trimIndent()),
                GrammarSection("Present perfect for travel",
                    """
                        I've visited 20 countries.
                        She's been to Japan three times.
                    """.trimIndent()),
                GrammarSection("Describing places",
                    """
                        It's famous for...
                        It's known as...
                        It's considered one of the...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The temple built in 1400.", "The temple was built in 1400.", "passive: was + pp."),
                CommonMistake("English is speak here.", "English is spoken here.", "past participle لازمه."),
                CommonMistake("I've been to Japan last year.", "I went to Japan last year.", "زمان مشخص = past simple.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you traveled abroad?", "خارج سفر کرده‌ای؟"),
                DialogueLine("B", "Yes, I've been to several countries.", "بله، به چندین کشور رفته‌ام."),
                DialogueLine("A", "Which was the most interesting?", "کدومش جالب‌تر بود؟"),
                DialogueLine("B", "Japan, I think. It has a fascinating culture.", "ژاپن، فکر کنم. فرهنگ جذابی داره."),
                DialogueLine("A", "What did you like most?", "چی بیشتر دوست داشتی؟"),
                DialogueLine("B", "The temples and gardens.", "معابد و باغ‌ها."),
                DialogueLine("A", "Did you have any problems?", "مشکلی داشتی؟"),
                DialogueLine("B", "A bit of culture shock at first.", "اولش یه کم شوک فرهنگی."),
                DialogueLine("A", "How did you adapt?", "چطور سازگار شدی؟"),
                DialogueLine("B", "I learned a few words and followed local customs.", "چند کلمه یاد گرفتم و رسوم محلی رو رعایت کردم."),
                DialogueLine("A", "What's your favorite place?", "مکان مورد علاقه‌ات کجاست؟"),
                DialogueLine("B", "Kyoto. It's a mix of traditional and modern.", "کیوتو. ترکیبی از سنتی و مدرن."),
                DialogueLine("A", "Any tips?", "توصیه‌ای داری؟"),
                DialogueLine("B", "Learn some Japanese phrases and try local food.", "چند عبارت ژاپنی یاد بگیر و غذای محلی امتحان کن."),
                DialogueLine("A", "What about food?", "غذا چطور؟"),
                DialogueLine("B", "Amazing! Sushi and ramen were the best.", "فوق‌العاده! سوشی و رامن بهترین بودن."),
                DialogueLine("A", "You're making me hungry!", "داری گشنه‌ام می‌کنی!"),
                DialogueLine("B", "Ha! You should go. It's worth it.", "ها! باید بری. ارزشش رو داره.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B کجاها سفر کرده؟", "چندین کشور، از جمله ژاپن."),
                ComprehensionQuestion("B چه چیزی در ژاپن را دوست داشت؟", "معابد و باغ‌ها."),
                ComprehensionQuestion("B چطور با فرهنگ جدید سازگار شد؟", "چند کلمه یاد گرفت و رسوم محلی را رعایت کرد."),
                ComprehensionQuestion("غذای مورد علاقه B در ژاپن چه بود؟", "سوشی و رامن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a place you've visited.",
                    "درباره جایی که رفتی صحبت کن.",
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
    // CHAPTER 6 — In the City
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "In the City",
            titlePersian = "در شهر",
            objectives = listOf(
                "Talk about city life",
                "Use comparatives and superlatives",
                "Discuss pros and cons of city living",
                "Describe your city"
            ),
            vocabulary = listOf(
                VocabWord("city", "شهر", "/ˈsɪti/", "noun",
                    "I love the city.", "عاشق شهرم."),
                VocabWord("suburb", "حومه", "/ˈsʌbɜːrb/", "noun",
                    "They live in the suburbs.", "در حومه زندگی می‌کنن."),
                VocabWord("downtown", "مرکز شهر", "/ˌdaʊnˈtaʊn/", "noun",
                    "Let's go downtown.", "بیا بریم مرکز شهر."),
                VocabWord("crowded", "شلوغ", "/ˈkraʊdɪd/", "adjective",
                    "The city is crowded.", "شهر شلوغه."),
                VocabWord("noisy", "پرسروصدا", "/ˈnɔɪzi/", "adjective",
                    "It's too noisy.", "خیلی پرسروصداست."),
                VocabWord("peaceful", "آرام", "/ˈpiːsfəl/", "adjective",
                    "The suburbs are peaceful.", "حومه آرامه."),
                VocabWord("transport", "حمل و نقل", "/ˈtrænspɔːrt/", "noun",
                    "Public transport is convenient.", "حمل و نقل عمومی راحته."),
                VocabWord("convenient", "راحت", "/kənˈviːniənt/", "adjective",
                    "The location is convenient.", "موقعیت راحته."),
                VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun",
                    "City pollution is a problem.", "آلودگی شهر مشکلسازه."),
                VocabWord("cost of living", "هزینه زندگی", "/kɔːst əv ˈlɪvɪŋ/", "noun",
                    "The cost of living is high.", "هزینه زندگی بالاست."),
                VocabWord("amenities", "امکانات", "/əˈmenətiz/", "noun",
                    "The city has many amenities.", "شهر امکانات زیادی داره."),
                VocabWord("atmosphere", "فضا", "/ˈætməsfɪr/", "noun",
                    "I love the atmosphere here.", "فضای اینجا رو دوست دارم.")
            ),
            idioms = listOf(
                IdiomExpression("the big city", "شهر بزرگ",
                    "She moved to the big city.", "به شهر بزرگ نقل مکان کرد.", "informal"),
                IdiomExpression("concrete jungle", "جنگل بتنی",
                    "New York is a concrete jungle.", "نیویورک یه جنگل بتنیه.", "idiom"),
                IdiomExpression("bright lights", "چراغ‌های روشن شهر",
                    "He was attracted to the bright lights.", "به چراغ‌های روشن شهر جذب شد.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("suburb",
                    "suburb /ˈsʌbɜːrb/ — دو سیلاب."),
                PronunciationTip("convenient",
                    "convenient /kənˈviːniənt/.")
            ),
            culturalNotes = listOf(
                CulturalNote("City vs suburb",
                    "انتخاب بین زندگی شهری و حومه مهمه."),
                CulturalNote("Urbanization",
                    "شهرنشینی در حال افزایشه.")
            ),
            grammar = listOf(
                GrammarSection("Comparatives",
                    """
                        The city is busier than the suburbs.
                        The suburbs are quieter than downtown.
                    """.trimIndent()),
                GrammarSection("Superlatives",
                    """
                        Tokyo is one of the biggest cities.
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
                CommonMistake("The city is more busy.", "The city is busier.", "صفت کوتاه: -er."),
                CommonMistake("There is many shops.", "There are many shops.", "جمع = there are."),
                CommonMistake("I've lived here since 5 years.", "I've lived here for 5 years.", "for مدت، since نقطه شروع.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you prefer the city or the suburbs?", "شهر رو ترجیح می‌دی یا حومه؟"),
                DialogueLine("B", "I prefer the city. There's always something to do.", "شهر. همیشه چیزی برای انجام دادن هست."),
                DialogueLine("A", "But isn't it too noisy?", "ولی خیلی پرسروصدا نیست؟"),
                DialogueLine("B", "Sometimes. But the convenience is worth it.", "گاهی. ولی راحتی‌اش ارزشش رو داره."),
                DialogueLine("A", "What do you like most?", "چی بیشتر دوست داری؟"),
                DialogueLine("B", "Public transport, restaurants, and cultural events.", "حمل و نقل عمومی، رستوران و رویدادهای فرهنگی."),
                DialogueLine("A", "What about the cost of living?", "هزینه زندگی چطور؟"),
                DialogueLine("B", "It's high, honestly. Rent takes most of my salary.", "صادقانه بالاست."),
                DialogueLine("A", "Do you ever think about the suburbs?", "تا حالا به حومه فکر کرده‌ای؟"),
                DialogueLine("B", "Sometimes. The suburbs are quieter and more peaceful.", "گاهی. حومه ساکت‌تر و آرام‌تره."),
                DialogueLine("A", "But then you'd need a car.", "ولی اون موقع ماشین لازم داری."),
                DialogueLine("B", "True. It's a trade-off.", "درسته. یه معاوضه‌ست."),
                DialogueLine("A", "Which city do you think is the best?", "کدوم شهر بهترینه؟"),
                DialogueLine("B", "I've heard Tokyo is amazing.", "شنیده‌ام توکیو فوق‌العاده‌ست."),
                DialogueLine("A", "Me too. It's one of the biggest cities.", "منم. یکی از بزرگ‌ترین شهرهای جهانه."),
                DialogueLine("B", "Maybe one day. For now, I'm happy here.", "شاید یه روز. فعلاً اینجا خوشحالم."),
                DialogueLine("A", "That's what matters.", "همین مهمه."),
                DialogueLine("B", "Exactly.", "دقیقاً.")
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
                WritingTask("Write about the pros and cons of city life.",
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
    // CHAPTER 7 — Communication
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Communication",
            titlePersian = "ارتباطات",
            objectives = listOf(
                "Talk about communication",
                "Use reported speech",
                "Discuss technology and communication",
                "Express opinions"
            ),
            vocabulary = listOf(
                VocabWord("communicate", "ارتباط برقرار کردن", "/kəˈmjuːnɪkeɪt/", "verb",
                    "We communicate in many ways.", "به روش‌های زیادی ارتباط برقرار می‌کنیم."),
                VocabWord("message", "پیام", "/ˈmesɪdʒ/", "noun",
                    "I sent you a message.", "بهت پیام فرستادم."),
                VocabWord("text", "پیامک", "/tekst/", "noun/verb",
                    "She texted me yesterday.", "دیروز بهم پیام داد."),
                VocabWord("call", "تماس", "/kɔːl/", "noun/verb",
                    "I'll call you later.", "بعداً بهت زنگ می‌زنم."),
                VocabWord("email", "ایمیل", "/ˈiːmeɪl/", "noun",
                    "Send me an email.", "برام ایمیل بفرست."),
                VocabWord("social media", "شبکه اجتماعی", "/ˈsoʊʃəl ˈmiːdiə/", "noun",
                    "Social media is everywhere.", "شبکه‌های اجتماعی همه‌جا هستن."),
                VocabWord("platform", "پلتفرم", "/ˈplætfɔːrm/", "noun",
                    "There are many platforms.", "پلتفرم‌های زیادی هست."),
                VocabWord("privacy", "حریم خصوصی", "/ˈpraɪvəsi/", "noun",
                    "Privacy is important.", "حریم خصوصی مهمه."),
                VocabWord("misinformation", "اطلاعات نادرست", "/ˌmɪsɪnfərˈmeɪʃən/", "noun",
                    "Misinformation spreads fast.", "اطلاعات نادرست سریع پخش می‌شه."),
                VocabWord("influence", "تأثیر گذاشتن", "/ˈɪnfluəns/", "verb",
                    "Influencers have big influence.", "اینفلوئنسرها تأثیر بزرگی دارن."),
                VocabWord("content", "محتوا", "/ˈkɑːntent/", "noun",
                    "Quality content matters.", "محتوای باکیفیت مهمه."),
                VocabWord("audience", "مخاطب", "/ˈɔːdiəns/", "noun",
                    "Know your audience.", "مخاطبت رو بشناس.")
            ),
            idioms = listOf(
                IdiomExpression("word of mouth", "شفاهی",
                    "The news spread by word of mouth.", "خبر شفاهی پخش شد.", "neutral"),
                IdiomExpression("get the message", "پیام را گرفتن",
                    "I got the message clearly.", "پیام را واضح گرفتم.", "informal"),
                IdiomExpression("break the news", "خبر را گفتن",
                    "She broke the news gently.", "خبر را با ملایمت گفت.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("communication",
                    "communication /kəˌmjuːnɪˈkeɪʃən/ — استرس روی ca."),
                PronunciationTip("information",
                    "information /ˌɪnfərˈmeɪʃən/ — استرس روی ma.")
            ),
            culturalNotes = listOf(
                CulturalNote("Media literacy",
                    "سواد رسانه‌ای در غرب بخش مهمی از آموزشه."),
                CulturalNote("Digital privacy",
                    "حریم خصوصی دیجیتال دغدغه بزرگیه.")
            ),
            grammar = listOf(
                GrammarSection("Reported speech",
                    """
                        He said that he was busy.
                        She told me she would come.
                        They asked if I was ready.
                    """.trimIndent()),
                GrammarSection("Reporting verbs",
                    """
                        claim, admit, deny, suggest, promise, warn

                        She admitted that she was wrong.
                    """.trimIndent()),
                GrammarSection("Passive in media",
                    """
                        The news was reported yesterday.
                        The article has been published.
                    """.trimIndent()),
                GrammarSection("Expressing opinions",
                    """
                        I think social media...
                        In my opinion...
                        It seems to me that...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("He said me...", "He told me...", "tell + ضمیر مفعولی."),
                CommonMistake("He said he will come.", "He said he would come.", "will → would."),
                CommonMistake("The news are important.", "The news is important.", "news غیرقابل شمارش.")
            ),
            conversation = listOf(
                DialogueLine("A", "How do you usually get your news?", "معمولاً اخبار رو از کجا می‌گیری؟"),
                DialogueLine("B", "Mostly social media. What about you?", "بیشتر شبکه‌های اجتماعی. تو چطور؟"),
                DialogueLine("A", "I use a mix. I check multiple sources.", "ترکیبی. چند منبع رو چک می‌کنم."),
                DialogueLine("B", "That's smart. There's so much misinformation.", "هوشمندانه‌ست. اطلاعات نادرست زیاد شده."),
                DialogueLine("A", "Do you trust social media?", "به شبکه‌های اجتماعی اعتماد داری؟"),
                DialogueLine("B", "Only partly. I verify things before sharing.", "فقط تا حدی. قبل از به اشتراک گذاشتن تأیید می‌کنم."),
                DialogueLine("A", "What about influencers?", "اینفلوئنسرها چطور؟"),
                DialogueLine("B", "Some are great, some spread misinformation.", "بعضی عالی هستن، بعضی اطلاعات نادرست پخش می‌کنن."),
                DialogueLine("A", "Should governments regulate platforms?", "دولت‌ها باید پلتفرم‌ها رو تنظیم کنن؟"),
                DialogueLine("B", "Maybe to a degree. Balance is important.", "شاید تا حدی. تعادل مهمه."),
                DialogueLine("A", "What about privacy?", "حریم خصوصی چطور؟"),
                DialogueLine("B", "Companies collect too much data.", "شرکت‌ها داده‌های زیادی جمع می‌کنن."),
                DialogueLine("A", "We should be more careful.", "باید محتاط‌تر باشیم."),
                DialogueLine("B", "Being aware is the first step.", "آگاه بودن اولین قدمه."),
                DialogueLine("A", "What advice would you give?", "چه توصیه‌ای می‌کنی؟"),
                DialogueLine("B", "Check sources, think critically, limit screen time.", "منابع رو چک کن، انتقادی فکر کن، زمان صفحه رو محدود کن."),
                DialogueLine("A", "Great advice. Thanks for sharing.", "توصیه عالی. ممنون."),
                DialogueLine("B", "Anytime. Stay informed!", "هر وقت. آگاه بمون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B اخبار را از کجا می‌گیرد؟", "شبکه‌های اجتماعی."),
                ComprehensionQuestion("B قبل از به اشتراک گذاشتن چیکار می‌کند؟", "تأیید می‌کند."),
                ComprehensionQuestion("نگرانی اصلی B چیست؟", "حریم خصوصی و اطلاعات نادرست."),
                ComprehensionQuestion("توصیه B چیست؟", "چک منابع، تفکر انتقادی، محدود کردن زمان صفحه.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss media in your life.",
                    "درباره رسانه در زندگی‌ات صحبت کن.",
                    "I use... / I check..."),
                SpeakingTask("Express opinions on social media.",
                    "نظرت را درباره شبکه‌های اجتماعی بیان کن.",
                    "I think... / In my opinion...")
            ),
            writingTasks = listOf(
                WritingTask("Write about the pros and cons of social media.",
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
                "Discuss learning",
                "Talk about future education"
            ),
            vocabulary = listOf(
                VocabWord("education", "آموزش", "/ˌedʒuˈkeɪʃən/", "noun",
                    "Education is important.", "آموزش مهمه."),
                VocabWord("degree", "مدرک", "/dɪˈɡriː/", "noun",
                    "She has a degree in law.", "مدرک حقوق داره."),
                VocabWord("university", "دانشگاه", "/ˌjuːnɪˈvɜːrsəti/", "noun",
                    "He studies at university.", "در دانشگاه درس می‌خونه."),
                VocabWord("course", "دوره", "/kɔːrs/", "noun",
                    "I'm taking an online course.", "دارم یه دوره آنلاین می‌گذرونم."),
                VocabWord("exam", "امتحان", "/ɪɡˈzæm/", "noun",
                    "I have an exam tomorrow.", "فردا امتحان دارم."),
                VocabWord("pass", "قبول شدن", "/pæs/", "verb",
                    "I passed the exam!", "امتحان رو قبول شدم!"),
                VocabWord("fail", "رد شدن", "/feɪl/", "verb",
                    "He failed the test.", "در آزمون رد شد."),
                VocabWord("graduate", "فارغ‌التحصیل شدن", "/ˈɡrædʒueɪt/", "verb",
                    "She graduated last year.", "سال پیش فارغ‌التحصیل شد."),
                VocabWord("scholarship", "بورسیه", "/ˈskɑːlərʃɪp/", "noun",
                    "He got a scholarship.", "بورسیه گرفت."),
                VocabWord("knowledge", "دانش", "/ˈnɑːlɪdʒ/", "noun",
                    "Knowledge is power.", "دانش قدرته."),
                VocabWord("subject", "درس", "/ˈsʌbdʒɪkt/", "noun",
                    "Math is my favorite subject.", "ریاضی درس مورد علاقه‌مه."),
                VocabWord("skill", "مهارت", "/skɪl/", "noun",
                    "Communication is a key skill.", "ارتباطات یه مهارت کلیدیه.")
            ),
            idioms = listOf(
                IdiomExpression("hit the books", "درس خواندن",
                    "I need to hit the books tonight.", "امشب باید درس بخونم.", "informal"),
                IdiomExpression("learn by heart", "حفظ کردن",
                    "She learned the poem by heart.", "شعر رو حفظ کرد.", "neutral"),
                IdiomExpression("pass with flying colors", "با نمره عالی قبول شدن",
                    "He passed with flying colors.", "با نمره عالی قبول شد.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("education",
                    "education /ˌedʒuˈkeɪʃən/ — استرس روی ca."),
                PronunciationTip("university",
                    "university /ˌjuːnɪˈvɜːrsəti/ — پنج سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Education systems",
                    "سیستم آموزشی در کشورها متفاوته."),
                CulturalNote("Lifelong learning",
                    "یادگیری مادام‌العمر در غرب ارزشمنده.")
            ),
            grammar = listOf(
                GrammarSection("First conditional",
                    """
                        If + present simple, will + verb

                        If I study hard, I will pass.
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
                    """.trimIndent()),
                GrammarSection("Future plans",
                    """
                        I'm going to apply for a scholarship.
                        I'll continue my studies next year.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If I will study, I pass.", "If I study, I will pass.", "در if از present simple."),
                CommonMistake("If I was rich...", "If I were rich...", "در second conditional از were."),
                CommonMistake("I have graduated last year.", "I graduated last year.", "زمان مشخص = simple past.")
            ),
            conversation = listOf(
                DialogueLine("A", "What are you studying?", "چی می‌خونی؟"),
                DialogueLine("B", "I'm studying economics at university.", "اقتصاد در دانشگاه می‌خونم."),
                DialogueLine("A", "How's it going?", "چطور پیش می‌ره؟"),
                DialogueLine("B", "It's challenging but interesting.", "چالش‌برانگیزه ولی جالب."),
                DialogueLine("A", "What do you want to do after graduation?", "بعد از فارغ‌التحصیلی چیکار می‌خوای بکنی؟"),
                DialogueLine("B", "I'd like to work in finance or continue studying.", "دوست دارم در مالی کار کنم یا ادامه تحصیل بدم."),
                DialogueLine("A", "Have you thought about a master's?", "به فوق لیسانس فکر کرده‌ای؟"),
                DialogueLine("B", "Yes. If I get good grades, I'll apply for a scholarship.", "بله. اگه نمره‌های خوبی بگیرم، برای بورسیه درخواست می‌دم."),
                DialogueLine("A", "What about languages?", "زبان چطور؟"),
                DialogueLine("B", "I've been learning English for years.", "سال‌هاست انگلیسی یاد می‌گیرم."),
                DialogueLine("A", "If I had more time, I'd learn another language too.", "اگه وقت بیشتری داشتم، منم یه زبان دیگه یاد می‌گرفتم."),
                DialogueLine("B", "You should! It's never too late.", "باید بکنی! هیچ‌وقت دیر نیست."),
                DialogueLine("A", "What's your favorite subject?", "درس مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "I love statistics.", "عاشق آمارم."),
                DialogueLine("A", "What's the hardest?", "سخت‌ترین چیه؟"),
                DialogueLine("B", "Calculus. I have to hit the books for it.", "حساب دیفرانسیل. باید براش درس بخونم."),
                DialogueLine("A", "Good luck with your studies!", "برای تحصیلت موفق باشی!"),
                DialogueLine("B", "Thanks! You too!", "ممنون! تو هم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه رشته‌ای می‌خواند؟", "اقتصاد."),
                ComprehensionQuestion("B بعد از فارغ‌التحصیلی چه برنامه‌ای دارد؟", "کار در مالی یا ادامه تحصیل."),
                ComprehensionQuestion("B چه زبانی می‌خواهد بعد یاد بگیرد؟", "احتمالاً اسپانیایی."),
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
    // CHAPTER 9 — Personal Growth
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
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
                    "Personal growth takes time.", "رشد شخصی زمان می‌بره."),
                VocabWord("self-awareness", "خودآگاهی", "/ˌself əˈwernəs/", "noun",
                    "Self-awareness is the first step.", "خودآگاهی اولین قدمه."),
                VocabWord("mindset", "ذهنیت", "/ˈmaɪndset/", "noun",
                    "A positive mindset helps.", "ذهنیت مثبت کمک می‌کنه."),
                VocabWord("habit", "عادت", "/ˈhæbɪt/", "noun",
                    "Good habits change lives.", "عادت‌های خوب زندگی رو تغییر می‌دن."),
                VocabWord("discipline", "نظم", "/ˈdɪsəplɪn/", "noun",
                    "Discipline is key.", "نظم کلیدیه."),
                VocabWord("reflection", "بازنگری", "/rɪˈflekʃən/", "noun",
                    "Take time for reflection.", "برای بازنگری وقت بذار."),
                VocabWord("improvement", "بهبود", "/ɪmˈpruːvmənt/", "noun",
                    "Small improvements matter.", "بهبودهای کوچک مهمن."),
                VocabWord("failure", "شکست", "/ˈfeɪljər/", "noun",
                    "Failure teaches us.", "شکست به ما می‌آموزه."),
                VocabWord("resilience", "تاب‌آوری", "/rɪˈzɪliəns/", "noun",
                    "Resilience helps us recover.", "تاب‌آوری به بهبودی کمک می‌کنه."),
                VocabWord("purpose", "هدف", "/ˈpɜːrpəs/", "noun",
                    "Find your purpose.", "هدفت رو پیدا کن."),
                VocabWord("balance", "تعادل", "/ˈbæləns/", "noun",
                    "Life balance is important.", "تعادل زندگی مهمه."),
                VocabWord("gratitude", "سپاسگزاری", "/ˈɡrætɪtuːd/", "noun",
                    "Practice gratitude daily.", "هر روز سپاسگزاری کن.")
            ),
            idioms = listOf(
                IdiomExpression("turn over a new leaf", "شروع تازه کردن",
                    "He turned over a new leaf.", "او یه شروع تازه کرد.", "idiom"),
                IdiomExpression("grow as a person", "به عنوان یک شخص رشد کردن",
                    "Travel helps you grow as a person.", "سفر به رشد شخصی کمک می‌کنه.", "neutral"),
                IdiomExpression("learn the hard way", "با سختی یاد گرفتن",
                    "I learned the hard way.", "با سختی یاد گرفتم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("resilience",
                    "resilience /rɪˈzɪliəns/ — استرس روی zi."),
                PronunciationTip("gratitude",
                    "gratitude /ˈɡrætɪtuːd/ — سه سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Self-help culture",
                    "فرهنگ خودیاری در غرب رایجه."),
                CulturalNote("Therapy",
                    "تراپی در غرب عادیه.")
            ),
            grammar = listOf(
                GrammarSection("Wish + past simple",
                    """
                        I wish I had more time.
                        She wishes she could travel more.
                    """.trimIndent()),
                GrammarSection("Wish + past perfect",
                    """
                        I wish I had studied harder.
                        He wishes he hadn't quit.
                    """.trimIndent()),
                GrammarSection("Regret + verb-ing",
                    """
                        I regret not traveling more.
                        She regrets leaving her job.
                    """.trimIndent()),
                GrammarSection("Present perfect for growth",
                    """
                        I've grown a lot this year.
                        She's become more confident.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I wish I have more time.", "I wish I had more time.", "wish + past simple."),
                CommonMistake("I regret to leave.", "I regret leaving.", "regret + verb-ing."),
                CommonMistake("I wish I didn't do that.", "I wish I hadn't done that.", "برای گذشته: past perfect.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you grown as a person this year?", "امسال به عنوان یه شخص رشد کردی؟"),
                DialogueLine("B", "Definitely. I've learned so much about myself.", "قطعاً. چیزهای زیادی درباره خودم یاد گرفتم."),
                DialogueLine("A", "What helped you grow?", "چی به رشدت کمک کرد؟"),
                DialogueLine("B", "Challenges. A hard year made me stronger.", "چالش‌ها. سال سخت قوی‌ترم کرد."),
                DialogueLine("A", "What do you wish you had done differently?", "ای کاش چه کاری متفاوت انجام داده بودی؟"),
                DialogueLine("B", "I wish I had asked for help sooner.", "ای کاش زودتر کمک خواسته بودم."),
                DialogueLine("A", "Do you regret anything?", "پشیمانی داری؟"),
                DialogueLine("B", "I regret not starting therapy earlier.", "پشیمانم که زودتر تراپی رو شروع نکردم."),
                DialogueLine("A", "What are your goals now?", "اهدافت الان چیه؟"),
                DialogueLine("B", "To be more present and practice gratitude.", "حاضرتر بودن و سپاسگزاری کردن."),
                DialogueLine("A", "Do you have a routine?", "روتین داری؟"),
                DialogueLine("B", "Yes. I journal every morning and exercise.", "بله. هر صبح ژورنال می‌نویسم و ورزش می‌کنم."),
                DialogueLine("A", "What keeps you motivated?", "چی بهت انگیزه می‌ده؟"),
                DialogueLine("B", "Remembering why I started.", "یادم میاد چرا شروع کردم."),
                DialogueLine("A", "What would you tell your younger self?", "به خودتِ جوان‌تر چی می‌گفتی؟"),
                DialogueLine("B", "Don't be afraid to fail.", "از شکست نترس."),
                DialogueLine("A", "That's powerful.", "این قدرتمنده."),
                DialogueLine("B", "We all learn the hard way sometimes.", "ما همه گاهی با سختی یاد می‌گیریم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور رشد کرده؟", "از طریق چالش‌ها."),
                ComprehensionQuestion("B چه پشیمانی دارد؟", "زودتر کمک نخواستن و تراپی را شروع نکردن."),
                ComprehensionQuestion("اهداف B چیست؟", "حاضرتر بودن و سپاسگزاری."),
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
                    "درباره اینکه چطور رشد کرده‌ای بنویس.",
                    180,
                    "Use wish, regret, and present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I wish I ___ more time.",
                    listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: I wish I ___ studied harder.",
                    listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: I regret ___ my job.",
                    listOf("leave", "leaving", "to leave", "left"), 1),
                QuizQuestion("What does 'turn over a new leaf' mean?",
                    listOf("برگ زدن", "شروع تازه کردن", "برگ ریختن", "کتاب خواندن"), 1),
                QuizQuestion("Complete: I've ___ a lot this year.",
                    listOf("grow", "grew", "grown", "growing"), 2),
                QuizQuestion("What does 'learn the hard way' mean?",
                    listOf("با آسانی یاد گرفتن", "با سختی یاد گرفتن", "به کسی یاد دادن", "درس خواندن"), 1),
                QuizQuestion("Complete: She ___ leaving her job.",
                    listOf("regret", "regrets", "regretting", "regretted"), 1),
                QuizQuestion("Complete: He wishes he ___ quit.",
                    listOf("didn't", "hadn't", "hasn't", "won't"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 10 — The Environment
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "The Environment",
            titlePersian = "محیط زیست",
            objectives = listOf(
                "Talk about the environment",
                "Use conditionals",
                "Discuss sustainability",
                "Express responsibility"
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
                VocabWord("waste", "زباله", "/weɪst/", "noun",
                    "Waste is a global problem.", "زباله مسئله جهانیه."),
                VocabWord("carbon footprint", "ردپای کربن", "/ˈkɑːrbən ˈfʊtprɪnt/", "noun",
                    "Reduce your carbon footprint.", "ردپای کربنت رو کم کن."),
                VocabWord("emission", "انتشار", "/ɪˈmɪʃən/", "noun",
                    "Emissions must be reduced.", "انتشارها باید کاهش یابند."),
                VocabWord("aware", "آگاه", "/əˈwer/", "adjective",
                    "Be aware of your impact.", "از تأثیرت آگاه باش."),
                VocabWord("responsibility", "مسئولیت", "/rɪˌspɑːnsəˈbɪləti/", "noun",
                    "We all have responsibility.", "همه مسئولیت داریم.")
            ),
            idioms = listOf(
                IdiomExpression("go green", "دوستدار محیط زیست شدن",
                    "Many companies are going green.", "بسیاری از شرکت‌ها سبز می‌شن.", "informal"),
                IdiomExpression("take responsibility", "مسئولیت پذیرفتن",
                    "We must take responsibility.", "باید مسئولیت بپذیریم.", "neutral"),
                IdiomExpression("walk the talk", "عمل کردن به حرف",
                    "If we care, we should walk the talk.", "اگه اهمیت می‌دیم، باید عمل کنیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("environment",
                    "environment /ɪnˈvaɪrənmənt/ — استرس روی vi."),
                PronunciationTip("sustainable",
                    "sustainable /səˈsteɪnəbəl/ — چهار سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Climate agreements",
                    "توافق‌نامه‌های اقلیمی در غرب مهمن."),
                CulturalNote("Green products",
                    "محصولات سبز در غرب محبوبند.")
            ),
            grammar = listOf(
                GrammarSection("First conditional",
                    """
                        If + present simple, will + verb

                        If we recycle, we will help the planet.
                        If you don't act, things will get worse.
                    """.trimIndent()),
                GrammarSection("Should for environment",
                    """
                        We should recycle more.
                        We shouldn't waste water.
                    """.trimIndent()),
                GrammarSection("Passive for environmental issues",
                    """
                        Forests are being destroyed.
                        Plastic is being thrown away.
                        Emissions must be reduced.
                    """.trimIndent()),
                GrammarSection("Imperatives for action",
                    """
                        Reduce, reuse, recycle.
                        Save energy and water.
                        Don't waste food.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If we will recycle, we help.", "If we recycle, we will help.", "در if از present simple."),
                CommonMistake("We should to protect.", "We should protect.", "بعد از should فعل ساده."),
                CommonMistake("Plastic is throwing.", "Plastic is being thrown.", "passive: be being + pp.")
            ),
            conversation = listOf(
                DialogueLine("A", "Are you worried about climate change?", "درباره تغییر اقلیم نگرانی؟"),
                DialogueLine("B", "Yes, it's one of the biggest problems.", "بله، یکی از بزرگ‌ترین مشکلاته."),
                DialogueLine("A", "What do you do for the environment?", "برای محیط زیست چیکار می‌کنی؟"),
                DialogueLine("B", "I recycle, save water, and use public transport.", "بازیافت، ذخیره آب، حمل و نقل عمومی."),
                DialogueLine("A", "Do you use renewable energy?", "از انرژی تجدیدپذیر استفاده می‌کنی؟"),
                DialogueLine("B", "Not yet, but I'm thinking about solar panels.", "هنوز نه، ولی به پنل خورشیدی فکر می‌کنم."),
                DialogueLine("A", "What does the future hold?", "فکر می‌کنی آینده چی داره؟"),
                DialogueLine("B", "If we don't act, it will get worse.", "اگه اقدام نکنیم، بدتر می‌شه."),
                DialogueLine("A", "What should we do first?", "اول باید چیکار کنیم؟"),
                DialogueLine("B", "Reduce waste, use green energy, educate people.", "کاهش زباله، انرژی سبز، آموزش مردم."),
                DialogueLine("A", "Should governments do more?", "دولت‌ها باید بیشتر انجام بدن؟"),
                DialogueLine("B", "Definitely. Policies make a difference.", "قطعاً. سیاست‌ها تفاوت ایجاد می‌کنن."),
                DialogueLine("A", "What about individuals?", "افراد چطور؟"),
                DialogueLine("B", "Small changes add up.", "تغییرات کوچک جمع می‌شن."),
                DialogueLine("A", "I'll do more.", "منم بیشتر انجام می‌دم."),
                DialogueLine("B", "Together we can make a difference.", "با هم می‌تونیم تفاوت ایجاد کنیم."),
                DialogueLine("A", "The planet needs us.", "سیاره به ما نیاز داره."),
                DialogueLine("B", "Let's protect it.", "بیا ازش محافظت کنیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B برای محیط زیست چیکار می‌کند؟", "بازیافت، ذخیره آب، حمل و نقل عمومی."),
                ComprehensionQuestion("B به چه چیزی فکر می‌کند؟", "پنل خورشیدی."),
                ComprehensionQuestion("B فکر می‌کند اگر اقدام نکنیم چه می‌شود؟", "بدتر می‌شود."),
                ComprehensionQuestion("B چه پیشنهادی برای آینده دارد؟", "کاهش زباله، انرژی سبز، آموزش.")
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
                WritingTask("Write about how to protect the environment.",
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
                    "Art expresses emotions.", "هنر احساسات را بیان می‌کند."),
                VocabWord("culture", "فرهنگ", "/ˈkʌltʃər/", "noun",
                    "Culture shapes identity.", "فرهنگ هویت را شکل می‌دهد."),
                VocabWord("tradition", "سنت", "/trəˈdɪʃən/", "noun",
                    "Traditions connect generations.", "سنت‌ها نسل‌ها را وصل می‌کنند."),
                VocabWord("performance", "اجرا", "/pərˈfɔːrməns/", "noun",
                    "The performance was amazing.", "اجرا فوق‌العاده بود."),
                VocabWord("exhibition", "نمایشگاه", "/ˌeksɪˈbɪʃən/", "noun",
                    "We visited an exhibition.", "از نمایشگاه بازدید کردیم."),
                VocabWord("heritage", "میراث", "/ˈherɪtɪdʒ/", "noun",
                    "Cultural heritage is precious.", "میراث فرهنگی ارزشمنده."),
                VocabWord("creative", "خلاق", "/kriˈeɪtɪv/", "adjective",
                    "Artists are creative.", "هنرمندان خلاقند."),
                VocabWord("inspire", "الهام بخشیدن", "/ɪnˈspaɪər/", "verb",
                    "Art inspires people.", "هنر الهام می‌بخشه."),
                VocabWord("masterpiece", "شاهکار", "/ˈmæstərpiːs/", "noun",
                    "This is a masterpiece.", "این یه شاهکاره."),
                VocabWord("perform", "اجرا کردن", "/pərˈfɔːrm/", "verb",
                    "She performs beautifully.", "زیبا اجرا می‌کنه."),
                VocabWord("appreciate", "قدردانی کردن", "/əˈpriːʃieɪt/", "verb",
                    "We should appreciate art.", "باید هنر رو قدردانی کنیم."),
                VocabWord("audience", "مخاطب", "/ˈɔːdiəns/", "noun",
                    "The audience loved it.", "مخاطب عاشقش شد.")
            ),
            idioms = listOf(
                IdiomExpression("state of the art", "پیشرفته‌ترین",
                    "The museum has state-of-the-art tech.", "موزه پیشرفته‌ترین تکنولوژی رو داره.", "neutral"),
                IdiomExpression("food for thought", "مایه تفکر",
                    "The film gave me food for thought.", "فیلم مایه تفکر داد.", "idiom"),
                IdiomExpression("a work of art", "اثر هنری",
                    "This building is a work of art.", "این ساختمان یه اثر هنریه.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("exhibition",
                    "exhibition /ˌeksɪˈbɪʃən/ — استرس روی bi."),
                PronunciationTip("masterpiece",
                    "masterpiece /ˈmæstərpiːs/ — استرس روی mas.")
            ),
            culturalNotes = listOf(
                CulturalNote("Museums",
                    "موزه‌ها در غرب بخش مهمی از فرهنگند."),
                CulturalNote("Cultural heritage",
                    "حفاظت از میراث فرهنگی اولویت داره.")
            ),
            grammar = listOf(
                GrammarSection("Inversion for emphasis",
                    """
                        Rarely have I seen such beauty.
                        Never before had we experienced this.
                        Not only is it beautiful, but meaningful.
                    """.trimIndent()),
                GrammarSection("Passive for art",
                    """
                        The painting was created in 1900.
                        The symphony has been performed many times.
                    """.trimIndent()),
                GrammarSection("Expressing appreciation",
                    """
                        I really appreciate...
                        It's truly remarkable.
                        What a masterpiece!
                    """.trimIndent()),
                GrammarSection("Cleft sentences for art",
                    """
                        What impressed me was the colors.
                        It was the music that moved me.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The painting was create in 1900.", "The painting was created in 1900.", "past participle."),
                CommonMistake("It was the music what moved me.", "It was the music that moved me.", "it-cleft با that."),
                CommonMistake("Rarely I have seen...", "Rarely have I seen...", "inversion نیاز داره.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you enjoy art?", "از هنر لذت می‌بری؟"),
                DialogueLine("B", "Very much. It's food for thought.", "خیلی زیاد. مایه تفکره."),
                DialogueLine("A", "What kind of art do you like?", "چه نوع هنری دوست داری؟"),
                DialogueLine("B", "I love paintings and music.", "عاشق نقاشی و موسیقیم."),
                DialogueLine("A", "Have you seen any good performances lately?", "اخیراً اجرای خوبی دیدی؟"),
                DialogueLine("B", "Yes, I saw a play last month.", "بله، ماه پیش یه نمایش دیدم."),
                DialogueLine("A", "What impressed you most?", "چی بیشتر تحت تأثیرت قرار داد؟"),
                DialogueLine("B", "It was the acting that moved me.", "بازیگری بود که تحت تأثیرم کرد."),
                DialogueLine("A", "Rarely do we see such talent.", "به‌ندرت چنین استعدادی می‌بینیم."),
                DialogueLine("B", "Exactly. What about museums?", "دقیقاً. موزه‌ها چطور؟"),
                DialogueLine("A", "I love them. Cultural heritage is precious.", "عاشقشونم. میراث فرهنگی ارزشمنده."),
                DialogueLine("B", "Which museum is your favorite?", "کدوم موزه مورد علاقه‌اته؟"),
                DialogueLine("A", "The Louvre. It's a masterpiece itself.", "لوور. خودش یه شاهکاره."),
                DialogueLine("B", "I'd love to go.", "دوست دارم برم."),
                DialogueLine("A", "Start with the Mona Lisa.", "با مونالیزا شروع کن."),
                DialogueLine("B", "Thanks for the tip.", "ممنون برای راهنمایی."),
                DialogueLine("A", "Art is meant to be appreciated slowly.", "هنر باید آروم قدردانی بشه."),
                DialogueLine("B", "Well said.", "خوب گفتی.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه نوع هنری را دوست دارد؟", "نقاشی و موسیقی."),
                ComprehensionQuestion("A از چه چیزی در نمایش لذت برد؟", "بازیگری."),
                ComprehensionQuestion("موزه مورد علاقه A چیست؟", "لوور."),
                ComprehensionQuestion("A چه توصیه‌ای برای دیدن هنر دارد؟", "آرام قدردانی کن.")
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
                    listOf("غذا برای فکر", "مایه تفکر", "فکر کردن", "غذا خوردن"), 1),
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
    // CHAPTER 12 — Review
    // ═══════════════════════════════════════════════════════════
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review",
            titlePersian = "مرور",
            objectives = listOf(
                "Review all grammar",
                "Practice conversations",
                "Use all structures",
                "Prepare for next level"
            ),
            vocabulary = listOf(
                VocabWord("review", "مرور", "/rɪˈvjuː/", "noun",
                    "Let's review the lesson.", "بیا درس رو مرور کنیم."),
                VocabWord("practice", "تمرین", "/ˈpræktɪs/", "noun",
                    "Practice makes perfect.", "تمرین باعث پیشرفت."),
                VocabWord("improve", "بهتر کردن", "/ɪmˈpruːv/", "verb",
                    "I want to improve.", "می‌خوام بهتر شم."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective",
                    "I feel confident.", "با اعتماد به نفس‌ام."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "You're making progress.", "داری پیشرفت می‌کنی."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "English is a fun challenge.", "انگلیسی چالش سرگرم‌کننده."),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun",
                    "It's OK to make mistakes.", "اشتباه کردن اشکالی نداره."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb",
                    "Continue practicing.", "تمرین رو ادامه بده."),
                VocabWord("succeed", "موفق شدن", "/səkˈsiːd/", "verb",
                    "You will succeed if you try.", "اگه تلاش کنی موفق می‌شی."),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun",
                    "Learning is a journey.", "یادگیری یه سفره."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "My goal is to speak English.", "هدفم صحبت کردن انگلیسیه."),
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun",
                    "The future is bright.", "آینده روشنه.")
            ),
            idioms = listOf(
                IdiomExpression("practice makes perfect", "تمرین باعث پیشرفت",
                    "Practice makes perfect — keep going!", "تمرین باعث پیشرفت — ادامه بده!", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد",
                    "Don't give up. Rome wasn't built in a day.", "تسلیم نشو. رم در یک روز ساخته نشد.", "idiom"),
                IdiomExpression("break a leg", "موفق باشی",
                    "Break a leg on your exam!", "در امتحانت موفق باشی!", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Intonation",
                    "در سؤال‌ها صدای پایان جمله بالا می‌رود."),
                PronunciationTip("Linking",
                    "در گفتار طبیعی، کلمات به هم می‌چسبند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Language learning",
                    "یادگیری زبان یک فرایند طولانیه."),
                CulturalNote("Mistakes",
                    "اشتباه کردن بخش طبیعی یادگیریه.")
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
                DialogueLine("A", "How's your English going?", "انگلیسی‌ت چطور پیش می‌ره؟"),
                DialogueLine("B", "Pretty well! I've been practicing every day.", "خیلی خوب! هر روز تمرین کرده‌ام."),
                DialogueLine("A", "Do you feel more confident?", "با اعتماد به نفس‌تری؟"),
                DialogueLine("B", "Yes, much more.", "بله، خیلی بیشتر."),
                DialogueLine("A", "What was the hardest part?", "سخت‌ترین قسمت چی بود؟"),
                DialogueLine("B", "Probably the grammar.", "احتمالاً گرامر."),
                DialogueLine("A", "What helped you most?", "چی بیشتر کمک کرد؟"),
                DialogueLine("B", "Watching movies and talking to people.", "فیلم دیدن و صحبت با مردم."),
                DialogueLine("A", "What's your next goal?", "هدف بعدی‌ت چیه؟"),
                DialogueLine("B", "I want to be fluent in two years.", "می‌خوام در دو سال روان بشم."),
                DialogueLine("A", "How will you get there?", "چطور بهش می‌رسی؟"),
                DialogueLine("B", "Practice every day and take more classes.", "هر روز تمرین و کلاس بیشتر."),
                DialogueLine("A", "Good plan. Good luck!", "برنامه خوب. موفق باشی!"),
                DialogueLine("B", "Practice makes perfect.", "تمرین باعث پیشرفت."),
                DialogueLine("A", "Rome wasn't built in a day.", "رم در یک روز ساخته نشد."),
                DialogueLine("B", "True. I'll be patient.", "درسته. صبور خواهم بود."),
                DialogueLine("A", "That's the spirit!", "همین روحیه رو می‌خوام!"),
                DialogueLine("B", "Thanks for the encouragement.", "ممنون برای تشویق.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور انگلیسی‌اش را تقویت کرده؟", "تمرین روزانه، فیلم دیدن، صحبت با مردم."),
                ComprehensionQuestion("سخت‌ترین بخش برای B چه بود؟", "گرامر."),
                ComprehensionQuestion("هدف B چیست؟", "روان شدن در دو سال."),
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
}