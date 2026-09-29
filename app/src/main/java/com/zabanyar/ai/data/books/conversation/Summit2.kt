package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Summit 2 — Complete Course Content
 * 10 Units | Advanced (C1)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles match the official Pearson Scope & Sequence
 * Long-form dialogues: 250-280 lines each (~25-30 minutes)
 */
object Summit2 {
    const val BOOK_ID = "summit_2"

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

    // ═══════════════════════════════════════════════════════════
    // UNIT 1 — Dreams and Goals | رویاها و اهداف
    // ═══════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "Dreams and Goals", "رویاها و اهداف",
        listOf(
            "Ask about someone's background",
            "Discuss career and study plans",
            "Compare your dreams and goals in life",
            "Describe job qualifications",
            "Use the present perfect for past events related to the present",
            "Use the present perfect and present perfect continuous for unfinished or continuing actions"
        ),
        listOf(
            v("ambition", "جاه‌طلبی", "Her ambition is to lead a Fortune 500 company.", "جاه‌طلبی او رهبری یک شرکت فورچون ۵۰۰ است."),
            v("aspiration", "آرزو / هدف والا", "His aspirations go beyond mere financial success.", "آرزوهای او فراتر از موفقیت مالی صرف است."),
            v("qualification", "صلاحیت", "She has excellent qualifications for the position.", "او صلاحیت‌های عالی برای این موقعیت دارد."),
            v("pursue", "دنبال کردن", "He decided to pursue a career in medicine.", "او تصمیم گرفت حرفه‌ای در پزشکی دنبال کند.", "verb"),
            v("accomplish", "به انجام رساندن", "She accomplished her goal in record time.", "او هدفش را در زمان رکورد به انجام رساند.", "verb"),
            v("setback", "شکست", "Every setback is a learning opportunity.", "هر شکستی یک فرصت یادگیری است."),
            v("milestone", "نقطه عطف", "Graduation is an important milestone.", "فارغ‌التحصیلی یک نقطه عطف مهم است."),
            v("determination", "اراده", "Her determination inspired everyone around her.", "اراده‌اش همه اطرافیانش را الهام بخشید."),
            v("career path", "مسیر شغلی", "He chose a nontraditional career path.", "او یک مسیر شغلی غیرسنتی انتخاب کرد."),
            v("mentor", "مرشد", "Having a good mentor can accelerate your growth.", "داشتن یک مرشد خوب می‌تواند رشد تو را تسریع کند."),
            v("enroll", "ثبت‌نام کردن", "She enrolled in a graduate program.", "او در یک برنامه تحصیلات تکمیلی ثبت‌نام کرد.", "verb"),
            v("fulfill", "محقق کردن", "He worked hard to fulfill his dream.", "او سخت کار کرد تا رویایش را محقق کند.", "verb"),
            v("overcome", "غلبه کردن", "She overcame numerous obstacles.", "او بر موانع متعددی غلبه کرد.", "verb"),
            v("resume", "رزومه", "A strong resume opens doors.", "یک رزومه قوی درها را باز می‌کند."),
            v("internship", "کارآموزی", "The internship led to a full-time position.", "کارآموزی به یک موقعیت تمام‌وقت منجر شد."),
            v("network", "شبکه‌سازی", "Networking is essential in today's job market.", "شبکه‌سازی در بازار کار امروز ضروری است.", "verb"),
            v("achievable", "قابل دستیابی", "Set realistic and achievable goals.", "اهداف واقع‌بینانه و قابل دستیابی تعیین کن.", "adjective"),
            v("unrealistic", "غیرواقعی", "Don't set unrealistic expectations.", "انتظارات غیرواقعی تعیین نکن.", "adjective"),
            v("dedication", "فداکاری", "Her dedication to the project was remarkable.", "فداکاری‌اش به پروژه قابل توجه بود."),
            v("vision", "چشم‌انداز", "He has a clear vision for his future.", "او چشم‌انداز واضحی برای آینده‌اش دارد.")
        ),
        listOf(
            GrammarSection(
                "The present perfect for past events related to the present",
                "Use the present perfect to connect past actions to the present moment. I have applied to five universities. She has already finished her thesis. They have never traveled abroad."
            ),
            GrammarSection(
                "Present perfect vs. present perfect continuous",
                "Use the present perfect for completed actions with present relevance. Use the present perfect continuous for actions that started in the past and are still continuing. I've worked here for five years. I've been working on this project for months."
            ),
            GrammarSection(
                "Conversation strategies for discussing goals",
                "Use 'You know' to ease into a conversation. Use 'That's great' to convey enthusiasm. Use 'I guess' to soften an opinion. Use 'True, but' to present an alternate view."
            )
        ),
        listOf(
            d("A", "You know, I've been thinking a lot about my future lately.", "می‌دانی، اخیراً زیاد به آینده‌ام فکر کرده‌ام."),
            d("B", "Really? What's been on your mind?", "واقعاً؟ چه چیزی ذهنت را مشغول کرده؟"),
            d("A", "I guess I'm at a crossroads. I've been working in the same job for six years.", "فکر می‌کنم در یک دوراهی هستم. شش سال است در همان کار کار می‌کنم."),
            d("B", "Six years is a long time. Have you been happy there?", "شش سال زمان زیادی است. آنجا خوشحال بوده‌ای؟"),
            d("A", "On and off. I've learned a lot, but I feel like I've hit a ceiling.", "گاه و بیگاه. چیزهای زیادی یاد گرفته‌ام، ولی حس می‌کنم به سقف رسیده‌ام."),
            d("B", "That's a common feeling. Have you thought about what you'd like to do instead?", "این احساس رایجی است. به این فکر کرده‌ای که چه کار دیگری دوست داری بکنی؟"),
            d("A", "I've been considering going back to school. Maybe a master's degree.", "به بازگشت به مدرسه فکر کرده‌ام. شاید کارشناسی ارشد."),
            d("B", "That's great! What field are you thinking about?", "عالی است! چه رشته‌ای را در نظر داری؟"),
            d("A", "Something in data science. I've been teaching myself Python for a few months.", "چیزی در علم داده. چند ماه است خودم پایتون یاد می‌گیرم."),
            d("B", "That's impressive. Have you found it difficult?", "تحسین‌برانگیز است. سخت یافته‌ای؟"),
            d("A", "Challenging, yes. But I've been enjoying the process. It's like solving puzzles.", "چالش‌برانگیز، بله. ولی از فرآیندش لذت برده‌ام. مثل حل معما است."),
            d("B", "Have you considered a bootcamp instead? They're shorter and more practical.", "به بوت‌کمپ فکر کرده‌ای؟ کوتاه‌تر و عملی‌تر هستند."),
            d("A", "I've thought about it. But I want the depth a degree provides.", "به آن فکر کرده‌ام. ولی عمق یک مدرک را می‌خواهم."),
            d("B", "That makes sense. Have you researched any programs?", "منطقی است. برنامه‌ای تحقیق کرده‌ای؟"),
            d("A", "I've bookmarked a few. One at NYU and another at Georgia Tech.", "چند تا را نشان کرده‌ام. یکی در NYU و دیگری در جورجیا تک."),
            d("B", "Those are great schools. Have you talked to anyone in the field?", "مدارس عالی هستند. با کسی در این زمینه صحبت کرده‌ای؟"),
            d("A", "Yes, actually. I've been reaching out to alumni on LinkedIn.", "بله، در واقع. در لینکدین با فارغ‌التحصیلان تماس گرفته‌ام."),
            d("B", "Smart. What have they told you?", "هوشمندانه. چه گفته‌اند؟"),
            d("A", "That it's worth it, but the workload is intense. Especially while working.", "که ارزشش را دارد، ولی حجم کار شدید است. مخصوصاً در حین کار."),
            d("B", "Have you thought about going part-time?", "به نیمه‌وقت فکر کرده‌ای؟"),
            d("A", "I've considered it. It would take longer, but I'd keep my income.", "در نظر گرفته‌ام. طولانی‌تر می‌شود، ولی درآمدم را حفظ می‌کنم."),
            d("B", "That sounds like a good balance. What does your family think?", "تعادل خوبی به نظر می‌رسد. خانواده‌ات چه فکر می‌کنند؟"),
            d("A", "They've been supportive. My wife said, 'If it's your dream, go for it.'", "حمایت کرده‌اند. همسرم گفت: «اگر رویای توست، دنبالش برو.»"),
            d("B", "That's wonderful. Have you set a timeline?", "فوق‌العاده است. جدول زمانی تعیین کرده‌ای؟"),
            d("A", "I'm hoping to apply by next spring. So I've been preparing for months.", "امیدوارم تا بهار آینده درخواست دهم. پس ماه‌هاست آماده می‌شوم."),
            d("B", "You've clearly given this a lot of thought.", "واضح است که خیلی به این فکر کرده‌ای."),
            d("A", "I have. It feels scary, but also exciting.", "فکر کرده‌ام. ترسناک است، ولی هیجان‌انگیز هم هست."),
            d("B", "What's the scariest part?", "ترسناک‌ترین بخشش چیست؟"),
            d("A", "The financial uncertainty. I've been saving, but tuition is expensive.", "عدم اطمینان مالی. پس‌انداز کرده‌ام، ولی شهریه گران است."),
            d("B", "Have you looked into scholarships?", "به بورسیه‌ها نگاه کرده‌ای؟"),
            d("A", "Yes. I've applied for a few. Fingers crossed.", "بله. برای چند تا درخواست داده‌ام. انگشت‌ها را به هم می‌فشارم."),
            d("B", "I'm sure you'll figure it out. You've always been resourceful.", "مطمئنم حلش می‌کنی. همیشه زیرک بوده‌ای."),
            d("A", "Thanks. That means a lot coming from you.", "ممنون. این از تو خیلی معنی‌دار است."),
            d("B", "You know, I've been thinking about a career change too.", "می‌دانی، من هم به تغییر شغلی فکر کرده‌ام."),
            d("A", "Really? Tell me more.", "واقعاً؟ بیشتر بگو."),
            d("B", "I've been in marketing for a decade, but my real passion is education.", "ده سال در بازاریابی بوده‌ام، ولی عشق واقعی‌ام آموزش است."),
            d("A", "Have you considered teaching?", "به تدریس فکر کرده‌ای؟"),
            d("B", "I have. But I'd need a teaching credential.", "فکر کرده‌ام. ولی به گواهی تدریس نیاز دارم."),
            d("A", "Have you looked into alternative certification programs?", "برنامه‌های گواهی جایگزین را بررسی کرده‌ای؟"),
            d("B", "Yes. Some only take a year. I've been researching them.", "بله. برخی فقط یک سال طول می‌کشند. در حال تحقیق هستم."),
            d("A", "That's exciting. Have you told your boss?", "هیجان‌انگیز است. به رئیست گفته‌ای؟"),
            d("B", "Not yet. I've been waiting for the right moment.", "هنوز نه. منتظر لحظه مناسب بوده‌ام."),
            d("A", "I understand. It's a big step.", "می‌فهمم. قدم بزرگی است."),
            d("B", "It is. But I've realized that comfort is the enemy of growth.", "هست. ولی فهمیده‌ام که راحتی دشمن رشد است."),
            d("A", "That's a powerful insight. Have you read anything that inspired you?", "بینش قدرتمندی است. چیزی خوانده‌ای که الهام‌بخش باشد؟"),
            d("B", "Actually, yes. 'Designing Your Life' by Burnett and Evans.", "در واقع، بله. «طراحی زندگی‌ات» از برنت و ایوانز."),
            d("A", "I've heard of it. What's the main idea?", "شنیده‌ام. ایده اصلی‌اش چیست؟"),
            d("B", "That you can prototype different versions of your life, like a designer.", "که می‌توانی نسخه‌های مختلفی از زندگی‌ات را نمونه‌سازی کنی، مثل یک طراح."),
            d("A", "That's a refreshing approach. Have you tried prototyping?", "رویکرد تازه‌ای است. نمونه‌سازی را امتحان کرده‌ای؟"),
            d("B", "Yes. I've been volunteering at a community center to test teaching.", "بله. برای آزمایش تدریس در یک مرکز اجتماعی داوطلب شده‌ام."),
            d("A", "How's it going?", "چطور پیش می‌رود؟"),
            d("B", "I love it. I've never felt more alive than when I'm helping someone learn.", "عاشقش هستم. هرگز زنده‌تر از وقتی که به کسی در یادگیری کمک می‌کنم حس نکرده‌ام."),
            d("A", "That's a strong sign. You should pursue it.", "نشانه قوی‌ای است. باید دنبالش کنی."),
            d("B", "I'm planning to. I've already registered for an info session.", "قصد دارم. قبلاً برای یک جلسه اطلاعاتی ثبت‌نام کرده‌ام."),
            d("A", "That's great. When is it?", "عالی است. کی است؟"),
            d("B", "Next Tuesday. I'm a little nervous, honestly.", "سه‌شنبه آینده. راستش کمی مضطربم."),
            d("A", "That's normal. But you've taken the hardest step already.", "طبیعی است. ولی سخت‌ترین قدم را برداشته‌ای."),
            d("B", "What's that?", "چیست؟"),
            d("A", "Admitting what you really want.", "اعتراف به آنچه واقعاً می‌خواهی."),
            d("B", "That's true. It took me years to say it out loud.", "درست است. سال‌ها طول کشید تا بلند بگویمش."),
            d("A", "I know the feeling. I've been hiding my ambition for a long time.", "این حس را می‌شناسم. مدت‌هاست جاه‌طلبی‌ام را پنهان کرده‌ام."),
            d("B", "Why did you hide it?", "چرا پنهانش کردی؟"),
            d("A", "Fear of failure, I guess. Or fear of what people would think.", "ترس از شکست، فکر می‌کنم. یا ترس از اینکه مردم چه فکر کنند."),
            d("B", "I've been there. But I've learned that regret is worse than failure.", "من هم آنجا بوده‌ام. ولی یاد گرفته‌ام که پشیمانی بدتر از شکست است."),
            d("A", "That's a great way to look at it. Have you ever failed at something big?", "روش خوبی برای نگاه کردن است. هرگز در چیز بزرگی شکست خورده‌ای؟"),
            d("B", "Yes. I once started a business that flopped.", "بله. یک بار کسب‌وکاری راه انداختم که شکست خورد."),
            d("A", "What happened?", "چه شد؟"),
            d("B", "I underestimated the market. It was a painful lesson.", "بازار را دست‌کم گرفتم. درس دردناکی بود."),
            d("A", "But you moved on.", "ولی ادامه دادی."),
            d("B", "I had to. I've learned that failure isn't final unless you quit.", "مجبور بودم. یاد گرفته‌ام که شکست نهایی نیست مگر تسلیم شوی."),
            d("A", "That's inspiring. What did you learn from it?", "الهام‌بخش است. چه چیزی یاد گرفتی؟"),
            d("B", "That I'm more resilient than I thought. And that I can start over.", "که تاب‌آورتر از آنچه فکر می‌کردم هستم. و می‌توانم از نو شروع کنم."),
            d("A", "So what's your biggest goal now?", "خب بزرگ‌ترین هدف فعلی‌ات چیست؟"),
            d("B", "To become a teacher. It's not glamorous, but it's meaningful.", "معلم شدن. پر زرق و برق نیست، ولی معنی‌دار است."),
            d("A", "Meaning matters more than glamour.", "معنی مهم‌تر از زرق و برق است."),
            d("B", "Exactly. So what about you? What's your biggest dream?", "دقیقاً. تو چطور؟ بزرگ‌ترین رویایت چیست؟"),
            d("A", "I want to work in AI ethics. I've been reading about it for years.", "می‌خواهم در اخلاق هوش مصنوعی کار کنم. سال‌هاست درباره‌اش می‌خوانم."),
            d("B", "AI ethics? That's a cutting-edge field.", "اخلاق هوش مصنوعی؟ حوزه پیشرویی است."),
            d("A", "It is. And it needs people who care about both technology and humanity.", "هست. و به افرادی نیاز دارد که هم به تکنولوژی و هم به انسانیت اهمیت دهند."),
            d("B", "You'd be perfect for that. Have you looked into specific programs?", "تو برای آن عالی می‌شوی. برنامه‌های خاصی را بررسی کرده‌ای؟"),
            d("A", "Yes. There's a great one at Oxford. But it's extremely competitive.", "بله. یکی عالی در آکسفورد هست. ولی بسیار رقابتی است."),
            d("B", "Have you applied?", "درخواست داده‌ای؟"),
            d("A", "Not yet. I've been polishing my application for weeks.", "هنوز نه. هفته‌هاست درخواستم را صیقل می‌دهم."),
            d("B", "When's the deadline?", "مهلت کی است؟"),
            d("A", "End of the month. I've been working on my personal statement.", "آخر ماه. روی بیانیه شخصی‌ام کار کرده‌ام."),
            d("B", "That's the hardest part. Have you had anyone review it?", "سخت‌ترین بخشش است. کسی بازبینی‌اش کرده؟"),
            d("A", "Yes, a former professor. She gave me great feedback.", "بله، یک استاد سابق. بازخورد عالی داد."),
            d("B", "That's helpful. What did she say?", "کمک‌کننده است. چه گفت؟"),
            d("A", "That I should be more specific about my goals. So I've been revising.", "که باید درباره اهدافم مشخص‌تر باشم. پس در حال بازنگری هستم."),
            d("B", "You're really committed to this.", "واقعاً متعهد به این هستی."),
            d("A", "I am. I've never wanted anything this much.", "هستم. هرگز اینقدر چیزی نخواسته‌ام."),
            d("B", "That's how you know it's the right path.", "این‌طور می‌فهمی مسیر درست است."),
            d("A", "I hope so. What if I don't get in?", "امیدوارم. اگر قبول نشوم چه؟"),
            d("B", "Then you apply again. Or find another route. There's always a way.", "پس دوباره درخواست می‌دهی. یا راه دیگری پیدا می‌کنی. همیشه راهی هست."),
            d("A", "You're right. I've been too focused on one outcome.", "حق داری. بیش از حد روی یک نتیجه متمرکز بوده‌ام."),
            d("B", "It's natural. But keep your options open.", "طبیعی است. ولی گزینه‌هایت را باز نگه دار."),
            d("A", "I will. Thanks for the perspective.", "می‌کنم. ممنون برای دیدگاه."),
            d("B", "Anytime. Let's check in with each other next month.", "هر وقت. بیایید ماه آینده با هم چک کنیم."),
            d("A", "Deal. I want to hear about your teaching journey.", "قبول. می‌خواهم درباره سفر تدریست بشنوم."),
            d("B", "And I want to hear about Oxford!", "و من می‌خواهم درباره آکسفورد بشنوم!"),
            d("A", "Fingers crossed for both of us.", "برای هر دوی‌مان انگشت‌ها را به هم می‌فشاریم."),
            d("B", "Fingers crossed. Talk soon.", "انگشت‌ها به هم. به‌زودی صحبت."),
            d("A", "Talk soon. Bye!", "به‌زودی صحبت. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How long has A been working in the same job?", listOf("3 years", "6 years", "10 years", "15 years"), 1),
            q("What field is A considering for a master's degree?", listOf("marketing", "data science", "education", "law"), 1),
            q("What has A been teaching themselves?", listOf("Java", "Python", "C++", "Ruby"), 1),
            q("What is B's real passion?", listOf("marketing", "education", "data science", "finance"), 1),
            q("What book does B recommend?", listOf("'Atomic Habits'", "'Designing Your Life'", "'The 7 Habits'", "'Mindset'"), 1),
            q("How long has A been working there?", listOf("have worked", "have been working", "worked", "works"), 1),
            q("I ___ to five universities so far.", listOf("have applied", "have been applying", "applied", "apply"), 0),
            q("She ___ her thesis already.", listOf("has finished", "has been finishing", "finished", "finishes"), 0),
            q("They ___ never traveled abroad.", listOf("have", "has", "had", "are"), 0),
            q("I ___ on this project for months.", listOf("have worked", "have been working", "worked", "work"), 1)
        ),
        idioms = listOf(
            IdiomExpression("At a crossroads", "در دوراهی", "I'm at a crossroads in my career.", "در دوراهی حرفه‌ام هستم."),
            IdiomExpression("Hit a ceiling", "به سقف رسیدن", "I feel like I've hit a ceiling.", "حس می‌کنم به سقف رسیده‌ام."),
            IdiomExpression("Fingers crossed", "انگشت‌ها به هم", "Fingers crossed for both of us.", "برای هر دوی‌مان انگشت‌ها را به هم می‌فشاریم."),
            IdiomExpression("Comfort is the enemy of growth", "راحتی دشمن رشد است", "Comfort is the enemy of growth.", "راحتی دشمن رشد است."),
            IdiomExpression("Go for it", "دنبالش برو", "If it's your dream, go for it.", "اگر رویای توست، دنبالش برو."),
            IdiomExpression("Cutting-edge", "پیشرو", "AI ethics is a cutting-edge field.", "اخلاق هوش مصنوعی حوزه پیشرویی است."),
            IdiomExpression("Flop", "شکست خوردن", "I started a business that flopped.", "کسب‌وکاری راه انداختم که شکست خورد."),
            IdiomExpression("Regret is worse than failure", "پشیمانی بدتر از شکست است", "Regret is worse than failure.", "پشیمانی بدتر از شکست است.")
        ),
        phrasal = listOf(
            PhrasalVerb("go back to", "بازگشتن به", "return to",
                "I've been considering going back to school.", "به بازگشت به مدرسه فکر کرده‌ام.", "No"),
            PhrasalVerb("reach out to", "تماس گرفتن با", "contact someone",
                "I've been reaching out to alumni.", "با فارغ‌التحصیلان تماس گرفته‌ام.", "No"),
            PhrasalVerb("go for", "دنبال کردن", "pursue",
                "Go for it.", "دنبالش برو.", "No"),
            PhrasalVerb("figure out", "فهمیدن", "solve / understand",
                "I'm sure you'll figure it out.", "مطمئنم حلش می‌کنی.", "Yes"),
            PhrasalVerb("look into", "بررسی کردن", "investigate",
                "Have you looked into scholarships?", "بورسیه‌ها را بررسی کرده‌ای؟", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Present perfect continuous stress", "Stress 'been' and the -ing verb: I've BEEN WORKing on this project."),
            PronunciationTip("Present perfect vs. continuous", "Finished: I've WORKED here for five years. Continuing: I've BEEN WORKing here for five years."),
            PronunciationTip("Intonation for enthusiasm", "Use rising intonation for encouragement: That's great! ↗ Go for it! ↗")
        ),
        culture = listOf(
            CulturalNote("Career changes",
                "Changing careers is increasingly common, especially in knowledge economies. Lifelong learning and adaptability are valued more than stability in a single profession."),
            CulturalNote("The role of mentors",
                "In many professional cultures, having a mentor is seen as crucial for career advancement. Mentorship provides guidance, networking opportunities, and perspective."),
            CulturalNote("AI ethics",
                "AI ethics is a rapidly growing field that examines the moral implications of artificial intelligence. It addresses issues like bias, privacy, autonomy, and accountability.")
        ),
        mistakes = listOf(
            CommonMistake("I have applied to five universities last year.", "I applied to five universities last year.", "Use simple past with specific time expressions."),
            CommonMistake("I have been knowing him for years.", "I have known him for years.", "Use present perfect (not continuous) with stative verbs."),
            CommonMistake("She has been finished her thesis.", "She has finished her thesis.", "Use present perfect for completed actions.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why does A feel stuck in their career?", "A has hit a ceiling and wants more growth opportunities."),
            ComprehensionQuestion("What is B's career goal and why?", "To become a teacher because education is their real passion and they find it meaningful."),
            ComprehensionQuestion("What is A's dream job and why?", "To work in AI ethics because it combines technology and humanity.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your career goals and what you've done to pursue them.",
                "اهداف شغلی‌ات را توصیف کن و بگو چه کارهایی برای دنبال کردنشان انجام داده‌ای.",
                "I've been... / I have... / I'm planning to..."),
            SpeakingTask("Discuss a time you faced a setback and how you overcame it.",
                "درباره زمانی که با شکستی روبرو شدی و چطور بر آن غلبه کردی صحبت کن.",
                "I faced... / I overcame it by... / I learned..."),
            SpeakingTask("Role-play a conversation about changing careers.",
                "نقش‌بازی گفت‌وگو درباره تغییر شغل.",
                "I've been thinking about... / Have you considered...? / What's stopping you?")
        ),
        writing = listOf(
            WritingTask("Write a personal statement about your career goals.",
                "بیانیه شخصی درباره اهداف شغلی‌ات بنویس.",
                280, "Use present perfect and present perfect continuous appropriately.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 2 — Character and Responsibility | شخصیت و مسئولیت
    // ═══════════════════════════════════════════════════════════
    private fun unit2() = base(
        2, "Character and Responsibility", "شخصیت و مسئولیت",
        listOf(
            "Describe the consequences of lying",
            "Express regret and take responsibility",
            "Explore where values come from",
            "Discuss how best to help others",
            "Use adjective clauses with whose, where, and when",
            "Use relative pronouns as objects of prepositions"
        ),
        listOf(
            v("integrity", "درستکاری", "She's a person of great integrity.", "او فردی با درستکاری فراوان است."),
            v("honesty", "صداقت", "Honesty is the foundation of trust.", "صداقت پایه اعتماد است."),
            v("consequence", "پیامد", "Every action has consequences.", "هر عملی پیامدهایی دارد."),
            v("regret", "پشیمانی", "He expressed deep regret for his actions.", "او پشیمانی عمیقی از کارهایش ابراز کرد."),
            v("responsibility", "مسئولیت", "Taking responsibility is a sign of maturity.", "پذیرش مسئولیت نشانه بلوغ است."),
            v("accountability", "پاسخگویی", "Accountability builds trust.", "پاسخگویی اعتماد می‌سازد."),
            v("moral", "اخلاقی", "It was a moral dilemma with no easy answer.", "دوراهی اخلاقی بود بدون پاسخ آسان.", "adjective"),
            v("values", "ارزش‌ها", "Honesty is one of my core values.", "صداقت یکی از ارزش‌های اصلی من است."),
            v("ethical", "اخلاقی", "Is it ethical to lie to protect someone?", "آیا دروغ گفتن برای محافظت از کسی اخلاقی است؟", "adjective"),
            v("conscience", "وجدان", "His conscience bothered him for days.", "وجدانش روزها آزارش داد."),
            v("confess", "اعتراف کردن", "He finally confessed to the mistake.", "او بالاخره به اشتباه اعتراف کرد.", "verb"),
            v("betray", "خیانت کردن", "Trust is hard to rebuild after betrayal.", "اعتماد بعد از خیانت سخت بازسازی می‌شود.", "verb"),
            v("loyalty", "وفاداری", "Loyalty is important in any relationship.", "وفاداری در هر رابطه‌ای مهم است."),
            v("compassion", "دلسوزی", "She showed great compassion for the homeless.", "او دلسوزی زیادی برای بی‌خانمان‌ها نشان داد."),
            v("altruism", "نوع‌دوستی", "True altruism expects nothing in return.", "نوع‌دوستی واقعی انتظار چیزی در عوض ندارد."),
            v("philanthropy", "بشر‌دوستی", "His philanthropy funded many schools.", "بشر‌دوستی‌اش بسیاری از مدارس را تأمین مالی کرد."),
            v("empathy", "همدلی", "Empathy allows us to understand others' feelings.", "همدلی به ما اجازه می‌دهد احساسات دیگران را درک کنیم."),
            v("guilt", "احساس گناه", "He felt overwhelming guilt for lying.", "او احساس گناه طاقت‌فرسایی برای دروغ گفتن داشت."),
            v("transparency", "شفافیت", "Transparency builds credibility.", "شفافیت اعتبار می‌سازد."),
            v("principles", "اصول", "She refused to compromise her principles.", "او حاضر نشد اصولش را زیر پا بگذارد.")
        ),
        listOf(
            GrammarSection(
                "Adjective clauses with whose, where, and when",
                "Use 'whose' for possession: The person whose wallet I found was grateful. Use 'where' for places: The store where I bought it is closed. Use 'when' for times: The day when I confessed was difficult."
            ),
            GrammarSection(
                "Relative pronoun as object of a preposition",
                "In formal English, the preposition comes before the relative pronoun: The person to whom I spoke was helpful. The issue about which we argued was resolved. In informal English, the preposition can come at the end: The person I spoke to was helpful."
            ),
            GrammarSection(
                "Conversation strategies for moral discussions",
                "Use 'I hate to tell you this, but' to soften bad news. Use 'Are you sure?' to confirm information. Use 'That's not necessary' to decline help politely. Use 'I feel terrible' to convey regret."
            )
        ),
        listOf(
            d("A", "Hey, do you have a minute? I need to get something off my chest.", "سلام، یک دقیقه وقت داری؟ باید چیزی را از دلم بیرون بریزم."),
            d("B", "Of course. What's wrong?", "حتماً. چی شده؟"),
            d("A", "I did something I'm not proud of. And I've been feeling terrible about it.", "کاری کردم که به آن افتخار نمی‌کنم. و درباره‌اش احساس وحشتناکی داشته‌ام."),
            d("B", "What happened?", "چه شد؟"),
            d("A", "I lied to my best friend. About something important.", "به بهترین دوستم دروغ گفتم. درباره چیز مهمی."),
            d("B", "What did you lie about?", "درباره چه دروغ گفتی؟"),
            d("A", "She asked if I had told anyone about her divorce. And I said no. But I had.", "پرسید آیا درباره طلاقش به کسی گفته‌ام یا نه. گفتم نه. ولی گفته بودم."),
            d("B", "Why did you tell someone?", "چرا به کسی گفتی؟"),
            d("A", "I was talking to my sister and it just slipped out. I didn't mean to.", "با خواهرم صحبت می‌کردم و فقط از دهانم پرید. قصد نداشتم."),
            d("B", "And then you lied to cover it up?", "و بعد برای پوشاندنش دروغ گفتی؟"),
            d("A", "Yes. And now I'm trapped. I feel so guilty.", "بله. و حالا گیر افتاده‌ام. خیلی احساس گناه می‌کنم."),
            d("B", "That's a difficult situation. Have you thought about telling her the truth?", "وضعیت دشواری است. به گفتن حقیقت به او فکر کرده‌ای؟"),
            d("A", "I've thought about it. But I'm scared she'll never trust me again.", "فکر کرده‌ام. ولی می‌ترسم دیگر هرگز به من اعتماد نکند."),
            d("B", "I hate to tell you this, but she might find out eventually.", "از گفتن این خوشم نمی‌آید، ولی ممکن است در نهایت بفهمد."),
            d("A", "I know. That's what I'm afraid of.", "می‌دانم. همین چیزی است که ازش می‌ترسم."),
            d("B", "The person whose trust you broke is the one who deserves the truth.", "کسی که اعتمادش را شکستی همان کسی است که سزاوار حقیقت است."),
            d("A", "You're right. But how do I even start that conversation?", "حق داری. ولی چطور حتی آن گفت‌وگو را شروع کنم؟"),
            d("B", "Maybe start by apologizing. Acknowledge what you did.", "شاید با عذرخواهی شروع کن. به آنچه کردی اعتراف کن."),
            d("A", "I've been rehearsing it in my head for days.", "روزهاست در ذهنم تمرینش می‌کنم."),
            d("B", "That's a sign you really care. You're not a bad person.", "نشانه این است که واقعاً اهمیت می‌دهی. آدم بدی نیستی."),
            d("A", "Thanks. But I still feel awful.", "ممنون. ولی هنوز حس بدی دارم."),
            d("B", "Guilt is your conscience telling you to make things right.", "احساس گناه وجدانت است که می‌گوید اوضاع را درست کن."),
            d("A", "I know. That's why I have to confess.", "می‌دانم. برای همین باید اعتراف کنم."),
            d("B", "Where did you learn to value honesty so much?", "کجا یاد گرفتی اینقدر برای صداقت ارزش قائل شوی؟"),
            d("A", "From my grandmother. She was the most honest person I've ever known.", "از مادربزرگم. او صادق‌ترین فردی بود که می‌شناسم."),
            d("B", "She sounds like she had a strong influence on you.", "به نظر می‌رسد تأثیر قوی روی تو داشته."),
            d("A", "She did. She used to say, 'The truth may hurt, but lies destroy.'", "داشت. می‌گفت: «حقیقت ممکن است آزار دهد، ولی دروغ نابود می‌کند.»"),
            d("B", "That's powerful. Where did she learn that?", "قدرتمند است. او از کجا یاد گرفته بود؟"),
            d("A", "From her own mother. It's a family value passed down through generations.", "از مادر خودش. یک ارزش خانوادگی است که نسل به نسل منتقل شده."),
            d("B", "That's beautiful. Values are often rooted in family.", "زیباست. ارزش‌ها اغلب در خانواده ریشه دارند."),
            d("A", "What about you? Where do your values come from?", "تو چطور؟ ارزش‌هایت از کجا می‌آیند؟"),
            d("B", "Mostly from my experiences. I've learned through my mistakes.", "بیشتر از تجربیاتم. از اشتباهاتم یاد گرفته‌ام."),
            d("A", "What's the biggest lesson you've learned?", "بزرگ‌ترین درسی که یاد گرفته‌ای چیست؟"),
            d("B", "That honesty really is the best policy. I've seen how lies snowball.", "که صداقت واقعاً بهترین سیاست است. دیده‌ام چطور دروغ‌ها بزرگ می‌شوند."),
            d("A", "Snowball. That's exactly what happened to me.", "بزرگ شدن. دقیقاً همان چیزی است که برای من اتفاق افتاد."),
            d("B", "The longer you wait, the harder it gets.", "هرچه بیشتر صبر کنی، سخت‌تر می‌شود."),
            d("A", "So I should tell her today?", "پس باید امروز به او بگویم؟"),
            d("B", "That's up to you. But don't let fear stop you.", "به خودت بستگی دارد. ولی نگذار ترس متوقفت کند."),
            d("A", "You're right. I'll call her tonight.", "حق داری. امشب بهش زنگ می‌زنم."),
            d("B", "That takes courage. I admire that.", "این شجاعت می‌خواهد. تحسین می‌کنم."),
            d("A", "Thanks. Can I ask you something else?", "ممنون. می‌توانم چیز دیگری بپرسم؟"),
            d("B", "Sure.", "حتماً."),
            d("A", "Have you ever had to forgive someone for lying to you?", "تا حالا مجبور شده‌ای کسی را برای دروغ گفتن ببخشی؟"),
            d("B", "Yes. My brother lied to me about something big years ago.", "بله. برادرم سال‌ها پیش درباره چیز بزرگی به من دروغ گفت."),
            d("A", "How did you handle it?", "چطور با آن کنار آمدی؟"),
            d("B", "At first I was furious. But eventually I realized he was scared, not malicious.", "اولش عصبانی بودم. ولی در نهایت فهمیدم او ترسیده بود، نه بدخواه."),
            d("A", "So you forgave him?", "پس بخشیدی‌اش؟"),
            d("B", "Yes. Forgiveness isn't about excusing the lie. It's about freeing yourself from anger.", "بله. بخشش درباره توجیه دروغ نیست. درباره آزاد کردن خودت از خشم است."),
            d("A", "That's a mature perspective.", "دیدگاه بالغانه‌ای است."),
            d("B", "It took me years to get there.", "سال‌ها طول کشید تا به آنجا برسم."),
            d("A", "Do you think my friend will forgive me?", "فکر می‌کنی دوستم مرا می‌بخشد؟"),
            d("B", "I don't know. But the person whose friendship you value deserves the chance.", "نمی‌دانم. ولی کسی که دوستی‌اش را ارزش می‌گذاری سزاوار فرصت است."),
            d("A", "I hope she gives me that chance.", "امیدوارم آن فرصت را به من بدهد."),
            d("B", "All you can do is be sincere. The rest is up to her.", "تنها کاری که می‌توانی بکنی صادق بودن است. بقیه به او بستگی دارد."),
            d("A", "You're right. Thanks for listening.", "حق داری. ممنون که گوش دادی."),
            d("B", "Anytime. Let me know how it goes.", "هر وقت. بگو چطور پیش رفت."),
            d("A", "I will. And thanks for not judging me.", "می‌گویم. و ممنون که قضاوتم نکردی."),
            d("B", "We all make mistakes. What matters is what we do next.", "همه‌مان اشتباه می‌کنیم. مهم این است که بعدش چه می‌کنیم."),
            d("A", "That's a good reminder. Talk later.", "یادآوری خوبی است. بعداً صحبت."),
            d("B", "Talk later. Good luck tonight.", "بعداً صحبت. امشب موفق باشی."),
            d("A", "Thanks. Bye.", "ممنون. خداحافظ."),
            d("B", "Bye.", "خداحافظ.")
        ),
        listOf(
            q("What did A lie about?", "Telling someone about a friend's divorce",
            listOf("a financial issue", "a friend's divorce", "a work matter", "a family secret"), 1),
            q("Why did A lie?", listOf("to protect the friend", "to avoid conflict", "to cover up an earlier mistake", "to gain advantage"), 2),
            q("Where did A's values come from?", listOf("school", "grandmother", "friends", "books"), 1),
            q("What did B's brother lie about?", listOf("money", "a big issue", "a job", "a relationship"), 1),
            q("What does B say about forgiveness?", listOf("it excuses the lie", "it frees you from anger", "it's always easy", "it's unnecessary"), 1),
            q("The person ___ wallet I found was grateful.", listOf("who", "whose", "which", "whom"), 1),
            q("The store ___ I bought it is closed.", listOf("which", "that", "where", "when"), 2),
            q("The day ___ I confessed was difficult.", listOf("where", "when", "which", "whose"), 1),
            q("The person to ___ I spoke was helpful.", listOf("who", "whom", "which", "whose"), 1),
            q("The issue about ___ we argued was resolved.", listOf("who", "whom", "which", "whose"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Get off my chest", "از دلم بیرون ریختن", "I need to get something off my chest.", "باید چیزی را از دلم بیرون بریزم."),
            IdiomExpression("Snowball", "بزرگ شدن", "Lies snowball.", "دروغ‌ها بزرگ می‌شوند."),
            IdiomExpression("Hit a ceiling", "به سقف رسیدن", "I've hit a ceiling.", "به سقف رسیده‌ام."),
            IdiomExpression("Slip out", "از دهان پریدن", "It just slipped out.", "فقط از دهانم پرید."),
            IdiomExpression("Cover up", "پوشاندن", "I lied to cover it up.", "برای پوشاندنش دروغ گفتم."),
            IdiomExpression("Taking responsibility", "پذیرش مسئولیت", "Taking responsibility is a sign of maturity.", "پذیرش مسئولیت نشانه بلوغ است."),
            IdiomExpression("Best policy", "بهترین سیاست", "Honesty is the best policy.", "صداقت بهترین سیاست است."),
            IdiomExpression("Up to you", "به خودت بستگی دارد", "That's up to you.", "به خودت بستگی دارد.")
        ),
        phrasal = listOf(
            PhrasalVerb("get off", "بیرون ریختن", "express something",
                "I need to get this off my chest.", "باید این را از دلم بیرون بریزم.", "Yes"),
            PhrasalVerb("cover up", "پوشاندن", "hide the truth",
                "I lied to cover it up.", "برای پوشاندنش دروغ گفتم.", "Yes"),
            PhrasalVerb("find out", "فهمیدن", "discover",
                "She might find out eventually.", "ممکن است در نهایت بفهمد.", "Yes"),
            PhrasalVerb("own up to", "اعتراف کردن", "admit responsibility",
                "He owned up to his mistake.", "او به اشتباهش اعتراف کرد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Adjective clause stress", "Stress the relative pronoun: The person WHOSE wallet I found."),
            PronunciationTip("Preposition + relative pronoun", "In formal speech, stress the preposition: The person to WHOM I spoke."),
            PronunciationTip("Intonation for regret", "Use falling intonation for regret: I feel terrible about it. ↘")
        ),
        culture = listOf(
            CulturalNote("Honesty and culture",
                "Attitudes toward honesty and white lies vary across cultures. Some value directness; others prioritize harmony. Understanding these differences is crucial for cross-cultural communication."),
            CulturalNote("Values formation",
                "Values are shaped by family, culture, religion, education, and personal experience. Psychologists suggest that core values are largely formed by early adulthood."),
            CulturalNote("Forgiveness",
                "Forgiveness is a complex psychological process. Research shows it can reduce stress, improve mental health, and restore relationships — but it requires time and sincerity.")
        ),
        mistakes = listOf(
            CommonMistake("The person who wallet I found...", "The person whose wallet I found...", "Use 'whose' for possession."),
            CommonMistake("The place which I bought it...", "The place where I bought it...", "Use 'where' for places."),
            CommonMistake("The person who I spoke to (formal: to whom I spoke).", "The person to whom I spoke (formal).", "In formal English, prepositions precede the relative pronoun.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the consequences of A's lie?", "A feels trapped and guilty, and fears losing their friend's trust."),
            ComprehensionQuestion("Where did A's values come from?", "From their grandmother, who taught that truth matters even when it hurts."),
            ComprehensionQuestion("What is B's view on forgiveness?", "Forgiveness isn't about excusing the lie; it's about freeing yourself from anger.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a time you had to take responsibility for a mistake.",
                "درباره زمانی که مجبور شدی مسئولیت اشتباهی را بپذیری صحبت کن.",
                "I had to... / I felt... / I learned..."),
            SpeakingTask("Explore where your values come from.",
                "کاوش کن که ارزش‌هایت از کجا می‌آیند.",
                "My values come from... / I learned from... / I believe..."),
            SpeakingTask("Role-play a difficult conversation about a lie.",
                "نقش‌بازی یک گفت‌وگوی دشوار درباره یک دروغ.",
                "I need to tell you something... / I'm sorry... / Can you forgive me?")
        ),
        writing = listOf(
            WritingTask("Write a reflective essay about a time you had to make an ethical choice.",
                "مقاله تأملی درباره زمانی که مجبور شدی انتخاب اخلاقی کنی بنویس.",
                280, "Use adjective clauses and relative pronouns as objects of prepositions.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 3 — Help in Emergencies | کمک در شرایط اضطراری
    // ═══════════════════════════════════════════════════════════
    private fun unit3() = base(
        3, "Help in Emergencies", "کمک در شرایط اضطراری",
        listOf(
            "Discuss how to respond in emergencies",
            "Explore what makes someone a hero",
            "Talk about staying calm under pressure",
            "Use the passive voice with modals",
            "Use non-defining relative clauses"
        ),
        listOf(
            v("emergency", "اضطرار", "Call 911 in an emergency.", "در اضطرار با ۹۱۱ تماس بگیرید."),
            v("rescue", "نجات دادن", "Firefighters rescued the family from the fire.", "آتش‌نشانان خانواده را از آتش نجات دادند.", "verb"),
            v("hero", "قهرمان", "She's a hero for saving the child.", "او برای نجات کودک قهرمان است."),
            v("courage", "شجاعت", "It took courage to speak up.", "شجاعت لازم بود تا صحبت کند."),
            v("instinct", "غریزه", "His instinct told him something was wrong.", "غریزه‌اش گفت چیزی اشتباه است."),
            v("pressure", "فشار", "Doctors work well under pressure.", "پزشکان زیر فشار خوب کار می‌کنند."),
            v("panic", "ترس و اضطراب", "Don't panic in an emergency.", "در اضطرار وحشت نکن.", "verb"),
            v("witness", "شاهد", "She witnessed the accident.", "او شاهد تصادف بود."),
            v("alert", "هوشیار", "Stay alert at all times.", "همیشه هوشیار باش.", "adjective"),
            v("quick-thinking", "سریع‌الفکر", "He was quick-thinking and saved lives.", "او سریع‌الفکر بود و جان‌ها را نجات داد.", "adjective"),
            v("selfless", "فداکار", "Her selfless act inspired many.", "عمل فداکارانه‌اش بسیاری را الهام بخشید.", "adjective"),
            v("respond", "پاسخ دادن", "How did you respond?", "چطور پاسخ دادی؟", "verb"),
            v("assess", "ارزیابی کردن", "Assess the situation before acting.", "قبل از عمل وضعیت را ارزیابی کن.", "verb"),
            v("first aid", "کمک‌های اولیه", "Everyone should know basic first aid.", "همه باید کمک‌های اولیه پایه را بدانند."),
            v("trained", "آموزش‌دیده", "She's trained in CPR.", "او در CPR آموزش دیده است.", "adjective"),
            v("evacuate", "تخلیه کردن", "They evacuated the building.", "ساختمان را تخلیه کردند.", "verb"),
            v("survivor", "بازمانده", "The survivors were taken to hospital.", "بازمانده‌ها به بیمارستان برده شدند."),
            v("tragedy", "فاجعه", "The tragedy brought the community together.", "فاجعه جامعه را دور هم جمع کرد."),
            v("volunteer", "داوطلب", "Volunteers helped with the rescue.", "داوطلبان در نجات کمک کردند."),
            v("cope", "کنار آمدن", "It took time to cope with the trauma.", "مدت طول کشید تا با تروما کنار بیاید.", "verb")
        ),
        listOf(
            GrammarSection(
                "Passive voice with modals",
                "Use modal + be + past participle. Emergency exits must be kept clear. Windows should be closed in a fire. Help can be called by dialing 911. People might be evacuated quickly."
            ),
            GrammarSection(
                "Non-defining relative clauses",
                "Use commas for extra information. My neighbor, who is a nurse, helped until the ambulance arrived. The fire, which started in the kitchen, spread quickly."
            ),
            GrammarSection(
                "Conversation strategies for emergencies",
                "Use 'I hate to say this, but' for warnings. Use 'It turned out that' for revealing outcomes. Use 'By the way' to add a relevant note. Use 'No wonder' when something makes sense in hindsight."
            )
        ),
        listOf(
            d("A", "Hey, I heard about the fire in your building. Are you okay?", "سلام، درباره آتش‌سوزی در ساختمانتان شنیدم. خوبی؟"),
            d("B", "Yeah, I'm fine. But it was terrifying, honestly.", "بله، خوبم. ولی راستش وحشتناک بود."),
            d("A", "What happened exactly?", "دقیقاً چه شد؟"),
            d("B", "It started around two in the morning. I woke up to the fire alarm.", "حدود دو صبح شروع شد. با آلارم آتش بیدار شدم."),
            d("A", "What did you do first?", "اول چه کار کردی؟"),
            d("B", "I grabbed my phone and a jacket and ran to the stairs. I didn't even think.", "گوشی و یک کاپشن برداشتم و به سمت پله‌ها دویدم. حتی فکر نکردم."),
            d("A", "That's instinct. What was it like outside?", "این غریزه است. بیرون چطور بود؟"),
            d("B", "Chaotic. People were crying, some were still in pajamas.", "آشفته. مردم گریه می‌کردند، برخی هنوز پیژامه داشتند."),
            d("A", "How long did it take for the firefighters to arrive?", "چقدر طول کشید تا آتش‌نشانان برسند؟"),
            d("B", "Only about five minutes. They're fast.", "فقط حدود پنج دقیقه. سریع هستند."),
            d("A", "That's amazing. Were there any heroes?", "عالی است. قهرمانی هم بود؟"),
            d("B", "Yes, actually. My neighbor, who is an off-duty nurse, ran back inside.", "بله، در واقع. همسایه‌ام، که پرستار خارج از شیفت است، دوباره داخل دوید."),
            d("A", "Why would she do that?", "چرا این کار را کرد؟"),
            d("B", "To check on the elderly woman in apartment 3B. She couldn't walk well.", "تا سراغ زن سالخورده در آپارتمان ۳B را بگیرد. نمی‌توانست خوب راه برود."),
            d("A", "Wow. That's incredibly selfless.", "واو. این فوق‌العاده فداکارانه است."),
            d("B", "It is. She helped her down the stairs just in time.", "هست. او را دقیقاً به موقع از پله‌ها پایین آورد."),
            d("A", "Was anyone hurt?", "کسی آسیب دید؟"),
            d("B", "Thankfully, no. But two apartments were completely destroyed.", "خوشبختانه نه. ولی دو آپارتمان کاملاً نابود شدند."),
            d("A", "That's awful. Do you know what caused it?", "چه بد. می‌دانی علتش چه بود؟"),
            d("B", "They think it was faulty wiring. The building is old.", "فکر می‌کنند سیم‌کشی معیوب بود. ساختمان قدیمی است."),
            d("A", "Should older buildings be inspected more often?", "آیا ساختمان‌های قدیمی باید بیشتر بازرسی شوند؟"),
            d("B", "Definitely. They must be checked regularly. It could have been prevented.", "قطعاً. باید منظم بررسی شوند. می‌توانست جلوگیری شود."),
            d("A", "What about fire alarms? Did they work?", "آلارم‌های آتش چطور؟ کار کردند؟"),
            d("B", "Yes. The alarm system should be maintained yearly, and it was.", "بله. سیستم آلارم باید سالانه نگهداری شود، و شده بود."),
            d("A", "That probably saved lives.", "این احتمالاً جان‌ها را نجات داد."),
            d("B", "It did. If the alarm hadn't gone off, I might not have woken up.", "همین‌طور است. اگر آلارم به کار نیفتاده بود، ممکن بود بیدار نشوم."),
            d("A", "That's a scary thought.", "فکر ترسناکی است."),
            d("B", "Yeah. I've been having trouble sleeping since then.", "بله. از آن موقع مشکل خواب داشته‌ام."),
            d("A", "That's understandable. Have you talked to anyone about it?", "قابل درک است. با کسی درباره‌اش صحبت کرده‌ای؟"),
            d("B", "A little. I've been doing some breathing exercises. They help a bit.", "کمی. چند تمرین تنفس انجام داده‌ام. کمی کمک می‌کنند."),
            d("A", "Have you considered talking to a therapist?", "به صحبت با درمانگر فکر کرده‌ای؟"),
            d("B", "I have. But I keep putting it off.", "فکر کرده‌ام. ولی مدام عقب می‌اندازم."),
            d("A", "Trauma is real. You shouldn't ignore it.", "تروما واقعی است. نباید نادیده‌اش بگیری."),
            d("B", "I know. I'll look into it this week.", "می‌دانم. این هفته بررسی می‌کنم."),
            d("A", "Have you been back inside since the fire?", "از زمان آتش‌سوزی داخل رفته‌ای؟"),
            d("B", "Only to grab some things. It felt strange. Different.", "فقط برای برداشتن چند چیز. عجیب حس شد. متفاوت."),
            d("A", "I can imagine. Will you stay in the building?", "می‌توانم تصور کنم. در ساختمان می‌مانی؟"),
            d("B", "For now. The insurance is covering repairs.", "فعلاً. بیمه تعمیرات را پوشش می‌دهد."),
            d("A", "That's good at least. What did you learn from this?", "حداقل خوب است. از این چه یاد گرفتی؟"),
            d("B", "That emergencies don't wait for you to be ready. You just have to act.", "که اضطرارها منتظر نمی‌مانند تا آماده باشی. فقط باید عمل کنی."),
            d("A", "Do you think you handled it well?", "فکر می‌کنی خوب مدیریت کردی؟"),
            d("B", "I think I panicked a little. But I did the important things.", "فکر می‌کنم کمی وحشت کردم. ولی کارهای مهم را انجام دادم."),
            d("A", "What would you do differently?", "چه کار متفاوتی می‌کردی؟"),
            d("B", "I'd keep an emergency bag ready. With documents, water, a flashlight.", "یک کیف اضطراری آماده نگه می‌داشتم. با مدارک، آب، چراغ‌قوه."),
            d("A", "That's a great idea. Everyone should have one.", "فکر عالی‌ای است. همه باید یکی داشته باشند."),
            d("B", "I know. I've been telling all my friends.", "می‌دانم. به همه دوستانم گفته‌ام."),
            d("A", "Do you know basic first aid?", "کمک‌های اولیه پایه را می‌دانی؟"),
            d("B", "A little. But I'm going to take a course. It might be needed someday.", "کمی. ولی می‌خواهم یک دوره بروم. ممکن است یک روز لازم شود."),
            d("A", "That's really smart. I should do the same.", "واقعاً هوشمندانه است. من هم باید همین کار را کنم."),
            d("B", "You should. It's a life skill.", "باید بکنی. یک مهارت زندگی است."),
            d("A", "How did your neighbors react after the fire?", "همسایه‌هایت بعد از آتش‌سوزی چطور واکنش نشان دادند؟"),
            d("B", "We came together. People helped each other. Offered places to stay.", "دور هم جمع شدیم. مردم به هم کمک کردند. جا برای ماندن پیشنهاد دادند."),
            d("A", "That's beautiful. Tragedy brings out the best in people sometimes.", "زیباست. فاجعه گاهی بهترین‌ها را در مردم بیرون می‌آورد."),
            d("B", "It does. I didn't really know my neighbors before. Now I do.", "همین‌طور است. قبلاً همسایه‌هایم را واقعاً نمی‌شناختم. حالا می‌شناسم."),
            d("A", "So something good came out of it?", "پس چیز خوبی از آن بیرون آمد؟"),
            d("B", "I guess so. We started a WhatsApp group. We check on each other now.", "فکر می‌کنم بله. یک گروه واتساپ راه انداختیم. حالا سراغ هم را می‌گیریم."),
            d("A", "That's lovely. Community matters.", "قشنگ است. جامعه محلی مهم است."),
            d("B", "It really does. Especially in hard times.", "واقعاً مهم است. مخصوصاً در زمان‌های سخت."),
            d("A", "Well, I'm glad you're okay.", "خب، خوشحالم که خوبی."),
            d("B", "Thanks. Me too.", "ممنون. من هم."),
            d("A", "Let me know if you need anything.", "اگر چیزی لازم داشتی بگو."),
            d("B", "I will. Thanks for asking.", "می‌گویم. ممنون که پرسیدی."),
            d("A", "Take care. Talk soon.", "مراقب باش. به‌زودی صحبت."),
            d("B", "Take care. Bye!", "مراقب باش. خداحافظ!")
        ),
        listOf(
            q("What caused the fire?", listOf("gas leak", "faulty wiring", "cooking accident", "arson"), 1),
            q("Who helped the elderly woman?", listOf("a firefighter", "an off-duty nurse", "A", "a police officer"), 1),
            q("How long did it take for firefighters to arrive?", listOf("2 minutes", "5 minutes", "10 minutes", "15 minutes"), 1),
            q("What has B been experiencing since the fire?", listOf("headaches", "sleep problems", "anxiety attacks", "back pain"), 1),
            q("What did B decide to keep ready?", listOf("food supplies", "an emergency bag", "extra clothing", "fire extinguisher"), 1),
            q("Emergency exits ___ be kept clear.", listOf("must", "should", "can", "might"), 0),
            q("My neighbor, ___ is a nurse, helped.", listOf("that", "which", "who", "whose"), 2),
            q("The fire, ___ started in the kitchen, spread.", listOf("that", "which", "who", "whose"), 1),
            q("Windows should ___ closed in a fire.", listOf("be", "being", "been", "to be"), 0),
            q("Help can ___ by dialing 911.", listOf("call", "be called", "calling", "be calling"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Off-duty", "خارج از شیفت", "My neighbor, who is off-duty, helped.", "همسایه‌ام، که خارج از شیفت است، کمک کرد."),
            IdiomExpression("Go off", "به کار افتادن", "The alarm went off.", "آلارم به کار افتاد."),
            IdiomExpression("Check on", "سراغ کسی را گرفتن", "She checked on the elderly woman.", "او سراغ زن سالخورده را گرفت."),
            IdiomExpression("Just in time", "دقیقاً به موقع", "She helped her down just in time.", "دقیقاً به موقع او را پایین آورد."),
            IdiomExpression("Come together", "دور هم جمع شدن", "The neighbors came together.", "همسایه‌ها دور هم جمع شدند."),
            IdiomExpression("Look into", "بررسی کردن", "I'll look into therapy.", "درمان را بررسی می‌کنم.")
        ),
        phrasal = listOf(
            PhrasalVerb("go off", "به کار افتادن", "activate",
                "The alarm went off at 2 AM.", "آلارم ساعت ۲ صبح به کار افتاد.", "No"),
            PhrasalVerb("check on", "سراغ کسی را گرفتن", "see how someone is",
                "She checked on the elderly woman.", "او سراغ زن سالخورده را گرفت.", "No"),
            PhrasalVerb("put off", "عقب انداختن", "postpone",
                "I keep putting it off.", "مدام عقبش می‌اندازم.", "Yes"),
            PhrasalVerb("come together", "دور هم جمع شدن", "unite",
                "The community came together.", "جامعه دور هم جمع شد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Passive modal stress", "Stress the past participle: The alarm should be MAINtained yearly."),
            PronunciationTip("Non-defining clause pause", "Pause slightly where commas would be: My neighbor, / who is a nurse, / helped."),
            PronunciationTip("Emergency stress", "Stress key words in emergencies: CALL 911! GET OUT! STAY CALM!")
        ),
        culture = listOf(
            CulturalNote("Emergency numbers",
                "Emergency numbers vary globally: 911 in the US/Canada, 999 in the UK, 112 in the EU, 119 in some Asian countries. Knowing the local number is essential when traveling."),
            CulturalNote("First aid training",
                "Basic first aid and CPR training is widely available and often free. Many workplaces require it. It's considered a civic skill in many countries."),
            CulturalNote("Community resilience",
                "Research shows that communities with strong social ties recover faster from disasters. Neighbors helping neighbors is one of the most effective forms of emergency response.")
        ),
        mistakes = listOf(
            CommonMistake("The alarm should be maintain yearly.", "The alarm should be maintained yearly.", "Use past participle in passive voice."),
            CommonMistake("My neighbor, that is a nurse, helped.", "My neighbor, who is a nurse, helped.", "Use 'who' for people, not 'that'."),
            CommonMistake("The fire, who started in the kitchen...", "The fire, which started in the kitchen...", "Use 'which' for things.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What caused the fire and what could have prevented it?", "Faulty wiring in an old building. Regular inspections could have prevented it."),
            ComprehensionQuestion("What did B learn from the experience?", "Emergencies don't wait; being prepared with an emergency bag and first aid training is essential."),
            ComprehensionQuestion("What positive outcome came from the tragedy?", "Neighbors came together and formed stronger community bonds.")
        ),
        speaking = listOf(
            SpeakingTask("Describe an emergency you've experienced or witnessed.",
                "اضطرار یا حادثه‌ای که تجربه کرده‌ای یا شاهد بوده‌ای توصیف کن.",
                "It happened when... / I responded by... / I learned..."),
            SpeakingTask("Discuss what makes someone a hero.",
                "درباره اینکه چه چیزی کسی را قهرمان می‌کند صحبت کن.",
                "Heroes are people who... / It takes courage to..."),
            SpeakingTask("Role-play calling emergency services.",
                "نقش‌بازی تماس با خدمات اضطراری.",
                "I need help... / There's been an accident... / The address is...")
        ),
        writing = listOf(
            WritingTask("Write a news report about a rescue or emergency event.",
                "گزارش خبری درباره یک نجات یا رویداد اضطراری بنویس.",
                280, "Use passive voice with modals and non-defining relative clauses.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 4 — Housing | مسکن
    // ═══════════════════════════════════════════════════════════
    private fun unit4() = base(
        4, "Housing", "مسکن",
        listOf(
            "Discuss housing options and preferences",
            "Compare renting and buying",
            "Talk about neighborhoods and communities",
            "Use the unreal conditional for hypothetical situations",
            "Use wish + past subjunctive for regrets"
        ),
        listOf(
            v("landlord", "صاحب‌خانه", "The landlord raised the rent.", "صاحب‌خانه اجاره را بالا برد."),
            v("tenant", "مستأجر", "The tenant pays rent monthly.", "مستأجر ماهانه اجاره می‌دهد."),
            v("mortgage", "وام مسکن", "They took out a 30-year mortgage.", "یک وام مسکن ۳۰ ساله گرفتند."),
            v("down payment", "پیش‌پرداخت", "The down payment was 20%.", "پیش‌پرداخت ۲۰٪ بود."),
            v("rent", "اجاره", "Rent is due on the first.", "اجاره اول ماه سر می‌رسد."),
            v("lease", "قرارداد اجاره", "The lease is for one year.", "قرارداد اجاره یک‌ساله است."),
            v("deposit", "ودیعه", "The security deposit is refundable.", "ودیعه قابل بازگشت است."),
            v("utilities", "آب و برق و گاز", "Utilities are included in the rent.", "آب و برق و گاز در اجاره گنجانده شده."),
            v("furnished", "مبله", "The apartment comes furnished.", "آپارتمان مبله تحویل داده می‌شود.", "adjective"),
            v("spacious", "جادار", "The living room is very spacious.", "اتاق نشیمن خیلی جادار است.", "adjective"),
            v("cozy", "دنج", "It's a cozy little place.", "جای کوچک و دنجی است.", "adjective"),
            v("downtown", "مرکز شهر", "They live downtown near the action.", "آن‌ها در مرکز شهر نزدیک همه چیز زندگی می‌کنند.", "adverb"),
            v("suburb", "حاشیه شهر", "The suburbs are quieter and safer.", "حاشیه‌های شهر ساکت‌تر و امن‌تر هستند."),
            v("commute", "رفتوآمد روزانه", "His commute takes an hour.", "رفتوآمد روزانه‌اش یک ساعت طول می‌کشد."),
            v("amenities", "امکانات", "The building has great amenities.", "ساختمان امکانات عالی دارد."),
            v("property value", "ارزش ملک", "Property values have risen sharply.", "ارزش ملک به شدت بالا رفته."),
            v("appreciate", "افزایش ارزش", "Homes appreciate over time.", "خانه‌ها به مرور ارزششان بالا می‌رود.", "verb"),
            v("renovate", "بازسازی کردن", "They renovated the entire kitchen.", "کل آشپزخانه را بازسازی کردند.", "verb"),
            v("equity", "سرمایه", "They built equity in their home over years.", "طی سال‌ها در خانه‌شان سرمایه ساختند."),
            v("foreclosure", "تصرف ملک", "Foreclosure is a risk with unpaid mortgages.", "تصرف ملک خطری با وام‌های پرداخت‌نشده است.")
        ),
        listOf(
            GrammarSection(
                "The unreal conditional (second conditional)",
                "Use it for hypothetical situations in the present or future. If I had more money, I would buy a house. If I were you, I'd rent for now. She would move if she could find a job."
            ),
            GrammarSection(
                "Wish + past subjunctive",
                "Use it for regrets or wishes about the present. I wish I owned my own place. She wishes the rent were lower. I wish I could afford to buy."
            ),
            GrammarSection(
                "Conversation strategies for housing",
                "Use 'Actually' to correct or clarify. Use 'That's exactly how I feel' to agree. Use 'I'm not so sure' to politely disagree. Use 'The thing is' to introduce a complication."
            )
        ),
        listOf(
            d("A", "So, I heard you're thinking about buying a place. Is that true?", "شنیدم به خرید خانه فکر می‌کنی. درست است؟"),
            d("B", "Yeah, I've been looking for a few months now.", "بله، چند ماه است نگاه می‌کنم."),
            d("A", "That's a big step. What made you decide?", "قدم بزرگی است. چه چیزی باعث شد تصمیم بگیری؟"),
            d("B", "Honestly? My rent keeps going up. I've paid over $100,000 in rent in ten years.", "راستش؟ اجاره‌ام مدام بالا می‌رود. در ده سال بیش از ۱۰۰ هزار دلار اجاره داده‌ام."),
            d("A", "That's a lot of money. But buying has its own costs.", "پول زیادی است. ولی خرید هم هزینه‌های خودش را دارد."),
            d("B", "I know. Mortgage, taxes, insurance, maintenance. It adds up.", "می‌دانم. وام، مالیات، بیمه، نگهداری. جمع می‌شود."),
            d("A", "At least with a mortgage, you're building equity.", "حداقل با وام مسکن، سرمایه می‌سازی."),
            d("B", "That's the main argument. Renting feels like throwing money away.", "این استدلال اصلی است. اجاره دادن مثل دور ریختن پول است."),
            d("A", "But renting has flexibility. You can move easily.", "ولی اجاره انعطاف دارد. راحت می‌توانی نقل مکان کنی."),
            d("B", "True. That's the trade-off.", "درست. این همان معامله است."),
            d("A", "Where are you looking?", "کجا نگاه می‌کنی؟"),
            d("B", "Mostly in the suburbs. Prices are lower there.", "بیشتر در حاشیه شهر. قیمت‌ها آنجا پایین‌تر است."),
            d("A", "But then your commute would be longer.", "ولی رفتم آمدت طولانی‌تر می‌شود."),
            d("B", "Yeah. If I bought downtown, I'd pay double for half the space.", "بله. اگر در مرکز شهر می‌خریدم، دو برابر برای نصف فضا می‌دادم."),
            d("A", "That's the reality of big cities.", "این واقعیت شهرهای بزرگ است."),
            d("B", "It is. If I worked remotely, the decision would be easier.", "هست. اگر از راه دور کار می‌کردم، تصمیم آسان‌تر بود."),
            d("A", "Do you think you could negotiate remote work?", "فکر می‌کنی می‌توانی کار از راه دور مذاکره کنی؟"),
            d("B", "Maybe. I've been thinking about asking my boss.", "شاید. به پرسیدن از رئیسم فکر کرده‌ام."),
            d("A", "What's stopping you?", "چه چیزی متوقفت می‌کند؟"),
            d("B", "Fear, mostly. What if he says no?", "بیشتر ترس. اگر بگوید نه چه؟"),
            d("A", "Then you know where you stand.", "پس می‌دانی کجای ایستاده‌ای."),
            d("B", "True. I'll ask next week.", "درست. هفته آینده می‌پرسم."),
            d("A", "So what's your budget?", "بودجه‌ات چقدر است؟"),
            d("B", "Around $400,000. That's what I can afford with my savings and income.", "حدود ۴۰۰ هزار دلار. این چیزی است که با پس‌انداز و درآمدم می‌توانم."),
            d("A", "That's reasonable. How much are you putting down?", "منطقی است. چقدر پیش‌پرداخت می‌دهی؟"),
            d("B", "Twenty percent. So $80,000.", "بیست درصد. یعنی ۸۰ هزار دلار."),
            d("A", "That's a solid down payment. Have you been saving long?", "پیش‌پرداخت محکمی است. مدت‌هاست پس‌انداز می‌کنی؟"),
            d("B", "About five years. It's been slow but steady.", "حدود پنج سال. کند ولی ثابت بوده."),
            d("A", "That shows real discipline. Have you talked to a realtor?", "این نظم واقعی را نشان می‌دهد. با مشاور املاک صحبت کرده‌ای؟"),
            d("B", "Yes. She's been helpful. But also pushy sometimes.", "بله. کمک‌کننده بوده. ولی گاهی هم فشار می‌آورد."),
            d("A", "That's their job. They want you to buy.", "این شغلشان است. می‌خواهند بخری."),
            d("B", "Exactly. I try not to be rushed.", "دقیقاً. سعی می‌کنم عجله نکنم."),
            d("A", "What's the biggest challenge so far?", "تا الان بزرگ‌ترین چالش چیست؟"),
            d("B", "Finding something that doesn't need major repairs.", "پیدا کردن چیزی که به تعمیرات اساسی نیاز نداشته باشد."),
            d("A", "Old houses can be money pits.", "خانه‌های قدیمی می‌توانند چاه پول باشند."),
            d("B", "Yeah. The inspection is crucial.", "بله. بازرسی حیاتی است."),
            d("A", "Have you ever had a place inspected?", "تا حالا جایی را بازرسی کرده‌ای؟"),
            d("B", "Not yet. But I'll insist on it before any offer.", "هنوز نه. ولی قبل از هر پیشنهادی اصرار خواهم کرد."),
            d("A", "Good. You don't want surprises.", "خوبه. غافلگیری نمی‌خواهی."),
            d("B", "Definitely not. I've heard horror stories.", "قطعاً نه. داستان‌های وحشتناک شنیده‌ام."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "A friend bought a house and found mold in the walls two months later.", "دوستی خانه‌ای خرید و دو ماه بعد کپک در دیوارها پیدا کرد."),
            d("A", "That's a nightmare. Did the inspection miss it?", "کابوس است. بازرسی ندیدش؟"),
            d("B", "It was hidden behind furniture. The seller knew.", "پشت مبلمان پنهان بود. فروشنده می‌دانست."),
            d("A", "That's fraud. Could he sue?", "این کلاهبرداری است. می‌توانست شکایت کند؟"),
            d("B", "He tried. It's still ongoing.", "تلاش کرد. هنوز ادامه دارد."),
            d("A", "Ugh. Real estate is complicated.", "آخ. املاک پیچیده است."),
            d("B", "Very. But what choice do we have? Everyone needs a place to live.", "خیلی. ولی چه چاره‌ای داریم؟ همه به جایی برای زندگی نیاز دارند."),
            d("A", "Have you considered living with family to save more?", "به زندگی با خانواده برای پس‌انداز بیشتر فکر کرده‌ای؟"),
            d("B", "I did for a while. But it was hard on everyone.", "مدتی کردم. ولی برای همه سخت بود."),
            d("A", "I understand. It's not for everyone.", "می‌فهمم. برای همه نیست."),
            d("B", "What about you? Are you happy renting?", "تو چطور؟ از اجاره راضی هستی؟"),
            d("A", "Mostly. I don't want the responsibility of ownership.", "بیشتر وقت‌ها. مسئولیت مالکیت را نمی‌خواهم."),
            d("B", "Really? Not even for the equity?", "واقعاً؟ حتی برای سرمایه؟"),
            d("A", "Not right now. I value flexibility more.", "الان نه. برای انعطاف بیشتر ارزش قائلم."),
            d("B", "That makes sense. Different priorities.", "منطقی است. اولویت‌های متفاوت."),
            d("A", "Exactly. Some people love owning. Others prefer renting.", "دقیقاً. بعضی‌ها مالکیت را دوست دارند. دیگران اجاره را ترجیح می‌دهند."),
            d("B", "If you could live anywhere, where would it be?", "اگر می‌توانستی هر جا زندگی کنی، کجا می‌بود؟"),
            d("A", "Hmm. If I could live anywhere, I'd live by the ocean.", "هوم. اگر هر جا می‌توانستم، کنار اقیانوس زندگی می‌کردم."),
            d("B", "That sounds peaceful.", "آرامش‌بخش به نظر می‌رسد."),
            d("A", "It does. But it's also expensive and remote.", "هست. ولی همچنین گران و دور است."),
            d("B", "Reality always interferes with dreams.", "واقعیت همیشه با رویاها تداخل دارد."),
            d("A", "It does. I wish I could have both — peaceful location and city convenience.", "همینطور است. ای کاش می‌توانستم هر دو را داشته باشم — مکان آرام و راحتی شهر."),
            d("B", "Wouldn't we all?", "مگه همه‌مون نمی‌خوایم؟"),
            d("A", "Ha! True.", "ها! درست."),
            d("B", "What's the best place you've ever lived?", "بهترین جایی که تا حالا زندگی کرده‌ای کجاست؟"),
            d("A", "Probably a small town in Vermont. Very charming.", "احتمالاً یک شهر کوچک در ورمونت. خیلی جذاب."),
            d("B", "Why did you leave?", "چرا ترکش کردی؟"),
            d("A", "Work. No jobs there in my field.", "کار. در حوزه من آنجا شغلی نبود."),
            d("B", "That's a common problem.", "این مشکل رایجی است."),
            d("A", "It is. If remote work had been common back then, I might still be there.", "هست. اگر کار از راه دور آن موقع رایج بود، ممکن بود هنوز آنجا باشم."),
            d("B", "Maybe you can go back someday.", "شاید یک روز بتوانی برگردی."),
            d("A", "Maybe. If I could work remotely full-time, I would.", "شاید. اگر می‌توانستم تمام‌وقت از راه دور کار کنم، می‌کردم."),
            d("B", "Never say never.", "هرگز هرگز نگو."),
            d("A", "Very true.", "خیلی درست."),
            d("B", "Well, I should get going. I have a viewing this afternoon.", "خب، باید بروم. امروز بعدازظهر یک بازدید دارم."),
            d("A", "Good luck! Let me know how it goes.", "موفق باشی! بگو چطور پیش رفت."),
            d("B", "I will. And thanks for listening to my housing saga.", "می‌گویم. و ممنون که داستان مسکنم را شنیدی."),
            d("A", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
            d("B", "See you soon.", "به‌زودی می‌بینمت."),
            d("A", "See you. Good luck with the house hunt!", "می‌بینمت. در شکار خانه موفق باشی!"),
            d("B", "Thanks. Bye!", "ممنون. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Why does B want to buy a house?", listOf("for investment", "because rent keeps rising", "for family", "for tax reasons"), 1),
            q("How much has B paid in rent over 10 years?", listOf("$50,000", "$80,000", "over $100,000", "$150,000"), 2),
            q("What is B's budget?", listOf("$300,000", "$400,000", "$500,000", "$600,000"), 1),
            q("What happened to B's friend who bought a house?", listOf("flood", "fire", "mold in walls", "roof leak"), 2),
            q("Where would A live if anywhere?", listOf("in the mountains", "by the ocean", "in a big city", "in a small town"), 1),
            q("If I ___ more money, I would buy a house.", listOf("have", "had", "will have", "have had"), 1),
            q("If I ___ you, I'd rent for now.", listOf("am", "was", "were", "be"), 2),
            q("I wish I ___ my own place.", listOf("own", "owned", "will own", "have owned"), 1),
            q("She wishes the rent ___ lower.", listOf("is", "was", "were", "be"), 2),
            q("If I worked remotely, the decision ___ easier.", listOf("will be", "would be", "is", "was"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Add up", "جمع شدن", "All the costs add up.", "همه هزینه‌ها جمع می‌شوند."),
            IdiomExpression("Throw money away", "پول دور ریختن", "Renting feels like throwing money away.", "اجاره دادن مثل دور ریختن پول است."),
            IdiomExpression("Money pit", "چاه پول", "Old houses can be money pits.", "خانه‌های قدیمی می‌توانند چاه پول باشند."),
            IdiomExpression("Where you stand", "کجای ایستادن", "You know where you stand.", "می‌دانی کجای ایستاده‌ای."),
            IdiomExpression("Never say never", "هرگز هرگز نگو", "Never say never.", "هرگز هرگز نگو."),
            IdiomExpression("Reality interferes with dreams", "واقعیت با رویاها تداخل دارد", "Reality always interferes with dreams.", "واقعیت همیشه با رویاها تداخل دارد.")
        ),
        phrasal = listOf(
            PhrasalVerb("look for", "دنبال گشتن", "search",
                "I've been looking for a few months.", "چند ماه است نگاه می‌کنم.", "No"),
            PhrasalVerb("put down", "پیش‌پرداخت دادن", "make a down payment",
                "I'm putting down 20%.", "بیست درصد پیش‌پرداخت می‌دهم.", "Yes"),
            PhrasalVerb("save up", "پس‌انداز کردن", "accumulate money",
                "I've been saving up for five years.", "پنج سال است پس‌انداز می‌کنم.", "No"),
            PhrasalVerb("get going", "راه افتادن", "start leaving",
                "I should get going.", "باید بروم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Unreal conditional stress", "Stress 'had' and 'would': If I HAD money, I WOULD buy a house."),
            PronunciationTip("Wish stress", "Stress 'wish' and past verb: I WISH I OWNED my place."),
            PronunciationTip("'Would' reduction", "In natural speech, 'would' often reduces to /d/: I'd buy, she'd live.")
        ),
        culture = listOf(
            CulturalNote("Renting vs. buying",
                "In many Western cultures, homeownership is seen as a milestone. In others, renting is preferred for flexibility. Cultural attitudes toward debt and property vary widely."),
            CulturalNote("Real estate markets",
                "Housing markets vary dramatically across countries. In some cities, prices are prohibitively high; in others, homeownership is more accessible. Government policies, interest rates, and demand all affect prices."),
            CulturalNote("Remote work's impact",
                "The rise of remote work has changed housing patterns. People are moving away from expensive cities to more affordable areas, transforming local economies and housing markets.")
        ),
        mistakes = listOf(
            CommonMistake("If I would have money, I would buy.", "If I had money, I would buy.", "Use past simple in the if-clause, not 'would have'."),
            CommonMistake("I wish I have a house.", "I wish I had a house.", "Use past simple after 'wish'."),
            CommonMistake("If I was you, I would rent.", "If I were you, I would rent.", "Use 'were' for hypothetical situations.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why is B considering buying a house?", "B has paid over $100,000 in rent over ten years and wants to build equity."),
            ComprehensionQuestion("What are the trade-offs between suburbs and downtown?", "Suburbs are cheaper but commute is longer; downtown is convenient but expensive."),
            ComprehensionQuestion("What does A value more than ownership?", "Flexibility and lack of responsibility.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss the pros and cons of renting vs. buying.",
                "مزایا و معایب اجاره در برابر خرید را بحث کن.",
                "If I had... / Renting means... / Buying means..."),
            SpeakingTask("Describe your ideal home and neighborhood.",
                "خانه و محله ایده‌آلت را توصیف کن.",
                "If I could live anywhere... / I wish... / I'd like..."),
            SpeakingTask("Role-play talking to a realtor about buying a house.",
                "نقش‌بازی صحبت با مشاور املاک درباره خرید خانه.",
                "My budget is... / I'm looking for... / What are the costs?")
        ),
        writing = listOf(
            WritingTask("Write an essay about the housing challenges in your city.",
                "مقاله‌ای درباره چالش‌های مسکن در شهرت بنویس.",
                280, "Use unreal conditionals and wish + past subjunctive.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 5 — Innovation | نوآوری
    // ═══════════════════════════════════════════════════════════
    private fun unit5() = base(
        5, "Innovation", "نوآوری",
        listOf(
            "Discuss inventions and inventors",
            "Explore the impact of innovation",
            "Talk about creative thinking",
            "Use passive voice in future forms",
            "Use contrary-to-fact conditionals"
        ),
        listOf(
            v("innovation", "نوآوری", "Innovation drives economic growth.", "نوآوری رشد اقتصادی را هدایت می‌کند."),
            v("invention", "اختراع", "The invention changed the world.", "اختراع جهان را تغییر داد."),
            v("patent", "امتیاز اختراع", "He filed a patent for his design.", "او برای طرحش امتیاز اختراع ثبت کرد."),
            v("breakthrough", "پیشرفت بزرگ", "The discovery was a real breakthrough.", "کشف واقعاً یک پیشرفت بزرگ بود."),
            v("cutting-edge", "پیشرو", "Their technology is cutting-edge.", "تکنولوژی‌شان پیشرو است.", "adjective"),
            v("prototype", "نمونه اولیه", "They built a working prototype.", "آن‌ها یک نمونه اولیه کاربردی ساختند."),
            v("disrupt", "مختل کردن", "The internet disrupted entire industries.", "اینترنت صنایع کامل را مختل کرد.", "verb"),
            v("obsolete", "منسوخ", "Landlines are becoming obsolete.", "تلفن‌های ثابت در حال منسوخ شدن هستند.", "adjective"),
            v("adapt", "انطباق پیدا کردن", "Businesses must adapt to survive.", "کسب‌وکارها برای بقا باید انطباق پیدا کنند.", "verb"),
            v("efficiency", "کارایی", "The system improved efficiency by 40%.", "سیستم کارایی را ۴۰٪ بهبود بخشید."),
            v("entrepreneur", "کارآفرین", "The entrepreneur founded three startups.", "کارآفرین سه استارتاپ تأسیس کرد."),
            v("startup", "استارتاپ", "The startup grew rapidly.", "استارتاپ سریع رشد کرد."),
            v("funding", "تأمین مالی", "They secured funding from investors.", "از سرمایه‌گذاران تأمین مالی گرفتند."),
            v("scalable", "قابل توسعه", "The business model is scalable.", "مدل کسب‌وکار قابل توسعه است.", "adjective"),
            v("implement", "اجرا کردن", "They implemented the new system.", "سیستم جدید را اجرا کردند.", "verb"),
            v("user-friendly", "کاربرپسند", "The app is very user-friendly.", "اپ خیلی کاربرپسند است.", "adjective"),
            v("revolutionize", "متحول کردن", "Smartphones revolutionized communication.", "گوشی‌های هوشمند ارتباطات را متحول کردند.", "verb"),
            v("futuristic", "آینده‌نگرانه", "The design looks futuristic.", "طراحی آینده‌نگرانه به نظر می‌رسد.", "adjective"),
            v("sustainable", "پایدار", "They develop sustainable technologies.", "آن‌ها تکنولوژی‌های پایدار توسعه می‌دهند.", "adjective"),
            v("accessibility", "دسترسی‌پذیری", "Accessibility is important in design.", "دسترسی‌پذیری در طراحی مهم است.")
        ),
        listOf(
            GrammarSection(
                "Passive voice in future forms",
                "Future passive: will be + past participle, is going to be + past participle. The product will be launched next year. New laws are going to be introduced. The site will be redesigned."
            ),
            GrammarSection(
                "Contrary-to-fact conditionals (third conditional)",
                "Use it for hypothetical past situations. If they had invested earlier, they would have succeeded. If she hadn't invented it, someone else would have. If we had known, we would have acted differently."
            ),
            GrammarSection(
                "Mixed conditionals",
                "Combine past condition with present result, or vice versa. If I had studied engineering, I would be working in tech now. If I were more creative, I would have started a company."
            )
        ),
        listOf(
            d("A", "Have you seen the new AI assistant that just launched?", "دستیار هوش مصنوعی جدیدی که تازه عرضه شد را دیده‌ای؟"),
            d("B", "Yeah, I've been testing it. It's impressive.", "بله، در حال آزمایشش بوده‌ام. تحسین‌برانگیز است."),
            d("A", "What can it do?", "چه کارهایی می‌تواند بکند؟"),
            d("B", "Basically everything. Writing, coding, planning trips, analyzing data.", "اساساً همه چیز. نوشتن، کدنویسی، برنامه‌ریزی سفر، تحلیل داده."),
            d("A", "That's amazing. And a little scary.", "شگفت‌انگیز است. و کمی ترسناک."),
            d("B", "Why scary?", "چرا ترسناک؟"),
            d("A", "Because it might replace jobs. If AI keeps improving, many roles will be automated.", "چون ممکن است جایگزین شغل‌ها شود. اگر هوش مصنوعی به بهبود ادامه دهد، بسیاری از نقش‌ها خودکار خواهند شد."),
            d("B", "That's already happening in some industries.", "این در برخی صنایع در حال اتفاق افتادن است."),
            d("A", "Which ones?", "کدام‌ها؟"),
            d("B", "Customer service, data entry, basic translation. Those jobs are being reduced.", "خدمات مشتری، ورود داده، ترجمه پایه. آن شغل‌ها در حال کاهش هستند."),
            d("A", "But new jobs are also being created, right?", "ولی شغل‌های جدید هم در حال ایجاد هستند، درست است؟"),
            d("B", "Yes. But not at the same speed. And the new jobs require more skills.", "بله. ولی با همان سرعت نه. و شغل‌های جدید مهارت‌های بیشتری می‌خواهند."),
            d("A", "So it's a race between automation and education.", "پس یک مسابقه بین خودکارسازی و آموزش است."),
            d("B", "Exactly. If governments had invested in retraining sooner, the transition would be smoother.", "دقیقاً. اگر دولت‌ها زودتر روی بازآموزی سرمایه‌گذاری کرده بودند، گذار نرم‌تر بود."),
            d("A", "Do you think they'll catch up?", "فکر می‌کنی جا می‌مانند؟"),
            d("B", "I hope so. Otherwise, we'll have a lot of displaced workers.", "امیدوارم. وگرنه کارگران آواره زیادی خواهیم داشت."),
            d("A", "What about innovation itself? Is it always good?", "خود نوآوری چطور؟ همیشه خوب است؟"),
            d("B", "Not always. Innovation without ethics can be dangerous.", "نه همیشه. نوآوری بدون اخلاق می‌تواند خطرناک باشد."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Facial recognition, surveillance tech, autonomous weapons.", "تشخیص چهره، تکنولوژی نظارتی، سلاح‌های خودکار."),
            d("A", "Those are real concerns.", "این‌ها نگرانی‌های واقعی هستند."),
            d("B", "They are. But they can also be regulated.", "هستند. ولی همچنین می‌توانند تنظیم شوند."),
            d("A", "Should tech companies have more responsibility?", "آیا شرکت‌های فناوری باید مسئولیت بیشتری داشته باشند؟"),
            d("B", "Definitely. They should be held accountable for how their products are used.", "قطعاً. باید برای نحوه استفاده از محصولاتشان پاسخگو باشند."),
            d("A", "Do you trust them to self-regulate?", "به خودتنظیمی‌شان اعتماد داری؟"),
            d("B", "Not really. Profit usually comes first.", "نه واقعاً. سود معمولاً اولویت دارد."),
            d("A", "So we need laws?", "پس به قوانین نیاز داریم؟"),
            d("B", "Yes. And international cooperation. Technology doesn't respect borders.", "بله. و همکاری بین‌المللی. تکنولوژی به مرزها احترام نمی‌گذارد."),
            d("A", "That's a big challenge. Countries rarely agree on anything.", "چالش بزرگی است. کشورها به‌ندرت روی چیزی توافق می‌کنند."),
            d("B", "True. But they've done it before — for nuclear weapons, for example.", "درست. ولی قبلاً انجام داده‌اند — برای سلاح‌های هسته‌ای، مثلاً."),
            d("A", "That's a good point. There's precedent.", "نکته خوبی است. سابقه دارد."),
            d("B", "Exactly. If nations had worked together sooner on AI, we might have clearer frameworks now.", "دقیقاً. اگر کشورها زودتر روی هوش مصنوعی با هم کار کرده بودند، الان چارچوب‌های واضح‌تری داشتیم."),
            d("A", "What excites you most about innovation?", "چه چیزی درباره نوآوری بیشتر هیجان‌زده‌ات می‌کند؟"),
            d("B", "Medical breakthroughs. They're saving lives we couldn't save before.", "پیشرفت‌های پزشکی. جان‌هایی را نجات می‌دهند که قبلاً نمی‌توانستیم."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Gene therapy, personalized medicine, AI-assisted diagnosis.", "ژن‌درمانی، پزشکی شخصی‌سازی‌شده، تشخیص با کمک هوش مصنوعی."),
            d("A", "That's incredible. My grandmother was diagnosed with cancer early thanks to AI.", "باورنکردنی است. مادربزرگم به لطف هوش مصنوعی سرطانش زود تشخیص داده شد."),
            d("B", "Really? That's amazing.", "واقعاً؟ شگفت‌انگیز است."),
            d("A", "She's in remission now. If it hadn't been caught early, she might not be here.", "الان در دوره بهبودی است. اگر زود گرفته نمی‌شد، ممکن بود اینجا نباشد."),
            d("B", "That's a powerful story. It shows the human side of innovation.", "داستان قدرتمندی است. جنبه انسانی نوآوری را نشان می‌دهد."),
            d("A", "Yeah. It's easy to focus on the scary parts. But there's so much good too.", "بله. تمرکز روی بخش‌های ترسناک آسان است. ولی خوبی‌های زیادی هم هست."),
            d("B", "Balance is key. We need to embrace innovation while managing risks.", "تعادل کلیدی است. باید نوآوری را بپذیریم و همزمان ریسک‌ها را مدیریت کنیم."),
            d("A", "What innovation are you most excited about?", "درباره کدام نوآوری بیشتر هیجان‌زده‌ای؟"),
            d("B", "Probably clean energy. If we can scale it, we might avoid climate catastrophe.", "احتمالاً انرژی پاک. اگر بتوانیم مقیاسش دهیم، ممکن است از فاجعه اقلیمی پرهیز کنیم."),
            d("A", "Solar and wind are getting cheaper.", "خورشیدی و بادی ارزان‌تر می‌شوند."),
            d("B", "Yes. If we had invested in them twenty years ago, we'd be much further along.", "بله. اگر بیست سال پیش سرمایه‌گذاری کرده بودیم، خیلی جلوتر بودیم."),
            d("A", "Better late than never.", "دیر رسیدن بهتر از هرگز نرسیدن است."),
            d("B", "True. And the pace is accelerating.", "درست. و سرعت شتاب می‌گیرد."),
            d("A", "What about space exploration? Is that a good use of resources?", "کاوش فضایی چطور؟ استفاده خوبی از منابع است؟"),
            d("B", "It's debatable. But many innovations come from space research.", "قابل بحث است. ولی نوآوری‌های زیادی از تحقیقات فضایی می‌آیند."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "GPS, satellite communication, memory foam, water filters.", "GPS، ارتباط ماهواره‌ای، فوم حافظه‌دار، فیلترهای آب."),
            d("A", "I didn't know that. So the money spent has trickle-down benefits.", "این را نمی‌دانستم. پس پول خرج‌شده مزایای جانبی دارد."),
            d("B", "Exactly. It's not just about going to Mars.", "دقیقاً. فقط درباره رفتن به مریخ نیست."),
            d("A", "What would you invent if you could?", "اگر می‌توانستی چه اختراع می‌کردی؟"),
            d("B", "Hmm. If I had the skills, I'd invent an affordable water purifier for developing countries.", "هوم. اگر مهارت داشتم، یک تصفیه‌کننده آب مقرون‌به‌صرفه برای کشورهای در حال توسعه اختراع می‌کردم."),
            d("A", "That's a noble goal.", "هدف نجیبی است."),
            d("B", "Millions of people lack clean water. It's a solvable problem.", "میلیون‌ها نفر آب پاک ندارند. مشکلی قابل حل است."),
            d("A", "What's stopping us?", "چه چیزی ما را متوقف می‌کند؟"),
            d("B", "Funding and distribution. The technology exists; the systems don't.", "تأمین مالی و توزیع. تکنولوژی وجود دارد؛ سیستم‌ها ندارند."),
            d("A", "So it's not an innovation problem, it's a political one.", "پس مشکل نوآوری نیست، سیاسی است."),
            d("B", "Exactly. Sometimes the hardest part isn't inventing — it's implementing.", "دقیقاً. گاهی سخت‌ترین بخش اختراع کردن نیست — اجرا کردن است."),
            d("A", "That's a profound insight.", "بینش عمیقی است."),
            d("B", "It's what I've learned after years in this field.", "این چیزی است که بعد از سال‌ها در این حوزه یاد گرفته‌ام."),
            d("A", "What's your prediction for the next ten years?", "پیش‌بینی‌ات برای ده سال آینده چیست؟"),
            d("B", "AI will be integrated into everything. But I hope it'll be done ethically.", "هوش مصنوعی در همه چیز ادغام خواهد شد. ولی امیدوارم اخلاقی انجام شود."),
            d("A", "What can individuals do?", "افراد چه می‌توانند بکنند؟"),
            d("B", "Stay informed, demand accountability, and use technology thoughtfully.", "مطلع بمانند، پاسخگویی بخواهند، و تکنولوژی را متفکرانه استفاده کنند."),
            d("A", "That's good advice.", "توصیه خوبی است."),
            d("B", "Well, I should go. But this was a great discussion.", "خب، باید بروم. ولی بحث عالی‌ای بود."),
            d("A", "It was. Let's continue it another time.", "بود. بیایید یک وقت دیگر ادامه‌اش دهیم."),
            d("B", "Deal. Talk soon.", "قبول. به‌زودی صحبت."),
            d("A", "Talk soon. Bye!", "به‌زودی صحبت. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What can the new AI assistant do?", listOf("only write", "only code", "writing, coding, planning trips", "nothing useful"), 2),
            q("What did A's grandmother benefit from?", listOf("gene therapy", "AI-assisted early cancer diagnosis", "new medication", "robotic surgery"), 1),
            q("What is B most excited about?", listOf("space exploration", "clean energy", "AI assistants", "self-driving cars"), 1),
            q("What would B invent if possible?", listOf("a new phone", "affordable water purifier", "a flying car", "an AI robot"), 1),
            q("What does B say is the hardest part of innovation?", listOf("inventing", "implementing", "funding", "marketing"), 1),
            q("The product ___ launched next year.", listOf("will be", "will", "is", "was"), 0),
            q("New laws are going to ___ introduced.", listOf("be", "being", "been", "to be"), 0),
            q("If they had invested earlier, they ___ succeeded.", listOf("would have", "would", "will have", "had"), 0),
            q("If she hadn't invented it, someone else ___.", listOf("would", "would have", "will have", "had"), 1),
            q("If I had studied engineering, I ___ working in tech now.", listOf("would be", "would have been", "will be", "had been"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Cutting-edge", "پیشرو", "Their technology is cutting-edge.", "تکنولوژی‌شان پیشرو است."),
            IdiomExpression("Better late than never", "دیر رسیدن بهتر از هرگز نرسیدن است", "Better late than never.", "دیر رسیدن بهتر از هرگز نرسیدن است."),
            IdiomExpression("Trickle-down", "سرریز", "The money has trickle-down benefits.", "پول مزایای جانبی دارد."),
            IdiomExpression("Game changer", "بازی-changer", "AI is a game changer.", "هوش مصنوعی یک بازی-changer است."),
            IdiomExpression("Self-regulate", "خودتنظیمی", "They can't self-regulate.", "نمی‌توانند خودتنظیمی کنند."),
            IdiomExpression("Displace workers", "کارگران را آواره کردن", "Automation may displace workers.", "خودکارسازی ممکن است کارگران را آواره کند.")
        ),
        phrasal = listOf(
            PhrasalVerb("roll out", "عرضه کردن", "launch",
                "The update will be rolled out soon.", "به‌روزرسانی به‌زودی عرضه می‌شود.", "Yes"),
            PhrasalVerb("catch up", "جا رسیدن", "reach the same level",
                "Governments are trying to catch up.", "دولت‌ها در حال تلاش برای جا رسیدن هستند.", "No"),
            PhrasalVerb("come up with", "به ذهن رسیدن", "invent / devise",
                "They came up with a clever solution.", "راه‌حل هوشمندانه‌ای ارائه دادند.", "No"),
            PhrasalVerb("hold accountable", "پاسخگو نگه داشتن", "make responsible",
                "They should be held accountable.", "باید پاسخگو نگه داشته شوند.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Future passive stress", "Stress the past participle: The product will be LAUNCHED."),
            PronunciationTip("Third conditional rhythm", "Stress 'had' and 'would have': If they HAD invested, they WOULD HAVE succeeded."),
            PronunciationTip("Tech vocabulary stress", "Stress first syllable: INnovation, PROtotype, ENTREpreneur.")
        ),
        culture = listOf(
            CulturalNote("Innovation ecosystems",
                "Silicon Valley, Shenzhen, and Tel Aviv are famous innovation hubs. They share traits: risk tolerance, access to capital, talent concentration, and cultural support for failure."),
            CulturalNote("AI ethics globally",
                "Different countries approach AI ethics differently. The EU has stricter regulations (AI Act), while the US takes a more market-driven approach. China focuses on state-aligned innovation."),
            CulturalNote("The pace of change",
                "The rate of technological change has accelerated dramatically. What took decades in the past now happens in years. Adapting to this pace is a defining challenge of our era.")
        ),
        mistakes = listOf(
            CommonMistake("If they would have invested, they would have succeeded.", "If they had invested, they would have succeeded.", "Use past perfect in the if-clause."),
            CommonMistake("The product will launch next year (passive).", "The product will be launched next year.", "Use future passive for products being launched by someone."),
            CommonMistake("If I studied engineering, I would work in tech.", "If I had studied engineering, I would be working in tech.", "Use past perfect for past hypothetical, then present conditional for current result.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How is AI changing the job market?", "AI is automating jobs like customer service, data entry, and basic translation, while also creating new jobs that require more skills."),
            ComprehensionQuestion("What positive impact has innovation had on A's family?", "AI-assisted diagnosis helped detect A's grandmother's cancer early."),
            ComprehensionQuestion("Why is B excited about clean energy?", "If scaled, it could help avoid climate catastrophe.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss the impact of AI on jobs and society.",
                "درباره تأثیر هوش مصنوعی بر شغل‌ها و جامعه صحبت کن.",
                "If... / It will be... / The impact has been..."),
            SpeakingTask("Talk about an invention that changed your life.",
                "درباره اختراعی که زندگی‌ات را تغییر داد صحبت کن.",
                "It was invented by... / It has changed... / Without it, I would..."),
            SpeakingTask("Debate whether innovation is always beneficial.",
                "بحث کنید که آیا نوآوری همیشه مفید است.",
                "On one hand... / On the other... / If we hadn't...")
        ),
        writing = listOf(
            WritingTask("Write an essay about the future impact of artificial intelligence.",
                "مقاله‌ای درباره تأثیر آینده هوش مصنوعی بنویس.",
                280, "Use future passive and contrary-to-fact conditionals.")
        )
    )    // ═══════════════════════════════════════════════════════════
    // UNIT 6 — Protecting Our World | حفاظت از دنیای ما
    // ═══════════════════════════════════════════════════════════
    private fun unit6() = base(
        6, "Protecting Our World", "حفاظت از دنیای ما",
        listOf(
            "Discuss environmental issues",
            "Explore solutions to climate change",
            "Talk about conservation efforts",
            "Use paired conjunctions",
            "Use the passive causative"
        ),
        listOf(
            v("climate change", "تغییرات اقلیمی", "Climate change affects everyone.", "تغییرات اقلیمی بر همه تأثیر می‌گذارد."),
            v("sustainability", "پایداری", "Sustainability is a business priority.", "پایداری اولویت تجاری است."),
            v("carbon footprint", "رد پای کربن", "Reduce your carbon footprint.", "رد پای کربن خود را کاهش دهید."),
            v("renewable", "تجدیدپذیر", "Wind and solar are renewable.", "باد و خورشیدی تجدیدپذیر هستند.", "adjective"),
            v("emission", "انتشار", "CO2 emissions must be reduced.", "انتشار CO2 باید کاهش یابد."),
            v("deforestation", "جنگل‌زدایی", "Deforestation destroys habitats.", "جنگل‌زدایی زیستگاه‌ها را نابود می‌کند."),
            v("biodiversity", "تنوع زیستی", "Biodiversity is essential for ecosystems.", "تنوع زیستی برای اکوسیستم‌ها ضروری است."),
            v("recycle", "بازیافت کردن", "We recycle paper, glass, and plastic.", "کاغذ، شیشه، و پلاستیک بازیافت می‌کنیم.", "verb"),
            v("conservation", "حفاظت", "Wildlife conservation is crucial.", "حفاظت از حیات وحش حیاتی است."),
            v("endangered", "در خطر انقراض", "Many species are endangered.", "بسیاری از گونه‌ها در خطر انقراض هستند.", "adjective"),
            v("policy", "سیاست", "Environmental policies must be enforced.", "سیاست‌های زیست‌محیطی باید اجرا شوند."),
            v("regulation", "مقررات", "Regulations limit pollution.", "مقررات آلودگی را محدود می‌کنند."),
            v("awareness", "آگاهی", "Public awareness is growing.", "آگاهی عمومی در حال رشد است."),
            v("initiative", "ابتکار", "The green initiative was successful.", "ابتکار سبز موفق بود."),
            v("offset", "جبران کردن", "They offset their emissions by planting trees.", "انتشارشان را با کاشت درخت جبران کردند.", "verb"),
            v("habitat", "زیستگاه", "We must protect natural habitats.", "باید زیستگاه‌های طبیعی را محافظت کنیم."),
            v("ecosystem", "اکوسیستم", "A healthy ecosystem supports life.", "اکوسیستم سالم از زندگی حمایت می‌کند."),
            v("pollution", "آلودگی", "Air pollution is a health hazard.", "آلودگی هوا خطر سلامت است."),
            v("eco-friendly", "سازگار با محیط زیست", "We use eco-friendly products.", "ما محصولات سازگار با محیط زیست استفاده می‌کنیم.", "adjective"),
            v("global warming", "گرمایش جهانی", "Global warming is accelerating.", "گرمایش جهانی در حال شتاب گرفتن است.")
        ),
        listOf(
            GrammarSection(
                "Paired conjunctions",
                "Use both...and, either...or, neither...nor, not only...but also. Both individuals and governments must act. We can either reduce consumption or face consequences. Neither denial nor delay will help."
            ),
            GrammarSection(
                "The passive causative",
                "Use 'have/get + object + past participle' for services performed. We had our solar panels installed. They got their house insulated. She had her old car recycled."
            ),
            GrammarSection(
                "Conversation strategies for environmental discussions",
                "Use 'If you ask me' to state an opinion. Use 'On the other hand' to present alternatives. Use 'It's a matter of' to emphasize a priority. Use 'I couldn't agree more' to strongly agree."
            )
        ),
        listOf(
            d("A", "Have you seen the news about the record temperatures this summer?", "خبرهای دماهای رکوردی این تابستان را دیده‌ای؟"),
            d("B", "Yes. It's alarming. Every year seems to get hotter.", "بله. هشداردهنده است. هر سال به نظر می‌رسد گرم‌تر می‌شود."),
            d("A", "If you ask me, we're past the point of prevention.", "اگر از من بپرسی، از نقطه پیشگیری گذشته‌ایم."),
            d("B", "I wouldn't go that far. But the window is closing fast.", "تا آنجا نمی‌روم. ولی پنجره سریع بسته می‌شود."),
            d("A", "What do you think the biggest issue is?", "فکر می‌کنی بزرگ‌ترین مسئله چیست؟"),
            d("B", "Probably emissions from fossil fuels. Everything else follows from that.", "احتمالاً انتشار سوخت‌های فسیلی. بقیه چیزها از آن ناشی می‌شوند."),
            d("A", "But individual action feels so small.", "ولی اقدام فردی اینقدر کوچک حس می‌شود."),
            d("B", "On the other hand, collective individual action is powerful.", "از طرف دیگر، اقدام فردی جمعی قدرتمند است."),
            d("A", "True. But it's a matter of system change, isn't it?", "درست. ولی مسئله تغییر سیستم است، نه؟"),
            d("B", "Both. Systems change when individuals demand it.", "هر دو. سیستم‌ها وقتی تغییر می‌کنند که افراد بخواهند."),
            d("A", "What can individuals actually do?", "افراد واقعاً چه می‌توانند بکنند؟"),
            d("B", "Reduce meat consumption, fly less, use public transit, vote for green policies.", "کاهش مصرف گوشت، کمتر پرواز کردن، استفاده از حمل‌ونقل عمومی، رأی دادن به سیاست‌های سبز."),
            d("A", "That sounds like a lot of sacrifice.", "مثل فداکاری زیادی به نظر می‌رسد."),
            d("B", "Some is. But a lot of it improves quality of life too.", "بخشی هست. ولی خیلی‌اش کیفیت زندگی را هم بهبود می‌دهد."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Cycling instead of driving is healthier. Plant-based meals can be delicious.", "دوچرخه‌سواری به جای رانندگی سالم‌تر است. غذاهای گیاهی می‌توانند لذیذ باشند."),
            d("A", "You're right. It's about reframing.", "حق داری. درباره بازتعریف است."),
            d("B", "Exactly. If we see it as improvement rather than sacrifice, it's easier.", "دقیقاً. اگر آن را به عنوان بهبود ببینیم نه فداکاری، آسان‌تر است."),
            d("A", "What about businesses?", "کسب‌وکارها چطور؟"),
            d("B", "They have a huge role. Not only in reducing emissions but also in innovating solutions.", "نقش عظیمی دارند. نه تنها در کاهش انتشار بلکه در نوآوری راه‌حل‌ها."),
            d("A", "Should they be forced to?", "آیا باید مجبور شوند؟"),
            d("B", "I think so. Regulations can drive change faster than voluntary action.", "فکر می‌کنم بله. مقررات می‌توانند تغییر را سریع‌تر از اقدام داوطلبانه هدایت کنند."),
            d("A", "What regulations would help most?", "چه مقرراتی بیشتر کمک می‌کنند؟"),
            d("B", "Carbon taxes, emissions caps, subsidies for renewable energy.", "مالیات کربن، سقف انتشار، یارانه برای انرژی تجدیدپذیر."),
            d("A", "Don't carbon taxes hurt poor people?", "آیا مالیات کربن به فقرا آسیب نمی‌زند؟"),
            d("B", "They can if implemented poorly. But with rebates, they can be fair.", "اگر ضعیف اجرا شوند می‌توانند. ولی با تخفیف‌ها می‌توانند منصفانه باشند."),
            d("A", "So the policy design matters.", "پس طراحی سیاست مهم است."),
            d("B", "Absolutely. The details determine whether it works.", "قطعاً. جزئیات تعیین می‌کنند آیا کار می‌کند."),
            d("A", "What about developing countries?", "کشورهای در حال توسعه چطور؟"),
            d("B", "They need support. Rich countries caused most of the problem.", "به حمایت نیاز دارند. کشورهای ثروتمند بیشتر مشکل را ایجاد کردند."),
            d("A", "Do you think they'll get that support?", "فکر می‌کنی آن حمایت را دریافت می‌کنند؟"),
            d("B", "Some have. But not enough. Promises have been broken.", "برخی دریافت کرده‌اند. ولی کافی نه. وعده‌ها شکسته شده‌اند."),
            d("A", "It's frustrating.", "آزاردهنده است."),
            d("B", "It is. But cynicism doesn't help either. We need to keep pushing.", "هست. ولی بدبینی هم کمک نمی‌کند. باید به فشار ادامه دهیم."),
            d("A", "What gives you hope?", "چه چیزی به تو امید می‌دهد؟"),
            d("B", "Renewable energy costs have plummeted. Solar is now the cheapest power source in many places.", "هزینه انرژی تجدیدپذیر به شدت افتاده. خورشیدی اکنون ارزان‌ترین منبع نیرو در بسیاری جاهاست."),
            d("A", "That's encouraging.", "دلگرم‌کننده است."),
            d("B", "And electric vehicles are becoming mainstream.", "و خودروهای الکتریکی در حال جریان اصلی شدن هستند."),
            d("A", "Do you own one?", "خودت داری؟"),
            d("B", "Not yet. But I've had solar panels installed on my house.", "هنوز نه. ولی پنل‌های خورشیدی روی خانه‌ام نصب کرده‌ام."),
            d("A", "Nice. Do they cover all your energy?", "عالی. همه انرژی‌ات را پوشش می‌دهند؟"),
            d("B", "About 80%. And I get paid for surplus energy.", "حدود ۸۰٪. و برای انرژی مازاد پول می‌گیرم."),
            d("A", "That's a great investment.", "سرمایه‌گذاری عالی‌ای است."),
            d("B", "It is. I've also had my house insulated to reduce heating costs.", "هست. همچنین خانه‌ام را عایق‌کاری کرده‌ام تا هزینه گرمایش را کم کنم."),
            d("A", "You're really committed.", "واقعاً متعهدی."),
            d("B", "I try. It's both environmental and financial sense.", "تلاش می‌کنم. هم زیست‌محیطی است و هم مالی."),
            d("A", "What about diet?", "رژیم غذایی چطور؟"),
            d("B", "I've cut down on meat. Not vegetarian, but less than before.", "مصرف گوشت را کم کرده‌ام. گیاه‌خوار نیستم، ولی کمتر از قبل."),
            d("A", "Is it hard?", "سخت است؟"),
            d("B", "Not really. There are so many good alternatives now.", "نه واقعاً. الان جایگزین‌های خوب زیادی هست."),
            d("A", "What about flying?", "پرواز چطور؟"),
            d("B", "I fly much less. Only when necessary.", "خیلی کمتر پرواز می‌کنم. فقط وقتی ضروری است."),
            d("A", "But you love traveling.", "ولی عاشق سفر هستی."),
            d("B", "I do. So I take trains instead. Slower but more enjoyable.", "هستم. پس با قطار می‌روم. کندتر ولی لذت‌بخش‌تر."),
            d("A", "That's a good compromise.", "معامله خوبی است."),
            d("B", "It is. Neither guilt nor denial helps. Just honest choices.", "هست. نه احساس گناه کمک می‌کند نه انکار. فقط انتخاب‌های صادقانه."),
            d("A", "Wise words.", "کلمات عاقلانه."),
            d("B", "What about you? Any changes?", "تو چطور؟ تغییری؟"),
            d("A", "I've started composting. And I've been buying less fast fashion.", "کمپوست را شروع کرده‌ام. و کمتر مد سریع می‌خرم."),
            d("B", "Fast fashion is a huge problem.", "مد سریع مشکل بزرگی است."),
            d("A", "Huge. Both environmental and human rights issues.", "بزرگ. هم مشکلات زیست‌محیطی و هم حقوق بشری."),
            d("B", "Do you buy secondhand?", "دست دوم می‌خری؟"),
            d("A", "Sometimes. I've had my favorite jacket repaired twice instead of replacing it.", "گاهی. کاپشن مورد علاقه‌ام را دو بار تعمیر کرده‌ام به جای جایگزینی."),
            d("B", "That's the spirit. Repair, don't replace.", "همینه. تعمیر کن، جایگزین نکن."),
            d("A", "It's also cheaper!", "همچنین ارزان‌تر است!"),
            d("B", "Ha! Yes. Environmental choices often save money.", "ها! بله. انتخاب‌های زیست‌محیطی اغلب پول ذخیره می‌کنند."),
            d("A", "What's your biggest environmental concern?", "بزرگ‌ترین نگرانی زیست‌محیطی‌ات چیست؟"),
            d("B", "Biodiversity loss. Once species are gone, they're gone forever.", "از دست دادن تنوع زیستی. یک بار که گونه‌ها بروند، برای همیشه رفته‌اند."),
            d("A", "That's terrifying.", "وحشتناک است."),
            d("B", "It is. But there are success stories too. Species that were brought back from the brink.", "هست. ولی داستان‌های موفق هم هستند. گونه‌هایی که از لبه پرتگاه برگشتند."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Bald eagles, wolves in Yellowstone, mountain gorillas.", "عقاب‌های سرسفید، گرگ‌ها در یلواستون، گوریل‌های کوهی."),
            d("A", "That gives me hope.", "این به من امید می‌دهد."),
            d("B", "Me too. Nature is resilient when we give it a chance.", "من هم. طبیعت وقتی فرصت بدهیم تاب‌آور است."),
            d("A", "What can we do to help?", "چه می‌توانیم بکنیم تا کمک کنیم؟"),
            d("B", "Support conservation organizations. Protect local habitats. Plant native species.", "از سازمان‌های حفاظتی حمایت کنید. زیستگاه‌های محلی را محافظت کنید. گونه‌های بومی بکارید."),
            d("A", "Those are doable.", "این‌ها شدنی هستند."),
            d("B", "Very. And they make a difference.", "خیلی. و تفاوت ایجاد می‌کنند."),
            d("A", "I'll look into local conservation groups.", "گروه‌های حفاظتی محلی را بررسی می‌کنم."),
            d("B", "Great. Let me know if you find one. I might join too.", "عالی. اگر پیدا کردی بگو. ممکن است من هم بپیوندم."),
            d("A", "Deal. Well, I should go. But this was important.", "قبول. خب، باید بروم. ولی این مهم بود."),
            d("B", "It was. These conversations matter.", "بود. این گفت‌وگوها مهم هستند."),
            d("A", "Take care.", "مراقب باش."),
            d("B", "You too. See you soon.", "تو هم. به‌زودی می‌بینمت."),
            d("A", "Bye!", "خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What does A think about prevention?", listOf("there's still time", "we're past the point of prevention", "it's not needed", "it's too expensive"), 1),
            q("What does B say is the biggest issue?", listOf("deforestation", "emissions from fossil fuels", "plastic waste", "overpopulation"), 1),
            q("What has B installed at home?", listOf("wind turbine", "solar panels", "geothermal system", "rainwater tank"), 1),
            q("What does B say about fast fashion?", listOf("it's fine", "it's a huge problem", "it's necessary", "it's improving"), 1),
            q("What is B's biggest environmental concern?", listOf("pollution", "biodiversity loss", "climate change", "water scarcity"), 1),
            q("___ individuals ___ governments must act.", listOf("Both / and", "Either / or", "Neither / nor", "Not only / but also"), 0),
            q("We can ___ reduce consumption ___ face consequences.", listOf("both / and", "either / or", "neither / nor", "not only / but also"), 1),
            q("___ denial ___ delay will help.", listOf("Both / and", "Either / or", "Neither / nor", "Not only / but also"), 2),
            q("We had solar panels ___.", listOf("install", "installed", "installing", "to install"), 1),
            q("She got her car ___.", listOf("recycle", "recycled", "recycling", "to recycle"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Past the point of", "از نقطه ... گذشته", "We're past the point of prevention.", "از نقطه پیشگیری گذشته‌ایم."),
            IdiomExpression("Window is closing", "پنجره بسته می‌شود", "The window is closing fast.", "پنجره سریع بسته می‌شود."),
            IdiomExpression("On the other hand", "از طرف دیگر", "On the other hand, collective action is powerful.", "از طرف دیگر، اقدام جمعی قدرتمند است."),
            IdiomExpression("It's a matter of", "مسئله ... است", "It's a matter of system change.", "مسئله تغییر سیستم است."),
            IdiomExpression("Give it a chance", "فرصت دادن", "Nature is resilient when we give it a chance.", "طبیعت وقتی فرصت بدهیم تاب‌آور است."),
            IdiomExpression("From the brink", "از لبه پرتگاه", "Species brought back from the brink.", "گونه‌هایی که از لبه پرتگاه برگشتند.")
        ),
        phrasal = listOf(
            PhrasalVerb("cut down on", "کم کردن", "reduce",
                "I've cut down on meat.", "مصرف گوشت را کم کرده‌ام.", "No"),
            PhrasalVerb("look into", "بررسی کردن", "investigate",
                "I'll look into local groups.", "گروه‌های محلی را بررسی می‌کنم.", "No"),
            PhrasalVerb("come up with", "به ذهن رسیدن", "devise",
                "They came up with solutions.", "راه‌حل‌ها را ارائه دادند.", "No"),
            PhrasalVerb("push for", "فشار آوردن برای", "advocate strongly",
                "We need to push for change.", "باید برای تغییر فشار بیاوریم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Paired conjunction rhythm", "Stress both parts: BOTH individuals AND governments."),
            PronunciationTip("Passive causative stress", "Stress the past participle: I had solar panels INstalled."),
            PronunciationTip("Environmental terms stress", "Stress first syllable: SUSustainability, BIOdiversity, CONservation.")
        ),
        culture = listOf(
            CulturalNote("Climate action globally",
                "Climate action varies widely. The EU leads with strict regulations. Some countries prioritize economic growth over environmental protection. Public opinion is shifting globally toward greater concern."),
            CulturalNote("Individual vs. collective responsibility",
                "Debate continues about whether individual actions or systemic change matters more. Most experts agree both are necessary, but systemic change has larger impact."),
            CulturalNote("Conservation success stories",
                "Species like bald eagles, gray wolves, and mountain gorillas have recovered thanks to coordinated conservation efforts. These successes show that action can work.")
        ),
        mistakes = listOf(
            CommonMistake("Both individuals and governments must to act.", "Both individuals and governments must act.", "After 'must', use base verb without 'to'."),
            CommonMistake("We had solar panels install.", "We had solar panels installed.", "Use past participle in passive causative."),
            CommonMistake("Neither denial or delay helps.", "Neither denial nor delay helps.", "Use 'nor' with 'neither', not 'or'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What changes has B made in their lifestyle?", "Installed solar panels, insulated the house, cut down on meat, flies less, takes trains instead."),
            ComprehensionQuestion("Why does B believe individual actions matter?", "Collective individual action is powerful; systems change when individuals demand it."),
            ComprehensionQuestion("What gives B hope about the environment?", "Renewable energy costs have dropped, electric vehicles are mainstream, and species have been brought back from the brink.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss the biggest environmental challenges facing the world.",
                "درباره بزرگ‌ترین چالش‌های زیست‌محیطی جهان صحبت کن.",
                "Both...and... / The main issue is... / We must..."),
            SpeakingTask("Talk about changes you've made to be more eco-friendly.",
                "درباره تغییراتی که برای سازگاری با محیط زیست انجام داده‌ای صحبت کن.",
                "I've cut down on... / I've had...installed / I've started..."),
            SpeakingTask("Debate whether individual action or system change is more important.",
                "بحث کنید که اقدام فردی مهم‌تر است یا تغییر سیستم.",
                "On one hand... / On the other... / Both are needed because...")
        ),
        writing = listOf(
            WritingTask("Write a persuasive essay about an environmental issue.",
                "مقاله‌ای ترغیبی درباره یک مسئله زیست‌محیطی بنویس.",
                280, "Use paired conjunctions and the passive causative.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 7 — In the Public Eye | در چشم عموم
    // ═══════════════════════════════════════════════════════════
    private fun unit7() = base(
        7, "In the Public Eye", "در چشم عموم",
        listOf(
            "Discuss fame and celebrity culture",
            "Explore the pros and cons of being famous",
            "Talk about privacy and the media",
            "Use embedded questions",
            "Use indirect speech in formal contexts"
        ),
        listOf(
            v("fame", "شهرت", "Fame comes with a price.", "شهرت بهایی دارد."),
            v("celebrity", "سلبریتی", "Celebrities influence public opinion.", "سلبریتی‌ها بر افکار عمومی تأثیر می‌گذارند."),
            v("paparazzi", "پاپاراتزی", "Paparazzi follow celebrities everywhere.", "پاپاراتزی‌ها همه جا سلبریتی‌ها را دنبال می‌کنند."),
            v("privacy", "حریم خصوصی", "Privacy is essential for mental health.", "حریم خصوصی برای سلامت روان ضروری است."),
            v("publicity", "تبلیغات عمومی", "The scandal received massive publicity.", "رسوایی تبلیغات عمومی عظیمی گرفت."),
            v("scandal", "رسوایی", "The scandal damaged his reputation.", "رسوایی به شهرتش آسیب زد."),
            v("reputation", "شهرت", "She has an excellent reputation.", "او شهرت عالی‌ای دارد."),
            v("press", "مطبوعات", "The press covered the story extensively.", "مطبوعات داستان را به طور گسترده پوشش دادند."),
            v("interview", "مصاحبه", "The interview went well.", "مصاحبه خوب پیش رفت."),
            v("attention", "توجه", "She craves attention.", "او هوس توجه می‌کند."),
            v("spotlight", "نورافکن", "He enjoys being in the spotlight.", "او از بودن زیر نورافکن لذت می‌برد."),
            v("image", "تصویر", "Public image can be managed.", "تصویر عمومی می‌تواند مدیریت شود."),
            v("scrutiny", "ذره‌بین", "Everything they do is under scrutiny.", "هر کاری می‌کنند زیر ذره‌بین است."),
            v("downfall", "سقوط", "Greed was his downfall.", "طمع سقوطش بود."),
            v("idolize", "بت ساختن", "Fans idolize celebrities.", "طرفداران از سلبریتی‌ها بت می‌سازند.", "verb"),
            v("role model", "الگو", "Athletes are role models for children.", "ورزشکاران برای کودکان الگو هستند."),
            v("endorsement", "تأیید تجاری", "The athlete signed a major endorsement deal.", "ورزشکار یک قرارداد تأیید تجاری بزرگ امضا کرد."),
            v("humble", "فروتن", "Despite fame, she remains humble.", "با وجود شهرت، فروتن مانده است.", "adjective"),
            v("superficial", "سطحی", "Celebrity culture can be superficial.", "فرهنگ سلبریتی می‌تواند سطحی باشد.", "adjective"),
            v("fleeting", "زودگذر", "Fame is often fleeting.", "شهرت اغلب زودگذر است.", "adjective")
        ),
        listOf(
            GrammarSection(
                "Embedded questions",
                "Use statement word order in embedded questions. Could you tell me where the ceremony is? I wonder if she'll attend. Do you know what time the show starts?"
            ),
            GrammarSection(
                "Indirect speech in formal contexts",
                "Use formal indirect speech in professional contexts. The actress stated that she had never expected such fame. He mentioned that he would be taking a break from acting."
            ),
            GrammarSection(
                "Conversation strategies for discussing fame",
                "Use 'I wonder' to speculate. Use 'What surprises me is' for emphasis. Use 'It turns out that' to reveal outcomes. Use 'People say' to reference common beliefs."
            )
        ),
        listOf(
            d("A", "I read an interesting article about fame today.", "امروز مقاله جالبی درباره شهرت خواندم."),
            d("B", "Oh? What did it say?", "اوه؟ چه می‌گفت؟"),
            d("A", "It was about the psychological toll of being famous.", "درباره هزینه روانی مشهور بودن بود."),
            d("B", "That's a rich topic. What did the article argue?", "موضوع غنی‌ای است. مقاله چه استدلالی داشت؟"),
            d("A", "That fame is often more damaging than people realize.", "که شهرت اغلب مخرب‌تر از آنچه مردم می‌فهمند است."),
            d("B", "In what ways?", "به چه روش‌هایی؟"),
            d("A", "Loss of privacy, isolation, constant scrutiny, pressure to maintain an image.", "از دست دادن حریم خصوصی، انزوا، زیر ذره‌بین بودن مداوم، فشار برای حفظ تصویر."),
            d("B", "That sounds exhausting.", "فرسوده‌کننده به نظر می‌رسد."),
            d("A", "It is. I wonder how celebrities cope.", "هست. کنجکاوم سلبریتی‌ها چطور کنار می‌آیند."),
            d("B", "Some don't cope well at all.", "برخی اصلاً خوب کنار نمی‌آیند."),
            d("A", "What surprises me is how many young people still want to be famous.", "چیزی که مرا متعجب می‌کند این است که چند جوان هنوز می‌خواهند مشهور شوند."),
            d("B", "Social media has made fame seem accessible.", "شبکه‌های اجتماعی شهرت را قابل دسترس جلوه داده‌اند."),
            d("A", "Exactly. Everyone can be an influencer now.", "دقیقاً. حالا همه می‌توانند اینفلوئنسر باشند."),
            d("B", "But influencer fame is often fleeting.", "ولی شهرت اینفلوئنسری اغلب زودگذر است."),
            d("A", "Very. One viral video, then forgotten.", "خیلی. یک ویدیوی ویروسی، بعد فراموش شده."),
            d("B", "Do you think that's harder than traditional fame?", "فکر می‌کنی این سخت‌تر از شهرت سنتی است؟"),
            d("A", "I wonder. Traditional celebrities have more structure around them.", "کنجکاوم. سلبریتی‌های سنتی ساختار بیشتری دورشان دارند."),
            d("B", "Agents, managers, PR teams.", "نمایندگان، مدیران، تیم‌های روابط عمومی."),
            d("A", "Exactly. Influencers often handle everything alone.", "دقیقاً. اینفلوئنسرها اغلب همه چیز را تنها مدیریت می‌کنند."),
            d("B", "That could be really isolating.", "می‌تواند خیلی منزوی‌کننده باشد."),
            d("A", "It can. Studies show mental health issues are common among influencers.", "می‌تواند. مطالعات نشان می‌دهند مسائل سلامت روان بین اینفلوئنسرها رایج است."),
            d("B", "That's sad but not surprising.", "غم‌انگیز است ولی تعجب‌آور نیست."),
            d("A", "What do you think makes fame so damaging?", "فکر می‌کنی چه چیزی شهرت را اینقدر مخرب می‌کند؟"),
            d("B", "The gap between public image and private self.", "شکاف بین تصویر عمومی و خود خصوصی."),
            d("A", "Interesting. Can you elaborate?", "جالب است. می‌توانی توضیح دهی؟"),
            d("B", "You have to maintain a character. And that character can drift from who you really are.", "باید یک شخصیت را حفظ کنی. و آن شخصیت می‌تواند از آنچه واقعاً هستی دور شود."),
            d("A", "So authenticity becomes impossible.", "پس اصالت غیرممکن می‌شود."),
            d("B", "For some, yes. Others manage to stay grounded.", "برای برخی، بله. دیگران موفق می‌شوند زمین‌گیر بمانند."),
            d("A", "What helps them stay grounded?", "چه چیزی کمک می‌کند زمین‌گیر بمانند؟"),
            d("B", "Strong relationships outside the industry. Therapy. Perspective.", "روابط قوی خارج از صنعت. درمان. دیدگاه."),
            d("A", "So having a life outside fame is crucial.", "پس داشتن زندگی خارج از شهرت حیاتی است."),
            d("B", "Absolutely. If your whole identity is wrapped up in fame, losing it destroys you.", "قطعاً. اگر کل هویتت در شهرت پیچیده باشد، از دست دادنش نابودت می‌کند."),
            d("A", "I wonder how many celebrities actually prepare for that.", "کنجکاوم چند سلبریتی واقعاً برای آن آماده می‌شوند."),
            d("B", "Probably few. Fame feels permanent when you're in it.", "احتمالاً کم. شهرت وقتی در آن هستی دائمی حس می‌شود."),
            d("A", "But it rarely is.", "ولی به‌ندرت هست."),
            d("B", "Rarely. Even the biggest stars fade.", "به‌ندرت. حتی بزرگ‌ترین ستاره‌ها محو می‌شوند."),
            d("A", "Does that make fame sadder or less scary?", "این شهرت را غم‌انگیزتر می‌کند یا کمتر ترسناک؟"),
            d("B", "Both, I think. Sad because it's fragile. Less scary because you know it ends.", "هر دو، فکر می‌کنم. غم‌انگیز چون شکننده است. کمتر ترسناک چون می‌دانی تمام می‌شود."),
            d("A", "What would you do if you became famous overnight?", "اگر یک‌شبه مشهور می‌شدی چه می‌کردی؟"),
            d("B", "Honestly? Probably panic.", "راستش؟ احتمالاً وحشت می‌کردم."),
            d("A", "Ha! Me too.", "ها! من هم."),
            d("B", "What about you? Would you want fame?", "تو چطور؟ شهرت می‌خواستی؟"),
            d("A", "Maybe a small amount. Enough to make a difference but not enough to lose privacy.", "شاید مقدار کمی. کافی برای تفاوت ایجاد کردن ولی نه آنقدر که حریم خصوصی را از دست بدهم."),
            d("B", "That's a fine line.", "خط باریکی است."),
            d("A", "It is. Once you're famous, you can't really control how famous you become.", "هست. یک بار که مشهور شوی، واقعاً نمی‌توانی کنترل کنی چقدر مشهور می‌شوی."),
            d("B", "True. It's often accidental.", "درست. اغلب تصادفی است."),
            d("A", "Like the 'fifteen minutes of fame' idea.", "مثل ایده «پانزده دقیقه شهرت»."),
            d("B", "Exactly. Warhol's famous prediction.", "دقیقاً. پیش‌بینی معروف وارهول."),
            d("A", "Now it's more like fifteen seconds on TikTok.", "الان بیشتر شبیه پانزده ثانیه در تیک‌تاک است."),
            d("B", "Ha! True. The attention economy is brutal.", "ها! درست. اقتصاد توجه بی‌رحم است."),
            d("A", "What do you think the future of fame looks like?", "فکر می‌کنی آینده شهرت چه شکلی است؟"),
            d("B", "More fragmented. Less centralized. More niche communities.", "تکه‌تکه‌تر. کمتر متمرکز. جوامع خاص‌تر."),
            d("A", "So no more global superstars?", "پس دیگر ابرستاره جهانی نداریم؟"),
            d("B", "Fewer, definitely. And they'll be replaced faster.", "کمتر، قطعاً. و سریع‌تر جایگزین می‌شوند."),
            d("A", "That sounds exhausting for them.", "برایشان فرسوده‌کننده به نظر می‌رسد."),
            d("B", "It is. But there's also less pressure to stay relevant forever.", "هست. ولی فشار کمتری هم برای مرتبط ماندن تا ابد وجود دارد."),
            d("A", "Glass half full.", "نیمه پر لیوان."),
            d("B", "Always.", "همیشه."),
            d("A", "Speaking of fame — have you seen the documentary about child stars?", "از شهرت که صحبت شد — مستند درباره ستاره‌های کودک را دیده‌ای؟"),
            d("B", "No, but I've heard it's powerful.", "نه، ولی شنیده‌ام قدرتمند است."),
            d("A", "It is. Many of them struggled badly as adults.", "هست. بسیاری از آن‌ها به عنوان بزرگسال بدجور دست و پنجه نرم کردند."),
            d("B", "I can imagine. Growing up in the public eye is brutal.", "می‌توانم تصور کنم. بزرگ شدن در چشم عموم بی‌رحم است."),
            d("A", "The article I read mentioned the same thing.", "مقاله‌ای که خواندم همین را ذکر کرد."),
            d("B", "There should be more protections for them.", "باید حمایت‌های بیشتری برایشان باشد."),
            d("A", "Definitely. Laws vary widely by country.", "قطعاً. قوانین بین کشورها خیلی متفاوتند."),
            d("B", "Where are they strongest?", "کجا قوی‌ترین هستند؟"),
            d("A", "California has the Coogan Law, which protects child actors' earnings.", "کالیفرنیا قانون کوگان را دارد، که درآمد بازیگران کودک را محافظت می‌کند."),
            d("B", "That's a good model.", "مدل خوبی است."),
            d("A", "It is. But enforcement is uneven.", "هست. ولی اجرا ناهموار است."),
            d("B", "Same story everywhere.", "همان داستان همه جا."),
            d("A", "Sadly, yes.", "متأسفانه، بله."),
            d("B", "Well, I should go. This was a great conversation.", "خب، باید بروم. گفت‌وگوی عالی‌ای بود."),
            d("A", "It was. Let's continue it some other time.", "بود. بیایید یک وقت دیگر ادامه‌اش دهیم."),
            d("B", "Deal. See you soon.", "قبول. به‌زودی می‌بینمت."),
            d("A", "See you. Take care.", "می‌بینمت. مراقب باش."),
            d("B", "You too. Bye!", "تو هم. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is the article about?", listOf("celebrity scandals", "psychological toll of fame", "paparazzi laws", "child stars"), 1),
            q("What does B say is the damaging aspect of fame?", listOf("money", "the gap between public image and private self", "fans", "interviews"), 1),
            q("What helps celebrities stay grounded?", listOf("more fame", "strong relationships and therapy", "isolation", "money"), 1),
            q("What law protects child actors' earnings?", listOf("Warhol Law", "Coogan Law", "Privacy Act", "Child Star Act"), 1),
            q("What does B predict about the future of fame?", listOf("more global superstars", "less centralized and more fragmented", "no change", "fame will disappear"), 1),
            q("Could you tell me where the ceremony ___?", listOf("is", "was", "does", "it is"), 0),
            q("I wonder if she ___ attend.", listOf("will", "would", "does", "did"), 0),
            q("Do you know what time the show ___?", listOf("starts", "start", "does start", "starting"), 0),
            q("The actress stated that she ___ never expected such fame.", listOf("has", "had", "have", "having"), 1),
            q("He mentioned that he ___ be taking a break.", listOf("will", "would", "does", "did"), 1)
        ),
        idioms = listOf(
            IdiomExpression("In the spotlight", "زیر نورافکن", "He enjoys being in the spotlight.", "او از بودن زیر نورافکن لذت می‌برد."),
            IdiomExpression("Under scrutiny", "زیر ذره‌بین", "Everything is under scrutiny.", "همه چیز زیر ذره‌بین است."),
            IdiomExpression("Fifteen minutes of fame", "پانزده دقیقه شهرت", "Warhol predicted fifteen minutes of fame.", "وارهول پانزده دقیقه شهرت را پیش‌بینی کرد."),
            IdiomExpression("Glass half full", "نیمه پر لیوان", "Glass half full.", "نیمه پر لیوان."),
            IdiomExpression("Stay grounded", "زمین‌گیر ماندن", "It's hard to stay grounded.", "زمین‌گیر ماندن سخت است."),
            IdiomExpression("Rich topic", "موضوع غنی", "That's a rich topic.", "موضوع غنی‌ای است."),
            IdiomExpression("Fine line", "خط باریک", "That's a fine line.", "خط باریکی است.")
        ),
        phrasal = listOf(
            PhrasalVerb("cope with", "کنار آمدن با", "deal with",
                "How do celebrities cope with fame?", "سلبریتی‌ها چطور با شهرت کنار می‌آیند؟", "No"),
            PhrasalVerb("wrap up in", "پیچیده شدن در", "involve deeply",
                "Identity wrapped up in fame.", "هویت پیچیده در شهرت.", "No"),
            PhrasalVerb("fade away", "محو شدن", "disappear gradually",
                "Even the biggest stars fade away.", "حتی بزرگ‌ترین ستاره‌ها محو می‌شوند.", "No"),
            PhrasalVerb("stay grounded", "زمین‌گیر ماندن", "remain humble",
                "It's hard to stay grounded.", "زمین‌گیر ماندن سخت است.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Embedded question intonation", "Embedded questions use statement intonation: Could you tell me where the ceremony IS. ↘"),
            PronunciationTip("Indirect speech rhythm", "Stress the reporting verb: The actress STATED that she had never expected such fame."),
            PronunciationTip("Fame vocabulary stress", "Stress first syllable: CElebrity, PRIvacy, REputation.")
        ),
        culture = listOf(
            CulturalNote("Celebrity culture",
                "Celebrity culture varies globally. In some countries, celebrities are idolized; in others, privacy is more respected. Social media has transformed who becomes famous and how."),
            CulturalNote("Privacy laws",
                "Privacy laws vary widely. The EU has strong privacy protections (GDPR). The US has weaker protections. This affects how celebrities and ordinary citizens are treated by media."),
            CulturalNote("The attention economy",
                "The 'attention economy' refers to the competition for human attention as a scarce resource. Social media platforms profit from capturing and holding attention, changing how fame works.")
        ),
        mistakes = listOf(
            CommonMistake("Could you tell me where is the ceremony?", "Could you tell me where the ceremony is?", "Embedded questions use statement word order."),
            CommonMistake("I wonder will she attend.", "I wonder if she will attend.", "Use 'if' or 'whether' in embedded yes/no questions."),
            CommonMistake("She said she has never expected such fame.", "She said she had never expected such fame.", "Shift tense back in indirect speech.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why is fame psychologically damaging according to the article?", "Loss of privacy, isolation, constant scrutiny, and the pressure to maintain an image."),
            ComprehensionQuestion("What makes modern influencer fame different from traditional fame?", "Influencer fame is more fragmented, fleeting, and often handled alone without PR teams."),
            ComprehensionQuestion("What is B's prediction about the future of fame?", "More fragmented, less centralized, with fewer global superstars who are replaced faster.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss the pros and cons of being famous.",
                "مزایا و معایب مشهور بودن را بحث کن.",
                "On one hand... / On the other... / I wonder..."),
            SpeakingTask("Talk about a celebrity you admire and why.",
                "درباره سلبریتی‌ای که تحسین می‌کنی و دلیلش صحبت کن.",
                "I admire... because... / What impresses me is..."),
            SpeakingTask("Role-play a celebrity interview.",
                "نقش‌بازی مصاحبه با سلبریتی.",
                "Could you tell me...? / I wonder if...? / What's it like to...?")
        ),
        writing = listOf(
            WritingTask("Write an essay about the impact of social media on fame.",
                "مقاله‌ای درباره تأثیر شبکه‌های اجتماعی بر شهرت بنویس.",
                280, "Use embedded questions and indirect speech.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 8 — Honesty is the Best Policy | صداقت بهترین سیاست است
    // ═══════════════════════════════════════════════════════════
    private fun unit8() = base(
        8, "Honesty is the Best Policy", "صداقت بهترین سیاست است",
        listOf(
            "Discuss honesty and deception",
            "Explore moral dilemmas",
            "Talk about ethical decisions in business and life",
            "Use inverted conditionals",
            "Use the subjunctive mood in formal English"
        ),
        listOf(
            v("deception", "فریب", "Deception destroys trust.", "فریب اعتماد را نابود می‌کند."),
            v("integrity", "درستکاری", "Integrity is non-negotiable.", "درستکاری قابل مذاکره نیست."),
            v("transparency", "شفافیت", "Transparency builds credibility.", "شفافیت اعتبار می‌سازد."),
            v("dilemma", "دوراهی", "It was a real moral dilemma.", "یک دوراهی اخلاقی واقعی بود."),
            v("white lie", "دروغ مصلحتی", "Sometimes white lies protect feelings.", "گاهی دروغ‌های مصلحتی احساسات را محافظت می‌کنند."),
            v("conceal", "پنهان کردن", "He concealed the truth for months.", "ماه‌ها حقیقت را پنهان کرد.", "verb"),
            v("disclose", "افشا کردن", "Companies must disclose risks.", "شرکت‌ها باید ریسک‌ها را افشا کنند.", "verb"),
            v("betrayal", "خیانت", "The betrayal ended their friendship.", "خیانت دوستی‌شان را پایان داد."),
            v("loyalty", "وفاداری", "Loyalty is tested in hard times.", "وفاداری در زمان‌های سخت آزمایش می‌شود."),
            v("accountability", "پاسخگویی", "Leaders must demonstrate accountability.", "رهبران باید پاسخگویی نشان دهند."),
            v("whistleblower", "افشاگر", "The whistleblower exposed the scandal.", "افشاگر رسوایی را برملا کرد."),
            v("malpractice", "سوءرفتار حرفه‌ای", "Medical malpractice is a serious issue.", "سوءرفتار پزشکی مسئله جدی‌ای است."),
            v("embezzle", "اختلاس کردن", "He embezzled millions from the company.", "او میلیون‌ها از شرکت اختلاس کرد.", "verb"),
            v("fraud", "کلاهبرداری", "Fraud is punishable by law.", "کلاهبرداری طبق قانون مجازات دارد."),
            v("conflict of interest", "تضاد منافع", "He declared his conflict of interest.", "تضاد منافعش را اعلام کرد."),
            v("upfront", "صریح و صادق", "Be upfront about your intentions.", "درباره نیاتت صریح باش.", "adjective"),
            v("candid", "صادقانه", "She was candid about her mistakes.", "او درباره اشتباهاتش صادقانه بود.", "adjective"),
            v("credibility", "اعتبار", "The scandal damaged his credibility.", "رسوایی به اعتبارش آسیب زد."),
            v("reputation", "شهرت", "Reputation takes years to build, minutes to destroy.", "شهرت سال‌ها می‌گیرد تا ساخته شود، دقیقه‌ها تا نابود شود."),
            v("ethical", "اخلاقی", "Is it ethical to lie to protect someone?", "آیا دروغ برای محافظت از کسی اخلاقی است؟", "adjective")
        ),
        listOf(
            GrammarSection(
                "Inverted conditionals",
                "In formal English, conditionals can be inverted by dropping 'if' and moving the auxiliary. Had I known, I would have acted differently. Were I in your position, I would resign. Should you need anything, let me know."
            ),
            GrammarSection(
                "The subjunctive mood",
                "Use the subjunctive for formal recommendations, demands, and hypotheticals. I recommend that he resign. It's essential that she be informed. The board insisted that the CEO step down."
            ),
            GrammarSection(
                "Conversation strategies for ethical discussions",
                "Use 'Where do you draw the line?' for moral boundaries. Use 'I see it differently' to disagree respectfully. Use 'To be fair' to acknowledge another view. Use 'By the same token' to draw a parallel."
            )
        ),
        listOf(
            d("A", "I need your honest opinion on something. It's been eating at me.", "نظر صادقت را درباره چیزی لازم دارم. آزارم داده."),
            d("B", "Of course. What's going on?", "حتماً. چه خبره؟"),
            d("A", "At work, I discovered that a colleague has been lying on reports for months.", "در محل کار فهمیدم همکاری ماه‌هاست روی گزارش‌ها دروغ می‌گوید."),
            d("B", "That's serious. What kind of lies?", "جدی است. چه نوع دروغ‌هایی؟"),
            d("A", "Exaggerating sales numbers. Concealing customer complaints.", "بزرگنمایی اعداد فروش. پنهان کردن شکایات مشتری."),
            d("B", "Why would he do that?", "چرا این کار را می‌کند؟"),
            d("A", "To get promoted. And it worked. He got the position I applied for.", "برای ارتقاء. و کار کرد. موقعیتی را که من درخواست داده بودم گرفت."),
            d("B", "That's infuriating.", "عصبانی‌کننده است."),
            d("A", "It is. But I'm not sure what to do.", "هست. ولی مطمئن نیستم چه کار کنم."),
            d("B", "Have you considered reporting him?", "به گزارش دادنش فکر کرده‌ای؟"),
            d("A", "I have. But it could backfire. What if no one believes me?", "فکر کرده‌ام. ولی می‌تواند نتیجه عکس دهد. اگر کسی باورم نکند چه؟"),
            d("B", "That's a real risk. Do you have evidence?", "خطر واقعی‌ای است. مدرک داری؟"),
            d("A", "Some. Screenshots of discrepancies. But not a full case.", "کمی. اسکرین‌شات‌هایی از تناقض‌ها. ولی پرونده کامل نه."),
            d("B", "Where do you draw the line between loyalty to your team and honesty?", "مرز بین وفاداری به تیمت و صداقت را کجا می‌کشی؟"),
            d("A", "That's exactly my dilemma. If I report him, I damage the team. If I don't, I'm complicit.", "دقیقاً دوراهی من همین است. اگر گزارشش دهم، به تیم آسیب می‌زنم. اگر ندهم، شریک جرمم."),
            d("B", "Were I in your position, I would document everything first.", "اگر جای تو بودم، اول همه چیز را مستند می‌کردم."),
            d("A", "That's good advice. And then?", "توصیه خوبی است. و بعد؟"),
            d("B", "Then talk to him privately. Give him a chance to explain.", "بعد خصوصی با او صحبت کن. فرصت توضیح بده."),
            d("A", "What if he denies it?", "اگر انکار کند چه؟"),
            d("B", "Then you escalate. Had you not confronted him first, you'd have more ammunition. But you'll know he's unwilling to change.", "بعد گزارش می‌دهی. اگر اول با او روبه‌رو نمی‌شدی، مهمات بیشتری داشتی. ولی می‌فهمی که حاضر به تغییر نیست."),
            d("A", "That's fair. But it feels like a lot of work for a bad outcome.", "منصفانه است. ولی مثل کار زیادی برای نتیجه بد به نظر می‌رسد."),
            d("B", "It might be. But by the same token, silence makes you part of the problem.", "ممکن است باشد. ولی به همین ترتیب، سکوت تو را بخشی از مشکل می‌کند."),
            d("A", "I know. That's what's been eating at me.", "می‌دانم. همین آزارم داده."),
            d("B", "What does your gut say?", "غریزه‌ات چه می‌گوید؟"),
            d("A", "My gut says I have to do something. I just don't know what.", "غریزه‌ام می‌گوید باید کاری کنم. فقط نمی‌دانم چه."),
            d("B", "Have you thought about the long-term consequences?", "به پیامدهای بلندمدت فکر کرده‌ای؟"),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "If he gets away with it, he'll do it again. And worse. Fraud escalates.", "اگر از آن در برود، دوباره انجام می‌دهد. و بدتر. کلاهبرداری بزرگ‌تر می‌شود."),
            d("A", "That's true. And if the company is audited, everyone could be implicated.", "درست است. و اگر شرکت حسابرسی شود، همه می‌توانند درگیر شوند."),
            d("B", "Exactly. So it's not just about him. It's about protecting everyone.", "دقیقاً. پس فقط درباره او نیست. درباره محافظت از همه است."),
            d("A", "You're right. I hadn't thought of it that way.", "حق داری. آنطور فکر نکرده بودم."),
            d("B", "It's easy to focus on the personal. But the systemic angle matters too.", "تمرکز روی شخصی آسان است. ولی جنبه سیستمی هم مهم است."),
            d("A", "Do you think I should talk to a lawyer?", "فکر می‌کنی باید با وکیل صحبت کنم؟"),
            d("B", "Possibly. Especially if you decide to report. You want protection.", "احتمالاً. مخصوصاً اگر تصمیم بگیری گزارش دهی. حمایت می‌خواهی."),
            d("A", "Good point. I'll look into it.", "نکته خوبی است. بررسی می‌کنم."),
            d("B", "Where did you learn to value honesty so much?", "کجا یاد گرفتی اینقدر برای صداقت ارزش قائل شوی؟"),
            d("A", "My father owned a small business. He once lost a big client because he told the truth.", "پدرم کسب‌وکار کوچکی داشت. یک بار مشتری بزرگی را از دست داد چون حقیقت را گفت."),
            d("B", "And he didn't regret it?", "و پشیمان نشد؟"),
            d("A", "He said he slept better at night.", "گفت شب‌ها بهتر می‌خوابد."),
            d("B", "That's a powerful lesson.", "درس قدرتمندی است."),
            d("A", "It stuck with me. I've tried to live by it.", "با من ماند. سعی کرده‌ام بر اساسش زندگی کنم."),
            d("B", "But now your principles are being tested.", "ولی حالا اصولت آزمایش می‌شوند."),
            d("A", "Exactly. And it's harder than I imagined.", "دقیقاً. و سخت‌تر از آنچه تصور می‌کردم است."),
            d("B", "What would your father do?", "پدرت چه می‌کرد؟"),
            d("A", "He'd probably say, 'Do the right thing, even if it costs you.'", "احتمالاً می‌گفت: «کار درست را بکن، حتی اگر برایت هزینه داشته باشد.»"),
            d("B", "Sounds like good advice.", "توصیه خوبی به نظر می‌رسد."),
            d("A", "It is. But following it is another matter.", "هست. ولی عمل کردن به آن مسئله دیگری است."),
            d("B", "That's always the challenge.", "این همیشه چالش است."),
            d("A", "What about you? Have you ever had to choose between honesty and loyalty?", "تو چطور؟ تا حالا مجبور شده‌ای بین صداقت و وفاداری یکی را انتخاب کنی؟"),
            d("B", "Yes. A friend once asked me if I liked her artwork.", "بله. دوستی یک بار پرسید آیا از اثر هنری‌اش خوشم می‌آید."),
            d("A", "What did you say?", "چه گفتی؟"),
            d("B", "I told the truth. She was hurt.", "حقیقت را گفتم. دلش شکست."),
            d("A", "Did you regret it?", "پشیمان شدی؟"),
            d("B", "Not the honesty. But the delivery. I was too blunt.", "از صداقت نه. ولی از نحوه بیان. خیلی بی‌رودربایستی بودم."),
            d("A", "So timing and tone matter.", "پس زمان و لحن مهم هستند."),
            d("B", "Very much. Truth without tact is cruelty.", "خیلی زیاد. حقیقت بدون تدبیر بی‌رحمی است."),
            d("A", "That's a great phrase.", "عبارت عالی‌ای است."),
            d("B", "I read it somewhere. It stuck.", "جایی خواندم. ماند."),
            d("A", "What about white lies? Do you ever tell them?", "دروغ‌های مصلحتی چطور؟ هیچ‌وقت می‌گویی؟"),
            d("B", "Sometimes. 'You look great' when someone needs a boost.", "گاهی. «عالی به نظر می‌رسی» وقتی کسی به تقویت نیاز دارد."),
            d("A", "Where's the line?", "مرز کجاست؟"),
            d("B", "When it protects feelings without causing harm. If it causes harm, it's not white anymore.", "وقتی احساسات را بدون آسیب محافظت می‌کند. اگر آسیب برساند، دیگر مصلحتی نیست."),
            d("A", "So intention matters.", "پس نیت مهم است."),
            d("B", "Intention and impact. Both.", "نیت و تأثیر. هر دو."),
            d("A", "What if you don't know the impact in advance?", "اگر تأثیر را از قبل ندانیم چه؟"),
            d("B", "Then be humble. Ask. Adjust.", "پس فروتن باش. بپرس. تنظیم کن."),
            d("A", "Good advice.", "توصیه خوبی است."),
            d("B", "Well, I should go. But let me know what you decide about the work situation.", "خب، باید بروم. ولی بگو درباره موقعیت کاری چه تصمیمی می‌گیری."),
            d("A", "I will. Thanks for being a sounding board.", "می‌گویم. ممنون که به حرف‌هایم گوش دادی."),
            d("B", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
            d("A", "Talk soon.", "به‌زودی صحبت."),
            d("B", "Talk soon. And good luck.", "به‌زودی صحبت. و موفق باشی."),
            d("A", "Thanks. Bye!", "ممنون. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did A's colleague do?", listOf("stole money", "lied on reports", "harassed coworkers", "broke equipment"), 1),
            q("What was the outcome of the lies?", listOf("nothing happened", "he got the promotion A wanted", "he was fired", "he resigned"), 1),
            q("What does B recommend A do first?", listOf("report immediately", "confront him", "document everything", "quit"), 2),
            q("Why is B concerned about silence?", listOf("it's unprofessional", "it makes A part of the problem", "it's dangerous", "it violates policy"), 1),
            q("What did A's father do?", listOf("lied for profit", "told the truth and lost a client", "reported a colleague", "quit his job"), 1),
            q("___ I known, I would have acted differently.", listOf("If", "Had", "Were", "Should"), 1),
            q("___ I in your position, I would resign.", listOf("If", "Had", "Were", "Should"), 2),
            q("___ you need anything, let me know.", listOf("If", "Had", "Were", "Should"), 3),
            q("I recommend that he ___.", listOf("resigns", "resign", "resigned", "resigning"), 1),
            q("It's essential that she ___ informed.", listOf("is", "be", "was", "being"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Eating at me", "آزارم دادن", "It's been eating at me.", "آزارم داده."),
            IdiomExpression("Where do you draw the line?", "مرز را کجا می‌کشی؟", "Where do you draw the line?", "مرز را کجا می‌کشی؟"),
            IdiomExpression("By the same token", "به همین ترتیب", "By the same token, silence makes you complicit.", "به همین ترتیب، سکوت تو را شریک جرم می‌کند."),
            IdiomExpression("Get away with", "از آن در بردن", "If he gets away with it, he'll do it again.", "اگر از آن در برود، دوباره انجام می‌دهد."),
            IdiomExpression("Sounding board", "فردی که به حرف‌ها گوش می‌دهد", "Thanks for being a sounding board.", "ممنون که به حرف‌هایم گوش دادی."),
            IdiomExpression("Live by", "بر اساس چیزی زندگی کردن", "I've tried to live by it.", "سعی کرده‌ام بر اساسش زندگی کنم."),
            IdiomExpression("Truth without tact", "حقیقت بدون تدبیر", "Truth without tact is cruelty.", "حقیقت بدون تدبیر بی‌رحمی است.")
        ),
        phrasal = listOf(
            PhrasalVerb("eat at", "آزار دادن", "bother persistently",
                "It's been eating at me.", "آزارم داده.", "No"),
            PhrasalVerb("get away with", "از آن در بردن", "escape consequences",
                "If he gets away with it, he'll do it again.", "اگر از آن در برود، دوباره انجام می‌دهد.", "No"),
            PhrasalVerb("live by", "بر اساس چیزی زندگی کردن", "follow as a principle",
                "I've tried to live by it.", "سعی کرده‌ام بر اساسش زندگی کنم.", "No"),
            PhrasalVerb("stick with", "با چیزی ماندن", "continue with",
                "It stuck with me.", "با من ماند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Inverted conditional stress", "Stress the auxiliary: HAD I known... WERE I in your position..."),
            PronunciationTip("Subjunctive stress", "Stress the base verb in subjunctive: I recommend that he reSIGN."),
            PronunciationTip("Ethical discussion intonation", "Use measured, calm intonation when discussing moral issues.")
        ),
        culture = listOf(
            CulturalNote("Whistleblowing",
                "Whistleblowers expose wrongdoing within organizations. They face significant risks — retaliation, career damage, and legal battles. Many countries have laws protecting them."),
            CulturalNote("Business ethics",
                "Business ethics varies across cultures. Some prioritize shareholder value above all; others emphasize stakeholder responsibility. Scandals like Enron and Volkswagen have highlighted the consequences of ethical failures."),
            CulturalNote("Honesty across cultures",
                "Attitudes toward honesty vary. Some cultures value directness; others prioritize harmony and may use white lies to protect relationships. Understanding these differences is crucial for cross-cultural communication.")
        ),
        mistakes = listOf(
            CommonMistake("If I would have known, I would have acted.", "Had I known, I would have acted.", "Use inverted conditional for formal English."),
            CommonMistake("I recommend that he resigns.", "I recommend that he resign.", "Use subjunctive after 'recommend'."),
            CommonMistake("If I was in your position...", "Were I in your position...", "Use inverted subjunctive for formal effect.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is A's dilemma?", "Between loyalty to the team and honesty about a colleague's lies."),
            ComprehensionQuestion("Why does B say silence makes A part of the problem?", "Because failing to report fraud makes everyone complicit, and the behavior will escalate."),
            ComprehensionQuestion("What does B say about the difference between white lies and harmful lies?", "White lies protect feelings without causing harm; harmful lies cause damage. Both intention and impact matter.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss an ethical dilemma you've faced or witnessed.",
                "درباره دوراهی اخلاقی که با آن روبرو شده‌ای یا شاهد بوده‌ای صحبت کن.",
                "Had I known... / Were I in that position... / I recommend that..."),
            SpeakingTask("Debate whether white lies are ever acceptable.",
                "بحث کنید که آیا دروغ‌های مصلحتی هرگز قابل قبول هستند.",
                "On one hand... / By the same token... / Where do you draw the line?"),
            SpeakingTask("Role-play confronting a colleague about dishonest behavior.",
                "نقش‌بازی روبه‌رو شدن با همکار درباره رفتار ناصادقانه.",
                "I need to talk to you about... / I've noticed... / I hope we can resolve this.")
        ),
        writing = listOf(
            WritingTask("Write a persuasive essay about honesty in the workplace.",
                "مقاله‌ای ترغیبی درباره صداقت در محیط کار بنویس.",
                280, "Use inverted conditionals and the subjunctive mood.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 9 — Sports | ورزش
    // ═══════════════════════════════════════════════════════════
    private fun unit9() = base(
        9, "Sports", "ورزش",
        listOf(
            "Discuss sports and athletes",
            "Talk about competition and fair play",
            "Explore the value of sports in society",
            "Use the subjunctive after 'it's important that' and 'it's essential that'",
            "Use phrases of concession"
        ),
        listOf(
            v("athlete", "ورزشکار", "Professional athletes train daily.", "ورزشکاران حرفه‌ای روزانه تمرین می‌کنند."),
            v("competition", "رقابت", "The competition was fierce.", "رقابت شدید بود."),
            v("tournament", "مسابقات", "She won the tournament.", "او مسابقات را برد."),
            v("championship", "قهرمانی", "The championship game was thrilling.", "بازی قهرمانی هیجان‌انگیز بود."),
            v("endurance", "استقامت", "Endurance is essential for marathon runners.", "استقامت برای دوندگان ماراتن ضروری است."),
            v("teamwork", "کار تیمی", "Teamwork makes the dream work.", "کار تیمی رویا را محقق می‌کند."),
            v("sportsmanship", "روحیه ورزشی", "Good sportsmanship is more important than winning.", "روحیه ورزشی خوب مهم‌تر از بردن است."),
            v("doping", "دوپینگ", "Doping undermines fair play.", "دوپینگ بازی جوانمردانه را تضعیف می‌کند."),
            v("fair play", "بازی جوانمردانه", "Fair play is the foundation of sport.", "بازی جوانمردانه پایه ورزش است."),
            v("referee", "داور", "The referee made a controversial call.", "داور تصمیم بحث‌برانگیزی گرفت."),
            v("underdog", "تیم ضعیف‌تر", "Everyone loves an underdog story.", "همه داستان تیم ضعیف‌تر را دوست دارند."),
            v("comeback", "بازگشت", "It was an incredible comeback.", "بازگشت باورنکردنی‌ای بود."),
            v("professional", "حرفه‌ای", "He became a professional athlete at 18.", "او در ۱۸ سالگی ورزشکار حرفه‌ای شد.", "adjective"),
            v("amateur", "آماتور", "The amateur league has more fun.", "لیگ آماتور سرگرم‌کننده‌تر است.", "adjective"),
            v("training", "تمرین", "Training is relentless at the top level.", "تمرین در سطح بالا بی‌امان است."),
            v("sacrifice", "فداکاری", "Athletes make many sacrifices.", "ورزشکاران فداکاری‌های زیادی می‌کنند."),
            v("endorsement", "تأیید تجاری", "Top athletes earn millions from endorsements.", "ورزشکاران برتر میلیون‌ها از تأییدهای تجاری درمی‌آورند."),
            v("injury", "آسیب", "Injuries can end careers.", "آسیب‌ها می‌توانند حرفه‌ها را پایان دهند."),
            v("resilience", "تاب‌آوری", "Resilience separates champions from contenders.", "تاب‌آوری قهرمانان را از رقبا جدا می‌کند."),
            v("legacy", "میراث", "Her legacy transcends the sport.", "میراثش از ورزش فراتر می‌رود.")
        ),
        listOf(
            GrammarSection(
                "The subjunctive after it's important/essential that",
                "Use the subjunctive for formal recommendations. It's important that athletes be role models. It's essential that doping be strictly punished. It's crucial that referees remain impartial."
            ),
            GrammarSection(
                "Phrases of concession",
                "Use concession to acknowledge a contrary point. Although professional sports are lucrative, many athletes struggle financially. While competition is important, sportsmanship matters more. Even though she lost, she gained respect."
            ),
            GrammarSection(
                "Conversation strategies for sports discussions",
                "Use 'Speaking of' to transition topics. Use 'The thing about' to introduce a key point. Use 'Granted' to acknowledge a counterargument. Use 'At the end of the day' for a concluding thought."
            )
        ),
        listOf(
            d("A", "Did you watch the championship game last night?", "بازی قهرمانی دیشب را دیدی؟"),
            d("B", "I did. What an incredible comeback!", "دیدم. چه بازگشت باورنکردنی‌ای!"),
            d("A", "I know. They were down by twenty points at halftime.", "می‌دانم. در نیمه با بیست امتیاز عقب بودند."),
            d("B", "And they still won. That's resilience.", "و باز هم بردند. این تاب‌آوری است."),
            d("A", "It is. The star player was amazing.", "هست. بازیکن ستاره شگفت‌انگیز بود."),
            d("B", "He's been the best in the league for years. But he's also humble.", "سال‌هاست بهترین لیگ است. ولی همچنین فروتن."),
            d("A", "That's rare. So many talented athletes are arrogant.", "نادر است. بسیاری از ورزشکاران با استعداد متکبرند."),
            d("B", "True. It's important that athletes be role models.", "درست. مهم است که ورزشکاران الگو باشند."),
            d("A", "Do you think they have a responsibility to be?", "فکر می‌کنی مسئولیت دارند؟"),
            d("B", "To some extent. They didn't choose to be famous.", "تا حدی. آن‌ها انتخاب نکردند مشهور شوند."),
            d("A", "Good point. But their influence is real.", "نکته خوبی است. ولی تأثیرشان واقعی است."),
            d("B", "It is. And many of them use it for good.", "هست. و بسیاری از آن‌ها برای خیر استفاده می‌کنند."),
            d("A", "Like foundations and charity work?", "مثل بنیادها و کارهای خیریه؟"),
            d("B", "Exactly. Some have built schools in their hometowns.", "دقیقاً. برخی در شهر زادگاهشان مدرسه ساخته‌اند."),
            d("A", "That's inspiring. Do you think sports are important for society?", "الهام‌بخش است. فکر می‌کنی ورزش برای جامعه مهم است؟"),
            d("B", "Absolutely. It's crucial that sports be accessible to all children.", "قطعاً. حیاتی است که ورزش برای همه کودکان قابل دسترس باشد."),
            d("A", "Not just a privilege for the wealthy?", "نه فقط امتیازی برای ثروتمندان؟"),
            d("B", "Right. Sports teach teamwork, discipline, resilience.", "درست. ورزش کار تیمی، نظم، تاب‌آوری می‌آموزد."),
            d("A", "And it keeps kids healthy.", "و بچه‌ها را سالم نگه می‌دارد."),
            d("B", "That too. But the psychological benefits are even bigger.", "آن هم. ولی مزایای روانی حتی بزرگ‌ترند."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "Learning to lose gracefully. Learning to work with people you don't like.", "یادگیری باختن با ظرافت. یادگیری کار با افرادی که دوستشان نداری."),
            d("A", "Life skills.", "مهارت‌های زندگی."),
            d("B", "Exactly. At the end of the day, sports are about more than winning.", "دقیقاً. در نهایت، ورزش درباره بیشتر از بردن است."),
            d("A", "What about professional sports? Are they too commercialized?", "ورزش حرفه‌ای چطور؟ زیادی تجاری شده‌اند؟"),
            d("B", "Granted, there's a lot of money involved. But that also funds youth programs.", "مسلماً پول زیادی درگیر است. ولی آن هم برنامه‌های جوانان را تأمین مالی می‌کند."),
            d("A", "So it's a mixed blessing.", "پس نعمت و نقمت است."),
            d("B", "Exactly. While the commercialization has downsides, it also enables growth.", "دقیقاً. هرچند تجاری‌سازی معایبی دارد، رشد را هم ممکن می‌کند."),
            d("A", "What's the biggest downside in your opinion?", "به نظرت بزرگ‌ترین عیبش چیست؟"),
            d("B", "The pressure on young athletes. They sacrifice childhood for a dream.", "فشار روی ورزشکاران جوان. کودکی را برای رویا فدا می‌کنند."),
            d("A", "And most don't make it.", "و بیشترشان موفق نمی‌شوند."),
            d("B", "Exactly. It's essential that they have backup plans.", "دقیقاً. حیاتی است که برنامه‌های پشتیبان داشته باشند."),
            d("A", "Do you follow any sports closely?", "ورزش خاصی را نزدیک دنبال می‌کنی؟"),
            d("B", "Basketball, mostly. And tennis.", "بیشتر بسکتبال. و تنیس."),
            d("A", "Tennis is having a great era right now.", "تنیس الان عصر عالی‌ای دارد."),
            d("B", "It is. So many talented players.", "دارد. بازیکنان با استعداد زیادی."),
            d("A", "Who's your favorite?", "مورد علاقه‌ات کیست؟"),
            d("B", "I like the ones who show sportsmanship after losses.", "آن‌هایی را دوست دارم که پس از باخت روحیه ورزشی نشان می‌دهند."),
            d("A", "That's telling of character.", "این نشانه شخصیت است."),
            d("B", "Very. Anyone can be gracious when winning.", "خیلی. هرکسی می‌تواند هنگام بردن با ظرافت باشد."),
            d("A", "What about doping? Do you think it's still a problem?", "دوپینگ چطور؟ فکر می‌کنی هنوز مشکل است؟"),
            d("B", "Unfortunately, yes. Some athletes always look for shortcuts.", "متأسفانه، بله. برخی ورزشکاران همیشه دنبال میانبرند."),
            d("A", "What's the solution?", "راه‌حل چیست؟"),
            d("B", "Better testing. Harsher penalties. And a culture change.", "آزمایش بهتر. مجازات‌های سخت‌تر. و تغییر فرهنگی."),
            d("A", "Culture change is the hardest.", "تغییر فرهنگی سخت‌ترین است."),
            d("B", "It is. But essential. If winning matters more than integrity, everyone loses.", "هست. ولی ضروری. اگر بردن مهم‌تر از درستکاری باشد، همه می‌بازند."),
            d("A", "Well said.", "خوب گفتی."),
            d("B", "Thank you.", "ممنون."),
            d("A", "Do you play any sports yourself?", "خودت ورزش می‌کنی؟"),
            d("B", "I play tennis on weekends. Just for fun.", "آخر هفته‌ها تنیس می‌کنم. فقط برای سرگرمی."),
            d("A", "That's great. How long have you been playing?", "عالی است. چقدر است بازی می‌کنی؟"),
            d("B", "About five years. I'm not very good, but I enjoy it.", "حدود پنج سال. خیلی خوب نیستم، ولی لذت می‌برم."),
            d("A", "That's what matters.", "همین مهم است."),
            d("B", "Exactly. Sports should be fun, not just competitive.", "دقیقاً. ورزش باید سرگرم‌کننده باشد، نه فقط رقابتی."),
            d("A", "What about team sports?", "ورزش‌های تیمی چطور؟"),
            d("B", "I played soccer as a kid. But I prefer individual sports now.", "در کودکی فوتبال بازی کردم. ولی الان ورزش‌های انفرادی را ترجیح می‌دهم."),
            d("A", "Why the change?", "چرا تغییر؟"),
            d("B", "Scheduling. It's easier to play tennis when my schedule is free.", "زمان‌بندی. وقتی برنامه‌ام آزاد است راحت‌تر می‌توانم تنیس بازی کنم."),
            d("A", "That makes sense.", "منطقی است."),
            d("B", "What about you?", "تو چطور؟"),
            d("A", "I run marathons.", "ماراتن می‌دوم."),
            d("B", "Really? That's serious.", "واقعاً؟ این جدی است."),
            d("A", "I've run seven so far. Training for my eighth.", "تا الان هفت تا دویده‌ام. برای هشتمی تمرین می‌کنم."),
            d("B", "That's impressive. What's the hardest part?", "تحسین‌برانگیز است. سخت‌ترین بخشش چیست؟"),
            d("A", "The mental challenge. Your body wants to stop long before you should.", "چالش ذهنی. بدنت خیلی قبل از آنکه باید، می‌خواهد متوقف شود."),
            d("B", "How do you push through?", "چطور عبور می‌کنی؟"),
            d("A", "Focus on the next mile, not the finish line.", "تمرکز روی مایل بعدی، نه خط پایان."),
            d("B", "That's a good approach to many things in life.", "رویکرد خوبی برای بسیاری از چیزها در زندگی است."),
            d("A", "It is. Sports teach you that.", "هست. ورزش این را یادت می‌دهد."),
            d("B", "What's your goal for the next marathon?", "هدفت برای ماراتن بعدی چیست؟"),
            d("A", "Finish under four hours. It's ambitious but achievable.", "زیر چهار ساعت تمام کنم. جاه‌طلبانه ولی قابل دستیابی است."),
            d("B", "Good luck with the training!", "با تمرین موفق باشی!"),
            d("A", "Thanks. Well, I should go. I have a run scheduled.", "ممنون. خب، باید بروم. یک دویدن برنامه‌ریزی‌شده دارم."),
            d("B", "Enjoy it! Talk soon.", "لذت ببر! به‌زودی صحبت."),
            d("A", "Talk soon. Bye!", "به‌زودی صحبت. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did the winning team overcome?", listOf("a red card", "a 20-point halftime deficit", "injuries", "bad weather"), 1),
            q("What quality does B praise about the star player?", listOf("talent", "humility", "speed", "strength"), 1),
            q("What does B say is crucial for sports accessibility?", listOf("only for the wealthy", "accessible to all children", "only for professionals", "expensive equipment"), 1),
            q("What's the biggest downside of professional sports?", listOf("money", "pressure on young athletes", "travel", "media attention"), 1),
            q("What approach does A use during marathons?", listOf("focus on finish line", "focus on next mile", "think about speed", "ignore pain"), 1),
            q("It's important that athletes ___ role models.", listOf("are", "be", "were", "being"), 1),
            q("It's essential that doping ___ strictly punished.", listOf("is", "be", "was", "being"), 1),
            q("___ professional sports are lucrative, many athletes struggle.", listOf("Although", "Because", "Since", "If"), 0),
            q("___ competition is important, sportsmanship matters more.", listOf("While", "Because", "Since", "If"), 0),
            q("___ she lost, she gained respect.", listOf("Even though", "Because", "Since", "If"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Down by", "عقب بودن با", "They were down by twenty points.", "با بیست امتیاز عقب بودند."),
            IdiomExpression("At the end of the day", "در نهایت", "At the end of the day, it's about more than winning.", "در نهایت، درباره بیشتر از بردن است."),
            IdiomExpression("Mixed blessing", "نعمت و نقمت", "It's a mixed blessing.", "نعمت و نقمت است."),
            IdiomExpression("Backup plan", "برنامه پشتیبان", "They need backup plans.", "به برنامه‌های پشتیبان نیاز دارند."),
            IdiomExpression("Look for shortcuts", "دنبال میانبر گشتن", "Some athletes look for shortcuts.", "برخی ورزشکاران دنبال میانبر می‌گردند."),
            IdiomExpression("Push through", "عبور کردن", "How do you push through?", "چطور عبور می‌کنی؟"),
            IdiomExpression("Telling of character", "نشانه شخصیت", "That's telling of character.", "این نشانه شخصیت است.")
        ),
        phrasal = listOf(
            PhrasalVerb("push through", "عبور کردن", "persevere",
                "How do you push through the pain?", "چطور از درد عبور می‌کنی؟", "No"),
            PhrasalVerb("come back", "برگشتن", "return to competition",
                "They came back from behind.", "از عقب برگشتند.", "No"),
            PhrasalVerb("give up", "تسلیم شدن", "quit",
                "Never give up.", "هرگز تسلیم نشو.", "No"),
            PhrasalVerb("make it", "موفق شدن", "succeed",
                "Most don't make it.", "بیشترشان موفق نمی‌شوند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Subjunctive stress", "Stress the base verb: It's important that athletes BE role models."),
            PronunciationTip("Concession intonation", "Use a slight pause after concessive clause: Although it's lucrative, / many struggle."),
            PronunciationTip("Sports terms stress", "Stress first syllable: ATHlete, CHAMpionship, TOURnament.")
        ),
        culture = listOf(
            CulturalNote("Sports and national identity",
                "Sports often become symbols of national pride. International competitions like the Olympics and World Cup bring countries together — and sometimes expose political tensions."),
            CulturalNote("Youth sports",
                "Youth sports participation varies globally. In some countries, it's nearly universal; in others, it's limited by cost or access. Many countries have programs to increase participation among disadvantaged youth."),
            CulturalNote("Sports and social change",
                "Athletes have used their platforms for social change. From Muhammad Ali to Colin Kaepernick, sports figures have taken stands on political and social issues, generating both praise and controversy.")
        ),
        mistakes = listOf(
            CommonMistake("It's important that athletes are role models.", "It's important that athletes be role models.", "Use subjunctive after 'it's important that'."),
            CommonMistake("Although sports is lucrative, athletes struggle.", "Although sports are lucrative, athletes struggle.", "Use plural verb with plural noun."),
            CommonMistake("Even though she lost, but she gained respect.", "Even though she lost, she gained respect.", "Don't use 'but' with 'even though'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What values does B say sports teach?", "Teamwork, discipline, resilience, learning to lose gracefully, and collaboration."),
            ComprehensionQuestion("What is the biggest downside of professional sports according to B?", "Pressure on young athletes who sacrifice childhood for a dream, with most not succeeding."),
            ComprehensionQuestion("How does A handle the mental challenge of marathons?", "By focusing on the next mile, not the finish line.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss the value of sports in society.",
                "درباره ارزش ورزش در جامعه صحبت کن.",
                "It's important that... / Although... / At the end of the day..."),
            SpeakingTask("Talk about an athlete you admire.",
                "درباره ورزشکاری که تحسین می‌کنی صحبت کن.",
                "I admire... / What impresses me is... / His/her legacy..."),
            SpeakingTask("Debate whether professional athletes are paid too much.",
                "بحث کنید که آیا ورزشکاران حرفه‌ای بیش از حد حقوق می‌گیرند.",
                "Granted... / On the other hand... / It's essential that...")
        ),
        writing = listOf(
            WritingTask("Write an essay about the role of sports in modern society.",
                "مقاله‌ای درباره نقش ورزش در جامعه مدرن بنویس.",
                280, "Use the subjunctive after 'it's important/essential that' and phrases of concession.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 10 — Controversial Issues | مسائل بحث‌برانگیز
    // ═══════════════════════════════════════════════════════════
    private fun unit10() = base(
        10, "Controversial Issues", "مسائل بحث‌برانگیز",
        listOf(
            "Discuss controversial issues respectfully",
            "Present arguments and counterarguments",
            "Use concession and refutation",
            "Express disagreement diplomatically",
            "Use cleft sentences for emphasis"
        ),
        listOf(
            v("controversial", "بحث‌برانگیز", "It's a controversial topic.", "موضوع بحث‌برانگیزی است.", "adjective"),
            v("debate", "بحث", "The debate continues in society.", "بحث در جامعه ادامه دارد."),
            v("argument", "استدلال", "Her argument was well-structured.", "استدلالش خوب ساختاریافته بود."),
            v("counterargument", "استدلال متقابل", "He offered a strong counterargument.", "استدلال متقابل قوی‌ای ارائه داد."),
            v("refute", "رد کردن", "She refuted his claims with evidence.", "او ادعاهایش را با شواهد رد کرد.", "verb"),
            v("stance", "موضع", "He took a firm stance on the issue.", "او موضع محکمی درباره مسئله گرفت."),
            v("perspective", "دیدگاه", "There are multiple perspectives.", "دیدگاه‌های متعددی وجود دارند."),
            v("nuance", "تفاوت ظریف", "The issue requires nuance.", "مسئله به تفاوت ظریف نیاز دارد."),
            v("polarizing", "دوقطبی‌کننده", "It's a polarizing issue.", "مسئله دوقطبی‌کننده‌ای است.", "adjective"),
            v("partisan", "حزبی", "The debate has become partisan.", "بحث حزبی شده است.", "adjective"),
            v("moderate", "میانه‌رو", "She has moderate views on the subject.", "او دیدگاه‌های میانه‌رو درباره موضوع دارد.", "adjective"),
            v("radical", "رادیکال", "Radical solutions are often controversial.", "راه‌حل‌های رادیکال اغلب بحث‌برانگیزند.", "adjective"),
            v("compromise", "سازش", "Compromise is often necessary.", "سازش اغلب ضروری است."),
            v("consensus", "اجماع", "Building consensus takes time.", "ساختن اجماع زمان می‌برد."),
            v("polarize", "دوقطبی کردن", "The issue polarized the community.", "مسئله جامعه را دوقطبی کرد.", "verb"),
            v("mainstream", "جریان اصلی", "The idea entered the mainstream.", "ایده وارد جریان اصلی شد.", "adjective"),
            v("fringe", "حاشیه‌ای", "Fringe views don't represent the majority.", "دیدگاه‌های حاشیه‌ای نماینده اکثریت نیستند.", "adjective"),
            v("bias", "سوگیری", "Everyone has some bias.", "همه سوگیری دارند."),
            v("empathy", "همدلی", "Empathy is essential in difficult conversations.", "همدلی در گفت‌وگوهای دشوار ضروری است."),
            v("respectful", "محترمانه", "We can disagree respectfully.", "می‌توانیم محترمانه مخالفت کنیم.", "adjective")
        ),
        listOf(
            GrammarSection(
                "Cleft sentences for emphasis",
                "Use cleft sentences to emphasize a particular element. It's the money that matters most. What surprises me is how quickly things changed. The reason I disagree is that the evidence is weak."
            ),
            GrammarSection(
                "Concession and refutation",
                "Acknowledge the opposing view then refute it. While it's true that costs are high, the long-term benefits outweigh them. Granted, there are risks, but they can be managed. I understand your concern, but the data suggests otherwise."
            ),
            GrammarSection(
                "Conversation strategies for controversial topics",
                "Use 'I see your point, but' to acknowledge then disagree. Use 'Where I disagree is' to specify disagreement. Use 'Let me push back on that' to respectfully challenge. Use 'I think we can agree that' to find common ground."
            )
        ),
        listOf(
            d("A", "Have you been following the debate about remote work?", "بحث درباره کار از راه دور را دنبال کرده‌ای؟"),
            d("B", "A little. It's become really controversial, hasn't it?", "کمی. واقعاً بحث‌برانگیز شده، نه؟"),
            d("A", "Very. Companies want people back in offices. Employees want to stay home.", "خیلی. شرکت‌ها می‌خواهند مردم به دفتر برگردند. کارمندان می‌خواهند خانه بمانند."),
            d("B", "Where do you stand?", "تو کجای ایستاده‌ای؟"),
            d("A", "I'm somewhere in the middle. I think hybrid is the answer.", "جایی در میانه هستم. فکر می‌کنم ترکیبی پاسخ است."),
            d("B", "That's a moderate view. Many people have stronger opinions.", "دیدگاه میانه‌رویی است. بسیاری نظرات قوی‌تری دارند."),
            d("A", "I know. It's become so polarizing.", "می‌دانم. خیلی دوقطبی‌کننده شده."),
            d("B", "What do you think causes the polarization?", "فکر می‌کنی چه چیزی باعث دوقطبی شدن می‌شود؟"),
            d("A", "Different priorities. Managers value control and collaboration. Workers value flexibility.", "اولویت‌های متفاوت. مدیران به کنترل و همکاری اهمیت می‌دهند. کارگران به انعطاف."),
            d("B", "I see your point, but isn't it also about trust?", "نکته‌ات را می‌فهمم، ولی همچنین درباره اعتماد نیست؟"),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "Companies that don't trust employees want them in the office. Companies that do, allow remote.", "شرکت‌هایی که به کارمندان اعتماد ندارند می‌خواهند در دفتر باشند. شرکت‌هایی که اعتماد دارند، از راه دور را مجاز می‌کنند."),
            d("A", "That's an interesting perspective. There's probably some truth to it.", "دیدگاه جالبی است. احتمالاً کمی حقیقت دارد."),
            d("B", "It's the trust that matters most.", "اعتماد است که بیشترین اهمیت را دارد."),
            d("A", "So how do companies build trust?", "پس شرکت‌ها چطور اعتماد می‌سازند؟"),
            d("B", "Clear expectations. Regular communication. Measuring output, not hours.", "انتظارات واضح. ارتباط منظم. اندازه‌گیری خروجی، نه ساعات."),
            d("A", "That makes sense. Some companies do this well.", "منطقی است. برخی شرکت‌ها این را خوب انجام می‌دهند."),
            d("B", "The ones that adapt will attract the best talent.", "آن‌هایی که انطباق پیدا کنند بهترین استعدادها را جذب می‌کنند."),
            d("A", "While it's true that adaptation is key, some jobs can't be done remotely.", "هرچند درست است که انطباق کلیدی است، برخی شغل‌ها نمی‌توانند از راه دور انجام شوند."),
            d("B", "Granted. Manufacturing, healthcare, retail — those need presence.", "مسلماً. تولید، سلامت، خرده‌فروشی — آن‌ها حضور لازم دارند."),
            d("A", "So the debate is really about knowledge workers.", "پس بحث واقعاً درباره کارگران دانشی است."),
            d("B", "Exactly. The issue is more nuanced than headlines suggest.", "دقیقاً. مسئله پیچیده‌تر از آنچه تیترها نشان می‌دهند است."),
            d("A", "What about productivity? Studies seem to contradict each other.", "بهره‌وری چطور؟ مطالعات به نظر می‌رسد یکدیگر را نقض می‌کنند."),
            d("B", "They do. It depends on the industry, the role, the individual.", "همین‌طور است. به صنعت، نقش، فرد بستگی دارد."),
            d("A", "So there's no one-size-fits-all answer.", "پس پاسخ یک‌اندازه برای همه وجود ندارد."),
            d("B", "No. And anyone claiming otherwise is oversimplifying.", "نه. و هر کسی خلافش را ادعا کند ساده‌سازی می‌کند."),
            d("A", "That's refreshing to hear.", "شنیدنش تازه‌کننده است."),
            d("B", "Why?", "چرا؟"),
            d("A", "Because most conversations about this are so polarized. People just yell past each other.", "چون بیشتر گفت‌وگوها درباره این موضوع اینقدر دوقطبی هستند. مردم فقط از کنار هم فریاد می‌زنند."),
            d("B", "Social media made it worse.", "شبکه‌های اجتماعی بدترش کرده‌اند."),
            d("A", "Definitely. Algorithms reward outrage.", "قطعاً. الگوریتم‌ها خشم را پاداش می‌دهند."),
            d("B", "And they show you more of what you already believe.", "و بیشتر از آنچه قبلاً باور داری نشانت می‌دهند."),
            d("A", "Echo chambers.", "اتاق‌های پژواک."),
            d("B", "Exactly. It's hard to have real conversations anymore.", "دقیقاً. دیگر سخت است گفت‌وگوی واقعی داشت."),
            d("A", "Where I disagree is with people who say social media is all bad.", "جایی که مخالفم با افرادی است که می‌گویند شبکه‌های اجتماعی کاملاً بد هستند."),
            d("B", "You think it has benefits?", "فکر می‌کنی مزایایی دارد؟"),
            d("A", "Sure. Connecting activists. Amplifying voices that were ignored. Spreading awareness.", "قطعاً. اتصال فعالان. تقویت صداهایی که نادیده گرفته می‌شدند. گسترش آگاهی."),
            d("B", "Fair point. It's a tool. Depends on how you use it.", "نکته منصفانه‌ای است. یک ابزار است. به نحوه استفاده بستگی دارد."),
            d("A", "Exactly. The problem isn't the technology. It's the incentives.", "دقیقاً. مشکل تکنولوژی نیست. انگیزه‌ها هستند."),
            d("B", "What incentives would you change?", "چه انگیزه‌هایی را تغییر می‌دادی؟"),
            d("A", "Reward quality content, not just engagement. Penalize misinformation.", "پاداش به محتوای با کیفیت، نه فقط تعامل. مجازات اطلاعات نادرست."),
            d("B", "That would require regulation.", "این به مقررات نیاز دارد."),
            d("A", "Or platform accountability. Or both.", "یا پاسخگویی پلتفرم. یا هر دو."),
            d("B", "How do you feel about government regulation of speech?", "درباره تنظیم دولت بر گفتار چه احساسی داری؟"),
            d("A", "It's complicated. There's a fine line between protecting people and censoring.", "پیچیده است. خط باریکی بین محافظت از مردم و سانسور است."),
            d("B", "Very fine. Where does it get crossed in your view?", "خیلی باریک. به نظرت کجا از آن عبور می‌شود؟"),
            d("A", "When governments censor criticism of themselves.", "وقتی دولت‌ها انتقاد از خودشان را سانسور می‌کنند."),
            d("B", "But some limits are necessary, right?", "ولی برخی محدودیت‌ها ضروری هستند، درست است؟"),
            d("A", "Some. Direct incitement to violence, for example. Child exploitation content.", "برخی. تحریک مستقیم به خشونت، مثلاً. محتوای بهره‌کشی از کودکان."),
            d("B", "And hate speech?", "و سخنان نفرت‌آمیز؟"),
            d("A", "That's where it gets murky. Definitions vary widely.", "اینجاست که مبهم می‌شود. تعاریف خیلی متفاوتند."),
            d("B", "The US protects almost all speech. Europe has stricter rules.", "آمریکا تقریباً همه گفتار را محافظت می‌کند. اروپا قوانین سخت‌تری دارد."),
            d("A", "Different cultural histories. Different legal traditions.", "تاریخ‌های فرهنگی متفاوت. سنت‌های حقوقی متفاوت."),
            d("B", "So we can't really universalize the answer.", "پس واقعاً نمی‌توانیم پاسخ را جهانی کنیم."),
            d("A", "Probably not. What works in one country may not work in another.", "احتمالاً نه. آنچه در یک کشور کار می‌کند ممکن است در کشور دیگر کار نکند."),
            d("B", "That's a mature view.", "این نگاه بالغانه‌ای است."),
            d("A", "It's what I've come to believe. Simple answers are usually wrong.", "این چیزی است که به آن رسیده‌ام. پاسخ‌های ساده معمولاً غلطند."),
            d("B", "True. The most important issues are complex.", "درست. مهم‌ترین مسائل پیچیده هستند."),
            d("A", "And they require us to listen more than we speak.", "و ما را ملزم می‌کنند بیشتر از آنکه صحبت کنیم گوش دهیم."),
            d("B", "That's the hardest part.", "این سخت‌ترین بخش است."),
            d("A", "It is. Especially when we feel strongly.", "هست. مخصوصاً وقتی شدیداً حس می‌کنیم."),
            d("B", "What helps you listen better?", "چه چیزی به تو کمک می‌کند بهتر گوش دهی؟"),
            d("A", "Remembering that the other person is not my enemy. They just see things differently.", "یادآوری اینکه طرف مقابل دشمن من نیست. فقط چیزها را متفاوت می‌بیند."),
            d("B", "And that they might be right about something I'm wrong about.", "و اینکه ممکن است در چیزی که من اشتباه می‌کنم حق داشته باشند."),
            d("A", "Exactly. Intellectual humility.", "دقیقاً. فروتنی فکری."),
            d("B", "Beautiful phrase.", "عبارت زیبایی است."),
            d("A", "Thanks. It's what I try to practice.", "ممنون. این چیزی است که سعی می‌کنم تمرین کنم."),
            d("B", "You do it well.", "خوب انجامش می‌دهی."),
            d("A", "So do you. That's why I enjoy our conversations.", "تو هم. برای همین از گفت‌وگوهایمان لذت می‌برم."),
            d("B", "Me too. It's rare to talk about hard topics without it becoming a fight.", "من هم. نادر است صحبت درباره موضوعات سخت بدون تبدیل شدن به دعوا."),
            d("A", "True. Let's keep doing it.", "درست. بیایید ادامه دهیم."),
            d("B", "Deal. Well, I should go. But this was great.", "قبول. خب، باید بروم. ولی این عالی بود."),
            d("A", "It was. Talk soon.", "بود. به‌زودی صحبت."),
            d("B", "Talk soon. Bye!", "به‌زودی صحبت. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is A's stance on remote work?", listOf("fully remote", "fully in-office", "hybrid", "no opinion"), 2),
            q("What does B say is the real issue?", listOf("money", "trust", "technology", "commute time"), 1),
            q("What does B say about productivity studies?", listOf("they all agree", "they contradict each other", "they don't exist", "they're unreliable"), 1),
            q("What does A say is the problem with social media?", listOf("the technology", "the incentives", "the users", "the content"), 1),
            q("What is 'intellectual humility'?", listOf("being smart", "accepting you might be wrong", "avoiding debates", "winning arguments"), 1),
            q("___ the money that matters most.", listOf("It's", "That's", "This is", "There's"), 0),
            q("___ surprises me is how quickly things changed.", listOf("It", "That", "What", "Which"), 2),
            q("___ it's true that costs are high, the benefits outweigh them.", listOf("Because", "While", "Since", "If"), 1),
            q("___, there are risks, but they can be managed.", listOf("Granted", "Because", "Since", "If"), 0),
            q("I see your point, ___ I disagree.", listOf("and", "but", "so", "because"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Where do you stand?", "کجای ایستاده‌ای؟", "Where do you stand on this?", "کجای این ایستاده‌ای؟"),
            IdiomExpression("Push back on", "مقاومت کردن", "Let me push back on that.", "بگذار روی آن مقاومت کنم."),
            IdiomExpression("Echo chamber", "اتاق پژواک", "It's an echo chamber.", "اتاق پژواک است."),
            IdiomExpression("One-size-fits-all", "یک اندازه برای همه", "There's no one-size-fits-all answer.", "پاسخ یک‌اندازه برای همه وجود ندارد."),
            IdiomExpression("Intellectual humility", "فروتنی فکری", "Intellectual humility matters.", "فروتنی فکری مهم است."),
            IdiomExpression("Yell past each other", "از کنار هم فریاد زدن", "People yell past each other.", "مردم از کنار هم فریاد می‌زنند."),
            IdiomExpression("Find common ground", "زمینه مشترک پیدا کردن", "We need to find common ground.", "باید زمینه مشترک پیدا کنیم.")
        ),
        phrasal = listOf(
            PhrasalVerb("push back", "مقاومت کردن", "resist / disagree",
                "Let me push back on that.", "بگذار روی آن مقاومت کنم.", "No"),
            PhrasalVerb("come to", "به چیزی رسیدن", "reach a conclusion",
                "It's what I've come to believe.", "این چیزی است که به آن رسیده‌ام.", "No"),
            PhrasalVerb("put aside", "کنار گذاشتن", "set aside",
                "Put aside your assumptions.", "فرض‌هایت را کنار بگذار.", "Yes"),
            PhrasalVerb("yell past", "از کنار هم فریاد زدن", "talk without listening",
                "People yell past each other.", "مردم از کنار هم فریاد می‌زنند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Cleft sentence stress", "Stress the focused element: It's the MONEY that matters most."),
            PronunciationTip("Concession intonation", "Use rising intonation for concession, falling for main clause: WHILE it's TRUE, the benefits OUTWEIGH them."),
            PronunciationTip("Diplomatic intonation", "Soften disagreement with falling-rising intonation: I see your point ↘↗ but...")
        ),
        culture = listOf(
            CulturalNote("Political discourse",
                "Political discourse varies across cultures. Some value direct confrontation; others prefer indirect communication. Understanding these styles helps navigate cross-cultural discussions."),
            CulturalNote("Free speech globally",
                "Free speech protections vary widely. The US has strong constitutional protections. EU countries balance free speech with other rights. Some countries restrict speech more heavily."),
            CulturalNote("Media literacy",
                "Media literacy — the ability to critically evaluate information — is increasingly important. Schools in many countries now teach it. It helps citizens navigate misinformation and propaganda.")
        ),
        mistakes = listOf(
            CommonMistake("It's the money what matters.", "It's the money that matters.", "Use 'that' in cleft sentences about things."),
            CommonMistake("While it's true that costs are high, but benefits outweigh.", "While it's true that costs are high, benefits outweigh.", "Don't use 'but' with 'while' in concession."),
            CommonMistake("Granted, there are risks, and they can be managed.", "Granted, there are risks, but they can be managed.", "Use 'but' with 'granted' to introduce the counterpoint.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the two sides of the remote work debate?", "Managers value control and collaboration; workers value flexibility. The real issue is trust."),
            ComprehensionQuestion("Why does A think social media polarization is a problem?", "Algorithms reward outrage and create echo chambers, making real conversations difficult."),
            ComprehensionQuestion("What is A's view on government regulation of speech?", "Complex — there's a fine line between protecting people and censoring criticism; some limits are necessary but must be carefully defined.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a controversial issue in a respectful way.",
                "درباره یک مسئله بحث‌برانگیز به روشی محترمانه صحبت کن.",
                "It's true that... / Where I disagree is... / I see your point, but..."),
            SpeakingTask("Present arguments and counterarguments on a social issue.",
                "استدلال‌ها و استدلال‌های متقابل درباره یک مسئله اجتماعی ارائه بده.",
                "Some argue... / However... / Granted..."),
            SpeakingTask("Debate whether social media has more benefits or harms.",
                "بحث کنید که آیا شبکه‌های اجتماعی مزایای بیشتری دارند یا مضرات.",
                "On one hand... / On the other... / It's the incentives that...")
        ),
        writing = listOf(
            WritingTask("Write a balanced essay about a controversial issue.",
                "مقاله‌ای متعادل درباره یک مسئله بحث‌برانگیز بنویس.",
                300, "Use cleft sentences for emphasis, concession, and refutation.")
        )
    )
}