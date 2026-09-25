package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

/**
 * 📕 داستان‌های سطح پیشرفته 🏆
 *
 * مناسب زبان‌آموزان سطح بالا (C1-C2)
 * شامل ۳۰ داستان، هر کدام ۵ فصل
 * ID ها با فایل‌های محتوا در `content/advanced/` هماهنگ هستند.
 */
object AdvancedStories {

    fun getAll(): List<Book> = listOf(

        // ═══════════════════════════════════════════════════════
        //  📚 Group1 — ادبیات روسی و آلمانی
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_crime_punishment",
            title = "Crime and Punishment",
            titlePersian = "جنایت و مکافات",
            author = "Fyodor Dostoevsky",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF212121, gradientEnd = 0xFF616161,
            views = "18.4K",
            chapterTitles = listOf(
                "دانشجوی پترزبورگ", "قتل", "عذاب گناه",
                "عشق سونیا", "اعتراف و رستگاری"
            )
        ),
        Book(
            id = "adv_anna_karenina",
            title = "Anna Karenina",
            titlePersian = "آنا کارنینا",
            author = "Leo Tolstoy",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFFB71C1C, gradientEnd = 0xFFEF9A9A,
            views = "24.7K",
            chapterTitles = listOf(
                "خانواده‌ای در بحران", "عشق ممنوع", "رسوایی عمومی",
                "فرار به ایتالیا", "پایان تراژیک"
            )
        ),
        Book(
            id = "adv_metamorphosis",
            title = "The Metamorphosis",
            titlePersian = "مسخ",
            author = "Franz Kafka",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF4E342E, gradientEnd = 0xFFA1887F,
            views = "21.3K",
            chapterTitles = listOf(
                "بیداری", "شوک خانواده", "افول خانواده",
                "مرگ گرگور", "شروع جدید"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group2 — ادبیات مدرن و فلسفی
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_hundred_years",
            title = "One Hundred Years of Solitude",
            titlePersian = "صد سال تنهایی",
            author = "Gabriel García Márquez",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF81C784,
            views = "28.1K",
            chapterTitles = listOf(
                "بنیان‌گذاری ماکوندو", "سال‌های جنگ", "کشتار موز",
                "نفرین خانوادگی", "پایان ماکوندو"
            )
        ),
        Book(
            id = "adv_mrs_dalloway",
            title = "Mrs Dalloway",
            titlePersian = "خانم دالووی",
            author = "Virginia Woolf",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "14.2K",
            chapterTitles = listOf(
                "صبحی در لندن", "سپتیموس اسمیت", "بازگشت پیتر والش",
                "مهمانی", "پایان روز"
            )
        ),
        Book(
            id = "adv_siddhartha",
            title = "Siddhartha",
            titlePersian = "سیدارتا",
            author = "Hermann Hesse",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFFE65100, gradientEnd = 0xFFFFB74D,
            views = "19.5K",
            chapterTitles = listOf(
                "پسر برهمن", "بودا", "کامالا و دنیا",
                "رودخانه", "روشن‌ضمیری"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group3 — ادبیات وجودی و مدرن
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_heart_darkness",
            title = "Heart of Darkness",
            titlePersian = "قلب تاریکی",
            author = "Joseph Conrad",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF212121, gradientEnd = 0xFF616161,
            views = "16.8K",
            chapterTitles = listOf(
                "کشتی نلی در تیمز", "ایستگاه شرکت", "سفر به بالادست",
                "کورتز", "وحشت"
            )
        ),
        Book(
            id = "adv_the_stranger",
            title = "The Stranger",
            titlePersian = "بیگانه",
            author = "Albert Camus",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "22.6K",
            chapterTitles = listOf(
                "مرگ مادر", "روزهای عادی", "ساحل",
                "زندان", "اعدام"
            )
        ),
        Book(
            id = "adv_remains_day",
            title = "The Remains of the Day",
            titlePersian = "باقی‌مانده روز",
            author = "Kazuo Ishiguro",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF4E342E, gradientEnd = 0xFFA1887F,
            views = "13.9K",
            chapterTitles = listOf(
                "سفر سرپیشخدمت", "خاطرات تالار دارلینگتون", "میس کنتون",
                "ملاقات", "باقی‌مانده روز"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group4 — ادبیات جنگ و وجود
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_farewell_arms",
            title = "A Farewell to Arms",
            titlePersian = "وداع با اسلحه",
            author = "Ernest Hemingway",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF42A5F5,
            views = "17.3K",
            chapterTitles = listOf(
                "آمریکایی در ایتالیا", "زخم", "عقب‌نشینی",
                "فرار به سوئیس", "وداع"
            )
        ),
        Book(
            id = "adv_the_plague",
            title = "The Plague",
            titlePersian = "طاعون",
            author = "Albert Camus",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF455A64, gradientEnd = 0xFF90A4AE,
            views = "20.5K",
            chapterTitles = listOf(
                "موش‌های اوران", "قرنطینه", "رنج",
                "نقطه عطف", "پایان طاعون"
            )
        ),
        Book(
            id = "adv_never_let_me_go",
            title = "Never Let Me Go",
            titlePersian = "هرگز رهایم مکن",
            author = "Kazuo Ishiguro",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF4DB6AC,
            views = "23.8K",
            chapterTitles = listOf(
                "هیلشم", "دوستی", "حقیقت",
                "کلبه‌ها", "پایان"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group5 — شاهکارهای نهایی
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_war_and_peace",
            title = "War and Peace",
            titlePersian = "جنگ و صلح",
            author = "Leo Tolstoy",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF1A237E, gradientEnd = 0xFF7986CB,
            views = "32.4K",
            chapterTitles = listOf(
                "سالن آنا پاولونا", "جنگ و مرگ شاهزاده", "ناتاشا روستوا",
                "جنگ ۱۸۱۲", "صلح"
            )
        ),
        Book(
            id = "adv_karamazov",
            title = "The Brothers Karamazov",
            titlePersian = "برادران کارامازوف",
            author = "Fyodor Dostoevsky",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF7E57C2,
            views = "26.7K",
            chapterTitles = listOf(
                "فیودور کارامازوف", "قتل", "محقق بزرگ",
                "جنون ایوان", "ایمان آلکسی"
            )
        ),
        Book(
            id = "adv_ulysses",
            title = "Ulysses",
            titlePersian = "اولیس",
            author = "James Joyce",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF283593, gradientEnd = 0xFF7986CB,
            views = "11.5K",
            chapterTitles = listOf(
                "صبح در دوبلین", "روز آقای بلوم", "ملاقات‌های بعدازظهر",
                "شهر شب", "بازگشت به خانه"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group6 — شاهکارهای قرن بیستم
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_the_trial",
            title = "The Trial",
            titlePersian = "محاکمه",
            author = "Franz Kafka",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF212121, gradientEnd = 0xFF757575,
            views = "20.8K",
            chapterTitles = listOf(
                "دستگیری", "اولین بازجویی", "وکیل و نقاش",
                "در کلیسا", "پایان"
            )
        ),
        Book(
            id = "adv_to_the_lighthouse",
            title = "To the Lighthouse",
            titlePersian = "به سوی فانوس دریایی",
            author = "Virginia Woolf",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF0277BD, gradientEnd = 0xFF4FC3F7,
            views = "15.4K",
            chapterTitles = listOf(
                "پنجره", "گذر زمان", "بازگشت",
                "رؤیای لیلی", "فانوس دریایی"
            )
        ),
        Book(
            id = "adv_beloved",
            title = "Beloved",
            titlePersian = "دلبند",
            author = "Toni Morrison",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF4DB6AC,
            views = "23.6K",
            chapterTitles = listOf(
                "خانه شماره ۱۲۴", "ورود پاول دی", "دختری از آب",
                "حقیقت ستی", "آزادسازی"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group7 — مدرنیسم قرن بیستم
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_sound_fury",
            title = "The Sound and the Fury",
            titlePersian = "خشم و هیاهو",
            author = "William Faulkner",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "14.7K",
            chapterTitles = listOf(
                "صدای بنجامین", "آخرین روز کوئنتین", "تلخی جیسون",
                "آرامش دیلزی", "ساعت شکسته"
            )
        ),
        Book(
            id = "adv_lolita",
            title = "Lolita",
            titlePersian = "لولیتا",
            author = "Vladimir Nabokov",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "22.3K",
            chapterTitles = listOf(
                "جوانی هومبرت", "ملاقات دلورس", "در جاده",
                "فرار", "پایان"
            )
        ),
        Book(
            id = "adv_master_margarita",
            title = "The Master and Margarita",
            titlePersian = "استاد و مارگاریتا",
            author = "Mikhail Bulgakov",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFFB71C1C, gradientEnd = 0xFFEF5350,
            views = "26.5K",
            chapterTitles = listOf(
                "شیطان در مسکو", "داستان استاد", "دگرگونی مارگاریتا",
                "داوری پیلاطس", "پایان داستان"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group8 — ادبیات اروپایی و آفریقایی
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_magic_mountain",
            title = "The Magic Mountain",
            titlePersian = "کوه جادو",
            author = "Thomas Mann",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFFECEFF1, gradientEnd = 0xFF90A4AE,
            views = "13.8K",
            chapterTitles = listOf(
                "ورود به آسایشگاه", "تشخیص", "ستیمبرینی و نافتا",
                "برف", "آذرخش"
            )
        ),
        Book(
            id = "adv_death_venice",
            title = "Death in Venice",
            titlePersian = "مرگ در ونیز",
            author = "Thomas Mann",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF4DB6AC,
            views = "17.2K",
            chapterTitles = listOf(
                "خستگی نویسنده", "تادزیو", "تعقیب",
                "طاعون", "آخرین روز"
            )
        ),
        Book(
            id = "adv_things_fall_apart",
            title = "Things Fall Apart",
            titlePersian = "آدم‌های ناچیز",
            author = "Chinua Achebe",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            views = "25.4K",
            chapterTitles = listOf(
                "جوانی اوکونکوو", "هفته صلح", "آمدن سفیدپوستان",
                "درگیری", "سقوط مرد قوی"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group9 — ادبیات پست‌مدرن
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_cuckoos_nest",
            title = "One Flew Over the Cuckoo's Nest",
            titlePersian = "پرواز بر فراز آشیانه فاخته",
            author = "Ken Kesey",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF4DB6AC,
            views = "21.7K",
            chapterTitles = listOf(
                "ورود به بخش", "مک‌مرفی قمارباز", "سفر ماهیگیری",
                "نبرد اراده‌ها", "فداکاری"
            )
        ),
        Book(
            id = "adv_slaughterhouse_five",
            title = "Slaughterhouse-Five",
            titlePersian = "کشتارگاه پنج",
            author = "Kurt Vonnegut",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "18.9K",
            chapterTitles = listOf(
                "سفر در زمان بیلی", "ترالفامادوری‌ها", "سال‌های جنگ",
                "پیامدها", "پایان و آغاز"
            )
        ),
        Book(
            id = "adv_unbearable_lightness",
            title = "The Unbearable Lightness of Being",
            titlePersian = "تحمل‌ناپذیری هستی",
            author = "Milan Kundera",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "24.1K",
            chapterTitles = listOf(
                "دکتر پراگی", "عشق ترزا", "سابینا نقاش",
                "تهاجم روسیه", "روستا"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  📚 Group10 — شاهکارهای معاصر
        // ═══════════════════════════════════════════════════════

        Book(
            id = "adv_blindness",
            title = "Blindness",
            titlePersian = "کوری",
            author = "José Saramago",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFFECEFF1, gradientEnd = 0xFF90A4AE,
            views = "20.2K",
            chapterTitles = listOf(
                "کوری سفید", "همسر دکتر", "داخل تیمارستان",
                "دنیای جدید", "بازگشت بینایی"
            )
        ),
        Book(
            id = "adv_name_rose",
            title = "The Name of the Rose",
            titlePersian = "نام گل سرخ",
            author = "Umberto Eco",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF4E342E, gradientEnd = 0xFFA1887F,
            views = "19.6K",
            chapterTitles = listOf(
                "دِیر", "کتابخانه", "بدعت‌گذاران",
                "راز فاش می‌شود", "ویرانه‌ها"
            )
        ),
        Book(
            id = "adv_hunger",
            title = "Hunger",
            titlePersian = "گرسنگی",
            author = "Knut Hamsun",
            category = BookCategory.STORY,
            level = "پیشرفته", levelEmoji = "🏆",
            totalChapters = 5,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "15.8K",
            chapterTitles = listOf(
                "نویسنده گرسنه", "رد شدن توسط سردبیر", "صاحب‌خانه",
                "خواب عجیب", "ترک شهر"
            )
        )
    )
}