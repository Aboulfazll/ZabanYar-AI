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
    // ✅ این چهار خط مقدار پیش‌فرض گرفتن (تغییر اصلی)
    val levelEmoji: String = "📕",
    val totalChapters: Int = 6,
    val gradientStart: Long = 0xFF1A237E,
    val gradientEnd: Long = 0xFF3949AB,
    val chapterTitles: List<String> = emptyList(),
    val views: String = "0",
    val isNew: Boolean = false
)

object BookRepository {

    fun getAllBooks(): List<Book> = listOf(

        // ═══════════════════════════════════════════════════════
        //  💬 مکالمه
        // ═══════════════════════════════════════════════════════

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

        // ---------- Four Corners ----------
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

        // ═══════════════════════════════════════════════════════
        //  📝 گرامر
        // ═══════════════════════════════════════════════════════
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
        ),

        // ═══════════════════════════════════════════════════════
        //  📕 داستان‌ها — سطح ساده 🌱
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
        ),

        // ═══════════════════════════════════════════════════════
        //  📕 داستان‌ها — سطح متوسط 🚀
        // ═══════════════════════════════════════════════════════
        Book(
            id = "nicholas_nickleby", title = "Nicholas Nickleby", titlePersian = "نیکلاس نیکلبی",
            author = "Charles Dickens", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFF455A64, gradientEnd = 0xFF90A4AE,
            views = "12.4K",
            chapterTitles = listOf(
                "خانواده فقیر", "مدرسه وحشتناک", "فرار نیکلاس",
                "تئاتر لندن", "کیت و مادر", "عمو رالف خبیث",
                "دوستی با اسمایک", "راز خانوادگی", "انتقام", "پایان خوش"
            )
        ),
        Book(
            id = "prisoner_zenda", title = "The Prisoner of Zenda", titlePersian = "زندانی زندا",
            author = "Anthony Hope", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 8,
            gradientStart = 0xFF1976D2, gradientEnd = 0xFF64B5F6,
            views = "9.4K",
            chapterTitles = listOf(
                "شباهت عجیب", "پادشاه ربوده می‌شود", "جانشین موقت",
                "توطئه در قصر", "عشق پرنسس", "نبرد با روپرت",
                "نجات پادشاه", "بازگشت به انگلیس"
            )
        ),
        Book(
            id = "washington_square", title = "Washington Square", titlePersian = "واشنگتن اسکوئر",
            author = "Henry James", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 8,
            gradientStart = 0xFF4E342E, gradientEnd = 0xFFA1887F,
            views = "1.4K",
            chapterTitles = listOf(
                "دکتر اسلوپر", "کاترین ساده", "خواستگار مرموز",
                "مخالفت پدر", "نامه عاشقانه", "جدایی تلخ",
                "سال‌های تنهایی", "پایان آرام"
            )
        ),
        Book(
            id = "sherlock_speckled_band", title = "The Speckled Band", titlePersian = "نوار خال‌دار",
            author = "Sir Arthur Conan Doyle", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "16.8K",
            chapterTitles = listOf(
                "خواهر و خواهرزاده", "اتاق مرموز", "مار سمی",
                "دکتر رویلوت", "حقیقت آشکار می‌شود"
            )
        ),
        Book(
            id = "sherlock_red_headed", title = "The Red-Headed League", titlePersian = "اتحادیه سرخ‌موها",
            author = "Sir Arthur Conan Doyle", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 5,
            gradientStart = 0xFFC62828, gradientEnd = 0xFFEF5350,
            views = "14.2K",
            chapterTitles = listOf(
                "کار عجیب", "اتحادیه سرخ‌موها", "ناپدید شدن ناگهانی",
                "تحقیقات شرلوک", "سرقت از بانک"
            )
        ),
        Book(
            id = "christmas_carol", title = "A Christmas Carol", titlePersian = "سرود کریسمس",
            author = "Charles Dickens", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 5,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF4DB6AC,
            views = "19.7K",
            chapterTitles = listOf(
                "اسکروج بخیل", "روح کریسمس گذشته", "روح کریسمس حال",
                "روح کریسمس آینده", "بیداری و تغییر"
            )
        ),
        Book(
            id = "around_world_80_days", title = "Around the World in 80 Days",
            titlePersian = "دور دنیا در ۸۰ روز",
            author = "Jules Verne", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF81C784,
            views = "21K",
            chapterTitles = listOf(
                "شرط بزرگ", "سفر آغاز می‌شود", "در مصر", "در هند",
                "نجات بانو", "در هنگ‌کنگ", "در ژاپن", "در آمریکا",
                "بازگشت به لندن", "برنده شدن"
            )
        ),
        Book(
            id = "treasure_island", title = "Treasure Island", titlePersian = "جزیره گنج",
            author = "Robert Louis Stevenson", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            views = "17.3K",
            chapterTitles = listOf(
                "پیرمرد دریایی", "نقشه گنج", "کاپیتان فلینت",
                "سفر دریایی", "لانگ جان سیلور", "جزیره گنج",
                "خائنین", "در دست دشمن", "نبرد نهایی", "بازگشت"
            )
        ),
        Book(
            id = "robinson_crusoe", title = "Robinson Crusoe", titlePersian = "رابینسون کروزو",
            author = "Daniel Defoe", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "13.5K",
            chapterTitles = listOf(
                "شروع سفر", "غرق شدن کشتی", "جزیره خالی",
                "ساختن خانه", "کشف ردپا", "آدم‌خواران",
                "نجات جمعه", "زندگی در جزیره", "کشتی انگلیسی", "بازگشت به خانه"
            )
        ),
        Book(
            id = "tom_sawyer", title = "The Adventures of Tom Sawyer", titlePersian = "ماجراهای تام سایر",
            author = "Mark Twain", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFFE65100, gradientEnd = 0xFFFFB74D,
            views = "11.8K",
            chapterTitles = listOf(
                "شیطنت‌های تام", "نقاشی دیوار", "بکی تاچر",
                "گنج در شب", "شاهد قتل", "فرار به جزیره",
                "مراسم تشییع", "گم شدن در غار", "پیدا کردن گنج", "پایان ماجرا"
            )
        ),
        Book(
            id = "huckleberry_finn", title = "Huckleberry Finn", titlePersian = "هاکلبری فین",
            author = "Mark Twain", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 10,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF4DB6AC,
            views = "10.2K",
            chapterTitles = listOf(
                "فرار از خانه", "جزیره جکسون", "سفر با قایق",
                "جیم فراری", "ماجرا در رودخانه", "کلاهبرداران",
                "خانواده گرنجرفورد", "جدایی از جیم", "مزرعه فلپس", "آزادی"
            )
        ),
        Book(
            id = "white_fang", title = "White Fang", titlePersian = "نیش سفید",
            author = "Jack London", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 8,
            gradientStart = 0xFFECEFF1, gradientEnd = 0xFF90A4AE,
            views = "9.6K",
            chapterTitles = listOf(
                "تولد در وحش", "قانون طبیعت", "مرد و سگ",
                "زندگی با انسان", "اردوگاه سرخ‌پوستان", "سگ جنگی",
                "دوستی با ویدون", "آزادی و خانه"
            )
        ),
        Book(
            id = "call_of_wild", title = "The Call of the Wild", titlePersian = "ندای وحش",
            author = "Jack London", category = BookCategory.STORY,
            level = "متوسط", levelEmoji = "🚀", totalChapters = 8,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "10.5K",
            chapterTitles = listOf(
                "زندگی راحت باک", "ربوده شدن", "سفر به شمال",
                "آموزش سورتمه", "رئیس سگ‌ها", "جان تورنتون",
                "ندای جنگل", "بازگشت به وحش"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📕 داستان‌ها — سطح پیشرفته 🏆
        // ═══════════════════════════════════════════════════════
        Book(
            id = "sense_sensibility", title = "Sense and Sensibility", titlePersian = "عقل و احساس",
            author = "Jane Austen", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 10,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "8.9K",
            chapterTitles = listOf(
                "خانواده دشوود", "ارث و فقر", "الینور عاقل",
                "ماریان احساساتی", "ادوارد فرار", "ویلوبی خیانتکار",
                "سفر به لندن", "بیماری ماریان", "بازگشت ادوارد", "ازدواج"
            )
        ),
        Book(
            id = "farewell_my_lovely", title = "Farewell, My Lovely", titlePersian = "خداحافظ، عزیزم",
            author = "Raymond Chandler", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 8,
            gradientStart = 0xFF212121, gradientEnd = 0xFF757575,
            views = "6.3K",
            chapterTitles = listOf(
                "کارآگاه مارلو", "مشتری مرموز", "قتل در هتل",
                "ردیابی در لس‌آنجلس", "تله خطرناک", "راز بزرگ",
                "نبرد نهایی", "پرونده بسته می‌شود"
            )
        ),
        Book(
            id = "dracula", title = "Dracula", titlePersian = "دراکولا",
            author = "Bram Stoker", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 8,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF7E57C2,
            views = "22.7K",
            chapterTitles = listOf(
                "سفر به ترانسیلوانیا", "قلعه کنت", "شب‌های وحشت",
                "فرار از قلعه", "لوسی و مینا", "شکار دراکولا",
                "نبرد نهایی", "پایان شب"
            )
        ),
        Book(
            id = "frankenstein", title = "Frankenstein", titlePersian = "فرانکنشتاین",
            author = "Mary Shelley", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 8,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF4DB6AC,
            views = "15.6K",
            chapterTitles = listOf(
                "دانشمند جوان", "خلق موجود", "وحشت و فرار",
                "تنهایی موجود", "انتقام", "قتل برادر",
                "همسر فرانکنشتاین", "پایان تراژیک"
            )
        ),
        Book(
            id = "great_expectations", title = "Great Expectations", titlePersian = "آرزوهای بزرگ",
            author = "Charles Dickens", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 10,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "9.1K",
            chapterTitles = listOf(
                "کودکی پیپ", "بانو هاویشام", "استلا",
                "ثروت ناگهانی", "زندگی در لندن", "حقیقت آشکار",
                "پشتیبان مرموز", "از دست دادن ثروت", "بازگشت به دهکده", "پایان خوش"
            )
        ),
        Book(
            id = "pride_prejudice", title = "Pride and Prejudice", titlePersian = "غرور و تعصب",
            author = "Jane Austen", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 10,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF8BBD0,
            views = "27.4K",
            chapterTitles = listOf(
                "خانواده بنت", "آقای بینگلی", "آقای دارسی",
                "اولین برداشت", "رد پیشنهاد", "نامه دارسی",
                "سفر به پمبرلی", "حقیقت ویکهام", "عشق دوباره", "ازدواج"
            )
        ),
        Book(
            id = "jane_eyre", title = "Jane Eyre", titlePersian = "جین ایر",
            author = "Charlotte Brontë", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 10,
            gradientStart = 0xFF283593, gradientEnd = 0xFF7986CB,
            views = "11.2K",
            chapterTitles = listOf(
                "کودکی جین", "مدرسه لووود", "معلم خانه",
                "آقای روچستر", "عشقی پنهان", "راز عمارت",
                "فرار از تورنفیلد", "زندگی جدید", "صدای روح", "بازگشت به عشق"
            )
        ),
        Book(
            id = "hamlet", title = "Hamlet", titlePersian = "هملت",
            author = "William Shakespeare", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 8,
            gradientStart = 0xFF212121, gradientEnd = 0xFF616161,
            views = "13.8K",
            chapterTitles = listOf(
                "شاهزاده دانمارک", "روح پدر", "تظاهر به جنون",
                "نمایش در قصر", "اتاق ملکه", "مرگ پولونیوس",
                "سرنوشت اوفلیا", "دوئل نهایی"
            )
        ),
        Book(
            id = "romeo_juliet", title = "Romeo and Juliet", titlePersian = "رومئو و ژولیت",
            author = "William Shakespeare", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 7,
            gradientStart = 0xFFB71C1C, gradientEnd = 0xFFE57373,
            views = "25.3K",
            chapterTitles = listOf(
                "دو خانواده دشمن", "ملاقات در مهمانی", "بالکن شبانه",
                "ازدواج مخفیانه", "دوئل و تبعید", "نقشه فرار",
                "پایان تراژیک"
            )
        ),
        Book(
            id = "moby_dick", title = "Moby Dick", titlePersian = "موبی دیک",
            author = "Herman Melville", category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆", totalChapters = 8,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF42A5F5,
            views = "7.4K",
            chapterTitles = listOf(
                "سفر به دریا", "کاپیتان اهب", "خدمه کشتی",
                "شکار نهنگ", "نهنگ سفید", "وسواس کاپیتان",
                "نبرد نهایی", "غرق شدن"
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