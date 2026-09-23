package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object TopNotch3 {
    const val BOOK_ID = "top_notch_3"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> lesson1()
        2 -> lesson2()
        3 -> lesson3()
        4 -> lesson4()
        5 -> lesson5()
        6 -> lesson6()
        7 -> lesson7()
        8 -> lesson8()
        9 -> lesson9()
        10 -> lesson10()
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
    // UNIT 1 — Make Small Talk
    // ═══════════════════════════════════════════════════════════
    private fun lesson1() = base(
        1, "Make Small Talk", "گپ کوچک زدن",
        listOf(
            "Make small talk with strangers in social situations",
            "Use tag questions to confirm information and keep conversation going",
            "Use the past perfect to talk about events before other past events",
            "Discuss etiquette rules across cultures",
            "Use appropriate intonation for tag questions"
        ),
        listOf(
            v("small talk", "گپ کوچک", "Small talk helps break the ice at parties.", "گپ کوچک در مهمانی‌ها به شکستن یخ کمک می‌کند."),
            v("etiquette", "آداب معاشرت", "Every culture has its own etiquette rules.", "هر فرهنگی آداب معاشرت خاص خود را دارد."),
            v("taboo", "تابو", "Discussing salary is often a taboo in social settings.", "بحث درباره حقوق اغلب در محیط‌های اجتماعی تابو است."),
            v("customary", "مرسوم", "It's customary to bring a gift to a dinner party.", "مرسوم است که به مهمانی شام هدیه ببرید."),
            v("guideline", "رهنمود", "Here are some guidelines for making small talk.", "اینجا چند رهنمود برای گپ کوچک زدن است."),
            v("conservative", "محافظه‌کار", "In conservative cultures, certain topics are off-limits.", "در فرهنگ‌های محافظه‌کار، موضوعات خاصی ممنوع هستند."),
            v("aware", "آگاه", "Be aware of cultural differences in conversation.", "از تفاوت‌های فرهنگی در گفت‌وگو آگاه باش."),
            v("rude", "بی‌ادب", "Asking personal questions can be considered rude.", "پرسیدن سؤالات شخصی می‌تواند بی‌ادبانه تلقی شود."),
            v("formal", "رسمی", "Formal introductions are common in business settings.", "معرفی‌های رسمی در محیط‌های کاری رایج است."),
            v("informal", "غیررسمی", "Informal greetings are used among friends.", "سلام‌های غیررسمی بین دوستان استفاده می‌شود."),
            v("definitely", "قطعاً", "That's definitely an interesting topic.", "این قطعاً موضوع جالبی است.", "adverb"),
            v("particular", "خاص", "Is there any particular reason you're asking?", "دلیل خاصی برای پرسیدنت داری؟", "adjective"),
            v("address", "خطاب قرار دادن", "How should I address your parents?", "چطور باید والدینت را خطاب کنم؟", "verb"),
            v("grow up", "بزرگ شدن", "Where did you grow up?", "کجا بزرگ شدی؟", "verb"),
            v("break the ice", "یخ را شکستن", "A funny joke can break the ice at a party.", "یک جوک خنده‌دار می‌تواند یخ مهمانی را بشکند.", "verb")
        ),
        listOf(
            GrammarSection(
                "Tag Questions",
                "Use tag questions to confirm information or keep conversation going. Affirmative statement → negative tag: You're from Canada, aren't you? Negative statement → affirmative tag: You don't like coffee, do you? Special case: I am → aren't I? I'm on time, aren't I?"
            ),
            GrammarSection(
                "Past Perfect",
                "Use the past perfect (had + past participle) for an action that happened before another past action. When I arrived at the party, everyone had already left. She had never been to Japan before last year."
            ),
            GrammarSection(
                "Rising and Falling Intonation for Tag Questions",
                "Use falling intonation when you are fairly sure of the answer (confirming). Use rising intonation when you are unsure and genuinely asking."
            ),
            GrammarSection(
                "Conversation Strategy: Keeping Small Talk Going",
                "Use tag questions, follow-up questions, and active listening expressions like 'Really?', 'That's interesting', and 'I see' to keep conversation flowing."
            )
        ),
        listOf(
            d("A", "Excuse me, is this seat taken?", "ببخشید، این صندلی گرفته شده؟"),
            d("B", "No, please sit down. I'm Daniel, by the way.", "نه، لطفاً بنشین. من دنیل هستم، راستی."),
            d("A", "Nice to meet you, Daniel. I'm Emma. Are you here for the conference too?", "از آشنایی با تو خوشحالم، دنیل. من اِما هستم. تو هم برای کنفرانس اینجایی؟"),
            d("B", "Yes, I am. You're from the London office, aren't you?", "بله. تو از دفتر لندن هستی، نه؟"),
            d("A", "That's right! How did you know?", "درست است! از کجا فهمیدی؟"),
            d("B", "I saw your name on the attendee list. You've been with the company for five years, haven't you?", "اسمت را در لیست شرکت‌کنندگان دیدم. پنج سال است در شرکت هستی، نه؟"),
            d("A", "Actually, it's been six years now. Time flies, doesn't it?", "در واقع، الان شش سال است. زمان سریع می‌گذرد، نه؟"),
            d("B", "It really does. Where did you work before that?", "واقعاً همین‌طور است. قبل از آن کجا کار می‌کردی؟"),
            d("A", "I was at a smaller firm in Manchester. I had worked there for three years before I moved to London.", "در یک شرکت کوچک‌تر در منچستر بودم. سه سال آنجا کار کرده بودم قبل از اینکه به لندن نقل مکان کنم."),
            d("B", "I see. And how do you like London?", "متوجه شدم. لندن را چطور دوست داری؟"),
            d("A", "I love it, though the weather takes some getting used to. You've lived here for a while, haven't you?", "عاشقش هستم، هرچند آب و هوا کمی زمان می‌برد تا عادت کنی. مدتی است اینجا زندگی می‌کنی، نه؟"),
            d("B", "About ten years now. I grew up in the north, but I moved here after university.", "حدود ده سال است. در شمال بزرگ شدم، ولی بعد از دانشگاه به اینجا آمدم."),
            d("A", "That must have been quite a change. Do you ever miss your hometown?", "این باید تغییر بزرگی بوده باشد. دلت برای شهرت تنگ می‌شود؟"),
            d("B", "Sometimes. But I've built a life here. My wife is from London, actually.", "گاهی. ولی اینجا زندگی ساخته‌ام. همسرم اهل لندن است، در واقع."),
            d("A", "Oh, you're married. How long have you been married?", "اوه، متأهلی. چند وقت است ازدواج کرده‌ای؟"),
            d("B", "We've been married for eight years. We have two children.", "هشت سال است ازدواج کرده‌ایم. دو فرزند داریم."),
            d("A", "That's wonderful. What do your children like to do?", "فوق‌العاده است. فرزندانت دوست دارند چه کار کنند؟"),
            d("B", "My son loves football, and my daughter is into art. They keep us busy!", "پسرم عاشق فوتبال است، و دخترم به هنر علاقه دارد. ما را مشغول نگه می‌دارند!"),
            d("A", "I can imagine. Do you get much time for yourself?", "می‌توانم تصور کنم. وقت زیادی برای خودت داری؟"),
            d("B", "Not as much as I'd like, but I try to play tennis on weekends. Do you play any sports?", "آنقدر که دوست دارم نه، ولی سعی می‌کنم آخر هفته‌ها تنیس بازی کنم. ورزشی انجام می‌دهی؟"),
            d("A", "I used to play badminton, but I haven't played in years. Maybe I should start again.", "قبلاً بدمینتون بازی می‌کردم، ولی سال‌هاست بازی نکرده‌ام. شاید باید دوباره شروع کنم."),
            d("B", "You should! It's a great way to stay fit and meet people.", "باید بکنی! روش عالی برای تناسب اندام و آشنا شدن با مردم است."),
            d("A", "You're right. By the way, do you know anyone else from the London office here?", "حق داری. راستی، کسی دیگر از دفتر لندن اینجا می‌شناسی؟"),
            d("B", "Yes, a few people. I'd be happy to introduce you. You'd like that, wouldn't you?", "بله، چند نفر. خوشحال می‌شوم معرفی کنم. دوست داری، نه؟"),
            d("A", "That would be great! Thanks so much.", "عالی می‌شود! خیلی ممنون."),
            d("B", "Of course. Let's grab a coffee first, shall we?", "حتماً. بیا اول قهوه بخوریم، باشه؟"),
            d("A", "Sounds perfect. I'd love that.", "عالی به نظر می‌رسد. خوشحال می‌شوم."),
            d("B", "Great. The coffee stand is right over there, isn't it?", "عالی. غرفه قهوه همان آنجاست، نه؟"),
            d("A", "Yes, it is. Let's go.", "بله. بیا برویم."),
            d("B", "After you.", "شما اول.")
        ),
        listOf(
            q("Where is Emma from?", listOf("Manchester", "London", "New York", "Paris"), 1),
            q("How long has Emma been with the company?", listOf("five years", "six years", "three years", "ten years"), 1),
            q("Where did Emma work before?", listOf("a smaller firm in Manchester", "a company in London", "a university", "a hospital"), 0),
            q("How long has Daniel been married?", listOf("five years", "eight years", "ten years", "three years"), 1),
            q("You're from Canada, ___?", listOf("aren't you", "are you", "don't you", "isn't it"), 0),
            q("She doesn't like coffee, ___?", listOf("does she", "doesn't she", "is she", "isn't she"), 0),
            q("I'm on time, ___?", listOf("am I", "aren't I", "isn't it", "am not I"), 1),
            q("When I arrived, everyone ___ already ___.", listOf("has / left", "had / left", "was / leaving", "did / leave"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Break the ice", "یخ را شکستن", "A joke can break the ice at a party.", "یک جوک می‌تواند یخ مهمانی را بشکند."),
            IdiomExpression("Time flies", "زمان سریع می‌گذرد", "Time flies, doesn't it?", "زمان سریع می‌گذرد، نه؟"),
            IdiomExpression("Takes some getting used to", "کمی زمان می‌برد تا عادت کنی", "The weather takes some getting used to.", "آب و هوا کمی زمان می‌برد تا عادت کنی."),
            IdiomExpression("By the way", "راستی", "By the way, do you know anyone here?", "راستی، کسی را اینجا می‌شناسی؟")
        ),
        phrasal = listOf(
            PhrasalVerb("grow up", "بزرگ شدن", "spend childhood", "Where did you grow up?", "کجا بزرگ شدی؟", "No"),
            PhrasalVerb("get used to", "عادت کردن", "become accustomed to", "The weather takes some getting used to.", "آب و هوا کمی زمان می‌برد تا عادت کنی.", "No"),
            PhrasalVerb("grab a coffee", "قهوه خوردن (سریع)", "get coffee informally", "Let's grab a coffee first.", "بیا اول قهوه بخوریم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Falling intonation in tag questions", "When you're fairly sure, use falling intonation: You're from Canada, aren't you? ↘"),
            PronunciationTip("Rising intonation in tag questions", "When genuinely asking, use rising intonation: You're from Canada, aren't you? ↗")
        ),
        culture = listOf(
            CulturalNote("Small talk topics", "Safe topics for small talk in most English-speaking cultures include weather, work, hobbies, travel, and family. Topics to avoid include salary, politics, religion, and very personal questions."),
            CulturalNote("Etiquette and taboos", "What's considered polite varies across cultures. In some cultures, asking about age or marital status is normal; in others, it's considered rude. Being aware of these differences shows respect.")
        ),
        mistakes = listOf(
            CommonMistake("You're from Canada, isn't it?", "You're from Canada, aren't you?", "The tag must match the subject and verb of the statement."),
            CommonMistake("When I arrived, everyone already left.", "When I arrived, everyone had already left.", "Use past perfect for the earlier past action.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does Emma say about her time in London?", "She loves it but says the weather takes some getting used to."),
            ComprehensionQuestion("What are Daniel's children interested in?", "His son loves football and his daughter is into art.")
        ),
        speaking = listOf(
            SpeakingTask("Practice making small talk with a partner using tag questions.", "با یک دوست گپ کوچک با استفاده از سؤالات ضمیمه تمرین کن.", "You're..., aren't you? / You've..., haven't you? / It's..., isn't it?"),
            SpeakingTask("Discuss which topics are appropriate for small talk in your culture.", "درباره اینکه چه موضوعاتی برای گپ کوچک در فرهنگت مناسب هستند صحبت کن.", "In my culture, it's polite to... / People usually avoid...")
        ),
        writing = listOf(
            WritingTask("Write a short dialogue where two people make small talk at an event.", "یک گفت‌وگوی کوتاه بنویس که دو نفر در یک رویداد گپ کوچک می‌زنند.", 180, "Use at least three tag questions and one past perfect.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 2 — Health Matters
    // ═══════════════════════════════════════════════════════════
    private fun lesson2() = base(
        2, "Health Matters", "مسائل سلامتی",
        listOf(
            "Describe symptoms and health problems",
            "Make a medical or dental appointment",
            "Discuss types of treatments and medications",
            "Use modal verbs for possibility and ability (may, might, could)",
            "Show concern and offer help"
        ),
        listOf(
            v("symptom", "نشانه", "A persistent cough can be a symptom of a cold.", "سرفه مداوم می‌تواند نشانه سرماخوردگی باشد."),
            v("dizzy", "گیج", "She felt dizzy after standing up too quickly.", "بعد از سریع بلند شدن احساس گیجی کرد."),
            v("nauseous", "تهوع‌آور", "The bumpy car ride made her feel nauseous.", "مسیر ناهموار ماشین او را تهوع‌آور کرد."),
            v("weak", "ضعیف", "He felt weak after the flu.", "بعد از آنفولانزا احساس ضعف می‌کرد."),
            v("short of breath", "تنگی نفس", "She was short of breath after climbing the stairs.", "بعد از بالا رفتن از پله‌ها تنگی نفس داشت."),
            v("vomit", "استفراغ کردن", "He sometimes vomits after eating certain foods.", "او گاهی بعد از خوردن غذاهای خاص استفراغ می‌کند."),
            v("cough", "سرفه کردن", "Cover your mouth when you cough.", "هنگام سرفه دهانت را بپوشان."),
            v("sneeze", "عطسه کردن", "Don't forget to cover your mouth when you sneeze.", "فراموش نکن هنگام عطسه دهانت را بپوشانی."),
            v("wheeze", "خس‌خس کردن", "The child wheezed during the asthma attack.", "کودک در حین حمله آسم خس‌خس کرد."),
            v("pain", "درد", "I have a sharp pain in my chest.", "درد تیزی در قفسه سینه‌ام دارم."),
            v("prescription", "نسخه", "The doctor gave me a prescription for antibiotics.", "پزشک برایم نسخه آنتی‌بیوتیک نوشت."),
            v("treatment", "درمان", "The treatment lasted for two weeks.", "درمان دو هفته طول کشید."),
            v("emergency", "اضطرار", "Call an ambulance in case of an emergency.", "در مواقع اضطراری آمبولانس خبر کنید."),
            v("appointment", "قرار ملاقات", "I have a doctor's appointment at three.", "ساعت سه قرار ملاقات پزشک دارم."),
            v("remedy", "راه‌حل / درمان خانگی", "A warm drink is a good remedy for a sore throat.", "نوشیدنی گرم راه‌حل خوبی برای گلودرد است.")
        ),
        listOf(
            GrammarSection("Modal Verbs for Possibility: may, might, could", "Use may, might, or could + base verb to express possibility in the present or future. The doctor may prescribe antibiotics. She might have a fever. It could be just a cold."),
            GrammarSection("Modal Verbs for Ability: be able to", "Use 'be able to' for ability, especially in tenses where 'can' is not used. The treatment might be able to reduce the pain. Will you be able to come to the appointment?"),
            GrammarSection("Expressing Concern and Offering Help", "Use expressions like 'You should see a doctor', 'I'm worried about...', 'Is there anything I can do?', and 'Would you like me to...?' to show concern and offer help."),
            GrammarSection("Conversation Strategy: Describing Symptoms", "Use 'I have a...', 'I've been feeling...', and 'It hurts when...' to describe symptoms clearly to a doctor.")
        ),
        listOf(
            d("A", "You don't look well. Are you okay?", "خوب به نظر نمی‌رسی. حالت خوبه؟"),
            d("B", "Not really. I've been feeling dizzy and nauseous since this morning.", "نه واقعاً. از صبح احساس گیجی و تهوع دارم."),
            d("A", "That sounds terrible. Do you have any other symptoms?", "وحشتناک به نظر می‌رسد. نشانه دیگری داری؟"),
            d("B", "Yes, I've also been coughing a lot. And I feel weak.", "بله، خیلی هم سرفه کرده‌ام. و احساس ضعف می‌کنم."),
            d("A", "Have you taken your temperature?", "دمایت را اندازه گرفته‌ای؟"),
            d("B", "No, I haven't. I don't have a thermometer.", "نه. دماسنج ندارم."),
            d("A", "You might have a fever. You should see a doctor.", "ممکن است تب داشته باشی. باید به پزشک مراجعه کنی."),
            d("B", "You're right. I'll make an appointment.", "حق داری. قرار ملاقات می‌گیرم."),
            d("A", "Would you like me to call the clinic for you?", "می‌خواهی برایت به کلینیک زنگ بزنم؟"),
            d("B", "That would be great, thanks. I feel too weak to talk on the phone.", "عالی می‌شود، ممنون. خیلی ضعیفم که تلفنی صحبت کنم."),
            d("A", "No problem. They can see you at 2:30. Is that okay?", "مشکلی نیست. می‌توانند ساعت ۲:۳۰ ببینندت. خوبه؟"),
            d("B", "Yes, that's fine. Thank you so much.", "بله، خوبه. خیلی ممنون."),
            d("A", "Do you need help getting there?", "برای رسیدن به آنجا کمک لازم داری؟"),
            d("B", "I think I can manage. But could you write down the address?", "فکر می‌کنم بتوانم. ولی می‌توانی آدرس را بنویسی؟"),
            d("A", "Of course. Here you go. It's on Oak Street, near the pharmacy.", "حتماً. بفرما. در خیابان اوک است، نزدیک داروخانه."),
            d("B", "Got it. I'll take a taxi. I don't think I can walk that far.", "متوجه شدم. تاکسی می‌گیرم. فکر نمی‌کنم بتوانم آنقدر پیاده بروم."),
            d("A", "That's a good idea. Do you want me to come with you?", "فکر خوبی است. می‌خواهی با تو بیایم؟"),
            d("B", "No, you've already done so much. I'll be fine.", "نه، تو تا حالا خیلی کار کرده‌ای. خوب خواهم شد."),
            d("A", "Okay, but call me if you need anything. Promise?", "باشه، ولی اگر چیزی لازم داشتی بهم زنگ بزن. قول می‌دهی؟"),
            d("B", "I promise. Thanks for being such a good friend.", "قول می‌دهم. ممنون که چنین دوست خوبی هستی."),
            d("A", "That's what friends are for. Now go rest before your appointment.", "دوست برای همین است. حالا برو قبل از قرار ملاقاتت استراحت کن."),
            d("B", "I will. See you later.", "می‌کنم. بعداً می‌بینمت."),
            d("A", "Text me after you see the doctor, okay?", "بعد از دیدن پزشک پیام بده، باشه؟"),
            d("B", "I will. Bye.", "می‌دهم. خداحافظ."),
            d("A", "Take care!", "مراقب خودت باش!")
        ),
        listOf(
            q("What symptoms does B have?", listOf("headache and fever", "dizzy, nauseous, coughing, weak", "sore throat and sneezing", "chest pain"), 1),
            q("When is B's appointment?", listOf("1:30", "2:00", "2:30", "3:00"), 2),
            q("How will B get to the clinic?", listOf("walk", "bus", "taxi", "friend drives"), 2),
            q("Where is the clinic?", listOf("Main Street", "Oak Street", "Park Avenue", "First Street"), 1),
            q("The doctor ___ prescribe antibiotics.", listOf("may", "is", "does", "has"), 0),
            q("The treatment ___ reduce the pain.", listOf("might be able to", "is able", "can able to", "might can"), 0),
            q("She ___ have a fever. (possibility)", listOf("may", "must", "should", "will"), 0),
            q("You ___ see a doctor if you feel this way.", listOf("should", "are", "do", "have"), 0)
        ),
        idioms = listOf(
            IdiomExpression("That's what friends are for", "دوست برای همین است", "Thanks for helping. That's what friends are for.", "ممنون برای کمکت. دوست برای همین است."),
            IdiomExpression("I can manage", "می‌توانم از عهده برآیم", "I think I can manage.", "فکر می‌کنم بتوانم از عهده برآیم."),
            IdiomExpression("Take care", "مراقب خودت باش", "Take care!", "مراقب خودت باش!"),
            IdiomExpression("Promise?", "قول می‌دهی؟", "Call me if you need anything. Promise?", "اگر چیزی لازم داشتی زنگ بزن. قول می‌دهی؟")
        ),
        phrasal = listOf(
            PhrasalVerb("manage", "از عهده برآمدن", "succeed in doing something", "I think I can manage.", "فکر می‌کنم بتوانم از عهده برآیم.", "No"),
            PhrasalVerb("come with", "همراه شدن با", "accompany someone", "Do you want me to come with you?", "می‌خواهی با تو بیایم؟", "No"),
            PhrasalVerb("write down", "نوشتن", "write on paper", "Could you write down the address?", "می‌توانی آدرس را بنویسی؟", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Showing concern intonation", "Use gentle falling intonation to show concern: Are you okay? ↘"),
            PronunciationTip("Modal verb stress", "Stress the modal verb to emphasize possibility: You MIGHT have a fever.")
        ),
        culture = listOf(
            CulturalNote("Medical appointments", "In many English-speaking countries, you usually need to make an appointment to see a doctor. Walk-in clinics are available for urgent but non-emergency issues."),
            CulturalNote("Showing concern", "Offering help to a sick friend is common, but respecting their independence is also important. Asking 'Would you like me to...?' is a polite way to offer help without being pushy.")
        ),
        mistakes = listOf(
            CommonMistake("The doctor may prescribes antibiotics.", "The doctor may prescribe antibiotics.", "After modal verbs, use the base form of the verb."),
            CommonMistake("She might can come.", "She might be able to come.", "Don't use two modal verbs together. Use 'be able to' after 'might'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What symptoms does B describe?", "Dizzy, nauseous, coughing, and weak."),
            ComprehensionQuestion("How does A help B?", "Calls the clinic, writes down the address, and offers to come along.")
        ),
        speaking = listOf(
            SpeakingTask("Describe symptoms to a partner as if they were a doctor.", "نشانه‌هایت را به یک دوست طوری که انگار پزشک است توصیف کن.", "I have... / I've been feeling... / It hurts when..."),
            SpeakingTask("Practice making a medical appointment by phone.", "تمرین کنید تلفنی قرار ملاقات پزشک بگیرید.", "I'd like to make an appointment... / I've been having... / When is the earliest...?")
        ),
        writing = listOf(
            WritingTask("Write an email to a friend who is sick, showing concern and offering help.", "ایمیلی به یک دوست بیمار بنویس، نگرانی نشان بده و کمک پیشنهاد کن.", 170, "Use modal verbs (may, might, could) and expressions of concern.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 3 — Getting Things Done
    // ═══════════════════════════════════════════════════════════
    private fun lesson3() = base(
        3, "Getting Things Done", "انجام کارها",
        listOf(
            "Talk about getting things done by others",
            "Use the causative (get/have + object + past participle)",
            "Discuss services and errands",
            "Talk about procrastination and time management",
            "Use the passive causative"
        ),
        listOf(
            v("procrastinate", "به تعویق انداختن", "Stop procrastinating and start working!", "دست از به تعویق انداختن بردار و شروع به کار کن!"),
            v("procrastinator", "فرد به تعویق انداز", "He's a chronic procrastinator.", "او یک به تعویق انداز مزمن است."),
            v("organized", "سازمان‌یافته", "She's very organized and never misses deadlines.", "او خیلی سازمان‌یافته است و هرگز ضرب‌الاجل را از دست نمی‌دهد."),
            v("self-motivated", "خودانگیخته", "Self-motivated people don't need to be told what to do.", "افراد خودانگیخته نیازی ندارند به آن‌ها گفته شود چه کار کنند."),
            v("deadline", "ضرب‌الاجل", "The deadline for the project is Friday.", "ضرب‌الاجل پروژه جمعه است."),
            v("errand", "کار روزمره", "I have a few errands to run this afternoon.", "امروز بعدازظهر چند کار روزمره دارم."),
            v("dry-clean", "خشکشویی کردن", "I need to dry-clean my suit.", "باید کت و شلوارم را خشکشویی کنم."),
            v("repair", "تعمیر کردن", "Where can I get my shoes repaired?", "کجا می‌توانم کفش‌هایم را تعمیر کنم؟"),
            v("deliver", "تحویل دادن", "They deliver packages every morning.", "آن‌ها هر صبح بسته‌ها را تحویل می‌دهند."),
            v("frame", "قاب کردن", "I want to get this picture framed.", "می‌خواهم این عکس را قاب کنم."),
            v("lengthen", "بلندتر کردن", "Can you lengthen this skirt?", "می‌توانی این دامن را بلندتر کنی؟"),
            v("shorten", "کوتاه‌تر کردن", "I need to shorten these pants.", "باید این شلوار را کوتاه‌تر کنم."),
            v("copy", "کپی کردن", "Please copy this report for the meeting.", "لطفاً این گزارش را برای جلسه کپی کن."),
            v("lifesaver", "نجات‌دهنده", "You're a lifesaver!", "تو نجات‌دهنده‌ای!"),
            v("owe", "بدهکار بودن", "I owe you one.", "بدهکارت هستم.")
        ),
        listOf(
            GrammarSection("Causative with get + object + infinitive", "Use 'get + object + to + verb' to say one person persuades another to do something. I'll get the waiter to correct the check. They got him to pay for dinner. Did she get her friends to help?"),
            GrammarSection("Causative with have + object + base form", "Use 'have + object + base verb' to say one person directs another to do something. I'll have the mechanic check the car. She had the plumber fix the sink."),
            GrammarSection("Passive Causative: have/get + object + past participle", "Use the passive causative when focusing on the object rather than who did the action. Form: have/get + object + past participle. We had our picture taken. They plan to have the offices painted. We got our picture taken."),
            GrammarSection("Conversation Strategy: Asking for and offering help", "Use expressions like 'Could you...?', 'Would you mind...?', 'I'll take care of it', and 'You're a lifesaver' when asking for or offering help with tasks.")
        ),
        listOf(
            d("A", "Hey, you look stressed. What's going on?", "سلام، استرس داری. چه خبره؟"),
            d("B", "I have so much to do before the conference next week.", "قبل از کنفرانس هفته بعد کارهای زیادی دارم."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "I need to get my suit dry-cleaned, have my presentation printed, and get my picture framed for the display.", "باید کت و شلوارم را خشکشویی کنم، ارائه‌ام را چاپ کنم، و عکسم را برای نمایش قاب کنم."),
            d("A", "That's a lot. Have you done any of it yet?", "زیاد است. تا حالا کدامش را انجام داده‌ای؟"),
            d("B", "Honestly, no. I've been procrastinating.", "صادقانه، نه. به تعویق انداخته‌ام."),
            d("A", "Why? You're usually so organized.", "چرا؟ تو معمولاً خیلی سازمان‌یافته هستی."),
            d("B", "I know. I've been so busy with other things. I just can't seem to get motivated.", "می‌دانم. با چیزهای دیگر خیلی مشغول بوده‌ام. به نظر نمی‌توانم انگیزه بگیرم."),
            d("A", "Well, let's tackle it together. What's the most urgent?", "خب، بیا با هم انجامش دهیم. کدام فوری‌تر است؟"),
            d("B", "The suit. I need it by Thursday.", "کت و شلوار. تا پنجشنبه لازمش دارم."),
            d("A", "Okay. There's a dry cleaner on Main Street. You can get it done in a day.", "باشه. خشکشویی در خیابان مین هست. می‌توانی یک روزه انجامش دهی."),
            d("B", "That's good to know. Do they also repair shoes?", "خوب است که می‌دانم. کفش هم تعمیر می‌کنند؟"),
            d("A", "I'm not sure. But I can call and ask. Do you need shoes repaired too?", "مطمئن نیستم. ولی می‌توانم زنگ بزنم و بپرسم. کفش هم نیاز به تعمیر دارد؟"),
            d("B", "Yes, my favorite pair has a hole in them.", "بله، کفش مورد علاقه‌ام سوراخ شده."),
            d("A", "I'll find out. What about the picture framing?", "متوجه می‌شوم. قاب کردن عکس چطور؟"),
            d("B", "There's a frame shop near my house. I'll get it framed there.", "یک مغازه قاب‌سازی نزدیک خانه‌ام هست. آنجا قابش می‌کنم."),
            d("A", "Good. And the presentation?", "خوبه. و ارائه؟"),
            d("B", "I need to get it printed at the copy shop. But I haven't finished writing it yet.", "باید در کپی‌فروشی چاپش کنم. ولی هنوز نوشتنش را تمام نکرده‌ام."),
            d("A", "How much do you have left?", "چقدر مانده؟"),
            d("B", "About half. I've been putting it off because it's the hardest part.", "حدود نصف. به تعویق انداخته‌ام چون سخت‌ترین قسمت است."),
            d("A", "Why don't you work on it now while I make some calls?", "چرا الان روش کار نمی‌کنی تا من چند تماس بگیرم؟"),
            d("B", "That would be a huge help. You're a lifesaver!", "این کمک بزرگی می‌شود. تو نجات‌دهنده‌ای!"),
            d("A", "That's what friends are for. I'll let you know what I find out.", "دوست برای همین است. خبرت می‌کنم چه پیدا کردم."),
            d("B", "Thanks. I owe you one.", "ممنون. بدهکارت هستم."),
            d("A", "You can buy me coffee later. Now get to work!", "بعداً می‌توانی برایم قهوه بخری. حالا برو سر کار!"),
            d("B", "Deal. I'll start right now.", "قبول. همین الان شروع می‌کنم."),
            d("A", "That's the spirit. I'll be back in an hour.", "همین روحیه را می‌خواهم. یک ساعت دیگر برمی‌گردم."),
            d("B", "Perfect. Thanks again.", "عالی. باز هم ممنون."),
            d("A", "No problem. See you soon.", "مشکلی نیست. به‌زودی می‌بینمت."),
            d("B", "See you. And thanks for kicking me into gear.", "می‌بینمت. و ممنون که به من انگیزه دادی.")
        ),
        listOf(
            q("What does B need to get done?", listOf("suit dry-cleaned, presentation printed, picture framed", "shoes repaired, suit cleaned, report copied", "car fixed, hair cut, suit cleaned", "picture taken, suit bought, report printed"), 0),
            q("Why has B been procrastinating?", listOf("too busy and can't get motivated", "doesn't know where to go", "doesn't have money", "waiting for help"), 0),
            q("What is the most urgent task?", listOf("the presentation", "the suit", "the picture", "the shoes"), 1),
            q("What does A offer to do?", listOf("write the presentation", "make calls and find services", "pay for everything", "drive B around"), 1),
            q("I'll get the waiter ___ the check.", listOf("correct", "to correct", "correcting", "corrected"), 1),
            q("She had the plumber ___ the sink.", listOf("fix", "to fix", "fixing", "fixed"), 0),
            q("We had our picture ___.", listOf("take", "to take", "taking", "taken"), 3),
            q("They plan to have the offices ___.", listOf("paint", "to paint", "painting", "painted"), 3)
        ),
        idioms = listOf(
            IdiomExpression("You're a lifesaver", "نجات‌دهنده‌ای", "You're a lifesaver!", "تو نجات‌دهنده‌ای!"),
            IdiomExpression("I owe you one", "بدهکارت هستم", "I owe you one.", "بدهکارت هستم."),
            IdiomExpression("Kick into gear", "انگیزه دادن", "Thanks for kicking me into gear.", "ممنون که به من انگیزه دادی."),
            IdiomExpression("That's the spirit", "همین روحیه را می‌خواهم", "That's the spirit. Now get to work!", "همین روحیه را می‌خواهم. حالا برو سر کار!")
        ),
        phrasal = listOf(
            PhrasalVerb("put off", "به تعویق انداختن", "postpone", "I've been putting it off.", "به تعویق انداخته‌ام.", "Yes"),
            PhrasalVerb("find out", "فهمیدن", "discover information", "I'll let you know what I find out.", "خبرت می‌کنم چه پیدا کردم.", "No"),
            PhrasalVerb("get to work", "شروع به کار کردن", "begin working", "Now get to work!", "حالا برو سر کار!", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Causative stress", "Stress the past participle in passive causative: We had our picture TAKen."),
            PronunciationTip("Reduction in 'get to'", "In natural speech, 'get to' is often reduced: get t' work → /ɡɛt tə wɜrk/")
        ),
        culture = listOf(
            CulturalNote("Services and errands", "In many English-speaking countries, it's common to pay others to do tasks like dry-cleaning, shoe repair, and picture framing. Convenience is often valued over doing everything yourself."),
            CulturalNote("Procrastination", "Procrastination is a common experience worldwide. Time management strategies like breaking tasks into smaller steps and setting deadlines are often discussed.")
        ),
        mistakes = listOf(
            CommonMistake("I'll get the waiter correct the check.", "I'll get the waiter to correct the check.", "Use 'to + verb' after 'get + object' in the causative."),
            CommonMistake("She had the plumber to fix the sink.", "She had the plumber fix the sink.", "Use the base verb (no 'to') after 'have + object' in the causative.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What tasks does B need to complete?", "Dry-clean suit, repair shoes, frame picture, print presentation."),
            ComprehensionQuestion("How does A help B?", "Makes calls to find services and encourages B to work on the presentation.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a time you procrastinated and how you got motivated.", "درباره زمانی که کارها را به تعویق انداختی و چطور انگیزه گرفتی صحبت کن.", "I kept putting it off because... / What helped me was..."),
            SpeakingTask("Practice asking for help with errands using causative structures.", "تمرین کنید با ساختار causative برای کارهای روزمره کمک بخواهید.", "Can you get someone to...? / I need to have my... / Where can I get...?")
        ),
        writing = listOf(
            WritingTask("Write a to-do list for a busy week and explain how you'll get things done.", "لیست کارهای یک هفته شلوغ را بنویس و توضیح بده چطور انجامشان می‌دهی.", 180, "Use at least four causative structures (get/have + object + past participle).")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 4 — Reading for Pleasure
    // ═══════════════════════════════════════════════════════════
    private fun lesson4() = base(
        4, "Reading for Pleasure", "خواندن برای لذت",
        listOf(
            "Discuss different types of books and reading preferences",
            "Talk about reading habits and favorite authors",
            "Use noun clauses and embedded questions",
            "Use adjective clauses with whose and where",
            "Recommend and discuss books"
        ),
        listOf(
            v("novel", "رمان", "She's reading a historical novel.", "او یک رمان تاریخی می‌خواند."),
            v("fiction", "داستان", "I prefer fiction to non-fiction.", "داستان را به غیرداستان ترجیح می‌دهم."),
            v("non-fiction", "غیرداستانی", "Non-fiction books teach you about real events.", "کتاب‌های غیرداستانی درباره رویدادهای واقعی آموزش می‌دهند."),
            v("biography", "زندگی‌نامه", "I'm reading a biography of Steve Jobs.", "دارم زندگی‌نامه استیو جابز را می‌خوانم."),
            v("autobiography", "خودزندگی‌نامه", "Her autobiography was a bestseller.", "خودزندگی‌نامه‌اش پرفروش شد."),
            v("mystery", "معمایی", "Mystery novels keep you guessing.", "رمان‌های معمایی تو را در حدس نگه می‌دارند."),
            v("plot", "داستان / پیرنگ", "The plot was very unpredictable.", "پیرنگ خیلی غیرقابل پیش‌بینی بود."),
            v("character", "شخصیت", "The main character is very complex.", "شخصیت اصلی خیلی پیچیده است."),
            v("author", "نویسنده", "Who's your favorite author?", "نویسنده مورد علاقه‌ات کیست؟"),
            v("recommend", "توصیه کردن", "I highly recommend this book.", "این کتاب را شدیداً توصیه می‌کنم.", "verb"),
            v("plot twist", "پیچش داستانی", "The plot twist caught me by surprise.", "پیچش داستانی مرا غافلگیر کرد."),
            v("best-seller", "پرفروش", "This book is a best-seller.", "این کتاب پرفروش است."),
            v("chapter", "فصل", "I read one chapter every night.", "هر شب یک فصل می‌خوانم."),
            v("genre", "ژانر", "What genres do you enjoy?", "چه ژانرهایی را دوست داری؟"),
            v("browse", "ورق زدن", "I like to browse in bookstores.", "دوست دارم در کتاب‌فروشی‌ها ورق بزنم.", "verb")
        ),
        listOf(
            GrammarSection("Noun Clauses", "Use noun clauses as subjects or objects. Common forms: that-clauses (I think that reading is important), whether/if clauses (I wonder whether she likes mysteries), and wh-clauses (I don't know what he's reading)."),
            GrammarSection("Embedded Questions", "Embedded questions use statement word order. Direct: What time does the library close? Embedded: Do you know what time the library closes? Direct: Where is the bookstore? Embedded: Can you tell me where the bookstore is?"),
            GrammarSection("Adjective Clauses with whose and where", "Use 'whose' for possession and 'where' for places. The author whose book I read lives in Paris. The bookstore where I shop is closed today."),
            GrammarSection("Conversation Strategy: Recommending and Discussing Books", "Use expressions like 'You should read...', 'It's worth reading', 'It's a page-turner', and 'It didn't really grab me' to discuss books.")
        ),
        listOf(
            d("A", "Hey, I saw you reading during lunch. What's the book?", "سلام، دیدم هنگام ناهار کتاب می‌خواندی. چه کتابی است؟"),
            d("B", "It's a mystery novel. I can't put it down!", "یک رمان معمایی است. نمی‌توانم زمینش بگذارم!"),
            d("A", "Really? Who's the author?", "واقعاً؟ نویسنده‌اش کیست؟"),
            d("B", "Her name is Laura Chen. Do you know her work?", "اسمش لورا چن است. کارش را می‌شناسی؟"),
            d("A", "I'm not sure. What's it about?", "مطمئن نیستم. درباره چیست؟"),
            d("B", "It's about a detective whose partner disappears mysteriously.", "درباره کارآگاهی است که همکارش به شکلی مرموز ناپدید می‌شود."),
            d("A", "That sounds interesting. Is it a page-turner?", "جالب به نظر می‌رسد. کتابی است که نمی‌توانی زمینش بگذاری؟"),
            d("B", "Absolutely. I've been reading it every chance I get.", "قطعاً. هر فرصتی که پیدا می‌کنم می‌خوانمش."),
            d("A", "I've been looking for something new. What genres do you usually read?", "دنبال چیز جدیدی می‌گشتم. معمولاً چه ژانرهایی می‌خوانی؟"),
            d("B", "Mostly mysteries and thrillers. Sometimes I read biographies too.", "بیشتر معمایی و دلهره‌آور. گاهی زندگی‌نامه هم می‌خوانم."),
            d("A", "I prefer non-fiction, especially science and history.", "من غیرداستانی را ترجیح می‌دهم، خصوصاً علم و تاریخ."),
            d("B", "That's a good genre too. Do you know where I can find a good science book?", "آن هم ژانر خوبی است. می‌دانی کجا می‌توانم کتاب علمی خوبی پیدا کنم؟"),
            d("A", "There's a great bookstore on Elm Street. It's where I buy all my books.", "یک کتاب‌فروشی عالی در خیابان الم هست. همان‌جایی است که همه کتاب‌هایم را می‌خرم."),
            d("B", "I'll check it out. Do you know if they have a café?", "بررسی می‌کنم. می‌دانی کافه دارند؟"),
            d("A", "Yes, they do. It's a nice place to read and have coffee.", "بله. جای خوبی برای خواندن و قهوه خوردن است."),
            d("B", "Perfect. I might go this weekend. Do you want to come?", "عالی. شاید این آخر هفته بروم. می‌خواهی بیایی؟"),
            d("A", "I'd love to. What time works for you?", "خیلی دوست دارم. چه ساعتی برایت خوب است؟"),
            d("B", "How about Saturday morning at ten?", "شنبه صبح ساعت ده چطور؟"),
            d("A", "That works. I'll meet you there. Oh, one more thing — can you tell me what the book is called?", "خوبه. آنجا می‌بینمت. اوه، یک چیز دیگر — می‌توانی بگویی اسم کتاب چیست؟"),
            d("B", "It's called 'The Silent Partner'. I think you'd like it.", "«شریک ساکت» نام دارد. فکر می‌کنم دوستش داشته باشی."),
            d("A", "I'll look for it. Thanks for the recommendation!", "دنبالش می‌گردم. ممنون برای توصیه!"),
            d("B", "No problem. Let me know what you think if you read it.", "مشکلی نیست. اگر خواندی خبرم کن چه فکر می‌کنی."),
            d("A", "I will. See you Saturday!", "می‌کنم. شنبه می‌بینمت!"),
            d("B", "See you then!", "تا اون موقع!")
        ),
        listOf(
            q("What is B reading?", listOf("a biography", "a mystery novel", "a science book", "a romance"), 1),
            q("Who is the author of B's book?", listOf("Laura Chen", "Steve Jobs", "Elm Street", "The Silent Partner"), 0),
            q("What kind of books does A prefer?", listOf("mysteries", "thrillers", "non-fiction", "romance"), 2),
            q("Where is the bookstore A recommends?", listOf("on Main Street", "on Elm Street", "near the park", "downtown"), 1),
            q("Do you know what time the library ___?", listOf("closes", "does close", "close", "is closing"), 0),
            q("Can you tell me where the bookstore ___?", listOf("is", "is it", "does it", "it is"), 0),
            q("The author ___ book I read lives in Paris.", listOf("who", "which", "whose", "where"), 2),
            q("The bookstore ___ I shop is closed today.", listOf("which", "that", "whose", "where"), 3)
        ),
        idioms = listOf(
            IdiomExpression("Can't put it down", "نمی‌توانم زمینش بگذارم", "I can't put it down!", "نمی‌توانم زمینش بگذارم!"),
            IdiomExpression("Page-turner", "کتاب جذاب", "Is it a page-turner?", "کتاب جذابی است؟"),
            IdiomExpression("Every chance I get", "هر فرصتی که پیدا می‌کنم", "I read every chance I get.", "هر فرصتی که پیدا می‌کنم می‌خوانم."),
            IdiomExpression("Check it out", "بررسی کردن", "I'll check it out.", "بررسی می‌کنم.")
        ),
        phrasal = listOf(
            PhrasalVerb("look for", "دنبال گشتن", "search for", "I'll look for it.", "دنبالش می‌گردم.", "No"),
            PhrasalVerb("check out", "بررسی کردن", "investigate", "I'll check it out.", "بررسی می‌کنم.", "No"),
            PhrasalVerb("put down", "زمین گذاشتن", "stop reading", "I can't put it down!", "نمی‌توانم زمینش بگذارم!", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Embedded question intonation", "Embedded questions use statement intonation, not question intonation: Do you know what time the library closes? ↘"),
            PronunciationTip("Noun clause linking", "Link 'that' with the next word: I think_that_it's good → /aɪ θɪŋk ðət ɪts ɡʊd/")
        ),
        culture = listOf(
            CulturalNote("Reading culture", "Reading for pleasure is a popular hobby in many English-speaking countries. Book clubs, independent bookstores, and library programs are common ways people share their love of reading."),
            CulturalNote("Genres and preferences", "Discussions about favorite genres and authors are common conversation topics. Recommending books to friends is considered a thoughtful gesture.")
        ),
        mistakes = listOf(
            CommonMistake("Do you know what time does the library close?", "Do you know what time the library closes?", "Embedded questions use statement word order, not question word order."),
            CommonMistake("The author who book I read...", "The author whose book I read...", "Use 'whose' for possession.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is B's book about?", "A detective whose partner disappears mysteriously."),
            ComprehensionQuestion("Where does A recommend going for books?", "A bookstore on Elm Street that has a café.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss your reading preferences with a partner.", "درباره ترجیحات مطالعه‌ات با یک دوست صحبت کن.", "I prefer... / I usually read... / My favorite author is..."),
            SpeakingTask("Recommend a book using noun clauses and embedded questions.", "یک کتاب را با استفاده از جملات اسمی و سؤالات جاسازی‌شده توصیه کن.", "You should read... / Do you know...? / I think that...")
        ),
        writing = listOf(
            WritingTask("Write a book review for a book you've read recently.", "نقدی برای کتابی که اخیراً خوانده‌ای بنویس.", 180, "Use noun clauses, embedded questions, and adjective clauses with whose/where.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 5 — Natural Disasters
    // ═══════════════════════════════════════════════════════════
    private fun lesson5() = base(
        5, "Natural Disasters", "بلایای طبیعی",
        listOf(
            "Discuss natural disasters and their impact",
            "Describe emergency situations and responses",
            "Use indirect speech (say/tell, tense changes)",
            "Report what someone said",
            "Talk about preparedness and safety"
        ),
        listOf(
            v("earthquake", "زمین‌لرزه", "The earthquake measured 6.5 on the Richter scale.", "زمین‌لرزه ۶.۵ ریشتر بود."),
            v("flood", "سیل", "The flood destroyed many homes.", "سیل خانه‌های زیادی را نابود کرد."),
            v("hurricane", "طوفان", "The hurricane is expected to hit the coast tomorrow.", "انتظار می‌رود طوفان فردا به ساحل برسد."),
            v("tornado", "گردباد", "Tornadoes are common in this region.", "گردبادها در این منطقه رایج هستند."),
            v("wildfire", "آتش‌سوزی جنگلی", "The wildfire spread quickly due to strong winds.", "آتش‌سوزی به دلیل بادهای شدید به سرعت گسترش یافت."),
            v("drought", "خشکسالی", "The drought lasted for three years.", "خشکسالی سه سال طول کشید."),
            v("evacuate", "تخلیه کردن", "Residents were asked to evacuate immediately.", "از ساکنان خواسته شد فوراً تخلیه کنند.", "verb"),
            v("shelter", "سرپناه", "They took shelter in a community center.", "آن‌ها در یک مرکز اجتماعی سرپناه گرفتند."),
            v("survivor", "بازمانده", "Survivors were rescued by emergency teams.", "بازماندگان توسط تیم‌های امدادی نجات یافتند."),
            v("rescue", "نجات دادن", "Firefighters rescued three people from the building.", "آتش‌نشانان سه نفر را از ساختمان نجات دادند.", "verb"),
            v("warning", "هشدار", "The weather service issued a tornado warning.", "اداره هواشناسی هشدار گردباد صادر کرد."),
            v("emergency kit", "کیت اضطراری", "Every home should have an emergency kit.", "هر خانه باید یک کیت اضطراری داشته باشد."),
            v("damage", "خسارت", "The storm caused widespread damage.", "طوفان خسارت گسترده‌ای ایجاد کرد."),
            v("impact", "تأثیر", "The impact of the disaster was felt for years.", "تأثیر فاجعه سال‌ها احساس شد."),
            v("preparedness", "آمادگی", "Preparedness can save lives.", "آمادگی می‌تواند جان‌ها را نجات دهد.")
        ),
        listOf(
            GrammarSection("Indirect Speech: Tense Changes", "When reporting speech, tenses usually shift back: Present → Past (I'm tired → He said he was tired), Past → Past Perfect (I saw her → He said he had seen her), Will → Would (I'll help → She said she would help), Can → Could (I can come → He said he could come)."),
            GrammarSection("Indirect Speech: Time and Place Changes", "Time expressions and place words often change: now → then, today → that day, tomorrow → the next day, yesterday → the day before, here → there, this → that."),
            GrammarSection("Say vs Tell", "Use 'say' without an indirect object (He said that...). Use 'tell' with an indirect object (He told me that...)."),
            GrammarSection("Conversation Strategy: Reporting News and Emergencies", "Use expressions like 'Did you hear about...?', 'I heard that...', 'They said that...', and 'Apparently...' to report news and emergencies.")
        ),
        listOf(
            d("A", "Did you hear about the earthquake in the south?", "درباره زمین‌لرزه در جنوب شنیدی؟"),
            d("B", "Yes, I saw it on the news. It was terrible.", "بله، در اخبار دیدم. وحشتناک بود."),
            d("A", "My cousin lives near there. She said the shaking lasted almost a minute.", "پسرخاله‌ام نزدیک آنجا زندگی می‌کند. گفت لرزش تقریباً یک دقیقه طول کشید."),
            d("B", "That must have been terrifying. Did she evacuate?", "این باید ترسناک بوده باشد. تخلیه کرد؟"),
            d("A", "Yes, she did. She told me she went to a shelter downtown.", "بله. به من گفت به یک سرپناه در مرکز شهر رفت."),
            d("B", "I'm glad she's safe. Have there been aftershocks?", "خوشحالم که سالم است. پس‌لرزه‌ای بوده؟"),
            d("A", "She said there had been several small ones, but nothing major.", "گفت چند تا کوچک بوده، ولی چیز مهمی نبوده."),
            d("B", "That's a relief. Do you know how much damage there was?", "این آرامش‌بخش است. می‌دانی چقدر خسارت بوده؟"),
            d("A", "The news reported that hundreds of buildings were damaged.", "اخبار گزارش داد که صدها ساختمان آسیب دیده‌اند."),
            d("B", "That's awful. Were there any casualties?", "وحشتناک است. تلفاتی هم بوده؟"),
            d("A", "Fortunately, not many. The warning system gave people time to evacuate.", "خوشبختانه، زیاد نه. سیستم هشدار به مردم وقت داد تخلیه کنند."),
            d("B", "Thank goodness for that. Do you think we're prepared here?", "خدا را شکر. فکر می‌کنی ما اینجا آماده‌ایم؟"),
            d("A", "Honestly, I'm not sure. I don't even have an emergency kit.", "صادقانه، مطمئن نیستم. حتی کیت اضطراری هم ندارم."),
            d("B", "Neither do I. We should really get one. What should be in it?", "من هم ندارم. واقعاً باید یکی بگیریم. چه چیزهایی باید داشته باشد؟"),
            d("A", "Water, non-perishable food, a flashlight, batteries, a first-aid kit, and important documents.", "آب، غذای فاسد نشدنی، چراغ‌قوه، باتری، جعبه کمک‌های اولیه، و مدارک مهم."),
            d("B", "That makes sense. I'll put one together this weekend.", "منطقی است. این آخر هفته یکی درست می‌کنم."),
            d("A", "Good idea. Also, do you know where the nearest shelter is?", "فکر خوبی است. همچنین، می‌دانی نزدیک‌ترین سرپناه کجاست؟"),
            d("B", "No, I don't. I should find out.", "نه. باید بفهمم."),
            d("A", "My cousin said everyone should know their evacuation route beforehand.", "پسرخاله‌ام گفت همه باید از قبل مسیر تخلیه‌شان را بدانند."),
            d("B", "She's right. Preparedness can save lives.", "حق دارد. آمادگی می‌تواند جان‌ها را نجات دهد."),
            d("A", "Exactly. I'm going to make a plan this week.", "دقیقاً. این هفته برنامه‌ای می‌سازم."),
            d("B", "Let me know if you find good resources. I'd like to do the same.", "اگر منابع خوبی پیدا کردی خبرم کن. من هم می‌خواهم همین کار را بکنم."),
            d("A", "I will. It's better to be safe than sorry.", "می‌کنم. بهتر است احتیاط کنیم تا پشیمان شویم."),
            d("B", "Definitely. I hope we never need to use any of this.", "قطعاً. امیدوارم هرگز لازم نشود از این‌ها استفاده کنیم."),
            d("A", "Me too. But it's good to be ready.", "من هم. ولی خوب است آماده باشیم."),
            d("B", "Absolutely. Thanks for the information.", "قطعاً. ممنون برای اطلاعات."),
            d("A", "No problem. Let's check on each other if anything happens.", "مشکلی نیست. اگر اتفاقی افتاد به هم سر بزنیم."),
            d("B", "Deal. Take care.", "قبول. مراقب خودت باش."),
            d("A", "You too.", "تو هم.")
        ),
        listOf(
            q("Where did the earthquake happen?", listOf("in the north", "in the south", "in the east", "in the west"), 1),
            q("What did A's cousin do?", listOf("stayed home", "went to a shelter", "evacuated to another country", "went to a hospital"), 1),
            q("How long did the shaking last?", listOf("a few seconds", "almost a minute", "five minutes", "an hour"), 1),
            q("What should be in an emergency kit?", listOf("water, food, flashlight, batteries, first-aid kit", "clothes and shoes", "books and toys", "computer and phone"), 0),
            q("I'm tired. → He said he ___ tired.", listOf("is", "was", "were", "be"), 1),
            q("I'll help. → She said she ___ help.", listOf("will", "would", "can", "could"), 1),
            q("He ___ me that he was busy.", listOf("said", "told", "spoke", "talked"), 1),
            q("She said she ___ seen him the day before.", listOf("has", "had", "have", "having"), 1)
        ),
        idioms = listOf(
            IdiomExpression("That's a relief", "این آرامش‌بخش است", "That's a relief. Do you know about the damage?", "این آرامش‌بخش است. از خسارت خبر داری؟"),
            IdiomExpression("Thank goodness", "خدا را شکر", "Thank goodness for that.", "خدا را شکر."),
            IdiomExpression("Better safe than sorry", "احتیاط بهتر از پشیمانی است", "It's better to be safe than sorry.", "بهتر است احتیاط کنیم تا پشیمان شویم."),
            IdiomExpression("Check on", "سر زدن به", "Let's check on each other if anything happens.", "اگر اتفاقی افتاد به هم سر بزنیم.")
        ),
        phrasal = listOf(
            PhrasalVerb("find out", "فهمیدن", "discover information", "I should find out.", "باید بفهمم.", "No"),
            PhrasalVerb("put together", "درست کردن", "assemble", "I'll put one together this weekend.", "این آخر هفته یکی درست می‌کنم.", "Yes"),
            PhrasalVerb("check on", "سر زدن به", "visit to see how someone is", "Let's check on each other.", "به هم سر بزنیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Indirect speech intonation", "In reported speech, the intonation usually falls at the end: He said he was tired. ↘"),
            PronunciationTip("Linking in 'said that'", "Link 'said' with 'that': said_that → /sɛd ðət/")
        ),
        culture = listOf(
            CulturalNote("Disaster preparedness", "In many countries, emergency preparedness is emphasized through public education. Knowing evacuation routes, having an emergency kit, and staying informed are common recommendations."),
            CulturalNote("Reporting news", "When reporting news or emergencies, English speakers often use indirect speech: 'They said that...', 'I heard that...', 'Apparently...'. This softens the statement and shows the source.")
        ),
        mistakes = listOf(
            CommonMistake("He said me that he was busy.", "He told me that he was busy.", "Use 'tell' with an indirect object, not 'say'."),
            CommonMistake("She said she will come.", "She said she would come.", "In indirect speech, 'will' changes to 'would'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did A's cousin say about the earthquake?", "The shaking lasted almost a minute, and she went to a shelter."),
            ComprehensionQuestion("What do A and B decide to do about preparedness?", "Put together emergency kits and make a plan.")
        ),
        speaking = listOf(
            SpeakingTask("Report a news story you heard recently using indirect speech.", "خبری که اخیراً شنیده‌ای را با استفاده از نقل قول غیرمستقیم گزارش کن.", "They said that... / I heard that... / Apparently..."),
            SpeakingTask("Discuss what should be in an emergency kit with a partner.", "درباره اینکه چه چیزهایی باید در کیت اضطراری باشد با یک دوست صحبت کن.", "It should have... / You need... / Don't forget...")
        ),
        writing = listOf(
            WritingTask("Write a news report about a natural disaster using indirect speech.", "گزارش خبری درباره یک بلای طبیعی با استفاده از نقل قول غیرمستقیم بنویس.", 180, "Use indirect speech (say/tell, tense changes) at least four times.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 6 — Life Plans
    // ═══════════════════════════════════════════════════════════
    private fun lesson6() = base(
        6, "Life Plans", "برنامه‌های زندگی",
        listOf(
            "Discuss future plans and life goals",
            "Talk about hopes, dreams, and ambitions",
            "Use perfect modals (could have, might have, should have)",
            "Use wish + past perfect to express regrets",
            "Discuss turning points in life"
        ),
        listOf(
            v("career", "حرفه", "She's focused on her career right now.", "او الان روی حرفه‌اش متمرکز است."),
            v("ambition", "جاه‌طلبی", "His ambition is to become a CEO.", "جاه‌طلبی‌اش این است که مدیرعامل شود."),
            v("turning point", "نقطه عطف", "Moving abroad was a turning point in my life.", "نقل مکان به خارج نقطه عطفی در زندگی من بود."),
            v("achieve", "دست یافتن", "She achieved her goal of running a marathon.", "او به هدفش برای دویدن ماراتن دست یافت.", "verb"),
            v("accomplish", "انجام دادن", "He accomplished everything he set out to do.", "او هر چیزی که قصد انجامش را داشت انجام داد.", "verb"),
            v("milestone", "نقطه عطف", "Graduating was an important milestone.", "فارغ‌التحصیلی نقطه عطف مهمی بود."),
            v("regret", "پشیمانی", "I have no regrets about my choices.", "درباره انتخاب‌هایم پشیمانی ندارم."),
            v("opportunity", "فرصت", "Don't miss this opportunity.", "این فرصت را از دست نده."),
            v("settle down", "ساکن شدن", "They decided to settle down in the countryside.", "آن‌ها تصمیم گرفتند در حومه شهر ساکن شوند.", "verb"),
            v("pursue", "دنبال کردن", "She decided to pursue a career in medicine.", "او تصمیم گرفت حرفه پزشکی را دنبال کند.", "verb"),
            v("fulfilling", "رضایت‌بخش", "Teaching is a fulfilling career.", "تدریس حرفه رضایت‌بخشی است.", "adjective"),
            v("risky", "پرخطر", "Starting a business is risky.", "شروع کسب‌وکار پرخطر است.", "adjective"),
            v("rewarding", "پاداش‌دهنده", "Volunteering is very rewarding.", "داوطلب شدن خیلی پاداش‌دهنده است.", "adjective"),
            v("look back", "به عقب نگاه کردن", "When I look back, I'm happy with my choices.", "وقتی به عقب نگاه می‌کنم، از انتخاب‌هایم راضی هستم.", "verb"),
            v("look forward", "به جلو نگاه کردن", "I look forward to the next chapter of my life.", "منتظر فصل بعدی زندگی‌ام هستم.", "verb")
        ),
        listOf(
            GrammarSection("Perfect Modals: could have, might have, should have", "Use perfect modals to talk about past possibilities and regrets. Could have: It was possible but didn't happen (I could have studied abroad). Might have: It was possible but uncertain (She might have taken the job). Should have: It was a good idea but didn't happen (I should have applied earlier)."),
            GrammarSection("Wish + Past Perfect for Regrets", "Use 'wish + past perfect' to express regret about the past. I wish I had studied harder. She wishes she hadn't quit her job."),
            GrammarSection("If Only", "Use 'if only' for stronger regrets, similar to 'wish + past perfect'. If only I had known! If only she had listened!"),
            GrammarSection("Conversation Strategy: Discussing Life Choices", "Use expressions like 'Looking back...', 'If I had...', 'I wish I had...', and 'It turned out to be...' to discuss past choices and their outcomes.")
        ),
        listOf(
            d("A", "You look thoughtful. What's on your mind?", "متفکر به نظر می‌رسی. چه فکری داری؟"),
            d("B", "I've been thinking about my career lately. I'm not sure I'm on the right path.", "اخیراً به حرفه‌ام فکر کرده‌ام. مطمئن نیستم در مسیر درستی باشم."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "Well, I've been in finance for ten years. But I've always wanted to do something more creative.", "خب، ده سال است در امور مالی هستم. ولی همیشه می‌خواستم کاری خلاقانه‌تر انجام دهم."),
            d("A", "That's a big decision. What would you do instead?", "این تصمیم بزرگی است. به جایش چه کار می‌کردی؟"),
            d("B", "I've thought about becoming a writer. I should have studied literature in university.", "به نویسنده شدن فکر کرده‌ام. باید در دانشگاه ادبیات می‌خواندم."),
            d("A", "It's never too late, you know. I could have gone back to school at forty, but I didn't.", "می‌دانی، هرگز دیر نیست. می‌توانستم چهل سالگی به دانشگاه برگردم، ولی برنگشتم."),
            d("B", "Really? What would you have studied?", "واقعاً؟ چه می‌خواندی؟"),
            d("A", "Photography. I wish I had pursued it when I was younger.", "عکاسی. ای کاش وقتی جوان‌تر بودم دنبالش کرده بودم."),
            d("B", "Why didn't you?", "چرا نکردی؟"),
            d("A", "I was afraid. I might have succeeded, but I was too scared to try.", "می‌ترسیدم. ممکن بود موفق شوم، ولی خیلی ترسیده بودم که تلاش کنم."),
            d("B", "That's understandable. Fear holds a lot of people back.", "قابل درک است. ترس بسیاری را عقب نگه می‌دارد."),
            d("A", "Exactly. So now I tell everyone — don't let fear stop you.", "دقیقاً. پس حالا به همه می‌گویم — نگذار ترس متوقفت کند."),
            d("B", "That's good advice. I wish I had been braver earlier too.", "توصیه خوبی است. ای کاش من هم زودتر شجاع‌تر بودم."),
            d("A", "But you still have time. What's stopping you now?", "ولی هنوز وقت داری. الان چه چیزی متوقفت می‌کند؟"),
            d("B", "I'm worried about money. Starting over is risky.", "نگران پول هستم. شروع دوباره پرخطر است."),
            d("A", "Could you start writing part-time? That way you don't have to quit immediately.", "می‌توانی پاره‌وقت شروع به نوشتن کنی؟ این‌طوری مجبور نیستی فوراً ترک کنی."),
            d("B", "That's actually a great idea. I could write in the evenings and on weekends.", "این در واقع فکر عالی است. می‌توانم شب‌ها و آخر هفته‌ها بنویسم."),
            d("A", "Exactly. And if it works out, you can make the full transition.", "دقیقاً. و اگر خوب پیش رفت، می‌توانی انتقال کامل انجام دهی."),
            d("B", "You're right. I should have thought of this earlier.", "حق داری. باید زودتر به این فکر می‌کردم."),
            d("A", "Better late than never. What kind of writing do you want to do?", "دیر رسیدن بهتر از هرگز نرسیدن است. چه نوع نوشتنی می‌خواهی انجام دهی؟"),
            d("B", "I'd like to write novels. Fiction, probably mysteries.", "دوست دارم رمان بنویسم. داستان، احتمالاً معمایی."),
            d("A", "That's a great genre. You should start with short stories.", "ژانر خوبی است. باید با داستان‌های کوتاه شروع کنی."),
            d("B", "I could do that. Maybe I'll take a writing class first.", "می‌توانم این کار را بکنم. شاید اول یک کلاس نویسندگی بروم."),
            d("A", "That's a smart first step. Let me know how it goes.", "این اولین قدم هوشمندانه است. خبرم کن چطور شد."),
            d("B", "I will. Thanks for the encouragement. I feel much better now.", "می‌کنم. ممنون برای تشویق. الان خیلی بهتر احساس می‌کنم."),
            d("A", "Anytime. Remember — it's your life. Don't live with regrets.", "هر وقت. یادت باشد — این زندگی توست. با پشیمانی زندگی نکن."),
            d("B", "I won't. Thanks again.", "نمی‌کنم. باز هم ممنون."),
            d("A", "Good luck. I'm sure you'll do great.", "موفق باشی. مطمئنم عالی عمل می‌کنی."),
            d("B", "I hope so. See you soon.", "امیدوارم. به‌زودی می‌بینمت."),
            d("A", "See you. Take care.", "می‌بینمت. مراقب خودت باش.")
        ),
        listOf(
            q("How long has B worked in finance?", listOf("five years", "ten years", "fifteen years", "twenty years"), 1),
            q("What does B want to become?", listOf("a photographer", "a writer", "a teacher", "a doctor"), 1),
            q("What does A regret not pursuing?", listOf("writing", "photography", "teaching", "music"), 1),
            q("What advice does A give B?", listOf("quit immediately", "write part-time first", "forget about writing", "take a break"), 1),
            q("I ___ have studied literature.", listOf("should", "would", "will", "am"), 0),
            q("She ___ have succeeded, but she was afraid.", listOf("could", "can", "will", "would"), 0),
            q("I wish I ___ studied harder.", listOf("have", "had", "will have", "have had"), 1),
            q("If only I ___ known!", listOf("have", "had", "will have", "have had"), 1)
        ),
        idioms = listOf(
            IdiomExpression("On your mind", "در ذهنت", "What's on your mind?", "چه فکری داری؟"),
            IdiomExpression("It's never too late", "هرگز دیر نیست", "It's never too late, you know.", "می‌دانی، هرگز دیر نیست."),
            IdiomExpression("Better late than never", "دیر رسیدن بهتر از هرگز نرسیدن", "Better late than never.", "دیر رسیدن بهتر از هرگز نرسیدن است."),
            IdiomExpression("Live with regrets", "با پشیمانی زندگی کردن", "Don't live with regrets.", "با پشیمانی زندگی نکن.")
        ),
        phrasal = listOf(
            PhrasalVerb("hold back", "عقب نگه داشتن", "prevent from progressing", "Fear holds a lot of people back.", "ترس بسیاری را عقب نگه می‌دارد.", "Yes"),
            PhrasalVerb("start over", "شروع دوباره", "begin again", "Starting over is risky.", "شروع دوباره پرخطر است.", "No"),
            PhrasalVerb("work out", "خوب پیش رفتن", "end successfully", "If it works out, you can make the transition.", "اگر خوب پیش رفت، می‌توانی انتقال انجام دهی.", "No"),
            PhrasalVerb("think of", "فکر کردن به", "consider", "I should have thought of this earlier.", "باید زودتر به این فکر می‌کردم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Perfect modal stress", "Stress the modal verb to emphasize regret: I SHOULD have studied harder. I COULD have succeeded."),
            PronunciationTip("Wish + past perfect rhythm", "The stress falls on the past participle: I wish I had STUdied harder.")
        ),
        culture = listOf(
            CulturalNote("Career changes", "Changing careers mid-life is increasingly common in many countries. People often balance financial security with personal fulfillment, pursuing new paths through part-time work or further education."),
            CulturalNote("Regrets and choices", "Every culture has ways of discussing regrets and life choices. In English, expressions like 'wish + past perfect', 'could have', and 'should have' are commonly used to reflect on past decisions.")
        ),
        mistakes = listOf(
            CommonMistake("I should have study harder.", "I should have studied harder.", "After perfect modals, use the past participle."),
            CommonMistake("I wish I studied harder (about past).", "I wish I had studied harder.", "For regrets about the past, use 'wish + past perfect'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What regrets does A share?", "Not going back to school at forty to study photography."),
            ComprehensionQuestion("What advice does A give B about pursuing writing?", "Start part-time by writing in evenings and weekends; take a writing class.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a turning point in your life with a partner.", "درباره یک نقطه عطف در زندگی‌ات با یک دوست صحبت کن.", "It was a turning point because... / Looking back... / I wish I had..."),
            SpeakingTask("Talk about a life goal you have and how you plan to achieve it.", "درباره هدف زندگی‌ات و اینکه چطور می‌خواهی به آن برسی صحبت کن.", "My goal is to... / I'm planning to... / I could... / I should...")
        ),
        writing = listOf(
            WritingTask("Write about a decision you regret and what you would do differently.", "درباره تصمیمی که پشیمان هستی و اینکه چه کار متفاوتی می‌کردی بنویس.", 180, "Use perfect modals (could have, might have, should have) and wish + past perfect.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 7 — Holidays and Traditions
    // ═══════════════════════════════════════════════════════════
    private fun lesson7() = base(
        7, "Holidays and Traditions", "تعطیلات و سنت‌ها",
        listOf(
            "Discuss holidays and traditions from around the world",
            "Describe celebrations and customs",
            "Use adjective clauses with subject and object relative pronouns",
            "Use reflexive pronouns correctly",
            "Compare traditions across cultures"
        ),
        listOf(
            v("tradition", "سنت", "It's a family tradition to eat together on Fridays.", "سنت خانوادگی است که جمعه‌ها با هم غذا بخوریم."),
            v("celebration", "جشن", "The celebration lasted all night.", "جشن تمام شب طول کشید."),
            v("festival", "فستیوال", "The music festival attracts thousands of visitors.", "فستیوال موسیقی هزاران بازدیدکننده جذب می‌کند."),
            v("ceremony", "مراسم", "The wedding ceremony was beautiful.", "مراسم عروسی زیبا بود."),
            v("custom", "رسم", "Shaking hands is a common custom.", "دست دادن رسم رایجی است."),
            v("ritual", "آیین", "Morning coffee is a daily ritual for many people.", "قهوه صبحگاهی آیین روزانه بسیاری است."),
            v("parade", "رژه", "The parade marched through the main street.", "رژه در خیابان اصلی راهپیمایی کرد."),
            v("fireworks", "آتش‌بازی", "We watched the fireworks from the rooftop.", "آتش‌بازی را از پشت‌بام تماشا کردیم."),
            v("gathering", "گردهمایی", "It was a small family gathering.", "گردهمایی کوچک خانوادگی بود."),
            v("honor", "احترام گذاشتن", "We honor our ancestors on this day.", "در این روز به نیاکانمان احترام می‌گذاریم.", "verb"),
            v("symbolize", "نماد بودن", "The candle symbolizes hope.", "شمع نماد امید است.", "verb"),
            v("ancestor", "نیاکان", "Many cultures honor their ancestors.", "بسیاری از فرهنگ‌ها به نیاکانشان احترام می‌گذارند."),
            v("heritage", "میراث", "Cultural heritage should be preserved.", "میراث فرهنگی باید حفظ شود."),
            v("celebrate", "جشن گرفتن", "How do you celebrate New Year?", "سال نو را چطور جشن می‌گیرید؟", "verb"),
            v("observe", "رعایت کردن", "Some families observe religious traditions.", "برخی خانواده‌ها سنت‌های مذهبی را رعایت می‌کنند.", "verb")
        ),
        listOf(
            GrammarSection("Adjective Clauses: Subject Relative Pronouns", "When the relative pronoun is the subject of the clause, it cannot be omitted: The festival that takes place in spring is famous. The people who organize it work all year."),
            GrammarSection("Adjective Clauses: Object Relative Pronouns", "When the relative pronoun is the object of the clause, it can often be omitted: The tradition (that) my family follows is old. The food (which) we eat is traditional."),
            GrammarSection("Reflexive Pronouns", "Use reflexive pronouns (myself, yourself, himself, herself, itself, ourselves, yourselves, themselves) when the subject and object are the same: She prepared herself for the ceremony. We enjoyed ourselves at the festival."),
            GrammarSection("Conversation Strategy: Describing Traditions", "Use expressions like 'It's a tradition to...', 'We usually...', 'It symbolizes...', and 'It dates back to...' to describe traditions and customs.")
        ),
        listOf(
            d("A", "Are you doing anything special for the holidays?", "برای تعطیلات کار خاصی می‌کنی؟"),
            d("B", "Yes, my family is having a big gathering. It's a tradition that we've followed for generations.", "بله، خانواده‌ام گردهمایی بزرگی دارد. سنتی است که نسل‌ها رعایت کرده‌ایم."),
            d("A", "That sounds wonderful. What do you usually do?", "فوق‌العاده به نظر می‌رسد. معمولاً چه کار می‌کنید؟"),
            d("B", "We cook traditional food, exchange gifts, and tell stories about our ancestors.", "غذای سنتی می‌پزیم، هدیه رد و بدل می‌کنیم، و داستان‌های نیاکانمان را تعریف می‌کنیم."),
            d("A", "That's beautiful. Do you have any special rituals?", "زیباست. آیین خاصی دارید؟"),
            d("B", "Yes, we light candles that symbolize hope for the coming year.", "بله، شمع‌هایی روشن می‌کنیم که نماد امید برای سال آینده هستند."),
            d("A", "I love that. In my culture, we have a similar tradition.", "دوستش دارم. در فرهنگ من هم سنت مشابهی داریم."),
            d("B", "Really? Tell me about it.", "واقعاً؟ برایم تعریف کن."),
            d("A", "We celebrate with a big meal that includes special dishes passed down from our grandparents.", "با غذای بزرگی جشن می‌گیریم که شامل غذاهای خاصی است که از پدربزرگ و مادربزرگ‌هایمان به ارث رسیده."),
            d("B", "That sounds delicious. Do you cook everything yourselves?", "خوشمزه به نظر می‌رسد. همه چیز را خودتان می‌پزید؟"),
            d("A", "Yes, we do. Everyone helps. It's a lot of work, but we enjoy ourselves.", "بله. همه کمک می‌کنند. کار زیادی است، ولی خوش می‌گذرانیم."),
            d("B", "That's what makes it special, I think. The shared effort.", "فکر می‌کنم همین خاصش می‌کند. تلاش مشترک."),
            d("A", "Exactly. It's not just about the food — it's about being together.", "دقیقاً. فقط درباره غذا نیست — درباره با هم بودن است."),
            d("B", "Well said. Do you exchange gifts too?", "خوب گفتی. هدیه هم رد و بدل می‌کنید؟"),
            d("A", "Yes, but only small ones. It's more about the thought than the value.", "بله، ولی فقط کوچک. بیشتر به فکر اهمیت دارد تا ارزش."),
            d("B", "That's a nice approach. Sometimes gift-giving gets too commercial.", "رویکرد خوبی است. گاهی هدیه دادن زیادی تجاری می‌شود."),
            d("A", "I agree. The traditions that matter most are the ones that bring people together.", "موافقم. سنت‌هایی که بیشترین اهمیت را دارند آن‌هایی هستند که مردم را کنار هم می‌آورند."),
            d("B", "You're absolutely right. My grandmother always said the same thing.", "کاملاً حق داری. مادربزرگم همیشه همین را می‌گفت."),
            d("A", "She sounds wise. Is she still with you?", "به نظر دانا می‌آید. هنوز با شماست؟"),
            d("B", "Yes, she's 92. She's the one who taught us all these traditions.", "بله، ۹۲ ساله است. او کسی است که همه این سنت‌ها را به ما یاد داد."),
            d("A", "That's a blessing. Traditions passed down like that are precious.", "این نعمت است. سنت‌هایی که این‌طور منتقل می‌شوند ارزشمند هستند."),
            d("B", "They are. I hope to pass them on to my children too.", "هستند. امیدوارم به فرزندانم هم منتقل کنم."),
            d("A", "I'm sure you will. Do you have children?", "مطمئنم می‌کنی. فرزند داری؟"),
            d("B", "Yes, two. They love the holidays, especially the fireworks.", "بله، دو تا. عاشق تعطیلات هستند، خصوصاً آتش‌بازی."),
            d("A", "Fireworks are always a favorite. We have them too.", "آتش‌بازی همیشه محبوب است. ما هم داریم."),
            d("B", "It's amazing how different cultures share similar ways of celebrating.", "شگفت‌انگیز است که فرهنگ‌های مختلف روش‌های مشابهی برای جشن گرفتن دارند."),
            d("A", "That's what I love about learning about other cultures. We're more alike than we think.", "این چیزی است که در یادگیری درباره فرهنگ‌های دیگر دوست دارم. ما بیشتر از آنچه فکر می‌کنیم شبیه هم هستیم."),
            d("B", "So true. Well, I should go help with the preparations.", "خیلی درست. خب، باید بروم کمک آماده‌سازی‌ها."),
            d("A", "Of course. Enjoy your celebration!", "حتماً. از جشنت لذت ببر!"),
            d("B", "Thanks! You too. Happy holidays!", "ممنون! تو هم. تعطیلات مبارک!")
        ),
        listOf(
            q("What tradition does B's family follow?", listOf("lighting candles", "fireworks", "parade", "dancing"), 0),
            q("What does the candle symbolize?", listOf("love", "hope", "peace", "wealth"), 1),
            q("How old is B's grandmother?", listOf("82", "87", "92", "95"), 2),
            q("What does A say matters most in traditions?", listOf("the food", "the gifts", "being together", "the decorations"), 2),
            q("The festival ___ takes place in spring is famous.", listOf("who", "which", "whose", "where"), 1),
            q("The people ___ organize it work all year.", listOf("who", "which", "whose", "where"), 0),
            q("She prepared ___ for the ceremony.", listOf("her", "herself", "hers", "she"), 1),
            q("We enjoyed ___ at the festival.", listOf("us", "ourselves", "our", "we"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Passed down", "منتقل شده", "Special dishes passed down from our grandparents.", "غذاهای خاصی که از پدربزرگ و مادربزرگ‌هایمان به ارث رسیده."),
            IdiomExpression("What makes it special", "چیزی که خاصش می‌کند", "The shared effort is what makes it special.", "تلاش مشترک چیزی است که خاصش می‌کند."),
            IdiomExpression("Well said", "خوب گفتی", "Well said. Do you exchange gifts too?", "خوب گفتی. هدیه هم رد و بدل می‌کنید؟"),
            IdiomExpression("Pass on", "منتقل کردن", "I hope to pass them on to my children.", "امیدوارم به فرزندانم منتقل کنم.")
        ),
        phrasal = listOf(
            PhrasalVerb("pass down", "منتقل کردن (نسل به نسل)", "transmit to the next generation", "Traditions passed down from our grandparents.", "سنت‌هایی که از پدربزرگ و مادربزرگ‌هایمان منتقل شده‌اند.", "Yes"),
            PhrasalVerb("pass on", "منتقل کردن", "give to someone else", "I hope to pass them on to my children.", "امیدوارم به فرزندانم منتقل کنم.", "Yes"),
            PhrasalVerb("go back to", "به ... برگشتن", "originate from", "This tradition goes back to ancient times.", "این سنت به دوران باستان برمی‌گردد.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Reflexive pronoun stress", "Stress the reflexive pronoun for emphasis: She prepared herSELF. We enjoyed ourSELVES."),
            PronunciationTip("Adjective clause rhythm", "Adjective clauses are usually said without pauses: the food that we eat is traditional.")
        ),
        culture = listOf(
            CulturalNote("Traditions around the world", "Every culture has its own holidays and traditions. Many share common themes — honoring ancestors, celebrating harvests, marking new beginnings — but express them in unique ways."),
            CulturalNote("Reflexive pronouns in context", "In English, reflexive pronouns are often used when the subject and object are the same person. They can also add emphasis: 'I made it myself.'")
        ),
        mistakes = listOf(
            CommonMistake("The tradition who we follow is old.", "The tradition that we follow is old.", "Use 'that' or 'which' for things, not 'who'."),
            CommonMistake("She prepared her for the ceremony.", "She prepared herself for the ceremony.", "Use a reflexive pronoun when the subject and object are the same.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are some traditions B's family follows?", "Cooking traditional food, exchanging gifts, telling stories about ancestors, and lighting candles that symbolize hope."),
            ComprehensionQuestion("What does B's grandmother have to do with the traditions?", "She taught the family all these traditions and is 92 years old.")
        ),
        speaking = listOf(
            SpeakingTask("Describe a holiday or tradition from your culture.", "یک تعطیلات یا سنت از فرهنگت را توصیف کن.", "It's a tradition to... / We usually... / It symbolizes..."),
            SpeakingTask("Compare traditions from two different cultures.", "دو سنت از دو فرهنگ مختلف را مقایسه کن.", "In my culture, we... / Similarly, in... / The difference is...")
        ),
        writing = listOf(
            WritingTask("Write about an important holiday or tradition in your culture.", "درباره یک تعطیلات یا سنت مهم در فرهنگت بنویس.", 180, "Use adjective clauses with subject and object relative pronouns, and reflexive pronouns.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 8 — Inventions and Discoveries
    // ═══════════════════════════════════════════════════════════
    private fun lesson8() = base(
        8, "Inventions and Discoveries", "اختراعات و اکتشافات",
        listOf(
            "Discuss important inventions and discoveries",
            "Talk about how things were invented or discovered",
            "Use the unreal conditional (present and past)",
            "Discuss hypothetical situations",
            "Express wonder and speculate about possibilities"
        ),
        listOf(
            v("invention", "اختراع", "The telephone was a revolutionary invention.", "تلفن یک اختراع انقلابی بود."),
            v("discovery", "کشف", "The discovery of penicillin changed medicine.", "کشف پنی‌سیلین پزشکی را تغییر داد."),
            v("inventor", "مخترع", "Who was the inventor of the light bulb?", "مخترع لامپ کی بود؟"),
            v("innovation", "نوآوری", "Innovation drives economic growth.", "نوآوری رشد اقتصادی را هدایت می‌کند."),
            v("revolutionary", "انقلابی", "The internet was a revolutionary development.", "اینترنت یک پیشرفت انقلابی بود.", "adjective"),
            v("patent", "اختراع‌نامه", "He applied for a patent for his design.", "او برای طرحش درخواست اختراع‌نامه داد."),
            v("breakthrough", "پیشرفت بزرگ", "Scientists made a major breakthrough in cancer research.", "دانشمندان پیشرفت بزرگی در تحقیقات سرطان داشتند."),
            v("prototype", "نمونه اولیه", "They built a prototype to test the idea.", "آن‌ها نمونه اولیه‌ای برای آزمایش ایده ساختند."),
            v("impact", "تأثیر", "The invention had a huge impact on society.", "اختراع تأثیر بزرگی بر جامعه داشت."),
            v("develop", "توسعه دادن", "It took years to develop the technology.", "سال‌ها طول کشید تا تکنولوژی را توسعه دهند.", "verb"),
            v("discover", "کشف کردن", "Scientists discovered a new species.", "دانشمندان گونه جدیدی کشف کردند.", "verb"),
            v("experiment", "آزمایش", "The experiment proved the theory.", "آزمایش نظریه را اثبات کرد."),
            v("advancement", "پیشرفت", "Medical advancements have saved millions of lives.", "پیشرفت‌های پزشکی جان میلیون‌ها نفر را نجات داده‌اند."),
            v("influence", "تأثیر", "The invention influenced many other technologies.", "اختراع بر بسیاری از تکنولوژی‌های دیگر تأثیر گذاشت.", "verb"),
            v("era", "عصر", "We live in the digital era.", "ما در عصر دیجیتال زندگی می‌کنیم.")
        ),
        listOf(
            GrammarSection("Unreal Conditional: Present", "Use the second conditional for unreal or hypothetical present/future situations. Form: If + past simple, would + base verb. If I had a million dollars, I would travel the world. If she were here, she would know what to do."),
            GrammarSection("Unreal Conditional: Past", "Use the third conditional for unreal past situations and their imagined results. Form: If + past perfect, would have + past participle. If I had studied medicine, I would have become a doctor. If they hadn't invented the internet, our lives would have been very different."),
            GrammarSection("Mixed Conditional", "Use mixed conditionals when the time in the if-clause and main clause are different. If I had studied harder (past), I would have a better job now (present)."),
            GrammarSection("Conversation Strategy: Speculating and Hypothesizing", "Use expressions like 'What if...?', 'Imagine if...', 'If it hadn't been for...', and 'I wonder what would have happened if...' to speculate about inventions and discoveries.")
        ),
        listOf(
            d("A", "I just read an article about the invention of the telephone.", "تازه مقاله‌ای درباره اختراع تلفن خواندم."),
            d("B", "Really? What did it say?", "واقعاً؟ چه می‌گفت؟"),
            d("A", "It said that if Alexander Graham Bell hadn't invented it, someone else would have.", "می‌گفت اگر الکساندر گراهام بل اختراعش نمی‌کرد، یک نفر دیگر انجامش می‌داد."),
            d("B", "That's an interesting point. Many inventions seem inevitable in hindsight.", "نکته جالبی است. بسیاری از اختراعات در retrospect اجتناب‌ناپذیر به نظر می‌رسند."),
            d("A", "Exactly. Think about it — if the internet had never been developed, how different would our lives be?", "دقیقاً. فکرش را بکن — اگر اینترنت هرگز توسعه نمی‌یافت، زندگی‌مان چقدر متفاوت می‌بود؟"),
            d("B", "That's hard to imagine. I probably wouldn't be doing my job, for one thing.", "تصورش سخت است. برای یک چیز، احتمالاً شغلم را انجام نمی‌دادم."),
            d("A", "Me neither. I work entirely online.", "من هم. کاملاً آنلاین کار می‌کنم."),
            d("B", "What other inventions do you think changed the world the most?", "فکر می‌کنی کدام اختراعات دیگر بیشترین تغییر را در جهان ایجاد کردند؟"),
            d("A", "Electricity, definitely. If we didn't have electricity, almost everything would be different.", "قطعاً برق. اگر برق نداشتیم، تقریباً همه چیز متفاوت می‌بود."),
            d("B", "True. What about medical discoveries?", "درست. کشفیات پزشکی چطور؟"),
            d("A", "Penicillin is a big one. If it hadn't been discovered, millions more people would have died from infections.", "پنی‌سیلین یکی از بزرگ‌ترین‌هاست. اگر کشف نمی‌شد، میلیون‌ها نفر بیشتر از عفونت‌ها می‌مردند."),
            d("B", "That's a powerful thought. It makes you appreciate how far we've come.", "فکر قدرتمندی است. باعث می‌شود قدر پیشرفتمان را بدانیم."),
            d("A", "It does. And it makes me wonder what inventions are still to come.", "همین‌طور است. و باعث می‌شود فکر کنم چه اختراعاتی هنوز در راه هستند."),
            d("B", "What do you think will be the next big breakthrough?", "فکر می‌کنی پیشرفت بزرگ بعدی چه خواهد بود؟"),
            d("A", "Probably something in AI or renewable energy.", "احتمالاً چیزی در هوش مصنوعی یا انرژی تجدیدپذیر."),
            d("B", "I agree. Those areas are advancing so quickly.", "موافقم. آن زمینه‌ها خیلی سریع پیشرفت می‌کنند."),
            d("A", "If I had the chance, I would love to work on something like that.", "اگر فرصت داشتم، دوست داشتم روی چیزی مثل آن کار کنم."),
            d("B", "Why don't you? You have the skills.", "چرا نمی‌کنی؟ مهارت‌هایش را داری."),
            d("A", "I don't know. Maybe I'm afraid of failing.", "نمی‌دانم. شاید از شکست می‌ترسم."),
            d("B", "But if you never try, you'll never know what you could have achieved.", "ولی اگر هرگز تلاش نکنی، هرگز نمی‌دانی چه می‌توانستی به دست آوری."),
            d("A", "You're right. If I had started earlier, I might already be there.", "حق داری. اگر زودتر شروع کرده بودم، شاید الان آنجا بودم."),
            d("B", "It's not too late. Many inventors started late in life.", "دیر نیست. بسیاری از مخترعان دیر در زندگی شروع کردند."),
            d("A", "That's encouraging. Maybe I should look into it.", "این دلگرم‌کننده است. شاید باید بررسی کنم."),
            d("B", "You should. If I were you, I would start with a small project.", "باید بکنی. اگر جای تو بودم، با یک پروژه کوچک شروع می‌کردم."),
            d("A", "That's good advice. Thanks for the push.", "توصیه خوبی است. ممنون برای انگیزه."),
            d("B", "Anytime. Let me know if you need help.", "هر وقت. اگر کمک خواستی خبرم کن."),
            d("A", "I will. Thanks again.", "می‌کنم. باز هم ممنون."),
            d("B", "Good luck!", "موفق باشی!")
        ),
        listOf(
            q("Who invented the telephone according to the article?", listOf("Thomas Edison", "Alexander Graham Bell", "Nikola Tesla", "Samuel Morse"), 1),
            q("What does A think is the most important invention?", listOf("the telephone", "the internet", "electricity", "penicillin"), 2),
            q("What would have happened without penicillin?", listOf("no surgery", "millions more deaths from infections", "no hospitals", "no vaccines"), 1),
            q("What areas does A think will have the next breakthrough?", listOf("transportation and construction", "AI and renewable energy", "food and agriculture", "space and ocean"), 1),
            q("If I ___ a million dollars, I would travel.", listOf("have", "had", "will have", "would have"), 1),
            q("If she ___ here, she would know what to do.", listOf("is", "was", "were", "be"), 2),
            q("If I ___ studied medicine, I would have become a doctor.", listOf("have", "had", "will have", "would have"), 1),
            q("If they hadn't invented the internet, our lives ___ different.", listOf("would be", "would have been", "will be", "are"), 1)
        ),
        idioms = listOf(
            IdiomExpression("In hindsight", "در retrospect", "Many inventions seem inevitable in hindsight.", "بسیاری از اختراعات در retrospect اجتناب‌ناپذیر به نظر می‌رسند."),
            IdiomExpression("For one thing", "برای یک چیز", "I probably wouldn't be doing my job, for one thing.", "برای یک چیز، احتمالاً شغلم را انجام نمی‌دادم."),
            IdiomExpression("How far we've come", "چقدر پیشرفت کرده‌ایم", "It makes you appreciate how far we've come.", "باعث می‌شود قدر پیشرفتمان را بدانیم."),
            IdiomExpression("Look into", "بررسی کردن", "Maybe I should look into it.", "شاید باید بررسی کنم.")
        ),
        phrasal = listOf(
            PhrasalVerb("look into", "بررسی کردن", "investigate", "Maybe I should look into it.", "شاید باید بررسی کنم.", "No"),
            PhrasalVerb("come up with", "به فکر رسیدن", "think of an idea", "They came up with a revolutionary design.", "آن‌ها طرح انقلابی به فکرشان رسید.", "No"),
            PhrasalVerb("start with", "شروع کردن با", "begin with", "I would start with a small project.", "با یک پروژه کوچک شروع می‌کردم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Third conditional stress", "Stress 'would have' and the past participle: If I had STUdied, I would have PASsed."),
            PronunciationTip("Reduction in 'would have'", "In natural speech, 'would have' is often reduced to 'would've': /wʊdəv/")
        ),
        culture = listOf(
            CulturalNote("Inventions that changed the world", "The telephone, electricity, the internet, and penicillin are often cited as the most influential inventions and discoveries in human history. Each transformed society in fundamental ways."),
            CulturalNote("Hypothetical thinking", "Discussing what might have happened if things were different is common in English. It helps people reflect on history, science, and personal choices.")
        ),
        mistakes = listOf(
            CommonMistake("If I would have a million dollars...", "If I had a million dollars...", "Use past simple in the if-clause, not 'would have'."),
            CommonMistake("If she was here...", "If she were here...", "In formal English, use 'were' for all persons in unreal conditionals.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does A say about the invention of the telephone?", "If Bell hadn't invented it, someone else would have."),
            ComprehensionQuestion("What advice does B give A about pursuing innovation?", "Start with a small project; many inventors started late in life.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss which invention you think changed the world the most and why.", "درباره اینکه فکر می‌کنی کدام اختراع بیشترین تغییر را در جهان ایجاد کرد و چرا صحبت کن.", "I think... / If it hadn't been invented... / The impact would have been..."),
            SpeakingTask("Speculate about what the world would be like without a specific technology.", "تصور کن جهان بدون یک تکنولوژی خاص چطور می‌بود.", "If we didn't have... / We would... / It would have been...")
        ),
        writing = listOf(
            WritingTask("Write an essay about an invention that changed the world.", "مقاله‌ای درباره اختراعی که جهان را تغییر داد بنویس.", 200, "Use unreal conditionals (present and past) at least four times.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 9 — Controversial Issues
    // ═══════════════════════════════════════════════════════════
    private fun lesson9() = base(
        9, "Controversial Issues", "مسائل بحث‌برانگیز",
        listOf(
            "Discuss controversial topics respectfully",
            "Express opinions and agree/disagree politely",
            "Use the passive voice with modals",
            "Use expressions for hedging and softening",
            "Debate current issues"
        ),
        listOf(
            v("controversial", "بحث‌برانگیز", "It's a controversial topic with strong opinions on both sides.", "موضوع بحث‌برانگیزی است با نظرات قوی در هر دو طرف.", "adjective"),
            v("debate", "مناظره", "The debate lasted for hours.", "مناظره ساعت‌ها طول کشید."),
            v("argument", "استدلال", "She presented a strong argument.", "او استدلال قوی ارائه داد."),
            v("perspective", "دیدگاه", "From my perspective, it's a complex issue.", "از دیدگاه من، موضوع پیچیده‌ای است."),
            v("issue", "مسئله", "Climate change is a global issue.", "تغییر اقلیم یک مسئله جهانی است."),
            v("advocate", "طرفدار", "She's an advocate for environmental protection.", "او طرفدار حفاظت از محیط زیست است."),
            v("oppose", "مخالفت کردن", "Many people oppose the new law.", "بسیاری با قانون جدید مخالفند.", "verb"),
            v("compromise", "سازش", "Both sides need to compromise.", "هر دو طرف باید سازش کنند.", "verb"),
            v("evidence", "شواهد", "There's strong evidence to support this theory.", "شواهد قوی برای حمایت از این نظریه وجود دارد."),
            v("value", "ارزش", "Different cultures have different values.", "فرهنگ‌های مختلف ارزش‌های متفاوتی دارند."),
            v("sensitive", "حساس", "It's a sensitive topic that requires care.", "موضوع حساسی است که نیاز به دقت دارد.", "adjective"),
            v("respectful", "محترمانه", "We can disagree while remaining respectful.", "می‌توانیم مخالف باشیم ولی محترم بمانیم.", "adjective"),
            v("persuade", "متقاعد کردن", "He tried to persuade me to change my mind.", "او سعی کرد مرا متقاعد کند نظرم را عوض کنم.", "verb"),
            v("stance", "موضع", "What's your stance on this issue?", "موضع تو در این موضوع چیست؟"),
            v("open-minded", "روشن‌فکر", "Try to be open-minded about other views.", "سعی کن درباره دیدگاه‌های دیگر روشن‌فکر باشی.", "adjective")
        ),
        listOf(
            GrammarSection("Passive Voice with Modals", "Use passive with modals: modal + be + past participle. The issue should be discussed calmly. The law might be changed. The problem can be solved."),
            GrammarSection("Passive with Modal Perfects", "Use modal + have + been + past participle for past possibilities: The mistake could have been avoided. The situation should have been handled differently."),
            GrammarSection("Hedging and Softening Expressions", "Use hedging to soften statements: 'It seems to me...', 'I could be wrong, but...', 'I tend to think...', 'There's some evidence that...', 'To some extent...'."),
            GrammarSection("Conversation Strategy: Agreeing and Disagreeing Politely", "Use expressions like 'I see your point, but...', 'That's a valid concern', 'I'm not sure I agree', and 'We'll have to agree to disagree' to discuss controversial topics respectfully.")
        ),
        listOf(
            d("A", "Have you been following the debate about remote work?", "بحث درباره دورکاری را دنبال کرده‌ای؟"),
            d("B", "A little. It's certainly a controversial topic.", "کمی. قطعاً موضوع بحث‌برانگیزی است."),
            d("A", "It is. What's your stance?", "هست. موضع تو چیست؟"),
            d("B", "I tend to think it should be allowed more often. It seems to help with work-life balance.", "میل دارم فکر کنم باید بیشتر اجازه داده شود. به نظر می‌رسد به تعادل کار و زندگی کمک می‌کند."),
            d("A", "I see your point, but I'm not sure it works for every job.", "نکته‌ات را می‌فهمم، ولی مطمئن نیستم برای هر شغلی کار کند."),
            d("B", "That's a valid concern. Some jobs definitely require being on-site.", "نگرانی معتبری است. برخی مشاغل قطعاً نیاز به حضور در محل دارند."),
            d("A", "Exactly. The issue should be considered case by case.", "دقیقاً. موضوع باید مورد به مورد بررسی شود."),
            d("B", "I could be wrong, but I think companies that offer flexibility tend to have happier employees.", "ممکن است اشتباه کنم، ولی فکر می‌کنم شرکت‌هایی که انعطاف ارائه می‌دهند کارمندان شادتری دارند."),
            d("A", "There's some evidence for that. But productivity is also a concern.", "شواهدی برای این وجود دارد. ولی بهره‌وری هم نگرانی است."),
            d("B", "True. Studies have shown mixed results on that.", "درست. مطالعات نتایج متفاوتی در آن نشان داده‌اند."),
            d("A", "What about team collaboration? Some say it suffers with remote work.", "همکاری تیمی چطور؟ برخی می‌گویند با دورکاری آسیب می‌بیند."),
            d("B", "That's a fair point. But many companies have found ways to make it work.", "نکته منصفانه‌ای است. ولی بسیاری از شرکت‌ها راه‌هایی برای موفقیت پیدا کرده‌اند."),
            d("A", "I suppose. The problem can be solved with better technology and processes.", "فرض می‌کنم. مشکل می‌تواند با تکنولوژی و فرآیندهای بهتر حل شود."),
            d("B", "Exactly. It's not about whether remote work is good or bad. It's about how it's implemented.", "دقیقاً. بحث این نیست که دورکاری خوب است یا بد. بحث این است که چطور اجرا می‌شود."),
            d("A", "That's a mature perspective. Too often these debates become black and white.", "دیدگاه پخته‌ای است. اغلب این بحث‌ها سیاه و سفید می‌شوند."),
            d("B", "You're right. Most issues are more nuanced than they appear at first.", "حق داری. بیشتر موضوعات پیچیده‌تر از آنچه اول به نظر می‌رسند هستند."),
            d("A", "Well said. So, if you had to choose — remote, office, or hybrid?", "خوب گفتی. اگر باید انتخاب کنی — دورکاری، دفتر، یا ترکیبی؟"),
            d("B", "Hybrid, without a doubt. It offers the best of both worlds.", "ترکیبی، بدون شک. بهترین هر دو دنیا را ارائه می‌دهد."),
            d("A", "I agree with that. A mix seems like the most balanced approach.", "موافقم. ترکیب به نظر متعادل‌ترین رویکرد است."),
            d("B", "It also allows for individual preferences. Some people thrive at home; others need the office.", "همچنین به ترجیحات فردی اجازه می‌دهد. برخی در خانه شکوفا می‌شوند؛ برخی به دفتر نیاز دارند."),
            d("A", "Exactly. A one-size-fits-all approach rarely works.", "دقیقاً. رویکرد یک‌اندازه برای همه به‌ندرت کار می‌کند."),
            d("B", "So we agree, then?", "پس موافقیم؟"),
            d("A", "On this, yes. But I'm sure we could find other topics to disagree about!", "در این، بله. ولی مطمئنم می‌توانیم موضوعات دیگری برای مخالفت پیدا کنیم!"),
            d("B", "Probably! That's what makes conversation interesting.", "احتمالاً! همین گفت‌وگو را جالب می‌کند."),
            d("A", "As long as we stay respectful, I'm happy to debate anything.", "تا وقتی محترم بمانیم، خوشحالم درباره هر چیزی بحث کنم."),
            d("B", "I couldn't agree more. Respect is key.", "کاملاً موافقم. احترام کلید است."),
            d("A", "Well said. Let's continue this over coffee sometime.", "خوب گفتی. بیا یک وقت این را سر قهوه ادامه دهیم."),
            d("B", "Deal. See you soon.", "قبول. به‌زودی می‌بینمت."),
            d("A", "See you.", "می‌بینمت.")
        ),
        listOf(
            q("What topic are A and B debating?", listOf("climate change", "remote work", "education", "healthcare"), 1),
            q("What is B's initial stance?", listOf("against remote work", "in favor of remote work", "neutral", "undecided"), 1),
            q("What concern does A raise?", listOf("salary", "team collaboration", "commuting", "office space"), 1),
            q("What solution do they both agree on?", listOf("fully remote", "fully office", "hybrid", "no change"), 2),
            q("The issue ___ be discussed calmly.", listOf("should", "is", "does", "has"), 0),
            q("The law might ___ changed.", listOf("be", "is", "been", "being"), 0),
            q("The mistake could have ___ avoided.", listOf("be", "been", "being", "is"), 1),
            q("The situation should have ___ handled differently.", listOf("be", "been", "being", "is"), 1)
        ),
        idioms = listOf(
            IdiomExpression("I see your point, but...", "نکته‌ات را می‌فهمم، ولی...", "I see your point, but I'm not sure.", "نکته‌ات را می‌فهمم، ولی مطمئن نیستم."),
            IdiomExpression("A valid concern", "نگرانی معتبری", "That's a valid concern.", "نگرانی معتبری است."),
            IdiomExpression("Best of both worlds", "بهترین هر دو دنیا", "Hybrid offers the best of both worlds.", "ترکیبی بهترین هر دو دنیا را ارائه می‌دهد."),
            IdiomExpression("I couldn't agree more", "کاملاً موافقم", "I couldn't agree more.", "کاملاً موافقم.")
        ),
        phrasal = listOf(
            PhrasalVerb("bring up", "مطرح کردن", "mention a topic", "She brought up an important point.", "او نکته مهمی را مطرح کرد.", "Yes"),
            PhrasalVerb("agree to disagree", "قبول اختلاف نظر", "accept different opinions", "We'll have to agree to disagree.", "باید اختلاف نظر را قبول کنیم.", "No"),
            PhrasalVerb("work for", "مناسب بودن برای", "be suitable for", "It doesn't work for every job.", "برای هر شغلی مناسب نیست.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Hedging intonation", "Hedging expressions often have rising intonation to sound less certain: I could be wrong... ↗"),
            PronunciationTip("Emphatic stress in agreement", "Stress the intensifier: I couldn't agree MORE.")
        ),
        culture = listOf(
            CulturalNote("Discussing controversial topics", "In many English-speaking cultures, respectful debate is valued. Using hedging expressions and acknowledging the other person's view helps keep discussions productive. Topics like politics, religion, and personal values can be sensitive."),
            CulturalNote("Agreeing to disagree", "When two people can't reach agreement, 'agreeing to disagree' is a common and polite way to end a debate while maintaining respect.")
        ),
        mistakes = listOf(
            CommonMistake("The issue should discussed.", "The issue should be discussed.", "Use 'be' + past participle in passive with modals."),
            CommonMistake("The mistake could have avoided.", "The mistake could have been avoided.", "Use 'have been' + past participle in passive modal perfects.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is A's concern about remote work?", "That it may not work for every job and may affect team collaboration."),
            ComprehensionQuestion("What solution do A and B both agree on?", "A hybrid approach, which offers the best of both worlds.")
        ),
        speaking = listOf(
            SpeakingTask("Discuss a controversial topic with a partner using respectful language.", "درباره یک موضوع بحث‌برانگیز با یک دوست با زبان محترمانه صحبت کن.", "I see your point, but... / That's a valid concern / I couldn't agree more"),
            SpeakingTask("Practice agreeing to disagree about a topic.", "تمرین کنید درباره یک موضوع به اختلاف نظر رسیدن را قبول کنید.", "We'll have to agree to disagree. / Let's continue this another time.")
        ),
        writing = listOf(
            WritingTask("Write an essay discussing both sides of a controversial issue.", "مقاله‌ای بنویس که هر دو طرف یک موضوع بحث‌برانگیز را بررسی کند.", 200, "Use passive voice with modals and hedging expressions.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 10 — Beautiful World
    // ═══════════════════════════════════════════════════════════
    private fun lesson10() = base(
        10, "Beautiful World", "دنیای زیبا",
        listOf(
            "Describe natural wonders and beautiful places",
            "Discuss environmental issues and conservation",
            "Use participle clauses",
            "Use inverted conditionals",
            "Express appreciation for nature and beauty"
        ),
        listOf(
            v("wonder", "شگفتی", "The Grand Canyon is a natural wonder.", "گرند کنیون یک شگفتی طبیعی است."),
            v("landscape", "منظره", "The landscape was breathtaking.", "منظره نفس‌گیر بود."),
            v("breathtaking", "نفس‌گیر", "The view from the top was breathtaking.", "منظره از بالا نفس‌گیر بود.", "adjective"),
            v("preserve", "حفظ کردن", "We must preserve these natural areas.", "باید این مناطق طبیعی را حفظ کنیم.", "verb"),
            v("conservation", "حفاظت", "Wildlife conservation is crucial.", "حفاظت از حیات وحش حیاتی است."),
            v("endangered", "در خطر انقراض", "Many species are endangered.", "بسیاری از گونه‌ها در خطر انقراض هستند.", "adjective"),
            v("sustainable", "پایدار", "We need sustainable solutions.", "به راه‌حل‌های پایدار نیاز داریم.", "adjective"),
            v("eco-friendly", "سازگار با محیط زیست", "Eco-friendly products are becoming popular.", "محصولات سازگار با محیط زیست محبوب می‌شوند.", "adjective"),
            v("pollution", "آلودگی", "Air pollution is a major problem in cities.", "آلودگی هوا مشکل بزرگی در شهرهاست."),
            v("climate change", "تغییر اقلیم", "Climate change affects everyone.", "تغییر اقلیم همه را تحت تأثیر قرار می‌دهد."),
            v("wildlife", "حیات وحش", "The park protects local wildlife.", "پارک از حیات وحش محلی محافظت می‌کند."),
            v("natural resource", "منبع طبیعی", "Water is a precious natural resource.", "آب یک منبع طبیعی ارزشمند است."),
            v("renewable", "تجدیدپذیر", "Solar energy is renewable.", "انرژی خورشیدی تجدیدپذیر است.", "adjective"),
            v("awareness", "آگاهی", "We need to raise awareness about these issues.", "باید درباره این مسائل آگاهی‌بخشی کنیم."),
            v("grateful", "سپاسگزار", "I'm grateful for the beauty of nature.", "برای زیبایی طبیعت سپاسگزارم.", "adjective")
        ),
        listOf(
            GrammarSection("Participle Clauses", "Use participle clauses to reduce relative clauses or add information. Present participle (-ing): Walking through the forest, I felt at peace. Past participle (-ed): Built in 1900, the bridge is still in use."),
            GrammarSection("Inverted Conditionals", "In formal English, conditionals can be inverted by dropping 'if' and inverting subject and verb. First conditional: Should you need help, call me. Second conditional: Were I rich, I would travel. Third conditional: Had I known, I would have come."),
            GrammarSection("Inversion for Emphasis", "Use inversion after negative adverbs for emphasis: Never have I seen such beauty. Rarely do we appreciate nature enough. Not only is it beautiful, but it's also important."),
            GrammarSection("Conversation Strategy: Expressing Appreciation", "Use expressions like 'It takes my breath away', 'I'm in awe of...', 'Words can't describe...', and 'It's truly magnificent' to express appreciation for beauty and nature.")
        ),
        listOf(
            d("A", "I just got back from a trip to the mountains.", "تازه از سفر به کوهستان برگشتم."),
            d("B", "How was it?", "چطور بود؟"),
            d("A", "Breathtaking. Walking through those forests, I felt completely at peace.", "نفس‌گیر. وقتی از آن جنگل‌ها عبور می‌کردم، کاملاً احساس آرامش می‌کردم."),
            d("B", "That sounds amazing. Where exactly did you go?", "شگفت‌انگیز به نظر می‌رسد. دقیقاً کجا رفتی؟"),
            d("A", "A national park in the north. It's one of the most beautiful places I've ever seen.", "یک پارک ملی در شمال. یکی از زیباترین مکان‌هایی است که تا حالا دیده‌ام."),
            d("B", "I've heard about it. Isn't it famous for its wildlife?", "درباره‌اش شنیده‌ام. برای حیات وحشش معروف نیست؟"),
            d("A", "Yes, it is. Built to protect endangered species, the park is a model for conservation.", "بله. پارک که برای حفاظت از گونه‌های در خطر انقراض ساخته شده، الگویی برای حفاظت است."),
            d("B", "That's wonderful. Were there many visitors?", "فوق‌العاده است. بازدیدکننده زیاد بود؟"),
            d("A", "Surprisingly few. Were it more accessible, I think it would be crowded.", "به‌طور شگفت‌آوری کم. اگر دسترسی‌پذیرتر بود، فکر می‌کنم شلوغ می‌شد."),
            d("B", "That's probably a good thing for the environment.", "احتمالاً برای محیط زیست چیز خوبی است."),
            d("A", "Definitely. Had it been overdeveloped, the ecosystem would have suffered.", "قطعاً. اگر بیش از حد توسعه می‌یافت، اکوسیستم آسیب می‌دید."),
            d("B", "It's great that some places are still protected. We need more of that.", "عالی است که برخی مکان‌ها هنوز محافظت می‌شوند. به بیشترش نیاز داریم."),
            d("A", "I agree. Climate change is affecting even remote areas now.", "موافقم. تغییر اقلیم حتی مناطق دورافتاده را هم تحت تأثیر قرار می‌دهد."),
            d("B", "It's frightening, honestly. Sometimes I wonder if we can reverse the damage.", "صادقانه، ترسناک است. گاهی فکر می‌کنم آیا می‌توانیم خسارت را جبران کنیم."),
            d("A", "Should we act now, there's still hope. But we can't wait much longer.", "اگر الان اقدام کنیم، هنوز امید هست. ولی نمی‌توانیم بیشتر صبر کنیم."),
            d("B", "You're right. Every small action matters.", "حق داری. هر اقدام کوچکی مهم است."),
            d("A", "Exactly. Using renewable energy, reducing waste, supporting conservation — it all adds up.", "دقیقاً. استفاده از انرژی تجدیدپذیر، کاهش زباله، حمایت از حفاظت — همه جمع می‌شوند."),
            d("B", "I've been trying to be more eco-friendly lately. It's not always easy.", "اخیراً سعی کرده‌ام سازگارتر با محیط زیست باشم. همیشه آسان نیست."),
            d("A", "I know. But it's worth it. Never have I felt more connected to nature than on this trip.", "می‌دانم. ولی ارزشش را دارد. هرگز به اندازه این سفر به طبیعت متصل نبوده‌ام."),
            d("B", "That's beautiful. Sometimes we forget how amazing the world is.", "زیباست. گاهی فراموش می‌کنیم جهان چقدر شگفت‌انگیز است."),
            d("A", "We do. Standing on that mountain, I realized how small we are and how precious this planet is.", "همین‌طور است. روی آن کوه ایستاده بودم و فهمیدم چقدر کوچک هستیم و این سیاره چقدر ارزشمند است."),
            d("B", "I'd love to experience something like that.", "دوست دارم چیزی مثل آن را تجربه کنم."),
            d("A", "You should. Were I you, I'd plan a trip soon.", "باید بکنی. اگر جای تو بودم، به‌زودی سفری برنامه‌ریزی می‌کردم."),
            d("B", "Maybe I will. Any recommendations?", "شاید بکنم. توصیه‌ای داری؟"),
            d("A", "Go somewhere quiet, away from crowds. That's where you feel the real beauty.", "جایی آرام برو، دور از جمعیت. آنجاست که زیبایی واقعی را احساس می‌کنی."),
            d("B", "That's good advice. I'll look into it.", "توصیه خوبی است. بررسی می‌کنم."),
            d("A", "Let me know if you need any tips. I've traveled a lot.", "اگر نکته‌ای لازم داشتی خبرم کن. زیاد سفر کرده‌ام."),
            d("B", "Thanks. I appreciate that.", "ممنون. قدردانم."),
            d("A", "Anytime. The world is too beautiful not to explore.", "هر وقت. جهان آنقدر زیباست که نباید کاوش نکرد."),
            d("B", "Well said. Let's protect it so future generations can enjoy it too.", "خوب گفتی. بیا از آن محافظت کنیم تا نسل‌های آینده هم لذت ببرند."),
            d("A", "I couldn't agree more. That's our responsibility.", "کاملاً موافقم. این مسئولیت ماست.")
        ),
        listOf(
            q("Where did A go on a trip?", listOf("to the beach", "to a national park in the north", "to a big city", "to a desert"), 1),
            q("What is the park famous for?", listOf("its restaurants", "its wildlife and conservation", "its shopping", "its hotels"), 1),
            q("What does A say would have happened if the park had been overdeveloped?", listOf("more tourists", "the ecosystem would have suffered", "more jobs", "higher prices"), 1),
            q("What does A recommend to B?", listOf("go to a big city", "go somewhere quiet away from crowds", "stay home", "go to a resort"), 1),
            q("___ through the forest, I felt at peace.", listOf("Walk", "Walking", "Walked", "To walk"), 1),
            q("___ in 1900, the bridge is still in use.", listOf("Build", "Building", "Built", "To build"), 2),
            q("___ you need help, call me.", listOf("Should", "If", "Would", "Will"), 0),
            q("___ I known, I would have come.", listOf("Have", "Had", "Has", "Having"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Breathtaking", "نفس‌گیر", "The view was breathtaking.", "منظره نفس‌گیر بود."),
            IdiomExpression("At peace", "در آرامش", "I felt completely at peace.", "کاملاً احساس آرامش می‌کردم."),
            IdiomExpression("It all adds up", "همه جمع می‌شوند", "Every small action — it all adds up.", "هر اقدام کوچکی — همه جمع می‌شوند."),
            IdiomExpression("I couldn't agree more", "کاملاً موافقم", "I couldn't agree more.", "کاملاً موافقم.")
        ),
        phrasal = listOf(
            PhrasalVerb("get back from", "برگشتن از", "return from a place", "I just got back from a trip.", "تازه از سفر برگشتم.", "No"),
            PhrasalVerb("look into", "بررسی کردن", "investigate", "I'll look into it.", "بررسی می‌کنم.", "No"),
            PhrasalVerb("add up", "جمع شدن", "accumulate", "It all adds up.", "همه جمع می‌شوند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Participle clause intonation", "Participle clauses are usually followed by a slight pause: Walking through the forest, | I felt at peace."),
            PronunciationTip("Inverted conditional stress", "Stress the auxiliary in inverted conditionals: SHOULD you need help, call me. HAD I known, I would have come.")
        ),
        culture = listOf(
            CulturalNote("Natural wonders and conservation", "National parks and protected areas exist worldwide to preserve natural beauty and wildlife. Many countries have conservation programs, and international agreements aim to protect endangered species."),
            CulturalNote("Environmental awareness", "Environmental awareness has grown significantly in recent decades. Topics like climate change, renewable energy, and sustainable living are common in everyday conversation in many English-speaking countries.")
        ),
        mistakes = listOf(
            CommonMistake("Walk through the forest, I felt at peace.", "Walking through the forest, I felt at peace.", "Use the -ing form for present participle clauses."),
            CommonMistake("If I would have known, I would have come.", "Had I known, I would have come. / If I had known, I would have come.", "Use past perfect in the if-clause, or inverted form 'Had I known'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did A say about the park's conservation efforts?", "It was built to protect endangered species and is a model for conservation."),
            ComprehensionQuestion("What advice does A give B about traveling?", "Go somewhere quiet, away from crowds, to feel the real beauty.")
        ),
        speaking = listOf(
            SpeakingTask("Describe a beautiful place you've visited using participle clauses.", "یک مکان زیبا که رفته‌ای را با استفاده از جملات وصفی (Participle Clauses) توصیف کن.", "Walking through... / Built in... / Standing on... I felt..."),
            SpeakingTask("Discuss environmental issues and what we can do about them.", "درباره مسائل محیط زیستی و کارهایی که می‌توانیم انجام دهیم صحبت کن.", "We should... / If we don't..., ... / Should we act now...")
        ),
        writing = listOf(
            WritingTask("Write an essay about the importance of protecting natural beauty.", "مقاله‌ای درباره اهمیت حفاظت از زیبایی‌های طبیعی بنویس.", 200, "Use participle clauses and inverted conditionals at least three times.")
        )
    )
}