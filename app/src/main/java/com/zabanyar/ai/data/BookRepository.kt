package com.zabanyar.ai.data

enum class BookCategory(
    val displayName: String,
    val persianName: String,
    val emoji: String,
    val color: Long
) {
    CONVERSATION("Conversation", "مکالمه", "💬", 0xFF6200EE),
    GRAMMAR("Grammar", "گرامر", "📝", 0xFF00695C),
    VOCABULARY("Vocabulary", "واژگان", "📚", 0xFFE91E63),
    IELTS("IELTS & TOEFL", "آیلتس و تافل", "🎯", 0xFFF57C00),
    LISTENING("Listening", "مهارت شنیداری", "🎧", 0xFF0288D1),
    READING("Reading", "مهارت خواندن", "📖", 0xFF7B1FA2),
    STORY("Story", "داستان", "📕", 0xFFC62828),
    IDIOMS("Idioms", "اصطلاحات", "💡", 0xFFFFA000)
}

data class Book(
    val id: String,
    val title: String,
    val titlePersian: String,
    val author: String,
    val category: BookCategory,
    val level: String,
    val levelEmoji: String,
    val totalChapters: Int,
    val gradientStart: Long,
    val gradientEnd: Long,
    val chapterTitles: List<String> = emptyList()
)

object BookRepository {

