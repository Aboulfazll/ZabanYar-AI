package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

/**
 * 📕 داستان‌های سطح ساده 🌱
 * مناسب زبان‌آموزان مبتدی (A1-A2)
 */
object SimpleStories {

    fun getAll(): List<Book> = listOf(

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
}