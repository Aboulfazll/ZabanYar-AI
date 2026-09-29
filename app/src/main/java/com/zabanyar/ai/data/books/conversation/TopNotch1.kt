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
        // ── واژگان اصلی ──
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
        // ── واژگان جدید ──
        v("dentist", "دندان‌پزشک", "I go to the dentist twice a year.", "سالی دو بار به دندان‌پزشک می‌روم."),
        v("lawyer", "وکیل", "My uncle is a lawyer.", "عمویم وکیل است."),
        v("waiter", "پیشخدمت", "The waiter brought us the menu.", "پیشخدمت منو را آورد."),
        v("chef", "سرآشپز", "The chef makes amazing pasta.", "سرآشپز پاستای عالی درست می‌کند."),
        v("nurse", "پرستار", "The nurse is very kind.", "پرستار خیلی مهربان است."),
        v("pilot", "خلبان", "Her father is a pilot.", "پدرش خلبان است."),
        v("engineer", "مهندس", "He's an engineer at a tech company.", "او مهندس یک شرکت فناوری است."),
        v("scientist", "دانشمند", "The scientist works in a lab.", "دانشمند در آزمایشگاه کار می‌کند."),
        // ── واژگان مکان ──
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
    // ── دیالوگ ۱: در محل کار ──
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
        PhrasalVerb(
            "work from", "از ... کار کردن", "work from a location",
            "I work from home.", "من از خانه کار می‌کنم.", "No"
        ),
        PhrasalVerb(
            "run into", "به کسی برخوردن", "meet by chance",
            "I ran into my old teacher yesterday.", "دیروز به معلم قدیمی‌ام برخوردم.", "Yes"
        )
    ),
    pronunciation = listOf(
        PronunciationTip("A / An", "Focus on the sound, not only the spelling: a banker, an architect, an athlete."),
        PronunciationTip("Question intonation", "Information questions usually end with falling intonation: What's your name? ↘"),
        PronunciationTip("Stress in occupations", "Stress the first syllable: DENtist, LAWyer, PIlot, NURSE."),
        PronunciationTip("Contractions", "I'm /aɪm/, he's /hiːz/, she's /ʃiːz/, they're /ðer/.")
    ),
    culture = listOf(
        CulturalNote(
            "Asking about work",
            "'What do you do?' is one of the most common polite questions when meeting someone new in English-speaking countries."
        ),
        CulturalNote(
            "Titles",
            "Mr. is for men, Mrs. for married women, Miss for unmarried women, and Ms. for any woman. 'Ms.' is the safest choice when unsure."
        ),
        CulturalNote(
            "Workplaces",
            "In English, we say 'work at' + place (a hospital, a school) and 'work in' + field (banking, education). We also 'work from home'."
        )
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
        SpeakingTask(
            "Introduce yourself to a partner.",
            "خودت را به یک دوست معرفی کن.",
            "I'm... / I'm from... / I'm a/an... / I work..."
        ),
        SpeakingTask(
            "Ask three people about their jobs.",
            "از سه نفر درباره شغلشان بپرس.",
            "What do you do? / Where do you work? / Do you enjoy it?"
        ),
        SpeakingTask(
            "Role-play a first meeting at a party.",
            "نقش‌بازی: اولین ملاقات در یک مهمانی.",
            "Hi, I'm... / What do you do? / Where are you from?"
        )
    ),
    writing = listOf(
        WritingTask(
            "Write a short self-introduction.",
            "یک معرفی کوتاه از خودت بنویس.",
            80,
            "Include name, nationality, occupation, and one extra detail."
        )
    )
)