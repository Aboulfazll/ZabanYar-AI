package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۱۰ پیشرفته — شاهکارهای معاصر
 *  ۲۸. کوری
 *  ۲۹. نام گل سرخ
 *  ۳۰. گرسنگی
 */
object Group10 {

    fun getAll(): List<StoryContent> = listOf(
        story28(),
        story29(),
        story30(),
    )

    // ─────────────── ۲۸: کوری ───────────────
    private fun story28() = StoryContent(
        storyId = "adv_blindness",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The White Blindness", titlePersian = "کوری سفید",
                paragraphs = listOf(
                    StoryParagraph("A man was driving home from work.", "مردی از سر کار به خانه می‌رفت."),
                    StoryParagraph("He stopped at a traffic light.", "او پشت چراغ قرمز ایستاد."),
                    StoryParagraph("Suddenly, he could not see anything.", "ناگهان، نتوانست چیزی ببیند."),
                    StoryParagraph("But it was not darkness.", "اما تاریکی نبود."),
                    StoryParagraph("Everything was white.", "همه چیز سفید بود."),
                    StoryParagraph("Like milk poured into his eyes.", "مثل شیری که در چشمانش ریخته باشند."),
                    StoryParagraph("A stranger helped him get home.", "غریبه‌ای کمکش کرد به خانه برسد."),
                    StoryParagraph("His wife took him to a doctor.", "همسرش او را به دکتر برد."),
                    StoryParagraph("The doctor was confused.", "دکتر گیج شد."),
                    StoryParagraph("The man's eyes looked normal.", "چشمان مرد عادی به نظر می‌رسیدند."),
                    StoryParagraph("But he could only see white.", "اما او فقط سفیدی می‌دید."),
                    StoryParagraph("The doctor called it the white evil.", "دکتر آن را شر سفید نامید."),
                    StoryParagraph("Soon, other people went blind too.", "به‌زودی، افراد دیگر هم کور شدند."),
                    StoryParagraph("The stranger who helped also went blind.", "غریبه‌ای که کمک کرده بود هم کور شد."),
                    StoryParagraph("Then the doctor went blind.", "بعد دکتر کور شد."),
                    StoryParagraph("The government panicked.", "دولت وحشت کرد."),
                    StoryParagraph("They put the blind in quarantine.", "آن‌ها کورها را قرنطینه کردند."),
                    StoryParagraph("They were put in an empty mental hospital.", "آن‌ها را در بیمارستان روانی خالی گذاشتند."),
                    StoryParagraph("No one knew what caused the disease.", "هیچ‌کس نمی‌دانست علت بیماری چیست."),
                    StoryParagraph("It spread like a plague.", "مثل طاعون پخش می‌شد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Doctor's Wife", titlePersian = "همسر دکتر",
                paragraphs = listOf(
                    StoryParagraph("The doctor was taken to quarantine.", "دکتر به قرنطینه برده شد."),
                    StoryParagraph("His wife went with him.", "همسرش با او رفت."),
                    StoryParagraph("But she was not blind.", "اما او کور نبود."),
                    StoryParagraph("She pretended to be blind.", "او تظاهر کرد کور است."),
                    StoryParagraph("She wanted to stay with her husband.", "می‌خواست با شوهرش بماند."),
                    StoryParagraph("She became the only seeing person.", "او تنها فرد بینا شد."),
                    StoryParagraph("She watched over the group.", "او مراقب گروه بود."),
                    StoryParagraph("The quarantine was terrible.", "قرنطینه وحشتناک بود."),
                    StoryParagraph("There was not enough food.", "غذا به اندازه کافی نبود."),
                    StoryParagraph("There was no medicine.", "دارو نبود."),
                    StoryParagraph("There was no cleanliness.", "نظافتی نبود."),
                    StoryParagraph("People became like animals.", "مردم مثل حیوانات شدند."),
                    StoryParagraph("They fought for food.", "برای غذا جنگیدند."),
                    StoryParagraph("They formed groups and gangs.", "گروه‌ها و دارودسته‌ها تشکیل دادند."),
                    StoryParagraph("A blind man with a gun took control.", "مرد کوری با اسلحه کنترل را به دست گرفت."),
                    StoryParagraph("He called himself the King of the Ward.", "او خودش را پادشاه بخش نامید."),
                    StoryParagraph("He demanded all the food.", "او تمام غذا را طلب کرد."),
                    StoryParagraph("He made the women serve the men.", "او زنان را مجبور کرد به مردان خدمت کنند."),
                    StoryParagraph("The doctor's wife watched in horror.", "همسر دکتر با وحشت تماشا کرد."),
                    StoryParagraph("She could not stop them.", "او نمی‌توانست متوقفشان کند.")
                )
            ),
            StoryChapter(
                number = 3, title = "Inside the Asylum", titlePersian = "داخل تیمارستان",
                paragraphs = listOf(
                    StoryParagraph("Days passed inside the asylum.", "روزها در تیمارستان گذشت."),
                    StoryParagraph("The doctor's wife organized the good people.", "همسر دکتر افراد خوب را سازماندهی کرد."),
                    StoryParagraph("She brought food from outside at night.", "او شب‌ها از بیرون غذا می‌آورد."),
                    StoryParagraph("She washed the sick and the dying.", "بیماران و در حال مرگ‌ها را می‌شست."),
                    StoryParagraph("She read to them from a book.", "از کتابی برایشان می‌خواند."),
                    StoryParagraph("The blind learned to use their ears.", "کورها یاد گرفتند از گوش‌هایشان استفاده کنند."),
                    StoryParagraph("They learned to use their hands.", "یاد گرفتند از دست‌هایشان استفاده کنند."),
                    StoryParagraph("They learned to walk by memory.", "یاد گرفتند از روی حافظه راه بروند."),
                    StoryParagraph("Some became strong.", "بعضی‌ها قوی شدند."),
                    StoryParagraph("Some became kind.", "بعضی‌ها مهربان شدند."),
                    StoryParagraph("Some became evil.", "بعضی‌ها شیطانی شدند."),
                    StoryParagraph("One day, a fire started.", "یک روز، آتشی شروع شد."),
                    StoryParagraph("The blind could not escape.", "کورها نمی‌توانستند فرار کنند."),
                    StoryParagraph("The doctor's wife led them out.", "همسر دکتر آن‌ها را بیرون برد."),
                    StoryParagraph("They walked into the city.", "آن‌ها به سمت شهر راه رفتند."),
                    StoryParagraph("The city was in chaos.", "شهر در آشوب بود."),
                    StoryParagraph("Everyone was blind.", "همه کور بودند."),
                    StoryParagraph("There was no order anymore.", "دیگر نظمی نبود."),
                    StoryParagraph("The whole world had gone blind.", "تمام دنیا کور شده بود."),
                    StoryParagraph("Only the doctor's wife could see.", "فقط همسر دکتر می‌توانست ببیند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The New World", titlePersian = "دنیای جدید",
                paragraphs = listOf(
                    StoryParagraph("The doctor's wife and her group found a home.", "همسر دکتر و گروهش خانه‌ای پیدا کردند."),
                    StoryParagraph("It was an empty apartment.", "آپارتمانی خالی بود."),
                    StoryParagraph("They cleaned it and organized it.", "آن را تمیز و سازماندهی کردند."),
                    StoryParagraph("They planted a small garden.", "باغچه‌ای کوچک کاشتند."),
                    StoryParagraph("They found water and canned food.", "آب و غذای کنسروی پیدا کردند."),
                    StoryParagraph("They created a small community.", "جامعه کوچکی ساختند."),
                    StoryParagraph("Everyone had a role.", "هر کس نقشی داشت."),
                    StoryParagraph("The blind learned new skills.", "کورها مهارت‌های جدید یاد گرفتند."),
                    StoryParagraph("They learned to help each other.", "یاد گرفتند به هم کمک کنند."),
                    StoryParagraph("They learned to share.", "یاد گرفتند تقسیم کنند."),
                    StoryParagraph("But outside, the world fell apart.", "اما بیرون، دنیا از هم پاشید."),
                    StoryParagraph("There were no governments.", "دولت‌ها نبودند."),
                    StoryParagraph("There were no hospitals.", "بیمارستان‌ها نبودند."),
                    StoryParagraph("There were no schools.", "مدرسه‌ها نبودند."),
                    StoryParagraph("The blind lived like animals.", "کورها مثل حیوانات زندگی می‌کردند."),
                    StoryParagraph("Some hunted for food.", "بعضی‌ها برای غذا شکار می‌کردند."),
                    StoryParagraph("Some ate human flesh.", "بعضی‌ها گوشت انسان می‌خوردند."),
                    StoryParagraph("The doctor's wife saw everything.", "همسر دکتر همه چیز را دید."),
                    StoryParagraph("She could not tell anyone.", "او نمی‌توانست به کسی بگوید."),
                    StoryParagraph("So she kept it in her heart.", "پس در قلبش نگه داشت.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Return of Sight", titlePersian = "بازگشت بینایی",
                paragraphs = listOf(
                    StoryParagraph("One morning, the first man woke up.", "یک صبح، مرد اول بیدار شد."),
                    StoryParagraph("He could see again.", "او دوباره می‌توانست ببیند."),
                    StoryParagraph("The white was gone.", "سفیدی رفته بود."),
                    StoryParagraph("He shouted with joy.", "او از خوشحالی فریاد زد."),
                    StoryParagraph("Others woke up and saw too.", "دیگران هم بیدار شدند و دیدند."),
                    StoryParagraph("The blindness was ending.", "کوری در حال پایان بود."),
                    StoryParagraph("But the world was destroyed.", "اما دنیا نابود شده بود."),
                    StoryParagraph("The cities were in ruins.", "شهرها در ویرانه بودند."),
                    StoryParagraph("The people were broken.", "مردم شکسته بودند."),
                    StoryParagraph("The doctor's wife finally rested.", "همسر دکتر بالاخره استراحت کرد."),
                    StoryParagraph("She had saved many lives.", "او جان‌های زیادی را نجات داده بود."),
                    StoryParagraph("She had seen too much suffering.", "او رنج زیادی دیده بود."),
                    StoryParagraph("She was tired and sad.", "او خسته و غمگین بود."),
                    StoryParagraph("But she was also full of love.", "اما پر از عشق هم بود."),
                    StoryParagraph("She looked out the window.", "او از پنجره بیرون را نگاه کرد."),
                    StoryParagraph("The sun was rising over the ruined city.", "خورشید بر فراز شهر ویران طلوع می‌کرد."),
                    StoryParagraph("People began to gather.", "مردم شروع کردند به جمع شدن."),
                    StoryParagraph("They wanted to rebuild.", "می‌خواستند بازسازی کنند."),
                    StoryParagraph("They wanted to start again.", "می‌خواستند دوباره شروع کنند."),
                    StoryParagraph("And so the story ended, with hope.", "و اینگونه داستان با امید پایان یافت.")
                )
            )
        )
    )

    // ─────────────── ۲۹: نام گل سرخ ───────────────
    private fun story29() = StoryContent(
        storyId = "adv_name_rose",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Monastery", titlePersian = "دِیر",
                paragraphs = listOf(
                    StoryParagraph("The year was 1327.", "سال ۱۳۲۷ بود."),
                    StoryParagraph("A monk named Adso arrived at a monastery.", "راهیبی به نام آدسو به دِیری رسید."),
                    StoryParagraph("He came with his master, William of Baskerville.", "او با استادش ویلیام بازکرویلی آمد."),
                    StoryParagraph("William was a Franciscan monk.", "ویلیام راهبی فرانسیسکن بود."),
                    StoryParagraph("He was famous for his intelligence.", "او برای باهوشی‌اش معروف بود."),
                    StoryParagraph("He had solved many mysteries.", "او معماهای زیادی حل کرده بود."),
                    StoryParagraph("The monastery was in the mountains of Italy.", "دِیر در کوه‌های ایتالیا بود."),
                    StoryParagraph("It was rich and powerful.", "ثروتمند و قدرتمند بود."),
                    StoryParagraph("The abbot welcomed them politely.", "رئیس دِیر مؤدبانه استقبالشان کرد."),
                    StoryParagraph("But something was wrong.", "اما چیزی اشتباه بود."),
                    StoryParagraph("A young monk had died a few days ago.", "راهیب جوانی چند روز پیش مرده بود."),
                    StoryParagraph("His body was found at the bottom of a cliff.", "جسدش در پای صخره‌ای پیدا شده بود."),
                    StoryParagraph("Everyone said it was an accident.", "همه گفتند تصادف بوده."),
                    StoryParagraph("But William had doubts.", "اما ویلیام شک داشت."),
                    StoryParagraph("The abbot asked William to investigate.", "رئیس دِیر از ویلیام خواست تحقیق کند."),
                    StoryParagraph("But he told him to be careful.", "اما به او گفت محتاط باشد."),
                    StoryParagraph("There were secrets in the monastery.", "رازهایی در دِیر بود."),
                    StoryParagraph("The library was the most important place.", "کتابخانه مهم‌ترین مکان بود."),
                    StoryParagraph("It held thousands of rare books.", "هزاران کتاب کمیاب داشت."),
                    StoryParagraph("No one was allowed to enter freely.", "هیچ‌کس اجازه نداشت آزادانه وارد شود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Library", titlePersian = "کتابخانه",
                paragraphs = listOf(
                    StoryParagraph("The library was a maze.", "کتابخانه هزارتویی بود."),
                    StoryParagraph("It had many rooms and secret passages.", "اتاق‌ها و راهروهای مخفی زیادی داشت."),
                    StoryParagraph("The librarian was an old blind monk.", "کتابدار راهبی پیر و نابینا بود."),
                    StoryParagraph("His name was Jorge of Burgos.", "اسمش خورخه بورگوس بود."),
                    StoryParagraph("Jorge hated laughter and joy.", "خورخه از خنده و شادی متنفر بود."),
                    StoryParagraph("He said laughter was a sin.", "او می‌گفت خنده گناه است."),
                    StoryParagraph("He had been in the monastery for many years.", "سال‌ها در دِیر بود."),
                    StoryParagraph("He knew every book by heart.", "هر کتابی را از حفظ می‌دانست."),
                    StoryParagraph("William and Adso explored the library.", "ویلیام و آدسو کتابخانه را کاوش کردند."),
                    StoryParagraph("They found strange symbols on the walls.", "نمادهای عجیبی روی دیوارها پیدا کردند."),
                    StoryParagraph("They found a book that was forbidden.", "کتابی پیدا کردند که ممنوع بود."),
                    StoryParagraph("It was a book by Aristotle about comedy.", "کتابی از ارسطو درباره کمدی بود."),
                    StoryParagraph("It had been translated into Latin.", "به لاتین ترجمه شده بود."),
                    StoryParagraph("Someone was hiding it.", "کسی پنهانش می‌کرد."),
                    StoryParagraph("More monks died in strange ways.", "راهبان بیشتری به شکل عجیبی مردند."),
                    StoryParagraph("One died in the bath.", "یکی در حمام مرد."),
                    StoryParagraph("One fell from a tower.", "یکی از برج افتاد."),
                    StoryParagraph("One was found with black fingers.", "یکی با انگشتان سیاه پیدا شد."),
                    StoryParagraph("The ink on the pages was poisoned.", "مرکب روی صفحه‌ها سمی بود."),
                    StoryParagraph("William suspected a murderer.", "ویلیام به قاتل شک کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Heretics", titlePersian = "بدعت‌گذاران",
                paragraphs = listOf(
                    StoryParagraph("A group of heretics came to the monastery.", "گروهی از بدعت‌گذاران به دِیر آمدند."),
                    StoryParagraph("They were led by a man named Dolcino.", "مردی به نام دولچینو رهبرشان بود."),
                    StoryParagraph("The church considered them enemies.", "کلیسا آن‌ها را دشمن می‌دانست."),
                    StoryParagraph("They believed in poverty and equality.", "آن‌ها به فقر و برابری اعتقاد داشتند."),
                    StoryParagraph("They said the church was too rich.", "می‌گفتند کلیسا بیش از حد ثروتمند است."),
                    StoryParagraph("William was sympathetic to them.", "ویلیام با آن‌ها همدل بود."),
                    StoryParagraph("He believed the church was corrupt.", "او معتقد بود کلیسا فاسد است."),
                    StoryParagraph("A representative of the Pope arrived.", "نماینده‌ای از پاپ رسید."),
                    StoryParagraph("His name was Bernardo Gui.", "اسمش برناردو گویی بود."),
                    StoryParagraph("Bernardo was cruel and ruthless.", "برناردو ظالم و بی‌رحم بود."),
                    StoryParagraph("He had burned many people alive.", "او افراد زیادی را زنده سوزانده بود."),
                    StoryParagraph("He hated anyone who disagreed with the church.", "از هر کسی که با کلیسا مخالف بود متنفر بود."),
                    StoryParagraph("Bernardo wanted to arrest the heretics.", "برناردو می‌خواست بدعت‌گذاران را دستگیر کند."),
                    StoryParagraph("William tried to defend them.", "ویلیام تلاش کرد از آن‌ها دفاع کند."),
                    StoryParagraph("But Bernardo had more power.", "اما برناردو قدرت بیشتری داشت."),
                    StoryParagraph("The heretics were captured.", "بدعت‌گذاران دستگیر شدند."),
                    StoryParagraph("Some were tortured.", "بعضی‌ها شکنجه شدند."),
                    StoryParagraph("Some were burned.", "بعضی‌ها سوزانده شدند."),
                    StoryParagraph("William was deeply saddened.", "ویلیام عمیقاً غمگین شد."),
                    StoryParagraph("He could not save them.", "او نمی‌توانست نجاتشان دهد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Mystery Revealed", titlePersian = "راز فاش می‌شود",
                paragraphs = listOf(
                    StoryParagraph("William discovered the truth.", "ویلیام حقیقت را کشف کرد."),
                    StoryParagraph("The blind librarian Jorge was the murderer.", "کتابدار نابینا خورخه قاتل بود."),
                    StoryParagraph("He had poisoned the pages of the book.", "او صفحه‌های کتاب را سمی کرده بود."),
                    StoryParagraph("He did not want anyone to read it.", "نمی‌خواست کسی آن را بخواند."),
                    StoryParagraph("The book was about comedy and laughter.", "کتاب درباره کمدی و خنده بود."),
                    StoryParagraph("It said laughter was good.", "می‌گفت خنده خوب است."),
                    StoryParagraph("It said people should not fear joy.", "می‌گفت مردم نباید از شادی بترسند."),
                    StoryParagraph("Jorge could not accept this.", "خورخه نمی‌توانست این را بپذیرد."),
                    StoryParagraph("He had lived his whole life in fear.", "تمام عمرش در ترس زندگی کرده بود."),
                    StoryParagraph("He had killed to protect his beliefs.", "او برای محافظت از باورهایش کشته بود."),
                    StoryParagraph("William confronted him in the library.", "ویلیام در کتابخانه با او روبرو شد."),
                    StoryParagraph("Jorge was angry and afraid.", "خورخه عصبانی و ترسیده بود."),
                    StoryParagraph("He grabbed the poisoned book.", "او کتاب سمی را گرفت."),
                    StoryParagraph("He began to eat the pages.", "شروع کرد به خوردن صفحه‌ها."),
                    StoryParagraph("William tried to stop him.", "ویلیام تلاش کرد متوقفش کند."),
                    StoryParagraph("But Jorge was too far gone.", "اما خورخه خیلی رفته بود."),
                    StoryParagraph("He fell to the floor and died.", "او روی زمین افتاد و مرد."),
                    StoryParagraph("But as he fell, he knocked over a candle.", "اما وقتی افتاد، شمعی را سرنگون کرد."),
                    StoryParagraph("The library caught fire.", "کتابخانه آتش گرفت."),
                    StoryParagraph("The whole monastery began to burn.", "تمام دِیر شروع کرد به سوختن.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Ruins", titlePersian = "ویرانه‌ها",
                paragraphs = listOf(
                    StoryParagraph("The fire spread quickly.", "آتش سریع پخش شد."),
                    StoryParagraph("The monks ran in terror.", "راهبان از وحشت دویدند."),
                    StoryParagraph("But there was no escape.", "اما راه فراری نبود."),
                    StoryParagraph("The library was destroyed.", "کتابخانه نابود شد."),
                    StoryParagraph("Thousands of books burned.", "هزاران کتاب سوختند."),
                    StoryParagraph("The greatest library of the time was gone.", "بزرگ‌ترین کتابخانه زمانه رفته بود."),
                    StoryParagraph("The monastery was in ruins.", "دِیر در ویرانه بود."),
                    StoryParagraph("Many monks died in the fire.", "راهبان زیادی در آتش مردند."),
                    StoryParagraph("William and Adso escaped.", "ویلیام و آدسو فرار کردند."),
                    StoryParagraph("They watched the flames from a distance.", "از دور شعله‌ها را تماشا کردند."),
                    StoryParagraph("William was sad and tired.", "ویلیام غمگین و خسته بود."),
                    StoryParagraph("He had solved the mystery but lost everything.", "معما را حل کرده بود اما همه چیز را از دست داده بود."),
                    StoryParagraph("Adso asked him what he had learned.", "آدسو پرسید چه یاد گرفته."),
                    StoryParagraph("William said: nothing.", "ویلیام گفت: هیچ چیز."),
                    StoryParagraph("He said the only truth is that we must keep searching.", "او گفت تنها حقیقت این است که باید به جستجو ادامه دهیم."),
                    StoryParagraph("They walked away from the ruins.", "آن‌ها از ویرانه‌ها دور شدند."),
                    StoryParagraph("Years later, Adso wrote this story.", "سال‌ها بعد، آدسو این داستان را نوشت."),
                    StoryParagraph("He was an old man by then.", "او آن موقع پیرمردی بود."),
                    StoryParagraph("He wanted to remember what happened.", "می‌خواست به یاد بیاورد چه اتفاقی افتاد."),
                    StoryParagraph("And so the name of the rose was forgotten.", "و اینگونه نام گل سرخ فراموش شد.")
                )
            )
        )
    )

    // ─────────────── ۳۰: گرسنگی ───────────────
    private fun story30() = StoryContent(
        storyId = "adv_hunger",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Starving Writer", titlePersian = "نویسنده گرسنه",
                paragraphs = listOf(
                    StoryParagraph("It was autumn in Christiania, Norway.", "پاییز در کریستیانیا، نروژ بود."),
                    StoryParagraph("A young man walked through the streets.", "مرد جوانی در خیابان‌ها قدم می‌زد."),
                    StoryParagraph("He was a writer but had no money.", "او نویسنده بود اما پول نداشت."),
                    StoryParagraph("He had not eaten for many days.", "روزهای زیادی غذا نخورده بود."),
                    StoryParagraph("His clothes were worn and dirty.", "لباس‌هایش کهنه و کثیف بودند."),
                    StoryParagraph("He had no home to go to.", "خانه‌ای نداشت که برود."),
                    StoryParagraph("He slept in parks and doorways.", "او در پارک‌ها و درگاه‌ها می‌خوابید."),
                    StoryParagraph("Sometimes he sold articles to newspapers.", "گاهی مقاله‌هایی به روزنامه‌ها می‌فروخت."),
                    StoryParagraph("But the pay was very little.", "اما دستمزد خیلی کم بود."),
                    StoryParagraph("He pawned his clothes for food.", "او لباس‌هایش را برای غذا گرو می‌گذاشت."),
                    StoryParagraph("He pawned his pen and his blanket.", "قلم و پتویش را گرو گذاشت."),
                    StoryParagraph("He had nothing left.", "چیزی برایش نمانده بود."),
                    StoryParagraph("Still, he kept writing.", "با این حال، به نوشتن ادامه داد."),
                    StoryParagraph("He wrote in his head when he had no paper.", "وقتی کاغذ نداشت در ذهنش می‌نوشت."),
                    StoryParagraph("He wrote about hunger and poverty.", "او درباره گرسنگی و فقر می‌نوشت."),
                    StoryParagraph("He wrote about his own suffering.", "درباره رنج خودش می‌نوشت."),
                    StoryParagraph("He walked the streets hour after hour.", "او ساعت به ساعت در خیابان‌ها قدم می‌زد."),
                    StoryParagraph("He looked at people and imagined their lives.", "به مردم نگاه می‌کرد و زندگی‌شان را تصور می‌کرد."),
                    StoryParagraph("The hunger made him strange.", "گرسنگی عجیبش می‌کرد."),
                    StoryParagraph("He began to lose his mind.", "او شروع کرد به از دست دادن عقلش.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Editor's Rejection", titlePersian = "رد شدن توسط سردبیر",
                paragraphs = listOf(
                    StoryParagraph("The writer went to see the editor.", "نویسنده به دیدن سردبیر رفت."),
                    StoryParagraph("He hoped to sell an article.", "امیدوار بود مقاله‌ای بفروشد."),
                    StoryParagraph("The editor was polite but not interested.", "سردبیر مؤدب بود اما علاقه‌مند نه."),
                    StoryParagraph("He said the article was not good enough.", "او گفت مقاله به اندازه کافی خوب نیست."),
                    StoryParagraph("The writer was devastated.", "نویسنده ویران شد."),
                    StoryParagraph("He had put all his hope in that article.", "تمام امیدش را به آن مقاله بسته بود."),
                    StoryParagraph("He walked out into the cold street.", "او در خیابان سرد بیرون رفت."),
                    StoryParagraph("His stomach was empty and hurting.", "شکمش خالی و دردناک بود."),
                    StoryParagraph("He went to a pawnshop.", "او به یک گروفروشی رفت."),
                    StoryParagraph("He pawned his vest for a few coins.", "جلیقه‌اش را برای چند سکه گرو گذاشت."),
                    StoryParagraph("He bought some bread and cheese.", "کمی نان و پنیر خرید."),
                    StoryParagraph("But the money was soon gone.", "اما پول به‌زودی تمام شد."),
                    StoryParagraph("He thought about going home to his aunt.", "او به فکر رفتن به خانه خاله‌اش افتاد."),
                    StoryParagraph("But he was too proud.", "اما بیش از حد مغرور بود."),
                    StoryParagraph("He did not want to ask for help.", "نمی‌خواست کمک بخواهد."),
                    StoryParagraph("So he kept wandering.", "پس به سرگردانی ادامه داد."),
                    StoryParagraph("He walked past restaurants and smelled food.", "از کنار رستوران‌ها رد شد و بوی غذا را حس کرد."),
                    StoryParagraph("He saw people eating inside.", "مردم را دید که داخل غذا می‌خوردند."),
                    StoryParagraph("He felt more alone than ever.", "او بیشتر از همیشه تنها احساس کرد."),
                    StoryParagraph("But he did not give up.", "اما تسلیم نشد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Landlady", titlePersian = "صاحب‌خانه",
                paragraphs = listOf(
                    StoryParagraph("The writer rented a small room.", "نویسنده اتاقی کوچک اجاره کرد."),
                    StoryParagraph("The landlady was a kind woman.", "صاحب‌خانه زنی مهربان بود."),
                    StoryParagraph("But he could not pay the rent.", "اما نمی‌توانست اجاره را بپردازد."),
                    StoryParagraph("Each morning, she asked for money.", "هر صبح، پول می‌خواست."),
                    StoryParagraph("He promised to pay soon.", "او قول داد به‌زودی بپردازد."),
                    StoryParagraph("But he knew he could not.", "اما می‌دانست نمی‌تواند."),
                    StoryParagraph("One day, he wrote a letter to a newspaper.", "یک روز، نامه‌ای به روزنامه‌ای نوشت."),
                    StoryParagraph("He said he was a friend of the editor.", "او گفت دوست سردبیر است."),
                    StoryParagraph("He asked for money in advance.", "او پیشاپیش پول خواست."),
                    StoryParagraph("The editor sent him a small amount.", "سردبیر مبلغ کمی فرستاد."),
                    StoryParagraph("The writer paid the rent.", "نویسنده اجاره را پرداخت."),
                    StoryParagraph("He felt relieved but ashamed.", "او راحت اما شرمنده شد."),
                    StoryParagraph("He had lied to get the money.", "برای گرفتن پول دروغ گفته بود."),
                    StoryParagraph("He could not forgive himself.", "نمی‌توانست خودش را ببخشد."),
                    StoryParagraph("That night, he could not sleep.", "آن شب، نتوانست بخوابد."),
                    StoryParagraph("He thought about his life.", "او به زندگی‌اش فکر کرد."),
                    StoryParagraph("He thought about his failures.", "به شکست‌هایش فکر کرد."),
                    StoryParagraph("He thought about his writing.", "به نوشتنش فکر کرد."),
                    StoryParagraph("He decided to keep going.", "تصمیم گرفت ادامه دهد."),
                    StoryParagraph("But he did not know how.", "اما نمی‌دانست چطور.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Strange Dream", titlePersian = "خواب عجیب",
                paragraphs = listOf(
                    StoryParagraph("One night, the writer had a strange dream.", "یک شب، نویسنده خواب عجیبی دید."),
                    StoryParagraph("He dreamed he was in a palace.", "خواب دید در قصری است."),
                    StoryParagraph("A beautiful woman welcomed him.", "زنی زیبا استقبالش کرد."),
                    StoryParagraph("She offered him food and wine.", "غذا و شراب به او پیشنهاد داد."),
                    StoryParagraph("He ate and drank with joy.", "با خوشحالی خورد و نوشید."),
                    StoryParagraph("He forgot his hunger.", "گرسنگی‌اش را فراموش کرد."),
                    StoryParagraph("The woman asked him to stay forever.", "زن از او خواست برای همیشه بماند."),
                    StoryParagraph("But he said he had to go.", "اما گفت باید برود."),
                    StoryParagraph("He said he had work to do.", "گفت کار دارد."),
                    StoryParagraph("He woke up in his cold room.", "در اتاق سردش بیدار شد."),
                    StoryParagraph("He was still hungry.", "او هنوز گرسنه بود."),
                    StoryParagraph("But the dream gave him strength.", "اما خواب به او قدرت داد."),
                    StoryParagraph("He started writing again.", "او دوباره شروع به نوشتن کرد."),
                    StoryParagraph("He wrote a story about a hungry writer.", "داستانی درباره نویسنده‌ای گرسنه نوشت."),
                    StoryParagraph("He finished it in three days.", "آن را در سه روز تمام کرد."),
                    StoryParagraph("He sent it to a magazine.", "آن را به مجله‌ای فرستاد."),
                    StoryParagraph("He waited for an answer.", "منتظر جواب ماند."),
                    StoryParagraph("Days passed with no reply.", "روزها بدون جواب گذشت."),
                    StoryParagraph("He began to lose hope again.", "او دوباره شروع کرد به از دست دادن امید."),
                    StoryParagraph("But he kept writing.", "اما به نوشتن ادامه داد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Leaving the City", titlePersian = "ترک شهر",
                paragraphs = listOf(
                    StoryParagraph("Finally, the writer decided to leave.", "بالاخره، نویسنده تصمیم گرفت برود."),
                    StoryParagraph("He could not survive in the city anymore.", "دیگر نمی‌توانست در شهر زنده بماند."),
                    StoryParagraph("He went to the harbor.", "او به بندر رفت."),
                    StoryParagraph("He found work on a ship.", "روی کشتی‌ای کار پیدا کرد."),
                    StoryParagraph("The ship was going to England.", "کشتی به انگلیس می‌رفت."),
                    StoryParagraph("He would work as a deckhand.", "او به عنوان ملوان کار می‌کرد."),
                    StoryParagraph("The work was hard but paid well.", "کار سخت بود اما دستمزد خوبی داشت."),
                    StoryParagraph("He said goodbye to his aunt.", "او از خاله‌اش خداحافظی کرد."),
                    StoryParagraph("She cried and gave him a small gift.", "او گریه کرد و هدیه کوچکی به او داد."),
                    StoryParagraph("He promised to write.", "او قول داد بنویسد."),
                    StoryParagraph("The ship left the harbor at dawn.", "کشتی در سپیده‌دم بندر را ترک کرد."),
                    StoryParagraph("The writer stood on the deck.", "نویسنده روی عرشه ایستاد."),
                    StoryParagraph("He watched his city disappear.", "تماشا کرد شهرش ناپدید می‌شود."),
                    StoryParagraph("He felt both sadness and hope.", "او هم غم و هم امید حس کرد."),
                    StoryParagraph("He was leaving his hunger behind.", "او گرسنگی‌اش را پشت سر می‌گذاشت."),
                    StoryParagraph("He was starting a new life.", "او زندگی جدیدی شروع می‌کرد."),
                    StoryParagraph("He would write about his suffering.", "او درباره رنجش می‌نوشت."),
                    StoryParagraph("He would turn pain into art.", "درد را به هنر تبدیل می‌کرد."),
                    StoryParagraph("And so the hungry writer sailed away.", "و اینگونه نویسنده گرسنه به دریا رفت."),
                    StoryParagraph("His story was just beginning.", "داستانش تازه شروع شده بود.")
                )
            )
        )
    )
}