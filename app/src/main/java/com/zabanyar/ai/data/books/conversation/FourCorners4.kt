package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Four Corners 4 — Complete Course Content
 * 12 Units | Upper-Intermediate (B1+)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles and grammar points match the official Cambridge Scope & Sequence
 */
object FourCorners4 {
    const val BOOK_ID = "four_corners_4"

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
    // UNIT 1 — The news | اخبار
    // ═══════════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "The news", "اخبار",
        listOf(
            "Tell news stories",
            "Agree and disagree with opinions",
            "Ask questions and talk about a news story",
            "Discuss a news story"
        ),
        listOf(
            v("headline", "تیتر خبر", "The headline caught my attention.", "تیتر خبر توجهم را جلب کرد."),
            v("journalist", "روزنامه‌نگار", "She's a famous journalist.", "او روزنامه‌نگار معروفی است."),
            v("broadcast", "پخش کردن", "The news is broadcast live.", "اخبار زنده پخش می‌شود.", "verb"),
            v("coverage", "پوشش خبری", "The coverage was extensive.", "پوشش خبری گسترده بود."),
            v("source", "منبع", "We need a reliable source.", "به منبع معتبری نیاز داریم."),
            v("citizen journalism", "روزنامه‌نگاری شهروندی", "Citizen journalism is growing.", "روزنامه‌نگاری شهروندی در حال رشد است."),
            v("survive", "جان سالم به در بردن", "They survived the crash.", "آن‌ها از سقوط جان سالم به در بردند.", "verb"),
            v("rescue", "نجات دادن", "Firefighters rescued the family.", "آتش‌نشانان خانواده را نجات دادند.", "verb"),
            v("threaten", "تهدید کردن", "The storm threatened the coast.", "طوفان ساحل را تهدید کرد.", "verb"),
            v("recover", "بهبود یافتن", "He's recovering from surgery.", "او از جراحی بهبود می‌یابد.", "verb"),
            v("investigate", "تحقیق کردن", "Police are investigating the case.", "پلیس در حال تحقیق روی پرونده است.", "verb"),
            v("witness", "شاهد", "She was a witness to the accident.", "او شاهد تصادف بود."),
            v("emergency", "اضطراری", "Call 911 in an emergency.", "در مواقع اضطراری با ۹۱۱ تماس بگیرید."),
            v("reliable", "قابل اعتماد", "Is this source reliable?", "آیا این منبع قابل اعتماد است؟", "adjective"),
            v("accurate", "دقیق", "The report was accurate.", "گزارش دقیق بود.", "adjective")
        ),
        listOf(
            GrammarSection("Verb tenses – statements", "Review of present, past, and perfect tenses in news reporting. The president has announced... The accident happened..."),
            GrammarSection("Verb tenses – questions", "Forming questions in different tenses. What happened? Have you heard? Did they report?"),
            GrammarSection("Reporting verbs", "say, tell, report, claim, announce. The journalist reported that..."),
            GrammarSection("Passive voice in news", "The suspect was arrested. The building was damaged. News is often written in passive.")
        ),
        listOf(
            d("A", "Hey, Maria! Did you see the news today?", "هی، ماریا! امروز اخبار را دیدی؟"),
            d("B", "No, I've been busy all morning. What happened?", "نه، تمام صبح مشغول بوده‌ام. چه اتفاقی افتاد؟"),
            d("A", "There was a big story about citizen journalism.", "خبر بزرگی درباره روزنامه‌نگاری شهروندی بود."),
            d("B", "Citizen journalism? What's that exactly?", "روزنامه‌نگاری شهروندی؟ دقیقاً چیست؟"),
            d("A", "It's when ordinary people report news using their phones.", "زمانی است که مردم عادی با گوشی‌هایشان اخبار را گزارش می‌دهند."),
            d("B", "Oh, I've heard about that. It's becoming more common.", "اوه، درباره‌اش شنیده‌ام. دارد رایج‌تر می‌شود."),
            d("A", "Exactly. The story said anyone can be a journalist now.", "دقیقاً. خبر گفت الان هر کسی می‌تواند روزنامه‌نگار باشد."),
            d("B", "That's interesting. But is the information reliable?", "جالب است. ولی آیا اطلاعات قابل اعتماد است؟"),
            d("A", "That's the problem. Not all sources are accurate.", "مشکل همین است. همه منابع دقیق نیستند."),
            d("B", "I totally agree. We need to check our sources.", "کاملاً موافقم. باید منابعمان را بررسی کنیم."),
            d("A", "The article mentioned a recent rescue story.", "مقاله به یک داستان نجات اخیر اشاره کرد."),
            d("B", "What happened?", "چه اتفاقی افتاد؟"),
            d("A", "A hiker survived five days in the mountains.", "یک کوهنورد پنج روز در کوهستان زنده ماند."),
            d("B", "Wow. How did they find him?", "واو. چطور پیدایش کردند؟"),
            d("A", "His family shared photos on social media. Someone recognized him.", "خانواده‌اش عکس‌ها را در شبکه‌های اجتماعی به اشتراک گذاشتند. یک نفر او را شناخت."),
            d("B", "That's the power of citizen journalism!", "این قدرت روزنامه‌نگاری شهروندی است!"),
            d("A", "It is. But sometimes false information spreads too.", "هست. ولی گاهی اطلاعات نادرست هم پخش می‌شود."),
            d("B", "True. Have you ever shared news without checking?", "درست. هیچ‌وقت خبری را بدون بررسی به اشتراک گذاشته‌ای؟"),
            d("A", "I have to admit, I did once. It was embarrassing.", "باید اعتراف کنم، یک بار کردم. خجالت‌آور بود."),
            d("B", "Don't worry. Many people have done that.", "نگران نباش. خیلی‌ها این کار را کرده‌اند."),
            d("A", "Now I always check two or three sources first.", "حالا همیشه اول دو سه منبع را بررسی می‌کنم."),
            d("B", "That's smart. Do you watch the news every day?", "هوشمندانه است. هر روز اخبار تماشا می‌کنی؟"),
            d("A", "I try to. But sometimes it's too depressing.", "سعی می‌کنم. ولی گاهی خیلی افسرده‌کننده است."),
            d("B", "I know what you mean. There's so much bad news.", "می‌دانم منظورت چیست. اخبار بد خیلی زیاد است."),
            d("A", "That's why I also follow good news accounts.", "برای همین حساب‌های خبری خوب را هم دنبال می‌کنم."),
            d("B", "Good idea. What kind of stories do you like?", "فکر خوبی. چه نوع داستان‌هایی دوست داری؟"),
            d("A", "I like survival stories and scientific discoveries.", "داستان‌های بقا و کشف‌های علمی را دوست دارم."),
            d("B", "Me too. They give me hope.", "من هم. به من امید می‌دهند."),
            d("A", "Exactly. What about you? What do you follow?", "دقیقاً. تو چطور؟ چه چیزی را دنبال می‌کنی؟"),
            d("B", "Mostly local news. I like to know what's happening nearby.", "بیشتر اخبار محلی. دوست دارم بدانم نزدیک چه خبر است."),
            d("A", "That's important. Community news often gets ignored.", "مهم است. اخبار جامعه اغلب نادیده گرفته می‌شود."),
            d("B", "True. My neighborhood has a great local blog.", "درست. محله‌ام وبلاگ محلی عالی‌ای دارد."),
            d("A", "Who writes it?", "چه کسی می‌نویسدش؟"),
            d("B", "A retired journalist. She covers everything.", "یک روزنامه‌نگار بازنشسته. همه چیز را پوشش می‌دهد."),
            d("A", "That's wonderful. Do you ever contribute?", "شگفت‌انگیز است. هیچ‌وقت مشارکت می‌کنی؟"),
            d("B", "Sometimes. I send photos of local events.", "گاهی. عکس‌های رویدادهای محلی را می‌فرستم."),
            d("A", "So you're a citizen journalist too!", "پس تو هم روزنامه‌نگار شهروندی هستی!"),
            d("B", "Ha! I guess I am. It feels good to contribute.", "ها! فکر می‌کنم هستم. مشارکت حس خوبی دارد."),
            d("A", "I should find something in my area too.", "من هم باید چیزی در منطقه‌ام پیدا کنم."),
            d("B", "You should. Every community needs good reporters.", "باید بکنی. هر جامعه‌ای به خبرنگاران خوب نیاز دارد."),
            d("A", "What's the most interesting story you've covered?", "جالب‌ترین خبری که پوشش داده‌ای چیست؟"),
            d("B", "A lost dog that was found after two weeks!", "یک سگ گم‌شده که بعد از دو هفته پیدا شد!"),
            d("A", "Ha! That's a great story.", "ها! داستان عالی‌ای است."),
            d("B", "It was. The whole neighborhood helped search.", "بود. کل محله به جستجو کمک کردند."),
            d("A", "That's community spirit.", "این روحیه اجتماعی است."),
            d("B", "Yes. That's what local news is all about.", "بله. اخبار محلی دقیقاً همین است."),
            d("A", "Do you think traditional newspapers will survive?", "فکر می‌کنی روزنامه‌های سنتی زنده می‌مانند؟"),
            d("B", "Some will. The ones that adapt to digital.", "برخی. آن‌هایی که با دیجیتال سازگار شوند."),
            d("A", "I hope so. We need professional journalists.", "امیدوارم. به روزنامه‌نگاران حرفه‌ای نیاز داریم."),
            d("B", "Definitely. They investigate important stories.", "قطعاً. آن‌ها روی داستان‌های مهم تحقیق می‌کنند."),
            d("A", "Like corruption and social issues.", "مثل فساد و مسائل اجتماعی."),
            d("B", "Exactly. Citizen journalists can't do everything.", "دقیقاً. روزنامه‌نگاران شهروندی نمی‌توانند همه کارها را انجام دهند."),
            d("A", "True. It's a team effort.", "درست. یک تلاش تیمی است."),
            d("B", "Well said. Hey, I have to go. Let's talk later.", "خوب گفتی. هی، باید بروم. بعداً صحبت کنیم."),
            d("A", "Sure. Send me that local blog link!", "حتماً. لینک آن وبلاگ محلی را برایم بفرست!"),
            d("B", "I will. See you soon!", "می‌فرستم. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!")
        ),
        listOf(
            q("What is citizen journalism?", listOf("professional reporting", "ordinary people reporting news", "government news", "sports reporting"), 1),
            q("How long did the hiker survive?", listOf("3 days", "5 days", "7 days", "10 days"), 1),
            q("How was the hiker found?", listOf("search dogs", "social media photos", "helicopter", "a map"), 1),
            q("What kind of news does Maria follow?", listOf("international", "sports", "local", "entertainment"), 2),
            q("The suspect ___ arrested yesterday.", listOf("is", "was", "are", "were"), 1),
            q("The building ___ damaged in the storm.", listOf("is", "was", "are", "were"), 1),
            q("She ___ that she saw the accident.", listOf("reported", "reports", "reporting", "report"), 0),
            q("What ___ yesterday?", listOf("happened", "happens", "happening", "happen"), 0)
        ),
        idioms = listOf(
            IdiomExpression("I totally agree", "کاملاً موافقم", "I totally agree.", "کاملاً موافقم."),
            IdiomExpression("Check your sources", "منابعت را بررسی کن", "Always check your sources.", "همیشه منابعت را بررسی کن."),
            IdiomExpression("Community spirit", "روحیه اجتماعی", "That's community spirit.", "این روحیه اجتماعی است."),
            IdiomExpression("Team effort", "تلاش تیمی", "It's a team effort.", "یک تلاش تیمی است.")
        ),
        phrasal = listOf(
            PhrasalVerb("find out", "فهمیدن", "discover", "I found out about it online.", "آنلاین فهمیدم.", "No"),
            PhrasalVerb("spread out", "پخش شدن", "extend", "The news spread out quickly.", "خبر سریع پخش شد.", "No"),
            PhrasalVerb("check out", "بررسی کردن", "examine", "Check out this article.", "این مقاله را بررسی کن.", "No"),
            PhrasalVerb("come across", "تصادفاً دیدن", "encounter", "I came across a great story.", "تصادفاً داستان عالی‌ای دیدم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Reduced vowel sounds", "The /ðə/ news, a /ə/ story, to /tə/ report."),
            PronunciationTip("News vocabulary", "HEADline, JOURnalist, BROADcast, COverage, SOURCE."),
            PronunciationTip("Reporting verbs", "rePORTed, anNOUNCED, CLAIMED.")
        ),
        culture = listOf(
            CulturalNote("Citizen journalism", "Citizen journalism has grown with smartphones and social media."),
            CulturalNote("News literacy", "Checking sources and avoiding misinformation is essential."),
            CulturalNote("Local news", "Local news covers community events often ignored by national media.")
        ),
        mistakes = listOf(
            CommonMistake("The suspect was arrest yesterday.", "The suspect was arrested yesterday.", "Use past participle in passive."),
            CommonMistake("I have saw the news.", "I have seen the news.", "Use past participle 'seen'."),
            CommonMistake("She said me the story.", "She told me the story.", "Use 'tell' with an object."),
            CommonMistake("The news are depressing.", "The news is depressing.", "'News' is uncountable, use singular verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's the main topic of the conversation?", "Citizen journalism and the reliability of news sources."),
            ComprehensionQuestion("What's Maria's local news involvement?", "She contributes photos to a local blog run by a retired journalist."),
            ComprehensionQuestion("What's their hope for journalism?", "Traditional newspapers will adapt and professional journalism will survive.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a recent news story.", "درباره یک خبر اخیر صحبت کن.", "I heard that... / The story was about... / It happened..."),
            SpeakingTask("Discuss the reliability of news sources.", "درباره قابلیت اعتماد منابع خبری صحبت کن.", "I always check... / Some sources are... / You should..."),
            SpeakingTask("Role-play agreeing and disagreeing.", "نقش‌بازی موافقت و مخالفت.", "I totally agree. / I see your point, but... / That's true, however...")
        ),
        writing = listOf(
            WritingTask("Write a news story about a local event.", "درباره یک رویداد محلی یک خبر بنویس.", 180, "Use passive voice and reporting verbs.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 2 — Communicating | ارتباط برقرار کردن
    // ═══════════════════════════════════════════════════════════════
    private fun unit2() = base(
        2, "Communicating", "ارتباط برقرار کردن",
        listOf(
            "Give and discuss language-learning tips",
            "Express interests",
            "Offer options",
            "Talk about ways of communicating",
            "Discuss communication preferences"
        ),
        listOf(
            v("communicate", "ارتباط برقرار کردن", "We communicate every day.", "هر روز ارتباط برقرار می‌کنیم.", "verb"),
            v("fluent", "روان", "She's fluent in three languages.", "او در سه زبان روان است.", "adjective"),
            v("accent", "لهجه", "He has a British accent.", "او لهجه بریتانیایی دارد."),
            v("vocabulary", "واژگان", "My vocabulary is growing.", "واژگانم در حال رشد است."),
            v("grammar", "گرامر", "Grammar is important for accuracy.", "گرامر برای دقت مهم است."),
            v("pronunciation", "تلفظ", "Practice your pronunciation daily.", "هر روز تلفظت را تمرین کن."),
            v("body language", "زبان بدن", "Body language says a lot.", "زبان بدن خیلی می‌گوید."),
            v("text message", "پیام متنی", "I'll send you a text message.", "برایم پیام متنی می‌فرستم."),
            v("video call", "تماس تصویری", "Let's have a video call.", "بیایید تماس تصویری داشته باشیم."),
            v("social media", "شبکه‌های اجتماعی", "Social media connects people.", "شبکه‌های اجتماعی مردم را وصل می‌کنند."),
            v("gesture", "اشاره", "He made a gesture to follow him.", "او اشاره کرد که دنبالش بروم."),
            v("express", "بیان کردن", "Express your ideas clearly.", "ایده‌هایت را واضح بیان کن.", "verb"),
            v("interrupt", "وقفه انداختن", "Don't interrupt me, please.", "لطفاً وقفه نینداز.", "verb"),
            v("message", "پیام", "I got your message.", "پیامت را گرفتم."),
            v("preference", "ترجیح", "What's your preference?", "ترجیح تو چیست؟")
        ),
        listOf(
            GrammarSection("Present perfect continuous", "have/has + been + -ing. Emphasizes duration of an action. I've been learning English for five years. How long have you been studying?"),
            GrammarSection("Verb + object + verb", "ask/tell/want someone to do something. She asked me to call her. He wants me to speak slowly."),
            GrammarSection("Present perfect continuous vs. simple", "I've been reading (ongoing). I've read (completed)."),
            GrammarSection("Expressing interests and options", "I'm interested in... / One possibility is... / Another option is...")
        ),
        listOf(
            d("A", "Hey, Maria! How's your English coming along?", "هی، ماریا! انگلیسی‌ات چطور پیش می‌رود؟"),
            d("B", "Pretty well! I've been studying for two hours every day.", "خیلی خوب! هر روز دو ساعت درس می‌خوانم."),
            d("A", "That's impressive. How long have you been doing that?", "تحسین‌برانگیز است. چقدر است این کار را می‌کنی؟"),
            d("B", "For about six months now. I've improved a lot.", "حدود شش ماه. خیلی پیشرفت کرده‌ام."),
            d("A", "I can tell. Your pronunciation is much better.", "می‌توانم بگویم. تلفظت خیلی بهتر شده."),
            d("B", "Thanks! I've been listening to podcasts every morning.", "ممنون! هر صبح پادکست گوش می‌دهم."),
            d("A", "That's a great method. What else are you doing?", "روش عالی‌ای است. چه کار دیگری می‌کنی؟"),
            d("B", "I've been watching movies with subtitles.", "با زیرنویس فیلم تماشا می‌کنم."),
            d("A", "Have you tried speaking with native speakers?", "با بومی‌ها صحبت کردن را امتحان کرده‌ای؟"),
            d("B", "Not yet. I'm a bit nervous about that.", "هنوز نه. کمی مضطربم."),
            d("A", "Don't be! One possibility is to join a language exchange.", "نباش! یک امکان پیوستن به تبادل زبانی است."),
            d("B", "What's that?", "آن چیست؟"),
            d("A", "You practice English and they practice your language.", "تو انگلیسی تمرین می‌کنی و آن‌ها زبان تو را تمرین می‌کنند."),
            d("B", "That sounds interesting. Where can I find one?", "جالب به نظر می‌رسد. کجا می‌توانم پیدا کنم؟"),
            d("A", "There are apps for that. Or local meetups.", "اپلیکیشن‌هایی برای آن هست. یا دورهمی‌های محلی."),
            d("B", "I'll look into it. Thanks for the suggestion.", "بررسی می‌کنم. ممنون برای پیشنهاد."),
            d("A", "Sure. What about you? How do you prefer to communicate?", "حتماً. تو چطور؟ ترجیح می‌دهی چطور ارتباط برقرار کنی؟"),
            d("B", "In person, definitely. I like face-to-face conversations.", "حضوری، قطعاً. مکالمات رو در رو را دوست دارم."),
            d("A", "Me too. But sometimes it's not possible.", "من هم. ولی گاهی ممکن نیست."),
            d("B", "True. Then I use video calls. It's the next best thing.", "درست. بعد تماس تصویری استفاده می‌کنم. بهترین گزینه بعدی است."),
            d("A", "What about text messages?", "پیام متنی چطور؟"),
            d("B", "I use them for quick things. Not for long conversations.", "برای چیزهای سریع استفاده می‌کنم. نه برای مکالمات طولانی."),
            d("A", "I agree. Tone is hard to read in text.", "موافقم. لحن در متن سخت خوانده می‌شود."),
            d("B", "Exactly. Have you ever had a misunderstanding in a text?", "دقیقاً. هیچ‌وقت در پیام متنی سوءتفاهم داشته‌ای؟"),
            d("A", "Yes! My friend thought I was angry when I was joking.", "بله! دوستم فکر کرد عصبانی‌ام وقتی شوخی می‌کردم."),
            d("B", "Ha! That happens a lot.", "ها! زیاد اتفاق می‌افتد."),
            d("A", "What about body language?", "زبان بدن چطور؟"),
            d("B", "It's so important. Gestures differ across cultures.", "خیلی مهم است. اشاره‌ها در فرهنگ‌ها متفاوتند."),
            d("A", "Do you know any differences?", "تفاوت‌هایی می‌دانی؟"),
            d("B", "Yes. In some countries, eye contact shows respect.", "بله. در برخی کشورها تماس چشمی احترام نشان می‌دهد."),
            d("A", "In others, it's considered rude.", "در دیگران، بی‌ادبی تلقی می‌شود."),
            d("B", "Exactly. Communication is more than words.", "دقیقاً. ارتباط بیشتر از کلمات است."),
            d("A", "Well said. Have you been learning about that too?", "خوب گفتی. درباره آن هم یاد گرفته‌ای؟"),
            d("B", "Yes, I've been reading a book about nonverbal communication.", "بله، کتابی درباره ارتباط غیرکلامی خوانده‌ام."),
            d("A", "What's the most interesting thing you've learned?", "جالب‌ترین چیزی که یاد گرفته‌ای چیست؟"),
            d("B", "That smiles mean different things in different cultures.", "اینکه لبخند در فرهنگ‌های مختلف معانی متفاوتی دارد."),
            d("A", "Really? How?", "واقعاً؟ چطور؟"),
            d("B", "In some cultures, smiling at strangers is normal. In others, it's suspicious.", "در برخی فرهنگ‌ها لبخند به غریبه‌ها عادی است. در دیگران مشکوک است."),
            d("A", "That's fascinating. I've never thought about that.", "جالب است. هرگز به آن فکر نکرده‌ام."),
            d("B", "It changes how you see communication.", "نگاهت به ارتباط را تغییر می‌دهد."),
            d("A", "I should read that book too.", "من هم باید آن کتاب را بخوانم."),
            d("B", "I'll lend it to you. What are you reading now?", "قرضت می‌دهم. الان چه می‌خوانی؟"),
            d("A", "A novel in English. It's challenging but fun.", "رمانی به انگلیسی. چالش‌برانگیز است ولی سرگرم‌کننده."),
            d("B", "That's a great way to learn vocabulary.", "روش عالی‌ای برای یادگیری واژگان است."),
            d("A", "It is. I've been noting new words in a notebook.", "هست. کلمات جدید را در دفترچه‌ای یادداشت می‌کنم."),
            d("B", "Smart. Do you review them later?", "هوشمندانه. بعداً مرورشان می‌کنی؟"),
            d("A", "Yes, every weekend. It helps a lot.", "بله، هر آخر هفته. خیلی کمک می‌کند."),
            d("B", "I should do that too. I forget words easily.", "من هم باید این کار را بکنم. کلمات را راحت فراموش می‌کنم."),
            d("A", "Try flashcards. They're effective.", "فلش‌کارت امتحان کن. مؤثر هستند."),
            d("B", "I've heard of those. How do they work?", "درباره‌شان شنیده‌ام. چطور کار می‌کنند؟"),
            d("A", "You write the word on one side and the meaning on the other.", "کلمه را یک طرف و معنی را طرف دیگر می‌نویسی."),
            d("B", "Simple but effective. I'll make some tonight.", "ساده ولی مؤثر. امشب چند تا می‌سازم."),
            d("A", "Good. Well, I should go. Let's practice English together sometime!", "خوبه. خب، باید بروم. بیایید یک وقت با هم انگلیسی تمرین کنیم!"),
            d("B", "I'd love that. Let's set up a weekly call.", "دوست دارم. بیایید یک تماس هفتگی ترتیب دهیم."),
            d("A", "Deal! See you soon.", "قبول! به‌زودی می‌بینمت."),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How long has Maria been studying?", listOf("3 months", "6 months", "1 year", "2 years"), 1),
            q("What does Maria do every morning?", listOf("read books", "listen to podcasts", "watch movies", "write"), 1),
            q("What is a language exchange?", listOf("a test", "a practice method", "a book", "a game"), 1),
            q("What's Maria's preferred communication method?", listOf("text", "video call", "in person", "email"), 2),
            q("I ___ been studying for two hours.", listOf("have", "has", "am", "was"), 0),
            q("She ___ me to call her.", listOf("asked", "said", "told", "spoke"), 0),
            q("He wants me ___ slowly.", listOf("speak", "to speak", "speaking", "spoke"), 1),
            q("How long ___ you been learning?", listOf("have", "has", "are", "do"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Coming along", "پیش رفتن", "How's your English coming along?", "انگلیسی‌ات چطور پیش می‌رود؟"),
            IdiomExpression("I can tell", "می‌توانم بگویم", "I can tell you've improved.", "می‌توانم بگویم پیشرفت کرده‌ای."),
            IdiomExpression("Look into it", "بررسی کردن", "I'll look into it.", "بررسی می‌کنم."),
            IdiomExpression("Next best thing", "بهترین گزینه بعدی", "It's the next best thing.", "بهترین گزینه بعدی است.")
        ),
        phrasal = listOf(
            PhrasalVerb("come along", "پیشرفت کردن", "progress", "My English is coming along.", "انگلیسی‌ام پیشرفت می‌کند.", "No"),
            PhrasalVerb("look into", "بررسی کردن", "investigate", "I'll look into that app.", "آن اپلیکیشن را بررسی می‌کنم.", "No"),
            PhrasalVerb("set up", "ترتیب دادن", "arrange", "Let's set up a call.", "بیایید یک تماس ترتیب دهیم.", "Yes"),
            PhrasalVerb("note down", "یادداشت کردن", "write down", "I note down new words.", "کلمات جدید را یادداشت می‌کنم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Unreleased final consonants", "Don't release the final /t/ and /d/. Wha(t) time? I coul(d) go."),
            PronunciationTip("Communication vocabulary", "comMUnicate, FLUent, ACcent, voCABulary."),
            PronunciationTip("Present perfect continuous", "I've been STUdying. How LONG have you been LEARNing?")
        ),
        culture = listOf(
            CulturalNote("Language exchange", "Language exchanges help learners practice with native speakers."),
            CulturalNote("Body language", "Gestures and eye contact vary significantly across cultures."),
            CulturalNote("Nonverbal communication", "Smiles and gestures can have different meanings in different cultures.")
        ),
        mistakes = listOf(
            CommonMistake("I have been study English.", "I have been studying English.", "Use -ing after have been."),
            CommonMistake("She said me to call.", "She told me to call.", "Use 'tell' with an object."),
            CommonMistake("He wants that I speak.", "He wants me to speak.", "Use object + infinitive."),
            CommonMistake("How long you have been learning?", "How long have you been learning?", "Invert subject and auxiliary in questions.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What methods does Maria use?", "Studying daily, podcasts, movies with subtitles, reading, flashcards."),
            ComprehensionQuestion("What's the difference between text and in-person communication?", "Tone is hard to read in text; in-person is preferred for long conversations."),
            ComprehensionQuestion("What did Maria learn about body language?", "It varies across cultures — eye contact and smiles have different meanings.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your language-learning methods.", "درباره روش‌های یادگیری زبانت صحبت کن.", "I've been... / I usually... / One method is..."),
            SpeakingTask("Discuss communication preferences.", "درباره ترجیحات ارتباطی صحبت کن.", "I prefer... / I use... / I find..."),
            SpeakingTask("Give advice about learning English.", "توصیه‌هایی درباره یادگیری انگلیسی بده.", "You should... / One possibility is... / Try...")
        ),
        writing = listOf(
            WritingTask("Write about your English learning journey.", "درباره مسیر یادگیری انگلیسی‌ات بنویس.", 180, "Use present perfect continuous.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 3 — Food | غذا
    // ═══════════════════════════════════════════════════════════════
    private fun unit3() = base(
        3, "Food", "غذا",
        listOf(
            "Describe ways food is prepared",
            "Give and accept recommendations",
            "Describe steps in a recipe",
            "Discuss what people may eat in the future"
        ),
        listOf(
            v("bake", "پختن", "I love baking bread.", "عاشق پختن نان هستم.", "verb"),
            v("fry", "سرخ کردن", "Fry the onions first.", "اول پیازها را سرخ کن.", "verb"),
            v("boil", "جوشاندن", "Boil the water.", "آب را بجوشان.", "verb"),
            v("grill", "کباب کردن", "Grill the chicken for 10 minutes.", "مرغ را ۱۰ دقیقه کباب کن.", "verb"),
            v("roast", "بریان کردن", "Roast the vegetables.", "سبزیجات را بریان کن.", "verb"),
            v("steam", "بخارپز کردن", "Steam the fish.", "ماهی را بخارپز کن.", "verb"),
            v("melt", "ذوب کردن", "Melt the butter.", "کره را ذوب کن.", "verb"),
            v("chop", "خرد کردن", "Chop the onions.", "پیازها را خرد کن.", "verb"),
            v("mix", "مخلوط کردن", "Mix the ingredients.", "مواد را مخلوط کن.", "verb"),
            v("taste", "طعم", "The taste is amazing.", "طعمش شگفت‌انگیز است."),
            v("texture", "بافت", "The texture is smooth.", "بافتش نرم است."),
            v("recipe", "دستور پخت", "Follow the recipe carefully.", "دستور پخت را دقیق دنبال کن."),
            v("ingredient", "ماده اولیه", "What are the ingredients?", "مواد اولیه چیست؟"),
            v("recommendation", "توصیه", "I'll take your recommendation.", "توصیه‌ات را می‌پذیرم."),
            v("flavor", "طعم", "This flavor is unique.", "این طعم منحصر به فرد است.")
        ),
        listOf(
            GrammarSection("Present passive", "am/is/are + past participle. Food is prepared fresh daily. The bread is baked in the morning."),
            GrammarSection("Time clauses", "when, while, after, before, until. When the water boils, add the pasta. After you chop the onions, fry them."),
            GrammarSection("Sequencing in recipes", "First, then, next, after that, finally."),
            GrammarSection("Describing tastes and textures", "It tastes... / It's spicy/sweet/sour/salty. It has a smooth/rough texture.")
        ),
        listOf(
            d("A", "Hey, Maria! I tried a new restaurant yesterday.", "هی، ماریا! دیروز رستوران جدیدی امتحان کردم."),
            d("B", "Really? What kind of food do they serve?", "واقعاً؟ چه نوع غذایی سرو می‌کنند؟"),
            d("A", "Asian fusion. They mix different cuisines.", "آسیایی فیوژن. آشپزی‌های مختلف را ترکیب می‌کنند."),
            d("B", "Sounds interesting. What did you order?", "جالب به نظر می‌رسد. چه سفارش دادی؟"),
            d("A", "Grilled salmon with steamed vegetables.", "سالمون کبابی با سبزیجات بخارپز."),
            d("B", "That sounds healthy. How was it?", "سالم به نظر می‌رسد. چطور بود؟"),
            d("A", "Delicious! The fish was perfectly cooked.", "خوشمزه! ماهی کاملاً پخته بود."),
            d("B", "How was it prepared?", "چطور آماده شده بود؟"),
            d("A", "It was grilled with lemon and herbs.", "با لیمو و سبزیجات کباب شده بود."),
            d("B", "That sounds amazing. I love grilled fish.", "شگفت‌انگیز به نظر می‌رسد. عاشق ماهی کبابی‌ام."),
            d("A", "You should try it. I highly recommend it.", "باید امتحان کنی. شدیداً توصیه می‌کنم."),
            d("B", "What else did you have?", "چه چیز دیگری خوردی؟"),
            d("A", "A chocolate dessert. It was made with dark chocolate.", "دسر شکلاتی. با شکلات تلخ درست شده بود."),
            d("B", "Was it sweet?", "شیرین بود؟"),
            d("A", "Not too sweet. It had a rich, smooth texture.", "زیاد شیرین نه. بافت غنی و نرمی داشت."),
            d("B", "Sounds perfect. Do they have vegetarian options?", "عالی به نظر می‌رسد. گزینه گیاهی دارند؟"),
            d("A", "Yes, several. The roasted vegetable dish is popular.", "بله، چند تا. غذای سبزیجات بریان محبوب است."),
            d("B", "Good to know. How are the prices?", "خوبه بدانم. قیمت‌ها چطورند؟"),
            d("A", "Reasonable. Not cheap, but not too expensive.", "منطقی. ارزان نیست، ولی خیلی گران هم نه."),
            d("B", "Do they take reservations?", "رزرو می‌پذیرند؟"),
            d("A", "Yes. It's recommended on weekends.", "بله. آخر هفته‌ها توصیه می‌شود."),
            d("B", "Let's go together sometime.", "بیایید یک وقت با هم برویم."),
            d("A", "Definitely. Now, tell me about your cooking.", "قطعاً. حالا از آشپزی‌ات بگو."),
            d("B", "I've been cooking a lot lately. Trying new recipes.", "اخیراً زیاد آشپزی کرده‌ام. دستورهای جدید امتحان می‌کنم."),
            d("A", "What have you made?", "چه درست کرده‌ای؟"),
            d("B", "I baked bread for the first time last week.", "هفته گذشته برای اولین بار نان پختم."),
            d("A", "Really? How did it turn out?", "واقعاً؟ چطور شد؟"),
            d("B", "Pretty good! The texture was soft and fluffy.", "خیلی خوب! بافتش نرم و پفکی بود."),
            d("A", "That's impressive. Was it difficult?", "تحسین‌برانگیز است. سخت بود؟"),
            d("B", "A bit. The dough needs time to rise.", "کمی. خمیر به زمان نیاز دارد تا ور بیاید."),
            d("A", "What's your secret?", "رازت چیست؟"),
            d("B", "Fresh ingredients and patience. And a good recipe.", "مواد اولیه تازه و صبر. و دستور پخت خوب."),
            d("A", "What kind of bread was it?", "چه نوع نانی بود؟"),
            d("B", "Sourdough. My favorite.", "خمیرمایه. مورد علاقه‌ام."),
            d("A", "I love sourdough. Can you teach me?", "عاشق خمیرمایه‌ام. می‌توانی یادم بدهی؟"),
            d("B", "Sure. It takes practice, but it's fun.", "حتماً. تمرین می‌خواهد، ولی سرگرم‌کننده است."),
            d("A", "I've always wanted to learn. What do I need?", "همیشه می‌خواستم یاد بگیرم. چه چیزی لازم دارم؟"),
            d("B", "Flour, water, salt, and a starter culture.", "آرد، آب، نمک، و یک کشت آغازگر."),
            d("A", "Starter culture? What's that?", "کشت آغازگر؟ آن چیست؟"),
            d("B", "It's a mix of flour and water with natural yeast.", "مخلوطی از آرد و آب با مخمر طبیعی است."),
            d("A", "Interesting. How long does it take?", "جالب است. چقدر طول می‌کشد؟"),
            d("B", "The bread takes about 24 hours from start to finish.", "نان از ابتدا تا انتها حدود ۲۴ ساعت طول می‌کشد."),
            d("A", "Wow, that's a long process.", "واو، فرآیند طولانی‌ای است."),
            d("B", "It is. But the result is worth it.", "هست. ولی نتیجه‌اش ارزشش را دارد."),
            d("A", "What about future food? Have you heard about it?", "غذای آینده چطور؟ درباره‌اش شنیده‌ای؟"),
            d("B", "You mean like lab-grown meat and plant-based alternatives?", "منظورت گوشت آزمایشگاهی و جایگزین‌های گیاهی است؟"),
            d("A", "Yes. Scientists say we may eat differently in 25 years.", "بله. دانشمندان می‌گویند ممکن است در ۲۵ سال آینده متفاوت بخوریم."),
            d("B", "What might change?", "چه چیزی ممکن است تغییر کند؟"),
            d("A", "Maybe more plant-based proteins. Less meat.", "شاید پروتئین‌های گیاهی بیشتر. گوشت کمتر."),
            d("B", "That would be better for the environment.", "برای محیط زیست بهتر می‌شد."),
            d("A", "Exactly. And insects might become a common protein source.", "دقیقاً. و حشرات ممکن است منبع پروتئین رایجی شوند."),
            d("B", "Insects? I'm not sure I could eat those.", "حشرات؟ مطمئن نیستم بتوانم آن‌ها را بخورم."),
            d("A", "Ha! They're already eaten in many cultures.", "ها! در بسیاری از فرهنگ‌ها قبلاً خورده می‌شوند."),
            d("B", "True. Maybe I'll get used to the idea.", "درست. شاید به این ایده عادت کنم."),
            d("A", "What do you think food will be like in the future?", "فکر می‌کنی غذا در آینده چطور خواهد بود؟"),
            d("B", "I hope it stays delicious. That's all I care about.", "امیدوارم خوشمزه بماند. فقط همین برایم مهم است."),
            d("A", "Ha! Fair enough. Well, I should go. Let's cook together soon!", "ها! منصفانه است. خب، باید بروم. بیایید به‌زودی با هم آشپزی کنیم!"),
            d("B", "I'd love that. I'll send you the sourdough recipe.", "دوست دارم. دستور خمیرمایه را برایت می‌فرستم."),
            d("A", "Perfect. See you soon!", "عالی. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did Ali order at the restaurant?", listOf("steak", "grilled salmon", "pasta", "pizza"), 1),
            q("What did Maria bake?", listOf("cake", "sourdough bread", "cookies", "muffins"), 1),
            q("How long does sourdough take?", listOf("1 hour", "5 hours", "24 hours", "48 hours"), 2),
            q("What might be a future protein source?", listOf("insects", "more meat", "only fish", "dairy"), 0),
            q("Food ___ prepared fresh daily.", listOf("is", "are", "was", "be"), 0),
            q("When the water ___, add the pasta.", listOf("boil", "boils", "boiled", "boiling"), 1),
            q("After you ___ the onions, fry them.", listOf("chop", "chopped", "chopping", "chops"), 0),
            q("The dessert ___ made with dark chocolate.", listOf("is", "was", "are", "were"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Turn out", "از آب درآمدن", "How did it turn out?", "چطور از آب درآمد؟"),
            IdiomExpression("Worth it", "ارزشش را داشتن", "The result is worth it.", "نتیجه‌اش ارزشش را دارد."),
            IdiomExpression("Fair enough", "منصفانه است", "Fair enough.", "منصفانه است."),
            IdiomExpression("Get used to", "عادت کردن", "I'll get used to the idea.", "به این ایده عادت می‌کنم.")
        ),
        phrasal = listOf(
            PhrasalVerb("turn out", "از آب درآمدن", "result", "The bread turned out well.", "نان خوب از آب درآمد.", "No"),
            PhrasalVerb("cut down on", "کم کردن", "reduce", "I should cut down on sugar.", "باید شکر را کم کنم.", "No"),
            PhrasalVerb("try out", "امتحان کردن", "test", "Try out this recipe.", "این دستور پخت را امتحان کن.", "No"),
            PhrasalVerb("whip up", "سریع درست کردن", "prepare quickly", "I can whip up a meal.", "می‌توانم سریع غذایی درست کنم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Linked consonant sounds", "Bake_d bread, grille_d fish, steame_d vegetables."),
            PronunciationTip("Food vocabulary", "inGREdient, RECipe, FLAvor, TEXture."),
            PronunciationTip("Cooking verbs", "BAKE, FRY, BOIL, GRILL, ROAST, STEAM.")
        ),
        culture = listOf(
            CulturalNote("Street food", "Street food is a major part of food culture in many countries."),
            CulturalNote("Future food", "Lab-grown meat and plant-based alternatives are growing industries."),
            CulturalNote("Cooking methods", "Different cultures prefer different cooking methods — grilling, steaming, frying.")
        ),
        mistakes = listOf(
            CommonMistake("Food is prepare fresh.", "Food is prepared fresh.", "Use past participle in passive."),
            CommonMistake("When water will boil, add pasta.", "When the water boils, add the pasta.", "Use present simple in time clauses."),
            CommonMistake("After chop onions, fry them.", "After you chop the onions, fry them.", "Use subject + verb in time clauses."),
            CommonMistake("It was grill with lemon.", "It was grilled with lemon.", "Use past participle in passive.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did Ali recommend?", "Grilled salmon with steamed vegetables and chocolate dessert."),
            ComprehensionQuestion("How does Maria make sourdough?", "With flour, water, salt, and a starter culture — takes 24 hours."),
            ComprehensionQuestion("What might future food include?", "Plant-based proteins, lab-grown meat, and insects.")
        ),
        speaking = listOf(
            SpeakingTask("Describe how to prepare a dish.", "نحوه آماده کردن یک غذا را توصیف کن.", "First... / Then... / After that... / Finally..."),
            SpeakingTask("Give and accept recommendations.", "توصیه بده و بپذیر.", "I recommend... / You should try... / That sounds good."),
            SpeakingTask("Discuss future food.", "درباره غذای آینده صحبت کن.", "We may eat... / I think... / It might be...")
        ),
        writing = listOf(
            WritingTask("Write a recipe for a favorite dish.", "دستور پخت یک غذای مورد علاقه بنویس.", 180, "Use present passive and time clauses.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 4 — Behavior | رفتار
    // ═══════════════════════════════════════════════════════════════
    private fun unit4() = base(
        4, "Behavior", "رفتار",
        listOf(
            "Discuss how they would react to situations",
            "Express and acknowledge expectations",
            "Talk about past hypothetical situations",
            "Discuss ways to be kind"
        ),
        listOf(
            v("behavior", "رفتار", "His behavior was strange.", "رفتارش عجیب بود."),
            v("polite", "مؤدب", "She's always polite.", "او همیشه مؤدب است.", "adjective"),
            v("impolite", "بی‌ادب", "That was impolite.", "آن بی‌ادبی بود.", "adjective"),
            v("expectation", "انتظار", "He had high expectations.", "او انتظارات بالایی داشت."),
            v("apologize", "عذرخواهی کردن", "I apologize for the mistake.", "برای اشتباه عذرخواهی می‌کنم.", "verb"),
            v("compliment", "تعریف", "She gave me a compliment.", "او به من تعریف کرد."),
            v("favor", "لطف", "Can you do me a favor?", "می‌توانی به من لطفی کنی؟"),
            v("kindness", "مهربانی", "Kindness costs nothing.", "مهربانی هزینه‌ای ندارد."),
            v("react", "واکنش نشان دادن", "How would you react?", "چطور واکنش نشان می‌دهی؟", "verb"),
            v("admit", "اعتراف کردن", "He admitted his mistake.", "او اشتباهش را اعتراف کرد.", "verb"),
            v("situation", "موقعیت", "It was a difficult situation.", "موقعیت سختی بود."),
            v("hypothetical", "فرضی", "It's a hypothetical question.", "سؤال فرضی است.", "adjective"),
            v("generous", "سخاوتمند", "She's very generous.", "او خیلی سخاوتمند است.", "adjective"),
            v("respect", "احترام", "We should respect each other.", "باید به هم احترام بگذاریم."),
            v("manner", "رفتار", "He has good manners.", "رفتار خوبی دارد.")
        ),
        listOf(
            GrammarSection("Second conditional", "If + past simple, would + base verb. For hypothetical situations. If I saw someone in trouble, I would help."),
            GrammarSection("Past modals for hypothetical situations", "should have / could have / would have + past participle. I should have apologized. She could have helped."),
            GrammarSection("Expressing and acknowledging expectations", "I expected you to... / I was surprised that... / You should have..." ),
            GrammarSection("Polite requests and apologies", "Would you mind...? / I'm sorry I... / I apologize for...")
        ),
        listOf(
            d("A", "Hey, Maria! I have a hypothetical question for you.", "هی، ماریا! یک سؤال فرضی از تو دارم."),
            d("B", "Sure. What is it?", "حتماً. چیست؟"),
            d("A", "If you saw someone drop their wallet, what would you do?", "اگر ببینی کسی کیف پولش را می‌اندازد، چه کار می‌کنی؟"),
            d("B", "I'd pick it up and give it back. Obviously.", "برش می‌دارم و پسش می‌دهم. واضح است."),
            d("A", "What if they didn't notice?", "اگر متوجه نشوند چطور؟"),
            d("B", "I'd run after them and return it.", "دنبالشان می‌دوم و پسش می‌دهم."),
            d("A", "That's the right thing to do.", "کار درستی است."),
            d("B", "What would you do?", "تو چه کار می‌کردی؟"),
            d("A", "The same, I think. But what if it had a lot of money?", "همان، فکر می‌کنم. ولی اگر پول زیادی داشت چطور؟"),
            d("B", "It wouldn't matter. It's not mine.", "مهم نمی‌بود. مال من نیست."),
            d("A", "You're very honest.", "خیلی صادقی."),
            d("B", "I try to be. What about you?", "سعی می‌کنم. تو چطور؟"),
            d("A", "I'd like to think I'd do the same.", "دوست دارم فکر کنم همین کار را می‌کردم."),
            d("B", "That's what matters. Acting with integrity.", "همین مهم است. با صداقت عمل کردن."),
            d("A", "True. Have you ever been in a situation like that?", "درست. هیچ‌وقت در چنین موقعیتی بوده‌ای؟"),
            d("B", "Yes, once. I found a phone on the bus.", "بله، یک بار. در اتوبوس گوشی‌ای پیدا کردم."),
            d("A", "What did you do?", "چه کار کردی؟"),
            d("B", "I called the last number dialed. The owner came to get it.", "آخرین شماره گرفته‌شده را زنگ زدم. صاحبش آمد و بردش."),
            d("A", "That was kind of you.", "مهربان بودی."),
            d("B", "It was the right thing. She was so grateful.", "کار درستی بود. خیلی سپاسگزار بود."),
            d("A", "Did she give you a reward?", "پاداشی داد؟"),
            d("B", "She offered, but I didn't accept it.", "پیشنهاد داد، ولی قبول نکردم."),
            d("A", "Why not?", "چرا نه؟"),
            d("B", "It didn't feel right. I didn't do it for money.", "درست حس نمی‌شد. برای پول انجامش نداده بودم."),
            d("A", "That's admirable. Many people would have taken it.", "تحسین‌برانگیز است. خیلی‌ها می‌گرفتند."),
            d("B", "Maybe. But kindness shouldn't have a price.", "شاید. ولی مهربانی نباید قیمتی داشته باشد."),
            d("A", "Well said. What about impolite behavior?", "خوب گفتی. رفتار بی‌ادبانه چطور؟"),
            d("B", "What do you mean?", "منظورت چیست؟"),
            d("A", "Like when someone is rude to a waiter.", "مثل وقتی کسی با پیشخدمت بی‌ادب است."),
            d("B", "I can't stand that. It's so disrespectful.", "تحملش را ندارم. خیلی بی‌احترامی است."),
            d("A", "I agree. Would you say something?", "موافقم. چیزی می‌گفتی؟"),
            d("B", "Maybe. If it was really bad, I might.", "شاید. اگر واقعاً بد بود، ممکن است بگویم."),
            d("A", "I probably wouldn't. I'd feel awkward.", "من احتمالاً نمی‌گفتم. احساس ناخوشایندی می‌کردم."),
            d("B", "I understand. It's not easy to confront people.", "می‌فهمم. مقابله با مردم آسان نیست."),
            d("A", "Have you ever regretted not saying something?", "هیچ‌وقت پشیمان شده‌ای که چیزی نگفتی؟"),
            d("B", "Yes. I should have spoken up once.", "بله. یک بار باید حرف می‌زدم."),
            d("A", "What happened?", "چه اتفاقی افتاد؟"),
            d("B", "Someone was being mean to a classmate. I stayed silent.", "کسی با هم‌کلاسی‌ام بدرفتاری می‌کرد. سکوت کردم."),
            d("A", "That must have been hard.", "سخت بوده است."),
            d("B", "It was. I still feel bad about it.", "بود. هنوز درباره‌اش احساس بدی دارم."),
            d("A", "We all have moments like that.", "همه ما لحظاتی مثل آن داریم."),
            d("B", "I know. But I learned from it. Now I speak up.", "می‌دانم. ولی از آن یاد گرفتم. حالا حرف می‌زنم."),
            d("A", "That's what matters. Growth.", "همین مهم است. رشد."),
            d("B", "Exactly. What about you? Any regrets?", "دقیقاً. تو چطور؟ پشیمانی‌ای داری؟"),
            d("A", "I once forgot to thank someone who helped me a lot.", "یک بار فراموش کردم از کسی که خیلی کمکم کرد تشکر کنم."),
            d("B", "Did you apologize?", "عذرخواهی کردی؟"),
            d("A", "Yes, but much later. I should have thanked them immediately.", "بله، ولی خیلی بعدتر. باید فوراً تشکر می‌کردم."),
            d("B", "At least you did eventually.", "حداقل در نهایت انجام دادی."),
            d("A", "True. Better late than never.", "درست. بهتر دیر از هرگز."),
            d("B", "What are some ways to be kind?", "برخی راه‌های مهربان بودن چیست؟"),
            d("A", "Small things. Holding doors, saying thank you.", "کارهای کوچک. نگه داشتن در، گفتن ممنون."),
            d("B", "Also listening. Really listening to people.", "همچنین گوش دادن. واقعاً به مردم گوش دادن."),
            d("A", "That's a great one. Many people don't feel heard.", "عالی است. خیلی‌ها احساس نمی‌کنند شنیده می‌شوند."),
            d("B", "Exactly. Kindness is about attention.", "دقیقاً. مهربانی درباره توجه است."),
            d("A", "And patience. Being patient with others.", "و صبر. صبور بودن با دیگران."),
            d("B", "Yes. Patience is a form of kindness.", "بله. صبر نوعی مهربانی است."),
            d("A", "Well said. I'm going to try to be kinder every day.", "خوب گفتی. سعی می‌کنم هر روز مهربان‌تر باشم."),
            d("B", "Me too. It starts with small actions.", "من هم. با کارهای کوچک شروع می‌شود."),
            d("A", "Exactly. Well, I should go. Thanks for the chat.", "دقیقاً. خب، باید بروم. ممنون برای گفتگو."),
            d("B", "Anytime. See you soon!", "هر وقت. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What would Maria do if she found a wallet?", listOf("keep it", "return it", "ignore it", "call police"), 1),
            q("What did Maria find on the bus?", listOf("a wallet", "a phone", "a bag", "a book"), 1),
            q("What did Maria regret?", listOf("not speaking up", "being rude", "losing a phone", "forgetting a favor"), 0),
            q("What does Maria say kindness is about?", listOf("money", "attention", "gifts", "time"), 1),
            q("If I ___ someone in trouble, I would help.", listOf("see", "saw", "seen", "seeing"), 1),
            q("I should ___ apologized.", listOf("have", "has", "had", "having"), 0),
            q("She could ___ helped.", listOf("have", "has", "had", "having"), 0),
            q("If I had money, I ___ give it back.", listOf("will", "would", "did", "am"), 1)
        ),
        idioms = listOf(
            IdiomExpression("The right thing to do", "کار درست", "That's the right thing to do.", "کار درستی است."),
            IdiomExpression("Speak up", "حرف زدن", "I should have spoken up.", "باید حرف می‌زدم."),
            IdiomExpression("Better late than never", "بهتر دیر از هرگز", "Better late than never.", "بهتر دیر از هرگز."),
            IdiomExpression("Feel bad about", "احساس بدی داشتن", "I still feel bad about it.", "هنوز درباره‌اش احساس بدی دارم.")
        ),
        phrasal = listOf(
            PhrasalVerb("speak up", "بلند حرف زدن", "talk louder", "Speak up, please.", "لطفاً بلندتر حرف بزن.", "No"),
            PhrasalVerb("stand up for", "دفاع کردن از", "defend", "Stand up for what's right.", "از آنچه درست است دفاع کن.", "No"),
            PhrasalVerb("own up", "اعتراف کردن", "admit", "He owned up to his mistake.", "او اشتباهش را اعتراف کرد.", "No"),
            PhrasalVerb("help out", "کمک کردن", "assist", "Can you help out?", "می‌توانی کمک کنی؟", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Second conditional stress", "If I SAW someone, I would HELP."),
            PronunciationTip("Past modals", "I SHOULD have aPOLogized."),
            PronunciationTip("Behavior vocabulary", "beHAVIor, poLITE, impoLITE, expecTAtion.")
        ),
        culture = listOf(
            CulturalNote("Politeness", "Politeness norms vary across cultures — what's polite in one may be rude in another."),
            CulturalNote("Acts of kindness", "Random acts of kindness are encouraged in many cultures."),
            CulturalNote("Expectations", "Expectations about behavior differ between individuals and cultures.")
        ),
        mistakes = listOf(
            CommonMistake("If I would see him, I would help.", "If I saw him, I would help.", "Use past simple after 'if'."),
            CommonMistake("I should have apologize.", "I should have apologized.", "Use past participle after have."),
            CommonMistake("She could helped.", "She could have helped.", "Use 'have' + past participle."),
            CommonMistake("I didn't accepted it.", "I didn't accept it.", "Use base verb after 'didn't'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's the main topic?", "Hypothetical situations, honesty, kindness, and regrets."),
            ComprehensionQuestion("What's Maria's regret?", "Not speaking up when someone was being mean to a classmate."),
            ComprehensionQuestion("What are ways to be kind?", "Small actions — holding doors, listening, patience, attention.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss hypothetical situations.", "درباره موقعیت‌های فرضی صحبت کن.", "If I... / I would... / What would you do?"),
            SpeakingTask("Talk about a regret and a lesson learned.", "درباره یک پشیمانی و درسی که گرفتی صحبت کن.", "I should have... / I regret... / I learned..." ),
            SpeakingTask("Discuss acts of kindness.", "درباره کارهای مهربانانه صحبت کن.", "Kindness is... / A kind act is... / I try to...")
        ),
        writing = listOf(
            WritingTask("Write about a hypothetical situation and how you would react.", "درباره یک موقعیت فرضی و واکنش خودت بنویس.", 180, "Use second conditional and past modals.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 5 — Travel and tourism | سفر و گردشگری
    // ═══════════════════════════════════════════════════════════════
    private fun unit5() = base(
        5, "Travel and tourism", "سفر و گردشگری",
        listOf(
            "Make comparisons about cities",
            "Report and respond to a problem",
            "Report commands and advice",
            "Discuss ideas for a festival in their town"
        ),
        listOf(
            v("tourism", "گردشگری", "Tourism is important for the economy.", "گردشگری برای اقتصاد مهم است."),
            v("tourist", "گردشگر", "Many tourists visit in summer.", "گردشگران زیادی در تابستان بازدید می‌کنند."),
            v("destination", "مقصد", "Paris is a popular destination.", "پاریس مقصد محبوبی است."),
            v("attraction", "جاذبه", "The Eiffel Tower is a major attraction.", "برج ایفل جاذبه اصلی است."),
            v("accommodation", "اقامتگاه", "The accommodation was comfortable.", "اقامتگاه راحت بود."),
            v("itinerary", "برنامه سفر", "What's our itinerary?", "برنامه سفرمان چیست؟"),
            v("landmark", "بنای تاریخی", "The temple is a famous landmark.", "معبد بنای تاریخی معروفی است."),
            v("souvenir", "سوغات", "I bought souvenirs.", "سوغات خریدم."),
            v("local", "محلی", "Try the local food.", "غذای محلی را امتحان کن.", "adjective"),
            v("crowded", "شلوغ", "The city was crowded.", "شهر شلوغ بود.", "adjective"),
            v("breathtaking", "نفس‌گیر", "The view was breathtaking.", "منظره نفس‌گیر بود.", "adjective"),
            v("festival", "جشنواره", "We're planning a festival.", "در حال برنامه‌ریزی جشنواره‌ایم."),
            v("heritage", "میراث", "It's a cultural heritage site.", "این یک سایت میراث فرهنگی است."),
            v("guide", "راهنما", "The tour guide was excellent.", "راهنمای تور عالی بود."),
            v("recommend", "توصیه کردن", "I recommend this restaurant.", "این رستوران را توصیه می‌کنم.", "verb")
        ),
        listOf(
            GrammarSection("Comparatives and superlatives", "more beautiful than, the most crowded, better than, the best."),
            GrammarSection("Reporting commands and advice", "told/asked someone to do something. The guide told us to be careful. She advised us to try the local food."),
            GrammarSection("Compound adjectives", "well-known, breathtaking, five-star, family-friendly. Describing places."),
            GrammarSection("Reporting problems", "My luggage was lost. The room wasn't clean. I couldn't find my way.")
        ),
        listOf(
            d("A", "Hey, Maria! How was your trip to Barcelona?", "هی، ماریا! سفرت به بارسلونا چطور بود؟"),
            d("B", "Amazing! One of the best cities I've ever visited.", "شگفت‌انگیز! یکی از بهترین شهرهایی که دیده‌ام."),
            d("A", "What did you like most?", "بیشتر چه چیزی را دوست داشتی؟"),
            d("B", "The architecture. The Sagrada Familia was breathtaking.", "معماری. ساگرادا فامیلیا نفس‌گیر بود."),
            d("A", "I've seen photos. It looks incredible.", "عکس‌هایش را دیده‌ام. باورنکردنی به نظر می‌رسد."),
            d("B", "It's even more impressive in person.", "حضوری حتی تأثیرگذارتر است."),
            d("A", "How was the food?", "غذا چطور بود؟"),
            d("B", "Delicious. The local tapas were amazing.", "خوشمزه. تپاس‌های محلی شگفت‌انگیز بودند."),
            d("A", "Did you try anything unusual?", "چیز غیرمعمولی امتحان کردی؟"),
            d("B", "Yes. I tried seafood paella. It was the best I've ever had.", "بله. پائیا دریایی امتحان کردم. بهترین چیزی بود که تا حالا خورده‌ام."),
            d("A", "Sounds wonderful. Was the city crowded?", "شگفت‌انگیز به نظر می‌رسد. شهر شلوغ بود؟"),
            d("B", "Very. Summer is peak tourist season.", "خیلی. تابستان فصل اوج گردشگری است."),
            d("A", "Did you have any problems?", "مشکلی داشتی؟"),
            d("B", "A few. My luggage was lost at the airport.", "چند تا. چمدانم در فرودگاه گم شد."),
            d("A", "Oh no. What did you do?", "اوه نه. چه کار کردی؟"),
            d("B", "The airline told me to file a report.", "شرکت هواپیمایی به من گفت گزارش ثبت کنم."),
            d("A", "Did you get it back?", "پسش گرفتی؟"),
            d("B", "Yes, two days later. It was stressful.", "بله، دو روز بعد. استرس‌زا بود."),
            d("A", "I bet. Anything else go wrong?", "شرط می‌بندم. چیز دیگری اشتباه شد؟"),
            d("B", "The hotel room wasn't clean when we arrived.", "اتاق هتل وقتی رسیدیم تمیز نبود."),
            d("A", "What did you do about it?", "چه کار کردی؟"),
            d("B", "We complained and they upgraded us.", "شکایت کردیم و ما را ارتقا دادند."),
            d("A", "That's good service.", "خدمات خوبی است."),
            d("B", "Yes. They told us to enjoy the new room.", "بله. به ما گفتند از اتاق جدید لذت ببریم."),
            d("A", "Were there any other issues?", "مشکل دیگری بود؟"),
            d("B", "We got lost a few times. The streets are confusing.", "چند بار گم شدیم. خیابان‌ها گیج‌کننده‌اند."),
            d("A", "Did you ask for directions?", "راهنمایی خواستی؟"),
            d("B", "Yes. A local told us to take the metro.", "بله. یک محلی به ما گفت مترو بگیریم."),
            d("A", "Was it easy to use?", "استفاده‌اش راحت بود؟"),
            d("B", "Yes. The metro system is very efficient.", "بله. سیستم مترو خیلی کارآمد است."),
            d("A", "What was the most beautiful place you visited?", "زیباترین جایی که دیدی کجا بود؟"),
            d("B", "Park Güell. The views of the city were stunning.", "پارک گوئل. منظره‌های شهر خیره‌کننده بود."),
            d("A", "Did you take a lot of photos?", "عکس‌های زیادی گرفتی؟"),
            d("B", "Hundreds! I'll show you sometime.", "صدها! یک وقت نشانت می‌دهم."),
            d("A", "Please do. Would you go back?", "لطفاً. برمی‌گشتی؟"),
            d("B", "Definitely. There's still so much to see.", "قطعاً. هنوز چیزهای زیادی برای دیدن است."),
            d("A", "What would you do differently next time?", "بار بعد چه کار متفاوتی می‌کردی؟"),
            d("B", "I'd travel in spring. Fewer tourists.", "بهار سفر می‌کردم. گردشگران کمتر."),
            d("A", "Good idea. What about a festival in our town?", "فکر خوبی. جشنواره در شهرمان چطور؟"),
            d("B", "That would be nice. What kind of festival?", "خوب می‌شد. چه نوع جشنواره‌ای؟"),
            d("A", "A food festival. We have so many great restaurants.", "جشنواره غذا. رستوران‌های عالی زیادی داریم."),
            d("B", "I love that idea. We could invite local chefs.", "عاشق این ایده‌ام. می‌توانستیم آشپزهای محلی را دعوت کنیم."),
            d("A", "And have cooking demonstrations.", "و نمایش آشپزی داشته باشیم."),
            d("B", "We should propose it to the city council.", "باید به شورای شهر پیشنهاد دهیم."),
            d("A", "Yes. It could become an annual event.", "بله. می‌تواند رویداد سالانه شود."),
            d("B", "That would boost tourism too.", "گردشگری را هم رونق می‌دهد."),
            d("A", "Exactly. Let's work on a proposal.", "دقیقاً. بیایید روی پیشنهادی کار کنیم."),
            d("B", "I'm in. What should we include?", "من هستم. چه چیزی باید شامل شود؟"),
            d("A", "Budget, location, and a schedule.", "بودجه، مکان، و برنامه زمانی."),
            d("B", "I'll research similar festivals.", "درباره جشنواره‌های مشابه تحقیق می‌کنم."),
            d("A", "And I'll talk to some restaurant owners.", "و من با چند صاحب رستوران صحبت می‌کنم."),
            d("B", "Great. This is exciting!", "عالی. هیجان‌انگیز است!"),
            d("A", "It is. Well, I should go. Let's meet next week.", "هست. خب، باید بروم. بیایید هفته بعد ملاقات کنیم."),
            d("B", "Perfect. See you then!", "عالی. آن موقع می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What was the most beautiful place Maria visited?", listOf("Sagrada Familia", "Park Güell", "the beach", "the market"), 1),
            q("What happened to Maria's luggage?", listOf("stolen", "lost", "damaged", "delayed"), 1),
            q("How was the hotel problem resolved?", listOf("refund", "upgrade", "apology", "discount"), 1),
            q("What kind of festival do they propose?", listOf("music", "food", "art", "film"), 1),
            q("Barcelona is ___ than my city.", listOf("beautiful", "more beautiful", "most beautiful", "beautifuller"), 1),
            q("The guide told us ___ careful.", listOf("be", "to be", "being", "been"), 1),
            q("She advised us ___ the local food.", listOf("try", "to try", "trying", "tried"), 1),
            q("It was the ___ I've ever had.", listOf("good", "better", "best", "goodest"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Peak season", "فصل اوج", "Summer is peak season.", "تابستان فصل اوج است."),
            IdiomExpression("Go wrong", "اشتباه شدن", "What went wrong?", "چه چیزی اشتباه شد؟"),
            IdiomExpression("Get lost", "گم شدن", "We got lost a few times.", "چند بار گم شدیم."),
            IdiomExpression("I'm in", "من هستم", "I'm in.", "من هستم.")
        ),
        phrasal = listOf(
            PhrasalVerb("check in", "پذیرش شدن", "register", "We checked in at the hotel.", "در هتل پذیرش شدیم.", "No"),
            PhrasalVerb("set off", "راه افتادن", "start a journey", "We set off early.", "زود راه افتادیم.", "No"),
            PhrasalVerb("look forward to", "منتظر بودن", "anticipate", "I'm looking forward to the trip.", "منتظر سفر هستم.", "No"),
            PhrasalVerb("get around", "جابه‌جا شدن", "move from place to place", "It's easy to get around.", "جابه‌جا شدن راحت است.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Compound adjectives", "well-KNOWN, BREATH-taking, FIVE-star, FAMily-friendly."),
            PronunciationTip("Travel vocabulary", "TOURism, desTI nation, ACcommoDAtion, ITInerary."),
            PronunciationTip("Comparatives stress", "Barcelona is MORE beautiful than my city.")
        ),
        culture = listOf(
            CulturalNote("Travel problems", "Lost luggage, dirty rooms, and getting lost are common travel issues."),
            CulturalNote("Festivals", "Local festivals can boost tourism and community pride."),
            CulturalNote("Tourism seasons", "Peak seasons vary by destination and affect crowds and prices.")
        ),
        mistakes = listOf(
            CommonMistake("Barcelona is more beautiful that my city.", "Barcelona is more beautiful than my city.", "Use 'than' in comparisons."),
            CommonMistake("She told me be careful.", "She told me to be careful.", "Use 'to + verb' after tell."),
            CommonMistake("I have been to Barcelona last year.", "I went to Barcelona last year.", "Use simple past with specific time."),
            CommonMistake("It was the best I ever had.", "It was the best I've ever had.", "Use present perfect with 'ever'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What problems did Maria have?", "Lost luggage, unclean room (upgraded), got lost a few times."),
            ComprehensionQuestion("What did she love most?", "The architecture (Sagrada Familia) and Park Güell views."),
            ComprehensionQuestion("What's their festival idea?", "A food festival with local chefs and cooking demonstrations.")
        ),
        speaking = listOf(
            SpeakingTask("Compare two cities you've visited.", "دو شهری که دیده‌ای را مقایسه کن.", "A is more... than B. / The most... / It's not as... as..."),
            SpeakingTask("Report a travel problem and solution.", "یک مشکل سفر و راه‌حلش را گزارش کن.", "My... was... / They told me... / I complained and..."),
            SpeakingTask("Discuss ideas for a local festival.", "درباره ایده‌هایی برای جشنواره محلی صحبت کن.", "We could... / It would... / Let's propose...")
        ),
        writing = listOf(
            WritingTask("Write about a memorable trip and a problem you solved.", "درباره یک سفر به‌یادماندنی و مشکلی که حل کردی بنویس.", 180, "Use comparatives and reported speech.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 6 — The way we are | آنگونه که هستیم
    // ═══════════════════════════════════════════════════════════════
    private fun unit6() = base(
        6, "The way we are", "آنگونه که هستیم",
        listOf(
            "Talk about character traits",
            "Interrupt politely",
            "Agree to an interruption",
            "Talk about present wishes",
            "Discuss ways to relax"
        ),
        listOf(
            v("character", "شخصیت", "He has a strong character.", "او شخصیت قوی‌ای دارد."),
            v("trait", "ویژگی", "Patience is a good trait.", "صبر ویژگی خوبی است."),
            v("personality", "شخصیت", "She has a lovely personality.", "شخصیت دوست‌داشتنی‌ای دارد."),
            v("introvert", "درون‌گرا", "I'm an introvert.", "من درون‌گرا هستم."),
            v("extrovert", "برون‌گرا", "He's a total extrovert.", "او کاملاً برون‌گراست."),
            v("reliable", "قابل اعتماد", "She's very reliable.", "او خیلی قابل اعتماد است.", "adjective"),
            v("generous", "سخاوتمند", "He's generous with his time.", "او با وقتش سخاوتمند است.", "adjective"),
            v("stubborn", "لجباز", "He can be stubborn.", "او می‌تواند لجباز باشد.", "adjective"),
            v("patient", "صبور", "She's very patient.", "او خیلی صبور است.", "adjective"),
            v("wish", "آرزو کردن", "I wish I could relax more.", "آرزو می‌کنم بیشتر می‌توانستم استراحت کنم.", "verb"),
            v("interrupt", "وقفه انداختن", "Sorry to interrupt.", "ببخشید وقفه می‌اندازم.", "verb"),
            v("relax", "استراحت کردن", "I need to relax.", "باید استراحت کنم.", "verb"),
            v("therapy", "درمان", "Therapy can help.", "درمان می‌تواند کمک کند."),
            v("stress", "استرس", "Stress affects everyone.", "استرس روی همه تأثیر می‌گذارد."),
            v("mindfulness", "ذهن‌آگاهی", "Mindfulness reduces stress.", "ذهن‌آگاهی استرس را کم می‌کند.")
        ),
        listOf(
            GrammarSection("Defining relative clauses", "who, which, that. She's a person who... I want a job that... Use for essential information."),
            GrammarSection("Wish for present situations", "wish + past simple. I wish I had more time. I wish I could speak French."),
            GrammarSection("Interrupting politely", "Sorry to interrupt, but... / Can I just say...? / May I add something?"),
            GrammarSection("Agreeing to an interruption", "Of course. / Go ahead. / That's fine.")
        ),
        listOf(
            d("A", "Hey, Maria! I read an interesting article about personality.", "هی، ماریا! مقاله جالبی درباره شخصیت خواندم."),
            d("B", "Oh? What did it say?", "اوه؟ چه گفت؟"),
            d("A", "It said there are five main personality traits.", "گفت پنج ویژگی اصلی شخصیت وجود دارد."),
            d("B", "What are they?", "آن‌ها چیست؟"),
            d("A", "Openness, conscientiousness, extraversion, agreeableness, and neuroticism.", "باز بودن، وظیفه‌شناسی، برون‌گرایی، سازگاری، و روان‌رنجوری."),
            d("B", "That's a lot to remember. Which one are you?", "زیاد است برای به خاطر سپردن. کدام یکی هستی؟"),
            d("A", "Probably high in openness. I love new experiences.", "احتمالاً در باز بودن بالا. عاشق تجربیات جدیدم."),
            d("B", "That makes sense. You're always trying new things.", "منطقی است. همیشه چیزهای جدید امتحان می‌کنی."),
            d("A", "What about you?", "تو چطور؟"),
            d("B", "I'm more of an introvert. I need quiet time to recharge.", "من بیشتر درون‌گرا هستم. به زمان سکوت نیاز دارم تا انرژی بگیرم."),
            d("A", "That's a defining trait of introverts.", "این ویژگی تعیین‌کننده درون‌گراهاست."),
            d("B", "Exactly. I wish I could be more outgoing sometimes.", "دقیقاً. آرزو می‌کنم گاهی می‌توانستم اجتماعی‌تر باشم."),
            d("A", "But introverts have great strengths too.", "ولی درون‌گراها نقاط قوت عالی‌ای هم دارند."),
            d("B", "Like what?", "مثل چی؟"),
            d("A", "Deep thinking, good listening, and creativity.", "تفکر عمیق، گوش دادن خوب، و خلاقیت."),
            d("B", "I've heard that. I do enjoy my creative projects.", "شنیده‌ام. من از پروژه‌های خلاقانه‌ام لذت می‌برم."),
            d("A", "See? It's a strength, not a weakness.", "می‌بینی؟ یک نقطه قوت است، نه ضعف."),
            d("B", "Thanks. What about your friends? Are they like you?", "ممنون. دوستانت چطور؟ مثل تو هستند؟"),
            d("A", "Mixed. Some are extroverts who love parties.", "متنوع. برخی برون‌گرا هستند که مهمانی دوست دارند."),
            d("B", "I have a friend who talks to everyone.", "دوستی دارم که با همه صحبت می‌کند."),
            d("A", "That's a typical extrovert.", "این یک برون‌گرای معمولی است."),
            d("B", "She's someone who gets energy from people.", "او کسی است که از مردم انرژی می‌گیرد."),
            d("A", "Exactly. Different people recharge differently.", "دقیقاً. افراد مختلف به روش‌های متفاوتی انرژی می‌گیرند."),
            d("B", "Sorry to interrupt, but I have a question.", "ببخشید وقفه می‌اندازم، ولی سؤالی دارم."),
            d("A", "Of course. Go ahead.", "البته. بفرمایید."),
            d("B", "Can personality change over time?", "آیا شخصیت می‌تواند در طول زمان تغییر کند؟"),
            d("A", "Yes, it can. Experiences shape us.", "بله، می‌تواند. تجربیات ما را شکل می‌دهند."),
            d("B", "I wish I were more patient. I get frustrated easily.", "آرزو می‌کنم صبورتر بودم. راحت ناامید می‌شوم."),
            d("A", "Patience can be learned. Meditation helps.", "صبر می‌تواند یاد گرفته شود. مدیتیشن کمک می‌کند."),
            d("B", "I've been trying mindfulness lately.", "اخیراً ذهن‌آگاهی را امتحان کرده‌ام."),
            d("A", "How's it going?", "چطور پیش می‌رود؟"),
            d("B", "It helps. I feel calmer after each session.", "کمک می‌کند. بعد از هر جلسه آرام‌تر حس می‌کنم."),
            d("A", "That's great. What else do you do to relax?", "عالی است. دیگر برای استراحت چه کار می‌کنی؟"),
            d("B", "I read, take walks, and listen to music.", "می‌خوانم، پیاده‌روی می‌کنم، و موسیقی گوش می‌دهم."),
            d("A", "Those are all good. I wish I had more time to relax.", "همه خوب هستند. آرزو می‌کنم زمان بیشتری برای استراحت داشتم."),
            d("B", "You should make time. It's important for health.", "باید وقت بسازی. برای سلامت مهم است."),
            d("A", "You're right. What's your favorite way to unwind?", "حق داری. روش مورد علاقه‌ات برای آرام شدن چیست؟"),
            d("B", "A hot bath and a good book. Simple but effective.", "حمام گرم و یک کتاب خوب. ساده ولی مؤثر."),
            d("A", "That sounds lovely. I might try that.", "زیبا به نظر می‌رسد. شاید امتحان کنم."),
            d("B", "You should. What about therapy? Have you ever tried it?", "باید بکنی. درمان چطور؟ هیچ‌وقت امتحانش کرده‌ای؟"),
            d("A", "No, but I've heard it helps many people.", "نه، ولی شنیده‌ام به خیلی‌ها کمک می‌کند."),
            d("B", "It does. It's not just for serious problems.", "کمک می‌کند. فقط برای مشکلات جدی نیست."),
            d("A", "That's good to know. Maybe I'll look into it.", "خوبه بدانم. شاید بررسی کنم."),
            d("B", "It can help with stress and self-understanding.", "می‌تواند به استرس و خودشناسی کمک کند."),
            d("A", "I could use some of that. Work has been stressful.", "من هم می‌توانم از آن استفاده کنم. کار استرس‌زا بوده."),
            d("B", "What's been stressing you out?", "چه چیزی استرست را زیاد کرده؟"),
            d("A", "Deadlines. I have too many projects.", "مهلت‌ها. پروژه‌های زیادی دارم."),
            d("B", "That's tough. Have you tried prioritizing?", "سخت است. اولویت‌بندی را امتحان کرده‌ای؟"),
            d("A", "I try, but everything feels urgent.", "سعی می‌کنم، ولی همه چیز فوری حس می‌شود."),
            d("B", "I know that feeling. I wish I could help.", "این حس را می‌شناسم. آرزو می‌کنم می‌توانستم کمک کنم."),
            d("A", "Thanks. Just talking helps.", "ممنون. فقط صحبت کردن کمک می‌کند."),
            d("B", "Anytime. That's what friends are for.", "هر وقت. دوستان برای همین هستند."),
            d("A", "Well said. I should go now. Thanks for listening.", "خوب گفتی. خب، باید بروم. ممنون که گوش دادی."),
            d("B", "Of course. Take care of yourself!", "البته. از خودت مراقبت کن!"),
            d("A", "You too. See you soon!", "تو هم. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How many main personality traits are there?", listOf("3", "4", "5", "7"), 2),
            q("What trait is Maria?", listOf("extrovert", "introvert", "both", "neither"), 1),
            q("What does Maria do to relax?", listOf("run", "read and walk", "cook", "sleep"), 1),
            q("What has Ali been stressed about?", listOf("family", "deadlines", "health", "money"), 1),
            q("She's a person ___ is very kind.", listOf("which", "who", "where", "what"), 1),
            q("I want a job ___ is interesting.", listOf("who", "which", "where", "what"), 1),
            q("I wish I ___ more time.", listOf("have", "had", "will have", "having"), 1),
            q("I wish I ___ speak French.", listOf("can", "could", "will", "would"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Recharge", "انرژی گرفتن", "I need quiet time to recharge.", "به زمان سکوت نیاز دارم تا انرژی بگیرم."),
            IdiomExpression("Go ahead", "بفرمایید", "Of course. Go ahead.", "البته. بفرمایید."),
            IdiomExpression("Unwind", "آرام شدن", "My favorite way to unwind.", "روش مورد علاقه‌ام برای آرام شدن."),
            IdiomExpression("That's what friends are for", "دوستان برای همین هستند", "That's what friends are for.", "دوستان برای همین هستند.")
        ),
        phrasal = listOf(
            PhrasalVerb("recharge", "انرژی گرفتن", "restore energy", "I need to recharge.", "باید انرژی بگیرم.", "No"),
            PhrasalVerb("look into", "بررسی کردن", "investigate", "I'll look into therapy.", "درمان را بررسی می‌کنم.", "No"),
            PhrasalVerb("calm down", "آرام شدن", "relax", "I need to calm down.", "باید آرام شوم.", "No"),
            PhrasalVerb("open up", "باز شدن", "share feelings", "He opened up about his stress.", "او درباره استرسش باز شد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Defining relative clauses", "She's a person WHO is kind. I want a job THAT is interesting."),
            PronunciationTip("Wish stress", "I WISH I had more time."),
            PronunciationTip("Character vocabulary", "PERsonality, INTROvert, EXtrovert, reLIable.")
        ),
        culture = listOf(
            CulturalNote("Personality types", "The Big Five personality traits are widely used in psychology."),
            CulturalNote("Therapy", "Therapy is increasingly accepted for stress and personal growth."),
            CulturalNote("Mindfulness", "Mindfulness and meditation are popular stress-management techniques.")
        ),
        mistakes = listOf(
            CommonMistake("She's a person which is kind.", "She's a person who is kind.", "Use 'who' for people."),
            CommonMistake("I wish I have more time.", "I wish I had more time.", "Use past simple after wish."),
            CommonMistake("I wish I can speak French.", "I wish I could speak French.", "Use 'could' after wish."),
            CommonMistake("I need quiet time for recharge.", "I need quiet time to recharge.", "Use infinitive after purpose.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the five personality traits?", "Openness, conscientiousness, extraversion, agreeableness, neuroticism."),
            ComprehensionQuestion("What does Maria do to relax?", "Reads, walks, listens to music, takes hot baths."),
            ComprehensionQuestion("What's Ali stressed about?", "Work deadlines and too many projects.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your personality traits.", "درباره ویژگی‌های شخصیتی‌ات صحبت کن.", "I'm... / I tend to... / I wish I were..."),
            SpeakingTask("Discuss ways to relax and manage stress.", "درباره راه‌های آرام شدن و مدیریت استرس صحبت کن.", "I relax by... / It helps me... / I should..." ),
            SpeakingTask("Role-play interrupting politely.", "نقش‌بازی وقفه مؤدبانه.", "Sorry to interrupt, but... / Of course. Go ahead.")
        ),
        writing = listOf(
            WritingTask("Write about your personality and how you relax.", "درباره شخصیتت و نحوه آرام شدنت بنویس.", 180, "Use defining relative clauses and wish.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 7 — New ways of thinking | روش‌های فکر کردن
    // ═══════════════════════════════════════════════════════════════
    private fun unit7() = base(
        7, "New ways of thinking", "روش‌های فکر کردن",
        listOf(
            "Discuss inventions and innovations",
            "Describe how things are done",
            "Talk about creative problem-solving",
            "Discuss the impact of technology"
        ),
        listOf(
            v("invention", "اختراع", "The wheel is a great invention.", "چرخ اختراع بزرگی است."),
            v("invent", "اختراع کردن", "Who invented the telephone?", "چه کسی تلفن را اختراع کرد؟", "verb"),
            v("innovation", "نوآوری", "Innovation drives progress.", "نوآوری پیشرفت را هدایت می‌کند."),
            v("creative", "خلاق", "She's very creative.", "او خیلی خلاق است.", "adjective"),
            v("conventional", "متعارف", "It was a conventional approach.", "رویکرد متعارفی بود.", "adjective"),
            v("unconventional", "غیرمتعارف", "He has unconventional ideas.", "او ایده‌های غیرمتعارفی دارد.", "adjective"),
            v("effective", "مؤثر", "This method is effective.", "این روش مؤثر است.", "adjective"),
            v("solve", "حل کردن", "We need to solve this problem.", "باید این مشکل را حل کنیم.", "verb"),
            v("solution", "راه‌حل", "What's the solution?", "راه‌حل چیست؟"),
            v("imagine", "تصور کردن", "Imagine a world without cars.", "دنیایی بدون ماشین تصور کن.", "verb"),
            v("design", "طراحی کردن", "She designs furniture.", "او مبلمان طراحی می‌کند.", "verb"),
            v("develop", "توسعه دادن", "They developed a new app.", "آن‌ها اپلیکیشن جدیدی توسعه دادند.", "verb"),
            v("improve", "بهبود دادن", "We can improve this process.", "می‌توانیم این فرآیند را بهبود دهیم.", "verb"),
            v("impact", "تأثیر", "Technology has a huge impact.", "تکنولوژی تأثیر بزرگی دارد."),
            v("progress", "پیشرفت", "Progress requires change.", "پیشرفت نیازمند تغییر است.")
        ),
        listOf(
            GrammarSection("Passive voice: present and past", "The telephone was invented by Bell. English is spoken worldwide."),
            GrammarSection("Passive with modals", "It can be done. It should be improved. It might be replaced."),
            GrammarSection("So and such", "So + adjective. Such + noun phrase. It was so effective. It was such a good idea."),
            GrammarSection("Verb and noun formation", "invent → invention, create → creation, develop → development.")
        ),
        listOf(
            d("A", "Hey, Maria! Have you ever thought about inventions?", "هی، ماریا! هیچ‌وقت به اختراعات فکر کرده‌ای؟"),
            d("B", "A little. What made you think about that?", "کمی. چه چیزی باعث شد به آن فکر کنی؟"),
            d("A", "I read about accidental inventions. Fascinating stuff.", "درباره اختراعات تصادفی خواندم. چیز جالبی."),
            d("B", "Like what?", "مثل چی؟"),
            d("A", "Penicillin was discovered by accident. So was the microwave.", "پنی‌سیلین تصادفی کشف شد. مایکروویو هم همینطور."),
            d("B", "Really? How was the microwave invented?", "واقعاً؟ مایکروویو چطور اختراع شد؟"),
            d("A", "A scientist noticed a chocolate bar melted near a magnetron.", "دانشمندی متوجه شد یک تخته شکلات نزدیک مگنترون ذوب شد."),
            d("B", "That's such a random discovery!", "این یک کشف کاملاً تصادفی است!"),
            d("A", "I know. Some of the best inventions were accidents.", "می‌دانم. برخی از بهترین اختراعات تصادفی بودند."),
            d("B", "What's your favorite invention?", "اختراع مورد علاقه‌ات چیست؟"),
            d("A", "The internet. It's changed everything.", "اینترنت. همه چیز را تغییر داده."),
            d("B", "True. It was invented by multiple people over time.", "درست. توسط افراد متعددی در طول زمان اختراع شد."),
            d("A", "It's so powerful. Information is shared instantly.", "خیلی قدرتمند است. اطلاعات فوراً به اشتراک گذاشته می‌شود."),
            d("B", "It has its downsides too.", "معایبی هم دارد."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Privacy issues, misinformation, addiction...", "مسائل حریم خصوصی، اطلاعات نادرست، اعتیاد..."),
            d("A", "That's true. Every invention has an impact.", "درست است. هر اختراعی تأثیر دارد."),
            d("B", "What do you think is the most important invention?", "فکر می‌کنی مهم‌ترین اختراع چیست؟"),
            d("A", "Probably electricity. Nothing works without it.", "احتمالاً برق. هیچ چیز بدون آن کار نمی‌کند."),
            d("B", "Good point. What about the future?", "نکته خوبی. آینده چطور؟"),
            d("A", "I think AI will be the next big thing.", "فکر می‌کنم هوش مصنوعی چیز بزرگ بعدی خواهد بود."),
            d("B", "It's already being used everywhere.", "الان همه جا استفاده می‌شود."),
            d("A", "Yes. It can be used to solve big problems.", "بله. می‌تواند برای حل مشکلات بزرگ استفاده شود."),
            d("B", "Like climate change?", "مثل تغییرات اقلیمی؟"),
            d("A", "Exactly. AI can analyze data faster than humans.", "دقیقاً. هوش مصنوعی می‌تواند داده‌ها را سریع‌تر از انسان تحلیل کند."),
            d("B", "That's promising. But I'm also a bit worried.", "امیدوارکننده است. ولی کمی هم نگرانم."),
            d("A", "About what?", "درباره چی؟"),
            d("B", "That it might be misused. Or take over jobs.", "که ممکن است سوءاستفاده شود. یا شغل‌ها را بگیرد."),
            d("A", "Those are valid concerns.", "نگرانی‌های معتبری هستند."),
            d("B", "I think regulation is needed.", "فکر می‌کنم مقررات لازم است."),
            d("A", "I agree. Technology should be developed responsibly.", "موافقم. تکنولوژی باید مسئولانه توسعه یابد."),
            d("B", "What's an example of creative problem-solving?", "مثال حل خلاقانه مسئله چیست؟"),
            d("A", "Using drones to deliver medicine to remote areas.", "استفاده از پهپادها برای رساندن دارو به مناطق دورافتاده."),
            d("B", "That's such a clever solution.", "راه‌حل هوشمندانه‌ای است."),
            d("A", "It is. Innovation often comes from necessity.", "هست. نوآوری اغلب از نیاز می‌آید."),
            d("B", "Do you consider yourself creative?", "خودت را خلاق می‌دانی؟"),
            d("A", "Somewhat. I like brainstorming new ideas.", "تا حدی. دوست دارم ایده‌های جدید طوفان فکری کنم."),
            d("B", "What's the most creative thing you've done?", "خلاقانه‌ترین کاری که کرده‌ای چیست؟"),
            d("A", "I designed a website for a friend's business.", "وب‌سایتی برای کسب‌وکار دوستم طراحی کردم."),
            d("B", "Nice. Was it hard?", "خوبه. سخت بود؟"),
            d("A", "Challenging but fun. I learned a lot.", "چالش‌برانگیز ولی سرگرم‌کننده. زیاد یاد گرفتم."),
            d("B", "That's the best kind of project.", "بهترین نوع پروژه است."),
            d("A", "What about you? Are you creative?", "تو چطور؟ خلاقی؟"),
            d("B", "I think so. I write short stories.", "فکر می‌کنم بله. داستان‌های کوتاه می‌نویسم."),
            d("A", "Really? I didn't know that. What are they about?", "واقعاً؟ نمی‌دانستم. درباره چی هستند؟"),
            d("B", "Mostly science fiction. Imagining future worlds.", "بیشتر علمی-تخیلی. تصور دنیاهای آینده."),
            d("A", "That's fascinating. Have you published any?", "جالب است. هیچ‌کدام را منتشر کرده‌ای؟"),
            d("B", "Not yet. But I'm working on it.", "هنوز نه. ولی رویش کار می‌کنم."),
            d("A", "You should. Creative writing is important.", "باید بکنی. نوشتن خلاقانه مهم است."),
            d("B", "Thanks. It's a hobby for now.", "ممنون. فعلاً سرگرمی است."),
            d("A", "What inspires your stories?", "چه چیزی به داستان‌هایت الهام می‌دهد؟"),
            d("B", "Technology, mostly. How it might change society.", "بیشتر تکنولوژی. چطور ممکن است جامعه را تغییر دهد."),
            d("A", "That's a rich source of ideas.", "منبع غنی ایده‌هاست."),
            d("B", "It is. Well, I should go. Let's brainstorm together sometime!", "هست. خب، باید بروم. بیایید یک وقت با هم طوفان فکری کنیم!"),
            d("A", "I'd love that. See you soon!", "دوست دارم. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How was the microwave invented?", listOf("planned", "by accident", "in a lab", "by accident"), 1),
            q("What's Ali's favorite invention?", listOf("electricity", "the internet", "the phone", "the wheel"), 1),
            q("What's Maria worried about?", listOf("AI misuse", "climate change", "privacy", "addiction"), 0),
            q("What does Maria write?", listOf("poetry", "science fiction", "news", "songs"), 1),
            q("The telephone ___ invented by Bell.", listOf("is", "was", "are", "were"), 1),
            q("It can ___ done easily.", listOf("be", "is", "are", "was"), 0),
            q("It was ___ effective.", listOf("such", "so", "very", "too"), 1),
            q("It was ___ a good idea.", listOf("so", "such", "very", "too"), 1)
        ),
        idioms = listOf(
            IdiomExpression("By accident", "تصادفی", "It was discovered by accident.", "تصادفی کشف شد."),
            IdiomExpression("The next big thing", "چیز بزرگ بعدی", "AI is the next big thing.", "هوش مصنوعی چیز بزرگ بعدی است."),
            IdiomExpression("Take over", "گرفتن", "It might take over jobs.", "ممکن است شغل‌ها را بگیرد."),
            IdiomExpression("Rich source", "منبع غنی", "A rich source of ideas.", "منبع غنی ایده‌ها.")
        ),
        phrasal = listOf(
            PhrasalVerb("come up with", "به ذهن رسیدن", "think of", "Come up with new ideas.", "ایده‌های جدید به ذهن بیاور.", "No"),
            PhrasalVerb("figure out", "فهمیدن", "understand", "Figure out how it works.", "بفهم چطور کار می‌کند.", "No"),
            PhrasalVerb("work out", "حل شدن", "resolve", "The problem worked out.", "مشکل حل شد.", "No"),
            PhrasalVerb("turn into", "تبدیل شدن", "become", "It turned into a big success.", "به موفقیت بزرگی تبدیل شد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Passive voice stress", "The telephone was inVENted by Bell."),
            PronunciationTip("So vs such", "It was SO effective. It was SUCH a good idea."),
            PronunciationTip("Invention vocabulary", "inVENtion, innoVAtion, creAtive, conVENtional.")
        ),
        culture = listOf(
            CulturalNote("Accidental inventions", "Many common inventions were discovered by accident."),
            CulturalNote("AI ethics", "Responsible development of AI is a growing concern."),
            CulturalNote("Creative problem-solving", "Innovation often comes from necessity and constraints.")
        ),
        mistakes = listOf(
            CommonMistake("The telephone was invent by Bell.", "The telephone was invented by Bell.", "Use past participle in passive."),
            CommonMistake("It can is done.", "It can be done.", "Use 'be' after modal in passive."),
            CommonMistake("It was so a good idea.", "It was such a good idea.", "Use 'such' before noun phrases."),
            CommonMistake("I have came up with an idea.", "I have come up with an idea.", "Use past participle 'come'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What accidental inventions are mentioned?", "Penicillin and the microwave."),
            ComprehensionQuestion("What's Maria's creative hobby?", "Writing science fiction stories about future worlds."),
            ComprehensionQuestion("What are the concerns about AI?", "Misuse and job displacement; regulation is needed.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about an invention that changed the world.", "درباره اختراعی که دنیا را تغییر داد صحبت کن.", "It was invented... / It changed... / It's used..." ),
            SpeakingTask("Discuss creative problem-solving.", "درباره حل خلاقانه مسئله صحبت کن.", "One solution is... / It can be... / We could..." ),
            SpeakingTask("Talk about technology's impact.", "درباره تأثیر تکنولوژی صحبت کن.", "Technology has... / It can be... / I think..." )
        ),
        writing = listOf(
            WritingTask("Write about an invention and its impact on society.", "درباره یک اختراع و تأثیرش بر جامعه بنویس.", 180, "Use passive voice and so/such.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 8 — Lessons in life | درس‌های زندگی
    // ═══════════════════════════════════════════════════════════════
    private fun unit8() = base(
        8, "Lessons in life", "درس‌های زندگی",
        listOf(
            "Discuss life lessons and experiences",
            "Use past modals for regrets",
            "Talk about what you would have done differently",
            "Share wisdom and advice"
        ),
        listOf(
            v("lesson", "درس", "I learned a valuable lesson.", "درس ارزشمندی یاد گرفتم."),
            v("experience", "تجربه", "Experience is the best teacher.", "تجربه بهترین معلم است."),
            v("regret", "پشیمانی", "I have no regrets.", "پشیمانی ندارم."),
            v("mistake", "اشتباه", "Everyone makes mistakes.", "همه اشتباه می‌کنند."),
            v("wisdom", "خرد", "She shared her wisdom.", "او خردش را به اشتراک گذاشت."),
            v("advice", "توصیه", "Take my advice.", "توصیه‌ام را بپذیر."),
            v("opportunity", "فرصت", "Don't miss the opportunity.", "فرصت را از دست نده."),
            v("challenge", "چالش", "It was a difficult challenge.", "چالش سختی بود."),
            v("overcome", "غلبه کردن", "She overcame her fears.", "او بر ترس‌هایش غلبه کرد.", "verb"),
            v("grow", "رشد کردن", "We grow through challenges.", "از طریق چالش‌ها رشد می‌کنیم.", "verb"),
            v("learn", "یاد گرفتن", "I learned from my mistake.", "از اشتباهم یاد گرفتم.", "verb"),
            v("value", "ارزش", "Value your time.", "به وقتت ارزش بده."),
            v("patience", "صبر", "Patience is a virtue.", "صبر یک فضیلت است."),
            v("perspective", "دیدگاه", "It changed my perspective.", "دیدگاهم را تغییر داد."),
            v("appreciate", "قدر دانستن", "I appreciate your help.", "کمکت را قدر می‌دانم.", "verb")
        ),
        listOf(
            GrammarSection("Past modals for regrets", "should have / could have / would have + past participle. I should have studied harder. I could have done better."),
            GrammarSection("Third conditional", "If + past perfect, would have + past participle. If I had known, I would have helped."),
            GrammarSection("Expressing regret", "I regret... / I wish I had... / If only I had..." ),
            GrammarSection("Giving advice about the past", "You should have... / You could have... / It would have been better to...")
        ),
        listOf(
            d("A", "Hey, Maria! I've been thinking about life lessons lately.", "هی، ماریا! اخیراً به درس‌های زندگی فکر کرده‌ام."),
            d("B", "That's deep. What brought that on?", "عمیق است. چه چیزی باعثش شد؟"),
            d("A", "I turned 30 last week. It made me reflect.", "هفته پیش ۳۰ ساله شدم. باعث شد تأمل کنم."),
            d("B", "Happy birthday! How do you feel about it?", "تولدت مبارک! چه حسی داری؟"),
            d("A", "Good, mostly. But I have some regrets.", "خوب، بیشترش. ولی چند پشیمانی دارم."),
            d("B", "Like what?", "مثل چی؟"),
            d("A", "I should have studied abroad when I had the chance.", "باید وقتی فرصت داشتم خارج درس می‌خواندم."),
            d("B", "Why didn't you?", "چرا نکردی؟"),
            d("A", "I was afraid. I didn't want to leave my comfort zone.", "می‌ترسیدم. نمی‌خواستم منطقه امنم را ترک کنم."),
            d("B", "I understand. But it's not too late.", "می‌فهمم. ولی خیلی دیر نیست."),
            d("A", "You're right. I could have done it later too.", "حق داری. می‌توانستم بعداً هم انجامش دهم."),
            d("B", "What else do you regret?", "دیگر چه چیزی را پشیمانی؟"),
            d("A", "I should have spent more time with my grandfather.", "باید وقت بیشتری با پدربزرگم می‌گذراندم."),
            d("B", "Was he sick?", "مریض بود؟"),
            d("A", "Yes. He passed away two years ago.", "بله. دو سال پیش فوت کرد."),
            d("B", "I'm so sorry.", "خیلی متأسفم."),
            d("A", "Thank you. I wish I had visited him more.", "ممنون. آرزو می‌کنم بیشتر به دیدارش می‌رفتم."),
            d("B", "He knew you loved him. That matters.", "می‌دانست دوستش داری. همین مهم است."),
            d("A", "I hope so. What about you? Any regrets?", "امیدوارم. تو چطور؟ پشیمانی‌ای داری؟"),
            d("B", "A few. I should have learned a musical instrument.", "چند تا. باید یک ساز یاد می‌گرفتم."),
            d("A", "It's never too late to start.", "برای شروع هرگز دیر نیست."),
            d("B", "True. Maybe I'll start now. What would you have done differently?", "درست. شاید الان شروع کنم. تو چه کار متفاوتی می‌کردی؟"),
            d("A", "I would have taken more risks.", "ریسک بیشتری می‌کردم."),
            d("B", "Like what?", "مثل چی؟"),
            d("A", "I would have started my own business earlier.", "زودتر کسب‌وکار خودم را راه می‌انداختم."),
            d("B", "Why didn't you?", "چرا نکردی؟"),
            d("A", "I was waiting for the perfect moment. It never came.", "منتظر لحظه کامل بودم. هرگز نیامد."),
            d("B", "That's a common mistake. We wait too long.", "اشتباه رایجی است. خیلی طولانی صبر می‌کنیم."),
            d("A", "Exactly. If I had known then what I know now...", "دقیقاً. اگر آن موقع می‌دانستم الان چه می‌دانم..."),
            d("B", "You would have done things differently.", "کارها را متفاوت انجام می‌دادی."),
            d("A", "Yes. But regret is part of life.", "بله. ولی پشیمانی بخشی از زندگی است."),
            d("B", "It teaches us. What's the biggest lesson you've learned?", "به ما یاد می‌دهد. بزرگ‌ترین درسی که یاد گرفته‌ای چیست؟"),
            d("A", "That time is precious. Don't waste it.", "اینکه زمان گرانبهاست. هدرش نده."),
            d("B", "That's a good one. Mine is: be kind to everyone.", "خوب است. مال من: با همه مهربان باش."),
            d("A", "Why that one?", "چرا آن یکی؟"),
            d("B", "You never know what someone is going through.", "هرگز نمی‌دانی کسی چه چیزی را می‌گذراند."),
            d("A", "That's beautiful. Kindness costs nothing.", "زیباست. مهربانی هزینه‌ای ندارد."),
            d("B", "Exactly. What advice would you give your younger self?", "دقیقاً. به خود جوان‌ترت چه توصیه‌ای می‌کردی؟"),
            d("A", "Don't be so afraid. Take chances.", "اینقدر نترس. فرصت‌ها را غنیمت بشمار."),
            d("B", "I'd tell myself to be more confident.", "به خودم می‌گفتم بااعتمادبه‌نفس‌تر باش."),
            d("A", "Confidence comes with experience.", "اعتماد به نفس با تجربه می‌آید."),
            d("B", "True. I've grown a lot in the last few years.", "درست. در چند سال گذشته خیلی رشد کرده‌ام."),
            d("A", "Me too. Challenges make us stronger.", "من هم. چالش‌ها ما را قوی‌تر می‌کنند."),
            d("B", "What's been your biggest challenge?", "بزرگ‌ترین چالشت چه بوده؟"),
            d("A", "Losing my job. It was devastating.", "از دست دادن شغلم. ویران‌کننده بود."),
            d("B", "How did you get through it?", "چطور از آن عبور کردی؟"),
            d("A", "Family support. And I found a better job eventually.", "حمایت خانواده. و در نهایت شغل بهتری پیدا کردم."),
            d("B", "That's inspiring. You turned it around.", "الهام‌بخش است. آن را به نفع خود تغییر دادی."),
            d("A", "I had to. What about your biggest challenge?", "مجبور بودم. بزرگ‌ترین چالشت چطور؟"),
            d("B", "Moving to a new city alone. It was lonely.", "تنها به شهر جدیدی نقل مکان کردم. تنهایی بود."),
            d("A", "How did you cope?", "چطور کنار آمدی؟"),
            d("B", "I joined clubs and made friends. It took time.", "به باشگاه‌ها پیوستم و دوست پیدا کردم. زمان برد."),
            d("A", "That's brave. It's hard to start over.", "شجاعانه است. شروع دوباره سخت است."),
            d("B", "It is. But it made me more independent.", "هست. ولی مستقل‌ترم کرد."),
            d("A", "Growth comes from discomfort.", "رشد از ناراحتی می‌آید."),
            d("B", "Exactly. Well said. What's your biggest hope for the future?", "دقیقاً. خوب گفتی. بزرگ‌ترین امیدت برای آینده چیست؟"),
            d("A", "To live without regret. To seize opportunities.", "زندگی بدون پشیمانی. غنیمت شمردن فرصت‌ها."),
            d("B", "That's a great goal. I hope the same for myself.", "هدف عالی‌ای است. برای خودم هم همین را امیدوارم."),
            d("A", "Let's both try. Well, I should go. Thanks for this talk.", "بیایید هر دو تلاش کنیم. خب، باید بروم. ممنون برای این گفتگو."),
            d("B", "Thank you. It was meaningful. See you soon!", "ممنون. معنی‌دار بود. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Why did Ali reflect on life?", listOf("new job", "turned 30", "lost friend", "moved"), 1),
            q("What does Ali regret about his grandfather?", listOf("not calling", "not visiting enough", "arguing", "not writing"), 1),
            q("What's Maria's biggest lesson?", listOf("time is precious", "be kind", "work hard", "save money"), 1),
            q("What was Maria's biggest challenge?", listOf("losing job", "moving alone", "illness", "divorce"), 1),
            q("I should ___ studied harder.", listOf("have", "has", "had", "having"), 0),
            q("I could ___ done better.", listOf("have", "has", "had", "having"), 0),
            q("If I ___ known, I would have helped.", listOf("have", "had", "has", "having"), 1),
            q("I wish I ___ visited him more.", listOf("have", "had", "has", "having"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Comfort zone", "منطقه امن", "Leave your comfort zone.", "منطقه امنت را ترک کن."),
            IdiomExpression("Turn it around", "به نفع خود تغییر دادن", "You turned it around.", "آن را به نفع خود تغییر دادی."),
            IdiomExpression("Start over", "شروع دوباره", "It's hard to start over.", "شروع دوباره سخت است."),
            IdiomExpression("Seize opportunities", "فرصت‌ها را غنیمت شمردن", "Seize opportunities.", "فرصت‌ها را غنیمت بشمار.")
        ),
        phrasal = listOf(
            PhrasalVerb("get through", "عبور کردن", "survive", "How did you get through it?", "چطور از آن عبور کردی؟", "No"),
            PhrasalVerb("turn around", "تغییر دادن", "change for the better", "You turned it around.", "آن را به نفع خود تغییر دادی.", "No"),
            PhrasalVerb("start over", "شروع دوباره", "begin again", "It's hard to start over.", "شروع دوباره سخت است.", "No"),
            PhrasalVerb("grow up", "بزرگ شدن", "become an adult", "I grew up in a small town.", "در شهر کوچکی بزرگ شدم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Past modals", "I SHOULD have STUdied. I COULD have DONE better."),
            PronunciationTip("Third conditional", "If I had KNOWN, I would have HELPED."),
            PronunciationTip("Life lesson vocabulary", "exPERience, reGRET, MIStake, WISdom.")
        ),
        culture = listOf(
            CulturalNote("Life lessons", "Reflecting on life lessons is common at milestone birthdays."),
            CulturalNote("Regret", "Regret is a universal emotion that can lead to growth."),
            CulturalNote("Wisdom", "Wisdom often comes from experience and reflection.")
        ),
        mistakes = listOf(
            CommonMistake("I should have study harder.", "I should have studied harder.", "Use past participle after have."),
            CommonMistake("If I would have known, I would have helped.", "If I had known, I would have helped.", "Use past perfect after 'if'."),
            CommonMistake("I wish I have visited him more.", "I wish I had visited him more.", "Use past perfect after wish."),
            CommonMistake("I could done better.", "I could have done better.", "Use 'have' + past participle.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Ali's regrets?", "Not studying abroad, not visiting his grandfather enough."),
            ComprehensionQuestion("What are Maria's regrets?", "Not learning a musical instrument."),
            ComprehensionQuestion("What lessons did they share?", "Time is precious; be kind to everyone.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a life lesson you've learned.", "درباره درسی که از زندگی گرفته‌ای صحبت کن.", "I learned that... / It taught me... / I wish I had..." ),
            SpeakingTask("Discuss regrets and what you would have done differently.", "درباره پشیمانی‌ها و کارهایی که متفاوت انجام می‌دادی صحبت کن.", "I should have... / If I had... / I would have..." ),
            SpeakingTask("Give advice to your younger self.", "به خود جوان‌ترت توصیه کن.", "I'd tell myself to... / Don't be... / Take..." )
        ),
        writing = listOf(
            WritingTask("Write about a life lesson and how it changed you.", "درباره یک درس زندگی و اینکه چطور تغییرت داد بنویس.", 180, "Use past modals and third conditional.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 9 — Can you explain it? | قادر به توضیح آن هستی؟
    // ═══════════════════════════════════════════════════════════════
    private fun unit9() = base(
        9, "Can you explain it?", "قادر به توضیح آن هستی؟",
        listOf(
            "Explain everyday phenomena",
            "Describe how things work",
            "Use sequencing and explanation language",
            "Discuss mysteries and explanations"
        ),
        listOf(
            v("explain", "توضیح دادن", "Can you explain this?", "می‌توانی این را توضیح دهی؟", "verb"),
            v("explanation", "توضیح", "That's a good explanation.", "توضیح خوبی است."),
            v("phenomenon", "پدیده", "It's a natural phenomenon.", "پدیده طبیعی است."),
            v("mystery", "راز", "It's a mystery to me.", "برای من راز است."),
            v("solve", "حل کردن", "We solved the puzzle.", "معما را حل کردیم.", "verb"),
            v("cause", "علت", "What's the cause?", "علت چیست؟"),
            v("effect", "اثر", "The effect was immediate.", "اثر فوری بود."),
            v("process", "فرآیند", "It's a complex process.", "فرآیند پیچیده‌ای است."),
            v("method", "روش", "What's the best method?", "بهترین روش چیست؟"),
            v("step", "مرحله", "Follow these steps.", "این مراحل را دنبال کن."),
            v("result", "نتیجه", "The result was surprising.", "نتیجه غافلگیرکننده بود."),
            v("discover", "کشف کردن", "Scientists discovered a new planet.", "دانشمندان سیاره جدیدی کشف کردند.", "verb"),
            v("evidence", "شواهد", "There's no evidence.", "شواهدی وجود ندارد."),
            v("theory", "نظریه", "It's just a theory.", "فقط یک نظریه است."),
            v("conclusion", "نتیجه‌گیری", "What's your conclusion?", "نتیجه‌گیری‌ات چیست؟")
        ),
        listOf(
            GrammarSection("Sequencing words", "first, next, then, after that, finally. For explanations and processes."),
            GrammarSection("Passive voice for processes", "The mixture is heated. The data is analyzed. The results are published."),
            GrammarSection("Cause and effect", "because, so, therefore, as a result, due to."),
            GrammarSection("Explaining phenomena", "This happens because... / The reason is... / It's caused by..." )
        ),
        listOf(
            d("A", "Hey, Maria! Can you explain something to me?", "هی، ماریا! می‌توانی چیزی را برایم توضیح دهی؟"),
            d("B", "Sure. What's on your mind?", "حتماً. چه چیزی در ذهنت است؟"),
            d("A", "Why do we yawn? I've always wondered.", "چرا خمیازه می‌کشیم؟ همیشه تعجب کرده‌ام."),
            d("B", "That's a good question. Scientists aren't sure.", "سؤال خوبی است. دانشمندان مطمئن نیستند."),
            d("A", "Really? I thought it was about oxygen.", "واقعاً؟ فکر می‌کردم درباره اکسیژن است."),
            d("B", "That was the old theory. Now there are new ones.", "نظریه قدیمی بود. حالا نظریه‌های جدیدی هست."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "One theory is that it cools the brain. Another is social.", "یک نظریه این است که مغز را خنک می‌کند. دیگری اجتماعی است."),
            d("A", "Social? How?", "اجتماعی؟ چطور؟"),
            d("B", "Yawning might be a form of communication. It shows empathy.", "خمیازه ممکن است نوعی ارتباط باشد. همدلی نشان می‌دهد."),
            d("A", "That's fascinating. So it's contagious for a reason?", "جالب است. پس مسری بودنش دلیلی دارد؟"),
            d("B", "Yes. It spreads through groups. Like a social signal.", "بله. در گروه‌ها پخش می‌شود. مثل یک علامت اجتماعی."),
            d("A", "I never thought about it that way.", "هرگز به آن شکل فکر نکرده بودم."),
            d("B", "Science is full of surprises. What else do you wonder about?", "علم پر از شگفتی است. دیگر درباره چه چیزی تعجب می‌کنی؟"),
            d("A", "Why do we dream?", "چرا رویا می‌بینیم؟"),
            d("B", "Another mystery! There are many theories.", "راز دیگری! نظریه‌های زیادی هست."),
            d("A", "What's the most accepted one?", "پذیرفته‌شده‌ترین کدام است؟"),
            d("B", "That dreams help us process emotions and memories.", "اینکه رویاها به ما کمک می‌کنند احساسات و خاطرات را پردازش کنیم."),
            d("A", "So it's like therapy for the brain?", "پس مثل درمان برای مغز است؟"),
            d("B", "Exactly! That's a great way to put it.", "دقیقاً! روش عالی‌ای برای بیانش است."),
            d("A", "What about déjà vu? That's a weird one.", "دژا وو چطور؟ آن یکی عجیب است."),
            d("B", "Ah, that's a fascinating phenomenon.", "آه، آن پدیده جالبی است."),
            d("A", "What causes it?", "علتش چیست؟"),
            d("B", "One explanation is a timing mismatch in the brain.", "یک توضیح عدم تطابق زمانی در مغز است."),
            d("A", "What does that mean?", "یعنی چه؟"),
            d("B", "The brain processes something as familiar before it's actually seen.", "مغز چیزی را قبل از دیده شدن واقعی، آشنا پردازش می‌کند."),
            d("A", "So it's like a glitch?", "پس مثل یک نقص است؟"),
            d("B", "Sort of. A temporary misunderstanding in the memory system.", "تا حدی. یک سوءتفاهم موقت در سیستم حافظه."),
            d("A", "That makes sense. The brain is so complex.", "منطقی است. مغز خیلی پیچیده است."),
            d("B", "It is. We've only discovered a small part.", "هست. فقط بخش کوچکی را کشف کرده‌ایم."),
            d("A", "What's the most mysterious thing to you?", "مهم‌ترین چیز مرموز برای تو چیست؟"),
            d("B", "Consciousness. How we experience reality.", "آگاهی. چطور واقعیت را تجربه می‌کنیم."),
            d("A", "That's a big one. No one can fully explain it.", "بزرگی است. هیچ‌کس نمی‌تواند کاملاً توضیحش دهد."),
            d("B", "Exactly. It's the hard problem of consciousness.", "دقیقاً. مسئله سخت آگاهی است."),
            d("A", "Can you explain how the scientific method works?", "می‌توانی توضیح دهی روش علمی چطور کار می‌کند؟"),
            d("B", "Sure. First, you ask a question. Then you form a hypothesis.", "حتماً. اول سؤال می‌پرسی. بعد فرضیه می‌سازی."),
            d("A", "What's next?", "بعدش چیست؟"),
            d("B", "Next, you design an experiment to test it.", "بعد، آزمایشی طراحی می‌کنی تا تستش کنی."),
            d("A", "And then?", "و بعد؟"),
            d("B", "Then you collect data and analyze the results.", "بعد داده جمع می‌کنی و نتایج را تحلیل می‌کنی."),
            d("A", "Finally?", "در نهایت؟"),
            d("B", "Finally, you draw a conclusion. The theory is supported or rejected.", "در نهایت نتیجه‌گیری می‌کنی. نظریه تأیید یا رد می‌شود."),
            d("A", "That's a clear explanation. Thanks!", "توضیح واضحی است. ممنون!"),
            d("B", "You're welcome. What's a mystery you'd like solved?", "خواهش می‌کنم. چه رازی را دوست داری حل شود؟"),
            d("A", "Whether there's life on other planets.", "اینکه آیا حیات در سیارات دیگر هست."),
            d("B", "That's a big one. Scientists are searching.", "بزرگی است. دانشمندان در حال جستجو هستند."),
            d("A", "I hope they find something in our lifetime.", "امیدوارم در عمرمان چیزی پیدا کنند."),
            d("B", "That would change everything.", "همه چیز را تغییر می‌داد."),
            d("A", "It really would. Well, I should go. This was fun.", "واقعاً می‌کرد. خب، باید بروم. سرگرم‌کننده بود."),
            d("B", "It was. Let's discuss more mysteries sometime!", "بود. بیایید یک وقت درباره رازهای بیشتری صحبت کنیم!"),
            d("A", "Definitely. See you soon!", "قطعاً. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What was the old theory about yawning?", listOf("brain cooling", "oxygen", "social", "empathy"), 1),
            q("What is déjà vu explained as?", listOf("a dream", "a timing mismatch", "a memory", "a glitch"), 1),
            q("What's the hard problem of consciousness?", listOf("memory", "how we experience reality", "sleep", "dreams"), 1),
            q("What's the first step of the scientific method?", listOf("experiment", "hypothesis", "question", "conclusion"), 2),
            q("First, you ask a question. ___, you form a hypothesis.", listOf("Then", "Finally", "After", "Before"), 0),
            q("The mixture ___ heated.", listOf("is", "are", "was", "be"), 0),
            q("The data ___ analyzed.", listOf("is", "are", "was", "be"), 1),
            q("This happens ___ of gravity.", listOf("because", "so", "due", "therefore"), 2)
        ),
        idioms = listOf(
            IdiomExpression("On your mind", "در ذهنت", "What's on your mind?", "چه چیزی در ذهنت است؟"),
            IdiomExpression("Put it", "بیان کردن", "That's a great way to put it.", "روش عالی‌ای برای بیانش است."),
            IdiomExpression("Sort of", "تا حدی", "Sort of.", "تا حدی."),
            IdiomExpression("Draw a conclusion", "نتیجه‌گیری کردن", "Finally, you draw a conclusion.", "در نهایت نتیجه‌گیری می‌کنی.")
        ),
        phrasal = listOf(
            PhrasalVerb("figure out", "فهمیدن", "understand", "Can you figure it out?", "می‌توانی بفهمی‌اش؟", "No"),
            PhrasalVerb("look up", "جستجو کردن", "search", "Look it up online.", "آنلاین جستجویش کن.", "No"),
            PhrasalVerb("point out", "اشاره کردن", "indicate", "She pointed out the error.", "او به خطا اشاره کرد.", "No"),
            PhrasalVerb("work out", "حل شدن", "resolve", "The problem worked out.", "مشکل حل شد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Sequencing stress", "FIRST, you ask. THEN, you form."),
            PronunciationTip("Cause and effect", "beCAUSE, THEREfore, AS a reSULT."),
            PronunciationTip("Explanation vocabulary", "exPLANation, pheNOmenon, MYStery, EviDENCE.")
        ),
        culture = listOf(
            CulturalNote("Scientific method", "The scientific method is a systematic way of understanding the world."),
            CulturalNote("Mysteries", "Many everyday phenomena remain unexplained by science."),
            CulturalNote("Consciousness", "The nature of consciousness is one of philosophy's biggest questions.")
        ),
        mistakes = listOf(
            CommonMistake("The mixture is heat.", "The mixture is heated.", "Use past participle in passive."),
            CommonMistake("The data is analyzed.", "The data is/are analyzed.", "Both singular and plural are acceptable for 'data'."),
            CommonMistake("It happens because of it's cold.", "It happens because it's cold.", "Use 'because' + clause."),
            CommonMistake("First, then, finally, after that.", "First, next, then, finally.", "Use correct sequencing order.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What theories about yawning are mentioned?", "Brain cooling and social communication/empathy."),
            ComprehensionQuestion("How is déjà vu explained?", "A timing mismatch in the brain's memory system."),
            ComprehensionQuestion("What are the steps of the scientific method?", "Ask a question, form a hypothesis, design an experiment, collect data, draw a conclusion.")
        ),
        speaking = listOf(
            SpeakingTask("Explain an everyday phenomenon.", "یک پدیده روزمره را توضیح بده.", "First... / Then... / This happens because..." ),
            SpeakingTask("Describe how something works.", "نحوه کار چیزی را توصیف کن.", "It's used to... / The process involves... / The result is..." ),
            SpeakingTask("Discuss a mystery you'd like solved.", "درباره رازی که دوست داری حل شود صحبت کن.", "I wonder... / It's a mystery... / Scientists don't know..." )
        ),
        writing = listOf(
            WritingTask("Explain a phenomenon or process in detail.", "یک پدیده یا فرآیند را با جزئیات توضیح بده.", 180, "Use sequencing words and passive voice.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 10 — Perspectives | دیدگاه‌ها
    // ═══════════════════════════════════════════════════════════════
    private fun unit10() = base(
        10, "Perspectives", "دیدگاه‌ها",
        listOf(
            "Discuss different points of view",
            "Use reported speech",
            "Express opinions and agreement/disagreement",
            "Discuss controversial topics politely"
        ),
        listOf(
            v("perspective", "دیدگاه", "From my perspective...", "از دیدگاه من..."),
            v("opinion", "نظر", "What's your opinion?", "نظرت چیست؟"),
            v("agree", "موافق بودن", "I agree with you.", "با تو موافقم.", "verb"),
            v("disagree", "مخالف بودن", "I respectfully disagree.", "با احترام مخالفم.", "verb"),
            v("point of view", "دیدگاه", "That's a valid point of view.", "دیدگاه معتبری است."),
            v("argument", "استدلال", "That's a strong argument.", "استدلال قوی‌ای است."),
            v("evidence", "شواهد", "Where's the evidence?", "شواهد کجاست؟"),
            v("claim", "ادعا", "That's a bold claim.", "ادعای جسورانه‌ای است."),
            v("assume", "فرض کردن", "Don't assume things.", "چیزها را فرض نکن.", "verb"),
            v("debate", "بحث", "It's a heated debate.", "بحث داغی است."),
            v("issue", "موضوع", "It's a complex issue.", "موضوع پیچیده‌ای است."),
            v("controversial", "جنجالی", "It's a controversial topic.", "موضوع جنجالی‌ای است.", "adjective"),
            v("respect", "احترام گذاشتن", "I respect your opinion.", "نظرت را محترم می‌شمارم.", "verb"),
            v("understand", "درک کردن", "I understand your point.", "نکته‌ات را درک می‌کنم.", "verb"),
            v("believe", "باور داشتن", "I believe that...", "باور دارم که...", "verb")
        ),
        listOf(
            GrammarSection("Reported speech: statements", "He said (that) he was tired. She told me she liked the idea."),
            GrammarSection("Reported speech: questions", "He asked where I lived. She asked if I agreed."),
            GrammarSection("Tense changes in reported speech", "Present → past, will → would, can → could, past → past perfect."),
            GrammarSection("Expressing opinions", "In my opinion... / I believe... / From my perspective... / I see your point, but...")
        ),
        listOf(
            d("A", "Hey, Maria! I read an interesting article about remote work.", "هی، ماریا! مقاله جالبی درباره دورکاری خواندم."),
            d("B", "Oh? What did it say?", "اوه؟ چه گفت؟"),
            d("A", "It said remote work is better for productivity.", "گفت دورکاری برای بهره‌وری بهتر است."),
            d("B", "I'm not sure I agree. It depends on the person.", "مطمئن نیستم موافق باشم. به فرد بستگی دارد."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "Some people focus better at home. Others get distracted.", "برخی در خانه بهتر تمرکز می‌کنند. دیگران حواسشان پرت می‌شود."),
            d("A", "That's a fair point. I hadn't considered that.", "نکته منصفانه‌ای است. در نظر نگرفته بودم."),
            d("B", "The article probably generalized too much.", "مقاله احتمالاً زیاد تعمیم داده بود."),
            d("A", "You're right. It said everyone is more productive at home.", "حق داری. گفت همه در خانه پربارترند."),
            d("B", "That's a bold claim. It can't be true for everyone.", "ادعای جسورانه‌ای است. نمی‌تواند برای همه درست باشد."),
            d("A", "I agree. What's your perspective on remote work?", "موافقم. دیدگاهت درباره دورکاری چیست؟"),
            d("B", "I think it's great for some jobs. Not all.", "فکر می‌کنم برای برخی شغل‌ها عالی است. نه همه."),
            d("A", "Like which ones?", "مثل کدام‌ها؟"),
            d("B", "Tech, writing, design. Jobs that don't need physical presence.", "فناوری، نوشتن، طراحی. شغل‌هایی که حضور فیزیکی لازم ندارند."),
            d("A", "What about jobs that do need it?", "شغل‌هایی که نیاز دارند چطور؟"),
            d("B", "Doctors, teachers, factory workers. They can't work remotely.", "پزشکان، معلمان، کارگران کارخانه. نمی‌توانند دورکار باشند."),
            d("A", "That's true. The article didn't mention that.", "درست است. مقاله به آن اشاره نکرده بود."),
            d("B", "Many articles don't. They focus on one perspective.", "خیلی مقالات نمی‌کنند. روی یک دیدگاه تمرکز می‌کنند."),
            d("A", "So we should read multiple sources.", "پس باید چندین منبع بخوانیم."),
            d("B", "Exactly. That's how you get a balanced view.", "دقیقاً. اینطور دیدگاه متوازنی می‌گیری."),
            d("A", "Have you ever changed your opinion about something?", "هیچ‌وقت نظرت را درباره چیزی تغییر داده‌ای؟"),
            d("B", "Yes, several times. That's part of learning.", "بله، چندین بار. بخشی از یادگیری است."),
            d("A", "What changed your mind?", "چه چیزی نظرت را تغییر داد؟"),
            d("B", "Reading different perspectives and talking to people.", "خواندن دیدگاه‌های مختلف و صحبت با مردم."),
            d("A", "What's something you used to believe but don't anymore?", "چیزی که قبلاً باور داشتی ولی الان نداری چیست؟"),
            d("B", "That success means having a lot of money.", "اینکه موفقیت یعنی پول زیاد داشتن."),
            d("A", "What do you believe now?", "الان چه باور داری؟"),
            d("B", "That success is about happiness and purpose.", "اینکه موفقیت درباره شادی و هدف است."),
            d("A", "That's a meaningful perspective.", "دیدگاه معنی‌داری است."),
            d("B", "It took time to get here. What about you?", "رسیدن به اینجا زمان برد. تو چطور؟"),
            d("A", "I used to think you had to be perfect to succeed.", "قبلاً فکر می‌کردم برای موفقیت باید کامل باشی."),
            d("B", "And now?", "و حالا؟"),
            d("A", "Now I know mistakes are part of the process.", "حالا می‌دانم اشتباهات بخشی از فرآیند هستند."),
            d("B", "That's a healthy perspective. Growth mindset.", "دیدگاه سالمی است. طرز فکر رشد."),
            d("A", "Exactly. How do you handle disagreements?", "دقیقاً. با اختلاف نظرها چطور برخورد می‌کنی؟"),
            d("B", "I try to listen first. Understand their view.", "سعی می‌کنم اول گوش دهم. دیدگاهشان را بفهمم."),
            d("A", "That's respectful. Do you ever get angry?", "محترمانه است. هیچ‌وقت عصبانی می‌شوی؟"),
            d("B", "Sometimes. But I try to stay calm.", "گاهی. ولی سعی می‌کنم آرام بمانم."),
            d("A", "It's hard when someone attacks your beliefs.", "وقتی کسی به باورهایت حمله می‌کند سخت است."),
            d("B", "It is. But anger doesn't help.", "هست. ولی عصبانیت کمک نمی‌کند."),
            d("A", "True. What's the best way to discuss controversial topics?", "درست. بهترین راه بحث درباره موضوعات جنجالی چیست؟"),
            d("B", "With respect. And an open mind.", "با احترام. و ذهن باز."),
            d("A", "And a willingness to change your mind.", "و تمایل به تغییر نظر."),
            d("B", "Exactly. That's intellectual humility.", "دقیقاً. این فروتنی فکری است."),
            d("A", "Well said. What's a topic you find hard to discuss?", "خوب گفتی. موضوعی که بحث درباره‌اش برایت سخت است چیست؟"),
            d("B", "Politics. It's so polarized now.", "سیاست. الان خیلی دوقطبی است."),
            d("A", "I agree. People don't listen to each other.", "موافقم. مردم به هم گوش نمی‌دهند."),
            d("B", "They just wait to speak. It's not a real conversation.", "فقط منتظرند صحبت کنند. مکالمه واقعی نیست."),
            d("A", "What can we do about it?", "چه کار می‌توانیم بکنیم؟"),
            d("B", "Practice listening. Ask questions. Seek to understand.", "گوش دادن را تمرین کنیم. سؤال بپرسیم. به دنبال درک باشیم."),
            d("A", "That's good advice. I'll try to do that.", "توصیه خوبی است. سعی می‌کنم این کار را بکنم."),
            d("B", "Me too. It starts with each of us.", "من هم. از هر کدام ما شروع می‌شود."),
            d("A", "Well, I should go. This was a great conversation.", "خب، باید بروم. مکالمه عالی‌ای بود."),
            d("B", "It was. Let's continue it sometime.", "بود. بیایید یک وقت ادامه‌اش دهیم."),
            d("A", "I'd like that. See you soon!", "دوست دارم. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did the article claim?", listOf("remote work is bad", "remote work is better for productivity", "remote work is impossible", "remote work is easy"), 1),
            q("What's Maria's perspective?", listOf("remote work is always good", "it depends on the person", "remote work is bad", "all jobs can be remote"), 1),
            q("What did Maria use to believe about success?", listOf("it's about happiness", "it's about money", "it's about friends", "it's about travel"), 1),
            q("What topic does Maria find hard to discuss?", listOf("work", "politics", "family", "money"), 1),
            q("He said he ___ tired.", listOf("is", "was", "be", "being"), 1),
            q("She told me she ___ the idea.", listOf("likes", "liked", "like", "liking"), 1),
            q("He asked where I ___.", listOf("live", "lived", "do live", "living"), 1),
            q("She asked if I ___.", listOf("agree", "agreed", "agreeing", "agrees"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Fair point", "نکته منصفانه", "That's a fair point.", "نکته منصفانه‌ای است."),
            IdiomExpression("Bold claim", "ادعای جسورانه", "That's a bold claim.", "ادعای جسورانه‌ای است."),
            IdiomExpression("Change your mind", "نظرت را تغییر دادن", "What changed your mind?", "چه چیزی نظرت را تغییر داد؟"),
            IdiomExpression("Intellectual humility", "فروتنی فکری", "That's intellectual humility.", "این فروتنی فکری است.")
        ),
        phrasal = listOf(
            PhrasalVerb("point out", "اشاره کردن", "indicate", "She pointed out the error.", "او به خطا اشاره کرد.", "No"),
            PhrasalVerb("bring up", "مطرح کردن", "mention", "He brought up an interesting topic.", "او موضوع جالبی مطرح کرد.", "No"),
            PhrasalVerb("back up", "پشتیبانی کردن", "support", "Back up your argument with evidence.", "استدلالت را با شواهد پشتیبانی کن.", "No"),
            PhrasalVerb("agree with", "موافق بودن", "have same opinion", "I agree with you.", "با تو موافقم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Reported speech stress", "He SAID he was TIRED."),
            PronunciationTip("Opinion intonation", "In my OPI nion... / I BE LIEVE..."),
            PronunciationTip("Debate vocabulary", "PERspective, OPI nion, ARgument, CONtrover sial.")
        ),
        culture = listOf(
            CulturalNote("Remote work", "Remote work has grown significantly and sparked debate about productivity."),
            CulturalNote("Perspectives", "Reading multiple sources helps develop a balanced view."),
            CulturalNote("Political polarization", "Political discussions can be challenging due to polarization.")
        ),
        mistakes = listOf(
            CommonMistake("He said me he was tired.", "He told me he was tired.", "Use 'tell' with an object."),
            CommonMistake("She said she will come.", "She said she would come.", "Shift 'will' to 'would' in reported speech."),
            CommonMistake("He asked where did I live.", "He asked where I lived.", "Use statement word order in reported questions."),
            CommonMistake("I don't agree with you about that.", "I don't agree with you on that.", "Use 'agree on' for topics.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's the article's claim?", "Remote work is better for productivity — a generalization."),
            ComprehensionQuestion("What's Maria's balanced view?", "It depends on the person and the job type."),
            ComprehensionQuestion("What's their advice for discussions?", "Listen first, ask questions, seek to understand.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a controversial topic respectfully.", "درباره یک موضوع جنجالی با احترام بحث کن.", "From my perspective... / I see your point, but... / Let's agree to disagree."),
            SpeakingTask("Report a conversation.", "یک مکالمه را گزارش کن.", "He said... / She told me... / He asked..." ),
            SpeakingTask("Talk about how your opinions have changed.", "درباره اینکه نظراتت چطور تغییر کرده صحبت کن.", "I used to think... / Now I believe... / What changed my mind was..." )
        ),
        writing = listOf(
            WritingTask("Write about a topic where you changed your perspective.", "درباره موضوعی که دیدگاهت را تغییر دادی بنویس.", 180, "Use reported speech.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 11 — The real world | جهان واقعی
    // ═══════════════════════════════════════════════════════════════
    private fun unit11() = base(
        11, "The real world", "جهان واقعی",
        listOf(
            "Discuss real-world issues and challenges",
            "Use conditional structures",
            "Talk about social and global problems",
            "Discuss solutions and responsibilities"
        ),
        listOf(
            v("real world", "جهان واقعی", "The real world is complex.", "جهان واقعی پیچیده است."),
            v("society", "جامعه", "Society is changing fast.", "جامعه سریع تغییر می‌کند."),
            v("poverty", "فقر", "Poverty is a global issue.", "فقر یک مشکل جهانی است."),
            v("inequality", "نابرابری", "Inequality affects everyone.", "نابرابری بر همه تأثیر می‌گذارد."),
            v("homelessness", "بی‌خانمانی", "Homelessness is rising in cities.", "بی‌خانمانی در شهرها در حال افزایش است."),
            v("education", "آموزش", "Education is key to opportunity.", "آموزش کلید فرصت است."),
            v("healthcare", "مراقبت بهداشتی", "Healthcare should be accessible.", "مراقبت بهداشتی باید قابل دسترس باشد."),
            v("unemployment", "بیکاری", "Unemployment is a serious problem.", "بیکاری مشکل جدی است."),
            v("volunteer", "داوطلب", "She volunteers at a shelter.", "او در یک پناهگاه داوطلب است.", "verb"),
            v("donate", "اهدا کردن", "I donate to charity.", "به خیریه اهدا می‌کنم.", "verb"),
            v("raise awareness", "آگاهی ایجاد کردن", "We need to raise awareness.", "باید آگاهی ایجاد کنیم.", "verb"),
            v("make a difference", "تفاوت ایجاد کردن", "You can make a difference.", "می‌توانی تفاوت ایجاد کنی.", "verb"),
            v("responsible", "مسئول", "We're all responsible.", "همه مسئولیم.", "adjective"),
            v("solution", "راه‌حل", "What's the solution?", "راه‌حل چیست؟"),
            v("community", "جامعه", "Community support is vital.", "حمایت جامعه حیاتی است.")
        ),
        listOf(
            GrammarSection("First conditional", "If + present, will + base. Real possibilities. If we donate, we will help."),
            GrammarSection("Second conditional", "If + past, would + base. Hypothetical. If I had more money, I would give more."),
            GrammarSection("Third conditional", "If + past perfect, would have + past participle. Past regrets. If I had known, I would have helped."),
            GrammarSection("Mixed conditionals", "Combining time frames. If I had studied, I would be a doctor now.")
        ),
        listOf(
            d("A", "Hey, Maria! I've been thinking about real-world problems.", "هی، ماریا! به مشکلات جهان واقعی فکر کرده‌ام."),
            d("B", "Like what?", "مثل چی؟"),
            d("A", "Poverty, inequality, homelessness. They're everywhere.", "فقر، نابرابری، بی‌خانمانی. همه جا هستند."),
            d("B", "It can feel overwhelming. What can we do?", "می‌تواند طاقت‌فرسا باشد. چه کار می‌توانیم بکنیم؟"),
            d("A", "If we all did a little, it would add up.", "اگر همه کمی انجام می‌دادیم، جمع می‌شد."),
            d("B", "That's true. What do you do?", "درست است. تو چه کار می‌کنی؟"),
            d("A", "I donate to a food bank every month.", "هر ماه به یک بانک غذا اهدا می‌کنم."),
            d("B", "That's generous. I volunteer at a shelter.", "سخاوتمندانه است. من در یک پناهگاه داوطلبم."),
            d("A", "What do you do there?", "آنجا چه کار می‌کنی؟"),
            d("B", "I serve meals and talk to people. It's rewarding.", "غذا سرو می‌کنم و با مردم صحبت می‌کنم. ارزشمند است."),
            d("A", "That must be eye-opening.", "باید چشم‌بازکننده باشد."),
            d("B", "It is. You meet people from all walks of life.", "هست. با افراد از همه قشرها ملاقات می‌کنی."),
            d("A", "What's the biggest challenge they face?", "بزرگ‌ترین چالشی که با آن روبرو هستند چیست؟"),
            d("B", "Lack of affordable housing. And mental health issues.", "کمبود مسکن مقرون‌به‌صرفه. و مسائل سلامت روان."),
            d("A", "That's tough. Are there solutions?", "سخت است. راه‌حلی هست؟"),
            d("B", "Yes, but they need funding and political will.", "بله، ولی به بودجه و اراده سیاسی نیاز دارند."),
            d("A", "What if the government invested more?", "اگر دولت بیشتر سرمایه‌گذاری می‌کرد چطور؟"),
            d("B", "It would help a lot. But it's complicated.", "خیلی کمک می‌کرد. ولی پیچیده است."),
            d("A", "Everything about real-world problems is complicated.", "همه چیز درباره مشکلات جهان واقعی پیچیده است."),
            d("B", "True. But that doesn't mean we shouldn't try.", "درست. ولی معنایش این نیست که نباید تلاش کنیم."),
            d("A", "I agree. What else can individuals do?", "موافقم. افراد دیگر چه کار می‌توانند بکنند؟"),
            d("B", "Raise awareness. Talk about these issues.", "آگاهی ایجاد کنند. درباره این مسائل صحبت کنند."),
            d("A", "Social media can help with that.", "شبکه‌های اجتماعی می‌توانند کمک کنند."),
            d("B", "It can. But it can also spread misinformation.", "می‌توانند. ولی می‌توانند اطلاعات نادرست هم پخش کنند."),
            d("A", "So we need to be careful what we share.", "پس باید مراقب باشیم چه چیزی به اشتراک می‌گذاریم."),
            d("B", "Exactly. Verify before you amplify.", "دقیقاً. قبل از تقویت، تأیید کن."),
            d("A", "That's a good rule. What about education?", "قانون خوبی است. آموزش چطور؟"),
            d("B", "Education is the key to breaking the cycle of poverty.", "آموزش کلید شکستن چرخه فقر است."),
            d("A", "If everyone had access to good education...", "اگر همه به آموزش خوب دسترسی داشتند..."),
            d("B", "The world would be very different.", "دنیا خیلی متفاوت می‌بود."),
            d("A", "What about healthcare?", "مراقبت بهداشتی چطور؟"),
            d("B", "Access to healthcare should be a basic right.", "دسترسی به مراقبت بهداشتی باید یک حق اساسی باشد."),
            d("A", "Many countries are struggling with that.", "بسیاری از کشورها با آن دست و پنجه نرم می‌کنند."),
            d("B", "Yes. It's a complex issue with no easy answers.", "بله. موضوع پیچیده‌ای است بدون پاسخ‌های آسان."),
            d("A", "What gives you hope?", "چه چیزی به تو امید می‌دهد؟"),
            d("B", "Young people. They're more aware and active.", "جوانان. آگاه‌تر و فعال‌ترند."),
            d("A", "That's true. I see it in my community.", "درست است. در جامعه‌ام می‌بینم."),
            d("B", "What are they doing?", "چه کار می‌کنند؟"),
            d("A", "Organizing clean-ups, food drives, tutoring programs.", "سازماندهی پاکسازی‌ها، جمع‌آوری غذا، برنامه‌های تدریس."),
            d("B", "That's inspiring. Change starts locally.", "الهام‌بخش است. تغییر از محلی شروع می‌شود."),
            d("A", "Exactly. Think globally, act locally.", "دقیقاً. جهانی فکر کن، محلی عمل کن."),
            d("B", "What's one thing you wish more people understood?", "یک چیزی که آرزو می‌کنی افراد بیشتری می‌فهمیدند چیست؟"),
            d("A", "That small actions matter. No effort is wasted.", "اینکه اقدامات کوچک مهم هستند. هیچ تلاشی هدر نمی‌رود."),
            d("B", "That's a powerful message.", "پیام قدرتمندی است."),
            d("A", "What about you?", "تو چطور؟"),
            d("B", "I wish people understood that we're all connected.", "آرزو می‌کنم مردم می‌فهمیدند همه به هم متصل هستیم."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "That helping others helps us too. We're one community.", "اینکه کمک به دیگران به ما هم کمک می‌کند. یک جامعه‌ایم."),
            d("A", "That's beautiful. And true.", "زیباست. و درست."),
            d("B", "If we truly believed that, the world would change.", "اگر واقعاً این را باور می‌کردیم، دنیا تغییر می‌کرد."),
            d("A", "What's one thing you'd change if you could?", "یک چیزی که اگر می‌توانستی تغییر می‌دادی چیست؟"),
            d("B", "I'd make education free and accessible everywhere.", "آموزش را همه جا رایگان و قابل دسترس می‌کردم."),
            d("A", "That would transform everything.", "همه چیز را متحول می‌کرد."),
            d("B", "It would. What about you?", "می‌کرد. تو چطور؟"),
            d("A", "I'd ensure everyone has access to clean water.", "اطمینان می‌دادم همه به آب پاک دسترسی دارند."),
            d("B", "That's a basic human right.", "حق اساسی بشری است."),
            d("A", "It is. And yet millions don't have it.", "هست. و با این حال میلیون‌ها ندارند."),
            d("B", "We have a long way to go.", "راه طولانی‌ای در پیش داریم."),
            d("A", "We do. But every step counts.", "داریم. ولی هر قدم مهم است."),
            d("B", "Well said. I should go now.", "خوب گفتی. خب، باید بروم."),
            d("A", "Thanks for this conversation. It was important.", "ممنون برای این مکالمه. مهم بود."),
            d("B", "Thank you. Let's keep making a difference.", "ممنون. بیایید تفاوت ایجاد کردن را ادامه دهیم."),
            d("A", "Deal. See you soon!", "قبول. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What does Maria volunteer at?", listOf("food bank", "shelter", "school", "hospital"), 1),
            q("What's the biggest challenge for people at the shelter?", listOf("food", "housing and mental health", "jobs", "education"), 1),
            q("What gives Maria hope?", listOf("government", "young people", "technology", "money"), 1),
            q("What would Ali change?", listOf("education", "clean water access", "housing", "healthcare"), 1),
            q("If we donate, we ___ help.", listOf("will", "would", "did", "are"), 0),
            q("If I had more money, I ___ give more.", listOf("will", "would", "did", "am"), 1),
            q("If I had known, I ___ helped.", listOf("would have", "will have", "did", "am"), 0),
            q("If I had studied, I ___ a doctor now.", listOf("would be", "will be", "am", "was"), 0)
        ),
        idioms = listOf(
            IdiomExpression("All walks of life", "همه قشرها", "People from all walks of life.", "افراد از همه قشرها."),
            IdiomExpression("Eye-opening", "چشم‌بازکننده", "It was eye-opening.", "چشم‌بازکننده بود."),
            IdiomExpression("Break the cycle", "شکستن چرخه", "Break the cycle of poverty.", "چرخه فقر را بشکن."),
            IdiomExpression("Every step counts", "هر قدم مهم است", "Every step counts.", "هر قدم مهم است.")
        ),
        phrasal = listOf(
            PhrasalVerb("give back", "پس دادن به جامعه", "contribute", "I want to give back.", "می‌خواهم به جامعه پس بدهم.", "No"),
            PhrasalVerb("reach out", "تماس گرفتن", "contact", "Reach out to those in need.", "به نیازمندان تماس بگیر.", "No"),
            PhrasalVerb("stand up for", "دفاع کردن از", "defend", "Stand up for what's right.", "از آنچه درست است دفاع کن.", "No"),
            PhrasalVerb("chip in", "کمک کردن", "contribute", "Everyone can chip in.", "همه می‌توانند کمک کنند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Conditional stress", "If we DO nate, we will HELP."),
            PronunciationTip("Third conditional", "If I had KNOWN, I would have HELPED."),
            PronunciationTip("Real world vocabulary", "PO verty, ineQUALity, HOMElessness, unemPLOYment.")
        ),
        culture = listOf(
            CulturalNote("Social issues", "Poverty, inequality, and homelessness are global challenges."),
            CulturalNote("Volunteering", "Volunteering is a common way to contribute to communities."),
            CulturalNote("Think globally, act locally", "A motto encouraging local action for global impact.")
        ),
        mistakes = listOf(
            CommonMistake("If we will donate, we will help.", "If we donate, we will help.", "Use present simple after 'if' in first conditional."),
            CommonMistake("If I would have money, I would give.", "If I had money, I would give.", "Use past simple after 'if' in second conditional."),
            CommonMistake("If I had studied, I will be a doctor.", "If I had studied, I would be a doctor.", "Use 'would' in the result clause."),
            CommonMistake("I donate to charity every month.", "I donate to a charity every month.", "Use 'a' before singular countable nouns.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What real-world problems are discussed?", "Poverty, inequality, homelessness, education, healthcare."),
            ComprehensionQuestion("What do Ali and Maria do?", "Ali donates to a food bank; Maria volunteers at a shelter."),
            ComprehensionQuestion("What gives them hope?", "Young people organizing community actions.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a real-world problem and its solutions.", "درباره یک مشکل جهان واقعی و راه‌حل‌هایش صحبت کن.", "The problem is... / One solution is... / If we... / It would..." ),
            SpeakingTask("Talk about volunteering or donating.", "درباره داوطلبی یا اهدا صحبت کن.", "I volunteer... / I donate... / It's rewarding because..." ),
            SpeakingTask("Discuss what you would change in the world.", "درباره چیزی که در دنیا تغییر می‌دادی صحبت کن.", "If I could... / I would... / The world would..." )
        ),
        writing = listOf(
            WritingTask("Write about a real-world issue and how individuals can help.", "درباره یک مشکل جهان واقعی و اینکه افراد چطور می‌توانند کمک کنند بنویس.", 180, "Use conditionals.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 12 — Finding solutions | پیدا کردن راه حل
    // ═══════════════════════════════════════════════════════════════
    private fun unit12() = base(
        12, "Finding solutions", "پیدا کردن راه حل",
        listOf(
            "Discuss problems and solutions",
            "Use polite requests and offers",
            "Negotiate and compromise",
            "Propose solutions to common problems"
        ),
        listOf(
            v("solution", "راه‌حل", "Let's find a solution.", "بیایید راه‌حلی پیدا کنیم."),
            v("problem", "مشکل", "What's the problem?", "مشکل چیست؟"),
            v("solve", "حل کردن", "We need to solve this.", "باید این را حل کنیم.", "verb"),
            v("propose", "پیشنهاد کردن", "I propose a different approach.", "رویکرد متفاوتی پیشنهاد می‌کنم.", "verb"),
            v("suggest", "پیشنهاد کردن", "I suggest we take a break.", "پیشنهاد می‌کنم استراحت کنیم.", "verb"),
            v("compromise", "سازش کردن", "We need to compromise.", "باید سازش کنیم.", "verb"),
            v("negotiate", "مذاکره کردن", "Let's negotiate a deal.", "بیایید بر سر معامله‌ای مذاکره کنیم.", "verb"),
            v("request", "درخواست", "I have a request.", "یک درخواست دارم."),
            v("offer", "پیشنهاد", "That's a generous offer.", "پیشنهاد سخاوتمندانه‌ای است."),
            v("apologize", "عذرخواهی کردن", "I apologize for the delay.", "برای تأخیر عذرخواهی می‌کنم.", "verb"),
            v("explanation", "توضیح", "Can you give an explanation?", "می‌توانی توضیحی بدهی؟"),
            v("turn down", "رد کردن", "I had to turn down the offer.", "مجبور شدم پیشنهاد را رد کنم.", "verb"),
            v("accept", "پذیرفتن", "I accept your apology.", "عذرخواهی‌ات را می‌پذیرم.", "verb"),
            v("request", "درخواست کردن", "I request a refund.", "درخواست بازپرداخت می‌کنم.", "verb"),
            v("favor", "لطف", "Can I ask a favor?", "می‌توانم لطفی بخواهم؟")
        ),
        listOf(
            GrammarSection("Polite requests", "Could you...? / Would you mind...? / I was wondering if you could..."),
            GrammarSection("Offers and suggestions", "Shall I...? / I could... / How about...? / Why don't we...?"),
            GrammarSection("Apologizing and explaining", "I'm sorry for... / I apologize for... / The reason is... / Let me explain..."),
            GrammarSection("Negotiating and compromising", "If you... I'll... / What if we...? / Let's meet halfway.")
        ),
        listOf(
            d("A", "Hey, Maria! I have a problem at work. Can I ask your advice?", "هی، ماریا! در محل کار مشکلی دارم. می‌توانم مشورت بگیرم؟"),
            d("B", "Of course. What's going on?", "البته. چه خبر است؟"),
            d("A", "My colleague isn't doing his share of the work.", "همکارم سهم خودش از کار را انجام نمی‌دهد."),
            d("B", "That's frustrating. Have you talked to him?", "آزاردهنده است. با او صحبت کرده‌ای؟"),
            d("A", "Not yet. I don't want to create tension.", "هنوز نه. نمی‌خواهم تنش ایجاد کنم."),
            d("B", "I understand. But you need to address it.", "می‌فهمم. ولی باید حلش کنی."),
            d("A", "How should I bring it up?", "چطور باید مطرحش کنم؟"),
            d("B", "Could you ask to have a private conversation?", "می‌توانی درخواست گفتگوی خصوصی کنی؟"),
            d("A", "That's a good idea. What should I say?", "فکر خوبی است. چه بگویم؟"),
            d("B", "Be honest but kind. Focus on the work, not the person.", "صادق ولی مهربان باش. روی کار تمرکز کن، نه شخص."),
            d("A", "Like, 'I've noticed we're falling behind on deadlines.'", "مثل، 'متوجه شده‌ام از مهلت‌ها عقب می‌افتیم.'"),
            d("B", "Exactly. Then ask if there's a reason.", "دقیقاً. بعد بپرس آیا دلیلی هست."),
            d("A", "What if he gets defensive?", "اگر حالت دفاعی بگیرد چطور؟"),
            d("B", "Stay calm. Use 'I' statements.", "آرام بمان. از جملات 'من' استفاده کن."),
            d("A", "Like 'I feel overwhelmed when I have to do extra work.'", "مثل 'وقتی باید کار اضافی انجام دهم احساس overwhelmed می‌کنم.'"),
            d("B", "Perfect. That's non-accusatory.", "عالی. این غیراتهام‌آمیز است."),
            d("A", "What if he doesn't change?", "اگر تغییر نکرد چطور؟"),
            d("B", "Then you might need to involve your manager.", "بعد ممکن است لازم باشد مدیرت را دخیل کنی."),
            d("A", "I hope it doesn't come to that.", "امیدوارم به آنجا نکشد."),
            d("B", "Me too. But you have to protect yourself.", "من هم. ولی باید از خودت محافظت کنی."),
            d("A", "You're right. Thanks for the advice.", "حق داری. ممنون برای توصیه."),
            d("B", "Anytime. Let me know how it goes.", "هر وقت. بگذار بدانم چطور پیش می‌رود."),
            d("A", "I will. Now, can I ask you a favor?", "می‌کنم. حالا، می‌توانم لطفی بخواهم؟"),
            d("B", "Sure. What is it?", "حتماً. چیست؟"),
            d("A", "Would you mind helping me with a presentation?", "مشکلی نداری به من با یک ارائه کمک کنی؟"),
            d("B", "Not at all. When is it?", "اصلاً. کِی است؟"),
            d("A", "Next Thursday. I'm nervous about it.", "پنجشنبه بعد. مضطربم."),
            d("B", "Don't worry. We'll practice together.", "نگران نباش. با هم تمرین می‌کنیم."),
            d("A", "That's a huge relief. Thank you!", "خیلی تسکین‌دهنده است. ممنون!"),
            d("B", "You're welcome. What's the topic?", "خواهش می‌کنم. موضوع چیست؟"),
            d("A", "A new product launch. I need to convince the board.", "معرفی محصول جدید. باید هیئت مدیره را متقاعد کنم."),
            d("B", "That's important. What's your main argument?", "مهم است. استدلال اصلی‌ات چیست؟"),
            d("A", "That it will increase revenue by 20%.", "اینکه درآمد را ۲۰٪ افزایش می‌دهد."),
            d("B", "Do you have data to support that?", "داده‌ای برای پشتیبانی داری؟"),
            d("A", "Yes, but it's complex. I need to simplify it.", "بله، ولی پیچیده است. باید ساده‌اش کنم."),
            d("B", "I can help with that. Let's meet tomorrow.", "می‌توانم کمک کنم. بیایید فردا ملاقات کنیم."),
            d("A", "Perfect. How about 10 AM at the café?", "عالی. ساعت ۱۰ صبح در کافه چطور؟"),
            d("B", "Sounds good. I'll bring my laptop.", "خوبه. لپ‌تاپم را می‌آورم."),
            d("A", "Great. Now, about the presentation format...", "عالی. حالا، درباره قالب ارائه..."),
            d("B", "Sorry to interrupt. Could we discuss it tomorrow?", "ببخشید وقفه می‌اندازم. می‌توانیم فردا بحثش کنیم؟"),
            d("A", "Of course. I should go anyway.", "البته. من هم باید بروم."),
            d("B", "Wait, one more thing. Would you like me to review your slides?", "صبر کن، یک چیز دیگر. می‌خواهی اسلایدهایت را بررسی کنم؟"),
            d("A", "That would be amazing. Thank you so much!", "شگفت‌انگیز می‌شد. خیلی ممنون!"),
            d("B", "No problem. Send them tonight.", "مشکلی نیست. امشب بفرست."),
            d("A", "I will. You're a lifesaver.", "می‌فرستم. نجات‌دهنده‌ای."),
            d("B", "Ha! I try. Well, see you tomorrow.", "ها! سعی می‌کنم. خب، فردا می‌بینمت."),
            d("A", "See you! And thanks again.", "می‌بینمت! و باز هم ممنون."),
            d("B", "Anytime. Bye!", "هر وقت. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What's Ali's problem at work?", listOf("low salary", "colleague not doing work", "bad manager", "long hours"), 1),
            q("What does Maria suggest Ali do first?", listOf("talk to manager", "private conversation", "ignore it", "quit"), 1),
            q("What does Ali ask Maria to help with?", listOf("a report", "a presentation", "a meeting", "an email"), 1),
            q("What's Ali's main argument?", listOf("save money", "increase revenue", "reduce staff", "new office"), 1),
            q("Would you mind ___ me?", listOf("help", "helping", "to help", "helped"), 1),
            q("Could you ___ me with this?", listOf("help", "helping", "to help", "helped"), 0),
            q("Shall I ___ the slides?", listOf("review", "reviewing", "to review", "reviewed"), 0),
            q("How about ___ at 10?", listOf("meet", "meeting", "to meet", "met"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Bring it up", "مطرح کردن", "How should I bring it up?", "چطور باید مطرحش کنم؟"),
            IdiomExpression("Come to that", "به آنجا کشیدن", "I hope it doesn't come to that.", "امیدوارم به آنجا نکشد."),
            IdiomExpression("Huge relief", "تسکین بزرگ", "That's a huge relief.", "خیلی تسکین‌دهنده است."),
            IdiomExpression("Lifesaver", "نجات‌دهنده", "You're a lifesaver.", "نجات‌دهنده‌ای.")
        ),
        phrasal = listOf(
            PhrasalVerb("bring up", "مطرح کردن", "mention", "Bring it up in the meeting.", "در جلسه مطرحش کن.", "No"),
            PhrasalVerb("come to", "رسیدن به", "reach", "I hope it doesn't come to that.", "امیدوارم به آنجا نکشد.", "No"),
            PhrasalVerb("help out", "کمک کردن", "assist", "Can you help out?", "می‌توانی کمک کنی؟", "No"),
            PhrasalVerb("work out", "حل شدن", "resolve", "I hope it works out.", "امیدوارم حل شود.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Polite requests", "COULD you HELP me? Would you MIND...?"),
            PronunciationTip("Offers", "SHALL I...? HOW about...? WHY don't we...?"),
            PronunciationTip("Solution vocabulary", "soLUtion, PROblem, proPOSE, COMpromise.")
        ),
        culture = listOf(
            CulturalNote("Workplace conflict", "Addressing workplace issues directly but respectfully is important."),
            CulturalNote("Polite requests", "Indirect requests are considered more polite in many cultures."),
            CulturalNote("Negotiation", "Compromise is key to resolving disagreements.")
        ),
        mistakes = listOf(
            CommonMistake("Would you mind to help me?", "Would you mind helping me?", "Use gerund after 'mind'."),
            CommonMistake("Could you to help me?", "Could you help me?", "Use base verb after modal."),
            CommonMistake("How about to meet at 10?", "How about meeting at 10?", "Use gerund after 'how about'."),
            CommonMistake("Shall I to review the slides?", "Shall I review the slides?", "Use base verb after 'shall'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's Ali's workplace problem?", "A colleague isn't doing his share of work."),
            ComprehensionQuestion("What's Maria's advice?", "Private conversation, 'I' statements, involve manager if needed."),
            ComprehensionQuestion("What favor does Ali ask?", "Help with a presentation for a product launch.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a problem and propose solutions.", "درباره یک مشکل صحبت کن و راه‌حل پیشنهاد بده.", "The problem is... / One solution is... / What if we...?" ),
            SpeakingTask("Make polite requests.", "درخواست‌های مؤدبانه بکن.", "Could you...? / Would you mind...? / I was wondering if..." ),
            SpeakingTask("Negotiate and compromise.", "مذاکره و سازش کن.", "If you... I'll... / Let's meet halfway. / What if we...?" )
        ),
        writing = listOf(
            WritingTask("Write about a problem and your proposed solution.", "درباره یک مشکل و راه‌حل پیشنهادی‌ات بنویس.", 180, "Use polite requests and suggestions.")
        )
    )
}