package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Passages 1 — Complete Course Content
 * 12 Units | Upper-Intermediate (B2)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles and grammar points match the official Cambridge Scope & Sequence
 */
object Passages1 {
    const val BOOK_ID = "passages_1"

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
    // UNIT 1 — Friends and family | دوستان و خانواده
    // Lesson A: What kind of person are you?
    // Lesson B: Every family is different.
    // ═══════════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "Friends and family", "دوستان و خانواده",
        listOf(
            "Describe personalities",
            "Express likes and dislikes",
            "Describe personal change",
            "State advantages and disadvantages"
        ),
        listOf(
            v("outgoing", "اجتماعی", "She's very outgoing.", "او خیلی اجتماعی است.", "adj"),
            v("reserved", "کم‌حرف", "He's a bit reserved.", "او کمی کم‌حرف است.", "adj"),
            v("considerate", "با ملاحظه", "That was very considerate of you.", "خیلی با ملاحظه بودی.", "adj"),
            v("easygoing", "سهل‌گیر", "My brother is easygoing.", "برادرم سهل‌گیر است.", "adj"),
            v("stubborn", "لجباز", "She can be stubborn sometimes.", "او گاهی می‌تواند لجباز باشد.", "adj"),
            v("ambitious", "جاه‌طلب", "He's very ambitious.", "او خیلی جاه‌طلب است.", "adj"),
            v("sibling", "خواهر یا برادر", "I have two siblings.", "دو خواهر و برادر دارم."),
            v("extended family", "خانواده گسترده", "My extended family is large.", "خانواده گسترده‌ام بزرگ است."),
            v("get along", "کنار آمدن", "We get along well.", "خوب کنار می‌آییم.", "v"),
            v("look up to", "الگو قرار دادن", "I look up to my father.", "پدرم را الگو قرار می‌دهم.", "v"),
            v("take after", "شبیه بودن", "She takes after her mother.", "او شبیه مادرش است.", "v"),
            v("bond", "پیوند", "They have a strong bond.", "پیوند قوی‌ای دارند."),
            v("supportive", "حمایتگر", "My family is very supportive.", "خانواده‌ام خیلی حمایتگر است.", "adj"),
            v("personality", "شخصیت", "She has a lovely personality.", "شخصیت دوست‌داشتنی‌ای دارد."),
            v("trait", "ویژگی", "Patience is an important trait.", "صبر ویژگی مهمی است.")
        ),
        listOf(
            GrammarSection("Verbs followed by gerunds", "enjoy, avoid, finish, suggest, mind, keep. I enjoy spending time with my family."),
            GrammarSection("Noun clauses after be", "The thing is (that)... The truth is (that)... The problem is (that)..."),
            GrammarSection("Personality collocations", "highly motivated, incredibly patient, quite reserved, a bit stubborn."),
            GrammarSection("Compound family terms", "mother-in-law, stepfather, half-brother, extended family, close-knit family.")
        ),
        listOf(
            d("A", "Hey, Maria! I've been thinking about how people change over time.", "هی، ماریا! به این فکر کرده‌ام که مردم چطور تغییر می‌کنند."),
            d("B", "That's an interesting topic. What made you think about it?", "موضوع جالبی است. چه چیزی باعثش شد؟"),
            d("A", "I saw my cousin last weekend. I hadn't seen him in five years.", "آخر هفته پسرخاله‌ام را دیدم. پنج سال بود ندیده بودمش."),
            d("B", "Wow, five years is a long time. How was he different?", "واو، پنج سال زمان طولانی‌ای است. چطور متفاوت بود؟"),
            d("A", "He used to be really reserved. Now he's so outgoing!", "قبلاً خیلی کم‌حرف بود. الان خیلی اجتماعی است!"),
            d("B", "Really? What changed?", "واقعاً؟ چه چیزی تغییر کرد؟"),
            d("A", "He moved abroad for work. Living alone made him more confident.", "برای کار به خارج رفت. تنها زندگی کردن باعث شد بااعتمادبه‌نفس‌تر شود."),
            d("B", "That's a common story. New environments change people.", "داستان رایجی است. محیط‌های جدید مردم را تغییر می‌دهند."),
            d("A", "The thing is, I feel like I haven't changed at all.", "مسئله این است که حس می‌کنم اصلاً تغییر نکرده‌ام."),
            d("B", "Really? Why do you think that is?", "واقعاً؟ فکر می‌کنی چرا؟"),
            d("A", "I still enjoy the same things. I'm still easygoing.", "هنوز از همان چیزها لذت می‌برم. هنوز سهل‌گیرم."),
            d("B", "Maybe that's a good thing. Stability can be a strength.", "شاید چیز خوبی باشد. ثبات می‌تواند یک نقطه قوت باشد."),
            d("A", "I guess so. But sometimes I wish I were more ambitious.", "حدس می‌زنم. ولی گاهی آرزو می‌کنم جاه‌طلب‌تر بودم."),
            d("B", "Why? You have a good job and great friends.", "چرا؟ شغل خوبی داری و دوستان عالی‌ای."),
            d("A", "I know. The problem is that I don't push myself enough.", "می‌دانم. مشکل این است که به خودم به اندازه کافی فشار نمی‌آورم."),
            d("B", "What would you like to change?", "چه چیزی را دوست داری تغییر دهی؟"),
            d("A", "I'd like to take more risks. Try new things.", "دوست دارم ریسک بیشتری کنم. چیزهای جدید امتحان کنم."),
            d("B", "You should. It's never too late to grow.", "باید بکنی. برای رشد هرگز دیر نیست."),
            d("A", "You're right. What about you? How have you changed?", "حق داری. تو چطور؟ چطور تغییر کرده‌ای؟"),
            d("B", "I've become more patient. I used to get angry easily.", "صبورتر شده‌ام. قبلاً راحت عصبانی می‌شدم."),
            d("A", "What helped you change?", "چه چیزی به تغییرت کمک کرد؟"),
            d("B", "Meditation, mostly. And spending time with my grandmother.", "بیشتر مدیتیشن. و گذراندن وقت با مادربزرگم."),
            d("A", "Your grandmother? How did she help?", "مادربزرگت؟ چطور کمک کرد؟"),
            d("B", "She's the most patient person I know. I look up to her.", "او صبورترین فردی است که می‌شناسم. او را الگو قرار می‌دهم."),
            d("A", "What's she like?", "چطور است؟"),
            d("B", "She's incredibly considerate. She always thinks of others first.", "بی‌نهایت با ملاحظه است. همیشه اول به دیگران فکر می‌کند."),
            d("A", "She sounds amazing. Do you take after her?", "شگفت‌انگیز به نظر می‌رسد. شبیه او هستی؟"),
            d("B", "A bit. I hope so, anyway.", "کمی. امیدوارم، در هر حال."),
            d("A", "Family really shapes who we are.", "خانواده واقعاً ما را شکل می‌دهد."),
            d("B", "It does. What about your family? Are you close?", "هست. خانواده‌ات چطور؟ نزدیک هستید؟"),
            d("A", "Very close. We're a close-knit family.", "خیلی نزدیک. خانواده نزدیکی هستیم."),
            d("B", "That's wonderful. Do you have a big extended family?", "شگفت‌انگیز است. خانواده گسترده بزرگی داری؟"),
            d("A", "Huge. My mother has four siblings.", "بزرگ. مادرم چهار خواهر و برادر دارد."),
            d("B", "So you have a lot of cousins?", "پس پسرخاله و دخترخاله زیادی داری؟"),
            d("A", "Too many to count! But I love it.", "بیش از حد شمارش! ولی عاشقشم."),
            d("B", "Do you have a favorite relative?", "فامیل مورد علاقه‌ای داری؟"),
            d("A", "My uncle. He's the funniest person I know.", "عمویم. او بامزه‌ترین فردی است که می‌شناسم."),
            d("B", "What makes him so funny?", "چه چیزی او را اینقدر بامزه می‌کند؟"),
            d("A", "He tells amazing stories. Everyone loves him.", "داستان‌های شگفت‌انگیزی تعریف می‌کند. همه دوستش دارند."),
            d("B", "He sounds like a great person.", "فرد عالی‌ای به نظر می‌رسد."),
            d("A", "He is. What about your family? Any funny characters?", "هست. خانواده‌ات چطور؟ شخصیت بامزه‌ای دارند؟"),
            d("B", "My aunt. She's incredibly stubborn but also hilarious.", "خاله‌ام. بی‌نهایت لجباز است ولی همچنین خنده‌دار."),
            d("A", "Ha! That's a funny combination.", "ها! ترکیب خنده‌داری است."),
            d("B", "It is. She keeps everyone on their toes.", "هست. همه را سرپا نگه می‌دارد."),
            d("A", "What's the best part of having a big family?", "بهترین بخش داشتن خانواده بزرگ چیست؟"),
            d("B", "Always having someone to talk to. And great parties!", "همیشه کسی برای صحبت کردن داشتن. و مهمانی‌های عالی!"),
            d("A", "The disadvantage is less privacy, though.", "عیبش حریم خصوصی کمتر است، هرچند."),
            d("B", "True. But the advantages outweigh the disadvantages.", "درست. ولی مزایا بر معایب غلبه دارند."),
            d("A", "I agree. Family is everything.", "موافقم. خانواده همه چیز است."),
            d("B", "It is. Well, I should go. Say hi to your uncle for me!", "هست. خب، باید بروم. به عمویت سلام برسان!"),
            d("A", "I will. See you soon!", "می‌رسانم. به‌زودی می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How long since Ali saw his cousin?", listOf("1 year", "3 years", "5 years", "10 years"), 2),
            q("What changed Ali's cousin?", listOf("marriage", "moving abroad", "new job", "therapy"), 1),
            q("Who does Maria look up to?", listOf("her mother", "her father", "her grandmother", "her aunt"), 2),
            q("What is Maria's aunt like?", listOf("shy and quiet", "stubborn but funny", "patient and kind", "ambitious"), 1),
            q("I enjoy ___ time with my family.", listOf("spend", "spending", "to spend", "spent"), 1),
            q("The thing is ___ I haven't changed.", listOf("that", "which", "who", "where"), 0),
            q("She's very ___ . She always thinks of others.", listOf("stubborn", "considerate", "reserved", "ambitious"), 1),
            q("He ___ after his mother.", listOf("takes", "looks", "gets", "goes"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Look up to", "الگو قرار دادن", "I look up to my grandmother.", "مادربزرگم را الگو قرار می‌دهم."),
            IdiomExpression("Take after", "شبیه بودن", "She takes after her mother.", "او شبیه مادرش است."),
            IdiomExpression("Keep on their toes", "سرپا نگه داشتن", "She keeps everyone on their toes.", "همه را سرپا نگه می‌دارد."),
            IdiomExpression("Outweigh", "غلبه داشتن", "The advantages outweigh the disadvantages.", "مزایا بر معایب غلبه دارند.")
        ),
        phrasal = listOf(
            PhrasalVerb("get along", "کنار آمدن", "have a good relationship", "We get along very well.", "خیلی خوب کنار می‌آییم.", "No"),
            PhrasalVerb("look up to", "الگو قرار دادن", "admire", "I look up to my father.", "پدرم را الگو قرار می‌دهم.", "No"),
            PhrasalVerb("take after", "شبیه بودن", "resemble", "She takes after her mother.", "او شبیه مادرش است.", "No"),
            PhrasalVerb("grow apart", "دور شدن از هم", "become distant", "We grew apart after college.", "بعد از دانشگاه از هم دور شدیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Personality adjectives", "OUTgoing, conSIDerate, easyGOing, amBITious."),
            PronunciationTip("Gerund stress", "I ENjoy SPENDing time with my family."),
            PronunciationTip("Noun clauses", "The THING is that... The TRUTH is that...")
        ),
        culture = listOf(
            CulturalNote("Family structures", "Family structures vary widely across cultures — nuclear, extended, and blended families."),
            CulturalNote("Personality change", "People often change personality traits when they move to new environments."),
            CulturalNote("Close-knit families", "Close-knit families gather frequently and support each other emotionally.")
        ),
        mistakes = listOf(
            CommonMistake("I enjoy to spend time with family.", "I enjoy spending time with family.", "Use gerund after 'enjoy'."),
            CommonMistake("She is very much outgoing.", "She is very outgoing.", "Don't use 'much' with adjectives."),
            CommonMistake("He takes after of his mother.", "He takes after his mother.", "Don't use 'of' after 'take after'."),
            CommonMistake("I look up my father.", "I look up to my father.", "Use 'look up to' for admiration.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How did Ali's cousin change?", "He went from reserved to outgoing after moving abroad."),
            ComprehensionQuestion("Who influenced Maria's patience?", "Her grandmother, who is incredibly considerate."),
            ComprehensionQuestion("What's the best part of a big family?", "Always having someone to talk to and great parties.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your personality.", "شخصیتت را توصیف کن.", "I'm... / I tend to be... / People say I'm..."),
            SpeakingTask("Talk about a family member you admire.", "درباره عضوی از خانواده که تحسین می‌کنی صحبت کن.", "I look up to... / She's... / She taught me..."),
            SpeakingTask("Discuss how you've changed.", "درباره اینکه چطور تغییر کرده‌ای صحبت کن.", "I used to... / I've become... / Now I...")
        ),
        writing = listOf(
            WritingTask("Write about a family member and how they influenced you.", "درباره عضوی از خانواده و تأثیرش بر تو بنویس.", 180, "Use gerunds and noun clauses.")
        )
    )
}