package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۶ — داستان‌های ترسناک مدرن
 *  ۱۶. درخشش
 *  ۱۷. دراکولا
 *  ۱۸. فرانکنشتاین
 */
object Group6 {

    fun getAll(): List<StoryContent> = listOf(
        story16(),
        story17(),
        story18(),
    )

    // ─────────────── ۱۶: درخشش ───────────────
    private fun story16() = StoryContent(
        storyId = "int_shining",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Overlook Hotel", titlePersian = "هتل اورلوک",
                paragraphs = listOf(
                    StoryParagraph("Jack Torrance was a writer.", "جک تورنس نویسنده بود."),
                    StoryParagraph("He needed a quiet place to work.", "او به جایی آرام برای کار نیاز داشت."),
                    StoryParagraph("He had lost his job as a teacher.", "او شغل معلمی‌اش را از دست داده بود."),
                    StoryParagraph("He had a problem with alcohol.", "او مشکل الکل داشت."),
                    StoryParagraph("He wanted to start a new life.", "او می‌خواست زندگی جدیدی شروع کند."),
                    StoryParagraph("He applied for a job at a hotel.", "او برای شغلی در هتلی درخواست داد."),
                    StoryParagraph("The hotel was called the Overlook.", "اسم هتل اورلوک بود."),
                    StoryParagraph("It was high in the Colorado mountains.", "در کوه‌های بلند کلرادو بود."),
                    StoryParagraph("The hotel was closed in winter.", "هتل در زمستان بسته بود."),
                    StoryParagraph("Someone had to stay and take care of it.", "یک نفر باید می‌ماند و از آن مراقبت می‌کرد."),
                    StoryParagraph("The job was lonely but paid well.", "شغل تنها بود اما دستمزد خوبی داشت."),
                    StoryParagraph("Jack took his wife and son with him.", "جک همسر و پسرش را با خود برد."),
                    StoryParagraph("His wife was named Wendy.", "اسم همسرش وندی بود."),
                    StoryParagraph("His son was named Danny.", "اسم پسرش دنی بود."),
                    StoryParagraph("Danny was only five years old.", "دنی فقط پنج سال داشت."),
                    StoryParagraph("Danny had a special power.", "دنی قدرت خاصی داشت."),
                    StoryParagraph("He could see things before they happened.", "او می‌توانست چیزها را قبل از وقوع ببیند."),
                    StoryParagraph("He could feel things that others could not.", "او چیزهایی را حس می‌کرد که دیگران نمی‌توانستند."),
                    StoryParagraph("The hotel had a dark history.", "هتل تاریخ تاریکی داشت."),
                    StoryParagraph("Many strange things had happened there.", "چیزهای عجیب زیادی آنجا اتفاق افتاده بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Family Arrives", titlePersian = "خانواده تورنس",
                paragraphs = listOf(
                    StoryParagraph("The Torrance family arrived at the hotel.", "خانواده تورنس به هتل رسیدند."),
                    StoryParagraph("The hotel was huge and beautiful.", "هتل بزرگ و زیبا بود."),
                    StoryParagraph("But Danny did not like it.", "اما دنی دوستش نداشت."),
                    StoryParagraph("He felt something was wrong.", "او حس کرد چیزی اشتباه است."),
                    StoryParagraph("A man named Hallorann was the cook.", "مردی به نام هالوران آشپز بود."),
                    StoryParagraph("He was leaving for the winter.", "او برای زمستان می‌رفت."),
                    StoryParagraph("Before leaving, he talked to Danny.", "قبل از رفتن، با دنی صحبت کرد."),
                    StoryParagraph("He said he had a power too.", "او گفت او هم قدرتی دارد."),
                    StoryParagraph("He called it the shining.", "او آن را درخشش می‌نامید."),
                    StoryParagraph("He said Danny had the strongest shining he had ever seen.", "او گفت دنی قوی‌ترین درخششی را دارد که تا حالا دیده."),
                    StoryParagraph("Hallorann warned Danny about the hotel.", "هالوران به دنی درباره هتل هشدار داد."),
                    StoryParagraph("He said there were bad things there.", "او گفت چیزهای بدی آنجا هستند."),
                    StoryParagraph("But he said Danny would be safe.", "اما گفت دنی امن می‌ماند."),
                    StoryParagraph("He gave Danny his phone number.", "شماره تلفنش را به دنی داد."),
                    StoryParagraph("The family was left alone in the hotel.", "خانواده در هتل تنها ماندند."),
                    StoryParagraph("The snow started to fall.", "برف شروع به باریدن کرد."),
                    StoryParagraph("Soon the roads would be closed.", "به‌زودی جاده‌ها بسته می‌شدند."),
                    StoryParagraph("They could not leave.", "آن‌ها نمی‌توانستند بروند."),
                    StoryParagraph("Jack started to write his novel.", "جک شروع به نوشتن رمانش کرد."),
                    StoryParagraph("But strange things started to happen.", "اما چیزهای عجیبی شروع به اتفاق افتادن کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Long Winter", titlePersian = "زمستان طولانی",
                paragraphs = listOf(
                    StoryParagraph("Days passed in the empty hotel.", "روزها در هتل خالی گذشت."),
                    StoryParagraph("Jack worked on his writing every day.", "جک هر روز روی نوشته‌اش کار می‌کرد."),
                    StoryParagraph("But he wrote the same sentence again and again.", "اما یک جمله را بارها و بارها می‌نوشت."),
                    StoryParagraph("Wendy started to worry about him.", "وندی شروع کرد به نگرانی درباره‌اش."),
                    StoryParagraph("Jack became angry and strange.", "جک عصبانی و عجیب شد."),
                    StoryParagraph("He talked to himself.", "او با خودش حرف می‌زد."),
                    StoryParagraph("Danny saw terrible things.", "دنی چیزهای وحشتناکی می‌دید."),
                    StoryParagraph("He saw two girls who were dead.", "او دو دختر مرده می‌دید."),
                    StoryParagraph("They were twins.", "آن‌ها دوقلو بودند."),
                    StoryParagraph("They appeared in the hallways.", "در راهروها ظاهر می‌شدند."),
                    StoryParagraph("Danny saw blood coming from the walls.", "دنی خون می‌دید که از دیوارها می‌آمد."),
                    StoryParagraph("He saw old guests from the past.", "او مهمانان قدیمی گذشته را می‌دید."),
                    StoryParagraph("Wendy also heard strange sounds.", "وندی هم صداهای عجیب می‌شنید."),
                    StoryParagraph("She heard people in the ballroom.", "او افراد را در سالن رقص می‌شنید."),
                    StoryParagraph("But when she looked, it was empty.", "اما وقتی نگاه می‌کرد، خالی بود."),
                    StoryParagraph("The hotel was coming alive.", "هتل داشت زنده می‌شد."),
                    StoryParagraph("It wanted to hurt the family.", "می‌خواست به خانواده آسیب برساند."),
                    StoryParagraph("Jack started to go crazy.", "جک شروع کرد به دیوانه شدن."),
                    StoryParagraph("He talked to ghosts in the hotel.", "او با ارواح هتل صحبت می‌کرد."),
                    StoryParagraph("They told him to kill his family.", "آن‌ها به او گفتند خانواده‌اش را بکشد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Jack's Madness", titlePersian = "جنون پدر",
                paragraphs = listOf(
                    StoryParagraph("Jack became more and more violent.", "جک خشن‌تر و خشن‌تر شد."),
                    StoryParagraph("He attacked Wendy one night.", "او یک شب به وندی حمله کرد."),
                    StoryParagraph("Wendy locked him in the pantry.", "وندی او را در انبار حبس کرد."),
                    StoryParagraph("Jack yelled and hit the door.", "جک فریاد زد و در را زد."),
                    StoryParagraph("But the door was too strong.", "اما در خیلی محکم بود."),
                    StoryParagraph("A ghost came and opened the door.", "روحی آمد و در را باز کرد."),
                    StoryParagraph("Jack was free.", "جک آزاد شد."),
                    StoryParagraph("He took an axe from the shed.", "او تبری از انبار برداشت."),
                    StoryParagraph("He went to find his wife and son.", "او رفت همسر و پسرش را پیدا کند."),
                    StoryParagraph("Wendy heard him coming.", "وندی صدای آمدنش را شنید."),
                    StoryParagraph("She grabbed Danny and ran.", "او دنی را گرفت و دوید."),
                    StoryParagraph("They locked themselves in the bathroom.", "آن‌ها در حمام خود را حبس کردند."),
                    StoryParagraph("Jack started to break down the door.", "جک شروع کرد در را شکستن."),
                    StoryParagraph("He hit it with the axe again and again.", "با تبر بارها و بارها به آن زد."),
                    StoryParagraph("The wood started to break.", "چوب شروع به شکستن کرد."),
                    StoryParagraph("Wendy screamed for help.", "وندی فریاد زد کمک."),
                    StoryParagraph("But no one could hear them.", "اما هیچ‌کس نمی‌توانست بشنود."),
                    StoryParagraph("They were trapped in the hotel.", "آن‌ها در هتل گیر افتاده بودند."),
                    StoryParagraph("Jack cut a hole in the door.", "جک سوراخی در در ایجاد کرد."),
                    StoryParagraph("He put his face through the hole.", "صورتش را از سوراخ بیرون آورد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Escape from the Hotel", titlePersian = "فرار از هتل",
                paragraphs = listOf(
                    StoryParagraph("Suddenly, they heard a snowmobile.", "ناگهان، صدای برف‌رویی شنیدند."),
                    StoryParagraph("Hallorann had come to save them.", "هالوران آمده بود نجاتشان دهد."),
                    StoryParagraph("He had felt Danny's fear from far away.", "او ترس دنی را از دور حس کرده بود."),
                    StoryParagraph("He had traveled through the snow.", "او از میان برف سفر کرده بود."),
                    StoryParagraph("Jack heard him coming.", "جک صدای آمدنش را شنید."),
                    StoryParagraph("He left his family and went to find Hallorann.", "او خانواده‌اش را ترک کرد و رفت هالوران را پیدا کند."),
                    StoryParagraph("He attacked Hallorann with the axe.", "او با تبر به هالوران حمله کرد."),
                    StoryParagraph("Hallorann was badly hurt.", "هالوران بدجور زخمی شد."),
                    StoryParagraph("But he managed to escape.", "اما موفق شد فرار کند."),
                    StoryParagraph("Meanwhile, Wendy and Danny got out.", "در همین حال، وندی و دنی بیرون آمدند."),
                    StoryParagraph("They ran to the snowmobile.", "آن‌ها به سمت برف‌رو دویدند."),
                    StoryParagraph("Jack followed them.", "جک دنبالشان کرد."),
                    StoryParagraph("He was running through the snow.", "او در برف می‌دوید."),
                    StoryParagraph("But he was lost in the cold.", "اما در سرما گم شد."),
                    StoryParagraph("He could not find his way.", "نمی‌توانست راهش را پیدا کند."),
                    StoryParagraph("He fell in the snow.", "او در برف افتاد."),
                    StoryParagraph("He froze to death that night.", "او آن شب از سرما یخ زد."),
                    StoryParagraph("Wendy and Danny escaped.", "وندی و دنی فرار کردند."),
                    StoryParagraph("They drove far away from the hotel.", "آن‌ها دور از هتل رانندگی کردند."),
                    StoryParagraph("The Overlook Hotel was left alone.", "هتل اورلوک تنها ماند.")
                )
            )
        )
    )

    // ─────────────── ۱۷: دراکولا ───────────────
    private fun story17() = StoryContent(
        storyId = "int_dracula_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Castle of the Count", titlePersian = "قلعه کنت",
                paragraphs = listOf(
                    StoryParagraph("Jonathan Harker was a young lawyer.", "جاناتان هارکر وکیل جوانی بود."),
                    StoryParagraph("He was sent to Transylvania on business.", "او برای کاری به ترانسیلوانیا فرستاده شد."),
                    StoryParagraph("He had to meet a man named Count Dracula.", "او باید مردی به نام کنت دراکولا را ملاقات می‌کرد."),
                    StoryParagraph("The journey was long and strange.", "سفر طولانی و عجیب بود."),
                    StoryParagraph("People in the villages were afraid.", "مردم دهکده‌ها ترسیده بودند."),
                    StoryParagraph("They warned him about the castle.", "آن‌ها درباره قلعه هشدارش دادند."),
                    StoryParagraph("They gave him a cross and garlic.", "صلیب و سیر به او دادند."),
                    StoryParagraph("Jonathan did not understand why.", "جاناتان نمی‌فهمید چرا."),
                    StoryParagraph("He arrived at the castle at night.", "شب به قلعه رسید."),
                    StoryParagraph("The Count himself opened the door.", "خود کنت در را باز کرد."),
                    StoryParagraph("He was tall and pale.", "او بلندقد و رنگ‌پریده بود."),
                    StoryParagraph("His eyes were red and cold.", "چشم‌هایش سرخ و سرد بودند."),
                    StoryParagraph("His teeth were very sharp.", "دندان‌هایش خیلی تیز بودند."),
                    StoryParagraph("He welcomed Jonathan politely.", "او با ادب به جاناتان خوش‌آمد گفت."),
                    StoryParagraph("But there was something wrong with him.", "اما چیز اشتباهی درباره‌اش بود."),
                    StoryParagraph("He had no reflection in the mirror.", "او در آینه انعکاسی نداشت."),
                    StoryParagraph("He never ate with Jonathan.", "او هرگز با جاناتان غذا نمی‌خورد."),
                    StoryParagraph("He slept in a box during the day.", "او روزها در جعبه‌ای می‌خوابید."),
                    StoryParagraph("Jonathan realized the truth.", "جاناتان حقیقت را فهمید."),
                    StoryParagraph("The Count was a vampire.", "کنت یک خون‌آشام بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Hunt in London", titlePersian = "شکار در لندن",
                paragraphs = listOf(
                    StoryParagraph("Jonathan escaped from the castle.", "جاناتان از قلعه فرار کرد."),
                    StoryParagraph("He returned to England very sick.", "او خیلی مریض به انگلیس برگشت."),
                    StoryParagraph("His wife Mina took care of him.", "همسرش مینا از او مراقبت کرد."),
                    StoryParagraph("But Count Dracula had followed him.", "اما کنت دراکولا دنبالش آمده بود."),
                    StoryParagraph("He arrived in England on a ship.", "او با کشتی به انگلیس رسید."),
                    StoryParagraph("The whole crew of the ship died.", "کل خدمه کشتی مردند."),
                    StoryParagraph("Only the captain survived.", "فقط کاپیتان زنده ماند."),
                    StoryParagraph("He was found tied to the wheel.", "او بسته به فرمان کشتی پیدا شد."),
                    StoryParagraph("His log book told a terrible story.", "دفترچه‌اش داستان وحشتناکی می‌گفت."),
                    StoryParagraph("A strange man had been on the ship.", "مردی عجیب روی کشتی بود."),
                    StoryParagraph("He had killed the sailors one by one.", "او ملوانان را یکی‌یکی کشته بود."),
                    StoryParagraph("The Count came to London.", "کنت به لندن آمد."),
                    StoryParagraph("He bought an old house.", "او خانه‌ای قدیمی خرید."),
                    StoryParagraph("It was near a hospital.", "نزدیک یک بیمارستان بود."),
                    StoryParagraph("He needed blood to survive.", "او برای زنده ماندن به خون نیاز داشت."),
                    StoryParagraph("He attacked people at night.", "او شب‌ها به مردم حمله می‌کرد."),
                    StoryParagraph("His first victim was a young woman.", "اولین قربانی‌اش زن جوانی بود."),
                    StoryParagraph("Her name was Lucy Westenra.", "اسمش لوسی وستنرا بود."),
                    StoryParagraph("She had been Mina's best friend.", "او بهترین دوست مینا بود."),
                    StoryParagraph("Lucy got sicker every day.", "لوسی هر روز مریض‌تر می‌شد.")
                )
            ),
            StoryChapter(
                number = 3, title = "Lucy and Mina", titlePersian = "لوسی و مینا",
                paragraphs = listOf(
                    StoryParagraph("Lucy lost more and more blood.", "لوسی خون بیشتر و بیشتری از دست داد."),
                    StoryParagraph("No doctor could help her.", "هیچ دکتری نمی‌توانست کمکش کند."),
                    StoryParagraph("She had two marks on her neck.", "روی گردنش دو جای زخم داشت."),
                    StoryParagraph("They looked like bite marks.", "شبیه جای گاز گرفتن بودند."),
                    StoryParagraph("A doctor named Van Helsing came.", "دکتری به نام ون هلسینگ آمد."),
                    StoryParagraph("He was from Holland and very wise.", "او از هلند بود و خیلی دانا."),
                    StoryParagraph("He knew about vampires.", "او درباره خون‌آشام‌ها می‌دانست."),
                    StoryParagraph("He tried to save Lucy with garlic.", "او با سیر تلاش کرد لوسی را نجات دهد."),
                    StoryParagraph("He put garlic flowers around her bed.", "او گل‌های سیر دور تختش گذاشت."),
                    StoryParagraph("But someone removed them at night.", "اما یک نفر شب آن‌ها را برداشت."),
                    StoryParagraph("Lucy died a few days later.", "لوسی چند روز بعد مرد."),
                    StoryParagraph("But she did not stay dead.", "اما مرده نماند."),
                    StoryParagraph("She became a vampire.", "او خون‌آشام شد."),
                    StoryParagraph("She attacked small children at night.", "او شب‌ها به بچه‌های کوچک حمله می‌کرد."),
                    StoryParagraph("Van Helsing knew what to do.", "ون هلسینگ می‌دانست چکار کند."),
                    StoryParagraph("He went to her tomb with the others.", "او با دیگران به مقبره‌اش رفت."),
                    StoryParagraph("They found her body still young.", "آن‌ها جسدش را هنوز جوان پیدا کردند."),
                    StoryParagraph("She was sleeping in her coffin.", "او در تابوتش خوابیده بود."),
                    StoryParagraph("They had to kill the vampire in her.", "آن‌ها باید خون‌آشام درونش را می‌کشتند."),
                    StoryParagraph("It was terrible but necessary.", "این وحشتناک اما ضروری بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "Van Helsing's Plan", titlePersian = "ون هلسینگ",
                paragraphs = listOf(
                    StoryParagraph("Van Helsing gathered his friends.", "ون هلسینگ دوستانش را جمع کرد."),
                    StoryParagraph("There was Dr. Seward.", "دکتر سیوارد بود."),
                    StoryParagraph("There was Arthur Holmwood.", "آرتور هولموود بود."),
                    StoryParagraph("There was Quincey Morris.", "کوئینسی موریس بود."),
                    StoryParagraph("And there was Jonathan and Mina.", "و جاناتان و مینا بودند."),
                    StoryParagraph("They all promised to kill Dracula.", "همه قول دادند دراکولا را بکشند."),
                    StoryParagraph("But Dracula was very clever.", "اما دراکولا خیلی باهوش بود."),
                    StoryParagraph("He attacked Mina one night.", "او یک شب به مینا حمله کرد."),
                    StoryParagraph("He made her drink his blood.", "او مجبورش کرد خونش را بنوشد."),
                    StoryParagraph("Now Mina was connected to him.", "حالا مینا به او وصل شده بود."),
                    StoryParagraph("She could feel what he felt.", "او می‌توانست حس کند او چه حس می‌کند."),
                    StoryParagraph("She could see through his eyes.", "او می‌توانست از طریق چشم‌هایش ببیند."),
                    StoryParagraph("The group used this to find Dracula.", "گروه از این برای پیدا کردن دراکولا استفاده کرد."),
                    StoryParagraph("They found his houses in London.", "آن‌ها خانه‌هایش را در لندن پیدا کردند."),
                    StoryParagraph("They destroyed his boxes of earth.", "آن‌ها جعبه‌های خاکش را نابود کردند."),
                    StoryParagraph("Dracula needed the boxes to sleep in.", "دراکولا برای خوابیدن به جعبه‌ها نیاز داشت."),
                    StoryParagraph("Without them, he became weak.", "بدون آن‌ها، ضعیف شد."),
                    StoryParagraph("He decided to return to Transylvania.", "او تصمیم گرفت به ترانسیلوانیا برگردد."),
                    StoryParagraph("The group followed him.", "گروه دنبالش رفتند."),
                    StoryParagraph("The final fight was coming.", "نبرد نهایی نزدیک بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Battle", titlePersian = "نبرد نهایی",
                paragraphs = listOf(
                    StoryParagraph("The chase went through many countries.", "تعقیب از کشورهای زیادی گذشت."),
                    StoryParagraph("They traveled by train and boat.", "آن‌ها با قطار و قایق سفر کردند."),
                    StoryParagraph("They finally caught Dracula in Transylvania.", "بالاخره دراکولا را در ترانسیلوانیا گرفتند."),
                    StoryParagraph("It was almost sunset.", "تقریباً غروب بود."),
                    StoryParagraph("Dracula was in his box of earth.", "دراکولا در جعبه خاکش بود."),
                    StoryParagraph("His gypsy guards attacked the group.", "نگهبانان کولی‌اش به گروه حمله کردند."),
                    StoryParagraph("There was a terrible fight.", "نبرد وحشتناکی شد."),
                    StoryParagraph("Quincey Morris was wounded badly.", "کوئینسی موریس بدجور زخمی شد."),
                    StoryParagraph("But Jonathan and Arthur reached the box.", "اما جاناتان و آرتور به جعبه رسیدند."),
                    StoryParagraph("They opened it and found Dracula.", "آن‌ها بازش کردند و دراکولا را پیدا کردند."),
                    StoryParagraph("His eyes were red with hate.", "چشم‌هایش سرخ از نفرت بود."),
                    StoryParagraph("Jonathan cut his throat with a knife.", "جاناتان با چاقو گلویش را برید."),
                    StoryParagraph("Arthur stabbed him in the heart.", "آرتور در قلبش خنجر زد."),
                    StoryParagraph("Dracula turned to dust.", "دراکولا به خاک تبدیل شد."),
                    StoryParagraph("The vampire was finally dead.", "خون‌آشام بالاخره مرد."),
                    StoryParagraph("Mina was free from his power.", "مینا از قدرت او آزاد شد."),
                    StoryParagraph("But Quincey died from his wounds.", "اما کوئینسی از زخم‌هایش مرد."),
                    StoryParagraph("He died a hero.", "او به عنوان قهرمان مرد."),
                    StoryParagraph("The survivors returned to England.", "بازماندگان به انگلیس برگشتند."),
                    StoryParagraph("And they lived in peace forever after.", "و آن‌ها برای همیشه در آرامش زندگی کردند.")
                )
            )
        )
    )

    // ─────────────── ۱۸: فرانکنشتاین ───────────────
    private fun story18() = StoryContent(
        storyId = "int_frankenstein_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Young Victor", titlePersian = "ویکتور جوان",
                paragraphs = listOf(
                    StoryParagraph("Victor Frankenstein was born in Geneva.", "ویکتور فرانکنشتاین در ژنو به دنیا آمد."),
                    StoryParagraph("His family was rich and respected.", "خانواده‌اش ثروتمند و محترم بودند."),
                    StoryParagraph("He had two younger brothers.", "او دو برادر کوچکتر داشت."),
                    StoryParagraph("His parents adopted a girl named Elizabeth.", "والدینش دختری به نام الیزابت را به فرزندی گرفتند."),
                    StoryParagraph("Elizabeth became his closest friend.", "الیزابت نزدیک‌ترین دوستش شد."),
                    StoryParagraph("Victor loved to read science books.", "ویکتور عاشق خواندن کتاب‌های علمی بود."),
                    StoryParagraph("He was interested in the secrets of life.", "او به رازهای زندگی علاقه‌مند بود."),
                    StoryParagraph("When he was seventeen, he went to university.", "وقتی هفده ساله شد، به دانشگاه رفت."),
                    StoryParagraph("He studied chemistry and natural philosophy.", "او شیمی و فلسفه طبیعی خواند."),
                    StoryParagraph("His professor taught him about the human body.", "استادش درباره بدن انسان به او آموخت."),
                    StoryParagraph("Victor learned how life works.", "ویکتور یاد گرفت زندگی چطور کار می‌کند."),
                    StoryParagraph("He became obsessed with one idea.", "او به یک ایده معتاد شد."),
                    StoryParagraph("He wanted to create life from death.", "او می‌خواست از مرگ زندگی بسازد."),
                    StoryParagraph("He wanted to defeat death itself.", "او می‌خواست خود مرگ را شکست دهد."),
                    StoryParagraph("He collected body parts from graveyards.", "او اعضای بدن را از قبرستان‌ها جمع کرد."),
                    StoryParagraph("He worked in secret for two years.", "او دو سال مخفیانه کار کرد."),
                    StoryParagraph("He did not see his family or friends.", "او خانواده و دوستانش را نمی‌دید."),
                    StoryParagraph("His health suffered from the work.", "سلامتش از کار آسیب دید."),
                    StoryParagraph("But he could not stop.", "اما نمی‌توانست متوقف شود."),
                    StoryParagraph("Finally, the night came when he was ready.", "بالاخره، شبی که آماده بود رسید.")
                )
            ),
            StoryChapter(
                number = 2, title = "Creating the Monster", titlePersian = "خلق موجود",
                paragraphs = listOf(
                    StoryParagraph("It was a cold night in November.", "شب سردی در نوامبر بود."),
                    StoryParagraph("Victor put the body on a table.", "ویکتور جسد را روی میزی گذاشت."),
                    StoryParagraph("The body was made of many dead parts.", "جسد از اعضای مرده زیادی ساخته شده بود."),
                    StoryParagraph("It was eight feet tall.", "هشت فوت قد داشت."),
                    StoryParagraph("It had yellow skin and black lips.", "پوست زرد و لب‌های سیاه داشت."),
                    StoryParagraph("Victor used electricity to give it life.", "ویکتور از برق برای زنده کردنش استفاده کرد."),
                    StoryParagraph("The creature opened its eyes.", "موجود چشم‌هایش را باز کرد."),
                    StoryParagraph("It started to breathe.", "شروع کرد به نفس کشیدن."),
                    StoryParagraph("Victor was terrified by what he saw.", "ویکتور از آنچه دید وحشت کرد."),
                    StoryParagraph("The creature was horrible.", "موجود وحشتناک بود."),
                    StoryParagraph("Victor ran away from the laboratory.", "ویکتور از آزمایشگاه فرار کرد."),
                    StoryParagraph("He went to his bedroom and tried to sleep.", "او به اتاق خوابش رفت و تلاش کرد بخوابد."),
                    StoryParagraph("But he had terrible dreams.", "اما کابوس‌های وحشتناکی دید."),
                    StoryParagraph("He dreamed of Elizabeth turning into a corpse.", "او خواب دید الیزابت به جسد تبدیل می‌شود."),
                    StoryParagraph("He woke up in a cold sweat.", "او با عرق سرد بیدار شد."),
                    StoryParagraph("The creature was standing by his bed.", "موجود کنار تختش ایستاده بود."),
                    StoryParagraph("It was smiling at him.", "به او لبخند می‌زد."),
                    StoryParagraph("Victor screamed and ran out of the house.", "ویکتور جیغ زد و از خانه فرار کرد."),
                    StoryParagraph("When he came back, the creature was gone.", "وقتی برگشت، موجود رفته بود."),
                    StoryParagraph("Victor had created a monster.", "ویکتور یک هیولا ساخته بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Monster's Loneliness", titlePersian = "تنهایی هیولا",
                paragraphs = listOf(
                    StoryParagraph("The creature wandered alone for months.", "موجود ماه‌ها تنها سرگردان بود."),
                    StoryParagraph("People screamed when they saw him.", "مردم وقتی می‌دیدندش جیغ می‌زدند."),
                    StoryParagraph("They threw stones at him.", "آن‌ها به او سنگ پرت می‌کردند."),
                    StoryParagraph("They chased him away from villages.", "او را از دهکده‌ها دور می‌کردند."),
                    StoryParagraph("He was hungry and cold.", "او گرسنه و سرد بود."),
                    StoryParagraph("But he was also intelligent.", "اما او باهوش هم بود."),
                    StoryParagraph("He learned to speak by watching people.", "او با تماشای مردم صحبت کردن یاد گرفت."),
                    StoryParagraph("He learned to read from books.", "او از کتاب‌ها خواندن یاد گرفت."),
                    StoryParagraph("He found shelter in a small hut.", "او در کلبه‌ای کوچک پناه گرفت."),
                    StoryParagraph("Next to the hut lived a poor family.", "کنار کلبه خانواده فقیری زندگی می‌کرد."),
                    StoryParagraph("He watched them through a hole.", "او از سوراخی تماشایشان می‌کرد."),
                    StoryParagraph("He learned about love and kindness.", "او درباره عشق و مهربانی یاد گرفت."),
                    StoryParagraph("He wanted to be part of their family.", "او می‌خواست بخشی از خانواده‌شان باشد."),
                    StoryParagraph("One day, he entered their house.", "یک روز، وارد خانه‌شان شد."),
                    StoryParagraph("The old blind father was friendly.", "پدر پیر و نابینا مهربان بود."),
                    StoryParagraph("But when the children saw him, they screamed.", "اما وقتی بچه‌ها دیدندش، جیغ زدند."),
                    StoryParagraph("The family ran away in fear.", "خانواده از ترس فرار کردند."),
                    StoryParagraph("The creature was alone again.", "موجود دوباره تنها شد."),
                    StoryParagraph("He felt only hate in his heart.", "او فقط نفرت در قلبش حس می‌کرد."),
                    StoryParagraph("He decided to find his creator.", "او تصمیم گرفت سازنده‌اش را پیدا کند.")
                )
            ),
            StoryChapter(
                number = 4, title = "Revenge and Murder", titlePersian = "انتقام و قتل",
                paragraphs = listOf(
                    StoryParagraph("The creature found Victor in the mountains.", "موجود ویکتور را در کوه‌ها پیدا کرد."),
                    StoryParagraph("Victor was afraid but listened.", "ویکتور ترسید اما گوش داد."),
                    StoryParagraph("The creature told his sad story.", "موجود داستان غمگینش را گفت."),
                    StoryParagraph("He said he was lonely and hated.", "او گفت تنها و منفور است."),
                    StoryParagraph("He asked Victor to make him a wife.", "او از ویکتور خواست برایش همسری بسازد."),
                    StoryParagraph("A female creature like himself.", "موجودی مؤنث مثل خودش."),
                    StoryParagraph("Then they could live far away together.", "بعد آن‌ها می‌توانستند دور با هم زندگی کنند."),
                    StoryParagraph("Victor agreed at first.", "ویکتور اول موافقت کرد."),
                    StoryParagraph("He worked on the female for months.", "او ماه‌ها روی موجود مؤنث کار کرد."),
                    StoryParagraph("But then he changed his mind.", "اما بعد نظرش عوض شد."),
                    StoryParagraph("He was afraid of a race of monsters.", "او از نژادی از هیولاها می‌ترسید."),
                    StoryParagraph("He destroyed the female creature.", "او موجود مؤنث را نابود کرد."),
                    StoryParagraph("The creature was furious.", "موجود خشمگین شد."),
                    StoryParagraph("He promised to destroy Victor's life.", "او قول داد زندگی ویکتور را نابود کند."),
                    StoryParagraph("That night, he killed Victor's best friend.", "آن شب، بهترین دوست ویکتور را کشت."),
                    StoryParagraph("Victor was arrested for the murder.", "ویکتور برای قتل دستگیر شد."),
                    StoryParagraph("But he was released for lack of proof.", "اما به دلیل کمبود مدرک آزاد شد."),
                    StoryParagraph("Then the creature killed Victor's brother.", "بعد موجود برادر ویکتور را کشت."),
                    StoryParagraph("Victor's father died of sadness.", "پدر ویکتور از غم مرد."),
                    StoryParagraph("The creature had destroyed his family.", "موجود خانواده‌اش را نابود کرده بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End in the Arctic", titlePersian = "پایان قطب شمال",
                paragraphs = listOf(
                    StoryParagraph("Victor decided to chase the creature.", "ویکتور تصمیم گرفت موجود را تعقیب کند."),
                    StoryParagraph("He followed him north for many months.", "او ماه‌ها به سمت شمال دنبالش کرد."),
                    StoryParagraph("The weather became colder and colder.", "هوا سردتر و سردتر شد."),
                    StoryParagraph("Victor became weak and sick.", "ویکتور ضعیف و مریض شد."),
                    StoryParagraph("He was traveling on the ice.", "او روی یخ سفر می‌کرد."),
                    StoryParagraph("One day, he met a ship trapped in ice.", "یک روز، کشتی‌ای گرفتار در یخ دید."),
                    StoryParagraph("The captain was named Walton.", "اسم کاپیتان والتون بود."),
                    StoryParagraph("He took Victor onto the ship.", "او ویکتور را به کشتی برد."),
                    StoryParagraph("Victor told his story to the captain.", "ویکتور داستانش را برای کاپیتان تعریف کرد."),
                    StoryParagraph("He warned against the search for knowledge.", "او از جستجوی دانش هشدار داد."),
                    StoryParagraph("A few days later, Victor died.", "چند روز بعد، ویکتور مرد."),
                    StoryParagraph("That night, the creature came to the ship.", "آن شب، موجود به کشتی آمد."),
                    StoryParagraph("He cried over Victor's body.", "او روی جسد ویکتور گریه کرد."),
                    StoryParagraph("He said he was sorry for everything.", "او گفت از همه چیز متأسف است."),
                    StoryParagraph("But he could not bring back the dead.", "اما نمی‌توانست مرده‌ها را برگرداند."),
                    StoryParagraph("He promised to kill himself.", "او قول داد خودش را بکشد."),
                    StoryParagraph("He jumped off the ship into the ice.", "او از کشتی به داخل یخ پرید."),
                    StoryParagraph("He disappeared into the darkness.", "او در تاریکی ناپدید شد."),
                    StoryParagraph("The captain learned a hard lesson.", "کاپیتان درس سختی گرفت."),
                    StoryParagraph("Some knowledge should not be discovered.", "برخی دانش‌ها نباید کشف شوند.")
                )
            )
        )
    )
}