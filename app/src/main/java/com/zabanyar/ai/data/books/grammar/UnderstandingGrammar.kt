package com.zabanyar.ai.data.books.grammar

import com.zabanyar.ai.data.*

object UnderstandingGrammar {

    const val BOOK_ID = "understanding_grammar"

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
    // CHAPTER 1 — Perfect Tenses Overview
    // ============================================================
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Perfect Tenses Overview",
            titlePersian = "مرور زمان‌های کامل",
            objectives = listOf(
                "Understand the concept of perfect tenses.",
                "Use present perfect, past perfect, and future perfect accurately.",
                "Distinguish perfect tenses from simple tenses.",
                "Use time expressions correctly with perfect tenses.",
                "Master the formation of past participles."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "aspect",
                    persian = "وجه (گرامری)",
                    pronunciation = "/ˈæspekt/",
                    partOfSpeech = "noun",
                    example = "Perfect is an aspect, not a tense.",
                    examplePersian = "کامل یک وجه است، نه زمان.",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "completion",
                    persian = "اتمام، کامل شدن",
                    pronunciation = "/kəmˈpliːʃən/",
                    partOfSpeech = "noun",
                    example = "Perfect tenses emphasize completion.",
                    examplePersian = "زمان‌های کامل بر اتمام تأکید می‌کنند.",
                    wordFamily = "complete, complete",
                    usageTip = "در مفهوم perfect."
                ),
                VocabWord(
                    english = "relevance",
                    persian = "ارتباط، مربوط بودن",
                    pronunciation = "/ˈreləvəns/",
                    partOfSpeech = "noun",
                    example = "Present perfect shows relevance to now.",
                    examplePersian = "حال کامل ارتباط با حال را نشان می‌دهد.",
                    wordFamily = "relevant, relevantly",
                    usageTip = "کاربرد اصلی present perfect."
                ),
                VocabWord(
                    english = "duration",
                    persian = "مدت، طول",
                    pronunciation = "/duˈreɪʃən/",
                    partOfSpeech = "noun",
                    example = "How long is the duration of the course?",
                    examplePersian = "مدت دوره چقدر است؟",
                    usageTip = "با for در perfect."
                ),
                VocabWord(
                    english = "reference point",
                    persian = "نقطه مرجع",
                    pronunciation = "/ˈrefrəns pɔɪnt/",
                    partOfSpeech = "noun",
                    example = "Past perfect needs a reference point.",
                    examplePersian = "گذشته کامل به یه نقطه مرجع نیاز داره.",
                    usageTip = "در تحلیل گذشته کامل."
                ),
                VocabWord(
                    english = "accomplishment",
                    persian = "دستاورد",
                    pronunciation = "/əˈkɑːmplɪʃmənt/",
                    partOfSpeech = "noun",
                    example = "That's a great accomplishment!",
                    examplePersian = "این یک دستاورد بزرگ است!",
                    wordFamily = "accomplish, accomplished",
                    usageTip = "با present perfect."
                ),
                VocabWord(
                    english = "ongoing",
                    persian = "در جریان، ادامه‌دار",
                    pronunciation = "/ˈɑːnɡoʊɪŋ/",
                    partOfSpeech = "adjective",
                    example = "It's an ongoing process.",
                    examplePersian = "این یه فرایند در جریانه.",
                    usageTip = "با perfect continuous."
                ),
                VocabWord(
                    english = "prior",
                    persian = "قبلی، پیش از",
                    pronunciation = "/ˈpraɪər/",
                    partOfSpeech = "adjective",
                    example = "He had no prior experience.",
                    examplePersian = "او تجربه قبلی نداشت.",
                    usageTip = "در past perfect."
                ),
                VocabWord(
                    english = "subsequent",
                    persian = "بعدی، پس از",
                    pronunciation = "/ˈsʌbsɪkwənt/",
                    partOfSpeech = "adjective",
                    example = "Subsequent events proved him right.",
                    examplePersian = "رویدادهای بعدی درستی‌اش را اثبات کرد.",
                    usageTip = "در مقابل prior."
                ),
                VocabWord(
                    english = "yet",
                    persian = "هنوز (در سؤالات و منفی)",
                    pronunciation = "/jet/",
                    partOfSpeech = "adverb",
                    example = "I haven't finished yet.",
                    examplePersian = "هنوز تموم نکرده‌ام.",
                    usageTip = "با present perfect."
                ),
                VocabWord(
                    english = "already",
                    persian = "قبلاً، از پیش",
                    pronunciation = "/ɔːlˈredi/",
                    partOfSpeech = "adverb",
                    example = "She's already finished.",
                    examplePersian = "او قبلاً تموم کرده.",
                    usageTip = "با present perfect."
                ),
                VocabWord(
                    english = "by the time",
                    persian = "تا زمانی که",
                    pronunciation = "/baɪ ðə taɪm/",
                    partOfSpeech = "expression",
                    example = "By the time you arrive, I'll have finished.",
                    examplePersian = "تا وقتی برسی، تموم کرده‌ام.",
                    usageTip = "با future perfect."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "been there, done that",
                    persian = "قبلاً تجربه‌اش را داشته‌ام",
                    example = "Been there, done that — I know what it's like.",
                    examplePersian = "قبلاً تجربه‌اش را داشته‌ام — می‌دانم چطور است.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "at long last",
                    persian = "بالاخره، سرانجام",
                    example = "At long last, I've finished the project!",
                    examplePersian = "بالاخره، پروژه را تمام کردم!",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "long since",
                    persian = "خیلی وقت پیش",
                    example = "I've long since forgotten about it.",
                    examplePersian = "خیلی وقت پیش فراموشش کرده‌ام.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "end up",
                    meaning = "to finally be in a situation",
                    persian = "در نهایت به جایی رسیدن",
                    example = "I've ended up working for a startup.",
                    examplePersian = "در نهایت در یه استارتاپ مشغول به کار شدم."
                ),
                PhrasalVerb(
                    verb = "come around",
                    meaning = "to happen eventually",
                    persian = "اتفاق افتادن در نهایت",
                    example = "The opportunity came around at last.",
                    examplePersian = "فرصت بالاخره پیش آمد."
                ),
                PhrasalVerb(
                    verb = "look back on",
                    meaning = "to think about the past",
                    persian = "به گذشته نگاه کردن",
                    example = "I've looked back on my life many times.",
                    examplePersian = "بارها به زندگی‌ام نگاه کرده‌ام."
                ),
                PhrasalVerb(
                    verb = "get through",
                    meaning = "to finish something",
                    persian = "به پایان رساندن",
                    example = "She's gotten through all her exams.",
                    examplePersian = "او همه امتحان‌هایش را به پایان رسانده است."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Past participle stress",
                    content = "در افعال بی‌قاعده، past participle گاهی تلفظش با past different می‌شود:\n• write/wrote/WRITTEN\n• speak/spoke/SPOKEN\n• take/took/TAKEN"
                ),
                PronunciationTip(
                    title = "Contracted have",
                    content = "در گفتار طبیعی:\n• I have → I've /aɪv/\n• You have → You've /juːv/\n• They have → They've /ðeɪv/\n• He has → He's /hiːz/\n• She has → She's /ʃiːz/"
                ),
                PronunciationTip(
                    title = "Reduced 'been to'",
                    content = "در گفتار سریع:\n• I've been to → /aɪv bɪn tə/\n• Have you been to → /həv jə bɪn tə/"
                ),
                PronunciationTip(
                    title = "Stress on time expressions",
                    content = "در جمله، زمان‌ها تأکید می‌گیرند:\n• I've ALREADY finished.\n• She hasn't come YET."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Present perfect in native speech",
                    content = "در مکالمات روزمره، انگلیسی‌زبانان از present perfect برای خبر دادن استفاده می‌کنند: 'I've just seen Anna!'"
                ),
                CulturalNote(
                    title = "Past perfect in narratives",
                    content = "در داستان‌گویی، past perfect برای پیش‌زمینه استفاده می‌شود: 'When I arrived, she had already left.'"
                ),
                CulturalNote(
                    title = "Future perfect in planning",
                    content = "در برنامه‌ریزی کاری، future perfect رایج است: 'By next year, we will have completed the project.'"
                ),
                CulturalNote(
                    title = "Perfect continuous",
                    content = "Perfect continuous برای تأکید بر مدت زمان: 'I've been working here for 5 years.'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. What is a Perfect Tense?",
                    content = """
زمان‌های کامل (Perfect Tenses) روابط زمانی بین دو نقطه را نشان می‌دهند:

ساختار کلی:
have/has/had/will have + past participle

انواع:
• Present Perfect: have/has + pp
• Past Perfect: had + pp
• Future Perfect: will have + pp
• Present Perfect Continuous: have/has been + verb-ing
• Past Perfect Continuous: had been + verb-ing
• Future Perfect Continuous: will have been + verb-ing

نکته کلیدی: perfect = ارتباط بین دو زمان مختلف
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Present Perfect: Review",
                    content = """
ساختار: have/has + past participle

کاربردها:
1. تجربه (زمان نامشخص):
   I've visited Paris.

2. رویداد اخیر:
   She's just arrived.

3. رویداد گذشته با ارتباط به حال:
   I've lost my keys. (هنوز گم هستند)

4. مدت زمان تا حال:
   I've lived here for 5 years.

5. تکرار تا حال:
   I've seen that movie three times.

نکته: با زمان‌های مشخص گذشته (yesterday, last week) present perfect نمی‌آید.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Past Perfect: Structure and Use",
                    content = """
ساختار: had + past participle

کاربردها:

1. عمل قبل از عمل دیگر در گذشته:
   When I arrived, she had already left.
   (اول او رفت، بعد من رسیدم)

2. رویداد قبل از زمان مشخص در گذشته:
   By 2010, I had lived in three countries.

3. در reported speech:
   "I've seen it." → He said he had seen it.

4. در third conditional:
   If I had studied, I would have passed.

کلمات کلیدی:
already, just, never, before, by the time, when, after, until

نکته: past perfect برای "گذشته در گذشته" استفاده می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Future Perfect: Structure and Use",
                    content = """
ساختار: will have + past participle

کاربردها:

1. عمل تمام‌شده قبل از یک زمان آینده:
   By next year, I'll have finished my degree.

2. پیش‌بینی:
   By 2050, scientists will have discovered new treatments.

3. در جملات با "by the time":
   By the time you arrive, I'll have cooked dinner.

کلمات کلیدی:
by, by then, by the time, before, by next week/month/year

نکته: future perfect روی "اتمام قبل از زمان مشخص در آینده" تأکید دارد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Perfect Continuous Tenses",
                    content = """
Present Perfect Continuous: have/has been + verb-ing
• I've been working here for 5 years.
• She's been studying all morning.

Past Perfect Continuous: had been + verb-ing
• I had been waiting for an hour when she arrived.
• They had been living there for 10 years before they moved.

Future Perfect Continuous: will have been + verb-ing
• By next month, I'll have been working here for a year.

تفاوت perfect و perfect continuous:
• Perfect: تأکید بر نتیجه
   I've painted the room. (اتمام یافته)
• Perfect Continuous: تأکید بر مدت
   I've been painting the room. (شاید هنوز تمام نشده)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Time Expressions with Perfect",
                    content = """
عبارت‌های زمانی با perfect:

Present Perfect:
• for, since: I've lived here for 5 years / since 2018
• ever, never: Have you ever been to Japan?
• already, yet, just: I've already finished / not yet
• recently, lately: I've been busy lately
• so far, up to now: So far, I've visited 10 countries
• this week/month/year: I've had 3 meetings this week

Past Perfect:
• already, by the time: She had already left.
• before, after, when: Before I arrived, she had left.
• never before: I had never seen such beauty.

Future Perfect:
• by, by the time, by then: By 2030, I'll have finished.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Perfect Tenses vs Simple Tenses",
                    content = """
مقایسه دقیق:

Present Perfect vs Past Simple:
• Present Perfect: ارتباط با حال
   I've lost my keys. (هنوز گم)
• Past Simple: رویداد تمام‌شده
   I lost my keys yesterday. (دیروز)

Past Perfect vs Past Simple:
• Past Perfect: قبل از گذشته
   When I arrived, she had left.
• Past Simple: رویدادهای پشت سر هم
   When I arrived, she left.

Future Perfect vs Future Simple:
• Future Perfect: قبل از زمان مشخص
   By 2030, I'll have finished.
• Future Simple: در زمان مشخص
   I'll finish in 2030.

نکته: زمان مشخص = simple؛ ارتباط با زمان دیگر = perfect.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Uses in Context",
                    content = """
کاربردهای رایج perfect tenses:

1. اخبار:
   The president has announced new policies.
   (ارتباط با حال)

2. داستان‌گویی:
   She had never seen such a beautiful sunset before that evening.

3. برنامه‌ریزی:
   By the end of this year, we will have completed the project.

4. تجربه‌های شخصی:
   I've been to over 20 countries.

5. مدت زمان:
   They've been married for 10 years.

6. تکرار:
   I've seen this movie at least five times.

نکته: انتخاب بین perfect و simple بستگی به ارتباط زمانی دارد.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I have seen him yesterday.",
                    correct = "I saw him yesterday.",
                    explanation = "با زمان مشخص گذشته، از past simple استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "When I arrived, she already left.",
                    correct = "When I arrived, she had already left.",
                    explanation = "برای عمل قبل از گذشته دیگر، past perfect."
                ),
                CommonMistake(
                    wrong = "I've been knowing him for years.",
                    correct = "I've known him for years.",
                    explanation = "know فعل حالتی است و در continuous نمی‌آید."
                ),
                CommonMistake(
                    wrong = "By 2030, I will finish my degree.",
                    correct = "By 2030, I will have finished my degree.",
                    explanation = "با by + زمان آینده، future perfect."
                ),
                CommonMistake(
                    wrong = "She has ate lunch.",
                    correct = "She has eaten lunch.",
                    explanation = "past participle صحیح eat، eaten است."
                ),
                CommonMistake(
                    wrong = "I've lived here since five years.",
                    correct = "I've lived here for five years.",
                    explanation = "for مدت، since نقطه شروع."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Nina",
                    english = "Have you finished reading the report I sent you?",
                    persian = "گزارشی که برایت فرستادم را تمام کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Yes, I have. I read it last night.",
                    persian = "بله. دیشب خواندمش."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Great. What did you think?",
                    persian = "عالی. نظرت چی بود؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "I thought it was excellent. But I had already read most of it before.",
                    persian = "فکر می‌کنم عالی بود. ولی بیشترش را قبلاً خوانده بودم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Really? When had you read it?",
                    persian = "واقعاً؟ کِی خوانده بودی؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "I'd read the first draft about a month ago.",
                    persian = "نسخه اول را حدوداً یک ماه پیش خوانده بودم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "I didn't know that. Have you seen any other versions?",
                    persian = "نمی‌دانستم. نسخه‌های دیگه‌ای هم دیده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Yes, I've seen several versions over the years.",
                    persian = "بله، در طول سال‌ها چندین نسخه دیده‌ام."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "How many times have you read this topic?",
                    persian = "چند بار این موضوع را خوانده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "At least ten times. I've studied it extensively.",
                    persian = "حداقل ده بار. به‌طور گسترده مطالعه‌اش کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "That's impressive. By the time we finish, you'll have read it 20 times!",
                    persian = "تحسین‌برانگیزه. تا وقتی تموم کنیم، ۲۰ بار خوانده‌ای!"
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Ha! You're right. By next month, I'll have read everything on this topic.",
                    persian = "ها! حق داری. تا ماه بعد، همه چیز این موضوع را خوانده‌ام."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "I should catch up. I've only read it twice.",
                    persian = "باید خودم را برسونم. من فقط دو بار خوانده‌ام."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Don't worry. I've been studying this for years.",
                    persian = "نگران نباش. سال‌هاست این را مطالعه می‌کنم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "True. You've always been diligent.",
                    persian = "درسته. همیشه سخت‌کوش بوده‌ای."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Thanks. Let's discuss it more tomorrow.",
                    persian = "ممنون. فردا بیشتر بحثش کنیم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Perfect. By tomorrow, I'll have finished the third version.",
                    persian = "عالی. تا فردا، نسخه سوم را تموم کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Omar",
                    english = "Great! See you then.",
                    persian = "عالی! اون موقع می‌بینمت."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Has Omar finished reading the report?",
                    answer = "Yes, he has. He read it last night."
                ),
                ComprehensionQuestion(
                    question = "When had Omar read the first draft?",
                    answer = "He had read it about a month ago."
                ),
                ComprehensionQuestion(
                    question = "How many times has Omar read this topic?",
                    answer = "At least ten times."
                ),
                ComprehensionQuestion(
                    question = "What will Omar have done by next month?",
                    answer = "He will have read everything on this topic."
                ),
                ComprehensionQuestion(
                    question = "How many times has Nina read the report?",
                    answer = "Only twice."
                ),
                ComprehensionQuestion(
                    question = "What will Nina have finished by tomorrow?",
                    answer = "She will have finished the third version."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your accomplishments using present perfect.",
                    promptPersian = "درباره دستاوردهایت با حال کامل صحبت کن.",
                    hints = "Use: I've finished..., I've learned..., I've achieved..."
                ),
                SpeakingTask(
                    prompt = "Describe what had happened before an important event.",
                    promptPersian = "توصیف کن که قبل از یک رویداد مهم چه اتفاقی افتاده بود.",
                    hints = "Use: Before I..., I had..., When I arrived, they had..."
                ),
                SpeakingTask(
                    prompt = "Talk about what you will have done by the end of the year.",
                    promptPersian = "درباره کارهایی که تا پایان سال انجام داده‌ای صحبت کن.",
                    hints = "Use: By the end of the year, I will have..., I'll have been..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your life journey (about 200 words). Use at least 8 perfect tense structures.",
                    promptPersian = "درباره مسیر زندگی‌ات بنویس (حدود ۲۰۰ کلمه). حداقل هشت ساختار perfect tense به کار ببر.",
                    wordCount = 200,
                    hints = "Include:\n- Present perfect: experiences\n- Past perfect: events before events\n- Future perfect: future plans\n- Perfect continuous: durations"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: By next year, I ___ finished my degree.",
                    options = listOf("will", "will have", "have", "had"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: When I arrived, she ___ left.",
                    options = listOf("has", "had", "was", "did"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "I have seen him yesterday.",
                        "I saw him yesterday.",
                        "I had seen him yesterday.",
                        "I see him yesterday."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ known her for 10 years.",
                    options = listOf("have", "has", "am", "was"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: She ___ been working here since 2018.",
                    options = listOf("have", "has", "is", "was"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What's the difference between present perfect and past simple?",
                    options = listOf(
                        "No difference",
                        "Present perfect has present relevance; past simple has specific past time",
                        "Present perfect is longer",
                        "Past simple is always past perfect"
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
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 2 — Advanced Conditional Structures
    // ============================================================
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Advanced Conditional Structures",
            titlePersian = "ساختارهای شرطی پیشرفته",
            objectives = listOf(
                "Master mixed conditionals.",
                "Use inverted conditionals for formal writing.",
                "Understand and use alternative conditional structures.",
                "Apply conditionals in different contexts.",
                "Distinguish subtle meanings between conditional types."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "conditional",
                    persian = "شرطی",
                    pronunciation = "/kənˈdɪʃənəl/",
                    partOfSpeech = "adjective",
                    example = "This is a conditional sentence.",
                    examplePersian = "این یه جمله شرطیه.",
                    wordFamily = "condition, conditionally",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "hypothetical",
                    persian = "فرضی",
                    pronunciation = "/ˌhaɪpəˈθetɪkəl/",
                    partOfSpeech = "adjective",
                    example = "It's a hypothetical situation.",
                    examplePersian = "این یه وضعیت فرضیه.",
                    wordFamily = "hypothesis, hypothesize",
                    usageTip = "در second conditional."
                ),
                VocabWord(
                    english = "counterfactual",
                    persian = "خلاف واقع",
                    pronunciation = "/ˌkaʊntərˈfæktʃuəl/",
                    partOfSpeech = "adjective",
                    example = "Third conditional is counterfactual.",
                    examplePersian = "سوم شرطی خلاف واقع است.",
                    usageTip = "در third conditional."
                ),
                VocabWord(
                    english = "inversion",
                    persian = "وارونگی",
                    pronunciation = "/ɪnˈvɜːrʒən/",
                    partOfSpeech = "noun",
                    example = "Inversion is used in formal conditionals.",
                    examplePersian = "وارونگی در شرطی‌های رسمی استفاده می‌شود.",
                    wordFamily = "invert, inverted",
                    usageTip = "در شرطی‌های رسمی."
                ),
                VocabWord(
                    english = "consequence",
                    persian = "پیامد",
                    pronunciation = "/ˈkɑːnsəkwens/",
                    partOfSpeech = "noun",
                    example = "Every action has consequences.",
                    examplePersian = "هر عملی پیامد داره.",
                    wordFamily = "consequent, consequently",
                    usageTip = "در نتیجه شرطی."
                ),
                VocabWord(
                    english = "prerequisite",
                    persian = "پیش‌نیاز",
                    pronunciation = "/ˌpriːˈrekwəzɪt/",
                    partOfSpeech = "noun",
                    example = "Basic math is a prerequisite for this course.",
                    examplePersian = "ریاضی پایه پیش‌نیاز این دوره است.",
                    usageTip = "در شرطی‌ها."
                ),
                VocabWord(
                    english = "contingent",
                    persian = "مشروط، بسته به شرایط",
                    pronunciation = "/kənˈtɪndʒənt/",
                    partOfSpeech = "adjective",
                    example = "Our plans are contingent on the weather.",
                    examplePersian = "برنامه‌هایمان به هوا بستگی دارد.",
                    usageTip = "در شرطی‌های رسمی."
                ),
                VocabWord(
                    english = "speculation",
                    persian = "گمانه‌زنی",
                    pronunciation = "/ˌspekjuˈleɪʃən/",
                    partOfSpeech = "noun",
                    example = "That's just speculation.",
                    examplePersian = "این فقط گمانه‌زنیه.",
                    wordFamily = "speculate, speculative",
                    usageTip = "در شرطی‌ها."
                ),
                VocabWord(
                    english = "counterargument",
                    persian = "استدلال مخالف",
                    pronunciation = "/ˈkaʊntərɑːrɡjəmənt/",
                    partOfSpeech = "noun",
                    example = "Consider the counterargument.",
                    examplePersian = "استدلال مخالف را در نظر بگیر.",
                    usageTip = "در بحث."
                ),
                VocabWord(
                    english = "provision",
                    persian = "شرط، مقرره",
                    pronunciation = "/prəˈvɪʒən/",
                    partOfSpeech = "noun",
                    example = "With the provision that...",
                    examplePersian = "با شرط اینکه...",
                    usageTip = "در شرطی‌های رسمی."
                ),
                VocabWord(
                    english = "otherwise",
                    persian = "در غیر این صورت",
                    pronunciation = "/ˈʌðərwaɪz/",
                    partOfSpeech = "adverb",
                    example = "Study now, otherwise you'll fail.",
                    examplePersian = "الان درس بخون، وگرنه رد می‌شی.",
                    usageTip = "با شرطی‌ها."
                ),
                VocabWord(
                    english = "lest",
                    persian = "مبادا که",
                    pronunciation = "/lest/",
                    partOfSpeech = "conjunction",
                    example = "Study hard lest you fail.",
                    examplePersian = "سخت درس بخون مبادا رد بشی.",
                    usageTip = "رسمی، قدیمی."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "if push comes to shove",
                    persian = "در بدترین حالت",
                    example = "If push comes to shove, we'll find another way.",
                    examplePersian = "در بدترین حالت، راه دیگه‌ای پیدا می‌کنیم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "as luck would have it",
                    persian = "بخت یار بود که",
                    example = "As luck would have it, I found the keys.",
                    examplePersian = "بخت یار بود که کلیدها رو پیدا کردم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "in the unlikely event",
                    persian = "در صورت بعید",
                    example = "In the unlikely event of rain, we'll cancel.",
                    examplePersian = "در صورت بعید بارش باران، لغو می‌کنیم.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "come down to",
                    meaning = "to be a matter of",
                    persian = "بستگی داشتن به",
                    example = "It all comes down to money.",
                    examplePersian = "همه‌اش به پول بستگی داره."
                ),
                PhrasalVerb(
                    verb = "hinge on",
                    meaning = "to depend on",
                    persian = "بستگی داشتن",
                    example = "Our plans hinge on the weather.",
                    examplePersian = "برنامه‌هایمان به هوا بستگی داره."
                ),
                PhrasalVerb(
                    verb = "work out",
                    meaning = "to end well",
                    persian = "به نتیجه رسیدن",
                    example = "If things work out, we'll move.",
                    examplePersian = "اگر همه چیز خوب پیش بره، نقل مکان می‌کنیم."
                ),
                PhrasalVerb(
                    verb = "fall through",
                    meaning = "to fail to happen",
                    persian = "انجام نشدن",
                    example = "If the deal falls through, we'll try again.",
                    examplePersian = "اگر معامله انجام نشه، دوباره تلاش می‌کنیم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Inversion stress",
                    content = "در شرطی‌های معکوس، on was/had/should تأکید می‌شود:\n• HAD I known, I would have come.\n• WERE I you, I'd wait."
                ),
                PronunciationTip(
                    title = "Contractions in third conditional",
                    content = "در گفتار:\n• If I'd known → If I had known\n• I would've → I would have\n• She'd have → She would have"
                ),
                PronunciationTip(
                    title = "Intonation in conditionals",
                    content = "در if-clause معمولاً آهنگ صعودی و main clause نزولی:\n• If you study ↑, you'll pass ↓."
                ),
                PronunciationTip(
                    title = "Stress in mixed conditionals",
                    content = "در mixed conditionals، هر دو بخش تأکید می‌گیرند:\n• If I HAD STUDIED, I would BE a DOCTOR."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Politeness with conditionals",
                    content = "برای درخواست مؤدبانه، از second conditional استفاده می‌شود: 'Would it be possible if I...?'"
                ),
                CulturalNote(
                    title = "Inversion in formal writing",
                    content = "در مقالات رسمی، از inverted conditionals استفاده می‌شود: 'Should you require assistance, please contact us.'"
                ),
                CulturalNote(
                    title = "Hypotheticals in conversation",
                    content = "انگلیسی‌زبانان زیاد از 'What would you do if...?' برای شروع مکالمه استفاده می‌کنند."
                ),
                CulturalNote(
                    title = "Counterfactuals in history",
                    content = "در تحلیل تاریخ: 'If the war had ended earlier, millions would have been saved.'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Zero, First, Second, Third Conditionals Review",
                    content = """
| Type | Structure | Example | Use |
|------|-----------|---------|-----|
| Zero | If + present, present | If you heat water, it boils. | حقایق |
| First | If + present, will + verb | If it rains, I'll stay. | موقعیت واقعی |
| Second | If + past, would + verb | If I were rich, I'd travel. | فرضی |
| Third | If + past perfect, would have + pp | If I'd studied, I'd have passed. | پشیمانی |

نکته: انتخاب نوع بستگی به واقعیت موقعیت دارد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Mixed Conditionals: Type A",
                    content = """
نوع A: گذشته + حال

ساختار: If + past perfect, would + base verb

کاربرد: شرط گذشته‌ای که نتیجه‌اش در حال حاضر است.

مثال:
• If I had studied medicine, I would be a doctor now.
  (گذشته: درس نخواندم — حال: دکتر نیستم)

• If she had taken the job, she would live in London now.
  (گذشته: شغل را قبول نکرد — حال: در لندن نیست)

• If they had bought that house, they would be rich now.
  (گذشته: خانه را نخریدند — حال: ثروتمند نیستند)

نکته: بخش اول گذشته (past perfect)، بخش دوم حال (would + verb).
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Mixed Conditionals: Type B",
                    content = """
نوع B: حال + گذشته

ساختار: If + past simple, would have + past participle

کاربرد: شرط حال که نتیجه‌اش در گذشته بوده.

مثال:
• If I weren't so busy, I would have helped you yesterday.
  (حال: مشغولم — گذشته: کمک نکردم)

• If he weren't so shy, he would have spoken at the meeting.
  (حال: خجالتیه — گذشته: صحبت نکرد)

• If she didn't have to work, she would have come to the party.
  (حال: مجبور به کار — گذشته: نیامد)

نکته: بخش اول حال (past simple)، بخش دوم گذشته (would have + pp).
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Inverted Conditionals",
                    content = """
در زبان رسمی، if حذف و وارونگی ایجاد می‌شود:

نوع ۱: Should + subject
If you need help → Should you need help
• Should you have any questions, please ask.
• Should it rain, we'll cancel the event.

نوع ۲: Were + subject
If I were you → Were I you
• Were I in your position, I'd ask for more.
• Were she here, she'd know what to do.

نوع ۳: Had + subject
If I had known → Had I known
• Had I known, I would have acted differently.
• Had they left earlier, they wouldn't have missed the flight.

نکته: این ساختار رسمی و ادبی است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Alternatives to 'If'",
                    content = """
جایگزین‌های if:

unless = if...not:
• I won't go unless you come. (= if you don't come)

provided that / providing that / as long as:
• I'll help provided that you ask nicely.
• You can go as long as you're back by 10.

suppose / supposing:
• Suppose you won the lottery — what would you do?
• Supposing we miss the train, what then?

imagine / what if:
• Imagine you were rich. What would you do?
• What if it rains?

in case:
• Take an umbrella in case it rains.

otherwise:
• Hurry up, otherwise we'll be late.

نکته: این‌ها همان معنی if را می‌دهند، ولی تفاوت‌های ظریف دارند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Conditional with Modal Verbs",
                    content = """
با modals در main clause:

• If you finish early, you can leave.
• If you're tired, you should rest.
• If it rains, we might stay home.
• If you want, you could come with us.
• If she studies, she must pass.

با modal perfect:
• If it had rained, we would have stayed home.
• If you had asked, I could have helped.
• If they had tried, they might have succeeded.

نکته: modal انتخاب می‌شود بر اساس معنی مورد نظر.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Wish and If Only",
                    content = """
برای ابراز آرزو یا پشیمانی:

Wish + past simple (آرزو در حال):
• I wish I had more time.
• She wishes she could travel.

Wish + past perfect (پشیمانی از گذشته):
• I wish I had studied harder.
• He wishes he hadn't said that.

If only (تأکیدی‌تر):
• If only I had more time!
• If only we could start over!

Wish + would (شکایت از رفتار دیگران):
• I wish you would stop smoking.
• She wishes he would listen more.

Would rather (ترجیح):
• I'd rather you didn't smoke here.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Conditionals in Different Contexts",
                    content = """
کاربردهای شرطی‌ها:

1. Advising (توصیه):
   If I were you, I would apologize.

2. Warning (هشدار):
   If you don't hurry, you'll miss the train.

3. Promising (قول):
   If you help me, I'll help you.

4. Regretting (پشیمانی):
   If only I had known!

5. Hypothesizing (فرض کردن):
   If we lived on Mars, what would life be like?

6. Negotiating (مذاکره):
   I'll sign if you agree to these terms.

7. Analyzing history (تحلیل تاریخی):
   If the war had ended earlier, millions would have been saved.

8. Predicting (پیش‌بینی):
   If the trend continues, prices will rise.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "If I would have known, I would have come.",
                    correct = "If I had known, I would have come.",
                    explanation = "در if-clause سوم شرطی، past perfect بدون would."
                ),
                CommonMistake(
                    wrong = "If I would study, I would pass.",
                    correct = "If I studied, I would pass.",
                    explanation = "در second conditional، past simple بدون would."
                ),
                CommonMistake(
                    wrong = "If I was you, I'd apologize.",
                    correct = "If I were you, I'd apologize.",
                    explanation = "در second conditional، با be از were استفاده می‌کنیم (فرمال)."
                ),
                CommonMistake(
                    wrong = "If it will rain, we'll stay home.",
                    correct = "If it rains, we'll stay home.",
                    explanation = "در if-clause از will استفاده نمی‌کنیم."
                ),
                CommonMistake(
                    wrong = "Unless you don't hurry, we'll be late.",
                    correct = "Unless you hurry, we'll be late.",
                    explanation = "unless خودش منفی است، پس don't اضافه نمی‌شود."
                ),
                CommonMistake(
                    wrong = "If I had known, I would be there now.",
                    correct = "If I had known, I would have been there.",
                    explanation = "برای نتیجه در گذشته، would have + pp؛ برای نتیجه در حال، would + verb."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Leila",
                    english = "You look tired. What's wrong?",
                    persian = "خسته به نظر می‌رسی. چی شده؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I'm exhausted. I wish I had gone to bed earlier last night.",
                    persian = "خسته‌ام. ای کاش دیشب زودتر خوابیده بودم."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "Why didn't you?",
                    persian = "چرا نکردی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I had to finish a report. If I hadn't stayed up, I wouldn't have finished it.",
                    persian = "باید یه گزارش را تموم می‌کردم. اگه بیدار نمی‌موندم، تمومش نمی‌کردم."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "I see. Well, if I were you, I would take a nap today.",
                    persian = "می‌فهمم. خب، اگه جای تو بودم، امروز یه چرت می‌زدم."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I would if I had time. I have another deadline tomorrow.",
                    persian = "می‌زدم اگه وقت داشتم. فردا یه ددلاین دیگه دارم."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "That's tough. If you had started earlier, you wouldn't be so rushed now.",
                    persian = "سخته. اگه زودتر شروع کرده بودی، الان اینقدر عجله نداشتی."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "You're right. If I had managed my time better, I would be more relaxed now.",
                    persian = "حق داری. اگه وقتم را بهتر مدیریت کرده بودم، الان آرام‌تر بودم."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "Well, we learn from our mistakes. Should you need help, let me know.",
                    persian = "خب، از اشتباهاتمان یاد می‌گیریم. اگه کمکی خواستی، خبرم کن."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Thanks. If I hadn't had your support, I would have given up.",
                    persian = "ممنون. اگه حمایتت نبود، تسلیم شده بودم."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "Don't mention it. What would you do differently next time?",
                    persian = "خواهش می‌کنم. دفعه بعد چی رو متفاوت انجام می‌دی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I'd start earlier and set smaller deadlines.",
                    persian = "زودتر شروع می‌کردم و ددلاین‌های کوچک‌تر تعیین می‌کردم."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "That's smart. Had I known you were struggling, I would have helped.",
                    persian = "هوشمندانه. اگه می‌دونستم درگیر بودی، کمک می‌کردم."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I appreciate that. If only I had asked for help sooner!",
                    persian = "قدردانی می‌کنم. ای کاش زودتر کمک خواسته بودم!"
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "Well, it's never too late. If you need anything, just ask.",
                    persian = "خب، هیچ‌وقت دیر نیست. اگه چیزی خواستی، فقط بپرس."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I will. Thanks for being there.",
                    persian = "می‌کنم. ممنون که هستی."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "Anytime. We all need support sometimes.",
                    persian = "هر وقت. همه ما گاهی به حمایت نیاز داریم."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "True. I'll do better next time.",
                    persian = "درسته. دفعه بعد بهتر عمل می‌کنم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Why is Sam tired?",
                    answer = "He stayed up late finishing a report."
                ),
                ComprehensionQuestion(
                    question = "What does Leila suggest?",
                    answer = "She suggests taking a nap today."
                ),
                ComprehensionQuestion(
                    question = "Why can't Sam rest?",
                    answer = "He has another deadline tomorrow."
                ),
                ComprehensionQuestion(
                    question = "What does Leila say about Sam's time management?",
                    answer = "If he had managed his time better, he would be more relaxed now."
                ),
                ComprehensionQuestion(
                    question = "What would Sam do differently next time?",
                    answer = "He would start earlier and set smaller deadlines."
                ),
                ComprehensionQuestion(
                    question = "How does Leila offer help?",
                    answer = "She says, 'Should you need help, let me know.'"
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Discuss a hypothetical situation using mixed conditionals.",
                    promptPersian = "درباره یه وضعیت فرضی با mixed conditionals صحبت کن.",
                    hints = "Use: If I had..., I would... / If I were..., I would have..."
                ),
                SpeakingTask(
                    prompt = "Talk about a regret and what would have been different.",
                    promptPersian = "درباره یه پشیمانی و چیزهایی که متفاوت می‌شد صحبت کن.",
                    hints = "Use: If I had..., I would have... / I wish I had..."
                ),
                SpeakingTask(
                    prompt = "Give advice using inverted conditionals.",
                    promptPersian = "با inverted conditionals توصیه کن.",
                    hints = "Use: Were I you... / Had I known... / Should you need..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a reflective essay (about 200 words) about a turning point in your life. Use mixed conditionals, third conditional, and inverted conditionals.",
                    promptPersian = "یه مقاله بازتابی بنویس (حدود ۲۰۰ کلمه) درباره یه نقطه عطف در زندگی‌ات. از mixed conditionals، سوم شرطی و inverted conditionals استفاده کن.",
                    wordCount = 200,
                    hints = "Structure:\n1. Describe the event\n2. Reflect on what could have been\n3. Analyze consequences\n4. Lessons learned"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: If I had known, I ___ have come.",
                    options = listOf("will", "would", "would have", "have"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: If I ___ you, I'd apologize.",
                    options = listOf("am", "was", "were", "be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "If I would have studied, I would have passed.",
                        "If I had studied, I would have passed.",
                        "If I had studied, I would passed.",
                        "If I studied, I would have passed."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: If I had studied medicine, I ___ a doctor now.",
                    options = listOf("would be", "would have been", "am", "will be"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: ___ I known, I would have helped.",
                    options = listOf("If", "Had", "Have", "Did"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'unless' mean?",
                    options = listOf("اگر", "مگر اینکه", "در حالی که", "تا اینکه"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I wish I ___ more time.",
                    options = listOf("have", "had", "will have", "having"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: If it ___ tomorrow, we'll cancel the picnic.",
                    options = listOf("will rain", "rains", "rained", "raining"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 3 — Advanced Passive Structures
    // ============================================================
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Advanced Passive Structures",
            titlePersian = "ساختارهای پیشرفته مجهول",
            objectives = listOf(
                "Master passive voice in all tenses.",
                "Use personal and impersonal passive.",
                "Apply passive with reporting verbs.",
                "Use causative passive (have/get something done).",
                "Distinguish when passive is more appropriate."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "causative",
                    persian = "سببی",
                    pronunciation = "/ˈkɔːzətɪv/",
                    partOfSpeech = "adjective",
                    example = "Causative passive is common in English.",
                    examplePersian = "مجهول سببی در انگلیسی رایجه.",
                    usageTip = "have/get something done."
                ),
                VocabWord(
                    english = "impersonal",
                    persian = "غیرشخصی",
                    pronunciation = "/ɪmˈpɜːrsənəl/",
                    partOfSpeech = "adjective",
                    example = "Impersonal passive is used in academic writing.",
                    examplePersian = "مجهول غیرشخصی در نوشتار آکادمیک استفاده می‌شود.",
                    usageTip = "it is said that..."
                ),
                VocabWord(
                    english = "agent",
                    persian = "عامل (کننده کار)",
                    pronunciation = "/ˈeɪdʒənt/",
                    partOfSpeech = "noun",
                    example = "In passive, the agent is often omitted.",
                    examplePersian = "در مجهول، عامل اغلب حذف می‌شود.",
                    usageTip = "با by نشان داده می‌شود."
                ),
                VocabWord(
                    english = "reported speech",
                    persian = "نقل قول",
                    pronunciation = "/rɪˈpɔːrtɪd spiːtʃ/",
                    partOfSpeech = "noun",
                    example = "Passive is common in reported speech.",
                    examplePersian = "مجهول در نقل قول رایجه.",
                    usageTip = "در گزارش‌دهی."
                ),
                VocabWord(
                    english = "formal register",
                    persian = "لحن رسمی",
                    pronunciation = "/ˈfɔːrməl ˈredʒɪstər/",
                    partOfSpeech = "noun",
                    example = "Passive is more common in formal register.",
                    examplePersian = "مجهول در لحن رسمی رایج‌تره.",
                    usageTip = "در آکادمیک."
                ),
                VocabWord(
                    english = "emphasis",
                    persian = "تأکید",
                    pronunciation = "/ˈemfəsɪs/",
                    partOfSpeech = "noun",
                    example = "Passive shifts the emphasis.",
                    examplePersian = "مجهول تأکید را جابجا می‌کند.",
                    wordFamily = "emphasize, emphatic",
                    usageTip = "کاربرد passive."
                ),
                VocabWord(
                    english = "specify",
                    persian = "مشخص کردن",
                    pronunciation = "/ˈspesɪfaɪ/",
                    partOfSpeech = "verb",
                    example = "Who is responsible for the action is not specified.",
                    examplePersian = "مسئول کار مشخص نمی‌شود.",
                    wordFamily = "specification",
                    usageTip = "در passive."
                ),
                VocabWord(
                    english = "ambiguous",
                    persian = "مبهم",
                    pronunciation = "/æmˈbɪɡjuəs/",
                    partOfSpeech = "adjective",
                    example = "The passive can be ambiguous.",
                    examplePersian = "مجهول می‌تواند مبهم باشد.",
                    wordFamily = "ambiguity",
                    usageTip = "کاربرد passive."
                ),
                VocabWord(
                    english = "objectivity",
                    persian = "عینیت",
                    pronunciation = "/ˌɑːbdʒekˈtɪvəti/",
                    partOfSpeech = "noun",
                    example = "Passive is used for objectivity.",
                    examplePersian = "مجهول برای عینیت استفاده می‌شود.",
                    wordFamily = "objective, objectively",
                    usageTip = "در آکادمیک."
                ),
                VocabWord(
                    english = "construction",
                    persian = "ساختار",
                    pronunciation = "/kənˈstrʌkʃən/",
                    partOfSpeech = "noun",
                    example = "This is a passive construction.",
                    examplePersian = "این یه ساختار مجهوله.",
                    wordFamily = "construct, constructive",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "process",
                    persian = "فرایند",
                    pronunciation = "/ˈprɑːses/",
                    partOfSpeech = "noun",
                    example = "The process was described in detail.",
                    examplePersian = "فرایند با جزئیات توصیف شد.",
                    usageTip = "در توضیح مراحل."
                ),
                VocabWord(
                    english = "responsibility",
                    persian = "مسئولیت",
                    pronunciation = "/rɪˌspɑːnsəˈbɪləti/",
                    partOfSpeech = "noun",
                    example = "Who has responsibility for this?",
                    examplePersian = "چه کسی مسئول این کار است؟",
                    wordFamily = "responsible, responsibly",
                    usageTip = "در بحث agent."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "be said to",
                    persian = "گفته می‌شود",
                    example = "He is said to be very rich.",
                    examplePersian = "گفته می‌شود که او خیلی ثروتمند است.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "be expected to",
                    persian = "انتظار می‌رود",
                    example = "The economy is expected to grow.",
                    examplePersian = "انتظار می‌رود که اقتصاد رشد کند.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "be supposed to",
                    persian = "قرار است",
                    example = "The meeting is supposed to start at 10.",
                    examplePersian = "قرار است جلسه ساعت ۱۰ شروع شود.",
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
                    verb = "be based on",
                    meaning = "to be founded on",
                    persian = "بر اساس",
                    example = "The movie is based on a true story.",
                    examplePersian = "فیلم بر اساس یه داستان واقعی ساخته شده."
                ),
                PhrasalVerb(
                    verb = "be involved in",
                    meaning = "to be part of",
                    persian = "درگیر بودن",
                    example = "She was involved in the project.",
                    examplePersian = "او در پروژه درگیر بود."
                ),
                PhrasalVerb(
                    verb = "be referred to",
                    meaning = "to be called",
                    persian = "نامیده شدن",
                    example = "This is referred to as the passive voice.",
                    examplePersian = "این مجهول نامیده می‌شود."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Weak forms of be",
                    content = "در passive، شکل‌های am/is/are/was/were اغلب ضعیف تلفظ می‌شوند:\n• The letter is sent → /ðə ˈletər ɪz sent/"
                ),
                PronunciationTip(
                    title = "Stress on past participle",
                    content = "در passive، past participle تأکید می‌گیرد:\n• The window was BROKEN.\n• The report was FINISHED."
                ),
                PronunciationTip(
                    title = "Causative 'have' stress",
                    content = "در causative passive، have/get تأکید کمتری دارند:\n• I had my hair CUT."
                ),
                PronunciationTip(
                    title = "Emphasis on by-agent",
                    content = "وقتی فاعل مهم است، روی by + agent تأکید می‌شود:\n• It was written BY HEMINGWAY."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Passive in academic writing",
                    content = "در مقالات علمی، passive رایج است چون تمرکز روی نتایج و فرایند است، نه شخص محقق."
                ),
                CulturalNote(
                    title = "Passive in news",
                    content = "اخبار اغلب از passive استفاده می‌کنند: 'Three people were injured.'"
                ),
                CulturalNote(
                    title = "Passive for diplomacy",
                    content = "در دیپلماسی، passive برای پرهیز از سرزنش مستقیم: 'Mistakes were made.'"
                ),
                CulturalNote(
                    title = "Avoiding responsibility",
                    content = "گاهی passive برای پنهان کردن فاعل استفاده می‌شود — این می‌تواند بحث‌برانگیز باشد."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Passive Voice Review",
                    content = """
ساختار کلی: be + past participle

در همه زمان‌ها:
| Tense | Active | Passive |
|-------|--------|---------|
| Present Simple | They make cars. | Cars are made. |
| Present Continuous | They are making cars. | Cars are being made. |
| Present Perfect | They have made cars. | Cars have been made. |
| Past Simple | They made cars. | Cars were made. |
| Past Continuous | They were making cars. | Cars were being made. |
| Past Perfect | They had made cars. | Cars had been made. |
| Future Simple | They will make cars. | Cars will be made. |
| Future Perfect | They will have made cars. | Cars will have been made. |
| Modals | They must make cars. | Cars must be made. |
| Infinitive | They want to make cars. | Cars want to be made. |
| Perfect Infinitive | They seem to have made cars. | Cars seem to have been made. |
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Personal Passive",
                    content = """
ساختار: Subject + passive + (by agent)

وقتی فاعل جمله active مهم است و می‌خواهیم حفظش کنیم:

• The Mona Lisa was painted by Leonardo da Vinci.
• The telephone was invented by Alexander Graham Bell.
• The book was written by Hemingway.

نکته: agent (by + فاعل) تنها در صورتی ذکر می‌شود که:
1. فاعل مهم یا مورد توجه باشد
2. اطلاعات جدیدی اضافه کند
3. جمله بدون آن مبهم باشد

مثال:
• My car was stolen. (فاعل ناشناخته)
• My car was stolen by a teenager. (فاعل مهم است)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Impersonal Passive",
                    content = """
ساختار: It + passive verb + that + clause

با افعال گزارش‌دهی:
• It is said that...
• It is believed that...
• It is reported that...
• It is thought that...
• It is known that...
• It is expected that...

مثال:
• It is said that he is very rich.
• It is believed that she is innocent.
• It is reported that the economy is improving.
• It is thought that the company will merge.

کاربرد: در نوشتار رسمی، اخبار، مقالات آکادمیک.

نکته: می‌توان به personal passive تبدیل کرد:
• He is said to be very rich.
• She is believed to be innocent.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Passive with Reporting Verbs",
                    content = """
دو ساختار:

ساختار ۱ — Impersonal:
It + passive + that + clause
• It is said that he is a genius.

ساختار ۲ — Personal:
Subject + passive + to infinitive
• He is said to be a genius.

افعال رایج:
say, believe, think, know, report, suppose, consider, expect, claim, rumor

با زمان‌های مختلف:
• He is said to be very rich. (حال)
• He is said to have been a genius. (گذشته)
• He is said to be living in Paris. (حال استمراری)
• The company is expected to announce results. (آینده نزدیک)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Causative Passive",
                    content = """
ساختار: have/get + object + past participle

کاربردها:

1. خدماتی که کسی برای ما انجام می‌دهد:
• I had my hair cut. (آرایشگر موهایم را کوتاه کرد)
• She had her car repaired. (تعمیرکار ماشین را تعمیر کرد)
• We had our house painted. (نقاش خانه را رنگ کرد)

2. تجربه‌های منفی:
• He had his wallet stolen. (کیف پولش دزدیده شد)
• She had her car broken into. (ماشینش شکسته شد)

3. با get (غیررسمی‌تر):
• I got my hair cut.
• She got her dress cleaned.

تفاوت have و get:
• have: رسمی‌تر
• get: غیررسمی‌تر

نکته: در این ساختار، فاعل خودش کار را انجام نمی‌دهد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Passive with Two Objects",
                    content = """
وقتی فعل دو مفعول دارد:

Active: They gave Maria a prize.
- Indirect object: Maria
- Direct object: a prize

Passive 1 (رایج‌تر): Maria was given a prize.
Passive 2 (رسمی‌تر): A prize was given to Maria.

افعال رایج:
give, send, show, tell, offer, lend, promise, teach, bring, pay, hand

مثال‌ها:
• I was sent a letter. / A letter was sent to me.
• He was offered a job. / A job was offered to him.
• We were shown the house. / The house was shown to us.

نکته: در انگلیسی آمریکایی، Passive 1 رایج‌تر است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Passive with Modals and Infinitives",
                    content = """
با modals:
Modal + be + past participle
• The rule must be followed.
• The package can be delivered tomorrow.
• The work should be finished by Friday.
• The problem might be solved.

با infinitives:
to be + past participle
• I want the work to be done.
• She expects the report to be submitted.
• They need the car to be repaired.

با modal perfect:
Modal + have been + past participle
• The letter should have been sent yesterday.
• It might have been forgotten.
• The work could have been finished earlier.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. When to Use Passive",
                    content = """
از passive استفاده می‌کنیم وقتی:

1. فاعل ناشناخته است:
   My car was stolen last night.

2. فاعل بی‌اهمیت است:
   The road is being repaired.

3. فاعل واضح است:
   The thief was arrested. (بدیهی است توسط پلیس)

4. تمرکز روی مفعول است:
   The prize was given to Maria.

5. در نوشتار رسمی و علمی:
   The experiment was conducted three times.

6. برای پرهیز از سرزنش مستقیم:
   Mistakes were made.

7. در دستورالعمل‌ها:
   The button should be pressed twice.

از active استفاده می‌کنیم وقتی:
• فاعل مهم است: Maria won the prize.
• اطلاعات واضح‌تر منتقل می‌شود.
• جمله کوتاه‌تر و مؤثرتر می‌شود.
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
                    wrong = "I had my hair cut by myself.",
                    correct = "I had my hair cut. / I cut my own hair.",
                    explanation = "در causative، فاعل خودش کار را انجام نمی‌دهد."
                ),
                CommonMistake(
                    wrong = "It is said that he is very rich. (بدون ارتباط)",
                    correct = "It is said that he is very rich.",
                    explanation = "این جمله درست است — impersonal passive."
                ),
                CommonMistake(
                    wrong = "Is being the house cleaned?",
                    correct = "Is the house being cleaned?",
                    explanation = "ترتیب: auxiliary + subject + be + pp."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Anna",
                    english = "Have you heard about the new library?",
                    persian = "درباره کتابخانه جدید شنیده‌ای؟"
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Yes! It was designed by a famous architect.",
                    persian = "بله! توسط یه معمار معروف طراحی شده."
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "Really? When was it built?",
                    persian = "واقعاً؟ کِی ساخته شد؟"
                ),
                DialogueLine(
                    speaker = "James",
                    english = "It was completed last year. It's said to be the best in the city.",
                    persian = "سال گذشته تکمیل شد. گفته می‌شود بهترین در شهره."
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "I should visit it. Is it free?",
                    persian = "باید برم ببینمش. رایگانه؟"
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Yes, entry is not charged. But books must be returned on time.",
                    persian = "بله، ورودی گرفته نمی‌شه. ولی کتاب‌ها باید سر وقت برگردونده بشن."
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "Are memberships available?",
                    persian = "عضویت‌ها موجوده؟"
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Yes, they can be purchased online or at the entrance.",
                    persian = "بله، می‌تونن آنلاین یا در ورودی خریداری بشن."
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "Nice. I heard the workshops are popular.",
                    persian = "خوبه. شنیدم کارگاه‌ها محبوبند."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Yes, they're held every Saturday. Free workshops are offered.",
                    persian = "بله، هر شنبه برگزار می‌شن. کارگاه‌های رایگان ارائه می‌شن."
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "That's wonderful. Has the library been visited by many?",
                    persian = "فوق‌العاده‌ست. کتابخانه توسط افراد زیادی بازدید شده؟"
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Yes, thousands of people have visited it already.",
                    persian = "بله، هزاران نفر قبلاً ازش بازدید کرده‌اند."
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "I'll definitely go this weekend.",
                    persian = "این آخر هفته حتماً می‌رم."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "You should! It was designed to be enjoyed by everyone.",
                    persian = "باید بری! طوری طراحی شده که همه ازش لذت ببرن."
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "Do you know if guided tours are offered?",
                    persian = "می‌دونی تورهای راهنما ارائه می‌شن؟"
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Yes, they're given three times a day.",
                    persian = "بله، سه بار در روز ارائه می‌شن."
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "Perfect. I'll book one when I get there.",
                    persian = "عالی. وقتی رسیدم یکی رزرو می‌کنم."
                ),
                DialogueLine(
                    speaker = "James",
                    english = "Great. Let me know how it goes!",
                    persian = "عالی. خبرم کن چطور پیش می‌ره!"
                ),
                DialogueLine(
                    speaker = "Anna",
                    english = "I will. Thanks for the info!",
                    persian = "می‌کنم. ممنون برای اطلاعات!"
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
                    question = "How often are guided tours given?",
                    answer = "They're given three times a day."
                ),
                ComprehensionQuestion(
                    question = "How many people have visited the library?",
                    answer = "Thousands of people have visited it already."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe a famous building or landmark using passive voice.",
                    promptPersian = "توصیف کن یه بنای معروف را با استفاده از مجهول.",
                    hints = "Use: It was built..., It is known for..., It has been..."
                ),
                SpeakingTask(
                    prompt = "Talk about a service someone did for you.",
                    promptPersian = "درباره خدمتی که کسی برایت انجام داد صحبت کن.",
                    hints = "Use: I had my... done. / I got my... repaired."
                ),
                SpeakingTask(
                    prompt = "Report news using impersonal passive.",
                    promptPersian = "خبری را با impersonal passive نقل کن.",
                    hints = "Use: It is said that... / It is reported that... / It is believed that..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a news report (about 200 words) using passive voice extensively. Include personal passive, impersonal passive, and causative.",
                    promptPersian = "یه گزارش خبری بنویس (حدود ۲۰۰ کلمه) با استفاده گسترده از مجهول. شامل personal passive، impersonal passive و causative.",
                    wordCount = 200,
                    hints = "Structure:\n1. What happened\n2. Who was involved\n3. What will be done\n4. Quotes"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: The book ___ written by Hemingway.",
                    options = listOf("is", "was", "has", "does"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The rule must ___ followed.",
                    options = listOf("be", "is", "been", "being"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What's the past participle of 'write'?",
                    options = listOf("wrote", "writed", "written", "writes"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "What does 'I had my hair cut' mean?",
                    options = listOf(
                        "خودم موهایم را کوتاه کردم",
                        "کسی موهایم را کوتاه کرد",
                        "موهایم ریخت",
                        "موهایم بلند شد"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: It ___ said that he is very rich.",
                    options = listOf("is", "has", "was", "does"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Which is impersonal passive?",
                    options = listOf(
                        "The book was written by Hemingway.",
                        "It is said that he is very rich.",
                        "I had my hair cut.",
                        "They built the house."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The house was ___ in 1990.",
                    options = listOf("build", "built", "building", "builds"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The meeting is ___ to start at 10.",
                    options = listOf("suppose", "supposed", "supposing", "supposes"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 4 — Advanced Reported Speech
    // ============================================================
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Advanced Reported Speech",
            titlePersian = "نقل قول غیرمستقیم پیشرفته",
            objectives = listOf(
                "Report statements, questions, and commands with precision.",
                "Use a wide range of reporting verbs.",
                "Handle complex time and place shifts.",
                "Report speech in different tenses and contexts.",
                "Apply reported speech in journalistic and academic writing."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "reporting verb",
                    persian = "فعل گزارش‌دهی",
                    pronunciation = "/rɪˈpɔːrtɪŋ vɜːrb/",
                    partOfSpeech = "noun",
                    example = "There are many reporting verbs in English.",
                    examplePersian = "افعال گزارش‌دهی زیادی در انگلیسی وجود دارد.",
                    usageTip = "در نقل قول."
                ),
                VocabWord(
                    english = "backshift",
                    persian = "عقب‌گرد زمانی",
                    pronunciation = "/ˈbækʃɪft/",
                    partOfSpeech = "noun",
                    example = "Backshift is the tense change in reported speech.",
                    examplePersian = "عقب‌گرد زمانی، تغییر زمان در نقل قول است.",
                    usageTip = "در گرامر."
                ),
                VocabWord(
                    english = "claim",
                    persian = "ادعا کردن",
                    pronunciation = "/kleɪm/",
                    partOfSpeech = "verb",
                    example = "He claimed that he had finished the work.",
                    examplePersian = "او ادعا کرد که کار را تمام کرده است.",
                    usageTip = "فعل گزارش‌دهی."
                ),
                VocabWord(
                    english = "deny",
                    persian = "انکار کردن",
                    pronunciation = "/dɪˈnaɪ/",
                    partOfSpeech = "verb",
                    example = "She denied taking the money.",
                    examplePersian = "او انکار کرد که پول را برداشته است.",
                    usageTip = "فعل گزارش‌دهی."
                ),
                VocabWord(
                    english = "admit",
                    persian = "اعتراف کردن",
                    pronunciation = "/ədˈmɪt/",
                    partOfSpeech = "verb",
                    example = "He admitted that he was wrong.",
                    examplePersian = "او اعتراف کرد که اشتباه کرده است.",
                    usageTip = "فعل گزارش‌دهی."
                ),
                VocabWord(
                    english = "suggest",
                    persian = "پیشنهاد دادن",
                    pronunciation = "/səˈdʒest/",
                    partOfSpeech = "verb",
                    example = "She suggested going to the cinema.",
                    examplePersian = "او پیشنهاد داد به سینما برویم.",
                    usageTip = "با gerund یا that clause."
                ),
                VocabWord(
                    english = "insist",
                    persian = "اصرار کردن",
                    pronunciation = "/ɪnˈsɪst/",
                    partOfSpeech = "verb",
                    example = "He insisted that I should stay.",
                    examplePersian = "او اصرار کرد که بمانم.",
                    usageTip = "با that clause یا on + gerund."
                ),
                VocabWord(
                    english = "warn",
                    persian = "هشدار دادن",
                    pronunciation = "/wɔːrn/",
                    partOfSpeech = "verb",
                    example = "She warned me not to be late.",
                    examplePersian = "او هشدار داد دیر نکنم.",
                    usageTip = "با tell/ask + not to."
                ),
                VocabWord(
                    english = "remind",
                    persian = "یادآوری کردن",
                    pronunciation = "/rɪˈmaɪnd/",
                    partOfSpeech = "verb",
                    example = "He reminded me to call her.",
                    examplePersian = "او یادآوری کرد که بهش زنگ بزنم.",
                    usageTip = "فعل گزارش‌دهی."
                ),
                VocabWord(
                    english = "persuade",
                    persian = "متقاعد کردن",
                    pronunciation = "/pərˈsweɪd/",
                    partOfSpeech = "verb",
                    example = "She persuaded me to join the club.",
                    examplePersian = "او متقاعد کرد که به باشگاه بپیوندم.",
                    usageTip = "فعل گزارش‌دهی."
                ),
                VocabWord(
                    english = "complain",
                    persian = "شکایت کردن",
                    pronunciation = "/kəmˈpleɪn/",
                    partOfSpeech = "verb",
                    example = "He complained about the noise.",
                    examplePersian = "او از سر و صدا شکایت کرد.",
                    usageTip = "فعل گزارش‌دهی."
                ),
                VocabWord(
                    english = "announce",
                    persian = "اعلام کردن",
                    pronunciation = "/əˈnaʊns/",
                    partOfSpeech = "verb",
                    example = "The company announced that it would close.",
                    examplePersian = "شرکت اعلام کرد که بسته می‌شود.",
                    usageTip = "رسمی."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "have a word with",
                    persian = "صحبتی با کسی داشتن",
                    example = "I had a word with my boss yesterday.",
                    examplePersian = "دیروز با رئیسم صحبتی داشتم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "break the news",
                    persian = "خبر را گفتن",
                    example = "She broke the news gently.",
                    examplePersian = "او خبر را با ملایمت گفت.",
                    register = "idiom"
                ),
                IdiomExpression(
                    english = "spread the word",
                    persian = "خبر را پخش کردن",
                    example = "He spread the word about the party.",
                    examplePersian = "او خبر مهمانی را پخش کرد.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "point out",
                    meaning = "to indicate",
                    persian = "اشاره کردن",
                    example = "She pointed out the mistake.",
                    examplePersian = "او به اشتباه اشاره کرد."
                ),
                PhrasalVerb(
                    verb = "bring up",
                    meaning = "to mention",
                    persian = "مطرح کردن",
                    example = "He brought up the issue at the meeting.",
                    examplePersian = "او موضوع را در جلسه مطرح کرد."
                ),
                PhrasalVerb(
                    verb = "sum up",
                    meaning = "to summarize",
                    persian = "خلاصه کردن",
                    example = "To sum up, we need more time.",
                    examplePersian = "خلاصه کنم، به وقت بیشتری نیاز داریم."
                ),
                PhrasalVerb(
                    verb = "put forward",
                    meaning = "to propose",
                    persian = "ارائه دادن",
                    example = "She put forward a new idea.",
                    examplePersian = "او ایده جدیدی ارائه داد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Stress in reporting verbs",
                    content = "در گفتار، فعل اصلی تأکید می‌گیرد:\n• He CLAIMED he was innocent.\n• She ADMITTED her mistake."
                ),
                PronunciationTip(
                    title = "Reduced 'that'",
                    content = "در گفتار طبیعی، that اغلب حذف می‌شود:\n• He said (that) he was busy.\n• She told me (that) she'd come."
                ),
                PronunciationTip(
                    title = "Rising intonation in reported questions",
                    content = "برخلاف سؤالات مستقیم، reported questions آهنگ نزولی دارند:\n• She asked where I lived. ↓"
                ),
                PronunciationTip(
                    title = "Contractions with would",
                    content = "در گفتار:\n• He would → He'd /hiːd/\n• She would → She'd /ʃiːd/"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "News reporting",
                    content = "در رسانه‌های غربی، گزارش‌دهی خبری معمولاً از reported speech استفاده می‌کند: 'The president said that...'"
                ),
                CulturalNote(
                    title = "Academic citation",
                    content = "در مقالات علمی، از reporting verbs متنوع برای ارجاع به منابع استفاده می‌شود: 'Smith (2020) argues that...'"
                ),
                CulturalNote(
                    title = "Gossip and reporting",
                    content = "در مکالمات روزمره، افراد زیاد از reporting verbs استفاده می‌کنند: 'He told me that...'"
                ),
                CulturalNote(
                    title = "Legal reporting",
                    content = "در متون حقوقی، از reported speech رسمی استفاده می‌شود: 'The witness stated that...'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Reported Statements: Review",
                    content = """
ساختار: say/tell + (that) + clause

تغییرات اصلی:
1. Backshift: زمان یک قدم عقب
2. Pronoun changes: ضمایر تغییر می‌کنند
3. Time/Place changes: زمان و مکان تغییر می‌کنند

مثال:
Direct: "I am tired," she said.
Reported: She said (that) she was tired.

Direct: "I will call you tomorrow," he said.
Reported: He said (that) he would call me the next day.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Advanced Backshift Rules",
                    content = """
| Direct | Reported |
|--------|----------|
| Present simple | Past simple |
| Present continuous | Past continuous |
| Present perfect | Past perfect |
| Present perfect continuous | Past perfect continuous |
| Past simple | Past perfect |
| Past continuous | Past perfect continuous |
| Past perfect | Past perfect (بدون تغییر) |
| Past perfect continuous | Past perfect continuous (بدون تغییر) |
| will | would |
| can | could |
| may | might |
| must | had to |
| shall | should |
| would/could/should/might | بدون تغییر |

نکته: اگر reporting verb در گذشته باشد، backshift انجام می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Reporting Verbs + Structures",
                    content = """
افعال گزارش‌دهی با ساختارهای مختلف:

verb + that clause:
• He said that...
• She claimed that...
• They reported that...

verb + object + that clause:
• He told me that...
• She informed us that...
• They warned him that...

verb + to infinitive:
• She agreed to help.
• He offered to drive.
• They promised to come.

verb + object + to infinitive:
• She asked me to wait.
• He told me to leave.
• They warned us not to go.

verb + gerund (-ing):
• He admitted stealing the money.
• She denied taking the book.
• They suggested going out.

verb + preposition + gerund:
• He insisted on paying.
• She apologized for being late.
• They complained about waiting.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Reporting Questions",
                    content = """
Yes/No questions:
if/whether + statement word order

Direct: "Are you tired?" she asked.
Reported: She asked if I was tired.

Direct: "Do you live here?" he asked.
Reported: He asked whether I lived there.

Wh-questions:
Question word + statement word order

Direct: "Where do you live?" she asked.
Reported: She asked where I lived.

Direct: "What time is it?" he asked.
Reported: He asked what time it was.

نکته: در reported questions:
• ترتیب جمله خبری
• علامت سؤال حذف می‌شود
• if/whether برای yes/no questions
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Reporting Commands and Requests",
                    content = """
Commands/Requests → tell/ask + object + to + infinitive

Direct: "Close the door!" he said.
Reported: He told me to close the door.

Direct: "Please help me," she said.
Reported: She asked me to help her.

Direct: "Don't be late," he said.
Reported: He told me not to be late.

افعال رایج:
tell, ask, order, warn, remind, advise, beg, instruct

منفی: not + to + infinitive
• He told me not to leave.
• She asked me not to worry.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Reported Offers, Promises, Suggestions",
                    content = """
Offers → offer + to infinitive:
Direct: "I'll help you."
Reported: He offered to help me.

Promises → promise + to infinitive:
Direct: "I'll come tomorrow."
Reported: She promised to come the next day.

Suggestions → suggest + gerund / that + clause:
Direct: "Let's go to the cinema."
Reported: He suggested going to the cinema.
Reported: He suggested that we (should) go to the cinema.

Refusals → refuse + to infinitive:
Direct: "I won't do it."
Reported: He refused to do it.

Agreement → agree + to infinitive:
Direct: "OK, I'll help."
Reported: He agreed to help.

Threats → threaten + to infinitive:
Direct: "I'll call the police!"
Reported: He threatened to call the police.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Time and Place Changes",
                    content = """
| Direct | Reported |
|--------|----------|
| now | then |
| today | that day |
| tonight | that night |
| yesterday | the day before / the previous day |
| tomorrow | the next day / the following day |
| next week/month/year | the following week/month/year |
| last week/month/year | the week/month/year before |
| ago | before |
| here | there |
| this | that |
| these | those |
| come | go |

مثال:
Direct: "I'll come here tomorrow," she said.
Reported: She said she would go there the next day.

نکته: اگر reporting فعل در حال انجام شود، backshift و تغییرات زمانی لازم نیست.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Reported Speech in Different Contexts",
                    content = """
در ژورنالیسم:
• The minister said that reforms would be introduced.
• According to reports, the deal has been finalized.

در آکادمیک:
• Smith (2020) argues that the theory is flawed.
• As Johnson (2019) points out, the data is inconclusive.

در حقوقی:
• The witness stated that he had not seen the defendant.
• The defendant denied all charges.

در مکالمه روزمره:
• She told me she was moving abroad.
• He said he'd call back later.

نکته: انتخاب reporting verb و ساختار بستگی به context و intent دارد.
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
                    explanation = "Backshift: is → was."
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
                    speaker = "Nina",
                    english = "Did you hear what the manager said at the meeting?",
                    persian = "شنیدی مدیر در جلسه چه گفت؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "Yes, he said that the project would be delayed by a month.",
                    persian = "بله، گفت که پروژه یک ماه به تأخیر می‌افتد."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Really? Did he explain why?",
                    persian = "واقعاً؟ توضیح داد چرا؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "He claimed that the client had changed the requirements at the last minute.",
                    persian = "ادعا کرد که مشتری در آخرین لحظه نیازها را عوض کرده."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "That sounds like an excuse. Did anyone argue?",
                    persian = "این شبیه بهانه به نظر می‌رسه. کسی بحث کرد؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "Yes, Sarah pointed out that the same issue had happened last quarter.",
                    persian = "بله، سارا اشاره کرد که همین مشکل سه ماه قبل هم پیش آمده بود."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "And what did the manager say to that?",
                    persian = "و مدیر به آن چه گفت؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "He promised that he would look into it.",
                    persian = "قول داد که بررسی‌اش می‌کند."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Did he ask anyone to help?",
                    persian = "از کسی خواست که کمک کند؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "Yes, he asked me to prepare a report by Friday.",
                    persian = "بله، از من خواست تا جمعه یک گزارش آماده کنم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "That's a tight deadline. Did he offer any resources?",
                    persian = "ددلاین سختیه. منابعی پیشنهاد داد؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "He suggested that we hire a contractor for two weeks.",
                    persian = "پیشنهاد داد که یه پیمانکار برای دو هفته استخدام کنیم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "That sounds reasonable. Did he mention the client's reaction?",
                    persian = "معقول به نظر می‌رسه. واکنش مشتری را ذکر کرد؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "He admitted that the client was unhappy but said they would cooperate.",
                    persian = "اعتراف کرد که مشتری ناراضی است ولی گفت همکاری می‌کنند."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Well, at least it's being taken seriously.",
                    persian = "خب، حداقل جدی گرفته می‌شه."
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "True. He warned us not to discuss it with anyone outside the team.",
                    persian = "درسته. هشدار داد که با کسی خارج از تیم درباره‌اش صحبت نکنیم."
                ),
                DialogueLine(
                    speaker = "Nina",
                    english = "Understood. Let me know if you need help with the report.",
                    persian = "فهمیدم. اگه برای گزارش کمک خواستی خبرم کن."
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "Thanks, I will!",
                    persian = "ممنون، می‌کنم!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What did the manager say about the project?",
                    answer = "He said that the project would be delayed by a month."
                ),
                ComprehensionQuestion(
                    question = "Why did the manager claim the project was delayed?",
                    answer = "He claimed the client had changed the requirements at the last minute."
                ),
                ComprehensionQuestion(
                    question = "What did Sarah point out?",
                    answer = "She pointed out that the same issue had happened last quarter."
                ),
                ComprehensionQuestion(
                    question = "What did the manager promise?",
                    answer = "He promised that he would look into it."
                ),
                ComprehensionQuestion(
                    question = "What did the manager ask Ramin to do?",
                    answer = "He asked him to prepare a report by Friday."
                ),
                ComprehensionQuestion(
                    question = "What did the manager suggest?",
                    answer = "He suggested that they hire a contractor for two weeks."
                ),
                ComprehensionQuestion(
                    question = "What did the manager warn the team about?",
                    answer = "He warned them not to discuss it with anyone outside the team."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Report a conversation you had this week.",
                    promptPersian = "گفت‌وگویی که این هفته داشتی را نقل کن.",
                    hints = "Use: He said that..., She told me..., They asked if..."
                ),
                SpeakingTask(
                    prompt = "Report a news story using reported speech.",
                    promptPersian = "خبری را با نقل قول غیرمستقیم گزارش کن.",
                    hints = "Use: According to the report..., It is said that..., The president claimed that..."
                ),
                SpeakingTask(
                    prompt = "Report a command your boss or teacher gave you.",
                    promptPersian = "دستوری که رئیس یا معلمت به تو داد را نقل کن.",
                    hints = "Use: He told me to..., She asked me to..., He warned me not to..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a news report (about 250 words) using reported speech extensively. Include statements, questions, and commands.",
                    promptPersian = "یه گزارش خبری بنویس (حدود ۲۵۰ کلمه) با استفاده گسترده از نقل قول غیرمستقیم. شامل جملات خبری، سؤالی و دستوری.",
                    wordCount = 250,
                    hints = "Structure:\n1. Introduction\n2. Main facts with reported speech\n3. Quotes from sources\n4. Context and implications"
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
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 5 — Relative Clauses (Advanced)
    // ============================================================
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Relative Clauses (Advanced)",
            titlePersian = "جملات موصولی پیشرفته",
            objectives = listOf(
                "Master defining and non-defining relative clauses.",
                "Use relative pronouns accurately (who, whom, which, that, whose).",
                "Apply reduced relative clauses.",
                "Use relative clauses for emphasis and description.",
                "Avoid common errors with relative clauses."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "relative pronoun",
                    persian = "ضمیر موصولی",
                    pronunciation = "/ˈrelətɪv ˈproʊnaʊn/",
                    partOfSpeech = "noun",
                    example = "Who, which, and that are relative pronouns.",
                    examplePersian = "who، which و that ضمایر موصولی هستند.",
                    usageTip = "در جملات موصولی."
                ),
                VocabWord(
                    english = "defining clause",
                    persian = "جمله موصولی محدودکننده",
                    pronunciation = "/dɪˈfaɪnɪŋ klɔːz/",
                    partOfSpeech = "noun",
                    example = "The book that I read was good.",
                    examplePersian = "کتابی که خواندم خوب بود.",
                    usageTip = "بدون کاما."
                ),
                VocabWord(
                    english = "non-defining clause",
                    persian = "جمله موصولی توضیحی",
                    pronunciation = "/ˌnɑːn dɪˈfaɪnɪŋ klɔːz/",
                    partOfSpeech = "noun",
                    example = "My brother, who lives in London, is a doctor.",
                    examplePersian = "برادرم، که در لندن زندگی می‌کند، دکتر است.",
                    usageTip = "با کاما."
                ),
                VocabWord(
                    english = "antecedent",
                    persian = "مرجع",
                    pronunciation = "/ˌæntɪˈsiːdənt/",
                    partOfSpeech = "noun",
                    example = "The antecedent is the noun before the relative clause.",
                    examplePersian = "مرجع اسم قبل از جمله موصولی است.",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "restrictive",
                    persian = "محدودکننده",
                    pronunciation = "/rɪˈstrɪktɪv/",
                    partOfSpeech = "adjective",
                    example = "Restrictive clauses are essential to meaning.",
                    examplePersian = "جملات محدودکننده برای معنا ضروری هستند.",
                    usageTip = "مترادف defining."
                ),
                VocabWord(
                    english = "non-restrictive",
                    persian = "غیرمحدودکننده",
                    pronunciation = "/ˌnɑːn rɪˈstrɪktɪv/",
                    partOfSpeech = "adjective",
                    example = "Non-restrictive clauses add extra information.",
                    examplePersian = "جملات غیرمحدودکننده اطلاعات اضافی اضافه می‌کنند.",
                    usageTip = "مترادف non-defining."
                ),
                VocabWord(
                    english = "omit",
                    persian = "حذف کردن",
                    pronunciation = "/əˈmɪt/",
                    partOfSpeech = "verb",
                    example = "The relative pronoun can be omitted here.",
                    examplePersian = "ضمیر موصولی می‌تواند اینجا حذف شود.",
                    usageTip = "در defining clauses."
                ),
                VocabWord(
                    english = "essential",
                    persian = "ضروری",
                    pronunciation = "/ɪˈsenʃəl/",
                    partOfSpeech = "adjective",
                    example = "Essential information is not separated by commas.",
                    examplePersian = "اطلاعات ضروری با کاما جدا نمی‌شود.",
                    usageTip = "در defining clauses."
                ),
                VocabWord(
                    english = "additional",
                    persian = "اضافه",
                    pronunciation = "/əˈdɪʃənəl/",
                    partOfSpeech = "adjective",
                    example = "Additional information is set off with commas.",
                    examplePersian = "اطلاعات اضافی با کاما جدا می‌شود.",
                    usageTip = "در non-defining."
                ),
                VocabWord(
                    english = "modify",
                    persian = "توصیف کردن، تعدیل کردن",
                    pronunciation = "/ˈmɑːdɪfaɪ/",
                    partOfSpeech = "verb",
                    example = "A relative clause modifies a noun.",
                    examplePersian = "جمله موصولی یک اسم را توصیف می‌کند.",
                    wordFamily = "modifier, modification",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "emphasize",
                    persian = "تأکید کردن",
                    pronunciation = "/ˈemfəsaɪz/",
                    partOfSpeech = "verb",
                    example = "Relative clauses can emphasize information.",
                    examplePersian = "جملات موصولی می‌توانند اطلاعات را تأکید کنند.",
                    usageTip = "در کاربردهای بیانی."
                ),
                VocabWord(
                    english = "clarity",
                    persian = "وضوح",
                    pronunciation = "/ˈklærəti/",
                    partOfSpeech = "noun",
                    example = "Relative clauses improve clarity.",
                    examplePersian = "جملات موصولی وضوح را بهتر می‌کنند.",
                    wordFamily = "clear, clearly",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "combine",
                    persian = "ترکیب کردن",
                    pronunciation = "/kəmˈbaɪn/",
                    partOfSpeech = "verb",
                    example = "Relative clauses combine two ideas.",
                    examplePersian = "جملات موصولی دو ایده را ترکیب می‌کنند.",
                    wordFamily = "combination",
                    usageTip = "در ساختار جمله."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "as for",
                    persian = "در مورد",
                    example = "As for the plan, I have doubts.",
                    examplePersian = "در مورد طرح، شک دارم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "when it comes to",
                    persian = "وقتی صحبت از",
                    example = "When it comes to math, she's the best.",
                    examplePersian = "وقتی صحبت از ریاضی می‌شود، او بهترین است.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "the thing is",
                    persian = "موضوع این است که",
                    example = "The thing is, I don't have time.",
                    examplePersian = "موضوع این است که وقت ندارم.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "refer to",
                    meaning = "to mention or describe",
                    persian = "اشاره کردن",
                    example = "The clause refers to the noun before it.",
                    examplePersian = "جمله به اسم قبل از آن اشاره می‌کند."
                ),
                PhrasalVerb(
                    verb = "point to",
                    meaning = "to indicate",
                    persian = "اشاره کردن به",
                    example = "The evidence points to his innocence.",
                    examplePersian = "شواهد به بی‌گناهی او اشاره دارد."
                ),
                PhrasalVerb(
                    verb = "set off",
                    meaning = "to separate",
                    persian = "جدا کردن",
                    example = "Non-defining clauses are set off by commas.",
                    examplePersian = "جملات غیرمحدودکننده با کاما جدا می‌شوند."
                ),
                PhrasalVerb(
                    verb = "add on",
                    meaning = "to include additionally",
                    persian = "اضافه کردن",
                    example = "You can add on more information.",
                    examplePersian = "می‌توانی اطلاعات بیشتری اضافه کنی."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Pauses in non-defining clauses",
                    content = "در non-defining clauses، مکث کوتاه قبل و بعد از جمله:\n• My brother, | who lives in London, | is a doctor."
                ),
                PronunciationTip(
                    title = "No pauses in defining clauses",
                    content = "در defining clauses، بدون مکث:\n• The man who lives next door is friendly."
                ),
                PronunciationTip(
                    title = "Stress on relative pronouns",
                    content = "در گفتار، ضمیر موصولی معمولاً تأکید کمتری دارد:\n• The book that I read was interesting."
                ),
                PronunciationTip(
                    title = "Whose pronunciation",
                    content = "whose /huːz/ — مانند who + z."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Formal vs informal",
                    content = "در انگلیسی غیررسمی، 'that' بیشتر از 'which' استفاده می‌شود، اما در نوشتار رسمی 'which' ترجیح داده می‌شود."
                ),
                CulturalNote(
                    title = "Non-defining clauses in writing",
                    content = "در نوشتار رسمی، non-defining clauses برای اضافه کردن اطلاعات جانبی استفاده می‌شوند: 'The president, who arrived yesterday, will meet with officials.'"
                ),
                CulturalNote(
                    title = "Reduced clauses",
                    content = "در انگلیسی مدرن، reduced relative clauses رایج‌تر شده‌اند: 'The man walking down the street is my uncle.'"
                ),
                CulturalNote(
                    title = "Comma usage",
                    content = "استفاده نادرست از کاما در relative clauses می‌تواند معنی جمله را تغییر دهد."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Relative Pronouns Overview",
                    content = """
ضمایر موصولی:
• who — برای افراد (فاعل)
• whom — برای افراد (مفعول، رسمی)
• whose — برای مالکیت
• which — برای اشیا و حیوانات
• that — برای افراد و اشیا (defining only)
• where — برای مکان
• when — برای زمان
• why — برای دلیل

مثال:
• The man who called you is my uncle.
• The book which I read was good.
• The girl whose father is a doctor is my friend.
• This is the place where we met.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Defining Relative Clauses",
                    content = """
تعریف: اطلاعات ضروری، بدون کاما

قواعد:
• می‌توان از who، which، that استفاده کرد
• ضمیر موصولی می‌تواند حذف شود اگر مفعول باشد
• بدون کاما

مثال:
• The woman who lives next door is a teacher.
• The book (that) I bought yesterday is interesting.
• The house which they built is huge.

نکته حذف:
• فاعل: نمی‌توان حذف کرد
   ❌ The man lives next door is my uncle.
   ✅ The man who lives next door is my uncle.
• مفعول: می‌توان حذف کرد
   ✅ The book I bought is interesting.
   ✅ The book that I bought is interesting.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Non-Defining Relative Clauses",
                    content = """
تعریف: اطلاعات اضافی، با کاما

قواعد:
• who یا which (نه that)
• ضمیر موصولی هرگز حذف نمی‌شود
• با کاما جدا می‌شود
• می‌تواند کل جمله را حذف کرد بدون تغییر معنی اصلی

مثال:
• My brother, who lives in London, is a doctor.
• The Mona Lisa, which was painted by da Vinci, is in the Louvre.
• Paris, where I grew up, is a beautiful city.

توجه: در انگلیسی محاوره‌ای، non-defining رایج‌تر از نوشتار است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Whose and Of Which",
                    content = """
whose — برای افراد و اشیا:

برای افراد:
• The man whose car was stolen called the police.
• She's the girl whose father is a doctor.

برای اشیا (رسمی):
• The house whose roof is red is my aunt's.
یا: The house, the roof of which is red, is my aunt's.

مثال‌های بیشتر:
• The company whose profits doubled last year is expanding.
• The writer whose book won the prize is from Canada.

نکته: whose همیشه به معنای مالکیت است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Reduced Relative Clauses",
                    content = """
حذف ضمیر موصولی + فعل be:

Active:
• The man (who is) standing there is my uncle.
   → The man standing there is my uncle.

Passive:
• The car (which was) stolen was found yesterday.
   → The car stolen was found yesterday.

Present participle (-ing) برای active:
• The woman cooking dinner is my mother.

Past participle (-ed) برای passive:
• The letter written yesterday was important.

نکته: فقط در defining clauses می‌توان کاهش داد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Where, When, Why",
                    content = """
where — برای مکان:
• This is the house where I grew up.
• Paris, where I lived for two years, is beautiful.

when — برای زمان:
• I remember the day when we first met.
• 2020, when the pandemic started, was a difficult year.

why — برای دلیل (معمولاً با reason):
• This is the reason why I left.
• I don't know the reason why she's upset.

نکته: در defining clauses، where/when/why قابل حذف نیستند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Relative Clauses for Emphasis",
                    content = """
Cleft sentences برای تأکید:

It + be + emphasized part + relative clause:
• It was John who broke the window.
• It is the weather that makes me happy.

What + verb + be:
• What I need is a good night's sleep.
• What surprised me was her reaction.

The thing + that:
• The thing that bothers me is the noise.
• The reason that we failed is lack of preparation.

All + that:
• All that matters is health.
• All I want is some peace and quiet.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Errors",
                    content = """
خطاهای رایج:

1. تکرار مفعول:
❌ The book that I bought it yesterday.
✅ The book that I bought yesterday.

2. استفاده از that در non-defining:
❌ My brother, that lives in London, is a doctor.
✅ My brother, who lives in London, is a doctor.

3. حذف نادرست ضمیر موصولی فاعل:
❌ The man lives next door is my uncle.
✅ The man who lives next door is my uncle.

4. استفاده از what به جای that:
❌ The book what I read.
✅ The book that I read. / The book I read.

5. عدم توافق ضمیر:
❌ The company which they are expanding.
✅ The company which is expanding.

6. Where به جای in which:
❌ The situation where I'm in.
✅ The situation I'm in. / The situation in which I am.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "The book that I bought it yesterday.",
                    correct = "The book that I bought yesterday.",
                    explanation = "نباید مفعول را تکرار کرد."
                ),
                CommonMistake(
                    wrong = "My brother, that lives in London, is a doctor.",
                    correct = "My brother, who lives in London, is a doctor.",
                    explanation = "در non-defining از who/which، نه that."
                ),
                CommonMistake(
                    wrong = "The man lives next door is my uncle.",
                    correct = "The man who lives next door is my uncle.",
                    explanation = "در defining clause، ضمیر موصولی فاعل حذف نمی‌شود."
                ),
                CommonMistake(
                    wrong = "The book what I read.",
                    correct = "The book that I read. / The book I read.",
                    explanation = "what به جای that استفاده نمی‌شود."
                ),
                CommonMistake(
                    wrong = "The company which they are expanding.",
                    correct = "The company which is expanding.",
                    explanation = "در defining clause، ضمیر موصولی نقش مفعول یا فاعل دارد."
                ),
                CommonMistake(
                    wrong = "The situation where I'm in.",
                    correct = "The situation I'm in. / The situation in which I am.",
                    explanation = "where برای مکان، نه وضعیت."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Sarah",
                    english = "Have you met the new employee who joined last week?",
                    persian = "کارمند جدیدی که هفته پیش اومده را دیدی؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Yes, the woman who sits next to me. She's very friendly.",
                    persian = "بله، زنی که کنار من می‌نشیند. خیلی خوش‌برخورد است."
                ),
                DialogueLine(
                    speaker = "Sarah",
                    english = "Is she the one whose husband works in finance?",
                    persian = "همونیه که شوهرش در امور مالی کار می‌کند؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Yes, that's her. She's from Chicago, where she studied engineering.",
                    persian = "بله، همونه. اهل شیکاگوئه، جایی که مهندسی خونده."
                ),
                DialogueLine(
                    speaker = "Sarah",
                    english = "Impressive! Do you know which team she's joining?",
                    persian = "تحسین‌برانگیزه! می‌دونی به کدوم تیم می‌پیونده؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "The team that handles new products. The one which I used to work with.",
                    persian = "تیمی که محصولات جدید را مدیریت می‌کند. همون که قبلاً باهاش کار می‌کردم."
                ),
                DialogueLine(
                    speaker = "Sarah",
                    english = "That's a great team. I heard they have a new project starting soon.",
                    persian = "تیم عالیه. شنیدم پروژه جدیدی به‌زودی شروع می‌کنند."
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Yes, the project which they've been planning for months.",
                    persian = "بله، پروژه‌ای که ماه‌هاست برنامه‌ریزی می‌کنند."
                ),
                DialogueLine(
                    speaker = "Sarah",
                    english = "What kind of project is it?",
                    persian = "چه نوع پروژه‌ایه؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Something related to AI, which is a field she specializes in.",
                    persian = "چیزی مرتبط با هوش مصنوعی، که رشته‌ایه که او درش تخصص داره."
                ),
                DialogueLine(
                    speaker = "Sarah",
                    english = "Perfect fit then. Anyone else joining?",
                    persian = "پس انتخاب مناسبیه. کس دیگه‌ای هم می‌پیونده؟"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "A few others. One of them is a developer whose work I really admire.",
                    persian = "چند نفر دیگه. یکیشون یه برنامه‌نویسه که کارش را واقعاً تحسین می‌کنم."
                ),
                DialogueLine(
                    speaker = "Sarah",
                    english = "It sounds like a strong team.",
                    persian = "تیم قوی‌ای به نظر می‌رسه."
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Yes. The company that hired them is investing heavily in innovation.",
                    persian = "بله. شرکتی که استخدامشون کرده، به‌شدت روی نوآوری سرمایه‌گذاری می‌کنه."
                ),
                DialogueLine(
                    speaker = "Sarah",
                    english = "Good to know. Maybe I should look into opportunities there.",
                    persian = "خوبه که می‌دونم. شاید باید فرصت‌های اونجا را بررسی کنم."
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "You should! It's a place where people can really grow.",
                    persian = "باید بکنی! جاییه که افراد می‌تونن واقعاً رشد کنن."
                ),
                DialogueLine(
                    speaker = "Sarah",
                    english = "Thanks for the tip!",
                    persian = "ممنون برای راهنمایی!"
                ),
                DialogueLine(
                    speaker = "Tom",
                    english = "Anytime!",
                    persian = "هر وقت!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Who is the new employee?",
                    answer = "A woman whose husband works in finance, from Chicago."
                ),
                ComprehensionQuestion(
                    question = "Where did she study engineering?",
                    answer = "In Chicago."
                ),
                ComprehensionQuestion(
                    question = "Which team is she joining?",
                    answer = "The team that handles new products."
                ),
                ComprehensionQuestion(
                    question = "What field is the new project related to?",
                    answer = "AI (artificial intelligence)."
                ),
                ComprehensionQuestion(
                    question = "What kind of developer is joining?",
                    answer = "A developer whose work Tom admires."
                ),
                ComprehensionQuestion(
                    question = "Why does Tom recommend the company?",
                    answer = "Because it's a place where people can really grow."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe a person who has influenced you.",
                    promptPersian = "توصیف کن کسی که بر تو تأثیر گذاشته.",
                    hints = "Use: The person who..., A teacher whose..., Someone that..."
                ),
                SpeakingTask(
                    prompt = "Talk about a place that means a lot to you.",
                    promptPersian = "درباره جایی که برایت خیلی مهم است صحبت کن.",
                    hints = "Use: The place where..., A city which..., A house that..."
                ),
                SpeakingTask(
                    prompt = "Describe an experience that changed your life.",
                    promptPersian = "تجربه‌ای که زندگی‌ات را تغییر داد را توصیف کن.",
                    hints = "Use: The day when..., An event that..., Something which..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a descriptive essay (about 200 words) about an important person, place, or event in your life. Use both defining and non-defining relative clauses.",
                    promptPersian = "یه مقاله توصیفی بنویس (حدود ۲۰۰ کلمه) درباره یه فرد، مکان یا رویداد مهم در زندگی‌ات. از هر دو نوع جمله موصولی استفاده کن.",
                    wordCount = 200,
                    hints = "Structure:\n1. Introduction with defining clause\n2. Description with multiple clauses\n3. Non-defining clauses for extra info\n4. Conclusion"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: The man ___ called you is my uncle.",
                    options = listOf("which", "who", "whose", "where"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The book ___ I read was interesting.",
                    options = listOf("who", "which", "whose", "where"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: My brother, ___ lives in London, is a doctor.",
                    options = listOf("that", "who", "which", "whose"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "The book that I bought it yesterday.",
                        "The book that I bought yesterday.",
                        "The book what I bought yesterday.",
                        "The book which I bought it yesterday."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: This is the house ___ I grew up.",
                    options = listOf("which", "who", "where", "whose"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: She's the girl ___ father is a doctor.",
                    options = listOf("who", "which", "whose", "that"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "In which type of clause can the relative pronoun be omitted?",
                    options = listOf(
                        "Non-defining clauses",
                        "Defining clauses when the pronoun is the object",
                        "Both types",
                        "Neither type"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: All ___ I want is some peace.",
                    options = listOf("which", "who", "that", "whose"),
                    correctIndex = 2
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 6 — Gerunds and Infinitives (Advanced)
    // ============================================================
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Gerunds and Infinitives",
            titlePersian = "اسم مصدر و مصدر پیشرفته",
            objectives = listOf(
                "Master when to use gerunds vs infinitives.",
                "Understand verbs that take both forms.",
                "Use perfect gerunds and infinitives.",
                "Apply gerunds and infinitives in different contexts.",
                "Avoid common errors."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "gerund",
                    persian = "اسم مصدر (verb-ing)",
                    pronunciation = "/ˈdʒerənd/",
                    partOfSpeech = "noun",
                    example = "Swimming is good exercise.",
                    examplePersian = "شنا کردن ورزش خوبیه.",
                    usageTip = "verb + ing به عنوان اسم."
                ),
                VocabWord(
                    english = "infinitive",
                    persian = "مصدر (to + verb)",
                    pronunciation = "/ɪnˈfɪnətɪv/",
                    partOfSpeech = "noun",
                    example = "I want to swim.",
                    examplePersian = "می‌خواهم شنا کنم.",
                    usageTip = "to + base verb."
                ),
                VocabWord(
                    english = "bare infinitive",
                    persian = "مصدر بدون to",
                    pronunciation = "/ber ɪnˈfɪnətɪv/",
                    partOfSpeech = "noun",
                    example = "She can swim. (بدون to)",
                    examplePersian = "او می‌تواند شنا کند.",
                    usageTip = "بعد از modals."
                ),
                VocabWord(
                    english = "preposition",
                    persian = "حرف اضافه",
                    pronunciation = "/ˌprepəˈzɪʃən/",
                    partOfSpeech = "noun",
                    example = "I'm interested in learning.",
                    examplePersian = "علاقه‌مند به یادگیری هستم.",
                    usageTip = "بعد از حرف اضافه، gerund می‌آید."
                ),
                VocabWord(
                    english = "purpose",
                    persian = "هدف",
                    pronunciation = "/ˈpɜːrpəs/",
                    partOfSpeech = "noun",
                    example = "I went to the store to buy bread.",
                    examplePersian = "برای خرید نان به فروشگاه رفتم.",
                    usageTip = "با infinitive of purpose."
                ),
                VocabWord(
                    english = "perception verb",
                    persian = "فعل ادراکی",
                    pronunciation = "/pərˈsepʃən vɜːrb/",
                    partOfSpeech = "noun",
                    example = "I saw him leaving. / I saw him leave.",
                    examplePersian = "او را دیدم که می‌رفت.",
                    usageTip = "با gerund یا bare infinitive."
                ),
                VocabWord(
                    english = "remember/forget",
                    persian = "به یاد آوردن/فراموش کردن",
                    pronunciation = "/rɪˈmembər fərˈɡet/",
                    partOfSpeech = "verb",
                    example = "I remember locking the door.",
                    examplePersian = "یادم هست که در را قفل کردم.",
                    usageTip = "با gerund (خاطره) یا infinitive (وظیفه)."
                ),
                VocabWord(
                    english = "try",
                    persian = "امتحان کردن",
                    pronunciation = "/traɪ/",
                    partOfSpeech = "verb",
                    example = "Try calling him.",
                    examplePersian = "امتحان کن بهش زنگ بزنی.",
                    usageTip = "با gerund (تجربه) یا infinitive (تلاش)."
                ),
                VocabWord(
                    english = "stop",
                    persian = "متوقف کردن",
                    pronunciation = "/stɑːp/",
                    partOfSpeech = "verb",
                    example = "Stop talking!",
                    examplePersian = "صحبت را متوقف کن!",
                    usageTip = "با gerund (متوقف کردن) یا infinitive (برای شروع کار دیگر)."
                ),
                VocabWord(
                    english = "go on",
                    persian = "ادامه دادن",
                    pronunciation = "/ɡoʊ ɑːn/",
                    partOfSpeech = "verb",
                    example = "She went on talking.",
                    examplePersian = "او به صحبت کردن ادامه داد.",
                    usageTip = "با gerund (ادامه) یا infinitive (شروع کار جدید)."
                ),
                VocabWord(
                    english = "regret",
                    persian = "پشیمان بودن",
                    pronunciation = "/rɪˈɡret/",
                    partOfSpeech = "verb",
                    example = "I regret saying that.",
                    examplePersian = "پشیمانم که آن را گفتم.",
                    usageTip = "با gerund (پشیمانی از گذشته) یا infinitive (اطلاع دادن)."
                ),
                VocabWord(
                    english = "mean",
                    persian = "معنی داشتن",
                    pronunciation = "/miːn/",
                    partOfSpeech = "verb",
                    example = "This means going there.",
                    examplePersian = "این یعنی رفتن به آنجا.",
                    usageTip = "با gerund (نتیجه) یا infinitive (قصد)."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "worth doing",
                    persian = "ارزش انجام دادن",
                    example = "This book is worth reading.",
                    examplePersian = "این کتاب ارزش خواندن دارد.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "have difficulty doing",
                    persian = "مشکل داشتن در انجام",
                    example = "I have difficulty understanding him.",
                    examplePersian = "در فهمیدن او مشکل دارم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "look forward to doing",
                    persian = "بی‌صبرانه منتظر انجام بودن",
                    example = "I look forward to meeting you.",
                    examplePersian = "بی‌صبرانه منتظر دیدنت هستم.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "give up",
                    meaning = "to stop doing something",
                    persian = "ترک کردن",
                    example = "He gave up smoking.",
                    examplePersian = "او سیگار را ترک کرد."
                ),
                PhrasalVerb(
                    verb = "put off",
                    meaning = "to postpone",
                    persian = "به تعویق انداختن",
                    example = "Don't put off studying.",
                    examplePersian = "درس خواندن را به تعویق نینداز."
                ),
                PhrasalVerb(
                    verb = "keep on",
                    meaning = "to continue",
                    persian = "ادامه دادن",
                    example = "Keep on trying!",
                    examplePersian = "به تلاش ادامه بده!"
                ),
                PhrasalVerb(
                    verb = "end up",
                    meaning = "to finally do something",
                    persian = "در نهایت انجام دادن",
                    example = "I ended up staying home.",
                    examplePersian = "در نهایت خانه ماندم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Reduced 'to' in speech",
                    content = "در گفتار طبیعی، to اغلب به صورت schwa /tə/ تلفظ می‌شود:\n• want to go → /wɑːnə ɡoʊ/"
                ),
                PronunciationTip(
                    title = "Stress on -ing",
                    content = "در gerunds، -ing تأکید کمتری دارد ولی واضح تلفظ می‌شود:\n• I enjoy READING."
                ),
                PronunciationTip(
                    title = "Linking between verb and gerund/infinitive",
                    content = "در گفتار طبیعی، فعل اصلی به gerund یا infinitive می‌چسبد:\n• want-to → wanna\n• going-to → gonna"
                ),
                PronunciationTip(
                    title = "Contrastive stress",
                    content = "در مقایسه، gerund یا infinitive تأکید می‌گیرد:\n• I said STOP TALKING, not STOP TO TALK."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Politeness in requests",
                    content = "در درخواست‌های مؤدبانه، از infinitive استفاده می‌شود: 'I'd like to ask you something.'"
                ),
                CulturalNote(
                    title = "Formal vs informal",
                    content = "در انگلیسی رسمی، 'recommend doing' رایج است؛ در غیررسمی، 'recommend that you do'"
                ),
                CulturalNote(
                    title = "Verbs with different meanings",
                    content = "برخی افعال با gerund و infinitive معانی متفاوتی دارند: remember, forget, try, stop"
                ),
                CulturalNote(
                    title = "Academic style",
                    content = "در مقالات آکادمیک، gerunds و infinitives به‌طور گسترده استفاده می‌شوند: 'The purpose of this study is to examine...'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Gerunds and Infinitives Overview",
                    content = """
Gerund: verb + ing (به عنوان اسم):
• Swimming is fun.
• I enjoy reading.

Infinitive: to + base verb:
• I want to swim.
• She decided to stay.

Bare infinitive: base verb (بدون to):
• I can swim.
• Let me go.

نکته: انتخاب بین gerund و infinitive بستگی به فعل اصلی دارد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Verbs + Gerund",
                    content = """
افعالی که با gerund می‌آیند:

enjoy, avoid, admit, deny, consider, suggest, recommend, mind, finish, keep, practice, imagine, delay, postpone, risk, tolerate, resist, appreciate, miss

مثال:
• I enjoy reading.
• She avoids driving at night.
• He admitted stealing the money.
• They suggested going out.
• Would you mind helping me?

نکته: این افعال هرگز با infinitive نمی‌آیند:
❌ I enjoy to read.
✅ I enjoy reading.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Verbs + Infinitive",
                    content = """
افعالی که با infinitive می‌آیند:

want, need, decide, hope, plan, expect, agree, refuse, promise, offer, manage, afford, forget, learn, teach, pretend, seem, appear, tend

مثال:
• I want to travel.
• She decided to stay.
• He promised to help.
• They agreed to come.
• She managed to finish on time.

نکته: این افعال هرگز با gerund نمی‌آیند:
❌ I want traveling.
✅ I want to travel.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Verbs + Object + Infinitive",
                    content = """
ساختار: verb + object + to infinitive

افعال رایج:
tell, ask, advise, encourage, remind, warn, allow, permit, expect, want, invite, force, persuade, teach, order

مثال:
• She told me to wait.
• He asked me to help.
• They encouraged us to try.
• I reminded him to call.
• She warned me not to go.

نکته: ساختار با object متفاوت است از ساختار بدون object.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Preposition + Gerund",
                    content = """
بعد از حرف اضافه، همیشه gerund می‌آید:

مثال:
• I'm interested in learning languages.
• She's good at cooking.
• He's afraid of flying.
• I'm tired of waiting.
• They're thinking about moving.
• She insisted on paying.

ترکیب‌های رایج:
• look forward to + gerund
• be used to + gerund
• object to + gerund
• insist on + gerund
• apologize for + gerund
• succeed in + gerund

نکته: به to در look forward to دقت کنید — این to حرف اضافه است، نه نشانه infinitive.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Verbs with Both Forms (Different Meanings)",
                    content = """
برخی افعال با gerund و infinitive معانی متفاوتی دارند:

remember:
• I remember locking the door. (یادم هست که قفل کردم)
• I remembered to lock the door. (یادم آمد قفل کنم)

forget:
• I'll never forget meeting her. (خاطره)
• I forgot to call her. (وظیفه)

try:
• Try calling him. (امتحان کن)
• Try to call him. (تلاش کن)

stop:
• Stop talking! (صحبت را متوقف کن)
• I stopped to talk. (متوقف شدم تا صحبت کنم)

go on:
• She went on talking. (ادامه داد)
• She went on to talk about... (شروع کرد به صحبت درباره)

regret:
• I regret saying that. (پشیمانم)
• I regret to inform you... (با تأسف اطلاع می‌دهم)

mean:
• This means going there. (یعنی رفتن)
• I meant to call you. (قصد داشتم)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Perfect Gerunds and Infinitives",
                    content = """
Perfect gerund: having + past participle
• I regret having said that.
• She admitted having made a mistake.
• He denied having stolen the money.

Perfect infinitive: to have + past participle
• I'm glad to have met you.
• She seems to have forgotten.
• He claims to have finished the work.

برای رویدادهای گذشته:
• Simple gerund: focuses on action
  I remember meeting him. (خاطره کلی)
• Perfect gerund: emphasizes completion
  I remember having met him. (تأکید بر اتمام)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Patterns and Structures",
                    content = """
الگوهای رایج:

It + be + adjective + to infinitive:
• It's important to exercise.
• It was nice to see you.

Adjective + to infinitive:
• I'm happy to help.
• She's ready to leave.

Noun + to infinitive:
• I have a lot of work to do.
• There's nothing to worry about.

Too + adjective + to infinitive:
• He's too young to drive.
• It's too hot to go out.

Adjective + enough + to infinitive:
• She's old enough to vote.
• It's warm enough to swim.

Why + bare infinitive:
• Why wait?
• Why not try?

نکته: این الگوها را باید حفظ کرد و به‌طور طبیعی به کار برد.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I enjoy to read.",
                    correct = "I enjoy reading.",
                    explanation = "enjoy با gerund می‌آید."
                ),
                CommonMistake(
                    wrong = "I want traveling.",
                    correct = "I want to travel.",
                    explanation = "want با infinitive می‌آید."
                ),
                CommonMistake(
                    wrong = "I'm interested in to learn languages.",
                    correct = "I'm interested in learning languages.",
                    explanation = "بعد از حرف اضافه، gerund."
                ),
                CommonMistake(
                    wrong = "I look forward to see you.",
                    correct = "I look forward to seeing you.",
                    explanation = "look forward to + gerund."
                ),
                CommonMistake(
                    wrong = "She told me wait.",
                    correct = "She told me to wait.",
                    explanation = "tell + object + to infinitive."
                ),
                CommonMistake(
                    wrong = "I'm used to get up early.",
                    correct = "I'm used to getting up early.",
                    explanation = "be used to + gerund."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Emma",
                    english = "Do you enjoy working from home?",
                    persian = "از کار کردن از خانه لذت می‌بری؟"
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "Mostly, yes. I like not having to commute.",
                    persian = "بیشتر بله. دوست دارم مجبور به رفت‌وآمد نباشم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I can imagine. What do you miss about the office?",
                    persian = "می‌تونم تصور کنم. چی رو از دفتر دلت می‌خواد؟"
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "Seeing my colleagues in person. And being able to ask quick questions.",
                    persian = "دیدن حضوری همکارانم. و توانایی پرسیدن سریع سؤال‌ها."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Have you tried meeting up with them after work?",
                    persian = "امتحان کردی بعد از کار با اون‌ها ببینی؟"
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "Yes, we try to meet once a month. It's worth doing.",
                    persian = "بله، ماهی یک بار سعی می‌کنیم ببینیم. ارزش انجام دادن دارد."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "That's a good idea. Do you plan to keep working remotely?",
                    persian = "ایده خوبیه. برنامه داری به دورکاری ادامه بدی؟"
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "For now, yes. But I'm considering going back to the office part-time.",
                    persian = "فعلاً بله. ولی دارم به بازگشت نیمه‌وقت به دفتر فکر می‌کنم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "That might be the best of both worlds.",
                    persian = "شاید بهترین از هر دو دنیا باشه."
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "Exactly. I'd hate to lose the flexibility I've gotten used to.",
                    persian = "دقیقاً. دوست ندارم انعطافی که بهش عادت کرده‌ام از دست بدم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "I understand. Did you have difficulty adjusting at first?",
                    persian = "می‌فهمم. اولش در سازگاری مشکل داشتی؟"
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "Yes, especially remembering to take breaks.",
                    persian = "بله، مخصوصاً یادم رفتن استراحت کردن."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "That's common. Do you find it easy to stop working at the end of the day?",
                    persian = "این رایجه. برات آسونه که پایان روز کار را متوقف کنی؟"
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "Not always. I sometimes forget to stop working.",
                    persian = "نه همیشه. گاهی فراموش می‌کنم کار را متوقف کنم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "You should try setting a specific time to log off.",
                    persian = "باید امتحان کنی یه زمان مشخص برای خروج تعیین کنی."
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "That's a good suggestion. I'll try doing that starting tomorrow.",
                    persian = "پیشنهاد خوبیه. از فردا امتحان می‌کنم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Good luck! Let me know how it goes.",
                    persian = "موفق باشی! خبرم کن چطور پیش می‌ره."
                ),
                DialogueLine(
                    speaker = "Liam",
                    english = "Thanks! I appreciate you listening.",
                    persian = "ممنون! قدردانی می‌کنم که گوش دادی."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Does Liam enjoy working from home?",
                    answer = "Mostly yes. He likes not having to commute."
                ),
                ComprehensionQuestion(
                    question = "What does Liam miss about the office?",
                    answer = "Seeing colleagues in person and asking quick questions."
                ),
                ComprehensionQuestion(
                    question = "What does Liam plan to do?",
                    answer = "He plans to keep working remotely for now but is considering going back part-time."
                ),
                ComprehensionQuestion(
                    question = "What did Liam have difficulty with at first?",
                    answer = "Remembering to take breaks."
                ),
                ComprehensionQuestion(
                    question = "What does Emma suggest?",
                    answer = "Setting a specific time to log off."
                ),
                ComprehensionQuestion(
                    question = "What does Liam decide to try?",
                    answer = "Setting a specific time to log off, starting tomorrow."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about activities you enjoy doing.",
                    promptPersian = "درباره فعالیت‌هایی که از انجامشان لذت می‌بری صحبت کن.",
                    hints = "Use: I enjoy..., I love..., I'm interested in..."
                ),
                SpeakingTask(
                    prompt = "Discuss your goals for the future.",
                    promptPersian = "درباره اهدافت برای آینده صحبت کن.",
                    hints = "Use: I want to..., I plan to..., I hope to..."
                ),
                SpeakingTask(
                    prompt = "Talk about what you miss doing and what you've stopped doing.",
                    promptPersian = "درباره کارهایی که دلت می‌خواهد انجام دهی و کارهایی که ترک کرده‌ای صحبت کن.",
                    hints = "Use: I miss..., I stopped..., I gave up..., I look forward to..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your daily routine and preferences (about 200 words). Use at least 10 different verb + gerund/infinitive structures.",
                    promptPersian = "درباره روتین روزانه و ترجیحاتت بنویس (حدود ۲۰۰ کلمه). حداقل ۱۰ ساختار مختلف فعل + gerund/infinitive به کار ببر.",
                    wordCount = 200,
                    hints = "Include:\n- Things you enjoy doing\n- Things you want to do\n- Things you've stopped\n- Things you look forward to"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I enjoy ___ books.",
                    options = listOf("read", "to read", "reading", "reads"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: I want ___ travel.",
                    options = listOf("to", "for", "at", "in"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: I'm interested ___ learning languages.",
                    options = listOf("on", "in", "at", "for"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I look forward to ___ you.",
                    options = listOf("see", "seeing", "saw", "seen"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What's the difference between 'I remember locking the door' and 'I remember to lock the door'?",
                    options = listOf(
                        "No difference",
                        "First is a memory, second is a task to complete",
                        "First is future, second is past",
                        "First is formal, second is informal"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She told me ___ wait.",
                    options = listOf("to", "for", "at", "in"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: I regret ___ that.",
                    options = listOf("say", "saying", "to say", "says"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I'm used to ___ up early.",
                    options = listOf("get", "getting", "to get", "gets"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 7 — Subjunctive and Wish
    // ============================================================
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Subjunctive and Wish",
            titlePersian = "وجه وصفی و آرزو",
            objectives = listOf(
                "Use subjunctive mood in formal English.",
                "Express wishes and regrets with wish/if only.",
                "Use would rather, would prefer, would like.",
                "Distinguish between hope and wish.",
                "Use it's time and it's high time."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "subjunctive",
                    persian = "وجه وصفی",
                    pronunciation = "/səbˈdʒʌŋktɪv/",
                    partOfSpeech = "noun",
                    example = "The subjunctive is common in formal English.",
                    examplePersian = "وجه وصفی در انگلیسی رسمی رایجه.",
                    usageTip = "در دستورها و آرزوها."
                ),
                VocabWord(
                    english = "mood",
                    persian = "وجه",
                    pronunciation = "/muːd/",
                    partOfSpeech = "noun",
                    example = "Indicative, imperative, and subjunctive are moods.",
                    examplePersian = "اخباری، امری و وجه وصفی وجه‌ها هستند.",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "indicative",
                    persian = "اخباری",
                    pronunciation = "/ɪnˈdɪkətɪv/",
                    partOfSpeech = "adjective",
                    example = "The indicative mood is used for facts.",
                    examplePersian = "وجه اخباری برای حقایق استفاده می‌شود.",
                    usageTip = "در مقابل subjunctive."
                ),
                VocabWord(
                    english = "wish",
                    persian = "آرزو کردن",
                    pronunciation = "/wɪʃ/",
                    partOfSpeech = "verb",
                    example = "I wish I had more time.",
                    examplePersian = "ای کاش وقت بیشتری داشتم.",
                    usageTip = "برای فرضیات."
                ),
                VocabWord(
                    english = "regret",
                    persian = "پشیمانی",
                    pronunciation = "/rɪˈɡret/",
                    partOfSpeech = "noun",
                    example = "My only regret is not studying harder.",
                    examplePersian = "تنها پشیمانی‌ام درس نخواندن بیشتر است.",
                    wordFamily = "regretful, regrettable",
                    usageTip = "با wish + past perfect."
                ),
                VocabWord(
                    english = "hypothetical",
                    persian = "فرضی",
                    pronunciation = "/ˌhaɪpəˈθetɪkəl/",
                    partOfSpeech = "adjective",
                    example = "This is a hypothetical situation.",
                    examplePersian = "این یه وضعیت فرضیه.",
                    wordFamily = "hypothesis, hypothesize",
                    usageTip = "با wish."
                ),
                VocabWord(
                    english = "unreal",
                    persian = "غیرواقعی",
                    pronunciation = "/ˌʌnˈriːəl/",
                    partOfSpeech = "adjective",
                    example = "Wish + past expresses unreal present.",
                    examplePersian = "wish + past حال غیرواقعی را بیان می‌کند.",
                    usageTip = "در wish."
                ),
                VocabWord(
                    english = "insist",
                    persian = "اصرار کردن",
                    pronunciation = "/ɪnˈsɪst/",
                    partOfSpeech = "verb",
                    example = "She insisted that he be present.",
                    examplePersian = "او اصرار کرد که او حاضر باشد.",
                    usageTip = "با subjunctive."
                ),
                VocabWord(
                    english = "demand",
                    persian = "درخواست کردن، طلبیدن",
                    pronunciation = "/dɪˈmænd/",
                    partOfSpeech = "verb",
                    example = "They demanded that he resign.",
                    examplePersian = "آن‌ها خواستار استعفای او شدند.",
                    usageTip = "با subjunctive."
                ),
                VocabWord(
                    english = "recommend",
                    persian = "توصیه کردن",
                    pronunciation = "/ˌrekəˈmend/",
                    partOfSpeech = "verb",
                    example = "I recommend that she see a doctor.",
                    examplePersian = "توصیه می‌کنم که او دکتر ببیند.",
                    usageTip = "با subjunctive."
                ),
                VocabWord(
                    english = "essential",
                    persian = "ضروری",
                    pronunciation = "/ɪˈsenʃəl/",
                    partOfSpeech = "adjective",
                    example = "It's essential that everyone be present.",
                    examplePersian = "ضروری است که همه حاضر باشند.",
                    usageTip = "با subjunctive."
                ),
                VocabWord(
                    english = "crucial",
                    persian = "حیاتی",
                    pronunciation = "/ˈkruːʃəl/",
                    partOfSpeech = "adjective",
                    example = "It's crucial that we act now.",
                    examplePersian = "حیاتی است که همین حالا اقدام کنیم.",
                    usageTip = "با subjunctive."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "if only",
                    persian = "ای کاش",
                    example = "If only I had known!",
                    examplePersian = "ای کاش می‌دانستم!",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "I'd rather",
                    persian = "ترجیح می‌دهم",
                    example = "I'd rather you didn't smoke.",
                    examplePersian = "ترجیح می‌دهم سیگار نکشی.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "it's high time",
                    persian = "دیگر وقتش رسیده",
                    example = "It's high time you found a job.",
                    examplePersian = "دیگر وقتش رسیده شغل پیدا کنی.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "long for",
                    meaning = "to wish for strongly",
                    persian = "اشتیاق داشتن به",
                    example = "She longed for a better life.",
                    examplePersian = "او به زندگی بهتری اشتیاق داشت."
                ),
                PhrasalVerb(
                    verb = "yearn for",
                    meaning = "to want deeply",
                    persian = "آرزو داشتن",
                    example = "He yearned for his homeland.",
                    examplePersian = "او آرزوی وطنش را داشت."
                ),
                PhrasalVerb(
                    verb = "dream of",
                    meaning = "to hope for",
                    persian = "در رویا داشتن",
                    example = "I dream of living abroad.",
                    examplePersian = "من در رویا دارم که در خارج زندگی کنم."
                ),
                PhrasalVerb(
                    verb = "settle for",
                    meaning = "to accept less",
                    persian = "قانع شدن به کمتر",
                    example = "I won't settle for less.",
                    examplePersian = "به کمتر قانع نمی‌شوم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Subjunctive 'be' stress",
                    content = "در subjunctive، be/base verb تأکید می‌گیرد:\n• I insist that he BE present.\n• It's essential that she GO now."
                ),
                PronunciationTip(
                    title = "Wish + past pronunciation",
                    content = "در wish، فعل گذشته ضعیف تلفظ می‌شود:\n• I wish I were → /aɪ wɪʃ aɪ wər/"
                ),
                PronunciationTip(
                    title = "Would rather contractions",
                    content = "در گفتار:\n• I'd rather → /aɪd ˈræðər/\n• She'd rather → /ʃiːd ˈræðər/"
                ),
                PronunciationTip(
                    title = "Stress in regret",
                    content = "در ابراز پشیمانی، تأکید روی فعل اصلی:\n• I wish I HAD STUDIED."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Subjunctive in formal English",
                    content = "در انگلیسی آمریکایی، subjunctive رایج‌تر است: 'I suggest that he go.' در بریتانیایی، should اضافه می‌شود: 'I suggest that he should go.'"
                ),
                CulturalNote(
                    title = "Wish in daily conversation",
                    content = "انگلیسی‌زبانان زیاد از wish برای ابراز آرزو یا پشیمانی استفاده می‌کنند: 'I wish I could come.'"
                ),
                CulturalNote(
                    title = "Would rather vs prefer",
                    content = "would rather غیررسمی‌تر از would prefer است: 'I'd rather stay home' vs 'I'd prefer to stay home.'"
                ),
                CulturalNote(
                    title = "Hope vs wish",
                    content = "Hope برای موقعیت‌های واقعی، wish برای فرضیات غیرممکن: 'I hope it rains' vs 'I wish it would rain.'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Subjunctive Mood: Overview",
                    content = """
وجه وصفی (Subjunctive) برای بیان خواسته، پیشنهاد، ضرورت و فرضیات غیرواقعی.

ساختار: همان شکل ساده فعل برای همه اشخاص:
• I insist that she BE present.
• It's essential that he COME early.
• They demanded that she LEAVE.

در انگلیسی مدرن، بیشتر با:
• certain verbs: suggest, demand, insist, recommend, request, propose
• certain adjectives: essential, crucial, important, vital, necessary
• expressions: it's time, it's important

نکته: در انگلیسی آمریکایی رایج‌تر، در بریتانیایی less common.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Subjunctive after Certain Verbs",
                    content = """
افعالی که subjunctive می‌گیرند:

suggest, recommend, propose, demand, insist, request, urge, command, order, ask, desire, prefer, require

ساختار: verb + that + subject + base verb

مثال:
• I suggest that he go.
• She recommends that we be careful.
• They demanded that he resign.
• The doctor insisted that she stay in bed.
• He requested that we not be late.

منفی: not + base verb
• I suggest that he not go.
• She insisted that they not leave.

نکته: در انگلیسی بریتانیایی، اغلب should اضافه می‌شود:
• I suggest that he should go.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Subjunctive after Adjectives",
                    content = """
ساختار: it's + adjective + that + subject + base verb

صفات رایج:
essential, crucial, important, vital, necessary, imperative, advisable, desirable, urgent

مثال:
• It's essential that everyone be present.
• It's crucial that we act now.
• It's important that he arrive on time.
• It's necessary that she see a doctor.
• It's vital that they know the truth.

منفی:
• It's essential that he not be late.
• It's important that she not forget.

نکته: ساختار رسمی و ادبی است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Wish + Past Simple",
                    content = """
برای آرزو در حال یا وضعیت غیرواقعی:

ساختار: wish + past simple

مثال:
• I wish I had more time.
• She wishes she could travel.
• He wishes he knew the answer.
• They wish they lived by the sea.

با be: از were برای همه اشخاص استفاده می‌کنیم:
• I wish I were taller.
• She wishes she were younger.
• They wish it were summer.

نکته: در انگلیسی محاوره‌ای، was هم رایج است:
• I wish I was taller. (غیررسمی)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Wish + Past Perfect",
                    content = """
برای پشیمانی از گذشته:

ساختار: wish + past perfect

مثال:
• I wish I had studied harder.
• She wishes she hadn't said that.
• He wishes he had taken the job.
• They wish they had known earlier.

معنی: پشیمانی یا آرزوی تغییر گذشته

مثال با مثال:
• "I failed the exam." 
  "I wish I had studied more."
• "I missed the flight."
  "I wish I had left earlier."

نکته: این ساختار رایج‌ترین کاربرد wish است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Wish + Would",
                    content = """
برای شکایت از رفتار یا وضعیت در حال:

ساختار: wish + would + base verb

مثال:
• I wish you would stop smoking.
• She wishes he would listen more.
• They wish it would stop raining.
• I wish you would call me more often.

کاربردها:
1. شکایت از رفتار دیگران
2. آرزوی تغییر وضعیت
3. آرزوی توقف چیزی

نکته: با wish + would، فقط می‌توان از اشخاص سوم یا it استفاده کرد (نه I/we):
❌ I wish I would stop smoking.
✅ I wish I could stop smoking.
✅ I wish you would stop smoking.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Would Rather / Would Prefer",
                    content = """
Would rather: ترجیح دادن
ساختار: would rather + base verb (بدون to)

• I'd rather stay home tonight.
• She'd rather walk than drive.
• They'd rather not go.

با than برای مقایسه:
• I'd rather read than watch TV.

با subject متفاوت (subjunctive):
• I'd rather you didn't smoke here.
• She'd rather he came later.

Would prefer: ترجیح دادن
ساختار: would prefer + to infinitive یا gerund

• I'd prefer to stay home.
• She'd prefer not to go.
• They'd prefer walking.

با that clause:
• I'd prefer that you not smoke.
• I'd prefer it if you didn't smoke.

نکته: would rather غیررسمی‌تر، would prefer رسمی‌تر.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. It's Time, If Only, As If",
                    content = """
It's time / It's high time:
ساختار: it's (high) time + past simple

• It's time you went to bed.
• It's high time she found a job.
• It's time we left.

معنی: وقتش رسیده که کاری انجام شود.

If only:
برای آرزوی قوی‌تر از wish:

• If only I had more time! (حال)
• If only I had studied! (گذشته)
• If only he would listen! (شکایت)

As if / As though:
ساختار: as if + past simple (unreal)

• He talks as if he knew everything.
• She acts as if she were the boss.

نکته: as if + past simple برای موقعیت‌های غیرواقعی.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I suggest that he goes.",
                    correct = "I suggest that he go.",
                    explanation = "در subjunctive از base verb استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "It's essential that he comes early.",
                    correct = "It's essential that he come early.",
                    explanation = "Subjunctive: base verb بدون s."
                ),
                CommonMistake(
                    wrong = "I wish I have more time.",
                    correct = "I wish I had more time.",
                    explanation = "wish + past simple."
                ),
                CommonMistake(
                    wrong = "I wish I would study harder.",
                    correct = "I wish I had studied harder.",
                    explanation = "برای گذشته، wish + past perfect."
                ),
                CommonMistake(
                    wrong = "I wish I would stop smoking.",
                    correct = "I wish I could stop smoking.",
                    explanation = "با wish + would، نمی‌توان از I استفاده کرد."
                ),
                CommonMistake(
                    wrong = "It's time you go to bed.",
                    correct = "It's time you went to bed.",
                    explanation = "it's time + past simple."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Sara",
                    english = "I wish I had more free time.",
                    persian = "ای کاش وقت آزاد بیشتری داشتم."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "Me too. I'd rather have more time than more money.",
                    persian = "منم همینطور. ترجیح می‌دهم وقت بیشتری داشته باشم تا پول بیشتر."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Do you regret not taking a break earlier?",
                    persian = "پشیمان هستی که زودتر استراحت نکردی؟"
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "I wish I had slowed down a few years ago.",
                    persian = "ای کاش چند سال پیش سرعتم را کم کرده بودم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "It's never too late. I suggest that you plan rest days.",
                    persian = "هیچ‌وقت دیر نیست. پیشنهاد می‌کنم روزهای استراحت برنامه‌ریزی کنی."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "That's a good idea. I'd rather work less than burn out.",
                    persian = "ایده خوبیه. ترجیح می‌دهم کمتر کار کنم تا فرسوده شوم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "It's high time we all took care of our health.",
                    persian = "وقتش رسیده که همه ما به سلامتیمون اهمیت بدیم."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "You're right. If only I had realized this earlier!",
                    persian = "حق داری. ای کاش زودتر این را فهمیده بودم!"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Well, better late than never.",
                    persian = "خب، دیر رسیدن بهتر از هرگز نرسیدن است."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "True. I'd prefer to start now than wait any longer.",
                    persian = "درسته. ترجیح می‌دهم الان شروع کنم تا بیشتر منتظر بمانم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "It's important that you make a plan.",
                    persian = "مهم است که برنامه‌ای تهیه کنی."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "I will. I suggest that we both hold each other accountable.",
                    persian = "می‌کنم. پیشنهاد می‌کنم که هر دو مسئولیت‌پذیر هم باشیم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Great idea! I'd rather have a partner than do it alone.",
                    persian = "ایده عالی! ترجیح می‌دهم همکار داشته باشم تا تنها انجام دهم."
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "Agreed. If only we had started this sooner!",
                    persian = "قبول. ای کاش زودتر شروع کرده بودیم!"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Let's not focus on the past. I wish you success!",
                    persian = "بیا روی گذشته تمرکز نکنیم. برات آرزوی موفقیت می‌کنم!"
                ),
                DialogueLine(
                    speaker = "Ahmed",
                    english = "Thanks. Same to you!",
                    persian = "ممنون. برای تو هم همین‌طور!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What does Sara wish?",
                    answer = "She wishes she had more free time."
                ),
                ComprehensionQuestion(
                    question = "What does Ahmed regret?",
                    answer = "He wishes he had slowed down a few years ago."
                ),
                ComprehensionQuestion(
                    question = "What does Sara suggest?",
                    answer = "She suggests that he plan rest days."
                ),
                ComprehensionQuestion(
                    question = "What does Ahmed prefer?",
                    answer = "He'd prefer to work less than burn out."
                ),
                ComprehensionQuestion(
                    question = "What does Sara say is important?",
                    answer = "It's important that Ahmed makes a plan."
                ),
                ComprehensionQuestion(
                    question = "What does Ahmed suggest at the end?",
                    answer = "He suggests that they hold each other accountable."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about things you wish were different in your life.",
                    promptPersian = "درباره چیزهایی که آرزو داری در زندگی‌ات متفاوت باشند صحبت کن.",
                    hints = "Use: I wish I had..., I wish I could..., If only..."
                ),
                SpeakingTask(
                    prompt = "Discuss a past regret using wish + past perfect.",
                    promptPersian = "درباره پشیمانی گذشته با wish + past perfect صحبت کن.",
                    hints = "Use: I wish I had..., I regret not..., If only I had..."
                ),
                SpeakingTask(
                    prompt = "Give suggestions using subjunctive.",
                    promptPersian = "با subjunctive پیشنهاد بده.",
                    hints = "Use: I suggest that..., I recommend that..., It's essential that..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a reflective essay (about 200 words) about your wishes and regrets. Use subjunctive, wish + past, wish + past perfect, and would rather.",
                    promptPersian = "یه مقاله بازتابی بنویس (حدود ۲۰۰ کلمه) درباره آرزوها و پشیمانی‌هایت. از subjunctive، wish + past، wish + past perfect و would rather استفاده کن.",
                    wordCount = 200,
                    hints = "Structure:\n1. Present wishes\n2. Past regrets\n3. Future hopes\n4. Suggestions to yourself"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I suggest that he ___ to the meeting.",
                    options = listOf("goes", "go", "going", "went"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I wish I ___ more time.",
                    options = listOf("have", "had", "will have", "having"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I wish I ___ studied harder.",
                    options = listOf("have", "had", "will have", "having"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I'd rather you ___ smoke here.",
                    options = listOf("don't", "didn't", "won't", "not"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "It's time you go to bed.",
                        "It's time you went to bed.",
                        "It's time you will go to bed.",
                        "It's time you have gone to bed."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: It's essential that everyone ___ present.",
                    options = listOf("is", "be", "are", "was"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'If only' mean?",
                    options = listOf("اگر تنها", "ای کاش", "اگر نه", "اگر ممکن"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I wish you ___ stop smoking.",
                    options = listOf("will", "would", "can", "could"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 8 — Modal Perfects
    // ============================================================
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Modal Perfects",
            titlePersian = "افعال وجهی کامل",
            objectives = listOf(
                "Use modal perfects for past speculation.",
                "Express regret, deduction, and possibility in the past.",
                "Distinguish between different modal perfects.",
                "Use modal perfect continuous.",
                "Apply modal perfects in different contexts."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "deduction",
                    persian = "استنتاج",
                    pronunciation = "/dɪˈdʌkʃən/",
                    partOfSpeech = "noun",
                    example = "Her deduction was correct.",
                    examplePersian = "استنتاجش درست بود.",
                    wordFamily = "deduce, deductive",
                    usageTip = "با must have."
                ),
                VocabWord(
                    english = "speculation",
                    persian = "گمانه‌زنی",
                    pronunciation = "/ˌspekjuˈleɪʃən/",
                    partOfSpeech = "noun",
                    example = "That's just speculation.",
                    examplePersian = "این فقط گمانه‌زنیه.",
                    wordFamily = "speculate, speculative",
                    usageTip = "با might have/could have."
                ),
                VocabWord(
                    english = "certainty",
                    persian = "قطعیت",
                    pronunciation = "/ˈsɜːrtənti/",
                    partOfSpeech = "noun",
                    example = "There's no certainty about what happened.",
                    examplePersian = "هیچ قطعیتی درباره آنچه اتفاق افتاده نیست.",
                    wordFamily = "certain, certainly",
                    usageTip = "در مباحث استنتاج."
                ),
                VocabWord(
                    english = "possibility",
                    persian = "احتمال",
                    pronunciation = "/ˌpɑːsəˈbɪləti/",
                    partOfSpeech = "noun",
                    example = "There's a possibility she missed the train.",
                    examplePersian = "احتمال دارد که قطار را از دست داده باشد.",
                    wordFamily = "possible, possibly",
                    usageTip = "با might have/could have."
                ),
                VocabWord(
                    english = "regret",
                    persian = "پشیمانی",
                    pronunciation = "/rɪˈɡret/",
                    partOfSpeech = "noun",
                    example = "I have no regrets about my decision.",
                    examplePersian = "درباره تصمیمم هیچ پشیمانی ندارم.",
                    wordFamily = "regretful, regrettable",
                    usageTip = "با should have."
                ),
                VocabWord(
                    english = "reproach",
                    persian = "سرزنش",
                    pronunciation = "/rɪˈproʊtʃ/",
                    partOfSpeech = "noun/verb",
                    example = "There was reproach in her voice.",
                    examplePersian = "در صدایش سرزنش بود.",
                    usageTip = "با could have/should have."
                ),
                VocabWord(
                    english = "hypothesis",
                    persian = "فرضیه",
                    pronunciation = "/haɪˈpɑːθəsɪs/",
                    partOfSpeech = "noun",
                    example = "That's a reasonable hypothesis.",
                    examplePersian = "این یه فرضیه معقوله.",
                    wordFamily = "hypothesize, hypothetical",
                    usageTip = "با must have/could have."
                ),
                VocabWord(
                    english = "contradiction",
                    persian = "تناقض",
                    pronunciation = "/ˌkɑːntrəˈdɪkʃən/",
                    partOfSpeech = "noun",
                    example = "There's a contradiction in his story.",
                    examplePersian = "در داستانش تناقض وجود دارد.",
                    wordFamily = "contradict, contradictory",
                    usageTip = "در تحلیل اطلاعات."
                ),
                VocabWord(
                    english = "misinterpret",
                    persian = "بد تفسیر کردن",
                    pronunciation = "/ˌmɪsɪnˈtɜːrprət/",
                    partOfSpeech = "verb",
                    example = "She might have misinterpreted my message.",
                    examplePersian = "او ممکنه پیامم را بد تفسیر کرده باشد.",
                    wordFamily = "misinterpretation",
                    usageTip = "با might have."
                ),
                VocabWord(
                    english = "oversight",
                    persian = "غفلت، سهو",
                    pronunciation = "/ˈoʊvərsaɪt/",
                    partOfSpeech = "noun",
                    example = "It might have been an oversight.",
                    examplePersian = "ممکنه یه غفلت بوده باشد.",
                    usageTip = "با might have."
                ),
                VocabWord(
                    english = "apparently",
                    persian = "ظاهراً",
                    pronunciation = "/əˈpærəntli/",
                    partOfSpeech = "adverb",
                    example = "Apparently, she left early.",
                    examplePersian = "ظاهراً او زود رفت.",
                    usageTip = "با modal perfects."
                ),
                VocabWord(
                    english = "consequently",
                    persian = "در نتیجه",
                    pronunciation = "/ˈkɑːnsəkwentli/",
                    partOfSpeech = "adverb",
                    example = "He missed the flight and consequently missed the meeting.",
                    examplePersian = "او پروازش را از دست داد و در نتیجه جلسه را از دست داد.",
                    usageTip = "در استنتاج."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in hindsight",
                    persian = "در retrospect، با نگاه به گذشته",
                    example = "In hindsight, I should have known better.",
                    examplePersian = "با نگاه به گذشته، باید بهتر می‌دانستم.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "looking back",
                    persian = "با نگاه به گذشته",
                    example = "Looking back, we could have done things differently.",
                    examplePersian = "با نگاه به گذشته، می‌تونستیم متفاوت عمل کنیم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "no use crying over spilt milk",
                    persian = "گریه برای گذشته فایده ندارد",
                    example = "It's no use crying over spilt milk.",
                    examplePersian = "گریه برای گذشته فایده ندارد.",
                    register = "idiom"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "come up with",
                    meaning = "to think of",
                    persian = "ارائه دادن",
                    example = "She might have come up with a better plan.",
                    examplePersian = "او ممکنه طرح بهتری ارائه کرده باشد."
                ),
                PhrasalVerb(
                    verb = "figure out",
                    meaning = "to understand",
                    persian = "فهمیدن",
                    example = "He must have figured out the answer.",
                    examplePersian = "او حتماً جواب را فهمیده است."
                ),
                PhrasalVerb(
                    verb = "run into",
                    meaning = "to meet by chance",
                    persian = "اتفاقی دیدن",
                    example = "She might have run into him downtown.",
                    examplePersian = "او ممکنه مرکز شهر اتفاقی دیده باشد."
                ),
                PhrasalVerb(
                    verb = "set off",
                    meaning = "to start a journey",
                    persian = "راه افتادن",
                    example = "They must have set off early.",
                    examplePersian = "آن‌ها حتماً زود راه افتاده‌اند."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Reduced 'have' in modal perfects",
                    content = "در گفتار طبیعی، have در modal perfects ضعیف تلفظ می‌شود:\n• must have → /ˈmʌstəv/\n• should have → /ˈʃʊdəv/\n• could have → /ˈkʊdəv/"
                ),
                PronunciationTip(
                    title = "Stress on modal in deduction",
                    content = "در استنتاج، modal تأکید می‌گیرد:\n• She MUST have forgotten.\n• They MIGHT have left."
                ),
                PronunciationTip(
                    title = "Stress on past participle",
                    content = "در modal perfects، past participle تأکید می‌گیرد:\n• He must have FORGOTTEN.\n• She should have CALLED."
                ),
                PronunciationTip(
                    title = "Contrastive intonation",
                    content = "در مقایسه، روی modal تأکید می‌شود:\n• He MIGHT have left, but he also COULD have stayed."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Speculating in English",
                    content = "انگلیسی‌زبانان زیاد از modal perfects برای گمانه‌زنی درباره گذشته استفاده می‌کنند: 'She must have been tired.'"
                ),
                CulturalNote(
                    title = "Expressing regret",
                    content = "برای بیان پشیمانی: 'I should have studied harder.' این ساختار در مکالمات روزمره رایجه."
                ),
                CulturalNote(
                    title = "Deduction in detective stories",
                    content = "در داستان‌های کارآگاهی، از modal perfects برای استنتاج استفاده می‌شود: 'He must have entered through the window.'"
                ),
                CulturalNote(
                    title = "Cautious language",
                    content = "در متون رسمی، از might have/could have برای احتیاط در بیان استفاده می‌شود: 'The error could have been caused by...'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Modal Perfects Overview",
                    content = """
ساختار: modal + have + past participle

| Modal Perfect | Meaning |
|---------------|---------|
| must have + pp | استنتاج قوی گذشته |
| can't have + pp | عدم امکان گذشته |
| could have + pp | احتمال گذشته / عدم انجام |
| may/might have + pp | احتمال ضعیف گذشته |
| should have + pp | پشیمانی یا توصیه گذشته |
| shouldn't have + pp | پشیمانی از انجام |
| would have + pp | شرطی گذشته |
| needn't have + pp | عدم ضرورت گذشته |

مثال:
• She must have forgotten. (حتماً فراموش کرده)
• He can't have taken it. (امکان ندارد برداشته باشد)
• They might have left. (شاید رفته باشند)
• I should have studied. (باید درس می‌خواندم)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Must Have + Past Participle",
                    content = """
برای استنتاج قوی درباره گذشته:

ساختار: must have + past participle

کاربرد: تقریباً مطمئن هستیم که چیزی در گذشته اتفاق افتاده.

مثال:
• She must have forgotten about the meeting.
• He must have missed the bus.
• They must have been tired after the trip.
• It must have rained last night — the ground is wet.
• You must have been worried.

منفی: can't have / couldn't have
• She can't have forgotten — she's very organized.
• He couldn't have taken it — he wasn't there.

نکته: must have = قطعیت مثبت؛ can't have = قطعیت منفی.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Could/May/Might Have + Past Participle",
                    content = """
برای احتمال در گذشته:

Could have + pp:
• She could have missed the train.
   (ممکن بود از دست بدهد)
• They could have arrived already.

May have + pp:
• He may have forgotten.
   (احتمالاً فراموش کرده)
• She may have already left.

Might have + pp:
• They might have taken the wrong road.
   (شاید اشتباه رفته باشند)
• He might not have received the message.

تفاوت‌ها:
• could have: احتمال عمومی
• may have: احتمال ~۵۰٪
• might have: احتمال ~۳۰٪

کاربرد دیگر could have:
• عدم انجام کاری که ممکن بود:
   She could have called, but she didn't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Should Have + Past Participle",
                    content = """
برای پشیمانی یا توصیه درباره گذشته:

Should have + pp:
• I should have studied harder.
   (باید بیشتر درس می‌خواندم)
• She should have told me.
   (باید بهم می‌گفت)
• They should have arrived by now.

Shouldn't have + pp:
• I shouldn't have said that.
   (نباید آن را می‌گفتم)
• You shouldn't have bought it.
   (نباید می‌خریدی)

معنی:
• should have: کاری که باید انجام می‌شد ولی نشد
• shouldn't have: کاری که نباید انجام می‌شد ولی شد

کاربرد در توصیه گذشته:
• You should have seen a doctor.
• She should have asked for help.

نکته: could have نیز می‌تواند پشیمانی را بیان کند:
• I could have studied harder. (می‌توانستم ولی نکردم)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Would Have + Past Participle",
                    content = """
برای شرطی گذشته (third conditional):

ساختار: would have + pp

کاربرد: نتیجه فرضی یک شرط گذشته

مثال:
• If I had known, I would have come.
• If she had studied, she would have passed.
• They would have arrived on time if they had left earlier.

منفی:
• I wouldn't have said that if I had known.
• She wouldn't have gone if she had been told.

نکته: would have در if-clause نمی‌آید:
❌ If I would have known...
✅ If I had known, I would have...

کاربرد دیگر: آرزو
• I would have loved to see you.
• She would have preferred to stay.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Needn't Have + Past Participle",
                    content = """
برای عدم ضرورت کاری در گذشته:

ساختار: needn't have + past participle

کاربرد: کاری که انجام شد ولی لازم نبود

مثال:
• You needn't have brought a gift.
   (لازم نبود هدیه بیاوری)
• She needn't have worried.
   (لازم نبود نگران باشد)
• We needn't have come so early.
   (لازم نبود اینقدر زود بیاییم)

تفاوت با didn't need to:
• needn't have + pp: کاری که انجام شد ولی لازم نبود
   I needn't have cooked dinner — she had already eaten.
• didn't need to + verb: کاری که انجام نشد چون لازم نبود
   I didn't need to cook dinner — we ordered pizza.

نکته: needn't have = عدم ضرورت + انجام شده.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Modal Perfect Continuous",
                    content = """
ساختار: modal + have been + verb-ing

کاربرد: گمانه‌زنی درباره فعالیت در حال انجام در گذشته

مثال:
• She must have been working late.
   (حتماً دیر کار می‌کرده)
• They might have been sleeping.
   (شاید خواب بوده‌اند)
• He could have been waiting for hours.
   (ممکنه ساعت‌ها منتظر بوده)
• She should have been studying, not watching TV.
   (باید درس می‌خواند، نه تلویزیون تماشا)

کاربردها:
• استنتاج: must have been + -ing
• احتمال: might/could have been + -ing
• توصیه/پشیمانی: should have been + -ing

نکته: این ساختار روی مدت و ادامه‌دار بودن در گذشته تأکید می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Summary and Contrast",
                    content = """
جدول خلاصه:

| ساختار | معنی | مثال |
|--------|------|------|
| must have | قطعیت مثبت | She must have left. |
| can't have | قطعیت منفی | He can't have said that. |
| could have | احتمال عمومی | They could have arrived. |
| may have | احتمال ~۵۰٪ | She may have forgotten. |
| might have | احتمال ~۳۰٪ | He might have missed it. |
| should have | توصیه/پشیمانی | I should have called. |
| shouldn't have | پشیمانی از انجام | You shouldn't have lied. |
| would have | شرطی گذشته | I would have helped. |
| needn't have | عدم ضرورت انجام‌شده | You needn't have paid. |

توجه: انتخاب modal بر اساس:
• میزان قطعیت
• نوع رابطه (استنتاج، پشیمانی، فرض)
• context
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "She must forgot.",
                    correct = "She must have forgotten.",
                    explanation = "Modal perfect نیاز به have + pp دارد."
                ),
                CommonMistake(
                    wrong = "I should studied harder.",
                    correct = "I should have studied harder.",
                    explanation = "بعد از should، have + pp می‌آید."
                ),
                CommonMistake(
                    wrong = "If I would have known, I would have come.",
                    correct = "If I had known, I would have come.",
                    explanation = "در if-clause سوم شرطی، past perfect (نه would have)."
                ),
                CommonMistake(
                    wrong = "He must have went.",
                    correct = "He must have gone.",
                    explanation = "past participle صحیح go، gone است."
                ),
                CommonMistake(
                    wrong = "I needn't have to pay.",
                    correct = "I needn't have paid.",
                    explanation = "ساختار: needn't have + pp (بدون to)."
                ),
                CommonMistake(
                    wrong = "You should have went earlier.",
                    correct = "You should have gone earlier.",
                    explanation = "past participle صحیح go، gone است."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Lara",
                    english = "Why is Ali so tired today?",
                    persian = "چرا علی امروز اینقدر خسته است؟"
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "He must have stayed up late working.",
                    persian = "حتماً دیر وقت بیدار مانده و کار کرده."
                ),
                DialogueLine(
                    speaker = "Lara",
                    english = "He should have gone to bed earlier.",
                    persian = "باید زودتر می‌خوابید."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "I know, but he might have had too much work.",
                    persian = "می‌دانم، ولی ممکنه کار زیادی داشته."
                ),
                DialogueLine(
                    speaker = "Lara",
                    english = "He could have asked for help.",
                    persian = "می‌تونست کمک بخواهد."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "True. He shouldn't have tried to do everything alone.",
                    persian = "درسته. نباید سعی می‌کرد همه چیز را تنها انجام دهد."
                ),
                DialogueLine(
                    speaker = "Lara",
                    english = "Where is Sarah? She isn't here either.",
                    persian = "سارا کجاست؟ اونم اینجا نیست."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "She may have taken the day off. She mentioned feeling unwell.",
                    persian = "ممکنه مرخصی گرفته باشد. اشاره کرد که حالش خوب نیست."
                ),
                DialogueLine(
                    speaker = "Lara",
                    english = "She should have told us earlier.",
                    persian = "باید زودتر بهمون می‌گفت."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "She might have tried to call, but the line was busy.",
                    persian = "ممکنه سعی کرده باشد زنگ بزند، ولی خط اشغال بود."
                ),
                DialogueLine(
                    speaker = "Lara",
                    english = "Maybe. Did you try reaching her?",
                    persian = "شاید. سعی کردی بهش برسی؟"
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "Yes, I called twice. She must have turned off her phone.",
                    persian = "بله، دو بار زنگ زدم. حتماً گوشیش را خاموش کرده."
                ),
                DialogueLine(
                    speaker = "Lara",
                    english = "I hope she's okay. She could have gone to the doctor.",
                    persian = "امیدوارم حالت خوب باشه. می‌تونست دکتر بره."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "Let's text her. If she doesn't reply, we should check on her.",
                    persian = "بیا بهش پیام بدیم. اگه جواب نداد، باید بررسی‌اش کنیم."
                ),
                DialogueLine(
                    speaker = "Lara",
                    english = "Good idea. I would have called her earlier if I'd known.",
                    persian = "ایده خوبی. اگه می‌دونستم زودتر زنگ می‌زدم."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "I should have told you she wasn't feeling well.",
                    persian = "باید بهت می‌گفتم که حالش خوب نبود."
                ),
                DialogueLine(
                    speaker = "Lara",
                    english = "Don't worry. Let's check on her now.",
                    persian = "نگران نباش. بیا الان بررسی‌اش کنیم."
                ),
                DialogueLine(
                    speaker = "Nima",
                    english = "Okay, let's go!",
                    persian = "باشه، بریم!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Why is Ali tired according to Nima?",
                    answer = "He must have stayed up late working."
                ),
                ComprehensionQuestion(
                    question = "What should Ali have done?",
                    answer = "He should have gone to bed earlier."
                ),
                ComprehensionQuestion(
                    question = "What could Ali have done?",
                    answer = "He could have asked for help."
                ),
                ComprehensionQuestion(
                    question = "Why isn't Sarah at work?",
                    answer = "She may have taken the day off because she felt unwell."
                ),
                ComprehensionQuestion(
                    question = "Why didn't Sarah call?",
                    answer = "She might have tried, but the line was busy, or she may have turned off her phone."
                ),
                ComprehensionQuestion(
                    question = "What do they decide to do?",
                    answer = "They decide to text Sarah and check on her if she doesn't reply."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Speculate about what might have happened in a mystery situation.",
                    promptPersian = "درباره اینکه در یه موقعیت مرموز چه اتفاقی افتاده می‌تواند صحبت کن.",
                    hints = "Use: He must have..., She might have..., They could have..."
                ),
                SpeakingTask(
                    prompt = "Talk about things you should or shouldn't have done.",
                    promptPersian = "درباره کارهایی که باید یا نباید انجام می‌دادی صحبت کن.",
                    hints = "Use: I should have..., I shouldn't have..., I could have..."
                ),
                SpeakingTask(
                    prompt = "Discuss a situation where someone's actions were unexpected.",
                    promptPersian = "درباره وضعیتی که رفتار کسی غیرمنتظره بود صحبت کن.",
                    hints = "Use: They must have been..., He can't have..., It might have been..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a detective story extract (about 200 words). Use modal perfects to speculate about what happened.",
                    promptPersian = "یه بخش از داستان کارآگاهی بنویس (حدود ۲۰۰ کلمه). از modal perfects برای گمانه‌زنی درباره آنچه اتفاق افتاده استفاده کن.",
                    wordCount = 200,
                    hints = "Structure:\n1. Present the mystery\n2. Speculate about what happened\n3. Give clues\n4. Draw deductions"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: She ___ have forgotten about the meeting.",
                    options = listOf("must", "musts", "must to", "is must"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: I ___ have studied harder.",
                    options = listOf("should", "shoulds", "should to", "is should"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: They ___ have arrived by now.",
                    options = listOf("should", "shoulds", "should to", "is should"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What's the difference between 'must have' and 'might have'?",
                    options = listOf(
                        "No difference",
                        "Must have = strong certainty; might have = possibility",
                        "Must have is past; might have is future",
                        "Must have is formal; might have is informal"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: He can't ___ taken the money.",
                    options = listOf("have", "has", "having", "had"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: If I had known, I ___ have come.",
                    options = listOf("will", "would", "have", "had"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'shouldn't have' express?",
                    options = listOf(
                        "زمان آینده",
                        "پشیمانی از انجام کار در گذشته",
                        "احتمال در آینده",
                        "سؤال"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: You ___ have paid — it was free.",
                    options = listOf("needn't", "mustn't", "shouldn't", "can't"),
                    correctIndex = 0
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 9 — Advanced Passive Structures
    // ============================================================
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Advanced Passive and Causative",
            titlePersian = "مجهول و سببی پیشرفته",
            objectives = listOf(
                "Master advanced passive structures.",
                "Use causative structures (have/get something done).",
                "Apply passive in formal writing.",
                "Distinguish between personal and impersonal passive.",
                "Use passive with reporting verbs effectively."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "causative",
                    persian = "سببی",
                    pronunciation = "/ˈkɔːzətɪv/",
                    partOfSpeech = "adjective",
                    example = "Causative passive is common in English.",
                    examplePersian = "مجهول سببی در انگلیسی رایجه.",
                    usageTip = "have/get something done."
                ),
                VocabWord(
                    english = "impersonal",
                    persian = "غیرشخصی",
                    pronunciation = "/ɪmˈpɜːrsənəl/",
                    partOfSpeech = "adjective",
                    example = "Impersonal passive is used in academic writing.",
                    examplePersian = "مجهول غیرشخصی در نوشتار آکادمیک استفاده می‌شود.",
                    usageTip = "it is said that..."
                ),
                VocabWord(
                    english = "agent",
                    persian = "عامل",
                    pronunciation = "/ˈeɪdʒənt/",
                    partOfSpeech = "noun",
                    example = "The agent can be omitted in passive.",
                    examplePersian = "عامل در مجهول می‌تواند حذف شود.",
                    usageTip = "با by نشان داده می‌شود."
                ),
                VocabWord(
                    english = "responsibility",
                    persian = "مسئولیت",
                    pronunciation = "/rɪˌspɑːnsəˈbɪləti/",
                    partOfSpeech = "noun",
                    example = "Who bears responsibility for this?",
                    examplePersian = "چه کسی مسئولیت این را بر عهده دارد؟",
                    wordFamily = "responsible, responsibly",
                    usageTip = "در بحث agent."
                ),
                VocabWord(
                    english = "attribution",
                    persian = "انتساب",
                    pronunciation = "/ˌætrɪˈbjuːʃən/",
                    partOfSpeech = "noun",
                    example = "Attribution is important in reporting.",
                    examplePersian = "انتساب در گزارش‌دهی مهم است.",
                    wordFamily = "attribute, attributable",
                    usageTip = "در نقل قول."
                ),
                VocabWord(
                    english = "objectivity",
                    persian = "عینیت",
                    pronunciation = "/ˌɑːbdʒekˈtɪvəti/",
                    partOfSpeech = "noun",
                    example = "Passive is used for objectivity.",
                    examplePersian = "مجهول برای عینیت استفاده می‌شود.",
                    wordFamily = "objective, objectively",
                    usageTip = "در آکادمیک."
                ),
                VocabWord(
                    english = "construction",
                    persian = "ساختار",
                    pronunciation = "/kənˈstrʌkʃən/",
                    partOfSpeech = "noun",
                    example = "This is a passive construction.",
                    examplePersian = "این یه ساختار مجهوله.",
                    wordFamily = "construct, constructive",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "depersonalize",
                    persian = "غیرشخصی کردن",
                    pronunciation = "/diːˈpɜːrsənəlaɪz/",
                    partOfSpeech = "verb",
                    example = "Passive depersonalizes the message.",
                    examplePersian = "مجهول پیام را غیرشخصی می‌کند.",
                    usageTip = "در آکادمیک."
                ),
                VocabWord(
                    english = "specify",
                    persian = "مشخص کردن",
                    pronunciation = "/ˈspesɪfaɪ/",
                    partOfSpeech = "verb",
                    example = "The subject is not specified.",
                    examplePersian = "فاعل مشخص نمی‌شود.",
                    wordFamily = "specification",
                    usageTip = "در passive."
                ),
                VocabWord(
                    english = "ambiguous",
                    persian = "مبهم",
                    pronunciation = "/æmˈbɪɡjuəs/",
                    partOfSpeech = "adjective",
                    example = "The passive can be ambiguous.",
                    examplePersian = "مجهول می‌تواند مبهم باشد.",
                    wordFamily = "ambiguity",
                    usageTip = "در تحلیل."
                ),
                VocabWord(
                    english = "formal register",
                    persian = "لحن رسمی",
                    pronunciation = "/ˈfɔːrməl ˈredʒɪstər/",
                    partOfSpeech = "noun",
                    example = "Passive is common in formal register.",
                    examplePersian = "مجهول در لحن رسمی رایج‌تره.",
                    usageTip = "در آکادمیک."
                ),
                VocabWord(
                    english = "rhetorical",
                    persian = "بلاغی",
                    pronunciation = "/rɪˈtɔːrɪkəl/",
                    partOfSpeech = "adjective",
                    example = "Passive is used rhetorically.",
                    examplePersian = "مجهول در بلاغت استفاده می‌شود.",
                    wordFamily = "rhetoric",
                    usageTip = "در نوشتار."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "by all accounts",
                    persian = "به گفته همه",
                    example = "By all accounts, the event was a success.",
                    examplePersian = "به گفته همه، رویداد موفق بود.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "it stands to reason",
                    persian = "منطقی است که",
                    example = "It stands to reason that they were delayed.",
                    examplePersian = "منطقی است که آن‌ها تأخیر داشتند.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "be held accountable",
                    persian = "مسئول شناخته شدن",
                    example = "Someone must be held accountable.",
                    examplePersian = "کسی باید مسئول شناخته شود.",
                    register = "formal"
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
                    verb = "be referred to",
                    meaning = "to be called",
                    persian = "نامیده شدن",
                    example = "This is referred to as passive voice.",
                    examplePersian = "این مجهول نامیده می‌شود."
                ),
                PhrasalVerb(
                    verb = "be involved in",
                    meaning = "to be part of",
                    persian = "درگیر بودن",
                    example = "She was involved in the project.",
                    examplePersian = "او در پروژه درگیر بود."
                ),
                PhrasalVerb(
                    verb = "be based on",
                    meaning = "to be founded on",
                    persian = "بر اساس",
                    example = "The movie is based on a true story.",
                    examplePersian = "فیلم بر اساس یه داستان واقعی ساخته شده."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Weak forms of be",
                    content = "در passive، am/is/are/was/were ضعیف تلفظ می‌شوند:\n• The letter is sent → /ðə ˈletər ɪz sent/"
                ),
                PronunciationTip(
                    title = "Stress on past participle",
                    content = "در passive، pp تأکید می‌گیرد:\n• The window was BROKEN.\n• The report was FINISHED."
                ),
                PronunciationTip(
                    title = "Causative have stress",
                    content = "در causative، have/get تأکید کمتری دارند:\n• I had my hair CUT."
                ),
                PronunciationTip(
                    title = "Emphasis on by-agent",
                    content = "وقتی agent مهم است، تأکید می‌گیرد:\n• It was written BY HEMINGWAY."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Passive in diplomacy",
                    content = "در دیپلماسی، passive برای پرهیز از سرزنش مستقیم: 'Mistakes were made.'"
                ),
                CulturalNote(
                    title = "Passive in science",
                    content = "در مقالات علمی، passive استاندارد است: 'The experiment was conducted...'"
                ),
                CulturalNote(
                    title = "Passive in news",
                    content = "اخبار از passive استفاده می‌کنند: 'Three people were injured.'"
                ),
                CulturalNote(
                    title = "Causative in services",
                    content = "در خدمات، causative رایج است: 'I had my car serviced.'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Passive in All Tenses: Review",
                    content = """
| Tense | Active | Passive |
|-------|--------|---------|
| Present Simple | They make cars. | Cars are made. |
| Present Continuous | They are making cars. | Cars are being made. |
| Present Perfect | They have made cars. | Cars have been made. |
| Past Simple | They made cars. | Cars were made. |
| Past Continuous | They were making cars. | Cars were being made. |
| Past Perfect | They had made cars. | Cars had been made. |
| Future Simple | They will make cars. | Cars will be made. |
| Future Perfect | They will have made cars. | Cars will have been made. |
| Modals | They must make cars. | Cars must be made. |
| Perfect Infinitive | They seem to have made cars. | Cars seem to have been made. |
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Personal vs Impersonal Passive",
                    content = """
Personal passive (با agent مشخص):
Subject + passive + (by agent)
• The Mona Lisa was painted by Leonardo da Vinci.
• The book was written by Hemingway.

Impersonal passive (بدون agent مشخص):
It + passive + that + clause
• It is said that he is very rich.
• It is believed that she is innocent.
• It is reported that the company will merge.

یا با ساختار personal + to infinitive:
• He is said to be very rich.
• She is believed to be innocent.
• The company is reported to be merging.

نکته: impersonal passive در نوشتار رسمی رایج‌تر است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Passive with Reporting Verbs",
                    content = """
با افعال گزارش‌دهی:

say, believe, think, know, report, suppose, consider, expect, claim, rumor

ساختار ۱ — impersonal:
It + passive + that + clause
• It is said that he is a genius.
• It is believed that she left early.

ساختار ۲ — personal:
Subject + passive + to infinitive
• He is said to be a genius.
• She is believed to have left early.

با زمان‌های مختلف:
• He is said to be rich. (حال)
• He is said to have been rich. (گذشته)
• He is said to be living in Paris. (حال استمراری)
• The company is expected to announce results. (آینده نزدیک)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Causative Structures",
                    content = """
ساختار: have/get + object + past participle

کاربردها:

1. خدماتی که کسی برای ما انجام می‌دهد:
• I had my hair cut.
• She had her car repaired.
• We had our house painted.
• They had the carpets cleaned.

2. تجربه‌های منفی:
• He had his wallet stolen.
• She had her car broken into.
• I had my phone stolen.

3. با get (غیررسمی‌تر):
• I got my hair cut.
• She got her dress cleaned.

4. با get به معنای متقاعد کردن:
• I got him to help me.
• She got her son to clean his room.

5. با have به معنای تجربه:
• I had a strange thing happen to me.

نکته: در causative، فاعل خودش کار را انجام نمی‌دهد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Passive with Two Objects",
                    content = """
وقتی فعل دو مفعول دارد:

Active: They gave Maria a prize.
- Indirect object: Maria
- Direct object: a prize

Passive 1 (رایج‌تر): Maria was given a prize.
Passive 2 (رسمی‌تر): A prize was given to Maria.

افعال رایج:
give, send, show, tell, offer, lend, promise, teach, bring, pay, hand, write, read

مثال‌ها:
• I was sent a letter. / A letter was sent to me.
• He was offered a job. / A job was offered to him.
• We were shown the house. / The house was shown to us.

نکته: در انگلیسی آمریکایی، Passive 1 رایج‌تر است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Passive with Modals and Infinitives",
                    content = """
با modals:
Modal + be + past participle
• The rule must be followed.
• The package can be delivered tomorrow.
• The work should be finished by Friday.
• The problem might be solved.

با infinitives:
to be + past participle
• I want the work to be done.
• She expects the report to be submitted.
• They need the car to be repaired.

با modal perfect:
Modal + have been + past participle
• The letter should have been sent yesterday.
• It might have been forgotten.
• The work could have been finished earlier.

با gerunds:
being + past participle
• I hate being interrupted.
• She enjoys being praised.
• He remembers being told about it.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Passive in Formal Writing",
                    content = """
در نوشتار رسمی و آکادمیک:

Abstract/Summary:
• The study was conducted over three months.
• The data was analyzed using statistical methods.
• The results were compared with previous findings.

Methods:
• The samples were collected from five locations.
• The participants were selected randomly.
• The experiment was repeated three times.

Discussion:
• The findings have been confirmed by other studies.
• The problem was first identified in 2010.
• It is generally accepted that...

نکته: در این متون، passive معمولاً agent ندارد چون تمرکز روی فرایند است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Choosing Between Active and Passive",
                    content = """
از passive استفاده می‌کنیم وقتی:

1. فاعل ناشناخته است:
   My car was stolen.

2. فاعل بی‌اهمیت است:
   The road is being repaired.

3. فاعل واضح است:
   The thief was arrested.

4. تمرکز روی مفعول است:
   The prize was given to Maria.

5. در نوشتار رسمی:
   The experiment was conducted three times.

6. برای پرهیز از سرزنش مستقیم:
   Mistakes were made.

از active استفاده می‌کنیم وقتی:
• فاعل مهم است: Maria won the prize.
• جمله واضح‌تر و کوتاه‌تر می‌شود.
• می‌خواهیم تأکید روی فاعل باشد.

نکته: passive و active انتخاب‌های سبکی هستند، نه درست/غلط.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "The house was build in 1990.",
                    correct = "The house was built in 1990.",
                    explanation = "pp صحیح build، built است."
                ),
                CommonMistake(
                    wrong = "The book is wrote by Hemingway.",
                    correct = "The book is written by Hemingway.",
                    explanation = "pp صحیح write، written است."
                ),
                CommonMistake(
                    wrong = "The rule must followed.",
                    correct = "The rule must be followed.",
                    explanation = "با modals، be + pp."
                ),
                CommonMistake(
                    wrong = "I had my hair cut by myself.",
                    correct = "I had my hair cut. / I cut my own hair.",
                    explanation = "در causative، فاعل خودش کار را انجام نمی‌دهد."
                ),
                CommonMistake(
                    wrong = "He was said to be very rich. (بدون context)",
                    correct = "He is said to be very rich.",
                    explanation = "در impersonal passive، حال با is."
                ),
                CommonMistake(
                    wrong = "Is being the house cleaned?",
                    correct = "Is the house being cleaned?",
                    explanation = "ترتیب: auxiliary + subject + be + pp."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "The new findings were published last week.",
                    persian = "یافته‌های جدید هفته پیش منتشر شدند."
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "Yes, I read the paper. It was well-received by the community.",
                    persian = "بله، مقاله را خواندم. توسط جامعه علمی خوب پذیرفته شد."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "The data was collected over three years.",
                    persian = "داده‌ها در طول سه سال جمع‌آوری شد."
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "That's impressive. Was the study peer-reviewed?",
                    persian = "تحسین‌برانگیزه. مطالعه داوری همتا شده؟"
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Yes, it was reviewed by five experts in the field.",
                    persian = "بله، توسط پنج متخصص در این زمینه بررسی شد."
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "Excellent. Has the funding been approved for the next phase?",
                    persian = "عالی. بودجه برای فاز بعدی تأیید شده؟"
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Not yet. It's expected to be approved by the end of the month.",
                    persian = "هنوز نه. انتظار می‌رود تا پایان ماه تأیید شود."
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "Good. I hear the equipment has been upgraded.",
                    persian = "خوبه. شنیدم تجهیزات ارتقا یافته."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Yes, we had the lab renovated last month.",
                    persian = "بله، ماه پیش آزمایشگاه را بازسازی کردیم."
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "That's great. Have the results been shared with other teams?",
                    persian = "عالیه. نتایج با تیم‌های دیگر به اشتراک گذاشته شده؟"
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Yes, they've been presented at two conferences.",
                    persian = "بله، در دو کنفرانس ارائه شده‌اند."
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "And the paper? Where will it be submitted?",
                    persian = "و مقاله؟ کجا ارسال می‌شود؟"
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "It's being considered by Nature. Fingers crossed!",
                    persian = "داره توسط نیچر بررسی می‌شه. امیدوارم!"
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "That's amazing. When will the decision be made?",
                    persian = "فوق‌العاده‌ست. کِی تصمیم گرفته می‌شه؟"
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "We've been told it will be announced in four weeks.",
                    persian = "به ما گفته شده که در چهار هفته اعلام می‌شه."
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "Let's hope for the best. This work deserves recognition.",
                    persian = "بیا امیدوار باشیم. این کار شایسته تقدیره."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Thanks! It couldn't have been done without the team.",
                    persian = "ممنون! بدون تیم ممکن نبود."
                ),
                DialogueLine(
                    speaker = "Dr. Sara",
                    english = "I agree. Let me know when the decision is made.",
                    persian = "موافقم. وقتی تصمیم گرفته شد خبرم کن."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "When were the findings published?",
                    answer = "Last week."
                ),
                ComprehensionQuestion(
                    question = "How long was the data collected over?",
                    answer = "Over three years."
                ),
                ComprehensionQuestion(
                    question = "How many experts reviewed the study?",
                    answer = "Five experts."
                ),
                ComprehensionQuestion(
                    question = "Has the funding been approved?",
                    answer = "Not yet, but it's expected by the end of the month."
                ),
                ComprehensionQuestion(
                    question = "What did they have done to the lab?",
                    answer = "They had the lab renovated last month."
                ),
                ComprehensionQuestion(
                    question = "When will the decision be announced?",
                    answer = "In four weeks."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe a process using passive voice.",
                    promptPersian = "یه فرایند را با استفاده از مجهول توصیف کن.",
                    hints = "Use: It is made..., It has been..., It will be..."
                ),
                SpeakingTask(
                    prompt = "Talk about services you've had done.",
                    promptPersian = "درباره خدماتی که برایت انجام شده صحبت کن.",
                    hints = "Use: I had my... done. / I got my... repaired."
                ),
                SpeakingTask(
                    prompt = "Report news using impersonal passive.",
                    promptPersian = "خبری را با impersonal passive گزارش کن.",
                    hints = "Use: It is said that... / It is reported that... / It is believed that..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an academic abstract (about 200 words) using passive voice extensively. Include all major structures: passive in different tenses, impersonal passive, and causative.",
                    promptPersian = "یه چکیده آکادمیک بنویس (حدود ۲۰۰ کلمه) با استفاده گسترده از مجهول. شامل همه ساختارهای اصلی: مجهول در زمان‌های مختلف، impersonal passive و causative.",
                    wordCount = 200,
                    hints = "Structure:\n1. Study purpose\n2. Methodology\n3. Results\n4. Conclusion"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: The study ___ conducted last year.",
                    options = listOf("is", "was", "has", "does"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The results ___ been published.",
                    options = listOf("have", "has", "are", "were"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'I had my hair cut' mean?",
                    options = listOf(
                        "خودم موهایم را کوتاه کردم",
                        "کسی موهایم را کوتاه کرد",
                        "موهایم ریخت",
                        "موهایم بلند شد"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: It ___ said that he is very rich.",
                    options = listOf("is", "has", "was", "does"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Which is impersonal passive?",
                    options = listOf(
                        "The book was written by Hemingway.",
                        "It is said that he is very rich.",
                        "I had my hair cut.",
                        "They built the house."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The meeting is ___ to start at 10.",
                    options = listOf("suppose", "supposed", "supposing", "supposes"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The rule must ___ followed.",
                    options = listOf("be", "is", "been", "being"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What's the difference between active and passive?",
                    options = listOf(
                        "No difference",
                        "Active emphasizes subject; passive emphasizes object/action",
                        "Active is formal; passive is informal",
                        "Active is past; passive is present"
                    ),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 10 — Phrasal Verbs and Idioms
    // ============================================================
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Phrasal Verbs and Idioms",
            titlePersian = "افعال عبارتی و اصطلاحات",
            objectives = listOf(
                "Master common phrasal verbs.",
                "Distinguish between separable and inseparable phrasal verbs.",
                "Use idioms appropriately in different contexts.",
                "Understand literal vs figurative meanings.",
                "Build confidence in idiomatic English."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "phrasal verb",
                    persian = "فعل عبارتی",
                    pronunciation = "/ˈfreɪzəl vɜːrb/",
                    partOfSpeech = "noun",
                    example = "Give up is a phrasal verb.",
                    examplePersian = "give up یه فعل عبارتیه.",
                    usageTip = "فعل + حرف اضافه/قید."
                ),
                VocabWord(
                    english = "idiom",
                    persian = "اصطلاح",
                    pronunciation = "/ˈɪdiəm/",
                    partOfSpeech = "noun",
                    example = "Break a leg is an idiom.",
                    examplePersian = "break a leg یه اصطلاحه.",
                    wordFamily = "idiomatic",
                    usageTip = "معنی غیرمستقیم."
                ),
                VocabWord(
                    english = "separable",
                    persian = "قابل تفکیک",
                    pronunciation = "/ˈsepərəbəl/",
                    partOfSpeech = "adjective",
                    example = "Turn off is separable.",
                    examplePersian = "turn off قابل تفکیکه.",
                    usageTip = "می‌توان مفعول را وسط گذاشت."
                ),
                VocabWord(
                    english = "inseparable",
                    persian = "غیرقابل تفکیک",
                    pronunciation = "/ɪnˈsepərəbəl/",
                    partOfSpeech = "adjective",
                    example = "Look after is inseparable.",
                    examplePersian = "look after غیرقابل تفکیکه.",
                    usageTip = "نمی‌توان مفعول را وسط گذاشت."
                ),
                VocabWord(
                    english = "literal",
                    persian = "تحت‌اللفظی",
                    pronunciation = "/ˈlɪtərəl/",
                    partOfSpeech = "adjective",
                    example = "Take literally.",
                    examplePersian = "تحت‌اللفظی بگیر.",
                    wordFamily = "literally",
                    usageTip = "معنی مستقیم."
                ),
                VocabWord(
                    english = "figurative",
                    persian = "استعاری، مجازی",
                    pronunciation = "/ˈfɪɡjərətɪv/",
                    partOfSpeech = "adjective",
                    example = "Take figuratively.",
                    examplePersian = "مجازی بگیر.",
                    wordFamily = "figure, figuratively",
                    usageTip = "معنی غیرمستقیم."
                ),
                VocabWord(
                    english = "context",
                    persian = "زمینه",
                    pronunciation = "/ˈkɑːntekst/",
                    partOfSpeech = "noun",
                    example = "Context is important for idioms.",
                    examplePersian = "زمینه برای اصطلاحات مهمه.",
                    usageTip = "در درک idioms."
                ),
                VocabWord(
                    english = "register",
                    persian = "لحن",
                    pronunciation = "/ˈredʒɪstər/",
                    partOfSpeech = "noun",
                    example = "Formal register is different from informal.",
                    examplePersian = "لحن رسمی با غیررسمی متفاوته.",
                    usageTip = "در انتخاب idiom."
                ),
                VocabWord(
                    english = "collocation",
                    persian = "هم‌نشینی واژگانی",
                    pronunciation = "/ˌkɑːləˈkeɪʃən/",
                    partOfSpeech = "noun",
                    example = "Strong coffee is a collocation.",
                    examplePersian = "قهوه غلیظ یه هم‌نشینی واژگانیه.",
                    usageTip = "در یادگیری زبان."
                ),
                VocabWord(
                    english = "expression",
                    persian = "عبارت",
                    pronunciation = "/ɪkˈspreʃən/",
                    partOfSpeech = "noun",
                    example = "That's a common expression.",
                    examplePersian = "این یه عبارت رایجه.",
                    wordFamily = "express, expressive",
                    usageTip = "در زبان."
                ),
                VocabWord(
                    english = "usage",
                    persian = "کاربرد",
                    pronunciation = "/ˈjuːsɪdʒ/",
                    partOfSpeech = "noun",
                    example = "Usage varies by region.",
                    examplePersian = "کاربرد بسته به منطقه فرق داره.",
                    wordFamily = "use, useable",
                    usageTip = "در زبان‌شناسی."
                ),
                VocabWord(
                    english = "fluency",
                    persian = "روانی",
                    pronunciation = "/ˈfluːənsi/",
                    partOfSpeech = "noun",
                    example = "Idioms improve fluency.",
                    examplePersian = "اصطلاحات روانی را بهتر می‌کنند.",
                    wordFamily = "fluent, fluently",
                    usageTip = "هدف یادگیری."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "break the ice",
                    persian = "شروع مکالمه",
                    example = "He told a joke to break the ice.",
                    examplePersian = "یه جوک گفت تا مکالمه شروع کنه.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "hit the books",
                    persian = "درس خواندن",
                    example = "I need to hit the books tonight.",
                    examplePersian = "امشب باید درس بخونم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "piece of cake",
                    persian = "خیلی راحت",
                    example = "The exam was a piece of cake.",
                    examplePersian = "امتحان خیلی راحت بود.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "under the weather",
                    persian = "حالش خوب نبودن",
                    example = "I'm feeling under the weather today.",
                    examplePersian = "امروز حالم خوب نیست.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "once in a blue moon",
                    persian = "خیلی به‌ندرت",
                    example = "I eat fast food once in a blue moon.",
                    examplePersian = "خیلی به‌ندرت فست‌فود می‌خورم.",
                    register = "idiom"
                ),
                IdiomExpression(
                    english = "let the cat out of the bag",
                    persian = "راز را فاش کردن",
                    example = "She let the cat out of the bag.",
                    examplePersian = "او راز را فاش کرد.",
                    register = "idiom"
                ),
                IdiomExpression(
                    english = "call it a day",
                    persian = "کار را تمام کردن",
                    example = "Let's call it a day.",
                    examplePersian = "بیا کار را تمام کنیم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "burn the midnight oil",
                    persian = "تا دیروقت کار کردن",
                    example = "He's been burning the midnight oil.",
                    examplePersian = "او تا دیروقت کار می‌کرده.",
                    register = "idiom"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "give up",
                    meaning = "to stop doing",
                    persian = "ترک کردن",
                    example = "He gave up smoking.",
                    examplePersian = "او سیگار را ترک کرد."
                ),
                PhrasalVerb(
                    verb = "look after",
                    meaning = "to take care of",
                    persian = "مراقبت کردن",
                    example = "She looks after her little sister.",
                    examplePersian = "او از خواهر کوچکش مراقبت می‌کند."
                ),
                PhrasalVerb(
                    verb = "turn on",
                    meaning = "to activate",
                    persian = "روشن کردن",
                    example = "Turn on the TV.",
                    examplePersian = "تلویزیون را روشن کن."
                ),
                PhrasalVerb(
                    verb = "look forward to",
                    meaning = "to await with pleasure",
                    persian = "بی‌صبرانه منتظر بودن",
                    example = "I look forward to seeing you.",
                    examplePersian = "بی‌صبرانه منتظر دیدنت هستم."
                ),
                PhrasalVerb(
                    verb = "put off",
                    meaning = "to postpone",
                    persian = "به تعویق انداختن",
                    example = "Don't put off your homework.",
                    examplePersian = "تکالیفت را به تعویق نینداز."
                ),
                PhrasalVerb(
                    verb = "get along with",
                    meaning = "to have a good relationship",
                    persian = "کنار آمدن",
                    example = "I get along with my colleagues.",
                    examplePersian = "با همکارانم کنار می‌آیم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Stress in phrasal verbs",
                    content = "در phrasal verbs، حرف اضافه/قید تأکید می‌گیرد:\n• LOOK after\n• GIVE up\n• TURN on"
                ),
                PronunciationTip(
                    title = "Linking in phrasal verbs",
                    content = "در گفتار طبیعی، phrasal verb به هم می‌چسبد:\n• give up → /ɡɪv ʌp/\n• look after → /lʊk ˈæftər/"
                ),
                PronunciationTip(
                    title = "Idiomatic stress",
                    content = "در idioms، کلمات اصلی تأکید می‌گیرند:\n• BREAK the ICE\n• PIECE of CAKE"
                ),
                PronunciationTip(
                    title = "Contractions in idioms",
                    content = "در گفتار طبیعی:\n• I'm under the weather\n• It's a piece of cake"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Idioms in daily conversation",
                    content = "انگلیسی‌زبانان زیاد از idioms در مکالمات روزمره استفاده می‌کنند: 'It's raining cats and dogs!'"
                ),
                CulturalNote(
                    title = "Formal vs informal idioms",
                    content = "برخی idioms غیررسمی هستند و در متن رسمی جایی ندارند: 'It's a piece of cake' در نوشتار رسمی مناسب نیست."
                ),
                CulturalNote(
                    title = "Regional differences",
                    content = "برخی idioms در انگلیسی آمریکایی رایجند و برخی در بریتانیایی: 'a piece of cake' در هر دو رایجه."
                ),
                CulturalNote(
                    title = "Learning idioms",
                    content = "یادگیری idioms به درک فرهنگی و تسلط زبانی کمک می‌کند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Phrasal Verbs: Overview",
                    content = """
Phrasal verb = verb + preposition/adverb

انواع:
1. Transitive (با مفعول):
   • turn on the TV
   • give up smoking

2. Intransitive (بدون مفعول):
   • wake up
   • come back

3. Separable (قابل تفکیک):
   • turn on the TV / turn the TV on
   • pick up the phone / pick the phone up

4. Inseparable (غیرقابل تفکیک):
   • look after the baby (نه look the baby after)
   • get along with (نه get with along)

نکته: در separable phrasal verbs، اگر مفعول ضمیر باشد، باید وسط بیاید:
• Turn it on. (نه Turn on it)
• Pick it up. (نه Pick up it)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Common Separable Phrasal Verbs",
                    content = """
افعال عبارتی قابل تفکیک:

turn on/off, pick up, put on, take off, throw away, give up, write down, turn up/down, wake up, ring up, look up, bring up, call off, put off, cut down, hand in

مثال:
• Turn on the light. / Turn the light on.
• Pick up the phone. / Pick the phone up.
• Put on your coat. / Put your coat on.
• Turn it on. / (نه Turn on it)
• Give it up. / (نه Give up it)

نکته: با ضمیر، مفعول باید وسط باشد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Common Inseparable Phrasal Verbs",
                    content = """
افعال عبارتی غیرقابل تفکیک:

look after, look for, look forward to, get along with, take after, run into, come across, deal with, get over, put up with, do without, call on, focus on, believe in, depend on

مثال:
• Look after the baby. (نه Look the baby after)
• Look for your keys. (نه Look your keys for)
• Get along with people. (نه Get with people along)
• Deal with problems. (نه Deal problems with)

نکته: در inseparable phrasal verbs، مفعول همیشه بعد از فعل می‌آید.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Phrasal Verbs with Different Meanings",
                    content = """
برخی phrasal verbs معانی متفاوتی دارند:

take off:
• The plane took off. (بلند شد)
• Take off your coat. (درآور)
• Her career really took off. (شکوفا شد)

get over:
• Get over the fence. (از روی)
• Get over an illness. (بهبود)
• Get over a breakup. (فراموش کردن)

put up:
• Put up a poster. (نصب کردن)
• Put up with noise. (تحمل کردن)
• Put up a fight. (مقاومت)

look up:
• Look up the word. (جستجو)
• Things are looking up. (بهتر شدن)

نکته: context تعیین‌کننده معنی است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Idioms: Categories",
                    content = """
دسته‌بندی اصطلاحات:

1. Related to body:
   • break a leg
   • all ears
   • give someone a hand

2. Related to food:
   • piece of cake
   • spill the beans
   • apple of my eye

3. Related to animals:
   • let the cat out of the bag
   • raining cats and dogs
   • hold your horses

4. Related to weather:
   • under the weather
   • every cloud has a silver lining
   • come rain or shine

5. Related to time:
   • once in a blue moon
   • better late than never
   • time flies

نکته: یادگیری idioms به صورت موضوعی مؤثرتر است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Using Idioms Appropriately",
                    content = """
در انتخاب idiom به این نکات توجه کنید:

1. Register (لحن):
   • Formal: at your earliest convenience
   • Informal: asap (as soon as possible)

2. Context (زمینه):
   • در محیط کار: professional idioms
   • در مکالمات دوستانه: casual idioms

3. Frequency:
   • Common idioms: break the ice, piece of cake
   • Rare idioms: bite the bullet (قدیمی)

4. Cultural appropriateness:
   • برخی idioms در فرهنگ‌های دیگر ممکن است بی‌ادبانه باشند

نکته: تنها idioms رایج و مناسب را یاد بگیرید.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Idioms in Different Contexts",
                    content = """
کاربرد idioms:

در محل کار:
• Let's touch base. (تماس برقرار کنیم)
• Think outside the box. (خارج از چارچوب فکر کن)
• Ballpark figure. (عدد تقریبی)

در مکالمات دوستانه:
• It's a piece of cake.
• Break a leg!
• Long time no see!

در موقعیت‌های سخت:
• Bite the bullet.
• Keep your chin up.
• When it rains, it pours.

نکته: idiom باید در context مناسب استفاده شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Strategies for Learning",
                    content = """
راهکارهای یادگیری phrasal verbs و idioms:

1. یادگیری در context:
   • کتاب، فیلم، مکالمه
   • یادداشت مثال‌ها

2. گروه‌بندی موضوعی:
   • idioms مربوط به کار
   • idioms مربوط به احساسات

3. تمرین تولیدی:
   • استفاده در جملات خود
   • مکالمه روزانه

4. مرور منظم:
   • Flashcards
   • تمرین‌های تعاملی

5. تصویرسازی:
   • برای هر idiom یک تصویر ذهنی بسازید

6. جستجو در دیکشنری‌های تخصصی:
   • Longman Phrasal Verbs Dictionary
   • Cambridge Idioms Dictionary

نکته: کیفیت مهم‌تر از کمیت است — ۲۰۰ idiom رایج به‌جای ۲۰۰۰ نادر.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "Turn on it.",
                    correct = "Turn it on.",
                    explanation = "با ضمیر، مفعول باید وسط phrasal verb separable بیاید."
                ),
                CommonMistake(
                    wrong = "Look the word up in a dictionary.",
                    correct = "Look up the word in a dictionary. / Look the word up in a dictionary.",
                    explanation = "look up قابل تفکیک است، ولی در برخی ساختارها مفعول وسط می‌آید."
                ),
                CommonMistake(
                    wrong = "Look after the baby — نمی‌شود 'look the baby after'.",
                    correct = "Look after the baby.",
                    explanation = "look after غیرقابل تفکیک است."
                ),
                CommonMistake(
                    wrong = "I look forward to see you.",
                    correct = "I look forward to seeing you.",
                    explanation = "بعد از look forward to، gerund می‌آید (to حرف اضافه است)."
                ),
                CommonMistake(
                    wrong = "He gave up it.",
                    correct = "He gave it up.",
                    explanation = "give up قابل تفکیک است و با ضمیر، مفعول وسط می‌آید."
                ),
                CommonMistake(
                    wrong = "I'm interesting in this book.",
                    correct = "I'm interested in this book.",
                    explanation = "interested (حالت) نه interesting (خصوصیت)."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Emma",
                    english = "Hey, long time no see! How have you been?",
                    persian = "هی، چه مدت ندیدمت! چطور بوده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "I've been under the weather lately, but I'm getting over it.",
                    persian = "اخیراً حالم خوب نبوده، ولی دارم بهتر می‌شم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Sorry to hear that. You should take it easy.",
                    persian = "متأسفم. باید سخت نگیری."
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "I know. I've been burning the midnight oil too much.",
                    persian = "می‌دانم. خیلی تا دیروقت کار کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "You need to slow down. Health is more important than work.",
                    persian = "باید سرعتت را کم کنی. سلامتی مهم‌تر از کاره."
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "You're right. I'll try to cut down on overtime.",
                    persian = "حق داری. سعی می‌کنم اضافه‌کاری را کم کنم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Good. Have you been doing anything fun?",
                    persian = "خوبه. کار سرگرم‌کننده‌ای کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "Not really. I've been putting off my hobbies.",
                    persian = "نه واقعاً. سرگرمی‌هام را به تعویق انداخته‌ام."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "You should pick them up again. They help you relax.",
                    persian = "باید دوباره شروعشون کنی. به آرامشت کمک می‌کنن."
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "I will. I might take up painting again.",
                    persian = "می‌کنم. شاید نقاشی رو دوباره شروع کنم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "That's a great idea. What about your family?",
                    persian = "ایده عالیه. خانواده‌ات چطورن؟"
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "They've been doing well. I get along with them better now.",
                    persian = "خوبن. الان بهتر با اون‌ها کنار میام."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "That's good to hear. Let's catch up more often.",
                    persian = "خوبه که می‌شنوم. بیا بیشتر همو ببینیم."
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "Definitely. We should hang out soon.",
                    persian = "قطعاً. باید به‌زودی با هم وقت بگذرونیم."
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "How about this weekend? We could grab a bite.",
                    persian = "این آخر هفته چطوره؟ می‌تونیم یه چیزی بخوریم."
                ),
                DialogueLine(
                    speaker = "Ramin",
                    english = "That sounds great. Let's do it!",
                    persian = "عالی به نظر می‌رسه. بیا انجامش بدیم!"
                ),
                DialogueLine(
                    speaker = "Emma",
                    english = "Perfect. I'll text you the details.",
                    persian = "عالی. جزئیات را پیامک می‌کنم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "How has Ramin been feeling?",
                    answer = "He's been under the weather but is getting over it."
                ),
                ComprehensionQuestion(
                    question = "What has Ramin been doing too much?",
                    answer = "He's been burning the midnight oil."
                ),
                ComprehensionQuestion(
                    question = "What will Ramin try to do?",
                    answer = "He'll try to cut down on overtime."
                ),
                ComprehensionQuestion(
                    question = "What has Ramin been putting off?",
                    answer = "He's been putting off his hobbies."
                ),
                ComprehensionQuestion(
                    question = "What does Ramin suggest he might do?",
                    answer = "He might take up painting again."
                ),
                ComprehensionQuestion(
                    question = "What do they decide to do this weekend?",
                    answer = "They decide to hang out and grab a bite."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about a hobby you've taken up or given up.",
                    promptPersian = "درباره سرگرمی که شروع کرده‌ای یا ترک کرده‌ای صحبت کن.",
                    hints = "Use: I've taken up..., I've given up..., I've been putting off..."
                ),
                SpeakingTask(
                    prompt = "Discuss how you handle difficult situations.",
                    promptPersian = "درباره چگونگی مدیریت موقعیت‌های دشوار صحبت کن.",
                    hints = "Use idioms: bite the bullet, keep your chin up, look on the bright side"
                ),
                SpeakingTask(
                    prompt = "Talk about a person you get along with.",
                    promptPersian = "درباره کسی که با او کنار می‌آیی صحبت کن.",
                    hints = "Use: We get along..., We hang out..., We catch up..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an informal letter to a friend (about 200 words). Use at least 8 phrasal verbs and 5 idioms.",
                    promptPersian = "یه نامه غیررسمی به یه دوست بنویس (حدود ۲۰۰ کلمه). حداقل هشت فعل عبارتی و پنج اصطلاح به کار ببر.",
                    wordCount = 200,
                    hints = "Structure:\n1. Greeting\n2. Recent news\n3. Plans\n4. Closing"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "Turn on it.",
                        "Turn it on.",
                        "Turn on it please.",
                        "It turn on."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'break the ice' mean?",
                    options = listOf(
                        "یخ را شکستن",
                        "شروع مکالمه",
                        "سرد شدن",
                        "پایان دادن"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I look forward to ___ you.",
                    options = listOf("see", "seeing", "saw", "seen"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'piece of cake' mean?",
                    options = listOf(
                        "تکه کیک",
                        "خیلی راحت",
                        "شیرینی",
                        "خوشمزه"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is inseparable?",
                    options = listOf("turn on", "look after", "pick up", "put on"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'under the weather' mean?",
                    options = listOf(
                        "زیر باران",
                        "حالش خوب نیست",
                        "خوشحال",
                        "سلامت"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: Let's ___ a day.",
                    options = listOf("call", "calling", "called", "calls"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'give up' mean?",
                    options = listOf(
                        "بالا رفتن",
                        "ترک کردن",
                        "پایین آمدن",
                        "خرید کردن"
                    ),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 11 — Emphatic Structures and Inversion
    // ============================================================
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Emphatic Structures and Inversion",
            titlePersian = "ساختارهای تأکیدی و وارونگی",
            objectives = listOf(
                "Use cleft sentences for emphasis.",
                "Apply inversion after negative adverbials.",
                "Use emphatic do/does/did.",
                "Master rhetorical structures for formal writing.",
                "Avoid common errors in emphatic sentences."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "emphasis",
                    persian = "تأکید",
                    pronunciation = "/ˈemfəsɪs/",
                    partOfSpeech = "noun",
                    example = "Emphasis is important in writing.",
                    examplePersian = "تأکید در نوشتار مهمه.",
                    wordFamily = "emphasize, emphatic",
                    usageTip = "در ساختارهای تأکیدی."
                ),
                VocabWord(
                    english = "cleft sentence",
                    persian = "جمله شکافته",
                    pronunciation = "/kleft ˈsentəns/",
                    partOfSpeech = "noun",
                    example = "It was John who broke the window.",
                    examplePersian = "جان بود که پنجره را شکست.",
                    usageTip = "برای تأکید."
                ),
                VocabWord(
                    english = "inversion",
                    persian = "وارونگی",
                    pronunciation = "/ɪnˈvɜːrʒən/",
                    partOfSpeech = "noun",
                    example = "Inversion adds emphasis.",
                    examplePersian = "وارونگی تأکید اضافه می‌کند.",
                    wordFamily = "invert, inverted",
                    usageTip = "در نوشتار رسمی."
                ),
                VocabWord(
                    english = "rhetorical",
                    persian = "بلاغی",
                    pronunciation = "/rɪˈtɔːrɪkəl/",
                    partOfSpeech = "adjective",
                    example = "Rhetorical devices enhance writing.",
                    examplePersian = "آرایه‌های بلاغی نوشتار را بهتر می‌کنند.",
                    wordFamily = "rhetoric",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "literary",
                    persian = "ادبی",
                    pronunciation = "/ˈlɪtəreri/",
                    partOfSpeech = "adjective",
                    example = "Inversion is common in literary texts.",
                    examplePersian = "وارونگی در متون ادبی رایجه.",
                    wordFamily = "literature, literate",
                    usageTip = "در ادبیات."
                ),
                VocabWord(
                    english = "formal",
                    persian = "رسمی",
                    pronunciation = "/ˈfɔːrməl/",
                    partOfSpeech = "adjective",
                    example = "Inversion is formal.",
                    examplePersian = "وارونگی رسمیه.",
                    antonyms = "informal",
                    usageTip = "در نوشتار رسمی."
                ),
                VocabWord(
                    english = "negation",
                    persian = "منفی‌سازی",
                    pronunciation = "/nɪˈɡeɪʃən/",
                    partOfSpeech = "noun",
                    example = "Inversion follows negation.",
                    examplePersian = "وارونگی بعد از منفی‌سازی می‌آید.",
                    wordFamily = "negate, negative",
                    usageTip = "در وارونگی."
                ),
                VocabWord(
                    english = "adverbial",
                    persian = "قیدی",
                    pronunciation = "/ædˈvɜːrbiəl/",
                    partOfSpeech = "adjective",
                    example = "Negative adverbials trigger inversion.",
                    examplePersian = "قیدهای منفی وارونگی را فعال می‌کنند.",
                    usageTip = "در وارونگی."
                ),
                VocabWord(
                    english = "fronting",
                    persian = "جلو آوردن",
                    pronunciation = "/ˈfrʌntɪŋ/",
                    partOfSpeech = "noun",
                    example = "Fronting changes emphasis.",
                    examplePersian = "جلو آوردن تأکید را تغییر می‌دهد.",
                    usageTip = "در ساختار تأکیدی."
                ),
                VocabWord(
                    english = "structure",
                    persian = "ساختار",
                    pronunciation = "/ˈstrʌktʃər/",
                    partOfSpeech = "noun",
                    example = "This is a complex structure.",
                    examplePersian = "این یه ساختار پیچیده‌ست.",
                    wordFamily = "structural, structurally",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "effect",
                    persian = "اثر",
                    pronunciation = "/ɪˈfekt/",
                    partOfSpeech = "noun",
                    example = "Emphatic structures create effect.",
                    examplePersian = "ساختارهای تأکیدی اثر می‌سازند.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "impact",
                    persian = "تأثیر",
                    pronunciation = "/ˈɪmpækt/",
                    partOfSpeech = "noun",
                    example = "Inversion has a strong impact.",
                    examplePersian = "وارونگی تأثیر قوی داره.",
                    usageTip = "در نوشتار."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "if ever",
                    persian = "اگر اصلاً",
                    example = "Rarely, if ever, does he complain.",
                    examplePersian = "به‌ندرت، اگر اصلاً، شکایت می‌کند.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "no sooner said than done",
                    persian = "گفته و انجام‌شده",
                    example = "No sooner said than done.",
                    examplePersian = "گفته و انجام‌شده.",
                    register = "idiom"
                ),
                IdiomExpression(
                    english = "not only ... but also",
                    persian = "نه تنها ... بلکه",
                    example = "Not only did she win, but she also set a record.",
                    examplePersian = "نه تنها برد، بلکه رکورد هم شکست.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "put forward",
                    meaning = "to propose",
                    persian = "ارائه دادن",
                    example = "She put forward a compelling argument.",
                    examplePersian = "او استدلال قوی‌ای ارائه داد."
                ),
                PhrasalVerb(
                    verb = "point out",
                    meaning = "to indicate",
                    persian = "اشاره کردن",
                    example = "He pointed out the flaw in the argument.",
                    examplePersian = "او به نقص استدلال اشاره کرد."
                ),
                PhrasalVerb(
                    verb = "sum up",
                    meaning = "to summarize",
                    persian = "خلاصه کردن",
                    example = "To sum up, we need more time.",
                    examplePersian = "خلاصه کنم، به وقت بیشتری نیاز داریم."
                ),
                PhrasalVerb(
                    verb = "bring about",
                    meaning = "to cause",
                    persian = "ایجاد کردن",
                    example = "Hard work brought about his success.",
                    examplePersian = "کار سخت موفقیتش را ایجاد کرد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Emphatic stress",
                    content = "در ساختار تأکیدی، کلمه تأکید شده استرس می‌گیرد:\n• It was JOHN who broke it.\n• I DID call you."
                ),
                PronunciationTip(
                    title = "Inversion stress",
                    content = "در وارونگی، فعل کمکی تأکید می‌گیرد:\n• Never HAVE I seen such beauty.\n• Rarely DOES she complain."
                ),
                PronunciationTip(
                    title = "Falling intonation in emphatic",
                    content = "در جملات تأکیدی، آهنگ نزولی:\n• It was HIM who did it. ↓"
                ),
                PronunciationTip(
                    title = "Pause for emphasis",
                    content = "در گفتار، مکث کوتاه قبل از بخش تأکیدی:\n• What I want is... a break."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Emphasis in political speeches",
                    content = "در سخنرانی‌های سیاسی، از cleft sentences و inversion برای تأکید استفاده می‌شود."
                ),
                CulturalNote(
                    title = "Literary usage",
                    content = "نویسندگان از inversion برای ایجاد حس درام استفاده می‌کنند."
                ),
                CulturalNote(
                    title = "Academic writing",
                    content = "در نوشتار آکادمیک، cleft sentences برای برجسته کردن یافته‌ها: 'It is this factor that explains...'"
                ),
                CulturalNote(
                    title = "Advertising language",
                    content = "در تبلیغات، از تأکید برای جلب توجه استفاده می‌شود: 'What you need is...'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Cleft Sentences: It-Cleft",
                    content = """
ساختار: It + be + emphasized part + that/who + rest

برای تأکید روی:
• فاعل: It was John who broke the window.
• مفعول: It was the window that John broke.
• مکان: It was in Paris that they met.
• زمان: It was last year that we moved.

مثال‌ها:
• It was her honesty that impressed me.
• It was in 2010 that the project started.
• It was the manager who made the decision.
• It is this problem that we need to solve.

نکته: it-cleft در گفتار و نوشتار رایج است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Cleft Sentences: Wh-Cleft",
                    content = """
ساختار: What + verb + be + emphasized part

برای تأکید روی:
• مفعول: What I need is a break.
• فاعل: What surprised me was her reaction.
• عمل: What he did was apologize.

مثال‌ها:
• What I want is some peace and quiet.
• What matters most is your health.
• What he said was completely wrong.
• What we need is more time.

نکته: wh-cleft برای تأکید روی اطلاعات جدید در انتهای جمله استفاده می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Inversion after Negative Adverbials",
                    content = """
ساختار: Negative adverbial + auxiliary + subject + verb

قیدهای منفی که وارونگی ایجاد می‌کنند:
never, rarely, seldom, hardly, scarcely, no sooner, not only, not until, nowhere, little

مثال‌ها:
• Never have I seen such a beautiful sunset.
• Rarely does she complain.
• Hardly had I arrived when the phone rang.
• No sooner had we left than it started raining.
• Not only did she win, but she also set a record.
• Little did he know about the danger.

نکته: این ساختار رسمی و ادبی است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Inversion after Adverbials of Place",
                    content = """
ساختار: Adverbial + verb + subject

قیدهای مکان در ابتدای جمله (فقط با افعال حرکتی):

• Here comes the bus.
• There goes the bell.
• On the hill stood an old castle.
• In the corner sat a small dog.
• Under the tree lay a sleeping cat.

با افعال be و افعال حرکتی (come, go, stand, sit, lie, walk):

نکته: با ضمایر، وارونگی نمی‌شود:
• Here it comes. (نه Here comes it)
• There she goes. (نه There goes she)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Emphatic Do/Does/Did",
                    content = """
ساختار: do/does/did + base verb

برای تأکید روی فعل مثبت:

• I DO love you.
• She DOES work hard.
• He DID call you. (واقعاً زنگ زد)
• We DO appreciate your help.
• They DID finish the project.

کاربردها:
1. تأکید روی فعل مثبت (در مقابل منفی)
2. رد کردن یک ادعا
3. ابراز احساس قوی

مثال در جمله:
• "You don't care!" — "I DO care!"
• "She doesn't like me." — "She DOES like you!"

نکته: در گفتار، فعل emphatic تأکید می‌گیرد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Inversion in Conditional Sentences",
                    content = """
در جملات شرطی رسمی، if حذف و وارونگی ایجاد می‌شود:

Should + subject:
• Should you need help, let me know.
• Should it rain, we'll cancel.

Were + subject:
• Were I in your position, I'd ask for more.
• Were she here, she'd know what to do.

Had + subject:
• Had I known, I would have acted differently.
• Had they left earlier, they wouldn't have missed the flight.

نکته: این ساختار رسمی است و در گفتار روزمره کمتر استفاده می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Fronting for Emphasis",
                    content = """
جلو آوردن بخشی از جمله برای تأکید:

Object fronting:
• This book, I really enjoyed.
• Her attitude, I couldn't stand.

Adjective fronting:
• Beautiful was the sunset.
• Strange was his behavior.

Adverb fronting:
• Slowly he walked away.
• Quietly she closed the door.

نکته: این ساختار در ادبیات و نوشتار رسمی رایج است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Rhetorical Structures Summary",
                    content = """
ساختارهای بلاغی رایج:

1. It-cleft: It was X that...
2. Wh-cleft: What I need is...
3. Inversion: Never have I...
4. Emphatic do: I DO love...
5. Fronting: This book, I loved.
6. Rhetorical questions: Who knows?
7. Tricolon: I came, I saw, I conquered.
8. Anaphora: We will fight... we will fight... we will fight.
9. Antithesis: Not A, but B.

کاربردها:
• سخنرانی
• ادبیات
• تبلیغات
• نوشتار آکادمیک

نکته: استفاده بیش از حد از این ساختارها می‌تواند مصنوعی به نظر برسد.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "Never I have seen such beauty.",
                    correct = "Never have I seen such beauty.",
                    explanation = "بعد از قید منفی، وارونگی."
                ),
                CommonMistake(
                    wrong = "It was John broke the window.",
                    correct = "It was John who broke the window.",
                    explanation = "در it-cleft، who/that لازم است."
                ),
                CommonMistake(
                    wrong = "What I need a break.",
                    correct = "What I need is a break.",
                    explanation = "در wh-cleft، فعل be لازم است."
                ),
                CommonMistake(
                    wrong = "Here comes it.",
                    correct = "Here it comes.",
                    explanation = "با ضمایر، وارونگی نمی‌شود."
                ),
                CommonMistake(
                    wrong = "Not only she won, but she also set a record.",
                    correct = "Not only did she win, but she also set a record.",
                    explanation = "بعد از not only، وارونگی."
                ),
                CommonMistake(
                    wrong = "Had I would have known...",
                    correct = "Had I known...",
                    explanation = "در inverted conditional سوم شرطی، past participle بدون would have."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Layla",
                    english = "What impressed me most was his honesty.",
                    persian = "چیزی که بیشتر تحت تأثیرم قرار داد صداقتش بود."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Yes! It was his integrity that made him stand out.",
                    persian = "بله! درستکاری‌اش بود که او را متمایز کرد."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Rarely have I met such a genuine person.",
                    persian = "به‌ندرت چنین فرد صادقی دیده‌ام."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Me neither. Not only was he honest, but he was also brave.",
                    persian = "منم همین‌طور. نه تنها صادق بود، بلکه شجاع هم بود."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "What he did took real courage.",
                    persian = "کاری که کرد شجاعت واقعی می‌خواست."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I agree. Never have I seen such determination.",
                    persian = "موافقم. هرگز چنین اراده‌ای ندیده‌ام."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "It was in that moment that I realized the importance of integrity.",
                    persian = "در همان لحظه بود که اهمیت درستکاری را فهمیدم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "What matters most is doing the right thing, not what's easy.",
                    persian = "مهم‌ترین چیز انجام کار درست است، نه کار آسان."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Exactly. Not only did he stand up for what was right, but he also inspired others.",
                    persian = "دقیقاً. نه تنها برای درستی ایستاد، بلکه به دیگران هم الهام بخشید."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "If only more people were like him.",
                    persian = "ای کاش افراد بیشتری مثل او بودند."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Well, it starts with each of us. We DO have the power to make a difference.",
                    persian = "خب، از هر کدام از ما شروع می‌شه. ما واقعاً قدرت ایجاد تفاوت داریم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "You're right. Little did I know how much his story would affect me.",
                    persian = "حق داری. اصلاً نمی‌دانستم داستانش چقدر بر من تأثیر می‌گذارد."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "What we need now is more stories like this.",
                    persian = "چیزی که الان نیاز داریم داستان‌های بیشتری از این نوعه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Definitely. It's these stories that give us hope.",
                    persian = "قطعاً. این داستان‌ها هستند که به ما امید می‌دهند."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Well said. Let's remember his example.",
                    persian = "خوب گفتی. بیا نمونه‌اش را به یاد داشته باشیم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I will. Never will I forget his courage.",
                    persian = "من هم. هرگز شجاعتش را فراموش نمی‌کنم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What impressed Layla most?",
                    answer = "His honesty."
                ),
                ComprehensionQuestion(
                    question = "What made the person stand out?",
                    answer = "His integrity."
                ),
                ComprehensionQuestion(
                    question = "How rare is such a person?",
                    answer = "Rarely has Layla met such a genuine person."
                ),
                ComprehensionQuestion(
                    question = "What qualities did the person have?",
                    answer = "He was honest, brave, and determined."
                ),
                ComprehensionQuestion(
                    question = "When did Layla realize the importance of integrity?",
                    answer = "It was in that moment."
                ),
                ComprehensionQuestion(
                    question = "What does Layla say we need now?",
                    answer = "More stories like this one."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Emphasize the most important information in a story using cleft sentences.",
                    promptPersian = "مهم‌ترین اطلاعات در یک داستان را با cleft sentences تأکید کن.",
                    hints = "Use: It was X that... / What matters is... / It is Y who..."
                ),
                SpeakingTask(
                    prompt = "Use inversion to emphasize strong emotions.",
                    promptPersian = "با وارونگی احساسات قوی را تأکید کن.",
                    hints = "Use: Never have I... / Rarely does... / Not only did..."
                ),
                SpeakingTask(
                    prompt = "Emphasize a point in an argument using emphatic structures.",
                    promptPersian = "در یک بحث، نکته‌ای را با ساختارهای تأکیدی برجسته کن.",
                    hints = "Use: I DO believe... / It is X that... / What I really want to say is..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a persuasive essay (about 250 words). Use cleft sentences, inversion, and emphatic do at least twice each.",
                    promptPersian = "یه مقاله متقاعدکننده بنویس (حدود ۲۵۰ کلمه). از cleft sentences، inversion و emphatic do حداقل دوبار هرکدام استفاده کن.",
                    wordCount = 250,
                    hints = "Structure:\n1. Strong opening\n2. Body with emphasis\n3. Rhetorical questions\n4. Strong conclusion"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: Never ___ I seen such beauty.",
                    options = listOf("have", "has", "had", "having"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: It was John ___ broke the window.",
                    options = listOf("that", "who", "which", "whose"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: What I need ___ a break.",
                    options = listOf("is", "are", "was", "were"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: Rarely ___ she complain.",
                    options = listOf("do", "does", "did", "is"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "Not only she won, but she also set a record.",
                        "Not only did she win, but she also set a record.",
                        "Not only she did win, but she also set a record.",
                        "Not only won she, but she also set a record."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: Here ___ the bus.",
                    options = listOf("come", "comes", "coming", "came"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ care about you.",
                    options = listOf("do", "does", "did", "am"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: ___ I known, I would have come.",
                    options = listOf("If", "Had", "Have", "Did"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 12 — Review and Advanced Practice
    // ============================================================
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review and Advanced Practice",
            titlePersian = "مرور و تمرین پیشرفته",
            objectives = listOf(
                "Review all major grammatical structures.",
                "Integrate multiple structures in complex sentences.",
                "Identify and correct common errors.",
                "Prepare for advanced English usage.",
                "Build confidence in sophisticated communication."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "sophisticated",
                    persian = "پیچیده، پیشرفته",
                    pronunciation = "/səˈfɪstɪkeɪtɪd/",
                    partOfSpeech = "adjective",
                    example = "His English is very sophisticated.",
                    examplePersian = "انگلیسی‌اش خیلی پیشرفته است.",
                    usageTip = "در توصیف مهارت زبانی."
                ),
                VocabWord(
                    english = "nuance",
                    persian = "ظرافت، نکته دقیق",
                    pronunciation = "/ˈnuːɑːns/",
                    partOfSpeech = "noun",
                    example = "Understanding nuance is key.",
                    examplePersian = "درک ظرافت کلیدیه.",
                    usageTip = "در زبان پیشرفته."
                ),
                VocabWord(
                    english = "register",
                    persian = "لحن",
                    pronunciation = "/ˈredʒɪstər/",
                    partOfSpeech = "noun",
                    example = "Formal register is different from informal.",
                    examplePersian = "لحن رسمی با غیررسمی متفاوته.",
                    usageTip = "در سبک‌شناسی."
                ),
                VocabWord(
                    english = "cohesion",
                    persian = "انسجام",
                    pronunciation = "/koʊˈhiːʒən/",
                    partOfSpeech = "noun",
                    example = "Cohesion is important in writing.",
                    examplePersian = "انسجام در نوشتار مهمه.",
                    wordFamily = "cohesive, cohesively",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "coherence",
                    persian = "هم‌بستگی معنایی",
                    pronunciation = "/koʊˈhɪrəns/",
                    partOfSpeech = "noun",
                    example = "Coherence makes text clear.",
                    examplePersian = "هم‌بستگی معنایی متن را واضح می‌کند.",
                    wordFamily = "coherent, coherently",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "accuracy",
                    persian = "دقت",
                    pronunciation = "/ˈækjərəsi/",
                    partOfSpeech = "noun",
                    example = "Accuracy is essential in advanced writing.",
                    examplePersian = "دقت در نوشتار پیشرفته ضروریه.",
                    wordFamily = "accurate, accurately",
                    usageTip = "در یادگیری."
                ),
                VocabWord(
                    english = "proficiency",
                    persian = "تسلط",
                    pronunciation = "/prəˈfɪʃənsi/",
                    partOfSpeech = "noun",
                    example = "She has advanced proficiency in English.",
                    examplePersian = "او تسلط پیشرفته در انگلیسی داره.",
                    wordFamily = "proficient, proficiently",
                    usageTip = "در ارزیابی زبان."
                ),
                VocabWord(
                    english = "mastery",
                    persian = "چیرگی",
                    pronunciation = "/ˈmæstəri/",
                    partOfSpeech = "noun",
                    example = "Mastery takes time.",
                    examplePersian = "چیرگی زمان می‌بره.",
                    wordFamily = "master, masterful",
                    usageTip = "در یادگیری."
                ),
                VocabWord(
                    english = "fluency",
                    persian = "روانی",
                    pronunciation = "/ˈfluːənsi/",
                    partOfSpeech = "noun",
                    example = "Fluency develops with practice.",
                    examplePersian = "روانی با تمرین رشد می‌کنه.",
                    wordFamily = "fluent, fluently",
                    usageTip = "در زبان."
                ),
                VocabWord(
                    english = "integrate",
                    persian = "یکپارچه کردن",
                    pronunciation = "/ˈɪntɪɡreɪt/",
                    partOfSpeech = "verb",
                    example = "Integrate different structures.",
                    examplePersian = "ساختارهای مختلف را یکپارچه کن.",
                    wordFamily = "integration, integrated",
                    usageTip = "در یادگیری."
                ),
                VocabWord(
                    english = "articulate",
                    persian = "روشن بیان کردن",
                    pronunciation = "/ɑːrˈtɪkjəleɪt/",
                    partOfSpeech = "verb",
                    example = "She can articulate complex ideas clearly.",
                    examplePersian = "او می‌تواند ایده‌های پیچیده را روشن بیان کند.",
                    wordFamily = "articulation, articulately",
                    usageTip = "در ارتباط."
                ),
                VocabWord(
                    english = "engaged",
                    persian = "درگیر، مشغول",
                    pronunciation = "/ɪnˈɡeɪdʒd/",
                    partOfSpeech = "adjective",
                    example = "Keep the reader engaged.",
                    examplePersian = "خواننده را درگیر نگه دار.",
                    wordFamily = "engage, engaging",
                    usageTip = "در نوشتار."
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
                    content = "کوتاه‌سازی‌ها:\n• I'm, you're, he's, she's, we're, they're\n• don't, doesn't, didn't, isn't, aren't\n• I've, you've, he's, she's\n• I'll, you'll, he'll, she'll\n• I'd, you'd, he'd, she'd"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Lifelong learning",
                    content = "در فرهنگ‌های انگلیسی‌زبان، یادگیری زبان یک فرایند مادام‌العمر است، نه یک هدف نهایی."
                ),
                CulturalNote(
                    title = "Real-world practice",
                    content = "بهترین راه پیشرفت، استفاده واقعی از زبان در موقعیت‌های واقعی است: مکالمه، سفر، کار."
                ),
                CulturalNote(
                    title = "Register awareness",
                    content = "درک تفاوت بین لحن رسمی و غیررسمی برای موفقیت در ارتباطات ضروری است."
                ),
                CulturalNote(
                    title = "Cultural sensitivity",
                    content = "زبان در بستر فرهنگی معنا پیدا می‌کند؛ درک فرهنگ‌های انگلیسی‌زبان به استفاده دقیق‌تر کمک می‌کند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Comprehensive Tense Review",
                    content = """
جدول جامع زمان‌ها:

| Tense | Structure | Use |
|-------|-----------|-----|
| Present Simple | I work | عادت‌ها |
| Present Continuous | I am working | در حال انجام |
| Present Perfect | I have worked | تجربه/ادامه |
| Present Perfect Continuous | I have been working | مدت تا حال |
| Past Simple | I worked | رویداد تمام‌شده |
| Past Continuous | I was working | در حال انجام گذشته |
| Past Perfect | I had worked | قبل از گذشته |
| Past Perfect Continuous | I had been working | مدت قبل از گذشته |
| Future Simple | I will work | آینده |
| Future Going To | I am going to work | قصد |
| Future Continuous | I will be working | در حال انجام آینده |
| Future Perfect | I will have worked | قبل از آینده |
| Future Perfect Continuous | I will have been working | مدت تا آینده |
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Modal Verbs: Complete Review",
                    content = """
جدول جامع modals:

| Modal | Use | Example |
|-------|-----|---------|
| can | ability, permission | I can swim. |
| could | past ability, polite | Could you help? |
| may | possibility, formal permission | It may rain. |
| might | weak possibility | She might come. |
| must | strong obligation, deduction | You must wear a seatbelt. |
| have to | external obligation | I have to work. |
| should | advice | You should rest. |
| ought to | formal advice | You ought to see a doctor. |
| will | future | I'll call you. |
| would | polite request, conditional | Would you help? |
| shall | suggestion, formal future | Shall we go? |

Modal perfects:
• must have: certainty about past
• might/could have: possibility
• should have: regret
• would have: conditional past
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Passive Voice: Complete Review",
                    content = """
Passive in all tenses:

| Tense | Passive |
|-------|---------|
| Present Simple | is/are + pp |
| Present Continuous | is/are being + pp |
| Present Perfect | has/have been + pp |
| Past Simple | was/were + pp |
| Past Continuous | was/were being + pp |
| Past Perfect | had been + pp |
| Future Simple | will be + pp |
| Future Perfect | will have been + pp |
| Modals | modal + be + pp |
| Perfect Infinitive | to have been + pp |

ساختارهای special:
• Impersonal: It is said that...
• Personal: He is said to be...
• Causative: I had my hair cut.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Conditionals: Complete Review",
                    content = """
| Type | Structure | Use |
|------|-----------|-----|
| Zero | If + present, present | حقایق |
| First | If + present, will | موقعیت واقعی |
| Second | If + past, would | فرضی |
| Third | If + past perfect, would have | پشیمانی |
| Mixed A | If + past perfect, would | گذشته + حال |
| Mixed B | If + past, would have | حال + گذشته |
| Inverted 1 | Should + subj | formal |
| Inverted 2 | Were + subj | formal |
| Inverted 3 | Had + subj | formal |

Alternatives:
• unless, provided that, in case, suppose, imagine
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Reported Speech: Complete Review",
                    content = """
Key changes:
• Tense shift (backshift)
• Pronoun changes
• Time/Place changes

| Direct | Reported |
|--------|----------|
| Present → Past | |
| Past → Past Perfect | |
| will → would | |
| can → could | |
| now → then | |
| today → that day | |
| tomorrow → the next day | |

Structures:
• Statements: say/tell + that
• Questions: ask + if/wh-word
• Commands: tell/ask + to + inf
• Suggestions: suggest + gerund/that
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Relative Clauses: Complete Review",
                    content = """
Types:
• Defining: essential, no commas
• Non-defining: extra info, with commas

Relative pronouns:
• who: people (subject)
• whom: people (object, formal)
• whose: possession
• which: things
• that: people + things (defining)
• where: places
• when: times

Reduced:
• Active: -ing
• Passive: -ed

Cleft:
• It was X that...
• What I need is...
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Complex Sentence Structures",
                    content = """
ترکیب ساختارها:

Example 1 — Conditionals + Modals:
If I had studied harder, I could have passed the exam.

Example 2 — Passive + Reported Speech:
The report is said to have been submitted last week.

Example 3 — Relative + Conditional:
Anyone who wants to succeed should work hard.

Example 4 — Cleft + Passive:
It was the new policy that was introduced yesterday.

Example 5 — Inversion + Perfect:
Never have I seen such a well-designed project.

Example 6 — Subjunctive + Wish:
I wish I had known, and I suggest that you be more careful.

نکته: ترکیب ساختارها مهارت پیشرفته‌ای است که با تمرین به دست می‌آید.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Errors: Advanced",
                    content = """
چک‌لیست اشتباهات پیشرفته:

1. Third conditional بدون past perfect:
❌ If I would have known...
✅ If I had known...

2. Modal perfect بدون have:
❌ I should studied.
✅ I should have studied.

3. Backshift ناقص:
❌ He said he is busy.
✅ He said he was busy.

4. Passive ناقص:
❌ The work must finished.
✅ The work must be finished.

5. Inversion بدون auxiliary:
❌ Never I have seen.
✅ Never have I seen.

6. Causative اشتباه:
❌ I had my hair cut by myself.
✅ I cut my own hair. / I had my hair cut.

7. Relative pronoun حذف نادرست:
❌ The man lives next door is my uncle.
✅ The man who lives next door is my uncle.

8. Gerund/Infinitive:
❌ I enjoy to read.
✅ I enjoy reading.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "If I would have known, I would have come.",
                    correct = "If I had known, I would have come.",
                    explanation = "در if-clause سوم شرطی، past perfect بدون would have."
                ),
                CommonMistake(
                    wrong = "I should studied harder.",
                    correct = "I should have studied harder.",
                    explanation = "Modal perfect نیاز به have + pp دارد."
                ),
                CommonMistake(
                    wrong = "He said he is busy.",
                    correct = "He said he was busy.",
                    explanation = "Backshift: is → was."
                ),
                CommonMistake(
                    wrong = "The work must finished.",
                    correct = "The work must be finished.",
                    explanation = "با modals، be + pp."
                ),
                CommonMistake(
                    wrong = "Never I have seen such beauty.",
                    correct = "Never have I seen such beauty.",
                    explanation = "بعد از قید منفی، وارونگی."
                ),
                CommonMistake(
                    wrong = "The man lives next door is my uncle.",
                    correct = "The man who lives next door is my uncle.",
                    explanation = "ضمیر موصولی فاعل حذف نمی‌شود."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Layla",
                    english = "You've really come a long way with your English.",
                    persian = "واقعاً در انگلیسی‌ات پیشرفت زیادی کرده‌ای."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Thanks! I've been working hard on it.",
                    persian = "ممنون! سخت روش کار کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "What do you find most challenging?",
                    persian = "چی رو بیشترین چالش می‌دونی؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I used to struggle with conditionals, but now they make sense.",
                    persian = "قبلاً با شرطی‌ها مشکل داشتم، ولی الان برام منطقی شده."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "That's great. What about passive voice?",
                    persian = "عالیه. مجهول چطور؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "It used to be hard, but I've gotten used to it.",
                    persian = "قبلاً سخت بود، ولی بهش عادت کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Nice. Have you tried using inversion?",
                    persian = "خوبه. وارونگی رو امتحان کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Yes, but rarely do I use it in conversation.",
                    persian = "بله، ولی به‌ندرت در مکالمه استفاده‌اش می‌کنم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "It's more common in writing. Not only is it formal, but it also adds emphasis.",
                    persian = "در نوشتار رایج‌تره. نه تنها رسمیه، بلکه تأکید هم اضافه می‌کنه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "You're right. I should practice more.",
                    persian = "حق داری. باید بیشتر تمرین کنم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "What I'd suggest is reading more advanced texts.",
                    persian = "چیزی که پیشنهاد می‌کنم خواندن متن‌های پیشرفته‌تره."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Good idea. If I had started that earlier, I would be even better now.",
                    persian = "ایده خوبیه. اگه زودتر شروع کرده بودم، الان حتی بهتر بودم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "It's never too late. And if I were you, I'd also practice writing.",
                    persian = "هیچ‌وقت دیر نیست. و اگه جای تو بودم، نوشتن رو هم تمرین می‌کردم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I will. Thanks for the advice.",
                    persian = "می‌کنم. ممنون برای توصیه."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Anytime. Practice makes perfect!",
                    persian = "هر وقت. کار نیکو کردن از پر کردن است!"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "True. Rome wasn't built in a day!",
                    persian = "درسته. رم در یک روز ساخته نشد!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What did Reza use to struggle with?",
                    answer = "He used to struggle with conditionals."
                ),
                ComprehensionQuestion(
                    question = "How has Reza's relationship with passive voice changed?",
                    answer = "He used to find it hard but has gotten used to it."
                ),
                ComprehensionQuestion(
                    question = "Where is inversion more common?",
                    answer = "It's more common in writing."
                ),
                ComprehensionQuestion(
                    question = "What does Layla suggest?",
                    answer = "Reading more advanced texts and practicing writing."
                ),
                ComprehensionQuestion(
                    question = "What would Reza do differently?",
                    answer = "He would have started reading advanced texts earlier."
                ),
                ComprehensionQuestion(
                    question = "What does Layla say at the end?",
                    answer = "Practice makes perfect and Rome wasn't built in a day."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your English learning journey using multiple structures.",
                    promptPersian = "درباره مسیر یادگیری انگلیسی‌ات با استفاده از چندین ساختار صحبت کن.",
                    hints = "Use: I've been..., I used to..., If I had..., What I find... is..."
                ),
                SpeakingTask(
                    prompt = "Discuss grammar challenges and how you've overcome them.",
                    promptPersian = "درباره چالش‌های گرامری و چگونگی غلبه بر آن‌ها صحبت کن.",
                    hints = "Use: I had difficulty..., I used to struggle with..., What helped me was..."
                ),
                SpeakingTask(
                    prompt = "Give advice about learning English using advanced structures.",
                    promptPersian = "با ساختارهای پیشرفته درباره یادگیری انگلیسی توصیه کن.",
                    hints = "Use: If I were you..., What I'd suggest..., It's essential that..., Not only..., but also..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a reflective essay (about 300 words) on your English learning journey. Use at least 15 different advanced grammar structures.",
                    promptPersian = "یه مقاله بازتابی بنویس (حدود ۳۰۰ کلمه) درباره مسیر یادگیری انگلیسی‌ات. حداقل ۱۵ ساختار گرامری پیشرفته مختلف به کار ببر.",
                    wordCount = 300,
                    hints = "Include:\n1. When you started\n2. Challenges you faced\n3. What you've learned\n4. Your future goals\n5. Advice for others"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: If I had known, I ___ have come.",
                    options = listOf("will", "would", "have", "had"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I should ___ studied harder.",
                    options = listOf("have", "has", "had", "having"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: He said he ___ busy.",
                    options = listOf("is", "was", "were", "be"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The work must ___ finished.",
                    options = listOf("be", "is", "been", "being"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: Never ___ I seen such beauty.",
                    options = listOf("have", "has", "had", "having"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'I look forward to seeing you' mean?",
                    options = listOf(
                        "منتظر دیدن تو هستم",
                        "دوستت دارم",
                        "تو را می‌بینم",
                        "خداحافظ"
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: It was John ___ broke the window.",
                    options = listOf("that", "who", "which", "whose"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I've been living here ___ 5 years.",
                    options = listOf("since", "for", "in", "at"),
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