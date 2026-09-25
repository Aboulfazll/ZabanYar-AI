package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group1 — ۵ داستان مبتدی
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۱. الماس آبی
 *  ۲. نوار خال‌دار
 *  ۳. اتحادیه سرخ‌موها
 *  ۴. طرح‌های فوق‌سری
 *  ۵. سگ باسکرویل
 */
object Group1 {

    fun getAll(): List<StoryContent> = listOf(
        story1(), story2(), story3(), story4(), story5()
    )

    // ═══════════════════════════════════════════════════════
    //  ۱: الماس آبی
    // ═══════════════════════════════════════════════════════
    private fun story1() = StoryContent(
        storyId = "sherlock_blue_diamond",
        chapters = listOf(
            StoryChapter(1, "The Old Hat", "کلاه کهنه", listOf(
                StoryParagraph("Holmes and Watson sat in their room.", "هلمز و واتسون در اتاقشان نشسته بودند."),
                StoryParagraph("It was a cold morning in London.", "صبح سردی در لندن بود."),
                StoryParagraph("A policeman came to see them.", "پلیسی به دیدنشان آمد."),
                StoryParagraph("He had an old hat and a diamond.", "او یک کلاه کهنه و یک الماس داشت."),
                StoryParagraph("He found them on the street.", "او آن‌ها را در خیابان پیدا کرده بود."),
                StoryParagraph("The hat belonged to Henry Baker.", "کلاه به هنری بیکر تعلق داشت."),
                StoryParagraph("The diamond was stolen from a hotel.", "الماس از هتلی دزدیده شده بود."),
                StoryParagraph("A servant named Horner was arrested.", "خدمتکاری به نام هورنر دستگیر شد."),
                StoryParagraph("But Holmes did not believe he was guilty.", "اما هلمز باور نمی‌کرد او گناهکار باشد."),
                StoryParagraph("He began to look at the hat carefully.", "او شروع کرد به دقت نگاه کردن به کلاه.")
            )),
            StoryChapter(2, "Reading the Clues", "خواندن سرنخ‌ها", listOf(
                StoryParagraph("The hat was old but very good quality.", "کلاه قدیمی اما باکیفیت بود."),
                StoryParagraph("So its owner was once rich.", "پس صاحبش زمانی ثروتمند بوده."),
                StoryParagraph("But now he could not buy a new one.", "اما حالا نمی‌توانست جدید بخرد."),
                StoryParagraph("The hat had a woman's hair on it.", "کلاه موی زنی رویش داشت."),
                StoryParagraph("So the man lived with a woman.", "پس مرد با زنی زندگی می‌کرد."),
                StoryParagraph("The dust on the hat was not London dust.", "گرد روی کلاه، گرد لندن نبود."),
                StoryParagraph("Watson was amazed by Holmes's thinking.", "واتسون از تفکر هلمز شگفت‌زده شد."),
                StoryParagraph("Holmes said it was simple logic.", "هلمز گفت منطق ساده است."),
                StoryParagraph("He asked the police to find Henry Baker.", "او از پلیس خواست هنری بیکر را پیدا کند."),
                StoryParagraph("He said he would solve the case.", "او گفت پرونده را حل می‌کند.")
            )),
            StoryChapter(3, "The Visitor", "مهمان", listOf(
                StoryParagraph("That evening, Henry Baker came to Baker Street.", "آن عصر، هنری بیکر به خیابان بیکر آمد."),
                StoryParagraph("He was a tall and quiet man.", "او مردی بلندقد و ساکت بود."),
                StoryParagraph("He was surprised to see his old hat.", "از دیدن کلاه کهنه‌اش تعجب کرد."),
                StoryParagraph("He said he had lost it the night before.", "او گفت شب قبل گمش کرده بود."),
                StoryParagraph("He had also lost a goose.", "او یک قاز هم گم کرده بود."),
                StoryParagraph("The goose was for his dinner.", "قاز برای شامش بود."),
                StoryParagraph("Holmes asked him where he bought it.", "هلمز پرسید کجا خریده بودش."),
                StoryParagraph("Baker said he bought it at a shop.", "بیکر گفت از مغازه‌ای خریده بود."),
                StoryParagraph("The shop was in Covent Garden.", "مغازه در کاونت گاردن بود."),
                StoryParagraph("Holmes now had a clue.", "هلمز حالا سرنخی داشت.")
            )),
            StoryChapter(4, "The Goose", "قاز", listOf(
                StoryParagraph("Holmes and Watson went to the shop.", "هلمز و واتسون به مغازه رفتند."),
                StoryParagraph("They met the owner, Mr. Breckinridge.", "آن‌ها با صاحبش، آقای برکینریج ملاقات کردند."),
                StoryParagraph("He was rude and did not want to help.", "او بی‌ادب بود و نمی‌خواست کمک کند."),
                StoryParagraph("Holmes used a clever trick on him.", "هلمز ترفند هوشمندانه‌ای رویش به کار برد."),
                StoryParagraph("He made a bet about the goose.", "او درباره قاز شرطی بست."),
                StoryParagraph("A young man came forward to argue.", "مرد جوانی جلو آمد تا بحث کند."),
                StoryParagraph("His name was James Ryder.", "اسمش جیمز رایدر بود."),
                StoryParagraph("He worked at the hotel where the diamond was lost.", "او در هتلی کار می‌کرد که الماس گم شده بود."),
                StoryParagraph("Holmes invited him to Baker Street.", "هلمز او را به خیابان بیکر دعوت کرد."),
                StoryParagraph("Ryder was nervous and afraid.", "رایدر مضطرب و ترسیده بود.")
            )),
            StoryChapter(5, "The Confession", "اعتراف", listOf(
                StoryParagraph("Ryder told Holmes the truth.", "رایدر حقیقت را به هلمز گفت."),
                StoryParagraph("He had stolen the diamond.", "او الماس را دزدیده بود."),
                StoryParagraph("He hid it inside a goose.", "آن را داخل قازی پنهان کرد."),
                StoryParagraph("He planned to take it home later.", "نقشه داشت بعداً به خانه ببردش."),
                StoryParagraph("But someone else bought the goose.", "اما شخص دیگری قاز را خرید."),
                StoryParagraph("Ryder lost the diamond by mistake.", "رایدر الماس را اشتباهاً از دست داد."),
                StoryParagraph("He was desperate to find it again.", "او برای پیدا کردن دوباره‌اش درمانده بود."),
                StoryParagraph("Holmes listened without anger.", "هلمز بدون خشم گوش داد."),
                StoryParagraph("He saw that Ryder was not a bad man.", "او دید رایدر مرد بدی نیست."),
                StoryParagraph("He was just weak and afraid.", "او فقط ضعیف و ترسیده بود.")
            )),
            StoryChapter(6, "The Decision", "تصمیم", listOf(
                StoryParagraph("Holmes decided to let Ryder go free.", "هلمز تصمیم گرفت رایدر را آزاد بگذارد."),
                StoryParagraph("He said Ryder had learned his lesson.", "او گفت رایدر درسش را گرفته."),
                StoryParagraph("He said Ryder would never steal again.", "او گفت رایدر هرگز دوباره دزدی نمی‌کند."),
                StoryParagraph("Ryder cried and promised to change.", "رایدر گریه کرد و قول داد تغییر کند."),
                StoryParagraph("He left London and went to another city.", "او لندن را ترک کرد و به شهر دیگری رفت."),
                StoryParagraph("He got a job and lived an honest life.", "شغلی گرفت و زندگی صادقانه‌ای داشت."),
                StoryParagraph("The diamond was returned to the Countess.", "الماس به کنتس برگردانده شد."),
                StoryParagraph("She was very happy to have it back.", "او از داشتن دوباره‌اش خیلی خوشحال شد."),
                StoryParagraph("She offered Holmes a large reward.", "او پاداش بزرگی به هلمز پیشنهاد داد."),
                StoryParagraph("But Holmes did not want money.", "اما هلمز پول نمی‌خواست.")
            )),
            StoryChapter(7, "The Final Lesson", "درس نهایی", listOf(
                StoryParagraph("Watson asked why Holmes let Ryder go.", "واتسون پرسید چرا هلمز رایدر را آزاد گذاشت."),
                StoryParagraph("Holmes said the man was not evil.", "هلمز گفت مرد شیطانی نبود."),
                StoryParagraph("Prison would not make him better.", "زندان بهترش نمی‌کرد."),
                StoryParagraph("But kindness might change him.", "اما مهربانی ممکن بود تغییرش دهد."),
                StoryParagraph("So Holmes gave him a chance.", "پس هلمز فرصتی به او داد."),
                StoryParagraph("Watson thought this was very generous.", "واتسون فکر کرد این خیلی بخشنده است."),
                StoryParagraph("Holmes said he tried to be fair.", "هلمز گفت تلاش می‌کند منصف باشد."),
                StoryParagraph("He wanted people to learn from mistakes.", "می‌خواست مردم از اشتباهات بیاموزند."),
                StoryParagraph("And so the case was closed.", "و اینگونه پرونده بسته شد."),
                StoryParagraph("Holmes went back to his quiet life.", "هلمز به زندگی آرامش بازگشت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲: نوار خال‌دار
    // ═══════════════════════════════════════════════════════
    private fun story2() = StoryContent(
        storyId = "sherlock_speckled_band",
        chapters = listOf(
            StoryChapter(1, "The Frightened Woman", "زن ترسیده", listOf(
                StoryParagraph("A young woman came to Baker Street.", "زن جوانی به خیابان بیکر آمد."),
                StoryParagraph("Her name was Helen Stoner.", "اسمش هلن استونر بود."),
                StoryParagraph("She was pale and very afraid.", "او رنگ‌پریده و خیلی ترسیده بود."),
                StoryParagraph("Her sister Julia had died two years ago.", "خواهرش جولیا دو سال پیش مرده بود."),
                StoryParagraph("Julia died in a very strange way.", "جولیا به شکل عجیبی مرده بود."),
                StoryParagraph("She said something about a band.", "او چیزی درباره نواری گفته بود."),
                StoryParagraph("Helen was now engaged to be married.", "هلن حالا نامزد ازدواج بود."),
                StoryParagraph("But she was afraid she would die too.", "اما می‌ترسید او هم بمیرد."),
                StoryParagraph("Her stepfather was Dr. Roylott.", "ناپدری‌اش دکتر رویلوت بود."),
                StoryParagraph("He was a violent and cruel man.", "او مردی خشن و ظالم بود.")
            )),
            StoryChapter(2, "The Old House", "خانه قدیمی", listOf(
                StoryParagraph("The family lived at Stoke Moran.", "خانواده در استوک موران زندگی می‌کردند."),
                StoryParagraph("It was an old and lonely house.", "خانه‌ای قدیمی و دورافتاده بود."),
                StoryParagraph("There were strange animals on the property.", "حیوانات عجیبی در ملک بودند."),
                StoryParagraph("A cheetah and a baboon lived there.", "یوزپلنگ و بابونی آنجا زندگی می‌کردند."),
                StoryParagraph("Helen heard strange sounds at night.", "هلن شب‌ها صداهای عجیبی می‌شنید."),
                StoryParagraph("She heard whistling in the dark.", "او در تاریکی صدای سوت می‌شنید."),
                StoryParagraph("She had moved into her sister's old room.", "او به اتاق قدیمی خواهرش نقل مکان کرده بود."),
                StoryParagraph("She felt something was very wrong.", "احساس می‌کرد چیزی خیلی اشتباه است."),
                StoryParagraph("Holmes listened carefully to her story.", "هلمز با دقت به داستانش گوش داد."),
                StoryParagraph("He promised to help her find the truth.", "او قول داد کمکش کند حقیقت را پیدا کند.")
            )),
            StoryChapter(3, "The Investigation", "تحقیق", listOf(
                StoryParagraph("Holmes went to Stoke Moran with Watson.", "هلمز با واتسون به استوک موران رفت."),
                StoryParagraph("Dr. Roylott met them at the door.", "دکتر رویلوت دم در دیدارشان کرد."),
                StoryParagraph("He was angry and rude to them.", "او با آن‌ها عصبانی و بی‌ادب بود."),
                StoryParagraph("But Holmes did not care.", "اما هلمز اهمیت نداد."),
                StoryParagraph("He examined the house carefully.", "او خانه را با دقت بررسی کرد."),
                StoryParagraph("The rooms were strangely connected.", "اتاق‌ها به شکل عجیبی به هم وصل بودند."),
                StoryParagraph("There was a ventilator in the wall.", "دریچه‌ای در دیوار بود."),
                StoryParagraph("There was also a bell rope that did nothing.", "طناب زنگی هم بود که کاری نمی‌کرد."),
                StoryParagraph("The bed was fixed to the floor.", "تخت به زمین ثابت شده بود."),
                StoryParagraph("Holmes noticed all these strange things.", "هلمز همه این چیزهای عجیب را متوجه شد.")
            )),
            StoryChapter(4, "The Hidden Truth", "حقیقت پنهان", listOf(
                StoryParagraph("Holmes found a small saucer of milk.", "هلمز نعلبکی کوچکی از شیر پیدا کرد."),
                StoryParagraph("He asked Helen about it.", "او از هلن درباره‌اش پرسید."),
                StoryParagraph("She said her stepfather kept a snake.", "او گفت ناپدری‌اش ماری نگه می‌دارد."),
                StoryParagraph("Holmes found a small hole in the wall.", "هلمز سوراخ کوچکی در دیوار پیدا کرد."),
                StoryParagraph("It led into Roylott's room.", "به اتاق رویلوت منتهی می‌شد."),
                StoryParagraph("Now Holmes understood the plan.", "حالا هلمز نقشه را فهمید."),
                StoryParagraph("Roylott was sending the snake through the wall.", "رویلوت مار را از دیوار می‌فرستاد."),
                StoryParagraph("The snake crawled down the bell rope.", "مار از طناب زنگ پایین می‌خزید."),
                StoryParagraph("It bit the girl sleeping in the bed.", "دختر خوابیده در تخت را می‌گزید."),
                StoryParagraph("Then it returned to him.", "بعد به سمت او برمی‌گشت.")
            )),
            StoryChapter(5, "The Night Watch", "نگهبانی شب", listOf(
                StoryParagraph("Holmes told Helen to leave that night.", "هلمز به هلن گفت آن شب برود."),
                StoryParagraph("He said he would stay in her room.", "او گفت در اتاقش می‌ماند."),
                StoryParagraph("He and Watson waited in the dark.", "او و واتسون در تاریکی منتظر ماندند."),
                StoryParagraph("They had no light and made no sound.", "آن‌ها نوری نداشتند و صدایی نمی‌کردند."),
                StoryParagraph("Hours passed slowly.", "ساعت‌ها آرام گذشتند."),
                StoryParagraph("Then they heard a small sound.", "بعد صدای کوچکی شنیدند."),
                StoryParagraph("Something was moving in the wall.", "چیزی در دیوار حرکت می‌کرد."),
                StoryParagraph("Holmes struck a match to see.", "هلمز کبریتی روشن کرد تا ببیند."),
                StoryParagraph("A snake was coming through the hole.", "ماری از سوراخ بیرون می‌آمد."),
                StoryParagraph("It was a swamp adder from India.", "افعی باتلاقی از هند بود.")
            )),
            StoryChapter(6, "The Deadly End", "پایان مرگبار", listOf(
                StoryParagraph("Holmes hit the snake with his cane.", "هلمز با عصایش به مار زد."),
                StoryParagraph("The snake turned and went back.", "مار چرخید و برگشت."),
                StoryParagraph("It went back into Roylott's room.", "به اتاق رویلوت برگشت."),
                StoryParagraph("Moments later, they heard a scream.", "لحظاتی بعد، جیغی شنیدند."),
                StoryParagraph("They ran to the doctor's room.", "آن‌ها به اتاق دکتر دویدند."),
                StoryParagraph("Dr. Roylott was dying on the floor.", "دکتر رویلوت روی زمین در حال مرگ بود."),
                StoryParagraph("The snake had bitten him.", "مار او را گزیده بود."),
                StoryParagraph("He died in terrible pain.", "او با دردی وحشتناک مرد."),
                StoryParagraph("The snake was caught and killed.", "مار گرفته و کشته شد."),
                StoryParagraph("Helen was safe at last.", "هلن بالاخره در امان بود.")
            )),
            StoryChapter(7, "The End", "پایان", listOf(
                StoryParagraph("Holmes explained everything to the police.", "هلمز همه چیز را به پلیس توضیح داد."),
                StoryParagraph("Roylott had planned both murders.", "رویلوت هر دو قتل را نقشه کشیده بود."),
                StoryParagraph("He wanted his stepdaughters' money.", "او پول دخترخوانده‌هایش را می‌خواست."),
                StoryParagraph("He had trained the snake to kill.", "او مار را برای کشتن آموزش داده بود."),
                StoryParagraph("But the snake turned against him.", "اما مار علیه خودش شد."),
                StoryParagraph("He was killed by his own weapon.", "او با سلاح خودش کشته شد."),
                StoryParagraph("Helen married her fiancé soon after.", "هلن خیلی زود با نامزدش ازدواج کرد."),
                StoryParagraph("She lived a happy and safe life.", "او زندگی خوش و امنی داشت."),
                StoryParagraph("And so the case was closed.", "و اینگونه پرونده بسته شد."),
                StoryParagraph("Holmes waited for the next adventure.", "هلمز منتظر ماجرای بعدی ماند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳: اتحادیه سرخ‌موها
    // ═══════════════════════════════════════════════════════
    private fun story3() = StoryContent(
        storyId = "sherlock_red_headed",
        chapters = listOf(
            StoryChapter(1, "The Strange Job", "کار عجیب", listOf(
                StoryParagraph("A man came to see Holmes one day.", "مردی یک روز به دیدن هلمز آمد."),
                StoryParagraph("His name was Jabez Wilson.", "اسمش جابز ویلسون بود."),
                StoryParagraph("He was a red-headed man.", "او مردی سرخ‌مو بود."),
                StoryParagraph("He owned a small shop.", "مغازه کوچکی داشت."),
                StoryParagraph("His shop was not doing well.", "مغازه‌اش خوب کار نمی‌کرد."),
                StoryParagraph("One day, his assistant showed him an ad.", "یک روز، دستیارش آگهی‌ای به او نشان داد."),
                StoryParagraph("The ad was for a strange job.", "آگهی برای شغل عجیبی بود."),
                StoryParagraph("The job was only for red-headed men.", "شغل فقط برای مردان سرخ‌مو بود."),
                StoryParagraph("The pay was very good.", "دستمزد خیلی خوب بود."),
                StoryParagraph("Wilson applied and got the job.", "ویلسون درخواست داد و شغل را گرفت.")
            )),
            StoryChapter(2, "The Copying Work", "کار کپی", listOf(
                StoryParagraph("Wilson's job was to copy pages.", "کار ویلسون کپی کردن صفحه‌ها بود."),
                StoryParagraph("He worked from ten to two every day.", "هر روز از ده تا دو کار می‌کرد."),
                StoryParagraph("He was paid four pounds a week.", "هفته‌ای چهار پوند می‌گرفت."),
                StoryParagraph("The work was boring but easy.", "کار خسته‌کننده اما راحت بود."),
                StoryParagraph("Wilson was very happy.", "ویلسون خیلی خوشحال بود."),
                StoryParagraph("He worked there for eight weeks.", "هشت هفته آنجا کار کرد."),
                StoryParagraph("The assistant's name was Spaulding.", "اسم دستیار اسپالدینگ بود."),
                StoryParagraph("Spaulding worked for low pay.", "اسپالدینگ با دستمزد کم کار می‌کرد."),
                StoryParagraph("He spent hours in the basement.", "او ساعت‌ها در زیرزمین می‌گذراند."),
                StoryParagraph("He said he was developing photos.", "می‌گفت عکس‌ها را ظاهر می‌کند.")
            )),
            StoryChapter(3, "The League Dissolves", "انحلال اتحادیه", listOf(
                StoryParagraph("One morning, the office was closed.", "یک صبح، دفتر بسته بود."),
                StoryParagraph("A sign said the league was dissolved.", "تابلویی گفت اتحادیه منحل شده."),
                StoryParagraph("Wilson was shocked and confused.", "ویلسون شوکه و گیج شد."),
                StoryParagraph("He came to Holmes for help.", "او برای کمک به هلمز آمد."),
                StoryParagraph("Holmes listened carefully.", "هلمز با دقت گوش داد."),
                StoryParagraph("He asked about Wilson's assistant.", "او درباره دستیار ویلسون پرسید."),
                StoryParagraph("He asked about the shop's location.", "درباره موقعیت مغازه پرسید."),
                StoryParagraph("The shop was near a bank.", "مغازه نزدیک بانکی بود."),
                StoryParagraph("Holmes became suspicious.", "هلمز مشکوک شد."),
                StoryParagraph("He went to see the shop that day.", "او آن روز به دیدن مغازه رفت.")
            )),
            StoryChapter(4, "The Real Identity", "هویت واقعی", listOf(
                StoryParagraph("Holmes knocked on the shop door.", "هلمز به در مغازه زد."),
                StoryParagraph("A young man opened the door.", "مرد جوانی در را باز کرد."),
                StoryParagraph("It was Vincent Spaulding.", "وینسنت اسپالدینگ بود."),
                StoryParagraph("Holmes pretended to ask directions.", "هلمز تظاهر کرد آدرس می‌پرسد."),
                StoryParagraph("But he studied the man's face.", "اما صورت مرد را مطالعه کرد."),
                StoryParagraph("He realized who the man really was.", "او فهمید آن مرد واقعاً کیست."),
                StoryParagraph("It was John Clay, a famous criminal.", "جان کلی، جنایتکار معروف بود."),
                StoryParagraph("Clay was clever and dangerous.", "کلی باهوش و خطرناک بود."),
                StoryParagraph("Holmes now understood the plan.", "هلمز حالا نقشه را فهمید."),
                StoryParagraph("He asked Watson to come at night.", "او از واتسون خواست شب بیاید.")
            )),
            StoryChapter(5, "The Trap", "تله", listOf(
                StoryParagraph("That night, Holmes and Watson waited.", "آن شب، هلمز و واتسون منتظر ماندند."),
                StoryParagraph("A police inspector joined them.", "بازرس پلیسی به آن‌ها پیوست."),
                StoryParagraph("They hid in a dark alley.", "آن‌ها در کوچه‌ای تاریک پنهان شدند."),
                StoryParagraph("They waited for many hours.", "ساعت‌ها منتظر ماندند."),
                StoryParagraph("Then they saw a light in the basement.", "بعد نوری در زیرزمین دیدند."),
                StoryParagraph("They heard the sound of digging.", "صدای کندن شنیدند."),
                StoryParagraph("The criminals were digging a tunnel.", "جنایتکاران تونلی می‌کندند."),
                StoryParagraph("The tunnel went to the bank.", "تونل به بانک می‌رفت."),
                StoryParagraph("Holmes knew what they planned.", "هلمز می‌دانست چه نقشه‌ای دارند."),
                StoryParagraph("He was ready to catch them.", "او آماده بود دستگیرشان کند.")
            )),
            StoryChapter(6, "The Arrest", "دستگیری", listOf(
                StoryParagraph("A stone moved in the floor.", "سنگی در کف حرکت کرد."),
                StoryParagraph("John Clay came up through the hole.", "جان کلی از سوراخ بیرون آمد."),
                StoryParagraph("He had a bag of gold.", "کیسه‌ای طلا داشت."),
                StoryParagraph("Holmes jumped out and grabbed him.", "هلمز بیرون پرید و گرفتش."),
                StoryParagraph("The inspector arrested him.", "بازرس دستگیرش کرد."),
                StoryParagraph("Clay tried to escape but failed.", "کلی تلاش کرد فرار کند اما موفق نشد."),
                StoryParagraph("His partner was caught too.", "شریکش هم دستگیر شد."),
                StoryParagraph("Both men were sent to prison.", "هر دو به زندان فرستاده شدند."),
                StoryParagraph("The bank's gold was saved.", "طلای بانک نجات یافت."),
                StoryParagraph("The case was solved.", "پرونده حل شد.")
            )),
            StoryChapter(7, "The Clever Plan", "نقشه هوشمندانه", listOf(
                StoryParagraph("Holmes explained the trick to Watson.", "هلمز ترفند را به واتسون توضیح داد."),
                StoryParagraph("The league was invented by Clay.", "اتحادیه توسط کلی ساخته شده بود."),
                StoryParagraph("It kept Wilson out of his shop.", "ویلسون را از مغازه‌اش دور نگه می‌داشت."),
                StoryParagraph("So Clay could dig in peace.", "تا کلی در آرامش بکند."),
                StoryParagraph("The copying job was also fake.", "کار کپی هم جعلی بود."),
                StoryParagraph("Wilson had been used by criminals.", "ویلسون توسط جنایتکاران استفاده شده بود."),
                StoryParagraph("But at least his shop was safe.", "اما حداقل مغازه‌اش امن بود."),
                StoryParagraph("Watson was amazed by the plan.", "واتسون از نقشه شگفت‌زده شد."),
                StoryParagraph("Holmes said it was simple logic.", "هلمز گفت منطق ساده است."),
                StoryParagraph("And so the case was closed.", "و اینگونه پرونده بسته شد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴: طرح‌های فوق‌سری
    // ═══════════════════════════════════════════════════════
    private fun story4() = StoryContent(
        storyId = "sherlock_top_secret",
        chapters = listOf(
            StoryChapter(1, "The Missing Plans", "نقشه‌های گمشده", listOf(
                StoryParagraph("A government official came to Holmes.", "مقام دولتی‌ای به دیدن هلمز آمد."),
                StoryParagraph("He looked very worried.", "او خیلی نگران به نظر می‌رسید."),
                StoryParagraph("Some important plans were stolen.", "نقشه‌های مهمی دزدیده شده بودند."),
                StoryParagraph("They were plans for a submarine.", "نقشه‌های زیردریایی بودند."),
                StoryParagraph("If other countries got them, it would be terrible.", "اگر کشورهای دیگر می‌گرفتند، وحشتناک می‌شد."),
                StoryParagraph("The plans disappeared on Sunday night.", "نقشه‌ها یکشنبه شب ناپدید شدند."),
                StoryParagraph("Only three people had keys.", "فقط سه نفر کلید داشتند."),
                StoryParagraph("The official trusted all of them.", "مقام به همه‌شان اعتماد داشت."),
                StoryParagraph("But one of them was a traitor.", "اما یکی از آن‌ها خائن بود."),
                StoryParagraph("Holmes agreed to investigate.", "هلمز موافقت کرد تحقیق کند.")
            )),
            StoryChapter(2, "The Three Suspects", "سه مظنون", listOf(
                StoryParagraph("Holmes interviewed the three men.", "هلمز با سه مرد مصاحبه کرد."),
                StoryParagraph("The official was nervous.", "مقام مضطرب بود."),
                StoryParagraph("The assistant was calm and polite.", "دستیار آرام و مؤدب بود."),
                StoryParagraph("The clerk Charles was pale and afraid.", "منشی چارلز رنگ‌پریده و ترسیده بود."),
                StoryParagraph("Charles had a sick mother.", "چارلز مادر مریضی داشت."),
                StoryParagraph("He needed money for her medicine.", "برای دارویش پول لازم داشت."),
                StoryParagraph("Holmes thought Charles was suspicious.", "هلمز فکر کرد چارلز مشکوک است."),
                StoryParagraph("But he was not sure.", "اما مطمئن نبود."),
                StoryParagraph("He needed more evidence.", "به مدرک بیشتری نیاز داشت."),
                StoryParagraph("He asked to stay in the office overnight.", "او خواست شب را در دفتر بماند.")
            )),
            StoryChapter(3, "The Office at Night", "دفتر در شب", listOf(
                StoryParagraph("That night, Holmes hid in the office.", "آن شب، هلمز در دفتر پنهان شد."),
                StoryParagraph("Watson came with him to help.", "واتسون برای کمک با او آمد."),
                StoryParagraph("They waited in the dark.", "آن‌ها در تاریکی منتظر ماندند."),
                StoryParagraph("Hours passed slowly.", "ساعت‌ها آرام گذشتند."),
                StoryParagraph("Then they heard footsteps.", "بعد صدای پا شنیدند."),
                StoryParagraph("Someone entered the room quietly.", "کسی بی‌صدا وارد اتاق شد."),
                StoryParagraph("It was the assistant.", "دستیار بود."),
                StoryParagraph("Holmes was surprised.", "هلمز تعجب کرد."),
                StoryParagraph("He had thought Charles was guilty.", "او فکر کرده بود چارلز گناهکار است."),
                StoryParagraph("But it was the assistant.", "اما دستیار بود.")
            )),
            StoryChapter(4, "The Hidden Drawer", "کشوی مخفی", listOf(
                StoryParagraph("The assistant went to the bell rope.", "دستیار به طناب زنگ رفت."),
                StoryParagraph("He pressed a hidden button.", "دکمه‌ای مخفی فشار داد."),
                StoryParagraph("The bell rope moved to the side.", "طناب زنگ به کنار رفت."),
                StoryParagraph("A drawer opened in the wall.", "کشویی در دیوار باز شد."),
                StoryParagraph("The plans were inside.", "نقشه‌ها داخلش بودند."),
                StoryParagraph("Holmes jumped out of the shadows.", "هلمز از سایه‌ها بیرون پرید."),
                StoryParagraph("The assistant was shocked.", "دستیار شوکه شد."),
                StoryParagraph("Holmes grabbed the plans.", "هلمز نقشه‌ها را گرفت."),
                StoryParagraph("The assistant tried to run.", "دستیار تلاش کرد فرار کند."),
                StoryParagraph("But Holmes stopped him.", "اما هلمز متوقفش کرد.")
            )),
            StoryChapter(5, "The Spy's Story", "داستان جاسوس", listOf(
                StoryParagraph("The police came and arrested him.", "پلیس آمد و دستگیرش کرد."),
                StoryParagraph("The assistant confessed everything.", "دستیار همه چیز را اعتراف کرد."),
                StoryParagraph("He had worked there for five years.", "پنج سال آنجا کار کرده بود."),
                StoryParagraph("But then he started to gamble.", "اما بعد شروع به قمار کرد."),
                StoryParagraph("He lost a lot of money.", "پول زیادی از دست داد."),
                StoryParagraph("He owed money to dangerous men.", "به مردان خطرناکی بدهکار شد."),
                StoryParagraph("A foreign agent offered him money.", "مأمور خارجی پولی به او پیشنهاد داد."),
                StoryParagraph("He just had to steal the plans.", "فقط باید نقشه‌ها را می‌دزدید."),
                StoryParagraph("The assistant agreed.", "دستیار موافقت کرد."),
                StoryParagraph("He planned everything carefully.", "او همه چیز را با دقت نقشه کشید.")
            )),
            StoryChapter(6, "The Truth", "حقیقت", listOf(
                StoryParagraph("Charles the clerk was released.", "چارلز منشی آزاد شد."),
                StoryParagraph("He had been innocent all along.", "او از اول بی‌گناه بود."),
                StoryParagraph("Holmes apologized to him.", "هلمز عذرخواهی کرد."),
                StoryParagraph("Charles said he understood.", "چارلز گفت می‌فهمد."),
                StoryParagraph("The plans were returned to the government.", "نقشه‌ها به دولت برگردانده شدند."),
                StoryParagraph("The country was safe again.", "کشور دوباره امن بود."),
                StoryParagraph("The assistant was sent to prison.", "دستیار به زندان فرستاده شد."),
                StoryParagraph("He would spend many years there.", "سال‌های زیادی آنجا می‌ماند."),
                StoryParagraph("The official thanked Holmes.", "مقام از هلمز تشکر کرد."),
                StoryParagraph("The case was closed.", "پرونده بسته شد.")
            )),
            StoryChapter(7, "The Lesson", "درس", listOf(
                StoryParagraph("Watson asked Holmes about the case.", "واتسون از هلمز درباره پرونده پرسید."),
                StoryParagraph("Holmes explained his method.", "هلمز روشش را توضیح داد."),
                StoryParagraph("He had noticed the bell rope was strange.", "او متوجه شده بود طناب زنگ عجیب است."),
                StoryParagraph("It hung too low from the wall.", "خیلی پایین از دیوار آویزان بود."),
                StoryParagraph("So there must be something behind it.", "پس باید چیزی پشتش باشد."),
                StoryParagraph("That is how he found the drawer.", "اینگونه کشو را پیدا کرد."),
                StoryParagraph("The assistant's calm was suspicious.", "آرامش دستیار مشکوک بود."),
                StoryParagraph("An innocent man would be nervous.", "مرد بی‌گناه مضطرب می‌شد."),
                StoryParagraph("Holmes caught him in the act.", "هلمز در حین عمل گرفتش."),
                StoryParagraph("And so the case was closed.", "و اینگونه پرونده بسته شد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵: سگ باسکرویل
    // ═══════════════════════════════════════════════════════
    private fun story5() = StoryContent(
        storyId = "hounds_baskervilles",
        chapters = listOf(
            StoryChapter(1, "The Old Legend", "افسانه قدیمی", listOf(
                StoryParagraph("Dr. Mortimer came to see Holmes.", "دکتر مورتیمر به دیدن هلمز آمد."),
                StoryParagraph("He had a strange story to tell.", "داستان عجیبی برای گفتن داشت."),
                StoryParagraph("He talked about the Baskerville family.", "او درباره خانواده باسکرویل صحبت کرد."),
                StoryParagraph("There was a legend about them.", "افسانه‌ای درباره‌شان بود."),
                StoryParagraph("A giant hound haunted the family.", "سگ شکاری غول‌پیکری خانواده را تسخیر کرده بود."),
                StoryParagraph("It had killed the first Sir Hugo.", "اولین سر هوگو را کشته بود."),
                StoryParagraph("Recently, Sir Charles Baskerville died.", "اخیراً سر چارلز باسکرویل مرد."),
                StoryParagraph("He was found dead in his garden.", "او مرده در باغش پیدا شد."),
                StoryParagraph("There were footprints of a giant hound.", "ردپای سگ شکاری غول‌پیکری بود."),
                StoryParagraph("Holmes agreed to take the case.", "هلمز موافقت کرد پرونده را بگیرد.")
            )),
            StoryChapter(2, "Sir Henry Arrives", "ورود سر هنری", listOf(
                StoryParagraph("Sir Henry arrived from Canada.", "سر هنری از کانادا رسید."),
                StoryParagraph("He was the last heir of the family.", "او آخرین وارث خانواده بود."),
                StoryParagraph("Holmes and Watson met him.", "هلمز و واتسون ملاقاتش کردند."),
                StoryParagraph("One of his boots was stolen.", "یکی از چکمه‌هایش دزدیده شد."),
                StoryParagraph("Then a new boot was taken.", "بعد چکمه جدیدی برداشته شد."),
                StoryParagraph("Holmes thought someone was following him.", "هلمز فکر کرد کسی دنبالش است."),
                StoryParagraph("He warned Sir Henry to be careful.", "او به سر هنری هشدار داد محتاط باشد."),
                StoryParagraph("Watson would go with him to the moor.", "واتسون با او به مرداب می‌رفت."),
                StoryParagraph("Holmes would stay in London.", "هلمز در لندن می‌ماند."),
                StoryParagraph("He would join them later.", "او بعداً به آن‌ها می‌پیوست.")
            )),
            StoryChapter(3, "The Moor", "مرداب", listOf(
                StoryParagraph("The two men took the train to Devon.", "دو مرد با قطار به دوون رفتند."),
                StoryParagraph("The moor was dark and dangerous.", "مرداب تاریک و خطرناک بود."),
                StoryParagraph("Strange sounds came from it at night.", "شب‌ها صداهای عجیبی از آن می‌آمد."),
                StoryParagraph("Sir Henry's home was Baskerville Hall.", "خانه سر هنری تالار باسکرویل بود."),
                StoryParagraph("The house was old and full of shadows.", "خانه قدیمی و پر از سایه‌ها بود."),
                StoryParagraph("The servants were Mr. and Mrs. Barrymore.", "خدمتکاران آقا و خانم بریمور بودند."),
                StoryParagraph("Mrs. Barrymore was crying every night.", "خانم بریمور هر شب گریه می‌کرد."),
                StoryParagraph("Watson heard strange sounds in the house.", "واتسون صداهای عجیبی در خانه شنید."),
                StoryParagraph("He saw a man on the moor at night.", "او شب مردی را در مرداب دید."),
                StoryParagraph("He did not know who it was.", "نمی‌دانست کیست.")
            )),
            StoryChapter(4, "The Stapletons", "استپلتون‌ها", listOf(
                StoryParagraph("Watson met the neighbors.", "واتسون همسایه‌ها را ملاقات کرد."),
                StoryParagraph("Their name was Stapleton.", "اسمشان استپلتون بود."),
                StoryParagraph("Mr. Stapleton was a naturalist.", "آقای استپلتون طبیعت‌شناس بود."),
                StoryParagraph("His sister Beryl was beautiful.", "خواهرش بریل زیبا بود."),
                StoryParagraph("She warned Sir Henry to leave.", "او به سر هنری هشدار داد برود."),
                StoryParagraph("But she would not say why.", "اما نمی‌گفت چرا."),
                StoryParagraph("Sir Henry was falling in love with her.", "سر هنری داشت عاشقش می‌شد."),
                StoryParagraph("One night, they heard a terrible howl.", "یک شب، زوزه وحشتناکی شنیدند."),
                StoryParagraph("It was the howling of a hound.", "زوزه سگ شکاری بود."),
                StoryParagraph("Everyone was afraid.", "همه ترسیدند.")
            )),
            StoryChapter(5, "Holmes Arrives", "ورود هلمز", listOf(
                StoryParagraph("Holmes arrived at Baskerville Hall.", "هلمز به تالار باسکرویل رسید."),
                StoryParagraph("He had been hiding on the moor.", "او در مرداب پنهان شده بود."),
                StoryParagraph("He had watched everyone carefully.", "با دقت همه را تماشا کرده بود."),
                StoryParagraph("He had found the truth.", "او حقیقت را پیدا کرده بود."),
                StoryParagraph("The hound was real but not a ghost.", "سگ واقعی بود اما روح نبود."),
                StoryParagraph("It was a real dog trained to kill.", "سگی واقعی آموزش‌دیده برای کشتن بود."),
                StoryParagraph("Mr. Stapleton was the murderer.", "آقای استپلتون قاتل بود."),
                StoryParagraph("He wanted the Baskerville fortune.", "او ثروت باسکرویل را می‌خواست."),
                StoryParagraph("He used the legend to hide his crimes.", "از افسانه استفاده می‌کرد جنایاتش را پنهان کند."),
                StoryParagraph("Holmes planned to catch him.", "هلمز نقشه کشید دستگیرش کند.")
            )),
            StoryChapter(6, "The Trap", "تله", listOf(
                StoryParagraph("Holmes and Watson waited at night.", "هلمز و واتسون شب منتظر ماندند."),
                StoryParagraph("They saw the hound running.", "سگ را دیدند که می‌دوید."),
                StoryParagraph("It was covered in glowing paint.", "پوشیده از رنگ درخشان بود."),
                StoryParagraph("That was why it looked like a ghost.", "به همین دلیل شبیه روح به نظر می‌رسید."),
                StoryParagraph("Holmes shot the hound.", "هلمز سگ را زد."),
                StoryParagraph("The dog died on the spot.", "سگ همان‌جا مرد."),
                StoryParagraph("Stapleton tried to escape.", "استپلتون تلاش کرد فرار کند."),
                StoryParagraph("He fell into a deep bog and died.", "در باتلاق عمیقی افتاد و مرد."),
                StoryParagraph("The mystery was solved.", "معما حل شد."),
                StoryParagraph("Sir Henry was safe.", "سر هنری در امان بود.")
            )),
            StoryChapter(7, "The End", "پایان", listOf(
                StoryParagraph("Sir Henry was very grateful.", "سر هنری خیلی سپاسگزار بود."),
                StoryParagraph("He decided to leave the moor.", "تصمیم گرفت مرداب را ترک کند."),
                StoryParagraph("He went on a long trip.", "به سفری طولانی رفت."),
                StoryParagraph("The legend became a story.", "افسانه تبدیل به داستانی شد."),
                StoryParagraph("Children heard it and shivered.", "بچه‌ها می‌شنیدند و می‌لرزیدند."),
                StoryParagraph("But there was no ghost.", "اما روحی نبود."),
                StoryParagraph("Only a cruel man and his dog.", "فقط مردی ظالم و سگش بود."),
                StoryParagraph("Holmes and Watson returned to London.", "هلمز و واتسون به لندن برگشتند."),
                StoryParagraph("The case became very famous.", "پرونده خیلی معروف شد."),
                StoryParagraph("And so justice was done.", "و اینگونه عدالت اجرا شد.")
            ))
        )
    )
}