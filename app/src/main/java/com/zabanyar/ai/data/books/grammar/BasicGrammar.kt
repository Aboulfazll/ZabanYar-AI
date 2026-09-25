import com.zabanyar.ai.data.*

object BasicGrammar {

    const val BOOK_ID = "basic_grammar"

    fun getChapter(chapterNumber: Int): LessonContent {
        return when (chapterNumber) {
            1 -> chapter1_ToBe()
            2 -> chapter2_PresentSimple()
            3 -> chapter3_PresentContinuous()
            4 -> chapter4_PastSimple()
            5 -> chapter5_PastContinuous()
            6 -> chapter6_PresentPerfect()
            7 -> chapter7_FutureForms()
            8 -> chapter8_Modals()
            9 -> chapter9_Conditionals()
            10 -> chapter10_Passive()
            11 -> chapter11_ReportedSpeech()
            12 -> chapter12_Questions()
            13 -> chapter13_Review()
            else -> getDefaultContent(BOOK_ID, chapterNumber)
        }
    }

    // ============================================================
    // فصل ۱: Verb To Be (فعل بودن)
    // ============================================================
    private fun chapter1_ToBe(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Verb To Be",
            titlePersian = "فعل بودن (to be)",
            objectives = listOf(
                "یادگیری فعل to be در زمان حال",
                "ترتیب صحیح: I am → You are → He/She/It is → We are → They are",
                "معرفی خود و دیگران",
                "منفی کردن با فعل to be",
                "سوالی کردن با فعل to be"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "I am", persian = "من هستم",
                    pronunciation = "/aɪ æm/", partOfSpeech = "phrase",
                    example = "I am Ali. I am a student.",
                    examplePersian = "من علی هستم. من دانشجو هستم.",
                    synonyms = "I'm", usageTip = "برای اول شخص مفرد"
                ),
                VocabWord(
                    english = "You are", persian = "تو هستی / شما هستید",
                    pronunciation = "/juː ɑːr/", partOfSpeech = "phrase",
                    example = "You are my friend.",
                    examplePersian = "تو دوست من هستی.",
                    synonyms = "You're", usageTip = "برای دوم شخص مفرد و جمع"
                ),
                VocabWord(
                    english = "He is", persian = "او (مرد) هست",
                    pronunciation = "/hiː ɪz/", partOfSpeech = "phrase",
                    example = "He is my brother.",
                    examplePersian = "او برادر من است.",
                    synonyms = "He's", usageTip = "برای سوم شخص مفرد مذکر"
                ),
                VocabWord(
                    english = "She is", persian = "او (زن) هست",
                    pronunciation = "/ʃiː ɪz/", partOfSpeech = "phrase",
                    example = "She is my sister.",
                    examplePersian = "او خواهر من است.",
                    synonyms = "She's", usageTip = "برای سوم شخص مفرد مونث"
                ),
                VocabWord(
                    english = "It is", persian = "آن هست / این است",
                    pronunciation = "/ɪt ɪz/", partOfSpeech = "phrase",
                    example = "It is a book.",
                    examplePersian = "این یک کتاب است.",
                    synonyms = "It's", usageTip = "برای اشیاء و حیوانات"
                ),
                VocabWord(
                    english = "We are", persian = "ما هستیم",
                    pronunciation = "/wiː ɑːr/", partOfSpeech = "phrase",
                    example = "We are students.",
                    examplePersian = "ما دانشجو هستیم.",
                    synonyms = "We're", usageTip = "برای اول شخص جمع"
                ),
                VocabWord(
                    english = "They are", persian = "آن‌ها هستند",
                    pronunciation = "/ðeɪ ɑːr/", partOfSpeech = "phrase",
                    example = "They are my friends.",
                    examplePersian = "آن‌ها دوستان من هستند.",
                    synonyms = "They're", usageTip = "برای سوم شخص جمع"
                ),
                VocabWord(
                    english = "student", persian = "دانشجو",
                    pronunciation = "/ˈstjuːdənt/", partOfSpeech = "noun",
                    example = "I am a student.",
                    examplePersian = "من دانشجو هستم.",
                    usageTip = "با حرف تعریف a قبل از آن"
                ),
                VocabWord(
                    english = "teacher", persian = "معلم",
                    pronunciation = "/ˈtiːtʃər/", partOfSpeech = "noun",
                    example = "She is a teacher.",
                    examplePersian = "او معلم است.",
                    usageTip = "با حرف تعریف a"
                ),
                VocabWord(
                    english = "happy", persian = "خوشحال",
                    pronunciation = "/ˈhæpi/", partOfSpeech = "adjective",
                    example = "I am happy today.",
                    examplePersian = "من امروز خوشحالم.",
                    antonyms = "sad", usageTip = "صفت بدون a"
                ),
                VocabWord(
                    english = "from", persian = "از، اهلِ",
                    pronunciation = "/frʌm/", partOfSpeech = "preposition",
                    example = "I am from Iran.",
                    examplePersian = "من اهل ایرانم.",
                    usageTip = "برای گفتن ملیت"
                ),
                VocabWord(
                    english = "years old", persian = "سال سن داشتن",
                    pronunciation = "/jɪrz oʊld/", partOfSpeech = "phrase",
                    example = "I am 25 years old.",
                    examplePersian = "من ۲۵ سال دارم.",
                    usageTip = "برای گفتن سن"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "Pleased to meet you",
                    persian = "از آشنایی با شما خوشبختم",
                    example = "I'm pleased to meet you.",
                    examplePersian = "از آشنایی با شما خوشبختم.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "How are you?",
                    persian = "حالت چطور است؟",
                    example = "Hi! How are you?",
                    examplePersian = "سلام! حالت چطوره؟",
                    register = "neutral"
                )
            ),
            phrasalVerbs = emptyList(),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "کوتاه‌سازی (Contractions)",
                    content = "در گفتار طبیعی:\n• I am → I'm /aɪm/\n• You are → You're /jʊr/\n• He is → He's /hiːz/\n• She is → She's /ʃiːz/\n• It is → It's /ɪts/\n• We are → We're /wɪr/\n• They are → They're /ðer/"
                ),
                PronunciationTip(
                    title = "تلفظ I'm",
                    content = "I'm به صورت /aɪm/ تلفظ می‌شه، نه /aɪ æm/. مثال: I'm happy = /aɪm ˈhæpi/"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "تفاوت He و She",
                    content = "در انگلیسی برای اشاره به مرد از He و برای زن از She استفاده می‌شه. در فارسی هر دو «او» هستن. این تفاوت مهمه."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. ترتیب صحیح فعل To Be",
                    content = "ترتیب یادگیری:\n1️⃣ I am (من هستم)\n2️⃣ You are (تو هستی)\n3️⃣ He is / She is / It is (او/آن هست)\n4️⃣ We are (ما هستیم)\n5️⃣ They are (آن‌ها هستند)\n\nجدول کامل:\n| ضمیر | فعل | کوتاه‌شده |\n|------|-----|-----------|\n| I | am | I'm |\n| You | are | You're |\n| He | is | He's |\n| She | is | She's |\n| It | is | It's |\n| We | are | We're |\n| They | are | They're |"
                ),
                GrammarSection(
                    title = "2. I am",
                    content = "I am = من هستم\n\nمثال‌ها:\n• I am Ali. (من علی هستم)\n• I am a student. (من دانشجو هستم)\n• I am 25 years old. (من ۲۵ ساله هستم)\n• I am from Iran. (من اهل ایرانم)\n• I am happy. (من خوشحالم)\n\nکوتاه‌شده: I'm"
                ),
                GrammarSection(
                    title = "3. You are",
                    content = "You are = تو هستی / شما هستید\n\nمثال‌ها:\n• You are my friend. (تو دوست من هستی)\n• You are a good teacher. (تو معلم خوبی هستی)\n• You are from Canada. (تو اهل کانادایی)\n\nکوتاه‌شده: You're"
                ),
                GrammarSection(
                    title = "4. He is / She is / It is",
                    content = "He is = او (مرد) هست\nShe is = او (زن) هست\nIt is = آن هست (برای اشیاء)\n\nمثال‌ها:\n• He is my brother. (او برادر من است)\n• She is a doctor. (او دکتر است)\n• It is a cat. (این یک گربه است)\n\nکوتاه‌شده: He's / She's / It's"
                ),
                GrammarSection(
                    title = "5. We are",
                    content = "We are = ما هستیم\n\nمثال‌ها:\n• We are students. (ما دانشجو هستیم)\n• We are from Iran. (ما اهل ایرانیم)\n• We are a family. (ما یک خانواده هستیم)\n\nکوتاه‌شده: We're"
                ),
                GrammarSection(
                    title = "6. They are",
                    content = "They are = آن‌ها هستند\n\nمثال‌ها:\n• They are my friends. (آن‌ها دوستان من هستند)\n• They are from Canada. (آن‌ها اهل کانادا هستند)\n• They are happy. (آن‌ها خوشحال هستند)\n\nکوتاه‌شده: They're"
                ),
                GrammarSection(
                    title = "7. منفی کردن با To Be",
                    content = "ساختار: Subject + am/is/are + not\n\n• I am not tired. → I'm not tired.\n• You are not late. → You aren't late.\n• He is not here. → He isn't here.\n• She is not a doctor. → She isn't a doctor.\n• We are not ready. → We aren't ready.\n• They are not at home. → They aren't at home.\n\nنکته: am + not = am not (کوتاه‌شده نداره)"
                ),
                GrammarSection(
                    title = "8. سوالی کردن با To Be",
                    content = "ساختار: Am/Is/Are + Subject + ...?\n\n• Am I late? — Yes, you are. / No, you aren't.\n• Are you a student? — Yes, I am. / No, I'm not.\n• Is he from Iran? — Yes, he is. / No, he isn't.\n• Is she a teacher? — Yes, she is. / No, she isn't.\n• Are they at home? — Yes, they are. / No, they aren't."
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I is a student.",
                    correct = "I am a student.",
                    explanation = "برای I همیشه از am استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "You is my friend.",
                    correct = "You are my friend.",
                    explanation = "برای You از are استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "He are a teacher.",
                    correct = "He is a teacher.",
                    explanation = "برای He/She/It از is استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I am student.",
                    correct = "I am a student.",
                    explanation = "قبل از اسم مفرد، حرف تعریف a می‌آید."
                ),
                CommonMistake(
                    wrong = "I have 25 years.",
                    correct = "I am 25 years old.",
                    explanation = "برای گفتن سن از فعل to be استفاده می‌کنیم."
                )
            ),
            conversation = listOf(
                DialogueLine("Ali", "Hello! I am Ali. Nice to meet you.", "سلام! من علی هستم. از آشنایی با شما خوشبختم."),
                DialogueLine("Sara", "Hi Ali! I am Sara. Nice to meet you too.", "سلام علی! من سارا هستم. من هم از آشنایی خوشبختم."),
                DialogueLine("Ali", "Where are you from, Sara?", "اهل کجایی سارا؟"),
                DialogueLine("Sara", "I am from Canada. And you?", "من اهل کانادا هستم. تو چطور؟"),
                DialogueLine("Ali", "I am from Iran. I am a student here.", "من اهل ایران هستم. اینجا دانشجو هستم."),
                DialogueLine("Sara", "That's great! What are you studying?", "عالیه! چی می‌خونی؟"),
                DialogueLine("Ali", "I am studying computer science. And you?", "من علوم کامپیوتر می‌خونم. تو چطور؟"),
                DialogueLine("Sara", "I am a teacher. I teach English.", "من معلمم. انگلیسی درس می‌دم."),
                DialogueLine("Ali", "Nice! Is your family here?", "خوبه! خانواده‌ات اینجان؟"),
                DialogueLine("Sara", "No, they aren't. They are in Canada.", "نه، اینجا نیستن. اون‌ها در کانادا هستن."),
                DialogueLine("Ali", "My family is in Iran too.", "خانواده من هم در ایران هستن."),
                DialogueLine("Sara", "Are you happy here?", "اینجا خوشحالی؟"),
                DialogueLine("Ali", "Yes, I am. The people are very friendly.", "بله، خوشحالم. مردم خیلی مهربون هستن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Where is Sara from?", "She is from Canada."),
                ComprehensionQuestion("What is Ali studying?", "He is studying computer science."),
                ComprehensionQuestion("Is Sara a teacher?", "Yes, she is."),
                ComprehensionQuestion("Is Ali happy here?", "Yes, he is.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Introduce yourself using 'I am'.",
                    promptPersian = "خودت را با I am معرفی کن.",
                    hints = "I am (name). I am (age). I am from (city)."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write 10 sentences about yourself using 'to be'.",
                    promptPersian = "۱۰ جمله درباره خودت با فعل to be بنویس.",
                    wordCount = 50,
                    hints = "name, age, country, job, feelings, family"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ a student.", listOf("am", "is", "are", "be"), 0),
                QuizQuestion("Complete: She ___ a doctor.", listOf("am", "is", "are", "be"), 1),
                QuizQuestion("Complete: They ___ my friends.", listOf("am", "is", "are", "be"), 2),
                QuizQuestion("Complete: We ___ from Iran.", listOf("am", "is", "are", "be"), 2),
                QuizQuestion("Short form of 'I am':", listOf("Im", "I'm", "I-am", "Iis"), 1),
                QuizQuestion("Complete: ___ you a teacher?", listOf("Am", "Is", "Are", "Be"), 2),
                QuizQuestion("Negative form of 'She is':", listOf("She not is", "She isn't", "She aren't", "She am not"), 1),
                QuizQuestion("Complete: It ___ a book.", listOf("am", "is", "are", "be"), 1)
            )
        )
    }

    // ============================================================
    // فصل ۲: Present Simple (حال ساده)
    // ============================================================
    private fun chapter2_PresentSimple(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Present Simple",
            titlePersian = "زمان حال ساده",
            objectives = listOf(
                "استفاده از حال ساده برای عادت‌ها و حقایق",
                "ساخت جملات مثبت، منفی و سوالی",
                "قانون -s سوم شخص مفرد",
                "استفاده از قیدهای تکرار (always, usually, sometimes)"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "always", persian = "همیشه",
                    pronunciation = "/ˈɔːlweɪz/", partOfSpeech = "adverb",
                    example = "I always drink coffee in the morning.",
                    examplePersian = "همیشه صبح‌ها قهوه می‌نوشم.",
                    antonyms = "never", usageTip = "قبل از فعل اصلی، بعد از be"
                ),
                VocabWord(
                    english = "usually", persian = "معمولاً",
                    pronunciation = "/ˈjuːʒuəli/", partOfSpeech = "adverb",
                    example = "She usually walks to work.",
                    examplePersian = "او معمولاً پیاده سر کار می‌رود.",
                    synonyms = "normally", antonyms = "rarely", usageTip = "قید تکرار"
                ),
                VocabWord(
                    english = "sometimes", persian = "گاهی اوقات",
                    pronunciation = "/ˈsʌmtaɪmz/", partOfSpeech = "adverb",
                    example = "I sometimes go to the gym.",
                    examplePersian = "گاهی به باشگاه می‌روم.",
                    synonyms = "occasionally", usageTip = "قید تکرار"
                ),
                VocabWord(
                    english = "never", persian = "هرگز",
                    pronunciation = "/ˈnevər/", partOfSpeech = "adverb",
                    example = "I never smoke.",
                    examplePersian = "هرگز سیگار نمی‌کشم.",
                    antonyms = "always", usageTip = "جمله را منفی می‌کند"
                ),
                VocabWord(
                    english = "every day", persian = "هر روز",
                    pronunciation = "/ˈevri deɪ/", partOfSpeech = "time expression",
                    example = "I study English every day.",
                    examplePersian = "هر روز انگلیسی می‌خوانم.",
                    usageTip = "با حال ساده"
                ),
                VocabWord(
                    english = "habit", persian = "عادت",
                    pronunciation = "/ˈhæbɪt/", partOfSpeech = "noun",
                    example = "Brushing my teeth is a daily habit.",
                    examplePersian = "مسواک زدن یک عادت روزانه است.",
                    usageTip = "با حال ساده"
                ),
                VocabWord(
                    english = "routine", persian = "روتین",
                    pronunciation = "/ruːˈtiːn/", partOfSpeech = "noun",
                    example = "My morning routine starts at 7 AM.",
                    examplePersian = "برنامه صبحگاهی من ساعت ۷ شروع می‌شود.",
                    usageTip = "با حال ساده"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "as a rule",
                    persian = "به‌طور معمول",
                    example = "As a rule, I don't drink coffee after 6 PM.",
                    examplePersian = "به‌طور معمول، بعد از ساعت ۶ عصر قهوه نمی‌نوشم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "nine times out of ten",
                    persian = "اغلب اوقات",
                    example = "Nine times out of ten, she is right.",
                    examplePersian = "اغلب اوقات، حق با اوست.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "wake up", meaning = "بیدار شدن",
                    persian = "بیدار شدن",
                    example = "I wake up at 6 AM every morning.",
                    examplePersian = "هر روز صبح ساعت ۶ بیدار می‌شوم."
                ),
                PhrasalVerb(
                    verb = "get up", meaning = "از تخت بلند شدن",
                    persian = "بلند شدن",
                    example = "She gets up early on weekdays.",
                    examplePersian = "او روزهای هفته زود بلند می‌شود."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Third-person -s",
                    content = "در سوم شخص مفرد، -s سه تلفظ دارد:\n• /s/: works, likes\n• /z/: plays, reads\n• /ɪz/: watches, washes"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Small talk about routines",
                    content = "پرسیدن درباره برنامه روزانه یکی از راه‌های طبیعی شروع مکالمه است."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. ساختار حال ساده",
                    content = "برای عادت‌ها، حقایق، برنامه‌های منظم.\n\nمثبت:\nSubject + Base Verb (I/you/we/they)\nSubject + Verb+s/es (he/she/it)\n\n• I work every day.\n• She works at a hospital.\n\nمنفی:\nSubject + don't/doesn't + Base Verb\n\n• I don't work on Fridays.\n• She doesn't work on Fridays.\n\nسوالی:\nDo/Does + Subject + Base Verb?\n\n• Do you work here?\n• Does she work here?"
                ),
                GrammarSection(
                    title = "2. قانون سوم شخص مفرد",
                    content = "برای he/she/it، فعل تغییر می‌کند:\n\n• اکثر افعال: +s\n   work → works, play → plays\n\n• -s, -sh, -ch, -x, -o: +es\n   go → goes, watch → watches\n\n• consonant + y: y → ies\n   study → studies, carry → carries\n\n• vowel + y: +s\n   play → plays\n\nبی‌قاعده:\n   have → has, be → is, do → does"
                ),
                GrammarSection(
                    title = "3. قیدهای تکرار",
                    content = "به ترتیب فراوانی:\nalways (100%) > usually (90%) > often (70%) > sometimes (50%) > rarely (10%) > never (0%)\n\nموقعیت:\n• قبل از فعل اصلی: I always drink tea.\n• بعد از فعل be: I am always tired.\n• در سوالات: Do you always walk?"
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "She work every day.",
                    correct = "She works every day.",
                    explanation = "در سوم شخص مفرد، فعل -s می‌گیرد."
                ),
                CommonMistake(
                    wrong = "He doesn't works here.",
                    correct = "He doesn't work here.",
                    explanation = "بعد از doesn't، فعل ساده می‌آید."
                ),
                CommonMistake(
                    wrong = "Do she study English?",
                    correct = "Does she study English?",
                    explanation = "برای he/she/it از Does استفاده می‌کنیم."
                )
            ),
            conversation = listOf(
                DialogueLine("Sara", "What time do you usually wake up?", "معمولاً چه ساعتی بیدار می‌شوی؟"),
                DialogueLine("Alex", "I usually wake up at 6:30. What about you?", "معمولاً ساعت ۶:۳۰. تو چطور؟"),
                DialogueLine("Sara", "I wake up at 7. I'm not a morning person.", "من ساعت ۷. آدم صبح‌خیزی نیستم."),
                DialogueLine("Alex", "Really? I always feel energetic in the morning.", "واقعاً؟ همیشه صبح‌ها پرانرژی هستم."),
                DialogueLine("Sara", "Lucky you! Do you exercise before work?", "خوش به حالت! قبل از کار ورزش می‌کنی؟"),
                DialogueLine("Alex", "Yes, I usually go running for 30 minutes.", "بله، معمولاً ۳۰ دقیقه می‌دوم."),
                DialogueLine("Sara", "That's impressive. I never exercise in the morning.", "تحسین‌برانگیزه. هرگز صبح‌ها ورزش نمی‌کنم."),
                DialogueLine("Alex", "That's better than nothing.", "این بهتر از هیچیه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What time does Alex wake up?", "He wakes up at 6:30."),
                ComprehensionQuestion("Does Sara exercise in the morning?", "No, she never exercises in the morning."),
                ComprehensionQuestion("What does Alex do before work?", "He goes running for 30 minutes.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe your daily routine.",
                    promptPersian = "برنامه روزانه‌ات را توصیف کن.",
                    hints = "I usually wake up at..., I always have..., I sometimes..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your typical weekday (100 words).",
                    promptPersian = "درباره یک روز معمولی هفته‌ات بنویس (۱۰۰ کلمه).",
                    wordCount = 100,
                    hints = "Wake up time, morning activities, work/school, evening"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ at a hospital.", listOf("work", "works", "working", "is work"), 1),
                QuizQuestion("Complete: ___ she study English?", listOf("Do", "Does", "Is", "Are"), 1),
                QuizQuestion("Complete: I ___ go to the gym — once a year.", listOf("always", "usually", "sometimes", "hardly ever"), 3),
                QuizQuestion("Choose correct:", listOf("She go to school.", "She goes to school.", "She going to school.", "She is go to school."), 1),
                QuizQuestion("Complete: I ___ tired in the mornings.", listOf("always am", "am always", "always be", "be always"), 1)
            )
        )
    }

    // ============================================================
    // فصل ۳: Present Continuous (حال استمراری)
    // ============================================================
    private fun chapter3_PresentContinuous(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Present Continuous",
            titlePersian = "زمان حال استمراری",
            objectives = listOf(
                "استفاده از حال استمراری برای کارهای در حال انجام",
                "توصیف وضعیت‌های موقت",
                "بیان برنامه‌های آینده با حال استمراری",
                "تفاوت با حال ساده",
                "افعال حالتی (stative verbs)"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "currently", persian = "در حال حاضر",
                    pronunciation = "/ˈkɜːrəntli/", partOfSpeech = "adverb",
                    example = "I'm currently working on a new project.",
                    examplePersian = "در حال حاضر روی یک پروژه جدید کار می‌کنم.",
                    usageTip = "با حال استمراری"
                ),
                VocabWord(
                    english = "at the moment", persian = "در این لحظه",
                    pronunciation = "/æt ðə ˈmoʊmənt/", partOfSpeech = "time expression",
                    example = "She is busy at the moment.",
                    examplePersian = "در این لحظه مشغول است.",
                    usageTip = "عبارت کلیدی"
                ),
                VocabWord(
                    english = "temporary", persian = "موقت",
                    pronunciation = "/ˈtempəreri/", partOfSpeech = "adjective",
                    example = "This is just a temporary job.",
                    examplePersian = "این فقط یک کار موقت است.",
                    antonyms = "permanent", usageTip = "با حال استمراری"
                ),
                VocabWord(
                    english = "these days", persian = "این روزها",
                    pronunciation = "/ðiːz deɪz/", partOfSpeech = "time expression",
                    example = "These days, I'm learning Spanish.",
                    examplePersian = "این روزها دارم اسپانیایی یاد می‌گیرم.",
                    synonyms = "nowadays", usageTip = "برای روندهای فعلی"
                ),
                VocabWord(
                    english = "stative verb", persian = "فعل حالتی",
                    pronunciation = "/ˈsteɪtɪv vɜːrb/", partOfSpeech = "noun",
                    example = "Know, like, and want are stative verbs.",
                    examplePersian = "know، like و want افعال حالتی هستند.",
                    usageTip = "این افعال در استمراری نمی‌آیند"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in the middle of",
                    persian = "در میانه انجام کاری",
                    example = "I'm in the middle of a meeting.",
                    examplePersian = "در میانه یک جلسه هستم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "what's going on",
                    persian = "چه خبره",
                    example = "What's going on here?",
                    examplePersian = "اینجا چه خبره؟",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "work on", meaning = "کار کردن روی",
                    persian = "کار کردن روی",
                    example = "She is working on a new project.",
                    examplePersian = "دارد روی یک پروژه جدید کار می‌کند."
                ),
                PhrasalVerb(
                    verb = "look for", meaning = "جستجو کردن",
                    persian = "جستجو کردن",
                    example = "He is looking for his keys.",
                    examplePersian = "دارد دنبال کلیدهایش می‌گردد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Contractions with be",
                    content = "• I am → I'm /aɪm/\n• You are → You're /jʊr/\n• He is → He's /hiːz/\n• She is → She's /ʃiːz/\n• They are → They're /ðer/"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Future arrangements",
                    content = "قرارهای از قبل تعیین‌شده با حال استمراری بیان می‌شوند: 'I'm meeting Ali tomorrow.'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. ساختار حال استمراری",
                    content = "برای کارهایی که همین حالا در حال وقوع هستند.\n\nمثبت:\nSubject + am/is/are + verb-ing\n• I am working.\n• She is studying.\n• They are playing.\n\nمنفی:\nSubject + am/is/are + not + verb-ing\n• I'm not working.\n• He isn't studying.\n\nسوالی:\nAm/Is/Are + Subject + verb-ing?\n• Are you working?\n• Is she studying?"
                ),
                GrammarSection(
                    title = "2. املای -ing",
                    content = "• اکثر افعال: +ing\n   work → working\n\n• silent -e: حذف e + ing\n   make → making, write → writing\n\n• CVC: تکرار consonant + ing\n   run → running, sit → sitting\n\n• -ie → y + ing\n   lie → lying, die → dying"
                ),
                GrammarSection(
                    title = "3. کاربردها",
                    content = "1. کارهای در حال انجام:\n   I am writing an email right now.\n\n2. وضعیت‌های موقت:\n   She is staying with her parents this week.\n\n3. روندهای در حال تغییر:\n   Prices are going up.\n\n4. قرارهای آینده:\n   I'm meeting Ali tomorrow at 3."
                ),
                GrammarSection(
                    title = "4. حال ساده vs حال استمراری",
                    content = "| Present Simple | Present Continuous |\n|----------------|---------------------|\n| عادت | در حال انجام |\n| I work every day. | I'm working right now. |\n| always, usually | now, at the moment |"
                ),
                GrammarSection(
                    title = "5. افعال حالتی (Stative Verbs)",
                    content = "این افعال در استمراری نمی‌آیند:\n\n• فکری: know, believe, understand, remember\n• احساسی: like, love, hate, want, need\n• حسی: see, hear, smell, taste\n• مالکیت: have, own, belong\n\nمثال:\n❌ I am knowing him.\n✅ I know him."
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I am knowing him well.",
                    correct = "I know him well.",
                    explanation = "know فعل حالتی است."
                ),
                CommonMistake(
                    wrong = "He is haveing lunch.",
                    correct = "He is having lunch.",
                    explanation = "املای have: حذف e قبل از ing."
                ),
                CommonMistake(
                    wrong = "What you are doing?",
                    correct = "What are you doing?",
                    explanation = "در سوالات، فعل be قبل از فاعل."
                )
            ),
            conversation = listOf(
                DialogueLine("Emma", "Hi James! What are you doing?", "سلام جیمز! چه کار می‌کنی؟"),
                DialogueLine("James", "I'm studying for my exam tomorrow.", "دارم برای امتحان فردام درس می‌خوانم."),
                DialogueLine("Emma", "I'm just relaxing. I finished my project yesterday.", "من دارم استراحت می‌کنم. پروژه‌ام را دیروز تمام کردم."),
                DialogueLine("James", "Are you doing anything this weekend?", "این آخر هفته کار خاصی می‌کنی؟"),
                DialogueLine("Emma", "Yes, I'm visiting my parents on Saturday.", "بله، شنبه دارم می‌رم پدر و مادرم را ببینم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What is James doing?", "He is studying for his exam."),
                ComprehensionQuestion("What is Emma doing this weekend?", "She is visiting her parents.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe what your family members are doing right now.",
                    promptPersian = "توصیف کن اعضای خانواده‌ات در این لحظه چه کار می‌کنند.",
                    hints = "My mother is..., My father is..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about what you're doing these days (120 words).",
                    promptPersian = "درباره اینکه این روزها چه کار می‌کنی بنویس (۱۲۰ کلمه).",
                    wordCount = 120,
                    hints = "Personal activities, future arrangements, current trends"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ a book right now.", listOf("reads", "reading", "is reading", "read"), 2),
                QuizQuestion("Correct spelling:", listOf("runing", "running", "runnning", "runing"), 1),
                QuizQuestion("Which is a stative verb?", listOf("work", "play", "know", "walk"), 2),
                QuizQuestion("Complete: ___ you working?", listOf("Do", "Does", "Are", "Is"), 2),
                QuizQuestion("Complete: We ___ to Paris next week.", listOf("fly", "are flying", "flies", "flew"), 1)
            )
        )
    }

    // ============================================================
    // فصل ۴: Past Simple (گذشته ساده)
    // ============================================================
    private fun chapter4_PastSimple(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Past Simple",
            titlePersian = "زمان گذشته ساده",
            objectives = listOf(
                "صحبت درباره کارهای تمام‌شده در گذشته",
                "ساخت افعال باقاعده و بی‌قاعده",
                "استفاده از yesterday، last week، ago",
                "ساخت منفی و سوالی با did"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "yesterday", persian = "دیروز",
                    pronunciation = "/ˈjestərdeɪ/", partOfSpeech = "adverb",
                    example = "I saw her yesterday.",
                    examplePersian = "دیروز او را دیدم.",
                    usageTip = "با گذشته ساده"
                ),
                VocabWord(
                    english = "ago", persian = "پیش",
                    pronunciation = "/əˈɡoʊ/", partOfSpeech = "adverb",
                    example = "She left two hours ago.",
                    examplePersian = "او دو ساعت پیش رفت.",
                    usageTip = "بعد از عبارت زمانی"
                ),
                VocabWord(
                    english = "last night", persian = "دیشب",
                    pronunciation = "/læst naɪt/", partOfSpeech = "time expression",
                    example = "We watched a movie last night.",
                    examplePersian = "دیشب فیلم دیدیم.",
                    usageTip = "با گذشته ساده"
                ),
                VocabWord(
                    english = "regular verb", persian = "فعل باقاعده",
                    pronunciation = "/ˈreɡjələr vɜːrb/", partOfSpeech = "noun",
                    example = "Work is a regular verb.",
                    examplePersian = "work یک فعل باقاعده است.",
                    usageTip = "با -ed"
                ),
                VocabWord(
                    english = "irregular verb", persian = "فعل بی‌قاعده",
                    pronunciation = "/ɪˈreɡjələr vɜːrb/", partOfSpeech = "noun",
                    example = "Go is an irregular verb.",
                    examplePersian = "go یک فعل بی‌قاعده است.",
                    usageTip = "باید حفظ شود"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "once upon a time",
                    persian = "یکی بود یکی نبود",
                    example = "Once upon a time, there was a king.",
                    examplePersian = "یکی بود یکی نبود، پادشاهی بود.",
                    register = "literary"
                ),
                IdiomExpression(
                    english = "the other day",
                    persian = "چند روز پیش",
                    example = "I saw him the other day.",
                    examplePersian = "چند روز پیش او را دیدم.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "run into", meaning = "اتفاقی دیدن",
                    persian = "اتفاقی دیدن",
                    example = "I ran into an old friend yesterday.",
                    examplePersian = "دیروز اتفاقی یه دوست قدیمی را دیدم."
                ),
                PhrasalVerb(
                    verb = "find out", meaning = "فهمیدن",
                    persian = "فهمیدن",
                    example = "She found out the truth last week.",
                    examplePersian = "او هفته پیش حقیقت را فهمید."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "-ed endings",
                    content = "• /t/: worked, liked\n• /d/: played, lived\n• /ɪd/: wanted, needed"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Storytelling",
                    content = "زمان گذشته ساده اصلی‌ترین زمان برای روایت داستان است."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. ساختار گذشته ساده",
                    content = "مثبت:\nSubject + past verb\n• I worked yesterday.\n• She went to Paris.\n\nمنفی:\nSubject + didn't + Base Verb\n• I didn't work.\n• She didn't go.\n\nسوالی:\nDid + Subject + Base Verb?\n• Did you work?\n• Did she go?"
                ),
                GrammarSection(
                    title = "2. املای -ed",
                    content = "• اکثر افعال: +ed\n   work → worked\n\n• -e: +d\n   live → lived\n\n• consonant + y: y → ied\n   study → studied\n\n• CVC: تکرار consonant\n   stop → stopped"
                ),
                GrammarSection(
                    title = "3. افعال بی‌قاعده پرکاربرد",
                    content = "| Base | Past |\n|------|------|\n| be | was/were |\n| go | went |\n| have | had |\n| do | did |\n| see | saw |\n| make | made |\n| get | got |\n| take | took |\n| come | came |\n| know | knew |\n| say | said |\n| think | thought |"
                ),
                GrammarSection(
                    title = "4. Was / Were",
                    content = "• was: I, he, she, it\n• were: you, we, they\n\nمثال:\n• I was tired yesterday.\n• They were happy.\n\nمنفی:\n• I wasn't tired.\n• They weren't happy.\n\nسوالی:\n• Was she at home?\n• Were they happy?"
                ),
                GrammarSection(
                    title = "5. عبارات زمانی",
                    content = "• yesterday, last night/week/month\n• ago: two days ago\n• in + سال: in 1990\n• on + روز: on Monday\n• at + ساعت: at 3 PM"
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I didn't went there.",
                    correct = "I didn't go there.",
                    explanation = "بعد از didn't، فعل ساده."
                ),
                CommonMistake(
                    wrong = "Did you saw her?",
                    correct = "Did you see her?",
                    explanation = "بعد از did، فعل ساده."
                ),
                CommonMistake(
                    wrong = "I stoped at the store.",
                    correct = "I stopped at the store.",
                    explanation = "stop: تکرار p قبل از -ed."
                )
            ),
            conversation = listOf(
                DialogueLine("Maria", "How was your weekend?", "آخر هفته‌ات چطور بود؟"),
                DialogueLine("Tom", "It was great! I went to the mountains with friends.", "عالی بود! با دوستام رفتم کوه."),
                DialogueLine("Maria", "What did you do there?", "آنجا چه کار کردید؟"),
                DialogueLine("Tom", "We hiked for five hours and had a picnic.", "پنج ساعت پیاده‌روی کردیم و پیک‌نیک داشتیم."),
                DialogueLine("Maria", "Did you see any animals?", "حیوانی دیدید؟"),
                DialogueLine("Tom", "Yes, we saw some deer and a fox!", "بله، چند آهو و یه روباه دیدیم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Where did Tom go?", "He went to the mountains."),
                ComprehensionQuestion("What animals did they see?", "They saw deer and a fox.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about what you did last weekend.",
                    promptPersian = "درباره کارهایی که آخر هفته گذشته انجام دادی صحبت کن.",
                    hints = "I went..., I saw..., I met..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about a memorable day in your life (150 words).",
                    promptPersian = "درباره یک روز به‌یادماندنی در زندگی‌ات بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "When, where, what you did, how you felt"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ to the cinema yesterday.", listOf("go", "went", "goes", "going"), 1),
                QuizQuestion("Complete negative:", listOf("I didn't went.", "I didn't go.", "I don't went.", "I not went."), 1),
                QuizQuestion("Complete: ___ you see the movie?", listOf("Do", "Does", "Did", "Are"), 2),
                QuizQuestion("Past of 'study':", listOf("studyed", "studied", "studed", "studyd"), 1),
                QuizQuestion("Complete: She ___ at home last night.", listOf("was", "were", "is", "are"), 0)
            )
        )
    }

    // ============================================================
    // فصل ۵: Past Continuous (گذشته استمراری)
    // ============================================================
    private fun chapter5_PastContinuous(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Past Continuous",
            titlePersian = "زمان گذشته استمراری",
            objectives = listOf(
                "توصیف کارهای در حال انجام در گذشته",
                "استفاده با گذشته ساده",
                "درک when و while در روایت‌ها",
                "تشخیص کارهای قطع‌شده و پس‌زمینه"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "while", persian = "در حالی که",
                    pronunciation = "/waɪl/", partOfSpeech = "conjunction",
                    example = "While I was reading, the phone rang.",
                    examplePersian = "در حالی که کتاب می‌خواندم، تلفن زنگ زد.",
                    usageTip = "برای اعمال همزمان"
                ),
                VocabWord(
                    english = "when", persian = "وقتی که",
                    pronunciation = "/wen/", partOfSpeech = "conjunction",
                    example = "I was walking when I saw her.",
                    examplePersian = "داشتم راه می‌رفتم که او را دیدم.",
                    usageTip = "برای لحظه وقوع"
                ),
                VocabWord(
                    english = "suddenly", persian = "ناگهان",
                    pronunciation = "/ˈsʌdənli/", partOfSpeech = "adverb",
                    example = "Suddenly, the lights went out.",
                    examplePersian = "ناگهان چراغ‌ها خاموش شدند.",
                    synonyms = "all of a sudden", usageTip = "با گذشته استمراری"
                ),
                VocabWord(
                    english = "at that time", persian = "در آن زمان",
                    pronunciation = "/æt ðæt taɪm/", partOfSpeech = "time expression",
                    example = "At that time, I was working in London.",
                    examplePersian = "در آن زمان، در لندن کار می‌کردم.",
                    synonyms = "back then", usageTip = "با گذشته استمراری"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in the middle of",
                    persian = "در میانه کاری",
                    example = "I was in the middle of cooking when she called.",
                    examplePersian = "وقتی زنگ زد، در میانه آشپزی بودم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "out of the blue",
                    persian = "ناگهان",
                    example = "He called me out of the blue.",
                    examplePersian = "ناگهان بهم زنگ زد.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "carry on", meaning = "ادامه دادن",
                    persian = "ادامه دادن",
                    example = "She carried on working despite the noise.",
                    examplePersian = "با وجود سر و صدا به کار ادامه داد."
                ),
                PhrasalVerb(
                    verb = "turn up", meaning = "سر و کله پیدا کردن",
                    persian = "ظاهر شدن",
                    example = "He turned up while we were having dinner.",
                    examplePersian = "وقتی داشتیم شام می‌خوردیم سر و کله‌اش پیدا شد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Was/Were contractions",
                    content = "در گفتار، was/were ممکن است ضعیف تلفظ شوند."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Storytelling",
                    content = "ترکیب گذشته استمراری (پس‌زمینه) و گذشته ساده (رویداد) تکنیک اصلی روایت است."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. ساختار گذشته استمراری",
                    content = "مثبت:\nSubject + was/were + verb-ing\n• I was working.\n• They were playing.\n\nمنفی:\n• I wasn't working.\n• They weren't playing.\n\nسوالی:\n• Were you working?\n• Was she studying?"
                ),
                GrammarSection(
                    title = "2. Past Continuous vs Past Simple",
                    content = "گذشته استمراری — پس‌زمینه:\nI was walking home.\n\nگذشته ساده — رویداد:\nI saw an old friend.\n\nترکیب:\nI was walking home when I saw an old friend."
                ),
                GrammarSection(
                    title = "3. When و While",
                    content = "when — برای عمل کوتاه:\n• I was reading when the phone rang.\n\nwhile — برای دو عمل همزمان:\n• While I was reading, my sister was watching TV."
                ),
                GrammarSection(
                    title = "4. توصیف صحنه",
                    content = "• The sun was shining. Birds were singing. People were walking.\n\nدر این حالت، همه فعل‌ها استمراری هستند."
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I was work when you called.",
                    correct = "I was working when you called.",
                    explanation = "بعد از was/were باید verb+ing بیاید."
                ),
                CommonMistake(
                    wrong = "They was playing football.",
                    correct = "They were playing football.",
                    explanation = "با they از were استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "While I walked, I saw him.",
                    correct = "While I was walking, I saw him.",
                    explanation = "بعد از while معمولاً گذشته استمراری."
                )
            ),
            conversation = listOf(
                DialogueLine("Nina", "What were you doing when I called last night?", "دیشب وقتی بهت زنگ زدم چه کار می‌کردی؟"),
                DialogueLine("Omar", "I was cooking dinner. I didn't hear my phone.", "داشتم شام می‌پختم. صدای گوشیم را نشنیدم."),
                DialogueLine("Nina", "What were you making?", "چه غذایی درست می‌کردی؟"),
                DialogueLine("Omar", "I was making pasta. My sister was helping me.", "پاستا درست می‌کردم. خواهرم کمک می‌کرد.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What was Omar doing?", "He was cooking dinner."),
                ComprehensionQuestion("Was Omar cooking alone?", "No, his sister was helping him.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe what you were doing yesterday at 5 PM.",
                    promptPersian = "توصیف کن دیروز ساعت ۵ عصر چه کار می‌کردی.",
                    hints = "At 5 PM, I was..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about an interrupted action in the past (150 words).",
                    promptPersian = "درباره یک عمل قطع‌شده در گذشته بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "Set the scene, then interrupt with when"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ TV when she called.", listOf("watched", "was watching", "watch", "watches"), 1),
                QuizQuestion("Complete: They ___ football at 5 PM.", listOf("played", "were playing", "play", "plays"), 1),
                QuizQuestion("Complete: While I ___, I saw him.", listOf("walked", "walk", "was walking", "walks"), 2),
                QuizQuestion("Complete: She ___ cook when I arrived.", listOf("is", "was", "were", "am"), 1),
                QuizQuestion("Complete: What ___ you doing at 8 PM?", listOf("was", "were", "did", "do"), 1)
            )
        )
    }

    // ============================================================
    // فصل ۶: Present Perfect (حال کامل)
    // ============================================================
    private fun chapter6_PresentPerfect(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Present Perfect",
            titlePersian = "زمان حال کامل",
            objectives = listOf(
                "استفاده از حال کامل برای تجربه‌ها",
                "تفاوت با گذشته ساده",
                "استفاده از for و since",
                "استفاده از ever, never, already, yet, just"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "experience", persian = "تجربه",
                    pronunciation = "/ɪkˈspɪəriəns/", partOfSpeech = "noun",
                    example = "I've had many interesting experiences.",
                    examplePersian = "تجربه‌های جالب زیادی داشته‌ام.",
                    usageTip = "با حال کامل"
                ),
                VocabWord(
                    english = "since", persian = "از",
                    pronunciation = "/sɪns/", partOfSpeech = "preposition",
                    example = "I've lived here since 2015.",
                    examplePersian = "از سال ۲۰۱۵ اینجا زندگی می‌کنم.",
                    usageTip = "برای نقطه شروع"
                ),
                VocabWord(
                    english = "for", persian = "برای، به مدت",
                    pronunciation = "/fɔːr/", partOfSpeech = "preposition",
                    example = "I've known her for ten years.",
                    examplePersian = "ده سال است او را می‌شناسم.",
                    usageTip = "برای مدت زمان"
                ),
                VocabWord(
                    english = "already", persian = "قبلاً",
                    pronunciation = "/ɔːlˈredi/", partOfSpeech = "adverb",
                    example = "I've already finished.",
                    examplePersian = "قبلاً تمام کرده‌ام.",
                    usageTip = "در جملات مثبت"
                ),
                VocabWord(
                    english = "yet", persian = "هنوز",
                    pronunciation = "/jet/", partOfSpeech = "adverb",
                    example = "Have you finished yet?",
                    examplePersian = "هنوز تمام کرده‌ای؟",
                    usageTip = "در سوالات و منفی"
                ),
                VocabWord(
                    english = "ever", persian = "تا حالا",
                    pronunciation = "/ˈevər/", partOfSpeech = "adverb",
                    example = "Have you ever been to Japan?",
                    examplePersian = "تا حالا ژاپن بوده‌ای؟",
                    usageTip = "در سوالات تجربه"
                ),
                VocabWord(
                    english = "never", persian = "هرگز",
                    pronunciation = "/ˈnevər/", partOfSpeech = "adverb",
                    example = "I've never eaten sushi.",
                    examplePersian = "هرگز سوشی نخورده‌ام.",
                    usageTip = "در تجربه‌ها"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "been there, done that",
                    persian = "قبلاً تجربه‌اش را داشته‌ام",
                    example = "Been there, done that.",
                    examplePersian = "قبلاً تجربه‌اش را داشته‌ام.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "the first time",
                    persian = "اولین بار",
                    example = "This is the first time I've been to London.",
                    examplePersian = "این اولین بار است که به لندن آمده‌ام.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "be to", meaning = "رفتن به",
                    persian = "رفتن به",
                    example = "Have you ever been to Japan?",
                    examplePersian = "تا حالا ژاپن بوده‌ای؟"
                ),
                PhrasalVerb(
                    verb = "come across", meaning = "اتفاقی پیدا کردن",
                    persian = "اتفاقی پیدا کردن",
                    example = "I've come across some great books.",
                    examplePersian = "چند کتاب عالی اتفاقی پیدا کرده‌ام."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Contractions with have/has",
                    content = "• I have → I've /aɪv/\n• You have → You've /juːv/\n• He has → He's /hiːz/\n• She has → She's /ʃiːz/"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Present perfect in conversation",
                    content = "بومی‌زبانان در مکالمات روزمره اغلب از حال کامل برای تجربه‌ها استفاده می‌کنند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. ساختار حال کامل",
                    content = "مثبت:\nSubject + have/has + past participle\n• I have visited Paris.\n• She has finished.\n\nمنفی:\n• I haven't been there.\n• She hasn't called.\n\nسوالی:\n• Have you ever been abroad?\n• Has she finished?"
                ),
                GrammarSection(
                    title = "2. Present Perfect vs Past Simple",
                    content = "Present Perfect — زمان نامشخص:\nI have visited Paris. (تجربه)\n\nPast Simple — زمان مشخص:\nI visited Paris in 2020.\n\nکلمات کلیدی:\n• Present Perfect: ever, never, already, yet, since, for\n• Past Simple: yesterday, last week, ago, in 2010"
                ),
                GrammarSection(
                    title = "3. For و Since",
                    content = "for + مدت:\n• I've lived here for 5 years.\n\nsince + نقطه شروع:\n• I've lived here since 2018."
                ),
                GrammarSection(
                    title = "4. Ever, Never, Already, Yet, Just",
                    content = "ever — تا حالا (سوال):\n• Have you ever been to London?\n\nnever — هرگز (خبری منفی):\n• I've never been to Japan.\n\nalready — قبلاً (مثبت):\n• I've already finished.\n\nyet — هنوز (سوال/منفی):\n• Have you finished yet?\n\njust — همین حالا:\n• I've just arrived."
                ),
                GrammarSection(
                    title = "5. Past Participles",
                    content = "Regular: -ed\n• work → worked\n\nIrregular:\n| Base | Past Participle |\n|------|-----------------|\n| be | been |\n| go | gone |\n| do | done |\n| see | seen |\n| take | taken |\n| write | written |\n| eat | eaten |\n| speak | spoken |"
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I have seen him yesterday.",
                    correct = "I saw him yesterday.",
                    explanation = "با زمان مشخص گذشته، از گذشته ساده."
                ),
                CommonMistake(
                    wrong = "I have went to Paris.",
                    correct = "I have gone to Paris.",
                    explanation = "past participle صحیح go، gone است."
                ),
                CommonMistake(
                    wrong = "I've lived here since five years.",
                    correct = "I've lived here for five years.",
                    explanation = "برای مدت از for."
                )
            ),
            conversation = listOf(
                DialogueLine("Rita", "Have you ever been abroad?", "تا حالا خارج از کشور بوده‌ای؟"),
                DialogueLine("Kian", "Yes, I have. I've been to Turkey twice.", "بله. دو بار ترکیه بوده‌ام."),
                DialogueLine("Rita", "When did you go?", "کِی رفتی؟"),
                DialogueLine("Kian", "I went last summer and two years before that.", "تابستان گذشته و دو سال قبل."),
                DialogueLine("Rita", "Have you ever tried Turkish coffee?", "تا حالا قهوه ترکی امتحان کرده‌ای؟"),
                DialogueLine("Kian", "Yes, I have. It's very strong but delicious.", "بله. خیلی قویه ولی خوشمزه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("How many times has Kian been to Turkey?", "He has been twice."),
                ComprehensionQuestion("Has Kian tried Turkish coffee?", "Yes, he has.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your travel experiences.",
                    promptPersian = "درباره تجربه‌های سفرت صحبت کن.",
                    hints = "I've been to..., I've never been to..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your life experiences (150 words).",
                    promptPersian = "درباره تجربه‌های زندگی‌ات بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "Travel, achievements, skills, recent changes"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ never been to Paris.", listOf("have", "has", "am", "was"), 0),
                QuizQuestion("Complete: She ___ lived here since 2018.", listOf("have", "has", "is", "was"), 1),
                QuizQuestion("Complete: I've lived here ___ five years.", listOf("since", "for", "in", "at"), 1),
                QuizQuestion("Complete: Have you finished ___?", listOf("already", "yet", "just", "ever"), 1),
                QuizQuestion("Past participle of 'eat':", listOf("ate", "eaten", "eating", "eats"), 1)
            )
        )
    }

    // ============================================================
    // فصل ۷: Future Forms (آینده)
    // ============================================================
    private fun chapter7_FutureForms(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Future Forms",
            titlePersian = "زمان‌های آینده",
            objectives = listOf(
                "استفاده از will برای پیش‌بینی و قول",
                "استفاده از going to برای برنامه",
                "استفاده از حال استمراری برای قرارها",
                "تفاوت will و going to"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "prediction", persian = "پیش‌بینی",
                    pronunciation = "/prɪˈdɪkʃən/", partOfSpeech = "noun",
                    example = "My prediction is that it will rain.",
                    examplePersian = "پیش‌بینی من باران است.",
                    usageTip = "با will"
                ),
                VocabWord(
                    english = "intention", persian = "قصد",
                    pronunciation = "/ɪnˈtenʃən/", partOfSpeech = "noun",
                    example = "My intention is to study abroad.",
                    examplePersian = "قصد من تحصیل در خارج است.",
                    usageTip = "با going to"
                ),
                VocabWord(
                    english = "arrangement", persian = "قرار",
                    pronunciation = "/əˈreɪndʒmənt/", partOfSpeech = "noun",
                    example = "I have an arrangement to meet her.",
                    examplePersian = "قرار ملاقات با او دارم.",
                    usageTip = "با حال استمراری"
                ),
                VocabWord(
                    english = "soon", persian = "به‌زودی",
                    pronunciation = "/suːn/", partOfSpeech = "adverb",
                    example = "I'll see you soon.",
                    examplePersian = "به‌زودی می‌بینمت.",
                    antonyms = "later", usageTip = "با will"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in the near future",
                    persian = "در آینده نزدیک",
                    example = "We'll visit you in the near future.",
                    examplePersian = "در آینده نزدیک به دیدنت می‌آییم.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "look forward to", meaning = "بی‌صبرانه منتظر بودن",
                    persian = "بی‌صبرانه منتظر بودن",
                    example = "I'm looking forward to the party.",
                    examplePersian = "بی‌صبرانه منتظر مهمانی هستم."
                ),
                PhrasalVerb(
                    verb = "put off", meaning = "به تعویق انداختن",
                    persian = "به تعویق انداختن",
                    example = "We'll put off the meeting until next week.",
                    examplePersian = "جلسه را به هفته بعد موکول می‌کنیم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Will contraction",
                    content = "• I will → I'll /aɪl/\n• You will → You'll /juːl/\n• He will → He'll /hiːl/"
                ),
                PronunciationTip(
                    title = "Going to → gonna",
                    content = "در گفتار سریع: I'm gonna, She's gonna"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "New Year's resolutions",
                    content = "در فرهنگ غربی، ابتدای سال جدید فرصتی برای برنامه‌ریزی است."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Will",
                    content = "ساختار: will + base verb\n\n• I will call you tomorrow.\n• She will help us.\n\nمنفی: won't\n• I won't be late.\n\nسوالی: Will + Subject + verb?\n• Will you help me?\n\nکاربردها:\n1. پیش‌بینی: I think it will rain.\n2. تصمیم لحظه‌ای: I'll have coffee.\n3. قول: I'll help you."
                ),
                GrammarSection(
                    title = "2. Going To",
                    content = "ساختار: am/is/are + going to + base verb\n\n• I am going to travel to Japan.\n• She is going to study medicine.\n\nمنفی: I'm not going to give up.\n\nسوالی: Are you going to come?\n\nکاربردها:\n1. قصد از قبل: I'm going to study abroad.\n2. پیش‌بینی بر اساس شواهد: Look at those clouds! It's going to rain."
                ),
                GrammarSection(
                    title = "3. Will vs Going To",
                    content = "| Will | Going To |\n|------|----------|\n| پیش‌بینی بر اساس نظر | پیش‌بینی بر اساس شواهد |\n| I think it will rain. | Look at clouds — it's going to rain. |\n| تصمیم لحظه‌ای | برنامه از قبل |\n| قول و وعده | قصد و نیت |"
                ),
                GrammarSection(
                    title = "4. حال استمراری برای آینده",
                    content = "برای قرارهای قطعی:\n\n• I'm meeting Ali tomorrow at 3.\n• We're flying to Paris next week.\n• She's having dinner tonight."
                ),
                GrammarSection(
                    title = "5. حال ساده برای برنامه‌های زمان‌بندی‌شده",
                    content = "• The train leaves at 8 AM.\n• The movie starts at 7 PM.\n• The class begins next Monday."
                ),
                GrammarSection(
                    title = "6. Future Time Clauses",
                    content = "بعد از when, if, before, after, until → حال ساده:\n\n❌ When I will arrive...\n✅ When I arrive, I'll call you.\n\n❌ If it will rain...\n✅ If it rains, we'll stay home."
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I will to call you.",
                    correct = "I will call you.",
                    explanation = "بعد از will، فعل ساده بدون to."
                ),
                CommonMistake(
                    wrong = "When I will arrive, I'll call.",
                    correct = "When I arrive, I'll call.",
                    explanation = "بعد از when در آینده، حال ساده."
                ),
                CommonMistake(
                    wrong = "If it will rain, we'll stay.",
                    correct = "If it rains, we'll stay.",
                    explanation = "بعد از if در شرطی، حال ساده."
                )
            ),
            conversation = listOf(
                DialogueLine("Lena", "What are you going to do this summer?", "تابستان امسال چیکار می‌خواهی بکنی؟"),
                DialogueLine("Kian", "I'm going to travel to Italy with my family.", "می‌خواهم با خانواده‌ام به ایتالیا سفر کنم."),
                DialogueLine("Lena", "When are you leaving?", "کِی می‌روید؟"),
                DialogueLine("Kian", "We're flying on July 15th.", "۱۵ جولای پرواز می‌کنیم."),
                DialogueLine("Lena", "How long are you staying?", "چقدر می‌مانید؟"),
                DialogueLine("Kian", "We're staying for two weeks.", "دو هفته می‌مانیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What is Kian going to do?", "He is going to travel to Italy."),
                ComprehensionQuestion("When are they flying?", "On July 15th.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your plans for the next month.",
                    promptPersian = "درباره برنامه‌هایت برای ماه آینده صحبت کن.",
                    hints = "I'm going to..., I'm planning to..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your plans for the next year (150 words).",
                    promptPersian = "درباره برنامه‌هایت برای سال آینده بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "Travel, career, personal development"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: Look at clouds! It ___ rain.", listOf("will", "is going to", "is", "does"), 1),
                QuizQuestion("Complete: I ___ help you.", listOf("will", "am going", "do", "have"), 0),
                QuizQuestion("Complete: When I ___ home, I'll call you.", listOf("will get", "get", "got", "am get"), 1),
                QuizQuestion("Complete: If it ___, we'll stay home.", listOf("will rain", "rains", "rained", "raining"), 1),
                QuizQuestion("Complete: I ___ meeting Ali tomorrow.", listOf("am", "will", "do", "have"), 0)
            )
        )
    }

    // ============================================================
    // فصل ۸: Modal Verbs (افعال وجهی)
    // ============================================================
    private fun chapter8_Modals(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Modal Verbs",
            titlePersian = "افعال کمکی وجهی",
            objectives = listOf(
                "استفاده از can, could, may, might",
                "استفاده از must, have to, should",
                "بیان اجازه، توانایی، احتمال",
                "افعال وجهی کامل (modal perfects)"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "ability", persian = "توانایی",
                    pronunciation = "/əˈbɪləti/", partOfSpeech = "noun",
                    example = "She has the ability to speak three languages.",
                    examplePersian = "او توانایی صحبت به سه زبان را دارد.",
                    usageTip = "با can/could"
                ),
                VocabWord(
                    english = "obligation", persian = "الزام",
                    pronunciation = "/ˌɑːblɪˈɡeɪʃən/", partOfSpeech = "noun",
                    example = "Paying taxes is an obligation.",
                    examplePersian = "پرداخت مالیات یک الزام است.",
                    usageTip = "با must/have to"
                ),
                VocabWord(
                    english = "possibility", persian = "احتمال",
                    pronunciation = "/ˌpɑːsəˈbɪləti/", partOfSpeech = "noun",
                    example = "There's a possibility of rain.",
                    examplePersian = "احتمال باران وجود دارد.",
                    usageTip = "با may/might/could"
                ),
                VocabWord(
                    english = "advice", persian = "توصیه",
                    pronunciation = "/ədˈvaɪs/", partOfSpeech = "noun",
                    example = "Let me give you some advice.",
                    examplePersian = "بگذار توصیه‌ای بکنم.",
                    usageTip = "با should/ought to"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "had better",
                    persian = "بهتر است",
                    example = "You had better see a doctor.",
                    examplePersian = "بهتر است دکتر ببینی.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "be supposed to",
                    persian = "قرار بود، باید",
                    example = "You're supposed to wear a seatbelt.",
                    examplePersian = "باید کمربند ایمنی ببندی.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "have to", meaning = "مجبور بودن",
                    persian = "مجبور بودن",
                    example = "I have to work tomorrow.",
                    examplePersian = "فردا مجبورم کار کنم."
                ),
                PhrasalVerb(
                    verb = "be able to", meaning = "توانستن",
                    persian = "توانستن",
                    example = "She's able to speak four languages.",
                    examplePersian = "او می‌تواند به چهار زبان صحبت کند."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Modal contractions",
                    content = "• cannot → can't /kænt/\n• could not → couldn't\n• must not → mustn't\n• should not → shouldn't"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Politeness",
                    content = "در انگلیسی، could و would مؤدبانه‌تر از can و will هستند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. افعال وجهی",
                    content = "| Modal | Use | Example |\n|-------|-----|---------|\n| can | ability | I can swim. |\n| could | past ability | I could swim. |\n| may | possibility | It may rain. |\n| might | weak possibility | She might come. |\n| must | strong obligation | You must wear a seatbelt. |\n| have to | external obligation | I have to work. |\n| should | advice | You should rest. |\n| will | future | I'll help you. |\n| would | polite request | Would you help me? |\n\nنکته: Modals + base verb (بدون to)."
                ),
                GrammarSection(
                    title = "2. توانایی: Can, Could",
                    content = "can — توانایی در حال:\n• I can speak three languages.\n\ncould — توانایی در گذشته:\n• I could swim when I was five.\n\nbe able to — برای همه زمان‌ها:\n• I'll be able to help tomorrow."
                ),
                GrammarSection(
                    title = "3. احتمال: May, Might, Could",
                    content = "may — احتمال متوسط:\n• It may rain tomorrow.\n\nmight — احتمال ضعیف:\n• She might come.\n\ncould — احتمال غیررسمی:\n• It could be true."
                ),
                GrammarSection(
                    title = "4. اجبار: Must, Have To, Should",
                    content = "must — اجبار قوی:\n• You must wear a helmet.\n\nhave to — اجبار خارجی:\n• I have to work on Saturdays.\n\nmustn't — ممنوعیت:\n• You mustn't smoke here.\n\ndon't have to — عدم اجبار:\n• You don't have to come.\n\nshould — توصیه:\n• You should see a doctor."
                ),
                GrammarSection(
                    title = "5. اجازه: Can, May, Could",
                    content = "can — غیررسمی:\n• Can I leave early?\n\nmay — رسمی:\n• May I come in?\n\ncould — مؤدبانه:\n• Could I borrow your pen?"
                ),
                GrammarSection(
                    title = "6. Modal Perfects",
                    content = "modal + have + past participle\n\nmust have + pp — استنتاج قوی:\n• She must have forgotten.\n\nmay/might have + pp — احتمال گذشته:\n• She may have left.\n\nshould have + pp — پشیمانی:\n• I should have studied harder."
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "She cans swim.",
                    correct = "She can swim.",
                    explanation = "Modals بدون -s."
                ),
                CommonMistake(
                    wrong = "I must to go.",
                    correct = "I must go.",
                    explanation = "بعد از modals، فعل ساده بدون to."
                ),
                CommonMistake(
                    wrong = "You mustn't come if you're busy.",
                    correct = "You don't have to come if you're busy.",
                    explanation = "mustn't = ممنوعیت، don't have to = عدم اجبار."
                )
            ),
            conversation = listOf(
                DialogueLine("Sam", "You look worried. What's wrong?", "نگران به نظر می‌رسی. چی شده؟"),
                DialogueLine("Rina", "I have a big exam tomorrow. I don't feel ready.", "فردا امتحان بزرگی دارم. آماده نیستم."),
                DialogueLine("Sam", "You should get some rest tonight.", "باید امشب استراحت کنی."),
                DialogueLine("Rina", "I know, but I must study a bit more.", "می‌دانم، ولی باید بیشتر درس بخوانم."),
                DialogueLine("Sam", "Could I help you with anything?", "می‌تونم کمکت کنم؟"),
                DialogueLine("Rina", "Could you explain the conditionals to me?", "می‌تونی شرطی‌ها را توضیح بدی؟")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What problem does Rina have?", "She has a big exam tomorrow."),
                ComprehensionQuestion("What does Sam advise?", "He says she should get some rest.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Give advice to a friend who is stressed.",
                    promptPersian = "به دوستی که استرس دارد توصیه کن.",
                    hints = "You should..., You shouldn't..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write advice about a problem (150 words).",
                    promptPersian = "درباره یک مشکل توصیه بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "Problem, advice with different modals, encouragement"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: You ___ see a doctor.", listOf("should", "should to", "shoulds", "shoulding"), 0),
                QuizQuestion("Complete: She ___ swim well.", listOf("can", "cans", "is can", "to can"), 0),
                QuizQuestion("Difference mustn't vs don't have to:", listOf("No difference", "Mustn't = prohibition", "Mustn't = optional", "Same"), 1),
                QuizQuestion("Complete: She ___ have forgotten.", listOf("must", "musts", "must to", "is must"), 0),
                QuizQuestion("Complete: You ___ smoke here.", listOf("mustn't", "don't have to", "shouldn't", "couldn't"), 0)
            )
        )
    }

    // ============================================================
    // فصل ۹: Conditionals (شرطی‌ها)
    // ============================================================
    private fun chapter9_Conditionals(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Conditionals",
            titlePersian = "جملات شرطی",
            objectives = listOf(
                "شرطی صفر برای حقایق",
                "شرطی اول برای موقعیت‌های واقعی",
                "شرطی دوم برای فرضیات",
                "شرطی سوم برای پشیمانی"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "condition", persian = "شرط",
                    pronunciation = "/kənˈdɪʃən/", partOfSpeech = "noun",
                    example = "I'll help you on one condition.",
                    examplePersian = "به یک شرط کمکت می‌کنم.",
                    usageTip = "پایه جملات شرطی"
                ),
                VocabWord(
                    english = "hypothetical", persian = "فرضی",
                    pronunciation = "/ˌhaɪpəˈθetɪkəl/", partOfSpeech = "adjective",
                    example = "It's a hypothetical situation.",
                    examplePersian = "این یک وضعیت فرضی است.",
                    usageTip = "برای شرطی دوم"
                ),
                VocabWord(
                    english = "consequence", persian = "پیامد",
                    pronunciation = "/ˈkɑːnsəkwens/", partOfSpeech = "noun",
                    example = "Actions have consequences.",
                    examplePersian = "اعمال پیامد دارند.",
                    usageTip = "در نتیجه شرطی"
                ),
                VocabWord(
                    english = "regret", persian = "پشیمانی",
                    pronunciation = "/rɪˈɡret/", partOfSpeech = "noun/verb",
                    example = "I regret not studying harder.",
                    examplePersian = "پشیمانم که بیشتر درس نخواندم.",
                    usageTip = "با شرطی سوم"
                ),
                VocabWord(
                    english = "unless", persian = "مگر اینکه",
                    pronunciation = "/ənˈles/", partOfSpeech = "conjunction",
                    example = "I won't go unless you come.",
                    examplePersian = "نمی‌روم مگر اینکه تو بیایی.",
                    usageTip = "جایگزین if...not"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "if push comes to shove",
                    persian = "در بدترین حالت",
                    example = "If push comes to shove, I'll do it myself.",
                    examplePersian = "در بدترین حالت، خودم انجامش می‌دهم.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "count on", meaning = "تکیه کردن به",
                    persian = "تکیه کردن به",
                    example = "You can count on me.",
                    examplePersian = "می‌تونی روی من حساب کنی."
                ),
                PhrasalVerb(
                    verb = "come up with", meaning = "ارائه دادن",
                    persian = "ارائه دادن",
                    example = "If you come up with a plan, let me know.",
                    examplePersian = "اگر برنامه‌ای ارائه دادی، خبرم کن."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Stress on main clauses",
                    content = "در شرطی‌ها، تأکید روی بخش اصلی:\n• If you study, you'll PASS."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Politeness in conditionals",
                    content = "از شرطی دوم برای مؤدبانه‌تر شدن: 'I would appreciate it if...'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. شرطی صفر",
                    content = "If + present simple, present simple\n\nحقایق کلی:\n• If you heat water, it boils.\n• If you don't water plants, they die."
                ),
                GrammarSection(
                    title = "2. شرطی اول",
                    content = "If + present simple, will + base verb\n\nموقعیت‌های واقعی:\n• If it rains, I will stay home.\n• If you study hard, you will pass.\n\nنکته: در if-clause از will استفاده نمی‌کنیم:\n❌ If it will rain...\n✅ If it rains..."
                ),
                GrammarSection(
                    title = "3. شرطی دوم",
                    content = "If + past simple, would + base verb\n\nفرضیات غیرواقعی:\n• If I had more money, I would travel the world.\n• If I were you, I would apologize.\n\nنکته: با be، از were استفاده می‌کنیم."
                ),
                GrammarSection(
                    title = "4. شرطی سوم",
                    content = "If + past perfect, would have + past participle\n\nپشیمانی:\n• If I had studied harder, I would have passed.\n• If we had left earlier, we wouldn't have missed the flight."
                ),
                GrammarSection(
                    title = "5. شرطی ترکیبی",
                    content = "ترکیب شرطی دوم و سوم:\n\nگذشته + حال:\nIf + past perfect, would + base verb\n• If I had studied medicine, I would be a doctor now.\n\nحال + گذشته:\nIf + past simple, would have + pp\n• If I weren't so busy, I would have helped you."
                ),
                GrammarSection(
                    title = "6. Unless, In Case",
                    content = "unless = if...not:\n• I won't go unless you come.\n\nin case = برای احتیاط:\n• Take an umbrella in case it rains.\n\nprovided that = به شرطی که:\n• I'll help provided that you ask nicely."
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "If it will rain, I will stay home.",
                    correct = "If it rains, I will stay home.",
                    explanation = "در if-clause از حال ساده."
                ),
                CommonMistake(
                    wrong = "If I would have money, I would travel.",
                    correct = "If I had money, I would travel.",
                    explanation = "در شرطی دوم از past simple."
                ),
                CommonMistake(
                    wrong = "If I was you, I'd apologize.",
                    correct = "If I were you, I'd apologize.",
                    explanation = "در شرطی دوم با be از were."
                )
            ),
            conversation = listOf(
                DialogueLine("Nima", "What would you do if you won the lottery?", "اگر لاتاری برنده می‌شدی چیکار می‌کردی؟"),
                DialogueLine("Sara", "If I won the lottery, I would travel the world!", "اگر برنده می‌شدم، به دور دنیا سفر می‌کردم!"),
                DialogueLine("Nima", "Where would you go first?", "اول کجا می‌رفتی؟"),
                DialogueLine("Sara", "If I had the chance, I'd go to Japan first.", "اگر فرصت داشتم، اول ژاپن می‌رفتم."),
                DialogueLine("Nima", "Nice choice!", "انتخاب خوبی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What would Sara do if she won the lottery?", "She would travel the world."),
                ComprehensionQuestion("Where would she go first?", "She would go to Japan first.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about what you would do if you had more free time.",
                    promptPersian = "درباره اینکه اگر وقت آزاد بیشتری داشتی چیکار می‌کردی صحبت کن.",
                    hints = "If I had..., I would..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about a hypothetical scenario (150 words).",
                    promptPersian = "درباره یه سناریوی فرضی بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "Use all four types of conditionals"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: If it rains, I ___ stay home.", listOf("will", "would", "am", "do"), 0),
                QuizQuestion("Complete: If I ___ you, I'd wait.", listOf("am", "was", "were", "be"), 2),
                QuizQuestion("Complete: If I had known, I ___ helped.", listOf("will have", "would have", "have", "had"), 1),
                QuizQuestion("Complete: If I had money, I ___ travel.", listOf("will", "would", "am", "have"), 1),
                QuizQuestion("'Unless' means:", listOf("اگر", "مگر اینکه", "برای اینکه", "در حالی که"), 1)
            )
        )
    }

    // ============================================================
    // فصل ۱۰: Passive Voice (مجهول)
    // ============================================================
    private fun chapter10_Passive(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Passive Voice",
            titlePersian = "مجهول",
            objectives = listOf(
                "ساخت جملات مجهول در زمان‌های مختلف",
                "استفاده از مجهول وقتی فاعل ناشناخته است",
                "تفاوت active و passive",
                "مجهول با modals"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "passive", persian = "مجهول",
                    pronunciation = "/ˈpæsɪv/", partOfSpeech = "adjective",
                    example = "This sentence is passive.",
                    examplePersian = "این جمله مجهول است.",
                    antonyms = "active", usageTip = "be + past participle"
                ),
                VocabWord(
                    english = "agent", persian = "فاعل مجهول",
                    pronunciation = "/ˈeɪdʒənt/", partOfSpeech = "noun",
                    example = "In passive voice, the agent is often omitted.",
                    examplePersian = "در مجهول، فاعل غالباً حذف می‌شود.",
                    usageTip = "با by نشان داده می‌شود"
                ),
                VocabWord(
                    english = "emphasis", persian = "تأکید",
                    pronunciation = "/ˈemfəsɪs/", partOfSpeech = "noun",
                    example = "Passive voice puts emphasis on the action.",
                    examplePersian = "مجهول تأکید را روی عمل می‌گذارد.",
                    usageTip = "کاربرد passive"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "be said to",
                    persian = "گفته می‌شود که",
                    example = "He is said to be very rich.",
                    examplePersian = "گفته می‌شود که او خیلی ثروتمند است.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "be made of", meaning = "ساخته شده از",
                    persian = "ساخته شده از",
                    example = "The table is made of wood.",
                    examplePersian = "میز از چوب ساخته شده."
                ),
                PhrasalVerb(
                    verb = "be known for", meaning = "شناخته شده برای",
                    persian = "شناخته شده برای",
                    example = "Paris is known for its fashion.",
                    examplePersian = "پاریس برای مد شناخته شده است."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Stress shift in passive",
                    content = "در passive، تأکید روی past participle:\n• The window was BROKEN."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Passive in scientific writing",
                    content = "در مقالات علمی، passive رایج است: 'The experiment was conducted...'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. ساختار مجهول",
                    content = "Subject + be + past participle + (by + agent)\n\nActive: Tom writes the letter.\nPassive: The letter is written by Tom.\n\nActive: They built the house in 1990.\nPassive: The house was built in 1990."
                ),
                GrammarSection(
                    title = "2. مجهول در زمان‌های مختلف",
                    content = "| Tense | Active | Passive |\n|-------|--------|---------|\n| Present Simple | They clean. | It is cleaned. |\n| Present Continuous | They are cleaning. | It is being cleaned. |\n| Present Perfect | They have cleaned. | It has been cleaned. |\n| Past Simple | They cleaned. | It was cleaned. |\n| Past Continuous | They were cleaning. | It was being cleaned. |\n| Future | They will clean. | It will be cleaned. |\n| Modals | They must clean. | It must be cleaned. |"
                ),
                GrammarSection(
                    title = "3. Active vs Passive",
                    content = "از passive استفاده می‌کنیم وقتی:\n1. فاعل ناشناخته: My car was stolen.\n2. فاعل بی‌اهمیت: The road is being repaired.\n3. تمرکز روی مفعول: The prize was given to Maria.\n4. در نوشتار رسمی: The experiment was conducted."
                ),
                GrammarSection(
                    title = "4. Passive with Modals",
                    content = "Modal + be + past participle\n\n• The rule must be followed.\n• The package can be delivered.\n• The work should be finished."
                ),
                GrammarSection(
                    title = "5. Personal and Impersonal Passive",
                    content = "Personal:\nIt + passive + that + clause\n• It is said that he is rich.\n\nImpersonal:\nSubject + passive + to + infinitive\n• He is said to be rich."
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "The house was build in 1990.",
                    correct = "The house was built in 1990.",
                    explanation = "past participle صحیح build، built است."
                ),
                CommonMistake(
                    wrong = "The rule must followed.",
                    correct = "The rule must be followed.",
                    explanation = "با modals، be + pp."
                ),
                CommonMistake(
                    wrong = "The cake was ate.",
                    correct = "The cake was eaten.",
                    explanation = "past participle صحیح eat، eaten است."
                )
            ),
            conversation = listOf(
                DialogueLine("Lena", "Have you heard about the new library?", "درباره کتابخانه جدید شنیده‌ای؟"),
                DialogueLine("Karim", "Yes! It was designed by a famous architect.", "بله! توسط یه معمار معروف طراحی شده."),
                DialogueLine("Lena", "When was it built?", "کِی ساخته شد؟"),
                DialogueLine("Karim", "It was completed last year.", "سال گذشته تکمیل شد."),
                DialogueLine("Lena", "Is it free?", "رایگانه؟"),
                DialogueLine("Karim", "Yes, entry is not charged.", "بله، ورودی گرفته نمی‌شه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Who designed the library?", "It was designed by a famous architect."),
                ComprehensionQuestion("When was it built?", "It was completed last year.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe how a common product is made.",
                    promptPersian = "توصیف کن که یک محصول رایج چطور ساخته می‌شود.",
                    hints = "It is made..., It is produced..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a paragraph about a process (150 words).",
                    promptPersian = "درباره یک فرایند بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "Use 6 passive sentences in different tenses"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: The book ___ written by Hemingway.", listOf("is", "was", "has", "does"), 1),
                QuizQuestion("Complete: The office ___ cleaned every day.", listOf("is", "are", "was", "has"), 0),
                QuizQuestion("Complete: The report ___ been finished.", listOf("has", "is", "was", "does"), 0),
                QuizQuestion("Past participle of 'write':", listOf("wrote", "writed", "written", "writes"), 2),
                QuizQuestion("Complete: The rule must ___ followed.", listOf("be", "is", "been", "being"), 0)
            )
        )
    }

    // ============================================================
    // فصل ۱۱: Reported Speech (نقل قول غیرمستقیم)
    // ============================================================
    private fun chapter11_ReportedSpeech(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Reported Speech",
            titlePersian = "نقل قول غیرمستقیم",
            objectives = listOf(
                "نقل جملات خبری، سوالی و دستوری",
                "تغییر زمان (tense shift)",
                "نقل سوالات با ترتیب جمله خبری",
                "say vs tell"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "report", persian = "گزارش دادن",
                    pronunciation = "/rɪˈpɔːrt/", partOfSpeech = "verb",
                    example = "She reported the news to us.",
                    examplePersian = "او خبر را به ما گزارش داد.",
                    usageTip = "در نقل قول"
                ),
                VocabWord(
                    english = "direct speech", persian = "نقل قول مستقیم",
                    pronunciation = "/dəˈrekt spiːtʃ/", partOfSpeech = "noun",
                    example = "He said, 'I am tired.'",
                    examplePersian = "او گفت: «خسته‌ام».",
                    usageTip = "با علامت نقل قول"
                ),
                VocabWord(
                    english = "indirect speech", persian = "نقل قول غیرمستقیم",
                    pronunciation = "/ˌɪndəˈrekt spiːtʃ/", partOfSpeech = "noun",
                    example = "He said he was tired.",
                    examplePersian = "او گفت خسته است.",
                    synonyms = "reported speech", usageTip = "بدون علامت نقل قول"
                ),
                VocabWord(
                    english = "say", persian = "گفتن",
                    pronunciation = "/seɪ/", partOfSpeech = "verb",
                    example = "She said she was busy.",
                    examplePersian = "او گفت مشغول است.",
                    usageTip = "بدون مفعول"
                ),
                VocabWord(
                    english = "tell", persian = "گفتن به (کسی)",
                    pronunciation = "/tel/", partOfSpeech = "verb",
                    example = "She told me she was busy.",
                    examplePersian = "او به من گفت مشغول است.",
                    usageTip = "با مفعول"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "according to",
                    persian = "به گفته",
                    example = "According to him, the plan will work.",
                    examplePersian = "به گفته او، طرح جواب می‌دهد.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "bring up", meaning = "مطرح کردن",
                    persian = "مطرح کردن",
                    example = "She brought up the issue at the meeting.",
                    examplePersian = "او موضوع را در جلسه مطرح کرد."
                ),
                PhrasalVerb(
                    verb = "point out", meaning = "اشاره کردن",
                    persian = "اشاره کردن",
                    example = "He pointed out the mistake.",
                    examplePersian = "او به اشتباه اشاره کرد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Reduced that",
                    content = "that در گفتار طبیعی اغلب حذف می‌شود:\n• She said (that) she was busy."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Gossip and reporting",
                    content = "در مکالمات روزمره، انگلیسی‌زبانان زیاد از reported speech استفاده می‌کنند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. نقل قول جملات خبری",
                    content = "ساختار: say/tell + (that) + clause\n\nDirect: \"I am tired,\" she said.\nReported: She said (that) she was tired.\n\nDirect: \"I will call you,\" he said.\nReported: He said (that) he would call me."
                ),
                GrammarSection(
                    title = "2. تغییر زمان (Tense Shift)",
                    content = "| Direct | Reported |\n|--------|----------|\n| Present simple | Past simple |\n| Present continuous | Past continuous |\n| Present perfect | Past perfect |\n| Past simple | Past perfect |\n| will | would |\n| can | could |\n| may | might |\n| must | had to |"
                ),
                GrammarSection(
                    title = "3. تغییر ضمایر",
                    content = "\"I\" → he/she\n\"you\" → I/we/he/she/they\n\"we\" → they\n\"my\" → his/her\n\nمثال:\nDirect: \"I love my job.\"\nReported: He said he loved his job."
                ),
                GrammarSection(
                    title = "4. تغییر زمان و مکان",
                    content = "| Direct | Reported |\n|--------|----------|\n| now | then |\n| today | that day |\n| yesterday | the day before |\n| tomorrow | the next day |\n| here | there |\n| this | that |"
                ),
                GrammarSection(
                    title = "5. نقل قول سوالات",
                    content = "Yes/No → if/whether + statement word order:\nDirect: \"Are you tired?\"\nReported: She asked if I was tired.\n\nWh-questions → question word + statement word order:\nDirect: \"Where do you live?\"\nReported: She asked where I lived.\n\nنکته: در reported questions، ترتیب جمله خبری:\n❌ She asked where did I live.\n✅ She asked where I lived."
                ),
                GrammarSection(
                    title = "6. نقل قول دستورات",
                    content = "tell/ask + object + to + infinitive:\n\nDirect: \"Close the door!\"\nReported: He told me to close the door.\n\nDirect: \"Don't be late.\"\nReported: He told me not to be late."
                ),
                GrammarSection(
                    title = "7. Say vs Tell",
                    content = "say + (that) + clause (بدون مفعول):\n• She said she was tired.\n\ntell + object + (that) + clause:\n• She told me she was tired.\n\n❌ She said me that she was tired.\n✅ She told me that she was tired."
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "She said me that she was tired.",
                    correct = "She told me that she was tired.",
                    explanation = "say بدون مفعول، tell با مفعول."
                ),
                CommonMistake(
                    wrong = "He asked me where was I from.",
                    correct = "He asked me where I was from.",
                    explanation = "در reported questions، ترتیب جمله خبری."
                ),
                CommonMistake(
                    wrong = "She said she is tired.",
                    correct = "She said she was tired.",
                    explanation = "tense shift: is → was."
                )
            ),
            conversation = listOf(
                DialogueLine("Anna", "Did you see Ali today?", "امروز علی را دیدی؟"),
                DialogueLine("Ben", "No, what did he say?", "نه، چی گفت؟"),
                DialogueLine("Anna", "He said he was moving to Canada next month.", "گفت ماه بعد داره به کانادا نقل مکان می‌کنه."),
                DialogueLine("Ben", "Why?", "چرا؟"),
                DialogueLine("Anna", "He told me he had gotten a job offer.", "به من گفت یه پیشنهاد شغلی گرفته."),
                DialogueLine("Ben", "Did he say when he would leave?", "گفت کِی می‌ره؟"),
                DialogueLine("Anna", "He said he would leave at the end of the month.", "گفت آخر ماه می‌ره.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What did Ali tell Anna?", "He said he was moving to Canada."),
                ComprehensionQuestion("Why is Ali moving?", "He got a job offer there.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Report a recent conversation you had.",
                    promptPersian = "گفت‌وگویی که اخیراً داشتی را نقل کن.",
                    hints = "He said..., She told me..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a news report (150 words) using reported speech.",
                    promptPersian = "یک گزارش خبری بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "Statements, questions, commands"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: She said she ___ tired.", listOf("is", "was", "were", "be"), 1),
                QuizQuestion("Complete: He told me he ___ come.", listOf("will", "would", "can", "could"), 1),
                QuizQuestion("Correct:", listOf("She said me...", "She told me...", "She said to me is...", "She told to me..."), 1),
                QuizQuestion("Complete: He asked where I ___.", listOf("live", "lived", "do live", "am living"), 1),
                QuizQuestion("Complete: She asked me ___ her.", listOf("help", "helping", "to help", "helped"), 2)
            )
        )
    }

    // ============================================================
    // فصل ۱۲: Questions and Negatives (سؤالات و منفی‌ها)
    // ============================================================
    private fun chapter12_Questions(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Questions and Negatives",
            titlePersian = "سؤالات و منفی‌ها",
            objectives = listOf(
                "ساخت سؤالات بله/خیر و Wh",
                "منفی کردن جملات",
                "استفاده از question tags",
                "سؤالات غیرمستقیم"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "auxiliary verb", persian = "فعل کمکی",
                    pronunciation = "/ɔːɡˈzɪliəri vɜːrb/", partOfSpeech = "noun",
                    example = "Do, be, and have are auxiliary verbs.",
                    examplePersian = "do، be و have افعال کمکی هستند.",
                    usageTip = "در سؤالات و منفی‌ها"
                ),
                VocabWord(
                    english = "question tag", persian = "برچسب سؤالی",
                    pronunciation = "/ˈkwestʃən tæɡ/", partOfSpeech = "noun",
                    example = "You're coming, aren't you?",
                    examplePersian = "داری میای، نه؟",
                    usageTip = "برای تأیید"
                ),
                VocabWord(
                    english = "negative", persian = "منفی",
                    pronunciation = "/ˈneɡətɪv/", partOfSpeech = "adjective",
                    example = "I don't like coffee.",
                    examplePersian = "قهوه دوست ندارم.",
                    antonyms = "affirmative", usageTip = "با not"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "how come",
                    persian = "چطور شد که",
                    example = "How come you didn't call me?",
                    examplePersian = "چطور شد که بهم زنگ نزدی؟",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "what's up",
                    persian = "چه خبر",
                    example = "Hey, what's up?",
                    examplePersian = "هی، چه خبر؟",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "ask about", meaning = "پرسیدن درباره",
                    persian = "پرسیدن درباره",
                    example = "She asked about your health.",
                    examplePersian = "او درباره سلامتت پرسید."
                ),
                PhrasalVerb(
                    verb = "find out", meaning = "فهمیدن",
                    persian = "فهمیدن",
                    example = "I want to find out what happened.",
                    examplePersian = "می‌خواهم بفهمم چه اتفاقی افتاده."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Rising intonation for yes/no",
                    content = "• Are you coming? ↑\n• Do you like it? ↑"
                ),
                PronunciationTip(
                    title = "Falling intonation for wh-questions",
                    content = "• Where do you live? ↓\n• What time is it? ↓"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Question tags in conversation",
                    content = "انگلیسی‌زبانان از question tags برای شروع مکالمه یا تأیید استفاده می‌کنند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. سؤالات بله/خیر",
                    content = "ساختار: Auxiliary + Subject + Main Verb?\n\n• Do you work here?\n• Are you tired?\n• Have you finished?\n• Will you come?\n• Was she at home?"
                ),
                GrammarSection(
                    title = "2. سؤالات Wh",
                    content = "ساختار: Wh-word + Auxiliary + Subject + Main Verb?\n\n• Where do you live?\n• What does she do?\n• When are you coming?\n• Why did he leave?\n\nنکته: آهنگ نزولی."
                ),
                GrammarSection(
                    title = "3. Subject vs Object Questions",
                    content = "Subject questions — سؤال از فاعل:\nساختار: Who/What + verb? (بدون do)\n• Who wrote this book?\n• What happened?\n\nObject questions — سؤال از مفعول:\nساختار: Who/What + auxiliary + subject + verb?\n• Who did you see?\n• What did she buy?"
                ),
                GrammarSection(
                    title = "4. Question Tags",
                    content = "جمله مثبت → tag منفی:\n• You're coming, aren't you?\n\nجمله منفی → tag مثبت:\n• She doesn't smoke, does she?\n\nنکات:\n• با I am → aren't I?\n• با Let's → shall we?\n• با Imperatives → will you?"
                ),
                GrammarSection(
                    title = "5. جملات منفی",
                    content = "Subject + auxiliary + not + main verb\n\n• I don't work.\n• She doesn't work.\n• I'm not working.\n• I didn't work.\n• I haven't finished.\n• I won't come.\n• She isn't at home.\n\nکوتاه‌شده:\n• do not → don't\n• does not → doesn't\n• did not → didn't\n• is not → isn't"
                ),
                GrammarSection(
                    title = "6. سؤالات غیرمستقیم",
                    content = "برای مؤدبانه‌تر شدن:\n\nDirect: Where is the station?\nIndirect: Could you tell me where the station is?\n\nساختار:\n• Can/Could you tell me...?\n• Do you know...?\n• I was wondering...?"
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "Where you are going?",
                    correct = "Where are you going?",
                    explanation = "در سؤالات، فعل کمکی قبل از فاعل."
                ),
                CommonMistake(
                    wrong = "Who did wrote this book?",
                    correct = "Who wrote this book?",
                    explanation = "در subject questions، فعل کمکی نمی‌آید."
                ),
                CommonMistake(
                    wrong = "I don't know nothing.",
                    correct = "I don't know anything.",
                    explanation = "منفی مضاعف در انگلیسی استاندارد اشتباه است."
                )
            ),
            conversation = listOf(
                DialogueLine("Lena", "Hey, what's up?", "هی، چه خبر؟"),
                DialogueLine("Tom", "Not much. You're coming to the party, aren't you?", "چیز خاصی نیست. داری به مهمونی میای، نه؟"),
                DialogueLine("Lena", "Yes, I am. What time does it start?", "بله. چه ساعتی شروع می‌شه؟"),
                DialogueLine("Tom", "It starts at 8. Do you know where Ali lives?", "ساعت ۸. می‌دونی علی کجا زندگی می‌کنه؟"),
                DialogueLine("Lena", "Yes, I do.", "بله می‌دانم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("When does the party start?", "It starts at 8."),
                ComprehensionQuestion("Does Lena know where Ali lives?", "Yes, she does.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Ask a partner 8 questions about their daily life.",
                    promptPersian = "از یک دوست ۸ سؤال بپرس.",
                    hints = "Do you...? / What...? / Where...?"
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an interview with a famous person (150 words).",
                    promptPersian = "مصاحبه با یک فرد مشهور بنویس (۱۵۰ کلمه).",
                    wordCount = 150,
                    hints = "Yes/no questions, wh-questions, question tags"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: ___ you like coffee?", listOf("Do", "Does", "Is", "Are"), 0),
                QuizQuestion("Complete: You're happy, ___ you?", listOf("are", "aren't", "do", "don't"), 1),
                QuizQuestion("Complete: Where ___ you live?", listOf("do", "does", "are", "is"), 0),
                QuizQuestion("Correct:", listOf("Who did write this?", "Who wrote this?", "Who does wrote?", "Who was wrote?"), 1),
                QuizQuestion("Complete: You don't like coffee, ___ you?", listOf("do", "don't", "are", "aren't"), 0)
            )
        )
    }

    // ============================================================
    // فصل ۱۳: Review (مرور)
    // ============================================================
    private fun chapter13_Review(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 13,
            title = "Review",
            titlePersian = "مرور",
            objectives = listOf(
                "مرور همه زمان‌ها",
                "مرور افعال وجهی",
                "مرور شرطی‌ها",
                "آماده شدن برای سطح متوسط"
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "review", persian = "مرور",
                    pronunciation = "/rɪˈvjuː/", partOfSpeech = "noun/verb",
                    example = "Let's review the main tenses.",
                    examplePersian = "بیا زمان‌های اصلی را مرور کنیم.",
                    usageTip = "برای تجمیع یادگیری"
                ),
                VocabWord(
                    english = "fluency", persian = "روانی",
                    pronunciation = "/ˈfluːənsi/", partOfSpeech = "noun",
                    example = "Regular practice builds fluency.",
                    examplePersian = "تمرین منظم روانی می‌سازد.",
                    usageTip = "هدف نهایی"
                ),
                VocabWord(
                    english = "progress", persian = "پیشرفت",
                    pronunciation = "/ˈprɑːɡres/", partOfSpeech = "noun",
                    example = "You've made great progress!",
                    examplePersian = "پیشرفت خوبی کرده‌ای!",
                    usageTip = "ارزیابی"
                ),
                VocabWord(
                    english = "consistent", persian = "پیوسته",
                    pronunciation = "/kənˈsɪstənt/", partOfSpeech = "adjective",
                    example = "Be consistent with your studies.",
                    examplePersian = "در مطالعه‌ات پیوسته باش.",
                    usageTip = "کلید موفقیت"
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "practice makes perfect",
                    persian = "کار نیکو کردن از پر کردن است",
                    example = "Practice makes perfect — keep going!",
                    examplePersian = "کار نیکو کردن از پر کردن است — ادامه بده!",
                    register = "idiom"
                ),
                IdiomExpression(
                    english = "Rome wasn't built in a day",
                    persian = "رم در یک روز ساخته نشد",
                    example = "Don't give up. Rome wasn't built in a day.",
                    examplePersian = "تسلیم نشو. رم در یک روز ساخته نشد.",
                    register = "idiom"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "brush up on", meaning = "مرور و بهبود دادن",
                    persian = "مرور و بهبود دادن",
                    example = "I need to brush up on my grammar.",
                    examplePersian = "باید گرامرم را مرور و بهتر کنم."
                ),
                PhrasalVerb(
                    verb = "keep up", meaning = "حفظ کردن پیشرفت",
                    persian = "ادامه دادن",
                    example = "Keep up the good work!",
                    examplePersian = "کار خوبت را ادامه بده!"
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Intonation patterns",
                    content = "• Statements: falling ↓\n• Yes/No questions: rising ↑\n• Wh-questions: falling ↓"
                ),
                PronunciationTip(
                    title = "Contractions summary",
                    content = "I'm, you're, he's, she's, we're, they're\ndon't, doesn't, didn't, isn't, aren't\nI've, you've, he's, she's\nI'll, you'll, he'll, she'll"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Lifelong learning",
                    content = "در فرهنگ‌های انگلیسی‌زبان، یادگیری زبان یک فرایند مادام‌العمر است."
                ),
                CulturalNote(
                    title = "Mistakes are learning",
                    content = "در کلاس‌های غربی، اشتباه کردن بخش طبیعی یادگیری است."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. مرور زمان‌ها",
                    content = "| Tense | Example | Use |\n|-------|---------|-----|\n| Present Simple | I work every day. | عادت |\n| Present Continuous | I am working now. | در حال انجام |\n| Past Simple | I worked yesterday. | گذشته تمام |\n| Past Continuous | I was working. | در حال انجام گذشته |\n| Present Perfect | I have worked. | تجربه |\n| Future Simple | I will work. | آینده |\n| Future Going To | I am going to work. | قصد |"
                ),
                GrammarSection(
                    title = "2. مرور افعال وجهی",
                    content = "• can — ability\n• could — past ability / polite\n• may — possibility\n• might — weak possibility\n• must — strong obligation\n• have to — external obligation\n• should — advice\n• will — future\n• would — polite / conditional"
                ),
                GrammarSection(
                    title = "3. مرور شرطی‌ها",
                    content = "• Zero: If + present, present\n• First: If + present, will\n• Second: If + past, would\n• Third: If + past perfect, would have + pp"
                ),
                GrammarSection(
                    title = "4. مرور مجهول",
                    content = "Passive = be + past participle\n\n• Present: It is cleaned.\n• Past: It was cleaned.\n• Perfect: It has been cleaned.\n• Future: It will be cleaned.\n• Modals: It must be cleaned."
                ),
                GrammarSection(
                    title = "5. اشتباهات رایج (چک‌لیست)",
                    content = "1. ❌ She work. → ✅ She works.\n2. ❌ I didn't went. → ✅ I didn't go.\n3. ❌ I am agree. → ✅ I agree.\n4. ❌ He don't. → ✅ He doesn't.\n5. ❌ I look forward to see you. → ✅ to seeing you.\n6. ❌ She said me. → ✅ She told me."
                ),
                GrammarSection(
                    title = "6. گام‌های بعدی",
                    content = "پس از این کتاب:\n\n1. سطح متوسط:\n   • Perfect tenses\n   • Advanced conditionals\n   • Reported speech (advanced)\n   • Phrasal verbs (extended)\n\n2. تمرین:\n   • روزانه ۱۵-۳۰ دقیقه\n   • خواندن، نوشتن، شنیدن، صحبت کردن\n\n\"Practice makes perfect!\""
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I am agree.",
                    correct = "I agree.",
                    explanation = "agree فعل است، بدون am."
                ),
                CommonMistake(
                    wrong = "He don't like it.",
                    correct = "He doesn't like it.",
                    explanation = "برای he/she/it از doesn't."
                ),
                CommonMistake(
                    wrong = "I look forward to see you.",
                    correct = "I look forward to seeing you.",
                    explanation = "بعد از look forward to از verb-ing."
                )
            ),
            conversation = listOf(
                DialogueLine("Maria", "I can't believe we've finished the whole book!", "باورم نمی‌شه کل کتاب را تمام کردیم!"),
                DialogueLine("Ahmed", "I know! When we started, I could barely speak English.", "می‌دونم! وقتی شروع کردیم، به‌سختی می‌تونستم صحبت کنم."),
                DialogueLine("Maria", "Look at us now. We can have full conversations!", "الان به ما نگاه کن. می‌تونیم مکالمات کامل داشته باشیم!"),
                DialogueLine("Ahmed", "What was the hardest part for you?", "سخت‌ترین قسمت برای تو چی بود؟"),
                DialogueLine("Maria", "The past perfect. I always confused it with past simple.", "گذشته کامل. همیشه با گذشته ساده قاطی می‌کردم."),
                DialogueLine("Ahmed", "Me too! But now I understand the difference.", "منم همینطور! ولی الان تفاوتش را می‌فهمم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What did Ahmed say was the hardest part?", "The past perfect."),
                ComprehensionQuestion("Can they have full conversations now?", "Yes, they can.")
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your English learning journey.",
                    promptPersian = "درباره مسیر یادگیری انگلیسی‌ات صحبت کن.",
                    hints = "I started..., I've learned..., I can now..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a reflection on your English learning journey (200 words).",
                    promptPersian = "بازتابی درباره مسیر یادگیری انگلیسی‌ات بنویس (۲۰۰ کلمه).",
                    wordCount = 200,
                    hints = "When you started, what you've learned, challenges, future goals"
                )
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ in London for five years.", listOf("live", "lived", "have lived", "am living"), 2),
                QuizQuestion("Complete: If I ___ you, I'd study harder.", listOf("am", "was", "were", "be"), 2),
                QuizQuestion("Complete: The book ___ written by Hemingway.", listOf("is", "was", "has", "does"), 1),
                QuizQuestion("Complete: She said she ___ tired.", listOf("is", "was", "were", "be"), 1),
                QuizQuestion("Complete: I've lived here ___ 2015.", listOf("since", "for", "in", "at"), 0),
                QuizQuestion("Complete: If it rains, I ___ stay home.", listOf("will", "would", "am", "do"), 0),
                QuizQuestion("Complete: ___ you ever been to Japan?", listOf("Do", "Did", "Have", "Are"), 2),
                QuizQuestion("Complete: If I had known, I ___ helped.", listOf("will have", "would have", "have", "had"), 1)
            )
        )
    }

    private fun getDefaultContent(bookId: String, chapterNumber: Int): LessonContent {
        return LessonContent(
            bookId = bookId,
            chapterNumber = chapterNumber,
            title = "Coming Soon",
            titlePersian = "به زودی...",
            vocabulary = emptyList(),
            grammar = emptyList(),
            conversation = emptyList(),
            quiz = emptyList()
        )
    }
}