package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

object IntermediateStories {
    fun getAll(): List<Book> = listOf(
        // Group1 - Sherlock Holmes
        Book(id = "intermediate_1", title = "A Study in Scarlet", titlePersian = "اتودی در قرمز", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_2", title = "The Sign of Four", titlePersian = "نشانه چهار", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_3", title = "A Scandal in Bohemia", titlePersian = "رسوایی در بوهم", author = "Arthur Conan Doyle", level = "Intermediate", category = BookCategory.STORY),

        // Group2 - Agatha Christie
        Book(id = "intermediate_4", title = "The Murder of Roger Ackroyd", titlePersian = "قتل راجر آکروید", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_5", title = "Death on the Nile", titlePersian = "مرگ روی نیل", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_6", title = "And Then There Were None", titlePersian = "و سپس هیچ‌کس نماند", author = "Agatha Christie", level = "Intermediate", category = BookCategory.STORY),

        // Group3 - Noir
        Book(id = "intermediate_7", title = "The Maltese Falcon", titlePersian = "شاهین مالت", author = "Dashiell Hammett", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_8", title = "The Big Sleep", titlePersian = "خواب بزرگ", author = "Raymond Chandler", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_9", title = "The Moonstone", titlePersian = "سنگ ماه", author = "Wilkie Collins", level = "Intermediate", category = BookCategory.STORY),

        // Group4 - Classic Horror
        Book(id = "intermediate_10", title = "The Woman in White", titlePersian = "زن سفیدپوش", author = "Wilkie Collins", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_11", title = "The Turn of the Screw", titlePersian = "پیچ گوشتی", author = "Henry James", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_12", title = "The Tell-Tale Heart", titlePersian = "قلب افشاگر", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY),

        // Group5 - Edgar Allan Poe
        Book(id = "intermediate_13", title = "The Cask of Amontillado", titlePersian = "بشکه آمونتیلادو", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_14", title = "The Masque of the Red Death", titlePersian = "نقاب مرگ سرخ", author = "Edgar Allan Poe", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_15", title = "The Haunting of Hill House", titlePersian = "تسخیر خانه هیل", author = "Shirley Jackson", level = "Intermediate", category = BookCategory.STORY),

        // Group6 - Modern Horror
        Book(id = "intermediate_16", title = "The Shining", titlePersian = "درخشش", author = "Stephen King", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_17", title = "Dracula", titlePersian = "دراکولا", author = "Bram Stoker", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_18", title = "Frankenstein", titlePersian = "فرانکنشتاین", author = "Mary Shelley", level = "Intermediate", category = BookCategory.STORY),

        // Group7 - Classic
        Book(id = "intermediate_19", title = "The Picture of Dorian Gray", titlePersian = "تصویر دوریان گری", author = "Oscar Wilde", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_20", title = "Dr. Jekyll and Mr. Hyde", titlePersian = "دکتر جکیل و آقای هاید", author = "Robert Louis Stevenson", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_21", title = "The Count of Monte Cristo", titlePersian = "کنت مونت کریستو", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY),

        // Group8 - Adventure
        Book(id = "intermediate_22", title = "The Three Musketeers", titlePersian = "سه تفنگدار", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_23", title = "The Man in the Iron Mask", titlePersian = "مردی با نقاب آهنین", author = "Alexandre Dumas", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_24", title = "King Solomon's Mines", titlePersian = "معدن‌های شاه سلیمان", author = "H. Rider Haggard", level = "Intermediate", category = BookCategory.STORY),

        // Group9 - Jules Verne & Swift
        Book(id = "intermediate_25", title = "Journey to the Center of the Earth", titlePersian = "سفر به مرکز زمین", author = "Jules Verne", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_26", title = "Twenty Thousand Leagues Under the Sea", titlePersian = "بیست هزار فرسنگ زیر دریا", author = "Jules Verne", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_27", title = "Gulliver's Travels", titlePersian = "سفرهای گالیور", author = "Jonathan Swift", level = "Intermediate", category = BookCategory.STORY),

        // Group10 - Classic Finishers
        Book(id = "intermediate_28", title = "The Adventures of Huckleberry Finn", titlePersian = "ماجراهای هاکلبری فین", author = "Mark Twain", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_29", title = "Pride and Prejudice", titlePersian = "غرور و تعصب", author = "Jane Austen", level = "Intermediate", category = BookCategory.STORY),
        Book(id = "intermediate_30", title = "Jane Eyre", titlePersian = "جین ایر", author = "Charlotte Brontë", level = "Intermediate", category = BookCategory.STORY)
    )
}