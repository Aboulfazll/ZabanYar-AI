package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group5 — ۵ افسانه کلاسیک
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۲۱. سیندرلا
 *  ۲۲. سفیدبرفی
 *  ۲۳. زیبای خفته
 *  ۲۴. دیو و دلبر
 *  ۲۵. علاءالدین
 */
object Group5 {

    fun getAll(): List<StoryContent> = listOf(
        story21(), story22(), story23(), story24(), story25()
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۱: سیندرلا
    // ═══════════════════════════════════════════════════════
    private fun story21() = StoryContent(
        storyId = "cinderella",
        chapters = listOf(
            StoryChapter(1, "The Kind Girl", "دختر مهربان", listOf(
                StoryParagraph("Cinderella lived with her father and mother.", "سیندرلا با پدر و مادرش زندگی می‌کرد."),
                StoryParagraph("They were a happy family.", "خانواده خوشحالی بودند."),
                StoryParagraph("But her mother became very sick.", "اما مادرش خیلی مریض شد."),
                StoryParagraph("She died when Cinderella was young.", "او وقتی سیندرلا کوچک بود مرد."),
                StoryParagraph("Her father married again.", "پدرش دوباره ازدواج کرد."),
                StoryParagraph("The new wife had two daughters.", "همسر جدید دو دختر داشت."),
                StoryParagraph("They were mean and lazy.", "آن‌ها بدجنس و تنبل بودند."),
                StoryParagraph("They made Cinderella do all the work.", "آن‌ها سیندرلا را مجبور می‌کردند همه کار بکند."),
                StoryParagraph("She cooked, cleaned, and washed.", "او آشپزی، نظافت و شستشو می‌کرد."),
                StoryParagraph("But she never complained.", "اما هرگز شکایت نمی‌کرد.")
            )),
            StoryChapter(2, "The Invitation", "دعوت‌نامه", listOf(
                StoryParagraph("One day, a letter arrived at the house.", "یک روز، نامه‌ای به خانه رسید."),
                StoryParagraph("The King was having a ball.", "پادشاه مهمانی بالماسکه‌ای داشت."),
                StoryParagraph("His son, the Prince, wanted a wife.", "پسرش، شاهزاده، همسر می‌خواست."),
                StoryParagraph("All young women were invited.", "همه زنان جوان دعوت بودند."),
                StoryParagraph("The stepsisters were very excited.", "خواهرناتنی‌ها خیلی هیجان‌زده شدند."),
                StoryParagraph("They bought new dresses and shoes.", "لباس و کفش‌های جدید خریدند."),
                StoryParagraph("Cinderella also wanted to go.", "سیندرلا هم می‌خواست برود."),
                StoryParagraph("But her stepmother laughed at her.", "اما نامادری‌اش به او خندید."),
                StoryParagraph("She said Cinderella had no dress.", "او گفت سیندرلا لباس ندارد."),
                StoryParagraph("Cinderella had to stay home.", "سیندرلا مجبور بود خانه بماند.")
            )),
            StoryChapter(3, "The Fairy Godmother", "پری مهربان", listOf(
                StoryParagraph("Cinderella sat alone and cried.", "سیندرلا تنها نشست و گریه کرد."),
                StoryParagraph("Suddenly, an old woman appeared.", "ناگهان، پیرزنی ظاهر شد."),
                StoryParagraph("She was her fairy godmother.", "او پری مهربانش بود."),
                StoryParagraph("She asked why Cinderella was sad.", "او پرسید چرا سیندرلا غمگین است."),
                StoryParagraph("Cinderella told her about the ball.", "سیندرلا درباره مهمانی به او گفت."),
                StoryParagraph("The fairy waved her magic wand.", "پری با عصای جادویی‌اش تکان داد."),
                StoryParagraph("A pumpkin became a golden carriage.", "کدو تنبلی تبدیل به کالسکه‌ای طلایی شد."),
                StoryParagraph("Mice became horses and a coachman.", "موش‌ها اسب و کالسکه‌چی شدند."),
                StoryParagraph("Cinderella's rags became a beautiful dress.", "لباس‌های کهنه سیندرلا لباس زیبایی شد."),
                StoryParagraph("Glass slippers appeared on her feet.", "کفش‌های شیشه‌ای روی پاهایش ظاهر شد.")
            )),
            StoryChapter(4, "The Ball", "بالماسکه", listOf(
                StoryParagraph("The fairy warned her about midnight.", "پری درباره نیمه‌شب هشدارش داد."),
                StoryParagraph("At midnight, the magic would end.", "در نیمه‌شب، جادو تمام می‌شد."),
                StoryParagraph("Cinderella promised to return in time.", "سیندرلا قول داد به موقع برگردد."),
                StoryParagraph("She arrived at the palace.", "او به قصر رسید."),
                StoryParagraph("Everyone was amazed by her beauty.", "همه از زیبایی‌اش شگفت‌زده شدند."),
                StoryParagraph("The Prince could not take his eyes off her.", "شاهزاده نمی‌توانست چشم از او بردارد."),
                StoryParagraph("They danced all night together.", "آن‌ها تمام شب با هم رقصیدند."),
                StoryParagraph("Cinderella forgot about the time.", "سیندرلا زمان را فراموش کرد."),
                StoryParagraph("Suddenly, the clock began to strike twelve.", "ناگهان، ساعت شروع به زدن دوازده کرد."),
                StoryParagraph("She ran out of the palace quickly.", "او سریع از قصر فرار کرد.")
            )),
            StoryChapter(5, "The Lost Slipper", "کفش گمشده", listOf(
                StoryParagraph("As she ran, one glass slipper fell off.", "وقتی می‌دوید، یک کفش شیشه‌ای افتاد."),
                StoryParagraph("She had no time to pick it up.", "وقتی نداشت برش دارد."),
                StoryParagraph("The Prince found the slipper on the stairs.", "شاهزاده کفش را روی پله‌ها پیدا کرد."),
                StoryParagraph("He promised to find the girl who owned it.", "قول داد دختری که صاحبش است پیدا کند."),
                StoryParagraph("He sent messengers across the kingdom.", "پیک‌هایی در سراسر پادشاهی فرستاد."),
                StoryParagraph("Every young woman had to try on the slipper.", "هر زن جوان باید کفش را امتحان می‌کرد."),
                StoryParagraph("The stepsisters tried but it did not fit.", "خواهرناتنی‌ها امتحان کردند اما اندازه نبود."),
                StoryParagraph("Their feet were too big.", "پاهایشان خیلی بزرگ بود."),
                StoryParagraph("Finally, Cinderella tried it on.", "بالاخره، سیندرلا امتحانش کرد."),
                StoryParagraph("It fit her foot perfectly.", "کاملاً اندازه پایش بود.")
            )),
            StoryChapter(6, "The Wedding", "عروسی", listOf(
                StoryParagraph("The Prince recognized Cinderella.", "شاهزاده سیندرلا را شناخت."),
                StoryParagraph("He was very happy to find her.", "او از پیدا کردنش خیلی خوشحال شد."),
                StoryParagraph("He asked her to marry him.", "از او خواست با او ازدواج کند."),
                StoryParagraph("Cinderella said yes with joy.", "سیندرلا با خوشحالی بله گفت."),
                StoryParagraph("The stepmother and stepsisters were shocked.", "نامادری و خواهرناتنی‌ها شوکه شدند."),
                StoryParagraph("They asked for forgiveness.", "آن‌ها طلب بخشش کردند."),
                StoryParagraph("Cinderella forgave them.", "سیندرلا بخشیدشان."),
                StoryParagraph("The wedding was held in the palace.", "عروسی در قصر برگزار شد."),
                StoryParagraph("Everyone in the kingdom celebrated.", "همه در پادشاهی جشن گرفتند."),
                StoryParagraph("The fairy godmother watched with a smile.", "پری مهربان با لبخند تماشا کرد.")
            )),
            StoryChapter(7, "Happily Ever After", "خوشبختی همیشگی", listOf(
                StoryParagraph("Cinderella and the Prince lived in the palace.", "سیندرلا و شاهزاده در قصر زندگی کردند."),
                StoryParagraph("They loved each other very much.", "آن‌ها همدیگر را خیلی دوست داشتند."),
                StoryParagraph("Cinderella was kind to everyone.", "سیندرلا با همه مهربان بود."),
                StoryParagraph("She helped the poor and the sick.", "به فقرا و بیماران کمک می‌کرد."),
                StoryParagraph("The kingdom became a happy place.", "پادشاهی به جای خوشحالی تبدیل شد."),
                StoryParagraph("The stepsisters learned to be kind.", "خواهرناتنی‌ها یاد گرفتند مهربان باشند."),
                StoryParagraph("They married good men too.", "آن‌ها هم با مردان خوبی ازدواج کردند."),
                StoryParagraph("Cinderella never forgot her past.", "سیندرلا هرگز گذشته‌اش را فراموش نکرد."),
                StoryParagraph("She knew that kindness always wins.", "او می‌دانست مهربانی همیشه پیروز می‌شود."),
                StoryParagraph("And so they lived happily ever after.", "و اینگونه تا همیشه خوشحال زندگی کردند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۲: سفیدبرفی
    // ═══════════════════════════════════════════════════════
    private fun story22() = StoryContent(
        storyId = "snow_white",
        chapters = listOf(
            StoryChapter(1, "The Beautiful Princess", "شاهزاده زیبا", listOf(
                StoryParagraph("Snow White was a princess with skin like snow.", "سفیدبرفی شاهزاده‌ای با پوستی مثل برف بود."),
                StoryParagraph("Her hair was black as night.", "موهایش مثل شب سیاه بود."),
                StoryParagraph("Her lips were red as blood.", "لب‌هایش مثل خون قرمز بودند."),
                StoryParagraph("She was the most beautiful girl in the kingdom.", "او زیباترین دختر پادشاهی بود."),
                StoryParagraph("Her mother had died when she was young.", "مادرش وقتی کوچک بود مرد."),
                StoryParagraph("Her father married a new queen.", "پدرش با ملکه جدیدی ازدواج کرد."),
                StoryParagraph("The new queen was beautiful but evil.", "ملکه جدید زیبا اما شیطانی بود."),
                StoryParagraph("She had a magic mirror.", "آینه‌ای جادویی داشت."),
                StoryParagraph("Every day, she asked the mirror a question.", "هر روز سوالی از آینه می‌پرسید."),
                StoryParagraph("Who is the fairest of them all?", "زیباترین همه کیست؟")
            )),
            StoryChapter(2, "The Jealous Queen", "ملکه حسود", listOf(
                StoryParagraph("The mirror answered the queen for years.", "آینه سال‌ها به ملکه جواب می‌داد."),
                StoryParagraph("It said she was the fairest.", "می‌گفت او زیباترین است."),
                StoryParagraph("But one day, the answer changed.", "اما یک روز، جواب عوض شد."),
                StoryParagraph("The mirror said Snow White was fairest.", "آینه گفت سفیدبرفی زیباترین است."),
                StoryParagraph("The queen became very angry.", "ملکه خیلی عصبانی شد."),
                StoryParagraph("She was jealous of Snow White.", "به سفیدبرفی حسادت کرد."),
                StoryParagraph("She ordered a huntsman to kill her.", "به شکارچی دستور داد بکشدش."),
                StoryParagraph("She wanted Snow White's heart.", "قلب سفیدبرفی را می‌خواست."),
                StoryParagraph("The huntsman took Snow White to the forest.", "شکارچی سفیدبرفی را به جنگل برد."),
                StoryParagraph("But he could not kill her.", "اما نتوانست بکشدش.")
            )),
            StoryChapter(3, "The Forest", "جنگل", listOf(
                StoryParagraph("The huntsman told Snow White the truth.", "شکارچی حقیقت را به سفیدبرفی گفت."),
                StoryParagraph("He told her to run away.", "به او گفت فرار کند."),
                StoryParagraph("Snow White ran into the dark forest.", "سفیدبرفی در جنگل تاریک دوید."),
                StoryParagraph("She was afraid and alone.", "او ترسیده و تنها بود."),
                StoryParagraph("Animals came to comfort her.", "حیوانات برای دلداری‌اش آمدند."),
                StoryParagraph("Birds sang to keep her calm.", "پرندگان آواز خواندند تا آرامش کنند."),
                StoryParagraph("She walked all night long.", "تمام شب راه رفت."),
                StoryParagraph("In the morning, she found a small house.", "صبح، خانه کوچکی پیدا کرد."),
                StoryParagraph("It was the home of seven dwarfs.", "خانه هفت کوتوله بود."),
                StoryParagraph("She knocked on the door softly.", "آرام به در زد.")
            )),
            StoryChapter(4, "The Seven Dwarfs", "هفت کوتوله", listOf(
                StoryParagraph("The dwarfs were working in the mines.", "کوتوله‌ها در معدن کار می‌کردند."),
                StoryParagraph("They came home at night.", "شب به خانه برگشتند."),
                StoryParagraph("They found Snow White sleeping.", "سفیدبرفی را در خواب پیدا کردند."),
                StoryParagraph("They were surprised but kind.", "تعجب کردند اما مهربان بودند."),
                StoryParagraph("Snow White told them her story.", "سفیدبرفی داستانش را به آن‌ها گفت."),
                StoryParagraph("The dwarfs agreed to let her stay.", "کوتوله‌ها موافقت کردند بماند."),
                StoryParagraph("She would cook and clean for them.", "او برایشان آشپزی و نظافت می‌کرد."),
                StoryParagraph("They warned her about the queen.", "آن‌ها درباره ملکه هشدارش دادند."),
                StoryParagraph("They told her never to open the door.", "به او گفتند هرگز در را باز نکند."),
                StoryParagraph("Snow White promised to be careful.", "سفیدبرفی قول داد محتاط باشد.")
            )),
            StoryChapter(5, "The Poisoned Apple", "سیب سمی", listOf(
                StoryParagraph("The queen learned Snow White was alive.", "ملکه فهمید سفیدبرفی زنده است."),
                StoryParagraph("She used magic to change her face.", "با جادو صورتش را تغییر داد."),
                StoryParagraph("She looked like an old woman.", "شبیه پیرزنی به نظر می‌رسید."),
                StoryParagraph("She went to the dwarfs' house.", "به خانه کوتوله‌ها رفت."),
                StoryParagraph("She offered Snow White a red apple.", "سیب قرمزی به سفیدبرفی پیشنهاد داد."),
                StoryParagraph("The apple was poisoned.", "سیب سمی بود."),
                StoryParagraph("Snow White took one bite.", "سفیدبرفی یک گاز زد."),
                StoryParagraph("She fell to the ground immediately.", "بلافاصله روی زمین افتاد."),
                StoryParagraph("The queen laughed and left.", "ملکه خندید و رفت."),
                StoryParagraph("The dwarfs found Snow White cold and still.", "کوتوله‌ها سفیدبرفی را سرد و بی‌حرکت پیدا کردند.")
            )),
            StoryChapter(6, "The Prince's Kiss", "بوسه شاهزاده", listOf(
                StoryParagraph("The dwarfs were very sad.", "کوتوله‌ها خیلی غمگین شدند."),
                StoryParagraph("They did not bury Snow White.", "سفیدبرفی را دفن نکردند."),
                StoryParagraph("They put her in a glass coffin.", "او را در تابوتی شیشه‌ای گذاشتند."),
                StoryParagraph("Many days passed.", "روزهای زیادی گذشت."),
                StoryParagraph("One day, a prince came to the forest.", "یک روز، شاهزاده‌ای به جنگل آمد."),
                StoryParagraph("He saw Snow White in the coffin.", "سفیدبرفی را در تابوت دید."),
                StoryParagraph("He fell in love with her beauty.", "عاشق زیبایی‌اش شد."),
                StoryParagraph("He kissed her gently on the lips.", "آرام روی لب‌هایش بوسید."),
                StoryParagraph("The poison broke and Snow White woke up.", "سم شکست و سفیدبرفی بیدار شد."),
                StoryParagraph("She was alive again.", "او دوباره زنده بود.")
            )),
            StoryChapter(7, "The Happy Ending", "پایان خوش", listOf(
                StoryParagraph("Snow White married the prince.", "سفیدبرفی با شاهزاده ازدواج کرد."),
                StoryParagraph("They went to live in his castle.", "برای زندگی در قلعه‌اش رفتند."),
                StoryParagraph("The evil queen was punished.", "ملکه شیطانی مجازات شد."),
                StoryParagraph("She was sent away from the kingdom.", "او از پادشاهی رانده شد."),
                StoryParagraph("The seven dwarfs came to the wedding.", "هفت کوتوله به عروسی آمدند."),
                StoryParagraph("They danced and celebrated all night.", "تمام شب رقصیدند و جشن گرفتند."),
                StoryParagraph("Snow White visited them every year.", "سفیدبرفی هر سال به دیدنشان می‌رفت."),
                StoryParagraph("She never forgot their kindness.", "هرگز مهربانی‌شان را فراموش نکرد."),
                StoryParagraph("And so she lived happily ever after.", "و اینگونه تا همیشه خوشحال زندگی کرد."),
                StoryParagraph("Her story became a famous fairy tale.", "داستانش تبدیل به افسانه معروفی شد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۳: زیبای خفته
    // ═══════════════════════════════════════════════════════
    private fun story23() = StoryContent(
        storyId = "sleeping_beauty",
        chapters = listOf(
            StoryChapter(1, "The Royal Baby", "نوزاد سلطنتی", listOf(
                StoryParagraph("A king and queen had a baby girl.", "پادشاه و ملکه‌ای دختر بچه‌ای داشتند."),
                StoryParagraph("They were very happy.", "آن‌ها خیلی خوشحال بودند."),
                StoryParagraph("They named her Aurora.", "او را آرورا نامیدند."),
                StoryParagraph("They planned a big christening party.", "مهمانی بزرگ غسل تعمید ترتیب دادند."),
                StoryParagraph("They invited everyone in the kingdom.", "همه در پادشاهی را دعوت کردند."),
                StoryParagraph("There were seven fairies in the kingdom.", "هفت پری در پادشاهی بودند."),
                StoryParagraph("Six fairies came to bless the baby.", "شش پری برای برکت دادن بچه آمدند."),
                StoryParagraph("One fairy gave her beauty.", "یکی از پری‌ها به او زیبایی داد."),
                StoryParagraph("Another gave her a sweet voice.", "دیگری صدای شیرین داد."),
                StoryParagraph("Another gave her a kind heart.", "دیگری قلب مهربان داد.")
            )),
            StoryChapter(2, "The Curse", "نفرین", listOf(
                StoryParagraph("The seventh fairy was not invited.", "پری هفتم دعوت نشده بود."),
                StoryParagraph("She came to the party angry.", "او خشمگین به مهمانی آمد."),
                StoryParagraph("She cursed the baby princess.", "نوزاد شاهزاده را نفرین کرد."),
                StoryParagraph("She said Aurora would prick her finger.", "او گفت آرورا انگشتش را سوراخ می‌کند."),
                StoryParagraph("It would happen on her sixteenth birthday.", "در شانزدهمین سالروز تولدش اتفاق می‌افتاد."),
                StoryParagraph("Then she would die.", "بعد می‌مرد."),
                StoryParagraph("Everyone was terrified.", "همه وحشت کردند."),
                StoryParagraph("But one good fairy had not given her gift yet.", "اما پری خوبی هدیه‌اش را نداده بود."),
                StoryParagraph("She changed the curse.", "او نفرین را تغییر داد."),
                StoryParagraph("Aurora would sleep, not die.", "آرورا می‌خوابید، نه می‌مرد.")
            )),
            StoryChapter(3, "Growing Up", "بزرگ شدن", listOf(
                StoryParagraph("The king ordered all spindles destroyed.", "پادشاه دستور داد همه دوک‌ها نابود شوند."),
                StoryParagraph("No one was allowed to spin.", "هیچ‌کس اجازه نداشت ریسندگی کند."),
                StoryParagraph("Aurora grew up in the castle.", "آورورا در قلعه بزرگ شد."),
                StoryParagraph("She was kind and beautiful.", "او مهربان و زیبا بود."),
                StoryParagraph("She loved to sing and dance.", "عاشق آواز خواندن و رقصیدن بود."),
                StoryParagraph("On her sixteenth birthday, she explored the castle.", "در شانزدهمین سالروز تولدش قلعه را کاوش کرد."),
                StoryParagraph("She found a tower she had never seen.", "برجی پیدا کرد که هرگز ندیده بود."),
                StoryParagraph("Inside was an old woman spinning.", "داخلش پیرزنی می‌ریسید."),
                StoryParagraph("Aurora touched the spindle.", "آورورا دوک را لمس کرد."),
                StoryParagraph("She pricked her finger and fell asleep.", "انگشتش را سوراخ کرد و خوابید.")
            )),
            StoryChapter(4, "The Sleeping Castle", "قلعه خفته", listOf(
                StoryParagraph("The good fairy appeared immediately.", "پری خوب بلافاصله ظاهر شد."),
                StoryParagraph("She knew what had happened.", "او می‌دانست چه شده."),
                StoryParagraph("She put everyone in the castle to sleep.", "همه در قلعه را به خواب برد."),
                StoryParagraph("The king, the queen, and the servants slept.", "پادشاه، ملکه و خدمتکاران خوابیدند."),
                StoryParagraph("The cooks slept in the kitchen.", "آشپزها در آشپزخانه خوابیدند."),
                StoryParagraph("The horses slept in the stables.", "اسب‌ها در اصطبل خوابیدند."),
                StoryParagraph("The dogs slept in the yard.", "سگ‌ها در حیاط خوابیدند."),
                StoryParagraph("The fire stopped burning.", "آتش از سوختن ایستاد."),
                StoryParagraph("Thorns grew around the castle.", "خارها دور قلعه رشد کردند."),
                StoryParagraph("No one could enter.", "هیچ‌کس نمی‌توانست وارد شود.")
            )),
            StoryChapter(5, "A Hundred Years", "صد سال", listOf(
                StoryParagraph("Many years passed.", "سال‌های زیادی گذشت."),
                StoryParagraph("The story of the sleeping princess spread.", "داستان شاهزاده خفته پخش شد."),
                StoryParagraph("Many princes tried to enter the castle.", "شاهزاده‌های زیادی تلاش کردند وارد قلعه شوند."),
                StoryParagraph("But the thorns were too thick.", "اما خارها خیلی ضخیم بودند."),
                StoryParagraph("They could not get through.", "نمی‌توانستند عبور کنند."),
                StoryParagraph("One hundred years passed.", "صد سال گذشت."),
                StoryParagraph("The princess slept the whole time.", "شاهزاده تمام مدت خوابید."),
                StoryParagraph("She did not age at all.", "او اصلاً پیر نشد."),
                StoryParagraph("She stayed young and beautiful.", "او جوان و زیبا ماند."),
                StoryParagraph("And she dreamed of a prince.", "و خواب شاهزاده‌ای را می‌دید.")
            )),
            StoryChapter(6, "The Brave Prince", "شاهزاده شجاع", listOf(
                StoryParagraph("One day, a young prince came to the kingdom.", "یک روز، شاهزاده جوانی به پادشاهی آمد."),
                StoryParagraph("He heard the story of the sleeping princess.", "داستان شاهزاده خفته را شنید."),
                StoryParagraph("He decided to save her.", "تصمیم گرفت نجاتش دهد."),
                StoryParagraph("He walked to the castle.", "او به سمت قلعه رفت."),
                StoryParagraph("The thorns opened before him.", "خارها جلویش باز شدند."),
                StoryParagraph("He walked through the silent halls.", "از راهروهای ساکت گذشت."),
                StoryParagraph("He found the tower and climbed up.", "برج را پیدا کرد و بالا رفت."),
                StoryParagraph("He saw Aurora sleeping on a bed.", "آورورا را دید که روی تختی خوابیده."),
                StoryParagraph("She was the most beautiful girl he had seen.", "زیباترین دختری بود که دیده بود."),
                StoryParagraph("He bent down and kissed her.", "خم شد و بوسیدش.")
            )),
            StoryChapter(7, "The Awakening", "بیداری", listOf(
                StoryParagraph("Aurora opened her eyes.", "آورورا چشم‌هایش را باز کرد."),
                StoryParagraph("She saw the prince and smiled.", "شاهزاده را دید و لبخند زد."),
                StoryParagraph("Everyone in the castle woke up too.", "همه در قلعه هم بیدار شدند."),
                StoryParagraph("The fire started burning again.", "آتش دوباره شروع به سوختن کرد."),
                StoryParagraph("The cooks finished cooking.", "آشپزها پختن را تمام کردند."),
                StoryParagraph("The king and queen ran to their daughter.", "پادشاه و ملکه به سمت دخترشان دویدند."),
                StoryParagraph("Everyone was very happy.", "همه خیلی خوشحال بودند."),
                StoryParagraph("Aurora and the prince got married.", "آورورا و شاهزاده ازدواج کردند."),
                StoryParagraph("The kingdom celebrated for many days.", "پادشاهی روزهای زیادی جشن گرفت."),
                StoryParagraph("And they all lived happily ever after.", "و همه تا همیشه خوشحال زندگی کردند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۴: دیو و دلبر
    // ═══════════════════════════════════════════════════════
    private fun story24() = StoryContent(
        storyId = "beauty_beast",
        chapters = listOf(
            StoryChapter(1, "The Merchant's Daughter", "دختر تاجر", listOf(
                StoryParagraph("A rich merchant lived in a big city.", "تاجر ثروتمندی در شهر بزرگی زندگی می‌کرد."),
                StoryParagraph("He had three sons and three daughters.", "سه پسر و سه دختر داشت."),
                StoryParagraph("The youngest daughter was named Belle.", "کوچک‌ترین دختر بل نام داشت."),
                StoryParagraph("She was kind and beautiful.", "او مهربان و زیبا بود."),
                StoryParagraph("Her sisters were greedy and lazy.", "خواهرانش حریص و تنبل بودند."),
                StoryParagraph("Belle loved to read books.", "بل عاشق خواندن کتاب بود."),
                StoryParagraph("She took care of her father.", "از پدرش مراقبت می‌کرد."),
                StoryParagraph("One day, the merchant lost all his money.", "یک روز، تاجر تمام پولش را از دست داد."),
                StoryParagraph("The family had to move to a small house.", "خانواده مجبور شدند به خانه‌ای کوچک نقل مکان کنند."),
                StoryParagraph("Belle worked hard and never complained.", "بل سخت کار می‌کرد و هرگز شکایت نمی‌کرد.")
            )),
            StoryChapter(2, "The Lost Way", "راه گمشده", listOf(
                StoryParagraph("The merchant went on a long journey.", "تاجر به سفری طولانی رفت."),
                StoryParagraph("He wanted to find more business.", "می‌خواست تجارت بیشتری پیدا کند."),
                StoryParagraph("On the way back, he got lost.", "در راه برگشت، گم شد."),
                StoryParagraph("A terrible storm came.", "طوفان وحشتناکی آمد."),
                StoryParagraph("He found a strange castle in the woods.", "در جنگل قلعه‌ای عجیب پیدا کرد."),
                StoryParagraph("The gates were open and welcoming.", "دروازه‌ها باز و خوش‌آمدگو بودند."),
                StoryParagraph("He went inside to find shelter.", "داخل رفت تا پناه بگیرد."),
                StoryParagraph("There was food and fire for him.", "غذا و آتش برایش بود."),
                StoryParagraph("But no one was there.", "اما هیچ‌کس نبود."),
                StoryParagraph("He was very confused.", "او خیلی گیج شد.")
            )),
            StoryChapter(3, "The Beast", "دیو", listOf(
                StoryParagraph("The next morning, the merchant picked a rose.", "صبح روز بعد، تاجر رزی چید."),
                StoryParagraph("It was for his daughter Belle.", "برای دخترش بل بود."),
                StoryParagraph("Suddenly, a terrible beast appeared.", "ناگهان، دیو وحشتناکی ظاهر شد."),
                StoryParagraph("He was huge and fierce.", "او بزرگ و خشن بود."),
                StoryParagraph("The Beast was very angry.", "دیو خیلی عصبانی بود."),
                StoryParagraph("He said the merchant must pay for the rose.", "او گفت تاجر باید برای رز تاوان بدهد."),
                StoryParagraph("The merchant begged for forgiveness.", "تاجر طلب بخشش کرد."),
                StoryParagraph("The Beast said he could go free.", "دیو گفت آزاد می‌شود."),
                StoryParagraph("But only if one of his daughters came.", "اما فقط اگر یکی از دخترانش بیاید."),
                StoryParagraph("The merchant had to return home and decide.", "تاجر باید به خانه برمی‌گشت و تصمیم می‌گرفت.")
            )),
            StoryChapter(4, "Belle's Sacrifice", "فداکاری بل", listOf(
                StoryParagraph("The merchant returned home sadly.", "تاجر غمگین به خانه برگشت."),
                StoryParagraph("He told his children about the Beast.", "درباره دیو به فرزندانش گفت."),
                StoryParagraph("The older sisters refused to go.", "خواهران بزرگتر از رفتن امتناع کردند."),
                StoryParagraph("They said they were too scared.", "گفتند خیلی ترسیده‌اند."),
                StoryParagraph("But Belle offered to go.", "اما بل پیشنهاد داد برود."),
                StoryParagraph("She wanted to save her father.", "می‌خواست پدرش را نجات دهد."),
                StoryParagraph("She went to the castle alone.", "او تنها به قلعه رفت."),
                StoryParagraph("The Beast met her at the door.", "دیو دم در دیدارش کرد."),
                StoryParagraph("He was surprised by her kindness.", "از مهربانی‌اش تعجب کرد."),
                StoryParagraph("Belle was not afraid of him.", "بل از او نمی‌ترسید.")
            )),
            StoryChapter(5, "Life in the Castle", "زندگی در قلعه", listOf(
                StoryParagraph("Belle lived in the castle with the Beast.", "بل با دیو در قلعه زندگی کرد."),
                StoryParagraph("The castle was full of magic.", "قلعه پر از جادو بود."),
                StoryParagraph("The furniture could talk.", "مبلمان می‌توانستند صحبت کنند."),
                StoryParagraph("They became Belle's friends.", "آن‌ها دوستان بل شدند."),
                StoryParagraph("The Beast was kind to Belle.", "دیو با بل مهربان بود."),
                StoryParagraph("He gave her books and gifts.", "به او کتاب و هدیه می‌داد."),
                StoryParagraph("They had dinner together every night.", "هر شب با هم شام می‌خوردند."),
                StoryParagraph("He asked her to marry him every night.", "هر شب از او می‌خواست با او ازدواج کند."),
                StoryParagraph("Belle always said no.", "بل همیشه نه می‌گفت."),
                StoryParagraph("But she started to like him.", "اما شروع کرد به دوست داشتنش.")
            )),
            StoryChapter(6, "The Broken Heart", "قلب شکسته", listOf(
                StoryParagraph("One day, Belle saw her father in a magic mirror.", "یک روز، بل پدرش را در آینه‌ای جادویی دید."),
                StoryParagraph("He was very sick and sad.", "او خیلی مریض و غمگین بود."),
                StoryParagraph("Belle wanted to see him.", "بل می‌خواست ببیندش."),
                StoryParagraph("The Beast let her go for a week.", "دیو یک هفته رهایش کرد."),
                StoryParagraph("He gave her a magic ring to return.", "حلقه‌ای جادویی برای برگشتن داد."),
                StoryParagraph("Belle went home and cared for her father.", "بل به خانه رفت و از پدرش مراقبت کرد."),
                StoryParagraph("The week passed quickly.", "هفته سریع گذشت."),
                StoryParagraph("Her sisters were jealous and cruel.", "خواهرانش حسود و ظالم بودند."),
                StoryParagraph("They tried to keep her from returning.", "تلاش کردند مانع بازگشتش شوند."),
                StoryParagraph("But Belle knew she had to go back.", "اما بل می‌دانست باید برگردد.")
            )),
            StoryChapter(7, "The Transformation", "دگرگونی", listOf(
                StoryParagraph("Belle returned to the castle.", "بل به قلعه برگشت."),
                StoryParagraph("She found the Beast dying in the garden.", "دیو را در باغ در حال مرگ پیدا کرد."),
                StoryParagraph("He was very weak and sad.", "او خیلی ضعیف و غمگین بود."),
                StoryParagraph("Belle realized she loved him.", "بل فهمید دوستش دارد."),
                StoryParagraph("She told him she loved him.", "به او گفت دوستش دارد."),
                StoryParagraph("A great magic filled the air.", "جادوی بزرگی هوا را پر کرد."),
                StoryParagraph("The Beast transformed into a handsome prince.", "دیو به شاهزاده خوش‌قیافه‌ای تبدیل شد."),
                StoryParagraph("The curse was broken forever.", "نفرین برای همیشه شکسته شد."),
                StoryParagraph("Belle and the prince got married.", "بل و شاهزاده ازدواج کردند."),
                StoryParagraph("And they lived happily ever after.", "و تا همیشه خوشحال زندگی کردند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۵: علاءالدین
    // ═══════════════════════════════════════════════════════
    private fun story25() = StoryContent(
        storyId = "aladdin",
        chapters = listOf(
            StoryChapter(1, "The Poor Boy", "پسر فقیر", listOf(
                StoryParagraph("Aladdin was a poor boy in Arabia.", "علاءالدین پسر فقیری در عربستان بود."),
                StoryParagraph("He lived with his mother in a small house.", "او با مادرش در خانه‌ای کوچک زندگی می‌کرد."),
                StoryParagraph("They had very little money.", "پول خیلی کمی داشتند."),
                StoryParagraph("Aladdin liked to play in the streets.", "علاءالدین دوست داشت در خیابان‌ها بازی کند."),
                StoryParagraph("He did not like to work.", "دوست نداشت کار کند."),
                StoryParagraph("One day, a stranger came to him.", "یک روز، غریبه‌ای به سراغش آمد."),
                StoryParagraph("He said he was Aladdin's uncle.", "او گفت عموی علاءالدین است."),
                StoryParagraph("He gave Aladdin some gold.", "کمی طلا به علاءالدین داد."),
                StoryParagraph("Aladdin was happy.", "علاءالدین خوشحال شد."),
                StoryParagraph("But the stranger was not really his uncle.", "اما غریبه واقعاً عمویش نبود.")
            )),
            StoryChapter(2, "The Cave", "غار", listOf(
                StoryParagraph("The stranger took Aladdin far away.", "غریبه علاءالدین را دور برد."),
                StoryParagraph("They walked into the mountains.", "آن‌ها به کوه‌ها رفتند."),
                StoryParagraph("The stranger spoke magic words.", "غریبه کلمات جادویی گفت."),
                StoryParagraph("A stone door opened in the ground.", "در سنگی در زمین باز شد."),
                StoryParagraph("It led to a dark cave.", "به غاری تاریک منتهی می‌شد."),
                StoryParagraph("The stranger gave Aladdin a ring.", "غریبه حلقه‌ای به علاءالدین داد."),
                StoryParagraph("He told him to go inside.", "به او گفت داخل برود."),
                StoryParagraph("Aladdin found a magic lamp.", "علاءالدین چراغ جادویی پیدا کرد."),
                StoryParagraph("He brought it back to the door.", "آن را به در برگرداند."),
                StoryParagraph("But the stranger wanted it for himself.", "اما غریبه آن را برای خودش می‌خواست.")
            )),
            StoryChapter(3, "The Magic Lamp", "چراغ جادو", listOf(
                StoryParagraph("The stranger tried to take the lamp.", "غریبه تلاش کرد چراغ را بگیرد."),
                StoryParagraph("Aladdin refused to give it.", "علاءالدین از دادنش امتناع کرد."),
                StoryParagraph("The stranger got angry.", "غریبه عصبانی شد."),
                StoryParagraph("He said magic words and closed the cave.", "کلمات جادویی گفت و غار را بست."),
                StoryParagraph("Aladdin was trapped inside.", "علاءالدین داخل گیر افتاد."),
                StoryParagraph("He was very scared and alone.", "او خیلی ترسیده و تنها بود."),
                StoryParagraph("He rubbed the ring by accident.", "تصادفاً حلقه را مالید."),
                StoryParagraph("A genie appeared from the ring.", "جنّی از حلقه ظاهر شد."),
                StoryParagraph("The genie helped him escape.", "جن به فرارش کمک کرد."),
                StoryParagraph("Aladdin went home with the lamp.", "علاءالدین با چراغ به خانه رفت.")
            )),
            StoryChapter(4, "The First Wishes", "آرزوهای اول", listOf(
                StoryParagraph("Aladdin showed the lamp to his mother.", "علاءالدین چراغ را به مادرش نشان داد."),
                StoryParagraph("She rubbed it to clean it.", "او برای تمیز کردنش مالیدش."),
                StoryParagraph("A great genie appeared.", "جن بزرگی ظاهر شد."),
                StoryParagraph("He said he would obey the lamp's owner.", "او گفت از صاحب چراغ اطاعت می‌کند."),
                StoryParagraph("Aladdin asked for food.", "علاءالدین غذا خواست."),
                StoryParagraph("The genie brought a great feast.", "جن ضیافت بزرگی آورد."),
                StoryParagraph("They ate well for the first time.", "برای اولین بار خوب غذا خوردند."),
                StoryParagraph("Aladdin asked for gold and silver.", "علاءالدین طلا و نقره خواست."),
                StoryParagraph("Soon, they were rich.", "به‌زودی، ثروتمند شدند."),
                StoryParagraph("Aladdin became a gentleman.", "علاءالدین جنتلمن شد.")
            )),
            StoryChapter(5, "The Princess", "شاهزاده خانم", listOf(
                StoryParagraph("The Sultan's daughter was very beautiful.", "دختر سلطان خیلی زیبا بود."),
                StoryParagraph("Her name was Princess Jasmine.", "اسمش شاهزاده یاسمین بود."),
                StoryParagraph("Aladdin wanted to marry her.", "علاءالدین می‌خواست با او ازدواج کند."),
                StoryParagraph("He asked the genie for help.", "از جن کمک خواست."),
                StoryParagraph("The genie built a great palace.", "جن قصری بزرگ ساخت."),
                StoryParagraph("Aladdin sent gifts to the Sultan.", "علاءالدین هدایایی برای سلطان فرستاد."),
                StoryParagraph("The Sultan was very impressed.", "سلطان خیلی تحت تأثیر قرار گرفت."),
                StoryParagraph("He agreed to the marriage.", "او با ازدواج موافقت کرد."),
                StoryParagraph("Aladdin and Jasmine got married.", "علاءالدین و یاسمین ازدواج کردند."),
                StoryParagraph("They lived in the magic palace.", "آن‌ها در قصر جادویی زندگی کردند.")
            )),
            StoryChapter(6, "The Evil Magician", "جادوگر خبیث", listOf(
                StoryParagraph("The evil stranger returned.", "غریبه شیطانی برگشت."),
                StoryParagraph("He was really a powerful magician.", "او واقعاً جادوگر قدرتمندی بود."),
                StoryParagraph("He wanted the magic lamp.", "او چراغ جادویی را می‌خواست."),
                StoryParagraph("He traded new lamps for old ones.", "چراغ‌های نو را با کهنه عوض می‌کرد."),
                StoryParagraph("Jasmine traded the old lamp without knowing.", "یاسمین ندانسته چراغ کهنه را داد."),
                StoryParagraph("The magician took the lamp.", "جادوگر چراغ را گرفت."),
                StoryParagraph("He ordered the genie to move the palace.", "به جن دستور داد قصر را جابجا کند."),
                StoryParagraph("The palace disappeared with Jasmine inside.", "قصر با یاسمین داخلش ناپدید شد."),
                StoryParagraph("Aladdin was left alone and poor again.", "علاءالدین دوباره تنها و فقیر شد."),
                StoryParagraph("But he still had the magic ring.", "اما هنوز حلقه جادویی را داشت.")
            )),
            StoryChapter(7, "The Final Victory", "پیروزی نهایی", listOf(
                StoryParagraph("Aladdin used the ring's genie for help.", "علاءالدین از جن حلقه کمک خواست."),
                StoryParagraph("The genie took him to the palace.", "جن او را به قصر برد."),
                StoryParagraph("Aladdin found Jasmine.", "علاءالدین یاسمین را پیدا کرد."),
                StoryParagraph("He asked her to help him.", "از او خواست کمکش کند."),
                StoryParagraph("Jasmine put sleeping powder in the magician's drink.", "یاسمین پودر خواب در نوشیدنی جادوگر ریخت."),
                StoryParagraph("The magician fell asleep.", "جادوگر به خواب رفت."),
                StoryParagraph("Aladdin took the lamp back.", "علاءالدین چراغ را پس گرفت."),
                StoryParagraph("He ordered the genie to send the magician away.", "به جن دستور داد جادوگر را بفرستد."),
                StoryParagraph("The palace returned to its place.", "قصر به جایش برگشت."),
                StoryParagraph("And they lived happily ever after.", "و تا همیشه خوشحال زندگی کردند.")
            ))
        )
    )
}