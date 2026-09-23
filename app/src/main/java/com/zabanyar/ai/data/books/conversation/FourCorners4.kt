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
}// UNIT 7 — In the News
private fun chapter7(): LessonContent {
    return LessonContent(
        bookId = BOOK_ID,
        chapterNumber = 7,
        title = "In the News",
        titlePersian = "در اخبار",
        objectives = listOf(
            "Talk about news and media",
            "Use the passive voice",
            "Discuss current events",
            "Express opinions about news sources"
        ),
        vocabulary = listOf(
            VocabWord("news", "اخبار", "/nuːz/", "noun", "I watch the news every day.", "هر روز اخبار می‌بینم."),
            VocabWord("headline", "تیتر", "/ˈhedlaɪn/", "noun", "Did you see the headline?", "تیتر رو دیدی؟"),
            VocabWord("article", "مقاله", "/ˈɑːrtɪkəl/", "noun", "I read an interesting article.", "یه مقاله جالب خوندم."),
            VocabWord("journalist", "روزنامه‌نگار", "/ˈdʒɜːrnəlɪst/", "noun", "She's a journalist.", "او روزنامه‌نگاره."),
            VocabWord("report", "گزارش", "/rɪˈpɔːrt/", "noun", "A news report.", "یه گزارش خبری."),
            VocabWord("source", "منبع", "/sɔːrs/", "noun", "Reliable source.", "منبع قابل اعتماد."),
            VocabWord("media", "رسانه", "/ˈmiːdiə/", "noun", "The media plays a big role.", "رسانه نقش بزرگی داره."),
            VocabWord("broadcast", "پخش کردن", "/ˈbrɔːdkæst/", "verb", "The show is broadcast live.", "برنامه زنده پخش می‌شه.", "verb"),
            VocabWord("publish", "منتشر کردن", "/ˈpʌblɪʃ/", "verb", "The book was published last year.", "کتاب سال گذشته منتشر شد.", "verb"),
            VocabWord("evidence", "شواهد", "/ˈevɪdəns/", "noun", "There's no evidence.", "شواهدی نیست."),
            VocabWord("current", "جاری", "/ˈkɜːrənt/", "adjective", "Current events.", "رویدادهای جاری."),
            VocabWord("reliable", "قابل اعتماد", "/rɪˈlaɪəbəl/", "adjective", "Is that source reliable?", "این منبع قابل اعتماده؟")
        ),
        idioms = listOf(
            IdiomExpression("breaking news", "خبر فوری", "Breaking news: the election results are in.", "خبر فوری: نتایج انتخابات اومد.", "neutral"),
            IdiomExpression("get the scoop", "خبر دست اول گرفتن", "The reporter got the scoop.", "خبرنگار خبر دست اول گرفت.", "informal"),
            IdiomExpression("fake news", "خبر جعلی", "Don't believe fake news.", "خبر جعلی رو باور نکن.", "informal")
        ),
        pronunciationTips = listOf(
            PronunciationTip("Passive voice", "The story was reported by... — stress the main verb."),
            PronunciationTip("news", "news /nuːz/ — s صدای /z/ می‌ده."),
            PronunciationTip("journalist", "journalist /ˈdʒɜːrnəlɪst/ — استرس روی jour.")
        ),
        culturalNotes = listOf(
            CulturalNote("News sources", "در غرب، مردم از منابع مختلف خبر می‌گیرند و به اعتبار منبع توجه می‌کنند."),
            CulturalNote("Media literacy", "تشخیص خبر واقعی از جعلی مهارت مهمیه.")
        ),
        grammar = listOf(
            GrammarSection("Passive voice — present", "The news is reported every day. / English is spoken here."),
            GrammarSection("Passive voice — past", "The article was published yesterday. / The building was built in 1990."),
            GrammarSection("Passive with by", "The book was written by a famous author."),
            GrammarSection("Active vs passive", "Active: A journalist wrote the story. / Passive: The story was written by a journalist.")
        ),
        commonMistakes = listOf(
            CommonMistake("The article was wrote yesterday.", "The article was written yesterday.", "past participle درست: written."),
            CommonMistake("The news are important.", "The news is important.", "news غیرقابل شمارشه."),
            CommonMistake("I read a news.", "I read a news article / some news.", "news قابل شمارش نیست.")
        ),
        conversation = listOf(
            DialogueLine("A", "Did you see the news today?", "امروز اخبار رو دیدی؟"),
            DialogueLine("B", "No, what happened?", "نه، چی شد؟"),
            DialogueLine("A", "A new study was published about climate change.", "یه مطالعه جدید درباره تغییر اقلیم منتشر شد."),
            DialogueLine("B", "Really? Who wrote it?", "واقعاً؟ کی نوشتش؟"),
            DialogueLine("A", "It was written by scientists at a top university.", "توسط دانشمندان یه دانشگاه برتر نوشته شد."),
            DialogueLine("B", "Was it reported in the news?", "در اخبار گزارش شد؟"),
            DialogueLine("A", "Yes. It was broadcast on every major channel.", "بله. در همه کانال‌های اصلی پخش شد."),
            DialogueLine("B", "What did the study say?", "مطالعه چی گفت؟"),
            DialogueLine("A", "It said that temperatures are rising faster than expected.", "گفت دما سریع‌تر از انتظار بالا می‌ره."),
            DialogueLine("B", "That's concerning. Is the source reliable?", "نگران‌کننده‌ست. منبع قابل اعتماده؟"),
            DialogueLine("A", "Yes, it was published in a well-known journal.", "بله، در یه ژورنال شناخته‌شده منتشر شد."),
            DialogueLine("B", "Good. There's so much fake news these days.", "خوبه. این روزها خبر جعلی زیاده."),
            DialogueLine("A", "I know. We have to check the source.", "می‌دونم. باید منبع رو چک کنیم."),
            DialogueLine("B", "Exactly. Where do you usually get your news?", "دقیقاً. معمولاً از کجا خبر می‌گیری؟"),
            DialogueLine("A", "From a few reliable websites and apps.", "از چند وب‌سایت و اپ قابل اعتماد."),
            DialogueLine("B", "Same here. I avoid social media for news.", "منم همین‌طور. برای خبر از شبکه‌های اجتماعی دوری می‌کنم."),
            DialogueLine("A", "Smart. That's the best approach.", "هوشمندانه. بهترین رویکرد همینه.")
        ),
        comprehensionQuestions = listOf(
            ComprehensionQuestion("خبر امروز درباره چی بود؟", "تغییر اقلیم."),
            ComprehensionQuestion("کی مطالعه رو نوشت؟", "دانشمندان یه دانشگاه برتر."),
            ComprehensionQuestion("مطالعه چی گفت؟", "دما سریع‌تر از انتظار بالا می‌ره."),
            ComprehensionQuestion("B از کجا خبر می‌گیره؟", "از شبکه‌های اجتماعی دوری می‌کنه.")
        ),
        speakingTasks = listOf(
            SpeakingTask("Discuss a recent news story.", "درباره یه خبر اخیر صحبت کن.", "It was reported... / It was published..."),
            SpeakingTask("Talk about reliable sources of news.", "درباره منابع قابل اعتماد خبر صحبت کن.", "I get my news from... / It's reliable because...")
        ),
        writingTasks = listOf(
            WritingTask("Write a short news report about something that happened recently.", "یه گزارش خبری کوتاه درباره یه اتفاق اخیر بنویس.", 200, "Use passive voice.")
        ),
        quiz = listOf(
            QuizQuestion("The article ___ yesterday.", listOf("published", "was published", "publishes", "is publishing"), 1),
            QuizQuestion("The book was written ___ a famous author.", listOf("for", "by", "from", "with"), 1),
            QuizQuestion("What does 'fake news' mean?", listOf("خبر واقعی", "خبر جعلی", "خبر فوری", "خبر قدیمی"), 1),
            QuizQuestion("The news ___ important today.", listOf("are", "is", "were", "be"), 1),
            QuizQuestion("English ___ all over the world.", listOf("speaks", "is spoken", "spoke", "speaking"), 1),
            QuizQuestion("What does 'get the scoop' mean?", listOf("خبر دست اول", "بستنی", "خبر جعلی", "اخبار"), 0),
            QuizQuestion("The show ___ live every night.", listOf("broadcasts", "is broadcast", "broadcasted", "broadcasting"), 1),
            QuizQuestion("A person who writes for newspapers is a ___.", listOf("journalist", "scientist", "professor", "lawyer"), 0)
        )
    )
}

