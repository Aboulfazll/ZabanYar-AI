package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile5 {

    const val BOOK_ID = "english_file_5"

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
    // CHAPTER 1 — Choices and Consequences
    // ═══════════════════════════════════════════════════════════
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Choices and Consequences",
            titlePersian = "انتخاب‌ها و پیامدها",
            objectives = listOf(
                "Discuss difficult decisions and their consequences",
                "Express opinions and support them with reasons",
                "Use first, second, and third conditionals",
                "Use mixed conditionals in appropriate contexts",
                "Report what other people have said"
            ),
            vocabulary = listOf(
                VocabWord("consequence", "پیامد", "/ˈkɑːnsəkwens/", "noun",
                    "Every decision has consequences.",
                    "هر تصمیمی پیامدهایی دارد."),
                VocabWord("decision", "تصمیم", "/dɪˈsɪʒən/", "noun",
                    "It was a difficult decision to make.",
                    "تصمیم سختی بود."),
                VocabWord("consider", "در نظر گرفتن", "/kənˈsɪdər/", "verb",
                    "We need to consider all the possibilities.",
                    "باید همه احتمالات را در نظر بگیریم."),
                VocabWord("alternative", "گزینه جایگزین", "/ɔːlˈtɜːrnətɪv/", "noun",
                    "We need to find an alternative solution.",
                    "باید یک راه‌حل جایگزین پیدا کنیم."),
                VocabWord("priority", "اولویت", "/praɪˈɔːrəti/", "noun",
                    "Safety should always be a priority.",
                    "ایمنی همیشه باید اولویت باشد."),
                VocabWord("risk", "خطر", "/rɪsk/", "noun",
                    "You need to consider the risks.",
                    "باید خطرات را در نظر بگیری."),
                VocabWord("benefit", "مزیت", "/ˈbenɪfɪt/", "noun",
                    "One benefit of the plan is its flexibility.",
                    "یکی از مزایای این برنامه انعطاف‌پذیری است."),
                VocabWord("drawback", "عیب", "/ˈdrɔːbæk/", "noun",
                    "The main drawback is the high cost.",
                    "عیب اصلی هزینه بالا است."),
                VocabWord("perspective", "دیدگاه", "/pərˈspektɪv/", "noun",
                    "Look at the problem from another perspective.",
                    "به مشکل از دیدگاه دیگری نگاه کن."),
                VocabWord("assumption", "فرض", "/əˈsʌmpʃən/", "noun",
                    "That conclusion is based on an incorrect assumption.",
                    "آن نتیجه بر اساس یک فرض اشتباه است."),
                VocabWord("regret", "پشیمانی", "/rɪˈɡret/", "noun",
                    "I don't regret making that decision.",
                    "از آن تصمیم پشیمان نیستم."),
                VocabWord("justify", "توجیه کردن", "/ˈdʒʌstɪfaɪ/", "verb",
                    "How would you justify that decision?",
                    "چطور آن تصمیم را توجیه می‌کنی؟")
            ),
            idioms = listOf(
                IdiomExpression("weigh the pros and cons", "مزایا و معایب را سنجیدن",
                    "Before deciding, we should weigh the pros and cons.",
                    "قبل از تصمیم‌گیری باید مزایا و معایب را بسنجیم.", "neutral"),
                IdiomExpression("go with your gut", "به حس درونی خود اعتماد کردن",
                    "Sometimes you have to go with your gut.",
                    "گاهی باید به حس درونی خودت اعتماد کنی.", "informal"),
                IdiomExpression("a tough call", "تصمیم بسیار سخت",
                    "Choosing between the two options was a tough call.",
                    "انتخاب بین دو گزینه تصمیم سختی بود.", "informal")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("think through", "با دقت بررسی کردن", "با دقت بررسی کردن",
                    "You should think through the consequences first.",
                    "اول باید پیامدها را با دقت بررسی کنی.", "Yes"),
                PhrasalVerb("come up with", "پیدا کردن", "ارائه دادن",
                    "We need to come up with a better solution.",
                    "باید راه‌حل بهتری پیدا کنیم.", "No"),
                PhrasalVerb("rule out", "رد کردن یک احتمال", "رد کردن",
                    "We can't rule out that possibility yet.",
                    "هنوز نمی‌توانیم آن احتمال را رد کنیم.", "Yes")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Conditionals",
                    "در جملات شرطی، بخش if ممکن است سریع‌تر تلفظ شود."),
                PronunciationTip("Would have",
                    "در گفتار طبیعی، would have به صورت would've شنیده می‌شود."),
                PronunciationTip("Thought and though",
                    "thought و though تلفظ متفاوتی دارند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Disagreeing politely",
                    "در بحث‌های انگلیسی، مخالفت با I see your point, but... نرم‌تر بیان می‌شود."),
                CulturalNote("Supporting an opinion",
                    "بیان نظر همراه با دلیل در گفت‌وگوهای رسمی مهم است.")
            ),
            grammar = listOf(
                GrammarSection("First Conditional",
                    """
                        If + present simple, will + verb

                        If we leave now, we'll arrive on time.
                        If you hurry, you might catch the train.
                    """.trimIndent()),
                GrammarSection("Second Conditional",
                    """
                        If + past simple, would + verb

                        If I had more time, I would learn another language.
                        If I were you, I'd think about it carefully.
                    """.trimIndent()),
                GrammarSection("Third Conditional",
                    """
                        If + past perfect, would have + past participle

                        If I had known, I would have acted differently.
                    """.trimIndent()),
                GrammarSection("Mixed Conditionals",
                    """
                        If I had accepted that job, I would live in London now.
                    """.trimIndent()),
                GrammarSection("Reported Speech",
                    """
                        Direct: "I'm tired," she said.
                        Reported: She said that she was tired.

                        Direct: "I will call you tomorrow."
                        Reported: He said he would call me the next day.
                    """.trimIndent()),
                GrammarSection("Advanced Connectors",
                    """
                        however, therefore, although, whereas, in addition, as a result, on the other hand

                        The plan is expensive. However, it could save money.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If I will have time, I'll help.", "If I have time, I'll help.", "در first conditional از present simple."),
                CommonMistake("If I would be you, I'd wait.", "If I were you, I'd wait.", "If I were you رایج‌تر است."),
                CommonMistake("If I knew earlier, I would have told.", "If I had known earlier, I would have told.", "past perfect لازم است."),
                CommonMistake("She said she is tired.", "She said she was tired.", "reported speech: زمان یک قدم عقب."),
                CommonMistake("Although it was expensive, but we bought.", "Although it was expensive, we bought.", "although و but با هم نمیان.")
            ),
            conversation = listOf(
                DialogueLine("Nora", "Have you decided whether you're going to accept the new job?",
                    "تصمیم گرفته‌ای شغل جدید را قبول کنی یا نه؟"),
                DialogueLine("David", "Not yet. It's a tough call.",
                    "هنوز نه. تصمیم سختی است."),
                DialogueLine("Nora", "What's making the decision so difficult?",
                    "چه چیزی تصمیم را این‌قدر سخت کرده؟"),
                DialogueLine("David", "The salary is much better, but I'd have to move to another city.",
                    "حقوق خیلی بهتر است، اما باید به شهر دیگری نقل مکان کنم."),
                DialogueLine("Nora", "Would you actually like living there?",
                    "واقعاً دوست داری آنجا زندگی کنی؟"),
                DialogueLine("David", "I'm not sure. I've visited, but I've never lived there.",
                    "مطمئن نیستم. دیدن کرده‌ام، اما زندگی نکرده‌ام."),
                DialogueLine("Nora", "What are the main benefits of the new position?",
                    "مزایای اصلی موقعیت جدید چیست؟"),
                DialogueLine("David", "I'd have more responsibility and work on larger projects.",
                    "مسئولیت بیشتر و پروژه‌های بزرگ‌تر."),
                DialogueLine("Nora", "And what are the drawbacks?",
                    "و معایبش چیست؟"),
                DialogueLine("David", "I'd have less free time, and I'd be farther from my family.",
                    "وقت آزاد کمتر و دورتر از خانواده."),
                DialogueLine("Nora", "Have you talked to your family about it?",
                    "با خانواده‌ات صحبت کرده‌ای؟"),
                DialogueLine("David", "Yes. My parents think I should take the opportunity.",
                    "بله. والدینم فکر می‌کنند باید از فرصت استفاده کنم."),
                DialogueLine("Nora", "What did they say exactly?",
                    "دقیقاً چه گفتند؟"),
                DialogueLine("David", "My father said that I would regret it if I turned it down without serious thought.",
                    "پدرم گفت اگر بدون فکر جدی رد کنم، پشیمان می‌شوم."),
                DialogueLine("Nora", "What about your own feelings?",
                    "احساس خودت چطور؟"),
                DialogueLine("David", "Part of me wants to take it, but I'm worried about the change.",
                    "بخشی از من می‌خواهد قبول کنم، ولی نگران تغییرم."),
                DialogueLine("Nora", "If I were you, I'd give it a try.",
                    "اگه جای تو بودم، امتحانش می‌کردم."),
                DialogueLine("David", "Maybe you're right. If I don't take risks, I'll never grow.",
                    "شاید حق داری. اگه ریسک نکنم، هرگز رشد نمی‌کنم."),
                DialogueLine("Nora", "Exactly. You can always change your mind later.",
                    "دقیقاً. همیشه می‌تونی بعداً نظرت رو عوض کنی."),
                DialogueLine("David", "True. I think I'll accept the offer.",
                    "درسته. فکر می‌کنم پیشنهاد رو قبول می‌کنم."),
                DialogueLine("Nora", "Congratulations! Let me know how it goes.",
                    "تبریک! خبرم کن چطور پیش می‌ره."),
                DialogueLine("David", "I will. Thanks for listening.",
                    "می‌کنم. ممنون که گوش دادی.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("David در چه مورد تصمیم می‌گیرد؟", "قبول یا رد شغل جدید."),
                ComprehensionQuestion("مزایای شغل جدید چیست؟", "حقوق بهتر، مسئولیت بیشتر، پروژه‌های بزرگ‌تر."),
                ComprehensionQuestion("معایب شغل جدید چیست؟", "وقت آزاد کمتر، دوری از خانواده."),
                ComprehensionQuestion("Nora چه توصیه‌ای می‌کند؟", "اگر جای او بود، امتحان می‌کرد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss a difficult decision you've made.",
                    "درباره یک تصمیم سخت که گرفته‌ای صحبت کن.",
                    "If I had... / I would have..."),
                SpeakingTask("Give advice about a tough choice.",
                    "درباره یک انتخاب سخت توصیه کن.",
                    "If I were you, I'd... / You should...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a difficult decision and its consequences.",
                    "درباره یک تصمیم سخت و پیامدهایش بنویس.",
                    200,
                    "Use conditionals and reported speech.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If I ___ time, I'll help you.",
                    listOf("will have", "have", "had", "would have"), 1),
                QuizQuestion("Complete: If I ___ you, I'd wait.",
                    listOf("am", "was", "were", "be"), 2),
                QuizQuestion("Complete: If I ___ earlier, I would have told you.",
                    listOf("knew", "know", "had known", "have known"), 2),
                QuizQuestion("Complete: She said she ___ tired.",
                    listOf("is", "was", "were", "be"), 1),
                QuizQuestion("What does 'a tough call' mean?",
                    listOf("تماس سخت", "تصمیم سخت", "پروژه سخت", "سفر سخت"), 1),
                QuizQuestion("Complete: ___ it was expensive, we bought it.",
                    listOf("Although", "But", "However", "Because"), 0),
                QuizQuestion("Complete: If I ___ that job, I would live in London now.",
                    listOf("accept", "accepted", "had accepted", "would accept"), 2),
                QuizQuestion("What does 'go with your gut' mean?",
                    listOf("شکم را نگاه کن", "به حس درونی اعتماد کن", "تصمیم سریع بگیر", "پشیمان شو"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 2 — Big Ideas and Innovation
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Big Ideas and Innovation",
            titlePersian = "ایده‌های بزرگ و نوآوری",
            objectives = listOf(
                "Discuss innovation and big ideas",
                "Use the passive voice",
                "Talk about future technologies",
                "Express speculation about the future"
            ),
            vocabulary = listOf(
                VocabWord("innovation", "نوآوری", "/ˌɪnəˈveɪʃən/", "noun",
                    "Innovation drives progress.", "نوآوری پیشرفت را هدایت می‌کند."),
                VocabWord("invention", "اختراع", "/ɪnˈvenʃən/", "noun",
                    "The internet was a major invention.", "اینترنت یک اختراع بزرگ بود."),
                VocabWord("breakthrough", "پیشرفت بزرگ", "/ˈbreɪkθruː/", "noun",
                    "Scientists made a breakthrough.", "دانشمندان پیشرفت بزرگی کردند."),
                VocabWord("innovative", "نوآورانه", "/ˈɪnəveɪtɪv/", "adjective",
                    "This is an innovative solution.", "این یک راه‌حل نوآورانه است."),
                VocabWord("revolutionize", "متحول کردن", "/ˌrevəˈluːʃənaɪz/", "verb",
                    "AI will revolutionize many industries.", "هوش مصنوعی صنایع را متحول می‌کند."),
                VocabWord("develop", "توسعه دادن", "/dɪˈveləp/", "verb",
                    "They're developing new technology.", "تکنولوژی جدیدی توسعه می‌دهند."),
                VocabWord("discover", "کشف کردن", "/dɪˈskʌvər/", "verb",
                    "Scientists discovered a new species.", "دانشمندان گونه جدیدی کشف کردند."),
                VocabWord("potential", "پتانسیل", "/pəˈtenʃəl/", "noun",
                    "This technology has huge potential.", "این تکنولوژی پتانسیل عظیمی دارد."),
                VocabWord("transform", "متحول کردن", "/trænsˈfɔːrm/", "verb",
                    "Smartphones have transformed how we live.", "گوشی‌های هوشمند زندگی ما را متحول کرده‌اند."),
                VocabWord("cutting-edge", "پیشرو", "/ˈkʌtɪŋ edʒ/", "adjective",
                    "They use cutting-edge technology.", "از تکنولوژی پیشرو استفاده می‌کنند."),
                VocabWord("advancement", "پیشرفت", "/ədˈvænsmənt/", "noun",
                    "Medical advancements save lives.", "پیشرفت‌های پزشکی جان‌ها را نجات می‌دهند."),
                VocabWord("impact", "تأثیر", "/ˈɪmpækt/", "noun",
                    "Technology has a huge impact on society.", "تکنولوژی تأثیر بزرگی بر جامعه دارد.")
            ),
            idioms = listOf(
                IdiomExpression("think outside the box", "خارج از چارچوب فکر کردن",
                    "To succeed, you need to think outside the box.",
                    "برای موفقیت باید خارج از چارچوب فکر کنی.", "neutral"),
                IdiomExpression("a game changer", "چیزی که همه چیز را تغییر می‌دهد",
                    "AI is a real game changer.",
                    "هوش مصنوعی واقعاً همه چیز را تغییر می‌دهد.", "informal"),
                IdiomExpression("push the boundaries", "محدودیت‌ها را جابه‌جا کردن",
                    "Researchers are pushing the boundaries of science.",
                    "محققان محدودیت‌های علم را جابه‌جا می‌کنند.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Innovation",
                    "innovation /ˌɪnəˈveɪʃən/ — استرس روی va."),
                PronunciationTip("Technology",
                    "technology /tekˈnɑːlədʒi/ — استرس روی no.")
            ),
            culturalNotes = listOf(
                CulturalNote("Startup culture",
                    "در سیلیکون ولی، فرهنگ استارتاپ و نوآوری خیلی قویه."),
                CulturalNote("Tech regulation",
                    "بحث درباره تنظیم مقررات تکنولوژی در غرب مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Passive voice",
                    """
                        Present: The technology is used worldwide.
                        Past: The company was founded in 2010.
                        Perfect: The system has been updated.
                        Future: The product will be launched next month.
                    """.trimIndent()),
                GrammarSection("Speculating about the future",
                    """
                        AI might change everything.
                        We may see flying cars soon.
                        Robots could replace many jobs.
                        It's likely that...
                    """.trimIndent()),
                GrammarSection("Second conditional for speculation",
                    """
                        If AI continued to grow, many jobs would change.
                        If we invested more, we would see results.
                    """.trimIndent()),
                GrammarSection("Advanced connectors",
                    """
                        furthermore, moreover, consequently, in other words
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The technology is using.", "The technology is used.", "passive: be + past participle."),
                CommonMistake("The product will launched.", "The product will be launched.", "passive future: will be + pp."),
                CommonMistake("AI might changes.", "AI might change.", "بعد از might فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you think is the biggest innovation of our time?", "فکر می‌کنی بزرگ‌ترین نوآوری زمان ما چیه؟"),
                DialogueLine("B", "The internet, without a doubt.", "اینترنت، بدون شک."),
                DialogueLine("A", "I agree. It's transformed everything.", "موافقم. همه چیز را متحول کرده."),
                DialogueLine("B", "What about AI? It's becoming a game changer.", "هوش مصنوعی چطور؟ داره همه چیز رو عوض می‌کنه."),
                DialogueLine("A", "Definitely. AI might revolutionize healthcare.", "قطعاً. ممکنه سلامت رو متحول کنه."),
                DialogueLine("B", "And education too. It could personalize learning.", "و آموزش هم. می‌تونه یادگیری رو شخصی‌سازی کنه."),
                DialogueLine("A", "But there are risks too.", "ولی خطرات هم داره."),
                DialogueLine("B", "True. Jobs might be lost. We need regulation.", "درسته. شاید شغل‌ها از بین برن. به مقررات نیاز داریم."),
                DialogueLine("A", "If governments acted faster, we'd be more prepared.", "اگه دولت‌ها سریع‌تر عمل می‌کردن، آماده‌تر بودیم."),
                DialogueLine("B", "Exactly. Change is happening faster than the rules.", "دقیقاً. تغییر سریع‌تر از قوانین اتفاق می‌افته."),
                DialogueLine("A", "What do you think the next breakthrough will be?", "فکر می‌کنی پیشرفت بزرگ بعدی چیه؟"),
                DialogueLine("B", "Maybe quantum computing. Or clean energy.", "شاید محاسبات کوانتومی. یا انرژی پاک."),
                DialogueLine("A", "Both would have huge impact.", "هر دو تأثیر بزرگی خواهند داشت."),
                DialogueLine("B", "Imagine if clean energy replaced fossil fuels.", "تصور کن اگه انرژی پاک جای سوخت‌های فسیلی رو بگیره."),
                DialogueLine("A", "That would transform everything.", "اون همه چیز رو متحول می‌کنه."),
                DialogueLine("B", "And it can be done. We just need the will.", "و می‌شه انجامش داد. فقط اراده لازمه."),
                DialogueLine("A", "You're right. Innovation needs vision and courage.", "حق داری. نوآوری به بینش و شجاعت نیاز داره."),
                DialogueLine("B", "Well said. The future is in our hands.", "خوب گفتی. آینده در دستان ماست.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("A بزرگ‌ترین نوآوری را چه می‌داند؟", "اینترنت."),
                ComprehensionQuestion("B چه چیزی را game changer می‌داند؟", "هوش مصنوعی."),
                ComprehensionQuestion("خطرات تکنولوژی چیست؟", "از دست رفتن شغل‌ها، نیاز به مقررات."),
                ComprehensionQuestion("پیشرفت بزرگ بعدی به نظر B چیست؟", "محاسبات کوانتومی یا انرژی پاک.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss innovation that changed the world.",
                    "درباره نوآوری که جهان را تغییر داد صحبت کن.",
                    "It's transformed... / It has had..."),
                SpeakingTask("Speculate about the future of technology.",
                    "درباره آینده تکنولوژی پیش‌بینی کن.",
                    "It might... / It could...")
            ),
            writingTasks = listOf(
                WritingTask("Write about the impact of technology on society.",
                    "درباره تأثیر تکنولوژی بر جامعه بنویس.",
                    200,
                    "Use passive voice and speculation.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The technology ___ used worldwide.",
                    listOf("is", "are", "was", "were"), 0),
                QuizQuestion("Complete: The product will ___ launched soon.",
                    listOf("be", "is", "been", "being"), 0),
                QuizQuestion("Complete: AI might ___ everything.",
                    listOf("changes", "change", "changing", "changed"), 1),
                QuizQuestion("What does 'think outside the box' mean?",
                    listOf("خارج از جعبه فکر کن", "خارج از چارچوب فکر کن", "توی جعبه فکر کن", "بی‌فکر باش"), 1),
                QuizQuestion("Complete: If we invested more, we ___ see results.",
                    listOf("will", "would", "are", "do"), 1),
                QuizQuestion("What does 'game changer' mean?",
                    listOf("بازی‌کن", "چیزی که همه چیز را تغییر می‌دهد", "بازیکن", "برنده"), 1),
                QuizQuestion("Complete: The company ___ founded in 2010.",
                    listOf("is", "was", "has", "were"), 1),
                QuizQuestion("Complete: It's likely ___ AI will grow.",
                    listOf("that", "which", "who", "where"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 3 — Society and Change
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Society and Change",
            titlePersian = "جامعه و تغییر",
            objectives = listOf(
                "Discuss social issues",
                "Use relative clauses",
                "Express opinions on society",
                "Talk about social change"
            ),
            vocabulary = listOf(
                VocabWord("society", "جامعه", "/səˈsaɪəti/", "noun",
                    "Society is changing rapidly.", "جامعه به سرعت در حال تغییره."),
                VocabWord("equality", "برابری", "/ɪˈkwɑːləti/", "noun",
                    "Equality is essential.", "برابری ضروریه."),
                VocabWord("diversity", "تنوع", "/daɪˈvɜːrsəti/", "noun",
                    "Diversity makes us stronger.", "تنوع ما را قوی‌تر می‌کنه."),
                VocabWord("inequality", "نابرابری", "/ˌɪnɪˈkwɑːləti/", "noun",
                    "Inequality is a global issue.", "نابرابری یه مسئله جهانیه."),
                VocabWord("community", "جامعه محلی", "/kəˈmjuːnəti/", "noun",
                    "The community supported us.", "جامعه محلی حمایت‌مون کرد."),
                VocabWord("tradition", "سنت", "/trəˈdɪʃən/", "noun",
                    "Traditions are important.", "سنت‌ها مهمن."),
                VocabWord("generation", "نسل", "/ˌdʒenəˈreɪʃən/", "noun",
                    "Younger generations think differently.", "نسل‌های جوان متفاوت فکر می‌کنن."),
                VocabWord("values", "ارزش‌ها", "/ˈvæljuːz/", "noun",
                    "Family values matter.", "ارزش‌های خانوادگی مهمن."),
                VocabWord("change", "تغییر", "/tʃeɪndʒ/", "noun/verb",
                    "Change takes time.", "تغییر زمان می‌بره."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "Society has made progress.", "جامعه پیشرفت کرده."),
                VocabWord("movement", "جنبش", "/ˈmuːvmənt/", "noun",
                    "The movement grew quickly.", "جنبش سریع رشد کرد."),
                VocabWord("awareness", "آگاهی", "/əˈwernəs/", "noun",
                    "We need to raise awareness.", "باید آگاهی‌بخشی کنیم.")
            ),
            idioms = listOf(
                IdiomExpression("stand up for", "ایستادگی کردن برای",
                    "We must stand up for what's right.",
                    "باید برای درستی ایستادگی کنیم.", "neutral"),
                IdiomExpression("break the mold", "شکستن قالب‌های سنتی",
                    "She broke the mold in her industry.",
                    "او در صنعتش قالب‌ها رو شکست.", "idiom"),
                IdiomExpression("bridge the gap", "پر کردن شکاف",
                    "We need to bridge the gap between generations.",
                    "باید شکاف بین نسل‌ها رو پر کنیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Society",
                    "society /səˈsaɪəti/ — استرس روی ci."),
                PronunciationTip("Generation",
                    "generation /ˌdʒenəˈreɪʃən/ — استرس روی ra.")
            ),
            culturalNotes = listOf(
                CulturalNote("Social activism",
                    "فعالیت‌های اجتماعی در غرب بخش مهمی از جامعه‌ست."),
                CulturalNote("Generational differences",
                    "تفاوت‌های نسلی یک موضوع رایج بحث در غربه.")
            ),
            grammar = listOf(
                GrammarSection("Relative clauses",
                    """
                        Defining: The people who live here are friendly.
                        Non-defining: My brother, who lives in London, is a teacher.
                    """.trimIndent()),
                GrammarSection("Passive voice in social contexts",
                    """
                        Many laws were changed.
                        Awareness is being raised.
                        Equality must be protected.
                    """.trimIndent()),
                GrammarSection("Expressing opinions on society",
                    """
                        I think society is changing.
                        In my opinion, we need...
                        It seems to me that...
                    """.trimIndent()),
                GrammarSection("Cause and effect connectors",
                    """
                        because of, due to, as a result, therefore, consequently
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The people which live here...", "The people who live here...", "برای افراد از who."),
                CommonMistake("Society are changing.", "Society is changing.", "society مفرد."),
                CommonMistake("Because of the change happened...", "Because of the change,...", "because of + noun.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you think society is changing fast enough?", "فکر می‌کنی جامعه به‌اندازه کافی سریع تغییر می‌کنه؟"),
                DialogueLine("B", "In some ways yes, in others no.", "از بعضی جهات بله، از بعضی نه."),
                DialogueLine("A", "What needs to change most?", "چی بیشتر باید عوض بشه؟"),
                DialogueLine("B", "I think inequality. It's a global problem.", "فکر می‌کنم نابرابری. یه مسئله جهانیه."),
                DialogueLine("A", "I agree. What can we do about it?", "موافقم. چیکار می‌تونیم بکنیم؟"),
                DialogueLine("B", "Raise awareness and support movements for change.", "آگاهی‌بخشی و حمایت از جنبش‌های تغییر."),
                DialogueLine("A", "Do you think younger generations care more?", "فکر می‌کنی نسل‌های جوان بیشتر اهمیت می‌دن؟"),
                DialogueLine("B", "Definitely. They're more aware of global issues.", "قطعاً. از مسائل جهانی آگاه‌ترن."),
                DialogueLine("A", "That's encouraging.", "این دلگرم‌کننده‌ست."),
                DialogueLine("B", "It is. But we also need to bridge the gap with older generations.", "همین‌طوره. ولی باید شکاف با نسل‌های قدیمی‌تر رو هم پر کنیم."),
                DialogueLine("A", "True. Change needs everyone.", "درسته. تغییر به همه نیاز داره."),
                DialogueLine("B", "Exactly. And traditions matter too.", "دقیقاً. سنت‌ها هم مهمن."),
                DialogueLine("A", "Balance is key.", "تعادل کلیدیه."),
                DialogueLine("B", "Yes. Progress without losing our values.", "بله. پیشرفت بدون از دست دادن ارزش‌هامون."),
                DialogueLine("A", "Well said. What's your biggest hope?", "خوب گفتی. بزرگ‌ترین امیدت چیه؟"),
                DialogueLine("B", "A fairer society for everyone.", "یه جامعه عادلانه‌تر برای همه."),
                DialogueLine("A", "That's a beautiful goal.", "هدف زیباییه."),
                DialogueLine("B", "Thanks. It starts with each of us.", "ممنون. از هر کدوم ما شروع می‌شه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("به نظر B چه چیزی باید تغییر کند؟", "نابرابری."),
                ComprehensionQuestion("نسل‌های جوان چطورند؟", "از مسائل جهانی آگاه‌ترند."),
                ComprehensionQuestion("B چه چیزی را مهم می‌داند؟", "پر کردن شکاف بین نسل‌ها."),
                ComprehensionQuestion("بزرگ‌ترین امید B چیست؟", "جامعه‌ای عادلانه‌تر برای همه.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss social issues.",
                    "درباره مسائل اجتماعی صحبت کن.",
                    "I think... / In my opinion..."),
                SpeakingTask("Talk about generational differences.",
                    "درباره تفاوت‌های نسلی صحبت کن.",
                    "Younger generations... / Older generations...")
            ),
            writingTasks = listOf(
                WritingTask("Write about an important social change.",
                    "درباره یک تغییر اجتماعی مهم بنویس.",
                    200,
                    "Use relative clauses and cause-effect connectors.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The people ___ live here are friendly.",
                    listOf("which", "who", "whose", "where"), 1),
                QuizQuestion("Complete: Society ___ changing.",
                    listOf("are", "is", "were", "have"), 1),
                QuizQuestion("What does 'bridge the gap' mean?",
                    listOf("ساختن پل", "پر کردن شکاف", "شکستن پل", "عبور کردن"), 1),
                QuizQuestion("Complete: Many laws ___ changed.",
                    listOf("was", "were", "have", "is"), 1),
                QuizQuestion("Complete: We must stand ___ for what's right.",
                    listOf("up", "on", "at", "in"), 0),
                QuizQuestion("What does 'break the mold' mean?",
                    listOf("شکستن قالب", "شکستن قالب‌های سنتی", "قالب‌سازی", "خراب کردن"), 1),
                QuizQuestion("Complete: ___ of the change, we adapted.",
                    listOf("Because", "Because of", "Although", "Despite"), 1),
                QuizQuestion("Complete: Equality must ___ protected.",
                    listOf("be", "is", "been", "being"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 4 — Global Issues
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Global Issues",
            titlePersian = "مسائل جهانی",
            objectives = listOf(
                "Discuss global problems",
                "Use advanced conditionals",
                "Talk about solutions",
                "Express concern and hope"
            ),
            vocabulary = listOf(
                VocabWord("global", "جهانی", "/ˈɡloʊbəl/", "adjective",
                    "Climate change is a global issue.", "تغییر اقلیم یه مسئله جهانیه."),
                VocabWord("poverty", "فقر", "/ˈpɑːvərti/", "noun",
                    "Poverty affects millions.", "فقر میلیون‌ها را تحت تأثیر قرار می‌دهد."),
                VocabWord("conflict", "درگیری", "/ˈkɑːnflɪkt/", "noun",
                    "Conflicts cause suffering.", "درگیری‌ها رنج ایجاد می‌کنند."),
                VocabWord("refugee", "پناهنده", "/ˌrefjuˈdʒiː/", "noun",
                    "Refugees need help.", "پناهندگان به کمک نیاز دارند."),
                VocabWord("crisis", "بحران", "/ˈkraɪsɪs/", "noun",
                    "The world faces many crises.", "جهان با بحران‌های زیادی روبروست."),
                VocabWord("solution", "راه‌حل", "/səˈluːʃən/", "noun",
                    "We need global solutions.", "به راه‌حل‌های جهانی نیاز داریم."),
                VocabWord("cooperation", "همکاری", "/koʊˌɑːpəˈreɪʃən/", "noun",
                    "International cooperation is essential.", "همکاری بین‌المللی ضروریه."),
                VocabWord("sustainable", "پایدار", "/səˈsteɪnəbəl/", "adjective",
                    "We need sustainable development.", "به توسعه پایدار نیاز داریم."),
                VocabWord("impact", "تأثیر", "/ˈɪmpækt/", "noun",
                    "The impact is huge.", "تأثیرش عظیمه."),
                VocabWord("action", "اقدام", "/ˈækʃən/", "noun",
                    "We need urgent action.", "به اقدام فوری نیاز داریم."),
                VocabWord("awareness", "آگاهی", "/əˈwernəs/", "noun",
                    "Awareness is growing.", "آگاهی در حال رشد است."),
                VocabWord("hope", "امید", "/hoʊp/", "noun",
                    "There's still hope.", "هنوز امید هست.")
            ),
            idioms = listOf(
                IdiomExpression("a global village", "دهکده جهانی",
                    "The internet made us a global village.",
                    "اینترنت ما را دهکده جهانی کرد.", "idiom"),
                IdiomExpression("make a difference", "تفاوت ایجاد کردن",
                    "Everyone can make a difference.",
                    "هر کسی می‌تونه تفاوت ایجاد کنه.", "neutral"),
                IdiomExpression("the bigger picture", "تصویر بزرگ‌تر",
                    "We need to look at the bigger picture.",
                    "باید به تصویر بزرگ‌تر نگاه کنیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Global",
                    "global /ˈɡloʊbəl/ — استرس روی glo."),
                PronunciationTip("Refugee",
                    "refugee /ˌrefjuˈdʒiː/ — استرس روی gee.")
            ),
            culturalNotes = listOf(
                CulturalNote("UN and NGOs",
                    "سازمان ملل و NGOها نقش مهمی در حل مسائل جهانی دارند."),
                CulturalNote("Global citizenship",
                    "شهروندی جهانی در غرب یک مفهوم مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Advanced conditionals",
                    """
                        First: If we act, we will solve it.
                        Second: If we acted, we would solve it.
                        Third: If we had acted, we would have solved it.
                        Mixed: If we had acted earlier, we would be safer now.
                    """.trimIndent()),
                GrammarSection("Passive for global issues",
                    """
                        Many problems are caused by inequality.
                        The issue must be addressed.
                        Awareness is being raised.
                    """.trimIndent()),
                GrammarSection("Expressing concern",
                    """
                        I'm concerned about...
                        We should worry about...
                        It's worrying that...
                    """.trimIndent()),
                GrammarSection("Expressing hope",
                    """
                        I hope that...
                        There's still hope...
                        We can make a difference.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If we would act, we solve.", "If we act, we will solve.", "شرطی اول درست."),
                CommonMistake("The problem caused by war.", "The problem is caused by war.", "passive لازم داره be."),
                CommonMistake("I'm concerned of climate.", "I'm concerned about climate.", "concerned about.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you think is the biggest global issue?", "فکر می‌کنی بزرگ‌ترین مسئله جهانی چیه؟"),
                DialogueLine("B", "Climate change, probably. It affects everything.", "تغییر اقلیم، احتمالاً. همه چیز رو تحت تأثیر قرار می‌ده."),
                DialogueLine("A", "I agree. What about poverty?", "موافقم. فقر چطور؟"),
                DialogueLine("B", "That's also huge. Millions live in poverty.", "اونم بزرگه. میلیون‌ها نفر در فقر زندگی می‌کنن."),
                DialogueLine("A", "How can we solve these problems?", "چطور می‌تونیم این مشکلات رو حل کنیم؟"),
                DialogueLine("B", "Cooperation. No country can solve them alone.", "همکاری. هیچ کشوری نمی‌تونه تنهایی حلشون کنه."),
                DialogueLine("A", "True. What can individuals do?", "درسته. افراد چیکار می‌تونن بکنن؟"),
                DialogueLine("B", "Raise awareness, donate, and vote for change.", "آگاهی‌بخشی، اهدا و رأی دادن برای تغییر."),
                DialogueLine("A", "If we all acted, we could make a difference.", "اگه همه اقدام کنیم، می‌تونیم تفاوت ایجاد کنیم."),
                DialogueLine("B", "Exactly. Every action counts.", "دقیقاً. هر اقدامی مهمه."),
                DialogueLine("A", "Do you feel hopeful about the future?", "درباره آینده امیدواری؟"),
                DialogueLine("B", "Some days yes, some days no. But I try to stay positive.", "بعضی روزها بله، بعضی نه. ولی سعی می‌کنم مثبت بمونم."),
                DialogueLine("A", "That's important. Hope drives action.", "این مهمه. امید اقدام رو هدایت می‌کنه."),
                DialogueLine("B", "Well said. We can't give up.", "خوب گفتی. نمی‌تونیم تسلیم شیم."),
                DialogueLine("A", "Never. The future depends on us.", "هرگز. آینده به ما بستگی داره."),
                DialogueLine("B", "And our children. We owe it to them.", "و فرزندان ما. بهشون مدیونیم."),
                DialogueLine("A", "Exactly. Let's do our part.", "دقیقاً. بیا سهممون رو انجام بدیم."),
                DialogueLine("B", "Agreed. Together we can make a difference.", "قبول. با هم می‌تونیم تفاوت ایجاد کنیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B بزرگ‌ترین مسئله جهانی را چه می‌داند؟", "تغییر اقلیم."),
                ComprehensionQuestion("راه‌حل مشکلات جهانی چیست؟", "همکاری بین‌المللی."),
                ComprehensionQuestion("افراد چه می‌توانند بکنند؟", "آگاهی‌بخشی، اهدا، رأی دادن."),
                ComprehensionQuestion("B درباره آینده چه احساسی دارد؟", "گاهی امیدوار، گاهی نه، ولی مثبت می‌ماند.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss a global issue.",
                    "درباره یک مسئله جهانی صحبت کن.",
                    "It affects... / We need to..."),
                SpeakingTask("Propose solutions.",
                    "راه‌حل ارائه بده.",
                    "If we..., we could... / We should...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a global problem and possible solutions.",
                    "درباره یک مشکل جهانی و راه‌حل‌های ممکن بنویس.",
                    200,
                    "Use conditionals and passive voice.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If we act, we ___ solve it.",
                    listOf("will", "would", "had", "did"), 0),
                QuizQuestion("Complete: The problem is ___ by war.",
                    listOf("cause", "caused", "causing", "causes"), 1),
                QuizQuestion("Complete: I'm concerned ___ climate.",
                    listOf("of", "with", "about", "at"), 2),
                QuizQuestion("What does 'global village' mean?",
                    listOf("دهکده جهانی", "شهر بزرگ", "روستا", "ملت"), 0),
                QuizQuestion("Complete: If we had acted, we ___ solved it.",
                    listOf("will have", "would have", "have", "had"), 1),
                QuizQuestion("Complete: Awareness ___ being raised.",
                    listOf("is", "are", "was", "were"), 0),
                QuizQuestion("What does 'the bigger picture' mean?",
                    listOf("عکس بزرگ", "تصویر بزرگ‌تر", "تصویر کوچک", "نقاشی"), 1),
                QuizQuestion("Complete: There's still ___.",
                    listOf("hopes", "hoping", "hope", "hoped"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 5 — The Future of Work
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "The Future of Work",
            titlePersian = "آینده کار",
            objectives = listOf(
                "Discuss the future of work",
                "Use future perfect and future continuous",
                "Talk about careers and automation",
                "Express certainty and uncertainty"
            ),
            vocabulary = listOf(
                VocabWord("automation", "اتوماسیون", "/ˌɔːtəˈmeɪʃən/", "noun",
                    "Automation is changing industries.", "اتوماسیون صنایع را تغییر می‌دهد."),
                VocabWord("remote work", "دورکاری", "/rɪˈmoʊt wɜːrk/", "noun",
                    "Remote work is becoming common.", "دورکاری رایج می‌شود."),
                VocabWord("freelance", "فریلنس", "/ˈfriːlæns/", "adjective",
                    "She works as a freelancer.", "او به عنوان فریلنسر کار می‌کند."),
                VocabWord("skills", "مهارت‌ها", "/skɪlz/", "noun",
                    "Skills are more important than degrees.", "مهارت‌ها مهم‌تر از مدرک هستند."),
                VocabWord("career", "حرفه", "/kəˈrɪr/", "noun",
                    "Career paths are changing.", "مسیرهای شغلی در حال تغییرند."),
                VocabWord("job market", "بازار کار", "/dʒɑːb ˈmɑːrkɪt/", "noun",
                    "The job market is competitive.", "بازار کار رقابتیه."),
                VocabWord("adapt", "سازگار شدن", "/əˈdæpt/", "verb",
                    "Workers need to adapt to change.", "کارگران باید با تغییر سازگار شوند."),
                VocabWord("lifelong learning", "یادگیری مادام‌العمر", "/ˈlaɪflɔːŋ ˈlɜːrnɪŋ/", "noun",
                    "Lifelong learning is essential.", "یادگیری مادام‌العمر ضروریه."),
                VocabWord("routine", "روتین", "/ruːˈtiːn/", "adjective",
                    "Routine jobs are at risk.", "مشاغل روتین در خطرند."),
                VocabWord("creative", "خلاق", "/kriˈeɪtɪv/", "adjective",
                    "Creative work is hard to automate.", "کار خلاق سخت اتومات می‌شود."),
                VocabWord("predict", "پیش‌بینی کردن", "/prɪˈdɪkt/", "verb",
                    "It's hard to predict the future.", "پیش‌بینی آینده سخته."),
                VocabWord("uncertainty", "عدم قطعیت", "/ʌnˈsɜːrtnti/", "noun",
                    "Uncertainty is part of modern work.", "عدم قطعیت بخشی از کار مدرنه.")
            ),
            idioms = listOf(
                IdiomExpression("future-proof", "مقاوم در برابر آینده",
                    "Learn skills to future-proof your career.", "مهارت‌هایی یاد بگیر تا حرفه‌ات رو مقاوم کنی.", "neutral"),
                IdiomExpression("up in the air", "نامعلوم",
                    "The plan is still up in the air.", "برنامه هنوز نامعلومه.", "idiom"),
                IdiomExpression("learn the ropes", "اصول کار را یاد گرفتن",
                    "It takes time to learn the ropes.", "یاد گرفتن اصول کار زمان می‌بره.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Automation",
                    "automation /ˌɔːtəˈmeɪʃən/ — استرس روی ma."),
                PronunciationTip("Freelance",
                    "freelance /ˈfriːlæns/ — استرس روی free.")
            ),
            culturalNotes = listOf(
                CulturalNote("Gig economy",
                    "اقتصاد گیگ در غرب رایج شده."),
                CulturalNote("Work-life balance",
                    "تعادل کار و زندگی در بحث آینده کار مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Future continuous",
                    """
                        will be + verb-ing

                        By 2030, we will be working remotely.
                        This time next year, I'll be studying abroad.
                    """.trimIndent()),
                GrammarSection("Future perfect",
                    """
                        will have + past participle

                        By 2040, AI will have changed many jobs.
                        By next year, I will have finished my degree.
                    """.trimIndent()),
                GrammarSection("Expressing certainty",
                    """
                        Certain: Robots will replace some jobs.
                        Likely: It's likely that...
                        Possible: It might...
                        Uncertain: It's hard to say.
                    """.trimIndent()),
                GrammarSection("Passive for future",
                    """
                        Many jobs will be automated.
                        New skills will be needed.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I will finishing soon.", "I will finish soon.", "will + base form."),
                CommonMistake("By 2030, I will have finish.", "By 2030, I will have finished.", "future perfect: will have + pp."),
                CommonMistake("It might to change.", "It might change.", "بعد از might فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you think the future of work will look like?", "فکر می‌کنی آینده کار چطور خواهد بود؟"),
                DialogueLine("B", "More automation, for sure.", "اتوماسیون بیشتر، حتماً."),
                DialogueLine("A", "Do you think many jobs will disappear?", "فکر می‌کنی خیلی از شغل‌ها ناپدید می‌شن؟"),
                DialogueLine("B", "Routine jobs, yes. Creative jobs will be safer.", "مشاغل روتین، بله. مشاغل خلاق امن‌تر خواهند بود."),
                DialogueLine("A", "What skills will we need?", "به چه مهارت‌هایی نیاز خواهیم داشت؟"),
                DialogueLine("B", "Lifelong learning, adaptability, and creativity.", "یادگیری مادام‌العمر، سازگاری و خلاقیت."),
                DialogueLine("A", "Do you think remote work will continue?", "فکر می‌کنی دورکاری ادامه پیدا می‌کنه؟"),
                DialogueLine("B", "Definitely. By 2030, most offices will have gone hybrid.", "قطعاً. تا ۲۰۳۰، بیشتر دفاتر هیبرید خواهند بود."),
                DialogueLine("A", "That would change cities a lot.", "اون شهرها رو خیلی تغییر می‌ده."),
                DialogueLine("B", "It already is. People are moving to smaller towns.", "همین‌طوره. مردم دارن به شهرهای کوچک‌تر نقل مکان می‌کنن."),
                DialogueLine("A", "Do you feel worried about the changes?", "از این تغییرات نگرانی؟"),
                DialogueLine("B", "Sometimes. Uncertainty is part of it.", "گاهی. عدم قطعیت بخشی از ماجراست."),
                DialogueLine("A", "How do you stay positive?", "چطور مثبت می‌مونی؟"),
                DialogueLine("B", "By learning new things constantly.", "با یاد گرفتن مداوم چیزهای جدید."),
                DialogueLine("A", "That's smart. Lifelong learning is key.", "هوشمندانه‌ست. یادگیری مادام‌العمر کلیدیه."),
                DialogueLine("B", "Exactly. Adapt or fall behind.", "دقیقاً. سازگار شو یا عقب بمون."),
                DialogueLine("A", "Well said. Let's keep learning.", "خوب گفتی. بیا یاد بگیریم."),
                DialogueLine("B", "Agreed. The future belongs to learners.", "قبول. آینده به یادگیرنده‌ها تعلق داره.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه نوع مشاغلی در خطرند؟", "مشاغل روتین."),
                ComprehensionQuestion("چه مهارت‌هایی در آینده لازم خواهد بود؟", "یادگیری مادام‌العمر، سازگاری، خلاقیت."),
                ComprehensionQuestion("دورکاری چه تأثیری داشته؟", "مردم به شهرهای کوچک‌تر نقل مکان می‌کنند."),
                ComprehensionQuestion("B چطور مثبت می‌ماند؟", "با یادگیری مداوم.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss the future of work.",
                    "درباره آینده کار صحبت کن.",
                    "By 2030, ... will have... / Workers will be..."),
                SpeakingTask("Talk about skills for the future.",
                    "درباره مهارت‌های آینده صحبت کن.",
                    "We will need... / It's important to...")
            ),
            writingTasks = listOf(
                WritingTask("Write about how work will change in the future.",
                    "درباره اینکه کار در آینده چطور تغییر می‌کند بنویس.",
                    200,
                    "Use future perfect and future continuous.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: By 2030, I will ___ finished my studies.",
                    listOf("have", "has", "be", "been"), 0),
                QuizQuestion("Complete: This time next year, I'll ___ working.",
                    listOf("be", "have", "is", "been"), 0),
                QuizQuestion("Complete: Many jobs will ___ automated.",
                    listOf("be", "is", "been", "being"), 0),
                QuizQuestion("What does 'future-proof' mean?",
                    listOf("آینده", "مقاوم در برابر آینده", "آینده‌نگر", "پیشگو"), 1),
                QuizQuestion("Complete: It might ___ everything.",
                    listOf("changes", "change", "changing", "changed"), 1),
                QuizQuestion("What does 'up in the air' mean?",
                    listOf("در هوا", "نامعلوم", "بالا", "پایین"), 1),
                QuizQuestion("Complete: By next year, she will have ___ abroad.",
                    listOf("study", "studied", "studying", "studies"), 1),
                QuizQuestion("Complete: New skills will ___ needed.",
                    listOf("be", "is", "been", "being"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 6 — Communication and Media
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Communication and Media",
            titlePersian = "ارتباطات و رسانه",
            objectives = listOf(
                "Discuss communication in the modern world",
                "Use reported speech",
                "Talk about media and information",
                "Express opinions on social media"
            ),
            vocabulary = listOf(
                VocabWord("communicate", "ارتباط برقرار کردن", "/kəˈmjuːnɪkeɪt/", "verb",
                    "We communicate in many ways.", "به روش‌های زیادی ارتباط برقرار می‌کنیم."),
                VocabWord("media", "رسانه", "/ˈmiːdiə/", "noun",
                    "The media shapes opinions.", "رسانه‌ها نظرات را شکل می‌دهند."),
                VocabWord("information", "اطلاعات", "/ˌɪnfərˈmeɪʃən/", "noun",
                    "Information spreads quickly online.", "اطلاعات آنلاین سریع پخش می‌شود."),
                VocabWord("source", "منبع", "/sɔːrs/", "noun",
                    "Check your sources.", "منابعت را چک کن."),
                VocabWord("platform", "پلتفرم", "/ˈplætfɔːrm/", "noun",
                    "Social media platforms are everywhere.", "پلتفرم‌های شبکه اجتماعی همه‌جا هستند."),
                VocabWord("content", "محتوا", "/ˈkɑːntent/", "noun",
                    "Quality content matters.", "محتوای باکیفیت مهمه."),
                VocabWord("audience", "مخاطب", "/ˈɔːdiəns/", "noun",
                    "Know your audience.", "مخاطبت رو بشناس."),
                VocabWord("influence", "تأثیر گذاشتن", "/ˈɪnfluəns/", "noun/verb",
                    "Influencers have big influence.", "اینفلوئنسرها تأثیر بزرگی دارن."),
                VocabWord("advertisement", "تبلیغات", "/ədˈvɜːrtɪsmənt/", "noun",
                    "We see advertisements everywhere.", "همه‌جا تبلیغات می‌بینیم."),
                VocabWord("privacy", "حریم خصوصی", "/ˈpraɪvəsi/", "noun",
                    "Online privacy is important.", "حریم خصوصی آنلاین مهمه."),
                VocabWord("misinformation", "اطلاعات نادرست", "/ˌmɪsɪnfərˈmeɪʃən/", "noun",
                    "Misinformation spreads fast.", "اطلاعات نادرست سریع پخش می‌شه."),
                VocabWord("filter", "فیلتر کردن", "/ˈfɪltər/", "verb",
                    "We need to filter information.", "باید اطلاعات را فیلتر کنیم.")
            ),
            idioms = listOf(
                IdiomExpression("word of mouth", "شفاهی",
                    "The news spread by word of mouth.", "خبر شفاهی پخش شد.", "neutral"),
                IdiomExpression("get the message", "پیام را گرفتن",
                    "I got the message clearly.", "پیام را واضح گرفتم.", "informal"),
                IdiomExpression("break the news", "خبر را گفتن",
                    "She broke the news to us gently.", "او خبر را با ملایمت به ما گفت.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Communication",
                    "communication /kəˌmjuːnɪˈkeɪʃən/ — استرس روی ca."),
                PronunciationTip("Information",
                    "information /ˌɪnfərˈmeɪʃən/ — استرس روی ma.")
            ),
            culturalNotes = listOf(
                CulturalNote("Media literacy",
                    "سواد رسانه‌ای در غرب بخش مهمی از آموزشه."),
                CulturalNote("Digital privacy",
                    "حریم خصوصی دیجیتال یک دغدغه بزرگ در غربه.")
            ),
            grammar = listOf(
                GrammarSection("Reported speech",
                    """
                        He said that he was busy.
                        She told me she would come.
                        They asked if I was ready.
                        He asked where I lived.
                    """.trimIndent()),
                GrammarSection("Reporting verbs",
                    """
                        claim, admit, deny, suggest, promise, warn
                        She admitted that she was wrong.
                        He promised he would help.
                    """.trimIndent()),
                GrammarSection("Passive in media",
                    """
                        The news was reported yesterday.
                        The article has been published.
                        The video is being shared widely.
                    """.trimIndent()),
                GrammarSection("Expressing opinions",
                    """
                        I think social media...
                        In my opinion...
                        It seems to me that...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("He said me...", "He told me...", "بعد از tell از ضمیر مفعولی."),
                CommonMistake("He said he will come.", "He said he would come.", "will → would."),
                CommonMistake("The news are important.", "The news is important.", "news غیرقابل شمارشه.")
            ),
            conversation = listOf(
                DialogueLine("A", "How do you usually get your news?", "معمولاً اخبار رو از کجا می‌گیری؟"),
                DialogueLine("B", "Mostly social media. What about you?", "بیشتر شبکه‌های اجتماعی. تو چطور؟"),
                DialogueLine("A", "I use a mix. I check multiple sources.", "من ترکیبی. چند منبع رو چک می‌کنم."),
                DialogueLine("B", "That's smart. There's so much misinformation.", "هوشمندانه‌ست. اطلاعات نادرست خیلی زیاده."),
                DialogueLine("A", "True. Do you trust social media?", "درسته. به شبکه‌های اجتماعی اعتماد داری؟"),
                DialogueLine("B", "Only partly. I verify things before sharing.", "فقط تا حدی. قبل از به اشتراک گذاشتن تأیید می‌کنم."),
                DialogueLine("A", "That's a good habit. What about influencers?", "عادت خوبیه. اینفلوئنسرها چطور؟"),
                DialogueLine("B", "Some are great, but some spread misinformation.", "بعضی عالی هستن، ولی بعضی اطلاعات نادرست پخش می‌کنن."),
                DialogueLine("A", "Do you think governments should regulate platforms?", "فکر می‌کنی دولت‌ها باید پلتفرم‌ها رو تنظیم کنن؟"),
                DialogueLine("B", "Maybe to a degree. Balance is important.", "شاید تا حدی. تعادل مهمه."),
                DialogueLine("A", "What about privacy?", "حریم خصوصی چطور؟"),
                DialogueLine("B", "It's a big concern. Companies collect too much data.", "نگرانی بزرگیه. شرکت‌ها داده‌های زیادی جمع می‌کنن."),
                DialogueLine("A", "I agree. We should be more careful.", "موافقم. باید محتاط‌تر باشیم."),
                DialogueLine("B", "Exactly. Being aware is the first step.", "دقیقاً. آگاه بودن اولین قدمه."),
                DialogueLine("A", "What advice would you give?", "چه توصیه‌ای می‌کنی؟"),
                DialogueLine("B", "Check sources, think critically, and limit screen time.", "منابع رو چک کن، انتقادی فکر کن و زمان صفحه رو محدود کن."),
                DialogueLine("A", "Great advice. Thanks for sharing.", "توصیه عالی. ممنون که گفتی."),
                DialogueLine("B", "Anytime. Stay informed!", "هر وقت. آگاه بمون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B اخبار را از کجا می‌گیرد؟", "شبکه‌های اجتماعی."),
                ComprehensionQuestion("B قبل از به اشتراک گذاشتن چیکار می‌کند؟", "تأیید می‌کند."),
                ComprehensionQuestion("نگرانی اصلی B چیست؟", "حریم خصوصی و اطلاعات نادرست."),
                ComprehensionQuestion("توصیه B چیست؟", "چک منابع، تفکر انتقادی، محدود کردن زمان صفحه.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss media in your life.",
                    "درباره رسانه در زندگی‌ات صحبت کن.",
                    "I use... / I check..."),
                SpeakingTask("Express opinions on social media.",
                    "نظرت را درباره شبکه‌های اجتماعی بیان کن.",
                    "I think... / In my opinion...")
            ),
            writingTasks = listOf(
                WritingTask("Write about the pros and cons of social media.",
                    "درباره مزایا و معایب شبکه‌های اجتماعی بنویس.",
                    200,
                    "Use reported speech and passive.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: He ___ me he was tired.",
                    listOf("said", "told", "spoke", "talked"), 1),
                QuizQuestion("Complete: He said he ___ come.",
                    listOf("will", "would", "can", "could"), 1),
                QuizQuestion("Complete: The news ___ important.",
                    listOf("are", "is", "were", "have"), 1),
                QuizQuestion("What does 'word of mouth' mean?",
                    listOf("کلمه دهان", "شفاهی", "نوشتاری", "رسمی"), 1),
                QuizQuestion("Complete: The article has been ___.",
                    listOf("publish", "published", "publishing", "publishes"), 1),
                QuizQuestion("Complete: She ___ that she was wrong.",
                    listOf("admits", "admitted", "admitting", "admit"), 1),
                QuizQuestion("What does 'break the news' mean?",
                    listOf("شکستن خبر", "خبر را گفتن", "خبر را پنهان کردن", "خبر بد"), 1),
                QuizQuestion("Complete: The video is ___ shared widely.",
                    listOf("be", "being", "been", "is"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 7 — Environment and Responsibility
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Environment and Responsibility",
            titlePersian = "محیط زیست و مسئولیت",
            objectives = listOf(
                "Discuss environmental responsibility",
                "Use mixed conditionals",
                "Talk about sustainable living",
                "Express responsibility"
            ),
            vocabulary = listOf(
                VocabWord("sustainability", "پایداری", "/səˌsteɪnəˈbɪləti/", "noun",
                    "Sustainability is crucial.", "پایداری حیاتیه."),
                VocabWord("carbon footprint", "ردپای کربن", "/ˈkɑːrbən ˈfʊtprɪnt/", "noun",
                    "Reduce your carbon footprint.", "ردپای کربنت رو کم کن."),
                VocabWord("emission", "انتشار", "/ɪˈmɪʃən/", "noun",
                    "Emissions must be reduced.", "انتشارها باید کاهش یابند."),
                VocabWord("renewable", "تجدیدپذیر", "/rɪˈnuːəbəl/", "adjective",
                    "Renewable energy is the future.", "انرژی تجدیدپذیر آینده‌ست."),
                VocabWord("conservation", "حفاظت", "/ˌkɑːnsərˈveɪʃən/", "noun",
                    "Conservation efforts are growing.", "تلاش‌های حفاظتی در حال رشدند."),
                VocabWord("responsibility", "مسئولیت", "/rɪˌspɑːnsəˈbɪləti/", "noun",
                    "We all have responsibility.", "همه ما مسئولیت داریم."),
                VocabWord("consume", "مصرف کردن", "/kənˈsuːm/", "verb",
                    "We consume too much.", "زیادی مصرف می‌کنیم."),
                VocabWord("eco-friendly", "سازگار با محیط زیست", "/ˌiːkoʊ ˈfrendli/", "adjective",
                    "Buy eco-friendly products.", "محصولات سازگار با محیط زیست بخر."),
                VocabWord("waste", "زباله", "/weɪst/", "noun",
                    "Waste is a global problem.", "زباله یه مسئله جهانیه."),
                VocabWord("protect", "محافظت کردن", "/prəˈtekt/", "verb",
                    "We must protect the planet.", "باید از سیاره محافظت کنیم."),
                VocabWord("future generations", "نسل‌های آینده", "/ˈfjuːtʃər ˌdʒenəˈreɪʃənz/", "noun",
                    "Think about future generations.", "به نسل‌های آینده فکر کن."),
                VocabWord("aware", "آگاه", "/əˈwer/", "adjective",
                    "Be aware of your impact.", "از تأثیرت آگاه باش.")
            ),
            idioms = listOf(
                IdiomExpression("leave a footprint", "ردپا گذاشتن",
                    "Everything we do leaves a footprint.", "هر کاری که می‌کنیم ردپا می‌ذاره.", "idiom"),
                IdiomExpression("take responsibility", "مسئولیت پذیرفتن",
                    "We must take responsibility for our actions.", "باید مسئولیت کارهامون رو بپذیریم.", "neutral"),
                IdiomExpression("walk the talk", "عمل کردن به حرف",
                    "If we say we care, we should walk the talk.", "اگه می‌گیم اهمیت می‌دیم، باید عمل کنیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Sustainability",
                    "sustainability /səˌsteɪnəˈbɪləti/ — استرس روی bi."),
                PronunciationTip("Responsibility",
                    "responsibility /rɪˌspɑːnsəˈbɪləti/ — استرس روی bi.")
            ),
            culturalNotes = listOf(
                CulturalNote("Climate agreements",
                    "توافق‌نامه‌های اقلیمی مثل پاریس در غرب مهمن."),
                CulturalNote("Green products",
                    "محصولات سبز در غرب محبوبند.")
            ),
            grammar = listOf(
                GrammarSection("Mixed conditionals",
                    """
                        Past + present: If I had studied more, I would have a better job now.
                        Present + past: If I weren't so busy, I would have helped you yesterday.
                    """.trimIndent()),
                GrammarSection("Modal verbs for responsibility",
                    """
                        We must protect the planet.
                        We should reduce waste.
                        We have to act now.
                        We need to change.
                    """.trimIndent()),
                GrammarSection("Passive for environmental issues",
                    """
                        Forests are being destroyed.
                        Plastic is being thrown away.
                        Emissions must be reduced.
                    """.trimIndent()),
                GrammarSection("Imperatives for action",
                    """
                        Reduce, reuse, recycle.
                        Save energy and water.
                        Don't waste food.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If I would have known...", "If I had known...", "پast perfect لازم است."),
                CommonMistake("We must to act.", "We must act.", "بعد از must فعل ساده."),
                CommonMistake("Plastic is throwing.", "Plastic is being thrown.", "passive: be being + pp.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you think we're doing enough for the environment?", "فکر می‌کنی به‌اندازه کافی برای محیط زیست انجام می‌دیم؟"),
                DialogueLine("B", "Honestly, no. We consume too much.", "صادقانه، نه. زیاد مصرف می‌کنیم."),
                DialogueLine("A", "What should change first?", "اول چی باید عوض بشه؟"),
                DialogueLine("B", "Our mindset. We need to think about future generations.", "طرز فکرمون. باید به نسل‌های آینده فکر کنیم."),
                DialogueLine("A", "If we had acted earlier, we wouldn't be in this situation.", "اگه زودتر اقدام کرده بودیم، الان این وضع نبودیم."),
                DialogueLine("B", "Exactly. But we still have time.", "دقیقاً. ولی هنوز وقت داریم."),
                DialogueLine("A", "What can individuals do?", "افراد چیکار می‌تونن بکنن؟"),
                DialogueLine("B", "Reduce waste, use renewable energy, buy eco-friendly products.", "کاهش زباله، انرژی تجدیدپذیر، محصولات سبز."),
                DialogueLine("A", "What about governments and companies?", "دولت‌ها و شرکت‌ها چطور؟"),
                DialogueLine("B", "They have the biggest responsibility.", "بزرگ‌ترین مسئولیت رو دارن."),
                DialogueLine("A", "Do you think they're doing enough?", "فکر می‌کنی به‌اندازه کافی انجام می‌دن؟"),
                DialogueLine("B", "Not yet. But pressure is growing.", "هنوز نه. ولی فشار در حال افزایشه."),
                DialogueLine("A", "What gives you hope?", "چی بهت امید می‌ده؟"),
                DialogueLine("B", "Young people. They care more and act more.", "جوان‌ها. بیشتر اهمیت می‌دن و بیشتر عمل می‌کنن."),
                DialogueLine("A", "That's encouraging.", "این دلگرم‌کننده‌ست."),
                DialogueLine("B", "It is. Change is coming.", "همین‌طوره. تغییر داره میاد."),
                DialogueLine("A", "We just need to walk the talk.", "فقط باید به حرفمون عمل کنیم."),
                DialogueLine("B", "Exactly. Together we can make a difference.", "دقیقاً. با هم می‌تونیم تفاوت ایجاد کنیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه فکری درباره وضعیت محیط زیست دارد؟", "زیاد مصرف می‌کنیم و کافی نیست."),
                ComprehensionQuestion("B چه چیزی را باید تغییر داد؟", "طرز فکر."),
                ComprehensionQuestion("مسئولیت اصلی به عهده کیست؟", "دولت‌ها و شرکت‌ها."),
                ComprehensionQuestion("B چرا امیدوار است؟", "چون جوان‌ها بیشتر اهمیت می‌دهند.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss environmental responsibility.",
                    "درباره مسئولیت محیط زیستی صحبت کن.",
                    "We should... / It's our responsibility to..."),
                SpeakingTask("Talk about sustainable living.",
                    "درباره زندگی پایدار صحبت کن.",
                    "I try to... / We need to...")
            ),
            writingTasks = listOf(
                WritingTask("Write about environmental responsibility.",
                    "درباره مسئولیت محیط زیستی بنویس.",
                    200,
                    "Use mixed conditionals and modals.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If I ___ studied, I would have a better job now.",
                    listOf("have", "had", "will have", "would"), 1),
                QuizQuestion("Complete: We ___ protect the planet.",
                    listOf("must", "must to", "musts", "musting"), 0),
                QuizQuestion("Complete: Forests ___ being destroyed.",
                    listOf("is", "are", "was", "were"), 1),
                QuizQuestion("What does 'walk the talk' mean?",
                    listOf("راه رفتن", "عمل کردن به حرف", "حرف زدن", "راهنمایی کردن"), 1),
                QuizQuestion("Complete: Plastic is ___ thrown away.",
                    listOf("be", "being", "been", "is"), 1),
                QuizQuestion("Complete: We should ___ waste.",
                    listOf("reduce", "reduces", "reducing", "reduced"), 0),
                QuizQuestion("What does 'leave a footprint' mean?",
                    listOf("ردپا گذاشتن", "راه رفتن", "ساختن", "خراب کردن"), 0),
                QuizQuestion("Complete: Emissions must ___ reduced.",
                    listOf("be", "is", "been", "being"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 8 — Personal Growth
    // ═══════════════════════════════════════════════════════════
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Personal Growth",
            titlePersian = "رشد شخصی",
            objectives = listOf(
                "Discuss personal development",
                "Use wish and regret structures",
                "Talk about goals and self-improvement",
                "Express reflection"
            ),
            vocabulary = listOf(
                VocabWord("growth", "رشد", "/ɡroʊθ/", "noun",
                    "Personal growth takes time.", "رشد شخصی زمان می‌بره."),
                VocabWord("self-awareness", "خودآگاهی", "/ˌself əˈwernəs/", "noun",
                    "Self-awareness is the first step.", "خودآگاهی اولین قدمه."),
                VocabWord("mindset", "ذهنیت", "/ˈmaɪndset/", "noun",
                    "A positive mindset helps.", "ذهنیت مثبت کمک می‌کنه."),
                VocabWord("habit", "عادت", "/ˈhæbɪt/", "noun",
                    "Good habits change lives.", "عادت‌های خوب زندگی رو تغییر می‌دن."),
                VocabWord("discipline", "نظم", "/ˈdɪsəplɪn/", "noun",
                    "Discipline is key to success.", "نظم کلید موفقیته."),
                VocabWord("reflection", "بازنگری", "/rɪˈflekʃən/", "noun",
                    "Take time for reflection.", "برای بازنگری وقت بذار."),
                VocabWord("improvement", "بهبود", "/ɪmˈpruːvmənt/", "noun",
                    "Small improvements matter.", "بهبودهای کوچک مهمن."),
                VocabWord("failure", "شکست", "/ˈfeɪljər/", "noun",
                    "Failure teaches us.", "شکست به ما می‌آموزه."),
                VocabWord("resilience", "تاب‌آوری", "/rɪˈzɪliəns/", "noun",
                    "Resilience helps us recover.", "تاب‌آوری به بهبودی کمک می‌کنه."),
                VocabWord("purpose", "هدف", "/ˈpɜːrpəs/", "noun",
                    "Find your purpose.", "هدفت رو پیدا کن."),
                VocabWord("balance", "تعادل", "/ˈbæləns/", "noun",
                    "Life balance is important.", "تعادل زندگی مهمه."),
                VocabWord("gratitude", "سپاسگزاری", "/ˈɡrætɪtuːd/", "noun",
                    "Practice gratitude daily.", "هر روز سپاسگزاری کن.")
            ),
            idioms = listOf(
                IdiomExpression("turn over a new leaf", "شروع تازه کردن",
                    "He turned over a new leaf this year.", "او امسال یه شروع تازه کرد.", "idiom"),
                IdiomExpression("grow as a person", "به عنوان یک شخص رشد کردن",
                    "Travel helps you grow as a person.", "سفر به رشد شخصی کمک می‌کنه.", "neutral"),
                IdiomExpression("learn the hard way", "با سختی یاد گرفتن",
                    "I learned the hard way.", "با سختی یاد گرفتم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Resilience",
                    "resilience /rɪˈzɪliəns/ — استرس روی zi."),
                PronunciationTip("Gratitude",
                    "gratitude /ˈɡrætɪtuːd/ — سه سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Self-help culture",
                    "فرهنگ خودیاری در غرب خیلی رایجه."),
                CulturalNote("Therapy",
                    "رفتار با تراپی در غرب عادیه.")
            ),
            grammar = listOf(
                GrammarSection("Wish + past simple",
                    """
                        برای آرزوها درباره حال:
                        I wish I had more time.
                        She wishes she could travel more.
                    """.trimIndent()),
                GrammarSection("Wish + past perfect",
                    """
                        برای پشیمانی درباره گذشته:
                        I wish I had studied harder.
                        He wishes he hadn't quit.
                    """.trimIndent()),
                GrammarSection("Regret + verb-ing",
                    """
                        I regret not traveling more.
                        She regrets leaving her job.
                    """.trimIndent()),
                GrammarSection("Present perfect for growth",
                    """
                        I've grown a lot this year.
                        She's become more confident.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I wish I have more time.", "I wish I had more time.", "wish + past simple."),
                CommonMistake("I regret to leave.", "I regret leaving.", "regret + verb-ing."),
                CommonMistake("I wish I didn't do that.", "I wish I hadn't done that.", "برای گذشته: past perfect.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you grown as a person this year?", "امسال به عنوان یه شخص رشد کردی؟"),
                DialogueLine("B", "Definitely. I've learned so much about myself.", "قطعاً. چیزهای زیادی درباره خودم یاد گرفته‌ام."),
                DialogueLine("A", "What helped you grow?", "چی به رشدت کمک کرد؟"),
                DialogueLine("B", "Challenges. I had a hard year, but it made me stronger.", "چالش‌ها. سال سختی داشتم، ولی قوی‌ترم کرد."),
                DialogueLine("A", "I can relate. What do you wish you had done differently?", "می‌فهمم. ای کاش چه کاری متفاوت انجام داده بودی؟"),
                DialogueLine("B", "I wish I had asked for help sooner.", "ای کاش زودتر کمک خواسته بودم."),
                DialogueLine("A", "That's a good lesson. Do you regret anything?", "درس خوبیه. پشیمانی داری؟"),
                DialogueLine("B", "I regret not starting therapy earlier.", "پشیمانم که زودتر تراپی رو شروع نکردم."),
                DialogueLine("A", "It's never too late. What are your goals now?", "هیچ‌وقت دیر نیست. اهدافت الان چیه؟"),
                DialogueLine("B", "To be more present and practice gratitude.", "حاضرتر بودن و سپاسگزاری کردن."),
                DialogueLine("A", "Beautiful goals. Do you have a routine?", "اهداف زیبایی. روتین داری؟"),
                DialogueLine("B", "Yes. I journal every morning and exercise.", "بله. هر صبح ژورنال می‌نویسم و ورزش می‌کنم."),
                DialogueLine("A", "That sounds healthy. What keeps you motivated?", "سالم به نظر می‌رسه. چی بهت انگیزه می‌ده؟"),
                DialogueLine("B", "Remembering why I started.", "یادم میاد چرا شروع کردم."),
                DialogueLine("A", "Well said. Anything you'd tell your younger self?", "خوب گفتی. چیزی هست که به خودتِ جوان‌تر بگی؟"),
                DialogueLine("B", "I'd say: don't be afraid to fail.", "می‌گفتم: از شکست نترس."),
                DialogueLine("A", "That's powerful.", "این قدرتمنده."),
                DialogueLine("B", "Thanks. We all learn the hard way sometimes.", "ممنون. ما همه گاهی با سختی یاد می‌گیریم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور رشد کرده؟", "از طریق چالش‌ها."),
                ComprehensionQuestion("B چه پشیمانی دارد؟", "زودتر کمک نخواستن و تراپی را شروع نکردن."),
                ComprehensionQuestion("اهداف B چیست؟", "حاضرتر بودن و سپاسگزاری."),
                ComprehensionQuestion("B به خود جوان‌ترش چه می‌گوید؟", "از شکست نترس.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about personal growth.",
                    "درباره رشد شخصی صحبت کن.",
                    "I've grown... / I've learned..."),
                SpeakingTask("Express wishes and regrets.",
                    "آرزوها و پشیمانی‌ات را بیان کن.",
                    "I wish... / I regret...")
            ),
            writingTasks = listOf(
                WritingTask("Write about how you've grown in the past year.",
                    "درباره اینکه در سال گذشته چطور رشد کرده‌ای بنویس.",
                    200,
                    "Use wish, regret, and present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I wish I ___ more time.",
                    listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: I wish I ___ studied harder.",
                    listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: I regret ___ my job.",
                    listOf("leave", "leaving", "to leave", "left"), 1),
                QuizQuestion("What does 'turn over a new leaf' mean?",
                    listOf("برگ زدن", "شروع تازه کردن", "برگ ریختن", "کتاب خواندن"), 1),
                QuizQuestion("Complete: I've ___ a lot this year.",
                    listOf("grow", "grew", "grown", "growing"), 2),
                QuizQuestion("What does 'learn the hard way' mean?",
                    listOf("با آسانی یاد گرفتن", "با سختی یاد گرفتن", "به کسی یاد دادن", "درس خواندن"), 1),
                QuizQuestion("Complete: She ___ leaving her job.",
                    listOf("regret", "regrets", "regretting", "regretted"), 1),
                QuizQuestion("Complete: He wishes he ___ quit.",
                    listOf("didn't", "hadn't", "hasn't", "won't"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 9 — Ethics and Choices
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Ethics and Choices",
            titlePersian = "اخلاق و انتخاب‌ها",
            objectives = listOf(
                "Discuss ethical issues",
                "Use advanced conditionals for hypothetical situations",
                "Express moral opinions",
                "Talk about values"
            ),
            vocabulary = listOf(
                VocabWord("ethics", "اخلاق", "/ˈeθɪks/", "noun",
                    "Ethics guide our decisions.", "اخلاق تصمیمات ما را هدایت می‌کند."),
                VocabWord("moral", "اخلاقی", "/ˈmɔːrəl/", "adjective",
                    "It's a moral question.", "یه سؤال اخلاقیه."),
                VocabWord("values", "ارزش‌ها", "/ˈvæljuːz/", "noun",
                    "Values shape our choices.", "ارزش‌ها انتخاب‌های ما را شکل می‌دهند."),
                VocabWord("dilemma", "دوراهی", "/dɪˈlemə/", "noun",
                    "It's an ethical dilemma.", "یه دوراهی اخلاقیه."),
                VocabWord("integrity", "درستکاری", "/ɪnˈteɡrəti/", "noun",
                    "Integrity is important.", "درستکاری مهمه."),
                VocabWord("honest", "صادق", "/ˈɑːnɪst/", "adjective",
                    "Always be honest.", "همیشه صادق باش."),
                VocabWord("fair", "منصفانه", "/fer/", "adjective",
                    "That's not fair.", "این منصفانه نیست."),
                VocabWord("responsibility", "مسئولیت", "/rɪˌspɑːnsəˈbɪləti/", "noun",
                    "We have responsibility to others.", "به دیگران مسئولیت داریم."),
                VocabWord("principle", "اصل", "/ˈprɪnsəpəl/", "noun",
                    "It's a matter of principle.", "موضوع اصولیه."),
                VocabWord("consequence", "پیامد", "/ˈkɑːnsəkwens/", "noun",
                    "Actions have consequences.", "اعمال پیامد دارن."),
                VocabWord("compromise", "سازش", "/ˈkɑːmprəmaɪz/", "noun/verb",
                    "Sometimes we must compromise.", "گاهی باید سازش کنیم."),
                VocabWord("conscience", "وجدان", "/ˈkɑːnʃəns/", "noun",
                    "Listen to your conscience.", "به وجدانت گوش کن.")
            ),
            idioms = listOf(
                IdiomExpression("do the right thing", "کار درست را انجام دادن",
                    "Always try to do the right thing.", "همیشه سعی کن کار درست رو انجام بدی.", "neutral"),
                IdiomExpression("draw the line", "مرز کشیدن",
                    "I draw the line at lying.", "من مرز رو در دروغ کشیدن می‌کشم.", "idiom"),
                IdiomExpression("on the fence", "دودل",
                    "I'm still on the fence about it.", "هنوز درباره‌اش دودلم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Ethics",
                    "ethics /ˈeθɪks/ — th صدای /θ/."),
                PronunciationTip("Integrity",
                    "integrity /ɪnˈteɡrəti/ — استرس روی teg.")
            ),
            culturalNotes = listOf(
                CulturalNote("Business ethics",
                    "اخلاق تجاری در غرب خیلی مهمه."),
                CulturalNote("Golden Rule",
                    "قانون طلایی در همه فرهنگ‌ها وجود داره.")
            ),
            grammar = listOf(
                GrammarSection("Hypothetical situations",
                    """
                        If I found money, I would return it.
                        If she saw something wrong, she would speak up.
                    """.trimIndent()),
                GrammarSection("Past hypotheticals",
                    """
                        If I had known, I would have said something.
                    """.trimIndent()),
                GrammarSection("Modal verbs for moral obligation",
                    """
                        You should be honest.
                        We ought to help others.
                        I must follow my principles.
                    """.trimIndent()),
                GrammarSection("Expressing opinions",
                    """
                        I believe that...
                        In my view...
                        It seems to me that...
                        I'm convinced that...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If I would find...", "If I found...", "شرطی دوم درست."),
                CommonMistake("I must to be honest.", "I must be honest.", "بعد از must فعل ساده."),
                CommonMistake("We should to help.", "We should help.", "بعد از should فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "Would you return money if you found it?", "اگه پول پیدا کنی، برمی‌گردونی؟"),
                DialogueLine("B", "Yes, I would. It's the right thing to do.", "بله، برمی‌گردونم. کار درستیه."),
                DialogueLine("A", "What if it was a lot of money?", "اگه پول زیادی باشه؟"),
                DialogueLine("B", "I'd still return it. My conscience wouldn't let me keep it.", "بازم برمی‌گردونم. وجدانم نمی‌ذاره نگهش دارم."),
                DialogueLine("A", "That's admirable. What about smaller ethical choices?", "تحسین‌برانگیزه. انتخاب‌های اخلاقی کوچک‌تر چطور؟"),
                DialogueLine("B", "Like what?", "مثل چی؟"),
                DialogueLine("A", "Like telling a small lie to avoid hurting someone.", "مثل گفتن یه دروغ کوچک برای اینکه کسی رو ناراحت نکنی."),
                DialogueLine("B", "That's harder. Sometimes honesty hurts.", "این سخت‌تره. گاهی صداقت دردناکه."),
                DialogueLine("A", "Where do you draw the line?", "کجا مرز می‌کشی؟"),
                DialogueLine("B", "I draw the line at lies that cause real harm.", "مرز رو در دروغ‌هایی می‌کشم که آسیب واقعی می‌زنن."),
                DialogueLine("A", "That's a good principle.", "اصل خوبیه."),
                DialogueLine("B", "What about you? What's your moral compass?", "تو چطور؟ قطب‌نمای اخلاقی‌ت چیه؟"),
                DialogueLine("A", "I try to follow the golden rule.", "سعی می‌کنم قانون طلایی رو رعایت کنم."),
                DialogueLine("B", "Treat others as you want to be treated.", "با دیگران طوری رفتار کن که می‌خوای با تو رفتار کنن."),
                DialogueLine("A", "Exactly. It guides most of my decisions.", "دقیقاً. بیشتر تصمیماتم رو هدایت می‌کنه."),
                DialogueLine("B", "That's a beautiful way to live.", "شیوه زندگی زیباییه."),
                DialogueLine("A", "Thanks. It's not always easy, but it's worth it.", "ممنون. همیشه آسان نیست، ولی ارزشش رو داره."),
                DialogueLine("B", "True. Integrity takes courage.", "درسته. درستکاری شجاعت می‌خواد.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B اگر پول پیدا کند چه می‌کند؟", "برمی‌گرداند."),
                ComprehensionQuestion("B کجا مرز می‌کشد؟", "در دروغ‌هایی که آسیب واقعی می‌زنند."),
                ComprehensionQuestion("قانون طلایی چیست؟", "با دیگران طوری رفتار کن که می‌خواهی با تو رفتار کنند."),
                ComprehensionQuestion("درستکاری به چه چیزی نیاز دارد؟", "شجاعت.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss an ethical dilemma.",
                    "درباره یک دوراهی اخلاقی صحبت کن.",
                    "If I..., I would... / It depends on..."),
                SpeakingTask("Talk about your values.",
                    "درباره ارزش‌هایت صحبت کن.",
                    "I believe... / It's important to...")
            ),
            writingTasks = listOf(
                WritingTask("Write about an ethical choice you've faced.",
                    "درباره یک انتخاب اخلاقی که با آن روبرو شده‌ای بنویس.",
                    200,
                    "Use conditionals and modals.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If I ___ money, I would return it.",
                    listOf("find", "found", "will find", "have found"), 1),
                QuizQuestion("Complete: We ___ help others.",
                    listOf("should", "should to", "shoulds", "shoulding"), 0),
                QuizQuestion("Complete: I must ___ honest.",
                    listOf("be", "is", "been", "being"), 0),
                QuizQuestion("What does 'draw the line' mean?",
                    listOf("خط کشیدن", "مرز کشیدن", "نقاشی کردن", "شکستن"), 1),
                QuizQuestion("Complete: If I had known, I ___ said something.",
                    listOf("will have", "would have", "have", "had"), 1),
                QuizQuestion("What does 'on the fence' mean?",
                    listOf("روی نرده", "دودل", "بالا", "پایین"), 1),
                QuizQuestion("Complete: She ___ to be honest.",
                    listOf("ought", "should", "must", "have"), 0),
                QuizQuestion("What does 'do the right thing' mean?",
                    listOf("کار درست را انجام دادن", "کار غلط", "کار سخت", "کار آسان"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 10 — Leadership and Influence
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Leadership and Influence",
            titlePersian = "رهبری و نفوذ",
            objectives = listOf(
                "Discuss leadership qualities",
                "Use cleft sentences for emphasis",
                "Talk about influential people",
                "Express admiration and criticism"
            ),
            vocabulary = listOf(
                VocabWord("leadership", "رهبری", "/ˈliːdərʃɪp/", "noun",
                    "Good leadership inspires.", "رهبری خوب الهام می‌بخشد."),
                VocabWord("influence", "تأثیر", "/ˈɪnfluəns/", "noun/verb",
                    "Leaders influence others.", "رهبران بر دیگران تأثیر می‌گذارند."),
                VocabWord("vision", "بینش", "/ˈvɪʒən/", "noun",
                    "Leaders need vision.", "رهبران به بینش نیاز دارند."),
                VocabWord("inspire", "الهام بخشیدن", "/ɪnˈspaɪər/", "verb",
                    "Great leaders inspire.", "رهبران بزرگ الهام می‌بخشند."),
                VocabWord("motivate", "انگیزه دادن", "/ˈmoʊtɪveɪt/", "verb",
                    "Managers should motivate teams.", "مدیران باید تیم‌ها را انگیزه دهند."),
                VocabWord("responsible", "مسئول", "/rɪˈspɑːnsəbəl/", "adjective",
                    "Leaders are responsible.", "رهبران مسئولند."),
                VocabWord("decision-making", "تصمیم‌گیری", "/dɪˈsɪʒən ˌmeɪkɪŋ/", "noun",
                    "Decision-making takes courage.", "تصمیم‌گیری شجاعت می‌خواهد."),
                VocabWord("team", "تیم", "/tiːm/", "noun",
                    "Great teams achieve more.", "تیم‌های عالی بیشتر دست می‌یابند."),
                VocabWord("role model", "الگو", "/roʊl ˈmɑːdəl/", "noun",
                    "She's my role model.", "او الگوی منه."),
                VocabWord("integrity", "درستکاری", "/ɪnˈteɡrəti/", "noun",
                    "Leaders need integrity.", "رهبران به درستکاری نیاز دارند."),
                VocabWord("courage", "شجاعت", "/ˈkɜːrɪdʒ/", "noun",
                    "Courage defines leaders.", "شجاعت رهبران را مشخص می‌کند."),
                VocabWord("delegate", "واگذار کردن", "/ˈdelɪɡeɪt/", "verb",
                    "Good leaders delegate.", "رهبران خوب واگذار می‌کنند.")
            ),
            idioms = listOf(
                IdiomExpression("lead by example", "با مثال رهبری کردن",
                    "Great leaders lead by example.", "رهبران بزرگ با مثال رهبری می‌کنند.", "neutral"),
                IdiomExpression("take the lead", "پیشقدم شدن",
                    "She took the lead on the project.", "او در پروژه پیشقدم شد.", "neutral"),
                IdiomExpression("step up", "قدم پیش گذاشتن",
                    "He stepped up when it mattered.", "او وقتی مهم بود قدم پیش گذاشت.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Leadership",
                    "leadership /ˈliːdərʃɪp/ — استرس روی lea."),
                PronunciationTip("Influence",
                    "influence /ˈɪnfluəns/ — استرس روی in.")
            ),
            culturalNotes = listOf(
                CulturalNote("Leadership styles",
                    "سبک‌های رهبری در غرب متفاوتن."),
                CulturalNote("Servant leadership",
                    "رهبری خدمتگزار در غرب یک رویکرد محبوبه.")
            ),
            grammar = listOf(
                GrammarSection("Cleft sentences with 'it'",
                    """
                        It was his honesty that impressed me.
                        It's her vision that matters.
                    """.trimIndent()),
                GrammarSection("Cleft sentences with 'what'",
                    """
                        What I admire is his courage.
                        What leaders need is empathy.
                    """.trimIndent()),
                GrammarSection("Passive for influence",
                    """
                        Great leaders are respected by everyone.
                        The decision was made by the team.
                    """.trimIndent()),
                GrammarSection("Expressing admiration",
                    """
                        I really admire...
                        What I find impressive is...
                        I'm inspired by...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("It was his honesty what impressed me.", "It was his honesty that impressed me.", "it-cleft با that."),
                CommonMistake("What I admire is his courage.", "What I admire is his courage.", "این درسته."),
                CommonMistake("Great leaders are respecting.", "Great leaders are respected.", "passive: be + pp.")
            ),
            conversation = listOf(
                DialogueLine("A", "Who's a leader you admire?", "کدوم رهبر رو تحسین می‌کنی؟"),
                DialogueLine("B", "I really admire Nelson Mandela.", "واقعاً نلسون ماندلا رو تحسین می‌کنم."),
                DialogueLine("A", "What impresses you most about him?", "چی بیشتر در موردش تو رو تحت تأثیر قرار می‌ده؟"),
                DialogueLine("B", "It's his integrity and forgiveness that inspire me.", "درستکاری و بخشش او به من الهام می‌بخشه."),
                DialogueLine("A", "That's powerful. What qualities make a great leader?", "این قدرتمنده. چه ویژگی‌هایی یه رهبر بزرگ می‌سازه؟"),
                DialogueLine("B", "Vision, empathy, courage, and integrity.", "بینش، همدلی، شجاعت و درستکاری."),
                DialogueLine("A", "Do you think leaders are born or made?", "فکر می‌کنی رهبران به دنیا میان یا ساخته می‌شن؟"),
                DialogueLine("B", "A bit of both. Some traits are innate, but skills can be learned.", "کمی هر دو. بعضی ویژگی‌ها فطری‌ان، ولی مهارت‌ها یاد گرفته می‌شن."),
                DialogueLine("A", "What skills can be learned?", "چه مهارت‌هایی یاد گرفته می‌شن؟"),
                DialogueLine("B", "Communication, decision-making, delegation.", "ارتباط، تصمیم‌گیری، واگذاری."),
                DialogueLine("A", "Do you consider yourself a leader?", "خودت رو رهبر می‌دونی؟"),
                DialogueLine("B", "In some ways. I try to lead by example.", "از بعضی جهات. سعی می‌کنم با مثال رهبری کنم."),
                DialogueLine("A", "That's a great approach.", "رویکرد عالییه."),
                DialogueLine("B", "Thanks. What about you?", "ممنون. تو چطور؟"),
                DialogueLine("A", "I try to step up when needed.", "سعی می‌کنم وقتی لازمه قدم پیش بذارم."),
                DialogueLine("B", "That's what matters. Leadership isn't about titles.", "همین مهمه. رهبری درباره عناوین نیست."),
                DialogueLine("A", "Exactly. It's about impact.", "دقیقاً. درباره تأثیره."),
                DialogueLine("B", "Well said. We can all lead in our own way.", "خوب گفتی. همه ما می‌تونیم به روش خودمون رهبری کنیم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه کسی را تحسین می‌کند؟", "نلسون ماندلا."),
                ComprehensionQuestion("چه چیزی در ماندلا به B الهام می‌بخشد؟", "درستکاری و بخشش."),
                ComprehensionQuestion("ویژگی‌های یک رهبر بزرگ چیست؟", "بینش، همدلی، شجاعت، درستکاری."),
                ComprehensionQuestion("B چگونه رهبری می‌کند؟", "با مثال.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss qualities of a great leader.",
                    "درباره ویژگی‌های یک رهبر بزرگ صحبت کن.",
                    "A great leader is... / What I admire is..."),
                SpeakingTask("Talk about someone who influenced you.",
                    "درباره کسی که بر تو تأثیر گذاشت صحبت کن.",
                    "I admire... / What inspires me is...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a leader you admire.",
                    "درباره رهبری که تحسینش می‌کنی بنویس.",
                    200,
                    "Use cleft sentences and passive.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: It was his honesty ___ impressed me.",
                    listOf("what", "that", "who", "which"), 1),
                QuizQuestion("Complete: What I admire ___ his courage.",
                    listOf("is", "are", "was", "were"), 0),
                QuizQuestion("Complete: Great leaders ___ respected.",
                    listOf("are", "is", "was", "were"), 0),
                QuizQuestion("What does 'lead by example' mean?",
                    listOf("با مثال رهبری کردن", "با حرف رهبری کردن", "پیروی کردن", "راهنمایی کردن"), 0),
                QuizQuestion("Complete: The decision was ___ by the team.",
                    listOf("make", "made", "making", "makes"), 1),
                QuizQuestion("What does 'step up' mean?",
                    listOf("بالا رفتن", "قدم پیش گذاشتن", "پایین آمدن", "راه رفتن"), 1),
                QuizQuestion("Complete: She took the ___ on the project.",
                    listOf("lead", "leader", "leading", "leads"), 0),
                QuizQuestion("Complete: The team was ___ by her.",
                    listOf("led", "lead", "leading", "leads"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 11 — The Arts and Culture
    // ═══════════════════════════════════════════════════════════
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "The Arts and Culture",
            titlePersian = "هنر و فرهنگ",
            objectives = listOf(
                "Discuss art and culture",
                "Use inversion for emphasis",
                "Talk about cultural experiences",
                "Express appreciation"
            ),
            vocabulary = listOf(
                VocabWord("art", "هنر", "/ɑːrt/", "noun",
                    "Art expresses emotions.", "هنر احساسات را بیان می‌کند."),
                VocabWord("culture", "فرهنگ", "/ˈkʌltʃər/", "noun",
                    "Culture shapes identity.", "فرهنگ هویت را شکل می‌دهد."),
                VocabWord("tradition", "سنت", "/trəˈdɪʃən/", "noun",
                    "Traditions connect generations.", "سنت‌ها نسل‌ها را به هم وصل می‌کنند."),
                VocabWord("performance", "اجرا", "/pərˈfɔːrməns/", "noun",
                    "The performance was amazing.", "اجرا فوق‌العاده بود."),
                VocabWord("exhibition", "نمایشگاه", "/ˌeksɪˈbɪʃən/", "noun",
                    "We visited an art exhibition.", "از یه نمایشگاه هنری بازدید کردیم."),
                VocabWord("heritage", "میراث", "/ˈherɪtɪdʒ/", "noun",
                    "Cultural heritage is precious.", "میراث فرهنگی ارزشمنده."),
                VocabWord("creative", "خلاق", "/kriˈeɪtɪv/", "adjective",
                    "Artists are creative.", "هنرمندان خلاقند."),
                VocabWord("inspire", "الهام بخشیدن", "/ɪnˈspaɪər/", "verb",
                    "Art inspires people.", "هنر به مردم الهام می‌بخشد."),
                VocabWord("masterpiece", "شاهکار", "/ˈmæstərpiːs/", "noun",
                    "This is a masterpiece.", "این یه شاهکاره."),
                VocabWord("perform", "اجرا کردن", "/pərˈfɔːrm/", "verb",
                    "She performs beautifully.", "او زیبا اجرا می‌کند."),
                VocabWord("appreciate", "قدردانی کردن", "/əˈpriːʃieɪt/", "verb",
                    "We should appreciate art.", "باید هنر رو قدردانی کنیم."),
                VocabWord("audience", "مخاطب", "/ˈɔːdiəns/", "noun",
                    "The audience loved it.", "مخاطب عاشقش شد.")
            ),
            idioms = listOf(
                IdiomExpression("state of the art", "پیشرفته‌ترین",
                    "The museum has state-of-the-art technology.", "موزه پیشرفته‌ترین تکنولوژی رو داره.", "neutral"),
                IdiomExpression("food for thought", "مایه تفکر",
                    "The film gave me food for thought.", "فیلم به من مایه تفکر داد.", "idiom"),
                IdiomExpression("a work of art", "اثر هنری",
                    "This building is a work of art.", "این ساختمان یه اثر هنریه.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Exhibition",
                    "exhibition /ˌeksɪˈbɪʃən/ — استرس روی bi."),
                PronunciationTip("Masterpiece",
                    "masterpiece /ˈmæstərpiːs/ — استرس روی mas.")
            ),
            culturalNotes = listOf(
                CulturalNote("Museums",
                    "موزه‌ها در غرب بخش مهمی از فرهنگند."),
                CulturalNote("Cultural heritage",
                    "حفاظت از میراث فرهنگی در غرب اولویت داره.")
            ),
            grammar = listOf(
                GrammarSection("Inversion for emphasis",
                    """
                        Rarely have I seen such beauty.
                        Never before had we experienced this.
                        Not only is it beautiful, but it's also meaningful.
                    """.trimIndent()),
                GrammarSection("Passive for art",
                    """
                        The painting was created in 1900.
                        The symphony has been performed many times.
                        Masterpieces are protected by museums.
                    """.trimIndent()),
                GrammarSection("Expressing appreciation",
                    """
                        I really appreciate...
                        It's truly remarkable.
                        What a masterpiece!
                    """.trimIndent()),
                GrammarSection("Cleft sentences for art",
                    """
                        What impressed me was the colors.
                        It was the music that moved me.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The painting was create in 1900.", "The painting was created in 1900.", "past participle."),
                CommonMistake("It was the music what moved me.", "It was the music that moved me.", "it-cleft با that."),
                CommonMistake("Rarely I have seen...", "Rarely have I seen...", "inversion نیاز داره.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you enjoy art?", "از هنر لذت می‌بری؟"),
                DialogueLine("B", "Very much. It's food for thought.", "خیلی زیاد. مایه تفکره."),
                DialogueLine("A", "What kind of art do you like?", "چه نوع هنری دوست داری؟"),
                DialogueLine("B", "I love paintings and music. What about you?", "عاشق نقاشی و موسیقیم. تو چطور؟"),
                DialogueLine("A", "I enjoy theater and dance.", "از تئاتر و رقص لذت می‌برم."),
                DialogueLine("B", "Have you seen any good performances lately?", "اخیراً اجرای خوبی دیدی؟"),
                DialogueLine("A", "Yes, I saw a play last month. It was remarkable.", "بله، ماه پیش یه نمایش دیدم. فوق‌العاده بود."),
                DialogueLine("B", "What impressed you most?", "چی بیشتر تو رو تحت تأثیر قرار داد؟"),
                DialogueLine("A", "It was the acting that moved me.", "بازیگری بود که منو تحت تأثیر قرار داد."),
                DialogueLine("B", "Rarely do we see such talent.", "به‌ندرت چنین استعدادی می‌بینیم."),
                DialogueLine("A", "Exactly. What about museums?", "دقیقاً. موزه‌ها چطور؟"),
                DialogueLine("B", "I love them. Cultural heritage is precious.", "عاشقشونم. میراث فرهنگی ارزشمنده."),
                DialogueLine("A", "Which museum is your favorite?", "کدوم موزه مورد علاقه‌اته؟"),
                DialogueLine("B", "The Louvre. It's a masterpiece itself.", "لوور. خودش یه شاهکاره."),
                DialogueLine("A", "I'd love to go. What should I see first?", "دوست دارم برم. اول چی ببینم؟"),
                DialogueLine("B", "Start with the Mona Lisa. But don't rush.", "با مونالیزا شروع کن. ولی عجله نکن."),
                DialogueLine("A", "Thanks for the tip.", "ممنون برای راهنمایی."),
                DialogueLine("B", "Anytime. Art is meant to be appreciated slowly.", "هر وقت. هنر باید آروم قدردانی بشه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه نوع هنری را دوست دارد؟", "نقاشی و موسیقی."),
                ComprehensionQuestion("A از چه چیزی در نمایش لذت برد؟", "بازیگری."),
                ComprehensionQuestion("موزه مورد علاقه B چیست؟", "لوور."),
                ComprehensionQuestion("B چه توصیه‌ای برای دیدن هنر دارد؟", "آروم قدردانی کن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss your favorite art form.",
                    "درباره هنر مورد علاقه‌ات صحبت کن.",
                    "I love... / What impresses me is..."),
                SpeakingTask("Talk about a cultural experience.",
                    "درباره یک تجربه فرهنگی صحبت کن.",
                    "I visited... / It was...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a cultural experience that changed you.",
                    "درباره یک تجربه فرهنگی که تو را تغییر داد بنویس.",
                    200,
                    "Use inversion and cleft sentences.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The painting was ___ in 1900.",
                    listOf("create", "created", "creating", "creates"), 1),
                QuizQuestion("Complete: It was the music ___ moved me.",
                    listOf("what", "that", "who", "which"), 1),
                QuizQuestion("Complete: Rarely ___ I seen such beauty.",
                    listOf("have", "has", "had", "having"), 0),
                QuizQuestion("What does 'food for thought' mean?",
                    listOf("غذا برای فکر", "مایه تفکر", "فکر کردن", "غذا خوردن"), 1),
                QuizQuestion("Complete: Masterpieces are ___ by museums.",
                    listOf("protect", "protected", "protecting", "protects"), 1),
                QuizQuestion("What does 'state of the art' mean?",
                    listOf("وضعیت هنر", "پیشرفته‌ترین", "هنری", "قدیمی"), 1),
                QuizQuestion("Complete: Not only ___ it beautiful, but meaningful.",
                    listOf("is", "are", "was", "were"), 0),
                QuizQuestion("What does 'a work of art' mean?",
                    listOf("اثر هنری", "کار کردن", "هنر", "شغل"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 12 — Review and Future Self
    // ═══════════════════════════════════════════════════════════
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review and Future Self",
            titlePersian = "مرور و خودِ آینده",
            objectives = listOf(
                "Review all advanced grammar",
                "Reflect on your learning journey",
                "Set future goals",
                "Prepare for real-world English"
            ),
            vocabulary = listOf(
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun",
                    "Learning is a journey.", "یادگیری یه سفره."),
                VocabWord("milestone", "نقطه عطف", "/ˈmaɪlstoʊn/", "noun",
                    "Each milestone matters.", "هر نقطه عطف مهمه."),
                VocabWord("reflect", "بازنگری کردن", "/rɪˈflekt/", "verb",
                    "Reflect on your progress.", "به پیشرفتت بازنگری کن."),
                VocabWord("achieve", "دست یافتن", "/əˈtʃiːv/", "verb",
                    "You can achieve anything.", "می‌تونی به هر چیزی دست یابی."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "Set clear goals.", "اهداف واضح تعیین کن."),
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun",
                    "The future is yours.", "آینده مال توئه."),
                VocabWord("potential", "پتانسیل", "/pəˈtenʃəl/", "noun",
                    "Reach your full potential.", "به پتانسیل کاملت برس."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective",
                    "You should feel confident.", "باید با اعتماد به نفس باشی."),
                VocabWord("fluent", "روان", "/ˈfluːənt/", "adjective",
                    "You'll become fluent with practice.", "با تمرین روان می‌شی."),
                VocabWord("determined", "مصمم", "/dɪˈtɜːrmɪnd/", "adjective",
                    "Stay determined.", "مصمم بمون."),
                VocabWord("grateful", "سپاسگزار", "/ˈɡreɪtfəl/", "adjective",
                    "Be grateful for the journey.", "برای سفر سپاسگزار باش."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb",
                    "Continue learning always.", "همیشه یادگیری رو ادامه بده.")
            ),
            idioms = listOf(
                IdiomExpression("come a long way", "پیشرفت زیادی کردن",
                    "You've come a long way.", "خیلی پیشرفت کرده‌ای.", "informal"),
                IdiomExpression("the sky's the limit", "محدودیتی وجود ندارد",
                    "With English, the sky's the limit.", "با انگلیسی، محدودیتی وجود نداره.", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد",
                    "Keep going. Rome wasn't built in a day.", "ادامه بده. رم در یک روز ساخته نشد.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Intonation",
                    "در سؤال‌ها صدای پایان جمله بالا می‌رود."),
                PronunciationTip("Linking",
                    "در گفتار طبیعی، کلمات به هم می‌چسبند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Lifelong learning",
                    "یادگیری مادام‌العمر در غرب ارزشمنده."),
                CulturalNote("Growth mindset",
                    "ذهنیت رشد در غرب ترویج می‌شه.")
            ),
            grammar = listOf(
                GrammarSection("Review: All conditionals",
                    """
                        First: If I study, I will pass.
                        Second: If I studied, I would pass.
                        Third: If I had studied, I would have passed.
                    """.trimIndent()),
                GrammarSection("Review: Passive voice",
                    """
                        The book was written in 2020.
                        The project has been completed.
                        The report will be published.
                    """.trimIndent()),
                GrammarSection("Review: Reported speech",
                    """
                        She said she was tired.
                        He told me he would help.
                        They asked if I was ready.
                    """.trimIndent()),
                GrammarSection("Review: Wish and inversion",
                    """
                        I wish I had more time.
                        Rarely have I seen such progress.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If I would have known...", "If I had known...", "third conditional."),
                CommonMistake("He said me...", "He told me...", "tell + object."),
                CommonMistake("I wish I have...", "I wish I had...", "wish + past simple.")
            ),
            conversation = listOf(
                DialogueLine("A", "How do you feel about your English journey?", "درباره سفر انگلیسی‌ات چه حسی داری؟"),
                DialogueLine("B", "Proud. I've come a long way.", "افتخار. خیلی پیشرفت کرده‌ام."),
                DialogueLine("A", "What was the hardest part?", "سخت‌ترین قسمت چی بود؟"),
                DialogueLine("B", "Probably the advanced grammar, especially conditionals.", "احتمالاً گرامر پیشرفته، خصوصاً شرطی‌ها."),
                DialogueLine("A", "And what helped most?", "و چی بیشتر کمک کرد؟"),
                DialogueLine("B", "Consistent practice and real conversations.", "تمرین پیوسته و مکالمات واقعی."),
                DialogueLine("A", "What's your next goal?", "هدف بعدی‌ت چیه؟"),
                DialogueLine("B", "To become fully fluent and use English professionally.", "کاملاً روان شدن و استفاده حرفه‌ای از انگلیسی."),
                DialogueLine("A", "That's a great goal. Any advice for other learners?", "هدف عالیه. توصیه‌ای برای دیگر زبان‌آموزان داری؟"),
                DialogueLine("B", "Be patient, be consistent, and don't fear mistakes.", "صبور باش، پیوسته باش و از اشتباه نترس."),
                DialogueLine("A", "Wise words. Do you have a favorite quote?", "حرف‌های حکیمانه. نقل قول مورد علاقه داری؟"),
                DialogueLine("B", "The sky's the limit with English.", "با انگلیسی محدودیتی وجود نداره."),
                DialogueLine("A", "I love that. What will you do next?", "دوستش دارم. بعدش چیکار می‌کنی؟"),
                DialogueLine("B", "I'll keep reading, watching, and speaking.", "خوندن، تماشا کردن و صحبت کردن رو ادامه می‌دم."),
                DialogueLine("A", "That's the way. Rome wasn't built in a day.", "همینه راهش. رم در یک روز ساخته نشد."),
                DialogueLine("B", "Exactly. I'm in it for the long run.", "دقیقاً. برای بلندمدت ادامه می‌دم."),
                DialogueLine("A", "Well said. Congratulations on your progress!", "خوب گفتی. تبریک برای پیشرفتت!"),
                DialogueLine("B", "Thank you. And thanks for all your support.", "ممنون. و ممنون برای همه حمایتت.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B درباره مسیر یادگیری‌اش چه احساسی دارد؟", "افتخار."),
                ComprehensionQuestion("سخت‌ترین قسمت چیست؟", "گرامر پیشرفته، خصوصاً شرطی‌ها."),
                ComprehensionQuestion("هدف بعدی B چیست؟", "روان شدن و استفاده حرفه‌ای از انگلیسی."),
                ComprehensionQuestion("B چه توصیه‌ای برای زبان‌آموزان دیگر دارد؟", "صبور، پیوسته و بدون ترس از اشتباه.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Reflect on your English learning journey.",
                    "به مسیر یادگیری انگلیسی‌ات بازنگری کن.",
                    "I've learned... / I've come a long way..."),
                SpeakingTask("Talk about your future goals with English.",
                    "درباره اهداف آینده‌ات با انگلیسی صحبت کن.",
                    "I want to... / I'll...")
            ),
            writingTasks = listOf(
                WritingTask("Write a letter to your future self about your English goals.",
                    "نامهای به خودِ آینده‌ات درباره اهداف انگلیسی‌ات بنویس.",
                    250,
                    "Use all advanced grammar you've learned.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If I had known, I ___ told you.",
                    listOf("will have", "would have", "have", "had"), 1),
                QuizQuestion("Complete: He ___ me he was busy.",
                    listOf("said", "told", "spoke", "talked"), 1),
                QuizQuestion("Complete: I wish I ___ more time.",
                    listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: Rarely ___ I seen such progress.",
                    listOf("have", "has", "had", "having"), 0),
                QuizQuestion("What does 'come a long way' mean?",
                    listOf("راه طولانی", "پیشرفت زیادی کردن", "دور رفتن", "بازگشت"), 1),
                QuizQuestion("Complete: The project has been ___.",
                    listOf("complete", "completed", "completing", "completes"), 1),
                QuizQuestion("What does 'the sky's the limit' mean?",
                    listOf("آسمان محدوده", "محدودیتی وجود ندارد", "بالا رفتن", "پرواز کردن"), 1),
                QuizQuestion("Complete: If I studied, I ___ pass.",
                    listOf("will", "would", "had", "have"), 1)
            )
        )
    }
}