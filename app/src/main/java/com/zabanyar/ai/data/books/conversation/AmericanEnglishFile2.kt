package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 2 — Complete Course Content
 * 12 Files | Pre-Intermediate (A2-B1)
 * Original educational content (no copyrighted material reproduced)
 * File titles and grammar points match the official Oxford Scope & Sequence
 * Dialogue length: ~115 lines each (~10-12 minutes)
 */
object AmericanEnglishFile2 {
    const val BOOK_ID = "american_english_file_2"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> file1()
        2 -> file2()
        3 -> file3()
        4 -> file4()
        5 -> file5()
        6 -> file6()
        7 -> file7()
        8 -> file8()
        9 -> file9()
        10 -> file10()
        11 -> file11()
        12 -> file12()
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
    // FILE 1 — Where are you from? | اهل کجایی؟  (≈ 115 خط)
    // Grammar: word order in questions; simple present
    // Vocabulary: describing people; clothes; prepositions
    // ═══════════════════════════════════════════════════════════
    private fun file1() = base(
        1, "Where are you from?", "اهل کجایی؟",
        listOf(
            "Use word order in questions correctly",
            "Use simple present and present continuous",
            "Describe people's appearance and personality",
            "Talk about clothes and what people are wearing",
            "Use prepositions of place and time"
        ),
        listOf(
            v("appearance", "ظاهر", "Appearance matters less than character.", "ظاهر کمتر از شخصیت اهمیت دارد."),
            v("personality", "شخصیت", "She has a very outgoing personality.", "او شخصیت خیلی اجتماعی دارد."),
            v("outgoing", "برون‌گرا", "He's very outgoing and loves parties.", "او خیلی برون‌گرا است و عاشق مهمانی‌هاست.", "adjective"),
            v("shy", "خجالتی", "She's a bit shy at first.", "او اولش کمی خجالتی است.", "adjective"),
            v("curly", "فر", "She has curly hair.", "او موهای فر دارد.", "adjective"),
            v("straight", "صاف", "He has straight hair.", "او موهای صاف دارد.", "adjective"),
            v("beard", "ریش", "He's growing a beard.", "او دارد ریش می‌گذارد."),
            v("glasses", "عینک", "She wears glasses.", "او عینک می‌زند."),
            v("casual", "غیررسمی", "I prefer casual clothes.", "من لباس‌های غیررسمی را ترجیح می‌دهم.", "adjective"),
            v("formal", "رسمی", "The invitation says formal attire.", "دعوت‌نامه می‌گوید لباس رسمی.", "adjective")
        ),
        listOf(
            GrammarSection("Word order in questions", "In questions, the auxiliary verb comes before the subject: Where are you from? What do you do? Did you like it?"),
            GrammarSection("Simple present vs. Present continuous", "Use simple present for habits (I work every day). Use present continuous for actions now (I'm working right now)."),
            GrammarSection("Describing people", "Use adjectives to describe appearance and personality: She's tall and friendly. He has short brown hair."),
            GrammarSection("Prepositions of place and time", "in a city, at home, on a street; at 7 AM, in the morning, on Monday.")
        ),
        listOf(
            d("A", "Hi! Are you a new student here?", "سلام! تو اینجا دانشجوی جدیدی هستی؟"),
            d("B", "Yes, I am. My name is Emma.", "بله. نام من اِما است."),
            d("A", "Nice to meet you, Emma. I'm Daniel.", "از آشنایی خوشحالم اِما. من دنیل هستم."),
            d("B", "Nice to meet you, too. Where are you from?", "من هم خوشحالم. اهل کجایی؟"),
            d("A", "I'm from Canada. And you?", "اهل کانادا هستم. تو چطور؟"),
            d("B", "I'm from Australia. I'm from Sydney.", "اهل استرالیا هستم. اهل سیدنی هستم."),
            d("A", "Oh, Sydney! It's a beautiful city. Have you been there?", "اوه، سیدنی! شهر زیبایی است. رفته‌ای آنجا؟"),
            d("B", "Yes, I have. It's my hometown.", "بله. شهر زادگاهم است."),
            d("A", "What do you do, Emma?", "شغلت چیست اِما؟"),
            d("B", "I'm a teacher. I teach art.", "من معلم هستم. هنر درس می‌دهم."),
            d("A", "That's interesting. I'm a software engineer.", "جالب است. من مهندس نرم‌افزار هستم."),
            d("B", "Really? Where do you work?", "واقعاً؟ کجا کار می‌کنی؟"),
            d("A", "I work for a tech company in Toronto.", "برای یک شرکت فناوری در تورنتو کار می‌کنم."),
            d("B", "That sounds exciting. Do you like it?", "هیجان‌انگیز به نظر می‌رسد. دوستش داری؟"),
            d("A", "I do. But it's also very stressful.", "بله. ولی همچنین خیلی استرس‌زا است."),
            d("B", "I understand. Teaching can be stressful too.", "می‌فهمم. تدریس هم می‌تواند استرس‌زا باشد."),
            d("A", "Are you married, Emma?", "متأهلی اِما؟"),
            d("B", "No, I'm not. I'm single.", "نه. مجردم."),
            d("A", "Me too. Are you here alone?", "من هم. تنهایی اینجایی؟"),
            d("B", "Yes, I am. But my sister lives here in Toronto.", "بله. ولی خواهرم اینجا در تورنتو زندگی می‌کند."),
            d("A", "Oh, that's nice. Is she older or younger?", "اوه، خوبه. بزرگ‌تر است یا کوچک‌تر؟"),
            d("B", "She's older. She's thirty-two.", "بزرگ‌تر است. سی و دو ساله است."),
            d("A", "What does she do?", "شغلش چیست؟"),
            d("B", "She's a doctor. She works at a hospital downtown.", "او پزشک است. در یک بیمارستان در مرکز شهر کار می‌کند."),
            d("A", "That's a great job. Is she married?", "شغل عالی‌ای است. متأهل است؟"),
            d("B", "Yes, she is. Her husband is also a doctor.", "بله. همسرش هم پزشک است."),
            d("A", "Wow, a family of doctors!", "واو، خانواده‌ای از پزشکان!"),
            d("B", "Ha! Yes. They're very busy people.", "ها! بله. آن‌ها افراد خیلی مشغولی هستند."),
            d("A", "Do they have children?", "بچه دارند؟"),
            d("B", "Yes, they have two. A boy and a girl.", "بله، دو تا دارند. یک پسر و یک دختر."),
            d("A", "How old are they?", "چند ساله هستند؟"),
            d("B", "The boy is six and the girl is four.", "پسر شش ساله و دختر چهار ساله است."),
            d("A", "That's lovely. Do you see them often?", "زیباست. زیاد می‌بینی‌شان؟"),
            d("B", "Yes, I do. I go to their house every Sunday.", "بله. هر یکشنبه به خانه‌شان می‌روم."),
            d("A", "That's great. Family is important.", "عالی است. خانواده مهم است."),
            d("B", "Yes, it is. What about your family?", "بله. خانواده تو چطور؟"),
            d("A", "My parents are in Canada. They're both retired.", "والدینم در کانادا هستند. هر دو بازنشسته‌اند."),
            d("B", "That's nice. Do you see them often?", "خوبه. زیاد می‌بینی‌شان؟"),
            d("A", "Not very often. They live in Vancouver. It's far.", "نه خیلی. آن‌ها در ونکوور زندگی می‌کنند. دور است."),
            d("B", "Vancouver is beautiful.", "ونکوور زیباست."),
            d("A", "Yes, it is. But Toronto is my home now.", "بله. ولی تورنتو الان خانه من است."),
            d("B", "I understand. Well, it was nice meeting you, Daniel.", "می‌فهمم. خب، از آشنایی با تو خوشحال شدم، دنیل."),
            d("A", "Nice meeting you, too, Emma. See you around!", "من هم خوشحال شدم، اِما. می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Oh, wait! What's your phone number?", "اوه، صبر کن! شماره تلفنت چیست؟"),
            d("B", "It's 5-5-5, 1-2-3-4.", "۵-۵-۵، ۱-۲-۳-۴."),
            d("A", "OK, I'll call you. Bye!", "باشه، بهت زنگ می‌زنم. خداحافظ!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "By the way, do you know Sarah?", "راستی، سارا را می‌شناسی؟"),
            d("B", "Sarah? Sarah who?", "سارا؟ کدام سارا؟"),
            d("A", "Sarah from the marketing department. She's tall with curly hair.", "سارا از بخش بازاریابی. قدبلند با موهای فر."),
            d("B", "Oh, yes! She's very friendly. We had lunch together last week.", "اوه، بله! خیلی خوش‌برخورد است. هفته پیش با هم ناهار خوردیم."),
            d("A", "She's a good friend of mine. Small world!", "او دوست خوب من است. دنیا کوچک است!"),
            d("B", "It really is. Well, see you soon!", "واقعاً همینطور است. خب، به‌زودی می‌بینمت!"),
            d("A", "See you! Take care!", "می‌بینمت! مراقب باش!"),
            d("B", "You too. Bye!", "تو هم. خداحافظ!")
        ),
        listOf(
            q("Where is Emma from?", listOf("Canada", "Australia", "Spain", "England"), 1),
            q("What does Daniel do?", listOf("teacher", "engineer", "doctor", "artist"), 1),
            q("Is Emma married?", listOf("yes", "no, she's single", "we don't know", "she's divorced"), 1),
            q("Where does Emma's sister work?", listOf("at a school", "at a hospital", "in a bank", "at home"), 1),
            q("___ do you do?", listOf("What", "Who", "Where", "How"), 0),
            q("She ___ wearing a red dress.", listOf("is", "are", "am", "be"), 0),
            q("He ___ in a hospital.", listOf("work", "works", "working", "worked"), 1),
            q("___ name is Emma.", listOf("She", "Her", "Hers", "She's"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی خوشحالم", "Nice to meet you, Emma.", "از آشنایی خوشحالم، اِما."),
            IdiomExpression("See you around", "می‌بینمت", "See you around!", "می‌بینمت!"),
            IdiomExpression("Small world", "دنیا کوچک است", "Small world!", "دنیا کوچک است!")
        ),
        pronunciation = listOf(
            PronunciationTip("Question intonation", "WH- questions: falling at the end (Where are you from? ↘). Yes/No: rising (Do you enjoy it? ↗)"),
            PronunciationTip("Third-person -s", "Listen for the final sound in works, teaches, lives.")
        ),
        culture = listOf(
            CulturalNote("Small talk topics", "In English-speaking countries, common small talk topics include where you're from, your job, and the weather."),
            CulturalNote("Describing people", "When describing people, it's common to mention hair, height, and personality traits.")
        ),
        mistakes = listOf(
            CommonMistake("Where you are from?", "Where are you from?", "In questions, the verb comes before the subject."),
            CommonMistake("She have curly hair.", "She has curly hair.", "Use 'has' with he, she, and it."),
            CommonMistake("He is more tall than me.", "He is taller than me.", "Use -er for one-syllable adjectives.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where are Daniel and Emma from?", "Daniel is from Canada; Emma is from Australia."),
            ComprehensionQuestion("What are their jobs?", "Daniel is a software engineer; Emma is a teacher.")
        ),
        speaking = listOf(
            SpeakingTask("Ask a partner about their background.", "از یک دوست درباره پیشینه‌اش بپرس.", "Where are you from? / What do you do?"),
            SpeakingTask("Describe a friend's appearance and personality.", "ظاهر و شخصیت یک دوست را توصیف کن.", "She's... / He has...")
        ),
        writing = listOf(
            WritingTask("Write a short email introducing yourself to a new colleague.", "یک ایمیل کوتاه بنویس و خودت را به همکار جدید معرفی کن.", 80, "Include your name, job, and where you're from.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 2 — Charlotte's choice | انتخاب شارلوت  (≈ 115 خط)
    // Grammar: simple present (+, -); questions with do/does
    // Vocabulary: daily routine, free time activities
    // ═══════════════════════════════════════════════════════════
    private fun file2() = base(
        2, "Charlotte's choice", "انتخاب شارلوت",
        listOf(
            "Use simple present in positive and negative statements",
            "Talk about daily routines",
            "Use common verbs for daily activities",
            "Ask and answer questions about habits"
        ),
        listOf(
            v("routine", "روتین روزانه", "My morning routine is simple.", "روتین صبحم ساده است."),
            v("wake up", "بیدار شدن", "I wake up at 7 AM.", "ساعت ۷ صبح بیدار می‌شوم.", "verb"),
            v("get up", "از خواب بلند شدن", "I get up at 7:15.", "ساعت ۷:۱۵ از خواب بلند می‌شوم.", "verb"),
            v("breakfast", "صبحانه", "I have breakfast at home.", "در خانه صبحانه می‌خورم."),
            v("work", "کار کردن", "She works in an office.", "او در یک دفتر کار می‌کند.", "verb"),
            v("study", "درس خواندن", "He studies at university.", "او در دانشگاه درس می‌خواند.", "verb"),
            v("finish", "تمام کردن", "I finish work at 6 PM.", "ساعت ۶ عصر کارم تمام می‌شود.", "verb"),
            v("home", "خانه", "I go home after work.", "بعد از کار به خانه می‌روم."),
            v("evening", "عصر", "I relax in the evening.", "عصرها استراحت می‌کنم."),
            v("bed", "تخت", "I go to bed at 11 PM.", "ساعت ۱۱ شب به رختخواب می‌روم.")
        ),
        listOf(
            GrammarSection("Present simple: positive and negative", "Use the base verb for I/you/we/they. Add -s or -es for he/she/it. I work. She works. He doesn't work."),
            GrammarSection("Questions with do/does", "Use do with I/you/we/they and does with he/she/it. Do you work? Does she live here?"),
            GrammarSection("Time expressions", "at 7 AM, in the morning, in the afternoon, in the evening, at night, on Mondays.")
        ),
        listOf(
            d("A", "Hi, Charlotte! How are you?", "سلام، شارلوت! چطوری؟"),
            d("B", "I'm fine, thanks. How about you?", "خوبم، ممنون. تو چطور؟"),
            d("A", "Not bad. What time do you usually get up?", "بد نیست. معمولاً چه ساعتی از خواب بلند می‌شوی؟"),
            d("B", "At six thirty. I like to start early.", "ساعت شش و نیم. دوست دارم زود شروع کنم."),
            d("A", "That's early! What do you do in the morning?", "زوده! صبح‌ها چه کار می‌کنی؟"),
            d("B", "I have breakfast, then I go to work.", "صبحانه می‌خورم، بعد به سر کار می‌روم."),
            d("A", "Where do you work?", "کجا کار می‌کنی؟"),
            d("B", "At a hospital. I'm a nurse.", "در یک بیمارستان. من پرستار هستم."),
            d("A", "That's a great job. Do you like it?", "شغل عالی‌ای است. دوستش داری؟"),
            d("B", "Yes, I love it. But it's very tiring.", "بله، عاشقش هستم. ولی خیلی خسته‌کننده است."),
            d("A", "What time do you finish work?", "چه ساعتی کارت تمام می‌شود؟"),
            d("B", "At four in the afternoon. Then I go home.", "ساعت چهار بعدازظهر. بعد به خانه می‌روم."),
            d("A", "What do you do in the evening?", "عصرها چه کار می‌کنی؟"),
            d("B", "I usually relax. I watch TV or read.", "معمولاً استراحت می‌کنم. تلویزیون تماشا می‌کنم یا کتاب می‌خوانم."),
            d("A", "Do you cook dinner?", "شام می‌پزی؟"),
            d("B", "Sometimes. My husband cooks on Tuesdays.", "گاهی. همسرم سه‌شنبه‌ها آشپزی می‌کند."),
            d("A", "Oh, you're married. What does your husband do?", "اوه، متأهلی. همسرت چه کار می‌کند؟"),
            d("B", "He's a chef. He works at a restaurant downtown.", "او سرآشپز است. در یک رستوران در مرکز شهر کار می‌کند."),
            d("A", "A chef! So he cooks every day.", "سرآشپز! پس هر روز آشپزی می‌کند."),
            d("B", "Ha! Yes. But at home he's usually too tired.", "ها! بله. ولی در خانه معمولاً خیلی خسته است."),
            d("A", "I understand. Do you have children?", "می‌فهمم. بچه داری؟"),
            d("B", "No, we don't. Maybe in the future.", "نه، نداریم. شاید در آینده."),
            d("A", "What about the weekend? What do you do?", "آخر هفته چطور؟ چه کار می‌کنی؟"),
            d("B", "On Saturdays, I go shopping. On Sundays, I visit my parents.", "شنبه‌ها خرید می‌روم. یکشنبه‌ها والدینم را می‌بینم."),
            d("A", "Do they live near you?", "نزدیک تو زندگی می‌کنند؟"),
            d("B", "Yes, they do. About twenty minutes away.", "بله. حدود بیست دقیقه فاصله."),
            d("A", "That's convenient. What time do you go to bed?", "این راحت است. چه ساعتی به رختخواب می‌روی؟"),
            d("B", "At eleven. I need eight hours of sleep.", "ساعت یازده. به هشت ساعت خواب نیاز دارم."),
            d("A", "That's important. Do you exercise?", "این مهم است. ورزش می‌کنی؟"),
            d("B", "Not really. I don't have time.", "نه واقعاً. وقت ندارم."),
            d("A", "You should try. Even a short walk helps.", "باید امتحان کنی. حتی یک پیاده‌روی کوتاه کمک می‌کند."),
            d("B", "You're right. Maybe I'll start.", "حق داری. شاید شروع کنم."),
            d("A", "What do you usually do on your days off?", "روزهای تعطیلت معمولاً چه کار می‌کنی؟"),
            d("B", "I usually sleep late and then meet friends for coffee.", "معمولاً دیر بیدار می‌شوم و بعد با دوستان برای قهوه قرار می‌گذارم."),
            d("A", "That sounds nice. Do you have many friends here?", "خوب به نظر می‌رسد. اینجا دوستان زیادی داری؟"),
            d("B", "A few. Most of my friends are from work.", "چند تا. بیشتر دوستانم از محل کار هستند."),
            d("A", "I see. Well, I should go. See you later!", "می‌فهمم. خب، باید بروم. بعداً می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!")
        ),
        listOf(
            q("What time does Charlotte get up?", listOf("6:00", "6:30", "7:00", "7:30"), 1),
            q("What does Charlotte do?", listOf("teacher", "nurse", "doctor", "chef"), 1),
            q("What does her husband do?", listOf("teacher", "chef", "engineer", "driver"), 1),
            q("What does Charlotte do on Sundays?", listOf("goes shopping", "visits her parents", "works", "stays home"), 1),
            q("I ___ at 7 AM.", listOf("wake up", "wakes up", "waking up", "woke up"), 0),
            q("She ___ in an office.", listOf("work", "works", "working", "worked"), 1),
            q("___ you cook dinner?", listOf("Do", "Does", "Are", "Is"), 0),
            q("She ___ like her job.", listOf("don't", "doesn't", "isn't", "aren't"), 1)
        ),
        idioms = listOf(
            IdiomExpression("How about you?", "تو چطور؟", "I'm fine. How about you?", "خوبم. تو چطور؟"),
            IdiomExpression("Not bad", "بد نیست", "Not bad, thanks.", "بد نیست، ممنون."),
            IdiomExpression("In the future", "در آینده", "Maybe in the future.", "شاید در آینده.")
        ),
        pronunciation = listOf(
            PronunciationTip("Third-person -s", "Listen for the final sound in works, studies, finishes."),
            PronunciationTip("Do/Does reduction", "In natural speech: What do you → /wʌtʃə/, What does she → /wʌtsi/.")
        ),
        culture = listOf(
            CulturalNote("Daily routines", "Daily routines vary. In many English-speaking countries, people wake up between 6 and 8 AM."),
            CulturalNote("Shifts", "Nurses and doctors often work shifts — mornings, afternoons, or nights.")
        ),
        mistakes = listOf(
            CommonMistake("She work in a hospital.", "She works in a hospital.", "Add -s for he, she, it."),
            CommonMistake("Do she like her job?", "Does she like her job?", "Use 'does' with he, she, it."),
            CommonMistake("I no have breakfast.", "I don't have breakfast.", "Use 'don't' for negative statements.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is Charlotte's daily routine?", "She wakes up at 6:30, works as a nurse, finishes at 4 PM, relaxes in the evening, and goes to bed at 11 PM."),
            ComprehensionQuestion("What does Charlotte do on weekends?", "She goes shopping on Saturdays and visits her parents on Sundays.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your daily routine.", "درباره روتین روزانه‌ات صحبت کن.", "I wake up at... / I have breakfast... / I go to bed at..."),
            SpeakingTask("Ask a partner about their work or studies.", "از یک دوست درباره کار یا تحصیلش بپرس.", "What do you do? / Do you like it?")
        ),
        writing = listOf(
            WritingTask("Write about your typical day.", "درباره یک روز معمولی‌ات بنویس.", 70, "Use present simple and time expressions.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 3 — Mr and Mrs Clark and Percy | آقا و خانم کلارک و پرسی  (≈ 115 خط)
    // Grammar: present continuous; simple present vs. present continuous
    // Vocabulary: activities, colors, common verbs
    // ═══════════════════════════════════════════════════════════
    private fun file3() = base(
        3, "Mr and Mrs Clark and Percy", "آقا و خانم کلارک و پرسی",
        listOf(
            "Use present continuous for actions happening now",
            "Use present simple vs. present continuous correctly",
            "Describe what people are doing in a picture",
            "Talk about activities and colors"
        ),
        listOf(
            v("sitting", "نشستن", "She's sitting on a chair.", "او روی صندلی نشسته است.", "verb"),
            v("standing", "ایستادن", "He's standing by the window.", "او کنار پنجره ایستاده است.", "verb"),
            v("reading", "خواندن", "She's reading a book.", "او کتاب می‌خواند.", "verb"),
            v("wearing", "پوشیدن", "He's wearing a black suit.", "او کت و شلوار مشکی پوشیده است.", "verb"),
            v("holding", "نگه داشتن", "She's holding a flower.", "او گلی در دست دارد.", "verb"),
            v("looking", "نگاه کردن", "He's looking at her.", "او به او نگاه می‌کند.", "verb"),
            v("painting", "نقاشی", "This is a famous painting.", "این یک نقاشی معروف است."),
            v("artist", "هنرمند", "The artist is British.", "هنرمند بریتانیایی است."),
            v("couple", "زوج", "The couple are in their living room.", "زوج در اتاق نشیمنشان هستند."),
            v("flower", "گل", "There's a flower on the table.", "گلی روی میز هست.")
        ),
        listOf(
            GrammarSection("Present continuous", "Use am/is/are + verb-ing for actions happening now. She's reading. They're sitting. He isn't working."),
            GrammarSection("Present continuous questions", "What are you doing? What is she doing? Are they working?"),
            GrammarSection("Present simple vs. present continuous", "Use present simple for habits (I read every day). Use present continuous for actions now (I'm reading now).")
        ),
        listOf(
            d("A", "What are you looking at?", "به چه چیزی نگاه می‌کنی؟"),
            d("B", "This painting. It's very famous.", "این نقاشی. خیلی معروف است."),
            d("A", "Who painted it?", "چه کسی کشیده‌اش؟"),
            d("B", "David Hockney. He's a British artist.", "دیوید هوکنی. هنرمند بریتانیایی است."),
            d("A", "What can you see in the painting?", "در نقاشی چه می‌بینی؟"),
            d("B", "There's a couple in their living room. A man and a woman.", "یک زوج در اتاق نشیمنشان هستند. یک مرد و یک زن."),
            d("A", "What are they doing?", "چه کار می‌کنند؟"),
            d("B", "The woman is sitting on a chair. She's wearing a pink dress.", "زن روی صندلی نشسته است. لباس صورتی پوشیده است."),
            d("A", "And the man?", "و مرد؟"),
            d("B", "He's standing by the window. He's wearing a black suit.", "او کنار پنجره ایستاده است. کت و شلوار مشکی پوشیده است."),
            d("A", "Are they looking at each other?", "به هم نگاه می‌کنند؟"),
            d("B", "No, they aren't. He's looking at her, but she isn't looking at him.", "نه. او به او نگاه می‌کند، ولی او به او نگاه نمی‌کند."),
            d("A", "Interesting. What else can you see?", "جالب است. چه چیز دیگری می‌بینی؟"),
            d("B", "There's a cat. It's sitting next to the woman.", "یک گربه هست. کنار زن نشسته است."),
            d("A", "What color is the cat?", "گربه چه رنگی است؟"),
            d("B", "It's white. And there are some flowers on the table.", "سفید است. و چند گل روی میز هست."),
            d("A", "What's the woman holding?", "زن چه چیزی در دست دارد؟"),
            d("B", "She's holding a flower. A yellow flower.", "گلی در دست دارد. یک گل زرد."),
            d("A", "Do you like the painting?", "نقاشی را دوست داری؟"),
            d("B", "Yes, I do. I think it's beautiful.", "بله. فکر می‌کنم زیباست."),
            d("A", "What do you like about it?", "چه چیزی در آن دوست داری؟"),
            d("B", "The colors. They're soft and simple.", "رنگ‌ها. ملایم و ساده هستند."),
            d("A", "I agree. Do you like art?", "موافقم. هنر دوست داری؟"),
            d("B", "Yes, I do. I go to museums every month.", "بله. هر ماه به موزه می‌روم."),
            d("A", "That's a nice hobby. What's your favorite museum?", "سرگرمی خوبی است. موزه مورد علاقه‌ات چیست؟"),
            d("B", "The Tate Modern in London. Have you been?", "تیت مدرن در لندن. رفته‌ای؟"),
            d("A", "No, I haven't. But I want to go.", "نه، نرفته‌ام. ولی می‌خواهم بروم."),
            d("B", "You should. It's amazing.", "باید بروی. شگفت‌انگیز است."),
            d("A", "What time does it close?", "چه ساعتی بسته می‌شود؟"),
            d("B", "At six. But on Fridays, it stays open until ten.", "ساعت شش. ولی جمعه‌ها تا ده باز است."),
            d("A", "Good to know. Thanks!", "خوب است بدانم. ممنون!"),
            d("B", "You're welcome.", "خواهش می‌کنم."),
            d("A", "Well, I should go. See you later!", "خب، باید بروم. بعداً می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Who painted the painting?", listOf("Van Gogh", "David Hockney", "Picasso", "Monet"), 1),
            q("What is the woman wearing?", listOf("a black suit", "a pink dress", "a yellow shirt", "a blue skirt"), 1),
            q("Where is the man standing?", listOf("near the door", "by the window", "on a chair", "next to the cat"), 1),
            q("What is the woman holding?", listOf("a book", "a flower", "a cup", "a phone"), 1),
            q("She ___ a book right now.", listOf("reads", "reading", "is reading", "read"), 2),
            q("They ___ watching TV.", listOf("are", "is", "am", "be"), 0),
            q("What ___ you doing?", listOf("are", "is", "am", "do"), 0),
            q("He ___ looking at her.", listOf("are", "is", "am", "be"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Look at", "نگاه کردن به", "What are you looking at?", "به چه نگاه می‌کنی؟"),
            IdiomExpression("Next to", "کنار", "It's sitting next to the woman.", "کنار زن نشسته است."),
            IdiomExpression("By the window", "کنار پنجره", "He's standing by the window.", "کنار پنجره ایستاده است.")
        ),
        pronunciation = listOf(
            PronunciationTip("The -ing sound", "Practice the /ɪŋ/ sound: looking /ˈlʊkɪŋ/, sitting /ˈsɪtɪŋ/, wearing /ˈwɛrɪŋ/."),
            PronunciationTip("Contractions", "Practice natural contractions: she's /ʃiːz/, they're /ðer/, isn't /ˈɪzənt/.")
        ),
        culture = listOf(
            CulturalNote("David Hockney", "David Hockney is one of the most famous British artists. His painting 'Mr and Mrs Clark and Percy' (1970-71) is in the Tate Modern."),
            CulturalNote("Museums in the UK", "Many museums in the UK are free to enter. The Tate Modern in London is one of the most visited museums in the world.")
        ),
        mistakes = listOf(
            CommonMistake("She reading a book.", "She is reading a book.", "Present continuous needs 'be + verb-ing'."),
            CommonMistake("What you are doing?", "What are you doing?", "In questions, the verb comes before the subject."),
            CommonMistake("He is look at her.", "He is looking at her.", "Use the -ing form after 'be'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is happening in the painting?", "A couple in their living room. The woman is sitting with a cat; the man is standing by the window."),
            ComprehensionQuestion("What does B like about the painting?", "The soft and simple colors.")
        ),
        speaking = listOf(
            SpeakingTask("Describe what is happening in a picture.", "توصیف کن در یک عکس چه اتفاقی می‌افتد.", "There's a... / She's wearing... / He's looking at..."),
            SpeakingTask("Talk about a hobby you enjoy.", "درباره سرگرمی‌ای که دوست داری صحبت کن.", "I like... / I usually... / My favorite...")
        ),
        writing = listOf(
            WritingTask("Write a description of a painting or photo.", "توصیفی از یک نقاشی یا عکس بنویس.", 80, "Use present continuous and colors.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 4 — Parents and teenagers | والدین و نوجوانان  (≈ 115 خط)
    // Grammar: adverbs of frequency; imperatives; articles
    // Vocabulary: family, household chores, personality
    // ═══════════════════════════════════════════════════════════
    private fun file4() = base(
        4, "Parents and teenagers", "والدین و نوجوانان",
        listOf(
            "Use adverbs of frequency correctly",
            "Give instructions using imperatives",
            "Talk about household chores and family life",
            "Use personality adjectives"
        ),
        listOf(
            v("chore", "کار خانه", "I have many chores at home.", "کارهای خانه زیادی دارم."),
            v("always", "همیشه", "She always helps at home.", "او همیشه در خانه کمک می‌کند.", "adverb"),
            v("usually", "معمولاً", "I usually do my homework.", "معمولاً تکالیفم را انجام می‌دهم.", "adverb"),
            v("often", "غالباً", "He often plays video games.", "او غالباً بازی ویدیویی می‌کند.", "adverb"),
            v("sometimes", "گاهی", "She sometimes goes out with friends.", "او گاهی با دوستانش بیرون می‌رود.", "adverb"),
            v("never", "هرگز", "I never smoke.", "من هرگز سیگار نمی‌کشم.", "adverb"),
            v("wash", "شستن", "I wash the dishes.", "من ظرف‌ها را می‌شویم.", "verb"),
            v("clean", "تمیز کردن", "He cleans his room.", "او اتاقش را تمیز می‌کند.", "verb"),
            v("help", "کمک کردن", "Can you help me?", "می‌توانی کمکم کنی؟", "verb"),
            v("tidy", "مرتب کردن", "Please tidy your room.", "لطفاً اتاقت را مرتب کن.", "verb")
        ),
        listOf(
            GrammarSection("Adverbs of frequency", "Use always, usually, often, sometimes, never. They come before the main verb: I always eat breakfast. But after 'be': I am always happy."),
            GrammarSection("Imperatives", "Use the base verb for commands and instructions. Wash the dishes. Tidy your room. Don't watch too much TV."),
            GrammarSection("Articles: a/an and the", "Use a/an for singular countable nouns mentioned for the first time. Use the for specific things. This is a book. The book is on the table.")
        ),
        listOf(
            d("A", "Hi, Mrs. Johnson. How are you?", "سلام، خانم جانسون. چطورید؟"),
            d("B", "I'm fine, thanks. How are you, Mark?", "خوبم، ممنون. تو چطور مارک؟"),
            d("A", "OK. But I wanted to ask you something.", "خوبم. ولی می‌خواستم چیزی بپرسم."),
            d("B", "Sure, what is it?", "حتماً، چیه؟"),
            d("A", "Do you have problems with your teenage son?", "با پسر نوجوانت مشکلی داری؟"),
            d("B", "Oh, yes. Jack is sixteen. It's not easy.", "اوه، بله. جک شانزده ساله است. آسان نیست."),
            d("A", "What does he do?", "چه کار می‌کند؟"),
            d("B", "He never tidies his room. And he always leaves his things everywhere.", "او هرگز اتاقش را مرتب نمی‌کند. و همیشه وسایلش را همه‌جا رها می‌کند."),
            d("A", "Does he help with chores?", "در کارهای خانه کمک می‌کند؟"),
            d("B", "Sometimes. But I often have to ask him three times.", "گاهی. ولی غالباً باید سه بار از او بخواهم."),
            d("A", "What about school? Does he study?", "مدرسه چطور؟ درس می‌خواند؟"),
            d("B", "Yes, he usually does his homework. But he often stays up late.", "بله، معمولاً تکالیفش را انجام می‌دهد. ولی غالباً دیر می‌خوابد."),
            d("A", "What time does he go to bed?", "چه ساعتی می‌خوابد؟"),
            d("B", "Usually around midnight. I think that's too late for a teenager.", "معمولاً حدود نیمه‌شب. فکر می‌کنم برای یک نوجوان خیلی دیر است."),
            d("A", "I agree. What does he do at night?", "موافقم. شب‌ها چه کار می‌کند؟"),
            d("B", "He plays video games or chats with friends.", "بازی ویدیویی می‌کند یا با دوستانش چت می‌کند."),
            d("A", "Does he go out with friends?", "با دوستانش بیرون می‌رود؟"),
            d("B", "Sometimes. But I always worry when he's out late.", "گاهی. ولی همیشه وقتی دیر بیرون است نگرانم."),
            d("A", "That's normal. My parents were the same.", "طبیعی است. والدین من هم همینطور بودند."),
            d("B", "Were you a difficult teenager?", "نوجوان دشواری بودی؟"),
            d("A", "Ha! My mother says I was terrible.", "ها! مادرم می‌گوید وحشتناک بودم."),
            d("B", "What did you do?", "چه کار می‌کردی؟"),
            d("A", "I never tidied my room. And I didn't always do my homework.", "هرگز اتاقم را مرتب نمی‌کردم. و همیشه تکالیفم را انجام نمی‌دادم."),
            d("B", "So there's hope for Jack!", "پس برای جک امید هست!"),
            d("A", "Ha! Yes. I changed when I went to university.", "ها! بله. وقتی به دانشگاه رفتم تغییر کردم."),
            d("B", "That's good to hear. So I should be patient?", "شنیدنش خوب است. پس باید صبور باشم؟"),
            d("A", "Yes. And talk to him. Explain why you want him to help.", "بله. و با او صحبت کن. توضیح بده چرا می‌خواهی کمک کند."),
            d("B", "You're right. I'll try.", "حق داری. تلاش می‌کنم."),
            d("A", "And don't always say 'No'. Try 'Yes, but...' sometimes.", "و همیشه 'نه' نگو. گاهی 'بله، ولی...' را امتحان کن."),
            d("B", "That's good advice. Thank you, Mark.", "توصیه خوبی است. ممنون مارک."),
            d("A", "You're welcome. Good luck!", "خواهش می‌کنم. موفق باشی!"),
            d("B", "Thanks. I need it!", "ممنون. به آن نیاز دارم!"),
            d("A", "See you soon, Mrs. Johnson.", "به‌زودی می‌بینمتان، خانم جانسون."),
            d("B", "See you, Mark. Bye!", "می‌بینمت مارک. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How old is Jack?", listOf("14", "15", "16", "17"), 2),
            q("What does Jack never do?", listOf("study", "tidy his room", "go out", "play games"), 1),
            q("What time does Jack go to bed?", listOf("9 PM", "10 PM", "11 PM", "around midnight"), 3),
            q("What was Mark like as a teenager?", listOf("very quiet", "difficult", "a good student", "always helpful"), 1),
            q("I ___ eat breakfast.", listOf("always", "always am", "am always", "always is"), 0),
            q("She ___ happy.", listOf("always is", "is always", "always be", "be always"), 1),
            q("___ your room!", listOf("Tidy", "Tidies", "Tidying", "Tidied"), 0),
            q("He ___ plays video games.", listOf("often", "often is", "is often", "often are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Stay up late", "دیر خوابیدن", "He often stays up late.", "او غالباً دیر می‌خوابد."),
            IdiomExpression("There's hope", "امید هست", "So there's hope for Jack!", "پس برای جک امید هست!"),
            IdiomExpression("Good advice", "توصیه خوب", "That's good advice.", "توصیه خوبی است.")
        ),
        pronunciation = listOf(
            PronunciationTip("Adverb stress", "Stress the adverb: I ALways eat breakfast. She NEver tidies her room."),
            PronunciationTip("Imperative intonation", "Imperatives often have falling intonation: Tidy your room! ↘")
        ),
        culture = listOf(
            CulturalNote("Teenagers and parents", "Parent-teen relationships can be challenging. Common issues include chores, homework, screen time, and curfews."),
            CulturalNote("Adverbs of frequency", "Always = 100%, usually = 90%, often = 70%, sometimes = 50%, never = 0%. These are approximate.")
        ),
        mistakes = listOf(
            CommonMistake("She always is happy.", "She is always happy.", "Adverbs of frequency come after 'be'."),
            CommonMistake("He plays often video games.", "He often plays video games.", "Adverbs come before the main verb."),
            CommonMistake("No tidy your room.", "Don't tidy your room.", "Use 'don't' for negative imperatives.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What problems does Mrs. Johnson have with Jack?", "He never tidies his room, often needs reminding to help, and stays up late playing games."),
            ComprehensionQuestion("What advice does Mark give?", "Be patient, talk to him, explain why, and use 'Yes, but...' instead of always saying 'No'.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about household chores in your family.", "درباره کارهای خانه در خانواده‌ات صحبت کن.", "I always... / My brother never... / We sometimes..."),
            SpeakingTask("Give advice to a friend about a family problem.", "به یک دوست درباره یک مشکل خانوادگی توصیه کن.", "You should... / Try to... / Don't always...")
        ),
        writing = listOf(
            WritingTask("Write about your family's daily routine.", "درباره روتین روزانه خانواده‌ات بنویس.", 80, "Use adverbs of frequency and imperatives.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 5 — No way! | اصلاً!  (≈ 115 خط)
    // Grammar: can/can't; present continuous (review)
    // Vocabulary: abilities, sports, activities
    // ═══════════════════════════════════════════════════════════
    private fun file5() = base(
        5, "No way!", "اصلاً!",
        listOf(
            "Use can/can't for ability and permission",
            "Ask and answer questions with can",
            "Talk about abilities and sports",
            "Describe what people can and can't do"
        ),
        listOf(
            v("can", "توانستن", "I can swim.", "می‌توانم شنا کنم.", "verb"),
            v("can't", "نتوانستن", "I can't drive.", "نمی‌توانم رانندگی کنم.", "verb"),
            v("swim", "شنا کردن", "Can you swim?", "می‌توانی شنا کنی؟", "verb"),
            v("drive", "رانندگی کردن", "She can drive a car.", "او می‌تواند رانندگی کند.", "verb"),
            v("cook", "آشپزی کردن", "I can cook Italian food.", "می‌توانم غذای ایتالیایی بپزم.", "verb"),
            v("sing", "خواندن", "He can sing very well.", "او خیلی خوب می‌خواند.", "verb"),
            v("dance", "رقصیدن", "She can dance beautifully.", "او زیبا می‌رقصد.", "verb"),
            v("play", "بازی کردن", "Can you play tennis?", "می‌توانی تنیس بازی کنی؟", "verb"),
            v("speak", "صحبت کردن", "I can speak three languages.", "می‌توانم سه زبان صحبت کنم.", "verb"),
            v("understand", "فهمیدن", "I can't understand this.", "نمی‌توانم این را بفهمم.", "verb")
        ),
        listOf(
            GrammarSection("Can/Can't for ability", "Use can + base verb. I can swim. She can drive. They can't come. Use 'can't' for negative."),
            GrammarSection("Questions with can", "Can you swim? Can she drive? Can they come? Short answers: Yes, I can. No, I can't."),
            GrammarSection("Present continuous review", "Use am/is/are + verb-ing for actions happening now. I'm studying. She's working.")
        ),
        listOf(
            d("A", "Wow! You're really good at dancing.", "واو! واقعاً در رقصیدن خوبی."),
            d("B", "Thanks! I love to dance. Can you dance?", "ممنون! عاشق رقصیدنم. تو می‌توانی برقصی؟"),
            d("A", "No, I can't. I have two left feet!", "نه، نمی‌توانم. دو پای چپ دارم!"),
            d("B", "Ha! I don't believe that. Everyone can dance.", "ها! باور نمی‌کنم. همه می‌توانند برقصند."),
            d("A", "Well, I can't. What else can you do?", "خب، من نمی‌توانم. دیگر چه کارهایی می‌توانی بکنی؟"),
            d("B", "I can sing a little. And I can play the piano.", "کمی می‌توانم بخوانم. و پیانو می‌توانم بنوازم."),
            d("A", "Really? Can you play any other instruments?", "واقعاً؟ ساز دیگری هم می‌توانی بنوازی؟"),
            d("B", "Yes, I can play the guitar, too. And you?", "بله، گیتار هم می‌توانم بنوازم. تو چطور؟"),
            d("A", "I can play basketball. But I can't play any instruments.", "می‌توانم بسکتبال بازی کنم. ولی هیچ سازی نمی‌توانم بنوازم."),
            d("B", "Basketball! That's great. Can you swim?", "بسکتبال! عالیه. می‌توانی شنا کنی؟"),
            d("A", "Yes, I can. I swim every weekend.", "بله. هر آخر هفته شنا می‌کنم."),
            d("B", "Me too. Can you drive?", "من هم. می‌توانی رانندگی کنی؟"),
            d("A", "Yes, I can. But I don't have a car.", "بله. ولی ماشین ندارم."),
            d("B", "Do you want to drive my car?", "می‌خواهی ماشین من را برانی؟"),
            d("A", "No way! I'm not ready for that.", "اصلاً! برای آن آماده نیستم."),
            d("B", "Ha! OK, OK. What about cooking? Can you cook?", "ها! باشه، باشه. آشپزی چطور؟ می‌توانی آشپزی کنی؟"),
            d("A", "Yes, I can. I make great pasta.", "بله. پاستای عالی درست می‌کنم."),
            d("B", "Nice! Can you make desserts?", "عالی! دسر می‌توانی درست کنی؟"),
            d("A", "No, I can't. But my sister can make amazing cakes.", "نه، نمی‌توانم. ولی خواهرم کیک‌های فوق‌العاده‌ای درست می‌کند."),
            d("B", "Wow. Can I meet her?", "واو. می‌توانم ببینمش؟"),
            d("A", "Ha! Maybe. She's very busy.", "ها! شاید. او خیلی مشغول است."),
            d("B", "What does she do?", "شغلش چیست؟"),
            d("A", "She's a chef. She works at a famous restaurant.", "او سرآشپز است. در یک رستوران معروف کار می‌کند."),
            d("B", "That's impressive. Can she cook Italian food?", "تحسین‌برانگیز است. می‌تواند غذای ایتالیایی بپزد؟"),
            d("A", "Of course! Italian and French.", "البته! ایتالیایی و فرانسوی."),
            d("B", "Amazing. Can you speak Italian?", "شگفت‌انگیز است. ایتالیایی می‌توانی صحبت کنی؟"),
            d("A", "A little. But I can't understand fast speakers.", "کمی. ولی نمی‌توانم گویندگان سریع را بفهمم."),
            d("B", "That's normal. It takes time.", "طبیعی است. زمان می‌برد."),
            d("A", "Well, I should go. Can we meet tomorrow?", "خب، باید بروم. می‌توانیم فردا همدیگر را ببینیم؟"),
            d("B", "Yes, we can. See you then!", "بله، می‌توانیم. تا اون موقع!"),
            d("A", "See you!", "می‌بینمت!"),
            d("B", "By the way, can you help me with something?", "راستی، می‌توانی در چیزی کمکم کنی؟"),
            d("A", "Sure. What is it?", "حتماً. چیه؟"),
            d("B", "Can you teach me some basketball moves?", "می‌توانی چند حرکت بسکتبال یادم بدهی؟"),
            d("A", "Of course! I'd love to.", "البته! دوست دارم."),
            d("B", "Great. Thanks!", "عالی. ممنون!"),
            d("A", "No problem. See you tomorrow.", "مشکلی نیست. فردا می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What can B do?", listOf("play basketball", "sing, dance, play piano and guitar", "cook Italian food", "drive trucks"), 1),
            q("What can A do?", listOf("dance", "play instruments", "play basketball and swim", "cook desserts"), 2),
            q("What does A's sister do?", listOf("teacher", "chef", "doctor", "artist"), 1),
            q("Can A speak Italian?", listOf("fluently", "a little", "no", "only reads it"), 1),
            q("I ___ swim.", listOf("can", "am", "is", "are"), 0),
            q("She ___ drive a car.", listOf("can", "can's", "cans", "can to"), 0),
            q("___ you play tennis?", listOf("Can", "Do", "Are", "Is"), 0),
            q("No, I ___.", listOf("can't", "don't", "aren't", "isn't"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Two left feet", "دست و پا چلفتی بودن", "I have two left feet!", "دو پای چپ دارم!"),
            IdiomExpression("No way!", "اصلاً!", "No way!", "اصلاً!"),
            IdiomExpression("It takes time", "زمان می‌برد", "It takes time.", "زمان می‌برد.")
        ),
        pronunciation = listOf(
            PronunciationTip("Can/Can't", "In natural speech, 'can' is often weak /kən/ and 'can't' is strong /kænt/."),
            PronunciationTip("Question intonation with can", "Yes/No questions with 'can': rising intonation. Can you swim? ↗")
        ),
        culture = listOf(
            CulturalNote("Talking about abilities", "Asking about abilities (Can you...?) is a common way to get to know someone."),
            CulturalNote("Instruments", "In English, we say 'play the piano', 'play the guitar' — 'the' is always used with instruments.")
        ),
        mistakes = listOf(
            CommonMistake("I can to swim.", "I can swim.", "After 'can', use the base verb without 'to'."),
            CommonMistake("She cans drive.", "She can drive.", "'Can' doesn't change with he/she/it."),
            CommonMistake("I can play piano.", "I can play the piano.", "Use 'the' before instrument names.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What can B do?", "B can sing, dance, play the piano and guitar."),
            ComprehensionQuestion("What can A do?", "A can play basketball, swim, drive, and cook pasta.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about things you can and can't do.", "درباره کارهایی که می‌توانی و نمی‌توانی بکنی صحبت کن.", "I can... / I can't... / I can a little..."),
            SpeakingTask("Ask a partner about their abilities.", "از یک دوست درباره توانایی‌هایش بپرس.", "Can you...? / Can you play...?")
        ),
        writing = listOf(
            WritingTask("Write about your abilities.", "درباره توانایی‌هایت بنویس.", 70, "Use can and can't.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 6 — A lucky escape | یک فرار خوش‌شانسانه  (≈ 115 خط)
    // Grammar: past simple: be; regular and irregular verbs
    // Vocabulary: travel, weather, time expressions
    // ═══════════════════════════════════════════════════════════
    private fun file6() = base(
        6, "A lucky escape", "یک فرار خوش‌شانسانه",
        listOf(
            "Use past simple of be: was/were",
            "Use past simple regular verbs with -ed",
            "Use common irregular past verbs",
            "Talk about past experiences"
        ),
        listOf(
            v("yesterday", "دیروز", "I was tired yesterday.", "دیروز خسته بودم.", "adverb"),
            v("last night", "دیشب", "We were at home last night.", "دیشب خانه بودیم."),
            v("last week", "هفته پیش", "She was in Rome last week.", "هفته پیش در رم بود."),
            v("ago", "پیش", "Two years ago, I lived in Paris.", "دو سال پیش، در پاریس زندگی می‌کردم.", "adverb"),
            v("travel", "سفر کردن", "We traveled to Italy.", "به ایتالیا سفر کردیم.", "verb"),
            v("arrive", "رسیدن", "We arrived at noon.", "سر ظهر رسیدیم.", "verb"),
            v("visit", "بازدید کردن", "We visited many museums.", "از موزه‌های زیادی بازدید کردیم.", "verb"),
            v("happen", "اتفاق افتادن", "What happened?", "چه اتفاق افتاد؟", "verb"),
            v("escape", "فرار کردن", "They escaped from the storm.", "آن‌ها از طوفان فرار کردند.", "verb"),
            v("lucky", "خوش‌شانس", "We were very lucky.", "خیلی خوش‌شانس بودیم.", "adjective")
        ),
        listOf(
            GrammarSection("Past simple: be", "Use was with I, he, she, it. Use were with you, we, they. I was tired. They were late."),
            GrammarSection("Past simple: regular verbs", "Add -ed to most regular verbs: visit → visited, arrive → arrived, travel → traveled."),
            GrammarSection("Past simple: irregular verbs", "Common irregular verbs: go → went, see → saw, have → had, take → took, come → came, get → got."),
            GrammarSection("Time expressions", "yesterday, last night, last week, last year, two days ago, in 2015.")
        ),
        listOf(
            d("A", "Hi, Maria! I heard about your trip. How was it?", "سلام ماریا! درباره سفرت شنیدم. چطور بود؟"),
            d("B", "It was amazing. But there was a problem at the end.", "شگفت‌انگیز بود. ولی آخرش مشکلی پیش آمد."),
            d("A", "Really? What happened?", "واقعاً؟ چه شد؟"),
            d("B", "We were in Thailand. On the last day, there was a big storm.", "در تایلند بودیم. آخرین روز، طوفان بزرگی شد."),
            d("A", "Oh no! Were you OK?", "اوه نه! خوب بودید؟"),
            d("B", "Yes, we were fine. But it was scary.", "بله، خوب بودیم. ولی ترسناک بود."),
            d("A", "Tell me more. What did you do?", "بیشتر بگو. چه کار کردید؟"),
            d("B", "We were on the beach when the storm started.", "وقتی طوفان شروع شد، در ساحل بودیم."),
            d("A", "Were there many people there?", "افراد زیادی آنجا بودند؟"),
            d("B", "Yes, there were. Everyone was surprised.", "بله. همه غافلگیر شدند."),
            d("A", "What did you do?", "چه کار کردید؟"),
            d("B", "We ran to the hotel. It was very close, thank God.", "به سمت هتل دویدیم. خیلی نزدیک بود، شکرگزار خدا."),
            d("A", "Were your children with you?", "بچه‌هایت با تو بودند؟"),
            d("B", "Yes, they were. They were scared, but OK.", "بله، بودند. ترسیده بودند، ولی خوب بودند."),
            d("A", "Did you call for help?", "کمک خواستید؟"),
            d("B", "No, we didn't. The hotel staff helped us.", "نه. کارکنان هتل کمکمان کردند."),
            d("A", "How long did the storm last?", "طوفان چقدر طول کشید؟"),
            d("B", "About two hours. Then it stopped.", "حدود دو ساعت. بعد متوقف شد."),
            d("A", "Was there any damage?", "آسیبی بود؟"),
            d("B", "A little. Some trees fell down. But no one was hurt.", "کمی. چند درخت افتاد. ولی کسی آسیب ندید."),
            d("A", "That's good. You were very lucky.", "خوبه. خیلی خوش‌شانس بودید."),
            d("B", "Yes, we were. We were also smart.", "بله، بودیم. همچنین باهوش بودیم."),
            d("A", "What do you mean?", "منظورت چیست؟"),
            d("B", "The day before, we checked the weather report. So we knew a storm was coming.", "روز قبل، گزارش هوا را بررسی کردیم. پس می‌دانستیم طوفان می‌آید."),
            d("A", "So you were prepared!", "پس آماده بودید!"),
            d("B", "Yes. We stayed close to the hotel all day.", "بله. تمام روز نزدیک هتل ماندیم."),
            d("A", "That was smart thinking.", "این فکر هوشمندانه‌ای بود."),
            d("B", "Thanks. Where did you go on vacation last year?", "ممنون. سال گذشته به کجا سفر کردی؟"),
            d("A", "I went to Spain. To Barcelona.", "به اسپانیا رفتم. به بارسلونا."),
            d("B", "Oh, nice! How was it?", "اوه، عالی! چطور بود؟"),
            d("A", "It was wonderful. The food was amazing.", "فوق‌العاده بود. غذا شگفت‌انگیز بود."),
            d("B", "What did you visit?", "از چه چیزی بازدید کردی؟"),
            d("A", "We saw the Sagrada Familia. It was incredible.", "ساگرادا فامیلیا را دیدیم. باورنکردنی بود."),
            d("B", "I've heard about it. It's very famous.", "درباره‌اش شنیده‌ام. خیلی معروف است."),
            d("A", "Yes. And we walked a lot. My feet hurt for days.", "بله. و کلی پیاده رفتیم. پاهایم روزها درد گرفت."),
            d("B", "Ha! That happens to me too.", "ها! برای من هم اتفاق می‌افتد."),
            d("A", "Well, I'm glad you're safe.", "خب، خوشحالم که سالمی."),
            d("B", "Thanks. Me too.", "ممنون. من هم."),
            d("A", "See you soon!", "به‌زودی می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where was Maria on vacation?", listOf("Spain", "Thailand", "Italy", "Mexico"), 1),
            q("What happened on the last day?", listOf("a fire", "a big storm", "an accident", "a robbery"), 1),
            q("How long did the storm last?", listOf("30 minutes", "1 hour", "2 hours", "all day"), 2),
            q("How did they know a storm was coming?", listOf("the hotel told them", "they checked the weather report", "someone called them", "they saw it"), 1),
            q("I ___ tired yesterday.", listOf("am", "is", "was", "were"), 2),
            q("They ___ at home.", listOf("was", "were", "am", "is"), 1),
            q("We ___ many museums.", listOf("visit", "visited", "visiting", "visits"), 1),
            q("She ___ to Spain last year.", listOf("go", "went", "goes", "going"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Thank God", "شکرگزار خدا", "It was very close, thank God.", "خیلی نزدیک بود، شکرگزار خدا."),
            IdiomExpression("Smart thinking", "فکر هوشمندانه", "That was smart thinking.", "این فکر هوشمندانه‌ای بود."),
            IdiomExpression("Glad you're safe", "خوشحالم که سالمی", "I'm glad you're safe.", "خوشحالم که سالمی.")
        ),
        pronunciation = listOf(
            PronunciationTip("-ed endings", "The -ed ending has three sounds: /t/ (walked), /d/ (arrived), /ɪd/ (visited)."),
            PronunciationTip("Past tense verbs", "Practice: was /wʌz/, were /wɜːr/, went /went/, saw /sɔː/.")
        ),
        culture = listOf(
            CulturalNote("Travel in Thailand", "Thailand is a popular tourist destination in Southeast Asia, known for its beaches, temples, and food."),
            CulturalNote("Weather reports", "Checking the weather report before travel is a common practice.")
        ),
        mistakes = listOf(
            CommonMistake("I were tired.", "I was tired.", "Use 'was' with 'I'."),
            CommonMistake("They was at home.", "They were at home.", "Use 'were' with 'they'."),
            CommonMistake("We visit many museums (last year).", "We visited many museums last year.", "Use past simple with past time expressions.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What happened during Maria's trip to Thailand?", "A big storm started while they were on the beach."),
            ComprehensionQuestion("Why were they prepared for the storm?", "They had checked the weather report the day before.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a trip you took.", "درباره سفری که رفتی صحبت کن.", "I went to... / It was... / We visited..."),
            SpeakingTask("Tell a story about a problem you had on a trip.", "داستانی درباره مشکلی که در سفر داشتی تعریف کن.", "We were... when... / Then... / Finally...")
        ),
        writing = listOf(
            WritingTask("Write about a memorable trip.", "درباره یک سفر به‌یادماندنی بنویس.", 90, "Use past simple with was/were and regular/irregular verbs.")
        )
    )

        // ═══════════════════════════════════════════════════════════
    // FILE 7 — The story behind the photo | داستان پشت عکس  (≈ 115 خط)
    // Grammar: past continuous; past simple vs. past continuous
    // Vocabulary: the news, past time expressions
    // ═══════════════════════════════════════════════════════════
    private fun file7() = base(
        7, "The story behind the photo", "داستان پشت عکس",
        listOf(
            "Use past continuous for actions in progress in the past",
            "Use past continuous vs. past simple correctly",
            "Tell a story about a past event",
            "Describe what was happening in a photo"
        ),
        listOf(
            v("photo", "عکس", "This is a photo of my grandparents.", "این عکسی از پدربزرگ و مادربزرگم است."),
            v("happening", "اتفاق افتادن", "What was happening in the photo?", "در عکس چه اتفاقی می‌افتاد؟", "verb"),
            v("while", "در حالی که", "I was reading while she was cooking.", "من می‌خواندم در حالی که او آشپزی می‌کرد."),
            v("when", "وقتی", "I was walking when I saw him.", "وقتی او را دیدم، راه می‌رفتم."),
            v("suddenly", "ناگهان", "Suddenly, the lights went out.", "ناگهان چراغ‌ها خاموش شدند.", "adverb"),
            v("heard", "شنید", "I heard a strange noise.", "صدای عجیبی شنیدم.", "verb"),
            v("found", "یافت", "She found a wallet on the street.", "او کیف پولی در خیابان پیدا کرد.", "verb"),
            v("left", "ترک کرد", "They left the party early.", "آن‌ها مهمانی را زود ترک کردند.", "verb"),
            v("wrote", "نوشت", "He wrote a letter to his mother.", "او نامه‌ای برای مادرش نوشت.", "verb"),
            v("became", "شد", "She became a famous singer.", "او خواننده معروفی شد.", "verb")
        ),
        listOf(
            GrammarSection("Past continuous", "Use was/were + verb-ing for actions in progress in the past. I was reading. They were playing. What were you doing at 8 PM?"),
            GrammarSection("Past continuous + past simple", "Use past continuous for the longer action and past simple for the shorter action. I was walking when I saw him."),
            GrammarSection("Irregular past verbs", "More irregular verbs: hear → heard, find → found, leave → left, write → wrote, become → became, meet → met, lose → lost.")
        ),
        listOf(
            d("A", "Look at this old photo. Can you see it?", "این عکس قدیمی را ببین. می‌بینی؟"),
            d("B", "Yes. Wow, is that your grandmother?", "بله. واو، آن مادربزرگت است؟"),
            d("A", "Yes, it is. She was twenty years old in this photo.", "بله. در این عکس بیست ساله بود."),
            d("B", "She was beautiful. What was she doing?", "زیبا بود. چه کار می‌کرد؟"),
            d("A", "She was standing in front of her house. It was in a small village.", "جلوی خانه‌اش ایستاده بود. در یک روستای کوچک بود."),
            d("B", "And who's that man next to her?", "و آن مرد کنارش کیست؟"),
            d("A", "That's my grandfather. He was her boyfriend at the time.", "آن پدربزرگم است. آن موقع دوست‌پسرش بود."),
            d("B", "That's so romantic. When did they get married?", "خیلی رمانتیک است. کی ازدواج کردند؟"),
            d("A", "They got married in 1955. They met at a dance.", "در سال ۱۹۵۵ ازدواج کردند. در یک رقص آشنا شدند."),
            d("B", "A dance! That's lovely. Tell me more.", "یک رقص! زیباست. بیشتر بگو."),
            d("A", "Well, my grandmother was a teacher and my grandfather worked on a farm.", "خب، مادربزرگم معلم بود و پدربزرگم در مزرعه کار می‌کرد."),
            d("B", "Did they live in the same village?", "در همان روستا زندگی می‌کردند؟"),
            d("A", "Yes, they did. Their families were neighbors.", "بله. خانواده‌هایشان همسایه بودند."),
            d("B", "What a story! Did your grandfather have other girlfriends?", "چه داستانی! پدربزرگت دوست‌دختر دیگری داشت؟"),
            d("A", "I don't know. He never told me.", "نمی‌دانم. هرگز به من نگفت."),
            d("B", "Ha! Well, I can see why he liked her.", "ها! خب، می‌بینم چرا او را دوست داشت."),
            d("A", "Yes. She was kind and funny. Everyone loved her.", "بله. مهربان و بامزه بود. همه دوستش داشتند."),
            d("B", "Was she a good teacher?", "معلم خوبی بود؟"),
            d("A", "She was excellent. She taught for forty years.", "عالی بود. چهل سال تدریس کرد."),
            d("B", "Wow, that's a long time.", "واو، زمان زیادی است."),
            d("A", "Yes. She loved her students very much.", "بله. دانش‌آموزانش را خیلی دوست داشت."),
            d("B", "What about your grandfather? What did he do later?", "پدربزرگت چطور؟ بعداً چه کار کرد؟"),
            d("A", "He became a carpenter. He made furniture.", "نجار شد. مبلمان می‌ساخت."),
            d("B", "A carpenter? That's a great job.", "نجار؟ شغل عالی‌ای است."),
            d("A", "Yes. He made all the furniture in their house.", "بله. تمام مبلمان خانه‌شان را ساخت."),
            d("B", "Really? Can you still see some of it?", "واقعاً؟ هنوز بعضی‌اش را می‌بینی؟"),
            d("A", "Yes, I have his old desk at my house.", "بله، میز کار قدیمی‌اش را در خانه‌ام دارم."),
            d("B", "That's wonderful. It must be very special to you.", "فوق‌العاده است. باید برایت خیلی خاص باشد."),
            d("A", "It is. Every time I look at it, I remember him.", "هست. هر بار نگاهش می‌کنم، یادش می‌افتم."),
            d("B", "I understand. Family memories are important.", "می‌فهمم. خاطرات خانوادگی مهم هستند."),
            d("A", "Yes, they are. Do you have old family photos?", "بله. تو عکس‌های خانوادگی قدیمی داری؟"),
            d("B", "I do. My parents have a lot. I love looking at them.", "دارم. والدینم زیاد دارند. عاشق نگاه کردن به آن‌هایم."),
            d("A", "Me too. This photo was taken in 1950.", "من هم. این عکس در سال ۱۹۵۰ گرفته شده."),
            d("B", "1950! That's over seventy years ago.", "۱۹۵۰! بیش از هفتاد سال پیش است."),
            d("A", "I know. Time goes so fast.", "می‌دانم. زمان اینقدر سریع می‌گذرد."),
            d("B", "What was happening in the world at that time?", "آن موقع در جهان چه اتفاقی می‌افتاد؟"),
            d("A", "It was after the war. People were rebuilding their lives.", "بعد از جنگ بود. مردم زندگی‌شان را بازسازی می‌کردند."),
            d("B", "That must have been difficult.", "باید سخت بوده باشد."),
            d("A", "Yes, but people were hopeful. They wanted a better future.", "بله، ولی مردم امیدوار بودند. آینده بهتری می‌خواستند."),
            d("B", "And they got it. Look at us now.", "و به آن رسیدند. الان ما را ببین."),
            d("A", "Exactly. We owe them so much.", "دقیقاً. خیلی به آن‌ها مدیونیم."),
            d("B", "Well, this was a beautiful story. Thanks for sharing.", "خب، این داستان زیبایی بود. ممنون که به اشتراک گذاشتی."),
            d("A", "You're welcome. I love telling it.", "خواهش می‌کنم. عاشق تعریف کردنشم."),
            d("B", "See you soon!", "به‌زودی می‌بینمت!"),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("How old was A's grandmother in the photo?", listOf("15", "18", "20", "25"), 2),
            q("When did A's grandparents get married?", listOf("1950", "1955", "1960", "1965"), 1),
            q("What did A's grandfather become?", listOf("teacher", "farmer", "carpenter", "doctor"), 2),
            q("When was the photo taken?", listOf("1940", "1945", "1950", "1955"), 2),
            q("She ___ standing in front of her house.", listOf("was", "were", "am", "is"), 0),
            q("I was reading ___ she was cooking.", listOf("when", "while", "that", "what"), 1),
            q("They ___ in 1955.", listOf("marry", "married", "marrying", "marries"), 1),
            q("He ___ a carpenter.", listOf("become", "became", "becoming", "becomes"), 1)
        ),
        idioms = listOf(
            IdiomExpression("At the time", "آن موقع", "He was her boyfriend at the time.", "آن موقع دوست‌پسرش بود."),
            IdiomExpression("What a story!", "چه داستانی!", "What a story!", "چه داستانی!"),
            IdiomExpression("Owe them so much", "خیلی مدیون بودن", "We owe them so much.", "خیلی به آن‌ها مدیونیم.")
        ),
        pronunciation = listOf(
            PronunciationTip("Past continuous stress", "Stress the -ing verb: She was STANDing in front of her house."),
            PronunciationTip("Irregular past verbs", "Practice: hear → heard /hɜːrd/, find → found /faʊnd/, leave → left /lɛft/.")
        ),
        culture = listOf(
            CulturalNote("Family photos", "Family photos are treasured in many cultures. They preserve memories and connect generations."),
            CulturalNote("Post-war reconstruction", "After World War II, many countries experienced rapid change. People focused on rebuilding their lives.")
        ),
        mistakes = listOf(
            CommonMistake("She was stand in front of her house.", "She was standing in front of her house.", "Use -ing after was/were."),
            CommonMistake("I was reading when she was cooking (wrong meaning).", "I was reading while she was cooking.", "Use 'while' for two simultaneous long actions."),
            CommonMistake("They get married in 1955.", "They got married in 1955.", "Use past simple with past time expressions.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did A's grandparents do?", "A's grandmother was a teacher for 40 years; A's grandfather was a carpenter."),
            ComprehensionQuestion("Why is the old desk special to A?", "It reminds A of their grandfather every time they look at it.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about an old family photo.", "درباره یک عکس خانوادگی قدیمی صحبت کن.", "In this photo... / He/She was... / It was taken in..."),
            SpeakingTask("Tell a story from the past using past continuous.", "داستانی از گذشته با گذشته استمراری تعریف کن.", "I was... when... / While I was..., he...")
        ),
        writing = listOf(
            WritingTask("Write the story behind a family photo.", "داستان پشت یک عکس خانوادگی را بنویس.", 100, "Use past simple and past continuous.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 8 — Practical English: Hotel problems | انگلیسی کاربردی: مشکلات هتل  (≈ 115 خط)
    // Grammar: Practical English - making requests, complaints
    // Vocabulary: hotel vocabulary, polite requests
    // ═══════════════════════════════════════════════════════════
    private fun file8() = base(
        8, "Practical English: Hotel problems", "انگلیسی کاربردی: مشکلات هتل",
        listOf(
            "Make polite requests in a hotel",
            "Report problems in a hotel room",
            "Ask for help at the front desk",
            "Understand and respond to complaints"
        ),
        listOf(
            v("front desk", "پذیرش", "The front desk is on the ground floor.", "پذیرش در طبقه همکف است."),
            v("reception", "پذیرش", "I called reception to ask for towels.", "به پذیرش زنگ زدم تا حوله بخواهم."),
            v("complain", "شکایت کردن", "I want to complain about the noise.", "می‌خواهم از سر و صدا شکایت کنم.", "verb"),
            v("broken", "خراب", "The air conditioner is broken.", "کولر خراب است.", "adjective"),
            v("towel", "حوله", "Could I have some extra towels?", "می‌توانم چند حوله اضافه بگیرم؟"),
            v("blanket", "پتو", "I need an extra blanket.", "به یک پتو اضافه نیاز دارم."),
            v("air conditioner", "کولر", "The air conditioner isn't working.", "کولر کار نمی‌کند."),
            v("noisy", "پر سر و صدا", "The room is very noisy.", "اتاق خیلی پر سر و صداست.", "adjective"),
            v("manager", "مدیر", "I'd like to speak to the manager.", "می‌خواهم با مدیر صحبت کنم."),
            v("solve", "حل کردن", "We'll solve the problem right away.", "مشکل را همین الان حل می‌کنیم.", "verb")
        ),
        listOf(
            GrammarSection("Polite requests with could/can", "Use 'Could I...?' or 'Could you...?' for polite requests. Could I have some towels? Could you help me, please?"),
            GrammarSection("Reporting problems", "Use present continuous or 'be + adjective' for problems. The air conditioner isn't working. The room is very noisy."),
            GrammarSection("Responding to complaints", "Use 'I'm sorry about that', 'I'll send someone up right away', 'We'll take care of it', 'Would you like to change rooms?'")
        ),
        listOf(
            d("A", "Good evening. How can I help you?", "عصر بخیر. چطور می‌توانم کمکتان کنم؟"),
            d("B", "Hi, I'm in room 315. I have a problem.", "سلام، من در اتاق ۳۱۵ هستم. مشکلی دارم."),
            d("A", "I'm sorry to hear that. What's the problem?", "متأسفم. مشکل چیست؟"),
            d("B", "The air conditioner isn't working. And it's very hot in the room.", "کولر کار نمی‌کند. و اتاق خیلی گرم است."),
            d("A", "I'm so sorry. Would you like to change rooms?", "خیلی متأسفم. می‌خواهید اتاق عوض کنید؟"),
            d("B", "Yes, please. If you have another room available.", "بله، لطفاً. اگر اتاق دیگری موجود دارید."),
            d("A", "Let me check. Yes, we have room 502. It's on the fifth floor.", "بگذارید چک کنم. بله، اتاق ۵۰۲ داریم. در طبقه پنجم است."),
            d("B", "Is the air conditioner working in that room?", "کولر آن اتاق کار می‌کند؟"),
            d("A", "Yes, it is. I checked it this morning.", "بله. امروز صبح چکش کردم."),
            d("B", "Great. Can I move now?", "عالی. می‌توانم الان نقل مکان کنم؟"),
            d("A", "Of course. I'll send someone to help you with your bags.", "حتماً. کسی را می‌فرستم تا با چمدان‌هایتان کمکتان کند."),
            d("B", "Thank you. But before I move, can I ask for something else?", "ممنون. ولی قبل از نقل مکان، می‌توانم چیز دیگری هم بخواهم؟"),
            d("A", "Sure. What do you need?", "حتماً. چه نیاز دارید؟"),
            d("B", "Could I have some extra towels? And a blanket?", "می‌توانم چند حوله اضافه بگیرم؟ و یک پتو؟"),
            d("A", "Of course. I'll bring them up myself.", "حتماً. خودم می‌آورمشان."),
            d("B", "That's very kind of you.", "این خیلی لطف شماست."),
            d("A", "No problem at all. Is there anything else?", "اصلاً مشکلی نیست. چیز دیگری هست؟"),
            d("B", "Actually, yes. The Wi-Fi is very slow.", "در واقع، بله. وای‌فای خیلی کند است."),
            d("A", "I'm sorry about that. We're working on it.", "متأسفم برای آن. داریم رویش کار می‌کنیم."),
            d("B", "When will it be fixed?", "کی درست می‌شود؟"),
            d("A", "Hopefully by tomorrow morning. Would you like a Wi-Fi booster in your room?", "امیدوارم تا فردا صبح. وای‌فای بوستر در اتاقتان می‌خواهید؟"),
            d("B", "Yes, please. That would help.", "بله، لطفاً. کمک می‌کند."),
            d("A", "I'll bring one up with the towels.", "یکی را همراه حوله‌ها می‌آورم."),
            d("B", "Perfect. Thank you so much.", "عالی. خیلی ممنون."),
            d("A", "My pleasure. Is there anything else I can do for you?", "خواهش می‌کنم. کار دیگری هست که بتوانم انجام دهم؟"),
            d("B", "No, that's all for now. But I do want to make sure about one more thing.", "نه، فعلاً همین. ولی می‌خواهم درباره یک چیز دیگر مطمئن شوم."),
            d("A", "Of course. What is it?", "حتماً. چیه؟"),
            d("B", "The room next to mine is very noisy. There's a party going on.", "اتاق کناری من خیلی پر سر و صداست. یک مهمانی در جریان است."),
            d("A", "I'm very sorry about that. I'll call them right away.", "خیلی متأسفم. همین الان به آن‌ها زنگ می‌زنم."),
            d("B", "Thank you. I need to sleep. I have a meeting tomorrow.", "ممنون. باید بخوابم. فردا جلسه دارم."),
            d("A", "I understand. I'll take care of it immediately.", "می‌فهمم. بلافاصله رسیدگی می‌کنم."),
            d("B", "I appreciate it. And one more thing — could I have a wake-up call for 7 AM?", "قدردانی می‌کنم. و یک چیز دیگر — می‌توانم برای ساعت ۷ بیدارباش داشته باشم؟"),
            d("A", "Of course. What room did you say?", "حتماً. کدام اتاق گفتید؟"),
            d("B", "Room 502, after the move. Or 315 if I haven't moved yet.", "اتاق ۵۰۲، بعد از نقل مکان. یا ۳۱۵ اگر هنوز نقل مکان نکرده‌ام."),
            d("A", "Let me make a note. Wake-up call for 7 AM. Got it.", "بگذارید یادداشت کنم. بیدارباش برای ساعت ۷ صبح. متوجه شدم."),
            d("B", "Thank you so much. You've been very helpful.", "خیلی ممنون. خیلی کمک‌کننده بوده‌اید."),
            d("A", "It's my job. I hope you enjoy the rest of your stay.", "این شغل من است. امیدوارم از بقیه اقامتتان لذت ببرید."),
            d("B", "Me too. Thanks again. Good night.", "من هم. باز هم ممنون. شب بخیر."),
            d("A", "Good night, sir. I'll bring everything up in five minutes.", "شب بخیر، قربان. همه چیز را در پنج دقیقه می‌آورم."),
            d("B", "Perfect. See you soon.", "عالی. به‌زودی می‌بینمتان."),
            d("A", "See you, sir.", "می‌بینمتان، قربان."),
            d("B", "Oh, and could I also have an extra pillow? I forgot to ask.", "اوه، و می‌توانم یک بالش اضافه هم بگیرم؟ فراموش کردم بپرسم."),
            d("A", "Of course. Extra pillow, extra towels, blanket, and Wi-Fi booster. Anything else?", "حتماً. بالش اضافه، حوله اضافه، پتو، و وای‌فای بوستر. چیز دیگری؟"),
            d("B", "No, that's everything. Thank you!", "نه، همین کافی است. ممنون!"),
            d("A", "You're very welcome. I'll be up in a few minutes.", "خواهش می‌کنم. چند دقیقه دیگر بالا هستم."),
            d("B", "Perfect. Good night!", "عالی. شب بخیر!"),
            d("A", "Good night!", "شب بخیر!")
        ),
        listOf(
            q("What room is B in?", listOf("215", "315", "415", "502"), 1),
            q("What's the problem with B's room?", listOf("no hot water", "the air conditioner isn't working", "the TV is broken", "the key doesn't work"), 1),
            q("What does B ask for?", listOf("just towels", "extra towels, a blanket, a Wi-Fi booster, and an extra pillow", "only a blanket", "nothing"), 1),
            q("What time does B want a wake-up call?", listOf("6 AM", "6:30 AM", "7 AM", "8 AM"), 2),
            q("___ I have some towels?", listOf("Could", "Am", "Do", "Are"), 0),
            q("The air conditioner isn't ___.", listOf("work", "works", "working", "worked"), 2),
            q("I'll send someone ___ right away.", listOf("up", "in", "at", "of"), 0),
            q("Would you like ___ rooms?", listOf("change", "to change", "changing", "changed"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Right away", "همین الان", "I'll send someone right away.", "همین الان کسی را می‌فرستم."),
            IdiomExpression("Take care of", "رسیدگی کردن", "I'll take care of it.", "رسیدگی می‌کنم."),
            IdiomExpression("My pleasure", "خواهش می‌کنم", "My pleasure.", "خواهش می‌کنم."),
            IdiomExpression("Make a note", "یادداشت کردن", "Let me make a note.", "بگذارید یادداشت کنم.")
        ),
        pronunciation = listOf(
            PronunciationTip("Polite intonation", "Use rising intonation for polite requests: Could I have some towels? ↗"),
            PronunciationTip("Contractions", "Practice: I'll /aɪl/, isn't /ˈɪzənt/, we'll /wɪl/.")
        ),
        culture = listOf(
            CulturalNote("Hotel etiquette", "In many hotels, it's polite to give small tips to staff who help with bags or deliver items to your room."),
            CulturalNote("Polite complaints", "In English-speaking countries, it's common to make complaints politely.")
        ),
        mistakes = listOf(
            CommonMistake("I want some towels.", "Could I have some towels, please?", "Use 'Could I...?' for polite requests."),
            CommonMistake("The air conditioner no works.", "The air conditioner isn't working.", "Use 'isn't working' for negative present continuous.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What problems does B report?", "Air conditioner broken, slow Wi-Fi, noisy neighbors, needs extra items."),
            ComprehensionQuestion("How does the front desk resolve the problems?", "Offers a room change, brings extra items, contacts noisy neighbors, arranges wake-up call.")
        ),
        speaking = listOf(
            SpeakingTask("Role-play a hotel complaint with a partner.", "نقش‌بازی شکایت هتل با یک دوست.", "Could I have...? / The ... isn't working."),
            SpeakingTask("Practice polite requests.", "تمرین درخواست‌های مؤدبانه.", "Could you...? / Could I...? / Would you like...?")
        ),
        writing = listOf(
            WritingTask("Write an email to a hotel about a problem during your stay.", "ایمیلی به یک هتل درباره مشکلی در طول اقامتت بنویس.", 90, "Use polite requests and complaint vocabulary.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 9 — Working for a living | کار کردن برای گذران زندگی  (≈ 115 خط)
    // Grammar: countable/uncountable nouns; some/any; quantifiers
    // Vocabulary: food, drinks, containers, shopping
    // ═══════════════════════════════════════════════════════════
    private fun file9() = base(
        9, "Working for a living", "کار کردن برای گذران زندگی",
        listOf(
            "Use countable and uncountable nouns",
            "Use some/any and quantifiers",
            "Talk about food and shopping",
            "Ask about quantities with how much/how many"
        ),
        listOf(
            v("food", "غذا", "We need to buy some food.", "باید کمی غذا بخریم."),
            v("milk", "شیر", "There isn't any milk in the fridge.", "شیری در یخچال نیست."),
            v("bread", "نان", "I bought some bread at the store.", "از فروشگاه کمی نان خریدم."),
            v("rice", "برنج", "We have a lot of rice at home.", "برنج زیادی در خانه داریم."),
            v("bottle", "بطری", "I bought two bottles of water.", "دو بطری آب خریدم."),
            v("carton", "پاکت", "We need a carton of milk.", "به یک پاکت شیر نیاز داریم."),
            v("packet", "بسته", "She bought a packet of cookies.", "او یک بسته بیسکویت خرید."),
            v("can", "قوطی", "Can you buy a can of soup?", "می‌توانی یک قوطی سوپ بخری؟"),
            v("enough", "کافی", "We have enough food for the party.", "غذای کافی برای مهمانی داریم.", "adverb"),
            v("some", "کمی", "I need some sugar.", "به کمی شکر نیاز دارم."),
            v("any", "هیچ", "There isn't any coffee.", "قهوه‌ای نیست.")
        ),
        listOf(
            GrammarSection("Countable and uncountable nouns", "Countable nouns have singular and plural forms: an apple, two apples. Uncountable nouns don't: rice, milk, water, bread."),
            GrammarSection("Some and any", "Use 'some' in positive statements and offers. Use 'any' in negative statements and most questions."),
            GrammarSection("How much / How many", "Use 'how much' with uncountable nouns and 'how many' with countable nouns.")
        ),
        listOf(
            d("A", "Hi, Sarah! Are you going to the store?", "سلام سارا! به فروشگاه می‌روی؟"),
            d("B", "Yes, I am. Do you need anything?", "بله. چیزی لازم داری؟"),
            d("A", "Yes, please. We don't have any food at home.", "بله، لطفاً. هیچ غذایی در خانه نداریم."),
            d("B", "OK, what do you need?", "باشه، چه نیاز داری؟"),
            d("A", "Let me check. We need some bread, some milk, and some eggs.", "بگذار چک کنم. به کمی نان، کمی شیر و چند تخم‌مرغ نیاز داریم."),
            d("B", "How much bread?", "چقدر نان؟"),
            d("A", "Just one loaf, please.", "فقط یک قرص، لطفاً."),
            d("B", "And how much milk?", "و چقدر شیر؟"),
            d("A", "A carton of milk. The big one.", "یک پاکت شیر. بزرگش."),
            d("B", "How many eggs?", "چند تخم‌مرغ؟"),
            d("A", "A dozen, please.", "یک دوجین، لطفاً."),
            d("B", "Anything else?", "چیز دیگری؟"),
            d("A", "Do we need rice? Let me check the kitchen...", "به برنج نیاز داریم؟ بگذار آشپزخانه را چک کنم..."),
            d("B", "Take your time.", "عجله نکن."),
            d("A", "OK, I'm back. We have a lot of rice. We don't need any.", "باشه، برگشتم. برنج زیادی داریم. نیازی نیست."),
            d("B", "Good. What about fruit?", "خوبه. میوه چطور؟"),
            d("A", "Yes, we need some apples and bananas.", "بله، به چند سیب و موز نیاز داریم."),
            d("B", "How many apples?", "چند سیب؟"),
            d("A", "Six apples, please.", "شش سیب، لطفاً."),
            d("B", "And bananas?", "و موز؟"),
            d("A", "A bunch of bananas. Small, if possible.", "یک خوشه موز. اگر ممکن است کوچک."),
            d("B", "OK. Anything to drink?", "باشه. نوشیدنی؟"),
            d("A", "Yes, we need some water. Two big bottles.", "بله، به کمی آب نیاز داریم. دو بطری بزرگ."),
            d("B", "Do you need coffee or tea?", "قهوه یا چای نیاز داری؟"),
            d("A", "We have plenty of coffee. But we don't have any tea.", "قهوه زیاد داریم. ولی چای نداریم."),
            d("B", "So a packet of tea?", "پس یک بسته چای؟"),
            d("A", "Yes, please. Green tea, if they have it.", "بله، لطفاً. چای سبز، اگر داشته باشند."),
            d("B", "Anything for dinner?", "برای شام چیزی؟"),
            d("A", "Yes, actually. Can you buy some chicken? And some vegetables?", "بله، در واقع. می‌توانی کمی مرغ بخری؟ و کمی سبزیجات؟"),
            d("B", "How much chicken?", "چقدر مرغ؟"),
            d("A", "Half a kilo, please.", "نیم کیلو، لطفاً."),
            d("B", "What vegetables?", "چه سبزیجاتی؟"),
            d("A", "Some tomatoes, some onions, and some carrots.", "کمی گوجه، کمی پیاز، و کمی هویج."),
            d("B", "OK. That's a lot of things. Do you have a list?", "باشه. چیزهای زیادی است. لیست داری؟"),
            d("A", "Yes, I do. I'll send it to you now.", "بله، دارم. الان برایت می‌فرستم."),
            d("B", "Perfect. I'll call you if I have any questions.", "عالی. اگر سؤالی داشتم بهت زنگ می‌زنم."),
            d("A", "Thanks a lot, Sarah.", "خیلی ممنون سارا."),
            d("B", "No problem. Do you need anything else?", "مشکلی نیست. چیز دیگری نیاز داری؟"),
            d("A", "Actually, yes. Can you buy a can of soup? For lunch tomorrow.", "در واقع، بله. می‌توانی یک قوطی سوپ بخری؟ برای ناهار فردا."),
            d("B", "Sure. Any particular kind?", "حتماً. نوع خاصی؟"),
            d("A", "Chicken soup, if they have it.", "سوپ مرغ، اگر داشته باشند."),
            d("B", "OK. I'll be back in an hour. Text me if you think of anything else.", "باشه. یک ساعت دیگر برمی‌گردم. پیام بده اگر چیز دیگری به ذهنت رسید."),
            d("A", "Thanks. You're a lifesaver!", "ممنون. نجات‌دهنده‌ای!"),
            d("B", "Ha! That's what friends are for. See you soon.", "ها! دوست برای همین است. به‌زودی می‌بینمت."),
            d("A", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("How much bread does A need?", listOf("two loaves", "one loaf", "three loaves", "no bread"), 1),
            q("How many eggs does A need?", listOf("six", "ten", "a dozen", "two dozen"), 2),
            q("Does A need rice?", listOf("yes, a lot", "no, they have a lot", "yes, a little", "we don't know"), 1),
            q("What tea does A prefer?", listOf("black tea", "green tea", "herbal tea", "no tea"), 1),
            q("How much chicken does A need?", listOf("one kilo", "half a kilo", "two kilos", "no chicken"), 1),
            q("We need ___ bread.", listOf("a", "some", "any", "much"), 1),
            q("We don't have ___ tea.", listOf("some", "any", "a", "the"), 1),
            q("___ much milk do we need?", listOf("How", "What", "Which", "Whose"), 0),
            q("___ many eggs do we need?", listOf("How", "What", "Which", "Whose"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Take your time", "عجله نکن", "Take your time.", "عجله نکن."),
            IdiomExpression("A bunch of", "یک خوشه / دسته", "A bunch of bananas.", "یک خوشه موز."),
            IdiomExpression("A dozen", "دوجین (۱۲ تا)", "A dozen eggs.", "دوازده تخم‌مرغ."),
            IdiomExpression("Lifesaver", "نجات‌دهنده", "You're a lifesaver!", "نجات‌دهنده‌ای!")
        ),
        pronunciation = listOf(
            PronunciationTip("Containers", "Practice: a bottle /ˈbɒtəl/, a carton /ˈkɑːrtən/, a packet /ˈpækɪt/, a can /kæn/."),
            PronunciationTip("Some/Any reduction", "In natural speech: some /səm/, any /ˈɛni/.")
        ),
        culture = listOf(
            CulturalNote("Shopping lists", "Making a shopping list is common in English-speaking countries."),
            CulturalNote("Measurements", "In the US, people use pounds and ounces. In the UK and most other countries, they use kilos and grams.")
        ),
        mistakes = listOf(
            CommonMistake("I need some breads.", "I need some bread.", "'Bread' is uncountable, so no plural -s."),
            CommonMistake("We don't have some milk.", "We don't have any milk.", "Use 'any' in negative statements."),
            CommonMistake("How many rice do we need?", "How much rice do we need?", "Use 'how much' with uncountable nouns.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does A ask Sarah to buy?", "Bread, milk, eggs, apples, bananas, water, tea, chicken, vegetables, and a can of soup."),
            ComprehensionQuestion("What do they already have at home?", "A lot of rice, plenty of coffee.")
        ),
        speaking = listOf(
            SpeakingTask("Make a shopping list with a partner.", "با یک دوست لیست خرید بساز.", "We need some... / How much...? / How many...?"),
            SpeakingTask("Role-play a shopping conversation.", "نقش‌بازی یک مکالمه خرید.", "Do we have any...? / We need some...")
        ),
        writing = listOf(
            WritingTask("Write a shopping list for a dinner party.", "لیست خرید برای یک مهمانی شام بنویس.", 70, "Use countable and uncountable nouns with quantifiers.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 10 — A city for all seasons | شهری برای همه فصل‌ها  (≈ 115 خط)
    // Grammar: comparatives and superlatives
    // Vocabulary: weather, seasons, places
    // ═══════════════════════════════════════════════════════════
    private fun file10() = base(
        10, "A city for all seasons", "شهری برای همه فصل‌ها",
        listOf(
            "Use comparatives and superlatives",
            "Talk about weather and seasons",
            "Compare places and things",
            "Describe your favorite city"
        ),
        listOf(
            v("season", "فصل", "There are four seasons in a year.", "چهار فصل در سال وجود دارد."),
            v("weather", "هوا", "The weather is beautiful today.", "هوا امروز زیباست."),
            v("sunny", "آفتابی", "It's sunny in summer.", "تابستان آفتابی است.", "adjective"),
            v("rainy", "بارانی", "It's often rainy in April.", "آوریل اغلب بارانی است.", "adjective"),
            v("cold", "سرد", "It's very cold in winter.", "زمستان خیلی سرد است.", "adjective"),
            v("hot", "گرم", "It's hot in summer.", "تابستان گرم است.", "adjective"),
            v("warm", "گرم و دلپذیر", "Spring is warm and pleasant.", "بهار گرم و دلپذیر است.", "adjective"),
            v("better", "بهتر", "This city is better than that one.", "این شهر از آن یکی بهتر است."),
            v("best", "بهترین", "It's the best city in the world.", "بهترین شهر جهان است."),
            v("worse", "بدتر", "The weather is worse in winter.", "هوا در زمستان بدتر است."),
            v("worst", "بدترین", "That was the worst trip of my life.", "بدترین سفر زندگی‌ام بود.")
        ),
        listOf(
            GrammarSection("Comparatives", "Use -er or more + adjective. Add 'than' for comparisons. Bigger than, more interesting than, better than."),
            GrammarSection("Superlatives", "Use -est or most + adjective. Add 'the' before superlatives. The biggest, the most beautiful, the best."),
            GrammarSection("Irregular comparatives and superlatives", "good → better → best, bad → worse → worst, far → farther/further → farthest/furthest.")
        ),
        listOf(
            d("A", "I'm thinking about visiting Vancouver next summer. Have you been?", "دارم فکر می‌کنم تابستان آینده به ونکوور بروم. رفته‌ای؟"),
            d("B", "Yes, I have. It's one of the most beautiful cities in Canada.", "بله. یکی از زیباترین شهرهای کاناداست."),
            d("A", "Really? What's it like?", "واقعاً؟ چطور جایی است؟"),
            d("B", "It's amazing. The mountains are right next to the ocean.", "شگفت‌انگیز است. کوه‌ها دقیقاً کنار اقیانوس هستند."),
            d("A", "That sounds beautiful. Is it expensive?", "زیبا به نظر می‌رسد. گران است؟"),
            d("B", "It's more expensive than other Canadian cities. But it's worth it.", "از شهرهای دیگر کانادا گران‌تر است. ولی ارزشش را دارد."),
            d("A", "What's the weather like?", "هوا چطور است؟"),
            d("B", "It's not as cold as the rest of Canada in winter. It rains a lot, though.", "زمستان آنقدر سرد مثل بقیه کانادا نیست. ولی زیاد باران می‌بارد."),
            d("A", "So it's milder?", "پس ملایم‌تر است؟"),
            d("B", "Yes, much milder. The summers are perfect — warm but not too hot.", "بله، خیلی ملایم‌تر. تابستان‌ها عالی هستند — گرم ولی نه خیلی داغ."),
            d("A", "That sounds great. What's the best time to visit?", "عالی به نظر می‌رسد. بهترین زمان برای بازدید کی است؟"),
            d("B", "Summer, definitely. July and August are the nicest months.", "تابستان، قطعاً. جولای و آگوست قشنگ‌ترین ماه‌ها هستند."),
            d("A", "But isn't it crowded then?", "ولی آن موقع شلوغ نیست؟"),
            d("B", "Yes, it's busier. But the weather is much better.", "بله، شلوغ‌تر است. ولی هوا خیلی بهتر است."),
            d("A", "What about the food? Is it good?", "غذا چطور؟ خوب است؟"),
            d("B", "The seafood is the best in Canada. And there's great Asian food too.", "غذای دریایی بهترین در کاناداست. و غذای آسیایی عالی هم دارد."),
            d("A", "What's the most famous thing to see there?", "معروف‌ترین چیزی که باید آنجا دید چیست؟"),
            d("B", "Stanley Park. It's bigger than Central Park in New York.", "استنلی پارک. از سنترال پارک نیویورک بزرگ‌تر است."),
            d("A", "Really? That's a big park.", "واقعاً؟ پارک بزرگی است."),
            d("B", "Yes, and it has the best views of the city.", "بله، و بهترین منظره‌های شهر را دارد."),
            d("A", "How do you get around the city?", "چطور در شهر رفت‌وآمد می‌کنی؟"),
            d("B", "The public transportation is excellent. Buses, trains, and ferries.", "حمل‌ونقل عمومی عالی است. اتوبوس، قطار، و قایق."),
            d("A", "Ferries? That's interesting.", "قایق؟ جالب است."),
            d("B", "Yes, the SeaBus is a ferry that takes you across the water.", "بله، سی‌باس قایقی است که تو را از روی آب می‌برد."),
            d("A", "That sounds fun. Are the people friendly?", "سرگرم‌کننده به نظر می‌رسد. مردم خوش‌برخورد هستند؟"),
            d("B", "Very. Vancouver is known for being one of the friendliest cities in Canada.", "خیلی. ونکوور به عنوان یکی از خوش‌برخوردترین شهرهای کانادا شناخته می‌شود."),
            d("A", "What about the winter? Is there snow?", "زمستان چطور؟ برف هست؟"),
            d("B", "Sometimes, but not much in the city. You have to go to the mountains for snow.", "گاهی، ولی در شهر زیاد نه. برای برف باید به کوه‌ها بروی."),
            d("A", "Can you ski near Vancouver?", "می‌توانی نزدیک ونکوور اسکی کنی؟"),
            d("B", "Yes! Whistler is about two hours away. It's one of the best ski resorts in the world.", "بله! ویسلر حدود دو ساعت فاصله دارد. یکی از بهترین پیست‌های اسکی جهان است."),
            d("A", "Wow. So you can ski and go to the beach in the same day?", "واو. پس می‌توانی همان روز هم اسکی کنی و هم به ساحل بروی؟"),
            d("B", "Ha! Yes, some people do that. It's a special place.", "ها! بله، بعضی‌ها این کار را می‌کنند. جای خاصی است."),
            d("A", "I'm definitely going to visit. Thanks for all the info.", "قطعاً می‌روم. ممنون برای همه اطلاعات."),
            d("B", "You're welcome. You'll love it. It's truly one of the best cities in the world.", "خواهش می‌کنم. عاشقش می‌شوی. واقعاً یکی از بهترین شهرهای جهان است."),
            d("A", "I'm sure I will. Thanks again!", "مطمئنم. باز هم ممنون!"),
            d("B", "Anytime. Send me photos!", "هر وقت. عکس بفرست!"),
            d("A", "I will. See you soon!", "می‌فرستم. به‌زودی می‌بینمت!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("Where does A want to visit?", listOf("Toronto", "Vancouver", "Montreal", "Ottawa"), 1),
            q("What's the best time to visit?", listOf("spring", "summer", "fall", "winter"), 1),
            q("What is Stanley Park compared to?", listOf("Hyde Park", "Central Park", "Golden Gate Park", "Regent's Park"), 1),
            q("What is Whistler?", listOf("a beach", "a ski resort", "a restaurant", "a museum"), 1),
            q("Vancouver is ___ than Toronto.", listOf("expensive", "more expensive", "most expensive", "expensivest"), 1),
            q("It's the ___ city in Canada.", listOf("beautiful", "more beautiful", "most beautiful", "beautifulest"), 2),
            q("The weather is ___ in summer.", listOf("good", "better", "best", "gooder"), 1),
            q("It's the ___ seafood in Canada.", listOf("good", "better", "best", "gooder"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Get around", "رفت‌وآمد کردن", "How do you get around the city?", "چطور در شهر رفت‌وآمد می‌کنی؟"),
            IdiomExpression("Worth it", "ارزشش را داشتن", "It's worth it.", "ارزشش را دارد."),
            IdiomExpression("One of the best", "یکی از بهترین", "It's one of the best cities.", "یکی از بهترین شهرهاست.")
        ),
        pronunciation = listOf(
            PronunciationTip("Comparative stress", "Stress the comparative: It's MORE exPENsive than Toronto."),
            PronunciationTip("Superlative stress", "Stress the superlative: It's the BEST seafood."),
            PronunciationTip("'Than' reduction", "In natural speech, 'than' is often /ðən/: better than → /ˈbɛtər ðən/.")
        ),
        culture = listOf(
            CulturalNote("Vancouver", "Vancouver is consistently ranked as one of the most livable cities in the world."),
            CulturalNote("Seasons and travel", "The best time to visit a place depends on the weather.")
        ),
        mistakes = listOf(
            CommonMistake("It's more bigger than Toronto.", "It's bigger than Toronto.", "Don't use 'more' with -er comparatives."),
            CommonMistake("It's the most biggest city.", "It's the biggest city.", "Don't use 'most' with -est superlatives."),
            CommonMistake("It's gooder than before.", "It's better than before.", "Use irregular forms: good → better → best.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What makes Vancouver special?", "Mountains next to the ocean, mild weather, Stanley Park, great food, and friendly people."),
            ComprehensionQuestion("What can you do in one day in Vancouver?", "Ski in the mountains and go to the beach.")
        ),
        speaking = listOf(
            SpeakingTask("Compare two cities you know.", "دو شهر که می‌شناسی را مقایسه کن.", "X is bigger than Y. / X is the most beautiful city."),
            SpeakingTask("Talk about the best time to visit your city.", "درباره بهترین زمان برای بازدید از شهرت صحبت کن.", "The best time is... / It's warmer than...")
        ),
        writing = listOf(
            WritingTask("Write a travel guide to your city.", "راهنمای سفر به شهرت بنویس.", 100, "Use comparatives and superlatives.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 11 — What would you do? | چه کار می‌کردی؟  (≈ 115 خط)
    // Grammar: going to; will/won't; would like
    // Vocabulary: future time expressions, plans, decisions
    // ═══════════════════════════════════════════════════════════
    private fun file11() = base(
        11, "What would you do?", "چه کار می‌کردی؟",
        listOf(
            "Use going to for future plans",
            "Use will/won't for predictions and decisions",
            "Use would like for polite offers and desires",
            "Talk about future plans and intentions"
        ),
        listOf(
            v("future", "آینده", "What are your plans for the future?", "برنامه‌هایت برای آینده چیست؟"),
            v("plan", "برنامه", "I have a plan for next summer.", "برای تابستان آینده برنامه دارم."),
            v("hope", "امیدوار بودن", "I hope the weather is good.", "امیدوارم هوا خوب باشد.", "verb"),
            v("think", "فکر کردن", "I think it will rain tomorrow.", "فکر می‌کنم فردا باران می‌آید.", "verb"),
            v("probably", "احتمالاً", "She'll probably come later.", "احتمالاً بعداً می‌آید.", "adverb"),
            v("definitely", "قطعاً", "I'll definitely be there.", "قطعاً آنجا خواهم بود.", "adverb"),
            v("maybe", "شاید", "Maybe I'll go to the party.", "شاید به مهمانی بروم.", "adverb"),
            v("tomorrow", "فردا", "What are you doing tomorrow?", "فردا چه کار می‌کنی؟", "adverb"),
            v("next week", "هفته بعد", "I'm going to Spain next week.", "هفته بعد به اسپانیا می‌روم."),
            v("would like", "دوست داشتن", "I would like a coffee, please.", "لطفاً یک قهوه می‌خواهم.")
        ),
        listOf(
            GrammarSection("Going to for future plans", "Use am/is/are + going to + verb for plans and intentions. I'm going to study tonight."),
            GrammarSection("Will/Won't for predictions and decisions", "Use will + base verb for predictions and spontaneous decisions. I think it'll rain. I'll help you."),
            GrammarSection("Would like", "Use 'would like' (or 'd like) for polite offers and desires. I'd like a coffee. Would you like to come?")
        ),
        listOf(
            d("A", "What are you going to do this weekend?", "این آخر هفته چه کار می‌کنی؟"),
            d("B", "I'm going to visit my parents. What about you?", "می‌خواهم به دیدن والدینم بروم. تو چطور؟"),
            d("A", "I'm not sure yet. Maybe I'll go to the beach.", "هنوز مطمئن نیستم. شاید به ساحل بروم."),
            d("B", "That sounds nice. Is the weather going to be good?", "خوب به نظر می‌رسد. هوا خوب می‌شود؟"),
            d("A", "I think so. The forecast says it'll be sunny.", "فکر می‌کنم بله. پیش‌بینی می‌گوید آفتابی می‌شود."),
            d("B", "Lucky you. I hope it doesn't rain where I'm going.", "چقدر خوش‌شانس. امیدوارم جایی که می‌روم باران نیاید."),
            d("A", "Where are your parents?", "والدینت کجا هستند؟"),
            d("B", "They live about three hours away by car.", "حدود سه ساعت با ماشین فاصله دارند."),
            d("A", "That's a long drive. Are you going to drive?", "رانندگی طولانی است. می‌خواهی رانندگی کنی؟"),
            d("B", "Yes, I'm going to drive. But I'll leave early to avoid traffic.", "بله، رانندگی می‌کنم. ولی زود می‌روم تا از ترافیک پرهیز کنم."),
            d("A", "Good idea. What time are you going to leave?", "فکر خوبی است. چه ساعتی می‌روی؟"),
            d("B", "Around 6 AM. I want to arrive before lunch.", "حدود ۶ صبح. می‌خواهم قبل از ناهار برسم."),
            d("A", "That's early! Are you sure you'll wake up?", "زوده! مطمئنی بیدار می‌شوی؟"),
            d("B", "Ha! I hope so. I'll set three alarms.", "ها! امیدوارم. سه آلارم می‌گذارم."),
            d("A", "Smart. What are you going to do with your parents?", "هوشمندانه. با والدینت چه کار می‌کنی؟"),
            d("B", "We're going to have lunch together, then go for a walk.", "با هم ناهار می‌خوریم، بعد پیاده‌روی می‌رویم."),
            d("A", "That sounds relaxing.", "آرامش‌بخش به نظر می‌رسد."),
            d("B", "Yes. I just want to spend time with them.", "بله. فقط می‌خواهم با آن‌ها وقت بگذرانم."),
            d("A", "That's nice. Are you going to stay overnight?", "خوبه. شب می‌مانی؟"),
            d("B", "No, I'm going to come back the same day. It's a long drive but I prefer my own bed.", "نه، همان روز برمی‌گردم. رانندگی طولانی است ولی تخت خودم را ترجیح می‌دهم."),
            d("A", "I understand. What about Sunday?", "می‌فهمم. یکشنبه چطور؟"),
            d("B", "On Sunday, I'll probably just relax at home.", "یکشنبه احتمالاً فقط در خانه استراحت می‌کنم."),
            d("A", "That sounds like a good plan.", "برنامه خوبی به نظر می‌رسد."),
            d("B", "What about you? Are you going to the beach alone?", "تو چطور؟ تنهایی به ساحل می‌روی؟"),
            d("A", "No, I'll probably go with my friend Sara.", "نه، احتمالاً با دوستم سارا می‌روم."),
            d("B", "That sounds fun. What are you going to do there?", "سرگرم‌کننده به نظر می‌رسد. آنجا چه کار می‌کنید؟"),
            d("A", "We'll swim and have a picnic. Nothing special.", "شنا می‌کنیم و پیک‌نیک می‌کنیم. چیز خاصی نیست."),
            d("B", "That sounds perfect to me.", "برای من عالی به نظر می‌رسد."),
            d("A", "Would you like to come with us?", "می‌خواهی با ما بیایی؟"),
            d("B", "I'd love to, but I can't. I'm visiting my parents, remember?", "خیلی دوست دارم، ولی نمی‌توانم. دارم به دیدن والدینم می‌روم، یادت هست؟"),
            d("A", "Oh, right! Sorry, I forgot.", "اوه، درست! ببخشید، فراموش کردم."),
            d("B", "Ha! That's OK. Maybe next weekend?", "ها! اشکالی ندارد. شاید آخر هفته بعد؟"),
            d("A", "Yes, let's plan it. I'll text you.", "بله، بیایید برنامه‌ریزی کنیم. پیام می‌فرستم."),
            d("B", "Sounds good. Well, I should go. I need to pack.", "خوبه. خب، باید بروم. باید چمدان ببندم."),
            d("A", "OK. Have a great weekend! Say hi to your parents.", "باشه. آخر هفته عالی داشته باش! به والدینت سلام برسان."),
            d("B", "I will. You too. Enjoy the beach!", "می‌رسانم. تو هم. از ساحل لذت ببر!"),
            d("A", "Thanks! See you next week.", "ممنون! هفته بعد می‌بینمت."),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What is B going to do this weekend?", listOf("go to the beach", "visit parents", "stay home", "travel abroad"), 1),
            q("What time is B going to leave?", listOf("5 AM", "6 AM", "7 AM", "8 AM"), 1),
            q("What is A going to do?", listOf("visit parents", "go to the beach with Sara", "stay home", "work"), 1),
            q("What will A and Sara do at the beach?", listOf("swim and have a picnic", "read books", "play volleyball", "sleep"), 0),
            q("I ___ study tonight.", listOf("am going to", "go to", "going to", "am go to"), 0),
            q("I think it ___ rain tomorrow.", listOf("will", "going to", "is going to", "would"), 0),
            q("___ you like to come?", listOf("Would", "Will", "Do", "Are"), 0),
            q("I ___ help you.", listOf("will", "would", "am", "going to"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Lucky you", "چقدر خوش‌شانس", "Lucky you!", "چقدر خوش‌شانس!"),
            IdiomExpression("Spend time with", "وقت گذراندن با", "I want to spend time with them.", "می‌خواهم با آن‌ها وقت بگذرانم."),
            IdiomExpression("Say hi to", "سلام رساندن به", "Say hi to your parents.", "به والدینت سلام برسان.")
        ),
        pronunciation = listOf(
            PronunciationTip("Going to reduction", "In natural speech, 'going to' is often reduced to 'gonna': I'm gonna visit."),
            PronunciationTip("Will contraction", "Practice: I'll /aɪl/, she'll /ʃiːl/, they'll /ðeɪl/.")
        ),
        culture = listOf(
            CulturalNote("Weekend culture", "In many English-speaking countries, weekends are for family, friends, and relaxation."),
            CulturalNote("Future plans", "Asking 'What are you going to do?' is a common way to show interest in someone's plans.")
        ),
        mistakes = listOf(
            CommonMistake("I going to study.", "I'm going to study.", "Use 'am/is/are' before 'going to'."),
            CommonMistake("I will to help.", "I will help.", "After 'will', use the base verb without 'to'."),
            CommonMistake("I would like going to the beach.", "I would like to go to the beach.", "Use 'to + verb' after 'would like'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are A and B's plans for the weekend?", "B is going to visit parents; A might go to the beach with Sara."),
            ComprehensionQuestion("Why can't B join A at the beach?", "B is visiting parents that day.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your plans for next weekend.", "درباره برنامه‌هایت برای آخر هفته بعد صحبت کن.", "I'm going to... / I'll probably... / I might..."),
            SpeakingTask("Make plans with a partner.", "با یک دوست برنامه بگذار.", "Would you like to...? / Are you going to...? / Let's...")
        ),
        writing = listOf(
            WritingTask("Write about your plans for next month.", "درباره برنامه‌هایت برای ماه آینده بنویس.", 90, "Use going to and will.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // FILE 12 — Sporting superstitions | خرافات ورزشی  (≈ 115 خط)
    // Grammar: present perfect with ever/never; past participles
    // Vocabulary: sports, experiences, past participles
    // ═══════════════════════════════════════════════════════════
    private fun file12() = base(
        12, "Sporting superstitions", "خرافات ورزشی",
        listOf(
            "Use present perfect with ever and never",
            "Talk about experiences in life",
            "Use common past participles",
            "Ask and answer questions about experiences"
        ),
        listOf(
            v("experience", "تجربه", "It was a great experience.", "تجربه عالی‌ای بود."),
            v("ever", "هرگز (در سؤال)", "Have you ever been to Japan?", "تا حالا به ژاپن رفته‌ای؟", "adverb"),
            v("never", "هرگز", "I've never seen a live concert.", "هرگز کنسرت زنده ندیده‌ام.", "adverb"),
            v("already", "قبلاً", "I've already finished.", "قبلاً تمام کرده‌ام.", "adverb"),
            v("yet", "هنوز", "I haven't finished yet.", "هنوز تمام نکرده‌ام.", "adverb"),
            v("superstition", "خرافات", "Many athletes have superstitions.", "بسیاری از ورزشکاران خرافات دارند."),
            v("lucky", "خوش‌شانس", "That shirt is my lucky shirt.", "آن پیراهن، پیراهن خوش‌شانس من است.", "adjective"),
            v("unlucky", "بدشانس", "Thirteen is often considered unlucky.", "سیزده اغلب بدشانس در نظر گرفته می‌شود.", "adjective"),
            v("tradition", "سنت", "It's an old tradition in sports.", "سنت قدیمی در ورزش است."),
            v("competition", "رقابت", "The competition is next week.", "رقابت هفته بعد است.")
        ),
        listOf(
            GrammarSection("Present perfect with ever/never", "Use have/has + past participle. Use 'ever' in questions and 'never' in negative statements. Have you ever been to Japan? I've never been there."),
            GrammarSection("Present perfect with already/yet", "Use 'already' in positive statements (I've already finished). Use 'yet' in negatives and questions."),
            GrammarSection("Common past participles", "be → been, go → gone/been, see → seen, do → done, eat → eaten, write → written, take → taken, give → given.")
        ),
        listOf(
            d("A", "Do you play any sports?", "ورزشی بازی می‌کنی؟"),
            d("B", "Yes, I play tennis. Have you ever played tennis?", "بله، تنیس بازی می‌کنم. تا حالا تنیس بازی کرده‌ای؟"),
            d("A", "No, I haven't. But I've watched it on TV.", "نه، نکرده‌ام. ولی در تلویزیون دیده‌ام."),
            d("B", "It's a great sport. Do you have any superstitions when you play?", "ورزش عالی‌ای است. وقتی بازی می‌کنی خرافاتی داری؟"),
            d("A", "Superstitions? What do you mean?", "خرافات؟ منظورت چیست؟"),
            d("B", "You know, like wearing a lucky shirt or using a special racket.", "می‌دانی، مثل پوشیدن پیراهن خوش‌شانس یا استفاده از راکت خاص."),
            d("A", "Oh, I see. Do you have any?", "اوه، می‌فهمم. تو داری؟"),
            d("B", "Yes, I do. I always wear the same socks when I play.", "بله. همیشه همان جوراب‌ها را می‌پوشم وقتی بازی می‌کنم."),
            d("A", "Really? The same socks?", "واقعاً؟ همان جوراب‌ها؟"),
            d("B", "Yes! They're my lucky socks. I've never lost a match when I wear them.", "بله! جوراب‌های خوش‌شانس من هستند. هرگز مسابقه‌ای که با آن‌ها بازی کردم نباختم."),
            d("A", "Wow. Have you ever washed them?", "واو. تا حالا شسته‌ای‌شان؟"),
            d("B", "Ha! Of course. But I wash them before every match.", "ها! البته. ولی قبل از هر مسابقه می‌شویم‌شان."),
            d("A", "That's funny. Do other athletes have superstitions?", "خنده‌دار است. ورزشکاران دیگر هم خرافات دارند؟"),
            d("B", "Oh yes. Many athletes do. It's very common.", "اوه بله. بسیاری از ورزشکاران. خیلی رایج است."),
            d("A", "Like what?", "مثل چی؟"),
            d("B", "Some eat the same food before every game. Some listen to the same song.", "برخی قبل از هر بازی همان غذا را می‌خورند. برخی همان آهنگ را گوش می‌دهند."),
            d("A", "Have you ever heard of a really strange one?", "تا حالا خرافات واقعاً عجیبی شنیده‌ای؟"),
            d("B", "Yes. There's a soccer player who always puts his right shoe on first.", "بله. یک بازیکن فوتبال هست که همیشه اول کفش راستش را می‌پوشد."),
            d("A", "That's not too strange. I've heard stranger things.", "آنقدر هم عجیب نیست. چیزهای عجیب‌تری شنیده‌ام."),
            d("B", "Really? Like what?", "واقعاً؟ مثل چی؟"),
            d("A", "I've heard of a tennis player who always bounces the ball exactly seven times before serving.", "شنیده‌ام یک تنیسور همیشه دقیقاً هفت بار توپ را قبل از سرو پرتاب می‌کند."),
            d("B", "Seven times? That's very specific.", "هفت بار؟ خیلی خاص است."),
            d("A", "I know. But it works for him.", "می‌دانم. ولی برایش کار می‌کند."),
            d("B", "Where do superstitions come from?", "خرافات از کجا می‌آیند؟"),
            d("A", "I think they help athletes feel more in control.", "فکر می‌کنم به ورزشکاران کمک می‌کنند کنترل بیشتری حس کنند."),
            d("B", "That makes sense. When you're nervous, small routines help.", "منطقی است. وقتی مضطربی، روتین‌های کوچک کمک می‌کنند."),
            d("A", "Exactly. Have you ever been really nervous before a match?", "دقیقاً. تا حالا قبل از مسابقه واقعاً مضطرب بوده‌ای؟"),
            d("B", "Yes, many times. My hands shake and I can't eat.", "بله، بارها. دست‌هایم می‌لرزند و نمی‌توانم غذا بخورم."),
            d("A", "What do you do to calm down?", "برای آرام شدن چه کار می‌کنی؟"),
            d("B", "I take deep breaths and think about my family. It helps.", "نفس عمیق می‌کشم و به خانواده‌ام فکر می‌کنم. کمک می‌کند."),
            d("A", "That's a good technique.", "تکنیک خوبی است."),
            d("B", "Have you ever played in a competition?", "تا حالا در مسابقه‌ای بازی کرده‌ای؟"),
            d("A", "I have, actually. I played chess when I was younger.", "در واقع، بله. شطرنج بازی می‌کردم وقتی جوان‌تر بودم."),
            d("B", "Chess! That's interesting. Did you win?", "شطرنج! جالب است. بردی؟"),
            d("A", "Sometimes. I've never won a tournament, though.", "گاهی. ولی هرگز تورنمنتی نبرده‌ام."),
            d("B", "That's OK. It's about the experience.", "اشکالی ندارد. درباره تجربه است."),
            d("A", "You're right. Have you ever won a tennis tournament?", "حق داری. تا حالا تورنمنت تنیس برده‌ای؟"),
            d("B", "Yes, I have. I won one last year. My lucky socks helped!", "بله. سال گذشته یکی بردم. جوراب‌های خوش‌شانسم کمک کردند!"),
            d("A", "Ha! Maybe I should get some lucky socks too.", "ها! شاید من هم باید چند جوراب خوش‌شانس بگیرم."),
            d("B", "Ha! Maybe. Do you want to play tennis together sometime?", "ها! شاید. می‌خواهی یک وقت با هم تنیس بازی کنیم؟"),
            d("A", "I'd love to. But you have to teach me. I've never played before.", "خیلی دوست دارم. ولی باید یادم بدهی. هرگز بازی نکرده‌ام."),
            d("B", "Don't worry. It's not difficult. I'll teach you the basics.", "نگران نباش. سخت نیست. اصول پایه را یادت می‌دهم."),
            d("A", "Thanks. That sounds like fun.", "ممنون. سرگرم‌کننده به نظر می‌رسد."),
            d("B", "Great. Let's meet on Saturday.", "عالی. بیایید شنبه همدیگر را ببینیم."),
            d("A", "Perfect. See you then!", "عالی. تا اون موقع!"),
            d("B", "See you!", "می‌بینمت!")
        ),
        listOf(
            q("What sport does B play?", listOf("soccer", "tennis", "basketball", "chess"), 1),
            q("What is B's superstition?", listOf("wears a lucky hat", "wears lucky socks", "listens to a specific song", "eats the same food"), 1),
            q("What superstition did A mention?", listOf("bouncing the ball seven times", "wearing a red shirt", "talking to the ball", "eating a banana"), 0),
            q("Has B won a tennis tournament?", listOf("never", "yes, last year", "yes, many times", "we don't know"), 1),
            q("___ you ever been to Japan?", listOf("Have", "Has", "Do", "Did"), 0),
            q("I've ___ seen a live concert.", listOf("ever", "never", "already", "yet"), 1),
            q("I haven't finished ___.", listOf("ever", "never", "already", "yet"), 3),
            q("She has ___ finished her homework.", listOf("ever", "never", "already", "yet"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Calm down", "آرام شدن", "What do you do to calm down?", "برای آرام شدن چه کار می‌کنی؟"),
            IdiomExpression("In control", "در کنترل", "It helps them feel more in control.", "به آن‌ها کمک می‌کند کنترل بیشتری حس کنند."),
            IdiomExpression("Make sense", "منطقی بودن", "That makes sense.", "منطقی است.")
        ),
        pronunciation = listOf(
            PronunciationTip("Present perfect stress", "Stress the past participle: I've NEVER BEEN there."),
            PronunciationTip("Contractions", "Practice: I've /aɪv/, you've /juːv/, she's /ʃiːz/, we've /wiːv/.")
        ),
        culture = listOf(
            CulturalNote("Sports superstitions", "Superstitions are common in sports. Athletes often have lucky items, pre-game rituals, or specific routines."),
            CulturalNote("Chess and tennis", "Chess is a strategic board game; tennis is a racket sport. Both require focus and mental strength.")
        ),
        mistakes = listOf(
            CommonMistake("I have went to Japan.", "I have been to Japan.", "Use past participle 'been', not 'went'."),
            CommonMistake("Have you ever went to Japan?", "Have you ever been to Japan?", "Use past participle with 'have'."),
            CommonMistake("I haven't finished already.", "I haven't finished yet.", "Use 'yet' in negative statements.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What is B's superstition?", "B wears lucky socks when playing tennis."),
            ComprehensionQuestion("Why do athletes have superstitions?", "They help athletes feel more in control when they're nervous.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a sport you play or watch.", "درباره ورزشی که بازی می‌کنی یا تماشا می‌کنی صحبت کن.", "I play... / I've played... / I've never..."),
            SpeakingTask("Ask a partner about their experiences.", "از یک دوست درباره تجربیاتش بپرس.", "Have you ever...? / I've never... / I've already...")
        ),
        writing = listOf(
            WritingTask("Write about your experiences with sports or hobbies.", "درباره تجربیاتت با ورزش یا سرگرمی‌ها بنویس.", 100, "Use present perfect with ever, never, already, yet.")
        )
    )
}