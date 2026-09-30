package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Passages 2 — Complete Course Content
 * 12 Units | Advanced (C1)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles and grammar points match the official Cambridge Scope & Sequence
 */
object Passages2 {
    const val BOOK_ID = "passages_2"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> unit1()
        2 -> unit2()
        3 -> unit3()
        4 -> unit4()
        5 -> unit5()
        6 -> unit6()
        7 -> unit7()
        8 -> unit8()
        9 -> unit9()
        10 -> unit10()
        11 -> unit11()
        12 -> unit12()
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

    // ═══════════════════════════════════════════════════════════════
    // UNIT 1 — Relationships | روابط
    // Lesson A: The best of friends / Lesson B: Make new friends, but keep the old
    // ═══════════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "Relationships", "روابط",
        listOf("Discuss friendship qualities", "Use phrasal verbs about relationships", "Talk about maintaining friendships", "Express opinions about loyalty"),
        listOf(
            v("loyalty", "وفاداری", "Loyalty is essential in friendship.", "وفاداری در دوستی ضروری است."),
            v("betray", "خیانت کردن", "He betrayed my trust.", "او به اعتمادم خیانت کرد.", "v"),
            v("stand by", "حمایت کردن", "True friends stand by you.", "دوستان واقعی حمایتت می‌کنند.", "v"),
            v("drift apart", "از هم دور شدن", "We drifted apart after college.", "بعد از دانشگاه از هم دور شدیم.", "v"),
            v("confide in", "راز گفتن به", "I confide in my best friend.", "به بهترین دوستم راز می‌گویم.", "v"),
            v("mutual respect", "احترام متقابل", "We have mutual respect.", "احترام متقابل داریم."),
            v("unconditional", "بی‌قید و شرط", "Her support is unconditional.", "حمایتش بی‌قید و شرط است.", "adj"),
            v("superficial", "سطحی", "It was a superficial friendship.", "دوستی سطحی بود.", "adj"),
            v("genuine", "اصیل", "He's a genuine friend.", "او دوست اصیلی است.", "adj"),
            v("hang on to", "حفظ کردن", "Hang on to your old friends.", "دوستان قدیمی‌ات را حفظ کن.", "v"),
            v("run into trouble", "به مشکل خوردن", "He ran into trouble last year.", "سال گذشته به مشکل خورد."),
            v("bring out the best", "بهترین را بیرون کشیدن", "She brings out the best in me.", "او بهترین را از من بیرون می‌کشد."),
            v("have in common", "وجه اشتراک داشتن", "We have a lot in common.", "وجه اشتراک زیادی داریم."),
            v("grow apart", "از هم فاصله گرفتن", "We grew apart over the years.", "در طول سال‌ها از هم فاصله گرفتیم.", "v"),
            v("support system", "سیستم حمایتی", "Friends are my support system.", "دوستان سیستم حمایتی من هستند.")
        ),
        listOf(
            GrammarSection("Phrasal verbs (separable and inseparable)", "Bring out the best in someone. Hang on to old friends. Run into trouble. Drift apart."),
            GrammarSection("Gerund and infinitive constructions", "Verbs followed by gerunds: enjoy, avoid, consider. Verbs followed by infinitives: expect, hope, promise."),
            GrammarSection("Verbs followed by either gerund or infinitive", "start, begin, continue, like, love, prefer. I started taking/to take a class."),
            GrammarSection("Adjectives for describing friendships", "loyal, supportive, genuine, unconditional, superficial, toxic.")
        ),
        listOf(
            d("A", "Hey Maria! It's been a while. How have you been?", "هی ماریا! مدتی گذشته. چطور بوده‌ای؟"),
            d("B", "Ali! I've been good. Busy with work, but good. What about you?", "علی! خوب بوده‌ام. با کار مشغول، ولی خوب. تو چطور؟"),
            d("A", "Same here. I've been thinking a lot about friendships lately.", "من هم همینطور. اخیراً زیاد به دوستی‌ها فکر کرده‌ام."),
            d("B", "Really? What brought that on?", "واقعاً؟ چه چیزی باعثش شد؟"),
            d("A", "I ran into an old friend last week. We drifted apart years ago.", "هفته پیش یک دوست قدیمی را دیدم. سال‌ها پیش از هم دور شده بودیم."),
            d("B", "That must have been emotional. How was it?", "باید احساسی بوده باشد. چطور بود؟"),
            d("A", "It was actually wonderful. We picked up right where we left off.", "راستش شگفت‌انگیز بود. دقیقاً از همان جایی که رها کرده بودیم ادامه دادیم."),
            d("B", "That's the mark of a true friendship. You can go years without talking.", "این نشانه دوستی واقعی است. می‌توانی سال‌ها بدون صحبت کردن بگذرانی."),
            d("A", "Exactly. What do you think makes a friendship last?", "دقیقاً. فکر می‌کنی چه چیزی باعث دوام دوستی می‌شود؟"),
            d("B", "Loyalty, definitely. And mutual respect. You have to stand by each other.", "وفاداری، قطعاً. و احترام متقابل. باید حمایت هم باشید."),
            d("A", "I agree. I've had friends who were only there when things were good.", "موافقم. دوستانی داشته‌ام که فقط وقتی همه چیز خوب بود حضور داشتند."),
            d("B", "That's the worst. Those are superficial friendships. They don't last.", "بدترین حالت است. آن‌ها دوستی‌های سطحی هستند. دوام نمی‌آورند."),
            d("A", "True. I've learned to value the ones who bring out the best in me.", "درست. یاد گرفته‌ام برای کسانی که بهترین را از من بیرون می‌کشند ارزش قائل شوم."),
            d("B", "That's a beautiful way to put it. Who does that for you?", "روش زیبایی برای بیانش است. چه کسی این کار را برایت می‌کند؟"),
            d("A", "My friend Reza, actually. He's always honest with me, even when it's hard.", "راستش دوستم رضا. همیشه با من صادق است، حتی وقتی سخت است."),
            d("B", "That's genuine friendship. Honesty is so important.", "این دوستی اصیل است. صداقت خیلی مهم است."),
            d("A", "Exactly. What about you? Do you have a friend like that?", "دقیقاً. تو چطور؟ دوستی مثل آن داری؟"),
            d("B", "Yes, my friend Sara. She's my support system. I can confide in her about anything.", "بله، دوستم سارا. او سیستم حمایتی من است. می‌توانم درباره هر چیزی به او راز بگویم."),
            d("A", "That's wonderful. Have you ever had a friendship end badly?", "شگفت‌انگیز است. هیچ‌وقت دوستی‌ات بد تمام شده؟"),
            d("B", "Yes, unfortunately. A close friend betrayed my trust a few years ago.", "بله، متأسفانه. یک دوست نزدیک چند سال پیش به اعتمادم خیانت کرد."),
            d("A", "That must have been painful. How did you handle it?", "باید دردناک بوده باشد. چطور برخورد کردی؟"),
            d("B", "I was devastated at first. But I learned to forgive and move on.", "اولش ویران شدم. ولی یاد گرفتم ببخشم و ادامه دهم."),
            d("A", "That takes strength. Do you still keep in touch with that person?", "قدرت می‌خواهد. هنوز با آن شخص در تماس هستی؟"),
            d("B", "No, we grew apart completely. Some friendships just run their course.", "نه، کاملاً از هم دور شدیم. برخی دوستی‌ها فقط دوره‌شان تمام می‌شود."),
            d("A", "True. But it's sad when they end. Do you ever regret it?", "درست. ولی وقتی تمام می‌شوند غمگین‌کننده است. هیچ‌وقت پشیمان شده‌ای؟"),
            d("B", "Sometimes. But I've learned that not all friendships are meant to last forever.", "گاهی. ولی یاد گرفته‌ام که همه دوستی‌ها قرار نیست تا ابد بمانند."),
            d("A", "That's a wise perspective. What do you think is the key to making new friends?", "دیدگاه عاقلانه‌ای است. فکر می‌کنی کلید دوست یابی جدید چیست؟"),
            d("B", "Being open and genuine. And not being afraid to be the first one to reach out.", "باز و اصیل بودن. و نترسیدن از اینکه اولین نفر برای تماس باشی."),
            d("A", "That's true. I've made some great friends just by starting conversations.", "درست است. با شروع مکالمات دوستان عالی‌ای پیدا کرده‌ام."),
            d("B", "Exactly. What qualities do you look for in a new friend?", "دقیقاً. چه ویژگی‌هایی در دوست جدید جستجو می‌کنی؟"),
            d("A", "Kindness, honesty, and a good sense of humor. What about you?", "مهربانی، صداقت، و حس شوخ‌طبعی خوب. تو چطور؟"),
            d("B", "Similar. I also value people who are supportive and non-judgmental.", "مشابه. برای افرادی که حمایتگر و غیرقضاوتگر هستند هم ارزش قائلم."),
            d("A", "Those are important. It's hard to be vulnerable with someone who judges you.", "آن‌ها مهم هستند. سخت است با کسی که قضاوتت می‌کند آسیب‌پذیر باشی."),
            d("B", "Exactly. Have you made any new friends recently?", "دقیقاً. اخیراً دوست جدیدی پیدا کرده‌ای؟"),
            d("A", "A few, actually. I joined a book club and met some interesting people.", "راستش چند تا. به یک باشگاه کتاب پیوستم و افراد جالبی دیدم."),
            d("B", "That's a great way to meet people with similar interests.", "روش عالی‌ای برای دیدن افراد با علایق مشابه است."),
            d("A", "It is. We have a lot in common, which makes it easy to connect.", "هست. وجه اشتراک زیادی داریم، که ارتباط را آسان می‌کند."),
            d("B", "That's the best foundation for friendship. Shared interests and values.", "بهترین پایه برای دوستی است. علایق و ارزش‌های مشترک."),
            d("A", "I agree. Well, I should go. It was great catching up with you.", "موافقم. خب، باید بروم. عالی بود که با تو گپ زدم."),
            d("B", "You too, Ali. Let's not wait so long next time.", "تو هم، علی. بیایید دفعه بعد اینقدر صبر نکنیم."),
            d("A", "Definitely. Take care, Maria!", "قطعاً. مراقب خودت باش، ماریا!"),
            d("B", "You too! Bye!", "تو هم! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What happened when Ali ran into his old friend?", "They picked up right where they left off."),
            q("What does Maria value most in a friendship?", "Loyalty and mutual respect."),
            q("What happened to Maria's close friend?", "The friend betrayed her trust."),
            q("What is the key to making new friends according to Maria?", "Being open, genuine, and not afraid to reach out."),
            q("A friend is someone who ___ the best in you.", listOf("brings out", "brings in", "brings up"), 0),
            q("True friends don't ___ apart.", listOf("drift", "drive", "draw"), 0),
            q("I never expected ___ so many people.", listOf("meet", "to meet", "meeting"), 1),
            q("They're considering ___ a new club.", listOf("start", "to start", "starting"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Pick up where you left off", "از همان جا ادامه دادن", "We picked up where we left off.", "از همان جا که رها کرده بودیم ادامه دادیم."),
            IdiomExpression("Stand by someone", "حمایت کردن از کسی", "True friends stand by you.", "دوستان واقعی حمایتت می‌کنند."),
            IdiomExpression("Run its course", "دوره‌اش تمام شدن", "Some friendships run their course.", "برخی دوستی‌ها دوره‌شان تمام می‌شود."),
            IdiomExpression("Bring out the best in someone", "بهترین را از کسی بیرون کشیدن", "She brings out the best in me.", "او بهترین را از من بیرون می‌کشد.")
        ),
        phrasal = listOf(
            PhrasalVerb("hang on to", "حفظ کردن", "keep", "Hang on to your old friends.", "دوستان قدیمی‌ات را حفظ کن.", "Yes"),
            PhrasalVerb("drift apart", "از هم دور شدن", "become distant", "We drifted apart.", "از هم دور شدیم.", "No"),
            PhrasalVerb("confide in", "راز گفتن به", "trust with secrets", "I confide in her.", "به او راز می‌گویم.", "No"),
            PhrasalVerb("bring out", "بیرون کشیدن", "reveal", "He brings out the best in me.", "او بهترین را از من بیرون می‌کشد.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Phrasal verb stress", "HANG on to, DRIFT apart, conFIDE in, BRING out."),
            PronunciationTip("Gerund vs. infinitive", "I ENjoy MEETing people. I exPECT to MEET them."),
            PronunciationTip("Linking sounds", "bring_out, hang_on_to, run_into.")
        ),
        culture = listOf(
            CulturalNote("Friendship", "Friendships require effort to maintain, especially as people get older."),
            CulturalNote("Loyalty", "Loyalty is valued in friendships across cultures, but its expression varies."),
            CulturalNote("Making friends", "Joining clubs and shared activities are common ways to make new friends.")
        ),
        mistakes = listOf(
            CommonMistake("I enjoy to meet new people.", "I enjoy meeting new people.", "Use gerund after 'enjoy'."),
            CommonMistake("I expect meeting new people.", "I expect to meet new people.", "Use infinitive after 'expect'."),
            CommonMistake("We drifted apart since college.", "We drifted apart after college.", "Use 'after' with a specific time."),
            CommonMistake("She brings the best out in me.", "She brings out the best in me.", "Word order: bring out + object + in someone.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What qualities do Ali and Maria value in friendship?", "Loyalty, mutual respect, honesty, supportiveness."),
            ComprehensionQuestion("What happened to Maria's friendship?", "A close friend betrayed her trust, and they drifted apart."),
            ComprehensionQuestion("How do they suggest making new friends?", "Being open, genuine, reaching out first, and joining shared activities.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a long-lasting friendship.", "درباره یک دوستی طولانی‌مدت صحبت کن.", "We've been friends for... / We have a lot in common... / We drifted apart but..."),
            SpeakingTask("Discuss qualities you value in friends.", "درباره ویژگی‌هایی که در دوستان ارزش می‌گذاری صحبت کن.", "I value... / A true friend is someone who... / I look for..."),
            SpeakingTask("Talk about a friendship that ended.", "درباره دوستی‌ای که تمام شد صحبت کن.", "We grew apart because... / It ended when... / I learned...")
        ),
        writing = listOf(
            WritingTask("Write about a friendship that changed your life.", "درباره دوستی‌ای که زندگی‌ات را تغییر داد بنویس.", 180, "Use phrasal verbs and gerund/infinitive constructions.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 2 — Clothes and appearance | لباس و ظاهر
    // Lesson A: The way we dress / Lesson B: How we appear to others
    // ═══════════════════════════════════════════════════════════════
    private fun unit2() = base(
        2, "Clothes and appearance", "لباس و ظاهر",
        listOf("Discuss fashion and identity", "Use verb patterns", "Talk about first impressions", "Use cleft sentences with 'what'"),
        listOf(
            v("stylish", "شیک", "She's very stylish.", "او خیلی شیک است.", "adj"),
            v("trendy", "مد روز", "Those are trendy clothes.", "آن‌ها لباس‌های مد روز هستند.", "adj"),
            v("retro", "رترو", "I love retro fashion.", "عاشق مد رترو هستم.", "adj"),
            v("elegant", "شیک و موقر", "She wore an elegant dress.", "او لباس شیک و موقری پوشید.", "adj"),
            v("quirky", "عجیب و جالب", "He has a quirky style.", "او سبک عجیب و جالبی دارد.", "adj"),
            v("frumpy", "بی‌قواره", "That outfit looks frumpy.", "آن استایل بی‌قواره به نظر می‌رسد.", "adj"),
            v("sloppy", "شلخته", "Don't dress sloppy for work.", "برای کار شلخته لباس نپوش.", "adj"),
            v("stand out", "متمایز بودن", "She stands out in a crowd.", "او در جمع متمایز است.", "v"),
            v("first impression", "اولین برداشت", "First impressions matter.", "اولین برداشت‌ها مهم هستند."),
            v("body language", "زبان بدن", "Body language says a lot.", "زبان بدن خیلی می‌گوید."),
            v("posture", "وضعیت بدن", "Good posture shows confidence.", "وضعیت بدن خوب اعتماد نشان می‌دهد."),
            v("make a statement", "پیام دادن", "Your clothes should make a statement.", "لباست باید پیام بدهد.", "v"),
            v("dignified", "باوقار", "He looks dignified in that suit.", "او در آن کت باوقار به نظر می‌رسد.", "adj"),
            v("approachable", "قابل نزدیک شدن", "A smile makes you approachable.", "لبخند تو را قابل نزدیک شدن می‌کند.", "adj"),
            v("judgment", "قضاوت", "Don't judge based on appearance.", "بر اساس ظاهر قضاوت نکن.")
        ),
        listOf(
            GrammarSection("Verb patterns: verb + infinitive", "tend to, choose to, decide to. I tend to wear comfortable clothes."),
            GrammarSection("Verb + object + infinitive", "inspire me to, advise me to, allow me to. She inspired me to change my style."),
            GrammarSection("Verb + gerund", "enjoy, avoid, mind, prevent from. I enjoy shopping for clothes."),
            GrammarSection("Cleft sentences with 'what'", "What's important to me is comfort. What I do is choose simple clothes.")
        ),
        listOf(
            d("A", "Hey Maria! You look really nice today. Is that a new outfit?", "هی ماریا! امروز واقعاً قشنگ به نظر می‌رسی. لباس جدیدی است؟"),
            d("B", "Thanks! Yes, I bought it last week. Do you like it?", "ممنون! بله، هفته پیش خریدم. دوستش داری؟"),
            d("A", "I do. It's very stylish. You always have a good sense of fashion.", "دوست دارم. خیلی شیک است. همیشه حس مد خوبی داری."),
            d("B", "That's sweet of you to say. I try to make an effort, but comfort comes first.", "مهربانی است که می‌گویی. سعی می‌کنم تلاش کنم، ولی راحتی اولویت اول است."),
            d("A", "I agree. What's important to me is feeling comfortable in what I wear.", "موافقم. برای من مهم این است که در لباسم راحت باشم."),
            d("B", "Exactly. What I do is choose simple, well-made clothes that last.", "دقیقاً. کاری که می‌کنم انتخاب لباس‌های ساده و باکیفیت است که دوام بیاورند."),
            d("A", "That's a smart approach. Do you think clothes say something about us?", "رویکرد هوشمندانه‌ای است. فکر می‌کنی لباس چیزی درباره ما می‌گوید؟"),
            d("B", "Definitely. Our clothes can make a statement about who we are.", "قطعاً. لباس‌هایمان می‌توانند درباره اینکه کی هستیم پیام بدهند."),
            d("A", "True. But sometimes people judge too quickly based on appearance.", "درست. ولی گاهی مردم خیلی سریع بر اساس ظاهر قضاوت می‌کنند."),
            d("B", "That's the problem. First impressions matter, but they're not always accurate.", "مشکل همین است. اولین برداشت‌ها مهم هستند، ولی همیشه دقیق نیستند."),
            d("A", "Exactly. What do you notice first about someone?", "دقیقاً. اول چه چیزی درباره کسی متوجه می‌شوی؟"),
            d("B", "I notice their posture and body language before their clothes, actually.", "راستش قبل از لباسشان، وضعیت بدن و زبان بدنشان را متوجه می‌شوم."),
            d("A", "That's interesting. Why is that?", "جالب است. چرا؟"),
            d("B", "Because body language is harder to fake. It shows how someone really feels.", "چون زبان بدن سخت‌تر جعل می‌شود. نشان می‌دهد کسی واقعاً چه حسی دارد."),
            d("A", "That makes sense. Confidence shows in how you carry yourself.", "منطقی است. اعتماد به نفس در نحوه رفتار خودت نشان داده می‌شود."),
            d("B", "Exactly. You can wear expensive clothes, but if you slouch, it doesn't help.", "دقیقاً. می‌توانی لباس گران بپوشی، ولی اگر قوز کنی، کمک نمی‌کند."),
            d("A", "True. Have you ever changed your style because of someone's advice?", "درست. هیچ‌وقت سبکت را به خاطر توصیه کسی تغییر داده‌ای؟"),
            d("B", "Yes, actually. A friend inspired me to try more colors. I used to only wear black.", "بله، راستش. یک دوست الهامم کرد رنگ‌های بیشتری امتحان کنم. قبلاً فقط مشکی می‌پوشیدم."),
            d("A", "Really? I can't imagine you only wearing black.", "واقعاً؟ نمی‌توانم تصور کنم فقط مشکی می‌پوشیدی."),
            d("B", "I know! Now I love wearing bright colors. It changes my mood.", "می‌دانم! الان عاشق پوشیدن رنگ‌های روشنم. حالم را تغییر می‌دهد."),
            d("A", "That's great. Do you think our clothes affect how we feel?", "عالی است. فکر می‌کنی لباس‌هایمان روی حس‌مان تأثیر می‌گذارد؟"),
            d("B", "Absolutely. When I dress well, I feel more confident and productive.", "قطعاً. وقتی خوب لباس می‌پوشم، بااعتمادبه‌نفس‌تر و پربارتر حس می‌کنم."),
            d("A", "I've noticed that too. What advice would you give to someone who wants to improve their style?", "من هم متوجه شده‌ام. به کسی که می‌خواهد سبکش را بهبود دهد چه توصیه‌ای می‌کنی؟"),
            d("B", "Wear what makes you feel good, not just what's trendy. And don't be afraid to experiment.", "هر چه حس خوبی بهت می‌دهد بپوش، نه فقط مد روز. و از آزمایش کردن نترس."),
            d("A", "That's solid advice. What about dressing for work?", "توصیه محکمی است. لباس پوشیدن برای کار چطور؟"),
            d("B", "It depends on the workplace. But generally, dress slightly better than required.", "به محل کار بستگی دارد. ولی عموماً کمی بهتر از حد لازم لباس بپوش."),
            d("A", "Why slightly better?", "چرا کمی بهتر؟"),
            d("B", "Because it shows respect for the job and for the people you work with.", "چون احترام به شغل و افرادی که با آن‌ها کار می‌کنی را نشان می‌دهد."),
            d("A", "That's a good point. Have you ever been judged unfairly for how you dress?", "نکته خوبی است. هیچ‌وقت به خاطر نحوه لباس پوشیدنت ناعادلانه قضاوت شده‌ای؟"),
            d("B", "Once. I wore a quirky outfit to a formal event and got some strange looks.", "یک بار. لباس عجیبی به یک رویداد رسمی پوشیدم و نگاه‌های عجیبی گرفتم."),
            d("A", "How did you handle it?", "چطور برخورد کردی؟"),
            d("B", "I just reminded myself that my clothes express who I am. I didn't let it bother me.", "فقط به خودم یادآوری کردم که لباسم بیانگر کیستی من است. نگذاشتم آزارم دهد."),
            d("A", "That's the right attitude. Being true to yourself is more important than fitting in.", "نگرش درستی است. وفادار بودن به خودت مهم‌تر از جا افتادن است."),
            d("B", "Exactly. Well, I should go. It was nice talking to you, Ali.", "دقیقاً. خب، باید بروم. صحبت با تو خوب بود، علی."),
            d("A", "You too, Maria. See you soon!", "تو هم، ماریا. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is Maria's approach to fashion?", "Comfort comes first; she chooses simple, well-made clothes."),
            q("What does Maria notice first about someone?", "Their posture and body language."),
            q("What advice does Maria give about style?", "Wear what makes you feel good, not just what's trendy."),
            q("How did Maria handle being judged?", "She reminded herself that her clothes express who she is."),
            q("What's important to me ___ comfort.", listOf("is", "are", "be"), 0),
            q("What I ___ is choose simple clothes.", listOf("do", "does", "did"), 0),
            q("She inspired me ___ my style.", listOf("change", "to change", "changing"), 1),
            q("I enjoy ___ for clothes.", listOf("shop", "to shop", "shopping"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Make a statement", "پیام دادن", "Your clothes should make a statement.", "لباست باید پیام بدهد."),
            IdiomExpression("First impressions", "اولین برداشت‌ها", "First impressions matter.", "اولین برداشت‌ها مهم هستند."),
            IdiomExpression("Stand out", "متمایز بودن", "She stands out in a crowd.", "او در جمع متمایز است."),
            IdiomExpression("Carry yourself", "رفتار کردن", "Confidence shows in how you carry yourself.", "اعتماد به نفس در نحوه رفتار خودت نشان داده می‌شود.")
        ),
        phrasal = listOf(
            PhrasalVerb("dress up", "شیک پوشیدن", "wear formal clothes", "I dressed up for the event.", "برای رویداد شیک پوشیدم.", "No"),
            PhrasalVerb("try on", "پرو کردن", "test clothes", "I tried on several outfits.", "چند لباس را پرو کردم.", "Yes"),
            PhrasalVerb("stand out", "متمایز بودن", "be noticeable", "She stands out in a crowd.", "او در جمع متمایز است.", "No"),
            PhrasalVerb("fit in", "جا افتادن", "belong", "He tries to fit in with the group.", "او سعی می‌کند در گروه جا بیفتد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Cleft sentences", "What's IMportant to me IS comfort."),
            PronunciationTip("Verb patterns", "She inSPIRED me to CHANGE. I ENjoy SHOPping."),
            PronunciationTip("Fashion vocabulary", "STYlish, TRENdy, eLEgant, QUIRKy, FRUMPy.")
        ),
        culture = listOf(
            CulturalNote("Fashion and identity", "Clothes are a form of self-expression and can reflect cultural identity."),
            CulturalNote("First impressions", "Research shows first impressions are formed within seconds."),
            CulturalNote("Dress codes", "Workplace dress codes vary across cultures and industries.")
        ),
        mistakes = listOf(
            CommonMistake("She inspired me change.", "She inspired me to change.", "Use 'to + verb' after inspire + object."),
            CommonMistake("I enjoy to shop.", "I enjoy shopping.", "Use gerund after 'enjoy'."),
            CommonMistake("What important is comfort.", "What's important is comfort.", "Use 'what's' in cleft sentences."),
            CommonMistake("I tried on it.", "I tried it on.", "Separable phrasal verb: pronoun goes in the middle.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is the relationship between clothes and identity?", "Clothes can express who we are and make a statement about our identity."),
            ComprehensionQuestion("What does Maria think about first impressions?", "They matter, but body language is more revealing than clothes."),
            ComprehensionQuestion("What advice does Maria give about personal style?", "Wear what makes you feel good, experiment, and be true to yourself.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss the relationship between clothes and identity.", "درباره رابطه بین لباس و هویت صحبت کن.", "What I wear reflects... / My style is... / I express myself through..."),
            SpeakingTask("Talk about first impressions.", "درباره اولین برداشت‌ها صحبت کن.", "I notice first... / First impressions are... / Body language shows..."),
            SpeakingTask("Give advice about personal style.", "توصیه درباره سبک شخصی بده.", "You should... / What's important is... / Try to...")
        ),
        writing = listOf(
            WritingTask("Write about how your style reflects your personality.", "درباره اینکه سبکت چطور شخصیتت را منعکس می‌کند بنویس.", 180, "Use verb patterns and cleft sentences with 'what'.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 3 — Science and technology | علم و تکنولوژی
    // Lesson A: Good science, bad science / Lesson B: Technology and you
    // ═══════════════════════════════════════════════════════════════
    private fun unit3() = base(
        3, "Science and technology", "علم و تکنولوژی",
        listOf("Discuss scientific issues", "Use passive voice", "Talk about technology's impact", "Express opinions about innovation"),
        listOf(
            v("innovation", "نوآوری", "Innovation drives progress.", "نوآوری پیشرفت را هدایت می‌کند."),
            v("breakthrough", "پیشرفت بزرگ", "It was a major breakthrough.", "پیشرفت بزرگی بود."),
            v("ethical", "اخلاقی", "It's an ethical issue.", "موضوع اخلاقی است.", "adj"),
            v("controversial", "جنجالی", "It's a controversial topic.", "موضوع جنجالی‌ای است.", "adj"),
            v("genetically modified", "دستکاری شده ژنتیکی", "GMOs are controversial.", "GMOها جنجالی هستند.", "adj"),
            v("artificial intelligence", "هوش مصنوعی", "AI is changing everything.", "هوش مصنوعی همه چیز را تغییر می‌دهد."),
            v("automation", "اتوماسیون", "Automation replaces jobs.", "اتوماسیون شغل‌ها را جایگزین می‌کند."),
            v("privacy", "حریم خصوصی", "Online privacy is a concern.", "حریم خصوصی آنلاین نگرانی است."),
            v("surveillance", "نظارت", "Surveillance is increasing.", "نظارت در حال افزایش است."),
            v("renewable", "تجدیدپذیر", "Solar is renewable energy.", "خورشیدی انرژی تجدیدپذیر است.", "adj"),
            v("sustainable", "پایدار", "Sustainable development is key.", "توسعه پایدار کلید است.", "adj"),
            v("side effect", "عوارض جانبی", "The drug has side effects.", "دارو عوارض جانبی دارد."),
            v("regulate", "مقررات وضع کردن", "We need to regulate AI.", "باید هوش مصنوعی را مقررات‌گذاری کنیم.", "v"),
            v("cure", "درمان کردن", "They found a cure.", "درمانی پیدا کردند.", "v"),
            v("enhance", "بهبود دادن", "Technology enhances our lives.", "تکنولوژی زندگی‌مان را بهبود می‌دهد.", "v")
        ),
        listOf(
            GrammarSection("Passive voice: present and past", "am/is/are + past participle, was/were + past participle. Technology is used everywhere."),
            GrammarSection("Passive with modals", "modal + be + past participle. It should be regulated. It can be improved."),
            GrammarSection("Passive with by + agent", "The discovery was made by a team of scientists."),
            GrammarSection("Reporting passive", "It is said that... / It is believed that... / It has been proven that...")
        ),
        listOf(
            d("A", "Hey Maria! I just read about a new AI breakthrough. Have you heard about it?", "هی ماریا! تازه درباره یک پیشرفت بزرگ هوش مصنوعی خواندم. شنیده‌ای؟"),
            d("B", "Probably. AI is everywhere these days. What was it about?", "احتمالاً. این روزها هوش مصنوعی همه جا هست. درباره چه بود؟"),
            d("A", "Scientists created an AI that can detect diseases earlier than doctors.", "دانشمندان هوش مصنوعی‌ای ساختند که می‌تواند بیماری‌ها را زودتر از پزشکان تشخیص دهد."),
            d("B", "Wow, that's incredible. That could save so many lives.", "واو، باورنکردنی است. می‌تواند جان‌های زیادی را نجات دهد."),
            d("A", "I know. But some people are worried about the ethical implications.", "می‌دانم. ولی برخی نگران پیامدهای اخلاقی آن هستند."),
            d("B", "Like what?", "مثل چی؟"),
            d("A", "Like who has access to the data, and whether it could be misused.", "مثل اینکه چه کسی به داده‌ها دسترسی دارد، و آیا می‌تواند سوءاستفاده شود."),
            d("B", "Those are valid concerns. It should be regulated carefully.", "نگرانی‌های معتبری هستند. باید با دقت مقررات‌گذاری شود."),
            d("A", "Exactly. Technology can be used for good or bad. It depends on how it's applied.", "دقیقاً. تکنولوژی می‌تواند برای خوب یا بد استفاده شود. به نحوه کاربردش بستگی دارد."),
            d("B", "True. What do you think is the most important scientific breakthrough of our time?", "درست. فکر می‌کنی مهم‌ترین پیشرفت علمی زمان ما چیست؟"),
            d("A", "Probably the internet. It's changed every aspect of our lives.", "احتمالاً اینترنت. هر جنبه‌ای از زندگی‌مان را تغییر داده."),
            d("B", "That's a good one. But what about medical advances? Vaccines have saved millions.", "گزینه خوبی است. ولی پیشرفت‌های پزشکی چطور؟ واکسن‌ها میلیون‌ها نفر را نجات داده‌اند."),
            d("A", "That's true. Vaccines are one of the greatest achievements in history.", "درست است. واکسن‌ها یکی از بزرگ‌ترین دستاوردهای تاریخ هستند."),
            d("B", "Have you ever refused a technology because of ethical concerns?", "هیچ‌وقت تکنولوژی‌ای را به خاطر نگرانی‌های اخلاقی رد کرده‌ای؟"),
            d("A", "Yes, actually. I don't use facial recognition apps. I think they're invasive.", "بله، راستش. از اپلیکیشن‌های تشخیص چهره استفاده نمی‌کنم. فکر می‌کنم مزاحم هستند."),
            d("B", "I understand that. Privacy is so important in the digital age.", "می‌فهمم. حریم خصوصی در عصر دیجیتال خیلی مهم است."),
            d("A", "Exactly. What about you? Is there any technology you avoid?", "دقیقاً. تو چطور؟ تکنولوژی‌ای هست که از آن اجتناب کنی؟"),
            d("B", "I try to limit my social media use. It can be toxic sometimes.", "سعی می‌کنم استفاده از شبکه‌های اجتماعی‌ام را محدود کنم. گاهی سمی است."),
            d("A", "That's smart. Do you think technology has made us happier?", "هوشمندانه است. فکر می‌کنی تکنولوژی ما را شادتر کرده؟"),
            d("B", "That's a complex question. It's made some things easier, but not necessarily happier.", "سؤال پیچیده‌ای است. برخی چیزها را آسان‌تر کرده، ولی لزوماً شادتر نه."),
            d("A", "I agree. We're more connected but also more isolated in some ways.", "موافقم. بیشتر متصل هستیم ولی از برخی جهات منزواتر."),
            d("B", "Exactly. It's a paradox of modern life.", "دقیقاً. پارادوکس زندگی مدرن است."),
            d("A", "True. What technology do you think will change the world next?", "درست. فکر می‌کنی چه تکنولوژی‌ای دنیا را تغییر می‌دهد؟"),
            d("B", "I think renewable energy will be huge. We need it for sustainability.", "فکر می‌کنم انرژی تجدیدپذیر بزرگ خواهد بود. برای پایداری به آن نیاز داریم."),
            d("A", "That's a great point. Climate change is the biggest challenge we face.", "نکته عالی‌ای است. تغییرات اقلیمی بزرگ‌ترین چالش ماست."),
            d("B", "Exactly. Technology has to be part of the solution.", "دقیقاً. تکنولوژی باید بخشی از راه‌حل باشد."),
            d("A", "Do you think we'll ever find a cure for cancer?", "فکر می‌کنی روزی درمان سرطان را پیدا می‌کنیم؟"),
            d("B", "I hope so. There's so much research being done right now.", "امیدوارم. الان تحقیقات زیادی در حال انجام است."),
            d("A", "It's amazing how fast science is advancing.", "شگفت‌انگیز است که علم چقدر سریع پیشرفت می‌کند."),
            d("B", "It is. But we also need to make sure it's used responsibly.", "هست. ولی باید مطمئن شویم مسئولانه استفاده می‌شود."),
            d("A", "That's the key. Science should serve humanity, not the other way around.", "همین کلید است. علم باید به بشریت خدمت کند، نه برعکس."),
            d("B", "Well said. Have you ever thought about working in science?", "خوب گفتی. هیچ‌وقت به کار در علم فکر کرده‌ای؟"),
            d("A", "When I was younger, yes. But I ended up in business.", "وقتی جوان‌تر بودم، بله. ولی در نهایت در کسب‌وکار مشغول شدم."),
            d("B", "Do you regret it?", "پشیمانی؟"),
            d("A", "Not really. I still read about science all the time. It's a passion of mine.", "نه واقعاً. هنوز همیشه درباره علم می‌خوانم. اشتیاق من است."),
            d("B", "That's great. Passions don't have to be careers.", "عالی است. اشتیاق‌ها لازم نیست حرفه باشند."),
            d("A", "Exactly. Well, I should go. This was a fascinating conversation.", "دقیقاً. خب، باید بروم. مکالمه جالبی بود."),
            d("B", "It was. Thanks for sharing your thoughts, Ali.", "بود. ممنون که نظراتت را به اشتراک گذاشتی، علی."),
            d("A", "Anytime. See you soon!", "هر وقت. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is the AI breakthrough about?", "An AI that can detect diseases earlier than doctors."),
            q("What is Maria's concern about AI?", "Ethical implications and data misuse."),
            q("What technology does Ali avoid?", "Facial recognition apps."),
            q("What technology does Maria think will change the world?", "Renewable energy."),
            q("Technology ___ used everywhere.", listOf("is", "are", "be"), 0),
            q("It should ___ regulated carefully.", listOf("be", "is", "are"), 0),
            q("The discovery ___ made by a team of scientists.", listOf("is", "was", "be"), 1),
            q("It ___ said that AI will change everything.", listOf("is", "are", "be"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Breakthrough", "پیشرفت بزرگ", "It was a major breakthrough.", "پیشرفت بزرگی بود."),
            IdiomExpression("The other way around", "برعکس", "Not the other way around.", "نه برعکس."),
            IdiomExpression("Digital age", "عصر دیجیتال", "Privacy in the digital age.", "حریم خصوصی در عصر دیجیتال."),
            IdiomExpression("Part of the solution", "بخشی از راه‌حل", "Technology is part of the solution.", "تکنولوژی بخشی از راه‌حل است.")
        ),
        phrasal = listOf(
            PhrasalVerb("carry out", "انجام دادن", "conduct", "They carried out research.", "تحقیق انجام دادند.", "Yes"),
            PhrasalVerb("come up with", "به ذهن رسیدن", "invent", "They came up with a new solution.", "راه‌حل جدیدی به ذهنشان رسید.", "No"),
            PhrasalVerb("break down", "خراب شدن", "stop working", "The system broke down.", "سیستم خراب شد.", "No"),
            PhrasalVerb("rely on", "تکیه کردن", "depend on", "We rely on technology too much.", "زیادی به تکنولوژی تکیه می‌کنیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Passive voice", "Technology IS USED. It WAS MADE. It SHOULD BE REGulated."),
            PronunciationTip("Scientific vocabulary", "innoVAtion, BREAKthrough, ETHical, conTROVersial."),
            PronunciationTip("Reporting passive", "It IS SAID that... It HAS BEEN PROVEN that...")
        ),
        culture = listOf(
            CulturalNote("Science and ethics", "Scientific breakthroughs often raise ethical questions that society must address."),
            CulturalNote("Technology and society", "Technology shapes society, but society also shapes how technology is used."),
            CulturalNote("Digital privacy", "Privacy concerns have grown with the rise of surveillance and data collection.")
        ),
        mistakes = listOf(
            CommonMistake("Technology is use everywhere.", "Technology is used everywhere.", "Use past participle in passive."),
            CommonMistake("It should is regulated.", "It should be regulated.", "Use 'be' after modal in passive."),
            CommonMistake("The discovery was make by scientists.", "The discovery was made by scientists.", "Use past participle 'made'."),
            CommonMistake("It is say that...", "It is said that...", "Use past participle 'said'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the benefits and concerns of AI in medicine?", "Benefits: early disease detection. Concerns: data access and potential misuse."),
            ComprehensionQuestion("What technology does Ali avoid and why?", "Facial recognition apps because he considers them invasive."),
            ComprehensionQuestion("What is Maria's view on technology and happiness?", "It makes things easier but not necessarily happier; it's a paradox.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a scientific breakthrough and its ethical implications.", "درباره یک پیشرفت علمی و پیامدهای اخلاقی‌اش صحبت کن.", "It was discovered... / It can be used for... / The concern is..."),
            SpeakingTask("Talk about technology you use or avoid.", "درباره تکنولوژی‌ای که استفاده می‌کنی یا اجتناب می‌کنی صحبت کن.", "I use... / I avoid... because... / It should be..."),
            SpeakingTask("Express opinions about the future of technology.", "نظرت را درباره آینده تکنولوژی بیان کن.", "I think... will... / It might be... / We need to...")
        ),
        writing = listOf(
            WritingTask("Write about a scientific development and its impact on society.", "درباره یک پیشرفت علمی و تأثیرش بر جامعه بنویس.", 180, "Use passive voice and reporting passive.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 4 — Superstitions and beliefs | خرافات و باورها
    // Lesson A: Superstitions / Lesson B: Believe it or not
    // ═══════════════════════════════════════════════════════════════
    private fun unit4() = base(
        4, "Superstitions and beliefs", "خرافات و باورها",
        listOf("Discuss superstitions", "Use unreal conditionals", "Talk about beliefs", "Speculate about the supernatural"),
        listOf(
            v("superstition", "خرافه", "It's just a superstition.", "فقط یک خرافه است."),
            v("superstitious", "خرافاتی", "He's very superstitious.", "او خیلی خرافاتی است.", "adj"),
            v("luck", "شانس", "Wish me luck!", "برام آرزوی موفقیت کن!"),
            v("coincidence", "تصادف", "It was a coincidence.", "تصادفی بود."),
            v("omen", "نشانه", "It's a bad omen.", "نشانه بدی است."),
            v("ritual", "آیین", "It's a daily ritual.", "آیین روزانه است."),
            v("belief", "باور", "It's a common belief.", "باور رایجی است."),
            v("supernatural", "فراطبیعی", "Ghosts are supernatural.", "روح‌ها فراطبیعی هستند.", "adj"),
            v("paranormal", "فراروانی", "Paranormal activity is scary.", "فعالیت فراروانی ترسناک است.", "adj"),
            v("skeptical", "شک‌گرا", "I'm skeptical about that.", "درباره‌اش شک‌گرایم.", "adj"),
            v("rational", "منطقی", "There's a rational explanation.", "توضیح منطقی وجود دارد.", "adj"),
            v("convince", "متقاعد کردن", "He convinced me.", "او متقاعدم کرد.", "v"),
            v("doubt", "شک", "I have my doubts.", "شک دارم."),
            v("faith", "ایمان", "She has faith in him.", "او به او ایمان دارد."),
            v("intuition", "شهود", "Trust your intuition.", "به شهودت اعتماد کن.")
        ),
        listOf(
            GrammarSection("Unreal conditionals: present", "If + past simple, would + base verb. If I were superstitious, I would avoid black cats."),
            GrammarSection("Unreal conditionals: past", "If + past perfect, would have + past participle. If I had known, I would have acted differently."),
            GrammarSection("Mixed conditionals", "If I had studied science, I would be a scientist now."),
            GrammarSection("Expressing doubt and belief", "I doubt that... / I believe that... / It's possible that... / There's no way that...")
        ),
        listOf(
            d("A", "Hey Maria! I have a strange question for you. Are you superstitious?", "هی ماریا! یک سؤال عجیب ازت دارم. خرافاتی هستی؟"),
            d("B", "A little bit. I don't walk under ladders, but I don't take it too seriously.", "کمی. زیر نردبان رد نمی‌شوم، ولی زیاد جدی‌اش نمی‌گیرم."),
            d("A", "That's fair. Why do you avoid ladders?", "منصفانه است. چرا از نردبان اجتناب می‌کنی؟"),
            d("B", "It's an old superstition. But honestly, it's also just common sense. Ladders can fall.", "یک خرافه قدیمی است. ولی راستش، عقل سلیم هم هست. نردبان‌ها می‌توانند بیفتند."),
            d("A", "Ha! That's a rational explanation for a superstition. Do you believe in any others?", "ها! توضیح منطقی برای یک خرافه است. به خرافات دیگری هم اعتقاد داری؟"),
            d("B", "I knock on wood sometimes. And I have a lucky pen I use for important things.", "گاهی به چوب می‌زنم. و یک خودکار شانس‌آور دارم که برای کارهای مهم استفاده می‌کنم."),
            d("A", "A lucky pen? Does it work?", "خودکار شانس‌آور؟ کار می‌کند؟"),
            d("B", "I don't know. But it makes me feel more confident, so maybe it does.", "نمی‌دانم. ولی احساس اعتماد بیشتری بهم می‌دهد، پس شاید کار می‌کند."),
            d("A", "That's the placebo effect. Belief can be powerful.", "این اثر پلاسبو است. باور می‌تواند قدرتمند باشد."),
            d("B", "Exactly. What about you? Are you superstitious at all?", "دقیقاً. تو چطور؟ اصلاً خرافاتی هستی؟"),
            d("A", "Not really. I'm pretty skeptical about most things. I need evidence.", "نه واقعاً. درباره بیشتر چیزها شک‌گرایم. به شواهد نیاز دارم."),
            d("B", "That's a good way to be. But have you ever experienced something you couldn't explain?", "روش خوبی است. ولی هیچ‌وقت چیزی را تجربه کرده‌ای که نتوانی توضیح دهی؟"),
            d("A", "Actually, yes. Once I had a dream about something, and it happened the next day.", "راستش بله. یک بار خواب چیزی را دیدم، و روز بعد اتفاق افتاد."),
            d("B", "Really? That's fascinating. What was it about?", "واقعاً؟ جالب است. درباره چه بود؟"),
            d("A", "I dreamed my friend would call me with good news. And he did the next morning.", "خواب دیدم دوستم با خبر خوب زنگ می‌زند. و صبح روز بعد زنگ زد."),
            d("B", "That's a huge coincidence. Or maybe it was intuition.", "تصادف بزرگی است. یا شاید شهود بود."),
            d("A", "Probably coincidence. But it made me wonder about things we can't explain.", "احتمالاً تصادف. ولی باعث شد درباره چیزهایی که نمی‌توانیم توضیح دهیم فکر کنم."),
            d("B", "I know what you mean. The world is full of mysteries.", "می‌دانم منظورت چیست. دنیا پر از راز است."),
            d("A", "True. Do you believe in ghosts or the supernatural?", "درست. به روح‌ها یا فراطبیعی اعتقاد داری؟"),
            d("B", "I'm not sure. I've never seen a ghost, but I've felt strange presences.", "مطمئن نیستم. هرگز روح ندیده‌ام، ولی حضورهای عجیبی حس کرده‌ام."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Once I was alone in my grandmother's old house, and I felt like someone was watching me.", "یک بار در خانه قدیمی مادربزرگم تنها بودم، و حس کردم کسی تماشایم می‌کند."),
            d("A", "That's creepy. What did you do?", "ترسناک است. چه کار کردی؟"),
            d("B", "I left the room immediately. I didn't want to find out.", "فوراً اتاق را ترک کردم. نمی‌خواستم بفهمم."),
            d("A", "I don't blame you. Have you ever had your palm read or anything like that?", "سرزنشت نمی‌کنم. هیچ‌وقت کف دستت را نخوانده‌اند یا چیز مشابهی؟"),
            d("B", "Yes, once at a fair. The woman told me I would travel a lot.", "بله، یک بار در یک نمایشگاه. زن گفت زیاد سفر خواهم کرد."),
            d("A", "And have you?", "و سفر کرده‌ای؟"),
            d("B", "Actually, yes. More than I expected. But that could be coincidence.", "راستش بله. بیشتر از آنچه انتظار داشتم. ولی می‌تواند تصادف باشد."),
            d("A", "Exactly. It's easy to find meaning in vague predictions.", "دقیقاً. پیدا کردن معنا در پیش‌بینی‌های مبهم آسان است."),
            d("B", "True. What about you? Would you ever get a reading?", "درست. تو چطور؟ هیچ‌وقت پیش‌بینی می‌گیری؟"),
            d("A", "Maybe for fun. But I wouldn't base my decisions on it.", "شاید برای سرگرمی. ولی تصمیماتم را بر اساسش نمی‌گیرم."),
            d("B", "That's a healthy attitude. What about fate? Do you believe in it?", "نگرش سالمی است. تقدیر چطور؟ به آن اعتقاد داری؟"),
            d("A", "I believe we create our own fate through our choices.", "باور دارم تقدیر خودمان را از طریق انتخاب‌هایمان می‌سازیم."),
            d("B", "That's a powerful belief. I like that.", "باور قدرتمندی است. دوستش دارم."),
            d("A", "Thanks. Do you think there's life after death?", "ممنون. فکر می‌کنی زندگی پس از مرگ وجود دارد؟"),
            d("B", "That's a big question. I'd like to think so, but I don't know.", "سؤال بزرگی است. دوست دارم فکر کنم بله، ولی نمی‌دانم."),
            d("A", "I think that's how most people feel. It's a mystery we can't solve.", "فکر می‌کنم بیشتر مردم همینطور حس می‌کنند. رازی است که نمی‌توانیم حل کنیم."),
            d("B", "True. Well, I should go. This was an interesting conversation.", "درست. خب، باید بروم. مکالمه جالبی بود."),
            d("A", "It was. Thanks for sharing your thoughts, Maria.", "بود. ممنون که نظراتت را به اشتراک گذاشتی، ماریا."),
            d("B", "Anytime, Ali. See you soon!", "هر وقت، علی. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What superstitions does Maria have?", "Avoiding ladders, knocking on wood, using a lucky pen."),
            q("What dream did Ali have?", "He dreamed his friend would call with good news, and it happened."),
            q("What did the palm reader tell Maria?", "She would travel a lot."),
            q("What does Ali believe about fate?", "We create our own fate through our choices."),
            q("If I ___ superstitious, I would avoid black cats.", listOf("am", "was", "were"), 2),
            q("If I had known, I ___ acted differently.", listOf("will have", "would have", "did have"), 1),
            q("If I had studied science, I ___ a scientist now.", listOf("would be", "will be", "am"), 0),
            q("I doubt ___ ghosts exist.", listOf("that", "which", "who"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Knock on wood", "به چوب زدن", "I knock on wood sometimes.", "گاهی به چوب می‌زنم."),
            IdiomExpression("Bad omen", "نشانه بد", "It's a bad omen.", "نشانه بدی است."),
            IdiomExpression("I don't blame you", "سرزنشت نمی‌کنم", "I don't blame you.", "سرزنشت نمی‌کنم."),
            IdiomExpression("That's how most people feel", "بیشتر مردم همینطور حس می‌کنند", "That's how most people feel.", "بیشتر مردم همینطور حس می‌کنند.")
        ),
        phrasal = listOf(
            PhrasalVerb("believe in", "اعتقاد داشتن به", "have faith in", "Do you believe in ghosts?", "به روح‌ها اعتقاد داری؟", "No"),
            PhrasalVerb("find out", "فهمیدن", "discover", "I didn't want to find out.", "نمی‌خواستم بفهمم.", "No"),
            PhrasalVerb("base on", "بر اساس چیزی بودن", "found on", "I wouldn't base decisions on it.", "تصمیماتم را بر اساسش نمی‌گیرم.", "No"),
            PhrasalVerb("come true", "محقق شدن", "become reality", "Dreams can come true.", "خواب‌ها می‌توانند محقق شوند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Unreal conditionals", "If I WERE you, I would... If I had KNOWN, I would have..."),
            PronunciationTip("Doubt and belief", "I DOUBT that... I BE LIEVE that..."),
            PronunciationTip("Superstition vocabulary", "SUPERstition, COINcidence, Omen, RITual.")
        ),
        culture = listOf(
            CulturalNote("Superstitions", "Superstitions vary widely across cultures and often have historical roots."),
            CulturalNote("Skepticism", "Scientific thinking encourages questioning and evidence-based beliefs."),
            CulturalNote("Belief systems", "Beliefs about fate, the supernatural, and the afterlife vary across cultures.")
        ),
        mistakes = listOf(
            CommonMistake("If I was you, I would...", "If I were you, I would...", "Use 'were' in unreal conditionals."),
            CommonMistake("If I would have known, I would have acted.", "If I had known, I would have acted.", "Use past perfect after 'if'."),
            CommonMistake("I doubt that ghosts exists.", "I doubt that ghosts exist.", "Use base verb after 'that' clause."),
            CommonMistake("I base my decisions in it.", "I base my decisions on it.", "Use 'base on'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Maria's superstitions?", "Avoiding ladders, knocking on wood, using a lucky pen."),
            ComprehensionQuestion("What is Ali's view on the supernatural?", "He is skeptical but open to mysteries he can't explain."),
            ComprehensionQuestion("What do they conclude about fate and the afterlife?", "Ali believes we create our own fate; the afterlife remains a mystery.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss superstitions you know.", "درباره خرافاتی که می‌شناسی صحبت کن.", "In my culture... / It's believed that... / I'm not superstitious but..."),
            SpeakingTask("Talk about a mysterious experience.", "درباره یک تجربه مرموز صحبت کن.", "Once I... / I couldn't explain... / It might have been..."),
            SpeakingTask("Express your beliefs about fate.", "باورهایت درباره تقدیر را بیان کن.", "I believe... / If I were... / I doubt that...")
        ),
        writing = listOf(
            WritingTask("Write about a superstition and whether you believe it.", "درباره یک خرافه و اینکه به آن اعتقاد داری یا نه بنویس.", 180, "Use unreal conditionals.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 5 — Television and reading | تلویزیون و خواندن
    // Lesson A: Television / Lesson B: Trends in reading
    // ═══════════════════════════════════════════════════════════════
    private fun unit5() = base(
        5, "Television and reading", "تلویزیون و خواندن",
        listOf("Discuss TV habits", "Use reported speech", "Talk about reading preferences", "Express opinions about media"),
        listOf(
            v("broadcast", "پخش کردن", "The show is broadcast live.", "برنامه زنده پخش می‌شود.", "v"),
            v("documentary", "مستند", "I love nature documentaries.", "عاشق مستندهای طبیعت هستم."),
            v("series", "سریال", "I'm watching a new series.", "یک سریال جدید تماشا می‌کنم."),
            v("episode", "قسمت", "The new episode is tonight.", "قسمت جدید امشب است."),
            v("plot", "خط داستانی", "The plot was clever.", "خط داستانی هوشمندانه بود."),
            v("character", "شخصیت", "The main character is amazing.", "شخصیت اصلی شگفت‌انگیز است."),
            v("novel", "رمان", "I'm reading a novel.", "دارم رمان می‌خوانم."),
            v("fiction", "داستان", "I prefer fiction.", "داستان را ترجیح می‌دهم."),
            v("non-fiction", "غیرداستانی", "Non-fiction is educational.", "غیرداستانی آموزشی است."),
            v("author", "نویسنده", "Who's the author?", "نویسنده کیست؟"),
            v("bestseller", "پرفروش", "It's a bestseller.", "پرفروش است."),
            v("binge-watch", "پشت سر هم تماشا کردن", "I binge-watched the whole season.", "کل فصل را پشت سر هم تماشا کردم.", "v"),
            v("plot twist", "پیچش داستانی", "The plot twist shocked me.", "پیچش داستانی شوکه‌ام کرد."),
            v("recommend", "توصیه کردن", "I recommend this book.", "این کتاب را توصیه می‌کنم.", "v"),
            v("adaptation", "اقتباس", "The movie is an adaptation.", "فیلم یک اقتباس است.")
        ),
        listOf(
            GrammarSection("Reported speech: statements", "He said (that) he was tired. She told me she liked the show."),
            GrammarSection("Reported speech: questions", "He asked where I lived. She asked if I had seen it."),
            GrammarSection("Tense changes in reported speech", "Present to past, will to would, can to could, past to past perfect."),
            GrammarSection("Reporting verbs", "say, tell, ask, mention, claim, admit, deny, recommend.")
        ),
        listOf(
            d("A", "Hey Maria! Did you watch that new series everyone's talking about?", "هی ماریا! آن سریال جدیدی که همه درباره‌اش صحبت می‌کنند را دیدی؟"),
            d("B", "Which one? There are so many these days.", "کدام یکی؟ این روزها خیلی زیادند."),
            d("A", "The detective one. It's on Netflix. My friend recommended it.", "آن کارآگاهی. در نتفلیکس است. دوستم توصیه کرد."),
            d("B", "Oh, I heard about that. My colleague said it was incredible.", "اوه، درباره‌اش شنیده‌ام. همکارم گفت باورنکردنی بود."),
            d("A", "Really? What did she say exactly?", "واقعاً؟ دقیقاً چه گفت؟"),
            d("B", "She said the plot twists were unexpected and the acting was superb.", "گفت پیچش‌های داستانی غیرمنتظره بودند و بازیگری عالی بود."),
            d("A", "That's what I heard too. I think I'll start watching it tonight.", "من هم همین را شنیده‌ام. فکر می‌کنم امشب شروع به تماشا کنم."),
            d("B", "You should. But be careful, it's addictive. I binge-watched the whole season.", "باید بکنی. ولی مراقب باش، اعتیادآور است. کل فصل را پشت سر هم تماشا کردم."),
            d("A", "Ha! I've done that before. How many episodes are there?", "ها! قبلاً این کار را کرده‌ام. چند قسمت دارد؟"),
            d("B", "Eight. Each one is about an hour.", "هشت. هر کدام حدود یک ساعت."),
            d("A", "That's manageable. Do you prefer series or movies?", "قابل مدیریت است. سریال را ترجیح می‌دهی یا فیلم؟"),
            d("B", "Series, definitely. I get more invested in the characters.", "سریال، قطعاً. بیشتر درگیر شخصیت‌ها می‌شوم."),
            d("A", "I agree. What's your favorite series of all time?", "موافقم. سریال مورد علاقه‌ات در تمام دوران چیست؟"),
            d("B", "That's a tough question. Probably a drama I watched last year.", "سؤال سختی است. احتمالاً یک درام که سال گذشته دیدم."),
            d("A", "What was it about?", "درباره چه بود؟"),
            d("B", "It was about a family dealing with secrets and loss. Very emotional.", "درباره خانواده‌ای بود که با رازها و فقدان دست و پنجه نرم می‌کرد. خیلی احساسی."),
            d("A", "That sounds powerful. Did it have a good ending?", "قدرتمند به نظر می‌رسد. پایان خوبی داشت؟"),
            d("B", "It did. But I won't spoil it for you in case you watch it.", "داشت. ولی برایت خرابش نمی‌کنم در صورتی که تماشا کنی."),
            d("A", "Thanks. I appreciate that. What about reading? Do you read much?", "ممنون. قدرش را می‌دانم. خواندن چطور؟ زیاد می‌خوانی؟"),
            d("B", "Yes, I try to read every night before bed. It helps me relax.", "بله، سعی می‌کنم هر شب قبل از خواب بخوانم. به آرامشم کمک می‌کند."),
            d("A", "What kind of books do you like?", "چه نوع کتاب‌هایی دوست داری؟"),
            d("B", "Mostly fiction. Novels, mysteries, some science fiction. What about you?", "بیشتر داستان. رمان، معما، کمی علمی-تخیلی. تو چطور؟"),
            d("A", "I read a lot of non-fiction. Business, psychology, history.", "من زیاد غیرداستانی می‌خوانم. کسب‌وکار، روانشناسی، تاریخ."),
            d("B", "That's interesting. Do you have a favorite author?", "جالب است. نویسنده مورد علاقه‌ای داری؟"),
            d("A", "Yes, I love Malcolm Gladwell. His books are fascinating.", "بله، مالکوم گلدول را دوست دارم. کتاب‌هایش جالب هستند."),
            d("B", "I've heard of him. What's his best book?", "درباره‌اش شنیده‌ام. بهترین کتابش چیست؟"),
            d("A", "Probably Outliers. It's about success and opportunity.", "احتمالاًOutliers. درباره موفقیت و فرصت است."),
            d("B", "I'll add it to my list. Do you prefer physical books or e-readers?", "به لیستم اضافه می‌کنم. کتاب فیزیکی را ترجیح می‌دهی یا کتابخوان الکترونیکی؟"),
            d("A", "Physical books. I love the feel of paper. What about you?", "کتاب فیزیکی. حس کاغذ را دوست دارم. تو چطور؟"),
            d("B", "I used to feel the same way, but now I mostly read on my tablet. It's more convenient.", "قبلاً همین حس را داشتم، ولی الان بیشتر روی تبلتم می‌خوانم. راحت‌تر است."),
            d("A", "I understand that. It's easier to carry around. Do you think reading is declining?", "می‌فهمم. حملش آسان‌تر است. فکر می‌کنی خواندن در حال کاهش است؟"),
            d("B", "In some ways, yes. But I think people are reading more online articles and blogs.", "از برخی جهات، بله. ولی فکر می‌کنم مردم بیشتر مقالات و وبلاگ‌های آنلاین می‌خوانند."),
            d("A", "That's true. The format has changed, but reading hasn't disappeared.", "درست است. قالب تغییر کرده، ولی خواندن از بین نرفته."),
            d("B", "Exactly. I read somewhere that people actually read more words per day than ever before.", "دقیقاً. جایی خواندم که مردم واقعاً بیشتر از همیشه کلمه در روز می‌خوانند."),
            d("A", "That's probably because of phones and computers. But is it quality reading?", "احتمالاً به خاطر گوشی‌ها و کامپیوترهاست. ولی خواندن باکیفیت است؟"),
            d("B", "That's the question. Deep reading requires focus, which is harder now.", "سؤال همین است. خواندن عمیق نیاز به تمرکز دارد، که الان سخت‌تر است."),
            d("A", "I agree. I try to have at least 30 minutes of screen-free reading every day.", "موافقم. سعی می‌کنم حداقل ۳۰ دقیقه خواندن بدون صفحه در روز داشته باشم."),
            d("B", "That's a great habit. I should try that too.", "عادت عالی‌ای است. باید من هم امتحان کنم."),
            d("A", "You should. It makes a big difference. Well, I should go.", "باید بکنی. تفاوت بزرگی ایجاد می‌کند. خب، باید بروم."),
            d("B", "Okay. Thanks for the book recommendation!", "باشه. ممنون برای توصیه کتاب!"),
            d("A", "Anytime. See you soon!", "هر وقت. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did Maria's colleague say about the series?", "The plot twists were unexpected and the acting was superb."),
            q("What kind of books does Maria read?", "Mostly fiction - novels, mysteries, science fiction."),
            q("What book does Ali recommend?", "Outliers by Malcolm Gladwell."),
            q("What is Ali's habit for reading?", "30 minutes of screen-free reading every day."),
            q("She said the plot twists ___ unexpected.", listOf("are", "were", "be"), 1),
            q("He asked where I ___.", listOf("live", "lived", "do live"), 1),
            q("She asked if I ___ seen it.", listOf("have", "had", "has"), 1),
            q("My colleague said it ___ incredible.", listOf("is", "was", "be"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Binge-watch", "پشت سر هم تماشا کردن", "I binge-watched the whole season.", "کل فصل را پشت سر هم تماشا کردم."),
            IdiomExpression("Spoil it", "خراب کردن", "I won't spoil it for you.", "برایت خرابش نمی‌کنم."),
            IdiomExpression("Get invested", "درگیر شدن", "I get more invested in the characters.", "بیشتر درگیر شخصیت‌ها می‌شوم."),
            IdiomExpression("Screen-free", "بدون صفحه", "Screen-free reading is important.", "خواندن بدون صفحه مهم است.")
        ),
        phrasal = listOf(
            PhrasalVerb("watch out", "مواظب بودن", "be careful", "Watch out, it's addictive.", "مواظب باش، اعتیادآور است.", "No"),
            PhrasalVerb("turn on", "روشن کردن", "switch on", "Turn on the TV.", "تلویزیون را روشن کن.", "Yes"),
            PhrasalVerb("turn off", "خاموش کردن", "switch off", "Turn off the show.", "برنامه را خاموش کن.", "Yes"),
            PhrasalVerb("add to", "اضافه کردن به", "include", "I'll add it to my list.", "به لیستم اضافه می‌کنم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Reported speech", "She SAID the plot twists were unexPECted."),
            PronunciationTip("Tense shifts", "is → was, will → would, can → could, have → had."),
            PronunciationTip("Media vocabulary", "DOCumentary, SERies, EPisode, BESTseller.")
        ),
        culture = listOf(
            CulturalNote("Streaming culture", "Streaming services have changed how people watch TV and movies."),
            CulturalNote("Reading trends", "While print reading has declined, online reading has increased significantly."),
            CulturalNote("Binge-watching", "Watching entire seasons in one sitting has become a common cultural phenomenon.")
        ),
        mistakes = listOf(
            CommonMistake("She said me it was good.", "She told me it was good.", "Use 'tell' with an object."),
            CommonMistake("He said he will come.", "He said he would come.", "Shift 'will' to 'would' in reported speech."),
            CommonMistake("He asked where did I live.", "He asked where I lived.", "Use statement word order in reported questions."),
            CommonMistake("She asked if I have seen it.", "She asked if I had seen it.", "Shift present perfect to past perfect.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the viewing habits of Ali and Maria?", "Maria binge-watches series; Ali prefers movies but is starting a new series."),
            ComprehensionQuestion("What reading preferences do they have?", "Maria reads fiction; Ali reads non-fiction."),
            ComprehensionQuestion("What is the trend in reading?", "Format has changed to digital, but reading hasn't disappeared; deep reading is harder.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a TV series you've watched.", "درباره سریالی که دیده‌ای صحبت کن.", "I binge-watched... / The plot was... / The character..."),
            SpeakingTask("Report what someone said about a show or book.", "گزارش کن کسی درباره یک برنامه یا کتاب چه گفت.", "She said... / He told me... / They mentioned..."),
            SpeakingTask("Talk about your reading habits.", "درباره عادات کتاب خواندنت صحبت کن.", "I read... / I prefer... / I try to read...")
        ),
        writing = listOf(
            WritingTask("Write a review of a TV series or book you've recently enjoyed.", "نقدی درباره یک سریال یا کتاب که اخیراً لذت برده‌ای بنویس.", 180, "Use reported speech.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 6 — Musicians and music | نوازندگان و موسیقی
    // Lesson A: A world of music / Lesson B: Getting your big break
    // ═══════════════════════════════════════════════════════════════
    private fun unit6() = base(
        6, "Musicians and music", "نوازندگان و موسیقی",
        listOf("Discuss music preferences", "Use passive voice with modals", "Talk about musicians", "Express opinions about music industry"),
        listOf(
            v("genre", "ژانر", "What's your favorite genre?", "ژانر مورد علاقه‌ات چیست؟"),
            v("melody", "ملودی", "The melody is beautiful.", "ملودی زیباست."),
            v("lyrics", "متن آهنگ", "The lyrics are meaningful.", "متن آهنگ معنی‌دار است."),
            v("rhythm", "ریتم", "I love the rhythm.", "عاشق ریتمم."),
            v("live performance", "اجرای زنده", "Live performances are amazing.", "اجراهای زنده شگفت‌انگیزند."),
            v("audience", "تماشاگران", "The audience loved it.", "تماشاگران عاشقش شدند."),
            v("record label", "شرکت ضبط", "He signed with a record label.", "او با یک شرکت ضبط قرارداد بست."),
            v("contract", "قرارداد", "She signed a contract.", "او قراردادی امضا کرد."),
            v("talent", "استعداد", "She has incredible talent.", "او استعداد باورنکردنی دارد."),
            v("breakthrough", "پیشرفت بزرگ", "It was his breakthrough.", "پیشرفت بزرگش بود."),
            v("audition", "آزمون", "She went to an audition.", "او به یک آزمون رفت."),
            v("stage", "صحنه", "The stage was huge.", "صحنه بزرگ بود."),
            v("compose", "آهنگ ساختن", "He composes his own music.", "او آهنگ‌های خودش را می‌سازد.", "v"),
            v("perform", "اجرا کردن", "She performs live.", "او زنده اجرا می‌کند.", "v"),
            v("influence", "تأثیر", "His music influenced many artists.", "موسیقی‌اش بر بسیاری از هنرمندان تأثیر گذاشت.")
        ),
        listOf(
            GrammarSection("Passive voice with modals", "modal + be + past participle. It can be played. It should be heard."),
            GrammarSection("Passive voice: present perfect", "has/have been + past participle. The song has been streamed millions of times."),
            GrammarSection("Causative: have/get something done", "I had my song recorded. She got her guitar repaired."),
            GrammarSection("Describing music", "It sounds like... / It reminds me of... / It's characterized by...")
        ),
        listOf(
            d("A", "Hey Maria! I just heard an amazing new album. Do you listen to much music?", "هی ماریا! تازه یک آلبوم جدید شگفت‌انگیز شنیدم. زیاد موسیقی گوش می‌دهی؟"),
            d("B", "All the time. Music is essential for me. What album was it?", "همیشه. موسیقی برای من ضروری است. چه آلبومی بود؟"),
            d("A", "It's by a new artist I discovered online. It's a mix of jazz and electronic music.", "از هنرمند جدیدی است که آنلاین کشف کردم. ترکیبی از جاز و موسیقی الکترونیک است."),
            d("B", "That sounds interesting. What's the artist's name?", "جالب به نظر می‌رسد. اسم هنرمند چیست؟"),
            d("A", "I can't pronounce it. It's a French name. But the music is incredible.", "نمی‌توانم تلفظش کنم. اسم فرانسوی است. ولی موسیقی‌اش باورنکردنی است."),
            d("B", "I love discovering new artists. How did you find them?", "عاشق کشف هنرمندان جدیدم. چطور پیدایشان کردی؟"),
            d("A", "Through a streaming service. The algorithm recommended it based on my listening habits.", "از طریق یک سرویس استریم. الگوریتم بر اساس عادات شنیدنم توصیه کرد."),
            d("B", "That's how I find most of my new music too. What's your favorite genre?", "من هم بیشتر موسیقی جدیدم را همینطور پیدا می‌کنم. ژانر مورد علاقه‌ات چیست؟"),
            d("A", "I listen to a bit of everything. Jazz, rock, classical, hip-hop. It depends on my mood.", "کمی از همه چیز گوش می‌دهم. جاز، راک، کلاسیک، هیپ‌هاپ. به حالم بستگی دارد."),
            d("B", "Me too. Music can completely change my mood. What do you listen to when you're stressed?", "من هم. موسیقی می‌تواند کاملاً حالم را تغییر دهد. وقتی استرس داری چه گوش می‌دهی؟"),
            d("A", "Classical music. It calms me down. What about you?", "موسیقی کلاسیک. آرامم می‌کند. تو چطور؟"),
            d("B", "I listen to upbeat pop music. It lifts my spirits.", "موسیقی پاپ شاد گوش می‌دهم. روحم را بالا می‌برد."),
            d("A", "That makes sense. Have you ever been to a live concert?", "منطقی است. هیچ‌وقت کنسرت زنده رفته‌ای؟"),
            d("B", "Yes, many. Live performances are a completely different experience.", "بله، زیاد. اجراهای زنده تجربه کاملاً متفاوتی هستند."),
            d("A", "What's the best concert you've ever been to?", "بهترین کنسرتی که رفته‌ای کدام بود؟"),
            d("B", "A jazz concert in a small club. The audience was so close to the musicians.", "یک کنسرت جاز در باشگاه کوچکی. تماشاگران خیلی به نوازندگان نزدیک بودند."),
            d("A", "That sounds intimate. What was the atmosphere like?", "صمیمی به نظر می‌رسد. فضا چطور بود؟"),
            d("B", "Electric. The musicians were so talented. It was like they were speaking through their instruments.", "برق‌آسا. نوازندگان خیلی بااستعداد بودند. مثل اینکه از طریق سازهایشان صحبت می‌کردند."),
            d("A", "Wow. That sounds unforgettable. Do you play any instruments?", "واو. فراموش‌نشدنی به نظر می‌رسد. ساز می‌نوازی؟"),
            d("B", "I used to play piano when I was younger. But I stopped. What about you?", "قبلاً پیانو می‌نواختم وقتی جوان‌تر بودم. ولی متوقف شدم. تو چطور؟"),
            d("A", "I play guitar. Not very well, but I enjoy it.", "گیتار می‌نوازم. خیلی خوب نه، ولی لذتش را می‌برم."),
            d("B", "That's great. Do you write your own songs?", "عالی است. آهنگ‌های خودت را می‌نویسی؟"),
            d("A", "Sometimes. But I keep them to myself. They're personal.", "گاهی. ولی برای خودم نگه می‌دارم. شخصی هستند."),
            d("B", "I understand that. Music can be very personal. What inspires you?", "می‌فهمم. موسیقی می‌تواند خیلی شخصی باشد. چه چیزی الهام‌بخش توست؟"),
            d("A", "Life experiences, mostly. And other musicians I admire.", "بیشتر تجربیات زندگی. و نوازندگان دیگری که تحسینشان می‌کنم."),
            d("B", "Who are some musicians you admire?", "چه نوازندگانی را تحسین می‌کنی؟"),
            d("A", "I admire artists who write their own music and stay true to themselves.", "هنرمندانی را تحسین می‌کنم که موسیقی خودشان را می‌نویسند و به خودشان وفادار می‌مانند."),
            d("B", "That's admirable. The music industry can be very demanding.", "تحسین‌برانگیز است. صنعت موسیقی می‌تواند خیلی سختگیر باشد."),
            d("A", "It can. Do you think it's harder for musicians today?", "می‌تواند. فکر می‌کنی برای نوازندگان امروز سخت‌تر است؟"),
            d("B", "In some ways, yes. There's more competition. But it's also easier to get your music heard online.", "از برخی جهات، بله. رقابت بیشتری هست. ولی شنیده شدن موسیقی‌ات آنلاین هم آسان‌تر است."),
            d("A", "That's true. The internet has changed everything.", "درست است. اینترنت همه چیز را تغییر داده."),
            d("B", "Exactly. What advice would you give to a young musician?", "دقیقاً. به یک نوازنده جوان چه توصیه‌ای می‌کنی؟"),
            d("A", "Practice constantly. And don't give up. It takes time to get your big break.", "مدام تمرین کن. و تسلیم نشو. زمان می‌برد تا پیشرفت بزرگت اتفاق بیفتد."),
            d("B", "That's good advice. Well, I should go. Let's talk music again soon!", "توصیه خوبی است. خب، باید بروم. بیایید به‌زودی دوباره درباره موسیقی صحبت کنیم!"),
            d("A", "Definitely. See you, Maria!", "قطعاً. می‌بینمت، ماریا!"),
            d("B", "See you, Ali! Bye!", "می‌بینمت، علی! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What genre is the new album Ali discovered?", "A mix of jazz and electronic music."),
            q("What does Maria listen to when stressed?", "Upbeat pop music."),
            q("What was Maria's best concert experience?", "A jazz concert in a small club with an intimate atmosphere."),
            q("What advice does Ali give to young musicians?", "Practice constantly and don't give up."),
            q("The song ___ been streamed millions of times.", listOf("has", "have", "is"), 0),
            q("It can ___ played on any device.", listOf("be", "is", "are"), 0),
            q("I had my song ___.", listOf("record", "recorded", "recording"), 1),
            q("It should ___ heard by everyone.", listOf("be", "is", "are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Big break", "پیشرفت بزرگ", "It takes time to get your big break.", "زمان می‌برد تا پیشرفت بزرگت اتفاق بیفتد."),
            IdiomExpression("Lift my spirits", "روحم را بالا بردن", "Music lifts my spirits.", "موسیقی روحم را بالا می‌برد."),
            IdiomExpression("Stay true to yourself", "به خودت وفادار ماندن", "Stay true to yourself.", "به خودت وفادار بمان."),
            IdiomExpression("Speak through instruments", "از طریق سازها صحبت کردن", "They speak through their instruments.", "از طریق سازهایشان صحبت می‌کنند.")
        ),
        phrasal = listOf(
            PhrasalVerb("find out", "فهمیدن", "discover", "I found out about a new artist.", "درباره هنرمند جدیدی فهمیدم.", "No"),
            PhrasalVerb("give up", "تسلیم شدن", "quit", "Don't give up.", "تسلیم نشو.", "No"),
            PhrasalVerb("come up with", "به ذهن رسیدن", "create", "He came up with a new melody.", "ملودی جدیدی به ذهنش رسید.", "No"),
            PhrasalVerb("look up to", "الگو قرار دادن", "admire", "I look up to many musicians.", "بسیاری از نوازندگان را الگو قرار می‌دهم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Passive with modals", "It CAN BE PLAYED. It SHOULD BE HEARD."),
            PronunciationTip("Present perfect passive", "It HAS BEEN STREAMED millions of times."),
            PronunciationTip("Music vocabulary", "GENre, MELody, LYRics, RHYthm, AUDIence.")
        ),
        culture = listOf(
            CulturalNote("Music genres", "Music genres vary across cultures and often blend to create new styles."),
            CulturalNote("Live music", "Live performances create a unique connection between artists and audiences."),
            CulturalNote("Music industry", "The digital age has transformed how music is produced, distributed, and consumed.")
        ),
        mistakes = listOf(
            CommonMistake("It can is played.", "It can be played.", "Use 'be' after modal in passive."),
            CommonMistake("The song has being streamed.", "The song has been streamed.", "Use 'been' in present perfect passive."),
            CommonMistake("I had my song record.", "I had my song recorded.", "Use past participle in causative."),
            CommonMistake("Don't give up to practice.", "Don't give up practicing.", "Use gerund after 'give up'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Ali and Maria's music preferences?", "Ali listens to a mix of genres depending on mood; Maria listens to pop when stressed."),
            ComprehensionQuestion("What is Maria's concert experience?", "A jazz concert in a small club with an electric atmosphere."),
            ComprehensionQuestion("What are the challenges and opportunities for musicians today?", "More competition, but easier to get music heard online.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss your music preferences.", "درباره ترجیحات موسیقی‌ات صحبت کن.", "I listen to... / It depends on... / My favorite genre is..."),
            SpeakingTask("Talk about a live performance you've attended.", "درباره اجرای زنده‌ای که رفته‌ای صحبت کن.", "The atmosphere was... / The audience... / It was unforgettable..."),
            SpeakingTask("Give advice to an aspiring musician.", "به یک نوازنده مشتاق توصیه کن.", "You should... / Don't give up... / Practice...")
        ),
        writing = listOf(
            WritingTask("Write about a musician or band that has influenced you.", "درباره یک نوازنده یا گروه که بر تو تأثیر گذاشته بنویس.", 180, "Use passive voice with modals.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 7 — Changing times | زمان‌های در حال تغییر
    // Lesson A: Lifestyles in transition / Lesson B: Preserving the past
    // ═══════════════════════════════════════════════════════════════
    private fun unit7() = base(
        7, "Changing times", "زمان‌های در حال تغییر",
        listOf("Discuss lifestyle changes", "Use relative clauses", "Talk about preserving traditions", "Express opinions about progress"),
        listOf(
            v("transition", "گذار", "It's a period of transition.", "دوره گذار است."),
            v("lifestyle", "سبک زندگی", "My lifestyle has changed.", "سبک زندگی‌ام تغییر کرده."),
            v("tradition", "سنت", "It's a family tradition.", "سنت خانوادگی است."),
            v("heritage", "میراث", "Cultural heritage is important.", "میراث فرهنگی مهم است."),
            v("preserve", "حفظ کردن", "We must preserve our traditions.", "باید سنت‌هایمان را حفظ کنیم.", "v"),
            v("modernize", "مدرن کردن", "The city is modernizing.", "شهر در حال مدرن شدن است.", "v"),
            v("generation gap", "شکاف نسلی", "There's a generation gap.", "شکاف نسلی وجود دارد."),
            v("custom", "رسم", "It's an ancient custom.", "رسم باستانی است."),
            v("values", "ارزش‌ها", "Values change over time.", "ارزش‌ها در طول زمان تغییر می‌کنند."),
            v("ancestor", "اجداد", "My ancestors lived here.", "اجدادم اینجا زندگی می‌کردند."),
            v("roots", "ریشه‌ها", "I want to know my roots.", "می‌خواهم ریشه‌هایم را بشناسم."),
            v("adapt", "سازگار شدن", "We must adapt to change.", "باید با تغییر سازگار شویم.", "v"),
            v("nostalgia", "نوستالژی", "I feel nostalgia for the past.", "برای گذشته حس نوستالژی دارم."),
            v("progress", "پیشرفت", "Progress is inevitable.", "پیشرفت اجتناب‌ناپذیر است."),
            v("identity", "هویت", "Our traditions shape our identity.", "سنت‌هایمان هویت‌مان را شکل می‌دهند.")
        ),
        listOf(
            GrammarSection("Defining relative clauses", "who, which, that. Essential information. The traditions that we value."),
            GrammarSection("Non-defining relative clauses", "who, which. Extra information with commas. My grandmother, who lived here, told me stories."),
            GrammarSection("Relative clauses with where/when", "The village where I grew up. The time when things were different."),
            GrammarSection("Optional and required relative pronouns", "The person (who/that) I met. The book (which/that) I read.")
        ),
        listOf(
            d("A", "Hey Maria! I've been thinking a lot about how much things have changed.", "هی ماریا! زیاد به این فکر کرده‌ام که چقدر چیزها تغییر کرده‌اند."),
            d("B", "You mean in general, or in your own life?", "منظورت به طور کلی است، یا در زندگی خودت؟"),
            d("A", "Both, actually. My neighborhood has changed so much in the last ten years.", "راستش هر دو. محله‌ام در ده سال گذشته خیلی تغییر کرده."),
            d("B", "How so?", "چطور؟"),
            d("A", "The old shops that used to be there are gone. Now it's all chain stores and cafes.", "مغازه‌های قدیمی که آنجا بودند از بین رفته‌اند. الان همه فروشگاه‌های زنجیره‌ای و کافه هستند."),
            d("B", "That's happening everywhere. It's hard to preserve the character of a place.", "همه جا همین اتفاق می‌افتد. حفظ شخصیت یک مکان سخت است."),
            d("A", "Exactly. My parents miss the old days when everyone knew each other.", "دقیقاً. والدینم روزهای قدیم را که همه همدیگر را می‌شناختند دلتنگ هستند."),
            d("B", "I understand that. My grandparents feel the same way about their village.", "می‌فهمم. پدربزرگ و مادربزرگم درباره روستایشان همین حس را دارند."),
            d("A", "Do you think we lose something important when things modernize?", "فکر می‌کنی وقتی چیزها مدرن می‌شوند چیز مهمی را از دست می‌دهیم؟"),
            d("B", "In some ways, yes. We lose traditions and customs that were passed down for generations.", "از برخی جهات، بله. سنت‌ها و رسومی که نسل‌ها منتقل شده بودند را از دست می‌دهیم."),
            d("A", "True. But we also gain conveniences and opportunities.", "درست. ولی راحتی‌ها و فرصت‌هایی هم به دست می‌آوریم."),
            d("B", "That's the trade-off. It's a balance between progress and preservation.", "این معاوضه است. تعادل بین پیشرفت و حفظ سنت."),
            d("A", "I agree. What traditions do you think are most important to preserve?", "موافقم. فکر می‌کنی مهم‌ترین سنت‌ها برای حفظ کردن کدامند؟"),
            d("B", "Family traditions, I think. The rituals that bring people together.", "سنت‌های خانوادگی، فکر می‌کنم. آیین‌هایی که مردم را دور هم جمع می‌کنند."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Like celebrating holidays together, cooking special meals, telling stories.", "مثل جشن گرفتن تعطیلات با هم، پختن غذاهای خاص، تعریف داستان‌ها."),
            d("A", "Those are important. My family has a tradition of gathering at my grandmother's house every New Year.", "آن‌ها مهم هستند. خانواده من سنت دارند هر سال نو در خانه مادربزرگم جمع می‌شوند."),
            d("B", "That's lovely. How long has that tradition existed?", "زیباست. چند وقت است که این سنت وجود دارد؟"),
            d("A", "As long as I can remember. At least 50 years.", "از زمانی که یادم می‌آید. حداقل ۵۰ سال."),
            d("B", "That's incredible. It connects you to your ancestors and your roots.", "باورنکردنی است. تو را به اجداد و ریشه‌هایت وصل می‌کند."),
            d("A", "Exactly. Do you have any traditions like that?", "دقیقاً. تو سنتی مثل آن داری؟"),
            d("B", "Yes. My family has a recipe that's been passed down for generations.", "بله. خانواده‌ام دستور پختی دارند که نسل‌ها منتقل شده."),
            d("A", "What's the recipe for?", "دستور پخت چیست؟"),
            d("B", "It's a special bread that we make for weddings and special occasions.", "نان خاصی است که برای عروسی‌ها و مناسبت‌های ویژه می‌پزیم."),
            d("A", "That's a beautiful tradition. Do you know how to make it?", "سنت زیبایی است. می‌دانی چطور درستش کنی؟"),
            d("B", "Yes, my mother taught me. And I'll teach my children someday.", "بله، مادرم یادم داد. و روزی به فرزندانم یاد می‌دهم."),
            d("A", "That's how traditions survive. Through teaching the next generation.", "اینطور سنت‌ها زنده می‌مانند. با آموزش به نسل بعدی."),
            d("B", "Exactly. What about you? Are there traditions you want to pass on?", "دقیقاً. تو چطور؟ سنت‌هایی هست که بخواهی منتقل کنی؟"),
            d("A", "Yes. The New Year gathering, definitely. And my grandfather's stories.", "بله. دورهمی سال نو، قطعاً. و داستان‌های پدربزرگم."),
            d("B", "What kind of stories?", "چه نوع داستان‌هایی؟"),
            d("A", "Stories about our family history, about the village where he grew up.", "داستان‌هایی درباره تاریخ خانواده‌مان، درباره روستایی که در آن بزرگ شد."),
            d("B", "Those are precious. Have you written them down?", "آن‌ها گرانبها هستند. نوشته‌ای‌شان؟"),
            d("A", "Some of them. I should write more before I forget.", "برخی‌شان. باید بیشتر بنویسم قبل از اینکه فراموش کنم."),
            d("B", "You definitely should. Those stories are part of your identity.", "قطعاً باید. آن داستان‌ها بخشی از هویتت هستند."),
            d("A", "I know. Do you think modernization is worth the loss of tradition?", "می‌دانم. فکر می‌کنی مدرن شدن ارزش از دست دادن سنت را دارد؟"),
            d("B", "That's a difficult question. I think we can have both if we're intentional.", "سؤال سختی است. فکر می‌کنم اگر عمدی باشیم می‌توانیم هر دو را داشته باشیم."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "We can embrace progress while actively preserving what matters to us.", "می‌توانیم پیشرفت را بپذیریم در حالی که فعالانه آنچه برایمان مهم است را حفظ می‌کنیم."),
            d("A", "That's a balanced view. I agree.", "دیدگاه متعادلی است. موافقم."),
            d("B", "Well, I should go. This was a meaningful conversation.", "خب، باید بروم. مکالمه معنی‌داری بود."),
            d("A", "It was. Take care, Maria!", "بود. مراقب خودت باش، ماریا!"),
            d("B", "You too, Ali. Bye!", "تو هم، علی. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What has changed in Ali's neighborhood?", "Old shops have been replaced by chain stores and cafes."),
            q("What tradition does Maria's family have?", "A special bread recipe passed down for generations."),
            q("What tradition does Ali want to preserve?", "The New Year gathering and his grandfather's stories."),
            q("What is Maria's view on modernization and tradition?", "We can have both if we're intentional about preserving what matters."),
            q("The traditions ___ we value are important.", listOf("who", "that", "where"), 1),
            q("My grandmother, ___ lived here, told me stories.", listOf("who", "which", "that"), 0),
            q("The village ___ I grew up is beautiful.", listOf("who", "which", "where"), 2),
            q("The time ___ things were different.", listOf("who", "which", "when"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Pass down", "منتقل کردن", "Traditions passed down for generations.", "سنت‌هایی که نسل‌ها منتقل شده‌اند."),
            IdiomExpression("Generation gap", "شکاف نسلی", "There's a generation gap.", "شکاف نسلی وجود دارد."),
            IdiomExpression("Know your roots", "ریشه‌هایت را بشناس", "It connects you to your roots.", "تو را به ریشه‌هایت وصل می‌کند."),
            IdiomExpression("Trade-off", "معاوضه", "It's a trade-off.", "این معاوضه است.")
        ),
        phrasal = listOf(
            PhrasalVerb("pass down", "منتقل کردن", "hand down", "Traditions are passed down.", "سنت‌ها منتقل می‌شوند.", "Yes"),
            PhrasalVerb("grow up", "بزرگ شدن", "spend childhood", "I grew up in a village.", "در روستایی بزرگ شدم.", "No"),
            PhrasalVerb("hold on to", "حفظ کردن", "keep", "Hold on to your traditions.", "سنت‌هایت را حفظ کن.", "No"),
            PhrasalVerb("do away with", "حذف کردن", "eliminate", "Don't do away with old customs.", "رسوم قدیمی را حذف نکن.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Relative clauses", "The traditions THAT we value. The village WHERE I grew up."),
            PronunciationTip("Non-defining clauses", "My grandmother, WHO lived here, told me stories."),
            PronunciationTip("Changing times vocabulary", "TRANsition, LIFEstyle, HERitage, PREserve.")
        ),
        culture = listOf(
            CulturalNote("Preserving traditions", "Many cultures actively work to preserve traditions while embracing modernization."),
            CulturalNote("Generation gap", "Differences in values and habits between generations are common worldwide."),
            CulturalNote("Cultural heritage", "UNESCO recognizes cultural heritage sites and traditions as important to humanity.")
        ),
        mistakes = listOf(
            CommonMistake("The traditions who we value.", "The traditions that we value.", "Use 'that' or 'which' for things."),
            CommonMistake("My grandmother, that lived here.", "My grandmother, who lived here.", "Use 'who' for people in non-defining clauses."),
            CommonMistake("The village which I grew up.", "The village where I grew up.", "Use 'where' for places."),
            CommonMistake("The time which things were different.", "The time when things were different.", "Use 'when' for times.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What changes has Ali's neighborhood undergone?", "Old shops replaced by chain stores and cafes."),
            ComprehensionQuestion("What traditions do they value?", "Family gatherings, recipes, and stories passed down through generations."),
            ComprehensionQuestion("What is their conclusion about progress and tradition?", "We can embrace progress while actively preserving what matters.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss changes in your community.", "درباره تغییرات در جامعه‌ات صحبت کن.", "It used to be... / Now it's... / The change has been..."),
            SpeakingTask("Talk about a family tradition you value.", "درباره یک سنت خانوادگی که برایت ارزشمند است صحبت کن.", "We always... / It's been a tradition for... / My grandmother taught me..."),
            SpeakingTask("Express your views on preserving traditions.", "نظراتت را درباره حفظ سنت‌ها بیان کن.", "It's important to... / We should... / Traditions connect us to...")
        ),
        writing = listOf(
            WritingTask("Write about a tradition in your family and why it matters.", "درباره یک سنت در خانواده‌ات و اینکه چرا مهم است بنویس.", 180, "Use relative clauses.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 8 — Consumer culture | فرهنگ مصرف‌گرایی
    // Lesson A: What's new on the market? / Lesson B: Consumer beware
    // ═══════════════════════════════════════════════════════════════
    private fun unit8() = base(
        8, "Consumer culture", "فرهنگ مصرف‌گرایی",
        listOf("Discuss consumerism", "Use passive voice in perfect tenses", "Talk about advertising", "Express opinions about consumer rights"),
        listOf(
            v("consumer", "مصرف‌کننده", "Consumers have rights.", "مصرف‌کنندگان حقوق دارند."),
            v("consumerism", "مصرف‌گرایی", "Consumerism drives the economy.", "مصرف‌گرایی اقتصاد را هدایت می‌کند."),
            v("advertisement", "تبلیغات", "Advertisements are everywhere.", "تبلیغات همه جا هستند."),
            v("brand", "برند", "I prefer this brand.", "این برند را ترجیح می‌دهم."),
            v("product", "محصول", "The product is high quality.", "محصول باکیفیت است."),
            v("warranty", "گارانتی", "Does it have a warranty?", "گارانتی دارد؟"),
            v("refund", "بازپرداخت", "I want a refund.", "بازپرداخت می‌خواهم."),
            v("complaint", "شکایت", "I have a complaint.", "شکایتی دارم."),
            v("marketing", "بازاریابی", "Marketing influences us.", "بازاریابی بر ما تأثیر می‌گذارد."),
            v("impulse buy", "خرید لحظه‌ای", "It was an impulse buy.", "خرید لحظه‌ای بود."),
            v("budget", "بودجه", "I need to stick to my budget.", "باید به بودجه‌ام پایبند باشم."),
            v("spending", "خرج کردن", "I need to control my spending.", "باید خرج کردنم را کنترل کنم."),
            v("quality", "کیفیت", "Quality matters.", "کیفیت مهم است."),
            v("counterfeit", "تقلبی", "It's a counterfeit product.", "محصول تقلبی است.", "adj"),
            v("ethical", "اخلاقی", "Is it ethical to buy that?", "خرید آن اخلاقی است؟", "adj")
        ),
        listOf(
            GrammarSection("Passive voice: present perfect", "has/have been + past participle. The product has been recalled."),
            GrammarSection("Passive voice: past perfect", "had been + past participle. The item had been sold before I arrived."),
            GrammarSection("Passive voice with future", "will be + past participle. The new model will be released next month."),
            GrammarSection("Passive with gerunds", "being + past participle. I don't like being pressured to buy.")
        ),
        listOf(
            d("A", "Hey Maria! I just got back from the mall. I spent way too much money.", "هی ماریا! تازه از مال برگشتم. خیلی زیاد خرج کردم."),
            d("B", "Ha! What did you buy?", "ها! چه خریدی؟"),
            d("A", "A new jacket. But I didn't need it. It was an impulse buy.", "یک کاپشن جدید. ولی لازمش نداشتم. خرید لحظه‌ای بود."),
            d("B", "I know that feeling. Marketing is designed to make us buy things we don't need.", "آن حس را می‌شناسم. بازاریابی طوری طراحی شده که چیزهایی که لازم نداریم بخریم."),
            d("A", "Exactly. The advertisements are everywhere. We're constantly being targeted.", "دقیقاً. تبلیغات همه جا هستند. مدام هدف قرار می‌گیریم."),
            d("B", "It's true. Have you ever bought something and immediately regretted it?", "درست است. هیچ‌وقت چیزی خریده‌ای و فوراً پشیمان شده‌ای؟"),
            d("A", "All the time. Last month I bought a gadget that I've never used.", "همیشه. ماه گذشته یک گجت خریدم که هرگز استفاده نکرده‌ام."),
            d("B", "What was it?", "چه بود؟"),
            d("A", "A smart water bottle. It tracks how much you drink. It was a waste of money.", "یک بطری آب هوشمند. ردیابی می‌کند چقدر می‌نوشی. هدر دادن پول بود."),
            d("B", "Ha! That's such a gimmick. Have you tried to return it?", "ها! خیلی کلاه‌برداری است. سعی کرده‌ای برگردانی‌اش؟"),
            d("A", "No, I lost the receipt. And the warranty had expired.", "نه، رسید را گم کردم. و گارانتی منقضی شده بود."),
            d("B", "That's frustrating. I've been there. Now I always keep my receipts.", "آزاردهنده است. من هم این را تجربه کرده‌ام. حالا همیشه رسیدهایم را نگه می‌دارم."),
            d("A", "Smart. Have you ever made a complaint about a product?", "هوشمندانه. هیچ‌وقت درباره محصولی شکایت کرده‌ای؟"),
            d("B", "Yes, once. I bought headphones that broke after a week. I demanded a refund.", "بله، یک بار. هدفونی خریدم که بعد از یک هفته خراب شد. بازپرداخت خواستم."),
            d("A", "Did you get it?", "گرفتی؟"),
            d("B", "Yes, but it took a lot of emails and phone calls. They made it difficult.", "بله، ولی ایمیل و تماس تلفنی زیادی برد. سختش کردند."),
            d("A", "That's so common. Companies try to avoid giving refunds.", "خیلی رایج است. شرکت‌ها سعی می‌کنند از بازپرداخت اجتناب کنند."),
            d("B", "Exactly. But I was persistent. The consumer has rights.", "دقیقاً. ولی سماجت کردم. مصرف‌کننده حقوق دارد."),
            d("A", "True. Do you think advertising is ethical?", "درست. فکر می‌کنی تبلیغات اخلاقی است؟"),
            d("B", "That's a big question. Some advertising is informative. But a lot of it is manipulative.", "سؤال بزرگی است. برخی تبلیغات آموزنده هستند. ولی خیلی‌شان دستکاری‌کننده هستند."),
            d("A", "I agree. They create insecurities to sell products.", "موافقم. برای فروش محصولات ناامنی ایجاد می‌کنند."),
            d("B", "Exactly. Especially the beauty industry. They make people feel inadequate.", "دقیقاً. مخصوصاً صنعت زیبایی. باعث می‌شوند مردم احساس کمبود کنند."),
            d("A", "It's sad. Do you think consumerism makes us happier?", "غمگین‌کننده است. فکر می‌کنی مصرف‌گرایی ما را شادتر می‌کند؟"),
            d("B", "Not really. Research shows that experiences make us happier than possessions.", "نه واقعاً. تحقیقات نشان می‌دهد تجربیات ما را شادتر از دارایی‌ها می‌کنند."),
            d("A", "That's true for me. I'd rather travel than buy things.", "برای من درست است. ترجیح می‌دهم سفر کنم تا چیز بخرم."),
            d("B", "Me too. What's the best purchase you've ever made?", "من هم. بهترین خریدی که کرده‌ای چیست؟"),
            d("A", "Probably my laptop. I use it every day for work and hobbies.", "احتمالاً لپ‌تاپم. هر روز برای کار و سرگرمی استفاده می‌کنم."),
            d("B", "That's a good one. What about the worst?", "گزینه خوبی است. بدترین چطور؟"),
            d("A", "That smart water bottle. Or maybe a pair of shoes I never wore.", "همان بطری آب هوشمند. یا شاید یک جفت کفش که هرگز نپوشیدم."),
            d("B", "Ha! We all have those. Do you try to buy ethical products?", "ها! همه ما آن‌ها را داریم. سعی می‌کنی محصولات اخلاقی بخری؟"),
            d("A", "I try. I avoid fast fashion and buy from companies with good practices.", "سعی می‌کنم. از مد سریع اجتناب می‌کنم و از شرکت‌هایی با رویه‌های خوب می‌خرم."),
            d("B", "That's commendable. It's not always easy or affordable.", "تحسین‌برانگیز است. همیشه آسان یا مقرون‌به‌صرفه نیست."),
            d("A", "I know. But I think it's worth it. What about you?", "می‌دانم. ولی فکر می‌کنم ارزشش را دارد. تو چطور؟"),
            d("B", "I try to buy local and seasonal food. And I avoid single-use plastics.", "سعی می‌کنم غذای محلی و فصلی بخرم. و از پلاستیک‌های یکبار مصرف اجتناب می‌کنم."),
            d("A", "Those are good habits. Small changes make a difference.", "عادت‌های خوبی هستند. تغییرات کوچک تفاوت ایجاد می‌کنند."),
            d("B", "Exactly. Do you think the government should regulate advertising?", "دقیقاً. فکر می‌کنی دولت باید تبلیغات را مقررات‌گذاری کند؟"),
            d("A", "To some extent, yes. Especially advertising to children.", "تا حدی، بله. مخصوصاً تبلیغات برای کودکان."),
            d("B", "I agree. Children are especially vulnerable.", "موافقم. کودکان مخصوصاً آسیب‌پذیر هستند."),
            d("A", "Exactly. Well, I should go. I need to return that jacket.", "دقیقاً. خب، باید بروم. باید آن کاپشن را برگردانم."),
            d("B", "Ha! Good luck with the return!", "ها! موفق باشی در برگرداندن!"),
            d("A", "Thanks. See you soon, Maria!", "ممنون. به‌زودی می‌بینمت، ماریا!"),
            d("B", "See you, Ali! Bye!", "می‌بینمت، علی! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What was Ali's impulse buy?", "A smart water bottle."),
            q("What did Maria do when her headphones broke?", "She demanded a refund and was persistent."),
            q("What makes people happier according to research?", "Experiences make us happier than possessions."),
            q("What ethical choices do they make?", "Ali avoids fast fashion; Maria buys local and avoids plastics."),
            q("The product ___ been recalled.", listOf("has", "have", "is"), 0),
            q("The item ___ been sold before I arrived.", listOf("has", "had", "have"), 1),
            q("The new model ___ be released next month.", listOf("will", "is", "are"), 0),
            q("I don't like ___ pressured to buy.", listOf("be", "being", "been"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Impulse buy", "خرید لحظه‌ای", "It was an impulse buy.", "خرید لحظه‌ای بود."),
            IdiomExpression("Waste of money", "هدر دادن پول", "It was a waste of money.", "هدر دادن پول بود."),
            IdiomExpression("I've been there", "من هم این را تجربه کرده‌ام", "I've been there.", "من هم این را تجربه کرده‌ام."),
            IdiomExpression("Make a difference", "تفاوت ایجاد کردن", "Small changes make a difference.", "تغییرات کوچک تفاوت ایجاد می‌کنند.")
        ),
        phrasal = listOf(
            PhrasalVerb("return", "برگرداندن", "give back", "I need to return this jacket.", "باید این کاپشن را برگردانم.", "No"),
            PhrasalVerb("come up with", "به ذهن رسیدن", "create", "They came up with a new ad.", "تبلیغ جدیدی به ذهنشان رسید.", "No"),
            PhrasalVerb("cut down on", "کم کردن", "reduce", "I should cut down on spending.", "باید خرج کردنم را کم کنم.", "No"),
            PhrasalVerb("give in", "تسلیم شدن", "yield", "Don't give in to marketing.", "به بازاریابی تسلیم نشو.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Passive perfect", "The product HAS BEEN recalled. It HAD BEEN sold."),
            PronunciationTip("Future passive", "The new model WILL BE released."),
            PronunciationTip("Consumer vocabulary", "conSUMER, conSUMERism, ADvertisement, WARranty.")
        ),
        culture = listOf(
            CulturalNote("Consumerism", "Consumer culture varies across countries and is influenced by economic and social factors."),
            CulturalNote("Advertising ethics", "Many countries regulate advertising, especially to children."),
            CulturalNote("Ethical consumption", "Buying local, sustainable, and ethical products is a growing trend.")
        ),
        mistakes = listOf(
            CommonMistake("The product has being recalled.", "The product has been recalled.", "Use 'been' in present perfect passive."),
            CommonMistake("The item had being sold.", "The item had been sold.", "Use 'been' in past perfect passive."),
            CommonMistake("The model will be release.", "The model will be released.", "Use past participle in passive."),
            CommonMistake("I don't like being pressure.", "I don't like being pressured.", "Use past participle in passive gerund.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What was Ali's worst purchase?", "A smart water bottle he never used."),
            ComprehensionQuestion("What did Maria do when her headphones broke?", "She demanded a refund and persisted until she got it."),
            ComprehensionQuestion("What ethical consumption habits do they have?", "Ali avoids fast fashion; Maria buys local and avoids single-use plastics.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a purchase you regret.", "درباره خریدی که پشیمان شده‌ای صحبت کن.", "It was an impulse buy... / I should have... / I learned..."),
            SpeakingTask("Talk about advertising and its influence.", "درباره تبلیغات و تأثیرش صحبت کن.", "Advertisements... / They make us feel... / Some are ethical..."),
            SpeakingTask("Discuss ethical consumption.", "درباره مصرف اخلاقی صحبت کن.", "I try to... / I avoid... / It's important to...")
        ),
        writing = listOf(
            WritingTask("Write about the influence of advertising on consumer behavior.", "درباره تأثیر تبلیغات بر رفتار مصرف‌کننده بنویس.", 180, "Use passive voice in perfect tenses.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 9 — Animals | حیوانات
    // Lesson A: Animals in our lives / Lesson B: People and their pets
    // ═══════════════════════════════════════════════════════════════
    private fun unit9() = base(
        9, "Animals", "حیوانات",
        listOf("Discuss animals and pets", "Use gerunds and infinitives", "Talk about animal welfare", "Express opinions about zoos"),
        listOf(
            v("pet", "حیوان خانگی", "I have a pet cat.", "یک گربه خانگی دارم."),
            v("wildlife", "حیات وحش", "We must protect wildlife.", "باید از حیات وحش محافظت کنیم."),
            v("endangered", "در خطر انقراض", "Many species are endangered.", "گونه‌های زیادی در خطرند.", "adj"),
            v("species", "گونه", "This species is rare.", "این گونه نادر است."),
            v("habitat", "زیستگاه", "Their habitat is shrinking.", "زیستگاهشان در حال کوچک شدن است."),
            v("extinction", "انقراض", "Extinction is irreversible.", "انقراض برگشت‌ناپذیر است."),
            v("conservation", "حفاظت", "Conservation efforts are important.", "تلاش‌های حفاظتی مهم هستند."),
            v("domesticated", "اهلی", "Dogs are domesticated.", "سگ‌ها اهلی هستند.", "adj"),
            v("loyal", "وفادار", "Dogs are very loyal.", "سگ‌ها خیلی وفادار هستند.", "adj"),
            v("companionship", "همراهی", "Pets offer companionship.", "حیوانات خانگی همراهی می‌کنند."),
            v("welfare", "رفاه", "Animal welfare is important.", "رفاه حیوانات مهم است."),
            v("cruelty", "ظلم", "Cruelty to animals is unacceptable.", "ظلم به حیوانات غیرقابل قبول است."),
            v("sanctuary", "پناهگاه", "It's an animal sanctuary.", "پناهگاه حیوانات است."),
            v("adopt", "به فرزندی گرفتن", "We adopted a dog.", "یک سگ به فرزندی گرفتیم.", "v"),
            v("breed", "نژاد", "What breed is it?", "چه نژادی است؟")
        ),
        listOf(
            GrammarSection("Gerunds as subjects and objects", "Learning about animals is fascinating. I enjoy watching documentaries."),
            GrammarSection("Infinitives after verbs", "want, decide, hope, plan, need. I want to adopt a pet."),
            GrammarSection("Gerunds after prepositions", "interested in, good at, afraid of, tired of. I'm interested in wildlife conservation."),
            GrammarSection("Verb + object + infinitive", "allow, encourage, persuade, remind. They encourage people to adopt." )
        ),
        listOf(
            d("A", "Hey Maria! I'm thinking about adopting a pet. What do you think?", "هی ماریا! دارم فکر می‌کنم حیوان خانگی بگیرم. نظرت چیست؟"),
            d("B", "That's a big decision. Have you thought about the responsibility?", "تصمیم بزرگی است. به مسئولیتش فکر کرده‌ای؟"),
            d("A", "Yes, I have. I've wanted a dog for years. I think I'm ready.", "بله، فکر کرده‌ام. سال‌هاست سگ می‌خواهم. فکر می‌کنم آماده‌ام."),
            d("B", "Dogs are wonderful companions. They're loyal and loving.", "سگ‌ها همراهان شگفت‌انگیزی هستند. وفادار و دوست‌داشتنی هستند."),
            d("A", "Exactly. And I think having a dog would encourage me to exercise more.", "دقیقاً. و فکر می‌کنم داشتن سگ تشویقم می‌کند بیشتر ورزش کنم."),
            d("B", "That's a great benefit. Have you thought about adopting from a shelter?", "فایده بزرگی است. به فرزندخواندگی از پناهگاه فکر کرده‌ای؟"),
            d("A", "Yes, definitely. I want to give a home to a dog that needs one.", "بله، قطعاً. می‌خواهم به سگی که نیاز دارد خانه بدهم."),
            d("B", "That's admirable. Too many animals are abandoned every year.", "تحسین‌برانگیز است. سالانه حیوانات زیادی رها می‌شوند."),
            d("A", "I know. It breaks my heart. What about you? Do you have pets?", "می‌دانم. قلبم را می‌شکند. تو چطور؟ حیوان خانگی داری؟"),
            d("B", "Yes, I have a cat. She's been with me for five years.", "بله، یک گربه دارم. پنج سال است با من است."),
            d("A", "What's her name?", "اسمش چیست؟"),
            d("B", "Luna. She's very independent but affectionate when she wants to be.", "لونا. خیلی مستقل است ولی وقتی بخواهد محبت‌آمیز است."),
            d("A", "That sounds like a cat! Are cats easier to take care of than dogs?", "مثل یک گربه به نظر می‌رسد! نگهداری گربه‌ها آسان‌تر از سگ‌هاست؟"),
            d("B", "In some ways, yes. They don't need walks. But they have their own challenges.", "از برخی جهات، بله. به پیاده‌روی نیاز ندارند. ولی چالش‌های خودشان را دارند."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Like scratching furniture and waking you up at 5 AM for food.", "مثل خط انداختن روی مبل و بیدار کردنت در ۵ صبح برای غذا."),
            d("A", "Ha! That doesn't sound fun. But I'm sure the companionship is worth it.", "ها! سرگرم‌کننده به نظر نمی‌رسد. ولی مطمئنم همراهی‌اش ارزشش را دارد."),
            d("B", "It is. She makes me laugh every day. What about wildlife? Do you care about it?", "هست. هر روز خنداندم می‌کند. حیات وحش چطور؟ برایت مهم است؟"),
            d("A", "Very much. I'm interested in conservation efforts. So many species are endangered.", "خیلی زیاد. به تلاش‌های حفاظتی علاقه‌مندم. گونه‌های زیادی در خطرند."),
            d("B", "It's heartbreaking. Climate change and habitat loss are huge threats.", "قلب‌شکن است. تغییرات اقلیمی و از دست دادن زیستگاه تهدیدهای بزرگی هستند."),
            d("A", "I agree. Do you think zoos help or hurt animals?", "موافقم. فکر می‌کنی باغ‌وحش‌ها به حیوانات کمک می‌کنند یا آسیب می‌زنند؟"),
            d("B", "That's controversial. Some zoos do important conservation work. Others are just for entertainment.", "جنجالی است. برخی باغ‌وحش‌ها کار حفاظتی مهمی انجام می‌دهند. دیگران فقط برای سرگرمی هستند."),
            d("A", "True. I think the good ones play a role in education and breeding programs.", "درست. فکر می‌کنم باغ‌وحش‌های خوب در آموزش و برنامه‌های پرورش نقش دارند."),
            d("B", "I agree. But animals should have space and proper care. Not just small cages.", "موافقم. ولی حیوانات باید فضا و مراقبت مناسب داشته باشند. نه فقط قفس‌های کوچک."),
            d("A", "Exactly. What about animal testing for cosmetics?", "دقیقاً. آزمایش روی حیوانات برای لوازم آرایش چطور؟"),
            d("B", "I'm completely against it. There are better alternatives now.", "کاملاً مخالفم. الان جایگزین‌های بهتری وجود دارد."),
            d("A", "Me too. I only buy cruelty-free products.", "من هم. فقط محصولات بدون ظلم می‌خرم."),
            d("B", "That's a good choice. Do you think animal welfare laws are strong enough?", "انتخاب خوبی است. فکر می‌کنی قوانین رفاه حیوانات به اندازه کافی قوی هستند؟"),
            d("A", "Not in many countries. There's still a lot of cruelty that goes unpunished.", "در بسیاری از کشورها نه. هنوز ظلم زیادی هست که مجازات نمی‌شود."),
            d("B", "It's sad. What can individuals do to help?", "غمگین‌کننده است. افراد چه می‌توانند بکنند؟"),
            d("A", "Adopt, don't shop. Support conservation organizations. And be kind to all animals.", "فرزندخواندگی بگیر، نخر. از سازمان‌های حفاظتی حمایت کن. و با همه حیوانات مهربان باش."),
            d("B", "Those are great suggestions. Have you decided on a dog yet?", "پیشنهادهای عالی‌ای هستند. هنوز درباره سگ تصمیم گرفته‌ای؟"),
            d("A", "Not yet. I'm still looking. I want to find the right match.", "هنوز نه. هنوز جستجو می‌کنم. می‌خواهم مطابق درست را پیدا کنم."),
            d("B", "Take your time. It's a lifelong commitment.", "عجله نکن. تعهدی مادام‌العمر است."),
            d("A", "I will. Well, I should go. Thanks for the advice!", "می‌کنم. خب، باید بروم. ممنون برای توصیه!"),
            d("B", "Anytime. Good luck with your search!", "هر وقت. موفق باشی در جستجو!"),
            d("A", "Thanks. See you soon!", "ممنون. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Why does Ali want to adopt a dog?", "For companionship and to encourage exercise."),
            q("What is Maria's cat like?", "Independent but affectionate; scratches furniture and wakes her up."),
            q("What is Maria's view on zoos?", "Some do important conservation work; others are just for entertainment."),
            q("What can individuals do to help animals?", "Adopt, support conservation organizations, and be kind."),
            q("I enjoy ___ documentaries about animals.", listOf("watch", "to watch", "watching"), 2),
            q("I want ___ a pet.", listOf("adopt", "to adopt", "adopting"), 1),
            q("I'm interested in ___ wildlife.", listOf("conserve", "to conserve", "conserving"), 2),
            q("They encourage people ___ animals.", listOf("adopt", "to adopt", "adopting"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Breaks my heart", "قلبم را می‌شکند", "It breaks my heart.", "قلبم را می‌شکند."),
            IdiomExpression("Adopt, don't shop", "فرزندخواندگی بگیر، نخر", "Adopt, don't shop.", "فرزندخواندگی بگیر، نخر."),
            IdiomExpression("Cruelty-free", "بدون ظلم", "I buy cruelty-free products.", "محصولات بدون ظلم می‌خرم."),
            IdiomExpression("Lifelong commitment", "تعهد مادام‌العمر", "It's a lifelong commitment.", "تعهدی مادام‌العمر است.")
        ),
        phrasal = listOf(
            PhrasalVerb("take care of", "مراقبت کردن", "look after", "You have to take care of a pet.", "باید از حیوان خانگی مراقبت کنی.", "No"),
            PhrasalVerb("give up", "رها کردن", "abandon", "Don't give up your pet.", "حیوان خانگی‌ات را رها نکن.", "No"),
            PhrasalVerb("look after", "مراقبت کردن", "take care of", "She looks after stray cats.", "او از گربه‌های ولگرد مراقبت می‌کند.", "No"),
            PhrasalVerb("come across", "تصادفاً دیدن", "encounter", "I came across an injured bird.", "تصادفاً یک پرنده مجروح دیدم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Gerunds", "I ENjoy WATCHing. I'm INterested in CONserving."),
            PronunciationTip("Infinitives", "I WANT to ADOPT. They ENcourage people to HELP."),
            PronunciationTip("Animal vocabulary", "WILDlife, enDANgered, HABitat, conSERvation.")
        ),
        culture = listOf(
            CulturalNote("Pet ownership", "Pet ownership varies across cultures; dogs and cats are most common."),
            CulturalNote("Animal welfare", "Laws protecting animals vary widely by country."),
            CulturalNote("Conservation", "Wildlife conservation is a global effort involving governments and NGOs.")
        ),
        mistakes = listOf(
            CommonMistake("I enjoy to watch documentaries.", "I enjoy watching documentaries.", "Use gerund after 'enjoy'."),
            CommonMistake("I want adopting a pet.", "I want to adopt a pet.", "Use infinitive after 'want'."),
            CommonMistake("I'm interested in conserve wildlife.", "I'm interested in conserving wildlife.", "Use gerund after preposition."),
            CommonMistake("They encourage people adopt.", "They encourage people to adopt.", "Use 'to + verb' after encourage + object.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Ali's reasons for adopting a dog?", "Companionship and motivation to exercise."),
            ComprehensionQuestion("What are Maria's views on animal welfare?", "Against animal testing, supports conservation, believes laws need strengthening."),
            ComprehensionQuestion("What advice do they give about helping animals?", "Adopt, don't shop; support conservation; be kind to all animals.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss the benefits of having a pet.", "درباره فواید داشتن حیوان خانگی صحبت کن.", "Pets provide... / They help with... / I enjoy..."),
            SpeakingTask("Talk about animal welfare issues.", "درباره مسائل رفاه حیوانات صحبت کن.", "I'm against... / We should... / It's important to..."),
            SpeakingTask("Express your opinion about zoos.", "نظرت را درباره باغ‌وحش‌ها بیان کن.", "I think... / Some zoos... / Animals should...")
        ),
        writing = listOf(
            WritingTask("Write about the importance of animal conservation.", "درباره اهمیت حفاظت از حیوانات بنویس.", 180, "Use gerunds and infinitives.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 10 — Language | زبان
    // Lesson A: Communication skills / Lesson B: Great communicators
    // ═══════════════════════════════════════════════════════════════
    private fun unit10() = base(
        10, "Language", "زبان",
        listOf("Discuss language learning", "Use reported speech", "Talk about communication skills", "Express opinions about language"),
        listOf(
            v("fluent", "روان", "She's fluent in three languages.", "او در سه زبان روان است.", "adj"),
            v("bilingual", "دوزبانه", "He's bilingual.", "او دوزبانه است.", "adj"),
            v("mother tongue", "زبان مادری", "What's your mother tongue?", "زبان مادری‌ات چیست؟"),
            v("accent", "لهجه", "She has a British accent.", "او لهجه بریتانیایی دارد."),
            v("dialect", "گویش", "It's a regional dialect.", "گویش منطقه‌ای است."),
            v("vocabulary", "واژگان", "My vocabulary is growing.", "واژگانم در حال رشد است."),
            v("grammar", "گرامر", "Grammar is important.", "گرامر مهم است."),
            v("pronunciation", "تلفظ", "Practice your pronunciation.", "تلفظت را تمرین کن."),
            v("immersion", "غرق شدن", "Immersion is the best way to learn.", "غرق شدن بهترین راه یادگیری است."),
            v("communicate", "ارتباط برقرار کردن", "We communicate daily.", "هر روز ارتباط برقرار می‌کنیم.", "v"),
            v("interpret", "تفسیر کردن", "Can you interpret this?", "می‌توانی این را تفسیر کنی؟", "v"),
            v("translate", "ترجمه کردن", "Translate this for me.", "این را برایم ترجمه کن.", "v"),
            v("express", "بیان کردن", "Express yourself clearly.", "خودت را واضح بیان کن.", "v"),
            v("persuade", "متقاعد کردن", "He persuaded me.", "او متقاعدم کرد.", "v"),
            v("eloquent", "شیوا", "She's an eloquent speaker.", "او سخنران شیوایی است.", "adj")
        ),
        listOf(
            GrammarSection("Reported speech: statements", "He said (that) he was learning Spanish. She told me she spoke three languages."),
            GrammarSection("Reported speech: questions", "He asked how long I had been studying. She asked if I was fluent."),
            GrammarSection("Tense changes", "Present to past, will to would, can to could, present perfect to past perfect."),
            GrammarSection("Reporting verbs", "say, tell, ask, mention, claim, admit, deny, explain, suggest.")
        ),
        listOf(
            d("A", "Hey Maria! I've been thinking about learning a new language. Any advice?", "هی ماریا! به یادگیری زبان جدیدی فکر کرده‌ام. توصیه‌ای داری؟"),
            d("B", "That's exciting! Which language are you thinking about?", "هیجان‌انگیز است! به چه زبانی فکر می‌کنی؟"),
            d("A", "Spanish, probably. It's useful and not too difficult for English speakers.", "احتمالاً اسپانیایی. مفید است و برای انگلیسی‌زبان‌ها خیلی سخت نیست."),
            d("B", "That's a good choice. I've been learning Spanish for two years now.", "انتخاب خوبی است. دو سال است اسپانیایی یاد می‌گیرم."),
            d("A", "Really? How fluent are you?", "واقعاً؟ چقدر روان هستی؟"),
            d("B", "I can have conversations, but I'm not completely fluent yet. I still make mistakes.", "می‌توانم مکالمه کنم، ولی هنوز کاملاً روان نیستم. هنوز اشتباه می‌کنم."),
            d("A", "That's impressive. What's the best way to learn?", "تحسین‌برانگیز است. بهترین راه یادگیری چیست؟"),
            d("B", "Immersion, definitely. The more you surround yourself with the language, the faster you learn.", "قطعاً غرق شدن. هرچه بیشتر خودت را با زبان احاطه کنی، سریع‌تر یاد می‌گیری."),
            d("A", "Like watching movies and listening to music?", "مثل تماشای فیلم و گوش دادن به موسیقی؟"),
            d("B", "Yes, and talking to native speakers. That's the most important part.", "بله، و صحبت با بومی‌ها. مهم‌ترین بخش همین است."),
            d("A", "I'm a bit nervous about speaking. I don't want to sound stupid.", "درباره صحبت کردن کمی مضطربم. نمی‌خواهم احمق به نظر برسم."),
            d("B", "Everyone feels that way at first. But you have to make mistakes to learn.", "همه اولش همین حس را دارند. ولی برای یادگیری باید اشتباه کنی."),
            d("A", "I know. What mistakes did you make when you started?", "می‌دانم. وقتی شروع کردی چه اشتباهاتی کردی؟"),
            d("B", "I once told someone I was pregnant when I meant to say I was embarrassed.", "یک بار به کسی گفتم باردارم وقتی می‌خواستم بگویم خجالت‌زده‌ام."),
            d("A", "Ha! That's hilarious. What happened?", "ها! خنده‌دار است. چه اتفاقی افتاد؟"),
            d("B", "The person looked very confused. But we laughed about it later.", "طرف خیلی گیج به نظر می‌رسید. ولی بعداً به آن خندیدیم."),
            d("A", "At least you can laugh at yourself. That's important.", "حداقل می‌توانی به خودت بخندی. این مهم است."),
            d("B", "Exactly. Don't take yourself too seriously when learning a language.", "دقیقاً. موقع یادگیری زبان خودت را زیاد جدی نگیر."),
            d("A", "Good advice. Do you think some people are naturally better at languages?", "توصیه خوبی است. فکر می‌کنی برخی افراد ذاتاً در زبان بهترند؟"),
            d("B", "Maybe. But effort matters more than talent. Anyone can learn with enough practice.", "شاید. ولی تلاش مهم‌تر از استعداد است. هر کسی با تمرین کافی می‌تواند یاد بگیرد."),
            d("A", "That's encouraging. What about you? Do you want to learn another language?", "تشویق‌کننده است. تو چطور؟ می‌خواهی زبان دیگری یاد بگیری؟"),
            d("B", "Yes, I'd love to learn Italian. It's beautiful.", "بله، دوست دارم ایتالیایی یاد بگیرم. زیباست."),
            d("A", "Why Italian?", "چرا ایتالیایی؟"),
            d("B", "I love Italian culture and food. And it's similar to Spanish, so it might be easier.", "عاشق فرهنگ و غذای ایتالیایی‌ام. و به اسپانیایی شبیه است، پس ممکن است آسان‌تر باشد."),
            d("A", "That makes sense. Have you ever been to Italy?", "منطقی است. هیچ‌وقت به ایتالیا رفته‌ای؟"),
            d("B", "Yes, twice. I fell in love with the country. The people were so warm.", "بله، دو بار. عاشق کشورش شدم. مردمش خیلی گرم بودند."),
            d("A", "Did you try speaking Italian there?", "آنجا سعی کردی ایتالیایی صحبت کنی؟"),
            d("B", "A little. I knew some basic phrases. The locals appreciated the effort.", "کمی. چند عبارت پایه می‌دانستم. locals تلاشم را قدر دانستند."),
            d("A", "That's what I've heard. People appreciate when you try to speak their language.", "همین را شنیده‌ام. مردم وقتی سعی می‌کنی زبانشان را صحبت کنی قدر می‌دانند."),
            d("B", "Exactly. Even a few words can make a big difference.", "دقیقاً. حتی چند کلمه می‌تواند تفاوت بزرگی ایجاد کند."),
            d("A", "Do you think language learning changes your personality?", "فکر می‌کنی یادگیری زبان شخصیتت را تغییر می‌دهد؟"),
            d("B", "That's interesting. I think I'm more outgoing when I speak Spanish.", "جالب است. فکر می‌کنم وقتی اسپانیایی صحبت می‌کنم اجتماعی‌ترم."),
            d("A", "Why is that?", "چرا؟"),
            d("B", "Maybe because I feel less pressure. I'm not expected to be perfect.", "شاید چون فشار کمتری حس می‌کنم. انتظار نمی‌رود کامل باشم."),
            d("A", "That's a good point. We should give ourselves permission to be imperfect.", "نکته خوبی است. باید به خودمان اجازه ناقص بودن بدهیم."),
            d("B", "Exactly. What's your biggest challenge with learning Spanish?", "دقیقاً. بزرگ‌ترین چالشت در یادگیری اسپانیایی چیست؟"),
            d("A", "Probably the verb conjugations. There are so many of them!", "احتمالاً صرف افعال. خیلی زیادند!"),
            d("B", "I know! But they become natural with practice. Don't worry too much.", "می‌دانم! ولی با تمرین طبیعی می‌شوند. زیاد نگران نباش."),
            d("A", "I'll try. What resources do you recommend?", "سعی می‌کنم. چه منابعی توصیه می‌کنی؟"),
            d("B", "Language exchange apps are great. You teach someone English and they teach you Spanish.", "اپلیکیشن‌های تبادل زبانی عالی هستند. به کسی انگلیسی یاد می‌دهی و او اسپانیایی یادت می‌دهد."),
            d("A", "That sounds perfect. I'll look into it.", "عالی به نظر می‌رسد. بررسی می‌کنم."),
            d("B", "You should. Well, I should go. Good luck with Spanish, Ali!", "باید بکنی. خب، باید بروم. موفق باشی در اسپانیایی، علی!"),
            d("A", "Thanks, Maria. See you soon!", "ممنون، ماریا. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How long has Maria been learning Spanish?", "Two years."),
            q("What is Maria's embarrassing language mistake?", "She said she was pregnant when she meant embarrassed."),
            q("What language does Maria want to learn next?", "Italian."),
            q("What is Ali's biggest challenge with Spanish?", "Verb conjugations."),
            q("She said she ___ learning Spanish.", listOf("is", "was", "be"), 1),
            q("He asked how long I ___ studying.", listOf("have been", "had been", "was"), 1),
            q("She asked if I ___ fluent.", listOf("am", "was", "be"), 1),
            q("He said he ___ speak three languages.", listOf("can", "could", "will"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Laugh at yourself", "به خودت بخند", "You have to laugh at yourself.", "باید به خودت بخندی."),
            IdiomExpression("Make a difference", "تفاوت ایجاد کردن", "A few words can make a difference.", "چند کلمه می‌تواند تفاوت ایجاد کند."),
            IdiomExpression("Look into", "بررسی کردن", "I'll look into it.", "بررسی می‌کنم."),
            IdiomExpression("Give permission", "اجازه دادن", "Give yourself permission to be imperfect.", "به خودت اجازه ناقص بودن بده.")
        ),
        phrasal = listOf(
            PhrasalVerb("look into", "بررسی کردن", "investigate", "I'll look into that app.", "آن اپلیکیشن را بررسی می‌کنم.", "No"),
            PhrasalVerb("pick up", "یاد گرفتن", "learn casually", "She picked up Spanish quickly.", "او اسپانیایی را سریع یاد گرفت.", "No"),
            PhrasalVerb("brush up on", "تجدید کردن", "review", "I need to brush up on my French.", "باید فرانسه‌ام را تجدید کنم.", "No"),
            PhrasalVerb("get by", "از پس برآمدن", "manage", "I can get by in Spanish.", "می‌توانم با اسپانیایی از پس برآیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Reported speech", "She SAID she WAS learning Spanish."),
            PronunciationTip("Tense shifts", "is → was, have been → had been, can → could."),
            PronunciationTip("Language vocabulary", "FLUent, biLINgual, MOTHer tongue, ACcent, DIalect.")
        ),
        culture = listOf(
            CulturalNote("Language learning", "Immersion and speaking practice are key to becoming fluent."),
            CulturalNote("Bilingualism", "Bilingualism has cognitive benefits and is common worldwide."),
            CulturalNote("Language and identity", "Speaking another language can make people feel like a different version of themselves.")
        ),
        mistakes = listOf(
            CommonMistake("She said me she was learning.", "She told me she was learning.", "Use 'tell' with an object."),
            CommonMistake("He said he will come.", "He said he would come.", "Shift 'will' to 'would' in reported speech."),
            CommonMistake("He asked where did I live.", "He asked where I lived.", "Use statement word order in reported questions."),
            CommonMistake("She asked if I have been studying.", "She asked if I had been studying.", "Shift present perfect to past perfect.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is Maria's advice for learning a language?", "Immersion, speaking with native speakers, and not being afraid to make mistakes."),
            ComprehensionQuestion("What was Maria's embarrassing mistake?", "She said she was pregnant when she meant embarrassed."),
            ComprehensionQuestion("What is Ali's challenge with Spanish?", "Verb conjugations.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss your language learning experience.", "درباره تجربه یادگیری زبانت صحبت کن.", "I've been learning... / My biggest challenge is... / I want to..."),
            SpeakingTask("Report a conversation about language learning.", "گزارشی از یک مکالمه درباره یادگیری زبان بده.", "She said... / He told me... / They asked..."),
            SpeakingTask("Give advice about learning a new language.", "توصیه درباره یادگیری زبان جدید بده.", "You should... / Try to... / Don't be afraid to...")
        ),
        writing = listOf(
            WritingTask("Write about your experience learning a foreign language.", "درباره تجربه‌ات در یادگیری زبان خارجی بنویس.", 180, "Use reported speech.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 11 — Exceptional people | افراد استثنایی
    // Lesson A: High achievers / Lesson B: Personal heroes
    // ═══════════════════════════════════════════════════════════════
    private fun unit11() = base(
        11, "Exceptional people", "افراد استثنایی",
        listOf("Discuss high achievers", "Use relative clauses", "Talk about personal heroes", "Express admiration"),
        listOf(
            v("achievement", "دستاورد", "It's a great achievement.", "دستاورد بزرگی است."),
            v("accomplish", "انجام دادن", "She accomplished her goal.", "او هدفش را انجام داد.", "v"),
            v("determination", "عزم", "He has great determination.", "او عزم زیادی دارد."),
            v("perseverance", "پشتکار", "Perseverance is key to success.", "پشتکار کلید موفقیت است."),
            v("inspire", "الهام بخشیدن", "She inspires me.", "او به من الهام می‌بخشد.", "v"),
            v("admire", "تحسین کردن", "I admire her courage.", "شجاعتش را تحسین می‌کنم.", "v"),
            v("role model", "الگو", "He's a role model for many.", "او الگوی بسیاری است."),
            v("overcome", "غلبه کردن", "She overcame many obstacles.", "او بر موانع زیادی غلبه کرد.", "v"),
            v("obstacle", "مانع", "There are many obstacles.", "موانع زیادی وجود دارد."),
            v("hero", "قهرمان", "She's a local hero.", "او قهرمان محلی است."),
            v("courage", "شجاعت", "It takes courage.", "شجاعت می‌خواهد."),
            v("dedication", "فداکاری", "His dedication is inspiring.", "فداکاری‌اش الهام‌بخش است."),
            v("talent", "استعداد", "She has natural talent.", "او استعداد طبیعی دارد."),
            v("hard work", "کار سخت", "Hard work beats talent.", "کار سخت استعداد را شکست می‌دهد."),
            v("legacy", "میراث", "His legacy lives on.", "میراثش زنده می‌ماند.")
        ),
        listOf(
            GrammarSection("Defining relative clauses", "who, which, that. Essential information. The person who inspires me is my mother."),
            GrammarSection("Non-defining relative clauses", "who, which. Extra information with commas. Marie Curie, who won two Nobel Prizes, was a pioneer."),
            GrammarSection("Relative clauses with whose", "The person whose story inspired me. The woman whose courage changed everything."),
            GrammarSection("Reduced relative clauses", "The man (who is) standing there. The book (which was) written by her.")
        ),
        listOf(
            d("A", "Hey Maria! I've been reading about exceptional people who changed the world.", "هی ماریا! درباره افراد استثنایی که دنیا را تغییر دادند خوانده‌ام."),
            d("B", "Oh, that's a great topic. Who did you read about?", "اوه، موضوع عالی‌ای است. درباره کی خواندی؟"),
            d("A", "Marie Curie. She was a physicist and chemist who won two Nobel Prizes.", "ماری کوری. او فیزیکدان و شیمیدانی بود که دو جایزه نوبل برد."),
            d("B", "She's fascinating. She overcame so many obstacles as a woman in science.", "او جالب است. به عنوان زنی در علم بر موانع زیادی غلبه کرد."),
            d("A", "Exactly. Her determination was incredible. She inspires me a lot.", "دقیقاً. عزمش باورنکردنی بود. خیلی به من الهام می‌بخشد."),
            d("B", "Who else did you read about?", "درباره چه کس دیگری خواندی؟"),
            d("A", "Nelson Mandela. The man who spent 27 years in prison and then became president.", "نلسون ماندلا. مردی که ۲۷ سال در زندان گذراند و بعد رئیس‌جمهور شد."),
            d("B", "His story is remarkable. He forgave his enemies, which is extraordinary.", "داستانش قابل توجه است. دشمنانش را بخشید، که فوق‌العاده است."),
            d("A", "I know. That takes incredible strength. Who's your hero?", "می‌دانم. قدرت باورنکردنی می‌خواهد. قهرمان تو کیست؟"),
            d("B", "My grandmother. She's the person who taught me the most about life.", "مادربزرگم. او کسی است که بیشترین چیز را درباره زندگی به من آموخت."),
            d("A", "What did she teach you?", "چه چیزی به تو آموخت؟"),
            d("B", "She taught me perseverance. She raised five children alone after my grandfather died.", "به من پشتکار آموخت. بعد از فوت پدربزرگم پنج فرزند را تنها بزرگ کرد."),
            d("A", "That's incredible. She sounds like an exceptional person.", "باورنکردنی است. فرد استثنایی به نظر می‌رسد."),
            d("B", "She is. She's my role model. What qualities do you admire most in people?", "هست. او الگوی من است. چه ویژگی‌هایی را بیشتر در مردم تحسین می‌کنی؟"),
            d("A", "Determination and courage. I admire people who don't give up.", "عزم و شجاعت. افرادی را تحسین می‌کنم که تسلیم نمی‌شوند."),
            d("B", "Those are important. What about talent versus hard work?", "آن‌ها مهم هستند. استعداد در مقابل کار سخت چطور؟"),
            d("A", "I think hard work is more important. Talent helps, but dedication wins in the end.", "فکر می‌کنم کار سخت مهم‌تر است. استعداد کمک می‌کند، ولی در نهایت فداکاری برنده می‌شود."),
            d("B", "I agree. I've seen people with average talent achieve amazing things through hard work.", "موافقم. دیده‌ام افرادی با استعداد متوسط از طریق کار سخت چیزهای شگفت‌انگیزی دست یافته‌اند."),
            d("A", "Exactly. Do you think anyone can be exceptional?", "دقیقاً. فکر می‌کنی هر کسی می‌تواند استثنایی باشد؟"),
            d("B", "Maybe not in a famous way. But everyone can be exceptional in their own life.", "شاید نه به شکل معروف. ولی هر کسی می‌تواند در زندگی خودش استثنایی باشد."),
            d("A", "That's a beautiful thought. Like being a good parent or a supportive friend.", "فکر زیبایی است. مثل والد خوب بودن یا دوست حمایتگر بودن."),
            d("B", "Exactly. Those things matter just as much as winning Nobel Prizes.", "دقیقاً. آن چیزها به اندازه بردن جایزه نوبل مهم هستند."),
            d("A", "True. Have you ever met someone you consider exceptional?", "درست. هیچ‌وقت کسی را ملاقات کرده‌ای که استثنایی بدانی؟"),
            d("B", "Yes, my old professor. She was brilliant and kind. She made everyone feel valued.", "بله، استاد قدیمی‌ام. باهوش و مهربان بود. همه را ارزشمند حس می‌کرد."),
            d("A", "She sounds wonderful. What made her exceptional?", "شگفت‌انگیز به نظر می‌رسد. چه چیزی او را استثنایی می‌کرد؟"),
            d("B", "Her ability to see potential in everyone. She believed in us before we believed in ourselves.", "توانایی‌اش در دیدن پتانسیل در همه. قبل از اینکه ما به خودمان باور داشته باشیم به ما باور داشت."),
            d("A", "That's a rare gift. Teachers like that change lives.", "استعداد نادری است. معلمانی مثل آن زندگی‌ها را تغییر می‌دهند."),
            d("B", "They do. What about you? Any exceptional people in your life?", "می‌کنند. تو چطور؟ افراد استثنایی در زندگی‌ات داری؟"),
            d("A", "My father. He came from nothing and built a successful business.", "پدرم. از هیچ شروع کرد و کسب‌وکار موفقی ساخت."),
            d("B", "That's impressive. What did he teach you?", "تحسین‌برانگیز است. چه چیزی به تو آموخت؟"),
            d("A", "That you can achieve anything if you work hard and stay focused.", "اینکه اگر سخت کار کنی و متمرکز بمانی می‌توانی به هر چیزی دست یابی."),
            d("B", "That's a valuable lesson. Do you think you've lived up to his example?", "درس ارزشمندی است. فکر می‌کنی به الگوی او عمل کرده‌ای؟"),
            d("A", "I try. I'm not perfect, but I'm working on it.", "سعی می‌کنم. کامل نیستم، ولی رویش کار می‌کنم."),
            d("B", "That's all anyone can do. Well, I should go. This was inspiring.", "تمام کاری است که هر کسی می‌تواند بکند. خب، باید بروم. الهام‌بخش بود."),
            d("A", "It was. Thanks for sharing your thoughts, Maria.", "بود. ممنون که نظراتت را به اشتراک گذاشتی، ماریا."),
            d("B", "Anytime, Ali. See you soon!", "هر وقت، علی. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Who did Ali read about?", "Marie Curie and Nelson Mandela."),
            q("Who is Maria's hero?", "Her grandmother."),
            q("What did Maria's grandmother teach her?", "Perseverance; she raised five children alone."),
            q("What did Ali's father teach him?", "You can achieve anything with hard work and focus."),
            q("The person ___ inspires me is my mother.", listOf("who", "which", "where"), 0),
            q("Marie Curie, ___ won two Nobel Prizes, was a pioneer.", listOf("who", "which", "that"), 0),
            q("The person ___ story inspired me.", listOf("who", "whose", "which"), 1),
            q("The man ___ there is my father.", listOf("stand", "standing", "stands"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Role model", "الگو", "She's my role model.", "او الگوی من است."),
            IdiomExpression("Live up to", "عمل کردن به", "I try to live up to his example.", "سعی می‌کنم به الگوی او عمل کنم."),
            IdiomExpression("See potential", "دیدن پتانسیل", "She saw potential in everyone.", "او پتانسیل را در همه می‌دید."),
            IdiomExpression("Come from nothing", "از هیچ شروع کردن", "He came from nothing.", "او از هیچ شروع کرد.")
        ),
        phrasal = listOf(
            PhrasalVerb("look up to", "الگو قرار دادن", "admire", "I look up to my grandmother.", "مادربزرگم را الگو قرار می‌دهم.", "No"),
            PhrasalVerb("give up", "تسلیم شدن", "quit", "She never gave up.", "او هرگز تسلیم نشد.", "No"),
            PhrasalVerb("carry on", "ادامه دادن", "continue", "She carried on despite difficulties.", "با وجود سختی‌ها ادامه داد.", "No"),
            PhrasalVerb("stand out", "متمایز بودن", "be exceptional", "He stands out from the crowd.", "او از جمع متمایز است.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Relative clauses", "The person WHO inspires me. The man WHO spent 27 years."),
            PronunciationTip("Non-defining", "Marie Curie, WHO won two Nobel Prizes, was a pioneer."),
            PronunciationTip("Achievement vocabulary", "aCHIEVement, deTERmination, PERseverance, OBstacle.")
        ),
        culture = listOf(
            CulturalNote("Role models", "Role models can be famous figures or ordinary people in our lives."),
            CulturalNote("Achievement", "Achievement is often the result of perseverance and hard work."),
            CulturalNote("Heroes", "Different cultures define heroism in different ways.")
        ),
        mistakes = listOf(
            CommonMistake("The person which inspires me.", "The person who inspires me.", "Use 'who' for people."),
            CommonMistake("Marie Curie, that won two Nobel Prizes.", "Marie Curie, who won two Nobel Prizes.", "Use 'who' for people in non-defining clauses."),
            CommonMistake("The person who story inspired me.", "The person whose story inspired me.", "Use 'whose' for possession."),
            CommonMistake("The man stand there is my father.", "The man standing there is my father.", "Use present participle in reduced relative clauses.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Who are the exceptional people Ali read about?", "Marie Curie and Nelson Mandela."),
            ComprehensionQuestion("Who is Maria's hero and why?", "Her grandmother, who raised five children alone."),
            ComprehensionQuestion("What qualities do they admire?", "Determination, courage, perseverance, and hard work.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a person you admire.", "درباره کسی که تحسین می‌کنی صحبت کن.", "I admire... because... / He/She is someone who... / What inspires me is..."),
            SpeakingTask("Discuss what makes someone exceptional.", "درباره اینکه چه چیزی کسی را استثنایی می‌کند صحبت کن.", "I think... / What makes someone exceptional is... / They..."),
            SpeakingTask("Talk about a role model in your life.", "درباره یک الگو در زندگی‌ات صحبت کن.", "My role model is... / They taught me... / I look up to them because...")
        ),
        writing = listOf(
            WritingTask("Write about a person you consider exceptional and why.", "درباره فردی که استثنایی می‌دانی و چرایی آن بنویس.", 180, "Use relative clauses.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 12 — Business matters | مسائل تجاری
    // Lesson A: Entrepreneurs / Lesson B: The new worker
    // ═══════════════════════════════════════════════════════════════
    private fun unit12() = base(
        12, "Business matters", "مسائل تجاری",
        listOf("Discuss entrepreneurship", "Use conditionals", "Talk about the changing workplace", "Express opinions about business"),
        listOf(
            v("entrepreneur", "کارآفرین", "He's a successful entrepreneur.", "او کارآفرین موفقی است."),
            v("startup", "استارتاپ", "She founded a startup.", "او یک استارتاپ تاسیس کرد."),
            v("invest", "سرمایه‌گذاری کردن", "They invested in the company.", "آن‌ها در شرکت سرمایه‌گذاری کردند.", "v"),
            v("profit", "سود", "The company made a profit.", "شرکت سود کرد."),
            v("loss", "ضرر", "They suffered a big loss.", "ضرر بزرگی متحمل شدند."),
            v("venture", "ریسک تجاری", "It was a risky venture.", "ریسک تجاری خطرناکی بود."),
            v("innovate", "نوآوری کردن", "We need to innovate to survive.", "برای بقا باید نوآوری کنیم.", "v"),
            v("remote work", "کار از راه دور", "Remote work is becoming common.", "کار از راه دور رایج می‌شود."),
            v("flexible", "انعطاف‌پذیر", "The schedule is flexible.", "برنامه انعطاف‌پذیر است.", "adj"),
            v("freelance", "آزاد", "She works as a freelancer.", "او به عنوان فریلنسر کار می‌کند.", "adj"),
            v("work-life balance", "تعادل کار و زندگی", "Work-life balance is important.", "تعادل کار و زندگی مهم است."),
            v("burnout", "فرسودگی", "Burnout is a serious issue.", "فرسودگی مسئله جدی است."),
            v("leadership", "رهبری", "Good leadership is essential.", "رهبری خوب ضروری است."),
            v("strategy", "استراتژی", "We need a new strategy.", "به استراتژی جدیدی نیاز داریم."),
            v("sustainable", "پایدار", "Sustainable growth is the goal.", "رشد پایدار هدف است.", "adj")
        ),
        listOf(
            GrammarSection("First conditional", "If + present simple, will + base verb. If you work hard, you will succeed."),
            GrammarSection("Second conditional", "If + past simple, would + base verb. If I had more money, I would start a business."),
            GrammarSection("Third conditional", "If + past perfect, would have + past participle. If I had invested, I would have made a profit."),
            GrammarSection("Mixed conditionals", "If I had studied business, I would be an entrepreneur now.")
        ),
        listOf(
            d("A", "Hey Maria! I've been thinking about starting my own business. What do you think?", "هی ماریا! به راه‌اندازی کسب‌وکار خودم فکر کرده‌ام. نظرت چیست؟"),
            d("B", "That's exciting! What kind of business?", "هیجان‌انگیز است! چه نوع کسب‌وکاری؟"),
            d("A", "A coffee shop. It's been my dream for years. I love coffee culture.", "یک کافه. سال‌ها رویای من بوده. عاشق فرهنگ قهوه‌ام."),
            d("B", "That's a great idea. Have you done any research?", "فکر عالی‌ای است. تحقیقی کرده‌ای؟"),
            d("A", "Yes, a lot. I've been looking at locations and costs. It's expensive.", "بله، زیاد. مکان‌ها و هزینه‌ها را بررسی کرده‌ام. گران است."),
            d("B", "Starting a business is always expensive. Do you have investors?", "راه‌اندازی کسب‌وکار همیشه گران است. سرمایه‌گذار داری؟"),
            d("A", "Not yet. I've saved some money, but I might need a loan.", "هنوز نه. کمی پول پس‌انداز کرده‌ام، ولی ممکن است به وام نیاز داشته باشم."),
            d("B", "That's a big risk. But if you believe in it, you should go for it.", "ریسک بزرگی است. ولی اگر به آن باور داری، باید اقدام کنی."),
            d("A", "Thanks. What would you do if you were in my position?", "ممنون. اگر جای من بودی چه کار می‌کردی؟"),
            d("B", "If I were you, I would start small. Maybe a food truck first, then a shop.", "اگر جای تو بودم، کوچک شروع می‌کردم. شاید اول یک فودتراک، بعد مغازه."),
            d("A", "That's a good point. Lower risk. I hadn't thought of that.", "نکته خوبی است. ریسک کمتر. به آن فکر نکرده بودم."),
            d("B", "It gives you a chance to test the market without a huge investment.", "به تو فرصت می‌دهد بازار را بدون سرمایه‌گذاری بزرگ تست کنی."),
            d("A", "Exactly. What about you? Would you ever start your own business?", "دقیقاً. تو چطور؟ هیچ‌وقت کسب‌وکار خودت را راه می‌انداختی؟"),
            d("B", "I don't think so. I prefer the stability of a regular job.", "فکر نمی‌کنم. ثبات شغل معمولی را ترجیح می‌دهم."),
            d("A", "That's understandable. Not everyone is cut out for entrepreneurship.", "قابل درک است. همه برای کارآفرینی ساخته نشده‌اند."),
            d("B", "Exactly. What made you want to start a business?", "دقیقاً. چه چیزی باعث شد بخواهی کسب‌وکار راه بیندازی؟"),
            d("A", "I want to be my own boss. And I love the creative side of it.", "می‌خواهم رئیس خودم باشم. و عاشق جنبه خلاقانه‌اش هستم."),
            d("B", "That's valid. Have you ever worked for a startup?", "معتبر است. هیچ‌وقت برای استارتاپی کار کرده‌ای؟"),
            d("A", "No, but I've read a lot about them. The culture is different.", "نه، ولی زیاد درباره‌شان خوانده‌ام. فرهنگشان متفاوت است."),
            d("B", "How so?", "چطور؟"),
            d("A", "More flexible, more innovative, but also more chaotic.", "انعطاف‌پذیرتر، نوآورتر، ولی همچنین پرهرج‌ومرج‌تر."),
            d("B", "That sounds about right. Do you think remote work is changing business?", "درست به نظر می‌رسد. فکر می‌کنی کار از راه دور کسب‌وکار را تغییر می‌دهد؟"),
            d("A", "Absolutely. Companies are more flexible now. Employees want work-life balance.", "قطعاً. شرکت‌ها الان انعطاف‌پذیرترند. کارمندان تعادل کار و زندگی می‌خواهند."),
            d("B", "True. Burnout has become a serious issue in many industries.", "درست. فرسودگی در بسیاری از صنایع مسئله جدی شده."),
            d("A", "Exactly. Good leadership is about preventing burnout, not causing it.", "دقیقاً. رهبری خوب درباره جلوگیری از فرسودگی است، نه ایجاد آن."),
            d("B", "That's a great way to put it. What kind of leader would you be?", "روش عالی‌ای برای بیانش است. چه نوع رهبری می‌شوی؟"),
            d("A", "I'd like to be supportive and collaborative. Not authoritarian.", "دوست دارم حمایتگر و مشارکتی باشم. نه مستبد."),
            d("B", "That's a good approach. What's your strategy for the coffee shop?", "رویکرد خوبی است. استراتژی‌ات برای کافه چیست؟"),
            d("A", "Focus on quality and community. I want it to be a place where people feel welcome.", "تمرکز روی کیفیت و جامعه. می‌خواهم جایی باشد که مردم احساس خوشامد داشته باشند."),
            d("B", "That's a sustainable approach. If you build a community, they'll keep coming back.", "رویکرد پایداری است. اگر جامعه‌ای بسازی، برمی‌گردند."),
            d("A", "I hope so. If I had started ten years ago, I would be established by now.", "امیدوارم. اگر ده سال پیش شروع کرده بودم، الان جا افتاده بودم."),
            d("B", "It's never too late. If you work hard, you'll succeed.", "هرگز دیر نیست. اگر سخت کار کنی، موفق می‌شوی."),
            d("A", "Thanks for the encouragement. I needed that.", "ممنون برای تشویق. به آن نیاز داشتم."),
            d("B", "Anytime. Well, I should go. Good luck with your business plan!", "هر وقت. خب، باید بروم. موفق باشی در طرح کسب‌وکارت!"),
            d("A", "Thanks, Maria. See you soon!", "ممنون، ماریا. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What business does Ali want to start?", "A coffee shop."),
            q("What does Maria suggest Ali do?", "Start small, maybe a food truck first."),
            q("Why doesn't Maria want to start a business?", "She prefers the stability of a regular job."),
            q("What is Ali's strategy for the coffee shop?", "Focus on quality and community."),
            q("If you work hard, you ___ succeed.", listOf("will", "would", "did"), 0),
            q("If I had more money, I ___ start a business.", listOf("will", "would", "did"), 1),
            q("If I had invested, I ___ made a profit.", listOf("would have", "will have", "did have"), 0),
            q("If I had studied business, I ___ an entrepreneur now.", listOf("would be", "will be", "am"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Be your own boss", "رئیس خودت بودن", "I want to be my own boss.", "می‌خواهم رئیس خودم باشم."),
            IdiomExpression("Cut out for", "ساخته شده برای", "Not everyone is cut out for entrepreneurship.", "همه برای کارآفرینی ساخته نشده‌اند."),
            IdiomExpression("Go for it", "اقدام کردن", "If you believe in it, go for it.", "اگر باور داری، اقدام کن."),
            IdiomExpression("Work-life balance", "تعادل کار و زندگی", "Employees want work-life balance.", "کارمندان تعادل کار و زندگی می‌خواهند.")
        ),
        phrasal = listOf(
            PhrasalVerb("start up", "راه‌اندازی کردن", "establish", "He started up his own company.", "شرکت خودش را راه‌اندازی کرد.", "Yes"),
            PhrasalVerb("take on", "پذیرفتن", "accept", "She took on a new challenge.", "چالش جدیدی پذیرفت.", "No"),
            PhrasalVerb("give up", "تسلیم شدن", "quit", "Don't give up on your dream.", "رویایت را رها نکن.", "No"),
            PhrasalVerb("carry out", "انجام دادن", "conduct", "They carried out market research.", "تحقیق بازار انجام دادند.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Conditionals", "If you WORK hard, you WILL succeed. If I HAD money, I WOULD start."),
            PronunciationTip("Third conditional", "If I had INvested, I would have MADE a profit."),
            PronunciationTip("Business vocabulary", "entrepreNEUR, STARTup, inVEST, PROfit, LEADership.")
        ),
        culture = listOf(
            CulturalNote("Entrepreneurship", "Entrepreneurship is valued in many cultures as a path to independence and innovation."),
            CulturalNote("Remote work", "Remote work has grown significantly and changed workplace dynamics."),
            CulturalNote("Work-life balance", "Many companies now prioritize work-life balance to prevent burnout.")
        ),
        mistakes = listOf(
            CommonMistake("If you will work hard, you will succeed.", "If you work hard, you will succeed.", "Use present simple after 'if' in first conditional."),
            CommonMistake("If I would have money, I would start.", "If I had money, I would start.", "Use past simple after 'if' in second conditional."),
            CommonMistake("If I had invested, I will have made a profit.", "If I had invested, I would have made a profit.", "Use 'would have' in third conditional."),
            CommonMistake("If I had studied business, I will be an entrepreneur.", "If I had studied business, I would be an entrepreneur.", "Use 'would' in mixed conditional result clause.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is Ali's dream business and why?", "A coffee shop; he loves coffee culture and wants to be his own boss."),
            ComprehensionQuestion("What advice does Maria give?", "Start small with a food truck to test the market with lower risk."),
            ComprehensionQuestion("How do they view the changing workplace?", "Remote work and work-life balance are increasingly important; burnout is a concern.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss starting your own business.", "درباره راه‌اندازی کسب‌وکار خودت صحبت کن.", "If I... / I would... / The challenge is..."),
            SpeakingTask("Talk about the changing workplace.", "درباره محل کار در حال تغییر صحبت کن.", "Remote work... / Work-life balance... / Burnout..."),
            SpeakingTask("Express your views on entrepreneurship.", "نظراتت را درباره کارآفرینی بیان کن.", "I think... / It's important to... / Not everyone...")
        ),
        writing = listOf(
            WritingTask("Write about what you would do if you started a business.", "درباره اینکه اگر کسب‌وکاری راه می‌انداختی چه می‌کردی بنویس.", 180, "Use conditionals.")
        )
    )
}