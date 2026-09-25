package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group6 — ۵ داستان شرقی و ماجراجویی
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۲۶. علی‌بابا و چهل دزد
 *  ۲۷. کتاب جنگل
 *  ۲۸. نان و شراب (داستان کوتاه)
 *  ۲۹. جوجه اردک زشت
 *  ۳۰. لباس جدید امپراتور
 */
object Group6 {

    fun getAll(): List<StoryContent> = listOf(
        story26(), story27(), story28(), story29(), story30()
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۶: علی‌بابا و چهل دزد
    // ═══════════════════════════════════════════════════════
    private fun story26() = StoryContent(
        storyId = "ali_baba",
        chapters = listOf(
            StoryChapter(1, "The Woodcutter", "چوب‌بر", listOf(
                StoryParagraph("Ali Baba was a poor woodcutter.", "علی‌بابا چوب‌بر فقیری بود."),
                StoryParagraph("He lived in a small village in Persia.", "او در دهکده‌ای کوچک در پارس زندگی می‌کرد."),
                StoryParagraph("He had a kind wife and three children.", "همسری مهربان و سه فرزند داشت."),
                StoryParagraph("His brother Cassim was rich and greedy.", "برادرش قاسم ثروتمند و حریص بود."),
                StoryParagraph("Ali Baba worked hard every day.", "علی‌بابا هر روز سخت کار می‌کرد."),
                StoryParagraph("He cut wood in the forest.", "او در جنگل چوب می‌برید."),
                StoryParagraph("He sold the wood in the market.", "چوب را در بازار می‌فروخت."),
                StoryParagraph("He earned very little money.", "پول خیلی کمی درمی‌آورد."),
                StoryParagraph("But he was happy with his life.", "اما از زندگی‌اش راضی بود."),
                StoryParagraph("His brother always wanted more.", "برادرش همیشه بیشتر می‌خواست.")
            )),
            StoryChapter(2, "The Secret Cave", "غار مخفی", listOf(
                StoryParagraph("One day, Ali Baba was in the forest.", "یک روز، علی‌بابا در جنگل بود."),
                StoryParagraph("He saw forty men on horses.", "چهل سوار را دید."),
                StoryParagraph("They looked like dangerous robbers.", "شبیه دزدان خطرناکی بودند."),
                StoryParagraph("Ali Baba hid behind a tree.", "علی‌بابا پشت درختی پنهان شد."),
                StoryParagraph("The leader spoke to a rock.", "رهبر با صخره‌ای صحبت کرد."),
                StoryParagraph("He said: Open Sesame!", "او گفت: باز شو کنجد!"),
                StoryParagraph("A door opened in the rock.", "دری در صخره باز شد."),
                StoryParagraph("The robbers went inside the cave.", "دزدان داخل غار رفتند."),
                StoryParagraph("They came out with empty hands.", "با دست‌های خالی بیرون آمدند."),
                StoryParagraph("Then they said: Close Sesame!", "بعد گفتند: بسته شو کنجد!")
            )),
            StoryChapter(3, "The Treasure", "گنج", listOf(
                StoryParagraph("After the robbers left, Ali Baba came out.", "بعد از رفتن دزدان، علی‌بابا بیرون آمد."),
                StoryParagraph("He said the magic words.", "کلمات جادویی را گفت."),
                StoryParagraph("The door opened for him.", "در برایش باز شد."),
                StoryParagraph("Inside, he saw a great treasure.", "داخل، گنج بزرگی دید."),
                StoryParagraph("There was gold, silver, and jewels.", "طلا، نقره و جواهرات بود."),
                StoryParagraph("He had never seen so much wealth.", "هرگز اینقدر ثروت ندیده بود."),
                StoryParagraph("He took only a small bag of gold.", "فقط کیسه کوچکی طلا برداشت."),
                StoryParagraph("He said: Close Sesame!", "او گفت: بسته شو کنجد!"),
                StoryParagraph("He went home to his wife.", "به خانه پیش همسرش رفت."),
                StoryParagraph("They were happy with their small fortune.", "آن‌ها از ثروت کوچکشان خوشحال شدند.")
            )),
            StoryChapter(4, "The Jealous Brother", "برادر حسود", listOf(
                StoryParagraph("Ali Baba's wife borrowed a scale.", "همسر علی‌بابا ترازویی قرض گرفت."),
                StoryParagraph("She weighed the gold secretly.", "او مخفیانه طلا را وزن کرد."),
                StoryParagraph("The rich brother found out.", "برادر ثروتمند فهمید."),
                StoryParagraph("Cassim demanded the secret.", "قاسم راز را طلب کرد."),
                StoryParagraph("Ali Baba told him about the cave.", "علی‌بابا درباره غار به او گفت."),
                StoryParagraph("Cassim went there with ten mules.", "قاسم با ده قاطر به آنجا رفت."),
                StoryParagraph("He filled the mules with treasure.", "قاطرها را پر از گنج کرد."),
                StoryParagraph("But he forgot the magic words.", "اما کلمات جادویی را فراموش کرد.")
            )),
            StoryChapter(5, "Cassim's Fate", "سرنوشت قاسم", listOf(
                StoryParagraph("Cassim could not remember 'Open Sesame'.", "قاسم نمی‌توانست 'باز شو کنجد' را به یاد آورد."),
                StoryParagraph("He tried many different words.", "کلمات مختلفی را امتحان کرد."),
                StoryParagraph("The door did not open.", "در باز نشد."),
                StoryParagraph("The robbers returned at night.", "دزدان شب برگشتند."),
                StoryParagraph("They found Cassim trapped inside.", "قاسم را داخل گرفتار پیدا کردند."),
                StoryParagraph("They were very angry.", "آن‌ها خیلی عصبانی شدند."),
                StoryParagraph("They punished him for stealing.", "او را برای دزدی مجازات کردند."),
                StoryParagraph("The robbers left his body in the cave.", "دزدان جسدش را در غار رها کردند."),
                StoryParagraph("Ali Baba went to find his brother.", "علی‌بابا برای پیدا کردن برادرش رفت."),
                StoryParagraph("He brought the body home sadly.", "جسد را غمگینانه به خانه برد.")
            )),
            StoryChapter(6, "Morgiana's Plan", "نقشه مرجان", listOf(
                StoryParagraph("Ali Baba had a clever slave named Morgiana.", "علی‌بابا برده‌ای باهوش به نام مرجان داشت."),
                StoryParagraph("She learned about the robbers.", "او درباره دزدان فهمید."),
                StoryParagraph("The robbers wanted revenge.", "دزدان انتقام می‌خواستند."),
                StoryParagraph("One robber disguised himself as a merchant.", "دزدی به عنوان تاجر مبدل شد."),
                StoryParagraph("He asked Ali Baba for a place to stay.", "از علی‌بابا جایی برای ماندن خواست."),
                StoryParagraph("Morgiana noticed something strange.", "مرجان چیزی عجیب متوجه شد."),
                StoryParagraph("She saw a knife under his coat.", "چاقویی زیر کتش دید."),
                StoryParagraph("She killed him before he could attack.", "قبل از اینکه حمله کند کشتش."),
                StoryParagraph("The other robbers were caught.", "دزدان دیگر دستگیر شدند."),
                StoryParagraph("Ali Baba rewarded Morgiana with freedom.", "علی‌بابا به مرجان آزادی پاداش داد.")
            )),
            StoryChapter(7, "The Happy Ending", "پایان خوش", listOf(
                StoryParagraph("Ali Baba married Morgiana to his son.", "علی‌بابا مرجان را به پسرش داد."),
                StoryParagraph("The family lived together in peace.", "خانواده با هم در آرامش زندگی کردند."),
                StoryParagraph("Ali Baba used the treasure wisely.", "علی‌بابا از گنج عاقلانه استفاده کرد."),
                StoryParagraph("He helped the poor people of the village.", "به فقرای دهکده کمک کرد."),
                StoryParagraph("He never became greedy like his brother.", "او هرگز مثل برادرش حریص نشد."),
                StoryParagraph("He kept the secret of the cave safe.", "راز غار را امن نگه داشت."),
                StoryParagraph("His children learned about honesty and kindness.", "فرزندانش صداقت و مهربانی آموختند."),
                StoryParagraph("The village became a happy place.", "دهکده تبدیل به جای خوشحالی شد."),
                StoryParagraph("And so Ali Baba lived a long and good life.", "و اینگونه علی‌بابا زندگی طولانی و خوبی داشت."),
                StoryParagraph("The story of the magic cave was told forever.", "داستان غار جادویی برای همیشه گفته شد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۷: کتاب جنگل
    // ═══════════════════════════════════════════════════════
    private fun story27() = StoryContent(
        storyId = "jungle_book",
        chapters = listOf(
            StoryChapter(1, "The Lost Baby", "نوزاد گمشده", listOf(
                StoryParagraph("A baby was lost in the Indian jungle.", "نوزادی در جنگل هند گم شد."),
                StoryParagraph("His parents had run away from a tiger.", "والدینش از ببری فرار کرده بودند."),
                StoryParagraph("The tiger was named Shere Khan.", "اسم ببر شیرخان بود."),
                StoryParagraph("A family of wolves found the baby.", "خانواده‌ای از گرگ‌ها نوزاد را پیدا کردند."),
                StoryParagraph("They named him Mowgli.", "او را موگلی نامیدند."),
                StoryParagraph("The mother wolf loved him like her own cub.", "مادر گرگ مثل توله خودش دوستش داشت."),
                StoryParagraph("The father wolf protected him.", "پدر گرگ محافظتش می‌کرد."),
                StoryParagraph("Mowgli grew up with the wolf cubs.", "موگلی با توله‌های گرگ بزرگ شد."),
                StoryParagraph("He learned the language of the jungle.", "زبان جنگل را یاد گرفت."),
                StoryParagraph("The animals became his family.", "حیوانات خانواده‌اش شدند.")
            )),
            StoryChapter(2, "The Jungle Lessons", "درس‌های جنگل", listOf(
                StoryParagraph("Baloo the bear taught Mowgli the laws.", "بالو خرس قوانین را به موگلی آموخت."),
                StoryParagraph("Baloo was big and wise.", "بالو بزرگ و دانا بود."),
                StoryParagraph("He loved honey and music.", "عاشق عسل و موسیقی بود."),
                StoryParagraph("Bagheera the panther taught him hunting.", "باگیرا پلنگ شکار را به او آموخت."),
                StoryParagraph("Bagheera was black and fast.", "باگیرا سیاه و سریع بود."),
                StoryParagraph("He had been raised by humans once.", "او زمانی توسط انسان‌ها بزرگ شده بود."),
                StoryParagraph("Mowgli learned to climb trees.", "موگلی یاد گرفت از درخت‌ها بالا برود."),
                StoryParagraph("He learned to swim in the river.", "یاد گرفت در رودخانه شنا کند."),
                StoryParagraph("He learned to run like the wind.", "یاد گرفت مثل باد بدود."),
                StoryParagraph("He was becoming a true jungle boy.", "او داشت پسری واقعی جنگل می‌شد.")
            )),
            StoryChapter(3, "Shere Khan's Threat", "تهدید شیرخان", listOf(
                StoryParagraph("Shere Khan the tiger hated Mowgli.", "شیرخان ببر از موگلی متنفر بود."),
                StoryParagraph("He wanted to eat the man-cub.", "می‌خواست بچه انسان را بخورد."),
                StoryParagraph("The wolves protected Mowgli.", "گرگ‌ها از موگلی محافظت می‌کردند."),
                StoryParagraph("But Shere Khan was powerful.", "اما شیرخان قدرتمند بود."),
                StoryParagraph("He spoke to the young wolves.", "او با گرگ‌های جوان صحبت کرد."),
                StoryParagraph("He told them to give him the boy.", "به آن‌ها گفت پسر را به او بدهند."),
                StoryParagraph("The wolf council met to decide.", "شورای گرگ‌ها برای تصمیم ملاقات کرد."),
                StoryParagraph("They agreed Mowgli had to leave.", "آن‌ها موافقت کردند موگلی باید برود."),
                StoryParagraph("Bagheera offered to take him to the man-village.", "باگیرا پیشنهاد داد او را به دهکده انسان‌ها ببرد."),
                StoryParagraph("Mowgli was very sad.", "موگلی خیلی غمگین شد.")
            )),
            StoryChapter(4, "The Journey", "سفر", listOf(
                StoryParagraph("Mowgli and Bagheera started their journey.", "موگلی و باگیرا سفرشان را شروع کردند."),
                StoryParagraph("They walked through the jungle.", "آن‌ها از جنگل گذشتند."),
                StoryParagraph("They met Kaa the python.", "آن‌ها با کا، پیتون ملاقات کردند."),
                StoryParagraph("Kaa had a hypnotic stare.", "کا نگاهی هیپنوتیزمی داشت."),
                StoryParagraph("He wanted to eat Mowgli.", "او می‌خواست موگلی را بخورد."),
                StoryParagraph("But Bagheera saved him in time.", "اما باگیرا به موقع نجاتش داد."),
                StoryParagraph("They met the elephants on the way.", "در راه با فیل‌ها ملاقات کردند."),
                StoryParagraph("The elephant leader was Colonel Hathi.", "رهبر فیل‌ها سرهنگ هاتی بود."),
                StoryParagraph("His troop marched through the jungle.", "گروهش از جنگل عبور کرد."),
                StoryParagraph("Mowgli watched them with wonder.", "موگلی با شگفتی تماشایشان کرد.")
            )),
            StoryChapter(5, "The Monkey City", "شهر میمون‌ها", listOf(
                StoryParagraph("The monkeys captured Mowgli.", "میمون‌ها موگلی را اسیر کردند."),
                StoryParagraph("They took him to their ancient city.", "او را به شهر باستانی‌شان بردند."),
                StoryParagraph("They wanted him to teach them fire.", "می‌خواستند آتش را یادشان دهد."),
                StoryParagraph("Mowgli did not know how to make fire.", "موگلی نمی‌دانست چطور آتش درست کند."),
                StoryParagraph("King Louie was the monkey leader.", "پادشاه لویی رهبر میمون‌ها بود."),
                StoryParagraph("He sang a song about wanting to be human.", "او آهنگی درباره خواستن انسان بودن خواند."),
                StoryParagraph("Baloo and Bagheera came to rescue Mowgli.", "بالو و باگیرا برای نجات موگلی آمدند."),
                StoryParagraph("There was a great fight in the ruins.", "نبرد بزرگی در ویرانه‌ها شد."),
                StoryParagraph("The old palace began to fall down.", "قصر قدیمی شروع به فرو ریختن کرد."),
                StoryParagraph("They escaped just in time.", "آن‌ها دقیقاً به موقع فرار کردند.")
            )),
            StoryChapter(6, "The Final Battle", "نبرد نهایی", listOf(
                StoryParagraph("Shere Khan found Mowgli again.", "شیرخان دوباره موگلی را پیدا کرد."),
                StoryParagraph("He chased him through the jungle.", "او را در جنگل تعقیب کرد."),
                StoryParagraph("Mowgli ran to the river.", "موگلی به سمت رودخانه دوید."),
                StoryParagraph("The tiger followed him closely.", "ببر نزدیک دنبالش کرد."),
                StoryParagraph("Mowgli had an idea.", "موگلی ایده‌ای داشت."),
                StoryParagraph("He tied a burning branch to the tiger's tail.", "شاخه‌ای سوزان به دم ببر بست."),
                StoryParagraph("Shere Khan was terrified of fire.", "شیرخان از آتش وحشت کرد."),
                StoryParagraph("He ran away and never came back.", "او فرار کرد و هرگز برنگشت."),
                StoryParagraph("Mowgli was safe at last.", "موگلی بالاخره در امان بود."),
                StoryParagraph("The jungle animals celebrated.", "حیوانات جنگل جشن گرفتند.")
            )),
            StoryChapter(7, "Mowgli's Choice", "انتخاب موگلی", listOf(
                StoryParagraph("Mowgli went to the man-village.", "موگلی به دهکده انسان‌ها رفت."),
                StoryParagraph("He saw a girl getting water.", "دختری را دید که آب می‌آورد."),
                StoryParagraph("She smiled at him kindly.", "او مهربانانه به او لبخند زد."),
                StoryParagraph("Mowgli felt something new.", "موگلی چیز جدیدی حس کرد."),
                StoryParagraph("He followed her to the village.", "دنبالش به دهکده رفت."),
                StoryParagraph("Bagheera and Baloo watched him go.", "باگیرا و بالو رفتنش را تماشا کردند."),
                StoryParagraph("They were sad but happy for him.", "غمگین بودند اما برایش خوشحال."),
                StoryParagraph("Mowgli had found his true home.", "موگلی خانه واقعی‌اش را پیدا کرده بود."),
                StoryParagraph("But he would never forget the jungle.", "اما هرگز جنگل را فراموش نمی‌کرد."),
                StoryParagraph("And so his great adventure ended.", "و اینگونه ماجرای بزرگش پایان یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۸: جوجه اردک زشت
    // ═══════════════════════════════════════════════════════
    private fun story28() = StoryContent(
        storyId = "ugly_duckling",
        chapters = listOf(
            StoryChapter(1, "The Birth", "تولد", listOf(
                StoryParagraph("It was a beautiful summer day.", "روز زیبای تابستانی بود."),
                StoryParagraph("A mother duck sat on her eggs.", "مادر اردکی روی تخم‌هایش نشسته بود."),
                StoryParagraph("She had five small eggs.", "پنج تخم کوچک داشت."),
                StoryParagraph("And one very large egg.", "و یک تخم خیلی بزرگ."),
                StoryParagraph("The small eggs hatched first.", "تخم‌های کوچک اول باز شدند."),
                StoryParagraph("Five yellow ducklings came out.", "پنج جوجه اردک زرد بیرون آمدند."),
                StoryParagraph("The large egg took longer.", "تخم بزرگ بیشتر طول کشید."),
                StoryParagraph("Finally, it cracked open.", "بالاخره، ترکید و باز شد."),
                StoryParagraph("A big gray bird came out.", "پرنده خاکستری بزرگی بیرون آمد."),
                StoryParagraph("He was not like the others.", "او مثل دیگران نبود.")
            )),
            StoryChapter(2, "The Rejection", "طرد شدن", listOf(
                StoryParagraph("The other ducklings laughed at him.", "جوجه اردک‌های دیگر مسخره‌اش کردند."),
                StoryParagraph("They said he was ugly.", "گفتند زشت است."),
                StoryParagraph("The mother duck was confused.", "مادر اردک گیج شد."),
                StoryParagraph("She loved all her children.", "او همه بچه‌هایش را دوست داشت."),
                StoryParagraph("But the gray duckling was different.", "اما جوجه اردک خاکستری متفاوت بود."),
                StoryParagraph("The other animals made fun of him.", "حیوانات دیگر مسخره‌اش کردند."),
                StoryParagraph("The chickens pecked at him.", "مرغ‌ها نوکش می‌زدند."),
                StoryParagraph("The turkeys pushed him away.", "بوقلمون‌ها دورش می‌کردند."),
                StoryParagraph("Even his brothers and sisters were mean.", "حتی برادران و خواهرانش بدجنس بودند."),
                StoryParagraph("The ugly duckling felt very sad.", "جوجه اردک زشت خیلی غمگین شد.")
            )),
            StoryChapter(3, "Running Away", "فرار", listOf(
                StoryParagraph("One day, the duckling ran away.", "یک روز، جوجه اردک فرار کرد."),
                StoryParagraph("He could not bear the cruelty.", "او نمی‌توانست ظلم را تحمل کند."),
                StoryParagraph("He walked through the fields.", "از میان مزارع گذشت."),
                StoryParagraph("He came to a pond with wild ducks.", "به برکه‌ای با اردک‌های وحشی رسید."),
                StoryParagraph("The wild ducks were not friendly either.", "اردک‌های وحشی هم دوستانه نبودند."),
                StoryParagraph("He flew on to another pond.", "به برکه دیگری پرواز کرد."),
                StoryParagraph("He met some geese there.", "آنجا با چند غاز ملاقات کرد."),
                StoryParagraph("But hunters came and shot the geese.", "اما شکارچیان آمدند و غازها را زدند."),
                StoryParagraph("The duckling hid in the grass.", "جوجه اردک در علف‌ها پنهان شد."),
                StoryParagraph("He was alone and very scared.", "او تنها و خیلی ترسیده بود.")
            )),
            StoryChapter(4, "The Long Winter", "زمستان طولانی", listOf(
                StoryParagraph("Autumn came and the leaves fell.", "پاییز آمد و برگ‌ها ریختند."),
                StoryParagraph("The duckling found a small pond.", "جوجه اردک برکه کوچکی پیدا کرد."),
                StoryParagraph("The wind became cold and harsh.", "باد سرد و خشن شد."),
                StoryParagraph("He swam all day to stay warm.", "تمام روز شنا می‌کرد تا گرم بماند."),
                StoryParagraph("The water began to freeze.", "آب شروع به یخ زدن کرد."),
                StoryParagraph("One day, he got stuck in the ice.", "یک روز، در یخ گیر افتاد."),
                StoryParagraph("A kind farmer found him.", "کشاورز مهربانی پیدایش کرد."),
                StoryParagraph("He took him home and warmed him.", "او را به خانه برد و گرمش کرد."),
                StoryParagraph("But the duckling was still afraid.", "اما جوجه اردک هنوز ترسیده بود."),
                StoryParagraph("He ran away from the farm too.", "او از مزرعه هم فرار کرد.")
            )),
            StoryChapter(5, "The Spring", "بهار", listOf(
                StoryParagraph("Spring came and the snow melted.", "بهار آمد و برف ذوب شد."),
                StoryParagraph("The duckling came out of hiding.", "جوجه اردک از مخفیگاه بیرون آمد."),
                StoryParagraph("He found a beautiful garden.", "باغ زیبایی پیدا کرد."),
                StoryParagraph("There was a pond with three swans.", "برکه‌ای با سه قو بود."),
                StoryParagraph("The swans were white and elegant.", "قوها سفید و باوقار بودند."),
                StoryParagraph("The duckling felt ashamed of himself.", "جوجه اردک از خودش شرمنده شد."),
                StoryParagraph("He thought the swans would reject him too.", "فکر کرد قوها هم ردش می‌کنند."),
                StoryParagraph("But he decided to try anyway.", "اما تصمیم گرفت به هر حال تلاش کند."),
                StoryParagraph("He swam toward them slowly.", "آرام به سمتشان شنا کرد."),
                StoryParagraph("The swans welcomed him kindly.", "قوها مهربانانه استقبالش کردند.")
            )),
            StoryChapter(6, "The Truth", "حقیقت", listOf(
                StoryParagraph("The duckling looked at his reflection.", "جوجه اردک به انعکاسش نگاه کرد."),
                StoryParagraph("He was not a duckling anymore.", "او دیگر جوجه اردک نبود."),
                StoryParagraph("He was a beautiful white swan.", "او قوی سفید زیبایی بود."),
                StoryParagraph("His feathers were pure white.", "پرهایش کاملاً سفید بودند."),
                StoryParagraph("His neck was long and graceful.", "گردنش بلند و باوقار بود."),
                StoryParagraph("He had never been ugly at all.", "او اصلاً زشت نبود."),
                StoryParagraph("He had just been a different bird.", "او فقط پرنده متفاوتی بود."),
                StoryParagraph("The other swans explained the truth.", "قوهای دیگر حقیقت را توضیح دادند."),
                StoryParagraph("His egg had been laid by a swan.", "تخمش توسط قویی گذاشته شده بود."),
                StoryParagraph("He had always been a swan.", "او همیشه قو بوده است.")
            )),
            StoryChapter(7, "Happily Ever After", "خوشبختی همیشگی", listOf(
                StoryParagraph("The swans flew south for the winter.", "قوها برای زمستان به جنوب پرواز کردند."),
                StoryParagraph("The young swan flew with them.", "قوی جوان با آن‌ها پرواز کرد."),
                StoryParagraph("He was happy for the first time.", "او برای اولین بار خوشحال بود."),
                StoryParagraph("The children saw them in the park.", "بچه‌ها آن‌ها را در پارک دیدند."),
                StoryParagraph("They said he was the most beautiful.", "گفتند او زیباترین است."),
                StoryParagraph("He remembered his difficult past.", "گذشته دشوارش را به یاد آورد."),
                StoryParagraph("He felt grateful for his life.", "از زندگی‌اش سپاسگزار بود."),
                StoryParagraph("He had learned to accept himself.", "یاد گرفته بود خودش را بپذیرد."),
                StoryParagraph("He was happy to be who he was.", "خوشحال بود از اینکه کیست."),
                StoryParagraph("And so the ugly duckling found peace.", "و اینگونه جوجه اردک زشت آرامش یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۹: لباس جدید امپراتور
    // ═══════════════════════════════════════════════════════
    private fun story29() = StoryContent(
        storyId = "emperors_clothes",
        chapters = listOf(
            StoryChapter(1, "The Vain Emperor", "امپراتور خودپسند", listOf(
                StoryParagraph("An emperor loved beautiful clothes.", "امپراتوری عاشق لباس‌های زیبا بود."),
                StoryParagraph("He spent all his money on new outfits.", "تمام پولش را خرج لباس‌های جدید می‌کرد."),
                StoryParagraph("He changed clothes many times a day.", "روزی چند بار لباس عوض می‌کرد."),
                StoryParagraph("He did not care about his people.", "به مردمش اهمیت نمی‌داد."),
                StoryParagraph("He did not care about his kingdom.", "به پادشاهی‌اش اهمیت نمی‌داد."),
                StoryParagraph("He only cared about looking good.", "او فقط به خوب به نظر رسیدن اهمیت می‌داد."),
                StoryParagraph("One day, two strangers arrived.", "یک روز، دو غریبه رسیدند."),
                StoryParagraph("They said they were weavers.", "گفتند بافنده هستند."),
                StoryParagraph("They could make magic cloth.", "می‌توانستند پارچه جادویی بسازند.")
            )),
            StoryChapter(2, "The Magic Cloth", "پارچه جادویی", listOf(
                StoryParagraph("The weavers spoke to the emperor.", "بافنده‌ها با امپراتور صحبت کردند."),
                StoryParagraph("They said the cloth was special.", "گفتند پارچه خاص است."),
                StoryParagraph("It was invisible to stupid people.", "برای افراد احمق نامرئی بود."),
                StoryParagraph("Only clever people could see it.", "فقط افراد باهوش می‌توانستند ببینندش."),
                StoryParagraph("The emperor was very excited.", "امپراتور خیلی هیجان‌زده شد."),
                StoryParagraph("He wanted to be the cleverest of all.", "می‌خواست باهوش‌ترین همه باشد."),
                StoryParagraph("He paid them a lot of gold.", "او پول زیادی طلا به آن‌ها داد."),
                StoryParagraph("The weavers pretended to work.", "بافنده‌ها تظاهر کردند کار می‌کنند."),
                StoryParagraph("But they made nothing at all.", "اما اصلاً چیزی نمی‌ساختند.")
            )),
            StoryChapter(3, "The Old Minister", "وزیر پیر", listOf(
                StoryParagraph("The emperor sent his old minister.", "امپراتور وزیر پیرش را فرستاد."),
                StoryParagraph("He wanted to check on the cloth.", "می‌خواست پارچه را بررسی کند."),
                StoryParagraph("The minister saw nothing on the loom.", "وزیر چیزی روی دستگاه بافندگی ندید."),
                StoryParagraph("But he was afraid to say so.", "اما می‌ترسید بگوید."),
                StoryParagraph("He did not want to seem stupid.", "نمی‌خواست احمق به نظر برسد."),
                StoryParagraph("So he praised the cloth.", "پس پارچه را تحسین کرد."),
                StoryParagraph("He said it was the most beautiful.", "او گفت زیباترین است."),
                StoryParagraph("The emperor was very happy.", "امپراتور خیلی خوشحال شد."),
                StoryParagraph("He sent more officials to see it.", "مقامات بیشتری را برای دیدنش فرستاد."),
                StoryParagraph("They all lied about seeing it.", "همه درباره دیدنش دروغ گفتند.")
            )),
            StoryChapter(4, "The Emperor's Visit", "دیدار امپراتور", listOf(
                StoryParagraph("Finally, the emperor went to see the cloth.", "بالاخره، امپراتور برای دیدن پارچه رفت."),
                StoryParagraph("He saw nothing on the loom.", "روی دستگاه بافندگی چیزی ندید."),
                StoryParagraph("But he pretended to see it.", "اما تظاهر کرد می‌بیند."),
                StoryParagraph("He did not want to seem stupid.", "نمی‌خواست احمق به نظر برسد."),
                StoryParagraph("He praised the cloth loudly.", "پارچه را با صدای بلند تحسین کرد."),
                StoryParagraph("The weavers made him a new suit.", "بافنده‌ها لباس جدیدی برایش ساختند."),
                StoryParagraph("They pretended to dress him.", "تظاهر کردند لباسش می‌پوشانند."),
                StoryParagraph("They said the suit was very light.", "گفتند لباس خیلی سبک است."),
                StoryParagraph("The emperor walked in his pretend clothes.", "امپراتور با لباس ساختگی‌اش راه رفت.")
            )),
            StoryChapter(5, "The Parade", "رژه", listOf(
                StoryParagraph("The emperor went out for a parade.", "امپراتور برای رژه بیرون رفت."),
                StoryParagraph("He walked through the streets proudly.", "او با افتخار در خیابان‌ها راه رفت."),
                StoryParagraph("People saw he had no clothes.", "مردم دیدند لباسی ندارد."),
                StoryParagraph("But no one said anything.", "اما هیچ‌کس چیزی نگفت."),
                StoryParagraph("They did not want to seem stupid.", "نمی‌خواستند احمق به نظر برسند."),
                StoryParagraph("They all praised the beautiful suit.", "همه لباس زیبا را تحسین کردند."),
                StoryParagraph("The emperor felt very proud.", "امپراتور خیلی افتخار کرد."),
                StoryParagraph("The parade continued through the city.", "رژه در شهر ادامه یافت.")
            )),
            StoryChapter(6, "The Child's Voice", "صدای کودک", listOf(
                StoryParagraph("A small child was in the crowd.", "بچه کوچکی در جمعیت بود."),
                StoryParagraph("He looked at the emperor carefully.", "او با دقت به امپراتور نگاه کرد."),
                StoryParagraph("He did not understand the game.", "او بازی را نمی‌فهمید."),
                StoryParagraph("He spoke the simple truth.", "او حقیقت ساده را گفت."),
                StoryParagraph("He said: The emperor has no clothes!", "او گفت: امپراتور لباس ندارد!"),
                StoryParagraph("Everyone heard the child's voice.", "همه صدای کودک را شنیدند."),
                StoryParagraph("They began to whisper to each other.", "شروع کردند به نجوا کردن با هم."),
                StoryParagraph("Soon, everyone was saying the truth.", "به‌زودی، همه حقیقت را می‌گفتند."),
                StoryParagraph("The emperor realized the truth too.", "امپراتور هم حقیقت را فهمید."),
                StoryParagraph("But the parade was too far to stop.", "اما رژه برای توقف خیلی دور رفته بود.")
            )),
            StoryChapter(7, "The Lesson", "درس", listOf(
                StoryParagraph("The emperor went back to his palace.", "امپراتور به قصرش برگشت."),
                StoryParagraph("He felt ashamed and foolish.", "احساس شرم و حماقت کرد."),
                StoryParagraph("He learned a hard lesson.", "درسی سخت آموخت."),
                StoryParagraph("He had been fooled by greedy men.", "او توسط مردان حریص فریب خورده بود."),
                StoryParagraph("He had lied to himself and others.", "او به خود و دیگران دروغ گفته بود."),
                StoryParagraph("The people also learned a lesson.", "مردم هم درسی آموختند."),
                StoryParagraph("They should speak the truth always.", "باید همیشه حقیقت را بگویند."),
                StoryParagraph("Even when others are afraid.", "حتی وقتی دیگران می‌ترسند."),
                StoryParagraph("The emperor became a better ruler.", "امپراتور حاکم بهتری شد."),
                StoryParagraph("And so the story ends with wisdom.", "و اینگونه داستان با خرد پایان می‌یابد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۰: مرد نان‌زنجبیلی
    // ═══════════════════════════════════════════════════════
    private fun story30() = StoryContent(
        storyId = "gingerbread_man",
        chapters = listOf(
            StoryChapter(1, "The Baking", "پختن", listOf(
                StoryParagraph("An old woman lived in a small cottage.", "پیرزنی در کلبه‌ای کوچک زندگی می‌کرد."),
                StoryParagraph("She had no children.", "او بچه‌ای نداشت."),
                StoryParagraph("One day, she baked a gingerbread man.", "یک روز، مرد نان‌زنجبیلی پخت."),
                StoryParagraph("She made him with a smiling face.", "او را با صورت خندان درست کرد."),
                StoryParagraph("She used raisins for his eyes.", "از کشمش برای چشمانش استفاده کرد."),
                StoryParagraph("She used cherries for his buttons.", "از گیلاس برای دکمه‌هایش استفاده کرد."),
                StoryParagraph("She put him in the oven to bake.", "او را در فر گذاشت تا بپزد."),
                StoryParagraph("Soon, a delicious smell filled the house.", "به‌زودی، بوی خوشی خانه را پر کرد."),
                StoryParagraph("She opened the oven door.", "در فر را باز کرد."),
                StoryParagraph("Suddenly, the gingerbread man jumped out.", "ناگهان، مرد نان‌زنجبیلی بیرون پرید.")
            )),
            StoryChapter(2, "Run, Run!", "بدو، بدو!", listOf(
                StoryParagraph("The gingerbread man ran out the door.", "مرد نان‌زنجبیلی از در فرار کرد."),
                StoryParagraph("He shouted as he ran.", "وقتی می‌دوید فریاد زد."),
                StoryParagraph("Run, run, as fast as you can!", "بدو، بدو، هر چه سریع‌تر می‌توانی!"),
                StoryParagraph("You can't catch me, I'm the gingerbread man!", "نمی‌توانی مرا بگیری، من مرد نان‌زنجبیلی هستم!"),
                StoryParagraph("The old woman ran after him.", "پیرزن دنبالش دوید."),
                StoryParagraph("But she could not catch him.", "اما نتوانست بگیردش."),
                StoryParagraph("The gingerbread man laughed.", "مرد نان‌زنجبیلی خندید."),
                StoryParagraph("He kept running down the road.", "به دویدن در جاده ادامه داد."),
                StoryParagraph("He was very fast and proud.", "او خیلی سریع و مغرور بود.")
            )),
            StoryChapter(3, "The Cow", "گاو", listOf(
                StoryParagraph("The gingerbread man met a cow.", "مرد نان‌زنجبیلی با گاوی ملاقات کرد."),
                StoryParagraph("The cow wanted to eat him.", "گاو می‌خواست بخوردش."),
                StoryParagraph("The cow began to run after him.", "گاو شروع کرد به دویدن دنبالش."),
                StoryParagraph("But the gingerbread man was faster.", "اما مرد نان‌زنجبیلی سریع‌تر بود."),
                StoryParagraph("Run, run, as fast as you can!", "بدو، بدو، هر چه سریع‌تر می‌توانی!"),
                StoryParagraph("You can't catch me, I'm the gingerbread man!", "نمی‌توانی مرا بگیری، من مرد نان‌زنجبیلی هستم!"),
                StoryParagraph("The cow was tired and stopped.", "گاو خسته شد و ایستاد."),
                StoryParagraph("The gingerbread man laughed more.", "مرد نان‌زنجبیلی بیشتر خندید."),
                StoryParagraph("He was too clever for the cow.", "او برای گاو خیلی باهوش بود.")
            )),
            StoryChapter(4, "The Horse", "اسب", listOf(
                StoryParagraph("The gingerbread man met a horse.", "مرد نان‌زنجبیلی با اسبی ملاقات کرد."),
                StoryParagraph("The horse wanted to eat him.", "اسب می‌خواست بخوردش."),
                StoryParagraph("The horse began to run after him.", "اسب شروع کرد به دویدن دنبالش."),
                StoryParagraph("But the gingerbread man was faster.", "اما مرد نان‌زنجبیلی سریع‌تر بود."),
                StoryParagraph("Run, run, as fast as you can!", "بدو، بدو، هر چه سریع‌تر می‌توانی!"),
                StoryParagraph("You can't catch me, I'm the gingerbread man!", "نمی‌توانی مرا بگیری، من مرد نان‌زنجبیلی هستم!"),
                StoryParagraph("The horse gave up the chase.", "اسب تعقیب را رها کرد."),
                StoryParagraph("The gingerbread man kept running.", "مرد نان‌زنجبیلی به دویدن ادامه داد."),
                StoryParagraph("He thought he was the fastest.", "فکر می‌کرد سریع‌ترین است.")
            )),
            StoryChapter(5, "The Fox", "روباه", listOf(
                StoryParagraph("The gingerbread man met a fox.", "مرد نان‌زنجبیلی با روباهی ملاقات کرد."),
                StoryParagraph("The fox was very clever.", "روباه خیلی باهوش بود."),
                StoryParagraph("He did not run after the gingerbread man.", "او دنبال مرد نان‌زنجبیلی ندوید."),
                StoryParagraph("He sat and smiled at him.", "نشست و به او لبخند زد."),
                StoryParagraph("The gingerbread man was surprised.", "مرد نان‌زنجبیلی تعجب کرد."),
                StoryParagraph("The fox said he wanted to help.", "روباه گفت می‌خواهد کمک کند."),
                StoryParagraph("He offered to carry him across the river.", "پیشنهاد داد او را از رودخانه بگذراند."),
                StoryParagraph("The gingerbread man trusted him.", "مرد نان‌زنجبیلی به او اعتماد کرد."),
                StoryParagraph("He climbed on the fox's nose.", "روی بینی روباه بالا رفت."),
                StoryParagraph("Then on his head, then on his back.", "بعد روی سرش، بعد روی پشتش.")
            )),
            StoryChapter(6, "The Trick", "ترفند", listOf(
                StoryParagraph("The fox walked into the river.", "روباه وارد رودخانه شد."),
                StoryParagraph("The water got deeper and deeper.", "آب عمیق‌تر و عمیق‌تر شد."),
                StoryParagraph("The fox said: Jump on my head.", "روباه گفت: روی سرم بپر."),
                StoryParagraph("The gingerbread man jumped.", "مرد نان‌زنجبیلی پرید."),
                StoryParagraph("Then the fox said: Jump on my nose.", "بعد روباه گفت: روی بینی‌ام بپر."),
                StoryParagraph("The gingerbread man jumped again.", "مرد نان‌زنجبیلی دوباره پرید."),
                StoryParagraph("Suddenly, the fox threw him in the air.", "ناگهان، روباه او را در هوا پرت کرد."),
                StoryParagraph("He caught him in his mouth.", "او را در دهانش گرفت."),
                StoryParagraph("The gingerbread man was eaten in one bite.", "مرد نان‌زنجبیلی در یک گاز خورده شد."),
                StoryParagraph("And that was the end of him.", "و این پایانش بود.")
            )),
            StoryChapter(7, "The Lesson", "درس", listOf(
                StoryParagraph("The old woman was sad.", "پیرزن غمگین شد."),
                StoryParagraph("She had lost her gingerbread man.", "مرد نان‌زنجبیلی‌اش را از دست داده بود."),
                StoryParagraph("But she learned a lesson.", "اما درسی آموخت."),
                StoryParagraph("Pride comes before a fall.", "غرور پیش از سقوط می‌آید."),
                StoryParagraph("The gingerbread man was too proud.", "مرد نان‌زنجبیلی بیش از حد مغرور بود."),
                StoryParagraph("He thought he was the fastest.", "فکر می‌کرد سریع‌ترین است."),
                StoryParagraph("He trusted the wrong animal.", "به حیوان اشتباهی اعتماد کرد."),
                StoryParagraph("So he met a sad end.", "پس پایانی غمگین داشت."),
                StoryParagraph("But the story is still told today.", "اما داستان هنوز امروز گفته می‌شود."),
                StoryParagraph("Children learn to be careful from it.", "بچه‌ها از آن یاد می‌گیرند محتاط باشند.")
            ))
        )
    )
}