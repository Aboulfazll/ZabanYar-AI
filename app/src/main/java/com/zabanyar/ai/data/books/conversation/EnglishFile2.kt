package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile2 {

    const val BOOK_ID = "english_file_2"

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
    // CHAPTER 1 — Everyday Life
    // ═══════════════════════════════════════════════════════════
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Everyday Life",
            titlePersian = "زندگی روزمره",
            objectives = listOf(
                "Talk about daily routines",
                "Describe habits and regular activities",
                "Use the present simple correctly",
                "Use frequency adverbs",
                "Tell the time and describe schedules"
            ),
            vocabulary = listOf(
                VocabWord("routine", "روتین / برنامه روزانه", "/ruːˈtiːn/", "noun",
                    "I have a simple morning routine.",
                    "من یک برنامه ساده صبحگاهی دارم.",
                    "daily routine, morning routine"),
                VocabWord("wake up", "از خواب بیدار شدن", "/weɪk ʌp/", "phrasal verb",
                    "I wake up at seven every morning.",
                    "من هر روز صبح ساعت هفت بیدار می‌شوم."),
                VocabWord("get ready", "آماده شدن", "/ɡet ˈredi/", "phrase",
                    "I get ready for school after breakfast.",
                    "بعد از صبحانه برای مدرسه آماده می‌شوم."),
                VocabWord("commute", "رفت‌وآمد روزانه", "/kəˈmjuːt/", "verb",
                    "She commutes to work by bus.",
                    "او با اتوبوس به محل کارش رفت‌وآمد می‌کند."),
                VocabWord("schedule", "برنامه زمانی", "/ˈskedʒuːl/", "noun",
                    "My schedule is busy on Mondays.",
                    "برنامه من دوشنبه‌ها شلوغ است."),
                VocabWord("usually", "معمولاً", "/ˈjuːʒuəli/", "adverb",
                    "I usually have coffee in the morning.",
                    "من معمولاً صبح قهوه می‌خورم."),
                VocabWord("sometimes", "گاهی", "/ˈsʌmtaɪmz/", "adverb",
                    "I sometimes walk to school.",
                    "گاهی پیاده به مدرسه می‌روم."),
                VocabWord("hardly ever", "تقریباً هیچ‌وقت", "/ˈhɑːrdli ˈevər/", "adverb",
                    "I hardly ever watch television.",
                    "من تقریباً هیچ‌وقت تلویزیون تماشا نمی‌کنم."),
                VocabWord("free time", "وقت آزاد", "/friː taɪm/", "noun",
                    "What do you do in your free time?",
                    "در وقت آزادت چه کار می‌کنی؟"),
                VocabWord("exercise", "ورزش کردن", "/ˈeksərsaɪz/", "verb",
                    "I exercise three times a week.",
                    "من سه بار در هفته ورزش می‌کنم."),
                VocabWord("relax", "استراحت کردن", "/rɪˈlæks/", "verb",
                    "I relax at home after work.",
                    "بعد از کار در خانه استراحت می‌کنم."),
                VocabWord("prefer", "ترجیح دادن", "/prɪˈfɜːr/", "verb",
                    "I prefer tea to coffee.",
                    "من چای را به قهوه ترجیح می‌دهم.")
            ),
            idioms = listOf(
                IdiomExpression("early bird", "فرد سحرخیز",
                    "My sister is an early bird and gets up before six.",
                    "خواهرم سحرخیز است و قبل از ساعت شش بیدار می‌شود.", "informal"),
                IdiomExpression("take it easy", "آرام گرفتن",
                    "You worked all day. Take it easy tonight.",
                    "تمام روز کار کردی. امشب کمی استراحت کن.", "informal"),
                IdiomExpression("on time", "به‌موقع",
                    "I always try to arrive on time.",
                    "همیشه سعی می‌کنم به‌موقع برسم.", "neutral")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("get up", "بلند شدن از تخت", "از تخت بلند شدن",
                    "I get up at seven.",
                    "ساعت هفت از تخت بلند می‌شوم.", "No"),
                PhrasalVerb("go out", "بیرون رفتن", "بیرون رفتن",
                    "We usually go out on Friday evenings.",
                    "ما معمولاً عصرهای جمعه بیرون می‌رویم.", "No"),
                PhrasalVerb("come back", "برگشتن", "برگشتن",
                    "I come back home at six.",
                    "ساعت شش به خانه برمی‌گردم.", "No")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Third-person -s",
                    "در زمان حال ساده، برای he, she و it معمولاً s یا es به فعل اضافه می‌شود: works, watches, studies."),
                PronunciationTip("Usually",
                    "در گفتار طبیعی usually معمولاً به صورت /ˈjuːʒuəli/ شنیده می‌شود."),
                PronunciationTip("Time expressions",
                    "در عبارت‌هایی مانند at seven و at night، صدای t ممکن است ضعیف شنیده شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Schedules",
                    "در محیط‌های آموزشی و کاری انگلیسی‌زبان، صحبت درباره schedule و زمان‌بندی روزانه رایج است."),
                CulturalNote("Small talk",
                    "پرسیدن درباره برنامه روزانه، آخر هفته یا علایق می‌تواند بخشی از گفت‌وگوی کوتاه و دوستانه باشد.")
            ),
            grammar = listOf(
                GrammarSection("Present Simple: Affirmative",
                    """
                        از present simple برای عادت‌ها، برنامه‌های معمول و واقعیت‌های عمومی استفاده می‌کنیم.

                        I work every day.
                        You study English.
                        We live in a city.

                        برای he, she و it معمولاً s یا es اضافه می‌شود:

                        He works.
                        She studies.
                        It starts at eight.

                        اگر فعل به consonant + y ختم شود، y به ies تبدیل می‌شود:

                        study → studies
                        try → tries
                    """.trimIndent()),
                GrammarSection("Present Simple: Questions",
                    """
                        برای سؤال در زمان حال ساده از do و does استفاده می‌کنیم.

                        Do you work here?
                        Do they study English?
                        Does she live nearby?
                        Does he play football?

                        بعد از does، فعل به شکل ساده می‌آید:

                        Does she work here?
                    """.trimIndent()),
                GrammarSection("Present Simple: Negatives",
                    """
                        برای منفی کردن از don't و doesn't استفاده می‌کنیم.

                        I don't work on Fridays.
                        We don't watch TV every night.
                        She doesn't drive to work.
                        He doesn't like coffee.

                        بعد از doesn't فعل به شکل ساده می‌آید.
                    """.trimIndent()),
                GrammarSection("Frequency Adverbs",
                    """
                        قیدهای تکرار میزان انجام یک کار را نشان می‌دهند:

                        always
                        usually
                        often
                        sometimes
                        hardly ever
                        never

                        معمولاً قبل از فعل اصلی قرار می‌گیرند:

                        I usually walk to work.

                        اما با فعل be معمولاً بعد از be می‌آیند:

                        He is usually tired after work.
                    """.trimIndent()),
                GrammarSection("Telling the Time",
                    """
                        It's seven o'clock.
                        It's half past seven.
                        It's quarter past seven.
                        It's quarter to eight.

                        برای زمان دقیق از at استفاده می‌کنیم:

                        The class starts at nine.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She work every day.", "She works every day.",
                    "در سوم شخص مفرد در زمان حال ساده معمولاً s به فعل اضافه می‌شود."),
                CommonMistake("Does he works here?", "Does he work here?",
                    "بعد از does، فعل به شکل ساده می‌آید."),
                CommonMistake("He don't like coffee.", "He doesn't like coffee.",
                    "برای he, she و it از doesn't استفاده می‌کنیم."),
                CommonMistake("I always am tired.", "I am always tired.",
                    "با فعل be، قید تکرار معمولاً بعد از فعل be قرار می‌گیرد."),
                CommonMistake("I go to work in 8 o'clock.", "I go to work at 8 o'clock.",
                    "برای ساعت مشخص از at استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("Lena", "What time do you usually get up?",
                    "معمولاً چه ساعتی بیدار می‌شوی؟"),
                DialogueLine("Mark", "I usually get up at seven, but I get up earlier on Mondays.",
                    "معمولاً ساعت هفت بیدار می‌شوم، اما دوشنبه‌ها زودتر بیدار می‌شوم."),
                DialogueLine("Lena", "Why do you get up earlier on Mondays?",
                    "چرا دوشنبه‌ها زودتر بیدار می‌شوی؟"),
                DialogueLine("Mark", "I have an early class at eight.",
                    "یک کلاس زودهنگام ساعت هشت دارم."),
                DialogueLine("Lena", "Do you have breakfast before class?",
                    "قبل از کلاس صبحانه می‌خوری؟"),
                DialogueLine("Mark", "Yes, I do. I usually have some fruit and toast.",
                    "بله. معمولاً کمی میوه و نان تست می‌خورم."),
                DialogueLine("Lena", "Do you drink coffee in the morning?",
                    "صبح‌ها قهوه می‌خوری؟"),
                DialogueLine("Mark", "Sometimes. I prefer tea, though.",
                    "گاهی. البته چای را ترجیح می‌دهم."),
                DialogueLine("Lena", "How do you get to school?",
                    "چطور به مدرسه می‌روی؟"),
                DialogueLine("Mark", "I usually take the bus. It takes about twenty minutes.",
                    "معمولاً با اتوبوس می‌روم. حدود بیست دقیقه طول می‌کشد."),
                DialogueLine("Lena", "What time do your classes finish?",
                    "کلاس‌هایت چه ساعتی تمام می‌شوند؟"),
                DialogueLine("Mark", "They usually finish at three.",
                    "معمولاً ساعت سه تمام می‌شوند."),
                DialogueLine("Lena", "What do you do after school?",
                    "بعد از مدرسه چه کار می‌کنی؟"),
                DialogueLine("Mark", "I go home, have something to eat, and do my homework.",
                    "به خانه می‌روم، چیزی می‌خورم و تکالیفم را انجام می‌دهم."),
                DialogueLine("Lena", "Do you exercise during the week?",
                    "در طول هفته ورزش می‌کنی؟"),
                DialogueLine("Mark", "Yes. I usually play basketball twice a week.",
                    "بله. معمولاً هفته‌ای دو بار بسکتبال بازی می‌کنم."),
                DialogueLine("Lena", "What do you do at the weekend?",
                    "آخر هفته چه کار می‌کنی؟"),
                DialogueLine("Mark", "I like meeting friends and watching movies.",
                    "دوست دارم دوستانم را ببینم و فیلم تماشا کنم."),
                DialogueLine("Lena", "Do you often go out on Saturday night?",
                    "شنبه شب‌ها زیاد بیرون می‌روی؟"),
                DialogueLine("Mark", "Not really. I hardly ever go out on Saturday because I'm usually tired.",
                    "نه خیلی. شنبه‌ها تقریباً هیچ‌وقت بیرون نمی‌روم چون معمولاً خسته‌ام."),
                DialogueLine("Lena", "I understand. My schedule is busy, too.",
                    "می‌فهمم. برنامه من هم شلوغ است."),
                DialogueLine("Mark", "Maybe we can meet for coffee sometime.",
                    "شاید یک روز بتوانیم برای قهوه همدیگر را ببینیم."),
                DialogueLine("Lena", "Sure. How about Saturday afternoon?",
                    "حتماً. شنبه بعدازظهر چطور است؟"),
                DialogueLine("Mark", "That works for me. Let's meet at three.",
                    "برای من خوب است. ساعت سه همدیگر را ببینیم."),
                DialogueLine("Lena", "Perfect. See you Saturday!",
                    "عالی. شنبه می‌بینمت!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Mark چه ساعتی بیدار می‌شود؟",
                    "معمولاً ساعت هفت، اما دوشنبه‌ها زودتر."),
                ComprehensionQuestion("Mark صبحانه چه می‌خورد؟",
                    "میوه و نان تست."),
                ComprehensionQuestion("Mark چطور به مدرسه می‌رود؟",
                    "با اتوبوس، حدود ۲۰ دقیقه."),
                ComprehensionQuestion("Mark هفته‌ای چند بار ورزش می‌کند؟",
                    "هفته‌ای دو بار بسکتبال بازی می‌کند."),
                ComprehensionQuestion("قرار ملاقات کِی و چه ساعتی است؟",
                    "شنبه بعدازظهر ساعت ۳.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your daily routine.",
                    "برنامه روزانه‌ات رو توصیف کن.",
                    "I usually wake up at... / I have breakfast at..."),
                SpeakingTask("Ask a partner about their routine.",
                    "از یک دوست درباره برنامه‌اش بپرس.",
                    "What time do you...? / Do you...?"),
                SpeakingTask("Talk about your weekend.",
                    "درباره آخر هفته‌ات صحبت کن.",
                    "I usually... / I sometimes...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your typical day.",
                    "درباره یک روز معمولی‌ات بنویس.",
                    100,
                    "Use present simple and time expressions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ at 7 every day.",
                    listOf("wake up", "wakes up", "waking up", "woke up"), 1),
                QuizQuestion("Complete: I go to bed ___ 11.",
                    listOf("in", "on", "at", "from"), 2),
                QuizQuestion("Which is correct?",
                    listOf("I usually get up early.", "I get up usually early.", "Usually I get up early.", "I get up early usually."), 0),
                QuizQuestion("Complete: He ___ coffee.",
                    listOf("never drink", "never drinks", "drinks never", "never drinking"), 1),
                QuizQuestion("Complete: They ___ work on Sundays.",
                    listOf("doesn't", "don't", "isn't", "aren't"), 1),
                QuizQuestion("Complete: What time ___ you get up?",
                    listOf("does", "do", "is", "are"), 1),
                QuizQuestion("Complete: I have breakfast ___ the morning.",
                    listOf("on", "at", "in", "from"), 2),
                QuizQuestion("Complete: ___ she work here?",
                    listOf("Do", "Does", "Is", "Are"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 2 — Past Experiences
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Past Experiences",
            titlePersian = "تجربه‌های گذشته",
            objectives = listOf(
                "Talk about past events",
                "Use the simple past",
                "Use was / were",
                "Tell a short story"
            ),
            vocabulary = listOf(
                VocabWord("yesterday", "دیروز", "/ˈjestərdeɪ/", "adverb",
                    "I saw her yesterday.", "دیروز دیدمش."),
                VocabWord("last night", "دیشب", "/læst naɪt/", "phrase",
                    "I watched a movie last night.", "دیشب فیلم دیدم."),
                VocabWord("ago", "پیش", "/əˈɡoʊ/", "adverb",
                    "Two days ago.", "دو روز پیش."),
                VocabWord("went", "رفت", "/went/", "verb",
                    "We went to the park.", "رفتیم پارک."),
                VocabWord("saw", "دید", "/sɔː/", "verb",
                    "I saw a film.", "یه فیلم دیدم."),
                VocabWord("ate", "خورد", "/eɪt/", "verb",
                    "We ate pizza.", "پیتزا خوردیم."),
                VocabWord("had", "داشت", "/hæd/", "verb",
                    "I had a great time.", "وقت خوبی داشتم."),
                VocabWord("came", "آمد", "/keɪm/", "verb",
                    "She came late.", "دیر اومد."),
                VocabWord("bought", "خرید", "/bɔːt/", "verb",
                    "I bought a book.", "یه کتاب خریدم."),
                VocabWord("felt", "احساس کرد", "/felt/", "verb",
                    "I felt happy.", "احساس خوشحالی کردم.")
            ),
            idioms = listOf(
                IdiomExpression("the day before yesterday", "پریروز",
                    "We met the day before yesterday.",
                    "پریروز همدیگه رو دیدیم.", "neutral"),
                IdiomExpression("once upon a time", "یکی بود یکی نبود",
                    "Once upon a time, there was a king.",
                    "یکی بود یکی نبود، یه پادشاهی بود.", "idiom"),
                IdiomExpression("long time ago", "خیلی وقت پیش",
                    "That happened a long time ago.",
                    "اون خیلی وقت پیش اتفاق افتاد.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ed endings",
                    "در افعال با قاعده، -ed به سه صورت تلفظ می‌شود: /t/ (liked)، /d/ (lived)، /ɪd/ (wanted)."),
                PronunciationTip("Irregular verbs",
                    "افعال بی‌قاعده را باید حفظ کرد: go → went، see → saw، eat → ate.")
            ),
            culturalNotes = listOf(
                CulturalNote("Telling stories",
                    "در غرب، تعریف داستان‌های شخصی بخش مهمی از ارتباط اجتماعی است."),
                CulturalNote("Photo sharing",
                    "مردم اغلب عکس‌های گذشته را در شبکه‌های اجتماعی به اشتراک می‌گذارند.")
            ),
            grammar = listOf(
                GrammarSection("was / were",
                    """
                        I/He/She/It + was
                        You/We/They + were

                        I was at home.
                        They were happy.
                        She wasn't tired.
                        Were you at school?
                    """.trimIndent()),
                GrammarSection("Simple past",
                    """
                        با قاعده: verb + ed
                        work → worked
                        play → played
                        watch → watched

                        بی‌قاعده:
                        go → went
                        see → saw
                        eat → ate
                        have → had
                    """.trimIndent()),
                GrammarSection("Questions with did",
                    """
                        Did + subject + verb?

                        Did you go to the party?
                        Yes, I did. / No, I didn't.

                        Where did you go?
                        What did you do?
                    """.trimIndent()),
                GrammarSection("Negative with didn't",
                    """
                        Subject + didn't + verb

                        I didn't go.
                        She didn't eat.
                        They didn't come.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده می‌آید."),
                CommonMistake("Did you went?", "Did you go?", "بعد از did فعل ساده می‌آید."),
                CommonMistake("She were at home.", "She was at home.", "با she از was استفاده می‌کنیم."),
                CommonMistake("I was go to school.", "I went to school.", "برای گذشته از فعل گذشته استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("A", "How was your weekend?", "آخر هفته‌ات چطور بود؟"),
                DialogueLine("B", "It was great! I went to the mountains with friends.", "عالی بود! با دوستام رفتیم کوه."),
                DialogueLine("A", "Sounds fun. What did you do there?", "خوش به نظر می‌رسه. اونجا چیکار کردید؟"),
                DialogueLine("B", "We hiked, took photos, and had a picnic.", "کوه‌نوردی کردیم، عکس گرفتیم و پیک‌نیک داشتیم."),
                DialogueLine("A", "Did you see any animals?", "حیوونی دیدید؟"),
                DialogueLine("B", "Yes, we saw some birds and a fox!", "بله، چند تا پرنده و یه روباه دیدیم!"),
                DialogueLine("A", "Wow, cool! What did you eat?", "واو، باحال! چی خوردید؟"),
                DialogueLine("B", "We ate sandwiches and fruit. It was simple but nice.", "ساندویچ و میوه خوردیم. ساده بود ولی خوب."),
                DialogueLine("A", "Did you stay overnight?", "شب موندید؟"),
                DialogueLine("B", "No, we came back in the evening. What about you?", "نه، عصر برگشتیم. تو چطور؟"),
                DialogueLine("A", "I stayed home. I wasn't feeling well.", "من خونه موندم. حالم خوب نبود."),
                DialogueLine("B", "Oh, I'm sorry to hear that. Are you better now?", "اوه، متأسفم. الان بهتری؟"),
                DialogueLine("A", "Yes, thanks. I rested all weekend.", "بله، ممنون. تمام آخر هفته استراحت کردم."),
                DialogueLine("B", "Good. Do you have plans for next weekend?", "خوبه. برای آخر هفته بعد برنامه‌ای داری؟"),
                DialogueLine("A", "I might go shopping. I need new clothes.", "شاید برم خرید. لباس جدید لازم دارم."),
                DialogueLine("B", "Nice. Where did you buy your last clothes?", "خوبه. آخرین بار لباسات رو از کجا خریدی؟"),
                DialogueLine("A", "From a shop downtown. They had a sale.", "از یه مغازه مرکز شهر. حراج داشتن."),
                DialogueLine("B", "Sounds great. Maybe I'll come too.", "خوبه. شاید منم بیام."),
                DialogueLine("A", "Sure! The more the merrier.", "حتماً! هر چی بیشتر بهتر.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B آخر هفته کجا رفت؟", "به کوه با دوستانش."),
                ComprehensionQuestion("B چه کارهایی انجام داد؟", "کوه‌نوردی، عکس‌گرفتن و پیک‌نیک."),
                ComprehensionQuestion("A آخر هفته چیکار کرد؟", "خونه موند چون حالش خوب نبود."),
                ComprehensionQuestion("B چه حیواناتی دید؟", "چند پرنده و یک روباه."),
                ComprehensionQuestion("A برای آخر هفته بعد چه برنامه‌ای دارد؟", "شاید برود خرید لباس.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your last weekend.",
                    "درباره آخر هفته گذشته‌ات صحبت کن.",
                    "I went... / I saw... / I had..."),
                SpeakingTask("Tell a story about a trip.",
                    "داستانی از یک سفر تعریف کن.",
                    "Last year I went..."),
                SpeakingTask("Ask a friend about their past week.",
                    "از یک دوست درباره هفته گذشته‌اش بپرس.",
                    "Did you...? / What did you...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about your last weekend.",
                    "درباره آخر هفته گذشته‌ات بنویس.",
                    100,
                    "Use past simple and time expressions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ to the park yesterday.",
                    listOf("go", "went", "goes", "going"), 1),
                QuizQuestion("Complete: She ___ at home last night.",
                    listOf("were", "was", "is", "are"), 1),
                QuizQuestion("Complete: ___ you see the movie?",
                    listOf("Do", "Does", "Did", "Are"), 2),
                QuizQuestion("Complete: We ___ eat pizza.",
                    listOf("didn't", "don't", "doesn't", "aren't"), 0),
                QuizQuestion("Complete: I ___ a great time.",
                    listOf("have", "has", "had", "having"), 2),
                QuizQuestion("Complete: They ___ to school yesterday.",
                    listOf("go", "went", "goes", "going"), 1),
                QuizQuestion("Complete: Where ___ you go last night?",
                    listOf("do", "does", "did", "are"), 2),
                QuizQuestion("Complete: She ___ late yesterday.",
                    listOf("come", "came", "comes", "coming"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 3 — Food and Restaurants
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Food and Restaurants",
            titlePersian = "غذا و رستوران",
            objectives = listOf(
                "Order food at a restaurant",
                "Talk about food preferences",
                "Use countable/uncountable nouns",
                "Use some / any"
            ),
            vocabulary = listOf(
                VocabWord("menu", "منو", "/ˈmenjuː/", "noun",
                    "Can I see the menu?", "می‌تونم منو رو ببینم؟"),
                VocabWord("waiter", "گارسون", "/ˈweɪtər/", "noun",
                    "The waiter brought our food.", "گارسون غذامون رو آورد."),
                VocabWord("bill", "صورت‌حساب", "/bɪl/", "noun",
                    "Can we have the bill?", "می‌تونیم صورت‌حساب بگیریم؟"),
                VocabWord("order", "سفارش دادن", "/ˈɔːrdər/", "verb",
                    "Are you ready to order?", "آماده سفارش هستید؟"),
                VocabWord("delicious", "خوشمزه", "/dɪˈlɪʃəs/", "adjective",
                    "This soup is delicious.", "این سوپ خوشمزه است."),
                VocabWord("dessert", "دسر", "/dɪˈzɜːrt/", "noun",
                    "Would you like dessert?", "دسر میل دارید؟"),
                VocabWord("appetizer", "پیش‌غذا", "/ˈæpɪtaɪzər/", "noun",
                    "We ordered an appetizer.", "ما پیش‌غذا سفارش دادیم."),
                VocabWord("main course", "غذای اصلی", "/meɪn kɔːrs/", "noun",
                    "The main course was excellent.", "غذای اصلی عالی بود."),
                VocabWord("tip", "انعام", "/tɪp/", "noun",
                    "We left a good tip.", "انعام خوبی گذاشتیم."),
                VocabWord("vegetarian", "گیاه‌خوار", "/ˌvedʒəˈteriən/", "adjective",
                    "I'm vegetarian.", "من گیاه‌خوارم.")
            ),
            idioms = listOf(
                IdiomExpression("eat out", "بیرون غذا خوردن",
                    "We eat out every Friday.", "هر جمعه بیرون غذا می‌خوریم.", "neutral"),
                IdiomExpression("have a sweet tooth", "شیرینی‌دوست بودن",
                    "She has a sweet tooth.", "او شیرینی‌دوست است.", "idiom"),
                IdiomExpression("piece of cake", "خیلی راحت",
                    "The test was a piece of cake!", "امتحان خیلی راحت بود!", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th sound",
                    "در کلماتی مثل thank و three، th صدای /θ/ دارد."),
                PronunciationTip("Silent letters",
                    "در vegetable، حرف دوم e تلفظ نمی‌شود: /ˈvedʒtəbəl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Eating out",
                    "در غرب، بیرون غذا خوردن بسیار رایج است؛ از رستوران‌های ارزان تا گران."),
                CulturalNote("Tipping",
                    "در آمریکا، انعام ۱۵-۲۰٪ رایج است.")
            ),
            grammar = listOf(
                GrammarSection("Countable vs uncountable",
                    """
                        قابل شمارش: apple, egg, sandwich
                        غیرقابل شمارش: water, rice, bread, money

                        a / an + قابل شمارش مفرد: an apple
                        some + غیرقابل شمارش یا جمع: some water, some apples
                    """.trimIndent()),
                GrammarSection("some / any",
                    """
                        some → در جملات مثبت: I have some bread.
                        any → در جملات منفی و سوال: I don't have any milk. / Do you have any sugar?
                    """.trimIndent()),
                GrammarSection("Ordering food",
                    """
                        I'd like... please.
                        Can I have...?
                        I'll have...

                        I'd like a coffee, please.
                        Can I have the bill, please?
                    """.trimIndent()),
                GrammarSection("How much / How many",
                    """
                        How much + غیرقابل شمارش: How much water?
                        How many + قابل شمارش جمع: How many apples?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have some milks.", "I have some milk.", "milk غیرقابل شمارش است."),
                CommonMistake("I'd like a water.", "I'd like some water.", "water غیرقابل شمارش است."),
                CommonMistake("I have any bread.", "I have some bread.", "در جملات مثبت از some استفاده می‌کنیم."),
                CommonMistake("How many water?", "How much water?", "water غیرقابل شمارش است.")
            ),
            conversation = listOf(
                DialogueLine("Waiter", "Good evening. Are you ready to order?", "عصر بخیر. آماده سفارش هستید؟"),
                DialogueLine("Customer", "Yes, I'd like a chicken sandwich, please.", "بله، یه ساندویچ مرغ می‌خوام، لطفاً."),
                DialogueLine("Waiter", "Would you like anything to drink?", "نوشیدنی چیزی میل دارید؟"),
                DialogueLine("Customer", "Yes, some water, please. And a coffee after.", "بله، کمی آب، لطفاً. و بعدش یه قهوه."),
                DialogueLine("Waiter", "Anything else?", "چیز دیگه‌ای؟"),
                DialogueLine("Customer", "No, thanks. That's all.", "نه، ممنون. همین."),
                DialogueLine("Waiter", "Great. Your food will be ready soon.", "عالی. غذاتون به‌زودی آماده می‌شه."),
                DialogueLine("Customer", "Thank you. Could I have the bill after?", "ممنون. می‌تونم بعدش صورت‌حساب بگیرم؟"),
                DialogueLine("Waiter", "Of course. Cash or card?", "البته. نقد یا کارت؟"),
                DialogueLine("Customer", "Card, please.", "کارت، لطفاً."),
                DialogueLine("Waiter", "Here's your bill. Have a nice meal!", "اینم صورت‌حساب. غذای خوبی داشته باشید!"),
                DialogueLine("Customer", "Thanks. Do you have dessert?", "ممنون. دسر دارید؟"),
                DialogueLine("Waiter", "Yes, we have cake and ice cream.", "بله، کیک و بستنی داریم."),
                DialogueLine("Customer", "I'll have some chocolate cake.", "یه کم کیک شکلاتی می‌خورم."),
                DialogueLine("Waiter", "Excellent choice. Anything else?", "انتخاب عالی. چیز دیگه‌ای؟"),
                DialogueLine("Customer", "No, that's everything. Thanks!", "نه، همین. ممنون!"),
                DialogueLine("Waiter", "Enjoy your meal!", "از غذاتون لذت ببرید!"),
                DialogueLine("Customer", "Thanks, I will!", "ممنون، لذت می‌برم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("مشتری چه غذایی سفارش داد؟", "ساندویچ مرغ."),
                ComprehensionQuestion("چه نوشیدنی سفارش داد؟", "آب و بعدش قهوه."),
                ComprehensionQuestion("چطور پرداخت کرد؟", "با کارت."),
                ComprehensionQuestion("چه دسری سفارش داد؟", "کیک شکلاتی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Order food at a restaurant.",
                    "نقش‌بازی: در رستوران غذا سفارش بده.",
                    "I'd like... / Can I have...?"),
                SpeakingTask("Talk about your favorite food.",
                    "درباره غذای مورد علاقه‌ات صحبت کن.",
                    "I love... / My favorite is...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite meal.",
                    "درباره غذای مورد علاقه‌ات بنویس.",
                    100,
                    "Describe the food, when you eat it, why you like it.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I'd like ___ water.",
                    listOf("a", "an", "some", "many"), 2),
                QuizQuestion("Complete: Do you have ___ bread?",
                    listOf("some", "any", "a", "many"), 1),
                QuizQuestion("Complete: How ___ water?",
                    listOf("many", "much", "some", "any"), 1),
                QuizQuestion("Complete: I have ___ apple.",
                    listOf("a", "an", "some", "any"), 1),
                QuizQuestion("Complete: I'd like ___ coffee, please.",
                    listOf("a", "an", "some", "any"), 0),
                QuizQuestion("Complete: ___ you like some tea?",
                    listOf("Do", "Does", "Would", "Are"), 2),
                QuizQuestion("Complete: She ___ eat meat.",
                    listOf("don't", "doesn't", "isn't", "aren't"), 1),
                QuizQuestion("What does 'eat out' mean?",
                    listOf("بیرون غذا خوردن", "داخل غذا خوردن", "آشپزی کردن", "خرید کردن"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 4 — Shopping
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Shopping",
            titlePersian = "خرید",
            objectives = listOf(
                "Ask about prices",
                "Use this/that/these/those",
                "Talk about clothes and colors",
                "Use the present continuous"
            ),
            vocabulary = listOf(
                VocabWord("price", "قیمت", "/praɪs/", "noun",
                    "What's the price?", "قیمتش چنده؟"),
                VocabWord("cheap", "ارزان", "/tʃiːp/", "adjective",
                    "This shirt is cheap.", "این پیراهن ارزونه."),
                VocabWord("expensive", "گران", "/ɪkˈspensɪv/", "adjective",
                    "That's too expensive.", "اون خیلی گرونه."),
                VocabWord("clothes", "لباس", "/kloʊðz/", "noun",
                    "I need new clothes.", "من لباس جدید لازم دارم."),
                VocabWord("shirt", "پیراهن", "/ʃɜːrt/", "noun",
                    "This shirt is nice.", "این پیراهن قشنگه."),
                VocabWord("shoes", "کفش", "/ʃuːz/", "noun",
                    "These shoes are new.", "این کفش‌ها نو هستن."),
                VocabWord("color", "رنگ", "/ˈkʌlər/", "noun",
                    "What color is it?", "چه رنگیه؟"),
                VocabWord("size", "سایز", "/saɪz/", "noun",
                    "What size are you?", "چه سایزی هستی؟"),
                VocabWord("buy", "خریدن", "/baɪ/", "verb",
                    "I want to buy this.", "می‌خوام اینو بخرم."),
                VocabWord("pay", "پرداخت کردن", "/peɪ/", "verb",
                    "How much did you pay?", "چقدر پرداخت کردی؟")
            ),
            idioms = listOf(
                IdiomExpression("on sale", "حراج",
                    "The shoes are on sale.", "کفش‌ها حراج هستن.", "neutral"),
                IdiomExpression("window shopping", "ویترین‌گردی",
                    "We went window shopping.", "رفتیم ویترین‌گردی.", "informal"),
                IdiomExpression("cost an arm and a leg", "خیلی گران بودن",
                    "That bag cost an arm and a leg.", "اون کیف خیلی گرون بود.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("this / that",
                    "this /ðɪs/، that /ðæt/ — حرف th در هر دو صدای /ð/ دارد."),
                PronunciationTip("clothes",
                    "clothes /kloʊðz/ — th صدادار است.")
            ),
            culturalNotes = listOf(
                CulturalNote("Shopping in the West",
                    "در غرب، خرید در مال‌ها و فروشگاه‌های بزرگ رایج است."),
                CulturalNote("Black Friday",
                    "در آمریکا، Black Friday بزرگ‌ترین روز تخفیف سال است.")
            ),
            grammar = listOf(
                GrammarSection("this / that / these / those",
                    """
                        این (نزدیک): this / these
                        آن (دور): that / those

                        this shirt / these shirts
                        that shirt / those shirts
                    """.trimIndent()),
                GrammarSection("Present continuous",
                    """
                        am/is/are + verb-ing

                        I'm wearing a blue shirt.
                        She's buying shoes.
                    """.trimIndent()),
                GrammarSection("How much is/are...?",
                    """
                        How much is + مفرد: How much is this shirt?
                        How much are + جمع: How much are these shoes?
                    """.trimIndent()),
                GrammarSection("Colors as adjectives",
                    """
                        color + noun:
                        a red car / a blue shirt / black shoes

                        What color is it? — It's red.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("How much are this shirt?", "How much is this shirt?", "برای مفرد از is استفاده می‌کنیم."),
                CommonMistake("This shoes are nice.", "These shoes are nice.", "برای جمع از these استفاده می‌کنیم."),
                CommonMistake("a shirt red", "a red shirt", "ترتیب صفت + اسم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Excuse me, how much is this shirt?", "ببخشید، این پیراهن چنده؟"),
                DialogueLine("B", "It's 25 dollars.", "۲۵ دلاره."),
                DialogueLine("A", "And these shoes?", "و این کفش‌ها؟"),
                DialogueLine("B", "Those are 40 dollars.", "اون‌ها ۴۰ دلارن."),
                DialogueLine("A", "That's a bit expensive. Do you have anything cheaper?", "یه کم گرونه. چیز ارزون‌تری دارید؟"),
                DialogueLine("B", "Yes, these are on sale for 30 dollars.", "بله، اینا ۳۰ دلار حراج هستن."),
                DialogueLine("A", "That's better. What sizes do you have?", "این بهتره. چه سایزهایی دارید؟"),
                DialogueLine("B", "We have small, medium, and large.", "اسمال، مدیوم و لارج داریم."),
                DialogueLine("A", "I'll take the medium. Can I try them on?", "مدیوم می‌خوام. می‌تونم امتحانشون کنم؟"),
                DialogueLine("B", "Of course. The fitting room is over there.", "البته. اتاق پرو اونجاست."),
                DialogueLine("A", "Thanks. They fit well. I'll take them.", "ممنون. اندازه هستن. اینا رو می‌خرم."),
                DialogueLine("B", "Great! Cash or card?", "عالی! نقد یا کارت؟"),
                DialogueLine("A", "Card, please. And could I have a bag?", "کارت، لطفاً. و می‌تونم یه کیسه بگیرم؟"),
                DialogueLine("B", "Of course. Here you go.", "البته. بفرمایید."),
                DialogueLine("A", "Thank you. Do you have a return policy?", "ممنون. سیاست بازگشت دارید؟"),
                DialogueLine("B", "Yes, 30 days with the receipt.", "بله، ۳۰ روز با رسید."),
                DialogueLine("A", "Perfect. Thanks for your help!", "عالی. ممنون از کمکتون!"),
                DialogueLine("B", "You're welcome. Have a nice day!", "خواهش می‌کنم. روز خوبی داشته باشید!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("پیراهن چقدر بود؟", "۲۵ دلار."),
                ComprehensionQuestion("کفش‌های حراج چقدر بودند؟", "۳۰ دلار."),
                ComprehensionQuestion("مشتری چه سایزی خرید؟", "مدیوم."),
                ComprehensionQuestion("سیاست بازگشت چقدر است؟", "۳۰ روز با رسید.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Role-play shopping for clothes.",
                    "نقش‌بازی: خرید لباس.",
                    "How much is...? / Can I try...?"),
                SpeakingTask("Describe what you're wearing today.",
                    "توصیف کن امروز چی پوشیدی.",
                    "I'm wearing...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your favorite clothes.",
                    "لباس‌های مورد علاقه‌ات رو توصیف کن.",
                    100,
                    "Use colors, sizes, materials.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: How much ___ these shoes?",
                    listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: ___ shirt is nice.",
                    listOf("This", "These", "Those", "Them"), 0),
                QuizQuestion("Complete: I'm ___ a blue shirt.",
                    listOf("wear", "wears", "wearing", "wore"), 2),
                QuizQuestion("Complete: What color ___ it?",
                    listOf("is", "are", "have", "has"), 0),
                QuizQuestion("Complete: ___ shoes are new.",
                    listOf("This", "That", "These", "Them"), 2),
                QuizQuestion("Complete: I want to ___ this shirt.",
                    listOf("buy", "buys", "buying", "bought"), 0),
                QuizQuestion("What does 'on sale' mean?",
                    listOf("حراج", "گران", "خرید", "فروشگاه"), 0),
                QuizQuestion("Complete: How much did you ___?",
                    listOf("buy", "pay", "cost", "spend"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 5 — Travel and Holidays
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Travel and Holidays",
            titlePersian = "سفر و تعطیلات",
            objectives = listOf(
                "Talk about travel plans",
                "Book a hotel and buy tickets",
                "Use present perfect with ever/never",
                "Ask for directions"
            ),
            vocabulary = listOf(
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb",
                    "I love traveling.", "عاشق سفرم."),
                VocabWord("trip", "سفر", "/trɪp/", "noun",
                    "How was your trip?", "سفرت چطور بود؟"),
                VocabWord("ticket", "بلیط", "/ˈtɪkɪt/", "noun",
                    "I bought a ticket.", "یه بلیط خریدم."),
                VocabWord("hotel", "هتل", "/hoʊˈtel/", "noun",
                    "We stayed in a hotel.", "ما در هتل موندیم."),
                VocabWord("airport", "فرودگاه", "/ˈerpɔːrt/", "noun",
                    "The airport is far.", "فرودگاه دوره."),
                VocabWord("passport", "پاسپورت", "/ˈpæspɔːrt/", "noun",
                    "Don't forget your passport!", "پاسپورتت رو فراموش نکن!"),
                VocabWord("luggage", "چمدان", "/ˈlʌɡɪdʒ/", "noun",
                    "My luggage is heavy.", "چمدانم سنگینه."),
                VocabWord("sightseeing", "بازدید از جاذبه‌ها", "/ˈsaɪtsiːɪŋ/", "noun",
                    "We went sightseeing.", "رفتیم بازدید."),
                VocabWord("abroad", "خارج", "/əˈbrɔːd/", "adverb",
                    "She lives abroad.", "او در خارج زندگی می‌کنه."),
                VocabWord("reservation", "رزرو", "/ˌrezərˈveɪʃən/", "noun",
                    "I have a reservation.", "رزرو دارم.")
            ),
            idioms = listOf(
                IdiomExpression("catch a flight", "به پرواز رسیدن",
                    "We need to catch a flight at 6.", "باید ساعت ۶ به پرواز برسیم.", "neutral"),
                IdiomExpression("hit the road", "راه افتادن",
                    "Let's hit the road early.", "بیا زود راه بیفتیم.", "informal"),
                IdiomExpression("off the beaten track", "دور از مسیر معمول",
                    "We visited a village off the beaten track.", "از یه دهکده دور از مسیر معمول بازدید کردیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("travel vs trip",
                    "travel /ˈtrævəl/، trip /trɪp/ — trip کوتاه‌تره."),
                PronunciationTip("passport",
                    "passport /ˈpæspɔːrt/ — استرس روی passport.")
            ),
            culturalNotes = listOf(
                CulturalNote("Travel tips",
                    "در غرب، خرید بیمه سفر رایج است."),
                CulturalNote("Airport customs",
                    "در فرودگاه‌های بین‌المللی، customs و immigration جدا هستند.")
            ),
            grammar = listOf(
                GrammarSection("Present perfect with ever/never",
                    """
                        Have/Has + subject + ever + past participle?

                        Have you ever been to Paris?
                        Yes, I have. / No, I haven't.

                        I've never been to Japan.
                    """.trimIndent()),
                GrammarSection("Past simple vs present perfect",
                    """
                        Past simple: I went to Paris in 2020.
                        Present perfect: I've been to Paris.
                    """.trimIndent()),
                GrammarSection("Booking a hotel",
                    """
                        I'd like to book a room.
                        Do you have any vacancies?
                        How much is it per night?
                        Is breakfast included?
                    """.trimIndent()),
                GrammarSection("Directions",
                    """
                        Go straight.
                        Turn left / right.
                        It's on the corner.

                        How do I get to...?
                        Where is...?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have been to Paris last year.", "I went to Paris last year.", "با زمان مشخص از past simple استفاده می‌کنیم."),
                CommonMistake("Have you ever go to Paris?", "Have you ever been to Paris?", "بعد از have از past participle استفاده می‌کنیم."),
                CommonMistake("next the week", "next week", "بدون the.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you ever been abroad?", "تا حالا خارج بودی؟"),
                DialogueLine("B", "Yes, I have. I've been to Turkey twice.", "بله. دو بار ترکیه بودم."),
                DialogueLine("A", "Nice! When did you go?", "خوبه! کی رفتی؟"),
                DialogueLine("B", "I went last summer with my family.", "تابستان گذشته با خانواده‌ام رفتم."),
                DialogueLine("A", "How was it?", "چطور بود؟"),
                DialogueLine("B", "Amazing. The food was delicious and the people were friendly.", "فوق‌العاده. غذا خوشمزه بود و مردم خوش‌برخورد."),
                DialogueLine("A", "Did you go sightseeing?", "بازدید از جاذبه‌ها کردی؟"),
                DialogueLine("B", "Yes, we visited the Blue Mosque and Topkapi Palace.", "بله، مسجد آبی و کاخ توپکاپی رو دیدیم."),
                DialogueLine("A", "Sounds great. Where did you stay?", "عالی. کجا موندی؟"),
                DialogueLine("B", "In a small hotel near the center. It was cozy.", "در یه هتل کوچیک نزدیک مرکز. دنج بود."),
                DialogueLine("A", "Have you ever traveled alone?", "تا حالا تنها سفر کردی؟"),
                DialogueLine("B", "No, I haven't. But I'd like to try one day.", "نه. ولی دوست دارم یه روز امتحان کنم."),
                DialogueLine("A", "It's fun but sometimes lonely.", "سرگرم‌کننده‌ست ولی گاهی تنهار."),
                DialogueLine("B", "That makes sense. What about you?", "منطقیه. تو چطور؟"),
                DialogueLine("A", "I've been to Italy and France.", "من ایتالیا و فرانسه بودم."),
                DialogueLine("B", "Wow, that's nice! Which did you prefer?", "واو، خوبه! کدوم رو ترجیح دادی؟"),
                DialogueLine("A", "Italy, I think. The art and history were incredible.", "ایتالیا، فکر کنم. هنر و تاریخش باورنکردنی بود."),
                DialogueLine("B", "I'd love to go there someday.", "دوست دارم یه روز برم اونجا."),
                DialogueLine("A", "You should! You'd love it.", "باید بری! عاشقش می‌شی.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند بار ترکیه بوده؟", "دو بار."),
                ComprehensionQuestion("B کجا اقامت داشته؟", "در هتل کوچک نزدیک مرکز."),
                ComprehensionQuestion("A کجاها بوده؟", "ایتالیا و فرانسه."),
                ComprehensionQuestion("A کدوم کشور رو ترجیح داد؟", "ایتالیا.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your travel experiences.",
                    "درباره تجربه‌های سفرت صحبت کن.",
                    "I've been to... / I went to..."),
                SpeakingTask("Ask for directions.",
                    "نقش‌بازی: مسیر بپرس.",
                    "How do I get to...? / Where is...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable trip.",
                    "درباره یه سفر به‌یادماندنی بنویس.",
                    150,
                    "Use past simple and present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: Have you ever ___ to Paris?",
                    listOf("go", "went", "been", "going"), 2),
                QuizQuestion("Complete: I ___ to Paris in 2020.",
                    listOf("have been", "went", "go", "going"), 1),
                QuizQuestion("Complete: I've ___ been to Japan.",
                    listOf("ever", "never", "already", "yet"), 1),
                QuizQuestion("Complete: I'd like to ___ a room.",
                    listOf("book", "books", "booking", "booked"), 0),
                QuizQuestion("Complete: Where ___ the station?",
                    listOf("are", "is", "have", "has"), 1),
                QuizQuestion("Complete: Have you ever ___ abroad?",
                    listOf("be", "being", "been", "was"), 2),
                QuizQuestion("Complete: I ___ a ticket yesterday.",
                    listOf("buy", "bought", "buying", "buys"), 1),
                QuizQuestion("What does 'hit the road' mean?",
                    listOf("زمین خوردن", "راه افتادن", "برگشتن", "توقف"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 6 — Health
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Health",
            titlePersian = "سلامتی",
            objectives = listOf(
                "Talk about health and illness",
                "Use should/shouldn't for advice",
                "Name parts of the body",
                "Make an appointment"
            ),
            vocabulary = listOf(
                VocabWord("head", "سر", "/hed/", "noun",
                    "My head hurts.", "سرم درد می‌کنه."),
                VocabWord("stomach", "شکم", "/ˈstʌmək/", "noun",
                    "I have a stomachache.", "دل‌درد دارم."),
                VocabWord("arm", "بازو", "/ɑːrm/", "noun",
                    "My arm hurts.", "بازوم درد می‌کنه."),
                VocabWord("leg", "پا", "/leɡ/", "noun",
                    "I broke my leg.", "پام شکست."),
                VocabWord("fever", "تب", "/ˈfiːvər/", "noun",
                    "She has a fever.", "او تب داره."),
                VocabWord("headache", "سردرد", "/ˈhedeɪk/", "noun",
                    "I have a headache.", "سردرد دارم."),
                VocabWord("cold", "سرماخوردگی", "/koʊld/", "noun",
                    "I have a cold.", "سرماخورده‌ام."),
                VocabWord("medicine", "دارو", "/ˈmedɪsɪn/", "noun",
                    "Take this medicine.", "این دارو رو بخور."),
                VocabWord("doctor", "دکتر", "/ˈdɑːktər/", "noun",
                    "You should see a doctor.", "باید دکتر بری."),
                VocabWord("hospital", "بیمارستان", "/ˈhɑːspɪtəl/", "noun",
                    "She's in the hospital.", "او در بیمارستانه.")
            ),
            idioms = listOf(
                IdiomExpression("under the weather", "حالش خوب نبودن",
                    "I'm feeling under the weather today.", "امروز حالم خوب نیست.", "informal"),
                IdiomExpression("as fit as a fiddle", "خیلی سالم",
                    "My grandfather is as fit as a fiddle.", "پدربزرگم خیلی سالمه.", "idiom"),
                IdiomExpression("take it easy", "سخت نگیر",
                    "You should take it easy for a few days.", "باید چند روز سخت نگیری.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in health",
                    "health /helθ/، healthy /ˈhelθi/ — صدای /θ/."),
                PronunciationTip("silent h in hour",
                    "hour /ˈaʊər/ — h تلفظ نمی‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Health systems",
                    "در غرب، بیمه درمانی مهم است. در برخی کشورها مثل کانادا و بریتانیا، سیستم دولتی است."),
                CulturalNote("Doctor visits",
                    "در غرب، معمولاً اول به GP (پزشک عمومی) مراجعه می‌کنند.")
            ),
            grammar = listOf(
                GrammarSection("should / shouldn't",
                    """
                        You should rest.
                        You shouldn't eat too much sugar.

                        You should see a doctor.
                    """.trimIndent()),
                GrammarSection("have + illness",
                    """
                        I have a headache.
                        She has a cold.
                        They have the flu.

                        My head hurts.
                        My back hurts.
                    """.trimIndent()),
                GrammarSection("Questions about health",
                    """
                        What's the matter?
                        What's wrong?
                        Are you OK?
                        Do you have a fever?
                    """.trimIndent()),
                GrammarSection("Imperatives for advice",
                    """
                        Take this medicine.
                        Drink more water.
                        Get some rest.
                        Don't eat junk food.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have headache.", "I have a headache.", "قبل از headache از a استفاده می‌کنیم."),
                CommonMistake("You should to rest.", "You should rest.", "بعد از should فعل ساده می‌آید."),
                CommonMistake("My head is pain.", "My head hurts.", "برای درد از hurt استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Hi Sara, you don't look well. Are you OK?", "سلام سارا، خوب به نظر نمی‌رسی. حالت خوبه؟"),
                DialogueLine("B", "Not really. I have a terrible headache and a fever.", "نه واقعاً. سردرد وحشتناک و تب دارم."),
                DialogueLine("A", "Oh no. How long have you felt like this?", "اوه نه. چقدره این‌طوری؟"),
                DialogueLine("B", "Since yesterday evening. I think I have the flu.", "از دیشب. فکر کنم آنفلوانزا گرفتم."),
                DialogueLine("A", "You should see a doctor.", "باید دکتر بری."),
                DialogueLine("B", "I know. Can you take me to the clinic?", "می‌دونم. می‌تونی منو ببری کلینیک؟"),
                DialogueLine("A", "Of course. Let me make an appointment first.", "البته. بذار اول وقت بگیرم."),
                DialogueLine("B", "Thank you so much. I really appreciate it.", "خیلی ممنون. واقعاً قدردانی می‌کنم."),
                DialogueLine("A", "That's what friends are for. Rest until we go.", "دوست برای همین است. تا وقتی بریم استراحت کن."),
                DialogueLine("B", "I will. Thanks again.", "می‌کنم. بازم ممنون."),
                DialogueLine("A", "No problem. See you soon.", "مشکلی نیست. به‌زودی می‌بینمت."),
                DialogueLine("B", "See you. Take care.", "می‌بینمت. مراقب خودت باش.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Sara چه علائمی دارد؟", "سردرد شدید و تب."),
                ComprehensionQuestion("Sara چه بیماری‌ای فکر می‌کند دارد؟", "آنفلوانزا."),
                ComprehensionQuestion("دوستم چه کاری می‌کند؟", "قرار ملاقات با دکتر می‌گیرد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your symptoms to a doctor.",
                    "علائم‌ت رو به دکتر بگو.",
                    "I have... / My ... hurts."),
                SpeakingTask("Give advice to a sick friend.",
                    "به یه دوست بیمار توصیه کن.",
                    "You should... / You shouldn't...")
            ),
            writingTasks = listOf(
                WritingTask("Write about what you do to stay healthy.",
                    "درباره کارهایی که برای سالم موندن انجام می‌دی بنویس.",
                    120,
                    "Use should/shouldn't and health vocabulary.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: You ___ rest.",
                    listOf("should", "should to", "shoulds", "shoulding"), 0),
                QuizQuestion("Complete: I have ___ headache.",
                    listOf("a", "an", "the", "-"), 0),
                QuizQuestion("Complete: My back ___.",
                    listOf("hurt", "hurts", "is hurt", "hurting"), 1),
                QuizQuestion("Complete: You should ___ more water.",
                    listOf("drink", "drinks", "drinking", "drank"), 0),
                QuizQuestion("Complete: She ___ a cold.",
                    listOf("have", "has", "haves", "having"), 1),
                QuizQuestion("What does 'under the weather' mean?",
                    listOf("زیر بارون", "حالش خوب نیست", "خوشحال", "سلامت"), 1),
                QuizQuestion("Complete: You shouldn't ___ junk food.",
                    listOf("eat", "eats", "eating", "ate"), 0),
                QuizQuestion("What does 'take it easy' mean?",
                    listOf("سخت بگیر", "سخت نگیر", "سریع برو", "بخواب"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 7 — Future Plans
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Future Plans",
            titlePersian = "برنامه‌های آینده",
            objectives = listOf(
                "Talk about future plans",
                "Use going to",
                "Use will for predictions",
                "Make arrangements"
            ),
            vocabulary = listOf(
                VocabWord("plan", "برنامه", "/plæn/", "noun",
                    "What's your plan?", "برنامه‌ات چیه؟"),
                VocabWord("tomorrow", "فردا", "/təˈmɑːroʊ/", "adverb",
                    "See you tomorrow!", "فردا می‌بینمت!"),
                VocabWord("next week", "هفته بعد", "/nekst wiːk/", "phrase",
                    "I'll travel next week.", "هفته بعد سفر می‌کنم."),
                VocabWord("soon", "به‌زودی", "/suːn/", "adverb",
                    "I'll see you soon.", "به‌زودی می‌بینمت."),
                VocabWord("visit", "دیدن کردن", "/ˈvɪzɪt/", "verb",
                    "I'll visit my family.", "خانواده‌ام رو می‌بینم."),
                VocabWord("start", "شروع کردن", "/stɑːrt/", "verb",
                    "I'll start a new job.", "یه شغل جدید شروع می‌کنم."),
                VocabWord("learn", "یاد گرفتن", "/lɜːrn/", "verb",
                    "I'm going to learn English.", "می‌خوام انگلیسی یاد بگیرم."),
                VocabWord("dream", "رویا", "/driːm/", "noun",
                    "Follow your dreams!", "رویاهایت را دنبال کن!"),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "My goal is to travel.", "هدفم سفر کردنه."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun",
                    "It's a great opportunity.", "فرصت عالیه.")
            ),
            idioms = listOf(
                IdiomExpression("look forward to", "بی‌صبرانه منتظر بودن",
                    "I'm looking forward to the trip.", "بی‌صبرانه منتظر سفرم.", "neutral"),
                IdiomExpression("on the horizon", "در پیش رو",
                    "Big changes are on the horizon.", "تغییرات بزرگی در پیشه.", "idiom"),
                IdiomExpression("cross that bridge when we come to it", "بعداً تصمیم می‌گیریم",
                    "Let's cross that bridge when we come to it.", "بعداً تصمیم می‌گیریم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("going to → gonna",
                    "در مکالمه سریع، going to به gonna تبدیل می‌شود."),
                PronunciationTip("will contraction",
                    "I'll /aɪl/، you'll /juːl/، we'll /wiːl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("New Year's resolutions",
                    "در غرب، مردم در ابتدای سال اهداف و برنامه‌های جدید تعیین می‌کنند."),
                CulturalNote("Bucket list",
                    "لیست کارهایی که می‌خواهید در زندگی انجام دهید.")
            ),
            grammar = listOf(
                GrammarSection("going to",
                    """
                        am/is/are + going to + verb

                        I'm going to travel to Japan.
                        She's going to start a new job.
                    """.trimIndent()),
                GrammarSection("will",
                    """
                        will + verb

                        I'll help you.
                        It will rain tomorrow.

                        منفی: won't
                        سوال: Will you...?
                    """.trimIndent()),
                GrammarSection("Present continuous for future",
                    """
                        برای قرارهای قطعی:
                        I'm meeting Ali tomorrow at 5.
                    """.trimIndent()),
                GrammarSection("Time expressions",
                    """
                        tomorrow
                        next week / next month / next year
                        this evening / this weekend
                        soon

                        I'll see you next week.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I will to travel.", "I will travel.", "بعد از will فعل ساده می‌آید."),
                CommonMistake("I'm go to travel.", "I'm going to travel.", "شکل درست going to است."),
                CommonMistake("She will travels.", "She will travel.", "بعد از will فعل ساده می‌آید.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you have any plans for the summer?", "برای تابستون برنامه‌ای داری؟"),
                DialogueLine("B", "Yes! I'm going to travel to Turkey.", "بله! می‌خوام برم ترکیه."),
                DialogueLine("A", "That sounds amazing! How long will you stay?", "فوق‌العاده به نظر می‌رسه! چقدر می‌مونی؟"),
                DialogueLine("B", "About two weeks. I'll visit Istanbul and Antalya.", "حدود دو هفته. استانبول و آنتالیا رو می‌بینم."),
                DialogueLine("A", "Have you booked your tickets yet?", "بلیط‌ها رو رزرو کردی؟"),
                DialogueLine("B", "Not yet. I'm going to book them next week.", "هنوز نه. می‌خوام هفته بعد رزرو کنم."),
                DialogueLine("A", "Who are you going with?", "با کی می‌ری؟"),
                DialogueLine("B", "With my brother. He's never been abroad.", "با برادرم. او هرگز خارج نبوده."),
                DialogueLine("A", "That's exciting. Will you stay in hotels?", "هیجان‌انگیزه. در هتل می‌مونید؟"),
                DialogueLine("B", "Yes, but we might try Airbnb for a few nights.", "بله، ولی ممکنه چند شب Airbnb امتحان کنیم."),
                DialogueLine("A", "Nice. What will you do there?", "خوبه. اونجا چیکار می‌کنید؟"),
                DialogueLine("B", "We'll visit historical sites, try local food, and relax on the beach.", "از جاهای تاریخی بازدید می‌کنیم، غذای محلی امتحان می‌کنیم و در ساحل استراحت می‌کنیم."),
                DialogueLine("A", "Sounds perfect. What about you — any plans?", "بی‌نقص به نظر می‌رسه. تو چطور — برنامه‌ای داری؟"),
                DialogueLine("B", "Actually, I'm going to start a new job.", "در واقع، می‌خوام یه شغل جدید شروع کنم."),
                DialogueLine("A", "Wow, big change! When do you start?", "واو، تغییر بزرگیه! کِی شروع می‌کنی؟"),
                DialogueLine("B", "Next month. I'm a little nervous but excited.", "ماه بعد. کمی مضطربم ولی هیجان‌زده."),
                DialogueLine("A", "You'll do great! Good luck!", "عالی عمل می‌کنی! موفق باشی!"),
                DialogueLine("B", "Thanks! Let's catch up after my trip.", "ممنون! بعد از سفرم با هم حرف می‌زنیم."),
                DialogueLine("A", "Sounds like a plan. Have a great trip!", "به نظر برنامه خوبیه. سفر خوبی داشته باشی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B برای تابستان چه برنامه‌ای دارد؟", "به ترکیه سفر می‌کند."),
                ComprehensionQuestion("B با کی سفر می‌کند؟", "با برادرش."),
                ComprehensionQuestion("A چه برنامه‌ای دارد؟", "شروع یک شغل جدید در ماه بعد."),
                ComprehensionQuestion("B چه کارهایی در ترکیه انجام می‌دهد؟", "بازدید تاریخی، غذاهای محلی، استراحت در ساحل.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your summer plans.",
                    "درباره برنامه‌های تابستانی‌ات صحبت کن.",
                    "I'm going to... / I'll..."),
                SpeakingTask("Make plans with a friend.",
                    "با یک دوست برنامه بذار.",
                    "Are you free...? / Let's...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your future plans.",
                    "درباره برنامه‌های آینده‌ات بنویس.",
                    120,
                    "Use going to and will.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ going to travel.",
                    listOf("is", "am", "are", "be"), 1),
                QuizQuestion("Complete: She ___ help you.",
                    listOf("will", "wills", "is will", "to will"), 0),
                QuizQuestion("Complete: I'm ___ Ali tomorrow.",
                    listOf("meet", "meeting", "meets", "met"), 1),
                QuizQuestion("What does 'look forward to' mean?",
                    listOf("منتظر بودن", "ترسیدن", "فراموش کردن", "لغو کردن"), 0),
                QuizQuestion("Complete: They ___ going to visit us.",
                    listOf("is", "am", "are", "be"), 2),
                QuizQuestion("Complete: I ___ call you tonight.",
                    listOf("will", "wills", "am will", "to will"), 0),
                QuizQuestion("Complete: What ___ you do tomorrow?",
                    listOf("are", "will", "is", "do"), 1),
                QuizQuestion("Complete: She ___ travel next week.",
                    listOf("going to", "is going to", "are going to", "will to"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 8 — Work and Study
    // ═══════════════════════════════════════════════════════════
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Work and Study",
            titlePersian = "کار و تحصیل",
            objectives = listOf(
                "Talk about jobs and studies",
                "Describe your job",
                "Use present simple for work",
                "Talk about future career plans"
            ),
            vocabulary = listOf(
                VocabWord("job", "شغل", "/dʒɑːb/", "noun",
                    "What's your job?", "شغلت چیه؟"),
                VocabWord("work", "کار کردن", "/wɜːrk/", "verb",
                    "I work in an office.", "من در دفتر کار می‌کنم."),
                VocabWord("company", "شرکت", "/ˈkʌmpəni/", "noun",
                    "I work for a big company.", "من برای یه شرکت بزرگ کار می‌کنم."),
                VocabWord("office", "دفتر", "/ˈɔːfɪs/", "noun",
                    "My office is downtown.", "دفترم در مرکز شهره."),
                VocabWord("boss", "رئیس", "/bɔːs/", "noun",
                    "My boss is very kind.", "رئیسم خیلی مهربونه."),
                VocabWord("colleague", "همکار", "/ˈkɑːliːɡ/", "noun",
                    "My colleagues are friendly.", "همکارام خوش‌برخوردن."),
                VocabWord("salary", "حقوق", "/ˈsæləri/", "noun",
                    "The salary is good.", "حقوقش خوبه."),
                VocabWord("career", "حرفه", "/kəˈrɪr/", "noun",
                    "I want a better career.", "من حرفه بهتری می‌خوام."),
                VocabWord("university", "دانشگاه", "/ˌjuːnɪˈvɜːrsəti/", "noun",
                    "She studies at a university.", "او در دانشگاه درس می‌خونه."),
                VocabWord("degree", "مدرک", "/dɪˈɡriː/", "noun",
                    "I have a degree in English.", "من مدرک انگلیسی دارم.")
            ),
            idioms = listOf(
                IdiomExpression("work like a dog", "مثل سگ کار کردن",
                    "She works like a dog every day.", "او هر روز مثل سگ کار می‌کنه.", "informal"),
                IdiomExpression("climb the ladder", "پیشرفت کردن در شغل",
                    "He's climbing the career ladder.", "او در حرفه‌اش پیشرفت می‌کنه.", "idiom"),
                IdiomExpression("burn the midnight oil", "تا دیروقت کار کردن",
                    "She's been burning the midnight oil to finish the project.", "او تا دیروقت کار کرده تا پروژه رو تموم کنه.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("career",
                    "career /kəˈrɪr/ — استرس روی سیلاب دوم."),
                PronunciationTip("colleague",
                    "colleague /ˈkɑːliːɡ/ — حرف ue تلفظ نمی‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Work-life balance",
                    "در غرب، تعادل بین کار و زندگی اهمیت زیادی دارد."),
                CulturalNote("Networking",
                    "شبکه‌سازی حرفه‌ای بخش مهمی از پیشرفت شغلی در غرب است.")
            ),
            grammar = listOf(
                GrammarSection("Present simple for work",
                    """
                        I work in a hospital.
                        She teaches at a school.
                        They study at university.
                    """.trimIndent()),
                GrammarSection("Questions about work",
                    """
                        What do you do?
                        Where do you work?
                        What does she do?
                        Does he like his job?
                    """.trimIndent()),
                GrammarSection("Want to / Would like to",
                    """
                        I want to change my job.
                        I'd like to start my own business.

                        want to + verb / would like to + verb
                    """.trimIndent()),
                GrammarSection("Future with going to",
                    """
                        I'm going to look for a new job.
                        She's going to study abroad.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("What is your job?", "What do you do?", "این سؤال رایج‌تره."),
                CommonMistake("I work in Google.", "I work at Google / for Google.", "برای شرکت، از at یا for استفاده می‌کنیم."),
                CommonMistake("I want change my job.", "I want to change my job.", "بعد از want از to + verb استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you do?", "شغلت چیه؟"),
                DialogueLine("B", "I'm a software engineer at a tech company.", "من مهندس نرم‌افزار در یه شرکت فناوری هستم."),
                DialogueLine("A", "That sounds interesting. Do you like it?", "جالب به نظر می‌رسه. دوستش داری؟"),
                DialogueLine("B", "Yes, I do. The work is challenging but rewarding.", "بله. کار چالش‌برانگیزه ولی پاداش‌دهنده."),
                DialogueLine("A", "How long have you worked there?", "چند وقته اونجا کار می‌کنی؟"),
                DialogueLine("B", "About three years. Before that, I worked at a startup.", "حدود سه سال. قبلش در یه استارتاپ کار می‌کردم."),
                DialogueLine("A", "Do you want to stay there long-term?", "می‌خوای بلندمدت اونجا بمونی؟"),
                DialogueLine("B", "I'm not sure. I'd like to start my own business someday.", "مطمئن نیستم. دوست دارم یه روز کسب‌وکار خودم رو شروع کنم."),
                DialogueLine("A", "That's a big goal! What about you?", "هدف بزرگیه! تو چطور؟"),
                DialogueLine("B", "I'm a teacher. I teach at a high school.", "من معلمم. در دبیرستان درس می‌دم."),
                DialogueLine("A", "Nice! Do you enjoy teaching?", "خوبه! از تدریس لذت می‌بری؟"),
                DialogueLine("B", "Most days, yes. Some days are hard, but it's worth it.", "بیشتر روزها بله. بعضی روزها سختن ولی ارزشش رو داره."),
                DialogueLine("A", "That's the key, isn't it? Loving what you do.", "این کلید ماجراست، نه؟ عاشق کارت بودن."),
                DialogueLine("B", "Absolutely. I can't imagine doing anything else.", "قطعاً. نمی‌تونم تصور کنم کار دیگه‌ای بکنم."),
                DialogueLine("A", "That's great. Good luck with everything!", "عالیه. در همه چیز موفق باشی!"),
                DialogueLine("B", "Thanks! You too. Follow your dreams.", "ممنون! تو هم. رویاهات رو دنبال کن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه شغلی دارد؟", "مهندس نرم‌افزار در شرکت فناوری."),
                ComprehensionQuestion("B چه هدف بلندمدتی دارد؟", "شروع کسب‌وکار خودش."),
                ComprehensionQuestion("A چه شغلی دارد؟", "معلم دبیرستان."),
                ComprehensionQuestion("A از کارش راضی است؟", "بیشتر روزها بله، اگرچه بعضی روزها سخت است.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your job or studies.",
                    "درباره شغل یا تحصیلت صحبت کن.",
                    "I work as... / I study..."),
                SpeakingTask("Describe your dream job.",
                    "شغل رویایی‌ات رو توصیف کن.",
                    "I'd like to be... / I want to...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your job or dream job.",
                    "درباره شغلت یا شغل رویایی‌ات بنویس.",
                    120,
                    "Use present simple and want to/would like to.")
            ),
            quiz = listOf(
                QuizQuestion("What does 'What do you do?' mean?",
                    listOf("چیکار می‌کنی؟", "شغلت چیه؟", "کجایی؟", "چطوری؟"), 1),
                QuizQuestion("Complete: I work ___ a hospital.",
                    listOf("in", "on", "at", "for"), 0),
                QuizQuestion("Complete: I want ___ change my job.",
                    listOf("to", "for", "at", "on"), 0),
                QuizQuestion("Complete: She ___ at a school.",
                    listOf("teach", "teaches", "teaching", "taught"), 1),
                QuizQuestion("Complete: I work ___ Google.",
                    listOf("in", "on", "at", "of"), 2),
                QuizQuestion("What does 'burn the midnight oil' mean?",
                    listOf("خوابیدن", "تا دیروقت کار کردن", "سریع کار کردن", "کم کار کردن"), 1),
                QuizQuestion("Complete: I have a degree ___ English.",
                    listOf("on", "in", "at", "for"), 1),
                QuizQuestion("Complete: They ___ at university.",
                    listOf("study", "studies", "studying", "studied"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 9 — Free Time
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Free Time",
            titlePersian = "وقت آزاد",
            objectives = listOf(
                "Talk about hobbies and interests",
                "Use like / love / enjoy + verb-ing",
                "Talk about sports and games",
                "Invite someone to do something"
            ),
            vocabulary = listOf(
                VocabWord("hobby", "سرگرمی", "/ˈhɑːbi/", "noun",
                    "My hobby is reading.", "سرگرمی من کتاب خواندنه."),
                VocabWord("read", "خواندن", "/riːd/", "verb",
                    "I like reading books.", "دوست دارم کتاب بخونم."),
                VocabWord("play", "بازی کردن", "/pleɪ/", "verb",
                    "I play football.", "من فوتبال بازی می‌کنم."),
                VocabWord("watch", "تماشا کردن", "/wɑːtʃ/", "verb",
                    "I watch movies.", "من فیلم تماشا می‌کنم."),
                VocabWord("listen", "گوش دادن", "/ˈlɪsən/", "verb",
                    "I listen to music.", "من به موسیقی گوش می‌دم."),
                VocabWord("cook", "آشپزی کردن", "/kʊk/", "verb",
                    "I love cooking.", "عاشق آشپزی هستم."),
                VocabWord("swim", "شنا کردن", "/swɪm/", "verb",
                    "Can you swim?", "می‌تونی شنا کنی؟"),
                VocabWord("draw", "نقاشی کشیدن", "/drɔː/", "verb",
                    "She draws very well.", "او خیلی خوب نقاشی می‌کشه."),
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb",
                    "We travel every summer.", "ما هر تابستان سفر می‌کنیم."),
                VocabWord("meet friends", "دیدن دوستان", "/miːt frendz/", "phrase",
                    "I meet friends on Fridays.", "جمعه‌ها دوستام رو می‌بینم.")
            ),
            idioms = listOf(
                IdiomExpression("kill time", "وقت کشتن",
                    "I read magazines to kill time.", "برای کشتن وقت مجله می‌خونم.", "informal"),
                IdiomExpression("have a blast", "خیلی خوش گذروندن",
                    "We had a blast at the party.", "توی مهمونی خیلی خوش گذروندیم.", "informal"),
                IdiomExpression("hang out", "وقت گذراندن",
                    "I hang out with friends on weekends.", "آخر هفته‌ها با دوستام وقت می‌گذرونم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ing",
                    "در فعل‌های مثل swimming، /ɪŋ/ تلفظ می‌شود."),
                PronunciationTip("can / can't",
                    "can't در انگلیسی آمریکایی /kænt/ و در بریتانیایی /kɑːnt/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Weekend activities",
                    "در غرب، آخر هفته‌ها برای ورزش، سینما، رستوران و تفریح استفاده می‌شود."),
                CulturalNote("Outdoor hobbies",
                    "پیاده‌روی، کوه‌نوردی و پیک‌نیک از فعالیت‌های رایج آخر هفته در غرب است.")
            ),
            grammar = listOf(
                GrammarSection("Like + verb-ing",
                    """
                        I like reading.
                        I love cooking.
                        I enjoy swimming.
                        I hate waiting.

                        Do you like reading?
                    """.trimIndent()),
                GrammarSection("can / can't",
                    """
                        I can swim.
                        She can cook.
                        They can't speak French.

                        Can you drive? — Yes, I can.
                    """.trimIndent()),
                GrammarSection("Present simple questions",
                    """
                        Do you + verb...?
                        Does he/she + verb...?

                        Do you play sports?
                        Does she like cooking?
                    """.trimIndent()),
                GrammarSection("go + verb-ing",
                    """
                        go swimming
                        go shopping
                        go dancing

                        I go swimming every Sunday.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I like read books.", "I like reading books.", "بعد از like فعل +ing."),
                CommonMistake("I can to swim.", "I can swim.", "بعد از can فعل ساده می‌آید (بدون to)."),
                CommonMistake("She cans cook.", "She can cook.", "can همیشه ثابت است."),
                CommonMistake("I go to swimming.", "I go swimming.", "go + verb-ing بدون to.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you do in your free time?", "وقت آزادت چیکار می‌کنی؟"),
                DialogueLine("B", "I love reading and watching movies. What about you?", "عاشق کتاب خواندن و فیلم دیدنم. تو چطور؟"),
                DialogueLine("A", "I enjoy cooking. I try new recipes every weekend.", "من از آشپزی لذت می‌برم. هر آخر هفته دستور پخت جدید امتحان می‌کنم."),
                DialogueLine("B", "That's cool! Can you cook Persian food?", "باحاله! می‌تونی غذای ایرانی بپزی؟"),
                DialogueLine("A", "Yes, I can! My mother taught me.", "بله! مادرم یادم داد."),
                DialogueLine("B", "What's your favorite dish to cook?", "غذای مورد علاقه‌ات برای پختن چیه؟"),
                DialogueLine("A", "I love making ghormeh sabzi. It's delicious.", "عاشق درست کردن قرمه سبزی هستم. خوشمزه‌ست."),
                DialogueLine("B", "I've never tried it. Maybe you can teach me!", "تا حالا امتحانش نکردم. شاید بتونی یادم بدی!"),
                DialogueLine("A", "Sure! What sports do you play?", "حتماً! چه ورزشی می‌کنی؟"),
                DialogueLine("B", "I play tennis. I go swimming too.", "تنیس بازی می‌کنم. شنا هم می‌رم."),
                DialogueLine("A", "Can you swim well?", "خوب شنا می‌کنی؟"),
                DialogueLine("B", "Yes, I can. I learned when I was five.", "بله. پنج سالگی یاد گرفتم."),
                DialogueLine("A", "That's great. Do you play any instruments?", "عالیه. ساز هم می‌زنی؟"),
                DialogueLine("B", "I play the guitar, but not very well.", "گیتار می‌زنم، ولی نه خیلی خوب."),
                DialogueLine("A", "That's still impressive! I can't play anything.", "این هم قابل تحسینه! من هیچی نمی‌تونم بزنم."),
                DialogueLine("B", "You could learn! It's never too late.", "می‌تونی یاد بگیری! هیچ‌وقت دیر نیست."),
                DialogueLine("A", "Maybe I will. Thanks for the encouragement.", "شاید یاد بگیرم. ممنون برای تشویق."),
                DialogueLine("B", "Anytime! Let me know if you want lessons.", "هر وقت! اگه کلاس خواستی خبرم کن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("A وقت آزادش چیکار می‌کنه؟", "آشپزی می‌کنه و دستور پخت جدید امتحان می‌کنه."),
                ComprehensionQuestion("B چه ورزش‌هایی می‌کنه؟", "تنیس بازی می‌کنه و شنا می‌ره."),
                ComprehensionQuestion("B چه سازی می‌زنه؟", "گیتار می‌زنه، ولی نه خیلی خوب."),
                ComprehensionQuestion("A چه غذایی رو دوست داره بپزه؟", "قرمه سبزی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your hobbies.",
                    "درباره سرگرمی‌هات صحبت کن.",
                    "I like... / I love... / I enjoy..."),
                SpeakingTask("Invite someone to do something.",
                    "کسی رو برای انجام کاری دعوت کن.",
                    "Do you want to...? / Would you like to...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite hobby.",
                    "درباره سرگرمی مورد علاقه‌ات بنویس.",
                    100,
                    "Use like + verb-ing.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I like ___ books.",
                    listOf("read", "reading", "to read", "reads"), 1),
                QuizQuestion("Complete: She can ___ very well.",
                    listOf("to cook", "cooks", "cook", "cooking"), 2),
                QuizQuestion("Complete: I go ___ on Sundays.",
                    listOf("to swim", "swimming", "swim", "swims"), 1),
                QuizQuestion("What does 'hang out' mean?",
                    listOf("آویزون شدن", "وقت گذراندن", "بیرون رفتن", "خرید کردن"), 1),
                QuizQuestion("Complete: ___ you play tennis?",
                    listOf("Are", "Do", "Is", "Does"), 1),
                QuizQuestion("Complete: She ___ play the piano.",
                    listOf("can", "cans", "is can", "to can"), 0),
                QuizQuestion("Complete: I ___ cooking.",
                    listOf("enjoy", "enjoys", "enjoying", "enjoyed"), 0),
                QuizQuestion("What does 'have a blast' mean?",
                    listOf("انفجار", "خیلی خوش گذروندن", "بیرون رفتن", "دویدن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 10 — Celebrations
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Celebrations",
            titlePersian = "جشن‌ها",
            objectives = listOf(
                "Talk about celebrations",
                "Use will for future",
                "Invite and accept invitations",
                "Describe parties"
            ),
            vocabulary = listOf(
                VocabWord("celebration", "جشن", "/ˌselɪˈbreɪʃən/", "noun",
                    "It was a big celebration.", "یه جشن بزرگ بود."),
                VocabWord("party", "مهمانی", "/ˈpɑːrti/", "noun",
                    "We had a party.", "ما یه مهمونی داشتیم."),
                VocabWord("birthday", "تولد", "/ˈbɜːrθdeɪ/", "noun",
                    "Happy birthday!", "تولدت مبارک!"),
                VocabWord("wedding", "عروسی", "/ˈwedɪŋ/", "noun",
                    "Their wedding was beautiful.", "عروسیشون زیبا بود."),
                VocabWord("guest", "مهمان", "/ɡest/", "noun",
                    "We had 50 guests.", "۵۰ مهمان داشتیم."),
                VocabWord("present", "هدیه", "/ˈprezənt/", "noun",
                    "I got a nice present.", "یه هدیه خوب گرفتم."),
                VocabWord("decorate", "تزئین کردن", "/ˈdekəreɪt/", "verb",
                    "We decorated the house.", "خونه رو تزئین کردیم."),
                VocabWord("invite", "دعوت کردن", "/ɪnˈvaɪt/", "verb",
                    "I invited my friends.", "دوستام رو دعوت کردم."),
                VocabWord("celebrate", "جشن گرفتن", "/ˈselɪbreɪt/", "verb",
                    "We celebrated together.", "با هم جشن گرفتیم."),
                VocabWord("tradition", "سنت", "/trəˈdɪʃən/", "noun",
                    "It's a family tradition.", "این یه سنت خانوادگیه.")
            ),
            idioms = listOf(
                IdiomExpression("throw a party", "مهمونی گرفتن",
                    "We're throwing a party tonight.", "امشب مهمونی می‌گیریم.", "informal"),
                IdiomExpression("get together", "دور هم جمع شدن",
                    "Let's get together for New Year.", "بیا برای سال نو دور هم جمع شیم.", "neutral"),
                IdiomExpression("break the ice", "یخ را شکستن",
                    "Games help break the ice at parties.", "بازی‌ها به شکستن یخ در مهمونی کمک می‌کنند.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Happy birthday!",
                    "Happy /ˈhæpi/، birthday /ˈbɜːrθdeɪ/ — استرس روی first syllable."),
                PronunciationTip("celebrate",
                    "celebrate /ˈselɪbreɪt/ — استرس روی cel.")
            ),
            culturalNotes = listOf(
                CulturalNote("Christmas",
                    "در غرب، Christmas (۲۵ دسامبر) بزرگ‌ترین جشن سال است."),
                CulturalNote("New Year",
                    "New Year's Eve (31 دسامبر) جشن بزرگی است.")
            ),
            grammar = listOf(
                GrammarSection("will for future",
                    """
                        We'll have a party.
                        She'll come tomorrow.
                        They won't be late.

                        Will you come?
                    """.trimIndent()),
                GrammarSection("Invitations",
                    """
                        Would you like to come?
                        Do you want to join us?
                        Can you come to my party?

                        Yes, I'd love to! / Sorry, I can't.
                    """.trimIndent()),
                GrammarSection("Present continuous for arrangements",
                    """
                        I'm having a party on Saturday.
                        We're meeting at 7.
                    """.trimIndent()),
                GrammarSection("Time expressions",
                    """
                        on + روز: on Saturday
                        at + ساعت: at 7 PM
                        in + ماه: in December

                        My birthday is on May 5th.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I will to come.", "I will come.", "بعد از will فعل ساده می‌آید."),
                CommonMistake("My birthday is in May 5th.", "My birthday is on May 5th.", "برای تاریخ از on استفاده می‌کنیم."),
                CommonMistake("Would you like come?", "Would you like to come?", "بعد از would like to + verb.")
            ),
            conversation = listOf(
                DialogueLine("A", "Are you doing anything special this weekend?", "این آخر هفته کار خاصی داری؟"),
                DialogueLine("B", "Yes! It's my sister's birthday on Saturday.", "بله! شنبه تولد خواهرمه."),
                DialogueLine("A", "Oh nice! Are you throwing a party?", "اوه خوبه! مهمونی می‌گیرید؟"),
                DialogueLine("B", "Yes, we're having a small party at home.", "بله، یه مهمونی کوچیک خونه می‌گیریم."),
                DialogueLine("A", "That sounds fun. What will you do?", "خوب به نظر می‌رسه. چیکار می‌کنید؟"),
                DialogueLine("B", "We'll have dinner, play games, and sing.", "شام می‌خوریم، بازی می‌کنیم و آواز می‌خونیم."),
                DialogueLine("A", "Will you decorate the house?", "خونه رو تزئین می‌کنید؟"),
                DialogueLine("B", "Yes, we'll decorate with balloons and lights.", "بله، با بادکنک و چراغ تزئین می‌کنیم."),
                DialogueLine("A", "What present will you give her?", "چه هدیه‌ای بهش می‌دی؟"),
                DialogueLine("B", "I'll give her a book. She loves reading.", "یه کتاب بهش می‌دم. عاشق کتاب خوندنه."),
                DialogueLine("A", "Perfect. Would you like to come to my birthday too?", "عالی. دوست داری به تولد من هم بیای؟"),
                DialogueLine("B", "Of course! When is it?", "حتماً! کِیه؟"),
                DialogueLine("A", "Next Saturday. We're having a dinner party.", "شنبه بعد. مهمونی شام داریم."),
                DialogueLine("B", "I'd love to. What time?", "دوست دارم. چه ساعتی؟"),
                DialogueLine("A", "At 7. Will you bring your sister?", "ساعت ۷. خواهرت رو میاری؟"),
                DialogueLine("B", "Sure. What should we bring?", "حتماً. چی بیاریم؟"),
                DialogueLine("A", "Just yourselves. And a good mood!", "فقط خودتون. و یه حال خوب!"),
                DialogueLine("B", "Great, we'll be there!", "عالی، اونجا هستیم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("تولد کی است؟", "خواهر B."),
                ComprehensionQuestion("B چه نوع مهمونی می‌گیرد؟", "مهمونی کوچک در خانه."),
                ComprehensionQuestion("B چه هدیه‌ای می‌دهد؟", "کتاب."),
                ComprehensionQuestion("قرار ساعت چند است؟", "ساعت ۷.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a celebration you enjoy.",
                    "درباره یک جشن که دوست داری صحبت کن.",
                    "I love... / We usually..."),
                SpeakingTask("Invite a friend to a party.",
                    "یه دوست رو به مهمونی دعوت کن.",
                    "Would you like to...? / Can you come...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about a celebration you attended.",
                    "درباره یک جشن که رفتی بنویس.",
                    150,
                    "Use past simple and will for future.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: We ___ have a party.",
                    listOf("will", "wills", "are will", "to will"), 0),
                QuizQuestion("Complete: Would you like ___ come?",
                    listOf("to", "for", "at", "on"), 0),
                QuizQuestion("Complete: My birthday is ___ May 5th.",
                    listOf("in", "on", "at", "for"), 1),
                QuizQuestion("What does 'throw a party' mean?",
                    listOf("پرت کردن", "مهمونی گرفتن", "بازی کردن", "پختن"), 1),
                QuizQuestion("Complete: I ___ having a party.",
                    listOf("is", "am", "are", "be"), 1),
                QuizQuestion("Complete: She ___ come tomorrow.",
                    listOf("will", "wills", "is will", "to will"), 0),
                QuizQuestion("Complete: We're meeting ___ 7 PM.",
                    listOf("in", "on", "at", "for"), 2),
                QuizQuestion("What does 'get together' mean?",
                    listOf("جدا شدن", "دور هم جمع شدن", "سفر کردن", "خرید کردن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 11 — Environment
    // ═══════════════════════════════════════════════════════════
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Environment",
            titlePersian = "محیط زیست",
            objectives = listOf(
                "Talk about the environment",
                "Use the first conditional",
                "Give advice about the environment",
                "Talk about green habits"
            ),
            vocabulary = listOf(
                VocabWord("environment", "محیط زیست", "/ɪnˈvaɪrənmənt/", "noun",
                    "We must protect the environment.", "باید از محیط زیست محافظت کنیم."),
                VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun",
                    "Air pollution is a problem.", "آلودگی هوا یک مشکله."),
                VocabWord("recycle", "بازیافت کردن", "/ˌriːˈsaɪkəl/", "verb",
                    "We recycle paper and plastic.", "ما کاغذ و پلاستیک بازیافت می‌کنیم."),
                VocabWord("waste", "زباله / هدر دادن", "/weɪst/", "noun/verb",
                    "Don't waste water.", "آب رو هدر نده."),
                VocabWord("energy", "انرژی", "/ˈenərdʒi/", "noun",
                    "Solar energy is clean.", "انرژی خورشیدی پاکه."),
                VocabWord("climate", "اقلیم", "/ˈklaɪmət/", "noun",
                    "Climate change is real.", "تغییر اقلیم واقعیه."),
                VocabWord("protect", "محافظت کردن", "/prəˈtekt/", "verb",
                    "We should protect nature.", "باید از طبیعت محافظت کنیم."),
                VocabWord("plastic", "پلاستیک", "/ˈplæstɪk/", "noun",
                    "Plastic bags are bad.", "کیسه‌های پلاستیکی بد هستن."),
                VocabWord("green", "سبز / دوستدار محیط زیست", "/ɡriːn/", "adjective",
                    "We need green solutions.", "به راه‌حل‌های سبز نیاز داریم."),
                VocabWord("save", "ذخیره کردن", "/seɪv/", "verb",
                    "Save water and electricity.", "آب و برق رو ذخیره کن.")
            ),
            idioms = listOf(
                IdiomExpression("go green", "دوستدار محیط زیست شدن",
                    "Many companies are going green.", "بسیاری از شرکت‌ها دارن سبز می‌شن.", "informal"),
                IdiomExpression("carbon footprint", "ردپای کربن",
                    "Reduce your carbon footprint.", "ردپای کربنت رو کم کن.", "neutral"),
                IdiomExpression("save the planet", "نجات سیاره",
                    "We must save the planet.", "باید سیاره رو نجات بدیم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("environment",
                    "environment /ɪnˈvaɪrənmənt/ — استرس روی viron."),
                PronunciationTip("recycle",
                    "recycle /ˌriːˈsaɪkəl/ — سه سیلاب با استرس روی cy.")
            ),
            culturalNotes = listOf(
                CulturalNote("Earth Day",
                    "22 آپریل، روز زمین، بزرگ‌ترین رویداد زیست‌محیطی جهانی است."),
                CulturalNote("Recycling",
                    "در بسیاری از کشورهای غربی، بازیافت یک قانون جدی است.")
            ),
            grammar = listOf(
                GrammarSection("First conditional",
                    """
                        If + present simple, will + verb

                        If we recycle, we will help the planet.
                        If you don't save water, we will have problems.

                        برای موقعیت‌های واقعی و ممکن در آینده.
                    """.trimIndent()),
                GrammarSection("should / shouldn't for environment",
                    """
                        We should recycle more.
                        We shouldn't waste water.
                        You should use public transport.
                    """.trimIndent()),
                GrammarSection("Imperatives for advice",
                    """
                        Recycle paper and plastic.
                        Don't waste energy.
                        Turn off the lights.
                        Save water.
                    """.trimIndent()),
                GrammarSection("Present simple for facts",
                    """
                        The Earth is getting warmer.
                        Many animals are in danger.
                        Pollution affects everyone.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If we will recycle, we help.", "If we recycle, we will help.", "در if-clause از present simple استفاده می‌کنیم."),
                CommonMistake("We should to recycle.", "We should recycle.", "بعد از should فعل ساده می‌آید."),
                CommonMistake("Don't waste the water.", "Don't waste water.", "بدون the.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you do anything for the environment?", "برای محیط زیست کاری می‌کنی؟"),
                DialogueLine("B", "Yes, I recycle paper, plastic, and glass.", "بله، کاغذ، پلاستیک و شیشه رو بازیافت می‌کنم."),
                DialogueLine("A", "That's great. Do you do anything else?", "عالیه. کار دیگه‌ای هم می‌کنی؟"),
                DialogueLine("B", "I try not to waste water. I take short showers.", "سعی می‌کنم آب رو هدر ندم. دوش‌های کوتاه می‌گیرم."),
                DialogueLine("A", "Good habit! I should do that too.", "عادت خوبی! منم باید این کار رو بکنم."),
                DialogueLine("B", "What about you? Do you recycle?", "تو چطور؟ بازیافت می‌کنی؟"),
                DialogueLine("A", "Not much, honestly. But I use public transport.", "صادقانه نه زیاد. ولی از حمل و نقل عمومی استفاده می‌کنم."),
                DialogueLine("B", "That's great! It reduces pollution.", "عالیه! آلودگی رو کم می‌کنه."),
                DialogueLine("A", "What do you think is the biggest problem?", "فکر می‌کنی بزرگ‌ترین مشکل چیه؟"),
                DialogueLine("B", "Climate change, I think. It affects everyone.", "تغییر اقلیم، فکر کنم. همه رو تحت تأثیر قرار می‌ده."),
                DialogueLine("A", "You're right. If we don't act, things will get worse.", "حق داری. اگه اقدام نکنیم، بدتر می‌شه."),
                DialogueLine("B", "Exactly. Small changes matter.", "دقیقاً. تغییرات کوچک مهمن."),
                DialogueLine("A", "What should we do first?", "اول باید چیکار کنیم؟"),
                DialogueLine("B", "Recycle more, save water and energy, use public transport.", "بازیافت بیشتر، ذخیره آب و انرژی، استفاده از حمل و نقل عمومی."),
                DialogueLine("A", "Those are all doable. I'll try to do them.", "همه‌شون شدنی هستن. سعی می‌کنم انجامشون بدم."),
                DialogueLine("B", "Great! Together we can make a difference.", "عالی! با هم می‌تونیم تفاوت ایجاد کنیم."),
                DialogueLine("A", "I hope so. Every action counts.", "امیدوارم. هر اقدامی مهمه."),
                DialogueLine("B", "Absolutely. Save the planet!", "قطعاً. سیاره رو نجات بدیم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه کارهایی برای محیط زیست می‌کند؟", "بازیافت، صرفه‌جویی در آب."),
                ComprehensionQuestion("A چه کار می‌کند؟", "از حمل و نقل عمومی استفاده می‌کند."),
                ComprehensionQuestion("B بزرگ‌ترین مشکل را چه می‌داند؟", "تغییر اقلیم."),
                ComprehensionQuestion("پیشنهاد B برای کمک به محیط زیست چیست؟", "بازیافت، ذخیره آب و انرژی، حمل و نقل عمومی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about environmental problems.",
                    "درباره مشکلات زیست‌محیطی صحبت کن.",
                    "Pollution is... / We should..."),
                SpeakingTask("Give advice about the environment.",
                    "درباره محیط زیست توصیه کن.",
                    "You should... / If we...")
            ),
            writingTasks = listOf(
                WritingTask("Write about what you do for the environment.",
                    "درباره کارهایی که برای محیط زیست می‌کنی بنویس.",
                    120,
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
                QuizQuestion("Complete: We ___ protect the environment.",
                    listOf("should", "shoulds", "shoulding", "should to"), 0),
                QuizQuestion("Complete: Pollution ___ everyone.",
                    listOf("affect", "affects", "affecting", "affected"), 1),
                QuizQuestion("What does 'carbon footprint' mean?",
                    listOf("ردپا", "ردپای کربن", "ردیابی", "گاز"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 12 — Review and Practice
    // ═══════════════════════════════════════════════════════════
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review and Practice",
            titlePersian = "مرور و تمرین",
            objectives = listOf(
                "Review all tenses",
                "Practice everyday conversations",
                "Use all grammar structures",
                "Prepare for real-life English"
            ),
            vocabulary = listOf(
                VocabWord("review", "مرور", "/rɪˈvjuː/", "noun/verb",
                    "Let's review the lesson.", "بیا درس رو مرور کنیم."),
                VocabWord("practice", "تمرین", "/ˈpræktɪs/", "noun/verb",
                    "Practice makes perfect.", "تمرین باعث پیشرفت می‌شه."),
                VocabWord("improve", "بهتر کردن", "/ɪmˈpruːv/", "verb",
                    "I want to improve my English.", "می‌خوام انگلیسی‌ام رو بهتر کنم."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective",
                    "I feel more confident now.", "الان با اعتماد به نفس‌ترم."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "You're making great progress.", "داری پیشرفت خوبی می‌کنی."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "English is a fun challenge.", "انگلیسی چالش سرگرم‌کننده‌ایه."),
                VocabWord("fluent", "روان", "/ˈfluːənt/", "adjective",
                    "I want to be fluent in English.", "می‌خوام در انگلیسی روان باشم."),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun",
                    "It's OK to make mistakes.", "اشتباه کردن اشکالی نداره."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb",
                    "Continue practicing every day.", "هر روز تمرین رو ادامه بده."),
                VocabWord("succeed", "موفق شدن", "/səkˈsiːd/", "verb",
                    "You will succeed if you try.", "اگه تلاش کنی موفق می‌شی.")
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
                PronunciationTip("Natural speech",
                    "در گفتار طبیعی، انگلیسی‌زبانان کلمات را به هم می‌چسبانند (linking).")
            ),
            culturalNotes = listOf(
                CulturalNote("Language learning",
                    "یادگیری زبان یک فرایند طولانی است. صبر و تمرین مداوم کلید موفقیت است."),
                CulturalNote("Mistakes",
                    "در فرهنگ غربی، اشتباه کردن بخش طبیعی یادگیری است.")
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
                GrammarSection("Review: Future",
                    """
                        I'll help you.
                        I'm going to travel.
                    """.trimIndent()),
                GrammarSection("Review: Present perfect",
                    """
                        I've been to London.
                        Have you ever eaten sushi?
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
                    150,
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