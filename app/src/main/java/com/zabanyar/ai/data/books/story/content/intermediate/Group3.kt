package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۳ — داستان‌های کارآگاهی noir
 *  ۷. شاهین مالت
 *  ۸. خواب بزرگ
 *  ۹. سنگ ماه
 */
object Group3 {

    fun getAll(): List<StoryContent> = listOf(
        story7(),
        story8(),
        story9(),
    )

    // ─────────────── ۷: شاهین مالت ───────────────
    private fun story7() = StoryContent(
        storyId = "int_maltese_falcon",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Detective Spade", titlePersian = "کارآگاه اسپید",
                paragraphs = listOf(
                    StoryParagraph("Sam Spade was a private detective in San Francisco.", "سام اسپید کارآگاه خصوصی در سانفرانسیسکو بود."),
                    StoryParagraph("He worked with his partner Miles Archer.", "او با شریکش مایلز آرچر کار می‌کرد."),
                    StoryParagraph("One day, a woman came to their office.", "یک روز، زنی به دفترشان آمد."),
                    StoryParagraph("Her name was Miss Wonderly.", "اسمش میس واندرلی بود."),
                    StoryParagraph("She wanted them to follow a man.", "او می‌خواست مردی را دنبال کنند."),
                    StoryParagraph("The man's name was Floyd Thursby.", "اسم آن مرد فلوید ثورزبی بود."),
                    StoryParagraph("She said he had run away with her sister.", "او گفت با خواهرش فرار کرده است."),
                    StoryParagraph("Spade agreed to take the case.", "اسپید موافقت کرد پرونده را بگیرد."),
                    StoryParagraph("That night, Archer was shot dead.", "آن شب، آرچر با گلوله کشته شد."),
                    StoryParagraph("Thursby was also found dead.", "ثورزبی هم مرده پیدا شد."),
                    StoryParagraph("The police came to question Spade.", "پلیس برای بازجویی از اسپید آمد."),
                    StoryParagraph("They thought Spade might be the killer.", "آن‌ها فکر کردند اسپید ممکن است قاتل باشد."),
                    StoryParagraph("But Spade had an alibi.", "اما اسپید آلبی داشت."),
                    StoryParagraph("He decided to find the real killer himself.", "او تصمیم گرفت خودش قاتل واقعی را پیدا کند."),
                    StoryParagraph("Miss Wonderly called him again.", "میس واندرلی دوباره به او زنگ زد."),
                    StoryParagraph("She had a new name: Brigid O'Shaughnessy.", "او اسم جدیدی داشت: بریجید او'شاگنسی."),
                    StoryParagraph("She was clearly lying about something.", "او واضحاً درباره چیزی دروغ می‌گفت."),
                    StoryParagraph("But Spade was attracted to her.", "اما اسپید جذبش شده بود."),
                    StoryParagraph("He agreed to help her anyway.", "او به هر حال موافقت کرد کمکش کند."),
                    StoryParagraph("The mystery was deeper than he thought.", "معما عمیق‌تر از آن بود که فکر می‌کرد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Strange Woman", titlePersian = "زن مرموز",
                paragraphs = listOf(
                    StoryParagraph("Spade met Brigid at her hotel.", "اسپید بریجید را در هتلش ملاقات کرد."),
                    StoryParagraph("She told him about a man named Gutman.", "او به او از مردی به نام گاتمن گفت."),
                    StoryParagraph("Gutman was looking for a valuable statue.", "گاتمن دنبال مجسمه‌ای ارزشمند بود."),
                    StoryParagraph("The statue was called the Maltese Falcon.", "اسم مجسمه شاهین مالت بود."),
                    StoryParagraph("It was made of gold and jewels.", "از طلا و جواهرات ساخته شده بود."),
                    StoryParagraph("It had been lost for many years.", "سال‌ها گم شده بود."),
                    StoryParagraph("Many people wanted to find it.", "افراد زیادی می‌خواستند آن را پیدا کنند."),
                    StoryParagraph("Thursby was one of them.", "ثورزبی یکی از آن‌ها بود."),
                    StoryParagraph("Brigid was also involved.", "بریجید هم درگیر بود."),
                    StoryParagraph("That night, Spade was followed by a young man.", "آن شب، مرد جوانی اسپید را دنبال کرد."),
                    StoryParagraph("His name was Wilmer Cook.", "اسمش ویلمر کوک بود."),
                    StoryParagraph("Wilmer worked for Gutman.", "ویلمر برای گاتمن کار می‌کرد."),
                    StoryParagraph("Spade went to see Gutman at his hotel.", "اسپید به دیدن گاتمن در هتلش رفت."),
                    StoryParagraph("Gutman was a fat, friendly man.", "گاتمن مردی چاق و خوش‌برخورد بود."),
                    StoryParagraph("He offered Spade a lot of money.", "او به اسپید پول زیادی پیشنهاد داد."),
                    StoryParagraph("He wanted Spade to find the falcon.", "او می‌خواست اسپید شاهین را پیدا کند."),
                    StoryParagraph("Spade pretended to agree.", "اسپید تظاهر کرد موافقت می‌کند."),
                    StoryParagraph("But he had his own plan.", "اما نقشه خودش را داشت."),
                    StoryParagraph("He wanted to find the truth about Archer's death.", "او می‌خواست حقیقت درباره مرگ آرچر را پیدا کند."),
                    StoryParagraph("The case was getting more dangerous.", "پرونده خطرناک‌تر می‌شد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Valuable Statue", titlePersian = "مجسمه ارزشمند",
                paragraphs = listOf(
                    StoryParagraph("A man named Cairo came to Spade's office.", "مردی به نام قاهره به دفتر اسپید آمد."),
                    StoryParagraph("He also wanted the Maltese Falcon.", "او هم شاهین مالت را می‌خواست."),
                    StoryParagraph("He offered to buy it from Spade.", "او پیشنهاد کرد آن را از اسپید بخرد."),
                    StoryParagraph("Spade said he didn't have it.", "اسپید گفت آن را ندارد."),
                    StoryParagraph("That night, Spade got a phone call.", "آن شب، اسپید تماس تلفنی گرفت."),
                    StoryParagraph("The captain of a ship wanted to see him.", "کاپیتان یک کشتی می‌خواست او را ببیند."),
                    StoryParagraph("The captain's name was Jacobi.", "اسم کاپیتان یاکوبی بود."),
                    StoryParagraph("He was very sick and dying.", "او خیلی مریض بود و در حال مرگ."),
                    StoryParagraph("He gave Spade a package.", "او بسته‌ای به اسپید داد."),
                    StoryParagraph("Inside was the Maltese Falcon.", "داخلش شاهین مالت بود."),
                    StoryParagraph("The captain died in Spade's arms.", "کاپیتان در آغوش اسپید مرد."),
                    StoryParagraph("Spade hid the falcon in his apartment.", "اسپید شاهین را در آپارتمانش پنهان کرد."),
                    StoryParagraph("But Gutman's men found out.", "اما مردان گاتمن فهمیدند."),
                    StoryParagraph("They came to Spade's apartment at night.", "آن‌ها شب به آپارتمان اسپید آمدند."),
                    StoryParagraph("There was a fight.", "دعوایی شد."),
                    StoryParagraph("Spade was hit on the head.", "اسپید به سرش ضربه خورد."),
                    StoryParagraph("When he woke up, the falcon was gone.", "وقتی بیدار شد، شاهین رفته بود."),
                    StoryParagraph("But the police arrested Gutman's men.", "اما پلیس مردان گاتمن را دستگیر کرد."),
                    StoryParagraph("Spade went to see Gutman again.", "اسپید دوباره به دیدن گاتمن رفت."),
                    StoryParagraph("This time, he had the upper hand.", "این بار، او دست بالا را داشت.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Truth About the Falcon", titlePersian = "حقیقت تلخ",
                paragraphs = listOf(
                    StoryParagraph("Gutman agreed to meet Spade.", "گاتمن موافقت کرد اسپید را ببیند."),
                    StoryParagraph("He had the falcon with him.", "شاهین را همراهش داشت."),
                    StoryParagraph("He told Spade the story of the falcon.", "او داستان شاهین را برای اسپید تعریف کرد."),
                    StoryParagraph("It was made in Malta long ago.", "سال‌ها پیش در مالت ساخته شده بود."),
                    StoryParagraph("A king had given it to the Knights of Malta.", "پادشاهی آن را به شوالیه‌های مالت داده بود."),
                    StoryParagraph("But the knights sent a fake one instead.", "اما شوالیه‌ها به جایش یک جعلی فرستادند."),
                    StoryParagraph("The real one was lost for centuries.", "اصل آن قرن‌ها گم شده بود."),
                    StoryParagraph("Many men had died looking for it.", "مردان زیادی در جستجویش مرده بودند."),
                    StoryParagraph("Gutman finally had it in his hands.", "گاتمن بالاخره آن را در دست داشت."),
                    StoryParagraph("But then they opened it.", "اما بعد بازش کردند."),
                    StoryParagraph("The falcon was a fake.", "شاهین جعلی بود."),
                    StoryParagraph("It was made of cheap metal.", "از فلز ارزانی ساخته شده بود."),
                    StoryParagraph("Gutman was very angry.", "گاتمن خیلی عصبانی شد."),
                    StoryParagraph("But he decided to keep searching.", "اما تصمیم گرفت به جستجو ادامه دهد."),
                    StoryParagraph("He left with his men.", "او با مردانش رفت."),
                    StoryParagraph("Spade was left alone with Brigid.", "اسپید با بریجید تنها ماند."),
                    StoryParagraph("He asked her about Archer's death.", "او درباره مرگ آرچر از او پرسید."),
                    StoryParagraph("She finally told the truth.", "او بالاخره حقیقت را گفت."),
                    StoryParagraph("She had killed Miles Archer.", "او مایلز آرچر را کشته بود."),
                    StoryParagraph("She had also killed Floyd Thursby.", "او فلوید ثورزبی را هم کشته بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Decision", titlePersian = "پایان تاریک",
                paragraphs = listOf(
                    StoryParagraph("Spade looked at Brigid coldly.", "اسپید سرد به بریجید نگاه کرد."),
                    StoryParagraph("He had loved her, but he was a detective.", "او دوستش داشت، اما کارآگاه بود."),
                    StoryParagraph("He could not let a killer go free.", "او نمی‌توانست یک قاتل را آزاد بگذارد."),
                    StoryParagraph("So he called the police.", "پس به پلیس زنگ زد."),
                    StoryParagraph("Brigid begged him not to.", "بریجید التماس کرد این کار را نکند."),
                    StoryParagraph("But Spade had made his decision.", "اما اسپید تصمیمش را گرفته بود."),
                    StoryParagraph("The police came and arrested her.", "پلیس آمد و او را دستگیر کرد."),
                    StoryParagraph("She was taken away in handcuffs.", "او با دستبند برده شد."),
                    StoryParagraph("Spade watched her go without emotion.", "اسپید بدون احساس رفتنش را تماشا کرد."),
                    StoryParagraph("He was sad but not sorry.", "او غمگین بود اما پشیمان نبود."),
                    StoryParagraph("The case was finally over.", "پرونده بالاخره تمام شد."),
                    StoryParagraph("He went back to his office.", "او به دفترش برگشت."),
                    StoryParagraph("His secretary Effie was waiting.", "منشی‌اش اِفی منتظر بود."),
                    StoryParagraph("She asked him what had happened.", "او پرسید چه اتفاقی افتاده."),
                    StoryParagraph("He told her it was finished.", "او گفت تمام شده است."),
                    StoryParagraph("He sat at his desk and lit a cigarette.", "او پشت میزش نشست و سیگاری روشن کرد."),
                    StoryParagraph("He thought about Brigid.", "او به بریجید فکر کرد."),
                    StoryParagraph("Maybe he would miss her.", "شاید دلتنگش شود."),
                    StoryParagraph("But he had done the right thing.", "اما کار درست را کرده بود."),
                    StoryParagraph("That was what mattered.", "این چیزی بود که اهمیت داشت.")
                )
            )
        )
    )

    // ─────────────── ۸: خواب بزرگ ───────────────
    private fun story8() = StoryContent(
        storyId = "int_big_sleep",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Detective Marlowe", titlePersian = "کارآگاه مارلو",
                paragraphs = listOf(
                    StoryParagraph("Philip Marlowe was a private detective in Los Angeles.", "فیلیپ مارلو کارآگاه خصوصی در لس‌آنجلس بود."),
                    StoryParagraph("He was hired by an old general.", "او توسط ژنرالی پیر استخدام شد."),
                    StoryParagraph("The general's name was Sternwood.", "اسم ژنرال استرنوود بود."),
                    StoryParagraph("He lived in a big mansion on the hills.", "او در عمارتی بزرگ روی تپه‌ها زندگی می‌کرد."),
                    StoryParagraph("The general had two daughters.", "ژنرال دو دختر داشت."),
                    StoryParagraph("The older one was named Vivian.", "دختر بزرگتر ویویان نام داشت."),
                    StoryParagraph("The younger one was named Carmen.", "دختر کوچکتر کارمن نام داشت."),
                    StoryParagraph("Carmen was only eighteen years old.", "کارمن فقط هجده سال داشت."),
                    StoryParagraph("The general wanted Marlowe to help with a problem.", "ژنرال می‌خواست مارلو در یک مشکل کمک کند."),
                    StoryParagraph("A man was blackmailing Carmen.", "مردی داشت از کارمن اخاذی می‌کرد."),
                    StoryParagraph("His name was Arthur Geiger.", "اسمش آرتور گایگر بود."),
                    StoryParagraph("Geiger ran a rare book shop.", "گایگر یک کتاب‌فروشی کتاب‌های کمیاب داشت."),
                    StoryParagraph("But he also sold illegal things.", "اما چیزهای غیرقانونی هم می‌فروخت."),
                    StoryParagraph("Marlowe agreed to look into it.", "مارلو موافقت کرد بررسی کند."),
                    StoryParagraph("He went to Geiger's shop that night.", "آن شب به مغازه گایگر رفت."),
                    StoryParagraph("He saw Carmen going into the shop.", "او دید کارمن وارد مغازه شد."),
                    StoryParagraph("He waited outside and watched.", "او بیرون منتظر ماند و تماشا کرد."),
                    StoryParagraph("Suddenly, he heard a gunshot.", "ناگهان، صدای شلیک شنید."),
                    StoryParagraph("He ran inside and found Geiger dead.", "او دوید داخل و گایگر را مرده پیدا کرد."),
                    StoryParagraph("The mystery had just begun.", "معما تازه شروع شده بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Sternwood Family", titlePersian = "خانواده ثروتمند",
                paragraphs = listOf(
                    StoryParagraph("Marlowe took Carmen home.", "مارلو کارمن را به خانه برد."),
                    StoryParagraph("She was drugged and confused.", "او مواد مصرف کرده بود و گیج بود."),
                    StoryParagraph("The next day, Marlowe went to see the general again.", "روز بعد، مارلو دوباره به دیدن ژنرال رفت."),
                    StoryParagraph("The general told him about a missing man.", "ژنرال به او از مردی گمشده گفت."),
                    StoryParagraph("The man was named Rusty Regan.", "اسم آن مرد رِستی ریگان بود."),
                    StoryParagraph("Regan had worked for the general.", "ریگان برای ژنرال کار می‌کرد."),
                    StoryParagraph("He had been missing for a month.", "او یک ماه بود که گم شده بود."),
                    StoryParagraph("The general liked Regan very much.", "ژنرال ریگان را خیلی دوست داشت."),
                    StoryParagraph("He wanted Marlowe to find him.", "او می‌خواست مارلو او را پیدا کند."),
                    StoryParagraph("Marlowe agreed to help.", "مارلو موافقت کرد کمک کند."),
                    StoryParagraph("He met Vivian in the garden.", "او ویویان را در باغ ملاقات کرد."),
                    StoryParagraph("Vivian was beautiful and cold.", "ویویان زیبا و سرد بود."),
                    StoryParagraph("She didn't like Marlowe at first.", "او اول مارلو را دوست نداشت."),
                    StoryParagraph("She said her sister was a problem.", "او گفت خواهرش یک مشکل است."),
                    StoryParagraph("Carmen had many dangerous friends.", "کارمن دوستان خطرناکی داشت."),
                    StoryParagraph("One of them was named Eddie Mars.", "یکی از آن‌ها اِدی مارس نام داشت."),
                    StoryParagraph("Eddie ran a gambling house.", "ادی یک قمارخانه اداره می‌کرد."),
                    StoryParagraph("He was also a dangerous criminal.", "او یک جنایتکار خطرناک هم بود."),
                    StoryParagraph("Marlowe decided to visit Eddie Mars.", "مارلو تصمیم گرفت به دیدن ادی مارس برود."),
                    StoryParagraph("The case was getting bigger.", "پرونده داشت بزرگ‌تر می‌شد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Missing Man", titlePersian = "مرد گمشده",
                paragraphs = listOf(
                    StoryParagraph("Marlowe went to Eddie Mars' house.", "مارلو به خانه ادی مارس رفت."),
                    StoryParagraph("Eddie was polite but dangerous.", "ادی مؤدب اما خطرناک بود."),
                    StoryParagraph("His wife Mona had disappeared.", "همسرش مونا ناپدید شده بود."),
                    StoryParagraph("Eddie said she had run away with Rusty Regan.", "ادی گفت او با رستی ریگان فرار کرده."),
                    StoryParagraph("But Marlowe did not believe him.", "اما مارلو او را باور نکرد."),
                    StoryParagraph("He thought Eddie was hiding something.", "او فکر کرد ادی چیزی را پنهان می‌کند."),
                    StoryParagraph("That night, Marlowe followed a lead.", "آن شب، مارلو یک سرنخ را دنبال کرد."),
                    StoryParagraph("He found Geiger's partner.", "او شریک گایگر را پیدا کرد."),
                    StoryParagraph("The partner was a man named Brody.", "شریک مردی به نام برودی بود."),
                    StoryParagraph("Brody had photos of Carmen.", "برودی عکس‌هایی از کارمن داشت."),
                    StoryParagraph("He was also blackmailing her.", "او هم از او اخاذی می‌کرد."),
                    StoryParagraph("Marlowe went to Brody's apartment.", "مارلو به آپارتمان برودی رفت."),
                    StoryParagraph("When he arrived, Brody was dead.", "وقتی رسید، برودی مرده بود."),
                    StoryParagraph("Someone had shot him too.", "یک نفر او را هم کشته بود."),
                    StoryParagraph("Marlowe called the police.", "مارلو به پلیس زنگ زد."),
                    StoryParagraph("The police thought Marlowe killed Brody.", "پلیس فکر کرد مارلو برودی را کشته."),
                    StoryParagraph("But they couldn't prove it.", "اما نمی‌توانستند ثابت کنند."),
                    StoryParagraph("Marlowe went back to his office.", "مارلو به دفترش برگشت."),
                    StoryParagraph("He was tired but determined.", "او خسته اما مصمم بود."),
                    StoryParagraph("He would find the truth.", "او حقیقت را پیدا می‌کرد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Truth About Rusty", titlePersian = "قتل زنجیره‌ای",
                paragraphs = listOf(
                    StoryParagraph("Marlowe kept investigating.", "مارلو به تحقیق ادامه داد."),
                    StoryParagraph("He found out that Rusty Regan was dead.", "او فهمید رستی ریگان مرده است."),
                    StoryParagraph("Eddie Mars had killed him.", "ادی مارس او را کشته بود."),
                    StoryParagraph("Regan had run away with Eddie's wife.", "ریگان با همسر ادی فرار کرده بود."),
                    StoryParagraph("Eddie found them and killed Regan.", "ادی آن‌ها را پیدا کرد و ریگان را کشت."),
                    StoryParagraph("His wife ran away again.", "همسرش دوباره فرار کرد."),
                    StoryParagraph("Marlowe also found out about Carmen.", "مارلو درباره کارمن هم فهمید."),
                    StoryParagraph("Carmen had killed Geiger.", "کارمن گایگر را کشته بود."),
                    StoryParagraph("She had also killed Brody.", "او برودی را هم کشته بود."),
                    StoryParagraph("She was mentally ill.", "او از نظر ذهنی بیمار بود."),
                    StoryParagraph("Vivian knew about her sister.", "ویویان درباره خواهرش می‌دانست."),
                    StoryParagraph("She wanted to protect Carmen.", "او می‌خواست از کارمن محافظت کند."),
                    StoryParagraph("The general did not know anything.", "ژنرال هیچ چیز نمی‌دانست."),
                    StoryParagraph("Marlowe told Vivian what he knew.", "مارلو به ویویان گفت چه می‌داند."),
                    StoryParagraph("Vivian asked him to keep the secret.", "ویویان از او خواست راز را نگه دارد."),
                    StoryParagraph("Marlowe agreed to protect the family.", "مارلو موافقت کرد از خانواده محافظت کند."),
                    StoryParagraph("But he still had to deal with Eddie Mars.", "اما هنوز باید با ادی مارس سر و کله می‌زد."),
                    StoryParagraph("Eddie was a dangerous enemy.", "ادی دشمن خطرناکی بود."),
                    StoryParagraph("But Marlowe was not afraid.", "اما مارلو نمی‌ترسید."),
                    StoryParagraph("He was ready for anything.", "او آماده هر چیزی بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Dark Ending", titlePersian = "پایان تاریک",
                paragraphs = listOf(
                    StoryParagraph("Marlowe set a trap for Eddie Mars.", "مارلو برای ادی مارس تله گذاشت."),
                    StoryParagraph("He pretended to know less than he did.", "او تظاهر کرد کمتر از آنچه می‌داند می‌داند."),
                    StoryParagraph("Eddie came to meet him.", "ادی برای دیدنش آمد."),
                    StoryParagraph("There was a fight.", "دعوایی شد."),
                    StoryParagraph("Eddie's men shot at Marlowe.", "مردان ادی به مارلو شلیک کردند."),
                    StoryParagraph("Marlowe shot back and wounded Eddie.", "مارلو شلیک کرد و ادی را زخمی کرد."),
                    StoryParagraph("The police arrived and arrested Eddie.", "پلیس رسید و ادی را دستگیر کرد."),
                    StoryParagraph("Eddie was sent to prison for many years.", "ادی برای سال‌های زیادی به زندان رفت."),
                    StoryParagraph("Marlowe went back to the Sternwood mansion.", "مارلو به عمارت استرنوود برگشت."),
                    StoryParagraph("Carmen was there, waiting for him.", "کارمن آنجا بود، منتظر او."),
                    StoryParagraph("She wanted to be with him.", "او می‌خواست با او باشد."),
                    StoryParagraph("But Marlowe refused.", "اما مارلو قبول نکرد."),
                    StoryParagraph("She was dangerous and unstable.", "او خطرناک و ناپایدار بود."),
                    StoryParagraph("He told her to stay away.", "او به او گفت دور بماند."),
                    StoryParagraph("She was angry and hurt.", "او عصبانی و زخمی شد."),
                    StoryParagraph("Marlowe left the mansion for the last time.", "مارلو برای آخرین بار عمارت را ترک کرد."),
                    StoryParagraph("He went back to his small office.", "او به دفتر کوچکش برگشت."),
                    StoryParagraph("The case was over, but he was not happy.", "پرونده تمام شد، اما او خوشحال نبود."),
                    StoryParagraph("Justice had been done, but it was ugly.", "عدالت اجرا شده بود، اما زشت بود."),
                    StoryParagraph("That was life in Los Angeles.", "این زندگی در لس‌آنجلس بود.")
                )
            )
        )
    )

    // ─────────────── ۹: سنگ ماه ───────────────
    private fun story9() = StoryContent(
        storyId = "int_moonstone",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Indian Diamond", titlePersian = "الماس هندی",
                paragraphs = listOf(
                    StoryParagraph("The Moonstone was a famous diamond from India.", "سنگ ماه الماس معروفی از هند بود."),
                    StoryParagraph("It had been stolen from a temple long ago.", "سال‌ها پیش از معبدی دزدیده شده بود."),
                    StoryParagraph("An English soldier brought it to England.", "سربازی انگلیسی آن را به انگلیس آورد."),
                    StoryParagraph("He left it to his niece Rachel Verinder.", "او آن را به خواهرزاده‌اش ریچل ورایندر داد."),
                    StoryParagraph("Rachel's birthday was on the day it arrived.", "تولد ریچل روزی بود که آن رسید."),
                    StoryParagraph("Many people came to her birthday party.", "افراد زیادی به جشن تولدش آمدند."),
                    StoryParagraph("Her cousin Franklin Blake was there.", "پسرعمویش فرانکلین بلیک آنجا بود."),
                    StoryParagraph("Franklin was in love with Rachel.", "فرانکلین عاشق ریچل بود."),
                    StoryParagraph("Three Indian men were seen near the house.", "سه مرد هندی نزدیک خانه دیده شدند."),
                    StoryParagraph("They were looking for the diamond.", "آن‌ها دنبال الماس بودند."),
                    StoryParagraph("That night, the Moonstone was given to Rachel.", "آن شب، سنگ ماه به ریچل داده شد."),
                    StoryParagraph("She wore it on her dress during dinner.", "او آن را در طول شام روی لباسش پوشید."),
                    StoryParagraph("Everyone saw the beautiful diamond.", "همه الماس زیبا را دیدند."),
                    StoryParagraph("After dinner, Rachel went to bed.", "بعد از شام، ریچل به رختخواب رفت."),
                    StoryParagraph("In the morning, the diamond was gone.", "صبح، الماس رفته بود."),
                    StoryParagraph("Her room had been searched.", "اتاقش گشته شده بود."),
                    StoryParagraph("The window was open.", "پنجره باز بود."),
                    StoryParagraph("The police were called immediately.", "بلافاصله به پلیس زنگ زدند."),
                    StoryParagraph("Everyone in the house was a suspect.", "همه در خانه مظنون بودند."),
                    StoryParagraph("The mystery was very complicated.", "معما خیلی پیچیده بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Investigation", titlePersian = "تحقیقات کارآگاه",
                paragraphs = listOf(
                    StoryParagraph("A famous detective came to help.", "کارآگاه معروفی برای کمک آمد."),
                    StoryParagraph("His name was Sergeant Cuff.", "اسمش گروهبان کاف بود."),
                    StoryParagraph("He was famous for solving hard cases.", "او برای حل پرونده‌های سخت معروف بود."),
                    StoryParagraph("He asked everyone many questions.", "او از همه سوالات زیادی پرسید."),
                    StoryParagraph("He looked at the room carefully.", "او با دقت به اتاق نگاه کرد."),
                    StoryParagraph("He found a small paint stain on the door.", "او یک لکه رنگ کوچک روی در پیدا کرد."),
                    StoryParagraph("He also found a footprint in the garden.", "او یک رد پا هم در باغ پیدا کرد."),
                    StoryParagraph("The footprint was from a man's shoe.", "رد پا از کفش یک مرد بود."),
                    StoryParagraph("Cuff suspected the three Indians.", "کاف به سه هندی شک کرد."),
                    StoryParagraph("But he could not prove anything.", "اما نمی‌توانست چیزی ثابت کند."),
                    StoryParagraph("Rachel refused to talk about it.", "ریچل از صحبت درباره آن امتناع کرد."),
                    StoryParagraph("She seemed angry and upset.", "او عصبانی و ناراحت به نظر می‌رسید."),
                    StoryParagraph("Franklin Blake also seemed strange.", "فرانکلین بلیک هم عجیب به نظر می‌رسید."),
                    StoryParagraph("He said he didn't know anything.", "او گفت چیزی نمی‌داند."),
                    StoryParagraph("But Cuff noticed something.", "اما کاف چیزی متوجه شد."),
                    StoryParagraph("Franklin had been sleepwalking that night.", "فرانکلین آن شب در خواب راه رفته بود."),
                    StoryParagraph("Could he have taken the diamond?", "آیا او می‌توانست الماس را برداشته باشد؟"),
                    StoryParagraph("Cuff started to think about this.", "کاف شروع کرد به فکر کردن درباره این."),
                    StoryParagraph("But he didn't have enough proof.", "اما شواهد کافی نداشت."),
                    StoryParagraph("The case was still unsolved.", "پرونده هنوز حل نشده بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Stolen Diamond", titlePersian = "الماس دزدیده‌شده",
                paragraphs = listOf(
                    StoryParagraph("Rachel went to London to stay with her aunt.", "ریچل برای ماندن با خاله‌اش به لندن رفت."),
                    StoryParagraph("She refused to see Franklin again.", "او از دیدن دوباره فرانکلین امتناع کرد."),
                    StoryParagraph("No one knew why she was so angry.", "هیچ‌کس نمی‌دانست چرا اینقدر عصبانی است."),
                    StoryParagraph("A man named Mr. Bruff was her lawyer.", "مردی به نام آقای بروف وکیلش بود."),
                    StoryParagraph("He tried to help her.", "او تلاش کرد کمکش کند."),
                    StoryParagraph("Meanwhile, the police questioned the servants.", "در همین حال، پلیس خدمتکاران را بازجویی کرد."),
                    StoryParagraph("A servant named Rosanna Spearman acted strange.", "خدمتکاری به نام روزانا اسپیرمن عجیب رفتار می‌کرد."),
                    StoryParagraph("She had been seen crying alone.", "او در حال گریه کردن تنها دیده شده بود."),
                    StoryParagraph("Rosanna had a secret.", "روزانا رازی داشت."),
                    StoryParagraph("She knew something about the diamond.", "او چیزی درباره الماس می‌دانست."),
                    StoryParagraph("Then one day, Rosanna disappeared.", "بعد یک روز، روزانا ناپدید شد."),
                    StoryParagraph("Her body was found in the sea.", "جسدش در دریا پیدا شد."),
                    StoryParagraph("She had killed herself.", "او خودش را کشته بود."),
                    StoryParagraph("But before dying, she wrote a letter.", "اما قبل از مرگ، نامه‌ای نوشت."),
                    StoryParagraph("The letter was for Franklin Blake.", "نامه برای فرانکلین بلیک بود."),
                    StoryParagraph("She said she had loved him.", "او گفت عاشقش بوده است."),
                    StoryParagraph("She also said she knew who took the diamond.", "او همچنین گفت می‌داند چه کسی الماس را برداشته."),
                    StoryParagraph("But she would not tell anyone else.", "اما به هیچ‌کس دیگر نمی‌گفت."),
                    StoryParagraph("The letter was found after her death.", "نامه بعد از مرگش پیدا شد."),
                    StoryParagraph("The mystery grew deeper.", "معما عمیق‌تر شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Truth Revealed", titlePersian = "حقیقت شگفت‌انگیز",
                paragraphs = listOf(
                    StoryParagraph("Franklin Blake received Rosanna's letter.", "فرانکلین بلیک نامه روزانا را دریافت کرد."),
                    StoryParagraph("She said he had taken the diamond.", "او گفت او الماس را برداشته است."),
                    StoryParagraph("But he had done it while sleepwalking.", "اما در حین راه رفتن در خواب این کار را کرده بود."),
                    StoryParagraph("Franklin could not believe it.", "فرانکلین نمی‌توانست باورش کند."),
                    StoryParagraph("He had no memory of that night.", "از آن شب هیچ خاطره‌ای نداشت."),
                    StoryParagraph("He asked a doctor to help him.", "او از دکتری خواست کمکش کند."),
                    StoryParagraph("The doctor said he needed to recreate the night.", "دکتر گفت باید آن شب را بازسازی کند."),
                    StoryParagraph("Franklin took the same medicine again.", "فرانکلین دوباره همان دارو را خورد."),
                    StoryParagraph("That night, he started sleepwalking again.", "آن شب، دوباره شروع به راه رفتن در خواب کرد."),
                    StoryParagraph("He took the diamond from Rachel's room.", "او الماس را از اتاق ریچل برداشت."),
                    StoryParagraph("Then he gave it to someone.", "بعد آن را به کسی داد."),
                    StoryParagraph("That someone was a man named Godfrey Ablewhite.", "آن شخص مردی به نام گادفری ایبل‌وایت بود."),
                    StoryParagraph("Godfrey had kept the diamond for himself.", "گادفری الماس را برای خودش نگه داشت."),
                    StoryParagraph("He had pretended to help Rachel.", "او تظاهر کرده بود به ریچل کمک می‌کند."),
                    StoryParagraph("But he was the real thief.", "اما او دزد واقعی بود."),
                    StoryParagraph("Rachel had seen Franklin take it.", "ریچل دیده بود فرانکلین آن را برداشته."),
                    StoryParagraph("That was why she was so angry.", "به همین دلیل اینقدر عصبانی بود."),
                    StoryParagraph("Now she understood everything.", "حالا همه چیز را می‌فهمید."),
                    StoryParagraph("She forgave Franklin.", "او فرانکلین را بخشید."),
                    StoryParagraph("They could be together again.", "آن‌ها می‌توانستند دوباره با هم باشند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End of the Mystery", titlePersian = "حقیقت نهایی",
                paragraphs = listOf(
                    StoryParagraph("The police found Godfrey Ablewhite.", "پلیس گادفری ایبل‌وایت را پیدا کرد."),
                    StoryParagraph("He had changed his name and appearance.", "او اسم و ظاهرش را عوض کرده بود."),
                    StoryParagraph("He was trying to leave England.", "او تلاش می‌کرد انگلیس را ترک کند."),
                    StoryParagraph("But the police caught him at the port.", "اما پلیس در بندر دستگیرش کرد."),
                    StoryParagraph("The Moonstone was with him.", "سنگ ماه همراهش بود."),
                    StoryParagraph("He was sent to prison for theft.", "او برای دزدی به زندان فرستاده شد."),
                    StoryParagraph("Rachel and Franklin got married.", "ریچل و فرانکلین ازدواج کردند."),
                    StoryParagraph("They were very happy together.", "آن‌ها با هم خیلی خوشحال بودند."),
                    StoryParagraph("But the Moonstone still had a curse.", "اما سنگ ماه هنوز نفرین داشت."),
                    StoryParagraph("Many people had suffered because of it.", "افراد زیادی به خاطرش رنج کشیده بودند."),
                    StoryParagraph("Rachel decided to return it to India.", "ریچل تصمیم گرفت آن را به هند برگرداند."),
                    StoryParagraph("She sent it back to the temple.", "او آن را به معبد برگرداند."),
                    StoryParagraph("The priests were happy to have it again.", "کاهنان از داشتن دوباره‌اش خوشحال شدند."),
                    StoryParagraph("The curse was finally broken.", "نفرین بالاخره شکسته شد."),
                    StoryParagraph("Franklin and Rachel lived a quiet life.", "فرانکلین و ریچل زندگی آرامی داشتند."),
                    StoryParagraph("They never spoke of the diamond again.", "آن‌ها هرگز دوباره درباره الماس صحبت نکردند."),
                    StoryParagraph("Sergeant Cuff wrote about the case.", "گروهبان کاف درباره پرونده نوشت."),
                    StoryParagraph("It became famous in detective history.", "این در تاریخ کارآگاهی معروف شد."),
                    StoryParagraph("Many people learned about the Moonstone.", "افراد زیادی درباره سنگ ماه یاد گرفتند."),
                    StoryParagraph("And so the mystery was finally solved.", "و اینگونه معما بالاخره حل شد.")
                )
            )
        )
    )
}