package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

object AdvancedStories {
    fun getAll(): List<Book> = listOf(
        // Group 1 - ادبیات روسی و آلمانی
        Book(id = "adv_crime_punishment", title = "Crime and Punishment", titlePersian = "جنایت و مکافات", author = "Fyodor Dostoevsky", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_anna_karenina", title = "Anna Karenina", titlePersian = "آنا کارنینا", author = "Leo Tolstoy", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_metamorphosis", title = "The Metamorphosis", titlePersian = "مسخ", author = "Franz Kafka", level = "Advanced", category = BookCategory.STORY),

        // Group 2 - ادبیات مدرن و فلسفی
        Book(id = "adv_hundred_years", title = "One Hundred Years of Solitude", titlePersian = "صد سال تنهایی", author = "Gabriel García Márquez", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_mrs_dalloway", title = "Mrs Dalloway", titlePersian = "خانم دالووی", author = "Virginia Woolf", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_siddhartha", title = "Siddhartha", titlePersian = "سیدارتا", author = "Hermann Hesse", level = "Advanced", category = BookCategory.STORY),

        // Group 3 - ادبیات وجودی و مدرن
        Book(id = "adv_heart_of_darkness", title = "Heart of Darkness", titlePersian = "قلب تاریکی", author = "Joseph Conrad", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_the_stranger", title = "The Stranger", titlePersian = "بیگانه", author = "Albert Camus", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_remains_of_the_day", title = "The Remains of the Day", titlePersian = "باقی‌مانده روز", author = "Kazuo Ishiguro", level = "Advanced", category = BookCategory.STORY),

        // Group 4 - ادبیات جنگ و وجود
        Book(id = "adv_farewell_to_arms", title = "A Farewell to Arms", titlePersian = "وداع با اسلحه", author = "Ernest Hemingway", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_the_plague", title = "The Plague", titlePersian = "طاعون", author = "Albert Camus", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_never_let_me_go", title = "Never Let Me Go", titlePersian = "هرگز رهایم مکن", author = "Kazuo Ishiguro", level = "Advanced", category = BookCategory.STORY),

        // Group 5 - شاهکارهای نهایی
        Book(id = "adv_war_and_peace", title = "War and Peace", titlePersian = "جنگ و صلح", author = "Leo Tolstoy", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_brothers_karamazov", title = "The Brothers Karamazov", titlePersian = "برادران کارامازوف", author = "Fyodor Dostoevsky", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_ulysses", title = "Ulysses", titlePersian = "اولیس", author = "James Joyce", level = "Advanced", category = BookCategory.STORY),

        // Group 6 - شاهکارهای قرن بیستم
        Book(id = "adv_the_trial", title = "The Trial", titlePersian = "محاکمه", author = "Franz Kafka", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_to_the_lighthouse", title = "To the Lighthouse", titlePersian = "به سوی فانوس دریایی", author = "Virginia Woolf", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_dubliners", title = "Dubliners", titlePersian = "دوبلینی‌ها", author = "James Joyce", level = "Advanced", category = BookCategory.STORY),

        // Group 7 - مدرنیسم قرن بیستم
        Book(id = "adv_sound_and_fury", title = "The Sound and the Fury", titlePersian = "خشم و هیاهو", author = "William Faulkner", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_lolita", title = "Lolita", titlePersian = "لولیتا", author = "Vladimir Nabokov", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_master_margarita", title = "The Master and Margarita", titlePersian = "استاد و مارگاریتا", author = "Mikhail Bulgakov", level = "Advanced", category = BookCategory.STORY),

        // Group 8 - ادبیات اروپایی و آفریقایی
        Book(id = "adv_wuthering_heights", title = "Wuthering Heights", titlePersian = "بلندی‌های بادگیر", author = "Emily Brontë", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_death_in_venice", title = "Death in Venice", titlePersian = "مرگ در ونیز", author = "Thomas Mann", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_unbearable_lightness", title = "The Unbearable Lightness of Being", titlePersian = "سبکی تحمل‌ناپذیر هستی", author = "Milan Kundera", level = "Advanced", category = BookCategory.STORY),

        // Group 9 - ادبیات پست‌مدرن
        Book(id = "adv_passage_to_india", title = "A Passage to India", titlePersian = "گذری به هند", author = "E.M. Forster", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_the_bell_jar", title = "The Bell Jar", titlePersian = "زنگ نجات", author = "Sylvia Plath", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_catcher_in_the_rye", title = "The Catcher in the Rye", titlePersian = "ناطور دشت", author = "J.D. Salinger", level = "Advanced", category = BookCategory.STORY),

        // Group 10 - شاهکارهای معاصر
        Book(id = "adv_blindness", title = "Blindness", titlePersian = "کوری", author = "José Saramago", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_name_rose", title = "The Name of the Rose", titlePersian = "نام گل سرخ", author = "Umberto Eco", level = "Advanced", category = BookCategory.STORY),
        Book(id = "adv_hunger", title = "Hunger", titlePersian = "گرسنگی", author = "Knut Hamsun", level = "Advanced", category = BookCategory.STORY)
    )
}