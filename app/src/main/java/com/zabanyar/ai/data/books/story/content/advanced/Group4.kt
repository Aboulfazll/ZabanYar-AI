package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۴ پیشرفته — گوتیک و ترسناک
 *  ۱۰. دراکولا
 *  ۱۱. فرانکنشتاین
 *  ۱۲. تصویر دوریان گری
 */
object Group4 {

    fun getAll(): List<StoryContent> = listOf(
        story10(),
        story11(),
        story12(),
    )

    // ─────────────── ۱۰: دراکولا ───────────────
    private fun story10() = StoryContent(
        storyId = "adv_dracula",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Journey to Transylvania", titlePersian = "سفر به ترانسیلوانیا",
                paragraphs = listOf(
                    StoryParagraph("Jonathan Harker was a young English lawyer.", "جاناتان هارکر وکیل جوان انگلیسی بود."),
                    StoryParagraph("He was sent to Transylvania on business.", "او برای کاری به ترانسیلوانیا فرستاده شد."),
                    StoryParagraph("His client was Count Dracula.", "موکلش کنت دراکولا بود."),
                    StoryParagraph("The Count wanted to buy a house in London.", "کنت می‌خواست خانه‌ای در لندن بخرد."),
                    StoryParagraph("The journey was long and strange.", "سفر طولانی و عجیب بود."),
                    StoryParagraph("Peasants in the villages looked at him with fear.", "دهقانان دهکده‌ها با ترس به او نگاه می‌کردند."),
                    StoryParagraph("They crossed themselves when they heard the name Dracula.", "وقتی اسم دراکولا را می‌شنیدند صلیب می‌کشیدند."),
                    StoryParagraph("An old woman gave him a crucifix.", "پیرزنی صلیبی به او داد."),
                    StoryParagraph("She said it would protect him.", "او گفت از او محافظت می‌کند."),
                    StoryParagraph("She begged him not to go to the castle.", "او التماس کرد به قلعه نرود."),
                    StoryParagraph("But Jonathan had a job to do.", "اما جاناتان کاری داشت که انجام دهد."),
                    StoryParagraph("A carriage took him through dark mountain passes.", "کالسکه‌ای او را از گذرگاه‌های کوهستانی تاریک برد."),
                    StoryParagraph("Wolves howled in the forest.", "گرگ‌ها در جنگل زوزه می‌کشیدند."),
                    StoryParagraph("A strange blue light appeared in the trees.", "نور آبی عجیبی در درختان ظاهر شد."),
                    StoryParagraph("The driver urged the horses faster.", "راننده اسب‌ها را تندتر کرد."),
                    StoryParagraph("Finally, they reached the castle gates.", "بالاخره به دروازه‌های قلعه رسیدند."),
                    StoryParagraph("The gates opened by themselves.", "دروازه‌ها خودشان باز شدند."),
                    StoryParagraph("A tall, pale man was waiting.", "مردی بلندقد و رنگ‌پریده منتظر بود."),
                    StoryParagraph("His eyes were red, his teeth sharp.", "چشم‌هایش سرخ، دندان‌هایش تیز."),
                    StoryParagraph("It was Count Dracula himself.", "خود کنت دراکولا بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Prisoner of the Castle", titlePersian = "زندانی قلعه",
                paragraphs = listOf(
                    StoryParagraph("Jonathan was welcomed politely.", "از جاناتان مؤدبانه استقبال شد."),
                    StoryParagraph("But he noticed strange things immediately.", "اما بلافاصله چیزهای عجیبی متوجه شد."),
                    StoryParagraph("The Count had no reflection in the mirror.", "کنت در آینه انعکاسی نداشت."),
                    StoryParagraph("He never ate with Jonathan.", "او هرگز با جاناتان غذا نمی‌خورد."),
                    StoryParagraph("He was never seen during the day.", "در روز هرگز دیده نمی‌شد."),
                    StoryParagraph("Jonathan explored the castle secretly.", "جاناتان مخفیانه قلعه را کاوش کرد."),
                    StoryParagraph("He found a room full of old coffins.", "اتاقی پر از تابوت‌های قدیمی پیدا کرد."),
                    StoryParagraph("In one coffin, Dracula was sleeping.", "در یکی از تابوت‌ها، دراکولا خوابیده بود."),
                    StoryParagraph("He looked younger than before.", "جوان‌تر از قبل به نظر می‌رسید."),
                    StoryParagraph("Jonathan realized the terrible truth.", "جاناتان حقیقت وحشتناک را فهمید."),
                    StoryParagraph("The Count was a vampire.", "کنت یک خون‌آشام بود."),
                    StoryParagraph("He drank human blood to stay alive.", "او برای زنده ماندن خون انسان می‌نوشید."),
                    StoryParagraph("Jonathan tried to escape.", "جاناتان تلاش کرد فرار کند."),
                    StoryParagraph("But the doors were locked.", "اما درها قفل بودند."),
                    StoryParagraph("Three beautiful women appeared.", "سه زن زیبا ظاهر شدند."),
                    StoryParagraph("They were vampires too.", "آن‌ها هم خون‌آشام بودند."),
                    StoryParagraph("They wanted to drink Jonathan's blood.", "می‌خواستند خون جاناتان را بنوشند."),
                    StoryParagraph("Dracula stopped them angrily.", "دراکولا با خشم جلویشان را گرفت."),
                    StoryParagraph("Jonathan was now a prisoner.", "جاناتان حالا زندانی بود."),
                    StoryParagraph("He had to find a way out.", "باید راهی برای خروج پیدا می‌کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Voyage of the Demeter", titlePersian = "سفر دریایی",
                paragraphs = listOf(
                    StoryParagraph("A Russian ship named the Demeter sailed to England.", "کشتی روسی به نام دمتر به انگلیس می‌رفت."),
                    StoryParagraph("It carried a strange cargo of boxes.", "محوله عجیبی از جعبه‌ها حمل می‌کرد."),
                    StoryParagraph("Soon, the sailors started to disappear.", "به‌زودی، ملوانان شروع کردند به ناپدید شدن."),
                    StoryParagraph("The first mate wrote in his log book.", "افسر اول در دفترچه‌اش نوشت."),
                    StoryParagraph("He said something was on the ship.", "او گفت چیزی روی کشتی است."),
                    StoryParagraph("He saw a tall, thin man moving at night.", "او مردی بلندقد و لاغر دید که شب حرکت می‌کرد."),
                    StoryParagraph("The sailors became more and more afraid.", "ملوانان ترسیده‌تر و ترسیده‌تر شدند."),
                    StoryParagraph("One by one, they were found dead.", "یکی‌یکی، مرده پیدا شدند."),
                    StoryParagraph("Their bodies had two small marks on the neck.", "جسدهایشان دو جای زخم کوچک روی گردن داشت."),
                    StoryParagraph("The captain tied himself to the wheel.", "کاپیتان خودش را به فرمان کشتی بست."),
                    StoryParagraph("He would not leave his post.", "او از پستش دست نمی‌کشید."),
                    StoryParagraph("When the ship reached England, he was dead.", "وقتی کشتی به انگلیس رسید، او مرده بود."),
                    StoryParagraph("His log book told the whole story.", "دفترچه‌اش تمام داستان را می‌گفت."),
                    StoryParagraph("And there was one survivor on the ship.", "و یک بازمانده روی کشتی بود."),
                    StoryParagraph("A giant wolf jumped onto the shore.", "گرگ غول‌پیکری به ساحل پرید."),
                    StoryParagraph("It disappeared into the night.", "در شب ناپدید شد."),
                    StoryParagraph("That wolf was Count Dracula.", "آن گرگ کنت دراکولا بود."),
                    StoryParagraph("He had come to England at last.", "او بالاخره به انگلیس آمده بود."),
                    StoryParagraph("He was looking for new victims.", "او دنبال قربانیان جدید بود."),
                    StoryParagraph("And London was full of them.", "و لندن پر از آن‌ها بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Vampire Hunters", titlePersian = "شکارچیان خون‌آشام",
                paragraphs = listOf(
                    StoryParagraph("Dracula attacked a young woman named Lucy.", "دراکولا به زن جوانی به نام لوسی حمله کرد."),
                    StoryParagraph("She was the friend of Mina, Jonathan's wife.", "او دوست مینا، همسر جاناتان بود."),
                    StoryParagraph("Lucy became pale and sick.", "لوسی رنگ‌پریده و مریض شد."),
                    StoryParagraph("Two small marks appeared on her neck.", "دو جای زخم کوچک روی گردنش ظاهر شد."),
                    StoryParagraph("A doctor named Van Helsing came to help.", "دکتری به نام ون هلسینگ برای کمک آمد."),
                    StoryParagraph("He was an expert on strange diseases.", "او متخصص بیماری‌های عجیب بود."),
                    StoryParagraph("He recognized the vampire's mark.", "او جای خون‌آشام را شناخت."),
                    StoryParagraph("He tried to save Lucy with garlic and crosses.", "او تلاش کرد با سیر و صلیب نجاتش دهد."),
                    StoryParagraph("But Dracula was too strong.", "اما دراکولا خیلی قوی بود."),
                    StoryParagraph("Lucy died and became a vampire.", "لوسی مرد و خون‌آشام شد."),
                    StoryParagraph("Van Helsing had to destroy her.", "ون هلسینگ مجبور شد نابودش کند."),
                    StoryParagraph("He put a stake through her heart.", "میخی از قلبش گذراند."),
                    StoryParagraph("Then he gathered a group of hunters.", "بعد گروهی از شکارچیان جمع کرد."),
                    StoryParagraph("There was Jonathan, Mina, and Dr. Seward.", "جاناتان، مینا و دکتر سیوارد بودند."),
                    StoryParagraph("There was also an American named Quincey Morris.", "آمریکایی‌ای به نام کوئینسی موریس هم بود."),
                    StoryParagraph("And Arthur Holmwood, who had loved Lucy.", "و آرتور هولموود که لوسی را دوست داشت."),
                    StoryParagraph("They all swore to destroy Dracula.", "همه قسم خوردند دراکولا را نابود کنند."),
                    StoryParagraph("They found his boxes of earth in London.", "جعبه‌های خاکش را در لندن پیدا کردند."),
                    StoryParagraph("They destroyed them one by one.", "آن‌ها را یکی‌یکی نابود کردند."),
                    StoryParagraph("Dracula had to flee back to Transylvania.", "دراکولا مجبور شد به ترانسیلوانیا فرار کند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Battle", titlePersian = "نبرد نهایی",
                paragraphs = listOf(
                    StoryParagraph("The hunters followed Dracula to Transylvania.", "شکارچیان دراکولا را تا ترانسیلوانیا دنبال کردند."),
                    StoryParagraph("They traveled by train, boat, and horse.", "آن‌ها با قطار، قایق و اسب سفر کردند."),
                    StoryParagraph("Mina could feel Dracula's thoughts.", "مینا می‌توانست افکار دراکولا را حس کند."),
                    StoryParagraph("He had made her drink his blood.", "او او را وادار کرده بود خونش را بنوشد."),
                    StoryParagraph("She used this connection to find him.", "او از این ارتباط برای پیدا کردنش استفاده کرد."),
                    StoryParagraph("The chase was long and dangerous.", "تعقیب طولانی و خطرناک بود."),
                    StoryParagraph("They caught up with him near his castle.", "نزدیک قلعه‌اش به او رسیدند."),
                    StoryParagraph("It was almost sunset.", "تقریباً غروب بود."),
                    StoryParagraph("Dracula's gypsy guards attacked them.", "نگهبانان کولی دراکولا به آن‌ها حمله کردند."),
                    StoryParagraph("A terrible fight began.", "نبرد وحشتناکی شروع شد."),
                    StoryParagraph("Quincey Morris was wounded badly.", "کوئینسی موریس بدجور زخمی شد."),
                    StoryParagraph("But Jonathan and Arthur reached the box.", "اما جاناتان و آرتور به جعبه رسیدند."),
                    StoryParagraph("They opened it and found Dracula inside.", "آن‌ها بازش کردند و دراکولا را داخل دیدند."),
                    StoryParagraph("Jonathan cut his throat.", "جاناتان گلویش را برید."),
                    StoryParagraph("Arthur stabbed him in the heart.", "آرتور در قلبش خنجر زد."),
                    StoryParagraph("Dracula's body turned to dust.", "جسد دراکولا به خاک تبدیل شد."),
                    StoryParagraph("Mina was freed from his power.", "مینا از قدرت او آزاد شد."),
                    StoryParagraph("But Quincey died from his wounds.", "اما کوئینسی از زخم‌هایش مرد."),
                    StoryParagraph("He died a hero.", "او قهرمانانه مرد."),
                    StoryParagraph("The survivors returned home in peace.", "بازماندگان در آرامش به خانه برگشتند.")
                )
            )
        )
    )

    // ─────────────── ۱۱: فرانکنشتاین ───────────────
    private fun story11() = StoryContent(
        storyId = "adv_frankenstein",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Student of Ingolstadt", titlePersian = "دانشمند جوان",
                paragraphs = listOf(
                    StoryParagraph("Victor Frankenstein was born in Geneva.", "ویکتور فرانکنشتاین در ژنو به دنیا آمد."),
                    StoryParagraph("His family was wealthy and respected.", "خانواده‌اش ثروتمند و محترم بودند."),
                    StoryParagraph("He had a loving sister named Elizabeth.", "او خواهری دوست‌داشتنی به نام الیزابت داشت."),
                    StoryParagraph("His best friend was Henry Clerval.", "بهترین دوستش هنری کلروال بود."),
                    StoryParagraph("As a boy, Victor loved science.", "در کودکی، ویکتور عاشق علم بود."),
                    StoryParagraph("He read books about alchemy and magic.", "کتاب‌هایی درباره کیمیاگری و جادو می‌خواند."),
                    StoryParagraph("When his mother died, he was devastated.", "وقتی مادرش مرد، ویران شد."),
                    StoryParagraph("He decided to defeat death itself.", "تصمیم گرفت خود مرگ را شکست دهد."),
                    StoryParagraph("He went to university in Ingolstadt.", "او به دانشگاه اینگولشتات رفت."),
                    StoryParagraph("There, he studied chemistry and anatomy.", "آنجا شیمی و کالبدشناسی خواند."),
                    StoryParagraph("His professor, Waldman, inspired him.", "استادش والدم الهامش داد."),
                    StoryParagraph("Victor became obsessed with creating life.", "ویکتور به آفرینش زندگی معتاد شد."),
                    StoryParagraph("He spent years studying the human body.", "سال‌ها به مطالعه بدن انسان پرداخت."),
                    StoryParagraph("He discovered the secret of life.", "او راز زندگی را کشف کرد."),
                    StoryParagraph("He could give life to dead matter.", "می‌توانست به ماده مرده زندگی بدهد."),
                    StoryParagraph("He began to collect body parts.", "او شروع کرد به جمع کردن اعضای بدن."),
                    StoryParagraph("He took them from graveyards and hospitals.", "آن‌ها را از قبرستان‌ها و بیمارستان‌ها می‌گرفت."),
                    StoryParagraph("He worked in a secret laboratory.", "او در آزمایشگاهی مخفی کار می‌کرد."),
                    StoryParagraph("He did not see his family for two years.", "دو سال خانواده‌اش را ندید."),
                    StoryParagraph("Finally, he was ready to create life.", "بالاخره آماده شد زندگی بیافریند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Creation", titlePersian = "خلق موجود",
                paragraphs = listOf(
                    StoryParagraph("It was a cold November night.", "شب سرد نوامبر بود."),
                    StoryParagraph("Victor assembled the body on a table.", "ویکتور جسد را روی میزی سرهم کرد."),
                    StoryParagraph("He had chosen the parts carefully.", "اعضا را با دقت انتخاب کرده بود."),
                    StoryParagraph("The creature was eight feet tall.", "موجود هشت فوت قد داشت."),
                    StoryParagraph("Its skin was yellow and stretched.", "پوستش زرد و کشیده بود."),
                    StoryParagraph("Its eyes were watery and pale.", "چشم‌هایش آبکی و رنگ‌پریده بودند."),
                    StoryParagraph("Its lips were black and thin.", "لب‌هایش سیاه و نازک بودند."),
                    StoryParagraph("Victor used electricity to give it life.", "ویکتور از برق برای زنده کردنش استفاده کرد."),
                    StoryParagraph("The creature's eyes opened.", "چشم‌های موجود باز شدند."),
                    StoryParagraph("It began to breathe.", "شروع کرد به نفس کشیدن."),
                    StoryParagraph("It moved its arms and legs.", "دست‌ها و پاهایش را حرکت داد."),
                    StoryParagraph("Victor looked at his creation in horror.", "ویکتور با وحشت به آفریده‌اش نگاه کرد."),
                    StoryParagraph("It was not beautiful as he had dreamed.", "زیبا نبود همانطور که آرزو کرده بود."),
                    StoryParagraph("It was a monster.", "هیولا بود."),
                    StoryParagraph("The creature tried to smile at him.", "موجود تلاش کرد به او لبخند بزند."),
                    StoryParagraph("But Victor ran away in terror.", "اما ویکتور از وحشت فرار کرد."),
                    StoryParagraph("He went to his bedroom and collapsed.", "او به اتاق خوابش رفت و از حال رفت."),
                    StoryParagraph("He had a terrible nightmare.", "کابوس وحشتناکی دید."),
                    StoryParagraph("When he woke up, the creature was by his bed.", "وقتی بیدار شد، موجود کنار تختش بود."),
                    StoryParagraph("It was trying to speak to him.", "تلاش می‌کرد با او صحبت کند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Lonely Creature", titlePersian = "تنهایی موجود",
                paragraphs = listOf(
                    StoryParagraph("Victor fled from the creature.", "ویکتور از موجود فرار کرد."),
                    StoryParagraph("He wandered through the streets for hours.", "ساعت‌ها در خیابان‌ها سرگردان شد."),
                    StoryParagraph("When he returned, the creature was gone.", "وقتی برگشت، موجود رفته بود."),
                    StoryParagraph("Victor fell terribly ill.", "ویکتور به‌شدت مریض شد."),
                    StoryParagraph("His friend Henry Clerval came to care for him.", "دوستش هنری کلروال برای مراقبتش آمد."),
                    StoryParagraph("Victor slowly recovered.", "ویکتور آرام‌آرام بهبود یافت."),
                    StoryParagraph("But he could not forget his creation.", "اما نمی‌توانست آفریده‌اش را فراموش کند."),
                    StoryParagraph("Meanwhile, the creature wandered alone.", "در همین حال، موجود تنها سرگردان بود."),
                    StoryParagraph("People screamed when they saw him.", "مردم وقتی می‌دیدندش جیغ می‌زدند."),
                    StoryParagraph("They threw stones and chased him away.", "آن‌ها سنگ پرت می‌کردند و دورش می‌کردند."),
                    StoryParagraph("He was hungry, cold, and frightened.", "او گرسنه، سرد و ترسیده بود."),
                    StoryParagraph("He found shelter in a small hovel.", "او در آلونکی کوچک پناه گرفت."),
                    StoryParagraph("Next to it lived a poor peasant family.", "کنارش خانواده‌ای دهقان فقیر زندگی می‌کرد."),
                    StoryParagraph("He watched them through a crack in the wall.", "از شکافی در دیوار تماشایشان می‌کرد."),
                    StoryParagraph("He learned to speak by listening to them.", "با گوش دادن به آن‌ها صحبت کردن یاد گرفت."),
                    StoryParagraph("He learned about love and kindness.", "درباره عشق و مهربانی یاد گرفت."),
                    StoryParagraph("He wanted to be part of their family.", "می‌خواست بخشی از خانواده‌شان باشد."),
                    StoryParagraph("One day, he entered their house.", "یک روز، وارد خانه‌شان شد."),
                    StoryParagraph("The blind old father was kind to him.", "پدر پیر و نابینا با او مهربان بود."),
                    StoryParagraph("But when the others saw him, they fled in terror.", "اما وقتی دیگران دیدندش، از وحشت فرار کردند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Creature's Revenge", titlePersian = "انتقام",
                paragraphs = listOf(
                    StoryParagraph("The creature felt only hate now.", "موجود حالا فقط نفرت حس می‌کرد."),
                    StoryParagraph("He decided to find his creator.", "تصمیم گرفت سازنده‌اش را پیدا کند."),
                    StoryParagraph("He found Victor in the mountains.", "او ویکتور را در کوه‌ها پیدا کرد."),
                    StoryParagraph("Victor was shocked to see him.", "ویکتور از دیدنش شوکه شد."),
                    StoryParagraph("The creature spoke to him calmly.", "موجود آرام با او صحبت کرد."),
                    StoryParagraph("He told his story of loneliness.", "او داستان تنهایی‌اش را گفت."),
                    StoryParagraph("He said he was born good.", "او گفت خوب به دنیا آمده بود."),
                    StoryParagraph("But everyone treated him with cruelty.", "اما همه با ظلم با او رفتار می‌کردند."),
                    StoryParagraph("He asked Victor to make him a wife.", "او از ویکتور خواست برایش همسری بسازد."),
                    StoryParagraph("Another creature like himself.", "موجودی دیگر مثل خودش."),
                    StoryParagraph("Then they would leave humanity alone.", "بعد آن‌ها انسانیت را تنها می‌گذاشتند."),
                    StoryParagraph("Victor agreed at first.", "ویکتور اول موافقت کرد."),
                    StoryParagraph("He traveled to a remote island to work.", "او برای کار به جزیره‌ای دور افتاده سفر کرد."),
                    StoryParagraph("He worked for months on the female creature.", "ماه‌ها روی موجود مؤنث کار کرد."),
                    StoryParagraph("But then he changed his mind.", "اما بعد نظرش عوض شد."),
                    StoryParagraph("He was afraid of a race of monsters.", "او از نژادی از هیولاها می‌ترسید."),
                    StoryParagraph("He destroyed the female creature.", "او موجود مؤنث را نابود کرد."),
                    StoryParagraph("The creature saw this and was furious.", "موجود این را دید و خشمگین شد."),
                    StoryParagraph("He promised to destroy Victor's life.", "او قول داد زندگی ویکتور را نابود کند."),
                    StoryParagraph("He started with Victor's best friend.", "او با بهترین دوست ویکتور شروع کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End in the Arctic", titlePersian = "پایان قطب شمال",
                paragraphs = listOf(
                    StoryParagraph("The creature killed Henry Clerval.", "موجود هنری کلروال را کشت."),
                    StoryParagraph("Victor was arrested for the murder.", "ویکتور برای قتل دستگیر شد."),
                    StoryParagraph("But he was released for lack of evidence.", "اما به دلیل کمبود مدرک آزاد شد."),
                    StoryParagraph("He returned home to Geneva.", "او به ژنو برگشت."),
                    StoryParagraph("The creature killed his brother William.", "موجود برادرش ویلیام را کشت."),
                    StoryParagraph("A servant girl was blamed and executed.", "خدمتکار دختری متهم و اعدام شد."),
                    StoryParagraph("Victor's father died of grief.", "پدر ویکتور از غم مرد."),
                    StoryParagraph("Elizabeth was the creature's next victim.", "الیزابت قربانی بعدی موجود بود."),
                    StoryParagraph("She was killed on their wedding night.", "او شب عروسی‌شان کشته شد."),
                    StoryParagraph("Victor lost everyone he loved.", "ویکتور همه کسانی که دوست داشت را از دست داد."),
                    StoryParagraph("He swore to hunt the creature down.", "او قسم خورد موجود را شکار کند."),
                    StoryParagraph("He chased him north for many months.", "ماه‌ها به سمت شمال دنبالش کرد."),
                    StoryParagraph("The weather became colder and colder.", "هوا سردتر و سردتر شد."),
                    StoryParagraph("Victor became weak and sick.", "ویکتور ضعیف و مریض شد."),
                    StoryParagraph("He was rescued by a ship in the Arctic.", "او توسط کشتی‌ای در قطب شمال نجات یافت."),
                    StoryParagraph("He told his story to the captain.", "داستانش را به کاپیتان گفت."),
                    StoryParagraph("Then he died from exhaustion.", "بعد از خستگی مرد."),
                    StoryParagraph("That night, the creature came to the ship.", "آن شب، موجود به کشتی آمد."),
                    StoryParagraph("He cried over Victor's body.", "او روی جسد ویکتور گریه کرد."),
                    StoryParagraph("Then he jumped into the ice and disappeared.", "بعد به یخ پرید و ناپدید شد.")
                )
            )
        )
    )

    // ─────────────── ۱۲: تصویر دوریان گری ───────────────
    private fun story12() = StoryContent(
        storyId = "adv_dorian_gray",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Portrait", titlePersian = "نقاش و مدل",
                paragraphs = listOf(
                    StoryParagraph("Basil Hallward was a talented painter.", "بازیل هالوارد نقاش بااستعدادی بود."),
                    StoryParagraph("He lived in London in the late nineteenth century.", "او در اواخر قرن نوزدهم در لندن زندگی می‌کرد."),
                    StoryParagraph("One day, he met a young man named Dorian Gray.", "یک روز، مرد جوانی به نام دوریان گری را ملاقات کرد."),
                    StoryParagraph("Dorian was incredibly handsome.", "دوریان فوق‌العاده خوش‌قیافه بود."),
                    StoryParagraph("His beauty was almost unnatural.", "زیبایی‌اش تقریباً غیرطبیعی بود."),
                    StoryParagraph("Basil asked him to be his model.", "بازیل از او خواست مدلش شود."),
                    StoryParagraph("Dorian agreed happily.", "دوریان با خوشحالی موافقت کرد."),
                    StoryParagraph("Basil started painting his portrait.", "بازیل شروع کرد به کشیدن پرتره‌اش."),
                    StoryParagraph("He worked on it for many weeks.", "هفته‌ها روی آن کار کرد."),
                    StoryParagraph("The painting became his masterpiece.", "نقاشی شاهکارش شد."),
                    StoryParagraph("While Dorian posed, Basil introduced him to Lord Henry.", "وقتی دوریان مدل می‌شد، بازیل او را به لرد هنری معرفی کرد."),
                    StoryParagraph("Lord Henry was a witty and cynical nobleman.", "لرد هنری نجیب‌زاده‌ای باهوش و بدبین بود."),
                    StoryParagraph("He spoke about beauty, pleasure, and youth.", "او درباره زیبایی، لذت و جوانی صحبت می‌کرد."),
                    StoryParagraph("He told Dorian that youth was the only thing worth having.", "او به دوریان گفت جوانی تنها چیز ارزشمند است."),
                    StoryParagraph("Dorian listened carefully.", "دوریان با دقت گوش داد."),
                    StoryParagraph("He began to fear growing old.", "او شروع کرد به ترسیدن از پیر شدن."),
                    StoryParagraph("When Basil finished the portrait, Dorian looked at it.", "وقتی بازیل پرتره را تمام کرد، دوریان به آن نگاه کرد."),
                    StoryParagraph("It showed a young man of perfect beauty.", "جوانی با زیبایی کامل را نشان می‌داد."),
                    StoryParagraph("Dorian wished he could stay young forever.", "دوریان آرزو کرد برای همیشه جوان بماند."),
                    StoryParagraph("He said he would give his soul for it.", "او گفت برای این کار روحش را می‌داد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Wish Comes True", titlePersian = "آرزوی خطرناک",
                paragraphs = listOf(
                    StoryParagraph("The wish was made in a moment of envy.", "آرزو در لحظه‌ای از حسادت گفته شد."),
                    StoryParagraph("Dorian did not think it would come true.", "دوریان فکر نمی‌کرد حقیقت یابد."),
                    StoryParagraph("A few days later, he fell in love.", "چند روز بعد، عاشق شد."),
                    StoryParagraph("Her name was Sibyl Vane.", "اسمش سیبیل وین بود."),
                    StoryParagraph("She was a young actress in a small theater.", "او بازیگر جوانی در تئاتری کوچک بود."),
                    StoryParagraph("She was poor but beautiful and talented.", "او فقیر اما زیبا و بااستعداد بود."),
                    StoryParagraph("Dorian watched her perform every night.", "دوریان هر شب اجرایش را تماشا می‌کرد."),
                    StoryParagraph("He fell deeply in love with her art.", "او عمیقاً عاشق هنرش شد."),
                    StoryParagraph("He asked her to marry him.", "او از او خواست با او ازدواج کند."),
                    StoryParagraph("Sibyl loved him too.", "سیبیل هم دوستش داشت."),
                    StoryParagraph("She agreed with joy.", "او با خوشحالی موافقت کرد."),
                    StoryParagraph("Dorian invited Basil and Lord Henry to see her play.", "دوریان بازیل و لرد هنری را به دیدن نمایشش دعوت کرد."),
                    StoryParagraph("But that night, Sibyl acted badly.", "اما آن شب، سیبیل بد بازی کرد."),
                    StoryParagraph("Her acting was mechanical and cold.", "بازی‌اش مکانیکی و سرد بود."),
                    StoryParagraph("She said real love had ruined her art.", "او گفت عشق واقعی هنرش را خراب کرده."),
                    StoryParagraph("Dorian was embarrassed and furious.", "دوریان شرمنده و خشمگین شد."),
                    StoryParagraph("He told her he no longer loved her.", "او به او گفت دیگر دوستش ندارد."),
                    StoryParagraph("Sibyl was heartbroken.", "سیبیل دلشکسته شد."),
                    StoryParagraph("That night, she killed herself.", "آن شب، خودش را کشت."),
                    StoryParagraph("Dorian heard the news without much sorrow.", "دوریان خبر را بدون غم زیاد شنید.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Changing Portrait", titlePersian = "جوانی ابدی",
                paragraphs = listOf(
                    StoryParagraph("When Dorian got home, he looked at the portrait.", "وقتی دوریان به خانه رسید، به پرتره نگاه کرد."),
                    StoryParagraph("Something was different.", "چیزی متفاوت بود."),
                    StoryParagraph("There was a cruel smile on the painted lips.", "لبخند ظالمانه‌ای روی لب‌های نقاشی‌شده بود."),
                    StoryParagraph("Dorian was terrified.", "دوریان وحشت کرد."),
                    StoryParagraph("He realized his wish had come true.", "او فهمید آرزویش حقیقت یافته."),
                    StoryParagraph("The painting would age for him.", "نقاشی به جای او پیر می‌شد."),
                    StoryParagraph("The painting would carry his sins.", "نقاشی گناهانش را حمل می‌کرد."),
                    StoryParagraph("He would stay young and beautiful forever.", "او برای همیشه جوان و زیبا می‌ماند."),
                    StoryParagraph("He hid the painting in a locked room.", "او نقاشی را در اتاقی قفل‌شده پنهان کرد."),
                    StoryParagraph("No one was allowed to see it.", "هیچ‌کس اجازه نداشت ببیندش."),
                    StoryParagraph("He tried to forget Sibyl.", "او تلاش کرد سیبیل را فراموش کند."),
                    StoryParagraph("Lord Henry told him not to feel guilty.", "لرد هنری به او گفت احساس گناه نکند."),
                    StoryParagraph("Dorian decided to enjoy life fully.", "دوریان تصمیم گرفت از زندگی کاملاً لذت ببرد."),
                    StoryParagraph("He started to explore every kind of pleasure.", "او شروع کرد به کاوش هر نوع لذت."),
                    StoryParagraph("He collected jewels and rare objects.", "او جواهرات و اشیاء کمیاب جمع کرد."),
                    StoryParagraph("He studied music, art, and exotic perfumes.", "او موسیقی، هنر و عطرهای عجیب مطالعه کرد."),
                    StoryParagraph("Years passed but Dorian never changed.", "سال‌ها گذشت اما دوریان هرگز تغییر نکرد."),
                    StoryParagraph("His friends grew old and died.", "دوستانش پیر شدند و مردند."),
                    StoryParagraph("But Dorian remained young and beautiful.", "اما دوریان جوان و زیبا ماند."),
                    StoryParagraph("People began to talk about him.", "مردم شروع کردند درباره‌اش صحبت کنند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Hidden Sins", titlePersian = "گناهان پنهان",
                paragraphs = listOf(
                    StoryParagraph("Dorian became more and more selfish.", "دوریان خودخواه‌تر و خودخواه‌تر شد."),
                    StoryParagraph("He ruined young men and women.", "او مردان و زنان جوان را نابود می‌کرد."),
                    StoryParagraph("He treated servants cruelly.", "با خدمتکاران ظالمانه رفتار می‌کرد."),
                    StoryParagraph("Many people blamed him for their misery.", "افراد زیادی بدبختی‌شان را از او می‌دانستند."),
                    StoryParagraph("But no one could prove anything.", "اما هیچ‌کس نمی‌توانست چیزی ثابت کند."),
                    StoryParagraph("One night, Basil Hallward came to visit.", "یک شب، بازیل هالوارد به دیدنش آمد."),
                    StoryParagraph("He was worried about Dorian's reputation.", "او نگران آبروی دوریان بود."),
                    StoryParagraph("People were saying terrible things.", "مردم چیزهای وحشتناکی می‌گفتند."),
                    StoryParagraph("Dorian laughed at him.", "دوریان به او خندید."),
                    StoryParagraph("He offered to show Basil the truth.", "او پیشنهاد کرد حقیقت را به بازیل نشان دهد."),
                    StoryParagraph("He took him to the locked room.", "او او را به اتاق قفل‌شده برد."),
                    StoryParagraph("He showed him the portrait.", "پرتره را نشانش داد."),
                    StoryParagraph("Basil was horrified by what he saw.", "بازیل از آنچه دید وحشت کرد."),
                    StoryParagraph("The painting was ugly and evil.", "نقاشی زشت و شیطانی بود."),
                    StoryParagraph("It had aged and twisted.", "پیر و پیچ‌خورده شده بود."),
                    StoryParagraph("It showed every sin Dorian had committed.", "هر گناهی که دوریان کرده بود را نشان می‌داد."),
                    StoryParagraph("Basil tried to make Dorian pray.", "بازیل تلاش کرد دوریان را به دعا کردن وادار کند."),
                    StoryParagraph("But Dorian grabbed a knife.", "اما دوریان چاقویی گرفت."),
                    StoryParagraph("He stabbed Basil again and again.", "او بازیل را بارها و بارها زد."),
                    StoryParagraph("He killed his best friend.", "او بهترین دوستش را کشت.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End of Dorian Gray", titlePersian = "پایان تاریک",
                paragraphs = listOf(
                    StoryParagraph("Dorian hid the body in the locked room.", "دوریان جسد را در اتاق قفل‌شده پنهان کرد."),
                    StoryParagraph("He called an old friend named Alan Campbell.", "او دوست قدیمی‌ای به نام آلن کمپبل را صدا زد."),
                    StoryParagraph("Alan was a chemist and knew Dorian's secrets.", "آلن شیمیدانی بود که رازهای دوریان را می‌دانست."),
                    StoryParagraph("Dorian forced him to destroy the body.", "دوریان مجبورش کرد جسد را نابود کند."),
                    StoryParagraph("Alan did it but could not live with the guilt.", "آلن این کار را کرد اما نمی‌توانست با گناه زندگی کند."),
                    StoryParagraph("He killed himself a few weeks later.", "او چند هفته بعد خودش را کشت."),
                    StoryParagraph("Dorian felt nothing.", "دوریان هیچ احساسی نکرد."),
                    StoryParagraph("He continued his life of pleasure.", "او زندگی لذت‌جویانه‌اش را ادامه داد."),
                    StoryParagraph("Sibyl's brother James tried to kill him.", "برادر سیبیل، جیمز، تلاش کرد بکشدش."),
                    StoryParagraph("But Dorian's face still looked young.", "اما صورت دوریان هنوز جوان به نظر می‌رسید."),
                    StoryParagraph("James thought he had the wrong man.", "جیمز فکر کرد مرد اشتباهی را گرفته."),
                    StoryParagraph("A few days later, James was killed in a hunting accident.", "چند روز بعد، جیمز در حادثه شکار کشته شد."),
                    StoryParagraph("Dorian felt safe again.", "دوریان دوباره احساس امنیت کرد."),
                    StoryParagraph("But he was tired of his secret life.", "اما از زندگی مخفیانه‌اش خسته بود."),
                    StoryParagraph("He wanted to be good again.", "می‌خواست دوباره خوب باشد."),
                    StoryParagraph("He decided to destroy the portrait.", "تصمیم گرفت پرتره را نابود کند."),
                    StoryParagraph("He went to the locked room.", "او به اتاق قفل‌شده رفت."),
                    StoryParagraph("He stabbed the painting with a knife.", "با چاقو به نقاشی زد."),
                    StoryParagraph("A terrible scream was heard.", "جیغ وحشتناکی شنیده شد."),
                    StoryParagraph("The servants found Dorian dead on the floor.", "خدمتکاران دوریان را مرده روی زمین پیدا کردند.")
                )
            )
        )
    )
}