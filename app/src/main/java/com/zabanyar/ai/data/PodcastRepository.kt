package com.zabanyar.ai.data

data class Podcast(
    val id: String,
    val title: String,
    val titlePersian: String,
    val description: String,
    val level: String,
    val levelEmoji: String,
    val category: String,
    val categoryEmoji: String,
    val duration: String,
    val gradientStart: Long,
    val gradientEnd: Long,
    val audioUrl: String,
    val transcript: List<String> = emptyList()
)

object PodcastRepository {

    private const val BASE_URL = "https://github.com/Aboulfazll/ZabanYar-AI/releases/download/v1.0-podcasts/"

    // ═══════════════════════════════════════════════════════
    //  متن رونویسی نمونه (Transcripts)
    // ═══════════════════════════════════════════════════════

    private val transcriptGreetings = listOf(
        "Hello and welcome to ZabanYar AI podcast.",
        "Today we are going to learn how to greet people in English.",
        "There are many ways to say hello in English.",
        "The most common way is simply to say: Hello.",
        "You can also say: Hi. This is more casual.",
        "When you meet someone for the first time, you can say: Nice to meet you.",
        "The other person usually replies: Nice to meet you too.",
        "If you want to ask about someone, you can say: How are you?",
        "The most common answer is: I am fine, thank you. And you?",
        "You can also say: I am good. Or: I am doing well.",
        "When you leave, you can say: Goodbye. Or: See you later.",
        "Thank you for listening. See you in the next episode."
    )

    private val transcriptNumbers = listOf(
        "Welcome back to ZabanYar AI podcast.",
        "Today we will learn the numbers in English.",
        "Numbers are very important in everyday life.",
        "Let us start with numbers from one to ten.",
        "One, two, three, four, five.",
        "Six, seven, eight, nine, ten.",
        "Now let us continue from eleven to twenty.",
        "Eleven, twelve, thirteen, fourteen, fifteen.",
        "Sixteen, seventeen, eighteen, nineteen, twenty.",
        "We can also count by tens.",
        "Ten, twenty, thirty, forty, fifty.",
        "Sixty, seventy, eighty, ninety, one hundred.",
        "Practice these numbers every day.",
        "Thank you for listening. See you next time."
    )

    private val transcriptColors = listOf(
        "Hello everyone and welcome to our podcast.",
        "Today we will learn about colors in English.",
        "Colors are all around us.",
        "The most common colors are: red, blue, yellow, and green.",
        "Let us learn more colors.",
        "Orange, purple, pink, brown, black, white, and gray.",
        "The sky is blue. The grass is green.",
        "The sun is yellow. Roses are red.",
        "Snow is white. The night is black.",
        "Now try to describe the colors you see around you.",
        "Thank you for listening. Goodbye."
    )

    private val transcriptWeather = listOf(
        "Hi and welcome back.",
        "Today we will talk about the weather.",
        "Weather is a very common topic in small talk.",
        "In English, we often ask: How is the weather today?",
        "Common answers include: It is sunny today.",
        "It is cloudy. It is raining. It is snowing.",
        "It is windy. It is foggy. It is hot. It is cold.",
        "You can also say: It is a beautiful day.",
        "Or: The weather is terrible today.",
        "Now try to describe the weather where you are.",
        "Thanks for listening. See you next time."
    )

    private val transcriptRestaurant = listOf(
        "Welcome to ZabanYar AI podcast.",
        "Today we will learn how to order food at a restaurant.",
        "When you enter a restaurant, the waiter may say: Good evening.",
        "You can reply: Good evening. A table for two, please.",
        "The waiter will show you to your table.",
        "Then he will give you the menu.",
        "You can ask: What do you recommend?",
        "When you are ready, you say: I would like to order, please.",
        "For example: I would like a steak, please.",
        "You can also say: Can I have a glass of water?",
        "After the meal, you say: The bill, please.",
        "You can pay by cash or by card.",
        "Thank you for listening. See you soon."
    )

    private val transcriptFamily = listOf(
        "Hello and welcome back.",
        "Today we will learn the names of family members.",
        "Family is very important in every culture.",
        "The closest family members are: mother, father, sister, and brother.",
        "Your mother's mother is your grandmother.",
        "Your father's father is your grandfather.",
        "Your aunt is your mother's or father's sister.",
        "Your uncle is your mother's or father's brother.",
        "Your cousin is your aunt's or uncle's child.",
        "Your nephew is your brother's or sister's son.",
        "Your niece is your brother's or sister's daughter.",
        "Now try to name your family members in English.",
        "Thanks for listening. Goodbye."
    )

