package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Top Notch Fundamentals — Complete Course Content
 * 14 Lessons | Beginner (A1)
 * Original educational content (no copyrighted material reproduced)
 */
object TopNotchFundamentals {
    const val BOOK_ID = "top_notch_fundamentals"

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
        11 -> lesson11()
        12 -> lesson12()
        13 -> lesson13()
        14 -> lesson14()
        else -> LessonContent(
            BOOK_ID, chapterNumber, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList()
        )
    }

    // ═══════════════════════════════════════════════════════════
    // BASE BUILDER & HELPERS
    // ═══════════════════════════════════════════════════════════

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
    // LESSON 1 — Names and Occupations | نام‌ها و شغل‌ها
    // ═══════════════════════════════════════════════════════════
    private fun lesson1() = base(
        1, "Names and Occupations", "نام‌ها و شغل‌ها",
        listOf(
            "Introduce yourself and others naturally",
            "Ask and answer questions about occupations",
            "Use a/an with occupations correctly",
            "Master the verb 'be' in singular and plural statements",
            "Use 'What do you do?' as an opening question",
            "Describe where people work",
            "Talk about different workplaces"
        ),
        listOf(
            v("teacher", "معلم", "My mother is a teacher.", "مادرم معلم است."),
            v("student", "دانش‌آموز / دانشجو", "I'm a student at this school.", "من در این مدرسه دانش‌آموز هستم."),
            v("architect", "معمار", "He's an architect from Italy.", "او معمار اهل ایتالیا است."),
            v("actor", "بازیگر", "She's a famous actor.", "او بازیگر معروفی است."),
            v("athlete", "ورزشکار", "My cousin is a professional athlete.", "پسرخاله‌ام ورزشکار حرفه‌ای است."),
            v("musician", "موسیقی‌دان", "The musician plays the piano.", "موسیقی‌دان پیانو می‌نوازد."),
            v("artist", "هنرمند", "She's an artist from Paris.", "او هنرمندی از پاریس است."),
            v("banker", "بانکدار", "He works as a banker downtown.", "او در مرکز شهر به عنوان بانکدار کار می‌کند."),
            v("singer", "خواننده", "The singer has a beautiful voice.", "خواننده صدای زیبایی دارد."),
            v("flight attendant", "مهماندار پرواز", "She's a flight attendant for an international airline.", "او مهماندار پرواز یک هواپیمایی بین‌المللی است."),
            v("dentist", "دندان‌پزشک", "I go to the dentist twice a year.", "سالی دو بار به دندان‌پزشک می‌روم."),
            v("lawyer", "وکیل", "My uncle is a lawyer.", "عمویم وکیل است."),
            v("waiter", "پیشخدمت", "The waiter brought us the menu.", "پیشخدمت منو را آورد."),
            v("chef", "سرآشپز", "The chef makes amazing pasta.", "سرآشپز پاستای عالی درست می‌کند."),
            v("nurse", "پرستار", "The nurse is very kind.", "پرستار خیلی مهربان است."),
            v("pilot", "خلبان", "Her father is a pilot.", "پدرش خلبان است."),
            v("engineer", "مهندس", "He's an engineer at a tech company.", "او مهندس یک شرکت فناوری است."),
            v("scientist", "دانشمند", "The scientist works in a lab.", "دانشمند در آزمایشگاه کار می‌کند."),
            v("occupation", "شغل", "What's your occupation?", "شغلت چیست؟"),
            v("introduce", "معرفی کردن", "Let me introduce my friend.", "بگذار دوستم را معرفی کنم.", "verb"),
            v("first name", "نام کوچک", "My first name is Sara.", "نام کوچک من سارا است."),
            v("last name", "نام خانوادگی", "Her last name is Smith.", "نام خانوادگی‌اش اسمیت است."),
            v("downtown", "مرکز شهر", "She works downtown.", "او در مرکز شهر کار می‌کند.", "adverb")
        ),
        listOf(
            GrammarSection(
                "Be: singular and plural statements",
                "Use am, is, and are to identify people. I am a teacher. He is a student. They are doctors."
            ),
            GrammarSection(
                "A / An with occupations",
                "Use 'a' before consonant sounds and 'an' before vowel sounds. He's a banker. She's an artist. He's an athlete."
            ),
            GrammarSection(
                "Contractions with be",
                "I'm, you're, he's, she's, it's, we're, they're are standard in spoken English."
            ),
            GrammarSection(
                "Information questions with be",
                "What's your name? What's your occupation? Where are you from? Who is she?"
            ),
            GrammarSection(
                "Where do you work?",
                "Use 'Where do you work?' to ask about workplace. I work at a hospital. I work in an office. I work from home."
            )
        ),
        listOf(
            d("A", "Hi, I'm Daniel. What's your name?", "سلام، من دنیل هستم. اسمت چیست؟"),
            d("B", "I'm Emma. Nice to meet you.", "من اِما هستم. از آشنایی با تو خوشحالم."),
            d("A", "Nice to meet you, too. Where are you from?", "من هم خوشحالم. اهل کجایی؟"),
            d("B", "I'm from Toronto, Canada. And you?", "من اهل تورنتو، کانادا هستم. و تو؟"),
            d("A", "I'm from Sydney, Australia.", "من اهل سیدنی، استرالیا هستم."),
            d("B", "That's interesting. What do you do?", "جالب است. شغلت چیست؟"),
            d("A", "I'm an architect. I design buildings. And you?", "من معمار هستم. ساختمان طراحی می‌کنم. و تو؟"),
            d("B", "I'm a teacher. I teach English at a language school.", "من معلم هستم. در یک آموزشگاه زبان انگلیسی درس می‌دهم."),
            d("A", "That's a great job. Is it a big school?", "شغل خوبی است. مدرسه بزرگی است؟"),
            d("B", "Yes, it is. We have students from many countries.", "بله. دانش‌آموزانی از کشورهای زیادی داریم."),
            d("A", "How interesting! Do you enjoy it?", "چقدر جالب! از کارت لذت می‌بری؟"),
            d("B", "I love it. My students are wonderful.", "عاشقش هستم. دانش‌آموزانم فوق‌العاده‌اند."),
            d("A", "That sounds nice. And you work downtown?", "خوبه. در مرکز شهر کار می‌کنی؟"),
            d("B", "Yes, near the main station. What about you?", "بله، نزدیک ایستگاه اصلی. تو چطور؟"),
            d("A", "I work from home. I have a small studio.", "من از خانه کار می‌کنم. یک استودیوی کوچک دارم."),
            d("B", "Really? That's convenient.", "واقعاً؟ این راحت است."),
            d("A", "Yes, but sometimes it's lonely. I miss talking to people.", "بله، ولی گاهی تنهاست. دلم برای صحبت با مردم تنگ می‌شود."),
            d("B", "I understand. Well, it was nice meeting you, Daniel.", "می‌فهمم. خب، از آشنایی با تو خوشحال شدم، دنیل."),
            d("A", "Nice meeting you, too, Emma. Have a good day.", "من هم خوشحال شدم، اِما. روز خوبی داشته باشی."),
            d("B", "You too. See you around.", "تو هم. می‌بینمت.")
        ),
        listOf(
            q("What is Emma's job?", listOf("architect", "teacher", "banker", "artist"), 1),
            q("Where is Daniel from?", listOf("Canada", "Australia", "England", "America"), 1),
            q("Where does Emma work?", listOf("at home", "at a language school", "in a bank", "in a hospital"), 1),
            q("Choose the correct sentence.", listOf("I'm teacher.", "I'm a teacher.", "I teacher.", "I'm an teacher."), 1),
            q("Choose: She's ___ architect.", listOf("a", "an", "the", "am"), 1),
            q("What's the contraction for 'she is'?", listOf("she're", "she's", "she'am", "she'll"), 1),
            q("Where does Daniel work?", listOf("at home", "at school", "in a bank", "in an office"), 0),
            q("Which question asks about occupation?", listOf("Where are you from?", "What's your name?", "What do you do?", "How are you?"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Nice to meet you", "از آشنایی با شما خوشحالم", "Nice to meet you, Emma.", "اِما، از آشنایی با تو خوشحالم."),
            IdiomExpression("And you?", "و تو؟", "I'm from Canada. And you?", "من اهل کانادا هستم. و تو؟"),
            IdiomExpression("See you around", "می‌بینمت", "See you around, Emma.", "اِما، می‌بینمت."),
            IdiomExpression("Have a good day", "روز خوبی داشته باشی", "Have a good day, Emma.", "اِما، روز خوبی داشته باشی."),
            IdiomExpression("What's up?", "چه خبر؟", "Hey, what's up?", "هی، چه خبر؟"),
            IdiomExpression("Long time no see", "خیلی وقته ندیدمت", "Long time no see!", "خیلی وقته ندیدمت!"),
            IdiomExpression("Take it easy", "سخت نگیر / خداحافظ", "See you later. Take it easy.", "بعداً می‌بینمت. سخت نگیر."),
            IdiomExpression("How's it going?", "اوضاع چطوره؟", "Hey, how's it going?", "هی، اوضاع چطوره؟")
        ),
        phrasal = listOf(
            PhrasalVerb("work from", "از ... کار کردن", "work from a location",
                "I work from home.", "من از خانه کار می‌کنم.", "No"),
            PhrasalVerb("run into", "به کسی برخوردن", "meet by chance",
                "I ran into my old teacher yesterday.", "دیروز به معلم قدیمی‌ام برخوردم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("A / An", "Focus on the sound, not only the spelling: a banker, an architect, an athlete."),
            PronunciationTip("Question intonation", "Information questions usually end with falling intonation: What's your name? ↘"),
            PronunciationTip("Stress in occupations", "Stress the first syllable: DENtist, LAWyer, PIlot, NURSE."),
            PronunciationTip("Contractions", "I'm /aɪm/, he's /hiːz/, she's /ʃiːz/, they're /ðer/.")
        ),
        culture = listOf(
            CulturalNote("Asking about work",
                "'What do you do?' is one of the most common polite questions when meeting someone new in English-speaking countries."),
            CulturalNote("Titles",
                "Mr. is for men, Mrs. for married women, Miss for unmarried women, and Ms. for any woman. 'Ms.' is the safest choice when unsure."),
            CulturalNote("Workplaces",
                "In English, we say 'work at' + place (a hospital, a school) and 'work in' + field (banking, education). We also 'work from home'.")
        ),
        mistakes = listOf(
            CommonMistake("I'm teacher.", "I'm a teacher.", "Singular occupations normally need a/an."),
            CommonMistake("I'm a architect.", "I'm an architect.", "Architect starts with a vowel sound."),
            CommonMistake("I work in home.", "I work from home.", "Use 'from home', not 'in home'."),
            CommonMistake("What's your job?", "What do you do?", "Both are correct, but 'What do you do?' is more natural in casual conversation.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does Emma do?", "She is a teacher."),
            ComprehensionQuestion("Where does Daniel work and why is it sometimes difficult?", "He works from home. It can feel lonely."),
            ComprehensionQuestion("Why does Emma enjoy her job?", "Because her students are wonderful.")
        ),
        speaking = listOf(
            SpeakingTask("Introduce yourself to a partner.",
                "خودت را به یک دوست معرفی کن.",
                "I'm... / I'm from... / I'm a/an... / I work..."),
            SpeakingTask("Ask three people about their jobs.",
                "از سه نفر درباره شغلشان بپرس.",
                "What do you do? / Where do you work? / Do you enjoy it?"),
            SpeakingTask("Role-play a first meeting at a party.",
                "نقش‌بازی: اولین ملاقات در یک مهمانی.",
                "Hi, I'm... / What do you do? / Where are you from?")
        ),
        writing = listOf(
            WritingTask("Write a short self-introduction.",
                "یک معرفی کوتاه از خودت بنویس.",
                80, "Include name, nationality, occupation, and one extra detail.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 2 — About People | درباره افراد
    // ═══════════════════════════════════════════════════════════
    private fun lesson2() = base(
        2, "About People", "درباره افراد",
        listOf(
            "Identify people using possessive adjectives",
            "Ask and answer simple personal questions",
            "Describe nationality and origin",
            "Use descriptive adjectives for personality"
        ),
        listOf(
            v("friend", "دوست", "Mina is my best friend.", "مینا بهترین دوست من است."),
            v("classmate", "همکلاسی", "Ali is my classmate.", "علی همکلاسی من است."),
            v("neighbor", "همسایه", "Our neighbor is very friendly.", "همسایه‌مان خیلی خوش‌برخورد است."),
            v("first name", "نام کوچک", "My first name is Leo.", "نام کوچک من لئو است."),
            v("last name", "نام خانوادگی", "Her last name is Demir.", "نام خانوادگی‌اش دمیر است."),
            v("nationality", "ملیت", "What's your nationality?", "ملیتت چیست؟"),
            v("country", "کشور", "Which country are you from?", "اهل کدام کشور هستی؟"),
            v("city", "شهر", "I live in Baku.", "من در باکو زندگی می‌کنم."),
            v("friendly", "خوش‌برخورد", "She is very friendly.", "او خیلی خوش‌برخورد است.", "adjective"),
            v("shy", "خجالتی", "He's a bit shy.", "او کمی خجالتی است.", "adjective"),
            v("funny", "بامزه", "My cousin is very funny.", "پسرخاله‌ام خیلی بامزه است.", "adjective"),
            v("quiet", "ساکت", "Their new neighbor is quiet.", "همسایه جدیدشان ساکت است.", "adjective"),
            v("tall", "قدبلند", "Her brother is tall.", "برادرش قدبلند است.", "adjective"),
            v("married", "متأهل", "She's married and has two children.", "او متأهل است و دو بچه دارد.", "adjective"),
            v("single", "مجرد", "He's still single.", "او هنوز مجرد است.", "adjective")
        ),
        listOf(
            GrammarSection("Possessive adjectives",
                "Use my, your, his, her, our, their before nouns: my friend, her name, our teacher."),
            GrammarSection("Yes/No questions with be",
                "Is he your brother? Are they from Spain? Is she married?"),
            GrammarSection("Wh- questions with be",
                "What's her name? Where is he from? Who is she?"),
            GrammarSection("Adjective placement",
                "Adjectives come before nouns or after be: a friendly person / She is friendly.")
        ),
        listOf(
            d("A", "Who's that woman over there?", "آن خانمی که آنجاست کیست؟"),
            d("B", "That's my classmate, Lina.", "او همکلاسی من، لینا است."),
            d("A", "Is she from Turkey?", "اهل ترکیه است؟"),
            d("B", "Yes, she is. She's from Istanbul.", "بله. اهل استانبول است."),
            d("A", "What's her last name?", "نام خانوادگی‌اش چیست؟"),
            d("B", "Her last name is Demir.", "نام خانوادگی‌اش دمیر است."),
            d("A", "Is she friendly?", "خوش‌برخورد است؟"),
            d("B", "Yes, she's very friendly and funny, too.", "بله، خیلی خوش‌برخورد و بامزه است."),
            d("A", "Is she married?", "متأهل است؟"),
            d("B", "No, she's single. She lives near the university.", "نه، مجرد است. نزدیک دانشگاه زندگی می‌کند."),
            d("A", "Does she speak English well?", "خوب انگلیسی صحبت می‌کند؟"),
            d("B", "Yes, she does. Her English is excellent.", "بله. انگلیسی‌اش عالی است."),
            d("A", "And what about your other friends?", "و دوستان دیگرت چطور؟"),
            d("B", "My friend Sara is from Spain. She's quiet but very kind.", "دوست من سارا اهل اسپانیا است. ساکت است ولی خیلی مهربان."),
            d("A", "You have a lot of international friends!", "دوستای بین‌المللی زیادی داری!"),
            d("B", "Yes, I do. I like learning about different cultures.", "بله. دوست دارم درباره فرهنگ‌های مختلف یاد بگیرم."),
            d("A", "That's great. Can you introduce me to Lina?", "عالیه. می‌توانی مرا به لینا معرفی کنی؟"),
            d("B", "Of course. Let's go talk to her.", "حتماً. بیا برویم با او صحبت کنیم."),
            d("A", "Thanks. I'd like that.", "ممنون. خوشحال می‌شوم."),
            d("B", "She's over there, near the window.", "او آنجاست، نزدیک پنجره."),
            d("A", "Perfect. Let's go.", "عالی. برویم.")
        ),
        listOf(
            q("Where is Lina from?", listOf("Turkey", "Spain", "Iran", "Italy"), 0),
            q("What is Lina's last name?", listOf("Sara", "Demir", "Smith", "Brown"), 1),
            q("Is Lina married?", listOf("Yes, she is.", "No, she's single.", "We don't know.", "She is engaged."), 1),
            q("___ name is Tom.", listOf("My", "I", "Me", "Mine"), 0),
            q("Where ___ she from?", listOf("am", "is", "are", "be"), 1),
            q("Possessive adjective for 'he':", listOf("her", "his", "your", "my"), 1),
            q("Sara is ___", listOf("loud and rude", "quiet but kind", "married with kids", "from Turkey"), 1),
            q("What does 'friendly' mean?", listOf("خجالتی", "خوش‌برخورد", "ساکت", "بامزه"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Over there", "آنجا", "Who's that woman over there?", "آن خانمی که آنجاست کیست؟"),
            IdiomExpression("A lot of", "زیادی", "You have a lot of international friends!", "دوستای بین‌المللی زیادی داری!"),
            IdiomExpression("Of course", "حتماً", "Can you introduce me? Of course.", "می‌توانی معرفی کنی؟ حتماً.")
        ),
        phrasal = listOf(
            PhrasalVerb("talk to", "صحبت کردن با", "speak with someone",
                "Let's go talk to her.", "بیا برویم با او صحبت کنیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("His / Her", "Keep the final sounds clear: his /hɪz/, her /hɜr/."),
            PronunciationTip("Wh- questions", "Stress the information word: WHO's that woman?")
        ),
        culture = listOf(
            CulturalNote("Names in English",
                "In English-speaking countries, the first name is your given name and the last name is your family name."),
            CulturalNote("Asking about marital status",
                "Questions about marital status are common in friendly conversation but may be sensitive in formal situations.")
        ),
        mistakes = listOf(
            CommonMistake("Her name is Lina? Yes, he is.", "Her name is Lina? Yes, she is.", "Use 'she' for a female person."),
            CommonMistake("He name is Leo.", "His name is Leo.", "Use 'his' for male possession.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where is Lina from?", "She is from Istanbul, Turkey."),
            ComprehensionQuestion("How does B describe Sara?", "Quiet but very kind, and from Spain.")
        ),
        speaking = listOf(
            SpeakingTask("Introduce a classmate or friend.",
                "یک همکلاسی یا دوست را معرفی کن.",
                "This is... / His name is... / Her name is... / He/She is from..."),
            SpeakingTask("Ask three questions about a partner's friend.",
                "سه سؤال درباره دوست یک همکلاسی بپرس.",
                "Where is he/she from? / Is he/she married? / What does he/she do?")
        ),
        writing = listOf(
            WritingTask("Describe a friend in 80-100 words.",
                "یک دوست را در ۸۰ تا ۱۰۰ کلمه توصیف کن.",
                100, "Include name, city, nationality, and two personal details.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 3 — Places and How to Get There | مکان‌ها و مسیر
    // ═══════════════════════════════════════════════════════════
    private fun lesson3() = base(
        3, "Places and How to Get There", "مکان‌ها و مسیر رسیدن به آن‌ها",
        listOf(
            "Ask for and give simple directions",
            "Name common places in a city",
            "Use there is / there are for locations",
            "Use prepositions of place accurately",
            "Talk about transportation options"
        ),
        listOf(
            v("bank", "بانک", "The bank is near the hotel.", "بانک نزدیک هتل است."),
            v("school", "مدرسه", "The school is on King Street.", "مدرسه در خیابان کینگ است."),
            v("station", "ایستگاه", "The station is downtown.", "ایستگاه در مرکز شهر است."),
            v("hotel", "هتل", "The hotel is near the station.", "هتل نزدیک ایستگاه است."),
            v("museum", "موزه", "The museum is across from the park.", "موزه روبه‌روی پارک است."),
            v("park", "پارک", "The park is next to the museum.", "پارک کنار موزه است."),
            v("street", "خیابان", "This street is busy.", "این خیابان شلوغ است."),
            v("near", "نزدیک", "The café is near here.", "کافه نزدیک اینجاست.", "preposition"),
            v("far", "دور", "The airport is far from here.", "فرودگاه از اینجا دور است.", "adjective"),
            v("bus", "اتوبوس", "I take the bus to work.", "با اتوبوس به سر کار می‌روم."),
            v("subway", "مترو", "The subway is faster than the bus.", "مترو از اتوبوس سریع‌تر است."),
            v("taxi", "تاکسی", "Let's take a taxi.", "بیا تاکسی بگیریم."),
            v("corner", "گوشه / سر خیابان", "Turn left at the corner.", "سر خیابان به چپ بپیچید."),
            v("traffic light", "چراغ راهنما", "Stop at the traffic light.", "پشت چراغ راهنما بایست."),
            v("block", "بلوک / کوچه", "Go two blocks and turn right.", "دو بلوک برو و به راست بپیچ.")
        ),
        listOf(
            GrammarSection("There is / There are",
                "Use 'there is' for singular things and 'there are' for plural things: There is a bank. There are two cafés."),
            GrammarSection("Prepositions of place",
                "Use near, next to, across from, between, on, and at to describe locations."),
            GrammarSection("Imperatives for directions",
                "Go straight. Turn left. Turn right. Stop at the corner. Walk one block."),
            GrammarSection("Questions about location",
                "Where is the museum? Is there a bank near here? How do I get to the station?")
        ),
        listOf(
            d("A", "Excuse me. Where's the museum?", "ببخشید. موزه کجاست؟"),
            d("B", "It's near the park. Do you know where the park is?", "نزدیک پارک است. می‌دانید پارک کجاست؟"),
            d("A", "No, I don't. I'm new here.", "نه. من اینجا جدید هستم."),
            d("B", "No problem. Go straight for two blocks.", "مشکلی نیست. دو بلوک مستقیم بروید."),
            d("A", "Okay. Then what?", "باشه. بعدش چه؟"),
            d("B", "Turn left at the traffic light.", "پشت چراغ راهنما به چپ بپیچید."),
            d("A", "Left at the traffic light. Got it.", "چپ پشت چراغ راهنما. متوجه شدم."),
            d("B", "Then walk one more block. The museum is on your right.", "بعد یک بلوک دیگر بروید. موزه سمت راست شماست."),
            d("A", "Is it across from the park?", "روبه‌روی پارک است؟"),
            d("B", "Yes, it is. It's next to the library.", "بله. کنار کتابخانه است."),
            d("A", "How long does it take?", "چقدر طول می‌کشد؟"),
            d("B", "About ten minutes on foot.", "حدود ده دقیقه پیاده."),
            d("A", "Is there a bus I can take?", "اتوبوسی هست که بتوانم سوار شوم؟"),
            d("B", "Yes, the number 5 bus stops near here.", "بله، اتوبوس شماره ۵ نزدیک اینجا توقف می‌کند."),
            d("A", "Where's the bus stop?", "ایستگاه اتوبوس کجاست؟"),
            d("B", "It's in front of the bank, on the corner.", "روبه‌روی بانک، سر خیابان است."),
            d("A", "Great. And is the museum far from here?", "عالی. موزه از اینجا دور است؟"),
            d("B", "No, it's not far. About one kilometer.", "نه، دور نیست. حدود یک کیلومتر."),
            d("A", "Thank you very much for your help.", "خیلی ممنون برای کمکتان."),
            d("B", "You're welcome. Have a nice visit!", "خواهش می‌کنم. بازدید خوبی داشته باشید!"),
            d("A", "Thanks. Goodbye.", "ممنون. خداحافظ."),
            d("B", "Goodbye.", "خداحافظ.")
        ),
        listOf(
            q("Where is the museum?", listOf("next to the bank", "across from the park", "near the hotel", "behind the school"), 1),
            q("How does A go to the museum?", listOf("by taxi", "by bus", "on foot", "by subway"), 2),
            q("How long does it take on foot?", listOf("5 minutes", "10 minutes", "15 minutes", "20 minutes"), 1),
            q("Turn ___ at the traffic light.", listOf("right", "left", "straight", "back"), 1),
            q("___ is a bank near here.", listOf("There", "They", "He", "It"), 0),
            q("The bus stop is ___ the corner.", listOf("in", "at", "on", "from"), 2),
            q("Which word means 'دور'?", listOf("near", "far", "across", "between"), 1),
            q("Which word means 'نزدیک'?", listOf("far", "near", "between", "right"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Excuse me", "ببخشید", "Excuse me, where's the museum?", "ببخشید، موزه کجاست؟"),
            IdiomExpression("No problem", "مشکلی نیست", "No problem. Go straight.", "مشکلی نیست. مستقیم بروید."),
            IdiomExpression("Got it", "متوجه شدم", "Left at the traffic light. Got it.", "چپ پشت چراغ راهنما. متوجه شدم."),
            IdiomExpression("On foot", "پیاده", "About ten minutes on foot.", "حدود ده دقیقه پیاده.")
        ),
        phrasal = listOf(
            PhrasalVerb("get to", "رسیدن به", "arrive at a place",
                "How do I get to the station?", "چطور به ایستگاه برسم؟", "No"),
            PhrasalVerb("turn left / right", "به چپ/راست پیچیدن", "change direction",
                "Turn left at the corner.", "سر خیابان به چپ بپیچید.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Directions", "Say 'turn left' and 'turn right' clearly. Stress 'left' and 'right'."),
            PronunciationTip("Numbers in addresses", "For bus numbers, say 'the number 5 bus' or 'bus number 5'.")
        ),
        culture = listOf(
            CulturalNote("Polite directions",
                "'Excuse me' is a polite opener when asking a stranger for directions. It's also polite to say 'thank you' before leaving.")
        ),
        mistakes = listOf(
            CommonMistake("The bank is in the corner.", "The bank is on the corner.", "Use 'on the corner' for street corners."),
            CommonMistake("Go straightly.", "Go straight.", "'Straight' is already an adverb here.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Where exactly is the museum?", "Across from the park and next to the library."),
            ComprehensionQuestion("Where is the bus stop?", "In front of the bank, on the corner.")
        ),
        speaking = listOf(
            SpeakingTask("Give directions from your home to a nearby place.",
                "از خانه تا یک مکان نزدیک مسیر بده.",
                "Go straight... / Turn left... / It's next to..."),
            SpeakingTask("Ask a partner for directions to a place in your city.",
                "از یک دوست مسیر یک مکان در شهرتان را بپرس.",
                "Excuse me, where's...? / How do I get to...?")
        ),
        writing = listOf(
            WritingTask("Write directions from your home to a familiar place.",
                "مسیر خانه تا یک مکان آشنا را بنویس.",
                120, "Use at least five location or direction expressions.")
        )
    )
// ═══════════════════════════════════════════════════════════
// LESSON 4 — Family | خانواده
// ═══════════════════════════════════════════════════════════
private fun lesson4() = base(
    4, "Family", "خانواده",
    listOf(
        "Identify and describe family members",
        "Talk about extended family",
        "Use have/has for possession",
        "Use possessive 's correctly",
        "Compare family members"
    ),
    listOf(
        v("mother", "مادر", "My mother is a doctor.", "مادرم پزشک است."),
        v("father", "پدر", "My father works at home.", "پدرم در خانه کار می‌کند."),
        v("sister", "خواهر", "I have one sister.", "من یک خواهر دارم."),
        v("brother", "برادر", "My brother is twelve.", "برادرم دوازده ساله است."),
        v("parents", "والدین", "My parents live nearby.", "والدینم نزدیک زندگی می‌کنند."),
        v("son", "پسر", "Their son is a student.", "پسرشان دانش‌آموز است."),
        v("daughter", "دختر", "Their daughter is five.", "دخترشان پنج ساله است."),
        v("husband", "شوهر", "Her husband is a teacher.", "شوهرش معلم است."),
        v("wife", "همسر / زن", "His wife is an artist.", "همسرش هنرمند است."),
        v("relative", "فامیل", "We visit relatives on holidays.", "در تعطیلات به دیدن فامیل می‌رویم."),
        v("aunt", "خاله / عمه", "My aunt lives in London.", "خاله‌ام در لندن زندگی می‌کند."),
        v("uncle", "دایی / عمو", "His uncle is a teacher.", "عمویش معلم است."),
        v("cousin", "پسرخاله / دخترخاله", "I have many cousins.", "من پسرخاله و دخترخاله‌های زیادی دارم."),
        v("married", "متأهل", "My sister is married.", "خواهرم متأهل است.", "adjective"),
        v("single", "مجرد", "My brother is still single.", "برادرم هنوز مجرد است.", "adjective")
    ),
    listOf(
        GrammarSection(
            "Have / Has for possession",
            "Use 'have' with I, you, we, they and 'has' with he, she, it: I have two brothers. She has one sister."
        ),
        GrammarSection(
            "Possessive 's",
            "Use 's to show possession: Sara's brother, my father's car."
        ),
        GrammarSection(
            "Family questions",
            "Who is...? How many...? Do you have...? Does she have...?"
        ),
        GrammarSection(
            "Comparatives",
            "Use -er or more for comparisons: older, taller, more serious, more outgoing."
        )
    ),
    listOf(
        d("A", "Do you have brothers or sisters?", "خواهر یا برادر داری؟"),
        d("B", "Yes, I have one brother and one sister.", "بله، یک برادر و یک خواهر دارم."),
        d("A", "How old is your brother?", "برادرت چند ساله است؟"),
        d("B", "He's fifteen. He's older than me.", "پانزده ساله است. از من بزرگتر است."),
        d("A", "And your sister?", "و خواهرت؟"),
        d("B", "She's ten. She's the youngest.", "ده ساله است. او کوچکترین است."),
        d("A", "What does your mother do?", "مادرت چه‌کاره است؟"),
        d("B", "She's a teacher. She teaches math.", "او معلم است. ریاضی درس می‌دهد."),
        d("A", "Does your father work nearby?", "پدرت نزدیک کار می‌کند؟"),
        d("B", "Yes, he does. He works at a bank downtown.", "بله. در یک بانک در مرکز شهر کار می‌کند."),
        d("A", "Do you have any cousins?", "پسرخاله یا دخترخاله داری؟"),
        d("B", "Yes, I have many cousins. My mother has four sisters.", "بله، خیلی دارم. مادرم چهار خواهر دارد."),
        d("A", "Wow, that's a big family!", "واو، خانواده بزرگی است!"),
        d("B", "Yes, and we get together every weekend.", "بله، و هر آخر هفته دور هم جمع می‌شویم."),
        d("A", "That sounds nice. Where do your grandparents live?", "خوبه. پدربزرگ و مادربزرگت کجا زندگی می‌کنند؟"),
        d("B", "They live near my aunt's house.", "آن‌ها نزدیک خانه خاله‌ام زندگی می‌کنند."),
        d("A", "So your aunt is their neighbor?", "پس خاله‌ات همسایه‌شان است؟"),
        d("B", "That's right. She's my mother's sister.", "درست است. او خواهر مادرم است."),
        d("A", "Well, that's a nice family setup.", "خب، این خانواده خوبی است."),
        d("B", "Thanks. Do you have a big family?", "ممنون. تو خانواده بزرگی داری؟"),
        d("A", "I have two brothers and one sister. I'm the youngest.", "من دو برادر و یک خواهر دارم. من کوچکترین هستم."),
        d("B", "That's great! Being the youngest must be fun.", "عالیه! کوچکترین بودن باید لذت‌بخش باشد."),
        d("A", "Sometimes. But my brothers are very protective.", "گاهی. ولی برادرهایم خیلی مراقب هستند.")
    ),
    listOf(
        q("I ___ two brothers.", listOf("has", "have", "am", "is"), 1),
        q("Sara's brother means...", listOf("the brother of Sara", "Sara is a brother", "a brother's Sara", "Sara has brother"), 0),
        q("She ___ one sister.", listOf("have", "has", "are", "do"), 1),
        q("___ old is your brother?", listOf("What", "Who", "How", "Where"), 2),
        q("My sister is ___ than me.", listOf("tall", "taller", "tallest", "more tall"), 1),
        q("He ___ at a bank.", listOf("work", "works", "working", "worked"), 1),
        q("How many cousins does B have?", listOf("one", "two", "many", "none"), 2),
        q("Who is the youngest in A's family?", listOf("A", "A's brother", "A's sister", "A's cousin"), 0)
    ),
    idioms = listOf(
        IdiomExpression("Get together", "دور هم جمع شدن", "We get together every weekend.", "هر آخر هفته دور هم جمع می‌شویم."),
        IdiomExpression("That's right", "درست است", "That's right. She's my mother's sister.", "درست است. او خواهر مادرم است."),
        IdiomExpression("That's great!", "عالیه!", "That's great! Being the youngest must be fun.", "عالیه! کوچکترین بودن باید لذت‌بخش باشد.")
    ),
    phrasal = listOf(
        PhrasalVerb("grow up", "بزرگ شدن", "spend childhood",
            "I grew up in a small town.", "من در یک شهر کوچک بزرگ شدم.", "Yes")
    ),
    pronunciation = listOf(
        PronunciationTip("Family words", "Practice the difference between 'sister' /ˈsɪstər/ and 'brother' /ˈbrʌðər/."),
        PronunciationTip("Possessive 's", "The 's sound is clear: Sara's, mother's, father's.")
    ),
    culture = listOf(
        CulturalNote("Family terms",
            "English has different everyday words for immediate family (parents, siblings) and extended family (aunts, uncles, cousins)."),
        CulturalNote("Talking about family",
            "Asking about family is a common way to make friendly conversation in many English-speaking cultures.")
    ),
    mistakes = listOf(
        CommonMistake("She have two brothers.", "She has two brothers.", "Use 'has' with he, she, and it."),
        CommonMistake("He is more tall than me.", "He is taller than me.", "Use -er for one-syllable adjectives.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("How many siblings does B have?", "One brother and one sister."),
        ComprehensionQuestion("Where do B's grandparents live?", "Near B's aunt's house.")
    ),
    speaking = listOf(
        SpeakingTask("Describe your family in five sentences.",
            "خانواده‌ات را در پنج جمله توصیف کن.",
            "I have... / My ... is... / His/Her name is..."),
        SpeakingTask("Compare two family members.",
            "دو عضو خانواده را با هم مقایسه کن.",
            "X is taller than Y. X is more outgoing than Y.")
    ),
    writing = listOf(
        WritingTask("Write about your family.",
            "درباره خانواده‌ات بنویس.",
            120, "Mention three family members and one comparison.")
    )
)

// ═══════════════════════════════════════════════════════════
// LESSON 5 — Events and Times | رویدادها و زمان‌ها
// ═══════════════════════════════════════════════════════════
private fun lesson5() = base(
    5, "Events and Times", "رویدادها و زمان‌ها",
    listOf(
        "Tell the time accurately",
        "Talk about schedules and events",
        "Ask when an event starts and finishes",
        "Talk about birthdays and dates",
        "Use at, on, in with time expressions"
    ),
    listOf(
        v("time", "زمان", "What time is it?", "ساعت چند است؟"),
        v("morning", "صبح", "The class is in the morning.", "کلاس صبح است."),
        v("afternoon", "بعدازظهر", "The meeting is in the afternoon.", "جلسه بعدازظهر است."),
        v("evening", "عصر / شب", "The movie is in the evening.", "فیلم عصر است."),
        v("today", "امروز", "The event is today.", "رویداد امروز است."),
        v("tomorrow", "فردا", "The class is tomorrow.", "کلاس فرداست."),
        v("birthday", "تولد", "My birthday is in May.", "تولد من در ماه مه است."),
        v("meeting", "جلسه", "The meeting starts at nine.", "جلسه ساعت نه شروع می‌شود."),
        v("start", "شروع شدن", "The class starts at eight.", "کلاس ساعت هشت شروع می‌شود.", "verb"),
        v("finish", "تمام شدن", "The movie finishes at ten.", "فیلم ساعت ده تمام می‌شود.", "verb"),
        v("noon", "ظهر", "The meeting is at noon.", "جلسه سر ظهر است."),
        v("midnight", "نیمه‌شب", "The party ends at midnight.", "مهمانی نیمه‌شب تمام می‌شود."),
        v("date", "تاریخ", "What's today's date?", "تاریخ امروز چیست؟"),
        v("schedule", "برنامه", "What's your schedule for tomorrow?", "برنامه‌ات برای فردا چیست؟"),
        v("appointment", "قرار", "I have an appointment at three.", "ساعت سه قرار دارم.")
    ),
    listOf(
        GrammarSection("Telling time",
            "Use It's + time: It's three o'clock. It's half past four. It's a quarter to five."),
        GrammarSection("At / On / In for time",
            "Use 'at' for clock times (at 8:00), 'on' for days and dates (on Monday, on May 5th), and 'in' for months, years, and parts of the day (in May, in 2025, in the morning)."),
        GrammarSection("Present simple for schedules",
            "Use the present simple for fixed schedules: The class starts at nine. The movie finishes at ten."),
        GrammarSection("Questions about time",
            "What time is it? When does it start? What time does the meeting finish?")
    ),
    listOf(
        d("A", "What time is the meeting?", "جلسه چه ساعتی است؟"),
        d("B", "It's at ten thirty.", "ساعت ده و نیم است."),
        d("A", "Is it today or tomorrow?", "امروز است یا فردا؟"),
        d("B", "It's tomorrow. Wednesday, I think.", "فرداست. فکر کنم چهارشنبه."),
        d("A", "What time does it start?", "چه ساعتی شروع می‌شود؟"),
        d("B", "It starts at ten thirty in the morning.", "ساعت ده و نیم صبح شروع می‌شود."),
        d("A", "When does it finish?", "کی تمام می‌شود؟"),
        d("B", "It finishes at noon. We'll have lunch after.", "ظهر تمام می‌شود. بعدش ناهار می‌خوریم."),
        d("A", "Great. Where is it?", "عالی. کجاست؟"),
        d("B", "In the main conference room, on the second floor.", "در اتاق کنفرانس اصلی، طبقه دوم."),
        d("A", "Do I need to bring anything?", "چیزی لازم است بیاورم؟"),
        d("B", "Just a notebook and a pen.", "فقط یک دفتر و خودکار."),
        d("A", "Got it. By the way, what's today's date?", "متوجه شدم. راستی، تاریخ امروز چیست؟"),
        d("B", "It's May fifth.", "پنجم مه است."),
        d("A", "Oh, that's my sister's birthday!", "اوه، تولد خواهرم است!"),
        d("B", "Really? Are you doing anything special?", "واقعاً؟ کار خاصی می‌کنید؟"),
        d("A", "Yes, we're having dinner at seven.", "بله، ساعت هفت شام داریم."),
        d("B", "That sounds nice. What time do you finish work?", "خوبه. چه ساعتی کارت تمام می‌شود؟"),
        d("A", "I finish at five today.", "امروز ساعت پنج تمام می‌شود."),
        d("B", "Perfect. You have time to get ready.", "عالی. وقت داری آماده شوی."),
        d("A", "Yes, I do. Thanks for the info about the meeting.", "بله. ممنون برای اطلاعات جلسه."),
        d("B", "You're welcome. See you tomorrow.", "خواهش می‌کنم. فردا می‌بینمت.")
    ),
    listOf(
        q("The class starts ___ eight.", listOf("in", "on", "at", "to"), 2),
        q("My birthday is ___ May.", listOf("at", "in", "on", "from"), 1),
        q("What time is it?", listOf("It's Tuesday.", "It's three thirty.", "It's May.", "It's a meeting."), 1),
        q("The meeting is ___ Monday.", listOf("on", "in", "at", "from"), 0),
        q("When does the meeting finish?", listOf("at noon", "at 9:00", "in the morning", "at midnight"), 0),
        q("What's today's date?", listOf("Wednesday", "May fifth", "ten thirty", "noon"), 1),
        q("The party is ___ the evening.", listOf("at", "on", "in", "from"), 2),
        q("What time does A finish work today?", listOf("at 3:00", "at 5:00", "at 7:00", "at noon"), 1)
    ),
    idioms = listOf(
        IdiomExpression("By the way", "راستی", "By the way, what's today's date?", "راستی، تاریخ امروز چیست؟"),
        IdiomExpression("Got it", "متوجه شدم", "Got it. By the way...", "متوجه شدم. راستی..."),
        IdiomExpression("Sounds nice", "خوبه", "That sounds nice.", "خوبه.")
    ),
    phrasal = listOf(
        PhrasalVerb("get ready", "آماده شدن", "prepare oneself",
            "You have time to get ready.", "وقت داری آماده شوی.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Numbers and times", "Keep the final sound of 'thirteen' and 'thirty' distinct."),
        PronunciationTip("Reduction of 'at'", "In natural speech, 'at' is often reduced: at ten → /ətɛn/")
    ),
    culture = listOf(
        CulturalNote("Time expressions",
            "English speakers commonly use both digital-style times (ten thirty) and expressions such as half past ten."),
        CulturalNote("Meeting times",
            "In many English-speaking countries, it's considered polite to arrive on time or a few minutes early for meetings.")
    ),
    mistakes = listOf(
        CommonMistake("The meeting is in Monday.", "The meeting is on Monday.", "Use 'on' with days of the week."),
        CommonMistake("I have appointment at three.", "I have an appointment at three.", "Use 'an' before 'appointment'.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("When is the meeting and what time does it start?", "Tomorrow (Wednesday) at 10:30 in the morning."),
        ComprehensionQuestion("What is special about today's date for A?", "It's A's sister's birthday.")
    ),
    speaking = listOf(
        SpeakingTask("Ask and answer about three events on a schedule.",
            "درباره سه رویداد در یک برنامه زمانی سؤال و جواب کن.",
            "What time...? / When...? / It starts..."),
        SpeakingTask("Talk about your daily schedule.",
            "درباره برنامه روزانه‌ات صحبت کن.",
            "I wake up at... / I start work at... / I finish at...")
    ),
    writing = listOf(
        WritingTask("Write your schedule for one day.",
            "برنامه یک روزت را بنویس.",
            120, "Include at least five times and use at/on/in correctly.")
    )
)

// ═══════════════════════════════════════════════════════════
// LESSON 6 — Clothes | لباس‌ها
// ═══════════════════════════════════════════════════════════
private fun lesson6() = base(
    6, "Clothes", "لباس‌ها",
    listOf(
        "Name common clothes and colors",
        "Describe what people are wearing",
        "Use this/that and these/those correctly",
        "Ask about clothing size and price",
        "Use present progressive for current actions"
    ),
    listOf(
        v("shirt", "پیراهن", "He's wearing a blue shirt.", "او پیراهن آبی پوشیده است."),
        v("T-shirt", "تی‌شرت", "I like this T-shirt.", "این تی‌شرت را دوست دارم."),
        v("jacket", "ژاکت / کت", "Her jacket is black.", "ژاکتش مشکی است."),
        v("pants", "شلوار", "These pants are comfortable.", "این شلوار راحت است."),
        v("shoes", "کفش", "My shoes are new.", "کفش‌هایم جدیدند."),
        v("dress", "لباس / پیراهن زنانه", "The dress is beautiful.", "لباس زیباست."),
        v("skirt", "دامن", "She is wearing a skirt.", "او دامن پوشیده است."),
        v("hat", "کلاه", "His hat is brown.", "کلاهش قهوه‌ای است."),
        v("size", "سایز", "What size is it?", "چه سایزی است؟"),
        v("color", "رنگ", "What color is it?", "چه رنگی است؟"),
        v("wear", "پوشیدن", "I wear a uniform to work.", "من برای کار لباس فرم می‌پوشم.", "verb"),
        v("try on", "پرو کردن", "Can I try on this jacket?", "می‌توانم این کت را پرو کنم؟", "verb"),
        v("fit", "اندازه بودن", "These shoes fit perfectly.", "این کفش‌ها کاملاً اندازه هستند.", "verb"),
        v("comfortable", "راحت", "These pants are very comfortable.", "این شلوار خیلی راحت است.", "adjective"),
        v("expensive", "گران", "That jacket is too expensive.", "آن کت خیلی گران است.", "adjective")
    ),
    listOf(
        GrammarSection("This / That / These / Those",
            "Use this/that for one item and these/those for more than one. This shirt is new. These shoes are old."),
        GrammarSection("Present progressive for clothes",
            "Use be + verb-ing for clothes and actions happening now: She's wearing a jacket. I'm trying on these shoes."),
        GrammarSection("Adjectives before nouns",
            "Put common adjectives before nouns: a blue shirt, black shoes, an expensive jacket."),
        GrammarSection("Questions about clothes",
            "What are you wearing? What size is it? How much is it? What color is it?")
    ),
    listOf(
        d("A", "What are you wearing today?", "امروز چه پوشیده‌ای؟"),
        d("B", "I'm wearing a blue shirt and black pants.", "پیراهن آبی و شلوار مشکی پوشیده‌ام."),
        d("A", "I like that jacket. Is it new?", "آن کت را دوست دارم. جدید است؟"),
        d("B", "Thanks. Yes, it's my new jacket.", "ممنون. بله، کت جدیدم است."),
        d("A", "What color are your shoes?", "کفش‌هایت چه رنگی هستند؟"),
        d("B", "They're white. I got them on sale.", "سفید هستند. در حراج خریدمشان."),
        d("A", "Are they comfortable?", "راحت هستند؟"),
        d("B", "Yes, they are. Very comfortable.", "بله. خیلی راحت."),
        d("A", "Where did you get them?", "از کجا گرفتی‌شان؟"),
        d("B", "At a small store near my house.", "از یک فروشگاه کوچک نزدیک خانه‌ام."),
        d("A", "I need new shoes too. What size are you?", "من هم کفش جدید لازم دارم. سایزت چقدر است؟"),
        d("B", "I'm size 42. What about you?", "سایز ۴۲ هستم. تو چطور؟"),
        d("A", "I'm size 41. Are the shoes expensive there?", "من سایز ۴۱ هستم. کفش‌ها آنجا گران هستند؟"),
        d("B", "No, not really. They have good prices.", "نه، نه واقعاً. قیمت‌های خوبی دارند."),
        d("A", "That's good. Do they have jackets too?", "خوبه. کت هم دارند؟"),
        d("B", "Yes, they do. They have a lot of nice clothes.", "بله. لباس‌های خوب زیادی دارند."),
        d("A", "Great. Maybe I'll go there this weekend.", "عالی. شاید این آخر هفته بروم آنجا."),
        d("B", "Let me know if you go. I might come with you.", "اگر رفتی خبرم کن. شاید با تو بیایم."),
        d("A", "Sounds good. I'll call you on Saturday.", "خوبه. شنبه بهت زنگ می‌زنم."),
        d("B", "Perfect. See you then.", "عالی. تا اون موقع.")
    ),
    listOf(
        q("___ shirt is blue.", listOf("These", "This", "Those", "They"), 1),
        q("These ___ are comfortable.", listOf("shoe", "shoes", "shirt", "hat"), 1),
        q("She is ___ a jacket.", listOf("wear", "wearing", "wears", "wore"), 1),
        q("What color ___ your shoes?", listOf("is", "am", "are", "be"), 2),
        q("What size is B?", listOf("41", "42", "43", "40"), 1),
        q("Where did B buy the shoes?", listOf("at the mall", "at a small store", "online", "at a market"), 1),
        q("___ shoes are new.", listOf("This", "These", "A", "An"), 1),
        q("The shoes are ___", listOf("expensive", "comfortable", "old", "small"), 1)
    ),
    idioms = listOf(
        IdiomExpression("On sale", "در حراج", "I got them on sale.", "در حراج خریدمشان."),
        IdiomExpression("Let me know", "خبرم کن", "Let me know if you go.", "اگر رفتی خبرم کن."),
        IdiomExpression("Not really", "نه واقعاً", "Are they expensive? Not really.", "گران هستند؟ نه واقعاً.")
    ),
    phrasal = listOf(
        PhrasalVerb("try on", "پرو کردن", "put on clothes to test",
            "Can I try on this jacket?", "می‌توانم این کت را پرو کنم؟", "No"),
        PhrasalVerb("come with", "همراه شدن با", "accompany someone",
            "I might come with you.", "شاید با تو بیایم.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Plural clothing words", "Shoes and pants are normally plural in everyday English: These shoes are... These pants are..."),
        PronunciationTip("Vowel sounds in colors", "Practice the difference: blue /uː/, black /æ/, white /aɪ/.")
    ),
    culture = listOf(
        CulturalNote("Clothing questions",
            "'What are you wearing?' is natural for asking about someone's current clothes. 'What size are you?' is common in stores.")
    ),
    mistakes = listOf(
        CommonMistake("This shoes are new.", "These shoes are new.", "Use 'these' with plural nouns."),
        CommonMistake("She wearing a jacket.", "She is wearing a jacket.", "Present progressive needs 'be + verb-ing'.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What is B wearing today?", "A blue shirt, black pants, a new jacket, and white shoes."),
        ComprehensionQuestion("What are A's plans for the weekend?", "Maybe go to the store to buy new shoes.")
    ),
    speaking = listOf(
        SpeakingTask("Describe your clothes today.",
            "لباس‌های امروزت را توصیف کن.",
            "I'm wearing... / My ... is... / These ... are..."),
        SpeakingTask("Role-play a shopping conversation.",
            "نقش خریدار و فروشنده را بازی کنید.",
            "Can I try on...? / What size...? / How much...?")
    ),
    writing = listOf(
        WritingTask("Describe an outfit you like.",
            "یک لباس یا ست لباسی که دوست داری توصیف کن.",
            100, "Mention color, type, size, and why you like it.")
    )
)

// ═══════════════════════════════════════════════════════════
// LESSON 7 — Activities | فعالیت‌ها
// ═══════════════════════════════════════════════════════════
private fun lesson7() = base(
    7, "Activities", "فعالیت‌ها",
    listOf(
        "Talk about everyday activities",
        "Say what you like and don't like to do",
        "Use simple present questions with do/does",
        "Talk about free time and hobbies",
        "Use adverbs of frequency"
    ),
    listOf(
        v("exercise", "ورزش کردن", "I exercise after school.", "بعد از مدرسه ورزش می‌کنم.", "verb"),
        v("read", "خواندن", "I read in the evening.", "عصر کتاب می‌خوانم.", "verb"),
        v("watch", "تماشا کردن", "We watch movies on Fridays.", "جمعه‌ها فیلم می‌بینیم.", "verb"),
        v("listen", "گوش دادن", "I listen to music.", "به موسیقی گوش می‌دهم.", "verb"),
        v("cook", "آشپزی کردن", "My father cooks at home.", "پدرم در خانه آشپزی می‌کند.", "verb"),
        v("walk", "پیاده‌روی کردن", "I walk to school.", "پیاده به مدرسه می‌روم.", "verb"),
        v("play", "بازی کردن", "They play soccer.", "آن‌ها فوتبال بازی می‌کنند.", "verb"),
        v("study", "درس خواندن", "She studies English.", "او انگلیسی می‌خواند.", "verb"),
        v("relax", "استراحت کردن", "I relax on weekends.", "آخر هفته استراحت می‌کنم.", "verb"),
        v("weekend", "آخر هفته", "What do you do on weekends?", "آخر هفته‌ها چه کار می‌کنی؟"),
        v("hobby", "سرگرمی", "Reading is my favorite hobby.", "خواندن سرگرمی مورد علاقه‌ام است."),
        v("usually", "معمولاً", "I usually study in the morning.", "من معمولاً صبح درس می‌خوانم.", "adverb"),
        v("sometimes", "گاهی", "Sometimes I watch movies.", "گاهی فیلم می‌بینم.", "adverb"),
        v("never", "هرگز", "I never play video games.", "من هرگز بازی ویدیویی نمی‌کنم.", "adverb"),
        v("always", "همیشه", "She always exercises in the morning.", "او همیشه صبح ورزش می‌کند.", "adverb")
    ),
    listOf(
        GrammarSection("Simple present for routines",
            "Use the simple present for habits and routines: I usually study. She plays soccer."),
        GrammarSection("Do / Does questions",
            "Use 'do' with I/you/we/they and 'does' with he/she/it: Do you exercise? Does she cook?"),
        GrammarSection("Adverbs of frequency",
            "Use always, usually, sometimes, rarely, and never to say how often. They come before the main verb: I usually study."),
        GrammarSection("Like + verb-ing",
            "Use 'like + verb-ing' or 'like + to + verb' to talk about hobbies: I like reading. I like to read.")
    ),
    listOf(
        d("A", "What do you do after school?", "بعد از مدرسه چه کار می‌کنی؟"),
        d("B", "I usually study and exercise.", "معمولاً درس می‌خوانم و ورزش می‌کنم."),
        d("A", "Do you watch TV?", "تلویزیون تماشا می‌کنی؟"),
        d("B", "Sometimes. I usually watch movies on weekends.", "گاهی. معمولاً آخر هفته‌ها فیلم می‌بینم."),
        d("A", "What about sports?", "ورزش چطور؟"),
        d("B", "I play soccer with my friends on Saturdays.", "شنبه‌ها با دوستانم فوتبال بازی می‌کنم."),
        d("A", "Does your brother play too?", "برادرت هم بازی می‌کند؟"),
        d("B", "Yes, he does. He's a very good player.", "بله. بازیکن خیلی خوبی است."),
        d("A", "Do you cook at home?", "در خانه آشپزی می‌کنی؟"),
        d("B", "Yes, sometimes. I like cooking pasta.", "بله، گاهی. آشپزی پاستا را دوست دارم."),
        d("A", "Nice! I never cook. I always eat out.", "عالی! من هرگز آشپزی نمی‌کنم. همیشه بیرون غذا می‌خورم."),
        d("B", "Really? Cooking is fun and healthy.", "واقعاً؟ آشپزی سرگرم‌کننده و سالم است."),
        d("A", "You're right. Maybe I should learn.", "حق داری. شاید باید یاد بگیرم."),
        d("B", "I can teach you if you want.", "اگر بخواهی می‌توانم یادت بدهم."),
        d("A", "That sounds great. When are you free?", "عالیه. کی آزادی؟"),
        d("B", "I'm free on Sunday afternoon.", "یکشنبه بعدازظهر آزادم."),
        d("A", "Perfect. What about your other hobbies?", "عالی. سرگرمی‌های دیگرت چطور؟"),
        d("B", "I also like reading. I read before bed every night.", "خواندن را هم دوست دارم. هر شب قبل از خواب می‌خوانم."),
        d("A", "What kind of books do you read?", "چه نوع کتابی می‌خوانی؟"),
        d("B", "Mostly novels. What about you?", "بیشتر رمان. تو چطور؟"),
        d("A", "I like history books, but I don't read very often.", "من کتاب‌های تاریخی دوست دارم، ولی زیاد نمی‌خوانم."),
        d("B", "You should read more. It helps with English too.", "باید بیشتر بخوانی. به انگلیسی هم کمک می‌کند."),
        d("A", "You're right. I'll try.", "حق داری. تلاش می‌کنم.")
    ),
    listOf(
        q("___ you exercise?", listOf("Does", "Do", "Are", "Is"), 1),
        q("She ___ English every day.", listOf("study", "studies", "studying", "studied"), 1),
        q("He ___ watch TV every night.", listOf("don't", "doesn't", "isn't", "not"), 1),
        q("Which word means 'گاهی'?", listOf("never", "usually", "sometimes", "always"), 2),
        q("What does B do on Saturdays?", listOf("study", "play soccer", "cook", "read"), 1),
        q("When is B free to teach A cooking?", listOf("Friday", "Saturday", "Sunday afternoon", "Monday"), 2),
        q("I ___ play video games.", listOf("always", "never", "usually", "sometimes"), 1),
        q("What kind of books does A like?", listOf("novels", "history", "science", "poetry"), 1)
    ),
    idioms = listOf(
        IdiomExpression("Eat out", "بیرون غذا خوردن", "I always eat out.", "همیشه بیرون غذا می‌خورم."),
        IdiomExpression("You're right", "حق داری", "You're right. Maybe I should learn.", "حق داری. شاید باید یاد بگیرم."),
        IdiomExpression("Before bed", "قبل از خواب", "I read before bed every night.", "هر شب قبل از خواب می‌خوانم.")
    ),
    phrasal = listOf(
        PhrasalVerb("hang out", "وقت گذراندن", "spend relaxed time with people",
            "I hang out with my friends.", "با دوستانم وقت می‌گذرانم.", "No"),
        PhrasalVerb("eat out", "بیرون غذا خوردن", "eat at a restaurant",
            "I always eat out.", "همیشه بیرون غذا می‌خورم.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Third-person -s", "Listen for the final sound in works, reads, and plays."),
        PronunciationTip("Frequency word stress", "Stress the frequency word: I ALways eat out. I NEver cook.")
    ),
    culture = listOf(
        CulturalNote("Free time",
            "People often talk about hobbies and weekend activities as easy conversation topics when getting to know each other.")
    ),
    mistakes = listOf(
        CommonMistake("He don't cook.", "He doesn't cook.", "Use 'doesn't' with he, she, and it."),
        CommonMistake("She study every day.", "She studies every day.", "Add -s to the verb with he, she, and it.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What does B do on Saturdays?", "Plays soccer with friends."),
        ComprehensionQuestion("Why does A never cook?", "A always eats out, but wants to learn.")
    ),
    speaking = listOf(
        SpeakingTask("Talk about your weekday and weekend activities.",
            "درباره فعالیت‌های روزهای عادی و آخر هفته‌ات صحبت کن.",
            "usually / sometimes / never / always"),
        SpeakingTask("Ask a partner about their hobbies.",
            "از یک دوست درباره سرگرمی‌هایش بپرس.",
            "What do you do in your free time? / Do you like...?")
    ),
    writing = listOf(
        WritingTask("Write about your typical day.",
            "درباره یک روز معمولی خودت بنویس.",
            120, "Use at least five simple-present verbs and three frequency words.")
    )
)
// ═══════════════════════════════════════════════════════════
// LESSON 8 — Home and Neighborhood | خانه و محله
// ═══════════════════════════════════════════════════════════
private fun lesson8() = base(
    8, "Home and Neighborhood", "خانه و محله",
    listOf(
        "Describe a home and its rooms",
        "Name common furniture",
        "Describe a neighborhood",
        "Use there is / there are for features",
        "Use prepositions to describe location"
    ),
    listOf(
        v("apartment", "آپارتمان", "I live in an apartment.", "من در آپارتمان زندگی می‌کنم."),
        v("house", "خانه", "Their house is small.", "خانه‌شان کوچک است."),
        v("kitchen", "آشپزخانه", "The kitchen is next to the living room.", "آشپزخانه کنار اتاق نشیمن است."),
        v("bedroom", "اتاق خواب", "My bedroom is upstairs.", "اتاق خوابم طبقه بالاست."),
        v("bathroom", "حمام / سرویس", "The bathroom is clean.", "حمام تمیز است."),
        v("living room", "اتاق نشیمن", "We watch TV in the living room.", "در اتاق نشیمن تلویزیون می‌بینیم."),
        v("neighbor", "همسایه", "Our neighbor is friendly.", "همسایه‌مان خوش‌برخورد است."),
        v("building", "ساختمان", "The building is new.", "ساختمان جدید است."),
        v("quiet", "ساکت", "The neighborhood is quiet.", "محله ساکت است.", "adjective"),
        v("busy", "شلوغ", "The street is busy.", "خیابان شلوغ است.", "adjective"),
        v("balcony", "بالکن", "We have a small balcony.", "بالکن کوچکی داریم."),
        v("furniture", "مبلمان", "The furniture is modern.", "مبلمان مدرن است."),
        v("upstairs", "طبقه بالا", "The bedrooms are upstairs.", "اتاق‌های خواب طبقه بالا هستند.", "adverb"),
        v("downstairs", "طبقه پایین", "The kitchen is downstairs.", "آشپزخانه طبقه پایین است.", "adverb"),
        v("nearby", "نزدیک", "There are stores nearby.", "فروشگاه‌های نزدیکی وجود دارد.", "adverb")
    ),
    listOf(
        GrammarSection(
            "There is / There are",
            "Use there is for one item and there are for two or more: There is a balcony. There are two bedrooms."
        ),
        GrammarSection(
            "Prepositions of place",
            "Use in, on, under, next to, between, and behind: The lamp is on the table. The kitchen is next to the living room."
        ),
        GrammarSection(
            "Have / has for features",
            "Use have/has to describe features of a home: My apartment has two bedrooms. It doesn't have a garden."
        ),
        GrammarSection(
            "Questions about a home",
            "What's your home like? How many bedrooms are there? Is there a balcony?"
        )
    ),
    listOf(
        d("A", "Do you live in a house or an apartment?", "در خانه زندگی می‌کنی یا آپارتمان؟"),
        d("B", "I live in an apartment. It's on the third floor.", "در آپارتمان زندگی می‌کنم. طبقه سوم است."),
        d("A", "How many bedrooms are there?", "چند اتاق خواب وجود دارد؟"),
        d("B", "There are two bedrooms and one bathroom.", "دو اتاق خواب و یک حمام وجود دارد."),
        d("A", "Is there a balcony?", "بالکن دارد؟"),
        d("B", "Yes, there is. It's next to the living room.", "بله. کنار اتاق نشیمن است."),
        d("A", "That sounds nice. Do you have a big kitchen?", "خوبه. آشپزخانه بزرگی داری؟"),
        d("B", "Not very big, but it's comfortable. We eat there sometimes.", "خیلی بزرگ نیست، ولی راحت است. گاهی آنجا غذا می‌خوریم."),
        d("A", "What's your neighborhood like?", "محله‌تان چطور است؟"),
        d("B", "It's quiet and friendly. There's a park nearby.", "ساکت و دوستانه است. یک پارک نزدیک هست."),
        d("A", "Are there stores nearby?", "فروشگاه نزدیک هست؟"),
        d("B", "Yes, there are several stores on the main street.", "بله، چند فروشگاه در خیابان اصلی هست."),
        d("A", "Is it far from downtown?", "از مرکز شهر دور است؟"),
        d("B", "No, it's about fifteen minutes by bus.", "نه، حدود پانزده دقیقه با اتوبوس."),
        d("A", "That's convenient. Do you like living there?", "این راحت است. دوست داری آنجا زندگی کنی؟"),
        d("B", "Yes, I do. The neighbors are very kind.", "بله. همسایه‌ها خیلی مهربان هستند."),
        d("A", "Do you have any problems with the building?", "با ساختمان مشکلی داری؟"),
        d("B", "Sometimes. The elevator is old and slow.", "گاهی. آسانسور قدیمی و کند است."),
        d("A", "That's too bad.", "چه بد."),
        d("B", "Yes, but everything else is fine.", "بله، ولی بقیه چیزها خوب است."),
        d("A", "Well, that's good. Thanks for telling me about it.", "خب، خوبه. ممنون که گفتی."),
        d("B", "You're welcome. Would you like to visit sometime?", "خواهش می‌کنم. دوست داری یک وقت بیایی؟"),
        d("A", "I'd love to. Thanks!", "خیلی دوست دارم. ممنون!")
    ),
    listOf(
        q("There ___ two bedrooms.", listOf("is", "are", "am", "be"), 1),
        q("There ___ a balcony.", listOf("are", "is", "have", "do"), 1),
        q("The lamp is ___ the table.", listOf("on", "between", "at", "from"), 0),
        q("A person who lives next to you is your...", listOf("neighbor", "student", "athlete", "customer"), 0),
        q("Where is B's apartment?", listOf("first floor", "second floor", "third floor", "ground floor"), 2),
        q("What is B's neighborhood like?", listOf("loud and dirty", "quiet and friendly", "busy and modern", "old and dangerous"), 1),
        q("What problem does B mention?", listOf("noisy neighbors", "small kitchen", "slow elevator", "no parking"), 2),
        q("How long does it take to get to downtown?", listOf("5 minutes", "10 minutes", "15 minutes", "30 minutes"), 2)
    ),
    idioms = listOf(
        IdiomExpression("What's it like?", "چطور است؟", "What's your neighborhood like?", "محله‌تان چطور است؟"),
        IdiomExpression("That's too bad", "چه بد", "The elevator is old. That's too bad.", "آسانسور قدیمی است. چه بد."),
        IdiomExpression("I'd love to", "خیلی دوست دارم", "Would you like to visit? I'd love to.", "دوست داری بیایی؟ خیلی دوست دارم.")
    ),
    phrasal = listOf(
        PhrasalVerb("live in", "زندگی کردن در", "reside in a place",
            "I live in an apartment.", "من در آپارتمان زندگی می‌کنم.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("There is / There are", "Keep the words connected: There_is, There_are."),
        PronunciationTip("Compound nouns", "Stress the first word: LIVing room, BEDroom, BATHroom.")
    ),
    culture = listOf(
        CulturalNote("Neighborhood talk",
            "Describing whether an area is quiet, busy, safe, or convenient is common in everyday conversation.")
    ),
    mistakes = listOf(
        CommonMistake("There is two bedrooms.", "There are two bedrooms.", "Use 'there are' with plural nouns."),
        CommonMistake("The lamp is in the table.", "The lamp is on the table.", "Use 'on' for surfaces.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What is B's apartment like?", "On the third floor, two bedrooms, one bathroom, a balcony."),
        ComprehensionQuestion("What problem does B mention about the building?", "The elevator is old and slow.")
    ),
    speaking = listOf(
        SpeakingTask("Describe your home and neighborhood.",
            "خانه و محله‌ات را توصیف کن.",
            "There is... / There are... / next to... / It has..."),
        SpeakingTask("Ask a partner about their home.",
            "از یک دوست درباره خانه‌اش بپرس.",
            "Do you live in...? / How many...? / Is there...?")
    ),
    writing = listOf(
        WritingTask("Describe your home in 120 words.",
            "خانه‌ات را در ۱۲۰ کلمه توصیف کن.",
            120, "Mention rooms, furniture, and the neighborhood.")
    )
)

// ═══════════════════════════════════════════════════════════
// LESSON 9 — Activities and Plans | فعالیت‌ها و برنامه‌ها
// ═══════════════════════════════════════════════════════════
private fun lesson9() = base(
    9, "Activities and Plans", "فعالیت‌ها و برنامه‌ها",
    listOf(
        "Talk about future plans",
        "Make simple arrangements",
        "Use going to for intentions",
        "Use present progressive for arrangements",
        "Accept and decline invitations"
    ),
    listOf(
        v("plan", "برنامه", "I have a plan for Saturday.", "برای شنبه برنامه دارم."),
        v("visit", "دیدار کردن", "I'm going to visit my aunt.", "می‌خواهم به دیدن خاله‌ام بروم.", "verb"),
        v("travel", "سفر کردن", "We are going to travel next week.", "هفته بعد سفر می‌کنیم.", "verb"),
        v("meet", "ملاقات کردن", "I'm meeting Sara at six.", "ساعت شش سارا را می‌بینم.", "verb"),
        v("tomorrow", "فردا", "I'm free tomorrow.", "فردا آزادم.", "adverb"),
        v("next week", "هفته بعد", "We are busy next week.", "هفته بعد مشغولیم."),
        v("free", "آزاد", "Are you free tonight?", "امشب آزادی؟", "adjective"),
        v("busy", "مشغول", "I'm busy on Friday.", "جمعه مشغولم.", "adjective"),
        v("party", "مهمانی", "There's a party on Saturday.", "شنبه مهمانی هست."),
        v("appointment", "قرار", "I have an appointment at three.", "ساعت سه قرار دارم."),
        v("intention", "قصد", "My intention is to study abroad.", "قصد من تحصیل در خارج است."),
        v("arrangement", "هماهنگی", "We made arrangements for the trip.", "برای سفر هماهنگی کردیم."),
        v("invite", "دعوت کردن", "I'm going to invite my friends.", "می‌خواهم دوستانم را دعوت کنم.", "verb"),
        v("accept", "پذیرفتن", "She accepted the invitation.", "او دعوت را پذیرفت.", "verb"),
        v("decline", "رد کردن", "He declined the invitation politely.", "او مؤدبانه دعوت را رد کرد.", "verb")
    ),
    listOf(
        GrammarSection(
            "Be going to",
            "Use be going to + verb for plans and intentions: I'm going to visit my aunt. We're going to travel."
        ),
        GrammarSection(
            "Present progressive for arrangements",
            "Use am/is/are + verb-ing for planned arrangements: I'm meeting Ali at six. We're having dinner at eight."
        ),
        GrammarSection(
            "Future time expressions",
            "Use tonight, tomorrow, this weekend, next week, and next month."
        ),
        GrammarSection(
            "Invitations with Would you like to...?",
            "Would you like to come? / Yes, I'd love to. / Sorry, I can't. Maybe next time."
        )
    ),
    listOf(
        d("A", "Are you free this weekend?", "این آخر هفته آزادی؟"),
        d("B", "Yes, I am. Why? What's up?", "بله. چرا؟ چه خبر؟"),
        d("A", "I'm going to visit the new museum on Saturday.", "می‌خواهم شنبه از موزه جدید دیدن کنم."),
        d("B", "That sounds good. I've heard it's amazing.", "خوبه. شنیده‌ام فوق‌العاده است."),
        d("A", "Would you like to come with me?", "می‌خواهی با من بیایی؟"),
        d("B", "I'd love to! What time are you going?", "خیلی دوست دارم! چه ساعتی می‌روی؟"),
        d("A", "I'm meeting my sister at two, so maybe around four.", "ساعت دو خواهرم را می‌بینم، پس شاید حدود چهار."),
        d("B", "Four works for me. Where should we meet?", "چهار برایم خوب است. کجا قرار بگذاریم؟"),
        d("A", "Let's meet at the museum entrance.", "بیا در ورودی موزه قرار بگذاریم."),
        d("B", "Perfect. By the way, are you doing anything Sunday?", "عالی. راستی، یکشنبه کاری داری؟"),
        d("A", "Yes, actually. I'm going to a birthday party.", "بله، در واقع. به یک مهمانی تولد می‌روم."),
        d("B", "Oh, whose party is it?", "اوه، مهمانی کیست؟"),
        d("A", "My cousin's. She's turning twenty.", "پسرخاله‌ام. بیست ساله می‌شود."),
        d("B", "That sounds fun. I'm going to visit my parents on Sunday.", "خوبه. من یکشنبه به دیدن والدینم می‌روم."),
        d("A", "That's nice. Do you see them often?", "خوبه. زیاد می‌بینی‌شان؟"),
        d("B", "Not very often, maybe once a month.", "نه زیاد، شاید ماهی یک بار."),
        d("A", "I understand. Family is important.", "می‌فهمم. خانواده مهم است."),
        d("B", "Yes, it is. Well, see you Saturday at four.", "بله. خب، شنبه ساعت چهار می‌بینمت."),
        d("A", "See you then. Don't be late!", "تا اون موقع. دیر نکن!"),
        d("B", "I won't. Promise.", "نمی‌کنم. قول می‌دهم."),
        d("A", "Great. Have a good week!", "عالی. هفته خوبی داشته باشی!"),
        d("B", "You too. Bye!", "تو هم. خداحافظ!")
    ),
    listOf(
        q("I'm ___ visit my aunt.", listOf("going to", "go", "going", "to going"), 0),
        q("I'm ___ Sara at six.", listOf("meet", "meeting", "meets", "met"), 1),
        q("Are you free tomorrow?", listOf("Yes, I am.", "Yes, I do.", "Yes, I can.", "Yes, I have."), 0),
        q("Which is a future time expression?", listOf("yesterday", "last year", "next week", "two days ago"), 2),
        q("Where will A and B meet on Saturday?", listOf("at a café", "at the museum entrance", "at A's home", "at the park"), 1),
        q("What is A doing on Sunday?", listOf("going to a party", "visiting parents", "studying", "working"), 0),
        q("How often does B see their parents?", listOf("every day", "once a week", "once a month", "never"), 2),
        q("What time will they meet on Saturday?", listOf("2:00", "3:00", "4:00", "5:00"), 2)
    ),
    idioms = listOf(
        IdiomExpression("What's up?", "چه خبر؟", "Are you free? Why, what's up?", "آزادی؟ چرا، چه خبر؟"),
        IdiomExpression("Works for me", "برایم خوب است", "Four works for me.", "چهار برایم خوب است."),
        IdiomExpression("By the way", "راستی", "By the way, are you doing anything Sunday?", "راستی، یکشنبه کاری داری؟")
    ),
    phrasal = listOf(
        PhrasalVerb("come with", "همراه شدن با", "accompany someone",
            "Would you like to come with me?", "می‌خواهی با من بیایی؟", "No"),
        PhrasalVerb("turn", "شدن (سن)", "reach an age",
            "She's turning twenty.", "او بیست ساله می‌شود.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("Going to", "In natural speech, 'going to' is often reduced to 'gonna', but for learners, use the full form clearly."),
        PronunciationTip("Rising intonation for invitations", "Would you like to come? ↗ (rising)")
    ),
    culture = listOf(
        CulturalNote("Making plans",
            "It's common to suggest a time and then confirm whether the other person is available. Being on time is important in many English-speaking cultures.")
    ),
    mistakes = listOf(
        CommonMistake("I'm go to visit.", "I'm going to visit.", "Use 'going to', not 'go to'."),
        CommonMistake("I meet Sara at six (for future plan).", "I'm meeting Sara at six.", "Use present progressive for fixed arrangements.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What are A and B going to do on Saturday?", "Visit the new museum at 4:00 PM."),
        ComprehensionQuestion("What are A and B doing on Sunday?", "A is going to a birthday party; B is visiting parents.")
    ),
    speaking = listOf(
        SpeakingTask("Make a weekend plan with a partner.",
            "با یک دوست برای آخر هفته برنامه بگذار.",
            "Are you free...? / I'm going to... / How about...?"),
        SpeakingTask("Invite a friend to an event and respond.",
            "یک دوست را به رویدادی دعوت کن و پاسخ بده.",
            "Would you like to...? / I'd love to. / Sorry, I can't.")
    ),
    writing = listOf(
        WritingTask("Write your plan for next weekend.",
            "برنامه آخر هفته آینده‌ات را بنویس.",
            120, "Include three planned activities and times. Use 'going to' and present progressive.")
    )
)

// ═══════════════════════════════════════════════════════════
// LESSON 10 — Food | غذا
// ═══════════════════════════════════════════════════════════
private fun lesson10() = base(
    10, "Food", "غذا",
    listOf(
        "Name common foods and drinks",
        "Order food in a restaurant",
        "Talk about likes and dislikes with food",
        "Use count and non-count nouns",
        "Use would like for polite requests"
    ),
    listOf(
        v("bread", "نان", "I eat bread for breakfast.", "برای صبحانه نان می‌خورم."),
        v("rice", "برنج", "We have rice for lunch.", "برای ناهار برنج داریم."),
        v("chicken", "مرغ", "I'd like chicken, please.", "لطفاً مرغ می‌خواهم."),
        v("salad", "سالاد", "The salad is fresh.", "سالاد تازه است."),
        v("soup", "سوپ", "I'd like some soup.", "کمی سوپ می‌خواهم."),
        v("water", "آب", "Can I have some water?", "می‌توانم کمی آب داشته باشم؟"),
        v("coffee", "قهوه", "I drink coffee in the morning.", "صبح قهوه می‌نوشم."),
        v("sandwich", "ساندویچ", "I'll have a sandwich.", "یک ساندویچ می‌خواهم."),
        v("menu", "منو", "Can I see the menu?", "می‌توانم منو را ببینم؟"),
        v("order", "سفارش دادن", "Are you ready to order?", "آماده سفارش دادن هستید؟", "verb"),
        v("appetizer", "پیش‌غذا", "Would you like an appetizer?", "پیش‌غذا میل دارید؟"),
        v("dessert", "دسر", "What would you like for dessert?", "برای دسر چه میل دارید؟"),
        v("bill", "صورت‌حساب", "Can we have the bill, please?", "می‌توانیم صورت‌حساب داشته باشیم، لطفاً؟"),
        v("tip", "انعام", "We left a good tip.", "انعام خوبی گذاشتیم."),
        v("delicious", "خوشمزه", "This soup is delicious.", "این سوپ خوشمزه است.", "adjective")
    ),
    listOf(
        GrammarSection(
            "Count / Non-count nouns",
            "Use 'a/an' with singular count nouns and 'some' with many non-count foods: a sandwich, some soup, some water."
        ),
        GrammarSection(
            "Would like for polite orders",
            "Use I'd like... as a polite way to order or request food: I'd like a sandwich, please. I'd like some water."
        ),
        GrammarSection(
            "Some / Any",
            "Use 'some' in affirmative requests and offers, and 'any' in many questions and negatives: Would you like some coffee? I don't want any dessert."
        ),
        GrammarSection(
            "Questions about food",
            "Are you ready to order? What would you like? Anything to drink?"
        )
    ),
    listOf(
        d("A", "Good evening. Are you ready to order?", "عصر بخیر. آماده سفارش دادن هستید؟"),
        d("B", "Yes, I think I'll have the grilled chicken.", "بله، فکر می‌کنم مرغ گریل می‌خورم."),
        d("A", "Would you like soup or salad with that?", "با آن سوپ می‌خواهید یا سالاد؟"),
        d("B", "I'd like a salad, please.", "لطفاً سالاد می‌خواهم."),
        d("A", "Anything to drink?", "نوشیدنی هم می‌خواهید؟"),
        d("B", "Some water, please. And a coffee after the meal.", "لطفاً کمی آب. و بعد از غذا یک قهوه."),
        d("A", "Of course. Would you like an appetizer?", "حتماً. پیش‌غذا میل دارید؟"),
        d("B", "No, thank you. That's all for now.", "نه، ممنون. فعلاً همین."),
        d("A", "Your food will be ready soon.", "غذایتان به‌زودی آماده می‌شود."),
        d("B", "Thank you. Oh, excuse me, can I have some bread too?", "ممنون. اوه، ببخشید، می‌توانم کمی نان هم داشته باشم؟"),
        d("A", "Of course. Anything else?", "حتماً. چیز دیگری؟"),
        d("B", "No, that's everything. Thank you.", "نه، همین. ممنون."),
        d("A", "(later) How is everything?", "(بعداً) همه چیز خوب است؟"),
        d("B", "Delicious! The chicken is perfect.", "خوشمزه! مرغ عالی است."),
        d("A", "Great. Would you like dessert?", "عالی. دسر میل دارید؟"),
        d("B", "What do you have?", "چه دارید؟"),
        d("A", "We have chocolate cake and ice cream.", "کیک شکلاتی و بستنی داریم."),
        d("B", "I'll have the chocolate cake, please.", "لطفاً کیک شکلاتی می‌خواهم."),
        d("A", "And another coffee?", "و یک قهوه دیگر؟"),
        d("B", "Yes, please. Then can I have the bill?", "بله، لطفاً. بعد می‌توانم صورت‌حساب داشته باشم؟"),
        d("A", "Certainly. Here you are.", "حتماً. بفرمایید."),
        d("B", "Thank you. Everything was wonderful.", "ممنون. همه چیز فوق‌العاده بود."),
        d("A", "Thank you very much. Have a good evening!", "خیلی ممنون. عصر خوبی داشته باشید!")
    ),
    listOf(
        q("I'd like ___ sandwich.", listOf("a", "some", "any", "an"), 0),
        q("I'd like ___ water.", listOf("a", "an", "some", "many"), 2),
        q("A polite way to order is...", listOf("Give food.", "I'd like...", "Food now.", "I want food."), 1),
        q("Can I see the ___?", listOf("menu", "neighbor", "street", "schedule"), 0),
        q("What does B order for the main course?", listOf("soup", "salad", "grilled chicken", "sandwich"), 2),
        q("What dessert does B order?", listOf("ice cream", "chocolate cake", "fruit", "nothing"), 1),
        q("What does B drink after the meal?", listOf("tea", "coffee", "juice", "water"), 1),
        q("How does B describe the food?", listOf("disappointing", "delicious", "too spicy", "cold"), 1)
    ),
    idioms = listOf(
        IdiomExpression("Ready to order", "آماده سفارش دادن", "Are you ready to order?", "آماده سفارش دادن هستید؟"),
        IdiomExpression("That's all", "همین", "No, that's all for now.", "نه، فعلاً همین."),
        IdiomExpression("How is everything?", "همه چیز خوب است؟", "How is everything? Delicious!", "همه چیز خوب است؟ خوشمزه!")
    ),
    phrasal = listOf(
        PhrasalVerb("eat out", "بیرون غذا خوردن", "eat at a restaurant",
            "We eat out every Friday.", "هر جمعه بیرون غذا می‌خوریم.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("I'd like", "Practice the contraction smoothly: I'd like... /aɪd laɪk/"),
        PronunciationTip("Rising intonation for offers", "Would you like some coffee? ↗ (rising)")
    ),
    culture = listOf(
        CulturalNote("Ordering politely",
            "'I'd like..., please' is a common polite pattern in cafés and restaurants. Tipping is common in some countries, especially in the US.")
    ),
    mistakes = listOf(
        CommonMistake("I want a coffee.", "I'd like a coffee, please.", "'I'd like' is more polite than 'I want'."),
        CommonMistake("Can I have a water?", "Can I have some water?", "'Water' is non-count, so use 'some'.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What did B order for the main course and dessert?", "Grilled chicken with salad and chocolate cake."),
        ComprehensionQuestion("What did B think of the food?", "Delicious, and everything was wonderful.")
    ),
    speaking = listOf(
        SpeakingTask("Role-play a restaurant order.",
            "نقش مشتری و گارسون را بازی کنید.",
            "I'd like... / Would you like...? / Anything else?"),
        SpeakingTask("Talk about your favorite food and drink.",
            "درباره غذای مورد علاقه‌ات صحبت کن.",
            "I like... / My favorite food is... / I usually drink...")
    ),
    writing = listOf(
        WritingTask("Write a short restaurant dialogue.",
            "یک گفت‌وگوی کوتاه در رستوران بنویس.",
            120, "Include an order, a drink, a dessert, and a polite response.")
    )
)

// ═══════════════════════════════════════════════════════════
// LESSON 11 — Past Events | رویدادهای گذشته
// ═══════════════════════════════════════════════════════════
private fun lesson11() = base(
    11, "Past Events", "رویدادهای گذشته",
    listOf(
        "Talk about past events",
        "Describe what you did yesterday",
        "Use was/were correctly",
        "Use the simple past of common verbs",
        "Ask questions with Did"
    ),
    listOf(
        v("yesterday", "دیروز", "I was busy yesterday.", "دیروز مشغول بودم.", "adverb"),
        v("last night", "دیشب", "We watched a movie last night.", "دیشب فیلم دیدیم."),
        v("visited", "دیدار کرد", "I visited my aunt.", "به دیدن خاله‌ام رفتم.", "verb"),
        v("watched", "تماشا کرد", "She watched TV.", "او تلویزیون تماشا کرد.", "verb"),
        v("played", "بازی کرد", "They played soccer.", "آن‌ها فوتبال بازی کردند.", "verb"),
        v("went", "رفت", "We went to the park.", "به پارک رفتیم.", "verb"),
        v("ate", "خورد", "I ate lunch at one.", "ساعت یک ناهار خوردم.", "verb"),
        v("saw", "دید", "I saw an old friend.", "یک دوست قدیمی را دیدم.", "verb"),
        v("had", "داشت", "We had a good time.", "اوقات خوبی داشتیم.", "verb"),
        v("stayed", "ماند", "I stayed home.", "در خانه ماندم.", "verb"),
        v("bought", "خرید", "She bought a new dress.", "او یک لباس جدید خرید.", "verb"),
        v("made", "درست کرد", "He made dinner.", "او شام درست کرد.", "verb"),
        v("took", "گرفت / برد", "I took a taxi.", "تاکسی گرفتم.", "verb"),
        v("came", "آمد", "She came late.", "او دیر آمد.", "verb"),
        v("left", "ترک کرد / رفت", "We left at eight.", "ساعت هشت رفتیم.", "verb")
    ),
    listOf(
        GrammarSection(
            "Was / Were",
            "Use 'was' with I/he/she/it and 'were' with you/we/they: I was tired. They were at home."
        ),
        GrammarSection(
            "Simple past regular verbs",
            "Many regular verbs form the past with -ed: watched, visited, played, stayed."
        ),
        GrammarSection(
            "Common irregular verbs",
            "Learn useful forms: go/went, eat/ate, see/saw, have/had, buy/bought, make/made, take/took, come/came, leave/left."
        ),
        GrammarSection(
            "Did questions and negatives",
            "Use 'did' for questions and 'didn't' for negatives + base verb: Did you go? I didn't go."
        )
    ),
    listOf(
        d("A", "What did you do yesterday?", "دیروز چه کار کردی؟"),
        d("B", "I visited my aunt in the morning.", "صبح به دیدن خاله‌ام رفتم."),
        d("A", "Did you go anywhere after that?", "بعد از آن جایی رفتی؟"),
        d("B", "Yes. We went to a café downtown.", "بله. به یک کافه در مرکز شهر رفتیم."),
        d("A", "What did you have?", "چه چیزی خوردید؟"),
        d("B", "I had coffee and a sandwich.", "قهوه و ساندویچ خوردم."),
        d("A", "Was it good?", "خوب بود؟"),
        d("B", "Yes, it was great. Then we walked in the park.", "بله، عالی بود. بعد در پارک قدم زدیم."),
        d("A", "What time did you go home?", "چه ساعتی به خانه رفتی؟"),
        d("B", "We went home at nine.", "ساعت نه به خانه رفتیم."),
        d("A", "Did you see anyone else?", "کسی دیگر را دیدی؟"),
        d("B", "Yes, I saw my old friend Sara at the café.", "بله، دوست قدیمی‌ام سارا را در کافه دیدم."),
        d("A", "How nice! Did you talk for a long time?", "چقدر خوب! مدت زیادی صحبت کردید؟"),
        d("B", "Yes, we talked for about an hour.", "بله، حدود یک ساعت صحبت کردیم."),
        d("A", "What did she say?", "او چه گفت؟"),
        d("B", "She said she's getting married next month!", "گفت ماه آینده ازدواج می‌کند!"),
        d("A", "Wow, that's big news!", "واو، این خبر بزرگی است!"),
        d("B", "Yes, I was very surprised.", "بله، خیلی تعجب کردم."),
        d("A", "Did she invite you?", "تو را دعوت کرد؟"),
        d("B", "Yes, she did. The wedding is in June.", "بله. عروسی در ژوئن است."),
        d("A", "That sounds wonderful.", "فوق‌العاده به نظر می‌رسد."),
        d("B", "Yes, I'm very happy for her.", "بله، برایش خیلی خوشحالم."),
        d("A", "Thanks for sharing. Have a nice day!", "ممنون که گفتی. روز خوبی داشته باشی!"),
        d("B", "You too!", "تو هم!")
    ),
    listOf(
        q("Yesterday I ___ to the park.", listOf("go", "went", "going", "goes"), 1),
        q("She ___ TV last night.", listOf("watch", "watches", "watched", "watching"), 2),
        q("___ you go out yesterday?", listOf("Did", "Do", "Are", "Were"), 0),
        q("I ___ at home yesterday.", listOf("was", "were", "am", "be"), 0),
        q("Where did B go after visiting the aunt?", listOf("to the park", "to a café downtown", "home", "to a restaurant"), 1),
        q("Who did B see at the café?", listOf("Sara", "Lina", "Emma", "Daniel"), 0),
        q("What news did Sara share?", listOf("she's moving", "she's getting married", "she has a new job", "she's pregnant"), 1),
        q("What time did B go home?", listOf("at 7:00", "at 8:00", "at 9:00", "at 10:00"), 2)
    ),
    idioms = listOf(
        IdiomExpression("Big news", "خبر بزرگ", "That's big news!", "این خبر بزرگی است!"),
        IdiomExpression("For a long time", "مدت زیادی", "Did you talk for a long time?", "مدت زیادی صحبت کردید؟"),
        IdiomExpression("Thanks for sharing", "ممنون که گفتی", "Thanks for sharing. Have a nice day!", "ممنون که گفتی. روز خوبی داشته باشی!")
    ),
    phrasal = listOf(
        PhrasalVerb("go home", "به خانه رفتن", "return home",
            "We went home at nine.", "ساعت نه به خانه رفتیم.", "Yes"),
        PhrasalVerb("walk around", "قدم زدن", "stroll around",
            "We walked around the park.", "در پارک قدم زدیم.", "No")
    ),
    pronunciation = listOf(
        PronunciationTip("-ed endings", "The -ed ending has three sounds: /t/ (watched), /d/ (played), /ɪd/ (visited)."),
        PronunciationTip("Did reduction", "In questions, 'did you' is often reduced to /dɪdʒə/: Did you go? → /dɪdʒə goʊ/")
    ),
    culture = listOf(
        CulturalNote("Talking about yesterday",
            "Simple past questions are common in casual conversations about recent experiences.")
    ),
    mistakes = listOf(
        CommonMistake("Did you went?", "Did you go?", "After 'did', use the base form of the verb."),
        CommonMistake("I didn't went.", "I didn't go.", "After 'didn't', use the base form of the verb.")
    ),
    comprehension = listOf(
        ComprehensionQuestion("What did B do yesterday morning?", "Visited an aunt."),
        ComprehensionQuestion("What important news did Sara share?", "She is getting married next month, in June.")
    ),
    speaking = listOf(
        SpeakingTask("Tell a partner three things you did yesterday.",
            "سه کاری را که دیروز انجام دادی تعریف کن.",
            "I went... / I watched... / I had..."),
        SpeakingTask("Ask a partner about their weekend.",
            "از یک دوست درباره آخر هفته‌اش بپرس.",
            "Did you...? / What did you do? / Where did you go?")
    ),
    writing = listOf(
        WritingTask("Write about yesterday.",
            "درباره روز گذشته‌ات بنویس.",
            130, "Use at least five past-tense verbs and include one question in the past.")
    )
)
    // ═══════════════════════════════════════════════════════════
    // LESSON 12 — Appearance and Health | ظاهر و سلامتی
    // ═══════════════════════════════════════════════════════════
    private fun lesson12() = base(
        12, "Appearance and Health", "ظاهر و سلامتی",
        listOf(
            "Describe people's appearance",
            "Talk about basic health problems",
            "Use have/has for symptoms",
            "Give simple advice with should",
            "Show concern for others"
        ),
        listOf(
            v("tall", "قدبلند", "He is tall.", "او قدبلند است.", "adjective"),
            v("short", "کوتاه قد", "She is short.", "او کوتاه قد است.", "adjective"),
            v("young", "جوان", "He looks young.", "او جوان به نظر می‌رسد.", "adjective"),
            v("old", "پیر / مسن", "My grandfather is old.", "پدربزرگم مسن است.", "adjective"),
            v("hair", "مو", "She has long hair.", "او موهای بلندی دارد."),
            v("eyes", "چشم‌ها", "He has brown eyes.", "او چشم‌های قهوه‌ای دارد."),
            v("headache", "سردرد", "I have a headache.", "سردرد دارم."),
            v("cough", "سرفه", "He has a cough.", "او سرفه دارد."),
            v("fever", "تب", "She has a fever.", "او تب دارد."),
            v("tired", "خسته", "I'm tired today.", "امروز خسته‌ام.", "adjective"),
            v("healthy", "سالم", "She is healthy.", "او سالم است.", "adjective"),
            v("sick", "بیمار", "I feel sick.", "احساس بیماری می‌کنم.", "adjective"),
            v("rest", "استراحت کردن", "You should rest.", "باید استراحت کنی.", "verb"),
            v("medicine", "دارو", "Take this medicine.", "این دارو را بخور."),
            v("doctor", "پزشک", "You should see a doctor.", "باید به پزشک مراجعه کنی.")
        ),
        listOf(
            GrammarSection(
                "Have / Has for symptoms",
                "Use I have, he has, and she has for common symptoms: I have a headache. She has a fever."
            ),
            GrammarSection(
                "Be + adjective for appearance",
                "Use be with adjectives: I'm tired. He's tall. She's young."
            ),
            GrammarSection(
                "Should for advice",
                "Use 'should' + base verb for advice: You should rest. You shouldn't work today."
            ),
            GrammarSection(
                "Questions about health",
                "What's wrong? Are you okay? Do you have a fever? How do you feel?"
            )
        ),
        listOf(
            d("A", "You look tired. Are you okay?", "خسته به نظر می‌رسی. خوبی؟"),
            d("B", "Not really. I have a headache.", "نه واقعاً. سردرد دارم."),
            d("A", "I'm sorry to hear that. Do you have a cough too?", "متأسفم. سرفه هم داری؟"),
            d("B", "No, I don't. Just a headache and a fever.", "نه. فقط سردرد و تب."),
            d("A", "You should go home and rest.", "باید به خانه بروی و استراحت کنی."),
            d("B", "I can't. I have a meeting at three.", "نمی‌توانم. ساعت سه جلسه دارم."),
            d("A", "You should take some medicine and drink water.", "باید کمی دارو بخوری و آب بنوشی."),
            d("B", "Good idea. Do you have any medicine?", "فکر خوبی است. دارو داری؟"),
            d("A", "Yes, I do. Here you go.", "بله. بفرما."),
            d("B", "Thanks. By the way, your brother is very tall.", "ممنون. راستی، برادرت خیلی قدبلند است."),
            d("A", "Yes, he is. He has brown eyes, too.", "بله. چشم‌های قهوه‌ای هم دارد."),
            d("B", "Does he play basketball?", "بسکتبال بازی می‌کند؟"),
            d("A", "Yes, he does. He's very athletic.", "بله. خیلی ورزشکار است."),
            d("B", "That's great. My sister is short but very athletic too.", "عالی. خواهر من کوتاه قد است ولی خیلی ورزشکار."),
            d("A", "Really? What does she play?", "واقعاً؟ چه بازی می‌کند؟"),
            d("B", "She plays tennis. She's very good.", "تنیس بازی می‌کند. خیلی خوب است."),
            d("A", "That's nice. Well, you should go home now.", "خوبه. خب، باید الان به خانه بروی."),
            d("B", "You're right. Thanks for the medicine.", "حق داری. ممنون برای دارو."),
            d("A", "You're welcome. Feel better soon!", "خواهش می‌کنم. زود خوب شو!"),
            d("B", "Thanks. See you tomorrow.", "ممنون. فردا می‌بینمت."),
            d("A", "See you. Take care!", "می‌بینمت. مراقب خودت باش!")
        ),
        listOf(
            q("I have a ___.", listOf("headache", "tall", "young", "eyes"), 0),
            q("He ___ brown eyes.", listOf("have", "has", "is", "are"), 1),
            q("You look ___.", listOf("tired", "headache", "eyes", "cough"), 0),
            q("For simple advice: You ___ rest.", listOf("should", "are", "has", "do"), 0),
            q("What symptoms does B have?", listOf("cough and fever", "headache and fever", "cough and headache", "just a headache"), 1),
            q("What does A give to B?", listOf("water", "medicine", "food", "a book"), 1),
            q("How does A describe their brother?", listOf("short and shy", "tall with brown eyes", "young and funny", "old and quiet"), 1),
            q("What sport does B's sister play?", listOf("soccer", "basketball", "tennis", "swimming"), 2)
        ),
        idioms = listOf(
            IdiomExpression("I'm sorry to hear that", "متأسفم", "I'm sorry to hear that.", "متأسفم."),
            IdiomExpression("Here you go", "بفرما", "Here you go. — Thanks.", "بفرما. — ممنون."),
            IdiomExpression("Feel better soon", "زود خوب شو", "Feel better soon!", "زود خوب شو!"),
            IdiomExpression("Take care", "مراقب خودت باش", "See you. Take care!", "می‌بینمت. مراقب خودت باش!")
        ),
        phrasal = listOf(
            PhrasalVerb("look like", "به نظر رسیدن", "appear similar to",
                "He looks like his father.", "او شبیه پدرش است.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Health words with /θ/", "Practice the /θ/ sound: healthy, headache, thank you."),
            PronunciationTip("Rising intonation for concern", "Are you okay? ↗ (rising, showing concern)")
        ),
        culture = listOf(
            CulturalNote("Showing concern",
                "'You look tired. Are you okay?' is a common friendly way to show concern. It's polite to say 'I'm sorry to hear that' when someone is sick.")
        ),
        mistakes = listOf(
            CommonMistake("I have headache.", "I have a headache.", "Use 'a' before 'headache'."),
            CommonMistake("You should to rest.", "You should rest.", "After 'should', use the base verb without 'to'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What symptoms does B have?", "A headache and a fever."),
            ComprehensionQuestion("What advice does A give B?", "Go home, rest, take medicine, and drink water.")
        ),
        speaking = listOf(
            SpeakingTask("Describe someone's appearance using three adjectives and two details.",
                "ظاهر یک نفر را با سه صفت و دو جزئیات توصیف کن.",
                "He/She is... / has... / looks..."),
            SpeakingTask("Practice a short health conversation.",
                "یک گفت‌وگوی کوتاه درباره حال جسمی تمرین کن.",
                "What's wrong? / I have... / You should...")
        ),
        writing = listOf(
            WritingTask("Write a short dialogue about feeling tired.",
                "یک گفت‌وگوی کوتاه درباره خستگی بنویس.",
                120, "Include a symptom and two pieces of advice.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 13 — Abilities and Requests | توانایی‌ها و درخواست‌ها
    // ═══════════════════════════════════════════════════════════
    private fun lesson13() = base(
        13, "Abilities and Requests", "توانایی‌ها و درخواست‌ها",
        listOf(
            "Talk about abilities with can/can't",
            "Make polite requests",
            "Ask for help",
            "Give simple permission",
            "Respond to requests politely"
        ),
        listOf(
            v("can", "توانستن", "I can swim.", "می‌توانم شنا کنم.", "modal"),
            v("can't", "نمی‌توانستن", "I can't drive.", "نمی‌توانم رانندگی کنم.", "modal"),
            v("swim", "شنا کردن", "Can you swim?", "می‌توانی شنا کنی؟", "verb"),
            v("drive", "رانندگی کردن", "She can drive.", "او می‌تواند رانندگی کند.", "verb"),
            v("cook", "آشپزی کردن", "I can cook.", "می‌توانم آشپزی کنم.", "verb"),
            v("help", "کمک کردن", "Can you help me?", "می‌توانی کمکم کنی؟", "verb"),
            v("open", "باز کردن", "Can you open the door?", "می‌توانی در را باز کنی؟", "verb"),
            v("carry", "حمل کردن", "Can you carry this box?", "می‌توانی این جعبه را حمل کنی؟", "verb"),
            v("repeat", "تکرار کردن", "Can you repeat that?", "می‌توانی آن را تکرار کنی؟", "verb"),
            v("understand", "متوجه شدن", "I don't understand.", "متوجه نمی‌شوم.", "verb"),
            v("borrow", "قرض گرفتن", "Can I borrow your pen?", "می‌توانم خودکارت را قرض بگیرم؟", "verb"),
            v("lend", "قرض دادن", "Can you lend me a pen?", "می‌توانی یک خودکار به من قرض بدهی؟", "verb"),
            v("permission", "اجازه", "May I have your permission?", "می‌توانم اجازه بگیرم؟"),
            v("polite", "مؤدب", "It's polite to say please.", "مؤدبانه است که لطفاً بگویی.", "adjective"),
            v("certainly", "حتماً", "Certainly, I can help.", "حتماً، می‌توانم کمک کنم.", "adverb")
        ),
        listOf(
            GrammarSection(
                "Can for ability",
                "Use 'can' + base verb: I can swim. She can cook. They can drive."
            ),
            GrammarSection(
                "Can for requests",
                "Use 'Can you...?' for simple polite requests: Can you help me? Can you open the door?"
            ),
            GrammarSection(
                "Can't for inability",
                "Use 'can't' + base verb to say you are unable to do something: I can't drive at night."
            ),
            GrammarSection(
                "May I / Could I for polite requests",
                "Use 'May I...?' or 'Could I...?' for very polite requests: May I borrow your pen? Could I ask a question?"
            )
        ),
        listOf(
            d("A", "Excuse me, can you help me with this box?", "ببخشید، می‌توانی در مورد این جعبه کمکم کنی؟"),
            d("B", "Sure. What do you need?", "حتماً. چه کمکی لازم داری؟"),
            d("A", "Can you carry it to the door?", "می‌توانی آن را تا در ببری؟"),
            d("B", "Yes, I can. It's not very heavy.", "بله، می‌توانم. خیلی سنگین نیست."),
            d("A", "Thanks a lot. You're very kind.", "خیلی ممنون. خیلی مهربانی."),
            d("B", "You're welcome. By the way, can you drive?", "خواهش می‌کنم. راستی، می‌توانی رانندگی کنی؟"),
            d("A", "Yes, I can, but I can't drive at night.", "بله، ولی شب نمی‌توانم رانندگی کنم."),
            d("B", "Really? Why not?", "واقعاً؟ چرا نه؟"),
            d("A", "I don't see very well at night.", "شب خوب نمی‌بینم."),
            d("B", "I understand. Can you swim?", "می‌فهمم. می‌توانی شنا کنی؟"),
            d("A", "Yes, I can. I swim every weekend.", "بله. هر آخر هفته شنا می‌کنم."),
            d("B", "That's great. I can't swim very well.", "عالی. من خوب نمی‌توانم شنا کنم."),
            d("A", "Maybe I can teach you sometime.", "شاید بتوانم یک وقت یادت بدهم."),
            d("B", "That would be nice. Oh, can you also cook?", "خوب می‌شود. اوه، آشپزی هم می‌توانی؟"),
            d("A", "Yes, I can. I make great pasta.", "بله. پاستای عالی درست می‌کنم."),
            d("B", "Nice! Can I ask you one more favor?", "عالی! می‌توانم یک خواهش دیگر بکنم؟"),
            d("A", "Of course. What is it?", "حتماً. چیه؟"),
            d("B", "Can I borrow your pen for a minute?", "می‌توانم یک دقیقه خودکارت را قرض بگیرم؟"),
            d("A", "Sure. Here you go.", "حتماً. بفرما."),
            d("B", "Thank you. I'll give it back right away.", "ممنون. همین الان برمی‌گردانم."),
            d("A", "No problem. Take your time.", "مشکلی نیست. عجله نکن."),
            d("B", "You're very helpful. Thanks again!", "خیلی کمک‌کننده‌ای. باز هم ممنون!"),
            d("A", "Anytime!", "هر وقت!")
        ),
        listOf(
            q("I ___ swim.", listOf("can", "am", "do", "have"), 0),
            q("___ you help me?", listOf("Are", "Can", "Do", "Have"), 1),
            q("After 'can', use...", listOf("to + verb", "verb-ing", "base verb", "past verb"), 2),
            q("I can't drive means...", listOf("I drive well", "I am not able to drive", "I want to drive", "I drove yesterday"), 1),
            q("Why can't A drive at night?", listOf("too tired", "doesn't see well", "no car", "too young"), 1),
            q("What can A cook well?", listOf("rice", "pasta", "chicken", "soup"), 1),
            q("What does B borrow from A?", listOf("a book", "a pen", "a phone", "money"), 1),
            q("Which is more polite?", listOf("Give me a pen.", "May I borrow your pen?", "I want your pen.", "Pen!"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Sure", "حتماً", "Can you help me? Sure.", "می‌توانی کمکم کنی؟ حتماً."),
            IdiomExpression("Of course", "البته / حتماً", "Can you repeat that? Of course.", "می‌توانی تکرار کنی؟ حتماً."),
            IdiomExpression("Take your time", "عجله نکن", "Take your time. No problem.", "عجله نکن. مشکلی نیست."),
            IdiomExpression("Anytime", "هر وقت", "Thanks! Anytime!", "ممنون! هر وقت!")
        ),
        phrasal = listOf(
            PhrasalVerb("give back", "برگرداندن", "return something",
                "I'll give it back right away.", "همین الان برمی‌گردانم.", "No"),
            PhrasalVerb("ask a favor", "خواهش کردن", "request help",
                "Can I ask you one more favor?", "می‌توانم یک خواهش دیگر بکنم؟", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Can / Can't", "In short answers, make the difference clear: Yes, I can. /kæn/ — No, I can't. /kænt/"),
            PronunciationTip("Polite intonation", "Polite requests often have rising intonation: Can you help me? ↗")
        ),
        culture = listOf(
            CulturalNote("Polite requests",
                "Adding 'please' can make a simple request sound more polite: Can you help me, please? 'May I...?' is more formal than 'Can I...?'")
        ),
        mistakes = listOf(
            CommonMistake("Can you to help me?", "Can you help me?", "After 'can', use the base verb without 'to'."),
            CommonMistake("I can swimming.", "I can swim.", "After 'can', use the base verb, not -ing.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why can't A drive at night?", "Because A doesn't see very well at night."),
            ComprehensionQuestion("What two abilities does A have?", "A can drive (but not at night) and can swim.")
        ),
        speaking = listOf(
            SpeakingTask("Tell a partner three things you can do and two things you can't do.",
                "سه کاری که می‌توانی و دو کاری که نمی‌توانی انجام دهی بگو.",
                "I can... / I can't..."),
            SpeakingTask("Practice asking for help politely.",
                "درخواست کمک مؤدبانه را تمرین کن.",
                "Can you..., please? / May I...? / Could you...?")
        ),
        writing = listOf(
            WritingTask("Write a short list of abilities and requests.",
                "یک متن کوتاه درباره توانایی‌ها و درخواست‌هایت بنویس.",
                120, "Use can, can't, and at least three polite requests.")
        )
    )

    // ═══════════════════════════════════════════════════════════
    // LESSON 14 — Life Events and Plans | رویدادهای زندگی و برنامه‌ها
    // ═══════════════════════════════════════════════════════════
    private fun lesson14() = base(
        14, "Life Events and Plans", "رویدادهای زندگی و برنامه‌ها",
        listOf(
            "Talk about important life events",
            "Describe past and future plans",
            "Use simple past and future expressions together",
            "Talk about goals and dreams",
            "Give reasons with because"
        ),
        listOf(
            v("graduate", "فارغ‌التحصیل شدن", "I graduated last year.", "سال گذشته فارغ‌التحصیل شدم.", "verb"),
            v("start", "شروع کردن", "I started a new job.", "یک شغل جدید شروع کردم.", "verb"),
            v("move", "اسباب‌کشی کردن", "We moved to a new city.", "به شهر جدیدی نقل مکان کردیم.", "verb"),
            v("learn", "یاد گرفتن", "I want to learn English.", "می‌خواهم انگلیسی یاد بگیرم.", "verb"),
            v("travel", "سفر کردن", "I'd like to travel next year.", "دوست دارم سال آینده سفر کنم.", "verb"),
            v("goal", "هدف", "My goal is to speak English well.", "هدفم این است که خوب انگلیسی صحبت کنم."),
            v("dream", "رویا", "My dream is to study abroad.", "رویای من تحصیل در خارج است."),
            v("future", "آینده", "What are your plans for the future?", "برنامه‌هایت برای آینده چیست؟"),
            v("next year", "سال آینده", "I'm going to study next year.", "سال آینده می‌خواهم درس بخوانم."),
            v("plan", "برنامه", "I have a plan for next year.", "برای سال آینده برنامه دارم."),
            v("abroad", "خارج از کشور", "I want to study abroad.", "می‌خواهم در خارج درس بخوانم.", "adverb"),
            v("opportunity", "فرصت", "This is a great opportunity.", "این فرصت خوبی است."),
            v("achieve", "به دست آوردن", "I want to achieve my goals.", "می‌خواهم به اهدافم برسم.", "verb"),
            v("improve", "بهتر کردن", "I want to improve my English.", "می‌خواهم انگلیسی‌ام را بهتر کنم.", "verb"),
            v("excited", "هیجان‌زده", "I'm excited about the future.", "درباره آینده هیجان‌زده‌ام.", "adjective")
        ),
        listOf(
            GrammarSection(
                "Past and future together",
                "Use past forms for completed events and going to/will for future plans: I graduated last year. I'm going to study next year."
            ),
            GrammarSection(
                "Want / Would like + to",
                "Use 'want to' and 'would like to' before a base verb: I want to travel. I'd like to study abroad."
            ),
            GrammarSection(
                "Because for reasons",
                "Use 'because' to give a reason: I want to study because I enjoy learning."
            ),
            GrammarSection(
                "Hope + will / Hope + present",
                "Use 'hope' for future wishes: I hope it works out. I hope I get the job."
            )
        ),
        listOf(
            d("A", "What did you do after school?", "بعد از مدرسه چه کار کردی؟"),
            d("B", "I started working at a small company.", "در یک شرکت کوچک شروع به کار کردم."),
            d("A", "That's great. What are your plans now?", "عالیه. حالا برنامه‌هایت چیست؟"),
            d("B", "I'm going to improve my English.", "می‌خواهم انگلیسی‌ام را بهتر کنم."),
            d("A", "Why do you want to improve it?", "چرا می‌خواهی بهترش کنی؟"),
            d("B", "Because I want to travel and meet new people.", "چون می‌خواهم سفر کنم و افراد جدیدی ببینم."),
            d("A", "That's a great reason. What's your goal for next year?", "دلیل خوبی است. هدفت برای سال آینده چیست؟"),
            d("B", "I'd like to take an English course abroad.", "دوست دارم در یک دوره انگلیسی در خارج شرکت کنم."),
            d("A", "Where would you like to go?", "کجا دوست داری بروی؟"),
            d("B", "Maybe Canada or England. I'm not sure yet.", "شاید کانادا یا انگلستان. هنوز مطمئن نیستم."),
            d("A", "That sounds exciting!", "هیجان‌انگیز به نظر می‌رسد!"),
            d("B", "Yes, I'm very excited. But also a little nervous.", "بله، خیلی هیجان‌زده‌ام. ولی کمی هم مضطرب."),
            d("A", "That's normal. What about your job?", "این طبیعی است. کارت چطور؟"),
            d("B", "I'm going to leave it next year before I go.", "سال آینده قبل از رفتن ترکش می‌کنم."),
            d("A", "Do you have enough money saved?", "پول کافی پس‌انداز کرده‌ای؟"),
            d("B", "Almost. I've been saving for two years.", "تقریباً. دو سال است پس‌انداز می‌کنم."),
            d("A", "That's smart. I hope it works out.", "هوشمندانه است. امیدوارم خوب پیش برود."),
            d("B", "Thanks. What about you? What are your goals?", "ممنون. تو چطور؟ اهدافت چیست؟"),
            d("A", "I want to start my own business.", "می‌خواهم کسب‌وکار خودم را شروع کنم."),
            d("B", "Wow, that's a big dream!", "واو، رویای بزرگی است!"),
            d("A", "Yes, but I'm working toward it every day.", "بله، ولی هر روز به سمتش کار می‌کنم."),
            d("B", "That's inspiring. I hope we both achieve our dreams.", "الهام‌بخش است. امیدوارم هر دو به رویاهایمان برسیم."),
            d("A", "Me too. Let's do our best!", "من هم. بیایید بهترین تلاشمان را بکنیم!")
        ),
        listOf(
            q("I ___ a new job last year.", listOf("start", "started", "starting", "am start"), 1),
            q("I'm ___ improve my English.", listOf("going to", "go", "going", "to going"), 0),
            q("I want ___ travel.", listOf("to", "for", "at", "on"), 0),
            q("Why? — ___ I want to learn.", listOf("But", "Because", "And", "Or"), 1),
            q("What did B do after school?", listOf("went to university", "started a job", "traveled", "moved abroad"), 1),
            q("Where does B want to study?", listOf("Australia or America", "Canada or England", "France or Germany", "Japan or China"), 1),
            q("What is A's dream?", listOf("travel abroad", "start a business", "learn English", "buy a house"), 1),
            q("How long has B been saving money?", listOf("six months", "one year", "two years", "three years"), 2)
        ),
        idioms = listOf(
            IdiomExpression("Work out", "خوب پیش رفتن", "I hope it works out.", "امیدوارم خوب پیش برود."),
            IdiomExpression("Work toward", "به سمت ... کار کردن", "I'm working toward it every day.", "هر روز به سمتش کار می‌کنم."),
            IdiomExpression("Do our best", "بهترین تلاشمان را کردن", "Let's do our best!", "بیایید بهترین تلاشمان را بکنیم!"),
            IdiomExpression("That sounds exciting", "هیجان‌انگیز به نظر می‌رسد", "That sounds exciting!", "هیجان‌انگیز به نظر می‌رسد!")
        ),
        phrasal = listOf(
            PhrasalVerb("work out", "خوب پیش رفتن", "end successfully",
                "I hope everything works out.", "امیدوارم همه چیز خوب پیش برود.", "No"),
            PhrasalVerb("work toward", "به سمت ... کار کردن", "work in the direction of",
                "I'm working toward my goal.", "به سمت هدفم کار می‌کنم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Future rhythm", "Stress the main future verb: I'm GOing to study."),
            PronunciationTip("Linking in 'want to'", "In natural speech, 'want to' is often reduced to 'wanna': I wanna travel. (But learn the full form first.)")
        ),
        culture = listOf(
            CulturalNote("Talking about goals",
                "Simple questions about plans and goals are common when people get to know each other. 'What are your plans for the future?' is a natural conversation starter.")
        ),
        mistakes = listOf(
            CommonMistake("I want travel.", "I want to travel.", "Use 'to' before the base verb after 'want'."),
            CommonMistake("I'm going study.", "I'm going to study.", "Use 'going to + base verb'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did B start after school?", "A job at a small company."),
            ComprehensionQuestion("What is B's goal and why?", "To take an English course abroad because B wants to travel and meet new people.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about one past event and two future plans.",
                "درباره یک رویداد گذشته و دو برنامه آینده صحبت کن.",
                "Last year... / I'm going to... / I'd like to..."),
            SpeakingTask("Ask a partner about a future goal.",
                "درباره هدف آینده یک دوست سؤال کن.",
                "What's your goal? / Why? / How will you achieve it?")
        ),
        writing = listOf(
            WritingTask("Write about one important past event and your plans for next year.",
                "درباره یک رویداد مهم گذشته و برنامه‌هایت برای سال آینده بنویس.",
                150, "Use past verbs, going to/would like to, and because.")
        )
    )
}