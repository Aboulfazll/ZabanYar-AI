package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۷ پیشرفته — مدرنیسم قرن بیستم
 *  ۱۹. خشم و هیاهو
 *  ۲۰. لولیتا
 *  ۲۱. استاد و مارگاریتا
 */
object Group7 {

    fun getAll(): List<StoryContent> = listOf(
        story19(),
        story20(),
        story21(),
    )

    // ─────────────── ۱۹: خشم و هیاهو ───────────────
    private fun story19() = StoryContent(
        storyId = "adv_sound_and_fury",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Benjamin's Voice", titlePersian = "صدای بنجامین",
                paragraphs = listOf(
                    StoryParagraph("Benjamin Compson was thirty-three years old.", "بنجامین کامپسون سی و سه ساله بود."),
                    StoryParagraph("But his mind was like a child's.", "اما ذهنش مثل یک کودک بود."),
                    StoryParagraph("He could not speak clearly.", "او نمی‌توانست واضح صحبت کند."),
                    StoryParagraph("He only made sounds and cried.", "او فقط صدا درمی‌آورد و گریه می‌کرد."),
                    StoryParagraph("His family called him Benjy.", "خانواده‌اش او را بنجی صدا می‌زدند."),
                    StoryParagraph("They lived in Jefferson, Mississippi.", "آن‌ها در جفرسون، می‌سی‌سی‌پی زندگی می‌کردند."),
                    StoryParagraph("The Compson family was once respected.", "خانواده کامپسون روزی محترم بودند."),
                    StoryParagraph("But now they were falling apart.", "اما حالا داشتند از هم می‌پاشیدند."),
                    StoryParagraph("Benjy remembered things from long ago.", "بنجی چیزها را از خیلی وقت پیش به یاد می‌آورد."),
                    StoryParagraph("He remembered his sister Caddy.", "او خواهرش کدی را به یاد می‌آورد."),
                    StoryParagraph("Caddy smelled like trees and rain.", "کدی مثل درخت و باران بو می‌داد."),
                    StoryParagraph("She loved Benjy more than anyone.", "او بنجی را بیش از هر کسی دوست داشت."),
                    StoryParagraph("She took care of him as a child.", "او در کودکی از او مراقبت می‌کرد."),
                    StoryParagraph("But Caddy grew up and changed.", "اما کدی بزرگ شد و تغییر کرد."),
                    StoryParagraph("She became wild and disobedient.", "او وحشی و نافرمان شد."),
                    StoryParagraph("She lost her honor as a young woman.", "او آبرویش را به عنوان زن جوان از دست داد."),
                    StoryParagraph("The family was deeply ashamed.", "خانواده عمیقاً شرمنده شدند."),
                    StoryParagraph("Caddy got married but was soon divorced.", "کدی ازدواج کرد اما به‌زودی طلاق گرفت."),
                    StoryParagraph("Then she disappeared from their lives.", "بعد از زندگی‌شان ناپدید شد."),
                    StoryParagraph("Benjy never understood why she left.", "بنجی هرگز نفهمید چرا رفت.")
                )
            ),
            StoryChapter(
                number = 2, title = "Quentin's Last Day", titlePersian = "آخرین روز کوئنتین",
                paragraphs = listOf(
                    StoryParagraph("Quentin Compson was the oldest son.", "کوئنتین کامپسون پسر بزرگتر بود."),
                    StoryParagraph("He was studying at Harvard University.", "او در دانشگاه هاروارد درس می‌خواند."),
                    StoryParagraph("His family sold land to pay for his studies.", "خانواده‌اش زمین فروختند تا هزینه تحصیلش را بدهند."),
                    StoryParagraph("Quentin was intelligent and sensitive.", "کوئنتین باهوش و حساس بود."),
                    StoryParagraph("But he was trapped in the past.", "اما در گذشته گرفتار بود."),
                    StoryParagraph("He could not forget his sister Caddy.", "او نمی‌توانست خواهرش کدی را فراموش کند."),
                    StoryParagraph("He loved her too much.", "او بیش از حد دوستش داشت."),
                    StoryParagraph("He was obsessed with her honor.", "او به آبروی او وسواس داشت."),
                    StoryParagraph("Her shame destroyed him inside.", "شرم او او را از درون نابود کرد."),
                    StoryParagraph("The day came when he could take no more.", "روزی رسید که دیگر نمی‌توانست تحمل کند."),
                    StoryParagraph("He bought two heavy flat irons.", "او دو اتوی سنگین خرید."),
                    StoryParagraph("He walked through the streets of Cambridge.", "او در خیابان‌های کمبریج قدم زد."),
                    StoryParagraph("He remembered scenes from his childhood.", "صحنه‌هایی از کودکی‌اش را به یاد آورد."),
                    StoryParagraph("He remembered Caddy in the river.", "کدی را در رودخانه به یاد آورد."),
                    StoryParagraph("He remembered their mother's coldness.", "سردی مادرشان را به یاد آورد."),
                    StoryParagraph("He wrote letters to his father and roommate.", "او نامه‌هایی به پدر و هم‌اتاقی‌اش نوشت."),
                    StoryParagraph("He put on his best suit.", "او بهترین لباسش را پوشید."),
                    StoryParagraph("He walked to the Charles River.", "او به سمت رودخانه چارلز رفت."),
                    StoryParagraph("He jumped into the water with the irons.", "با اتوها در آب پرید."),
                    StoryParagraph("And so he ended his life.", "و اینگونه به زندگی‌اش پایان داد.")
                )
            ),
            StoryChapter(
                number = 3, title = "Jason's Bitterness", titlePersian = "تلخی جیسون",
                paragraphs = listOf(
                    StoryParagraph("Jason Compson was the third brother.", "جیسون کامپسون برادر سوم بود."),
                    StoryParagraph("He was mean and greedy.", "او پست و حریص بود."),
                    StoryParagraph("He hated everyone in his family.", "او از همه در خانواده‌اش متنفر بود."),
                    StoryParagraph("He hated Caddy most of all.", "بیش از همه از کدی متنفر بود."),
                    StoryParagraph("He worked in a farm store.", "او در مغازه‌ای روستایی کار می‌کرد."),
                    StoryParagraph("He stole money from his family.", "او از خانواده‌اش پول می‌دزدید."),
                    StoryParagraph("He wanted to save it for himself.", "می‌خواست برای خودش پس‌انداز کند."),
                    StoryParagraph("He took care of Benjy and their mother.", "او از بنجی و مادرشان مراقبت می‌کرد."),
                    StoryParagraph("But he did it without love.", "اما بدون عشق این کار را می‌کرد."),
                    StoryParagraph("Their niece Quentin came to live with them.", "خواهرزاده‌شان کوئنتین آمد با آن‌ها زندگی کند."),
                    StoryParagraph("She was Caddy's daughter.", "او دختر کدی بود."),
                    StoryParagraph("She was wild like her mother.", "او مثل مادرش وحشی بود."),
                    StoryParagraph("Jason controlled her with cruelty.", "جیسون با ظلم کنترلش می‌کرد."),
                    StoryParagraph("He burned her letters from Caddy.", "نامه‌های کدی را می‌سوزاند."),
                    StoryParagraph("He stole the money Caddy sent for her daughter.", "پولی که کدی برای دخترش می‌فرستاد را می‌دزدید."),
                    StoryParagraph("One day, young Quentin ran away.", "یک روز، کوئنتین جوان فرار کرد."),
                    StoryParagraph("She took her own money back.", "او پول خودش را پس گرفت."),
                    StoryParagraph("Jason chased her but could not catch her.", "جیسون دنبالش کرد اما نگرفتش."),
                    StoryParagraph("He came back empty-handed.", "او دست‌خالی برگشت."),
                    StoryParagraph("His life was full of anger and hate.", "زندگی‌اش پر از خشم و نفرت بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "Dilsey's Peace", titlePersian = "آرامش دیلزی",
                paragraphs = listOf(
                    StoryParagraph("Dilsey was the family's Black servant.", "دیلزی خدمتکار سیاه‌پوست خانواده بود."),
                    StoryParagraph("She had worked for them for many years.", "او سال‌ها برای آن‌ها کار کرده بود."),
                    StoryParagraph("She had raised all the Compson children.", "او همه بچه‌های کامپسون را بزرگ کرده بود."),
                    StoryParagraph("She loved them like her own.", "او مثل فرزندان خودش دوستشان داشت."),
                    StoryParagraph("Now she was old and tired.", "حالا پیر و خسته بود."),
                    StoryParagraph("But she still took care of them.", "اما هنوز مراقبشان بود."),
                    StoryParagraph("She was the only one who loved Benjy.", "او تنها کسی بود که بنجی را دوست داشت."),
                    StoryParagraph("She went to church on Sundays.", "یکشنبه‌ها به کلیسا می‌رفت."),
                    StoryParagraph("She found peace in her faith.", "او در ایمانش آرامش پیدا می‌کرد."),
                    StoryParagraph("Her sermons were like beautiful music.", "خطبه‌هایش مثل موسیقی زیبا بود."),
                    StoryParagraph("The Compsons had lost everything.", "کامپسون‌ها همه چیز را از دست داده بودند."),
                    StoryParagraph("The father drank himself to death.", "پدر خودش را از نوشیدن کشت."),
                    StoryParagraph("The mother was cold and bitter.", "مادر سرد و تلخ بود."),
                    StoryParagraph("Caddy was gone forever.", "کدی برای همیشه رفته بود."),
                    StoryParagraph("Quentin had killed himself.", "کوئنتین خودش را کشته بود."),
                    StoryParagraph("Jason was alone with his greed.", "جیسون با طمعش تنها بود."),
                    StoryParagraph("Only Benjy and Dilsey remained.", "فقط بنجی و دیلزی باقی ماندند."),
                    StoryParagraph("They went to church together on Easter.", "آن‌ها با هم در عید پاک به کلیسا رفتند."),
                    StoryParagraph("Dilsey said she had seen the first and the last.", "دیلزی گفت اول و آخر را دیده."),
                    StoryParagraph("She endured and she loved.", "او تحمل کرد و دوست داشت.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Broken Clock", titlePersian = "ساعت شکسته",
                paragraphs = listOf(
                    StoryParagraph("The Compson house was falling apart.", "خانه کامپسون در حال فروپاشی بود."),
                    StoryParagraph("The paint was peeling from the walls.", "رنگ از دیوارها کنده می‌شد."),
                    StoryParagraph("The yard was full of weeds.", "حیاط پر از علف‌های هرز بود."),
                    StoryParagraph("Jason sold the family land for money.", "جیسون زمین خانوادگی را برای پول فروخت."),
                    StoryParagraph("He sent Benjy to an asylum.", "او بنجی را به تیمارستان فرستاد."),
                    StoryParagraph("Benjy did not understand what was happening.", "بنجی نمی‌فهمید چه اتفاقی می‌افتد."),
                    StoryParagraph("Dilsey came to visit him sometimes.", "دیلزی گاهی به دیدنش می‌آمد."),
                    StoryParagraph("She brought him flowers from the yard.", "او از حیاط برایش گل می‌آورد."),
                    StoryParagraph("Benjy loved the smell of flowers.", "بنجی بوی گل‌ها را دوست داشت."),
                    StoryParagraph("The town clock had stopped long ago.", "ساعت شهر مدت‌ها پیش متوقف شده بود."),
                    StoryParagraph("Nobody bothered to fix it.", "هیچ‌کس زحمت تعمیرش را نکشید."),
                    StoryParagraph("Time had lost its meaning for them.", "زمان برای آن‌ها معنایش را از دست داده بود."),
                    StoryParagraph("The past was more real than the present.", "گذشته از حال واقعی‌تر بود."),
                    StoryParagraph("The family's story ended in silence.", "داستان خانواده در سکوت پایان یافت."),
                    StoryParagraph("Their name was forgotten in the town.", "اسمشان در شهر فراموش شد."),
                    StoryParagraph("Only Dilsey remembered the old days.", "فقط دیلزی روزهای قدیم را به یاد می‌آورد."),
                    StoryParagraph("She had seen it all from the beginning.", "او از ابتدا همه چیز را دیده بود."),
                    StoryParagraph("The sound and the fury had passed.", "خشم و هیاهو گذشته بود."),
                    StoryParagraph("But love had remained.", "اما عشق باقی مانده بود."),
                    StoryParagraph("And that was the only thing that mattered.", "و این تنها چیزی بود که اهمیت داشت.")
                )
            )
        )
    )

    // ─────────────── ۲۰: لولیتا ───────────────
    private fun story20() = StoryContent(
        storyId = "adv_lolita",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Humbert's Youth", titlePersian = "جوانی هومبرت",
                paragraphs = listOf(
                    StoryParagraph("My name is Humbert Humbert.", "اسم من هومبرت هومبرت است."),
                    StoryParagraph("I was born in Paris in 1910.", "من در سال ۱۹۱۰ در پاریس به دنیا آمدم."),
                    StoryParagraph("My father was a Swiss citizen.", "پدرم شهروند سوئیسی بود."),
                    StoryParagraph("My mother died when I was young.", "مادرم وقتی کوچک بودم مرد."),
                    StoryParagraph("I had a happy childhood at first.", "اول کودکی خوشی داشتم."),
                    StoryParagraph("When I was thirteen, I fell in love.", "وقتی سیزده ساله بودم، عاشق شدم."),
                    StoryParagraph("Her name was Annabel Leigh.", "اسمش آنابل لی بود."),
                    StoryParagraph("She was the same age as me.", "او هم‌سن من بود."),
                    StoryParagraph("We spent one summer together.", "ما یک تابستان را با هم گذراندیم."),
                    StoryParagraph("We loved each other purely.", "ما خالصانه یکدیگر را دوست داشتیم."),
                    StoryParagraph("But we could not be together.", "اما نمی‌توانستیم با هم باشیم."),
                    StoryParagraph("Annabel died of typhus soon after.", "آنابل خیلی زود از تیفوس مرد."),
                    StoryParagraph("I was destroyed by her death.", "من از مرگش نابود شدم."),
                    StoryParagraph("Something broke inside me forever.", "چیزی درونم برای همیشه شکست."),
                    StoryParagraph("I searched for her in every woman.", "در هر زنی دنبالش گشتم."),
                    StoryParagraph("But I never found her again.", "اما هرگز دوباره پیدایش نکردم."),
                    StoryParagraph("I grew up but stayed obsessed.", "بزرگ شدم اما وسواسم ماند."),
                    StoryParagraph("I married a woman named Valeria.", "با زنی به نام والریا ازدواج کردم."),
                    StoryParagraph("But I did not love her.", "اما دوستش نداشتم."),
                    StoryParagraph("She only reminded me of Annabel.", "او فقط آنابل را به یادم می‌آورد.")
                )
            ),
            StoryChapter(
                number = 2, title = "Meeting Dolores", titlePersian = "ملاقات دلورس",
                paragraphs = listOf(
                    StoryParagraph("In 1947, I moved to America.", "در ۱۹۴۷، به آمریکا نقل مکان کردم."),
                    StoryParagraph("I wanted to write a book.", "می‌خواستم کتابی بنویسم."),
                    StoryParagraph("I rented a room in a small town.", "اتاقی در شهر کوچکی اجاره کردم."),
                    StoryParagraph("The landlady was a widow named Charlotte Haze.", "صاحب‌خانه بیوه‌ای به نام شارلوت هیز بود."),
                    StoryParagraph("She had a twelve-year-old daughter.", "او دختر دوازده ساله‌ای داشت."),
                    StoryParagraph("Her name was Dolores.", "اسمش دلورس بود."),
                    StoryParagraph("But everyone called her Lolita.", "اما همه لولیتا صدا می‌زدندش."),
                    StoryParagraph("When I first saw her, I was stunned.", "وقتی اول دیدمش، مات شدم."),
                    StoryParagraph("She looked exactly like Annabel.", "او دقیقاً شبیه آنابل بود."),
                    StoryParagraph("The same eyes, the same smile.", "همان چشم‌ها، همان لبخند."),
                    StoryParagraph("I felt my old obsession return.", "وسواس قدیمی‌ام را حس کردم که برگشت."),
                    StoryParagraph("Charlotte was attracted to me.", "شارلوت جذبم شده بود."),
                    StoryParagraph("She wanted me to stay.", "می‌خواست بمانم."),
                    StoryParagraph("I stayed to be near Lolita.", "من برای نزدیک بودن به لولیتا ماندم."),
                    StoryParagraph("I pretended to like Charlotte.", "تظاهر کردم شارلوت را دوست دارم."),
                    StoryParagraph("I wrote in my journal about Lolita.", "در دفترچه‌ام درباره لولیتا نوشتم."),
                    StoryParagraph("I called her my little nymphet.", "او را نیمف کوچک خودم نامیدم."),
                    StoryParagraph("Charlotte found my journal one day.", "شارلوت یک روز دفترچه‌ام را پیدا کرد."),
                    StoryParagraph("She was horrified and furious.", "او وحشت کرد و خشمگین شد."),
                    StoryParagraph("She ran out of the house and was hit by a car.", "او از خانه دوید و ماشین زدش.")
                )
            ),
            StoryChapter(
                number = 3, title = "On the Road", titlePersian = "در جاده",
                paragraphs = listOf(
                    StoryParagraph("Charlotte died that day.", "شارلوت آن روز مرد."),
                    StoryParagraph("I became Lolita's guardian.", "من سرپرست لولیتا شدم."),
                    StoryParagraph("We left the town and traveled west.", "شهر را ترک کردیم و به غرب سفر کردیم."),
                    StoryParagraph("We stayed in motels along the way.", "در طول راه در متل‌ها ماندیم."),
                    StoryParagraph("I told her her mother was sick.", "گفتم مادرش مریض است."),
                    StoryParagraph("Then I told her she was dead.", "بعد گفتم مرده است."),
                    StoryParagraph("Lolita cried for her mother.", "لولیتا برای مادرش گریه کرد."),
                    StoryParagraph("But she also loved the traveling.", "اما سفر را هم دوست داشت."),
                    StoryParagraph("She loved soda and comics and movies.", "نوشابه، کمیک و فیلم را دوست داشت."),
                    StoryParagraph("She was still just a child.", "او هنوز فقط یک بچه بود."),
                    StoryParagraph("But I treated her as my lover.", "اما مثل عاشقم با او رفتار کردم."),
                    StoryParagraph("She did not understand what was happening.", "او نمی‌فهمید چه اتفاقی می‌افتد."),
                    StoryParagraph("She obeyed me out of fear.", "او از ترس اطاعتم می‌کرد."),
                    StoryParagraph("We drove across America for a year.", "ما یک سال سراسر آمریکا را رانندگی کردیم."),
                    StoryParagraph("We saw deserts, mountains, and cities.", "بیابان‌ها، کوه‌ها و شهرها را دیدیم."),
                    StoryParagraph("Everywhere we went, I feared being caught.", "هر جا می‌رفتیم، می‌ترسیدم دستگیر شوم."),
                    StoryParagraph("I was jealous of every boy she met.", "به هر پسری که می‌دید حسادت می‌کردم."),
                    StoryParagraph("I wanted to keep her all to myself.", "می‌خواستم او را فقط برای خودم نگه دارم."),
                    StoryParagraph("But she started to grow distant.", "اما او شروع کرد دور شدن."),
                    StoryParagraph("She started to plan her escape.", "او شروع کرد به نقشه فرارش.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Escape", titlePersian = "فرار",
                paragraphs = listOf(
                    StoryParagraph("We settled in a town called Beardsley.", "در شهری به نام بردزلی ساکن شدیم."),
                    StoryParagraph("Lolita went to school there.", "لولیتا آنجا به مدرسه رفت."),
                    StoryParagraph("She made friends and learned to act.", "دوست پیدا کرد و یاد گرفت نقش بازی کند."),
                    StoryParagraph("She joined the school play.", "او در نمایش مدرسه شرکت کرد."),
                    StoryParagraph("I was suspicious of everyone.", "به همه مشکوک بودم."),
                    StoryParagraph("A man began to follow us.", "مردی شروع کرد به دنبال کردن ما."),
                    StoryParagraph("His name was Clare Quilty.", "اسمش کلر کویلتی بود."),
                    StoryParagraph("He was a famous playwright.", "او نمایشنامه‌نویس معروفی بود."),
                    StoryParagraph("He had met Lolita at her school.", "او لولیتا را در مدرسه‌اش ملاقات کرده بود."),
                    StoryParagraph("He was also obsessed with young girls.", "او هم به دختران جوان وسواس داشت."),
                    StoryParagraph("One day, Lolita disappeared.", "یک روز، لولیتا ناپدید شد."),
                    StoryParagraph("She had run away with Quilty.", "او با کویلتی فرار کرده بود."),
                    StoryParagraph("I searched for her everywhere.", "همه‌جا دنبالش گشتم."),
                    StoryParagraph("But she was gone for years.", "اما سال‌ها رفته بود."),
                    StoryParagraph("I became sick and empty.", "من مریض و پوچ شدم."),
                    StoryParagraph("Then one day, I received a letter.", "بعد یک روز، نامه‌ای دریافت کردم."),
                    StoryParagraph("It was from Lolita.", "از لولیتا بود."),
                    StoryParagraph("She was married and pregnant.", "او ازدواج کرده و باردار بود."),
                    StoryParagraph("She needed money.", "به پول نیاز داشت."),
                    StoryParagraph("She asked me for help.", "او از من کمک خواست.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End", titlePersian = "پایان",
                paragraphs = listOf(
                    StoryParagraph("I went to see Lolita one last time.", "یک بار آخر به دیدن لولیتا رفتم."),
                    StoryParagraph("She was seventeen years old.", "او هفده ساله بود."),
                    StoryParagraph("She was thin and tired.", "او لاغر و خسته بود."),
                    StoryParagraph("She was no longer the girl I knew.", "او دیگر دختری نبود که می‌شناختم."),
                    StoryParagraph("She told me about Quilty.", "او درباره کویلتی به من گفت."),
                    StoryParagraph("He had thrown her out when she refused him.", "وقتی ردش کرد او را بیرون انداخته بود."),
                    StoryParagraph("She had wandered for years.", "سال‌ها سرگردان بود."),
                    StoryParagraph("Then she met a kind young man.", "بعد با مرد جوان مهربانی آشنا شد."),
                    StoryParagraph("They married and were expecting a baby.", "آن‌ها ازدواج کردند و منتظر بچه بودند."),
                    StoryParagraph("I gave her all the money I had.", "تمام پولی که داشتم را به او دادم."),
                    StoryParagraph("She said goodbye without sadness.", "بدون غم خداحافظی کرد."),
                    StoryParagraph("I left her house in despair.", "خانه‌اش را در ناامیدی ترک کردم."),
                    StoryParagraph("I went to find Clare Quilty.", "رفتم کلر کویلتی را پیدا کنم."),
                    StoryParagraph("I found him in his mansion.", "او را در عمارتش پیدا کردم."),
                    StoryParagraph("We argued and fought.", "بحث کردیم و جنگیدیم."),
                    StoryParagraph("I shot him dead.", "او را با گلوله کشتم."),
                    StoryParagraph("Then I was arrested by the police.", "بعد توسط پلیس دستگیر شدم."),
                    StoryParagraph("I wrote this story in prison.", "این داستان را در زندان نوشتم."),
                    StoryParagraph("I died of a heart attack before the trial.", "قبل از محاکمه از سکته قلبی مردم."),
                    StoryParagraph("And Lolita died in childbirth on Christmas Day.", "و لولیتا روز کریسمس در زایمان مرد.")
                )
            )
        )
    )

    // ─────────────── ۲۱: استاد و مارگاریتا ───────────────
    private fun story21() = StoryContent(
        storyId = "adv_master_and_margarita",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Devil in Moscow", titlePersian = "شیطان در مسکو",
                paragraphs = listOf(
                    StoryParagraph("It was a hot spring day in Moscow.", "روز گرم بهاری در مسکو بود."),
                    StoryParagraph("Two writers sat on a park bench.", "دو نویسنده روی نیمکت پارکی نشستند."),
                    StoryParagraph("One was Mikhail Berlioz, a respected editor.", "یکی میخائیل برلیوز، سردبیر محترمی بود."),
                    StoryParagraph("The other was Ivan Bezdomny, a young poet.", "دیگری ایوان بزدومنی، شاعر جوانی بود."),
                    StoryParagraph("They talked about the existence of God.", "درباره وجود خدا صحبت کردند."),
                    StoryParagraph("Berlioz said there was no God.", "برلیوز گفت خدایی نیست."),
                    StoryParagraph("Suddenly, a stranger joined them.", "ناگهان، غریبه‌ای به آن‌ها پیوست."),
                    StoryParagraph("He was tall and strangely dressed.", "او بلندقد و عجیب لباس پوشیده بود."),
                    StoryParagraph("His eyes were different colors.", "چشم‌هایش رنگ‌های متفاوتی داشتند."),
                    StoryParagraph("He said his name was Woland.", "او گفت اسمش ولاند است."),
                    StoryParagraph("He said he was a professor of black magic.", "او گفت استاد جادوی سیاه است."),
                    StoryParagraph("He told them about Pontius Pilate.", "او درباره پونتیوس پیلاطس به آن‌ها گفت."),
                    StoryParagraph("Berlioz said he did not believe in Jesus.", "برلیوز گفت به عیسی اعتقاد ندارد."),
                    StoryParagraph("Woland predicted Berlioz's death.", "ولاند مرگ برلیوز را پیش‌بینی کرد."),
                    StoryParagraph("He said Berlioz would be killed by a tram.", "او گفت برلیوز توسط تراموا کشته می‌شود."),
                    StoryParagraph("He said a woman would spill sunflower oil.", "او گفت زنی روغن آفتابگردان می‌ریزد."),
                    StoryParagraph("Berlioz laughed at him.", "برلیوز به او خندید."),
                    StoryParagraph("But later that day, Berlioz slipped on oil.", "اما بعدتر آن روز، برلیوز روی روغن لیز خورد."),
                    StoryParagraph("A tram ran over him and killed him.", "تراموایی از رویش گذشت و کشتش."),
                    StoryParagraph("Ivan was shocked and terrified.", "ایوان شوکه و وحشت‌زده شد."),
                    StoryParagraph("He chased Woland through the city.", "او ولاند را در شهر تعقیب کرد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Master's Story", titlePersian = "داستان استاد",
                paragraphs = listOf(
                    StoryParagraph("Ivan was taken to a mental hospital.", "ایوان به بیمارستان روانی برده شد."),
                    StoryParagraph("There he met another patient.", "آنجا با بیمار دیگری ملاقات کرد."),
                    StoryParagraph("The man called himself the Master.", "مرد خودش را استاد نامید."),
                    StoryParagraph("He was a writer who had failed.", "او نویسنده‌ای بود که شکست خورده بود."),
                    StoryParagraph("He had written a novel about Pontius Pilate.", "او رمانی درباره پونتیوس پیلاطس نوشته بود."),
                    StoryParagraph("The novel was about Jesus and Pilate.", "رمان درباره عیسی و پیلاطس بود."),
                    StoryParagraph("It showed Pilate as a troubled man.", "پیلاطس را مردی پریشان نشان می‌داد."),
                    StoryParagraph("Pilate had to sentence Jesus to death.", "پیلاطس مجبور بود عیسی را به مرگ محکوم کند."),
                    StoryParagraph("But he did not want to.", "اما نمی‌خواست."),
                    StoryParagraph("He was afraid of the crowd.", "او از جمعیت می‌ترسید."),
                    StoryParagraph("The novel was rejected by publishers.", "رمان توسط ناشران رد شد."),
                    StoryParagraph("The Master was attacked by critics.", "استاد توسط منتقدان حمله شد."),
                    StoryParagraph("He was afraid and stopped writing.", "او ترسید و نوشتن را متوقف کرد."),
                    StoryParagraph("He burned his manuscript in despair.", "او دست‌نوشته‌اش را از ناامیدی سوزاند."),
                    StoryParagraph("But a woman named Margarita saved some pages.", "اما زنی به نام مارگاریتا چند صفحه را نجات داد."),
                    StoryParagraph("Margarita loved the Master deeply.", "مارگاریتا عمیقاً استاد را دوست داشت."),
                    StoryParagraph("She was his soulmate and support.", "او هم‌روح و پشتیبانش بود."),
                    StoryParagraph("The Master was separated from her.", "استاد از او جدا شد."),
                    StoryParagraph("He was put in the mental hospital.", "او به بیمارستان روانی فرستاده شد."),
                    StoryParagraph("He had lost all hope.", "او تمام امیدش را از دست داده بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "Margarita's Transformation", titlePersian = "دگرگونی مارگاریتا",
                paragraphs = listOf(
                    StoryParagraph("Margarita was still in Moscow.", "مارگاریتا هنوز در مسکو بود."),
                    StoryParagraph("She was married to a rich man.", "او با مرد ثروتمندی ازدواج کرده بود."),
                    StoryParagraph("But she did not love her husband.", "اما شوهرش را دوست نداشت."),
                    StoryParagraph("She only loved the Master.", "او فقط استاد را دوست داشت."),
                    StoryParagraph("One day, she received a strange visitor.", "یک روز، مهمان عجیبی دریافت کرد."),
                    StoryParagraph("It was a talking black cat.", "گربه سیاه سخنگویی بود."),
                    StoryParagraph("His name was Behemoth.", "اسمش بیهیموت بود."),
                    StoryParagraph("He gave her a magic cream.", "او کرم جادویی به او داد."),
                    StoryParagraph("When she used it, she became young and beautiful.", "وقتی استفاده کرد، جوان و زیبا شد."),
                    StoryParagraph("She became a witch and could fly.", "او جادوگر شد و می‌توانست پرواز کند."),
                    StoryParagraph("She flew over Moscow at night.", "شب‌ها بر فراز مسکو پرواز کرد."),
                    StoryParagraph("She destroyed the apartment of a critic.", "او آپارتمان یک منتقد را نابود کرد."),
                    StoryParagraph("She wanted revenge for the Master.", "او برای استاد انتقام می‌خواست."),
                    StoryParagraph("Then Woland called her to his ball.", "بعد ولاند او را به بالماسکه‌اش دعوت کرد."),
                    StoryParagraph("It was the ball of Satan.", "بالماسکه شیطان بود."),
                    StoryParagraph("Margarita was the hostess of the ball.", "مارگاریتا میزبان بالماسکه بود."),
                    StoryParagraph("Hundreds of dead sinners came.", "صدها گناهکار مرده آمدند."),
                    StoryParagraph("Margarita welcomed them with love.", "مارگاریتا با عشق پذیرایشان شد."),
                    StoryParagraph("She asked Woland for one wish.", "او یک آرزو از ولاند خواست."),
                    StoryParagraph("She wanted to be reunited with the Master.", "می‌خواست دوباره با استاد باشد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Pilate's Judgment", titlePersian = "داوری پیلاطس",
                paragraphs = listOf(
                    StoryParagraph("Woland granted Margarita her wish.", "ولاند آرزوی مارگاریتا را برآورده کرد."),
                    StoryParagraph("The Master was brought to her.", "استاد را به نزدش آوردند."),
                    StoryParagraph("They were together again at last.", "بالاخره دوباره با هم بودند."),
                    StoryParagraph("But the Master's novel was still unfinished.", "اما رمان استاد هنوز ناتمام بود."),
                    StoryParagraph("Meanwhile, the story of Pilate continued.", "در همین حال، داستان پیلاطس ادامه یافت."),
                    StoryParagraph("Pilate had sentenced Yeshua to death.", "پیلاطس یشوع را به مرگ محکوم کرده بود."),
                    StoryParagraph("Yeshua was a wandering philosopher.", "یشوع فیلسوفی سرگردان بود."),
                    StoryParagraph("He taught people to love each other.", "او به مردم می‌آموخت هم را دوست بدارند."),
                    StoryParagraph("He taught that all power is violence.", "او می‌آموخت تمام قدرت خشونت است."),
                    StoryParagraph("The authorities feared his teachings.", "مقامات از تعالیمش می‌ترسیدند."),
                    StoryParagraph("Pilate did not want to kill him.", "پیلاطس نمی‌خواست بکشدش."),
                    StoryParagraph("But he was afraid of Caesar.", "اما از سزار می‌ترسید."),
                    StoryParagraph("So he washed his hands and allowed it.", "پس دست‌هایش را شست و اجازه داد."),
                    StoryParagraph("Yeshua was crucified on a hill.", "یشوع روی تپه‌ای به صلیب کشیده شد."),
                    StoryParagraph("Afterwards, Pilate was tortured by guilt.", "بعداً پیلاطس از گناه شکنجه شد."),
                    StoryParagraph("For two thousand years he regretted it.", "دو هزار سال پشیمان بود."),
                    StoryParagraph("He sat alone on a rocky throne.", "تنها روی تخت سنگی نشست."),
                    StoryParagraph("He dreamed of meeting Yeshua again.", "خواب دید دوباره یشوع را ببیند."),
                    StoryParagraph("Finally, he was granted release.", "بالاخره آزادی به او عطا شد."),
                    StoryParagraph("And the Master's novel was complete.", "و رمان استاد کامل شد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End of the Story", titlePersian = "پایان داستان",
                paragraphs = listOf(
                    StoryParagraph("Woland prepared to leave Moscow.", "ولاند آماده ترک مسکو شد."),
                    StoryParagraph("His work there was done.", "کارش آنجا تمام شده بود."),
                    StoryParagraph("He had seen the city's greed and folly.", "طمع و حماقت شهر را دیده بود."),
                    StoryParagraph("He had punished those who deserved it.", "کسانی که لایق بودند را مجازات کرد."),
                    StoryParagraph("The Master and Margarita were set free.", "استاد و مارگاریتا آزاد شدند."),
                    StoryParagraph("Woland offered them peace.", "ولاند به آن‌ها آرامش پیشنهاد داد."),
                    StoryParagraph("Not light, but peace.", "نه نور، بلکه آرامش."),
                    StoryParagraph("They accepted the gift.", "آن‌ها هدیه را پذیرفتند."),
                    StoryParagraph("They went to live in an eternal house.", "آن‌ها برای زندگی در خانه‌ای ابدی رفتند."),
                    StoryParagraph("It was green and peaceful.", "سبز و آرام بود."),
                    StoryParagraph("They walked together in the garden.", "با هم در باغ قدم زدند."),
                    StoryParagraph("Ivan Bezdomny became a professor.", "ایوان بزدومنی استاد شد."),
                    StoryParagraph("He never wrote poetry again.", "او هرگز دوباره شعر ننوشت."),
                    StoryParagraph("But every spring, he felt strange.", "اما هر بهار، احساس عجیبی می‌کرد."),
                    StoryParagraph("He dreamed of Pilate and Yeshua.", "خواب پیلاطس و یشوع را می‌دید."),
                    StoryParagraph("He dreamed of the Master and Margarita.", "خواب استاد و مارگاریتا را می‌دید."),
                    StoryParagraph("The novel became a legend.", "رمان تبدیل به افسانه شد."),
                    StoryParagraph("It was published many years later.", "سال‌ها بعد منتشر شد."),
                    StoryParagraph("People read it with wonder.", "مردم با شگفتی خواندندش."),
                    StoryParagraph("And so the story found its end.", "و اینگونه داستان پایانش را یافت.")
                )
            )
        )
    )
}