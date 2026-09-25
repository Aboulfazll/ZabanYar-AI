package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group9 — ۵ افسانه کمتر شناخته‌شده
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۴۱. رامپل‌استیلتسکین
 *  ۴۲. کفاش و الف‌ها
 *  ۴۳. شاهزاده قورباغه
 *  ۴۴. نوازندگان شهر بریمن
 *  ۴۵. سرباز قلعی ثابت‌قدم
 */
object Group9 {

    fun getAll(): List<StoryContent> = listOf(
        story41(), story42(), story43(), story44(), story45()
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۱: رامپل‌استیلتسکین
    // ═══════════════════════════════════════════════════════
    private fun story41() = StoryContent(
        storyId = "rumpelstiltskin",
        chapters = listOf(
            StoryChapter(1, "The Boastful Miller", "آسیابان لاف‌زن", listOf(
                StoryParagraph("A poor miller had a beautiful daughter.", "آسیابان فقیری دختر زیبایی داشت."),
                StoryParagraph("One day, he spoke to the king.", "یک روز، با پادشاه صحبت کرد."),
                StoryParagraph("He wanted to seem important.", "می‌خواست مهم به نظر برسد."),
                StoryParagraph("He said his daughter could spin straw into gold.", "گفت دخترش می‌تواند کاه را به طلا تبدیل کند."),
                StoryParagraph("The king was very interested.", "پادشاه خیلی علاقه‌مند شد."),
                StoryParagraph("He loved gold more than anything.", "او بیشتر از هر چیزی طلا را دوست داشت."),
                StoryParagraph("He called the girl to the palace.", "دختر را به قصر فراخواند."),
                StoryParagraph("He took her to a room full of straw.", "او را به اتاقی پر از کاه برد."),
                StoryParagraph("He said: Spin this into gold by morning.", "گفت: تا صبح این را به طلا تبدیل کن."),
                StoryParagraph("If she failed, she would die.", "اگر شکست می‌خورد، می‌مرد.")
            )),
            StoryChapter(2, "The Strange Helper", "کمک‌کننده عجیب", listOf(
                StoryParagraph("The girl sat alone in the room.", "دختر در اتاق تنها نشست."),
                StoryParagraph("She did not know what to do.", "نمی‌دانست چکار کند."),
                StoryParagraph("She began to cry softly.", "آرام شروع به گریه کرد."),
                StoryParagraph("Suddenly, the door opened.", "ناگهان، در باز شد."),
                StoryParagraph("A strange little man came in.", "مرد کوچک عجیبی داخل آمد."),
                StoryParagraph("He asked why she was crying.", "پرسید چرا گریه می‌کند."),
                StoryParagraph("She told him about the king's demand.", "درباره خواسته پادشاه به او گفت."),
                StoryParagraph("He said he could help her.", "او گفت می‌تواند کمکش کند."),
                StoryParagraph("But he wanted something in return.", "اما چیزی در عوض می‌خواست."),
                StoryParagraph("She gave him her necklace.", "گردنبندش را به او داد.")
            )),
            StoryChapter(3, "The Golden Straw", "کاه طلایی", listOf(
                StoryParagraph("The little man began to spin.", "مرد کوچک شروع به ریسیدن کرد."),
                StoryParagraph("The straw turned into gold.", "کاه به طلا تبدیل شد."),
                StoryParagraph("The room was filled with gold.", "اتاق پر از طلا شد."),
                StoryParagraph("By morning, all the straw was gold.", "تا صبح، تمام کاه طلا شده بود."),
                StoryParagraph("The little man disappeared.", "مرد کوچک ناپدید شد."),
                StoryParagraph("The king came in and was amazed.", "پادشاه داخل آمد و شگفت‌زده شد."),
                StoryParagraph("But he wanted more gold.", "اما طلای بیشتری می‌خواست."),
                StoryParagraph("He took her to a bigger room.", "او را به اتاق بزرگ‌تری برد."),
                StoryParagraph("It was filled with even more straw.", "پر از کاه بیشتری بود."),
                StoryParagraph("She had to spin it all into gold.", "باید همه را به طلا تبدیل می‌کرد.")
            )),
            StoryChapter(4, "The Second Night", "شب دوم", listOf(
                StoryParagraph("The girl sat in the bigger room alone.", "دختر در اتاق بزرگ‌تر تنها نشست."),
                StoryParagraph("She began to cry again.", "دوباره شروع به گریه کرد."),
                StoryParagraph("The little man appeared again.", "مرد کوچک دوباره ظاهر شد."),
                StoryParagraph("He asked what she would give him.", "پرسید چه به او می‌دهد."),
                StoryParagraph("She gave him her ring.", "حلقه‌اش را به او داد."),
                StoryParagraph("He spun all the straw into gold.", "تمام کاه را به طلا تبدیل کرد."),
                StoryParagraph("By morning, the room was full of gold.", "تا صبح، اتاق پر از طلا شده بود."),
                StoryParagraph("The king was delighted again.", "پادشاه دوباره خوشحال شد."),
                StoryParagraph("But he still wanted more.", "اما هنوز بیشتر می‌خواست."),
                StoryParagraph("He gave her one more night.", "یک شب دیگر به او داد.")
            )),
            StoryChapter(5, "The Promise", "قول", listOf(
                StoryParagraph("The third room was the biggest of all.", "اتاق سوم بزرگ‌ترین بود."),
                StoryParagraph("The girl had nothing left to give.", "دختر چیزی برای دادن نداشت."),
                StoryParagraph("The little man asked what she had.", "مرد کوچک پرسید چه دارد."),
                StoryParagraph("She said she had nothing.", "او گفت چیزی ندارد."),
                StoryParagraph("He asked for her first child.", "او اولین فرزندش را خواست."),
                StoryParagraph("She was shocked by the request.", "او از این درخواست شوکه شد."),
                StoryParagraph("But she promised to give it to him.", "اما قول داد به او بدهدش."),
                StoryParagraph("He spun all the straw into gold.", "او تمام کاه را به طلا تبدیل کرد."),
                StoryParagraph("The king was very happy.", "پادشاه خیلی خوشحال شد."),
                StoryParagraph("He married the girl the next day.", "روز بعد با دختر ازدواج کرد.")
            )),
            StoryChapter(6, "The Bargain", "معامله", listOf(
                StoryParagraph("A year later, the queen had a baby.", "یک سال بعد، ملکه بچه‌دار شد."),
                StoryParagraph("The little man came to the palace.", "مرد کوچک به قصر آمد."),
                StoryParagraph("He wanted the baby as promised.", "بچه را طبق قول می‌خواست."),
                StoryParagraph("The queen begged him to change his mind.", "ملکه التماس کرد نظرش را عوض کند."),
                StoryParagraph("She offered him all her gold.", "تمام طلایش را پیشنهاد داد."),
                StoryParagraph("But the little man did not want gold.", "اما مرد کوچک طلا نمی‌خواست."),
                StoryParagraph("He gave her a chance to keep the baby.", "فرصتی به او داد بچه را نگه دارد."),
                StoryParagraph("She had to guess his name in three days.", "باید در سه روز نامش را حدس می‌زد."),
                StoryParagraph("If she guessed it, she could keep the child.", "اگر حدس می‌زد، می‌توانست بچه را نگه دارد."),
                StoryParagraph("The queen agreed to try.", "ملکه موافقت کرد تلاش کند.")
            )),
            StoryChapter(7, "The Discovery", "کشف", listOf(
                StoryParagraph("The queen sent messengers everywhere.", "ملکه پیک‌ها را همه‌جا فرستاد."),
                StoryParagraph("They searched for strange names.", "دنبال نام‌های عجیب گشتند."),
                StoryParagraph("On the third day, a messenger found him.", "روز سوم، پیکی پیدایش کرد."),
                StoryParagraph("The little man was dancing in the woods.", "مرد کوچک در جنگل می‌رقصید."),
                StoryParagraph("He sang a song about his name.", "آهنگی درباره اسمش می‌خواند."),
                StoryParagraph("The messenger heard the song.", "پیک آهنگ را شنید."),
                StoryParagraph("He ran back to tell the queen.", "دوید تا به ملکه بگوید."),
                StoryParagraph("The queen was overjoyed.", "ملکه بی‌نهایت خوشحال شد."),
                StoryParagraph("The next day, she guessed the name.", "روز بعد، اسم را حدس زد."),
                StoryParagraph("She said: Rumpelstiltskin!", "او گفت: رامپل‌استیلتسکین!")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۲: کفاش و الف‌ها
    // ═══════════════════════════════════════════════════════
    private fun story42() = StoryContent(
        storyId = "elves_shoemaker",
        chapters = listOf(
            StoryChapter(1, "The Poor Shoemaker", "کفاش فقیر", listOf(
                StoryParagraph("A shoemaker lived in a small town.", "کفاشی در شهر کوچکی زندگی می‌کرد."),
                StoryParagraph("He was honest and hardworking.", "او صادق و سخت‌کوش بود."),
                StoryParagraph("But he was very poor.", "اما خیلی فقیر بود."),
                StoryParagraph("He had only enough leather for one pair of shoes.", "فقط چرم کافی برای یک جفت کفش داشت."),
                StoryParagraph("He cut the leather carefully.", "چرم را با دقت برید."),
                StoryParagraph("He planned to sew them the next morning.", "نقشه داشت صبح روز بعد بدوزدشان."),
                StoryParagraph("He left the leather on his work table.", "چرم را روی میز کارش گذاشت."),
                StoryParagraph("He went to bed tired and worried.", "خسته و نگران به رختخواب رفت."),
                StoryParagraph("He prayed for help before sleeping.", "قبل از خواب برای کمک دعا کرد."),
                StoryParagraph("He fell asleep quickly.", "سریع به خواب رفت.")
            )),
            StoryChapter(2, "The Morning Surprise", "شگفتی صبح", listOf(
                StoryParagraph("In the morning, the shoemaker woke up.", "صبح، کفاش بیدار شد."),
                StoryParagraph("He went to his work table.", "به سمت میز کارش رفت."),
                StoryParagraph("He saw a beautiful pair of shoes.", "یک جفت کفش زیبا دید."),
                StoryParagraph("They were perfectly made.", "کاملاً خوب ساخته شده بودند."),
                StoryParagraph("He could not believe his eyes.", "نمی‌توانست چشمانش را باور کند."),
                StoryParagraph("He had not made them himself.", "خودش نساخته بودشان."),
                StoryParagraph("A customer came into the shop.", "مشتری وارد مغازه شد."),
                StoryParagraph("He loved the shoes and bought them.", "کفش‌ها را دوست داشت و خرید."),
                StoryParagraph("He paid twice the normal price.", "دو برابر قیمت معمول پرداخت."),
                StoryParagraph("Now the shoemaker could buy more leather.", "حالا کفاش می‌توانست چرم بیشتری بخرد.")
            )),
            StoryChapter(3, "The Second Night", "شب دوم", listOf(
                StoryParagraph("The shoemaker cut leather for two pairs.", "کفاش چرم دو جفت را برید."),
                StoryParagraph("He left them on the table.", "آن‌ها را روی میز گذاشت."),
                StoryParagraph("He went to bed as before.", "مثل قبل به رختخواب رفت."),
                StoryParagraph("In the morning, two beautiful pairs were ready.", "صبح، دو جفت زیبا آماده بودند."),
                StoryParagraph("They were better than any he could make.", "بهتر از هر کدام که می‌توانست بسازد بودند."),
                StoryParagraph("He sold them quickly.", "سریع فروختشان."),
                StoryParagraph("Now he could buy leather for four pairs.", "حالا می‌توانست چرم چهار جفت بخرد."),
                StoryParagraph("He cut the leather and went to bed.", "چرم را برید و به رختخواب رفت."),
                StoryParagraph("In the morning, four pairs were ready.", "صبح، چهار جفت آماده بودند."),
                StoryParagraph("This happened every night.", "این هر شب اتفاق می‌افتاد.")
            )),
            StoryChapter(4, "The Curious Shoemaker", "کفاش کنجکاو", listOf(
                StoryParagraph("The shoemaker became rich.", "کفاش ثروتمند شد."),
                StoryParagraph("But he wanted to know who helped him.", "اما می‌خواست بداند چه کسی کمکش می‌کند."),
                StoryParagraph("He and his wife decided to watch.", "او و همسرش تصمیم گرفتند تماشا کنند."),
                StoryParagraph("They hid in the corner of the room.", "آن‌ها در گوشه اتاق پنهان شدند."),
                StoryParagraph("They left a candle burning.", "شمعی روشن گذاشتند."),
                StoryParagraph("At midnight, two tiny elves appeared.", "در نیمه‌شب، دو الف کوچک ظاهر شدند."),
                StoryParagraph("They were naked and barefoot.", "آن‌ها لخت و پابرهنه بودند."),
                StoryParagraph("They sat at the table and worked.", "پشت میز نشستند و کار کردند."),
                StoryParagraph("Their fingers moved very quickly.", "انگشتانشان خیلی سریع حرکت می‌کردند."),
                StoryParagraph("By dawn, all the shoes were finished.", "تا سپیده‌دم، همه کفش‌ها تمام شده بودند.")
            )),
            StoryChapter(5, "The Kind Wife", "همسر مهربان", listOf(
                StoryParagraph("The shoemaker's wife felt sorry for the elves.", "همسر کفاش برای الف‌ها دلسوزی کرد."),
                StoryParagraph("They worked naked in the cold.", "آن‌ها در سرما لخت کار می‌کردند."),
                StoryParagraph("She wanted to thank them.", "می‌خواست از آن‌ها تشکر کند."),
                StoryParagraph("She made tiny clothes for them.", "لباس‌های کوچکی برایشان دوخت."),
                StoryParagraph("She made tiny shoes and hats too.", "کفش و کلاه کوچک هم ساخت."),
                StoryParagraph("The shoemaker made the shoes himself.", "خود کفاش کفش‌ها را ساخت."),
                StoryParagraph("They left the gifts on the work table.", "هدیه‌ها را روی میز کار گذاشتند."),
                StoryParagraph("Then they hid to watch again.", "بعد دوباره پنهان شدند تا تماشا کنند."),
                StoryParagraph("At midnight, the elves appeared.", "در نیمه‌شب، الف‌ها ظاهر شدند."),
                StoryParagraph("They found the tiny clothes.", "لباس‌های کوچک را پیدا کردند.")
            )),
            StoryChapter(6, "The Elves' Joy", "شادی الف‌ها", listOf(
                StoryParagraph("The elves were very happy.", "الف‌ها خیلی خوشحال شدند."),
                StoryParagraph("They put on the tiny clothes.", "لباس‌های کوچک را پوشیدند."),
                StoryParagraph("They danced around the room.", "در اتاق دور خود چرخیدند."),
                StoryParagraph("They sang a happy song.", "آهنگ خوشحالی خواندند."),
                StoryParagraph("They said they would not come back.", "گفتند دیگر برنمی‌گردند."),
                StoryParagraph("They were too happy to work anymore.", "بیش از حد خوشحال بودند که کار کنند."),
                StoryParagraph("They jumped out the window.", "از پنجره بیرون پریدند."),
                StoryParagraph("They were never seen again.", "هرگز دوباره دیده نشدند."),
                StoryParagraph("But the shoemaker remembered them forever.", "اما کفاش برای همیشه به یادشان داشت."),
                StoryParagraph("He told the story to everyone.", "او داستان را به همه می‌گفت.")
            )),
            StoryChapter(7, "The Happy Ending", "پایان خوش", listOf(
                StoryParagraph("The shoemaker became very successful.", "کفاش خیلی موفق شد."),
                StoryParagraph("He and his wife lived comfortably.", "او و همسرش راحت زندگی کردند."),
                StoryParagraph("They never forgot the little elves.", "هرگز الف‌های کوچک را فراموش نکردند."),
                StoryParagraph("They helped other poor people.", "به فقرای دیگر کمک کردند."),
                StoryParagraph("They shared their good fortune.", "بخت خوبشان را تقسیم کردند."),
                StoryParagraph("Their shop became the best in town.", "مغازه‌شان بهترین در شهر شد."),
                StoryParagraph("People came from far away to buy shoes.", "مردم از دور برای خرید کفش می‌آمدند."),
                StoryParagraph("The shoemaker worked hard himself.", "خود کفاش سخت کار می‌کرد."),
                StoryParagraph("He was grateful for what he had.", "از آنچه داشت سپاسگزار بود."),
                StoryParagraph("And so kindness was rewarded in the end.", "و اینگونه مهربانی در نهایت پاداش یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۳: شاهزاده قورباغه
    // ═══════════════════════════════════════════════════════
    private fun story43() = StoryContent(
        storyId = "frog_prince",
        chapters = listOf(
            StoryChapter(1, "The Golden Ball", "توپ طلایی", listOf(
                StoryParagraph("A young princess lived in a palace.", "شاهزاده خانم جوانی در قصری زندگی می‌کرد."),
                StoryParagraph("Her father the king loved her very much.", "پدرش پادشاه خیلی دوستش داشت."),
                StoryParagraph("She had a golden ball.", "توپ طلایی داشت."),
                StoryParagraph("It was her favorite toy.", "اسباب‌بازی مورد علاقه‌اش بود."),
                StoryParagraph("One day, she played near a pond.", "یک روز، نزدیک برکه‌ای بازی کرد."),
                StoryParagraph("The ball fell into the deep water.", "توپ در آب عمیق افتاد."),
                StoryParagraph("The princess began to cry.", "شاهزاده خانم شروع به گریه کرد."),
                StoryParagraph("She did not know how to get it back.", "نمی‌دانست چطور پسش بگیرد."),
                StoryParagraph("Suddenly, a frog appeared.", "ناگهان، قورباغه‌ای ظاهر شد."),
                StoryParagraph("He asked why she was crying.", "پرسید چرا گریه می‌کند.")
            )),
            StoryChapter(2, "The Frog's Offer", "پیشنهاد قورباغه", listOf(
                StoryParagraph("The princess told him about the ball.", "شاهزاده خانم درباره توپ به او گفت."),
                StoryParagraph("The frog said he could get it.", "قورباغه گفت می‌تواند بگیردش."),
                StoryParagraph("But he wanted something in return.", "اما چیزی در عوض می‌خواست."),
                StoryParagraph("He wanted to be her friend.", "می‌خواست دوستش باشد."),
                StoryParagraph("He wanted to eat from her plate.", "می‌خواست از بشقابش غذا بخورد."),
                StoryParagraph("He wanted to sleep on her pillow.", "می‌خواست روی بالشش بخوابد."),
                StoryParagraph("The princess promised to do this.", "شاهزاده خانم قول داد این کار را بکند."),
                StoryParagraph("But she did not really mean it.", "اما واقعاً قصدش نبود."),
                StoryParagraph("The frog dove into the water.", "قورباغه در آب شیرجه زد."),
                StoryParagraph("He brought back the golden ball.", "توپ طلایی را برگرداند.")
            )),
            StoryChapter(3, "The Broken Promise", "قول شکسته", listOf(
                StoryParagraph("The princess took the ball and ran away.", "شاهزاده خانم توپ را گرفت و فرار کرد."),
                StoryParagraph("She forgot about the frog completely.", "قورباغه را کاملاً فراموش کرد."),
                StoryParagraph("The next day, she sat down for dinner.", "روز بعد، برای شام نشست."),
                StoryParagraph("Suddenly, she heard a knock on the door.", "ناگهان، صدای در را شنید."),
                StoryParagraph("The frog was standing outside.", "قورباغه بیرون ایستاده بود."),
                StoryParagraph("He asked to come in.", "خواست داخل بیاید."),
                StoryParagraph("The princess was embarrassed.", "شاهزاده خانم خجالت زده شد."),
                StoryParagraph("Her father the king asked what was wrong.", "پدرش پادشاه پرسید چه شده."),
                StoryParagraph("She told him the whole story.", "او تمام داستان را به او گفت."),
                StoryParagraph("The king said she must keep her promise.", "پادشاه گفت باید به قولش وفادار بماند.")
            )),
            StoryChapter(4, "The Frog at Dinner", "قورباغه در شام", listOf(
                StoryParagraph("The frog came to the dinner table.", "قورباغه به میز شام آمد."),
                StoryParagraph("He ate from the princess's plate.", "از بشقاب شاهزاده خانم غذا خورد."),
                StoryParagraph("The princess was disgusted.", "شاهزاده خانم چندشش شد."),
                StoryParagraph("But she did not say anything.", "اما چیزی نگفت."),
                StoryParagraph("After dinner, the frog wanted to sleep.", "بعد از شام، قورباغه می‌خواست بخوابد."),
                StoryParagraph("He wanted to sleep on her pillow.", "می‌خواست روی بالشش بخوابد."),
                StoryParagraph("The princess cried and refused.", "شاهزاده خانم گریه کرد و امتناع کرد."),
                StoryParagraph("The king reminded her of her promise.", "پادشاه قولش را یادش آورد."),
                StoryParagraph("She picked up the frog carefully.", "او قورباغه را با دقت برداشت."),
                StoryParagraph("She carried him to her room.", "او را به اتاقش برد.")
            )),
            StoryChapter(5, "The Transformation", "دگرگونی", listOf(
                StoryParagraph("The princess put the frog on her pillow.", "شاهزاده خانم قورباغه را روی بالشش گذاشت."),
                StoryParagraph("She lay down and tried to sleep.", "دراز کشید و تلاش کرد بخوابد."),
                StoryParagraph("In the morning, something strange happened.", "صبح، چیز عجیبی اتفاق افتاد."),
                StoryParagraph("The frog was not a frog anymore.", "قورباغه دیگر قورباغه نبود."),
                StoryParagraph("A handsome prince was lying there.", "شاهزاده خوش‌قیافه‌ای آنجا خوابیده بود."),
                StoryParagraph("The princess was shocked.", "شاهزاده خانم شوکه شد."),
                StoryParagraph("The prince told her his story.", "شاهزاده داستانش را به او گفت."),
                StoryParagraph("A wicked witch had turned him into a frog.", "جادوگر شیطانی او را به قورباغه تبدیل کرده بود."),
                StoryParagraph("Only a princess's kindness could break it.", "فقط مهربانی یک شاهزاده خانم می‌توانست بشکندش."),
                StoryParagraph("The spell was finally broken.", "افسون بالاخره شکسته شد.")
            )),
            StoryChapter(6, "The Wedding", "عروسی", listOf(
                StoryParagraph("The prince thanked the princess.", "شاهزاده از شاهزاده خانم تشکر کرد."),
                StoryParagraph("He asked her to marry him.", "از او خواست با او ازدواج کند."),
                StoryParagraph("She said yes with all her heart.", "او با تمام قلبش بله گفت."),
                StoryParagraph("The king was very happy.", "پادشاه خیلی خوشحال شد."),
                StoryParagraph("A great wedding was planned.", "عروسی بزرگی ترتیب داده شد."),
                StoryParagraph("Guests came from all over the kingdom.", "مهمانان از همه‌جای پادشاهی آمدند."),
                StoryParagraph("The prince's family came too.", "خانواده شاهزاده هم آمدند."),
                StoryParagraph("They had thought he was lost forever.", "فکر کرده بودند برای همیشه گم شده."),
                StoryParagraph("Everyone celebrated with joy.", "همه با شادی جشن گرفتند."),
                StoryParagraph("It was the happiest day of their lives.", "شادترین روز زندگی‌شان بود.")
            )),
            StoryChapter(7, "The Happy Ending", "پایان خوش", listOf(
                StoryParagraph("The prince and princess ruled together.", "شاهزاده و شاهزاده خانم با هم حکومت کردند."),
                StoryParagraph("They were kind to their people.", "با مردمشان مهربان بودند."),
                StoryParagraph("They never forgot the lesson they learned.", "هرگز درسی که یاد گرفتند را فراموش نکردند."),
                StoryParagraph("Promises must always be kept.", "قول‌ها همیشه باید نگه داشته شوند."),
                StoryParagraph("Kindness is always rewarded.", "مهربانی همیشه پاداش می‌گیرد."),
                StoryParagraph("They helped the poor and sick.", "به فقرا و بیماران کمک می‌کردند."),
                StoryParagraph("The kingdom became a happy place.", "پادشاهی تبدیل به جای خوشحالی شد."),
                StoryParagraph("Their children heard the story often.", "فرزندانشان اغلب داستان را می‌شنیدند."),
                StoryParagraph("And they lived happily ever after.", "و تا همیشه خوشحال زندگی کردند."),
                StoryParagraph("And so the frog prince found his home.", "و اینگونه شاهزاده قورباغه خانه‌اش را یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۴: نوازندگان شهر بریمن
    // ═══════════════════════════════════════════════════════
    private fun story44() = StoryContent(
        storyId = "bremen_musicians",
        chapters = listOf(
            StoryChapter(1, "The Old Donkey", "خر پیر", listOf(
                StoryParagraph("A donkey worked on a farm for many years.", "خری سال‌ها در مزرعه‌ای کار کرد."),
                StoryParagraph("He carried heavy loads every day.", "هر روز بارهای سنگین حمل می‌کرد."),
                StoryParagraph("Now he was old and weak.", "حالا پیر و ضعیف بود."),
                StoryParagraph("The farmer wanted to sell him.", "کشاورز می‌خواست بفروشدش."),
                StoryParagraph("The donkey heard about the plan.", "خر از نقشه باخبر شد."),
                StoryParagraph("He decided to run away.", "تصمیم گرفت فرار کند."),
                StoryParagraph("He wanted to go to the city of Bremen.", "می‌خواست به شهر بریمن برود."),
                StoryParagraph("He could become a musician there.", "می‌توانست آنجا نوازنده شود."),
                StoryParagraph("He started walking on the road.", "او در جاده شروع به راه رفتن کرد."),
                StoryParagraph("He felt free and hopeful.", "احساس آزادی و امید کرد.")
            )),
            StoryChapter(2, "The Old Dog", "سگ پیر", listOf(
                StoryParagraph("On the way, the donkey met a dog.", "در راه، خر با سگی ملاقات کرد."),
                StoryParagraph("The dog was old and tired.", "سگ پیر و خسته بود."),
                StoryParagraph("He was running away from his master too.", "او هم از اربابش فرار می‌کرد."),
                StoryParagraph("His master wanted to get rid of him.", "اربابش می‌خواست از شرش خلاص شود."),
                StoryParagraph("The donkey invited him to come along.", "خر دعوتش کرد که همراه بیاید."),
                StoryParagraph("They could be musicians together.", "می‌توانستند با هم نوازنده شوند."),
                StoryParagraph("The dog agreed happily.", "سگ با خوشحالی موافقت کرد."),
                StoryParagraph("They walked together toward Bremen.", "آن‌ها با هم به سمت بریمن راه رفتند."),
                StoryParagraph("They were both old but hopeful.", "هر دو پیر اما امیدوار بودند."),
                StoryParagraph("The road was long but they were free.", "جاده طولانی بود اما آزاد بودند.")
            )),
            StoryChapter(3, "The Old Cat", "گربه پیر", listOf(
                StoryParagraph("Soon they met an old cat.", "به‌زودی با گربه پیری ملاقات کردند."),
                StoryParagraph("She was sitting by the road.", "او کنار جاده نشسته بود."),
                StoryParagraph("She was sad and lonely.", "غمگین و تنها بود."),
                StoryParagraph("Her mistress wanted to drown her.", "بانویش می‌خواست غرقش کند."),
                StoryParagraph("She had caught no mice for years.", "سال‌ها موشی نگرفته بود."),
                StoryParagraph("The donkey invited her to join them.", "خر دعوتش کرد به آن‌ها بپیوندد."),
                StoryParagraph("They needed a good singer.", "به خواننده خوبی نیاز داشتند."),
                StoryParagraph("The cat agreed to come along.", "گربه موافقت کرد همراه بیاید."),
                StoryParagraph("She could sing very sweetly.", "او می‌توانست خیلی شیرین بخواند."),
                StoryParagraph("Now there were three travelers.", "حالا سه مسافر بودند.")
            )),
            StoryChapter(4, "The Old Rooster", "خروس پیر", listOf(
                StoryParagraph("They met an old rooster on a fence.", "با خروس پیری روی نرده‌ای ملاقات کردند."),
                StoryParagraph("He was crowing loudly and sadly.", "او با صدای بلند و غمگین بانگ می‌زد."),
                StoryParagraph("His owner wanted to cook him.", "صاحبش می‌خواست بپزدش."),
                StoryParagraph("The travelers invited him too.", "مسافران او را هم دعوت کردند."),
                StoryParagraph("They needed a singer with a strong voice.", "به خواننده‌ای با صدای قوی نیاز داشتند."),
                StoryParagraph("The rooster was very happy.", "خروس خیلی خوشحال شد."),
                StoryParagraph("He joined them immediately.", "بلافاصله به آن‌ها پیوست."),
                StoryParagraph("Now there were four musicians.", "حالا چهار نوازنده بودند."),
                StoryParagraph("They walked together toward Bremen.", "آن‌ها با هم به سمت بریمن راه رفتند."),
                StoryParagraph("They sang songs along the way.", "در راه آواز می‌خواندند.")
            )),
            StoryChapter(5, "The Robbers' House", "خانه دزدان", listOf(
                StoryParagraph("Night came and they were tired.", "شب آمد و خسته بودند."),
                StoryParagraph("They saw a light in the woods.", "نوری در جنگل دیدند."),
                StoryParagraph("It was a house with robbers inside.", "خانه‌ای بود که دزدان داخلش بودند."),
                StoryParagraph("The house was warm and full of food.", "خانه گرم و پر از غذا بود."),
                StoryParagraph("The animals wanted the house for themselves.", "حیوانات خانه را برای خودشان می‌خواستند."),
                StoryParagraph("They made a plan together.", "با هم نقشه‌ای کشیدند."),
                StoryParagraph("The donkey would put his front feet on the window.", "خر پاهای جلویش را روی پنجره می‌گذاشت."),
                StoryParagraph("The dog would climb on the donkey.", "سگ روی خر بالا می‌رفت."),
                StoryParagraph("The cat would climb on the dog.", "گربه روی سگ بالا می‌رفت."),
                StoryParagraph("The rooster would sit on top.", "خروس بالای همه می‌نشست.")
            )),
            StoryChapter(6, "The Scared Robbers", "دزدان ترسیده", listOf(
                StoryParagraph("All together, they made a terrible sound.", "همه با هم صدای وحشتناکی ساختند."),
                StoryParagraph("They jumped through the window.", "از پنجره پریدند داخل."),
                StoryParagraph("The robbers were terrified.", "دزدان وحشت کردند."),
                StoryParagraph("They ran away into the forest.", "به جنگل فرار کردند."),
                StoryParagraph("The animals had the house to themselves.", "حیوانات خانه را برای خودشان داشتند."),
                StoryParagraph("They ate the food and rested.", "غذا خوردند و استراحت کردند."),
                StoryParagraph("They decided to live there forever.", "تصمیم گرفتند برای همیشه آنجا زندگی کنند."),
                StoryParagraph("That night, one robber came back.", "آن شب، یکی از دزدان برگشت."),
                StoryParagraph("The cat scratched his face.", "گربه صورتش را چنگ زد."),
                StoryParagraph("The dog bit his leg and he ran away.", "سگ پایش را گاز گرفت و فرار کرد.")
            )),
            StoryChapter(7, "The Happy Home", "خانه خوش", listOf(
                StoryParagraph("The robber told his friends about the monsters.", "دزد درباره هیولاها به دوستانش گفت."),
                StoryParagraph("The robbers never came back.", "دزدان هرگز برنگشتند."),
                StoryParagraph("The four friends lived in the house.", "چهار دوست در خانه زندگی کردند."),
                StoryParagraph("They sang songs every evening.", "هر عصر آواز می‌خواندند."),
                StoryParagraph("They were happy together.", "با هم خوشحال بودند."),
                StoryParagraph("They never went to Bremen.", "هرگز به بریمن نرفتند."),
                StoryParagraph("But they did not need to.", "اما نیازی نداشتند."),
                StoryParagraph("They had found a home.", "خانه‌ای پیدا کرده بودند."),
                StoryParagraph("And they lived in peace forever.", "و برای همیشه در آرامش زندگی کردند."),
                StoryParagraph("And so the musicians found their place.", "و اینگونه نوازندگان جایشان را یافتند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۵: سرباز قلعی ثابت‌قدم
    // ═══════════════════════════════════════════════════════
    private fun story45() = StoryContent(
        storyId = "steadfast_tin_soldier",
        chapters = listOf(
            StoryChapter(1, "The Tin Soldier", "سرباز قلعی", listOf(
                StoryParagraph("A boy got twenty-five tin soldiers.", "پسری بیست و پنج سرباز قلعی گرفت."),
                StoryParagraph("They were all the same.", "همه‌شان یکسان بودند."),
                StoryParagraph("They were made from one tin spoon.", "از یک قاشق قلعی ساخته شده بودند."),
                StoryParagraph("But one was different.", "اما یکی متفاوت بود."),
                StoryParagraph("He had only one leg.", "او فقط یک پا داشت."),
                StoryParagraph("There was not enough tin for the second leg.", "قلع برای پای دوم کافی نبود."),
                StoryParagraph("But he stood as straight as the others.", "اما مثل دیگران صاف ایستاد."),
                StoryParagraph("The boy put them on a table.", "پسر آن‌ها را روی میزی گذاشت."),
                StoryParagraph("There was a paper castle on the table.", "قلعه کاغذی روی میز بود."),
                StoryParagraph("A paper ballerina danced in front of it.", "بالرینی کاغذی جلویش می‌رقصید.")
            )),
            StoryChapter(2, "The Ballerina", "بالرینا", listOf(
                StoryParagraph("The ballerina was very beautiful.", "بالرینا خیلی زیبا بود."),
                StoryParagraph("She wore a white dress.", "او لباس سفیدی پوشیده بود."),
                StoryParagraph("She had a rose on her chest.", "روی سینه‌اش رزی داشت."),
                StoryParagraph("She stood on one leg too.", "او هم روی یک پا ایستاده بود."),
                StoryParagraph("The tin soldier fell in love with her.", "سرباز قلعی عاشقش شد."),
                StoryParagraph("He thought they were the same.", "او فکر کرد آن‌ها یکسانند."),
                StoryParagraph("He watched her all day long.", "تمام روز تماشایش کرد."),
                StoryParagraph("He wanted to speak to her.", "می‌خواست با او صحبت کند."),
                StoryParagraph("But he could not move.", "اما نمی‌توانست حرکت کند."),
                StoryParagraph("He could only stand and look.", "او فقط می‌توانست بایستد و نگاه کند.")
            )),
            StoryChapter(3, "The Journey", "سفر", listOf(
                StoryParagraph("One day, the boy played with the soldiers.", "یک روز، پسر با سربازها بازی کرد."),
                StoryParagraph("He moved the tin soldier to the window.", "سرباز قلعی را به پنجره برد."),
                StoryParagraph("By accident, he dropped him.", "تصادفاً انداختش."),
                StoryParagraph("The soldier fell out of the window.", "سرباز از پنجره افتاد."),
                StoryParagraph("He landed on the ground below.", "روی زمین پایین فرود آمد."),
                StoryParagraph("Two boys found him on the street.", "دو پسر او را در خیابان پیدا کردند."),
                StoryParagraph("They put him in a paper boat.", "او را در قایق کاغذی گذاشتند."),
                StoryParagraph("They sent him down the river.", "او را در رودخانه فرستادند."),
                StoryParagraph("The soldier floated away alone.", "سرباز تنها شناور شد."),
                StoryParagraph("But he stood straight and brave.", "اما صاف و شجاع ایستاد.")
            )),
            StoryChapter(4, "In the Water", "در آب", listOf(
                StoryParagraph("The paper boat went down the river.", "قایق کاغذی در رودخانه پایین رفت."),
                StoryParagraph("The current was strong and fast.", "جریان قوی و سریع بود."),
                StoryParagraph("The soldier became wet but stood still.", "سرباز خیس شد اما بی‌حرکت ایستاد."),
                StoryParagraph("A big rat lived under the bridge.", "موش بزرگی زیر پل زندگی می‌کرد."),
                StoryParagraph("The rat demanded to see his passport.", "موش خواست پاسپورتش را ببیند."),
                StoryParagraph("The soldier had no passport.", "سرباز پاسپورت نداشت."),
                StoryParagraph("The rat tried to stop the boat.", "موش تلاش کرد قایق را متوقف کند."),
                StoryParagraph("But the boat went too fast.", "اما قایق خیلی سریع می‌رفت."),
                StoryParagraph("The water poured into the boat.", "آب داخل قایق ریخت."),
                StoryParagraph("The soldier began to sink.", "سرباز شروع به غرق شدن کرد.")
            )),
            StoryChapter(5, "The Fish", "ماهی", listOf(
                StoryParagraph("A big fish swallowed the tin soldier.", "ماهی بزرگی سرباز قلعی را بلعید."),
                StoryParagraph("It was dark inside the fish.", "داخل ماهی تاریک بود."),
                StoryParagraph("The soldier could not see anything.", "سرباز نمی‌توانست چیزی ببیند."),
                StoryParagraph("But he stayed calm and brave.", "اما آرام و شجاع ماند."),
                StoryParagraph("The fish was caught by a fisherman.", "ماهی توسط ماهیگیری گرفته شد."),
                StoryParagraph("It was taken to the market.", "آن را به بازار بردند."),
                StoryParagraph("A woman bought the fish for dinner.", "زنی ماهی را برای شام خرید."),
                StoryParagraph("She cut it open in the kitchen.", "آن را در آشپزخانه باز کرد."),
                StoryParagraph("The tin soldier was inside.", "سرباز قلعی داخلش بود."),
                StoryParagraph("She was very surprised.", "او خیلی تعجب کرد.")
            )),
            StoryChapter(6, "The Return", "بازگشت", listOf(
                StoryParagraph("The woman gave the soldier back to the boy.", "زن سرباز را به پسر برگرداند."),
                StoryParagraph("It was the same boy who owned him.", "همان پسری بود که صاحبش بود."),
                StoryParagraph("The boy put him back on the table.", "پسر او را به میز برگرداند."),
                StoryParagraph("The soldier saw the ballerina again.", "سرباز دوباره بالرینا را دید."),
                StoryParagraph("She was still standing on one leg.", "او هنوز روی یک پا ایستاده بود."),
                StoryParagraph("She had not forgotten him.", "او فراموشش نکرده بود."),
                StoryParagraph("The soldier was very happy.", "سرباز خیلی خوشحال شد."),
                StoryParagraph("He had traveled far and come home.", "او دور سفر کرده و به خانه برگشته بود."),
                StoryParagraph("He watched her with love.", "با عشق تماشایش کرد."),
                StoryParagraph("They were together again.", "دوباره با هم بودند.")
            )),
            StoryChapter(7, "The End", "پایان", listOf(
                StoryParagraph("One day, the boy threw the soldier in the fire.", "یک روز، پسر سرباز را در آتش انداخت."),
                StoryParagraph("He did not mean to do it.", "قصدش نبود."),
                StoryParagraph("But the soldier fell into the flames.", "اما سرباز در شعله‌ها افتاد."),
                StoryParagraph("He felt very hot.", "او خیلی گرم حس کرد."),
                StoryParagraph("But he stood straight and still.", "اما صاف و بی‌حرکت ایستاد."),
                StoryParagraph("He looked at the ballerina.", "او به بالرینا نگاه کرد."),
                StoryParagraph("Suddenly, a wind blew her into the fire too.", "ناگهان، بادی او را هم در آتش انداخت."),
                StoryParagraph("They burned together.", "آن‌ها با هم سوختند."),
                StoryParagraph("The next morning, only tin remained.", "صبح روز بعد، فقط قلع مانده بود."),
                StoryParagraph("It had melted into the shape of a heart.", "به شکل قلبی ذوب شده بود.")
            ))
        )
    )
}