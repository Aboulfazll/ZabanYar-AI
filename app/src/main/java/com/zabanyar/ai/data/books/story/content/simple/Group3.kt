package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group3 — ۵ داستان کلاسیک کودکان
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۱۱. آلیس در سرزمین عجایب
 *  ۱۲. پیتر پن
 *  ۱۳. شازده کوچولو
 *  ۱۴. باغ مخفی
 *  ۱۵. زیبای سیاه
 */
object Group3 {

    fun getAll(): List<StoryContent> = listOf(
        story11(), story12(), story13(), story14(), story15()
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۱: آلیس در سرزمین عجایب
    // ═══════════════════════════════════════════════════════
    private fun story11() = StoryContent(
        storyId = "alice_wonderland",
        chapters = listOf(
            StoryChapter(1, "Down the Rabbit Hole", "پایین سوراخ خرگوش", listOf(
                StoryParagraph("Alice was sitting by a river.", "آلیس کنار رودخانه‌ای نشسته بود."),
                StoryParagraph("She was bored and tired.", "او خسته و بی‌حوصله بود."),
                StoryParagraph("Suddenly, a white rabbit ran past her.", "ناگهان، خرگوش سفیدی از کنارش دوید."),
                StoryParagraph("The rabbit was wearing a coat.", "خرگوش کتی پوشیده بود."),
                StoryParagraph("It took a watch from its pocket.", "از جیبش ساعتی بیرون آورد."),
                StoryParagraph("The rabbit said it was late.", "خرگوش گفت دیر شده."),
                StoryParagraph("Alice was very surprised.", "آلیس خیلی تعجب کرد."),
                StoryParagraph("She followed the rabbit.", "او دنبال خرگوش رفت."),
                StoryParagraph("The rabbit jumped into a hole.", "خرگوش به سوراخی پرید."),
                StoryParagraph("Alice jumped in after it.", "آلیس هم به دنبالش پرید.")
            )),
            StoryChapter(2, "The Pool of Tears", "برکه اشک", listOf(
                StoryParagraph("Alice fell down for a long time.", "آلیس مدت طولانی افتاد."),
                StoryParagraph("She landed softly on the ground.", "آرام روی زمین فرود آمد."),
                StoryParagraph("She was in a strange hallway.", "در راهروی عجیبی بود."),
                StoryParagraph("There were many doors.", "درهای زیادی بودند."),
                StoryParagraph("But they were all locked.", "اما همه قفل بودند."),
                StoryParagraph("She found a tiny golden key.", "کلید طلایی کوچکی پیدا کرد."),
                StoryParagraph("It opened a very small door.", "در کوچک خیلی کوچکی را باز کرد."),
                StoryParagraph("But Alice was too big to go through.", "اما آلیس برای عبور خیلی بزرگ بود."),
                StoryParagraph("She began to cry.", "او شروع به گریه کرد."),
                StoryParagraph("Her tears made a large pool.", "اشک‌هایش برکه بزرگی ساخت.")
            )),
            StoryChapter(3, "A Strange Race", "مسابقه عجیب", listOf(
                StoryParagraph("Alice met many strange animals.", "آلیس با حیوانات عجیب زیادی ملاقات کرد."),
                StoryParagraph("There was a mouse, a dodo, and a duck.", "موش، دودو و اردکی بودند."),
                StoryParagraph("Everyone was wet from the tears.", "همه از اشک‌ها خیس بودند."),
                StoryParagraph("The dodo suggested a race.", "دودو پیشنهاد مسابقه‌ای داد."),
                StoryParagraph("They ran in a circle.", "آن‌ها در دایره‌ای دویدند."),
                StoryParagraph("Everyone ran in different directions.", "هر کس در جهت متفاوتی دوید."),
                StoryParagraph("Then they stopped suddenly.", "بعد ناگهان ایستادند."),
                StoryParagraph("Everyone had won the race.", "همه در مسابقه برنده شده بودند."),
                StoryParagraph("Alice did not understand this.", "آلیس این را نمی‌فهمید."),
                StoryParagraph("But she said nothing.", "اما چیزی نگفت.")
            )),
            StoryChapter(4, "The Mad Tea Party", "مهمانی چای دیوانه", listOf(
                StoryParagraph("Alice found a long table in a garden.", "آلیس میز بلندی در باغی پیدا کرد."),
                StoryParagraph("Three strange characters sat there.", "سه شخصیت عجیب آنجا نشسته بودند."),
                StoryParagraph("There was the Mad Hatter.", "کلاهدوز دیوانه بود."),
                StoryParagraph("There was the March Hare.", "خرگوش ماه مارس بود."),
                StoryParagraph("There was the Dormouse.", "موش خوابیده بود."),
                StoryParagraph("They were having a tea party.", "آن‌ها مهمانی چای داشتند."),
                StoryParagraph("But there was no tea on the table.", "اما چایی روی میز نبود."),
                StoryParagraph("They asked riddles with no answers.", "معماهایی بدون جواب پرسیدند."),
                StoryParagraph("They celebrated unbirthdays.", "تولدنگرفته‌ها را جشن می‌گرفتند."),
                StoryParagraph("Alice thought they were all mad.", "آلیس فکر کرد همه‌شان دیوانه‌اند.")
            )),
            StoryChapter(5, "The Queen's Garden", "باغ ملکه", listOf(
                StoryParagraph("Alice walked into a beautiful garden.", "آلیس وارد باغ زیبایی شد."),
                StoryParagraph("She saw three gardeners painting roses.", "او سه باغبان دید که رزها را رنگ می‌کردند."),
                StoryParagraph("They were painting white roses red.", "آن‌ها رزهای سفید را قرمز می‌کردند."),
                StoryParagraph("They had planted the wrong color.", "رنگ اشتباهی کاشته بودند."),
                StoryParagraph("Suddenly, the Queen arrived.", "ناگهان، ملکه رسید."),
                StoryParagraph("She was tall and very angry.", "او بلندقد و خیلی عصبانی بود."),
                StoryParagraph("She shouted: Off with their heads!", "او فریاد زد: سرشان را ببرید!"),
                StoryParagraph("Everyone was afraid of her.", "همه از او می‌ترسیدند."),
                StoryParagraph("Alice was not afraid.", "آلیس نمی‌ترسید."),
                StoryParagraph("She stood up to the Queen.", "او در مقابل ملکه ایستاد.")
            )),
            StoryChapter(6, "The Trial", "محاکمه", listOf(
                StoryParagraph("The Queen called for a trial.", "ملکه دستور محاکمه داد."),
                StoryParagraph("Someone had stolen her tarts.", "کسی تارت‌هایش را دزدیده بود."),
                StoryParagraph("The Knave of Hearts was accused.", "سرباز دل متهم بود."),
                StoryParagraph("The witnesses were strange animals.", "شاهدان حیوانات عجیبی بودند."),
                StoryParagraph("The Mad Hatter was a witness.", "کلاهدوز دیوانه شاهد بود."),
                StoryParagraph("He told a confusing story.", "او داستان گیج‌کننده‌ای گفت."),
                StoryParagraph("Alice was also called as a witness.", "آلیس هم به عنوان شاهد فراخوانده شد."),
                StoryParagraph("She was growing larger and larger.", "او بزرگ‌تر و بزرگ‌تر می‌شد."),
                StoryParagraph("The Queen ordered her arrest.", "ملکه دستور دستگیری‌اش را داد."),
                StoryParagraph("Alice shouted that they were all mad.", "آلیس فریاد زد همه‌شان دیوانه‌اند.")
            )),
            StoryChapter(7, "Waking Up", "بیدار شدن", listOf(
                StoryParagraph("Then Alice heard a voice calling her.", "بعد آلیس صدایی شنید که صدایش می‌زد."),
                StoryParagraph("It was her sister.", "خواهرش بود."),
                StoryParagraph("She was still sitting by the river.", "او هنوز کنار رودخانه نشسته بود."),
                StoryParagraph("The whole adventure had been a dream.", "تمام ماجرا خوابی بود."),
                StoryParagraph("The rabbit and the Queen were not real.", "خرگوش و ملکه واقعی نبودند."),
                StoryParagraph("But Alice remembered everything.", "اما آلیس همه چیز را به یاد داشت."),
                StoryParagraph("She told her sister the story.", "او داستان را به خواهرش گفت."),
                StoryParagraph("Her sister smiled and listened.", "خواهرش لبخند زد و گوش داد."),
                StoryParagraph("That night, her sister had the same dream.", "آن شب، خواهرش همان خواب را دید."),
                StoryParagraph("And the adventure continued in dreams.", "و ماجرا در خواب‌ها ادامه یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۲: پیتر پن
    // ═══════════════════════════════════════════════════════
    private fun story12() = StoryContent(
        storyId = "peter_pan",
        chapters = listOf(
            StoryChapter(1, "The Darling Family", "خانواده دارلینگ", listOf(
                StoryParagraph("The Darling family lived in London.", "خانواده دارلینگ در لندن زندگی می‌کردند."),
                StoryParagraph("There were three children.", "سه فرزند داشتند."),
                StoryParagraph("Their names were Wendy, John, and Michael.", "اسم‌هایشان وندی، جان و مایکل بود."),
                StoryParagraph("Wendy was the oldest.", "وندی بزرگ‌ترین بود."),
                StoryParagraph("She loved to tell stories.", "عاشق تعریف کردن داستان بود."),
                StoryParagraph("Their father was Mr. Darling.", "پدرشان آقای دارلینگ بود."),
                StoryParagraph("Their mother was Mrs. Darling.", "مادرشان خانم دارلینگ بود."),
                StoryParagraph("They had a dog named Nana.", "سگی به نام نانا داشتند."),
                StoryParagraph("Nana was the children's nurse.", "نانا پرستار بچه‌ها بود."),
                StoryParagraph("The children loved Nana very much.", "بچه‌ها نانا را خیلی دوست داشتند.")
            )),
            StoryChapter(2, "Peter Pan Arrives", "ورود پیتر پن", listOf(
                StoryParagraph("One night, Mrs. Darling saw a boy.", "یک شب، خانم دارلینگ پسری دید."),
                StoryParagraph("He was flying outside the window.", "او بیرون پنجره پرواز می‌کرد."),
                StoryParagraph("She was very surprised.", "او خیلی تعجب کرد."),
                StoryParagraph("Nana tried to catch the boy.", "نانا تلاش کرد پسر را بگیرد."),
                StoryParagraph("But she only caught his shadow.", "اما فقط سایه‌اش را گرفت."),
                StoryParagraph("Mrs. Darling kept the shadow.", "خانم دارلینگ سایه را نگه داشت."),
                StoryParagraph("The next week, the boy came back.", "هفته بعد، پسر برگشت."),
                StoryParagraph("His name was Peter Pan.", "اسمش پیتر پن بود."),
                StoryParagraph("He came to find his shadow.", "برای پیدا کردن سایه‌اش آمده بود."),
                StoryParagraph("Wendy helped him sew it back.", "وندی کمکش کرد دوباره بدوزدش.")
            )),
            StoryChapter(3, "The Flight to Neverland", "پرواز به نِوِرلند", listOf(
                StoryParagraph("Peter told the children about Neverland.", "پیتر به بچه‌ها درباره نِوِرلند گفت."),
                StoryParagraph("It was a magical island far away.", "جزیره‌ای جادویی دورافتاده بود."),
                StoryParagraph("He said they could fly there.", "گفت می‌توانند به آنجا پرواز کنند."),
                StoryParagraph("He taught them to fly.", "او پرواز را یادشان داد."),
                StoryParagraph("They flew out the window together.", "آن‌ها با هم از پنجره پرواز کردند."),
                StoryParagraph("They flew over the city of London.", "از فراز شهر لندن گذشتند."),
                StoryParagraph("They flew over the ocean.", "از فراز اقیانوس گذشتند."),
                StoryParagraph("Finally, they reached Neverland.", "بالاخره به نِوِرلند رسیدند."),
                StoryParagraph("It was beautiful and full of wonders.", "زیبا و پر از شگفتی‌ها بود."),
                StoryParagraph("The children were very happy.", "بچه‌ها خیلی خوشحال بودند.")
            )),
            StoryChapter(4, "The Lost Boys", "پسران گمشده", listOf(
                StoryParagraph("In Neverland, there were many boys.", "در نِوِرلند پسران زیادی بودند."),
                StoryParagraph("They were called the Lost Boys.", "آن‌ها را پسران گمشده می‌نامیدند."),
                StoryParagraph("They had no parents.", "والدین نداشتند."),
                StoryParagraph("Peter Pan was their leader.", "پیتر پن رهبرشان بود."),
                StoryParagraph("The Lost Boys loved Peter.", "پسران گمشده پیتر را دوست داشتند."),
                StoryParagraph("When Wendy arrived, they were happy.", "وقتی وندی رسید، خوشحال شدند."),
                StoryParagraph("Wendy became their mother.", "وندی مادرشان شد."),
                StoryParagraph("She cooked and told stories.", "آشپزی می‌کرد و داستان می‌گفت."),
                StoryParagraph("She took care of everyone.", "از همه مراقبت می‌کرد."),
                StoryParagraph("The boys loved her like a mother.", "پسرها مثل مادر دوستش داشتند.")
            )),
            StoryChapter(5, "Captain Hook", "کاپیتان هوک", listOf(
                StoryParagraph("The greatest enemy was Captain Hook.", "بزرگ‌ترین دشمن کاپیتان هوک بود."),
                StoryParagraph("He was a pirate on a big ship.", "او دزد دریایی روی کشتی بزرگی بود."),
                StoryParagraph("He had a hook instead of a hand.", "به جای دست قلابی داشت."),
                StoryParagraph("Peter Pan had cut off his hand.", "پیتر پن دستش را بریده بود."),
                StoryParagraph("A crocodile had eaten the hand.", "کروکدیلی دستش را خورده بود."),
                StoryParagraph("The crocodile followed Hook everywhere.", "کروکدیل همه‌جا دنبال هوک بود."),
                StoryParagraph("Hook hated Peter Pan.", "هوک از پیتر پن متنفر بود."),
                StoryParagraph("He wanted to kill him.", "می‌خواست بکشدش."),
                StoryParagraph("Hook captured Wendy and the boys.", "هوک وندی و پسرها را اسیر کرد."),
                StoryParagraph("Peter came to save them.", "پیتر برای نجاتشان آمد.")
            )),
            StoryChapter(6, "The Final Battle", "نبرد نهایی", listOf(
                StoryParagraph("Peter and Hook fought on the ship.", "پیتر و هوک روی کشتی جنگیدند."),
                StoryParagraph("It was a long and difficult fight.", "نبردی طولانی و سخت بود."),
                StoryParagraph("The Lost Boys helped Peter.", "پسران گمشده کمک پیتر کردند."),
                StoryParagraph("Wendy saved John and Michael.", "وندی جان و مایکل را نجات داد."),
                StoryParagraph("Finally, Peter pushed Hook into the sea.", "بالاخره، پیتر هوک را به دریا انداخت."),
                StoryParagraph("The crocodile was waiting there.", "کروکدیل آنجا منتظر بود."),
                StoryParagraph("Hook was finally defeated.", "هوک بالاخره شکست خورد."),
                StoryParagraph("The children celebrated their victory.", "بچه‌ها پیروزی‌شان را جشن گرفتند."),
                StoryParagraph("They were free again.", "دوباره آزاد بودند."),
                StoryParagraph("They sang and danced with joy.", "با خوشحالی آواز خواندند و رقصیدند.")
            )),
            StoryChapter(7, "The Return Home", "بازگشت به خانه", listOf(
                StoryParagraph("Wendy missed her parents.", "وندی دلتنگ والدینش بود."),
                StoryParagraph("She wanted to go home.", "می‌خواست به خانه برگردد."),
                StoryParagraph("Peter did not want her to leave.", "پیتر نمی‌خواست برود."),
                StoryParagraph("But he knew she had to go.", "اما می‌دانست باید برود."),
                StoryParagraph("He flew them back to London.", "او آن‌ها را به لندن برگرداند."),
                StoryParagraph("Their parents were very happy.", "والدینشان خیلی خوشحال شدند."),
                StoryParagraph("They had thought the children were lost.", "فکر کرده بودند بچه‌ها گم شده‌اند."),
                StoryParagraph("Wendy told them about Neverland.", "وندی درباره نِوِرلند به آن‌ها گفت."),
                StoryParagraph("Peter flew away back to the island.", "پیتر به سمت جزیره پرواز کرد."),
                StoryParagraph("But he promised to return someday.", "اما قول داد روزی برگردد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۳: شازده کوچولو
    // ═══════════════════════════════════════════════════════
    private fun story13() = StoryContent(
        storyId = "little_prince",
        chapters = listOf(
            StoryChapter(1, "The Pilot in the Desert", "خلبان در صحرا", listOf(
                StoryParagraph("A pilot crashed in the Sahara Desert.", "خلبانی در صحرای صحرا سقوط کرد."),
                StoryParagraph("His plane was broken.", "هواپیمایش خراب بود."),
                StoryParagraph("He had very little water.", "آب خیلی کمی داشت."),
                StoryParagraph("He was all alone in the desert.", "در صحرا کاملاً تنها بود."),
                StoryParagraph("He tried to fix the engine.", "تلاش کرد موتور را درست کند."),
                StoryParagraph("Suddenly, he heard a small voice.", "ناگهان، صدای کوچکی شنید."),
                StoryParagraph("A young boy was standing there.", "پسر جوانی آنجا ایستاده بود."),
                StoryParagraph("The boy was not from the desert.", "پسر از صحرا نبود."),
                StoryParagraph("He asked the pilot to draw a sheep.", "از خلبان خواست گوسفندی بکشد."),
                StoryParagraph("The pilot was very surprised.", "خلبان خیلی تعجب کرد.")
            )),
            StoryChapter(2, "The Planet of the Prince", "سیاره شازده", listOf(
                StoryParagraph("The little prince came from a small planet.", "شازده کوچولو از سیاره‌ای کوچک آمده بود."),
                StoryParagraph("It was called Asteroid B-612.", "سیارک B-612 نام داشت."),
                StoryParagraph("The planet was very tiny.", "سیاره خیلی کوچک بود."),
                StoryParagraph("There were three volcanoes on it.", "سه آتشفشان رویش بود."),
                StoryParagraph("There was also a beautiful flower.", "گل زیبایی هم بود."),
                StoryParagraph("It was a rose with many thorns.", "رزی با خارهای زیاد بود."),
                StoryParagraph("The rose was proud and vain.", "رز مغرور و خودپسند بود."),
                StoryParagraph("But the prince loved her.", "اما شازده دوستش داشت."),
                StoryParagraph("They often argued with each other.", "آن‌ها اغلب با هم دعوا می‌کردند."),
                StoryParagraph("So the prince decided to leave.", "پس شازده تصمیم گرفت برود.")
            )),
            StoryChapter(3, "Visiting Other Planets", "دیدار از سیارات دیگر", listOf(
                StoryParagraph("The prince visited many planets.", "شازده از سیارات زیادی بازدید کرد."),
                StoryParagraph("On the first, there was a king.", "روی اولی، پادشاهی بود."),
                StoryParagraph("The king wanted to rule everyone.", "پادشاه می‌خواست بر همه حکومت کند."),
                StoryParagraph("On the second, there was a vain man.", "روی دومی، مردی خودپسند بود."),
                StoryParagraph("He only wanted to be admired.", "او فقط می‌خواست تحسین شود."),
                StoryParagraph("On the third, there was a drunkard.", "روی سومی، مردی مست بود."),
                StoryParagraph("He drank to forget his shame.", "می‌نوشید تا شرمش را فراموش کند."),
                StoryParagraph("On the fourth, there was a businessman.", "روی چهارمی، تاجری بود."),
                StoryParagraph("He counted stars and owned them.", "ستاره‌ها را می‌شمرد و مالکشان بود."),
                StoryParagraph("The prince did not understand grown-ups.", "شازده بزرگ‌سالان را نمی‌فهمید.")
            )),
            StoryChapter(4, "The Fox", "روباه", listOf(
                StoryParagraph("On Earth, the prince met a fox.", "روی زمین، شازده روباهی ملاقات کرد."),
                StoryParagraph("The fox wanted to be his friend.", "روباه می‌خواست دوستش باشد."),
                StoryParagraph("But first, the prince had to tame him.", "اما اول شازده باید رامش می‌کرد."),
                StoryParagraph("Taming means creating a bond.", "رام کردن یعنی پیوند ساختن."),
                StoryParagraph("The prince visited him every day.", "شازده هر روز به دیدنش می‌رفت."),
                StoryParagraph("Slowly, they became friends.", "آرام‌آرام، دوست شدند."),
                StoryParagraph("The fox taught him a secret.", "روباه رازی به او آموخت."),
                StoryParagraph("He said: What is essential is invisible.", "او گفت: آنچه ضروری است، نامرئی است."),
                StoryParagraph("You can only see truly with the heart.", "فقط با قلب می‌توانی واقعاً ببینی."),
                StoryParagraph("The prince remembered his rose.", "شازده رزش را به یاد آورد.")
            )),
            StoryChapter(5, "The Rose Garden", "باغ رز", listOf(
                StoryParagraph("The prince found a garden of roses.", "شازده باغی از رزها پیدا کرد."),
                StoryParagraph("There were five thousand roses there.", "پنج هزار رز آنجا بود."),
                StoryParagraph("The prince became very sad.", "شازده خیلی غمگین شد."),
                StoryParagraph("He thought his rose was unique.", "او فکر می‌کرد رزش یگانه است."),
                StoryParagraph("But there were so many like her.", "اما خیلی‌ها مثل او بودند."),
                StoryParagraph("The fox explained the truth to him.", "روباه حقیقت را برایش توضیح داد."),
                StoryParagraph("His rose was unique because he loved her.", "رزش یگانه بود چون او دوستش داشت."),
                StoryParagraph("He had spent time with her.", "با او وقت گذرانده بود."),
                StoryParagraph("She was special because of their bond.", "او به خاطر پیوندشان خاص بود."),
                StoryParagraph("The prince finally understood.", "شازده بالاخره فهمید.")
            )),
            StoryChapter(6, "The Well", "چاه آب", listOf(
                StoryParagraph("The prince met the pilot again.", "شازده دوباره خلبان را ملاقات کرد."),
                StoryParagraph("They had been in the desert for days.", "روزها در صحرا بودند."),
                StoryParagraph("They were both very thirsty.", "هر دو خیلی تشنه بودند."),
                StoryParagraph("The prince said they should look for a well.", "شازده گفت باید دنبال چاهی بگردند."),
                StoryParagraph("They walked together in the night.", "آن‌ها شب با هم راه رفتند."),
                StoryParagraph("The prince talked about his rose.", "شازده درباره رزش صحبت کرد."),
                StoryParagraph("He missed her very much.", "خیلی دلتنگش بود."),
                StoryParagraph("Finally, they found a well.", "بالاخره، چاهی پیدا کردند."),
                StoryParagraph("The water was fresh and sweet.", "آب تازه و شیرین بود."),
                StoryParagraph("They drank together with joy.", "با خوشحالی با هم نوشیدند.")
            )),
            StoryChapter(7, "Goodbye", "خداحافظی", listOf(
                StoryParagraph("The pilot fixed his airplane.", "خلبان هواپیمایش را درست کرد."),
                StoryParagraph("The prince said he had to leave.", "شازده گفت باید برود."),
                StoryParagraph("He was going back to his planet.", "او به سیاره‌اش برمی‌گشت."),
                StoryParagraph("The pilot was very sad.", "خلبان خیلی غمگین شد."),
                StoryParagraph("The prince told him not to cry.", "شازده به او گفت گریه نکن."),
                StoryParagraph("He said to look at the stars at night.", "او گفت شب‌ها به ستاره‌ها نگاه کن."),
                StoryParagraph("The stars would remind him of the prince.", "ستاره‌ها او را به یاد شازده می‌انداختند."),
                StoryParagraph("A snake helped the prince return.", "ماری کمک شازده کرد برگردد."),
                StoryParagraph("The pilot never saw him again.", "خلبان هرگز دوباره ندیدش."),
                StoryParagraph("But he always remembered his friend.", "اما همیشه دوستش را به یاد می‌آورد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۴: باغ مخفی
    // ═══════════════════════════════════════════════════════
    private fun story14() = StoryContent(
        storyId = "secret_garden",
        chapters = listOf(
            StoryChapter(1, "Mary Comes to England", "ورود مری به انگلیس", listOf(
                StoryParagraph("Mary Lennox was born in India.", "مری لنوکس در هند به دنیا آمد."),
                StoryParagraph("Her parents died from a sickness.", "والدینش از بیماری مردند."),
                StoryParagraph("She was sent to live in England.", "او برای زندگی به انگلیس فرستاده شد."),
                StoryParagraph("She went to live with her uncle.", "برای زندگی با عمویش رفت."),
                StoryParagraph("His name was Mr. Craven.", "اسمش آقای کریون بود."),
                StoryParagraph("He lived in a big, old house.", "او در خانه‌ای بزرگ و قدیمی زندگی می‌کرد."),
                StoryParagraph("The house had many rooms.", "خانه اتاق‌های زیادی داشت."),
                StoryParagraph("Many were locked and empty.", "بسیاری قفل و خالی بودند."),
                StoryParagraph("Mary was sad and angry.", "مری غمگین و عصبانی بود."),
                StoryParagraph("She did not like anyone.", "هیچ‌کس را دوست نداشت.")
            )),
            StoryChapter(2, "The Strange House", "خانه عجیب", listOf(
                StoryParagraph("Mary explored the large house.", "مری خانه بزرگ را کاوش کرد."),
                StoryParagraph("She found many strange things.", "چیزهای عجیب زیادی پیدا کرد."),
                StoryParagraph("She heard someone crying at night.", "شب‌ها کسی را می‌شنید که گریه می‌کرد."),
                StoryParagraph("A maid named Martha helped her.", "خدمتکاری به نام مارتا کمکش کرد."),
                StoryParagraph("Martha told her about the garden.", "مارتا درباره باغ به او گفت."),
                StoryParagraph("There was a garden that was locked.", "باغی بود که قفل شده بود."),
                StoryParagraph("Mrs. Craven had loved it.", "خانم کریون دوستش داشت."),
                StoryParagraph("She had died ten years ago.", "او ده سال پیش مرده بود."),
                StoryParagraph("Since then, it had been locked.", "از آن زمان، قفل شده بود."),
                StoryParagraph("No one was allowed inside.", "هیچ‌کس اجازه نداشت داخل شود.")
            )),
            StoryChapter(3, "The Robin and the Key", "سینه‌سرخ و کلید", listOf(
                StoryParagraph("Mary found a robin in the garden.", "مری سینه‌سرخی در باغ پیدا کرد."),
                StoryParagraph("The robin was very friendly.", "سینه‌سرخ خیلی دوستانه بود."),
                StoryParagraph("It followed Mary everywhere.", "همه‌جا دنبال مری می‌آمد."),
                StoryParagraph("One day, she found a key.", "یک روز، کلیدی پیدا کرد."),
                StoryParagraph("It was buried in the dirt.", "در خاک دفن شده بود."),
                StoryParagraph("It was old and rusty.", "قدیمی و زنگ‌زده بود."),
                StoryParagraph("The robin showed her a door.", "سینه‌سرخ دری به او نشان داد."),
                StoryParagraph("It was hidden behind ivy.", "پشت پیچک‌ها پنهان بود."),
                StoryParagraph("Mary put the key in the lock.", "مری کلید را در قفل گذاشت."),
                StoryParagraph("The door opened slowly.", "در آرام باز شد.")
            )),
            StoryChapter(4, "The Secret Garden", "باغ مخفی", listOf(
                StoryParagraph("Mary entered the secret garden.", "مری وارد باغ مخفی شد."),
                StoryParagraph("It was overgrown with weeds.", "با علف‌های هرز پوشیده شده بود."),
                StoryParagraph("But it was also very beautiful.", "اما خیلی زیبا هم بود."),
                StoryParagraph("There were roses everywhere.", "همه‌جا رز بود."),
                StoryParagraph("They had grown wild for ten years.", "ده سال وحشی رشد کرده بودند."),
                StoryParagraph("Mary decided to bring it back to life.", "مری تصمیم گرفت دوباره زنده‌اش کند."),
                StoryParagraph("She came every day to work.", "هر روز برای کار می‌آمد."),
                StoryParagraph("She pulled the weeds.", "علف‌های هرز را می‌کشید."),
                StoryParagraph("She planted new flowers.", "گل‌های جدید می‌کاشت."),
                StoryParagraph("Slowly, the garden began to bloom.", "آرام‌آرام، باغ شروع به شکفتن کرد.")
            )),
            StoryChapter(5, "Dickon", "دیکن", listOf(
                StoryParagraph("Mary met a boy named Dickon.", "مری پسری به نام دیکن ملاقات کرد."),
                StoryParagraph("He was Martha's brother.", "او برادر مارتا بود."),
                StoryParagraph("Dickon loved animals and plants.", "دیکن عاشق حیوانات و گیاهان بود."),
                StoryParagraph("He could talk to the animals.", "می‌توانست با حیوانات صحبت کند."),
                StoryParagraph("Birds ate from his hand.", "پرندگان از دستش غذا می‌خوردند."),
                StoryParagraph("A fox followed him everywhere.", "روباهی همه‌جا دنبالش می‌آمد."),
                StoryParagraph("Mary told him about the garden.", "مری درباره باغ به او گفت."),
                StoryParagraph("She showed him the secret place.", "جای مخفی را به او نشان داد."),
                StoryParagraph("Dickon promised to keep the secret.", "دیکن قول داد راز را نگه دارد."),
                StoryParagraph("They worked in the garden together.", "با هم در باغ کار کردند.")
            )),
            StoryChapter(6, "Colin", "کالین", listOf(
                StoryParagraph("Mary heard the crying again.", "مری دوباره گریه را شنید."),
                StoryParagraph("She followed the sound.", "دنبال صدا رفت."),
                StoryParagraph("She found a boy in a room.", "پسری در اتاقی پیدا کرد."),
                StoryParagraph("His name was Colin.", "اسمش کالین بود."),
                StoryParagraph("He was Mr. Craven's son.", "او پسر آقای کریون بود."),
                StoryParagraph("He was sick and could not walk.", "او مریض بود و نمی‌توانست راه برود."),
                StoryParagraph("He was very spoiled and angry.", "خیلی لوس و عصبانی بود."),
                StoryParagraph("Mary told him about the garden.", "مری درباره باغ به او گفت."),
                StoryParagraph("Colin wanted to see it too.", "کالین هم می‌خواست ببیندش."),
                StoryParagraph("They took him there in a chair.", "او را با صندلی به آنجا بردند.")
            )),
            StoryChapter(7, "The Garden Blooms", "شکفتن باغ", listOf(
                StoryParagraph("Colin entered the secret garden.", "کالین وارد باغ مخفی شد."),
                StoryParagraph("He saw the beautiful flowers.", "گل‌های زیبا را دید."),
                StoryParagraph("Something changed inside him.", "چیزی درونش تغییر کرد."),
                StoryParagraph("He wanted to walk again.", "می‌خواست دوباره راه برود."),
                StoryParagraph("Every day, he practiced walking.", "هر روز راه رفتن تمرین می‌کرد."),
                StoryParagraph("Slowly, he grew strong.", "آرام‌آرام قوی شد."),
                StoryParagraph("Mr. Craven came home one day.", "آقای کریون یک روز به خانه برگشت."),
                StoryParagraph("He heard laughter from the garden.", "خنده‌ای از باغ شنید."),
                StoryParagraph("He found his son running.", "پسرش را در حال دویدن پیدا کرد."),
                StoryParagraph("The family was happy at last.", "خانواده بالاخره خوشحال شدند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۵: زیبای سیاه
    // ═══════════════════════════════════════════════════════
    private fun story15() = StoryContent(
        storyId = "black_beauty",
        chapters = listOf(
            StoryChapter(1, "A Colt in the Meadow", "کرّه‌ای در چمن‌زار", listOf(
                StoryParagraph("My name is Black Beauty.", "اسم من زیبای سیاه است."),
                StoryParagraph("I am a horse.", "من اسب هستم."),
                StoryParagraph("I was born in a green meadow.", "در چمن‌زار سبزی به دنیا آمدم."),
                StoryParagraph("My mother was a kind horse.", "مادرم اسبی مهربان بود."),
                StoryParagraph("She took care of me.", "او مراقبم بود."),
                StoryParagraph("I ran and played all day.", "تمام روز می‌دویدم و بازی می‌کردم."),
                StoryParagraph("The grass was soft and sweet.", "چمن نرم و شیرین بود."),
                StoryParagraph("The sky was blue above me.", "آسمان بالای سرم آبی بود."),
                StoryParagraph("I was happy and free.", "خوشحال و آزاد بودم."),
                StoryParagraph("Those were the best days of my life.", "آن‌ها بهترین روزهای زندگی‌ام بودند.")
            )),
            StoryChapter(2, "Learning to Work", "یادگیری کار", listOf(
                StoryParagraph("When I was older, I was trained.", "وقتی بزرگ‌تر شدم، آموزشم دادند."),
                StoryParagraph("I learned to wear a saddle.", "یاد گرفتم زین بپوشم."),
                StoryParagraph("I learned to pull a carriage.", "یاد گرفتم کالسکه بکشم."),
                StoryParagraph("It was hard work at first.", "اول کار سختی بود."),
                StoryParagraph("But I learned quickly.", "اما سریع یاد گرفتم."),
                StoryParagraph("My first master was a kind man.", "اولین اربابم مردی مهربان بود."),
                StoryParagraph("His name was Squire Gordon.", "اسمش اسکوایر گوردون بود."),
                StoryParagraph("He lived at Birtwick Park.", "او در پارک برتویک زندگی می‌کرد."),
                StoryParagraph("He loved all his animals.", "او همه حیواناتش را دوست داشت."),
                StoryParagraph("I was happy there.", "من آنجا خوشحال بودم.")
            )),
            StoryChapter(3, "Friends at Birtwick", "دوستان در برتویک", listOf(
                StoryParagraph("At Birtwick, I made many friends.", "در برتویک دوستان زیادی پیدا کردم."),
                StoryParagraph("There was a pony named Merrylegs.", "اسبچه‌ای به نام مریلیگز بود."),
                StoryParagraph("There was a horse named Ginger.", "اسبی به نام جینجر بود."),
                StoryParagraph("Ginger had been treated badly.", "با جینجر بدرفتاری شده بود."),
                StoryParagraph("She did not trust people.", "او به مردم اعتماد نداشت."),
                StoryParagraph("But she became my friend.", "اما دوستم شد."),
                StoryParagraph("We worked together every day.", "هر روز با هم کار می‌کردیم."),
                StoryParagraph("We ate and rested together.", "با هم غذا می‌خوردیم و استراحت می‌کردیم."),
                StoryParagraph("She told me about her past.", "او درباره گذشته‌اش به من گفت."),
                StoryParagraph("I felt sorry for her.", "برای او دلسوزی کردم.")
            )),
            StoryChapter(4, "A Terrible Night", "شبی وحشتناک", listOf(
                StoryParagraph("One night, there was a fire.", "یک شب، آتشی روشن شد."),
                StoryParagraph("The stable was burning.", "اصطبل می‌سوخت."),
                StoryParagraph("We were all trapped inside.", "همه‌مان داخل گیر افتاده بودیم."),
                StoryParagraph("The horses were terrified.", "اسب‌ها وحشت کرده بودند."),
                StoryParagraph("I stayed calm and thought.", "من آرام ماندم و فکر کردم."),
                StoryParagraph("I led the others to safety.", "من دیگران را به جای امنی بردم."),
                StoryParagraph("We all escaped the fire.", "همه از آتش فرار کردیم."),
                StoryParagraph("My master was very proud of me.", "اربابم خیلی به من افتخار کرد."),
                StoryParagraph("He said I was a brave horse.", "او گفت اسب شجاعی هستم."),
                StoryParagraph("I felt proud of myself too.", "من هم به خودم افتخار کردم.")
            )),
            StoryChapter(5, "A New Home", "خانه جدید", listOf(
                StoryParagraph("Sadly, the Gordons had to move.", "متأسفانه، گوردون‌ها مجبور شدند نقل مکان کنند."),
                StoryParagraph("They had to sell their horses.", "مجبور شدند اسب‌هایشان را بفروشند."),
                StoryParagraph("I was sold to a new master.", "به ارباب جدیدی فروخته شدم."),
                StoryParagraph("His name was Lord Wexmire.", "اسمش لرد وکسمایر بود."),
                StoryParagraph("He was not as kind as Squire Gordon.", "او مثل اسکوایر گوردون مهربان نبود."),
                StoryParagraph("He used a tight rein on me.", "افسار محکمی روی من استفاده می‌کرد."),
                StoryParagraph("It hurt my mouth and neck.", "دهان و گردنم را درد می‌داد."),
                StoryParagraph("But I could not complain.", "اما نمی‌توانستم شکایت کنم."),
                StoryParagraph("I had to work every day.", "هر روز مجبور بودم کار کنم."),
                StoryParagraph("I missed my old home.", "دلتنگ خانه قدیمی‌ام بودم.")
            )),
            StoryChapter(6, "Hard Times", "زمان‌های سخت", listOf(
                StoryParagraph("After Lord Wexmire, I was sold again.", "بعد از لرد وکسمایر، دوباره فروخته شدم."),
                StoryParagraph("My new masters were cruel.", "اربابان جدیدم ظالم بودند."),
                StoryParagraph("They made me pull heavy loads.", "وادارم می‌کردند بارهای سنگین بکشم."),
                StoryParagraph("They gave me very little food.", "غذای خیلی کمی به من می‌دادند."),
                StoryParagraph("My body became thin and weak.", "بدنم لاغر و ضعیف شد."),
                StoryParagraph("My feet hurt badly.", "پاهایم به‌شدت درد می‌کردند."),
                StoryParagraph("I saw my friend Ginger again.", "دوستم جینجر را دوباره دیدم."),
                StoryParagraph("She was even worse than me.", "او حتی از من بدتر بود."),
                StoryParagraph("We were both sad and tired.", "هر دو غمگین و خسته بودیم."),
                StoryParagraph("Life was very hard for us.", "زندگی برایمان خیلی سخت بود.")
            )),
            StoryChapter(7, "A Happy Ending", "پایان خوش", listOf(
                StoryParagraph("One day, a kind man saw me.", "یک روز، مردی مهربان مرا دید."),
                StoryParagraph("He saw that I was very sick.", "او دید خیلی مریضم."),
                StoryParagraph("He bought me from my cruel master.", "او از ارباب ظالمم خریدم."),
                StoryParagraph("He took me to his farm.", "او مرا به مزرعه‌اش برد."),
                StoryParagraph("There, he gave me good food.", "آنجا غذای خوبی به من داد."),
                StoryParagraph("He let me rest all day.", "گذاشت تمام روز استراحت کنم."),
                StoryParagraph("Slowly, I became strong again.", "آرام‌آرام دوباره قوی شدم."),
                StoryParagraph("I lived there for many years.", "سال‌های زیادی آنجا زندگی کردم."),
                StoryParagraph("I was happy and peaceful.", "خوشحال و آرام بودم."),
                StoryParagraph("And so my long story ended well.", "و اینگونه داستان طولانی‌ام به خوبی پایان یافت.")
            ))
        )
    )
}