    fun getAllBooks(): List<Book> = listOf(

        // ==================== 💬 مکالمه ====================
        Book(
            id = "top_notch_1", title = "Top Notch 1", titlePersian = "تاپ ناچ ۱",
            author = "Joan Saslow", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 14,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFAB47BC,
            chapterTitles = listOf(
                "Names and Occupations", "About People", "Places and Things",
                "Family", "Events and Times", "Cities and Countries",
                "Clothes", "Daily Life", "Shopping", "Food",
                "Health", "Weekend Activities", "Home and Neighborhood", "Review"
            )
        ),
        Book(
            id = "top_notch_2", title = "Top Notch 2", titlePersian = "تاپ ناچ ۲",
            author = "Joan Saslow", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFF1565C0, gradientEnd = 0xFF42A5F5,
            chapterTitles = listOf(
                "Getting Acquainted", "Going Shopping", "Planning a Trip",
                "Food and Restaurants", "Around Town", "Shopping for Clothes",
                "Having Fun", "Health Matters", "Home and Away", "Getting Along"
            )
        ),
        Book(
            id = "top_notch_3", title = "Top Notch 3", titlePersian = "تاپ ناچ ۳",
            author = "Joan Saslow", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 10,
            gradientStart = 0xFFC62828, gradientEnd = 0xFFEF5350,
            chapterTitles = listOf(
                "Cultural Literacy", "Shopping and Consumerism", "Personal Care",
                "Modern Technology", "Holidays", "Eating Well",
                "Environment", "Education", "Jobs and Careers", "Life Changes"
            )
        ),
        Book(
            id = "four_corners_2", title = "Four Corners 2", titlePersian = "فور کورنرز ۲",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFFD32F2F, gradientEnd = 0xFFE57373
        ),
        Book(
            id = "four_corners_3", title = "Four Corners 3", titlePersian = "فور کورنرز ۳",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF00838F, gradientEnd = 0xFF4DD0E1
        ),
        Book(
            id = "american_english_2", title = "American English File 2", titlePersian = "آمریکن انگلیش فایل ۲",
            author = "Christina Latham", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFF1565C0, gradientEnd = 0xFF42A5F5
        ),
        Book(
            id = "american_english_3", title = "American English File 3", titlePersian = "آمریکن انگلیش فایل ۳",
            author = "Christina Latham", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFF2E7D32, gradientEnd = 0xFF66BB6A
        ),
        Book(
            id = "evolve_5", title = "Evolve 5", titlePersian = "ایوولو ۵",
            author = "Leslie Anne Hendra", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFFE65100, gradientEnd = 0xFFFFB74D
        ),
        Book(
            id = "evolve_6", title = "Evolve 6", titlePersian = "ایوولو ۶",
            author = "Ben Goldstein", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFF4527A0, gradientEnd = 0xFF7E57C2
        ),

        // ==================== 📝 گرامر ====================
        Book(
            id = "basic_grammar", title = "Basic Grammar in Use", titlePersian = "گرامر پایه",
            author = "Raymond Murphy", category = BookCategory.GRAMMAR,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 45,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF26A69A
        ),
        Book(
            id = "understanding_grammar", title = "Understanding English Grammar", titlePersian = "درک گرامر انگلیسی",
            author = "Betty Azar", category = BookCategory.GRAMMAR,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 30,
            gradientStart = 0xFF0277BD, gradientEnd = 0xFF4FC3F7
        ),
        Book(
            id = "advanced_grammar", title = "Advanced Grammar in Use", titlePersian = "گرامر پیشرفته",
            author = "Martin Hewings", category = BookCategory.GRAMMAR,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 31,
            gradientStart = 0xFF4527A0, gradientEnd = 0xFF7E57C2
        ),

        // ==================== 📚 واژگان ====================
        Book(
            id = "vocab_elementary", title = "Vocabulary in Use - Elementary", titlePersian = "واژگان پایه",
            author = "Michael McCarthy", category = BookCategory.VOCABULARY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 60,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF06292
        ),
        Book(
            id = "vocab_pre_int", title = "Vocabulary in Use - Pre-intermediate", titlePersian = "واژگان پیش‌متوسط",
            author = "Stuart Redman", category = BookCategory.VOCABULARY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 100,
            gradientStart = 0xFF00897B, gradientEnd = 0xFF4DB6AC
        ),
        Book(
            id = "vocab_intermediate", title = "Vocabulary in Use - Intermediate", titlePersian = "واژگان متوسط",
            author = "Stuart Redman", category = BookCategory.VOCABULARY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 100,
            gradientStart = 0xFF01579B, gradientEnd = 0xFF039BE5
        ),
        Book(
            id = "book_504", title = "504 Essential Words", titlePersian = "۵۰۴ واژه ضروری",
            author = "Murray Bromberg", category = BookCategory.VOCABULARY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 42,
            gradientStart = 0xFFFF6F00, gradientEnd = 0xFFFFB300
        ),
        Book(
            id = "book_4000", title = "4000 Essential Words", titlePersian = "۴۰۰۰ واژه ضروری",
            author = "Paul Nation", category = BookCategory.VOCABULARY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 30,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF9C27B0
        ),
        Book(
            id = "word_skills_inter", title = "Word Skills Intermediate", titlePersian = "مهارت واژگان متوسط",
            author = "Ruth Gairns", category = BookCategory.VOCABULARY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 20,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFAB47BC
        ),
        Book(
            id = "word_skills_adv", title = "Word Skills Advanced", titlePersian = "مهارت واژگان پیشرفته",
            author = "Ruth Gairns", category = BookCategory.VOCABULARY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 20,
            gradientStart = 0xFF01579B, gradientEnd = 0xFF039BE5
        ),

        // ==================== 🎯 آیلتس و تافل ====================
        Book(
            id = "ielts_16", title = "IELTS 16 General", titlePersian = "آیلتس ۱۶",
            author = "Cambridge", category = BookCategory.IELTS,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 4,
            gradientStart = 0xFF1A237E, gradientEnd = 0xFF3F51B5
        ),
        Book(
            id = "ielts_17", title = "IELTS 17 General", titlePersian = "آیلتس ۱۷",
            author = "Cambridge", category = BookCategory.IELTS,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 4,
            gradientStart = 0xFF283593, gradientEnd = 0xFF5C6BC0
        ),
        Book(
            id = "mindset_2", title = "Mindset for IELTS 2", titlePersian = "مایندست آیلتس ۲",
            author = "Cambridge English", category = BookCategory.IELTS,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 8,
            gradientStart = 0xFFAD1457, gradientEnd = 0xFFEC407A
        ),
        Book(
            id = "mindset_3", title = "Mindset for IELTS 3", titlePersian = "مایندست آیلتس ۳",
            author = "Cambridge English", category = BookCategory.IELTS,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 8,
            gradientStart = 0xFFD84315, gradientEnd = 0xFFFF8A65
        ),

        // ==================== 🎧 مهارت شنیداری ====================
        Book(
            id = "basic_tactics", title = "Basic Tactics for Listening", titlePersian = "تاکتیکس پایه",
            author = "Jack C. Richards", category = BookCategory.LISTENING,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 24,
            gradientStart = 0xFF827717, gradientEnd = 0xFFC0CA33
        ),
        Book(
            id = "developing_tactics", title = "Developing Tactics for Listening", titlePersian = "تاکتیکس پیشرفته",
            author = "Jack C. Richards", category = BookCategory.LISTENING,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 24,
            gradientStart = 0xFFC62828, gradientEnd = 0xFFEF5350
        ),
        Book(
            id = "listen_here", title = "Listen Here!", titlePersian = "گوش کن!",
            author = "Clare West", category = BookCategory.LISTENING,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 20,
            gradientStart = 0xFF33691E, gradientEnd = 0xFF8BC34A
        ),
        Book(
            id = "dynamic_listening", title = "Dynamic Listening & Speaking", titlePersian = "لیسنینگ و اسپیکینگ",
            author = "Byoung-man Jeon", category = BookCategory.LISTENING,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 16,
            gradientStart = 0xFFE65100, gradientEnd = 0xFFFFB74D
        ),
        Book(
            id = "tune_in_1", title = "Tune In 1", titlePersian = "تیون این ۱",
            author = "Jack C. Richards", category = BookCategory.LISTENING,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFF558B2F, gradientEnd = 0xFF9CCC65
        ),
        Book(
            id = "tune_in_2", title = "Tune In 2", titlePersian = "تیون این ۲",
            author = "Jack C. Richards", category = BookCategory.LISTENING,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFFE65100, gradientEnd = 0xFFFFB74D
        ),
        Book(
            id = "tune_in_3", title = "Tune In 3", titlePersian = "تیون این ۳",
            author = "Jack C. Richards", category = BookCategory.LISTENING,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF42A5F5
        ),

        // ==================== 📖 مهارت خواندن ====================
        Book(
            id = "inside_reading", title = "Inside Reading", titlePersian = "اینساید ریدینگ",
            author = "Arline Burgmeier", category = BookCategory.READING,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 20,
            gradientStart = 0xFFC2185B, gradientEnd = 0xFFF06292
        ),
        Book(
            id = "active_skills_1", title = "Active Skills for Reading 1", titlePersian = "مهارت خواندن ۱",
            author = "Neil Anderson", category = BookCategory.READING,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF7043
        ),
        Book(
            id = "active_skills_2", title = "Active Skills for Reading 2", titlePersian = "مهارت خواندن ۲",
            author = "Neil Anderson", category = BookCategory.READING,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF01579B, gradientEnd = 0xFF039BE5
        ),
        Book(
            id = "active_skills_3", title = "Active Skills for Reading 3", titlePersian = "مهارت خواندن ۳",
            author = "Neil Anderson", category = BookCategory.READING,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF4CAF50
        ),

        // ==================== 📕 داستان ====================
        Book(
            id = "gift_magi", title = "The Gift of the Magi", titlePersian = "هدیه مغان",
            author = "O. Henry", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 3,
            gradientStart = 0xFF880E4F, gradientEnd = 0xFFC2185B,
            chapterTitles = listOf("The Gift of the Magi", "The Last Leaf", "The Ransom of Red Chief")
        ),
        Book(
            id = "sleepy_hollow", title = "The Legend of Sleepy Hollow", titlePersian = "افسانه دره خواب‌آلود",
            author = "Washington Irving", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 6,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF78909C,
            chapterTitles = listOf("سوار بی سر", "ایکباد کرین", "کاترینا وان تاسل", "دعوت نامه", "روح دره خواب آلود", "سواری شبح")
        ),
        Book(
            id = "halloween_horror", title = "Halloween Horror", titlePersian = "وحشت هالووین",
            author = "Gina D.B. Clemen", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF9C27B0
        ),
        Book(
            id = "peter_pan", title = "Peter Pan", titlePersian = "پیتر پن",
            author = "J.M. Barrie", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 10,
            gradientStart = 0xFF006064, gradientEnd = 0xFF00BCD4
        ),
        Book(
            id = "alice_wonderland", title = "Alice in Wonderland", titlePersian = "آلیس در سرزمین عجایب",
            author = "Lewis Carroll", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFFBA68C8
        ),
        Book(
            id = "sherlock_holmes", title = "Sherlock Holmes", titlePersian = "شرلوک هلمز",
            author = "Arthur Conan Doyle", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFF1A237E, gradientEnd = 0xFF5C6BC0
        ),

        // ==================== 💡 اصطلاحات ====================
        Book(
            id = "everyday_exp_1", title = "Illustrated Everyday Expressions 1", titlePersian = "اصطلاحات روزمره ۱",
            author = "Casey Malarcher", category = BookCategory.IDIOMS,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 20,
            gradientStart = 0xFF33691E, gradientEnd = 0xFF8BC34A
        ),
        Book(
            id = "everyday_exp_2", title = "Illustrated Everyday Expressions 2", titlePersian = "اصطلاحات روزمره ۲",
            author = "Casey Malarcher", category = BookCategory.IDIOMS,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 20,
            gradientStart = 0xFF01579B, gradientEnd = 0xFF039BE5
        )
    )

    fun getBooksByCategory(category: BookCategory): List<Book> =
        getAllBooks().filter { it.category == category }

    fun getBooksByLevel(level: String): List<Book> =
        getAllBooks().filter { it.level == level }

    fun getBookById(id: String): Book? =
        getAllBooks().firstOrNull { it.id == id }

    fun getCountByCategory(category: BookCategory): Int =
        getAllBooks().count { it.category == category }
}