    private val transcriptDailyRoutine = listOf(
        "Welcome to our English learning podcast.",
        "Today we will talk about daily routines.",
        "A daily routine describes what you do every day.",
        "In the morning, I wake up at seven o'clock.",
        "I brush my teeth and take a shower.",
        "I have breakfast with my family.",
        "Then I go to work or school.",
        "In the afternoon, I have lunch.",
        "In the evening, I come home and relax.",
        "I have dinner and watch TV.",
        "I go to bed at eleven o'clock.",
        "Now try to describe your daily routine.",
        "Thank you for listening."
    )

    private val transcriptGeneral = listOf(
        "Welcome to ZabanYar AI podcast.",
        "Today we will practice English listening.",
        "Listen carefully to each sentence.",
        "Try to repeat after me.",
        "Practice makes perfect.",
        "The more you listen, the more you learn.",
        "Take your time and do not worry about mistakes.",
        "Every mistake is a step toward success.",
        "Keep practicing every day.",
        "You are doing great.",
        "Thank you for listening. See you next time."
    )

    // ═══════════════════════════════════════════════════════
    //  لیست پادکست‌ها
    // ═══════════════════════════════════════════════════════
    fun getAllPodcasts(): List<Podcast> = listOf(
        // مبتدی
        Podcast("p1", "Greetings and Introductions", "احوالپرسی و معرفی",
            "یاد بگیر چطور به انگلیسی احوالپرسی کنی", "مبتدی", "🌱", "مکالمه", "💬", "۵:۳۰",
            0xFF6A1B9A, 0xFFAB47BC, "${BASE_URL}p1_greetings.mp3", transcriptGreetings),
        Podcast("p2", "Numbers and Counting", "اعداد و شمارش",
            "یادگیری اعداد از یک تا بیست", "مبتدی", "🌱", "واژگان", "📚", "۴:۱۵",
            0xFF00897B, 0xFF4DB6AC, "${BASE_URL}p2_numbers.mp3", transcriptNumbers),
        Podcast("p3", "Colors Around Us", "رنگ‌های اطراف ما",
            "نام رنگ‌ها به انگلیسی", "مبتدی", "🌱", "واژگان", "📚", "۳:۵۰",
            0xFFE91E63, 0xFFF06292, "${BASE_URL}p3_colors.mp3", transcriptColors),
        Podcast("p4", "Days of the Week", "روزهای هفته",
            "هفت روز هفته به انگلیسی", "مبتدی", "🌱", "واژگان", "📚", "۴:۳۰",
            0xFF0277BD, 0xFF4FC3F7, "${BASE_URL}p4_days_of_week.mp3", transcriptGeneral),
        Podcast("p5", "At the Supermarket", "در سوپرمارکت",
            "جمله‌های کاربردی خرید", "مبتدی", "🌱", "مکالمه", "💬", "۶:۲۰",
            0xFFE65100, 0xFFFFB74D, "${BASE_URL}p5_supermarket.mp3", transcriptGeneral),
        Podcast("p6", "Family Members", "اعضای خانواده",
            "نام اعضای خانواده به انگلیسی", "مبتدی", "🌱", "واژگان", "📚", "۵:۱۰",
            0xFF33691E, 0xFF8BC34A, "${BASE_URL}p6_family_members.mp3", transcriptFamily),
        Podcast("p7", "Weather Talk", "صحبت از آب و هوا",
            "چطور درباره آب و هوا حرف بزنیم", "مبتدی", "🌱", "مکالمه", "💬", "۴:۴۰",
            0xFF0288D1, 0xFF4FC3F7, "${BASE_URL}p7_weather.mp3", transcriptWeather),
        Podcast("p8", "At the Restaurant", "در رستوران",
            "سفارش غذا به انگلیسی", "مبتدی", "🌱", "مکالمه", "💬", "۷:۰۰",
            0xFFC62828, 0xFFEF5350, "${BASE_URL}p8_restaurant.mp3", transcriptRestaurant),
        Podcast("p9", "My Daily Routine", "روتین روزانه من",
            "توصیف فعالیت‌های روزانه", "مبتدی", "🌱", "مکالمه", "💬", "۵:۵۰",
            0xFF6A1B9A, 0xFFAB47BC, "${BASE_URL}p9_daily_routine.mp3", transcriptDailyRoutine),
        Podcast("p10", "Telling Time", "گفتن ساعت",
            "چطور ساعت رو بگیم", "مبتدی", "🌱", "واژگان", "📚", "۴:۲۵",
            0xFFE91E63, 0xFFF06292, "${BASE_URL}p10_telling_time.mp3", transcriptGeneral),

        // متوسط
        Podcast("p11", "Present Simple Grammar", "گرامر حال ساده",
            "آموزش کامل حال ساده", "متوسط", "🚀", "گرامر", "📝", "۸:۳۰",
            0xFF00695C, 0xFF26A69A, "${BASE_URL}p11_present_simple.mp3", transcriptGeneral),
        Podcast("p12", "Common Idioms", "اصطلاحات رایج",
            "پرتکرارترین اصطلاحات انگلیسی", "متوسط", "🚀", "اصطلاحات", "💡", "۹:۱۵",
            0xFFFF6F00, 0xFFFFB300, "${BASE_URL}p12_common_idioms.mp3", transcriptGeneral),
        Podcast("p13", "Making Small Talk", "گپ کوتاه",
            "چطور با غریبه‌ها صحبت کنیم", "متوسط", "🚀", "مکالمه", "💬", "۸:۴۵",
            0xFF7B1FA2, 0xFFBA68C8, "${BASE_URL}p13_small_talk.mp3", transcriptGeneral),
        Podcast("p14", "Phrasal Verbs", "افعال عبارتی",
            "افعال عبارتی پرکاربرد", "متوسط", "🚀", "گرامر", "📝", "۱۰:۲۰",
            0xFF01579B, 0xFF039BE5, "${BASE_URL}p14_phrasal_verbs.mp3", transcriptGeneral),
        Podcast("p15", "Job Interview Tips", "نکات مصاحبه شغلی",
            "موفقیت در مصاحبه شغلی", "متوسط", "🚀", "مکالمه", "💬", "۱۱:۳۰",
            0xFF1B5E20, 0xFF4CAF50, "${BASE_URL}p15_job_interview.mp3", transcriptGeneral),
        Podcast("p16", "Past Tense", "زمان گذشته",
            "آموزش کامل گذشته ساده", "متوسط", "🚀", "گرامر", "📝", "۹:۰۰",
            0xFFBF360C, 0xFFFF7043, "${BASE_URL}p16_past_tense.mp3", transcriptGeneral),
        Podcast("p17", "Health and Fitness", "سلامتی و تناسب اندام",
            "لغات مربوط به سلامتی", "متوسط", "🚀", "واژگان", "📚", "۸:۲۰",
            0xFF880E4F, 0xFFC2185B, "${BASE_URL}p17_health_fitness.mp3", transcriptGeneral),
        Podcast("p18", "At the Airport", "در فرودگاه",
            "انگلیسی در سفر هوایی", "متوسط", "🚀", "مکالمه", "💬", "۷:۴۵",
            0xFF01579B, 0xFF42A5F5, "${BASE_URL}p18_airport.mp3", transcriptGeneral),

        // پیشرفته
        Podcast("p19", "Climate Change", "تغییرات اقلیمی",
            "بحث درباره محیط زیست", "پیشرفته", "🏆", "علمی", "🔬", "۱۲:۳۰",
            0xFF1A237E, 0xFF3F51B5, "${BASE_URL}p19_climate_change.mp3", transcriptGeneral),
        Podcast("p20", "Future of AI", "آینده هوش مصنوعی",
            "تکنولوژی و آینده", "پیشرفته", "🏆", "علمی", "🔬", "۱۳:۱۵",
            0xFF283593, 0xFF5C6BC0, "${BASE_URL}p20_future_ai.mp3", transcriptGeneral),
        Podcast("p21", "Public Speaking", "سخنرانی در جمع",
            "مهارت‌های سخنرانی", "پیشرفته", "🏆", "مهارت", "🎯", "۱۱:۴۵",
            0xFF4A148C, 0xFF9C27B0, "${BASE_URL}p21_public_speaking.mp3", transcriptGeneral),
        Podcast("p22", "Global Economy", "اقتصاد جهانی",
            "بحث اقتصادی", "پیشرفته", "🏆", "اقتصادی", "💼", "۱۴:۰۰",
            0xFF37474F, 0xFF78909C, "${BASE_URL}p22_global_economy.mp3", transcriptGeneral),
        Podcast("p23", "Philosophy of Happiness", "فلسفه شادی",
            "تفکر عمیق درباره شادی", "پیشرفته", "🏆", "فلسفی", "🤔", "۱۲:۵۰",
            0xFFD84315, 0xFFFF8A65, "${BASE_URL}p23_happiness.mp3", transcriptGeneral),
        Podcast("p24", "Future of Work", "آینده کار",
            "تغییرات بازار کار", "پیشرفته", "🏆", "اقتصادی", "💼", "۱۳:۲۰",
            0xFF006064, 0xFF00BCD4, "${BASE_URL}p24_future_work.mp3", transcriptGeneral)
    )

    fun getPodcastsByLevel(level: String): List<Podcast> =
        getAllPodcasts().filter { it.level == level }

    fun getPodcastById(id: String): Podcast? =
        getAllPodcasts().firstOrNull { it.id == id }
}