// UNIT 8 — City Life
private fun chapter8(): LessonContent {
    return LessonContent(
        bookId = BOOK_ID,
        chapterNumber = 8,
        title = "City Life",
        titlePersian = "زندگی شهری",
        objectives = listOf(
            "Describe cities and neighborhoods",
            "Use the second conditional",
            "Discuss urban problems",
            "Talk about changes in a city"
        ),
        vocabulary = listOf(
            VocabWord("urban", "شهری", "/ˈɜːrbən/", "adjective", "Urban life is busy.", "زندگی شهری شلوغه."),
            VocabWord("suburb", "حومه شهر", "/ˈsʌbɜːrb/", "noun", "They live in the suburbs.", "در حومه شهر زندگی می‌کنند."),
            VocabWord("downtown", "مرکز شهر", "/ˌdaʊnˈtaʊn/", "noun", "Downtown is crowded.", "مرکز شهر شلوغه."),
            VocabWord("crowded", "شلوغ", "/ˈkraʊdɪd/", "adjective", "The streets are crowded.", "خیابان‌ها شلوغند."),
            VocabWord("traffic", "ترافیک", "/ˈtræfɪk/", "noun", "Heavy traffic today.", "امروز ترافیک سنگینه."),
            VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun", "Air pollution is a problem.", "آلودگی هوا یه مشکله."),
            VocabWord("convenient", "راحت", "/kənˈviːniənt/", "adjective", "Very convenient location.", "موقعیت خیلی راحت."),
            VocabWord("facility", "امکانات", "/fəˈsɪləti/", "noun", "Good sports facilities.", "امکانات ورزشی خوب."),
            VocabWord("transportation", "حمل و نقل", "/ˌtrænspɔːrˈteɪʃən/", "noun", "Public transportation is cheap.", "حمل و نقل عمومی ارزونه."),
            VocabWord("neighborhood", "محله", "/ˈneɪbərhʊd/", "noun", "Quiet neighborhood.", "محله ساکت."),
            VocabWord("resident", "ساکن", "/ˈrezɪdənt/", "noun", "City residents.", "ساکنان شهر."),
            VocabWord("improve", "بهبود دادن", "/ɪmˈpruːv/", "verb", "Improve the roads.", "جاده‌ها رو بهبود بده.", "verb")
        ),
        idioms = listOf(
            IdiomExpression("the hustle and bustle", "شلوغی و هیاهو", "I love the hustle and bustle of the city.", "شلوغی و هیاهوی شهر رو دوست دارم.", "idiom"),
            IdiomExpression("a stone's throw away", "خیلی نزدیک", "The station is a stone's throw away.", "ایستگاه خیلی نزدیکه.", "idiom"),
            IdiomExpression("city that never sleeps", "شهری که هرگز نمی‌خوابه", "New York is the city that never sleeps.", "نیویورک شهری‌ست که هرگز نمی‌خوابه.", "idiom")
        ),
        pronunciationTips = listOf(
            PronunciationTip("Second conditional", "If I lived there, I would... — stress the main clause."),
            PronunciationTip("suburb", "suburb /ˈsʌbɜːrb/ — استرس روی sub."),
            PronunciationTip("pollution", "pollution /pəˈluːʃən/.")
        ),
        culturalNotes = listOf(
            CulturalNote("Urban vs suburban", "زندگی شهری و حومه تفاوت‌های زیادی داره."),
            CulturalNote("Public transportation", "در شهرهای بزرگ دنیا حمل و نقل عمومی نقش مهمی داره.")
        ),
        grammar = listOf(
            GrammarSection("Second conditional", "If + past simple, would + base verb. If I lived in a big city, I would use public transportation."),
            GrammarSection("Would / wouldn't", "I would move. / I wouldn't live downtown."),
            GrammarSection("Used to for past states", "I used to live in the suburbs."),
            GrammarSection("Describing change", "The city has become more crowded.")
        ),
        commonMistakes = listOf(
            CommonMistake("If I would live there...", "If I lived there...", "بعد از if از would استفاده نمی‌شه."),
            CommonMistake("If I live there, I would...", "If I lived there, I would...", "در second conditional هر دو قسمت باید هماهنگ باشند."),
            CommonMistake("The city is more crowded than before.", "OK — but note: 'The city has become more crowded.' sounds more natural for change.", "برای تغییر از become/has become استفاده کن.")
        ),
        conversation = listOf(
            DialogueLine("A", "Do you like living in the city?", "زندگی در شهر رو دوست داری؟"),
            DialogueLine("B", "I do, but it has its problems.", "دوست دارم، ولی مشکلات خودش رو داره."),
            DialogueLine("A", "Like what?", "مثل چی؟"),
            DialogueLine("B", "Traffic, pollution, and noise.", "ترافیک، آلودگی و سر و صدا."),
            DialogueLine("A", "I know what you mean. Would you ever move to the suburbs?", "می‌فهمم چی می‌گی. هیچ‌وقت به حومه نقل مکان می‌کنی؟"),
            DialogueLine("B", "Maybe. If I had children, I would probably move.", "شاید. اگه بچه داشتم، احتمالاً نقل مکان می‌کردم."),
            DialogueLine("A", "That makes sense. The suburbs are quieter.", "منطقیه. حومه ساکت‌تره."),
            DialogueLine("B", "True, but there's less to do.", "درسته، ولی کارهای کمتری برای انجام دادن هست."),
            DialogueLine("A", "What do you like most about the city?", "چی بیشتر در شهر دوست داری؟"),
            DialogueLine("B", "The energy. There's always something happening.", "انرژی‌اش. همیشه یه چیزی در جریانه."),
            DialogueLine("A", "I agree. I love the hustle and bustle.", "موافقم. شلوغی و هیاهو رو دوست دارم."),
            DialogueLine("B", "Have you noticed how much the city has changed?", "متوجه شدی چقدر شهر تغییر کرده؟"),
            DialogueLine("A", "Yes. It's become more crowded.", "بله. شلوغ‌تر شده."),
            DialogueLine("B", "And more expensive too.", "و گران‌تر هم."),
            DialogueLine("A", "Unfortunately. But the facilities are better.", "متأسفانه. ولی امکانات بهترند."),
            DialogueLine("B", "That's true. Better transportation too.", "درسته. حمل و نقل هم بهتر."),
            DialogueLine("A", "Exactly. Cities keep improving.", "دقیقاً. شهرها مدام بهتر می‌شن.")
        ),
        comprehensionQuestions = listOf(
            ComprehensionQuestion("B چه مشکلاتی در شهر می‌بیند؟", "ترافیک، آلودگی و سر و صدا."),
            ComprehensionQuestion("B در چه شرایطی به حومه می‌رود؟", "اگه بچه داشته باشه."),
            ComprehensionQuestion("B چی در شهر دوست داره؟", "انرژی‌اش."),
            ComprehensionQuestion("شهر چطور تغییر کرده؟", "شلوغ‌تر و گران‌تر شده.")
        ),
        speakingTasks = listOf(
            SpeakingTask("Talk about your city or neighborhood.", "درباره شهر یا محله‌ات صحبت کن.", "The city is... / It has..."),
            SpeakingTask("Discuss the pros and cons of city life.", "مزایا و معایب زندگی شهری رو بحث کن.", "If I lived... / I would...")
        ),
        writingTasks = listOf(
            WritingTask("Write about how your city has changed.", "درباره تغییرات شهرت بنویس.", 200, "Use second conditional and present perfect.")
        ),
        quiz = listOf(
            QuizQuestion("If I ___ in a big city, I would use public transportation.", listOf("live", "lived", "would live", "living"), 1),
            QuizQuestion("If I had children, I ___ move to the suburbs.", listOf("will", "would", "am", "do"), 1),
            QuizQuestion("The city has become more ___.", listOf("crowd", "crowded", "crowding", "crowds"), 1),
            QuizQuestion("What does 'the hustle and bustle' mean?", listOf("آرامش", "شلوغی و هیاهو", "سکوت", "تنهایی"), 1),
            QuizQuestion("I ___ live in the suburbs.", listOf("used to", "use to", "using to", "am used to"), 0),
            QuizQuestion("What does 'a stone's throw away' mean?", listOf("دور", "نزدیک", "سنگ", "پرتاب"), 1),
            QuizQuestion("___ transportation in the city is cheap.", listOf("Public", "Private", "Personal", "Own"), 0),
            QuizQuestion("What does 'city that never sleeps' mean?", listOf("شهر آرام", "شهر همیشه بیدار", "شهر خواب", "شهر کوچک"), 1)
        )
    )
}

