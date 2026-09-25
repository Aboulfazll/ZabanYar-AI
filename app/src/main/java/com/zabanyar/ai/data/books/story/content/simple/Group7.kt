package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group7 — ۵ افسانه پریان
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۳۱. پری دریایی کوچک
 *  ۳۲. هانسل و گرتل
 *  ۳۳. جک و لوبیای سحرآمیز
 *  ۳۴. راپونزل
 *  ۳۵. بلبل
 */
object Group7 {

    fun getAll(): List<StoryContent> = listOf(
        story31(), story32(), story33(), story34(), story35()
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۱: پری دریایی کوچک
    // ═══════════════════════════════════════════════════════
    private fun story31() = StoryContent(
        storyId = "little_mermaid",
        chapters = listOf(
            StoryChapter(1, "Deep Under the Sea", "عمیق زیر دریا", listOf(
                StoryParagraph("Deep under the sea lived a sea king.", "عمیق زیر دریا پادشاه دریا زندگی می‌کرد."),
                StoryParagraph("He had six mermaid daughters.", "او شش دختر پری دریایی داشت."),
                StoryParagraph("The youngest was the most beautiful.", "کوچک‌ترین زیباترین بود."),
                StoryParagraph("She had long golden hair.", "موهای بلند طلایی داشت."),
                StoryParagraph("Her eyes were as blue as the sea.", "چشمانش مثل دریا آبی بود."),
                StoryParagraph("She loved to hear stories about humans.", "عاشق شنیدن داستان‌هایی درباره انسان‌ها بود."),
                StoryParagraph("Her grandmother told her many stories.", "مادربزرگش داستان‌های زیادی برایش می‌گفت."),
                StoryParagraph("She dreamed of seeing the world above.", "خواب دیدن دنیای بالا را می‌دید."),
                StoryParagraph("On her fifteenth birthday, she could go up.", "در پانزدهمین سالروز تولدش می‌توانست بالا برود."),
                StoryParagraph("She waited for that day with joy.", "با شوق منتظر آن روز بود.")
            )),
            StoryChapter(2, "The World Above", "دنیای بالا", listOf(
                StoryParagraph("When she turned fifteen, she swam up.", "وقتی پانزده ساله شد، بالا شنا کرد."),
                StoryParagraph("She saw the sky and the sun for the first time.", "برای اولین بار آسمان و خورشید را دید."),
                StoryParagraph("She saw a large ship on the water.", "کشتی بزرگی روی آب دید."),
                StoryParagraph("There was a party on the ship.", "مهمانی‌ای روی کشتی بود."),
                StoryParagraph("A handsome prince was on the ship.", "شاهزاده خوش‌قیافه‌ای روی کشتی بود."),
                StoryParagraph("It was his birthday.", "تولدش بود."),
                StoryParagraph("The little mermaid fell in love.", "پری دریایی کوچک عاشق شد."),
                StoryParagraph("She watched him all night long.", "تمام شب تماشایش کرد."),
                StoryParagraph("Then a terrible storm came.", "بعد طوفان وحشتناکی آمد."),
                StoryParagraph("The ship broke and began to sink.", "کشتی شکست و شروع به غرق شدن کرد.")
            )),
            StoryChapter(3, "Saving the Prince", "نجات شاهزاده", listOf(
                StoryParagraph("The prince fell into the sea.", "شاهزاده در دریا افتاد."),
                StoryParagraph("The little mermaid swam to save him.", "پری دریایی کوچک برای نجاتش شنا کرد."),
                StoryParagraph("She held him and kept him above water.", "او را گرفت و بالای آب نگه داشت."),
                StoryParagraph("She swam to a beach nearby.", "به ساحلی نزدیک شنا کرد."),
                StoryParagraph("She placed him on the sand softly.", "او را آرام روی ماسه گذاشت."),
                StoryParagraph("She sang to him softly.", "آرام برایش آواز خواند."),
                StoryParagraph("Some girls from a temple found him.", "چند دختر از معبدی پیدایش کردند."),
                StoryParagraph("The prince woke up and smiled at them.", "شاهزاده بیدار شد و به آن‌ها لبخند زد."),
                StoryParagraph("He did not see the little mermaid.", "پری دریایی کوچک را ندید."),
                StoryParagraph("She swam away sadly.", "غمگینانه دور شد.")
            )),
            StoryChapter(4, "The Sea Witch", "جادوگر دریا", listOf(
                StoryParagraph("The little mermaid wanted to be human.", "پری دریایی کوچک می‌خواست انسان باشد."),
                StoryParagraph("She went to the sea witch for help.", "برای کمک به جادوگر دریا رفت."),
                StoryParagraph("The witch lived in a dark place.", "جادوگر در جای تاریکی زندگی می‌کرد."),
                StoryParagraph("She could give her human legs.", "می‌توانست پاهای انسانی به او بدهد."),
                StoryParagraph("But the price was very high.", "اما بها خیلی زیاد بود."),
                StoryParagraph("The witch wanted her beautiful voice.", "جادوگر صدای زیبایش را می‌خواست."),
                StoryParagraph("The mermaid agreed to give it.", "پری دریایی موافقت کرد بدهدش."),
                StoryParagraph("She would never speak again.", "او هرگز نمی‌توانست دوباره صحبت کند."),
                StoryParagraph("If the prince did not love her, she would die.", "اگر شاهزاده دوستش نداشت، می‌مرد."),
                StoryParagraph("She drank the magic potion.", "معجون جادویی را نوشید.")
            )),
            StoryChapter(5, "Life as a Human", "زندگی به عنوان انسان", listOf(
                StoryParagraph("The prince found her on the beach.", "شاهزاده او را روی ساحل پیدا کرد."),
                StoryParagraph("He took her to his palace.", "او را به قصرش برد."),
                StoryParagraph("She was beautiful but could not speak.", "او زیبا بود اما نمی‌توانست صحبت کند."),
                StoryParagraph("She danced for the prince every evening.", "هر عصر برای شاهزاده می‌رقصید."),
                StoryParagraph("Her dancing was magical.", "رقصش جادویی بود."),
                StoryParagraph("The prince loved her like a sister.", "شاهزاده او را مثل خواهر دوست داشت."),
                StoryParagraph("But he did not love her as a wife.", "اما مثل همسر دوستش نداشت."),
                StoryParagraph("He wanted to marry a princess.", "می‌خواست با شاهزاده‌خانمی ازدواج کند."),
                StoryParagraph("The little mermaid was very sad.", "پری دریایی کوچک خیلی غمگین شد."),
                StoryParagraph("She could not tell him who she was.", "نمی‌توانست بگوید کیست.")
            )),
            StoryChapter(6, "The Wedding", "عروسی", listOf(
                StoryParagraph("The prince married a princess.", "شاهزاده با شاهزاده‌خانمی ازدواج کرد."),
                StoryParagraph("It was a great celebration.", "جشن بزرگی بود."),
                StoryParagraph("The little mermaid's heart was breaking.", "قلب پری دریایی کوچک می‌شکست."),
                StoryParagraph("She knew she would die at dawn.", "می‌دانست در سپیده‌دم می‌میرد."),
                StoryParagraph("Her sisters came from the sea.", "خواهرانش از دریا آمدند."),
                StoryParagraph("They brought her a magic knife.", "چاقوی جادویی برایش آوردند."),
                StoryParagraph("If she killed the prince, she would live.", "اگر شاهزاده را می‌کشت، زنده می‌ماند."),
                StoryParagraph("But she could not do it.", "اما نمی‌توانست این کار را بکند."),
                StoryParagraph("She loved him too much.", "بیش از حد دوستش داشت."),
                StoryParagraph("She threw the knife into the sea.", "چاقو را در دریا انداخت.")
            )),
            StoryChapter(7, "The Daughters of the Air", "دختران هوا", listOf(
                StoryParagraph("At dawn, she jumped into the sea.", "در سپیده‌دم، در دریا پرید."),
                StoryParagraph("But she did not feel the water.", "اما آب را حس نکرد."),
                StoryParagraph("She became a daughter of the air.", "او دختر هوا شد."),
                StoryParagraph("She was lifted toward the sky.", "به سمت آسمان بلند شد."),
                StoryParagraph("The other air spirits welcomed her.", "ارواح دیگر هوا استقبالش کردند."),
                StoryParagraph("They said she could earn a soul.", "گفتند می‌تواند روحی به دست آورد."),
                StoryParagraph("If she did good deeds for 300 years.", "اگر سیصد سال کارهای خوب بکند."),
                StoryParagraph("She would go to heaven.", "به بهشت می‌رفت."),
                StoryParagraph("She smiled and flew to help children.", "او لبخند زد و برای کمک به بچه‌ها پرواز کرد."),
                StoryParagraph("And so her story ended with hope.", "و اینگونه داستانش با امید پایان یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۲: هانسل و گرتل
    // ═══════════════════════════════════════════════════════
    private fun story32() = StoryContent(
        storyId = "hansel_gretel",
        chapters = listOf(
            StoryChapter(1, "The Poor Family", "خانواده فقیر", listOf(
                StoryParagraph("A poor woodcutter lived near a forest.", "چوب‌بر فقیری نزدیک جنگلی زندگی می‌کرد."),
                StoryParagraph("He had a wife and two children.", "او همسر و دو فرزند داشت."),
                StoryParagraph("The boy was named Hansel.", "پسر هانسل نام داشت."),
                StoryParagraph("The girl was named Gretel.", "دختر گرتل نام داشت."),
                StoryParagraph("They were very poor.", "آن‌ها خیلی فقیر بودند."),
                StoryParagraph("There was not enough food for everyone.", "غذا برای همه کافی نبود."),
                StoryParagraph("The stepmother was cruel and selfish.", "نامادری ظالم و خودخواه بود."),
                StoryParagraph("She wanted to leave the children in the forest.", "می‌خواست بچه‌ها را در جنگل رها کند."),
                StoryParagraph("The father was weak and agreed.", "پدر ضعیف بود و موافقت کرد."),
                StoryParagraph("The children heard the plan at night.", "بچه‌ها شب نقشه را شنیدند.")
            )),
            StoryChapter(2, "The White Pebbles", "سنگ‌های سفید", listOf(
                StoryParagraph("Hansel had an idea.", "هانسل ایده‌ای داشت."),
                StoryParagraph("He went outside at night.", "شب بیرون رفت."),
                StoryParagraph("The moon was very bright.", "ماه خیلی درخشان بود."),
                StoryParagraph("He picked up white pebbles.", "سنگ‌های سفیدی جمع کرد."),
                StoryParagraph("He filled his pockets with them.", "جیب‌هایش را پرشان کرد."),
                StoryParagraph("The next day, they went into the forest.", "روز بعد، به جنگل رفتند."),
                StoryParagraph("Hansel dropped pebbles along the way.", "هانسل در راه سنگ‌ها را انداخت."),
                StoryParagraph("The family left them in the forest.", "خانواده آن‌ها را در جنگل رها کرد."),
                StoryParagraph("At night, the moon rose again.", "شب، ماه دوباره طلوع کرد."),
                StoryParagraph("The pebbles shone like silver.", "سنگ‌ها مثل نقره می‌درخشیدند.")
            )),
            StoryChapter(3, "Finding the Way Home", "یافتن راه خانه", listOf(
                StoryParagraph("Hansel and Gretel followed the pebbles.", "هانسل و گرتل سنگ‌ها را دنبال کردند."),
                StoryParagraph("They walked all night long.", "تمام شب راه رفتند."),
                StoryParagraph("In the morning, they reached home.", "صبح، به خانه رسیدند."),
                StoryParagraph("Their father was very happy.", "پدرشان خیلی خوشحال شد."),
                StoryParagraph("Their stepmother was angry.", "نامادری عصبانی شد."),
                StoryParagraph("She planned to leave them again.", "نقشه کشید دوباره رهایشان کند."),
                StoryParagraph("This time, Hansel could not get pebbles.", "این بار، هانسل نمی‌توانست سنگ بگیرد."),
                StoryParagraph("The door was locked at night.", "شب در قفل بود."),
                StoryParagraph("He used bread crumbs instead.", "در عوض از خرده‌های نان استفاده کرد."),
                StoryParagraph("But the birds ate the crumbs.", "اما پرندگان خرده‌ها را خوردند.")
            )),
            StoryChapter(4, "Lost in the Forest", "گمشده در جنگل", listOf(
                StoryParagraph("They were lost in the forest.", "آن‌ها در جنگل گم شدند."),
                StoryParagraph("They walked for three days.", "سه روز راه رفتند."),
                StoryParagraph("They were very hungry and tired.", "خیلی گرسنه و خسته بودند."),
                StoryParagraph("Then they saw a strange house.", "بعد خانه‌ای عجیب دیدند."),
                StoryParagraph("The walls were made of gingerbread.", "دیوارها از نان زنجبیلی بودند."),
                StoryParagraph("The roof was made of cake.", "سقف از کیک بود."),
                StoryParagraph("The windows were made of sugar.", "پنجره‌ها از شکر بودند."),
                StoryParagraph("They began to eat the house.", "شروع کردند به خوردن خانه."),
                StoryParagraph("Then an old woman came out.", "بعد پیرزنی بیرون آمد."),
                StoryParagraph("She invited them inside kindly.", "مهربانانه دعوتشان کرد داخل.")
            )),
            StoryChapter(5, "The Wicked Witch", "جادوگر شیطانی", listOf(
                StoryParagraph("The old woman was really a witch.", "پیرزن واقعاً جادوگر بود."),
                StoryParagraph("She wanted to eat the children.", "می‌خواست بچه‌ها را بخورد."),
                StoryParagraph("She locked Hansel in a cage.", "هانسل را در قفسی زندانی کرد."),
                StoryParagraph("She made Gretel do all the work.", "گرتل را مجبور کرد همه کار بکند."),
                StoryParagraph("Every day, she fed Hansel well.", "هر روز به هانسل خوب غذا می‌داد."),
                StoryParagraph("She wanted to make him fat.", "می‌خواست چاقش کند."),
                StoryParagraph("But Hansel used a bone to trick her.", "اما هانسل با استخوانی فریبش می‌داد."),
                StoryParagraph("She could not see well.", "او خوب نمی‌توانست ببیند."),
                StoryParagraph("Finally, she decided to cook him.", "بالاخره، تصمیم گرفت بپزدش."),
                StoryParagraph("She ordered Gretel to prepare the oven.", "به گرتل دستور داد فر را آماده کند.")
            )),
            StoryChapter(6, "The Escape", "فرار", listOf(
                StoryParagraph("Gretel pretended to be stupid.", "گرتل تظاهر کرد احمق است."),
                StoryParagraph("She said she did not know how the oven worked.", "گفت نمی‌داند فر چطور کار می‌کند."),
                StoryParagraph("The witch got angry and showed her.", "جادوگر عصبانی شد و نشانش داد."),
                StoryParagraph("Then Gretel pushed her into the oven.", "بعد گرتل هُلش داد داخل فر."),
                StoryParagraph("The witch was burned.", "جادوگر سوخت."),
                StoryParagraph("Gretel freed Hansel from the cage.", "گرتل هانسل را از قفس آزاد کرد."),
                StoryParagraph("They found jewels and gold in the house.", "جواهرات و طلا در خانه پیدا کردند."),
                StoryParagraph("They filled their pockets with treasure.", "جیب‌هایشان را پر از گنج کردند."),
                StoryParagraph("They found a river on the way home.", "در راه خانه رودخانه‌ای پیدا کردند."),
                StoryParagraph("A white duck helped them cross.", "اردک سفیدی کمکشان کرد عبور کنند.")
            )),
            StoryChapter(7, "Home at Last", "بالاخره خانه", listOf(
                StoryParagraph("They walked for many days.", "روزهای زیادی راه رفتند."),
                StoryParagraph("Finally, they saw their father's house.", "بالاخره، خانه پدرشان را دیدند."),
                StoryParagraph("Their father ran to hug them.", "پدرشان دوید تا در آغوششان بگیرد."),
                StoryParagraph("He had been very sad.", "او خیلی غمگین بود."),
                StoryParagraph("The stepmother had died.", "نامادری مرده بود."),
                StoryParagraph("The family was together again.", "خانواده دوباره با هم بودند."),
                StoryParagraph("They were rich with the witch's treasure.", "با گنج جادوگر ثروتمند بودند."),
                StoryParagraph("They lived happily and safely.", "خوشحال و در امان زندگی کردند."),
                StoryParagraph("They never went hungry again.", "هرگز دوباره گرسنه نشدند."),
                StoryParagraph("And so their story ended well.", "و اینگونه داستانشان به خوبی پایان یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۳: جک و لوبیای سحرآمیز
    // ═══════════════════════════════════════════════════════
    private fun story33() = StoryContent(
        storyId = "jack_beanstalk",
        chapters = listOf(
            StoryChapter(1, "The Poor Boy", "پسر فقیر", listOf(
                StoryParagraph("Jack lived with his mother in a small cottage.", "جک با مادرش در کلبه‌ای کوچک زندگی می‌کرد."),
                StoryParagraph("They were very poor.", "آن‌ها خیلی فقیر بودند."),
                StoryParagraph("Their only treasure was a cow.", "تنها گنجشان گاوی بود."),
                StoryParagraph("The cow's name was Milky White.", "اسم گاو میلکی وایت بود."),
                StoryParagraph("One day, the cow stopped giving milk.", "یک روز، گاو شیر دادن را متوقف کرد."),
                StoryParagraph("The mother told Jack to sell her.", "مادر به جک گفت بفروشدش."),
                StoryParagraph("Jack took the cow to the market.", "جک گاو را به بازار برد."),
                StoryParagraph("On the way, he met an old man.", "در راه، پیرمردی ملاقات کرد."),
                StoryParagraph("The man offered magic beans.", "مرد لوبیاهای جادویی پیشنهاد داد."),
                StoryParagraph("Jack traded the cow for the beans.", "جک گاو را با لوبیاها عوض کرد.")
            )),
            StoryChapter(2, "The Magic Beans", "لوبیاهای جادویی", listOf(
                StoryParagraph("Jack returned home with the beans.", "جک با لوبیاها به خانه برگشت."),
                StoryParagraph("His mother was very angry.", "مادرش خیلی عصبانی شد."),
                StoryParagraph("She threw the beans out the window.", "لوبیاها را از پنجره بیرون انداخت."),
                StoryParagraph("Jack went to bed hungry and sad.", "جک گرسنه و غمگین به رختخواب رفت."),
                StoryParagraph("In the morning, something amazing happened.", "صبح، چیز شگفت‌انگیزی اتفاق افتاد."),
                StoryParagraph("A giant beanstalk grew outside.", "لوبیای غول‌پیکری بیرون رشد کرد."),
                StoryParagraph("It went up through the clouds.", "از میان ابرها بالا رفت."),
                StoryParagraph("Jack decided to climb it.", "جک تصمیم گرفت بالا برود."),
                StoryParagraph("He climbed for many hours.", "ساعت‌ها بالا رفت."),
                StoryParagraph("Finally, he reached the top.", "بالاخره، به قله رسید.")
            )),
            StoryChapter(3, "The Giant's Castle", "قلعه غول", listOf(
                StoryParagraph("At the top was a strange land.", "در بالا سرزمین عجیبی بود."),
                StoryParagraph("Jack saw a huge castle.", "جک قلعه‌ای عظیم دید."),
                StoryParagraph("A giant lived there.", "غولی آنجا زندگی می‌کرد."),
                StoryParagraph("The giant was very big and scary.", "غول خیلی بزرگ و ترسناک بود."),
                StoryParagraph("The giant's wife saw Jack.", "همسر غول جک را دید."),
                StoryParagraph("She was kind and hid him.", "او مهربان بود و پنهانش کرد."),
                StoryParagraph("She gave him food and water.", "غذا و آب به او داد."),
                StoryParagraph("Then the giant came home.", "بعد غول به خانه آمد."),
                StoryParagraph("He shouted: Fee-fi-fo-fum!", "او فریاد زد: فی-فای-فو-فام!"),
                StoryParagraph("He smelled the blood of an Englishman.", "بوی خون یک انگلیسی را حس کرد.")
            )),
            StoryChapter(4, "The Golden Goose", "غاز طلایی", listOf(
                StoryParagraph("The giant's wife hid Jack in the oven.", "همسر غول جک را در فر پنهان کرد."),
                StoryParagraph("The giant ate his dinner.", "غول شامش را خورد."),
                StoryParagraph("Then he brought out a golden goose.", "بعد غاز طلایی بیرون آورد."),
                StoryParagraph("The goose laid a golden egg.", "غاز تخم طلایی گذاشت."),
                StoryParagraph("The giant fell asleep counting gold.", "غول در حال شمردن طلا خوابید."),
                StoryParagraph("Jack crept out of the oven.", "جک از فر بیرون خزید."),
                StoryParagraph("He grabbed the golden goose.", "غاز طلایی را گرفت."),
                StoryParagraph("He ran out of the castle.", "از قلعه بیرون دوید."),
                StoryParagraph("He climbed down the beanstalk quickly.", "سریع از لوبیا پایین رفت."),
                StoryParagraph("His mother was very happy.", "مادرش خیلی خوشحال شد.")
            )),
            StoryChapter(5, "The Magic Harp", "چنگ جادویی", listOf(
                StoryParagraph("Jack climbed the beanstalk again.", "جک دوباره از لوبیا بالا رفت."),
                StoryParagraph("This time, he wanted more treasure.", "این بار، گنج بیشتری می‌خواست."),
                StoryParagraph("The giant's wife hid him again.", "همسر غول دوباره پنهانش کرد."),
                StoryParagraph("The giant brought out a magic harp.", "غول چنگ جادویی بیرون آورد."),
                StoryParagraph("The harp played music by itself.", "چنگ خودش موسیقی می‌نواخت."),
                StoryParagraph("The giant fell asleep to the music.", "غول با موسیقی خوابید."),
                StoryParagraph("Jack grabbed the magic harp.", "جک چنگ جادویی را گرفت."),
                StoryParagraph("The harp cried out loudly.", "چنگ با صدای بلند فریاد زد."),
                StoryParagraph("The giant woke up in a rage.", "غول با خشم بیدار شد."),
                StoryParagraph("Jack ran for his life.", "جک برای زندگی‌اش دوید.")
            )),
            StoryChapter(6, "Cutting the Beanstalk", "بریدن لوبیا", listOf(
                StoryParagraph("Jack climbed down as fast as he could.", "جک هر چه سریع‌تر پایین رفت."),
                StoryParagraph("The giant climbed down after him.", "غول دنبالش پایین آمد."),
                StoryParagraph("The whole ground shook with each step.", "زمین با هر قدم می‌لرزید."),
                StoryParagraph("Jack reached the ground.", "جک به زمین رسید."),
                StoryParagraph("He grabbed an axe.", "تبری گرفت."),
                StoryParagraph("He chopped the beanstalk with all his might.", "با تمام قدرتش لوبیا را برید."),
                StoryParagraph("The beanstalk fell down.", "لوبیا افتاد."),
                StoryParagraph("The giant fell with it and died.", "غول با آن افتاد و مرد."),
                StoryParagraph("The land was quiet again.", "سرزمین دوباره آرام شد."),
                StoryParagraph("Jack was a hero.", "جک قهرمان بود.")
            )),
            StoryChapter(7, "Living Happily", "زندگی خوش", listOf(
                StoryParagraph("Jack and his mother became rich.", "جک و مادرش ثروتمند شدند."),
                StoryParagraph("The golden goose laid eggs every day.", "غاز طلایی هر روز تخم می‌گذاشت."),
                StoryParagraph("The magic harp played beautiful music.", "چنگ جادویی موسیقی زیبا می‌نواخت."),
                StoryParagraph("They bought a big house.", "خانه بزرگی خریدند."),
                StoryParagraph("They helped the poor people in the village.", "به فقرای دهکده کمک کردند."),
                StoryParagraph("Jack never climbed the beanstalk again.", "جک هرگز دوباره از لوبیا بالا نرفت."),
                StoryParagraph("He had learned to be careful.", "یاد گرفته بود محتاط باشد."),
                StoryParagraph("His mother was proud of him.", "مادرش به او افتخار می‌کرد."),
                StoryParagraph("They lived happily for many years.", "سال‌ها خوشحال زندگی کردند."),
                StoryParagraph("And so Jack's adventure ended.", "و اینگونه ماجرای جک پایان یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۴: راپونزل
    // ═══════════════════════════════════════════════════════
    private fun story34() = StoryContent(
        storyId = "rapunzel",
        chapters = listOf(
            StoryChapter(1, "The Stolen Child", "کودک دزدیده‌شده", listOf(
                StoryParagraph("A man and his wife lived in a small house.", "مردی و همسرش در خانه‌ای کوچک زندگی می‌کردند."),
                StoryParagraph("The wife was going to have a baby.", "همسر می‌خواست بچه‌دار شود."),
                StoryParagraph("She wanted to eat a special plant.", "می‌خواست گیاه خاصی بخورد."),
                StoryParagraph("The plant grew in a witch's garden.", "گیاه در باغ جادوگری رشد می‌کرد."),
                StoryParagraph("The husband stole the plant for her.", "شوهر برایش گیاه را دزدید."),
                StoryParagraph("The witch caught him in the act.", "جادوگر در حین عمل گرفتش."),
                StoryParagraph("She demanded their first child.", "او اولین فرزندشان را طلب کرد."),
                StoryParagraph("The husband had to agree.", "شوهر مجبور شد موافقت کند."),
                StoryParagraph("When the baby girl was born, the witch took her.", "وقتی دختر بچه به دنیا آمد، جادوگر بردش."),
                StoryParagraph("She named her Rapunzel.", "او را راپونزل نامید.")
            )),
            StoryChapter(2, "The Tower", "برج", listOf(
                StoryParagraph("The witch locked Rapunzel in a tall tower.", "جادوگر راپونزل را در برجی بلند زندانی کرد."),
                StoryParagraph("The tower had no doors.", "برج دری نداشت."),
                StoryParagraph("It only had one small window.", "فقط یک پنجره کوچک داشت."),
                StoryParagraph("Rapunzel grew up in the tower.", "راپونزل در برج بزرگ شد."),
                StoryParagraph("She was very beautiful.", "او خیلی زیبا بود."),
                StoryParagraph("Her hair grew very long.", "موهایش خیلی بلند شد."),
                StoryParagraph("When the witch came, she called out.", "وقتی جادوگر می‌آمد صدا می‌زد."),
                StoryParagraph("Rapunzel would let down her hair.", "راپونزل موهایش را پایین می‌انداخت."),
                StoryParagraph("The witch climbed up her hair.", "جادوگر از موهایش بالا می‌رفت."),
                StoryParagraph("This was their only way to meet.", "این تنها راه دیدارشان بود.")
            )),
            StoryChapter(3, "The Prince", "شاهزاده", listOf(
                StoryParagraph("One day, a prince rode through the forest.", "یک روز، شاهزاده‌ای از جنگل گذشت."),
                StoryParagraph("He heard Rapunzel singing.", "آواز راپونزل را شنید."),
                StoryParagraph("Her voice was very beautiful.", "صدایش خیلی زیبا بود."),
                StoryParagraph("He wanted to find the singer.", "می‌خواست خواننده را پیدا کند."),
                StoryParagraph("He saw the tower and Rapunzel in it.", "برج و راپونزل را در آن دید."),
                StoryParagraph("He fell in love with her immediately.", "بلافاصله عاشقش شد."),
                StoryParagraph("He waited for the witch to leave.", "منتظر ماند تا جادوگر برود."),
                StoryParagraph("Then he called to Rapunzel.", "بعد راپونزل را صدا زد."),
                StoryParagraph("She let down her hair for him.", "موهایش را برایش پایین انداخت."),
                StoryParagraph("He climbed up to meet her.", "برای دیدنش بالا رفت.")
            )),
            StoryChapter(4, "Secret Visits", "دیدارهای مخفیانه", listOf(
                StoryParagraph("The prince visited her every night.", "شاهزاده هر شب به دیدنش می‌رفت."),
                StoryParagraph("They talked for hours.", "ساعت‌ها صحبت می‌کردند."),
                StoryParagraph("Rapunzel told him about her life.", "راپونزل درباره زندگی‌اش به او گفت."),
                StoryParagraph("He told her about the world outside.", "او درباره دنیای بیرون به او گفت."),
                StoryParagraph("They fell deeply in love.", "آن‌ها عمیقاً عاشق شدند."),
                StoryParagraph("The prince asked her to marry him.", "شاهزاده از او خواست با او ازدواج کند."),
                StoryParagraph("Rapunzel said yes happily.", "راپونزل با خوشحالی بله گفت."),
                StoryParagraph("They planned her escape.", "نقشه فرارش را کشیدند."),
                StoryParagraph("The prince would bring silk each night.", "شاهزاده هر شب ابریشم می‌آورد."),
                StoryParagraph("She would make a ladder from it.", "او از آن نردبان می‌ساخت.")
            )),
            StoryChapter(5, "The Discovery", "کشف", listOf(
                StoryParagraph("One day, Rapunzel said something careless.", "یک روز، راپونزل چیز بی‌احتیاطی گفت."),
                StoryParagraph("She said the witch was heavier than the prince.", "گفت جادوگر سنگین‌تر از شاهزاده است."),
                StoryParagraph("The witch became furious.", "جادوگر خشمگین شد."),
                StoryParagraph("She cut off Rapunzel's long hair.", "موهای بلند راپونزل را برید."),
                StoryParagraph("She sent Rapunzel to a desert.", "او را به بیابانی فرستاد."),
                StoryParagraph("Rapunzel had to live there alone.", "راپونزل مجبور شد تنها آنجا زندگی کند."),
                StoryParagraph("The witch waited in the tower.", "جادوگر در برج منتظر ماند."),
                StoryParagraph("When the prince came, he called out.", "وقتی شاهزاده آمد، صدا زد."),
                StoryParagraph("The witch let down the cut hair.", "جادوگر موهای بریده را پایین انداخت."),
                StoryParagraph("The prince climbed up and found the witch.", "شاهزاده بالا رفت و جادوگر را پیدا کرد.")
            )),
            StoryChapter(6, "The Blind Prince", "شاهزاده کور", listOf(
                StoryParagraph("The prince was terrified.", "شاهزاده وحشت کرد."),
                StoryParagraph("The witch laughed at him.", "جادوگر به او خندید."),
                StoryParagraph("She pushed him out of the tower.", "او را از برج بیرون انداخت."),
                StoryParagraph("He fell into thorny bushes.", "او در بوته‌های خار افتاد."),
                StoryParagraph("The thorns hurt his eyes.", "خارها چشمانش را زخمی کردند."),
                StoryParagraph("He became blind.", "او کور شد."),
                StoryParagraph("He wandered through the world sadly.", "غمگین در دنیا سرگردان شد."),
                StoryParagraph("He looked for Rapunzel everywhere.", "همه‌جا دنبال راپونزل گشت."),
                StoryParagraph("He could not find her.", "نتوانست پیدایش کند."),
                StoryParagraph("He ate berries and roots to survive.", "برای زنده ماندن توت و ریشه می‌خورد.")
            )),
            StoryChapter(7, "The Happy Reunion", "دیدار خوش", listOf(
                StoryParagraph("One day, he reached the desert.", "یک روز، به بیابان رسید."),
                StoryParagraph("He heard a familiar voice singing.", "صدای آشنایی شنید که می‌خواند."),
                StoryParagraph("It was Rapunzel.", "راپونزل بود."),
                StoryParagraph("She ran to him and hugged him.", "او دوید و در آغوشش گرفت."),
                StoryParagraph("Her tears fell on his eyes.", "اشک‌هایش روی چشمانش ریخت."),
                StoryParagraph("Suddenly, he could see again.", "ناگهان، دوباره توانست ببیند."),
                StoryParagraph("They went to the prince's kingdom.", "آن‌ها به پادشاهی شاهزاده رفتند."),
                StoryParagraph("They got married with joy.", "با شادی ازدواج کردند."),
                StoryParagraph("They lived happily ever after.", "تا همیشه خوشحال زندگی کردند."),
                StoryParagraph("And the witch was never seen again.", "و جادوگر هرگز دوباره دیده نشد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۵: بلبل
    // ═══════════════════════════════════════════════════════
    private fun story35() = StoryContent(
        storyId = "nightingale",
        chapters = listOf(
            StoryChapter(1, "The Emperor of China", "امپراتور چین", listOf(
                StoryParagraph("The Emperor of China had a beautiful palace.", "امپراتور چین قصری زیبا داشت."),
                StoryParagraph("It was made of the finest porcelain.", "از بهترین چینی ساخته شده بود."),
                StoryParagraph("The palace was surrounded by a great garden.", "قصر با باغ بزرگی احاطه شده بود."),
                StoryParagraph("The garden was full of flowers and trees.", "باغ پر از گل و درخت بود."),
                StoryParagraph("In the garden lived a nightingale.", "در باغ بلبلی زندگی می‌کرد."),
                StoryParagraph("It sang beautifully every evening.", "هر عصر زیبا آواز می‌خواند."),
                StoryParagraph("Everyone who heard it loved the song.", "هر کس آوازش را می‌شنید عاشقش می‌شد."),
                StoryParagraph("Travelers wrote about the bird.", "مسافران درباره پرنده می‌نوشتند."),
                StoryParagraph("They said it was the best thing in China.", "می‌گفتند بهترین چیز چین است."),
                StoryParagraph("The Emperor heard about the nightingale.", "امپراتور درباره بلبل شنید."),
                StoryParagraph("He wanted to hear it sing for him.", "می‌خواست برایش آواز بخواند.")
            )),
            StoryChapter(2, "Finding the Nightingale", "یافتن بلبل", listOf(
                StoryParagraph("The Emperor ordered his servants to find the bird.", "امپراتور به خدمتکارانش دستور داد پرنده را پیدا کنند."),
                StoryParagraph("They searched everywhere in the garden.", "همه‌جا در باغ گشتند."),
                StoryParagraph("They asked every animal about it.", "از هر حیوانی درباره‌اش پرسیدند."),
                StoryParagraph("Finally, a kitchen maid knew the bird.", "بالاخره، خدمتکار آشپزخانه پرنده را می‌شناخت."),
                StoryParagraph("She led them to the nightingale.", "او آن‌ها را به بلبل رهنمون کرد."),
                StoryParagraph("The nightingale agreed to sing for the Emperor.", "بلبل موافقت کرد برای امپراتور بخواند."),
                StoryParagraph("That evening, it sang in the palace.", "آن عصر، در قصر آواز خواند."),
                StoryParagraph("The Emperor cried from the beauty.", "امپراتور از زیبایی گریه کرد."),
                StoryParagraph("He wanted the bird to stay forever.", "می‌خواست پرنده برای همیشه بماند."),
                StoryParagraph("The nightingale agreed to come often.", "بلبل موافقت کرد اغلب بیاید.")
            )),
            StoryChapter(3, "The Golden Bird", "پرنده طلایی", listOf(
                StoryParagraph("Soon, a package came from Japan.", "به‌زودی، بسته‌ای از ژاپن رسید."),
                StoryParagraph("Inside was a mechanical bird.", "داخلش پرنده‌ای مکانیکی بود."),
                StoryParagraph("It was made of gold and jewels.", "از طلا و جواهرات ساخته شده بود."),
                StoryParagraph("When wound up, it sang a perfect song.", "وقتی کوک می‌شد، آواز کاملی می‌خواند."),
                StoryParagraph("The Emperor loved it more than the real bird.", "امپراتور آن را بیشتر از پرنده واقعی دوست داشت."),
                StoryParagraph("He made the mechanical bird his favorite.", "پرنده مکانیکی را محبوبش کرد."),
                StoryParagraph("The real nightingale was forgotten.", "بلبل واقعی فراموش شد."),
                StoryParagraph("It flew out the window sadly.", "غمگینانه از پنجره پرواز کرد."),
                StoryParagraph("No one noticed it had gone.", "هیچ‌کس متوجه نشد رفته."),
                StoryParagraph("The Emperor had his golden bird.", "امپراتور پرنده طلایی‌اش را داشت.")
            )),
            StoryChapter(4, "The Broken Bird", "پرنده شکسته", listOf(
                StoryParagraph("The mechanical bird sang every day.", "پرنده مکانیکی هر روز آواز می‌خواند."),
                StoryParagraph("But it could only sing one song.", "اما فقط یک آهنگ می‌توانست بخواند."),
                StoryParagraph("After a year, it broke down.", "بعد از یک سال، خراب شد."),
                StoryParagraph("The Emperor was very sad.", "امپراتور خیلی غمگین شد."),
                StoryParagraph("The best watchmakers tried to fix it.", "بهترین ساعت‌سازان تلاش کردند تعمیرش کنند."),
                StoryParagraph("But it could not be fixed properly.", "اما درست تعمیر نمی‌شد."),
                StoryParagraph("It could only sing once a year.", "فقط سالی یک بار می‌توانست آواز بخواند."),
                StoryParagraph("The Emperor still kept it close.", "امپراتور هنوز نزدیک نگهش می‌داشت."),
                StoryParagraph("The years passed quietly.", "سال‌ها آرام گذشتند."),
                StoryParagraph("The Emperor became old and sick.", "امپراتور پیر و مریض شد.")
            )),
            StoryChapter(5, "The Emperor's Illness", "بیماری امپراتور", listOf(
                StoryParagraph("The Emperor lay on his deathbed.", "امپراتور روی بستر مرگ دراز کشید."),
                StoryParagraph("His servants had left him alone.", "خدمتکارانش تنها گذاشتندش."),
                StoryParagraph("Death sat beside him on the bed.", "مرگ کنارش روی تخت نشست."),
                StoryParagraph("Many strange faces appeared.", "صورت‌های عجیب زیادی ظاهر شدند."),
                StoryParagraph("The Emperor was terrified.", "امپراتور وحشت کرد."),
                StoryParagraph("He asked for music to comfort him.", "می‌خواست موسیقی آرامش کند."),
                StoryParagraph("But the mechanical bird was broken.", "اما پرنده مکانیکی خراب بود."),
                StoryParagraph("He called for the golden bird.", "پرنده طلایی را صدا زد."),
                StoryParagraph("But it could not sing for him.", "اما نمی‌توانست برایش آواز بخواند."),
                StoryParagraph("He felt cold and afraid.", "احساس سرما و ترس کرد.")
            )),
            StoryChapter(6, "The Real Nightingale", "بلبل واقعی", listOf(
                StoryParagraph("Suddenly, the real nightingale appeared.", "ناگهان، بلبل واقعی ظاهر شد."),
                StoryParagraph("It had come back to the window.", "به پنجره برگشته بود."),
                StoryParagraph("It began to sing a beautiful song.", "شروع کرد به خواندن آوازی زیبا."),
                StoryParagraph("The Emperor felt stronger.", "امپراتور قوی‌تر احساس کرد."),
                StoryParagraph("The strange faces disappeared.", "صورت‌های عجیب ناپدید شدند."),
                StoryParagraph("Even Death listened to the song.", "حتی مرگ به آواز گوش داد."),
                StoryParagraph("Death wanted to hear more.", "مرگ می‌خواست بیشتر بشنود."),
                StoryParagraph("The nightingale promised more songs.", "بلبل آهنگ‌های بیشتری وعده داد."),
                StoryParagraph("Death gave back the Emperor's life.", "مرگ زندگی امپراتور را پس داد."),
                StoryParagraph("The Emperor was saved by music.", "امپراتور با موسیقی نجات یافت.")
            )),
            StoryChapter(7, "The Emperor's Lesson", "درس امپراتور", listOf(
                StoryParagraph("The Emperor thanked the nightingale.", "امپراتور از بلبل تشکر کرد."),
                StoryParagraph("He asked it to stay with him forever.", "از آن خواست برای همیشه با او بماند."),
                StoryParagraph("The nightingale refused politely.", "بلبل مؤدبانه امتناع کرد."),
                StoryParagraph("It said it must be free to sing.", "گفت باید آزاد باشد تا آواز بخواند."),
                StoryParagraph("It would come back to sing sometimes.", "گاهی برمی‌گشت و آواز می‌خواند."),
                StoryParagraph("The Emperor understood.", "امپراتور فهمید."),
                StoryParagraph("True beauty cannot be owned.", "زیبایی واقعی را نمی‌توان مالک شد."),
                StoryParagraph("He ruled with more kindness after that.", "بعد از آن با مهربانی بیشتری حکومت کرد."),
                StoryParagraph("He learned to value real things.", "یاد گرفت به چیزهای واقعی ارزش بدهد."),
                StoryParagraph("And so the nightingale sang for everyone.", "و اینگونه بلبل برای همه آواز خواند.")
            ))
        )
    )
}