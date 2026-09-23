package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Top Notch 2 — Complete Course Content
 * 10 Units | Intermediate (A2+ to B1)
 * Original educational content (no copyrighted material reproduced)
 */
object TopNotch2 {
    const val BOOK_ID = "top_notch_2"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> lesson1()
        2 -> lesson2()
        3 -> lesson3()
        4 -> lesson4()
        5 -> lesson5()
        6 -> lesson6()
        7 -> lesson7()
        8 -> lesson8()
        9 -> lesson9()
        10 -> lesson10()
        else -> LessonContent(
            BOOK_ID, chapterNumber, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList()
        )
    }

    // ═══════════════════════════════════════════════════════════
    // BASE BUILDER & HELPERS
    // ═══════════════════════════════════════════════════════════

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
    // UNIT 1 — Getting Acquainted | آشنایی
    // ═══════════════════════════════════════════════════════════
    private fun lesson1() = base(
        1, "Getting Acquainted", "آشنایی",
        listOf(
            "Get reacquainted with someone",
            "Greet a visitor to your country",
            "Use the present perfect with already, yet, ever, before, and never",
            "Discuss gestures and customs around the world",
            "Describe an interesting experience"
        ),
        listOf(
            v("acquaintance", "آشنا", "He's an old acquaintance from college.", "او یک آشنای قدیمی از دانشگاه است."),
            v("gesture", "حرکت / اشاره", "In some cultures, a bow is a polite gesture.", "در برخی فرهنگ‌ها، تعظیم یک حرکت مؤدبانه است."),
            v("custom", "رسم و رسوم", "Shaking hands is a common custom.", "دست دادن یک رسم رایج است."),
            v("bow", "تعظیم کردن", "In Japan, people often bow when greeting.", "در ژاپن، مردم هنگام سلام اغلب تعظیم می‌کنند.", "verb"),
            v("hug", "در آغوش گرفتن", "Friends sometimes hug when they meet.", "دوستان گاهی هنگام ملاقات همدیگر را در آغوش می‌گیرند.", "verb"),
            v("kiss", "بوسیدن", "In some countries, people kiss on the cheek.", "در برخی کشورها، مردم روی گونه را می‌بوسند.", "verb"),
            v("shake hands", "دست دادن", "It's polite to shake hands in business.", "در محیط کاری، دست دادن مؤدبانه است.", "verb"),
            v("tourist", "گردشگر", "Many tourists visit this city every year.", "گردشگران زیادی هر سال به این شهر می‌آیند."),
            v("sight", "منظره / جاذبه", "The Eiffel Tower is a famous sight.", "برج ایفل یک جاذبه معروف است."),
            v("familiar", "آشنا", "Your face looks familiar. Haven't we met?", "صورتت آشناست. قبلاً همدیگر را ندیده‌ایم؟", "adjective"),
            v("reacquainted", "دوباره آشنا شدن", "We got reacquainted at the reunion.", "در جشن تجدید دیدار دوباره با هم آشنا شدیم.", "adjective"),
            v("lateness", "تأخیر", "He apologized for his lateness.", "او برای تأخیرش عذرخواهی کرد."),
            v("experience", "تجربه", "Traveling abroad was a great experience.", "سفر به خارج تجربه عالی بود."),
            v("tourist activity", "فعالیت گردشگری", "Sightseeing is a popular tourist activity.", "بازدید از جاذبه‌ها یک فعالیت گردشگری محبوب است."),
            v("culture", "فرهنگ", "Learning about other cultures is interesting.", "یادگیری درباره فرهنگ‌های دیگر جالب است.")
        ),
        listOf(
            GrammarSection(
                "Present Perfect: already, yet, ever, never, before",
                "Use the present perfect for experiences at an unspecified time. Use already in affirmative statements, yet in questions and negatives, and ever/never for life experiences. Have you ever been to Japan? I've already seen that movie. I haven't finished yet."
            ),
            GrammarSection(
                "Present Perfect vs Simple Past",
                "Use the present perfect for experiences without a specific time. Use the simple past with specific past time expressions. I've visited Paris. (experience) — I visited Paris in 2019. (specific time)"
            ),
            GrammarSection(
                "Conversation strategy: Showing interest",
                "Use expressions like 'Really?', 'That's interesting!', and 'How fascinating!' to show interest when someone tells you about their experiences."
            ),
            GrammarSection(
                "Sound reduction in Present Perfect",
                "In natural speech, 'have' is often reduced: I've been → /aɪv bɪn/. Listen for the reduced form in conversation."
            )
        ),
        listOf(
            d("A", "You look familiar. Haven't we met before?", "آشنا به نظر می‌رسی. قبلاً همدیگر را ندیده‌ایم؟"),
            d("B", "I don't think so. I'm not from around here.", "فکر نمی‌کنم. من اهل اینجا نیستم."),
            d("A", "Aren't you from Canada?", "اهل کانادا نیستی؟"),
            d("B", "Yes, I am. I'm from Vancouver. How did you know?", "بله. اهل ونکوور هستم. از کجا فهمیدی؟"),
            d("A", "I think we met at Joan's house last month.", "فکر می‌کنم ماه گذشته در خانه جوآن همدیگر را دیدیم."),
            d("B", "Oh, that's right! You work with Joan.", "اوه، درست است! تو با جوآن کار می‌کنی."),
            d("A", "Yes, I do. What have you been up to?", "بله. چه کارها می‌کنی؟"),
            d("B", "Not much. Actually, I'm on my way to a class.", "زیاد نه. در واقع، در راه کلاس هستم."),
            d("A", "What are you studying?", "چه چیزی درس می‌خوانی؟"),
            d("B", "I'm taking a course in international business.", "دارم یک دوره تجارت بین‌الملل می‌خوانم."),
            d("A", "That sounds interesting. Have you ever traveled abroad for work?", "جالب به نظر می‌رسد. تا حالا برای کار به خارج سفر کرده‌ای؟"),
            d("B", "Yes, I have. I've been to Japan twice.", "بله. دو بار به ژاپن رفته‌ام."),
            d("A", "Really? How fascinating! What did you learn about Japanese customs?", "واقعاً؟ چقدر جالب! درباره رسوم ژاپنی چه یاد گرفتی؟"),
            d("B", "Well, I learned that bowing is very important. People bow when they greet, thank, or apologize.", "خب، یاد گرفتم که تعظیم خیلی مهم است. مردم هنگام سلام، تشکر، یا عذرخواهی تعظیم می‌کنند."),
            d("A", "I've read about that. Have you ever made a mistake with customs?", "درباره‌اش خوانده‌ام. تا حالا در رسوم اشتباه کرده‌ای؟"),
            d("B", "Actually, yes. I hugged a business partner once. He looked very uncomfortable.", "در واقع، بله. یک بار شریک تجاری‌ام را در آغوش گرفتم. خیلی معذب به نظر می‌رسید."),
            d("A", "Oh no! What did you do?", "اوه نه! چه کار کردی؟"),
            d("B", "I apologized and explained that in Canada, we often hug friends. He understood.", "عذرخواهی کردم و توضیح دادم که در کانادا اغلب دوستان را در آغوش می‌گیریم. او فهمید."),
            d("A", "That's a good lesson. I haven't traveled much myself.", "درس خوبی است. من خودم زیاد سفر نکرده‌ام."),
            d("B", "You should! Traveling teaches you so much about the world.", "باید بروی! سفر چیزهای زیادی درباره دنیا یادت می‌دهد."),
            d("A", "I'd love to. Maybe I'll start planning a trip.", "خیلی دوست دارم. شاید شروع کنم به برنامه‌ریزی سفر."),
            d("B", "Let me know if you need any advice. I've planned many trips.", "اگر مشاوره لازم داشتی خبرم کن. سفرهای زیادی برنامه‌ریزی کرده‌ام."),
            d("A", "Thanks. That would be great.", "ممنون. عالی می‌شود."),
            d("B", "Well, I have to go to class now. It was nice seeing you again.", "خب، باید الان به کلاس بروم. از دیدن دوباره‌ات خوشحال شدم."),
            d("A", "Nice seeing you, too. We should keep in touch.", "من هم خوشحال شدم. باید در تماس باشیم."),
            d("B", "Of course! Here's my card. Let's get together soon.", "حتماً! این کارت من. بیا به زودی دور هم جمع شویم."),
            d("A", "Sounds good. I'll call you next week.", "خوبه. هفته بعد بهت زنگ می‌زنم."),
            d("B", "Perfect. See you then!", "عالی. تا اون موقع!")
        ),
        listOf(
            q("Where is B from?", listOf("Japan", "Canada", "England", "America"), 1),
            q("What course is B taking?", listOf("English", "International business", "History", "Art"), 1),
            q("How many times has B been to Japan?", listOf("once", "twice", "three times", "never"), 1),
            q("What custom did B learn about in Japan?", listOf("hugging", "bowing", "kissing", "shaking hands"), 1),
            q("What mistake did B make?", listOf("bowed too low", "hugged a business partner", "forgot to shake hands", "arrived late"), 1),
            q("Choose the correct sentence.", listOf("Have you ever been to Japan?", "Did you ever been to Japan?", "Have you ever went to Japan?", "Do you ever been to Japan?"), 0),
            q("I haven't finished ___.", listOf("already", "yet", "ever", "never"), 1),
            q("She has ___ seen that movie. (affirmative)", listOf("yet", "ever", "already", "never"), 2)
        ),
        idioms = listOf(
            IdiomExpression("What have you been up to?", "چه کارها می‌کنی؟", "What have you been up to?", "چه کارها می‌کنی؟"),
            IdiomExpression("Keep in touch", "در تماس بودن", "We should keep in touch.", "باید در تماس باشیم."),
            IdiomExpression("Get together", "دور هم جمع شدن", "Let's get together soon.", "بیا به زودی دور هم جمع شویم."),
            IdiomExpression("That sounds interesting", "جالب به نظر می‌رسد", "That sounds interesting.", "جالب به نظر می‌رسد.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "get reacquainted", "دوباره آشنا شدن", "become familiar again",
                "We got reacquainted at the reunion.", "در جشن تجدید دیدار دوباره با هم آشنا شدیم.", "No"
            ),
            PhrasalVerb(
                "keep in touch", "در تماس بودن", "maintain contact",
                "We should keep in touch.", "باید در تماس باشیم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Sound reduction in Present Perfect", "Listen for the reduced form of 'have': I've been → /aɪv bɪn/, You've seen → /juːv siːn/."),
            PronunciationTip("Rising intonation in questions", "Yes/No questions with the present perfect have rising intonation: Have you ever been to Japan? ↗")
        ),
        culture = listOf(
            CulturalNote(
                "Gestures and customs around the world",
                "Greeting customs vary widely. In Japan, bowing is common. In many Western countries, a handshake or a hug is typical. In some Middle Eastern cultures, a kiss on the cheek is normal between friends."
            ),
            CulturalNote(
                "Showing interest in conversation",
                "When someone shares an experience, responding with 'Really?', 'That's interesting!', or 'How fascinating!' shows you are engaged and encourages them to continue."
            )
        ),
        mistakes = listOf(
            CommonMistake("Have you ever went to Japan?", "Have you ever been to Japan?", "Use the past participle 'been' with 'have', not the simple past 'went'."),
            CommonMistake("I have seen him yesterday.", "I saw him yesterday.", "Use the simple past with specific past time expressions like 'yesterday'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What mistake did B make with a business partner?", "B hugged a business partner, who felt uncomfortable."),
            ComprehensionQuestion("Why does B say traveling is important?", "Because it teaches you a lot about the world.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Share an interesting travel or life experience with a partner.",
                "یک تجربه جالب سفر یا زندگی را با یک دوست به اشتراک بگذار.",
                "Have you ever...? / I've been to... / I've never..."
            ),
            SpeakingTask(
                "Discuss a custom from your country with a partner.",
                "درباره یک رسم از کشورت با یک دوست صحبت کن.",
                "In my country, people... / It's polite to... / It's rude to..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write about an interesting experience you've had.",
                "درباره یک تجربه جالب که داشته‌ای بنویس.",
                150,
                "Use the present perfect with already, yet, ever, before, or never."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 2 — Going to the Movies | رفتن به سینما
    // ═══════════════════════════════════════════════════════════
    private fun lesson2() = base(
        2, "Going to the Movies", "رفتن به سینما",
        listOf(
            "Apologize for being late",
            "Discuss preferences for movie genres",
            "Describe and recommend movies",
            "Use the present perfect with for and since",
            "Express wants and preferences with would like and would rather"
        ),
        listOf(
            v("genre", "ژانر", "What's your favorite movie genre?", "ژانر فیلم مورد علاقه‌ات چیست؟"),
            v("action film", "فیلم اکشن", "Action films are exciting.", "فیلم‌های اکشن هیجان‌انگیز هستند."),
            v("horror film", "فیلم ترسناک", "I can't watch horror films alone.", "نمی‌توانم فیلم‌های ترسناک را تنها ببینم."),
            v("science fiction", "علمی-تخیلی", "Science fiction explores future technology.", "علمی-تخیلی تکنولوژی آینده را بررسی می‌کند."),
            v("animated", "انیمیشن", "Animated films are fun for all ages.", "فیلم‌های انیمیشن برای همه سنین سرگرم‌کننده هستند."),
            v("comedy", "کمدی", "I love watching comedies when I'm sad.", "وقتی غمگینم عاشق تماشای کمدی هستم."),
            v("drama", "درام", "Dramas often have emotional stories.", "درام‌ها اغلب داستان‌های احساسی دارند."),
            v("documentary", "مستند", "Documentaries teach you about real events.", "مستندها درباره رویدادهای واقعی به تو آموزش می‌دهند."),
            v("musical", "موزیکال", "Musicals have great songs and dancing.", "موزیکال‌ها آهنگ‌ها و رقص‌های عالی دارند."),
            v("thriller", "دلهره‌آور", "Thrillers keep you on the edge of your seat.", "فیلم‌های دلهره‌آور تو را روی لبه صندلی نگه می‌دارند."),
            v("plot", "داستان / خط داستانی", "The plot was very unpredictable.", "خط داستانی خیلی غیرقابل پیش‌بینی بود."),
            v("recommend", "توصیه کردن", "I highly recommend this movie.", "این فیلم را شدیداً توصیه می‌کنم.", "verb"),
            v("prefer", "ترجیح دادن", "I prefer comedies to dramas.", "کمدی را به درام ترجیح می‌دهم.", "verb"),
            v("violence", "خشونت", "Some people are concerned about violence in movies.", "برخی افراد نگران خشونت در فیلم‌ها هستند."),
            v("apologize", "عذرخواهی کردن", "I apologize for being late.", "برای تأخیرم عذرخواهی می‌کنم.", "verb")
        ),
        listOf(
            GrammarSection(
                "Present Perfect with for and since",
                "Use 'for' with a period of time and 'since' with a point in time. I've lived here for five years. I've known her since 2015."
            ),
            GrammarSection(
                "Would like vs Would rather",
                "Use 'would like' to express a desire and 'would rather' to express a preference. I'd like to see a comedy. I'd rather watch a drama."
            ),
            GrammarSection(
                "Present Perfect vs Simple Past (review)",
                "Use the present perfect for experiences without a specific time and the simple past with specific time expressions. I've seen that movie. I saw it last week."
            ),
            GrammarSection(
                "Conversation strategy: Making and responding to suggestions",
                "Use 'How about...?', 'What about...?', and 'Why don't we...?' to make suggestions. Respond with 'That sounds good', 'I'd rather...', or 'I'm not really in the mood for...'"
            )
        ),
        listOf(
            d("A", "Hey! I'm so sorry I'm late.", "سلام! خیلی متأسفم که دیر کردم."),
            d("B", "That's okay. I've only been here for ten minutes.", "مشکلی نیست. من فقط ده دقیقه است اینجا هستم."),
            d("A", "The traffic was terrible. Have you been waiting long?", "ترافیک وحشتناک بود. زیاد منتظر مانده‌ای؟"),
            d("B", "Not too long. Don't worry about it.", "زیاد نه. نگرانش نباش."),
            d("A", "So, what do you want to see?", "خب، چه فیلمی می‌خواهی ببینی؟"),
            d("B", "I'd like to see the new comedy. I need a good laugh.", "دوست دارم کمدی جدید را ببینم. به یک خنده خوب نیاز دارم."),
            d("A", "Actually, I'd rather see the thriller. I've heard it's amazing.", "در واقع، ترجیح می‌دهم دلهره‌آور را ببینم. شنیده‌ام فوق‌العاده است."),
            d("B", "Really? I'm not really in the mood for something scary.", "واقعاً؟ حال و حوصله چیز ترسناک را ندارم."),
            d("A", "How about the documentary about space? It's gotten great reviews.", "مستند درباره فضا چطور؟ نقدهای عالی گرفته."),
            d("B", "Hmm, I've seen a lot of documentaries lately.", "هوم، اخیراً مستندهای زیادی دیده‌ام."),
            d("A", "What about the animated film? It's supposed to be funny for adults too.", "فیلم انیمیشن چطور؟ قرار است برای بزرگسالان هم خنده‌دار باشد."),
            d("B", "That sounds good! I've heard it's really clever.", "خوبه! شنیده‌ام واقعاً هوشمندانه است."),
            d("A", "Great. Let's see that one. What time does it start?", "عالی. بیا آن را ببینیم. چه ساعتی شروع می‌شود؟"),
            d("B", "Let me check... It starts at 7:30. We have time for coffee first.", "بگذار چک کنم... ساعت ۷:۳۰ شروع می‌شود. وقت داریم اول قهوه بخوریم."),
            d("A", "Perfect. I've wanted to try that new café for weeks.", "عالی. هفته‌هاست می‌خواهم آن کافه جدید را امتحان کنم."),
            d("B", "The one on Main Street? I've been there since it opened. It's great.", "همان در خیابان مین؟ از وقتی باز شده آنجا رفته‌ام. عالی است."),
            d("A", "Good to know. What do you usually order there?", "خوب است که می‌دانم. معمولاً آنجا چه سفارش می‌دهی؟"),
            d("B", "Their cappuccino is excellent. I've been going there for months.", "کاپوچینویشان عالی است. ماه‌هاست می‌روم."),
            d("A", "I'll try that then. By the way, have you seen any good movies lately?", "پس آن را امتحان می‌کنم. راستی، اخیراً فیلم خوبی دیده‌ای؟"),
            d("B", "Yes, I saw a great drama last week. It was very moving.", "بله، هفته پیش یک درام عالی دیدم. خیلی تأثیرگذار بود."),
            d("A", "What was it about?", "درباره چه بود؟"),
            d("B", "It was about a family dealing with a difficult situation. The acting was superb.", "درباره یک خانواده بود که با موقعیت دشواری دست و پنجه نرم می‌کرد. بازیگری عالی بود."),
            d("A", "That sounds like something I'd like. What was the name?", "به نظر چیزی است که دوست دارم. اسمش چه بود؟"),
            d("B", "I'll text you the name. Oh, look, the movie's about to start.", "اسمش را پیامک می‌کنم. اوه، نگاه کن، فیلم دارد شروع می‌شود."),
            d("A", "Let's go in. I'm excited to see it.", "بیا برویم داخل. هیجان‌زده‌ام که ببینمش."),
            d("B", "Me too. I hope it's as good as everyone says.", "من هم. امیدوارم به خوبی آن‌طور که همه می‌گویند باشد.")
        ),
        listOf(
            q("Why is A late?", listOf("overslept", "traffic was terrible", "lost keys", "missed the bus"), 1),
            q("What kind of movie do they decide to see?", listOf("comedy", "thriller", "animated film", "documentary"), 2),
            q("What time does the movie start?", listOf("7:00", "7:30", "8:00", "8:30"), 1),
            q("What does B recommend at the café?", listOf("latte", "cappuccino", "espresso", "tea"), 1),
            q("Choose: I've lived here ___ five years.", listOf("since", "for", "from", "during"), 1),
            q("Choose: I've known her ___ 2015.", listOf("for", "since", "from", "during"), 1),
            q("I ___ rather see the thriller.", listOf("would", "will", "am", "do"), 0),
            q("I'd like ___ a comedy.", listOf("see", "to see", "seeing", "saw"), 1)
        ),
        idioms = listOf(
            IdiomExpression("In the mood for", "حال و حوصله داشتن", "I'm not in the mood for something scary.", "حال و حوصله چیز ترسناک را ندارم."),
            IdiomExpression("Supposed to be", "قرار است باشد", "It's supposed to be funny.", "قرار است خنده‌دار باشد."),
            IdiomExpression("On the edge of your seat", "روی لبه صندلی (هیجان‌زده)", "Thrillers keep you on the edge of your seat.", "فیلم‌های دلهره‌آور تو را روی لبه صندلی نگه می‌دارند."),
            IdiomExpression("Good to know", "خوب است که بدانم", "Good to know. What do you order there?", "خوب است که می‌دانم. آنجا چه سفارش می‌دهی؟")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "check out", "بررسی کردن", "look at or investigate",
                "Let's check out the new café.", "بیا کافه جدید را بررسی کنیم.", "No"
            ),
            PhrasalVerb(
                "go in", "داخل رفتن", "enter a place",
                "Let's go in. The movie's about to start.", "بیا برویم داخل. فیلم دارد شروع می‌شود.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Reduction of /h/", "In natural speech, 'h' is often dropped in pronouns: What's he doing? → /wʌtsi duɪŋ/, I've seen him → /aɪv siːn ɪm/."),
            PronunciationTip("Contractions with will", "Practice contractions: I'll, you'll, he'll, she'll, we'll, they'll.")
        ),
        culture = listOf(
            CulturalNote(
                "Movie genres and preferences",
                "In English-speaking countries, people often discuss movie genres and preferences as a way to get to know each other. Asking 'What kind of movies do you like?' is a common conversation starter."
            ),
            CulturalNote(
                "Violence in movies",
                "Discussions about violence in movies and media are common. People often express different opinions on whether it affects viewers."
            )
        ),
        mistakes = listOf(
            CommonMistake("I've seen him yesterday.", "I saw him yesterday.", "Use the simple past with specific past time expressions."),
            CommonMistake("I've lived here since five years.", "I've lived here for five years.", "Use 'for' with periods of time and 'since' with points in time.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why don't they see the thriller?", "Because B isn't in the mood for something scary."),
            ComprehensionQuestion("What does B say about the café on Main Street?", "B has been going there for months and recommends the cappuccino.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Discuss your movie preferences with a partner.",
                "درباره ترجیحات فیلمت با یک دوست صحبت کن.",
                "I like... / I'd rather... / I'm not in the mood for..."
            ),
            SpeakingTask(
                "Recommend a movie to a partner and explain why.",
                "یک فیلم به یک دوست توصیه کن و دلیلش را بگو.",
                "You should see... / It's about... / I highly recommend it."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a movie review for a film you've seen recently.",
                "یک نقد فیلم برای فیلمی که اخیراً دیده‌ای بنویس.",
                150,
                "Include the genre, plot, and your recommendation. Use present perfect and would rather."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 3 — Staying in Hotels | اقامت در هتل
    // ═══════════════════════════════════════════════════════════
    private fun lesson3() = base(
        3, "Staying in Hotels", "اقامت در هتل",
        listOf(
            "Leave and take a phone message",
            "Check into and out of a hotel",
            "Discuss hotel room features and facilities",
            "Request housekeeping services",
            "Use the future with will"
        ),
        listOf(
            v("hotel room", "اتاق هتل", "The hotel room has a beautiful view.", "اتاق هتل منظره زیبایی دارد."),
            v("single room", "اتاق یک‌نفره", "I'd like to book a single room.", "می‌خواهم یک اتاق یک‌نفره رزرو کنم."),
            v("double room", "اتاق دو‌نفره", "A double room has a larger bed.", "اتاق دو‌نفره تخت بزرگ‌تری دارد."),
            v("suite", "سوئیت", "They stayed in a luxurious suite.", "آن‌ها در یک سوئیت لوکس اقامت کردند."),
            v("amenities", "امکانات", "The hotel has many amenities, including a pool.", "هتل امکانات زیادی دارد، از جمله استخر."),
            v("towel", "حوله", "Could I have an extra towel?", "می‌توانم یک حوله اضافه داشته باشم؟"),
            v("hanger", "جالباسی", "I need more hangers for my clothes.", "برای لباس‌هایم جالباسی بیشتری لازم دارم."),
            v("iron", "اتو", "Can I borrow an iron?", "می‌توانم اتو قرض بگیرم؟"),
            v("hair dryer", "سشوار", "There's a hair dryer in the bathroom.", "در حمام سشوار هست."),
            v("room service", "سرویس اتاق", "We ordered dinner from room service.", "از سرویس اتاق شام سفارش دادیم."),
            v("laundry", "خشکشویی", "I need to send my clothes to the laundry.", "باید لباس‌هایم را به خشکشویی بفرستم."),
            v("reservation", "رزرو", "I have a reservation under the name Smith.", "به نام اسمیت رزرو دارم."),
            v("check in", "پذیرش / ورود", "We can check in after 2 PM.", "می‌توانیم بعد از ساعت ۲ پذیرش بگیریم.", "verb"),
            v("check out", "تسویه / خروج", "What time do we need to check out?", "چه ساعتی باید تسویه کنیم؟", "verb"),
            v("bell service", "سرویس چمدان", "The bell service will bring your bags up.", "سرویس چمدان کیف‌هایتان را بالا می‌آورد.")
        ),
        listOf(
            GrammarSection(
                "Future with will",
                "Use 'will' for predictions, spontaneous decisions, and promises. I'll bring you some towels. It will be a great trip."
            ),
            GrammarSection(
                "Real conditional",
                "Use the real conditional for likely future situations: If you need anything, just call the front desk. If it rains, we'll stay inside."
            ),
            GrammarSection(
                "Conversation strategy: Leaving and taking messages",
                "Use expressions like 'Can I take a message?', 'I'll give him the message', and 'Could you tell her...?' when leaving or taking phone messages."
            ),
            GrammarSection(
                "Contractions with will",
                "Practice contractions: I'll, you'll, he'll, she'll, it'll, we'll, they'll."
            )
        ),
        listOf(
            d("A", "Good afternoon. Welcome to the Grand Hotel. How can I help you?", "عصر بخیر. به هتل گرند خوش آمدید. چطور می‌توانم کمکتان کنم؟"),
            d("B", "Hello. I have a reservation under the name Miller.", "سلام. به نام میلر رزرو دارم."),
            d("A", "Let me check... Yes, Ms. Miller. A single room for three nights.", "بگذارید چک کنم... بله، خانم میلر. یک اتاق یک‌نفره برای سه شب."),
            d("B", "That's correct.", "درست است."),
            d("A", "Could I see your ID, please?", "می‌توانم کارت شناسایی‌تان را ببینم، لطفاً؟"),
            d("B", "Here you are.", "بفرمایید."),
            d("A", "Thank you. Here's your key card. You're in room 412.", "ممنون. این کارت کلیدتان. اتاق ۴۱۲ هستید."),
            d("B", "Great. What time is checkout?", "عالی. چه ساعتی تسویه است؟"),
            d("A", "Checkout is at noon. If you need a late checkout, just let us know.", "تسویه ساعت ۱۲ است. اگر تسویه دیرهنگام لازم دارید، فقط به ما بگویید."),
            d("B", "I'll keep that in mind. Is there a hair dryer in the room?", "در نظر خواهم داشت. آیا در اتاق سشوار هست؟"),
            d("A", "Yes, there is. There's also an iron and an ironing board in the closet.", "بله، هست. همچنین اتو و میز اتو در کمد هست."),
            d("B", "Perfect. What about room service?", "عالی. سرویس اتاق چطور؟"),
            d("A", "Room service is available 24 hours. If you'd like anything, just dial 0.", "سرویس اتاق ۲۴ ساعته در دسترس است. اگر چیزی خواستید، فقط شماره ۰ را بگیرید."),
            d("B", "Thanks. Oh, and could I get some extra towels?", "ممنون. اوه، می‌توانم چند حوله اضافه بگیرم؟"),
            d("A", "Of course. I'll send some up right away.", "حتماً. همین الان چند تا می‌فرستم بالا."),
            d("B", "Thank you. One more thing — I need to do some laundry. How does that work?", "ممنون. یک چیز دیگر — باید چند لباس بشویم. چطور کار می‌کند؟"),
            d("A", "There's a laundry bag in your closet. Just fill it out and leave it at the front desk by 9 AM.", "کیسه خشکشویی در کمدتان هست. فقط فرم را پر کنید و تا ساعت ۹ صبح در پذیرش بگذارید."),
            d("B", "And when will it be ready?", "و کی آماده می‌شود؟"),
            d("A", "It'll be ready by the next evening.", "تا عصر روز بعد آماده می‌شود."),
            d("B", "That's fine. I'll do that tomorrow morning.", "خوبه. فردا صبح این کار را می‌کنم."),
            d("A", "Is there anything else I can help you with?", "کار دیگری هست که بتوانم کمکتان کنم؟"),
            d("B", "No, that's all for now. Thank you so much.", "نه، فعلاً همین. خیلی ممنون."),
            d("A", "You're welcome. Enjoy your stay, Ms. Miller.", "خواهش می‌کنم. اقامت خوبی داشته باشید، خانم میلر."),
            d("B", "Thank you. Oh, wait — if my friend calls, could you take a message?", "ممنون. اوه، صبر کنید — اگر دوستم زنگ زد، می‌توانید پیام بگیرید؟"),
            d("A", "Of course. What's your friend's name?", "حتماً. اسم دوستتان چیست؟"),
            d("B", "His name is David Chen. If he calls, please tell him I'll meet him at 7.", "اسمش دیوید چن است. اگر زنگ زد، لطفاً بگویید ساعت ۷ می‌بینمش."),
            d("A", "I'll give him the message. Have a wonderful stay!", "پیام را به او می‌دهم. اقامت فوق‌العاده‌ای داشته باشید!")
        ),
        listOf(
            q("What kind of room does Ms. Miller have?", listOf("double room", "single room", "suite", "twin room"), 1),
            q("What's her room number?", listOf("312", "412", "512", "412"), 1),
            q("What time is checkout?", listOf("10 AM", "11 AM", "noon", "2 PM"), 2),
            q("What time does room service close?", listOf("at 10 PM", "at midnight", "it's 24 hours", "at 6 AM"), 2),
            q("When will the laundry be ready?", listOf("same day", "next evening", "next morning", "in two days"), 1),
            q("I ___ send some towels up right away.", listOf("will", "am", "do", "would"), 0),
            q("If you need anything, just ___ the front desk.", listOf("call", "will call", "called", "calling"), 0),
            q("Complete: I ___ meet him at 7.", listOf("will", "am", "do", "did"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Keep in mind", "در نظر داشتن", "I'll keep that in mind.", "در نظر خواهم داشت."),
            IdiomExpression("Right away", "همین الان", "I'll send some up right away.", "همین الان چند تا می‌فرستم بالا."),
            IdiomExpression("That's all for now", "فعلاً همین", "No, that's all for now.", "نه، فعلاً همین."),
            IdiomExpression("Enjoy your stay", "اقامت خوبی داشته باشید", "Enjoy your stay, Ms. Miller.", "اقامت خوبی داشته باشید، خانم میلر.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "check in", "پذیرش گرفتن", "register at a hotel",
                "We can check in after 2 PM.", "می‌توانیم بعد از ساعت ۲ پذیرش بگیریم.", "No"
            ),
            PhrasalVerb(
                "check out", "تسویه کردن", "leave a hotel after paying",
                "What time do we need to check out?", "چه ساعتی باید تسویه کنیم؟", "No"
            ),
            PhrasalVerb(
                "send up", "فرستادن بالا", "send something to a higher floor",
                "I'll send some up right away.", "همین الان چند تا می‌فرستم بالا.", "Yes"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Contractions with will", "Practice natural contractions: I'll, you'll, he'll, she'll, we'll, they'll."),
            PronunciationTip("Polite intonation in requests", "Requests with 'Could I...?' have gentle rising intonation: Could I see your ID? ↗")
        ),
        culture = listOf(
            CulturalNote(
                "Hotel etiquette",
                "In many hotels, it's customary to tip the bell service and housekeeping. Checkout times are usually around noon, but late checkout can often be arranged."
            ),
            CulturalNote(
                "Taking messages",
                "When leaving a message at a hotel, it's helpful to give the person's full name, room number, and a clear message. The front desk will usually confirm the message."
            )
        ),
        mistakes = listOf(
            CommonMistake("If you need anything, call the front desk. (without will)", "If you need anything, just call the front desk.", "In real conditional, the if-clause uses present tense and the main clause uses will or imperative."),
            CommonMistake("I will to send towels.", "I will send towels.", "After 'will', use the base verb without 'to'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What time is checkout and can it be extended?", "Checkout is at noon. A late checkout can be arranged if needed."),
            ComprehensionQuestion("How does the laundry service work?", "Put clothes in the laundry bag from the closet, fill out the form, and leave it at the front desk by 9 AM. It will be ready by the next evening.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Role-play checking into a hotel.",
                "نقش مهمان و کارمند پذیرش را بازی کنید.",
                "I have a reservation under... / Could I see...? / What time is checkout?"
            ),
            SpeakingTask(
                "Practice leaving a phone message at a hotel.",
                "تمرین کنید پیام تلفنی در هتل بگذارید.",
                "Could you take a message? / Please tell him... / I'll give him the message."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write an email to a hotel requesting information about amenities and services.",
                "یک ایمیل به هتل بنویس و درباره امکانات و خدمات سؤال کن.",
                150,
                "Use 'will' for future predictions and the real conditional for likely situations."
            )
        )
    )

       // ═══════════════════════════════════════════════════════════
    // UNIT 4 — Cars and Driving | ماشین و رانندگی
    // ═══════════════════════════════════════════════════════════
    private fun lesson4() = base(
        4, "Cars and Driving", "ماشین و رانندگی",
        listOf(
            "Discuss car features and parts",
            "Talk about driving habits and problems",
            "Use the past continuous vs simple past",
            "Use separable and inseparable phrasal verbs",
            "Describe a past driving experience"
        ),
        listOf(
            v("steering wheel", "فرمان", "Turn the steering wheel to the left.", "فرمان را به چپ بچرخان."),
            v("brake", "ترمز", "Press the brake to stop the car.", "برای توقف ماشین ترمز را فشار بده."),
            v("gas pedal", "پدال گاز", "The gas pedal makes the car go faster.", "پدال گاز ماشین را سریع‌تر می‌کند."),
            v("trunk", "صندوق عقب", "Put the luggage in the trunk.", "چمدان را در صندوق عقب بگذار."),
            v("hood", "کاپوت", "Open the hood to check the engine.", "کاپوت را باز کن تا موتور را بررسی کنی."),
            v("tire", "لاستیک", "The tire is flat.", "لاستیک پنچر است.", "adjective"),
            v("headlight", "چراغ جلو", "Turn on your headlights at night.", "شب چراغ‌های جلو را روشن کن."),
            v("seat belt", "کمربند ایمنی", "Always wear your seat belt.", "همیشه کمربند ایمنی ببند."),
            v("traffic jam", "راه‌بندان", "We were stuck in a traffic jam for an hour.", "یک ساعت در راه‌بندان گیر کردیم."),
            v("highway", "بزرگراه", "The highway was very busy this morning.", "بزرگراه امروز صبح خیلی شلوغ بود."),
            v("gas station", "پمپ بنزین", "We need to stop at a gas station.", "باید در پمپ بنزین توقف کنیم."),
            v("repair", "تعمیر کردن", "The mechanic repaired the engine.", "مکانیک موتور را تعمیر کرد.", "verb"),
            v("break down", "از کار افتادن", "Our car broke down on the highway.", "ماشین ما در بزرگراه از کار افتاد.", "verb"),
            v("pull over", "کنار کشیدن", "The police officer asked him to pull over.", "افسر پلیس از او خواست کنار بکشد.", "verb"),
            v("speeding", "سرعت غیرمجاز", "He got a ticket for speeding.", "او برای سرعت غیرمجاز جریمه شد.")
        ),
        listOf(
            GrammarSection(
                "Past Continuous vs Simple Past",
                "Use the past continuous for an action in progress and the simple past for a completed action or interruption. I was driving home when my phone rang."
            ),
            GrammarSection(
                "Separable phrasal verbs",
                "Some phrasal verbs can be separated: turn on the radio OR turn the radio on. When the object is a pronoun, it must go between: turn it on."
            ),
            GrammarSection(
                "Inseparable phrasal verbs",
                "Some phrasal verbs cannot be separated: get on the bus, NOT get the bus on. Look after the car, NOT look the car after."
            ),
            GrammarSection(
                "Conversation strategy: Showing concern and offering help",
                "Use expressions like 'That's too bad', 'I'm sorry to hear that', and 'Can I help you with anything?' to show concern and offer help."
            )
        ),
        listOf(
            d("A", "Hey, you look upset. What happened?", "سلام، ناراحت به نظر می‌رسی. چی شد؟"),
            d("B", "My car broke down on the highway this morning.", "ماشینم امروز صبح در بزرگراه از کار افتاد."),
            d("A", "Oh no! I'm sorry to hear that. What were you doing when it happened?", "اوه نه! متأسفم. وقتی این اتفاق افتاد چه کار می‌کردی؟"),
            d("B", "I was driving to work. Suddenly, the engine made a strange noise and stopped.", "داشتم به سر کار می‌رفتم. ناگهان موتور صدای عجیبی داد و خاموش شد."),
            d("A", "That's terrible. Did you pull over safely?", "وحشتناک است. ایمن کنار کشیدی؟"),
            d("B", "Yes, luckily. There wasn't much traffic at that time.", "بله، خوشبختانه. آن موقع ترافیک زیاد نبود."),
            d("A", "What did you do next?", "بعدش چه کار کردی؟"),
            d("B", "I called a tow truck. While I was waiting, I called my boss to explain.", "با یدک‌کش تماس گرفتم. وقتی منتظر بودم، به رئیسم زنگ زدم توضیح بدهم."),
            d("A", "Good thinking. So, what's wrong with the car?", "فکر خوبی بود. خب، ماشین چه مشکلی دارد؟"),
            d("B", "The mechanic said the battery is dead. He's replacing it now.", "مکانیک گفت باتری مرده است. الان دارد عوضش می‌کند."),
            d("A", "That's not too bad. At least it's not the engine.", "این خیلی بد نیست. حداقل موتور نیست."),
            d("B", "You're right. I was worried it would be something expensive.", "حق داری. نگران بودم چیز گرانی باشد."),
            d("A", "When will the car be ready?", "ماشین کی آماده می‌شود؟"),
            d("B", "The mechanic said it'll be ready by this afternoon.", "مکانیک گفت تا بعدازظهر آماده می‌شود."),
            d("A", "That's fast. Do you need a ride to pick it up?", "سریع است. برای بردنش سواری لازم داری؟"),
            d("B", "That would be great, actually. Thanks for offering.", "خیلی خوب می‌شود، در واقع. ممنون که پیشنهاد دادی."),
            d("A", "No problem. By the way, do you usually drive to work?", "مشکلی نیست. راستی، معمولاً با ماشین به سر کار می‌روی؟"),
            d("B", "Yes, I do. But I've been thinking about taking the bus sometimes.", "بله. ولی فکر می‌کنم گاهی با اتوبوس بروم."),
            d("A", "That could save money on gas. And it's better for the environment.", "می‌تواند در پول بنزین صرفه‌جویی کند. و برای محیط زیست بهتر است."),
            d("B", "Exactly. I was thinking about that when I saw the gas prices yesterday.", "دقیقاً. دیروز وقتی قیمت بنزین را دیدم به این فکر می‌کردم."),
            d("A", "Gas prices have gone up a lot this year, haven't they?", "قیمت بنزین امسال خیلی بالا رفته، نه؟"),
            d("B", "Yes, they have. It's getting expensive to drive everywhere.", "بله. رانندگی همه‌جا گران دارد می‌شود."),
            d("A", "Have you ever tried carpooling?", "تا حالا کارپولینگ (هم‌سفری) امتحان کرده‌ای؟"),
            d("B", "No, but a coworker mentioned it last week. Maybe I should look into it.", "نه، ولی یک همکار هفته پیش به آن اشاره کرد. شاید باید بررسی کنم."),
            d("A", "You should. It's good for saving money and the planet.", "باید بکنی. برای صرفه‌جویی پول و سیاره خوب است."),
            d("B", "I'll look into it. Well, I have to go pick up my car now.", "بررسی می‌کنم. خب، باید بروم ماشینم را بگیرم."),
            d("A", "Let me grab my keys and we'll go. See you in a minute.", "بگذار کلیدهایم را بردارم و برویم. یک دقیقه دیگر می‌بینمت."),
            d("B", "Thanks so much. You're a lifesaver.", "خیلی ممنون. نجات‌دهنده‌ای."),
            d("A", "Anytime! That's what friends are for.", "هر وقت! دوست برای همین است.")
        ),
        listOf(
            q("What happened to B's car?", listOf("flat tire", "dead battery", "broken engine", "ran out of gas"), 1),
            q("What was B doing when the car broke down?", listOf("driving to work", "driving home", "at the gas station", "parking"), 0),
            q("Who did B call first?", listOf("boss", "mechanic", "tow truck", "friend"), 2),
            q("When will the car be ready?", listOf("this morning", "this afternoon", "tomorrow", "next week"), 1),
            q("What was B doing when he saw the gas prices?", listOf("driving", "thinking about taking the bus", "at the gas station", "waiting in traffic"), 1),
            q("I ___ driving home when my phone rang.", listOf("was", "were", "am", "did"), 0),
            q("Turn ___ the radio.", listOf("on", "in", "at", "of"), 0),
            q("Get ___ the bus.", listOf("on", "in", "at", "of"), 0)
        ),
        idioms = listOf(
            IdiomExpression("I'm sorry to hear that", "متأسفم", "I'm sorry to hear that. What happened?", "متأسفم. چی شد؟"),
            IdiomExpression("Good thinking", "فکر خوبی بود", "Good thinking. So what's wrong?", "فکر خوبی بود. خب چه مشکلی هست؟"),
            IdiomExpression("You're a lifesaver", "نجات‌دهنده‌ای", "Thanks so much. You're a lifesaver.", "خیلی ممنون. نجات‌دهنده‌ای."),
            IdiomExpression("That's what friends are for", "دوست برای همین است", "Anytime! That's what friends are for.", "هر وقت! دوست برای همین است.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "break down", "از کار افتادن", "stop working (vehicle)",
                "My car broke down on the highway.", "ماشینم در بزرگراه از کار افتاد.", "No"
            ),
            PhrasalVerb(
                "pull over", "کنار کشیدن", "move a vehicle to the side",
                "The police officer asked him to pull over.", "افسر پلیس از او خواست کنار بکشد.", "No"
            ),
            PhrasalVerb(
                "pick up", "بردن / برداشتن", "collect someone or something",
                "I need to pick up my car.", "باید ماشینم را بردارم.", "Yes"
            ),
            PhrasalVerb(
                "look into", "بررسی کردن", "investigate",
                "I should look into carpooling.", "باید کارپولینگ را بررسی کنم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Past continuous stress", "Stress the -ing verb: I was DRIVing home when my phone rang."),
            PronunciationTip("Reduction in phrasal verbs", "In natural speech, phrasal verbs are often blended: pick it up → /pɪkɪt ʌp/")
        ),
        culture = listOf(
            CulturalNote(
                "Driving culture",
                "In many English-speaking countries, driving is a major part of daily life. Carpooling and public transportation are common topics of conversation about saving money and protecting the environment."
            ),
            CulturalNote(
                "Offering help",
                "Offering help like 'Do you need a ride?' is a common way to show friendship and support in many cultures."
            )
        ),
        mistakes = listOf(
            CommonMistake("I was drive home when...", "I was driving home when...", "After 'was/were', use verb-ing."),
            CommonMistake("Turn on it.", "Turn it on.", "When the object is a pronoun, it goes between the verb and the particle.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What was B doing when the car broke down?", "Driving to work when the engine made a strange noise."),
            ComprehensionQuestion("Why is B thinking about taking the bus?", "To save money on gas and help the environment.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Describe a past driving or travel experience.",
                "یک تجربه رانندگی یا سفر گذشته را توصیف کن.",
                "I was... when... / Suddenly... / I called..."
            ),
            SpeakingTask(
                "Discuss car-related problems and solutions with a partner.",
                "درباره مشکلات مرتبط با ماشین و راه‌حل‌ها با یک دوست صحبت کن.",
                "My car broke down... / What should I do? / You should..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a story about a driving problem you had.",
                "داستانی درباره یک مشکل رانندگی که داشته‌ای بنویس.",
                160,
                "Use past continuous and simple past together. Include at least two phrasal verbs."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 5 — Personal Care and Appearance | مراقبت شخصی و ظاهر
    // ═══════════════════════════════════════════════════════════
    private fun lesson5() = base(
        5, "Personal Care and Appearance", "مراقبت شخصی و ظاهر",
        listOf(
            "Discuss personal care and grooming",
            "Talk about appearance and style",
            "Use indefinite quantities (some/any, much/many)",
            "Use indefinite pronouns (someone/anyone)",
            "Describe a visit to a salon or barber"
        ),
        listOf(
            v("haircut", "کوتاهی مو", "I need to get a haircut.", "باید موهایم را کوتاه کنم."),
            v("hairstyle", "مدل مو", "She has a beautiful hairstyle.", "او مدل موی زیبایی دارد."),
            v("barber", "آرایشگر مردانه", "The barber cut my hair short.", "آرایشگر موهایم را کوتاه کرد."),
            v("salon", "سالن زیبایی", "She goes to the salon every month.", "او هر ماه به سالن زیبایی می‌رود."),
            v("makeup", "آرایش", "She wears light makeup every day.", "او هر روز آرایش سبک دارد."),
            v("manicure", "مانیکور", "I'm getting a manicure this afternoon.", "امروز بعدازظهر مانیکور می‌کنم."),
            v("pedicure", "پدیکور", "The salon offers manicures and pedicures.", "سالن مانیکور و پدیکور ارائه می‌دهد."),
            v("shave", "اصلاح کردن", "He shaves every morning.", "او هر روز صبح اصلاح می‌کند.", "verb"),
            v("beard", "ریش", "He's growing a beard.", "او دارد ریش می‌گذارد."),
            v("mustache", "سبیل", "He has a thick mustache.", "او سبیل پرپشتی دارد."),
            v("nail", "ناخن", "She painted her nails red.", "او ناخن‌هایش را قرمز کرد."),
            v("skin", "پوست", "She has beautiful skin.", "او پوست زیبایی دارد."),
            v("facial", "فیشال / پاکسازی صورت", "She gets a facial every month.", "او هر ماه فیشال می‌کند."),
            v("appearance", "ظاهر", "Appearance is important in some jobs.", "در برخی مشاغل ظاهر مهم است."),
            v("grooming", "آراستگی", "Good grooming is part of professional image.", "آراستگی بخشی از تصویر حرفه‌ای است.")
        ),
        listOf(
            GrammarSection(
                "Indefinite quantities: some, any, much, many",
                "Use 'some' in affirmative sentences, 'any' in questions and negatives, 'much' with non-count nouns, and 'many' with count nouns. I need some shampoo. Do you have any? I don't have much time. I have many appointments."
            ),
            GrammarSection(
                "Indefinite pronouns: someone, anyone, no one, everyone",
                "Use indefinite pronouns to refer to people without naming them. Someone called you. Is anyone here? No one knows. Everyone is ready."
            ),
            GrammarSection(
                "Comparisons with as...as",
                "Use 'as...as' to say two things are equal: Her hair is as long as mine. He's not as tall as his brother."
            ),
            GrammarSection(
                "Conversation strategy: Complimenting",
                "Use compliments to make people feel good. 'I love your haircut!', 'That color looks great on you', 'You look fantastic!'"
            )
        ),
        listOf(
            d("A", "Hi! I love your new haircut. It looks great!", "سلام! عاشق مدل موی جدیدت هستم. عالی به نظر می‌رسد!"),
            d("B", "Thanks! I got it done yesterday at a new salon.", "ممنون! دیروز در یک سالن جدید انجامش دادم."),
            d("A", "Really? Which one?", "واقعاً؟ کدام یکی؟"),
            d("B", "The one on Oak Street. Someone recommended it to me.", "همان در خیابان اوک. یک نفر توصیه‌اش کرد."),
            d("A", "How was it?", "چطور بود؟"),
            d("B", "It was great. They offer many services — haircuts, manicures, facials, you name it.", "عالی بود. خدمات زیادی ارائه می‌دهند — کوتاهی مو، مانیکور، فیشال، هر چه بگویی."),
            d("A", "Wow, do they have any special deals?", "واو، پیشنهاد خاصی دارند؟"),
            d("B", "Yes, actually. If you go on weekdays, there's a discount.", "بله، در واقع. اگر روزهای هفته بروی، تخفیف دارد."),
            d("A", "That's good to know. I've been looking for a new place.", "خوب است که می‌دانم. داشتم دنبال جای جدیدی می‌گشتم."),
            d("B", "You should try it. The stylist was very professional.", "باید امتحان کنی. آرایشگر خیلی حرفه‌ای بود."),
            d("A", "What did you get done?", "چه کاری انجام دادی؟"),
            d("B", "Just a haircut and a manicure. I didn't have much time.", "فقط کوتاهی مو و مانیکور. وقت زیادی نداشتم."),
            d("A", "How long did it take?", "چقدر طول کشید؟"),
            d("B", "About two hours. They also gave me some free samples.", "حدود دو ساعت. چند نمونه رایگان هم دادند."),
            d("A", "Nice! What kind of samples?", "عالی! چه نوع نمونه‌هایی؟"),
            d("B", "Shampoo and skin cream. The shampoo is really good.", "شامپو و کرم پوست. شامپو واقعاً خوب است."),
            d("A", "I've been meaning to try a new shampoo. Mine isn't working well.", "می‌خواستم شامپوی جدید امتحان کنم. مال من خوب کار نمی‌کند."),
            d("B", "You should try this one. It made my hair much softer.", "باید این را امتحان کنی. موهایم را خیلی نرم‌تر کرد."),
            d("A", "Where can I buy it?", "از کجا می‌توانم بخرمش؟"),
            d("B", "They sell it at the salon. Or you can order it online.", "در سالن می‌فروشند. یا می‌توانی آنلاین سفارش بدهی."),
            d("A", "Great. I'll check it out. By the way, do you ever get facials?", "عالی. بررسی می‌کنم. راستی، تا حالا فیشال کرده‌ای؟"),
            d("B", "Yes, I do. I get one every month. They're very relaxing.", "بله. هر ماه یکی می‌کنم. خیلی آرامش‌بخش هستند."),
            d("A", "Does anyone at the salon do a good job?", "کسی در سالن کارش خوب است؟"),
            d("B", "Yes, everyone there is very skilled. Ask for Maria — she's excellent.", "بله، همه آنجا خیلی ماهر هستند. از ماریا بخواه — او عالی است."),
            d("A", "I'll do that. Thanks for the recommendation!", "این کار را می‌کنم. ممنون برای توصیه!"),
            d("B", "Anytime! Let me know how it goes.", "هر وقت! خبرم کن چطور شد."),
            d("A", "I will. See you later!", "می‌کنم. بعداً می‌بینمت!")
        ),
        listOf(
            q("Where did B get her haircut?", listOf("a salon on Oak Street", "a barber shop", "at home", "a mall"), 0),
            q("What does B say about the salon's services?", listOf("they only do haircuts", "they have many services", "they're expensive", "they're slow"), 1),
            q("What samples did B receive?", listOf("makeup and perfume", "shampoo and skin cream", "nail polish", "hair gel"), 1),
            q("Who does B recommend at the salon?", listOf("Anna", "Maria", "Lisa", "Sarah"), 1),
            q("I don't have ___ time today.", listOf("many", "much", "some", "any"), 1),
            q("She has ___ appointments this week.", listOf("much", "many", "any", "a little"), 1),
            q("___ called you while you were out.", listOf("Someone", "Anyone", "No one", "Everyone"), 0),
            q("Is ___ here?", listOf("someone", "anyone", "no one", "everyone"), 1)
        ),
        idioms = listOf(
            IdiomExpression("You name it", "هر چه بگویی", "They offer many services — haircuts, manicures, you name it.", "خدمات زیادی ارائه می‌دهند — کوتاهی مو، مانیکور، هر چه بگویی."),
            IdiomExpression("Good to know", "خوب است که بدانم", "That's good to know. I've been looking for a new place.", "خوب است که می‌دانم. داشتم دنبال جای جدیدی می‌گشتم."),
            IdiomExpression("Check it out", "بررسی کردن", "I'll check it out.", "بررسی می‌کنم."),
            IdiomExpression("Meaning to", "قصد داشتن", "I've been meaning to try a new shampoo.", "می‌خواستم شامپوی جدید امتحان کنم.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "get done", "انجام دادن", "complete a service",
                "I got my hair done yesterday.", "دیروز موهایم را انجام دادم.", "No"
            ),
            PhrasalVerb(
                "look for", "دنبال گشتن", "search for",
                "I've been looking for a new place.", "داشتم دنبال جای جدیدی می‌گشتم.", "No"
            ),
            PhrasalVerb(
                "check out", "بررسی کردن", "investigate or try",
                "I'll check it out.", "بررسی می‌کنم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Some vs any reduction", "In natural speech, 'some' is often reduced to /səm/: some samples → /səm ˈsæmpəlz/"),
            PronunciationTip("Stress in compliments", "Stress the adjective: Your haircut looks GREAT!")
        ),
        culture = listOf(
            CulturalNote(
                "Personal care and appearance",
                "In many English-speaking countries, personal grooming is considered part of professional image. Complimenting someone's appearance is generally appreciated but should be done politely and appropriately."
            ),
            CulturalNote(
                "Tipping at salons",
                "In some countries, it's customary to tip hairdressers and stylists, usually 15-20% of the service cost."
            )
        ),
        mistakes = listOf(
            CommonMistake("I don't have many time.", "I don't have much time.", "Use 'much' with non-count nouns like time."),
            CommonMistake("Anyone is here.", "Someone is here.", "Use 'someone' in affirmative statements about a specific but unnamed person.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What services does the salon offer?", "Haircuts, manicures, facials, and more."),
            ComprehensionQuestion("What does B recommend about the salon?", "Try the shampoo, get a facial, and ask for Maria.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Describe your personal grooming routine.",
                "روال آراستگی شخصی‌ات را توصیف کن.",
                "I usually... / I get a haircut every... / I never..."
            ),
            SpeakingTask(
                "Give a compliment to a partner and explain why.",
                "به یک دوست تعریف کن و دلیلش را بگو.",
                "I love your... / That color looks great on you / You look fantastic!"
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a review of a salon or barber shop you've visited.",
                "نقدی از یک سالن زیبایی یا آرایشگاه که رفته‌ای بنویس.",
                160,
                "Use indefinite quantities (some/any, much/many) and indefinite pronouns."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 6 — Eating Well | خوب غذا خوردن
    // ═══════════════════════════════════════════════════════════
    private fun lesson6() = base(
        6, "Eating Well", "خوب غذا خوردن",
        listOf(
            "Discuss food and nutrition",
            "Talk about healthy eating habits",
            "Use quantifiers (too many, too much, enough)",
            "Use count and non-count nouns correctly",
            "Give advice about diet and health"
        ),
        listOf(
            v("nutrition", "تغذیه", "Good nutrition is important for health.", "تغذیه خوب برای سلامتی مهم است."),
            v("diet", "رژیم غذایی", "She's on a healthy diet.", "او رژیم غذایی سالمی دارد."),
            v("calorie", "کالری", "This meal has too many calories.", "این غذا کالری زیادی دارد."),
            v("protein", "پروتئین", "Meat and beans are good sources of protein.", "گوشت و حبوبات منابع خوب پروتئین هستند."),
            v("carbohydrate", "کربوهیدرات", "Bread and rice are carbohydrates.", "نان و برنج کربوهیدرات هستند."),
            v("vitamin", "ویتامین", "Fruits are rich in vitamins.", "میوه‌ها سرشار از ویتامین هستند."),
            v("fiber", "فیبر", "Vegetables are high in fiber.", "سبزیجات فیبر زیادی دارند."),
            v("processed food", "غذای فرآوری‌شده", "Too much processed food is bad for you.", "غذای فرآوری‌شده زیاد برایت بد است."),
            v("organic", "ارگانیک", "Organic vegetables are more expensive.", "سبزیجات ارگانیک گران‌تر هستند.", "adjective"),
            v("portion", "وعده / سهم", "The portions at this restaurant are huge.", "وعده‌های این رستوران بزرگ هستند."),
            v("ingredient", "ماده تشکیل‌دهنده", "What are the ingredients in this soup?", "مواد تشکیل‌دهنده این سوپ چیست؟"),
            v("balanced", "متعادل", "A balanced diet includes many food groups.", "رژیم متعادل شامل گروه‌های غذایی زیادی است.", "adjective"),
            v("overweight", "اضافه وزن", "He's a little overweight.", "او کمی اضافه وزن دارد.", "adjective"),
            v("cut down", "کم کردن", "I need to cut down on sugar.", "باید شکر را کم کنم.", "verb"),
            v("give up", "ترک کردن", "She gave up fast food last year.", "او سال گذشته فست‌فود را ترک کرد.", "verb")
        ),
        listOf(
            GrammarSection(
                "Count vs Non-count nouns",
                "Count nouns can be counted (an apple, two apples). Non-count nouns cannot (rice, water, sugar). Use 'much' with non-count and 'many' with count nouns."
            ),
            GrammarSection(
                "Quantifiers: too much, too many, enough",
                "Use 'too much' with non-count nouns, 'too many' with count nouns, and 'enough' with both. I eat too much sugar. He has too many snacks. I don't drink enough water."
            ),
            GrammarSection(
                "Advice with should/shouldn't",
                "Use 'should' for advice: You should eat more vegetables. You shouldn't skip breakfast."
            ),
            GrammarSection(
                "Conversation strategy: Giving advice",
                "Use expressions like 'You should...', 'Why don't you...?', 'Have you tried...?', and 'It might help if...' to give friendly advice."
            )
        ),
        listOf(
            d("A", "You look great! Have you been exercising?", "عالی به نظر می‌رسی! ورزش می‌کنی؟"),
            d("B", "Thanks! Yes, I've been going to the gym three times a week.", "ممنون! بله، هفته‌ای سه بار به باشگاه می‌روم."),
            d("A", "That's impressive. Have you changed your diet too?", "تحسین‌برانگیز است. رژیم غذاییت را هم تغییر داده‌ای؟"),
            d("B", "Yes, I have. I've cut down on sugar and processed food.", "بله. شکر و غذای فرآوری‌شده را کم کرده‌ام."),
            d("A", "That's really smart. What do you usually eat now?", "واقعاً هوشمندانه است. الان معمولاً چه می‌خوری؟"),
            d("B", "I eat a lot of vegetables, fruits, and whole grains. I also eat more protein.", "سبزیجات، میوه‌ها و غلات کامل زیاد می‌خورم. پروتئین هم بیشتر می‌خورم."),
            d("A", "Do you ever eat fast food?", "تا حالا فست‌فود می‌خوری؟"),
            d("B", "Very rarely. Maybe once a month. I gave up fast food mostly.", "خیلی به‌ندرت. شاید ماهی یک بار. بیشتر فست‌فود را ترک کردم."),
            d("A", "Wow, that must have been hard.", "واو، این باید سخت بوده باشد."),
            d("B", "It was at first. But now I don't miss it much.", "اولش سخت بود. ولی حالا زیاد دلم نمی‌خواهد."),
            d("A", "How much water do you drink every day?", "هر روز چقدر آب می‌نوشی؟"),
            d("B", "About two liters. I used to drink too much coffee, but now I mostly drink water.", "حدود دو لیتر. قبلاً قهوه زیاد می‌نوشیدم، ولی حالا بیشتر آب می‌نوشم."),
            d("A", "That's great. Do you eat enough vegetables?", "عالی. سبزیجات کافی می‌خوری؟"),
            d("B", "I think so. I try to eat vegetables with every meal.", "فکر می‌کنم بله. سعی می‌کنم با هر وعده سبزیجات بخورم."),
            d("A", "Do you take any vitamins or supplements?", "ویتامین یا مکمل مصرف می‌کنی؟"),
            d("B", "Yes, I take vitamin D and B12. My doctor recommended them.", "بله، ویتامین D و B12 مصرف می‌کنم. پزشکم توصیه کرد."),
            d("A", "That's smart. I've been thinking about my diet too.", "هوشمندانه است. من هم به رژیمم فکر کرده‌ام."),
            d("B", "You should try it. Small changes make a big difference.", "باید امتحان کنی. تغییرات کوچک تفاوت بزرگی ایجاد می‌کنند."),
            d("A", "What's the first thing I should change?", "اولین چیزی که باید تغییر دهم چیست؟"),
            d("B", "Why don't you start by drinking more water and eating more vegetables?", "چرا با نوشیدن آب بیشتر و خوردن سبزیجات بیشتر شروع نمی‌کنی؟"),
            d("A", "That sounds doable. Anything else?", "شدنی به نظر می‌رسد. چیز دیگری؟"),
            d("B", "Try to sleep enough too. Sleep is important for health.", "سعی کن خواب کافی هم داشته باشی. خواب برای سلامتی مهم است."),
            d("A", "You're right. I don't get enough sleep.", "حق داری. خواب کافی ندارم."),
            d("B", "Have you tried going to bed at the same time every night?", "تا حالا امتحان کرده‌ای هر شب ساعت ثابتی بخوابی؟"),
            d("A", "No, I haven't. Maybe I should try.", "نه. شاید باید امتحان کنم."),
            d("B", "It might help. Let me know how it goes.", "ممکن است کمک کند. خبرم کن چطور شد."),
            d("A", "I will. Thanks for the advice!", "می‌کنم. ممنون برای توصیه!"),
            d("B", "Anytime! Good luck!", "هر وقت! موفق باشی!")
        ),
        listOf(
            q("How often does B go to the gym?", listOf("once a week", "twice a week", "three times a week", "every day"), 2),
            q("What has B cut down on?", listOf("vegetables", "sugar and processed food", "water", "protein"), 1),
            q("How often does B eat fast food?", listOf("never", "once a month", "once a week", "every day"), 1),
            q("What vitamins does B take?", listOf("A and C", "D and B12", "E and K", "calcium"), 1),
            q("I eat ___ sugar.", listOf("too many", "too much", "many", "enough"), 1),
            q("He has ___ snacks.", listOf("too much", "too many", "much", "enough"), 1),
            q("You ___ eat more vegetables.", listOf("should", "are", "do", "have"), 0),
            q("You shouldn't ___ breakfast.", listOf("skip", "to skip", "skipping", "skipped"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Cut down on", "کم کردن", "I've cut down on sugar.", "شکر را کم کرده‌ام."),
            IdiomExpression("Give up", "ترک کردن", "I gave up fast food.", "فست‌فود را ترک کردم."),
            IdiomExpression("Make a difference", "تفاوت ایجاد کردن", "Small changes make a big difference.", "تغییرات کوچک تفاوت بزرگی ایجاد می‌کنند."),
            IdiomExpression("At first", "اولش", "It was hard at first.", "اولش سخت بود.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "cut down on", "کم کردن", "reduce the amount",
                "I've cut down on sugar.", "شکر را کم کرده‌ام.", "No"
            ),
            PhrasalVerb(
                "give up", "ترک کردن", "stop doing something",
                "I gave up fast food.", "فست‌فود را ترک کردم.", "Yes"
            ),
            PhrasalVerb(
                "start by", "شروع کردن با", "begin with",
                "Why don't you start by drinking more water?", "چرا با نوشیدن آب بیشتر شروع نمی‌کنی؟", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Much vs many", "Practice the vowel sound difference: much /mʌtʃ/, many /ˈmɛni/"),
            PronunciationTip("Stress in quantifiers", "Stress 'too' in 'too much' and 'too many': TOO MUCH sugar, TOO MANY snacks.")
        ),
        culture = listOf(
            CulturalNote(
                "Healthy eating",
                "In many English-speaking countries, there's growing awareness about nutrition and healthy eating. Discussions about diets, organic food, and exercise are common."
            ),
            CulturalNote(
                "Giving advice",
                "When giving health advice, it's polite to use softer expressions like 'Have you tried...?' or 'Why don't you...?' rather than direct commands."
            )
        ),
        mistakes = listOf(
            CommonMistake("I eat too many sugar.", "I eat too much sugar.", "Use 'too much' with non-count nouns like sugar."),
            CommonMistake("You should to eat more vegetables.", "You should eat more vegetables.", "After 'should', use the base verb without 'to'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What changes has B made to their diet and lifestyle?", "Exercises three times a week, cut down on sugar and processed food, drinks water, takes vitamins, gave up fast food."),
            ComprehensionQuestion("What advice does B give to A?", "Start with more water and vegetables, sleep enough, try going to bed at the same time.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Discuss your eating habits with a partner.",
                "درباره عادات غذایی‌ات با یک دوست صحبت کن.",
                "I usually eat... / I've cut down on... / I should eat more..."
            ),
            SpeakingTask(
                "Give advice to a partner about healthy living.",
                "به یک دوست درباره زندگی سالم توصیه کن.",
                "You should... / Why don't you...? / Have you tried...?"
            )
        ),
        writing = listOf(
            WritingTask(
                "Write about your eating habits and one change you'd like to make.",
                "درباره عادات غذایی‌ات و یک تغییری که دوست داری ایجاد کنی بنویس.",
                160,
                "Use quantifiers (too much, too many, enough) and give advice to yourself."
            )
        )
    )

       // ═══════════════════════════════════════════════════════════
    // UNIT 7 — Psychology and Personality | روانشناسی و شخصیت
    // ═══════════════════════════════════════════════════════════
    private fun lesson7() = base(
        7, "Psychology and Personality", "روانشناسی و شخصیت",
        listOf(
            "Describe personality types and traits",
            "Discuss psychology and behavior",
            "Use adjective clauses with who, which, and that",
            "Use descriptive adjectives for personality",
            "Talk about first impressions"
        ),
        listOf(
            v("personality", "شخصیت", "She has a very outgoing personality.", "او شخصیت خیلی اجتماعی دارد."),
            v("outgoing", "اجتماعی", "He's very outgoing and makes friends easily.", "او خیلی اجتماعی است و راحت دوست پیدا می‌کند.", "adjective"),
            v("introverted", "درون‌گرا", "Introverted people often enjoy alone time.", "افراد درون‌گرا اغلب از تنهایی لذت می‌برند.", "adjective"),
            v("extroverted", "برون‌گرا", "Extroverted people love being around others.", "افراد برون‌گرا عاشق بودن در جمع هستند.", "adjective"),
            v("optimistic", "خوش‌بین", "She's always optimistic about the future.", "او همیشه درباره آینده خوش‌بین است.", "adjective"),
            v("pessimistic", "بدبین", "He's a bit pessimistic about his chances.", "او کمی درباره شانس‌هایش بدبین است.", "adjective"),
            v("generous", "سخاوتمند", "She's very generous with her time.", "او با وقتش خیلی سخاوتمند است.", "adjective"),
            v("stubborn", "لجباز", "He's too stubborn to change his mind.", "او برای تغییر نظرش خیلی لجباز است.", "adjective"),
            v("reliable", "قابل اعتماد", "You can count on her — she's very reliable.", "می‌توانی رویش حساب کنی — خیلی قابل اعتماد است.", "adjective"),
            v("sensitive", "حساس", "He's sensitive to criticism.", "او به انتقاد حساس است.", "adjective"),
            v("confident", "با اعتماد به نفس", "She feels confident when she speaks English.", "او وقتی انگلیسی صحبت می‌کند با اعتماد به نفس است.", "adjective"),
            v("first impression", "برداشت اول", "First impressions are often wrong.", "برداشت‌های اول اغلب اشتباه هستند."),
            v("behavior", "رفتار", "His behavior surprised everyone.", "رفتارش همه را غافلگیر کرد."),
            v("trait", "ویژگی", "Patience is an important trait.", "صبر یک ویژگی مهم است."),
            v("psychology", "روانشناسی", "She's studying psychology at university.", "او در دانشگاه روانشناسی می‌خواند.")
        ),
        listOf(
            GrammarSection(
                "Adjective clauses with who",
                "Use 'who' to describe people: The man who helped me was very kind. She's the person who always listens."
            ),
            GrammarSection(
                "Adjective clauses with which and that",
                "Use 'which' for things and 'that' for people or things: The book which I read was amazing. The person that called was my boss."
            ),
            GrammarSection(
                "Subject vs object relative clauses",
                "In subject clauses, the relative pronoun is the subject: The woman who lives next door is a doctor. In object clauses, the relative pronoun is the object and can often be omitted: The movie (that) I saw was great."
            ),
            GrammarSection(
                "Conversation strategy: Describing people",
                "Use adjective clauses to describe people naturally: He's the kind of person who always helps others. She's someone who never gives up."
            )
        ),
        listOf(
            d("A", "I met the new manager today. She seems very confident.", "امروز مدیر جدید را دیدم. خیلی با اعتماد به نفس به نظر می‌رسد."),
            d("B", "Really? What's she like?", "واقعاً؟ چطور است؟"),
            d("A", "She's the kind of person who always knows what to say.", "او از آن افرادی است که همیشه می‌داند چه بگوید."),
            d("B", "That's a great trait for a manager. Is she outgoing?", "این ویژگی خوبی برای یک مدیر است. اجتماعی است؟"),
            d("A", "Very. She's much more extroverted than the last manager.", "خیلی. او خیلی برون‌گراتر از مدیر قبلی است."),
            d("B", "That's interesting. What about her leadership style?", "جالب است. سبک رهبری‌اش چطور؟"),
            d("A", "She's someone who listens carefully before making decisions.", "او کسی است که قبل از تصمیم‌گیری با دقت گوش می‌دهد."),
            d("B", "That's a good sign. Some managers just tell people what to do.", "نشانه خوبی است. برخی مدیران فقط به مردم می‌گویند چه کار کنند."),
            d("A", "Exactly. She also seems very reliable.", "دقیقاً. او همچنین خیلی قابل اعتماد به نظر می‌رسد."),
            d("B", "How about her personality outside of work?", "شخصیتش خارج از کار چطور؟"),
            d("A", "I don't know her well yet, but my first impression is positive.", "هنوز خوب نمی‌شناسمش، ولی برداشت اولم مثبت است."),
            d("B", "First impressions can be misleading, though.", "ولی برداشت‌های اول می‌توانند گمراه‌کننده باشند."),
            d("A", "That's true. Someone who seems shy might actually be very friendly.", "درست است. کسی که خجالتی به نظر می‌رسد ممکن است در واقع خیلی خوش‌برخورد باشد."),
            d("B", "Right. My best friend seemed cold when I first met her.", "درست. بهترین دوستم وقتی اول دیدمش سرد به نظر می‌رسید."),
            d("A", "Really? What changed your mind?", "واقعاً؟ چه چیزی نظرت را عوض کرد؟"),
            d("B", "We worked on a project together. She's actually the most generous person I know.", "با هم روی یک پروژه کار کردیم. او در واقع سخاوتمندترین کسی است که می‌شناسم."),
            d("A", "That's a good example. Some people are just slow to open up.", "مثال خوبی است. برخی افراد فقط دیر باز می‌شوند."),
            d("B", "Exactly. Now what about you? Are you more introverted or extroverted?", "دقیقاً. حالا تو چطور؟ درون‌گراتری یا برون‌گرا؟"),
            d("A", "I think I'm in the middle. I enjoy being with people, but I also need alone time.", "فکر می‌کنم در میانه هستم. از بودن با مردم لذت می‌برم، ولی به تنهایی هم نیاز دارم."),
            d("B", "That's actually called being an ambivert.", "این در واقع ambivert (میان‌گرا) نامیده می‌شود."),
            d("A", "I didn't know that. Is that common?", "این را نمی‌دانستم. رایج است؟"),
            d("B", "Very common, actually. Most people aren't purely one or the other.", "در واقع خیلی رایج. بیشتر مردم کاملاً یکی یا دیگری نیستند."),
            d("A", "That makes sense. Our personalities are more complex than simple labels.", "منطقی است. شخصیت‌های ما پیچیده‌تر از برچسب‌های ساده هستند."),
            d("B", "Exactly. Psychologists say personality is a mix of many traits.", "دقیقاً. روانشناسان می‌گویند شخصیت ترکیبی از ویژگی‌های زیادی است."),
            d("A", "I'd like to read more about that.", "دوست دارم بیشتر درباره‌اش بخوانم."),
            d("B", "I can recommend a good book that explains it well.", "می‌توانم کتاب خوبی توصیه کنم که خوب توضیحش می‌دهد."),
            d("A", "That would be great. Thanks!", "عالی می‌شود. ممنون!"),
            d("B", "Anytime. Let me know what you think after you read it.", "هر وقت. بعد از خواندن خبرم کن چه فکر می‌کنی.")
        ),
        listOf(
            q("How does A describe the new manager?", listOf("shy and quiet", "confident and outgoing", "strict and serious", "unfriendly"), 1),
            q("What trait does A say the manager has?", listOf("stubborn", "reliable", "pessimistic", "sensitive"), 1),
            q("What did B think of her best friend at first?", listOf("friendly", "generous", "cold", "funny"), 2),
            q("What is an ambivert?", listOf("purely introverted", "purely extroverted", "a mix of both", "neither"), 2),
            q("She's the person ___ always listens.", listOf("which", "who", "whose", "whom"), 1),
            q("The book ___ I read was amazing.", listOf("who", "which", "whose", "whom"), 1),
            q("The woman ___ lives next door is a doctor.", listOf("who", "which", "whose", "where"), 0),
            q("He's someone ___ never gives up.", listOf("which", "who", "whose", "whom"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Open up", "باز شدن", "Some people are just slow to open up.", "برخی افراد فقط دیر باز می‌شوند."),
            IdiomExpression("In the middle", "در میانه", "I'm in the middle — I enjoy both.", "در میانه هستم — از هر دو لذت می‌برم."),
            IdiomExpression("Make sense", "منطقی بودن", "That makes sense.", "منطقی است."),
            IdiomExpression("Change your mind", "نظرت را عوض کردن", "What changed your mind?", "چه چیزی نظرت را عوض کرد؟")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "open up", "باز شدن", "become more friendly or talkative",
                "Some people are slow to open up.", "برخی افراد دیر باز می‌شوند.", "No"
            ),
            PhrasalVerb(
                "count on", "حساب کردن روی", "rely on someone",
                "You can count on her.", "می‌توانی رویش حساب کنی.", "No"
            ),
            PhrasalVerb(
                "give up", "تسلیم شدن", "stop trying",
                "She's someone who never gives up.", "او کسی است که هرگز تسلیم نمی‌شود.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Reduction of 'who'", "In natural speech, 'who' is often reduced: the person who → /ðə ˈpɜrsən u/"),
            PronunciationTip("Adjective clause rhythm", "Adjective clauses are usually said without pauses: the man who called me.")
        ),
        culture = listOf(
            CulturalNote(
                "Personality and culture",
                "Ideas about personality vary across cultures. In some cultures, being outgoing is valued; in others, being reserved is more respected. Understanding these differences helps avoid misunderstandings."
            ),
            CulturalNote(
                "First impressions",
                "It's commonly said that first impressions are formed within seconds, but psychologists remind us they can be misleading. Getting to know someone takes time."
            )
        ),
        mistakes = listOf(
            CommonMistake("The person which called me was my boss.", "The person who called me was my boss.", "Use 'who' for people, not 'which'."),
            CommonMistake("The book who I read.", "The book which/that I read.", "Use 'which' or 'that' for things, not 'who'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How does A describe the new manager's personality?", "Confident, outgoing, reliable, and someone who listens carefully."),
            ComprehensionQuestion("What is B's opinion about first impressions?", "They can be misleading — her best friend seemed cold at first but is actually generous.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Describe a person you admire using adjective clauses.",
                "کسی که تحسین می‌کنی را با جملات وصفی توصیف کن.",
                "He/She is someone who... / He/She is the kind of person who..."
            ),
            SpeakingTask(
                "Discuss your own personality type with a partner.",
                "درباره نوع شخصیت خودت با یک دوست صحبت کن.",
                "I'm more introverted/extroverted... / I enjoy... / I need..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a description of someone you know well.",
                "توصیفی از کسی که خوب می‌شناسی بنویس.",
                170,
                "Use at least three adjective clauses with who, which, or that."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 8 — Enjoying the Arts | لذت بردن از هنر
    // ═══════════════════════════════════════════════════════════
    private fun lesson8() = base(
        8, "Enjoying the Arts", "لذت بردن از هنر",
        listOf(
            "Discuss different forms of art",
            "Talk about artists and their work",
            "Use the passive voice in the present and past",
            "Describe a work of art",
            "Express opinions about art"
        ),
        listOf(
            v("painting", "نقاشی", "The painting sold for millions.", "نقاشی به قیمت میلیون‌ها فروخته شد."),
            v("sculpture", "مجسمه", "The sculpture is made of marble.", "مجسمه از سنگ مرمر ساخته شده است."),
            v("portrait", "پرتره", "The artist painted a portrait of the queen.", "هنرمند پرتره‌ای از ملکه کشید."),
            v("landscape", "منظره", "He specializes in landscape paintings.", "او در نقاشی‌های منظره تخصص دارد."),
            v("gallery", "گالری", "We visited an art gallery yesterday.", "دیروز از یک گالری هنری بازدید کردیم."),
            v("exhibition", "نمایشگاه", "The exhibition opens next Friday.", "نمایشگاه جمعه آینده افتتاح می‌شود."),
            v("masterpiece", "شاهکار", "This is considered his masterpiece.", "این شاهکار او محسوب می‌شود."),
            v("abstract", "انتزاعی", "Abstract art doesn't show real objects.", "هنر انتزاعی اشیاء واقعی را نشان نمی‌دهد.", "adjective"),
            v("realistic", "واقع‌گرا", "The painting is very realistic.", "نقاشی خیلی واقع‌گرا است.", "adjective"),
            v("creative", "خلاق", "Artists are usually very creative people.", "هنرمندان معمولاً افراد خیلی خلاقی هستند.", "adjective"),
            v("inspire", "الهام بخشیدن", "Great art inspires people.", "هنر بزرگ به مردم الهام می‌بخشد.", "verb"),
            v("exhibit", "به نمایش گذاشتن", "The museum exhibits ancient art.", "موزه هنر باستانی را به نمایش می‌گذارد.", "verb"),
            v("artist", "هنرمند", "The artist was born in 1880.", "هنرمند در سال ۱۸۸۰ متولد شد."),
            v("work of art", "اثر هنری", "This is a remarkable work of art.", "این یک اثر هنری قابل توجه است."),
            v("critic", "منتقد", "The critic praised the new exhibition.", "منتقد از نمایشگاه جدید تعریف کرد.")
        ),
        listOf(
            GrammarSection(
                "Passive voice: present tense",
                "Use the passive to focus on the action rather than the doer. Form: be + past participle. The painting is displayed in the gallery. Art is appreciated by many people."
            ),
            GrammarSection(
                "Passive voice: past tense",
                "Use was/were + past participle for past passive. The sculpture was created in 1900. The paintings were sold at auction."
            ),
            GrammarSection(
                "Passive with by",
                "Use 'by' to say who performed the action: The Mona Lisa was painted by Leonardo da Vinci. The song was written by a famous composer."
            ),
            GrammarSection(
                "Conversation strategy: Expressing opinions about art",
                "Use expressions like 'In my opinion...', 'I think...', 'It seems to me...', and 'I'm not sure I agree' to discuss art respectfully."
            )
        ),
        listOf(
            d("A", "Have you seen the new exhibition at the city gallery?", "نمایشگاه جدید در گالری شهر را دیده‌ای؟"),
            d("B", "Not yet. What's it about?", "هنوز نه. درباره چیست؟"),
            d("A", "It's a collection of paintings that were created in the 1920s.", "مجموعه‌ای از نقاشی‌هاست که در دهه ۱۹۲۰ خلق شده‌اند."),
            d("B", "Interesting. Who were they painted by?", "جالب است. توسط چه کسی نقاشی شده‌اند؟"),
            d("A", "They were painted by a group of artists who lived in Paris.", "توسط گروهی از هنرمندان که در پاریس زندگی می‌کردند نقاشی شده‌اند."),
            d("B", "Sounds fascinating. What kind of paintings are they?", "شگفت‌انگیز به نظر می‌رسد. چه نوع نقاشی‌هایی هستند؟"),
            d("A", "There are landscapes and portraits. Some are realistic, and some are more abstract.", "منظره و پرتره هستند. برخی واقع‌گرا و برخی انتزاعی‌تر."),
            d("B", "I usually prefer realistic art. Is it worth seeing?", "معمولاً هنر واقع‌گرا را ترجیح می‌دهم. ارزش دیدن دارد؟"),
            d("A", "Definitely. The exhibition has been praised by critics around the world.", "قطعاً. نمایشگاه توسط منتقدان سراسر جهان تحسین شده است."),
            d("B", "Really? What did they say?", "واقعاً؟ چه گفتند؟"),
            d("A", "One critic said it's the best exhibition of the year.", "یک منتقد گفت بهترین نمایشگاه سال است."),
            d("B", "That's a strong statement. When does it close?", "این حرف قوی است. کی بسته می‌شود؟"),
            d("A", "It's open until the end of next month. We should go together.", "تا آخر ماه آینده باز است. باید با هم برویم."),
            d("B", "That's a great idea. What's the entrance fee?", "فکر عالی است. هزینه ورودی چقدر است؟"),
            d("A", "It's free on Sundays. That's when I'm planning to go.", "یکشنبه‌ها رایگان است. آن موقع می‌خواهم بروم."),
            d("B", "Perfect. Let's meet there at 11.", "عالی. بیا ساعت ۱۱ آنجا قرار بگذاریم."),
            d("A", "Sounds good. By the way, are you interested in sculpture too?", "خوبه. راستی، به مجسمه‌سازی هم علاقه داری؟"),
            d("B", "Yes, I am. The gallery has a few sculptures, I think.", "بله. فکر می‌کنم گالری چند مجسمه دارد."),
            d("A", "Yes, they do. One of them was created by a famous Italian artist.", "بله. یکی از آن‌ها توسط هنرمند ایتالیایی معروفی ساخته شده است."),
            d("B", "Which one? Do you remember the name?", "کدام یکی؟ اسمش را یادت هست؟"),
            d("A", "I don't remember exactly, but it's exhibited in the main hall.", "دقیقاً یادم نیست، ولی در سالن اصلی نمایش داده می‌شود."),
            d("B", "I'll look for it. I love Italian art.", "دنبالش می‌گردم. عاشق هنر ایتالیایی هستم."),
            d("A", "Me too. The Renaissance period is my favorite.", "من هم. دوره رنسانس مورد علاقه‌ام است."),
            d("B", "That period produced so many masterpieces.", "آن دوره شاهکارهای زیادی تولید کرد."),
            d("A", "Absolutely. Works like the Mona Lisa are still inspiring artists today.", "قطعاً. آثاری مثل مونالیزا هنوز به هنرمندان امروز الهام می‌بخشد."),
            d("B", "Well said. I'm really looking forward to Sunday.", "خوب گفتی. واقعاً منتظر یکشنبه هستم."),
            d("A", "Me too. See you at the gallery!", "من هم. در گالری می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("When were the paintings in the exhibition created?", listOf("in the 1920s", "in the 1800s", "last year", "in the Renaissance"), 0),
            q("Who painted the works in the exhibition?", listOf("Italian artists", "a group of artists in Paris", "modern artists", "unknown artists"), 1),
            q("When is entrance free?", listOf("Fridays", "Saturdays", "Sundays", "Mondays"), 2),
            q("What is A's favorite art period?", listOf("Baroque", "Renaissance", "Modern", "Impressionist"), 1),
            q("The painting ___ displayed in the gallery.", listOf("is", "was", "are", "were"), 0),
            q("The sculptures ___ created in 1900.", listOf("is", "was", "are", "were"), 3),
            q("The Mona Lisa ___ painted by Leonardo da Vinci.", listOf("is", "was", "are", "were"), 1),
            q("Which is passive voice?", listOf("She paints a picture.", "The picture is painted.", "She is painting.", "She painted."), 1)
        ),
        idioms = listOf(
            IdiomExpression("Worth seeing", "ارزش دیدن داشتن", "Is it worth seeing?", "ارزش دیدن دارد؟"),
            IdiomExpression("Looking forward to", "منتظر بودن", "I'm looking forward to Sunday.", "منتظر یکشنبه هستم."),
            IdiomExpression("Well said", "خوب گفتی", "Well said. I'm really looking forward to it.", "خوب گفتی. واقعاً منتظرش هستم."),
            IdiomExpression("Strong statement", "حرف قوی", "That's a strong statement.", "این حرف قوی است.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "look for", "دنبال گشتن", "search for",
                "I'll look for it in the main hall.", "در سالن اصلی دنبالش می‌گردم.", "No"
            ),
            PhrasalVerb(
                "look forward to", "منتظر بودن", "anticipate with pleasure",
                "I'm looking forward to the exhibition.", "منتظر نمایشگاه هستم.", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Passive voice stress", "Stress the past participle: The painting was CREated in 1920."),
            PronunciationTip("Linking in passive", "Link 'was' or 'were' with the past participle: was_created, were_painted.")
        ),
        culture = listOf(
            CulturalNote(
                "Art appreciation",
                "In many cultures, visiting museums and galleries is a popular leisure activity. Art is often discussed in terms of style, technique, historical context, and emotional impact."
            ),
            CulturalNote(
                "The Renaissance",
                "The Renaissance (14th-17th century) was a period of great cultural and artistic achievement in Europe, producing famous artists like Leonardo da Vinci and Michelangelo."
            )
        ),
        mistakes = listOf(
            CommonMistake("The painting was paint by Picasso.", "The painting was painted by Picasso.", "Use the past participle 'painted', not the base form 'paint'."),
            CommonMistake("The sculptures is displayed.", "The sculptures are displayed.", "Use 'are' with plural nouns in the passive.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What kinds of paintings are in the exhibition?", "Landscapes and portraits, both realistic and abstract."),
            ComprehensionQuestion("What does the critic say about the exhibition?", "It's the best exhibition of the year.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Describe a work of art you like using the passive voice.",
                "اثر هنری‌ای که دوست داری را با استفاده از مجهول توصیف کن.",
                "It was painted by... / It is displayed in... / It was created in..."
            ),
            SpeakingTask(
                "Discuss whether art should be realistic or abstract.",
                "بحث کنید که آیا هنر باید واقع‌گرا باشد یا انتزاعی.",
                "In my opinion... / I think... / I'm not sure I agree..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a review of an art exhibition you've attended.",
                "نقدی از یک نمایشگاه هنری که رفته‌ای بنویس.",
                170,
                "Use passive voice (present and past) at least four times."
            )
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 9 — Living with Computers | زندگی با کامپیوترها
    // ═══════════════════════════════════════════════════════════
    private fun lesson9() = base(
        9, "Living with Computers", "زندگی با کامپیوترها",
        listOf(
            "Discuss technology and its impact on daily life",
            "Talk about computer problems",
            "Use noun clauses",
            "Use embedded questions",
            "Express opinions about technology"
        ),
        listOf(
            v("software", "نرم‌افزار", "I need to update the software.", "باید نرم‌افزار را به‌روزرسانی کنم."),
            v("hardware", "سخت‌افزار", "The hardware is old and slow.", "سخت‌افزار قدیمی و کند است."),
            v("device", "دستگاه", "This device connects to the internet.", "این دستگاه به اینترنت وصل می‌شود."),
            v("download", "دانلود کردن", "I downloaded a new app yesterday.", "دیروز اپ جدیدی دانلود کردم.", "verb"),
            v("upload", "آپلود کردن", "She uploaded the photos to the cloud.", "او عکس‌ها را در فضای ابری آپلود کرد.", "verb"),
            v("backup", "پشتیبان‌گیری", "Always make a backup of your files.", "همیشه از فایل‌هایت پشتیبان بگیر."),
            v("update", "به‌روزرسانی", "The system needs an update.", "سیستم به به‌روزرسانی نیاز دارد."),
            v("virus", "ویروس", "My computer got a virus last week.", "کامپیوترم هفته پیش ویروس گرفت."),
            v("password", "رمز عبور", "Choose a strong password.", "رمز عبور قوی انتخاب کن."),
            v("browser", "مرورگر", "Which browser do you use?", "کدام مرورگر را استفاده می‌کنی؟"),
            v("cloud", "فضای ابری", "All my files are stored in the cloud.", "همه فایل‌هایم در فضای ابری ذخیره شده‌اند."),
            v("app", "اپلیکیشن", "This app helps me learn languages.", "این اپ به من کمک می‌کند زبان یاد بگیرم."),
            v("screen", "صفحه نمایش", "The screen is too bright.", "صفحه نمایش خیلی روشن است."),
            v("technology", "تکنولوژی", "Technology changes so quickly.", "تکنولوژی خیلی سریع تغییر می‌کند."),
            v("addicted", "معتاد", "He's addicted to his phone.", "او به گوشی‌اش معتاد است.", "adjective")
        ),
        listOf(
            GrammarSection(
                "Noun clauses with that",
                "Use 'that' to introduce a clause that acts as a noun: I think that technology helps us. She believes that everyone should learn to code."
            ),
            GrammarSection(
                "Embedded questions",
                "Embedded questions use statement word order, not question word order: Where is the library? → Do you know where the library is? What time is it? → Can you tell me what time it is?"
            ),
            GrammarSection(
                "Noun clauses with whether/if",
                "Use 'whether' or 'if' for yes/no embedded questions: I don't know whether he's coming. She asked if I liked the app."
            ),
            GrammarSection(
                "Conversation strategy: Expressing opinions about technology",
                "Use expressions like 'I think...', 'In my opinion...', 'To be honest...', and 'It seems to me...' to express opinions about technology."
            )
        ),
        listOf(
            d("A", "I'm having trouble with my computer again.", "بازم با کامپیوترم مشکل دارم."),
            d("B", "What's wrong?", "چه مشکلی داری؟"),
            d("A", "I think it has a virus. It's running very slowly.", "فکر می‌کنم ویروس دارد. خیلی کند اجرا می‌شود."),
            d("B", "When did you first notice the problem?", "کی اول متوجه مشکل شدی؟"),
            d("A", "About a week ago. I'm not sure how it happened.", "حدود یک هفته پیش. مطمئن نیستم چطور اتفاق افتاد."),
            d("B", "Do you know what to do?", "می‌دانی چه کار کنی؟"),
            d("A", "Not really. I don't know whether I should take it to a repair shop.", "نه واقعاً. نمی‌دانم باید ببرمش تعمیرگاه یا نه."),
            d("B", "First, let me ask you — do you have a backup of your important files?", "اول بگذار بپرسم — از فایل‌های مهمت پشتیبان داری؟"),
            d("A", "I think so. I use cloud storage.", "فکر می‌کنم بله. از فضای ابری استفاده می‌کنم."),
            d("B", "Good. That's important. Next, do you know which antivirus software is best?", "خوبه. این مهم است. بعد، می‌دانی کدام آنتی‌ویروس بهتر است؟"),
            d("A", "No, I don't. Can you tell me what you use?", "نه. می‌توانی بگویی تو از چه استفاده می‌کنی؟"),
            d("B", "Sure. I use a free antivirus program that works well.", "حتماً. من از یک برنامه آنتی‌ویروس رایگان استفاده می‌کنم که خوب کار می‌کند."),
            d("A", "Where can I download it?", "از کجا می‌توانم دانلودش کنم؟"),
            d("B", "I'll send you the link. Do you know how to install software?", "لینکش را می‌فرستم. می‌دانی چطور نرم‌افزار نصب کنی؟"),
            d("A", "Yes, I do. That part is easy.", "بله. آن قسمت آسان است."),
            d("B", "Good. After you install it, run a full scan. Do you know what that means?", "خوبه. بعد از نصب، یک اسکن کامل اجرا کن. می‌دانی این به چه معناست؟"),
            d("A", "Yes, I think so. It checks all the files for viruses.", "بله، فکر می‌کنم. همه فایل‌ها را برای ویروس بررسی می‌کند."),
            d("B", "Exactly. It might take a while, but it's important.", "دقیقاً. ممکن است کمی طول بکشد، ولی مهم است."),
            d("A", "Okay. What if I find a virus? What should I do?", "باشه. اگر ویروس پیدا کنم چه؟ چه کار کنم؟"),
            d("B", "The program will ask you what to do. Usually, you should quarantine or delete the virus.", "برنامه می‌پرسد چه کار کنی. معمولاً باید ویروس را قرنطینه یا حذف کنی."),
            d("A", "I understand. Thanks so much for your help.", "می‌فهمم. خیلی ممنون برای کمکت."),
            d("B", "You're welcome. Do you know how to avoid viruses in the future?", "خواهش می‌کنم. می‌دانی چطور در آینده از ویروس جلوگیری کنی؟"),
            d("A", "Not really. What should I do?", "نه واقعاً. چه کار کنم؟"),
            d("B", "Don't click on strange links, and keep your software updated.", "روی لینک‌های عجیب کلیک نکن، و نرم‌افزارت را به‌روز نگه دار."),
            d("A", "That makes sense. I'll be more careful.", "منطقی است. بیشتر مراقب خواهم بود."),
            d("B", "Also, use strong passwords. Do you know how to create one?", "همچنین از رمزهای عبور قوی استفاده کن. می‌دانی چطور یکی بسازی؟"),
            d("A", "I've read about it. Use a mix of letters, numbers, and symbols.", "درباره‌اش خوانده‌ام. ترکیبی از حروف، اعداد و نمادها استفاده کن."),
            d("B", "Exactly. And don't use the same password for everything.", "دقیقاً. و از یک رمز برای همه چیز استفاده نکن."),
            d("A", "Good point. Thanks again for all the advice.", "نکته خوبی است. باز هم ممنون برای همه توصیه‌ها."),
            d("B", "Anytime! Let me know if the virus scan works.", "هر وقت! خبرم کن اگر اسکن ویروس کار کرد."),
            d("A", "I will. Have a good day!", "می‌کنم. روز خوبی داشته باشی!"),
            d("B", "You too!", "تو هم!")
        ),
        listOf(
            q("What problem does A have with the computer?", listOf("broken screen", "a virus", "no internet", "dead battery"), 1),
            q("When did A first notice the problem?", listOf("yesterday", "a week ago", "a month ago", "today"), 1),
            q("What backup does A have?", listOf("external hard drive", "cloud storage", "USB drive", "no backup"), 1),
            q("How should A avoid future viruses?", listOf("don't click strange links and update software", "only use email", "never download anything", "buy a new computer"), 0),
            q("Do you know where the library ___?", listOf("is", "was", "does", "it is"), 0),
            q("Can you tell me what time ___?", listOf("is it", "it is", "does it", "it does"), 1),
            q("I don't know ___ he's coming.", listOf("that", "whether", "what", "which"), 1),
            q("I think ___ technology helps us.", listOf("what", "that", "if", "whether"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Having trouble with", "مشکل داشتن با", "I'm having trouble with my computer.", "با کامپیوترم مشکل دارم."),
            IdiomExpression("That makes sense", "منطقی است", "That makes sense. I'll be more careful.", "منطقی است. بیشتر مراقب خواهم بود."),
            IdiomExpression("Good point", "نکته خوبی است", "Good point. Thanks again.", "نکته خوبی است. باز هم ممنون."),
            IdiomExpression("Might take a while", "ممکن است کمی طول بکشد", "It might take a while, but it's important.", "ممکن است کمی طول بکشد، ولی مهم است.")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "run a scan", "اسکن اجرا کردن", "scan a computer",
                "Run a full scan.", "یک اسکن کامل اجرا کن.", "No"
            ),
            PhrasalVerb(
                "click on", "کلیک کردن روی", "press a button on screen",
                "Don't click on strange links.", "روی لینک‌های عجیب کلیک نکن.", "No"
            ),
            PhrasalVerb(
                "keep updated", "به‌روز نگه داشتن", "maintain latest version",
                "Keep your software updated.", "نرم‌افزارت را به‌روز نگه دار.", "Yes"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Embedded question intonation", "Embedded questions use statement intonation, not question intonation: Do you know where he IS? (falling)"),
            PronunciationTip("Noun clause linking", "Link 'that' with the next word: I think_that_it's good → /aɪ θɪŋk ðət ɪts gʊd/")
        ),
        culture = listOf(
            CulturalNote(
                "Technology in daily life",
                "Technology plays a central role in modern life. In many English-speaking countries, discussions about computers, smartphones, and internet use are common conversation topics."
            ),
            CulturalNote(
                "Digital safety",
                "Cyber safety is a common concern. Using strong passwords, backups, and being cautious about links are basic practices recommended by experts worldwide."
            )
        ),
        mistakes = listOf(
            CommonMistake("Do you know where is the library?", "Do you know where the library is?", "Embedded questions use statement word order."),
            CommonMistake("I think that is good (missing subject).", "I think that it is good.", "Noun clauses need a subject.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's wrong with A's computer?", "It has a virus and is running slowly."),
            ComprehensionQuestion("What advice does B give to avoid future viruses?", "Don't click on strange links, keep software updated, and use strong passwords.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Discuss a computer problem you've had with a partner.",
                "درباره یک مشکل کامپیوتری که داشته‌ای با یک دوست صحبت کن.",
                "I had trouble with... / Do you know how to...? / Can you tell me...?"
            ),
            SpeakingTask(
                "Express your opinion about technology in daily life.",
                "نظرت را درباره تکنولوژی در زندگی روزمره بیان کن.",
                "I think that... / In my opinion... / It seems to me..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write a guide for a friend about computer safety.",
                "راهنمایی برای یک دوست درباره امنیت کامپیوتر بنویس.",
                170,
                "Use noun clauses and embedded questions at least three times."
            )
        )
    )

       // ═══════════════════════════════════════════════════════════
    // UNIT 10 — Ethics and Values | اخلاق و ارزش‌ها
    // ═══════════════════════════════════════════════════════════
    private fun lesson10() = base(
        10, "Ethics and Values", "اخلاق و ارزش‌ها",
        listOf(
            "Discuss ethical dilemmas and moral choices",
            "Talk about values and beliefs",
            "Use unreal conditionals (second conditional)",
            "Use wish + past subjunctive",
            "Express regret and hypothetical situations"
        ),
        listOf(
            v("ethics", "اخلاق", "Business ethics are important in every company.", "اخلاق تجاری در هر شرکتی مهم است."),
            v("values", "ارزش‌ها", "Honesty is one of my core values.", "صداقت یکی از ارزش‌های اصلی من است."),
            v("honest", "صادق", "She's always honest, even when it's difficult.", "او همیشه صادق است، حتی وقتی سخت است.", "adjective"),
            v("dilemma", "دوراهی", "He faced a difficult dilemma.", "او با دوراهی دشواری روبرو شد."),
            v("moral", "اخلاقی", "It was a moral decision, not a legal one.", "یک تصمیم اخلاقی بود، نه قانونی.", "adjective"),
            v("right", "درست", "She always tries to do the right thing.", "او همیشه سعی می‌کند کار درست را انجام دهد.", "adjective"),
            v("wrong", "غلط", "Stealing is wrong.", "دزدی غلط است.", "adjective"),
            v("responsibility", "مسئولیت", "We have a responsibility to help others.", "ما مسئولیت داریم به دیگران کمک کنیم."),
            v("integrity", "درستکاری", "He's a man of great integrity.", "او مردی با درستکاری فراوان است."),
            v("compromise", "سازش", "Sometimes we need to compromise.", "گاهی باید سازش کنیم.", "verb"),
            v("consequence", "پیامد", "Every choice has consequences.", "هر انتخابی پیامدهایی دارد."),
            v("regret", "پشیمانی", "I have no regrets about my decision.", "درباره تصمیمم پشیمانی ندارم."),
            v("principle", "اصل", "She refused to lie on principle.", "او از روی اصول حاضر نشد دروغ بگوید."),
            v("temptation", "وسوسه", "He resisted the temptation to cheat.", "او در برابر وسوسه تقلب مقاومت کرد."),
            v("fair", "منصفانه", "It's not fair to blame him.", "منصفانه نیست سرزنشش کنیم.", "adjective")
        ),
        listOf(
            GrammarSection(
                "Second Conditional (Unreal Present/Future)",
                "Use the second conditional for hypothetical or unlikely situations. Form: If + past simple, would + base verb. If I had more time, I would volunteer. If I were you, I would apologize."
            ),
            GrammarSection(
                "Wish + Past Subjunctive",
                "Use 'wish + past simple' to express regrets about the present. I wish I had more free time. She wishes she could help more. Note: with 'be', use 'were' for all persons: I wish I were taller."
            ),
            GrammarSection(
                "Was vs Were in conditionals",
                "In formal English, 'were' is used for all persons in the second conditional: If I were rich... If he were here... In informal English, 'was' is sometimes used with I/he/she/it."
            ),
            GrammarSection(
                "Conversation strategy: Discussing ethical issues",
                "Use expressions like 'I think it depends...', 'On one hand... on the other hand...', 'I'd feel uncomfortable if...', and 'I would/wouldn't...' to discuss ethics."
            )
        ),
        listOf(
            d("A", "I read an interesting article today about ethics.", "امروز مقاله جالبی درباره اخلاق خواندم."),
            d("B", "Really? What was it about?", "واقعاً؟ درباره چه بود؟"),
            d("A", "It was about a man who found a wallet with $500 in it.", "درباره مردی بود که یک کیف پول با ۵۰۰ دلار داخلش پیدا کرد."),
            d("B", "What did he do?", "چه کار کرد؟"),
            d("A", "He returned it to the owner. But he said it wasn't an easy decision.", "آن را به صاحبش برگرداند. ولی گفت تصمیم آسانی نبود."),
            d("B", "Why not? Returning it seems obvious.", "چرا نه؟ برگرداندنش واضح به نظر می‌رسد."),
            d("A", "Well, he was struggling financially. He said, 'If I had kept it, I could have paid my rent.'", "خب، وضع مالی‌اش سخت بود. گفت: «اگر نگهش می‌داشتم، می‌توانستم اجاره‌ام را بدهم.»"),
            d("B", "That's a real dilemma. What would you have done?", "این یک دوراهی واقعی است. تو چه می‌کردی؟"),
            d("A", "I'd like to think I would have returned it too. But honestly, I'm not sure.", "دوست دارم فکر کنم من هم برمی‌گرداندم. ولی صادقانه، مطمئن نیستم."),
            d("B", "I think most people would have kept it, actually.", "فکر می‌کنم بیشتر مردم نگهش می‌داشتند، در واقع."),
            d("A", "You might be right. But it's about integrity. If we all kept things that weren't ours, what kind of world would we live in?", "شاید حق با تو باشد. ولی موضوع درستکاری است. اگر همه ما چیزهایی که مال ما نیست نگه داریم، در چه دنیایی زندگی می‌کنیم؟"),
            d("B", "That's a good point. Values shape our decisions.", "نکته خوبی است. ارزش‌ها تصمیمات ما را شکل می‌دهند."),
            d("A", "Exactly. If I were the owner of the wallet, I would be very grateful.", "دقیقاً. اگر صاحب کیف پول بودم، خیلی سپاسگزار می‌شدم."),
            d("B", "Of course. If someone found my wallet, I'd hope they'd return it too.", "البته. اگر کسی کیف پولم را پیدا می‌کرد، امیدوار بودم برگرداند."),
            d("A", "See? That's the key question. What would you want done to you?", "می‌بینی؟ این سؤال کلیدی است. دوست داشتی با تو چه کار کنند؟"),
            d("B", "That's called the Golden Rule, right?", "این را قانون طلایی می‌نامند، درست است؟"),
            d("A", "Yes, it is. 'Treat others as you would want to be treated.'", "بله. «با دیگران طوری رفتار کن که دوست داری با تو رفتار کنند.»"),
            d("B", "I wish more people followed that rule.", "ای کاش افراد بیشتری این قانون را رعایت می‌کردند."),
            d("A", "Me too. The world would be a better place.", "من هم. دنیا جای بهتری می‌شد."),
            d("B", "Speaking of ethics, have you ever faced a difficult moral choice?", "از اخلاق که صحبت شد، تا حالا با انتخاب اخلاقی دشواری روبرو شده‌ای؟"),
            d("A", "Yes, actually. Once I saw a coworker take credit for someone else's work.", "بله، در واقع. یک بار دیدم همکاری اعتبار کار کس دیگری را به نام خودش زد."),
            d("B", "What did you do?", "چه کار کردی؟"),
            d("A", "I struggled with it. If I had said something, I might have lost a friend. If I hadn't, I'd feel guilty.", "با آن دست و پنجه نرم کردم. اگر چیزی می‌گفتم، شاید یک دوست را از دست می‌دادم. اگر نمی‌گفتم، احساس گناه می‌کردم."),
            d("B", "What did you decide?", "چه تصمیمی گرفتی؟"),
            d("A", "I talked to the coworker privately. I told him it wasn't fair.", "خصوصی با همکارم صحبت کردم. گفتم منصفانه نیست."),
            d("B", "How did he react?", "چه واکنشی نشان داد؟"),
            d("A", "At first, he was defensive. But later, he apologized to the other person.", "اولش حالت دفاعی گرفت. ولی بعداً از آن شخص دیگر عذرخواهی کرد."),
            d("B", "That's brave of you. I wish I had your courage.", "این شجاعانه بود. ای کاش من شجاعت تو را داشتم."),
            d("A", "It wasn't easy. But if I hadn't done it, I would have regretted it.", "آسان نبود. ولی اگر انجامش نمی‌دادم، پشیمان می‌شدم."),
            d("B", "You're right. Living with regret is harder than facing a difficult situation.", "حق داری. زندگی با پشیمانی سخت‌تر از روبرو شدن با موقعیت دشوار است."),
            d("A", "Exactly. Integrity matters more than comfort.", "دقیقاً. درستکاری از راحتی مهم‌تر است."),
            d("B", "I'll remember that. Thanks for sharing your story.", "این را به خاطر می‌سپارم. ممنون که داستانت را گفتی."),
            d("A", "Anytime. These conversations make us better people.", "هر وقت. این گفت‌وگوها ما را افراد بهتری می‌کنند."),
            d("B", "I couldn't agree more.", "کاملاً موافقم.")
        ),
        listOf(
            q("What did the man in the article find?", listOf("a phone", "a wallet with $500", "a job offer", "a car"), 1),
            q("Why was returning the wallet difficult for him?", listOf("it was far away", "he was struggling financially", "the owner was rude", "it was very late"), 1),
            q("What does the Golden Rule say?", listOf("always be honest", "treat others as you want to be treated", "never lie", "respect elders"), 1),
            q("What did A's coworker do?", listOf("stole money", "took credit for someone else's work", "arrived late", "lied to the boss"), 1),
            q("If I ___ more time, I would volunteer.", listOf("have", "had", "will have", "would have"), 1),
            q("If I ___ you, I would apologize.", listOf("am", "was", "were", "be"), 2),
            q("I wish I ___ more free time.", listOf("have", "had", "will have", "have had"), 1),
            q("If I had kept it, I ___ paid my rent.", listOf("can", "could", "could have", "will"), 2)
        ),
        idioms = listOf(
            IdiomExpression("On one hand... on the other hand", "از یک طرف... از طرف دیگر", "On one hand, it's risky. On the other hand, it's an opportunity.", "از یک طرف خطرناک است. از طرف دیگر فرصت است."),
            IdiomExpression("Do the right thing", "کار درست را کردن", "She always tries to do the right thing.", "او همیشه سعی می‌کند کار درست را انجام دهد."),
            IdiomExpression("Couldn't agree more", "کاملاً موافقم", "I couldn't agree more.", "کاملاً موافقم."),
            IdiomExpression("Golden Rule", "قانون طلایی", "That's called the Golden Rule, right?", "این را قانون طلایی می‌نامند، درست است؟")
        ),
        phrasal = listOf(
            PhrasalVerb(
                "take credit for", "اعتبار چیزی را به نام خود زدن", "claim recognition for something",
                "He took credit for someone else's work.", "او اعتبار کار کس دیگری را به نام خودش زد.", "No"
            ),
            PhrasalVerb(
                "struggle with", "دست و پنجه نرم کردن با", "have difficulty with",
                "I struggled with the decision.", "با تصمیم دست و پنجه نرم کردم.", "No"
            ),
            PhrasalVerb(
                "speak of", "صحبت کردن از", "mention",
                "Speaking of ethics, have you ever faced a moral choice?", "از اخلاق که صحبت شد، تا حالا با انتخاب اخلاقی روبرو شده‌ای؟", "No"
            )
        ),
        pronunciation = listOf(
            PronunciationTip("Second conditional rhythm", "Stress the past simple in the if-clause and 'would' in the main clause: If I HAD money, I would TRAvel."),
            PronunciationTip("Wish + were", "In formal English, 'were' is used for all persons: I wish I WERE, She wishes she WERE.")
        ),
        culture = listOf(
            CulturalNote(
                "Ethics across cultures",
                "While some ethical principles (like honesty) are universal, specific ethical priorities can vary across cultures. Understanding cultural context helps avoid misunderstandings in discussions about values."
            ),
            CulturalNote(
                "The Golden Rule",
                "The Golden Rule — treat others as you would want to be treated — appears in many cultures and religions worldwide, though with different wording. It's considered a universal ethical principle."
            )
        ),
        mistakes = listOf(
            CommonMistake("If I would have time, I would help.", "If I had time, I would help.", "Use past simple in the if-clause, not 'would have'."),
            CommonMistake("I wish I have more time.", "I wish I had more time.", "Use past simple after 'wish' for present regrets.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What ethical dilemma did the man in the article face?", "He found a wallet with $500 while struggling financially."),
            ComprehensionQuestion("What did A do about the coworker who took credit for someone else's work?", "A talked to the coworker privately and told him it wasn't fair. The coworker later apologized.")
        ),
        speaking = listOf(
            SpeakingTask(
                "Discuss an ethical dilemma with a partner.",
                "درباره یک دوراهی اخلاقی با یک دوست صحبت کن.",
                "What would you do if...? / If I were in that situation... / I'd feel..."
            ),
            SpeakingTask(
                "Talk about your personal values and why they matter.",
                "درباره ارزش‌های شخصی‌ات و اینکه چرا مهم هستند صحبت کن.",
                "One of my core values is... / I wish more people... / If everyone..., the world would..."
            )
        ),
        writing = listOf(
            WritingTask(
                "Write about an ethical dilemma you've faced or imagine one.",
                "درباره یک دوراهی اخلاقی که با آن روبرو شده‌ای یا تصور کن بنویس.",
                180,
                "Use second conditional, wish + past, and at least two phrasal verbs."
            )
        )
    )
}