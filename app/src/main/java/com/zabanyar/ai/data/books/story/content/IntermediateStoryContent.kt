package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

object IntermediateStories {
    fun getAll(): List<Book> = listOf(
        // ═══════════ Group 1 — Sherlock Holmes ═══════════
        Book(id = "study_in_scarlet", title = "A Study in Scarlet", titlePersian = "اتودی در قرمز", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "sign_of_four", title = "The Sign of Four", titlePersian = "نشانه چهار", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "scandal_bohemia", title = "A Scandal in Bohemia", titlePersian = "رسوایی در بوهم", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 2 — Agatha Christie ═══════════
        Book(id = "murder_roger_ackroyd", title = "The Murder of Roger Ackroyd", titlePersian = "قتل راجر آکروید", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "death_on_nile", title = "Death on the Nile", titlePersian = "مرگ روی نیل", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "and_then_there_were_none", title = "And Then There Were None", titlePersian = "و سپس هیچ‌کس نماند", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 3 — Noir ═══════════
        Book(id = "maltese_falcon", title = "The Maltese Falcon", titlePersian = "شاهین مالت", author = "Dashiell Hammett", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "big_sleep", title = "The Big Sleep", titlePersian = "خواب بزرگ", author = "Raymond Chandler", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "moonstone", title = "The Moonstone", titlePersian = "سنگ ماه", author = "Wilkie Collins", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 4 — Classic Horror ═══════════
        Book(id = "woman_in_white", title = "The Woman in White", titlePersian = "زن سفیدپوش", author = "Wilkie Collins", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "turn_of_the_screw", title = "The Turn of the Screw", titlePersian = "پیچ گوشتی", author = "Henry James", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "tell_tale_heart", title = "The Tell-Tale Heart", titlePersian = "قلب افشاگر", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 5 — Edgar Allan Poe ═══════════
        Book(id = "cask_of_amontillado", title = "The Cask of Amontillado", titlePersian = "بشکه آمونتیلادو", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "masque_red_death", title = "The Masque of the Red Death", titlePersian = "نقاب مرگ سرخ", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "haunting_hill_house", title = "The Haunting of Hill House", titlePersian = "تسخیر خانه هیل", author = "Shirley Jackson", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 6 — Modern Horror ═══════════
        Book(id = "the_shining", title = "The Shining", titlePersian = "درخشش", author = "Stephen King", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "dracula", title = "Dracula", titlePersian = "دراکولا", author = "Bram Stoker", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "frankenstein", title = "Frankenstein", titlePersian = "فرانکنشتاین", author = "Mary Shelley", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 7 — Classic ═══════════
        Book(id = "dorian_gray", title = "The Picture of Dorian Gray", titlePersian = "تصویر دوریان گری", author = "Oscar Wilde", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "jekyll_and_hyde", title = "Dr. Jekyll and Mr. Hyde", titlePersian = "دکتر جکیل و آقای هاید", author = "Robert Louis Stevenson", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "monte_cristo", title = "The Count of Monte Cristo", titlePersian = "کنت مونت کریستو", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 8 — Adventure ═══════════
        Book(id = "three_musketeers", title = "The Three Musketeers", titlePersian = "سه تفنگدار", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "iron_mask", title = "The Man in the Iron Mask", titlePersian = "مردی با نقاب آهنین", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "solomon_mines", title = "King Solomon's Mines", titlePersian = "معدن‌های شاه سلیمان", author = "H. Rider Haggard", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 9 — Jules Verne & Swift ═══════════
        Book(id = "center_of_earth", title = "Journey to the Center of the Earth", titlePersian = "سفر به مرکز زمین", author = "Jules Verne", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "twenty_thousand_leagues", title = "Twenty Thousand Leagues Under the Sea", titlePersian = "بیست هزار فرسنگ زیر دریا", author = "Jules Verne", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "gullivers_travels", title = "Gulliver's Travels", titlePersian = "سفرهای گالیور", author = "Jonathan Swift", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════ Group 10 — Classic Finishers ═══════════
        Book(id = "huckleberry_finn", title = "The Adventures of Huckleberry Finn", titlePersian = "ماجراهای هاکلبری فین", author = "Mark Twain", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "pride_prejudice", title = "Pride and Prejudice", titlePersian = "غرور و تعصب", author = "Jane Austen", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "jane_eyre", title = "Jane Eyre", titlePersian = "جین ایر", author = "Charlotte Brontë", level = "Intermediate", category = BookCategory.STORY, totalChapters = 5)
    )
}