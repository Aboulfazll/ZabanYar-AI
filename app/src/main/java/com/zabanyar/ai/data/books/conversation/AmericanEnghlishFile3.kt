package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 3 — Complete Course Content
 * 12 Files | Intermediate (B1)
 * Original educational content (no copyrighted material reproduced)
 * File titles and grammar points match the official Oxford Scope & Sequence
 * Dialogue length: ~150 lines each (~12-16 minutes)
 */
object AmericanEnglishFile3 {
    const val BOOK_ID = "american_english_file_3"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> file1()
        2 -> file2()
        3 -> file3()
        4 -> file4()
        5 -> file5()
        6 -> file6()
        7 -> file7()
        8 -> file8()
        9 -> file9()
        10 -> file10()
        11 -> file11()
        12 -> file12()
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

    // FILE 1 — Mood food | غذای حال‌وهوا
    private fun file1() = base(
        1, "Mood food", "غذای حال‌وهوا",
        listOf(
            "Use present simple vs. present continuous correctly",
            "Understand action vs. non-action verbs",
            "Talk about food, eating habits, and moods",
            "Describe how food affects how you feel",
            "Discuss diet, nutrition, and well-being"
        ),
        listOf(
            v("mood", "حال‌وهوا", "Food can affect your mood.", "غذا می‌تواند حال‌وهوایت را تحت تأثیر قرار دهد."),
            v("comfort food", "غذای راحتی‌بخش", "Ice cream is my comfort food.", "بستنی غذای راحتی‌بخش من است."),
            v("ingredient", "ماده تشکیل‌دهنده", "What are the ingredients in this soup?", "مواد تشکیل‌دهنده این سوپ چیست؟"),
            v("recipe", "دستور پخت", "Can you share the recipe?", "می‌توانی دستور پخت را بدهی؟"),
            v("protein", "پروتئین", "Meat and beans are good sources of protein.", "گوشت و حبوبات منابع خوب پروتئین هستند."),
            v("carbohydrate", "کربوهیدرات", "Bread and rice are carbohydrates.", "نان و برنج کربوهیدرات هستند."),
            v("energy", "انرژی", "Food gives us energy.", "غذا به ما انرژی می‌دهد."),
            v("craving", "هوس", "I have a craving for chocolate.", "هوس شکلات کرده‌ام."),
            v("hangry", "گرسنه و عصبانی", "I get hangry when I skip meals.", "وقتی وعده غذا را حذف کنم، گرسنه و عصبانی می‌شوم.", "adjective"),
            v("balanced", "متعادل", "Try to eat a balanced diet.", "سعی کن رژیم متعادلی داشته باشی.", "adjective"),
            v("nutrient", "ماده مغذی", "Vegetables are full of nutrients.", "سبزیجات پر از مواد مغذی هستند."),
            v("diet", "رژیم غذایی", "My diet is mostly plant-based.", "رژیم من بیشتر گیاه‌پایه است."),
            v("snack", "میان‌وعده", "I have a snack at 4 PM every day.", "هر روز ساعت ۴ عصر یک میان‌وعده می‌خورم."),
            v("portion", "پرس / مقدار", "The portions at this restaurant are huge.", "پرس‌های این رستوران بزرگ هستند."),
            v("dehydration", "کم‌آبی", "Dehydration affects your mood.", "کم‌آبی روی حالت تأثیر می‌گذارد.")
        ),
        listOf(
            GrammarSection("Present simple vs. Present continuous", "Use present simple for habits and facts (I eat three meals a day). Use present continuous for actions happening now or temporary situations (I'm eating less sugar these days)."),
            GrammarSection("Action vs. Non-action verbs", "Action verbs describe actions (eat, cook, run). Non-action verbs describe states (like, love, want, know, need, understand). Non-action verbs don't usually take -ing."),
            GrammarSection("Food and mood vocabulary", "Use words like craving, comfort food, balanced diet, hangry, and energy."),
            GrammarSection("Expressing habits and preferences", "I usually have... / I try to... / I never eat... / I'm trying to eat less...")
        ),
        listOf(
            d("A", "Hey! You look exhausted today. Are you okay?", "هی! امروز خیلی خسته به نظر می‌رسی. خوبی؟"),
            d("B", "I'm fine, just a bit stressed about work.", "خوبم، فقط کمی درباره کار استرس دارم."),
            d("A", "Have you eaten anything today?", "امروز چیزی خورده‌ای؟"),
            d("B", "Actually, no. I skip breakfast when I'm busy.", "راستش نه. وقتی مشغول باشم صبحانه را حذف می‌کنم."),
            d("A", "That's not good. You need energy to concentrate.", "خوب نیست. برای تمرکز به انرژی نیاز داری."),
            d("B", "I know. But I don't feel hungry in the morning.", "می‌دانم. ولی صبح‌ها گرسنه حس نمی‌کنم."),
            d("A", "How about lunch? What do you usually have?", "ناهار چطور؟ معمولاً چه می‌خوری؟"),
            d("B", "I usually grab a sandwich at a café near the office.", "معمولاً یک ساندویچ از کافه نزدیک دفتر می‌گیرم."),
            d("A", "Do you ever cook at home?", "هیچ‌وقت در خانه آشپزی می‌کنی؟"),
            d("B", "Sometimes. But I'm not very good at cooking.", "گاهی. ولی در آشپزی خیلی خوب نیستم."),
            d("A", "Really? What do you usually make?", "واقعاً؟ معمولاً چه درست می‌کنی؟"),
            d("B", "Just pasta. That's the only thing I can make well.", "فقط پاستا. تنها چیزی که می‌توانم خوب درست کنم همین است."),
            d("A", "Pasta is great. Do you add vegetables?", "پاستا عالیه. سبزیجات اضافه می‌کنی؟"),
            d("B", "Not really. Just tomato sauce and cheese.", "نه واقعاً. فقط سس گوجه و پنیر."),
            d("A", "You should add more vegetables. They're good for your mood too.", "باید سبزیجات بیشتری اضافه کنی. برای حالت هم خوب هستند."),
            d("B", "How can vegetables affect my mood?", "چطور سبزیجات می‌توانند روی حالم تأثیر بگذارند؟"),
            d("A", "Scientists say that certain foods can boost your mood.", "دانشمندان می‌گویند برخی غذاها می‌توانند حالت را تقویت کنند."),
            d("B", "Really? Like what?", "واقعاً؟ مثل چی؟"),
            d("A", "Things like nuts, salmon, and leafy greens are known for improving mood.", "چیزهایی مثل آجیل، سالمون، و سبزیجات برگ‌دار به بهبود حالت معروف هستند."),
            d("B", "Interesting. I had no idea.", "جالب است. هیچ ایده‌ای نداشتم."),
            d("A", "Yes! And too much sugar and processed food can make you feel worse.", "بله! و مصرف بیش از حد شکر و غذای فرآوری‌شده می‌تواند حالت را بدتر کند."),
            d("B", "That explains why I feel bad after eating fast food.", "این توضیح می‌دهد چرا بعد از فست‌فود احساس بدی دارم."),
            d("A", "Exactly. There's a real connection between food and mood.", "دقیقاً. ارتباط واقعی بین غذا و حال‌وهوا وجود دارد."),
            d("B", "What do you usually eat?", "تو معمولاً چه می‌خوری؟"),
            d("A", "I try to eat a balanced diet. I eat a lot of vegetables and fruit.", "سعی می‌کنم رژیم متعادلی داشته باشم. سبزیجات و میوه زیاد می‌خورم."),
            d("B", "Do you eat meat?", "گوشت می‌خوری؟"),
            d("A", "Yes, but not every day. Maybe three times a week.", "بله، ولی هر روز نه. شاید هفته‌ای سه بار."),
            d("B", "I eat meat every day. I love steak.", "من هر روز گوشت می‌خورم. عاشق استیکم."),
            d("A", "Steak is fine sometimes. But too much red meat isn't healthy.", "استیک گاهی اشکالی ندارد. ولی گوشت قرمز زیاد سالم نیست."),
            d("B", "You're right. I should change my diet.", "حق داری. باید رژیمم را تغییر دهم."),
            d("A", "Start slowly. Add one new healthy food each week.", "آرام شروع کن. هر هفته یک غذای سالم جدید اضافه کن."),
            d("B", "That's a good idea. What should I start with?", "فکر خوبی است. با چه چیزی شروع کنم؟"),
            d("A", "How about fruit? Do you like bananas?", "میوه چطور؟ موز دوست داری؟"),
            d("B", "Yes, I love bananas. They're one of my comfort foods.", "بله، عاشق موزم. یکی از غذاهای راحتی‌بخش من هستند."),
            d("A", "Perfect. Bananas are great for energy and mood.", "عالی. موز برای انرژی و حالت عالی است."),
            d("B", "Great. I'll buy some today.", "عالی. امروز چند تا می‌خرم."),
            d("A", "And what about your cravings? Do you ever crave sweets?", "و هوس‌هایت چطور؟ هیچ‌وقت هوس شیرینی می‌کنی؟"),
            d("B", "Yes! Especially in the afternoon. I always want chocolate at 4 PM.", "بله! مخصوصاً بعدازظهر. همیشه ساعت ۴ عصر شکلات می‌خواهم."),
            d("A", "That's because your blood sugar drops. Eating a snack helps.", "چون قند خونت پایین می‌آید. خوردن یک میان‌وعده کمک می‌کند."),
            d("B", "What kind of snack?", "چه نوع میان‌وعده‌ای؟"),
            d("A", "Something with protein, like nuts or yogurt.", "چیزی با پروتئین، مثل آجیل یا ماست."),
            d("B", "Okay, I'll try that instead of chocolate.", "باشه، به جای شکلات این را امتحان می‌کنم."),
            d("A", "You'll feel much better. Trust me.", "خیلی بهتر حس می‌کنی. به من اعتماد کن."),
            d("B", "Thanks for the advice. I feel more motivated now.", "ممنون برای توصیه. الان باانگیزه‌تر حس می‌کنم."),
            d("A", "Anytime. Food is powerful!", "هر وقت. غذا قدرتمند است!"),
            d("B", "Well, let's have lunch together tomorrow. My treat.", "خب، بیا فردا با هم ناهار بخوریم. مهمان من."),
            d("A", "Sure! Where do you want to go?", "حتماً! کجا می‌خواهی برویم؟"),
            d("B", "There's a new healthy restaurant near my office.", "رستوران سالم جدیدی نزدیک دفترم هست."),
            d("A", "Perfect. See you tomorrow at noon.", "عالی. فردا سر ظهر می‌بینمت."),
            d("B", "See you!", "می‌بینمت!"),
            d("A", "Oh wait, one more thing. How much water do you drink?", "اوه صبر کن، یک چیز دیگر. چقدر آب می‌نوشی؟"),
            d("B", "Not much, honestly. Maybe two glasses a day.", "راستش زیاد نه. شاید روزی دو لیوان."),
            d("A", "That's way too little! You need at least eight glasses.", "این خیلی کم است! حداقل به هشت لیوان نیاز داری."),
            d("B", "Eight? I don't think I can drink that much.", "هشت؟ فکر نمی‌کنم بتوانم آنقدر بنوشم."),
            d("A", "Start with a glass when you wake up. Then another before each meal.", "با یک لیوان وقتی بیدار می‌شوی شروع کن. بعد یکی قبل از هر وعده."),
            d("B", "That's a good system. I'll try it.", "سیستم خوبی است. امتحان می‌کنم."),
            d("A", "Dehydration also affects mood. You'll notice a difference.", "کم‌آبی روی حال هم تأثیر می‌گذارد. تفاوت را متوجه می‌شوی."),
            d("B", "I never thought about that.", "هرگز به آن فکر نکرده بودم."),
            d("A", "Most people don't. But it's one of the easiest fixes.", "بیشتر مردم فکر نمی‌کنند. ولی یکی از آسان‌ترین راه‌حل‌هاست."),
            d("B", "Okay, tomorrow I'm starting. Water and vegetables!", "باشه، فردا شروع می‌کنم. آب و سبزیجات!"),
            d("A", "That's the spirit! Small changes, big results.", "همینه! تغییرات کوچک، نتایج بزرگ."),
            d("B", "Thanks. You're a good friend.", "ممنون. دوست خوبی هستی."),
            d("A", "Anytime. Now go eat something!", "هر وقت. حالا برو چیزی بخور!"),
            d("B", "Ha! Okay, I will. See you tomorrow.", "ها! باشه، می‌روم. فردا می‌بینمت."),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Why does B skip breakfast?", listOf("not hungry", "busy", "dislikes breakfast", "on a diet"), 1),
            q("What does B usually eat for lunch?", listOf("pasta", "a sandwich", "salad", "soup"), 1),
            q("What does A say about vegetables?", listOf("they're expensive", "they improve mood", "they're boring", "they're hard to cook"), 1),
            q("What does B crave in the afternoon?", listOf("chips", "chocolate", "fruit", "nuts"), 1),
            q("How much water does B drink?", listOf("eight glasses", "two glasses", "six glasses", "one liter"), 1),
            q("I ___ breakfast every day.", listOf("eat", "eats", "eating", "am eating"), 0),
            q("She ___ pasta right now.", listOf("cooks", "cooking", "is cooking", "cook"), 2),
            q("I ___ chocolate.", listOf("love", "am loving", "loves", "loved"), 0),
            q("We ___ about food this week.", listOf("learn", "learns", "are learning", "learned"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Comfort food", "غذای راحتی‌بخش", "Ice cream is my comfort food.", "بستنی غذای راحتی‌بخش من است."),
            IdiomExpression("Grab a bite", "چیزی سریع خوردن", "I usually grab a sandwich.", "معمولاً یک ساندویچ می‌خورم."),
            IdiomExpression("My treat", "مهمان من", "Lunch is my treat.", "ناهار مهمان من است."),
            IdiomExpression("That's the spirit", "همینه!", "Water and vegetables! That's the spirit!", "آب و سبزیجات! همینه!")
        ),
        phrasal = listOf(
            PhrasalVerb("skip", "حذف کردن", "not do something",
                "I skip breakfast when I'm busy.", "وقتی مشغول باشم صبحانه را حذف می‌کنم.", "No"),
            PhrasalVerb("grab", "سریع گرفتن", "get quickly",
                "I grab a sandwich.", "یک ساندویچ می‌گیرم.", "No"),
            PhrasalVerb("cut down on", "کم کردن", "reduce",
                "I should cut down on sugar.", "باید شکر را کم کنم.", "No"),
            PhrasalVerb("wake up", "بیدار شدن", "stop sleeping",
                "Start with a glass of water when you wake up.", "با یک لیوان آب وقتی بیدار می‌شوی شروع کن.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Third-person -s", "Listen for the final sound: eats /iːts/, loves /lʌvz/, watches /ˈwɒtʃɪz/."),
            PronunciationTip("Question intonation", "Yes/No questions with rising intonation: Do you cook? ↗"),
            PronunciationTip("Non-action verb stress", "Stress the verb: I LOVE chocolate. I NEED water.")
        ),
        culture = listOf(
            CulturalNote("Food and mood", "Scientific studies increasingly show a strong link between diet and mental health."),
            CulturalNote("Comfort food", "Every culture has its own comfort foods — dishes that provide emotional comfort and nostalgia."),
            CulturalNote("Hydration", "The importance of drinking water is often underestimated. Dehydration can affect concentration and mood.")
        ),
        mistakes = listOf(
            CommonMistake("I am loving chocolate.", "I love chocolate.", "Use present simple with non-action verbs like 'love'."),
            CommonMistake("She cook every day.", "She cooks every day.", "Add -s for he, she, it."),
            CommonMistake("I'm knowing the answer.", "I know the answer.", "Non-action verbs don't take -ing."),
            CommonMistake("He is wanting to change his diet.", "He wants to change his diet.", "Use present simple with 'want'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is the connection between food and mood?", "Certain foods like nuts and leafy greens can boost mood, while too much sugar can make you feel worse."),
            ComprehensionQuestion("What advice does A give B?", "Add one healthy food each week, eat protein snacks, eat a balanced diet, and drink more water."),
            ComprehensionQuestion("How much water does A suggest?", "At least eight glasses a day, starting with one when you wake up.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss your eating habits and how food affects your mood.", "درباره عادات غذایی‌ات و تأثیر غذا بر حالت صحبت کن.", "I usually eat... / I try to avoid... / When I eat..., I feel..."),
            SpeakingTask("Give advice to a partner about a healthier diet.", "به یک دوست درباره رژیم سالم‌تر توصیه کن.", "You should... / Have you tried...? / Why don't you...?"),
            SpeakingTask("Role-play a conversation about changing eating habits.", "نقش‌بازی گفت‌وگو درباره تغییر عادات غذایی.", "I'm trying to... / I've started... / It's hard because...")
        ),
        writing = listOf(
            WritingTask("Write about your relationship with food.", "درباره رابطه‌ات با غذا بنویس.", 130, "Use present simple and present continuous.")
        )
    )

    // FILE 2 — Family life | زندگی خانوادگی
    private fun file2() = base(
        2, "Family life", "زندگی خانوادگی",
        listOf(
            "Use future forms: going to, will, present continuous",
            "Distinguish between plans and predictions",
            "Talk about family relationships and life events",
            "Discuss future plans with family"
        ),
        listOf(
            v("engaged", "نامزد", "They got engaged last month.", "ماه گذشته نامزد کردند.", "adjective"),
            v("pregnant", "باردار", "My sister is pregnant with her first child.", "خواهرم با اولین فرزندش باردار است.", "adjective"),
            v("raise", "بزرگ کردن", "Raising children is hard work.", "بزرگ کردن بچه‌ها کار سختی است.", "verb"),
            v("relatives", "فامیل", "We visit relatives every summer.", "هر تابستان به دیدن فامیل می‌رویم."),
            v("generation", "نسل", "There are three generations in our family.", "سه نسل در خانواده ما وجود دارد."),
            v("divorce", "طلاق", "They decided to get a divorce.", "تصمیم گرفتند طلاق بگیرند.", "verb"),
            v("wedding", "عروسی", "The wedding is next month.", "عروسی ماه آینده است."),
            v("inheritance", "ارث", "The inheritance was divided among the children.", "ارث بین بچه‌ها تقسیم شد."),
            v("quality time", "زمان با کیفیت", "We spend quality time together every weekend.", "هر آخر هفته با هم وقت با کیفیت می‌گذرانیم."),
            v("supportive", "حمایتگر", "My parents are very supportive.", "والدینم خیلی حمایتگر هستند.", "adjective"),
            v("in-laws", "خانواده همسر", "My in-laws live nearby.", "خانواده همسرم نزدیک زندگی می‌کنند."),
            v("sibling", "خواهر یا برادر", "I have three siblings.", "من سه خواهر و برادر دارم."),
            v("extended family", "خانواده گسترده", "Our extended family is very large.", "خانواده گسترده ما خیلی بزرگ است."),
            v("nuclear family", "خانواده هسته‌ای", "The nuclear family is becoming less common.", "خانواده هسته‌ای کمتر رایج می‌شود."),
            v("settle down", "ساکن شدن / ازدواج کردن", "When are you going to settle down?", "کی می‌خواهی ساکن شوی؟", "verb")
        ),
        listOf(
            GrammarSection("Future with going to", "Use am/is/are going to + base verb for plans and intentions. I'm going to visit my parents next week."),
            GrammarSection("Future with will", "Use will + base verb for predictions and spontaneous decisions. I think she'll be happy."),
            GrammarSection("Future with present continuous", "Use present continuous for fixed arrangements. I'm meeting my sister at 6 PM tomorrow."),
            GrammarSection("Choosing the right future form", "Going to for plans already decided; will for predictions; present continuous for fixed arrangements.")
        ),
        listOf(
            d("A", "Hey! How's your family? I haven't seen them in a while.", "سلام! خانواده‌ات چطورند؟ مدتی است ندیده‌ام."),
            d("B", "They're all good. Actually, we have some big news.", "همه خوبند. راستش خبر بزرگی داریم."),
            d("A", "Really? What's happening?", "واقعاً؟ چه خبره؟"),
            d("B", "My sister's getting married in June!", "خواهرم ژوئن ازدواج می‌کند!"),
            d("A", "That's wonderful! Congratulations!", "فوق‌العاده است! تبریک می‌گویم!"),
            d("B", "Thanks. We're all really excited.", "ممنون. همه‌مان واقعاً هیجان‌زده‌ایم."),
            d("A", "Where's the wedding going to be?", "عروسی کجا برگزار می‌شود؟"),
            d("B", "At a garden venue. It's going to be outdoors.", "در یک محل باغی. بیرون برگزار می‌شود."),
            d("A", "That sounds beautiful. Will it be big?", "زیبا به نظر می‌رسد. بزرگ می‌شود؟"),
            d("B", "I think so. They're inviting about 150 people.", "فکر می‌کنم بله. حدود ۱۵۰ نفر را دعوت می‌کنند."),
            d("A", "Wow. Are you going to be in the wedding?", "واو. تو در عروسی شرکت می‌کنی؟"),
            d("B", "Yes! I'm going to be the maid of honor.", "بله! من ساقدوش عروس می‌شوم."),
            d("A", "That's a big responsibility. Are you nervous?", "این مسئولیت بزرگی است. مضطربی؟"),
            d("B", "A little. I have to give a speech.", "کمی. باید سخنرانی کنم."),
            d("A", "You'll be fine. You're great at public speaking.", "خوب می‌شوی. در صحبت در جمع عالی هستی."),
            d("B", "Thanks for the vote of confidence.", "ممنون برای دلگرمی."),
            d("A", "So what are you going to wear?", "خب چه می‌پوشی؟"),
            d("B", "I'm going shopping for a dress next weekend.", "آخر هفته بعد برای خرید لباس می‌روم."),
            d("A", "Do you want some company?", "همراه می‌خواهی؟"),
            d("B", "That would be great! Are you free on Saturday?", "عالی می‌شود! شنبه آزادی؟"),
            d("A", "Actually, I'm working on Saturday morning.", "راستش شنبه صبح کار می‌کنم."),
            d("B", "How about the afternoon?", "بعدازظهر چطور؟"),
            d("A", "The afternoon works. Where should we meet?", "بعدازظهر خوب است. کجا قرار بگذاریم؟"),
            d("B", "Let's meet at the mall. Around 2 PM?", "بیا در مال قرار بگذاریم. حدود ۲ بعدازظهر؟"),
            d("A", "Perfect. I'll text you when I'm there.", "عالی. وقتی رسیدم پیام می‌دهم."),
            d("B", "Sounds good. Oh, and did you hear about my cousin?", "خوبه. اوه، درباره پسرخاله‌ام شنیدی؟"),
            d("A", "No, what happened?", "نه، چی شد؟"),
            d("B", "She's pregnant with her second child.", "با فرزند دومش باردار است."),
            d("A", "Wow, that's exciting! When is she due?", "واو، هیجان‌انگیز است! کی موعدش است؟"),
            d("B", "In November. She already has a two-year-old.", "نوامبر. الان یک بچه دو ساله هم دارد."),
            d("A", "Two kids under three! That's a lot.", "دو بچه زیر سه سال! زیاد است."),
            d("B", "I know. She's a superhero. I don't know how she does it.", "می‌دانم. او یک ابرقهرمان است. نمی‌دانم چطور انجامش می‌دهد."),
            d("A", "Raising children is definitely not easy.", "بزرگ کردن بچه‌ها قطعاً آسان نیست."),
            d("B", "Are you thinking about having kids?", "به بچه‌دار شدن فکر می‌کنی؟"),
            d("A", "Someday, maybe. Not right now.", "روزی، شاید. نه الان."),
            d("B", "Same here. My husband and I are focusing on our careers.", "من هم همینطور. من و شوهرم روی حرفه‌هایمان تمرکز می‌کنیم."),
            d("A", "That makes sense. When do you think you'll be ready?", "منطقی است. کی فکر می‌کنی آماده می‌شوی؟"),
            d("B", "Probably in two or three years. We'll see.", "احتمالاً دو یا سه سال دیگر. ببینیم."),
            d("A", "Are your parents asking you about it?", "والدینت از تو می‌پرسند؟"),
            d("B", "Oh, constantly! Especially my mom.", "اوه، مدام! مخصوصاً مادرم."),
            d("A", "Typical! It's the same for me.", "معمول است! برای من هم همینطور است."),
            d("B", "Parents never stop worrying, do they?", "والدین هرگز دست از نگرانی برنمی‌دارند، نه؟"),
            d("A", "Never. But that's because they love us.", "هرگز. ولی چون ما را دوست دارند."),
            d("B", "True. Family is complicated but wonderful.", "درست. خانواده پیچیده ولی فوق‌العاده است."),
            d("A", "Exactly. How many relatives are coming to the wedding?", "دقیقاً. چند فامیل به عروسی می‌آیند؟"),
            d("B", "A lot! My mom has five brothers and sisters.", "زیاد! مادرم پنج برادر و خواهر دارد."),
            d("A", "Wow. So there are many cousins?", "واو. پس پسرخاله و دخترخاله زیاد داری؟"),
            d("B", "More than twenty. It's a huge family.", "بیش از بیست. خانواده بزرگی است."),
            d("A", "That must be fun at gatherings.", "در دورهمی‌ها باید سرگرم‌کننده باشد."),
            d("B", "It's crazy but I love it. There's never a boring moment.", "دیوانه‌کننده است ولی دوستش دارم. لحظه کسل‌کننده‌ای نیست."),
            d("A", "Are you close to all of them?", "با همه‌شان نزدیکی؟"),
            d("B", "Most of them. But some live far away now.", "با بیشترشان. ولی برخی الان دور زندگی می‌کنند."),
            d("A", "Where do they live?", "کجا زندگی می‌کنند؟"),
            d("B", "Some in different countries. Two cousins live in Australia.", "برخی در کشورهای مختلف. دو پسرخاله در استرالیا هستند."),
            d("A", "Are they coming to the wedding?", "به عروسی می‌آیند؟"),
            d("B", "Yes, they are. They're flying in for it.", "بله. برایش پرواز می‌کنند."),
            d("A", "That's nice. So it's going to be a big reunion too.", "خوبه. پس تجدید دیدار بزرگی هم می‌شود."),
            d("B", "Exactly. It's going to be a very special day.", "دقیقاً. روز خیلی خاصی می‌شود."),
            d("A", "You're going to have a great time.", "خوش می‌گذرانی."),
            d("B", "I hope so. You'll come too, right?", "امیدوارم. تو هم می‌آیی، نه؟"),
            d("A", "Of course! Wouldn't miss it.", "البته! از دستش نمی‌دهم."),
            d("B", "Great. I'll send you the invitation.", "عالی. دعوت‌نامه را برایت می‌فرستم."),
            d("A", "Perfect. See you Saturday for dress shopping.", "عالی. شنبه برای خرید لباس می‌بینمت."),
            d("B", "See you then!", "تا اون موقع!")
        ),
        listOf(
            q("What's the big news in B's family?", listOf("mother is pregnant", "sister is getting married", "brother is engaged", "aunt is visiting"), 1),
            q("Where is the wedding going to be?", listOf("at a hotel", "at a church", "at a garden venue", "on a beach"), 2),
            q("What will B be at the wedding?", listOf("a guest", "the maid of honor", "the photographer", "the DJ"), 1),
            q("How many cousins does B have?", listOf("five", "ten", "more than twenty", "thirty"), 2),
            q("When is B's cousin due?", listOf("October", "November", "December", "September"), 1),
            q("I ___ visit my parents next week.", listOf("am going to", "go", "going", "went"), 0),
            q("I think it ___ be sunny tomorrow.", listOf("will", "going to", "is", "was"), 0),
            q("I ___ my sister at 6 PM tomorrow.", listOf("meet", "am meeting", "will meet", "met"), 1),
            q("___ you going to the party?", listOf("Are", "Do", "Is", "Does"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Maid of honor", "ساقدوش عروس", "She's going to be the maid of honor.", "او ساقدوش عروس می‌شود."),
            IdiomExpression("Vote of confidence", "دلگرمی", "Thanks for the vote of confidence.", "ممنون برای دلگرمی."),
            IdiomExpression("Wouldn't miss it", "از دستش نمی‌دهم", "Wouldn't miss it for the world.", "به هیچ قیمتی از دستش نمی‌دهم."),
            IdiomExpression("A superhero", "ابرقهرمان", "She's a superhero.", "او یک ابرقهرمان است.")
        ),
        phrasal = listOf(
            PhrasalVerb("settle down", "ساکن شدن / ازدواج کردن", "start a calm life",
                "When are you going to settle down?", "کی می‌خواهی ساکن شوی؟", "No"),
            PhrasalVerb("grow up", "بزرگ شدن", "become an adult",
                "I grew up in a big family.", "در خانواده بزرگی بزرگ شدم.", "Yes"),
            PhrasalVerb("bring up", "بزرگ کردن", "raise children",
                "She brought up three children alone.", "او سه بچه را تنها بزرگ کرد.", "Yes"),
            PhrasalVerb("fly in", "پرواز کردن به", "arrive by plane",
                "They're flying in for the wedding.", "برای عروسی پرواز می‌کنند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Will contraction", "In natural speech, 'will' is contracted: I'll /aɪl/, she'll /ʃiːl/, they'll /ðeɪl/."),
            PronunciationTip("Going to reduction", "'Going to' often reduces to 'gonna' in informal speech."),
            PronunciationTip("Intonation for enthusiasm", "That's wonderful! ↗ Congratulations! ↗")
        ),
        culture = listOf(
            CulturalNote("Weddings around the world", "Wedding traditions vary widely. In Western cultures, big weddings with many guests are common."),
            CulturalNote("Family dynamics", "Family relationships change over time. Staying connected with extended family is important in many cultures."),
            CulturalNote("Family size", "Family size varies greatly across cultures.")
        ),
        mistakes = listOf(
            CommonMistake("I go to visit my parents next week.", "I'm going to visit my parents next week.", "Use 'going to' for future plans."),
            CommonMistake("She will probably comes.", "She will probably come.", "After 'will', use the base verb."),
            CommonMistake("I'm meeting her yesterday.", "I'm meeting her tomorrow.", "Use present continuous for future arrangements."),
            CommonMistake("He will to travel next year.", "He will travel next year.", "After 'will', use the base verb without 'to'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are B's plans for the wedding?", "B is going to be the maid of honor, give a speech, and go dress shopping."),
            ComprehensionQuestion("What is B's view on family?", "Complicated but wonderful. She loves her big family."),
            ComprehensionQuestion("What's happening with B's cousin?", "She's pregnant with her second child, due in November.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a family event you're planning or attended.", "درباره یک رویداد خانوادگی که برنامه‌ریزی می‌کنی یا رفته‌ای صحبت کن.", "I'm going to... / It's going to be... / We'll..."),
            SpeakingTask("Discuss family traditions with a partner.", "درباره سنت‌های خانوادگی با یک دوست صحبت کن.", "In my family, we... / We always... / It's a tradition to..."),
            SpeakingTask("Talk about your future family plans.", "درباره برنامه‌های خانوادگی آینده‌ات صحبت کن.", "I'm going to... / I'll probably... / I hope to...")
        ),
        writing = listOf(
            WritingTask("Write about a family celebration.", "درباره یک جشن خانوادگی بنویس.", 130, "Use future forms: going to, will, present continuous.")
        )
    )

    // FILE 3 — A house with a history | خانه‌ای با تاریخ
    private fun file3() = base(
        3, "A house with a history", "خانه‌ای با تاریخ",
        listOf(
            "Use past simple vs. past continuous correctly",
            "Use past perfect for earlier past actions",
            "Talk about historical places and old houses",
            "Tell stories about the past"
        ),
        listOf(
            v("mansion", "عمارت", "The old mansion was built in 1890.", "عمارت قدیمی در سال ۱۸۹۰ ساخته شد."),
            v("renovate", "بازسازی کردن", "They renovated the entire kitchen.", "کل آشپزخانه را بازسازی کردند.", "verb"),
            v("owner", "مالک", "The owner is a famous artist.", "مالک هنرمند معروفی است."),
            v("property", "ملک", "The property has been in our family for generations.", "ملک نسل‌ها در خانواده ما بوده است."),
            v("carpenter", "نجار", "The carpenter made all the furniture.", "نجار تمام مبلمان را ساخت."),
            v("century", "قرن", "This house is over a century old.", "این خانه بیش از یک قرن قدمت دارد."),
            v("attic", "اتاق زیرشیروانی", "There are old photos in the attic.", "عکس‌های قدیمی در اتاق زیرشیروانی هستند."),
            v("basement", "زیرزمین", "The basement is cool in summer.", "زیرزمین در تابستان خنک است."),
            v("crack", "ترک", "There's a crack in the wall.", "ترکی در دیوار هست."),
            v("preserve", "حفظ کردن", "We must preserve historical buildings.", "باید ساختمان‌های تاریخی را حفظ کنیم.", "verb"),
            v("heritage", "میراث", "This house is part of our heritage.", "این خانه بخشی از میراث ماست."),
            v("original", "اصلی", "They kept the original windows.", "پنجره‌های اصلی را حفظ کردند.", "adjective"),
            v("restore", "مرمت کردن", "They restored the old paintings.", "نقاشی‌های قدیمی را مرمت کردند.", "verb"),
            v("furniture", "مبلمان", "All the furniture is antique.", "تمام مبلمان عتیقه هستند."),
            v("antique", "عتیقه", "She collects antique jewelry.", "او جواهرات عتیقه جمع می‌کند.", "adjective")
        ),
        listOf(
            GrammarSection("Past simple vs. Past continuous", "Use past simple for completed actions. Use past continuous for actions in progress. I was visiting the house when it started to rain."),
            GrammarSection("Past continuous + past simple", "Use past continuous for the longer background action and past simple for the shorter interrupting action. I was cooking when the phone rang."),
            GrammarSection("Past perfect", "Use had + past participle for an action that happened before another past action. When I arrived, she had already left."),
            GrammarSection("Combining narrative tenses", "Use all three together to tell detailed stories about the past.")
        ),
        listOf(
            d("A", "Did you see that huge old house on Elm Street?", "آن خانه بزرگ و قدیمی در خیابان الم را دیدی؟"),
            d("B", "Yes! The one with the big garden? I've always wondered about it.", "بله! همان که باغ بزرگ دارد؟ همیشه درباره‌اش کنجکاو بوده‌ام."),
            d("A", "I just read an article about it. It has an amazing history.", "تازه مقاله‌ای درباره‌اش خواندم. تاریخ شگفت‌انگیزی دارد."),
            d("B", "Really? Tell me more.", "واقعاً؟ بیشتر بگو."),
            d("A", "It was built in 1890 by a wealthy businessman.", "در سال ۱۸۹۰ توسط یک تاجر ثروتمند ساخته شد."),
            d("B", "Wow, that's over a century ago.", "واو، بیش از یک قرن پیش است."),
            d("A", "Yes. He built it for his wife as a wedding gift.", "بله. آن را به عنوان هدیه عروسی برای همسرش ساخت."),
            d("B", "That's so romantic. What happened to them?", "خیلی رمانتیک است. چه اتفاقی برایشان افتاد؟"),
            d("A", "The article said they lived there for forty years.", "مقاله گفت چهل سال آنجا زندگی کردند."),
            d("B", "Did they have children?", "بچه داشتند؟"),
            d("A", "Yes, five. The whole family lived in that house.", "بله، پنج. تمام خانواده در آن خانه زندگی می‌کردند."),
            d("B", "What happened after they died?", "بعد از مرگشان چه شد؟"),
            d("A", "The house was sold. Different families lived in it over the years.", "خانه فروخته شد. خانواده‌های مختلف طی سال‌ها در آن زندگی کردند."),
            d("B", "When did the current owners buy it?", "مالکان فعلی کی خریدندش؟"),
            d("A", "In 2015. They're a young couple from the city.", "در سال ۲۰۱۵. زوج جوانی از شهر هستند."),
            d("B", "What did they do with it?", "با آن چه کار کردند؟"),
            d("A", "They completely renovated it. But they kept the original style.", "کاملاً بازسازی‌اش کردند. ولی سبک اصلی را حفظ کردند."),
            d("B", "That's great. So many old houses just get destroyed.", "عالی است. خیلی از خانه‌های قدیمی خراب می‌شوند."),
            d("A", "Exactly. This couple wanted to preserve the history.", "دقیقاً. این زوج می‌خواستند تاریخ را حفظ کنند."),
            d("B", "What did they change inside?", "در داخل چه چیزی را تغییر دادند؟"),
            d("A", "They added a modern kitchen and updated the bathrooms.", "یک آشپزخانه مدرن اضافه کردند و حمام‌ها را به‌روز کردند."),
            d("B", "What about the attic? Did they keep it?", "اتاق زیرشیروانی چطور؟ نگهش داشتند؟"),
            d("A", "Yes. Actually, while they were cleaning the attic, they found old photos and letters.", "بله. در واقع، وقتی داشتند زیرشیروانی را تمیز می‌کردند، عکس‌ها و نامه‌های قدیمی پیدا کردند."),
            d("B", "That's amazing! What did they do with them?", "شگفت‌انگیز است! با آن‌ها چه کار کردند؟"),
            d("A", "They gave them to a local museum.", "آن‌ها را به موزه محلی دادند."),
            d("B", "How wonderful. Did they find anything else?", "چقدر عالی. چیز دیگری پیدا کردند؟"),
            d("A", "A few old toys from the children who lived there.", "چند اسباب‌بازی قدیمی از بچه‌هایی که آنجا زندگی می‌کردند."),
            d("B", "Those must be over a hundred years old.", "باید بیش از صد سال قدمت داشته باشند."),
            d("A", "Yes. They kept them in a special box.", "بله. آن‌ها را در یک جعبه ویژه نگه داشتند."),
            d("B", "What a beautiful story. I'd love to see the house.", "چه داستان زیبایی. دوست دارم خانه را ببینم."),
            d("A", "Actually, the owners give tours on weekends.", "راستش، مالکان آخر هفته‌ها تور می‌دهند."),
            d("B", "Really? How much is the tour?", "واقعاً؟ تور چقدر است؟"),
            d("A", "I think it's ten dollars. And the money goes to charity.", "فکر می‌کنم ده دلار است. و پول به خیریه می‌رود."),
            d("B", "That's lovely. Let's go sometime!", "زیباست. بیایید یک وقت برویم!"),
            d("A", "Sure! How about next Saturday?", "حتماً! شنبه آینده چطور؟"),
            d("B", "That works for me. What time?", "برایم خوب است. چه ساعتی؟"),
            d("A", "The tours start at 10 AM, 1 PM, and 3 PM.", "تورها ساعت ۱۰ صبح، ۱ بعدازظهر و ۳ بعدازظهر شروع می‌شوند."),
            d("B", "Let's do the 1 PM tour. We can have lunch first.", "بیایید تور ۱ بعدازظهر را برویم. می‌توانیم اول ناهار بخوریم."),
            d("A", "Perfect. I'll book the tickets online.", "عالی. بلیط‌ها را آنلاین رزرو می‌کنم."),
            d("B", "Great. I'm really looking forward to it.", "عالی. واقعاً منتظرش هستم."),
            d("A", "Me too. I love old houses.", "من هم. عاشق خانه‌های قدیمی‌ام."),
            d("B", "Same here. They have such character.", "من هم. خیلی شخصیت دارند."),
            d("A", "And every house has a story to tell.", "و هر خانه‌ای داستانی برای گفتن دارد."),
            d("B", "Absolutely. That's what makes them special.", "قطعاً. همین است که آن‌ها را خاص می‌کند."),
            d("A", "See you Saturday then!", "پس شنبه می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("When was the house built?", listOf("1850", "1890", "1920", "1950"), 1),
            q("Why was the house built?", listOf("for business", "as a wedding gift", "for a museum", "as a summer home"), 1),
            q("What did the current owners find in the attic?", listOf("furniture", "old photos and letters", "jewelry", "money"), 1),
            q("When do the tours happen?", listOf("every day", "weekends", "only Sundays", "on holidays"), 1),
            q("How much is the tour?", listOf("free", "$5", "$10", "$20"), 2),
            q("While they ___ cleaning, they found old photos.", listOf("are", "were", "was", "is"), 1),
            q("When I arrived, she ___ already left.", listOf("has", "had", "was", "is"), 1),
            q("I ___ reading when the phone rang.", listOf("was", "were", "am", "is"), 0),
            q("They ___ the house in 2015.", listOf("buy", "bought", "buying", "buys"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Character", "شخصیت", "Old houses have such character.", "خانه‌های قدیمی خیلی شخصیت دارند."),
            IdiomExpression("A story to tell", "داستانی برای گفتن", "Every house has a story to tell.", "هر خانه‌ای داستانی برای گفتن دارد."),
            IdiomExpression("Looking forward to", "منتظر بودن", "I'm looking forward to it.", "منتظرش هستم.")
        ),
        phrasal = listOf(
            PhrasalVerb("move in", "اسباب‌کشی کردن به", "start living in a place",
                "They moved in last spring.", "بهار گذشته اسباب‌کشی کردند.", "No"),
            PhrasalVerb("fix up", "تعمیر و بازسازی کردن", "repair and improve",
                "They fixed up the old house beautifully.", "خانه قدیمی را زیبا بازسازی کردند.", "Yes"),
            PhrasalVerb("take care of", "مراقبت کردن", "look after",
                "They take great care of the property.", "خیلی از ملک مراقبت می‌کنند.", "No"),
            PhrasalVerb("come across", "به چیزی برخوردن", "find by chance",
                "They came across old letters in the attic.", "در اتاق زیرشیروانی به نامه‌های قدیمی برخوردند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Past continuous stress", "Stress the -ing verb: I was READing when the phone rang."),
            PronunciationTip("Past perfect reduction", "In natural speech, 'had' often reduces to 'd: she'd left."),
            PronunciationTip("'Was/were' weak forms", "In past continuous, 'was' and 'were' are often weak: /wəz/, /wər/.")
        ),
        culture = listOf(
            CulturalNote("Historic preservation", "Preserving old buildings is important in many cultures. Renovations often try to keep the original style."),
            CulturalNote("House tours", "Many historic homes open for tours. The money often goes toward maintenance or local charities."),
            CulturalNote("Old houses", "Old houses have unique characteristics: original woodwork, high ceilings, and stories that come with them.")
        ),
        mistakes = listOf(
            CommonMistake("I was read when the phone rang.", "I was reading when the phone rang.", "Use -ing after was/were."),
            CommonMistake("When I arrived, she has left.", "When I arrived, she had left.", "Use past perfect for actions before a past event."),
            CommonMistake("They buyed the house in 2015.", "They bought the house in 2015.", "Use correct irregular past form: buy → bought."),
            CommonMistake("They was renovating the house.", "They were renovating the house.", "Use 'were' with 'they'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did the original owner do for his wife?", "He built the house as a wedding gift for her in 1890."),
            ComprehensionQuestion("What did the current owners find and what did they do with it?", "They found old photos, letters, and toys in the attic and gave them to a local museum."),
            ComprehensionQuestion("What did the current owners change and what did they keep?", "They added a modern kitchen and updated the bathrooms, but kept the original style.")
        ),
        speaking = listOf(
            SpeakingTask("Describe an old building you know.", "یک ساختمان قدیمی که می‌شناسی را توصیف کن.", "It was built in... / It's famous for... / The original owner was..."),
            SpeakingTask("Tell a story about an old family house.", "داستانی درباره یک خانه قدیمی خانوادگی تعریف کن.", "When I was young, we lived in... / My grandparents had..."),
            SpeakingTask("Role-play a historic house tour.", "نقش‌بازی یک تور خانه تاریخی.", "Welcome to... / This house was built in... / Notice the...")
        ),
        writing = listOf(
            WritingTask("Write a story about a historical place you've visited.", "داستانی درباره یک مکان تاریخی که دیده‌ای بنویس.", 140, "Use past simple, past continuous, and past perfect.")
        )
    )

    // FILE 4 — A night at the movies | شبی در سینما
    private fun file4() = base(
        4, "A night at the movies", "شبی در سینما",
        listOf(
            "Use narrative tenses to tell stories",
            "Use so/such...that for emphasis",
            "Talk about movies and plots",
            "Describe emotions and reactions"
        ),
        listOf(
            v("plot", "خط داستانی", "The plot was unpredictable.", "خط داستانی غیرقابل پیش‌بینی بود."),
            v("character", "شخصیت", "The main character was very believable.", "شخصیت اصلی خیلی باورپذیر بود."),
            v("soundtrack", "موسیقی متن", "The soundtrack was beautiful.", "موسیقی متن زیبا بود."),
            v("special effects", "جلوه‌های ویژه", "The special effects were incredible.", "جلوه‌های ویژه باورنکردنی بودند."),
            v("twist", "پیچش داستانی", "There was a shocking twist at the end.", "پیچش شوکه‌کننده‌ای در پایان داشت."),
            v("sequel", "دنباله", "The sequel was better than the original.", "دنباله بهتر از نسخه اصلی بود."),
            v("cast", "بازیگران", "The cast was perfect.", "بازیگران عالی بودند."),
            v("review", "نقد", "The reviews were very positive.", "نقدها خیلی مثبت بودند."),
            v("thrilling", "هیجان‌انگیز", "It was a thrilling movie.", "فیلم هیجان‌انگیزی بود.", "adjective"),
            v("predictable", "قابل پیش‌بینی", "The ending was so predictable.", "پایان آنقدر قابل پیش‌بینی بود.", "adjective"),
            v("hilarious", "خنده‌دار", "The movie was hilarious.", "فیلم خنده‌دار بود.", "adjective"),
            v("moving", "تأثیرگذار", "The ending was very moving.", "پایان خیلی تأثیرگذار بود.", "adjective"),
            v("screenplay", "فیلم‌نامه", "The screenplay won an award.", "فیلم‌نامه جایزه برد."),
            v("director", "کارگردان", "The director is very famous.", "کارگردان خیلی معروف است."),
            v("scene", "صحنه", "The final scene was unforgettable.", "صحنه پایانی فراموش‌نشدنی بود.")
        ),
        listOf(
            GrammarSection("Narrative tenses", "Use past simple, past continuous, and past perfect together. I was watching a movie when my friend called. She had already seen it."),
            GrammarSection("So / such...that for emphasis", "Use 'so + adjective' or 'such + (adjective) + noun'. The movie was so boring that I fell asleep. It was such a great film that I saw it twice."),
            GrammarSection("Describing movies", "Use adjectives like thrilling, moving, predictable, unforgettable, hilarious, and touching.")
        ),
        listOf(
            d("A", "Did you see that new movie that just came out?", "آن فیلم جدیدی که تازه اکران شد را دیدی؟"),
            d("B", "Which one? I haven't been to the movies in a while.", "کدام یکی؟ مدتی است به سینما نرفته‌ام."),
            d("A", "The one with Nicole Kidman. The thriller.", "همان با نیکول کیدمن. دلهره‌آور."),
            d("B", "Oh, I've heard about it. Was it good?", "اوه، شنیده‌ام. خوب بود؟"),
            d("A", "It was so good that I saw it twice!", "آنقدر خوب بود که دو بار دیدمش!"),
            d("B", "Wow, that's a strong recommendation.", "واو، توصیه قوی‌ای است."),
            d("A", "I know. It's such a great movie.", "می‌دانم. فیلم خیلی خوبی است."),
            d("B", "What was it about?", "درباره چه بود؟"),
            d("A", "It's about a detective who was investigating an old crime.", "درباره کارآگاهی است که یک جنایت قدیمی را بررسی می‌کرد."),
            d("B", "Sounds interesting. Did you guess the ending?", "جالب به نظر می‌رسد. پایانش را حدس زدی؟"),
            d("A", "No way! The twist was so unexpected that I was completely surprised.", "اصلاً! پیچش آنقدر غیرمنتظره بود که کاملاً غافلگیر شدم."),
            d("B", "I love movies with a good twist.", "عاشق فیلم‌هایی با پیچش خوب هستم."),
            d("A", "Then you'll love this one. It's such a clever plot.", "پس این را دوست خواهی داشت. خط داستانی خیلی هوشمندانه‌ای دارد."),
            d("B", "Was it scary?", "ترسناک بود؟"),
            d("A", "A little. But it's more of a psychological thriller.", "کمی. ولی بیشتر دلهره‌آور روانی است."),
            d("B", "I don't like horror movies. They give me nightmares.", "فیلم‌های ترسناک دوست ندارم. کابوس می‌بینم."),
            d("A", "Don't worry. There's no gore or anything like that.", "نگران نباش. صحنه‌های خشن یا چیزهای این‌طوری ندارد."),
            d("B", "Good. So it's more about tension?", "خوبه. پس بیشتر درباره تنش است؟"),
            d("A", "Exactly. It was so tense that I couldn't move for two hours.", "دقیقاً. آنقدر پرتنش بود که دو ساعت نتوانستم تکان بخورم."),
            d("B", "Wow. You really sold it to me.", "واو. واقعاً قانعم کردی."),
            d("A", "You should see it. When are you free?", "باید ببینی‌اش. کی آزادی؟"),
            d("B", "Maybe this weekend. Where is it playing?", "شاید این آخر هفته. کجا اکران می‌شود؟"),
            d("A", "At the Cineplex downtown. Also online now.", "در سینپلکس مرکز شهر. الان آنلاین هم هست."),
            d("B", "Oh, I can watch it at home. That's easier.", "اوه، می‌توانم خانه تماشا کنم. راحت‌تر است."),
            d("A", "But the big screen is better for this one. The soundtrack is amazing.", "ولی صفحه بزرگ برای این بهتر است. موسیقی متنش شگفت‌انگیز است."),
            d("B", "Is the soundtrack that good?", "موسیقی متنش آنقدر خوب است؟"),
            d("A", "It was composed by Hans Zimmer. So, yes, it's incredible.", "توسط هانس زیمر ساخته شده. پس بله، باورنکردنی است."),
            d("B", "Hans Zimmer! Now I really want to see it.", "هانس زیمر! حالا واقعاً می‌خواهم ببینمش."),
            d("A", "Let's go together. I can see it a third time!", "بیا با هم برویم. می‌توانم بار سوم ببینمش!"),
            d("B", "Ha! You must really love it.", "ها! باید واقعاً دوستش داشته باشی."),
            d("A", "I do. It's such a well-made film.", "دارم. فیلم خیلی خوب ساخته‌شده‌ای است."),
            d("B", "Okay, let's go on Saturday. What time?", "باشه، شنبه برویم. چه ساعتی؟"),
            d("A", "How about the 7 PM show? We can have dinner after.", "نمایش ۷ عصر چطور؟ می‌توانیم بعدش شام بخوریم."),
            d("B", "Perfect. Is there a good restaurant nearby?", "عالی. رستوران خوبی نزدیک هست؟"),
            d("A", "Yes! There's an Italian place next door. Excellent pasta.", "بله! یک ایتالیایی کناری هست. پاستای عالی."),
            d("B", "Sounds like a great night. I'm in.", "شب عالی‌ای به نظر می‌رسد. هستم."),
            d("A", "Great. I'll book the tickets online.", "عالی. بلیط‌ها را آنلاین رزرو می‌کنم."),
            d("B", "Thanks. By the way, do you like watching movies at home?", "ممنون. راستی، تماشای فیلم در خانه دوست داری؟"),
            d("A", "Sometimes. But nothing beats the big screen.", "گاهی. ولی هیچ چیز به پای صفحه بزرگ نمی‌رسد."),
            d("B", "I agree. There's something special about the cinema.", "موافقم. چیزی خاص در سینما هست."),
            d("A", "Exactly. The big screen, the sound, the popcorn...", "دقیقاً. صفحه بزرگ، صدا، پاپ‌کورن..."),
            d("B", "Ha! Popcorn is my favorite part.", "ها! پاپ‌کورن بخش مورد علاقه من است."),
            d("A", "Mine too. I always get a large.", "مال من هم. همیشه بزرگ می‌گیرم."),
            d("B", "We should get there early then, to get snacks.", "پس باید زود برویم که تنقلات بگیریم."),
            d("A", "Good idea. Let's meet at 6:30.", "فکر خوبی است. بیایید ساعت ۶:۳۰ قرار بگذاریم."),
            d("B", "Perfect. See you Saturday.", "عالی. شنبه می‌بینمت."),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What kind of movie is it?", listOf("comedy", "horror", "thriller", "romance"), 2),
            q("Who composed the soundtrack?", listOf("John Williams", "Hans Zimmer", "Ennio Morricone", "Danny Elfman"), 1),
            q("How many times has A seen the movie?", listOf("once", "twice", "three times", "never"), 1),
            q("Where will they meet?", listOf("at the restaurant", "at the cinema", "at a café", "at home"), 1),
            q("What time will they meet?", listOf("6:00", "6:30", "7:00", "7:30"), 1),
            q("The movie was ___ good that I saw it twice.", listOf("such", "so", "very", "too"), 1),
            q("It was ___ great film.", listOf("so", "such", "such a", "very"), 2),
            q("I ___ watching when my friend called.", listOf("was", "were", "am", "is"), 0),
            q("She ___ already seen it.", listOf("has", "had", "was", "is"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Come out", "اکران شدن", "The movie just came out.", "فیلم تازه اکران شد."),
            IdiomExpression("Sold it to me", "قانعم کردی", "You really sold it to me.", "واقعاً قانعم کردی."),
            IdiomExpression("I'm in", "هستم", "Sounds like a great night. I'm in.", "شب عالی‌ای به نظر می‌رسد. هستم."),
            IdiomExpression("Nothing beats", "هیچ چیز به پای ... نمی‌رسد", "Nothing beats the big screen.", "هیچ چیز به پای صفحه بزرگ نمی‌رسد.")
        ),
        phrasal = listOf(
            PhrasalVerb("come out", "اکران شدن", "be released",
                "The movie came out last week.", "فیلم هفته پیش اکران شد.", "No"),
            PhrasalVerb("turn off", "خاموش کردن", "switch off",
                "Turn off your phone in the cinema.", "در سینما گوشی‌ات را خاموش کن.", "Yes"),
            PhrasalVerb("put on", "روشن کردن / پوشیدن", "start a device / wear",
                "Let's put on a movie.", "بیا یک فیلم روشن کنیم.", "Yes"),
            PhrasalVerb("get there", "رسیدن", "arrive",
                "We should get there early.", "باید زود برسیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Emphatic stress with so/such", "Stress 'so' or 'such': It was SO good! It was SUCH a great film!"),
            PronunciationTip("Rising intonation for suggestions", "How about the 7 PM show? ↗"),
            PronunciationTip("Contractions in questions", "What's it about? → /wʌts ɪt əˈbaʊt/")
        ),
        culture = listOf(
            CulturalNote("Cinema culture", "In many countries, going to the movies is a popular social activity. Cinema snacks like popcorn and soda are traditions."),
            CulturalNote("Streaming vs. Cinema", "Streaming services have changed how people watch movies, but the cinema experience remains special for many."),
            CulturalNote("Film ratings", "Movies have age ratings to help people decide what's appropriate.")
        ),
        mistakes = listOf(
            CommonMistake("It was so a great movie.", "It was such a great movie.", "Use 'such a + adjective + noun'."),
            CommonMistake("It was such good that I cried.", "It was so good that I cried.", "Use 'so + adjective'."),
            CommonMistake("I was watch when he called.", "I was watching when he called.", "Use -ing after was/were."),
            CommonMistake("I can see it a three time.", "I can see it a third time.", "Use 'a third time', not 'a three time'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is the movie about?", "A detective investigating an old crime, with an unexpected twist."),
            ComprehensionQuestion("Why does A recommend the big screen?", "The soundtrack by Hans Zimmer is amazing, and the cinema adds to the tension."),
            ComprehensionQuestion("What is B's main concern about the movie?", "B doesn't like horror movies, but A reassures that this is a psychological thriller.")
        ),
        speaking = listOf(
            SpeakingTask("Describe a movie you've seen recently.", "فیلمی که اخیراً دیده‌ای را توصیف کن.", "It's about... / The plot was... / It was so...that..."),
            SpeakingTask("Recommend a movie to a partner.", "یک فیلم به یک دوست توصیه کن.", "You should see... / It's such a... / I highly recommend it."),
            SpeakingTask("Discuss your favorite movie genres.", "درباره ژانرهای فیلم مورد علاقه‌ات صحبت کن.", "I love... / I can't stand... / I prefer...")
        ),
        writing = listOf(
            WritingTask("Write a movie review.", "نقد یک فیلم بنویس.", 140, "Use narrative tenses and so/such...that.")
        )
    )

    // FILE 5 — A role model | یک الگو
    private fun file5() = base(
        5, "A role model", "یک الگو",
        listOf(
            "Use present perfect vs. past simple correctly",
            "Use present perfect with for and since",
            "Talk about people you admire",
            "Describe achievements and life stories",
            "Discuss role models and their influence"
        ),
        listOf(
            v("role model", "الگو", "My mother is my role model.", "مادرم الگوی من است."),
            v("achievement", "دستاورد", "Winning the Nobel Prize was a great achievement.", "بردن جایزه نوبل دستاورد بزرگی بود."),
            v("inspire", "الهام بخشیدن", "She inspires millions of people.", "او به میلیون‌ها نفر الهام می‌بخشد.", "verb"),
            v("admire", "تحسین کردن", "I really admire her courage.", "من واقعاً شجاعتش را تحسین می‌کنم.", "verb"),
            v("accomplish", "به انجام رساندن", "He has accomplished so much.", "او خیلی چیزها به انجام رسانده.", "verb"),
            v("dedication", "فداکاری", "Her dedication to the cause is inspiring.", "فداکاری‌اش برای هدف الهام‌بخش است."),
            v("successful", "موفق", "She's a very successful businesswoman.", "او تاجر زن بسیار موفقی است.", "adjective"),
            v("courage", "شجاعت", "It takes courage to stand up for what you believe.", "برای ایستادن پای باورهایت شجاعت لازم است."),
            v("humble", "فروتن", "Despite his success, he remains humble.", "با وجود موفقیتش، فروتن مانده است.", "adjective"),
            v("determined", "مصمم", "She was determined to succeed.", "او مصمم بود موفق شود.", "adjective"),
            v("perseverance", "پشتکار", "Perseverance is the key to success.", "پشتکار کلید موفقیت است."),
            v("impact", "تأثیر", "He had a huge impact on the community.", "او تأثیر عظیمی بر جامعه داشت."),
            v("legacy", "میراث", "Her legacy lives on through her work.", "میراثش از طریق کارش زنده است."),
            v("overcome", "غلبه کردن", "She overcame many obstacles.", "او بر موانع زیادی غلبه کرد.", "verb"),
            v("recognize", "به رسمیت شناختن", "His work was finally recognized.", "کارش بالاخره به رسمیت شناخته شد.", "verb")
        ),
        listOf(
            GrammarSection("Present perfect vs. Past simple", "Use present perfect for experiences without a specific time. Use past simple with specific past times. I've met many people. I met her in 2015."),
            GrammarSection("Present perfect with for and since", "Use 'for' with periods and 'since' with points in time. I've known her for ten years. She's been a doctor since 2010."),
            GrammarSection("Present perfect with ever/never", "Use 'ever' in questions and 'never' in negative statements about life experiences.")
        ),
        listOf(
            d("A", "Who is your biggest role model?", "بزرگ‌ترین الگوی تو کیست؟"),
            d("B", "That's easy. My grandmother.", "این آسان است. مادربزرگم."),
            d("A", "Really? Tell me about her.", "واقعاً؟ درباره‌اش بگو."),
            d("B", "She's an amazing woman. She grew up very poor.", "او زن شگفت‌انگیزی است. در فقر بزرگ شد."),
            d("A", "How poor?", "چقدر فقیر؟"),
            d("B", "She had to leave school at twelve to work.", "باید در دوازده سالگی مدرسه را ترک می‌کرد تا کار کند."),
            d("A", "That's terrible. What did she do?", "وحشتناک است. چه کار می‌کرد؟"),
            d("B", "She worked in a factory for years. But she never gave up on her dreams.", "سال‌ها در یک کارخانه کار کرد. ولی هرگز رویاهایش را رها نکرد."),
            d("A", "What were her dreams?", "رویاهایش چه بودند؟"),
            d("B", "She wanted to be a teacher. She studied at night after work.", "می‌خواست معلم شود. شب‌ها بعد از کار درس می‌خواند."),
            d("A", "Wow. Did she become a teacher?", "واو. معلم شد؟"),
            d("B", "Yes, she did. She's been a teacher for forty years.", "بله، شد. چهل سال است معلم است."),
            d("A", "That's incredible. She must be very determined.", "باورنکردنی است. باید خیلی مصمم باشد."),
            d("B", "She is. She's the most determined person I've ever met.", "هست. مصمم‌ترین فردی است که تا حالا دیده‌ام."),
            d("A", "How has she influenced you?", "چطور روی تو تأثیر گذاشته؟"),
            d("B", "She's taught me to never give up, no matter how hard things get.", "به من یاد داده هرگز تسلیم نشوم، مهم نیست چیزها چقدر سخت شوند."),
            d("A", "That's a valuable lesson.", "درس ارزشمندی است."),
            d("B", "Definitely. Have you ever had someone like that in your life?", "قطعاً. تو هم کسی مثل او در زندگی‌ات داشته‌ای؟"),
            d("A", "Yes, actually. My high school English teacher.", "بله، در واقع. معلم انگلیسی دبیرستانم."),
            d("B", "Oh? What did she do?", "اوه؟ چه کار کرد؟"),
            d("A", "She believed in me when no one else did.", "وقتی هیچ‌کس دیگر باورم نداشت، او باورم داشت."),
            d("B", "That's powerful. How did she show it?", "قدرتمند است. چطور نشانش داد؟"),
            d("A", "She stayed after school to help me. She spent hours with me.", "بعد از مدرسه می‌ماند تا کمکم کند. ساعت‌ها با من وقت می‌گذاشت."),
            d("B", "She sounds very dedicated.", "به نظر می‌رسد خیلی فداکار است."),
            d("A", "She was. She made me believe I could write.", "بود. باعث شد باور کنم می‌توانم بنویسم."),
            d("B", "And now you're a writer!", "و الان نویسنده‌ای!"),
            d("A", "Exactly. I've written three books because of her.", "دقیقاً. به خاطر او سه کتاب نوشته‌ام."),
            d("B", "Have you thanked her?", "از او تشکر کرده‌ای؟"),
            d("A", "Yes. I dedicated my first book to her.", "بله. اولین کتابم را به او تقدیم کردم."),
            d("B", "That's beautiful. She must have been so proud.", "زیباست. باید خیلی افتخار کرده باشد."),
            d("A", "She was. Unfortunately, she passed away two years ago.", "افتخار کرد. متأسفانه دو سال پیش فوت کرد."),
            d("B", "I'm so sorry to hear that.", "خیلی متأسفم."),
            d("A", "Thank you. But her impact lives on. Not just with me.", "ممنون. ولی تأثیرش زنده است. نه فقط با من."),
            d("B", "What do you mean?", "منظورت چیست؟"),
            d("A", "She taught for thirty-five years. Hundreds of students.", "سی و پنج سال تدریس کرد. صدها دانش‌آموز."),
            d("B", "So her legacy is huge.", "پس میراثش عظیم است."),
            d("A", "Exactly. That's what I mean by impact.", "دقیقاً. منظور من از تأثیر همین است."),
            d("B", "Do you think role models are important?", "فکر می‌کنی الگوها مهم هستند؟"),
            d("A", "Very. Especially for young people.", "خیلی. مخصوصاً برای جوانان."),
            d("B", "Why?", "چرا؟"),
            d("A", "They show us what's possible. They give us hope.", "به ما نشان می‌دهند چه چیزی ممکن است. به ما امید می‌دهند."),
            d("B", "That's true. My grandmother showed me that poverty isn't destiny.", "درست است. مادربزرگم به من نشان داد که فقر سرنوشت نیست."),
            d("A", "Exactly. Role models help us see a different future.", "دقیقاً. الگوها به ما کمک می‌کنند آینده متفاوتی ببینیم."),
            d("B", "Have you ever met any famous people?", "تا حالا افراد معروفی دیده‌ای؟"),
            d("A", "A few. But none as impressive as my teacher.", "چند تا. ولی هیچ‌کدام به اندازه معلمم تأثیرگذار نبودند."),
            d("B", "I know what you mean. Real impact isn't about fame.", "می‌دانم منظورت چیست. تأثیر واقعی درباره شهرت نیست."),
            d("A", "Right. It's about changing lives.", "درست. درباره تغییر زندگی‌هاست."),
            d("B", "How long have you been writing?", "چند سال است می‌نویسی؟"),
            d("A", "I've been writing for over fifteen years.", "بیش از پانزده سال است می‌نویسم."),
            d("B", "That's a long time. Did you always want to be a writer?", "زمان زیادی است. همیشه می‌خواستی نویسنده شوی؟"),
            d("A", "No. Actually, I wanted to be a lawyer first.", "نه. در واقع، اول می‌خواستم وکیل شوم."),
            d("B", "Really? What changed your mind?", "واقعاً؟ چه چیزی نظرت را تغییر داد؟"),
            d("A", "My teacher. She read one of my essays and said I had a gift.", "معلمم. یکی از مقالاتم را خواند و گفت استعدادی دارم."),
            d("B", "And you believed her?", "و باورش کردی؟"),
            d("A", "Eventually. It took me years to fully believe it.", "در نهایت. سال‌ها طول کشید تا کاملاً باورش کنم."),
            d("B", "I understand. Self-belief is hard.", "می‌فهمم. خودباوری سخت است."),
            d("A", "Very. But with the right person encouraging you, it's possible.", "خیلی. ولی با تشویق فرد مناسب، ممکن است."),
            d("B", "So that's why role models matter.", "برای همین الگوها مهم هستند."),
            d("A", "Exactly. They plant seeds that grow for a lifetime.", "دقیقاً. بذرهایی می‌کارند که یک عمر رشد می‌کنند."),
            d("B", "I love that image.", "این تصویر را دوست دارم."),
            d("A", "Well, I should go. I have a meeting soon.", "خب، باید بروم. جلسه‌ای دارم."),
            d("B", "Okay. Thanks for sharing your story.", "باشه. ممنون که داستانت را گفتی."),
            d("A", "You too. Say hi to your grandmother for me.", "تو هم. به مادربزرگت از طرف من سلام برسان."),
            d("B", "I will. See you soon!", "می‌رسانم. به‌زودی می‌بینمت!"),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Who is B's role model?", listOf("mother", "grandmother", "teacher", "father"), 1),
            q("What did B's grandmother do at age twelve?", listOf("went to school", "left school to work", "got married", "moved abroad"), 1),
            q("How long has she been a teacher?", listOf("20 years", "30 years", "40 years", "50 years"), 2),
            q("What did A's teacher do for A?", listOf("gave money", "stayed after school to help", "took A home", "gave books"), 1),
            q("How long has A been writing?", listOf("5 years", "10 years", "over 15 years", "20 years"), 2),
            q("I ___ her for ten years.", listOf("know", "knew", "have known", "am knowing"), 2),
            q("She ___ a teacher since 2010.", listOf("is", "was", "has been", "be"), 2),
            q("I ___ her in 2015.", listOf("meet", "met", "have met", "meeting"), 1),
            q("Have you ever ___ to Japan?", listOf("go", "went", "been", "going"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Never give up", "هرگز تسلیم نشو", "She never gave up on her dreams.", "هرگز رویاهایش را رها نکرد."),
            IdiomExpression("Believe in", "باور داشتن به", "She believed in me.", "او باورم داشت."),
            IdiomExpression("No matter how", "مهم نیست چقدر", "No matter how hard things get.", "مهم نیست چیزها چقدر سخت شوند."),
            IdiomExpression("Plant seeds", "بذر کاشتن", "They plant seeds that grow for a lifetime.", "بذرهایی می‌کارند که یک عمر رشد می‌کنند.")
        ),
        phrasal = listOf(
            PhrasalVerb("grow up", "بزرگ شدن", "spend childhood",
                "She grew up very poor.", "او در فقر بزرگ شد.", "Yes"),
            PhrasalVerb("give up on", "رها کردن", "stop believing in",
                "She never gave up on her dreams.", "هرگز رویاهایش را رها نکرد.", "No"),
            PhrasalVerb("pass away", "فوت کردن", "die",
                "She passed away two years ago.", "او دو سال پیش فوت کرد.", "Yes"),
            PhrasalVerb("live on", "زنده ماندن", "continue to exist",
                "Her impact lives on.", "تأثیرش زنده است.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Present perfect stress", "Stress the past participle: I've KNOWN her for ten years."),
            PronunciationTip("For vs. since", "'For' /fər/ is weak; 'since' /sɪns/ is stronger."),
            PronunciationTip("Contractions", "Practice: I've /aɪv/, she's /ʃiːz/, we've /wiːv/.")
        ),
        culture = listOf(
            CulturalNote("Role models", "Role models can be family members, teachers, or public figures. Their influence often shapes our values and aspirations."),
            CulturalNote("Life stories", "Sharing life stories helps build connections and understanding between people."),
            CulturalNote("Legacy", "Legacy isn't just about fame or wealth. It's about the impact we have on others' lives.")
        ),
        mistakes = listOf(
            CommonMistake("I have met her in 2015.", "I met her in 2015.", "Use past simple with specific past time."),
            CommonMistake("I know her since 2010.", "I've known her since 2010.", "Use present perfect with 'since'."),
            CommonMistake("She has been a teacher for 2010.", "She has been a teacher since 2010.", "Use 'since' with points in time."),
            CommonMistake("I've wrote three books.", "I've written three books.", "Use past participle 'written'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How did B's grandmother achieve her dream?", "She worked in a factory and studied at night to become a teacher."),
            ComprehensionQuestion("How did A's teacher influence A's life?", "She believed in A, stayed after school to help, and encouraged A's writing."),
            ComprehensionQuestion("Why does A think role models are important?", "They show us what's possible, give us hope, and plant seeds that grow for a lifetime.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a role model in your life.", "درباره یک الگو در زندگی‌ات صحبت کن.", "My role model is... / She/He taught me... / I've learned..."),
            SpeakingTask("Discuss how role models influence young people.", "درباره تأثیر الگوها بر جوانان صحبت کن.", "Role models help... / They inspire... / They show us..."),
            SpeakingTask("Tell a story about someone who changed your life.", "داستانی درباره کسی که زندگی‌ات را تغییر داد تعریف کن.", "When I was... / She/He helped me... / Because of her/him, I...")
        ),
        writing = listOf(
            WritingTask("Write about a person who has influenced you.", "درباره کسی که روی تو تأثیر گذاشته بنویس.", 140, "Use present perfect and past simple correctly.")
        )
    )

    // FILE 6 — Sports and fitness | ورزش و تناسب اندام
    private fun file6() = base(
        6, "Sports and fitness", "ورزش و تناسب اندام",
        listOf(
            "Use modals of obligation: must, have to, should",
            "Talk about sports, exercise, and fitness",
            "Discuss health and lifestyle choices",
            "Give advice about staying fit"
        ),
        listOf(
            v("workout", "تمرین ورزشی", "My workout takes an hour.", "تمرینم یک ساعت طول می‌کشد."),
            v("gym", "باشگاه", "I go to the gym three times a week.", "هفته‌ای سه بار به باشگاه می‌روم."),
            v("stretch", "کشش دادن", "You should stretch before running.", "باید قبل از دویدن کشش کنی.", "verb"),
            v("warm up", "گرم کردن", "Always warm up before exercising.", "همیشه قبل از ورزش گرم کن.", "verb"),
            v("cardio", "ورزش هوازی", "I do cardio every morning.", "هر صبح هوازی تمرین می‌کنم."),
            v("weights", "وزنه", "He lifts weights at the gym.", "او در باشگاه وزنه می‌زند."),
            v("fit", "خوش‌اندام / تناسب اندام", "She's very fit.", "او خیلی خوش‌اندام است.", "adjective"),
            v("coach", "مربی", "My coach is very strict.", "مربی‌ام خیلی سختگیر است."),
            v("routine", "روتین", "Exercise should be part of your daily routine.", "ورزش باید بخشی از روتین روزانه‌ات باشد."),
            v("commitment", "تعهد", "Fitness requires commitment.", "تناسب اندام تعهد می‌خواهد."),
            v("endurance", "استقامت", "Running builds endurance.", "دویدن استقامت می‌سازد."),
            v("flexibility", "انعطاف‌پذیری", "Yoga improves flexibility.", "یوگا انعطاف‌پذیری را بهبود می‌بخشد."),
            v("strength", "قدرت", "Weight training builds strength.", "تمرین با وزنه قدرت می‌سازد."),
            v("motivation", "انگیزه", "I need motivation to exercise.", "به انگیزه نیاز دارم تا ورزش کنم."),
            v("recover", "بازیابی کردن", "Your body needs time to recover.", "بدنت به زمان برای بازیابی نیاز دارد.", "verb")
        ),
        listOf(
            GrammarSection("Must vs. Have to", "Use 'must' for personal obligation and strong rules. Use 'have to' for external obligation. I must exercise more. I have to wear a uniform at the gym."),
            GrammarSection("Don't have to vs. Mustn't", "Use 'don't have to' for no obligation. Use 'mustn't' for prohibition. You don't have to run every day. You mustn't use your phone in the pool."),
            GrammarSection("Should / Shouldn't for advice", "Use 'should' to give advice. Use 'shouldn't' for negative advice. You should warm up before running. You shouldn't push yourself too hard.")
        ),
        listOf(
            d("A", "You look really fit! Have you been working out?", "خیلی خوش‌اندام به نظر می‌رسی! ورزش کرده‌ای؟"),
            d("B", "Thanks! Yeah, I've been going to the gym for about six months.", "ممنون! بله، حدود شش ماه است به باشگاه می‌روم."),
            d("A", "Wow, six months. How often do you go?", "واو، شش ماه. چند وقت یک بار می‌روی؟"),
            d("B", "Usually four times a week. But it depends on my schedule.", "معمولاً چهار بار در هفته. ولی به برنامه‌ام بستگی دارد."),
            d("A", "That's impressive. I don't have time for the gym.", "تحسین‌برانگیز است. من وقت باشگاه ندارم."),
            d("B", "You have to make time. It's important for your health.", "باید وقت بسازی. برای سلامتی‌ات مهم است."),
            d("A", "I know. But I'm always so busy.", "می‌دانم. ولی همیشه خیلی مشغولم."),
            d("B", "You don't have to go to a gym, you know. You can exercise at home.", "لازم نیست به باشگاه بروی، می‌دانی. می‌توانی در خانه ورزش کنی."),
            d("A", "Really? What can I do at home?", "واقعاً؟ در خانه چه کار می‌توانم بکنم؟"),
            d("B", "A lot! You can do yoga, push-ups, sit-ups. Even just walking helps.", "خیلی چیزها! می‌توانی یوگا، شنا، دراز و نشست انجام دهی. حتی پیاده‌روی هم کمک می‌کند."),
            d("A", "Walking? That sounds easy enough.", "پیاده‌روی؟ به اندازه کافی آسان به نظر می‌رسد."),
            d("B", "Exactly. You should start with a thirty-minute walk every day.", "دقیقاً. باید با یک پیاده‌روی سی دقیقه‌ای هر روز شروع کنی."),
            d("A", "Thirty minutes. Okay, I can do that.", "سی دقیقه. باشه، می‌توانم انجام دهم."),
            d("B", "And don't forget to stretch afterward.", "و فراموش نکن بعدش کشش کنی."),
            d("A", "Why is stretching important?", "چرا کشش مهم است؟"),
            d("B", "It prevents injuries. And it helps with flexibility.", "از آسیب‌ها جلوگیری می‌کند. و به انعطاف‌پذیری کمک می‌کند."),
            d("A", "I see. Do I have to stretch before or after?", "می‌فهمم. باید قبل از ورزش کشش کنم یا بعدش؟"),
            d("B", "Both are good. But you mustn't stretch cold muscles. Warm up first.", "هر دو خوب هستند. ولی نباید عضلات سرد را کشش بدهی. اول گرم کن."),
            d("A", "How do I warm up?", "چطور گرم کنم؟"),
            d("B", "Just walk or jog slowly for five minutes.", "فقط پنج دقیقه آرام راه برو یا بدو."),
            d("A", "Got it. What about diet? Do I have to change my diet too?", "گرفتم. رژیم چطور؟ باید رژیمم را هم تغییر دهم؟"),
            d("B", "You don't have to change everything at once. But you should eat healthier.", "لازم نیست همه چیز را یکباره تغییر دهی. ولی باید سالم‌تر بخوری."),
            d("A", "What should I eat?", "چه بخورم؟"),
            d("B", "More vegetables, fruits, and protein. Less sugar and fast food.", "سبزیجات، میوه، و پروتئین بیشتر. شکر و فست‌فود کمتر."),
            d("A", "That sounds hard. I love fast food.", "سخت به نظر می‌رسد. عاشق فست‌فودم."),
            d("B", "You don't have to give it up completely. Just eat it less often.", "لازم نیست کاملاً رهایش کنی. فقط کمتر بخورش."),
            d("A", "Okay, that's doable. Anything else?", "باشه، این شدنی است. چیز دیگری؟"),
            d("B", "You must drink enough water. At least eight glasses a day.", "باید آب کافی بنوشی. حداقل هشت لیوان در روز."),
            d("A", "Eight glasses. Okay, I'll try.", "هشت لیوان. باشه، تلاش می‌کنم."),
            d("B", "And you must get enough sleep. Seven or eight hours.", "و باید خواب کافی داشته باشی. هفت یا هشت ساعت."),
            d("A", "I usually sleep only five or six hours.", "من معمولاً فقط پنج یا شش ساعت می‌خوابم."),
            d("B", "That's not enough. You shouldn't use your phone before bed.", "کافی نیست. نباید قبل از خواب از گوشی استفاده کنی."),
            d("A", "Really? Why not?", "واقعاً؟ چرا نه؟"),
            d("B", "The blue light affects your sleep. You should read a book instead.", "نور آبی روی خوابت تأثیر می‌گذارد. باید به جای آن کتاب بخوانی."),
            d("A", "Okay, I'll try that too.", "باشه، آن را هم امتحان می‌کنم."),
            d("B", "Good. And you shouldn't exercise too late at night.", "خوبه. و نباید دیر شب ورزش کنی."),
            d("A", "Why?", "چرا؟"),
            d("B", "It makes it harder to fall asleep. Morning or afternoon is best.", "خوابیدن را سخت‌تر می‌کند. صبح یا بعدازظهر بهتر است."),
            d("A", "I see. So, to summarize: walk, stretch, drink water, sleep more, eat better.", "می‌فهمم. پس خلاصه کنم: پیاده‌روی، کشش، نوشیدن آب، خواب بیشتر، غذای بهتر."),
            d("B", "Exactly! And don't be too hard on yourself. Progress takes time.", "دقیقاً! و به خودت سخت نگیر. پیشرفت زمان می‌برد."),
            d("A", "Thanks. I feel motivated now.", "ممنون. الان انگیزه پیدا کردم."),
            d("B", "Great. Let's check in with each other in a month.", "عالی. بیایید یک ماه دیگر با هم چک کنیم."),
            d("A", "Deal. I'll text you my progress.", "قبول. پیشرفتم را پیام می‌کنم."),
            d("B", "Perfect. Good luck!", "عالی. موفق باشی!"),
            d("A", "Thanks. Talk soon!", "ممنون. به‌زودی صحبت!"),
            d("B", "Talk soon!", "به‌زودی صحبت!")
        ),
        listOf(
            q("How long has B been going to the gym?", listOf("one month", "three months", "six months", "one year"), 2),
            q("How often does B go to the gym?", listOf("twice a week", "three times a week", "four times a week", "every day"), 2),
            q("What does A have to do before stretching?", listOf("eat", "warm up", "drink water", "sleep"), 1),
            q("How much water should A drink?", listOf("four glasses", "six glasses", "eight glasses", "ten glasses"), 2),
            q("You ___ make time for exercise.", listOf("have to", "mustn't", "shouldn't", "don't have to"), 0),
            q("You ___ stretch cold muscles.", listOf("must", "have to", "mustn't", "should"), 2),
            q("You ___ start with a 30-minute walk.", listOf("should", "mustn't", "don't have to", "have to"), 0),
            q("You ___ change everything at once.", listOf("must", "have to", "don't have to", "shouldn't"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Make time", "وقت ساختن", "You have to make time.", "باید وقت بسازی."),
            IdiomExpression("Check in with", "با کسی چک کردن", "Let's check in with each other.", "بیایید با هم چک کنیم."),
            IdiomExpression("Don't be too hard on yourself", "به خودت سخت نگیر", "Don't be too hard on yourself.", "به خودت سخت نگیر."),
            IdiomExpression("Doable", "شدنی", "That's doable.", "این شدنی است.")
        ),
        phrasal = listOf(
            PhrasalVerb("work out", "ورزش کردن", "exercise",
                "I work out four times a week.", "هفته‌ای چهار بار ورزش می‌کنم.", "No"),
            PhrasalVerb("warm up", "گرم کردن", "prepare the body",
                "Always warm up before stretching.", "همیشه قبل از کشش گرم کن.", "No"),
            PhrasalVerb("give up", "رها کردن", "stop doing",
                "You don't have to give up fast food completely.", "لازم نیست کاملاً فست‌فود را رها کنی.", "Yes"),
            PhrasalVerb("check in", "چک کردن", "make contact",
                "Let's check in with each other in a month.", "بیایید یک ماه دیگر با هم چک کنیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Have to reduction", "'Have to' is often pronounced 'hafta': I hafta exercise."),
            PronunciationTip("Modal stress", "Stress the modal for emphasis: I MUST exercise. I HAVE to go."),
            PronunciationTip("'Should' pronunciation", "'Should' is often reduced: /ʃʊd/ or /ʃəd/.")
        ),
        culture = listOf(
            CulturalNote("Fitness culture", "Fitness culture varies globally. In some countries, gyms are popular; in others, outdoor activities are preferred."),
            CulturalNote("Health advice", "Health advice should be given carefully. What works for one person may not work for another."),
            CulturalNote("Sustainable habits", "Small, sustainable changes are more effective than dramatic lifestyle overhauls.")
        ),
        mistakes = listOf(
            CommonMistake("I must to exercise.", "I must exercise.", "After 'must', use base verb without 'to'."),
            CommonMistake("You don't must stretch.", "You mustn't stretch.", "Use 'mustn't', not 'don't must'."),
            CommonMistake("You should to drink water.", "You should drink water.", "After 'should', use base verb without 'to'."),
            CommonMistake("I haven't to go to the gym.", "I don't have to go to the gym.", "Use 'don't have to' for no obligation.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What advice does B give A about exercise?", "Start with a 30-minute daily walk, warm up before stretching, exercise in morning or afternoon."),
            ComprehensionQuestion("What does B say about diet?", "Eat more vegetables, fruits, and protein; less sugar and fast food."),
            ComprehensionQuestion("What are B's other lifestyle tips?", "Drink eight glasses of water, sleep 7-8 hours, avoid screens before bed.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss your fitness routine with a partner.", "درباره روتین ورزشی‌ات با یک دوست صحبت کن.", "I work out... / I should... / I have to..."),
            SpeakingTask("Give advice about healthy living.", "توصیه‌هایی درباره زندگی سالم بده.", "You should... / You have to... / You mustn't..."),
            SpeakingTask("Talk about a healthy habit you want to develop.", "درباره یک عادت سالم که می‌خواهی ایجاد کنی صحبت کن.", "I want to... / I'm going to... / I need to...")
        ),
        writing = listOf(
            WritingTask("Write a fitness plan for yourself.", "یک برنامه تناسب اندام برای خودت بنویس.", 130, "Use modals of obligation: must, have to, should.")
        )
    )

    // FILE 7 — The truth about air travel | حقیقت درباره سفر هوایی
    private fun file7() = base(
        7, "The truth about air travel", "حقیقت درباره سفر هوایی",
        listOf(
            "Use quantifiers: all, most, some, no, none",
            "Talk about air travel and airports",
            "Discuss travel experiences and opinions",
            "Describe flights and travel problems"
        ),
        listOf(
            v("flight", "پرواز", "The flight was delayed.", "پرواز تأخیر داشت."),
            v("airport", "فرودگاه", "The airport is very busy today.", "فرودگاه امروز خیلی شلوغ است."),
            v("terminal", "ترمینال", "Our flight leaves from Terminal 3.", "پرواز ما از ترمینال ۳ حرکت می‌کند."),
            v("boarding pass", "کارت پرواز", "Don't forget your boarding pass.", "کارت پروازت را فراموش نکن."),
            v("security", "امنیت", "Security took an hour.", "امنیت یک ساعت طول کشید."),
            v("customs", "گمرک", "We went through customs quickly.", "سریع از گمرک گذشتیم."),
            v("luggage", "چمدان", "My luggage was lost.", "چمدانم گم شد."),
            v("delay", "تأخیر", "There's a three-hour delay.", "سه ساعت تأخیر هست."),
            v("cancel", "لغو کردن", "The flight was cancelled.", "پرواز لغو شد.", "verb"),
            v("pilot", "خلبان", "The pilot announced the weather.", "خلبان هوا را اعلام کرد."),
            v("take off", "بلند شدن", "We took off on time.", "سر وقت بلند شدیم.", "verb"),
            v("land", "فرود آمدن", "We landed in Paris.", "در پاریس فرود آمدیم.", "verb"),
            v("turbulence", "تلاطم هوا", "We had some turbulence.", "کمی تلاطم داشتیم."),
            v("aisle", "راهرو", "I prefer an aisle seat.", "من صندلی کنار راهرو را ترجیح می‌دهم."),
            v("window seat", "صندلی کنار پنجره", "I always ask for a window seat.", "من همیشه صندلی کنار پنجره می‌خواهم.")
        ),
        listOf(
            GrammarSection("Quantifiers", "Use all, most, some, a few, few, no, none, both, neither. All planes have safety instructions. Most people prefer window seats."),
            GrammarSection("Quantifiers with countable and uncountable nouns", "Many/most/few with countable; much/most/little with uncountable."),
            GrammarSection("Negative quantifiers", "Use 'no' + noun or 'none' alone. There were no delays. None of the flights were cancelled.")
        ),
        listOf(
            d("A", "How was your flight?", "پروازت چطور بود؟"),
            d("B", "Terrible. Everything that could go wrong, went wrong.", "وحشتناک. هر چیزی که می‌توانست غلط شود، غلط شد."),
            d("A", "Really? What happened?", "واقعاً؟ چه شد؟"),
            d("B", "First, the flight was delayed by three hours.", "اول، پرواز سه ساعت تأخیر داشت."),
            d("A", "Three hours? That's awful.", "سه ساعت؟ وحشتناک است."),
            d("B", "And then, when we finally boarded, we sat on the plane for another hour.", "و بعد، وقتی بالاخره سوار شدیم، یک ساعت دیگر در هواپیما نشستیم."),
            d("A", "Why?", "چرا؟"),
            d("B", "Some problem with the engine. Most of the passengers were very upset.", "مشکلی با موتور. بیشتر مسافران خیلی ناراحت بودند."),
            d("A", "I can imagine. Did anyone complain?", "می‌توانم تصور کنم. کسی شکایت کرد؟"),
            d("B", "A few people did. But none of the staff could give us any information.", "چند نفر شکایت کردند. ولی هیچ‌کدام از کارکنان نمی‌توانستند اطلاعاتی بدهند."),
            d("A", "That's frustrating.", "آزاردهنده است."),
            d("B", "Very. And the worst part was yet to come.", "خیلی. و بدترین بخش هنوز در راه بود."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "When we arrived in Paris, my luggage was missing.", "وقتی به پاریس رسیدیم، چمدانم گم شده بود."),
            d("A", "No way! Did they find it?", "نه بابا! پیدایش کردند؟"),
            d("B", "Yes, two days later. All my clothes were in it, thank God.", "بله، دو روز بعد. خدا را شکر همه لباس‌هایم در آن بود."),
            d("A", "Wow. That's a nightmare trip.", "واو. سفر کابوس‌واری است."),
            d("B", "Tell me about it. I've never had such a bad experience.", "بگو چه خبر. هرگز چنین تجربه بدی نداشته‌ام."),
            d("A", "Have you flown a lot?", "زیاد پرواز کرده‌ای؟"),
            d("B", "Quite a bit. Most of my family lives abroad.", "خیلی. بیشتر خانواده‌ام خارج زندگی می‌کنند."),
            d("A", "So you usually have good experiences?", "پس معمولاً تجربیات خوبی داری؟"),
            d("B", "Usually, yes. All flights have some risk, but most are fine.", "معمولاً بله. همه پروازها کمی ریسک دارند، ولی بیشترشان خوب هستند."),
            d("A", "That's true. Do you prefer window or aisle seats?", "درست است. صندلی کنار پنجره ترجیح می‌دهی یا راهرو؟"),
            d("B", "Definitely window. I love looking at the clouds.", "قطعاً کنار پنجره. عاشق نگاه کردن به ابرها هستم."),
            d("A", "Me too. But I always end up with an aisle seat.", "من هم. ولی همیشه آخرش صندلی راهرو می‌گیرم."),
            d("B", "Why?", "چرا؟"),
            d("A", "Because I book late. Most good seats are taken by then.", "چون دیر رزرو می‌کنم. بیشتر صندلی‌های خوب تا آن موقع گرفته شده‌اند."),
            d("B", "You should book earlier. Some airlines have better seats if you check in early.", "باید زودتر رزرو کنی. برخی خطوط هوایی اگر زود پذیرش شوی صندلی‌های بهتری دارند."),
            d("A", "Good to know. What about food on planes?", "خوب است بدانم. غذای هواپیما چطور؟"),
            d("B", "Honestly? Most airplane food isn't very good.", "راستش؟ بیشتر غذای هواپیما خیلی خوب نیست."),
            d("A", "Agreed. Some airlines do it well, though.", "موافقم. ولی برخی خطوط هوایی خوب انجامش می‌دهند."),
            d("B", "Which ones?", "کدام‌ها؟"),
            d("A", "I've heard some Asian airlines have amazing food.", "شنیده‌ام برخی خطوط هوایی آسیایی غذای شگفت‌انگیزی دارند."),
            d("B", "Yes, I've heard that too. But I've never flown with them.", "بله، من هم شنیده‌ام. ولی هرگز با آن‌ها پرواز نکرده‌ام."),
            d("A", "Do you have any tips for long flights?", "برای پروازهای طولانی نکته‌ای داری؟"),
            d("B", "Drink a lot of water. Most people get dehydrated on planes.", "آب زیاد بنوش. بیشتر مردم در هواپیما کم‌آب می‌شوند."),
            d("A", "Good tip. Anything else?", "نکته خوبی. چیز دیگری؟"),
            d("B", "Walk around every few hours. Don't sit the whole time.", "هر چند ساعت راه برو. تمام وقت ننشین."),
            d("A", "That makes sense. What about jet lag?", "منطقی است. جت‌لگ چطور؟"),
            d("B", "Try to sleep on the plane if you can. And adjust to the new time zone quickly.", "اگر می‌توانی در هواپیما بخواب. و سریع به منطقه زمانی جدید عادت کن."),
            d("A", "How do you adjust quickly?", "چطور سریع عادت می‌کنی؟"),
            d("B", "Get sunlight as soon as you arrive. It helps your body clock.", "به محض رسیدن آفتاب بگیر. به ساعت بدنیت کمک می‌کند."),
            d("A", "Great advice. Thanks!", "توصیه عالی. ممنون!"),
            d("B", "No problem. Are you flying anywhere soon?", "مشکلی نیست. به‌زودی جایی پرواز می‌کنی؟"),
            d("A", "Yes, actually. To Tokyo next month.", "بله، در واقع. ماه آینده به توکیو."),
            d("B", "Wow, that's a long flight. About twelve hours?", "واو، پرواز طولانی‌ای است. حدود دوازده ساعت؟"),
            d("A", "Fourteen, with a layover in Seoul.", "چهارده، با یک توقف در سئول."),
            d("B", "That's intense. Definitely follow my tips.", "شدید است. قطعاً توصیه‌هایم را دنبال کن."),
            d("A", "I will. Thanks again!", "می‌کنم. باز هم ممنون!"),
            d("B", "Anytime. Have a great trip!", "هر وقت. سفر عالی داشته باش!"),
            d("A", "Thanks!", "ممنون!")
        ),
        listOf(
            q("Why was B's flight delayed?", listOf("weather", "engine problem", "no pilot", "airport strike"), 1),
            q("What happened to B's luggage?", listOf("was damaged", "was too heavy", "went missing", "was searched"), 2),
            q("Where is A flying to next month?", listOf("Paris", "Tokyo", "Seoul", "London"), 1),
            q("What tip does B give about long flights?", listOf("eat a lot", "drink water and walk around", "sleep the whole time", "watch movies"), 1),
            q("___ flights have some risk.", listOf("All", "None", "Neither", "Few"), 0),
            q("___ people prefer window seats.", listOf("Most", "Much", "Little", "Few"), 0),
            q("There were ___ delays.", listOf("any", "some", "no", "few"), 2),
            q("___ of the flights were cancelled.", listOf("No", "None", "Any", "Few"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Everything that could go wrong", "هر چیزی که می‌توانست غلط شود", "Everything that could go wrong, went wrong.", "هر چیزی که می‌توانست غلط شود، غلط شد."),
            IdiomExpression("Tell me about it", "بگو چه خبر", "Tell me about it.", "بگو چه خبر."),
            IdiomExpression("Yet to come", "هنوز در راه", "The worst part was yet to come.", "بدترین بخش هنوز در راه بود."),
            IdiomExpression("Jet lag", "جت‌لگ", "Try to sleep on the plane to avoid jet lag.", "سعی کن در هواپیما بخوابی تا از جت‌لگ پرهیز کنی.")
        ),
        phrasal = listOf(
            PhrasalVerb("take off", "بلند شدن هواپیما", "leave the ground",
                "We took off on time.", "سر وقت بلند شدیم.", "No"),
            PhrasalVerb("land", "فرود آمدن", "arrive on the ground",
                "We landed in Paris at noon.", "سر ظهر در پاریس فرود آمدیم.", "No"),
            PhrasalVerb("check in", "پذیرش شدن", "register at airport",
                "You should check in early.", "باید زود پذیرش شوی.", "No"),
            PhrasalVerb("end up", "در نهایت ... شدن", "finally be",
                "I always end up with an aisle seat.", "همیشه آخرش صندلی راهرو می‌گیرم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Quantifier stress", "Stress the quantifier: ALL flights. MOST people. SOME airlines."),
            PronunciationTip("Weak forms of 'some'", "'Some' is often weak: /səm/ in 'some people'."),
            PronunciationTip("'A few' vs. 'few'", "'A few' = some; 'few' = not many.")
        ),
        culture = listOf(
            CulturalNote("Air travel", "Air travel has transformed how we connect globally. Long-haul flights are now common."),
            CulturalNote("Airline culture", "Different airlines have different service standards."),
            CulturalNote("Jet lag", "Jet lag affects most travelers crossing multiple time zones. Sunlight exposure is the best way to adjust.")
        ),
        mistakes = listOf(
            CommonMistake("None of the flights was cancelled.", "None of the flights were cancelled.", "Use plural verb with 'none of the' + plural noun."),
            CommonMistake("I don't have some information.", "I don't have any information.", "Use 'any' in negative statements."),
            CommonMistake("All of flights were delayed.", "All of the flights were delayed.", "Use 'of the' before nouns."),
            CommonMistake("Most of people prefer window seats.", "Most people prefer window seats.", "Don't use 'of the' with 'most' + general noun.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What went wrong on B's flight?", "Three-hour delay, engine problem, and lost luggage."),
            ComprehensionQuestion("What are B's tips for long flights?", "Drink water, walk around every few hours, sleep on the plane, get sunlight after arrival."),
            ComprehensionQuestion("What's happening with A's upcoming trip?", "A is flying to Tokyo next month, with a layover in Seoul.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a travel experience you've had.", "درباره تجربه سفری که داشته‌ای صحبت کن.", "One time, I... / The flight was... / Eventually, we..."),
            SpeakingTask("Give advice about air travel.", "توصیه‌هایی درباره سفر هوایی بده.", "You should... / Make sure to... / Don't forget..."),
            SpeakingTask("Discuss travel preferences with a partner.", "درباره ترجیحات سفر با یک دوست صحبت کن.", "I prefer... / I like... / I'd rather...")
        ),
        writing = listOf(
            WritingTask("Write a travel story about a memorable flight.", "داستان سفری درباره یک پرواز به‌یادماندنی بنویس.", 140, "Use quantifiers correctly.")
        )
    )

    // FILE 8 — The power of words | قدرت کلمات
    private fun file8() = base(
        8, "The power of words", "قدرت کلمات",
        listOf(
            "Use reported speech correctly",
            "Use common reporting verbs",
            "Talk about communication and language",
            "Discuss persuasion and negotiation"
        ),
        listOf(
            v("persuade", "متقاعد کردن", "She persuaded him to change his mind.", "او متقاعدش کرد نظرش را تغییر دهد.", "verb"),
            v("negotiate", "مذاکره کردن", "They negotiated for hours.", "ساعت‌ها مذاکره کردند.", "verb"),
            v("convince", "قانع کردن", "I convinced her to come.", "قانعش کردم بیاید.", "verb"),
            v("compliment", "تعریف کردن", "He gave her a compliment.", "به او تعریف کرد.", "verb"),
            v("criticize", "انتقاد کردن", "Don't criticize without reason.", "بدون دلیل انتقاد نکن.", "verb"),
            v("persuasive", "قانع‌کننده", "He's a persuasive speaker.", "او سخنران قانع‌کننده‌ای است.", "adjective"),
            v("argument", "بحث / استدلال", "That's a strong argument.", "استدلال قوی‌ای است."),
            v("admit", "اعتراف کردن", "He admitted he was wrong.", "اعتراف کرد اشتباه کرده.", "verb"),
            v("deny", "انکار کردن", "She denied everything.", "همه چیز را انکار کرد.", "verb"),
            v("suggest", "پیشنهاد دادن", "I suggested a different approach.", "رویکرد متفاوتی پیشنهاد دادم.", "verb"),
            v("complain", "شکایت کردن", "He complained about the noise.", "از سر و صدا شکایت کرد.", "verb"),
            v("promise", "قول دادن", "She promised to call.", "قول داد زنگ بزند.", "verb"),
            v("warn", "هشدار دادن", "I warned him about the danger.", "به او درباره خطر هشدار دادم.", "verb"),
            v("mention", "اشاره کردن", "She mentioned a new project.", "به پروژه جدیدی اشاره کرد.", "verb"),
            v("explain", "توضیح دادن", "Can you explain that again?", "می‌توانی دوباره توضیح دهی؟", "verb")
        ),
        listOf(
            GrammarSection("Reported speech: tense changes", "Move tenses back one step: 'I'm tired' → He said he was tired. 'I saw her' → He said he had seen her."),
            GrammarSection("Reported questions", "Use statement word order: 'Where do you live?' → She asked where I lived."),
            GrammarSection("Reporting verbs", "Use varied verbs: say, tell, ask, mention, explain, admit, deny, suggest, promise, warn, complain."),
            GrammarSection("Time and place changes", "Change time/place words: today → that day, tomorrow → the next day, here → there.")
        ),
        listOf(
            d("A", "I had the strangest conversation yesterday.", "دیروز عجیب‌ترین مکالمه را داشتم."),
            d("B", "Really? What happened?", "واقعاً؟ چه شد؟"),
            d("A", "My boss called me into her office. She said she wanted to talk.", "رئیسم مرا به دفترش خواست. گفت می‌خواهد صحبت کند."),
            d("B", "That sounds serious. What did she say?", "جدی به نظر می‌رسد. چه گفت؟"),
            d("A", "She told me she was very impressed with my work.", "گفت از کارم خیلی تحت تأثیر قرار گرفته."),
            d("B", "That's great! What else did she say?", "عالی است! دیگر چه گفت؟"),
            d("A", "She said she had recommended me for a promotion.", "گفت مرا برای ارتقاء توصیه کرده."),
            d("B", "Wow! Congratulations!", "واو! تبریک می‌گویم!"),
            d("A", "Thanks. But then she mentioned something strange.", "ممنون. ولی بعد چیز عجیبی اشاره کرد."),
            d("B", "What?", "چی؟"),
            d("A", "She asked if I would be willing to relocate to another city.", "پرسید آیا حاضرم به شهر دیگری نقل مکان کنم."),
            d("B", "Oh. What did you say?", "اوه. چه گفتی؟"),
            d("A", "I told her I needed time to think about it.", "گفتم به زمان نیاز دارم تا درباره‌اش فکر کنم."),
            d("B", "That's smart. What city?", "هوشمندانه است. کدام شهر؟"),
            d("A", "Chicago. She said the position was based there.", "شیکاگو. گفت موقعیت آنجا مستقر است."),
            d("B", "Chicago is a great city. Would you go?", "شیکاگو شهر عالی‌ای است. می‌روی؟"),
            d("A", "I don't know. My whole family is here.", "نمی‌دانم. تمام خانواده‌ام اینجا هستند."),
            d("B", "That's a tough decision. What does your wife say?", "تصمیم دشواری است. همسرت چه می‌گوید؟"),
            d("A", "She hasn't said much yet. She asked me what I really wanted.", "هنوز زیاد نگفته. پرسید واقعاً چه می‌خواهم."),
            d("B", "What do you want?", "چه می‌خواهی؟"),
            d("A", "I want the promotion. But I'm not sure about Chicago.", "ارتقاء را می‌خواهم. ولی درباره شیکاگو مطمئن نیستم."),
            d("B", "Have you visited Chicago before?", "قبلاً شیکاگو رفته‌ای؟"),
            d("A", "Once, for a conference. It was cold, but beautiful.", "یک بار، برای کنفرانس. سرد بود، ولی زیبا."),
            d("B", "Chicago is very livable. It has great food and culture.", "شیکاگو خیلی قابل زندگی است. غذای عالی و فرهنگ دارد."),
            d("A", "That's what I've heard. But I'd miss my family and friends.", "این چیزی است که شنیده‌ام. ولی دلم برای خانواده و دوستانم تنگ می‌شود."),
            d("B", "I understand. Have you talked to your family about it?", "می‌فهمم. با خانواده‌ات درباره‌اش صحبت کرده‌ای؟"),
            d("A", "Not yet. I wanted to decide first.", "هنوز نه. اول می‌خواستم تصمیم بگیرم."),
            d("B", "You know what I think? You should talk to them first. They might surprise you.", "می‌دانی من چه فکر می‌کنم؟ باید اول با آن‌ها صحبت کنی. ممکن است شگفت‌زده‌ات کنند."),
            d("A", "You're right. I'll talk to them tonight.", "حق داری. امشب با آن‌ها صحبت می‌کنم."),
            d("B", "Good. And remember, this is a great opportunity.", "خوبه. و یادت باشد، این فرصت عالی‌ای است."),
            d("A", "I know. I'm just scared of change.", "می‌دانم. فقط از تغییر می‌ترسم."),
            d("B", "Everyone is. But growth comes from discomfort.", "همه می‌ترسند. ولی رشد از ناراحتی می‌آید."),
            d("A", "That's a good point. Did you ever have to make a decision like this?", "نکته خوبی است. تا حالا مجبور شده‌ای چنین تصمیمی بگیری؟"),
            d("B", "Yes, actually. Two years ago, my company asked me to move to Boston.", "بله، در واقع. دو سال پیش شرکت از من خواست به بوستون بروم."),
            d("A", "What did you do?", "چه کار کردی؟"),
            d("B", "I said yes. And it changed my life.", "گفتم بله. و زندگی‌ام را تغییر داد."),
            d("A", "Really? How?", "واقعاً؟ چطور؟"),
            d("B", "I met my wife there. And I grew so much as a person.", "همسرم را آنجا دیدم. و به عنوان یک انسان خیلی رشد کردم."),
            d("A", "That's inspiring.", "الهام‌بخش است."),
            d("B", "It was hard at first. I missed my old life. But I don't regret it.", "اولش سخت بود. دلم برای زندگی قبلی‌ام تنگ شده بود. ولی پشیمان نیستم."),
            d("A", "Did anyone try to persuade you not to go?", "کسی سعی کرد متقاعدت کند نروی؟"),
            d("B", "My parents did. They said I should stay close to home.", "والدینم کردند. گفتند باید نزدیک خانه بمانم."),
            d("A", "And what did you say?", "و تو چه گفتی؟"),
            d("B", "I told them I needed to follow my own path.", "گفتم باید مسیر خودم را دنبال کنم."),
            d("A", "How did they react?", "چطور واکنش نشان دادند؟"),
            d("B", "They were upset at first. But eventually, they understood.", "اول ناراحت بودند. ولی در نهایت فهمیدند."),
            d("A", "So the words you chose mattered.", "پس کلماتی که انتخاب کردی مهم بودند."),
            d("B", "Exactly. Words have power. That's what I learned.", "دقیقاً. کلمات قدرت دارند. این چیزی است که یاد گرفتم."),
            d("A", "How do you mean?", "منظورت چیست؟"),
            d("B", "How you say something can change everything. The same message can sound harsh or kind.", "نحوه گفتن چیزی می‌تواند همه چیز را تغییر دهد. همان پیام می‌تواند تند یا مهربان به نظر برسد."),
            d("A", "That's true. My boss is very good at that.", "درست است. رئیسم در آن خیلی خوب است."),
            d("B", "Persuasive people choose their words carefully.", "افراد قانع‌کننده کلماتشان را با دقت انتخاب می‌کنند."),
            d("A", "Do you think I can learn that?", "فکر می‌کنی می‌توانم یاد بگیرم؟"),
            d("B", "Of course. It's a skill. Reading, listening, and practicing all help.", "البته. یک مهارت است. خواندن، گوش دادن، و تمرین کمک می‌کنند."),
            d("A", "Any book recommendations?", "توصیه کتابی داری؟"),
            d("B", "Yes. 'Influence' by Robert Cialdini. It's about persuasion.", "بله. «تأثیر» از رابرت چیالدینی. درباره متقاعدسازی است."),
            d("A", "I've heard of it. I'll check it out.", "شنیده‌ام. بررسی می‌کنم."),
            d("B", "It's worth reading. Really changes how you think about communication.", "ارزش خواندن دارد. واقعاً نحوه فکر کردنت درباره ارتباط را تغییر می‌دهد."),
            d("A", "Thanks. Well, I should go call my family.", "ممنون. خب، باید بروم به خانواده‌ام زنگ بزنم."),
            d("B", "Good luck. Let me know how it goes.", "موفق باشی. بگو چطور پیش رفت."),
            d("A", "I will. Thanks for listening.", "می‌گویم. ممنون که گوش دادی."),
            d("B", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
            d("A", "Talk soon!", "به‌زودی صحبت!"),
            d("B", "Talk soon!", "به‌زودی صحبت!")
        ),
        listOf(
            q("What did A's boss say?", listOf("she was unhappy", "she was impressed with A's work", "she was leaving", "she was hiring"), 1),
            q("What opportunity did the boss offer?", listOf("a raise", "a vacation", "a promotion with relocation", "extra training"), 2),
            q("What city would A have to relocate to?", listOf("Boston", "New York", "Chicago", "Seattle"), 2),
            q("Why did B's family not want B to move?", listOf("too expensive", "too far", "dangerous city", "no jobs"), 1),
            q("She said she ___ very impressed.", listOf("is", "was", "be", "were"), 1),
            q("She asked where I ___.", listOf("live", "lived", "do live", "living"), 1),
            q("He said he ___ recommended me.", listOf("has", "had", "have", "having"), 1),
            q("She told me she ___ call.", listOf("will", "would", "was", "is"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Follow your own path", "مسیر خودت را دنبال کن", "I needed to follow my own path.", "باید مسیر خودم را دنبال کنم."),
            IdiomExpression("Growth comes from discomfort", "رشد از ناراحتی می‌آید", "Growth comes from discomfort.", "رشد از ناراحتی می‌آید."),
            IdiomExpression("Worth reading", "ارزش خواندن دارد", "It's worth reading.", "ارزش خواندن دارد."),
            IdiomExpression("Check it out", "بررسی کردن", "I'll check it out.", "بررسی می‌کنم.")
        ),
        phrasal = listOf(
            PhrasalVerb("talk about", "صحبت کردن درباره", "discuss",
                "Let's talk about it tonight.", "بیایید امشب درباره‌اش صحبت کنیم.", "No"),
            PhrasalVerb("check out", "بررسی کردن", "look at",
                "I'll check out that book.", "آن کتاب را بررسی می‌کنم.", "Yes"),
            PhrasalVerb("find out", "فهمیدن", "discover",
                "I need to find out more.", "باید بیشتر بفهمم.", "Yes"),
            PhrasalVerb("speak up", "بلند صحبت کردن", "speak louder",
                "Could you speak up, please?", "می‌توانی بلندتر صحبت کنی، لطفاً؟", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Reported speech tense shift", "Listen for the tense change: 'I'm' → she said she WAS."),
            PronunciationTip("Reporting verb stress", "Stress the reporting verb: She SAID she was tired. He TOLD me."),
            PronunciationTip("Question intonation in reported speech", "Reported questions use statement intonation: She asked where I LIVED. ↘")
        ),
        culture = listOf(
            CulturalNote("Communication styles", "Communication styles vary across cultures. Direct vs. indirect communication can lead to misunderstandings."),
            CulturalNote("Negotiation", "Effective negotiation relies on listening as much as speaking."),
            CulturalNote("Persuasion", "Persuasion is a skill that can be developed. It's about clear and empathetic communication.")
        ),
        mistakes = listOf(
            CommonMistake("She said me that she was tired.", "She told me that she was tired.", "Use 'tell' with an object, 'say' without."),
            CommonMistake("He asked where did I live.", "He asked where I lived.", "Reported questions use statement word order."),
            CommonMistake("She said she will come.", "She said she would come.", "Shift 'will' to 'would' in reported speech."),
            CommonMistake("He told that he was busy.", "He told me that he was busy.", "'Tell' needs an object.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What opportunity is A considering?", "A promotion that requires relocating to Chicago."),
            ComprehensionQuestion("What did B share about their own experience?", "B moved to Boston two years ago, met their wife there, and grew as a person."),
            ComprehensionQuestion("What is B's key insight about communication?", "Words have power. How you say something can change everything.")
        ),
        speaking = listOf(
            SpeakingTask("Report a conversation you had recently.", "یک مکالمه اخیرت را گزارش کن.", "She said... / He told me... / They asked..."),
            SpeakingTask("Discuss a difficult decision you've had to make.", "درباره یک تصمیم دشوار که مجبور شده‌ای بگیری صحبت کن.", "I had to decide... / I told them... / Eventually..."),
            SpeakingTask("Talk about the power of words in communication.", "درباره قدرت کلمات در ارتباط صحبت کن.", "How you say... / It matters because...")
        ),
        writing = listOf(
            WritingTask("Write about a conversation that changed your mind.", "درباره مکالمه‌ای که نظرت را تغییر داد بنویس.", 140, "Use reported speech and reporting verbs.")
        )
    )

    // FILE 9 — Money | پول
    private fun file9() = base(
        9, "Money", "پول",
        listOf(
            "Use the second conditional for hypothetical situations",
            "Use 'I wish' for present regrets",
            "Talk about money, spending, and saving",
            "Discuss financial choices and priorities"
        ),
        listOf(
            v("budget", "بودجه", "I need to stick to my budget.", "باید به بودجه‌ام پایبند باشم."),
            v("save", "پس‌انداز کردن", "I'm saving for a house.", "برای خانه پس‌انداز می‌کنم.", "verb"),
            v("spend", "خرج کردن", "He spends too much on clothes.", "او زیاد برای لباس خرج می‌کند.", "verb"),
            v("borrow", "قرض گرفتن", "Can I borrow some money?", "می‌توانم کمی پول قرض بگیرم؟", "verb"),
            v("lend", "قرض دادن", "She lent me her car.", "او ماشینش را به من قرض داد.", "verb"),
            v("owe", "بدهکار بودن", "I owe him fifty dollars.", "من پنجاه دلار به او بدهکارم.", "verb"),
            v("invest", "سرمایه‌گذاری کردن", "He invests in stocks.", "او در سهام سرمایه‌گذاری می‌کند.", "verb"),
            v("debt", "بدهی", "I'm trying to pay off my debt.", "سعی می‌کنم بدهی‌ام را بپردازم."),
            v("salary", "حقوق", "Her salary is very good.", "حقوقش خیلی خوب است."),
            v("afford", "توان مالی داشتن", "I can't afford a new car.", "توان مالی ماشین جدید ندارم.", "verb"),
            v("loan", "وام", "They took out a loan for the house.", "برای خانه وام گرفتند."),
            v("savings", "پس‌انداز", "She used her savings for the trip.", "او پس‌اندازش را برای سفر استفاده کرد."),
            v("wealthy", "ثروتمند", "He comes from a wealthy family.", "او از خانواده ثروتمندی می‌آید.", "adjective"),
            v("generous", "سخاوتمند", "She's very generous with her money.", "او با پولش خیلی سخاوتمند است.", "adjective"),
            v("stingy", "خسیس", "Don't be so stingy!", "اینقدر خسیس نباش!", "adjective")
        ),
        listOf(
            GrammarSection("Second conditional", "Use if + past simple, would + base verb for hypothetical situations. If I had more money, I would travel the world."),
            GrammarSection("I wish + past simple", "Use 'I wish' for present regrets. I wish I had more time. I wish I didn't have so much debt."),
            GrammarSection("Was vs. Were in conditionals", "In formal English, use 'were' for all persons in the second conditional. If I were you, I would save more.")
        ),
        listOf(
            d("A", "Hey! I have a question for you. If you won the lottery, what would you do?", "سلام! یک سؤال از تو دارم. اگر لاتاری می‌بردی چه می‌کردی؟"),
            d("B", "That's easy. I'd quit my job and travel the world.", "این آسان است. کارم را رها می‌کردم و دور دنیا سفر می‌کردم."),
            d("A", "Really? You'd quit your job just like that?", "واقعاً؟ همین‌طوری کارت را رها می‌کردی؟"),
            d("B", "In a heartbeat. I've always wanted to travel.", "بلافاصله. همیشه می‌خواستم سفر کنم."),
            d("A", "Where would you go first?", "اول کجا می‌رفتی؟"),
            d("B", "Japan, definitely. I've dreamed about it for years.", "ژاپن، قطعاً. سال‌هاست درباره‌اش خواب می‌بینم."),
            d("A", "What would you do there?", "آنجا چه کار می‌کردی؟"),
            d("B", "I'd visit all the temples, try the food, and study the culture.", "از تمام معابد دیدن می‌کردم، غذا امتحان می‌کردم، و فرهنگ را مطالعه می‌کردم."),
            d("A", "That sounds amazing. What about you? Would you travel too?", "شگفت‌انگیز به نظر می‌رسد. تو چطور؟ تو هم سفر می‌کردی؟"),
            d("B", "Not right away. First, I'd pay off my debts.", "فوراً نه. اول بدهی‌هایم را می‌پرداختم."),
            d("A", "That's smart. How much do you owe?", "هوشمندانه است. چقدر بدهکار هستی؟"),
            d("B", "About twenty thousand dollars. Student loans and credit cards.", "حدود بیست هزار دلار. وام دانشجویی و کارت‌های اعتباری."),
            d("A", "That's a lot. How long have you been paying them off?", "زیاد است. چند سال است پرداخت می‌کنی؟"),
            d("B", "For five years. And I still have a long way to go.", "پنج سال. و هنوز راه زیادی مانده."),
            d("A", "I understand. I have some debt too.", "می‌فهمم. من هم کمی بدهی دارم."),
            d("B", "How much?", "چقدر؟"),
            d("A", "About five thousand. Credit card stuff.", "حدود پنج هزار. بدهی کارت اعتباری."),
            d("B", "That's not too bad. You should pay it off as soon as possible.", "خیلی بد نیست. باید در اسرع وقت بپردازی."),
            d("A", "I'm trying. But it's hard with my salary.", "تلاش می‌کنم. ولی با حقوقم سخت است."),
            d("B", "How much do you make?", "چقدر درآمد داری؟"),
            d("A", "About three thousand a month. After taxes and rent, not much is left.", "حدود سه هزار در ماه. بعد از مالیات و اجاره، زیاد نمی‌ماند."),
            d("B", "I know the feeling. Rent is so expensive here.", "این حس را می‌شناسم. اجاره اینجا خیلی گران است."),
            d("A", "Tell me about it. If rent were cheaper, I'd save a lot more.", "بگو چه خبر. اگر اجاره ارزان‌تر بود، خیلی بیشتر پس‌انداز می‌کردم."),
            d("B", "Same here. If I lived with my parents, I'd save a fortune.", "من هم. اگر با والدینم زندگی می‌کردم، ثروتی پس‌انداز می‌کردم."),
            d("A", "Why don't you?", "چرا نمی‌کنی؟"),
            d("B", "I need my independence. I couldn't live with them again.", "به استقلالم نیاز دارم. نمی‌توانستم دوباره با آن‌ها زندگی کنم."),
            d("A", "I understand. Do you ever regret moving out?", "می‌فهمم. هیچ‌وقت پشیمان شدی که اسباب‌کشی کردی؟"),
            d("B", "Sometimes. Especially when rent is due!", "گاهی. مخصوصاً وقتی اجاره سر می‌رسد!"),
            d("A", "Ha! I know what you mean.", "ها! می‌دانم منظورت چیست."),
            d("B", "Do you wish you had more money?", "آرزو می‌کنی پول بیشتری داشتی؟"),
            d("A", "Definitely. I wish I could afford a nicer apartment.", "قطعاً. ای کاش می‌توانستم یک آپارتمان بهتر بگیرم."),
            d("B", "What's wrong with your apartment?", "آپارتمانت چه مشکلی دارد؟"),
            d("A", "It's small and old. The heating doesn't work well in winter.", "کوچک و قدیمی است. گرمایش در زمستان خوب کار نمی‌کند."),
            d("B", "That sounds tough. If I were you, I'd look for something else.", "سخت به نظر می‌رسد. اگر جای تو بودم، دنبال جای دیگری می‌گشتم."),
            d("A", "I've been looking. But everything is so expensive.", "داشتم می‌گشتم. ولی همه چیز اینقدر گران است."),
            d("B", "Have you considered moving further from the city?", "به نقل مکان دورتر از شهر فکر کرده‌ای؟"),
            d("A", "Yes, but then my commute would be longer.", "بله، ولی آن موقع رفت‌وآمدم طولانی‌تر می‌شد."),
            d("B", "True. Life is full of trade-offs.", "درست. زندگی پر از معامله است."),
            d("A", "It really is. Well, let's change the subject. Do you like your job?", "واقعاً همینطور است. خب، موضوع را عوض کنیم. کارت را دوست داری؟"),
            d("B", "I do. It pays the bills. But it's not my dream job.", "دارم. صورتحساب‌ها را پرداخت می‌کند. ولی شغل رویایی‌ام نیست."),
            d("A", "What would your dream job be?", "شغل رویایی‌ات چه می‌بود؟"),
            d("B", "I'd be a travel photographer. I'd travel and take photos.", "عکاس سفر می‌بودم. سفر می‌کردم و عکس می‌گرفتم."),
            d("A", "That sounds incredible. What's stopping you?", "باورنکردنی به نظر می‌رسد. چه چیزی متوقفت می‌کند؟"),
            d("B", "Money, obviously. And fear.", "پول، واضح است. و ترس."),
            d("A", "Fear of what?", "ترس از چی؟"),
            d("B", "Failure. What if I'm not good enough?", "شکست. اگر به اندازه کافی خوب نباشم چه؟"),
            d("A", "You'll never know if you don't try.", "اگر امتحان نکنی هرگز نمی‌دانی."),
            d("B", "I know. But it's a big risk.", "می‌دانم. ولی ریسک بزرگی است."),
            d("A", "If you had savings, would you try?", "اگر پس‌انداز داشتی، امتحان می‌کردی؟"),
            d("B", "Maybe. I'd need at least a year of living expenses.", "شاید. حداقل به یک سال هزینه زندگی نیاز داشتم."),
            d("A", "How much is that?", "چقدر است؟"),
            d("B", "About forty thousand dollars.", "حدود چهل هزار دلار."),
            d("A", "That's a lot. How long would it take to save?", "زیاد است. چقدر طول می‌کشد پس‌انداز کنی؟"),
            d("B", "At my current rate, about four years.", "با نرخ فعلی، حدود چهار سال."),
            d("A", "That's not too bad. You could have a plan.", "خیلی بد نیست. می‌توانی برنامه داشته باشی."),
            d("B", "You're right. I should write it down.", "حق داری. باید بنویسمش."),
            d("A", "Do you ever buy lottery tickets?", "هیچ‌وقت بلیط لاتاری می‌خری؟"),
            d("B", "Sometimes. Only a few dollars a week.", "گاهی. فقط چند دلار در هفته."),
            d("A", "Do you ever win?", "هیچ‌وقت می‌بری؟"),
            d("B", "Never. Not even a small amount.", "هرگز. حتی یک مبلغ کوچک."),
            d("A", "Me neither. It's a waste of money.", "من هم. هدر دادن پول است."),
            d("B", "I know. But it's fun to dream!", "می‌دانم. ولی رویا بافتن سرگرم‌کننده است!"),
            d("A", "True. What would you do with a million dollars?", "درست. با یک میلیون دلار چه می‌کردی؟"),
            d("B", "I told you. Quit my job and travel.", "گفتم. کارم را رها می‌کردم و سفر."),
            d("A", "And after that?", "و بعد از آن؟"),
            d("B", "I'd buy a small house by the ocean. And write a book.", "یک خانه کوچک کنار اقیانوس می‌خریدم. و یک کتاب می‌نوشتم."),
            d("A", "That's a beautiful dream.", "رویای زیبایی است."),
            d("B", "Thanks. What about you?", "ممنون. تو چطور؟"),
            d("A", "I'd start a small business. Maybe a café.", "یک کسب‌وکار کوچک راه می‌انداختم. شاید یک کافه."),
            d("B", "A café sounds nice. What kind?", "کافه خوب به نظر می‌رسد. چه نوعی؟"),
            d("A", "A book café. Coffee, books, and comfortable chairs.", "کافه کتاب. قهوه، کتاب، و صندلی‌های راحت."),
            d("B", "I'd go there every day.", "هر روز می‌رفتم آنجا."),
            d("A", "You'd be my first customer!", "اولین مشتری من می‌شدی!"),
            d("B", "Ha! Deal.", "ها! قبول."),
            d("A", "Well, speaking of money, I should go. I have a budget meeting.", "خب، از پول که صحبت شد، باید بروم. جلسه بودجه دارم."),
            d("B", "Good luck. Don't spend too much!", "موفق باشی. زیاد خرج نکن!"),
            d("A", "I'll try. See you soon!", "تلاش می‌کنم. به‌زودی می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What would B do if they won the lottery?", listOf("buy a house", "quit job and travel", "start a business", "save it all"), 1),
            q("How much debt does B have?", listOf("$5,000", "$10,000", "$20,000", "$40,000"), 2),
            q("What is B's dream job?", listOf("writer", "chef", "travel photographer", "business owner"), 2),
            q("What kind of business would A start?", listOf("restaurant", "book café", "gym", "bakery"), 1),
            q("If I ___ more money, I would travel.", listOf("have", "had", "will have", "have had"), 1),
            q("If I ___ you, I'd save more.", listOf("am", "was", "were", "be"), 2),
            q("I wish I ___ more time.", listOf("have", "had", "will have", "have had"), 1),
            q("If I won the lottery, I ___ quit my job.", listOf("will", "would", "am", "did"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Pay off", "پرداخت کردن", "I'd pay off my debts first.", "اول بدهی‌هایم را می‌پرداختم."),
            IdiomExpression("In a heartbeat", "بلافاصله", "I'd quit in a heartbeat.", "بلافاصله رها می‌کردم."),
            IdiomExpression("Trade-offs", "معامله‌ها", "Life is full of trade-offs.", "زندگی پر از معامله است."),
            IdiomExpression("Long way to go", "راه زیادی مانده", "I still have a long way to go.", "هنوز راه زیادی مانده.")
        ),
        phrasal = listOf(
            PhrasalVerb("pay off", "پرداخت کردن", "complete payment",
                "I'd pay off my debts.", "بدهی‌هایم را می‌پرداختم.", "Yes"),
            PhrasalVerb("save up", "پس‌انداز کردن", "accumulate money",
                "I need to save up for a house.", "باید برای خانه پس‌انداز کنم.", "No"),
            PhrasalVerb("live off", "از چیزی زندگی کردن", "depend on for money",
                "He lives off his savings.", "از پس‌اندازش زندگی می‌کند.", "No"),
            PhrasalVerb("splash out", "خرج زیاد کردن", "spend a lot",
                "She splashed out on a new car.", "برای یک ماشین جدید خرج زیاد کرد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Second conditional rhythm", "Stress 'if' clause and 'would': If I HAD money, I WOULD travel."),
            PronunciationTip("'Would' reduction", "In natural speech, 'would' reduces to 'd: I'd, she'd, they'd."),
            PronunciationTip("Wish + past stress", "Stress the past verb: I WISH I HAD more time.")
        ),
        culture = listOf(
            CulturalNote("Money and culture", "Attitudes toward money, debt, and saving vary widely across cultures."),
            CulturalNote("Financial planning", "Financial literacy is increasingly important. Budgeting and planning are common practices."),
            CulturalNote("Career vs. money", "The relationship between career satisfaction and income is complex.")
        ),
        mistakes = listOf(
            CommonMistake("If I would have money, I would travel.", "If I had money, I would travel.", "Use past simple in if-clause, not 'would have'."),
            CommonMistake("I wish I have more money.", "I wish I had more money.", "Use past simple after 'wish'."),
            CommonMistake("If I was you, I would save.", "If I were you, I would save.", "Use 'were' for hypothetical situations."),
            CommonMistake("If she would come, we would go.", "If she came, we would go.", "Use past simple in if-clause.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are B's financial priorities?", "Pay off debts first, then save for travel and a dream job."),
            ComprehensionQuestion("What is B's dream life like?", "Travel photographer who lives by the ocean and writes a book."),
            ComprehensionQuestion("What does A dream of doing?", "Opening a book café with coffee, books, and comfortable chairs.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about what you would do if you won the lottery.", "درباره آنچه اگر لاتاری می‌بردی می‌کردی صحبت کن.", "If I won... / I would... / I'd also..."),
            SpeakingTask("Discuss money habits with a partner.", "درباره عادات مالی با یک دوست صحبت کن.", "I usually... / I try to save... / I spend too much on..."),
            SpeakingTask("Talk about your financial goals.", "درباره اهداف مالی‌ات صحبت کن.", "I wish I could... / If I had..., I'd... / I'm saving for...")
        ),
        writing = listOf(
            WritingTask("Write about your dream life.", "درباره زندگی رویایی‌ات بنویس.", 140, "Use second conditional and 'I wish'.")
        )
    )

    // FILE 10 — Unsolved mysteries | معماهای حل‌نشده
    private fun file10() = base(
        10, "Unsolved mysteries", "معماهای حل‌نشده",
        listOf(
            "Use modals of deduction: might, may, could, must, can't",
            "Talk about mysteries and unsolved cases",
            "Discuss theories and evidence",
            "Express speculation and certainty"
        ),
        listOf(
            v("mystery", "معما", "It's still a mystery today.", "هنوز معمایی است."),
            v("evidence", "شواهد", "There's no evidence for that theory.", "شواهدی برای آن نظریه نیست."),
            v("theory", "نظریه", "There are many theories about it.", "نظریه‌های زیادی درباره‌اش وجود دارد."),
            v("disappear", "ناپدید شدن", "The ship disappeared in 1872.", "کشتی در سال ۱۸۷۲ ناپدید شد."),
            v("vanish", "محو شدن", "They vanished without a trace.", "بدون ردی محو شدند.", "verb"),
            v("trace", "رد", "There was no trace of them.", "ردی از آن‌ها نبود."),
            v("investigate", "بررسی کردن", "The police investigated for years.", "پلیس سال‌ها بررسی کرد.", "verb"),
            v("explanation", "توضیح", "Scientists have no explanation.", "دانشمندان توضیحی ندارند."),
            v("witness", "شاهد", "No witnesses came forward.", "هیچ شاهی پیش نیامد."),
            v("clue", "سرنخ", "The only clue was a letter.", "تنها سرنخ یک نامه بود."),
            v("unsolved", "حل‌نشده", "It remains unsolved.", "حل‌نشده باقی مانده.", "adjective"),
            v("creepy", "ترسناک", "That story is so creepy.", "آن داستان خیلی ترسناک است.", "adjective"),
            v("fascinating", "جذاب", "It's a fascinating case.", "پرونده جذابی است.", "adjective"),
            v("puzzling", "گیج‌کننده", "The details are very puzzling.", "جزئیات خیلی گیج‌کننده هستند.", "adjective"),
            v("haunted", "جن‌زده", "People say the house is haunted.", "مردم می‌گویند خانه جن‌زده است.", "adjective")
        ),
        listOf(
            GrammarSection("Modals of deduction", "Use might/may/could for possibility. Use must for logical certainty. Use can't for impossibility. It might be a hoax. He must be tired. It can't be true."),
            GrammarSection("Present vs. past deduction", "Use modal + base verb for present. Use modal + have + past participle for past. She must be at work. She must have left already."),
            GrammarSection("Expressing certainty levels", "Must (very sure), might/may/could (possible), can't (impossible).")
        ),
        listOf(
            d("A", "Have you ever heard of the Mary Celeste mystery?", "تا حالا معمای ماری سلست را شنیده‌ای؟"),
            d("B", "Yes! The ship that was found empty in 1872. Right?", "بله! کشتی که در ۱۸۷۲ خالی پیدا شد. درست است؟"),
            d("A", "Exactly. It's one of the most famous unsolved mysteries.", "دقیقاً. یکی از معروف‌ترین معماهای حل‌نشده است."),
            d("B", "Was everyone on board missing?", "همه سرنشینان گم بودند؟"),
            d("A", "Yes. Ten people just vanished.", "بله. ده نفر محو شدند."),
            d("B", "Wow. Were there any signs of trouble?", "واو. نشانه‌ای از مشکل بود؟"),
            d("A", "No. No signs of violence or struggle. Everything was in perfect order.", "نه. نشانه‌ای از خشونت یا کشمکش نبود. همه چیز مرتب بود."),
            d("B", "That's so strange. What do experts think happened?", "خیلی عجیب است. کارشناسان فکر می‌کنند چه شد؟"),
            d("A", "There are many theories. Some say pirates attacked them.", "نظریه‌های زیادی هست. برخی می‌گویند دزدان دریایی حمله کردند."),
            d("B", "But wouldn't there be signs of a fight?", "ولی نشانه‌ای از درگیری نمی‌بود؟"),
            d("A", "Exactly. That's the problem with that theory. The ship was untouched.", "دقیقاً. مشکل آن نظریه همین است. کشتی دست‌نخورده بود."),
            d("B", "So what else could have happened?", "پس چه چیز دیگری ممکن است اتفاق افتاده باشد؟"),
            d("A", "Some think the crew got into a lifeboat and abandoned ship.", "برخی فکر می‌کنند خدمه سوار قایق نجات شدند و کشتی را رها کردند."),
            d("B", "Why would they do that?", "چرا این کار را می‌کردند؟"),
            d("A", "Maybe they thought the ship was sinking. But it wasn't.", "شاید فکر می‌کردند کشتی در حال غرق شدن است. ولی نبود."),
            d("B", "So they might have left for no reason?", "پس ممکن است بی‌دلیل رفته باشند؟"),
            d("A", "That's possible. But it doesn't explain everything.", "ممکن است. ولی همه چیز را توضیح نمی‌دهد."),
            d("B", "What about the food and water?", "غذا و آب چطور؟"),
            d("A", "Still on board. And there was plenty of it.", "هنوز روی کشتی بود. و به مقدار زیاد."),
            d("B", "That's even stranger. They must have left in a hurry.", "این حتی عجیب‌تر است. باید با عجله رفته باشند."),
            d("A", "Or they were forced to leave. We might never know.", "یا مجبور شدند بروند. ممکن است هرگز ندانیم."),
            d("B", "What's your theory?", "نظریه تو چیست؟"),
            d("A", "Honestly? I think a sudden storm or waterspout scared them.", "راستش؟ فکر می‌کنم طوفان یا گرداب ناگهانی ترساندشان."),
            d("B", "Waterspout?", "گرداب؟"),
            d("A", "It's like a tornado over water. It could have looked terrifying.", "مثل گردباد روی آب است. می‌توانست ترسناک به نظر برسد."),
            d("B", "And they panicked and got into the lifeboat?", "و وحشت کردند و سوار قایق نجات شدند؟"),
            d("A", "Exactly. But then the lifeboat sank or drifted away.", "دقیقاً. ولی آن موقع قایق نجات غرق شد یا دور افتاد."),
            d("B", "That's a plausible theory. But we can't prove it.", "نظریه محتملی است. ولی نمی‌توانیم اثباتش کنیم."),
            d("A", "No, we can't. That's why it's still a mystery.", "نه، نمی‌توانیم. برای همین هنوز معماست."),
            d("B", "Have you ever read about other unsolved mysteries?", "درباره معماهای حل‌نشده دیگری خوانده‌ای؟"),
            d("A", "Yes! I'm obsessed with them. There's this one about the Bermuda Triangle.", "بله! من به آن‌ها معتاد شده‌ام. یکی درباره مثلث برمودا هست."),
            d("B", "Oh, I've heard of that. Do you believe in it?", "اوه، شنیده‌ام. باورش داری؟"),
            d("A", "I'm skeptical. Most disappearances have logical explanations.", "شک‌گرا هستم. بیشتر ناپدید شدن‌ها توضیحات منطقی دارند."),
            d("B", "Like what?", "مثل چی؟"),
            d("A", "Bad weather, equipment failure, human error.", "هوای بد، خرابی تجهیزات، خطای انسانی."),
            d("B", "So you don't think there's anything supernatural?", "پس فکر نمی‌کنی چیز فراطبیعی هست؟"),
            d("A", "I don't know. Maybe. But there's no real evidence for it.", "نمی‌دانم. شاید. ولی شواهد واقعی برایش نیست."),
            d("B", "What about haunted houses? Do you believe in those?", "خانه‌های جن‌زده چطور؟ به آن‌ها باور داری؟"),
            d("A", "Not really. But I love the stories!", "نه واقعاً. ولی عاشق داستان‌هایشان هستم!"),
            d("B", "Me too. Have you ever visited a haunted place?", "من هم. تا حالا جای جن‌زده دیده‌ای؟"),
            d("A", "Yes! Once, in England. An old castle.", "بله! یک بار، در انگلستان. یک قلعه قدیمی."),
            d("B", "Did anything strange happen?", "چیز عجیبی اتفاق افتاد؟"),
            d("A", "Not really. But it was very creepy at night.", "نه واقعاً. ولی شب خیلی ترسناک بود."),
            d("B", "I can imagine. Would you go again?", "می‌توانم تصور کنم. دوباره می‌رفتی؟"),
            d("A", "Absolutely. The history is fascinating.", "قطعاً. تاریخش جذاب است."),
            d("B", "What's your favorite mystery?", "معمای مورد علاقه‌ات چیست؟"),
            d("A", "That's a hard question. Maybe the Dyatlov Pass incident.", "سؤال سختی است. شاید ماجرای گذرگاه دیاتلوف."),
            d("B", "I don't know that one. What happened?", "آن را نمی‌شناسم. چه شد؟"),
            d("A", "Nine hikers died in the Ural Mountains in 1959. Under mysterious circumstances.", "نه کوهنورد در کوه‌های اورال در ۱۹۵۹ مردند. تحت شرایط مرموز."),
            d("B", "What happened to them?", "چه اتفاقی برایشان افتاد؟"),
            d("A", "That's the mystery. Some had strange injuries. Their tent was cut open from inside.", "معما همین است. برخی آسیب‌های عجیبی داشتند. چادرشان از داخل بریده شده بود."),
            d("B", "They must have been terrified.", "باید وحشت‌زده بوده باشند."),
            d("A", "Definitely. They ran out into the freezing cold.", "قطعاً. به سرمای یخبندان بیرون دویدند."),
            d("B", "What do scientists think happened?", "دانشمندان فکر می‌کنند چه شد؟"),
            d("A", "Some say an avalanche. Others think it was a military test.", "برخی می‌گویند بهمن. دیگران فکر می‌کنند یک آزمایش نظامی بود."),
            d("B", "Which theory do you believe?", "کدام نظریه را باور داری؟"),
            d("A", "I'm not sure. But the avalanche theory makes the most sense.", "مطمئن نیستم. ولی نظریه بهمن منطقی‌تر است."),
            d("B", "Why do you think so?", "چرا اینطور فکر می‌کنی؟"),
            d("A", "Because the injuries match what an avalanche could cause.", "چون آسیب‌ها با آنچه بهمن می‌تواند ایجاد کند مطابقت دارند."),
            d("B", "But weren't there strange lights in the sky?", "ولی چراغ‌های عجیبی در آسمان نبود؟"),
            d("A", "Some witnesses reported them. But they might have been missiles or weather balloons.", "برخی شاهدان گزارش کردند. ولی ممکن است موشک یا بالون هواشناسی بوده باشند."),
            d("B", "So many theories. That's what makes it fascinating.", "نظریه‌های زیادی. همین جذابش می‌کند."),
            d("A", "Exactly. The truth might never be known.", "دقیقاً. ممکن است حقیقت هرگز دانسته نشود."),
            d("B", "Do you think any mysteries will ever be solved?", "فکر می‌کنی هیچ‌کدام از معماها حل شوند؟"),
            d("A", "Some, yes. With new technology, we're solving old cases all the time.", "برخی، بله. با تکنولوژی جدید، همیشه پرونده‌های قدیمی را حل می‌کنیم."),
            d("B", "Like with DNA evidence?", "مثل با شواهد DNA؟"),
            d("A", "Exactly. Cases from fifty years ago are being solved now.", "دقیقاً. پرونده‌های پنجاه سال پیش الان حل می‌شوند."),
            d("B", "So there's hope!", "پس امید هست!"),
            d("A", "Definitely. Well, I should go. But this was a fascinating conversation.", "قطعاً. خب، باید بروم. ولی مکالمه جذابی بود."),
            d("B", "It was. Let's continue it another time.", "بود. بیایید یک وقت دیگر ادامه‌اش دهیم."),
            d("A", "Deal. See you soon!", "قبول. به‌زودی می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("When was the Mary Celeste found empty?", listOf("1859", "1872", "1901", "1920"), 1),
            q("How many people vanished from the ship?", listOf("five", "seven", "ten", "twenty"), 2),
            q("What is A's theory about the Mary Celeste?", listOf("pirates", "a waterspout", "mutiny", "disease"), 1),
            q("How many hikers died at Dyatlov Pass?", listOf("five", "seven", "nine", "twelve"), 2),
            q("The crew ___ have left in a hurry.", listOf("must", "can't", "mustn't", "shouldn't"), 0),
            q("It ___ be true. There's no evidence.", listOf("must", "might", "can't", "could"), 2),
            q("They ___ have been terrified.", listOf("must", "can't", "should", "would"), 0),
            q("It ___ be a hoax. But we can't be sure.", listOf("must", "might", "can't", "should"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Without a trace", "بدون ردی", "They vanished without a trace.", "بدون ردی محو شدند."),
            IdiomExpression("Skeptical", "شک‌گرا", "I'm skeptical about that.", "درباره‌اش شک‌گرا هستم."),
            IdiomExpression("Makes sense", "منطقی بودن", "That theory makes sense.", "آن نظریه منطقی است."),
            IdiomExpression("Under mysterious circumstances", "تحت شرایط مرموز", "They died under mysterious circumstances.", "تحت شرایط مرموز مردند.")
        ),
        phrasal = listOf(
            PhrasalVerb("come forward", "پیش آمدن", "offer information",
                "No witnesses came forward.", "هیچ شاهی پیش نیامد.", "No"),
            PhrasalVerb("look into", "بررسی کردن", "investigate",
                "The police looked into the case.", "پلیس پرونده را بررسی کرد.", "No"),
            PhrasalVerb("make up", "ساختن / جعل کردن", "invent",
                "He made up the whole story.", "او کل داستان را جعل کرد.", "Yes"),
            PhrasalVerb("figure out", "فهمیدن", "understand",
                "We might never figure out what happened.", "ممکن است هرگز نفهمیم چه شد.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Modal stress", "Stress the modal for emphasis: It MUST be true. It CAN'T be true."),
            PronunciationTip("'Must have' reduction", "'Must have' is often reduced to 'must've': /mʌstəv/."),
            PronunciationTip("Speculation intonation", "Rising intonation shows uncertainty: It might be true? ↗")
        ),
        culture = listOf(
            CulturalNote("Famous mysteries", "Unsolved mysteries fascinate people worldwide."),
            CulturalNote("Scientific approach", "Modern investigations use forensic science, DNA analysis, and digital tools."),
            CulturalNote("Supernatural beliefs", "Beliefs in the supernatural vary widely across cultures.")
        ),
        mistakes = listOf(
            CommonMistake("He must to be tired.", "He must be tired.", "After 'must', use base verb without 'to'."),
            CommonMistake("She might be left already.", "She might have left already.", "Use 'might have + past participle' for past."),
            CommonMistake("It can be true.", "It can't be true.", "'Can' isn't used for deduction; use 'can't' for impossibility."),
            CommonMistake("They must left in a hurry.", "They must have left in a hurry.", "Use 'must have + past participle' for past deduction.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is the mystery of the Mary Celeste?", "A ship found abandoned in 1872 with no trace of the ten crew members."),
            ComprehensionQuestion("What are the main theories about the Dyatlov Pass incident?", "Avalanche, military test, or mysterious lights in the sky."),
            ComprehensionQuestion("What is A's view on solving mysteries?", "New technology like DNA evidence is solving old cases all the time.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a mystery you find fascinating.", "درباره معمایی که برایت جذاب است صحبت کن.", "It's about... / Some say... / It might be..."),
            SpeakingTask("Give your theory about an unsolved case.", "نظریه‌ات درباره یک پرونده حل‌نشده بده.", "I think... / It could be... / They must have..."),
            SpeakingTask("Talk about whether you believe in the supernatural.", "درباره اینکه آیا به فراطبیعی باور داری صحبت کن.", "I'm skeptical... / I believe... / There's no evidence...")
        ),
        writing = listOf(
            WritingTask("Write about a mystery that interests you.", "درباره معمایی که برایت جالب است بنویس.", 140, "Use modals of deduction: must, might, could, can't.")
        )
    )

    // FILE 11 — Books and reading | کتاب‌ها و خواندن
    private fun file11() = base(
        11, "Books and reading", "کتاب‌ها و خواندن",
        listOf(
            "Use defining and non-defining relative clauses",
            "Talk about books and reading habits",
            "Describe authors and their works",
            "Discuss the impact of reading"
        ),
        listOf(
            v("novel", "رمان", "Her novel won a literary prize.", "رمانش جایزه ادبی برد."),
            v("author", "نویسنده", "The author lives in Dublin.", "نویسنده در دوبلین زندگی می‌کند."),
            v("genre", "ژانر", "What genre do you enjoy most?", "کدام ژانر را بیشتر لذت می‌بری؟"),
            v("fiction", "داستان", "I mostly read fiction.", "بیشتر داستان می‌خوانم."),
            v("non-fiction", "غیرداستانی", "Non-fiction books teach you facts.", "کتاب‌های غیرداستانی به تو حقایق می‌آموزند."),
            v("bestseller", "پرفروش", "It was a bestseller for months.", "ماه‌ها پرفروش بود."),
            v("plot", "خط داستانی", "The plot kept me guessing.", "خط داستانی مرا حدس‌زن نگه داشت."),
            v("character", "شخصیت", "The main character felt real.", "شخصیت اصلی واقعی حس می‌شد."),
            v("memoir", "خاطرات‌نامه", "His memoir was deeply personal.", "خاطرات‌نامه‌اش خیلی شخصی بود."),
            v("recommend", "توصیه کردن", "I highly recommend this book.", "این کتاب را شدیداً توصیه می‌کنم.", "verb"),
            v("plot twist", "پیچش داستانی", "The plot twist surprised me.", "پیچش داستانی غافلگیرم کرد."),
            v("fascinating", "جذاب", "It's a fascinating story.", "داستان جذابی است.", "adjective"),
            v("moving", "تأثیرگذار", "The ending was very moving.", "پایان خیلی تأثیرگذار بود.", "adjective"),
            v("gripping", "پرکشش", "The novel was absolutely gripping.", "رمان کاملاً پرکشش بود.", "adjective"),
            v("predictable", "قابل پیش‌بینی", "The story was too predictable.", "داستان خیلی قابل پیش‌بینی بود.", "adjective")
        ),
        listOf(
            GrammarSection("Defining relative clauses", "Give essential information about a noun. Use who, which, that, where, whose. The book that I read was excellent."),
            GrammarSection("Non-defining relative clauses", "Add extra information with commas. Use who, which, where, whose (not 'that'). My friend, who lives in Paris, is a writer."),
            GrammarSection("Relative pronouns as objects", "The relative pronoun can be omitted in defining clauses when it's the object. The book (that) I read was great.")
        ),
        listOf(
            d("A", "I just finished the most amazing book.", "تازه شگفت‌انگیزترین کتاب را تمام کردم."),
            d("B", "Oh, what was it?", "اوه، چه بود؟"),
            d("A", "It's a novel called 'The Kite Runner'. Have you read it?", "رمانی به نام «بادبادک‌باز» است. خوانده‌ای؟"),
            d("B", "Yes! I read it years ago. Khaled Hosseini, right?", "بله! سال‌ها پیش خواندم. خالد حسینی، درست است؟"),
            d("A", "Exactly. He's an author who writes beautifully.", "دقیقاً. نویسنده‌ای است که زیبا می‌نویسد."),
            d("B", "What did you think of it?", "چه فکری درباره‌اش کردی؟"),
            d("A", "It was so moving that I cried at the end.", "آنقدر تأثیرگذار بود که آخرش گریه کردم."),
            d("B", "I remember feeling the same way. The friendship between the two boys was so powerful.", "یادم می‌آید همین حس را داشتم. دوستی بین آن دو پسر خیلی قدرتمند بود."),
            d("A", "Yes. And the character who suffered the most was also the bravest.", "بله. و شخصیتی که بیشترین رنج را کشید، شجاع‌ترین هم بود."),
            d("B", "Definitely. Have you read his other books?", "قطعاً. کتاب‌های دیگرش را خوانده‌ای؟"),
            d("A", "I've read 'A Thousand Splendid Suns', which is also incredible.", "«هزار خورشید تابان» را خوانده‌ام، که آن هم باورنکردنی است."),
            d("B", "I haven't read that one yet. What's it about?", "آن را هنوز نخوانده‌ام. درباره چیست؟"),
            d("A", "It's about two women in Afghanistan whose lives become connected.", "درباره دو زن در افغانستان است که زندگی‌هایشان به هم گره می‌خورد."),
            d("B", "Sounds powerful. I'll add it to my list.", "قدرتمند به نظر می‌رسد. به لیستم اضافه می‌کنم."),
            d("A", "You should. What kind of books do you usually read?", "باید بکنی. معمولاً چه نوع کتابی می‌خوانی؟"),
            d("B", "Mostly literary fiction. But I also enjoy a good mystery.", "بیشتر داستان ادبی. ولی معمای خوب هم لذت می‌برم."),
            d("A", "Who's your favorite author?", "نویسنده مورد علاقه‌ات کیست؟"),
            d("B", "That's hard. Maybe Haruki Murakami, whose books are always strange and beautiful.", "سخت است. شاید هاروکی موراکامی، که کتاب‌هایش همیشه عجیب و زیبا هستند."),
            d("A", "I've heard of him. What's his most famous book?", "شنیده‌ام. معروف‌ترین کتابش چیست؟"),
            d("B", "Probably 'Norwegian Wood'. It's a love story that's also very sad.", "احتمالاً «جنگل نروژی». داستان عاشقانه‌ای است که خیلی غمگین هم هست."),
            d("A", "Sounds interesting. Is it difficult to read?", "جالب به نظر می‌رسد. خواندنش سخت است؟"),
            d("B", "Not really. His writing is simple, which makes it accessible.", "نه واقعاً. نوشته‌اش ساده است، که آن را قابل دسترس می‌کند."),
            d("A", "Good to know. Do you ever read non-fiction?", "خوب است بدانم. غیرداستانی هم می‌خوانی؟"),
            d("B", "Sometimes. I read a lot of history books, which help me understand the world.", "گاهی. کتاب‌های تاریخی زیادی می‌خوانم، که به من کمک می‌کنند دنیا را بفهمم."),
            d("A", "What's the last history book you read?", "آخرین کتاب تاریخی که خواندی چیست؟"),
            d("B", "One about World War II. It was fascinating but also very sad.", "یکی درباره جنگ جهانی دوم. جذاب بود ولی خیلی غمگین هم بود."),
            d("A", "I can imagine. Do you prefer physical books or e-books?", "می‌توانم تصور کنم. کتاب فیزیکی ترجیح می‌دهی یا الکترونیکی؟"),
            d("B", "Physical books. There's something special about holding a real book.", "کتاب فیزیکی. چیزی خاص در نگه داشتن یک کتاب واقعی هست."),
            d("A", "I agree. But e-books are so convenient for travel.", "موافقم. ولی کتاب‌های الکترونیکی برای سفر خیلی راحت هستند."),
            d("B", "True. I use an e-reader when I travel. But at home, it's paper.", "درست. وقتی سفر می‌کنم از کتابخوان الکترونیکی استفاده می‌کنم. ولی در خانه، کاغذی."),
            d("A", "That's a good balance. Do you read every day?", "تعادل خوبی است. هر روز می‌خوانی؟"),
            d("B", "Almost. Usually at least thirty minutes before bed.", "تقریباً. معمولاً حداقل سی دقیقه قبل از خواب."),
            d("A", "That's a great habit. I should read more.", "عادت عالی‌ای است. باید بیشتر بخوانم."),
            d("B", "You should. Reading reduces stress and improves focus.", "باید بخوانی. خواندن استرس را کم می‌کند و تمرکز را بهبود می‌بخشد."),
            d("A", "I believe that. But sometimes I can't find books that interest me.", "باور دارم. ولی گاهی کتاب‌هایی که برایم جالب باشند پیدا نمی‌کنم."),
            d("B", "What genres do you like?", "چه ژانرهایی دوست داری؟"),
            d("A", "I like science fiction, especially stories that explore the future.", "علمی-تخیلی دوست دارم، مخصوصاً داستان‌هایی که آینده را بررسی می‌کنند."),
            d("B", "Have you read 'Dune'? It's a classic science fiction novel.", "«تل‌ماسه» را خوانده‌ای؟ رمان کلاسیک علمی-تخیلی است."),
            d("A", "No, but I've heard of it. Is it good?", "نه، ولی شنیده‌ام. خوب است؟"),
            d("B", "Amazing. It's set on a desert planet where a rare spice is found.", "شگفت‌انگیز. در سیاره‌ای بیابانی می‌گذرد که در آن ادویه‌ای کمیاب پیدا می‌شود."),
            d("A", "That sounds fascinating. I'll check it out.", "جذاب به نظر می‌رسد. بررسی می‌کنم."),
            d("B", "You won't regret it. It's a book that changes how you think.", "پشیمان نمی‌شوی. کتابی است که نحوه فکر کردنت را تغییر می‌دهد."),
            d("A", "Do you belong to a book club?", "عضو باشگاه کتاب هستی؟"),
            d("B", "Yes! We meet once a month to discuss a book.", "بله! ماهی یک بار برای بحث درباره یک کتاب دور هم جمع می‌شویم."),
            d("A", "That sounds fun. What are you reading now?", "سرگرم‌کننده به نظر می‌رسد. الان چه می‌خوانید؟"),
            d("B", "A mystery novel by Agatha Christie, who's a classic mystery writer.", "یک رمان معمایی از آگاتا کریستی، که نویسنده معمایی کلاسیک است."),
            d("A", "I love Agatha Christie! 'Murder on the Orient Express' is my favorite.", "عاشق آگاتا کریستی‌ام! «قتل در قطار سریع‌السیر شرق» مورد علاقه من است."),
            d("B", "Mine too! The plot twist at the end is brilliant.", "مال من هم! پیچش داستانی پایانش درخشان است."),
            d("A", "Agreed. She's an author whose books never get old.", "موافقم. نویسنده‌ای است که کتاب‌هایش هرگز قدیمی نمی‌شوند."),
            d("B", "Exactly. Well, I should go. I have a book to finish!", "دقیقاً. خب، باید بروم. کتابی دارم که تمام کنم!"),
            d("A", "Ha! Enjoy it. Let me know how it ends.", "ها! لذت ببر. بگو چطور تمام شد."),
            d("B", "I will! See you soon.", "می‌گویم! به‌زودی می‌بینمت."),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What book did A just finish?", listOf("A Thousand Splendid Suns", "The Kite Runner", "Norwegian Wood", "Dune"), 1),
            q("Who is B's favorite author?", listOf("Khaled Hosseini", "Agatha Christie", "Haruki Murakami", "Stephen King"), 2),
            q("How often does B read?", listOf("every day for an hour", "at least 30 minutes before bed", "only on weekends", "once a week"), 1),
            q("What is B's book club reading now?", listOf("science fiction", "Agatha Christie mystery", "history book", "memoir"), 1),
            q("The book ___ I read was excellent.", listOf("who", "which", "whose", "where"), 1),
            q("My friend, ___ lives in Paris, is a writer.", listOf("that", "which", "who", "whose"), 2),
            q("The author ___ book won the prize is famous.", listOf("who", "which", "whose", "that"), 2),
            q("The city ___ she grew up is small.", listOf("which", "that", "where", "who"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Check it out", "بررسی کردن", "I'll check it out.", "بررسی می‌کنم."),
            IdiomExpression("Never get old", "هرگز قدیمی نشدن", "Her books never get old.", "کتاب‌هایش هرگز قدیمی نمی‌شوند."),
            IdiomExpression("Reduces stress", "استرس را کم می‌کند", "Reading reduces stress.", "خواندن استرس را کم می‌کند."),
            IdiomExpression("A good balance", "تعادل خوب", "That's a good balance.", "تعادل خوبی است.")
        ),
        phrasal = listOf(
            PhrasalVerb("check out", "بررسی کردن", "look at",
                "I'll check out that book.", "آن کتاب را بررسی می‌کنم.", "Yes"),
            PhrasalVerb("get into", "علاقه‌مند شدن", "become interested",
                "I got into science fiction last year.", "سال گذشته به علمی-تخیلی علاقه‌مند شدم.", "No"),
            PhrasalVerb("pick up", "برداشتن", "start reading",
                "I picked up a great novel at the airport.", "یک رمان عالی در فرودگاه برداشتم.", "Yes"),
            PhrasalVerb("put down", "زمین گذاشتن", "stop reading",
                "I couldn't put it down.", "نمی‌توانستم زمینش بگذارم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Relative clause pause", "Non-defining clauses have a pause: My friend, / who lives in Paris, / is a writer."),
            PronunciationTip("'Whose' pronunciation", "'Whose' /huːz/ — same sound as 'who's'."),
            PronunciationTip("Reduction in relative clauses", "In natural speech, 'that' is often reduced or dropped.")
        ),
        culture = listOf(
            CulturalNote("Reading habits", "Reading habits vary globally. In some countries, reading is a daily ritual."),
            CulturalNote("Book clubs", "Book clubs are popular in many English-speaking countries."),
            CulturalNote("E-books vs. print", "The rise of e-books has changed reading habits, but many readers still prefer physical books.")
        ),
        mistakes = listOf(
            CommonMistake("The man which I met was kind.", "The man who I met was kind.", "Use 'who' for people, not 'which'."),
            CommonMistake("My friend, that lives in Paris...", "My friend, who lives in Paris...", "Use 'who' (not 'that') in non-defining clauses."),
            CommonMistake("The book who I read...", "The book that/which I read...", "Use 'that' or 'which' for things."),
            CommonMistake("The author which book I love...", "The author whose book I love...", "Use 'whose' for possession.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does A like about 'The Kite Runner'?", "It was so moving that A cried at the end."),
            ComprehensionQuestion("What kind of books does B read and why?", "Literary fiction, mysteries, and history books, which help B understand the world."),
            ComprehensionQuestion("What is B's reading habit?", "Reads at least 30 minutes before bed almost every day and prefers physical books at home.")
        ),
        speaking = listOf(
            SpeakingTask("Recommend a book to a partner.", "یک کتاب به یک دوست توصیه کن.", "You should read... / It's about... / It's so...that..."),
            SpeakingTask("Discuss your reading habits.", "درباره عادات خواندنت صحبت کن.", "I usually read... / I prefer... / My favorite genre is..."),
            SpeakingTask("Talk about an author you admire.", "درباره نویسنده‌ای که تحسین می‌کنی صحبت کن.", "The author who... / His/Her books... / I admire him/her because...")
        ),
        writing = listOf(
            WritingTask("Write a book review.", "نقد یک کتاب بنویس.", 140, "Use defining and non-defining relative clauses.")
        )
    )

    // FILE 12 — The future | آینده
    private fun file12() = base(
        12, "The future", "آینده",
        listOf(
            "Use future perfect and future continuous",
            "Use future time clauses (when, as soon as, before, until)",
            "Talk about predictions and future scenarios",
            "Discuss technology and society"
        ),
        listOf(
            v("prediction", "پیش‌بینی", "Predictions about the future are risky.", "پیش‌بینی‌ها درباره آینده پرخطر هستند."),
            v("technology", "تکنولوژی", "Technology is changing rapidly.", "تکنولوژی سریع تغییر می‌کند."),
            v("artificial intelligence", "هوش مصنوعی", "Artificial intelligence will change everything.", "هوش مصنوعی همه چیز را تغییر خواهد داد."),
            v("automation", "خودکارسازی", "Automation is replacing many jobs.", "خودکارسازی جایگزین شغل‌های زیادی می‌شود."),
            v("renewable energy", "انرژی تجدیدپذیر", "Renewable energy is the future.", "انرژی تجدیدپذیر آینده است."),
            v("climate change", "تغییرات اقلیمی", "Climate change affects all of us.", "تغییرات اقلیمی بر همه ما تأثیر می‌گذارد."),
            v("space exploration", "کاوش فضایی", "Space exploration is expanding.", "کاوش فضایی در حال گسترش است."),
            v("global", "جهانی", "We live in a global economy.", "ما در یک اقتصاد جهانی زندگی می‌کنیم.", "adjective"),
            v("sustainable", "پایدار", "Sustainable living is essential.", "زندگی پایدار ضروری است.", "adjective"),
            v("virtual", "مجازی", "Virtual reality is becoming more common.", "واقعیت مجازی رایج‌تر می‌شود.", "adjective"),
            v("remote", "دور", "Remote work is the new normal.", "کار از راه دور عادی جدید است.", "adjective"),
            v("innovative", "نوآورانه", "Their solutions are truly innovative.", "راه‌حل‌هایشان واقعاً نوآورانه هستند.", "adjective"),
            v("impact", "تأثیر", "The impact will be huge.", "تأثیرش عظیم خواهد بود."),
            v("adapt", "انطباق پیدا کردن", "We must adapt to changes.", "باید با تغییرات انطباق پیدا کنیم.", "verb"),
            v("inevitable", "ناگزیر", "Change is inevitable.", "تغییر ناگزیر است.", "adjective")
        ),
        listOf(
            GrammarSection("Future perfect", "Use will have + past participle for actions completed before a future time. By 2030, I will have finished my studies."),
            GrammarSection("Future continuous", "Use will be + verb-ing for actions in progress at a future time. This time next year, I'll be working abroad."),
            GrammarSection("Future time clauses", "Use present simple after when, as soon as, before, after, until. I'll call you when I arrive."),
            GrammarSection("Combining future forms", "Use future perfect and future continuous together for complex future scenarios.")
        ),
        listOf(
            d("A", "Where do you see yourself in ten years?", "ده سال دیگر خودت را کجا می‌بینی؟"),
            d("B", "That's a big question. Let me think for a moment.", "سؤال بزرگی است. بگذار یک لحظه فکر کنم."),
            d("A", "Take your time.", "عجله نکن."),
            d("B", "Okay. By 2035, I will have finished my PhD.", "باشه. تا سال ۲۰۳۵، دکترایم را تمام کرده‌ام."),
            d("A", "PhD? I didn't know you wanted to do a PhD.", "دکترا؟ نمی‌دانستم دکترا می‌خواهی بخوانی."),
            d("B", "I do. In neuroscience. I've been planning it for years.", "می‌خواهم. در علوم اعصاب. سال‌هاست برنامه‌ریزی می‌کنم."),
            d("A", "That's exciting. And after that?", "هیجان‌انگیز است. و بعد از آن؟"),
            d("B", "By 2040, I'll have started my own research lab.", "تا سال ۲۰۴۰، آزمایشگاه تحقیقاتی خودم را راه‌اندازی کرده‌ام."),
            d("A", "Wow. You have it all planned out!", "واو. همه چیز را برنامه‌ریزی کرده‌ای!"),
            d("B", "Ha! Sort of. What about you?", "ها! تا حدی. تو چطور؟"),
            d("A", "Honestly, I don't have such a clear plan.", "راستش، چنین برنامه واضحی ندارم."),
            d("B", "That's okay. Not everyone does.", "اشکالی ندارد. همه ندارند."),
            d("A", "Where do I see myself? I hope to be happy and healthy.", "خودم را کجا می‌بینم؟ امیدوارم خوشحال و سالم باشم."),
            d("B", "Those are great goals. Any professional plans?", "اهداف عالی‌ای هستند. برنامه حرفه‌ای داری؟"),
            d("A", "By 2030, I will have been working in my field for fifteen years.", "تا سال ۲۰۳۰، پانزده سال در حوزه‌ام کار کرده‌ام."),
            d("B", "And do you want to stay in the same field?", "و می‌خواهی در همان حوزه بمانی؟"),
            d("A", "I think so. But I might switch to something more meaningful.", "فکر می‌کنم بله. ولی شاید به چیزی معنادارتر تغییر دهم."),
            d("B", "Like what?", "مثل چی؟"),
            d("A", "Maybe teaching. I love explaining things.", "شاید تدریس. عاشق توضیح دادن هستم."),
            d("B", "You'd be a great teacher. What about family?", "معلم عالی‌ای می‌شوی. خانواده چطور؟"),
            d("A", "This time next year, I'll probably be planning a wedding.", "این موقع سال آینده، احتمالاً دارم عروسی برنامه‌ریزی می‌کنم."),
            d("B", "Wait, you're engaged?", "صبر کن، نامزد کرده‌ای؟"),
            d("A", "Yes! I proposed last month.", "بله! ماه گذشته خواستگاری کردم."),
            d("B", "That's wonderful! Congratulations!", "فوق‌العاده است! تبریک می‌گویم!"),
            d("A", "Thanks. We haven't set a date yet.", "ممنون. هنوز تاریخ تعیین نکرده‌ایم."),
            d("B", "Will you have a big wedding?", "عروسی بزرگی خواهید داشت؟"),
            d("A", "Small, I think. Just family and close friends.", "فکر می‌کنم کوچک. فقط خانواده و دوستان نزدیک."),
            d("B", "That sounds lovely. What about kids?", "زیبا به نظر می‌رسد. بچه چطور؟"),
            d("A", "By 2040, I'll probably have two kids.", "تا سال ۲۰۴۰، احتمالاً دو بچه خواهم داشت."),
            d("B", "That's a nice picture.", "تصویر قشنگی است."),
            d("A", "Thanks. What about the world in general? How do you see it?", "ممنون. خود دنیا چطور؟ چطور می‌بینی؟"),
            d("B", "That's even harder to predict. But I think technology will have changed everything.", "این حتی سخت‌تر است. ولی فکر می‌کنم تکنولوژی همه چیز را تغییر داده است."),
            d("A", "In good ways or bad?", "به روش‌های خوب یا بد؟"),
            d("B", "Both. Artificial intelligence will have replaced many jobs.", "هر دو. هوش مصنوعی جایگزین شغل‌های زیادی شده است."),
            d("A", "That's concerning.", "نگران‌کننده است."),
            d("B", "Yes. But it will also have created new ones. Jobs we can't imagine yet.", "بله. ولی همچنین شغل‌های جدیدی ایجاد کرده. شغل‌هایی که هنوز نمی‌توانیم تصورشان کنیم."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Maybe AI ethicists, virtual reality architects, or space tour guides.", "شاید اخلاق‌شناسان هوش مصنوعی، معماران واقعیت مجازی، یا راهنمایان تور فضایی."),
            d("A", "Space tour guide! That would be amazing.", "راهنمای تور فضایی! شگفت‌انگیز می‌شود."),
            d("B", "By 2050, space tourism will probably be a real industry.", "تا سال ۲۰۵۰، گردشگری فضایی احتمالاً صنعت واقعی خواهد بود."),
            d("A", "Would you go to space?", "به فضا می‌رفتی؟"),
            d("B", "In a heartbeat. Wouldn't you?", "بلافاصله. تو نه؟"),
            d("A", "I'm not sure. It seems scary.", "مطمئن نیستم. ترسناک به نظر می‌رسد."),
            d("B", "Ha! That's fair. It would definitely be intense.", "ها! منصفانه است. قطعاً شدید می‌شود."),
            d("A", "What about climate change?", "تغییرات اقلیمی چطور؟"),
            d("B", "That's the big worry. By 2050, we will have either solved it or...", "این نگرانی اصلی است. تا سال ۲۰۵۰، یا حلش کرده‌ایم یا..."),
            d("A", "Or what?", "یا چی؟"),
            d("B", "Or we'll be facing a very different world.", "یا با دنیای خیلی متفاوتی روبرو خواهیم شد."),
            d("A", "That's scary.", "ترسناک است."),
            d("B", "But there's hope. Renewable energy is growing fast.", "ولی امید هست. انرژی تجدیدپذیر سریع رشد می‌کند."),
            d("A", "True. I've installed solar panels on my house.", "درست. پنل‌های خورشیدی در خانه‌ام نصب کرده‌ام."),
            d("B", "Really? That's great!", "واقعاً؟ عالیه!"),
            d("A", "It saves money and helps the planet.", "پول ذخیره می‌کند و به سیاره کمک می‌کند."),
            d("B", "By 2030, most homes will have solar panels.", "تا سال ۲۰۳۰، بیشتر خانه‌ها پنل خورشیدی خواهند داشت."),
            d("A", "I hope so. What about work? Do you think remote work will continue?", "امیدوارم. کار چطور؟ فکر می‌کنی کار از راه دور ادامه خواهد داشت؟"),
            d("B", "Definitely. By 2030, more than half the workforce will be working remotely.", "قطعاً. تا سال ۲۰۳۰، بیش از نیمی از نیروی کار از راه دور کار خواهند کرد."),
            d("A", "That's a huge change.", "تغییر بزرگی است."),
            d("B", "It is. Cities might become very different.", "هست. شهرها ممکن است خیلی متفاوت شوند."),
            d("A", "In what way?", "به چه روشی؟"),
            d("B", "People will have moved away from expensive city centers.", "مردم از مراکز شهرهای گران نقل مکان کرده‌اند."),
            d("A", "And into smaller towns?", "به شهرهای کوچک‌تر؟"),
            d("B", "Exactly. It's already happening.", "دقیقاً. الان در حال اتفاق افتادن است."),
            d("A", "That might be good for small towns.", "این ممکن است برای شهرهای کوچک خوب باشد."),
            d("B", "It could be. And bad for big cities.", "ممکن است باشد. و برای شهرهای بزرگ بد."),
            d("A", "Trade-offs again.", "باز هم معامله‌ها."),
            d("B", "Always. There's no perfect future.", "همیشه. آینده کاملی وجود ندارد."),
            d("A", "Do you think we'll be happier?", "فکر می‌کنی خوشحال‌تر خواهیم بود؟"),
            d("B", "That's the big question. Technology doesn't automatically make us happier.", "سؤال بزرگ همین است. تکنولوژی خودکار ما را خوشحال‌تر نمی‌کند."),
            d("A", "I agree. It depends on how we use it.", "موافقم. به نحوه استفاده‌مان بستگی دارد."),
            d("B", "Exactly. And on what we value as a society.", "دقیقاً. و به آنچه به عنوان جامعه ارزش می‌گذاریم."),
            d("A", "That's a good point. Well, this has been fascinating.", "نکته خوبی است. خب، این جذاب بود."),
            d("B", "It has. Let's talk about it again in ten years!", "بود. بیایید ده سال دیگر دوباره درباره‌اش صحبت کنیم!"),
            d("A", "Ha! Deal. See you then.", "ها! قبول. تا اون موقع."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What will B have finished by 2035?", listOf("a master's degree", "a PhD", "a business", "a book"), 1),
            q("What might A switch to?", listOf("medicine", "law", "teaching", "engineering"), 2),
            q("What will A probably be doing this time next year?", listOf("moving abroad", "planning a wedding", "starting a business", "having a child"), 1),
            q("What will have changed most by 2050, according to B?", listOf("climate", "technology", "language", "food"), 1),
            q("By 2030, I ___ finished my studies.", listOf("will", "will have", "am", "have"), 1),
            q("This time next year, I ___ working abroad.", listOf("will", "will be", "am", "have"), 1),
            q("I'll call you when I ___.", listOf("will arrive", "arrive", "arrived", "am arriving"), 1),
            q("We'll leave as soon as she ___ ready.", listOf("is", "will be", "was", "will have been"), 0)
        ),
        idioms = listOf(
            IdiomExpression("See yourself", "خودت را تصور کردن", "Where do you see yourself in ten years?", "ده سال دیگر خودت را کجا می‌بینی؟"),
            IdiomExpression("Planned out", "برنامه‌ریزی شده", "You have it all planned out!", "همه چیز را برنامه‌ریزی کرده‌ای!"),
            IdiomExpression("In a heartbeat", "بلافاصله", "I'd go in a heartbeat.", "بلافاصله می‌رفتم."),
            IdiomExpression("Trade-offs", "معامله‌ها", "Trade-offs again.", "باز هم معامله‌ها.")
        ),
        phrasal = listOf(
            PhrasalVerb("switch to", "تغییر دادن به", "change to",
                "I might switch to teaching.", "شاید به تدریس تغییر دهم.", "No"),
            PhrasalVerb("move away", "دور شدن", "relocate",
                "People will have moved away from cities.", "مردم از شهرها دور شده‌اند.", "No"),
            PhrasalVerb("plan out", "برنامه‌ریزی کردن", "plan in detail",
                "She's planned out her whole career.", "کل حرفه‌اش را برنامه‌ریزی کرده.", "Yes"),
            PhrasalVerb("work out", "نتیجه دادن", "end successfully",
                "I hope everything works out.", "امیدوارم همه چیز نتیجه بدهد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Future perfect stress", "Stress 'will have' and the past participle: I'll have FINished by 2035."),
            PronunciationTip("Future continuous rhythm", "This time next year, I'll be WORKing abroad."),
            PronunciationTip("'Will' reduction", "In natural speech, 'will' contracts: I'll, she'll, they'll.")
        ),
        culture = listOf(
            CulturalNote("The future of work", "The nature of work is changing rapidly. Remote work, automation, and AI are reshaping industries."),
            CulturalNote("Climate action", "Climate change is one of the biggest challenges facing humanity."),
            CulturalNote("Technology and happiness", "Research shows that technology doesn't automatically make us happier.")
        ),
        mistakes = listOf(
            CommonMistake("By 2030, I will finish my studies.", "By 2030, I will have finished my studies.", "Use future perfect for actions completed before a future time."),
            CommonMistake("This time next year, I will work abroad.", "This time next year, I will be working abroad.", "Use future continuous for actions in progress at a future time."),
            CommonMistake("I'll call you when I will arrive.", "I'll call you when I arrive.", "Use present simple after 'when'."),
            CommonMistake("As soon as she will be ready, we'll leave.", "As soon as she's ready, we'll leave.", "Use present simple after 'as soon as'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are B's professional goals?", "By 2035, finish a PhD in neuroscience; by 2040, start a research lab."),
            ComprehensionQuestion("What does A predict about their personal life?", "Planning a wedding next year and probably having two kids by 2040."),
            ComprehensionQuestion("How does B feel about the future of technology?", "Both positive and negative — AI will replace jobs but also create new ones.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your plans and predictions for the future.", "درباره برنامه‌ها و پیش‌بینی‌های آینده‌ات صحبت کن.", "By 2030, I will have... / This time next year, I'll be..."),
            SpeakingTask("Discuss how technology will change society.", "درباره اینکه تکنولوژی چطور جامعه را تغییر خواهد داد صحبت کن.", "AI will... / By 2050, we will have... / I think..."),
            SpeakingTask("Talk about what you'll have accomplished in five years.", "درباره آنچه در پنج سال آینده به دست آورده‌ای صحبت کن.", "I'll have... / I'll probably be... / I hope to have...")
        ),
        writing = listOf(
            WritingTask("Write about your vision of the future.", "درباره تصورت از آینده بنویس.", 150, "Use future perfect, future continuous, and future time clauses.")
        )
    )
}