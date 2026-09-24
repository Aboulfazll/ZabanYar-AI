package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile1 {

    const val BOOK_ID = "english_file_1"

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

    // CHAPTER 1 — Hello! Nice to Meet You
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Hello! Nice to Meet You",
            titlePersian = "سلام! از آشنایی با شما خوشحالم",
            objectives = listOf(
                "Introduce yourself",
                "Ask and answer basic personal questions",
                "Use the verb be correctly",
                "Spell names and simple words"
            ),
            vocabulary = listOf(
                VocabWord("name", "نام", "/neɪm/", "noun", "My name is Daniel.", "نام من دنیل است.", "first name, last name"),
                VocabWord("first name", "نام کوچک", "/fɜːrst neɪm/", "noun", "What's your first name?", "نام کوچکت چیست؟"),
                VocabWord("last name", "نام خانوادگی", "/læst neɪm/", "noun", "My last name is Brown.", "نام خانوادگی من براون است."),
                VocabWord("country", "کشور", "/ˈkʌntri/", "noun", "What country are you from?", "اهل کدام کشور هستی؟"),
                VocabWord("nationality", "ملیت", "/ˌnæʃəˈnæləti/", "noun", "What's your nationality?", "ملیت شما چیست؟"),
                VocabWord("student", "دانش‌آموز", "/ˈstuːdənt/", "noun", "I'm a student.", "من دانشجو هستم."),
                VocabWord("teacher", "معلم", "/ˈtiːtʃər/", "noun", "She is an English teacher.", "او معلم زبان انگلیسی است."),
                VocabWord("friend", "دوست", "/frend/", "noun", "This is my friend, Anna.", "این دوست من، آنا است."),
                VocabWord("city", "شهر", "/ˈsɪti/", "noun", "I live in a small city.", "من در یک شهر کوچک زندگی می‌کنم."),
                VocabWord("meet", "ملاقات کردن", "/miːt/", "verb", "Nice to meet you.", "از آشنایی با شما خوشحالم."),
                VocabWord("spell", "هجی کردن", "/spel/", "verb", "How do you spell your name?", "اسمت را چطور هجی می‌کنی؟"),
                VocabWord("welcome", "خوش آمدید", "/ˈwelkəm/", "expression", "Welcome to our class.", "به کلاس ما خوش آمدید.")
            ),
            idioms = listOf(
                IdiomExpression("Nice to meet you", "از آشنایی با شما خوشحالم", "Hi, I'm Emma. Nice to meet you.", "سلام، من اِما هستم. از آشنایی خوشحالم.", "neutral"),
                IdiomExpression("How are you?", "حالتان چطور است؟", "Hello, David. How are you?", "سلام دیوید. حالت چطور است؟", "neutral"),
                IdiomExpression("See you later", "بعداً می‌بینمت", "I have a class now. See you later!", "الان کلاس دارم. بعداً می‌بینمت!", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("I'm", "I'm شکل کوتاه I am است. در مکالمه روزمره معمولاً I'm استفاده می‌شود."),
                PronunciationTip("You're", "You're شکل کوتاه you are است و صدای آن تقریباً /jʊr/ شنیده می‌شود."),
                PronunciationTip("Spelling", "برای پرسیدن املای نام می‌توان گفت: How do you spell your name?")
            ),
            culturalNotes = listOf(
                CulturalNote("Introducing yourself", "در بسیاری از موقعیت‌های انگلیسی‌زبان، معرفی کوتاه با نام و سپس Nice to meet you رایج است."),
                CulturalNote("First name", "در بسیاری از کشورهای انگلیسی‌زبان، استفاده از first name در محیط‌های دوستانه و کاری رایج است.")
            ),
            grammar = listOf(
                GrammarSection("The verb be", "I am → I'm / You are → You're / He is → He's / She is → She's / We are → We're / They are → They're"),
                GrammarSection("Questions with be", "Are you a student? — Yes, I am. / No, I'm not. / Is she from Turkey? — Yes, she is."),
                GrammarSection("Possessive adjectives", "my, your, his, her, our, their: my name, your city, his friend, her country."),
                GrammarSection("Subject pronouns", "I, you, he, she, it, we, they: He is my friend. We are students.")
            ),
            commonMistakes = listOf(
                CommonMistake("I from Iran.", "I'm from Iran.", "بعد از فاعل باید فعل be بیاید."),
                CommonMistake("She are a teacher.", "She is a teacher.", "با she از is استفاده می‌کنیم."),
                CommonMistake("They is students.", "They are students.", "با they از are استفاده می‌کنیم."),
                CommonMistake("What your name?", "What's your name?", "What's = What is."),
                CommonMistake("How you spell it?", "How do you spell it?", "برای پرسیدن املا از do استفاده می‌کنیم.")
            ),
            conversation = listOf(
                DialogueLine("Teacher", "Good morning, everyone! Welcome to our English class.", "صبح بخیر، همه! به کلاس انگلیسی ما خوش آمدید."),
                DialogueLine("Teacher", "Let's start with introductions. I'm Mr. Brown.", "بیایید با معرفی شروع کنیم. من آقای براون هستم."),
                DialogueLine("Emma", "Hello, Mr. Brown. I'm Emma. Nice to meet you.", "سلام آقای براون. من اِما هستم. از آشنایی خوشحالم."),
                DialogueLine("Teacher", "Nice to meet you too, Emma. Where are you from?", "من هم خوشحالم، اِما. اهل کجایی؟"),
                DialogueLine("Emma", "I'm from Canada. I live in Toronto.", "من اهل کانادا هستم. در تورنتو زندگی می‌کنم."),
                DialogueLine("Teacher", "And you? What's your name?", "و تو؟ اسمت چیه؟"),
                DialogueLine("David", "I'm David. I'm from Manchester, in England.", "من دیوید هستم. اهل منچستر، در انگلستان."),
                DialogueLine("Teacher", "Nice to meet you, David. Is Manchester a big city?", "از آشنایی خوشحالم، دیوید. منچستر شهر بزرگیه؟"),
                DialogueLine("David", "Yes, it's quite big. About half a million people.", "بله، نسبتاً بزرگه. حدود نیم میلیون نفر."),
                DialogueLine("Emma", "David, how do you spell your last name?", "دیوید، نام خانوادگی‌ات رو چطور هجی می‌کنی؟"),
                DialogueLine("David", "It's S-M-I-T-H. Smith.", "این‌طور: S-M-I-T-H. اسمیت."),
                DialogueLine("Emma", "Thanks! And are you a student here?", "ممنون! و تو اینجا دانشجو هستی؟"),
                DialogueLine("David", "Yes, I am. I study business. And you?", "بله. من مدیریت بازرگانی می‌خونم. تو چطور؟"),
                DialogueLine("Emma", "I'm a student too. I study languages.", "من هم دانشجو هستم. زبان می‌خونم."),
                DialogueLine("David", "Great! Maybe we can study together sometime.", "عالی! شاید بتونیم یه وقت با هم درس بخونیم."),
                DialogueLine("Emma", "I'd like that. Nice to meet you, David.", "خوشحال می‌شم. از آشنایی با تو خوشحالم، دیوید."),
                DialogueLine("David", "Nice to meet you too, Emma. See you later!", "من هم خوشحال شدم، اِما. بعداً می‌بینمت!"),
                DialogueLine("Teacher", "Very good, everyone. Let's continue with the lesson.", "خیلی خوب، همه. بیایید درس رو ادامه بدیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Where is Emma from?", "She is from Canada. She lives in Toronto."),
                ComprehensionQuestion("Where is David from?", "He is from Manchester, in England."),
                ComprehensionQuestion("How do you spell David's last name?", "S-M-I-T-H. Smith."),
                ComprehensionQuestion("What does Emma study?", "She studies languages."),
                ComprehensionQuestion("What does David study?", "He studies business.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Introduce yourself to a partner.", "خودت را به یک همکلاسی معرفی کن.", "I'm... / I'm from... / I'm a student."),
                SpeakingTask("Ask your partner 3 basic questions.", "سه سوال ساده از همکلاسی‌ات بپرس.", "What's your name? / Where are you from? / What do you study?"),
                SpeakingTask("Spell your first and last name in English.", "نام و نام خانوادگی‌ات را به انگلیسی هجی کن.", "My first name is... My last name is...")
            ),
            writingTasks = listOf(
                WritingTask("Write a short self-introduction.", "یک معرفی کوتاه از خودت بنویس.", 60, "Name, city, country, student/job")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ from Iran.", listOf("is", "are", "am", "be"), 2),
                QuizQuestion("Complete: She ___ a teacher.", listOf("am", "are", "is", "be"), 2),
                QuizQuestion("Choose the correct question.", listOf("What your name?", "What's your name?", "What are your name?", "What name you?"), 1),
                QuizQuestion("Complete: They ___ students.", listOf("is", "am", "are", "be"), 2),
                QuizQuestion("Choose the correct negative.", listOf("He not is a doctor.", "He isn't a doctor.", "He aren't a doctor.", "He don't a doctor."), 1),
                QuizQuestion("What does 'friend' mean?", listOf("معلم", "دوست", "دانش‌آموز", "کشور"), 1),
                QuizQuestion("Choose the correct response: Nice to meet you.", listOf("Nice to meet you too.", "I'm from Iran.", "Yes, I am.", "Good night."), 0),
                QuizQuestion("Complete: ___ she a student?", listOf("Am", "Are", "Is", "Be"), 2)
            )
        )
    }

    // CHAPTER 2 — Every Day
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Every Day",
            titlePersian = "هر روز",
            objectives = listOf(
                "Talk about daily routines",
                "Tell the time",
                "Use the present simple for habits",
                "Use adverbs of frequency"
            ),
            vocabulary = listOf(
                VocabWord("wake up", "بیدار شدن", "/weɪk ʌp/", "phrasal verb", "I wake up at 7.", "ساعت ۷ بیدار می‌شم."),
                VocabWord("get up", "بلند شدن", "/ɡet ʌp/", "phrasal verb", "I get up at 7:30.", "ساعت ۷:۳۰ بلند می‌شم."),
                VocabWord("have breakfast", "صبحانه خوردن", "/hæv ˈbrekfəst/", "phrase", "I have breakfast at 8.", "ساعت ۸ صبحانه می‌خورم."),
                VocabWord("start work", "شروع کار", "/stɑːrt wɜːrk/", "phrase", "I start work at 9.", "ساعت ۹ کارم شروع می‌شه."),
                VocabWord("finish work", "تمام کردن کار", "/ˈfɪnɪʃ wɜːrk/", "phrase", "I finish work at 5.", "ساعت ۵ کارم تموم می‌شه."),
                VocabWord("go to bed", "به رختخواب رفتن", "/ɡoʊ tə bed/", "phrase", "I go to bed at 11.", "ساعت ۱۱ می‌رم بخوابم."),
                VocabWord("usually", "معمولاً", "/ˈjuːʒuəli/", "adverb", "I usually get up early.", "معمولاً زود بلند می‌شم."),
                VocabWord("sometimes", "گاهی", "/ˈsʌmtaɪmz/", "adverb", "I sometimes work late.", "گاهی دیر کار می‌کنم."),
                VocabWord("never", "هرگز", "/ˈnevər/", "adverb", "I never drink coffee.", "هرگز قهوه نمی‌خورم."),
                VocabWord("often", "غالباً", "/ˈɔːfən/", "adverb", "I often walk to work.", "غالباً پیاده سر کار می‌رم."),
                VocabWord("o'clock", "ساعت", "/əˈklɑːk/", "adverb", "It's 9 o'clock.", "ساعت ۹ است."),
                VocabWord("midnight", "نیمه‌شب", "/ˈmɪdnaɪt/", "noun", "I go to bed before midnight.", "قبل از نیمه‌شب می‌خوابم.")
            ),
            idioms = listOf(
                IdiomExpression("early bird", "سحرخیز", "My dad is an early bird.", "بابام سحرخیزه.", "informal"),
                IdiomExpression("night owl", "شب‌زنده‌دار", "I'm a night owl.", "من شب‌زنده‌دارم.", "informal"),
                IdiomExpression("on time", "سر وقت", "I always arrive on time.", "همیشه سر وقت می‌رسم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Third-person -s", "در زمان حال ساده، برای he/she/it معمولاً s یا es به فعل اضافه می‌شود: works, watches, studies."),
                PronunciationTip("o'clock", "o'clock /əˈklɑːk/ — استرس روی clock.")
            ),
            culturalNotes = listOf(
                CulturalNote("Work schedules", "9 to 5 رایج‌ترین ساعت کاری در غربه."),
                CulturalNote("Routines", "روتین روزانه در فرهنگ غرب مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Present simple", "I/You/We/They + verb / He/She/It + verb + s: I work every day. She works at a hospital."),
                GrammarSection("Adverbs of frequency", "always → usually → often → sometimes → never. قبل از فعل اصلی، بعد از be."),
                GrammarSection("Telling time", "It's 7 o'clock. / It's half past seven. / It's quarter past seven. / It's quarter to eight."),
                GrammarSection("Prepositions of time", "at + ساعت، in the + بخش روز، on + روز، every + واحد")
            ),
            commonMistakes = listOf(
                CommonMistake("She work every day.", "She works every day.", "سوم شخص مفرد +s."),
                CommonMistake("I always am tired.", "I am always tired.", "با be، قید بعد از be."),
                CommonMistake("I go to work in 8.", "I go to work at 8.", "برای ساعت از at.")
            ),
            conversation = listOf(
                DialogueLine("A", "What time do you usually get up?", "معمولاً چه ساعتی بیدار می‌شی؟"),
                DialogueLine("B", "I usually wake up at 6:30 and get up at 7.", "معمولاً ساعت ۶:۳۰ بیدار می‌شم و ۷ بلند می‌شم."),
                DialogueLine("A", "Do you have breakfast?", "صبحانه می‌خوری؟"),
                DialogueLine("B", "Yes, I always have breakfast at 7:30.", "بله، همیشه ساعت ۷:۳۰ صبحانه می‌خورم."),
                DialogueLine("A", "What do you usually eat?", "معمولاً چی می‌خوری؟"),
                DialogueLine("B", "I usually have eggs and toast.", "معمولاً تخم‌مرغ و نان تست."),
                DialogueLine("A", "What time do you start work?", "چه ساعتی کارت شروع می‌شه؟"),
                DialogueLine("B", "I start at 9 and finish at 5.", "ساعت ۹ شروع و ۵ تموم می‌شه."),
                DialogueLine("A", "Do you work on weekends?", "آخر هفته‌ها کار می‌کنی؟"),
                DialogueLine("B", "Sometimes. But I usually rest on Sundays.", "گاهی. ولی معمولاً یکشنبه‌ها استراحت می‌کنم."),
                DialogueLine("A", "What do you do after work?", "بعد از کار چیکار می‌کنی؟"),
                DialogueLine("B", "I often go for a walk or read.", "غالباً پیاده‌روی یا کتاب می‌خونم."),
                DialogueLine("A", "What time do you go to bed?", "چه ساعتی می‌خوابی؟"),
                DialogueLine("B", "Around 11. I never stay up late.", "حدود ۱۱. هرگز دیر بیدار نمی‌مونم."),
                DialogueLine("A", "That's a healthy routine.", "روتین سالمیه."),
                DialogueLine("B", "Thanks! It took a while to build.", "ممنون! ساختنش یه کم طول کشید."),
                DialogueLine("A", "Do you always have breakfast?", "همیشه صبحانه می‌خوری؟"),
                DialogueLine("B", "Yes, always. It's important for energy.", "بله، همیشه. برای انرژی مهمه."),
                DialogueLine("A", "Great habit! I should do the same.", "عادت خوبی! منم باید همین کار رو بکنم."),
                DialogueLine("B", "You should! It really helps.", "باید بکنی! واقعاً کمک می‌کنه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه ساعتی بیدار می‌شود؟", "ساعت ۶:۳۰."),
                ComprehensionQuestion("B صبحانه چه می‌خورد؟", "تخم‌مرغ و نان تست."),
                ComprehensionQuestion("B چه ساعتی کارش تمام می‌شود؟", "ساعت ۵."),
                ComprehensionQuestion("B بعد از کار چیکار می‌کند؟", "پیاده‌روی یا کتاب خواندن."),
                ComprehensionQuestion("B چه ساعتی می‌خوابد؟", "حدود ۱۱ شب.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your daily routine.", "روتین روزانه‌ات رو توصیف کن.", "I wake up at... / I usually..."),
                SpeakingTask("Talk about your weekend routine.", "درباره روتین آخر هفته‌ات صحبت کن.", "I often... / I sometimes...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your typical day.", "درباره یه روز معمولی‌ت بنویس.", 100, "Use present simple and time expressions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ at 7 every day.", listOf("wake up", "wakes up", "waking up", "woke up"), 1),
                QuizQuestion("Complete: I go to bed ___ 11.", listOf("in", "on", "at", "from"), 2),
                QuizQuestion("Complete: He ___ coffee.", listOf("never drink", "never drinks", "drinks never", "never drinking"), 1),
                QuizQuestion("Complete: What time ___ you get up?", listOf("does", "do", "is", "are"), 1),
                QuizQuestion("Complete: I have breakfast ___ the morning.", listOf("on", "at", "in", "from"), 2),
                QuizQuestion("What does 'night owl' mean?", listOf("آدم شب‌زنده‌دار", "صبح‌خیز", "خسته", "خواب‌آلود"), 0),
                QuizQuestion("Complete: It's half ___ seven.", listOf("to", "past", "at", "for"), 1),
                QuizQuestion("Complete: They ___ work on Sundays.", listOf("doesn't", "don't", "isn't", "aren't"), 1)
            )
        )
    }

    // CHAPTER 3 — Places
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Places",
            titlePersian = "مکان‌ها",
            objectives = listOf(
                "Name common places",
                "Use there is / there are",
                "Ask for directions",
                "Use prepositions of place"
            ),
            vocabulary = listOf(
                VocabWord("bank", "بانک", "/bæŋk/", "noun", "The bank is near the hotel.", "بانک نزدیک هتله."),
                VocabWord("hospital", "بیمارستان", "/ˈhɑːspɪtəl/", "noun", "The hospital is on Main Street.", "بیمارستان در خیابان اصلیه."),
                VocabWord("school", "مدرسه", "/skuːl/", "noun", "Our school is big.", "مدرسه ما بزرگه."),
                VocabWord("park", "پارک", "/pɑːrk/", "noun", "The park is beautiful.", "پارک زیباست."),
                VocabWord("restaurant", "رستوران", "/ˈrestərɑːnt/", "noun", "This restaurant is good.", "این رستوران خوبه."),
                VocabWord("supermarket", "سوپرمارکت", "/ˈsuːpərmɑːrkɪt/", "noun", "The supermarket is open.", "سوپرمارکت بازه."),
                VocabWord("hotel", "هتل", "/hoʊˈtel/", "noun", "We stayed in a hotel.", "در هتل موندیم."),
                VocabWord("street", "خیابان", "/striːt/", "noun", "This street is busy.", "این خیابان شلوغه."),
                VocabWord("corner", "گوشه", "/ˈkɔːrnər/", "noun", "It's on the corner.", "سر خیابونه."),
                VocabWord("near", "نزدیک", "/nɪr/", "preposition", "It's near here.", "نزدیک اینجاست."),
                VocabWord("far", "دور", "/fɑːr/", "adjective", "The airport is far.", "فرودگاه دوره."),
                VocabWord("left", "چپ", "/left/", "noun", "Turn left.", "به چپ بپیچ.")
            ),
            idioms = listOf(
                IdiomExpression("around the corner", "سر کوچه", "The pharmacy is around the corner.", "داروخانه سر کوچه‌ست.", "neutral"),
                IdiomExpression("Excuse me", "ببخشید", "Excuse me, where is the bank?", "ببخشید، بانک کجاست؟", "polite"),
                IdiomExpression("go straight", "مستقیم برو", "Go straight for two blocks.", "دو بلوک مستقیم برو.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Directions", "go straight /ɡoʊ streɪt/، turn left /tɜːrn left/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Asking for directions", "در غرب، پرسیدن آدرس از غریبه‌ها عادیه.")
            ),
            grammar = listOf(
                GrammarSection("There is / There are", "There is + مفرد / There are + جمع. There is a bank. There are two shops."),
                GrammarSection("Prepositions of place", "in, on, next to, across from, between"),
                GrammarSection("Imperatives for directions", "Go straight. / Turn left. / Turn right."),
                GrammarSection("Questions about location", "Where is the bank? / Is there a park near here?")
            ),
            commonMistakes = listOf(
                CommonMistake("There is two banks.", "There are two banks.", "جمع = there are."),
                CommonMistake("Where is bank?", "Where is the bank?", "the لازم داره."),
                CommonMistake("Turn to left.", "Turn left.", "بدون to.")
            ),
            conversation = listOf(
                DialogueLine("A", "Excuse me, where is the bank?", "ببخشید، بانک کجاست؟"),
                DialogueLine("B", "Go straight for two blocks.", "دو بلوک مستقیم برو."),
                DialogueLine("A", "Then what?", "بعدش چی؟"),
                DialogueLine("B", "Turn left at the traffic light.", "پشت چراغ راهنما به چپ بپیچ."),
                DialogueLine("A", "Left at the light. Got it.", "چپ پشت چراغ. فهمیدم."),
                DialogueLine("B", "The bank is on your right, next to the pharmacy.", "بانک سمت راسته، کنار داروخانه."),
                DialogueLine("A", "Is it far from here?", "از اینجا دوره؟"),
                DialogueLine("B", "No, about 5 minutes on foot.", "نه، حدود ۵ دقیقه پیاده."),
                DialogueLine("A", "Is there a park near the bank?", "پارک نزدیک بانک هست؟"),
                DialogueLine("B", "Yes, there's a park across from it.", "بله، روبروش یه پارک هست."),
                DialogueLine("A", "Great. And a coffee shop?", "عالی. کافه هم هست؟"),
                DialogueLine("B", "Yes, there are two on that street.", "بله، دو تا توی اون خیابون هست."),
                DialogueLine("A", "Perfect. Thank you so much!", "عالی. خیلی ممنون!"),
                DialogueLine("B", "You're welcome. Have a nice day!", "خواهش می‌کنم. روز خوبی داشته باشی!"),
                DialogueLine("A", "One more thing — where's the station?", "یه چیز دیگه — ایستگاه کجاست؟"),
                DialogueLine("B", "It's far. You should take a taxi.", "دوره. باید تاکسی بگیری."),
                DialogueLine("A", "OK, I'll do that. Thanks again!", "باشه، همین کار رو می‌کنم. بازم ممنون!"),
                DialogueLine("B", "Anytime. Good luck!", "هر وقت. موفق باشی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("بانک کجاست؟", "سمت راست، کنار داروخانه."),
                ComprehensionQuestion("بانک چقدر دور است؟", "حدود ۵ دقیقه پیاده."),
                ComprehensionQuestion("پارک کجاست؟", "روبروی بانک."),
                ComprehensionQuestion("ایستگاه چطور؟", "دور است، باید تاکسی بگیرد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Ask for directions.", "مسیر بپرس.", "Excuse me, where is...?"),
                SpeakingTask("Give directions.", "مسیر بده.", "Go straight... / Turn left...")
            ),
            writingTasks = listOf(
                WritingTask("Write directions from your home to a nearby place.", "از خونت به یه جای نزدیک مسیر بنویس.", 100, "Use imperatives and prepositions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: There ___ two banks.", listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: Turn ___ at the corner.", listOf("left", "the left", "to left", "lefts"), 0),
                QuizQuestion("Complete: The bank is ___ the hotel.", listOf("next to", "next", "near of", "close"), 0),
                QuizQuestion("What does 'around the corner' mean?", listOf("سر کوچه", "گوشه", "دور", "کنار"), 0),
                QuizQuestion("Complete: Where ___ the bank?", listOf("are", "is", "have", "has"), 1),
                QuizQuestion("Complete: Is there a park ___ here?", listOf("near", "next", "close", "at"), 0),
                QuizQuestion("Complete: Go ___ for two blocks.", listOf("straight", "left", "right", "corner"), 0),
                QuizQuestion("Complete: The bank is ___ your right.", listOf("in", "at", "on", "from"), 2)
            )
        )
    }

    // CHAPTER 4 — Activities
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Activities",
            titlePersian = "فعالیت‌ها",
            objectives = listOf(
                "Talk about hobbies",
                "Use can/can't for ability",
                "Use like/love + verb-ing",
                "Talk about sports"
            ),
            vocabulary = listOf(
                VocabWord("read", "خواندن", "/riːd/", "verb", "I like reading books.", "دوست دارم کتاب بخونم."),
                VocabWord("play", "بازی کردن", "/pleɪ/", "verb", "I play football.", "فوتبال بازی می‌کنم."),
                VocabWord("watch", "تماشا کردن", "/wɑːtʃ/", "verb", "I watch movies.", "فیلم تماشا می‌کنم."),
                VocabWord("listen", "گوش دادن", "/ˈlɪsən/", "verb", "I listen to music.", "به موسیقی گوش می‌دم."),
                VocabWord("cook", "آشپزی کردن", "/kʊk/", "verb", "I love cooking.", "عاشق آشپزی هستم."),
                VocabWord("swim", "شنا کردن", "/swɪm/", "verb", "Can you swim?", "می‌تونی شنا کنی؟"),
                VocabWord("draw", "نقاشی کشیدن", "/drɔː/", "verb", "She draws very well.", "او خیلی خوب نقاشی می‌کشه."),
                VocabWord("sing", "آواز خواندن", "/sɪŋ/", "verb", "I can't sing.", "نمی‌تونم آواز بخونم."),
                VocabWord("dance", "رقصیدن", "/dæns/", "verb", "We dance at parties.", "در مهمونی‌ها می‌رقصیم."),
                VocabWord("run", "دویدن", "/rʌn/", "verb", "I run every morning.", "هر صبح می‌دوم."),
                VocabWord("walk", "پیاده‌روی کردن", "/wɔːk/", "verb", "We walk in the park.", "در پارک قدم می‌زنیم."),
                VocabWord("hobby", "سرگرمی", "/ˈhɑːbi/", "noun", "My hobby is reading.", "سرگرمی من کتاب خواندنه.")
            ),
            idioms = listOf(
                IdiomExpression("hang out", "وقت گذراندن", "I hang out with friends.", "با دوستام وقت می‌گذرونم.", "informal"),
                IdiomExpression("have a blast", "خیلی خوش گذروندن", "We had a blast at the party.", "توی مهمونی خیلی خوش گذروندیم.", "informal"),
                IdiomExpression("kill time", "وقت کشتن", "I read to kill time.", "برای کشتن وقت می‌خونم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ing", "swimming /ˈswɪmɪŋ/."),
                PronunciationTip("can / can't", "can't /kænt/ در آمریکا.")
            ),
            culturalNotes = listOf(
                CulturalNote("Sports culture", "ورزش در فرهنگ غربی مهمه.")
            ),
            grammar = listOf(
                GrammarSection("can / can't", "I can swim. She can cook. They can't speak French."),
                GrammarSection("like + verb-ing", "I like reading. I love cooking. I enjoy swimming."),
                GrammarSection("go + verb-ing", "go swimming / go shopping / go dancing"),
                GrammarSection("Present simple questions", "Do you play sports? / Does she like cooking?")
            ),
            commonMistakes = listOf(
                CommonMistake("I like read books.", "I like reading books.", "بعد از like فعل +ing."),
                CommonMistake("I can to swim.", "I can swim.", "بعد از can فعل ساده."),
                CommonMistake("She cans cook.", "She can cook.", "can ثابت است."),
                CommonMistake("I go to swimming.", "I go swimming.", "بدون to.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you do in your free time?", "وقت آزادت چیکار می‌کنی؟"),
                DialogueLine("B", "I love reading and watching movies.", "عاشق کتاب خواندن و فیلم دیدنم."),
                DialogueLine("A", "I enjoy cooking. I try new recipes.", "از آشپزی لذت می‌برم. دستور پخت جدید امتحان می‌کنم."),
                DialogueLine("B", "Can you cook Persian food?", "می‌تونی غذای ایرانی بپزی؟"),
                DialogueLine("A", "Yes, I can! My mother taught me.", "بله! مادرم یادم داد."),
                DialogueLine("B", "What's your favorite dish?", "غذای مورد علاقه‌ات چیه؟"),
                DialogueLine("A", "I love making ghormeh sabzi.", "عاشق درست کردن قرمه سبزی هستم."),
                DialogueLine("B", "I've never tried it. Maybe you can teach me!", "امتحانش نکردم. شاید بتونی یادم بدی!"),
                DialogueLine("A", "Sure! What sports do you play?", "حتماً! چه ورزشی می‌کنی؟"),
                DialogueLine("B", "I play tennis. I go swimming too.", "تنیس بازی می‌کنم. شنا هم می‌رم."),
                DialogueLine("A", "Can you swim well?", "خوب شنا می‌کنی؟"),
                DialogueLine("B", "Yes, I can. I learned when I was five.", "بله. پنج سالگی یاد گرفتم."),
                DialogueLine("A", "Do you play any instruments?", "ساز هم می‌زنی؟"),
                DialogueLine("B", "I play the guitar, but not very well.", "گیتار می‌زنم، ولی نه خیلی خوب."),
                DialogueLine("A", "That's still impressive! I can't play anything.", "این هم قابل تحسینه! من هیچی نمی‌تونم بزنم."),
                DialogueLine("B", "You could learn! It's never too late.", "می‌تونی یاد بگیری! هیچ‌وقت دیر نیست."),
                DialogueLine("A", "Maybe I will. Thanks for the encouragement.", "شاید یاد بگیرم. ممنون برای تشویق."),
                DialogueLine("B", "Anytime! Let me know if you want lessons.", "هر وقت! اگه کلاس خواستی خبرم کن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("A وقت آزادش چیکار می‌کنه؟", "آشپزی می‌کنه."),
                ComprehensionQuestion("B چه ورزش‌هایی می‌کنه؟", "تنیس و شنا."),
                ComprehensionQuestion("B چه سازی می‌زنه؟", "گیتار."),
                ComprehensionQuestion("A چه غذایی دوست داره بپزه؟", "قرمه سبزی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your hobbies.", "درباره سرگرمی‌هات صحبت کن.", "I like... / I love..."),
                SpeakingTask("Talk about what you can/can't do.", "درباره توانایی‌هات صحبت کن.", "I can... / I can't...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite hobby.", "درباره سرگرمی مورد علاقه‌ات بنویس.", 100, "Use like + verb-ing.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I like ___ books.", listOf("read", "reading", "to read", "reads"), 1),
                QuizQuestion("Complete: She can ___ very well.", listOf("to cook", "cooks", "cook", "cooking"), 2),
                QuizQuestion("Complete: I go ___ on Sundays.", listOf("to swim", "swimming", "swim", "swims"), 1),
                QuizQuestion("What does 'hang out' mean?", listOf("آویزون شدن", "وقت گذراندن", "بیرون رفتن", "خرید کردن"), 1),
                QuizQuestion("Complete: ___ you play tennis?", listOf("Are", "Do", "Is", "Does"), 1),
                QuizQuestion("Complete: She ___ play the piano.", listOf("can", "cans", "is can", "to can"), 0),
                QuizQuestion("Complete: I ___ cooking.", listOf("enjoy", "enjoys", "enjoying", "enjoyed"), 0),
                QuizQuestion("What does 'have a blast' mean?", listOf("انفجار", "خیلی خوش گذروندن", "بیرون رفتن", "دویدن"), 1)
            )
        )
    }

    // CHAPTER 5 — Food
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Food",
            titlePersian = "غذا",
            objectives = listOf(
                "Talk about food",
                "Use some and any",
                "Order food at a restaurant",
                "Use count and non-count nouns"
            ),
            vocabulary = listOf(
                VocabWord("food", "غذا", "/fuːd/", "noun", "I love Italian food.", "عاشق غذای ایتالیایی‌ام."),
                VocabWord("meal", "وعده غذایی", "/miːl/", "noun", "We have three meals a day.", "روزی سه وعده داریم."),
                VocabWord("rice", "برنج", "/raɪs/", "noun", "We eat rice every day.", "هر روز برنج می‌خوریم."),
                VocabWord("bread", "نان", "/bred/", "noun", "We need some bread.", "کمی نان لازم داریم."),
                VocabWord("meat", "گوشت", "/miːt/", "noun", "She doesn't eat meat.", "او گوشت نمی‌خوره."),
                VocabWord("fruit", "میوه", "/fruːt/", "noun", "Eat more fruit!", "میوه بیشتر بخور!"),
                VocabWord("vegetable", "سبزیجات", "/ˈvedʒtəbəl/", "noun", "I like green vegetables.", "سبزیجات سبز دوست دارم."),
                VocabWord("water", "آب", "/ˈwɔːtər/", "noun", "Can I have some water?", "می‌تونم کمی آب داشته باشم؟"),
                VocabWord("coffee", "قهوه", "/ˈkɔːfi/", "noun", "I drink coffee every morning.", "هر صبح قهوه می‌خورم."),
                VocabWord("menu", "منو", "/ˈmenjuː/", "noun", "Can I see the menu?", "می‌تونم منو رو ببینم؟"),
                VocabWord("order", "سفارش", "/ˈɔːrdər/", "verb", "Are you ready to order?", "آماده سفارش هستید؟"),
                VocabWord("bill", "صورت‌حساب", "/bɪl/", "noun", "Can we have the bill?", "می‌تونیم صورت‌حساب بگیریم؟")
            ),
            idioms = listOf(
                IdiomExpression("eat out", "بیرون غذا خوردن", "We eat out every Friday.", "هر جمعه بیرون غذا می‌خوریم.", "neutral"),
                IdiomExpression("have a sweet tooth", "شیرینی‌دوست بودن", "She has a sweet tooth.", "او شیرینی‌دوست است.", "idiom"),
                IdiomExpression("piece of cake", "خیلی راحت", "The test was a piece of cake!", "امتحان خیلی راحت بود!", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th sound", "th در thank و three صدای /θ/ دارد."),
                PronunciationTip("vegetable", "vegetable /ˈvedʒtəbəl/ — سه سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Eating out", "در غرب، بیرون غذا خوردن رایجه."),
                CulturalNote("Tipping", "در آمریکا، انعام ۱۵-۲۰٪ رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Countable vs uncountable", "قابل شمارش: apple, egg, sandwich / غیرقابل شمارش: water, rice, bread"),
                GrammarSection("some / any", "some در مثبت، any در منفی و سوال"),
                GrammarSection("Ordering food", "I'd like... please. / Can I have...?"),
                GrammarSection("How much / How many", "How much + غیرقابل شمارش / How many + قابل شمارش")
            ),
            commonMistakes = listOf(
                CommonMistake("I have some milks.", "I have some milk.", "milk غیرقابل شمارش."),
                CommonMistake("I'd like a water.", "I'd like some water.", "water غیرقابل شمارش."),
                CommonMistake("How many water?", "How much water?", "water غیرقابل شمارش.")
            ),
            conversation = listOf(
                DialogueLine("Waiter", "Good evening. Are you ready to order?", "عصر بخیر. آماده سفارش هستید؟"),
                DialogueLine("Customer", "Yes, I'd like a chicken sandwich, please.", "بله، یه ساندویچ مرغ می‌خوام، لطفاً."),
                DialogueLine("Waiter", "Would you like anything to drink?", "نوشیدنی چیزی میل دارید؟"),
                DialogueLine("Customer", "Yes, some water, please.", "بله، کمی آب، لطفاً."),
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
                DialogueLine("Waiter", "Excellent choice!", "انتخاب عالی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("مشتری چه غذایی سفارش داد؟", "ساندویچ مرغ."),
                ComprehensionQuestion("چه نوشیدنی سفارش داد؟", "آب."),
                ComprehensionQuestion("چطور پرداخت کرد؟", "با کارت."),
                ComprehensionQuestion("چه دسری سفارش داد؟", "کیک شکلاتی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Order food at a restaurant.", "نقش‌بازی: در رستوران غذا سفارش بده.", "I'd like... / Can I have...?"),
                SpeakingTask("Talk about your favorite food.", "درباره غذای مورد علاقه‌ات صحبت کن.", "I love... / My favorite is...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite meal.", "درباره غذای مورد علاقه‌ات بنویس.", 100, "Describe the food and why you like it.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I'd like ___ water.", listOf("a", "an", "some", "many"), 2),
                QuizQuestion("Complete: Do you have ___ bread?", listOf("some", "any", "a", "many"), 1),
                QuizQuestion("Complete: How ___ water?", listOf("many", "much", "some", "any"), 1),
                QuizQuestion("Complete: I have ___ apple.", listOf("a", "an", "some", "any"), 1),
                QuizQuestion("Complete: I'd like ___ coffee, please.", listOf("a", "an", "some", "any"), 0),
                QuizQuestion("Complete: ___ you like some tea?", listOf("Do", "Does", "Would", "Are"), 2),
                QuizQuestion("Complete: She ___ eat meat.", listOf("don't", "doesn't", "isn't", "aren't"), 1),
                QuizQuestion("What does 'eat out' mean?", listOf("بیرون غذا خوردن", "داخل غذا خوردن", "آشپزی کردن", "خرید کردن"), 0)
            )
        )
    }

    // CHAPTER 6 — Shopping
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Shopping",
            titlePersian = "خرید",
            objectives = listOf(
                "Talk about shopping",
                "Ask about prices",
                "Use this/these/that/those",
                "Use the present continuous"
            ),
            vocabulary = listOf(
                VocabWord("shop", "مغازه", "/ʃɑːp/", "noun", "The shop is open.", "مغازه بازه."),
                VocabWord("price", "قیمت", "/praɪs/", "noun", "What's the price?", "قیمتش چنده؟"),
                VocabWord("cheap", "ارزان", "/tʃiːp/", "adjective", "This shirt is cheap.", "این پیراهن ارزونه."),
                VocabWord("expensive", "گران", "/ɪkˈspensɪv/", "adjective", "That's too expensive.", "اون خیلی گرونه."),
                VocabWord("clothes", "لباس", "/kloʊðz/", "noun", "I need new clothes.", "لباس جدید لازم دارم."),
                VocabWord("shirt", "پیراهن", "/ʃɜːrt/", "noun", "This shirt is nice.", "این پیراهن قشنگه."),
                VocabWord("shoes", "کفش", "/ʃuːz/", "noun", "These shoes are new.", "این کفش‌ها نو هستن."),
                VocabWord("color", "رنگ", "/ˈkʌlər/", "noun", "What color is it?", "چه رنگیه؟"),
                VocabWord("size", "سایز", "/saɪz/", "noun", "What size are you?", "چه سایزی هستی؟"),
                VocabWord("buy", "خریدن", "/baɪ/", "verb", "I want to buy this.", "می‌خوام اینو بخرم."),
                VocabWord("pay", "پرداخت کردن", "/peɪ/", "verb", "How much did you pay?", "چقدر پرداخت کردی؟"),
                VocabWord("cash", "نقد", "/kæʃ/", "noun", "Do you take cash?", "نقد می‌گیرید؟")
            ),
            idioms = listOf(
                IdiomExpression("on sale", "حراج", "The shoes are on sale.", "کفش‌ها حراج هستن.", "neutral"),
                IdiomExpression("window shopping", "ویترین‌گردی", "We went window shopping.", "رفتیم ویترین‌گردی.", "informal"),
                IdiomExpression("cost an arm and a leg", "خیلی گران بودن", "That bag cost an arm and a leg.", "اون کیف خیلی گرون بود.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("this / that", "this /ðɪs/، that /ðæt/ — صدای /ð/."),
                PronunciationTip("clothes", "clothes /kloʊðz/ — th صدادار.")
            ),
            culturalNotes = listOf(
                CulturalNote("Shopping in the West", "در غرب، خرید در مال‌ها رایجه."),
                CulturalNote("Black Friday", "در آمریکا، روز تخفیف بزرگه.")
            ),
            grammar = listOf(
                GrammarSection("this / that / these / those", "این: this/these / آن: that/those"),
                GrammarSection("Present continuous", "am/is/are + verb-ing: I'm wearing a blue shirt."),
                GrammarSection("How much is/are...?", "How much is + مفرد / How much are + جمع"),
                GrammarSection("Colors as adjectives", "color + noun: a red car")
            ),
            commonMistakes = listOf(
                CommonMistake("How much are this shirt?", "How much is this shirt?", "برای مفرد از is."),
                CommonMistake("This shoes are nice.", "These shoes are nice.", "برای جمع از these."),
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
                DialogueLine("B", "Yes, 30 days with the receipt.", "بله، ۳۰ روز با رسید.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("پیراهن چقدر بود؟", "۲۵ دلار."),
                ComprehensionQuestion("کفش‌های حراج چقدر بودند؟", "۳۰ دلار."),
                ComprehensionQuestion("مشتری چه سایزی خرید؟", "مدیوم."),
                ComprehensionQuestion("سیاست بازگشت چقدر است؟", "۳۰ روز با رسید.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Role-play shopping for clothes.", "نقش‌بازی: خرید لباس.", "How much is...? / Can I try...?"),
                SpeakingTask("Describe what you're wearing today.", "توصیف کن امروز چی پوشیدی.", "I'm wearing...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your favorite clothes.", "لباس‌های مورد علاقه‌ات رو توصیف کن.", 100, "Use colors and sizes.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: How much ___ these shoes?", listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: ___ shirt is nice.", listOf("This", "These", "Those", "Them"), 0),
                QuizQuestion("Complete: I'm ___ a blue shirt.", listOf("wear", "wears", "wearing", "wore"), 2),
                QuizQuestion("Complete: What color ___ it?", listOf("is", "are", "have", "has"), 0),
                QuizQuestion("Complete: ___ shoes are new.", listOf("This", "That", "These", "Them"), 2),
                QuizQuestion("Complete: I want to ___ this shirt.", listOf("buy", "buys", "buying", "bought"), 0),
                QuizQuestion("What does 'on sale' mean?", listOf("حراج", "گران", "خرید", "فروشگاه"), 0),
                QuizQuestion("Complete: How much did you ___?", listOf("buy", "pay", "cost", "spend"), 1)
            )
        )
    }

    // CHAPTER 7 — Weather
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Weather",
            titlePersian = "آب و هوا",
            objectives = listOf(
                "Talk about weather",
                "Name seasons",
                "Use present continuous for weather",
                "Talk about seasonal activities"
            ),
            vocabulary = listOf(
                VocabWord("weather", "آب و هوا", "/ˈweðər/", "noun", "The weather is nice.", "هوا خوبه."),
                VocabWord("sunny", "آفتابی", "/ˈsʌni/", "adjective", "It's sunny today.", "امروز آفتابیه."),
                VocabWord("rainy", "بارانی", "/ˈreɪni/", "adjective", "It's rainy in spring.", "بهار بارونیه."),
                VocabWord("cloudy", "ابری", "/ˈklaʊdi/", "adjective", "It's cloudy today.", "امروز ابریه."),
                VocabWord("snowy", "برفی", "/ˈsnoʊi/", "adjective", "It's snowy in winter.", "زمستون برفیه."),
                VocabWord("windy", "بادی", "/ˈwɪndi/", "adjective", "It's windy today.", "امروز بادیه."),
                VocabWord("hot", "گرم", "/hɑːt/", "adjective", "Summer is hot.", "تابستون گرمه."),
                VocabWord("cold", "سرد", "/koʊld/", "adjective", "Winter is cold.", "زمستون سرده."),
                VocabWord("spring", "بهار", "/sprɪŋ/", "noun", "Flowers bloom in spring.", "بهار گل‌ها شکوفه می‌دن."),
                VocabWord("summer", "تابستان", "/ˈsʌmər/", "noun", "We swim in summer.", "تابستون شنا می‌کنیم."),
                VocabWord("autumn", "پاییز", "/ˈɔːtəm/", "noun", "Leaves fall in autumn.", "پاییز برگ‌ها می‌ریزن."),
                VocabWord("winter", "زمستان", "/ˈwɪntər/", "noun", "It snows in winter.", "زمستون برف میاد.")
            ),
            idioms = listOf(
                IdiomExpression("under the weather", "حالش خوب نبودن", "I'm feeling under the weather.", "حالم خوب نیست.", "informal"),
                IdiomExpression("rain or shine", "در هر شرایطی", "We'll go, rain or shine.", "در هر شرایطی می‌ریم.", "idiom"),
                IdiomExpression("save for a rainy day", "برای روز مبادا پس‌انداز", "Save money for a rainy day.", "برای روز مبادا پول پس‌انداز کن.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in weather", "weather /ˈweðər/ — /ð/ صدادار."),
                PronunciationTip("seasons", "spring, summer, autumn, winter")
            ),
            culturalNotes = listOf(
                CulturalNote("Small talk about weather", "آب و هوا موضوع رایج Small Talk."),
                CulturalNote("Seasonal activities", "هر فصل فعالیت‌های خاصی داره.")
            ),
            grammar = listOf(
                GrammarSection("Present continuous for weather", "It's raining now. / The sun is shining."),
                GrammarSection("Future with going to", "It's going to rain. / It's going to be sunny."),
                GrammarSection("will for predictions", "It will be cold tomorrow."),
                GrammarSection("Questions about weather", "What's the weather like? / Is it going to rain?")
            ),
            commonMistakes = listOf(
                CommonMistake("How is the weather like?", "What's the weather like?", "ساختار صحیح."),
                CommonMistake("Weather is nice.", "The weather is nice.", "the لازم داره."),
                CommonMistake("It rains now.", "It's raining now.", "الان = continuous.")
            ),
            conversation = listOf(
                DialogueLine("A", "What's the weather like today?", "امروز هوا چطوره؟"),
                DialogueLine("B", "It's sunny and warm. Perfect for a walk.", "آفتابی و ملایمه. عالی برای پیاده‌روی."),
                DialogueLine("A", "Nice! What's your favorite season?", "خوبه! فصل مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "I love spring. The flowers bloom everywhere.", "عاشق بهارم. گل‌ها همه‌جا شکوفه می‌دن."),
                DialogueLine("A", "Me too! What about summer?", "منم! تابستون چطور؟"),
                DialogueLine("B", "It's too hot for me. I prefer cooler weather.", "برام خیلی گرمه. هوای خنک‌تر رو ترجیح می‌دم."),
                DialogueLine("A", "Do you like winter?", "زمستون دوست داری؟"),
                DialogueLine("B", "Yes, especially when it snows.", "بله، خصوصاً وقتی برف میاد."),
                DialogueLine("A", "Do you do any winter sports?", "ورزش زمستانی می‌کنی؟"),
                DialogueLine("B", "Yes, I ski sometimes. What about you?", "بله، گاهی اسکی می‌رم. تو چطور؟"),
                DialogueLine("A", "I mostly stay indoors in winter.", "من زمستون بیشتر خونه می‌مونم."),
                DialogueLine("B", "That's understandable. It's cold outside.", "قابل درکه. بیرون سرده."),
                DialogueLine("A", "What are you going to do this weekend?", "این آخر هفته چیکار می‌کنی؟"),
                DialogueLine("B", "I'm going to visit my grandparents if the weather is good.", "اگه هوا خوب باشه، می‌رم دیدن پدربزرگ و مادربزرگم."),
                DialogueLine("A", "The forecast says it's going to be sunny.", "پیش‌بینی می‌گه آفتابی می‌شه."),
                DialogueLine("B", "Perfect! I'll definitely go.", "عالی! حتماً می‌رم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("امروز هوا چطور است؟", "آفتابی و ملایم."),
                ComprehensionQuestion("فصل مورد علاقه B چیست؟", "بهار."),
                ComprehensionQuestion("B چه ورزش زمستانی می‌کند؟", "اسکی."),
                ComprehensionQuestion("B این آخر هفته چیکار می‌کند؟", "به دیدن پدربزرگ و مادربزرگش می‌رود.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about weather in your city.", "درباره آب و هوای شهرت صحبت کن.", "It's usually... in summer."),
                SpeakingTask("Describe your favorite season.", "فصل مورد علاقه‌ات رو توصیف کن.", "I love... because...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite season.", "درباره فصل مورد علاقه‌ات بنویس.", 100, "Use weather vocabulary.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: What's the weather ___?", listOf("like", "as", "than", "of"), 0),
                QuizQuestion("Complete: It's ___ rain.", listOf("going to", "will", "go to", "goes"), 0),
                QuizQuestion("Complete: It's ___ today.", listOf("sun", "sunny", "sunshine", "sunny day"), 1),
                QuizQuestion("What does 'under the weather' mean?", listOf("زیر بارون", "حالش خوب نیست", "خوشحال", "سلامت"), 1),
                QuizQuestion("Complete: ___ weather is nice.", listOf("A", "An", "The", "-"), 2),
                QuizQuestion("Complete: Flowers bloom in ___.", listOf("winter", "spring", "summer", "autumn"), 1),
                QuizQuestion("Complete: It's ___ in winter.", listOf("hot", "warm", "cold", "cool"), 2),
                QuizQuestion("What does 'rain or shine' mean?", listOf("بارون یا آفتاب", "در هر شرایطی", "بارونی", "آفتابی"), 1)
            )
        )
    }

    // CHAPTER 8 — Free Time
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Free Time",
            titlePersian = "وقت آزاد",
            objectives = listOf(
                "Talk about hobbies",
                "Use like/love/enjoy + verb-ing",
                "Talk about sports",
                "Invite someone out"
            ),
            vocabulary = listOf(
                VocabWord("hobby", "سرگرمی", "/ˈhɑːbi/", "noun", "My hobby is reading.", "سرگرمی من کتاب خواندنه."),
                VocabWord("read", "خواندن", "/riːd/", "verb", "I like reading books.", "دوست دارم کتاب بخونم."),
                VocabWord("play", "بازی کردن", "/pleɪ/", "verb", "I play football.", "فوتبال بازی می‌کنم."),
                VocabWord("watch", "تماشا کردن", "/wɑːtʃ/", "verb", "I watch movies.", "فیلم تماشا می‌کنم."),
                VocabWord("listen", "گوش دادن", "/ˈlɪsən/", "verb", "I listen to music.", "به موسیقی گوش می‌دم."),
                VocabWord("cook", "آشپزی کردن", "/kʊk/", "verb", "I love cooking.", "عاشق آشپزی هستم."),
                VocabWord("swim", "شنا کردن", "/swɪm/", "verb", "Can you swim?", "می‌تونی شنا کنی؟"),
                VocabWord("draw", "نقاشی کشیدن", "/drɔː/", "verb", "She draws very well.", "او خیلی خوب نقاشی می‌کشه."),
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb", "We travel every summer.", "هر تابستان سفر می‌کنیم."),
                VocabWord("meet friends", "دیدن دوستان", "/miːt frendz/", "phrase", "I meet friends on Fridays.", "جمعه‌ها دوستام رو می‌بینم."),
                VocabWord("go shopping", "خرید رفتن", "/ɡoʊ ˈʃɑːpɪŋ/", "phrase", "I go shopping on weekends.", "آخر هفته‌ها خرید می‌رم."),
                VocabWord("relax", "استراحت کردن", "/rɪˈlæks/", "verb", "I relax on weekends.", "آخر هفته‌ها استراحت می‌کنم.")
            ),
            idioms = listOf(
                IdiomExpression("kill time", "وقت کشتن", "I read magazines to kill time.", "برای کشتن وقت مجله می‌خونم.", "informal"),
                IdiomExpression("have a blast", "خیلی خوش گذروندن", "We had a blast at the party.", "توی مهمونی خیلی خوش گذروندیم.", "informal"),
                IdiomExpression("hang out", "وقت گذراندن", "I hang out with friends.", "با دوستام وقت می‌گذرونم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ing", "swimming /ˈswɪmɪŋ/ — /ɪŋ/."),
                PronunciationTip("can / can't", "can't /kænt/ در آمریکا.")
            ),
            culturalNotes = listOf(
                CulturalNote("Weekend activities", "در غرب، آخر هفته‌ها برای ورزش و تفریح."),
                CulturalNote("Outdoor hobbies", "پیاده‌روی و پیک‌نیک رایجند.")
            ),
            grammar = listOf(
                GrammarSection("Like + verb-ing", "I like reading. / I love cooking."),
                GrammarSection("can / can't", "I can swim. / She can cook. / They can't speak French."),
                GrammarSection("Present simple questions", "Do you play sports? / Does she like cooking?"),
                GrammarSection("go + verb-ing", "go swimming / go shopping / go dancing")
            ),
            commonMistakes = listOf(
                CommonMistake("I like read books.", "I like reading books.", "بعد از like فعل +ing."),
                CommonMistake("I can to swim.", "I can swim.", "بعد از can فعل ساده."),
                CommonMistake("I go to swimming.", "I go swimming.", "بدون to.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you do in your free time?", "وقت آزادت چیکار می‌کنی؟"),
                DialogueLine("B", "I love reading and watching movies.", "عاشق کتاب خواندن و فیلم دیدنم."),
                DialogueLine("A", "I enjoy cooking. I try new recipes every weekend.", "از آشپزی لذت می‌برم. هر آخر هفته دستور پخت جدید امتحان می‌کنم."),
                DialogueLine("B", "That's cool! Can you cook Persian food?", "باحاله! می‌تونی غذای ایرانی بپزی؟"),
                DialogueLine("A", "Yes, I can! My mother taught me.", "بله! مادرم یادم داد."),
                DialogueLine("B", "What's your favorite dish to cook?", "غذای مورد علاقه‌ات برای پختن چیه؟"),
                DialogueLine("A", "I love making ghormeh sabzi.", "عاشق درست کردن قرمه سبزی هستم."),
                DialogueLine("B", "I've never tried it. Maybe you can teach me!", "امتحانش نکردم. شاید بتونی یادم بدی!"),
                DialogueLine("A", "Sure! What sports do you play?", "حتماً! چه ورزشی می‌کنی؟"),
                DialogueLine("B", "I play tennis. I go swimming too.", "تنیس بازی می‌کنم. شنا هم می‌رم."),
                DialogueLine("A", "Can you swim well?", "خوب شنا می‌کنی؟"),
                DialogueLine("B", "Yes, I can. I learned when I was five.", "بله. پنج سالگی یاد گرفتم."),
                DialogueLine("A", "Do you play any instruments?", "ساز هم می‌زنی؟"),
                DialogueLine("B", "I play the guitar, but not very well.", "گیتار می‌زنم، ولی نه خیلی خوب."),
                DialogueLine("A", "That's still impressive! I can't play anything.", "این هم قابل تحسینه! من هیچی نمی‌تونم بزنم."),
                DialogueLine("B", "You could learn! It's never too late.", "می‌تونی یاد بگیری! هیچ‌وقت دیر نیست.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("A وقت آزادش چیکار می‌کنه؟", "آشپزی می‌کنه."),
                ComprehensionQuestion("B چه ورزش‌هایی می‌کنه؟", "تنیس و شنا."),
                ComprehensionQuestion("B چه سازی می‌زنه؟", "گیتار."),
                ComprehensionQuestion("A چه غذایی دوست داره بپزه؟", "قرمه سبزی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your hobbies.", "درباره سرگرمی‌هات صحبت کن.", "I like... / I love..."),
                SpeakingTask("Talk about what you can/can't do.", "درباره توانایی‌هات صحبت کن.", "I can... / I can't...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite hobby.", "درباره سرگرمی مورد علاقه‌ات بنویس.", 100, "Use like + verb-ing.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I like ___ books.", listOf("read", "reading", "to read", "reads"), 1),
                QuizQuestion("Complete: She can ___ very well.", listOf("to cook", "cooks", "cook", "cooking"), 2),
                QuizQuestion("Complete: I go ___ on Sundays.", listOf("to swim", "swimming", "swim", "swims"), 1),
                QuizQuestion("What does 'hang out' mean?", listOf("آویزون شدن", "وقت گذراندن", "بیرون رفتن", "خرید کردن"), 1),
                QuizQuestion("Complete: ___ you play tennis?", listOf("Are", "Do", "Is", "Does"), 1),
                QuizQuestion("Complete: She ___ play the piano.", listOf("can", "cans", "is can", "to can"), 0),
                QuizQuestion("Complete: I ___ cooking.", listOf("enjoy", "enjoys", "enjoying", "enjoyed"), 0),
                QuizQuestion("What does 'have a blast' mean?", listOf("انفجار", "خیلی خوش گذروندن", "بیرون رفتن", "دویدن"), 1)
            )
        )
    }

    // CHAPTER 9 — Future Plans
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Future Plans",
            titlePersian = "برنامه‌های آینده",
            objectives = listOf(
                "Talk about future plans",
                "Use going to",
                "Use will for predictions",
                "Make arrangements"
            ),
            vocabulary = listOf(
                VocabWord("plan", "برنامه", "/plæn/", "noun", "What's your plan?", "برنامه‌ات چیه؟"),
                VocabWord("tomorrow", "فردا", "/təˈmɑːroʊ/", "adverb", "See you tomorrow!", "فردا می‌بینمت!"),
                VocabWord("soon", "به‌زودی", "/suːn/", "adverb", "I'll see you soon.", "به‌زودی می‌بینمت."),
                VocabWord("visit", "دیدن کردن", "/ˈvɪzɪt/", "verb", "I'll visit my family.", "خانواده‌ام رو می‌بینم."),
                VocabWord("start", "شروع کردن", "/stɑːrt/", "verb", "I'll start a new job.", "یه شغل جدید شروع می‌کنم."),
                VocabWord("learn", "یاد گرفتن", "/lɜːrn/", "verb", "I'm going to learn English.", "می‌خوام انگلیسی یاد بگیرم."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun", "My goal is to travel.", "هدفم سفر کردنه."),
                VocabWord("trip", "سفر", "/trɪp/", "noun", "We're planning a trip.", "داریم یه سفر برنامه‌ریزی می‌کنیم."),
                VocabWord("book", "رزرو کردن", "/bʊk/", "verb", "I'll book a hotel.", "هتل رزرو می‌کنم."),
                VocabWord("buy", "خریدن", "/baɪ/", "verb", "I'm going to buy a ticket.", "می‌خوام یه بلیط بخرم."),
                VocabWord("meet", "ملاقات کردن", "/miːt/", "verb", "I'm going to meet friends.", "دوستام رو می‌بینم."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun", "It's a great opportunity.", "فرصت عالیه.")
            ),
            idioms = listOf(
                IdiomExpression("look forward to", "بی‌صبرانه منتظر بودن", "I'm looking forward to the trip.", "بی‌صبرانه منتظر سفرم.", "neutral"),
                IdiomExpression("on the horizon", "در پیش رو", "Big changes are on the horizon.", "تغییرات بزرگی در پیشه.", "idiom"),
                IdiomExpression("up in the air", "نامعلوم", "The plan is still up in the air.", "برنامه هنوز نامعلومه.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("going to → gonna", "در مکالمه سریع going to → gonna."),
                PronunciationTip("will contraction", "I'll /aɪl/، you'll /juːl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("New Year's resolutions", "در غرب، ابتدای سال اهداف تعیین می‌کنند."),
                CulturalNote("Bucket list", "لیست کارهایی که می‌خواهند انجام دهند.")
            ),
            grammar = listOf(
                GrammarSection("going to", "am/is/are + going to + verb: I'm going to travel to Japan."),
                GrammarSection("will", "will + verb: I'll help you. / It will rain tomorrow."),
                GrammarSection("Present continuous for future", "I'm meeting Ali tomorrow at 5."),
                GrammarSection("Time expressions", "tomorrow, next week, this weekend, soon")
            ),
            commonMistakes = listOf(
                CommonMistake("I will to travel.", "I will travel.", "بعد از will فعل ساده."),
                CommonMistake("I'm go to travel.", "I'm going to travel.", "شکل درست going to."),
                CommonMistake("She will travels.", "She will travel.", "بعد از will فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you have any plans for the summer?", "برای تابستون برنامه‌ای داری؟"),
                DialogueLine("B", "Yes! I'm going to travel to Turkey.", "بله! می‌خوام برم ترکیه."),
                DialogueLine("A", "That sounds amazing! How long will you stay?", "فوق‌العاده! چقدر می‌مونی؟"),
                DialogueLine("B", "About two weeks. I'll visit Istanbul and Antalya.", "حدود دو هفته. استانبول و آنتالیا رو می‌بینم."),
                DialogueLine("A", "Have you booked your tickets yet?", "بلیط‌ها رو رزرو کردی؟"),
                DialogueLine("B", "Not yet. I'm going to book them next week.", "هنوز نه. می‌خوام هفته بعد رزرو کنم."),
                DialogueLine("A", "Who are you going with?", "با کی می‌ری؟"),
                DialogueLine("B", "With my brother. He's never been abroad.", "با برادرم. او هرگز خارج نبوده."),
                DialogueLine("A", "That's exciting. Will you stay in hotels?", "هیجان‌انگیزه. در هتل می‌مونید؟"),
                DialogueLine("B", "Yes, but we might try Airbnb for a few nights.", "بله، ولی ممکنه چند شب Airbnb امتحان کنیم."),
                DialogueLine("A", "Nice. What will you do there?", "خوبه. اونجا چیکار می‌کنید؟"),
                DialogueLine("B", "We'll visit historical sites and relax on the beach.", "از جاهای تاریخی بازدید می‌کنیم و در ساحل استراحت می‌کنیم."),
                DialogueLine("A", "Sounds perfect. Any plans for after the trip?", "بی‌نقص به نظر می‌رسه. بعد از سفر برنامه‌ای داری؟"),
                DialogueLine("B", "Actually, I'm going to start a new job.", "در واقع، می‌خوام یه شغل جدید شروع کنم."),
                DialogueLine("A", "Wow, big change! When do you start?", "واو، تغییر بزرگیه! کِی شروع می‌کنی؟"),
                DialogueLine("B", "Next month. I'm a little nervous but excited.", "ماه بعد. کمی مضطربم ولی هیجان‌زده.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B برای تابستان چه برنامه‌ای دارد؟", "به ترکیه سفر می‌کند."),
                ComprehensionQuestion("B با کی سفر می‌کند؟", "با برادرش."),
                ComprehensionQuestion("A چه برنامه‌ای دارد؟", "شروع یک شغل جدید."),
                ComprehensionQuestion("B چه کارهایی در ترکیه انجام می‌دهد؟", "بازدید تاریخی و استراحت در ساحل.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your summer plans.", "درباره برنامه‌های تابستانی‌ات صحبت کن.", "I'm going to... / I'll..."),
                SpeakingTask("Make plans with a friend.", "با یک دوست برنامه بذار.", "Are you free...? / Let's...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your future plans.", "درباره برنامه‌های آینده‌ات بنویس.", 120, "Use going to and will.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ going to travel.", listOf("is", "am", "are", "be"), 1),
                QuizQuestion("Complete: She ___ help you.", listOf("will", "wills", "is will", "to will"), 0),
                QuizQuestion("Complete: I'm ___ Ali tomorrow.", listOf("meet", "meeting", "meets", "met"), 1),
                QuizQuestion("What does 'look forward to' mean?", listOf("منتظر بودن", "ترسیدن", "فراموش کردن", "لغو کردن"), 0),
                QuizQuestion("Complete: They ___ going to visit us.", listOf("is", "am", "are", "be"), 2),
                QuizQuestion("Complete: I ___ call you tonight.", listOf("will", "wills", "am will", "to will"), 0),
                QuizQuestion("Complete: What ___ you do tomorrow?", listOf("are", "will", "is", "do"), 1),
                QuizQuestion("Complete: She ___ travel next week.", listOf("going to", "is going to", "are going to", "will to"), 1)
            )
        )
    }

    // CHAPTER 10 — Health
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Health",
            titlePersian = "سلامتی",
            objectives = listOf(
                "Talk about health and illness",
                "Use should/shouldn't for advice",
                "Name parts of the body",
                "Make an appointment"
            ),
            vocabulary = listOf(
                VocabWord("head", "سر", "/hed/", "noun", "My head hurts.", "سرم درد می‌کنه."),
                VocabWord("stomach", "شکم", "/ˈstʌmək/", "noun", "I have a stomachache.", "دل‌درد دارم."),
                VocabWord("arm", "بازو", "/ɑːrm/", "noun", "My arm hurts.", "بازوم درد می‌کنه."),
                VocabWord("leg", "پا", "/leɡ/", "noun", "I broke my leg.", "پام شکست."),
                VocabWord("fever", "تب", "/ˈfiːvər/", "noun", "She has a fever.", "او تب داره."),
                VocabWord("headache", "سردرد", "/ˈhedeɪk/", "noun", "I have a headache.", "سردرد دارم."),
                VocabWord("cold", "سرماخوردگی", "/koʊld/", "noun", "I have a cold.", "سرماخورده‌ام."),
                VocabWord("medicine", "دارو", "/ˈmedɪsɪn/", "noun", "Take this medicine.", "این دارو رو بخور."),
                VocabWord("doctor", "دکتر", "/ˈdɑːktər/", "noun", "You should see a doctor.", "باید دکتر بری."),
                VocabWord("hospital", "بیمارستان", "/ˈhɑːspɪtəl/", "noun", "She's in the hospital.", "او در بیمارستانه."),
                VocabWord("pain", "درد", "/peɪn/", "noun", "I have pain in my back.", "کمرم درد می‌کنه."),
                VocabWord("healthy", "سالم", "/ˈhelθi/", "adjective", "Eat healthy food.", "غذای سالم بخور.")
            ),
            idioms = listOf(
                IdiomExpression("under the weather", "حالش خوب نبودن", "I'm feeling under the weather today.", "امروز حالم خوب نیست.", "informal"),
                IdiomExpression("as fit as a fiddle", "خیلی سالم", "My grandfather is as fit as a fiddle.", "پدربزرگم خیلی سالمه.", "idiom"),
                IdiomExpression("take it easy", "سخت نگیر", "You should take it easy for a few days.", "باید چند روز سخت نگیری.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in health", "health /helθ/ — صدای /θ/."),
                PronunciationTip("silent h in hour", "hour /ˈaʊər/ — h تلفظ نمی‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Health systems", "در غرب، بیمه درمانی مهم است."),
                CulturalNote("Doctor visits", "اول به GP مراجعه می‌کنند.")
            ),
            grammar = listOf(
                GrammarSection("should / shouldn't", "You should rest. / You shouldn't eat too much sugar."),
                GrammarSection("have + illness", "I have a headache. / My head hurts."),
                GrammarSection("Questions about health", "What's the matter? / Are you OK?"),
                GrammarSection("Imperatives for advice", "Take this medicine. / Drink more water.")
            ),
            commonMistakes = listOf(
                CommonMistake("I have headache.", "I have a headache.", "قبل از headache از a."),
                CommonMistake("You should to rest.", "You should rest.", "بعد از should فعل ساده."),
                CommonMistake("My head is pain.", "My head hurts.", "برای درد از hurt.")
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
                SpeakingTask("Describe your symptoms to a doctor.", "علائم‌ت رو به دکتر بگو.", "I have... / My ... hurts."),
                SpeakingTask("Give advice to a sick friend.", "به یه دوست بیمار توصیه کن.", "You should... / You shouldn't...")
            ),
            writingTasks = listOf(
                WritingTask("Write about what you do to stay healthy.", "درباره کارهایی که برای سالم موندن انجام می‌دی بنویس.", 120, "Use should/shouldn't.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: You ___ rest.", listOf("should", "should to", "shoulds", "shoulding"), 0),
                QuizQuestion("Complete: I have ___ headache.", listOf("a", "an", "the", "-"), 0),
                QuizQuestion("Complete: My back ___.", listOf("hurt", "hurts", "is hurt", "hurting"), 1),
                QuizQuestion("Complete: You should ___ more water.", listOf("drink", "drinks", "drinking", "drank"), 0),
                QuizQuestion("Complete: She ___ a cold.", listOf("have", "has", "haves", "having"), 1),
                QuizQuestion("What does 'under the weather' mean?", listOf("زیر بارون", "حالش خوب نیست", "خوشحال", "سلامت"), 1),
                QuizQuestion("Complete: You shouldn't ___ junk food.", listOf("eat", "eats", "eating", "ate"), 0),
                QuizQuestion("What does 'take it easy' mean?", listOf("سخت بگیر", "سخت نگیر", "سریع برو", "بخواب"), 1)
            )
        )
    }

    // CHAPTER 11 — Travel
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Travel",
            titlePersian = "سفر",
            objectives = listOf(
                "Talk about travel experiences",
                "Use present perfect with ever/never",
                "Book hotels and tickets",
                "Ask for directions"
            ),
            vocabulary = listOf(
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb", "I love traveling.", "عاشق سفرم."),
                VocabWord("trip", "سفر", "/trɪp/", "noun", "How was your trip?", "سفرت چطور بود؟"),
                VocabWord("ticket", "بلیط", "/ˈtɪkɪt/", "noun", "I bought a ticket.", "یه بلیط خریدم."),
                VocabWord("hotel", "هتل", "/hoʊˈtel/", "noun", "We stayed in a hotel.", "در هتل موندیم."),
                VocabWord("airport", "فرودگاه", "/ˈerpɔːrt/", "noun", "The airport is far.", "فرودگاه دوره."),
                VocabWord("passport", "پاسپورت", "/ˈpæspɔːrt/", "noun", "Don't forget your passport!", "پاسپورتت رو فراموش نکن!"),
                VocabWord("luggage", "چمدان", "/ˈlʌɡɪdʒ/", "noun", "My luggage is heavy.", "چمدانم سنگینه."),
                VocabWord("sightseeing", "بازدید", "/ˈsaɪtsiːɪŋ/", "noun", "We went sightseeing.", "رفتیم بازدید."),
                VocabWord("abroad", "خارج", "/əˈbrɔːd/", "adverb", "She lives abroad.", "او در خارج زندگی می‌کنه."),
                VocabWord("reservation", "رزرو", "/ˌrezərˈveɪʃən/", "noun", "I have a reservation.", "رزرو دارم."),
                VocabWord("map", "نقشه", "/mæp/", "noun", "Check the map.", "نقشه رو چک کن."),
                VocabWord("guide", "راهنما", "/ɡaɪd/", "noun", "The guide was helpful.", "راهنما کمک‌کننده بود.")
            ),
            idioms = listOf(
                IdiomExpression("catch a flight", "به پرواز رسیدن", "We need to catch a flight at 6.", "باید ساعت ۶ به پرواز برسیم.", "neutral"),
                IdiomExpression("hit the road", "راه افتادن", "Let's hit the road early.", "بیا زود راه بیفتیم.", "informal"),
                IdiomExpression("off the beaten track", "دور از مسیر معمول", "We visited a village off the beaten track.", "از یه دهکده دور از مسیر معمول بازدید کردیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("travel vs trip", "travel /ˈtrævəl/، trip /trɪp/."),
                PronunciationTip("passport", "passport /ˈpæspɔːrt/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Travel tips", "خرید بیمه سفر رایجه."),
                CulturalNote("Airport customs", "customs و immigration جدا هستند.")
            ),
            grammar = listOf(
                GrammarSection("Present perfect with ever/never", "Have you ever been to Paris? / I've never been to Japan."),
                GrammarSection("Past simple vs present perfect", "I went to Paris in 2020. / I've been to Paris."),
                GrammarSection("Booking a hotel", "I'd like to book a room. / How much is it per night?"),
                GrammarSection("Directions", "Go straight. / Turn left. / How do I get to...?")
            ),
            commonMistakes = listOf(
                CommonMistake("I have been to Paris last year.", "I went to Paris last year.", "با زمان مشخص: past simple."),
                CommonMistake("Have you ever go to Paris?", "Have you ever been to Paris?", "past participle."),
                CommonMistake("next the week", "next week", "بدون the.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you ever been abroad?", "تا حالا خارج بودی؟"),
                DialogueLine("B", "Yes, I have. I've been to Turkey twice.", "بله. دو بار ترکیه بودم."),
                DialogueLine("A", "Nice! When did you go?", "خوبه! کی رفتی؟"),
                DialogueLine("B", "I went last summer with my family.", "تابستان گذشته با خانواده‌ام رفتم."),
                DialogueLine("A", "How was it?", "چطور بود؟"),
                DialogueLine("B", "Amazing. The food was delicious.", "فوق‌العاده. غذا خوشمزه بود."),
                DialogueLine("A", "Did you go sightseeing?", "بازدید کردی؟"),
                DialogueLine("B", "Yes, we visited the Blue Mosque.", "بله، مسجد آبی رو دیدیم."),
                DialogueLine("A", "Sounds great. Where did you stay?", "عالی. کجا موندی؟"),
                DialogueLine("B", "In a small hotel near the center.", "در هتل کوچکی نزدیک مرکز."),
                DialogueLine("A", "Have you ever traveled alone?", "تا حالا تنها سفر کردی؟"),
                DialogueLine("B", "No, I haven't. But I'd like to try.", "نه. ولی دوست دارم امتحان کنم."),
                DialogueLine("A", "It's fun but sometimes lonely.", "سرگرم‌کننده‌ست ولی گاهی تنهار."),
                DialogueLine("B", "That makes sense. What about you?", "منطقیه. تو چطور؟"),
                DialogueLine("A", "I've been to Italy and France.", "من ایتالیا و فرانسه بودم."),
                DialogueLine("B", "Wow! Which did you prefer?", "واو! کدوم رو ترجیح دادی؟"),
                DialogueLine("A", "Italy, I think. The art was incredible.", "ایتالیا، فکر کنم. هنرش باورنکردنی بود.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند بار ترکیه بوده؟", "دو بار."),
                ComprehensionQuestion("B کجا اقامت داشته؟", "هتل کوچک نزدیک مرکز."),
                ComprehensionQuestion("A کجاها بوده؟", "ایتالیا و فرانسه."),
                ComprehensionQuestion("A کدوم کشور رو ترجیح داد؟", "ایتالیا.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your travel experiences.", "درباره تجربه‌های سفرت صحبت کن.", "I've been to... / I went to..."),
                SpeakingTask("Ask for directions.", "نقش‌بازی: مسیر بپرس.", "How do I get to...? / Where is...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable trip.", "درباره یه سفر به‌یادماندنی بنویس.", 150, "Use past simple and present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: Have you ever ___ to Paris?", listOf("go", "went", "been", "going"), 2),
                QuizQuestion("Complete: I ___ to Paris in 2020.", listOf("have been", "went", "go", "going"), 1),
                QuizQuestion("Complete: I've ___ been to Japan.", listOf("ever", "never", "already", "yet"), 1),
                QuizQuestion("Complete: I'd like to ___ a room.", listOf("book", "books", "booking", "booked"), 0),
                QuizQuestion("Complete: Where ___ the station?", listOf("are", "is", "have", "has"), 1),
                QuizQuestion("Complete: Have you ever ___ abroad?", listOf("be", "being", "been", "was"), 2),
                QuizQuestion("Complete: I ___ a ticket yesterday.", listOf("buy", "bought", "buying", "buys"), 1),
                QuizQuestion("What does 'hit the road' mean?", listOf("زمین خوردن", "راه افتادن", "برگشتن", "توقف"), 1)
            )
        )
    }

    // CHAPTER 12 — Review
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review",
            titlePersian = "مرور",
            objectives = listOf(
                "Review all tenses",
                "Practice everyday conversations",
                "Use all grammar structures",
                "Prepare for real-life English"
            ),
            vocabulary = listOf(
                VocabWord("review", "مرور", "/rɪˈvjuː/", "noun", "Let's review the lesson.", "بیا درس رو مرور کنیم."),
                VocabWord("practice", "تمرین", "/ˈpræktɪs/", "noun", "Practice makes perfect.", "تمرین باعث پیشرفت."),
                VocabWord("improve", "بهتر کردن", "/ɪmˈpruːv/", "verb", "I want to improve my English.", "می‌خوام انگلیسی‌ام رو بهتر کنم."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective", "I feel more confident now.", "الان با اعتماد به نفس‌ترم."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun", "You're making great progress.", "داری پیشرفت خوبی می‌کنی."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun", "English is a fun challenge.", "انگلیسی چالش سرگرم‌کننده."),
                VocabWord("fluent", "روان", "/ˈfluːənt/", "adjective", "I want to be fluent.", "می‌خوام روان بشم."),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun", "It's OK to make mistakes.", "اشتباه کردن اشکالی نداره."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb", "Continue practicing every day.", "هر روز تمرین رو ادامه بده."),
                VocabWord("succeed", "موفق شدن", "/səkˈsiːd/", "verb", "You will succeed if you try.", "اگه تلاش کنی موفق می‌شی."),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun", "Learning is a journey.", "یادگیری یه سفره."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun", "My goal is to be fluent.", "هدفم روان شدنه.")
            ),
            idioms = listOf(
                IdiomExpression("practice makes perfect", "تمرین باعث پیشرفت", "Practice makes perfect — keep going!", "تمرین باعث پیشرفت — ادامه بده!", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد", "Don't give up.", "تسلیم نشو.", "idiom"),
                IdiomExpression("break a leg", "موفق باشی", "Break a leg on your exam!", "در امتحانت موفق باشی!", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Intonation", "در سؤال‌ها صدای پایان جمله بالا می‌رود."),
                PronunciationTip("Linking", "در گفتار طبیعی، کلمات به هم می‌چسبند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Language learning", "یادگیری زبان یک فرایند طولانیه."),
                CulturalNote("Mistakes", "اشتباه کردن بخش طبیعی یادگیریه.")
            ),
            grammar = listOf(
                GrammarSection("Review: Present simple", "I work every day. / She studies English."),
                GrammarSection("Review: Past simple", "I went to Paris. / She saw a movie."),
                GrammarSection("Review: Future", "I'll help you. / I'm going to travel."),
                GrammarSection("Review: Present perfect", "I've been to London. / Have you ever eaten sushi?")
            ),
            commonMistakes = listOf(
                CommonMistake("I am agree.", "I agree.", "agree فعل است."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده."),
                CommonMistake("He don't like it.", "He doesn't like it.", "برای he/she/it از doesn't.")
            ),
        طتتی    conversation = listOf(
                DialogueLine("A", "How's your English going?", "انگلیسی‌ت چطور پیش می‌ره؟"),
                DialogueLine("B", "Pretty well! I've been practicing every day.", "خیلی خوب! هر روز تمرین کرده‌ام."),
                DialogueLine("A", "That's great. Do you feel more confident?", "عالیه. با اعتماد به نفس‌تری؟"),
                DialogueLine("B", "Yes, much more. I can have basic conversations.", "بله، خیلی بیشتر. می‌تونم مکالمات پایه داشته باشم."),
                DialogueLine("A", "Awesome! What was the hardest part?", "عالی! سخت‌ترین قسمت چی بود؟"),
                DialogueLine("B", "Probably the grammar, especially the tenses.", "احتمالاً گرامر، خصوصاً زمان‌ها."),
                DialogueLine("A", "What helped you most?", "چی بیشتر کمک کرد؟"),
                DialogueLine("B", "Watching movies and talking to native speakers.", "فیلم دیدن و صحبت با نیتیوها."),
                DialogueLine("A", "That makes sense. What's your next goal?", "منطقیه. هدف بعدی‌ت چیه؟"),
                DialogueLine("B", "I want to be fluent in two years.", "می‌خوام در دو سال روان بشم."),
                DialogueLine("A", "That's a great goal. How will you get there?", "هدف عالیه. چطور بهش می‌رسی؟"),
                DialogueLine("B", "Practice every day, take more classes, and read books.", "هر روز تمرین، کلاس بیشتر، و کتاب خوندن."),
                DialogueLine("A", "Sounds like a good plan. Good luck!", "برنامه خوبی به نظر می‌رسه. موفق باشی!"),
                DialogueLine("B", "Thanks! Practice makes perfect.", "ممنون! تمرین باعث پیشرفت."),
                DialogueLine("A", "Exactly. Rome wasn't built in a day.", "دقیقاً. رم در یک روز ساخته نشد."),
                DialogueLine("B", "True. I'll be patient and consistent.", "درسته. صبور و پیوسته خواهم بود.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور انگلیسی‌اش را تقویت کرده؟", "تمرین روزانه، فیلم دیدن، صحبت با نیتیوها."),
                ComprehensionQuestion("سخت‌ترین بخش برای B چه بود؟", "گرامر، خصوصاً زمان‌ها."),
                ComprehensionQuestion("هدف B چیست؟", "روان شدن در دو سال."),
                ComprehensionQuestion("B چطور به هدفش می‌رسد؟", "تمرین روزانه، کلاس، کتاب خواندن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your English learning journey.", "درباره مسیر یادگیری انگلیسی‌ات صحبت کن.", "I started... / I've learned... / My goal is..."),
                SpeakingTask("Give advice to a beginner.", "به یک مبتدی توصیه کن.", "You should... / Don't give up...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your English learning goals.", "درباره اهداف یادگیری انگلیسی‌ات بنویس.", 150, "Use all tenses you've learned.")
            ),
            quiz = listOf(
                QuizQuestion("What does 'practice makes perfect' mean?", listOf("تمرین سخت است", "تمرین باعث پیشرفت", "تمرین بی‌فایده", "تمرین طولانی"), 1),
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