package com.zabanyar.ai.data
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

        // ---------- Top Notch ----------
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

        // ---------- Four Corners (۵ کتاب) ----------
        Book(
            id = "four_corners_intro", title = "Four Corners Intro", titlePersian = "فور کورنرز مقدماتی",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            chapterTitles = listOf(
                "Hello!", "My Things", "My Family", "At Home",
                "Everyday Activities", "Food", "Shopping", "Clothes",
                "Around Town", "Weather", "Health", "Free Time"
            )
        ),
        Book(
            id = "four_corners_1", title = "Four Corners 1", titlePersian = "فور کورنرز ۱",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFFE65100, gradientEnd = 0xFFFFB74D,
            chapterTitles = listOf(
                "Welcome to Class", "Daily Activities", "People Around Us",
                "What Are You Wearing?", "Food and Drinks", "Places in Town",
                "Daily Routine", "Shopping Time", "Weather and Seasons",
                "Travel Plans", "Health and Body", "Free Time"
            )
        ),
        Book(
            id = "four_corners_2", title = "Four Corners 2", titlePersian = "فور کورنرز ۲",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFFD32F2F, gradientEnd = 0xFFE57373,
            chapterTitles = listOf(
                "Life Stories", "Hobbies and Interests", "At Home",
                "Food and Health", "Looking Back", "Traveling",
                "School Days", "Memories", "Plans and Dreams",
                "Work and Jobs", "Around the World", "The Future"
            )
        ),
        Book(
            id = "four_corners_3", title = "Four Corners 3", titlePersian = "فور کورنرز ۳",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF00838F, gradientEnd = 0xFF4DD0E1,
            chapterTitles = listOf(
                "New Friends", "Everyday Life", "Entertainment",
                "Getting Around", "Shopping Trends", "Food Culture",
                "Career Paths", "Travel Stories", "Health & Wellness",
                "Technology Today", "Cultural Differences", "Success Stories"
            )
        ),
        Book(
            id = "four_corners_4", title = "Four Corners 4", titlePersian = "فور کورنرز ۴",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF4DB6AC,
            chapterTitles = listOf(
                "Getting Along", "Personal Style", "Making Changes",
                "In the News", "Modern Life", "Around the World",
                "Education Today", "Career Goals", "Healthy Living",
                "Technology & Media", "Cultural Differences", "The Future"
            )
        ),

        // ---------- English File ----------
        Book(
            id = "english_file_1", title = "English File 1", titlePersian = "اینگلیش فایل ۱",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF4FC3F7,
            chapterTitles = listOf(
                "First Day at School", "My World", "All About Me",
                "Family and Friends", "How We Live", "Things and Places",
                "My Time", "Food and Drink", "Free Time", "Past Events", "Work and Study", "Future Plans"
            )
        ),
        Book(
            id = "english_file_2", title = "English File 2", titlePersian = "اینگلیش فایل ۲",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFF1976D2, gradientEnd = 0xFF64B5F6,
            chapterTitles = listOf(
                "Where Are You From?", "Everyday Life", "Past Events",
                "Clothes and Fashion", "Food and Restaurants", "Around Town",
                "Holidays", "Health Issues", "Relationships", "Education", "Travel Plans", "Future Plans"
            )
        ),
        Book(
            id = "english_file_3", title = "English File 3", titlePersian = "اینگلیش فایل ۳",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF512DA8, gradientEnd = 0xFF9575CD,
            chapterTitles = listOf(
                "Fashion & Shopping", "Modern Life", "Personal Stories",
                "Environmental Issues", "Art and Music", "Books and Literature",
                "Career Development", "Travel Experiences", "Health & Fitness",
                "Technology & Innovation", "Society & Culture", "Future Goals"
            )
        ),
        Book(
            id = "english_file_4", title = "English File 4", titlePersian = "اینگلیش فایل ۴",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFBA68C8,
            chapterTitles = listOf(
                "Communication", "Modern Life", "Money Matters",
                "Adventure Travel", "Food & Culture", "Health & Lifestyle",
                "Education Systems", "Relationships", "Work-Life Balance",
                "Environment", "Politics & Society", "Global Issues"
            )
        ),
        Book(
            id = "english_file_5", title = "English File 5", titlePersian = "اینگلیش فایل ۵",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFFB71C1C, gradientEnd = 0xFFEF9A9A,
            chapterTitles = listOf(
                "Cultural Awareness", "Urban Stories", "Ethics & Morality",
                "Innovation & Change", "Global Economy", "Arts & Society",
                "Media & Technology", "Political Discourse", "Philosophy",
                "Science & Future", "Environmental Ethics", "Human Nature"
            )
        ),

        // ---------- Evolve ----------
        Book(
            id = "evolve_1", title = "Evolve 1", titlePersian = "ایوولو ۱",
            author = "Leslie Anne Hendra", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF81C784,
            chapterTitles = listOf(
                "Nice to Meet You", "Everyday Life", "Family Ties",
                "Free Time", "At Home", "Food and Drinks",
                "Shopping", "Travel", "Health Basics",
                "Work and Study", "People and Places", "Future Plans"
            )
        ),
        Book(
            id = "evolve_2", title = "Evolve 2", titlePersian = "ایوولو ۲",
            author = "Leslie Anne Hendra", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF4DB6AC,
            chapterTitles = listOf(
                "New Experiences", "Daily Routines", "Relationships",
                "Entertainment", "Food & Health", "City Life",
                "Sports & Fitness", "Travel Stories", "Memories",
                "Technology", "Plans", "Dreams"
            )
        ),
        Book(
            id = "evolve_3", title = "Evolve 3", titlePersian = "ایوولو ۳",
            author = "Leslie Anne Hendra", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF0277BD, gradientEnd = 0xFF4FC3F7,
            chapterTitles = listOf(
                "Communication", "Lifestyle", "Modern Society",
                "Career Paths", "Cultural Diversity", "Education",
                "Media & News", "Environment", "Relationships",
                "Personal Growth", "Future Trends", "Success Stories"
            )
        ),
        Book(
            id = "evolve_4", title = "Evolve 4", titlePersian = "ایوولو ۴",
            author = "Leslie Anne Hendra", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            chapterTitles = listOf(
                "Unit 1", "Unit 2", "Unit 3", "Unit 4",
                "Unit 5", "Unit 6", "Unit 7", "Unit 8",
                "Unit 9", "Unit 10", "Unit 11", "Unit 12"
            )
        ),
        Book(
            id = "evolve_5", title = "Evolve 5", titlePersian = "ایوولو ۵",
            author = "Leslie Anne Hendra", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFFE65100, gradientEnd = 0xFFFFCC80,
            chapterTitles = listOf(
                "Identity", "Society & Culture", "Innovation",
                "Ethics & Values", "Globalization", "Sustainability",
                "Psychology", "Politics", "Art & Media",
                "Science", "Philosophy", "Future"
            )
        ),

        // ==================== 📝 گرامر ====================
        Book(
            id = "basic_grammar", title = "Basic Grammar in Use", titlePersian = "گرامر پایه",
            author = "Raymond Murphy", category = BookCategory.GRAMMAR,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 13,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF26A69A
        ),
        Book(
            id = "understanding_grammar", title = "Understanding English Grammar", titlePersian = "درک گرامر انگلیسی",
            author = "Betty Azar", category = BookCategory.GRAMMAR,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF0277BD, gradientEnd = 0xFF4FC3F7
        ),
        Book(
            id = "advanced_grammar", title = "Advanced Grammar in Use", titlePersian = "گرامر پیشرفته",
            author = "Martin Hewings", category = BookCategory.GRAMMAR,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFF4527A0, gradientEnd = 0xFF7E57C2
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