// UNIT 9 — The Natural World
private fun chapter9(): LessonContent {
    return LessonContent(
        bookId = BOOK_ID,
        chapterNumber = 9,
        title = "The Natural World",
        titlePersian = "دنیای طبیعی",
        objectives = listOf(
            "Talk about nature and the environment",
            "Use the first conditional",
            "Discuss environmental issues",
            "Express hopes and predictions"
        ),
        vocabulary = listOf(
            VocabWord("environment", "محیط زیست", "/ɪnˈvaɪrənmənt/", "noun", "Protect the environment.", "از محیط زیست محافظت کن."),
            VocabWord("climate", "اقلیم", "/ˈklaɪmət/", "noun", "Climate change.", "تغییر اقلیم."),
            VocabWord("recycle", "بازیافت کردن", "/ˌriːˈsaɪkəl/", "verb", "We recycle paper.", "کاغذ رو بازیافت می‌کنیم.", "verb"),
            VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun", "Reduce pollution.", "آلودگی رو کم کن."),
            VocabWord("wildlife", "حیات وحش", "/ˈwaɪldlaɪf/", "noun", "Protect wildlife.", "از حیات وحش محافظت کن."),
            VocabWord("forest", "جنگل", "/ˈfɔːrɪst/", "noun", "The forest is huge.", "جنگل عظیمه."),
            VocabWord("ocean", "اقیانوس", "/ˈoʊʃən/", "noun", "The ocean is deep.", "اقیانوس عمیقه."),
            VocabWord("energy", "انرژی", "/ˈenərdʒi/", "noun", "Renewable energy.", "انرژی تجدیدپذیر."),
            VocabWord("waste", "هدر دادن", "/weɪst/", "verb", "Don't waste water.", "آب رو هدر نده.", "verb"),
            VocabWord("protect", "محافظت کردن", "/prəˈtekt/", "verb", "Protect the planet.", "از سیاره محافظت کن.", "verb"),
            VocabWord("endangered", "در خطر انقراض", "/ɪnˈdeɪndʒərd/", "adjective", "Endangered species.", "گونه‌های در خطر."),
            VocabWord("sustainable", "پایدار", "/səˈsteɪnəbəl/", "adjective", "Sustainable living.", "زندگی پایدار.")
        ),
        idioms = listOf(
            IdiomExpression("go green", "سبز شدن / دوستدار محیط زیست شدن", "Our school went green last year.", "مدرسه‌مون سال پیش سبز شد.", "informal"),
            IdiomExpression("a drop in the ocean", "قطره‌ای در اقیانوس", "One tree is a drop in the ocean.", "یه درخت قطره‌ای در اقیانوسه.", "idiom"),
            IdiomExpression("mother nature", "مادر طبیعت", "/idiom/ Mother Nature is powerful.", "مادر طبیعت قدرتمنده.", "idiom")
        ),
        pronunciationTips = listOf(
            PronunciationTip("First conditional", "If we recycle, we will help the planet. — stress the main verb."),
            PronunciationTip("environment", "environment /ɪnˈvaɪrənmənt/."),
            PronunciationTip("climate", "climate /ˈklaɪmət/ — استرس روی cli.")
        ),
        culturalNotes = listOf(
            CulturalNote("Environmental awareness", "در غرب، آگاهی زیست‌محیطی بخش مهمی از زندگی روزمره‌ست."),
            CulturalNote("Recycling", "بازیافت در بسیاری از کشورها اجباری یا رایجه.")
        ),
        grammar = listOf(
            GrammarSection("First conditional", "If + present simple, will + base verb. If we recycle, we will reduce waste."),
            GrammarSection("Will for predictions", "The planet will get warmer."),
            GrammarSection("Unless", "Unless we act, the situation will get worse."),
            GrammarSection("Hopes and plans", "I hope we will find a solution. / We're going to protect wildlife.")
        ),
        commonMistakes = listOf(
            CommonMistake("If we will recycle...", "If we recycle...", "بعد از if از will استفاده نمی‌شه."),
            CommonMistake("Unless we will act...", "Unless we act...", "بعد از unless هم فعل ساده."),
            CommonMistake("The environment is very important for we.", "The environment is very important to us.", "بعد از for از ضمیر مفعولی استفاده کن.")
        ),
        conversation = listOf(
            DialogueLine("A", "Have you seen the news about climate change?", "اخبار درباره تغییر اقلیم رو دیدی؟"),
            DialogueLine("B", "Yes. It's really worrying.", "بله. واقعاً نگران‌کننده‌ست."),
            DialogueLine("A", "What can we do about it?", "چی می‌تونیم دربارش بکنیم؟"),
            DialogueLine("B", "Well, if we recycle more, we will reduce waste.", "خب، اگه بیشتر بازیافت کنیم، زباله رو کم می‌کنیم."),
            DialogueLine("A", "That's true. And if we use less energy, we will help the planet.", "درسته. و اگه انرژی کمتری مصرف کنیم، به سیاره کمک می‌کنیم."),
            DialogueLine("B", "Exactly. Small actions make a difference.", "دقیقاً. کارهای کوچک تفاوت ایجاد می‌کنند."),
            DialogueLine("A", "I've started using public transportation.", "شروع کردم به استفاده از حمل و نقل عمومی."),
            DialogueLine("B", "That's great. I've started buying local food.", "عالیه. منم شروع کردم به خرید غذای محلی."),
            DialogueLine("A", "Nice. What about plastic?", "خوبه. پلاستیک چطور؟"),
            DialogueLine("B", "I've stopped using plastic bags.", "استفاده از کیسه پلاستیکی رو متوقف کردم."),
            DialogueLine("A", "Great. Unless we all act, things will get worse.", "عالی. اگه همه عمل نکنیم، اوضاع بدتر می‌شه."),
            DialogueLine("B", "I agree. We have to protect wildlife too.", "موافقم. باید از حیات وحش هم محافظت کنیم."),
            DialogueLine("A", "Forests and oceans are in danger.", "جنگل‌ها و اقیانوس‌ها در خطرهستند."),
            DialogueLine("B", "Yes. And many species are endangered.", "بله. و خیلی از گونه‌ها در خطر انقراضند."),
            DialogueLine("A", "I hope future generations will live in a better world.", "امیدوارم نسل‌های آینده در دنیای بهتری زندگی کنند."),
            DialogueLine("B", "Me too. It starts with us.", "منم همین‌طور. از ما شروع می‌شه.")
        ),
        comprehensionQuestions = listOf(
            ComprehensionQuestion("اگر بیشتر بازیافت کنیم چی می‌شه؟", "زباله رو کم می‌کنیم."),
            ComprehensionQuestion("A چه کاری شروع کرده؟", "استفاده از حمل و نقل عمومی."),
            ComprehensionQuestion("B چه کاری شروع کرده؟", "خرید غذای محلی و توقف استفاده از کیسه پلاستیکی."),
            ComprehensionQuestion("بدون عمل همه چی چطور می‌شه؟", "بدتر می‌شه.")
        ),
        speakingTasks = listOf(
            SpeakingTask("Talk about what you do to help the environment.", "درباره کارهایی که برای محیط زیست انجام می‌دی صحبت کن.", "I recycle... / If we..., we will..."),
            SpeakingTask("Discuss environmental problems.", "درباره مشکلات زیست‌محیطی بحث کن.", "The biggest problem is...")
        ),
        writingTasks = listOf(
            WritingTask("Write about environmental problems and solutions.", "درباره مشکلات زیست‌محیطی و راه‌حل‌ها بنویس.", 220, "Use first conditional.")
        ),
        quiz = listOf(
            QuizQuestion("If we ___ more, we will reduce waste.", listOf("recycle", "will recycle", "recycled", "recycling"), 0),
            QuizQuestion("If we use less energy, we ___ help the planet.", listOf("would", "will", "are", "did"), 1),
            QuizQuestion("___ we act, things will get worse.", listOf("If", "Unless", "When", "While"), 1),
            QuizQuestion("What does 'go green' mean?", listOf("سبز شدن", "دوستدار محیط زیست شدن", "رنگ سبز", "چمن"), 1),
            QuizQuestion("Many species are ___.", listOf("endangered", "danger", "endanger", "dangerous"), 0),
            QuizQuestion("What does 'a drop in the ocean' mean?", listOf("اقیانوس", "قطره‌ای در اقیانوس", "آب", "باران"), 1),
            QuizQuestion("We should protect ___.", listOf("wildlife", "wild", "lively", "wildly"), 0),
            QuizQuestion("What does 'sustainable' mean?", listOf("پایدار", "موقت", "سریع", "کند"), 0)
        )
    )
}

