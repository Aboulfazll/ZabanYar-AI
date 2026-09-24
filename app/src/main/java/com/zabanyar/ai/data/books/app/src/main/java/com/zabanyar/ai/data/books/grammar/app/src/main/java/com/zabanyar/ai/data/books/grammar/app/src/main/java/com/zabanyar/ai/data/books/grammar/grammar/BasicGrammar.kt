package com.zabanyar.ai.data.books.grammar

import com.zabanyar.ai.data.*

object BasicGrammar {

    const val BOOK_ID = "basic_grammar"

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

    // ============================================================
    // CHAPTER 1 — Present Simple
    // ============================================================
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Present Simple",
            titlePersian = "زمان حال ساده",
            objectives = listOf(
                "Use the present simple for habits, routines, and facts.",
                "Form affirmative, negative, and question sentences correctly.",
                "Master the third-person singular -s rule.",
                "Use time expressions like every day, on Mondays, at night.",
                "Identify and avoid common Persian-speaker mistakes."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "habit",
                    persian = "عادت",
                    pronunciation = "/ˈhæbɪt/",
                    partOfSpeech = "noun",
                    example = "Brushing my teeth is a daily habit.",
                    examplePersian = "مسواک زدن یک عادت روزانه است.",
                    collocations = "daily habit, bad habit, good habit",
                    wordFamily = "habitual, habitually",
                    usageTip = "برای کارهایی که به‌طور مرتب تکرار می‌شوند."
                ),
                VocabWord(
                    english = "routine",
                    persian = "روتین، برنامه منظم",
                    pronunciation = "/ruːˈtiːn/",
                    partOfSpeech = "noun",
                    example = "My morning routine starts at 7 AM.",
                    examplePersian = "برنامه صبحگاهی من ساعت ۷ شروع می‌شود.",
                    collocations = "daily routine, morning routine",
                    wordFamily = "routine",
                    usageTip = "مجموعه‌ای از کارها با ترتیب خاص."
                ),
                VocabWord(
                    english = "regular",
                    persian = "منظم، مرتب",
                    pronunciation = "/ˈreɡjələr/",
                    partOfSpeech = "adjective",
                    example = "She takes regular breaks at work.",
                    examplePersian = "او در محل کار استراحت‌های منظم می‌کند.",
                    collocations = "regular exercise, regular customer",
                    wordFamily = "regularly, regularity",
                    usageTip = "معمولاً با حال ساده استفاده می‌شود."
                ),
                VocabWord(
                    english = "frequency",
                    persian = "تکرار، فراوانی",
                    pronunciation = "/ˈfriːkwənsi/",
                    partOfSpeech = "noun",
                    example = "The frequency of his visits has increased.",
                    examplePersian = "تعداد دفعات بازدیدهایش افزایش یافته است.",
                    collocations = "high frequency, low frequency",
                    wordFamily = "frequent, frequently",
                    usageTip = "مرتبط با قیدهای تکرار."
                ),
                VocabWord(
                    english = "always",
                    persian = "همیشه",
                    pronunciation = "/ˈɔːlweɪz/",
                    partOfSpeech = "adverb",
                    example = "I always drink coffee in the morning.",
                    examplePersian = "همیشه صبح‌ها قهوه می‌نوشم.",
                    antonyms = "never",
                    usageTip = "قبل از فعل اصلی، بعد از be."
                ),
                VocabWord(
                    english = "usually",
                    persian = "معمولاً",
                    pronunciation = "/ˈjuːʒuəli/",
                    partOfSpeech = "adverb",
                    example = "She usually walks to work.",
                    examplePersian = "او معمولاً پیاده سر کار می‌رود.",
                    synonyms = "normally, generally",
                    antonyms = "rarely, seldom",
                    usageTip = "قید تکرار با فراوانی ~۹۰٪."
                ),
                VocabWord(
                    english = "sometimes",
                    persian = "گاهی اوقات",
                    pronunciation = "/ˈsʌmtaɪmz/",
                    partOfSpeech = "adverb",
                    example = "I sometimes go to the gym.",
                    examplePersian = "گاهی به باشگاه می‌روم.",
                    synonyms = "occasionally",
                    antonyms = "always, never",
                    usageTip = "قید تکرار با فراوانی ~۵۰٪."
                ),
                VocabWord(
                    english = "rarely",
                    persian = "به‌ندرت",
                    pronunciation = "/ˈrerli/",
                    partOfSpeech = "adverb",
                    example = "He rarely eats fast food.",
                    examplePersian = "او به‌ندرت فست‌فود می‌خورد.",
                    synonyms = "seldom, hardly ever",
                    antonyms = "always, often",
                    usageTip = "قید تکرار با فراوانی ~۱۰٪."
                ),
                VocabWord(
                    english = "never",
                    persian = "هرگز",
                    pronunciation = "/ˈnevər/",
                    partOfSpeech = "adverb",
                    example = "I never smoke.",
                    examplePersian = "هرگز سیگار نمی‌کشم.",
                    antonyms = "always",
                    usageTip = "جمله را منفی می‌کند."
                ),
                VocabWord(
                    english = "every day",
                    persian = "هر روز",
                    pronunciation = "/ˈevri deɪ/",
                    partOfSpeech = "time expression",
                    example = "I study English every day.",
                    examplePersian = "هر روز انگلیسی می‌خوانم.",
                    collocations = "every week, every month, every year",
                    usageTip = "با حال ساده زیاد می‌آید."
                ),
                VocabWord(
                    english = "on Mondays",
                    persian = "دوشنبه‌ها",
                    pronunciation = "/ɑːn ˈmʌndeɪz/",
                    partOfSpeech = "time expression",
                    example = "She has English class on Mondays.",
                    examplePersian = "او دوشنبه‌ها کلاس انگلیسی دارد.",
                    usageTip = "با روزهای هفته از on."
                ),
                VocabWord(
                    english = "at night",
                    persian = "شب‌ها",
                    pronunciation = "/æt naɪt/",
                    partOfSpeech = "time expression",
                    example = "I read books at night.",
                    examplePersian = "شب‌ها کتاب می‌خوانم.",
                    collocations = "at night, at noon, at midnight",
                    usageTip = "عبارات زمانی با at."
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
                    persian = "اغلب اوقات (۹ از ۱۰ بار)",
                    example = "Nine times out of ten, she is right.",
                    examplePersian = "اغلب اوقات، حق با اوست.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "day in, day out",
                    persian = "هر روز و هر روز",
                    example = "He does the same work day in, day out.",
                    examplePersian = "او هر روز همان کار را انجام می‌دهد.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "wake up",
                    meaning = "to stop sleeping",
                    persian = "بیدار شدن",
                    example = "I wake up at 6 AM every morning.",
                    examplePersian = "هر روز صبح ساعت ۶ بیدار می‌شوم."
                ),
                PhrasalVerb(
                    verb = "get up",
                    meaning = "to get out of bed",
                    persian = "از تخت بلند شدن",
                    example = "She gets up early on weekdays.",
                    examplePersian = "او روزهای هفته زود بلند می‌شود."
                ),
                PhrasalVerb(
                    verb = "go to bed",
                    meaning = "to go to sleep at night",
                    persian = "به رختخواب رفتن",
                    example = "He goes to bed at 11 PM.",
                    examplePersian = "او ساعت ۱۱ شب می‌خوابد."
                ),
                PhrasalVerb(
                    verb = "take up",
                    meaning = "to start a hobby",
                    persian = "شروع کردن سرگرمی",
                    example = "She takes up yoga every summer.",
                    examplePersian = "هر تابستان یوگا را شروع می‌کند."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Third-person -s: /s/, /z/, or /ɪz/",
                    content = "در سوم شخص مفرد، -s سه تلفظ مختلف دارد:\n• /s/ بعد از صداهای بی‌صدا: works, likes, stops\n• /z/ بعد از صداهای صدادار: plays, reads, goes\n• /ɪz/ بعد از s، z، sh، ch: watches, washes, teaches"
                ),
                PronunciationTip(
                    title = "Contractions with do/does",
                    content = "در گفتار طبیعی:\n• do not → don't /doʊnt/\n• does not → doesn't /ˈdʌzənt/"
                ),
                PronunciationTip(
                    title = "Stress on frequency adverbs",
                    content = "در جمله‌های معمولی، قید تکرار تأکید کمتری دارد:\n• I USUALLY walk to work.\nدر مقایسه تأکید می‌گیرد:\n• I ALWAYS walk, but she SOMETIMES does."
                ),
                PronunciationTip(
                    title = "Sentence intonation",
                    content = "جمله‌های خبری با آهنگ نزولی:\n• She works at a hospital. ↓\nجمله‌های سؤالی با آهنگ صعودی:\n• Does she work at a hospital? ↑"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Small talk about routines",
                    content = "پرسیدن درباره برنامه روزانه (What time do you usually...?) یکی از راه‌های طبیعی شروع مکالمه است."
                ),
                CulturalNote(
                    title = "Time and punctuality",
                    content = "در کشورهای انگلیسی‌زبان، وقت‌شناسی مهم است. عبارت‌هایی مثل right on time و running late رایجند."
                ),
                CulturalNote(
                    title = "Frequency adverbs in daily conversation",
                    content = "بومی‌زبانان اغلب از قیدهای تکرار برای ابراز نظر شخصی استفاده می‌کنند. مثلاً: 'I usually avoid sugar' یعنی ترجیح شخصی است نه قانون."
                ),
                CulturalNote(
                    title = "Weekly routines",
                    content = "در غرب، آخر هفته‌ها اغلب متفاوت از روزهای کاری است. Expressions like on weekends / at the weekend (British) رایج هستند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Present Simple: Structure",
                    content = """
زمان حال ساده برای بیان عادت‌ها، حقایق کلی، برنامه‌های منظم و رویدادهای تکرارشونده استفاده می‌شود.

ساختار مثبت:
Subject + Base Verb (I, you, we, they)
Subject + Verb + s/es (he, she, it)

I work every day.
She works at a hospital.
They study English on Mondays.

ساختار منفی:
Subject + do/does + not + Base Verb

I don't (do not) work on Fridays.
She doesn't (does not) work on Fridays.

ساختار سؤالی:
Do/Does + Subject + Base Verb?

Do you work here? — Yes, I do. / No, I don't.
Does she work here? — Yes, she does. / No, she doesn't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Third-Person Singular Rule",
                    content = """
برای he, she, it، فعل تغییر می‌کند:

• اکثر افعال: + s
   work → works, play → plays, read → reads

• افعال منتهی به -s, -sh, -ch, -x, -o: + es
   go → goes, watch → watches, finish → finishes, fix → fixes

• افعال منتهی به consonant + y: y → ies
   study → studies, carry → carries, fly → flies

• افعال منتهی به vowel + y: فقط + s
   play → plays, buy → buys, enjoy → enjoys

• افعال بی‌قاعده:
   have → has
   be → is
   do → does
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Spelling of -s / -es",
                    content = """
جدول خلاصه:

| فعل | سوم شخص | قاعده |
|-----|---------|-------|
| work | works | + s |
| watch | watches | + es |
| study | studies | y → ies |
| play | plays | vowel + y → + s |
| go | goes | + es |
| have | has | بی‌قاعده |

نکته: املای -s و -es روی تلفظ هم اثر دارد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Adverbs of Frequency",
                    content = """
قیدهای تکرار به ترتیب فراوانی:

always (100%)
usually (90%)
often (70%)
sometimes (50%)
occasionally (30%)
rarely / seldom (10%)
hardly ever (5%)
never (0%)

قاعده موقعیت:
• قبل از فعل اصلی:
   I always drink tea.
   She usually walks to work.

• بعد از فعل be:
   I am always tired in the morning.
   She is usually late.

• در جمله‌های سؤالی، قبل از فعل اصلی:
   Do you always walk to work?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Time Expressions",
                    content = """
عبارت‌های زمانی رایج با حال ساده:

• every + day/week/month/year
• on + روزها: on Mondays, on weekends
• at + ساعت‌های مشخص: at 7 AM, at noon, at night
• in + بخش‌های روز: in the morning, in the afternoon
• once/twice/three times + a day/week

نکته: this morning و tonight هم با حال ساده:
   I have a meeting this morning.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Present Simple vs Present Continuous",
                    content = """
حال ساده vs. حال استمراری:

حال ساده — عادت و حقایق:
I work at a bank.
He drinks coffee every morning.

حال استمراری — کارهای در حال انجام:
I am working right now.
He is drinking coffee at the moment.

کلمات کلیدی:
• حال ساده: usually, always, every day, never, on Mondays
• حال استمراری: now, right now, at the moment, today, this week

مثال مقایسه:
• She usually walks to work. (عادت)
• She is walking to work today. (امروز خاص)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Present Simple for Future",
                    content = """
حال ساده برای برنامه‌های زمان‌بندی‌شده در آینده هم استفاده می‌شود:

• The train leaves at 8 AM tomorrow.
• The movie starts at 7 PM.
• The class begins next Monday.

این ساختار برای:
• برنامه‌های رسمی
• رویدادهای ثابت
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Negative Yes/No Questions",
                    content = """
سؤالات منفی حالت تعجب یا تأیید انتظار را منتقل می‌کنند:

• Don't you like coffee?
• Doesn't she work here anymore?

پاسخ‌ها:
• Don't you like coffee? — Yes, I do.
• Don't you like coffee? — No, I don't.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "She work every day.",
                    correct = "She works every day.",
                    explanation = "در سوم شخص مفرد (he/she/it)، فعل باید -s یا -es بگیرد."
                ),
                CommonMistake(
                    wrong = "He doesn't works here.",
                    correct = "He doesn't work here.",
                    explanation = "بعد از doesn't، فعل به شکل ساده می‌آید."
                ),
                CommonMistake(
                    wrong = "Do she study English?",
                    correct = "Does she study English?",
                    explanation = "برای he/she/it از Does استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I am usually go to school.",
                    correct = "I usually go to school.",
                    explanation = "فعل be با فعل اصلی در یک جمله نمی‌آید."
                ),
                CommonMistake(
                    wrong = "I always am tired.",
                    correct = "I am always tired.",
                    explanation = "با فعل be، قید تکرار بعد از am/is/are می‌آید."
                ),
                CommonMistake(
                    wrong = "She go to school every day.",
                    correct = "She goes to school every day.",
                    explanation = "فعل go در سوم شخص مفرد به goes تبدیل می‌شود."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Sara",
                    english = "Hi Alex! What time do you usually wake up?",
                    persian = "سلام الکس! معمولاً چه ساعتی بیدار می‌شوی؟"
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "I usually wake up at 6:30. What about you?",
                    persian = "معمولاً ساعت ۶:۳۰ بیدار می‌شوم. تو چطور؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "I wake up at 7. I'm not a morning person.",
                    persian = "من ساعت ۷ بیدار می‌شوم. آدم صبح‌خیزی نیستم."
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "Really? I always feel energetic in the morning.",
                    persian = "واقعاً؟ همیشه صبح‌ها پرانرژی هستم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Lucky you! Do you exercise before work?",
                    persian = "خوش به حالت! قبل از کار ورزش می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "Yes, I usually go running for 30 minutes.",
                    persian = "بله، معمولاً ۳۰ دقیقه می‌دوم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "That's impressive. I never exercise in the morning.",
                    persian = "تحسین‌برانگیز است. هرگز صبح‌ها ورزش نمی‌کنم."
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "Do you exercise at all?",
                    persian = "اصلاً ورزش می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Yes, but only on weekends. I sometimes go to the gym on Saturdays.",
                    persian = "بله، ولی فقط آخر هفته‌ها. گاهی شنبه‌ها به باشگاه می‌روم."
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "That's better than nothing. What do you usually do for exercise?",
                    persian = "این بهتر از هیچیه. معمولاً چه ورزشی می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "I usually do yoga. It helps me relax.",
                    persian = "معمولاً یوگا می‌کنم. بهم کمک می‌کند آرام شوم."
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "Nice. Does your husband do yoga too?",
                    persian = "خوب. شوهرت هم یوگا می‌کند؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "No, he doesn't. He prefers weight training.",
                    persian = "نه، نمی‌کند. او تمرین با وزنه را ترجیح می‌دهد."
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "How often does he go to the gym?",
                    persian = "چند وقت یک‌بار به باشگاه می‌رود؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "He goes three times a week — Mondays, Wednesdays, and Fridays.",
                    persian = "هفته‌ای سه بار می‌رود — دوشنبه‌ها، چهارشنبه‌ها و جمعه‌ها."
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "That's a good routine. Do you two eat breakfast together?",
                    persian = "روتین خوبیه. شما دوتا با هم صبحانه می‌خورید؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Yes, we always have breakfast together at 8.",
                    persian = "بله، همیشه ساعت ۸ با هم صبحانه می‌خوریم."
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "That's nice. I usually skip breakfast because I'm not hungry.",
                    persian = "خوبه. معمولاً صبحانه را رد می‌کنم چون گرسنه نیستم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "You should eat something! Breakfast gives you energy.",
                    persian = "باید یه چیزی بخوری! صبحانه بهت انرژی می‌دهد."
                ),
                DialogueLine(
                    speaker = "Alex",
                    english = "You're right. Maybe I'll start tomorrow.",
                    persian = "حق داری. شاید از فردا شروع کنم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What time does Alex usually wake up?",
                    answer = "He usually wakes up at 6:30."
                ),
                ComprehensionQuestion(
                    question = "Does Sara exercise in the morning?",
                    answer = "No, she never exercises in the morning."
                ),
                ComprehensionQuestion(
                    question = "What kind of exercise does Sara do?",
                    answer = "She usually does yoga."
                ),
                ComprehensionQuestion(
                    question = "How often does Sara's husband go to the gym?",
                    answer = "He goes three times a week — Mondays, Wednesdays, and Fridays."
                ),
                ComprehensionQuestion(
                    question = "Why does Alex usually skip breakfast?",
                    answer = "Because he is not hungry in the morning."
                ),
                ComprehensionQuestion(
                    question = "What time do Sara and her husband have breakfast?",
                    answer = "They always have breakfast together at 8."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe your daily routine from morning to evening.",
                    promptPersian = "برنامه روزانه‌ات را از صبح تا شب توصیف کن.",
                    hints = "Use: I usually wake up at..., I always have..., I sometimes..., I never...\nAdd time expressions: every day, on Mondays, at night."
                ),
                SpeakingTask(
                    prompt = "Ask a partner 6 questions about their routine using Do/Does.",
                    promptPersian = "از یک دوست ۶ سؤال درباره برنامه‌اش با Do/Does بپرس.",
                    hints = "Examples:\n• What time do you usually...?\n• Do you ever...?\n• How often does your family...?"
                ),
                SpeakingTask(
                    prompt = "Talk about the differences between your weekday and weekend routine.",
                    promptPersian = "درباره تفاوت‌های برنامه روزهای هفته و آخر هفته‌ات صحبت کن.",
                    hints = "Use: On weekdays..., but on weekends...\nCompare: I usually..., but I rarely..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a paragraph (about 100 words) describing your typical weekday. Include at least five present simple sentences, three frequency adverbs, and three time expressions.",
                    promptPersian = "یک پاراگراف (حدود ۱۰۰ کلمه) درباره یک روز معمولی هفته‌ات بنویس. حداقل پنج جمله حال ساده، سه قید تکرار و سه عبارت زمانی به کار ببر.",
                    wordCount = 100,
                    hints = "Structure:\n1. What time you wake up\n2. What you do in the morning\n3. What you do at work/school\n4. What you do in the evening"
                ),
                WritingTask(
                    prompt = "Compare your routine with a family member's routine (about 120 words).",
                    promptPersian = "برنامه‌ات را با برنامه یکی از اعضای خانواده مقایسه کن (حدود ۱۲۰ کلمه).",
                    wordCount = 120,
                    hints = "Use: My mother always... but I usually...\nInclude: both similarities and differences."
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: She ___ at a hospital every day.",
                    options = listOf("work", "works", "working", "is work"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "He don't like coffee.",
                        "He doesn't likes coffee.",
                        "He doesn't like coffee.",
                        "He not like coffee."
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: ___ she study English?",
                    options = listOf("Do", "Does", "Is", "Are"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Where do frequency adverbs usually go?",
                    options = listOf(
                        "After the main verb",
                        "Before the main verb",
                        "At the end of the sentence",
                        "After the subject only"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ go to the gym — maybe once a year.",
                    options = listOf("always", "usually", "sometimes", "hardly ever"),
                    correctIndex = 3
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "She go to school every day.",
                        "She goes to school every day.",
                        "She going to school every day.",
                        "She is go to school every day."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ tired in the mornings.",
                    options = listOf(
                        "always am",
                        "am always",
                        "always be",
                        "be always"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which sentence is about a habit?",
                    options = listOf(
                        "I am drinking tea right now.",
                        "I drink tea every morning.",
                        "I will drink tea tomorrow.",
                        "I drank tea yesterday."
                    ),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 2 — Present Continuous
    // ============================================================
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Present Continuous",
            titlePersian = "زمان حال استمراری",
            objectives = listOf(
                "Use the present continuous for actions happening now.",
                "Describe temporary situations and current trends.",
                "Talk about future arrangements with present continuous.",
                "Distinguish between present simple and present continuous.",
                "Master common stative verbs not used in continuous form."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "currently",
                    persian = "در حال حاضر",
                    pronunciation = "/ˈkɜːrəntli/",
                    partOfSpeech = "adverb",
                    example = "I'm currently working on a new project.",
                    examplePersian = "در حال حاضر روی یک پروژه جدید کار می‌کنم.",
                    collocations = "currently working, currently studying",
                    synonyms = "at present, right now",
                    usageTip = "معمولاً با زمان استمراری."
                ),
                VocabWord(
                    english = "at the moment",
                    persian = "در این لحظه",
                    pronunciation = "/æt ðə ˈmoʊmənt/",
                    partOfSpeech = "time expression",
                    example = "She is busy at the moment.",
                    examplePersian = "در این لحظه مشغول است.",
                    synonyms = "right now, currently",
                    usageTip = "عبارت کلیدی برای حال استمراری."
                ),
                VocabWord(
                    english = "temporary",
                    persian = "موقت",
                    pronunciation = "/ˈtempəreri/",
                    partOfSpeech = "adjective",
                    example = "This is just a temporary job.",
                    examplePersian = "این فقط یک کار موقت است.",
                    antonyms = "permanent",
                    wordFamily = "temporarily",
                    usageTip = "موقعیت‌های موقت با حال استمراری."
                ),
                VocabWord(
                    english = "trend",
                    persian = "روند، ترند",
                    pronunciation = "/trend/",
                    partOfSpeech = "noun",
                    example = "More people are working from home these days.",
                    examplePersian = "این روزها افراد بیشتری از خانه کار می‌کنند.",
                    collocations = "current trend, growing trend",
                    wordFamily = "trendy",
                    usageTip = "روندهای در حال تغییر."
                ),
                VocabWord(
                    english = "arrangement",
                    persian = "هماهنگی، قرار",
                    pronunciation = "/əˈreɪndʒmənt/",
                    partOfSpeech = "noun",
                    example = "I have an arrangement to meet her tomorrow.",
                    examplePersian = "قرار ملاقاتی برای دیدارش فردا دارم.",
                    collocations = "make arrangements",
                    wordFamily = "arrange",
                    usageTip = "قرارهای از قبل تعیین‌شده."
                ),
                VocabWord(
                    english = "these days",
                    persian = "این روزها",
                    pronunciation = "/ðiːz deɪz/",
                    partOfSpeech = "time expression",
                    example = "These days, I'm learning Spanish.",
                    examplePersian = "این روزها دارم اسپانیایی یاد می‌گیرم.",
                    synonyms = "nowadays, currently",
                    usageTip = "برای روندهای فعلی."
                ),
                VocabWord(
                    english = "nowadays",
                    persian = "امروزه",
                    pronunciation = "/ˈnaʊədeɪz/",
                    partOfSpeech = "adverb",
                    example = "Nowadays, most people use smartphones.",
                    examplePersian = "امروزه بیشتر مردم از گوشی هوشمند استفاده می‌کنند.",
                    synonyms = "these days, currently",
                    usageTip = "با حال استمراری زیاد می‌آید."
                ),
                VocabWord(
                    english = "increase",
                    persian = "افزایش یافتن",
                    pronunciation = "/ɪnˈkriːs/",
                    partOfSpeech = "verb",
                    example = "The number of remote workers is increasing.",
                    examplePersian = "تعداد کارکنان دورکار در حال افزایش است.",
                    collocations = "increase rapidly",
                    antonyms = "decrease",
                    wordFamily = "increasing",
                    usageTip = "برای بیان روند."
                ),
                VocabWord(
                    english = "process",
                    persian = "فرایند",
                    pronunciation = "/ˈprɑːses/",
                    partOfSpeech = "noun",
                    example = "The project is in the planning process.",
                    examplePersian = "پروژه در فرایند برنامه‌ریزی است.",
                    collocations = "in the process of",
                    usageTip = "با in the process of + verb-ing."
                ),
                VocabWord(
                    english = "stative verb",
                    persian = "فعل حالتی",
                    pronunciation = "/ˈsteɪtɪv vɜːrb/",
                    partOfSpeech = "noun",
                    example = "Know, like, and want are stative verbs.",
                    examplePersian = "know، like و want افعال حالتی هستند.",
                    usageTip = "این افعال معمولاً در زمان استمراری استفاده نمی‌شوند."
                ),
                VocabWord(
                    english = "situation",
                    persian = "وضعیت",
                    pronunciation = "/ˌsɪtʃuˈeɪʃən/",
                    partOfSpeech = "noun",
                    example = "The situation is getting better.",
                    examplePersian = "وضعیت در حال بهتر شدن است.",
                    collocations = "current situation, difficult situation",
                    usageTip = "برای توصیف وضعیت‌های در حال تغییر."
                ),
                VocabWord(
                    english = "change",
                    persian = "تغییر",
                    pronunciation = "/tʃeɪndʒ/",
                    partOfSpeech = "verb/noun",
                    example = "The weather is changing rapidly.",
                    examplePersian = "آب و هوا به سرعت در حال تغییر است.",
                    collocations = "change dramatically, change slowly",
                    wordFamily = "changeable, unchanged",
                    usageTip = "افعال تغییر با حال استمراری زیاد می‌آیند."
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
                    english = "up to something",
                    persian = "داشتن کار پنهانی",
                    example = "What are you up to?",
                    examplePersian = "چه کار می‌کنی؟ (با کنجکاوی)",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "going on",
                    persian = "در حال وقوع",
                    example = "What's going on here?",
                    examplePersian = "اینجا چه خبره؟",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "work on",
                    meaning = "to spend time improving or producing something",
                    persian = "کار کردن روی چیزی",
                    example = "She is working on a new project.",
                    examplePersian = "دارد روی یک پروژه جدید کار می‌کند."
                ),
                PhrasalVerb(
                    verb = "look for",
                    meaning = "to try to find",
                    persian = "جستجو کردن",
                    example = "He is looking for his keys.",
                    examplePersian = "دارد دنبال کلیدهایش می‌گردد."
                ),
                PhrasalVerb(
                    verb = "wait for",
                    meaning = "to stay until someone or something arrives",
                    persian = "منتظر بودن",
                    example = "I'm waiting for the bus.",
                    examplePersian = "دارم منتظر اتوبوس هستم."
                ),
                PhrasalVerb(
                    verb = "get ready",
                    meaning = "to prepare",
                    persian = "آماده شدن",
                    example = "She is getting ready for the party.",
                    examplePersian = "دارد برای مهمانی آماده می‌شود."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Contractions with be",
                    content = "در گفتار طبیعی:\n• I am → I'm /aɪm/\n• You are → You're /jʊr/\n• He is → He's /hiːz/\n• She is → She's /ʃiːz/\n• They are → They're /ðer/"
                ),
                PronunciationTip(
                    title = "Sentence stress in present continuous",
                    content = "معمولاً فعل -ing تأکید می‌گیرد:\n• She is WALKing.\n• He is WORKing."
                ),
                PronunciationTip(
                    title = "Linking sounds",
                    content = "در گفتار سریع، is often links:\n• She's waiting\n• They're working"
                ),
                PronunciationTip(
                    title = "Rising intonation in questions",
                    content = "آهنگ صعودی در سؤالات استمراری:\n• Are you working? ↑\n• Is she studying? ↑"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Present continuous in daily conversation",
                    content = "بومی‌زبانان برای توصیف وضعیت لحظه‌ای زیاد از حال استمراری استفاده می‌کنند: 'I'm reading a great book.' (حتی اگر کتاب را همین لحظه نخوانند، ولی در این دوره مشغول آن هستند)."
                ),
                CulturalNote(
                    title = "Future arrangements",
                    content = "در انگلیسی، قرارهای از قبل تعیین‌شده با حال استمراری بیان می‌شوند: 'I'm meeting Ali tomorrow.' این ساختار در محیط‌های کاری رسمی هم رایج است."
                ),
                CulturalNote(
                    title = "Trends and changes",
                    content = "گزارش‌های خبری و مقالات تحلیلی از حال استمراری برای توصیف روندها استفاده می‌کنند: 'More companies are adopting hybrid work.'"
                ),
                CulturalNote(
                    title = "Stative verbs",
                    content = "افعالی مثل know, like, want, believe, understand هرگز در حالت استمراری نمی‌آیند — 'I know him' نه 'I am knowing him'."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Present Continuous: Structure",
                    content = """
زمان حال استمراری برای کارهایی که همین حالا در حال وقوع هستند.

ساختار مثبت:
Subject + am/is/are + verb-ing

I am working.
She is studying.
They are playing football.

ساختار منفی:
Subject + am/is/are + not + verb-ing

I'm not working.
He isn't studying.
They aren't playing.

ساختار سؤالی:
Am/Is/Are + Subject + verb-ing?

Are you working? — Yes, I am. / No, I'm not.
Is she studying? — Yes, she is. / No, she isn't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Spelling of -ing",
                    content = """
قواعد املای -ing:

• اکثر افعال: فقط + ing
   work → working, read → reading, play → playing

• افعال منتهی به silent -e: حذف e + ing
   make → making, write → writing, take → taking

• افعال کوتاه منتهی به consonant + vowel + consonant:
  تکرار consonant + ing
   run → running, sit → sitting, stop → stopping

• افعال منتهی به -ie:
   lie → lying, die → dying

• افعال منتهی به -ee, -oe, -ye:
   see → seeing, agree → agreeing
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Uses of Present Continuous",
                    content = """
کاربردهای زمان حال استمراری:

1. کارهای در حال انجام همین لحظه:
   I am writing an email right now.

2. وضعیت‌های موقت:
   She is staying with her parents this week.

3. روندهای در حال تغییر:
   Prices are going up.

4. قرارهای از قبل تعیین‌شده (آینده نزدیک):
   I'm meeting Ali tomorrow at 3.
   We're flying to Paris next week.

5. کارهای آزاردهنده با always:
   He is always losing his keys!
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Present Continuous vs Present Simple",
                    content = """
مقایسه دقیق:

| Present Simple | Present Continuous |
|----------------|---------------------|
| عادت | در حال انجام |
| I work every day. | I'm working right now. |
| She usually drinks tea. | She's drinking coffee today. |
| حقایق کلی | وضعیت‌های موقت |
| The sun rises in the east. | The weather is getting warmer. |

کلمات کلیدی:
• حال ساده: always, usually, every day, on Mondays
• حال استمراری: now, right now, at the moment, today, these days
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Stative Verbs",
                    content = """
افعال حالتی (Stative Verbs) که معمولاً در زمان استمراری نمی‌آیند:

• افعال فکری: know, believe, understand, remember, forget, think (as opinion)
• افعال احساسی: like, love, hate, prefer, want, need
• افعال حسی: see, hear, smell, taste, feel
• افعال مالکیت: have (possess), own, belong
• افعال دیگر: be, seem, appear, cost, weigh

مثال‌های اشتباه:
❌ I am knowing him.
✅ I know him.

❌ She is wanting a car.
✅ She wants a car.

استثنا: برخی از این افعال در معنی دیگر می‌توانند استمراری شوند:
• I think (believe) → I'm thinking (considering)
• I have (possess) → I'm having lunch (eating)
• She is (state) → She is being silly (acting)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Present Continuous for Future",
                    content = """
حال استمراری برای قرارهای آینده که از قبل هماهنگ شده‌اند:

• I'm meeting Ali tomorrow at 3.
• We're flying to Paris next week.
• She's having dinner with her parents tonight.
• They're getting married in June.

تفاوت با going to:
• Present continuous: قرار قطعی و هماهنگ‌شده
• Going to: قصد و برنامه، ولی شاید جزئیات مشخص نشده

مثال:
• I'm seeing the doctor at 4. (قرار مشخص)
• I'm going to see the doctor soon. (قصد کلی)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Present Continuous with Always",
                    content = """
با always + حال استمراری، حالت آزاردهنده یا تعجب را نشان می‌دهیم:

• He is always losing his keys! (آزاردهنده)
• She is constantly complaining. (آزاردهنده)
• They are forever arguing. (آزاردهنده)

مقایسه:
• She always arrives late. (عادت معمولی — خبری)
• She is always arriving late! (شکایت)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Time Expressions",
                    content = """
عبارت‌های زمانی رایج با حال استمراری:

• now, right now
• at the moment, at present
• currently, presently
• today, tonight, this week, this month, this year
• these days, nowadays
• still

مثال:
• I'm reading a great book these days.
• She is still working at the hospital.
• Are you busy right now?
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I am knowing him well.",
                    correct = "I know him well.",
                    explanation = "know فعل حالتی است و در استمراری نمی‌آید."
                ),
                CommonMistake(
                    wrong = "She is wanting a new phone.",
                    correct = "She wants a new phone.",
                    explanation = "want فعل حالتی است."
                ),
                CommonMistake(
                    wrong = "He is haveing lunch.",
                    correct = "He is having lunch.",
                    explanation = "املای have در -ing: حذف e قبل از ing."
                ),
                CommonMistake(
                    wrong = "They are runing in the park.",
                    correct = "They are running in the park.",
                    explanation = "run: تکرار n قبل از ing (consonant-vowel-consonant)."
                ),
                CommonMistake(
                    wrong = "What you are doing?",
                    correct = "What are you doing?",
                    explanation = "در سؤالات، فعل be قبل از فاعل می‌آید."
                ),
                CommonMistake(
                    wrong = "I am work right now.",
                    correct = "I am working right now.",
                    explanation = "بعد از am/is/are باید verb+ing بیاید."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Emma",
                    english = "Hi James! What are you doing?",
                    persian = "سلام جیمز! چه کار می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "James",
                    english = "I'm studying for my exam tomorrow. What about you?",
                    persian = "دارم برای امتحان فردام درس می‌خوانم. تو چطور؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm just relaxing. I finished my project yesterday.",
                    persian = "من فقط دارم استراحت می‌کنم. پروژه‌ام را دیروز تمام کردم."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Nice! Are you doing anything special this weekend?",
                    persian = "خوبه! این آخر هفته کار خاصی می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Yes, I'm visiting my parents on Saturday.",
                    persian = "بله، شنبه دارم می‌رم پدر و مادرم را ببینم."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "That sounds nice. Are they still living in Manchester?",
                    persian = "خوب به نظر می‌رسد. آنها هنوز در منچستر زندگی می‌کنند؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Yes, they are. They've been there for 20 years.",
                    persian = "بله. ۲۰ ساله آنجا هستند."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Are you taking the train?",
                    persian = "با قطار می‌روی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Yes, I'm leaving early in the morning.",
                    persian = "بله، صبح زود حرکت می‌کنم."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Are you staying overnight?",
                    persian = "شب می‌مانی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Yes, I'm coming back on Sunday evening.",
                    persian = "بله، یکشنبه عصر برمی‌گردم."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "What are your parents doing these days?",
                    persian = "این روزها والدینت چه کار می‌کنند؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "My dad is working on a new book, and my mom is learning Italian.",
                    persian = "پدرم روی یه کتاب جدید کار می‌کند و مادرم دارد ایتالیایی یاد می‌گیرد."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Wow, that's impressive. Why is she learning Italian?",
                    persian = "واو، تحسین‌برانگیز است. چرا دارد ایتالیایی یاد می‌گیرد؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "They're planning a trip to Italy next year.",
                    persian = "دارند برای سال بعد یه سفر به ایتالیا برنامه‌ریزی می‌کنند."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "That's exciting! Are you going with them?",
                    persian = "هیجان‌انگیزه! با آن‌ها می‌روی؟"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I'm thinking about it. But I'm saving money right now.",
                    persian = "دارم بهش فکر می‌کنم. ولی در حال حاضر پول پس‌انداز می‌کنم."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Good plan. Well, I should get back to studying.",
                    persian = "برنامه خوبی. خب، باید به درس خواندن برگردم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Good luck with your exam! See you later.",
                    persian = "برای امتحانت موفق باشی! بعداً می‌بینمت."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Thanks! See you!",
                    persian = "ممنون! می‌بینمت!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is James doing right now?",
                    answer = "He is studying for his exam tomorrow."
                ),
                ComprehensionQuestion(
                    question = "What is Emma doing this weekend?",
                    answer = "She is visiting her parents on Saturday."
                ),
                ComprehensionQuestion(
                    question = "Where do Emma's parents live?",
                    answer = "They live in Manchester."
                ),
                ComprehensionQuestion(
                    question = "What are Emma's parents doing these days?",
                    answer = "Her dad is working on a new book, and her mom is learning Italian."
                ),
                ComprehensionQuestion(
                    question = "Why is Emma's mom learning Italian?",
                    answer = "Because they are planning a trip to Italy next year."
                ),
                ComprehensionQuestion(
                    question = "What is Emma doing with her money?",
                    answer = "She is saving money right now."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe what your family members are doing right now.",
                    promptPersian = "توصیف کن اعضای خانواده‌ات در این لحظه چه کار می‌کنند.",
                    hints = "Use: My mother is..., My father is..., My brother is...\nAdd context: right now, at the moment."
                ),
                SpeakingTask(
                    prompt = "Talk about a project you are currently working on.",
                    promptPersian = "درباره پروژه‌ای که در حال حاضر روی آن کار می‌کنی صحبت کن.",
                    hints = "Use: I'm working on..., I'm learning..., I'm trying to..."
                ),
                SpeakingTask(
                    prompt = "Describe a trend you've noticed in your city or country.",
                    promptPersian = "روندی که در شهر یا کشورت متوجه شده‌ای را توصیف کن.",
                    hints = "Use: More people are..., These days, ... is becoming..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about what you and your friends are doing these days (about 120 words). Use at least six present continuous sentences.",
                    promptPersian = "درباره اینکه تو و دوستانت این روزها چه کار می‌کنید بنویس (حدود ۱۲۰ کلمه). حداقل شش جمله حال استمراری به کار ببر.",
                    wordCount = 120,
                    hints = "Include:\n- Personal activities (studying, working)\n- Future arrangements\n- Current trends"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: She ___ a book right now.",
                    options = listOf("reads", "reading", "is reading", "read"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct spelling.",
                    options = listOf("runing", "running", "runnning", "runing"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is a stative verb?",
                    options = listOf("work", "play", "know", "walk"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: ___ you working right now?",
                    options = listOf("Do", "Does", "Are", "Is"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "I am knowing the answer.",
                        "I know the answer.",
                        "I am know the answer.",
                        "I knowing the answer."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: We ___ to Paris next week.",
                    options = listOf("fly", "are flying", "flies", "flew"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'I'm in the middle of' mean?",
                    options = listOf(
                        "در وسط اتاق",
                        "در حال انجام کاری",
                        "در میانه راه",
                        "در حال استراحت"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She is always ___ her keys!",
                    options = listOf("lose", "losing", "loses", "lost"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 3 — Past Simple
    // ============================================================
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Past Simple",
            titlePersian = "زمان گذشته ساده",
            objectives = listOf(
                "Talk about completed actions in the past.",
                "Form regular and irregular past verbs correctly.",
                "Use past time expressions like yesterday, last week, ago.",
                "Form past simple negatives and questions with did.",
                "Distinguish between was/were and did."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "yesterday",
                    persian = "دیروز",
                    pronunciation = "/ˈjestərdeɪ/",
                    partOfSpeech = "adverb",
                    example = "I saw her yesterday.",
                    examplePersian = "دیروز او را دیدم.",
                    collocations = "yesterday morning, yesterday afternoon",
                    usageTip = "با زمان گذشته ساده."
                ),
                VocabWord(
                    english = "ago",
                    persian = "پیش",
                    pronunciation = "/əˈɡoʊ/",
                    partOfSpeech = "adverb",
                    example = "She left two hours ago.",
                    examplePersian = "او دو ساعت پیش رفت.",
                    collocations = "two days ago, a week ago, a long time ago",
                    usageTip = "بعد از عبارت زمانی می‌آید."
                ),
                VocabWord(
                    english = "last night",
                    persian = "دیشب",
                    pronunciation = "/læst naɪt/",
                    partOfSpeech = "time expression",
                    example = "We watched a movie last night.",
                    examplePersian = "دیشب فیلم دیدیم.",
                    collocations = "last week, last month, last year",
                    usageTip = "با زمان گذشته ساده."
                ),
                VocabWord(
                    english = "regular verb",
                    persian = "فعل باقاعده",
                    pronunciation = "/ˈreɡjələr vɜːrb/",
                    partOfSpeech = "noun",
                    example = "Work is a regular verb — its past is worked.",
                    examplePersian = "work یک فعل باقاعده است — گذشته‌اش worked است.",
                    usageTip = "افعال باقاعده با -ed گذشته می‌شوند."
                ),
                VocabWord(
                    english = "irregular verb",
                    persian = "فعل بی‌قاعده",
                    pronunciation = "/ɪˈreɡjələr vɜːrb/",
                    partOfSpeech = "noun",
                    example = "Go is an irregular verb — its past is went.",
                    examplePersian = "go یک فعل بی‌قاعده است — گذشته‌اش went است.",
                    usageTip = "افعال بی‌قاعده را باید حفظ کرد."
                ),
                VocabWord(
                    english = "completed",
                    persian = "تمام‌شده",
                    pronunciation = "/kəmˈpliːtɪd/",
                    partOfSpeech = "adjective",
                    example = "The action was completed yesterday.",
                    examplePersian = "این کار دیروز تمام شد.",
                    usageTip = "زمان گذشته ساده برای کارهای تمام‌شده."
                ),
                VocabWord(
                    english = "specific time",
                    persian = "زمان مشخص",
                    pronunciation = "/spəˈsɪfɪk taɪm/",
                    partOfSpeech = "noun phrase",
                    example = "I met him at 3 PM yesterday.",
                    examplePersian = "دیروز ساعت ۳ او را دیدم.",
                    usageTip = "زمان گذشته ساده با زمان مشخص."
                ),
                VocabWord(
                    english = "sequence",
                    persian = "زنجیره، توالی",
                    pronunciation = "/ˈsiːkwəns/",
                    partOfSpeech = "noun",
                    example = "He finished his work, then left.",
                    examplePersian = "کارش را تمام کرد، سپس رفت.",
                    collocations = "in sequence, sequence of events",
                    usageTip = "برای رویدادهای پشت سر هم."
                ),
                VocabWord(
                    english = "biography",
                    persian = "زندگی‌نامه",
                    pronunciation = "/baɪˈɑːɡrəfi/",
                    partOfSpeech = "noun",
                    example = "I read a biography of Einstein.",
                    examplePersian = "زندگی‌نامه‌ای از انیشتین خواندم.",
                    usageTip = "معمولاً با زمان گذشته نوشته می‌شود."
                ),
                VocabWord(
                    english = "historical",
                    persian = "تاریخی",
                    pronunciation = "/hɪˈstɔːrɪkəl/",
                    partOfSpeech = "adjective",
                    example = "Historical events are described in past tense.",
                    examplePersian = "رویدادهای تاریخی با زمان گذشته بیان می‌شوند.",
                    wordFamily = "history, historian",
                    usageTip = "با زمان گذشته ساده."
                ),
                VocabWord(
                    english = "narrative",
                    persian = "روایت",
                    pronunciation = "/ˈnærətɪv/",
                    partOfSpeech = "noun",
                    example = "The narrative is set in the 19th century.",
                    examplePersian = "این روایت در قرن ۱۹ اتفاق می‌افتد.",
                    usageTip = "معمولاً با زمان گذشته."
                ),
                VocabWord(
                    english = "moment",
                    persian = "لحظه",
                    pronunciation = "/ˈmoʊmənt/",
                    partOfSpeech = "noun",
                    example = "At that moment, I realized the truth.",
                    examplePersian = "در آن لحظه، حقیقت را فهمیدم.",
                    collocations = "at that moment, in a moment",
                    usageTip = "با زمان گذشته ساده."
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
                    english = "long ago",
                    persian = "خیلی وقت پیش",
                    example = "That happened a long time ago.",
                    examplePersian = "این خیلی وقت پیش اتفاق افتاد.",
                    register = "neutral"
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
                    verb = "run into",
                    meaning = "to meet by chance",
                    persian = "اتفاقی دیدن",
                    example = "I ran into an old friend yesterday.",
                    examplePersian = "دیروز اتفاقی یه دوست قدیمی را دیدم."
                ),
                PhrasalVerb(
                    verb = "find out",
                    meaning = "to discover",
                    persian = "فهمیدن",
                    example = "She found out the truth last week.",
                    examplePersian = "او هفته پیش حقیقت را فهمید."
                ),
                PhrasalVerb(
                    verb = "give up",
                    meaning = "to stop trying",
                    persian = "تسلیم شدن",
                    example = "He gave up smoking two years ago.",
                    examplePersian = "دو سال پیش سیگار را ترک کرد."
                ),
                PhrasalVerb(
                    verb = "take off",
                    meaning = "to remove (clothes) / to leave the ground (plane)",
                    persian = "درآوردن / بلند شدن هواپیما",
                    example = "The plane took off at 6 AM.",
                    examplePersian = "هواپیما ساعت ۶ صبح بلند شد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "-ed endings: /t/, /d/, /ɪd/",
                    content = "پایان -ed سه تلفظ دارد:\n• /t/ بعد از صداهای بی‌صدا: worked, liked, watched\n• /d/ بعد از صداهای صدادار: played, lived, arrived\n• /ɪd/ بعد از t یا d: wanted, needed, decided"
                ),
                PronunciationTip(
                    title = "Irregular verb stress",
                    content = "افعال بی‌قاعده معمولاً تک‌سیلابی هستند و تأکید روی همان سیلاب است:\n• went /went/\n• saw /sɔː/\n• took /tʊk/"
                ),
                PronunciationTip(
                    title = "Sentence stress in past",
                    content = "در جمله‌های خبری، فعل اصلی تأکید دارد:\n• She WENT to Paris.\n• He SAW her yesterday."
                ),
                PronunciationTip(
                    title = "Did + verb",
                    content = "بعد از did، فعل اصلی به شکل ساده (base form) می‌آید:\n• Did you GO?\n• Did she SEE?"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Storytelling in English",
                    content = "در فرهنگ‌های انگلیسی‌زبان، داستان‌گویی بخش مهمی از مکالمات روزمره است. زمان گذشته ساده اصلی‌ترین زمان برای روایت است."
                ),
                CulturalNote(
                    title = "Time expressions",
                    content = "در انگلیسی، برای زمان‌های مشخص گذشته حتماً از گذشته ساده استفاده می‌کنیم: yesterday, last week, in 2010, two days ago."
                ),
                CulturalNote(
                    title = "Historical narratives",
                    content = "کتاب‌های تاریخی و بیوگرافی‌ها معمولاً با زمان گذشته ساده نوشته می‌شوند: 'Shakespeare wrote many famous plays.'"
                ),
                CulturalNote(
                    title = "Politeness",
                    content = "در تعارف‌ها و درخواست‌های مؤدبانه، انگلیسی‌زبانان گاهی از گذشته ساده استفاده می‌کنند: 'I was wondering if...'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Past Simple: Structure",
                    content = """
زمان گذشته ساده برای کارهای تمام‌شده در گذشته.

ساختار مثبت:
Subject + past verb

I worked yesterday.
She went to Paris last week.
They saw a movie last night.

ساختار منفی:
Subject + did not (didn't) + Base Verb

I didn't work yesterday.
She didn't go to Paris.
They didn't see a movie.

ساختار سؤالی:
Did + Subject + Base Verb?

Did you work yesterday? — Yes, I did. / No, I didn't.
Did she go to Paris? — Yes, she did. / No, she didn't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Regular Verbs: -ed Spelling",
                    content = """
قواعد املای -ed برای افعال باقاعده:

• اکثر افعال: + ed
   work → worked, play → played, watch → watched

• افعال منتهی به -e: فقط + d
   live → lived, love → loved, like → liked

• افعال consonant + y: y → ied
   study → studied, carry → carried, try → tried

• افعال vowel + y: فقط + ed
   play → played, stay → stayed

• افعال کوتاه CVC: تکرار consonant + ed
   stop → stopped, plan → planned, hug → hugged
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Common Irregular Verbs",
                    content = """
افعال بی‌قاعده پرکاربرد:

| Base | Past | Base | Past |
|------|------|------|------|
| be | was/were | have | had |
| go | went | do | did |
| see | saw | make | made |
| get | got | take | took |
| come | came | give | gave |
| know | knew | say | said |
| think | thought | find | found |
| tell | told | become | became |
| show | showed | leave | left |
| feel | felt | put | put |
| bring | brought | begin | began |
| keep | kept | hold | held |
| write | wrote | stand | stood |
| hear | heard | let | let |
| mean | meant | set | set |
| meet | met | run | ran |
| pay | paid | sit | sat |
| speak | spoke | lie | lay |
| lead | led | read | read |
| grow | grew | lose | lost |
| fall | fell | send | sent |
| build | built | understand | understood |
| draw | drew | break | broke |
| spend | spent | cut | cut |
| rise | rose | drive | drove |
| buy | bought | wear | wore |
| choose | chose | eat | ate |
| drink | drank | sing | sang |
| swim | swam | forget | forgot |
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Was / Were",
                    content = """
فعل be در گذشته دو شکل دارد:

• was: I, he, she, it
   I was tired yesterday.
   She was at home last night.

• were: you, we, they
   You were late.
   They were happy.

منفی:
• I wasn't tired.
• They weren't at home.

سؤالی:
• Was she at home? — Yes, she was.
• Were they happy? — No, they weren't.

نکته: was/were با did نمی‌آید:
❌ Did you were at home?
✅ Were you at home?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Time Expressions",
                    content = """
عبارت‌های زمانی رایج با گذشته ساده:

• yesterday, yesterday morning
• last + night/week/month/year/summer
• ago: two days ago, a week ago, a long time ago
• in + سال: in 1990, in 2010
• when + جمله: when I was young
• on + روز گذشته: on Monday, on my birthday
• at + ساعت گذشته: at 3 PM

مثال:
• I was born in 1995.
• We met last summer.
• She called me two hours ago.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Sequence of Events",
                    content = """
برای رویدادهای پشت سر هم در گذشته:

• First, then, after that, next, finally, eventually

مثال:
• First, I woke up. Then, I had breakfast. After that, I went to work.

یا با استفاده از کلمات ربط:
• After I had breakfast, I went to work.
• Before I went to bed, I read a book.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Past Simple in Narratives",
                    content = """
زمان گذشته ساده قلب روایت‌ها و داستان‌گویی است:

• Once upon a time, a young girl lived in a small village.
• Yesterday, something strange happened.
• Last summer, we traveled to Turkey.

در داستان‌ها، معمولاً با حال ساده در دیالوگ‌ها ترکیب می‌شود:
• She said, "I am tired." (گفت، «خسته‌ام»)
• He asked, "Where are you going?" (پرسید، «کجا می‌روی؟»)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Past Simple for Polite Requests",
                    content = """
انگلیسی‌زبانان از گذشته ساده برای مؤدبانه‌تر شدن درخواست‌ها استفاده می‌کنند:

• I wanted to ask you a question. (مؤدبانه‌تر از I want)
• I was wondering if you could help me.
• Did you want to see me?

این ساختار فاصله و احترام را نشان می‌دهد.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I didn't went there.",
                    correct = "I didn't go there.",
                    explanation = "بعد از didn't، فعل به شکل ساده (base form) می‌آید."
                ),
                CommonMistake(
                    wrong = "Did you saw her?",
                    correct = "Did you see her?",
                    explanation = "بعد از did، فعل ساده است."
                ),
                CommonMistake(
                    wrong = "I was go to school.",
                    correct = "I went to school.",
                    explanation = "was با فعل اصلی نمی‌آید؛ از فعل گذشته استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "She didn't was at home.",
                    correct = "She wasn't at home.",
                    explanation = "was/were با did نمی‌آید."
                ),
                CommonMistake(
                    wrong = "Did you were happy?",
                    correct = "Were you happy?",
                    explanation = "برای فعل be، از was/were در ابتدای سؤال استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I stoped at the store.",
                    correct = "I stopped at the store.",
                    explanation = "stop: تکرار p قبل از -ed (consonant-vowel-consonant)."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Maria",
                    english = "How was your weekend?",
                    persian = "آخر هفته‌ات چطور بود؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "It was great! I went to the mountains with some friends.",
                    persian = "عالی بود! با چند تا دوست رفتم کوه."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Nice! What did you do there?",
                    persian = "خوبه! آنجا چه کار کردید؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "We hiked for five hours and had a picnic.",
                    persian = "پنج ساعت پیاده‌روی کردیم و پیک‌نیک داشتیم."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Did you see any animals?",
                    persian = "حیوانی دیدید؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Yes, we saw some deer and a fox!",
                    persian = "بله، چند آهو و یه روباه دیدیم!"
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Wow! Did you take any photos?",
                    persian = "واو! عکس گرفتید؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Yes, I took about a hundred photos!",
                    persian = "بله، حدود صد تا عکس گرفتم!"
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "What did you eat?",
                    persian = "چی خوردید؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "We ate sandwiches and fruit. We also drank lots of water.",
                    persian = "ساندویچ و میوه خوردیم. آب هم زیاد خوردیم."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Did you stay overnight?",
                    persian = "شب ماندید؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "No, we didn't. We came back in the evening.",
                    persian = "نه. عصر برگشتیم."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "How was the weather?",
                    persian = "آب و هوا چطور بود؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "It was sunny and warm. Perfect for hiking.",
                    persian = "آفتابی و گرم بود. عالی برای پیاده‌روی."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "That sounds like a wonderful trip. What about you?",
                    persian = "سفر فوق‌العاده‌ای به نظر می‌رسد. تو چطور؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Wait — I'm asking you! How was your weekend?",
                    persian = "صبر کن — من دارم از تو می‌پرسم! آخر هفته‌ات چطور بود؟"
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Oh, right! I stayed home. I wasn't feeling well.",
                    persian = "آه، درسته! من خونه موندم. حالم خوب نبود."
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "I'm sorry to hear that. Are you better now?",
                    persian = "متأسفم. الان بهتری؟"
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Yes, much better. I rested all weekend.",
                    persian = "بله، خیلی بهتر. تمام آخر هفته استراحت کردم."
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Good. Maybe we can plan a trip together sometime.",
                    persian = "خوبه. شاید یه وقت بتونیم با هم سفر برنامه‌ریزی کنیم."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "I'd love that!",
                    persian = "خیلی دوست دارم!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Where did Tom go last weekend?",
                    answer = "He went to the mountains with some friends."
                ),
                ComprehensionQuestion(
                    question = "What animals did they see?",
                    answer = "They saw some deer and a fox."
                ),
                ComprehensionQuestion(
                    question = "What did they eat?",
                    answer = "They ate sandwiches and fruit, and drank lots of water."
                ),
                ComprehensionQuestion(
                    question = "Did they stay overnight?",
                    answer = "No, they didn't. They came back in the evening."
                ),
                ComprehensionQuestion(
                    question = "How was the weather?",
                    answer = "It was sunny and warm."
                ),
                ComprehensionQuestion(
                    question = "Why did Maria stay home?",
                    answer = "Because she wasn't feeling well."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about what you did last weekend.",
                    promptPersian = "درباره کارهایی که آخر هفته گذشته انجام دادی صحبت کن.",
                    hints = "Use: I went..., I saw..., I met..., I didn't..."
                ),
                SpeakingTask(
                    prompt = "Tell a story about a memorable trip.",
                    promptPersian = "داستانی از یک سفر به‌یادماندنی تعریف کن.",
                    hints = "Start: Last year, I went to...\nThen: First..., After that..., Finally..."
                ),
                SpeakingTask(
                    prompt = "Talk about what you did yesterday from morning to night.",
                    promptPersian = "درباره کارهایی که دیروز از صبح تا شب انجام دادی صحبت کن.",
                    hints = "Use time order: First..., Then..., After that..., Finally..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about a memorable day in your life (about 150 words). Use at least eight past simple sentences, including regular and irregular verbs.",
                    promptPersian = "درباره یک روز به‌یادماندنی در زندگی‌ات بنویس (حدود ۱۵۰ کلمه). حداقل هشت جمله گذشته ساده با افعال باقاعده و بی‌قاعده بنویس.",
                    wordCount = 150,
                    hints = "Structure:\n1. When and where it happened\n2. What you did\n3. Who was with you\n4. How you felt"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I ___ to the cinema yesterday.",
                    options = listOf("go", "went", "goes", "going"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct negative.",
                    options = listOf(
                        "I didn't went there.",
                        "I didn't go there.",
                        "I don't went there.",
                        "I not went there."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: ___ you see the movie?",
                    options = listOf("Do", "Does", "Did", "Are"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "What's the past of study?",
                    options = listOf("studyed", "studied", "studed", "studyd"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She ___ at home last night.",
                    options = listOf("was", "were", "is", "are"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: They ___ happy at the party.",
                    options = listOf("was", "were", "is", "are"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "Did you were at home?",
                        "Were you at home?",
                        "Did you was at home?",
                        "Was you at home?"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'run into' mean?",
                    options = listOf("دویدن", "اتفاقی دیدن", "تصادف کردن", "فرار کردن"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 4 — Past Continuous
    // ============================================================
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Past Continuous",
            titlePersian = "زمان گذشته استمراری",
            objectives = listOf(
                "Describe ongoing actions in the past.",
                "Use past continuous with past simple together.",
                "Understand when and while in narratives.",
                "Distinguish between interrupted and background actions.",
                "Master spelling rules for -ing in past continuous."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "while",
                    persian = "در حالی که",
                    pronunciation = "/waɪl/",
                    partOfSpeech = "conjunction",
                    example = "While I was reading, the phone rang.",
                    examplePersian = "در حالی که کتاب می‌خواندم، تلفن زنگ زد.",
                    usageTip = "برای دو عمل همزمان یا عمل پس‌زمینه."
                ),
                VocabWord(
                    english = "when",
                    persian = "وقتی که",
                    pronunciation = "/wen/",
                    partOfSpeech = "conjunction",
                    example = "I was walking when I saw her.",
                    examplePersian = "داشتم راه می‌رفتم که او را دیدم.",
                    usageTip = "برای بیان لحظه وقوع رویداد."
                ),
                VocabWord(
                    english = "suddenly",
                    persian = "ناگهان",
                    pronunciation = "/ˈsʌdənli/",
                    partOfSpeech = "adverb",
                    example = "Suddenly, the lights went out.",
                    examplePersian = "ناگهان چراغ‌ها خاموش شدند.",
                    synonyms = "all of a sudden",
                    usageTip = "برای بیان رویداد ناگهانی در گذشته استمراری."
                ),
                VocabWord(
                    english = "interrupt",
                    persian = "وقفه انداختن، قطع کردن",
                    pronunciation = "/ˌɪntəˈrʌpt/",
                    partOfSpeech = "verb",
                    example = "The phone call interrupted my work.",
                    examplePersian = "تماس تلفنی کارم را قطع کرد.",
                    wordFamily = "interruption, interrupted",
                    usageTip = "رویداد قطع‌کننده با گذشته ساده می‌آید."
                ),
                VocabWord(
                    english = "background",
                    persian = "پس‌زمینه",
                    pronunciation = "/ˈbækɡraʊnd/",
                    partOfSpeech = "noun",
                    example = "It started to rain in the background.",
                    examplePersian = "در پس‌زمینه باران شروع به باریدن کرد.",
                    usageTip = "عمل طولانی با گذشته استمراری."
                ),
                VocabWord(
                    english = "at that time",
                    persian = "در آن زمان",
                    pronunciation = "/æt ðæt taɪm/",
                    partOfSpeech = "time expression",
                    example = "At that time, I was working in London.",
                    examplePersian = "در آن زمان، در لندن کار می‌کردم.",
                    synonyms = "back then, at that moment",
                    usageTip = "با گذشته استمراری."
                ),
                VocabWord(
                    english = "narrative",
                    persian = "روایت، داستان‌گویی",
                    pronunciation = "/ˈnærətɪv/",
                    partOfSpeech = "noun",
                    example = "Past continuous is common in narratives.",
                    examplePersian = "گذشته استمراری در روایت‌ها رایج است.",
                    wordFamily = "narrate, narrator",
                    usageTip = "برای ساخت روایت‌های پویا."
                ),
                VocabWord(
                    english = "scene",
                    persian = "صحنه",
                    pronunciation = "/siːn/",
                    partOfSpeech = "noun",
                    example = "He was describing the scene of the accident.",
                    examplePersian = "او صحنه تصادف را توصیف می‌کرد.",
                    collocations = "set the scene, describe a scene",
                    usageTip = "برای توصیف صحنه‌های گذشته."
                ),
                VocabWord(
                    english = "ongoing",
                    persian = "در جریان، ادامه‌دار",
                    pronunciation = "/ˈɑːnɡoʊɪŋ/",
                    partOfSpeech = "adjective",
                    example = "It was an ongoing conversation.",
                    examplePersian = "این یک گفت‌وگوی در جریان بود.",
                    usageTip = "برای اعمال ادامه‌دار در گذشته."
                ),
                VocabWord(
                    english = "atmosphere",
                    persian = "فضا، جو",
                    pronunciation = "/ˈætməsfɪr/",
                    partOfSpeech = "noun",
                    example = "The atmosphere was calm.",
                    examplePersian = "فضا آرام بود.",
                    usageTip = "برای توصیف شرایط."
                ),
                VocabWord(
                    english = "incident",
                    persian = "اتفاق، حادثه",
                    pronunciation = "/ˈɪnsɪdənt/",
                    partOfSpeech = "noun",
                    example = "What was happening when the incident occurred?",
                    examplePersian = "وقتی حادثه رخ داد چه اتفاقی می‌افتاد؟",
                    synonyms = "event, occurrence",
                    usageTip = "با گذشته استمراری."
                ),
                VocabWord(
                    english = "unexpected",
                    persian = "غیرمنتظره",
                    pronunciation = "/ˌʌnɪkˈspektɪd/",
                    partOfSpeech = "adjective",
                    example = "It was an unexpected visit.",
                    examplePersian = "این یک دیدار غیرمنتظره بود.",
                    usageTip = "با گذشته ساده در روایت."
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
                    persian = "ناگهان و بدون مقدمه",
                    example = "He called me out of the blue.",
                    examplePersian = "ناگهان بهم زنگ زد.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "at the time",
                    persian = "در آن زمان",
                    example = "At the time, I didn't know what to do.",
                    examplePersian = "در آن زمان، نمی‌دانستم چه کار کنم.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "carry on",
                    meaning = "to continue",
                    persian = "ادامه دادن",
                    example = "She carried on working despite the noise.",
                    examplePersian = "او با وجود سر و صدا به کار ادامه داد."
                ),
                PhrasalVerb(
                    verb = "come along",
                    meaning = "to arrive or appear",
                    persian = "ظاهر شدن، رسیدن",
                    example = "A car came along while we were waiting.",
                    examplePersian = "وقتی منتظر بودیم یه ماشین رسید."
                ),
                PhrasalVerb(
                    verb = "turn up",
                    meaning = "to appear suddenly",
                    persian = "سر و کله پیدا کردن",
                    example = "He turned up while we were having dinner.",
                    examplePersian = "وقتی داشتیم شام می‌خوردیم سر و کله‌اش پیدا شد."
                ),
                PhrasalVerb(
                    verb = "break out",
                    meaning = "to start suddenly",
                    persian = "شروع شدن ناگهانی",
                    example = "A fire broke out while they were sleeping.",
                    examplePersian = "وقتی خواب بودند آتش شروع شد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Was / Were contractions",
                    content = "در گفتار طبیعی:\n• I was → I was /aɪ wəz/\n• You were → You were /ju wər/\nدر فست اسپیچ، was/were ممکن است ضعیف تلفظ شوند."
                ),
                PronunciationTip(
                    title = "Was + verb-ing linking",
                    content = "در گفتار روان، was با فعل -ing به هم می‌چسبد:\n• I was working → I was working\n• She was reading → She was reading"
                ),
                PronunciationTip(
                    title = "Stress on time adverbs",
                    content = "قیدهای زمانی در روایت تأکید می‌گیرند:\n• WHILE I was reading, she CALLED.\n• SUDDENLY, the lights went OUT."
                ),
                PronunciationTip(
                    title = "Narrative rhythm",
                    content = "در روایت‌ها، گذشته استمراری برای صحنه‌سازی و گذشته ساده برای رویدادها:\n• She WAS WALKING when she SAW him."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Storytelling in English",
                    content = "در روایت انگلیسی، ترکیب گذشته استمراری (پس‌زمینه) و گذشته ساده (رویداد) تکنیک اصلی است."
                ),
                CulturalNote(
                    title = "Anecdotes",
                    content = "در مکالمات روزمره، افراد اغلب با گذشته استمراری شروع می‌کنند: 'I was walking down the street...'"
                ),
                CulturalNote(
                    title = "Setting the scene",
                    content = "نویسندگان از گذشته استمراری برای توصیف صحنه استفاده می‌کنند: 'The sun was setting, birds were singing...'"
                ),
                CulturalNote(
                    title = "Interruptions",
                    content = "In English, we use when + past simple to describe interruptions to ongoing actions."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Past Continuous: Structure",
                    content = """
زمان گذشته استمراری برای کارهای در حال انجام در نقطه‌ای در گذشته.

ساختار مثبت:
Subject + was/were + verb-ing

I was working at 5 PM yesterday.
She was studying when I called.
They were playing football at noon.

ساختار منفی:
Subject + was/were + not + verb-ing

I wasn't working.
She wasn't studying.
They weren't playing.

ساختار سؤالی:
Was/Were + Subject + verb-ing?

Were you working? — Yes, I was. / No, I wasn't.
Was she studying? — Yes, she was. / No, she wasn't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Past Continuous vs Past Simple",
                    content = """
مقایسه دقیق:

گذشته استمراری — پس‌زمینه، عمل طولانی:
I was walking home.
She was cooking dinner.

گذشته ساده — رویداد، عمل کوتاه:
I saw an old friend.
The phone rang.

ترکیب:
I was walking home when I saw an old friend.
در این ساختار:
• گذشته استمراری: عمل طولانی (پس‌زمینه)
• گذشته ساده: عمل کوتاه (وقفه)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. When and While",
                    content = """
when — برای عمل کوتاه:
• I was reading when the phone rang.
• She was cooking when he arrived.

while — برای دو عمل همزمان:
• While I was reading, my sister was watching TV.
• While they were talking, I was working.

ترکیب:
• While I was walking, I saw him. (دو عمل)
• I was walking when I saw him. (یک رویداد در میانه)

نکته: while + past continuous / when + past simple
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Simultaneous Actions",
                    content = """
برای دو عمل همزمان در گذشته:

• While I was cooking, my husband was cleaning.
• She was reading while he was cooking.
• They were dancing while the band was playing.

نکته: هر دو عمل با while و past continuous بیان می‌شوند.

مثال:
• While I was studying, my roommate was listening to music.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Setting the Scene",
                    content = """
برای توصیف صحنه یا وضعیت در گذشته:

• The sun was shining. Birds were singing. People were walking in the park.

در این حالت، همه فعل‌ها استمراری هستند و فضای کلی را توصیف می‌کنند.

مثال کامل:
The rain was falling. Wind was blowing. Then, suddenly, the door opened.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Past Continuous with Time Expressions",
                    content = """
عبارات زمانی رایج:

• at + ساعت: at 5 PM yesterday
• at that moment: at that moment, she was sleeping
• all + زمان: all day, all morning, all night
• the whole + زمان: the whole morning, the whole afternoon
• from...to: from 9 to 11

مثال:
• I was working all day yesterday.
• She was sleeping at 11 PM.
• They were traveling from Monday to Friday.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Reported Speech with Past Continuous",
                    content = """
در نقل قول غیرمستقیم، حال استمراری به گذشته استمراری تبدیل می‌شود:

Direct: "I am working," she said.
Reported: She said she was working.

Direct: "They are playing," he said.
Reported: He said they were playing.

Direct: "I'm not sleeping," she said.
Reported: She said she wasn't sleeping.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Spelling Rules for -ing",
                    content = """
قواعد املای -ing در گذشته استمراری:

• اکثر افعال: + ing
   work → working, read → reading

• افعال منتهی به silent -e: حذف e + ing
   make → making, write → writing

• افعال CVC: تکرار consonant + ing
   run → running, sit → sitting, stop → stopping

• افعال منتهی به -ie: ie → y + ing
   lie → lying, die → dying

• افعال منتهی به -ee, -oe, -ye: + ing
   see → seeing, agree → agreeing
                    """.trimIndent()
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
                    explanation = "بعد از while معمولاً گذشته استمراری می‌آید."
                ),
                CommonMistake(
                    wrong = "I was knowing the answer.",
                    correct = "I knew the answer.",
                    explanation = "know فعل حالتی است و در استمراری نمی‌آید."
                ),
                CommonMistake(
                    wrong = "She was wanting to help.",
                    correct = "She wanted to help.",
                    explanation = "want فعل حالتی است."
                ),
                CommonMistake(
                    wrong = "What you were doing?",
                    correct = "What were you doing?",
                    explanation = "در سؤالات، was/were قبل از فاعل می‌آید."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Nina",
                    english = "What were you doing when I called you last night?",
                    persian = "دیشب وقتی بهت زنگ زدم چه کار می‌کردی؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "I was cooking dinner. I didn't hear my phone.",
                    persian = "داشتم شام می‌پختم. صدای گوشیم را نشنیدم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "That's OK. What were you making?",
                    persian = "اشکالی نداره. چه غذایی درست می‌کردی؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "I was making pasta. It was really good!",
                    persian = "پاستا درست می‌کردم. واقعاً خوب شده بود!"
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Nice! Were you cooking alone?",
                    persian = "خوبه! تنها آشپزی می‌کردی؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "No, my sister was helping me. She was chopping vegetables.",
                    persian = "نه، خواهرم کمک می‌کرد. سبزیجات خرد می‌کرد."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "That sounds fun. What were you talking about?",
                    persian = "خوب به نظر می‌رسد. درباره چی صحبت می‌کردید؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "We were talking about our vacation plans.",
                    persian = "درباره برنامه‌های تعطیلاتمون صحبت می‌کردیم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Oh? Where are you planning to go?",
                    persian = "اوه؟ کجا می‌خواهید بروید؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "We're thinking about Greece. Have you ever been?",
                    persian = "داریم به یونان فکر می‌کنیم. تا حالا آنجا بوده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Yes! I went two years ago. It was beautiful.",
                    persian = "بله! دو سال پیش رفتم. زیبا بود."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "That's encouraging! What were you doing there?",
                    persian = "این دلگرم‌کننده‌ست! آنجا چه کار می‌کردی؟"
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "I was sightseeing mostly. And I was swimming every morning.",
                    persian = "بیشتر بازدید می‌کردم. و هر صبح شنا می‌کردم."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Sounds perfect. Were you traveling alone?",
                    persian = "بی‌نقص به نظر می‌رسد. تنها سفر می‌کردی؟"
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "No, I was traveling with my cousin.",
                    persian = "نه، با پسرخاله‌ام سفر می‌کردم."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Nice. I hope my trip is as good as yours.",
                    persian = "خوبه. امیدوارم سفر من هم به‌خوبیِ مال تو باشه."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "I'm sure it will be. Let me know if you need any tips!",
                    persian = "مطمئنم می‌شه. اگه توصیه‌ای خواستی خبرم کن!"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Thanks! I definitely will.",
                    persian = "ممنون! حتماً."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What was Omar doing when Nina called?",
                    answer = "He was cooking dinner."
                ),
                ComprehensionQuestion(
                    question = "What was Omar making?",
                    answer = "He was making pasta."
                ),
                ComprehensionQuestion(
                    question = "Was Omar cooking alone?",
                    answer = "No, his sister was helping him."
                ),
                ComprehensionQuestion(
                    question = "What were they talking about?",
                    answer = "They were talking about their vacation plans."
                ),
                ComprehensionQuestion(
                    question = "Where is Omar planning to go?",
                    answer = "He is thinking about Greece."
                ),
                ComprehensionQuestion(
                    question = "What was Nina doing in Greece?",
                    answer = "She was sightseeing and swimming every morning."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe what you were doing yesterday at 5 PM, 8 PM, and 10 PM.",
                    promptPersian = "توصیف کن دیروز ساعت ۵ عصر، ۸ شب و ۱۰ شب چه کار می‌کردی.",
                    hints = "Use: At 5 PM, I was... At 8 PM, I was... At 10 PM, I was..."
                ),
                SpeakingTask(
                    prompt = "Tell a story about an unexpected event in the past.",
                    promptPersian = "داستانی درباره یک اتفاق غیرمنتظره در گذشته تعریف کن.",
                    hints = "Start with background: I was... when suddenly..."
                ),
                SpeakingTask(
                    prompt = "Describe the scene when you arrived home yesterday.",
                    promptPersian = "صحنه‌ای که دیروز وقتی به خانه رسیدی را توصیف کن.",
                    hints = "Use: My mother was..., My father was..., They were..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a short narrative (about 150 words) about an interrupted action in the past. Use at least 6 past continuous sentences and 3 past simple sentences.",
                    promptPersian = "یک روایت کوتاه (حدود ۱۵۰ کلمه) درباره یک عمل قطع‌شده در گذشته بنویس. حداقل شش جمله گذشته استمراری و سه جمله گذشته ساده به کار ببر.",
                    wordCount = 150,
                    hints = "Structure:\n1. Set the scene with past continuous\n2. Interrupt with past simple (when)\n3. Continue with past continuous\n4. Conclude"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I ___ TV when she called.",
                    options = listOf("watched", "was watching", "watch", "watches"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: They ___ football at 5 PM yesterday.",
                    options = listOf("played", "were playing", "play", "plays"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: While I ___, I saw him.",
                    options = listOf("walked", "walk", "was walking", "walks"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: She ___ cook when I arrived.",
                    options = listOf("is", "was", "were", "am"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "I was knowing the answer.",
                        "I knew the answer.",
                        "I was know the answer.",
                        "I knowing the answer."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: What ___ you doing at 8 PM?",
                    options = listOf("was", "were", "did", "do"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'out of the blue' mean?",
                    options = listOf("آبی رنگ", "ناگهان", "آسمان", "دریا"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: They ___ playing when it started raining.",
                    options = listOf("was", "were", "are", "is"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 5 — Present Perfect
    // ============================================================
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Present Perfect",
            titlePersian = "زمان حال کامل",
            objectives = listOf(
                "Use present perfect for experiences and past events with present relevance.",
                "Distinguish between present perfect and past simple.",
                "Use for and since with durations.",
                "Use ever, never, already, yet, just correctly.",
                "Master the formation of past participles."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "experience",
                    persian = "تجربه",
                    pronunciation = "/ɪkˈspɪəriəns/",
                    partOfSpeech = "noun",
                    example = "I've had many interesting experiences.",
                    examplePersian = "تجربه‌های جالب زیادی داشته‌ام.",
                    collocations = "work experience, valuable experience",
                    wordFamily = "experienced, experiential",
                    usageTip = "با حال کامل."
                ),
                VocabWord(
                    english = "since",
                    persian = "از",
                    pronunciation = "/sɪns/",
                    partOfSpeech = "preposition",
                    example = "I've lived here since 2015.",
                    examplePersian = "از سال ۲۰۱۵ اینجا زندگی می‌کنم.",
                    usageTip = "برای نقطه شروع."
                ),
                VocabWord(
                    english = "for",
                    persian = "برای، به مدت",
                    pronunciation = "/fɔːr/",
                    partOfSpeech = "preposition",
                    example = "I've known her for ten years.",
                    examplePersian = "ده سال است او را می‌شناسم.",
                    usageTip = "برای مدت زمان."
                ),
                VocabWord(
                    english = "already",
                    persian = "قبلاً، از قبل",
                    pronunciation = "/ɔːlˈredi/",
                    partOfSpeech = "adverb",
                    example = "I've already finished my homework.",
                    examplePersian = "تکالیفم را قبلاً تمام کرده‌ام.",
                    usageTip = "در جملات مثبت با حال کامل."
                ),
                VocabWord(
                    english = "yet",
                    persian = "هنوز",
                    pronunciation = "/jet/",
                    partOfSpeech = "adverb",
                    example = "Have you finished yet?",
                    examplePersian = "هنوز تمام کرده‌ای؟",
                    usageTip = "در سؤالات و منفی."
                ),
                VocabWord(
                    english = "ever",
                    persian = "هرگز، تا حالا",
                    pronunciation = "/ˈevər/",
                    partOfSpeech = "adverb",
                    example = "Have you ever been to Japan?",
                    examplePersian = "تا حالا ژاپن بوده‌ای؟",
                    usageTip = "در سؤالات تجربه."
                ),
                VocabWord(
                    english = "never",
                    persian = "هرگز",
                    pronunciation = "/ˈnevər/",
                    partOfSpeech = "adverb",
                    example = "I've never eaten sushi.",
                    examplePersian = "هرگز سوشی نخورده‌ام.",
                    usageTip = "در جملات تجربه."
                ),
                VocabWord(
                    english = "just",
                    persian = "همین حالا، تازه",
                    pronunciation = "/dʒʌst/",
                    partOfSpeech = "adverb",
                    example = "She's just arrived.",
                    examplePersian = "تازه رسیده است.",
                    usageTip = "با حال کامل."
                ),
                VocabWord(
                    english = "lately",
                    persian = "اخیراً، این اواخر",
                    pronunciation = "/ˈleɪtli/",
                    partOfSpeech = "adverb",
                    example = "I've been busy lately.",
                    examplePersian = "این اواخر مشغول بوده‌ام.",
                    synonyms = "recently",
                    usageTip = "با حال کامل."
                ),
                VocabWord(
                    english = "recently",
                    persian = "اخیراً",
                    pronunciation = "/ˈriːsəntli/",
                    partOfSpeech = "adverb",
                    example = "I've recently started learning Spanish.",
                    examplePersian = "اخیراً شروع به یادگیری اسپانیایی کرده‌ام.",
                    usageTip = "با حال کامل."
                ),
                VocabWord(
                    english = "past participle",
                    persian = "اسم مفعول",
                    pronunciation = "/pæst pɑːrˈtɪsɪpəl/",
                    partOfSpeech = "noun",
                    example = "For 'go', the past participle is 'gone'.",
                    examplePersian = "برای go، اسم مفعول gone است.",
                    usageTip = "با have/has در حال کامل."
                ),
                VocabWord(
                    english = "accomplishment",
                    persian = "دستاورد",
                    pronunciation = "/əˈkɑːmplɪʃmənt/",
                    partOfSpeech = "noun",
                    example = "That's a great accomplishment!",
                    examplePersian = "این یک دستاورد بزرگ است!",
                    synonyms = "achievement",
                    usageTip = "با حال کامل."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "been there, done that",
                    persian = "قبلاً تجربه‌اش را داشته‌ام",
                    example = "Been there, done that — I don't want to do it again.",
                    examplePersian = "قبلاً تجربه‌اش را داشته‌ام — نمی‌خواهم دوباره انجامش دهم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "the first time",
                    persian = "اولین بار",
                    example = "This is the first time I've been to London.",
                    examplePersian = "این اولین بار است که به لندن آمده‌ام.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "as of yet",
                    persian = "تا این لحظه",
                    example = "As of yet, I haven't heard from him.",
                    examplePersian = "تا این لحظه از او خبری ندارم.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "be to",
                    meaning = "to have visited",
                    persian = "رفتن به (جایی)",
                    example = "Have you ever been to Japan?",
                    examplePersian = "تا حالا ژاپن بوده‌ای؟"
                ),
                PhrasalVerb(
                    verb = "come across",
                    meaning = "to find by chance",
                    persian = "اتفاقی پیدا کردن",
                    example = "I've come across some great books recently.",
                    examplePersian = "اخیراً چند کتاب عالی اتفاقی پیدا کرده‌ام."
                ),
                PhrasalVerb(
                    verb = "get over",
                    meaning = "to recover from",
                    persian = "بهبود یافتن",
                    example = "She hasn't gotten over her illness yet.",
                    examplePersian = "او هنوز از بیماری‌اش بهبود نیافته است."
                ),
                PhrasalVerb(
                    verb = "put on",
                    meaning = "to gain weight",
                    persian = "وزن اضافه کردن",
                    example = "He's put on some weight recently.",
                    examplePersian = "او اخیراً کمی وزن اضافه کرده است."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Contractions with have/has",
                    content = "در گفتار طبیعی:\n• I have → I've /aɪv/\n• You have → You've /juːv/\n• He has → He's /hiːz/\n• She has → She's /ʃiːz/\n• They have → They've /ðeɪv/"
                ),
                PronunciationTip(
                    title = "Past participles: three types",
                    content = "پایان اسم مفعول:\n• -ed: worked /wɜːrkt/, played /pleɪd/\n• Irregular: gone, seen, taken\n• Spelled like past but different: been"
                ),
                PronunciationTip(
                    title = "Stress on 'ever' and 'never'",
                    content = "در سؤالات تجربه، ever تأکید می‌گیرد:\n• Have you EVER been to Japan?\nو never:\n• I've NEVER eaten sushi."
                ),
                PronunciationTip(
                    title = "Already / Yet / Just",
                    content = "موقعیت این قیدها:\n• already: بین have/has و past participle\n   I've already finished.\n• yet: در انتهای جمله\n   Have you finished yet?\n• just: بین have/has و pp\n   I've just arrived."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Present perfect in conversation",
                    content = "بومی‌زبانان در مکالمات روزمره اغلب از حال کامل برای به اشتراک گذاشتن تجربه‌ها استفاده می‌کنند: 'Have you ever tried...?'"
                ),
                CulturalNote(
                    title = "Life achievements",
                    content = "در CV یا مکالمات رسمی، حال کامل برای توصیف دستاوردها: 'I have managed large teams.'"
                ),
                CulturalNote(
                    title = "News reports",
                    content = "در اخبار و گزارش‌های خبری، حال کامل زیاد استفاده می‌شود: 'The president has announced a new policy.'"
                ),
                CulturalNote(
                    title = "Recent events",
                    content = "برای رویدادهای اخیر با اثر بر حال: 'I've just seen the news.'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Present Perfect: Structure",
                    content = """
زمان حال کامل برای تجربه‌ها، رویدادهای گذشته با ارتباط به حال، و کارهای ادامه‌دار.

ساختار مثبت:
Subject + have/has + past participle

I have visited Paris.
She has finished her homework.
They have lived here for years.

ساختار منفی:
Subject + haven't/hasn't + past participle

I haven't been there.
She hasn't called yet.
They haven't arrived.

ساختار سؤالی:
Have/Has + Subject + past participle?

Have you ever been abroad?
Has she finished?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Present Perfect vs Past Simple",
                    content = """
تفاوت کلیدی:

Present Perfect — زمان نامشخص یا ارتباط با حال:
I have visited Paris. (تجربه‌ام است، زمان مهم نیست)
She has just left. (همین حالا)
They have lived here for 5 years. (هنوز اینجا هستند)

Past Simple — زمان مشخص در گذشته:
I visited Paris in 2020. (زمان مشخص)
She left two hours ago. (زمان مشخص)
They lived there from 2010 to 2015. (بازه تمام‌شده)

کلمات کلیدی:
• Present Perfect: ever, never, already, yet, just, since, for
• Past Simple: yesterday, last week, ago, in 2010, when
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. For and Since",
                    content = """
for + مدت:
• I've lived here for 5 years.
• She's worked here for three months.
• We've been friends for a long time.

since + نقطه شروع:
• I've lived here since 2018.
• She's worked here since January.
• We've been friends since childhood.

نکته: در جمله، برای همه زمان‌های perfect:
• Present Perfect: I've known her for years.
• Present Perfect Continuous: I've been working for 3 hours.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Ever, Never, Already, Yet, Just",
                    content = """
ever — تا حالا (در سؤالات):
• Have you ever been to London?
• Has she ever tried sushi?

never — هرگز (در جملات خبری منفی):
• I've never been to Japan.
• She's never eaten durian.

already — قبلاً (در جملات مثبت):
• I've already finished.
• She's already left.

yet — هنوز (در سؤالات و منفی):
• Have you finished yet?
• I haven't finished yet.

just — همین حالا:
• I've just arrived.
• She's just finished.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Forming Past Participles",
                    content = """
Regular verbs: -ed (like past simple):
• work → worked
• play → played
• study → studied

Irregular verbs (نمونه):
| Base | Past | Past Participle |
|------|------|-----------------|
| be | was/were | been |
| go | went | gone |
| do | did | done |
| have | had | had |
| see | saw | seen |
| take | took | taken |
| give | gave | given |
| write | wrote | written |
| eat | ate | eaten |
| drink | drank | drunk |
| speak | spoke | spoken |
| break | broke | broken |
| choose | chose | chosen |
| forget | forgot | forgotten |
| know | knew | known |
| begin | began | begun |
| drive | drove | driven |
| fly | flew | flown |
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Present Perfect for Duration",
                    content = """
حال کامل برای کارهایی که از گذشته شروع شده و تا حال ادامه دارند:

• I've lived here for 10 years. (هنوز اینجا زندگی می‌کنم)
• She's worked at that company since 2015. (هنوز آنجا کار می‌کند)
• We've known each other for ages.

تفاوت با گذشته ساده:
• I lived in Paris for 5 years. (دیگر آنجا نیستم)
• I've lived in Paris for 5 years. (هنوز آنجا هستم)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Present Perfect in News",
                    content = """
در اخبار و گزارش‌های رسمی:

• The president has announced new policies.
• Scientists have discovered a new species.
• The company has reported record profits.

این ساختار برای رویدادهای اخیر با اثر بر حال استفاده می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Time Adverbs",
                    content = """
قیدهای زمانی با حال کامل:

• recently: I've recently changed jobs.
• lately: She's been busy lately.
• so far: So far, we've visited five countries.
• up to now: Up to now, everything has been fine.
• this week/month/year: I've had three meetings this week.

نکته: با این عبارات، حال کامل انتخاب طبیعی است.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I have seen him yesterday.",
                    correct = "I saw him yesterday.",
                    explanation = "با زمان مشخص گذشته (yesterday)، از گذشته ساده استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I have went to Paris.",
                    correct = "I have gone to Paris.",
                    explanation = "past participle صحیح go، gone است (نه went)."
                ),
                CommonMistake(
                    wrong = "She has ate lunch.",
                    correct = "She has eaten lunch.",
                    explanation = "past participle صحیح eat، eaten است."
                ),
                CommonMistake(
                    wrong = "I've lived here since five years.",
                    correct = "I've lived here for five years.",
                    explanation = "برای مدت از for؛ for برای بازه زمانی."
                ),
                CommonMistake(
                    wrong = "I've lived here for 2015.",
                    correct = "I've lived here since 2015.",
                    explanation = "برای نقطه شروع از since."
                ),
                CommonMistake(
                    wrong = "Have you ever went to Japan?",
                    correct = "Have you ever been to Japan?",
                    explanation = "past participle صحیح go، gone است ولی با تجربه سفر از been استفاده می‌کنیم."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Rita",
                    english = "Have you ever been abroad?",
                    persian = "تا حالا خارج از کشور بوده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "Yes, I have. I've been to Turkey twice.",
                    persian = "بله. دو بار ترکیه بوده‌ام."
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "Nice! When did you go?",
                    persian = "خوبه! کِی رفتی؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "I went last summer and two years before that.",
                    persian = "تابستان گذشته و دو سال قبل از آن رفتم."
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "What did you like most?",
                    persian = "چی بیشتر دوست داشتی؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "I loved Istanbul. The food was amazing.",
                    persian = "استانبول رو دوست داشتم. غذا فوق‌العاده بود."
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "Have you ever tried Turkish coffee?",
                    persian = "تا حالا قهوه ترکی امتحان کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "Yes, I have. It's very strong but delicious.",
                    persian = "بله. خیلی قویه ولی خوشمزه."
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "I've heard that. Have you ever traveled alone?",
                    persian = "شنیده‌ام. تا حالا تنها سفر کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "No, I haven't. I've always traveled with family or friends.",
                    persian = "نه. همیشه با خانواده یا دوستان سفر کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "Me too. What about Asia? Have you ever been?",
                    persian = "منم همینطور. آسیا چطور؟ تا حالا بوده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "No, I've never been to Asia. But I'd love to visit Japan.",
                    persian = "نه، هرگز در آسیا نبوده‌ام. ولی دوست دارم ژاپن را ببینم."
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "Japan is amazing! I've been there twice.",
                    persian = "ژاپن فوق‌العاده‌ست! دو بار آنجا بوده‌ام."
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "Really? When did you go?",
                    persian = "واقعاً؟ کِی رفتی؟"
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "I first went in 2018, and then again in 2022.",
                    persian = "اولین بار ۲۰۱۸ و بعد دوباره ۲۰۲۲."
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "What's the best thing about Japan?",
                    persian = "بهترین چیز ژاپن چیه؟"
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "I think it's the mix of tradition and modernity.",
                    persian = "فکر می‌کنم ترکیب سنت و مدرنیته."
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "I've heard that a lot. I really want to go.",
                    persian = "زیاد شنیده‌ام. واقعاً می‌خواهم بروم."
                ),
                DialogueLine(
                    speaker = "Rita",
                    english = "You should! I promise you won't regret it.",
                    persian = "باید بروی! قول می‌دهم پشیمان نخواهی شد."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "How many times has Kian been to Turkey?",
                    answer = "He has been to Turkey twice."
                ),
                ComprehensionQuestion(
                    question = "Has Kian ever tried Turkish coffee?",
                    answer = "Yes, he has. He thinks it's very strong but delicious."
                ),
                ComprehensionQuestion(
                    question = "Has Kian ever traveled alone?",
                    answer = "No, he hasn't. He has always traveled with family or friends."
                ),
                ComprehensionQuestion(
                    question = "Has Kian ever been to Asia?",
                    answer = "No, he has never been to Asia, but he'd love to visit Japan."
                ),
                ComprehensionQuestion(
                    question = "How many times has Rita been to Japan?",
                    answer = "She has been there twice — in 2018 and 2022."
                ),
                ComprehensionQuestion(
                    question = "What is Rita's favorite thing about Japan?",
                    answer = "The mix of tradition and modernity."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your travel experiences using present perfect.",
                    promptPersian = "درباره تجربه‌های سفرت با حال کامل صحبت کن.",
                    hints = "Use: I've been to..., I've never been to..., Have you ever been...?"
                ),
                SpeakingTask(
                    prompt = "Ask a partner questions about their life achievements.",
                    promptPersian = "از یک دوست درباره دستاوردهای زندگی‌اش بپرس.",
                    hints = "Have you ever...? / How long have you...? / Have you ever tried...?"
                ),
                SpeakingTask(
                    prompt = "Talk about how your life has changed in the last 5 years.",
                    promptPersian = "درباره اینکه زندگی‌ات در ۵ سال گذشته چطور تغییر کرده صحبت کن.",
                    hints = "Use: I've started..., I've changed..., I've learned..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your life experiences (about 150 words) using at least eight present perfect sentences and two past simple sentences.",
                    promptPersian = "درباره تجربه‌های زندگی‌ات بنویس (حدود ۱۵۰ کلمه) با حداقل هشت جمله حال کامل و دو جمله گذشته ساده.",
                    wordCount = 150,
                    hints = "Include:\n- Travel experiences\n- Achievements\n- Skills you've learned\n- Recent changes"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I ___ never been to Paris.",
                    options = listOf("have", "has", "am", "was"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: She ___ lived here since 2018.",
                    options = listOf("have", "has", "is", "was"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I have ___ him yesterday.",
                    options = listOf("seen", "saw", "see", "seeing"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "I have seen him yesterday.",
                        "I saw him yesterday.",
                        "I have saw him yesterday.",
                        "I seen him yesterday."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I've lived here ___ five years.",
                    options = listOf("since", "for", "in", "at"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: Have you finished ___?",
                    options = listOf("already", "yet", "just", "ever"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I've ___ finished my homework.",
                    options = listOf("yet", "already", "ever", "never"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What's the past participle of 'eat'?",
                    options = listOf("ate", "eaten", "eating", "eats"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 6 — Future Forms
    // ============================================================
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Future Forms",
            titlePersian = "زمان‌های آینده",
            objectives = listOf(
                "Use will for predictions, promises, and spontaneous decisions.",
                "Use going to for plans and evidence-based predictions.",
                "Use present continuous for future arrangements.",
                "Distinguish between will and going to.",
                "Use present simple for scheduled future events."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "prediction",
                    persian = "پیش‌بینی",
                    pronunciation = "/prɪˈdɪkʃən/",
                    partOfSpeech = "noun",
                    example = "My prediction is that it will rain tomorrow.",
                    examplePersian = "پیش‌بینی من این است که فردا باران می‌آید.",
                    wordFamily = "predict, predictable",
                    usageTip = "با will."
                ),
                VocabWord(
                    english = "intention",
                    persian = "قصد، نیت",
                    pronunciation = "/ɪnˈtenʃən/",
                    partOfSpeech = "noun",
                    example = "My intention is to study abroad.",
                    examplePersian = "قصد من تحصیل در خارج است.",
                    wordFamily = "intend",
                    usageTip = "با going to."
                ),
                VocabWord(
                    english = "arrangement",
                    persian = "قرار، هماهنگی",
                    pronunciation = "/əˈreɪndʒmənt/",
                    partOfSpeech = "noun",
                    example = "I have an arrangement to meet her tomorrow.",
                    examplePersian = "قرار ملاقاتی برای دیدارش فردا دارم.",
                    wordFamily = "arrange",
                    usageTip = "با حال استمراری."
                ),
                VocabWord(
                    english = "spontaneous",
                    persian = "لحظه‌ای، خودبه‌خودی",
                    pronunciation = "/spɑːnˈteɪniəs/",
                    partOfSpeech = "adjective",
                    example = "It was a spontaneous decision.",
                    examplePersian = "این یک تصمیم لحظه‌ای بود.",
                    wordFamily = "spontaneously, spontaneity",
                    usageTip = "با will (تصمیم لحظه‌ای)."
                ),
                VocabWord(
                    english = "promise",
                    persian = "قول دادن",
                    pronunciation = "/ˈprɑːmɪs/",
                    partOfSpeech = "verb/noun",
                    example = "I'll help you — I promise.",
                    examplePersian = "کمکت می‌کنم — قول می‌دهم.",
                    collocations = "make a promise, keep a promise",
                    usageTip = "با will."
                ),
                VocabWord(
                    english = "scheduled",
                    persian = "زمان‌بندی‌شده",
                    pronunciation = "/ˈskedʒuːld/",
                    partOfSpeech = "adjective",
                    example = "The meeting is scheduled for 3 PM.",
                    examplePersian = "جلسه برای ساعت ۳ زمان‌بندی شده است.",
                    wordFamily = "schedule",
                    usageTip = "با حال ساده."
                ),
                VocabWord(
                    english = "soon",
                    persian = "به‌زودی",
                    pronunciation = "/suːn/",
                    partOfSpeech = "adverb",
                    example = "I'll see you soon.",
                    examplePersian = "به‌زودی می‌بینمت.",
                    antonyms = "later",
                    usageTip = "با will."
                ),
                VocabWord(
                    english = "eventually",
                    persian = "در نهایت",
                    pronunciation = "/ɪˈventʃuəli/",
                    partOfSpeech = "adverb",
                    example = "He'll eventually understand.",
                    examplePersian = "او در نهایت خواهد فهمید.",
                    synonyms = "finally, in the end",
                    usageTip = "با will یا going to."
                ),
                VocabWord(
                    english = "expect",
                    persian = "انتظار داشتن",
                    pronunciation = "/ɪkˈspekt/",
                    partOfSpeech = "verb",
                    example = "I expect she'll be late.",
                    examplePersian = "انتظار دارم که او دیر بیاید.",
                    wordFamily = "expectation",
                    usageTip = "با will."
                ),
                VocabWord(
                    english = "likely",
                    persian = "احتمالاً",
                    pronunciation = "/ˈlaɪkli/",
                    partOfSpeech = "adjective/adverb",
                    example = "It's likely to rain tomorrow.",
                    examplePersian = "احتمالاً فردا باران می‌آید.",
                    antonyms = "unlikely",
                    usageTip = "با will یا going to."
                ),
                VocabWord(
                    english = "deadline",
                    persian = "مهلت، ددلاین",
                    pronunciation = "/ˈdedlaɪn/",
                    partOfSpeech = "noun",
                    example = "The deadline is next Friday.",
                    examplePersian = "مهلت جمعه آینده است.",
                    collocations = "meet a deadline, miss a deadline",
                    usageTip = "با برنامه‌های آینده."
                ),
                VocabWord(
                    english = "decision",
                    persian = "تصمیم",
                    pronunciation = "/dɪˈsɪʒən/",
                    partOfSpeech = "noun",
                    example = "I'll make a decision tomorrow.",
                    examplePersian = "فردا تصمیم می‌گیرم.",
                    wordFamily = "decide",
                    usageTip = "با will (تصمیم لحظه‌ای)."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in the near future",
                    persian = "در آینده نزدیک",
                    example = "We'll visit you in the near future.",
                    examplePersian = "در آینده نزدیک به دیدنت می‌آییم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "one of these days",
                    persian = "یکی از این روزها",
                    example = "One of these days, I'll travel to Europe.",
                    examplePersian = "یکی از این روزها، به اروپا سفر می‌کنم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "cross that bridge when we come to it",
                    persian = "بعداً تصمیم می‌گیریم",
                    example = "Let's cross that bridge when we come to it.",
                    examplePersian = "بعداً تصمیم می‌گیریم.",
                    register = "idiom"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "look forward to",
                    meaning = "to be excited about something in the future",
                    persian = "بی‌صبرانه منتظر بودن",
                    example = "I'm looking forward to the party.",
                    examplePersian = "بی‌صبرانه منتظر مهمانی هستم."
                ),
                PhrasalVerb(
                    verb = "plan on",
                    meaning = "to intend to do something",
                    persian = "قصد داشتن",
                    example = "I'm planning on going to Paris.",
                    examplePersian = "قصد دارم به پاریس بروم."
                ),
                PhrasalVerb(
                    verb = "come up",
                    meaning = "to happen soon",
                    persian = "پیش آمدن",
                    example = "Something important has come up.",
                    examplePersian = "یه موضوع مهمی پیش آمده."
                ),
                PhrasalVerb(
                    verb = "put off",
                    meaning = "to postpone",
                    persian = "به تعویق انداختن",
                    example = "We'll put off the meeting until next week.",
                    examplePersian = "جلسه را به هفته بعد موکول می‌کنیم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Will contraction",
                    content = "در گفتار طبیعی:\n• I will → I'll /aɪl/\n• You will → You'll /juːl/\n• He will → He'll /hiːl/\n• She will → She'll /ʃiːl/\n• We will → We'll /wiːl/\n• They will → They'll /ðeɪl/"
                ),
                PronunciationTip(
                    title = "Going to → gonna",
                    content = "در گفتار سریع:\n• I'm going to → I'm gonna\n• She's going to → She's gonna\nدر نوشتار رسمی از gonna استفاده نکنید."
                ),
                PronunciationTip(
                    title = "Stress in future sentences",
                    content = "در جمله‌های آینده، فعل اصلی معمولاً تأکید می‌گیرد:\n• I'll SEE you tomorrow.\n• She's going to STUDY medicine."
                ),
                PronunciationTip(
                    title = "Rising intonation in yes/no questions",
                    content = "آهنگ صعودی:\n• Will you come? ↑\n• Are you going to help? ↑"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "New Year's resolutions",
                    content = "در فرهنگ غربی، ابتدای سال جدید فرصتی برای برنامه‌ریزی است: 'I'm going to exercise more this year.'"
                ),
                CulturalNote(
                    title = "Making plans in English",
                    content = "در انگلیسی، 'going to' برای برنامه‌های قطعی و 'will' برای پیشنهادها و قول‌ها استفاده می‌شود."
                ),
                CulturalNote(
                    title = "Polite predictions",
                    content = "انگلیسی‌زبانان برای پیش‌بینی مؤدبانه از might/could استفاده می‌کنند: 'It might rain tomorrow.'"
                ),
                CulturalNote(
                    title = "Scheduling",
                    content = "در محیط‌های کاری، زمان‌بندی دقیق با استفاده از حال ساده یا حال استمراری انجام می‌شود."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Will: Structure and Uses",
                    content = """
will + base verb

ساختار مثبت:
Subject + will + verb

I will call you tomorrow.
She will help us.
They will arrive at 8.

ساختار منفی:
Subject + won't + verb

I won't be late.
She won't come.

ساختار سؤالی:
Will + Subject + verb?

Will you help me? — Yes, I will. / No, I won't.

کاربردها:
1. پیش‌بینی بر اساس نظر شخصی:
   I think it will rain tomorrow.
2. تصمیم لحظه‌ای:
   I'll have the coffee, please.
3. قول و وعده:
   I'll help you.
4. پیشنهاد:
   I'll carry your bag.
5. درخواست مؤدبانه:
   Will you pass the salt?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Going To: Structure and Uses",
                    content = """
am/is/are + going to + base verb

ساختار مثبت:
Subject + am/is/are + going to + verb

I am going to travel to Japan.
She is going to study medicine.
They are going to buy a house.

ساختار منفی:
I'm not going to give up.

ساختار سؤالی:
Are you going to come?

کاربردها:
1. قصد و برنامه از قبل:
   I'm going to study abroad next year.
2. پیش‌بینی بر اساس شواهد:
   Look at those clouds! It's going to rain.
3. تصمیم قطعی:
   We're going to move to a new apartment.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Will vs Going To",
                    content = """
مقایسه دقیق:

| Will | Going To |
|------|----------|
| پیش‌بینی بر اساس نظر | پیش‌بینی بر اساس شواهد |
| I think it will rain. | Look at those clouds — it's going to rain. |
| تصمیم لحظه‌ای | برنامه از قبل |
| I'll have tea. | I'm going to have tea later. |
| قول و وعده | قصد و نیت |
| I'll help you. | I'm going to help him tomorrow. |

نکته:
• will: خارج از کنترل گوینده
• going to: در کنترل گوینده
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Present Continuous for Future",
                    content = """
برای قرارهای قطعی و هماهنگ‌شده:

• I'm meeting Ali tomorrow at 3.
• We're flying to Paris next week.
• She's having dinner with her parents tonight.
• They're getting married in June.

تفاوت با going to:
• Present continuous: قرار مشخص با زمان و مکان
• Going to: قصد و نیت، ممکن است جزئیات مشخص نشده

مثال:
• I'm seeing the doctor at 4. (قرار مشخص)
• I'm going to see the doctor soon. (قصد کلی)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Present Simple for Scheduled Events",
                    content = """
حال ساده برای برنامه‌های رسمی و زمان‌بندی‌شده:

• The train leaves at 8 AM tomorrow.
• The movie starts at 7 PM.
• The class begins next Monday.
• The flight departs at 10.
• The meeting is at 3 PM.

نکته: این ساختار برای:
• برنامه‌های حمل و نقل
• رویدادهای ثابت (cinema times, school terms)
• جلسات رسمی
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Future Time Clauses",
                    content = """
در جملات آینده با زمان:

• بعد از when, if, before, after, until, as soon as → حال ساده می‌آید (نه will):

❌ When I will arrive, I will call you.
✅ When I arrive, I will call you.

❌ If it will rain, we will stay home.
✅ If it rains, we will stay home.

مثال‌های درست:
• When I finish work, I'll go home.
• If you come, I'll be happy.
• After she arrives, we'll eat.
• Before I leave, I'll call you.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Future Continuous",
                    content = """
will be + verb-ing

برای توصیف کارهایی که در نقطه‌ای در آینده در حال انجام خواهند بود:

• At 8 PM tonight, I'll be watching TV.
• This time tomorrow, we'll be flying to Paris.
• She'll be working when you arrive.

مقایسه:
• Future simple: I'll call you at 8. (رویداد در آینده)
• Future continuous: I'll be studying at 8. (در حال انجام در آینده)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Future Perfect",
                    content = """
will have + past participle

برای کارهایی که قبل از یک نقطه خاص در آینده تمام می‌شوند:

• By next year, I'll have finished my degree.
• By the time you arrive, I'll have cooked dinner.
• By 2030, she'll have worked here for 10 years.

نکته: future perfect با by + زمان آینده استفاده می‌شود.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I will to call you.",
                    correct = "I will call you.",
                    explanation = "بعد از will، فعل ساده (بدون to) می‌آید."
                ),
                CommonMistake(
                    wrong = "I'm go to travel.",
                    correct = "I'm going to travel.",
                    explanation = "ساختار صحیح: am/is/are + going to + verb."
                ),
                CommonMistake(
                    wrong = "When I will arrive, I'll call.",
                    correct = "When I arrive, I'll call.",
                    explanation = "بعد از when در زمان آینده، حال ساده می‌آید."
                ),
                CommonMistake(
                    wrong = "If it will rain, we'll stay home.",
                    correct = "If it rains, we'll stay home.",
                    explanation = "بعد از if در جملات شرطی، حال ساده."
                ),
                CommonMistake(
                    wrong = "She will goes to school.",
                    correct = "She will go to school.",
                    explanation = "بعد از will فعل ساده می‌آید."
                ),
                CommonMistake(
                    wrong = "It will rain — look at the clouds!",
                    correct = "It's going to rain — look at the clouds!",
                    explanation = "برای پیش‌بینی بر اساس شواهد، از going to استفاده می‌کنیم."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Lena",
                    english = "What are you going to do this summer?",
                    persian = "تابستان امسال چیکار می‌خواهی بکنی؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "I'm going to travel to Italy with my family.",
                    persian = "می‌خواهم با خانواده‌ام به ایتالیا سفر کنم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "That sounds amazing! When are you leaving?",
                    persian = "فوق‌العاده به نظر می‌رسد! کِی می‌روید؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "We're flying on July 15th. We've already booked the tickets.",
                    persian = "۱۵ جولای پرواز می‌کنیم. بلیط‌ها را قبلاً رزرو کرده‌ایم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Nice! How long are you staying?",
                    persian = "خوبه! چقدر می‌مانید؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "We're staying for two weeks.",
                    persian = "دو هفته می‌مانیم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "What are you planning to see?",
                    persian = "برنامه‌ای برای دیدن چی دارید؟"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "We're visiting Rome, Florence, and Venice.",
                    persian = "داریم از رم، فلورانس و ونیز بازدید می‌کنیم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "I've been to Italy! It's beautiful.",
                    persian = "من ایتالیا بوده‌ام! زیباست."
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "Really? Where did you go?",
                    persian = "واقعاً؟ کجا رفتی؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "I visited Rome and Naples. The food was incredible!",
                    persian = "از رم و ناپل بازدید کردم. غذا فوق‌العاده بود!"
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "I can't wait to try the pizza!",
                    persian = "نمی‌توانم صبر کنم پیتزا امتحان کنم!"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "You'll love it! And don't forget gelato.",
                    persian = "عاشقش می‌شوی! و ژلاتو را فراموش نکن."
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "I won't! What about you? Any plans?",
                    persian = "فراموش نمی‌کنم! تو چطور؟ برنامه‌ای داری؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Yes! I'm going to start a new job next month.",
                    persian = "بله! ماه بعد شغل جدیدی شروع می‌کنم."
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "Congratulations! Are you excited?",
                    persian = "تبریک! هیجان‌زده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Very! I'll be working at a tech company.",
                    persian = "خیلی! در یه شرکت فناوری کار خواهم کرد."
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "That's great. I'm sure you'll do well.",
                    persian = "عالیه. مطمئنم خوب عمل می‌کنی."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Thanks! Let's catch up after your trip.",
                    persian = "ممنون! بعد از سفرت با هم حرف می‌زنیم."
                ),
                DialogueLine(
                    speaker = "Kian",
                    english = "Sounds like a plan!",
                    persian = "به نظر برنامه خوبیه!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is Kian going to do this summer?",
                    answer = "He is going to travel to Italy with his family."
                ),
                ComprehensionQuestion(
                    question = "When are they flying?",
                    answer = "They're flying on July 15th."
                ),
                ComprehensionQuestion(
                    question = "How long are they staying?",
                    answer = "They're staying for two weeks."
                ),
                ComprehensionQuestion(
                    question = "What cities are they visiting?",
                    answer = "They're visiting Rome, Florence, and Venice."
                ),
                ComprehensionQuestion(
                    question = "What is Lena going to do?",
                    answer = "She's going to start a new job next month."
                ),
                ComprehensionQuestion(
                    question = "Where will Lena be working?",
                    answer = "She'll be working at a tech company."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your plans for the next month.",
                    promptPersian = "درباره برنامه‌هایت برای ماه آینده صحبت کن.",
                    hints = "Use: I'm going to..., I'm planning to..., I will..."
                ),
                SpeakingTask(
                    prompt = "Make predictions about your life in 5 years.",
                    promptPersian = "درباره زندگی‌ات در ۵ سال آینده پیش‌بینی کن.",
                    hints = "Use: I think I'll..., I might..., I'll probably..."
                ),
                SpeakingTask(
                    prompt = "Talk about a scheduled event coming up.",
                    promptPersian = "درباره یک رویداد زمان‌بندی‌شده که در پیش است صحبت کن.",
                    hints = "Use: The flight leaves at..., The meeting starts at..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your plans for the next year (about 150 words). Use will, going to, and present continuous for future.",
                    promptPersian = "درباره برنامه‌هایت برای سال آینده بنویس (حدود ۱۵۰ کلمه). از will، going to و حال استمراری برای آینده استفاده کن.",
                    wordCount = 150,
                    hints = "Include:\n- Travel plans\n- Career goals\n- Personal development\n- Predictions"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: Look at those clouds! It ___ rain.",
                    options = listOf("will", "is going to", "is", "does"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ help you with that.",
                    options = listOf("will", "am going", "do", "have"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: When I ___ home, I'll call you.",
                    options = listOf("will get", "get", "got", "am get"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: If it ___, we'll stay home.",
                    options = listOf("will rain", "rains", "rained", "raining"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ meeting Ali tomorrow at 3.",
                    options = listOf("am", "will", "do", "have"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: By next year, I ___ finished my degree.",
                    options = listOf("will", "will have", "have", "am"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'look forward to' mean?",
                    options = listOf("جلو نگاه کردن", "بی‌صبرانه منتظر بودن", "دور شدن", "پیش رفتن"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The train ___ at 8 AM tomorrow.",
                    options = listOf("will leave", "leaves", "leaving", "left"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 7 — Modals
    // ============================================================
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Modal Verbs",
            titlePersian = "افعال کمکی وجهی",
            objectives = listOf(
                "Use can, could, may, might for ability and possibility.",
                "Use must, have to, should for obligation and advice.",
                "Distinguish between must and have to.",
                "Express permission with can, may, and could.",
                "Use modal perfects for past speculation."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "ability",
                    persian = "توانایی",
                    pronunciation = "/əˈbɪləti/",
                    partOfSpeech = "noun",
                    example = "She has the ability to speak three languages.",
                    examplePersian = "او توانایی صحبت به سه زبان را دارد.",
                    antonyms = "inability",
                    wordFamily = "able, ably",
                    usageTip = "با can/could."
                ),
                VocabWord(
                    english = "obligation",
                    persian = "الزام، اجبار",
                    pronunciation = "/ˌɑːblɪˈɡeɪʃən/",
                    partOfSpeech = "noun",
                    example = "Paying taxes is an obligation.",
                    examplePersian = "پرداخت مالیات یک الزام است.",
                    wordFamily = "obligate, obligatory",
                    usageTip = "با must/have to."
                ),
                VocabWord(
                    english = "possibility",
                    persian = "احتمال",
                    pronunciation = "/ˌpɑːsəˈbɪləti/",
                    partOfSpeech = "noun",
                    example = "There's a possibility of rain tomorrow.",
                    examplePersian = "احتمال باران فردا وجود دارد.",
                    wordFamily = "possible, possibly",
                    usageTip = "با may/might/could."
                ),
                VocabWord(
                    english = "permission",
                    persian = "اجازه",
                    pronunciation = "/pərˈmɪʃən/",
                    partOfSpeech = "noun",
                    example = "You need permission to enter.",
                    examplePersian = "برای ورود به اجازه نیاز داری.",
                    wordFamily = "permit, permissible",
                    usageTip = "با can/may."
                ),
                VocabWord(
                    english = "prohibition",
                    persian = "ممنوعیت",
                    pronunciation = "/ˌproʊəˈbɪʃən/",
                    partOfSpeech = "noun",
                    example = "Smoking is a prohibition in many places.",
                    examplePersian = "سیگار کشیدن در بسیاری از مکان‌ها ممنوع است.",
                    wordFamily = "prohibit, prohibited",
                    usageTip = "با mustn't/can't."
                ),
                VocabWord(
                    english = "advice",
                    persian = "توصیه",
                    pronunciation = "/ədˈvaɪs/",
                    partOfSpeech = "noun",
                    example = "Let me give you some advice.",
                    examplePersian = "بگذار بهت یه توصیه بکنم.",
                    wordFamily = "advise, advisable",
                    usageTip = "با should/ought to."
                ),
                VocabWord(
                    english = "necessity",
                    persian = "ضرورت",
                    pronunciation = "/nəˈsesəti/",
                    partOfSpeech = "noun",
                    example = "Water is a necessity for life.",
                    examplePersian = "آب برای زندگی ضروری است.",
                    wordFamily = "necessary, necessarily",
                    usageTip = "با need/must."
                ),
                VocabWord(
                    english = "permission",
                    persian = "مجوز، اجازه",
                    pronunciation = "/pərˈmɪʃən/",
                    partOfSpeech = "noun",
                    example = "Do I have your permission?",
                    examplePersian = "اجازه‌ات را دارم؟",
                    usageTip = "با may/can."
                ),
                VocabWord(
                    english = "certainty",
                    persian = "قطعیت",
                    pronunciation = "/ˈsɜːrtənti/",
                    partOfSpeech = "noun",
                    example = "There's no certainty about the outcome.",
                    examplePersian = "هیچ قطعیتی درباره نتیجه وجود ندارد.",
                    antonyms = "uncertainty",
                    wordFamily = "certain, certainly",
                    usageTip = "با must (استنتاج قوی)."
                ),
                VocabWord(
                    english = "speculation",
                    persian = "گمانه‌زنی",
                    pronunciation = "/ˌspekjuˈleɪʃən/",
                    partOfSpeech = "noun",
                    example = "That's just speculation.",
                    examplePersian = "این فقط یک گمانه‌زنی است.",
                    wordFamily = "speculate, speculative",
                    usageTip = "با may/might/could."
                ),
                VocabWord(
                    english = "obligation",
                    persian = "تعهد، وظیفه",
                    pronunciation = "/ˌɑːblɪˈɡeɪʃən/",
                    partOfSpeech = "noun",
                    example = "It's your obligation to help.",
                    examplePersian = "کمک کردن وظیفه‌ات است.",
                    usageTip = "با must/have to."
                ),
                VocabWord(
                    english = "willingness",
                    persian = "تمایل",
                    pronunciation = "/ˈwɪlɪŋnəs/",
                    partOfSpeech = "noun",
                    example = "His willingness to help was appreciated.",
                    examplePersian = "تمایل او به کمک ارزشمند بود.",
                    wordFamily = "willing, willingly",
                    usageTip = "با will/would."
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
                ),
                IdiomExpression(
                    english = "might as well",
                    persian = "بهتر نیست، پس بیا...",
                    example = "We might as well go now.",
                    examplePersian = "بهتر نیست همین حالا برویم.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "have to",
                    meaning = "to be required to",
                    persian = "مجبور بودن",
                    example = "I have to work tomorrow.",
                    examplePersian = "فردا مجبورم کار کنم."
                ),
                PhrasalVerb(
                    verb = "be able to",
                    meaning = "to have the ability to",
                    persian = "توانستن",
                    example = "She's able to speak four languages.",
                    examplePersian = "او می‌تواند به چهار زبان صحبت کند."
                ),
                PhrasalVerb(
                    verb = "be allowed to",
                    meaning = "to have permission to",
                    persian = "اجازه داشتن",
                    example = "You're allowed to park here.",
                    examplePersian = "اجازه داری اینجا پارک کنی."
                ),
                PhrasalVerb(
                    verb = "get to",
                    meaning = "to have the opportunity to",
                    persian = "فرصت داشتن",
                    example = "I get to travel for work.",
                    examplePersian = "فرصت سفر برای کار را دارم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Modal contractions",
                    content = "در گفتار طبیعی:\n• cannot → can't /kænt/\n• could not → couldn't /ˈkʊdənt/\n• must not → mustn't /ˈmʌsənt/\n• should not → shouldn't /ˈʃʊdənt/\n• will not → won't /woʊnt/"
                ),
                PronunciationTip(
                    title = "Reduced pronunciation of 'have to'",
                    content = "در گفتار سریع، have to به صورت /ˈhæftə/ و has to به صورت /ˈhæstə/ تلفظ می‌شود."
                ),
                PronunciationTip(
                    title = "Stress in modals",
                    content = "در جملات خبری، فعل اصلی تأکید می‌گیرد:\n• I MUST GO.\n• She SHOULD REST."
                ),
                PronunciationTip(
                    title = "Intonation for possibility",
                    content = "برای بیان احتمال، آهنگ جمله معمولاً ملایم و رو به بالا است:\n• It might rain. ↑"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Politeness in English",
                    content = "در فرهنگ انگلیسی‌زبان، استفاده از could و would مؤدبانه‌تر از can و will است: 'Could you help me?' به جای 'Can you help me?'"
                ),
                CulturalNote(
                    title = "Direct vs indirect",
                    content = "انگلیسی‌زبانان از modals برای نرم‌تر کردن درخواست‌ها استفاده می‌کنند: 'I was wondering if you could...'"
                ),
                CulturalNote(
                    title = "Obligation in different cultures",
                    content = "در برخی فرهنگ‌ها، استفاده از must ممکن است مستقیم و قاطع به نظر برسد. معمولاً have to ترجیح داده می‌شود."
                ),
                CulturalNote(
                    title = "Modal perfects",
                    content = "ساختار modal + have + past participle برای توصیف احتمالات گذشته: 'She must have forgotten.'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Modal Verbs Overview",
                    content = """
افعال وجهی رایج:

| Modal | Use | Example |
|-------|-----|---------|
| can | ability, permission | I can swim. |
| could | past ability, polite requests, possibility | I could swim when young. |
| may | possibility, formal permission | It may rain. |
| might | weak possibility | She might come. |
| must | strong obligation, deduction | You must wear a seatbelt. |
| have to | external obligation | I have to work. |
| should | advice, expectation | You should rest. |
| ought to | advice (formal) | You ought to see a doctor. |
| will | future, willingness | I'll help you. |
| would | polite requests, hypotheticals | Would you help me? |

قواعد طلایی:
• Modals + base verb (بدون to): I can swim.
• Modals بدون -s: She can swim. (نه cans)
• Modals بدون to: باید نه should to.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Ability: Can, Could, Be Able To",
                    content = """
can — توانایی در حال:
• I can speak three languages.
• She can drive.

could — توانایی در گذشته:
• I could swim when I was five.
• He could play the piano as a child.

be able to — توانایی در همه زمان‌ها:
• I'll be able to help tomorrow. (آینده)
• She hasn't been able to sleep. (حال کامل)

نکته: could فقط برای توانایی عمومی گذشته است. برای توانایی در یک لحظه خاص گذشته، از was/were able to استفاده می‌کنیم:
• I was able to finish the project on time. (نه I could finish...)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Possibility: May, Might, Could",
                    content = """
may — احتمال متوسط، رسمی:
• It may rain tomorrow.
• She may be at home.

might — احتمال ضعیف:
• She might come to the party.
• I might go to the gym later.

could — احتمال (غیررسمی):
• It could be true.
• She could still be waiting.

درجه احتمال:
must (95%) > will (90%) > may (50%) > might (30%) > could (20%) > can't (5%)

مثال:
• She must be tired. (تقریباً مطمئنم)
• She may be tired. (احتمالاً)
• She might be tired. (شاید)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Obligation: Must, Have To, Should",
                    content = """
must — اجبار قوی از سوی گوینده:
• You must wear a helmet.
• I must finish this today.

have to — اجبار از قوانین یا شرایط خارجی:
• I have to work on Saturdays.
• She has to wear a uniform.

mustn't — ممنوعیت:
• You mustn't smoke here.

don't have to — عدم اجبار (اختیاری):
• You don't have to come, but you can.

should — توصیه و نصیحت:
• You should see a doctor.
• She should exercise more.

ought to — توصیه (رسمی‌تر):
• You ought to apologize.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Permission: Can, May, Could",
                    content = """
can — غیررسمی:
• Can I leave early?
• Can I use your phone?

may — رسمی:
• May I come in?
• May I ask a question?

could — مؤدبانه:
• Could I borrow your pen?
• Could I have a glass of water?

Be allowed to — اجازه داشتن:
• You're allowed to park here.
• I wasn't allowed to go out.

نکته: برای درخواست مؤدبانه، could مؤدبانه‌تر از can است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Advice: Should, Ought To, Had Better",
                    content = """
should — توصیه معمولی:
• You should eat more vegetables.
• She shouldn't work so hard.

ought to — توصیه رسمی:
• You ought to apologize.
• He ought to see a doctor.

had better — هشدار، توصیه قوی:
• You'd better not be late.
• He'd better call her.

مقایسه:
• should: توصیه دوستانه
• ought to: توصیه رسمی
• had better: هشدار (اگر نکنی، پیامد دارد)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Modal Perfects",
                    content = """
modal + have + past participle

must have + pp — استنتاج قوی گذشته:
• She must have forgotten. (حتماً فراموش کرده)
• He must have missed the bus.

may/might have + pp — احتمال گذشته:
• She may have left already.
• He might have taken the wrong train.

could have + pp — احتمال گذشته یا عدم انجام:
• She could have called. (ولی نکرد)
• They could have won the game.

should have + pp — پشیمانی:
• I should have studied harder.
• You shouldn't have said that.

would have + pp — شرطی گذشته:
• I would have helped you.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Modal Patterns",
                    content = """
ساختارهای رایج:

• Modal + base verb: I can swim.
• Modal + not + base verb: I can't swim.
• Modal + subject inversion (سؤال): Can you swim?

دقت کنید:
❌ She cans swim.
✅ She can swim.

❌ I must to go.
✅ I must go.

❌ You should to rest.
✅ You should rest.

با be able to:
• I'm able to help.
• She was able to finish.

با have to:
• I have to go.
• She has to work.

در سؤالات و منفی‌ها:
• Do you have to...? / I don't have to...
• Did you have to...? / I didn't have to...
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "She cans swim.",
                    correct = "She can swim.",
                    explanation = "Modals بدون -s هستند."
                ),
                CommonMistake(
                    wrong = "I must to go.",
                    correct = "I must go.",
                    explanation = "بعد از modals، فعل ساده بدون to می‌آید."
                ),
                CommonMistake(
                    wrong = "You should to rest.",
                    correct = "You should rest.",
                    explanation = "should + base verb (بدون to)."
                ),
                CommonMistake(
                    wrong = "You mustn't come if you're busy.",
                    correct = "You don't have to come if you're busy.",
                    explanation = "mustn't = ممنوعیت؛ don't have to = عدم اجبار."
                ),
                CommonMistake(
                    wrong = "I can to swim.",
                    correct = "I can swim.",
                    explanation = "بعد از can، فعل ساده بدون to."
                ),
                CommonMistake(
                    wrong = "She must be tired yesterday.",
                    correct = "She must have been tired yesterday.",
                    explanation = "برای گذشته، از modal perfect استفاده می‌کنیم."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Sam",
                    english = "Hi Rina! You look worried. What's wrong?",
                    persian = "سلام رینا! نگران به نظر می‌رسی. چی شده؟"
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "I have a big exam tomorrow and I don't feel ready.",
                    persian = "فردا یه امتحان بزرگ دارم و آماده نیستم."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "You should get some rest tonight.",
                    persian = "باید امشب استراحت کنی."
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "I know, but I must study a bit more.",
                    persian = "می‌دانم، ولی باید یه کم بیشتر درس بخوانم."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Well, you shouldn't stay up too late.",
                    persian = "خب، نباید خیلی دیر بیدار بمانی."
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "You're right. I might go to bed early tonight.",
                    persian = "حق داری. ممکنه امشب زود بخوابم."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Have you reviewed all the material?",
                    persian = "همه مطالب را مرور کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "Mostly. There are a few things I couldn't understand.",
                    persian = "بیشترش. چند تا چیز هست که نمی‌توانستم بفهمم."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Could I help you with anything?",
                    persian = "می‌تونم کمکت کنم؟"
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "That's very kind. Could you explain the conditionals to me?",
                    persian = "خیلی لطف داری. می‌تونی شرطی‌ها را برام توضیح بدی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Of course! I can help you with those.",
                    persian = "البته! می‌تونم کمکت کنم."
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "You must be very good at grammar.",
                    persian = "حتماً در گرامر خیلی خوبی."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I've had lots of practice. We'll go over them together.",
                    persian = "تمرین زیادی داشته‌ام. با هم مرورشان می‌کنیم."
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "Thanks. Should we meet at 4?",
                    persian = "ممنون. ساعت ۴ ببینیم؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Sounds good. You don't have to bring anything.",
                    persian = "خوبه. لازم نیست چیزی بیاری."
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "Great. I'll see you then.",
                    persian = "عالی. اون موقع می‌بینمت."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Good luck with your exam! You can do it!",
                    persian = "برای امتحانت موفق باشی! می‌تونی انجامش بدی!"
                ),
                DialogueLine(
                    speaker = "Rina",
                    english = "Thanks! I hope so!",
                    persian = "ممنون! امیدوارم!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What problem does Rina have?",
                    answer = "She has a big exam tomorrow and doesn't feel ready."
                ),
                ComprehensionQuestion(
                    question = "What does Sam advise Rina to do?",
                    answer = "Sam says she should get some rest and shouldn't stay up too late."
                ),
                ComprehensionQuestion(
                    question = "What does Rina say she must do?",
                    answer = "She must study a bit more."
                ),
                ComprehensionQuestion(
                    question = "What does Rina ask Sam to help with?",
                    answer = "She asks him to explain the conditionals."
                ),
                ComprehensionQuestion(
                    question = "What does Sam say about Rina's request?",
                    answer = "He says he can help her with conditionals."
                ),
                ComprehensionQuestion(
                    question = "Do they agree to meet?",
                    answer = "Yes, they agree to meet at 4."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Give advice to a friend who is stressed about work.",
                    promptPersian = "به دوستی که درباره کارش استرس دارد توصیه کن.",
                    hints = "Use: You should..., You shouldn't..., You might want to..."
                ),
                SpeakingTask(
                    prompt = "Talk about rules in your workplace or school.",
                    promptPersian = "درباره قوانین محل کار یا مدرسه‌ات صحبت کن.",
                    hints = "Use: We must..., We have to..., We can't..., We're not allowed to..."
                ),
                SpeakingTask(
                    prompt = "Speculate about what might have happened in a mystery story.",
                    promptPersian = "گمانه‌زنی کن که در یک داستان مرموز چه اتفاقی افتاده.",
                    hints = "Use: It might have been..., He could have..., She must have..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a letter to a friend giving advice about a problem they have (about 150 words). Use at least five different modals.",
                    promptPersian = "به دوستی نامه بنویس و درباره مشکلی که دارد توصیه کن (حدود ۱۵۰ کلمه). حداقل پنج modal مختلف به کار ببر.",
                    wordCount = 150,
                    hints = "Include:\n- Description of the problem\n- Advice using different modals\n- Encouragement"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: You ___ see a doctor.",
                    options = listOf("should", "should to", "shoulds", "shoulding"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: She ___ swim very well.",
                    options = listOf("can", "cans", "is can", "to can"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What's the difference between mustn't and don't have to?",
                    options = listOf(
                        "No difference",
                        "Mustn't is prohibition; don't have to means no obligation",
                        "Mustn't is optional; don't have to is required",
                        "Mustn't is stronger advice"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: ___ you help me with this?",
                    options = listOf("Could", "Coulds", "Could to", "Is could"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: She ___ have forgotten about the meeting.",
                    options = listOf("must", "musts", "must to", "is must"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: You ___ smoke here. It's forbidden.",
                    options = listOf("mustn't", "don't have to", "shouldn't", "couldn't"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'I had better study' mean?",
                    options = listOf(
                        "باید درس بخوانم (خیلی قوی)",
                        "شاید درس بخوانم",
                        "می‌توانم درس بخوانم",
                        "مطمئنم که درس نمی‌خوانم"
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: If you're busy, you ___ come to the meeting.",
                    options = listOf("mustn't", "don't have to", "can't", "shouldn't"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 8 — Conditionals
    // ============================================================
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Conditionals",
            titlePersian = "جملات شرطی",
            objectives = listOf(
                "Use zero and first conditionals for real situations.",
                "Use second conditional for hypothetical situations.",
                "Use third conditional for past regrets.",
                "Use mixed conditionals for complex scenarios.",
                "Distinguish between the four main types."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "condition",
                    persian = "شرط",
                    pronunciation = "/kənˈdɪʃən/",
                    partOfSpeech = "noun",
                    example = "I'll help you on one condition.",
                    examplePersian = "به یک شرط کمکت می‌کنم.",
                    collocations = "on condition that",
                    wordFamily = "conditional, conditionally",
                    usageTip = "پایه جملات شرطی."
                ),
                VocabWord(
                    english = "hypothetical",
                    persian = "فرضی",
                    pronunciation = "/ˌhaɪpəˈθetɪkəl/",
                    partOfSpeech = "adjective",
                    example = "It's a hypothetical situation.",
                    examplePersian = "این یک وضعیت فرضی است.",
                    wordFamily = "hypothesis, hypothesize",
                    usageTip = "برای second conditional."
                ),
                VocabWord(
                    english = "consequence",
                    persian = "پیامد",
                    pronunciation = "/ˈkɑːnsəkwens/",
                    partOfSpeech = "noun",
                    example = "Actions have consequences.",
                    examplePersian = "اعمال پیامد دارند.",
                    wordFamily = "consequent, consequently",
                    usageTip = "در بخش نتیجه شرطی."
                ),
                VocabWord(
                    english = "regret",
                    persian = "پشیمانی",
                    pronunciation = "/rɪˈɡret/",
                    partOfSpeech = "noun/verb",
                    example = "I regret not studying harder.",
                    examplePersian = "پشیمانم که بیشتر درس نخواندم.",
                    wordFamily = "regretful, regrettable",
                    usageTip = "با third conditional."
                ),
                VocabWord(
                    english = "if only",
                    persian = "ای کاش",
                    pronunciation = "/ɪf ˈoʊnli/",
                    partOfSpeech = "expression",
                    example = "If only I had more time!",
                    examplePersian = "ای کاش وقت بیشتری داشتم!",
                    usageTip = "برای ابراز آرزو یا پشیمانی."
                ),
                VocabWord(
                    english = "imaginary",
                    persian = "خیالی",
                    pronunciation = "/ɪˈmædʒɪneri/",
                    partOfSpeech = "adjective",
                    example = "It was an imaginary scenario.",
                    examplePersian = "این یک سناریوی خیالی بود.",
                    wordFamily = "imagine, imagination",
                    usageTip = "برای second conditional."
                ),
                VocabWord(
                    english = "scenario",
                    persian = "سناریو",
                    pronunciation = "/səˈnærioʊ/",
                    partOfSpeech = "noun",
                    example = "Consider this scenario.",
                    examplePersian = "این سناریو را در نظر بگیر.",
                    usageTip = "برای فرضیات."
                ),
                VocabWord(
                    english = "in case",
                    persian = "در صورتی که",
                    pronunciation = "/ɪn keɪs/",
                    partOfSpeech = "expression",
                    example = "Take an umbrella in case it rains.",
                    examplePersian = "چتر بردار در صورتی که باران آمد.",
                    usageTip = "با حال ساده یا should."
                ),
                VocabWord(
                    english = "unless",
                    persian = "مگر اینکه",
                    pronunciation = "/ənˈles/",
                    partOfSpeech = "conjunction",
                    example = "I won't go unless you come.",
                    examplePersian = "نمی‌روم مگر اینکه تو بیایی.",
                    usageTip = "جایگزین if...not."
                ),
                VocabWord(
                    english = "provided that",
                    persian = "به شرطی که",
                    pronunciation = "/prəˈvaɪdɪd ðæt/",
                    partOfSpeech = "conjunction",
                    example = "I'll help provided that you ask nicely.",
                    examplePersian = "کمک می‌کنم به شرطی که مؤدبانه درخواست کنی.",
                    usageTip = "رسمی‌تر از if."
                ),
                VocabWord(
                    english = "otherwise",
                    persian = "در غیر این صورت",
                    pronunciation = "/ˈʌðərwaɪz/",
                    partOfSpeech = "adverb",
                    example = "Hurry up, otherwise we'll be late.",
                    examplePersian = "عجله کن، وگرنه دیر می‌رسیم.",
                    usageTip = "با شرطی‌ها."
                ),
                VocabWord(
                    english = "in the event of",
                    persian = "در صورت وقوع",
                    pronunciation = "/ɪn ði ɪˈvent əv/",
                    partOfSpeech = "phrase",
                    example = "In the event of rain, we'll stay home.",
                    examplePersian = "در صورت بارش باران، خانه می‌مانیم.",
                    usageTip = "رسمی."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "if push comes to shove",
                    persian = "در بدترین حالت",
                    example = "If push comes to shove, I'll do it myself.",
                    examplePersian = "در بدترین حالت، خودم انجامش می‌دهم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "in the same boat",
                    persian = "در یک وضعیت مشترک",
                    example = "If we fail, we're all in the same boat.",
                    examplePersian = "اگر شکست بخوریم، همه در یک وضعیت هستیم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "no matter what",
                    persian = "تحت هر شرایطی",
                    example = "I'll help you no matter what.",
                    examplePersian = "تحت هر شرایطی کمکت می‌کنم.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "count on",
                    meaning = "to depend on",
                    persian = "تکیه کردن به",
                    example = "You can count on me.",
                    examplePersian = "می‌تونی روی من حساب کنی."
                ),
                PhrasalVerb(
                    verb = "come up with",
                    meaning = "to think of",
                    persian = "ارائه دادن",
                    example = "If you come up with a plan, let me know.",
                    examplePersian = "اگر برنامه‌ای ارائه دادی، خبرم کن."
                ),
                PhrasalVerb(
                    verb = "put off",
                    meaning = "to postpone",
                    persian = "به تعویق انداختن",
                    example = "If it rains, we'll put off the picnic.",
                    examplePersian = "اگر باران بیاید، پیک‌نیک را به تعویق می‌اندازیم."
                ),
                PhrasalVerb(
                    verb = "go ahead",
                    meaning = "to proceed",
                    persian = "ادامه دادن",
                    example = "If you agree, we'll go ahead.",
                    examplePersian = "اگر موافقی، ادامه می‌دهیم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Reduced 'if' in speech",
                    content = "در گفتار سریع، if اغلب به صورت کوتاه تلفظ می‌شود:\n• If I were you → /ɪf aɪ wər ju/"
                ),
                PronunciationTip(
                    title = "Stress on main clauses",
                    content = "در شرطی‌ها، تأکید روی بخش اصلی است:\n• If you study, you'll PASS."
                ),
                PronunciationTip(
                    title = "Stress in third conditional",
                    content = "در third conditional، on past participle تأکید می‌شود:\n• If I had KNOWN, I would have ACTED."
                ),
                PronunciationTip(
                    title = "Rising intonation in if-clause",
                    content = "در if-clause معمولاً آهنگ صعودی و در main clause نزولی:\n• If you come ↑, we'll go out ↓."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Politeness in conditionals",
                    content = "انگلیسی‌زبانان از second conditional برای مؤدبانه‌تر شدن استفاده می‌کنند: 'I would appreciate it if you could help.'"
                ),
                CulturalNote(
                    title = "Regret and reflection",
                    content = "Third conditional برای بازنگری گذشته و بیان پشیمانی: 'If I had studied medicine, I would be a doctor now.'"
                ),
                CulturalNote(
                    title = "Hypothetical scenarios",
                    content = "در مکالمات روزمره، افراد اغلب با 'What would you do if...?' بازی می‌کنند."
                ),
                CulturalNote(
                    title = "Conditional promises",
                    content = "در مذاکرات، از 'provided that' برای شرط‌های رسمی استفاده می‌شود."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Zero Conditional: General Truths",
                    content = """
ساختار: If + present simple, present simple

کاربرد: حقایق کلی، قوانین علمی، دستورالعمل‌ها

مثال:
• If you heat water to 100°C, it boils.
• If you don't water plants, they die.
• If I drink coffee at night, I don't sleep well.
• If you press this button, the machine starts.

نکته: در zero conditional، if می‌تواند با when جایگزین شود بدون تغییر معنی.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. First Conditional: Real Possibilities",
                    content = """
ساختار: If + present simple, will + base verb

کاربرد: موقعیت‌های واقعی و ممکن در آینده

مثال:
• If it rains, I will stay home.
• If you study hard, you will pass the exam.
• If she calls, I'll tell her.
• If they arrive late, we'll start without them.

منفی:
• If you don't hurry, we'll miss the train.

سؤالی:
• What will you do if you lose your job?

نکته: در if-clause از will استفاده نمی‌کنیم:
❌ If it will rain, I will stay home.
✅ If it rains, I will stay home.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Second Conditional: Unreal Present",
                    content = """
ساختار: If + past simple, would + base verb

کاربرد: فرضیات غیرواقعی در حال، آرزوها، توصیه

مثال:
• If I had more money, I would travel the world.
• If I were you, I would apologize.
• If she knew the answer, she would tell us.
• If we lived by the sea, we would swim every day.

نکته: با فعل be در second conditional، از were برای همه فاعل‌ها استفاده می‌کنیم (فرمال):
• If I were rich, I would buy a yacht.
(در انگلیسی غیررسمی، was هم رایج است)

نکته: would در if-clause نمی‌آید:
❌ If I would have money...
✅ If I had money...
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Third Conditional: Unreal Past",
                    content = """
ساختار: If + past perfect, would have + past participle

کاربرد: پشیمانی، فرضیات گذشته که امکان‌پذیر نبود

مثال:
• If I had studied harder, I would have passed.
• If we had left earlier, we wouldn't have missed the flight.
• If she had told me, I would have helped.
• If they had known, they would have acted differently.

نکته: ساختار کوتاه:
• I'd have → I would have
• If I'd known → If I had known

تلفظ:
• would have → would've /ˈwʊdəv/
• had → 'd /d/
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Mixed Conditionals",
                    content = """
ترکیب second و third conditional برای موقعیت‌های پیچیده:

نوع ۱: گذشته + حال
If + past perfect, would + base verb
• If I had studied medicine, I would be a doctor now.
(گذشته: درس نخواندم — حال: دکتر نیستم)

نوع ۲: حال + گذشته
If + past simple, would have + past participle
• If I weren't so busy, I would have helped you yesterday.
(حال: مشغولم — گذشته: کمک نکردم)

مثال‌های بیشتر:
• If she had taken the job, she would be living in London now.
• If he weren't so shy, he would have spoken at the meeting.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Unless, In Case, Provided That",
                    content = """
جایگزین‌های if:

unless = if...not:
• I won't go unless you come. (= I won't go if you don't come)
• Unless it rains, we'll have a picnic.

in case = برای احتیاط:
• Take an umbrella in case it rains.
• I'll bring extra food in case we get hungry.

provided that / as long as = به شرطی که:
• I'll help provided that you ask nicely.
• You can go out as long as you're back by 10.

otherwise = در غیر این صورت:
• Hurry up, otherwise we'll be late.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Conditional with Modal Verbs",
                    content = """
با modals در main clause:

• If you finish early, you can leave.
• If you're tired, you should rest.
• If it rains, we might stay home.
• If you want, you could come with us.
• If she studies, she must pass.

نکته: بعد از if، همیشه حال ساده می‌آید (نه will/can/should):
❌ If you can come, tell me.
✅ If you can come, tell me. (استثنا: can برای توانایی)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Conditional Expressions",
                    content = """
عبارات رایج با if:

• If I were you, I would... (توصیه)
• If only I had... (پشیمانی)
• What if...? (نگرانی)
• Suppose/Supposing... (فرض کردن)
• I'll do it on condition that... (شرط)
• In the unlikely event that... (احتمال کم)

مثال:
• If I were you, I'd apologize.
• If only I had studied more!
• What if we miss the train?
• Suppose you won the lottery — what would you do?
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "If it will rain, I will stay home.",
                    correct = "If it rains, I will stay home.",
                    explanation = "در if-clause از حال ساده استفاده می‌کنیم، نه will."
                ),
                CommonMistake(
                    wrong = "If I would have money, I would travel.",
                    correct = "If I had money, I would travel.",
                    explanation = "در second conditional از past simple استفاده می‌کنیم، نه would."
                ),
                CommonMistake(
                    wrong = "If I was you, I'd apologize.",
                    correct = "If I were you, I'd apologize.",
                    explanation = "در second conditional، با فعل be از were استفاده می‌کنیم (فرمال)."
                ),
                CommonMistake(
                    wrong = "If I had studied, I would passed.",
                    correct = "If I had studied, I would have passed.",
                    explanation = "در third conditional، ساختار would have + pp است."
                ),
                CommonMistake(
                    wrong = "I'll help you unless you ask nicely.",
                    correct = "I'll help you provided that you ask nicely.",
                    explanation = "unless = if...not، پس معنی متفاوتی می‌دهد."
                ),
                CommonMistake(
                    wrong = "If I would have known, I would have come.",
                    correct = "If I had known, I would have come.",
                    explanation = "در if-clause سوم شرطی، past perfect می‌آید."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Nima",
                    english = "What would you do if you won the lottery?",
                    persian = "اگر لاتاری برنده می‌شدی چیکار می‌کردی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "If I won the lottery, I would travel the world!",
                    persian = "اگر لاتاری برنده می‌شدم، به دور دنیا سفر می‌کردم!"
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "Where would you go first?",
                    persian = "اول کجا می‌رفتی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "If I had the chance, I'd go to Japan first.",
                    persian = "اگر فرصت داشتم، اول ژاپن می‌رفتم."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "Nice choice! What about your job?",
                    persian = "انتخاب خوبی! شغلت چطور؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "If I didn't need the money, I would quit my job.",
                    persian = "اگر به پول نیازی نداشتم، شغلم را رها می‌کردم."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "Really? Would you start your own business?",
                    persian = "واقعاً؟ کسب‌وکار خودت را راه می‌انداختی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Yes, if I had enough money, I would open a bakery.",
                    persian = "بله، اگر پول کافی داشتم، یه قنادی باز می‌کردم."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "That's a great dream. What about you?",
                    persian = "این یه رویای عالیه. تو چطور؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Wait, you haven't told me what you'd do!",
                    persian = "صبر کن، تو نگفتی چیکار می‌کردی!"
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "You're right. If I won, I would give some to charity.",
                    persian = "حق داری. اگر برنده می‌شدم، مقداری به خیریه می‌دادم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "That's very generous! What about the rest?",
                    persian = "خیلی سخاوتمندانه‌ست! بقیه‌اش چطور؟"
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "I'd probably save most of it for the future.",
                    persian = "احتمالاً بیشترش را برای آینده پس‌انداز می‌کردم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Smart. If I were you, I'd probably spend too much!",
                    persian = "هوشمندانه. اگر جای تو بودم، احتمالاً خیلی خرج می‌کردم!"
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "Ha! Well, if I hadn't learned to save, I would be broke by now.",
                    persian = "ها! خب، اگر پس‌انداز کردن یاد نگرفته بودم، الان ورشکست بودم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "True. Financial skills are important.",
                    persian = "درسته. مهارت‌های مالی مهمند."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "If only we could win for real!",
                    persian = "ای کاش واقعاً برنده می‌شدیم!"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Dreams are free! Let's keep imagining.",
                    persian = "رویاها مجانی هستند! بیا ادامه بدیم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What would Sara do if she won the lottery?",
                    answer = "She would travel the world and open a bakery."
                ),
                ComprehensionQuestion(
                    question = "Would Sara quit her job?",
                    answer = "If she didn't need the money, she would quit her job."
                ),
                ComprehensionQuestion(
                    question = "What would Nima do with the money?",
                    answer = "He would give some to charity and save the rest."
                ),
                ComprehensionQuestion(
                    question = "What does Sara say about Nima's plan?",
                    answer = "She says it's smart, and she would probably spend too much herself."
                ),
                ComprehensionQuestion(
                    question = "What does Nima say about financial skills?",
                    answer = "If he hadn't learned to save, he would be broke by now."
                ),
                ComprehensionQuestion(
                    question = "What does Nima say at the end?",
                    answer = "He says, 'If only we could win for real!'"
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about what you would do if you had more free time.",
                    promptPersian = "درباره اینکه اگر وقت آزاد بیشتری داشتی چیکار می‌کردی صحبت کن.",
                    hints = "Use: If I had..., I would..., I'd probably..."
                ),
                SpeakingTask(
                    prompt = "Discuss a past decision you regret.",
                    promptPersian = "درباره تصمیم گذشته‌ای که پشیمانش هستی صحبت کن.",
                    hints = "Use: If I had..., I would have..., If only I had..."
                ),
                SpeakingTask(
                    prompt = "Give advice using second conditional.",
                    promptPersian = "با second conditional توصیه کن.",
                    hints = "Use: If I were you, I would..., If I were in your position..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about a hypothetical scenario (about 150 words). Use all four types of conditionals at least once each.",
                    promptPersian = "درباره یه سناریوی فرضی بنویس (حدود ۱۵۰ کلمه). از چهار نوع شرطی حداقل یک بار استفاده کن.",
                    wordCount = 150,
                    hints = "Structure:\n1. Zero: General fact\n2. First: Real possibility\n3. Second: Hypothetical\n4. Third: Past regret"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: If it rains, I ___ stay home.",
                    options = listOf("will", "would", "am", "do"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: If I ___ you, I'd wait.",
                    options = listOf("am", "was", "were", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: If I had known, I ___ helped.",
                    options = listOf("will have", "would have", "have", "had"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "If I will see him, I'll tell him.",
                        "If I see him, I'll tell him.",
                        "If I would see him, I'll tell him.",
                        "If I see him, I would tell him."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: If I had money, I ___ travel.",
                    options = listOf("will", "would", "am", "have"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'unless' mean?",
                    options = listOf("اگر", "مگر اینکه", "برای اینکه", "در حالی که"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: If you ___ coffee at night, you don't sleep well.",
                    options = listOf("drink", "drank", "will drink", "drinking"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: Take an umbrella ___ it rains.",
                    options = listOf("if", "in case", "unless", "provided"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 9 — Passive Voice
    // ============================================================
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Passive Voice",
            titlePersian = "مجهول",
            objectives = listOf(
                "Form passive sentences in different tenses.",
                "Use passive voice when the doer is unknown or unimportant.",
                "Distinguish between active and passive.",
                "Use passive with modals and infinitives.",
                "Decide when passive is more appropriate than active."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "passive",
                    persian = "مجهول",
                    pronunciation = "/ˈpæsɪv/",
                    partOfSpeech = "adjective",
                    example = "This sentence is passive.",
                    examplePersian = "این جمله مجهول است.",
                    antonyms = "active",
                    wordFamily = "passivity, passively",
                    usageTip = "be + past participle."
                ),
                VocabWord(
                    english = "agent",
                    persian = "فاعل مجهول (کننده کار)",
                    pronunciation = "/ˈeɪdʒənt/",
                    partOfSpeech = "noun",
                    example = "In passive voice, the agent is often omitted.",
                    examplePersian = "در جمله مجهول، فاعل غالباً حذف می‌شود.",
                    usageTip = "با by نشان داده می‌شود."
                ),
                VocabWord(
                    english = "object",
                    persian = "مفعول",
                    pronunciation = "/ˈɑːbdʒekt/",
                    partOfSpeech = "noun",
                    example = "The direct object becomes the subject.",
                    examplePersian = "مفعول مستقیم به فاعل تبدیل می‌شود.",
                    wordFamily = "objective",
                    usageTip = "در ساخت passive."
                ),
                VocabWord(
                    english = "subject",
                    persian = "فاعل",
                    pronunciation = "/ˈsʌbdʒekt/",
                    partOfSpeech = "noun",
                    example = "The subject receives the action in passive voice.",
                    examplePersian = "در مجهول، فاعل عمل را دریافت می‌کند.",
                    usageTip = "در جمله مجهول."
                ),
                VocabWord(
                    english = "impersonal",
                    persian = "غیرشخصی",
                    pronunciation = "/ɪmˈpɜːrsənəl/",
                    partOfSpeech = "adjective",
                    example = "Impersonal passive is common in academic writing.",
                    examplePersian = "مجهول غیرشخصی در نوشتار آکادمیک رایج است.",
                    usageTip = "با it is said, it is believed."
                ),
                VocabWord(
                    english = "emphasis",
                    persian = "تأکید",
                    pronunciation = "/ˈemfəsɪs/",
                    partOfSpeech = "noun",
                    example = "Passive voice puts emphasis on the action.",
                    examplePersian = "مجهول تأکید را روی عمل می‌گذارد.",
                    wordFamily = "emphasize, emphatic",
                    usageTip = "کاربرد passive."
                ),
                VocabWord(
                    english = "formal",
                    persian = "رسمی",
                    pronunciation = "/ˈfɔːrməl/",
                    partOfSpeech = "adjective",
                    example = "Passive voice is common in formal writing.",
                    examplePersian = "مجهول در نوشتار رسمی رایج است.",
                    antonyms = "informal",
                    usageTip = "در مقالات علمی."
                ),
                VocabWord(
                    english = "process",
                    persian = "فرایند",
                    pronunciation = "/ˈprɑːses/",
                    partOfSpeech = "noun",
                    example = "The process is often described in passive voice.",
                    examplePersian = "فرایند معمولاً با مجهول توصیف می‌شود.",
                    usageTip = "در توضیح مراحل."
                ),
                VocabWord(
                    english = "responsible",
                    persian = "مسئول",
                    pronunciation = "/rɪˈspɑːnsəbəl/",
                    partOfSpeech = "adjective",
                    example = "Who is responsible for this action?",
                    examplePersian = "چه کسی مسئول این کار است؟",
                    wordFamily = "responsibility",
                    usageTip = "در جملات active."
                ),
                VocabWord(
                    english = "discover",
                    persian = "کشف کردن",
                    pronunciation = "/dɪˈskʌvər/",
                    partOfSpeech = "verb",
                    example = "Penicillin was discovered by Fleming.",
                    examplePersian = "پنی‌سیلین توسط فلمینگ کشف شد.",
                    wordFamily = "discovery",
                    usageTip = "در passive گذشته."
                ),
                VocabWord(
                    english = "invent",
                    persian = "اختراع کردن",
                    pronunciation = "/ɪnˈvent/",
                    partOfSpeech = "verb",
                    example = "The telephone was invented in 1876.",
                    examplePersian = "تلفن در سال ۱۸۷۶ اختراع شد.",
                    wordFamily = "invention, inventor",
                    usageTip = "در passive گذشته."
                ),
                VocabWord(
                    english = "manufacture",
                    persian = "تولید کردن",
                    pronunciation = "/ˌmænjuˈfæktʃər/",
                    partOfSpeech = "verb",
                    example = "These cars are manufactured in Japan.",
                    examplePersian = "این خودروها در ژاپن تولید می‌شوند.",
                    wordFamily = "manufacturer, manufacturing",
                    usageTip = "در passive حال."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "be said to",
                    persian = "گفته می‌شود که",
                    example = "He is said to be very rich.",
                    examplePersian = "گفته می‌شود که او خیلی ثروتمند است.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "be supposed to",
                    persian = "قرار است، باید",
                    example = "The meeting is supposed to start at 10.",
                    examplePersian = "قرار است جلسه ساعت ۱۰ شروع شود.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "be used to",
                    persian = "مورد استفاده قرار گرفتن",
                    example = "This tool is used to cut wood.",
                    examplePersian = "این ابزار برای بریدن چوب استفاده می‌شود.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "be made of",
                    meaning = "to be manufactured from",
                    persian = "ساخته شده از",
                    example = "The table is made of wood.",
                    examplePersian = "میز از چوب ساخته شده."
                ),
                PhrasalVerb(
                    verb = "be made in",
                    meaning = "to be produced in a place",
                    persian = "ساخته شده در",
                    example = "These shoes are made in Italy.",
                    examplePersian = "این کفش‌ها در ایتالیا ساخته می‌شوند."
                ),
                PhrasalVerb(
                    verb = "be known for",
                    meaning = "to be famous for",
                    persian = "شناخته شده برای",
                    example = "Paris is known for its fashion.",
                    examplePersian = "پاریس برای مد شناخته شده است."
                ),
                PhrasalVerb(
                    verb = "be based on",
                    meaning = "to be founded on",
                    persian = "بر اساس",
                    example = "The movie is based on a true story.",
                    examplePersian = "این فیلم بر اساس یه داستان واقعی ساخته شده."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Contracted auxiliaries",
                    content = "در گفتار طبیعی:\n• The book's written → The book is written\n• They're sold → They are sold"
                ),
                PronunciationTip(
                    title = "Stress shift in passive",
                    content = "در passive، تأکید روی فعل اصلی (past participle) است:\n• The window was BROKEN by Tom.\n• The house is BEING painted."
                ),
                PronunciationTip(
                    title = "Weak forms of be",
                    content = "در گفتار، am/is/are ضعیف تلفظ می‌شوند:\n• The letters are sent → /ðə ˈletərz ər sent/"
                ),
                PronunciationTip(
                    title = "Emphasis on by-agent",
                    content = "وقتی فاعل مهم است، روی by + agent تأکید می‌کنیم:\n• It was written BY HEMINGWAY."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Passive in scientific writing",
                    content = "در مقالات علمی، passive رایج است چون تمرکز روی نتایج است: 'The experiment was conducted...'"
                ),
                CulturalNote(
                    title = "Passive in news",
                    content = "اخبار اغلب از passive برای توصیف رویدادها استفاده می‌کنند: 'Three people were injured in the accident.'"
                ),
                CulturalNote(
                    title = "Passive in formal correspondence",
                    content = "در نامه‌های رسمی و کاری: 'Your order has been shipped.'"
                ),
                CulturalNote(
                    title = "Avoiding responsibility",
                    content = "گاهی passive برای پنهان کردن فاعل استفاده می‌شود: 'Mistakes were made.' (توسط چه کسی؟)"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Passive Voice: Structure",
                    content = """
ساختار کلی:
Subject + be + past participle + (by + agent)

مثال‌ها:
Active: Tom writes the letter.
Passive: The letter is written by Tom.

Active: They built the house in 1990.
Passive: The house was built in 1990.

نکته: agent (by + فاعل) فقط در صورت مهم بودن ذکر می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Passive in Different Tenses",
                    content = """
| Tense | Active | Passive |
|-------|--------|---------|
| Present Simple | They clean the office. | The office is cleaned. |
| Present Continuous | They are cleaning the office. | The office is being cleaned. |
| Present Perfect | They have cleaned the office. | The office has been cleaned. |
| Past Simple | They cleaned the office. | The office was cleaned. |
| Past Continuous | They were cleaning the office. | The office was being cleaned. |
| Past Perfect | They had cleaned the office. | The office had been cleaned. |
| Future Simple | They will clean the office. | The office will be cleaned. |
| Future Perfect | They will have cleaned the office. | The office will have been cleaned. |
| Modals | They must clean the office. | The office must be cleaned. |
| Infinitive | They want to clean the office. | They want the office to be cleaned. |

نکته کلیدی: شکل be بر اساس tense تغییر می‌کند، ولی past participle ثابت است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Active vs Passive: When to Use",
                    content = """
از passive استفاده می‌کنیم وقتی:

1. فاعل ناشناخته است:
   My car was stolen last night. (کی دزدید؟ نمی‌دانیم)

2. فاعل بی‌اهمیت است:
   The road is being repaired. (مهم نیست کی تعمیر می‌کند)

3. فاعل واضح است:
   The thief was arrested. (بدیهی است که پلیس)

4. تمرکز روی مفعول است:
   The prize was given to Maria. (تأکید روی جایزه یا ماریا)

5. در نوشتار رسمی و علمی:
   The experiment was conducted three times.

از active استفاده می‌کنیم وقتی:
• فاعل مهم است: Maria won the prize.
• اطلاعات واضح‌تر منتقل می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Passive with Two Objects",
                    content = """
وقتی فعل دو مفعول دارد (direct + indirect):

Active: They gave Sarah a prize.
مفعول غیرمستقیم: Sarah
مفعول مستقیم: a prize

Passive 1: Sarah was given a prize. (رایج‌تر)
Passive 2: A prize was given to Sarah. (رسمی‌تر)

فعل‌های رایج با دو مفعول:
give, send, show, tell, offer, lend, promise, teach, bring

مثال‌ها:
• I was sent a letter. / A letter was sent to me.
• He was offered a job. / A job was offered to him.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Passive with Modals",
                    content = """
ساختار: Modal + be + past participle

• The rule must be followed.
• The package can be delivered tomorrow.
• The work should be finished by Friday.
• The problem might be solved.
• The car has to be repaired.

منفی:
• The rules must not be broken.

سؤالی:
• Can the results be trusted?

با modal perfect:
• The letter should have been sent yesterday.
• It might have been forgotten.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Personal and Impersonal Passive",
                    content = """
Personal passive (شخصی):
It + passive verb + that + clause

• It is said that he is very rich.
• It is believed that she is innocent.
• It is reported that the economy is improving.

Impersonal passive (غیرشخصی با فاعل):
Subject + passive + to + infinitive

• He is said to be very rich.
• She is believed to be innocent.
• The economy is reported to be improving.

افعال رایج:
say, believe, think, know, report, suppose, consider, expect, claim
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Get + Past Participle",
                    content = """
در انگلیسی غیررسمی، get + past participle به جای be استفاده می‌شود:

• I got my hair cut yesterday.
• She got her car repaired.
• They got married last month.
• He got fired from his job.

نکته: get + pp بیشتر در موقعیت‌های غیررسمی و رویدادها استفاده می‌شود.

مقایسه:
• The window was broken. (خنثی)
• The window got broken. (غیررسمی، تأکید روی رویداد)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Passive in Academic Writing",
                    content = """
در مقالات علمی و آکادمیک:

• The samples were collected from three different locations.
• The data was analyzed using statistical software.
• The results were compared with previous studies.
• It has been demonstrated that...
• The theory was first proposed by Einstein.

نکته: در آکادمیک، passive رایج است چون:
• تمرکز روی فرایند و نتایج است
• نویسنده در متن اهمیت کمتری دارد
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "The house was build in 1990.",
                    correct = "The house was built in 1990.",
                    explanation = "past participle صحیح build، built است."
                ),
                CommonMistake(
                    wrong = "The book is wrote by Hemingway.",
                    correct = "The book is written by Hemingway.",
                    explanation = "past participle صحیح write، written است."
                ),
                CommonMistake(
                    wrong = "The rule must followed.",
                    correct = "The rule must be followed.",
                    explanation = "با modals، be + pp."
                ),
                CommonMistake(
                    wrong = "The cake was ate by the children.",
                    correct = "The cake was eaten by the children.",
                    explanation = "past participle صحیح eat، eaten است."
                ),
                CommonMistake(
                    wrong = "I was born in Tehran (wrong context).",
                    correct = "Correct.",
                    explanation = "این جمله صحیح است. دقت: 'born' در واقع past participle فعل 'bear' است."
                ),
                CommonMistake(
                    wrong = "Is being the house cleaned?",
                    correct = "Is the house being cleaned?",
                    explanation = "ترتیب: auxiliary + subject + be + pp."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Lena",
                    english = "Have you heard about the new library?",
                    persian = "درباره کتابخانه جدید شنیده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "Yes! It was designed by a famous architect.",
                    persian = "بله! توسط یه معمار معروف طراحی شده."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Really? When was it built?",
                    persian = "واقعاً؟ کِی ساخته شد؟"
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "It was completed last year. It's been open for three months.",
                    persian = "سال گذشته تکمیل شد. سه ماهه که بازه."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "I should visit it. Is it free?",
                    persian = "باید برم ببینمش. رایگانه؟"
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "Yes, entry is not charged. But books must be returned on time.",
                    persian = "بله، ورودی گرفته نمی‌شه. ولی کتاب‌ها باید سر وقت برگردونده بشن."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Are memberships available?",
                    persian = "عضویت‌ها موجوده؟"
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "Yes, they can be purchased online or at the entrance.",
                    persian = "بله، می‌تونن آنلاین یا در ورودی خریداری بشن."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Nice. Are quiet zones respected?",
                    persian = "خوبه. مناطق ساکت رعایت می‌شن؟"
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "Yes, silence is strictly enforced.",
                    persian = "بله، سکوت کاملاً اجرا می‌شه."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Perfect. Are workshops offered?",
                    persian = "عالی. کارگاه‌ها ارائه می‌شن؟"
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "Yes, free workshops are held every Saturday.",
                    persian = "بله، کارگاه‌های رایگان هر شنبه برگزار می‌شن."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "That's wonderful. Has the library been popular?",
                    persian = "فوق‌العاده‌ست. کتابخانه محبوب بوده؟"
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "Very! It's been visited by thousands of people already.",
                    persian = "خیلی! تا حالا هزاران نفر ازش بازدید کردن."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "I'll definitely go this weekend.",
                    persian = "این آخر هفته حتماً می‌رم."
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "You should! It was designed to be enjoyed by everyone.",
                    persian = "باید بری! طوری طراحی شده که همه ازش لذت ببرن."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Thanks for the info!",
                    persian = "ممنون برای اطلاعات!"
                ),
                DialogueLine(
                    speaker = "Karim",
                    english = "Anytime!",
                    persian = "هر وقت!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Who designed the new library?",
                    answer = "It was designed by a famous architect."
                ),
                ComprehensionQuestion(
                    question = "When was the library built?",
                    answer = "It was completed last year."
                ),
                ComprehensionQuestion(
                    question = "Is there an entry fee?",
                    answer = "No, entry is not charged."
                ),
                ComprehensionQuestion(
                    question = "How can memberships be purchased?",
                    answer = "They can be purchased online or at the entrance."
                ),
                ComprehensionQuestion(
                    question = "When are workshops held?",
                    answer = "Free workshops are held every Saturday."
                ),
                ComprehensionQuestion(
                    question = "How many people have visited the library?",
                    answer = "It's been visited by thousands of people already."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe how a common product is made using passive voice.",
                    promptPersian = "توصیف کن که یک محصول رایج چطور ساخته می‌شود (با مجهول).",
                    hints = "Use: It is made..., It is produced..., It is designed..."
                ),
                SpeakingTask(
                    prompt = "Talk about famous inventions and discoveries.",
                    promptPersian = "درباره اختراعات و اکتشافات معروف صحبت کن.",
                    hints = "Use: The telephone was invented by..., Penicillin was discovered by..."
                ),
                SpeakingTask(
                    prompt = "Describe a building or landmark in your city.",
                    promptPersian = "یک ساختمان یا بنای معروف در شهرت را توصیف کن.",
                    hints = "Use: It was built..., It is known for..., It has been..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a paragraph about a process you know well (about 150 words). Use at least 6 passive sentences in different tenses.",
                    promptPersian = "درباره فرایندی که خوب می‌شناسی بنویس (حدود ۱۵۰ کلمه). حداقل شش جمله مجهول در زمان‌های مختلف به کار ببر.",
                    wordCount = 150,
                    hints = "Examples:\n- How coffee is made\n- How a book is published\n- How a visa is obtained"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: The book ___ written by Hemingway.",
                    options = listOf("is", "was", "has", "does"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The office ___ cleaned every day.",
                    options = listOf("is", "are", "was", "has"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: The house ___ built in 1990.",
                    options = listOf("is", "was", "were", "been"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The report ___ been finished.",
                    options = listOf("has", "is", "was", "does"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What's the past participle of 'write'?",
                    options = listOf("wrote", "writed", "written", "writes"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: The rule must ___ followed.",
                    options = listOf("be", "is", "been", "being"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "The book is wrote by him.",
                        "The book is written by him.",
                        "The book was write by him.",
                        "The book were written by him."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'be supposed to' mean?",
                    options = listOf("باید", "ممکن است", "می‌تواند", "قرار بود"),
                    correctIndex = 0
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 10 — Reported Speech
    // ============================================================
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Reported Speech",
            titlePersian = "نقل قول غیرمستقیم",
            objectives = listOf(
                "Report statements, questions, and commands.",
                "Apply tense shift in reported speech.",
                "Report questions with statement word order.",
                "Use say vs tell correctly.",
                "Handle pronoun and time/place changes."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "report",
                    persian = "گزارش دادن، نقل کردن",
                    pronunciation = "/rɪˈpɔːrt/",
                    partOfSpeech = "verb",
                    example = "She reported the news to us.",
                    examplePersian = "او خبر را به ما گزارش داد.",
                    wordFamily = "reporter, reported",
                    usageTip = "در نقل قول غیرمستقیم."
                ),
                VocabWord(
                    english = "direct speech",
                    persian = "نقل قول مستقیم",
                    pronunciation = "/dəˈrekt spiːtʃ/",
                    partOfSpeech = "noun",
                    example = "He said, 'I am tired.'",
                    examplePersian = "او گفت: «خسته‌ام».",
                    usageTip = "با علامت نقل قول."
                ),
                VocabWord(
                    english = "indirect speech",
                    persian = "نقل قول غیرمستقیم",
                    pronunciation = "/ˌɪndəˈrekt spiːtʃ/",
                    partOfSpeech = "noun",
                    example = "He said he was tired.",
                    examplePersian = "او گفت خسته است.",
                    synonyms = "reported speech",
                    usageTip = "بدون علامت نقل قول."
                ),
                VocabWord(
                    english = "tense shift",
                    persian = "تغییر زمان",
                    pronunciation = "/tens ʃɪft/",
                    partOfSpeech = "noun",
                    example = "Tense shift happens in reported speech.",
                    examplePersian = "تغییر زمان در نقل قول غیرمستقیم رخ می‌دهد.",
                    usageTip = "قاعده اصلی reported speech."
                ),
                VocabWord(
                    english = "pronoun",
                    persian = "ضمیر",
                    pronunciation = "/ˈproʊnaʊn/",
                    partOfSpeech = "noun",
                    example = "Pronouns change in reported speech.",
                    examplePersian = "ضمایر در نقل قول غیرمستقیم تغییر می‌کنند.",
                    usageTip = "در قوانین نقل قول."
                ),
                VocabWord(
                    english = "say",
                    persian = "گفتن",
                    pronunciation = "/seɪ/",
                    partOfSpeech = "verb",
                    example = "She said she was busy.",
                    examplePersian = "او گفت مشغول است.",
                    usageTip = "بدون مفعول."
                ),
                VocabWord(
                    english = "tell",
                    persian = "گفتن به (کسی)",
                    pronunciation = "/tel/",
                    partOfSpeech = "verb",
                    example = "She told me she was busy.",
                    examplePersian = "او به من گفت مشغول است.",
                    usageTip = "با مفعول."
                ),
                VocabWord(
                    english = "ask",
                    persian = "پرسیدن",
                    pronunciation = "/æsk/",
                    partOfSpeech = "verb",
                    example = "He asked if I was ready.",
                    examplePersian = "او پرسید آیا آماده‌ام.",
                    usageTip = "در نقل قول سؤالات."
                ),
                VocabWord(
                    english = "wonder",
                    persian = "تعجب کردن، کنجکاو بودن",
                    pronunciation = "/ˈwʌndər/",
                    partOfSpeech = "verb",
                    example = "She wondered where he was.",
                    examplePersian = "او تعجب کرد که او کجاست.",
                    usageTip = "در نقل قول غیرمستقیم."
                ),
                VocabWord(
                    english = "warn",
                    persian = "هشدار دادن",
                    pronunciation = "/wɔːrn/",
                    partOfSpeech = "verb",
                    example = "He warned me not to be late.",
                    examplePersian = "او هشدار داد دیر نکنم.",
                    usageTip = "فعل گزارش‌دهی."
                ),
                VocabWord(
                    english = "admit",
                    persian = "اعتراف کردن",
                    pronunciation = "/ədˈmɪt/",
                    partOfSpeech = "verb",
                    example = "She admitted that she was wrong.",
                    examplePersian = "او اعتراف کرد که اشتباه کرده است.",
                    usageTip = "فعل گزارش‌دهی."
                ),
                VocabWord(
                    english = "promise",
                    persian = "قول دادن",
                    pronunciation = "/ˈprɑːmɪs/",
                    partOfSpeech = "verb",
                    example = "He promised he would help.",
                    examplePersian = "او قول داد که کمک می‌کند.",
                    usageTip = "فعل گزارش‌دهی."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "according to",
                    persian = "به گفته",
                    example = "According to him, the plan will work.",
                    examplePersian = "به گفته او، طرح جواب می‌دهد.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "be said to",
                    persian = "گفته می‌شود که",
                    example = "He is said to be very intelligent.",
                    examplePersian = "گفته می‌شود که او خیلی باهوش است.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "word has it",
                    persian = "شنیده می‌شود",
                    example = "Word has it that they're getting married.",
                    examplePersian = "شنیده می‌شود که آنها دارند ازدواج می‌کنند.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "bring up",
                    meaning = "to mention",
                    persian = "مطرح کردن",
                    example = "She brought up the issue at the meeting.",
                    examplePersian = "او موضوع را در جلسه مطرح کرد."
                ),
                PhrasalVerb(
                    verb = "point out",
                    meaning = "to indicate",
                    persian = "اشاره کردن",
                    example = "He pointed out the mistake.",
                    examplePersian = "او به اشتباه اشاره کرد."
                ),
                PhrasalVerb(
                    verb = "sum up",
                    meaning = "to summarize",
                    persian = "خلاصه کردن",
                    example = "To sum up, we need more time.",
                    examplePersian = "خلاصه کنم، به وقت بیشتری نیاز داریم."
                ),
                PhrasalVerb(
                    verb = "back up",
                    meaning = "to support with evidence",
                    persian = "تأیید کردن",
                    example = "She backed up her claim with data.",
                    examplePersian = "او ادعایش را با داده تأیید کرد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Contractions with would",
                    content = "در گفتار:\n• He would → He'd /hiːd/\n• I would → I'd /aɪd/"
                ),
                PronunciationTip(
                    title = "Stress in reported speech",
                    content = "تأکید روی فعل اصلی:\n• She SAID she was tired.\n• He TOLD me he would come."
                ),
                PronunciationTip(
                    title = "Reduced that",
                    content = "that در گفتار طبیعی اغلب حذف می‌شود:\n• She said (that) she was busy."
                ),
                PronunciationTip(
                    title = "Intonation in questions",
                    content = "در reported questions، آهنگ نزولی:\n• She asked where I was from. ↓"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Gossip and reporting",
                    content = "در مکالمات روزمره، انگلیسی‌زبانان زیاد از reported speech برای نقل گفته‌های دیگران استفاده می‌کنند."
                ),
                CulturalNote(
                    title = "News reporting",
                    content = "در اخبار، اغلب از reported speech استفاده می‌شود: 'The president said that...'"
                ),
                CulturalNote(
                    title = "Indirect questions",
                    content = "در موقعیت‌های مؤدبانه، از indirect questions استفاده می‌کنند: 'Could you tell me where the station is?'"
                ),
                CulturalNote(
                    title = "Reporting verbs",
                    content = "انگلیسی‌زبانان از فعل‌های متنوع برای گزارش استفاده می‌کنند: claim, admit, deny, suggest, warn."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Reported Statements: Basic Rules",
                    content = """
ساختار: say/tell + (that) + clause

تغییرات اصلی:
1. زمان یک قدم عقب می‌رود
2. ضمایر تغییر می‌کنند
3. کلمات زمان/مکان تغییر می‌کنند

مثال:
Direct: "I am tired," she said.
Reported: She said (that) she was tired.

Direct: "I will call you," he said.
Reported: He said (that) he would call me.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Tense Shift Table",
                    content = """
| Direct | Reported |
|--------|----------|
| Present simple | Past simple |
| Present continuous | Past continuous |
| Present perfect | Past perfect |
| Past simple | Past perfect |
| Past continuous | Past perfect continuous |
| will | would |
| can | could |
| may | might |
| must | had to |
| shall | should |

مثال‌ها:
"I work here" → He said he worked here.
"I am working" → He said he was working.
"I have finished" → He said he had finished.
"I went home" → He said he had gone home.
"I will help" → He said he would help.
"I can swim" → He said he could swim.
"I may come" → He said he might come.
"I must go" → He said he had to go.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Pronoun Changes",
                    content = """
ضمایر بر اساس معنی تغییر می‌کنند:

"I" → he/she (بسته به گوینده)
"you" → I/we/he/she/they
"we" → they
"my" → his/her
"your" → my/our
"our" → their

مثال:
Direct (Tom said): "I love my job."
Reported: Tom said he loved his job.

Direct (Tom said to me): "You are smart."
Reported: Tom told me I was smart.

Direct (Tom said): "We will come."
Reported: Tom said they would come.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Time and Place Changes",
                    content = """
کلمات زمان و مکان تغییر می‌کنند:

| Direct | Reported |
|--------|----------|
| now | then |
| today | that day |
| yesterday | the day before / the previous day |
| tomorrow | the next day / the following day |
| next week | the following week |
| last week | the week before / the previous week |
| ago | before |
| here | there |
| this | that |
| these | those |

مثال:
Direct: "I'll see you tomorrow," she said.
Reported: She said she would see me the next day.

Direct: "I came here yesterday," he said.
Reported: He said he had gone there the day before.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Reported Questions",
                    content = """
Yes/No questions → if / whether + statement word order

Direct: "Are you tired?" she asked.
Reported: She asked if I was tired.

Direct: "Do you live here?" he asked.
Reported: He asked whether I lived there.

Wh-questions → question word + statement word order

Direct: "Where do you live?" she asked.
Reported: She asked where I lived.

Direct: "What time is it?" he asked.
Reported: He asked what time it was.

نکته: در reported questions، ترتیب جمله خبری است (نه سؤالی):
❌ She asked where did I live.
✅ She asked where I lived.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Reported Commands and Requests",
                    content = """
Commands/Requests → tell/ask + object + to + infinitive

Direct: "Close the door!" he said.
Reported: He told me to close the door.

Direct: "Please help me," she said.
Reported: She asked me to help her.

Direct: "Don't be late," he said.
Reported: He told me not to be late.

افعال رایج:
tell, ask, order, warn, remind, advise, beg
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Other Reporting Verbs",
                    content = """
افعال گزارش‌دهی متنوع:

• offer: He offered to help. (پیشنهاد داد)
• promise: She promised to come. (قول داد)
• refuse: He refused to go. (امتناع کرد)
• agree: She agreed to help. (موافقت کرد)
• admit: He admitted making a mistake. (اعتراف کرد)
• deny: She denied taking the money. (انکار کرد)
• suggest: He suggested going out. (پیشنهاد داد)
• warn: She warned me not to touch it. (هشدار داد)
• remind: He reminded me to call. (یادآوری کرد)

نکته: برخی افعال با gerund می‌آیند:
admit, deny, suggest, recommend
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Say vs Tell",
                    content = """
say + (that) + clause (بدون مفعول):
• She said she was tired.
• He said he would come.

tell + object + (that) + clause:
• She told me she was tired.
• He told us he would come.

نکته‌ها:
❌ She said me she was tired.
✅ She told me she was tired.
✅ She said she was tired.

در زبان غیررسمی، say با to + object هم می‌آید:
• She said to me that she was tired.
(رسمی‌تر: She told me that...)
                    """.trimIndent()
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
                ),
                CommonMistake(
                    wrong = "He said he will come tomorrow.",
                    correct = "He said he would come the next day.",
                    explanation = "will → would و tomorrow → the next day."
                ),
                CommonMistake(
                    wrong = "She asked me to not be late.",
                    correct = "She asked me not to be late.",
                    explanation = "not قبل از to می‌آید."
                ),
                CommonMistake(
                    wrong = "He told that he was busy.",
                    correct = "He said that he was busy. / He told me that he was busy.",
                    explanation = "tell نیاز به مفعول دارد."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Anna",
                    english = "Did you see Ali today? He told me something interesting.",
                    persian = "امروز علی را دیدی؟ یه چیز جالبی بهم گفت."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "No, I didn't. What did he say?",
                    persian = "نه، ندیدم. چی گفت؟"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "He said he was moving to Canada next month.",
                    persian = "گفت که ماه بعد داره به کانادا نقل مکان می‌کنه."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "Really? Why did he say he was moving?",
                    persian = "واقعاً؟ چرا گفت داره نقل مکان می‌کنه؟"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "He told me he had gotten a job offer there.",
                    persian = "به من گفت که اونجا یه پیشنهاد شغلی گرفته."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "Wow! Did he say when he would leave?",
                    persian = "واو! گفت کِی می‌ره؟"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "He said he would leave at the end of the month.",
                    persian = "گفت آخر ماه می‌ره."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "Did he say if he was excited?",
                    persian = "گفت هیجان‌زده است؟"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "He told me he was both excited and nervous.",
                    persian = "به من گفت هم هیجان‌زده است هم مضطرب."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "That's understandable. Did he ask you to visit?",
                    persian = "قابل درکه. ازت خواست که بری دیدنش؟"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "Yes, he asked me to visit him next year.",
                    persian = "بله، ازم خواست سال بعد برم دیدنش."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "Nice. Did he mention where he would live?",
                    persian = "خوبه. اشاره کرد کجا زندگی می‌کنه؟"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "He said he would live in Toronto.",
                    persian = "گفت در تورنتو زندگی می‌کنه."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "That's a great city. Did he say if he'd be back?",
                    persian = "شهر عالیه. گفت برمی‌گرده؟"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "He said he would come back for holidays.",
                    persian = "گفت برای تعطیلات برمی‌گرده."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "Well, I should call him and congratulate him!",
                    persian = "خب، باید بهش زنگ بزنم و تبریک بگم!"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "Yes, definitely! He'd appreciate that.",
                    persian = "بله، حتماً! قطعاً قدردانی می‌کنه."
                ),
                DialogueLine(
                    speaker = "Ben",
                    english = "Thanks for telling me!",
                    persian = "ممنون که گفتی!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What did Ali tell Anna?",
                    answer = "He said he was moving to Canada next month."
                ),
                ComprehensionQuestion(
                    question = "Why is Ali moving?",
                    answer = "He told Anna he had gotten a job offer there."
                ),
                ComprehensionQuestion(
                    question = "When will Ali leave?",
                    answer = "He said he would leave at the end of the month."
                ),
                ComprehensionQuestion(
                    question = "How does Ali feel about the move?",
                    answer = "He told Anna he was both excited and nervous."
                ),
                ComprehensionQuestion(
                    question = "What did Ali ask Anna to do?",
                    answer = "He asked her to visit him next year."
                ),
                ComprehensionQuestion(
                    question = "Will Ali come back?",
                    answer = "He said he would come back for holidays."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Report a recent conversation you had.",
                    promptPersian = "گفت‌وگویی که اخیراً داشتی را نقل کن.",
                    hints = "Use: He said..., She told me..., They asked..."
                ),
                SpeakingTask(
                    prompt = "Report news you heard recently.",
                    promptPersian = "خبری که اخیراً شنیدی را نقل کن.",
                    hints = "Use: According to..., It is said that..., I heard that..."
                ),
                SpeakingTask(
                    prompt = "Report a command your boss or teacher gave you.",
                    promptPersian = "دستوری که رئیس یا معلمت به تو داد را نقل کن.",
                    hints = "Use: He told me to..., She asked me to..., He warned me not to..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a news report (about 150 words) using reported speech. Include statements, questions, and commands.",
                    promptPersian = "یک گزارش خبری بنویس (حدود ۱۵۰ کلمه) با استفاده از نقل قول غیرمستقیم. شامل جملات خبری، سؤالی و دستوری.",
                    wordCount = 150,
                    hints = "Structure:\n1. Introduction with reported statement\n2. Facts with reported speech\n3. Quote with reported speech\n4. Conclusion"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: She said she ___ tired.",
                    options = listOf("is", "was", "were", "be"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: He told me he ___ come tomorrow.",
                    options = listOf("will", "would", "can", "could"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "She said me she was busy.",
                        "She told me she was busy.",
                        "She said to me she is busy.",
                        "She told to me she was busy."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: He asked where I ___.",
                    options = listOf("live", "lived", "do live", "am living"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She asked me ___ her.",
                    options = listOf("help", "helping", "to help", "helped"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "What does 'admit' mean?",
                    options = listOf("انکار کردن", "اعتراف کردن", "پیشنهاد دادن", "هشدار دادن"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: He promised he ___ help.",
                    options = listOf("will", "would", "can", "could"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She asked me if I ___ ready.",
                    options = listOf("am", "was", "were", "be"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: He said he ___ gone home.",
                    options = listOf("has", "had", "have", "having"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 11 — Questions and Negatives
    // ============================================================
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Questions and Negatives",
            titlePersian = "سؤالات و منفی‌ها",
            objectives = listOf(
                "Form yes/no and wh-questions in all tenses.",
                "Form negative sentences correctly.",
                "Use question tags appropriately.",
                "Use auxiliary verbs correctly in questions.",
                "Distinguish between subject and object questions."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "auxiliary verb",
                    persian = "فعل کمکی",
                    pronunciation = "/ɔːɡˈzɪliəri vɜːrb/",
                    partOfSpeech = "noun",
                    example = "Do, be, and have are auxiliary verbs.",
                    examplePersian = "do، be و have افعال کمکی هستند.",
                    usageTip = "در سؤالات و منفی‌ها."
                ),
                VocabWord(
                    english = "question tag",
                    persian = "برچسب سؤالی",
                    pronunciation = "/ˈkwestʃən tæɡ/",
                    partOfSpeech = "noun",
                    example = "You're coming, aren't you?",
                    examplePersian = "داری میای، نه؟",
                    usageTip = "برای تأیید گرفتن."
                ),
                VocabWord(
                    english = "wh-question",
                    persian = "سؤال Wh",
                    pronunciation = "/ˌdʌbəljuː eɪtʃ ˈkwestʃən/",
                    partOfSpeech = "noun",
                    example = "Where do you live?",
                    examplePersian = "کجا زندگی می‌کنی؟",
                    usageTip = "شامل what، where، when و..."
                ),
                VocabWord(
                    english = "yes/no question",
                    persian = "سؤال بله/خیر",
                    pronunciation = "/jes noʊ ˈkwestʃən/",
                    partOfSpeech = "noun",
                    example = "Do you like coffee?",
                    examplePersian = "قهوه دوست داری؟",
                    usageTip = "با yes یا no پاسخ داده می‌شود."
                ),
                VocabWord(
                    english = "negative",
                    persian = "منفی",
                    pronunciation = "/ˈneɡətɪv/",
                    partOfSpeech = "adjective/noun",
                    example = "I don't like coffee.",
                    examplePersian = "قهوه دوست ندارم.",
                    antonyms = "affirmative",
                    usageTip = "با not یا n't."
                ),
                VocabWord(
                    english = "affirmative",
                    persian = "مثبت",
                    pronunciation = "/əˈfɜːrmətɪv/",
                    partOfSpeech = "adjective",
                    example = "She works here.",
                    examplePersian = "او اینجا کار می‌کند.",
                    synonyms = "positive",
                    usageTip = "جمله مثبت."
                ),
                VocabWord(
                    english = "intonation",
                    persian = "آهنگ کلام",
                    pronunciation = "/ˌɪntəˈneɪʃən/",
                    partOfSpeech = "noun",
                    example = "Questions usually have rising intonation.",
                    examplePersian = "سؤالات معمولاً آهنگ صعودی دارند.",
                    usageTip = "در سؤالات."
                ),
                VocabWord(
                    english = "subject question",
                    persian = "سؤال از فاعل",
                    pronunciation = "/ˈsʌbdʒekt ˈkwestʃən/",
                    partOfSpeech = "noun",
                    example = "Who wrote this book?",
                    examplePersian = "این کتاب را چه کسی نوشت؟",
                    usageTip = "بدون فعل کمکی."
                ),
                VocabWord(
                    english = "object question",
                    persian = "سؤال از مفعول",
                    pronunciation = "/ˈɑːbdʒekt ˈkwestʃən/",
                    partOfSpeech = "noun",
                    example = "Who did you see?",
                    examplePersian = "چه کسی را دیدی؟",
                    usageTip = "با فعل کمکی."
                ),
                VocabWord(
                    english = "double negative",
                    persian = "منفی مضاعف",
                    pronunciation = "/ˈdʌbəl ˈneɡətɪv/",
                    partOfSpeech = "noun",
                    example = "'I don't know nothing' is a double negative.",
                    examplePersian = "«هیچی نمی‌دونم» یک منفی مضاعف است.",
                    usageTip = "در انگلیسی استاندارد اشتباه است."
                ),
                VocabWord(
                    english = "echo question",
                    persian = "سؤال تکرار",
                    pronunciation = "/ˈekoʊ ˈkwestʃən/",
                    partOfSpeech = "noun",
                    example = "You did what?",
                    examplePersian = "تو چی کار کردی؟",
                    usageTip = "برای تعجب یا تأیید."
                ),
                VocabWord(
                    english = "indirect question",
                    persian = "سؤال غیرمستقیم",
                    pronunciation = "/ˌɪndəˈrekt ˈkwestʃən/",
                    partOfSpeech = "noun",
                    example = "Could you tell me where the station is?",
                    examplePersian = "می‌تونی بگی ایستگاه کجاست؟",
                    usageTip = "مؤدبانه‌تر."
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
                ),
                IdiomExpression(
                    english = "if you don't mind my asking",
                    persian = "اگر ناراحت نمی‌شوی بپرسم",
                    example = "If you don't mind my asking, how old are you?",
                    examplePersian = "اگر ناراحت نمی‌شوی بپرسم، چند سالته؟",
                    register = "polite"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "ask about",
                    meaning = "to inquire about",
                    persian = "پرسیدن درباره",
                    example = "She asked about your health.",
                    examplePersian = "او درباره سلامتت پرسید."
                ),
                PhrasalVerb(
                    verb = "ask for",
                    meaning = "to request",
                    persian = "درخواست کردن",
                    example = "He asked for help.",
                    examplePersian = "او درخواست کمک کرد."
                ),
                PhrasalVerb(
                    verb = "find out",
                    meaning = "to discover",
                    persian = "فهمیدن",
                    example = "I want to find out what happened.",
                    examplePersian = "می‌خواهم بفهمم چه اتفاقی افتاده."
                ),
                PhrasalVerb(
                    verb = "figure out",
                    meaning = "to understand",
                    persian = "فهمیدن",
                    example = "I can't figure out the answer.",
                    examplePersian = "نمی‌توانم جواب را بفهمم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Rising intonation for yes/no questions",
                    content = "آهنگ صعودی:\n• Are you coming? ↑\n• Do you like it? ↑"
                ),
                PronunciationTip(
                    title = "Falling intonation for wh-questions",
                    content = "آهنگ نزولی:\n• Where do you live? ↓\n• What time is it? ↓"
                ),
                PronunciationTip(
                    title = "Contracted negatives",
                    content = "در گفتار:\n• don't /doʊnt/\n• doesn't /ˈdʌzənt/\n• didn't /ˈdɪdənt/\n• isn't /ˈɪzənt/\n• aren't /ɑːrnt/"
                ),
                PronunciationTip(
                    title = "Weak forms in questions",
                    content = "در گفتار طبیعی، افعال کمکی ضعیف تلفظ می‌شوند:\n• Do you → /də jə/\n• Did he → /dɪd i/"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Question tags in conversation",
                    content = "انگلیسی‌زبانان از question tags برای شروع مکالمه یا تأیید استفاده می‌کنند: 'Nice weather, isn't it?'"
                ),
                CulturalNote(
                    title = "Indirect questions for politeness",
                    content = "برای درخواست مؤدبانه، از indirect questions استفاده می‌شود: 'Could you tell me where...?'"
                ),
                CulturalNote(
                    title = "Echo questions for surprise",
                    content = "برای ابراز تعجب: 'You did WHAT?'"
                ),
                CulturalNote(
                    title = "Avoiding direct questions",
                    content = "در فرهنگ‌های انگلیسی‌زبان، پرسیدن مستقیم درباره سن، حقوق یا مسائل شخصی می‌تواند بی‌ادبانه باشد."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Yes/No Questions",
                    content = """
ساختار: Auxiliary + Subject + Main Verb?

زمان‌های مختلف:

Present Simple:
Do you work here?
Does she work here?

Present Continuous:
Are you working?
Is she working?

Past Simple:
Did you work yesterday?

Past Continuous:
Were you working at 5?

Present Perfect:
Have you finished?

Future:
Will you come?
Are you going to come?

با be:
Are you tired?
Was she at home?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Wh-Questions",
                    content = """
ساختار: Wh-word + Auxiliary + Subject + Main Verb?

Wh-words: what, where, when, why, who, whose, which, how, how much, how many, how often

مثال‌ها:
• Where do you live?
• What does she do?
• When are you coming?
• Why did he leave?
• How often do you exercise?
• How much does it cost?
• How many brothers do you have?

نکته: در Wh-questions آهنگ نزولی است (نه صعودی).
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Subject vs Object Questions",
                    content = """
Subject questions — سؤال از فاعل:
ساختار: Who/What + verb? (بدون do/does/did)

• Who wrote this book?
• What happened?
• Who called you?
• What caused the problem?

Object questions — سؤال از مفعول:
ساختار: Who/What + auxiliary + subject + verb?

• Who did you see?
• What did she buy?
• Who are you waiting for?
• What are you doing?

مقایسه:
Subject: Who called you? (چه کسی زنگ زد؟)
Object: Who did you call? (به چه کسی زنگ زدی؟)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Question Tags",
                    content = """
ساختار:
اگر جمله مثبت است → tag منفی
اگر جمله منفی است → tag مثبت

مثال‌ها:
• You're coming, aren't you?
• She doesn't smoke, does she?
• They went home, didn't they?
• He can swim, can't he?
• It's cold today, isn't it?

نکات:
• با I am → aren't I?
   I'm late, aren't I?
• با Let's → shall we?
   Let's go, shall we?
• با Imperatives → will you?
   Close the door, will you?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Negative Sentences",
                    content = """
ساختار: Subject + auxiliary + not + main verb

زمان‌های مختلف:

Present Simple:
I don't work here.
She doesn't work here.

Present Continuous:
I'm not working.

Past Simple:
I didn't work.

Past Continuous:
I wasn't working.

Present Perfect:
I haven't finished.

Future:
I won't come.
I'm not going to come.

با be:
I'm not tired.
She isn't at home.

نکته: "not" با افعال کمکی کوتاه می‌شود:
• do not → don't
• does not → doesn't
• did not → didn't
• is not → isn't
• are not → aren't
• have not → haven't
• has not → hasn't
• will not → won't
• cannot → can't
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Negative Questions",
                    content = """
سؤالات منفی حالت تعجب، انتظار یا تأیید را منتقل می‌کنند:

• Don't you like coffee? (انتظار: دوست داری)
• Doesn't she work here? (انتظار: کار می‌کند)
• Didn't you see the movie? (انتظار: دیدی)
• Aren't you coming? (انتظار: می‌آیی)

پاسخ‌های مبهم:
• Don't you like coffee?
  — Yes, I do. (دوست دارم)
  — No, I don't. (دوست ندارم)

• Isn't she your sister?
  — Yes, she is. (بله)
  — No, she isn't. (نه)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Indirect Questions",
                    content = """
برای مؤدبانه‌تر شدن:

Direct: Where is the station?
Indirect: Could you tell me where the station is?

Direct: What time is it?
Indirect: Do you know what time it is?

Direct: Are you coming?
Indirect: I was wondering if you are coming.

ساختار:
• Can/Could you tell me...?
• Do you know...?
• I was wondering...?
• I'd like to know...?

نکته: در indirect questions، ترتیب جمله خبری است (نه سؤالی).
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Echo Questions",
                    content = """
سؤالات تکرار برای ابراز تعجب، شک یا تأیید:

• "I'm moving to Mars."
  "You're moving WHERE?"

• "I don't like chocolate."
  "You don't like WHAT?"

• "She's getting married."
  "She's getting MARRIED?"

ساختار: تکرار بخش مهم جمله با آهنگ صعودی.

نکته: در نوشتار، کلمه تأکیدی با CAPS یا با "?" نشان داده می‌شود.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "Where you are going?",
                    correct = "Where are you going?",
                    explanation = "در سؤالات، فعل کمکی قبل از فاعل می‌آید."
                ),
                CommonMistake(
                    wrong = "Who did wrote this book?",
                    correct = "Who wrote this book?",
                    explanation = "در subject questions، فعل کمکی نمی‌آید."
                ),
                CommonMistake(
                    wrong = "You're coming, isn't it?",
                    correct = "You're coming, aren't you?",
                    explanation = "Question tag بر اساس فاعل و فعل جمله است."
                ),
                CommonMistake(
                    wrong = "I don't know nothing.",
                    correct = "I don't know anything. / I know nothing.",
                    explanation = "منفی مضاعف در انگلیسی استاندارد اشتباه است."
                ),
                CommonMistake(
                    wrong = "Does she works here?",
                    correct = "Does she work here?",
                    explanation = "بعد از does، فعل ساده می‌آید."
                ),
                CommonMistake(
                    wrong = "What means this word?",
                    correct = "What does this word mean?",
                    explanation = "ترتیب صحیح: Wh-word + auxiliary + subject + verb."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Lena",
                    english = "Hey, what's up?",
                    persian = "هی، چه خبر؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Not much. You're coming to the party tonight, aren't you?",
                    persian = "چیز خاصی نیست. داری امشب به مهمونی میای، نه؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Yes, I am. What time does it start?",
                    persian = "بله. چه ساعتی شروع می‌شه؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "It starts at 8. Do you know where Ali lives?",
                    persian = "ساعت ۸. می‌دونی علی کجا زندگی می‌کنه؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Yes, I do. Why are you asking?",
                    persian = "بله. چرا می‌پرسی؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Because I need a ride. Do you think you can pick me up?",
                    persian = "چون به ماشین نیاز دارم. فکر می‌کنی می‌تونی منو سوار کنی؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Sure. Where do you live now?",
                    persian = "حتماً. الان کجا زندگی می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "I moved last month. Didn't I tell you?",
                    persian = "ماه پیش نقل مکان کردم. بهت نگفتم؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "No, you didn't! Where did you move to?",
                    persian = "نه، نگفتی! کجا رفتی؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "To Green Street. Do you know it?",
                    persian = "به خیابان گرین. می‌شناسیش؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Yes, I do. What number?",
                    persian = "بله. چه شماره‌ای؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Number 15. Is that too far from you?",
                    persian = "شماره ۱۵. از تو خیلی دوره؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Not at all. I'll pick you up at 7:30.",
                    persian = "اصلاً. ساعت ۷:۳۰ میام دنبالت."
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Perfect. Should I bring anything?",
                    persian = "عالی. چیزی بیارم؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Just yourself. What are you wearing?",
                    persian = "فقط خودت. چی می‌پوشی؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Something casual. Is that OK?",
                    persian = "یه چیز راحت. اشکالی نداره؟"
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Yes, that's fine. See you at 7:30!",
                    persian = "بله، مشکلی نیست. ساعت ۷:۳۰ می‌بینمت!"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Great! See you then.",
                    persian = "عالی! اون موقع می‌بینمت."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "When does the party start?",
                    answer = "It starts at 8."
                ),
                ComprehensionQuestion(
                    question = "Does Lena know where Ali lives?",
                    answer = "Yes, she does."
                ),
                ComprehensionQuestion(
                    question = "Why is Tom asking about Ali's address?",
                    answer = "Because he needs a ride."
                ),
                ComprehensionQuestion(
                    question = "When did Tom move?",
                    answer = "He moved last month."
                ),
                ComprehensionQuestion(
                    question = "What's Tom's new address?",
                    answer = "Number 15, Green Street."
                ),
                ComprehensionQuestion(
                    question = "What time will Lena pick Tom up?",
                    answer = "At 7:30."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Ask a partner 8 questions about their daily life.",
                    promptPersian = "از یک دوست ۸ سؤال درباره زندگی روزمره‌اش بپرس.",
                    hints = "Use: Do you...? / What...? / Where...? / How often...?"
                ),
                SpeakingTask(
                    prompt = "Interview someone about their job.",
                    promptPersian = "با کسی درباره شغلش مصاحبه کن.",
                    hints = "Use: What do you do? / Where do you work? / How long have you...?"
                ),
                SpeakingTask(
                    prompt = "Practice question tags in natural conversation.",
                    promptPersian = "در مکالمه طبیعی question tagها را تمرین کن.",
                    hints = "Use: You're..., aren't you? / You don't..., do you? / It's..., isn't it?"
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an interview with a famous person (about 150 words). Use yes/no questions, wh-questions, and question tags.",
                    promptPersian = "یک مصاحبه با یه فرد مشهور بنویس (حدود ۱۵۰ کلمه). از سؤالات بله/خیر، Wh و question tagها استفاده کن.",
                    wordCount = 150,
                    hints = "Include:\n1. Introduction questions\n2. Personal history\n3. Career questions\n4. Closing"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: ___ you like coffee?",
                    options = listOf("Do", "Does", "Is", "Are"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: You're happy, ___ you?",
                    options = listOf("are", "aren't", "do", "don't"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: Where ___ you live?",
                    options = listOf("do", "does", "are", "is"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "Who did write this book?",
                        "Who wrote this book?",
                        "Who does wrote this book?",
                        "Who was wrote this book?"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: ___ she work here?",
                    options = listOf("Do", "Does", "Is", "Are"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: You don't like coffee, ___ you?",
                    options = listOf("do", "don't", "are", "aren't"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'how come' mean?",
                    options = listOf("چطور آمد", "چطور شد که", "چگونه", "کجا"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: Did you see ___?",
                    options = listOf("him", "he", "his", "himself"),
                    correctIndex = 0
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 12 — Review and Practice
    // ============================================================
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review and Practice",
            titlePersian = "مرور و تمرین",
            objectives = listOf(
                "Review all major tenses.",
                "Practice with mixed exercises.",
                "Identify and correct common mistakes.",
                "Prepare for intermediate level.",
                "Build confidence in using English grammar."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "review",
                    persian = "مرور",
                    pronunciation = "/rɪˈvjuː/",
                    partOfSpeech = "noun/verb",
                    example = "Let's review the main tenses.",
                    examplePersian = "بیا زمان‌های اصلی را مرور کنیم.",
                    wordFamily = "reviewer",
                    usageTip = "برای تجمیع یادگیری."
                ),
                VocabWord(
                    english = "fluency",
                    persian = "روانی",
                    pronunciation = "/ˈfluːənsi/",
                    partOfSpeech = "noun",
                    example = "Regular practice builds fluency.",
                    examplePersian = "تمرین منظم روانی می‌سازد.",
                    wordFamily = "fluent, fluently",
                    usageTip = "هدف نهایی یادگیری زبان."
                ),
                VocabWord(
                    english = "accuracy",
                    persian = "دقت",
                    pronunciation = "/ˈækjərəsi/",
                    partOfSpeech = "noun",
                    example = "Grammar accuracy improves with practice.",
                    examplePersian = "دقت گرامری با تمرین بهتر می‌شود.",
                    wordFamily = "accurate, accurately",
                    usageTip = "کیفیت گرامری."
                ),
                VocabWord(
                    english = "confidence",
                    persian = "اعتماد به نفس",
                    pronunciation = "/ˈkɑːnfɪdəns/",
                    partOfSpeech = "noun",
                    example = "You'll gain confidence over time.",
                    examplePersian = "با گذشت زمان اعتماد به نفس پیدا می‌کنی.",
                    wordFamily = "confident, confidently",
                    usageTip = "برای مکالمه."
                ),
                VocabWord(
                    english = "communicate",
                    persian = "ارتباط برقرار کردن",
                    pronunciation = "/kəˈmjuːnɪkeɪt/",
                    partOfSpeech = "verb",
                    example = "We communicate in English every day.",
                    examplePersian = "هر روز به انگلیسی ارتباط برقرار می‌کنیم.",
                    wordFamily = "communication",
                    usageTip = "هدف اصلی یادگیری."
                ),
                VocabWord(
                    english = "master",
                    persian = "تسلط پیدا کردن",
                    pronunciation = "/ˈmæstər/",
                    partOfSpeech = "verb",
                    example = "It takes time to master English grammar.",
                    examplePersian = "تسلط بر گرامر انگلیسی زمان می‌برد.",
                    wordFamily = "mastery",
                    usageTip = "هدف بلندمدت."
                ),
                VocabWord(
                    english = "foundation",
                    persian = "پایه، بنیاد",
                    pronunciation = "/faʊnˈdeɪʃən/",
                    partOfSpeech = "noun",
                    example = "This book builds a strong foundation.",
                    examplePersian = "این کتاب یک پایه قوی می‌سازد.",
                    usageTip = "برای سطح بالاتر."
                ),
                VocabWord(
                    english = "progress",
                    persian = "پیشرفت",
                    pronunciation = "/ˈprɑːɡres/",
                    partOfSpeech = "noun",
                    example = "You've made great progress!",
                    examplePersian = "پیشرفت خوبی کرده‌ای!",
                    wordFamily = "progress, progressive",
                    usageTip = "ارزیابی یادگیری."
                ),
                VocabWord(
                    english = "structured",
                    persian = "ساختارمند",
                    pronunciation = "/ˈstrʌktʃərd/",
                    partOfSpeech = "adjective",
                    example = "Use structured practice to improve faster.",
                    examplePersian = "از تمرین ساختارمند برای پیشرفت سریع‌تر استفاده کن.",
                    wordFamily = "structure",
                    usageTip = "روش یادگیری."
                ),
                VocabWord(
                    english = "reviewer",
                    persian = "مرورگر",
                    pronunciation = "/rɪˈvjuːər/",
                    partOfSpeech = "noun",
                    example = "She is a careful reviewer of grammar.",
                    examplePersian = "او مرورگر دقیق گرامر است.",
                    usageTip = "برای تمرین."
                ),
                VocabWord(
                    english = "goal",
                    persian = "هدف",
                    pronunciation = "/ɡoʊl/",
                    partOfSpeech = "noun",
                    example = "Set clear goals for your learning.",
                    examplePersian = "اهداف واضح برای یادگیری‌ات تعیین کن.",
                    usageTip = "برنامه‌ریزی."
                ),
                VocabWord(
                    english = "consistent",
                    persian = "پیوسته، مداوم",
                    pronunciation = "/kənˈsɪstənt/",
                    partOfSpeech = "adjective",
                    example = "Be consistent with your studies.",
                    examplePersian = "در مطالعه‌ات پیوسته باش.",
                    wordFamily = "consistency, consistently",
                    usageTip = "کلید موفقیت."
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
                ),
                IdiomExpression(
                    english = "back to basics",
                    persian = "بازگشت به اصول",
                    example = "If you're stuck, go back to basics.",
                    examplePersian = "اگر گیر کردی، به اصول برگرد.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "brush up on",
                    meaning = "to review and improve",
                    persian = "مرور و بهبود دادن",
                    example = "I need to brush up on my grammar.",
                    examplePersian = "باید گرامرم را مرور و بهتر کنم."
                ),
                PhrasalVerb(
                    verb = "keep up",
                    meaning = "to maintain progress",
                    persian = "حفظ کردن پیشرفت",
                    example = "Keep up the good work!",
                    examplePersian = "کار خوبت را ادامه بده!"
                ),
                PhrasalVerb(
                    verb = "get by",
                    meaning = "to manage with difficulty",
                    persian = "با سختی گذراندن",
                    example = "I can get by in English now.",
                    examplePersian = "الان می‌توانم به انگلیسی با سختی کار کنم."
                ),
                PhrasalVerb(
                    verb = "look up",
                    meaning = "to search for information",
                    persian = "جستجو کردن",
                    example = "Look up new words in a dictionary.",
                    examplePersian = "کلمات جدید را در دیکشنری جستجو کن."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Intonation patterns overview",
                    content = "الگوهای آهنگ:\n• Statements: falling ↓\n• Yes/No questions: rising ↑\n• Wh-questions: falling ↓\n• Lists: rising then falling"
                ),
                PronunciationTip(
                    title = "Linking and reduction",
                    content = "در گفتار طبیعی، کلمات به هم می‌چسبند:\n• What do you → /wəɾə jə/\n• Did you → /dɪdʒə/"
                ),
                PronunciationTip(
                    title = "Stress in sentences",
                    content = "در جمله، کلمات محتوا (اسم، فعل اصلی، صفت) تأکید می‌گیرند:\n• She WORKS at a HOSPITAL."
                ),
                PronunciationTip(
                    title = "Contractions summary",
                    content = "کوتاه‌سازی‌ها:\n• I'm, you're, he's, she's, we're, they're\n• don't, doesn't, didn't, isn't, aren't\n• I've, you've, he's, she's\n• I'll, you'll, he'll, she'll, we'll, they'll\n• I'd, you'd, he'd, she'd"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Lifelong learning",
                    content = "در فرهنگ‌های انگلیسی‌زبان، یادگیری زبان یک فرایند مادام‌العمر است، نه یک هدف نهایی."
                ),
                CulturalNote(
                    title = "Mistakes are learning",
                    content = "در کلاس‌های غربی، اشتباه کردن بخش طبیعی یادگیری است و تشویق می‌شود."
                ),
                CulturalNote(
                    title = "Real-world practice",
                    content = "بهترین راه پیشرفت، استفاده واقعی از زبان در موقعیت‌های واقعی است: مکالمه، سفر، کار."
                ),
                CulturalNote(
                    title = "Different learning styles",
                    content = "هر فرد روش یادگیری متفاوتی دارد: خواندن، شنیدن، نوشتن، صحبت کردن."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Summary of All Tenses",
                    content = """
جدول خلاصه زمان‌ها:

| Tense | Example | Use |
|-------|---------|-----|
| Present Simple | I work every day. | عادت‌ها |
| Present Continuous | I am working now. | در حال انجام |
| Past Simple | I worked yesterday. | کارهای تمام‌شده |
| Past Continuous | I was working. | در حال انجام گذشته |
| Present Perfect | I have worked here. | تجربه یا ادامه‌دار |
| Past Perfect | I had worked before. | قبل از گذشته |
| Future Simple | I will work. | آینده |
| Future Going To | I am going to work. | قصد و برنامه |
| Future Continuous | I will be working. | در حال انجام در آینده |
| Future Perfect | I will have worked. | قبل از یک زمان آینده |
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Modal Verbs Review",
                    content = """
| Modal | Use | Example |
|-------|-----|---------|
| can | ability, permission | I can swim. |
| could | past ability, polite request | Could you help? |
| may | possibility, formal permission | It may rain. |
| might | weak possibility | She might come. |
| must | strong obligation | You must wear a seatbelt. |
| have to | external obligation | I have to work. |
| should | advice | You should rest. |
| ought to | formal advice | You ought to see a doctor. |
| will | future | I'll call you. |
| would | polite request, conditional | Would you help? |

نکته: Modals + base verb (بدون to).
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Passive Voice Summary",
                    content = """
Passive = be + past participle

| Tense | Active | Passive |
|-------|--------|---------|
| Present Simple | They clean the office. | The office is cleaned. |
| Past Simple | They cleaned the office. | The office was cleaned. |
| Present Perfect | They have cleaned. | The office has been cleaned. |
| Future | They will clean. | The office will be cleaned. |
| Modals | They must clean. | The office must be cleaned. |

کاربرد passive:
• فاعل ناشناخته است
• فاعل بی‌اهمیت است
• تمرکز روی مفعول است
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Conditionals Summary",
                    content = """
| Type | Structure | Example |
|------|-----------|---------|
| Zero | If + present, present | If you heat water, it boils. |
| First | If + present, will + verb | If it rains, I'll stay home. |
| Second | If + past, would + verb | If I were rich, I would travel. |
| Third | If + past perfect, would have + pp | If I had studied, I would have passed. |
| Mixed | combination | If I had studied, I would be a doctor now. |

کاربرد:
• Zero: حقایق
• First: موقعیت‌های واقعی
• Second: فرضیات
• Third: پشیمانی
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Reported Speech Summary",
                    content = """
تغییرات اصلی:
1. Tense shift:
   • Present simple → past simple
   • Present continuous → past continuous
   • Past simple → past perfect
   • will → would
   • can → could

2. Pronoun changes

3. Time/place changes:
   • now → then
   • today → that day
   • yesterday → the day before
   • tomorrow → the next day

say vs tell:
• She said she was tired.
• She told me she was tired.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Common Mistakes Checklist",
                    content = """
چک‌لیست اشتباهات رایج:

1. سوم شخص مفرد:
❌ She work every day.
✅ She works every day.

2. بعد از did/will/can:
❌ I didn't went.
✅ I didn't go.

3. بعد از look forward to:
❌ I look forward to see you.
✅ I look forward to seeing you.

4. Articles:
❌ I like the coffee.
✅ I like coffee.

5. Prepositions:
❌ I'm married with Sara.
✅ I'm married to Sara.

6. Subject-verb agreement:
❌ The news are important.
✅ The news is important.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Question Formation Summary",
                    content = """
ساختار سؤالات:

Yes/No: Auxiliary + Subject + Verb?
• Do you work here?
• Are you tired?
• Have you finished?

Wh-questions: Wh-word + Auxiliary + Subject + Verb?
• Where do you live?
• What did she do?
• How often do you exercise?

Question tags:
• You're coming, aren't you?
• She doesn't smoke, does she?

نکات مهم:
• در سؤالات، فعل کمکی قبل از فاعل.
• در reported questions، ترتیب جمله خبری.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Next Steps in Learning",
                    content = """
پس از این کتاب:

1. سطح متوسط:
   • Perfect tenses (past perfect, future perfect)
   • Advanced conditionals (mixed)
   • Reported speech (advanced)
   • Phrasal verbs (extended)

2. سطح پیشرفته:
   • Subjunctive mood
   • Inversion for emphasis
   • Cleft sentences
   • Advanced modal perfects

3. تمرین:
   • روزانه ۱۵-۳۰ دقیقه
   • خواندن، نوشتن، شنیدن، صحبت کردن
   • اشتباهات را مرور کنید
   • با natives تعامل داشته باشید

"Practice makes perfect!"
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I am agree.",
                    correct = "I agree.",
                    explanation = "agree فعل است، بدون am."
                ),
                CommonMistake(
                    wrong = "I didn't went.",
                    correct = "I didn't go.",
                    explanation = "بعد از didn't، فعل ساده."
                ),
                CommonMistake(
                    wrong = "He don't like it.",
                    correct = "He doesn't like it.",
                    explanation = "برای he/she/it از doesn't."
                ),
                CommonMistake(
                    wrong = "The informations are useful.",
                    correct = "The information is useful.",
                    explanation = "information غیرقابل شمارش."
                ),
                CommonMistake(
                    wrong = "I look forward to see you.",
                    correct = "I look forward to seeing you.",
                    explanation = "بعد از look forward to از verb-ing."
                ),
                CommonMistake(
                    wrong = "She said me that she was tired.",
                    correct = "She told me that she was tired.",
                    explanation = "say بدون مفعول، tell با مفعول."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Maria",
                    english = "I can't believe we've finished the whole book!",
                    persian = "باورم نمی‌شه کل کتاب را تمام کردیم!"
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "I know! When we started, I could barely speak English.",
                    persian = "می‌دونم! وقتی شروع کردیم، به‌سختی می‌تونستم انگلیسی صحبت کنم."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Look at us now. We can have full conversations!",
                    persian = "الان به ما نگاه کن. می‌تونیم مکالمات کامل داشته باشیم!"
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "I've learned so much — tenses, conditionals, reported speech...",
                    persian = "خیلی چیز یاد گرفته‌ام — زمان‌ها، شرطی‌ها، نقل قول غیرمستقیم..."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "What was the hardest part for you?",
                    persian = "سخت‌ترین قسمت برای تو چی بود؟"
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "The past perfect. I always confused it with past simple.",
                    persian = "گذشته کامل. همیشه با گذشته ساده قاطی می‌کردم."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Me too! But now I understand the difference.",
                    persian = "منم همینطور! ولی الان تفاوتش را می‌فهمم."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "What's your plan now?",
                    persian = "برنامه‌ات الان چیه؟"
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "I'm going to start the intermediate level next month.",
                    persian = "می‌خواهم ماه بعد سطح متوسط را شروع کنم."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "Me too! I've already signed up for a course.",
                    persian = "منم همینطور! قبلاً در یک دوره ثبت‌نام کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Nice! Which one?",
                    persian = "خوبه! کدوم؟"
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "The one at the community center. It's free!",
                    persian = "اون یکی که در مرکز اجتماعیه. رایگانه!"
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "That's great. Maybe I'll join you.",
                    persian = "عالیه. شاید بهت بپیوندم."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "You should! The more practice, the better.",
                    persian = "باید بیای! هر چی تمرین بیشتر، بهتر."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "True. Practice makes perfect, right?",
                    persian = "درسته. کار نیکو کردن از پر کردن است، نه؟"
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "Exactly! And Rome wasn't built in a day.",
                    persian = "دقیقاً! و رم در یک روز ساخته نشد."
                ),
                DialogueLine(
                    speaker = "Maria",
                    english = "Let's keep learning and help each other!",
                    persian = "بیا یادگیری را ادامه بدیم و به هم کمک کنیم!"
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "Deal! I'm glad we studied together.",
                    persian = "قبوله! خوشحالم که با هم درس خواندیم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What did Ahmed say was the hardest part?",
                    answer = "The past perfect. He always confused it with past simple."
                ),
                ComprehensionQuestion(
                    question = "What is Maria going to do next month?",
                    answer = "She is going to start the intermediate level."
                ),
                ComprehensionQuestion(
                    question = "Where is Ahmed taking a course?",
                    answer = "At the community center."
                ),
                ComprehensionQuestion(
                    question = "What does the phrase 'practice makes perfect' mean?",
                    answer = "Regular practice leads to improvement."
                ),
                ComprehensionQuestion(
                    question = "What does 'Rome wasn't built in a day' mean?",
                    answer = "Great things take time to accomplish."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your English learning journey.",
                    promptPersian = "درباره مسیر یادگیری انگلیسی‌ات صحبت کن.",
                    hints = "Use: I started..., I've learned..., I can now..."
                ),
                SpeakingTask(
                    prompt = "Give advice to someone starting to learn English.",
                    promptPersian = "به کسی که شروع به یادگیری انگلیسی می‌کند توصیه کن.",
                    hints = "Use: You should..., Don't give up..., Practice..."
                ),
                SpeakingTask(
                    prompt = "Talk about your future learning goals.",
                    promptPersian = "درباره اهداف یادگیری آینده‌ات صحبت کن.",
                    hints = "Use: I'm going to..., I hope to..., I want to..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a reflection (about 200 words) on your English learning journey. Use at least 10 different grammar structures from this book.",
                    promptPersian = "یک بازتاب (حدود ۲۰۰ کلمه) درباره مسیر یادگیری انگلیسی‌ات بنویس. حداقل ۱۰ ساختار گرامری مختلف از این کتاب به کار ببر.",
                    wordCount = 200,
                    hints = "Include:\n1. When you started\n2. What you've learned\n3. Challenges\n4. Future goals"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I ___ in London for five years.",
                    options = listOf("live", "lived", "have lived", "am living"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: If I ___ you, I'd study harder.",
                    options = listOf("am", "was", "were", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: The book ___ written by Hemingway.",
                    options = listOf("is", "was", "has", "does"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She said she ___ tired.",
                    options = listOf("is", "was", "were", "be"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I've lived here ___ 2015.",
                    options = listOf("since", "for", "in", "at"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: If it rains, I ___ stay home.",
                    options = listOf("will", "would", "am", "do"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: ___ you ever been to Japan?",
                    options = listOf("Do", "Did", "Have", "Are"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: If I had known, I ___ helped.",
                    options = listOf("will have", "would have", "have", "had"),
                    correctIndex = 1
                )
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
