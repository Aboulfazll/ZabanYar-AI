package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group2 — ۵ داستان ترسناک و معمایی
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۶. نفرین مومیایی
 *  ۷. وحشت هالووین
 *  ۸. شبح اپرا
 *  ۹. پنجه میمون
 *  ۱۰. هدیه مغان
 */
object Group2 {

    fun getAll(): List<StoryContent> = listOf(
        story6(), story7(), story8(), story9(), story10()
    )

    // ═══════════════════════════════════════════════════════
    //  ۶: نفرین مومیایی
    // ═══════════════════════════════════════════════════════
    private fun story6() = StoryContent(
        storyId = "curse_of_mummy",
        chapters = listOf(
            StoryChapter(1, "The Mummy in the Museum", "مومیایی در موزه", listOf(
                StoryParagraph("A new mummy arrived at the museum.", "مومیایی جدیدی به موزه رسید."),
                StoryParagraph("It was from ancient Egypt.", "از مصر باستان بود."),
                StoryParagraph("The museum was in London.", "موزه در لندن بود."),
                StoryParagraph("A young man named Tom worked there.", "مرد جوانی به نام تام آنجا کار می‌کرد."),
                StoryParagraph("He was a guard at night.", "او شب‌ها نگهبان بود."),
                StoryParagraph("The mummy was in a golden case.", "مومیایی در تابوتی طلایی بود."),
                StoryParagraph("The case had strange writing on it.", "تابوت نوشته‌های عجیبی داشت."),
                StoryParagraph("No one could read the writing.", "هیچ‌کس نمی‌توانست نوشته‌ها را بخواند."),
                StoryParagraph("Tom felt afraid when he saw it.", "تام وقتی دیدش ترسید."),
                StoryParagraph("But he did not know why.", "اما نمی‌دانست چرا.")
            )),
            StoryChapter(2, "The Strange Writing", "نوشته‌های عجیب", listOf(
                StoryParagraph("An expert came to read the writing.", "متخصصی برای خواندن نوشته‌ها آمد."),
                StoryParagraph("She was a woman named Dr. Harris.", "زنی به نام دکتر هریس بود."),
                StoryParagraph("She studied the words for hours.", "او ساعت‌ها کلمات را مطالعه کرد."),
                StoryParagraph("Then she became very pale.", "بعد خیلی رنگ‌پریده شد."),
                StoryParagraph("She said the words were a curse.", "او گفت کلمات یک نفرین هستند."),
                StoryParagraph("Anyone who opened the case would die.", "هر کس تابوت را باز کند می‌میرد."),
                StoryParagraph("Tom did not believe in curses.", "تام به نفرین‌ها اعتقاد نداشت."),
                StoryParagraph("But Dr. Harris was serious.", "اما دکتر هریس جدی بود."),
                StoryParagraph("The museum director laughed at her.", "مدیر موزه به او خندید."),
                StoryParagraph("He said the curse was just a story.", "او گفت نفرین فقط یک داستان است.")
            )),
            StoryChapter(3, "The First Night", "شب اول", listOf(
                StoryParagraph("That night, Tom watched the mummy.", "آن شب، تام مومیایی را تماشا کرد."),
                StoryParagraph("The museum was dark and quiet.", "موزه تاریک و ساکت بود."),
                StoryParagraph("At midnight, he heard a strange sound.", "در نیمه‌شب، صدای عجیبی شنید."),
                StoryParagraph("It came from the mummy's room.", "از اتاق مومیایی می‌آمد."),
                StoryParagraph("He walked slowly to the room.", "آرام به سمت اتاق رفت."),
                StoryParagraph("The door was open.", "در باز بود."),
                StoryParagraph("The golden case was empty.", "تابوت طلایی خالی بود."),
                StoryParagraph("The mummy was gone.", "مومیایی رفته بود."),
                StoryParagraph("Tom ran to call the police.", "تام دوید تا پلیس را خبر کند."),
                StoryParagraph("But the phones were dead.", "اما تلفن‌ها خراب بودند.")
            )),
            StoryChapter(4, "The Second Death", "مرگ دوم", listOf(
                StoryParagraph("In the morning, a guard was found dead.", "صبح، نگهبانی مرده پیدا شد."),
                StoryParagraph("It was Tom's friend, Peter.", "دوست تام، پیتر بود."),
                StoryParagraph("His face was white with fear.", "صورتش از ترس سفید بود."),
                StoryParagraph("He had two small marks on his neck.", "روی گردنش دو جای زخم کوچک داشت."),
                StoryParagraph("The mummy was found nearby.", "مومیایی نزدیکش پیدا شد."),
                StoryParagraph("It was standing in the hallway.", "در راهرو ایستاده بود."),
                StoryParagraph("The police were confused.", "پلیس گیج شد."),
                StoryParagraph("They did not believe in curses.", "آن‌ها به نفرین‌ها اعتقاد نداشتند."),
                StoryParagraph("But they could not explain the death.", "اما نمی‌توانستند مرگ را توضیح دهند."),
                StoryParagraph("Tom knew the truth.", "تام حقیقت را می‌دانست.")
            )),
            StoryChapter(5, "The Curse is Real", "نفرین واقعی است", listOf(
                StoryParagraph("Tom spoke to Dr. Harris again.", "تام دوباره با دکتر هریس صحبت کرد."),
                StoryParagraph("She told him about the mummy's history.", "او درباره تاریخ مومیایی به او گفت."),
                StoryParagraph("The mummy was a priest in Egypt.", "مومیایی در مصر یک کاهن بود."),
                StoryParagraph("He had been buried alive.", "او زنده به گور شده بود."),
                StoryParagraph("He had sworn revenge on all who disturbed him.", "او قسم خورده بود از هر کس مزاحمش شود انتقام بگیرد."),
                StoryParagraph("The museum director wanted to open the case.", "مدیر موزه می‌خواست تابوت را باز کند."),
                StoryParagraph("Tom tried to stop him.", "تام تلاش کرد متوقفش کند."),
                StoryParagraph("But the director did not listen.", "اما مدیر گوش نداد."),
                StoryParagraph("That night, the director died in his office.", "آن شب، مدیر در دفترش مرد."),
                StoryParagraph("The mummy was standing beside him.", "مومیایی کنارش ایستاده بود.")
            )),
            StoryChapter(6, "The Escape", "فرار", listOf(
                StoryParagraph("Tom decided to destroy the mummy.", "تام تصمیم گرفت مومیایی را نابود کند."),
                StoryParagraph("He took it to a secret place.", "آن را به جای مخفی برد."),
                StoryParagraph("He planned to burn it.", "نقشه داشت بسوزاندش."),
                StoryParagraph("But as he lit the fire, the mummy moved.", "اما وقتی آتش را روشن کرد، مومیایی حرکت کرد."),
                StoryParagraph("Its eyes opened slowly.", "چشم‌هایش آرام باز شدند."),
                StoryParagraph("Tom ran out of the room.", "تام از اتاق فرار کرد."),
                StoryParagraph("He locked the door behind him.", "در را پشت سرش قفل کرد."),
                StoryParagraph("The fire spread through the building.", "آتش ساختمان را پر کرد."),
                StoryParagraph("The mummy was destroyed.", "مومیایی نابود شد."),
                StoryParagraph("Tom was safe.", "تام در امان بود.")
            )),
            StoryChapter(7, "The End of the Curse", "پایان نفرین", listOf(
                StoryParagraph("The museum was closed for months.", "موزه ماه‌ها بسته بود."),
                StoryParagraph("Tom left his job there.", "تام شغلش را ترک کرد."),
                StoryParagraph("He never spoke about the mummy.", "هرگز درباره مومیایی صحبت نکرد."),
                StoryParagraph("But he often had bad dreams.", "اما اغلب کابوس می‌دید."),
                StoryParagraph("Dr. Harris wrote a book about it.", "دکتر هریس کتابی درباره‌اش نوشت."),
                StoryParagraph("Many people read the story.", "افراد زیادی داستان را خواندند."),
                StoryParagraph("Some believed it, some did not.", "بعضی باور کردند، بعضی نکردند."),
                StoryParagraph("The curse was finally broken.", "نفرین بالاخره شکسته شد."),
                StoryParagraph("And the mummy rested in peace.", "و مومیایی در آرامش خفت."),
                StoryParagraph("But no one opened the tomb again.", "اما هیچ‌کس دوباره مقبره را باز نکرد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۷: وحشت هالووین
    // ═══════════════════════════════════════════════════════
    private fun story7() = StoryContent(
        storyId = "halloween_horror",
        chapters = listOf(
            StoryChapter(1, "Halloween Night", "شب هالووین", listOf(
                StoryParagraph("It was Halloween night in a small town.", "شب هالووین در شهر کوچکی بود."),
                StoryParagraph("Children walked in costumes.", "بچه‌ها با لباس‌های مخصوص راه می‌رفتند."),
                StoryParagraph("A boy named Jack was with his friends.", "پسری به نام جک با دوستانش بود."),
                StoryParagraph("They were all about twelve years old.", "همه حدوداً دوازده ساله بودند."),
                StoryParagraph("They wanted to visit the old house.", "می‌خواستند خانه قدیمی را ببینند."),
                StoryParagraph("The house had been empty for years.", "خانه سال‌ها خالی بود."),
                StoryParagraph("People said it was haunted.", "مردم می‌گفتند تسخیرشده است."),
                StoryParagraph("No one went there at night.", "هیچ‌کس شب‌ها آنجا نمی‌رفت."),
                StoryParagraph("But Jack wanted to be brave.", "اما جک می‌خواست شجاع باشد."),
                StoryParagraph("His friends agreed to come.", "دوستانش موافقت کردند بیایند.")
            )),
            StoryChapter(2, "The Old House", "خانه قدیمی", listOf(
                StoryParagraph("The house was dark and broken.", "خانه تاریک و خرابه بود."),
                StoryParagraph("The windows were covered with dust.", "پنجره‌ها پر از گرد بودند."),
                StoryParagraph("The door was open slightly.", "در کمی باز بود."),
                StoryParagraph("The children walked inside quietly.", "بچه‌ها بی‌صدا داخل رفتند."),
                StoryParagraph("The floor made strange sounds.", "کف صداهای عجیبی می‌داد."),
                StoryParagraph("There were old pictures on the walls.", "تصاویر قدیمی روی دیوارها بود."),
                StoryParagraph("The faces in the pictures looked sad.", "صورت‌های داخل تصاویر غمگین بودند."),
                StoryParagraph("One picture showed a young girl.", "یکی از تصاویر دختر جوانی را نشان می‌داد."),
                StoryParagraph("Jack felt cold when he looked at her.", "جک وقتی نگاهش کرد احساس سرما کرد."),
                StoryParagraph("But he did not tell his friends.", "اما به دوستانش نگفت.")
            )),
            StoryChapter(3, "The Strange Sounds", "صداهای عجیب", listOf(
                StoryParagraph("The children walked up the stairs.", "بچه‌ها از پله‌ها بالا رفتند."),
                StoryParagraph("They heard a whisper in the dark.", "در تاریکی صدای نجوایی شنیدند."),
                StoryParagraph("It sounded like a girl's voice.", "شبیه صدای دختری بود."),
                StoryParagraph("Jack looked behind him.", "جک پشتش را نگاه کرد."),
                StoryParagraph("No one was there.", "هیچ‌کس آنجا نبود."),
                StoryParagraph("His friends were also afraid.", "دوستانش هم ترسیده بودند."),
                StoryParagraph("One of them wanted to leave.", "یکی از آن‌ها می‌خواست برود."),
                StoryParagraph("But Jack wanted to find the voice.", "اما جک می‌خواست صدا را پیدا کند."),
                StoryParagraph("He walked to a small room.", "او به اتاق کوچکی رفت."),
                StoryParagraph("The door opened by itself.", "در خودش باز شد.")
            )),
            StoryChapter(4, "The Girl in the Mirror", "دختر در آینه", listOf(
                StoryParagraph("Inside the room was an old mirror.", "داخل اتاق آینه‌ای قدیمی بود."),
                StoryParagraph("Jack looked into it.", "جک داخلش نگاه کرد."),
                StoryParagraph("He saw the girl from the picture.", "او دختر از تصویر را دید."),
                StoryParagraph("She was standing behind him.", "او پشت سرش ایستاده بود."),
                StoryParagraph("Jack turned around quickly.", "جک سریع چرخید."),
                StoryParagraph("But no one was there.", "اما هیچ‌کس آنجا نبود."),
                StoryParagraph("He looked in the mirror again.", "دوباره در آینه نگاه کرد."),
                StoryParagraph("The girl was smiling now.", "دختر حالا لبخند می‌زد."),
                StoryParagraph("She pointed toward the wall.", "او به سمت دیوار اشاره کرد."),
                StoryParagraph("Jack saw a small door in the wall.", "جک دری کوچک در دیوار دید.")
            )),
            StoryChapter(5, "The Secret Room", "اتاق مخفی", listOf(
                StoryParagraph("Jack opened the small door.", "جک در کوچک را باز کرد."),
                StoryParagraph("Behind it was a dark room.", "پشتش اتاقی تاریک بود."),
                StoryParagraph("There were many old toys inside.", "اسباب‌بازی‌های قدیمی زیادی داخل بود."),
                StoryParagraph("There was also a diary.", "دفتر خاطراتی هم بود."),
                StoryParagraph("Jack opened the diary.", "جک دفتر را باز کرد."),
                StoryParagraph("It belonged to the girl in the picture.", "مال دختر در تصویر بود."),
                StoryParagraph("Her name was Emily.", "اسمش امیلی بود."),
                StoryParagraph("She wrote about her illness.", "او درباره بیماری‌اش نوشته بود."),
                StoryParagraph("She died alone in this room.", "او در همین اتاق تنها مرد."),
                StoryParagraph("She wanted someone to remember her.", "می‌خواست کسی یادش کند.")
            )),
            StoryChapter(6, "The Ghost's Wish", "آرزوی روح", listOf(
                StoryParagraph("Emily's ghost appeared again.", "روح امیلی دوباره ظاهر شد."),
                StoryParagraph("She spoke to Jack quietly.", "او آرام با جک صحبت کرد."),
                StoryParagraph("She was not angry.", "عصبانی نبود."),
                StoryParagraph("She was just very lonely.", "فقط خیلی تنها بود."),
                StoryParagraph("She asked Jack to tell her story.", "او از جک خواست داستانش را بگوید."),
                StoryParagraph("Jack promised to do this.", "جک قول داد این کار را بکند."),
                StoryParagraph("Emily smiled and disappeared.", "امیلی لبخند زد و ناپدید شد."),
                StoryParagraph("The house became quiet again.", "خانه دوباره ساکت شد."),
                StoryParagraph("Jack and his friends left.", "جک و دوستانش رفتند."),
                StoryParagraph("The night was over.", "شب تمام شد.")
            )),
            StoryChapter(7, "The End", "پایان", listOf(
                StoryParagraph("Jack told everyone Emily's story.", "جک داستان امیلی را به همه گفت."),
                StoryParagraph("People in the town remembered her.", "مردم شهر یادش کردند."),
                StoryParagraph("Her grave was cleaned and cared for.", "قبرش تمیز و نگهداری شد."),
                StoryParagraph("The house was not haunted anymore.", "خانه دیگر تسخیرشده نبود."),
                StoryParagraph("Jack visited the grave every year.", "جک هر سال به دیدن قبر می‌رفت."),
                StoryParagraph("He left flowers for Emily.", "برای امیلی گل می‌گذاشت."),
                StoryParagraph("The ghost was finally at peace.", "روح بالاخره در آرامش بود."),
                StoryParagraph("And the town loved Emily's story.", "و شهر داستان امیلی را دوست داشت."),
                StoryParagraph("Jack learned not to fear ghosts.", "جک یاد گرفت از ارواح نترسد."),
                StoryParagraph("Some ghosts just want to be remembered.", "بعضی ارواح فقط می‌خواهند به یاد آورده شوند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۸: شبح اپرا
    // ═══════════════════════════════════════════════════════
    private fun story8() = StoryContent(
        storyId = "phantom_opera",
        chapters = listOf(
            StoryChapter(1, "The Ghost in the Theater", "شبح در تئاتر", listOf(
                StoryParagraph("The Paris Opera House was very old.", "خانه اپرای پاریس خیلی قدیمی بود."),
                StoryParagraph("People said a ghost lived there.", "مردم می‌گفتند روحی آنجا زندگی می‌کند."),
                StoryParagraph("Strange things happened every night.", "هر شب چیزهای عجیبی اتفاق می‌افتاد."),
                StoryParagraph("Lights went out by themselves.", "چراغ‌ها خودشان خاموش می‌شدند."),
                StoryParagraph("Voices were heard in empty rooms.", "صداهایی در اتاق‌های خالی شنیده می‌شد."),
                StoryParagraph("The actors were afraid.", "بازیگران ترسیده بودند."),
                StoryParagraph("A new singer came to the opera.", "خواننده جدیدی به اپرا آمد."),
                StoryParagraph("Her name was Christine.", "اسمش کریستین بود."),
                StoryParagraph("She was young and beautiful.", "او جوان و زیبا بود."),
                StoryParagraph("Everyone loved her voice.", "همه صدایش را دوست داشتند.")
            )),
            StoryChapter(2, "The Voice in the Dark", "صدا در تاریکی", listOf(
                StoryParagraph("One night, Christine heard a voice.", "یک شب، کریستین صدایی شنید."),
                StoryParagraph("It came from behind the wall.", "از پشت دیوار می‌آمد."),
                StoryParagraph("The voice was soft and beautiful.", "صدا نرم و زیبا بود."),
                StoryParagraph("It called her by her name.", "او را با اسمش صدا زد."),
                StoryParagraph("Christine was not afraid.", "کریستین نترسید."),
                StoryParagraph("She followed the voice.", "او دنبال صدا رفت."),
                StoryParagraph("It led her to a mirror.", "آن را به آینه‌ای رساند."),
                StoryParagraph("The mirror opened like a door.", "آینه مثل دری باز شد."),
                StoryParagraph("Behind it was a dark passage.", "پشتش راهرویی تاریک بود."),
                StoryParagraph("Christine walked inside.", "کریستین داخل رفت.")
            )),
            StoryChapter(3, "The Phantom", "شبح", listOf(
                StoryParagraph("At the end of the passage was a man.", "در انتهای راهرو مردی بود."),
                StoryParagraph("He wore a white mask on his face.", "ماسک سفیدی روی صورتش داشت."),
                StoryParagraph("His face was hidden completely.", "صورتش کاملاً پنهان بود."),
                StoryParagraph("He said his name was Erik.", "او گفت اسمش اریک است."),
                StoryParagraph("He was a musician and a genius.", "او موسیقیدان و نابغه‌ای بود."),
                StoryParagraph("He had lived under the opera for years.", "سال‌ها زیر اپرا زندگی کرده بود."),
                StoryParagraph("He loved Christine's voice.", "او صدای کریستین را دوست داشت."),
                StoryParagraph("He wanted to teach her to sing better.", "می‌خواست به او آواز بهتر بیاموزد."),
                StoryParagraph("Christine agreed to learn from him.", "کریستین موافقت کرد از او بیاموزد."),
                StoryParagraph("But she felt afraid of him too.", "اما از او هم می‌ترسید.")
            )),
            StoryChapter(4, "The Secret", "راز", listOf(
                StoryParagraph("Christine learned about Erik's past.", "کریستین درباره گذشته اریک فهمید."),
                StoryParagraph("His face was deformed from birth.", "صورتش از بدو تولد ناقص بود."),
                StoryParagraph("His mother had hated him.", "مادرش از او متنفر بود."),
                StoryParagraph("He had run away from home as a child.", "در کودکی از خانه فرار کرده بود."),
                StoryParagraph("He had traveled the world alone.", "او تنهایی دور دنیا سفر کرده بود."),
                StoryParagraph("He was a genius but very lonely.", "او نابغه بود اما خیلی تنها."),
                StoryParagraph("Christine felt sorry for him.", "کریستین برایش دلسوزی کرد."),
                StoryParagraph("But she also loved another man.", "اما مرد دیگری را هم دوست داشت."),
                StoryParagraph("His name was Raoul.", "اسمش رائول بود."),
                StoryParagraph("Erik found out about their love.", "اریک از عشق آن‌ها باخبر شد.")
            )),
            StoryChapter(5, "The Jealousy", "حسادت", listOf(
                StoryParagraph("Erik became very jealous.", "اریک خیلی حسود شد."),
                StoryParagraph("He wanted Christine for himself.", "کریستین را برای خودش می‌خواست."),
                StoryParagraph("He captured her in his underground home.", "او را در خانه زیرزمینی‌اش اسیر کرد."),
                StoryParagraph("He gave her two choices.", "دو انتخاب به او داد."),
                StoryParagraph("She could marry him or die.", "می‌توانست با او ازدواج کند یا بمیرد."),
                StoryParagraph("Christine was terrified.", "کریستین وحشت کرد."),
                StoryParagraph("Raoul came to save her.", "رائول برای نجاتش آمد."),
                StoryParagraph("But Erik caught him too.", "اما اریک او را هم گرفت."),
                StoryParagraph("He tied Raoul to a wall.", "او رائول را به دیوار بست."),
                StoryParagraph("Christine had to choose quickly.", "کریستین باید سریع انتخاب می‌کرد.")
            )),
            StoryChapter(6, "The Choice", "انتخاب", listOf(
                StoryParagraph("Christine made a brave decision.", "کریستین تصمیم شجاعانه‌ای گرفت."),
                StoryParagraph("She kissed Erik on the face.", "او اریک را روی صورتش بوسید."),
                StoryParagraph("Erik was shocked and moved.", "اریک شوکه و متأثر شد."),
                StoryParagraph("No one had ever kissed him.", "هیچ‌کس هرگز نبوسیده بودش."),
                StoryParagraph("He realized she was kind.", "او فهمید کریستین مهربان است."),
                StoryParagraph("He decided to let her go.", "تصمیم گرفت رهایش کند."),
                StoryParagraph("He freed Raoul and Christine.", "او رائول و کریستین را آزاد کرد."),
                StoryParagraph("He told them to leave and never return.", "به آن‌ها گفت بروند و هرگز برنگردند."),
                StoryParagraph("They ran out together.", "آن‌ها با هم فرار کردند."),
                StoryParagraph("Erik stayed alone in the dark.", "اریک در تاریکی تنها ماند.")
            )),
            StoryChapter(7, "The End", "پایان", listOf(
                StoryParagraph("Christine and Raoul left Paris.", "کریستین و رائول پاریس را ترک کردند."),
                StoryParagraph("They married and lived happily.", "ازدواج کردند و خوشحال زندگی کردند."),
                StoryParagraph("Erik stayed under the opera.", "اریک زیر اپرا ماند."),
                StoryParagraph("He wrote music for the rest of his life.", "بقیه عمرش موسیقی نوشت."),
                StoryParagraph("No one saw him again.", "هیچ‌کس دوباره ندیدش."),
                StoryParagraph("But his music lived on.", "اما موسیقی‌اش زنده ماند."),
                StoryParagraph("Years later, his grave was found.", "سال‌ها بعد، قبرش پیدا شد."),
                StoryParagraph("On it was a golden ring.", "روی آن حلقه‌ای طلایی بود."),
                StoryParagraph("Christine's ring had been returned.", "حلقه کریستین برگردانده شده بود."),
                StoryParagraph("And so the story of the phantom ended.", "و اینگونه داستان شبح پایان یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۹: پنجه میمون
    // ═══════════════════════════════════════════════════════
    private fun story9() = StoryContent(
        storyId = "monkeys_paw",
        chapters = listOf(
            StoryChapter(1, "The Strange Gift", "هدیه عجیب", listOf(
                StoryParagraph("An old man came to visit a family.", "پیرمردی به دیدن خانواده‌ای آمد."),
                StoryParagraph("His name was Sergeant Morris.", "اسمش گروهبان موریس بود."),
                StoryParagraph("He had been a soldier in India.", "او سربازی در هند بوده بود."),
                StoryParagraph("He brought a strange gift with him.", "هدیه عجیبی با خود آورده بود."),
                StoryParagraph("It was a dried monkey's paw.", "پنجه خشکیده میمونی بود."),
                StoryParagraph("He said it had magic powers.", "او گفت قدرت جادویی دارد."),
                StoryParagraph("It could give three wishes to its owner.", "می‌توانست سه آرزو به صاحبش بدهد."),
                StoryParagraph("But the wishes came with a price.", "اما آرزوها بهایی داشتند."),
                StoryParagraph("The father, Mr. White, laughed.", "پدر، آقای وایت، خندید."),
                StoryParagraph("He did not believe in magic.", "او به جادو اعتقاد نداشت.")
            )),
            StoryChapter(2, "The First Wish", "آرزوی اول", listOf(
                StoryParagraph("Mr. White took the paw in his hand.", "آقای وایت پنجه را در دستش گرفت."),
                StoryParagraph("He wished for money.", "او پول آرزو کرد."),
                StoryParagraph("He wanted to pay off his house.", "می‌خواست خانه‌اش را تسویه کند."),
                StoryParagraph("The paw moved in his hand.", "پنجه در دستش حرکت کرد."),
                StoryParagraph("Mr. White was surprised.", "آقای وایت تعجب کرد."),
                StoryParagraph("But nothing happened that night.", "اما آن شب چیزی اتفاق نیفتاد."),
                StoryParagraph("The next day, a man came to their house.", "روز بعد، مردی به خانه‌شان آمد."),
                StoryParagraph("He worked at the factory where their son worked.", "او در کارخانه‌ای کار می‌کرد که پسرشان کار می‌کرد."),
                StoryParagraph("Their son had been killed in an accident.", "پسرشان در حادثه‌ای کشته شده بود."),
                StoryParagraph("The factory would pay them money.", "کارخانه به آن‌ها پول می‌داد.")
            )),
            StoryChapter(3, "The Price", "بها", listOf(
                StoryParagraph("The money was exactly what Mr. White wished.", "پول دقیقاً همان بود که آقای وایت آرزو کرده بود."),
                StoryParagraph("But it came from their son's death.", "اما از مرگ پسرشان آمده بود."),
                StoryParagraph("The family was destroyed by grief.", "خانواده از غم نابود شدند."),
                StoryParagraph("The mother cried day and night.", "مادر شبانه‌روز گریه می‌کرد."),
                StoryParagraph("The father felt guilty.", "پدر احساس گناه می‌کرد."),
                StoryParagraph("He had wished for the money.", "او پول را آرزو کرده بود."),
                StoryParagraph("He did not know it would cost his son's life.", "نمی‌دانست جان پسرش را می‌گیرد."),
                StoryParagraph("They buried their son in the town cemetery.", "پسرشان را در قبرستان شهر دفن کردند."),
                StoryParagraph("Life became empty and sad.", "زندگی خالی و غمگین شد."),
                StoryParagraph("The monkey's paw lay forgotten.", "پنجه میمون فراموش‌شده ماند.")
            )),
            StoryChapter(4, "The Second Wish", "آرزوی دوم", listOf(
                StoryParagraph("One night, the mother had an idea.", "یک شب، مادر ایده‌ای داشت."),
                StoryParagraph("She wanted her son back.", "او پسرش را می‌خواست."),
                StoryParagraph("She begged her husband to wish for him.", "از شوهرش التماس کرد برایش آرزو کند."),
                StoryParagraph("Mr. White was afraid.", "آقای وایت ترسید."),
                StoryParagraph("He said the paw was dangerous.", "او گفت پنجه خطرناک است."),
                StoryParagraph("But his wife insisted.", "اما همسرش اصرار کرد."),
                StoryParagraph("Finally, he took the paw.", "بالاخره، پنجه را گرفت."),
                StoryParagraph("He wished their son alive again.", "او آرزو کرد پسرشان دوباره زنده شود."),
                StoryParagraph("The paw moved in his hand.", "پنجه در دستش حرکت کرد."),
                StoryParagraph("They waited in the dark.", "آن‌ها در تاریکی منتظر ماندند.")
            )),
            StoryChapter(5, "The Knock", "ضربه", listOf(
                StoryParagraph("Late that night, they heard a knock.", "آخر آن شب، ضربه‌ای شنیدند."),
                StoryParagraph("Someone was at the door.", "کسی دم در بود."),
                StoryParagraph("The mother ran to open it.", "مادر دوید تا بازش کند."),
                StoryParagraph("The father stopped her.", "پدر متوقفش کرد."),
                StoryParagraph("He was afraid of what was outside.", "می‌ترسید از آنچه بیرون است."),
                StoryParagraph("The knocking became louder.", "ضربه‌ها بلندتر شد."),
                StoryParagraph("A voice called from outside.", "صدایی از بیرون صدا زد."),
                StoryParagraph("It sounded like their son.", "شبیه پسرشان بود."),
                StoryParagraph("But his voice was strange and cold.", "اما صدایش عجیب و سرد بود."),
                StoryParagraph("The mother struggled to open the door.", "مادر برای باز کردن در تقلا کرد.")
            )),
            StoryChapter(6, "The Third Wish", "آرزوی سوم", listOf(
                StoryParagraph("Mr. White knew the truth.", "آقای وایت حقیقت را می‌دانست."),
                StoryParagraph("It was not really their son.", "واقعاً پسرشان نبود."),
                StoryParagraph("It was something terrible.", "چیزی وحشتناک بود."),
                StoryParagraph("He grabbed the monkey's paw.", "او پنجه میمون را گرفت."),
                StoryParagraph("He made his third and final wish.", "آرزوی سوم و آخرش را کرد."),
                StoryParagraph("He wished his son back in his grave.", "آرزو کرد پسرش به قبرش برگردد."),
                StoryParagraph("The knocking stopped suddenly.", "ضربه‌ها ناگهان متوقف شدند."),
                StoryParagraph("The house became completely quiet.", "خانه کاملاً ساکت شد."),
                StoryParagraph("The mother cried out in pain.", "مادر از درد فریاد زد."),
                StoryParagraph("But the father knew it was right.", "اما پدر می‌دانست درست بود.")
            )),
            StoryChapter(7, "The End", "پایان", listOf(
                StoryParagraph("They never used the paw again.", "هرگز دوباره از پنجه استفاده نکردند."),
                StoryParagraph("Mr. White threw it into the fire.", "آقای وایت آن را در آتش انداخت."),
                StoryParagraph("The paw burned with strange colors.", "پنجه با رنگ‌های عجیب سوخت."),
                StoryParagraph("Then it turned to ash.", "بعد به خاکستر تبدیل شد."),
                StoryParagraph("The family was never happy again.", "خانواده هرگز دوباره خوشحال نشدند."),
                StoryParagraph("But they learned a lesson.", "اما درسی یاد گرفتند."),
                StoryParagraph("Some wishes should never be made.", "بعضی آرزوها هرگز نباید گفته شوند."),
                StoryParagraph("The dead should be left in peace.", "مرده‌ها باید در آرامش رها شوند."),
                StoryParagraph("And the monkey's paw was gone forever.", "و پنجه میمون برای همیشه رفت."),
                StoryParagraph("But its curse would be remembered.", "اما نفرینش به یاد آورده می‌شد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۰: هدیه مغان
    // ═══════════════════════════════════════════════════════
    private fun story10() = StoryContent(
        storyId = "gift_of_magi",
        chapters = listOf(
            StoryChapter(1, "A Poor Couple", "زوج فقیر", listOf(
                StoryParagraph("Della and Jim were a young married couple.", "دلا و جیم زوج جوان متأهلی بودند."),
                StoryParagraph("They lived in a small apartment.", "آن‌ها در آپارتمانی کوچک زندگی می‌کردند."),
                StoryParagraph("They were very poor but very happy.", "خیلی فقیر اما خیلی خوشحال بودند."),
                StoryParagraph("It was Christmas Eve.", "شب کریسمس بود."),
                StoryParagraph("Della wanted to buy Jim a gift.", "دلا می‌خواست برای جیم هدیه بخرد."),
                StoryParagraph("But she had only one dollar and eighty-seven cents.", "اما فقط یک دلار و هشتاد و هفت سنت داشت."),
                StoryParagraph("She counted the money three times.", "پول را سه بار شمرد."),
                StoryParagraph("It was still the same amount.", "هنوز همان مقدار بود."),
                StoryParagraph("She sat down and cried.", "او نشست و گریه کرد."),
                StoryParagraph("She loved Jim so much.", "او جیم را خیلی دوست داشت.")
            )),
            StoryChapter(2, "Her Beautiful Hair", "موهای زیبایش", listOf(
                StoryParagraph("Della had one precious thing.", "دلا یک چیز باارزش داشت."),
                StoryParagraph("It was her long, beautiful hair.", "موهای بلند و زیبایش بود."),
                StoryParagraph("Her hair reached below her knees.", "موهایش تا زیر زانوهایش می‌رسید."),
                StoryParagraph("It shone like golden silk.", "مثل ابریشم طلایی می‌درخشید."),
                StoryParagraph("Everyone admired it.", "همه تحسینش می‌کردند."),
                StoryParagraph("Della looked at her hair in the mirror.", "دلا در آینه به موهایش نگاه کرد."),
                StoryParagraph("Then she had a sudden idea.", "بعد ناگهان ایده‌ای به ذهنش رسید."),
                StoryParagraph("She put on her old coat.", "پالتوی کهنه‌اش را پوشید."),
                StoryParagraph("She went out into the cold street.", "در خیابان سرد بیرون رفت."),
                StoryParagraph("She was going to sell her hair.", "می‌رفت موهایش را بفروشد.")
            )),
            StoryChapter(3, "Selling Her Hair", "فروش موهایش", listOf(
                StoryParagraph("She found a shop that bought hair.", "مغازه‌ای پیدا کرد که مو می‌خرید."),
                StoryParagraph("The woman looked at Della's hair.", "زن به موهای دلا نگاه کرد."),
                StoryParagraph("She offered twenty dollars.", "بیست دلار پیشنهاد داد."),
                StoryParagraph("Della agreed immediately.", "دلا بلافاصله موافقت کرد."),
                StoryParagraph("She felt the scissors cut her hair.", "قیچی را روی موهایش حس کرد."),
                StoryParagraph("It was painful but she did not cry.", "دردناک بود اما گریه نکرد."),
                StoryParagraph("She had the money now.", "حالا پول داشت."),
                StoryParagraph("She went to find a gift for Jim.", "رفت تا هدیه‌ای برای جیم پیدا کند."),
                StoryParagraph("She looked in many shops.", "در مغازه‌های زیادی نگاه کرد."),
                StoryParagraph("Finally, she found the perfect one.", "بالاخره، یکی کامل پیدا کرد.")
            )),
            StoryChapter(4, "Jim's Watch", "ساعت جیم", listOf(
                StoryParagraph("Jim had one precious thing.", "جیم یک چیز باارزش داشت."),
                StoryParagraph("It was a gold watch from his father.", "ساعت طلایی از پدرش بود."),
                StoryParagraph("It was his greatest treasure.", "بزرگ‌ترین گنجش بود."),
                StoryParagraph("He was very proud of it.", "او به آن خیلی افتخار می‌کرد."),
                StoryParagraph("Della bought a chain for the watch.", "دلا زنجیری برای ساعت خرید."),
                StoryParagraph("It was a beautiful gold chain.", "زنجیر طلایی زیبایی بود."),
                StoryParagraph("It cost her twenty-one dollars.", "بیست و یک دلار برایش خرج شد."),
                StoryParagraph("She went home with joy.", "او با خوشحالی به خانه برگشت."),
                StoryParagraph("She wanted to surprise Jim.", "می‌خواست جیم را غافلگیر کند."),
                StoryParagraph("She waited for him to come home.", "منتظر ماند تا به خانه بیاید.")
            )),
            StoryChapter(5, "Jim's Gift", "هدیه جیم", listOf(
                StoryParagraph("Jim came home at seven o'clock.", "جیم ساعت هفت به خانه آمد."),
                StoryParagraph("He stopped when he saw Della.", "وقتی دلا را دید ایستاد."),
                StoryParagraph("His eyes were strange.", "چشم‌هایش عجیب بود."),
                StoryParagraph("He was looking at her short hair.", "به موهای کوتاهش نگاه می‌کرد."),
                StoryParagraph("Della ran to explain.", "دلا دوید تا توضیح دهد."),
                StoryParagraph("She told him she sold her hair.", "به او گفت موهایش را فروخته."),
                StoryParagraph("She gave him the gold chain.", "زنجیر طلایی را به او داد."),
                StoryParagraph("Jim sat down and smiled sadly.", "جیم نشست و غمگین لبخند زد."),
                StoryParagraph("He gave her a package.", "بسته‌ای به او داد."),
                StoryParagraph("Inside were two beautiful hair combs.", "داخلش دو شانه موی زیبا بود.")
            )),
            StoryChapter(6, "The Bitter Truth", "حقیقت تلخ", listOf(
                StoryParagraph("Jim had sold his watch.", "جیم ساعتش را فروخته بود."),
                StoryParagraph("He sold it to buy the combs.", "آن را فروخت تا شانه‌ها را بخرد."),
                StoryParagraph("The combs were for Della's long hair.", "شانه‌ها برای موهای بلند دلا بودند."),
                StoryParagraph("But she had cut her hair.", "اما او موهایش را کوتاه کرده بود."),
                StoryParagraph("The chain was for his watch.", "زنجیر برای ساعتش بود."),
                StoryParagraph("But he had sold the watch.", "اما ساعت را فروخته بود."),
                StoryParagraph("The gifts were both useless now.", "هدیه‌ها حالا هر دو بی‌استفاده بودند."),
                StoryParagraph("Della and Jim looked at each other.", "دلا و جیم به هم نگاه کردند."),
                StoryParagraph("Then they both began to laugh.", "بعد هر دو شروع کردند به خندیدن."),
                StoryParagraph("And they held each other tightly.", "و یکدیگر را محکم در آغوش گرفتند.")
            )),
            StoryChapter(7, "The Best Gift", "بهترین هدیه", listOf(
                StoryParagraph("They put the gifts away.", "هدیه‌ها را کنار گذاشتند."),
                StoryParagraph("They would eat dinner together.", "با هم شام می‌خوردند."),
                StoryParagraph("They had no watch or long hair.", "نه ساعت داشتند نه موی بلند."),
                StoryParagraph("But they had something more important.", "اما چیز مهم‌تری داشتند."),
                StoryParagraph("They had their love for each other.", "عشق به یکدیگر را داشتند."),
                StoryParagraph("They had sacrificed for each other.", "برای یکدیگر فداکاری کرده بودند."),
                StoryParagraph("This was the greatest gift of all.", "این بزرگ‌ترین هدیه بود."),
                StoryParagraph("The Magi were wise men long ago.", "مغان مردان دانایی در زمان قدیم بودند."),
                StoryParagraph("They brought gifts to a baby king.", "آن‌ها هدیه به پادشاه نوزادی آوردند."),
                StoryParagraph("But Della and Jim were the wisest of all.", "اما دلا و جیم داناترین همه بودند.")
            ))
        )
    )
}