// UNIT 10 — The Way We Are
private fun chapter10(): LessonContent {
    return LessonContent(
        bookId = BOOK_ID,
        chapterNumber = 10,
        title = "The Way We Are",
        titlePersian = "آن‌گونه که هستیم",
        objectives = listOf(
            "Describe personality and behavior",
            "Use gerunds and infinitives",
            "Talk about habits and tendencies",
            "Discuss personality types"
        ),
        vocabulary = listOf(
            VocabWord("personality", "شخصیت", "/ˌpɜːrsəˈnæləti/", "noun", "She has a great personality.", "شخصیت عالی داره."),
            VocabWord("outgoing", "برون‌گرا", "/ˈaʊtɡoʊɪŋ/", "adjective", "He's very outgoing.", "او خیلی برون‌گراست."),
            VocabWord("shy", "خجالتی", "/ʃaɪ/", "adjective", "She's a bit shy.", "او کمی خجالتیه."),
            VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective", "He's confident.", "او با اعتماد به نفسه."),
            VocabWord("patient", "صبور", "/ˈpeɪʃənt/", "adjective", "Very patient teacher.", "معلم خیلی صبور."),
            VocabWord("generous", "بخشنده", "/ˈdʒenərəs/", "adjective", "She's very generous.", "او خیلی بخشنده‌ست."),
            VocabWord("stubborn", "لجباز", "/ˈstʌbərn/", "adjective", "He can be stubborn.", "می‌تونه لجباز باشه."),
            VocabWord("reliable", "قابل اعتماد", "/rɪˈlaɪəbəl/", "adjective", "A reliable friend.", "یه دوست قابل اعتماد."),
            VocabWord("tend to", "تمایل داشتن", "/tend tuː/", "verb", "I tend to be quiet.", "تمایل دارم ساکت باشم.", "verb"),
            VocabWord("behavior", "رفتار", "/bɪˈheɪvjər/", "noun", "Strange behavior.", "رفتار عجیب."),
            VocabWord("habit", "عادت", "/ˈhæbɪt/", "noun", "Good habit.", "عادت خوب."),
            VocabWord("trait", "ویژگی", "/treɪt/", "noun", "Positive trait.", "ویژگی مثبت.")
        ),
        idioms = listOf(
            IdiomExpression("wear your heart on your sleeve", "احساساتت رو بروز بده", "He wears his heart on his sleeve.", "او احساساتش رو بروز می‌ده.", "idiom"),
            IdiomExpression("set in your ways", "به روش خودت عادت کردن", "My grandfather is set in his ways.", "پدربزرگم به روش خودش عادت کرده.", "idiom"),
            IdiomExpression("a people person", "آدم اجتماعی", "She's a real people person.", "او واقعاً آدم اجتماعیه.", "informal")
        ),
        pronunciationTips = listOf(
            PronunciationTip("Gerunds vs infinitives", "I enjoy reading. / I want to read."),
            PronunciationTip("personality", "personality /ˌpɜːrsəˈnæləti/."),
            PronunciationTip("tend to", "tend to /tend tuː/ — تلفظ سریع: /ˈtendə/.")
        ),
        culturalNotes = listOf(
            CulturalNote("Personality talk", "در غرب، توصیف شخصیت در مکالمات روزمره رایجه."),
            CulturalNote("Introvert vs extrovert", "تفاوت درون‌گرا و برون‌گرا در فرهنگ غرب شناخته‌شده‌ست.")
        ),
        grammar = listOf(
            GrammarSection("Gerunds as subjects/objects", "Reading is fun. / I enjoy reading."),
            GrammarSection("Verbs + gerund", "enjoy, avoid, finish, mind, suggest + verb-ing"),
            GrammarSection("Verbs + infinitive", "want, need, decide, hope, plan + to + verb"),
            GrammarSection("Verbs + both", "like, love, hate, prefer + gerund or infinitive (same meaning mostly)")
        ),
        commonMistakes = listOf(
            CommonMistake("I enjoy to read.", "I enjoy reading.", "enjoy + gerund."),
            CommonMistake("I want reading.", "I want to read.", "want + infinitive."),
            CommonMistake("She suggested to go.", "She suggested going.", "suggest + gerund.")
        ),
        conversation = listOf(
            DialogueLine("A", "What's your best friend like?", "بهترین دوستت چه جوریه؟"),
            DialogueLine("B", "She's really outgoing and confident.", "خیلی برون‌گرا و با اعتماد به نفسه."),
            DialogueLine("A", "What about you?", "تو چطور؟"),
            DialogueLine("B", "I'm more reserved. I tend to be quiet around new people.", "من محتاط‌ترم. تمایل دارم اطراف آدم‌های جدید ساکت باشم."),
            DialogueLine("A", "That's interesting. Do you enjoy meeting new people?", "جالبه. از ملاقات با آدم‌های جدید لذت می‌بری؟"),
            DialogueLine("B", "Yes, but it takes me time to open up.", "بله، ولی زمان می‌بره تا باز بشم."),
            DialogueLine("A", "I get that. Do you consider yourself shy?", "می‌فهمم. خودت رو خجالتی می‌دونی؟"),
            DialogueLine("B", "A bit. But I'm also reliable and patient.", "کمی. ولی همچنین قابل اعتماد و صبورم."),
            DialogueLine("A", "Those are great traits.", "این‌ها ویژگی‌های عالی‌اند."),
            DialogueLine("B", "Thanks. What are your best qualities?", "ممنون. بهترین ویژگی‌های تو چیه؟"),
            DialogueLine("A", "I'd say I'm generous and pretty reliable.", "می‌گم بخشنده و نسبتاً قابل اعتمادم."),
            DialogueLine("B", "Any weaknesses?", "نقاط ضعفی هم داری؟"),
            DialogueLine("A", "I can be stubborn sometimes.", "گاهی می‌تونم لجباز باشم."),
            DialogueLine("B", "That's honest. Most of us have habits we'd like to change.", "صادقانه‌ست. بیشتر ما عادت‌هایی داریم که دوست داریم عوض کنیم."),
            DialogueLine("A", "True. But personality traits are hard to change.", "درسته. ولی ویژگی‌های شخصیتی سخت عوض می‌شن."),
            DialogueLine("B", "Yes, but we can always grow.", "بله، ولی همیشه می‌تونیم رشد کنیم.")
        ),
        comprehensionQuestions = listOf(
            ComprehensionQuestion("بهترین دوست B چه جوریه؟", "برون‌گرا و با اعتماد به نفس."),
            ComprehensionQuestion("B خودش رو چطور توصیف می‌کنه؟", "محتاط، قابل اعتماد، صبور."),
            ComprehensionQuestion("A چه ضعفی داره؟", "گاهی لجباز می‌شه."),
            ComprehensionQuestion("آیا ویژگی‌های شخصیتی سخت عوض می‌شن؟", "بله، ولی می‌تونیم رشد کنیم.")
        ),
        speakingTasks = listOf(
            SpeakingTask("Describe your personality.", "شخصیتت رو توصیف کن.", "I tend to... / I enjoy... / I'm..."),
            SpeakingTask("Talk about a friend's personality.", "درباره شخصیت یه دوست صحبت کن.", "He/She is... / He/She tends to...")
        ),
        writingTasks = listOf(
            WritingTask("Write about your personality and habits.", "درباره شخصیت و عادت‌هات بنویس.", 200, "Use gerunds and infinitives.")
        ),
        quiz = listOf(
            QuizQuestion("I enjoy ___.", listOf("to read", "reading", "read", "reads"), 1),
            QuizQuestion("I want ___ a doctor.", listOf("become", "becoming", "to become", "became"), 2),
            QuizQuestion("She suggested ___.", listOf("to go", "going", "go", "went"), 1),
            QuizQuestion("What does 'a people person' mean?", listOf("آدم اجتماعی", "آدم خجالتی", "آدم تنها", "آدم عصبانی"), 0),
            QuizQuestion("I tend ___ quiet.", listOf("be", "to be", "being", "been"), 1),
            QuizQuestion("What does 'set in your ways' mean?", listOf("به روش خودت عادت کردن", "راه رفتن", "تغییر کردن", "راه افتادن"), 0),
            QuizQuestion("He's very ___ — he loves meeting people.", listOf("shy", "outgoing", "quiet", "patient"), 1),
            QuizQuestion("What does 'wear your heart on your sleeve' mean?", listOf("احساساتت رو بروز بده", "قلب", "آستین", "لباس"), 0)
        )
    )
}

