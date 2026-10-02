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
    val levelEmoji: String = "📕",
    val totalChapters: Int = 6,
    val gradientStart: Long = 0xFF1A237E,
    val gradientEnd: Long = 0xFF3949AB,
    val chapterTitles: List<String> = emptyList(),
    val views: String = "0",
    val isNew: Boolean = false,
    val coverUrl: String = ""
)

object BookRepository {

    fun getAllBooks(): List<Book> = listOf(

        // ═══════════════════════════════════════════════════════
        //  💬 مکالمه
        // ═══════════════════════════════════════════════════════

        // ---------- Top Notch ----------
        Book(
            id = "top_notch_fundamentals", title = "Top Notch Fundamentals", titlePersian = "تاپ ناچ مقدماتی",
            author = "Joan Saslow", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 14,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF7E57C2,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780133928798-L.jpg",
            chapterTitles = listOf(
                "Greetings", "Names and Titles", "Countries and Nationalities",
                "Numbers and Age", "Family Members", "Jobs and Occupations",
                "Classroom Objects", "Daily Activities", "Time and Days",
                "Food and Drinks", "Clothes and Colors", "Weather and Seasons",
                "Places in the City", "Review"
            )
        ),
        Book(
            id = "top_notch_1", title = "Top Notch 1", titlePersian = "تاپ ناچ ۱",
            author = "Joan Saslow", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 14,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFAB47BC,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780133928651-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780133928774-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780133929023-L.jpg",
            chapterTitles = listOf(
                "Cultural Literacy", "Shopping and Consumerism", "Personal Care",
                "Modern Technology", "Holidays", "Eating Well",
                "Environment", "Education", "Jobs and Careers", "Life Changes"
            )
        ),

        // ---------- Four Corners ----------
        Book(
            id = "four_corners_intro", title = "Four Corners Intro", titlePersian = "فور کورنرز مقدماتی",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780521126492-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780521126157-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780521126164-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780521126171-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780521126188-L.jpg",
            chapterTitles = listOf(
                "Getting Along", "Personal Style", "Making Changes",
                "In the News", "Modern Life", "Around the World",
                "Education Today", "Career Goals", "Healthy Living",
                "Technology & Media", "Cultural Differences", "The Future"
            )
        ),

        // ---------- American English File ----------
        Book(
            id = "american_english_file_starter", title = "American English File Starter", titlePersian = "امریکن اینگلیش فایل مقدماتی",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF42A5F5,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780194774389-L.jpg",
            chapterTitles = listOf(
                "Hello!", "Your World", "All About You",
                "Family and Friends", "The Way We Live", "Food and Drink",
                "My Time", "Places and Things", "Free Time",
                "Past Events", "Work and Study", "Future Plans"
            )
        ),
        Book(
            id = "american_english_file_1", title = "American English File 1", titlePersian = "امریکن اینگلیش فایل ۱",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF4FC3F7,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780194031376-L.jpg",
            chapterTitles = listOf(
                "First Day at School", "My World", "All About Me",
                "Family and Friends", "How We Live", "Things and Places",
                "My Time", "Food and Drink", "Free Time", "Past Events", "Work and Study", "Future Plans"
            )
        ),
        Book(
            id = "american_english_file_2", title = "American English File 2", titlePersian = "امریکن اینگلیش فایل ۲",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFF1976D2, gradientEnd = 0xFF64B5F6,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780194031451-L.jpg",
            chapterTitles = listOf(
                "Where Are You From?", "Everyday Life", "Past Events",
                "Clothes and Fashion", "Food and Restaurants", "Around Town",
                "Holidays", "Health Issues", "Relationships", "Education", "Travel Plans", "Future Plans"
            )
        ),
        Book(
            id = "american_english_file_3", title = "American English File 3", titlePersian = "امریکن اینگلیش فایل ۳",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF512DA8, gradientEnd = 0xFF9575CD,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780194031529-L.jpg",
            chapterTitles = listOf(
                "Fashion & Shopping", "Modern Life", "Personal Stories",
                "Environmental Issues", "Art and Music", "Books and Literature",
                "Career Development", "Travel Experiences", "Health & Fitness",
                "Technology & Innovation", "Society & Culture", "Future Goals"
            )
        ),
        Book(
            id = "american_english_file_4", title = "American English File 4", titlePersian = "امریکن اینگلیش فایل ۴",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFBA68C8,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780194031604-L.jpg",
            chapterTitles = listOf(
                "Communication", "Modern Life", "Money Matters",
                "Adventure Travel", "Food & Culture", "Health & Lifestyle",
                "Education Systems", "Relationships", "Work-Life Balance",
                "Environment", "Politics & Society", "Global Issues"
            )
        ),
        Book(
            id = "american_english_file_5", title = "American English File 5", titlePersian = "امریکن اینگلیش فایل ۵",
            author = "Christina Latham-Koenig", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFFB71C1C, gradientEnd = 0xFFEF9A9A,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780194031673-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781108403272-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781108403289-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781108403296-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781108403302-L.jpg",
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
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781108403319-L.jpg",
            chapterTitles = listOf(
                "Identity", "Society & Culture", "Innovation",
                "Ethics & Values", "Globalization", "Sustainability",
                "Psychology", "Politics", "Art & Media",
                "Science", "Philosophy", "Future"
            )
        ),
        Book(
            id = "evolve_6", title = "Evolve 6", titlePersian = "ایوولو ۶",
            author = "Leslie Anne Hendra", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFF4E342E, gradientEnd = 0xFFA1887F,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781108403326-L.jpg",
            chapterTitles = listOf(
                "Global Perspectives", "Social Change", "Technology & Ethics",
                "Leadership", "Innovation", "Cultural Identity",
                "Economics", "Politics & Power", "Arts & Expression",
                "Science & Society", "Human Rights", "The Future of Humanity"
            )
        ),

        // ---------- Empower ----------
        Book(
            id = "empower_c1", title = "Empower C1", titlePersian = "امپاور C1",
            author = "Adrian Doff", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFF1A237E, gradientEnd = 0xFF3F51B5,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781107469108-L.jpg",
            chapterTitles = listOf(
                "Language and Communication", "Identity and Society",
                "Education and Learning", "Work and Careers",
                "Technology and Innovation", "Health and Wellbeing",
                "Culture and Arts", "Environment and Sustainability",
                "Politics and Power", "Global Issues", "Relationships",
                "The Future"
            )
        ),

        // ---------- Passages ----------
        Book(
            id = "passages_1", title = "Passages 1", titlePersian = "پسیجز ۱",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF26A69A,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781108706212-L.jpg",
            chapterTitles = listOf(
                "Friends and Family", "City Life", "Fashion and Style",
                "Travel and Adventure", "Food and Health", "Entertainment",
                "Work and Study", "Environment", "Culture and Society",
                "Technology", "Personal Growth", "Future Plans"
            )
        ),
        Book(
            id = "passages_2", title = "Passages 2", titlePersian = "پسیجز ۲",
            author = "Jack C. Richards", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFF283593, gradientEnd = 0xFF5C6BC0,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781108706267-L.jpg",
            chapterTitles = listOf(
                "Globalization", "Cultural Identity", "Media and Communication",
                "Ethics and Morality", "Innovation", "Social Change",
                "Economics", "Politics", "Philosophy",
                "Science and Technology", "The Environment", "The Future"
            )
        ),

        // ---------- Summit ----------
        Book(
            id = "summit_1", title = "Summit 1", titlePersian = "سامیت ۱",
            author = "Joan Saslow", category = BookCategory.CONVERSATION,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780134506322-L.jpg",
            chapterTitles = listOf(
                "New Perspectives", "Musical Moods", "Personal Heroes",
                "The World of Work", "Food for Thought", "Finding Adventure",
                "The Power of Ideas", "Looking Good", "The Natural World", "Life Choices"
            )
        ),
        Book(
            id = "summit_2", title = "Summit 2", titlePersian = "سامیت ۲",
            author = "Joan Saslow", category = BookCategory.CONVERSATION,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 10,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF7E57C2,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780134506520-L.jpg",
            chapterTitles = listOf(
                "Going Global", "Communication", "The Art of Storytelling",
                "Living with Technology", "The World of Business",
                "Change Makers", "Environment & Ethics", "Media & Society",
                "The Individual and Society", "Future Visions"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📝 گرامر
        // ═══════════════════════════════════════════════════════
        Book(
            id = "basic_grammar", title = "Basic Grammar in Use", titlePersian = "گرامر پایه",
            author = "Raymond Murphy", category = BookCategory.GRAMMAR,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 13,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF26A69A,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780521133531-L.jpg"
        ),
        Book(
            id = "understanding_grammar", title = "Understanding English Grammar", titlePersian = "درک گرامر انگلیسی",
            author = "Betty Azar", category = BookCategory.GRAMMAR,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 12,
            gradientStart = 0xFF0277BD, gradientEnd = 0xFF4FC3F7,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9780134271350-L.jpg"
        ),
        Book(
            id = "advanced_grammar", title = "Advanced Grammar in Use", titlePersian = "گرامر پیشرفته",
            author = "Martin Hewings", category = BookCategory.GRAMMAR,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 12,
            gradientStart = 0xFF4527A0, gradientEnd = 0xFF7E57C2,
            coverUrl = "https://covers.openlibrary.org/b/isbn/9781107131036-L.jpg"
        ),

        // ═══════════════════════════════════════════════════════
        //  📕 داستان‌ها
        // ═══════════════════════════════════════════════════════
        Book(
            id = "curse_of_mummy", title = "Curse of the Mummy", titlePersian = "نفرین مومیایی",
            author = "Joyce Hannam", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 6,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF9575CD,
            views = "32.2K",
            chapterTitles = listOf(
                "مومیایی در موزه", "کتیبه مرموز", "شب وحشت",
                "طلسم مصر باستان", "نفرین فعال می‌شود", "راز فاش می‌شود"
            )
        ),
        Book(
            id = "sherlock_top_secret", title = "Sherlock Holmes: The Top-Secret Plans",
            titlePersian = "طرح‌های فوق‌سری",
            author = "Sir Arthur Conan Doyle", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 6,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "22K",
            chapterTitles = listOf(
                "پیدا شدن نقشه‌ها", "دزد مرموز", "ردیابی",
                "ملاقات با مظنون", "تله هوشمندانه", "حقیقت آشکار می‌شود"
            )
        ),
        Book(
            id = "sherlock_blue_diamond", title = "Sherlock Holmes: The Blue Diamond",
            titlePersian = "الماس آبی",
            author = "Sir Arthur Conan Doyle", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 6,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "67", isNew = true,
            chapterTitles = listOf(
                "یک کلاه کهنه", "الماس آبی", "آقای هنری بیکر",
                "به سوی مغازه آقای برکینریج", "یک مرد ریزنقش ضعیف", "یکی دو سوال"
            )
        ),
        Book(
            id = "halloween_horror", title = "Halloween Horror", titlePersian = "وحشت هالووین",
            author = "Gina D. B. Clemen", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 6,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF9575CD,
            views = "18.5K",
            chapterTitles = listOf(
                "شب هالووین", "خانه قدیمی", "صدای عجیب",
                "مهمانی وحشت", "حقیقت پشت دیوار", "پایان شب"
            )
        ),
        Book(
            id = "gift_of_magi", title = "The Gift of the Magi & Other Stories",
            titlePersian = "هدیه مغان و داستان‌های دیگر",
            author = "O. Henry", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 7,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFBA68C8,
            views = "15.2K",
            chapterTitles = listOf(
                "هدیه مغان", "آخرین برگ", "پلیس و سرود کلیسا",
                "بیست سال بعد", "مردی در قطار", "کفش‌های من",
                "یک داستان کریسمس"
            )
        ),
        Book(
            id = "alice_wonderland", title = "Alice in Wonderland", titlePersian = "آلیس در سرزمین عجایب",
            author = "Lewis Carroll", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 12,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF48FB1,
            views = "28K",
            chapterTitles = listOf(
                "Down the Rabbit Hole", "The Pool of Tears", "A Race",
                "The Rabbit Sends a Message", "Advice from a Caterpillar",
                "Pig and Pepper", "A Mad Tea Party", "The Queen's Garden",
                "The Mock Turtle", "The Trial", "Alice's Evidence", "Waking Up"
            )
        ),
        Book(
            id = "peter_pan", title = "Peter Pan", titlePersian = "پیتر پن",
            author = "J. M. Barrie", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 10,
            gradientStart = 0xFF0288D1, gradientEnd = 0xFF4FC3F7,
            views = "24K",
            chapterTitles = listOf(
                "The Darling Family", "Neverland", "The Flight",
                "The Lost Boys", "The Mermaids", "Captain Hook",
                "The Jolly Roger", "The Battle", "The Return", "Growing Up"
            )
        ),
        Book(
            id = "little_prince", title = "The Little Prince", titlePersian = "شازده کوچولو",
            author = "Antoine de Saint-Exupéry", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 10,
            gradientStart = 0xFF0288D1, gradientEnd = 0xFF81D4FA,
            views = "35K",
            chapterTitles = listOf(
                "خلبان در صحرا", "ملاقات شازده", "گل رز",
                "سفر به سیارات", "پادشاه", "مرد خودپسند",
                "روباه", "راز مهم", "چاه آب", "خداحافظی"
            )
        ),
        Book(
            id = "secret_garden", title = "The Secret Garden", titlePersian = "باغ مخفی",
            author = "Frances Hodgson Burnett", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 8,
            gradientStart = 0xFF2E7D32, gradientEnd = 0xFF81C784,
            views = "12.4K",
            chapterTitles = listOf(
                "مری تنها", "عمارت عمو", "کشف باغ",
                "کلید طلایی", "دیکن", "کالین بیمار",
                "راز باغ", "سلامتی و شادی"
            )
        ),
        Book(
            id = "black_beauty", title = "Black Beauty", titlePersian = "زیبای سیاه",
            author = "Anna Sewell", category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 8,
            gradientStart = 0xFF212121, gradientEnd = 0xFF757575,
            views = "8.7K",
            chapterTitles = listOf(
                "کره‌ای در مزرعه", "آموزش سواری", "خانه گوردون",
                "آتش‌سوزی", "فروش به لندن", "زندگی سخت",
                "دوستی با جین", "بازگشت به آرامش"
            )
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

    fun getStoriesByLevel(level: String): List<Book> =
        getAllBooks().filter { it.category == BookCategory.STORY && it.level == level }

    fun getAllStories(): List<Book> =
        getAllBooks().filter { it.category == BookCategory.STORY }
}