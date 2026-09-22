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
    val gradientEnd: Long
)

object PodcastRepository {

    fun getAllPodcasts(): List<Podcast> = listOf(
        // مبتدی
        Podcast("p1", "Greetings and Introductions", "احوالپرسی و معرفی",
            "یاد بگیر چطور به انگلیسی احوالپرسی کنی", "مبتدی", "🌱", "مکالمه", "💬", "۵:۳۰",
            0xFF6A1B9A, 0xFFAB47BC),
        Podcast("p2", "Numbers and Counting", "اعداد و شمارش",
            "یادگیری اعداد از یک تا بیست", "مبتدی", "🌱", "واژگان", "📚", "۴:۱۵",
            0xFF00897B, 0xFF4DB6AC),
        Podcast("p3", "Colors Around Us", "رنگ‌های اطراف ما",
            "نام رنگ‌ها به انگلیسی", "مبتدی", "🌱", "واژگان", "📚", "۳:۵۰",
            0xFFE91E63, 0xFFF06292),
        Podcast("p4", "Days of the Week", "روزهای هفته",
            "هفت روز هفته به انگلیسی", "مبتدی", "🌱", "واژگان", "📚", "۴:۳۰",
            0xFF0277BD, 0xFF4FC3F7),
        Podcast("p5", "At the Supermarket", "در سوپرمارکت",
            "جمله‌های کاربردی خرید", "مبتدی", "🌱", "مکالمه", "💬", "۶:۲۰",
            0xFFE65100, 0xFFFFB74D),
        Podcast("p6", "Family Members", "اعضای خانواده",
            "نام اعضای خانواده به انگلیسی", "مبتدی", "🌱", "واژگان", "📚", "۵:۱۰",
            0xFF33691E, 0xFF8BC34A),
        Podcast("p7", "Weather Talk", "صحبت از آب و هوا",
            "چطور درباره آب و هوا حرف بزنیم", "مبتدی", "🌱", "مکالمه", "💬", "۴:۴۰",
            0xFF0288D1, 0xFF4FC3F7),
        Podcast("p8", "At the Restaurant", "در رستوران",
            "سفارش غذا به انگلیسی", "مبتدی", "🌱", "مکالمه", "💬", "۷:۰۰",
            0xFFC62828, 0xFFEF5350),
        Podcast("p9", "My Daily Routine", "روتین روزانه من",
            "توصیف فعالیت‌های روزانه", "مبتدی", "🌱", "مکالمه", "💬", "۵:۵۰",
            0xFF6A1B9A, 0xFFAB47BC),
        Podcast("p10", "Telling Time", "گفتن ساعت",
            "چطور ساعت رو بگیم", "مبتدی", "🌱", "واژگان", "📚", "۴:۲۵",
            0xFFE91E63, 0xFFF06292),

        // متوسط
        Podcast("p11", "Present Simple Grammar", "گرامر حال ساده",
            "آموزش کامل حال ساده", "متوسط", "🚀", "گرامر", "📝", "۸:۳۰",
            0xFF00695C, 0xFF26A69A),
        Podcast("p12", "Common Idioms", "اصطلاحات رایج",
            "پرتکرارترین اصطلاحات انگلیسی", "متوسط", "🚀", "اصطلاحات", "💡", "۹:۱۵",
            0xFFFF6F00, 0xFFFFB300),
        Podcast("p13", "Making Small Talk", "گپ کوتاه",
            "چطور با غریبه‌ها صحبت کنیم", "متوسط", "🚀", "مکالمه", "💬", "۸:۴۵",
            0xFF7B1FA2, 0xFFBA68C8),
        Podcast("p14", "Phrasal Verbs", "افعال عبارتی",
            "افعال عبارتی پرکاربرد", "متوسط", "🚀", "گرامر", "📝", "۱۰:۲۰",
            0xFF01579B, 0xFF039BE5),
        Podcast("p15", "Job Interview Tips", "نکات مصاحبه شغلی",
            "موفقیت در مصاحبه شغلی", "متوسط", "🚀", "مکالمه", "💬", "۱۱:۳۰",
            0xFF1B5E20, 0xFF4CAF50),
        Podcast("p16", "Past Tense", "زمان گذشته",
            "آموزش کامل گذشته ساده", "متوسط", "🚀", "گرامر", "📝", "۹:۰۰",
            0xFFBF360C, 0xFFFF7043),
        Podcast("p17", "Health and Fitness", "سلامتی و تناسب اندام",
            "لغات مربوط به سلامتی", "متوسط", "🚀", "واژگان", "📚", "۸:۲۰",
            0xFF880E4F, 0xFFC2185B),
        Podcast("p18", "At the Airport", "در فرودگاه",
            "انگلیسی در سفر هوایی", "متوسط", "🚀", "مکالمه", "💬", "۷:۴۵",
            0xFF01579B, 0xFF42A5F5),

        // پیشرفته
        Podcast("p19", "Climate Change", "تغییرات اقلیمی",
            "بحث درباره محیط زیست", "پیشرفته", "🏆", "علمی", "🔬", "۱۲:۳۰",
            0xFF1A237E, 0xFF3F51B5),
        Podcast("p20", "Future of AI", "آینده هوش مصنوعی",
            "تکنولوژی و آینده", "پیشرفته", "🏆", "علمی", "🔬", "۱۳:۱۵",
            0xFF283593, 0xFF5C6BC0),
        Podcast("p21", "Public Speaking", "سخنرانی در جمع",
            "مهارت‌های سخنرانی", "پیشرفته", "🏆", "مهارت", "🎯", "۱۱:۴۵",
            0xFF4A148C, 0xFF9C27B0),
        Podcast("p22", "Global Economy", "اقتصاد جهانی",
            "بحث اقتصادی", "پیشرفته", "🏆", "اقتصادی", "💼", "۱۴:۰۰",
            0xFF37474F, 0xFF78909C),
        Podcast("p23", "Philosophy of Happiness", "فلسفه شادی",
            "تفکر عمیق درباره شادی", "پیشرفته", "🏆", "فلسفی", "🤔", "۱۲:۵۰",
            0xFFD84315, 0xFFFF8A65),
        Podcast("p24", "Future of Work", "آینده کار",
            "تغییرات بازار کار", "پیشرفته", "🏆", "اقتصادی", "💼", "۱۳:۲۰",
            0xFF006064, 0xFF00BCD4)
    )

    fun getPodcastsByLevel(level: String): List<Podcast> =
        getAllPodcasts().filter { it.level == level }

    fun getPodcastById(id: String): Podcast? =
        getAllPodcasts().firstOrNull { it.id == id }
}