// UNIT 11 — Innovation
private fun chapter11(): LessonContent {
    return LessonContent(
        bookId = BOOK_ID,
        chapterNumber = 11,
        title = "Innovation",
        titlePersian = "نوآوری",
        objectives = listOf(
            "Talk about inventions and technology",
            "Use the passive voice in the present perfect",
            "Discuss how things work",
            "Express opinions about innovation"
        ),
        vocabulary = listOf(
            VocabWord("invention", "اختراع", "/ɪnˈvenʃən/", "noun", "The telephone was a great invention.", "تلفن اختراع بزرگی بود."),
            VocabWord("inventor", "مخترع", "/ɪnˈventər/", "noun", "Who was the inventor?", "مخترع کی بود؟"),
            VocabWord("device", "دستگاه", "/dɪˈvaɪs/", "noun", "A useful device.", "یه دستگاه مفید."),
            VocabWord("technology", "فناوری", "/tekˈnɑːlədʒi/", "noun", "Modern technology.", "فناوری مدرن."),
            VocabWord("develop", "توسعه دادن", "/dɪˈveləp/", "verb", "Develop a new app.", "یه اپ جدید توسعه بده.", "verb"),
            VocabWord("design", "طراحی", "/dɪˈzaɪn/", "noun", "Great design.", "طراحی عالی."),
            VocabWord("improve", "بهبود دادن", "/ɪmˈpruːv/", "verb", "Improve the design.", "طراحی رو بهبود بده.", "verb"),
            VocabWord("innovation", "نوآوری", "/ˌɪnəˈveɪʃən/", "noun", "Constant innovation.", "نوآوری مداوم."),
            VocabWord("create", "خلق کردن", "/kriˈeɪt/", "verb", "Create something new.", "یه چیز جدید خلق کن.", "verb"),
            VocabWord("digital", "دیجیتال", "/ˈdɪdʒɪtəl/", "adjective", "Digital world.", "دنیای دیجیتال."),
            VocabWord("wireless", "بی‌سیم", "/ˈwaɪərləs/", "adjective", "Wireless connection.", "اتصال بی‌سیم."),
            VocabWord("efficient", "کارآمد", "/ɪˈfɪʃənt/", "adjective", "Efficient system.", "سیستم کارآمد.")
        ),
        idioms = listOf(
            IdiomExpression("cutting-edge", "پیشرو / لبه برنده", "Cutting-edge technology.", "فناوری پیشرو.", "idiom"),
            IdiomExpression("think outside the box", "خارج از چارچوب فکر کردن", "We need to think outside the box.", "باید خارج از چارچوب فکر کنیم.", "idiom"),
            IdiomExpression("state of the art", "پیشرفته‌ترین", "State-of-the-art equipment.", "تجهیزات پیشرفته‌ترین.", "idiom")
        ),
        pronunciationTips = listOf(
            PronunciationTip("Passive perfect", "The app has been downloaded... — stress downloaded."),
            PronunciationTip("invention", "invention /ɪnˈvenʃən/."),
            PronunciationTip("technology", "technology /tekˈnɑːlədʒi/.")
        ),
        culturalNotes = listOf(
            CulturalNote("Innovation hubs", "دره سیلیکون و مراکز نوآوری نقش مهمی در اقتصاد جهانی دارند."),
            CulturalNote("Digital divide", "دسترسی نابرابر به فناوری یه مسئله جهانیه.")
        ),
        grammar = listOf(
            GrammarSection("Present perfect passive", "has/have + been + past participle. The app has been downloaded a million times."),
            GrammarSection("Past passive", "was/were + past participle. The telephone was invented in 1876."),
            GrammarSection("Describing how things work", "It is used to... / It allows you to..."),
            GrammarSection("Cause and effect", "Because of this invention, people can...")
        ),
        commonMistakes = listOf(
            CommonMistake("The app has downloaded a million times.", "The app has been downloaded a million times.", "passive لازم داره been."),
            CommonMistake("The telephone was invented from Bell.", "The telephone was invented by Bell.", "by نه from."),
            CommonMistake("It is used for to communicate.", "It is used to communicate.", "used to + base verb.")
        ),
        conversation = listOf(
            DialogueLine("A", "What's the most important invention of all time?", "مهم‌ترین اختراع تاریخ چیه؟"),
            DialogueLine("B", "That's a tough question. Maybe the internet?", "سؤال سختیه. شاید اینترنت؟"),
            DialogueLine("A", "That's a good one. It has changed everything.", "خوبه. همه چیز رو تغییر داده."),
            DialogueLine("B", "True. It's been used to connect billions of people.", "درسته. برای اتصال میلیاردها نفر استفاده شده."),
            DialogueLine("A", "Who invented it?", "کی اختراعش کرد؟"),
            DialogueLine("B", "Many scientists contributed. It wasn't invented by one person.", "دانشمندان زیادی مشارکت کردند. توسط یه نفر اختراع نشد."),
            DialogueLine("A", "Interesting. What other inventions do you admire?", "جالبه. چه اختراعات دیگه‌ای رو تحسین می‌کنی؟"),
            DialogueLine("B", "The smartphone. It's been developed so quickly.", "گوشی هوشمند. خیلی سریع توسعه یافته."),
            DialogueLine("A", "Yes, it's amazing what phones can do now.", "بله، شگفت‌انگیزه گوشی‌ها الان چی می‌تونن بکنن."),
            DialogueLine("B", "Do you think technology has made life better?", "فکر می‌کنی فناوری زندگی رو بهتر کرده؟"),
            DialogueLine("A", "Mostly, yes. But it has also created new problems.", "بیشتر بله. ولی مشکلات جدیدی هم ایجاد کرده."),
            DialogueLine("B", "Like what?", "مثل چی؟"),
            DialogueLine("A", "Privacy issues, screen addiction...", "مسائل حریم خصوصی، اعتیاد به صفحه..."),
            DialogueLine("B", "True. We need cutting-edge solutions for those too.", "درسته. به راه‌حل‌های پیشرو برای اون‌ها هم نیاز داریم."),
            DialogueLine("A", "Absolutely. Innovation has to be responsible.", "قطعاً. نوآوری باید مسئولانه باشه."),
            DialogueLine("B", "Well said. Let's hope the next big invention helps everyone.", "خوب گفتی. امیدواریم اختراع بزرگ بعدی به همه کمک کنه.")
        ),
        comprehensionQuestions = listOf(
            ComprehensionQuestion("B مهم‌ترین اختراع رو چی می‌دونه؟", "اینترنت."),
            ComprehensionQuestion("اینترنت توسط کی اختراع شد؟", "دانشمندان زیادی مشارکت کردند، نه یه نفر."),
            ComprehensionQuestion("فناوری چه مشکلاتی ایجاد کرده؟", "مسائل حریم خصوصی و اعتیاد به صفحه."),
            ComprehensionQuestion("نوآوری باید چطور باشه؟", "مسئولانه.")
        ),
        speakingTasks = listOf(
            SpeakingTask("Talk about an invention that changed the world.", "درباره اختراعی که دنیا رو تغییر داد صحبت کن.", "It was invented by... / It has been used to..."),
            SpeakingTask("Discuss pros and cons of technology.", "مزایا و معایب فناوری رو بحث کن.", "It allows us to... / But it has also...")
        ),
        writingTasks = listOf(
            WritingTask("Write about an important invention.", "درباره یه اختراع مهم بنویس.", 220, "Use present perfect passive.")
        ),
        quiz = listOf(
            QuizQuestion("The telephone ___ in 1876.", listOf("invented", "was invented", "has invented", "is inventing"), 1),
            QuizQuestion("The app ___ downloaded a million times.", listOf("has", "has been", "is", "was being"), 1),
            QuizQuestion("The telephone was invented ___ Bell.", listOf("from", "by", "for", "with"), 1),
            QuizQuestion("What does 'cutting-edge' mean?", listOf("لبه برنده", "پیشرو", "قدیمی", "کند"), 1),
            QuizQuestion("It is used ___ communicate.", listOf("for", "to", "with", "by"), 1),
            QuizQuestion("What does 'think outside the box' mean?", listOf("خارج از چارچوب فکر کردن", "جعبه", "داخل جعبه", "بیرون"), 0),
            QuizQuestion("What does 'state of the art' mean?", listOf("پیشرفته‌ترین", "قدیمی", "هنر", "دولت"), 0),
            QuizQuestion("Technology has made life ___ for many people.", listOf("worse", "better", "harder", "longer"), 1)
        )
    )
}

