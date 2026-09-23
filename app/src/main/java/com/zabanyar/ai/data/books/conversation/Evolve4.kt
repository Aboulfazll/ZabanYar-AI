package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object Evolve4 {

    const val BOOK_ID = "evolve_4"

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

    // UNIT 1 — Plans, Goals, and Possibilities
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Plans, Goals, and Possibilities",
            titlePersian = "برنامه‌ها، هدف‌ها و احتمالات",
            objectives = listOf("Talk about future plans", "Use will, going to, and present continuous", "Make predictions", "Use the first conditional"),
            vocabulary = listOf(
                VocabWord("intention", "قصد", "/ɪnˈtenʃən/", "noun", "My intention is to improve.", "قصد من بهتر کردنه."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun", "My goal is to speak confidently.", "هدفم صحبت با اعتماد به نفسه."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun", "This is a good opportunity.", "فرصت خوبیه."),
                VocabWord("likely", "محتمل", "/ˈlaɪkli/", "adjective", "It's likely that I'll stay.", "احتمالاً می‌مونم."),
                VocabWord("schedule", "برنامه زمانی", "/ˈskedʒuːl/", "noun", "My schedule is busy.", "برنامه‌ام شلوغه."),
                VocabWord("flexible", "انعطاف‌پذیر", "/ˈfleksəbəl/", "adjective", "My hours are flexible.", "ساعاتم انعطاف‌پذیره."),
                VocabWord("priority", "اولویت", "/praɪˈɔːrəti/", "noun", "Family is my priority.", "خانواده اولویتمه."),
                VocabWord("commit", "متعهد شدن", "/kəˈmɪt/", "verb", "I can't commit right now.", "الان نمی‌تونم متعهد شم.", "verb"),
                VocabWord("expect", "انتظار داشتن", "/ɪkˈspekt/", "verb", "I expect to finish by Friday.", "انتظار دارم تا جمعه تموم شه.", "verb"),
                VocabWord("possibility", "احتمال", "/ˌpɑːsəˈbɪləti/", "noun", "There's a possibility of moving.", "احتمال نقل مکان هست."),
                VocabWord("deadline", "ضرب‌الاجل", "/ˈdedlaɪn/", "noun", "The deadline is next month.", "ضرب‌الاجل ماه بعده."),
                VocabWord("prepare", "آماده شدن", "/prɪˈper/", "verb", "I need to prepare for the exam.", "باید آماده شم.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("Have something in mind", "چیزی در ذهن داشتن", "Do you have anything in mind?", "چیزی در ذهن داری؟", "informal"),
                IdiomExpression("Take the next step", "قدم بعدی را برداشتن", "Time to take the next step.", "وقتشه قدم بعدی رو بردارم.", "neutral"),
                IdiomExpression("Play it by ear", "بی‌برنامه پیش رفتن", "We'll play it by ear.", "بی‌برنامه پیش می‌ریم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("going to → gonna", "در گفتار طبیعی gonna."),
                PronunciationTip("Contractions with will", "I'll, you'll, he'll, she'll.")
            ),
            culturalNotes = listOf(
                CulturalNote("Talking about plans", "پرسیدن درباره برنامه‌های آینده رایجه."),
                CulturalNote("Personal goals", "بحث اهداف شخصی رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Will for Future", "I'll help you. / It will rain tomorrow."),
                GrammarSection("Be Going To for Plans", "I'm going to study abroad."),
                GrammarSection("Present Continuous for Arrangements", "I'm meeting Sara at six."),
                GrammarSection("First Conditional", "If I save money, I'll travel.")
            ),
            commonMistakes = listOf(
                CommonMistake("I will to study.", "I will study.", "بعد از will فعل ساده."),
                CommonMistake("If I will have time...", "If I have time...", "در if از present simple."),
                CommonMistake("I'm go to travel.", "I'm going to travel.", "going to نه go to."),
                CommonMistake("She going to study.", "She is going to study.", "be لازمه."),
                CommonMistake("I'm meet my friend.", "I'm meeting my friend.", "verb-ing.")
            ),
            conversation = listOf(
                DialogueLine("Sara", "Hey Mark! Any plans for the summer?", "سلام مارک! برنامه‌ای داری؟"),
                DialogueLine("Mark", "Yes! I'm going to visit my brother in Canada.", "بله! می‌خوام برم دیدن برادرم."),
                DialogueLine("Sara", "How long are you staying?", "چقدر می‌مونی؟"),
                DialogueLine("Mark", "About three weeks. I've never been there.", "حدود سه هفته. تا حالا نرفته‌ام."),
                DialogueLine("Sara", "You'll love it. I went two years ago.", "عاشقش می‌شی."),
                DialogueLine("Mark", "What do you recommend I see?", "چی ببینم؟"),
                DialogueLine("Sara", "Definitely Vancouver and the Rocky Mountains.", "قطعاً ونکوور و کوه‌های راکی."),
                DialogueLine("Mark", "I'll add those to my list. What about you?", "اضافه می‌کنم. تو چطور؟"),
                DialogueLine("Sara", "I'm starting a new job next month.", "ماه بعد شغل جدید شروع می‌کنم."),
                DialogueLine("Mark", "What kind of job?", "چه نوع شغلی؟"),
                DialogueLine("Sara", "Marketing at a tech company.", "بازاریابی در یه شرکت فناوری."),
                DialogueLine("Mark", "Great opportunity.", "فرصت خوبیه."),
                DialogueLine("Sara", "Thanks! Nervous but excited.", "ممنون! مضطرب ولی هیجان‌زده."),
                DialogueLine("Mark", "What are your goals?", "اهدافت چیه؟"),
                DialogueLine("Sara", "To learn as much as possible.", "یادگیری هر چه بیشتر."),
                DialogueLine("Mark", "Smart approach. Are you moving?", "هوشمندانه. نقل مکان می‌کنی؟"),
                DialogueLine("Sara", "No, the office is close.", "نه، دفتر نزدیکه."),
                DialogueLine("Mark", "Time for vacation?", "برای تعطیلات وقت داری؟"),
                DialogueLine("Sara", "If I get time off, I'll visit my parents.", "اگه مرخصی بگیرم، می‌رم دیدن والدینم."),
                DialogueLine("Mark", "Sounds nice. Let's keep in touch!", "خوبه. در تماس باشیم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Mark چه برنامه‌ای دارد؟", "به دیدن برادرش در کانادا می‌رود."),
                ComprehensionQuestion("چقدر می‌ماند؟", "حدود سه هفته."),
                ComprehensionQuestion("Sara چه توصیه‌ای می‌کند؟", "ونکوور و کوه‌های راکی."),
                ComprehensionQuestion("هدف Sara چیست؟", "یادگیری هر چه بیشتر.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your plans for the next six months.", "درباره برنامه‌هایت صحبت کن.", "I'm going to... / I'll..."),
                SpeakingTask("Ask about future goals.", "درباره اهداف آینده بپرس.", "What are your goals?")
            ),
            writingTasks = listOf(
                WritingTask("Write about your plans and goals.", "درباره برنامه‌ها و اهدافت بنویس.", 150, "Use will, going to, and first conditional.")
            ),
            quiz = listOf(
                QuizQuestion("I ___ visit my brother in Canada.", listOf("am going to", "go", "going to", "will to"), 0),
                QuizQuestion("If I ___ enough money, I'll travel.", listOf("will save", "save", "saved", "am saving"), 1),
                QuizQuestion("I'm ___ Sara at six.", listOf("meet", "meeting", "meets", "met"), 1),
                QuizQuestion("Choose the correct sentence.", listOf("She going to study.", "She is going to study.", "She is go to study.", "She will to study."), 1),
                QuizQuestion("Difference between will and going to?", listOf("No difference", "Will: spontaneous; going to: plans", "Will: past", "Will: informal"), 1),
                QuizQuestion("I promise I ___ call you.", listOf("am", "will", "going to", "do"), 1),
                QuizQuestion("What does 'flexible' mean?", listOf("Strict", "Able to change easily", "Expensive", "Slow"), 1),
                QuizQuestion("Choose correct question.", listOf("What you are going to do?", "What are you going to do?", "What going you?", "What do you going?"), 1)
            )
        )
    }

    // UNIT 2 — The Way We Are
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "The Way We Are",
            titlePersian = "آن‌گونه که هستیم",
            objectives = listOf("Describe personality", "Use comparatives and superlatives", "Talk about similarities", "Use adverbs of manner"),
            vocabulary = listOf(
                VocabWord("personality", "شخصیت", "/ˌpɜːrsəˈnæləti/", "noun", "She has a great personality.", "شخصیت عالی داره."),
                VocabWord("outgoing", "اجتماعی", "/ˈaʊtɡoʊɪŋ/", "adjective", "He's very outgoing.", "خیلی اجتماعیه."),
                VocabWord("shy", "خجالتی", "/ʃaɪ/", "adjective", "She's a bit shy.", "یه کم خجالتیه."),
                VocabWord("reliable", "قابل اعتماد", "/rɪˈlaɪəbəl/", "adjective", "He's very reliable.", "قابل اعتماده."),
                VocabWord("generous", "سخاوتمند", "/ˈdʒenərəs/", "adjective", "She's very generous.", "سخاوتمنده."),
                VocabWord("stubborn", "لجباز", "/ˈstʌbərn/", "adjective", "He can be stubborn.", "لجباز می‌شه."),
                VocabWord("patient", "صبور", "/ˈpeɪʃənt/", "adjective", "She's very patient.", "صبوره."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective", "He's confident.", "با اعتماد به نفسه."),
                VocabWord("similar", "مشابه", "/ˈsɪmələr/", "adjective", "We're similar.", "شبیه همیم."),
                VocabWord("different", "متفاوت", "/ˈdɪfrənt/", "adjective", "They're different.", "متفاوتن."),
                VocabWord("behave", "رفتار کردن", "/bɪˈheɪv/", "verb", "He behaves well.", "خوب رفتار می‌کنه.", "verb"),
                VocabWord("character", "منش", "/ˈkærəktər/", "noun", "She has a strong character.", "منش قوی داره.")
            ),
            idioms = listOf(
                IdiomExpression("people person", "آدم اجتماعی", "She's a real people person.", "آدم اجتماعیه.", "informal"),
                IdiomExpression("set in your ways", "به عادت‌ها پایبند", "My dad is set in his ways.", "بابام به عادت‌هاش پایبنده.", "idiom"),
                IdiomExpression("heart of gold", "قلب طلایی", "She has a heart of gold.", "قلب طلایی داره.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Word stress", "personality /ˌpɜːrsəˈnæləti/."),
                PronunciationTip("th in patient", "patient /ˈpeɪʃənt/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Describing people", "توصیف شخصیت رایجه."),
                CulturalNote("Compliments", "تعریف کردن مؤدبانه.")
            ),
            grammar = listOf(
                GrammarSection("Comparatives", "-er + than / more + adjective + than"),
                GrammarSection("Superlatives", "the + -est / the most + adjective"),
                GrammarSection("as...as", "She's as tall as her mother."),
                GrammarSection("Adverbs of manner", "quickly, carefully, well, badly")
            ),
            commonMistakes = listOf(
                CommonMistake("She is more tall.", "She is taller.", "صفت کوتاه: -er."),
                CommonMistake("He is the most tall.", "He is the tallest.", "صفت کوتاه: -est."),
                CommonMistake("She looks like friendly.", "She looks friendly.", "look + adjective.")
            ),
            conversation = listOf(
                DialogueLine("A", "Tell me about your best friend.", "درباره بهترین دوستت بگو."),
                DialogueLine("B", "Her name is Maryam. She's incredibly kind.", "اسمش مریمه. خیلی مهربونه."),
                DialogueLine("A", "What's she like?", "چه جوریه؟"),
                DialogueLine("B", "She's outgoing and funny, but also reliable.", "اجتماعی و بامزه، ولی قابل اعتماد."),
                DialogueLine("A", "How is she different from you?", "چطور فرق داره؟"),
                DialogueLine("B", "She's more outgoing than me. I'm quieter.", "از من اجتماعی‌تره."),
                DialogueLine("A", "Do you have similar interests?", "علایق مشابه دارید؟"),
                DialogueLine("B", "Yes, we both love reading and hiking.", "بله، هر دو عاشق کتاب و کوه‌نوردی."),
                DialogueLine("A", "How long have you known each other?", "چند وقته می‌شناسید؟"),
                DialogueLine("B", "Since childhood.", "از بچگی."),
                DialogueLine("A", "What makes her a good friend?", "چی خوبش می‌کنه؟"),
                DialogueLine("B", "She listens carefully and supports me.", "با دقت گوش می‌ده و حمایت می‌کنه."),
                DialogueLine("A", "She sounds wonderful.", "فوق‌العاده به نظر می‌رسه."),
                DialogueLine("B", "She has a heart of gold.", "قلب طلایی داره."),
                DialogueLine("A", "You're lucky.", "خوش‌شانسی."),
                DialogueLine("B", "I know. Good friends are rare.", "می‌دونم. دوستان خوب کمیابن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("دوست B چه ویژگی‌هایی دارد؟", "مهربان، اجتماعی، بامزه، قابل اعتماد."),
                ComprehensionQuestion("تفاوت B و دوستش چیست؟", "دوستش اجتماعی‌تر است."),
                ComprehensionQuestion("چند وقت است می‌شناسند؟", "از بچگی."),
                ComprehensionQuestion("چه چیزی او را خاص می‌کند؟", "گوش دادن و حمایت.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your best friend.", "بهترین دوستت رو توصیف کن.", "She's... / She has..."),
                SpeakingTask("Compare yourself with a family member.", "خودت رو با یکی مقایسه کن.", "I'm... than...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your personality.", "درباره شخصیتت بنویس.", 150, "Use adjectives and comparatives.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She's ___ than me.", listOf("tall", "taller", "tallest", "more tall"), 1),
                QuizQuestion("Complete: He's the ___ person I know.", listOf("kind", "kinder", "kindest", "more kind"), 2),
                QuizQuestion("Complete: She's more outgoing ___ me.", listOf("that", "than", "then", "as"), 1),
                QuizQuestion("What does 'heart of gold' mean?", listOf("قلب طلا", "قلب طلایی", "ثروتمند", "مهربان"), 1),
                QuizQuestion("Complete: They're ___ similar.", listOf("very", "much", "many", "more"), 0),
                QuizQuestion("Complete: He behaves ___ .", listOf("careful", "carefully", "care", "carefuly"), 1),
                QuizQuestion("What does 'people person' mean?", listOf("تنها", "اجتماعی", "خجالتی", "جدی"), 1),
                QuizQuestion("Complete: I'm not ___ funny as him.", listOf("as", "than", "so", "more"), 0)
            )
        )
    }

    // UNIT 3 — Getting There
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Getting There",
            titlePersian = "رسیدن به آنجا",
            objectives = listOf("Talk about travel", "Use present perfect for experiences", "Use for and since", "Discuss travel plans"),
            vocabulary = listOf(
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb", "I love traveling.", "عاشق سفرم.", "verb"),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun", "It was a long journey.", "سفر طولانی بود."),
                VocabWord("destination", "مقصد", "/ˌdestɪˈneɪʃən/", "noun", "Our destination is Paris.", "مقصد پاریسه."),
                VocabWord("flight", "پرواز", "/flaɪt/", "noun", "The flight was delayed.", "پرواز تأخیر داشت."),
                VocabWord("luggage", "چمدان", "/ˈlʌɡɪdʒ/", "noun", "My luggage is heavy.", "چمدانم سنگینه."),
                VocabWord("passport", "پاسپورت", "/ˈpæspɔːrt/", "noun", "Don't forget your passport.", "پاسپورتت رو فراموش نکن."),
                VocabWord("book", "رزرو کردن", "/bʊk/", "verb", "I need to book a hotel.", "باید هتل رزرو کنم.", "verb"),
                VocabWord("arrive", "رسیدن", "/əˈraɪv/", "verb", "We arrived late.", "دیر رسیدیم.", "verb"),
                VocabWord("depart", "حرکت کردن", "/dɪˈpɑːrt/", "verb", "The train departs at noon.", "قطار ظهر می‌ره.", "verb"),
                VocabWord("explore", "کاوش کردن", "/ɪkˈsplɔːr/", "verb", "Let's explore the city.", "بیا کاوش کنیم.", "verb"),
                VocabWord("abroad", "خارج", "/əˈbrɔːd/", "adverb", "She lives abroad.", "در خارج زندگی می‌کنه."),
                VocabWord("experience", "تجربه", "/ɪkˈspɪriəns/", "noun", "It was a great experience.", "تجربه عالی بود.")
            ),
            idioms = listOf(
                IdiomExpression("off the beaten track", "دور از مسیر معمول", "We visited places off the beaten track.", "از مکان‌های دور بازدید کردیم.", "idiom"),
                IdiomExpression("hit the road", "راه افتادن", "Let's hit the road early.", "بیا زود راه بیفتیم.", "informal"),
                IdiomExpression("catch a flight", "به پرواز رسیدن", "We need to catch a flight at 6.", "باید به پرواز برسیم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Present perfect contractions", "I've, you've, he's."),
                PronunciationTip("For and since", "for /fɔːr/، since /sɪns/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Travel insurance", "بیمه سفر رایجه."),
                CulturalNote("Airport etiquette", "customs و immigration.")
            ),
            grammar = listOf(
                GrammarSection("Present perfect for experiences", "I've visited Paris."),
                GrammarSection("For and since", "for + مدت، since + نقطه شروع."),
                GrammarSection("Present perfect vs simple past", "I've been to Japan. / I went in 2020."),
                GrammarSection("Future plans", "I'm going to travel.")
            ),
            commonMistakes = listOf(
                CommonMistake("I have been to Paris last year.", "I went to Paris last year.", "زمان مشخص = past simple."),
                CommonMistake("Have you ever go?", "Have you ever been?", "past participle."),
                CommonMistake("I've lived here since 5 years.", "I've lived here for 5 years.", "for مدت.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you ever been abroad?", "خارج بودی؟"),
                DialogueLine("B", "Yes! I've been to Turkey twice.", "بله! دو بار ترکیه."),
                DialogueLine("A", "When did you go?", "کی رفتی؟"),
                DialogueLine("B", "I went last summer with my family.", "تابستان گذشته با خانواده."),
                DialogueLine("A", "How was it?", "چطور بود؟"),
                DialogueLine("B", "Amazing. The food was incredible.", "فوق‌العاده بود."),
                DialogueLine("A", "Where did you stay?", "کجا موندی؟"),
                DialogueLine("B", "In a small hotel near the center.", "هتل کوچیک نزدیک مرکز."),
                DialogueLine("A", "Have you ever traveled alone?", "تنها سفر کردی؟"),
                DialogueLine("B", "No, but I'd like to try.", "نه، ولی دوست دارم."),
                DialogueLine("A", "I've been to Italy and France.", "من ایتالیا و فرانسه بودم."),
                DialogueLine("B", "Which did you prefer?", "کدوم رو ترجیح دادی؟"),
                DialogueLine("A", "Italy. The art was incredible.", "ایتالیا. هنرش عالی بود."),
                DialogueLine("B", "I'd love to go someday.", "دوست دارم یه روز برم."),
                DialogueLine("A", "You should! You'd love it.", "باید بری!"),
                DialogueLine("B", "Maybe next year. I'm saving money.", "شاید سال بعد. پس‌انداز می‌کنم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند بار ترکیه بوده؟", "دو بار."),
                ComprehensionQuestion("B کجا اقامت داشته؟", "هتل کوچک."),
                ComprehensionQuestion("A کجاها بوده؟", "ایتالیا و فرانسه."),
                ComprehensionQuestion("B دوست دارد کجا برود؟", "ایتالیا.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a place you've visited.", "درباره جایی که رفتی صحبت کن.", "I've been to..."),
                SpeakingTask("Discuss your travel plans.", "درباره برنامه‌های سفر صحبت کن.", "I'm going to...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable trip.", "درباره یه سفر بنویس.", 180, "Use present perfect and past simple.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: Have you ever ___ to Paris?", listOf("go", "went", "been", "going"), 2),
                QuizQuestion("Complete: I ___ to Paris in 2020.", listOf("have been", "went", "go", "going"), 1),
                QuizQuestion("Complete: I've lived here ___ 5 years.", listOf("since", "for", "in", "at"), 1),
                QuizQuestion("Complete: I've lived here ___ 2020.", listOf("since", "for", "in", "at"), 0),
                QuizQuestion("What does 'hit the road' mean?", listOf("زمین خوردن", "راه افتادن", "برگشتن", "توقف"), 1),
                QuizQuestion("Complete: I'd like to ___ a hotel.", listOf("book", "books", "booking", "booked"), 0),
                QuizQuestion("What does 'off the beaten track' mean?", listOf("دور از مسیر", "توی مسیر", "کنار جاده", "توی شهر"), 0),
                QuizQuestion("Complete: I ___ a ticket yesterday.", listOf("buy", "bought", "buying", "buys"), 1)
            )
        )
    }

    // UNIT 4 — Life Lessons
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Life Lessons",
            titlePersian = "درس‌های زندگی",
            objectives = listOf("Discuss experiences", "Use present perfect with already, yet, just", "Talk about regrets", "Use wish + past simple"),
            vocabulary = listOf(
                VocabWord("lesson", "درس", "/ˈlesən/", "noun", "I learned an important lesson.", "درس مهمی یاد گرفتم."),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun", "We all make mistakes.", "همه اشتباه می‌کنیم."),
                VocabWord("regret", "پشیمانی", "/rɪˈɡret/", "noun", "I have no regrets.", "پشیمانی ندارم."),
                VocabWord("learn", "یاد گرفتن", "/lɜːrn/", "verb", "I learned a lot.", "زیاد یاد گرفتم.", "verb"),
                VocabWord("experience", "تجربه", "/ɪkˈspɪriəns/", "noun", "It was valuable.", "ارزشمند بود."),
                VocabWord("grow", "رشد کردن", "/ɡroʊ/", "verb", "I've grown a lot.", "رشد کردم.", "verb"),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun", "Every challenge teaches.", "هر چالش می‌آموزه."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun", "Every mistake is an opportunity.", "هر اشتباه یه فرصته."),
                VocabWord("decision", "تصمیم", "/dɪˈsɪʒən/", "noun", "A difficult decision.", "تصمیم سخت."),
                VocabWord("advice", "توصیه", "/ədˈvaɪs/", "noun", "Good advice is valuable.", "توصیه خوب ارزشمنده."),
                VocabWord("wise", "دانا", "/waɪz/", "adjective", "She's very wise.", "داناست."),
                VocabWord("patience", "صبر", "/ˈpeɪʃəns/", "noun", "Patience is key.", "صبر کلیدیه.")
            ),
            idioms = listOf(
                IdiomExpression("learn the hard way", "با سختی یاد گرفتن", "I learned the hard way.", "با سختی یاد گرفتم.", "idiom"),
                IdiomExpression("turn over a new leaf", "شروع تازه", "She turned over a new leaf.", "شروع تازه‌ای کرد.", "idiom"),
                IdiomExpression("live and learn", "زندگی کن و یاد بگیر", "Live and learn.", "زندگی کن و یاد بگیر.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Present perfect with just", "I've just finished."),
                PronunciationTip("Already / yet", "already در مثبت، yet در منفی.")
            ),
            culturalNotes = listOf(
                CulturalNote("Self-reflection", "بازنگری رایجه."),
                CulturalNote("Learning from mistakes", "یادگیری از اشتباهات.")
            ),
            grammar = listOf(
                GrammarSection("Present perfect with already, yet, just", "I've already finished. / I haven't finished yet. / I've just started."),
                GrammarSection("Wish + past simple", "I wish I had more time."),
                GrammarSection("Wish + past perfect", "I wish I had studied harder."),
                GrammarSection("Regret + verb-ing", "I regret not traveling more.")
            ),
            commonMistakes = listOf(
                CommonMistake("I've already finish.", "I've already finished.", "past participle."),
                CommonMistake("I didn't finished yet.", "I haven't finished yet.", "present perfect."),
                CommonMistake("I wish I have more time.", "I wish I had more time.", "wish + past.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you learned any life lessons?", "درس زندگی یاد گرفتی؟"),
                DialogueLine("B", "Yes. I've just learned to be more patient.", "بله. یاد گرفتم صبورتر باشم."),
                DialogueLine("A", "What happened?", "چی شد؟"),
                DialogueLine("B", "I made a mistake at work.", "یه اشتباه در کار کردم."),
                DialogueLine("A", "But you learned?", "ولی یاد گرفتی؟"),
                DialogueLine("B", "Exactly. I've grown a lot.", "دقیقاً. رشد کردم."),
                DialogueLine("A", "That's mature.", "پخته‌ست."),
                DialogueLine("B", "Now I see mistakes as opportunities.", "حالا اشتباهات رو فرصت می‌بینم."),
                DialogueLine("A", "Any regrets?", "پشیمانی؟"),
                DialogueLine("B", "I wish I had learned this earlier.", "ای کاش زودتر یاد گرفته بودم."),
                DialogueLine("A", "We all feel that way.", "همه گاهی همین‌طوریم."),
                DialogueLine("B", "True. Better late than never.", "درسته. دیر رسیدن بهتر از هرگز نرسیدنه."),
                DialogueLine("A", "Exactly. Live and learn.", "دقیقاً. زندگی کن و یاد بگیر."),
                DialogueLine("B", "What about you?", "تو چطور؟"),
                DialogueLine("A", "I've learned to appreciate small things.", "یاد گرفتم از چیزهای کوچک قدردانی کنم."),
                DialogueLine("B", "Good one.", "درس خوبیه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه درسی یاد گرفت؟", "صبورتر بودن."),
                ComprehensionQuestion("B چه پشیمانی دارد؟", "ای کاش زودتر یاد گرفته بود."),
                ComprehensionQuestion("A چه درسی یاد گرفته؟", "قدردانی از چیزهای کوچک."),
                ComprehensionQuestion("نگرش B چیست؟", "اشتباهات فرصتند.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a lesson you've learned.", "درباره درسی که یاد گرفتی صحبت کن.", "I've learned..."),
                SpeakingTask("Express regrets.", "پشیمانی‌ات رو بگو.", "I wish I had...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a life lesson.", "درباره یه درس زندگی بنویس.", 180, "Use present perfect and wish.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I've ___ finished.", listOf("already", "yet", "just", "ever"), 0),
                QuizQuestion("Complete: I haven't finished ___.", listOf("already", "yet", "just", "ever"), 1),
                QuizQuestion("Complete: I wish I ___ more time.", listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("What does 'learn the hard way' mean?", listOf("با آسانی", "با سختی", "کمک", "درس"), 1),
                QuizQuestion("Complete: I regret ___ my job.", listOf("leave", "leaving", "to leave", "left"), 1),
                QuizQuestion("What does 'turn over a new leaf' mean?", listOf("برگ", "شروع تازه", "ریختن", "خواندن"), 1),
                QuizQuestion("Complete: I ___ a lot this year.", listOf("grow", "grew", "grown", "growing"), 2),
                QuizQuestion("What does 'live and learn' mean?", listOf("زندگی کن و یاد بگیر", "زندگی سخته", "یاد بگیر", "زندگی کن"), 0)
            )
        )
    }

    // UNIT 5 — A Change of Plan
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "A Change of Plan",
            titlePersian = "تغییر برنامه",
            objectives = listOf("Discuss changes in plans", "Use the second conditional", "Talk about hypothetical situations", "Express alternatives"),
            vocabulary = listOf(
                VocabWord("change", "تغییر", "/tʃeɪndʒ/", "noun", "A change of plan.", "تغییر برنامه."),
                VocabWord("cancel", "لغو کردن", "/ˈkænsəl/", "verb", "They canceled the flight.", "پرواز رو لغو کردن.", "verb"),
                VocabWord("postpone", "به تعویق انداختن", "/poʊˈspoʊn/", "verb", "We postponed the meeting.", "جلسه رو به تعویق انداختیم.", "verb"),
                VocabWord("reschedule", "زمان جدید تعیین کردن", "/ˌriːˈskedʒuːl/", "verb", "We rescheduled for Monday.", "برای دوشنبه تعیین کردیم.", "verb"),
                VocabWord("alternative", "جایگزین", "/ɔːlˈtɜːrnətɪv/", "noun", "An alternative plan.", "برنامه جایگزین."),
                VocabWord("unexpected", "غیرمنتظره", "/ˌʌnɪkˈspektɪd/", "adjective", "It was unexpected.", "غیرمنتظره بود."),
                VocabWord("flexible", "انعطاف‌پذیر", "/ˈfleksəbəl/", "adjective", "We need to be flexible.", "باید انعطاف‌پذیر باشیم."),
                VocabWord("adapt", "سازگار شدن", "/əˈdæpt/", "verb", "We had to adapt.", "باید سازگار می‌شدیم.", "verb"),
                VocabWord("situation", "موقعیت", "/ˌsɪtʃuˈeɪʃən/", "noun", "A difficult situation.", "موقعیت سخت."),
                VocabWord("solve", "حل کردن", "/sɑːlv/", "verb", "We solved the problem.", "مشکل رو حل کردیم.", "verb"),
                VocabWord("issue", "مشکل", "/ˈɪʃuː/", "noun", "A small issue.", "مشکل کوچیک."),
                VocabWord("arrangement", "هماهنگی", "/əˈreɪndʒmənt/", "noun", "New arrangements.", "هماهنگی‌های جدید.")
            ),
            idioms = listOf(
                IdiomExpression("up in the air", "نامعلوم", "The plan is up in the air.", "برنامه نامعلومه.", "idiom"),
                IdiomExpression("back to square one", "برگشتن به اول", "We're back to square one.", "به اول برگشتیم.", "idiom"),
                IdiomExpression("go with the flow", "با جریان پیش رفتن", "Go with the flow.", "با جریان پیش برو.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Second conditional", "If I had more time, I would travel."),
                PronunciationTip("would reduction", "would → 'd.")
            ),
            culturalNotes = listOf(
                CulturalNote("Flexibility", "انعطاف ارزشمنده."),
                CulturalNote("Plan changes", "تغییر برنامه رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Second conditional", "If + past simple, would + verb."),
                GrammarSection("If I were you", "If I were you, I'd..."),
                GrammarSection("Alternatives", "We could... / Maybe we should..."),
                GrammarSection("Making new plans", "Let's reschedule.")
            ),
            commonMistakes = listOf(
                CommonMistake("If I would have time...", "If I had time...", "second conditional."),
                CommonMistake("If I was you...", "If I were you...", "were برای همه."),
                CommonMistake("I would to go.", "I would go.", "بعد از would فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "Did you hear about the flight?", "درباره پرواز شنیدی؟"),
                DialogueLine("B", "No, what happened?", "نه، چی شد؟"),
                DialogueLine("A", "It was canceled due to the storm.", "به خاطر طوفان لغو شد."),
                DialogueLine("B", "Oh no! What are we going to do?", "اوه نه! چیکار کنیم؟"),
                DialogueLine("A", "We need an alternative plan.", "به برنامه جایگزین نیاز داریم."),
                DialogueLine("B", "If we had booked earlier, we wouldn't be here.", "اگه زودتر رزرو کرده بودیم..."),
                DialogueLine("A", "I know. But let's focus on solutions.", "می‌دونم. ولی روی راه‌حل‌ها تمرکز کنیم."),
                DialogueLine("B", "We could take the train instead.", "می‌تونیم قطار بگیریم."),
                DialogueLine("A", "How long does it take?", "چقدر طول می‌کشه؟"),
                DialogueLine("B", "About six hours.", "حدود شش ساعت."),
                DialogueLine("A", "Let's book tickets now.", "بیا الان بلیط رزرو کنیم."),
                DialogueLine("B", "Good idea. Sometimes you go with the flow.", "فکر خوبی. گاهی باید با جریان پیش بری."),
                DialogueLine("A", "Exactly. Flexibility is key.", "دقیقاً. انعطاف کلیدیه."),
                DialogueLine("B", "Let me check availability.", "بذار چک کنم."),
                DialogueLine("A", "Thanks. Glad we're solving this together.", "ممنون. خوشحالم با هم حلش می‌کنیم."),
                DialogueLine("B", "Me too. Teamwork!", "منم. کار تیمی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("چه اتفاقی افتاد؟", "پرواز لغو شد."),
                ComprehensionQuestion("راه‌حل چیست؟", "گرفتن قطار."),
                ComprehensionQuestion("چه چیزی کلیدیه؟", "انعطاف."),
                ComprehensionQuestion("B چه پیشنهادی داد؟", "رزرو بلیط قطار.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss a change of plan.", "درباره تغییر برنامه صحبت کن.", "If we had..., we would..."),
                SpeakingTask("Make alternative suggestions.", "پیشنهاد جایگزین بده.", "We could... / How about...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about a time your plans changed.", "درباره تغییر برنامه‌ات بنویس.", 180, "Use second conditional.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If I ___ time, I would travel.", listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: If I ___ you, I'd wait.", listOf("am", "was", "were", "be"), 2),
                QuizQuestion("Complete: I would ___ to Paris.", listOf("go", "going", "to go", "went"), 0),
                QuizQuestion("What does 'up in the air' mean?", listOf("در هوا", "نامعلوم", "بالا", "پایین"), 1),
                QuizQuestion("Complete: We could ___ the train.", listOf("take", "takes", "taking", "took"), 0),
                QuizQuestion("What does 'back to square one' mean?", listOf("برگشتن به اول", "برنده شدن", "شروع", "تمام"), 0),
                QuizQuestion("Complete: How about ___ tickets?", listOf("book", "booking", "to book", "booked"), 1),
                QuizQuestion("What does 'go with the flow' mean?", listOf("با جریان پیش رفتن", "شنا کردن", "آب خوردن", "راه رفتن"), 0)
            )
        )
    }

    // UNIT 6 — Living Together
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Living Together",
            titlePersian = "زندگی با هم",
            objectives = listOf("Discuss relationships", "Use relative clauses", "Talk about compromise", "Express opinions"),
            vocabulary = listOf(
                VocabWord("roommate", "هم‌اتاقی", "/ˈruːmmeɪt/", "noun", "My roommate is friendly.", "هم‌اتاقیم خوش‌برخرده."),
                VocabWord("compromise", "سازش", "/ˈkɑːmprəmaɪz/", "noun", "Compromise is important.", "سازش مهمه."),
                VocabWord("cooperate", "همکاری کردن", "/koʊˈɑːpəreɪt/", "verb", "We cooperate well.", "خوب همکاری می‌کنیم.", "verb"),
                VocabWord("share", "به اشتراک گذاشتن", "/ʃer/", "verb", "We share the kitchen.", "آشپزخانه رو شریکیم.", "verb"),
                VocabWord("respect", "احترام", "/rɪˈspekt/", "noun", "Respect is key.", "احترام کلیدیه."),
                VocabWord("boundary", "مرز", "/ˈbaʊndri/", "noun", "We set boundaries.", "مرزها رو تعیین کردیم."),
                VocabWord("chore", "کار خانه", "/tʃɔːr/", "noun", "We divide the chores.", "کارها رو تقسیم می‌کنیم."),
                VocabWord("privacy", "حریم خصوصی", "/ˈpraɪvəsi/", "noun", "Privacy matters.", "حریم خصوصی مهمه."),
                VocabWord("conflict", "درگیری", "/ˈkɑːnflɪkt/", "noun", "We resolve conflicts.", "درگیری‌ها رو حل می‌کنیم."),
                VocabWord("understand", "درک کردن", "/ˌʌndərˈstænd/", "verb", "We understand each other.", "همدیگه رو درک می‌کنیم.", "verb"),
                VocabWord("tolerate", "تحمل کردن", "/ˈtɑːləreɪt/", "verb", "We tolerate differences.", "تفاوت‌ها رو تحمل می‌کنیم.", "verb"),
                VocabWord("communicate", "ارتباط برقرار کردن", "/kəˈmjuːnɪkeɪt/", "verb", "We communicate openly.", "باز ارتباط داریم.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("get along", "کنار آمدن", "We get along well.", "خوب کنار میایم.", "neutral"),
                IdiomExpression("meet halfway", "به توافق رسیدن", "We meet halfway.", "به توافق می‌رسیم.", "idiom"),
                IdiomExpression("walk on eggshells", "با احتیاط رفتار کردن", "I'm walking on eggshells.", "با احتیاط رفتار می‌کنم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Relative clauses", "The person who lives with me..."),
                PronunciationTip("Contractions", "We've, they've, I'd.")
            ),
            culturalNotes = listOf(
                CulturalNote("Living with others", "زندگی مشترک رایجه."),
                CulturalNote("Setting boundaries", "تعیین مرزها مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Relative clauses", "The person who lives with me..."),
                GrammarSection("Defining vs non-defining", "My friend who lives here... / My friend, who lives here, ..."),
                GrammarSection("Should for advice", "You should talk to your roommate."),
                GrammarSection("Expressing opinions", "I think... / In my opinion...")
            ),
            commonMistakes = listOf(
                CommonMistake("The person which lives with me.", "The person who lives with me.", "برای افراد who."),
                CommonMistake("We don't get on well with us.", "We don't get along well.", "get along بدون with us."),
                CommonMistake("We should to talk.", "We should talk.", "بعد از should فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "How's living with your roommate?", "زندگی با هم‌اتاقی چطوره؟"),
                DialogueLine("B", "Pretty good. We get along well.", "خوب. خوب کنار میایم."),
                DialogueLine("A", "What makes it work?", "چی موفقش می‌کنه؟"),
                DialogueLine("B", "Communication and respect.", "ارتباط و احترام."),
                DialogueLine("A", "Do you have conflicts?", "درگیری دارید؟"),
                DialogueLine("B", "Sometimes. But we resolve them calmly.", "گاهی. ولی آروم حل می‌کنیم."),
                DialogueLine("A", "How do you handle differences?", "با تفاوت‌ها چطور؟"),
                DialogueLine("B", "We compromise. We meet halfway.", "سازش می‌کنیم. به توافق می‌رسیم."),
                DialogueLine("A", "Do you share chores?", "کارها رو تقسیم می‌کنید؟"),
                DialogueLine("B", "Yes, we divide everything equally.", "بله، مساوی تقسیم می‌کنیم."),
                DialogueLine("A", "What advice would you give?", "توصیه‌ای؟"),
                DialogueLine("B", "Set clear boundaries from the start.", "از اول مرزها رو تعیین کن."),
                DialogueLine("A", "Do you like living with someone?", "دوست داری با کسی زندگی کنی؟"),
                DialogueLine("B", "Most of the time. Nice to have company.", "بیشتر وقت‌ها. همراه خوبه."),
                DialogueLine("A", "I can imagine.", "می‌تونم تصور کنم."),
                DialogueLine("B", "But it requires patience.", "ولی صبر می‌خواد."),
                DialogueLine("A", "Everything good does.", "هر چیز خوبی همین‌طوره."),
                DialogueLine("B", "Exactly. Nothing worth having is easy.", "دقیقاً. هیچ چیز ارزشمندی آسان نیست.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("چی زندگی مشترک را موفق می‌کند؟", "ارتباط و احترام."),
                ComprehensionQuestion("درگیری‌ها چطور حل می‌شوند؟", "آرام و با سازش."),
                ComprehensionQuestion("توصیه B چیست؟", "تعیین مرزها از اول."),
                ComprehensionQuestion("آیا B دوست دارد؟", "بیشتر وقت‌ها بله.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss living with a roommate.", "درباره زندگی با هم‌اتاقی صحبت کن.", "We get along..."),
                SpeakingTask("Talk about setting boundaries.", "درباره تعیین مرزها صحبت کن.", "I think... / You should...")
            ),
            writingTasks = listOf(
                WritingTask("Write about what makes a good roommate.", "درباره ویژگی‌های هم‌اتاقی خوب بنویس.", 180, "Use relative clauses.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The person ___ lives with me.", listOf("which", "who", "whose", "where"), 1),
                QuizQuestion("Complete: We get ___ well.", listOf("on", "along", "with", "in"), 1),
                QuizQuestion("What does 'meet halfway' mean?", listOf("نصف راه", "به توافق رسیدن", "دور هم", "کنار هم"), 1),
                QuizQuestion("Complete: You should ___ to your roommate.", listOf("talk", "talks", "talking", "talked"), 0),
                QuizQuestion("What does 'walk on eggshells' mean?", listOf("با احتیاط", "راه رفتن", "تخم مرغ", "شکستن"), 0),
                QuizQuestion("Complete: We share ___ kitchen.", listOf("a", "an", "the", "-"), 2),
                QuizQuestion("Complete: We ___ well.", listOf("cooperate", "cooperates", "cooperating", "cooperated"), 0),
                QuizQuestion("Complete: ___ we resolve issues calmly.", listOf("Some time", "Sometimes", "Sometime", "Some times"), 1)
            )
        )
    }

    // UNIT 7 — Media and Technology
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Media and Technology",
            titlePersian = "رسانه و تکنولوژی",
            objectives = listOf("Discuss media and technology", "Use reported speech", "Talk about digital habits", "Express opinions"),
            vocabulary = listOf(
                VocabWord("media", "رسانه", "/ˈmiːdiə/", "noun", "Media shapes opinion.", "رسانه نظر می‌سازه."),
                VocabWord("device", "دستگاه", "/dɪˈvaɪs/", "noun", "I use many devices.", "دستگاه‌های زیادی استفاده می‌کنم."),
                VocabWord("screen", "صفحه", "/skriːn/", "noun", "Too much screen time is bad.", "زمان زیاد صفحه مضره."),
                VocabWord("app", "اپلیکیشن", "/æp/", "noun", "This app is useful.", "این اپ مفیده."),
                VocabWord("download", "دانلود کردن", "/ˌdaʊnˈloʊd/", "verb", "I downloaded a game.", "بازی دانلود کردم.", "verb"),
                VocabWord("upload", "آپلود کردن", "/ˌʌpˈloʊd/", "verb", "She uploaded photos.", "عکس‌ها رو آپلود کرد.", "verb"),
                VocabWord("online", "آنلاین", "/ˈɑːnlaɪn/", "adverb", "I shop online.", "آنلاین خرید می‌کنم."),
                VocabWord("privacy", "حریم خصوصی", "/ˈpraɪvəsi/", "noun", "Privacy matters.", "حریم خصوصی مهمه."),
                VocabWord("password", "رمز عبور", "/ˈpæswɜːrd/", "noun", "Choose a strong password.", "رمز قوی انتخاب کن."),
                VocabWord("addicted", "معتاد", "/əˈdɪktɪd/", "adjective", "I'm addicted to my phone.", "به گوشیم معتادم."),
                VocabWord("content", "محتوا", "/ˈkɑːntent/", "noun", "Quality content matters.", "محتوای باکیفیت مهمه."),
                VocabWord("share", "به اشتراک گذاشتن", "/ʃer/", "verb", "Don't share fake news.", "اخبار جعلی پخش نکن.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("screen time", "زمان صفحه", "Reduce your screen time.", "زمان صفحه‌ات رو کم کن.", "neutral"),
                IdiomExpression("digital detox", "ترک دیجیتال", "I need a digital detox.", "به ترک دیجیتال نیاز دارم.", "informal"),
                IdiomExpression("word of mouth", "شفاهی", "It spread by word of mouth.", "شفاهی پخش شد.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("technology", "technology /tekˈnɑːlədʒi/."),
                PronunciationTip("information", "information /ˌɪnfərˈmeɪʃən/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Digital habits", "عادت‌های دیجیتال مهمند."),
                CulturalNote("Media literacy", "سواد رسانه‌ای ارزشمنده.")
            ),
            grammar = listOf(
                GrammarSection("Reported speech", "He said he was busy."),
                GrammarSection("Reporting verbs", "claim, admit, deny, suggest, promise, warn"),
                GrammarSection("Passive in media", "The news was reported."),
                GrammarSection("Expressing opinions", "I think... / In my opinion...")
            ),
            commonMistakes = listOf(
                CommonMistake("He said me...", "He told me...", "tell + ضمیر مفعولی."),
                CommonMistake("He said he will come.", "He said he would come.", "will → would."),
                CommonMistake("The news are important.", "The news is important.", "news غیرقابل شمارش.")
            ),
            conversation = listOf(
                DialogueLine("A", "How much time do you spend online?", "چقدر آنلاین وقت می‌گذرونی؟"),
                DialogueLine("B", "Too much. I'm trying a digital detox.", "زیاد. ترک دیجیتال امتحان می‌کنم."),
                DialogueLine("A", "How's it going?", "چطور پیش می‌ره؟"),
                DialogueLine("B", "Hard. I keep checking my phone.", "سخته. مدام گوشیم رو چک می‌کنم."),
                DialogueLine("A", "What apps do you use most?", "بیشتر چه اپ‌هایی؟"),
                DialogueLine("B", "Social media and news apps.", "شبکه‌های اجتماعی و اخبار."),
                DialogueLine("A", "Do you trust news online?", "به اخبار آنلاین اعتماد داری؟"),
                DialogueLine("B", "Not all of it. I check sources.", "نه به همه‌ش. منابع رو چک می‌کنم."),
                DialogueLine("A", "What about privacy?", "حریم خصوصی چطور؟"),
                DialogueLine("B", "It worries me. Companies collect too much data.", "نگرانم می‌کنه."),
                DialogueLine("A", "Should governments regulate?", "دولت‌ها تنظیم کنن؟"),
                DialogueLine("B", "Maybe to a degree.", "شاید تا حدی."),
                DialogueLine("A", "Any advice?", "توصیه‌ای؟"),
                DialogueLine("B", "Check sources, use strong passwords.", "منابع رو چک کن، رمز قوی."),
                DialogueLine("A", "Thanks!", "ممنون!"),
                DialogueLine("B", "Stay safe online!", "آنلاین امن بمون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه کاری امتحان می‌کند؟", "ترک دیجیتال."),
                ComprehensionQuestion("B چطور اخبار بررسی می‌کند؟", "منابع را چک می‌کند."),
                ComprehensionQuestion("نگرانی B چیست؟", "حریم خصوصی."),
                ComprehensionQuestion("توصیه B چیست؟", "چک منابع و رمز قوی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss your digital habits.", "درباره عادت‌های دیجیتالت صحبت کن.", "I usually..."),
                SpeakingTask("Express opinions on technology.", "نظرت درباره تکنولوژی رو بگو.", "I think...")
            ),
            writingTasks = listOf(
                WritingTask("Write about technology in your life.", "درباره تکنولوژی در زندگی‌ات بنویس.", 180, "Use reported speech and passive.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: He ___ me he was tired.", listOf("said", "told", "spoke", "talked"), 1),
                QuizQuestion("Complete: He said he ___ come.", listOf("will", "would", "can", "could"), 1),
                QuizQuestion("Complete: The news ___ important.", listOf("are", "is", "were", "have"), 1),
                QuizQuestion("What does 'word of mouth' mean?", listOf("کلمه دهان", "شفاهی", "نوشتاری", "رسمی"), 1),
                QuizQuestion("Complete: The article has been ___.", listOf("publish", "published", "publishing", "publishes"), 1),
                QuizQuestion("What does 'digital detox' mean?", listOf("ترک دیجیتال", "سم‌زدایی", "پاک کردن", "خرید"), 0),
                QuizQuestion("Complete: The video is ___ shared.", listOf("be", "being", "been", "is"), 1),
                QuizQuestion("What does 'addicted' mean?", listOf("معتاد", "خسته", "مشغول", "خوشحال"), 0)
            )
        )
    }

    // UNIT 8 — The Natural World
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "The Natural World",
            titlePersian = "دنیای طبیعی",
            objectives = listOf("Discuss nature", "Use first and second conditional", "Talk about environment", "Express concern and hope"),
            vocabulary = listOf(
                VocabWord("nature", "طبیعت", "/ˈneɪtʃər/", "noun", "I love nature.", "عاشق طبیعتم."),
                VocabWord("environment", "محیط زیست", "/ɪnˈvaɪrənmənt/", "noun", "Protect the environment.", "محیط زیست رو حفظ کن."),
                VocabWord("climate", "اقلیم", "/ˈklaɪmət/", "noun", "Climate change is serious.", "تغییر اقلیم جدیه."),
                VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun", "Air pollution is harmful.", "آلودگی مضره."),
                VocabWord("recycle", "بازیافت کردن", "/ˌriːˈsaɪkəl/", "verb", "We recycle paper.", "کاغذ بازیافت می‌کنیم.", "verb"),
                VocabWord("renewable", "تجدیدپذیر", "/rɪˈnuːəbəl/", "adjective", "Solar is renewable.", "خورشیدی تجدیدپذیره."),
                VocabWord("protect", "محافظت کردن", "/prəˈtekt/", "verb", "Protect nature.", "از طبیعت محافظت کن.", "verb"),
                VocabWord("waste", "زباله", "/weɪst/", "noun", "Waste is a problem.", "زباله مشکله."),
                VocabWord("endangered", "در خطر انقراض", "/ɪnˈdeɪndʒərd/", "adjective", "Many species are endangered.", "بسیاری در خطرند."),
                VocabWord("sustainable", "پایدار", "/səˈsteɪnəbəl/", "adjective", "Sustainable solutions.", "راه‌حل پایدار."),
                VocabWord("wildlife", "حیات وحش", "/ˈwaɪldlaɪf/", "noun", "Wildlife needs protection.", "حیات وحش محافظت می‌خواد."),
                VocabWord("aware", "آگاه", "/əˈwer/", "adjective", "Be aware.", "آگاه باش.")
            ),
            idioms = listOf(
                IdiomExpression("go green", "دوستدار محیط زیست", "Companies are going green.", "شرکت‌ها سبز می‌شن.", "informal"),
                IdiomExpression("carbon footprint", "ردپای کربن", "Reduce your carbon footprint.", "ردپای کربنت رو کم کن.", "neutral"),
                IdiomExpression("the bigger picture", "تصویر بزرگ‌تر", "Look at the bigger picture.", "به تصویر بزرگ‌تر نگاه کن.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("environment", "environment /ɪnˈvaɪrənmənt/."),
                PronunciationTip("sustainable", "sustainable /səˈsteɪnəbəl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Earth Day", "روز زمین."),
                CulturalNote("Climate activism", "فعالیت‌های اقلیمی.")
            ),
            grammar = listOf(
                GrammarSection("First conditional", "If we recycle, we will help."),
                GrammarSection("Second conditional", "If we acted, we would solve it."),
                GrammarSection("Should for environment", "We should recycle more."),
                GrammarSection("Imperatives", "Reduce, reuse, recycle.")
            ),
            commonMistakes = listOf(
                CommonMistake("If we will recycle...", "If we recycle...", "در if از present simple."),
                CommonMistake("We should to protect.", "We should protect.", "بعد از should فعل ساده."),
                CommonMistake("Plastic is throwing.", "Plastic is being thrown.", "passive.")
            ),
            conversation = listOf(
                DialogueLine("A", "Are you worried about climate change?", "نگران تغییر اقلیمی؟"),
                DialogueLine("B", "Yes, it's a huge problem.", "بله، مشکل بزرگیه."),
                DialogueLine("A", "What do you do for the environment?", "برای محیط زیست چیکار می‌کنی؟"),
                DialogueLine("B", "I recycle, save water, use public transport.", "بازیافت، ذخیره آب، حمل و نقل عمومی."),
                DialogueLine("A", "Do you use renewable energy?", "از انرژی تجدیدپذیر؟"),
                DialogueLine("B", "Not yet, but thinking about solar.", "هنوز نه، ولی به خورشیدی فکر می‌کنم."),
                DialogueLine("A", "What does the future hold?", "آینده چی داره؟"),
                DialogueLine("B", "If we don't act, it will get worse.", "اگه اقدام نکنیم، بدتر می‌شه."),
                DialogueLine("A", "What should we do first?", "اول چیکار کنیم؟"),
                DialogueLine("B", "Reduce waste, use green energy.", "کاهش زباله، انرژی سبز."),
                DialogueLine("A", "Should governments do more?", "دولت‌ها بیشتر کنن؟"),
                DialogueLine("B", "Definitely. Policies matter.", "قطعاً. سیاست‌ها مهمند."),
                DialogueLine("A", "What about individuals?", "افراد چطور؟"),
                DialogueLine("B", "Small changes add up.", "تغییرات کوچک جمع می‌شن."),
                DialogueLine("A", "I'll do more.", "منم بیشتر انجام می‌دم."),
                DialogueLine("B", "Together we can make a difference.", "با هم می‌تونیم تفاوت ایجاد کنیم."),
                DialogueLine("A", "The planet needs us.", "سیاره به ما نیاز داره."),
                DialogueLine("B", "Let's protect it.", "بیا محافظتش کنیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B برای محیط زیست چیکار می‌کند؟", "بازیافت، ذخیره آب، حمل و نقل عمومی."),
                ComprehensionQuestion("اگر اقدام نکنیم چه می‌شود؟", "بدتر می‌شود."),
                ComprehensionQuestion("راه‌حل‌ها چیست؟", "کاهش زباله، انرژی سبز."),
                ComprehensionQuestion("چه چیزی مهمه؟", "تغییرات کوچک.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss environmental issues.", "درباره مشکلات زیست‌محیطی صحبت کن.", "We should..."),
                SpeakingTask("Propose solutions.", "راه‌حل ارائه بده.", "If we..., we could...")
            ),
            writingTasks = listOf(
                WritingTask("Write about protecting the environment.", "درباره حفاظت از محیط زیست بنویس.", 180, "Use conditionals.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If we recycle, we ___ help.", listOf("will", "are", "is", "do"), 0),
                QuizQuestion("Complete: We should ___ more.", listOf("recycle", "recycles", "recycling", "recycled"), 0),
                QuizQuestion("Complete: Don't waste ___.", listOf("the water", "water", "waters", "a water"), 1),
                QuizQuestion("What does 'go green' mean?", listOf("سبز شدن", "دوستدار محیط زیست", "گیاه", "رنگ"), 1),
                QuizQuestion("Complete: ___ we don't act, things will get worse.", listOf("If", "When", "Because", "So"), 0),
                QuizQuestion("What does 'carbon footprint' mean?", listOf("ردپا", "ردپای کربن", "ردیابی", "گاز"), 1),
                QuizQuestion("Complete: The planet needs ___.", listOf("we", "us", "our", "ours"), 1),
                QuizQuestion("Complete: Pollution ___ everyone.", listOf("affect", "affects", "affecting", "affected"), 1)
            )
        )
    }

    // UNIT 9 — Big and Small
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Big and Small",
            titlePersian = "بزرگ و کوچک",
            objectives = listOf("Compare things", "Use quantifiers", "Talk about preferences", "Express opinions"),
            vocabulary = listOf(
                VocabWord("size", "اندازه", "/saɪz/", "noun", "What size is it?", "چه اندازه‌ایه؟"),
                VocabWord("huge", "بزرگ", "/hjuːdʒ/", "adjective", "A huge city.", "شهر بزرگ."),
                VocabWord("tiny", "کوچک", "/ˈtaɪni/", "adjective", "A tiny apartment.", "آپارتمان کوچیک."),
                VocabWord("enormous", "عظیم", "/ɪˈnɔːrməs/", "adjective", "An enormous building.", "ساختمان عظیم."),
                VocabWord("compact", "جمع و جور", "/kəmˈpækt/", "adjective", "Compact and useful.", "جمع و جور."),
                VocabWord("quantity", "مقدار", "/ˈkwɑːntəti/", "noun", "Quality over quantity.", "کیفیت بهتر از کمیت."),
                VocabWord("quality", "کیفیت", "/ˈkwɑːləti/", "noun", "Quality matters.", "کیفیت مهمه."),
                VocabWord("amount", "مقدار", "/əˈmaʊnt/", "noun", "A small amount.", "مقدار کم."),
                VocabWord("plenty", "فراوان", "/ˈplenti/", "noun", "Plenty of time.", "وقت فراوان."),
                VocabWord("enough", "کافی", "/ɪˈnʌf/", "adjective", "We have enough.", "کافی داریم."),
                VocabWord("several", "چندین", "/ˈsevrəl/", "adjective", "Several options.", "چندین گزینه."),
                VocabWord("couple", "چند تا", "/ˈkʌpəl/", "noun", "A couple of things.", "چند تا چیز.")
            ),
            idioms = listOf(
                IdiomExpression("small talk", "گپ کوچک", "Make small talk.", "گپ کوچک بزن.", "neutral"),
                IdiomExpression("a big deal", "چیز مهم", "It's not a big deal.", "چیز مهمی نیست.", "informal"),
                IdiomExpression("small world", "دنیای کوچک", "Small world!", "دنیای کوچیکیه!", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("huge", "huge /hjuːdʒ/."),
                PronunciationTip("enough", "enough /ɪˈnʌf/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Preferences", "ترجیحات فردی."),
                CulturalNote("Small talk", "گپ کوچک رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Quantifiers", "some, any, much, many, a lot of, a few, a little"),
                GrammarSection("Too / enough", "It's too big. / It's not big enough."),
                GrammarSection("Comparatives", "bigger than, smaller than"),
                GrammarSection("Expressing preferences", "I prefer... / I'd rather...")
            ),
            commonMistakes = listOf(
                CommonMistake("I have much friends.", "I have many friends.", "many با قابل شمارش."),
                CommonMistake("It's too much big.", "It's too big.", "too + صفت."),
                CommonMistake("A few of water.", "A little water.", "a little با غیرقابل شمارش.")
            ),
            conversation = listOf(
                DialogueLine("A", "Big city or small town?", "شهر بزرگ یا کوچیک؟"),
                DialogueLine("B", "I'd prefer a small town. It's quieter.", "شهر کوچیک. ساکت‌تره."),
                DialogueLine("A", "Don't you miss opportunities?", "فرصت‌ها رو از دست نمی‌دی؟"),
                DialogueLine("B", "Sometimes. Quality of life matters more.", "گاهی. کیفیت زندگی مهم‌تره."),
                DialogueLine("A", "I like big cities.", "من شهرهای بزرگ رو دوست دارم."),
                DialogueLine("B", "What do you like?", "چی دوست داری؟"),
                DialogueLine("A", "Always something to do. More diversity.", "همیشه چیزی هست. تنوع بیشتر."),
                DialogueLine("B", "But overwhelming too.", "ولی طاقت‌فرسا هم."),
                DialogueLine("A", "It depends on the person.", "به شخص بستگی داره."),
                DialogueLine("B", "Everyone has different preferences.", "هر کسی ترجیحات متفاوتی داره."),
                DialogueLine("A", "Cost of living?", "هزینه زندگی؟"),
                DialogueLine("B", "Small towns are more affordable.", "شهرهای کوچک ارزان‌تر."),
                DialogueLine("A", "Salaries are lower too.", "حقوق هم کمتره."),
                DialogueLine("B", "It's a trade-off.", "معاوضه‌ست."),
                DialogueLine("A", "Everything is.", "همه چیز همین‌طوره.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B کدوم را ترجیح می‌دهد؟", "شهر کوچک."),
                ComprehensionQuestion("A چه چیزی دوست دارد؟", "فرصت و تنوع."),
                ComprehensionQuestion("مشکل شهر بزرگ؟", "طاقت‌فرسا."),
                ComprehensionQuestion("هزینه زندگی؟", "شهر کوچک ارزان‌تر.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Compare city and country life.", "مقایسه کن.", "City is... / Country is..."),
                SpeakingTask("Express preferences.", "ترجیحاتت رو بگو.", "I prefer...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your preference.", "درباره ترجیحت بنویس.", 150, "Use comparatives and quantifiers.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: It's ___ big.", listOf("too", "too much", "enough", "many"), 0),
                QuizQuestion("Complete: I have ___ friends.", listOf("much", "many", "a little", "a lot"), 1),
                QuizQuestion("Complete: A ___ water.", listOf("few", "little", "many", "several"), 1),
                QuizQuestion("What does 'small world' mean?", listOf("دنیای کوچک", "جهان کوچک", "شگفت", "عجیب"), 0),
                QuizQuestion("Complete: I'd ___ stay home.", listOf("rather", "prefer", "better", "sooner"), 0),
                QuizQuestion("Complete: The city is ___ than the town.", listOf("big", "bigger", "biggest", "more big"), 1),
                QuizQuestion("What does 'a big deal' mean?", listOf("چیز مهم", "معامله", "قرارداد", "کار بزرگ"), 0),
                QuizQuestion("Complete: We have ___ time.", listOf("plenty of", "plenty", "many", "much"), 0)
            )
        )
    }

    // UNIT 10 — Looking Back
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Looking Back",
            titlePersian = "نگاهی به گذشته",
            objectives = listOf("Talk about memories", "Use used to and would", "Narrate past events", "Reflect on the past"),
            vocabulary = listOf(
                VocabWord("memory", "خاطره", "/ˈmeməri/", "noun", "Good memories.", "خاطرات خوب."),
                VocabWord("childhood", "کودکی", "/ˈtʃaɪldhʊd/", "noun", "Happy childhood.", "کودکی شاد."),
                VocabWord("remember", "به یاد آوردن", "/rɪˈmembər/", "verb", "I remember that day.", "آن روز رو یادمه.", "verb"),
                VocabWord("forget", "فراموش کردن", "/fərˈɡet/", "verb", "I never forget.", "هرگز فراموش نمی‌کنم.", "verb"),
                VocabWord("grow up", "بزرگ شدن", "/ɡroʊ ʌp/", "verb", "I grew up in a small town.", "شهر کوچیک بزرگ شدم.", "verb"),
                VocabWord("used to", "قبلاً", "/juːst tuː/", "verb", "I used to play football.", "قبلاً فوتبال بازی می‌کردم.", "verb"),
                VocabWord("hometown", "زادگاه", "/ˈhoʊmtaʊn/", "noun", "My hometown is small.", "زادگاهم کوچیکه."),
                VocabWord("past", "گذشته", "/pæst/", "noun", "The past is gone.", "گذشته رفته."),
                VocabWord("present", "حال", "/ˈprezənt/", "noun", "Live in the present.", "در حال زندگی کن."),
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun", "Future is bright.", "آینده روشنه."),
                VocabWord("reflect", "بازنگری کردن", "/rɪˈflekt/", "verb", "Reflect on your past.", "به گذشته‌ات بازنگری کن.", "verb"),
                VocabWord("nostalgia", "نوستالژی", "/nɑːˈstældʒə/", "noun", "I feel nostalgia.", "احساس نوستالژی می‌کنم.")
            ),
            idioms = listOf(
                IdiomExpression("the good old days", "روزهای خوب قدیم", "The good old days.", "روزهای خوب قدیم.", "idiom"),
                IdiomExpression("look back on", "به گذشته نگاه کردن", "Looking back on my life...", "به گذشته‌ام که نگاه می‌کنم...", "neutral"),
                IdiomExpression("memory lane", "کوچه خاطرات", "A trip down memory lane.", "سفری به کوچه خاطرات.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("used to", "used to /juːst tə/."),
                PronunciationTip("would for past", "would /wʊd/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Nostalgia", "نوستالژی مهمه."),
                CulturalNote("Memories", "خاطرات ارزشمندند.")
            ),
            grammar = listOf(
                GrammarSection("Used to", "I used to live there."),
                GrammarSection("Would for past habits", "We would play for hours."),
                GrammarSection("Narrative tenses", "I was walking when I saw him."),
                GrammarSection("Time expressions", "When I was young, back then")
            ),
            commonMistakes = listOf(
                CommonMistake("I use to live there.", "I used to live there.", "used to."),
                CommonMistake("Did you used to play?", "Did you use to play?", "بعد از did: use."),
                CommonMistake("I would play (once).", "I played (once).", "would برای عادت‌های تکرارشونده.")
            ),
            conversation = listOf(
                DialogueLine("A", "Tell me about your childhood.", "درباره کودکی‌ات بگو."),
                DialogueLine("B", "I grew up in a small town.", "شهر کوچیک بزرگ شدم."),
                DialogueLine("A", "What did you use to do?", "چیکار می‌کردی؟"),
                DialogueLine("B", "We used to play outside all day.", "تمام روز بیرون بازی می‌کردیم."),
                DialogueLine("A", "Sounds wonderful.", "فوق‌العاده."),
                DialogueLine("B", "It was. No phones or computers.", "بود. گوشی و کامپیوتر نبود."),
                DialogueLine("A", "Did you enjoy it?", "لذت می‌بردی؟"),
                DialogueLine("B", "Absolutely. Looking back, the best years.", "قطعاً. بهترین سال‌ها."),
                DialogueLine("A", "Do you ever go back?", "برگشتی؟"),
                DialogueLine("B", "Sometimes. It's changed.", "گاهی. عوض شده."),
                DialogueLine("A", "How?", "چطور؟"),
                DialogueLine("B", "More buildings, less nature.", "ساختمان بیشتر، طبیعت کمتر."),
                DialogueLine("A", "That's sad.", "غمگین‌کننده."),
                DialogueLine("B", "But memories stay.", "ولی خاطرات می‌مونن."),
                DialogueLine("A", "Do you miss it?", "دلت تنگ می‌شه؟"),
                DialogueLine("B", "I miss the simplicity.", "دلم برای سادگی تنگ می‌شه."),
                DialogueLine("A", "I understand.", "می‌فهمم."),
                DialogueLine("B", "We can't go back. Only forward.", "نمی‌تونیم برگردیم. فقط به جلو.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B کجا بزرگ شد؟", "شهر کوچک نزدیک کوه‌ها."),
                ComprehensionQuestion("B چیکار می‌کرد؟", "تمام روز بیرون بازی."),
                ComprehensionQuestion("چه عوض شده؟", "ساختمان بیشتر، طبیعت کمتر."),
                ComprehensionQuestion("B دلش برای چه تنگ می‌شود؟", "سادگی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your childhood.", "درباره کودکی‌ات صحبت کن.", "I used to..."),
                SpeakingTask("Reflect on the past.", "به گذشته بازنگری کن.", "Looking back...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your childhood memories.", "درباره خاطرات کودکی‌ات بنویس.", 200, "Use used to and narrative tenses.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ play football.", listOf("use to", "used to", "using to", "uses to"), 1),
                QuizQuestion("Complete: Did you ___ to live here?", listOf("used", "use", "using", "uses"), 1),
                QuizQuestion("What does 'the good old days' mean?", listOf("روزهای خوب قدیم", "روزهای جدید", "روز خوب", "روز قدیمی"), 0),
                QuizQuestion("Complete: I ___ live in a small town.", listOf("used to", "use to", "using to", "uses to"), 0),
                QuizQuestion("What does 'memory lane' mean?", listOf("کوچه خاطرات", "خیابان", "کوچه", "یاد"), 0),
                QuizQuestion("Complete: We ___ play for hours.", listOf("would", "will", "can", "may"), 0),
                QuizQuestion("What does 'nostalgia' mean?", listOf("نوستالژی", "خاطره", "غم", "شادی"), 0),
                QuizQuestion("Complete: Looking ___, those were the best years.", listOf("back", "forward", "up", "down"), 0)
            )
        )
    }

    // UNIT 11 — Great Ideas
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Great Ideas",
            titlePersian = "ایده‌های بزرگ",
            objectives = listOf("Discuss inventions", "Use passive voice", "Talk about creativity", "Express wonder"),
            vocabulary = listOf(
                VocabWord("invention", "اختراع", "/ɪnˈvenʃən/", "noun", "A great invention.", "اختراع بزرگ."),
                VocabWord("discovery", "کشف", "/dɪˈskʌvəri/", "noun", "A major discovery.", "کشف بزرگ."),
                VocabWord("inventor", "مخترع", "/ɪnˈventər/", "noun", "Who was the inventor?", "مخترع کی بود؟"),
                VocabWord("breakthrough", "پیشرفت بزرگ", "/ˈbreɪkθruː/", "noun", "A breakthrough.", "پیشرفت بزرگ."),
                VocabWord("creative", "خلاق", "/kriˈeɪtɪv/", "adjective", "Very creative.", "خیلی خلاق."),
                VocabWord("imagination", "تصور", "/ɪˌmædʒɪˈneɪʃən/", "noun", "Use your imagination.", "از تصورت استفاده کن."),
                VocabWord("innovative", "نوآورانه", "/ˈɪnəveɪtɪv/", "adjective", "An innovative idea.", "ایده نوآورانه."),
                VocabWord("develop", "توسعه دادن", "/dɪˈveləp/", "verb", "They developed a product.", "محصولی توسعه دادن.", "verb"),
                VocabWord("design", "طراحی کردن", "/dɪˈzaɪn/", "verb", "She designed this app.", "این اپ رو طراحی کرد.", "verb"),
                VocabWord("impact", "تأثیر", "/ˈɪmpækt/", "noun", "A huge impact.", "تأثیر عظیم."),
                VocabWord("solve", "حل کردن", "/sɑːlv/", "verb", "Solve the problem.", "مشکل رو حل کن.", "verb"),
                VocabWord("imagine", "تصور کردن", "/ɪˈmædʒɪn/", "verb", "Imagine the possibilities.", "احتمالات رو تصور کن.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("think outside the box", "خارج از چارچوب فکر کردن", "Think outside the box.", "خارج از چارچوب فکر کن.", "neutral"),
                IdiomExpression("a game changer", "تغییردهنده بازی", "A game changer.", "تغییردهنده بازی.", "informal"),
                IdiomExpression("lightbulb moment", "لحظه ایده", "A lightbulb moment.", "لحظه ایده.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("invention", "invention /ɪnˈvenʃən/."),
                PronunciationTip("creative", "creative /kriˈeɪtɪv/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Innovation", "نوآوری ارزشمنده."),
                CulturalNote("Inventors", "مخترعان محبوبند.")
            ),
            grammar = listOf(
                GrammarSection("Passive voice", "The telephone was invented in 1876."),
                GrammarSection("Passive with modals", "The problem can be solved."),
                GrammarSection("Causative", "I had my house designed."),
                GrammarSection("Expressing wonder", "It's amazing that...")
            ),
            commonMistakes = listOf(
                CommonMistake("The telephone invented in 1876.", "The telephone was invented in 1876.", "passive: was + pp."),
                CommonMistake("It has being improved.", "It has been improved.", "has been."),
                CommonMistake("Who invented by?", "Who was it invented by?", "ساختار صحیح.")
            ),
            conversation = listOf(
                DialogueLine("A", "Greatest invention?", "بزرگ‌ترین اختراع؟"),
                DialogueLine("B", "The printing press.", "ماشین چاپ."),
                DialogueLine("A", "Why?", "چرا؟"),
                DialogueLine("B", "It made books available to everyone.", "کتاب‌ها رو برای همه در دسترس کرد."),
                DialogueLine("A", "What about electricity?", "برق چطور؟"),
                DialogueLine("B", "Definitely up there. It transformed everything.", "قطعاً. همه چیز رو متحول کرد."),
                DialogueLine("A", "What do you use most?", "کدوم رو بیشتر استفاده می‌کنی؟"),
                DialogueLine("B", "My smartphone. Developed in the 1990s.", "گوشی هوشمندم. دهه ۹۰ توسعه یافت."),
                DialogueLine("A", "Who invented it?", "کی اختراعش کرد؟"),
                DialogueLine("B", "Several companies contributed.", "چندین شرکت کمک کردن."),
                DialogueLine("A", "Next invention?", "اختراع بعدی؟"),
                DialogueLine("B", "Something in AI or clean energy.", "چیزی در هوش مصنوعی یا انرژی پاک."),
                DialogueLine("A", "I hope so.", "امیدوارم."),
                DialogueLine("B", "Innovation is our future.", "نوآوری آینده ماست."),
                DialogueLine("A", "Well said.", "خوب گفتی."),
                DialogueLine("B", "Amazing what humans can create.", "شگفت‌انگیزه چیزی که انسان‌ها می‌سازن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("بزرگ‌ترین اختراع B چیست؟", "ماشین چاپ."),
                ComprehensionQuestion("گوشی هوشمند کِی توسعه یافت؟", "دهه ۹۰."),
                ComprehensionQuestion("بعدی چه خواهد بود؟", "هوش مصنوعی یا انرژی پاک."),
                ComprehensionQuestion("نظر B درباره خلاقیت انسان؟", "شگفت‌انگیز.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss an invention.", "درباره اختراعی صحبت کن.", "It was invented by..."),
                SpeakingTask("Speculate about future inventions.", "پیش‌بینی کن.", "I think... will be invented.")
            ),
            writingTasks = listOf(
                WritingTask("Write about an invention.", "درباره اختراعی بنویس.", 200, "Use passive voice.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The telephone ___ invented in 1876.", listOf("is", "was", "has", "did"), 1),
                QuizQuestion("Complete: It has ___ improved.", listOf("be", "being", "been", "is"), 2),
                QuizQuestion("What does 'think outside the box' mean?", listOf("خارج از جعبه", "خارج از چارچوب", "توی جعبه", "بی‌فکر"), 1),
                QuizQuestion("Complete: The problem can ___ solved.", listOf("be", "is", "been", "being"), 0),
                QuizQuestion("What does 'game changer' mean?", listOf("بازی‌کن", "تغییردهنده بازی", "بازیکن", "برنده"), 1),
                QuizQuestion("Complete: Who was it invented ___?", listOf("from", "by", "with", "at"), 1),
                QuizQuestion("What does 'lightbulb moment' mean?", listOf("لحظه ایده", "لامپ", "روشنایی", "برق"), 0),
                QuizQuestion("Complete: The device is ___ worldwide.", listOf("use", "used", "using", "uses"), 1)
            )
        )
    }

    // UNIT 12 — Moving On
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Moving On",
            titlePersian = "به جلو حرکت کردن",
            objectives = listOf("Review grammar", "Set future goals", "Reflect on progress", "Prepare for next level"),
            vocabulary = listOf(
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun", "You're making progress.", "داری پیشرفت می‌کنی."),
                VocabWord("achieve", "دست یافتن", "/əˈtʃiːv/", "verb", "Achieve your goals.", "به اهدافت برس.", "verb"),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun", "Learning is a journey.", "یادگیری یه سفره."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun", "Every challenge teaches.", "هر چالش می‌آموزه."),
                VocabWord("succeed", "موفق شدن", "/səkˈsiːd/", "verb", "You will succeed.", "موفق می‌شی.", "verb"),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun", "Mistakes are OK.", "اشتباهات اشکالی ندارن."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb", "Continue learning.", "ادامه بده.", "verb"),
                VocabWord("fluent", "روان", "/ˈfluːənt/", "adjective", "Aim for fluent.", "هدف روانی باشه."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective", "Feel confident.", "با اعتماد به نفس باش."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun", "Set a goal.", "هدف تعیین کن."),
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun", "Future is bright.", "آینده روشنه."),
                VocabWord("proud", "افتخار", "/praʊd/", "adjective", "Be proud.", "افتخار کن.")
            ),
            idioms = listOf(
                IdiomExpression("practice makes perfect", "تمرین باعث پیشرفت", "Practice makes perfect.", "تمرین باعث پیشرفت.", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد", "Be patient.", "صبور باش.", "idiom"),
                IdiomExpression("break a leg", "موفق باشی", "Break a leg!", "موفق باشی!", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Intonation", "سوال‌ها: بالارونده."),
                PronunciationTip("Linking", "کلمات به هم می‌چسبند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Language learning", "فرایند طولانی."),
                CulturalNote("Mistakes", "بخش طبیعی یادگیری.")
            ),
            grammar = listOf(
                GrammarSection("Review: Tenses", "Present, past, present perfect, future."),
                GrammarSection("Review: Conditionals", "First, second, third."),
                GrammarSection("Review: Passive", "The report has been published."),
                GrammarSection("Review: Wish", "I wish I had more time.")
            ),
            commonMistakes = listOf(
                CommonMistake("I am agree.", "I agree.", "agree فعل."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده."),
                CommonMistake("He don't like it.", "He doesn't like it.", "for he/she/it from doesn't.")
            ),
            conversation = listOf(
                DialogueLine("A", "How's your English going?", "انگلیسی‌ت چطوره؟"),
                DialogueLine("B", "Pretty well! I've been practicing.", "خوب! تمرین کرده‌ام."),
                DialogueLine("A", "More confident?", "با اعتماد به نفس‌تر؟"),
                DialogueLine("B", "Yes, much more.", "بله، خیلی بیشتر."),
                DialogueLine("A", "Hardest part?", "سخت‌ترین؟"),
                DialogueLine("B", "Grammar, especially conditionals.", "گرامر، خصوصاً شرطی‌ها."),
                DialogueLine("A", "What helped?", "چی کمک کرد؟"),
                DialogueLine("B", "Movies, conversations, and daily practice.", "فیلم، مکالمه، تمرین روزانه."),
                DialogueLine("A", "Next goal?", "هدف بعدی؟"),
                DialogueLine("B", "Fluent in two years.", "روانی در دو سال."),
                DialogueLine("A", "How?", "چطور؟"),
                DialogueLine("B", "Daily practice and classes.", "تمرین روزانه و کلاس."),
                DialogueLine("A", "Good plan.", "برنامه خوب."),
                DialogueLine("B", "Practice makes perfect.", "تمرین باعث پیشرفت."),
                DialogueLine("A", "Rome wasn't built in a day.", "رم در یک روز ساخته نشد."),
                DialogueLine("B", "I'll be patient.", "صبور خواهم بود."),
                DialogueLine("A", "That's the spirit!", "همین روحیه!"),
                DialogueLine("B", "Thanks!", "ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("سخت‌ترین بخش چه بود؟", "گرامر."),
                ComprehensionQuestion("چی کمک کرد؟", "فیلم، مکالمه، تمرین."),
                ComprehensionQuestion("هدف B چیست؟", "روانی در دو سال."),
                ComprehensionQuestion("B چطور می‌رسد؟", "تمرین روزانه و کلاس.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your English journey.", "درباره مسیرت صحبت کن.", "I started... / I've learned..."),
                SpeakingTask("Give advice to a beginner.", "توصیه کن.", "You should... / Don't give up...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your English goals.", "درباره اهدافت بنویس.", 150, "Use all structures.")
            ),
            quiz = listOf(
                QuizQuestion("What does 'practice makes perfect' mean?", listOf("تمرین سخت", "تمرین باعث پیشرفت", "بی‌فایده", "طولانی"), 1),
                QuizQuestion("Complete: I ___ him yesterday.", listOf("see", "saw", "seen", "seeing"), 1),
                QuizQuestion("Complete: She ___ English every day.", listOf("study", "studies", "studying", "studied"), 1),
                QuizQuestion("Complete: I ___ to London twice.", listOf("was", "have been", "go", "going"), 1),
                QuizQuestion("What does 'break a leg' mean?", listOf("شکستن پا", "موفق باشی", "شکست خوردن", "دویدن"), 1),
                QuizQuestion("Complete: I ___ help you tomorrow.", listOf("will", "am", "do", "have"), 0),
                QuizQuestion("Complete: If you practice, you ___ improve.", listOf("will", "are", "do", "have"), 0),
                QuizQuestion("Complete: ___ you ever been to Paris?", listOf("Do", "Did", "Have", "Are"), 2)
            )
        )
    }
}