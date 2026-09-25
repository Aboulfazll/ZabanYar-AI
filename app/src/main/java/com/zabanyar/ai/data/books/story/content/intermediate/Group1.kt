package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۱ — داستان‌های کارآگاهی شرلوک هلمز
 *  ۱. اتودی در قرمز
 *  ۲. نشانه چهار
 *  ۳. رسوایی در بوهم
 */
object Group1 {

    fun getAll(): List<StoryContent> = listOf(
        story1(),
        story2(),
        story3(),
    )

    // ─────────────── ۱: اتودی در قرمز ───────────────
    private fun story1() = StoryContent(
        storyId = "int_study_scarlet",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Meeting Watson", titlePersian = "ملاقات با واتسون",
                paragraphs = listOf(
                    StoryParagraph("Dr. John Watson returned to London after the war.", "دکتر جان واتسون بعد از جنگ به لندن برگشت."),
                    StoryParagraph("He was wounded and needed a quiet place to live.", "او زخمی بود و به یک جای آرام برای زندگی نیاز داشت."),
                    StoryParagraph("One day, he met an old friend named Stamford.", "یک روز، دوست قدیمی‌اش به نام استمفورد را دید."),
                    StoryParagraph("Stamford told him about a man looking for a roommate.", "استمفورد به او از مردی گفت که دنبال هم‌اتاقی بود."),
                    StoryParagraph("The man's name was Sherlock Holmes.", "اسم آن مرد شرلوک هلمز بود."),
                    StoryParagraph("Watson was curious about this stranger.", "واتسون درباره این غریبه کنجکاو شد."),
                    StoryParagraph("They met at a hospital laboratory.", "آن‌ها در آزمایشگاه یک بیمارستان ملاقات کردند."),
                    StoryParagraph("Holmes was tall, thin, and very smart.", "هلمز بلندقد، لاغر و خیلی باهوش بود."),
                    StoryParagraph("He was working on a strange experiment.", "او داشت روی یک آزمایش عجیب کار می‌کرد."),
                    StoryParagraph("He was trying to find a test for blood.", "او تلاش می‌کرد آزمایشی برای تشخیص خون پیدا کند."),
                    StoryParagraph("Watson was amazed by his knowledge.", "واتسون از دانش او شگفت‌زده شد."),
                    StoryParagraph("Holmes said he knew Watson had been in Afghanistan.", "هلمز گفت می‌داند واتسون در افغانستان بوده است."),
                    StoryParagraph("Watson asked how he knew that.", "واتسون پرسید از کجا می‌داند."),
                    StoryParagraph("Holmes explained his method of deduction.", "هلمز روش استدلال خودش را توضیح داد."),
                    StoryParagraph("Watson was very impressed.", "واتسون خیلی تحت تأثیر قرار گرفت."),
                    StoryParagraph("They decided to share a flat on Baker Street.", "آن‌ها تصمیم گرفتند در خیابان بیکر یک آپارتمان مشترک بگیرند."),
                    StoryParagraph("It was apartment 221B.", "آپارتمان شماره ۲۲۱B بود."),
                    StoryParagraph("This was the beginning of a great friendship.", "این شروع یک دوستی بزرگ بود."),
                    StoryParagraph("Watson wrote about their adventures later.", "واتسون بعداً درباره ماجراهایشان نوشت."),
                    StoryParagraph("But for now, they were just two strangers.", "اما برای حالا، آن‌ها فقط دو غریبه بودند.")
                )
            ),
            StoryChapter(
                number = 2, title = "A Mysterious Murder", titlePersian = "قتل مرموز",
                paragraphs = listOf(
                    StoryParagraph("One morning, a policeman came to Baker Street.", "یک صبح، یک پلیس به خیابان بیکر آمد."),
                    StoryParagraph("There was a dead man in an empty house.", "مردی مرده در یک خانه خالی پیدا شده بود."),
                    StoryParagraph("The man's name was Enoch Drebber.", "اسم آن مرد انوک دربر بود."),
                    StoryParagraph("He was an American visiting London.", "او آمریکایی بود که به لندن سفر کرده بود."),
                    StoryParagraph("No one knew why he was killed.", "هیچ‌کس نمی‌دانست چرا کشته شده است."),
                    StoryParagraph("Holmes and Watson went to the house.", "هلمز و واتسون به خانه رفتند."),
                    StoryParagraph("The body was on the floor.", "جسد روی زمین بود."),
                    StoryParagraph("There was no blood on the body.", "خونی روی جسد نبود."),
                    StoryParagraph("But there was blood on the wall.", "اما خون روی دیوار بود."),
                    StoryParagraph("The word RACHE was written in blood.", "کلمه RACHE با خون نوشته شده بود."),
                    StoryParagraph("Rache is German for revenge.", "Rache در آلمانی یعنی انتقام."),
                    StoryParagraph("A wedding ring was found near the body.", "یک حلقه ازدواج نزدیک جسد پیدا شد."),
                    StoryParagraph("Two policemen were confused.", "دو پلیس گیج شده بودند."),
                    StoryParagraph("But Holmes noticed small details.", "اما هلمز جزئیات کوچک را متوجه شد."),
                    StoryParagraph("He looked at footprints and marks.", "او به رد پا و علامت‌ها نگاه کرد."),
                    StoryParagraph("He found a small piece of ash.", "او یک تکه کوچک خاکستر پیدا کرد."),
                    StoryParagraph("It was from a specific type of cigar.", "از یک نوع خاص سیگار برگ بود."),
                    StoryParagraph("Holmes smiled and said he would solve it.", "هلمز لبخند زد و گفت حلش می‌کند."),
                    StoryParagraph("Watson trusted him completely.", "واتسون کاملاً به او اعتماد داشت."),
                    StoryParagraph("The mystery was just beginning.", "معما تازه شروع شده بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "Tracking the Killer", titlePersian = "ردیابی قاتل",
                paragraphs = listOf(
                    StoryParagraph("Holmes began his investigation immediately.", "هلمز بلافاصله تحقیقاتش را شروع کرد."),
                    StoryParagraph("He asked about Drebber's friends.", "او درباره دوستان دربر پرسید."),
                    StoryParagraph("There was another man named Stangerson.", "مرد دیگری به نام استنجرسون بود."),
                    StoryParagraph("Stangerson lived in the same boarding house.", "استنجرسون در همان پانسیون زندگی می‌کرد."),
                    StoryParagraph("Holmes went to the boarding house.", "هلمز به پانسیون رفت."),
                    StoryParagraph("The landlady told him about both men.", "صاحب‌خانه درباره هر دو مرد به او گفت."),
                    StoryParagraph("They had been strange and secretive.", "آن‌ها عجیب و مرموز بودند."),
                    StoryParagraph("One of them was always watching the house.", "یکی از آن‌ها همیشه خانه را تماشا می‌کرد."),
                    StoryParagraph("Holmes found a clue on the street.", "هلمز سرنخی در خیابان پیدا کرد."),
                    StoryParagraph("A cab driver had seen something strange.", "یک راننده تاکسی چیز عجیبی دیده بود."),
                    StoryParagraph("A man had been waiting near the house.", "مردی نزدیک خانه منتظر بود."),
                    StoryParagraph("Holmes hired some street children.", "هلمز چند کودک خیابانی را استخدام کرد."),
                    StoryParagraph("They were his Baker Street Irregulars.", "آن‌ها گروه نامنظم خیابان بیکر او بودند."),
                    StoryParagraph("The children searched all over London.", "بچه‌ها همه‌جای لندن را گشتند."),
                    StoryParagraph("Finally, they found the cab driver.", "بالاخره راننده تاکسی را پیدا کردند."),
                    StoryParagraph("His name was Jefferson Hope.", "اسمش جفرسون هوپ بود."),
                    StoryParagraph("He was an American with a secret.", "او یک آمریکایی با رازی بود."),
                    StoryParagraph("Holmes invited him to Baker Street.", "هلمز او را به خیابان بیکر دعوت کرد."),
                    StoryParagraph("Hope confessed everything.", "هوپ همه چیز را اعتراف کرد."),
                    StoryParagraph("It was a story of love and revenge.", "داستان عشق و انتقام بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Old Story", titlePersian = "داستان قدیمی",
                paragraphs = listOf(
                    StoryParagraph("Jefferson Hope told his story with tears.", "جفرسون هوپ داستانش را با اشک گفت."),
                    StoryParagraph("Many years ago, he was in America.", "سال‌ها پیش، او در آمریکا بود."),
                    StoryParagraph("He fell in love with a girl named Lucy.", "او عاشق دختری به نام لوسی شد."),
                    StoryParagraph("Lucy's father was a rich man.", "پدر لوسی مرد ثروتمندی بود."),
                    StoryParagraph("But Drebber and Stangerson wanted Lucy too.", "اما دربر و استنجرسون هم لوسی را می‌خواستند."),
                    StoryParagraph("They were members of a secret group.", "آن‌ها اعضای یک گروه مخفی بودند."),
                    StoryParagraph("When Lucy's father died, they took her away.", "وقتی پدر لوسی مرد، آن‌ها او را بردند."),
                    StoryParagraph("Hope tried to save her, but he failed.", "هوپ تلاش کرد نجاتش دهد، اما موفق نشد."),
                    StoryParagraph("Lucy was forced to marry Drebber.", "لوسی مجبور شد با دربر ازدواج کند."),
                    StoryParagraph("She died soon after from sadness.", "او خیلی زود از غم مرد."),
                    StoryParagraph("Hope swore revenge on both men.", "هوپ قسم خورد از هر دو مرد انتقام بگیرد."),
                    StoryParagraph("He followed them to Europe.", "او آن‌ها را تا اروپا دنبال کرد."),
                    StoryParagraph("In London, he finally caught Drebber.", "در لندن، بالاخره دربر را گرفت."),
                    StoryParagraph("He gave him a choice: two pills.", "او به او یک انتخاب داد: دو قرص."),
                    StoryParagraph("One was poison, one was safe.", "یکی سم بود، یکی بی‌خطر."),
                    StoryParagraph("Drebber took the poison pill and died.", "دربر قرص سم را خورد و مرد."),
                    StoryParagraph("Hope wrote RACHE on the wall.", "هوپ RACHE را روی دیوار نوشت."),
                    StoryParagraph("It was his way of saying revenge.", "این روش او برای گفتن انتقام بود."),
                    StoryParagraph("He was ready to face his punishment.", "او آماده بود مجازاتش را بپذیرد."),
                    StoryParagraph("But he died of illness before the trial.", "اما قبل از محاکمه از بیماری مرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Truth", titlePersian = "حقیقت نهایی",
                paragraphs = listOf(
                    StoryParagraph("Watson listened to the story with shock.", "واتسون با شوک به داستان گوش داد."),
                    StoryParagraph("Holmes explained how he solved the case.", "هلمز توضیح داد چطور پرونده را حل کرد."),
                    StoryParagraph("The footprints showed the killer's height.", "رد پا قد قاتل را نشان داد."),
                    StoryParagraph("The cigar ash revealed his habits.", "خاکستر سیگار عادت‌هایش را نشان داد."),
                    StoryParagraph("The wedding ring was a clue about love.", "حلقه ازدواج سرنخی درباره عشق بود."),
                    StoryParagraph("The word RACHE showed it was revenge.", "کلمه RACHE نشان می‌داد انتقام بود."),
                    StoryParagraph("Everything pointed to one man.", "همه چیز به یک مرد اشاره داشت."),
                    StoryParagraph("Holmes was proud of his work.", "هلمز به کارش افتخار می‌کرد."),
                    StoryParagraph("The police got all the credit.", "پلیس تمام اعتبار را گرفت."),
                    StoryParagraph("But Holmes did not care about fame.", "اما هلمز به شهرت اهمیت نمی‌داد."),
                    StoryParagraph("He only cared about the truth.", "او فقط به حقیقت اهمیت می‌داد."),
                    StoryParagraph("Watson wrote the story in his journal.", "واتسون داستان را در دفترش نوشت."),
                    StoryParagraph("This was their first case together.", "این اولین پرونده مشترکشان بود."),
                    StoryParagraph("It would not be the last.", "آخرینش نمی‌بود."),
                    StoryParagraph("Many more adventures waited for them.", "ماجراهای بیشتری در انتظارشان بود."),
                    StoryParagraph("They went back to Baker Street.", "آن‌ها به خیابان بیکر برگشتند."),
                    StoryParagraph("Mrs. Hudson made them tea.", "خانم هادسون برایشان چای درست کرد."),
                    StoryParagraph("Holmes played his violin quietly.", "هلمز آرام ویولن نواخت."),
                    StoryParagraph("Watson wrote notes about the case.", "واتسون یادداشت‌هایی درباره پرونده نوشت."),
                    StoryParagraph("And so began the legend of Sherlock Holmes.", "و اینگونه افسانه شرلوک هلمز آغاز شد.")
                )
            )
        )
    )

    // ─────────────── ۲: نشانه چهار ───────────────
    private fun story2() = StoryContent(
        storyId = "int_sign_four",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "A Mysterious Client", titlePersian = "مشتری مرموز",
                paragraphs = listOf(
                    StoryParagraph("Watson was unhappy because Holmes was quiet.", "واتسون ناراحت بود چون هلمز ساکت بود."),
                    StoryParagraph("Holmes had no case for many weeks.", "هلمز چند هفته هیچ پرونده‌ای نداشت."),
                    StoryParagraph("One morning, a woman came to Baker Street.", "یک صبح، زنی به خیابان بیکر آمد."),
                    StoryParagraph("Her name was Mary Morstan.", "اسمش مری مورستن بود."),
                    StoryParagraph("She was young and beautiful.", "او جوان و زیبا بود."),
                    StoryParagraph("She told them a strange story.", "او داستان عجیبی برایشان تعریف کرد."),
                    StoryParagraph("Her father was an officer in India.", "پدرش افسری در هند بود."),
                    StoryParagraph("He disappeared ten years ago.", "او ده سال پیش ناپدید شد."),
                    StoryParagraph("Every year, she received a pearl in the mail.", "هر سال، یک مروارید از طریق پست دریافت می‌کرد."),
                    StoryParagraph("Six pearls had arrived so far.", "تا حالا شش مروارید رسیده بود."),
                    StoryParagraph("The sender was unknown.", "فرستنده ناشناس بود."),
                    StoryParagraph("Last week, she received a letter.", "هفته گذشته، نامه‌ای دریافت کرد."),
                    StoryParagraph("The letter asked her to meet someone.", "نامه از او خواسته بود با کسی ملاقات کند."),
                    StoryParagraph("It said she was a wronged woman.", "نوشته بود که او زنی مظلوم است."),
                    StoryParagraph("Holmes was interested in the case.", "هلمز به پرونده علاقه‌مند شد."),
                    StoryParagraph("He asked many questions.", "او سوالات زیادی پرسید."),
                    StoryParagraph("Mary answered with patience.", "مری با صبر جواب داد."),
                    StoryParagraph("Watson looked at her with admiration.", "واتسون با تحسین به او نگاه کرد."),
                    StoryParagraph("Holmes noticed his friend's feelings.", "هلمز احساسات دوستش را متوجه شد."),
                    StoryParagraph("He smiled but said nothing.", "او لبخند زد اما چیزی نگفت.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Indian Treasure", titlePersian = "گنج هندی",
                paragraphs = listOf(
                    StoryParagraph("The appointment was at a theater.", "قرار ملاقات در یک تئاتر بود."),
                    StoryParagraph("A man named Thaddeus Sholto sent it.", "مردی به نام تادئوس شولتو آن را فرستاده بود."),
                    StoryParagraph("Holmes, Watson, and Mary went together.", "هلمز، واتسون و مری با هم رفتند."),
                    StoryParagraph("Thaddeus lived in a strange house.", "تادئوس در خانه‌ای عجیب زندگی می‌کرد."),
                    StoryParagraph("He was nervous and afraid.", "او مضطرب و ترسیده بود."),
                    StoryParagraph("He told them the truth about Mary's father.", "او حقیقت را درباره پدر مری گفت."),
                    StoryParagraph("Captain Morstan and Major Sholto were friends.", "کاپیتان مورستن و سرگرد شولتو دوست بودند."),
                    StoryParagraph("They served in India together.", "آن‌ها با هم در هند خدمت می‌کردند."),
                    StoryParagraph("One night, a treasure was given to them.", "یک شب، گنجی به آن‌ها داده شد."),
                    StoryParagraph("It was a great treasure from an Indian prince.", "گنج بزرگی از یک شاهزاده هندی بود."),
                    StoryParagraph("Morstan and Sholto agreed to share it.", "مورستن و شولتو توافق کردند آن را تقسیم کنند."),
                    StoryParagraph("But Morstan died before he got his share.", "اما مورستن قبل از گرفتن سهمش مرد."),
                    StoryParagraph("Sholto hid the treasure in his house.", "شولتو گنج را در خانه‌اش پنهان کرد."),
                    StoryParagraph("He was afraid of being caught.", "او می‌ترسید دستگیر شود."),
                    StoryParagraph("He never told anyone where it was.", "او هرگز به کسی نگفت کجاست."),
                    StoryParagraph("The pearls were sent to Mary as a gift.", "مرواریدها به عنوان هدیه برای مری فرستاده شدند."),
                    StoryParagraph("They were from the treasure.", "آن‌ها از خود گنج بودند."),
                    StoryParagraph("Thaddeus wanted to give her the rest.", "تادئوس می‌خواست بقیه را به او بدهد."),
                    StoryParagraph("But the treasure was still hidden.", "اما گنج هنوز پنهان بود."),
                    StoryParagraph("Holmes listened carefully to every word.", "هلمز با دقت به هر کلمه گوش داد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Chase in London", titlePersian = "تعقیب در لندن",
                paragraphs = listOf(
                    StoryParagraph("Holmes wanted to see the treasure.", "هلمز می‌خواست گنج را ببیند."),
                    StoryParagraph("They went to Major Sholto's old house.", "آن‌ها به خانه قدیمی سرگرد شولتو رفتند."),
                    StoryParagraph("The house was called Pondicherry Lodge.", "خانه‌اش پوندیچری لژ نام داشت."),
                    StoryParagraph("Sholto's son Bartholomew lived there.", "پسر شولتو، بارتولومیوس آنجا زندگی می‌کرد."),
                    StoryParagraph("He was angry about the treasure.", "او درباره گنج عصبانی بود."),
                    StoryParagraph("He didn't want to share it.", "نمی‌خواست آن را تقسیم کند."),
                    StoryParagraph("But Holmes insisted on searching.", "اما هلمز اصرار کرد که جستجو کنند."),
                    StoryParagraph("They went into the room with the treasure.", "آن‌ها وارد اتاق گنج شدند."),
                    StoryParagraph("They found Bartholomew dead on the floor.", "بارتولومیوس را مرده روی زمین پیدا کردند."),
                    StoryParagraph("A long thorn was in his neck.", "خاری بلند در گردنش بود."),
                    StoryParagraph("The treasure was missing.", "گنج گم شده بود."),
                    StoryParagraph("There were footprints on the wall.", "رد پا روی دیوار بود."),
                    StoryParagraph("A small wooden leg made a mark.", "یک پای چوبی کوچک علامتی گذاشته بود."),
                    StoryParagraph("Holmes noticed a strange smell.", "هلمز بوی عجیبی حس کرد."),
                    StoryParagraph("It was a poison from India.", "زهر از هند بود."),
                    StoryParagraph("The killer used a blowpipe.", "قاتل از یک تفنگ بادی استفاده کرده بود."),
                    StoryParagraph("Athelney Jones, a policeman, was confused.", "آتلنی جونز، یک پلیس، گیج شده بود."),
                    StoryParagraph("But Holmes had a plan.", "اما هلمز نقشه‌ای داشت."),
                    StoryParagraph("He called his street children again.", "او دوباره بچه‌های خیابانی را صدا زد."),
                    StoryParagraph("They were looking for a one-legged man.", "آن‌ها دنبال مردی یک‌پا می‌گشتند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Hunt on the Thames", titlePersian = "شکار در تیمز",
                paragraphs = listOf(
                    StoryParagraph("The children found a boat on the river.", "بچه‌ها یک قایق روی رودخانه پیدا کردند."),
                    StoryParagraph("It was called the Aurora.", "اسمش آرورا بود."),
                    StoryParagraph("The one-legged man had hired it.", "مرد یک‌پا آن را کرایه کرده بود."),
                    StoryParagraph("Holmes hired a police boat.", "هلمز یک قایق پلیس کرایه کرد."),
                    StoryParagraph("They followed the Aurora down the Thames.", "آن‌ها آرورا را در تیمز دنبال کردند."),
                    StoryParagraph("The river was dark and quiet.", "رودخانه تاریک و آرام بود."),
                    StoryParagraph("Suddenly, they saw the boat ahead.", "ناگهان، قایق را جلوتر دیدند."),
                    StoryParagraph("A small man was on the deck.", "مرد کوچکی روی عرشه بود."),
                    StoryParagraph("It was Jonathan Small.", "جاناتان اسمال بود."),
                    StoryParagraph("He had a wooden leg.", "او یک پای چوبی داشت."),
                    StoryParagraph("With him was a native man from India.", "همراهش مردی بومی از هند بود."),
                    StoryParagraph("His name was Tonga.", "اسمش تونگا بود."),
                    StoryParagraph("Tonga raised his blowpipe.", "تونگا تفنگ بادی‌اش را بالا برد."),
                    StoryParagraph("Holmes and Watson fired their guns.", "هلمز و واتسون اسلحه‌هایشان را شلیک کردند."),
                    StoryParagraph("Tonga fell into the river and died.", "تونگا در رودخانه افتاد و مرد."),
                    StoryParagraph("Small tried to escape but failed.", "اسمال تلاش کرد فرار کند اما موفق نشد."),
                    StoryParagraph("He was caught by the police.", "او توسط پلیس دستگیر شد."),
                    StoryParagraph("The treasure chest was on the boat.", "صندوق گنج روی قایق بود."),
                    StoryParagraph("But it was empty.", "اما خالی بود."),
                    StoryParagraph("Small had thrown the treasure into the river.", "اسمال گنج را در رودخانه انداخته بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End of the Case", titlePersian = "پایان ماجرا",
                paragraphs = listOf(
                    StoryParagraph("Jonathan Small told his story in prison.", "جاناتان اسمال داستانش را در زندان گفت."),
                    StoryParagraph("He was a soldier in India long ago.", "او سال‌ها پیش سربازی در هند بود."),
                    StoryParagraph("During a rebellion, he found the treasure.", "در طول شورشی، گنج را پیدا کرد."),
                    StoryParagraph("He and three others took it.", "او و سه نفر دیگر آن را برداشتند."),
                    StoryParagraph("But they were caught and sent to prison.", "اما آن‌ها دستگیر و به زندان فرستاده شدند."),
                    StoryParagraph("Small escaped with Tonga's help.", "اسمال با کمک تونگا فرار کرد."),
                    StoryParagraph("They came to London to find the treasure.", "آن‌ها به لندن آمدند تا گنج را پیدا کنند."),
                    StoryParagraph("Small killed Bartholomew with the blowpipe.", "اسمال بارتولومیوس را با تفنگ بادی کشت."),
                    StoryParagraph("He wanted revenge for his years in prison.", "او می‌خواست برای سال‌های زندانش انتقام بگیرد."),
                    StoryParagraph("But he lost the treasure forever.", "اما او گنج را برای همیشه از دست داد."),
                    StoryParagraph("It sank to the bottom of the Thames.", "آن در ته تیمز فرو رفت."),
                    StoryParagraph("Mary Morstan was sad about the treasure.", "مری مورستن درباره گنج غمگین بود."),
                    StoryParagraph("But Watson had good news for her.", "اما واتسون خبر خوبی برایش داشت."),
                    StoryParagraph("He asked her to marry him.", "او از او خواست با او ازدواج کند."),
                    StoryParagraph("She said yes with a smile.", "او با لبخند بله گفت."),
                    StoryParagraph("Holmes was happy for his friend.", "هلمز برای دوستش خوشحال بود."),
                    StoryParagraph("The case was over.", "پرونده تمام شد."),
                    StoryParagraph("Watson and Mary got married soon after.", "واتسون و مری خیلی زود ازدواج کردند."),
                    StoryParagraph("Holmes continued to solve crimes alone.", "هلمز به تنهایی به حل جنایات ادامه داد."),
                    StoryParagraph("But their friendship remained strong forever.", "اما دوستی‌شان برای همیشه قوی ماند.")
                )
            )
        )
    )

    // ─────────────── ۳: رسوایی در بوهم ───────────────
    private fun story3() = StoryContent(
        storyId = "int_scandal_bohemia",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The King of Bohemia", titlePersian = "پادشاه بوهم",
                paragraphs = listOf(
                    StoryParagraph("Watson visited Holmes on a cold night in March.", "واتسون یک شب سرد در ماه مارس به دیدن هلمز رفت."),
                    StoryParagraph("Holmes was standing by the window.", "هلمز کنار پنجره ایستاده بود."),
                    StoryParagraph("He was thinking about a case.", "او به یک پرونده فکر می‌کرد."),
                    StoryParagraph("A letter had arrived that morning.", "صبح آن روز نامه‌ای رسیده بود."),
                    StoryParagraph("It was from a rich German nobleman.", "از یک نجیب‌زاده ثروتمند آلمانی بود."),
                    StoryParagraph("The letter said he would visit at night.", "نامه گفته بود شب به دیدنش می‌آید."),
                    StoryParagraph("The writer wanted to hide his name.", "نویسنده می‌خواست نامش را پنهان کند."),
                    StoryParagraph("But Holmes knew who he was.", "اما هلمز می‌دانست او کیست."),
                    StoryParagraph("It was the King of Bohemia.", "پادشاه بوهم بود."),
                    StoryParagraph("A carriage arrived at eight o'clock.", "کالسکه‌ای ساعت هشت رسید."),
                    StoryParagraph("A tall man in a mask entered the room.", "مردی بلندقد با ماسک وارد اتاق شد."),
                    StoryParagraph("He was nervous and walked quickly.", "او مضطرب بود و سریع راه می‌رفت."),
                    StoryParagraph("He said his name was Count Von Kramm.", "او گفت نامش کنت فون کرام است."),
                    StoryParagraph("Holmes smiled and said the truth.", "هلمز لبخند زد و حقیقت را گفت."),
                    StoryParagraph("The King was surprised but relieved.", "پادشاه تعجب کرد اما راحت شد."),
                    StoryParagraph("He took off his mask.", "او ماسکش را برداشت."),
                    StoryParagraph("He needed Holmes' help urgently.", "او فوراً به کمک هلمز نیاز داشت."),
                    StoryParagraph("Holmes asked about the problem.", "هلمز درباره مشکل پرسید."),
                    StoryParagraph("The King said it was about a woman.", "پادشاه گفت درباره یک زن است."),
                    StoryParagraph("Her name was Irene Adler.", "اسمش ایرن آدلر بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "Irene Adler", titlePersian = "ایرن آدلر",
                paragraphs = listOf(
                    StoryParagraph("Irene Adler was an opera singer.", "ایرن آدلر خواننده اپرا بود."),
                    StoryParagraph("She was beautiful and very clever.", "او زیبا و بسیار باهوش بود."),
                    StoryParagraph("The King had loved her five years ago.", "پادشاه پنج سال پیش او را دوست داشت."),
                    StoryParagraph("They wrote letters to each other.", "آن‌ها به هم نامه می‌نوشتند."),
                    StoryParagraph("She kept a photograph of both of them.", "او عکسی از هر دویشان نگه داشت."),
                    StoryParagraph("Now the King was going to marry a princess.", "حالا پادشاه می‌خواست با شاهزاده‌خانمی ازدواج کند."),
                    StoryParagraph("The princess was from Scandinavia.", "شاهزاده‌خانم از اسکاندیناوی بود."),
                    StoryParagraph("If the photo was shown, the marriage would fail.", "اگر عکس نشان داده می‌شد، ازدواج شکست می‌خورد."),
                    StoryParagraph("Irene wanted to ruin the King's wedding.", "ایرن می‌خواست عروسی پادشاه را خراب کند."),
                    StoryParagraph("She had threatened to send the photo.", "او تهدید کرده بود عکس را می‌فرستد."),
                    StoryParagraph("The King wanted Holmes to get it back.", "پادشاه می‌خواست هلمز آن را پس بگیرد."),
                    StoryParagraph("Holmes asked for a large payment.", "هلمز درخواست مبلغ زیادی کرد."),
                    StoryParagraph("The King agreed immediately.", "پادشاه فوراً موافقت کرد."),
                    StoryParagraph("Holmes needed a plan.", "هلمز به یک نقشه نیاز داشت."),
                    StoryParagraph("First, he needed to find the photo.", "اول، باید عکس را پیدا می‌کرد."),
                    StoryParagraph("Then, he needed to take it.", "بعد، باید آن را می‌گرفت."),
                    StoryParagraph("Irene lived in a house in London.", "ایرن در خانه‌ای در لندن زندگی می‌کرد."),
                    StoryParagraph("She had a maid and a coachman.", "او یک خدمتکار و یک کالسکه‌چی داشت."),
                    StoryParagraph("Holmes changed his clothes and went out.", "هلمز لباسش را عوض کرد و بیرون رفت."),
                    StoryParagraph("He was going to spy on her.", "او می‌رفت تا جاسوسی‌اش کند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Secret Plan", titlePersian = "نقشه مخفی",
                paragraphs = listOf(
                    StoryParagraph("Holmes dressed as a poor stableman.", "هلمز لباس یک ایلچی فقیر پوشید."),
                    StoryParagraph("He went to Irene's house in the evening.", "او عصر به خانه ایرن رفت."),
                    StoryParagraph("He met her coachman on the street.", "او کالسکه‌چی‌اش را در خیابان دید."),
                    StoryParagraph("They talked about horses and work.", "آن‌ها درباره اسب و کار صحبت کردند."),
                    StoryParagraph("Holmes gave him some money.", "هلمز کمی پول به او داد."),
                    StoryParagraph("The coachman told him about Irene.", "کالسکه‌چی درباره ایرن به او گفت."),
                    StoryParagraph("She was quiet and stayed at home.", "او ساکت بود و در خانه می‌ماند."),
                    StoryParagraph("But one man visited her often.", "اما مردی زیاد به دیدنش می‌آمد."),
                    StoryParagraph("His name was Godfrey Norton.", "اسمش گادفری نورتون بود."),
                    StoryParagraph("He was a lawyer and a friend.", "او وکیل و دوستش بود."),
                    StoryParagraph("Holmes watched the house carefully.", "هلمز با دقت خانه را تماشا کرد."),
                    StoryParagraph("He saw Irene come to the window.", "او دید ایرن به پنجره آمد."),
                    StoryParagraph("She looked at a small photo in her hand.", "او به عکس کوچکی در دستش نگاه کرد."),
                    StoryParagraph("Holmes was sure it was the King's photo.", "هلمز مطمئن بود عکس پادشاه است."),
                    StoryParagraph("The next day, Holmes made a new plan.", "روز بعد، هلمز نقشه جدیدی کشید."),
                    StoryParagraph("He dressed as a priest this time.", "این بار لباس کشیش پوشید."),
                    StoryParagraph("He went to Irene's house with Watson.", "او با واتسون به خانه ایرن رفت."),
                    StoryParagraph("They pretended to be in an emergency.", "آن‌ها تظاهر کردند در وضعیت اضطراری هستند."),
                    StoryParagraph("Irene let them into her house.", "ایرن آن‌ها را به خانه‌اش راه داد."),
                    StoryParagraph("Holmes saw the photo on the wall.", "هلمز عکس را روی دیوار دید.")
                )
            ),
            StoryChapter(
                number = 4, title = "The False Fire", titlePersian = "آتش ساختگی",
                paragraphs = listOf(
                    StoryParagraph("Holmes had a clever plan.", "هلمز نقشه هوشمندانه‌ای داشت."),
                    StoryParagraph("He threw a small smoke bomb into the room.", "او یک بمب دودی کوچک به اتاق انداخت."),
                    StoryParagraph("People thought the house was on fire.", "مردم فکر کردند خانه آتش گرفته است."),
                    StoryParagraph("Irene ran to save her most precious thing.", "ایرن دوید تا ارزشمندترین چیزهایش را نجات دهد."),
                    StoryParagraph("She went straight to a secret hiding place.", "او مستقیم به یک مخفیگاه مخفی رفت."),
                    StoryParagraph("Holmes saw exactly where the photo was.", "هلمز دقیقاً دید عکس کجاست."),
                    StoryParagraph("He now knew the hiding place.", "او حالا مخفیگاه را می‌دانست."),
                    StoryParagraph("But he did not take the photo yet.", "اما هنوز عکس را برنداشت."),
                    StoryParagraph("He wanted to be sure about everything.", "او می‌خواست از همه چیز مطمئن باشد."),
                    StoryParagraph("The next morning, he went with the King.", "صبح روز بعد، او با پادشاه رفت."),
                    StoryParagraph("They were going to get the photo.", "آن‌ها می‌رفتند عکس را بگیرند."),
                    StoryParagraph("But Irene's maid said she had left.", "اما خدمتکار ایرن گفت او رفته است."),
                    StoryParagraph("She had gone to the train station.", "او به ایستگاه قطار رفته بود."),
                    StoryParagraph("She was leaving London forever.", "او برای همیشه لندن را ترک می‌کرد."),
                    StoryParagraph("Holmes and the King went to her house.", "هلمز و پادشاه به خانه‌اش رفتند."),
                    StoryParagraph("They searched the secret hiding place.", "آن‌ها مخفیگاه مخفی را گشتند."),
                    StoryParagraph("There was only a letter and a photo.", "فقط یک نامه و یک عکس بود."),
                    StoryParagraph("The photo was of Irene alone.", "عکس فقط از خود ایرن بود."),
                    StoryParagraph("The King's photo was gone.", "عکس پادشاه رفته بود."),
                    StoryParagraph("She had escaped with it.", "او با آن فرار کرده بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "Holmes Defeated", titlePersian = "شکست شرلوک",
                paragraphs = listOf(
                    StoryParagraph("Holmes read the letter with surprise.", "هلمز نامه را با تعجب خواند."),
                    StoryParagraph("Irene had known about the plan.", "ایرن از نقشه خبر داشت."),
                    StoryParagraph("She had dressed as a man to follow him.", "او لباس مردانه پوشیده بود تا دنبالش کند."),
                    StoryParagraph("She had heard everything he said.", "او هر چیزی که هلمز گفت شنیده بود."),
                    StoryParagraph("She was smarter than Holmes expected.", "او باهوش‌تر از آن بود که هلمز انتظار داشت."),
                    StoryParagraph("In her letter, she said she loved the King.", "او در نامه‌اش گفت پادشاه را دوست دارد."),
                    StoryParagraph("But she could not be his wife.", "اما نمی‌توانست همسرش باشد."),
                    StoryParagraph("She promised to keep the photo safe.", "او قول داد عکس را امن نگه دارد."),
                    StoryParagraph("She would never use it against him.", "او هرگز از آن علیه او استفاده نمی‌کرد."),
                    StoryParagraph("The King was very relieved.", "پادشاه خیلی راحت شد."),
                    StoryParagraph("He offered Holmes a large reward.", "او به هلمز پاداش زیادی پیشنهاد داد."),
                    StoryParagraph("But Holmes asked for something else.", "اما هلمز چیز دیگری خواست."),
                    StoryParagraph("He wanted Irene's photo.", "او عکس ایرن را می‌خواست."),
                    StoryParagraph("The King was surprised but agreed.", "پادشاه تعجب کرد اما موافقت کرد."),
                    StoryParagraph("Holmes kept her photo for many years.", "هلمز سال‌ها عکس او را نگه داشت."),
                    StoryParagraph("He called her the woman.", "او او را آن زن می‌نامید."),
                    StoryParagraph("She was the only one who beat him.", "او تنها کسی بود که هلمز را شکست داد."),
                    StoryParagraph("Watson wrote the story for everyone.", "واتسون داستان را برای همه نوشت."),
                    StoryParagraph("It became one of the most famous cases.", "این یکی از معروف‌ترین پرونده‌ها شد."),
                    StoryParagraph("And Irene Adler became a legend.", "و ایرن آدلر تبدیل به یک افسانه شد.")
                )
            )
        )
    )
}