// UNIT 12 — The Future
private fun chapter12(): LessonContent {
    return LessonContent(
        bookId = BOOK_ID,
        chapterNumber = 12,
        title = "The Future",
        titlePersian = "آینده",
        objectives = listOf(
            "Talk about future predictions",
            "Use future forms",
            "Discuss hopes and concerns",
            "Make plans and predictions"
        ),
        vocabulary = listOf(
            VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun", "The future is uncertain.", "آینده نامعلومه."),
            VocabWord("predict", "پیش‌بینی کردن", "/prɪˈdɪkt/", "verb", "Hard to predict.", "سخت پیش‌بینی می‌شه.", "verb"),
            VocabWord("prediction", "پیش‌بینی", "/prɪˈdɪkʃən/", "noun", "Her prediction was right.", "پیش‌بینی‌اش درست بود."),
            VocabWord("likely", "احتمالاً", "/ˈlaɪkli/", "adjective", "It's likely to rain.", "احتمالاً بارون میاد."),
            VocabWord("possible", "ممکن", "/ˈpɑːsəbəl/", "adjective", "Possible but not certain.", "ممکن ولی قطعی نیست."),
            VocabWord("certain", "قطعی", "/ˈsɜːrtən/", "adjective", "I'm certain about it.", "در موردش مطمئنم."),
            VocabWord("uncertain", "نامعلوم", "/ʌnˈsɜːrtən/", "adjective", "The future is uncertain.", "آینده نامعلومه."),
            VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun", "Great progress.", "پیشرفت عالی."),
            VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun", "A big challenge.", "چالش بزرگیه."),
            VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun", "A great opportunity.", "فرصت عالی."),
            VocabWord("hope", "امیدوار بودن", "/hoʊp/", "verb", "I hope so.", "امیدوارم.", "verb"),
            VocabWord("worry", "نگران بودن", "/ˈwɜːri/", "verb", "Don't worry.", "نگران نباش.", "verb")
        ),
        idioms = listOf(
            IdiomExpression("the sky's the limit", "هیچ محدودیتی نیست", "With hard work, the sky's the limit.", "با تلاش، هیچ محدودیتی نیست.", "idiom"),
            IdiomExpression("in the long run", "در بلندمدت", "In the long run, it will help.", "در بلندمدت کمک می‌کنه.", "neutral"),
            IdiomExpression("cross that bridge when we come to it", "موقعش تصمیم می‌گیریم", "Let's cross that bridge when we come to it.", "موقعش تصمیم می‌گیریم.", "idiom")
        ),
        pronunciationTips = listOf(
            PronunciationTip("Will vs going to", "Will for predictions, going to for plans."),
            PronunciationTip("future", "future /ˈfjuːtʃər/."),
            PronunciationTip("prediction", "prediction /prɪˈdɪkʃən/.")
        ),
        culturalNotes = listOf(
            CulturalNote("Future planning", "در غرب، برنامه‌ریزی برای آینده بخش مهمی از زندگیه."),
            CulturalNote("Optimism vs pessimism", "نگاه به آینده در فرهنگ‌ها متفاوته.")
        ),
        grammar = listOf(
            GrammarSection("Will for predictions", "I think it will rain tomorrow."),
            GrammarSection("Going to for plans", "We're going to travel next month."),
            GrammarSection("Might / may for possibility", "It might happen. / She may come."),
            GrammarSection("Future continuous", "This time next year, I'll be working abroad.")
        ),
        commonMistakes = listOf(
            CommonMistake("I will to travel.", "I will travel.", "بعد از will فعل ساده."),
            CommonMistake("I'm going travel.", "I'm going to travel.", "to لازمه."),
            CommonMistake("She will probably to come.", "She will probably come.", "بعد از will فعل ساده.")
        ),
        conversation = listOf(
            DialogueLine("A", "Where do you see yourself in ten years?", "ده سال دیگه خودت رو کجا می‌بینی؟"),
            DialogueLine("B", "I hope I'll be working in a job I love.", "امیدوارم در شغلی که دوست دارم کار کنم."),
            DialogueLine("A", "What kind of job?", "چه نوع شغلی؟"),
            DialogueLine("B", "Something related to technology. Maybe I'll start my own company.", "یه چیزی مرتبط با فناوری. شاید شرکت خودم رو راه بندازم."),
            DialogueLine("A", "That's ambitious. Do you think you'll succeed?", "بلندپروازانه‌ست. فکر می‌کنی موفق می‌شی؟"),
            DialogueLine("B", "I hope so. It won't be easy, but the sky's the limit.", "امیدوارم. آسون نخواهد بود، ولی هیچ محدودیتی نیست."),
            DialogueLine("A", "What worries you about the future?", "چی درباره آینده نگرانت می‌کنه؟"),
            DialogueLine("B", "Climate change, mostly. And maybe AI taking jobs.", "تغییر اقلیم، بیشتر. و شاید هوش مصنوعی که شغل‌ها رو می‌گیره."),
            DialogueLine("A", "Those are real concerns.", "این‌ها نگرانی‌های واقعیند."),
            DialogueLine("B", "True. But there are also opportunities.", "درسته. ولی فرصت‌ها هم هست."),
            DialogueLine("A", "What kind of opportunities?", "چه نوع فرصت‌هایی؟"),
            DialogueLine("B", "New jobs, new industries, new ways to help people.", "شغل‌های جدید، صنایع جدید، راه‌های جدید برای کمک به مردم."),
            DialogueLine("A", "That's a positive way to look at it.", "این نگاه مثبتیه."),
            DialogueLine("B", "In the long run, I believe things will improve.", "در بلندمدت، باور دارم اوضاع بهتر می‌شه."),
            DialogueLine("A", "I hope you're right. What about your personal goals?", "امیدوارم حق با تو باشه. اهداف شخصی‌ات چطور؟"),
            DialogueLine("B", "I'd like to travel more and learn another language.", "دوست دارم بیشتر سفر کنم و یه زبان دیگه یاد بگیرم."),
            DialogueLine("A", "Sounds like a great plan. The future is yours.", "برنامه عالی‌ای به نظر می‌رسه. آینده مال توئه.")
        ),
        comprehensionQuestions = listOf(
            ComprehensionQuestion("B ده سال دیگه خودش رو کجا می‌بینه؟", "در شغلی که دوست داره، شاید شرکت خودش."),
            ComprehensionQuestion("B چه چیزی درباره آینده نگرانش می‌کنه؟", "تغییر اقلیم و هوش مصنوعی."),
            ComprehensionQuestion("B چه فرصت‌هایی می‌بینه؟", "شغل‌های جدید، صنایع جدید."),
            ComprehensionQuestion("اهداف شخصی B چیه؟", "سفر بیشتر و یادگیری یه زبان دیگه.")
        ),
        speakingTasks = listOf(
            SpeakingTask("Talk about your plans for the future.", "درباره برنامه‌هات برای آینده صحبت کن.", "I'll... / I'm going to... / I hope..."),
            SpeakingTask("Discuss predictions about the world in 2050.", "درباره پیش‌بینی‌های دنیا در ۲۰۵۰ بحث کن.", "It will... / It might...")
        ),
        writingTasks = listOf(
            WritingTask("Write about your plans and hopes for the future.", "درباره برنامه‌ها و امیدهایت برای آینده بنویس.", 220, "Use future forms.")
        ),
        quiz = listOf(
            QuizQuestion("I think it ___ rain tomorrow.", listOf("will", "is", "was", "would"), 0),
            QuizQuestion("We're going ___ travel next month.", listOf("for", "to", "with", "at"), 1),
            QuizQuestion("It ___ happen, but I'm not sure.", listOf("might", "will definitely", "must", "should"), 0),
            QuizQuestion("What does 'the sky's the limit' mean?", listOf("آسمان", "هیچ محدودیتی نیست", "محدود", "بالا"), 1),
            QuizQuestion("This time next year, I ___ working abroad.", listOf("will be", "will", "am", "was"), 0),
            QuizQuestion("What does 'in the long run' mean?", listOf("در بلندمدت", "در کوتاه‌مدت", "سریع", "آهسته"), 0),
            QuizQuestion("I hope I ___ succeed.", listOf("will", "am", "was", "would"), 0),
            QuizQuestion("What does 'cross that bridge when we come to it' mean?", listOf("موقعش تصمیم می‌گیریم", "پل", "عبور کردن", "ساختن"), 0)
        )
    )
}