package com.zabanyar.ai.data.books.grammar

import com.zabanyar.ai.data.*

object AdvancedGrammar {

    const val BOOK_ID = "advanced_grammar"

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
    // CHAPTER 1 — Subjunctive and Unreal Past
    // ============================================================
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Subjunctive and Unreal Past",
            titlePersian = "وجه وصفی و گذشته غیرواقعی",
            objectives = listOf(
                "Master the subjunctive mood in formal English.",
                "Use the unreal past in various structures.",
                "Distinguish between real and unreal conditions.",
                "Apply subjunctive in academic and formal writing.",
                "Use the unreal past for hypothetical scenarios."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "subjunctive",
                    persian = "وجه وصفی",
                    pronunciation = "/səbˈdʒʌŋktɪv/",
                    partOfSpeech = "noun",
                    example = "The subjunctive is used in formal English.",
                    examplePersian = "وجه وصفی در انگلیسی رسمی استفاده می‌شود.",
                    usageTip = "در دستورها و آرزوها."
                ),
                VocabWord(
                    english = "mood",
                    persian = "وجه",
                    pronunciation = "/muːd/",
                    partOfSpeech = "noun",
                    example = "English has three main moods.",
                    examplePersian = "انگلیسی سه وجه اصلی دارد.",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "indicative",
                    persian = "اخباری",
                    pronunciation = "/ɪnˈdɪkətɪv/",
                    partOfSpeech = "adjective",
                    example = "The indicative mood is used for facts.",
                    examplePersian = "وجه اخباری برای حقایق استفاده می‌شود.",
                    usageTip = "وجه اصلی در انگلیسی."
                ),
                VocabWord(
                    english = "imperative",
                    persian = "امری",
                    pronunciation = "/ɪmˈperətɪv/",
                    partOfSpeech = "adjective",
                    example = "The imperative is used for commands.",
                    examplePersian = "وجه امری برای دستورها استفاده می‌شود.",
                    usageTip = "در دستورها."
                ),
                VocabWord(
                    english = "hypothetical",
                    persian = "فرضی",
                    pronunciation = "/ˌhaɪpəˈθetɪkəl/",
                    partOfSpeech = "adjective",
                    example = "This is a hypothetical situation.",
                    examplePersian = "این یه وضعیت فرضیه.",
                    wordFamily = "hypothesis, hypothesize",
                    usageTip = "در unreal past."
                ),
                VocabWord(
                    english = "unreal",
                    persian = "غیرواقعی",
                    pronunciation = "/ˌʌnˈriːəl/",
                    partOfSpeech = "adjective",
                    example = "The unreal past expresses impossibility.",
                    examplePersian = "گذشته غیرواقعی غیرممکن بودن را بیان می‌کند.",
                    usageTip = "در wish, if only."
                ),
                VocabWord(
                    english = "counterfactual",
                    persian = "خلاف واقع",
                    pronunciation = "/ˌkaʊntərˈfæktʃuəl/",
                    partOfSpeech = "adjective",
                    example = "Third conditional is counterfactual.",
                    examplePersian = "سوم شرطی خلاف واقع است.",
                    usageTip = "در سوم شرطی."
                ),
                VocabWord(
                    english = "optative",
                    persian = "آرزویی",
                    pronunciation = "/ˈɑːptətɪv/",
                    partOfSpeech = "adjective",
                    example = "The optative expresses wishes.",
                    examplePersian = "وجه آرزویی آرزوها را بیان می‌کند.",
                    usageTip = "در wish."
                ),
                VocabWord(
                    english = "mandative",
                    persian = "الزامی",
                    pronunciation = "/ˈmændətɪv/",
                    partOfSpeech = "adjective",
                    example = "The mandative subjunctive is used after verbs of demand.",
                    examplePersian = "وجه وصفی الزامی بعد از افعال درخواست استفاده می‌شود.",
                    usageTip = "در subjunctive."
                ),
                VocabWord(
                    english = "formal register",
                    persian = "لحن رسمی",
                    pronunciation = "/ˈfɔːrməl ˈredʒɪstər/",
                    partOfSpeech = "noun",
                    example = "The subjunctive is more common in formal register.",
                    examplePersian = "وجه وصفی در لحن رسمی رایج‌تره.",
                    usageTip = "در آکادمیک."
                ),
                VocabWord(
                    english = "wish",
                    persian = "آرزو کردن",
                    pronunciation = "/wɪʃ/",
                    partOfSpeech = "verb",
                    example = "I wish I had more time.",
                    examplePersian = "ای کاش وقت بیشتری داشتم.",
                    usageTip = "با unreal past."
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
                    english = "as it were",
                    persian = "به‌اصطلاح",
                    example = "He is, as it were, a walking dictionary.",
                    examplePersian = "او به‌اصطلاح یه دیکشنری متحرکه.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "so to speak",
                    persian = "به‌اصطلاح",
                    example = "He was, so to speak, the backbone of the team.",
                    examplePersian = "او به‌اصطلاح ستون فقرات تیم بود.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "call for",
                    meaning = "to require",
                    persian = "نیاز داشتن",
                    example = "The situation calls for immediate action.",
                    examplePersian = "وضعیت نیازمند اقدام فوریه."
                ),
                PhrasalVerb(
                    verb = "long for",
                    meaning = "to wish for strongly",
                    persian = "اشتیاق داشتن",
                    example = "She longed for a simpler life.",
                    examplePersian = "او به زندگی ساده‌تری اشتیاق داشت."
                ),
                PhrasalVerb(
                    verb = "yearn for",
                    meaning = "to want deeply",
                    persian = "آرزو داشتن",
                    example = "He yearned for his homeland.",
                    examplePersian = "او آرزوی وطنش را داشت."
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
                    title = "Stress in unreal past",
                    content = "در unreal past، تأکید روی فعل اصلی:\n• I wish I HAD STUDIED.\n• If only he WERE here."
                ),
                PronunciationTip(
                    title = "Reduced 'as it were'",
                    content = "در گفتار طبیعی:\n• as it were → /əz ɪt wɜːr/"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Subjunctive in American vs British English",
                    content = "در انگلیسی آمریکایی، subjunctive رایج‌تر است: 'I suggest that he go.' در بریتانیایی، اغلب should اضافه می‌شود: 'I suggest that he should go.'"
                ),
                CulturalNote(
                    title = "Formal writing",
                    content = "در نوشتار رسمی، استفاده از subjunctive نشان‌دهنده دقت و بلاغت است."
                ),
                CulturalNote(
                    title = "Wish in daily conversation",
                    content = "انگلیسی‌زبانان زیاد از wish برای ابراز آرزو یا پشیمانی استفاده می‌کنند: 'I wish I could come.'"
                ),
                CulturalNote(
                    title = "Literary usage",
                    content = "در متون ادبی، subjunctive و unreal past بیشتر استفاده می‌شوند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. What is the Subjunctive Mood?",
                    content = """
وجه وصفی (Subjunctive) برای بیان خواسته، پیشنهاد، ضرورت و فرضیات غیرواقعی.

سه وجه اصلی در انگلیسی:
• Indicative: بیان حقایق
  I work here.
• Imperative: بیان دستور
  Work here!
• Subjunctive: بیان خواسته، پیشنهاد، ضرورت
  I suggest that he work here.

ساختار: پایه فعل (base form) برای همه اشخاص
• I insist that she BE present.
• It's essential that he COME early.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Mandative Subjunctive (after verbs)",
                    content = """
افعالی که subjunctive می‌گیرند:

suggest, recommend, propose, demand, insist, request, urge, command, order, ask, desire, prefer, require, move

ساختار: verb + that + subject + base verb

مثال:
• I suggest that he GO.
• She recommends that we BE careful.
• They demanded that he RESIGN.
• The doctor insisted that she STAY in bed.
• He requested that we NOT BE late.

منفی: not + base verb
• I suggest that he not go.
• She insisted that they not leave.

نکته: در انگلیسی بریتانیایی، اغلب should اضافه می‌شود:
• I suggest that he should go.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Mandative Subjunctive (after adjectives)",
                    content = """
ساختار: it's + adjective + that + subject + base verb

صفات رایج:
essential, crucial, important, vital, necessary, imperative, advisable, desirable, urgent, fitting, appropriate

مثال:
• It's essential that everyone BE present.
• It's crucial that we ACT now.
• It's important that he ARRIVE on time.
• It's necessary that she SEE a doctor.
• It's vital that they KNOW the truth.

منفی:
• It's essential that he NOT be late.
• It's important that she NOT forget.

نکته: ساختار رسمی و ادبی است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Unreal Past in Wish",
                    content = """
Wish + past simple (برای حال غیرواقعی):
• I wish I had more time.
• She wishes she could travel.
• He wishes he knew the answer.

با be: از were برای همه اشخاص (فرمال):
• I wish I were taller.
• She wishes she were younger.
• They wish it were summer.

Wish + past perfect (برای گذشته):
• I wish I had studied harder.
• She wishes she hadn't said that.
• He wishes he had taken the job.

Wish + would (برای شکایت از رفتار):
• I wish you would stop smoking.
• She wishes he would listen more.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Unreal Past in If Only",
                    content = """
If only = wish قوی‌تر:

For present:
• If only I had more time!
• If only he were here!
• If only we could travel!

For past:
• If only I had studied!
• If only she had listened!
• If only they had come!

For complaints (with would):
• If only he would listen!
• If only you would stop!

نکته: if only قوی‌تر از wish است و اغلب با تعجب همراه است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Unreal Past in It's Time / Would Rather",
                    content = """
It's (high) time + past simple:
• It's time you went to bed.
• It's high time she found a job.
• It's time we left.

معنی: وقتش رسیده که کاری انجام شود.

Would rather + past simple (برای اشخاص مختلف):
• I'd rather you didn't smoke here.
• She'd rather he came later.
• They'd rather we didn't mention it.

Would rather + base verb (برای خودمان):
• I'd rather stay home tonight.
• She'd rather walk than drive.

نکته: وقتی فاعل دو جمله متفاوت است، از past simple استفاده می‌کنیم.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. As If / As Though",
                    content = """
با as if / as though:

Unreal present: as if + past simple
• He talks as if he knew everything.
• She acts as if she were the boss.
• They behave as if nothing had happened.

Unreal past: as if + past perfect
• He looked as if he had seen a ghost.
• She felt as if she had been there before.

Real situation: as if + present (زمانی که موقعیت واقعی است)
• It looks as if it's going to rain. (واقعاً به نظر می‌رسد)

نکته: as if + past simple = موقعیت غیرواقعی.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Formal Subjunctive in Fixed Expressions",
                    content = """
عبارات ثابت با subjunctive:

• Come what may. (هر چه پیش آید)
• Be that as it may. (با این حال)
• Suffice it to say. (همین بس که)
• So be it. (بگذار چنین باشد)
• God bless you. (خدا خیرت دهد)
• Long live the king! (زنده باد پادشاه!)
• Heaven forbid! (خدا نکند!)
• Far be it from me. (دور باشد از من)

نکته: این عبارات در انگلیسی مدرن کمتر رایجند ولی در متون رسمی و ادبی دیده می‌شوند.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I suggest that he goes.",
                    correct = "I suggest that he go.",
                    explanation = "در mandative subjunctive، base verb بدون -s."
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
                    speaker = "Dr. Leila",
                    english = "It's essential that all participants be present at the meeting.",
                    persian = "ضروری است که همه شرکت‌کنندگان در جلسه حاضر باشند."
                ),
                DialogueLine(
                    speaker = "Dr. Karim",
                    english = "I agree. I suggest that we send reminders to everyone.",
                    persian = "موافقم. پیشنهاد می‌کنم برای همه یادآوری بفرستیم."
                ),
                DialogueLine(
                    speaker = "Dr. Leila",
                    english = "Yes, that's a good idea. It's crucial that no one miss this meeting.",
                    persian = "بله، ایده خوبیه. حیاتی است که هیچ‌کس این جلسه را از دست ندهد."
                ),
                DialogueLine(
                    speaker = "Dr. Karim",
                    english = "Should I prepare a detailed agenda?",
                    persian = "آجندای مفصلی آماده کنم؟"
                ),
                DialogueLine(
                    speaker = "Dr. Leila",
                    english = "Yes, please. It's important that the agenda be distributed in advance.",
                    persian = "بله، لطفاً. مهم است که آجندا از قبل توزیع شود."
                ),
                DialogueLine(
                    speaker = "Dr. Karim",
                    english = "Understood. I wish we had more time to prepare.",
                    persian = "فهمیدم. ای کاش وقت بیشتری برای آماده‌سازی داشتیم."
                ),
                DialogueLine(
                    speaker = "Dr. Leila",
                    english = "I know. If only we had known about this earlier!",
                    persian = "می‌دانم. ای کاش زودتر از این موضوع مطلع شده بودیم!"
                ),
                DialogueLine(
                    speaker = "Dr. Karim",
                    english = "True. But let's make the best of it.",
                    persian = "درسته. ولی بیا بهترین استفاده را ازش ببریم."
                ),
                DialogueLine(
                    speaker = "Dr. Leila",
                    english = "Agreed. I'd rather have a shorter meeting than a rushed one.",
                    persian = "موافقم. ترجیح می‌دهم جلسه کوتاه‌تری داشته باشیم تا جلسه عجولانه."
                ),
                DialogueLine(
                    speaker = "Dr. Karim",
                    english = "Good point. What if we focus on the most critical topics?",
                    persian = "نکته خوبی. اگه روی موضوعات حیاتی تمرکز کنیم چطور؟"
                ),
                DialogueLine(
                    speaker = "Dr. Leila",
                    english = "That's exactly what I'd suggest. It's vital that we prioritize.",
                    persian = "دقیقاً همین را پیشنهاد می‌کنم. حیاتی است که اولویت‌بندی کنیم."
                ),
                DialogueLine(
                    speaker = "Dr. Karim",
                    english = "Consider it done. Anything else?",
                    persian = "همین کار رو می‌کنم. چیز دیگه‌ای هست؟"
                ),
                DialogueLine(
                    speaker = "Dr. Leila",
                    english = "It's advisable that we also notify the client about the change.",
                    persian = "توصیه می‌شود که مشتری را هم از تغییر مطلع کنیم."
                ),
                DialogueLine(
                    speaker = "Dr. Karim",
                    english = "I'll do that. I wish things were simpler sometimes.",
                    persian = "این کار را می‌کنم. ای کاش بعضی وقت‌ها همه چیز ساده‌تر بود."
                ),
                DialogueLine(
                    speaker = "Dr. Leila",
                    english = "I know the feeling. But we handle it professionally.",
                    persian = "می‌دانم چه حسی داری. ولی حرفه‌ای مدیریتش می‌کنیم."
                ),
                DialogueLine(
                    speaker = "Dr. Karim",
                    english = "You're right. Let's get to work.",
                    persian = "حق داری. بریم سر کار."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is essential according to Dr. Leila?",
                    answer = "That all participants be present at the meeting."
                ),
                ComprehensionQuestion(
                    question = "What does Dr. Karim suggest?",
                    answer = "He suggests that they send reminders to everyone."
                ),
                ComprehensionQuestion(
                    question = "What does Dr. Leila wish?",
                    answer = "She wishes they had more time to prepare."
                ),
                ComprehensionQuestion(
                    question = "What would Dr. Leila rather have?",
                    answer = "She'd rather have a shorter meeting than a rushed one."
                ),
                ComprehensionQuestion(
                    question = "What does Dr. Leila say is vital?",
                    answer = "That they prioritize."
                ),
                ComprehensionQuestion(
                    question = "What is advisable according to Dr. Leila?",
                    answer = "That they notify the client about the change."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Make formal suggestions using subjunctive.",
                    promptPersian = "با subjunctive پیشنهادهای رسمی بده.",
                    hints = "Use: I suggest that..., It's essential that..., I recommend that..."
                ),
                SpeakingTask(
                    prompt = "Express wishes and regrets using wish/if only.",
                    promptPersian = "با wish/if only آرزوها و پشیمانی‌ها را بیان کن.",
                    hints = "Use: I wish I had..., If only I could..., I wish it were..."
                ),
                SpeakingTask(
                    prompt = "Give advice using unreal past structures.",
                    promptPersian = "با ساختارهای unreal past توصیه کن.",
                    hints = "Use: It's time you..., I'd rather you..., It's high time..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a formal letter (about 250 words) using subjunctive structures to make recommendations. Include unreal past for expressing regrets.",
                    promptPersian = "یه نامه رسمی بنویس (حدود ۲۵۰ کلمه) با استفاده از ساختارهای subjunctive برای ارائه توصیه‌ها. شامل unreal past برای بیان پشیمانی‌ها.",
                    wordCount = 250,
                    hints = "Structure:\n1. Opening\n2. Suggestions using subjunctive\n3. Regrets using wish\n4. Closing"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I suggest that he ___ to the meeting.",
                    options = listOf("goes", "go", "going", "went"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: It's essential that everyone ___ present.",
                    options = listOf("is", "be", "are", "was"),
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
                    question = "Complete: It's time you ___ to bed.",
                    options = listOf("go", "went", "will go", "going"),
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
                        "He talks as if he knows everything.",
                        "He talks as if he knew everything.",
                        "He talks as if he know everything.",
                        "He talks as if he knowing everything."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'If only' express?",
                    options = listOf("اگر تنها", "آرزوی قوی", "اگر نه", "اگر ممکن"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 2 — Inversion and Emphasis
    // ============================================================
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Inversion and Emphasis",
            titlePersian = "وارونگی و تأکید",
            objectives = listOf(
                "Master inversion after negative adverbials.",
                "Use inversion in formal and literary contexts.",
                "Apply cleft sentences for emphasis.",
                "Use emphatic structures in writing.",
                "Distinguish between various emphatic forms."
            ),
            vocabulary = listOf(
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
                    english = "cleft sentence",
                    persian = "جمله شکافته",
                    pronunciation = "/kleft ˈsentəns/",
                    partOfSpeech = "noun",
                    example = "It was John who broke the window.",
                    examplePersian = "جان بود که پنجره را شکست.",
                    usageTip = "برای تأکید."
                ),
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
                    english = "fronting",
                    persian = "جلو آوردن",
                    pronunciation = "/ˈfrʌntɪŋ/",
                    partOfSpeech = "noun",
                    example = "Fronting changes emphasis.",
                    examplePersian = "جلو آوردن تأکید را تغییر می‌دهد.",
                    usageTip = "در ساختار تأکیدی."
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
                    usageTip = "در ادبیات."
                ),
                VocabWord(
                    english = "dramatic",
                    persian = "نمایشی، دراماتیک",
                    pronunciation = "/drəˈmætɪk/",
                    partOfSpeech = "adjective",
                    example = "Inversion creates a dramatic effect.",
                    examplePersian = "وارونگی اثر دراماتیک ایجاد می‌کند.",
                    wordFamily = "drama, dramatically",
                    usageTip = "در سبک."
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
                    english = "structure",
                    persian = "ساختار",
                    pronunciation = "/ˈstrʌktʃər/",
                    partOfSpeech = "noun",
                    example = "This is a complex structure.",
                    examplePersian = "این یه ساختار پیچیده‌ست.",
                    wordFamily = "structural",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "impact",
                    persian = "تأثیر",
                    pronunciation = "/ˈɪmpækt/",
                    partOfSpeech = "noun",
                    example = "Inversion has a strong impact.",
                    examplePersian = "وارونگی تأثیر قوی داره.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "rhetoric",
                    persian = "بلاغت",
                    pronunciation = "/ˈretərɪk/",
                    partOfSpeech = "noun",
                    example = "Rhetoric uses inversion for effect.",
                    examplePersian = "بلاغت از وارونگی برای اثر استفاده می‌کند.",
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
                    title = "Inversion stress",
                    content = "در وارونگی، فعل کمکی تأکید می‌گیرد:\n• Never HAVE I seen such beauty.\n• Rarely DOES she complain."
                ),
                PronunciationTip(
                    title = "Cleft sentence stress",
                    content = "در cleft sentences، بخش تأکید شده استرس می‌گیرد:\n• It was JOHN who broke it."
                ),
                PronunciationTip(
                    title = "Emphatic do stress",
                    content = "در emphatic do، فعل اصلی تأکید می‌گیرد:\n• I DO care about you."
                ),
                PronunciationTip(
                    title = "Falling intonation",
                    content = "در جملات تأکیدی، آهنگ نزولی:\n• It was HIM who did it. ↓"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Inversion in speeches",
                    content = "در سخنرانی‌های سیاسی، از inversion و cleft sentences برای تأکید و ایجاد حس درام استفاده می‌شود."
                ),
                CulturalNote(
                    title = "Literary usage",
                    content = "نویسندگان از inversion برای ایجاد حس ادبی و دراماتیک استفاده می‌کنند."
                ),
                CulturalNote(
                    title = "Academic writing",
                    content = "در نوشتار آکادمیک، cleft sentences برای برجسته کردن یافته‌ها استفاده می‌شود."
                ),
                CulturalNote(
                    title = "Advertising",
                    content = "در تبلیغات، از تأکید برای جلب توجه استفاده می‌شود."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Inversion after Negative Adverbials",
                    content = """
ساختار: Negative adverbial + auxiliary + subject + verb

قیدهای منفی که وارونگی ایجاد می‌کنند:
never, rarely, seldom, hardly, scarcely, no sooner, not only, not until, nowhere, little, only

مثال‌ها:
• Never have I seen such a beautiful sunset.
• Rarely does she complain.
• Hardly had I arrived when the phone rang.
• No sooner had we left than it started raining.
• Not only did she win, but she also set a record.
• Little did he know about the danger.
• Only then did I understand.

نکته: این ساختار رسمی و ادبی است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Inversion with 'Only'",
                    content = """
ساختار: Only + adverbial + auxiliary + subject + verb

مثال‌ها:
• Only later did I realize my mistake.
• Only when she left did I understand her value.
• Only after the meeting did we decide.
• Only in this way can we succeed.
• Only by working hard will you achieve your goals.

نکته: When only در ابتدای جمله می‌آید، وارونگی در clause اصلی رخ می‌دهد، نه در clause بعد از only.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Inversion in Conditional Sentences",
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
                    title = "5. It-Cleft Sentences",
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
                    title = "6. Wh-Cleft Sentences",
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
                    title = "7. Emphatic Do/Does/Did",
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
                    title = "8. Fronting for Emphasis",
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

Rhetorical structures:
• Tricolon: I came, I saw, I conquered.
• Anaphora: We will fight... we will fight... we will fight.
• Antithesis: Not A, but B.

نکته: این ساختار در ادبیات و نوشتار رسمی رایج است.
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
                    wrong = "Only then I understood.",
                    correct = "Only then did I understand.",
                    explanation = "بعد از only + adverbial، وارونگی."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Never have I seen such a compelling argument.",
                    persian = "هرگز چنین استدلال قوی‌ای ندیده‌ام."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "It was her detailed research that made the difference.",
                    persian = "این تحقیق دقیق او بود که تفاوت را ایجاد کرد."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Exactly. Not only was she thorough, but she was also insightful.",
                    persian = "دقیقاً. نه تنها دقیق بود، بلکه بصیرت هم داشت."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Rarely do we see such a combination of skills.",
                    persian = "به‌ندرت چنین ترکیبی از مهارت‌ها را می‌بینیم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "What impressed me most was her ability to explain complex ideas simply.",
                    persian = "چیزی که بیشتر تحت تأثیرم قرار داد توانایی او در توضیح ساده ایده‌های پیچیده بود."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "I DO agree with you. That's a rare talent.",
                    persian = "کاملاً موافقم. این یه استعداد کم‌یابه."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Only later did I realize how much preparation she had done.",
                    persian = "فقط بعداً فهمیدم چقدر آماده‌سازی کرده بود."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Hardly had she started when she made an impact.",
                    persian = "تازه شروع کرده بود که تأثیرگذار شد."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "What I'd suggest is that we learn from her approach.",
                    persian = "چیزی که پیشنهاد می‌کنم اینه که از رویکردش یاد بگیریم."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Should we invite her to give a workshop?",
                    persian = "آیا او را دعوت کنیم که کارگاه برگزار کند؟"
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Yes, absolutely. Not only would it benefit our team, but it would also strengthen collaboration.",
                    persian = "بله، قطعاً. نه تنها به تیممون کمک می‌کنه، بلکه همکاری رو هم تقویت می‌کنه."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Had I known she was available, I would have suggested it earlier.",
                    persian = "اگه می‌دونستم در دسترسه، زودتر پیشنهاد می‌کردم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "It's never too late. Let's reach out today.",
                    persian = "هیچ‌وقت دیر نیست. بیا امروز تماس بگیریم."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Agreed. What matters is that we act now.",
                    persian = "قبول. مهم اینه که همین حالا اقدام کنیم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Well said.",
                    persian = "خوب گفتی."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What made the difference in the argument?",
                    answer = "It was her detailed research."
                ),
                ComprehensionQuestion(
                    question = "What was she both?",
                    answer = "She was both thorough and insightful."
                ),
                ComprehensionQuestion(
                    question = "What impressed Dr. Layla most?",
                    answer = "Her ability to explain complex ideas simply."
                ),
                ComprehensionQuestion(
                    question = "When did Dr. Layla realize the preparation?",
                    answer = "Only later."
                ),
                ComprehensionQuestion(
                    question = "What does Dr. Layla suggest?",
                    answer = "That they learn from her approach."
                ),
                ComprehensionQuestion(
                    question = "What would invite her to do?",
                    answer = "Give a workshop."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Emphasize important points using inversion.",
                    promptPersian = "نکات مهم را با وارونگی تأکید کن.",
                    hints = "Use: Never have I..., Rarely does..., Not only did..., Only then..."
                ),
                SpeakingTask(
                    prompt = "Use cleft sentences to highlight information.",
                    promptPersian = "با cleft sentences اطلاعات را برجسته کن.",
                    hints = "Use: It was X that..., What I need is..., It is Y who..."
                ),
                SpeakingTask(
                    prompt = "Emphasize strong opinions using emphatic structures.",
                    promptPersian = "نظرات قوی را با ساختارهای تأکیدی بیان کن.",
                    hints = "Use: I DO believe..., What matters is..., It's this that..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a persuasive essay (about 300 words). Use inversion, cleft sentences, and emphatic structures extensively.",
                    promptPersian = "یه مقاله متقاعدکننده بنویس (حدود ۳۰۰ کلمه). از وارونگی، cleft sentences و ساختارهای تأکیدی به‌طور گسترده استفاده کن.",
                    wordCount = 300,
                    hints = "Structure:\n1. Strong opening with inversion\n2. Body with cleft sentences\n3. Rhetorical questions\n4. Powerful conclusion"
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
                    question = "Complete: Only then ___ I understand.",
                    options = listOf("do", "did", "was", "have"),
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
    // CHAPTER 3 — Complex Noun Phrases
    // ============================================================
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Complex Noun Phrases",
            titlePersian = "گروه اسمی پیچیده",
            objectives = listOf(
                "Master complex noun phrases with multiple modifiers.",
                "Use pre-modifiers and post-modifiers correctly.",
                "Apply appositives and noun complements.",
                "Use participles and infinitives as modifiers.",
                "Construct sophisticated noun phrases for academic writing."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "noun phrase",
                    persian = "گروه اسمی",
                    pronunciation = "/naʊn freɪz/",
                    partOfSpeech = "noun",
                    example = "The complex noun phrase is difficult to parse.",
                    examplePersian = "گروه اسمی پیچیده سخت تجزیه می‌شود.",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "modifier",
                    persian = "توصیف‌کننده",
                    pronunciation = "/ˈmɑːdɪfaɪər/",
                    partOfSpeech = "noun",
                    example = "Modifiers add information.",
                    examplePersian = "توصیف‌کننده‌ها اطلاعات اضافه می‌کنند.",
                    wordFamily = "modify, modification",
                    usageTip = "در گروه اسمی."
                ),
                VocabWord(
                    english = "pre-modifier",
                    persian = "پیش‌توصیف‌کننده",
                    pronunciation = "/ˌpriː ˈmɑːdɪfaɪər/",
                    partOfSpeech = "noun",
                    example = "Adjectives are pre-modifiers.",
                    examplePersian = "صفت‌ها پیش‌توصیف‌کننده هستند.",
                    usageTip = "قبل از اسم."
                ),
                VocabWord(
                    english = "post-modifier",
                    persian = "پس‌توصیف‌کننده",
                    pronunciation = "/ˌpoʊst ˈmɑːdɪfaɪər/",
                    partOfSpeech = "noun",
                    example = "Relative clauses are post-modifiers.",
                    examplePersian = "جملات موصولی پس‌توصیف‌کننده هستند.",
                    usageTip = "بعد از اسم."
                ),
                VocabWord(
                    english = "appositive",
                    persian = "بدل",
                    pronunciation = "/əˈpɑːzətɪv/",
                    partOfSpeech = "noun",
                    example = "My friend, a doctor, lives here.",
                    examplePersian = "دوست من، که دکتر است، اینجا زندگی می‌کند.",
                    usageTip = "توضیح اضافی."
                ),
                VocabWord(
                    english = "complement",
                    persian = "متمم",
                    pronunciation = "/ˈkɑːmpləmənt/",
                    partOfSpeech = "noun",
                    example = "A noun complement completes meaning.",
                    examplePersian = "متمم اسم، معنا را کامل می‌کند.",
                    wordFamily = "complementary, complement",
                    usageTip = "بعد از اسم."
                ),
                VocabWord(
                    english = "participle",
                    persian = "وجه وصفی",
                    pronunciation = "/ˈpɑːrtɪsɪpəl/",
                    partOfSpeech = "noun",
                    example = "Participles can modify nouns.",
                    examplePersian = "وجوه وصفی می‌توانند اسم را توصیف کنند.",
                    usageTip = "در پس‌توصیف."
                ),
                VocabWord(
                    english = "infinitive",
                    persian = "مصدر",
                    pronunciation = "/ɪnˈfɪnətɪv/",
                    partOfSpeech = "noun",
                    example = "The infinitive modifies the noun.",
                    examplePersian = "مصدر اسم را توصیف می‌کند.",
                    usageTip = "در پس‌توصیف."
                ),
                VocabWord(
                    english = "coordination",
                    persian = "هم‌پایگی",
                    pronunciation = "/koʊˌɔːrdɪˈneɪʃən/",
                    partOfSpeech = "noun",
                    example = "Coordination joins similar elements.",
                    examplePersian = "هم‌پایگی عناصر مشابه را به هم وصل می‌کند.",
                    usageTip = "در گروه اسمی."
                ),
                VocabWord(
                    english = "subordination",
                    persian = "پیروی",
                    pronunciation = "/səˌbɔːrdɪˈneɪʃən/",
                    partOfSpeech = "noun",
                    example = "Subordination creates hierarchical structures.",
                    examplePersian = "پیروی ساختارهای سلسله‌مراتبی ایجاد می‌کند.",
                    usageTip = "در جملات پیچیده."
                ),
                VocabWord(
                    english = "concise",
                    persian = "مختصر، موجز",
                    pronunciation = "/kənˈsaɪs/",
                    partOfSpeech = "adjective",
                    example = "Concise writing is valued.",
                    examplePersian = "نوشتار موجز ارزشمند است.",
                    wordFamily = "concisely, conciseness",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "elaborate",
                    persian = "مفصل، پیچیده",
                    pronunciation = "/ɪˈlæbərət/",
                    partOfSpeech = "adjective",
                    example = "This is an elaborate phrase.",
                    examplePersian = "این یه عبارت مفصله.",
                    usageTip = "در توصیف."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "the ins and outs",
                    persian = "جزئیات کامل",
                    example = "I know the ins and outs of the business.",
                    examplePersian = "جزئیات کامل کسب‌وکار را می‌دانم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "the nuts and bolts",
                    persian = "اصول و مبانی",
                    example = "Let's focus on the nuts and bolts.",
                    examplePersian = "بیا روی اصول و مبانی تمرکز کنیم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "the be-all and end-all",
                    persian = "همه چیز، بالاترین هدف",
                    example = "Money isn't the be-all and end-all.",
                    examplePersian = "پول همه چیز نیست.",
                    register = "idiom"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "take on",
                    meaning = "to assume",
                    persian = "به عهده گرفتن",
                    example = "She took on a challenging role.",
                    examplePersian = "او نقش چالش‌برانگیزی به عهده گرفت."
                ),
                PhrasalVerb(
                    verb = "put up with",
                    meaning = "to tolerate",
                    persian = "تحمل کردن",
                    example = "I can't put up with this noise.",
                    examplePersian = "نمی‌توانم این سر و صدا را تحمل کنم."
                ),
                PhrasalVerb(
                    verb = "look into",
                    meaning = "to investigate",
                    persian = "بررسی کردن",
                    example = "They're looking into the issue.",
                    examplePersian = "در حال بررسی موضوع هستند."
                ),
                PhrasalVerb(
                    verb = "come up with",
                    meaning = "to think of",
                    persian = "ارائه دادن",
                    example = "She came up with a brilliant idea.",
                    examplePersian = "او ایده درخشانی ارائه داد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Stress in complex noun phrases",
                    content = "در گروه‌های اسمی، تأکید روی کلمه اصلی:\n• The IMPORTANT research findings\n• A WELL-designed program"
                ),
                PronunciationTip(
                    title = "Linking in noun phrases",
                    content = "در گفتار طبیعی، کلمات به هم می‌چسبند:\n• The complex noun phrase → /ðə kəmˈpleks naʊn freɪz/"
                ),
                PronunciationTip(
                    title = "Stress shift in compounds",
                    content = "در اسم‌های مرکب، تأکید روی بخش اول:\n• BLACK-bird (پرنده) vs black BIRD (پرنده سیاه)"
                ),
                PronunciationTip(
                    title = "Appositive pause",
                    content = "در appositives، مکث کوتاه قبل و بعد:\n• My friend, | a doctor, | lives here."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Academic writing style",
                    content = "در نوشتار آکادمیک، گروه‌های اسمی پیچیده رایجند: 'the ongoing debate concerning climate policy...'"
                ),
                CulturalNote(
                    title = "Journalistic language",
                    content = "در ژورنالیسم، گروه‌های اسمی برای فشرده‌سازی اطلاعات استفاده می‌شوند."
                ),
                CulturalNote(
                    title = "Technical writing",
                    content = "در متون فنی، دقت در ساختار گروه اسمی ضروری است."
                ),
                CulturalNote(
                    title = "Nouns as modifiers",
                    content = "در انگلیسی مدرن، اسم‌ها می‌توانند به‌عنوان توصیف‌کننده عمل کنند: 'a computer science department'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Structure of Noun Phrases",
                    content = """
گروه اسمی از چند بخش تشکیل شده:

[Determiner] + [Pre-modifiers] + Head Noun + [Post-modifiers]

مثال:
The | three | interesting | books | on the table | that I bought

بخش‌ها:
• Determiners: a, the, this, my, some, many, few
• Pre-modifiers: adjectives, participles, nouns
• Head Noun: اسم اصلی
• Post-modifiers: prepositional phrases, relative clauses, participles, infinitives

مثال کامل:
The recently published scientific research on climate change indicates...
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Pre-modifiers",
                    content = """
Pre-modifiers قبل از اسم اصلی قرار می‌گیرند:

Adjectives:
• a difficult problem
• an interesting book
• the final decision

Participles:
• a surprising result (present participle)
• a broken window (past participle)

Nouns as modifiers:
• a computer science course
• a tennis player
• the school library

ترتیب معمول:
Opinion → Size → Age → Shape → Color → Origin → Material → Purpose → Noun
• a beautiful large old round red Italian leather handbag
• a nice small new white shirt

نکته: معمولاً ۲-۳ صفت کافی است؛ بیش از حد صفت، جمله را سنگین می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Post-modifiers",
                    content = """
Post-modifiers بعد از اسم اصلی قرار می‌گیرند:

Prepositional phrases:
• the man in the black coat
• a book on modern art
• the road to success

Relative clauses:
• the woman who called me
• the book that I bought
• the place where we met

Participles:
• the man standing there (present participle)
• the letter written yesterday (past participle)
• the issue discussed at the meeting

Infinitives:
• the chance to succeed
• the decision to leave
• the ability to learn

Combinations:
• the book that I bought on Amazon last week
• a person who is known for their honesty
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Appositives",
                    content = """
Appositive = اسم یا گروه اسمی که اسم دیگری را توضیح می‌دهد:

با کاما:
• My friend, a doctor, lives in Paris.
• Shakespeare, the famous playwright, wrote Hamlet.
• The capital of France, Paris, is beautiful.

بدون کاما (defining):
• My friend the doctor lives in Paris. (اشاره به یک دوست خاص)

با که در انگلیسی:
• The company, which was founded in 1990, is expanding.
• The theory, first proposed by Einstein, changed physics.

نکته: appositives اطلاعات اضافی می‌دهند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Complex Post-modification",
                    content = """
ترکیب چندین پس‌توصیف‌کننده:

Relative clause + Prepositional phrase:
• The book that I bought in London

Participle + Prepositional phrase:
• The man standing at the door

Infinitive + Prepositional phrase:
• The ability to work in a team

Multiple clauses:
• The proposal that was submitted yesterday, which I reviewed, is excellent.

مثال‌های پیچیده:
• The research on climate change, which was published last year, indicates...
• The company founded in 2010, known for its innovation, is expanding.
• A plan designed to reduce costs, which we discussed yesterday, was approved.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Coordination in Noun Phrases",
                    content = """
هم‌پایگی اجزای گروه اسمی:

با and:
• tea and coffee
• the red and blue shirts
• an interesting and useful book

با or:
• tea or coffee
• the red or blue shirt

با but:
• a difficult but rewarding task

با both...and:
• both the teachers and the students

با either...or:
• either Monday or Tuesday

با neither...nor:
• neither the manager nor the assistant

نکته: هم‌پایگی می‌تواند در هر سطحی از گروه اسمی رخ دهد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Nominalization",
                    content = """
تبدیل فعل/صفت به اسم برای ساخت گروه اسمی:

Verb → Noun:
• decide → decision
• analyze → analysis
• develop → development
• fail → failure

Adjective → Noun:
• happy → happiness
• important → importance
• likely → likelihood

مثال‌ها:
• Simple: They decided to expand the business.
• Nominalized: Their decision to expand the business...

• Simple: The study was conducted and analyzed.
• Nominalized: The conduct and analysis of the study...

نکته: nominalization رایج در آکادمیک است ولی می‌تواند متن را سنگین کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Patterns and Errors",
                    content = """
الگوهای رایج:

With multiple pre-modifiers:
• a fascinating new scientific theory

With post-modifiers:
• a theory of everything
• the book that changed my life
• the man who discovered penicillin

Common errors:
1. ترتیب صفت‌ها:
❌ a red big car
✅ a big red car

2. حذف determiner:
❌ I saw interesting book.
✅ I saw an interesting book.

3. اضافه صفت:
❌ a beautiful red large new car
✅ a beautiful large new red car

4. Relative pronoun اشتباه:
❌ the man which called me
✅ the man who called me

5. تکرار:
❌ the famous famous singer
✅ the famous singer
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "a red big car",
                    correct = "a big red car",
                    explanation = "ترتیب صفت‌ها: size before color."
                ),
                CommonMistake(
                    wrong = "I saw interesting book.",
                    correct = "I saw an interesting book.",
                    explanation = "اسم مفرد قابل شمارش نیاز به determiner دارد."
                ),
                CommonMistake(
                    wrong = "the man which called me",
                    correct = "the man who called me",
                    explanation = "برای افراد از who، نه which."
                ),
                CommonMistake(
                    wrong = "the famous famous singer",
                    correct = "the famous singer",
                    explanation = "تکرار صفت غیرضروری است."
                ),
                CommonMistake(
                    wrong = "a beautiful red large new car",
                    correct = "a beautiful large new red car",
                    explanation = "ترتیب: opinion → size → age → color."
                ),
                CommonMistake(
                    wrong = "The informations are useful.",
                    correct = "The information is useful.",
                    explanation = "information غیرقابل شمارش."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "I've just read the newly published research on climate change.",
                    persian = "تازه تحقیق تازه‌منتشرشده درباره تغییر اقلیم را خوانده‌ام."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Which one? The paper by the team at Oxford?",
                    persian = "کدوم؟ مقاله تیم آکسفورد؟"
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Yes, the study conducted over five years.",
                    persian = "بله، مطالعه‌ای که در طول پنج سال انجام شد."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "I've read it. The findings are quite remarkable.",
                    persian = "خوانده‌ام. یافته‌ها کاملاً قابل توجهند."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Absolutely. The data collected from multiple sources strengthens the argument.",
                    persian = "قطعاً. داده‌هایی که از منابع متعدد جمع‌آوری شده‌اند استدلال را تقویت می‌کنند."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "The team known for their rigorous methodology did excellent work.",
                    persian = "تیمی که به روش‌شناسی دقیقشون شناخته شده‌اند کار عالی انجام دادند."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Yes. The implications for policy are significant.",
                    persian = "بله. پیامدهای سیاستی‌اش قابل توجهند."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "The recommendations offered are practical and evidence-based.",
                    persian = "توصیه‌های ارائه‌شده عملی و مبتنی بر شواهدند."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "I hope the policymakers take them seriously.",
                    persian = "امیدوارم سیاست‌گذاران جدی بگیرنشون."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Me too. The consequences of inaction are severe.",
                    persian = "منم همین‌طور. پیامدهای عدم اقدام شدیدند."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "The window of opportunity to act is closing.",
                    persian = "پنجره فرصت برای اقدام داره بسته می‌شه."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "True. What we need now is decisive action.",
                    persian = "درسته. چیزی که الان نیاز داریم اقدام قاطعانه‌ست."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "The recently formed committee on climate policy might help.",
                    persian = "کمیته تازه‌تشکیل‌شده سیاست اقلیم ممکنه کمک کنه."
                ),
                DialogueLine(
                    speaker = "Dr. Reza",
                    english = "Let's hope so. The challenges ahead are unprecedented.",
                    persian = "بیا امیدوار باشیم. چالش‌های پیش‌رو بی‌سابقه‌اند."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Agreed. Let's continue this discussion after reviewing the details.",
                    persian = "موافقم. بیا بعد از مرور جزئیات این بحث را ادامه بدیم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is the paper about?",
                    answer = "It's about climate change."
                ),
                ComprehensionQuestion(
                    question = "How long was the study conducted?",
                    answer = "Over five years."
                ),
                ComprehensionQuestion(
                    question = "What strengthens the argument?",
                    answer = "The data collected from multiple sources."
                ),
                ComprehensionQuestion(
                    question = "What are the recommendations like?",
                    answer = "They are practical and evidence-based."
                ),
                ComprehensionQuestion(
                    question = "What is happening to the window of opportunity?",
                    answer = "It's closing."
                ),
                ComprehensionQuestion(
                    question = "What does Dr. Reza say about the challenges?",
                    answer = "They are unprecedented."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe a book or article using complex noun phrases.",
                    promptPersian = "یه کتاب یا مقاله را با گروه‌های اسمی پیچیده توصیف کن.",
                    hints = "Use: The recently published..., A well-known..., The study that..."
                ),
                SpeakingTask(
                    prompt = "Describe a person using appositives and post-modifiers.",
                    promptPersian = "یه فرد را با appositives و post-modifiers توصیف کن.",
                    hints = "Use: My friend, a doctor, ... / The woman who..., A person known for..."
                ),
                SpeakingTask(
                    prompt = "Talk about an issue using nominalization.",
                    promptPersian = "درباره یه موضوع با nominalization صحبت کن.",
                    hints = "Use: The development of..., The implementation of..., The analysis of..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an academic paragraph (about 250 words) on a topic of your choice. Use complex noun phrases with multiple pre- and post-modifiers.",
                    promptPersian = "یه پاراگراف آکادمیک بنویس (حدود ۲۵۰ کلمه) درباره موضوعی به انتخاب خودت. از گروه‌های اسمی پیچیده با چندین پیش و پس‌توصیف‌کننده استفاده کن.",
                    wordCount = 250,
                    hints = "Include:\n1. Complex noun phrases with pre-modifiers\n2. Post-modifiers (relative clauses, participles)\n3. Appositives\n4. Nominalization"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Choose the correct order.",
                    options = listOf(
                        "a red big car",
                        "a big red car",
                        "a car big red",
                        "big red a car"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The man ___ called me is my uncle.",
                    options = listOf("which", "who", "whose", "where"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is an appositive?",
                    options = listOf(
                        "My friend, a doctor, lives in Paris.",
                        "The man in the black coat.",
                        "The book on the table.",
                        "The woman who called."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: The letter ___ yesterday was important.",
                    options = listOf("write", "written", "writing", "wrote"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'nominalization' mean?",
                    options = listOf(
                        "تغییر اسم به فعل",
                        "تغییر فعل یا صفت به اسم",
                        "حذف اسم",
                        "تکرار اسم"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I saw ___ interesting book.",
                    options = listOf("a", "an", "the", "some"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is a post-modifier?",
                    options = listOf(
                        "the red car",
                        "the car that I bought",
                        "the big car",
                        "a new car"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The data ___ from multiple sources is reliable.",
                    options = listOf("collect", "collecting", "collected", "collects"),
                    correctIndex = 2
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 4 — Advanced Reported Structures
    // ============================================================
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Advanced Reported Structures",
            titlePersian = "ساختارهای پیشرفته نقل قول",
            objectives = listOf(
                "Master complex reported speech structures.",
                "Use reporting verbs with various complements.",
                "Apply passive reporting structures.",
                "Use distancing expressions for formal writing.",
                "Handle mixed reporting in journalistic contexts."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "allege",
                    persian = "ادعا کردن",
                    pronunciation = "/əˈledʒ/",
                    partOfSpeech = "verb",
                    example = "He allegedly stole the money.",
                    examplePersian = "او بنا به ادعا پول را دزدیده است.",
                    wordFamily = "allegation, allegedly",
                    usageTip = "در گزارش‌های حقوقی."
                ),
                VocabWord(
                    english = "claim",
                    persian = "ادعا کردن",
                    pronunciation = "/kleɪm/",
                    partOfSpeech = "verb",
                    example = "He claimed that he was innocent.",
                    examplePersian = "او ادعا کرد که بی‌گناه است.",
                    usageTip = "در نقل قول."
                ),
                VocabWord(
                    english = "assert",
                    persian = "تأکید کردن",
                    pronunciation = "/əˈsɜːrt/",
                    partOfSpeech = "verb",
                    example = "She asserted that the plan would work.",
                    examplePersian = "او تأکید کرد که طرح کار می‌کند.",
                    wordFamily = "assertion, assertive",
                    usageTip = "در نقل قول قوی."
                ),
                VocabWord(
                    english = "allegation",
                    persian = "اتهام",
                    pronunciation = "/ˌæləˈɡeɪʃən/",
                    partOfSpeech = "noun",
                    example = "The allegations were denied.",
                    examplePersian = "اتهامات رد شدند.",
                    usageTip = "در گزارش."
                ),
                VocabWord(
                    english = "testify",
                    persian = "شهادت دادن",
                    pronunciation = "/ˈtestɪfaɪ/",
                    partOfSpeech = "verb",
                    example = "She testified that she had seen him.",
                    examplePersian = "او شهادت داد که او را دیده است.",
                    wordFamily = "testimony",
                    usageTip = "در دادگاه."
                ),
                VocabWord(
                    english = "attest",
                    persian = "گواهی دادن",
                    pronunciation = "/əˈtest/",
                    partOfSpeech = "verb",
                    example = "The results attest to his hard work.",
                    examplePersian = "نتایج به کار سخت او گواهی می‌دهند.",
                    usageTip = "در اسناد."
                ),
                VocabWord(
                    english = "purport",
                    persian = "ادعا کردن، نشان دادن",
                    pronunciation = "/pərˈpɔːrt/",
                    partOfSpeech = "verb",
                    example = "The document purports to be official.",
                    examplePersian = "سند ادعا می‌کند رسمی است.",
                    wordFamily = "purported, purportedly",
                    usageTip = "در اسناد رسمی."
                ),
                VocabWord(
                    english = "rumor",
                    persian = "شایعه",
                    pronunciation = "/ˈruːmər/",
                    partOfSpeech = "noun",
                    example = "There's a rumor that they're closing.",
                    examplePersian = "شایعه‌ای هست که تعطیل می‌کنند.",
                    wordFamily = "rumored",
                    usageTip = "در گزارش."
                ),
                VocabWord(
                    english = "distancing",
                    persian = "فاصله‌گیری",
                    pronunciation = "/ˈdɪstənsɪŋ/",
                    partOfSpeech = "noun",
                    example = "Distancing expressions show uncertainty.",
                    examplePersian = "عبارات فاصله‌گیری عدم قطعیت را نشان می‌دهند.",
                    usageTip = "در گزارش رسمی."
                ),
                VocabWord(
                    english = "allege",
                    persian = "ادعا کردن (رسمی)",
                    pronunciation = "/əˈledʒ/",
                    partOfSpeech = "verb",
                    example = "It is alleged that he committed fraud.",
                    examplePersian = "ادعا می‌شود که او کلاهبرداری کرده است.",
                    usageTip = "در اخبار."
                ),
                VocabWord(
                    english = "source",
                    persian = "منبع",
                    pronunciation = "/sɔːrs/",
                    partOfSpeech = "noun",
                    example = "According to sources, the deal is close.",
                    examplePersian = "به گفته منابع، معامله نزدیک است.",
                    usageTip = "در گزارش."
                ),
                VocabWord(
                    english = "speculate",
                    persian = "گمانه‌زنی کردن",
                    pronunciation = "/ˈspekjəleɪt/",
                    partOfSpeech = "verb",
                    example = "The media speculated about his resignation.",
                    examplePersian = "رسانه‌ها درباره استعفایش گمانه‌زنی کردند.",
                    wordFamily = "speculation, speculative",
                    usageTip = "در گزارش."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "have it on good authority",
                    persian = "از منبع موثق شنیدن",
                    example = "I have it on good authority that they're merging.",
                    examplePersian = "از منبع موثق شنیده‌ام که ادغام می‌شوند.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "word has it",
                    persian = "شنیده می‌شود",
                    example = "Word has it that she's leaving.",
                    examplePersian = "شنیده می‌شود که او می‌رود.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "on the record",
                    persian = "برای انتشار رسمی",
                    example = "He said that on the record.",
                    examplePersian = "او آن را برای انتشار رسمی گفت.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "set out",
                    meaning = "to describe in detail",
                    persian = "توصیف کردن",
                    example = "She set out her plans clearly.",
                    examplePersian = "او برنامه‌هایش را واضح توصیف کرد."
                ),
                PhrasalVerb(
                    verb = "come across",
                    meaning = "to give an impression",
                    persian = "به نظر رسیدن",
                    example = "He came across as very confident.",
                    examplePersian = "او خیلی با اعتماد به نفس به نظر می‌رسید."
                ),
                PhrasalVerb(
                    verb = "hold back",
                    meaning = "to withhold",
                    persian = "بازداشتن، پنهان کردن",
                    example = "She held back important information.",
                    examplePersian = "او اطلاعات مهمی را پنهان کرد."
                ),
                PhrasalVerb(
                    verb = "account for",
                    meaning = "to explain",
                    persian = "توضیح دادن",
                    example = "How do you account for the discrepancy?",
                    examplePersian = "چطور تفاوت را توضیح می‌دهید؟"
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Allegedly stress",
                    content = "allegedly: /əˈledʒɪdli/ — استرس روی le."
                ),
                PronunciationTip(
                    title = "Reportedly stress",
                    content = "reportedly: /rɪˈpɔːrtɪdli/ — استرس روی por."
                ),
                PronunciationTip(
                    title = "Stress in reporting verbs",
                    content = "در گزارش‌دهی، فعل اصلی تأکید می‌گیرد:\n• He CLAIMED he was innocent."
                ),
                PronunciationTip(
                    title = "Distancing intonation",
                    content = "در عبارات فاصله‌گیری، آهنگ نزولی و ملایم:\n• According to reports... ↓"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Journalistic standards",
                    content = "در رسانه‌های غربی، استانداردهای دقیقی برای نقل قول و گزارش‌دهی وجود دارد."
                ),
                CulturalNote(
                    title = "Legal language",
                    content = "در متون حقوقی، از allegedly و reportedly برای پرهیز از اتهام مستقیم استفاده می‌شود."
                ),
                CulturalNote(
                    title = "Academic attribution",
                    content = "در مقالات علمی، attribution دقیق ضروری است: 'As Johnson (2020) argues...'"
                ),
                CulturalNote(
                    title = "Distancing in formal writing",
                    content = "در نوشتار رسمی، از عبارات فاصله‌گیری برای بی‌طرفی استفاده می‌شود: 'It has been suggested that...'"
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Reporting Verbs: Comprehensive List",
                    content = """
افعال گزارش‌دهی با ساختارهای مختلف:

verb + that clause:
say, claim, state, report, mention, add, explain, complain, admit, deny, insist, suggest, recommend, propose, agree, argue

verb + object + that clause:
tell, inform, remind, warn, convince, persuade, assure

verb + to infinitive:
agree, offer, refuse, promise, threaten, decide, hope

verb + object + to infinitive:
ask, tell, advise, warn, encourage, invite, remind, force, persuade

verb + gerund:
admit, deny, suggest, recommend, mention, remember

verb + preposition + gerund:
insist on, apologize for, complain about, object to
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Passive Reporting Structures",
                    content = """
ساختار ۱ — Impersonal passive:
It + passive + that + clause
• It is said that he is very rich.
• It is believed that she is innocent.
• It has been reported that the company will merge.
• It was alleged that the money was stolen.

ساختار ۲ — Personal passive:
Subject + passive + to infinitive
• He is said to be very rich.
• She is believed to be innocent.
• The company is reported to be merging.
• The money was alleged to have been stolen.

با زمان‌های مختلف:
• He is said to be rich. (حال)
• He is said to have been rich. (گذشته)
• He is said to be living in Paris. (حال استمراری)
• The company is expected to announce results. (آینده نزدیک)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Distancing Expressions",
                    content = """
برای فاصله‌گیری از یک ادعا:

Apparently / Reportedly:
• Apparently, she left early.
• He is reportedly resigning.

Allegedly:
• He allegedly stole the money.
• The allegedly fraudulent company...

According to:
• According to reports, the deal is close.
• According to sources, they're negotiating.

It is said / believed / thought / reported:
• It is said that he is very rich.
• It is believed that the economy will improve.

Purportedly:
• The purportedly original painting...

نکته: این عبارات به نویسنده اجازه می‌دهند بدون تأیید مستقیم، اطلاعات را منتقل کنند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Reporting in Journalism",
                    content = """
در خبرنگاری:

Attribution:
• According to sources close to the matter...
• The official, speaking on condition of anonymity, said...
• Sources say that...

Quoting:
• He said, "The situation is critical."
• "The situation is critical," he said.
• He called the situation "critical."

Paraphrasing:
• The minister said that the situation was critical.
• The minister described the situation as critical.

Objectivity:
• use distancing language
• avoid stating allegations as facts
• attribute opinions clearly

مثال:
The report, which was released yesterday, claims that the policy has failed. However, according to government sources, the data is misleading.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Complex Mixed Reporting",
                    content = """
ترکیب ساختارها:

Reported statement + question:
• He said he was tired and asked if I could help.

Reported statement + command:
• She said she was busy and told me to wait.

Multiple sources:
• The minister said the economy was improving, but economists claim the data is misleading.

Time reference complications:
• He said he had seen her the day before, but she claims she was out of town.

Mixed tenses:
• She said she has been working on it (اگر هنوز ادامه دارد).

مثال پیشرفته:
The CEO, who was reportedly considering the merger, told shareholders that negotiations had begun. However, according to insider sources, the deal might not go through.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Reporting with Different Tenses",
                    content = """
اگر reporting verb در زمان حال باشد، backshift رخ نمی‌دهد:

Direct: "I'm tired."
Reported: He says he's tired. (بدون تغییر)

اگر reporting verb در گذشته باشد، backshift:

Direct: "I'm tired."
Reported: He said he was tired.

مثال‌ها:
• She says she'll come. (هنوز معتبر)
• She said she would come. (گذشته)
• The doctor says I need more rest.
• The doctor said I needed more rest.

نکته: اگر اطلاعات هنوز معتبر است، می‌توان از present استفاده کرد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Reporting Modal Perfects and Speculation",
                    content = """
Reporting speculation:

Direct: "She must have forgotten."
Reported: He said she must have forgotten.

Direct: "They might be late."
Reported: She said they might be late.

Direct: "He should have called."
Reported: She said he should have called.

Direct: "We could have won."
Reported: They said they could have won.

نکته: modal perfects در reported speech بدون تغییر باقی می‌مانند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Errors in Reported Speech",
                    content = """
خطاهای رایج:

1. say vs tell:
❌ She said me that...
✅ She told me that...

2. گزارش سؤال با ترتیب سؤالی:
❌ He asked where was I from.
✅ He asked where I was from.

3. backshift ناقص:
❌ She said she is tired.
✅ She said she was tired.

4. modal perfect:
❌ He said she must forgot.
✅ He said she must have forgotten.

5. زمان‌های گذشته بی‌تغییر:
❌ She said she has finished.
✅ She said she had finished.

6. distancing نادرست:
❌ It is said that he allegedly committed the crime.
✅ It is alleged that he committed the crime.

نکته: در نوشتار رسمی، از عبارات فاصله‌گیری درست استفاده کنید.
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
                    wrong = "He asked where was I from.",
                    correct = "He asked where I was from.",
                    explanation = "در reported questions، ترتیب جمله خبری."
                ),
                CommonMistake(
                    wrong = "She said she is tired.",
                    correct = "She said she was tired.",
                    explanation = "backshift: is → was."
                ),
                CommonMistake(
                    wrong = "It is said that he allegedly committed the crime.",
                    correct = "It is alleged that he committed the crime.",
                    explanation = "تکرار عبارات فاصله‌گیری غیرضروری است."
                ),
                CommonMistake(
                    wrong = "He said he will come tomorrow.",
                    correct = "He said he would come the next day.",
                    explanation = "will → would و tomorrow → the next day."
                ),
                CommonMistake(
                    wrong = "The minister said the situation is critical.",
                    correct = "The minister said the situation was critical. / The minister says the situation is critical.",
                    explanation = "اگر reporting verb گذشته است، backshift."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Journalist",
                    english = "What did the minister say about the new policy?",
                    persian = "وزیر درباره سیاست جدید چه گفت؟"
                ),
                DialogueLine(
                    speaker = "Spokesperson",
                    english = "He said the policy would be implemented next month.",
                    persian = "او گفت که سیاست ماه بعد اجرا می‌شود."
                ),
                DialogueLine(
                    speaker = "Journalist",
                    english = "Did he address the criticism from the opposition?",
                    persian = "به انتقاد مخالفان پرداخت؟"
                ),
                DialogueLine(
                    speaker = "Spokesperson",
                    english = "Yes, he claimed the criticism was based on misinformation.",
                    persian = "بله، ادعا کرد که انتقاد بر اساس اطلاعات نادرست است."
                ),
                DialogueLine(
                    speaker = "Journalist",
                    english = "It's been reported that the policy is controversial.",
                    persian = "گزارش شده که سیاست جنجالی است."
                ),
                DialogueLine(
                    speaker = "Spokesperson",
                    english = "That's how some have portrayed it, but the minister insists it's necessary.",
                    persian = "بعضی‌ها این‌طور تصویر کرده‌اند، ولی وزیر اصرار دارد که ضروری است."
                ),
                DialogueLine(
                    speaker = "Journalist",
                    english = "Can you confirm the reports about the funding?",
                    persian = "می‌توانید گزارش‌های مربوط به بودجه را تأیید کنید؟"
                ),
                DialogueLine(
                    speaker = "Spokesperson",
                    english = "I can't comment on speculation. The details will be announced formally.",
                    persian = "نمی‌توانم درباره گمانه‌زنی‌ها اظهارنظر کنم. جزئیات رسماً اعلام خواهد شد."
                ),
                DialogueLine(
                    speaker = "Journalist",
                    english = "There are rumors about internal disagreements.",
                    persian = "شایعاتی درباره اختلافات داخلی وجود دارد."
                ),
                DialogueLine(
                    speaker = "Spokesperson",
                    english = "Those rumors are unsubstantiated. The ministry is united.",
                    persian = "این شایعات بی‌پایه هستند. وزارت متحد است."
                ),
                DialogueLine(
                    speaker = "Journalist",
                    english = "According to my sources, some officials have concerns.",
                    persian = "به گفته منابع من، برخی مقامات نگرانی دارند."
                ),
                DialogueLine(
                    speaker = "Spokesperson",
                    english = "I can't speak to unnamed sources. What I can say is that the minister has full confidence in the team.",
                    persian = "نمی‌توانم به منابع ناشناس پاسخ دهم. آنچه می‌توانم بگویم این است که وزیر اعتماد کامل به تیم دارد."
                ),
                DialogueLine(
                    speaker = "Journalist",
                    english = "Will there be a formal statement?",
                    persian = "بیانیه رسمی خواهد بود؟"
                ),
                DialogueLine(
                    speaker = "Spokesperson",
                    english = "Yes, it's expected to be released later this week.",
                    persian = "بله، انتظار می‌رود اواخر این هفته منتشر شود."
                ),
                DialogueLine(
                    speaker = "Journalist",
                    english = "Thank you for your time.",
                    persian = "ممنون برای وقتتان."
                ),
                DialogueLine(
                    speaker = "Spokesperson",
                    english = "You're welcome.",
                    persian = "خواهش می‌کنم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What did the minister say about the policy?",
                    answer = "He said it would be implemented next month."
                ),
                ComprehensionQuestion(
                    question = "How did the minister respond to criticism?",
                    answer = "He claimed the criticism was based on misinformation."
                ),
                ComprehensionQuestion(
                    question = "What does the minister insist?",
                    answer = "He insists the policy is necessary."
                ),
                ComprehensionQuestion(
                    question = "What can't the spokesperson comment on?",
                    answer = "Speculation and unnamed sources."
                ),
                ComprehensionQuestion(
                    question = "What does the spokesperson say about the rumors?",
                    answer = "They are unsubstantiated, and the ministry is united."
                ),
                ComprehensionQuestion(
                    question = "When is the formal statement expected?",
                    answer = "Later this week."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Report a news event using multiple reporting verbs.",
                    promptPersian = "رویداد خبری را با چندین فعل گزارش‌دهی گزارش کن.",
                    hints = "Use: He claimed that..., She asserted that..., It was reported that..."
                ),
                SpeakingTask(
                    prompt = "Use distancing expressions to report uncertain information.",
                    promptPersian = "با عبارات فاصله‌گیری اطلاعات نامطمئن را گزارش کن.",
                    hints = "Use: reportedly, allegedly, according to sources, it is said that..."
                ),
                SpeakingTask(
                    prompt = "Report a complex scenario with multiple sources.",
                    promptPersian = "سناریوی پیچیده‌ای را با چندین منبع گزارش کن.",
                    hints = "Use: According to X... but Y claims... Z insists that..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a news article (about 300 words) about a controversial decision. Use passive reporting structures, distancing expressions, and multiple sources.",
                    promptPersian = "یه مقاله خبری بنویس (حدود ۳۰۰ کلمه) درباره یه تصمیم جنجالی. از ساختارهای passive reporting، عبارات فاصله‌گیری و منابع متعدد استفاده کن.",
                    wordCount = 300,
                    hints = "Structure:\n1. Lead with main claim\n2. Attribution to sources\n3. Contrasting views\n4. Distancing language\n5. Conclusion"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: It ___ said that he is very rich.",
                    options = listOf("is", "has", "was", "does"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'allegedly' mean?",
                    options = listOf(
                        "قطعاً",
                        "بنا به ادعا",
                        "به‌طور یقین",
                        "حتماً"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: He is said ___ very rich.",
                    options = listOf("be", "to be", "being", "been"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "She said me that she was tired.",
                        "She told me that she was tired.",
                        "She said to me that she was tired.",
                        "She told that she was tired."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: He asked where I ___.",
                    options = listOf("live", "lived", "do live", "am living"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'on the record' mean?",
                    options = listOf(
                        "خارج از ضبط",
                        "برای انتشار رسمی",
                        "محرمانه",
                        "غیررسمی"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The minister said the policy ___ implemented next month.",
                    options = listOf("will be", "would be", "is", "was"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is distancing language?",
                    options = listOf(
                        "He stole the money.",
                        "He allegedly stole the money.",
                        "He definitely stole the money.",
                        "He stole the money, I'm sure."
                    ),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 5 — Aspect and Time Reference
    // ============================================================
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Aspect and Time Reference",
            titlePersian = "وجه و مرجع زمانی",
            objectives = listOf(
                "Understand the difference between tense and aspect.",
                "Master perfect and progressive aspects.",
                "Use time reference markers accurately.",
                "Apply aspect for nuanced meaning.",
                "Distinguish between similar temporal structures."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "aspect",
                    persian = "وجه",
                    pronunciation = "/ˈæspekt/",
                    partOfSpeech = "noun",
                    example = "Perfect is an aspect, not a tense.",
                    examplePersian = "کامل یک وجه است، نه زمان.",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "progressive",
                    persian = "استمراری",
                    pronunciation = "/prəˈɡresɪv/",
                    partOfSpeech = "adjective",
                    example = "The progressive aspect shows ongoing action.",
                    examplePersian = "وجه استمراری عمل در حال انجام را نشان می‌دهد.",
                    usageTip = "در زمان‌ها."
                ),
                VocabWord(
                    english = "perfect",
                    persian = "کامل",
                    pronunciation = "/ˈpɜːrfɪkt/",
                    partOfSpeech = "adjective",
                    example = "Perfect aspect shows completion.",
                    examplePersian = "وجه کامل اتمام را نشان می‌دهد.",
                    usageTip = "در زمان‌ها."
                ),
                VocabWord(
                    english = "completion",
                    persian = "اتمام",
                    pronunciation = "/kəmˈpliːʃən/",
                    partOfSpeech = "noun",
                    example = "Completion is emphasized by perfect aspect.",
                    examplePersian = "اتمام با وجه کامل تأکید می‌شود.",
                    wordFamily = "complete, completely",
                    usageTip = "در perfect."
                ),
                VocabWord(
                    english = "duration",
                    persian = "مدت",
                    pronunciation = "/duˈreɪʃən/",
                    partOfSpeech = "noun",
                    example = "Duration is shown by progressive aspect.",
                    examplePersian = "مدت با وجه استمراری نشان داده می‌شود.",
                    usageTip = "در perfect continuous."
                ),
                VocabWord(
                    english = "relevance",
                    persian = "ارتباط",
                    pronunciation = "/ˈreləvəns/",
                    partOfSpeech = "noun",
                    example = "Present perfect shows relevance to now.",
                    examplePersian = "حال کامل ارتباط با حال را نشان می‌دهد.",
                    wordFamily = "relevant, relevantly",
                    usageTip = "در present perfect."
                ),
                VocabWord(
                    english = "ongoing",
                    persian = "در جریان",
                    pronunciation = "/ˈɑːnɡoʊɪŋ/",
                    partOfSpeech = "adjective",
                    example = "It's an ongoing process.",
                    examplePersian = "این یه فرایند در جریانه.",
                    usageTip = "در progressive."
                ),
                VocabWord(
                    english = "state",
                    persian = "وضعیت",
                    pronunciation = "/steɪt/",
                    partOfSpeech = "noun",
                    example = "Stative verbs describe states.",
                    examplePersian = "افعال حالتی وضعیت‌ها را توصیف می‌کنند.",
                    usageTip = "در فعل‌های حالتی."
                ),
                VocabWord(
                    english = "dynamic",
                    persian = "پویا",
                    pronunciation = "/daɪˈnæmɪk/",
                    partOfSpeech = "adjective",
                    example = "Dynamic verbs describe actions.",
                    examplePersian = "افعال پویا اعمال را توصیف می‌کنند.",
                    usageTip = "در مقابل stative."
                ),
                VocabWord(
                    english = "punctual",
                    persian = "لحظه‌ای",
                    pronunciation = "/ˈpʌŋktʃuəl/",
                    partOfSpeech = "adjective",
                    example = "Punctual events happen at a point.",
                    examplePersian = "رویدادهای لحظه‌ای در یک نقطه رخ می‌دهند.",
                    usageTip = "در تحلیل زمانی."
                ),
                VocabWord(
                    english = "habitual",
                    persian = "عادتی",
                    pronunciation = "/həˈbɪtʃuəl/",
                    partOfSpeech = "adjective",
                    example = "Habitual actions are repeated.",
                    examplePersian = "اعمال عادتی تکرار می‌شوند.",
                    wordFamily = "habit, habitually",
                    usageTip = "در present simple."
                ),
                VocabWord(
                    english = "iterative",
                    persian = "تکراری",
                    pronunciation = "/ˈɪtərətɪv/",
                    partOfSpeech = "adjective",
                    example = "Iterative events happen repeatedly.",
                    examplePersian = "رویدادهای تکراری بارها رخ می‌دهند.",
                    usageTip = "در تحلیل."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in the meantime",
                    persian = "در این بین",
                    example = "The meeting is at 3; in the meantime, let's prepare.",
                    examplePersian = "جلسه ساعت ۳ است؛ در این بین، بیایید آماده شویم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "at the moment",
                    persian = "در این لحظه",
                    example = "I'm busy at the moment.",
                    examplePersian = "در این لحظه مشغولم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "all along",
                    persian = "از همان ابتدا",
                    example = "I knew it all along.",
                    examplePersian = "از همان ابتدا می‌دانستم.",
                    register = "informal"
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
                    verb = "go on",
                    meaning = "to continue",
                    persian = "ادامه یافتن",
                    example = "The meeting went on for hours.",
                    examplePersian = "جلسه ساعت‌ها ادامه یافت."
                ),
                PhrasalVerb(
                    verb = "hold on",
                    meaning = "to wait",
                    persian = "صبر کردن",
                    example = "Hold on, I'm almost ready.",
                    examplePersian = "صبر کن، تقریباً آماده‌ام."
                ),
                PhrasalVerb(
                    verb = "keep on",
                    meaning = "to persist",
                    persian = "پافشاری کردن",
                    example = "Keep on trying!",
                    examplePersian = "به تلاش ادامه بده!"
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Contractions with have",
                    content = "در گفتار:\n• I've been → /aɪv bɪn/\n• She's been → /ʃiːz bɪn/\n• They've been → /ðeɪv bɪn/"
                ),
                PronunciationTip(
                    title = "Stress on aspect markers",
                    content = "در جمله، فعل کمکی تأکید می‌گیرد:\n• I HAVE been working.\n• She WAS working."
                ),
                PronunciationTip(
                    title = "Progressive stress",
                    content = "در progressive، -ing تأکید می‌گیرد:\n• She is WORKing."
                ),
                PronunciationTip(
                    title = "Perfect stress",
                    content = "در perfect، past participle تأکید می‌گیرد:\n• She has FINished."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Aspect in English",
                    content = "انگلیسی از ترکیب tense (زمان) و aspect (وجه) برای بیان دقیق زمان و ماهیت عمل استفاده می‌کند."
                ),
                CulturalNote(
                    title = "Cross-cultural differences",
                    content = "برخی زبان‌ها aspect را متفاوت از انگلیسی بیان می‌کنند؛ درک این تفاوت‌ها برای زبان‌آموزان مهم است."
                ),
                CulturalNote(
                    title = "Stative verbs",
                    content = "افعال حالتی در انگلیسی مدرن گاهی در progressive استفاده می‌شوند (I'm loving it) که نشانه تغییرات زبانی است."
                ),
                CulturalNote(
                    title = "Time reference",
                    content = "در انگلیسی، انتخاب tense/aspect به context و speaker intent بستگی دارد."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Tense vs Aspect",
                    content = """
Tense: زمان (past, present, future)
Aspect: ماهیت عمل (simple, progressive, perfect)

ترکیب tense + aspect:

Present:
• Simple: I work
• Progressive: I am working
• Perfect: I have worked
• Perfect Progressive: I have been working

Past:
• Simple: I worked
• Progressive: I was working
• Perfect: I had worked
• Perfect Progressive: I had been working

Future:
• Simple: I will work
• Progressive: I will be working
• Perfect: I will have worked
• Perfect Progressive: I will have been working

نکته: tense + aspect = 12 ترکیب اصلی در انگلیسی.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Simple Aspect",
                    content = """
Simple aspect: عمل به‌عنوان یک کل کامل

Present Simple:
• حقایق: The sun rises in the east.
• عادت‌ها: I work every day.
• برنامه‌ها: The train leaves at 8.

Past Simple:
• رویدادهای تمام‌شده: I visited Paris last year.
• رویدادهای پشت سر هم: She came home, ate dinner, and went to bed.

Future Simple:
• پیش‌بینی: It will rain tomorrow.
• تصمیم لحظه‌ای: I'll help you.

نکته: simple aspect روی کل عمل تمرکز دارد، نه جزئیات.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Progressive Aspect",
                    content = """
Progressive aspect: عمل در حال انجام

Present Progressive:
• در حال انجام: I am working right now.
• وضعیت موقت: She is staying with us.
• قرار آینده: I'm meeting Ali tomorrow.

Past Progressive:
• در حال انجام در گذشته: I was working at 5 PM.
• پس‌زمینه: I was walking when I saw her.

Future Progressive:
• در حال انجام در آینده: At 8 PM, I'll be watching TV.

نکته: progressive روی ماهیت در حال انجام عمل تأکید می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Perfect Aspect",
                    content = """
Perfect aspect: ارتباط بین دو نقطه زمانی

Present Perfect:
• تجربه: I've been to Paris.
• رویداد اخیر: She has just arrived.
• ارتباط با حال: I've lost my keys.

Past Perfect:
• قبل از گذشته: When I arrived, she had left.
• عمل مقدم: I had studied before the exam.

Future Perfect:
• قبل از آینده: By next year, I'll have finished.

نکته: perfect روی رابطه بین دو زمان تأکید می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Perfect Progressive",
                    content = """
ترکیب perfect + progressive:

Present Perfect Progressive:
• duration تا حال: I've been working here for 5 years.
• اخیراً: She's been studying all morning.
• ادامه‌دار: They've been living in London since 2020.

Past Perfect Progressive:
• مدت قبل از گذشته: I had been waiting for an hour when she arrived.

Future Perfect Progressive:
• مدت تا آینده: By next month, I'll have been working here for a year.

نکته: perfect progressive هم duration و هم ongoing را نشان می‌دهد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Time Reference Markers",
                    content = """
عبارات زمانی که به انتخاب tense/aspect کمک می‌کنند:

Present Simple: always, usually, often, every day, on Mondays
Present Progressive: now, right now, at the moment, currently, today
Present Perfect: ever, never, already, yet, just, since, for, recently
Present Perfect Progressive: how long, for, since, all day

Past Simple: yesterday, last week, ago, in 2010, when
Past Progressive: while, at that time, at 5 PM yesterday
Past Perfect: before, after, by the time, when, already
Past Perfect Progressive: for, since, how long

Future Simple: tomorrow, next week, soon, in 2030
Future Progressive: at this time tomorrow, at 5 PM tomorrow
Future Perfect: by, by the time, before

نکته: این markers به تشخیص tense/aspect مناسب کمک می‌کنند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Stative vs Dynamic Verbs",
                    content = """
Stative verbs: وضعیت‌ها (معمولاً progressive نمی‌گیرند)
• know, believe, understand, remember, forget
• like, love, hate, prefer, want, need
• see, hear, smell, taste, feel
• have (possess), own, belong
• be, seem, appear

Dynamic verbs: اعمال (progressive می‌گیرند)
• work, play, run, eat, read, write
• speak, talk, listen, watch
• go, come, walk, drive

استثنا: برخی stative verbs در معنی دیگر dynamic می‌شوند:
• I think (believe) → I'm thinking (considering)
• I have (possess) → I'm having lunch (eating)
• She is (state) → She is being silly (acting)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Nuances in Meaning",
                    content = """
تفاوت‌های ظریف:

I have lived here for 5 years. (هنوز اینجا هستم)
I lived here for 5 years. (دیگر اینجا نیستم)

I have been writing a book. (ناتمام یا ادامه‌دار)
I have written a book. (تمام‌شده)

I was reading when she called. (در حال خواندن)
I read when she called. (رویداد کامل — کمتر رایج)

She has been to Paris. (تجربه)
She has gone to Paris. (الان آنجاست)
She went to Paris. (زمان مشخص در گذشته)

I'll see her tomorrow. (رویداد)
I'll be seeing her tomorrow. (در حال انجام — غیررسمی)
I'll have seen her by then. (قبل از زمان مشخص)

نکته: درک این ظرافت‌ها مهارت پیشرفته‌ای است.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I am knowing the answer.",
                    correct = "I know the answer.",
                    explanation = "know فعل حالتی است و در progressive نمی‌آید."
                ),
                CommonMistake(
                    wrong = "I have seen him yesterday.",
                    correct = "I saw him yesterday.",
                    explanation = "با زمان مشخص گذشته، از past simple."
                ),
                CommonMistake(
                    wrong = "When I arrived, she already left.",
                    correct = "When I arrived, she had already left.",
                    explanation = "برای عمل قبل از گذشته دیگر، past perfect."
                ),
                CommonMistake(
                    wrong = "I've been knowing him for years.",
                    correct = "I've known him for years.",
                    explanation = "know فعل حالتی است."
                ),
                CommonMistake(
                    wrong = "By 2030, I will finish my degree.",
                    correct = "By 2030, I will have finished my degree.",
                    explanation = "با by + زمان آینده، future perfect."
                ),
                CommonMistake(
                    wrong = "I lived here for 5 years (اگر هنوز اینجا هستم).",
                    correct = "I have lived here for 5 years.",
                    explanation = "برای موقعیت ادامه‌دار تا حال، present perfect."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Layla",
                    english = "How long have you been studying English?",
                    persian = "چقدر است که داری انگلیسی می‌خوانی؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I've been studying it for about five years now.",
                    persian = "حدود پنج سال است که می‌خوانم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "That's impressive. Have you ever lived abroad?",
                    persian = "تحسین‌برانگیزه. تا حالا خارج از کشور زندگی کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Yes, I lived in Canada for two years. But I've been back for three years now.",
                    persian = "بله، دو سال در کانادا زندگی کردم. ولی سه سال است که برگشته‌ام."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "I see. When did you come back?",
                    persian = "می‌فهمم. کِی برگشتی؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I came back in 2022.",
                    persian = "سال ۲۰۲۲ برگشتم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "And since then, you've been in Tehran?",
                    persian = "و از آن موقع در تهران بوده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Yes, I've been living here since then.",
                    persian = "بله، از آن موقع اینجا زندگی می‌کنم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Do you miss Canada?",
                    persian = "دلت برای کانادا تنگ شده؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Sometimes. I wish I could visit more often. When I was there, I used to go hiking every weekend.",
                    persian = "گاهی. ای کاش می‌توانستم بیشتر سفر کنم. وقتی آنجا بودم، هر آخر هفته به کوه‌پیمایی می‌رفتم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "That sounds nice. Do you still hike?",
                    persian = "خوب به نظر می‌رسه. هنوز کوه‌پیمایی می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Not as much. I've been too busy lately. But I'm planning to start again.",
                    persian = "نه به‌اندازه قبل. اخیراً خیلی مشغول بوده‌ام. ولی دارم برنامه‌ریزی می‌کنم دوباره شروع کنم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "That's good. Have you found good hiking spots here?",
                    persian = "خوبه. اینجا مکان‌های خوب برای کوه‌پیمایی پیدا کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Yes, I've discovered a few nice trails in the mountains nearby.",
                    persian = "بله، چند مسیر خوب در کوه‌های نزدیک کشف کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "I'd like to try some. Let me know next time you go.",
                    persian = "دوست دارم چندتاش رو امتحان کنم. دفعه بعد که رفتی خبرم کن."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I will. I'll probably go next weekend.",
                    persian = "می‌کنم. احتمالاً آخر هفته بعد می‌روم."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Perfect. By then, I'll have finished my current project.",
                    persian = "عالی. تا آن موقع، پروژه فعلی‌ام را تموم کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Great! See you then.",
                    persian = "عالی! اون موقع می‌بینمت."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "How long has Reza been studying English?",
                    answer = "For about five years."
                ),
                ComprehensionQuestion(
                    question = "Where did Reza live for two years?",
                    answer = "In Canada."
                ),
                ComprehensionQuestion(
                    question = "When did Reza come back?",
                    answer = "In 2022."
                ),
                ComprehensionQuestion(
                    question = "What did Reza do every weekend in Canada?",
                    answer = "He used to go hiking."
                ),
                ComprehensionQuestion(
                    question = "Why hasn't Reza been hiking much?",
                    answer = "He's been too busy lately."
                ),
                ComprehensionQuestion(
                    question = "What will Layla have done by next weekend?",
                    answer = "She'll have finished her current project."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your life experiences using different tenses and aspects.",
                    promptPersian = "درباره تجربه‌های زندگی‌ات با زمان‌ها و وجه‌های مختلف صحبت کن.",
                    hints = "Use: I've been..., I lived..., I had been..., I will have..."
                ),
                SpeakingTask(
                    prompt = "Describe a routine you used to have.",
                    promptPersian = "روتینی که قبلاً داشتی را توصیف کن.",
                    hints = "Use: I used to..., When I was younger, I would..."
                ),
                SpeakingTask(
                    prompt = "Talk about what you've accomplished and future plans.",
                    promptPersian = "درباره دستاوردها و برنامه‌های آینده‌ات صحبت کن.",
                    hints = "Use: I've already..., By next year, I'll have..., I'm planning to..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a personal narrative (about 250 words) about a significant experience. Use a variety of tenses and aspects.",
                    promptPersian = "یه روایت شخصی بنویس (حدود ۲۵۰ کلمه) درباره یه تجربه مهم. از تنوع زمان‌ها و وجه‌ها استفاده کن.",
                    wordCount = 250,
                    hints = "Include:\n1. Background with past progressive\n2. Events with past simple\n3. Preceding events with past perfect\n4. Ongoing situation with present perfect\n5. Future plans with future forms"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Complete: I ___ living here for five years.",
                    options = listOf("am", "was", "have been", "will be"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "I am knowing the answer.",
                        "I know the answer.",
                        "I am know the answer.",
                        "I knowing the answer."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ him yesterday.",
                    options = listOf("have seen", "saw", "had seen", "see"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: When I arrived, she ___ already left.",
                    options = listOf("has", "had", "was", "did"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What's the difference between 'I have lived here for 5 years' and 'I lived here for 5 years'?",
                    options = listOf(
                        "No difference",
                        "First means still living here; second means no longer",
                        "First is past; second is present",
                        "First is formal; second is informal"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: By 2030, I ___ finished my degree.",
                    options = listOf("will", "will have", "have", "had"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is a stative verb?",
                    options = listOf("work", "play", "know", "walk"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Complete: She ___ been studying all morning.",
                    options = listOf("have", "has", "is", "was"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 6 — Discourse Markers and Cohesion
    // ============================================================
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Discourse Markers and Cohesion",
            titlePersian = "نشانگرهای گفتمانی و انسجام",
            objectives = listOf(
                "Master discourse markers for organizing ideas.",
                "Use cohesive devices for connected text.",
                "Apply reference words for smooth writing.",
                "Use substitution and ellipsis correctly.",
                "Create coherent and cohesive writing."
            ),
            vocabulary = listOf(
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
                    english = "discourse",
                    persian = "گفتمان",
                    pronunciation = "/ˈdɪskɔːrs/",
                    partOfSpeech = "noun",
                    example = "Discourse markers organize text.",
                    examplePersian = "نشانگرهای گفتمانی متن را سازمان می‌دهند.",
                    usageTip = "در زبان‌شناسی."
                ),
                VocabWord(
                    english = "marker",
                    persian = "نشانگر",
                    pronunciation = "/ˈmɑːrkər/",
                    partOfSpeech = "noun",
                    example = "However is a discourse marker.",
                    examplePersian = "however یه نشانگر گفتمانیه.",
                    usageTip = "در زبان‌شناسی."
                ),
                VocabWord(
                    english = "reference",
                    persian = "ارجاع",
                    pronunciation = "/ˈrefrəns/",
                    partOfSpeech = "noun",
                    example = "Pronouns create reference in text.",
                    examplePersian = "ضمایر در متن ارجاع ایجاد می‌کنند.",
                    wordFamily = "refer, referential",
                    usageTip = "در انسجام."
                ),
                VocabWord(
                    english = "substitution",
                    persian = "جانشینی",
                    pronunciation = "/ˌsʌbstɪˈtuːʃən/",
                    partOfSpeech = "noun",
                    example = "Substitution avoids repetition.",
                    examplePersian = "جانشینی از تکرار جلوگیری می‌کند.",
                    wordFamily = "substitute",
                    usageTip = "در انسجام."
                ),
                VocabWord(
                    english = "ellipsis",
                    persian = "حذف",
                    pronunciation = "/ɪˈlɪpsɪs/",
                    partOfSpeech = "noun",
                    example = "Ellipsis omits unnecessary words.",
                    examplePersian = "حذف کلمات غیرضروری را حذف می‌کند.",
                    usageTip = "در انسجام."
                ),
                VocabWord(
                    english = "conjunction",
                    persian = "حرف ربط",
                    pronunciation = "/kənˈdʒʌŋkʃən/",
                    partOfSpeech = "noun",
                    example = "And, but, and or are conjunctions.",
                    examplePersian = "and، but و or حروف ربط هستند.",
                    usageTip = "در انسجام."
                ),
                VocabWord(
                    english = "transition",
                    persian = "انتقال",
                    pronunciation = "/trænˈzɪʃən/",
                    partOfSpeech = "noun",
                    example = "Transitions connect ideas.",
                    examplePersian = "انتقال‌ها ایده‌ها را به هم وصل می‌کنند.",
                    wordFamily = "transitional",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "connective",
                    persian = "پیونددهنده",
                    pronunciation = "/kəˈnektɪv/",
                    partOfSpeech = "noun",
                    example = "Connectives join sentences.",
                    examplePersian = "پیونددهنده‌ها جملات را به هم وصل می‌کنند.",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "addition",
                    persian = "اضافه",
                    pronunciation = "/əˈdɪʃən/",
                    partOfSpeech = "noun",
                    example = "Furthermore, moreover indicate addition.",
                    examplePersian = "furthermore و moreover اضافه را نشان می‌دهند.",
                    wordFamily = "add, additional",
                    usageTip = "در نشانگرهای گفتمانی."
                ),
                VocabWord(
                    english = "contrast",
                    persian = "مقایسه متضاد",
                    pronunciation = "/ˈkɑːntræst/",
                    partOfSpeech = "noun",
                    example = "However, nevertheless indicate contrast.",
                    examplePersian = "however و nevertheless تضاد را نشان می‌دهند.",
                    usageTip = "در نشانگرهای گفتمانی."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "on the other hand",
                    persian = "از طرف دیگر",
                    example = "On the other hand, there are risks.",
                    examplePersian = "از طرف دیگر، خطراتی وجود دارد.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "in addition",
                    persian = "علاوه بر این",
                    example = "In addition, we should consider costs.",
                    examplePersian = "علاوه بر این، باید هزینه‌ها را در نظر بگیریم.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "as a result",
                    persian = "در نتیجه",
                    example = "As a result, the project was delayed.",
                    examplePersian = "در نتیجه، پروژه به تأخیر افتاد.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "link to",
                    meaning = "to connect",
                    persian = "وصل کردن به",
                    example = "This idea links to the previous one.",
                    examplePersian = "این ایده به ایده قبلی وصل می‌شود."
                ),
                PhrasalVerb(
                    verb = "refer to",
                    meaning = "to mention",
                    persian = "اشاره کردن",
                    example = "The word 'this' refers to the previous sentence.",
                    examplePersian = "کلمه this به جمله قبلی اشاره می‌کند."
                ),
                PhrasalVerb(
                    verb = "build on",
                    meaning = "to develop from",
                    persian = "ساختن بر اساس",
                    example = "We can build on the previous work.",
                    examplePersian = "می‌توانیم بر اساس کار قبلی بسازیم."
                ),
                PhrasalVerb(
                    verb = "draw on",
                    meaning = "to use as a source",
                    persian = "استفاده کردن از",
                    example = "The author draws on personal experience.",
                    examplePersian = "نویسنده از تجربه شخصی استفاده می‌کند."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Stress in discourse markers",
                    content = "در نشانگرهای گفتمانی، کلمه اصلی تأکید می‌گیرد:\n• On the OTHER hand\n• As a REsult"
                ),
                PronunciationTip(
                    title = "Linking in transitions",
                    content = "در گفتار طبیعی، انتقال‌ها به هم می‌چسبند:\n• In addition → /ɪn əˈdɪʃən/"
                ),
                PronunciationTip(
                    title = "Intonation in discourse markers",
                    content = "در نشانگرهای گفتمانی، آهنگ معمولاً ملایم:\n• However, ... ↓\n• Moreover, ... ↓"
                ),
                PronunciationTip(
                    title = "Pause after markers",
                    content = "بعد از نشانگرهای گفتمانی، مکث کوتاه:\n• However, | we should consider..."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Academic writing style",
                    content = "در نوشتار آکادمیک انگلیسی، استفاده از discourse markers استاندارد است."
                ),
                CulturalNote(
                    title = "Formal vs informal",
                    content = "برخی نشانگرها رسمی هستند (moreover, furthermore) و برخی غیررسمی (besides, anyway)."
                ),
                CulturalNote(
                    title = "Cross-cultural differences",
                    content = "برخی فرهنگ‌ها استفاده کمتر یا بیشتر از نشانگرها دارند؛ در انگلیسی استاندارد استفاده متعادل توصیه می‌شود."
                ),
                CulturalNote(
                    title = "Overuse",
                    content = "استفاده بیش از حد از نشانگرها می‌تواند متن را مصنوعی کند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. What are Discourse Markers?",
                    content = """
Discourse markers = کلمات یا عباراتی که ایده‌ها را به هم وصل می‌کنند.

کارکردها:
• اضافه کردن (Addition)
• تضاد (Contrast)
• نتیجه (Result)
• علت (Cause)
• ترتیب (Sequence)
• مثال (Example)
• تأکید (Emphasis)
• خلاصه (Summary)

مثال:
• I like tea. However, I prefer coffee.
• She studied hard. As a result, she passed.
• First, we discussed the plan. Then, we implemented it.

نکته: discourse markers به خواننده کمک می‌کنند ساختار متن را بفهمد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Addition Markers",
                    content = """
نشانگرهای اضافه:

Formal:
• Moreover, furthermore, in addition, additionally
• What is more, not only that

Informal:
• Besides, also, as well, on top of that

مثال:
• The plan is expensive. Moreover, it's risky.
• She's talented. In addition, she works hard.
• It's raining. Besides, I'm tired.

نکته: این نشانگرها در ابتدای جمله می‌آیند و با کاما جدا می‌شوند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Contrast Markers",
                    content = """
نشانگرهای تضاد:

Direct contrast:
• However, nevertheless, nonetheless, still, yet
• On the other hand, in contrast, by contrast

Concessive:
• Although, even though, though
• Despite, in spite of
• While, whereas

مثال:
• The plan is good. However, it's expensive.
• Although she was tired, she kept working.
• Despite the rain, we went out.

نکته: However بین دو جمله، although در ابتدای clause.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Cause and Result Markers",
                    content = """
نشانگرهای علت و نتیجه:

Cause:
• Because, since, as, because of, due to, owing to

Result:
• So, therefore, thus, consequently, as a result
• Hence, accordingly

Purpose:
• To, in order to, so as to, so that

مثال:
• Because it was raining, we stayed home.
• It was raining. Therefore, we stayed home.
• Due to the rain, the event was canceled.
• As a result, the project was delayed.

نکته: therefore و consequently رسمی‌تر از so هستند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Sequence Markers",
                    content = """
نشانگرهای ترتیب:

Beginning:
• First, firstly, initially, to begin with

Middle:
• Second, secondly, then, next, after that, subsequently

End:
• Finally, lastly, in conclusion, to sum up

مثال:
• First, let's define the problem. Then, we'll discuss solutions. Finally, we'll implement the best one.

نکته: در نوشتار رسمی، از first/firstly استفاده کنید؛ در غیررسمی، از first.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Cohesion Devices",
                    content = """
ابزارهای انسجام:

Reference (ارجاع):
• Pronouns: I, you, he, she, it, we, they
• Demonstratives: this, that, these, those
• Comparatives: another, the same, similar

Substitution (جانشینی):
• one/ones: I'll take the red one.
• do/so: I think so. / She does too.
• neither/nor: Neither do I.

Ellipsis (حذف):
• (I) Hope to see you soon.
• She can swim, and he can (swim) too.

Conjunction (ربط):
• And, but, or, so, because

Lexical cohesion (انسجام واژگانی):
• Repetition: The car is fast. The car is red.
• Synonyms: The car is fast. The vehicle is red.
• Collocations: strong coffee, heavy rain

نکته: این ابزارها متن را یکپارچه می‌کنند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Reference Words in Text",
                    content = """
ارجاع در متن:

Anaphoric (اشاره به قبل):
• John came home. He was tired. (he = John)
• I bought a car. It's red. (it = car)
• She said that. That's true. (that = her statement)

Cataphoric (اشاره به بعد):
• This is what I mean: we need more time.
• Here's the problem: the budget is limited.

Exophoric (اشاره به خارج از متن):
• Look at that! (اشاره به چیزی که دیده می‌شود)

مثال کامل:
Last week, I met an old friend. She told me that she had just moved to London. This surprised me because she always said she loved living in our town.

در این متن:
• She = friend (anaphoric)
• This = that she moved (anaphoric)
• She = friend (anaphoric)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Cohesion vs Coherence",
                    content = """
تفاوت:

Cohesion (انسجام):
• اتصال سطحی کلمات و جملات
• از طریق: pronouns, conjunctions, substitutions
• ظاهر متن را به هم پیوند می‌دهد

Coherence (هم‌بستگی معنایی):
• ارتباط منطقی ایده‌ها
• از طریق: موضوع واحد، ترتیب منطقی، اعتبار استدلال
• محتوای متن را معنادار می‌کند

مثال cohesive but not coherent:
I have a cat. The economy is growing. My sister is a doctor.
(جملات به هم متصل اند ولی منطقاً بی‌ربط)

مثال coherent but not cohesive:
I woke up late. I missed the bus. I arrived late for work.
(مرتبط ولی بدون نشانگرهای صریح)

متن خوب نیاز به هر دو دارد.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "The plan is good, however it's expensive.",
                    correct = "The plan is good. However, it's expensive.",
                    explanation = "However بین دو جمله با نقطه یا کاما + نقطه‌ویرگول."
                ),
                CommonMistake(
                    wrong = "Because it was raining. Therefore, we stayed home.",
                    correct = "Because it was raining, we stayed home. / It was raining. Therefore, we stayed home.",
                    explanation = "Because یک clause نیاز دارد؛ therefore جمله مستقل."
                ),
                CommonMistake(
                    wrong = "Despite it was raining, we went out.",
                    correct = "Despite the rain, we went out. / Although it was raining, we went out.",
                    explanation = "Despite + noun/gerund؛ although + clause."
                ),
                CommonMistake(
                    wrong = "Although it was raining, but we went out.",
                    correct = "Although it was raining, we went out.",
                    explanation = "Although و but با هم نمی‌آیند."
                ),
                CommonMistake(
                    wrong = "I have a cat. The economy is growing.",
                    correct = "(جملات را با موضوع مرتبط بنویسید.)",
                    explanation = "Cohesion + coherence."
                ),
                CommonMistake(
                    wrong = "Also, moreover, furthermore, in addition, additionally, I think...",
                    correct = "Moreover, I think...",
                    explanation = "استفاده بیش از حد از نشانگرها متن را مصنوعی می‌کند."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Sara",
                    english = "I'm working on an essay about climate change.",
                    persian = "دارم روی یه مقاله درباره تغییر اقلیم کار می‌کنم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "That's a broad topic. How are you organizing it?",
                    persian = "این یه موضوع گسترده‌ست. چطور سازمانش می‌دهی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "First, I'll introduce the problem. Then, I'll discuss the causes. Finally, I'll suggest solutions.",
                    persian = "اول، مشکل را معرفی می‌کنم. بعد، علل را بحث می‌کنم. در نهایت، راه‌حل‌ها را پیشنهاد می‌دهم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Good structure. What about connecting your ideas?",
                    persian = "ساختار خوبی. اتصال ایده‌هات چطور؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "I'm using discourse markers to link my paragraphs.",
                    persian = "دارم از نشانگرهای گفتمانی برای وصل کردن پاراگراف‌هام استفاده می‌کنم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Smart. Which ones are you using?",
                    persian = "هوشمندانه. از کدوم‌ها استفاده می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "For addition, I use moreover and in addition. For contrast, however and on the other hand.",
                    persian = "برای اضافه، moreover و in addition. برای تضاد، however و on the other hand."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Nice. And for results?",
                    persian = "خوبه. برای نتایج؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Therefore and as a result. Also, consequently for stronger emphasis.",
                    persian = "therefore و as a result. همچنین consequently برای تأکید قوی‌تر."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "That's a good range. Don't forget reference words.",
                    persian = "دامنه خوبیه. ارجاع‌ها را فراموش نکن."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Yes, I'm using pronouns and demonstratives to avoid repetition.",
                    persian = "بله، از ضمایر و اشاره‌گرها برای پرهیز از تکرار استفاده می‌کنم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Perfect. Have you proofread it yet?",
                    persian = "عالی. هنوز ویرایشش کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Not yet. I'll do it tonight. By tomorrow, I'll have finished the final draft.",
                    persian = "هنوز نه. امشب انجام می‌دهم. تا فردا، پیش‌نویس نهایی را تموم کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Great. Let me know if you want feedback.",
                    persian = "عالی. اگه بازخورد خواستی خبرم کن."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "I will. Thanks!",
                    persian = "می‌کنم. ممنون!"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Anytime. Good luck!",
                    persian = "هر وقت. موفق باشی!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is Sara's essay about?",
                    answer = "It's about climate change."
                ),
                ComprehensionQuestion(
                    question = "How is Sara organizing her essay?",
                    answer = "First introducing the problem, then discussing causes, finally suggesting solutions."
                ),
                ComprehensionQuestion(
                    question = "What is Sara using to link paragraphs?",
                    answer = "Discourse markers."
                ),
                ComprehensionQuestion(
                    question = "Which markers does Sara use for contrast?",
                    answer = "However and on the other hand."
                ),
                ComprehensionQuestion(
                    question = "What is Sara using to avoid repetition?",
                    answer = "Pronouns and demonstratives."
                ),
                ComprehensionQuestion(
                    question = "When will Sara have finished the final draft?",
                    answer = "By tomorrow."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Present an argument using discourse markers for organization.",
                    promptPersian = "یه استدلال ارائه بده با استفاده از نشانگرهای گفتمانی برای سازماندهی.",
                    hints = "Use: First, moreover, however, as a result, in conclusion"
                ),
                SpeakingTask(
                    prompt = "Describe a process using sequence markers.",
                    promptPersian = "یه فرایند را با نشانگرهای ترتیب توصیف کن.",
                    hints = "Use: First, then, next, after that, finally"
                ),
                SpeakingTask(
                    prompt = "Discuss a controversial topic using contrast markers.",
                    promptPersian = "درباره یه موضوع جنجالی با نشانگرهای تضاد صحبت کن.",
                    hints = "Use: On the one hand, on the other hand, however, nevertheless"
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an argumentative essay (about 350 words) using a variety of discourse markers. Ensure both cohesion and coherence.",
                    promptPersian = "یه مقاله استدلالی بنویس (حدود ۳۵۰ کلمه) با استفاده از تنوع نشانگرهای گفتمانی. هم انسجام و هم هم‌بستگی معنایی را رعایت کن.",
                    wordCount = 350,
                    hints = "Include:\n1. Introduction\n2. Body with contrasting views\n3. Supporting evidence\n4. Conclusion"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Which is a marker of addition?",
                    options = listOf("However", "Moreover", "Therefore", "Because"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The plan is good. ___ it's expensive.",
                    options = listOf("Moreover", "However", "Therefore", "Also"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "Although it was raining, but we went out.",
                        "Although it was raining, we went out.",
                        "Although was raining, we went out.",
                        "Although raining, but we went out."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She studied hard. ___ she passed.",
                    options = listOf("However", "Therefore", "Although", "Despite"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'coherence' mean?",
                    options = listOf(
                        "اتصال سطحی",
                        "هم‌بستگی معنایی",
                        "تکرار",
                        "حذف"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: ___ the rain, we went out.",
                    options = listOf("Although", "Despite", "Because", "However"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is a reference word?",
                    options = listOf("and", "this", "therefore", "although"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: First, we discussed. ___, we implemented.",
                    options = listOf("However", "Then", "Because", "Despite"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 7 — Advanced Modality
    // ============================================================
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Advanced Modality",
            titlePersian = "وجهیت پیشرفته",
            objectives = listOf(
                "Master nuanced uses of modal verbs.",
                "Express degrees of certainty and obligation.",
                "Use modal perfects for complex meanings.",
                "Apply hedging and boosting appropriately.",
                "Distinguish subtle differences between modals."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "modality",
                    persian = "وجهیت",
                    pronunciation = "/moʊˈdæləti/",
                    partOfSpeech = "noun",
                    example = "Modality expresses attitude.",
                    examplePersian = "وجهیت نگرش را بیان می‌کند.",
                    usageTip = "در زبان‌شناسی."
                ),
                VocabWord(
                    english = "certainty",
                    persian = "قطعیت",
                    pronunciation = "/ˈsɜːrtənti/",
                    partOfSpeech = "noun",
                    example = "Modals express degrees of certainty.",
                    examplePersian = "افعال وجهی درجاتی از قطعیت را بیان می‌کنند.",
                    wordFamily = "certain, certainly",
                    usageTip = "در modals."
                ),
                VocabWord(
                    english = "obligation",
                    persian = "الزام",
                    pronunciation = "/ˌɑːblɪˈɡeɪʃən/",
                    partOfSpeech = "noun",
                    example = "Must expresses strong obligation.",
                    examplePersian = "must الزام قوی را بیان می‌کند.",
                    usageTip = "در modals."
                ),
                VocabWord(
                    english = "permission",
                    persian = "اجازه",
                    pronunciation = "/pərˈmɪʃən/",
                    partOfSpeech = "noun",
                    example = "May expresses formal permission.",
                    examplePersian = "may اجازه رسمی را بیان می‌کند.",
                    usageTip = "در modals."
                ),
                VocabWord(
                    english = "possibility",
                    persian = "احتمال",
                    pronunciation = "/ˌpɑːsəˈbɪləti/",
                    partOfSpeech = "noun",
                    example = "Might expresses weak possibility.",
                    examplePersian = "might احتمال ضعیف را بیان می‌کند.",
                    wordFamily = "possible, possibly",
                    usageTip = "در modals."
                ),
                VocabWord(
                    english = "hedging",
                    persian = "احتیاط در بیان",
                    pronunciation = "/ˈhedʒɪŋ/",
                    partOfSpeech = "noun",
                    example = "Hedging softens statements.",
                    examplePersian = "احتیاط در بیان جملات را نرم می‌کند.",
                    usageTip = "در نوشتار آکادمیک."
                ),
                VocabWord(
                    english = "boosting",
                    persian = "تأکید در بیان",
                    pronunciation = "/ˈbuːstɪŋ/",
                    partOfSpeech = "noun",
                    example = "Boosting strengthens claims.",
                    examplePersian = "تأکید در بیان ادعاها را تقویت می‌کند.",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "speculation",
                    persian = "گمانه‌زنی",
                    pronunciation = "/ˌspekjuˈleɪʃən/",
                    partOfSpeech = "noun",
                    example = "Might have indicates speculation.",
                    examplePersian = "might have گمانه‌زنی را نشان می‌دهد.",
                    wordFamily = "speculate, speculative",
                    usageTip = "در modal perfects."
                ),
                VocabWord(
                    english = "deduction",
                    persian = "استنتاج",
                    pronunciation = "/dɪˈdʌkʃən/",
                    partOfSpeech = "noun",
                    example = "Must have indicates deduction.",
                    examplePersian = "must have استنتاج را نشان می‌دهد.",
                    wordFamily = "deduce, deductive",
                    usageTip = "در modal perfects."
                ),
                VocabWord(
                    english = "advisability",
                    persian = "توصیه‌پذیری",
                    pronunciation = "/ədˌvaɪzəˈbɪləti/",
                    partOfSpeech = "noun",
                    example = "Should expresses advisability.",
                    examplePersian = "should توصیه‌پذیری را بیان می‌کند.",
                    wordFamily = "advise, advisable",
                    usageTip = "در modals."
                ),
                VocabWord(
                    english = "volition",
                    persian = "اراده",
                    pronunciation = "/voʊˈlɪʃən/",
                    partOfSpeech = "noun",
                    example = "Will expresses volition.",
                    examplePersian = "will اراده را بیان می‌کند.",
                    usageTip = "در modals."
                ),
                VocabWord(
                    english = "nuance",
                    persian = "ظرافت",
                    pronunciation = "/ˈnuːɑːns/",
                    partOfSpeech = "noun",
                    example = "Modals have many nuances.",
                    examplePersian = "افعال وجهی ظرافت‌های زیادی دارند.",
                    usageTip = "در زبان پیشرفته."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "you might as well",
                    persian = "بهتر نیست که",
                    example = "You might as well try.",
                    examplePersian = "بهتر نیست که امتحان کنی.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "would rather",
                    persian = "ترجیح دادن",
                    example = "I would rather stay home.",
                    examplePersian = "ترجیح می‌دهم خانه بمانم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "can't help but",
                    persian = "نتوانستن جلوگیری کردن",
                    example = "I can't help but worry.",
                    examplePersian = "نمی‌توانم نگران نباشم.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "might have",
                    meaning = "possible in past",
                    persian = "ممکنه در گذشته",
                    example = "She might have left already.",
                    examplePersian = "او ممکنه قبلاً رفته باشد."
                ),
                PhrasalVerb(
                    verb = "must have",
                    meaning = "certain in past",
                    persian = "حتماً در گذشته",
                    example = "He must have forgotten.",
                    examplePersian = "او حتماً فراموش کرده."
                ),
                PhrasalVerb(
                    verb = "should have",
                    meaning = "regret in past",
                    persian = "باید در گذشته",
                    example = "I should have called you.",
                    examplePersian = "باید بهت زنگ می‌زدم."
                ),
                PhrasalVerb(
                    verb = "could have",
                    meaning = "possibility in past",
                    persian = "می‌توانستم در گذشته",
                    example = "She could have helped.",
                    examplePersian = "او می‌توانست کمک کند."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Modal perfect reductions",
                    content = "در گفتار:\n• must have → /ˈmʌstəv/\n• should have → /ˈʃʊdəv/\n• could have → /ˈkʊdəv/"
                ),
                PronunciationTip(
                    title = "Stress on modals",
                    content = "در جمله، modal تأکید می‌گیرد:\n• You MUST try.\n• You SHOULD rest."
                ),
                PronunciationTip(
                    title = "Hedging intonation",
                    content = "در hedging، آهنگ ملایم و غیرقطعی:\n• It might be... ↑"
                ),
                PronunciationTip(
                    title = "Boosting stress",
                    content = "در boosting، تأکید قوی:\n• It DEFINITELY works."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Politeness in English",
                    content = "انگلیسی‌زبانان از modals برای نرم‌کردن درخواست استفاده می‌کنند: Could you...?"
                ),
                CulturalNote(
                    title = "Hedging in academic writing",
                    content = "در نوشتار آکادمیک، از hedging برای پرهیز از ادعاهای قطعی استفاده می‌شود: 'It may be the case that...'"
                ),
                CulturalNote(
                    title = "Modal choices and culture",
                    content = "انتخاب modal می‌تواند نشان‌دهنده رابطه قدرت، فاصله اجتماعی و ادب باشد."
                ),
                CulturalNote(
                    title = "Indirectness",
                    content = "در فرهنگ‌های انگلیسی‌زبان، استفاده از modals نشانه ادب و احترام است."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Degrees of Certainty",
                    content = """
میزان قطعیت modals:

Strong certainty (positive):
• must: She must be tired.
• will: She will be home now.
• can't: She can't be serious.

Medium certainty:
• should: She should be home now.
• ought to: She ought to be there.

Weak certainty:
• may: She may come.
• might: She might come.
• could: She could come.

Strong certainty (negative):
• can't: She can't be there.
• couldn't: She couldn't have known.

نکته: ترتیب قطعیت: must > will > should > may > might > could
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Modal Perfects for Speculation",
                    content = """
گمانه‌زنی درباره گذشته:

Strong deduction (positive):
• must have + pp: She must have forgotten.
• can't have + pp: She can't have said that.

Medium certainty:
• should have + pp: She should have arrived by now.

Weak possibility:
• may have + pp: She may have left.
• might have + pp: She might have called.
• could have + pp: She could have taken the train.

Continuous:
• must have been + -ing: She must have been working.
• might have been + -ing: He might have been sleeping.

نکته: این ساختارها برای گمانه‌زنی درباره گذشته استفاده می‌شوند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Obligation and Necessity",
                    content = """
درجات الزام:

Strong obligation:
• must: You must wear a seatbelt.
• have to: I have to work tomorrow.
• need to: You need to see a doctor.

Medium obligation:
• should: You should exercise more.
• ought to: You ought to apologize.

No obligation:
• don't have to: You don't have to come.
• don't need to: You don't need to bring anything.
• needn't: You needn't worry.

Prohibition:
• mustn't: You mustn't smoke here.
• can't: You can't park here.
• may not: Visitors may not touch the paintings.

نکته: mustn't ≠ don't have to
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Ability, Permission, Request",
                    content = """
Ability:
• can: I can swim.
• could: I could swim when I was young.
• be able to: I'll be able to help tomorrow.

Permission:
• can (informal): Can I leave?
• may (formal): May I come in?
• could (polite): Could I ask a question?
• be allowed to: You're allowed to park here.

Request:
• can (informal): Can you help me?
• could (polite): Could you help me?
• would (polite): Would you help me?
• will: Will you help me?

Offers:
• can: Can I help you?
• shall: Shall I open the window?
• would: Would you like some coffee?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Hedging in Academic Writing",
                    content = """
Hedging = نرم کردن ادعاها:

Modal hedges:
• may, might, could
• may indicate, could suggest

Adverb hedges:
• apparently, possibly, probably
• seemingly, reportedly

Adjective hedges:
• possible, likely, probable, apparent

Verb hedges:
• seem, appear, suggest, indicate, tend to

Phrases:
• It is possible that...
• It would appear that...
• It seems likely that...
• There is some evidence to suggest that...
• This may be due to...

مثال:
Instead of: This proves that X causes Y.
Better: This suggests that X may cause Y.

نکته: hedging از ادعاهای قطعی و غیرقابل دفاع پرهیز می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Boosting in Writing",
                    content = """
Boosting = تقویت ادعاها:

Strong modal verbs:
• must, will, cannot

Strong adverbs:
• clearly, certainly, definitely, obviously
• undoubtedly, undeniably, absolutely

Strong adjectives:
• essential, crucial, vital, fundamental

Emphatic structures:
• It is clear that...
• There is no doubt that...
• It is undeniable that...
• Without a doubt, ...

مثال:
Instead of: This might help.
Stronger: This clearly helps.

نکته: boosting در ادعاهایی که شواهد قوی دارند مناسب است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Nuances: Similar Modals, Different Meanings",
                    content = """
Must vs Have to:
• Must: داخلی (شخصی): I must exercise more.
• Have to: خارجی (قانون): I have to wear a uniform.

Mustn't vs Don't have to:
• Mustn't: ممنوعیت: You mustn't smoke here.
• Don't have to: عدم اجبار: You don't have to come.

Can vs Could:
• Can: توانایی/اجازه: I can swim.
• Could: گذشته/ادب: I could swim when young. / Could you help?

May vs Might:
• May: احتمال بیشتر: She may come. (۵۰٪)
• Might: احتمال کمتر: She might come. (۳۰٪)

Should vs Ought to:
• Should: توصیه عمومی: You should rest.
• Ought to: توصیه رسمی: You ought to apologize.

Will vs Would:
• Will: آینده/اراده: I will help.
• Would: شرطی/ادب: I would help if I could.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Fixed Modal Expressions",
                    content = """
عبارات ثابت با modals:

• had better: You'd better see a doctor.
• would rather: I'd rather stay home.
• would sooner: I'd sooner walk than drive.
• can't help: I can't help laughing.
• can't stand: I can't stand waiting.
• can't bear: I can't bear the noise.
• might as well: We might as well go now.
• may as well: You may as well try.
• would just as soon: I'd just as soon not go.

نکته: این عبارات معانی خاص دارند و باید حفظ شوند.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "You mustn't come if you're busy.",
                    correct = "You don't have to come if you're busy.",
                    explanation = "mustn't = ممنوعیت؛ don't have to = عدم اجبار."
                ),
                CommonMistake(
                    wrong = "She must have forgot.",
                    correct = "She must have forgotten.",
                    explanation = "past participle صحیح forget، forgotten است."
                ),
                CommonMistake(
                    wrong = "I should studied harder.",
                    correct = "I should have studied harder.",
                    explanation = "modal perfect = modal + have + pp."
                ),
                CommonMistake(
                    wrong = "It might be worked.",
                    correct = "It might work. / It might have worked.",
                    explanation = "modal + base verb یا modal perfect."
                ),
                CommonMistake(
                    wrong = "Must you have to go?",
                    correct = "Must you go? / Do you have to go?",
                    explanation = "must و have to را با هم استفاده نکنید."
                ),
                CommonMistake(
                    wrong = "This proves that X causes Y.",
                    correct = "This may suggest that X could contribute to Y.",
                    explanation = "در آکادمیک از hedging استفاده کنید."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Sara",
                    english = "Where is Ali? He should be here by now.",
                    persian = "علی کجاست؟ باید تا حالا اینجا باشه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "He might have missed the train. He's usually punctual.",
                    persian = "ممکنه قطار را از دست داده باشد. معمولاً وقت‌شناسه."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Or he could have forgotten about the meeting.",
                    persian = "یا ممکنه جلسه را فراموش کرده باشد."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Unlikely. He must have had some emergency.",
                    persian = "بعید است. حتماً یه وضعیت اضطراری داشته."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Let's call him. He may not have his phone on him.",
                    persian = "بیا بهش زنگ بزنیم. ممکنه گوشیش همراهش نباشه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Good idea. He should check his messages.",
                    persian = "ایده خوبی. باید پیام‌هاش را چک کنه."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "If he doesn't answer, we may have to start without him.",
                    persian = "اگه جواب نده، ممکنه مجبور باشیم بدونش شروع کنیم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "We could wait a bit. He might just be running late.",
                    persian = "می‌تونیم یه کم صبر کنیم. ممکنه فقط دیر کرده باشه."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "You're right. We shouldn't rush. Let's give him 15 minutes.",
                    persian = "حق داری. نباید عجله کنیم. بیا ۱۵ دقیقه بهش وقت بدیم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Agreed. Meanwhile, we can review the agenda.",
                    persian = "قبول. در همین حال، می‌تونیم آجندا را مرور کنیم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Good. By the way, have you seen the quarterly report?",
                    persian = "خوبه. راستی، گزارش فصلی رو دیدی؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Not yet. I should have read it before the meeting.",
                    persian = "هنوز نه. باید قبل از جلسه می‌خواندمش."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Don't worry. It might not be crucial for today.",
                    persian = "نگران نباش. ممکنه امروز حیاتی نباشه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Let's hope so. I'll read it tonight.",
                    persian = "امیدوارم. امشب می‌خوانمش."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Perfect. There's Ali! He must have caught the next train.",
                    persian = "عالی. علیه! حتماً قطار بعدی رو گرفته."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Finally! Let's get started.",
                    persian = "بالاخره! بیا شروع کنیم."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Where is Ali?",
                    answer = "He's not there yet; he might have missed the train."
                ),
                ComprehensionQuestion(
                    question = "What might have happened to Ali?",
                    answer = "He might have missed the train, forgotten the meeting, or had an emergency."
                ),
                ComprehensionQuestion(
                    question = "What do they decide?",
                    answer = "To call Ali and give him 15 minutes."
                ),
                ComprehensionQuestion(
                    question = "What does Reza wish about the report?",
                    answer = "He should have read it before the meeting."
                ),
                ComprehensionQuestion(
                    question = "What does Sara say might happen?",
                    answer = "They may have to start without him."
                ),
                ComprehensionQuestion(
                    question = "Where is Ali at the end?",
                    answer = "He arrived — he must have caught the next train."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Speculate about what happened to someone.",
                    promptPersian = "درباره اینکه برای کسی چه اتفاقی افتاده گمانه‌زنی کن.",
                    hints = "Use: must have, might have, could have, can't have"
                ),
                SpeakingTask(
                    prompt = "Give advice using different modals.",
                    promptPersian = "با افعال وجهی مختلف توصیه کن.",
                    hints = "Use: should, ought to, had better, might want to"
                ),
                SpeakingTask(
                    prompt = "Express different degrees of certainty.",
                    promptPersian = "درجات مختلف قطعیت را بیان کن.",
                    hints = "Use: must, will, should, may, might, could"
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an academic paragraph (about 250 words) on a topic of your choice. Use hedging to soften claims and modals for precision.",
                    promptPersian = "یه پاراگراف آکادمیک بنویس (حدود ۲۵۰ کلمه) درباره موضوعی به انتخاب خودت. از hedging برای نرم‌کردن ادعاها و modals برای دقت استفاده کن.",
                    wordCount = 250,
                    hints = "Include:\n1. Hedged claims\n2. Modal speculation\n3. Modal obligation\n4. Balanced viewpoint"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Which expresses the strongest certainty?",
                    options = listOf("must", "should", "may", "might"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: She ___ have forgotten.",
                    options = listOf("must", "musts", "must to", "is must"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What's the difference between 'mustn't' and 'don't have to'?",
                    options = listOf(
                        "No difference",
                        "Mustn't = prohibition; don't have to = no obligation",
                        "Mustn't = no obligation; don't have to = prohibition",
                        "Both mean prohibition"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ have studied harder.",
                    options = listOf("should", "shoulds", "should to", "is should"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Which is more formal?",
                    options = listOf(
                        "Can I come in?",
                        "May I come in?",
                        "Might I come in?",
                        "Could I come in?"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'hedging' mean?",
                    options = listOf(
                        "تأکید قوی",
                        "نرم کردن ادعا",
                        "افزودن اطلاعات",
                        "تکرار"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: You ___ worry. It's fine.",
                    options = listOf("mustn't", "needn't", "shouldn't", "can't"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: It ___ be true. I saw it myself.",
                    options = listOf("might", "may", "must", "could"),
                    correctIndex = 2
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 8 — Formal and Academic Writing
    // ============================================================
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Formal and Academic Writing",
            titlePersian = "نوشتار رسمی و آکادمیک",
            objectives = listOf(
                "Master formal register in writing.",
                "Use academic vocabulary appropriately.",
                "Apply complex sentence structures.",
                "Use hedging and boosting strategically.",
                "Produce sophisticated academic prose."
            ),
            vocabulary = listOf(
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
                    english = "academic",
                    persian = "آکادمیک",
                    pronunciation = "/ˌækəˈdemɪk/",
                    partOfSpeech = "adjective",
                    example = "Academic writing is formal.",
                    examplePersian = "نوشتار آکادمیک رسمیه.",
                    wordFamily = "academy, academically",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "objective",
                    persian = "عینی",
                    pronunciation = "/əbˈdʒektɪv/",
                    partOfSpeech = "adjective",
                    example = "Academic writing should be objective.",
                    examplePersian = "نوشتار آکادمیک باید عینی باشد.",
                    wordFamily = "objectivity, objectively",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "concise",
                    persian = "موجز",
                    pronunciation = "/kənˈsaɪs/",
                    partOfSpeech = "adjective",
                    example = "Be concise in your writing.",
                    examplePersian = "در نوشتارت موجز باش.",
                    wordFamily = "concisely, conciseness",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "precise",
                    persian = "دقیق",
                    pronunciation = "/prɪˈsaɪs/",
                    partOfSpeech = "adjective",
                    example = "Use precise language.",
                    examplePersian = "از زبان دقیق استفاده کن.",
                    wordFamily = "precisely, precision",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "paraphrase",
                    persian = "بازنویسی",
                    pronunciation = "/ˈpærəfreɪz/",
                    partOfSpeech = "verb",
                    example = "Paraphrase sources carefully.",
                    examplePersian = "منابع را با دقت بازنویسی کن.",
                    usageTip = "در ارجاع."
                ),
                VocabWord(
                    english = "cite",
                    persian = "ارجاع دادن",
                    pronunciation = "/saɪt/",
                    partOfSpeech = "verb",
                    example = "Cite your sources properly.",
                    examplePersian = "منابعت را درست ارجاع بده.",
                    wordFamily = "citation",
                    usageTip = "در نوشتار آکادمیک."
                ),
                VocabWord(
                    english = "thesis",
                    persian = "پایان‌نامه، تز",
                    pronunciation = "/ˈθiːsɪs/",
                    partOfSpeech = "noun",
                    example = "The thesis statement is key.",
                    examplePersian = "بیانیه تز کلیدیه.",
                    usageTip = "در نوشتار آکادمیک."
                ),
                VocabWord(
                    english = "abstract",
                    persian = "چکیده",
                    pronunciation = "/ˈæbstrækt/",
                    partOfSpeech = "noun",
                    example = "The abstract summarizes the paper.",
                    examplePersian = "چکیده مقاله را خلاصه می‌کند.",
                    usageTip = "در مقالات علمی."
                ),
                VocabWord(
                    english = "methodology",
                    persian = "روش‌شناسی",
                    pronunciation = "/ˌmeθəˈdɑːlədʒi/",
                    partOfSpeech = "noun",
                    example = "The methodology section describes procedures.",
                    examplePersian = "بخش روش‌شناسی رویه‌ها را توصیف می‌کند.",
                    wordFamily = "method, methodological",
                    usageTip = "در پژوهش."
                ),
                VocabWord(
                    english = "cohesive",
                    persian = "منسجم",
                    pronunciation = "/koʊˈhiːsɪv/",
                    partOfSpeech = "adjective",
                    example = "Write cohesive paragraphs.",
                    examplePersian = "پاراگراف‌های منسجم بنویس.",
                    wordFamily = "cohesion, cohesively",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "substantiate",
                    persian = "تأیید کردن",
                    pronunciation = "/səbˈstænʃieɪt/",
                    partOfSpeech = "verb",
                    example = "Substantiate your claims with evidence.",
                    examplePersian = "ادعاهایت را با شواهد تأیید کن.",
                    wordFamily = "substantial, substantiation",
                    usageTip = "در نوشتار آکادمیک."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in other words",
                    persian = "به عبارت دیگر",
                    example = "In other words, the data confirms our hypothesis.",
                    examplePersian = "به عبارت دیگر، داده‌ها فرضیه ما را تأیید می‌کنند.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "as stated above",
                    persian = "همانطور که گفته شد",
                    example = "As stated above, the results are significant.",
                    examplePersian = "همانطور که گفته شد، نتایج قابل توجهند.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "it follows that",
                    persian = "نتیجه می‌شود که",
                    example = "It follows that the policy was effective.",
                    examplePersian = "نتیجه می‌شود که سیاست مؤثر بوده.",
                    register = "formal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "set out",
                    meaning = "to explain in detail",
                    persian = "توصیف کردن",
                    example = "The paper sets out the methodology clearly.",
                    examplePersian = "مقاله روش‌شناسی را واضح توصیف می‌کند."
                ),
                PhrasalVerb(
                    verb = "carry out",
                    meaning = "to perform",
                    persian = "انجام دادن",
                    example = "They carried out extensive research.",
                    examplePersian = "آن‌ها تحقیقات گسترده‌ای انجام دادند."
                ),
                PhrasalVerb(
                    verb = "account for",
                    meaning = "to explain",
                    persian = "توضیح دادن",
                    example = "This theory accounts for the data.",
                    examplePersian = "این نظریه داده‌ها را توضیح می‌دهد."
                ),
                PhrasalVerb(
                    verb = "draw on",
                    meaning = "to use",
                    persian = "استفاده کردن",
                    example = "The study draws on multiple sources.",
                    examplePersian = "مطالعه از منابع متعدد استفاده می‌کند."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Formal stress patterns",
                    content = "در نوشتار رسمی، تأکید متعادل‌تر:\n• It is CLEAR that...\n• The evidence SUGGESTS..."
                ),
                PronunciationTip(
                    title = "Academic vocabulary stress",
                    content = "methodology: /ˌmeθəˈdɑːlədʒi/ — استرس روی do."
                ),
                PronunciationTip(
                    title = "Hedging intonation",
                    content = "در hedging، آهنگ ملایم:\n• It may be the case that... ↑"
                ),
                PronunciationTip(
                    title = "Linking in complex sentences",
                    content = "در جملات پیچیده، تأکید روی محتوای اصلی."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Academic writing conventions",
                    content = "در فرهنگ آکادمیک غربی، ساختار و صراحت اهمیت دارد: introduction, body, conclusion."
                ),
                CulturalNote(
                    title = "Citation ethics",
                    content = "ارجاع دقیق به منابع، بخش مهمی از اخلاق آکادمیک است."
                ),
                CulturalNote(
                    title = "Critical thinking",
                    content = "نوشتار آکادمیک انتظار تحلیل انتقادی دارد، نه فقط توصیف."
                ),
                CulturalNote(
                    title = "Objective tone",
                    content = "در نوشتار آکادمیک، پرهیز از 'I think' و 'in my opinion' توصیه می‌شود."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Register: Formal vs Informal",
                    content = """
تفاوت‌های کلیدی:

Vocabulary:
• Formal: commence, terminate, purchase, obtain
• Informal: start, end, buy, get

Contractions:
• Formal: do not, cannot, it is
• Informal: don't, can't, it's

Phrasal verbs vs single verbs:
• Formal: investigate, encounter, tolerate
• Informal: look into, run into, put up with

Pronouns:
• Formal: one, we, the researcher
• Informal: I, you, we (personal)

Sentence structure:
• Formal: longer, complex sentences
• Informal: shorter, simpler sentences

مثال:
Informal: I think we should start now.
Formal: It is recommended that the process commence immediately.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Academic Vocabulary",
                    content = """
جایگزین‌های آکادمیک:

Verbs:
• get → obtain, acquire, receive
• show → demonstrate, illustrate, indicate
• find → discover, identify, determine
• think → consider, believe, maintain
• say → state, assert, claim, argue
• help → facilitate, assist, contribute to

Adjectives:
• big → significant, substantial
• small → minor, negligible
• good → effective, beneficial, advantageous
• bad → detrimental, adverse, negative

Adverbs:
• very → highly, considerably
• really → truly, genuinely
• a lot → extensively, substantially

Noun phrases:
• the way people think → cognition, thought processes
• the problem of pollution → environmental degradation

نکته: از دیکشنری‌های تخصصی آکادمیک استفاده کنید.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Complex Sentence Structures",
                    content = """
ساختارهای جمله پیچیده:

Subordination:
• Although the policy has been criticized, it has proven effective.
• While the results are preliminary, they suggest a pattern.

Relative clauses:
• The study, which was conducted over five years, reveals...
• Researchers who study climate change argue that...

Nominalization:
• The implementation of the policy resulted in significant improvements.
• An analysis of the data indicates a correlation.

Passive voice:
• The experiment was conducted under controlled conditions.
• The results have been confirmed by multiple studies.

Cleft sentences:
• It is this factor that explains the discrepancy.
• What the study demonstrates is the need for reform.

مثال ترکیبی:
The data, which were collected over a three-year period, indicate that the intervention, although initially controversial, has had a substantial impact on the target population.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Structure of Academic Texts",
                    content = """
ساختار معمول:

Abstract:
• خلاصه کوتاه (۱۵۰-۲۵۰ کلمه)
• هدف، روش، نتایج، نتیجه‌گیری

Introduction:
• زمینه (background)
• شکاف پژوهشی (research gap)
• سؤال پژوهش
• هدف یا thesis statement

Literature Review:
• بررسی مطالعات پیشین
• شناسایی شکاف‌ها
• ارتباط با پژوهش حاضر

Methodology:
• روش پژوهش
• نمونه
• ابزار
• رویه

Results:
• ارائه یافته‌ها
• جداول و شکل‌ها
• بدون تفسیر

Discussion:
• تفسیر یافته‌ها
• مقایسه با مطالعات پیشین
• محدودیت‌ها
• پیامدها

Conclusion:
• خلاصه
• پیشنهادات
• کاربردها

References:
• ارجاع دقیق
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Hedging Strategies",
                    content = """
Hedging در نوشتار آکادمیک:

Modals:
• may, might, could
• The findings may indicate...

Adverbs:
• possibly, probably, apparently, seemingly
• This is probably due to...

Adjectives:
• possible, likely, apparent, potential
• A likely explanation is...

Verbs:
• seem, appear, suggest, indicate, tend to
• The evidence suggests that...
• This appears to be related to...

Phrases:
• It is possible that...
• It would seem that...
• There is some evidence to suggest...
• It could be argued that...
• This may be explained by...

مثال:
Strong claim: This proves the theory.
Hedged claim: This provides support for the theory and suggests it may be applicable in similar contexts.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Cohesion in Academic Writing",
                    content = """
انواع انسجام:

Lexical cohesion:
• Repetition: The policy... The policy...
• Synonyms: The policy... The measure...
• Collocations: enact policy, implement policy

Grammatical cohesion:
• Pronouns: it, they, this, that
• Reference: as mentioned above, as noted earlier
• Substitution: one, do, so
• Ellipsis: (leaving out redundant words)

Conjunctions:
• Addition: moreover, furthermore, in addition
• Contrast: however, nevertheless, whereas
• Cause: because, since, as, due to
• Result: therefore, consequently, as a result
• Purpose: in order to, so that
• Condition: if, unless, provided that

Paragraph structure:
• Topic sentence
• Supporting sentences
• Concluding sentence

نکته: انسجام + هم‌بستگی = متن مؤثر.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Citation and Referencing",
                    content = """
ارجاع در نوشتار آکادمیک:

Direct quotation:
• Smith (2020) argues that "the results are conclusive" (p. 45).

Paraphrase:
• According to Smith (2020), the results are conclusive.

Summary:
• Smith (2020) provides evidence supporting the theory.

Citation styles:
• APA: (Smith, 2020)
• MLA: (Smith 45)
• Chicago: (Smith 2020, 45)

Reporting verbs:
• Strong: argue, assert, demonstrate, prove
• Neutral: state, report, mention, note
• Weak: suggest, imply, hint, propose
• Critical: claim, allege, contend, question

مثال:
Some researchers (Smith, 2020; Jones, 2021) argue that... However, others (Brown, 2019) contend that...
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Errors in Academic Writing",
                    content = """
خطاهای رایج:

1. Informal register:
❌ I think we should look into this.
✅ It is recommended that this issue be investigated.

2. Personal pronouns (گاهی):
❌ I believe the results are significant.
✅ The results appear to be significant.

3. Contractions:
❌ The study doesn't prove anything.
✅ The study does not prove anything.

4. Too many phrasal verbs:
❌ We need to find out what happened.
✅ We must determine the cause.

5. Absolute claims:
❌ This proves the theory.
✅ This provides strong support for the theory.

6. Repetition:
❌ The policy is good. The policy helps people. The policy is necessary.
✅ The policy is beneficial, as it assists those in need and is therefore necessary.

7. Overuse of nominalization:
❌ The implementation of the modification of the system...
✅ Modifying the system...

نکته: تعادل در همه چیز کلید نوشتار مؤثر است.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I think we should look into this.",
                    correct = "It is recommended that this issue be investigated.",
                    explanation = "در نوشتار آکادمیک از لحن رسمی استفاده کنید."
                ),
                CommonMistake(
                    wrong = "The study doesn't prove anything.",
                    correct = "The study does not prove anything.",
                    explanation = "از contractions در نوشتار رسمی پرهیز کنید."
                ),
                CommonMistake(
                    wrong = "This proves the theory.",
                    correct = "This provides support for the theory.",
                    explanation = "از ادعاهای قطعی پرهیز کنید؛ از hedging استفاده کنید."
                ),
                CommonMistake(
                    wrong = "The policy is good. The policy helps. The policy works.",
                    correct = "The policy is effective, beneficial, and functional.",
                    explanation = "از تکرار پرهیز کنید؛ از تنوع واژگانی استفاده کنید."
                ),
                CommonMistake(
                    wrong = "The implementation of the modification of the system.",
                    correct = "Modifying the system.",
                    explanation = "از nominalization بیش از حد پرهیز کنید."
                ),
                CommonMistake(
                    wrong = "We found out the reason.",
                    correct = "We identified the cause.",
                    explanation = "در نوشتار آکادمیک از فعل ساده به جای phrasal verb استفاده کنید."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "How is your thesis progressing?",
                    persian = "پایان‌نامه‌ات چطور پیش می‌ره؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I've completed the literature review and I'm working on the methodology.",
                    persian = "مرور ادبیات را تمام کرده‌ام و دارم روی روش‌شناسی کار می‌کنم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Excellent. Make sure to substantiate every claim with evidence.",
                    persian = "عالی. مطمئن شو هر ادعا را با شواهد تأیید کنی."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Absolutely. I'm also being careful about hedging.",
                    persian = "قطعاً. همچنین درباره hedging مراقبم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Very good. Overstated claims weaken academic writing.",
                    persian = "خیلی خوب. ادعاهای مبالغه‌آمیز نوشتار آکادمیک را ضعیف می‌کنند."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I've been using phrases like 'the evidence suggests' and 'it would appear that'.",
                    persian = "از عباراتی مثل «شواهد نشان می‌دهد» و «به نظر می‌رسد که» استفاده کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Perfect. What about register?",
                    persian = "عالی. لحن چطور؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I've been revising to eliminate contractions and informal language.",
                    persian = "در حال بازنگری هستم تا contractions و زبان غیررسمی را حذف کنم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Great. And your citations?",
                    persian = "عالی. ارجاعاتت چطور؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I'm using APA style consistently throughout.",
                    persian = "به‌طور پیوسته از سبک APA استفاده می‌کنم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Excellent. Any difficulties?",
                    persian = "عالی. مشکلی داری؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "One challenge has been avoiding excessive nominalization.",
                    persian = "یکی از چالش‌ها پرهیز از nominalization بیش از حد بوده."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "That's common. Balance is key.",
                    persian = "این رایجه. تعادل کلیدیه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Understood. I should have the draft ready by next week.",
                    persian = "فهمیدم. باید پیش‌نویس تا هفته بعد آماده باشه."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Perfect. Send it when ready.",
                    persian = "عالی. وقتی آماده شد بفرست."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I will. Thank you for the guidance.",
                    persian = "می‌فرستم. ممنون برای راهنمایی."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What has Reza completed?",
                    answer = "He has completed the literature review."
                ),
                ComprehensionQuestion(
                    question = "What is Reza working on?",
                    answer = "He's working on the methodology."
                ),
                ComprehensionQuestion(
                    question = "What is Reza being careful about?",
                    answer = "Hedging."
                ),
                ComprehensionQuestion(
                    question = "What phrases is Reza using?",
                    answer = "Phrases like 'the evidence suggests' and 'it would appear that'."
                ),
                ComprehensionQuestion(
                    question = "What citation style is Reza using?",
                    answer = "APA style."
                ),
                ComprehensionQuestion(
                    question = "What has been a challenge?",
                    answer = "Avoiding excessive nominalization."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Present an academic argument using formal register.",
                    promptPersian = "یه استدلال آکادمیک را با لحن رسمی ارائه بده.",
                    hints = "Use: It is argued that..., The evidence suggests..., According to..."
                ),
                SpeakingTask(
                    prompt = "Discuss research findings using hedging.",
                    promptPersian = "یافته‌های پژوهشی را با hedging بحث کن.",
                    hints = "Use: The data may indicate..., It could be argued that..., This appears to be..."
                ),
                SpeakingTask(
                    prompt = "Give a formal presentation on a topic.",
                    promptPersian = "یه ارائه رسمی درباره یه موضوع بده.",
                    hints = "Structure: Introduction, methodology, findings, conclusion"
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an academic abstract (about 250 words) for a research paper. Use formal register, academic vocabulary, hedging, and appropriate structure.",
                    promptPersian = "یه چکیده آکادمیک بنویس (حدود ۲۵۰ کلمه) برای یه مقاله پژوهشی. از لحن رسمی، واژگان آکادمیک، hedging و ساختار مناسب استفاده کن.",
                    wordCount = 250,
                    hints = "Include:\n1. Purpose\n2. Methodology\n3. Key findings\n4. Implications"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Which is more academic?",
                    options = listOf(
                        "We found out the reason.",
                        "We identified the cause.",
                        "We got the reason.",
                        "We figured out why."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is formal register?",
                    options = listOf(
                        "The study doesn't prove anything.",
                        "The study does not prove anything.",
                        "The study don't prove nothing.",
                        "The study ain't proving anything."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which uses hedging?",
                    options = listOf(
                        "This proves the theory.",
                        "This provides support for the theory.",
                        "This definitely proves the theory.",
                        "This always proves the theory."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'substantiate' mean?",
                    options = listOf(
                        "انکار کردن",
                        "تأیید کردن",
                        "پنهان کردن",
                        "فراموش کردن"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is a reporting verb for a strong claim?",
                    options = listOf("suggest", "hint", "demonstrate", "imply"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Which is NOT recommended in academic writing?",
                    options = listOf(
                        "Passive voice",
                        "Nominalization",
                        "Contractions",
                        "Hedging"
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "What does 'cohesion' refer to?",
                    options = listOf(
                        "ارتباط معنایی",
                        "اتصال سطحی متن",
                        "حذف کلمات",
                        "تکرار"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is the best academic phrasing?",
                    options = listOf(
                        "I think the results are good.",
                        "The results appear to be significant.",
                        "The results are awesome.",
                        "The results are really great."
                    ),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 9 — Complex Syntax
    // ============================================================
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Complex Syntax",
            titlePersian = "نحو پیچیده",
            objectives = listOf(
                "Master complex sentence structures.",
                "Use subordination and coordination effectively.",
                "Apply various types of clauses.",
                "Use non-finite clauses appropriately.",
                "Create sophisticated syntactic variety."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "syntax",
                    persian = "نحو",
                    pronunciation = "/ˈsɪntæks/",
                    partOfSpeech = "noun",
                    example = "Complex syntax adds sophistication.",
                    examplePersian = "نحو پیچیده پیچیدگی اضافه می‌کند.",
                    wordFamily = "syntactic, syntactically",
                    usageTip = "در زبان‌شناسی."
                ),
                VocabWord(
                    english = "clause",
                    persian = "بند",
                    pronunciation = "/klɔːz/",
                    partOfSpeech = "noun",
                    example = "A sentence can contain multiple clauses.",
                    examplePersian = "یه جمله می‌تواند چندین بند داشته باشد.",
                    usageTip = "در تحلیل گرامری."
                ),
                VocabWord(
                    english = "subordinate",
                    persian = "پیرو",
                    pronunciation = "/səˈbɔːrdɪnət/",
                    partOfSpeech = "adjective",
                    example = "A subordinate clause depends on the main clause.",
                    examplePersian = "بند پیرو به بند اصلی وابسته است.",
                    usageTip = "در جمله پیچیده."
                ),
                VocabWord(
                    english = "coordinate",
                    persian = "هم‌پایه",
                    pronunciation = "/koʊˈɔːrdɪnət/",
                    partOfSpeech = "adjective",
                    example = "Coordinate clauses have equal weight.",
                    examplePersian = "بندهای هم‌پایه وزن برابر دارند.",
                    usageTip = "در جمله مرکب."
                ),
                VocabWord(
                    english = "non-finite",
                    persian = "غیرشخصی",
                    pronunciation = "/nɑːn ˈfaɪnaɪt/",
                    partOfSpeech = "adjective",
                    example = "Non-finite clauses have no subject-verb agreement.",
                    examplePersian = "بندهای غیرشخصی توافق فاعل-فعل ندارند.",
                    usageTip = "در نحو پیشرفته."
                ),
                VocabWord(
                    english = "embedding",
                    persian = "توکارسازی",
                    pronunciation = "/ɪmˈbedɪŋ/",
                    partOfSpeech = "noun",
                    example = "Embedding creates complex structures.",
                    examplePersian = "توکارسازی ساختارهای پیچیده ایجاد می‌کند.",
                    usageTip = "در نحو."
                ),
                VocabWord(
                    english = "hierarchy",
                    persian = "سلسله‌مراتب",
                    pronunciation = "/ˈhaɪərɑːrki/",
                    partOfSpeech = "noun",
                    example = "Sentences have hierarchical structures.",
                    examplePersian = "جملات ساختارهای سلسله‌مراتبی دارند.",
                    wordFamily = "hierarchical",
                    usageTip = "در تحلیل."
                ),
                VocabWord(
                    english = "variety",
                    persian = "تنوع",
                    pronunciation = "/vəˈraɪəti/",
                    partOfSpeech = "noun",
                    example = "Sentence variety improves writing.",
                    examplePersian = "تنوع جمله نوشتار را بهتر می‌کند.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "rhythm",
                    persian = "ریتم",
                    pronunciation = "/ˈrɪðəm/",
                    partOfSpeech = "noun",
                    example = "Good writers use sentence rhythm.",
                    examplePersian = "نویسندگان خوب از ریتم جمله استفاده می‌کنند.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "concise",
                    persian = "موجز",
                    pronunciation = "/kənˈsaɪs/",
                    partOfSpeech = "adjective",
                    example = "Concise sentences are effective.",
                    examplePersian = "جملات موجز مؤثرند.",
                    wordFamily = "concisely, conciseness",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "verbose",
                    persian = "پرگو",
                    pronunciation = "/vɜːrˈboʊs/",
                    partOfSpeech = "adjective",
                    example = "Verbose writing is hard to read.",
                    examplePersian = "نوشتار پرگو سخت خوانده می‌شود.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "parallel",
                    persian = "موازی",
                    pronunciation = "/ˈpærəlel/",
                    partOfSpeech = "adjective",
                    example = "Use parallel structures in lists.",
                    examplePersian = "از ساختارهای موازی در فهرست‌ها استفاده کن.",
                    wordFamily = "parallelism",
                    usageTip = "در نوشتار."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in a nutshell",
                    persian = "به طور خلاصه",
                    example = "In a nutshell, the plan is risky.",
                    examplePersian = "به طور خلاصه، طرح پرخطر است.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "to put it simply",
                    persian = "به زبان ساده",
                    example = "To put it simply, we need more time.",
                    examplePersian = "به زبان ساده، به وقت بیشتری نیاز داریم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "at the end of the day",
                    persian = "در نهایت",
                    example = "At the end of the day, results matter.",
                    examplePersian = "در نهایت، نتایج مهم هستند.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "set out",
                    meaning = "to explain in detail",
                    persian = "توصیف کردن",
                    example = "The author sets out the arguments clearly.",
                    examplePersian = "نویسنده استدلال‌ها را واضح توصیف می‌کند."
                ),
                PhrasalVerb(
                    verb = "build up",
                    meaning = "to develop gradually",
                    persian = "به تدریج ساختن",
                    example = "The argument builds up to a strong conclusion.",
                    examplePersian = "استدلال به تدریج به نتیجه‌ای قوی می‌رسد."
                ),
                PhrasalVerb(
                    verb = "work out",
                    meaning = "to develop successfully",
                    persian = "به نتیجه رسیدن",
                    example = "The structure works out well.",
                    examplePersian = "ساختار به خوبی به نتیجه می‌رسد."
                ),
                PhrasalVerb(
                    verb = "boil down to",
                    meaning = "to be essentially",
                    persian = "خلاصه شدن در",
                    example = "It boils down to two choices.",
                    examplePersian = "به دو انتخاب خلاصه می‌شود."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Pause in complex sentences",
                    content = "در جملات پیچیده، مکث بین بندها:\n• Although it was raining, | we went out."
                ),
                PronunciationTip(
                    title = "Stress in subordination",
                    content = "در بند پیرو، تأکید ملایم:\n• ALTHOUGH it was raining, we WENT OUT."
                ),
                PronunciationTip(
                    title = "Rhythm in complex syntax",
                    content = "در جملات پیچیده، تعادل بین بندهای کوتاه و بلند."
                ),
                PronunciationTip(
                    title = "Non-finite clause stress",
                    content = "در بندهای غیرشخصی، فعل -ing/past participle تأکید می‌گیرد:\n• Walking home, I SAW him."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Variety in English writing",
                    content = "در نوشتار انگلیسی، تنوع جمله ارزش دارد: ترکیب جملات کوتاه و بلند."
                ),
                CulturalNote(
                    title = "Academic style",
                    content = "در نوشتار آکادمیک، جملات پیچیده رایجند ولی نباید بیش از حد طولانی باشند."
                ),
                CulturalNote(
                    title = "Journalistic style",
                    content = "در ژورنالیسم، جملات کوتاه‌تر و مستقیم‌تر ترجیح داده می‌شوند."
                ),
                CulturalNote(
                    title = "Literary style",
                    content = "در ادبیات، تنوع و ریتم جمله نقش کلیدی دارد."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Sentence Types",
                    content = """
انواع جمله:

Simple: یک clause مستقل
• I work.

Compound: دو یا چند clause مستقل
• I work, and she studies.

Complex: یک clause مستقل + حداقل یک clause وابسته
• I work because I need money.

Compound-complex: ترکیب
• I work because I need money, and she studies because she loves it.

نکته: تنوع در استفاده از انواع جمله، نوشتار را جذاب‌تر می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Subordinate Clauses",
                    content = """
بندهای پیرو انواع مختلف:

Noun clauses:
• I know that he is coming.
• What she said was true.

Adjective (relative) clauses:
• The book that I read was good.
• The man who called is my friend.

Adverb clauses:
• Time: When I arrived, she left.
• Cause: Because it rained, we stayed.
• Purpose: So that we could help, we came.
• Condition: If you study, you'll pass.
• Concession: Although it's hard, I'll try.
• Comparison: She works harder than I do.

نکته: بندهای پیرو می‌توانند در ابتدا، وسط یا انتهای جمله بیایند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Coordinate and Correlative Conjunctions",
                    content = """
هم‌پایه‌سازی:

Coordinate conjunctions:
• and, but, or, nor, for, so, yet
• I like tea, but she prefers coffee.

Correlative conjunctions:
• both...and: Both the teacher and the students were happy.
• either...or: Either you leave, or I will.
• neither...nor: Neither he nor she came.
• not only...but also: Not only is she smart, but she's also kind.

نکته: در correlative conjunctions، ساختار باید موازی باشد:
❌ Not only she is smart but also kind.
✅ She is not only smart but also kind.

Punctuation:
• بین دو clause مستقل: , + conjunction
• لیست: A, B, and C
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Non-finite Clauses",
                    content = """
بندهای غیرشخصی:

Infinitive clauses:
• To succeed, you must work hard.
• I want to help you.

-ing clauses (present participle):
• Walking home, I saw a friend.
• Feeling tired, she went to bed.
• The man standing there is my uncle.

-ed clauses (past participle):
• Written in 1900, the book is now a classic.
• The window broken by the storm needs repair.

Perfect participles:
• Having finished her work, she left.
• Not having studied, he failed the exam.

نکته: بندهای غیرشخصی فشرده‌سازی و تنوع ایجاد می‌کنند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Embedding and Nesting",
                    content = """
توکارسازی:

Simple embedding:
• The book that I bought yesterday is interesting.
• The man who called you is my uncle.

Double embedding:
• The book that I bought from the shop which opened last week is interesting.
• The woman who lives in the house that we visited is my aunt.

Nested clauses:
• I think that she said that he would come.

نکته: توکارسازی زیاد می‌تواند جمله را دشوار کند. تعادل مهم است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Parallelism",
                    content = """
ساختار موازی:

Parallel structure در لیست‌ها:
❌ She likes reading, to swim, and cooking.
✅ She likes reading, swimming, and cooking.

Parallel structure در مقایسه‌ها:
❌ Reading is better than to watch TV.
✅ Reading is better than watching TV.

Parallel structure با correlatives:
❌ Not only does she sing, but also she dances.
✅ She not only sings but also dances.

Parallelism در clauses:
❌ He came, ate, and was sleeping.
✅ He came, ate, and slept.

نکته: parallelism به خوانایی کمک می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Sentence Variety",
                    content = """
تنوع در ساختار جمله:

Short sentences:
• I left.

Long sentences:
• After a long day at work, and despite feeling exhausted, I finally decided to leave.

Interrogative:
• What does this mean?

Imperative:
• Consider the implications.

Exclamatory:
• What a wonderful surprise!

Cleft:
• It was this decision that changed everything.

Inverted:
• Never had I felt so lost.

نکته: تنوع جمله به نوشتار ریتم و جذابیت می‌دهد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Common Errors in Complex Syntax",
                    content = """
خطاهای رایج:

1. Comma splice:
❌ I came home, I was tired.
✅ I came home. I was tired.
✅ I came home, and I was tired.

2. Run-on sentence:
❌ I came home I was tired.
✅ I came home. I was tired.

3. Fragment:
❌ Because I was tired.
✅ I went to bed because I was tired.

4. Dangling modifier:
❌ Walking down the street, the trees were beautiful.
✅ Walking down the street, I saw beautiful trees.

5. Misplaced modifier:
❌ I saw the man with the telescope.
✅ With the telescope, I saw the man.

6. Faulty parallelism:
❌ She likes reading, to swim, and cooking.
✅ She likes reading, swimming, and cooking.

نکته: این خطاها نوشتار را ضعیف می‌کنند.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I came home, I was tired.",
                    correct = "I came home. I was tired. / I came home, and I was tired.",
                    explanation = "Comma splice — دو clause مستقل را با کاما جدا نکنید."
                ),
                CommonMistake(
                    wrong = "Because I was tired.",
                    correct = "I went to bed because I was tired.",
                    explanation = "Fragment — clause وابسته به تنهایی جمله کامل نیست."
                ),
                CommonMistake(
                    wrong = "Walking down the street, the trees were beautiful.",
                    correct = "Walking down the street, I saw beautiful trees.",
                    explanation = "Dangling modifier — فاعل باید با فعل مطابقت داشته باشد."
                ),
                CommonMistake(
                    wrong = "She likes reading, to swim, and cooking.",
                    correct = "She likes reading, swimming, and cooking.",
                    explanation = "Parallelism — ساختار موازی در لیست."
                ),
                CommonMistake(
                    wrong = "I saw the man with the telescope.",
                    correct = "With the telescope, I saw the man.",
                    explanation = "Misplaced modifier — modifier باید به کلمه صحیح نزدیک باشد."
                ),
                CommonMistake(
                    wrong = "Not only she is smart but also kind.",
                    correct = "She is not only smart but also kind.",
                    explanation = "Correlative conjunctions — ساختار موازی."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Layla",
                    english = "I'm trying to improve my writing style.",
                    persian = "دارم سعی می‌کنم سبک نوشتاری‌ام را بهتر کنم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "That's great. What are you focusing on?",
                    persian = "عالیه. روی چی تمرکز می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Sentence variety. I tend to use the same structure repeatedly.",
                    persian = "تنوع جمله. تمایل دارم مکرراً از یه ساختار استفاده کنم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "That's common. Try mixing short and long sentences.",
                    persian = "این رایجه. سعی کن جملات کوتاه و بلند را ترکیب کنی."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "I've also been working on non-finite clauses.",
                    persian = "روی بندهای غیرشخصی هم کار کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Nice. Those add sophistication when used correctly.",
                    persian = "خوبه. وقتی درست استفاده بشن پیچیدگی اضافه می‌کنن."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Exactly. I've been avoiding dangling modifiers, too.",
                    persian = "دقیقاً. از dangling modifiers هم پرهیز کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Smart. That's a common mistake.",
                    persian = "هوشمندانه. این یه اشتباه رایجه."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Do you have any tips for complex syntax?",
                    persian = "برای نحو پیچیده توصیه‌ای داری؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Focus on parallelism and coordination.",
                    persian = "روی parallelism و هم‌پایگی تمرکز کن."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "I've been doing that. It's really helping.",
                    persian = "همین کار را می‌کنم. واقعاً کمک می‌کنه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Great. Reading widely also helps develop syntactic sense.",
                    persian = "عالی. خواندن گسترده هم به توسعه حس نحوی کمک می‌کنه."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "I'll keep that in mind. Thanks!",
                    persian = "در نظر خواهم گرفت. ممنون!"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Anytime. Keep practicing!",
                    persian = "هر وقت. به تمرین ادامه بده!"
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is Layla trying to improve?",
                    answer = "Her writing style, focusing on sentence variety."
                ),
                ComprehensionQuestion(
                    question = "What does Reza suggest?",
                    answer = "Mixing short and long sentences."
                ),
                ComprehensionQuestion(
                    question = "What else has Layla been working on?",
                    answer = "Non-finite clauses and avoiding dangling modifiers."
                ),
                ComprehensionQuestion(
                    question = "What does Reza suggest focusing on?",
                    answer = "Parallelism and coordination."
                ),
                ComprehensionQuestion(
                    question = "What also helps develop syntactic sense?",
                    answer = "Reading widely."
                ),
                ComprehensionQuestion(
                    question = "What does Reza say at the end?",
                    answer = "Keep practicing."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Use sentence variety to describe a process.",
                    promptPersian = "با تنوع جمله یه فرایند را توصیف کن.",
                    hints = "Mix short and long sentences, use different clause types."
                ),
                SpeakingTask(
                    prompt = "Use non-finite clauses to add sophistication.",
                    promptPersian = "با بندهای غیرشخصی پیچیدگی اضافه کن.",
                    hints = "Use: Walking home, I..., Having finished, she..., To succeed, you..."
                ),
                SpeakingTask(
                    prompt = "Use parallel structures in a comparison.",
                    promptPersian = "در یه مقایسه از ساختارهای موازی استفاده کن.",
                    hints = "Use: Not only... but also..., Both... and..., Neither... nor..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a descriptive paragraph (about 250 words) about a place or event. Use a variety of sentence structures: simple, compound, complex, and compound-complex.",
                    promptPersian = "یه پاراگراف توصیفی بنویس (حدود ۲۵۰ کلمه) درباره یه مکان یا رویداد. از انواع ساختارهای جمله استفاده کن: ساده، مرکب، پیچیده و مرکب-پیچیده.",
                    wordCount = 250,
                    hints = "Include:\n1. Short impactful sentences\n2. Complex descriptive sentences\n3. Parallel structures\n4. Non-finite clauses"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Which is a complex sentence?",
                    options = listOf(
                        "I work.",
                        "I work, and she studies.",
                        "I work because I need money.",
                        "I work."
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Which has a dangling modifier?",
                    options = listOf(
                        "Walking down the street, I saw trees.",
                        "Walking down the street, the trees were beautiful.",
                        "As I walked down the street, I saw trees.",
                        "While walking, I saw trees."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which shows correct parallelism?",
                    options = listOf(
                        "She likes reading, to swim, and cooking.",
                        "She likes reading, swimming, and cooking.",
                        "She likes to read, swimming, and cooking.",
                        "She likes reading, swim, and cooking."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What's wrong with 'I came home, I was tired'?",
                    options = listOf(
                        "Nothing",
                        "Comma splice",
                        "Fragment",
                        "Run-on"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: ___ her work, she left.",
                    options = listOf("Finish", "Finished", "Having finished", "Finishing"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Which is correct?",
                    options = listOf(
                        "Not only she is smart but also kind.",
                        "She is not only smart but also kind.",
                        "She not only is smart but also kind.",
                        "Not only is she smart but also kind."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What is a non-finite clause?",
                    options = listOf(
                        "A clause with a subject-verb agreement",
                        "A clause without subject-verb agreement",
                        "A main clause",
                        "An independent clause"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is a compound sentence?",
                    options = listOf(
                        "I work.",
                        "I work because I need money.",
                        "I work, and she studies.",
                        "When I work, I focus."
                    ),
                    correctIndex = 2
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 10 — Word Formation and Vocabulary Building
    // ============================================================
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Word Formation and Vocabulary Building",
            titlePersian = "ساخت واژه و گسترش واژگان",
            objectives = listOf(
                "Master common word formation processes.",
                "Use prefixes and suffixes accurately.",
                "Understand compounding and conversion.",
                "Build vocabulary through word families.",
                "Apply word formation in context."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "prefix",
                    persian = "پیشوند",
                    pronunciation = "/ˈpriːfɪks/",
                    partOfSpeech = "noun",
                    example = "Un- is a common prefix.",
                    examplePersian = "un- یه پیشوند رایجه.",
                    usageTip = "در ساخت واژه."
                ),
                VocabWord(
                    english = "suffix",
                    persian = "پسوند",
                    pronunciation = "/ˈsʌfɪks/",
                    partOfSpeech = "noun",
                    example = "-ness is a common suffix.",
                    examplePersian = "-ness یه پسوند رایجه.",
                    usageTip = "در ساخت واژه."
                ),
                VocabWord(
                    english = "root",
                    persian = "ریشه",
                    pronunciation = "/ruːt/",
                    partOfSpeech = "noun",
                    example = "The root 'act' appears in many words.",
                    examplePersian = "ریشه act در کلمات زیادی ظاهر می‌شود.",
                    usageTip = "در ساخت واژه."
                ),
                VocabWord(
                    english = "derivation",
                    persian = "اشتقاق",
                    pronunciation = "/ˌderɪˈveɪʃən/",
                    partOfSpeech = "noun",
                    example = "Derivation creates new words.",
                    examplePersian = "اشتقاق کلمات جدید ایجاد می‌کند.",
                    wordFamily = "derive, derivative",
                    usageTip = "در ساخت واژه."
                ),
                VocabWord(
                    english = "compound",
                    persian = "مرکب",
                    pronunciation = "/ˈkɑːmpaʊnd/",
                    partOfSpeech = "noun",
                    example = "Toothbrush is a compound word.",
                    examplePersian = "مسواک یه کلمه مرکبه.",
                    usageTip = "در ساخت واژه."
                ),
                VocabWord(
                    english = "conversion",
                    persian = "تبدیل",
                    pronunciation = "/kənˈvɜːrʒən/",
                    partOfSpeech = "noun",
                    example = "Conversion changes word class.",
                    examplePersian = "تبدیل کلاس کلمه را عوض می‌کند.",
                    usageTip = "در ساخت واژه."
                ),
                VocabWord(
                    english = "collocation",
                    persian = "هم‌نشینی",
                    pronunciation = "/ˌkɑːləˈkeɪʃən/",
                    partOfSpeech = "noun",
                    example = "Strong coffee is a collocation.",
                    examplePersian = "قهوه غلیظ یه هم‌نشینیه.",
                    usageTip = "در یادگیری واژگان."
                ),
                VocabWord(
                    english = "word family",
                    persian = "خانواده واژگانی",
                    pronunciation = "/wɜːrd ˈfæməli/",
                    partOfSpeech = "noun",
                    example = "Act, action, active form a word family.",
                    examplePersian = "act، action و active یه خانواده واژگانی می‌سازند.",
                    usageTip = "در یادگیری واژگان."
                ),
                VocabWord(
                    english = "cognate",
                    persian = "هم‌ریشه",
                    pronunciation = "/ˈkɑːɡneɪt/",
                    partOfSpeech = "noun",
                    example = "English and German share many cognates.",
                    examplePersian = "انگلیسی و آلمانی هم‌ریشه‌های زیادی دارند.",
                    usageTip = "در زبان‌شناسی."
                ),
                VocabWord(
                    english = "loanword",
                    persian = "وام‌واژه",
                    pronunciation = "/ˈloʊnwɜːrd/",
                    partOfSpeech = "noun",
                    example = "Sushi is a loanword in English.",
                    examplePersian = "سوشی یه وام‌واژه در انگلیسیه.",
                    usageTip = "در زبان‌شناسی."
                ),
                VocabWord(
                    english = "acronym",
                    persian = "سرواژه",
                    pronunciation = "/ˈækrənɪm/",
                    partOfSpeech = "noun",
                    example = "NASA is an acronym.",
                    examplePersian = "NASA یه سرواژه‌ست.",
                    usageTip = "در ساخت واژه."
                ),
                VocabWord(
                    english = "blend",
                    persian = "آمیخته",
                    pronunciation = "/blend/",
                    partOfSpeech = "noun",
                    example = "Brunch is a blend of breakfast and lunch.",
                    examplePersian = "برانچ آمیخته‌ای از صبحانه و ناهاره.",
                    usageTip = "در ساخت واژه."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "in other words",
                    persian = "به عبارت دیگر",
                    example = "In other words, we need to reconsider.",
                    examplePersian = "به عبارت دیگر، باید تجدیدنظر کنیم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "word for word",
                    persian = "کلمه به کلمه",
                    example = "Translate it word for word.",
                    examplePersian = "کلمه به کلمه ترجمه کن.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "in a word",
                    persian = "در یک کلمه",
                    example = "In a word, it was fantastic.",
                    examplePersian = "در یک کلمه، فوق‌العاده بود.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "come across",
                    meaning = "to find by chance",
                    persian = "اتفاقی پیدا کردن",
                    example = "I came across a useful word.",
                    examplePersian = "یه کلمه مفید اتفاقی پیدا کردم."
                ),
                PhrasalVerb(
                    verb = "figure out",
                    meaning = "to understand",
                    persian = "فهمیدن",
                    example = "Can you figure out the meaning?",
                    examplePersian = "می‌تونی معنی را بفهمی؟"
                ),
                PhrasalVerb(
                    verb = "look up",
                    meaning = "to search for",
                    persian = "جستجو کردن",
                    example = "Look up the word in a dictionary.",
                    examplePersian = "کلمه را در دیکشنری جستجو کن."
                ),
                PhrasalVerb(
                    verb = "pick up",
                    meaning = "to learn informally",
                    persian = "یاد گرفتن",
                    example = "I picked up new words from movies.",
                    examplePersian = "کلمات جدید را از فیلم‌ها یاد گرفتم."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Prefix stress",
                    content = "بیشتر prefixها تأکید نمی‌گیرند:\n• unHAPPy\n• reWRITE\n• imPOSsible"
                ),
                PronunciationTip(
                    title = "Suffix stress",
                    content = "برخی پسوندها تأکید را جابجا می‌کنند:\n• photoGRAPH → phoTOgraphy\n• deCIDE → deCIsion"
                ),
                PronunciationTip(
                    title = "Compound stress",
                    content = "در اسم‌های مرکب، تأکید روی بخش اول:\n• BLACKboard\n• TOOTHbrush"
                ),
                PronunciationTip(
                    title = "Stress shift in word families",
                    content = "در خانواده‌های واژگانی، تأکید تغییر می‌کند:\n• PHOtograph\n• phoTOgrapher\n• photoGRAPHic"
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "English word formation",
                    content = "انگلیسی از طریق prefix, suffix, compounding و conversion واژه‌های جدید می‌سازد."
                ),
                CulturalNote(
                    title = "Loanwords",
                    content = "انگلیسی وام‌واژه‌های زیادی از زبان‌های دیگر دارد: French, Latin, Greek, Arabic."
                ),
                CulturalNote(
                    title = "New words",
                    content = "هر ساله کلمات جدید به انگلیسی اضافه می‌شوند: selfie, blog, podcast."
                ),
                CulturalNote(
                    title = "Vocabulary learning",
                    content = "یادگیری word families مؤثرتر از یادگیری کلمات جداگانه است."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Word Formation Processes",
                    content = """
فرایندهای اصلی:

1. Derivation (اشتقاق):
افزودن prefix/suffix:
• happy → unhappy, happiness
• act → action, actor, active

2. Compounding (ترکیب):
ترکیب دو کلمه:
• tooth + brush = toothbrush
• book + shelf = bookshelf
• well + known = well-known

3. Conversion (تبدیل):
تغییر کلاس کلمه بدون تغییر شکل:
• water (noun) → to water (verb)
• empty (adj) → to empty (verb)
• paper (noun) → to paper (verb)

4. Blending (آمیختگی):
ادغام دو کلمه:
• breakfast + lunch = brunch
• smoke + fog = smog
• motor + hotel = motel

5. Acronyms (سرواژه‌ها):
• NASA, UNESCO, AIDS

6. Abbreviations (اختصارات):
• Prof., etc., e.g., i.e.

7. Loanwords (وام‌واژه‌ها):
• sushi (Japanese), pizza (Italian), kebab (Arabic)
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Common Prefixes",
                    content = """
پیشوندهای رایج:

Negative:
• un-: unhappy, unfair
• in-: incorrect, invisible
• im- (before p, b, m): impossible, immature
• il- (before l): illegal, illogical
• ir- (before r): irregular, irresponsible
• dis-: disagree, dishonest
• non-: nonsense, non-stop

Degree/Size:
• super-: supernatural, superhero
• over-: overwork, overcook
• under-: underpay, underestimate
• mini-: miniskirt, minibus
• micro-: microscope, microchip

Time/Order:
• pre-: prehistoric, preview
• post-: postwar, postgraduate
• re-: rewrite, redo

Position:
• sub-: subway, subtitle
• inter-: international, interact
• trans-: transport, translate

Number:
• mono-: monotone, monopoly
• bi-: bicycle, bilingual
• tri-: triangle, tricycle
• multi-: multilingual, multimedia

Other:
• anti-: antiwar, antibiotic
• pro-: pro-war, pro-democracy
• co-: cooperate, co-worker
• ex-: ex-wife, ex-president
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Common Suffixes",
                    content = """
پسوندهای رایج:

Noun suffixes:
• -er/-or (person): teacher, actor
• -ist (person): artist, scientist
• -ness (quality): happiness, kindness
• -ity (quality): reality, ability
• -ment (action): development, government
• -tion/-sion (action): creation, decision
• -ance/-ence: performance, difference
• -ship: friendship, leadership
• -hood: childhood, neighborhood
• -dom: freedom, kingdom

Adjective suffixes:
• -ful: beautiful, helpful
• -less: careless, hopeless
• -able/-ible: comfortable, possible
• -ive: active, creative
• -ous: dangerous, famous
• -al: personal, natural
• -ic: economic, scientific
• -ish: childish, British
• -ly: friendly, daily

Verb suffixes:
• -ize/-ise: modernize, realize
• -ify: simplify, clarify
• -en: strengthen, widen

Adverb suffixes:
• -ly: quickly, carefully
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Word Families",
                    content = """
خانواده‌های واژگانی:

از فعل "act":
• act (verb/noun)
• action (noun)
• active (adjective)
• actively (adverb)
• activity (noun)
• actor/actress (noun)
• react (verb)
• reaction (noun)

از "produce":
• produce (verb)
• product (noun)
• production (noun)
• productive (adjective)
• productivity (noun)
• producer (noun)

از "decide":
• decide (verb)
• decision (noun)
• decisive (adjective)
• decisively (adverb)
• indecisive (adjective)

نکته: یادگیری خانواده‌های واژگانی مؤثرتر از یادگیری جداگانه است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Compounds",
                    content = """
کلمات مرکب:

Noun + Noun:
• toothbrush, bookshelf, football

Adjective + Noun:
• blackbird, whiteboard, greenhouse

Verb + Noun:
• breakfast (break + fast), pickpocket

Noun + Verb:
• sunrise, heartbeat

Adjective + Adjective:
• bittersweet, dark-blue

Preposition + Noun:
• underground, overhead

نکته: املای کلمات مرکب می‌تواند متفاوت باشد:
• یک کلمه: toothbrush
• با خط تیره: well-known
• جدا: bus stop
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Collocations",
                    content = """
هم‌نشینی‌های رایج:

Verb + Noun:
• make a decision
• take a break
• do homework
• have breakfast

Adjective + Noun:
• strong coffee (نه powerful coffee)
• heavy rain
• high temperature
• deep sleep

Adverb + Adjective:
• highly successful
• deeply concerned
• utterly ridiculous

Noun + Noun:
• traffic jam
• job market
• customer service

Verb + Preposition:
• depend on
• believe in
• listen to

نکته: collocations در یادگیری واژگان حیاتی هستند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Register and Vocabulary Choice",
                    content = """
انتخاب واژگان بر اساس لحن:

Formal vs Informal:
• commence / start
• terminate / end
• purchase / buy
• obtain / get
• reside / live
• inquire / ask
• assist / help
• sufficient / enough

Academic vocabulary:
• examine (نه look at)
• demonstrate (نه show)
• indicate (نه point to)
• constitute (نه make up)

نکته: در نوشتار آکادمیک، از واژگان رسمی استفاده کنید.

Technical vs common:
• cardiac / heart
• pulmonary / lung
• vehicle / car
• residence / home
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Strategies for Vocabulary Building",
                    content = """
راهکارهای گسترش واژگان:

1. Word families:
یادگیری تمام اشکال یک کلمه:
• decide, decision, decisive, decisively

2. Contextual learning:
یادگیری کلمات در جمله، نه جداگانه.

3. Spaced repetition:
مرور در فواصل زمانی.

4. Collocations:
یادگیری کلمات با هم:
• make a decision, not *do a decision

5. Word roots:
یادگیری ریشه‌های لاتین و یونانی:
• spec (look): inspect, respect, spectator

6. Reading widely:
خواندن انواع متون برای مواجهه با واژگان متنوع.

7. Using new words:
استفاده فعال از واژگان جدید در مکالمه و نوشتار.

8. Vocabulary notebooks:
داشتن دفترچه واژگان با مثال.

9. Flashcards:
کارت‌های فلش برای مرور سریع.

10. Dictionary practice:
استفاده از دیکشنری‌های تک‌زبانه برای یادگیری دقیق.

نکته: یادگیری فعال مؤثرتر از یادگیری غیرفعال است.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "impossible → inpossible",
                    correct = "impossible",
                    explanation = "پیشوند im- قبل از p, b, m."
                ),
                CommonMistake(
                    wrong = "illegal → inlegal",
                    correct = "illegal",
                    explanation = "پیشوند il- قبل از l."
                ),
                CommonMistake(
                    wrong = "irregular → inregular",
                    correct = "irregular",
                    explanation = "پیشوند ir- قبل از r."
                ),
                CommonMistake(
                    wrong = "do a decision",
                    correct = "make a decision",
                    explanation = "collocation صحیح: make a decision."
                ),
                CommonMistake(
                    wrong = "powerful coffee",
                    correct = "strong coffee",
                    explanation = "collocation صحیح: strong coffee."
                ),
                CommonMistake(
                    wrong = "I want to get a job.",
                    correct = "I want to obtain a job. (در متن رسمی)",
                    explanation = "در نوشتار رسمی از واژگان رسمی استفاده کنید."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Layla",
                    english = "I've been trying to expand my vocabulary systematically.",
                    persian = "سعی کرده‌ام واژگانم را به‌طور سیستماتیک گسترش دهم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "That's smart. How are you doing it?",
                    persian = "هوشمندانه‌ست. چطور انجامش می‌دی؟"
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "I've started learning word families instead of isolated words.",
                    persian = "شروع کرده‌ام خانواده‌های واژگانی یاد بگیرم به جای کلمات جداگانه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "That's a very effective method. Learning roots helps too.",
                    persian = "این روش بسیار مؤثریه. یادگیری ریشه‌ها هم کمک می‌کنه."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Yes! I've been studying Latin and Greek roots.",
                    persian = "بله! ریشه‌های لاتین و یونانی مطالعه کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Great. Have you noticed any patterns?",
                    persian = "عالی. الگویی متوجه شده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Definitely. Prefixes like un-, in-, dis- help with negatives.",
                    persian = "قطعاً. پیشوندهای un-، in-، dis- با منفی‌ها کمک می‌کنند."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "And suffixes reveal word class: -tion, -ment, -ness for nouns.",
                    persian = "و پسوندها کلاس کلمه را نشان می‌دهند: -tion، -ment، -ness برای اسم‌ها."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Exactly. I'm also learning collocations now.",
                    persian = "دقیقاً. الان collocationها هم یاد می‌گیرم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Smart. Collocations make you sound more natural.",
                    persian = "هوشمندانه. collocationها باعث می‌شن طبیعی‌تر به نظر برسی."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Yes, like 'make a decision' not 'do a decision'.",
                    persian = "بله، مثل «make a decision» نه «do a decision»."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Perfect example. How do you review?",
                    persian = "مثال عالی. چطور مرور می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Spaced repetition. It really works.",
                    persian = "مرور با فاصله. واقعاً جواب می‌ده."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Keep it up. Your English is improving noticeably.",
                    persian = "ادامه بده. انگلیسی‌ت به‌طور محسوسی بهتر می‌شه."
                ),
                DialogueLine(
                    speaker = "Layla",
                    english = "Thanks! I'm committed to continuous improvement.",
                    persian = "ممنون! متعهد به پیشرفت مستمر هستم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "That's the right attitude.",
                    persian = "این نگرش درستیه."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is Layla doing to expand her vocabulary?",
                    answer = "Learning word families instead of isolated words."
                ),
                ComprehensionQuestion(
                    question = "What roots has Layla been studying?",
                    answer = "Latin and Greek roots."
                ),
                ComprehensionQuestion(
                    question = "What do prefixes like un-, in-, dis- do?",
                    answer = "They form negatives."
                ),
                ComprehensionQuestion(
                    question = "What do suffixes reveal?",
                    answer = "Word class (noun, verb, adjective)."
                ),
                ComprehensionQuestion(
                    question = "What is Layla learning now?",
                    answer = "Collocations."
                ),
                ComprehensionQuestion(
                    question = "How does Layla review?",
                    answer = "Spaced repetition."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about how you learn new vocabulary.",
                    promptPersian = "درباره چگونگی یادگیری واژگان جدیدت صحبت کن.",
                    hints = "Use: I learn..., I use..., I review with..."
                ),
                SpeakingTask(
                    prompt = "Explain word formation processes with examples.",
                    promptPersian = "فرایندهای ساخت واژه را با مثال توضیح بده.",
                    hints = "Use: Derivation, compounding, conversion, blending, acronym"
                ),
                SpeakingTask(
                    prompt = "Discuss the importance of collocations.",
                    promptPersian = "درباره اهمیت collocationها صحبت کن.",
                    hints = "Use: make a decision, strong coffee, heavy rain"
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a vocabulary journal entry (about 250 words) about a word you've recently learned. Include its family, prefixes, suffixes, collocations, and usage examples.",
                    promptPersian = "یه یادداشت واژگانی بنویس (حدود ۲۵۰ کلمه) درباره یه کلمه که اخیراً یاد گرفته‌ای. شامل خانواده‌اش، پیشوندها، پسوندها، collocationها و مثال‌های استفاده.",
                    wordCount = 250,
                    hints = "Include:\n1. The word and its meaning\n2. Word family\n3. Prefixes/suffixes\n4. Common collocations\n5. Example sentences"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Which is the correct negative form?",
                    options = listOf("inpossible", "impossible", "unpossible", "dispossible"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'ir-' prefix go before?",
                    options = listOf("p, b, m", "l", "r", "n"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "What's the correct collocation?",
                    options = listOf("do a decision", "make a decision", "take a decision", "have a decision"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is a word family of 'act'?",
                    options = listOf("actor, action, active", "actment, acting, actic", "action, active, actal", "actor, actful, actness"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What is 'toothbrush'?",
                    options = listOf("Derivation", "Compound", "Blend", "Acronym"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What is 'brunch'?",
                    options = listOf("Compound", "Blend", "Acronym", "Loanword"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which is a formal alternative for 'get'?",
                    options = listOf("grab", "obtain", "grasp", "pick"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What's the correct collocation?",
                    options = listOf("powerful coffee", "strong coffee", "heavy coffee", "big coffee"),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 11 — Style and Rhetoric
    // ============================================================
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Style and Rhetoric",
            titlePersian = "سبک و بلاغت",
            objectives = listOf(
                "Develop a sophisticated writing style.",
                "Use rhetorical devices effectively.",
                "Master figurative language.",
                "Apply rhythm and sound devices.",
                "Adapt style to audience and purpose."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "style",
                    persian = "سبک",
                    pronunciation = "/staɪl/",
                    partOfSpeech = "noun",
                    example = "Every writer has a unique style.",
                    examplePersian = "هر نویسنده سبک منحصربه‌فردی داره.",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "rhetoric",
                    persian = "بلاغت",
                    pronunciation = "/ˈretərɪk/",
                    partOfSpeech = "noun",
                    example = "Rhetoric persuades and moves.",
                    examplePersian = "بلاغت متقاعد می‌کند و برمی‌انگیزد.",
                    wordFamily = "rhetorical",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "metaphor",
                    persian = "استعاره",
                    pronunciation = "/ˈmetəfɔːr/",
                    partOfSpeech = "noun",
                    example = "Time is money is a metaphor.",
                    examplePersian = "زمان پول است یه استعاره‌ست.",
                    usageTip = "در آرایه‌های ادبی."
                ),
                VocabWord(
                    english = "simile",
                    persian = "تشبیه",
                    pronunciation = "/ˈsɪməli/",
                    partOfSpeech = "noun",
                    example = "Brave as a lion is a simile.",
                    examplePersian = "شجاع مثل شیر یه تشبیهه.",
                    usageTip = "در آرایه‌های ادبی."
                ),
                VocabWord(
                    english = "irony",
                    persian = "طنز، وارونگی",
                    pronunciation = "/ˈaɪrəni/",
                    partOfSpeech = "noun",
                    example = "The irony is striking.",
                    examplePersian = "طنز قابل توجهه.",
                    wordFamily = "ironic, ironically",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "hyperbole",
                    persian = "اغراق",
                    pronunciation = "/haɪˈpɜːrbəli/",
                    partOfSpeech = "noun",
                    example = "I've told you a million times is hyperbole.",
                    examplePersian = "میلیون بار گفتم یه اغراقه.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "alliteration",
                    persian = "تجنیس، تکرار صامت",
                    pronunciation = "/əˌlɪtəˈreɪʃən/",
                    partOfSpeech = "noun",
                    example = "Peter picked a pepper.",
                    examplePersian = "پیتر فلفلی چید.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "anaphora",
                    persian = "تکرار آغازین",
                    pronunciation = "/əˈnæfərə/",
                    partOfSpeech = "noun",
                    example = "I came, I saw, I conquered — anaphora.",
                    examplePersian = "آمدم، دیدم، پیروز شدم — تکرار آغازین.",
                    usageTip = "در بلاغت."
                ),
                VocabWord(
                    english = "antithesis",
                    persian = "تقابل",
                    pronunciation = "/ænˈtɪθəsɪs/",
                    partOfSpeech = "noun",
                    example = "It was the best of times, it was the worst of times.",
                    examplePersian = "بهترین زمان‌ها بود، بدترین زمان‌ها بود.",
                    usageTip = "در بلاغت."
                ),
                VocabWord(
                    english = "tricolon",
                    persian = "سه‌گانه",
                    pronunciation = "/ˈtraɪkəlɑːn/",
                    partOfSpeech = "noun",
                    example = "Veni, vidi, vici is a tricolon.",
                    examplePersian = "آمدم، دیدم، پیروز شدم یه سه‌گانه‌ست.",
                    usageTip = "در بلاغت."
                ),
                VocabWord(
                    english = "tone",
                    persian = "لحن",
                    pronunciation = "/toʊn/",
                    partOfSpeech = "noun",
                    example = "The tone is formal and serious.",
                    examplePersian = "لحن رسمی و جدیه.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "voice",
                    persian = "صدای نویسنده",
                    pronunciation = "/vɔɪs/",
                    partOfSpeech = "noun",
                    example = "The author's voice is distinctive.",
                    examplePersian = "صدای نویسنده متمایزه.",
                    usageTip = "در سبک."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "to put it mildly",
                    persian = "با کمی تسامح",
                    example = "To put it mildly, he was upset.",
                    examplePersian = "با کمی تسامح، ناراحت بود.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "in a manner of speaking",
                    persian = "به نوعی",
                    example = "In a manner of speaking, we succeeded.",
                    examplePersian = "به نوعی، موفق شدیم.",
                    register = "formal"
                ),
                IdiomExpression(
                    english = "so to speak",
                    persian = "به اصطلاح",
                    example = "He was, so to speak, the backbone of the team.",
                    examplePersian = "او به اصطلاح ستون فقرات تیم بود.",
                    register = "neutral"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "set the tone",
                    meaning = "to establish the mood",
                    persian = "تعیین لحن",
                    example = "The opening paragraph sets the tone.",
                    examplePersian = "پاراگراف اول لحن را تعیین می‌کند."
                ),
                PhrasalVerb(
                    verb = "play on",
                    meaning = "to exploit for effect",
                    persian = "بازی کردن با",
                    example = "The writer plays on the reader's emotions.",
                    examplePersian = "نویسنده با احساسات خواننده بازی می‌کند."
                ),
                PhrasalVerb(
                    verb = "draw on",
                    meaning = "to use as a resource",
                    persian = "استفاده کردن از",
                    example = "She draws on personal experience.",
                    examplePersian = "او از تجربه شخصی استفاده می‌کند."
                ),
                PhrasalVerb(
                    verb = "build up",
                    meaning = "to increase gradually",
                    persian = "به تدریج ساختن",
                    example = "The writer builds up tension.",
                    examplePersian = "نویسنده تنش را به تدریج می‌سازد."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Rhetorical stress",
                    content = "در ساختارهای بلاغی، کلمات کلیدی تأکید می‌گیرند:\n• I came, I SAW, I CONQUERED."
                ),
                PronunciationTip(
                    title = "Pause in tricolon",
                    content = "در سه‌گانه‌ها، مکث کوتاه بین بخش‌ها:\n• Veni, | vidi, | vici."
                ),
                PronunciationTip(
                    title = "Antithesis stress",
                    content = "در تقابل، هر دو بخش تأکید می‌گیرند:\n• It was the BEST of times, it was the WORST of times."
                ),
                PronunciationTip(
                    title = "Anaphora rhythm",
                    content = "در تکرار آغازین، الگوی ریتمیک واضح."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Western rhetorical tradition",
                    content = "سنت بلاغت غربی از ارسطو تا امروز بر سه پایه استوار است: ethos, pathos, logos."
                ),
                CulturalNote(
                    title = "Style varies by genre",
                    content = "سبک در ادبیات، روزنامه‌نگاری، و نوشتار آکادمیک متفاوت است."
                ),
                CulturalNote(
                    title = "Audience awareness",
                    content = "در فرهنگ انگلیسی‌زبان، تطبیق سبک با مخاطب مهم است."
                ),
                CulturalNote(
                    title = "Rhetorical devices",
                    content = "آرایه‌های بلاغی بخش مهمی از آموزش زبان انگلیسی هستند."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Elements of Style",
                    content = """
عناصر سبک:

Diction (انتخاب واژگان):
• Formal vs Informal
• Concrete vs Abstract
• Simple vs Complex

Sentence structure:
• Short vs Long
• Simple vs Complex
• Variety vs Uniformity

Tone (لحن):
• Serious, humorous, ironic, sarcastic
• Objective vs Subjective

Voice (صدای نویسنده):
• Active vs Passive
• First person vs Third person
• Personal vs Impersonal

Figurative language:
• Metaphor, simile, personification
• Hyperbole, understatement

نکته: سبک = انتخاب‌های آگاهانه نویسنده.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Metaphor and Simile",
                    content = """
Metaphor: مقایسه ضمنی بدون like/as
• Time is money.
• Life is a journey.
• The world is a stage.

Extended metaphor:
• تمام متن بر اساس یک استعاره گسترده.

Simile: مقایسه صریح با like/as
• Brave as a lion.
• Runs like the wind.
• Quiet as a mouse.

Personification: دادن ویژگی‌های انسانی به اشیا
• The wind whispered.
• The sun smiled.
• Opportunity knocked.

Metonymy: جایگزینی نام
• The White House announced... (= رئیس‌جمهور)
• The pen is mightier than the sword.

Synecdoche: جزء به جای کل
• All hands on deck. (hands = sailors)

نکته: این آرایه‌ها معنی را عمیق‌تر و تصویری‌تر می‌کنند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Repetition and Rhythm",
                    content = """
Anaphora (تکرار در ابتدا):
• I have a dream... I have a dream...
• We shall fight... we shall fight...

Epistrophe (تکرار در انتها):
• Government of the people, by the people, for the people.

Anadiplosis (تکرار انتهای جمله در ابتدای بعدی):
• Fear leads to anger. Anger leads to hate. Hate leads to suffering.

Tricolon (سه‌گانه):
• Veni, vidi, vici.
• Blood, sweat, and tears.

Antithesis (تقابل):
• It was the best of times, it was the worst of times.
• Ask not what your country can do for you — ask what you can do for your country.

Alliteration (تکرار صامت):
• Peter picked a pepper.
• Sally sells seashells.

Assonance (تکرار مصوت):
• The rain in Spain stays mainly in the plain.

نکته: تکرار و ریتم به متن قدرت و جذابیت می‌دهند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Irony and Sarcasm",
                    content = """
Irony: تفاوت بین ظاهر و واقعیت

Verbal irony: گفتن چیزی متفاوت از معنی
• "What lovely weather!" (در طوفان)

Dramatic irony: خواننده/تماشاگر بیشتر از شخصیت‌ها می‌داند.

Situational irony: تفاوت بین انتظار و واقعیت
• آتشفشان‌شناس در تصادف می‌میرد.

Sarcasm: تمسخر تلخ
• "Oh great, another meeting." (با لحن منفی)

Understatement: کوچک‌نمایی عمدی
• "It's just a scratch" (وقتی صدمه جدی است)

Hyperbole: اغراق
• "I've told you a million times."
• "This bag weighs a ton."

نکته: استفاده از این آرایه‌ها به لحن و مخاطب بستگی دارد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Parallelism in Rhetoric",
                    content = """
Parallel structures در بلاغت:

Parallelism در جملات:
• I came, I saw, I conquered.
• Ask not what your country can do for you; ask what you can do for your country.

Parallelism در لیست‌ها:
• Government of the people, by the people, for the people.

Parallelism در تقابل:
• Not that I loved Caesar less, but that I loved Rome more.

Antithesis با parallelism:
• To err is human, to forgive divine.

نکته: parallelism موسیقی و قدرت به متن می‌دهد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Rhetorical Questions",
                    content = """
سؤالات بلاغی:

تعریف: سؤالی که پاسخ نمی‌خواهد، بلکه برای تأکید پرسیده می‌شود.

مثال‌ها:
• Who knows?
• What's in a name?
• Can we truly say we're free?
• Isn't it obvious?

کاربردها:
• جلب توجه
• تأکید روی یک نکته
• آماده‌سازی برای پاسخ
• ایجاد تعامل با خواننده

Hypophora: سؤال + پاسخ فوری
• What is the greatest challenge? It is complacency.

نکته: rhetorical questions در سخنرانی‌ها و تبلیغات رایجند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Formal and Informal Style",
                    content = """
Formal style:
• Academic writing
• Professional reports
• Official documents

ویژگی‌ها:
• پیچیدگی واژگانی
• جملات پیچیده
• غیرشخصی
• استفاده از passive
• پرهیز از contractions
• استفاده از hedging

Informal style:
• Personal letters
• Blog posts
• Conversations

ویژگی‌ها:
• واژگان روزمره
• جملات کوتاه
• شخصی
• استفاده از active
• contractions
• عبارات غیررسمی

مثال:
Formal: The findings indicate a significant correlation.
Informal: The results show they're connected.

نکته: تطبیق سبک با موقعیت ضروری است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Style Adaptation",
                    content = """
تطبیق سبک با:

1. Audience (مخاطب):
• متخصص vs عمومی
• بزرگسال vs کودک
• رسمی vs دوستانه

2. Purpose (هدف):
• اطلاع‌رسانی
• متقاعدسازی
• سرگرمی
• آموزش

3. Genre (ژانر):
• Academic paper
• News article
• Personal essay
• Business report
• Novel

4. Context (زمینه):
• محیط رسمی
• محیط غیررسمی
• محیط حرفه‌ای

مثال:
Academic: The data suggest a correlation between X and Y.
Journalistic: New research shows X and Y are linked.
Blog: So it turns out X and Y go together. Who knew?

نکته: تطبیق سبک = احترام به مخاطب.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "Using informal style in academic writing",
                    correct = "Match formal style with academic context",
                    explanation = "سبک باید با موقعیت تطبیق داده شود."
                ),
                CommonMistake(
                    wrong = "Overusing metaphors",
                    correct = "Use figurative language sparingly",
                    explanation = "استفاده بیش از حد از استعاره، متن را مصنوعی می‌کند."
                ),
                CommonMistake(
                    wrong = "Mixing formal and informal registers",
                    correct = "Maintain consistent register",
                    explanation = "لحن باید در کل متن یکسان باشد."
                ),
                CommonMistake(
                    wrong = "Clichéd metaphors",
                    correct = "Use fresh, original figurative language",
                    explanation = "استعاره‌های کلیشه‌ای اثر خود را از دست داده‌اند."
                ),
                CommonMistake(
                    wrong = "Rhetorical questions in inappropriate contexts",
                    correct = "Use rhetorical devices appropriately",
                    explanation = "آرایه‌ها باید با متن همخوانی داشته باشند."
                ),
                CommonMistake(
                    wrong = "Failing to match style to audience",
                    correct = "Adapt style to audience",
                    explanation = "سبک باید با سطح و علاقه مخاطب هماهنگ باشد."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "I've been studying rhetorical devices for my essay.",
                    persian = "برای مقاله‌ام آرایه‌های بلاغی مطالعه کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Which ones have you found most useful?",
                    persian = "کدوم‌ها برات مفیدتر بوده‌اند؟"
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Parallelism and antithesis. They add power to arguments.",
                    persian = "parallelism و antithesis. به استدلال‌ها قدرت اضافه می‌کنند."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I agree. I've been using anaphora and tricolon in my speeches.",
                    persian = "موافقم. در سخنرانی‌هام از anaphora و tricolon استفاده کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Excellent choices. Repetition can be very effective.",
                    persian = "انتخاب‌های عالی. تکرار می‌تونه خیلی مؤثر باشه."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "What about figurative language?",
                    persian = "زبان مجازی چطور؟"
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "I use metaphors and similes sparingly. They're powerful but easy to overuse.",
                    persian = "از استعاره و تشبیه کم استفاده می‌کنم. قدرتمندن ولی به‌راحتی زیاد استفاده می‌شن."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "True. Balance is key.",
                    persian = "درسته. تعادل کلیدیه."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "I also try to adapt my style to the audience.",
                    persian = "همچنین سعی می‌کنم سبکم را با مخاطب تطبیق دهم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "That's crucial. What about tone?",
                    persian = "این حیاتیه. لحن چطور؟"
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "I keep it consistent. Mixing tones confuses the reader.",
                    persian = "یکنواخت نگه می‌دارم. مخلوط کردن لحن‌ها خواننده را گیج می‌کند."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Definitely. I once made that mistake.",
                    persian = "قطعاً. یه بار این اشتباه را مرتکب شدم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "We learn from our errors.",
                    persian = "از اشتباهاتمان یاد می‌گیریم."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "True. Let's keep refining our craft.",
                    persian = "درسته. بیا به اصلاح هنرمون ادامه بدیم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Perfect. Writing is a lifelong practice.",
                    persian = "عالی. نوشتن یه تمرین مادام‌العمره."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Which rhetorical devices has Dr. Layla found useful?",
                    answer = "Parallelism and antithesis."
                ),
                ComprehensionQuestion(
                    question = "Which devices has Reza used?",
                    answer = "Anaphora and tricolon."
                ),
                ComprehensionQuestion(
                    question = "How does Dr. Layla use figurative language?",
                    answer = "Sparingly, as it's easy to overuse."
                ),
                ComprehensionQuestion(
                    question = "What does Dr. Layla try to adapt?",
                    answer = "Her style to the audience."
                ),
                ComprehensionQuestion(
                    question = "Why should tone be consistent?",
                    answer = "Mixing tones confuses the reader."
                ),
                ComprehensionQuestion(
                    question = "What is writing according to Dr. Layla?",
                    answer = "A lifelong practice."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Analyze a famous speech for rhetorical devices.",
                    promptPersian = "یه سخنرانی معروف را برای آرایه‌های بلاغی تحلیل کن.",
                    hints = "Identify: anaphora, tricolon, antithesis, metaphor"
                ),
                SpeakingTask(
                    prompt = "Use figurative language to describe a scene.",
                    promptPersian = "با زبان مجازی یه صحنه را توصیف کن.",
                    hints = "Use: metaphor, simile, personification"
                ),
                SpeakingTask(
                    prompt = "Adapt the same message for different audiences.",
                    promptPersian = "همون پیام را برای مخاطبان مختلف تطبیق بده.",
                    hints = "Formal for academics, informal for friends"
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a persuasive essay (about 300 words) on a topic of your choice. Use at least four different rhetorical devices.",
                    promptPersian = "یه مقاله متقاعدکننده بنویس (حدود ۳۰۰ کلمه) درباره موضوعی به انتخاب خودت. حداقل چهار آرایه بلاغی مختلف استفاده کن.",
                    wordCount = 300,
                    hints = "Use:\n1. Parallelism\n2. Antithesis\n3. Rhetorical questions\n4. Figurative language"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "What is 'Time is money'?",
                    options = listOf("Simile", "Metaphor", "Personification", "Hyperbole"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What is 'brave as a lion'?",
                    options = listOf("Metaphor", "Simile", "Hyperbole", "Irony"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What is 'I came, I saw, I conquered'?",
                    options = listOf("Anaphora", "Tricolon", "Antithesis", "Simile"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What is 'the wind whispered'?",
                    options = listOf("Metaphor", "Simile", "Personification", "Hyperbole"),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "What is 'I've told you a million times'?",
                    options = listOf("Irony", "Hyperbole", "Understatement", "Metaphor"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What's the difference between metaphor and simile?",
                    options = listOf(
                        "No difference",
                        "Simile uses like/as; metaphor doesn't",
                        "Metaphor uses like/as; simile doesn't",
                        "Simile is longer"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What is a rhetorical question?",
                    options = listOf(
                        "سؤال واقعی",
                        "سؤالی که پاسخ نمی‌خواهد",
                        "سؤال کوتاه",
                        "سؤال شخصی"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'antithesis' mean?",
                    options = listOf(
                        "تکرار",
                        "تقابل",
                        "استعاره",
                        "اغراق"
                    ),
                    correctIndex = 1
                )
            )
        )
    }

    // ============================================================
    // CHAPTER 12 — Integration and Mastery
    // ============================================================
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Integration and Mastery",
            titlePersian = "یکپارچه‌سازی و تسلط",
            objectives = listOf(
                "Integrate all advanced grammar structures.",
                "Apply sophisticated syntax in context.",
                "Master style and register choices.",
                "Demonstrate comprehensive proficiency.",
                "Prepare for native-level communication."
            ),
            vocabulary = listOf(
                VocabWord(
                    english = "integration",
                    persian = "یکپارچه‌سازی",
                    pronunciation = "/ˌɪntɪˈɡreɪʃən/",
                    partOfSpeech = "noun",
                    example = "Integration of skills is key.",
                    examplePersian = "یکپارچه‌سازی مهارت‌ها کلیدیه.",
                    wordFamily = "integrate, integrated",
                    usageTip = "در یادگیری."
                ),
                VocabWord(
                    english = "mastery",
                    persian = "تسلط",
                    pronunciation = "/ˈmæstəri/",
                    partOfSpeech = "noun",
                    example = "Mastery takes time and practice.",
                    examplePersian = "تسلط زمان و تمرین می‌بره.",
                    wordFamily = "master, masterful",
                    usageTip = "در یادگیری."
                ),
                VocabWord(
                    english = "proficiency",
                    persian = "مهارت",
                    pronunciation = "/prəˈfɪʃənsi/",
                    partOfSpeech = "noun",
                    example = "Advanced proficiency requires effort.",
                    examplePersian = "مهارت پیشرفته نیازمند تلاشه.",
                    wordFamily = "proficient, proficiently",
                    usageTip = "در ارزیابی زبان."
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
                    english = "accuracy",
                    persian = "دقت",
                    pronunciation = "/ˈækjərəsi/",
                    partOfSpeech = "noun",
                    example = "Accuracy is essential.",
                    examplePersian = "دقت ضروریه.",
                    wordFamily = "accurate, accurately",
                    usageTip = "در زبان."
                ),
                VocabWord(
                    english = "sophistication",
                    persian = "پیچیدگی، پیشرفتگی",
                    pronunciation = "/səˌfɪstɪˈkeɪʃən/",
                    partOfSpeech = "noun",
                    example = "Sophistication comes with practice.",
                    examplePersian = "پیشرفتگی با تمرین می‌آید.",
                    wordFamily = "sophisticated",
                    usageTip = "در زبان پیشرفته."
                ),
                VocabWord(
                    english = "nuance",
                    persian = "ظرافت",
                    pronunciation = "/ˈnuːɑːns/",
                    partOfSpeech = "noun",
                    example = "Understanding nuance is essential.",
                    examplePersian = "درک ظرافت ضروریه.",
                    usageTip = "در زبان پیشرفته."
                ),
                VocabWord(
                    english = "register",
                    persian = "لحن",
                    pronunciation = "/ˈredʒɪstər/",
                    partOfSpeech = "noun",
                    example = "Register awareness is advanced.",
                    examplePersian = "آگاهی از لحن پیشرفته‌ست.",
                    usageTip = "در سبک."
                ),
                VocabWord(
                    english = "rhetoric",
                    persian = "بلاغت",
                    pronunciation = "/ˈretərɪk/",
                    partOfSpeech = "noun",
                    example = "Rhetoric enhances persuasion.",
                    examplePersian = "بلاغت متقاعدسازی را تقویت می‌کند.",
                    wordFamily = "rhetorical",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "cohesion",
                    persian = "انسجام",
                    pronunciation = "/koʊˈhiːʒən/",
                    partOfSpeech = "noun",
                    example = "Cohesion is essential in advanced writing.",
                    examplePersian = "انسجام در نوشتار پیشرفته ضروریه.",
                    wordFamily = "cohesive, cohesively",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "coherence",
                    persian = "هم‌بستگی معنایی",
                    pronunciation = "/koʊˈhɪrəns/",
                    partOfSpeech = "noun",
                    example = "Coherence makes text meaningful.",
                    examplePersian = "هم‌بستگی معنایی متن را معنادار می‌کند.",
                    wordFamily = "coherent, coherently",
                    usageTip = "در نوشتار."
                ),
                VocabWord(
                    english = "precision",
                    persian = "دقت",
                    pronunciation = "/prɪˈsɪʒən/",
                    partOfSpeech = "noun",
                    example = "Precision distinguishes advanced writing.",
                    examplePersian = "دقت نوشتار پیشرفته را متمایز می‌کند.",
                    wordFamily = "precise, precisely",
                    usageTip = "در نوشتار."
                )
            ),
            idioms = listOf(
                IdiomExpression(
                    english = "the whole nine yards",
                    persian = "همه چیز، تمام جزئیات",
                    example = "She did the whole nine yards.",
                    examplePersian = "او همه کارها را انجام داد.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "par for the course",
                    persian = "طبق انتظار",
                    example = "That's par for the course.",
                    examplePersian = "این طبق انتظاره.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "the ins and outs",
                    persian = "جزئیات کامل",
                    example = "I know the ins and outs.",
                    examplePersian = "جزئیات کامل را می‌دانم.",
                    register = "informal"
                )
            ),
            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "pull together",
                    meaning = "to combine",
                    persian = "ترکیب کردن",
                    example = "Pull all your skills together.",
                    examplePersian = "همه مهارت‌هات را ترکیب کن."
                ),
                PhrasalVerb(
                    verb = "build on",
                    meaning = "to develop from",
                    persian = "ساختن بر اساس",
                    example = "Build on your strengths.",
                    examplePersian = "بر اساس نقاط قوتت بساز."
                ),
                PhrasalVerb(
                    verb = "refine",
                    meaning = "to improve",
                    persian = "بهبود دادن",
                    example = "Refine your writing skills.",
                    examplePersian = "مهارت‌های نوشتاری‌ات را بهبود بده."
                ),
                PhrasalVerb(
                    verb = "hone",
                    meaning = "to sharpen",
                    persian = "تیز کردن",
                    example = "Hone your communication skills.",
                    examplePersian = "مهارت‌های ارتباطی‌ات را تیز کن."
                )
            ),
            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Integrated stress patterns",
                    content = "در جملات پیچیده، تعادل استرس:\n• Although the situation was difficult, we managed to succeed."
                ),
                PronunciationTip(
                    title = "Natural rhythm",
                    content = "در گفتار پیشرفته، ریتم طبیعی و روان."
                ),
                PronunciationTip(
                    title = "Register awareness",
                    content = "لحن در گفتار رسمی و غیررسمی متفاوت."
                ),
                PronunciationTip(
                    title = "Precision in pronunciation",
                    content = "دقت در تلفظ کلمات پیچیده."
                )
            ),
            culturalNotes = listOf(
                CulturalNote(
                    title = "Lifelong learning",
                    content = "در فرهنگ‌های انگلیسی‌زبان، یادگیری زبان یک فرایند مادام‌العمر است."
                ),
                CulturalNote(
                    title = "Native-like proficiency",
                    content = "تسلط در سطح نیتیو نیازمند سال‌ها تمرین و مواجهه است."
                ),
                CulturalNote(
                    title = "Cultural fluency",
                    content = "تسلط زبانی شامل درک فرهنگی هم هست."
                ),
                CulturalNote(
                    title = "Continuous improvement",
                    content = "بهبود مستمر، هدف نهایی یادگیری زبان است."
                )
            ),
            grammar = listOf(
                GrammarSection(
                    title = "1. Tense and Aspect Review",
                    content = """
جدول جامع ۱۲ ترکیب:

| Tense | Aspect | Example |
|-------|--------|---------|
| Present | Simple | I work |
| Present | Progressive | I am working |
| Present | Perfect | I have worked |
| Present | Perfect Progressive | I have been working |
| Past | Simple | I worked |
| Past | Progressive | I was working |
| Past | Perfect | I had worked |
| Past | Perfect Progressive | I had been working |
| Future | Simple | I will work |
| Future | Progressive | I will be working |
| Future | Perfect | I will have worked |
| Future | Perfect Progressive | I will have been working |

نکته: انتخاب ترکیب مناسب به context بستگی دارد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "2. Modal and Modality Review",
                    content = """
جدول جامع modals:

| Modal | Present | Past | Perfect |
|-------|---------|------|---------|
| can | can | could | could have |
| may | may | might | might have |
| must | must | had to | must have |
| should | should | should have | — |
| will | will | would | would have |
| shall | shall | should | — |

Degrees of certainty:
• Strong: must, will, can't
• Medium: should, ought to
• Weak: may, might, could

Obligation:
• Strong: must, have to
• Medium: should, ought to
• None: don't have to, needn't
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "3. Conditionals Review",
                    content = """
جدول جامع:

| Type | If-clause | Main clause |
|------|-----------|-------------|
| Zero | If + present | present |
| First | If + present | will + verb |
| Second | If + past | would + verb |
| Third | If + past perfect | would have + pp |
| Mixed A | If + past perfect | would + verb |
| Mixed B | If + past | would have + pp |
| Inverted 1 | Should + subj | ... |
| Inverted 2 | Were + subj | ... |
| Inverted 3 | Had + subj | ... |

نکته: انتخاب نوع شرطی به واقعیت موقعیت بستگی دارد.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "4. Passive and Reported Speech Review",
                    content = """
Passive in all tenses:
• Present: is made
• Past: was made
• Present Perfect: has been made
• Past Perfect: had been made
• Future: will be made
• Modals: must be made

Causative:
• have/get + object + pp
• I had my hair cut.

Reported Speech:
• Tense shift (backshift)
• Pronoun changes
• Time/Place changes

Impersonal passive:
• It is said that...
• He is said to be...

نکته: این ساختارها در نوشتار رسمی رایجند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "5. Advanced Syntax Review",
                    content = """
Cleft sentences:
• It was X that...
• What I need is...

Inversion:
• Never have I...
• Only then did I...

Subjunctive:
• I suggest that he go.
• It's essential that she be here.

Non-finite clauses:
• Walking home, I saw...
• Having finished, she left...

Parallelism:
• I came, I saw, I conquered.

Fronting:
• This book, I enjoyed.

نکته: تنوع ساختاری نوشتار را غنی می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "6. Style and Register Review",
                    content = """
Formal vs Informal:

Formal:
• Complex syntax
• Academic vocabulary
• Passive voice
• No contractions
• Impersonal tone
• Hedging

Informal:
• Simple syntax
• Everyday vocabulary
• Active voice
• Contractions
• Personal tone
• Direct statements

مثال:
Formal: It is recommended that the proposal be reconsidered.
Informal: I think we should look at this again.

نکته: تطبیق سبک با موقعیت ضروری است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "7. Cohesion and Coherence Review",
                    content = """
Cohesion devices:
• Reference: pronouns, demonstratives
• Substitution: one, do, so
• Ellipsis: omitting words
• Conjunction: and, but, because
• Lexical cohesion: repetition, synonyms

Coherence:
• Logical flow
• Consistent theme
• Clear structure
• Relevant content

Discourse markers:
• Addition: moreover, furthermore
• Contrast: however, nevertheless
• Result: therefore, consequently
• Sequence: first, then, finally

نکته: cohesion + coherence = متن مؤثر.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "8. Mastery Checklist",
                    content = """
چک‌لیست تسلط:

□ استفاده دقیق از ۱۲ زمان-وجه
□ کاربرد مناسب modals در همه سطوح
□ تسلط بر همه انواع شرطی
□ passive و causative روان
□ reported speech پیشرفته
□ relative clauses پیچیده
□ gerund و infinitive
□ subjunctive و unreal past
□ cleft sentences و inversion
□ non-finite clauses
□ parallelism
□ cohesion و coherence
□ discourse markers
□ formal register
□ hedging و boosting
□ rhetorical devices
□ word formation
□ collocations
□ سبک انعطاف‌پذیر

نکته: تسلط = ترکیب همه این عناصر به‌طور طبیعی.
                    """.trimIndent()
                )
            ),
            commonMistakes = listOf(
                CommonMistake(
                    wrong = "Using advanced structures incorrectly",
                    correct = "Master basics before advancing",
                    explanation = "ساختارهای پیشرفته نیاز به تسلط بر پایه دارند."
                ),
                CommonMistake(
                    wrong = "Overusing complex syntax",
                    correct = "Balance complexity with clarity",
                    explanation = "تعادل بین پیچیدگی و وضوح."
                ),
                CommonMistake(
                    wrong = "Ignoring register",
                    correct = "Match register to context",
                    explanation = "تطبیق لحن با موقعیت."
                ),
                CommonMistake(
                    wrong = "Sacrificing clarity for style",
                    correct = "Clarity first, style second",
                    explanation = "وضوح مهم‌تر از سبک است."
                ),
                CommonMistake(
                    wrong = "Not reading widely",
                    correct = "Read diverse texts",
                    explanation = "خواندن گسترده به تسلط کمک می‌کند."
                ),
                CommonMistake(
                    wrong = "Stopping practice",
                    correct = "Continuous practice is essential",
                    explanation = "تسلط نیازمند تمرین مستمر است."
                )
            ),
            conversation = listOf(
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "You've made remarkable progress in English.",
                    persian = "پیشرفت قابل توجهی در انگلیسی داشته‌ای."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Thank you. It's been a long journey.",
                    persian = "ممنون. سفر طولانی‌ای بوده."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "What do you consider your greatest achievement?",
                    persian = "بزرگ‌ترین دستاوردت را چه می‌دانی؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I think mastering the subjunctive and inversion has been the biggest leap.",
                    persian = "فکر می‌کنم تسلط بر subjunctive و inversion بزرگ‌ترین جهش بوده."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Those are challenging structures. What helped you most?",
                    persian = "این‌ها ساختارهای چالش‌برانگیزی هستند. چی بیشتر کمک کرد؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Reading extensively and writing regularly. Practice makes perfect.",
                    persian = "خواندن گسترده و نوشتن منظم. کار نیکو کردن از پر کردن است."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "Absolutely. Have you noticed improvements in fluency?",
                    persian = "قطعاً. بهبودی در روانی متوجه شده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Yes, considerably. I can now express nuances I couldn't before.",
                    persian = "بله، به‌طور قابل توجهی. الان می‌تونم ظرافت‌هایی که قبلاً نمی‌تونستم بیان کنم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "That's the mark of advanced proficiency.",
                    persian = "این نشانه مهارت پیشرفته‌ست."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I still have much to learn, though.",
                    persian = "البته هنوز چیزهای زیادی برای یادگیری دارم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "That humility will serve you well.",
                    persian = "این فروتنی به کارت میاد."
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "Thank you. If I hadn't been consistent, I wouldn't be here now.",
                    persian = "ممنون. اگه پیوسته نبودم، الان اینجا نبودم."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "True. What's your next goal?",
                    persian = "درسته. هدف بعدی‌ت چیه؟"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "To achieve native-like fluency and possibly teach English someday.",
                    persian = "دستیابی به روانی در سطح نیتیو و احتمالاً تدریس انگلیسی در آینده."
                ),
                DialogueLine(
                    speaker = "Dr. Layla",
                    english = "A noble goal. Keep at it!",
                    persian = "هدف شریفی. ادامه بده!"
                ),
                DialogueLine(
                    speaker = "Reza",
                    english = "I will. Thank you for all your guidance.",
                    persian = "ادامه می‌دم. ممنون از همه راهنمایی‌هات."
                )
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What does Reza consider his greatest achievement?",
                    answer = "Mastering the subjunctive and inversion."
                ),
                ComprehensionQuestion(
                    question = "What has helped Reza most?",
                    answer = "Reading extensively and writing regularly."
                ),
                ComprehensionQuestion(
                    question = "What improvements has Reza noticed?",
                    answer = "He can now express nuances he couldn't before."
                ),
                ComprehensionQuestion(
                    question = "What quality does Dr. Layla admire in Reza?",
                    answer = "His humility."
                ),
                ComprehensionQuestion(
                    question = "What's Reza's next goal?",
                    answer = "To achieve native-like fluency and possibly teach English."
                ),
                ComprehensionQuestion(
                    question = "What does Reza say about consistency?",
                    answer = "If he hadn't been consistent, he wouldn't be where he is now."
                )
            ),
            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Reflect on your English learning journey using advanced structures.",
                    promptPersian = "به مسیر یادگیری انگلیسی‌ات با ساختارهای پیشرفته بازنگری کن.",
                    hints = "Use: inversion, subjunctive, perfect tenses, conditionals"
                ),
                SpeakingTask(
                    prompt = "Give advice to intermediate learners.",
                    promptPersian = "به زبان‌آموزان متوسط توصیه کن.",
                    hints = "Use: I suggest that..., If I were you..., What matters most is..."
                ),
                SpeakingTask(
                    prompt = "Discuss your future language goals.",
                    promptPersian = "درباره اهداف زبانی آینده‌ات صحبت کن.",
                    hints = "Use: By next year, I'll have..., I intend to..., I aspire to..."
                )
            ),
            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a reflective essay (about 350 words) on your English learning journey. Use a wide variety of advanced structures.",
                    promptPersian = "یه مقاله بازتابی بنویس (حدود ۳۵۰ کلمه) درباره مسیر یادگیری انگلیسی‌ات. از تنوع گسترده‌ای از ساختارهای پیشرفته استفاده کن.",
                    wordCount = 350,
                    hints = "Include:\n1. Journey with perfect tenses\n2. Challenges with conditionals\n3. Insights with cleft sentences\n4. Future goals with modals"
                )
            ),
            quiz = listOf(
                QuizQuestion(
                    question = "Which is the correct third conditional?",
                    options = listOf(
                        "If I would have known, I would have come.",
                        "If I had known, I would have come.",
                        "If I have known, I would have come.",
                        "If I know, I would have come."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: Never ___ I seen such beauty.",
                    options = listOf("have", "has", "had", "having"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: I suggest that he ___ to the meeting.",
                    options = listOf("goes", "go", "going", "went"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which uses hedging?",
                    options = listOf(
                        "This proves the theory.",
                        "This may suggest the theory is correct.",
                        "This definitely proves the theory.",
                        "This always proves the theory."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: It ___ said that he is very rich.",
                    options = listOf("is", "has", "was", "does"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What's the difference between metaphor and simile?",
                    options = listOf(
                        "No difference",
                        "Simile uses like/as; metaphor doesn't",
                        "Metaphor is longer",
                        "Simile is formal"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: The study ___ conducted over five years.",
                    options = listOf("was", "is", "has", "does"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: ___ her work, she left.",
                    options = listOf("Finish", "Finished", "Having finished", "Finishing"),
                    correctIndex = 2
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