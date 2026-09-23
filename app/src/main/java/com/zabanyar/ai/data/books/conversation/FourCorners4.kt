package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCorners4 {

    const val BOOK_ID = "four_corners_4"

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

    // UNIT 1 — Something in Common
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Something in Common",
            titlePersian = "چیزی مشترک",
            objectives = listOf(
                "Talk about similarities and differences",
                "Use both, neither, and either",
                "Discuss shared interests",
                "Get to know someone new"
            ),
            vocabulary = listOf(
                VocabWord("similar", "مشابه", "/ˈsɪmələr/", "adjective", "We're very similar.", "خیلی شبیه همیم."),
                VocabWord("different", "متفاوت", "/ˈdɪfrənt/", "adjective", "We're different in many ways.", "در خیلی چیزها متفاوتیم."),
                VocabWord("common", "مشترک", "/ˈkɑːmən/", "adjective", "We have a lot in common.", "خیلی چیز مشترک داریم."),
                VocabWord("interest", "علاقه", "/ˈɪntrəst/", "noun", "Music is my main interest.", "موسیقی علاقه اصلی منه."),
                VocabWord("hobby", "سرگرمی", "/ˈhɑːbi/", "noun", "Reading is my hobby.", "خواندن سرگرمی منه."),
                VocabWord("alike", "شبیه هم", "/əˈlaɪk/", "adjective", "We think alike.", "ما شبیه هم فکر می‌کنیم."),
                VocabWord("identical", "یکسان", "/aɪˈdentɪkəl/", "adjective", "We have identical tastes.", "سلیقه‌مون یکسانه."),
                VocabWord("opinion", "نظر", "/əˈpɪnjən/", "noun", "In my opinion...", "به نظر من..."),
                VocabWord("agree", "موافق بودن", "/əˈɡriː/", "verb", "I agree with you.", "با تو موافقم.", "verb"),
                VocabWord("disagree", "مخالف بودن", "/ˌdɪsəˈɡriː/", "verb", "I disagree with that.", "با آن مخالفم.", "verb"),
                VocabWord("share", "مشترک داشتن", "/ʃer/", "verb", "We share the same values.", "ما ارزش‌های یکسانی داریم.", "verb"),
                VocabWord("connect", "ارتباط برقرار کردن", "/kəˈnekt/", "verb", "We connected immediately.", "بلافاصله ارتباط برقرار کردیم.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("have a lot in common", "چیزهای زیادی مشترک داشتن", "We have a lot in common.", "چیزهای زیادی مشترک داریم.", "neutral"),
                IdiomExpression("hit it off", "از اول جور شدن", "We hit it off immediately.", "از اول جور شدیم.", "informal"),
                IdiomExpression("on the same wavelength", "هم‌فکر بودن", "We're on the same wavelength.", "هم‌فکریم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in common", "common /ˈkɑːmən/ — بدون th."),
                PronunciationTip("Word stress", "identical /aɪˈdentɪkəl/ — استرس روی den."),
                PronunciationTip("Both and neither", "both /boʊθ/، neither /ˈniːðər/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Getting to know people", "در غرب، پیدا کردن علایق مشترک راهی برای شروع دوستی است."),
                CulturalNote("Personal space", "احترام به فضای شخصی هنگام آشنایی مهمه.")
            ),
            grammar = listOf(
                GrammarSection("both, neither, either", "Both = هر دو / Neither = هیچ‌کدام / Either = یکی از دو تا"),
                GrammarSection("So do I / Neither do I", "So do I = من هم / Neither do I = من هم نه"),
                GrammarSection("Present simple for habits", "We both like reading."),
                GrammarSection("Questions about interests", "What do you like to do? / Do you enjoy...?")
            ),
            commonMistakes = listOf(
                CommonMistake("We have many commons.", "We have a lot in common.", "عبارت صحیح have a lot in common."),
                CommonMistake("I too like it.", "I like it too. / So do I.", "ترتیب کلمات صحیح."),
                CommonMistake("Neither I do.", "Neither do I.", "inversion لازمه.")
            ),
            conversation = listOf(
                DialogueLine("A", "Hi! I don't think we've met. I'm Alex.", "سلام! فکر نمی‌کنم دیده باشیم. من الکسم."),
                DialogueLine("B", "Nice to meet you, Alex. I'm Maya.", "از آشنایی خوشحالم، الکس. من مایا هستم."),
                DialogueLine("A", "Nice to meet you too. Are you here for the book club?", "من هم خوشحال شدم. برای باشگاه کتاب اینجایی؟"),
                DialogueLine("B", "Yes, I am. It's my first time. What about you?", "بله. اولین بارمه. تو چطور؟"),
                DialogueLine("A", "Me too. I love reading. What kind of books do you like?", "منم. عاشق کتابم. چه نوع کتابی دوست داری؟"),
                DialogueLine("B", "I enjoy mysteries and thrillers. And you?", "معمایی و دلهره‌آور. تو چطور؟"),
                DialogueLine("A", "We have a lot in common! I love mysteries too.", "چیزهای زیادی مشترک داریم! منم عاشق معماییم."),
                DialogueLine("B", "Really? Who's your favorite author?", "واقعاً؟ نویسنده مورد علاقه‌ات کیه؟"),
                DialogueLine("A", "I really like Agatha Christie. And you?", "خیلی آگاتا کریستی رو دوست دارم. تو چطور؟"),
                DialogueLine("B", "So do I! Her books are amazing.", "منم همین‌طور! کتاباش فوق‌العاده‌اند."),
                DialogueLine("A", "We're definitely on the same wavelength.", "قطعاً هم‌فکریم."),
                DialogueLine("B", "Yes! Do you also enjoy watching movies?", "بله! فیلم دیدن هم دوست داری؟"),
                DialogueLine("A", "I do, but I prefer reading. What about you?", "دوست دارم، ولی خواندن رو ترجیح می‌دم. تو چطور؟"),
                DialogueLine("B", "I love both, actually. Books and movies.", "در واقع هر دو رو دوست دارم. کتاب و فیلم."),
                DialogueLine("A", "Nice. Maybe we can watch a mystery movie together sometime.", "خوبه. شاید یه وقت با هم یه فیلم معمایی ببینیم."),
                DialogueLine("B", "That would be great. Let's exchange numbers.", "عالی می‌شه. بیا شماره‌ها رو رد و بدل کنیم."),
                DialogueLine("A", "Sure! I'll text you later.", "حتماً! بعداً بهت پیام می‌دم."),
                DialogueLine("B", "Perfect. See you at the next meeting!", "عالی. جلسه بعد می‌بینمت!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Alex و Maya چه چیز مشترکی دارند؟", "هر دو عاشق کتاب‌های معمایی هستند."),
                ComprehensionQuestion("نویسنده مورد علاقه هر دو کیست؟", "آگاتا کریستی."),
                ComprehensionQuestion("Maya چه چیزی بیشتر دوست دارد؟", "کتاب و فیلم هر دو."),
                ComprehensionQuestion("قرار گذاشتند چه کار کنند؟", "فیلم معمایی با هم ببینند.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Find three things you have in common with a partner.", "سه چیز مشترک با یک دوست پیدا کن.", "We both like... / So do I. / Neither do I."),
                SpeakingTask("Talk about your favorite hobbies.", "درباره سرگرمی‌های مورد علاقه‌ات صحبت کن.", "I enjoy... / My hobby is...")
            ),
            writingTasks = listOf(
                WritingTask("Write about what you have in common with a friend.", "درباره چیزهایی که با یه دوست مشترک داری بنویس.", 150, "Use both, neither, and either.")
            ),
            quiz = listOf(
                QuizQuestion("We ___ like reading.", listOf("both", "neither", "either", "also"), 0),
                QuizQuestion("___ do I.", listOf("So", "Neither", "Either", "Both"), 0),
                QuizQuestion("I don't like coffee. — ___ do I.", listOf("So", "Neither", "Either", "Both"), 1),
                QuizQuestion("What does 'have a lot in common' mean?", listOf("تفاوت زیاد", "شباهت زیاد", "دعوا", "بی‌تفاوت"), 1),
                QuizQuestion("___ of us like sports.", listOf("Both", "Neither", "Either", "So"), 1),
                QuizQuestion("We're on the same ___.", listOf("wave", "wavelength", "way", "word"), 1),
                QuizQuestion("What's your favorite ___?", listOf("author", "authored", "authoring", "authorize"), 0),
                QuizQuestion("What does 'hit it off' mean?", listOf("کتک زدن", "جور شدن", "دعوا کردن", "جدا شدن"), 1)
            )
        )
    }

    // UNIT 2 — Making Choices
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Making Choices",
            titlePersian = "انتخاب کردن",
            objectives = listOf(
                "Discuss choices and decisions",
                "Use comparatives to compare options",
                "Talk about preferences",
                "Give reasons for choices"
            ),
            vocabulary = listOf(
                VocabWord("choice", "انتخاب", "/tʃɔɪs/", "noun", "It's your choice.", "این انتخاب توئه."),
                VocabWord("decision", "تصمیم", "/dɪˈsɪʒən/", "noun", "Make a decision.", "تصمیم بگیر."),
                VocabWord("option", "گزینه", "/ˈɑːpʃən/", "noun", "What are my options?", "گزینه‌هام چیه؟"),
                VocabWord("prefer", "ترجیح دادن", "/prɪˈfɜːr/", "verb", "I prefer tea to coffee.", "چای رو به قهوه ترجیح می‌دم.", "verb"),
                VocabWord("choose", "انتخاب کردن", "/tʃuːz/", "verb", "Choose one.", "یکی رو انتخاب کن.", "verb"),
                VocabWord("advantage", "مزیت", "/ədˈvæntɪdʒ/", "noun", "One advantage is the price.", "یه مزیتش قیمته."),
                VocabWord("disadvantage", "عیب", "/ˌdɪsədˈvæntɪdʒ/", "noun", "The disadvantage is the distance.", "عیبش دوره."),
                VocabWord("compare", "مقایسه کردن", "/kəmˈper/", "verb", "Compare the two.", "این دو رو مقایسه کن.", "verb"),
                VocabWord("better", "بهتر", "/ˈbetər/", "adjective", "This one is better.", "این یکی بهتره."),
                VocabWord("worse", "بدتر", "/wɜːrs/", "adjective", "That's worse.", "اون بدتره."),
                VocabWord("equal", "برابر", "/ˈiːkwəl/", "adjective", "They're equal.", "برابرن."),
                VocabWord("weigh", "سنجیدن", "/weɪ/", "verb", "Weigh the pros and cons.", "مزایا و معایب رو بسنج.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("weigh the pros and cons", "مزایا و معایب را سنجیدن", "Weigh the pros and cons first.", "اول مزایا و معایب رو بسنج.", "neutral"),
                IdiomExpression("on the fence", "دودل", "I'm still on the fence.", "هنوز دودلم.", "informal"),
                IdiomExpression("go with your gut", "به حست اعتماد کن", "Go with your gut.", "به حست اعتماد کن.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("comparatives", "better /ˈbetər/، worse /wɜːrs/."),
                PronunciationTip("prefer", "prefer /prɪˈfɜːr/ — استرس روی fer."),
                PronunciationTip("choice", "choice /tʃɔɪs/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Making decisions", "در غرب، تصمیم‌گیری شخصی رایجه."),
                CulturalNote("Pros and cons", "سنجیدن مزایا و معایب روشیه رایج.")
            ),
            grammar = listOf(
                GrammarSection("Comparatives", "-er + than / more + adjective + than"),
                GrammarSection("Better / worse", "irregular comparatives"),
                GrammarSection("Prefer to / would rather", "I prefer A to B. / I'd rather A than B."),
                GrammarSection("Giving reasons", "because, since, as")
            ),
            commonMistakes = listOf(
                CommonMistake("I prefer tea than coffee.", "I prefer tea to coffee.", "prefer ... to ..."),
                CommonMistake("This is more better.", "This is better.", "double comparative غلطه."),
                CommonMistake("I'd rather to go.", "I'd rather go.", "بعد از rather فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "I can't decide between the two apartments.", "نمی‌تونم بین دو تا آپارتمان تصمیم بگیرم."),
                DialogueLine("B", "What are the options?", "گزینه‌ها چیه؟"),
                DialogueLine("A", "One is downtown, and the other is in the suburbs.", "یکی مرکز شهره، اون یکی حومه."),
                DialogueLine("B", "What are the advantages of each?", "مزایای هر کدوم چیه؟"),
                DialogueLine("A", "The downtown one is closer to work, but it's more expensive.", "مرکز شهر نزدیک‌تر به کاره، ولی گران‌تره."),
                DialogueLine("B", "And the suburban one?", "و حومه چطور؟"),
                DialogueLine("A", "It's cheaper and quieter, but the commute is longer.", "ارزون‌تر و ساکت‌تره، ولی مسیر طولانی‌تره."),
                DialogueLine("B", "Have you weighed the pros and cons?", "مزایا و معایب رو سنجیدی؟"),
                DialogueLine("A", "Sort of. But I'm still on the fence.", "تا حدی. ولی هنوز دودلم."),
                DialogueLine("B", "What's more important to you: time or money?", "کدوم مهم‌تره برات: زمان یا پول؟"),
                DialogueLine("A", "Probably time. I hate long commutes.", "احتمالاً زمان. از مسیرهای طولانی بدم میاد."),
                DialogueLine("B", "Then the downtown one seems better.", "پس مرکز شهر بهتر به نظر می‌رسه."),
                DialogueLine("A", "But the cost is a big disadvantage.", "ولی هزینه عیب بزرگیه."),
                DialogueLine("B", "Maybe you should go with your gut.", "شاید باید به حست اعتماد کنی."),
                DialogueLine("A", "My gut says downtown.", "حسم می‌گه مرکز شهر."),
                DialogueLine("B", "Then choose downtown. You can always move later.", "پس مرکز شهر رو انتخاب کن. همیشه می‌تونی بعداً نقل مکان کنی."),
                DialogueLine("A", "You're right. Thanks for helping me decide.", "حق داری. ممنون که کمکم کردی تصمیم بگیرم."),
                DialogueLine("B", "Anytime! Good luck with the move.", "هر وقت! برای اسباب‌کشی موفق باشی.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("A بین چه چیزی باید تصمیم بگیرد؟", "بین دو آپارتمان."),
                ComprehensionQuestion("مزیت آپارتمان مرکز شهر چیست؟", "نزدیک‌تر به محل کار."),
                ComprehensionQuestion("عیب آپارتمان حومه چیست؟", "مسیر طولانی‌تر."),
                ComprehensionQuestion("A در نهایت چه چیزی را انتخاب می‌کند؟", "مرکز شهر.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Compare two options and make a choice.", "دو گزینه رو مقایسه کن و انتخاب کن.", "I prefer... / This is better because..."),
                SpeakingTask("Explain a decision you made recently.", "یه تصمیم اخیرت رو توضیح بده.", "I decided to... because...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a difficult choice you made.", "درباره یه انتخاب سخت بنویس.", 180, "Use comparatives and give reasons.")
            ),
            quiz = listOf(
                QuizQuestion("I prefer tea ___ coffee.", listOf("than", "to", "from", "over"), 1),
                QuizQuestion("This one is ___.", listOf("more better", "better", "best", "more good"), 1),
                QuizQuestion("I'd rather ___ home.", listOf("to stay", "staying", "stay", "stayed"), 2),
                QuizQuestion("What does 'on the fence' mean?", listOf("روی نرده", "دودل", "بالا", "پایین"), 1),
                QuizQuestion("What does 'weigh the pros and cons' mean?", listOf("سنجیدن مزایا و معایب", "وزن کردن", "خرید کردن", "فروختن"), 0),
                QuizQuestion("Choose the correct sentence.", listOf("I prefer A than B.", "I prefer A to B.", "I prefer A over B than.", "I prefer A more B."), 1),
                QuizQuestion("What does 'go with your gut' mean?", listOf("به شکم", "به حست اعتماد کن", "راه رفتن", "غذا خوردن"), 1),
                QuizQuestion("What's the opposite of 'advantage'?", listOf("benefit", "disadvantage", "positive", "gain"), 1)
            )
        )
    }

    // UNIT 3 — Around the World
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Around the World",
            titlePersian = "دور دنیا",
            objectives = listOf(
                "Talk about travel experiences",
                "Use the present perfect for experiences",
                "Discuss cultural differences",
                "Describe places you've visited"
            ),
            vocabulary = listOf(
                VocabWord("abroad", "خارج", "/əˈbrɔːd/", "adverb", "I've been abroad many times.", "من زیاد خارج بوده‌ام."),
                VocabWord("culture", "فرهنگ", "/ˈkʌltʃər/", "noun", "I love learning about cultures.", "عاشق یادگیری درباره فرهنگ‌هام."),
                VocabWord("custom", "رسم", "/ˈkʌstəm/", "noun", "Every country has customs.", "هر کشوری رسوم داره."),
                VocabWord("tradition", "سنت", "/trəˈdɪʃən/", "noun", "It's a beautiful tradition.", "یه سنت زیباست."),
                VocabWord("local", "محلی", "/ˈloʊkəl/", "adjective", "Try the local food.", "غذای محلی رو امتحان کن."),
                VocabWord("foreign", "خارجی", "/ˈfɔːrən/", "adjective", "I love foreign films.", "عاشق فیلم‌های خارجی‌ام."),
                VocabWord("language", "زبان", "/ˈlæŋɡwɪdʒ/", "noun", "How many languages do you speak?", "چند زبان صحبت می‌کنی؟"),
                VocabWord("experience", "تجربه", "/ɪkˈspɪriəns/", "noun", "It was an amazing experience.", "تجربه شگفت‌انگیزی بود."),
                VocabWord("memory", "خاطره", "/ˈmeməri/", "noun", "Great memories from the trip.", "خاطرات عالی از سفر."),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun", "The journey took two days.", "سفر دو روز طول کشید."),
                VocabWord("explore", "کاوش کردن", "/ɪkˈsplɔːr/", "verb", "Let's explore the old town.", "بیا شهر قدیمی رو کاوش کنیم.", "verb"),
                VocabWord("adventure", "ماجراجویی", "/ədˈventʃər/", "noun", "It was a great adventure.", "ماجراجویی بزرگی بود.")
            ),
            idioms = listOf(
                IdiomExpression("off the beaten path", "دور از مسیر معمول", "We went off the beaten path.", "از مسیر معمول دور شدیم.", "idiom"),
                IdiomExpression("when in Rome", "با مردم شهر هم‌رنگ شو", "When in Rome, do as the Romans do.", "با مردم شهر هم‌رنگ شو.", "idiom"),
                IdiomExpression("travel light", "کم بار سفر کن", "I always travel light.", "من همیشه کم بار سفر می‌کنم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Present perfect contractions", "I've, you've, we've."),
                PronunciationTip("Countries and nationalities", "Japan /dʒəˈpæn/، Japanese /ˌdʒæpəˈniːz/."),
                PronunciationTip("abroad", "abroad /əˈbrɔːd/ — استرس روی broad.")
            ),
            culturalNotes = listOf(
                CulturalNote("Cultural differences", "تفاوت‌های فرهنگی در سفر مهمند."),
                CulturalNote("Greetings around the world", "روش‌های سلام در فرهنگ‌ها متفاوته.")
            ),
            grammar = listOf(
                GrammarSection("Present perfect for experiences", "I've been to Japan. / Have you ever traveled abroad?"),
                GrammarSection("Ever / never", "Have you ever...? / I've never..."),
                GrammarSection("For and since", "I've lived here for 5 years. / since 2018."),
                GrammarSection("Past simple for details", "I went there in 2020.")
            ),
            commonMistakes = listOf(
                CommonMistake("I have been to Japan last year.", "I went to Japan last year.", "زمان مشخص = past simple."),
                CommonMistake("Have you ever go?", "Have you ever been?", "past participle."),
                CommonMistake("I've never went.", "I've never gone / been.", "past participle.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you ever traveled abroad?", "تا حالا خارج سفر کرده‌ای؟"),
                DialogueLine("B", "Yes, I have. I've been to several countries.", "بله. به چندین کشور رفته‌ام."),
                DialogueLine("A", "Which was your favorite?", "کدوم مورد علاقه‌ات بود؟"),
                DialogueLine("B", "Japan, I think. The culture is fascinating.", "ژاپن، فکر کنم. فرهنگش جذابه."),
                DialogueLine("A", "What did you like most about it?", "چی بیشتر دوست داشتی؟"),
                DialogueLine("B", "The temples and gardens. They're beautiful.", "معابد و باغ‌ها. زیبان."),
                DialogueLine("A", "Did you try the local food?", "غذای محلی امتحان کردی؟"),
                DialogueLine("B", "Yes! Sushi, ramen, everything. It was delicious.", "بله! سوشی، رامن، همه چیز. خوشمزه بود."),
                DialogueLine("A", "Were there any cultural differences you noticed?", "تفاوت فرهنگی‌ای دیدی؟"),
                DialogueLine("B", "Yes. People bow when they greet. It's a sign of respect.", "بله. مردم موقع سلام تعظیم می‌کنند. نشانه احترامه."),
                DialogueLine("A", "Have you ever made a cultural mistake?", "تا حالا اشتباه فرهنگی کرده‌ای؟"),
                DialogueLine("B", "Once. I forgot to take off my shoes in someone's home.", "یه بار. یادم رفت در خونه کسی کفشم رو دربیارم."),
                DialogueLine("A", "What happened?", "چی شد؟"),
                DialogueLine("B", "They were very polite about it, but I felt embarrassed.", "خیلی مؤدبانه برخورد کردن، ولی خجالت کشیدم."),
                DialogueLine("A", "Well, we learn from our mistakes.", "خب، از اشتباهاتمون یاد می‌گیریم."),
                DialogueLine("B", "Exactly. I always remember now.", "دقیقاً. حالا همیشه یادم می‌مونه."),
                DialogueLine("A", "Would you go back?", "دوباره می‌ری؟"),
                DialogueLine("B", "Definitely. I'd love to explore more of Asia.", "قطعاً. دوست دارم آسیا رو بیشتر کاوش کنم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B کجا سفر کرده؟", "چندین کشور، از جمله ژاپن."),
                ComprehensionQuestion("B چه چیزی در ژاپن دوست داشت؟", "معابد و باغ‌ها."),
                ComprehensionQuestion("B چه اشتباه فرهنگی کرد؟", "یادش رفت کفش‌هاش رو دربیاره."),
                ComprehensionQuestion("B دوست دارد کجا برود؟", "آسیا.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about a country you've visited.", "درباره کشوری که رفتی صحبت کن.", "I've been to... / The culture is..."),
                SpeakingTask("Discuss cultural differences.", "درباره تفاوت‌های فرهنگی صحبت کن.", "In my culture... / In other cultures...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable travel experience.", "درباره یه تجربه سفر به‌یادماندنی بنویس.", 180, "Use present perfect and past simple.")
            ),
            quiz = listOf(
                QuizQuestion("I've ___ to Japan twice.", listOf("go", "went", "been", "going"), 2),
                QuizQuestion("___ you ever been abroad?", listOf("Do", "Did", "Have", "Are"), 2),
                QuizQuestion("I've lived here ___ 5 years.", listOf("since", "for", "in", "at"), 1),
                QuizQuestion("What does 'travel light' mean?", listOf("کم بار سفر کن", "سفر در نور", "سفر سریع", "سفر طولانی"), 0),
                QuizQuestion("What does 'off the beaten path' mean?", listOf("دور از مسیر", "توی مسیر", "کنار جاده", "توی شهر"), 0),
                QuizQuestion("I went to Japan ___ 2020.", listOf("in", "on", "at", "since"), 0),
                QuizQuestion("What does 'when in Rome' mean?", listOf("در روم", "با مردم شهر هم‌رنگ شو", "سفر کن", "روم رو ببین"), 1),
                QuizQuestion("Have you ever ___ sushi?", listOf("eat", "ate", "eaten", "eating"), 2)
            )
        )
    }

    // UNIT 4 — Life Stories
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Life Stories",
            titlePersian = "داستان‌های زندگی",
            objectives = listOf(
                "Tell life stories",
                "Use narrative tenses",
                "Talk about important life events",
                "Discuss milestones"
            ),
            vocabulary = listOf(
                VocabWord("biography", "زندگی‌نامه", "/baɪˈɑːɡrəfi/", "noun", "I read her biography.", "زندگی‌نامه‌اش رو خوندم."),
                VocabWord("childhood", "کودکی", "/ˈtʃaɪldhʊd/", "noun", "Happy childhood.", "کودکی شاد."),
                VocabWord("achieve", "دست یافتن", "/əˈtʃiːv/", "verb", "She achieved her dream.", "به رویاش رسید.", "verb"),
                VocabWord("career", "حرفه", "/kəˈrɪr/", "noun", "Successful career.", "حرفه موفق."),
                VocabWord("milestone", "نقطه عطف", "/ˈmaɪlstoʊn/", "noun", "Graduation was a milestone.", "فارغ‌التحصیلی نقطه عطف بود."),
                VocabWord("inspire", "الهام بخشیدن", "/ɪnˈspaɪər/", "verb", "She inspires many people.", "به بسیاری الهام می‌بخشه.", "verb"),
                VocabWord("overcome", "غلبه کردن", "/ˌoʊvərˈkʌm/", "verb", "He overcame many challenges.", "بر چالش‌های زیادی غلبه کرد.", "verb"),
                VocabWord("inspiration", "الهام", "/ˌɪnspəˈreɪʃən/", "noun", "She's my inspiration.", "الهام‌بخش منه."),
                VocabWord("talent", "استعداد", "/ˈtælənt/", "noun", "Natural talent.", "استعداد طبیعی."),
                VocabWord("passion", "اشتیاق", "/ˈpæʃən/", "noun", "Passion for music.", "اشتیاق به موسیقی."),
                VocabWord("legacy", "میراث", "/ˈleɡəsi/", "noun", "Lasting legacy.", "میراث ماندگار."),
                VocabWord("pioneer", "پیشگام", "/ˌpaɪəˈnɪr/", "noun", "She was a pioneer.", "او پیشگام بود.")
            ),
            idioms = listOf(
                IdiomExpression("come a long way", "پیشرفت زیادی کردن", "She's come a long way.", "خیلی پیشرفت کرده.", "idiom"),
                IdiomExpression("from rags to riches", "از فقر به ثروت", "From rags to riches.", "از فقر به ثروت.", "idiom"),
                IdiomExpression("against all odds", "برخلاف همه شانس‌ها", "She succeeded against all odds.", "برخلاف همه شانس‌ها موفق شد.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Narrative rhythm", "افعال اصلی تأکید می‌گیرن."),
                PronunciationTip("Time expressions", "In 1990، at the age of..."),
                PronunciationTip("biography", "biography /baɪˈɑːɡrəfi/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Biographies", "زندگی‌نامه‌ها بخش مهمی از ادبیات غربند."),
                CulturalNote("Inspiring stories", "داستان‌های الهام‌بخش محبوبند.")
            ),
            grammar = listOf(
                GrammarSection("Narrative tenses", "Past simple, past continuous, past perfect"),
                GrammarSection("Time expressions", "In 1985, at the age of 20, after that, later, eventually"),
                GrammarSection("Connecting ideas", "She grew up in a small town. Later, she moved to the city."),
                GrammarSection("Describing achievements", "She became the first woman to... / He was awarded...")
            ),
            commonMistakes = listOf(
                CommonMistake("She born in 1980.", "She was born in 1980.", "passive لازم داره was."),
                CommonMistake("He has achieved a lot last year.", "He achieved a lot last year.", "زمان مشخص = past simple."),
                CommonMistake("She successed.", "She succeeded.", "spelling.")
            ),
            conversation = listOf(
                DialogueLine("A", "Who's your biggest inspiration?", "بزرگ‌ترین الهام‌بخش تو کیه؟"),
                DialogueLine("B", "Malala Yousafzai. Her story is incredible.", "ملالا یوسفزی. داستانش باورنکردنیه."),
                DialogueLine("A", "What do you admire about her?", "چی در موردش تحسین می‌کنی؟"),
                DialogueLine("B", "She stood up for education against all odds.", "برخلاف همه شانس‌ها برای آموزش ایستاد."),
                DialogueLine("A", "Was she always an activist?", "همیشه فعال بود؟"),
                DialogueLine("B", "No, she started as a young blogger.", "نه، به عنوان یه وبلاگ‌نویس جوان شروع کرد."),
                DialogueLine("A", "When did she become famous?", "کِی معروف شد؟"),
                DialogueLine("B", "In 2012, after she was attacked.", "در ۲۰۱۲، بعد از حمله به او."),
                DialogueLine("A", "That must have been terrifying.", "این باید ترسناک بوده."),
                DialogueLine("B", "It was. But she didn't give up.", "بود. ولی تسلیم نشد."),
                DialogueLine("A", "What has she achieved since then?", "از اون موقع چی به دست آورده؟"),
                DialogueLine("B", "She won the Nobel Peace Prize in 2014.", "جایزه نوبل صلح رو در ۲۰۱۴ برد."),
                DialogueLine("A", "That's amazing for someone so young.", "برای یه نفر اینقدر جوان فوق‌العاده‌ست."),
                DialogueLine("B", "Yes, she's inspired millions.", "بله، به میلیون‌ها نفر الهام بخشیده."),
                DialogueLine("A", "What can we learn from her?", "چی می‌تونیم ازش یاد بگیریم؟"),
                DialogueLine("B", "That one person can make a difference.", "که یه نفر می‌تونه تفاوت ایجاد کنه."),
                DialogueLine("A", "That's powerful.", "این قدرتمنده."),
                DialogueLine("B", "It is. She's a true pioneer.", "هست. اون واقعاً یه پیشگامه."),
                DialogueLine("A", "Thanks for sharing her story.", "ممنون که داستانش رو گفتی."),
                DialogueLine("B", "Anytime.", "هر وقت.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("الهام‌بخش B کیه؟", "ملالا یوسفزی."),
                ComprehensionQuestion("ملالا برای چی ایستاد؟", "آموزش."),
                ComprehensionQuestion("ملالا کِی نوبل گرفت؟", "۲۰۱۴."),
                ComprehensionQuestion("چه درسی از ملالا می‌گیریم؟", "یه نفر می‌تونه تفاوت ایجاد کنه.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about someone who inspires you.", "درباره کسی که بهت الهام می‌بخشه صحبت کن.", "I admire... / She inspires me because..."),
                SpeakingTask("Tell a short biography.", "زندگی‌نامه کوتاهی تعریف کن.", "She was born in... / She achieved...")
            ),
            writingTasks = listOf(
                WritingTask("Write a short biography.", "زندگی‌نامه کوتاهی بنویس.", 200, "Use narrative tenses.")
            ),
            quiz = listOf(
                QuizQuestion("She ___ born in 1980.", listOf("is", "was", "has", "did"), 1),
                QuizQuestion("He ___ a lot last year.", listOf("has achieved", "achieved", "achieves", "achieving"), 1),
                QuizQuestion("She had ___ abroad.", listOf("study", "studied", "studying", "studies"), 1),
                QuizQuestion("What does 'come a long way' mean?", listOf("راه طولانی", "پیشرفت زیادی", "دور رفتن", "بازگشت"), 1),
                QuizQuestion("What does 'against all odds' mean?", listOf("برخلاف همه شانس‌ها", "با شانس", "بی‌شانس", "خوش‌شانس"), 0),
                QuizQuestion("She was ___ as a teacher.", listOf("work", "worked", "working", "works"), 2),
                QuizQuestion("What does 'from rags to riches' mean?", listOf("از فقر به ثروت", "فقیر", "ثروتمند", "متوسط"), 0),
                QuizQuestion("She ___ a pioneer.", listOf("is", "are", "have", "has"), 0)
            )
        )
    }

    // UNIT 5 — Getting Things Done
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Getting Things Done",
            titlePersian = "انجام کارها",
            objectives = listOf(
                "Use the causative",
                "Talk about services",
                "Discuss errands",
                "Talk about time management"
            ),
            vocabulary = listOf(
                VocabWord("errand", "کار روزمره", "/ˈerənd/", "noun", "I have errands to run.", "کارهای روزمره دارم."),
                VocabWord("service", "خدمات", "/ˈsɜːrvɪs/", "noun", "Good service.", "خدمات خوب."),
                VocabWord("repair", "تعمیر کردن", "/rɪˈper/", "verb", "Get it repaired.", "تعمیرش کن.", "verb"),
                VocabWord("dry-clean", "خشکشویی", "/ˌdraɪ ˈkliːn/", "verb", "I need to dry-clean this.", "باید این رو خشکشویی کنم.", "verb"),
                VocabWord("deliver", "تحویل دادن", "/dɪˈlɪvər/", "verb", "They deliver food.", "غذا تحویل می‌دن.", "verb"),
                VocabWord("schedule", "برنامه", "/ˈskedʒuːl/", "noun", "Tight schedule.", "برنامه فشرده."),
                VocabWord("deadline", "ضرب‌الاجل", "/ˈdedlaɪn/", "noun", "Meet the deadline.", "به ضرب‌الاجل برس."),
                VocabWord("procrastinate", "به تعویق انداختن", "/proʊˈkræstɪneɪt/", "verb", "Stop procrastinating.", "دست از به تعویق انداختن بردار.", "verb"),
                VocabWord("organized", "سازمان‌یافته", "/ˈɔːrɡənaɪzd/", "adjective", "Very organized.", "خیلی سازمان‌یافته."),
                VocabWord("efficient", "کارآمد", "/ɪˈfɪʃənt/", "adjective", "Efficient worker.", "کارگر کارآمد."),
                VocabWord("priority", "اولویت", "/praɪˈɔːrəti/", "noun", "Top priority.", "اولویت اصلی."),
                VocabWord("accomplish", "انجام دادن", "/əˈkɑːmplɪʃ/", "verb", "Accomplish tasks.", "کارها رو انجام بده.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("get something done", "کاری را انجام دادن", "Get it done today.", "امروز انجامش بده.", "neutral"),
                IdiomExpression("a lifesaver", "نجات‌دهنده", "You're a lifesaver.", "تو نجات‌دهنده‌ای.", "informal"),
                IdiomExpression("in the same boat", "در شرایط مشابه", "We're in the same boat.", "ما در شرایط مشابهی هستیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Causative", "have/get + object + past participle."),
                PronunciationTip("dry-clean", "dry-clean /ˌdraɪ ˈkliːn/."),
                PronunciationTip("procrastinate", "procrastinate /proʊˈkræstɪneɪt/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Services", "در غرب، خدمات مختلفی برای انجام کارها هست."),
                CulturalNote("Time management", "مدیریت زمان در غرب مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Causative", "have/get + object + past participle. I had my car repaired."),
                GrammarSection("Causative with get", "get + object + to + verb. I got him to help."),
                GrammarSection("Causative with have", "have + object + base verb. I had the plumber fix it."),
                GrammarSection("Passive causative", "have/get + object + pp. We had our picture taken.")
            ),
            commonMistakes = listOf(
                CommonMistake("I'll get the waiter correct it.", "I'll get the waiter to correct it.", "get + object + to + verb."),
                CommonMistake("She had the plumber to fix it.", "She had the plumber fix it.", "have + object + base verb."),
                CommonMistake("We had our picture took.", "We had our picture taken.", "past participle.")
            ),
            conversation = listOf(
                DialogueLine("A", "You look stressed. What's going on?", "استرس داری. چه خبره؟"),
                DialogueLine("B", "I have so much to do before the trip.", "قبل از سفر کارهای زیادی دارم."),
                DialogueLine("A", "Like what?", "مثل چی؟"),
                DialogueLine("B", "I need to get my suit dry-cleaned and have my car checked.", "باید کت و شلوارم رو خشکشویی کنم و ماشینم رو بررسی کنم."),
                DialogueLine("A", "That's a lot. Have you done any of it?", "زیاد است. کدامش رو انجام دادی؟"),
                DialogueLine("B", "Honestly, no. I've been procrastinating.", "صادقانه، نه. به تعویق انداخته‌ام."),
                DialogueLine("A", "Why? You're usually so organized.", "چرا؟ تو معمولاً سازمان‌یافته‌ای."),
                DialogueLine("B", "I've been busy with other things.", "با چیزهای دیگر مشغول بوده‌ام."),
                DialogueLine("A", "Let's tackle it together. What's most urgent?", "بیا با هم انجامش دهیم. کدام فوری‌تره؟"),
                DialogueLine("B", "The suit. I need it by Thursday.", "کت و شلوار. تا پنجشنبه لازمش دارم."),
                DialogueLine("A", "There's a dry cleaner on Main Street. You can get it done in a day.", "خشکشویی در خیابان مین هست. یک روزه انجام می‌دن."),
                DialogueLine("B", "That's good to know.", "خوبه که می‌دونم."),
                DialogueLine("A", "I'll find out about the car too.", "درباره ماشین هم می‌پرسم."),
                DialogueLine("B", "Thanks. You're a lifesaver!", "ممنون. تو نجات‌دهنده‌ای!"),
                DialogueLine("A", "That's what friends are for.", "دوست برای همین است."),
                DialogueLine("B", "I owe you one.", "بدهکارت هستم."),
                DialogueLine("A", "Buy me coffee later. Now get to work!", "بعداً قهوه بخر. حالا برو سر کار!"),
                DialogueLine("B", "Deal.", "قبول.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه کاری باید انجام بده؟", "کت و شلوار خشکشویی، ماشین بررسی."),
                ComprehensionQuestion("چرا B به تعویق انداخته؟", "مشغول بوده."),
                ComprehensionQuestion("فوری‌ترین کار چیه؟", "کت و شلوار."),
                ComprehensionQuestion("خشکشویی کجاست؟", "خیابان مین.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your to-do list.", "درباره لیست کارهات صحبت کن.", "I need to get... / I have to have..."),
                SpeakingTask("Role-play getting a service done.", "نقش‌بازی: خدمات گرفتن.", "I'd like to have... / Can you get...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about getting things done.", "درباره انجام کارها بنویس.", 180, "Use causative structures.")
            ),
            quiz = listOf(
                QuizQuestion("I'll get the waiter ___ the check.", listOf("correct", "to correct", "correcting", "corrected"), 1),
                QuizQuestion("She had the plumber ___ the sink.", listOf("fix", "to fix", "fixing", "fixed"), 0),
                QuizQuestion("We had our picture ___.", listOf("take", "to take", "taking", "taken"), 3),
                QuizQuestion("What does 'lifesaver' mean?", listOf("نجات‌دهنده", "دکتر", "معلم", "راننده"), 0),
                QuizQuestion("They plan to have the offices ___.", listOf("paint", "to paint", "painting", "painted"), 3),
                QuizQuestion("What does 'in the same boat' mean?", listOf("در قایق", "در شرایط مشابه", "در دریا", "شنا کردن"), 1),
                QuizQuestion("I need to get my suit ___.", listOf("dry-clean", "dry-cleaned", "dry-cleaning", "to dry-clean"), 1),
                QuizQuestion("What does 'procrastinate' mean?", listOf("به تعویق انداختن", "انجام دادن", "خرید کردن", "خوابیدن"), 0)
            )
        )
    }

    // UNIT 6 — Music to My Ears
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Music to My Ears",
            titlePersian = "موسیقی برای گوش‌های من",
            objectives = listOf(
                "Talk about music and preferences",
                "Use relative clauses",
                "Discuss concerts and performances",
                "Express opinions about music"
            ),
            vocabulary = listOf(
                VocabWord("music", "موسیقی", "/ˈmjuːzɪk/", "noun", "I love music.", "عاشق موسیقی‌ام."),
                VocabWord("genre", "ژانر", "/ˈʒɑːnrə/", "noun", "What genre do you like?", "چه ژانری دوست داری؟"),
                VocabWord("concert", "کنسرت", "/ˈkɑːnsərt/", "noun", "Going to a concert.", "رفتن به کنسرت."),
                VocabWord("performance", "اجرا", "/pərˈfɔːrməns/", "noun", "Great performance.", "اجرای عالی."),
                VocabWord("audience", "مخاطب", "/ˈɔːdiəns/", "noun", "Large audience.", "مخاطب زیاد."),
                VocabWord("instrument", "ساز", "/ˈɪnstrəmənt/", "noun", "Play an instrument.", "سازی بزن."),
                VocabWord("talent", "استعداد", "/ˈtælənt/", "noun", "Musical talent.", "استعداد موسیقی."),
                VocabWord("rhythm", "ریتم", "/ˈrɪðəm/", "noun", "Great rhythm.", "ریتم عالی."),
                VocabWord("melody", "ملودی", "/ˈmelədi/", "noun", "Beautiful melody.", "ملودی زیبا."),
                VocabWord("lyrics", "متن آهنگ", "/ˈlɪrɪks/", "noun", "Meaningful lyrics.", "متن آهنگ پرمعنا."),
                VocabWord("band", "گروه موسیقی", "/bænd/", "noun", "Rock band.", "گروه راک."),
                VocabWord("perform", "اجرا کردن", "/pərˈfɔːrm/", "verb", "Perform live.", "زنده اجرا کن.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("music to my ears", "موسیقی برای گوش‌هام (خبر خوب)", "That's music to my ears.", "این خبر خوبیه.", "idiom"),
                IdiomExpression("face the music", "با عواقب روبرو شدن", "It's time to face the music.", "وقتشه با عواقب روبرو شیم.", "idiom"),
                IdiomExpression("play it by ear", "بی‌برنامه پیش رفتن", "Let's play it by ear.", "بی‌برنامه پیش بریم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("genre", "genre /ˈʒɑːnrə/ — از فرانسه."),
                PronunciationTip("Relative clauses", "The song that I like..."),
                PronunciationTip("rhythm", "rhythm /ˈrɪðəm/ — بدون صدای th واضح.")
            ),
            culturalNotes = listOf(
                CulturalNote("Music genres", "ژانرهای موسیقی در غرب متنوعند."),
                CulturalNote("Concerts", "کنسرت‌ها در غرب رایجند.")
            ),
            grammar = listOf(
                GrammarSection("Relative clauses", "The song that I like... / The singer who... / The band whose music..."),
                GrammarSection("Defining vs non-defining", "The song that I love is new. / My favorite song, which is new, is great."),
                GrammarSection("Opinions about music", "I think... / In my opinion... / To me..."),
                GrammarSection("Comparisons", "better than, more interesting than")
            ),
            commonMistakes = listOf(
                CommonMistake("The singer which I like.", "The singer who I like.", "برای افراد who."),
                CommonMistake("The song who I like.", "The song that/which I like.", "برای اشیا that/which."),
                CommonMistake("I very like music.", "I really like music.", "really نه very.")
            ),
            conversation = listOf(
                DialogueLine("A", "What kind of music do you like?", "چه نوع موسیقی دوست داری؟"),
                DialogueLine("B", "I love jazz. It's so relaxing.", "عاشق جازم. خیلی آرامش‌بخشه."),
                DialogueLine("A", "Really? I prefer rock music.", "واقعاً؟ من راک رو ترجیح می‌دم."),
                DialogueLine("B", "Who's your favorite band?", "گروه مورد علاقه‌ات کیه؟"),
                DialogueLine("A", "I really like Coldplay. Their lyrics are meaningful.", "خیلی Coldplay رو دوست دارم. متن آهنگاشون پرمعناست."),
                DialogueLine("B", "I've heard of them. They're popular.", "شنیده‌ام ازشون. معروفند."),
                DialogueLine("A", "Have you ever been to a concert?", "تا حالا کنسرت رفتی؟"),
                DialogueLine("B", "Yes, I have. I went to a jazz concert last month.", "بله. ماه پیش به یه کنسرت جاز رفتم."),
                DialogueLine("A", "How was it?", "چطور بود؟"),
                DialogueLine("B", "Amazing. The performance was incredible.", "فوق‌العاده. اجرا باورنکردنی بود."),
                DialogueLine("A", "Did you enjoy the audience?", "از مخاطب لذت بردی؟"),
                DialogueLine("B", "Yes, everyone was so into the music.", "بله، همه غرق موسیقی بودند."),
                DialogueLine("A", "That sounds like music to my ears.", "این خبر خوبیه."),
                DialogueLine("B", "You should come next time.", "دفعه بعد باید بیای."),
                DialogueLine("A", "I'd love to. Let me know when.", "خیلی دوست دارم. خبرم کن کی."),
                DialogueLine("B", "There's a concert next weekend. Want to come?", "آخر هفته بعد یه کنسرت هست. می‌خوای بیای؟"),
                DialogueLine("A", "Sure! Let's go together.", "حتماً! با هم بریم."),
                DialogueLine("B", "Great. I'll text you the details.", "عالی. جزئیات رو پیام می‌کنم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه نوع موسیقی دوست دارد؟", "جاز."),
                ComprehensionQuestion("A چه گروهی را دوست دارد؟", "Coldplay."),
                ComprehensionQuestion("B کِی کنسرت رفته؟", "ماه پیش."),
                ComprehensionQuestion("قرار بعدی چیست؟", "کنسرت آخر هفته بعد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your favorite music.", "درباره موسیقی مورد علاقه‌ات صحبت کن.", "I like... / My favorite..."),
                SpeakingTask("Describe a concert you've been to.", "یه کنسرت که رفتی رو توصیف کن.", "The performance was...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite singer or band.", "درباره خواننده یا گروه مورد علاقه‌ات بنویس.", 180, "Use relative clauses.")
            ),
            quiz = listOf(
                QuizQuestion("The singer ___ I like.", listOf("which", "who", "whose", "where"), 1),
                QuizQuestion("The song ___ I love.", listOf("who", "which", "whose", "where"), 1),
                QuizQuestion("What does 'music to my ears' mean?", listOf("موسیقی", "خبر خوب", "گوش", "صدای بلند"), 1),
                QuizQuestion("I really ___ music.", listOf("very like", "like", "likes", "liking"), 1),
                QuizQuestion("Have you ever ___ to a concert?", listOf("go", "went", "been", "going"), 2),
                QuizQuestion("What does 'face the music' mean?", listOf("با موسیقی روبرو شدن", "با عواقب روبرو شدن", "گوش دادن", "خواندن"), 1),
                QuizQuestion("What does 'genre' mean?", listOf("ژانر", "ساز", "خواننده", "آهنگ"), 0),
                QuizQuestion("The band ___ music I like is new.", listOf("who", "which", "whose", "where"), 2)
            )
        )
    }

    // ادامه فصل‌های 7-12 در بخش ۲...
    // TODO: Unit 7-12 در پیام بعدی تکمیل می‌شوند
}