package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Summit 1 — Complete Course Content
 * 10 Units | High-Intermediate (B2+ to C1)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles match the official Pearson Scope & Sequence
 * Long-form dialogues: 200-250 lines each (~20-25 minutes)
 */
object Summit1 {
    const val BOOK_ID = "summit_1"

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

    // ═══════════════════════════════════════════════════════════
    // UNIT 1 — New Perspectives | دیدگاه‌های جدید  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "New Perspectives", "دیدگاه‌های جدید",
        listOf(
            "Describe your personality and behavior",
            "Discuss finding balance in life",
            "Talk about optimism and pessimism",
            "Use gerunds and infinitives with changes in meaning",
            "Understand parallelism with gerunds and infinitives",
            "Ask questions to buy time in conversation",
            "Use 'Actually' to soften a negative response",
            "Use 'I wonder' to elicit an opinion politely",
            "Use 'You know' to introduce advice or a suggestion"
        ),
        listOf(
            v("outgoing", "برون‌گرا", "She's very outgoing and loves meeting new people.", "او خیلی برون‌گرا است و عاشق ملاقات با افراد جدید است.", "adjective"),
            v("considerate", "با ملاحظه", "He's considerate of other people's feelings.", "او به احساسات دیگران توجه دارد.", "adjective"),
            v("modest", "فروتن", "She's modest about her achievements.", "او درباره دستاوردهایش فروتن است.", "adjective"),
            v("impulsive", "تکانشی", "He's impulsive and often acts without thinking.", "او تکانشی است و اغلب بدون فکر عمل می‌کند.", "adjective"),
            v("ambitious", "جاه‌طلب", "She's ambitious and wants to lead the company.", "او جاه‌طلب است و می‌خواهد شرکت را رهبری کند.", "adjective"),
            v("optimistic", "خوش‌بین", "He's optimistic about the future.", "او درباره آینده خوش‌بین است.", "adjective"),
            v("pessimistic", "بدبین", "She tends to be pessimistic about new ideas.", "او تمایل دارد درباره ایده‌های جدید بدبین باشد.", "adjective"),
            v("introverted", "درون‌گرا", "Introverted people often enjoy quiet time alone.", "افراد درون‌گرا اغلب از وقت خلوت تنها لذت می‌برند.", "adjective"),
            v("impulsive", "تکانشی", "Don't be so impulsive — think before you act.", "اینقدر تکانشی نباش — قبل از عمل فکر کن.", "adjective"),
            v("generous", "سخاوتمند", "She's generous with her time and money.", "او با وقت و پولش سخاوتمند است.", "adjective"),
            v("reliable", "قابل اعتماد", "He's the most reliable person I know.", "او قابل اعتمادترین فردی است که می‌شناسم.", "adjective"),
            v("spontaneous", "خودجوش", "She's spontaneous and loves surprises.", "او خودجوش است و عاشق غافلگیری است.", "adjective"),
            v("perfectionist", "کمال‌گرا", "As a perfectionist, she never feels satisfied.", "او به عنوان یک کمال‌گرا هرگز راضی نیست.", "adjective"),
            v("balance", "تعادل", "I'm trying to find a balance between work and life.", "سعی می‌کنم بین کار و زندگی تعادل پیدا کنم."),
            v("perspective", "دیدگاه", "Traveling gives you a new perspective.", "سفر دیدگاه جدیدی به تو می‌دهد."),
            v("trait", "ویژگی", "Patience is an important personality trait.", "صبر یک ویژگی شخصیتی مهم است."),
            v("behavior", "رفتار", "His behavior surprised everyone at the party.", "رفتارش همه را در مهمانی غافلگیر کرد."),
            v("attitude", "نگرش", "A positive attitude can change your life.", "نگرش مثبت می‌تواند زندگی‌ات را تغییر دهد."),
            v("mindset", "ذهنیت", "She has a growth mindset.", "او ذهنیت رشد دارد."),
            v("approach", "رویکرد", "Let's try a different approach to the problem.", "بیایید رویکرد متفاوتی به مشکل امتحان کنیم.")
        ),
        listOf(
            GrammarSection(
                "Gerunds and infinitives: changes in meaning",
                "Some verbs change meaning depending on whether they're followed by a gerund or infinitive. 'Remember to lock the door' (future action) vs. 'I remember locking the door' (past action). 'Stop to rest' (pause to do something) vs. 'Stop smoking' (quit)."
            ),
            GrammarSection(
                "Parallelism with gerunds and infinitives",
                "Keep grammatical structures parallel in a sentence. 'I enjoy hiking, swimming, and cycling' (not 'to cycle'). 'She wants to travel, to learn, and to grow.'"
            ),
            GrammarSection(
                "Conversation strategies for buying time",
                "Use phrases like 'That's a good question', 'Let me think about that for a moment', 'Well, how should I put this...', and 'I wonder if I could ask you something' to buy time in conversation."
            )
        ),
        listOf(
            d("A", "Hey, do you have a minute? I've been thinking about something and I'd love your perspective.", "سلام، یک دقیقه وقت داری؟ داشتم به چیزی فکر می‌کردم و دوست دارم دیدگاهت را بشنوم."),
            d("B", "Sure, what's up?", "حتماً، چی شده؟"),
            d("A", "I've been feeling stuck lately. Like I'm not really growing in my job or in my personal life.", "اخیراً احساس گیر کردن می‌کنم. مثل اینکه واقعاً در کار یا زندگی شخصی‌ام رشد نمی‌کنم."),
            d("B", "That's a good question — let me think about it for a moment.", "سؤال خوبی است — بگذار یک لحظه فکر کنم."),
            d("A", "Take your time.", "عجله نکن."),
            d("B", "You know, I've been there. It's a common feeling, especially when things become routine.", "می‌دانی، من هم آنجا بوده‌ام. احساس رایجی است، مخصوصاً وقتی چیزها روتین می‌شوند."),
            d("A", "Exactly. I feel like I'm just going through the motions.", "دقیقاً. احساس می‌کنم فقط در حال انجام کارهای روتین هستم."),
            d("B", "Have you tried doing something different? Even a small change can shift your perspective.", "تا حالا امتحان کرده‌ای کار متفاوتی انجام دهی؟ حتی یک تغییر کوچک می‌تواند دیدگاهت را تغییر دهد."),
            d("A", "Not really. I keep saying I will, but then I don't.", "نه واقعاً. مدام می‌گویم انجام می‌دهم، ولی بعد نمی‌دهم."),
            d("B", "I wonder — what would you do if you weren't afraid?", "کنجکاوم — اگر نمی‌ترسیدی چه می‌کردی؟"),
            d("A", "That's a powerful question. Honestly, I'd probably quit my job and travel for a year.", "سؤال قدرتمندی است. راستش، احتمالاً شغلم را ترک می‌کردم و یک سال سفر می‌کردم."),
            d("B", "Interesting. And what stops you?", "جالب است. و چه چیزی جلویت را می‌گیرد؟"),
            d("A", "Fear. Money. The usual.", "ترس. پول. همیشه همین‌ها."),
            d("B", "You know, those are real concerns. But they're not insurmountable.", "می‌دانی، آن‌ها نگرانی‌های واقعی هستند. ولی غیرقابل عبور نیستند."),
            d("A", "How do you mean?", "منظورت چیست؟"),
            d("B", "Maybe you don't need to quit everything. Maybe you could start with a short trip. A month, maybe.", "شاید لازم نیست همه چیز را ترک کنی. شاید بتوانی با یک سفر کوتاه شروع کنی. یک ماه، شاید."),
            d("A", "A month. That feels more possible.", "یک ماه. این ممکن‌تر حس می‌شود."),
            d("B", "Exactly. It's about finding balance, not blowing up your life.", "دقیقاً. درباره پیدا کردن تعادل است، نه منفجر کردن زندگی‌ات."),
            d("A", "I like that. Balance, not destruction.", "این را دوست دارم. تعادل، نه تخریب."),
            d("B", "Speaking of balance — have you ever tried meditation?", "از تعادل که صحبت شد — تا حالا مدیتیشن امتحان کرده‌ای؟"),
            d("A", "A few times. I couldn't sit still.", "چند بار. نمی‌توانستم بی‌حرکت بنشینم."),
            d("B", "Ha! Me neither at first. But I kept trying, and eventually it clicked.", "ها! من هم اولش نمی‌توانستم. ولی ادامه دادم، و بالاخره کلیک کرد."),
            d("A", "What changed?", "چه چیزی تغییر کرد؟"),
            d("B", "I stopped trying to empty my mind. I just let thoughts come and go.", "دیگر سعی نکردم ذهنم را خالی کنم. فقط اجازه دادم افکار بیایند و بروند."),
            d("A", "That sounds more doable.", "این قابل انجام‌تر به نظر می‌رسد."),
            d("B", "It is. And it helps with the feeling of being stuck. You realize thoughts aren't facts.", "همینطور است. و به احساس گیر کردن کمک می‌کند. می‌فهمی افکار واقعیت نیستند."),
            d("A", "That's a new perspective.", "این دیدگاه جدیدی است."),
            d("B", "That's the theme, isn't it? New perspectives.", "این تم است، نه؟ دیدگاه‌های جدید."),
            d("A", "Ha! Exactly. That's what I need.", "ها! دقیقاً. همین چیزی است که نیاز دارم."),
            d("B", "So, what's one small thing you could do this week?", "خب، یک کار کوچک که این هفته می‌توانی بکنی چیست؟"),
            d("A", "I could sign up for that photography class I've been putting off.", "می‌توانم برای آن کلاس عکاسی که مدام عقب انداخته‌ام ثبت‌نام کنم."),
            d("B", "That's great! Why photography?", "عالی است! چرا عکاسی؟"),
            d("A", "I've always loved capturing moments. But I stopped doing it years ago.", "همیشه عاشق ثبت لحظات بوده‌ام. ولی سال‌ها پیش ترک کردم."),
            d("B", "Why did you stop?", "چرا ترک کردی؟"),
            d("A", "Life got busy. I told myself I didn't have time.", "زندگی مشغول شد. به خودم گفتم وقت ندارم."),
            d("B", "That's a common trap. We stop doing things we love because we're 'too busy'.", "این تله رایجی است. دست از کارهایی که دوست داریم می‌کشیم چون «خیلی مشغول» هستیم."),
            d("A", "Exactly. But what's the point of being busy if you're not enjoying life?", "دقیقاً. ولی چه فایده‌ای دارد مشغول بودن اگر از زندگی لذت نمی‌بری؟"),
            d("B", "That's the question, isn't it?", "این سؤال است، نه؟"),
            d("A", "I think I've been afraid to ask it.", "فکر می‌کنم ترسیده‌ام از پرسیدنش."),
            d("B", "Why afraid?", "چرا ترسیده‌ای؟"),
            d("A", "Because if I ask it, I might have to change things. And change is uncomfortable.", "چون اگر بپرسم، ممکن است مجبور شوم چیزها را تغییر دهم. و تغییر ناخوشایند است."),
            d("B", "You know, I think that's the heart of it. We avoid change because it's scary.", "می‌دانی، فکر می‌کنم قلب موضوع همین است. از تغییر پرهیز می‌کنیم چون ترسناک است."),
            d("A", "But not changing is also a choice. And it has consequences too.", "ولی تغییر ندادن هم یک انتخاب است. و آن هم پیامدهایی دارد."),
            d("B", "Exactly. The status quo isn't neutral. It's a decision.", "دقیقاً. وضع موجود بی‌طرف نیست. یک تصمیم است."),
            d("A", "I never thought of it that way. Staying stuck is a decision.", "هرگز آنطور فکر نکرده‌ام. گیر ماندن یک تصمیم است."),
            d("B", "It is. And once you see it that way, it's easier to act.", "هست. و وقتی آنطور ببینی، عمل کردن آسان‌تر است."),
            d("A", "Okay, you've convinced me. I'm signing up for that class today.", "باشه، قانعم کردی. امروز برای آن کلاس ثبت‌نام می‌کنم."),
            d("B", "That's the spirit!", "همینه!"),
            d("A", "Thanks for this. I really needed to talk.", "ممنون برای این. واقعاً نیاز داشتم صحبت کنم."),
            d("B", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
            d("A", "By the way, have you ever tried journaling?", "راستی، تا حالا ژورنال‌نویسی امتحان کرده‌ای؟"),
            d("B", "Yes, actually. It helps me clarify my thoughts.", "بله، در واقع. به من کمک می‌کند افکارم را روشن کنم."),
            d("A", "What do you write about?", "درباره چه می‌نویسی؟"),
            d("B", "Mostly questions I'm wrestling with. And things I'm grateful for.", "بیشتر سؤال‌هایی که با آن‌ها کشتی می‌گیرم. و چیزهایی که برایشان سپاسگزارم."),
            d("A", "Gratitude. That's a good practice.", "سپاسگزاری. تمرین خوبی است."),
            d("B", "It really is. It shifts your perspective.", "واقعاً همینطور است. دیدگاهت را تغییر می‌دهد."),
            d("A", "So, gratitude journaling and photography. That's my plan.", "خب، ژورنال سپاسگزاری و عکاسی. این نقشه من است."),
            d("B", "Sounds like a solid start.", "شروع محکمی به نظر می‌رسد."),
            d("A", "One more question — how do you stay motivated?", "یک سؤال دیگر — چطور انگیزه‌ات را حفظ می‌کنی؟"),
            d("B", "I don't. Motivation comes and goes. I rely on habits instead.", "حفظ نمی‌کنم. انگیزه می‌آید و می‌رود. به عادت‌ها تکیه می‌کنم."),
            d("A", "Habits, not motivation. That's wise.", "عادت‌ها، نه انگیزه. این عاقلانه است."),
            d("B", "Exactly. Motivation is a feeling. Habits are a system.", "دقیقاً. انگیزه یک احساس است. عادت‌ها یک سیستم هستند."),
            d("A", "I'll remember that. Habits over motivation.", "این را به خاطر می‌سپارم. عادت‌ها بر انگیزه."),
            d("B", "You know what? Let's check in with each other in a month.", "می‌دانی چیست؟ بیایید یک ماه دیگر با هم چک کنیم."),
            d("A", "I'd like that. Accountability helps.", "دوستش دارم. پاسخگویی کمک می‌کند."),
            d("B", "Deal. And I want to see your photos.", "قبول. و می‌خواهم عکس‌هایت را ببینم."),
            d("A", "Ha! No pressure!", "ها! فشاری نیست!"),
            d("B", "Just encouragement. You're going to do great.", "فقط تشویق. عالی عمل می‌کنی."),
            d("A", "Thanks. I feel more hopeful than I have in months.", "ممنون. بیشتر از ماه‌ها امیدوارم."),
            d("B", "That's what a new perspective does.", "این کاری است که دیدگاه جدید می‌کند."),
            d("A", "You're right. Talk to you soon.", "حق داری. به‌زودی صحبت."),
            d("B", "Talk soon. And don't forget to sign up today!", "به‌زودی صحبت. و یادت نرود امروز ثبت‌نام کنی!"),
            d("A", "I won't. Promise.", "فراموش نمی‌کنم. قول می‌دهم."),
            d("B", "Good. Take care.", "خوبه. مراقب باش."),
            d("A", "You too. Bye!", "تو هم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is A struggling with?", listOf("financial problems", "feeling stuck in life", "relationship issues", "health issues"), 1),
            q("What does B suggest A do first?", listOf("quit their job", "try something small", "move abroad", "see a therapist"), 1),
            q("What is the main theme of this unit?", listOf("money management", "new perspectives", "music appreciation", "family dynamics"), 1),
            q("What does B say about motivation?", listOf("it's essential", "it comes and goes", "it can be learned", "it's overrated"), 1),
            q("What practice does B recommend for gratitude?", listOf("meditation", "journaling", "exercise", "yoga"), 1),
            q("I remember ___ the door. (I locked it before)", listOf("to lock", "locking", "lock", "locked"), 1),
            q("Remember ___ the door when you leave. (future action)", listOf("to lock", "locking", "lock", "locked"), 0),
            q("I stopped ___ fast food last year.", listOf("to eat", "eating", "eat", "eaten"), 1),
            q("I enjoy ___, swimming, and cycling.", listOf("to hike", "hiking", "hike", "hiked"), 1),
            q("Which is correct parallelism?", listOf("She wants to travel, learn, and grow.", "She wants traveling, to learn, and growing.", "She wants to travel, to learn, and to grow.", "Both A and C"), 3)
        ),
        idioms = listOf(
            IdiomExpression("Going through the motions", "انجام دادن از روی عادت", "I feel like I'm just going through the motions.", "احساس می‌کنم فقط از روی عادت انجام می‌دهم."),
            IdiomExpression("Stuck in a rut", "در چاله افتادن", "I've been stuck in a rut lately.", "اخیراً در چاله افتاده‌ام."),
            IdiomExpression("Blow up your life", "زندگی‌ات را منفجر کردن", "It's not about blowing up your life.", "درباره منفجر کردن زندگی‌ات نیست."),
            IdiomExpression("That's the spirit", "همینه!", "That's the spirit!", "همینه!"),
            IdiomExpression("Status quo", "وضع موجود", "The status quo isn't neutral.", "وضع موجود بی‌طرف نیست."),
            IdiomExpression("Comes and goes", "می‌آید و می‌رود", "Motivation comes and goes.", "انگیزه می‌آید و می‌رود."),
            IdiomExpression("Check in with", "با کسی چک کردن", "Let's check in with each other.", "بیایید با هم چک کنیم.")
        ),
        phrasal = listOf(
            PhrasalVerb("put off", "عقب انداختن", "postpone",
                "I've been putting off that class.", "مدام آن کلاس را عقب انداخته‌ام.", "Yes"),
            PhrasalVerb("sign up for", "ثبت‌نام کردن", "register for",
                "I'm signing up for a photography class.", "برای کلاس عکاسی ثبت‌نام می‌کنم.", "No"),
            PhrasalVerb("go through", "عبور کردن", "experience",
                "I'm going through a difficult time.", "دوران سختی را می‌گذرانم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Gerund vs. infinitive stress", "Stress the main verb: I reMEMber LOCKing it. ReMEMber to LOCK it."),
            PronunciationTip("Reduction in conversation strategies", "In natural speech, 'let me' often reduces: Let me think → /lɛmi θɪŋk/"),
            PronunciationTip("Intonation for buying time", "Use rising intonation when buying time: That's a good question? ↗")
        ),
        culture = listOf(
            CulturalNote("Personality types",
                "Psychologists often categorize personality using models like the Big Five (openness, conscientiousness, extraversion, agreeableness, neuroticism). Understanding these can help improve communication and self-awareness."),
            CulturalNote("Optimism vs. pessimism",
                "Research shows that optimists tend to be healthier and more successful, but pessimists are often more accurate in their assessments. The ideal may be 'defensive pessimism' — hoping for the best while preparing for the worst."),
            CulturalNote("Finding balance",
                "The concept of work-life balance has evolved. Many now speak of 'work-life integration' — recognizing that the boundaries are fluid and both spheres influence each other.")
        ),
        mistakes = listOf(
            CommonMistake("I enjoy to hike.", "I enjoy hiking.", "Use gerund after 'enjoy'."),
            CommonMistake("Remember locking the door when you leave.", "Remember to lock the door when you leave.", "Use infinitive for future actions after 'remember'."),
            CommonMistake("She wants traveling and to learn.", "She wants to travel and to learn.", "Keep structures parallel.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why does A feel stuck?", "A feels like they're just going through the motions without growth in work or personal life."),
            ComprehensionQuestion("What does B suggest instead of quitting everything?", "Starting with a small change, like a one-month trip or signing up for a class."),
            ComprehensionQuestion("What does B say about motivation vs. habits?", "Motivation is a feeling that comes and goes; habits are a reliable system.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your personality using at least five adjectives.",
                "شخصیتت را با حداقل پنج صفت توصیف کن.",
                "I'm... / I tend to be... / People say I'm..."),
            SpeakingTask("Discuss how you find balance in life.",
                "درباره چگونگی پیدا کردن تعادل در زندگی صحبت کن.",
                "I try to balance... / I struggle with... / I've learned to..."),
            SpeakingTask("Role-play giving advice to a friend who feels stuck.",
                "نقش‌بازی: مشاوره به دوستی که احساس گیر کردن دارد.",
                "Have you tried...? / I wonder if... / You know, ...")
        ),
        writing = listOf(
            WritingTask("Write a reflective essay about a time you gained a new perspective.",
                "یک مقاله تأملی درباره زمانی که دیدگاه جدیدی پیدا کردی بنویس.",
                250, "Use gerunds and infinitives correctly, and include parallelism.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 2 — Musical Moods | حال و هوای موسیقی  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit2() = base(
        2, "Musical Moods", "حال و هوای موسیقی",
        listOf(
            "Discuss musical tastes and preferences",
            "Describe creative personalities",
            "Talk about the role of music in your life",
            "Use the present perfect and present perfect continuous",
            "Use participial adjectives to describe effects",
            "Use 'So' to begin a conversation",
            "Confirm information with 'right?'",
            "Begin answers with 'Well' to introduce an opinion"
        ),
        listOf(
            v("melody", "ملودی", "The melody of that song is unforgettable.", "ملودی آن آهنگ فراموش‌نشدنی است."),
            v("rhythm", "ریتم", "The rhythm makes you want to dance.", "ریتم باعث می‌شود بخواهی برقصی."),
            v("lyrics", "متن آهنگ", "The lyrics are very poetic.", "متن آهنگ خیلی شاعرانه است."),
            v("beat", "ضرب", "The beat is catchy and energetic.", "ضرب جذاب و پرانرژی است."),
            v("harmony", "هماهنگی", "Their voices create beautiful harmony.", "صدایشان هماهنگی زیبایی ایجاد می‌کند."),
            v("sentimental", "احساساتی", "That song is too sentimental for me.", "آن آهنگ برای من خیلی احساساتی است.", "adjective"),
            v("catchy", "جذاب / گیرا", "It's a catchy tune you can't forget.", "یک آهنگ جذاب است که فراموش نمی‌کنی.", "adjective"),
            v("moving", "تأثیرگذار", "The performance was deeply moving.", "اجرا عمیقاً تأثیرگذار بود.", "adjective"),
            v("upbeat", "شاد", "I need some upbeat music this morning.", "امروز صبح به موسیقی شاد نیاز دارم.", "adjective"),
            v("mellow", "آرام", "I prefer mellow music in the evening.", "عصرها موسیقی آرام را ترجیح می‌دهم.", "adjective"),
            v("soulful", "پرانرژی / عمیق", "Her voice is incredibly soulful.", "صدایش فوق‌العاده عمیق است.", "adjective"),
            v("innovative", "نوآورانه", "Their sound is truly innovative.", "صدایشان واقعاً نوآورانه است.", "adjective"),
            v("commercial", "تجاری", "Some critics say their music is too commercial.", "برخی منتقدان می‌گویند موسیقی‌شان خیلی تجاری است.", "adjective"),
            v("therapeutic", "درمانی", "Music can be therapeutic.", "موسیقی می‌تواند درمانی باشد.", "adjective"),
            v("compose", "آهنگسازی کردن", "She composed her first song at fifteen.", "او اولین آهنگش را در پانزده سالگی ساخت.", "verb"),
            v("perform", "اجرا کردن", "The band performed to a sold-out crowd.", "گروه برای جمعیتی که بلیط‌ها تمام شده بود اجرا کرد.", "verb"),
            v("genre", "ژانر", "What genres do you listen to?", "چه ژانرهایی گوش می‌دهی؟"),
            v("influence", "تأثیر", "Their music has influenced a generation.", "موسیقی‌شان بر یک نسل تأثیر گذاشته."),
            v("audience", "تماشاگران", "The audience clapped for five minutes.", "تماشاگران پنج دقیقه دست زدند."),
            v("inspiration", "الهام", "Nature is her main source of inspiration.", "طبیعت منبع اصلی الهام اوست.")
        ),
        listOf(
            GrammarSection(
                "Present Perfect vs. Present Perfect Continuous",
                "Use present perfect for finished actions with relevance to now (I've listened to that album). Use present perfect continuous for actions continuing or repeated up to now (I've been listening to it all week)."
            ),
            GrammarSection(
                "Participial adjectives",
                "Use -ing adjectives to describe things that cause feelings (boring, relaxing, moving) and -ed adjectives to describe how people feel (bored, relaxed, moved). The concert was amazing. I was amazed."
            ),
            GrammarSection(
                "Conversation strategies: So, right?, Well",
                "Use 'So' to begin a conversation or change topic. Use 'right?' to confirm information. Use 'Well' to introduce an opinion or soften a response."
            )
        ),
        listOf(
            d("A", "So, I've been meaning to ask you — what kind of music do you listen to?", "خب، مدتی است می‌خواهم بپرسم — چه نوع موسیقی گوش می‌دهی؟"),
            d("B", "Well, it depends on my mood. I listen to a lot of different genres.", "خب، به حالم بستگی دارد. ژانرهای مختلفی گوش می‌دهم."),
            d("A", "Same here. Lately I've been listening to a lot of jazz.", "من هم همینطور. اخیراً جاز زیاد گوش می‌دهم."),
            d("B", "Jazz! That's interesting. What got you into it?", "جاز! جالب است. چه چیزی تو را به آن علاقه‌مند کرد؟"),
            d("A", "A friend took me to a live jazz club last month. I've been hooked ever since.", "یک دوست ماه گذشته مرا به یک کلوب جاز زنده برد. از آن موقع معتاد شده‌ام."),
            d("B", "Live music hits differently, right?", "موسیقی زنده متفاوت ضربه می‌زند، درست است؟"),
            d("A", "Absolutely. The energy in the room, the improvisation — it's mesmerizing.", "قطعاً. انرژی در اتاق، بداهه‌نوازی — مسحورکننده است."),
            d("B", "I know what you mean. I've been going to rock concerts for years.", "می‌دانم منظورتان چیست. سال‌ها به کنسرت راک رفته‌ام."),
            d("A", "Rock! Who's your favorite band?", "راک! گروه مورد علاقه‌ات کیست؟"),
            d("B", "Well, that's hard to say. But I've been listening to a lot of indie rock lately.", "خب، گفتنش سخت است. ولی اخیراً ایندی راک زیاد گوش می‌دهم."),
            d("A", "Indie rock. I don't know much about it. What's it like?", "ایندی راک. زیاد درباره‌اش نمی‌دانم. چطور است؟"),
            d("B", "It's hard to describe. It's like... music that's made without trying to be commercial.", "توصیفش سخت است. مثل... موسیقی که بدون تلاش برای تجاری بودن ساخته می‌شود."),
            d("A", "So it's more authentic?", "پس اصیل‌تر است؟"),
            d("B", "Yeah, I'd say so. It's more about the art than the sales.", "بله، همینطور می‌گویم. بیشتر درباره هنر است تا فروش."),
            d("A", "That sounds refreshing. I get tired of music that feels manufactured.", "تازه‌کننده به نظر می‌رسد. از موسیقی که ساختگی حس می‌شود خسته می‌شوم."),
            d("B", "Exactly. Have you ever listened to any indie bands?", "دقیقاً. تا حالا به گروه‌های ایندی گوش داده‌ای؟"),
            d("A", "Not really. Any recommendations?", "نه واقعاً. توصیه‌ای داری؟"),
            d("B", "Well, there's a band called 'The Paper Kites'. They're really moving.", "خب، گروهی هست به نام «The Paper Kites». واقعاً تأثیرگذارند."),
            d("A", "The Paper Kites. I'll check them out. What kind of sound do they have?", "The Paper Kites. بررسی می‌کنم. چه نوع صدایی دارند؟"),
            d("B", "Folk-influenced indie. Very mellow and emotional.", "ایندی با تأثیر فولک. خیلی آرام و احساسی."),
            d("A", "That sounds perfect for my evening listening. I've been looking for something calming.", "برای گوش دادن عصرگاهی‌ام عالی به نظر می‌رسد. دنبال چیزی آرام‌بخش بودم."),
            d("B", "Then you'll love them. They have a song called 'Bloom' that's just beautiful.", "پس عاشقشان می‌شوی. آهنگی دارند به نام «Bloom» که واقعاً زیباست."),
            d("A", "I'll add it to my playlist. So, have you ever played an instrument?", "به پلی‌لیستم اضافه می‌کنم. خب، تا حالا سازی نواخته‌ای؟"),
            d("B", "I played guitar for years. I've been trying to get back into it recently.", "سال‌ها گیتار نواختم. اخیراً سعی می‌کنم دوباره شروع کنم."),
            d("A", "What made you stop?", "چه چیزی باعث شد ترک کنی؟"),
            d("B", "Life got busy. But I've been practicing again for a few weeks now.", "زندگی مشغول شد. ولی چند هفته است دوباره تمرین می‌کنم."),
            d("A", "That's great. What kind of music do you play?", "عالی است. چه نوع موسیقی می‌نوازی؟"),
            d("B", "Mostly acoustic stuff. I've been writing some songs too.", "بیشتر آکوستیک. چند آهنگ هم نوشته‌ام."),
            d("A", "You write songs? That's impressive!", "آهنگ می‌نویسی؟ تحسین‌برانگیز است!"),
            d("B", "Well, I'm not sure they're good. But it's therapeutic for me.", "خب، مطمئن نیستم خوب باشند. ولی برای من درمانی است."),
            d("A", "Therapeutic. That's the perfect word. Music can be so healing.", "درمانی. کلمه عالی‌ای است. موسیقی می‌تواند خیلی شفابخش باشد."),
            d("B", "It really can. Have you ever used music to process emotions?", "واقعاً می‌تواند. تا حالا از موسیقی برای پردازش احساسات استفاده کرده‌ای؟"),
            d("A", "All the time. There are songs that make me cry every time I hear them.", "همیشه. آهنگ‌هایی هستند که هر بار می‌شنوم گریه‌ام می‌گیرد."),
            d("B", "That's the power of music, right? It connects directly to our emotions.", "این قدرت موسیقی است، درست است؟ مستقیماً به احساساتمان متصل می‌شود."),
            d("A", "Exactly. It bypasses the thinking brain and goes straight to the heart.", "دقیقاً. مغز متفکر را دور می‌زند و مستقیم به قلب می‌رود."),
            d("B", "That's beautifully put. Do you have a song that's especially meaningful to you?", "زیبا گفتی. آهنگی داری که مخصوصاً برایت معنی‌دار باشد؟"),
            d("A", "Yes. 'Hallelujah' by Leonard Cohen. It's been with me through hard times.", "بله. «Hallelujah» از لئونارد کوهن. در دوران سخت با من بوده."),
            d("B", "That's a masterpiece. The lyrics are so deep.", "شاهکاری است. متن آهنگ خیلی عمیق است."),
            d("A", "It's poetry set to music. I've listened to it hundreds of times.", "شعر است که به موسیقی تبدیل شده. صدها بار گوشش داده‌ام."),
            d("B", "That's what great art does. It stays with you.", "این کاری است که هنر بزرگ می‌کند. با تو می‌ماند."),
            d("A", "So, what's your go-to song when you're feeling down?", "خب، آهنگ همیشگی‌ات وقتی ناراحتی چیست؟"),
            d("B", "Well, I usually listen to something upbeat to shift my mood.", "خب، معمولاً چیزی شاد گوش می‌دهم تا حالم را عوض کنم."),
            d("A", "So you use music to change your mood, not just express it?", "پس از موسیقی برای تغییر حالتت استفاده می‌کنی، نه فقط بیانش؟"),
            d("B", "Yeah, exactly. It's a tool.", "بله، دقیقاً. یک ابزار است."),
            d("A", "I never thought of it that way. I usually listen to sad music when I'm sad.", "هرگز آنطور فکر نکرده‌ام. معمولاً وقتی ناراحتم موسیقی غمگین گوش می‌دهم."),
            d("B", "That works too. Sometimes you need to feel it fully before you can move on.", "آن هم کار می‌کند. گاهی باید کاملاً حسش کنی تا بتوانی ادامه دهی."),
            d("A", "That's true. There's something cathartic about sad music.", "درست است. چیزی رهایی‌بخش در موسیقی غمگین هست."),
            d("B", "Have you ever been to a music festival?", "تا حالا به فستیوال موسیقی رفته‌ای؟"),
            d("A", "Once, years ago. It was overwhelming but amazing.", "یک بار، سال‌ها پیش. طاقت‌فرسا بود ولی فوق‌العاده."),
            d("B", "I've been to a few. The atmosphere is incredible.", "چند بار رفته‌ام. فضا باورنکردنی است."),
            d("A", "What's the best one you've been to?", "بهترینی که رفته‌ای کدام است؟"),
            d("B", "Well, a folk festival last summer. Intimate, not too crowded.", "خب، یک فستیوال فولک تابستان گذشته. صمیمی، نه خیلی شلوغ."),
            d("A", "That sounds more my speed. Big crowds can be exhausting.", "این بیشتر به سلیقه من می‌خورد. جمعیت زیاد می‌تواند خسته‌کننده باشد."),
            d("B", "Right? I need space to enjoy the music.", "درست است؟ به فضا نیاز دارم تا از موسیقی لذت ببرم."),
            d("A", "So, if you could see any musician live, who would it be?", "خب، اگر می‌توانستی هر موسیقی‌دانی را زنده ببینی، کی می‌بود؟"),
            d("B", "That's a good question. Maybe Radiohead. I've been a fan for years.", "سؤال خوبی است. شاید ردیوهد. سال‌ها طرفدارشان بوده‌ام."),
            d("A", "They're legendary. Their music is so innovative.", "افسانه‌ای هستند. موسیقی‌شان خیلی نوآورانه است."),
            d("B", "Exactly. They've influenced so many artists.", "دقیقاً. بر هنرمندان زیادی تأثیر گذاشته‌اند."),
            d("A", "I've been getting into them recently, actually.", "راستش اخیراً بهشان علاقه‌مند شده‌ام."),
            d("B", "Really? What have you listened to?", "واقعاً؟ چه چیزی گوش داده‌ای؟"),
            d("A", "Mostly 'OK Computer'. It's brilliant.", "بیشتر «OK Computer». درخشان است."),
            d("B", "That's their masterpiece. Have you heard 'Kid A'?", "شاهکارشان است. «Kid A» را شنیده‌ای؟"),
            d("A", "Not yet. I'll add it to my list.", "هنوز نه. به لیستم اضافه می‌کنم."),
            d("B", "You won't regret it. It's more experimental but incredible.", "پشیمان نمی‌شوی. تجربی‌تر است ولی باورنکردنی."),
            d("A", "I'm excited. Thanks for the recommendation.", "هیجان‌زده‌ام. ممنون برای توصیه."),
            d("B", "Anytime. Music is meant to be shared.", "هر وقت. موسیقی برای به اشتراک گذاشتن است."),
            d("A", "That's a beautiful philosophy. I couldn't agree more.", "فلسفه زیبایی است. کاملاً موافقم."),
            d("B", "Well, I should get going. But let me know what you think of The Paper Kites.", "خب، باید بروم. ولی بگو درباره The Paper Kites چه فکر می‌کنی."),
            d("A", "I will. And I'll send you a jazz playlist in return.", "می‌گویم. و در عوض یک پلی‌لیست جاز برایت می‌فرستم."),
            d("B", "That sounds great. Music exchange!", "عالی به نظر می‌رسد. تبادل موسیقی!"),
            d("A", "Exactly. Talk soon.", "دقیقاً. به‌زودی صحبت."),
            d("B", "Talk soon. Enjoy the jazz!", "به‌زودی صحبت. از جاز لذت ببر!"),
            d("A", "You too. Bye!", "تو هم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What genre has A been listening to lately?", listOf("rock", "jazz", "classical", "pop"), 1),
            q("What band does B recommend?", listOf("Radiohead", "The Paper Kites", "Coldplay", "Mumford & Sons"), 1),
            q("What instrument does B play?", listOf("piano", "guitar", "violin", "drums"), 1),
            q("What song is especially meaningful to A?", listOf("'Bloom'", "'Hallelujah'", "'OK Computer'", "'Kid A'"), 1),
            q("How does B use music when feeling down?", listOf("listens to sad music", "listens to upbeat music", "stops listening", "writes songs"), 1),
            q("I ___ that album three times this week.", listOf("have listened to", "have been listening to", "listened", "listen"), 0),
            q("I ___ to jazz all week.", listOf("have listened", "have been listening", "listened", "listen"), 1),
            q("The concert was ___.", listOf("amazed", "amazing", "amaze", "amazes"), 1),
            q("I was ___ by the performance.", listOf("moving", "moved", "move", "moves"), 1),
            q("___ , what kind of music do you like?", listOf("So", "Well", "Right", "Actually"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Hooked", "معتاد / شیفته", "I've been hooked ever since.", "از آن موقع شیفته شده‌ام."),
            IdiomExpression("Hits differently", "متفاوت ضربه زدن", "Live music hits differently.", "موسیقی زنده متفاوت ضربه می‌زند."),
            IdiomExpression("My speed", "مطابق سلیقه من", "That sounds more my speed.", "این بیشتر به سلیقه من می‌خورد."),
            IdiomExpression("Go-to", "همیشگی", "What's your go-to song?", "آهنگ همیشگی‌ات چیست؟"),
            IdiomExpression("Get into", "علاقه‌مند شدن به", "I've been getting into them recently.", "اخیراً بهشان علاقه‌مند شده‌ام."),
            IdiomExpression("Meant to be shared", "برای به اشتراک گذاشتن", "Music is meant to be shared.", "موسیقی برای به اشتراک گذاشتن است.")
        ),
        phrasal = listOf(
            PhrasalVerb("check out", "بررسی کردن", "listen to / investigate",
                "I'll check them out.", "بررسی‌شان می‌کنم.", "Yes"),
            PhrasalVerb("get into", "علاقه‌مند شدن", "become interested in",
                "I've been getting into jazz.", "اخیراً به جاز علاقه‌مند شده‌ام.", "No"),
            PhrasalVerb("add to", "اضافه کردن به", "include in a list",
                "I'll add it to my playlist.", "به پلی‌لیستم اضافه می‌کنم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Present perfect continuous stress", "Stress 'been' and the -ing verb: I've BEEN LISTening all week."),
            PronunciationTip("Participial adjective stress", "Stress the first syllable: AMazing, MOVing, BORing."),
            PronunciationTip("Intonation with 'right?'", "Use rising intonation for confirmation: Live music hits differently, right? ↗")
        ),
        culture = listOf(
            CulturalNote("Music and identity",
                "Musical taste is closely tied to identity and social belonging. People often use music to express who they are and to connect with like-minded others."),
            CulturalNote("Music therapy",
                "Music therapy is a recognized healthcare profession. It uses music to address physical, emotional, cognitive, and social needs of individuals."),
            CulturalNote("The role of live music",
                "Live music experiences create communal bonds. Research shows that attending concerts can increase feelings of social connection and well-being.")
        ),
        mistakes = listOf(
            CommonMistake("I have listened to jazz all week. (still listening)", "I have been listening to jazz all week.", "Use present perfect continuous for ongoing actions."),
            CommonMistake("The concert was amazed.", "The concert was amazing.", "Use -ing adjective for the thing that causes the feeling."),
            CommonMistake("I was boring at the concert.", "I was bored at the concert.", "Use -ed adjective for how a person feels.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How did A get into jazz?", "A friend took them to a live jazz club and they've been hooked since."),
            ComprehensionQuestion("Why does B prefer indie rock?", "B feels it's more authentic and about art rather than sales."),
            ComprehensionQuestion("How does B use music to manage emotions?", "B listens to upbeat music to shift their mood when feeling down.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your musical taste and how it has evolved.",
                "سلیقه موسیقی‌ات را توصیف کن و بگو چگونه تغییر کرده.",
                "I've been listening to... / I used to... / Lately I've..."),
            SpeakingTask("Recommend a song or artist to a partner and explain why.",
                "یک آهنگ یا هنرمند به یک دوست توصیه کن و دلیلش را بگو.",
                "You should check out... / It's really... / It makes me feel..."),
            SpeakingTask("Discuss the role of music in your life.",
                "درباره نقش موسیقی در زندگی‌ات صحبت کن.",
                "Music helps me... / I use music to... / Without music...")
        ),
        writing = listOf(
            WritingTask("Write a review of a concert or album you've experienced.",
                "نقدی از یک کنسرت یا آلبوم که تجربه کرده‌ای بنویس.",
                250, "Use present perfect and present perfect continuous, and participial adjectives.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 3 — Money Matters | مسائل مالی  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit3() = base(
        3, "Money Matters", "مسائل مالی",
        listOf(
            "Discuss spending habits and financial goals",
            "Talk about buyer's remorse and financial decisions",
            "Use future plans and finished future actions",
            "Use 'Hey' to indicate enthusiasm",
            "Use 'To tell you the truth' to introduce an unexpected assertion",
            "Ask 'What do you mean?' to clarify",
            "Provide an example to back up a statement or opinion"
        ),
        listOf(
            v("spending", "خرج کردن", "Her spending on clothes has decreased.", "خرجش روی لباس کم شده است."),
            v("thrifty", "صرفه‌جو", "He's very thrifty and saves every penny.", "او خیلی صرفه‌جو است و هر پنی را پس‌انداز می‌کند.", "adjective"),
            v("big spender", "خرج‌کن بزرگ", "She's a big spender when it comes to travel.", "او وقتی نوبت به سفر می‌رسد خرج‌کن بزرگی است."),
            v("cheapskate", "خسیس", "Don't be such a cheapskate — buy the good one.", "اینقدر خسیس نباش — خوبش را بخر.", "adjective"),
            v("buyer's remorse", "پشیمانی از خرید", "I had buyer's remorse after buying that car.", "بعد از خرید آن ماشین پشیمانی از خرید داشتم."),
            v("budget", "بودجه", "I need to stick to my budget this month.", "این ماه باید به بودجه‌ام پایبند باشم."),
            v("investment", "سرمایه‌گذاری", "Real estate is a long-term investment.", "املاک و مستغلات یک سرمایه‌گذاری بلندمدت است."),
            v("savings", "پس‌انداز", "She dipped into her savings for the trip.", "او برای سفر از پس‌اندازش برداشت کرد."),
            v("debt", "بدهی", "He's working hard to pay off his debt.", "او سخت کار می‌کند تا بدهی‌اش را بپردازد."),
            v("loan", "وام", "They took out a loan to buy a house.", "برای خرید خانه وام گرفتند."),
            v("interest rate", "نرخ بهره", "The interest rate on the loan is very low.", "نرخ بهره وام خیلی پایین است."),
            v("mortgage", "وام مسکن", "Their mortgage is almost paid off.", "وام مسکنشان تقریباً تسویه شده."),
            v("financial goal", "هدف مالی", "My short-term financial goal is to save $5,000.", "هدف مالی کوتاه‌مدت من پس‌انداز ۵۰۰۰ دلار است."),
            v("impulse buy", "خرید تکانشی", "That watch was an impulse buy.", "آن ساعت یک خرید تکانشی بود."),
            v("splurge", "خرج زیاد کردن", "Sometimes it's okay to splurge on yourself.", "گاهی اشکالی ندارد برای خودت خرج زیاد کنی.", "verb"),
            v("frugal", "اقتصادی", "Being frugal doesn't mean being miserable.", "اقتصادی بودن به معنای بدبخت بودن نیست.", "adjective"),
            v("affluent", "ثروتمند", "They live in an affluent neighborhood.", "آن‌ها در محله ثروتمندی زندگی می‌کنند.", "adjective"),
            v("charity", "خیریه", "They donate to charity every month.", "هر ماه به خیریه اهدا می‌کنند."),
            v("donate", "اهدا کردن", "I donate to the food bank regularly.", "منظم به بانک غذا اهدا می‌کنم.", "verb"),
            v("financial literacy", "سواد مالی", "Financial literacy should be taught in schools.", "سواد مالی باید در مدارس آموزش داده شود.")
        ),
        listOf(
            GrammarSection(
                "Future plans and finished future actions",
                "Use 'going to' and 'will' for future plans (I'm going to save more). Use future perfect for actions completed before a future time (By December, I will have paid off my loan). Use future continuous for actions in progress at a future time (This time next year, I'll be saving for a house)."
            ),
            GrammarSection(
                "Quantifiers for money",
                "Use a range of quantifiers: a large amount of, a great deal of, plenty of, a few, several, a number of, hardly any, very little."
            ),
            GrammarSection(
                "Conversation strategies for financial discussions",
                "Use 'Hey' to introduce enthusiasm (Hey, I just saved 20%!). Use 'To tell you the truth' before an unexpected assertion (To tell you the truth, I'm broke). Use 'What do you mean?' to clarify (What do you mean by 'affordable'?)."
            )
        ),
        listOf(
            d("A", "Hey, I just realized something amazing!", "سلام، تازه یک چیز شگفت‌انگیز فهمیدم!"),
            d("B", "What's that?", "چیه؟"),
            d("A", "I've been tracking my spending for three months, and I've saved almost a thousand dollars!", "سه ماه است خرج‌هایم را ردیابی می‌کنم، و تقریباً هزار دلار پس‌انداز کرده‌ام!"),
            d("B", "A thousand dollars? That's impressive. How did you do it?", "هزار دلار؟ تحسین‌برانگیز است. چطور انجامش دادی؟"),
            d("A", "Well, to tell you the truth, I had no idea I was spending so much on little things.", "خب، راستش، هیچ ایده‌ای نداشتم که اینقدر روی چیزهای کوچک خرج می‌کنم."),
            d("B", "What do you mean by 'little things'?", "منظورت از «چیزهای کوچک» چیست؟"),
            d("A", "Coffee, snacks, impulse buys online. They added up fast.", "قهوه، تنقلات، خریدهای تکانشی آنلاین. سریع جمع شدند."),
            d("B", "I know exactly what you mean. I used to buy coffee out every day.", "دقیقاً می‌دانم منظورتان چیست. قبلاً هر روز بیرون قهوه می‌خریدم."),
            d("A", "How much were you spending?", "چقدر خرج می‌کردی؟"),
            d("B", "About five dollars a day. That's over a hundred a month just on coffee.", "حدود پنج دلار در روز. یعنی ماهی بیش از صد فقط برای قهوه."),
            d("A", "That's insane when you think about it. A hundred dollars a month!", "وقتی فکرش را می‌کنی دیوانه‌کننده است. ماهی صد دلار!"),
            d("B", "I know. I bought a coffee maker and now I make it at home.", "می‌دانم. یک قهوه‌ساز خریدم و حالا در خانه درست می‌کنم."),
            d("A", "How much did you save?", "چقدر پس‌انداز کردی؟"),
            d("B", "About eighty dollars a month. That's almost a thousand a year.", "حدود هشتاد دلار در ماه. یعنی تقریباً سالی هزار."),
            d("A", "Wow. Small changes really do add up.", "واو. تغییرات کوچک واقعاً جمع می‌شوند."),
            d("B", "They do. But it's hard to see it when you're in the middle of it.", "همینطور است. ولی وقتی در میانش هستی سخت است ببینی."),
            d("A", "So what are you saving for?", "خب برای چه پس‌انداز می‌کنی؟"),
            d("B", "Well, I have a few goals. Short-term, I want to build an emergency fund.", "خب، چند هدف دارم. کوتاه‌مدت، می‌خواهم یک صندوق اضطراری بسازم."),
            d("A", "That's smart. How much do you need?", "هوشمندانه است. چقدر لازم داری؟"),
            d("B", "About six months of expenses. So around fifteen thousand.", "حدود شش ماه هزینه. یعنی تقریباً پانزده هزار."),
            d("A", "That's a lot. How long will it take?", "زیاد است. چقدر طول می‌کشد؟"),
            d("B", "By next year, I will have saved about ten thousand. So another year after that.", "تا سال آینده، حدود ده هزار پس‌انداز کرده‌ام. پس یک سال دیگر بعدش."),
            d("A", "That's a solid plan. What about long-term goals?", "برنامه محکمی است. اهداف بلندمدت چطور؟"),
            d("B", "Eventually I want to buy a house. But that feels far away.", "در نهایت می‌خواهم خانه بخرم. ولی دور به نظر می‌رسد."),
            d("A", "It's not as far as you think. Have you looked at mortgages?", "آنقدر که فکر می‌کنی دور نیست. وام مسکن را بررسی کرده‌ای؟"),
            d("B", "A little. The interest rates are pretty good right now.", "کمی. نرخ بهره الان خیلی خوب است."),
            d("A", "That's what I've heard. Have you talked to a financial advisor?", "همین را شنیده‌ام. با مشاور مالی صحبت کرده‌ای؟"),
            d("B", "Not yet. Do you think I should?", "هنوز نه. فکر می‌کنی باید؟"),
            d("A", "Definitely. They can help you plan better. I saw one last year.", "قطعاً. می‌توانند بهتر برنامه‌ریزی کنند. من سال گذشته یکی دیدم."),
            d("B", "Was it helpful?", "مفید بود؟"),
            d("A", "Very. She helped me set realistic goals and avoid debt.", "خیلی. به من کمک کرد اهداف واقع‌بینانه تعیین کنم و از بدهی پرهیز کنم."),
            d("B", "I've been worried about debt, actually.", "راستش نگران بدهی بوده‌ام."),
            d("A", "Do you have any?", "داری؟"),
            d("B", "Some credit card debt from a few years ago. I've been paying it off slowly.", "کمی بدهی کارت اعتباری از چند سال پیش. به‌آرامی پرداختش می‌کنم."),
            d("A", "How much is left?", "چقدر مانده؟"),
            d("B", "About two thousand. By December, I will have paid it off completely.", "حدود دو هزار. تا دسامبر، کاملاً تسویه کرده‌ام."),
            d("A", "That's great! You'll feel so much lighter.", "عالی است! خیلی سبک‌تر حس می‌کنی."),
            d("B", "I hope so. Debt is stressful.", "امیدوارم. بدهی استرس‌زا است."),
            d("A", "It really is. Have you ever had buyer's remorse?", "واقعاً هست. تا حالا پشیمانی از خرید داشته‌ای؟"),
            d("B", "Oh, plenty of times. The worst was a treadmill I used twice.", "اوه، بارها. بدترینش یک تردمیل بود که دو بار استفاده کردم."),
            d("A", "Ha! That's a classic. How much was it?", "ها! این کلاسیک است. چقدر بود؟"),
            d("B", "Eight hundred dollars. I sold it for two hundred.", "هشتصد دلار. دویست فروختمش."),
            d("A", "Ouch. That's painful.", "آخ. دردناک است."),
            d("B", "Yeah. Now I wait a week before any big purchase.", "بله. حالا قبل از هر خرید بزرگی یک هفته صبر می‌کنم."),
            d("A", "That's a great rule. I should try that.", "قانون عالی‌ای است. باید امتحان کنم."),
            d("B", "What about you? Any impulse buys you regret?", "تو چطور؟ خرید تکانشی پشیمان‌کننده‌ای داری؟"),
            d("A", "A designer jacket. It was on sale, but still three hundred dollars.", "یک ژاکت طراح. در حراج بود، ولی هنوز سیصد دلار."),
            d("B", "Do you wear it?", "می‌پوشیش؟"),
            d("A", "Not as much as I should. It's too fancy for everyday.", "به اندازه‌ای که باید نه. برای هر روز خیلی شیک است."),
            d("B", "The classic trap of 'it's on sale'.", "تله کلاسیک «در حراج است»."),
            d("A", "Exactly. Sales make you spend money you wouldn't otherwise spend.", "دقیقاً. حراج‌ها باعث می‌شوند پولی خرج کنی که در غیر این صورت خرج نمی‌کردی."),
            d("B", "So true. I try to ask myself: would I buy this at full price?", "خیلی درست. سعی می‌کنم از خودم بپرسم: آیا این را با قیمت کامل می‌خریدم؟"),
            d("A", "That's a good filter. If the answer is no, don't buy it.", "فیلتر خوبی است. اگر جواب نه است، نخر."),
            d("B", "Right. It's saved me a lot of money.", "درست. پول زیادی برایم ذخیره کرده."),
            d("A", "What about investing? Do you do any?", "سرمایه‌گذاری چطور؟ انجام می‌دهی؟"),
            d("B", "A little. I have some index funds. Low risk, steady growth.", "کمی. چند صندوق شاخص دارم. ریسک کم، رشد ثابت."),
            d("A", "That's what I've been considering. Any advice?", "همین را در نظر داشتم. توصیه‌ای داری؟"),
            d("B", "Start small. Don't invest money you might need soon.", "کوچک شروع کن. پولی که ممکن است به‌زودی لازم داشته باشی سرمایه‌گذاری نکن."),
            d("A", "Good point. What about charity? Do you donate?", "نکته خوبی است. خیریه چطور؟ اهدا می‌کنی؟"),
            d("B", "Yes, monthly. I think it's important to give back.", "بله، ماهانه. فکر می‌کنم مهم است که پس بدهیم."),
            d("A", "I agree. Even small amounts help.", "موافقم. حتی مبالغ کوچک کمک می‌کنند."),
            d("B", "Exactly. It's not about the amount. It's about the habit.", "دقیقاً. درباره مبلغ نیست. درباره عادت است."),
            d("A", "So what's your biggest financial goal for the next five years?", "خب بزرگ‌ترین هدف مالی‌ات برای پنج سال آینده چیست؟"),
            d("B", "By then, I will have bought a small apartment.", "تا آن موقع، یک آپارتمان کوچک خریده‌ام."),
            d("A", "That's a great goal. I'm sure you'll achieve it.", "هدف عالی‌ای است. مطمئنم به آن می‌رسی."),
            d("B", "Thanks. It feels good to have a plan.", "ممنون. داشتن برنامه حس خوبی دارد."),
            d("A", "It does. Well, I should go. But let's check in on our financial goals next month.", "همینطور است. خب، باید بروم. ولی بیایید ماه آینده اهداف مالی‌مان را چک کنیم."),
            d("B", "Deal. Accountability helps.", "قبول. پاسخگویی کمک می‌کند."),
            d("A", "It does. See you soon!", "همینطور است. به‌زودی می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("How much has A saved in three months?", listOf("$500", "$800", "almost $1000", "$1500"), 2),
            q("How much did B spend on coffee daily?", listOf("$2", "$3", "$5", "$7"), 2),
            q("What is B's short-term goal?", listOf("buy a house", "build an emergency fund", "pay off student loans", "invest in stocks"), 1),
            q("How much is left on B's credit card debt?", listOf("$500", "$1000", "$2000", "$3000"), 2),
            q("What was B's worst buyer's remorse purchase?", listOf("a jacket", "a treadmill", "a phone", "a TV"), 1),
            q("By next year, I ___ my loan.", listOf("will pay off", "will have paid off", "will be paying off", "pay off"), 1),
            q("This time next year, I ___ for a house.", listOf("will save", "will have saved", "will be saving", "save"), 2),
            q("I ___ to save $5,000 this year.", listOf("will", "am going to", "am", "was"), 1),
            q("By December, she ___ the project.", listOf("will finish", "will have finished", "will be finishing", "finishes"), 1),
            q("___ , I'm broke right now.", listOf("To tell you the truth", "Hey", "What do you mean", "Actually"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Add up", "جمع شدن", "Small changes really do add up.", "تغییرات کوچک واقعاً جمع می‌شوند."),
            IdiomExpression("Buyer's remorse", "پشیمانی از خرید", "Have you ever had buyer's remorse?", "تا حالا پشیمانی از خرید داشته‌ای؟"),
            IdiomExpression("Pay off", "تسویه کردن", "By December, I will have paid it off.", "تا دسامبر، تسویه‌اش کرده‌ام."),
            IdiomExpression("Give back", "پس دادن", "I think it's important to give back.", "فکر می‌کنم مهم است که پس بدهیم."),
            IdiomExpression("Stick to", "پایبند بودن", "I need to stick to my budget.", "باید به بودجه‌ام پایبند باشم."),
            IdiomExpression("Splurge on", "خرج زیاد کردن برای", "Sometimes it's okay to splurge on yourself.", "گاهی اشکالی ندارد برای خودت خرج زیاد کنی."),
            IdiomExpression("Emergency fund", "صندوق اضطراری", "I want to build an emergency fund.", "می‌خواهم یک صندوق اضطراری بسازم.")
        ),
        phrasal = listOf(
            PhrasalVerb("pay off", "تسویه کردن", "complete payment",
                "I've been paying it off slowly.", "به‌آرامی پرداختش می‌کنم.", "Yes"),
            PhrasalVerb("save up", "پس‌انداز کردن", "accumulate money",
                "I'm saving up for a house.", "برای خانه پس‌انداز می‌کنم.", "No"),
            PhrasalVerb("give back", "پس دادن", "donate",
                "It's important to give back.", "مهم است که پس بدهیم.", "No"),
            PhrasalVerb("stick to", "پایبند بودن", "follow a plan",
                "I need to stick to my budget.", "باید به بودجه‌ام پایبند باشم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Future perfect stress", "Stress 'will have' and the past participle: I will HAVE PAID it off."),
            PronunciationTip("Future continuous rhythm", "This time next year, I'll be SAVing for a house."),
            PronunciationTip("Reduction in 'to tell you the truth'", "In natural speech: to tell you the truth → /tə tɛl jə ðə truθ/")
        ),
        culture = listOf(
            CulturalNote("Financial literacy",
                "Financial literacy rates vary widely across countries. Many experts advocate for teaching personal finance in schools to prepare young people for real-world money management."),
            CulturalNote("Tipping and spending culture",
                "Different cultures have different attitudes toward spending, saving, and debt. Some prioritize saving; others embrace spending and credit. Understanding these differences helps navigate cross-cultural financial situations."),
            CulturalNote("Charity and giving",
                "Attitudes toward charitable giving vary. Some cultures emphasize regular tithing or zakat. Others focus on occasional donations. The common thread is the value of generosity.")
        ),
        mistakes = listOf(
            CommonMistake("By next year, I will pay off my loan.", "By next year, I will have paid off my loan.", "Use future perfect for actions completed by a future time."),
            CommonMistake("This time next year, I will save for a house.", "This time next year, I will be saving for a house.", "Use future continuous for actions in progress at a future time."),
            CommonMistake("I'm going to saving more.", "I'm going to save more.", "After 'going to', use the base verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How did A save almost $1,000?", "By tracking spending and cutting back on small purchases like coffee and impulse buys."),
            ComprehensionQuestion("What are B's financial goals?", "Build an emergency fund, pay off credit card debt, and eventually buy a house."),
            ComprehensionQuestion("What rule does B follow for big purchases?", "Wait a week before buying to avoid impulse purchases.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your spending habits and one change you'd like to make.",
                "عادات خرج کردنت و یک تغییری که دوست داری ایجاد کنی را توصیف کن.",
                "I tend to... / I've been trying to... / By next year, I will have..."),
            SpeakingTask("Discuss your short-term and long-term financial goals.",
                "درباره اهداف مالی کوتاه‌مدت و بلندمدتت صحبت کن.",
                "My short-term goal is... / Eventually, I want to... / By then, I will have..."),
            SpeakingTask("Role-play a conversation about buyer's remorse.",
                "نقش‌بازی گفت‌وگو درباره پشیمانی از خرید.",
                "I regret buying... / It was an impulse buy... / I should have...")
        ),
        writing = listOf(
            WritingTask("Write a personal financial plan for the next five years.",
                "یک برنامه مالی شخصی برای پنج سال آینده بنویس.",
                250, "Use future perfect and future continuous, and quantifiers for money.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 4 — Looking Good | خوب به نظر رسیدن  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit4() = base(
        4, "Looking Good", "خوب به نظر رسیدن",
        listOf(
            "Describe fashion and personal style",
            "Discuss appropriate dress for different occasions",
            "Talk about how clothing affects perception",
            "Use quantifiers correctly",
            "Use the prefix 'self-' to form words",
            "Use 'Can you believe' to indicate disapproval",
            "Use 'Don't you think' to promote consensus",
            "Begin a response with 'Well' to convey polite disagreement"
        ),
        listOf(
            v("fashionable", "مد روز", "She always wears fashionable clothes.", "او همیشه لباس‌های مد روز می‌پوشد.", "adjective"),
            v("stylish", "خوش‌استایل", "He's a very stylish dresser.", "او خیلی خوش‌استایل است.", "adjective"),
            v("funky", "خاص و جسورانه", "I love your funky earrings.", "گوشواره‌های خاص و جسورانه‌ات را دوست دارم.", "adjective"),
            v("elegant", "شیک", "She looked elegant at the wedding.", "او در عروسی شیک به نظر می‌رسید.", "adjective"),
            v("casual", "اسپرت", "Dress code is casual, so no need for a suit.", "کد لباس اسپرت است، پس کت و شلوار لازم نیست.", "adjective"),
            v("formal", "رسمی", "The invitation says formal attire.", "دعوت‌نامه می‌گوید لباس رسمی.", "adjective"),
            v("conservative", "محافظه‌کارانه", "A conservative suit is safest for an interview.", "کت و شلوار محافظه‌کارانه برای مصاحبه امن‌ترین است.", "adjective"),
            v("flattering", "خوش‌نما", "That color is very flattering on you.", "آن رنگ خیلی به تو می‌آید.", "adjective"),
            v("outfit", "ست لباس", "She wore a beautiful outfit to the party.", "او ست لباس زیبایی به مهمانی پوشید."),
            v("accessory", "اکسسوری", "A scarf is a simple accessory that adds style.", "شال یک اکسسوری ساده است که استایل اضافه می‌کند."),
            v("trend", "روند", "That style is a current trend.", "آن سبک یک روند فعلی است."),
            v("wardrobe", "کمد لباس", "I need to update my wardrobe for spring.", "باید کمد لباسم را برای بهار به‌روز کنم."),
            v("self-conscious", "خودآگاه (نگران ظاهر)", "He felt self-conscious in the new suit.", "او در کت و شلوار جدید احساس خودآگاهی می‌کرد.", "adjective"),
            v("self-confident", "با اعتماد به نفس", "Dressing well makes her feel self-confident.", "خوب لباس پوشیدن او را با اعتماد به نفس می‌کند.", "adjective"),
            v("self-expression", "بیان خود", "Fashion is a form of self-expression.", "مد نوعی بیان خود است."),
            v("self-image", "تصویر از خود", "Social media can affect self-image.", "شبکه‌های اجتماعی می‌توانند بر تصویر از خود تأثیر بگذارند."),
            v("self-esteem", "عزت نفس", "Compliments can boost self-esteem.", "تعریف‌ها می‌توانند عزت نفس را بالا ببرند."),
            v("impression", "برداشت", "First impressions are often based on appearance.", "برداشت‌های اول اغلب بر اساس ظاهر است."),
            v("perception", "ادراک", "Clothing affects others' perception of you.", "لباس بر ادراک دیگران از تو تأثیر می‌گذارد."),
            v("dress code", "کد لباس", "The dress code for the event is business casual.", "کد لباس رویداد بیزینس کژوال است.")
        ),
        listOf(
            GrammarSection(
                "Quantifiers",
                "Use quantifiers to express amounts: all, most, a majority of, many, some, a few, a little, few, little, hardly any, none. Pay attention to count vs. non-count nouns: many outfits, much style, a few accessories, a little elegance."
            ),
            GrammarSection(
                "The prefix self-",
                "The prefix 'self-' combines with words to form new meanings: self-conscious, self-confident, self-expression, self-image, self-esteem, self-employed, self-sufficient."
            ),
            GrammarSection(
                "Conversation strategies for opinions",
                "Use 'Can you believe' to express disapproval (Can you believe she wore that?). Use 'Don't you think' to promote consensus (Don't you think he looks great?). Use 'Well' to soften disagreement (Well, I'm not sure about that)."
            )
        ),
        listOf(
            d("A", "Hey, can I ask you something? I have a job interview next week and I'm stressing about what to wear.", "سلام، می‌توانم چیزی بپرسم؟ هفته آینده مصاحبه شغلی دارم و درباره اینکه چه بپوشم استرس دارم."),
            d("B", "Of course. What kind of company is it?", "حتماً. چه نوع شرکتی است؟"),
            d("A", "It's a tech startup. They said the dress code is 'business casual'.", "یک استارتاپ فناوری. گفتند کد لباس «بیزینس کژوال» است."),
            d("B", "That's tricky. It can mean different things at different companies.", "پیچیده است. در شرکت‌های مختلف معانی متفاوتی می‌تواند داشته باشد."),
            d("A", "Exactly. I don't want to be overdressed or underdressed.", "دقیقاً. نمی‌خواهم زیادی رسمی یا زیادی غیررسمی باشم."),
            d("B", "Well, I'd err on the side of slightly overdressed.", "خب، من به سمت کمی رسمی‌تر متمایل می‌شوم."),
            d("A", "Really? Why?", "واقعاً؟ چرا؟"),
            d("B", "It shows respect for the interview. You can always dress down after you get the job.", "احترام به مصاحبه را نشان می‌دهد. همیشه می‌توانی بعد از گرفتن کار غیررسمی‌تر بپوشی."),
            d("A", "That makes sense. What do you suggest?", "منطقی است. چه پیشنهاد می‌کنی؟"),
            d("B", "A blazer with nice trousers. No tie. Maybe a simple blouse.", "یک بلیزر با شلوار شیک. بدون کراوات. شاید یک بلوز ساده."),
            d("A", "What colors?", "چه رنگ‌هایی؟"),
            d("B", "Navy, gray, or black. They're flattering and professional.", "سرمه‌ای، خاکستری، یا مشکی. خوش‌نما و حرفه‌ای هستند."),
            d("A", "What about accessories?", "اکسسوری چطور؟"),
            d("B", "Keep it minimal. A simple watch and small earrings.", "حداقل نگهش دار. یک ساعت ساده و گوشواره‌های کوچک."),
            d("A", "Can you believe how much thought goes into this?", "باورت می‌شود چقدر فکر کردن به این نیاز دارد؟"),
            d("B", "Ha! I know. But appearance matters, especially in interviews.", "ها! می‌دانم. ولی ظاهر مهم است، مخصوصاً در مصاحبه‌ها."),
            d("A", "Do you think it should matter?", "فکر می‌کنی باید مهم باشد؟"),
            d("B", "Well, ideally not. But the reality is that people judge based on appearance.", "خب، ایده‌آل نه. ولی واقعیت این است که مردم بر اساس ظاهر قضاوت می‌کنند."),
            d("A", "That's frustrating.", "آزاردهنده است."),
            d("B", "It is. But we can use it to our advantage.", "هست. ولی می‌توانیم به نفع خودمان استفاده کنیم."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "Dressing well signals that you take the situation seriously. It's non-verbal communication.", "خوب لباس پوشیدن نشان می‌دهد موقعیت را جدی می‌گیری. ارتباط غیرکلامی است."),
            d("A", "So it's not just about looking good. It's about sending a message.", "پس فقط درباره خوب به نظر رسیدن نیست. درباره ارسال پیام است."),
            d("B", "Exactly. Self-presentation is a skill.", "دقیقاً. ارائه خود یک مهارت است."),
            d("A", "I never thought of it that way.", "هرگز آنطور فکر نکرده‌ام."),
            d("B", "Don't you think it's unfair that we have to think about this so much?", "فکر نمی‌کنی ناعادلانه است که باید اینقدر به این فکر کنیم؟"),
            d("A", "Well, I see your point. But everyone faces these expectations.", "خب، منظورت را می‌فهمم. ولی همه با این انتظارات روبرو هستند."),
            d("B", "True. It's not just women or just men. It's everyone.", "درست. فقط زنان یا فقط مردان نیست. همه هستند."),
            d("A", "Do you think dress codes are becoming more relaxed?", "فکر می‌کنی کدهای لباس در حال آزادتر شدن هستند؟"),
            d("B", "In some industries, yes. Tech is more casual than finance, for example.", "در برخی صنایع، بله. فناوری غیررسمی‌تر از مالی است، مثلاً."),
            d("A", "So it depends on the context.", "پس به زمینه بستگی دارد."),
            d("B", "Very much so. The same outfit could be perfect in one setting and wrong in another.", "خیلی زیاد. یک ست لباس می‌تواند در یک موقعیت عالی و در موقعیت دیگر غلط باشد."),
            d("A", "That's why it's so stressful!", "برای همین اینقدر استرس‌زا است!"),
            d("B", "Ha! I know. But you'll figure it out. You have good instincts.", "ها! می‌دانم. ولی حلش می‌کنی. غریزه خوبی داری."),
            d("A", "Thanks. That's reassuring.", "ممنون. این اطمینان‌بخش است."),
            d("B", "By the way, do you ever feel self-conscious about your appearance?", "راستی، تا حالا درباره ظاهرت احساس خودآگاهی کرده‌ای؟"),
            d("A", "Sometimes. Especially in new situations.", "گاهی. مخصوصاً در موقعیت‌های جدید."),
            d("B", "Me too. It's natural. But I try not to let it control me.", "من هم. طبیعی است. ولی سعی می‌کنم نگذارم کنترلم کند."),
            d("A", "How do you do that?", "چطور این کار را می‌کنی؟"),
            d("B", "I remind myself that most people are focused on themselves, not me.", "به خودم یادآوری می‌کنم که بیشتر مردم روی خودشان تمرکز دارند، نه من."),
            d("A", "That's actually very true. We're all in our own heads.", "این واقعاً خیلی درست است. همه در ذهن خودمان هستیم."),
            d("B", "Exactly. So the pressure we feel is often self-imposed.", "دقیقاً. پس فشاری که حس می‌کنیم اغلب خودتحمیلی است."),
            d("A", "Self-imposed. That's a good word.", "خودتحمیلی. کلمه خوبی است."),
            d("B", "It's freeing when you realize it. You don't have to be perfect.", "وقتی بفهمی آزادکننده است. لازم نیست کامل باشی."),
            d("A", "I'm working on that.", "دارم رویش کار می‌کنم."),
            d("B", "Aren't we all?", "مگه همه‌مون نیستیم؟"),
            d("A", "Ha! True.", "ها! درست."),
            d("B", "Speaking of self-image, have you seen the new fashion trends this season?", "از تصویر از خود که صحبت شد، روندهای مد جدید این فصل را دیده‌ای؟"),
            d("A", "A little. What's trending?", "کمی. چه چیزی روند است؟"),
            d("B", "Lots of bold colors and oversized silhouettes.", "رنگ‌های جسورانه و سیلوئت‌های گشاد زیاد."),
            d("A", "Oversized? I'm not sure that's flattering on everyone.", "گشاد؟ مطمئن نیستم روی همه خوش‌نما باشد."),
            d("B", "Well, I think it depends on how you style it.", "خب، فکر می‌کنم به نحوه استایل کردن بستگی دارد."),
            d("A", "True. Fashion is so subjective.", "درست. مد خیلی ذهنی است."),
            d("B", "Very. What looks great on one person can look terrible on another.", "خیلی. چیزی که روی یک نفر عالی به نظر می‌رسد می‌تواند روی دیگری وحشتناک باشد."),
            d("A", "That's why personal style matters more than trends.", "برای همین سبک شخصی مهم‌تر از روندهاست."),
            d("B", "Agreed. Trends come and go, but style is timeless.", "موافقم. روندها می‌آیند و می‌روند، ولی سبک بی‌زمان است."),
            d("A", "Do you follow trends?", "روندها را دنبال می‌کنی؟"),
            d("B", "Not really. I wear what I like and what fits well.", "نه واقعاً. آنچه دوست دارم و خوب اندازه‌ام است می‌پوشم."),
            d("A", "That's the healthiest approach.", "این سالم‌ترین رویکرد است."),
            d("B", "It took me years to get there, though. I used to buy everything trendy.", "ولی سال‌ها طول کشید تا به آن برسم. قبلاً هر چیز مد روزی می‌خریدم."),
            d("A", "What changed?", "چه چیزی تغییر کرد؟"),
            d("B", "I realized I was wasting money on things I didn't even like.", "فهمیدم دارم پول را روی چیزهایی هدر می‌دهم که حتی دوستشان نداشتم."),
            d("A", "That's a common realization.", "این یک درک رایج است."),
            d("B", "Yeah. Now I buy less but better quality.", "بله. حالا کمتر ولی با کیفیت‌تر می‌خرم."),
            d("A", "Quality over quantity.", "کیفیت بر کمیت."),
            d("B", "Exactly. My wardrobe is smaller but I wear everything in it.", "دقیقاً. کمد لباسم کوچک‌تر است ولی همه چیز در آن را می‌پوشم."),
            d("A", "That's the goal. Well, I should go shopping for that interview outfit.", "این هدف است. خب، باید برای لباس مصاحبه خرید کنم."),
            d("B", "Good luck! And remember — you've got this.", "موفق باشی! و یادت باشد — از پسش برمی‌آیی."),
            d("A", "Thanks. I appreciate the advice.", "ممنون. از توصیه‌ات ممنونم."),
            d("B", "Anytime. Let me know how the interview goes!", "هر وقت. بگو مصاحبه چطور پیش رفت!"),
            d("A", "I will. See you soon.", "می‌گویم. به‌زودی می‌بینمت."),
            d("B", "See you. And don't stress too much!", "می‌بینمت. و زیاد استرس نداشته باش!"),
            d("A", "I'll try. Bye!", "سعی می‌کنم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What kind of interview does A have?", listOf("finance", "tech startup", "teaching", "medical"), 1),
            q("What does B suggest A wear?", listOf("a suit and tie", "a blazer with trousers", "jeans and a t-shirt", "a dress"), 1),
            q("What colors does B recommend?", listOf("bright colors", "navy, gray, or black", "white and beige", "red and yellow"), 1),
            q("What does B say about self-consciousness?", listOf("it's permanent", "it's often self-imposed", "only women feel it", "it's helpful"), 1),
            q("What fashion trends does B mention?", listOf("minimalism", "bold colors and oversized silhouettes", "monochrome", "vintage"), 1),
            q("___ of the students passed the exam.", listOf("A majority", "Much", "A little", "Few"), 0),
            q("She has ___ accessories.", listOf("much", "a few", "a little", "hardly any"), 1),
            q("He has ___ style.", listOf("many", "a few", "a great deal of", "several"), 2),
            q("She's very ___-confident.", listOf("self", "auto", "auto", "self"), 0),
            q("Fashion is a form of ___-expression.", listOf("self", "auto", "self", "auto"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Er on the side of", "به سمت ... متمایل شدن", "I'd err on the side of slightly overdressed.", "به سمت کمی رسمی‌تر متمایل می‌شوم."),
            IdiomExpression("Dress down", "غیررسمی پوشیدن", "You can always dress down after.", "همیشه می‌توانی بعداً غیررسمی بپوشی."),
            IdiomExpression("In our own heads", "در ذهن خودمان", "We're all in our own heads.", "همه در ذهن خودمان هستیم."),
            IdiomExpression("Self-imposed", "خودتحمیلی", "The pressure is often self-imposed.", "فشار اغلب خودتحمیلی است."),
            IdiomExpression("Quality over quantity", "کیفیت بر کمیت", "Quality over quantity.", "کیفیت بر کمیت."),
            IdiomExpression("Timeless", "بی‌زمان", "Style is timeless.", "سبک بی‌زمان است."),
            IdiomExpression("You've got this", "از پسش برمی‌آیی", "You've got this.", "از پسش برمی‌آیی.")
        ),
        phrasal = listOf(
            PhrasalVerb("dress up", "رسمی پوشیدن", "wear formal clothes",
                "You don't need to dress up for this event.", "برای این رویداد لازم نیست رسمی بپوشی.", "No"),
            PhrasalVerb("dress down", "غیررسمی پوشیدن", "wear casual clothes",
                "You can dress down on Fridays.", "جمعه‌ها می‌توانی غیررسمی بپوشی.", "No"),
            PhrasalVerb("figure out", "فهمیدن", "solve / understand",
                "You'll figure it out.", "حلش می‌کنی.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Quantifier stress", "Stress the quantifier in a sentence: A MAjority of students, HARDLY any time."),
            PronunciationTip("Self- prefix pronunciation", "The prefix 'self-' is always stressed: SELF-conscious, SELF-confident, SELF-image."),
            PronunciationTip("Intonation with 'Can you believe'", "Use expressive falling intonation: Can you BE-lieve how much thought goes into this?")
        ),
        culture = listOf(
            CulturalNote("Dress codes around the world",
                "Dress codes vary widely across cultures and industries. What's considered 'business casual' in one country might be too formal or too casual in another. Researching local norms is helpful."),
            CulturalNote("Appearance and perception",
                "Research shows that appearance significantly influences first impressions. Studies have found that well-dressed individuals are perceived as more competent and trustworthy."),
            CulturalNote("Self-expression through fashion",
                "Fashion is a powerful form of self-expression. It allows people to communicate identity, mood, values, and creativity without words.")
        ),
        mistakes = listOf(
            CommonMistake("She has many style.", "She has a lot of style.", "Use 'much' or 'a lot of' with non-count nouns."),
            CommonMistake("There are much accessories.", "There are many accessories.", "Use 'many' with count nouns."),
            CommonMistake("He's very self-confident about his appearance.", "He's very self-conscious about his appearance.", "Self-confident means having confidence; self-conscious means being worried about appearance.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does A need help with?", "Choosing an outfit for a job interview at a tech startup."),
            ComprehensionQuestion("What does B say about the importance of appearance?", "While ideally appearance shouldn't matter, people do judge based on it, so it's useful to use it strategically."),
            ComprehensionQuestion("Why does B prefer quality over quantity in fashion?", "B realized they were wasting money on trendy items they didn't like; now they buy less but better quality.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your personal style and how it has evolved.",
                "سبک شخصی‌ات را توصیف کن و بگو چگونه تغییر کرده.",
                "I tend to wear... / I used to... / Now I prefer..."),
            SpeakingTask("Discuss appropriate dress for different occasions.",
                "درباره لباس مناسب برای موقعیت‌های مختلف صحبت کن.",
                "For a job interview, you should... / At a wedding... / In casual settings..."),
            SpeakingTask("Role-play giving fashion advice to a friend.",
                "نقش‌بازی مشاوره مد به یک دوست.",
                "Don't you think...? / I'd suggest... / That color is flattering on you.")
        ),
        writing = listOf(
            WritingTask("Write an essay about how appearance affects perception in professional settings.",
                "مقاله‌ای درباره اینکه ظاهر چگونه بر ادراک در محیط‌های حرفه‌ای تأثیر می‌گذارد بنویس.",
                250, "Use quantifiers and the prefix self- correctly.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 5 — Community | جامعه محلی  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit5() = base(
        5, "Community", "جامعه محلی",
        listOf(
            "Discuss urban and rural life",
            "Talk about social responsibility and community involvement",
            "Use possessives with gerunds",
            "Use paired conjunctions correctly",
            "Use negative prefixes to form antonyms",
            "Stress the main verb to acknowledge partial agreement",
            "Use 'Do you mind' to express concern about offending",
            "Say 'Not at all' to indicate willingness to comply"
        ),
        listOf(
            v("urban", "شهری", "Urban life is fast-paced and exciting.", "زندگی شهری سریع و هیجان‌انگیز است.", "adjective"),
            v("rural", "روستایی", "Rural areas are quieter and more peaceful.", "مناطق روستایی ساکت‌تر و آرام‌ترند.", "adjective"),
            v("suburb", "حاشیه شهر", "They live in a quiet suburb outside the city.", "آن‌ها در حاشیه آرامی خارج از شهر زندگی می‌کنند."),
            v("neighbor", "همسایه", "Our neighbor is very friendly.", "همسایه‌مان خیلی خوش‌برخورد است."),
            v("community", "جامعه محلی", "The community came together to help.", "جامعه محلی برای کمک دور هم جمع شد."),
            v("volunteer", "داوطلب", "She volunteers at the local shelter.", "او در پناهگاه محلی داوطلب می‌شود.", "verb"),
            v("community service", "خدمات اجتماعی", "He does community service every weekend.", "او هر آخر هفته خدمات اجتماعی انجام می‌دهد."),
            v("social responsibility", "مسئولیت اجتماعی", "Companies should practice social responsibility.", "شرکت‌ها باید مسئولیت اجتماعی را تمرین کنند."),
            v("mind their own business", "به کار خود بودن", "Neighbors should mind their own business.", "همسایه‌ها باید به کار خود باشند."),
            v("look out for each other", "مراقب هم بودن", "In good communities, people look out for each other.", "در جوامع خوب، مردم مراقب هم هستند."),
            v("mixed blessing", "نعمت و نقمت", "City life is a mixed blessing.", "زندگی شهری نعمت و نقمت است."),
            v("takes some getting used to", "کمی زمان بردن برای عادت", "The noise takes some getting used to.", "سر و صدا کمی زمان می‌برد تا عادت کنی."),
            v("mean well", "قصد خوب داشتن", "They mean well, even if they're annoying.", "قصدشان خوب است، حتی اگر آزاردهنده باشند."),
            v("look on the bright side", "نیمه پر لیوان را دیدن", "Let's look on the bright side.", "بیا نیمه پر لیوان را ببینیم."),
            v("got a lot to offer", "چیزهای زیادی برای ارائه داشتن", "This neighborhood has got a lot to offer.", "این محله چیزهای زیادی برای ارائه دارد."),
            v("urban problems", "مشکلات شهری", "Traffic and pollution are urban problems.", "ترافیک و آلودگی مشکلات شهری هستند."),
            v("rural life", "زندگی روستایی", "Rural life has its own challenges.", "زندگی روستایی چالش‌های خودش را دارد."),
            v("sense of community", "حس جامعه", "There's a strong sense of community here.", "حس جامعه قوی‌ای اینجا وجود دارد."),
            v("get involved", "مشارکت کردن", "She got involved in local politics.", "او در سیاست محلی مشارکت کرد."),
            v("make a difference", "تفاوت ایجاد کردن", "One person can make a difference.", "یک نفر می‌تواند تفاوت ایجاد کند.")
        ),
        listOf(
            GrammarSection(
                "Possessives with gerunds",
                "Use possessive adjectives before gerunds: I appreciate your helping me. His coming late was a problem. Her singing always cheers me up. Do you mind my asking?"
            ),
            GrammarSection(
                "Paired conjunctions",
                "Use paired conjunctions to connect related ideas: both...and, either...or, neither...nor, not only...but also. Both the city and the countryside have advantages. Either we act now or we'll regret it."
            ),
            GrammarSection(
                "Negative prefixes",
                "Use negative prefixes to form antonyms: un- (unfriendly), in- (inconsiderate), im- (impolite), dis- (disrespectful), non- (nonviolent)."
            )
        ),
        listOf(
            d("A", "So, I'm thinking about moving. I need your perspective.", "خب، دارم به نقل مکان فکر می‌کنم. به دیدگاهت نیاز دارم."),
            d("B", "Oh? Where to?", "اوه؟ کجا؟"),
            d("A", "That's the question. I've been in the city for ten years, and I'm exhausted.", "سؤال همین است. ده سال در شهر بوده‌ام، و خسته‌ام."),
            d("B", "Exhausted how?", "چطور خسته‌ای؟"),
            d("A", "The noise, the crowds, the constant pressure. I need a change.", "سر و صدا، جمعیت، فشار مداوم. به تغییر نیاز دارم."),
            d("B", "I hear you. I've been considering the same thing, actually.", "می‌فهمم. راستش من هم به همین فکر کرده‌ام."),
            d("A", "Really? What's holding you back?", "واقعاً؟ چه چیزی نگهت داشته؟"),
            d("B", "Well, the city has a lot to offer. Museums, restaurants, career opportunities.", "خب، شهر چیزهای زیادی برای ارائه دارد. موزه‌ها، رستوران‌ها، فرصت‌های شغلی."),
            d("A", "True. But at what cost? I pay $2,000 a month for a tiny apartment.", "درست. ولی به چه قیمتی؟ ماهی ۲۰۰۰ دلار برای یک آپارتمان کوچک می‌دهم."),
            d("B", "Ouch. That's a lot. A friend of mine moved to a rural area and pays half that for a house.", "آخ. زیاد است. یکی از دوستانم به منطقه روستایی نقل مکان کرد و نصف آن را برای یک خانه می‌دهد."),
            d("A", "Half? For a house?", "نصف؟ برای یک خانه؟"),
            d("B", "Yes. But there are trade-offs.", "بله. ولی معامله‌هایی وجود دارد."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Fewer job opportunities. Less cultural diversity. You need a car for everything.", "فرصت‌های شغلی کمتر. تنوع فرهنگی کمتر. برای همه چیز به ماشین نیاز داری."),
            d("A", "That's the trade-off. Space and quiet versus convenience and opportunity.", "این همان معامله است. فضا و سکوت در برابر راحتی و فرصت."),
            d("B", "Exactly. It's a mixed blessing either way.", "دقیقاً. در هر صورت نعمت و نقمت است."),
            d("A", "So how do I decide?", "پس چطور تصمیم بگیرم؟"),
            d("B", "What matters most to you right now?", "الان چه چیزی برایت مهم‌ترین است؟"),
            d("A", "Peace of mind. I'm tired of feeling stressed all the time.", "آرامش ذهن. از استرس مداوم خسته شده‌ام."),
            d("B", "Then maybe the city isn't serving you anymore.", "پس شاید شهر دیگر به تو خدمت نمی‌کند."),
            d("A", "That's what I'm thinking. But I'm scared of regretting it.", "همین را فکر می‌کنم. ولی می‌ترسم پشیمان شوم."),
            d("B", "Do you mind my saying something?", "مشکلی نداری بگویم چیزی؟"),
            d("A", "Not at all. Go ahead.", "اصلاً. بگو."),
            d("B", "You don't have to move permanently. You could try it for a year.", "لازم نیست دائمی نقل مکان کنی. می‌توانی یک سال امتحان کنی."),
            d("A", "A trial period. That's smart.", "دوره آزمایشی. هوشمندانه است."),
            d("B", "Exactly. You can always move back. Nothing is permanent.", "دقیقاً. همیشه می‌توانی برگردی. هیچ چیز دائمی نیست."),
            d("A", "That takes some of the pressure off.", "این کمی از فشار کم می‌کند."),
            d("B", "It does. And who knows? You might love it.", "همینطور است. و کی می‌داند؟ شاید عاشقش شوی."),
            d("A", "Or hate it and come running back!", "یا ازش متنفر شوی و دوان‌دوان برگردی!"),
            d("B", "Ha! Either way, you'll learn something.", "ها! در هر صورت، چیزی یاد می‌گیری."),
            d("A", "True. What about you? Would you ever leave the city?", "درست. تو چطور؟ هرگز شهر را ترک می‌کردی؟"),
            d("B", "Maybe someday. When I'm older, maybe.", "شاید روزی. وقتی پیرتر شوم، شاید."),
            d("A", "Why wait?", "چرا صبر کنی؟"),
            d("B", "I still enjoy the city's energy. And my career is here.", "هنوز از انرژی شهر لذت می‌برم. و حرفه‌ام اینجاست."),
            d("A", "That makes sense. Different priorities at different stages.", "منطقی است. اولویت‌های متفاوت در مراحل مختلف."),
            d("B", "Exactly. There's no one-size-fits-all answer.", "دقیقاً. پاسخ یک‌اندازه برای همه وجود ندارد."),
            d("A", "So what do you love most about the city?", "خب بیشتر از همه چه چیزی را در شهر دوست داری؟"),
            d("B", "The diversity. You meet people from everywhere.", "تنوع. با افراد از همه جا ملاقات می‌کنی."),
            d("A", "That's true. My neighborhood is incredibly diverse.", "درست است. محله من فوق‌العاده متنوع است."),
            d("B", "Do you know your neighbors?", "همسایه‌هایت را می‌شناسی؟"),
            d("A", "A few. Not as many as I'd like.", "چند تا. نه به اندازه‌ای که دوست دارم."),
            d("B", "That's a common urban problem. People mind their own business.", "این یک مشکل شهری رایج است. مردم به کار خود هستند."),
            d("A", "Yeah. In rural areas, everyone knows everyone.", "بله. در مناطق روستایی، همه همه را می‌شناسند."),
            d("B", "Which can be both good and bad.", "که هم می‌تواند خوب باشد هم بد."),
            d("A", "Ha! True. No privacy.", "ها! درست. بدون حریم خصوصی."),
            d("B", "But also a strong sense of community.", "ولی همچنین حس قوی جامعه."),
            d("A", "That's what I'm craving. Connection.", "همین چیزی است که هوسش را دارم. ارتباط."),
            d("B", "Then maybe you should look for a smaller town rather than a truly rural area.", "پس شاید باید دنبال شهر کوچک‌تری باشی نه منطقه واقعاً روستایی."),
            d("A", "A suburb? Or a small town?", "حاشیه شهر؟ یا شهر کوچک؟"),
            d("B", "A small town. Somewhere with a real main street and local events.", "شهر کوچک. جایی با خیابان اصلی واقعی و رویدادهای محلی."),
            d("A", "That sounds perfect. Walkable, friendly, community-oriented.", "عالی به نظر می‌رسد. پیاده‌رو، دوستانه، جامعه‌محور."),
            d("B", "And you can still visit the city when you need culture.", "و هنوز می‌توانی وقتی به فرهنگ نیاز داری به شهر سر بزنی."),
            d("A", "Best of both worlds.", "بهترین هر دو دنیا."),
            d("B", "Exactly. Well, I hope you find your place.", "دقیقاً. خب، امیدوارم جایت را پیدا کنی."),
            d("A", "Thanks. This conversation helped a lot.", "ممنون. این گفت‌وگو خیلی کمک کرد."),
            d("B", "Anytime. Let me know what you decide.", "هر وقت. بگو چه تصمیمی گرفتی."),
            d("A", "I will. And if I move, you have to visit.", "می‌گویم. و اگر نقل مکان کردم، باید بیایی."),
            d("B", "Deal. I'll bring my hiking boots!", "قبول. چکمه‌های کوهنوردی‌ام را می‌آورم!"),
            d("A", "Ha! Perfect. Talk soon.", "ها! عالی. به‌زودی صحبت."),
            d("B", "Talk soon. Good luck with the decision!", "به‌زودی صحبت. موفق باشی در تصمیم!"),
            d("A", "Thanks. Bye!", "ممنون. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How long has A been in the city?", listOf("5 years", "10 years", "15 years", "20 years"), 1),
            q("How much does A pay for rent?", listOf("$1,000", "$1,500", "$2,000", "$2,500"), 2),
            q("What is B's advice?", listOf("move permanently", "try it for a year", "stay in the city", "buy a house"), 1),
            q("What does B love most about the city?", listOf("restaurants", "diversity", "career opportunities", "museums"), 1),
            q("What is A craving?", listOf("career growth", "connection", "excitement", "privacy"), 1),
            q("I appreciate ___ helping me.", listOf("you", "your", "yours", "yourself"), 1),
            q("Do you mind ___ asking a question?", listOf("me", "my", "mine", "myself"), 1),
            q("She's very ___-friendly.", listOf("un", "in", "dis", "non"), 0),
            q("That was very ___-considerate of you.", listOf("un", "in", "dis", "non"), 1),
            q("___ the city and the countryside have advantages.", listOf("Both", "Either", "Neither", "Not only"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Mixed blessing", "نعمت و نقمت", "City life is a mixed blessing.", "زندگی شهری نعمت و نقمت است."),
            IdiomExpression("Takes some getting used to", "کمی زمان بردن برای عادت", "The noise takes some getting used to.", "سر و صدا کمی زمان می‌برد تا عادت کنی."),
            IdiomExpression("Mind their own business", "به کار خود بودن", "People mind their own business in cities.", "مردم در شهرها به کار خود هستند."),
            IdiomExpression("Look out for each other", "مراقب هم بودن", "In good communities, people look out for each other.", "در جوامع خوب، مردم مراقب هم هستند."),
            IdiomExpression("Look on the bright side", "نیمه پر لیوان را دیدن", "Let's look on the bright side.", "بیا نیمه پر لیوان را ببینیم."),
            IdiomExpression("Got a lot to offer", "چیزهای زیادی برای ارائه داشتن", "The city has got a lot to offer.", "شهر چیزهای زیادی برای ارائه دارد."),
            IdiomExpression("Best of both worlds", "بهترین هر دو دنیا", "Best of both worlds.", "بهترین هر دو دنیا."),
            IdiomExpression("One-size-fits-all", "یک‌اندازه برای همه", "There's no one-size-fits-all answer.", "پاسخ یک‌اندازه برای همه وجود ندارد.")
        ),
        phrasal = listOf(
            PhrasalVerb("get involved", "مشارکت کردن", "participate",
                "She got involved in local politics.", "او در سیاست محلی مشارکت کرد.", "No"),
            PhrasalVerb("make a difference", "تفاوت ایجاد کردن", "have an impact",
                "One person can make a difference.", "یک نفر می‌تواند تفاوت ایجاد کند.", "No"),
            PhrasalVerb("mind your own business", "به کار خود بودن", "not interfere",
                "Neighbors should mind their own business.", "همسایه‌ها باید به کار خود باشند.", "No"),
            PhrasalVerb("come together", "دور هم جمع شدن", "unite",
                "The community came together.", "جامعه محلی دور هم جمع شد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Possessive + gerund stress", "Stress the gerund: I appreciate your HELPing me."),
            PronunciationTip("Paired conjunction rhythm", "Stress both parts: BOTH the city AND the countryside."),
            PronunciationTip("Negative prefix stress", "The prefix is usually unstressed: unFRIENDly, inCONSIDerate, disreSPECTful.")
        ),
        culture = listOf(
            CulturalNote("Urban vs. rural life",
                "The choice between urban and rural living is a common theme globally. Each has distinct advantages and drawbacks, and preferences vary based on life stage, career, and personal values."),
            CulturalNote("Sense of community",
                "A strong sense of community is often associated with improved well-being. Rural areas and small towns typically have stronger community bonds, while cities offer more diversity and anonymity."),
            CulturalNote("Social responsibility",
                "The concept of social responsibility varies across cultures. Some emphasize individual contribution; others focus on collective action. Both approaches can strengthen communities.")
        ),
        mistakes = listOf(
            CommonMistake("I appreciate you helping me.", "I appreciate your helping me.", "Use possessive adjective before gerund."),
            CommonMistake("Both the city and countryside has advantages.", "Both the city and the countryside have advantages.", "Use plural verb with 'both...and'."),
            CommonMistake("She's very disfriendly.", "She's very unfriendly.", "Use 'un-' not 'dis-' with 'friendly'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why is A considering leaving the city?", "A is exhausted by noise, crowds, and constant pressure, and pays high rent."),
            ComprehensionQuestion("What trade-offs does B mention about rural life?", "Fewer job opportunities, less cultural diversity, and need for a car."),
            ComprehensionQuestion("What does B suggest instead of a permanent move?", "A one-year trial period to see if it works.")
        ),
        speaking = listOf(
            SpeakingTask("Compare urban and rural life.",
                "زندگی شهری و روستایی را مقایسه کن.",
                "In the city... / In the countryside... / Both have..."),
            SpeakingTask("Discuss what makes a strong community.",
                "درباره اینکه چه چیزی یک جامعه قوی می‌سازد صحبت کن.",
                "A strong community needs... / People should... / The key is..."),
            SpeakingTask("Role-play a conversation about moving.",
                "نقش‌بازی گفت‌وگو درباره نقل مکان.",
                "I'm thinking of moving... / What do you think? / Have you considered...?")
        ),
        writing = listOf(
            WritingTask("Write an essay comparing urban and rural life.",
                "مقاله‌ای مقایسه‌ای درباره زندگی شهری و روستایی بنویس.",
                250, "Use possessives with gerunds and paired conjunctions.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 6 — Animals | حیوانات  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit6() = base(
        6, "Animals", "حیوانات",
        listOf(
            "Discuss the treatment of animals",
            "Talk about animal conservation and endangered species",
            "Use passive modals",
            "Use modal-like expressions",
            "Express opinions about animal rights",
            "Debate ethical issues related to animals"
        ),
        listOf(
            v("endangered", "در خطر انقراض", "Many species are endangered due to habitat loss.", "بسیاری از گونه‌ها به دلیل از دست دادن زیستگاه در خطر انقراض هستند.", "adjective"),
            v("species", "گونه", "There are millions of species on Earth.", "میلیون‌ها گونه روی زمین وجود دارد."),
            v("habitat", "زیستگاه", "Deforestation destroys animal habitats.", "جنگل‌زدایی زیستگاه‌های حیوانات را نابود می‌کند."),
            v("conservation", "حفاظت", "Wildlife conservation is essential.", "حفاظت از حیات وحش ضروری است."),
            v("extinct", "منقرض", "Dinosaurs went extinct millions of years ago.", "دایناسورها میلیون‌ها سال پیش منقرض شدند.", "adjective"),
            v("wildlife", "حیات وحش", "The park protects local wildlife.", "پارک از حیات وحش محلی محافظت می‌کند."),
            v("cruelty", "ظلم", "Animal cruelty should be punished.", "ظلم به حیوانات باید مجازات شود."),
            v("welfare", "رفاه", "Animal welfare laws protect pets.", "قوانین رفاه حیوانات از حیوانات خانگی محافظت می‌کنند."),
            v("breeding", "پرورش", "Captive breeding helps endangered species.", "پرورش در اسارت به گونه‌های در خطر کمک می‌کند."),
            v("sanctuary", "پناهگاه", "The elephant sanctuary rescues abused animals.", "پناهگاه فیل حیوانات مورد آزار را نجات می‌دهد."),
            v("treatment", "رفتار / درمان", "The treatment of farm animals varies by country.", "رفتار با حیوانات مزرعه بین کشورها متفاوت است."),
            v("ethical", "اخلاقی", "Is it ethical to keep animals in zoos?", "آیا نگهداری حیوانات در باغ‌وحش اخلاقی است؟", "adjective"),
            v("rights", "حقوق", "Some argue animals have rights.", "برخی استدلال می‌کنند حیوانات حقوق دارند."),
            v("testing", "آزمایش", "Cosmetic testing on animals is banned in many countries.", "آزمایش لوازم آرایشی روی حیوانات در بسیاری از کشورها ممنوع است."),
            v("adopt", "به سرپرستی گرفتن", "We adopted a rescue dog.", "ما یک سگ نجات‌یافته را به سرپرستی گرفتیم.", "verb"),
            v("protect", "محافظت کردن", "We must protect endangered species.", "باید از گونه‌های در خطر محافظت کنیم.", "verb"),
            v("preserve", "حفظ کردن", "National parks preserve natural habitats.", "پارک‌های ملی زیستگاه‌های طبیعی را حفظ می‌کنند.", "verb"),
            v("awareness", "آگاهی", "They raise awareness about animal welfare.", "آن‌ها آگاهی درباره رفاه حیوانات را بالا می‌برند."),
            v("poaching", "شکار غیرقانونی", "Poaching threatens elephants in Africa.", "شکار غیرقانونی فیل‌ها را در آفریقا تهدید می‌کند."),
            v("captivity", "اسارت", "Animals in captivity often suffer.", "حیوانات در اسارت اغلب رنج می‌برند.")
        ),
        listOf(
            GrammarSection(
                "Passive modals",
                "Use modal + be + past participle. Animals should be treated humanely. Endangered species must be protected. Pets can be adopted from shelters. Zoos might be phased out in the future."
            ),
            GrammarSection(
                "Modal-like expressions",
                "Use expressions like be supposed to, be allowed to, be required to, be prohibited from, be permitted to. Visitors are not allowed to feed the animals. Circuses are required to meet animal welfare standards."
            ),
            GrammarSection(
                "Expressing opinions on animal ethics",
                "Use phrases like 'From an ethical standpoint...', 'I believe that...', 'It's crucial that...', 'We have a responsibility to...', 'It's worth considering whether...' to discuss animal issues thoughtfully."
            )
        ),
        listOf(
            d("A", "Hey, I just read an article about elephants that really bothered me.", "سلام، تازه مقاله‌ای درباره فیل‌ها خواندم که واقعاً آزارم داد."),
            d("B", "What was it about?", "درباره چه بود؟"),
            d("A", "About poaching in Africa. Thousands of elephants are killed every year for their tusks.", "درباره شکار غیرقانونی در آفریقا. سالانه هزاران فیل برای عاج‌هایشان کشته می‌شوند."),
            d("B", "That's horrific. I don't understand how anyone can do that.", "وحشتناک است. نمی‌فهمم چطور کسی می‌تواند این کار را بکند."),
            d("A", "It's driven by money. Ivory is valuable on the black market.", "با پول هدایت می‌شود. عاج در بازار سیاه ارزشمند است."),
            d("B", "But elephants are so intelligent. They feel emotions, they mourn their dead.", "ولی فیل‌ها خیلی باهوش هستند. احساسات دارند، برای مردگانشان عزاداری می‌کنند."),
            d("A", "Exactly. That's what makes it so cruel.", "دقیقاً. همین است که آن را اینقدر ظالمانه می‌کند."),
            d("B", "What can be done? I feel so powerless.", "چه می‌توان کرد؟ خیلی ناتوان حس می‌کنم."),
            d("A", "Well, conservation efforts are helping in some areas. And awareness is growing.", "خب، تلاش‌های حفاظتی در برخی مناطق کمک می‌کنند. و آگاهی در حال رشد است."),
            d("B", "Should elephants be kept in zoos for their own protection?", "آیا فیل‌ها باید برای محافظت از خودشان در باغ‌وحش نگهداری شوند؟"),
            d("A", "That's a controversial question. Some argue zoos protect them. Others say captivity is cruel.", "سؤال بحث‌برانگیزی است. برخی استدلال می‌کنند باغ‌وحش‌ها محافظت می‌کنند. دیگران می‌گویند اسارت ظالمانه است."),
            d("B", "I think it depends on the zoo. Good ones provide space and care.", "فکر می‌کنم به باغ‌وحش بستگی دارد. باغ‌وحش‌های خوب فضا و مراقبت فراهم می‌کنند."),
            d("A", "True. But even the best zoos are still prisons in some ways.", "درست. ولی حتی بهترین باغ‌وحش‌ها هم به نوعی زندان هستند."),
            d("B", "It's a difficult ethical question.", "سؤال اخلاقی دشواری است."),
            d("A", "It is. What about animals used for testing? What's your opinion on that?", "هست. حیوانات مورد استفاده برای آزمایش چطور؟ نظرت چیست؟"),
            d("B", "For cosmetics, I think it should be banned. It's unnecessary.", "برای لوازم آرایشی، فکر می‌کنم باید ممنوع شود. غیرضروری است."),
            d("A", "Agreed. But what about medical testing?", "موافقم. ولی آزمایش پزشکی چطور؟"),
            d("B", "That's harder. Medical testing has saved human lives.", "سخت‌تر است. آزمایش پزشکی جان انسان‌ها را نجات داده."),
            d("A", "True. But animals suffer. Is it ethical to sacrifice them for us?", "درست. ولی حیوانات رنج می‌برند. آیا اخلاقی است فدایشان کنیم؟"),
            d("B", "I don't know. It's a moral dilemma.", "نمی‌دانم. یک دوراهی اخلاقی است."),
            d("A", "Many scientists are working on alternatives now.", "بسیاری از دانشمندان الان روی جایگزین‌ها کار می‌کنند."),
            d("B", "That's encouraging. Technology might solve this eventually.", "دلگرم‌کننده است. تکنولوژی ممکن است در نهایت این را حل کند."),
            d("A", "I hope so. What about pets? Do you have any?", "امیدوارم. حیوانات خانگی چطور؟ داری؟"),
            d("B", "Yes, I adopted a dog from a shelter last year.", "بله، سال گذشته یک سگ از پناهگاه به سرپرستی گرفتم."),
            d("A", "That's wonderful. Adoption saves lives.", "فوق‌العاده است. سرپرستی جان‌ها را نجات می‌دهد."),
            d("B", "It does. There are so many animals that need homes.", "همینطور است. حیوانات زیادی هستند که به خانه نیاز دارند."),
            d("A", "What about breeders? Do you think people should buy from them?", "پرورش‌دهنده‌ها چطور؟ فکر می‌کنی مردم باید از آن‌ها بخرند؟"),
            d("B", "I think adoption should be the first choice. But responsible breeders are okay too.", "فکر می‌کنم سرپرستی باید انتخاب اول باشد. ولی پرورش‌دهنده‌های مسئول هم اشکالی ندارند."),
            d("A", "What makes a breeder responsible?", "چه چیزی یک پرورش‌دهنده را مسئول می‌کند؟"),
            d("B", "Health testing, good conditions, not overbreeding. And they should care about where the animals go.", "آزمایش سلامت، شرایط خوب، عدم پرورش بیش از حد. و باید به جایی که حیوانات می‌روند اهمیت دهند."),
            d("A", "That makes sense. It's about the animals' welfare, not just profit.", "منطقی است. درباره رفاه حیوانات است، نه فقط سود."),
            d("B", "Exactly. Animals deserve respect and care.", "دقیقاً. حیوانات سزاوار احترام و مراقبت هستند."),
            d("A", "Do you think animals have rights?", "فکر می‌کنی حیوانات حقوق دارند؟"),
            d("B", "I believe they do. Not the same as humans, but basic rights to live without suffering.", "باور دارم دارند. نه مثل انسان‌ها، ولی حقوق پایه برای زندگی بدون رنج."),
            d("A", "That's a growing view worldwide. Some countries have passed animal welfare laws.", "این دیدگاه در حال رشد جهانی است. برخی کشورها قوانین رفاه حیوانات تصویب کرده‌اند."),
            d("B", "Which ones?", "کدام‌ها؟"),
            d("A", "Many European countries, for example. Some have banned fur farming entirely.", "بسیاری از کشورهای اروپایی، مثلاً. برخی پرورش خز را کاملاً ممنوع کرده‌اند."),
            d("B", "That's progress. I wish more countries would follow.", "این پیشرفت است. امیدوارم کشورهای بیشتری دنبال کنند."),
            d("A", "Change is slow. But awareness is the first step.", "تغییر کند است. ولی آگاهی اولین قدم است."),
            d("B", "What can individuals do to help?", "افراد چه می‌توانند بکنند تا کمک کنند؟"),
            d("A", "Adopt, don't shop. Support conservation organizations. Avoid products tested on animals.", "سرپرستی کنید، نخرید. از سازمان‌های حفاظتی حمایت کنید. از محصولات آزمایش‌شده روی حیوانات پرهیز کنید."),
            d("B", "Those are practical steps. I'll try to do more.", "قدم‌های عملی هستند. سعی می‌کنم بیشتر انجام دهم."),
            d("A", "Me too. Every little bit helps.", "من هم. هر ذره کمک می‌کند."),
            d("B", "Do you volunteer anywhere?", "جایی داوطلب می‌شوی؟"),
            d("A", "Not yet. But I've been thinking about volunteering at an animal sanctuary.", "هنوز نه. ولی به داوطلب شدن در یک پناهگاه حیوانات فکر کرده‌ام."),
            d("B", "That would be amazing. Let me know if you do!", "فوق‌العاده می‌شود. اگر انجام دادی بگو!"),
            d("A", "I will. Maybe we could do it together.", "می‌گویم. شاید بتوانیم با هم انجام دهیم."),
            d("B", "I'd love that. Count me in.", "دوستش دارم. روی من حساب کن."),
            d("A", "Great. I'll look into it and get back to you.", "عالی. بررسی می‌کنم و بهت خبر می‌دهم."),
            d("B", "Perfect. Well, I should go walk my dog now.", "عالی. خب، باید بروم سگم را پیاده کنم."),
            d("A", "Ha! Duty calls. Talk soon.", "ها! وظیفه صدا می‌زند. به‌زودی صحبت."),
            d("B", "Talk soon. And thanks for the conversation.", "به‌زودی صحبت. و ممنون برای گفت‌وگو."),
            d("A", "Anytime. Give your dog a pat for me.", "هر وقت. برایم یک دستی به سگت بکش."),
            d("B", "I will! Bye!", "می‌کشم! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What article bothered A?", listOf("animal testing", "poaching in Africa", "zoo conditions", "pet breeding"), 1),
            q("What does B say about elephants?", listOf("they're dangerous", "they're intelligent and emotional", "they're overpopulated", "they're not endangered"), 1),
            q("What is B's opinion on cosmetic testing?", listOf("should continue", "should be banned", "only for some products", "no opinion"), 1),
            q("What pet does B have?", listOf("a cat", "a dog", "a bird", "a rabbit"), 1),
            q("What should be the first choice for getting a pet?", listOf("buying from a breeder", "adoption", "pet store", "importing"), 1),
            q("Animals should ___ humanely.", listOf("treat", "be treated", "treating", "be treating"), 1),
            q("Endangered species must ___ protected.", listOf("be", "being", "been", "to be"), 0),
            q("Visitors are not allowed ___ the animals.", listOf("feed", "to feed", "feeding", "fed"), 1),
            q("Circuses are required ___ animal welfare standards.", listOf("meet", "to meet", "meeting", "met"), 1),
            q("Pets can ___ from shelters.", listOf("adopt", "be adopted", "adopting", "be adopting"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Driven by", "هدایت شدن توسط", "It's driven by money.", "با پول هدایت می‌شود."),
            IdiomExpression("Feel powerless", "احساس ناتوانی کردن", "I feel so powerless.", "خیلی ناتوان حس می‌کنم."),
            IdiomExpression("Count me in", "روی من حساب کن", "I'd love that. Count me in.", "دوستش دارم. روی من حساب کن."),
            IdiomExpression("Duty calls", "وظیفه صدا می‌زند", "Duty calls. Talk soon.", "وظیفه صدا می‌زند. به‌زودی صحبت."),
            IdiomExpression("Every little bit helps", "هر ذره کمک می‌کند", "Every little bit helps.", "هر ذره کمک می‌کند."),
            IdiomExpression("Look into", "بررسی کردن", "I'll look into it.", "بررسی می‌کنم."),
            IdiomExpression("Get back to", "به کسی خبر دادن", "I'll get back to you.", "بهت خبر می‌دهم.")
        ),
        phrasal = listOf(
            PhrasalVerb("look into", "بررسی کردن", "investigate",
                "I'll look into volunteering.", "داوطلب شدن را بررسی می‌کنم.", "No"),
            PhrasalVerb("get back to", "به کسی خبر دادن", "respond later",
                "I'll get back to you.", "بهت خبر می‌دهم.", "No"),
            PhrasalVerb("count in", "روی کسی حساب کردن", "include",
                "Count me in.", "روی من حساب کن.", "Yes"),
            PhrasalVerb("phase out", "تدریجاً حذف کردن", "gradually eliminate",
                "Zoos might be phased out.", "باغ‌وحش‌ها ممکن است تدریجاً حذف شوند.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Passive modal stress", "Stress the main verb: Animals should be TREATed humanely."),
            PronunciationTip("Modal-like expression stress", "Stress 'allowed' or 'required': Visitors are not alLOWED to feed the animals."),
            PronunciationTip("Ethical discussion intonation", "Use measured intonation when discussing ethical issues, avoiding extremes.")
        ),
        culture = listOf(
            CulturalNote("Animal rights around the world",
                "Attitudes toward animal rights vary widely. Some cultures have strong traditions of animal welfare; others prioritize human needs. Globalization is gradually spreading awareness of animal welfare standards."),
            CulturalNote("Conservation success stories",
                "Some conservation efforts have been remarkably successful. The bald eagle, giant panda, and mountain gorilla have all seen population recoveries thanks to coordinated international efforts."),
            CulturalNote("Animal testing debate",
                "The debate over animal testing continues. While some argue it's necessary for medical progress, others advocate for alternatives like computer modeling and cell cultures.")
        ),
        mistakes = listOf(
            CommonMistake("Animals should treat humanely.", "Animals should be treated humanely.", "Use passive voice with modals."),
            CommonMistake("Visitors are not allowed feeding the animals.", "Visitors are not allowed to feed the animals.", "Use 'allowed to + base verb'."),
            CommonMistake("Pets can adopt from shelters.", "Pets can be adopted from shelters.", "Use passive voice for pets being adopted.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is the main issue in the article A read?", "Poaching of elephants in Africa for their ivory tusks."),
            ComprehensionQuestion("What is B's view on animals in zoos?", "B thinks it depends on the zoo — good ones provide space and care, but even the best are still prisons in some ways."),
            ComprehensionQuestion("What practical steps does A suggest for helping animals?", "Adopt don't shop, support conservation organizations, and avoid products tested on animals.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss your views on animal testing.",
                "نظرت را درباره آزمایش روی حیوانات بگو.",
                "I believe that... / It's crucial that... / From an ethical standpoint..."),
            SpeakingTask("Talk about an animal you love or admire.",
                "درباره حیوانی که دوستش داری یا تحسین می‌کنی صحبت کن.",
                "I love... because... / They are... / It's amazing how..."),
            SpeakingTask("Debate whether animals should be kept in captivity.",
                "بحث کنید که آیا حیوانات باید در اسارت نگهداری شوند.",
                "On one hand... / On the other hand... / It depends on...")
        ),
        writing = listOf(
            WritingTask("Write a persuasive essay about an animal welfare issue.",
                "مقاله‌ای ترغیبی درباره یک مسئله رفاه حیوانات بنویس.",
                250, "Use passive modals and modal-like expressions.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 7 — Advertising and Consumers | تبلیغات و مصرف‌کنندگان  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit7() = base(
        7, "Advertising and Consumers", "تبلیغات و مصرف‌کنندگان",
        listOf(
            "Discuss advertising techniques and their effects",
            "Talk about consumer behavior and habits",
            "Use passive forms of gerunds and infinitives",
            "Persuade someone to buy a product",
            "Express skepticism about advertising claims",
            "Debate the ethics of targeted advertising"
        ),
        listOf(
            v("advertisement", "تبلیغ", "The advertisement was everywhere.", "تبلیغ همه‌جا بود."),
            v("consumer", "مصرف‌کننده", "Consumers are becoming more aware.", "مصرف‌کنندگان آگاه‌تر می‌شوند."),
            v("persuade", "متقاعد کردن", "Advertisers try to persuade us to buy.", "تبلیغ‌کنندگان سعی می‌کنند ما را به خرید متقاعد کنند.", "verb"),
            v("endorse", "تأیید کردن / تبلیغ کردن", "Celebrities endorse products for money.", "سلبریتی‌ها برای پول محصولات را تبلیغ می‌کنند.", "verb"),
            v("promote", "ترویج کردن", "The company promotes its products online.", "شرکت محصولاتش را آنلاین ترویج می‌کند.", "verb"),
            v("imply", "تلویحاً گفتن", "The ad implies the product will make you happy.", "تبلیغ تلویحاً می‌گوید محصول تو را خوشحال می‌کند.", "verb"),
            v("prove", "اثبات کردن", "They can't prove their claims.", "نمی‌توانند ادعاهایشان را اثبات کنند.", "verb"),
            v("target", "هدف قرار دادن", "Ads target specific demographics.", "تبلیغات جمعیت‌های خاصی را هدف قرار می‌دهند.", "verb"),
            v("skeptical", "شک‌گرا", "I'm skeptical of ads that promise miracles.", "به تبلیغاتی که معجزه وعده می‌دهند شک‌گرا هستم.", "adjective"),
            v("convincing", "قانع‌کننده", "That was a very convincing argument.", "استدلال خیلی قانع‌کننده‌ای بود.", "adjective"),
            v("misleading", "گمراه‌کننده", "The ad was misleading about the product's benefits.", "تبلیغ درباره مزایای محصول گمراه‌کننده بود.", "adjective"),
            v("influencer", "اینفلوئنسر", "Influencers shape consumer trends.", "اینفلوئنسرها روندهای مصرفی را شکل می‌دهند."),
            v("brand loyalty", "وفاداری به برند", "Brand loyalty is hard to build.", "وفاداری به برند سخت ساخته می‌شود."),
            v("word of mouth", "تبلیغ دهان‌به‌دهان", "Word of mouth is the best advertising.", "تبلیغ دهان‌به‌دهان بهترین تبلیغ است."),
            v("impulse", "تکانش", "Don't buy on impulse.", "تکانشی خرید نکن."),
            v("consumerism", "مصرف‌گرایی", "Consumerism drives the economy but can be destructive.", "مصرف‌گرایی اقتصاد را هدایت می‌کند ولی می‌تواند مخرب باشد."),
            v("ethical", "اخلاقی", "Is targeted advertising ethical?", "آیا تبلیغات هدفمند اخلاقی است؟", "adjective"),
            v("privacy", "حریم خصوصی", "Ads raise privacy concerns.", "تبلیغات نگرانی‌های حریم خصوصی را مطرح می‌کنند."),
            v("manipulate", "دستکاری کردن", "Advertisers manipulate our emotions.", "تبلیغ‌کنندگان احساسات ما را دستکاری می‌کنند.", "verb"),
            v("authentic", "اصیل", "Consumers want authentic brands.", "مصرف‌کنندگان برندهای اصیل می‌خواهند.", "adjective")
        ),
        listOf(
            GrammarSection(
                "Passive forms of gerunds and infinitives",
                "Use passive gerunds (being + past participle) and passive infinitives (to be + past participle). I enjoy being entertained by clever ads. I expect to be told the truth by advertisers. She resents being manipulated. He wants to be given honest information."
            ),
            GrammarSection(
                "Persuasive language",
                "Use rhetorical devices to persuade: repetition, emotional appeals, statistics, celebrity endorsements, urgency (Limited time offer!), social proof (Join millions of satisfied customers)."
            ),
            GrammarSection(
                "Expressing skepticism",
                "Use phrases like 'I'm not convinced', 'That sounds too good to be true', 'Where's the evidence?', 'I take that with a grain of salt', 'It's just marketing hype' to express healthy skepticism."
            )
        ),
        listOf(
            d("A", "Can I ask you something? I'm working on a project about advertising.", "می‌توانم چیزی بپرسم؟ روی پروژه‌ای درباره تبلیغات کار می‌کنم."),
            d("B", "Sure. What do you want to know?", "حتماً. چه می‌خواهی بدانی؟"),
            d("A", "Do you think advertising is manipulative?", "فکر می‌کنی تبلیغات دستکاری‌کننده است؟"),
            d("B", "That's a big question. I'd say it can be, yes.", "سؤال بزرگی است. می‌گویم می‌تواند باشد، بله."),
            d("A", "How so?", "چطور؟"),
            d("B", "Advertisers use psychology to create desire. They make you feel like you need something you didn't know you wanted.", "تبلیغ‌کنندگان از روانشناسی برای ایجاد میل استفاده می‌کنند. کاری می‌کنند که حس کنی به چیزی نیاز داری که نمی‌دانستی می‌خواهی."),
            d("A", "Do you think that's ethical?", "فکر می‌کنی اخلاقی است؟"),
            d("B", "It depends. Some advertising is informative and helpful. Some is pure manipulation.", "بستگی دارد. برخی تبلیغات اطلاع‌رسان و مفیدند. برخی دستکاری محض."),
            d("A", "Can you give an example of manipulation?", "مثالی از دستکاری می‌توانی بدهی؟"),
            d("B", "Sure. Ads that imply you'll be happier, more popular, or more successful if you buy their product.", "حتماً. تبلیغاتی که تلویحاً می‌گویند با خرید محصولشان خوشحال‌تر، محبوب‌تر، یا موفق‌تر می‌شوی."),
            d("A", "Like cosmetic ads that promise beauty?", "مثل تبلیغات لوازم آرایشی که زیبایی وعده می‌دهند؟"),
            d("B", "Exactly. They play on insecurities.", "دقیقاً. روی ناامنی‌ها بازی می‌کنند."),
            d("A", "That's disturbing. Do you think consumers are aware of this?", "آزاردهنده است. فکر می‌کنی مصرف‌کنندگان از این آگاهند؟"),
            d("B", "Some are. But most people don't think about it consciously.", "برخی بله. ولی بیشتر مردم آگاهانه به آن فکر نمی‌کنند."),
            d("A", "Do you think you're affected by ads?", "فکر می‌کنی تو تحت تأثیر تبلیغات هستی؟"),
            d("B", "Of course. Everyone is, to some degree. I try to be conscious of it.", "البته. همه هستند، تا حدی. سعی می‌کنم آگاه باشم."),
            d("A", "How do you avoid being manipulated?", "چطور از دستکاری پرهیز می‌کنی؟"),
            d("B", "I ask myself questions. Do I really need this? Is this a real benefit or just marketing?", "از خودم سؤال می‌پرسم. آیا واقعاً به این نیاز دارم؟ این یک مزیت واقعی است یا فقط بازاریابی؟"),
            d("A", "That's a good practice.", "تمرین خوبی است."),
            d("B", "It helps. But it's a constant battle.", "کمک می‌کند. ولی یک نبرد مداوم است."),
            d("A", "What about influencers? Do you follow any?", "اینفلوئنسرها چطور؟ کسی را دنبال می‌کنی؟"),
            d("B", "A few. But I'm skeptical of their endorsements.", "چند تا. ولی به تأییدهایشان شک‌گرا هستم."),
            d("A", "Why?", "چرا؟"),
            d("B", "Because they're being paid. It's hard to know if they really believe in the product.", "چون پول می‌گیرند. سخت است بدانی واقعاً به محصول باور دارند یا نه."),
            d("A", "Do you think that's deceptive?", "فکر می‌کنی فریبنده است؟"),
            d("B", "It can be. Some countries require influencers to disclose sponsorships.", "می‌تواند باشد. برخی کشورها اینفلوئنسرها را ملزم به افشای حمایت مالی می‌کنند."),
            d("A", "That's a good regulation.", "مقررات خوبی است."),
            d("B", "Yes. Transparency is important.", "بله. شفافیت مهم است."),
            d("A", "What about targeted ads online?", "تبلیغات هدفمند آنلاین چطور؟"),
            d("B", "That's a whole other issue. They know so much about us.", "این یک مسئله کاملاً دیگر است. آنقدر درباره ما می‌دانند."),
            d("A", "Does that bother you?", "آزارت می‌دهد؟"),
            d("B", "Yes, it does. Privacy is important to me.", "بله. حریم خصوصی برای من مهم است."),
            d("A", "But people seem to accept it in exchange for free services.", "ولی مردم به نظر می‌رسد در ازای خدمات رایگان آن را می‌پذیرند."),
            d("B", "Many do. But I think it's a bad trade.", "بسیاری همینطور. ولی فکر می‌کنم معامله بدی است."),
            d("A", "Would you pay for ad-free services?", "برای خدمات بدون تبلیغ پول می‌دادی؟"),
            d("B", "I already do for some. It's worth it for the peace of mind.", "برای برخی الان پول می‌دهم. برای آرامش ذهن ارزشش را دارد."),
            d("A", "That's a growing trend.", "این یک روند در حال رشد است."),
            d("B", "I think so. People are tired of being tracked and targeted.", "فکر می‌کنم. مردم از ردیابی و هدف قرار گرفتن خسته شده‌اند."),
            d("A", "Do you think advertising can ever be positive?", "فکر می‌کنی تبلیغات هرگز می‌تواند مثبت باشد؟"),
            d("B", "Absolutely. Public service announcements can save lives. Ads can inform and educate.", "قطعاً. اطلاعیه‌های خدمات عمومی می‌توانند جان نجات دهند. تبلیغات می‌توانند اطلاع‌رسانی و آموزش دهند."),
            d("A", "So it's about the intent behind the ad?", "پس درباره نیت پشت تبلیغ است؟"),
            d("B", "And the execution. Honest, informative ads are fine. Manipulative ones aren't.", "و اجرا. تبلیغات صادقانه و اطلاع‌رسان خوبند. دستکاری‌کننده‌ها نه."),
            d("A", "How do you tell the difference?", "چطور تفاوت را تشخیص می‌دهی؟"),
            d("B", "If an ad makes you feel bad about yourself, it's probably manipulative.", "اگر تبلیغی حالت را درباره خودت بد می‌کند، احتمالاً دستکاری‌کننده است."),
            d("A", "That's a good rule of thumb.", "قاعده سرانگشتی خوبی است."),
            d("B", "It's not perfect. But it helps.", "بی‌نقص نیست. ولی کمک می‌کند."),
            d("A", "What's the most convincing ad you've ever seen?", "قانع‌کننده‌ترین تبلیغی که دیده‌ای چه بود؟"),
            d("B", "There was a campaign for a car company that focused on safety. It wasn't flashy, just honest.", "کمپینی برای یک شرکت خودروسازی بود که روی ایمنی تمرکز داشت. پر زرق و برق نبود، فقط صادقانه."),
            d("A", "What made it convincing?", "چه چیزی قانع‌کننده‌اش کرد؟"),
            d("B", "They showed real crash test data. Facts, not emotions.", "داده‌های واقعی تست تصادف را نشان دادند. حقایق، نه احساسات."),
            d("A", "So you respond to evidence more than emotion?", "پس بیشتر به شواهد پاسخ می‌دهی تا احساسات؟"),
            d("B", "Yes. I want to be given information, not a hard sell.", "بله. می‌خواهم اطلاعات به من داده شود، نه فروش سخت."),
            d("A", "That's a refreshing perspective. Most people are driven by emotion.", "دیدگاه تازه‌ای است. بیشتر مردم با احساسات هدایت می‌شوند."),
            d("B", "I know. That's why emotional ads are so effective.", "می‌دانم. برای همین تبلیغات احساسی اینقدر مؤثرند."),
            d("A", "Do you think advertising should be regulated more?", "فکر می‌کنی تبلیغات باید بیشتر تنظیم شود؟"),
            d("B", "In some ways, yes. Especially ads targeting children.", "از برخی جهات، بله. مخصوصاً تبلیغاتی که کودکان را هدف قرار می‌دهند."),
            d("A", "That's a big issue.", "مسئله بزرگی است."),
            d("B", "It is. Children can't distinguish between ads and content.", "هست. کودکان نمی‌توانند بین تبلیغ و محتوا تفاوت قائل شوند."),
            d("A", "Some countries have banned ads during children's programming.", "برخی کشورها تبلیغات در برنامه‌های کودکان را ممنوع کرده‌اند."),
            d("B", "That's a step in the right direction.", "این قدمی در جهت درست است."),
            d("A", "Well, this has been really informative. Thanks for sharing your thoughts.", "خب، این واقعاً اطلاع‌رسان بود. ممنون که افکارت را به اشتراک گذاشتی."),
            d("B", "Anytime. It's an important topic.", "هر وقت. موضوع مهمی است."),
            d("A", "I'll definitely use this in my project.", "قطعاً در پروژه‌ام استفاده می‌کنم."),
            d("B", "Good luck with it. Let me know how it goes.", "موفق باشی. بگو چطور پیش رفت."),
            d("A", "I will. See you soon.", "می‌گویم. به‌زودی می‌بینمت."),
            d("B", "See you. Take care.", "می‌بینمت. مراقب باش."),
            d("A", "You too. Bye!", "تو هم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is A working on?", listOf("a book", "a project about advertising", "a documentary", "a research paper"), 1),
            q("How do advertisers create desire according to B?", listOf("by lowering prices", "by using psychology", "by offering free samples", "by using celebrities"), 1),
            q("What does B ask themselves before buying?", listOf("Is it on sale?", "Do I really need this?", "Is it popular?", "Is it recommended?"), 1),
            q("What regulation does B mention?", listOf("ads must be reviewed", "influencers must disclose sponsorships", "ads must be in color", "no ads on TV"), 1),
            q("What kind of ads does B respond to?", listOf("emotional ads", "evidence-based ads", "celebrity ads", "humorous ads"), 1),
            q("I enjoy ___ entertained by clever ads.", listOf("being", "to be", "be", "been"), 0),
            q("I expect ___ told the truth by advertisers.", listOf("being", "to be", "be", "been"), 1),
            q("She resents ___ manipulated.", listOf("being", "to be", "be", "been"), 0),
            q("He wants ___ given honest information.", listOf("being", "to be", "be", "been"), 1),
            q("Most people dislike ___ told what to do.", listOf("being", "to be", "be", "been"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Play on insecurities", "روی ناامنی‌ها بازی کردن", "They play on insecurities.", "روی ناامنی‌ها بازی می‌کنند."),
            IdiomExpression("Take with a grain of salt", "با شک و تردید پذیرفتن", "I take ads with a grain of salt.", "تبلیغات را با شک و تردید می‌پذیرم."),
            IdiomExpression("Too good to be true", "خیلی خوب که واقعی نباشد", "That sounds too good to be true.", "خیلی خوب است که واقعی به نظر نمی‌رسد."),
            IdiomExpression("Peace of mind", "آرامش ذهن", "It's worth it for the peace of mind.", "برای آرامش ذهن ارزشش را دارد."),
            IdiomExpression("Rule of thumb", "قاعده سرانگشتی", "That's a good rule of thumb.", "قاعده سرانگشتی خوبی است."),
            IdiomExpression("Hard sell", "فروش سخت", "I don't want a hard sell.", "فروش سخت نمی‌خواهم."),
            IdiomExpression("Step in the right direction", "قدمی در جهت درست", "That's a step in the right direction.", "قدمی در جهت درست است.")
        ),
        phrasal = listOf(
            PhrasalVerb("play on", "بازی کردن روی", "exploit",
                "They play on insecurities.", "روی ناامنی‌ها بازی می‌کنند.", "No"),
            PhrasalVerb("take with a grain of salt", "با شک پذیرفتن", "be skeptical about",
                "Take ads with a grain of salt.", "تبلیغات را با شک بپذیر.", "No"),
            PhrasalVerb("come up with", "به ذهن رسیدن", "create / devise",
                "They came up with a clever campaign.", "کمپین هوشمندانه‌ای طراحی کردند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Passive gerund stress", "Stress the past participle: I enjoy being enterTAINED."),
            PronunciationTip("Passive infinitive stress", "Stress the past participle: I expect to be TOLD the truth."),
            PronunciationTip("Skepticism intonation", "Use a flat or falling tone to express skepticism: That sounds too good to be true. ↘")
        ),
        culture = listOf(
            CulturalNote("Advertising regulation",
                "Advertising regulations vary widely. Some countries ban ads for certain products (tobacco, alcohol) or restrict ads targeting children. The EU has stricter privacy laws affecting digital advertising."),
            CulturalNote("Influencer culture",
                "The rise of social media influencers has transformed advertising. Authenticity is key, but disclosure of paid partnerships is increasingly required by law in many countries."),
            CulturalNote("Consumer rights",
                "Consumer protection laws vary globally. In many countries, consumers have the right to accurate information, safe products, and redress for misleading claims.")
        ),
        mistakes = listOf(
            CommonMistake("I enjoy being entertain by ads.", "I enjoy being entertained by ads.", "Use past participle in passive gerund."),
            CommonMistake("I expect to tell the truth.", "I expect to be told the truth.", "Use passive infinitive when the subject receives the action."),
            CommonMistake("She resents to be manipulated.", "She resents being manipulated.", "Use gerund after 'resent'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why does B think advertising can be manipulative?", "Advertisers use psychology to create desire and play on insecurities."),
            ComprehensionQuestion("What regulation does B support?", "Influencers should be required to disclose sponsorships, and ads targeting children should be regulated."),
            ComprehensionQuestion("What type of advertising does B find most convincing?", "Honest, evidence-based ads that provide information rather than emotional manipulation.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss whether advertising should be more regulated.",
                "بحث کنید که آیا تبلیغات باید بیشتر تنظیم شود.",
                "I believe... / It's crucial that... / We need to consider..."),
            SpeakingTask("Analyze an advertisement you've seen recently.",
                "یک تبلیغ که اخیراً دیده‌ای را تحلیل کن.",
                "The ad targets... / It uses... / It implies..."),
            SpeakingTask("Role-play persuading a friend to buy a product.",
                "نقش‌بازی متقاعد کردن دوست به خرید یک محصول.",
                "You should try... / It's really... / Trust me, it's worth it.")
        ),
        writing = listOf(
            WritingTask("Write an analytical essay about a controversial advertisement.",
                "مقاله‌ای تحلیلی درباره یک تبلیغ بحث‌برانگیز بنویس.",
                250, "Use passive forms of gerunds and infinitives, and persuasive language.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 8 — Family Trends | روندهای خانوادگی  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit8() = base(
        8, "Family Trends", "روندهای خانوادگی",
        listOf(
            "Discuss changes in family structures and roles",
            "Talk about parent-teen relationships",
            "Use repeated comparatives and double comparatives",
            "Discuss generational differences",
            "Express opinions about modern family life"
        ),
        listOf(
            v("nuclear family", "خانواده هسته‌ای", "The nuclear family is becoming less common.", "خانواده هسته‌ای کمتر رایج می‌شود."),
            v("extended family", "خانواده گسترده", "In many cultures, extended families live together.", "در بسیاری از فرهنگ‌ها، خانواده‌های گسترده با هم زندگی می‌کنند."),
            v("single parent", "والدین مجرد", "Single parents face unique challenges.", "والدین مجرد با چالش‌های منحصربه‌فردی روبرو هستند."),
            v("blended family", "خانواده ترکیبی", "Blended families are increasingly common.", "خانواده‌های ترکیبی به طور فزاینده رایج می‌شوند."),
            v("strict", "سختگیر", "My parents were very strict about curfew.", "والدینم درباره ساعت منزل خیلی سختگیر بودند.", "adjective"),
            v("lenient", "آسان‌گیر", "They're too lenient with their kids.", "آن‌ها با بچه‌هایشان زیادی آسان‌گیر هستند.", "adjective"),
            v("overprotective", "بیش از حد مراقب", "Overprotective parents can hinder independence.", "والدین بیش از حد مراقب می‌توانند استقلال را مختل کنند.", "adjective"),
            v("rebellious", "سرکش", "Teenagers often go through a rebellious phase.", "نوجوانان اغلب دوره سرکشی را می‌گذرانند.", "adjective"),
            v("spoiled", "لوس", "He's spoiled and expects everything.", "او لوس است و انتظار همه چیز را دارد.", "adjective"),
            v("birth rate", "نرخ زادوولد", "The birth rate has been declining for decades.", "نرخ زادوولد دهه‌هاست در حال کاهش است."),
            v("life expectancy", "امید به زندگی", "Life expectancy has increased dramatically.", "امید به زندگی به‌طور چشمگیری افزایش یافته."),
            v("trend", "روند", "One trend is having children later in life.", "یک روند داشتن فرزند در سن بالاتر است."),
            v("generation gap", "شکاف نسلی", "The generation gap can cause misunderstandings.", "شکاف نسلی می‌تواند سوءتفاهم ایجاد کند."),
            v("work-life balance", "تعادل کار و زندگی", "Work-life balance is harder for parents.", "تعادل کار و زندگی برای والدین سخت‌تر است."),
            v("quality time", "زمان با کیفیت", "Quality time is more important than quantity.", "زمان با کیفیت مهم‌تر از کمیت است."),
            v("curfew", "منع رفت‌وآمد", "Her curfew is ten o'clock on weekends.", "منع رفت‌وآمدش آخر هفته‌ها ساعت ده است."),
            v("respect", "احترام", "Mutual respect is key in families.", "احترام متقابل در خانواده‌ها کلیدی است."),
            v("communication", "ارتباط", "Open communication prevents problems.", "ارتباط باز از مشکلات جلوگیری می‌کند."),
            v("independence", "استقلال", "Teenagers need to develop independence.", "نوجوانان باید استقلال پیدا کنند."),
            v("responsibility", "مسئولیت", "Chores teach children responsibility.", "کارهای خانه به کودکان مسئولیت یاد می‌دهد.")
        ),
        listOf(
            GrammarSection(
                "Repeated comparatives",
                "Use 'more and more' or 'less and less' to show a trend: Families are becoming more and more diverse. Parents are spending less and less time at home."
            ),
            GrammarSection(
                "Double comparatives",
                "Use 'the more...the more...' or 'the less...the less...' to show correlation: The more parents communicate, the less conflict there is. The earlier children learn responsibility, the better they do later."
            ),
            GrammarSection(
                "Discussing trends",
                "Use phrases like 'There's a growing trend of...', 'More and more families are...', 'Fewer and fewer people are...', 'The number of...has been increasing/decreasing' to discuss social trends."
            )
        ),
        listOf(
            d("A", "I read an interesting article about family trends today.", "امروز مقاله جالبی درباره روندهای خانوادگی خواندم."),
            d("B", "What did it say?", "چه می‌گفت؟"),
            d("A", "That family structures are changing more and more rapidly.", "ساختارهای خانوادگی سریع‌تر و سریع‌تر در حال تغییرند."),
            d("B", "In what ways?", "به چه روش‌هایی؟"),
            d("A", "Fewer people are getting married young. More people are having children later.", "کمتر افراد جوان ازدواج می‌کنند. بیشتر افراد دیرتر بچه‌دار می‌شوند."),
            d("B", "That's definitely true. My parents married at 22. I'm 35 and still single.", "قطعاً درست است. والدینم در ۲۲ سالگی ازدواج کردند. من ۳۵ سالمه و هنوز مجردم."),
            d("A", "Do you feel pressure to marry?", "فشار ازدواج حس می‌کنی؟"),
            d("B", "Sometimes. My grandmother asks every time I call.", "گاهی. مادربزرگم هر بار زنگ می‌زنم می‌پرسد."),
            d("A", "That's a classic generational difference.", "این یک تفاوت نسلی کلاسیک است."),
            d("B", "Yeah. The older generation had a very different timeline.", "بله. نسل قدیمی‌تر جدول زمانی خیلی متفاوتی داشت."),
            d("A", "What do you think about that?", "درباره‌اش چه فکر می‌کنی؟"),
            d("B", "I think both timelines have value. It depends on what you want from life.", "فکر می‌کنم هر دو جدول زمانی ارزش دارند. به این بستگی دارد که از زندگی چه می‌خواهی."),
            d("A", "What about you? Do you want to have children?", "تو چطور؟ بچه می‌خواهی؟"),
            d("B", "Someday, maybe. But not right now. The more I advance in my career, the less I feel ready.", "روزی، شاید. ولی نه الان. هرچه در حرفه‌ام پیشرفت می‌کنم، کمتر آماده حس می‌کنم."),
            d("A", "That's a dilemma for many people.", "این یک دوراهی برای بسیاری از افراد است."),
            d("B", "It is. Work-life balance is harder and harder to achieve.", "هست. تعادل کار و زندگی سخت‌تر و سخت‌تر می‌شود."),
            d("A", "Do you think companies are becoming more family-friendly?", "فکر می‌کنی شرکت‌ها خانواده‌پسندتر می‌شوند؟"),
            d("B", "Some are. Remote work has helped. But there's still a long way to go.", "برخی همینطور. کار از راه دور کمک کرده. ولی هنوز راه زیادی مانده."),
            d("A", "What about parental leave?", "مرخصی والدین چطور؟"),
            d("B", "It varies by country. Some countries offer a year or more. Others offer nothing.", "بر اساس کشور متفاوت است. برخی کشورها یک سال یا بیشتر ارائه می‌دهند. دیگران هیچ."),
            d("A", "That's a huge difference.", "تفاوت بزرگی است."),
            d("B", "It is. It affects everything — family dynamics, career paths, even birth rates.", "هست. بر همه چیز تأثیر می‌گذارد — دینامیک خانواده، مسیرهای شغلی، حتی نرخ زادوولد."),
            d("A", "Speaking of birth rates — they're declining in many countries.", "از نرخ زادوولد که صحبت شد — در بسیاری از کشورها در حال کاهش است."),
            d("B", "Yes. It's a demographic crisis in some places.", "بله. در برخی جاها یک بحران جمعیتی است."),
            d("A", "Why do you think that is?", "فکر می‌کنی چرا؟"),
            d("B", "Many reasons. Cost of living, career priorities, changing values.", "دلایل زیادی. هزینه زندگی، اولویت‌های شغلی، ارزش‌های در حال تغییر."),
            d("A", "Do you think governments should incentivize having children?", "فکر می‌کنی دولت‌ها باید برای بچه‌دار شدن انگیزه ایجاد کنند؟"),
            d("B", "It's a complex issue. Some countries offer financial incentives, but they don't always work.", "مسئله پیچیده‌ای است. برخی کشورها انگیزه‌های مالی ارائه می‌دهند، ولی همیشه کار نمی‌کنند."),
            d("A", "What would work better?", "چه چیزی بهتر کار می‌کند؟"),
            d("B", "Affordable childcare. Flexible work. Support systems for parents.", "مراقبت از کودک مقرون‌به‌صرفه. کار انعطاف‌پذیر. سیستم‌های حمایتی برای والدین."),
            d("A", "That makes sense. It's about making parenting feasible, not just encouraging it.", "منطقی است. درباره ممکن کردن والدگری است، نه فقط تشویقش."),
            d("B", "Exactly.", "دقیقاً."),
            d("A", "What was your family like growing up?", "خانواده‌ات در کودکی چطور بود؟"),
            d("B", "Fairly traditional. My mom stayed home, my dad worked.", "نسبتاً سنتی. مادرم خانه می‌ماند، پدرم کار می‌کرد."),
            d("A", "Do you think that's changed for your generation?", "فکر می‌کنی برای نسل تو تغییر کرده؟"),
            d("B", "Very much so. Most couples I know share responsibilities more equally.", "خیلی زیاد. بیشتر زوج‌هایی که می‌شناسم مسئولیت‌ها را برابرتر تقسیم می‌کنند."),
            d("A", "That's progress.", "این پیشرفت است."),
            d("B", "It is. But there's still a gap. Women often do more housework even when they work full-time.", "هست. ولی هنوز شکافی وجود دارد. زنان اغلب کار خانه بیشتری انجام می‌دهند حتی وقتی تمام‌وقت کار می‌کنند."),
            d("A", "The second shift.", "شیفت دوم."),
            d("B", "Exactly. It's a persistent problem.", "دقیقاً. یک مشکل پایدار است."),
            d("A", "What about your parents? Do they see your generation differently?", "والدینت چطور؟ نسل تو را متفاوت می‌بینند؟"),
            d("B", "My mom sometimes doesn't understand my choices. But she respects them.", "مادرم گاهی انتخاب‌هایم را نمی‌فهمد. ولی احترام می‌گذارد."),
            d("A", "Respect is important.", "احترام مهم است."),
            d("B", "It is. The more we communicate, the better we understand each other.", "هست. هرچه بیشتر صحبت کنیم، بهتر همدیگر را می‌فهمیم."),
            d("A", "That's a good principle for families.", "اصل خوبی برای خانواده‌هاست."),
            d("B", "Absolutely. Do you have a close relationship with your parents?", "قطعاً. با والدینت رابطه نزدیکی داری؟"),
            d("A", "Fairly close. We talk every week.", "نسبتاً نزدیک. هر هفته صحبت می‌کنیم."),
            d("B", "That's great. Many people drift away from their families.", "عالی است. بسیاری از افراد از خانواده‌هایشان دور می‌شوند."),
            d("A", "I know. It's sad. But life gets busy.", "می‌دانم. غم‌انگیز است. ولی زندگی مشغول می‌شود."),
            d("B", "The more busy we get, the more we need to prioritize what matters.", "هرچه مشغول‌تر می‌شویم، بیشتر باید اولویت‌بندی کنیم چه مهم است."),
            d("A", "True. Family should be a priority.", "درست. خانواده باید اولویت باشد."),
            d("B", "For those who have one, yes.", "برای کسانی که دارند، بله."),
            d("A", "What about chosen family? Friends who become like family?", "خانواده انتخابی چطور؟ دوستانی که مثل خانواده می‌شوند؟"),
            d("B", "That's increasingly important. For many people, friends fill the gaps.", "این به طور فزاینده مهم است. برای بسیاری، دوستان شکاف‌ها را پر می‌کنند."),
            d("A", "That's a healthy evolution. Family isn't just biology.", "این تحول سالمی است. خانواده فقط زیست‌شناسی نیست."),
            d("B", "Exactly. It's about love and support, whoever provides it.", "دقیقاً. درباره عشق و حمایت است، هر کسی که فراهمش کند."),
            d("A", "Well, this has been a great conversation.", "خب، این گفت‌وگوی عالی‌ای بود."),
            d("B", "It has. I love talking about these things.", "همینطور است. عاشق صحبت درباره این چیزها هستم."),
            d("A", "Let's continue it sometime.", "بیایید یک وقت دیگر ادامه‌اش دهیم."),
            d("B", "Definitely. Talk soon.", "قطعاً. به‌زودی صحبت."),
            d("A", "Talk soon. Bye!", "به‌زودی صحبت. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is the article about?", listOf("changing family structures", "parenting tips", "marriage advice", "child psychology"), 0),
            q("How does B feel about getting married?", listOf("eager", "pressured sometimes", "totally against it", "already married"), 1),
            q("What does B say about work-life balance?", listOf("it's easy", "it's getting harder", "it's not important", "it's only for mothers"), 1),
            q("What does B say about parental leave?", listOf("it's the same everywhere", "it varies by country", "it's unnecessary", "it's too expensive"), 1),
            q("What is the 'second shift'?", listOf("a night job", "housework after paid work", "a weekend shift", "a career break"), 1),
            q("Families are becoming ___ diverse.", listOf("more and more", "most", "the most", "much"), 0),
            q("Parents are spending ___ time at home.", listOf("less and less", "little", "the least", "fewer"), 0),
            q("The more we communicate, the ___ we understand each other.", listOf("good", "better", "best", "well"), 1),
            q("The earlier children learn responsibility, the ___ they do later.", listOf("good", "better", "best", "well"), 1),
            q("There's a growing ___ of having children later.", listOf("trend", "trending", "trends", "trended"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Drift away from", "دور شدن از", "Many people drift away from their families.", "بسیاری از افراد از خانواده‌هایشان دور می‌شوند."),
            IdiomExpression("Chosen family", "خانواده انتخابی", "Friends can become chosen family.", "دوستان می‌توانند خانواده انتخابی شوند."),
            IdiomExpression("Fill the gaps", "شکاف‌ها را پر کردن", "Friends fill the gaps.", "دوستان شکاف‌ها را پر می‌کنند."),
            IdiomExpression("Generation gap", "شکاف نسلی", "The generation gap can cause misunderstandings.", "شکاف نسلی می‌تواند سوءتفاهم ایجاد کند."),
            IdiomExpression("Quality time", "زمان با کیفیت", "Quality time matters more than quantity.", "زمان با کیفیت مهم‌تر از کمیت است."),
            IdiomExpression("Long way to go", "راه زیادی ماندن", "There's still a long way to go.", "هنوز راه زیادی مانده."),
            IdiomExpression("Persistent problem", "مشکل پایدار", "It's a persistent problem.", "مشکل پایداری است.")
        ),
        phrasal = listOf(
            PhrasalVerb("drift away", "دور شدن", "gradually become distant",
                "People drift away from their families.", "مردم از خانواده‌هایشان دور می‌شوند.", "No"),
            PhrasalVerb("fill in", "پر کردن", "substitute",
                "Friends fill in the gaps.", "دوستان شکاف‌ها را پر می‌کنند.", "Yes"),
            PhrasalVerb("grow up", "بزرگ شدن", "spend childhood",
                "What was your family like growing up?", "خانواده‌ات در کودکی چطور بود؟", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Repeated comparative stress", "Stress both parts: MORE and MORE diverse, LESS and LESS time."),
            PronunciationTip("Double comparative rhythm", "Stress the second clause: The MORE we communicate, the BETTER we understand."),
            PronunciationTip("Trend discussion intonation", "Use falling intonation for statements of fact about trends.")
        ),
        culture = listOf(
            CulturalNote("Changing family structures",
                "Family structures have diversified globally. Nuclear families, single-parent households, blended families, and same-sex parent families are increasingly common. Each presents unique dynamics."),
            CulturalNote("Generational differences",
                "Generational differences in attitudes toward marriage, children, and career are common. The Silent Generation, Baby Boomers, Gen X, Millennials, and Gen Z each have distinct values shaped by their historical context."),
            CulturalNote("Demographic shifts",
                "Many developed countries face declining birth rates and aging populations. This creates challenges for healthcare, pensions, and economic growth, prompting policy debates about incentives and support systems.")
        ),
        mistakes = listOf(
            CommonMistake("Families are becoming more diverse. (missing 'and more')", "Families are becoming more and more diverse.", "Use 'more and more' for repeated comparatives."),
            CommonMistake("The more we communicate, the better we understand. (correct)", "The more we communicate, the better we understand.", "This is correct double comparative."),
            CommonMistake("The earlier children learn, the good they do.", "The earlier children learn, the better they do.", "Use 'the better' not 'the good' in double comparatives.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What family trends does A mention?", "Fewer people marrying young, more having children later, and changing family structures."),
            ComprehensionQuestion("Why does B say work-life balance is getting harder?", "Career advancement and lack of family-friendly policies make balance more difficult."),
            ComprehensionQuestion("What is B's view on chosen family?", "Friends can become family, filling gaps left by biological family."),
            ComprehensionQuestion("What does B say about the second shift?", "Women often do more housework even when working full-time, a persistent problem.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss how family structures have changed in your country.",
                "درباره چگونگی تغییر ساختارهای خانوادگی در کشورت صحبت کن.",
                "There's a growing trend of... / More and more... / Fewer and fewer..."),
            SpeakingTask("Talk about a generational difference you've experienced.",
                "درباره تفاوت نسلی که تجربه کرده‌ای صحبت کن.",
                "The older generation... / My generation... / The more...the more..."),
            SpeakingTask("Debate whether governments should incentivize having children.",
                "بحث کنید که آیا دولت‌ها باید برای بچه‌دار شدن انگیزه ایجاد کنند.",
                "Some argue... / Others believe... / It depends on...")
        ),
        writing = listOf(
            WritingTask("Write an essay about how family life has changed in the last 50 years.",
                "مقاله‌ای درباره چگونگی تغییر زندگی خانوادگی در ۵۰ سال گذشته بنویس.",
                250, "Use repeated and double comparatives.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 9 — History's Mysteries | معماهای تاریخی  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit9() = base(
        9, "History's Mysteries", "معماهای تاریخی",
        listOf(
            "Discuss historical mysteries and theories",
            "Talk about unsolved questions from the past",
            "Use the passive voice for historical events",
            "Use modals for speculation about the past",
            "Debate different historical interpretations"
        ),
        listOf(
            v("mystery", "معما", "The mystery of the pyramids remains unsolved.", "معمای اهرام هنوز حل نشده است."),
            v("ancient", "باستانی", "Ancient civilizations built incredible structures.", "تمدن‌های باستانی ساختارهای باورنکردنی ساختند.", "adjective"),
            v("civilization", "تمدن", "The Maya civilization was highly advanced.", "تمدن مایا بسیار پیشرفته بود."),
            v("artifact", "شیء تاریخی", "The artifact was discovered in 1922.", "شیء تاریخی در سال ۱۹۲۲ کشف شد."),
            v("excavation", "کاوش", "The excavation revealed new evidence.", "کاوش شواهد جدیدی را آشکار کرد."),
            v("archaeologist", "باستان‌شناس", "Archaeologists study ancient remains.", "باستان‌شناسان بقایای باستانی را مطالعه می‌کنند."),
            v("theory", "نظریه", "There are many theories about Atlantis.", "نظریه‌های زیادی درباره آتلانتیس وجود دارد."),
            v("evidence", "شواهد", "The evidence is inconclusive.", "شواهد قطعی نیستند."),
            v("speculate", "گمانه‌زنی کردن", "Historians speculate about what happened.", "تاریخ‌دانان درباره آنچه اتفاق افتاد گمانه‌زنی می‌کنند.", "verb"),
            v("controversial", "بحث‌برانگیز", "The discovery is highly controversial.", "کشف بسیار بحث‌برانگیز است.", "adjective"),
            v("monument", "بنای یادبود", "Stonehenge is a famous monument.", "استون‌هنج بنای یادبود معروفی است."),
            v("inscription", "کتیبه", "The inscription was written in an unknown language.", "کتیبه به زبان ناشناخته‌ای نوشته شده بود."),
            v("decode", "رمزگشایی کردن", "Linguists decoded the ancient script.", "زبان‌شناسان خط باستانی را رمزگشایی کردند.", "verb"),
            v("origin", "منشأ", "The origin of the monument is debated.", "منشأ بنای یادبود مورد بحث است."),
            v("disappearance", "ناپدید شدن", "The disappearance of the colony remains unexplained.", "ناپدید شدن مستعمره توضیح‌داده‌نشده باقی مانده."),
            v("remains", "بقایا", "The remains were found in a cave.", "بقایا در یک غار پیدا شدند."),
            v("excavate", "کاوش کردن", "They excavated the site for years.", "سال‌ها در سایت کاوش کردند.", "verb"),
            v("interpretation", "تفسیر", "There are multiple interpretations of the text.", "تفسیرهای متعددی از متن وجود دارد."),
            v("riddle", "معما", "The riddle has puzzled scholars for centuries.", "معما قرن‌ها دانشمندان را گیج کرده است."),
            v("unsolved", "حل‌نشده", "Many historical mysteries remain unsolved.", "بسیاری از معماهای تاریخی حل‌نشده باقی مانده‌اند.", "adjective")
        ),
        listOf(
            GrammarSection(
                "Passive voice for historical events",
                "Use passive to describe historical facts and events. The pyramids were built over 4,000 years ago. The tomb was discovered in 1922. The inscription was written in an unknown language."
            ),
            GrammarSection(
                "Modals for speculation about the past",
                "Use modal + have + past participle to speculate about past events. The civilization might have collapsed due to drought. They could have been invaded. It must have been a ritual site. The builders may have used ramps."
            ),
            GrammarSection(
                "Discussing theories and interpretations",
                "Use phrases like 'One theory suggests...', 'Some scholars believe...', 'It's been proposed that...', 'The evidence indicates...', 'This supports/contradicts the theory that...' to discuss historical mysteries."
            )
        ),
        listOf(
            d("A", "Hey, I just watched a documentary about ancient mysteries. It was fascinating.", "سلام، تازه مستندی درباره معماهای باستانی دیدم. جذاب بود."),
            d("B", "What was it about?", "درباره چه بود؟"),
            d("A", "Mostly about the Nazca Lines in Peru. Have you heard of them?", "بیشتر درباره خطوط نازکا در پرو. شنیده‌ای؟"),
            d("B", "Vaguely. They're giant drawings in the desert, right?", "کم‌رنگ. نقاشی‌های غول‌آسا در بیابان هستند، درست است؟"),
            d("A", "Yes. Hundreds of them. Some are over 200 meters long.", "بله. صدها تا. برخی بیش از ۲۰۰ متر طول دارند."),
            d("B", "How were they even made? You can't see them from the ground.", "چطور ساخته شده‌اند؟ از زمین نمی‌توانی ببینی‌شان."),
            d("A", "That's the mystery. They were made by removing dark stones to reveal lighter sand.", "این همان معماست. با برداشتن سنگ‌های تیره ساخته شده‌اند تا شن روشن‌تر نمایان شود."),
            d("B", "But why? What was the purpose?", "ولی چرا؟ هدف چه بود؟"),
            d("A", "There are many theories. Some say they were for astronomical purposes.", "نظریه‌های زیادی هست. برخی می‌گویند برای اهداف نجومی بودند."),
            d("B", "Like a giant calendar?", "مثل یک تقویم غول‌آسا؟"),
            d("A", "Exactly. Others think they were processional paths for rituals.", "دقیقاً. دیگران فکر می‌کنند مسیرهای راهپیمایی برای آیین‌ها بودند."),
            d("B", "And some say aliens, right?", "و برخی می‌گویند موجودات فضایی، درست است؟"),
            d("A", "Ha! Yes, that's the most sensational theory. But most archaeologists reject it.", "ها! بله، این جنجالی‌ترین نظریه است. ولی بیشتر باستان‌شناسان ردش می‌کنند."),
            d("B", "Of course. But it's fun to think about.", "البته. ولی فکر کردن به آن سرگرم‌کننده است."),
            d("A", "It is. The Nazca civilization created them between 500 BC and 500 AD.", "هست. تمدن نازکا آن‌ها را بین ۵۰۰ قبل از میلاد و ۵۰۰ میلادی خلق کرد."),
            d("B", "How do we know that?", "از کجا می‌دانیم؟"),
            d("A", "Dating of the pottery and organic materials found nearby.", "تاریخ‌گذاری سفال و مواد آلی یافت‌شده در نزدیکی."),
            d("B", "So it's based on evidence, not just speculation.", "پس بر اساس شواهد است، نه فقط گمانه‌زنی."),
            d("A", "Correct. That's how archaeology works.", "درست. باستان‌شناسی همین‌طور کار می‌کند."),
            d("B", "What other mysteries did the documentary cover?", "چه معماهای دیگری را مستند پوشش داد؟"),
            d("A", "Stonehenge, the Pyramids, and the disappearance of the Maya.", "استون‌هنج، اهرام، و ناپدید شدن مایا."),
            d("B", "The Maya disappearance is fascinating. What happened to them?", "ناپدید شدن مایا جذاب است. چه اتفاقی برایشان افتاد؟"),
            d("A", "They didn't disappear exactly. Their civilization declined. Cities were abandoned.", "دقیقاً ناپدید نشدند. تمدنشان افول کرد. شهرها رها شدند."),
            d("B", "Why?", "چرا؟"),
            d("A", "Likely a combination of drought, deforestation, and warfare.", "احتمالاً ترکیبی از خشکسالی، جنگل‌زدایی، و جنگ."),
            d("B", "So it might have been environmental?", "پس ممکن است زیست‌محیطی بوده؟"),
            d("A", "That's the leading theory. They may have exhausted their resources.", "این نظریه پیشرو است. ممکن است منابعشان را تمام کرده باشند."),
            d("B", "A cautionary tale for us.", "حکایت هشداردهنده‌ای برای ما."),
            d("A", "Absolutely. History repeats itself.", "قطعاً. تاریخ خودش را تکرار می‌کند."),
            d("B", "What about the Pyramids? Any new theories?", "اهرام چطور؟ نظریه جدیدی هست؟"),
            d("A", "The construction methods are still debated. How did they move those massive stones?", "روش‌های ساخت هنوز مورد بحث است. چطور آن سنگ‌های عظیم را جابه‌جا کردند؟"),
            d("B", "They must have used ramps and sleds.", "باید از رمپ و سورتمه استفاده کرده باشند."),
            d("A", "Probably. But the precision is incredible. They're aligned with the stars.", "احتمالاً. ولی دقتشان باورنکردنی است. با ستاره‌ها هم‌راستا هستند."),
            d("B", "The ancient Egyptians were amazing engineers.", "مصریان باستان مهندسان شگفت‌انگیزی بودند."),
            d("A", "They were. And they didn't have modern tools.", "بودند. و ابزار مدرن نداشتند."),
            d("B", "What about Atlantis? Do you think it was real?", "آتلانتیس چطور؟ فکر می‌کنی واقعی بود؟"),
            d("A", "It's probably a philosophical allegory, not a real place.", "احتمالاً یک تمثیل فلسفی است، نه مکان واقعی."),
            d("B", "That's what most scholars think.", "این چیزی است که بیشتر دانشمندان فکر می‌کنند."),
            d("A", "Yes. Plato used it to discuss the ideal society.", "بله. افلاطون از آن برای بحث درباره جامعه آرمانی استفاده کرد."),
            d("B", "But it's a great story.", "ولی داستان عالی‌ای است."),
            d("A", "It is. Stories are powerful.", "هست. داستان‌ها قدرتمندند."),
            d("B", "What's your favorite historical mystery?", "معمای تاریخی مورد علاقه‌ات چیست؟"),
            d("A", "Probably the Antikythera mechanism. It was an ancient Greek computer.", "احتمالاً مکانیزم آنتیکیترا. یک کامپیوتر یونانی باستانی بود."),
            d("B", "A computer? In ancient Greece?", "کامپیوتر؟ در یونان باستان؟"),
            d("A", "Yes! It was used to predict astronomical positions.", "بله! برای پیش‌بینی موقعیت‌های نجومی استفاده می‌شد."),
            d("B", "That's incredible. Who made it?", "باورنکردنی است. چه کسی ساختش؟"),
            d("A", "We don't know. It was found in a shipwreck in 1901.", "نمی‌دانیم. در یک کشتی غرق‌شده در ۱۹۰۱ پیدا شد."),
            d("B", "So it was lost for over 2,000 years?", "پس بیش از ۲۰۰۰ سال گم شده بود؟"),
            d("A", "Yes. And it's more complex than anything else from that era.", "بله. و از هر چیز دیگری از آن دوران پیچیده‌تر است."),
            d("B", "That's mind-blowing.", "ذهن‌انفجار است."),
            d("A", "It shows how much we still don't know about the past.", "نشان می‌دهد چقدر هنوز درباره گذشته نمی‌دانیم."),
            d("B", "True. History is full of surprises.", "درست. تاریخ پر از شگفتی است."),
            d("A", "And every generation reinterprets it.", "و هر نسلی آن را بازتفسیر می‌کند."),
            d("B", "What do you mean?", "منظورت چیست؟"),
            d("A", "Our understanding changes as we find new evidence and ask new questions.", "فهم ما با یافتن شواهد جدید و پرسیدن سؤالات جدید تغییر می‌کند."),
            d("B", "So history isn't fixed?", "پس تاریخ ثابت نیست؟"),
            d("A", "The events are fixed. But their interpretation evolves.", "رویدادها ثابتند. ولی تفسیرشان تکامل می‌یابد."),
            d("B", "That's a good point. We see the past through our own lens.", "نکته خوبی است. گذشته را از دریچه خودمان می‌بینیم."),
            d("A", "Exactly. And that's what makes it fascinating.", "دقیقاً. و همین جذابش می‌کند."),
            d("B", "Well, I want to watch that documentary now.", "خب، الان می‌خواهم آن مستند را ببینم."),
            d("A", "You should. It's on Netflix.", "باید ببینی. در نتفلیکس است."),
            d("B", "Thanks for the recommendation.", "ممنون برای توصیه."),
            d("A", "Anytime. Let me know what you think.", "هر وقت. بگو چه فکر می‌کنی."),
            d("B", "I will. See you soon.", "می‌گویم. به‌زودی می‌بینمت."),
            d("A", "See you. Enjoy the mysteries!", "می‌بینمت. از معماها لذت ببر!"),
            d("B", "Thanks. Bye!", "ممنون. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What are the Nazca Lines?", listOf("cave paintings", "giant desert drawings", "stone monuments", "ancient temples"), 1),
            q("What is the most sensational theory about the Nazca Lines?", listOf("astronomical calendar", "aliens", "ritual paths", "water channels"), 1),
            q("What happened to the Maya civilization?", listOf("they disappeared completely", "their cities were abandoned", "they moved to Europe", "they were conquered"), 1),
            q("What is the leading theory for the Maya decline?", listOf("invasion", "disease", "environmental factors", "earthquake"), 2),
            q("What is the Antikythera mechanism?", listOf("a temple", "an ancient computer", "a ship", "a statue"), 1),
            q("The pyramids ___ built over 4,000 years ago.", listOf("were", "was", "are", "have"), 0),
            q("The tomb ___ discovered in 1922.", listOf("were", "was", "is", "has"), 1),
            q("They ___ have used ramps and sleds.", listOf("must", "should", "can", "will"), 0),
            q("The civilization ___ have collapsed due to drought.", listOf("might", "should", "can", "will"), 0),
            q("It ___ have been a ritual site.", listOf("must", "should", "can", "will"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Mind-blowing", "ذهن‌انفجار", "That's mind-blowing.", "ذهن‌انفجار است."),
            IdiomExpression("Cautionary tale", "حکایت هشداردهنده", "A cautionary tale for us.", "حکایت هشداردهنده‌ای برای ما."),
            IdiomExpression("History repeats itself", "تاریخ خودش را تکرار می‌کند", "History repeats itself.", "تاریخ خودش را تکرار می‌کند."),
            IdiomExpression("Leading theory", "نظریه پیشرو", "That's the leading theory.", "این نظریه پیشرو است."),
            IdiomExpression("Through our own lens", "از دریچه خودمان", "We see the past through our own lens.", "گذشته را از دریچه خودمان می‌بینیم."),
            IdiomExpression("Vaguely", "کم‌رنگ", "I vaguely remember.", "کم‌رنگ به یاد دارم."),
            IdiomExpression("Full of surprises", "پر از شگفتی", "History is full of surprises.", "تاریخ پر از شگفتی است.")
        ),
        phrasal = listOf(
            PhrasalVerb("come up with", "به ذهن رسیدن", "create / devise",
                "They came up with a theory.", "نظریه‌ای ارائه دادند.", "No"),
            PhrasalVerb("find out", "فهمیدن", "discover",
                "We still don't know how it was made.", "هنوز نمی‌دانیم چطور ساخته شد.", "Yes"),
            PhrasalVerb("look into", "بررسی کردن", "investigate",
                "Archaeologists are looking into it.", "باستان‌شناسان در حال بررسی آن هستند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Passive voice stress", "Stress the past participle: The pyramids were BUILT 4,000 years ago."),
            PronunciationTip("Speculative modal stress", "Stress 'have' in speculation: They MUST have used ramps."),
            PronunciationTip("Historical term stress", "Stress first syllable: ARchaeologist, CIVilization, MONument.")
        ),
        culture = listOf(
            CulturalNote("Nazca Lines",
                "The Nazca Lines are a UNESCO World Heritage Site. Created between 500 BC and 500 AD, they include geometric shapes, animal figures, and human-like forms. Their purpose remains debated."),
            CulturalNote("The Maya decline",
                "The Maya civilization reached its peak around 250-900 AD. Its decline is attributed to a combination of drought, deforestation, warfare, and overpopulation. Cities like Tikal and Palenque were abandoned."),
            CulturalNote("Antikythera mechanism",
                "Discovered in a shipwreck in 1901, the Antikythera mechanism is considered the world's first analog computer. It was used to predict astronomical positions and eclipses."),
            CulturalNote("Historical interpretation",
                "Historical interpretation evolves as new evidence is discovered and new perspectives emerge. What was once accepted as fact may be revised. This is the nature of historical scholarship.")
        ),
        mistakes = listOf(
            CommonMistake("The pyramids was built long ago.", "The pyramids were built long ago.", "Use 'were' with plural nouns in passive."),
            CommonMistake("They must used ramps.", "They must have used ramps.", "Use 'must have + past participle' for speculation."),
            CommonMistake("It could been a ritual site.", "It could have been a ritual site.", "Use 'could have been' for past speculation.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What theories exist about the Nazca Lines?", "Astronomical purposes, processional paths for rituals, and sensational alien theories."),
            ComprehensionQuestion("Why did the Maya civilization decline?", "Likely a combination of drought, deforestation, warfare, and resource depletion."),
            ComprehensionQuestion("What is significant about the Antikythera mechanism?", "It was an ancient Greek analog computer, more complex than anything else from its era.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a historical mystery that fascinates you.",
                "درباره معمای تاریخی که برایت جذاب است صحبت کن.",
                "One theory suggests... / It might have been... / The evidence indicates..."),
            SpeakingTask("Debate different interpretations of a historical event.",
                "درباره تفسیرهای مختلف یک رویداد تاریخی بحث کنید.",
                "Some scholars believe... / Others argue... / The evidence supports..."),
            SpeakingTask("Speculate about how an ancient structure was built.",
                "گمانه‌زنی کن که یک ساختار باستانی چگونه ساخته شده است.",
                "They must have... / They could have... / It might have been...")
        ),
        writing = listOf(
            WritingTask("Write an essay about a historical mystery and its competing theories.",
                "مقاله‌ای درباره یک معمای تاریخی و نظریه‌های رقیبش بنویس.",
                250, "Use passive voice and modals for speculation about the past.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 10 — Your Free Time | اوقات فراغت  (≈ 220 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit10() = base(
        10, "Your Free Time", "اوقات فراغت",
        listOf(
            "Discuss hobbies and leisure activities",
            "Talk about how you spend your free time",
            "Use causatives (have/get something done)",
            "Use expressions for relaxation and stress relief",
            "Debate the value of leisure in modern life"
        ),
        listOf(
            v("hobby", "سرگرمی", "Photography is my main hobby.", "عکاسی سرگرمی اصلی من است."),
            v("leisure", "اوقات فراغت", "I value my leisure time.", "برای اوقات فراغتم ارزش قائلم."),
            v("recreation", "تفریح", "The park is used for recreation.", "پارک برای تفریح استفاده می‌شود."),
            v("pastime", "سرگرمی", "Reading is a popular pastime.", "خواندن یک سرگرمی محبوب است."),
            v("relaxation", "آرامش", "Yoga is my form of relaxation.", "یوگا شکل آرامش من است."),
            v("stress relief", "رفع استرس", "Exercise is great for stress relief.", "ورزش برای رفع استرس عالی است."),
            v("unwind", "آرام شدن", "I need to unwind after work.", "بعد از کار باید آرام شوم.", "verb"),
            v("recharge", "شارژ شدن", "Weekends help me recharge.", "آخر هفته‌ها به من کمک می‌کنند شارژ شوم.", "verb"),
            v("work-life balance", "تعادل کار و زندگی", "Work-life balance is essential.", "تعادل کار و زندگی ضروری است."),
            v("burnout", "فرسودگی", "Burnout is a real risk.", "فرسودگی یک خطر واقعی است."),
            v("mindfulness", "ذهن‌آگاهی", "Mindfulness helps reduce stress.", "ذهن‌آگاهی به کاهش استرس کمک می‌کند."),
            v("meditation", "مدیتیشن", "Meditation is a daily practice for me.", "مدیتیشن تمرین روزانه من است."),
            v("gardening", "باغبانی", "Gardening is therapeutic.", "باغبانی درمانی است."),
            v("DIY", "کارهای دستی", "I do a lot of DIY projects.", "پروژه‌های DIY زیادی انجام می‌دهم."),
            v("craft", "صنایع دستی", "She enjoys doing crafts.", "او از صنایع دستی لذت می‌برد."),
            v("collect", "جمع‌آوری کردن", "He collects vintage records.", "او صفحه‌های قدیمی جمع‌آوری می‌کند.", "verb"),
            v("volunteer", "داوطلب شدن", "I volunteer on weekends.", "آخر هفته‌ها داوطلب می‌شوم.", "verb"),
            v("passion", "شور", "Music is my passion.", "موسیقی شور من است."),
            v("fulfillment", "رضایت", "Hobbies bring fulfillment.", "سرگرمی‌ها رضایت می‌آورند."),
            v("escape", "فرار", "Books are my escape.", "کتاب‌ها فرار من هستند.")
        ),
        listOf(
            GrammarSection(
                "Causatives: have/get something done",
                "Use 'have/get + object + past participle' when someone does something for you. I had my car repaired. She got her hair cut. We're having our house painted. He got his suit dry-cleaned."
            ),
            GrammarSection(
                "Expressions for relaxation",
                "Use phrases like 'take time to...', 'make time for...', 'wind down', 'unplug', 'recharge my batteries', 'clear my head', 'get away from it all' to discuss leisure."
            ),
            GrammarSection(
                "Discussing the value of leisure",
                "Use phrases like 'It's essential for...', 'Without it, I would...', 'It helps me...', 'I can't imagine life without...', 'It's a priority for me' to discuss the importance of free time."
            )
        ),
        listOf(
            d("A", "So, what do you do in your free time? I feel like I never have any.", "خب، در اوقات فراغتت چه کار می‌کنی؟ حس می‌کنم هرگز وقت آزاد ندارم."),
            d("B", "Honestly, I used to feel the same way. But I started making time for hobbies.", "راستش، قبلاً همین حس را داشتم. ولی شروع کردم به وقت گذاشتن برای سرگرمی‌ها."),
            d("A", "How did you do that?", "چطور این کار را کردی؟"),
            d("B", "I scheduled them. Like appointments. It sounds weird, but it works.", "برنامه‌ریزی کردم. مثل قرار ملاقات. عجیب به نظر می‌رسد، ولی کار می‌کند."),
            d("A", "So you actually put 'hobby time' in your calendar?", "پس واقعاً «زمان سرگرمی» را در تقویمت می‌گذاری؟"),
            d("B", "Yes! Otherwise it never happens. Work expands to fill all available time.", "بله! وگرنه هرگز اتفاق نمی‌افتد. کار برای پر کردن تمام وقت موجود گسترش می‌یابد."),
            d("A", "That's so true. So what are your hobbies?", "این خیلی درست است. خب سرگرمی‌هایت چیست؟"),
            d("B", "I garden. I read. And I've been learning to play the piano.", "باغبانی می‌کنم. کتاب می‌خوانم. و یاد می‌گیرم پیانو بزنم."),
            d("A", "Piano! That's impressive. How long have you been learning?", "پیانو! تحسین‌برانگیز است. چقدر است یاد می‌گیری؟"),
            d("B", "About two years now. I'm not great, but I enjoy it.", "حدود دو سال. عالی نیستم، ولی لذت می‌برم."),
            d("A", "Do you take lessons?", "کلاس می‌روی؟"),
            d("B", "Yes, once a week. And I practice most evenings.", "بله، هفته‌ای یک بار. و بیشتر عصرها تمرین می‌کنم."),
            d("A", "That's dedication. What made you start?", "این فداکاری است. چه چیزی باعث شد شروع کنی؟"),
            d("B", "I needed something that wasn't work. Something just for me.", "به چیزی نیاز داشتم که کار نباشد. چیزی فقط برای خودم."),
            d("A", "I get that. I feel like my whole life is work and chores.", "می‌فهمم. حس می‌کنم تمام زندگی‌ام کار و کارهای خانه است."),
            d("B", "What about exercise? Do you do anything?", "ورزش چطور؟ کاری انجام می‌دهی؟"),
            d("A", "I run sometimes. But it feels like another obligation.", "گاهی می‌دوم. ولی مثل یک الزام دیگر حس می‌شود."),
            d("B", "Maybe you need something more playful.", "شاید به چیزی بازیگوشانه‌تر نیاز داری."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "What did you enjoy as a kid?", "در کودکی از چه لذت می‌بردی؟"),
            d("A", "I loved drawing. And building things.", "عاشق نقاشی کردن بودم. و ساختن چیزها."),
            d("B", "There you go. Maybe try art or DIY projects.", "همین. شاید هنر یا پروژه‌های DIY را امتحان کن."),
            d("A", "I haven't drawn in years. I'm probably terrible now.", "سال‌هاست نقاشی نکرده‌ام. احتمالاً الان وحشتناکم."),
            d("B", "It doesn't matter. It's not about being good. It's about enjoying it.", "مهم نیست. درباره خوب بودن نیست. درباره لذت بردن است."),
            d("A", "That's a good point. I always make things into competitions.", "نکته خوبی است. همیشه چیزها را به مسابقه تبدیل می‌کنم."),
            d("B", "We all do. But hobbies should be pressure-free.", "همه‌مان همین کار را می‌کنیم. ولی سرگرمی‌ها باید بدون فشار باشند."),
            d("A", "So how do you avoid turning piano into another stress?", "پس چطور از تبدیل پیانو به استرس دیگری پرهیز می‌کنی؟"),
            d("B", "I remind myself it's for joy, not achievement.", "به خودم یادآوری می‌کنم برای شادی است، نه دستاورد."),
            d("A", "Does that work?", "کار می‌کند؟"),
            d("B", "Mostly. Some days I'm frustrated. But I keep going.", "بیشتر وقت‌ها. برخی روزها ناامیدم. ولی ادامه می‌دهم."),
            d("A", "What keeps you motivated?", "چه چیزی انگیزه‌ات را نگه می‌دارد؟"),
            d("B", "The feeling after. When I finish practicing, I feel calmer.", "حس بعدش. وقتی تمرین را تمام می‌کنم، آرام‌تر حس می‌کنم."),
            d("A", "So it's like meditation?", "پس مثل مدیتیشن است؟"),
            d("B", "Exactly. It's mindfulness through music.", "دقیقاً. ذهن‌آگاهی از طریق موسیقی است."),
            d("A", "I've heard mindfulness is good for stress.", "شنیده‌ام ذهن‌آگاهی برای استرس خوب است."),
            d("B", "It is. Do you ever meditate?", "هست. تا حالا مدیتیشن کرده‌ای؟"),
            d("A", "I tried. I couldn't sit still.", "امتحان کردم. نمی‌توانستم بی‌حرکت بنشینم."),
            d("B", "That's normal at first. Try just five minutes.", "اولش طبیعی است. فقط پنج دقیقه امتحان کن."),
            d("A", "Five minutes I could probably do.", "پنج دقیقه احتمالاً می‌توانم."),
            d("B", "There are apps that guide you. They help.", "اپ‌هایی هستند که راهنمایی می‌کنند. کمک می‌کنند."),
            d("A", "I'll look into it. So what else do you do for fun?", "بررسی می‌کنم. دیگر برای سرگرمی چه می‌کنی؟"),
            d("B", "I get together with friends. We have a board game night once a month.", "با دوستان دور هم جمع می‌شوم. ماهی یک بار شب بازی رومیزی داریم."),
            d("A", "Board games! That sounds fun.", "بازی رومیزی! سرگرم‌کننده به نظر می‌رسد."),
            d("B", "It's a great way to socialize without screens.", "روش عالی برای اجتماعی بودن بدون صفحه‌نمایش است."),
            d("A", "I spend too much time on screens.", "من زمان زیادی روی صفحه‌نمایش می‌گذرانم."),
            d("B", "Most of us do. That's why hobbies are important.", "بیشتر ما همینطوریم. برای همین سرگرمی‌ها مهم هستند."),
            d("A", "What about volunteering? Do you do that?", "داوطلبی چطور؟ انجام می‌دهی؟"),
            d("B", "Sometimes. I help at a community garden on Saturdays.", "گاهی. شنبه‌ها در یک باغ اجتماعی کمک می‌کنم."),
            d("A", "That combines gardening and volunteering!", "این باغبانی و داوطلبی را ترکیب می‌کند!"),
            d("B", "Exactly. Double the fulfillment.", "دقیقاً. دو برابر رضایت."),
            d("A", "I never thought of volunteering as a hobby.", "هرگز به داوطلبی به عنوان سرگرمی فکر نکرده‌ام."),
            d("B", "It can be. It's meaningful and social.", "می‌تواند باشد. معنی‌دار و اجتماعی است."),
            d("A", "What's the most rewarding thing you've done?", "پاداش‌دهنده‌ترین کاری که کرده‌ای چیست؟"),
            d("B", "Teaching kids to read. I did it for a year.", "یاد دادن خواندن به بچه‌ها. یک سال انجامش دادم."),
            d("A", "That must have been wonderful.", "باید فوق‌العاده بوده باشد."),
            d("B", "It was. Seeing their progress was incredibly fulfilling.", "بود. دیدن پیشرفتشان فوق‌العاده رضایت‌بخش بود."),
            d("A", "I'd like to do something like that.", "دوست دارم کار مشابهی انجام دهم."),
            d("B", "You should. Find a cause you care about.", "باید بکنی. هدفی که برایت مهم است پیدا کن."),
            d("A", "What about reading? You mentioned you read.", "خواندن چطور؟ گفتی کتاب می‌خوانی."),
            d("B", "Yes, mostly fiction. It's my escape.", "بله، بیشتر داستان. فرار من است."),
            d("A", "What are you reading now?", "الان چه می‌خوانی؟"),
            d("B", "A novel set in 1920s Paris. Very atmospheric.", "رمانی که در پاریس دهه ۱۹۲۰ می‌گذرد. فضای خیلی خوبی دارد."),
            d("A", "Sounds nice. I used to read a lot.", "خوب به نظر می‌رسد. قبلاً زیاد می‌خواندم."),
            d("B", "What made you stop?", "چه چیزی باعث شد ترک کنی؟"),
            d("A", "Life. I just got busy.", "زندگی. فقط مشغول شدم."),
            d("B", "You can always start again. Even ten minutes a day.", "همیشه می‌توانی دوباره شروع کنی. حتی روزی ده دقیقه."),
            d("A", "You're right. I'll try tonight.", "حق داری. امشب امتحان می‌کنم."),
            d("B", "That's the spirit. Small steps.", "همینه. قدم‌های کوچک."),
            d("A", "So what's your biggest takeaway about free time?", "خب بزرگ‌ترین برداشتت درباره اوقات فراغت چیست؟"),
            d("B", "That it's not a luxury. It's essential.", "که تجمل نیست. ضروری است."),
            d("A", "For mental health?", "برای سلامت روان؟"),
            d("B", "For everything. Without it, you burn out.", "برای همه چیز. بدون آن، فرسوده می‌شوی."),
            d("A", "I've felt close to burnout before.", "قبلاً نزدیک فرسودگی بوده‌ام."),
            d("B", "Then you know. It's not worth it.", "پس می‌دانی. ارزشش را ندارد."),
            d("A", "No, it's not. I'm going to make changes.", "نه، ندارد. می‌خواهم تغییرات ایجاد کنم."),
            d("B", "What's the first one?", "اولی چیست؟"),
            d("A", "I'm going to buy a sketchbook and draw again.", "می‌خواهم یک دفتر طراحی بخرم و دوباره نقاشی کنم."),
            d("B", "That's wonderful. Let me know how it goes.", "فوق‌العاده است. بگو چطور پیش رفت."),
            d("A", "I will. Thanks for the inspiration.", "می‌گویم. ممنون برای الهام."),
            d("B", "Anytime. Enjoy your drawing!", "هر وقت. از نقاشی‌ات لذت ببر!"),
            d("A", "Thanks. See you soon!", "ممنون. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How does B make time for hobbies?", listOf("quits work early", "schedules them like appointments", "hires help", "reduces sleep"), 1),
            q("What instrument is B learning?", listOf("guitar", "piano", "violin", "drums"), 1),
            q("What does B say hobbies should be?", listOf("competitive", "pressure-free", "productive", "expensive"), 1),
            q("What does B do on Saturdays?", listOf("garden at home", "volunteer at a community garden", "play board games", "read"), 1),
            q("What does A decide to start doing again?", listOf("running", "drawing", "cooking", "reading"), 1),
            q("I had my car ___.", listOf("repair", "repaired", "repairing", "to repair"), 1),
            q("She got her hair ___.", listOf("cut", "cutting", "to cut", "cuts"), 0),
            q("We're having our house ___.", listOf("paint", "painted", "painting", "to paint"), 1),
            q("He got his suit ___.", listOf("dry-clean", "dry-cleaned", "dry-cleaning", "to dry-clean"), 1),
            q("I need to ___ after work.", listOf("unwind", "unwinding", "unwound", "unwinds"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Recharge my batteries", "شارژ شدن", "Weekends help me recharge my batteries.", "آخر هفته‌ها به من کمک می‌کنند شارژ شوم."),
            IdiomExpression("Clear my head", "ذهنم را خالی کردن", "I need to clear my head.", "باید ذهنم را خالی کنم."),
            IdiomExpression("Get away from it all", "از همه چیز فاصله گرفتن", "I need to get away from it all.", "باید از همه چیز فاصله بگیرم."),
            IdiomExpression("There you go", "همین", "There you go. Try art.", "همین. هنر را امتحان کن."),
            IdiomExpression("Burn out", "فرسوده شدن", "Without leisure, you burn out.", "بدون فراغت، فرسوده می‌شوی."),
            IdiomExpression("That's the spirit", "همینه!", "That's the spirit. Small steps.", "همینه. قدم‌های کوچک."),
            IdiomExpression("Wind down", "آرام شدن", "I need to wind down before bed.", "باید قبل از خواب آرام شوم.")
        ),
        phrasal = listOf(
            PhrasalVerb("wind down", "آرام شدن", "relax",
                "I need to wind down after work.", "بعد از کار باید آرام شوم.", "No"),
            PhrasalVerb("unplug", "قطع کردن", "disconnect from technology",
                "I try to unplug on weekends.", "سعی می‌کنم آخر هفته‌ها قطع کنم.", "No"),
            PhrasalVerb("get together", "دور هم جمع شدن", "meet socially",
                "We get together for board games.", "برای بازی رومیزی دور هم جمع می‌شویم.", "No"),
            PhrasalVerb("look into", "بررسی کردن", "investigate",
                "I'll look into meditation apps.", "اپ‌های مدیتیشن را بررسی می‌کنم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Causative stress", "Stress the past participle: I had my car rePAIRED."),
            PronunciationTip("Relaxation vocabulary stress", "Stress first syllable: MEDitation, MINDfulness, GARdening."),
            PronunciationTip("Intonation for encouragement", "Use rising intonation: There you go! ↗ That's the spirit! ↗")
        ),
        culture = listOf(
            CulturalNote("The importance of leisure",
                "Leisure time is essential for well-being. Research shows that hobbies reduce stress, improve mood, and increase life satisfaction. Many cultures value leisure differently, but its benefits are universal."),
            CulturalNote("Hobbies and identity",
                "Hobbies often form part of personal identity. They allow self-expression, skill development, and social connection. In retirement, hobbies become especially important for maintaining purpose and social ties."),
            CulturalNote("Digital detox",
                "The concept of 'digital detox' — intentionally disconnecting from devices — has gained popularity. Many people find that reducing screen time improves focus, sleep, and relationships.")
        ),
        mistakes = listOf(
            CommonMistake("I had my car repair.", "I had my car repaired.", "Use past participle in causative."),
            CommonMistake("She got her hair cutting.", "She got her hair cut.", "Use past participle in causative."),
            CommonMistake("I need to unwind myself.", "I need to unwind.", "Unwind is already reflexive in meaning.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How does B make time for hobbies?", "B schedules them like appointments to ensure they happen."),
            ComprehensionQuestion("What does B say about the purpose of hobbies?", "Hobbies should be for joy, not achievement, and should be pressure-free."),
            ComprehensionQuestion("What does B say about burnout?", "Without leisure time, burnout is a real risk; leisure is essential, not a luxury.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your hobbies and how you make time for them.",
                "سرگرمی‌هایت را توصیف کن و بگو چطور برایشان وقت می‌گذاری.",
                "I enjoy... / I make time by... / It helps me..."),
            SpeakingTask("Discuss the importance of leisure for mental health.",
                "درباره اهمیت اوقات فراغت برای سلامت روان صحبت کن.",
                "Leisure is essential because... / Without it... / It helps me..."),
            SpeakingTask("Role-play planning a hobby schedule with a partner.",
                "نقش‌بازی برنامه‌ریزی برنامه سرگرمی با یک دوست.",
                "Let's schedule... / How about...? / I need to make time for...")
        ),
        writing = listOf(
            WritingTask("Write a personal essay about how you spend your free time and why it matters.",
                "مقاله شخصی درباره چگونگی گذراندن اوقات فراغتت و اینکه چرا مهم است بنویس.",
                250, "Use causatives and expressions for relaxation.")
        )
    )
}