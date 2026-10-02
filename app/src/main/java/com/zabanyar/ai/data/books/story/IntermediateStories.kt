package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

object IntermediateStories {
    fun getAll(): List<Book> = listOf(
        // ═══════════════════════════════════════════════════════
        // Group 1
        // ═══════════════════════════════════════════════════════
        Book(id = "int_study_scarlet", title = "A Study in Scarlet", titlePersian = "اتودی در قرمز", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_sign_four", title = "The Sign of Four", titlePersian = "نشانه چهار", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_scandal_bohemia", title = "A Scandal in Bohemia", titlePersian = "رسوایی در بوهم", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 2
        // ═══════════════════════════════════════════════════════
        Book(id = "int_murder_ackroyd", title = "The Murder of Roger Ackroyd", titlePersian = "قتل راجر آکروید", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_death_nile", title = "Death on the Nile", titlePersian = "مرگ روی نیل", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_and_then_none", title = "And Then There Were None", titlePersian = "و سپس هیچ‌کس نماند", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 3
        // ═══════════════════════════════════════════════════════
        Book(id = "int_maltese_falcon", title = "The Maltese Falcon", titlePersian = "شاهین مالت", author = "Dashiell Hammett", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_big_sleep", title = "The Big Sleep", titlePersian = "خواب بزرگ", author = "Raymond Chandler", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_moonstone", title = "The Moonstone", titlePersian = "سنگ ماه", author = "Wilkie Collins", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 4
        // ═══════════════════════════════════════════════════════
        Book(id = "int_woman_white", title = "The Woman in White", titlePersian = "زن سفیدپوش", author = "Wilkie Collins", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_turn_screw", title = "The Turn of the Screw", titlePersian = "پیچ گوشتی", author = "Henry James", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_tell_tale_heart", title = "The Tell-Tale Heart", titlePersian = "قلب افشاگر", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 5
        // ═══════════════════════════════════════════════════════
        Book(id = "int_cask_amontillado", title = "The Cask of Amontillado", titlePersian = "بشکه آمونتیلادو", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_masque_red_death", title = "The Masque of the Red Death", titlePersian = "نقاب مرگ سرخ", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_haunting_hill", title = "The Haunting of Hill House", titlePersian = "تسخیر خانه هیل", author = "Shirley Jackson", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 6
        // ═══════════════════════════════════════════════════════
        Book(id = "int_shining", title = "The Shining", titlePersian = "درخشش", author = "Stephen King", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_dracula_int", title = "Dracula", titlePersian = "دراکولا", author = "Bram Stoker", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_frankenstein_int", title = "Frankenstein", titlePersian = "فرانکنشتاین", author = "Mary Shelley", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 7
        // ═══════════════════════════════════════════════════════
        Book(id = "int_picture_dorian", title = "The Picture of Dorian Gray", titlePersian = "تصویر دوریان گری", author = "Oscar Wilde", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_jekyll_hyde_int", title = "Dr. Jekyll and Mr. Hyde", titlePersian = "دکتر جکیل و آقای هاید", author = "Robert Louis Stevenson", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_monte_cristo", title = "The Count of Monte Cristo", titlePersian = "کنت مونت کریستو", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 8
        // ═══════════════════════════════════════════════════════
        Book(id = "int_three_musketeers_int", title = "The Three Musketeers", titlePersian = "سه تفنگدار", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_iron_mask", title = "The Man in the Iron Mask", titlePersian = "مردی با نقاب آهنین", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_king_solomon", title = "King Solomon's Mines", titlePersian = "معدن‌های شاه سلیمان", author = "H. Rider Haggard", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 9
        // ═══════════════════════════════════════════════════════
        Book(id = "int_journey_center_int", title = "Journey to the Center of the Earth", titlePersian = "سفر به مرکز زمین", author = "Jules Verne", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_20000_leagues", title = "Twenty Thousand Leagues Under the Sea", titlePersian = "بیست هزار فرسنگ زیر دریا", author = "Jules Verne", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_gulliver", title = "Gulliver's Travels", titlePersian = "سفرهای گالیور", author = "Jonathan Swift", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 10
        // ═══════════════════════════════════════════════════════
        Book(id = "int_huck_finn_int", title = "The Adventures of Huckleberry Finn", titlePersian = "ماجراهای هاکلبری فین", author = "Mark Twain", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_pride_int", title = "Pride and Prejudice", titlePersian = "غرور و تعصب", author = "Jane Austen", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "int_jane_eyre_int", title = "Jane Eyre", titlePersian = "جین ایر", author = "Charlotte Brontë", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // Group 11 — داستان‌های کلاسیک روسی
        // ═══════════════════════════════════════════════════════
        Book(id = "int_war_and_peace", title = "War and Peace", titlePersian = "جنگ و صلح", author = "Leo Tolstoy", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "int_crime_and_punishment", title = "Crime and Punishment", titlePersian = "جنایت و مکافات", author = "Fyodor Dostoevsky", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "int_anna_karenina", title = "Anna Karenina", titlePersian = "آنا کارنینا", author = "Leo Tolstoy", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),

        // ═══════════════════════════════════════════════════════
        // Group 12 — داستان‌های کلاسیک
        // ═══════════════════════════════════════════════════════
        Book(id = "int_moby_dick_int", title = "Moby Dick", titlePersian = "موبی دیک", author = "Herman Melville", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "int_tom_sawyer_int", title = "The Adventures of Tom Sawyer", titlePersian = "ماجراهای تام سایر", author = "Mark Twain", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "int_old_man_sea_int", title = "The Old Man and the Sea", titlePersian = "پیرمرد و دریا", author = "Ernest Hemingway", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),

        // ═══════════════════════════════════════════════════════
        // Group 13 — کلاسیک فرانسوی
        // ═══════════════════════════════════════════════════════
        Book(id = "int_madame_bovary_int", title = "Madame Bovary", titlePersian = "مادام بواری", author = "Gustave Flaubert", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "int_les_miserables_int", title = "Les Misérables", titlePersian = "بینوایان", author = "Victor Hugo", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "int_three_musketeers_v2", title = "The Three Musketeers", titlePersian = "سه تفنگدار", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),

        // ═══════════════════════════════════════════════════════
        // Group 14 — علمی-تخیلی
        // ═══════════════════════════════════════════════════════
        Book(id = "int_time_machine_int", title = "The Time Machine", titlePersian = "ماشین زمان", author = "H.G. Wells", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "int_war_worlds_int", title = "The War of the Worlds", titlePersian = "جنگ دنیاها", author = "H.G. Wells", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "int_1984_int", title = "1984", titlePersian = "۱۹۸۴", author = "George Orwell", level = "Intermediate", category = BookCategory.STORY, totalChapters = 4),

        // ═══════════════════════════════════════════════════════
        // Group 15 — مدرن
        // ═══════════════════════════════════════════════════════
        Book(id = "int_great_gatsby_int", title = "The Great Gatsby", titlePersian = "گتسبی بزرگ", author = "F. Scott Fitzgerald", level = "Intermediate", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "int_grapes_wrath_int", title = "The Grapes of Wrath", titlePersian = "خوشه‌های خشم", author = "John Steinbeck", level = "Intermediate", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "int_wuthering_heights_int", title = "Wuthering Heights", titlePersian = "بلندی‌های بادگیر", author = "Emily Brontë", level = "Intermediate", category = BookCategory.STORY, totalChapters = 6),
    )
}