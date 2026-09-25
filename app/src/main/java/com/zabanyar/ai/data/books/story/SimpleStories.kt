package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

/**
 * 📕 داستان‌های سطح ساده 🌱
 *
 * مناسب زبان‌آموزان مبتدی (A1-A2)
 * شامل ۵۰ داستان کلاسیک و مدرن
 * همه داستان‌ها ۵ فصلی
 */
object SimpleStories {

    fun getAll(): List<Book> = listOf(

        // ═══════════════════════════════════════════════════════
        //  🔍 کارآگاهی و معمایی
        // ═══════════════════════════════════════════════════════

        Book(
            id = "sherlock_blue_diamond",
            title = "Sherlock Holmes: The Blue Diamond",
            titlePersian = "الماس آبی",
            author = "Sir Arthur Conan Doyle",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "67", isNew = true,
            chapterTitles = listOf(
                "یک کلاه کهنه", "الماس آبی", "آقای هنری بیکر",
                "به سوی مغازه آقای برکینریج", "راز فاش می‌شود"
            )
        ),
        Book(
            id = "sherlock_speckled_band",
            title = "The Speckled Band",
            titlePersian = "نوار خال‌دار",
            author = "Sir Arthur Conan Doyle",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "16.8K",
            chapterTitles = listOf(
                "خواهر و خواهرزاده", "اتاق مرموز", "مار سمی",
                "دکتر رویلوت", "حقیقت آشکار می‌شود"
            )
        ),
        Book(
            id = "sherlock_red_headed",
            title = "The Red-Headed League",
            titlePersian = "اتحادیه سرخ‌موها",
            author = "Sir Arthur Conan Doyle",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFC62828, gradientEnd = 0xFFEF5350,
            views = "14.2K",
            chapterTitles = listOf(
                "کار عجیب", "اتحادیه سرخ‌موها", "ناپدید شدن ناگهانی",
                "تحقیقات شرلوک", "سرقت از بانک"
            )
        ),
        Book(
            id = "sherlock_top_secret",
            title = "The Top-Secret Plans",
            titlePersian = "طرح‌های فوق‌سری",
            author = "Sir Arthur Conan Doyle",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "22K",
            chapterTitles = listOf(
                "پیدا شدن نقشه‌ها", "دزد مرموز", "ردیابی",
                "ملاقات با مظنون", "تله هوشمندانه"
            )
        ),
        Book(
            id = "hounds_baskervilles",
            title = "The Hound of the Baskervilles",
            titlePersian = "سگ باسکرویل",
            author = "Sir Arthur Conan Doyle",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF4DB6AC,
            views = "27.6K", isNew = true,
            chapterTitles = listOf(
                "افسانه قدیمی", "مرگ سر چارلز", "کارآگاه هلمز",
                "مرداب وحشتناک", "حقیقت کشف می‌شود"
            )
        ),
        Book(
            id = "murder_orient_express",
            title = "Murder on the Orient Express",
            titlePersian = "قتل در قطار سریع‌السیر شرق",
            author = "Agatha Christie",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF4E342E, gradientEnd = 0xFFA1887F,
            views = "30.1K", isNew = true,
            chapterTitles = listOf(
                "سفر با قطار", "قتل مرموز", "کارآگاه پوآرو",
                "بازجویی مسافران", "راز کشف می‌شود"
            )
        ),
        Book(
            id = "mysterious_affair_styles",
            title = "The Mysterious Affair at Styles",
            titlePersian = "ماجرای مرموز در استایلز",
            author = "Agatha Christie",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF283593, gradientEnd = 0xFF7986CB,
            views = "18.4K", isNew = true,
            chapterTitles = listOf(
                "عمارت استایلز", "مرگ خانم اینگلتورپ",
                "کارآگاه پوآرو", "تحقیقات دقیق", "قاتل پیدا می‌شود"
            )
        ),
        Book(
            id = "monkeys_paw",
            title = "The Monkey's Paw",
            titlePersian = "پنجه میمون",
            author = "W. W. Jacobs",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "19.7K", isNew = true,
            chapterTitles = listOf(
                "هدیه عجیب", "سه آرزو", "آرزوی اول",
                "خبر بد", "آرزوی آخر"
            )
        ),
        Book(
            id = "woman_in_white",
            title = "The Woman in White",
            titlePersian = "زن سفیدپوش",
            author = "Wilkie Collins",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFECEFF1, gradientEnd = 0xFF90A4AE,
            views = "12.8K", isNew = true,
            chapterTitles = listOf(
                "زن مرموز", "ملاقات در شب", "راز خانوادگی",
                "توطئه بزرگ", "حقیقت آشکار"
            )
        ),
        Book(
            id = "moonstone",
            title = "The Moonstone",
            titlePersian = "سنگ ماه",
            author = "Wilkie Collins",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF42A5F5,
            views = "10.5K", isNew = true,
            chapterTitles = listOf(
                "الماس هندی", "جشن تولد", "گم شدن سنگ",
                "کارآگاه کاف", "راز حل می‌شود"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  👻 ترسناک و وحشت
        // ═══════════════════════════════════════════════════════

        Book(
            id = "curse_of_mummy",
            title = "Curse of the Mummy",
            titlePersian = "نفرین مومیایی",
            author = "Joyce Hannam",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF9575CD,
            views = "32.2K",
            chapterTitles = listOf(
                "مومیایی در موزه", "کتیبه مرموز", "شب وحشت",
                "طلسم مصر باستان", "راز فاش می‌شود"
            )
        ),
        Book(
            id = "halloween_horror",
            title = "Halloween Horror",
            titlePersian = "وحشت هالووین",
            author = "Gina D. B. Clemen",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF9575CD,
            views = "18.5K",
            chapterTitles = listOf(
                "شب هالووین", "خانه قدیمی", "صدای عجیب",
                "مهمانی وحشت", "حقیقت پشت دیوار"
            )
        ),
        Book(
            id = "phantom_opera",
            title = "The Phantom of the Opera",
            titlePersian = "شبح اپرا",
            author = "Gaston Leroux",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF7E57C2,
            views = "24.2K", isNew = true,
            chapterTitles = listOf(
                "شبح در تئاتر", "کریستین خواننده", "صدای مرموز",
                "زیرزمین تاریک", "پایان افسانه"
            )
        ),
        Book(
            id = "dracula_simple",
            title = "Dracula",
            titlePersian = "دراکولا",
            author = "Bram Stoker",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF7E57C2,
            views = "22.7K", isNew = true,
            chapterTitles = listOf(
                "سفر به ترانسیلوانیا", "قلعه کنت", "شب‌های وحشت",
                "فرار از قلعه", "نبرد نهایی"
            )
        ),
        Book(
            id = "frankenstein_simple",
            title = "Frankenstein",
            titlePersian = "فرانکنشتاین",
            author = "Mary Shelley",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF4DB6AC,
            views = "15.6K", isNew = true,
            chapterTitles = listOf(
                "دانشمند جوان", "خلق موجود", "وحشت و فرار",
                "تنهایی موجود", "پایان تراژیک"
            )
        ),
        Book(
            id = "jekyll_hyde",
            title = "Dr. Jekyll and Mr. Hyde",
            titlePersian = "دکتر جکیل و آقای هاید",
            author = "R. L. Stevenson",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF212121, gradientEnd = 0xFF757575,
            views = "20.9K", isNew = true,
            chapterTitles = listOf(
                "دکتر محترم", "آقای هاید عجیب", "نوشیدنی جادویی",
                "تبدیل وحشتناک", "پایان غم‌انگیز"
            )
        ),
        Book(
            id = "picture_dorian_gray",
            title = "The Picture of Dorian Gray",
            titlePersian = "تصویر دوریان گری",
            author = "Oscar Wilde",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "17.3K", isNew = true,
            chapterTitles = listOf(
                "نقاش و مدل", "آرزوی خطرناک", "جوانی ابدی",
                "گناهان پنهان", "پایان تاریک"
            )
        ),
        Book(
            id = "haunted_house",
            title = "The Haunted House",
            titlePersian = "خانه تسخیرشده",
            author = "Various Authors",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "14.6K", isNew = true,
            chapterTitles = listOf(
                "خانه قدیمی", "صدای شبانه", "ارواح خشمگین",
                "راز زیرزمین", "آزادی ارواح"
            )
        ),
        Book(
            id = "turn_of_screw",
            title = "The Turn of the Screw",
            titlePersian = "پیچ گوشتی",
            author = "Henry James",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "11.2K", isNew = true,
            chapterTitles = listOf(
                "معلم خانه جدید", "دو کودک عجیب", "ارواح پنهان",
                "ترس و وحشت", "پایان مبهم"
            )
        ),
        Book(
            id = "fall_house_usher",
            title = "The Fall of the House of Usher",
            titlePersian = "سقوط خانه آشر",
            author = "Edgar Allan Poe",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF212121, gradientEnd = 0xFF616161,
            views = "13.7K", isNew = true,
            chapterTitles = listOf(
                "دعوت دوست", "خانه تاریک", "خواهر بیمار",
                "شب وحشت", "سقوط خانه"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  🚀 ماجراجویی
        // ═══════════════════════════════════════════════════════

        Book(
            id = "titanic",
            title = "Titanic!",
            titlePersian = "تایتانیک!",
            author = "Paul Shipton",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF42A5F5,
            views = "31.8K", isNew = true,
            chapterTitles = listOf(
                "کشتی رویایی", "شروع سفر", "برخورد با کوه یخ",
                "شب فاجعه", "نجات‌یافتگان"
            )
        ),
        Book(
            id = "journey_center_earth",
            title = "Journey to the Center of the Earth",
            titlePersian = "سفر به مرکز زمین",
            author = "Jules Verne",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            views = "23.4K", isNew = true,
            chapterTitles = listOf(
                "کشف رمز قدیمی", "ورود به آتشفشان", "دنیای زیرزمینی",
                "موجودات عجیب", "بازگشت به سطح"
            )
        ),
        Book(
            id = "wizard_of_oz",
            title = "The Wizard of Oz",
            titlePersian = "جادوگر شهر اُز",
            author = "L. Frank Baum",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF00897B, gradientEnd = 0xFF4DB6AC,
            views = "29.3K", isNew = true,
            chapterTitles = listOf(
                "گردباد عجیب", "سفر در جاده زرد", "دوستان جدید",
                "جادوگر شهر اُز", "بازگشت به خانه"
            )
        ),
        Book(
            id = "three_musketeers",
            title = "The Three Musketeers",
            titlePersian = "سه تفنگدار",
            author = "Alexandre Dumas",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF0D47A1, gradientEnd = 0xFF42A5F5,
            views = "20.1K", isNew = true,
            chapterTitles = listOf(
                "دارتانیان جوان", "سه تفنگدار", "ماجراجویی در پاریس",
                "نجات ملکه", "پیروزی نهایی"
            )
        ),
        Book(
            id = "robin_hood",
            title = "Robin Hood",
            titlePersian = "رابین هود",
            author = "Howard Pyle",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "25.9K", isNew = true,
            chapterTitles = listOf(
                "دزد نجیب‌زاده", "جنگل شروود", "یاران شاد",
                "شاهزاده جان", "بازگشت شاه ریچارد"
            )
        ),
        Book(
            id = "king_solomons_mines",
            title = "King Solomon's Mines",
            titlePersian = "معدن‌های شاه سلیمان",
            author = "H. Rider Haggard",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            views = "16.4K", isNew = true,
            chapterTitles = listOf(
                "نقشه گنج", "سفر به آفریقا", "کوه‌های مرموز",
                "معدن الماس", "بازگشت با ثروت"
            )
        ),
        Book(
            id = "lost_world",
            title = "The Lost World",
            titlePersian = "دنیای گمشده",
            author = "Sir Arthur Conan Doyle",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "19.8K", isNew = true,
            chapterTitles = listOf(
                "پروفسور چلنجر", "سفر به آمریکای جنوبی", "دنیای ماقبل تاریخ",
                "دایناسورها", "بازگشت به لندن"
            )
        ),
        Book(
            id = "around_world_simple",
            title = "Around the World in 80 Days",
            titlePersian = "دور دنیا در ۸۰ روز",
            author = "Jules Verne",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF81C784,
            views = "21K", isNew = true,
            chapterTitles = listOf(
                "شرط بزرگ", "سفر آغاز می‌شود", "در هند و ژاپن",
                "در آمریکا", "بازگشت به لندن"
            )
        ),
        Book(
            id = "treasure_island_simple",
            title = "Treasure Island",
            titlePersian = "جزیره گنج",
            author = "R. L. Stevenson",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            views = "17.3K", isNew = true,
            chapterTitles = listOf(
                "پیرمرد دریایی", "نقشه گنج", "لانگ جان سیلور",
                "جزیره گنج", "نبرد نهایی"
            )
        ),
        Book(
            id = "robinson_crusoe_simple",
            title = "Robinson Crusoe",
            titlePersian = "رابینسون کروزو",
            author = "Daniel Defoe",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF37474F, gradientEnd = 0xFF90A4AE,
            views = "13.5K", isNew = true,
            chapterTitles = listOf(
                "شروع سفر", "غرق شدن کشتی", "زندگی در جزیره",
                "نجات جمعه", "بازگشت به خانه"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  💖 عاشقانه و کلاسیک
        // ═══════════════════════════════════════════════════════

        Book(
            id = "gift_of_magi",
            title = "The Gift of the Magi & Other Stories",
            titlePersian = "هدیه مغان و داستان‌های دیگر",
            author = "O. Henry",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFBA68C8,
            views = "15.2K",
            chapterTitles = listOf(
                "هدیه مغان", "آخرین برگ", "پلیس و سرود کلیسا",
                "بیست سال بعد", "یک داستان کریسمس"
            )
        ),
        Book(
            id = "little_prince",
            title = "The Little Prince",
            titlePersian = "شازده کوچولو",
            author = "Antoine de Saint-Exupéry",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF0288D1, gradientEnd = 0xFF81D4FA,
            views = "35K",
            chapterTitles = listOf(
                "خلبان در صحرا", "ملاقات شازده", "گل رز و روباه",
                "سفر به سیارات", "خداحافظی"
            )
        ),
        Book(
            id = "little_match_girl",
            title = "The Little Match Girl",
            titlePersian = "دخترک کبریت‌فروش",
            author = "Hans Christian Andersen",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "21.8K", isNew = true,
            chapterTitles = listOf(
                "شب سرد زمستان", "کبریت‌های جادویی", "رویاهای گرم",
                "مادربزرگ مهربان", "پایان آرام"
            )
        ),
        Book(
            id = "ugly_duckling",
            title = "The Ugly Duckling",
            titlePersian = "جوجه اردک زشت",
            author = "Hans Christian Andersen",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFFF6F00, gradientEnd = 0xFFFFB74D,
            views = "18.9K", isNew = true,
            chapterTitles = listOf(
                "تولد جوجه", "تنهایی و مسخره", "زمستان سخت",
                "بهار جدید", "تبدیل به قو"
            )
        ),
        Book(
            id = "cinderella",
            title = "Cinderella",
            titlePersian = "سیندرلا",
            author = "Charles Perrault",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF48FB1,
            views = "26.3K", isNew = true,
            chapterTitles = listOf(
                "دختر مهربان", "نامادری بد", "مهمانی قصر",
                "کفش شیشه‌ای", "ازدواج با شاهزاده"
            )
        ),
        Book(
            id = "snow_white",
            title = "Snow White",
            titlePersian = "سفیدبرفی",
            author = "Brothers Grimm",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF0288D1, gradientEnd = 0xFF81D4FA,
            views = "24.7K", isNew = true,
            chapterTitles = listOf(
                "شاهزاده زیبا", "ملکه حسود", "هفت کوتوله",
                "سیب سمی", "بیداری با بوسه"
            )
        ),
        Book(
            id = "sleeping_beauty",
            title = "Sleeping Beauty",
            titlePersian = "زیبای خفته",
            author = "Charles Perrault",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF9C27B0, gradientEnd = 0xFFCE93D8,
            views = "22.1K", isNew = true,
            chapterTitles = listOf(
                "جشن تولد", "نفرین پری", "خواب صد ساله",
                "شاهزاده نجات‌بخش", "بیداری و ازدواج"
            )
        ),
        Book(
            id = "beauty_beast",
            title = "Beauty and the Beast",
            titlePersian = "دیو و دلبر",
            author = "Jeanne-Marie Leprince",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF8BBD0,
            views = "25.4K", isNew = true,
            chapterTitles = listOf(
                "دختر زیبا", "قلعه جادویی", "دیو ترسناک",
                "عشق و مهربانی", "تبدیل به شاهزاده"
            )
        ),
        Book(
            id = "aladdin",
            title = "Aladdin",
            titlePersian = "علاءالدین",
            author = "Arabian Nights",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "28.6K", isNew = true,
            chapterTitles = listOf(
                "چراغ جادو", "غول چراغ", "شاهزاده خانم",
                "جادوگر خبیث", "پیروزی نهایی"
            )
        ),
        Book(
            id = "ali_baba",
            title = "Ali Baba and the Forty Thieves",
            titlePersian = "علی‌بابا و چهل دزد",
            author = "Arabian Nights",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFBF360C, gradientEnd = 0xFFFF8A65,
            views = "23.9K", isNew = true,
            chapterTitles = listOf(
                "غار جادویی", "چهل دزد", "کلمه سحرآمیز",
                "خادم باهوش", "ثروت ابدی"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  👨‍👩‍👧 خانوادگی و کودکانه
        // ═══════════════════════════════════════════════════════

        Book(
            id = "alice_wonderland",
            title = "Alice in Wonderland",
            titlePersian = "آلیس در سرزمین عجایب",
            author = "Lewis Carroll",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF48FB1,
            views = "28K",
            chapterTitles = listOf(
                "سوراخ خرگوش", "مهمانی چای", "گربه چشایر",
                "ملکه قلب‌ها", "بیداری آلیس"
            )
        ),
        Book(
            id = "peter_pan",
            title = "Peter Pan",
            titlePersian = "پیتر پن",
            author = "J. M. Barrie",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF0288D1, gradientEnd = 0xFF4FC3F7,
            views = "24K",
            chapterTitles = listOf(
                "پرواز به نِوِرلند", "پسران گمشده", "کاپیتان هوک",
                "نبرد دریایی", "بازگشت به خانه"
            )
        ),
        Book(
            id = "secret_garden",
            title = "The Secret Garden",
            titlePersian = "باغ مخفی",
            author = "Frances Hodgson Burnett",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF2E7D32, gradientEnd = 0xFF81C784,
            views = "12.4K",
            chapterTitles = listOf(
                "مری تنها", "کشف باغ", "دیکن مهربان",
                "کالین بیمار", "سلامتی و شادی"
            )
        ),
        Book(
            id = "black_beauty",
            title = "Black Beauty",
            titlePersian = "زیبای سیاه",
            author = "Anna Sewell",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF212121, gradientEnd = 0xFF757575,
            views = "8.7K",
            chapterTitles = listOf(
                "کره‌ای در مزرعه", "آموزش سواری", "زندگی سخت",
                "دوستی با جین", "بازگشت به آرامش"
            )
        ),
        Book(
            id = "elephant_man",
            title = "The Elephant Man",
            titlePersian = "مرد فیل‌نما",
            author = "Tim Vicary",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6D4C41, gradientEnd = 0xFFA1887F,
            views = "26.5K", isNew = true,
            chapterTitles = listOf(
                "مردی عجیب در بازار", "دکتر تریوز مهربان",
                "زندگی در بیمارستان", "دوستان جدید", "پایان غم‌انگیز"
            )
        ),
        Book(
            id = "princess_and_pea",
            title = "The Princess and the Pea",
            titlePersian = "شاهزاده خانم و نخود",
            author = "Hans Christian Andersen",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF9C27B0, gradientEnd = 0xFFCE93D8,
            views = "15.8K", isNew = true,
            chapterTitles = listOf(
                "شاهزاده تنها", "دختر خیس", "آزمایش ملکه",
                "بیست تخت‌خواب", "شاهزاده واقعی"
            )
        ),
        Book(
            id = "thumbelina",
            title = "Thumbelina",
            titlePersian = "بند انگشتی",
            author = "Hans Christian Andersen",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF8BBD0,
            views = "14.3K", isNew = true,
            chapterTitles = listOf(
                "دختر کوچک", "دزدیدن وزغ", "زمستان سرد",
                "پناهگاه موش", "پادشاه گل‌ها"
            )
        ),
        Book(
            id = "emperors_clothes",
            title = "The Emperor's New Clothes",
            titlePersian = "لباس جدید امپراتور",
            author = "Hans Christian Andersen",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFFF6F00, gradientEnd = 0xFFFFB74D,
            views = "17.2K", isNew = true,
            chapterTitles = listOf(
                "امپراتور خودپسند", "دو کلاهبردار", "لباس نامرئی",
                "رژه بزرگ", "کودک راستگو"
            )
        ),
        Book(
            id = "gingerbread_man",
            title = "The Gingerbread Man",
            titlePersian = "مرد نان‌زنجبیلی",
            author = "Folk Tale",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6D4C41, gradientEnd = 0xFFA1887F,
            views = "12.1K", isNew = true,
            chapterTitles = listOf(
                "پختن نان", "فرار مرد نان", "تعقیب و گریز",
                "تله روباه", "پایان نان‌زنجبیلی"
            )
        ),
        Book(
            id = "three_little_pigs",
            title = "The Three Little Pigs",
            titlePersian = "سه خوک کوچک",
            author = "Folk Tale",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF48FB1,
            views = "19.4K", isNew = true,
            chapterTitles = listOf(
                "سه برادر", "خانه کاه", "خانه چوبی",
                "خانه آجری", "شکست گرگ"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  🦁 حیوانات و طبیعت
        // ═══════════════════════════════════════════════════════

        Book(
            id = "jungle_book",
            title = "The Jungle Book",
            titlePersian = "کتاب جنگل",
            author = "Rudyard Kipling",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "27.3K", isNew = true,
            chapterTitles = listOf(
                "موگلی کوچک", "خانواده گرگ", "خرس بالو",
                "ببر شیرخان", "بازگشت به انسان‌ها"
            )
        ),
        Book(
            id = "call_of_wild_simple",
            title = "The Call of the Wild",
            titlePersian = "ندای وحش",
            author = "Jack London",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "10.5K", isNew = true,
            chapterTitles = listOf(
                "زندگی راحت باک", "ربوده شدن", "سفر به شمال",
                "رئیس سگ‌ها", "بازگشت به وحش"
            )
        ),
        Book(
            id = "white_fang_simple",
            title = "White Fang",
            titlePersian = "نیش سفید",
            author = "Jack London",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFECEFF1, gradientEnd = 0xFF90A4AE,
            views = "9.6K", isNew = true,
            chapterTitles = listOf(
                "تولد در وحش", "قانون طبیعت", "زندگی با انسان",
                "دوستی با ویدون", "آزادی و خانه"
            )
        ),
        Book(
            id = "charlottes_web",
            title = "Charlotte's Web",
            titlePersian = "تار شارلوت",
            author = "E. B. White",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF2E7D32, gradientEnd = 0xFF81C784,
            views = "22.8K", isNew = true,
            chapterTitles = listOf(
                "خوک کوچک", "دوستی با عنکبوت", "کلمات جادویی",
                "نمایشگاه کشاورزی", "پایان و یادگار"
            )
        ),
        Book(
            id = "velveteen_rabbit",
            title = "The Velveteen Rabbit",
            titlePersian = "خرگوش مخملی",
            author = "Margery Williams",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6D4C41, gradientEnd = 0xFFA1887F,
            views = "13.4K", isNew = true,
            chapterTitles = listOf(
                "هدیه کریسمس", "عشق پسر", "خرگوش‌های واقعی",
                "بیماری سرخک", "واقعی شدن"
            )
        ),
        Book(
            id = "wind_willows",
            title = "The Wind in the Willows",
            titlePersian = "باد در بیدها",
            author = "Kenneth Grahame",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF388E3C, gradientEnd = 0xFFA5D6A7,
            views = "11.7K", isNew = true,
            chapterTitles = listOf(
                "کنار رودخانه", "موش و مول", "وزغ ماجراجو",
                "جنگل وحش", "بازگشت به خانه"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  🌍 تاریخی و واقعی
        // ═══════════════════════════════════════════════════════

        Book(
            id = "diary_young_girl",
            title = "The Diary of a Young Girl",
            titlePersian = "خاطرات یک دختر جوان",
            author = "Anne Frank",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF455A64, gradientEnd = 0xFF90A4AE,
            views = "33.5K", isNew = true,
            chapterTitles = listOf(
                "زندگی در آمستردام", "مخفی شدن", "اتاق پنهان",
                "ترس و امید", "پایان تلخ"
            )
        ),
        Book(
            id = "christmas_carol",
            title = "A Christmas Carol",
            titlePersian = "سرود کریسمس",
            author = "Charles Dickens",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF4DB6AC,
            views = "19.7K",
            chapterTitles = listOf(
                "اسکروج بخیل", "روح کریسمس گذشته", "روح کریسمس حال",
                "روح کریسمس آینده", "بیداری و تغییر"
            )
        ),
        Book(
            id = "oliver_twist",
            title = "Oliver Twist",
            titlePersian = "الیور توییست",
            author = "Charles Dickens",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF212121, gradientEnd = 0xFF616161,
            views = "18.2K", isNew = true,
            chapterTitles = listOf(
                "یتیم کوچک", "فرار به لندن", "گروه دزدان",
                "آقای براونلو مهربان", "پایان خوش"
            )
        ),
        Book(
            id = "tom_sawyer_simple",
            title = "The Adventures of Tom Sawyer",
            titlePersian = "ماجراهای تام سایر",
            author = "Mark Twain",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFE65100, gradientEnd = 0xFFFFB74D,
            views = "11.8K", isNew = true,
            chapterTitles = listOf(
                "شیطنت‌های تام", "نقاشی دیوار", "فرار به جزیره",
                "گم شدن در غار", "پیدا کردن گنج"
            )
        ),
        Book(
            id = "huckleberry_finn_simple",
            title = "Huckleberry Finn",
            titlePersian = "هاکلبری فین",
            author = "Mark Twain",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF00695C, gradientEnd = 0xFF4DB6AC,
            views = "10.2K", isNew = true,
            chapterTitles = listOf(
                "فرار از خانه", "جزیره جکسون", "سفر با قایق",
                "کلاهبرداران", "آزادی جیم"
            )
        ),
        Book(
            id = "little_women",
            title = "Little Women",
            titlePersian = "زنان کوچک",
            author = "Louisa May Alcott",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFCE93D8,
            views = "16.7K", isNew = true,
            chapterTitles = listOf(
                "چهار خواهر", "کریسمس فقیرانه", "رویاها و آرزوها",
                "مشکلات زندگی", "شادی خانوادگی"
            )
        ),

        // ═══════════════════════════════════════════════════════
        //  🌟 مدرن و معاصر
        // ═══════════════════════════════════════════════════════

        Book(
            id = "harry_potter_simple",
            title = "Harry Potter and the Sorcerer's Stone",
            titlePersian = "هری پاتر و سنگ جادو",
            author = "J. K. Rowling",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF4A148C, gradientEnd = 0xFF9575CD,
            views = "45.2K", isNew = true,
            chapterTitles = listOf(
                "پسر یتیم", "نامه مرموز", "مدرسه هاگوارتز",
                "دوستان جدید", "مبارزه با ولدمورت"
            )
        ),
        Book(
            id = "chronicles_narnia",
            title = "The Chronicles of Narnia",
            titlePersian = "سرگذشت نارنیا",
            author = "C. S. Lewis",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF0277BD, gradientEnd = 0xFF4FC3F7,
            views = "26.8K", isNew = true,
            chapterTitles = listOf(
                "کمد جادویی", "سرزمین برفی", "شیر اصلان",
                "نبرد بزرگ", "بازگشت به خانه"
            )
        ),
        Book(
            id = "hobbit_simple",
            title = "The Hobbit",
            titlePersian = "هابیت",
            author = "J. R. R. Tolkien",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "29.7K", isNew = true,
            chapterTitles = listOf(
                "خانه هابیت", "سفر ناگهانی", "غار گالوم",
                "اژدهای اسماگ", "نبرد پنج ارتش"
            )
        ),
        Book(
            id = "charlie_chocolate",
            title = "Charlie and the Chocolate Factory",
            titlePersian = "چارلی و کارخانه شکلات‌سازی",
            author = "Roald Dahl",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6D4C41, gradientEnd = 0xFFA1887F,
            views = "31.2K", isNew = true,
            chapterTitles = listOf(
                "پسر فقیر", "بلیت طلایی", "ورود به کارخانه",
                "اتاق‌های عجیب", "جانشین آقای وانکا"
            )
        ),
        Book(
            id = "matilda",
            title = "Matilda",
            titlePersian = "ماتیلدا",
            author = "Roald Dahl",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFFE91E63, gradientEnd = 0xFFF48FB1,
            views = "24.3K", isNew = true,
            chapterTitles = listOf(
                "دختر نابغه", "والدین بی‌توجه", "مدیر ظالم",
                "قدرت جادویی", "پیروزی ماتیلدا"
            )
        ),
        Book(
            id = "bfg",
            title = "The BFG",
            titlePersian = "غول بزرگ مهربان",
            author = "Roald Dahl",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF6A1B9A, gradientEnd = 0xFFBA68C8,
            views = "20.5K", isNew = true,
            chapterTitles = listOf(
                "دزدیده شدن سوفی", "غول مهربان", "غول‌های بد",
                "نقشه فرار", "نجات همه کودکان"
            )
        ),
        Book(
            id = "james_giant_peach",
            title = "James and the Giant Peach",
            titlePersian = "جیمز و هلوی غول‌پیکر",
            author = "Roald Dahl",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF1B5E20, gradientEnd = 0xFF66BB6A,
            views = "18.6K", isNew = true,
            chapterTitles = listOf(
                "پسر تنها", "هلوی جادویی", "دوستان حشره",
                "سفر بر فراز اقیانوس", "رسیدن به نیویورک"
            )
        ),
        Book(
            id = "wonder",
            title = "Wonder",
            titlePersian = "شگفتی",
            author = "R. J. Palacio",
            category = BookCategory.STORY,
            level = "مبتدی", levelEmoji = "🌱", totalChapters = 5,
            gradientStart = 0xFF0288D1, gradientEnd = 0xFF81D4FA,
            views = "27.1K", isNew = true,
            chapterTitles = listOf(
                "پسر متفاوت", "شروع مدرسه", "دوستی واقعی",
                "پذیرش دیگران", "شگفتی زندگی"
            )
        )
    )
}