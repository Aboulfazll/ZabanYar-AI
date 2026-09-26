package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

object SimpleStories {
    fun getAll(): List<Book> = listOf(
        // Group 1
        Book(id = "simple_1", title = "The Adventure of the Blue Carbuncle", titlePersian = "الماس آب", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_2", title = "The Speckled Band", titlePersian = "نوار خالدار", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_3", title = "The Red-Headed League", titlePersian = "اتحادیه سرخ‌موها", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_4", title = "The Adventure of the Norwood Builder", titlePersian = "طرح‌های فوق‌سری", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_5", title = "The Hound of the Baskervilles", titlePersian = "سگ باسکرویل", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 2
        Book(id = "simple_6", title = "The Mummy's Curse", titlePersian = "نفرین مومیایی", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_7", title = "Halloween Horror", titlePersian = "وحشت هالووین", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_8", title = "The Phantom of the Opera", titlePersian = "شبح اپرا", author = "Gaston Leroux", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_9", title = "The Monkey's Paw", titlePersian = "پنجه میمون", author = "W.W. Jacobs", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_10", title = "The Gift of the Magi", titlePersian = "هدیه مغان", author = "O. Henry", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 3
        Book(id = "simple_11", title = "Alice in Wonderland", titlePersian = "آلیس در سرزمین عجایب", author = "Lewis Carroll", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_12", title = "Peter Pan", titlePersian = "پیتر پن", author = "J.M. Barrie", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_13", title = "The Little Prince", titlePersian = "شاهزاده کوچولو", author = "Antoine de Saint-Exupéry", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_14", title = "The Secret Garden", titlePersian = "باغ مخفی", author = "Frances Hodgson Burnett", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_15", title = "Black Beauty", titlePersian = "زیبای سیاه", author = "Anna Sewell", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 4
        Book(id = "simple_16", title = "The Wizard of Oz", titlePersian = "جادوگر شهر اُز", author = "L. Frank Baum", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_17", title = "Titanic", titlePersian = "تایتانیک", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_18", title = "The Elephant Man", titlePersian = "مرد فیل‌نما", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_19", title = "Journey to the Center of the Earth", titlePersian = "سفر به مرکز زمین", author = "Jules Verne", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_20", title = "Robin Hood", titlePersian = "رابین هود", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 5
        Book(id = "simple_21", title = "Cinderella", titlePersian = "سیندرلا", author = "Charles Perrault", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_22", title = "Snow White", titlePersian = "سفیدبرفی", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_23", title = "Sleeping Beauty", titlePersian = "زیبای خفته", author = "Charles Perrault", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_24", title = "Beauty and the Beast", titlePersian = "دیو و دلبر", author = "Gabrielle-Suzanne Barbot", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_25", title = "Aladdin", titlePersian = "علاءالدین", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 6
        Book(id = "simple_26", title = "Ali Baba and the Forty Thieves", titlePersian = "علی‌بابا و چهل دزد", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_27", title = "The Jungle Book", titlePersian = "کتاب جنگل", author = "Rudyard Kipling", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_28", title = "Bread and Wine", titlePersian = "نان و شراب", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_29", title = "The Ugly Duckling", titlePersian = "جوجه اردک زشت", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_30", title = "The Emperor's New Clothes", titlePersian = "لباس جدید امپراتور", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 7
        Book(id = "simple_31", title = "The Little Mermaid", titlePersian = "پری دریایی کوچک", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_32", title = "Hansel and Gretel", titlePersian = "هانسل و گرتل", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_33", title = "Jack and the Beanstalk", titlePersian = "جک و لوبیای سحرآمیز", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_34", title = "Rapunzel", titlePersian = "راپونزل", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_35", title = "The Nightingale", titlePersian = "بلبل", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 8
        Book(id = "simple_36", title = "The Three Little Pigs", titlePersian = "سه خوک کوچک", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_37", title = "Little Red Riding Hood", titlePersian = "شنل قرمزی", author = "Charles Perrault", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_38", title = "Puss in Boots", titlePersian = "گربه چکمه‌پوش", author = "Charles Perrault", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_39", title = "The Princess and the Pea", titlePersian = "شاهزاده خانم و نخود", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_40", title = "Thumbelina", titlePersian = "بند انگشتی", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 9
        Book(id = "simple_41", title = "Rumpelstiltskin", titlePersian = "رامپل استیلتسکین", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_42", title = "The Elves and the Shoemaker", titlePersian = "کفاش و الف‌ها", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_43", title = "The Frog Prince", titlePersian = "شاهزاده قورباغه", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_44", title = "The Town Musicians of Bremen", titlePersian = "نوازندگان شهر بریمن", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_45", title = "The Steadfast Tin Soldier", titlePersian = "سرباز قلعه ثابت‌قدم", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // Group 10 (جدید)
        Book(id = "simple_46", title = "The Crow and the Pitcher", titlePersian = "کلاغ تشنه", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_47", title = "The Ant and the Grasshopper", titlePersian = "موریانه و ملخ", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_48", title = "The Lion and the Mouse", titlePersian = "شیر و موش", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_49", title = "The Fox and the Grapes", titlePersian = "روباه و انگور", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_50", title = "The Honest Woodcutter", titlePersian = "چوب‌بر صادق", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7)
    )
}