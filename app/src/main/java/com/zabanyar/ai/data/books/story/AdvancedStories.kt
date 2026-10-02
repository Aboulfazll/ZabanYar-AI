package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.BookCategory

object AdvancedStories {
    fun getAll(): List<Book> = listOf(
        // ═══════════════════════════════════════════════════════
        // بخش اول: دوزبانه (۳۰ داستان) — از پوشه advanced/
        // ═══════════════════════════════════════════════════════

        // Group 1
        Book(id = "adv_crime_punishment", title = "Crime and Punishment", titlePersian = "جنایت و مکافات", author = "Fyodor Dostoevsky", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_anna_karenina", title = "Anna Karenina", titlePersian = "آنا کارنینا", author = "Leo Tolstoy", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_metamorphosis", title = "The Metamorphosis", titlePersian = "مسخ", author = "Franz Kafka", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 2
        Book(id = "adv_hundred_years", title = "One Hundred Years of Solitude", titlePersian = "صد سال تنهایی", author = "Gabriel García Márquez", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_mrs_dalloway", title = "Mrs Dalloway", titlePersian = "خانم دالووی", author = "Virginia Woolf", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_siddhartha", title = "Siddhartha", titlePersian = "سیدارتا", author = "Hermann Hesse", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 3
        Book(id = "adv_heart_darkness", title = "Heart of Darkness", titlePersian = "قلب تاریکی", author = "Joseph Conrad", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_the_stranger", title = "The Stranger", titlePersian = "بیگانه", author = "Albert Camus", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_remains_day", title = "The Remains of the Day", titlePersian = "باقی‌مانده روز", author = "Kazuo Ishiguro", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 4
        Book(id = "adv_farewell_arms", title = "A Farewell to Arms", titlePersian = "وداع با اسلحه", author = "Ernest Hemingway", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_the_plague", title = "The Plague", titlePersian = "طاعون", author = "Albert Camus", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_never_let_go", title = "Never Let Me Go", titlePersian = "هرگز رهایم مکن", author = "Kazuo Ishiguro", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 5
        Book(id = "adv_war_and_peace", title = "War and Peace", titlePersian = "جنگ و صلح", author = "Leo Tolstoy", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_karamazov", title = "The Brothers Karamazov", titlePersian = "برادران کارامازوف", author = "Fyodor Dostoevsky", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_ulysses", title = "Ulysses", titlePersian = "اولیس", author = "James Joyce", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 6
        Book(id = "adv_the_trial", title = "The Trial", titlePersian = "محاکمه", author = "Franz Kafka", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_to_the_lighthouse", title = "To the Lighthouse", titlePersian = "به سوی فانوس دریایی", author = "Virginia Woolf", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_beloved", title = "Beloved", titlePersian = "دلبند", author = "Toni Morrison", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 7
        Book(id = "adv_sound_and_fury", title = "The Sound and the Fury", titlePersian = "خشم و هیاهو", author = "William Faulkner", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_lolita", title = "Lolita", titlePersian = "لولیتا", author = "Vladimir Nabokov", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_master_and_margarita", title = "The Master and Margarita", titlePersian = "استاد و مارگاریتا", author = "Mikhail Bulgakov", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 8
        Book(id = "adv_the_magic_mountain", title = "The Magic Mountain", titlePersian = "کوه جادو", author = "Thomas Mann", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_death_in_venice", title = "Death in Venice", titlePersian = "مرگ در ونیز", author = "Thomas Mann", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_things_fall_apart", title = "Things Fall Apart", titlePersian = "آدم‌های ناچیز", author = "Chinua Achebe", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 9
        Book(id = "adv_one_flew_over_the_cuckoos_nest", title = "One Flew Over the Cuckoo's Nest", titlePersian = "پرواز بر فراز آشیانه فاخته", author = "Ken Kesey", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_slaughterhouse_five", title = "Slaughterhouse-Five", titlePersian = "کشتارگاه پنج", author = "Kurt Vonnegut", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_the_unbearable_lightness_of_being", title = "The Unbearable Lightness of Being", titlePersian = "سبکی تحمل‌ناپذیر هستی", author = "Milan Kundera", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // Group 10
        Book(id = "adv_blindness", title = "Blindness", titlePersian = "کوری", author = "José Saramago", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_name_rose", title = "The Name of the Rose", titlePersian = "نام گل سرخ", author = "Umberto Eco", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_hunger", title = "Hunger", titlePersian = "گرسنگی", author = "Knut Hamsun", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // بخش دوم: انگلیسی خالص (۳۰ داستان) — از پوشه advanced/en/
        // ═══════════════════════════════════════════════════════

        // EnGroup1
        Book(id = "adv_great_expectations", title = "Great Expectations", titlePersian = "", author = "Charles Dickens", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_oliver_twist", title = "Oliver Twist", titlePersian = "", author = "Charles Dickens", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_tale_of_two_cities", title = "A Tale of Two Cities", titlePersian = "", author = "Charles Dickens", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup2
        Book(id = "adv_moby_dick", title = "Moby Dick", titlePersian = "", author = "Herman Melville", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_great_gatsby", title = "The Great Gatsby", titlePersian = "", author = "F. Scott Fitzgerald", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_of_mice_and_men", title = "Of Mice and Men", titlePersian = "", author = "John Steinbeck", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup3
        Book(id = "adv_grapes_of_wrath", title = "The Grapes of Wrath", titlePersian = "", author = "John Steinbeck", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_to_kill_mockingbird", title = "To Kill a Mockingbird", titlePersian = "", author = "Harper Lee", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_1984", title = "1984", titlePersian = "", author = "George Orwell", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup4
        Book(id = "adv_old_man_sea", title = "The Old Man and the Sea", titlePersian = "", author = "Ernest Hemingway", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_sun_also_rises", title = "The Sun Also Rises", titlePersian = "", author = "Ernest Hemingway", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_catch_22", title = "Catch-22", titlePersian = "", author = "Joseph Heller", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup5
        Book(id = "adv_catcher_rye", title = "The Catcher in the Rye", titlePersian = "", author = "J.D. Salinger", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_on_the_road", title = "On the Road", titlePersian = "", author = "Jack Kerouac", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_invisible_man", title = "Invisible Man", titlePersian = "", author = "Ralph Ellison", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup6
        Book(id = "adv_color_purple", title = "The Color Purple", titlePersian = "", author = "Alice Walker", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_eyes_watching_god", title = "Their Eyes Were Watching God", titlePersian = "", author = "Zora Neale Hurston", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_midnights_children", title = "Midnight's Children", titlePersian = "", author = "Salman Rushdie", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup7
        Book(id = "adv_handmaids_tale", title = "The Handmaid's Tale", titlePersian = "", author = "Margaret Atwood", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_the_road", title = "The Road", titlePersian = "", author = "Cormac McCarthy", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_kite_runner", title = "The Kite Runner", titlePersian = "", author = "Khaled Hosseini", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup8
        Book(id = "adv_life_of_pi", title = "Life of Pi", titlePersian = "", author = "Yann Martel", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_book_thief", title = "The Book Thief", titlePersian = "", author = "Markus Zusak", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_atonement", title = "Atonement", titlePersian = "", author = "Ian McEwan", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup9
        Book(id = "adv_animal_farm", title = "Animal Farm", titlePersian = "", author = "George Orwell", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_brave_new_world", title = "Brave New World", titlePersian = "", author = "Aldous Huxley", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_fahrenheit_451", title = "Fahrenheit 451", titlePersian = "", author = "Ray Bradbury", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup10
        Book(id = "adv_namesake", title = "The Namesake", titlePersian = "", author = "Jhumpa Lahiri", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_half_yellow_sun", title = "Half of a Yellow Sun", titlePersian = "", author = "Chimamanda Ngozi Adichie", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_song_of_solomon", title = "Song of Solomon", titlePersian = "", author = "Toni Morrison", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // ═══════════════════════════════════════════════════════
        // بخش سوم: انگلیسی خالص جدید — EnGroup11-15 (NEW ✅)
        // ═══════════════════════════════════════════════════════

        // EnGroup11
        Book(id = "adv_jane_eyre", title = "Jane Eyre", titlePersian = "", author = "Charlotte Brontë", level = "Advanced", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "adv_wuthering_heights", title = "Wuthering Heights", titlePersian = "", author = "Emily Brontë", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_frankenstein", title = "Frankenstein", titlePersian = "", author = "Mary Shelley", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup12 (⚠️ storyId ها با _en تغییر کردن تا با Group5/6 تداخل نکنن)
        Book(id = "adv_ulysses_en", title = "Ulysses", titlePersian = "", author = "James Joyce", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_to_the_lighthouse_en", title = "To the Lighthouse", titlePersian = "", author = "Virginia Woolf", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup13 (⚠️ storyId ها با _en تغییر کردن تا با Group3/6 تداخل نکنن)
        Book(id = "adv_the_trial_en", title = "The Trial", titlePersian = "", author = "Franz Kafka", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_the_stranger_en", title = "The Stranger", titlePersian = "", author = "Albert Camus", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup14
        Book(id = "adv_crime_and_punishment", title = "Crime and Punishment", titlePersian = "", author = "Fyodor Dostoevsky", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),
        Book(id = "adv_the_metamorphosis", title = "The Metamorphosis", titlePersian = "", author = "Franz Kafka", level = "Advanced", category = BookCategory.STORY, totalChapters = 5),

        // EnGroup15
        Book(id = "adv_brothers_karamazov", title = "The Brothers Karamazov", titlePersian = "", author = "Fyodor Dostoevsky", level = "Advanced", category = BookCategory.STORY, totalChapters = 4),
        Book(id = "adv_madame_bovary", title = "Madame Bovary", titlePersian = "", author = "Gustave Flaubert", level = "Advanced", category = BookCategory.STORY, totalChapters = 4),

        // ═══════════════════════════════════════════════════════
        // بخش چهارم: جدید دوزبانه — Group11-15
        // ═══════════════════════════════════════════════════════

        // Group 11 — Russian Classics
        Book(id = "adv_hero_our_time", title = "A Hero of Our Time", titlePersian = "قهرمان زمان ما", author = "Mikhail Lermontov", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_dead_souls", title = "Dead Souls", titlePersian = "ارواح مرده", author = "Nikolai Gogol", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_notes_underground", title = "Notes from Underground", titlePersian = "یادداشت‌های زیرزمینی", author = "Fyodor Dostoevsky", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),

        // Group 12 — Existentialism
        Book(id = "adv_twilight_idols", title = "Twilight of the Idols", titlePersian = "گرگ و میش بت‌ها", author = "Friedrich Nietzsche", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_nausea", title = "Nausea", titlePersian = "تهوع", author = "Jean-Paul Sartre", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_the_fall", title = "The Fall", titlePersian = "سقوط", author = "Albert Camus", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),

        // Group 13 — Modern Literature
        Book(id = "adv_heart_of_darkness_v2", title = "Heart of Darkness", titlePersian = "قلب تاریکی", author = "Joseph Conrad", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_lord_jim", title = "Lord Jim", titlePersian = "لرد جیم", author = "Joseph Conrad", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_brave_new_world_v2", title = "Brave New World", titlePersian = "دنیای قشنگ نو", author = "Aldous Huxley", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),

        // Group 14 — 20th Century
        Book(id = "adv_gone_with_the_wind", title = "Gone with the Wind", titlePersian = "بربادرفته", author = "Margaret Mitchell", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_billy_budd", title = "Billy Budd", titlePersian = "بیلی باد", author = "Herman Melville", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_quiet_american", title = "The Quiet American", titlePersian = "آمریکایی آرام", author = "Graham Greene", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),

        // Group 15 — Existentialism & Modern
        Book(id = "adv_birth_tragedy", title = "The Birth of Tragedy", titlePersian = "تولد تراژدی", author = "Friedrich Nietzsche", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_mans_search_meaning", title = "Man's Search for Meaning", titlePersian = "انسان در جستجوی معنا", author = "Viktor Frankl", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
        Book(id = "adv_love_cholera", title = "Love in the Time of Cholera", titlePersian = "عشق در زمان وبا", author = "Gabriel García Márquez", level = "Advanced", category = BookCategory.STORY, totalChapters = 6),
    )
}