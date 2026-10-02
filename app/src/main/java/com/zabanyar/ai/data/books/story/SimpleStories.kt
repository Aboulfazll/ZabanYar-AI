package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

object SimpleStories {
    fun getAll(): List<Book> = listOf(
        // ═══════════════════════════════════════════════════════
        // Group 1 — Sherlock Holmes
        // ═══════════════════════════════════════════════════════
        Book(id = "sherlock_blue_diamond", title = "The Blue Diamond", titlePersian = "الماس آبی", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "sherlock_speckled_band", title = "The Speckled Band", titlePersian = "نوار خالدار", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "sherlock_red_headed", title = "The Red-Headed League", titlePersian = "اتحادیه سرخ‌موها", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "sherlock_top_secret", title = "The Top-Secret Plans", titlePersian = "طرح‌های فوق‌سری", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "hounds_baskervilles", title = "The Hound of the Baskervilles", titlePersian = "سگ باسکرویل", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 2 — Horror & Mystery
        // ═══════════════════════════════════════════════════════
        Book(id = "curse_of_mummy", title = "The Mummy's Curse", titlePersian = "نفرین مومیایی", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "halloween_horror", title = "Halloween Horror", titlePersian = "وحشت هالووین", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "phantom_opera", title = "The Phantom of the Opera", titlePersian = "شبح اپرا", author = "Gaston Leroux", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "monkeys_paw", title = "The Monkey's Paw", titlePersian = "پنجه میمون", author = "W.W. Jacobs", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "gift_of_magi", title = "The Gift of the Magi", titlePersian = "هدیه مغان", author = "O. Henry", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 3 — Children's Classics
        // ═══════════════════════════════════════════════════════
        Book(id = "alice_wonderland", title = "Alice in Wonderland", titlePersian = "آلیس در سرزمین عجایب", author = "Lewis Carroll", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "peter_pan", title = "Peter Pan", titlePersian = "پیتر پن", author = "J.M. Barrie", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "little_prince", title = "The Little Prince", titlePersian = "شاهزاده کوچولو", author = "Antoine de Saint-Exupéry", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "secret_garden", title = "The Secret Garden", titlePersian = "باغ مخفی", author = "Frances Hodgson Burnett", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "black_beauty", title = "Black Beauty", titlePersian = "زیبای سیاه", author = "Anna Sewell", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 4 — Adventure
        // ═══════════════════════════════════════════════════════
        Book(id = "wizard_of_oz", title = "The Wizard of Oz", titlePersian = "جادوگر شهر اُز", author = "L. Frank Baum", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "titanic", title = "Titanic", titlePersian = "تایتانیک", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "elephant_man", title = "The Elephant Man", titlePersian = "مرد فیل‌نما", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "journey_center_earth", title = "Journey to the Center of the Earth", titlePersian = "سفر به مرکز زمین", author = "Jules Verne", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "robin_hood", title = "Robin Hood", titlePersian = "رابین هود", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 5 — Fairy Tales
        // ═══════════════════════════════════════════════════════
        Book(id = "cinderella", title = "Cinderella", titlePersian = "سیندرلا", author = "Charles Perrault", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "snow_white", title = "Snow White", titlePersian = "سفیدبرفی", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "sleeping_beauty", title = "Sleeping Beauty", titlePersian = "زیبای خفته", author = "Charles Perrault", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "beauty_beast", title = "Beauty and the Beast", titlePersian = "دیو و دلبر", author = "Gabrielle-Suzanne Barbot", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "aladdin", title = "Aladdin", titlePersian = "علاءالدین", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 6 — Eastern & Adventure
        // ═══════════════════════════════════════════════════════
        Book(id = "ali_baba", title = "Ali Baba and the Forty Thieves", titlePersian = "علی‌بابا و چهل دزد", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "jungle_book", title = "The Jungle Book", titlePersian = "کتاب جنگل", author = "Rudyard Kipling", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "ugly_duckling", title = "The Ugly Duckling", titlePersian = "جوجه اردک زشت", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "emperors_clothes", title = "The Emperor's New Clothes", titlePersian = "لباس جدید امپراتور", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "gingerbread_man", title = "The Gingerbread Man", titlePersian = "مرد نان‌زنجبیلی", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 7 — Fairy Tales
        // ═══════════════════════════════════════════════════════
        Book(id = "little_mermaid", title = "The Little Mermaid", titlePersian = "پری دریایی کوچک", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "hansel_gretel", title = "Hansel and Gretel", titlePersian = "هانسل و گرتل", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "jack_beanstalk", title = "Jack and the Beanstalk", titlePersian = "جک و لوبیای سحرآمیز", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "rapunzel", title = "Rapunzel", titlePersian = "راپونزل", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "nightingale", title = "The Nightingale", titlePersian = "بلبل", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 8 — Famous Fairy Tales
        // ═══════════════════════════════════════════════════════
        Book(id = "three_little_pigs", title = "The Three Little Pigs", titlePersian = "سه خوک کوچک", author = "Unknown", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "red_riding_hood", title = "Little Red Riding Hood", titlePersian = "شنل قرمزی", author = "Charles Perrault", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "puss_in_boots", title = "Puss in Boots", titlePersian = "گربه چکمه‌پوش", author = "Charles Perrault", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "princess_and_pea", title = "The Princess and the Pea", titlePersian = "شاهزاده خانم و نخود", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "thumbelina", title = "Thumbelina", titlePersian = "بند انگشتی", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 9 — Aesop's Fables
        // ═══════════════════════════════════════════════════════
        Book(id = "simple_46", title = "The Crow and the Pitcher", titlePersian = "کلاغ تشنه", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_47", title = "The Ant and the Grasshopper", titlePersian = "موریانه و ملخ", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_48", title = "The Lion and the Mouse", titlePersian = "شیر و موش", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_49", title = "The Fox and the Grapes", titlePersian = "روباه و انگور", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "simple_50", title = "The Honest Woodcutter", titlePersian = "چوب‌بر صادق", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 10 — Lesser-Known Legends
        // ═══════════════════════════════════════════════════════
        Book(id = "rumpelstiltskin", title = "Rumpelstiltskin", titlePersian = "رامپل‌استیلتسکین", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "elves_shoemaker", title = "The Elves and the Shoemaker", titlePersian = "کفاش و الف‌ها", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "frog_prince", title = "The Frog Prince", titlePersian = "شاهزاده قورباغه", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "bremen_musicians", title = "The Town Musicians of Bremen", titlePersian = "نوازندگان شهر بریمن", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "steadfast_tin_soldier", title = "The Steadfast Tin Soldier", titlePersian = "سرباز قلعه ثابت‌قدم", author = "Hans Christian Andersen", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 11 — Sherlock Holmes (NEW ✅)
        // ═══════════════════════════════════════════════════════
        Book(id = "sherlock_case_identity", title = "A Case of Identity", titlePersian = "معمای هویت", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "sherlock_boscombe_valley", title = "The Boscombe Valley Mystery", titlePersian = "معمای دره بوسکوم", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "sherlock_five_orange_pips", title = "The Five Orange Pips", titlePersian = "پنج دانه پرتقال", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "sherlock_twisted_lip", title = "The Man with the Twisted Lip", titlePersian = "مرد با لب شکری", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),
        Book(id = "sherlock_engineers_thumb", title = "The Engineer's Thumb", titlePersian = "انگشت شست مهندس", author = "Arthur Conan Doyle", level = "Simple", category = BookCategory.STORY, totalChapters = 7),

        // ═══════════════════════════════════════════════════════
        // Group 12 — Aesop's Fables (NEW ✅)
        // ═══════════════════════════════════════════════════════
        Book(id = "lion_and_mouse", title = "The Lion and the Mouse", titlePersian = "شیر و موش", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "tortoise_and_hare", title = "The Tortoise and the Hare", titlePersian = "لاک‌پشت و خرگوش", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "boy_who_cried_wolf", title = "The Boy Who Cried Wolf", titlePersian = "پسرک چوپان دروغگو", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "fox_and_grapes", title = "The Fox and the Grapes", titlePersian = "روباه و انگور", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "ant_and_grasshopper", title = "The Ant and the Grasshopper", titlePersian = "مورچه و ملخ", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),

        // ═══════════════════════════════════════════════════════
        // Group 13 — Aesop's Fables (NEW ✅)
        // ═══════════════════════════════════════════════════════
        Book(id = "wolf_in_sheep_clothing", title = "The Wolf in Sheep's Clothing", titlePersian = "گرگ در لباس گوسفند", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "country_mouse_city_mouse", title = "The Country Mouse and the City Mouse", titlePersian = "موش روستایی و موش شهری", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "milkmaid_and_pail", title = "The Milkmaid and Her Pail", titlePersian = "دختر شیرفروش و سطلش", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "crow_and_pitcher", title = "The Crow and the Pitcher", titlePersian = "کلاغ و کوزه", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "golden_goose", title = "The Golden Goose", titlePersian = "غاز طلایی", author = "Brothers Grimm", level = "Simple", category = BookCategory.STORY, totalChapters = 4),

        // ═══════════════════════════════════════════════════════
        // Group 14 — Aesop's Fables (NEW ✅)
        // ═══════════════════════════════════════════════════════
        Book(id = "two_frogs", title = "The Two Frogs", titlePersian = "دو قورباغه", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "bear_and_travelers", title = "The Bear and the Travelers", titlePersian = "خرس و دو مسافر", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "bundle_of_sticks", title = "The Bundle of Sticks", titlePersian = "دسته چوب", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "farmer_and_sons", title = "The Farmer and His Sons", titlePersian = "کشاورز و پسرانش", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "wind_and_sun", title = "The North Wind and the Sun", titlePersian = "باد و خورشید", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),

        // ═══════════════════════════════════════════════════════
        // Group 15 — Aesop's Fables (NEW ✅)
        // ═══════════════════════════════════════════════════════
        Book(id = "dog_and_reflection", title = "The Dog and His Reflection", titlePersian = "سگ و انعکاسش", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "goose_golden_eggs_v2", title = "The Goose That Laid Golden Eggs", titlePersian = "مرغ تخم‌طلا", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "mouse_and_lion_v2", title = "The Mouse and the Lion", titlePersian = "موش و شیر", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "fox_and_crow", title = "The Fox and the Crow", titlePersian = "روباه و کلاغ", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "ant_and_dove", title = "The Ant and the Dove", titlePersian = "مورچه و کبوتر", author = "Aesop", level = "Simple", category = BookCategory.STORY, totalChapters = 4),
    )
}