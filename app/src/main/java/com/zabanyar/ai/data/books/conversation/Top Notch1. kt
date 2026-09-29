package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Top Notch 1 — Complete Course Content
 * 10 Units | Elementary (A2)
 * Original educational content (no copyrighted material reproduced)
 * Long-form dialogues: 60-75 lines each (~7-8 minutes)
 */
object TopNotch1 {
    const val BOOK_ID = "top_notch_1"

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
    // UNIT 1 — Getting Acquainted | آشنایی  (≈ 65 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "Getting Acquainted", "آشنایی",
        listOf(
            "Meet someone new in formal and informal situations",
            "Identify and describe people using adjectives",
            "Provide personal information (name, occupation, nationality)",
            "Introduce someone to a group",
            "Use formal titles correctly (Mr., Ms., Mrs., Miss)",
            "Ask and answer personal information questions"
        ),
        listOf(
            v("acquaintance", "آشنا", "She's a new acquaintance of mine.", "او یک آشنای جدید من است."),
            v("colleague", "همکار", "My colleague works in the same office.", "همکارم در همان دفتر کار می‌کند."),
            v("outgoing", "برون‌گرا", "He's very outgoing and loves parties.", "او خیلی برون‌گرا است و عاشق مهمانی‌هاست.", "adjective"),
            v("reserved", "کم‌حرف", "She's reserved at first but very warm.", "او اول کم‌حرف است ولی خیلی گرم می‌شود.", "adjective"),
            v("ambitious", "جاه‌طلب", "My sister is ambitious and hardworking.", "خواهرم جاه‌طلب و سخت‌کوش است.", "adjective"),
            v("easygoing", "آسان‌گیر", "My brother is very easygoing.", "برادرم خیلی آسان‌گیر است.", "adjective"),
            v("sociable", "اجتماعی", "She's a sociable person with many friends.", "او فردی اجتماعی با دوستان زیادی است.", "adjective"),
            v("married", "متأهل", "He's married with two children.", "او متأهل است و دو بچه دارد.", "adjective"),
            v("single", "مجرد", "I'm single and live alone.", "من مجرد هستم و تنها زندگی می‌کنم.", "adjective"),
            v("divorced", "جدا شده", "She's divorced and lives with her mother.", "او جدا شده و با مادرش زندگی می‌کند.", "adjective"),
            v("engaged", "نامزد", "They're engaged and getting married next year.", "آن‌ها نامزد هستند و سال آینده ازدواج می‌کنند.", "adjective"),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیست؟"),
            v("introduce", "معرفی کردن", "Let me introduce you to my boss.", "بگذار تو را به رئیسم معرفی کنم.", "verb"),
            v("greet", "سلام کردن", "She greeted everyone at the door.", "او سر در به همه سلام کرد.", "verb"),
            v("handshake", "دست دادن", "A firm handshake is important in business.", "دست دادن محکم در تجارت مهم است.")
        ),
        listOf(
            GrammarSection("Information questions with be",
                "What's your name? Where are you from? What's your occupation? Who is that man? How old are you?"),
            GrammarSection("Yes/No questions and short answers with be",
                "Are you married? — Yes, I am. / No, I'm not. Is she single? — Yes, she is. / No, she isn't."),
            GrammarSection("Possessive nouns and adjectives",
                "Use 's for possession: John's wife, my sister's name. Use possessive adjectives: my, your, his, her, our, their."),
            GrammarSection("Formal titles",
                "Mr. (man), Ms. (woman — safe), Mrs. (married woman), Miss (unmarried woman). Used with last names.")
        ),
        listOf(
            d("A", "Excuse me, is this seat taken?", "ببخشید، این صندلی گرفته شده؟"),
            d("B", "No, please, go ahead. I'm Lisa, by the way.", "نه، بفرمایید. راستی من لیزا هستم."),
            d("A", "Nice to meet you, Lisa. I'm Mark. Mark Stevens.", "از آشنایی با تو خوشحالم، لیزا. من مارک هستم. مارک استیونز."),
            d("B", "Nice to meet you too, Mark. Is this your first time at this conference?", "من هم خوشحالم مارک. اولین بارته در این کنفرانس؟"),
            d("A", "Yes, it is. I heard about it from a colleague at work.", "بله. از یک همکار در محل کار شنیدم."),
            d("B", "Same here. I wasn't sure about coming, but a friend convinced me.", "من هم همینطور. مطمئن نبودم بیایم، ولی یک دوست قانعم کرد."),
            d("A", "Well, I'm glad you did! So where are you from, Lisa?", "خب، خوشحالم که آمدی! اهل کجایی لیزا؟"),
            d("B", "I'm from Chicago originally, but I've been living in New York for six years.", "اصالتاً اهل شیکاگو هستم، ولی شش سال است در نیویورک زندگی می‌کنم."),
            d("A", "Chicago is a great city. I've been there a couple of times for work.", "شیکاگو شهر عالی است. چند بار برای کار آنجا بوده‌ام."),
            d("B", "Oh really? What do you do, Mark?", "واقعاً؟ شغلت چیست مارک؟"),
            d("A", "I'm a marketing manager at a tech company in Boston.", "من مدیر بازاریابی یک شرکت فناوری در بوستون هستم."),
            d("B", "Interesting! So you're based in Boston?", "جالب است! پس مستقر در بوستون هستی؟"),
            d("A", "Yes, I've been there for almost ten years now.", "بله، نزدیک ده سال است آنجا هستم."),
            d("B", "That's a long time. Do you like it there?", "زمان زیادی است. آنجا را دوست داری؟"),
            d("A", "I love it. Boston is smaller than New York but very livable.", "عاشقش هستم. بوستون کوچک‌تر از نیویورک است ولی خیلی قابل زندگی."),
            d("B", "I've heard that. I've never been, but I'd like to visit.", "شنیده‌ام. هرگز نرفته‌ام، ولی دوست دارم بروم."),
            d("A", "You should. The fall is especially beautiful. And you? What do you do?", "باید بروی. پاییز مخصوصاً زیباست. تو چطور؟ شغلت چیست؟"),
            d("B", "I'm a graphic designer. I work for an advertising agency.", "من طراح گرافیک هستم. برای یک آژانس تبلیغاتی کار می‌کنم."),
            d("A", "That sounds creative. How long have you been a designer?", "خلاقانه به نظر می‌رسد. چند سال است طراح هستی؟"),
            d("B", "About five years now. Before that, I was a photographer.", "حدود پنج سال. قبلش عکاس بودم."),
            d("A", "A photographer! That's interesting. What did you photograph?", "عکاس! جالب است. از چه عکس می‌گرفتی؟"),
            d("B", "Mostly weddings and portraits. It was fun, but the hours were difficult.", "بیشتر عروسی و پرتره. سرگرم‌کننده بود، ولی ساعاتش سخت بود."),
            d("A", "I can imagine. Do you still take photos as a hobby?", "می‌توانم تصور کنم. هنوز عکاسی به عنوان سرگرمی می‌کنی؟"),
            d("B", "Sometimes, on weekends. When I travel, I always bring my camera.", "گاهی، آخر هفته‌ها. وقتی سفر می‌کنم، همیشه دوربینم را می‌برم."),
            d("A", "Where have you traveled recently?", "اخیراً کجا سفر کرده‌ای؟"),
            d("B", "I went to Iceland last summer. The landscapes were incredible.", "تابستان گذشته به ایسلند رفتم. مناظر باورنکردنی بودند."),
            d("A", "Iceland! I've always wanted to go. Was it expensive?", "ایسلند! همیشه می‌خواستم بروم. گران بود؟"),
            d("B", "Yes, quite expensive, but worth every penny.", "بله، خیلی گران، ولی ارزش هر پنی را داشت."),
            d("A", "Good to know. And how's the weather? I heard it changes quickly.", "خوب است بدانم. هوا چطور بود؟ شنیدم سریع تغییر می‌کند."),
            d("B", "Absolutely. In one day, I experienced sun, rain, and even snow.", "قطعاً. در یک روز، آفتاب، باران، و حتی برف را تجربه کردم."),
            d("A", "Wow, that's extreme. I'd need to pack for all seasons!", "واو، این افراطی است. باید برای همه فصل‌ها لباس ببرم!"),
            d("B", "Believe me, I did. But the northern lights made up for everything.", "باور کن، بردم. ولی شفق شمالی همه چیز را جبران کرد."),
            d("A", "You saw them? I'm so jealous!", "آنها را دیدی؟ خیلی حسودیم می‌شود!"),
            d("B", "Yes, on my last night there. It was magical.", "بله، آخرین شبم آنجا. جادویی بود."),
            d("A", "That sounds like a once-in-a-lifetime experience.", "تجربه یک بار در عمر به نظر می‌رسد."),
            d("B", "It really was. So, Mark, tell me — how are you finding the conference so far?", "واقعاً همینطور بود. خب مارک، بگو — تا الان کنفرانس را چطور می‌بینی؟"),
            d("A", "I'm enjoying it. The morning session on digital marketing was excellent.", "لذت می‌برم. جلسه صبح درباره بازاریابی دیجیتال عالی بود."),
            d("B", "I missed that one. I was in the design workshop.", "آن را از دست دادم. در کارگاه طراحی بودم."),
            d("A", "How was it?", "چطور بود؟"),
            d("B", "Really useful. We talked about UX trends for 2025.", "واقعاً مفید. درباره روندهای UX برای ۲۰۲۵ صحبت کردیم."),
            d("A", "Are you interested in UX?", "به UX علاقه داری؟"),
            d("B", "Yes, I'm actually thinking of shifting my career in that direction.", "بله، در واقع فکر می‌کنم حرفه‌ام را به آن سمت ببرم."),
            d("A", "That's a smart move. UX is growing fast.", "حرکت هوشمندانه‌ای است. UX سریع رشد می‌کند."),
            d("B", "That's what I've heard. Do you work with UX teams?", "همین را شنیده‌ام. با تیم‌های UX کار می‌کنی؟"),
            d("A", "Sometimes. Our design team collaborates closely with marketing.", "گاهی. تیم طراحی ما با بازاریابی همکاری نزدیک دارد."),
            d("B", "Interesting. Maybe I could ask you a few questions later?", "جالب است. شاید بعداً بتوانم چند سؤال بپرسم؟"),
            d("A", "Of course! I'm happy to share what I know.", "حتماً! خوشحال می‌شوم آنچه می‌دانم به اشتراک بگذارم."),
            d("B", "Thanks, Mark. Oh, here comes my colleague. David! Over here!", "ممنون مارک. اوه، همکارم آمد. دیوید! اینجا!"),
            d("C", "Hey, Lisa. Sorry I'm late. The taxi took forever.", "سلام لیزا. ببخش دیر کردم. تاکسی خیلی طول کشید."),
            d("B", "No worries. David, this is Mark. He's a marketing manager from Boston.", "اشکالی ندارد. دیوید، ایشان مارک هستند. مدیر بازاریابی از بوستون."),
            d("C", "Nice to meet you, Mark. I'm David Chen.", "از آشنایی با شما خوشحالم مارک. من دیوید چن هستم."),
            d("A", "Nice to meet you too, Mr. Chen.", "من هم خوشحالم، آقای چن."),
            d("C", "Please, call me David. Mr. Chen is my father!", "لطفاً دیوید صدام کن. آقای چن پدرمه!"),
            d("A", "Ha! Fair enough. So, David, what do you do?", "ها! کاملاً منصفانه. خب دیوید، شغلت چیه؟"),
            d("C", "I'm the team leader for the design group at our agency.", "من رهبر تیم گروه طراحی در آژانسمان هستم."),
            d("A", "So you and Lisa work together?", "پس تو و لیزا با هم کار می‌کنید؟"),
            d("C", "Yes, for about three years now. She's one of our best designers.", "بله، حدود سه سال. او یکی از بهترین طراحان ماست."),
            d("B", "Oh, stop it, David. You're making me blush.", "اوه، بس کن دیوید. دارم خجالت می‌کشم."),
            d("A", "Well deserved, I'm sure. Are you both presenting at the conference?", "مطمئنم لایقت است. هر دویتان در کنفرانس ارائه می‌دهید؟"),
            d("C", "Yes, we're doing a joint session this afternoon on visual storytelling.", "بله، امروز بعدازظهر یک جلسه مشترک درباره روایت بصری داریم."),
            d("A", "That sounds fascinating. What time?", "جذاب به نظر می‌رسد. چه ساعتی؟"),
            d("B", "Three o'clock in Hall B. You should come!", "ساعت سه در سالن B. باید بیایی!"),
            d("A", "I'll definitely be there. Will there be time for questions?", "قطعاً می‌آیم. وقتی برای سؤال هست؟"),
            d("C", "Absolutely. We've saved the last twenty minutes for Q&A.", "قطعاً. بیست دقیقه آخر را برای پرسش و پاسخ گذاشته‌ایم."),
            d("A", "Perfect. I have a few questions about integrating visuals into marketing campaigns.", "عالی. چند سؤال درباره ادغام بصری‌ها در کمپین‌های بازاریابی دارم."),
            d("B", "Great — that's exactly the kind of question we love.", "عالی — دقیقاً همین نوع سؤال را دوست داریم."),
            d("C", "Well, we should head to the main hall. The keynote is about to start.", "خب، باید به سالن اصلی برویم. سخنرانی اصلی دارد شروع می‌شود."),
            d("A", "Good idea. Shall we walk over together?", "فکر خوبی است. با هم برویم؟"),
            d("B", "Sure. Oh, Mark, do you have a business card?", "حتماً. اوه مارک، کارت ویزیت داری؟"),
            d("A", "I do. Here you go. My email and phone are on it.", "بله. بفرما. ایمیل و تلفنم رویش هست."),
            d("B", "Thanks. I'll send you a message later this week.", "ممنون. آخر این هفته پیام می‌فرستم."),
            d("A", "Perfect. I look forward to it, Lisa.", "عالی. منتظرش هستم لیزا."),
            d("C", "Let's go, or we'll miss the opening!", "برویم، وگرنه افتتاحیه را از دست می‌دهیم!"),
            d("B", "Coming! Mark, see you at three.", "دارم میام! مارک، ساعت سه می‌بینمت."),
            d("A", "See you then. It was great meeting you both.", "تا اون موقع. از آشنایی با هر دو خوشحال شدم."),
            d("B", "Likewise. Enjoy the keynote!", "من هم همینطور. از سخنرانی لذت ببر!"),
            d("A", "Thanks. Enjoy your session as well.", "ممنون. شما هم از جلسه‌تان لذت ببرید.")
        ),
        listOf(
            q("What is Mark's job?", listOf("graphic designer", "marketing manager", "team leader", "teacher"), 1),
            q("Where is Lisa originally from?", listOf("Boston", "Chicago", "New York", "Seattle"), 1),
            q("What's the formal title for a woman whose marital status is unknown?", listOf("Mrs.", "Miss", "Ms.", "Madam"), 2),
            q("Choose the correct question: ___ is your name?", listOf("How", "Who", "What", "Where"), 2),
            q("Choose the correct short answer: Is she married? ___", listOf("Yes, she does.", "Yes, she is.", "Yes, she has.", "Yes, she are."), 1),
            q("Which sentence shows possession?", listOf("Maria's office", "Maria is office", "Maria have office", "Office Maria"), 0),
            q("What did Lisa used to do before graphic design?", listOf("marketing", "photography", "teaching", "writing"), 1),
            q("What time is their joint session?", listOf("1:00", "2:00", "3:00", "4:00"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Go ahead", "بفرمایید", "Is this seat taken? No, go ahead.", "این صندلی گرفته شده؟ نه، بفرمایید."),
            IdiomExpression("By the way", "راستی", "I'm Lisa, by the way.", "راستی من لیزا هستم."),
            IdiomExpression("Here comes...", "... دارد می‌آید", "Here comes my colleague.", "همکارم دارد می‌آید."),
            IdiomExpression("Call me...", "من را ... صدا کن", "Please, call me David.", "لطفاً دیوید صدام کن."),
            IdiomExpression("Worth every penny", "ارزش هر پنی را داشت", "It was expensive, but worth every penny.", "گران بود، ولی ارزش هر پنی را داشت."),
            IdiomExpression("Make up for", "جبران کردن", "The northern lights made up for everything.", "شفق شمالی همه چیز را جبران کرد."),
            IdiomExpression("Once-in-a-lifetime", "یک بار در عمر", "A once-in-a-lifetime experience.", "تجربه‌ای یک بار در عمر."),
            IdiomExpression("Stop it!", "بس کن!", "Oh, stop it, David!", "اوه، بس کن دیوید!")
        ),
        phrasal = listOf(
            PhrasalVerb("run into", "به کسی برخوردن", "meet by chance",
                "I ran into an old friend at the conference.", "در کنفرانس به یک دوست قدیمی برخوردم.", "Yes"),
            PhrasalVerb("come over", "به خانه کسی آمدن", "visit someone's home",
                "Why don't you come over for dinner?", "چرا برای شام به خانه ما نمی‌آیی؟", "No"),
            PhrasalVerb("head to", "به سمت ... رفتن", "go towards",
                "We should head to the main hall.", "باید به سالن اصلی برویم.", "No"),
            PhrasalVerb("look forward to", "منتظر بودن", "anticipate with pleasure",
                "I look forward to it.", "منتظرش هستم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Formal titles", "Mr. /ˈmɪstər/, Mrs. /ˈmɪsɪz/, Ms. /mɪz/, Miss /mɪs/ — keep them short and clear."),
            PronunciationTip("Intonation in introductions", "Nice to MEET you ↗ — the stress falls on MEET."),
            PronunciationTip("Question intonation", "WH-questions: falling at the end (What do you do? ↘). Yes/No: rising (Are you married? ↗)")
        ),
        culture = listOf(
            CulturalNote("Ms. — the safe choice",
                "In English-speaking countries, 'Ms.' works for any woman regardless of marital status."),
            CulturalNote("First names vs. titles",
                "In casual settings, people often use first names. In business, use titles + last names until invited to use first names."),
            CulturalNote("Business cards",
                "Exchanging business cards is common at conferences and networking events. Hand them with the text facing the other person.")
        ),
        mistakes = listOf(
            CommonMistake("How is your name?", "What is your name?", "Use 'What' for names, not 'How'."),
            CommonMistake("He is married with two childrens.", "He is married with two children.", "'Children' is already plural.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are the three people's jobs?", "Mark is a marketing manager, Lisa is a graphic designer, and David is a team leader."),
            ComprehensionQuestion("What experience did Lisa share about her Iceland trip?", "She saw the northern lights on her last night."),
            ComprehensionQuestion("What is the plan for the afternoon?", "Lisa and David are presenting a joint session at 3 PM in Hall B.")
        ),
        speaking = listOf(
            SpeakingTask("Introduce yourself to three people at a networking event.",
                "خودت را در یک رویداد شبکه‌سازی به سه نفر معرفی کن.",
                "Hi, I'm... / I'm a... from... / Nice to meet you."),
            SpeakingTask("Introduce a friend to a colleague.",
                "یک دوست را به یک همکار معرفی کن.",
                "This is... / He/She is a... / He/She is from...")
        ),
        writing = listOf(
            WritingTask("Write a short professional self-introduction (80–100 words).",
                "یک معرفی حرفه‌ای کوتاه بنویس (۸۰ تا ۱۰۰ کلمه).",
                100, "Include name, occupation, city, and one personal detail.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 2 — Going Out | بیرون رفتن  (≈ 70 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit2() = base(
        2, "Going Out", "بیرون رفتن",
        listOf(
            "Accept or decline an invitation politely",
            "Express locations and give directions",
            "Make plans to see an event",
            "Talk about music and entertainment preferences",
            "Use prepositions of time and place correctly",
            "Ask and answer When / What time / Where questions"
        ),
        listOf(
            v("invitation", "دعوت", "Thanks for the invitation to the concert.", "ممنون برای دعوت به کنسرت."),
            v("concert", "کنسرت", "The concert starts at eight.", "کنسرت ساعت هشت شروع می‌شود."),
            v("exhibition", "نمایشگاه", "We visited an art exhibition downtown.", "یک نمایشگاه هنری در مرکز شهر دیدیم."),
            v("play", "نمایش", "We saw a play at the theater.", "در تئاتر یک نمایش دیدیم."),
            v("movie theater", "سینما", "Let's meet at the movie theater.", "بیا در سینما قرار بگذاریم."),
            v("venue", "محل برگزاری", "The venue is near the station.", "محل برگزاری نزدیک ایستگاه است."),
            v("ticket", "بلیط", "I bought two tickets online.", "دو بلیط آنلاین خریدم."),
            v("row", "ردیف", "Our seats are in row five.", "صندلی‌های ما در ردیف پنج است."),
            v("band", "گروه موسیقی", "Their band is very popular.", "گروهشان خیلی محبوب است."),
            v("performance", "اجرا", "The performance was amazing.", "اجرا فوق‌العاده بود."),
            v("crowded", "شلوغ", "The venue was very crowded.", "محل برگزاری خیلی شلوغ بود.", "adjective"),
            v("entertaining", "سرگرم‌کننده", "It was an entertaining show.", "نمایش سرگرم‌کننده‌ای بود.", "adjective"),
            v("boring", "خسته‌کننده", "The movie was boring.", "فیلم خسته‌کننده بود.", "adjective"),
            v("available", "در دسترس", "Are tickets still available?", "بلیط‌ها هنوز موجودند؟", "adjective"),
            v("upcoming", "پیشِ رو", "What's the upcoming show?", "نمایش پیشِ رو چیست؟", "adjective")
        ),
        listOf(
            GrammarSection("Prepositions of time",
                "Use 'at' with clock times (at 8:00), 'on' with days/dates (on Friday), and 'in' with months/years (in May)."),
            GrammarSection("Prepositions of place",
                "Use 'at' with specific places (at the theater), 'on' with streets (on Main Street), and 'in' with cities (in Paris)."),
            GrammarSection("WH- questions with When / What time / Where",
                "When is the concert? What time does it start? Where is the venue?"),
            GrammarSection("Accepting and declining invitations",
                "Accept: Yes, I'd love to. / Sure. Decline: I'd love to, but I can't. / Sorry, I'm busy.")
        ),
        listOf(
            d("A", "Hey, do you have any plans for this Friday night?", "هی، جمعه شب برنامه‌ای داری؟"),
            d("B", "Not that I know of. Why? What's going on?", "تا اونجایی که می‌دانم نه. چرا؟ چه خبره؟"),
            d("A", "There's a jazz concert at the Grand Theater. I was wondering if you'd like to come.", "یک کنسرت جاز در تئاتر بزرگ هست. می‌خواستم بدانم می‌خواهی بیایی."),
            d("B", "A jazz concert? That sounds nice. I haven't been to one in ages.", "کنسرت جاز؟ خوب به نظر می‌رسد. خیلی وقت است نرفته‌ام."),
            d("A", "Same here. That's why I thought of it.", "من هم همینطور. برای همین به ذهنم رسید."),
            d("B", "Who's playing?", "چه کسی اجرا می‌کند؟"),
            d("A", "The Marcus Trio. Have you heard of them?", "تروی مارکوس. ازشان شنیده‌ای؟"),
            d("B", "Actually, yes! I saw them on YouTube a few months ago. They're incredible.", "در واقع، بله! چند ماه پیش در یوتیوب دیدمشان. باورنکردنی هستند."),
            d("A", "Really? That's great. So you'd probably enjoy it.", "واقعاً؟ عالیه. پس احتمالاً لذت می‌بری."),
            d("B", "Definitely. What time does the show start?", "قطعاً. نمایش چه ساعتی شروع می‌شود؟"),
            d("A", "At eight. Doors open at seven thirty.", "ساعت هشت. درها هفت و نیم باز می‌شوند."),
            d("B", "And where exactly is the Grand Theater?", "و تئاتر بزرگ دقیقاً کجاست؟"),
            d("A", "It's on King Street, right next to the central library.", "در خیابان کینگ، دقیقاً کنار کتابخانه مرکزی."),
            d("B", "Oh, I know where that is. I went to a play there last year.", "اوه، می‌دانم کجاست. سال گذشته یک نمایش آنجا دیدم."),
            d("A", "How was it?", "چطور بود؟"),
            d("B", "The play was excellent, but the seats were a bit uncomfortable.", "نمایش عالی بود، ولی صندلی‌ها کمی ناراحت بودند."),
            d("A", "Good to know. Maybe we should get seats in the balcony.", "خوب است بدانم. شاید باید صندلی‌های بالکن را بگیریم."),
            d("B", "The balcony is actually better — you can see the whole stage.", "بالکن در واقع بهتر است — می‌توانی کل صحنه را ببینی."),
            d("A", "Good point. Are tickets still available?", "نکته خوبی است. بلیط‌ها هنوز موجودند؟"),
            d("B", "I'm not sure. Did you check online?", "مطمئن نیستم. آنلاین چک کردی؟"),
            d("A", "Yes, this morning. There were plenty left.", "بله، امروز صبح. کلی باقی مانده بود."),
            d("B", "Great. How much are they?", "عالی. چقدر هستند؟"),
            d("A", "Forty dollars each. Not bad for a live concert.", "هر کدام چهل دلار. برای یک کنسرت زنده بد نیست."),
            d("B", "That's very reasonable. Let's do it.", "خیلی منطقی است. بزن بریم."),
            d("A", "Perfect. So I'll book two tickets for Friday at eight.", "عالی. پس دو بلیط برای جمعه ساعت هشت رزرو می‌کنم."),
            d("B", "Yes, please. Where should we meet?", "بله، لطفاً. کجا قرار بگذاریم؟"),
            d("A", "How about at the theater entrance? Say, seven fifteen?", "چطور جلوی ورودی تئاتر؟ مثلاً هفت و ربع؟"),
            d("B", "Seven fifteen works for me. That gives us time to grab a coffee first.", "هفت و ربع برایم خوب است. به‌مان وقت می‌دهد اول یک قهوه بگیریم."),
            d("A", "Great idea. There's a nice café right across the street.", "فکر عالی. یک کافه خوب دقیقاً آن طرف خیابان است."),
            d("B", "Perfect. I love that place. Their cappuccino is amazing.", "عالی. عاشق آنجا هستم. کاپوچینوش عالیه."),
            d("A", "Agreed. And after the concert, we could walk around the area.", "موافقم. و بعد از کنسرت، می‌توانیم آن حوالی قدم بزنیم."),
            d("B", "That sounds lovely. Is there anything else nearby?", "خوب به نظر می‌رسد. چیز دیگری هم آن نزدیکی هست؟"),
            d("A", "Yes, there's a small jazz bar around the corner. It's open late.", "بله، یک بار جاز کوچک سر خیابان هست. تا دیر باز است."),
            d("B", "Oh, now you're really tempting me!", "اوه، حالا واقعاً داریم وسوسه می‌کنی!"),
            d("A", "Ha! Well, no pressure. We can decide after the concert.", "ها! خب، فشاری نیست. بعد از کنسرت تصمیم می‌گیریم."),
            d("B", "Sounds good. By the way, should I bring anything?", "خوبه. راستی، چیزی بیاورم؟"),
            d("A", "Just yourself. Oh, and maybe some cash for snacks.", "فقط خودت. اوه، و شاید کمی پول نقد برای تنقلات."),
            d("B", "Got it. Do they sell drinks at the venue?", "متوجه شدم. در محل برگزاری نوشیدنی می‌فروشند؟"),
            d("A", "Yes, but they're expensive. That's why I suggested the café first.", "بله، ولی گران هستند. برای همین اول کافه را پیشنهاد کردم."),
            d("B", "Smart thinking. So, Friday at seven fifteen at the theater.", "تفکر هوشمندانه. پس جمعه ساعت هفت و ربع جلوی تئاتر."),
            d("A", "Exactly. I'll text you the ticket confirmation.", "دقیقاً. تأیید بلیط را پیامک می‌کنم."),
            d("B", "Perfect. Thanks for inviting me, by the way.", "عالی. راستی ممنون که دعوتم کردی."),
            d("A", "My pleasure. It's more fun to go with someone.", "خواهش می‌کنم. با یک نفر بودن سرگرم‌کننده‌تر است."),
            d("B", "I completely agree. I used to go to concerts alone, but it's not the same.", "کاملاً موافقم. قبلاً تنها به کنسرت می‌رفتم، ولی همانطور نیست."),
            d("A", "Really? You went alone?", "واقعاً؟ تنها می‌رفتی؟"),
            d("B", "Yes, quite a few times. I actually enjoyed it sometimes — more freedom.", "بله، چند بار. راستش گاهی لذت می‌بردم — آزادی بیشتر."),
            d("A", "I see your point. But sharing the experience is nice too.", "نکته‌ات را می‌فهمم. ولی به اشتراک گذاشتن تجربه هم خوب است."),
            d("B", "Absolutely. That's why I'm excited about Friday.", "قطعاً. برای همین برای جمعه هیجان‌زده‌ام."),
            d("A", "Me too. It should be a great night.", "من هم. باید شب عالی‌ای باشد."),
            d("B", "Do you know if they have parking nearby?", "می‌دانی نزدیکشان پارکینگ دارند؟"),
            d("A", "There's a parking garage on the next block. But I'd suggest taking the subway.", "یک پارکینگ در بلوک بعدی هست. ولی پیشنهاد می‌کنم مترو بگیری."),
            d("B", "You're right. The subway is much easier. Which line goes there?", "حق داری. مترو خیلی راحت‌تر است. کدام خط می‌رود آنجا؟"),
            d("A", "The red line. Get off at King Street Station.", "خط سرخ. در ایستگاه خیابان کینگ پیاده شو."),
            d("B", "Got it. And how long is the walk from the station?", "متوجه شدم. از ایستگاه چقدر پیاده است؟"),
            d("A", "About five minutes. You'll see the theater on your left.", "حدود پنج دقیقه. تئاتر را سمت چپت می‌بینی."),
            d("B", "Perfect. That's easy enough.", "عالی. به اندازه کافی راحت است."),
            d("A", "Exactly. So, see you Friday at seven fifteen?", "دقیقاً. پس جمعه ساعت هفت و ربع می‌بینمت؟"),
            d("B", "Yes, I'll be there. Don't be late!", "بله، آنجا خواهم بود. دیر نکن!"),
            d("A", "I won't. Promise. Have a good week!", "نمی‌کنم. قول می‌دهم. هفته خوبی داشته باشی!"),
            d("B", "You too. See you Friday!", "تو هم. جمعه می‌بینمت!"),
            d("A", "Bye for now!", "فعلاً خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("When is the concert?", listOf("Thursday", "Friday", "Saturday", "Sunday"), 1),
            q("Where is the Grand Theater?", listOf("on King Street", "near the station", "in the park", "on Main Street"), 0),
            q("What time do they plan to meet?", listOf("6:30", "7:00", "7:15", "8:00"), 2),
            q("The concert starts ___ eight.", listOf("in", "on", "at", "to"), 2),
            q("Where does B suggest getting seats?", listOf("in the balcony", "on the floor", "in the back", "near the stage"), 0),
            q("How much are the tickets?", listOf("$20", "$30", "$40", "$50"), 2),
            q("Which subway line goes to the theater?", listOf("green", "red", "blue", "yellow"), 1),
            q("What did B do sometimes alone in the past?", listOf("travel", "go to concerts", "eat out", "cook"), 1)
        ),
        idioms = listOf(
            IdiomExpression("What's going on?", "چه خبره؟", "Why? What's going on?", "چرا؟ چه خبره؟"),
            IdiomExpression("In ages", "خیلی وقت", "I haven't been in ages.", "خیلی وقت است نرفته‌ام."),
            IdiomExpression("Have you heard of them?", "ازشان شنیده‌ای؟", "The Marcus Trio — have you heard of them?", "تروی مارکوس — ازشان شنیده‌ای؟"),
            IdiomExpression("Just yourself", "فقط خودت", "Should I bring anything? Just yourself.", "چیزی بیاورم؟ فقط خودت."),
            IdiomExpression("Don't be late!", "دیر نکن!", "Yes, I'll be there. Don't be late!", "بله، آنجا خواهم بود. دیر نکن!")
        ),
        phrasal = listOf(
            PhrasalVerb("check out", "بررسی کردن", "look at / investigate",
                "I'll check out the tickets online.", "بلیط‌ها را آنلاین بررسی می‌کنم.", "No"),
            PhrasalVerb("show up", "ظاهر شدن", "arrive / appear",
                "He showed up late to the concert.", "او دیر به کنسرت رسید.", "No"),
            PhrasalVerb("get off", "پیاده شدن", "leave a vehicle",
                "Get off at King Street Station.", "در ایستگاه خیابان کینگ پیاده شو.", "No"),
            PhrasalVerb("walk around", "قدم زدن", "stroll",
                "We could walk around the area after the concert.", "می‌توانیم بعد از کنسرت آن حوالی قدم بزنیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Prepositions of time", "'At' is reduced to /ət/: at eight → /ət eɪt/"),
            PronunciationTip("Rising intonation for suggestions", "How about seven fifteen? ↗"),
            PronunciationTip("Falling intonation for WH-questions", "Where is the Grand Theater? ↘")
        ),
        culture = listOf(
            CulturalNote("Being on time",
                "In many English-speaking countries, arriving a few minutes early to a show or meeting is polite."),
            CulturalNote("Balcony vs. floor seats",
                "In theaters, balcony seats often have a better view of the stage, while floor seats are closer but can be less comfortable.")
        ),
        mistakes = listOf(
            CommonMistake("The concert is in Friday.", "The concert is on Friday.", "Use 'on' with days of the week."),
            CommonMistake("Meet in the entrance.", "Meet at the entrance.", "Use 'at' for specific points.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where and when will they meet?", "At the Grand Theater entrance on Friday at 7:15."),
            ComprehensionQuestion("What will they do before the concert?", "Have coffee at a café across the street."),
            ComprehensionQuestion("What does B like to do sometimes alone?", "Go to concerts — enjoys the freedom.")
        ),
        speaking = listOf(
            SpeakingTask("Invite a friend to an event this weekend.",
                "یک دوست را برای آخر هفته به رویدادی دعوت کن.",
                "Are you free...? / There's a... / Would you like to come?"),
            SpeakingTask("Accept and decline three invitations.",
                "سه دعوت را بپذیر و رد کن.",
                "I'd love to. / Sorry, I can't. Maybe next time.")
        ),
        writing = listOf(
            WritingTask("Write an email inviting a friend to a concert.",
                "ایمیلی برای دعوت دوستت به کنسرت بنویس.",
                110, "Include what, when, where, and how to respond.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 3 — The Extended Family | خانواده گسترده  (≈ 70 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit3() = base(
        3, "The Extended Family", "خانواده گسترده",
        listOf(
            "Report news about relationships",
            "Describe extended family members",
            "Compare people using comparatives",
            "Discuss family cultural traditions",
            "Use the simple present for habits and facts",
            "React appropriately to good and bad news"
        ),
        listOf(
            v("relative", "فامیل", "All our relatives came to the wedding.", "همه فامیل‌هایمان به عروسی آمدند."),
            v("in-law", "خویشاوند سببی", "My mother-in-law is very kind.", "مادرشوهرم خیلی مهربان است."),
            v("stepbrother", "برادر ناتنی", "My stepbrother lives in Canada.", "برادرم ناتنی در کانادا زندگی می‌کند."),
            v("twin", "دوقلو", "They are identical twins.", "آن‌ها دوقلوهای همسان هستند."),
            v("nephew", "برادرزاده / خواهرزاده (پسر)", "My nephew is five years old.", "برادرزاده‌ام پنج ساله است."),
            v("niece", "برادرزاده / خواهرزاده (دختر)", "My niece studies medicine.", "خواهرزاده‌ام پزشکی می‌خواند."),
            v("grandparents", "پدربزرگ و مادربزرگ", "My grandparents live in the countryside.", "پدربزرگ و مادربزرگم در روستا زندگی می‌کنند."),
            v("generous", "بخشنده", "My uncle is very generous.", "عمویم خیلی بخشنده است.", "adjective"),
            v("strict", "سختگیر", "My father was strict but fair.", "پدرم سختگیر ولی منصف بود.", "adjective"),
            v("protective", "مراقب", "My older brothers are very protective.", "برادرهای بزرگترم خیلی مراقب هستند.", "adjective"),
            v("supportive", "حمایتگر", "My parents are very supportive.", "والدینم خیلی حمایتگر هستند.", "adjective"),
            v("reliable", "قابل اعتماد", "My cousin is a reliable person.", "پسرخاله‌ام فرد قابل اعتمادی است.", "adjective"),
            v("tradition", "سنت", "Family traditions are important to us.", "سنت‌های خانوادگی برای ما مهم هستند."),
            v("celebrate", "جشن گرفتن", "We celebrate Nowruz together every year.", "هر سال نوروز را با هم جشن می‌گیریم.", "verb"),
            v("gather", "دور هم جمع شدن", "The whole family gathers on holidays.", "همه خانواده در تعطیلات دور هم جمع می‌شوند.", "verb")
        ),
        listOf(
            GrammarSection("Simple present — review",
                "Use the simple present for habits, routines, and facts: I visit my grandparents every week. She works in a hospital."),
            GrammarSection("Comparatives",
                "Use -er or more + adjective to compare: taller, older, more outgoing. Use 'than': My sister is taller than me."),
            GrammarSection("Possessive 's with family",
                "My mother's sister is my aunt. My parents' house is in the city."),
            GrammarSection("Reacting to news",
                "Good: That's wonderful! / Congratulations! Bad: I'm sorry to hear that. / That's too bad.")
        ),
        listOf(
            d("A", "Hey, how's everything? I feel like we haven't talked in weeks.", "سلام، همه چیز چطوره؟ حس می‌کنم هفته‌هاست صحبت نکرده‌ایم."),
            d("B", "I know, right? Life has been crazy lately.", "می‌دانم، نه؟ زندگی اخیراً دیوانه‌وار بوده."),
            d("A", "Tell me about it. So what's new with you?", "بگو چه خبر. خب تو چه خبر؟"),
            d("B", "Actually, I have some big news!", "در واقع، خبر بزرگی دارم!"),
            d("A", "Really? What is it? Don't leave me hanging!", "واقعاً؟ چیه؟ منتظر نگه‌م ندار!"),
            d("B", "My sister is getting married next month!", "خواهرم ماه آینده ازدواج می‌کند!"),
            d("A", "No way! That's wonderful! Congratulations!", "نه بابا! عالیه! تبریک می‌گویم!"),
            d("B", "Thank you! We're all really excited. It's been a whirlwind.", "ممنون! همه‌مان واقعاً هیجان‌زده‌ایم. مثل گردباد بوده."),
            d("A", "I can imagine. So tell me everything. Who is she marrying?", "می‌توانم تصور کنم. خب همه چیز را بگو. با کی ازدواج می‌کند؟"),
            d("B", "A guy named Ali. They met at university. He's an engineer.", "پسری به نام علی. در دانشگاه آشنا شدند. مهندس است."),
            d("A", "An engineer! That sounds like a good match. Where did they meet exactly?", "مهندس! به نظر جور خوبی است. دقیقاً کجا آشنا شدند؟"),
            d("B", "In a study group for calculus. Can you believe it?", "در یک گروه مطالعاتی برای حساب دیفرانسیل. باورت می‌شود؟"),
            d("A", "Ha! Love really does find you anywhere, huh?", "ها! عشق واقعاً هر جایی پیدایت می‌کند، نه؟"),
            d("B", "Exactly. So they've been together for four years now.", "دقیقاً. پس چهار سال است با هم هستند."),
            d("A", "That's a long time. Do they get along with each other's families?", "زمان زیادی است. با خانواده‌های هم کنار می‌آیند؟"),
            d("B", "Yes, actually. His family is really welcoming. His mother is warm and friendly.", "بله، در واقع. خانواده‌اش واقعاً خوش‌برخورد هستند. مادرش گرم و مهربان است."),
            d("A", "That's important. Do you like him?", "این مهم است. دوستش داری؟"),
            d("B", "I do. He's a really nice guy. A bit quiet, but very kind.", "بله. واقعاً پسر خوبی است. کمی ساکت، ولی خیلی مهربان."),
            d("A", "That sounds like a great fit. So when is the wedding?", "به نظر تطابق خوبی است. خب عروسی کِی است؟"),
            d("B", "Next month. The fifteenth, I think. Or maybe the sixteenth.", "ماه آینده. پانزدهم، فکر کنم. یا شاید شانزدهم."),
            d("A", "You should probably check the exact date!", "احتمالاً باید تاریخ دقیق را چک کنی!"),
            d("B", "Ha! You're right. I'll ask my mother tonight.", "ها! حق داری. امشب از مادرم می‌پرسم."),
            d("A", "So will it be a big wedding?", "خب عروسی بزرگی می‌شود؟"),
            d("B", "Medium. About a hundred guests. Mostly family and close friends.", "متوسط. حدود صد مهمان. بیشتر خانواده و دوستان نزدیک."),
            d("A", "That sounds perfect. Not too big, not too small.", "عالی به نظر می‌رسد. نه خیلی بزرگ، نه خیلی کوچک."),
            d("B", "That's what they wanted. So it'll be at a garden venue.", "همین را می‌خواستند. پس در یک محل باغی برگزار می‌شود."),
            d("A", "A garden wedding! How romantic.", "عروسی باغی! چقدر رومانتیک."),
            d("B", "I know. I'm really looking forward to it.", "می‌دانم. واقعاً منتظرش هستم."),
            d("A", "So you'll have a new brother-in-law!", "پس برادرشوهر جدید خواهی داشت!"),
            d("B", "Exactly. And also two new nieces — his twin daughters from a previous marriage.", "دقیقاً. و دو خواهرزاده جدید هم — دخترهای دوقلویش از ازدواج قبلی."),
            d("A", "Twins! That's a big change for your family.", "دوقلو! تغییر بزرگی برای خانواده‌ات است."),
            d("B", "It really is. But we're excited to welcome them.", "واقعاً همینطور است. ولی هیجان‌زده‌ایم که خوش‌آمد بگوییم."),
            d("A", "How old are the twins?", "دوقلوها چند ساله هستند؟"),
            d("B", "Six. They're adorable. Very energetic!", "شش. بانمک هستند. خیلی پرانرژی!"),
            d("A", "Ha! Six-year-olds always are. Well, congratulations to your sister.", "ها! بچه‌های شش ساله همیشه همینطورند. خب، به خواهرت تبریک می‌گویم."),
            d("B", "Thanks. I'll pass that along. Anyway, what about you? Any family news?", "ممنون. منتقل می‌کنم. به‌هرحال، تو چطور؟ خبری از خانواده؟"),
            d("A", "Well, my cousin just moved to Germany for work.", "خب، پسرخاله‌ام اخیراً برای کار به آلمان نقل مکان کرد."),
            d("B", "Germany! That's exciting. Where in Germany?", "آلمان! هیجان‌انگیز است. کجای آلمان؟"),
            d("A", "Berlin. He's working for a tech startup there.", "برلین. آنجا برای یک استارتاپ فناوری کار می‌کند."),
            d("B", "Berlin is such a cool city. Is he happy there?", "برلین شهر خیلی باحالی است. آنجا خوشحال است؟"),
            d("A", "He seems to be. But we all miss him at family gatherings.", "به نظر می‌رسد بله. ولی در دورهمی‌های خانوادگی دلمان برایش تنگ می‌شود."),
            d("B", "I understand. Family is important, isn't it?", "می‌فهمم. خانواده مهم است، نه؟"),
            d("A", "It really is. That's why we still gather every Friday for dinner.", "واقعاً هست. برای همین هنوز هر جمعه برای شام دور هم جمع می‌شویم."),
            d("B", "Every Friday? That's a beautiful tradition.", "هر جمعه؟ سنت زیبایی است."),
            d("A", "Yes, my grandmother started it thirty years ago.", "بله، مادربزرگم سی سال پیش شروعش کرد."),
            d("B", "Wow, thirty years. Does everyone come?", "واو، سی سال. همه می‌آیند؟"),
            d("A", "Most of us. Even my uncle who lives two hours away.", "بیشترمان. حتی عمویم که دو ساعت دورتر زندگی می‌کند."),
            d("B", "That's real commitment. What do you usually eat?", "این تعهد واقعی است. معمولاً چه می‌خورید؟"),
            d("A", "Traditional food. My grandmother insists on cooking everything herself.", "غذای سنتی. مادربزرگم اصرار دارد همه چیز را خودش بپزد."),
            d("B", "That's amazing. Does she have help?", "این فوق‌العاده است. کمک دارد؟"),
            d("A", "The aunts take turns helping. It's a big operation!", "عمه‌ها و خاله‌ها به نوبت کمک می‌کنند. عملیات بزرگی است!"),
            d("B", "I can imagine. Family traditions like that are so special.", "می‌توانم تصور کنم. سنت‌های خانوادگی مثل این خیلی خاص هستند."),
            d("A", "They are. They connect generations, you know?", "هستند. نسل‌ها را به هم وصل می‌کنند، می‌دانی؟"),
            d("B", "Absolutely. Your family sounds wonderful.", "قطعاً. خانواده‌ات فوق‌العاده به نظر می‌رسد."),
            d("A", "Thanks. Yours too, from what you've told me.", "ممنون. مال تو هم، از آنچه گفتی."),
            d("B", "We do our best. So — are you coming to the wedding?", "تلاشمان را می‌کنیم. خب — به عروسی می‌آیی؟"),
            d("A", "Of course! Just tell me the date and place.", "البته! فقط تاریخ و مکان را بگو."),
            d("B", "I'll send you the invitation this week.", "این هفته دعوت‌نامه را می‌فرستم."),
            d("A", "Perfect. I'll be there.", "عالی. آنجا خواهم بود.")
        ),
        listOf(
            q("What's B's big news?", listOf("getting married", "sister is getting married", "moving abroad", "having a baby"), 1),
            q("What is the fiancé's job?", listOf("teacher", "engineer", "doctor", "lawyer"), 1),
            q("Where did the couple meet?", listOf("at work", "in a study group", "at a party", "online"), 1),
            q("My mother's sister is my ___", listOf("niece", "aunt", "cousin", "grandmother"), 1),
            q("My sister is ___ than me.", listOf("tall", "taller", "tallest", "more tall"), 1),
            q("Where did A's cousin move?", listOf("France", "Germany", "Italy", "Spain"), 1),
            q("How often does A's family gather?", listOf("every day", "once a month", "every Friday", "on holidays only"), 2),
            q("How long has the family tradition existed?", listOf("10 years", "20 years", "30 years", "50 years"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Get along", "کنار آمدن", "They get along with his family.", "با خانواده‌اش کنار می‌آیند."),
            IdiomExpression("Tell me about it", "بگو چه خبر", "Tell me about it. So what's new?", "بگو چه خبر. خب تو چه خبر؟"),
            IdiomExpression("Don't leave me hanging", "منتظر نگه‌م ندار", "What is it? Don't leave me hanging!", "چیه؟ منتظر نگه‌م ندار!"),
            IdiomExpression("No way!", "نه بابا!", "No way! That's wonderful!", "نه بابا! عالیه!"),
            IdiomExpression("A whirlwind", "مثل گردباد", "It's been a whirlwind.", "مثل گردباد بوده."),
            IdiomExpression("Take turns", "به نوبت", "The aunts take turns helping.", "عمه‌ها و خاله‌ها به نوبت کمک می‌کنند.")
        ),
        phrasal = listOf(
            PhrasalVerb("get together", "دور هم جمع شدن", "meet socially",
                "We get together every Friday.", "هر جمعه دور هم جمع می‌شویم.", "No"),
            PhrasalVerb("grow up", "بزرگ شدن", "spend childhood",
                "I grew up in a big family.", "در یک خانواده بزرگ بزرگ شدم.", "Yes"),
            PhrasalVerb("move away", "دور شدن از محل", "relocate",
                "My cousin moved away last year.", "پسرخاله‌ام سال گذشته دور شد.", "No"),
            PhrasalVerb("pass along", "منتقل کردن", "communicate a message",
                "I'll pass that along to my sister.", "آن را به خواهرم منتقل می‌کنم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Comparatives stress", "Stress the comparative form: My sister is TALLer than me."),
            PronunciationTip("Blending with 's", "Practice: mother's /ˈmʌðərz/, father's /ˈfɑːðərz/."),
            PronunciationTip("Emphatic reactions", "No WAY! That's WONderful! — stress shows emotion.")
        ),
        culture = listOf(
            CulturalNote("Extended family in English",
                "English uses specific terms like 'mother-in-law', 'stepbrother', and 'twin'. Being clear about these relationships helps avoid confusion."),
            CulturalNote("Family gatherings",
                "Regular family meals are common in many cultures. Weekly gatherings like Friday dinners help maintain strong family connections.")
        ),
        mistakes = listOf(
            CommonMistake("My mother sister is my aunt.", "My mother's sister is my aunt.", "Use possessive 's."),
            CommonMistake("She is more tall than me.", "She is taller than me.", "Use -er for one-syllable adjectives.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What change is happening in B's family?", "B's sister is marrying an engineer with twin daughters."),
            ComprehensionQuestion("What tradition does A's family have?", "They gather every Friday for dinner, started by A's grandmother 30 years ago."),
            ComprehensionQuestion("Why is the Friday dinner important to A?", "It connects generations of the family.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your extended family.",
                "خانواده گسترده‌ات را توصیف کن.",
                "I have... / My ... is... / We gather..."),
            SpeakingTask("Share a piece of family news and react to a partner's news.",
                "خبری از خانواده‌ات بگو و به خبر دوستت واکنش بده.",
                "Guess what! / Really? / Congratulations! / I'm sorry to hear that.")
        ),
        writing = listOf(
            WritingTask("Write a paragraph about a family tradition.",
                "پاراگرافی درباره یک سنت خانوادگی بنویس.",
                120, "Describe when, where, and who participates, and why it matters.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 4 — Food and Restaurants | غذا و رستوران  (≈ 72 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit4() = base(
        4, "Food and Restaurants", "غذا و رستوران",
        listOf(
            "Ask for a restaurant recommendation",
            "Order from a menu politely",
            "Speak to a server and pay for a meal",
            "Discuss food, health, and nutrition",
            "Use count and non-count nouns correctly",
            "Use some / any / anything / nothing"
        ),
        listOf(
            v("recommend", "توصیه کردن", "Can you recommend a good restaurant?", "می‌توانی یک رستوران خوب توصیه کنی؟", "verb"),
            v("recommendation", "توصیه", "Thanks for the recommendation.", "ممنون برای توصیه."),
            v("appetizer", "پیش‌غذا", "We shared an appetizer.", "یک پیش‌غذا به اشتراک گذاشتیم."),
            v("main course", "غذای اصلی", "The main course was delicious.", "غذای اصلی خوشمزه بود."),
            v("side dish", "غذای کنار", "Rice is a common side dish.", "برنج یک غذای کنار رایج است."),
            v("dessert", "دسر", "Would you like some dessert?", "دسر میل دارید؟"),
            v("beverage", "نوشیدنی", "What beverages do you have?", "چه نوشیدنی‌هایی دارید؟"),
            v("vegetarian", "گیاه‌خوار", "I'm vegetarian. Do you have options?", "من گیاه‌خوار هستم. گزینه دارید؟", "adjective"),
            v("spicy", "تند", "This curry is very spicy.", "این کاری خیلی تند است.", "adjective"),
            v("fresh", "تازه", "The salad is made with fresh vegetables.", "سالاد با سبزیجات تازه درست شده.", "adjective"),
            v("reservation", "رزرو", "I'd like to make a reservation for two.", "می‌خواهم برای دو نفر رزرو کنم."),
            v("bill / check", "صورت‌حساب", "Could we have the bill, please?", "می‌توانیم صورت‌حساب داشته باشیم، لطفاً؟"),
            v("tip", "انعام", "We left a 15% tip.", "۱۵٪ انعام گذاشتیم."),
            v("portion", "پرس", "The portions here are generous.", "پرس‌های اینجا بزرگ هستند."),
            v("healthy", "سالم / مقوی", "Grilled fish is a healthy choice.", "ماهی گریل انتخاب سالمی است.", "adjective")
        ),
        listOf(
            GrammarSection("Count and non-count nouns",
                "Count nouns have singular/plural forms: a sandwich, two sandwiches. Non-count nouns don't: some bread, some water."),
            GrammarSection("Some / Any",
                "Use 'some' in affirmative sentences and polite offers. Use 'any' in negatives and most questions."),
            GrammarSection("Anything / Nothing",
                "Would you like anything to drink? — Nothing for me, thanks."),
            GrammarSection("Polite requests with Could",
                "Could I have the menu? Could we have the bill? Could you bring some water?")
        ),
        listOf(
            d("A", "Hey, do you know any good restaurants around here?", "هی، رستوران خوبی این حوالی می‌شناسی؟"),
            d("B", "Sure, what kind of food are you in the mood for?", "حتماً، چه نوع غذایی هوس کرده‌ای؟"),
            d("A", "Something Italian, maybe. Or Mediterranean.", "چیزی ایتالیایی، شاید. یا مدیترانه‌ای."),
            d("B", "Then you should try Bella Vita. It's on Pine Street, about two blocks away.", "پس باید Bella Vita را امتحان کنی. در خیابان پاین، حدود دو بلوک آنطرف‌تر."),
            d("A", "Bella Vita. Nice name. Is it expensive?", "Bella Vita. اسم قشنگی. گران است؟"),
            d("B", "Not really. The prices are pretty reasonable, especially for lunch.", "نه واقعاً. قیمت‌ها کاملاً منطقی هستند، مخصوصاً برای ناهار."),
            d("A", "Great. Do they take reservations?", "عالی. رزرو قبول می‌کنند؟"),
            d("B", "Yes, but usually you don't need one on weekdays. Weekends get busy.", "بله، ولی معمولاً روزهای هفته لازم نداری. آخر هفته‌ها شلوغ می‌شود."),
            d("A", "Good to know. What do you usually order there?", "خوب است بدانم. معمولاً آنجا چه سفارش می‌دهی؟"),
            d("B", "Their mushroom risotto is amazing. And the bruschetta appetizer is fantastic.", "ریزوتوی قارچشان فوق‌العاده است. و پیش‌غذای بروسکتا هم عالیه."),
            d("A", "You're making me hungry just talking about it!", "فقط با صحبت کردن درباره‌اش گرسنه‌ام می‌کنی!"),
            d("B", "Ha! Then you should go tonight.", "ها! پس باید امشب بروی."),
            d("A", "I think I will. Thanks for the tip.", "فکر کنم بروم. ممنون برای راهنمایی."),
            d("B", "Anytime. Oh, and they have a great wine selection if you're into that.", "هر وقت. اوه، و اگر اهلش هستی، انتخاب شراب عالی دارند."),
            d("A", "Good to know. I'll probably skip the wine tonight. Driving.", "خوب است بدانم. احتمالاً امشب شراب را رد می‌کنم. رانندگی می‌کنم."),
            d("B", "Smart. Well, enjoy your dinner!", "هوشمندانه. خب، از شام لذت ببر!"),
            d("A", "Thanks, I will.", "ممنون، لذت می‌برم."),
            d("A", "(later at the restaurant) Good evening. Table for two, please.", "(بعداً در رستوران) عصر بخیر. میز برای دو نفر، لطفاً."),
            d("C", "Welcome to Bella Vita. Right this way. Do you have a reservation?", "به Bella Vita خوش آمدید. از این طرف. رزرو دارید؟"),
            d("A", "No, we don't. Is that a problem?", "نه، نداریم. مشکلی هست؟"),
            d("C", "Not at all. It's quiet tonight. Here are your menus.", "اصلاً. امشب ساکت است. منوها را بفرمایید."),
            d("A", "Thank you. Could we have some water, please?", "ممنون. می‌توانیم کمی آب داشته باشیم، لطفاً؟"),
            d("C", "Of course. Sparkling or still?", "حتماً. گازدار یا بدون گاز؟"),
            d("A", "Still for both of us, please.", "برای هر دوی ما بدون گاز، لطفاً."),
            d("C", "Very good. I'll give you a few minutes with the menu.", "خیلی خوب. چند دقیقه با منو وقت می‌دهم."),
            d("A", "(to companion) So what looks good to you?", "(به همراه) خب چی خوب به نظرت می‌رسد؟"),
            d("D", "The grilled salmon sounds perfect. What about you?", "ماهی سالمون گریل عالی به نظر می‌رسد. تو چطور؟"),
            d("A", "I'm torn between the risotto and the lasagna.", "بین ریزوتو و لازانیا گیر کرده‌ام."),
            d("D", "The risotto is what our friend recommended, right?", "ریزوتو همان است که دوستمان توصیه کرد، نه؟"),
            d("A", "Yes. But I've been craving lasagna for weeks.", "بله. ولی هفته‌هاست هوس لازانیا کرده‌ام."),
            d("D", "Ha! Then get the lasagna. Follow your cravings.", "ها! پس لازانیا بگیر. هوس‌هایت را دنبال کن."),
            d("C", "(returning) Are you ready to order?", "(برمی‌گردد) آماده سفارش هستید؟"),
            d("A", "Yes. I'll have the lasagna, please.", "بله. لطفاً لازانیا می‌خورم."),
            d("C", "Excellent choice. And for you, ma'am?", "انتخاب عالی. و برای شما خانم؟"),
            d("D", "The grilled salmon, please. With a Caesar salad as a starter.", "ماهی سالمون گریل، لطفاً. با یک سالاد سزار به عنوان پیش‌غذا."),
            d("C", "Would you like any appetizer to share?", "پیش‌غذای مشترکی میل دارید؟"),
            d("A", "Yes, the bruschetta, please. I heard it's fantastic.", "بله، بروسکتا، لطفاً. شنیدم عالیه."),
            d("C", "It is! Very popular. And anything to drink besides water?", "همینطور است! خیلی محبوب. و نوشیدنی دیگری غیر از آب؟"),
            d("D", "Nothing for me, thanks. Just water.", "برای من چیزی نه، ممنون. فقط آب."),
            d("A", "Same here. Actually, could I have a lemonade?", "من هم همینطور. راستش می‌توانم یک لیموناد داشته باشم؟"),
            d("C", "Of course. One lemonade. Anything else?", "حتماً. یک لیموناد. چیز دیگری؟"),
            d("A", "No, that's everything for now. Thank you.", "نه، فعلاً همین. ممنون."),
            d("C", "Your food will be ready soon.", "غذایتان به‌زودی آماده می‌شود."),
            d("D", "This place has a nice atmosphere, doesn't it?", "این مکان فضای خوبی دارد، نه؟"),
            d("A", "It does. Relaxed but elegant. Good choice.", "دارد. آرام ولی شیک. انتخاب خوبی."),
            d("D", "Thanks. I'm glad you like it.", "ممنون. خوشحالم که دوستش داری."),
            d("C", "(later) How is everything?", "(بعداً) همه چیز خوب است؟"),
            d("A", "Delicious! The lasagna is perfect.", "خوشمزه! لازانیا عالیه."),
            d("D", "The salmon is also fantastic. Very fresh.", "سالمون هم فوق‌العاده است. خیلی تازه."),
            d("C", "Wonderful. Would you like to see the dessert menu?", "عالی. منوی دسر را می‌خواهید ببینید؟"),
            d("A", "What do you have?", "چه دارید؟"),
            d("C", "Tiramisu, chocolate cake, and gelato.", "تیرامیسو، کیک شکلاتی، و بستنی ایتالیایی."),
            d("A", "I'll have the tiramisu, please.", "لطفاً تیرامیسو می‌خورم."),
            d("D", "Nothing for me. I'm too full!", "برای من چیزی نه. خیلی سیرم!"),
            d("C", "One tiramisu coming up.", "یک تیرامیسو در راه است."),
            d("A", "(after dessert) That was an incredible meal.", "(بعد از دسر) غذای باورنکردنی‌ای بود."),
            d("D", "It really was. We should come back.", "واقعاً بود. باید دوباره بیاییم."),
            d("A", "Agreed. Could we have the bill, please?", "موافقم. می‌توانیم صورت‌حساب داشته باشیم، لطفاً؟"),
            d("C", "Here you are. I hope you enjoyed your meal.", "بفرمایید. امیدوارم از غذایتان لذت برده باشید."),
            d("A", "We did. Thank you. Do you accept credit cards?", "لذت بردیم. ممنون. کارت اعتباری قبول می‌کنید؟"),
            d("C", "Yes, of course. I'll be right back with the machine.", "بله، البته. الان با دستگاه برمی‌گردم."),
            d("A", "(paying) Should we leave a tip?", "(در حال پرداخت) انعام بگذاریم؟"),
            d("D", "Yes. Fifteen percent is standard here.", "بله. پانزده درصد اینجا استاندارد است."),
            d("A", "Okay. Let's round it up to twenty — the service was great.", "باشه. بیایید به بیست گرد کنیم — خدمات عالی بود."),
            d("D", "Good idea. The waiter was very helpful.", "فکر خوبی. گارسون خیلی کمک‌کننده بود."),
            d("A", "Alright, we're all set. Let's go.", "خب، همه چیز آماده است. برویم."),
            d("D", "Thanks again for dinner. My treat next time.", "باز هم ممنون برای شام. دفعه بعد مهمان من.")
        ),
        listOf(
            q("Which is a non-count noun?", listOf("sandwich", "water", "apple", "egg"), 1),
            q("What restaurant does B recommend?", listOf("Bella Napoli", "Bella Vita", "La Casa", "Roma"), 1),
            q("I'd like ___ bread, please.", listOf("a", "an", "some", "many"), 2),
            q("Where is Bella Vita located?", listOf("on Main Street", "on Pine Street", "downtown", "near the station"), 1),
            q("What appetizer do they order?", listOf("salad", "soup", "bruschetta", "calamari"), 2),
            q("What dessert does A order?", listOf("chocolate cake", "gelato", "tiramisu", "nothing"), 2),
            q("Would you like ___ to drink?", listOf("something", "anything", "nothing", "everything"), 1),
            q("How much tip do they leave?", listOf("10%", "15%", "20%", "25%"), 2)
        ),
        idioms = listOf(
            IdiomExpression("In the mood for", "هوس ... کردن", "What are you in the mood for?", "هوس چه کرده‌ای؟"),
            IdiomExpression("Right this way", "از این طرف", "Right this way, please.", "از این طرف، لطفاً."),
            IdiomExpression("Torn between", "گیر کردن بین دو چیز", "I'm torn between the risotto and the lasagna.", "بین ریزوتو و لازانیا گیر کرده‌ام."),
            IdiomExpression("Follow your cravings", "هوس‌هایت را دنبال کن", "Get the lasagna. Follow your cravings.", "لازانیا بگیر. هوس‌هایت را دنبال کن."),
            IdiomExpression("My treat", "مهمان من", "My treat next time.", "دفعه بعد مهمان من."),
            IdiomExpression("Round it up", "گرد کردن (به بالا)", "Let's round it up to twenty.", "بیایید به بیست گرد کنیم.")
        ),
        phrasal = listOf(
            PhrasalVerb("eat out", "بیرون غذا خوردن", "eat at a restaurant",
                "We eat out once a week.", "هفته‌ای یک بار بیرون غذا می‌خوریم.", "No"),
            PhrasalVerb("take out", "بیرون بردن غذا", "get food to go",
                "Let's take out tonight.", "بیا امشب غذا بیرون ببریم.", "No"),
            PhrasalVerb("come up", "آماده شدن", "be ready / appear",
                "One tiramisu coming up.", "یک تیرامیسو در راه است.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Contraction 'I'd'", "Practice smoothly: I'd like... /aɪd laɪk/"),
            PronunciationTip("Rising intonation for offers", "Would you like some dessert? ↗"),
            PronunciationTip("Stress in food words", "Practice: riSOTto, laSANya, tiramiSU.")
        ),
        culture = listOf(
            CulturalNote("Tipping in restaurants",
                "In the US, 15–20% is standard for good service. In the UK and Europe, 5–10% is common."),
            CulturalNote("Reservations",
                "Calling ahead for a reservation is polite at popular restaurants, especially on weekends.")
        ),
        mistakes = listOf(
            CommonMistake("I want water.", "I'd like some water, please.", "'I'd like' is more polite than 'I want'."),
            CommonMistake("I'd like a bread.", "I'd like some bread.", "'Bread' is non-count; use 'some'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why does B recommend Bella Vita?", "Reasonable prices, great mushroom risotto and bruschetta, and a nice wine selection."),
            ComprehensionQuestion("What did A and D order as main courses?", "A ordered lasagna; D ordered grilled salmon with Caesar salad."),
            ComprehensionQuestion("How much tip do they leave and why?", "20% because the service was great.")
        ),
        speaking = listOf(
            SpeakingTask("Role-play ordering at a restaurant with a partner.",
                "با یک دوست نقش مشتری و گارسون را بازی کنید.",
                "Could we have...? / I'll have... / Anything to drink?"),
            SpeakingTask("Describe your favorite meal and why you like it.",
                "غذای مورد علاقه‌ات را توصیف کن و بگو چرا دوستش داری.",
                "My favorite meal is... / because...")
        ),
        writing = listOf(
            WritingTask("Write a restaurant review in 120 words.",
                "نقد یک رستوران در ۱۲۰ کلمه بنویس.",
                120, "Include the food, service, prices, and your recommendation.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 5 — Technology and You | فناوری و تو  (≈ 70 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit5() = base(
        5, "Technology and You", "فناوری و تو",
        listOf(
            "Suggest a brand or model",
            "Express frustration and sympathy",
            "Describe features of electronic products",
            "Complain politely when things don't work",
            "Use the present continuous for actions and future plans",
            "Discuss technology in daily life"
        ),
        listOf(
            v("device", "دستگاه", "This device is very useful.", "این دستگاه خیلی مفید است."),
            v("smartphone", "گوشی هوشمند", "My smartphone is two years old.", "گوشی هوشمندم دو ساله است."),
            v("laptop", "لپ‌تاپ", "I use my laptop for work.", "من از لپ‌تاپم برای کار استفاده می‌کنم."),
            v("tablet", "تبلت", "She reads books on her tablet.", "او کتاب‌ها را روی تبلتش می‌خواند."),
            v("charger", "شارژر", "I forgot my charger at home.", "شارژرم را خانه جا گذاشتم."),
            v("battery", "باتری", "The battery lasts all day.", "باتری تمام روز دوام می‌آورد."),
            v("screen", "صفحه‌نمایش", "The screen is cracked.", "صفحه‌نمایش ترک خورده است."),
            v("app", "اپلیکیشن", "This app helps me learn English.", "این اپ به من در یادگیری انگلیسی کمک می‌کند."),
            v("download", "دانلود کردن", "I downloaded a new game.", "یک بازی جدید دانلود کردم.", "verb"),
            v("update", "به‌روزرسانی", "The system needs an update.", "سیستم نیاز به به‌روزرسانی دارد."),
            v("headphones", "هدفون", "My headphones are wireless.", "هدفونم بی‌سیم است."),
            v("wireless", "بی‌سیم", "Everything is wireless these days.", "این روزها همه چیز بی‌سیم است.", "adjective"),
            v("reliable", "قابل اعتماد", "This brand is very reliable.", "این برند خیلی قابل اعتماد است.", "adjective"),
            v("glitch", "اشکال فنی", "There's a glitch in the app.", "اشکالی فنی در اپ هست."),
            v("crash", "از کار افتادن", "My computer crashed again.", "کامپیوترم باز از کار افتاد.", "verb")
        ),
        listOf(
            GrammarSection("Present continuous — review",
                "Use be + verb-ing for actions happening now and future plans: I'm using my phone. We're meeting tomorrow."),
            GrammarSection("Present continuous vs. simple present",
                "Simple present = habits (I use my laptop every day). Present continuous = now or future (I'm using it right now)."),
            GrammarSection("Describing features",
                "Use adjectives: It has a large screen. It's fast and reliable. The battery lasts long."),
            GrammarSection("Making suggestions",
                "Why don't you try the new model? How about this brand? You should get the XR-200.")
        ),
        listOf(
            d("A", "Hey, you look frustrated. What's going on?", "هی، عصبانی به نظر می‌رسی. چه خبره؟"),
            d("B", "My laptop keeps crashing. It's driving me crazy.", "لپ‌تاپم مدام از کار می‌افتد. دیوانه‌ام کرده."),
            d("A", "Oh no, that's the worst. How old is it?", "اوه نه، این بدترینه. چند ساله است؟"),
            d("B", "About five years. I think it's time for a new one.", "حدود پنج سال. فکر کنم وقتشه یکی جدید بگیرم."),
            d("A", "I'm sorry to hear that. Do you lose work when it crashes?", "متأسفم. وقتی از کار می‌افتد کارت را از دست می‌دهی؟"),
            d("B", "Sometimes. I try to save every few minutes, but it's annoying.", "گاهی. سعی می‌کنم هر چند دقیقه ذخیره کنم، ولی آزاردهنده است."),
            d("A", "That sounds really stressful. What brand are you thinking of?", "واقعاً استرس‌زا به نظر می‌رسد. چه برندی در ذهن داری؟"),
            d("B", "I'm not sure. What do you recommend?", "مطمئن نیستم. چه توصیه می‌کنی؟"),
            d("A", "Well, I'm using a Lenovo right now. It's fast and reliable.", "خب، من الان لنوو استفاده می‌کنم. سریع و قابل اعتماد است."),
            d("B", "How long have you had it?", "چند سال است داری‌اش؟"),
            d("A", "About two years. No problems so far.", "حدود دو سال. تا الان مشکلی نداشته."),
            d("B", "That's a good sign. Is the battery good?", "نشانه خوبی است. باتری‌اش خوب است؟"),
            d("A", "Yes, it lasts about ten hours. Very convenient for travel.", "بله، حدود ده ساعت دوام می‌آورد. برای سفر خیلی راحت."),
            d("B", "Nice. What about the screen and the keyboard?", "عالی. صفحه‌نمایش و کیبوردش چطور؟"),
            d("A", "The screen is sharp and bright. The keyboard feels great, very comfortable.", "صفحه‌نمایش واضح و روشن است. کیبوردش عالیه، خیلی راحت."),
            d("B", "Sounds perfect. Where did you buy it?", "عالی به نظر می‌رسد. از کجا خریدی؟"),
            d("A", "Online, actually. It was on sale. I saved two hundred dollars.", "آنلاین، در واقع. در حراج بود. دویست دلار صرفه‌جویی کردم."),
            d("B", "Two hundred! That's a great deal.", "دویست! معامله عالی‌ای است."),
            d("A", "I know, right? I was lucky with the timing.", "می‌دانم، نه؟ با زمان‌بندی خوش‌شانس بودم."),
            d("B", "Do you think they're still on sale?", "فکر می‌کنی هنوز در حراج هستند؟"),
            d("A", "I'm not sure. Want me to check right now? I'm already online.", "مطمئن نیستم. می‌خواهی همین الان چک کنم؟ الان آنلاینم."),
            d("B", "That would be amazing. Yes, please.", "فوق‌العاده می‌شود. بله، لطفاً."),
            d("A", "Okay, give me a second... Let me look...", "باشه، یک لحظه... بگذار ببینم..."),
            d("B", "Take your time. No rush.", "عجله نکن. فشاری نیست."),
            d("A", "Alright. I'm on the Lenovo website now...", "خب. الان در وب‌سایت لنوو هستم..."),
            d("B", "Anything good?", "چیز خوبی هست؟"),
            d("A", "Actually, yes! They're running a fall sale. Twenty percent off most models.", "در واقع، بله! حراج پاییزی دارند. بیست درصد تخفیف روی بیشتر مدل‌ها."),
            d("B", "Twenty percent! That's even better.", "بیست درصد! این حتی بهتره."),
            d("A", "I know. And free shipping, too.", "می‌دانم. و ارسال رایگان هم."),
            d("B", "Perfect. Can you send me the link?", "عالی. می‌توانی لینک را برایم بفرستی؟"),
            d("A", "Sure. I'm sending it right now.", "حتماً. الان می‌فرستم."),
            d("B", "Got it. Thanks! You're a lifesaver.", "گرفتم. ممنون! نجات‌دهنده‌ای."),
            d("A", "Anytime. Let me know if you have questions about the specs.", "هر وقت. اگر درباره مشخصات سؤالی داشتی بگو."),
            d("B", "Actually, yes. What processor does yours have?", "در واقع، بله. پروسسورت چه هست؟"),
            d("A", "It's an Intel i7. Very fast for everyday work.", "اینتل i7 است. برای کار روزمره خیلی سریع."),
            d("B", "Is it good for video editing too?", "برای ویرایش ویدیو هم خوب است؟"),
            d("A", "For light editing, yes. For heavy 4K work, you'd need more RAM.", "برای ویرایش سبک، بله. برای کار سنگین 4K، رم بیشتری لازم داری."),
            d("B", "Good to know. I mostly do document work and some presentations.", "خوب است بدانم. من بیشتر کارهای اداری و چند ارائه می‌کنم."),
            d("A", "Then the i7 is more than enough. You won't have any issues.", "پس i7 بیش از کافی است. هیچ مشکلی نخواهی داشت."),
            d("B", "That's reassuring. Thanks for all the advice.", "اطمینان‌بخش است. ممنون برای همه توصیه‌ها."),
            d("A", "Happy to help. Let me know how it goes.", "خوشحالم کمک می‌کنم. بگو چطور پیش رفت."),
            d("B", "I will. I'm ordering it right now, actually!", "می‌گویم. راستش الان دارم سفارش می‌دهم!"),
            d("A", "Ha! That was fast. Congratulations on the new laptop.", "ها! این سریع بود. تبریک برای لپ‌تاپ جدید."),
            d("B", "Thanks! I can't wait for it to arrive.", "ممنون! بی‌صبرانه منتظر رسیدنشم."),
            d("A", "Usually takes about three to five days.", "معمولاً حدود سه تا پنج روز طول می‌کشد."),
            d("B", "Perfect. I'll survive a few more days with this one.", "عالی. با این یکی چند روز دیگر زنده می‌مانم."),
            d("A", "Ha! Just back up your files before the old one dies.", "ها! فقط قبل از اینکه قدیمی بمیرد از فایل‌هایت پشتیبان بگیر."),
            d("B", "Good point. I'll do that tonight.", "نکته خوبی. امشب انجام می‌دهم."),
            d("A", "Smart. And don't forget to check the warranty.", "هوشمندانه. و فراموش نکن گارانتی را چک کنی."),
            d("B", "How long is the warranty?", "گارانتی چند ساله است؟"),
            d("A", "Two years on Lenovo, I think. It should be on the product page.", "فکر کنم دو سال برای لنوو. باید در صفحه محصول باشد."),
            d("B", "Yes, I see it. Two years. That's solid.", "بله، می‌بینم. دو سال. محکم است."),
            d("A", "Right. Well, enjoy the new machine!", "درست. خب، از دستگاه جدید لذت ببر!"),
            d("B", "Thanks again. You saved me hours of research.", "باز هم ممنون. ساعت‌ها تحقیقم را نجات دادی."),
            d("A", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
            d("B", "Well, I owe you a coffee.", "خب، یک قهوه به تو بدهکارم."),
            d("A", "Deal. Let's get one this weekend.", "قبول. آخر این هفته یکی بگیریم."),
            d("B", "Perfect. Talk soon!", "عالی. به‌زودی صحبت می‌کنیم!"),
            d("A", "Talk soon!", "به‌زودی صحبت می‌کنیم!")
        ),
        listOf(
            q("What's wrong with B's laptop?", listOf("screen broken", "keeps crashing", "too slow", "battery dead"), 1),
            q("How old is B's laptop?", listOf("two years", "three years", "five years", "seven years"), 2),
            q("What brand does A recommend?", listOf("Apple", "Samsung", "Lenovo", "Dell"), 2),
            q("How long does A's battery last?", listOf("about 5 hours", "about 8 hours", "about 10 hours", "about 12 hours"), 2),
            q("What's the current sale discount?", listOf("10%", "15%", "20%", "25%"), 2),
            q("What processor does A's laptop have?", listOf("i5", "i7", "i9", "Ryzen"), 1),
            q("How long is the Lenovo warranty?", listOf("one year", "two years", "three years", "five years"), 1),
            q("What does B owe A?", listOf("money", "a coffee", "a favor", "nothing"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Driving me crazy", "دیوانه‌ام کرده", "It's driving me crazy.", "دیوانه‌ام کرده."),
            IdiomExpression("Take your time", "عجله نکن", "Take your time. No rush.", "عجله نکن. فشاری نیست."),
            IdiomExpression("You're a lifesaver", "نجات‌دهنده‌ای", "Thanks! You're a lifesaver.", "ممنون! نجات‌دهنده‌ای."),
            IdiomExpression("What's going on?", "چه خبره؟", "You look frustrated. What's going on?", "عصبانی به نظر می‌رسی. چه خبره؟"),
            IdiomExpression("That's what friends are for", "دوست برای همین است", "Anytime. That's what friends are for.", "هر وقت. دوست برای همین است."),
            IdiomExpression("I owe you", "بدهکارتم", "I owe you a coffee.", "یک قهوه به تو بدهکارم.")
        ),
        phrasal = listOf(
            PhrasalVerb("crash", "از کار افتادن", "stop working suddenly",
                "My computer crashed again.", "کامپیوترم باز از کار افتاد.", "No"),
            PhrasalVerb("log in", "وارد شدن", "enter an account",
                "I can't log in to my account.", "نمی‌توانم وارد حسابم شوم.", "No"),
            PhrasalVerb("set up", "راه‌اندازی کردن", "install / configure",
                "I need to set up my new phone.", "باید گوشی جدیدم را راه‌اندازی کنم.", "No"),
            PhrasalVerb("back up", "پشتیبان گرفتن", "make a copy",
                "Back up your files regularly.", "مرتب از فایل‌هایت پشتیبان بگیر.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Contractions in present continuous", "I'm /aɪm/, you're /jʊr/, we're /wɪr/, they're /ðer/."),
            PronunciationTip("Intonation of suggestions", "Why don't you try this? ↗ (rising, friendly)"),
            PronunciationTip("Tech abbreviations", "i7 → 'eye seven', 4K → 'four kay', RAM → 'ram'.")
        ),
        culture = listOf(
            CulturalNote("Tech talk",
                "The words 'app', 'download', 'update', and 'glitch' are used internationally. 'Crash' is common for computers and phones."),
            CulturalNote("Backing up files",
                "Regular backups prevent data loss. Cloud services like Google Drive or iCloud make this easy.")
        ),
        mistakes = listOf(
            CommonMistake("I using my laptop now.", "I'm using my laptop now.", "Present continuous needs 'be + verb-ing'."),
            CommonMistake("My laptop crash every day.", "My laptop crashes every day.", "Add -es for third-person singular.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why is B frustrated?", "B's five-year-old laptop keeps crashing."),
            ComprehensionQuestion("What deal does A find online?", "Twenty percent off Lenovo laptops, plus free shipping."),
            ComprehensionQuestion("What advice does A give about backups?", "Back up files before the old laptop dies.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your favorite electronic device and its features.",
                "دستگاه الکترونیکی مورد علاقه‌ات را با ویژگی‌هایش توصیف کن.",
                "I use it for... / It has... / It's fast/reliable/light."),
            SpeakingTask("Role-play recommending a device to a friend.",
                "نقش توصیه یک دستگاه به دوست را بازی کنید.",
                "Why don't you try...? / It's on sale. / You should get...")
        ),
        writing = listOf(
            WritingTask("Write a short tech review of a device you own.",
                "نقد کوتاه فنی یک دستگاه که داری بنویس.",
                120, "Mention features, pros, cons, and a recommendation.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 6 — Staying in Shape | تناسب اندام  (≈ 68 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit6() = base(
        6, "Staying in Shape", "تناسب اندام",
        listOf(
            "Plan an activity with someone",
            "Discuss fitness and eating habits",
            "Describe daily routines and obligations",
            "Use can and have to correctly",
            "Understand non-action verbs",
            "Talk about health and wellness"
        ),
        listOf(
            v("workout", "تمرین", "My workout takes an hour.", "تمرینم یک ساعت طول می‌کشد."),
            v("gym", "باشگاه", "I go to the gym three times a week.", "هفته‌ای سه بار به باشگاه می‌روم."),
            v("yoga", "یوگا", "Yoga helps me relax.", "یوگا به من کمک می‌کند آرام شوم."),
            v("jogging", "دویدن آرام", "I go jogging in the morning.", "صبح‌ها می‌دوم."),
            v("weightlifting", "وزنه‌برداری", "He does weightlifting twice a week.", "هفته‌ای دو بار وزنه می‌زند."),
            v("stretch", "کشش دادن", "You should stretch before running.", "باید قبل از دویدن کشش کنی.", "verb"),
            v("routine", "روتین", "My morning routine is simple.", "روتین صبحم ساده است."),
            v("calories", "کالری", "This meal has 500 calories.", "این غذا ۵۰۰ کالری دارد."),
            v("protein", "پروتئین", "Chicken is a good source of protein.", "مرغ منبع خوب پروتئین است."),
            v("balanced diet", "رژیم متعادل", "A balanced diet is important.", "رژیم متعادل مهم است."),
            v("obligation", "الزام", "I have many obligations this week.", "این هفته الزامات زیادی دارم."),
            v("schedule", "برنامه", "My schedule is very full.", "برنامه‌ام خیلی پر است."),
            v("commitment", "تعهد", "Exercise requires commitment.", "ورزش تعهد می‌خواهد."),
            v("relax", "استراحت کردن", "I relax on Sundays.", "یکشنبه‌ها استراحت می‌کنم.", "verb"),
            v("motivation", "انگیزه", "I need more motivation to exercise.", "به انگیزه بیشتری برای ورزش نیاز دارم.")
        ),
        listOf(
            GrammarSection("Can and Have to",
                "Use 'can' for ability and permission. Use 'have to / has to' for obligation."),
            GrammarSection("Don't have to vs. Mustn't",
                "Don't have to = no obligation. Mustn't = prohibition."),
            GrammarSection("Non-action verbs",
                "Verbs like like, love, hate, want, need, know usually don't take -ing."),
            GrammarSection("Frequency for fitness",
                "Use: every day, three times a week, once a month, twice a week.")
        ),
        listOf(
            d("A", "Hey, do you want to go to the gym with me?", "هی، می‌خواهی با من به باشگاه بیایی؟"),
            d("B", "Oh, I'd love to, but I can't today. I have to work late.", "اوه، دوست دارم، ولی امروز نمی‌توانم. باید تا دیروقت کار کنم."),
            d("A", "That's too bad. How about tomorrow instead?", "چه بد. فردا چطور؟"),
            d("B", "Tomorrow works. What time do you usually go?", "فردا خوب است. معمولاً چه ساعتی می‌روی؟"),
            d("A", "I usually go around six in the evening, after work.", "معمولاً حدود شش عصر، بعد از کار می‌روم."),
            d("B", "Six is a bit early for me. Can we go at seven?", "شش برایم کمی زود است. می‌توانیم ساعت هفت برویم؟"),
            d("A", "Sure, that works too. Seven it is.", "حتماً، این هم خوبه. ساعت هفت."),
            d("B", "Perfect. So what do you usually do at the gym?", "عالی. خب معمولاً در باشگاه چه کار می‌کنی؟"),
            d("A", "I usually start with cardio — treadmill or bike — then weights.", "معمولاً با هوازی شروع می‌کنم — تردمیل یا دوچرخه — بعد وزنه."),
            d("B", "Nice. I mostly do cardio. I'm not really into weights.", "عالی. من بیشتر هوازی. واقعاً اهل وزنه نیستم."),
            d("A", "You should try weights sometime. They help with metabolism.", "باید یک وقت وزنه را امتحان کنی. به متابولیسم کمک می‌کنند."),
            d("B", "Maybe. I just don't know the right form.", "شاید. فقط فرم صحیح را نمی‌دانم."),
            d("A", "I can show you some basics. It's not complicated.", "می‌توانم چند پایه را نشانت بدهم. پیچیده نیست."),
            d("B", "That would be great. Thanks!", "عالی می‌شود. ممنون!"),
            d("A", "No problem. Do you do yoga at all?", "مشکلی نیست. یوگا هم کار می‌کنی؟"),
            d("B", "I've been thinking about it, but I'm worried I'm not flexible enough.", "بهش فکر کرده‌ام، ولی نگرانم به اندازه کافی انعطاف نداشته باشم."),
            d("A", "You don't have to be flexible at first. Yoga is about progress, not perfection.", "اول لازم نیست انعطاف داشته باشی. یوگا درباره پیشرفت است، نه بی‌نقصی."),
            d("B", "That's reassuring. Do you have a class you recommend?", "اطمینان‌بخش است. کلاسی داری که توصیه کنی؟"),
            d("A", "There's a beginner class on Tuesday evenings. The teacher is patient.", "یک کلاس مبتدی سه‌شنبه عصرها هست. معلمش صبور است."),
            d("B", "Tuesday evenings might work. What time does it start?", "سه‌شنبه عصرها ممکن است بشود. چه ساعتی شروع می‌شود؟"),
            d("A", "Seven thirty. It lasts about an hour.", "هفت و نیم. حدود یک ساعت طول می‌کشد."),
            d("B", "Nice. Let me check my schedule and let you know.", "عالی. بگذار برنامه‌ام را چک کنم و بهت بگویم."),
            d("A", "Sounds good. By the way, do you cook at home?", "خوبه. راستی، در خانه آشپزی می‌کنی؟"),
            d("B", "Not as much as I should. I eat out way too often.", "نه به اندازه‌ای که باید. خیلی زیاد بیرون غذا می‌خورم."),
            d("A", "Same here. I'm trying to cook more for health reasons.", "من هم همینطور. سعی می‌کنم برای سلامتی بیشتر آشپزی کنم."),
            d("B", "That's smart. What's your favorite thing to cook?", "هوشمندانه است. غذای مورد علاقه‌ات برای پختن چیست؟"),
            d("A", "I make a great grilled chicken with vegetables. Simple and healthy.", "مرغ گریل با سبزیجات عالی درست می‌کنم. ساده و سالم."),
            d("B", "Sounds delicious. Can you share the recipe?", "خوشمزه به نظر می‌رسد. می‌توانی دستورش را بدهی؟"),
            d("A", "Of course. I'll text it to you tonight.", "حتماً. امشب پیامکش می‌کنم."),
            d("B", "Thanks. I really want a balanced diet, but I need structure.", "ممنون. واقعاً رژیم متعادل می‌خواهم، ولی به ساختار نیاز دارم."),
            d("A", "Meal planning helps. I spend an hour on Sunday planning the week.", "برنامه‌ریزی وعده‌ها کمک می‌کند. یکشنبه‌ها یک ساعت برای برنامه هفته وقت می‌گذارم."),
            d("B", "That's a good idea. I've never tried that.", "فکر خوبی است. هرگز امتحان نکرده‌ام."),
            d("A", "It changed everything for me. Less waste, healthier choices.", "همه چیز را برایم تغییر داد. اتلاف کمتر، انتخاب‌های سالم‌تر."),
            d("B", "I'll definitely try it this Sunday.", "قطعاً این یکشنبه امتحان می‌کنم."),
            d("A", "Start small. Just plan three dinners for the week.", "کوچک شروع کن. فقط سه شام برای هفته برنامه‌ریزی کن."),
            d("B", "Good advice. So — gym tomorrow at seven?", "توصیه خوبی. پس — باشگاه فردا ساعت هفت؟"),
            d("A", "Yes. Don't forget to bring water and a towel.", "بله. یادت نرود آب و حوله بیاوری."),
            d("B", "Will do. Should I bring anything else?", "حتماً. چیز دیگری بیاورم؟"),
            d("A", "Comfortable shoes. And a positive attitude!", "کفش راحت. و نگرش مثبت!"),
            d("B", "Ha! I'll do my best.", "ها! تمام تلاشم را می‌کنم."),
            d("A", "That's all you can do. See you tomorrow.", "همین چیزی است که می‌توانی انجام دهی. فردا می‌بینمت."),
            d("B", "See you. And thanks for the motivation.", "می‌بینمت. و ممنون برای انگیزه."),
            d("A", "Anytime. We'll keep each other going.", "هر وقت. همدیگر را ادامه می‌دهیم."),
            d("B", "Sounds like a plan!", "برنامه خوبی به نظر می‌رسد!"),
            d("A", "Alright, I have to go to a meeting now. Talk later!", "خب، باید الان به جلسه بروم. بعداً صحبت!"),
            d("B", "No problem. Good luck with the meeting.", "مشکلی نیست. در جلسه موفق باشی."),
            d("A", "Thanks. Bye!", "ممنون. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Why can't B go to the gym today?", listOf("busy", "has to work late", "too tired", "sick"), 1),
            q("What time will they meet?", listOf("6:00", "7:00", "8:00", "5:00"), 1),
            q("What does B usually do at the gym?", listOf("weights", "cardio", "yoga", "swimming"), 1),
            q("What class does A recommend?", listOf("Tuesday evening yoga", "Monday morning spinning", "Wednesday weights", "Thursday Pilates"), 0),
            q("How often does A plan meals?", listOf("daily", "once a week", "once a month", "never"), 1),
            q("What should B bring to the gym?", listOf("water and a towel", "just a towel", "snacks", "nothing"), 0),
            q("Which is a non-action verb?", listOf("run", "know", "walk", "write"), 1),
            q("Choose the correct: You ___ come if you're busy.", listOf("mustn't", "don't have to", "can't", "shouldn't"), 1)
        ),
        idioms = listOf(
            IdiomExpression("That works", "خوبه / اشکالی ندارد", "Tomorrow works.", "فردا خوب است."),
            IdiomExpression("Focus on", "تمرکز کردن روی", "I focus on weights.", "من روی وزنه تمرکز می‌کنم."),
            IdiomExpression("Will do", "حتماً", "Bring water. — Will do.", "آب بیاور. — حتماً."),
            IdiomExpression("Do my best", "تمام تلاشم را می‌کنم", "I'll do my best.", "تمام تلاشم را می‌کنم."),
            IdiomExpression("Keep each other going", "همدیگر را ادامه دادن", "We'll keep each other going.", "همدیگر را ادامه می‌دهیم."),
            IdiomExpression("Sounds like a plan", "برنامه خوبی است", "Sounds like a plan!", "برنامه خوبی به نظر می‌رسد!")
        ),
        phrasal = listOf(
            PhrasalVerb("work out", "ورزش کردن", "exercise",
                "I work out three times a week.", "هفته‌ای سه بار ورزش می‌کنم.", "No"),
            PhrasalVerb("warm up", "گرم کردن", "prepare the body",
                "Always warm up before running.", "همیشه قبل از دویدن گرم کن.", "No"),
            PhrasalVerb("cut down on", "کم کردن مصرف", "reduce",
                "I need to cut down on sugar.", "باید مصرف شکرم را کم کنم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Have to reduction", "In natural speech, 'have to' sounds like 'hafta': I hafta work late."),
            PronunciationTip("Stress in obligations", "Stress the obligation: I HAVE to work late."),
            PronunciationTip("Compound words", "TREADmill, WORKout — stress the first syllable.")
        ),
        culture = listOf(
            CulturalNote("Gym culture",
                "In many countries, gyms are social places. It's common to chat briefly, share equipment politely, and wipe down machines after use."),
            CulturalNote("Meal planning",
                "Planning meals ahead is a growing trend in many English-speaking countries, saving both time and money.")
        ),
        mistakes = listOf(
            CommonMistake("I have to working late.", "I have to work late.", "After 'have to', use the base verb."),
            CommonMistake("I am knowing the answer.", "I know the answer.", "Non-action verbs don't usually take -ing.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are A and B planning?", "To go to the gym together at 7 PM tomorrow."),
            ComprehensionQuestion("Why is B hesitant about yoga?", "B is worried about not being flexible enough."),
            ComprehensionQuestion("What advice does A give about meal planning?", "Start small — plan just three dinners for the week.")
        ),
        speaking = listOf(
            SpeakingTask("Plan a workout with a partner.",
                "با یک دوست یک برنامه ورزشی بگذار.",
                "Do you want to...? / What time...? / I usually..."),
            SpeakingTask("Describe your daily routine and obligations.",
                "روتین روزانه و الزاماتت را توصیف کن.",
                "I have to... / I can... / I usually...")
        ),
        writing = listOf(
            WritingTask("Write your weekly fitness and diet plan.",
                "برنامه هفتگی تناسب اندام و رژیمت را بنویس.",
                140, "Include three activities and use can/have to.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 7 — On Vacation | در تعطیلات  (≈ 72 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit7() = base(
        7, "On Vacation", "در تعطیلات",
        listOf(
            "Greet someone arriving from a trip",
            "Describe travel conditions",
            "Talk about leisure activities and preferences",
            "Discuss vacation problems",
            "Use the simple past tense correctly (regular and irregular)",
            "Share travel stories"
        ),
        listOf(
            v("vacation", "تعطیلات", "We went on vacation to Italy.", "به تعطیلات به ایتالیا رفتیم."),
            v("trip", "سفر", "How was your trip?", "سفرت چطور بود؟"),
            v("flight", "پرواز", "The flight was delayed.", "پرواز تأخیر داشت."),
            v("luggage", "چمدان", "My luggage was lost.", "چمدانم گم شد."),
            v("passport", "پاسپورت", "Don't forget your passport.", "پاسپورتت را فراموش نکن."),
            v("sightseeing", "بازدید از دیدنی‌ها", "We did a lot of sightseeing.", "کلی بازدید از دیدنی‌ها کردیم."),
            v("beach", "ساحل", "The beach was beautiful.", "ساحل زیبا بود."),
            v("mountain", "کوه", "We hiked in the mountains.", "در کوه‌ها پیاده‌روی کردیم."),
            v("book", "رزرو کردن", "I booked a hotel online.", "یک هتل آنلاین رزرو کردم.", "verb"),
            v("check in", "پذیرش شدن", "We checked in at three.", "ساعت سه پذیرش شدیم.", "verb"),
            v("check out", "تسویه کردن", "We checked out at noon.", "ظهر تسویه کردیم.", "verb"),
            v("souvenir", "سوغات", "I bought souvenirs for my family.", "برای خانواده‌ام سوغات خریدم."),
            v("crowded", "شلوغ", "The city was very crowded.", "شهر خیلی شلوغ بود.", "adjective"),
            v("relaxing", "آرامش‌بخش", "The vacation was relaxing.", "تعطیلات آرامش‌بخش بود.", "adjective"),
            v("exhausting", "خسته‌کننده", "The trip was exhausting.", "سفر خسته‌کننده بود.", "adjective")
        ),
        listOf(
            GrammarSection("Simple past — regular verbs",
                "Add -ed to most regular verbs: visit → visited, watch → watched, walk → walked."),
            GrammarSection("Simple past — irregular verbs",
                "Common irregulars: go → went, eat → ate, see → saw, have → had, buy → bought."),
            GrammarSection("Was / Were",
                "Use 'was' with I, he, she, it. Use 'were' with you, we, they."),
            GrammarSection("Did questions and negatives",
                "Use 'did' + base verb for questions and 'didn't' + base verb for negatives.")
        ),
        listOf(
            d("A", "Welcome back! I feel like you were gone forever.", "خوش آمدی! حس می‌کنم برای همیشه رفته بودی."),
            d("B", "Thanks! It was only two weeks, but it felt longer.", "ممنون! فقط دو هفته بود، ولی طولانی‌تر حس شد."),
            d("A", "How was the trip? Tell me everything!", "سفرت چطور بود؟ همه چیز را بگو!"),
            d("B", "Amazing, but a bit tiring, honestly.", "فوق‌العاده، ولی راستش کمی خسته‌کننده."),
            d("A", "Where did you go exactly?", "دقیقاً کجا رفتی؟"),
            d("B", "We started in Madrid for four days, then went to Barcelona for a week.", "چهار روز در مادرید شروع کردیم، بعد یک هفته به بارسلونا رفتیم."),
            d("A", "Sounds like a great itinerary. Did you like Madrid?", "برنامه خوبی به نظر می‌رسد. مادرید را دوست داشتی؟"),
            d("B", "I loved it. The Prado Museum was incredible.", "عاشقش شدم. موزه پرادو فوق‌العاده بود."),
            d("A", "How many days did you spend there?", "چند روز آنجا بودی؟"),
            d("B", "Four days. We walked everywhere — my feet were killing me!", "چهار روز. همه جا را پیاده رفتیم — پاهایم داشت می‌مرد!"),
            d("A", "Ha! I know that feeling. What about the food?", "ها! آن حس را می‌شناسم. غذا چطور؟"),
            d("B", "Incredible. We ate tapas almost every night.", "باورنکردنی. تقریباً هر شب تاپاس خوردیم."),
            d("A", "Yum. Any favorite dishes?", "لذیذ. غذای مورد علاقه‌ای داشتی؟"),
            d("B", "The patatas bravas and the Spanish ham were amazing.", "پاتاتاس براواس و ژامبون اسپانیایی فوق‌العاده بودند."),
            d("A", "Now I'm hungry. Did you have any problems on the trip?", "الان گرسنه‌ام شد. در سفر مشکلی داشتی؟"),
            d("B", "Well, yes. Our luggage was lost for two days.", "خب، بله. چمدانمان دو روز گم شد."),
            d("A", "Oh no! That's terrible. What happened?", "اوه نه! وحشتناک است. چی شد؟"),
            d("B", "The airline misplaced it during a layover in Lisbon.", "خط هوایی در یک توقف در لیسبون گمش کرد."),
            d("A", "That's so frustrating. Did you get it back?", "خیلی آزاردهنده است. پسش گرفتی؟"),
            d("B", "Yes, on the third day. They delivered it to our hotel.", "بله، روز سوم. به هتل ما تحویلش دادند."),
            d("A", "That's a relief. I'm always worried about that happening.", "خوب شد. من همیشه نگرانم این اتفاق بیفتد."),
            d("B", "You should always pack one change of clothes in your carry-on.", "باید همیشه یک دست لباس عوض در کیف دستی‌ات بگذاری."),
            d("A", "Great tip. I'll remember that. So, how was the weather?", "نکته عالی. یادم می‌مانم. خب، هوا چطور بود؟"),
            d("B", "Perfect. Warm and sunny every single day.", "عالی. هر روز گرم و آفتابی."),
            d("A", "Lucky you. Did you go to the beach?", "چقدر خوش‌شانس. ساحل رفتی؟"),
            d("B", "Yes! We spent two full days at the beach in Valencia.", "بله! دو روز کامل در ساحل والنسیا گذراندیم."),
            d("A", "That sounds so relaxing. Did you swim?", "خیلی آرامش‌بخش به نظر می‌رسد. شنا کردی؟"),
            d("B", "Yes, the Mediterranean was beautiful. Clear and warm.", "بله، مدیترانه زیبا بود. شفاف و گرم."),
            d("A", "I'm so jealous. Did you do any sightseeing in Barcelona?", "چقدر حسودیم می‌شود. در بارسلونا بازدید از دیدنی‌ها داشتی؟"),
            d("B", "Of course! The Sagrada Familia was breathtaking.", "البته! ساگرادا فامیلیا نفس‌گیر بود."),
            d("A", "I've always wanted to see it. How long did you wait in line?", "همیشه می‌خواستم ببینمش. چقدر در صف ماندی؟"),
            d("B", "We booked tickets online, so we skipped the line.", "آنلاین بلیط رزرو کردیم، پس صف را رد کردیم."),
            d("A", "Smart. Did you take a lot of photos?", "هوشمندانه. عکس زیادی گرفتی؟"),
            d("B", "Hundreds. I'll show you some later.", "صدها. بعداً چند تا نشانت می‌دهم."),
            d("A", "I'd love that. So what was the best part of the whole trip?", "خوشحال می‌شوم. خب بهترین بخش کل سفر چی بود؟"),
            d("B", "Honestly? A quiet evening in a small plaza in Madrid.", "راستش؟ یک غروب آرام در یک میدان کوچک در مادرید."),
            d("A", "That sounds so simple and special.", "خیلی ساده و خاص به نظر می‌رسد."),
            d("B", "It was. We just sat there with wine, watching people.", "همینطور بود. فقط با شراب نشستیم و مردم را تماشا کردیم."),
            d("A", "Those are the best travel moments, aren't they?", "اینها بهترین لحظات سفر هستند، نه؟"),
            d("B", "Absolutely. Better than any monument.", "قطعاً. بهتر از هر بنایی."),
            d("A", "Would you go back to Spain?", "دوباره به اسپانیا می‌رفتی؟"),
            d("B", "In a heartbeat. There's so much more I want to see.", "بلافاصله. چیزهای زیادی هست که می‌خواهم ببینم."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Seville, Granada, and the south. Maybe next spring.", "سویا، گرانادا، و جنوب. شاید بهار آینده."),
            d("A", "That sounds like a great plan. I'd love to go with you.", "برنامه عالی به نظر می‌رسد. دوست دارم با تو بیایم."),
            d("B", "That would be so fun! Let's start planning.", "خیلی سرگرم‌کننده می‌شود! بیایید برنامه‌ریزی را شروع کنیم."),
            d("A", "Definitely. But first, you need to rest from this trip!", "قطعاً. ولی اول، باید از این سفر استراحت کنی!"),
            d("B", "Ha! You're right. I'm still recovering.", "ها! حق داری. هنوز در حال بازیابی هستم."),
            d("A", "Jet lag is no joke.", "جت‌لگ شوخی نیست."),
            d("B", "Tell me about it. I slept twelve hours last night.", "بگو چه خبر. دیشب دوازده ساعت خوابیدم."),
            d("A", "Good for you. So, are you working tomorrow?", "خوب برایت. خب فردا کار می‌کنی؟"),
            d("B", "Unfortunately, yes. Back to reality.", "متأسفانه، بله. برگشت به واقعیت."),
            d("A", "That's tough after vacation. Well, let's grab lunch soon.", "بعد از تعطیلات سخته. خب، بیایید به‌زودی ناهار بخوریم."),
            d("B", "Yes, let's. I'll tell you more stories over lunch.", "بله، بیایید. سر ناهار داستان‌های بیشتری می‌گویم."),
            d("A", "Deal. See you soon!", "قبول. به‌زودی می‌بینمت!"),
            d("B", "See you. And thanks for the welcome back!", "می‌بینمت. و ممنون برای خوش‌آمدگویی!"),
            d("A", "Anytime. Send me those photos!", "هر وقت. آن عکس‌ها را برایم بفرست!"),
            d("B", "Will do. Tonight.", "حتماً. امشب."),
            d("A", "Perfect. Talk later!", "عالی. بعداً صحبت!"),
            d("B", "Talk later!", "بعداً صحبت!")
        ),
        listOf(
            q("Where did B go on vacation?", listOf("Italy", "Spain", "France", "Portugal"), 1),
            q("Which two cities did B visit?", listOf("Madrid and Valencia", "Madrid and Barcelona", "Barcelona and Seville", "Valencia and Madrid"), 1),
            q("What problem did B have?", listOf("lost passport", "missed flight", "lost luggage", "bad weather"), 2),
            q("How long was the luggage lost?", listOf("one day", "two days", "three days", "a week"), 1),
            q("What was B's favorite dish?", listOf("paella", "tortilla", "patatas bravas and ham", "gazpacho"), 2),
            q("What was the best part of the trip?", listOf("the Sagrada Familia", "an evening in a small plaza", "the beach", "the food"), 1),
            q("Where did the airline lose the luggage?", listOf("Madrid", "Barcelona", "Lisbon", "Valencia"), 2),
            q("How many hours did B sleep last night?", listOf("8", "10", "12", "14"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Welcome back", "خوش آمدی", "Welcome back! How was your trip?", "خوش آمدی! سفرت چطور بود؟"),
            IdiomExpression("Lucky you", "چقدر خوش‌شانس", "Lucky you! Warm and sunny!", "چقدر خوش‌شانس! گرم و آفتابی!"),
            IdiomExpression("That's a relief", "خوب شد", "They found the luggage. That's a relief.", "چمدان را پیدا کردند. خوب شد."),
            IdiomExpression("In a heartbeat", "بلافاصله", "I'd go back in a heartbeat.", "بلافاصله برمی‌گشتم."),
            IdiomExpression("Jet lag is no joke", "جت‌لگ شوخی نیست", "I'm still tired. Jet lag is no joke.", "هنوز خسته‌ام. جت‌لگ شوخی نیست."),
            IdiomExpression("Back to reality", "برگشت به واقعیت", "Back to reality tomorrow.", "فردا برگشت به واقعیت."),
            IdiomExpression("My feet were killing me", "پاهایم داشت می‌مرد", "We walked so much, my feet were killing me.", "کلی پیاده رفتیم، پاهایم داشت می‌مرد.")
        ),
        phrasal = listOf(
            PhrasalVerb("check in", "پذیرش شدن", "register at a hotel/airport",
                "We checked in at three.", "ساعت سه پذیرش شدیم.", "No"),
            PhrasalVerb("check out", "تسویه کردن", "leave a hotel",
                "We checked out at noon.", "ظهر تسویه کردیم.", "No"),
            PhrasalVerb("come back", "برگشتن", "return",
                "I didn't want to come back!", "نمی‌خواستم برگردم!", "Yes"),
            PhrasalVerb("show around", "گرداندن", "give a tour",
                "Let me show you around the city.", "بگذار شهر را بهت نشان بدهم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("-ed endings", "Three sounds of -ed: /t/ (watched), /d/ (played), /ɪd/ (visited)."),
            PronunciationTip("Did reduction", "'Did you' → /dɪdʒə/: Did you go? → /dɪdʒə goʊ/"),
            PronunciationTip("Spanish loanwords", "Practice: Paella /paˈeɪjə/, Barcelona /bɑrsəˈloʊnə/, Madrid /məˈdrɪd/.")
        ),
        culture = listOf(
            CulturalNote("Travel talk",
                "Asking 'How was your trip?' is a common friendly question. Follow-up questions about food, weather, and sights are expected."),
            CulturalNote("Packing tips",
                "Experienced travelers always pack essentials in their carry-on in case checked luggage is lost.")
        ),
        mistakes = listOf(
            CommonMistake("Did you went?", "Did you go?", "After 'did', use the base verb."),
            CommonMistake("I didn't had time.", "I didn't have time.", "After 'didn't', use the base verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What happened to B's luggage?", "It was lost for two days during a Lisbon layover, then delivered to the hotel."),
            ComprehensionQuestion("What was B's best travel moment?", "A quiet evening with wine in a small plaza in Madrid."),
            ComprehensionQuestion("What are B's future travel plans?", "Seville, Granada, and southern Spain next spring.")
        ),
        speaking = listOf(
            SpeakingTask("Tell a partner about your last vacation.",
                "درباره آخرین تعطیلاتت به یک دوست بگو.",
                "I went to... / It was... / I visited..."),
            SpeakingTask("Ask a partner about their trip.",
                "از یک دوست درباره سفرش بپرس.",
                "Where did you go? / Did you like it? / What did you do?")
        ),
        writing = listOf(
            WritingTask("Write a short travel story about your last trip.",
                "داستان کوتاه سفر آخرت را بنویس.",
                150, "Use at least six past-tense verbs and mention one problem.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 8 — Shopping for Clothes | خرید لباس  (≈ 70 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit8() = base(
        8, "Shopping for Clothes", "خرید لباس",
        listOf(
            "Discuss where you shop and why",
            "Ask a clerk for help",
            "Shop for clothes and pay for them",
            "Ask for and give directions within a building",
            "Discuss culturally appropriate dress",
            "Use descriptive adjectives correctly"
        ),
        listOf(
            v("department store", "فروشگاه بزرگ", "I bought it at a department store.", "در یک فروشگاه بزرگ خریدمش."),
            v("fitting room", "اتاق پرو", "The fitting rooms are over there.", "اتاق‌های پرو آنجا هستند."),
            v("clerk", "فروشنده", "The clerk was very helpful.", "فروشنده خیلی کمک‌کننده بود."),
            v("cashier", "صندوق‌دار", "Pay at the cashier, please.", "لطفاً در صندوق پرداخت کنید."),
            v("on sale", "در حراج", "These shoes are on sale.", "این کفش‌ها در حراج هستند."),
            v("discount", "تخفیف", "Is there a discount for students?", "تخفیفی برای دانشجویان هست؟"),
            v("receipt", "رسید", "Keep your receipt.", "رسیدت را نگه دار."),
            v("refund", "بازپرداخت", "Can I get a refund?", "می‌توانم بازپرداخت بگیرم؟"),
            v("exchange", "تعویض", "I'd like to exchange this shirt.", "می‌خواهم این پیراهن را تعویض کنم.", "verb"),
            v("try on", "پرو کردن", "Can I try this on?", "می‌توانم این را پرو کنم؟", "verb"),
            v("fit", "اندازه بودن", "These pants don't fit.", "این شلوار اندازه نیست.", "verb"),
            v("style", "سبک / مدل", "I like this style.", "این سبک را دوست دارم."),
            v("brand", "برند", "It's an expensive brand.", "برند گرانی است."),
            v("colorful", "رنگارنگ", "She likes colorful clothes.", "او لباس‌های رنگارنگ دوست دارد.", "adjective"),
            v("casual", "غیررسمی", "I prefer casual clothes.", "من لباس‌های غیررسمی را ترجیح می‌دهم.", "adjective")
        ),
        listOf(
            GrammarSection("Contrastive stress",
                "Use stress to clarify or compare: I said the BLUE one, not the red one."),
            GrammarSection("Adjective placement",
                "Adjectives go before nouns: opinion → size → age → color → origin → material."),
            GrammarSection("Too / Enough",
                "Use 'too' + adjective (too expensive, too small) and adjective + 'enough' (big enough)."),
            GrammarSection("Making requests in a store",
                "Can I try this on? Could you show me a smaller size? Do you have this in blue?")
        ),
        listOf(
            d("A", "Excuse me, can you help me with something?", "ببخشید، می‌توانی در چیزی کمکم کنی؟"),
            d("B", "Of course. What are you looking for?", "حتماً. دنبال چه هستی؟"),
            d("A", "I need a dress for a wedding next weekend.", "برای عروسی آخر هفته آینده یک لباس لازم دارم."),
            d("B", "How exciting! What kind of wedding is it?", "چقدر هیجان‌انگیز! چه نوع عروسی است؟"),
            d("A", "An afternoon garden wedding. Formal but not too formal.", "یک عروسی باغی بعدازظهر. رسمی ولی نه خیلی رسمی."),
            d("B", "I know exactly the section for you. Follow me, please.", "دقیقاً بخش مناسب برای شما را می‌شناسم. لطفاً با من بیایید."),
            d("A", "Thank you. What size do you think I need?", "ممنون. فکر می‌کنی چه سایزی لازم دارم؟"),
            d("B", "You look like a medium. Maybe a small. We'll try both.", "به نظر می‌رسد مدیوم هستید. شاید اسمال. هر دو را امتحان می‌کنیم."),
            d("A", "Sounds good. What colors are popular right now?", "خوبه. الان چه رنگ‌هایی محبوب هستند؟"),
            d("B", "Soft pastels for daytime weddings. But dark colors also work.", "پاستل‌های ملایم برای عروسی‌های روزانه. ولی رنگ‌های تیره هم خوبه."),
            d("A", "I prefer darker colors. Navy or dark green maybe.", "من رنگ‌های تیره‌تر را ترجیح می‌دهم. سرمه‌ای یا سبز تیره شاید."),
            d("B", "We have some lovely options in those colors. Here's a navy dress.", "گزینه‌های قشنگی در آن رنگ‌ها داریم. این یک لباس سرمه‌ای."),
            d("A", "Oh, that's beautiful. It's exactly my style.", "اوه، قشنگه. دقیقاً سبک من است."),
            d("B", "It's also on sale right now — twenty percent off.", "همچنین الان در حراج است — بیست درصد تخفیف."),
            d("A", "Really? That's lucky. Can I try it on?", "واقعاً؟ خوش‌شانسی. می‌توانم پرو کنم؟"),
            d("B", "Absolutely. The fitting rooms are just over there, to your right.", "قطعاً. اتاق‌های پرو دقیقاً آنجا، سمت راست شما هستند."),
            d("A", "Thanks. I'll be right back.", "ممنون. الان برمی‌گردم."),
            d("A", "(after trying) It's a bit too tight around the waist.", "(بعد از پرو) دور کمر کمی تنگ است."),
            d("B", "Let me get you a larger size. Would you like a large or an extra large?", "سایز بزرگتر می‌آورم. لارج می‌خواهید یا ایکس‌لارج؟"),
            d("A", "Let's try a large first.", "بیایید اول لارج را امتحان کنیم."),
            d("B", "Here you go. Take your time.", "بفرمایید. عجله نکنید."),
            d("A", "(returning) The large fits perfectly!", "(برمی‌گردد) لارج کاملاً اندازه است!"),
            d("B", "It looks wonderful on you.", "خیلی به شما می‌آید."),
            d("A", "Thank you. How much does it come to with the discount?", "ممنون. با تخفیف چقدر می‌شود؟"),
            d("B", "Original price was two hundred. With twenty percent off, it's one-sixty.", "قیمت اصلی دویست بود. با بیست درصد تخفیف، صد و شصت می‌شود."),
            d("A", "Great. Do you have matching shoes?", "عالی. کفش هماهنگ دارید؟"),
            d("B", "Yes, we do. What size are your feet?", "بله، داریم. سایز پایتان چند است؟"),
            d("A", "Usually a 38.", "معمولاً ۳۸."),
            d("B", "Let's go to the shoe section. It's on the second floor.", "بیایید به بخش کفش برویم. در طبقه دوم است."),
            d("A", "How do I get to the second floor?", "چطور به طبقه دوم بروم؟"),
            d("B", "Take the escalator in the middle of the store. Or the elevator if you prefer.", "از پله برقی وسط فروشگاه بروید. یا آسانسور اگر ترجیح می‌دهید."),
            d("A", "I'll take the elevator. Are there any navy shoes?", "آسانسور می‌روم. کفش سرمه‌ای هست؟"),
            d("B", "Yes, several styles. I'll show you once we're there.", "بله، چند سبک. وقتی رسیدیم نشانتان می‌دهم."),
            d("A", "(later) These pumps are perfect. How much are they?", "(بعداً) این کفش‌های پاشنه‌دار عالی هستند. چقدر هستند؟"),
            d("B", "One hundred and twenty. Not on sale, I'm afraid.", "صد و بیست. متأسفانه در حراج نیستند."),
            d("A", "That's a bit expensive. Any chance of a discount?", "کمی گران است. شانسی برای تخفیف هست؟"),
            d("B", "If you buy both the dress and shoes, I can offer ten percent off the shoes.", "اگر هم لباس و هم کفش بخرید، می‌توانم ده درصد تخفیف روی کفش بدهم."),
            d("A", "That's a deal. I'll take both.", "قبول است. هر دو را می‌خرم."),
            d("B", "Wonderful. The cashier is at the front on the ground floor.", "عالی. صندوق‌دار در جلوی طبقه همکف است."),
            d("A", "One more question — what's your return policy?", "یک سؤال دیگر — سیاست بازگشتتان چیست؟"),
            d("B", "You can return or exchange within thirty days with the receipt.", "تا سی روز با رسید می‌توانید برگردانید یا تعویض کنید."),
            d("A", "And can I get a full refund?", "و می‌توانم بازپرداخت کامل بگیرم؟"),
            d("B", "Yes, as long as the tags are still attached.", "بله، تا زمانی که برچسب‌ها هنوز وصل باشند."),
            d("A", "Perfect. Thank you so much for your help.", "عالی. خیلی ممنون برای کمکتان."),
            d("B", "My pleasure. Enjoy the wedding!", "خواهش می‌کنم. از عروسی لذت ببرید!"),
            d("A", "(at the cashier) Hi, I'd like to pay for these.", "(در صندوق) سلام، می‌خواهم این‌ها را پرداخت کنم."),
            d("C", "Of course. Would you like a bag?", "حتماً. کیف می‌خواهید؟"),
            d("A", "Yes, please. And could you put the receipt in the bag?", "بله، لطفاً. و می‌توانید رسید را در کیف بگذارید؟"),
            d("C", "Absolutely. Your total is two hundred and sixty-eight dollars.", "قطعاً. جمع کلتان دویست و شصت و هشت دلار است."),
            d("A", "Here's my card.", "کارتم."),
            d("C", "Thank you. Here's your receipt and bag. Have a great day!", "ممنون. رسید و کیفتان. روز خوبی داشته باشید!"),
            d("A", "You too. Thanks again!", "شما هم. باز هم ممنون!"),
            d("B", "Come back soon!", "به‌زودی برگردید!"),
            d("A", "I will. I love this store.", "برمی‌گردم. عاشق این فروشگاهم."),
            d("B", "We're glad to hear it!", "خوشحالیم که می‌شنویم!"),
            d("A", "See you next time!", "دفعه بعد می‌بینمت!"),
            d("B", "Take care!", "مراقب باش!"),
            d("A", "You too. Bye!", "تو هم. خداحافظ!"),
            d("B", "Goodbye!", "خداحافظ!")
        ),
        listOf(
            q("What is A looking for?", listOf("a shirt", "a dress", "a jacket", "shoes"), 1),
            q("What kind of wedding is it?", listOf("evening formal", "garden afternoon", "beach", "indoor formal"), 1),
            q("What colors does A prefer?", listOf("bright colors", "dark colors", "pastels", "white"), 1),
            q("What's the original price of the dress?", listOf("$150", "$180", "$200", "$220"), 2),
            q("What discount is on the dress?", listOf("10%", "15%", "20%", "25%"), 2),
            q("What discount does A get on the shoes?", listOf("5%", "10%", "15%", "20%"), 1),
            q("How long is the return window?", listOf("14 days", "30 days", "60 days", "no returns"), 1),
            q("What must be attached for a full refund?", listOf("receipt", "tags", "box", "warranty"), 1)
        ),
        idioms = listOf(
            IdiomExpression("It looks great on you", "بهت می‌آید", "It looks great on you.", "خیلی بهت می‌آید."),
            IdiomExpression("I'll take it", "می‌خرمش", "That's a good deal. I'll take it.", "معامله خوبی است. می‌خرمش."),
            IdiomExpression("One more thing", "یک چیز دیگر", "One more thing — can I return it?", "یک چیز دیگر — می‌توانم برگردانم؟"),
            IdiomExpression("Be right back", "الان برمی‌گردم", "I'll be right back.", "الان برمی‌گردم."),
            IdiomExpression("Take your time", "عجله نکن", "Here you go. Take your time.", "بفرمایید. عجله نکنید."),
            IdiomExpression("That's a deal", "قبول است", "That's a deal. I'll take both.", "قبول است. هر دو را می‌خرم.")
        ),
        phrasal = listOf(
            PhrasalVerb("try on", "پرو کردن", "put on clothes to check fit",
                "Can I try this on?", "می‌توانم این را پرو کنم؟", "No"),
            PhrasalVerb("take back", "برگرداندن", "return something to a store",
                "I need to take back this shirt.", "باید این پیراهن را برگردانم.", "No"),
            PhrasalVerb("look for", "دنبال چیزی گشتن", "search",
                "I'm looking for a dress.", "دنبال یک لباس هستم.", "No"),
            PhrasalVerb("come to", "مجموع شدن", "total",
                "How much does it come to?", "جمعش چقدر می‌شود؟", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Contrastive stress", "I want the BLUE one, not the RED one."),
            PronunciationTip("Silent letters in clothing words", "'clothes' /kloʊðz/, 'button' /ˈbʌtn/"),
            PronunciationTip("Prices", "$268 → 'two sixty-eight' or 'two hundred and sixty-eight'.")
        ),
        culture = listOf(
            CulturalNote("Return policies",
                "In the US and UK, most stores allow returns within 30 days with a receipt."),
            CulturalNote("Sales seasons",
                "Major sales happen after Christmas, in summer (July), and on Black Friday (November).")
        ),
        mistakes = listOf(
            CommonMistake("Can I try this cloth on?", "Can I try this on?", "'Cloth' is the material."),
            CommonMistake("It fits me good.", "It fits me well.", "Use 'well' (adverb), not 'good'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did A buy and why?", "A navy dress and matching shoes for a garden wedding."),
            ComprehensionQuestion("What is the total cost?", "$268 after discounts."),
            ComprehensionQuestion("What is the return policy?", "Return or exchange within 30 days with receipt and attached tags.")
        ),
        speaking = listOf(
            SpeakingTask("Role-play shopping for clothes with a partner.",
                "با یک دوست نقش خرید لباس را بازی کنید.",
                "Can I try this on? / Do you have this in...? / How much is it?"),
            SpeakingTask("Describe your favorite outfit and why you like it.",
                "ست لباس مورد علاقه‌ات را توصیف کن و بگو چرا دوستش داری.",
                "My favorite outfit is... / I like it because...")
        ),
        writing = listOf(
            WritingTask("Write an online review of a clothing store.",
                "نقد آنلاین یک فروشگاه لباس بنویس.",
                130, "Include selection, prices, service, and your recommendation.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 9 — Taking Transportation | حمل‌ونقل  (≈ 72 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit9() = base(
        9, "Taking Transportation", "استفاده از حمل‌ونقل",
        listOf(
            "Discuss schedules and buy tickets",
            "Ask for and give travel advice",
            "Book travel services",
            "Discuss travel plans",
            "Describe transportation problems",
            "Use intonation for alternatives"
        ),
        listOf(
            v("schedule", "برنامه زمانی", "What's the flight schedule?", "برنامه زمانی پرواز چیست؟"),
            v("departure", "خروج", "Departure is at 9 AM.", "خروج ساعت ۹ صبح است."),
            v("arrival", "ورود", "Arrival is at noon.", "ورود سر ظهر است."),
            v("one-way", "یک‌طرفه", "I need a one-way ticket.", "یک بلیط یک‌طرفه لازم دارم."),
            v("round-trip", "رفت و برگشت", "Round-trip tickets are cheaper.", "بلیط‌های رفت و برگشت ارزان‌ترند."),
            v("layover", "توقف بین راه", "I have a two-hour layover in Paris.", "دو ساعت توقف در پاریس دارم."),
            v("gate", "گیت", "Boarding at gate 12.", "سوار شدن در گیت ۱۲."),
            v("delayed", "تأخیری", "The flight is delayed.", "پرواز تأخیر دارد.", "adjective"),
            v("book", "رزرو کردن", "I booked a train ticket.", "یک بلیط قطار رزرو کردم.", "verb"),
            v("platform", "سکو", "The train leaves from platform 5.", "قطار از سکوی ۵ حرکت می‌کند."),
            v("subway", "مترو", "The subway is fast and cheap.", "مترو سریع و ارزان است."),
            v("fare", "کرایه", "The fare is two dollars.", "کرایه دو دلار است."),
            v("transfer", "تعویض خط", "You need to transfer at the next stop.", "باید در ایستگاه بعدی تعویض کنی."),
            v("on time", "سر وقت", "The bus was on time.", "اتوبوس سر وقت بود."),
            v("rush hour", "ساعت شلوغی", "Avoid the subway during rush hour.", "در ساعت شلوغی از مترو پرهیز کن.")
        ),
        listOf(
            GrammarSection("Intonation of alternatives",
                "Use rising for the first option and falling for the second: Window seat ↗ or aisle seat ↘?"),
            GrammarSection("Polite requests for travel services",
                "Could I book a ticket? I'd like to reserve a room. Can you help me with my reservation?"),
            GrammarSection("Describing problems",
                "The flight was delayed. My luggage didn't arrive. I missed my connection."),
            GrammarSection("Time expressions for travel",
                "Use 'at' for exact times, 'on' for days, 'by' for deadlines.")
        ),
        listOf(
            d("A", "Hi, I'd like to book a ticket to Chicago, please.", "سلام، می‌خواهم یک بلیط به شیکاگو رزرو کنم، لطفاً."),
            d("B", "Of course. One-way or round-trip?", "حتماً. یک‌طرفه یا رفت و برگشت؟"),
            d("A", "Round-trip, please. Leaving Friday morning and returning Sunday evening.", "رفت و برگشت، لطفاً. جمعه صبح رفتن و یکشنبه عصر برگشتن."),
            d("B", "Let me check availability. Do you have a preferred airline?", "بگذار موجودی را چک کنم. خط هوایی خاصی مدنظرتان است؟"),
            d("A", "No preference. Just whatever is most convenient.", "نه، فرقی نمی‌کند. هر چیزی که راحت‌تر باشد."),
            d("B", "Alright. Would you prefer a morning or afternoon departure?", "خب. صبح ترجیح می‌دهید یا بعدازظهر؟"),
            d("A", "Morning, if possible. The earlier the better.", "صبح، اگر ممکن است. هرچه زودتر بهتر."),
            d("B", "There's a 6:30 AM flight that's usually on time.", "یک پرواز ۶:۳۰ صبح هست که معمولاً سر وقت است."),
            d("A", "That works. How long is the flight?", "خوبه. پرواز چقدر طول می‌کشد؟"),
            d("B", "About two hours and fifteen minutes.", "حدود دو ساعت و ربع."),
            d("A", "Any layovers?", "توقف بین راه دارد؟"),
            d("B", "No, it's a direct flight.", "نه، مستقیم است."),
            d("A", "Perfect. What's the arrival time?", "عالی. زمان ورود کی است؟"),
            d("B", "8:45 AM local time.", "۸:۴۵ صبح به وقت محلی."),
            d("A", "Great. And the return on Sunday?", "عالی. و برگشت یکشنبه؟"),
            d("B", "There's a 7 PM return flight arriving at 9:15.", "یک پرواز برگشت ۱۹:۰۰ هست که ۲۱:۱۵ می‌رسد."),
            d("A", "That works. What's the total fare?", "خوبه. کرایه کل چقدر است؟"),
            d("B", "Three hundred and twenty dollars round-trip.", "سیصد و بیست دلار رفت و برگشت."),
            d("A", "That's reasonable. I'll book both flights.", "منطقی است. هر دو پرواز را رزرو می‌کنم."),
            d("B", "May I have your name and passport number, please?", "لطفاً نام و شماره پاسپورتتان؟"),
            d("A", "Sure. Mark Stevens, passport P-234567.", "حتماً. مارک استیونز، پاسپورت P-234567."),
            d("B", "Thank you. Do you have a frequent flyer number?", "ممنون. شماره مسافر دائمی دارید؟"),
            d("A", "Yes, I do. Let me find it... It's F-A-9-8-7-6.", "بله. بگذار پیدایش کنم... F-A-9-8-7-6."),
            d("B", "Perfect. You'll earn miles on both flights.", "عالی. در هر دو پرواز مایل جمع می‌کنید."),
            d("A", "Great. What time should I be at the airport?", "عالی. چه ساعتی باید در فرودگاه باشم؟"),
            d("B", "Two hours before departure for domestic flights.", "دو ساعت قبل از خروج برای پروازهای داخلی."),
            d("A", "So 4:30 AM? That's early.", "یعنی ۴:۳۰ صبح؟ زوده."),
            d("B", "It is. But you'll have time for security and breakfast.", "هست. ولی وقت برای امنیت و صبحانه دارید."),
            d("A", "Fair enough. Is there a later morning flight?", "قبول. پرواز صبح دیرتری هست؟"),
            d("B", "There's a 9 AM flight, but it has a one-hour layover in Denver.", "پرواز ۹ صبح هست، ولی یک ساعت توقف در دنور دارد."),
            d("A", "Hmm. Which would you choose?", "هوم. کدام را انتخاب می‌کردید؟"),
            d("B", "Personally, I'd take the 6:30 direct flight. Faster overall.", "شخصاً پرواز مستقیم ۶:۳۰ را می‌گرفتم. در کل سریع‌تر."),
            d("A", "Good point. I'll stick with the 6:30.", "نکته خوبی. با ۶:۳۰ می‌مانم."),
            d("B", "Excellent. Your confirmation number is 8XY9Z.", "عالی. شماره تأییدتان 8XY9Z است."),
            d("A", "Got it. Can I check in online?", "متوجه شدم. می‌توانم آنلاین پذیرش شوم؟"),
            d("B", "Yes, 24 hours before departure. You'll get an email reminder.", "بله، ۲۴ ساعت قبل از خروج. ایمیل یادآور می‌گیرید."),
            d("A", "Great. Do I need to print the ticket?", "عالی. باید بلیط را چاپ کنم؟"),
            d("B", "No, a mobile boarding pass is fine.", "نه، کارت پرواز موبایلی کافیه."),
            d("A", "Perfect. Oh, one more question. What's the luggage allowance?", "عالی. اوه، یک سؤال دیگر. مجاز چمدان چقدر است؟"),
            d("B", "One carry-on and one checked bag up to 50 pounds.", "یک کیف دستی و یک چمدان تا ۵۰ پوند."),
            d("A", "And is there a fee for extra luggage?", "و برای چمدان اضافه هزینه‌ای هست؟"),
            d("B", "Yes, thirty dollars for the first extra bag.", "بله، سی دلار برای اولین چمدان اضافه."),
            d("A", "Good to know. I'll pack light.", "خوب است بدانم. سبک بار می‌بندم."),
            d("B", "Smart. Anything else I can help with?", "هوشمندانه. چیز دیگری هست که کمک کنم؟"),
            d("A", "I don't think so. You've been very helpful.", "فکر نمی‌کنم. خیلی کمک‌کننده بودید."),
            d("B", "My pleasure. Have a great trip!", "خواهش می‌کنم. سفر خوبی داشته باشید!"),
            d("A", "Thank you. See you on Sunday for the return.", "ممنون. یکشنبه برای برگشت می‌بینمتان."),
            d("B", "We'll be here. Safe travels!", "اینجا خواهیم بود. سفر امن!"),
            d("A", "Thanks. Goodbye!", "ممنون. خداحافظ!"),
            d("B", "Goodbye!", "خداحافظ!")
        ),
        listOf(
            q("What type of ticket does A buy?", listOf("one-way", "round-trip", "open", "first class"), 1),
            q("What time is the outbound flight?", listOf("6:30 AM", "8:30 AM", "9:00 AM", "noon"), 0),
            q("Is there a layover on the outbound?", listOf("yes, Denver", "yes, Chicago", "no, direct", "yes, Paris"), 2),
            q("How much is the round-trip fare?", listOf("$220", "$320", "$420", "$520"), 1),
            q("What is the confirmation number?", listOf("8XY9Z", "F-A-9876", "P-234567", "50X"), 0),
            q("How early should A be at the airport?", listOf("1 hour", "1.5 hours", "2 hours", "3 hours"), 2),
            q("What's the luggage allowance?", listOf("1 carry-on only", "1 carry-on + 1 checked", "2 checked bags", "no limit"), 1),
            q("How much is the first extra bag?", listOf("$20", "$30", "$40", "free"), 1)
        ),
        idioms = listOf(
            IdiomExpression("One-way or round-trip?", "یک‌طرفه یا رفت و برگشت؟", "One-way or round-trip?", "یک‌طرفه یا رفت و برگشت؟"),
            IdiomExpression("If possible", "اگر ممکن است", "Morning, if possible.", "صبح، اگر ممکن است."),
            IdiomExpression("That's reasonable", "منطقی است", "That's reasonable. I'll book it.", "منطقی است. رزروش می‌کنم."),
            IdiomExpression("Stick with", "با ... ماندن", "I'll stick with the 6:30 flight.", "با پرواز ۶:۳۰ می‌مانم."),
            IdiomExpression("Fair enough", "قبول", "Fair enough. Is there a later flight?", "قبول. پرواز دیرتری هست؟"),
            IdiomExpression("Pack light", "سبک بار بستن", "I'll pack light.", "سبک بار می‌بندم."),
            IdiomExpression("Safe travels", "سفر امن", "Safe travels!", "سفر امن!")
        ),
        phrasal = listOf(
            PhrasalVerb("check in", "پذیرش شدن", "register at airport",
                "Check in two hours before departure.", "دو ساعت قبل از خروج پذیرش شو.", "No"),
            PhrasalVerb("take off", "بلند شدن هواپیما", "leave the ground",
                "The plane took off on time.", "هواپیما سر وقت بلند شد.", "No"),
            PhrasalVerb("pick up", "سوار کردن", "give a ride",
                "Can you pick me up at the airport?", "می‌توانی مرا از فرودگاه بگیری؟", "No"),
            PhrasalVerb("stop over", "توقف کوتاه داشتن", "have a layover",
                "We stopped over in Denver.", "در دنور توقف داشتیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Intonation of alternatives", "Morning ↗ or afternoon ↘?"),
            PronunciationTip("Numbers and times", "Practice: three twenty, three-thirty, three thirteen."),
            PronunciationTip("Letter-by-letter codes", "Passport P-234567 → 'P two three four five six seven'.")
        ),
        culture = listOf(
            CulturalNote("Airport etiquette",
                "Arrive 2 hours before international flights and 90 minutes before domestic flights."),
            CulturalNote("Frequent flyer programs",
                "Most airlines offer loyalty programs where travelers earn miles for free flights or upgrades.")
        ),
        mistakes = listOf(
            CommonMistake("I want to reserve a ticket.", "I'd like to book a ticket.", "'Book' is more common for travel."),
            CommonMistake("The flight is delay.", "The flight is delayed.", "Use adjective 'delayed', not noun 'delay'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What flights did A book?", "6:30 AM outbound and 7 PM return, both direct to Chicago."),
            ComprehensionQuestion("What is the baggage allowance?", "One carry-on and one checked bag up to 50 pounds."),
            ComprehensionQuestion("Why did A choose the 6:30 AM flight?", "It's direct and faster than the 9 AM with a Denver layover.")
        ),
        speaking = listOf(
            SpeakingTask("Role-play booking a flight with a partner.",
                "با یک دوست نقش رزرو پرواز را بازی کنید.",
                "I'd like to book... / One-way or round-trip? / What's the fare?"),
            SpeakingTask("Describe a transportation problem you've experienced.",
                "مشکلی در حمل‌ونقل که تجربه کرده‌ای توصیف کن.",
                "The flight was... / I missed... / It was delayed...")
        ),
        writing = listOf(
            WritingTask("Write a travel itinerary for a weekend trip.",
                "برنامه سفر آخر هفته بنویس.",
                130, "Include departure, arrival, transportation, and one activity.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // UNIT 10 — Shopping Smart | خرید هوشمند  (≈ 70 خط)
    // ═══════════════════════════════════════════════════════════
    private fun unit10() = base(
        10, "Shopping Smart", "خرید هوشمند",
        listOf(
            "Ask for and give a recommendation",
            "Discuss price ranges and budgets",
            "Bargain for a lower price",
            "Discuss tipping customs",
            "Describe a shopping experience",
            "Use rising intonation to clarify information"
        ),
        listOf(
            v("budget", "بودجه", "My budget is five hundred dollars.", "بودجه‌ام پانصد دلار است."),
            v("bargain", "معامله خوب", "This jacket was a real bargain.", "این کت واقعاً معامله خوبی بود."),
            v("haggle", "چانه زدن", "You can haggle at the market.", "می‌توانی در بازار چانه بزنی.", "verb"),
            v("discount", "تخفیف", "Can you give me a discount?", "می‌توانی تخفیف بدهی؟"),
            v("warranty", "گارانتی", "The warranty is two years.", "گارانتی دو ساله است."),
            v("refund", "بازپرداخت", "I asked for a full refund.", "درخواست بازپرداخت کامل کردم."),
            v("used", "دست دوم", "I bought a used car.", "یک ماشین دست دوم خریدم.", "adjective"),
            v("brand-new", "نو", "It's brand-new, still in the box.", "نو است، هنوز در جعبه.", "adjective"),
            v("quality", "کیفیت", "Quality matters more than price.", "کیفیت مهم‌تر از قیمت است."),
            v("expensive", "گران", "That watch is too expensive.", "آن ساعت خیلی گران است.", "adjective"),
            v("affordable", "قابل پرداخت", "They have affordable options.", "گزینه‌های مقرون‌به‌صرفه دارند.", "adjective"),
            v("worth it", "ارزشش را داشتن", "It's expensive, but worth it.", "گران است، ولی ارزشش را دارد."),
            v("custom", "رسم", "Tipping is a custom in the US.", "انعام دادن در آمریکا یک رسم است."),
            v("tipping", "انعام دادن", "Tipping is expected in restaurants.", "انعام در رستوران‌ها انتظار می‌رود."),
            v("service charge", "هزینه سرویس", "There's a 10% service charge.", "۱۰٪ هزینه سرویس هست.")
        ),
        listOf(
            GrammarSection("Rising intonation to clarify",
                "Did you say FIFTEEN ↗ or FIFTY ↘? Twenty dollars ↗ or thirty ↘?"),
            GrammarSection("Making and responding to recommendations",
                "I recommend... / You should try... / Have you considered...?"),
            GrammarSection("Discourse markers for shopping stories",
                "Use 'First', 'Then', 'After that', 'Finally' to narrate."),
            GrammarSection("Money expressions",
                "It's worth it. It's a rip-off. It's a steal. It's overpriced. It's a good deal.")
        ),
        listOf(
            d("A", "Hey, you're good with gadgets. Can I ask for some advice?", "هی، تو با گجت‌ها خوبی. می‌توانم مشورت بخواهم؟"),
            d("B", "Of course. What are you looking for?", "حتماً. دنبال چی هستی؟"),
            d("A", "I'm thinking of buying a new camera. My old one finally broke.", "فکر خرید یک دوربین جدید هستم. قدیمی‌ام بالاخره خراب شد."),
            d("B", "What's your budget?", "بودجه‌ات چقدر است؟"),
            d("A", "Around five hundred dollars. Maybe up to six hundred.", "حدود پانصد دلار. شاید تا ششصد."),
            d("B", "That's a good range. What will you mainly use it for?", "محدوده خوبی است. بیشتر برای چه استفاده می‌کنی؟"),
            d("A", "Mostly travel photos and family events. Nothing too professional.", "بیشتر عکس‌های سفر و مراسم خانوادگی. چیزی خیلی حرفه‌ای نه."),
            d("B", "For that price and use, I'd recommend the Canon EOS. It's a great value.", "برای آن قیمت و استفاده، Canon EOS را توصیه می‌کنم. ارزش خوبی دارد."),
            d("A", "I've heard good things about Canon. Is it good for beginners?", "چیزهای خوبی درباره Canon شنیده‌ام. برای مبتدی‌ها خوب است؟"),
            d("B", "Yes, very user-friendly. The auto mode is excellent.", "بله، خیلی کاربرپسند. حالت اتوماتیکش عالیه."),
            d("A", "Does it also have manual mode?", "حالت دستی هم دارد؟"),
            d("B", "Yes, so you can grow into it as your skills improve.", "بله، پس با پیشرفت مهارتت می‌توانی رشد کنی."),
            d("A", "That's smart. What about the Sony Alpha? I've seen ads for it.", "هوشمندانه است. Sony Alpha چطور؟ تبلیغاتش را دیده‌ام."),
            d("B", "Also great. Cheaper, but the low-light performance isn't as good.", "اونم عالیه. ارزان‌تر، ولی عملکردش در نور کم به آن خوبی نیست."),
            d("A", "Hmm. I do take evening photos sometimes.", "هوم. گاهی عکس‌های عصر می‌گیرم."),
            d("B", "Then the Canon is a better fit. It handles low light very well.", "پس Canon مناسب‌تره. نور کم را خیلی خوب مدیریت می‌کند."),
            d("A", "Good to know. Where would you buy it?", "خوب است بدانم. از کجا می‌خریدی؟"),
            d("B", "I usually compare prices online first, then check local stores.", "معمولاً اول قیمت‌ها را آنلاین مقایسه می‌کنم، بعد فروشگاه‌های محلی را چک می‌کنم."),
            d("A", "Do you ever haggle?", "هیچ‌وقت چانه می‌زنی؟"),
            d("B", "At small shops, yes. At big stores, no — prices are fixed.", "در مغازه‌های کوچک، بله. در فروشگاه‌های بزرگ، نه — قیمت‌ها ثابت هستند."),
            d("A", "Makes sense. Where do you usually find the best deals?", "منطقی است. معمولاً کجا بهترین معامله‌ها را پیدا می‌کنی؟"),
            d("B", "Online during holiday sales. Black Friday is huge for electronics.", "آنلاین در حراج‌های تعطیلات. جمعه سیاه برای الکترونیک عظیمه."),
            d("A", "Black Friday is coming up soon, right?", "جمعه سیاه به‌زودی می‌آید، نه؟"),
            d("B", "Yes, in a few weeks. It might be worth waiting.", "بله، در چند هفته. ممکن است ارزش صبر کردن داشته باشد."),
            d("A", "But I also want a camera before my trip next month.", "ولی می‌خواهم قبل از سفر ماه آینده دوربین داشته باشم."),
            d("B", "Then don't wait. There will always be a better deal later.", "پس صبر نکن. همیشه بعداً معامله بهتری هست."),
            d("A", "Good point. What about warranties?", "نکته خوبی. گارانتی چطور؟"),
            d("B", "Always check the warranty. Canon offers two years on most models.", "همیشه گارانتی را چک کن. Canon روی بیشتر مدل‌ها دو سال ارائه می‌دهد."),
            d("A", "That's solid. Any tips for getting a better price?", "محکمه. نکته‌ای برای قیمت بهتر داری؟"),
            d("B", "Ask if there's a student discount. Or a bundle deal with a lens.", "بپرس تخفیف دانشجویی هست یا نه. یا معامله ترکیبی با لنز."),
            d("A", "Great tip. I'll ask about bundles.", "نکته عالی. درباره ترکیبی‌ها می‌پرسم."),
            d("B", "Also, don't forget to check the return policy before buying.", "همچنین، قبل از خرید سیاست بازگشت را چک کن."),
            d("A", "How long is typical?", "معمولاً چقدره؟"),
            d("B", "Usually 14 to 30 days for electronics.", "معمولاً ۱۴ تا ۳۰ روز برای الکترونیک."),
            d("A", "Good to know. One more question — what about tipping?", "خوب است بدانم. یک سؤال دیگر — انعام چطور؟"),
            d("B", "For a store purchase? No tipping. Only restaurants and services.", "برای خرید فروشگاهی؟ انعام نه. فقط رستوران‌ها و خدمات."),
            d("A", "I see. So no tip for the salesperson.", "می‌فهمم. پس برای فروشنده انعام نه."),
            d("B", "Correct. But a good review online is always appreciated.", "درست. ولی یک نقد خوب آنلاین همیشه قدردانی می‌شود."),
            d("A", "That's a nice touch. Thanks for all your help.", "نکته قشنگی است. ممنون برای همه کمکت."),
            d("B", "Anytime. Let me know what you end up buying!", "هر وقت. بگو آخرش چی خریدی!"),
            d("A", "I will. I'm going to check online right now.", "می‌گویم. الان می‌خواهم آنلاین چک کنم."),
            d("B", "Good luck. Send me the link if you find a good deal!", "موفق باشی. اگر معامله خوبی پیدا کردی لینک را برایم بفرست!"),
            d("A", "Deal. Talk soon.", "قبول. به‌زودی صحبت."),
            d("B", "Talk soon. And enjoy the new camera!", "به‌زودی صحبت. و از دوربین جدید لذت ببر!"),
            d("A", "Thanks. See you!", "ممنون. می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!"),
            d("A", "Oh wait — one more thing. Do you recommend a specific lens?", "اوه صبر کن — یک چیز دیگر. لنز خاصی توصیه می‌کنی؟"),
            d("B", "Yes! The 50mm f/1.8 is perfect for beginners. Cheap and sharp.", "بله! 50mm f/1.8 برای مبتدی‌ها عالیه. ارزان و شارپ."),
            d("A", "Is it good for portraits?", "برای پرتره خوبه؟"),
            d("B", "Excellent for portraits. And street photography too.", "برای پرتره عالیه. و عکاسی خیابانی هم."),
            d("A", "Perfect. Adding it to my list.", "عالی. به لیستم اضافه می‌کنم."),
            d("B", "Good choice. That combo will serve you for years.", "انتخاب خوبی. این ترکیب سال‌ها بهت خدمت می‌کند."),
            d("A", "I hope so. Thanks again!", "امیدوارم. باز هم ممنون!"),
            d("B", "No problem. Bye!", "مشکلی نیست. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is A looking for?", listOf("a laptop", "a camera", "a phone", "a tablet"), 1),
            q("What's A's budget?", listOf("$300-400", "$400-500", "$500-600", "$600-700"), 2),
            q("Which camera does B recommend?", listOf("Sony Alpha", "Canon EOS", "Nikon D", "Fujifilm X"), 1),
            q("Why is Canon better than Sony for A?", listOf("cheaper", "better in low light", "lighter", "bigger screen"), 1),
            q("Where can you usually haggle?", listOf("big stores", "online shops", "small shops", "malls"), 2),
            q("How long is Canon's typical warranty?", listOf("one year", "two years", "three years", "five years"), 1),
            q("What lens does B recommend?", listOf("24-70mm zoom", "50mm f/1.8", "85mm prime", "wide angle"), 1),
            q("Where is tipping expected?", listOf("everywhere", "at stores", "restaurants and services", "nowhere"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Worth it", "ارزشش را دارد", "It's more, but worth it.", "گران‌تره، ولی ارزشش را دارد."),
            IdiomExpression("A steal", "خیلی ارزان", "Fifty dollars? That's a steal!", "پنجاه دلار؟ خیلی ارزان!"),
            IdiomExpression("A rip-off", "گران‌فروشی", "Two hundred dollars? What a rip-off!", "دویست دلار؟ چه گران‌فروشی!"),
            IdiomExpression("Go with", "انتخاب کردن", "I'd go with the Canon.", "من Canon را انتخاب می‌کردم."),
            IdiomExpression("Makes sense", "منطقی است", "Makes sense. Where do you find the best deals?", "منطقی است. کجا بهترین معامله‌ها را پیدا می‌کنی؟"),
            IdiomExpression("A nice touch", "نکته قشنگی", "A good review is a nice touch.", "نقد خوب نکته قشنگی است."),
            IdiomExpression("Grow into it", "با آن رشد کردن", "You can grow into it as your skills improve.", "با پیشرفت مهارتت می‌توانی رشد کنی.")
        ),
        phrasal = listOf(
            PhrasalVerb("shop around", "قیمت‌ها را مقایسه کردن", "compare prices",
                "Always shop around before buying.", "قبل از خرید همیشه قیمت‌ها را مقایسه کن.", "No"),
            PhrasalVerb("end up", "در نهایت ... شدن", "finally do/buy",
                "I ended up buying the Canon.", "در نهایت Canon خریدم.", "No"),
            PhrasalVerb("hold off", "صبر کردن", "wait / delay",
                "I'll hold off until the sale.", "تا حراج صبر می‌کنم.", "No"),
            PhrasalVerb("come up", "نزدیک شدن", "approach in time",
                "Black Friday is coming up soon.", "جمعه سیاه به‌زودی می‌آید.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Rising intonation for clarification", "Did you say FIFTEEN ↗ or FIFTY ↘?"),
            PronunciationTip("Numbers that confuse", "fifteen /fɪfˈtiːn/ vs. fifty /ˈfɪfti/."),
            PronunciationTip("Tech specs", "50mm f/1.8 → 'fifty millimeter f one point eight'.")
        ),
        culture = listOf(
            CulturalNote("Tipping customs",
                "In the US: 15–20% in restaurants. In Japan and much of Europe, tipping is not expected or is included."),
            CulturalNote("Haggling",
                "Common in markets and small shops in many countries. In big stores, prices are usually fixed."),
            CulturalNote("Black Friday",
                "The day after Thanksgiving in the US. Huge sales on electronics, clothing, and home goods.")
        ),
        mistakes = listOf(
            CommonMistake("It's worth to buy.", "It's worth buying. / It's worth it.", "Use 'worth + noun/-ing'."),
            CommonMistake("I go with the Canon.", "I'd go with the Canon.", "Use 'would' for recommendations.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What camera does B recommend and why?", "Canon EOS — great value, user-friendly, excellent in low light."),
            ComprehensionQuestion("What lens does B suggest for beginners?", "50mm f/1.8 — cheap, sharp, good for portraits and street photography."),
            ComprehensionQuestion("What tips does B give for getting a better price?", "Ask about student discounts, bundle deals, and check the return policy.")
        ),
        speaking = listOf(
            SpeakingTask("Ask a partner for a product recommendation.",
                "از یک دوست برای یک محصول توصیه بخواه.",
                "I'm looking for... / What do you recommend? / What's your budget?"),
            SpeakingTask("Tell a story about a great deal or a rip-off you experienced.",
                "داستانی از یک معامله خوب یا گران‌فروشی که تجربه کرده‌ای تعریف کن.",
                "First... / Then... / Finally... / It was a steal/rip-off.")
        ),
        writing = listOf(
            WritingTask("Write a product review or a shopping experience story.",
                "نقد محصول یا داستان یک تجربه خرید بنویس.",
                150, "Include what, where, price, quality, and your recommendation.")
        )
    )
}