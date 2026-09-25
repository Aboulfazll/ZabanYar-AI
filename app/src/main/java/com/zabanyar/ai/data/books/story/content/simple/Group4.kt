package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group4 — ۵ داستان ماجراجویی و کلاسیک
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۱۶. جادوگر شهر اُز
 *  ۱۷. تایتانیک
 *  ۱۸. مرد فیل‌نما
 *  ۱۹. سفر به مرکز زمین
 *  ۲۰. رابین هود
 */
object Group4 {

    fun getAll(): List<StoryContent> = listOf(
        story16(), story17(), story18(), story19(), story20()
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۶: جادوگر شهر اُز
    // ═══════════════════════════════════════════════════════
    private fun story16() = StoryContent(
        storyId = "wizard_of_oz",
        chapters = listOf(
            StoryChapter(1, "The Cyclone", "گردباد", listOf(
                StoryParagraph("Dorothy lived in Kansas with her aunt and uncle.", "دوروتی در کانزاس با عمه و عمویش زندگی می‌کرد."),
                StoryParagraph("Their house was small and gray.", "خانه‌شان کوچک و خاکستری بود."),
                StoryParagraph("One day, a great cyclone came.", "یک روز، گردباد بزرگی آمد."),
                StoryParagraph("The sky turned dark and green.", "آسمان تاریک و سبز شد."),
                StoryParagraph("The wind lifted the house into the air.", "باد خانه را به هوا بلند کرد."),
                StoryParagraph("Dorothy and her dog Toto were inside.", "دوروتی و سگش توتو داخل بودند."),
                StoryParagraph("They flew for many hours.", "ساعت‌ها پرواز کردند."),
                StoryParagraph("Finally, the house landed with a crash.", "بالاخره، خانه با صدای بلندی فرود آمد."),
                StoryParagraph("Dorothy opened the door and looked outside.", "دوروتی در را باز کرد و بیرون را نگاه کرد."),
                StoryParagraph("She was in a strange and beautiful land.", "او در سرزمینی عجیب و زیبا بود.")
            )),
            StoryChapter(2, "The Land of Oz", "سرزمین اُز", listOf(
                StoryParagraph("Dorothy met some strange people.", "دوروتی با افراد عجیبی ملاقات کرد."),
                StoryParagraph("They were very short and wore blue clothes.", "آن‌ها خیلی کوتاه بودند و لباس آبی می‌پوشیدند."),
                StoryParagraph("They were called the Munchkins.", "آن‌ها را مانچکین می‌نامیدند."),
                StoryParagraph("A good witch came to see Dorothy.", "جادوگر خوبی به دیدن دوروتی آمد."),
                StoryParagraph("Her name was Glinda.", "اسمش گلایندا بود."),
                StoryParagraph("She told Dorothy she was in Oz.", "او به دوروتی گفت در سرزمین اُز است."),
                StoryParagraph("The only way home was through the Wizard.", "تنها راه خانه از طریق جادوگر بود."),
                StoryParagraph("He lived in the Emerald City.", "او در شهر زمرد زندگی می‌کرد."),
                StoryParagraph("Dorothy had to follow a yellow brick road.", "دوروتی باید جاده‌ای آجری زرد را دنبال می‌کرد."),
                StoryParagraph("She put on the silver shoes and started walking.", "او کفش‌های نقره‌ای را پوشید و شروع به راه رفتن کرد.")
            )),
            StoryChapter(3, "The Scarecrow", "مترسک", listOf(
                StoryParagraph("On the way, Dorothy met a scarecrow.", "در راه، دوروتی مترسکی ملاقات کرد."),
                StoryParagraph("He was hanging on a pole.", "او روی میله‌ای آویزان بود."),
                StoryParagraph("He wanted to go with Dorothy.", "می‌خواست با دوروتی برود."),
                StoryParagraph("He said he had no brains.", "او گفت مغز ندارد."),
                StoryParagraph("He wanted the Wizard to give him some.", "می‌خواست جادوگر به او کمی بدهد."),
                StoryParagraph("Dorothy helped him down from the pole.", "دوروتی کمکش کرد از میله پایین بیاید."),
                StoryParagraph("They walked together on the yellow road.", "آن‌ها با هم در جاده زرد راه رفتند."),
                StoryParagraph("The scarecrow was very kind.", "مترسک خیلی مهربان بود."),
                StoryParagraph("He told funny stories to pass the time.", "او داستان‌های خنده‌دار می‌گفت تا وقت بگذرد."),
                StoryParagraph("Dorothy liked him very much.", "دوروتی خیلی دوستش داشت.")
            )),
            StoryChapter(4, "The Tin Man and the Lion", "مرد قلعی و شیر", listOf(
                StoryParagraph("They met a tin man in the forest.", "آن‌ها در جنگل مردی قلعی ملاقات کردند."),
                StoryParagraph("He was rusty and could not move.", "او زنگ‌زده بود و نمی‌توانست حرکت کند."),
                StoryParagraph("Dorothy oiled his arms and legs.", "دوروتی دست‌ها و پاهایش را روغن مالی کرد."),
                StoryParagraph("The tin man wanted a heart.", "مرد قلعی قلب می‌خواست."),
                StoryParagraph("Then they met a big lion.", "بعد شیری بزرگ ملاقات کردند."),
                StoryParagraph("The lion was afraid of everything.", "شیر از همه چیز می‌ترسید."),
                StoryParagraph("He wanted to be brave.", "می‌خواست شجاع باشد."),
                StoryParagraph("Dorothy invited him to come along.", "دوروتی دعوتش کرد که همراه بیاید."),
                StoryParagraph("Now there were four travelers.", "حالا چهار مسافر بودند."),
                StoryParagraph("They walked together toward the Emerald City.", "آن‌ها با هم به سمت شهر زمرد راه رفتند.")
            )),
            StoryChapter(5, "The Emerald City", "شهر زمرد", listOf(
                StoryParagraph("Finally, they reached the Emerald City.", "بالاخره، به شهر زمرد رسیدند."),
                StoryParagraph("Everything in it was green and shining.", "همه چیز در آن سبز و درخشان بود."),
                StoryParagraph("They met the Wizard of Oz.", "آن‌ها جادوگر اُز را ملاقات کردند."),
                StoryParagraph("He looked like a giant head.", "او شبیه سری غول‌پیکر بود."),
                StoryParagraph("He said he would help them.", "او گفت کمکشان می‌کند."),
                StoryParagraph("But first, they had to kill the Wicked Witch.", "اما اول باید جادوگر بد را می‌کشتند."),
                StoryParagraph("The witch lived in the west.", "جادوگر در غرب زندگی می‌کرد."),
                StoryParagraph("She was very powerful and cruel.", "او خیلی قدرتمند و ظالم بود."),
                StoryParagraph("The travelers were afraid.", "مسافران ترسیدند."),
                StoryParagraph("But they agreed to try.", "اما موافقت کردند تلاش کنند.")
            )),
            StoryChapter(6, "The Wicked Witch", "جادوگر بد", listOf(
                StoryParagraph("The Wicked Witch saw them coming.", "جادوگر بد آن‌ها را دید که می‌آیند."),
                StoryParagraph("She sent wolves and crows to stop them.", "او گرگ‌ها و کلاغ‌ها را فرستاد متوقفشان کنند."),
                StoryParagraph("But the travelers fought them off.", "اما مسافران دفعشان کردند."),
                StoryParagraph("She sent flying monkeys to attack.", "او میمون‌های پرنده فرستاد حمله کنند."),
                StoryParagraph("The monkeys captured Dorothy and Toto.", "میمون‌ها دوروتی و توتو را اسیر کردند."),
                StoryParagraph("They took them to the witch's castle.", "آن‌ها را به قلعه جادوگر بردند."),
                StoryParagraph("The witch wanted Dorothy's silver shoes.", "جادوگر کفش‌های نقره‌ای دوروتی را می‌خواست."),
                StoryParagraph("She tried to take them from her.", "تلاش کرد از او بگیردشان."),
                StoryParagraph("But Dorothy threw water on the witch.", "اما دوروتی آب روی جادوگر ریخت."),
                StoryParagraph("The witch melted and disappeared.", "جادوگر ذوب شد و ناپدید گشت.")
            )),
            StoryChapter(7, "The Way Home", "راه خانه", listOf(
                StoryParagraph("The travelers returned to the Emerald City.", "مسافران به شهر زمرد برگشتند."),
                StoryParagraph("They found the Wizard was not a real wizard.", "آن‌ها فهمیدند جادوگر واقعی نبود."),
                StoryParagraph("He was just a man from Omaha.", "او فقط مردی از اوماها بود."),
                StoryParagraph("But he gave them what they wanted.", "اما چیزهایی که می‌خواستند به آن‌ها داد."),
                StoryParagraph("The scarecrow got a brain.", "مترسک مغز گرفت."),
                StoryParagraph("The tin man got a heart.", "مرد قلعی قلب گرفت."),
                StoryParagraph("The lion got courage.", "شیر شجاعت گرفت."),
                StoryParagraph("Glinda told Dorothy how to go home.", "گلایندا به دوروتی گفت چطور به خانه برود."),
                StoryParagraph("She clicked her silver shoes three times.", "او سه بار کفش‌های نقره‌ایش را به هم زد."),
                StoryParagraph("And she was back in Kansas again.", "و دوباره در کانزاس بود.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۷: تایتانیک
    // ═══════════════════════════════════════════════════════
    private fun story17() = StoryContent(
        storyId = "titanic",
        chapters = listOf(
            StoryChapter(1, "The Great Ship", "کشتی بزرگ", listOf(
                StoryParagraph("The Titanic was the largest ship in the world.", "تایتانیک بزرگ‌ترین کشتی جهان بود."),
                StoryParagraph("It was built in Belfast, Ireland.", "در بلفاست ایرلند ساخته شد."),
                StoryParagraph("It was almost 270 meters long.", "حدود ۲۷۰ متر طول داشت."),
                StoryParagraph("People called it the unsinkable ship.", "مردم آن را کشتی غرق‌نشدنی می‌نامیدند."),
                StoryParagraph("It had four big chimneys and many decks.", "چهار دودکش بزرگ و عرشه‌های زیادی داشت."),
                StoryParagraph("It could carry more than 2,000 people.", "می‌توانست بیش از ۲ هزار نفر را حمل کند."),
                StoryParagraph("The ship had a gym, a pool, and fancy rooms.", "کشتی باشگاه، استخر و اتاق‌های مجلل داشت."),
                StoryParagraph("The first class rooms were very beautiful.", "اتاق‌های درجه یک خیلی زیبا بودند."),
                StoryParagraph("Rich people paid a lot for their tickets.", "ثروتمندان برای بلیط‌هایشان پول زیادی می‌دادند."),
                StoryParagraph("Everyone wanted to travel on the Titanic.", "همه می‌خواستند با تایتانیک سفر کنند.")
            )),
            StoryChapter(2, "The Departure", "حرکت", listOf(
                StoryParagraph("The Titanic left Southampton on April 10, 1912.", "تایتانیک در ۱۰ آوریل ۱۹۱۲ ساوت‌همپتون را ترک کرد."),
                StoryParagraph("Thousands of people came to see it off.", "هزاران نفر برای بدرقه‌اش آمدند."),
                StoryParagraph("They waved and cheered from the docks.", "آن‌ها از اسکله دست تکان دادند و هورا کشیدند."),
                StoryParagraph("The captain was Edward Smith.", "کاپیتان ادوارد اسمیت بود."),
                StoryParagraph("He was a very experienced captain.", "او کاپیتان خیلی باتجربه‌ای بود."),
                StoryParagraph("The ship stopped in France and Ireland.", "کشتی در فرانسه و ایرلند توقف کرد."),
                StoryParagraph("More passengers came on board.", "مسافران بیشتری سوار شدند."),
                StoryParagraph("Then the Titanic headed out to sea.", "بعد تایتانیک به دریا رفت."),
                StoryParagraph("The weather was calm and clear.", "هوا آرام و صاف بود."),
                StoryParagraph("Everyone was excited about the journey.", "همه درباره سفر هیجان‌زده بودند.")
            )),
            StoryChapter(3, "Life on Board", "زندگی در کشتی", listOf(
                StoryParagraph("The passengers enjoyed the voyage.", "مسافران از سفر لذت می‌بردند."),
                StoryParagraph("They ate fancy dinners every night.", "هر شب شام‌های مجللی می‌خوردند."),
                StoryParagraph("They danced and listened to music.", "می‌رقصیدند و به موسیقی گوش می‌دادند."),
                StoryParagraph("Children played on the decks.", "بچه‌ها روی عرشه‌ها بازی می‌کردند."),
                StoryParagraph("Rich passengers talked about their money.", "مسافران ثروتمند درباره پولشان صحبت می‌کردند."),
                StoryParagraph("Poor passengers traveled in small rooms below.", "مسافران فقیر در اتاق‌های کوچک پایین سفر می‌کردند."),
                StoryParagraph("But everyone was on the same ship.", "اما همه روی یک کشتی بودند."),
                StoryParagraph("The crew worked hard day and night.", "خدمه شبانه‌روز سخت کار می‌کردند."),
                StoryParagraph("They served food and cleaned the rooms.", "غذا سرو می‌کردند و اتاق‌ها را تمیز می‌کردند."),
                StoryParagraph("For a few days, everything was perfect.", "برای چند روز، همه چیز کامل بود.")
            )),
            StoryChapter(4, "The Iceberg", "کوه یخ", listOf(
                StoryParagraph("On the night of April 14, the sea was calm.", "شب ۱۴ آوریل، دریا آرام بود."),
                StoryParagraph("But there were icebergs in the water.", "اما کوه‌های یخ در آب بودند."),
                StoryParagraph("The lookouts watched from high up.", "دیده‌بان‌ها از بالا تماشا می‌کردند."),
                StoryParagraph("At 11:40 PM, they saw a huge iceberg.", "ساعت ۱۱:۴۰ شب، کوه یخ عظیمی دیدند."),
                StoryParagraph("They rang the warning bell loudly.", "آن‌ها زنگ هشدار را با صدای بلند زدند."),
                StoryParagraph("The ship tried to turn away.", "کشتی تلاش کرد دور بزند."),
                StoryParagraph("But it was too close.", "اما خیلی نزدیک بود."),
                StoryParagraph("The iceberg hit the side of the ship.", "کوه یخ به کنار کشتی خورد."),
                StoryParagraph("It made a long cut below the water.", "بریدگی طولانی زیر آب ایجاد کرد."),
                StoryParagraph("Water began to pour into the ship.", "آب شروع کرد به ریختن داخل کشتی.")
            )),
            StoryChapter(5, "The Sinking", "غرق شدن", listOf(
                StoryParagraph("The captain learned the ship was sinking.", "کاپیتان فهمید کشتی در حال غرق شدن است."),
                StoryParagraph("He ordered the lifeboats to be prepared.", "دستور داد قایق‌های نجات آماده شوند."),
                StoryParagraph("There were not enough lifeboats for everyone.", "قایق‌های نجات برای همه کافی نبود."),
                StoryParagraph("Women and children were put in first.", "اول زنان و کودکان را سوار کردند."),
                StoryParagraph("The band played music to keep people calm.", "گروه موسیقی می‌نواخت تا مردم آرام بمانند."),
                StoryParagraph("Many people were very brave.", "افراد زیادی خیلی شجاع بودند."),
                StoryParagraph("Some men gave their places to others.", "بعضی مردان جایشان را به دیگران دادند."),
                StoryParagraph("The ship broke in two pieces.", "کشتی به دو تکه شکست."),
                StoryParagraph("At 2:20 AM, it sank into the sea.", "ساعت ۲:۲۰ بامداد، در دریا غرق شد."),
                StoryParagraph("More than 1,500 people died that night.", "بیش از ۱۵۰۰ نفر آن شب مردند.")
            )),
            StoryChapter(6, "The Rescue", "نجات", listOf(
                StoryParagraph("Another ship was nearby.", "کشتی دیگری نزدیک بود."),
                StoryParagraph("Its name was the Carpathia.", "اسمش کارپاتیا بود."),
                StoryParagraph("It heard the distress calls for help.", "پیام‌های کمک را شنید."),
                StoryParagraph("The captain turned the ship around.", "کاپیتان کشتی را چرخاند."),
                StoryParagraph("It raced through the dangerous ice.", "از میان یخ‌های خطرناک شتافت."),
                StoryParagraph("It reached the lifeboats at dawn.", "در سپیده‌دم به قایق‌های نجات رسید."),
                StoryParagraph("The survivors were pulled on board.", "بازماندگان را سوار کردند."),
                StoryParagraph("They were cold, wet, and very afraid.", "آن‌ها سرد، خیس و خیلی ترسیده بودند."),
                StoryParagraph("The Carpathia took them to New York.", "کارپاتیا آن‌ها را به نیویورک برد."),
                StoryParagraph("Thousands of people waited at the docks.", "هزاران نفر در اسکله منتظر بودند.")
            )),
            StoryChapter(7, "The Lesson", "درس", listOf(
                StoryParagraph("The world was shocked by the disaster.", "دنیا از این فاجعه شوکه شد."),
                StoryParagraph("People asked how this could happen.", "مردم پرسیدند این چطور ممکن است."),
                StoryParagraph("New laws were made for ships at sea.", "قوانین جدیدی برای کشتی‌ها در دریا وضع شد."),
                StoryParagraph("Every ship had to have enough lifeboats.", "هر کشتی باید قایق‌های نجات کافی داشته باشد."),
                StoryParagraph("Radios had to be on all day and night.", "رادیوها باید شبانه‌روز روشن باشند."),
                StoryParagraph("Lookouts had to watch for ice more carefully.", "دیده‌بان‌ها باید با دقت بیشتری مراقب یخ باشند."),
                StoryParagraph("The Titanic was never forgotten.", "تایتانیک هرگز فراموش نشد."),
                StoryParagraph("Books and movies were made about it.", "کتاب‌ها و فیلم‌هایی درباره‌اش ساخته شدند."),
                StoryParagraph("In 1985, the ship was found on the ocean floor.", "در سال ۱۹۸۵، کشتی در کف اقیانوس پیدا شد."),
                StoryParagraph("It remains there as a reminder of the past.", "آن به عنوان یادآور گذشته آنجا باقی مانده است.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۸: مرد فیل‌نما
    // ═══════════════════════════════════════════════════════
    private fun story18() = StoryContent(
        storyId = "elephant_man",
        chapters = listOf(
            StoryChapter(1, "A Strange Man", "مردی عجیب", listOf(
                StoryParagraph("Joseph Merrick was born in Leicester, England.", "جوزف مریک در لسترشایر انگلیس به دنیا آمد."),
                StoryParagraph("He was a normal baby at first.", "اول بچه‌ای عادی بود."),
                StoryParagraph("But as he grew, his body changed.", "اما وقتی بزرگ شد، بدنش تغییر کرد."),
                StoryParagraph("His head became very large.", "سرش خیلی بزرگ شد."),
                StoryParagraph("His skin became thick and lumpy.", "پوستش ضخیم و برجسته شد."),
                StoryParagraph("His right arm was much bigger than his left.", "دست راستش خیلی بزرگ‌تر از چپش بود."),
                StoryParagraph("Doctors did not know what was wrong.", "دکترها نمی‌دانستند مشکل چیست."),
                StoryParagraph("People stared at him in the street.", "مردم در خیابان خیره نگاهش می‌کردند."),
                StoryParagraph("Some people laughed at him.", "بعضی مردم مسخره‌اش می‌کردند."),
                StoryParagraph("Life was very hard for him.", "زندگی برایش خیلی سخت بود.")
            )),
            StoryChapter(2, "The Freak Show", "نمایش عجایب", listOf(
                StoryParagraph("When Joseph was a young man, he had no job.", "وقتی جوزف جوان بود، شغلی نداشت."),
                StoryParagraph("He had to make money somehow.", "باید به نحوی پول درمی‌آورد."),
                StoryParagraph("A man offered him work in a freak show.", "مردی در نمایش عجایب کاری به او پیشنهاد داد."),
                StoryParagraph("People paid to look at him.", "مردم پول می‌دادند تا نگاهش کنند."),
                StoryParagraph("They called him the Elephant Man.", "آن‌ها او را مرد فیل‌نما نامیدند."),
                StoryParagraph("Joseph hated being stared at.", "جوزف از خیره نگاه شدن متنفر بود."),
                StoryParagraph("But he needed the money to survive.", "اما برای زنده ماندن به پول نیاز داشت."),
                StoryParagraph("He traveled from city to city.", "او از شهری به شهر دیگر سفر می‌کرد."),
                StoryParagraph("Some people were kind to him.", "بعضی مردم با او مهربان بودند."),
                StoryParagraph("But most people were cruel.", "اما بیشتر مردم ظالم بودند.")
            )),
            StoryChapter(3, "Dr. Treves", "دکتر تریوز", listOf(
                StoryParagraph("A doctor named Frederick Treves saw him.", "دکتری به نام فردریک تریوز او را دید."),
                StoryParagraph("He was a surgeon at a London hospital.", "او جراح بیمارستانی در لندن بود."),
                StoryParagraph("He was shocked by Joseph's condition.", "او از وضعیت جوزف شوکه شد."),
                StoryParagraph("He asked Joseph to come to the hospital.", "او از جوزف خواست به بیمارستان بیاید."),
                StoryParagraph("Joseph was afraid at first.", "جوزف اول ترسید."),
                StoryParagraph("But Dr. Treves was very kind.", "اما دکتر تریوز خیلی مهربان بود."),
                StoryParagraph("He treated Joseph like a human being.", "او با جوزف مثل یک انسان رفتار کرد."),
                StoryParagraph("Joseph had never been treated like that.", "با جوزف هرگز اینطور رفتار نشده بود."),
                StoryParagraph("He agreed to go to the hospital.", "او موافقت کرد به بیمارستان برود."),
                StoryParagraph("It was the start of a new life.", "این شروع یک زندگی جدید بود.")
            )),
            StoryChapter(4, "A Home at the Hospital", "خانه‌ای در بیمارستان", listOf(
                StoryParagraph("The hospital gave Joseph two rooms.", "بیمارستان دو اتاق به جوزف داد."),
                StoryParagraph("They were quiet and comfortable.", "آرام و راحت بودند."),
                StoryParagraph("He had a bed, a chair, and a window.", "تختی، صندلی و پنجره‌ای داشت."),
                StoryParagraph("He could look out at the sky and trees.", "می‌توانست به آسمان و درخت‌ها نگاه کند."),
                StoryParagraph("Dr. Treves visited him every day.", "دکتر تریوز هر روز به دیدنش می‌رفت."),
                StoryParagraph("They became close friends.", "آن‌ها دوستان نزدیکی شدند."),
                StoryParagraph("Joseph read books and wrote letters.", "جوزف کتاب می‌خواند و نامه می‌نوشت."),
                StoryParagraph("He was very intelligent.", "او خیلی باهوش بود."),
                StoryParagraph("He loved poetry and art.", "عاشق شعر و هنر بود."),
                StoryParagraph("For the first time, he was happy.", "برای اولین بار، خوشحال بود.")
            )),
            StoryChapter(5, "New Friends", "دوستان جدید", listOf(
                StoryParagraph("A famous actress came to visit Joseph.", "بازیگر معروفی به دیدن جوزف آمد."),
                StoryParagraph("Her name was Madge Kendal.", "اسمش مج کندال بود."),
                StoryParagraph("She was beautiful and kind.", "او زیبا و مهربان بود."),
                StoryParagraph("She gave Joseph a small gift.", "او هدیه کوچکی به جوزف داد."),
                StoryParagraph("She wrote him letters often.", "او اغلب برایش نامه می‌نوشت."),
                StoryParagraph("Other important people came too.", "افراد مهم دیگری هم آمدند."),
                StoryParagraph("A princess came to meet him.", "شاهزاده‌خانمی برای ملاقاتش آمد."),
                StoryParagraph("Joseph was treated like a gentleman.", "با جوزف مثل یک جنتلمن رفتار می‌شد."),
                StoryParagraph("He was no longer just a curiosity.", "او دیگر فقط یک کنجکاوی نبود."),
                StoryParagraph("He was a person with feelings.", "او شخصی با احساسات بود.")
            )),
            StoryChapter(6, "The Sad End", "پایان غم‌انگیز", listOf(
                StoryParagraph("Joseph's health became worse.", "سلامت جوزف بدتر شد."),
                StoryParagraph("His head was heavy and caused him pain.", "سرش سنگین بود و دردش می‌داد."),
                StoryParagraph("He could not sleep lying down.", "او نمی‌توانست دراز کشیده بخوابد."),
                StoryParagraph("He had to sit up to rest.", "باید می‌نشست تا استراحت کند."),
                StoryParagraph("One night, he tried to sleep in his bed.", "یک شب، تلاش کرد در تختش بخوابد."),
                StoryParagraph("His neck was too weak.", "گردنش خیلی ضعیف بود."),
                StoryParagraph("His head fell back and broke his neck.", "سرش به عقب افتاد و گردنش شکست."),
                StoryParagraph("He died quietly in his sleep.", "او در خواب آرام مرد."),
                StoryParagraph("Dr. Treves was very sad.", "دکتر تریوز خیلی غمگین شد."),
                StoryParagraph("He had lost a dear friend.", "او دوست عزیزی را از دست داده بود.")
            )),
            StoryChapter(7, "The Legacy", "میراث", listOf(
                StoryParagraph("Joseph was only twenty-seven years old.", "جوزف فقط بیست و هفت سال داشت."),
                StoryParagraph("His skeleton was kept at the hospital.", "اسکلتش در بیمارستان نگه داشته شد."),
                StoryParagraph("For many years, doctors studied it.", "سال‌ها دکترها آن را مطالعه کردند."),
                StoryParagraph("They learned about his disease.", "آن‌ها درباره بیماری‌اش یاد گرفتند."),
                StoryParagraph("His story was written in books.", "داستانش در کتاب‌ها نوشته شد."),
                StoryParagraph("A famous play and movie were made.", "نمایش و فیلم معروفی ساخته شد."),
                StoryParagraph("People learned to be kind to others.", "مردم یاد گرفتند با دیگران مهربان باشند."),
                StoryParagraph("Different does not mean lesser.", "متفاوت بودن یعنی کمتر بودن نیست."),
                StoryParagraph("Everyone deserves respect and love.", "همه لایق احترام و عشق هستند."),
                StoryParagraph("And so Joseph was finally remembered.", "و اینگونه جوزف بالاخره به یاد آورده شد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۱۹: سفر به مرکز زمین
    // ═══════════════════════════════════════════════════════
    private fun story19() = StoryContent(
        storyId = "journey_center_earth",
        chapters = listOf(
            StoryChapter(1, "The Secret Message", "پیام مخفی", listOf(
                StoryParagraph("Professor Lidenbrock was a German scientist.", "پروفسور لیدنبروک دانشمند آلمانی بود."),
                StoryParagraph("He loved old books and geology.", "عاشق کتاب‌های قدیمی و زمین‌شناسی بود."),
                StoryParagraph("One day, he bought an old book.", "یک روز، کتابی قدیمی خرید."),
                StoryParagraph("A note fell out of it.", "یادداشتی از آن افتاد."),
                StoryParagraph("The note was written in a secret code.", "یادداشت با رمزی مخفی نوشته شده بود."),
                StoryParagraph("His nephew Axel solved the code.", "خواهرزاده‌اش اکسل رمز را حل کرد."),
                StoryParagraph("The message was from a famous explorer.", "پیام از کاشف معروفی بود."),
                StoryParagraph("He said he had gone to the center of the Earth.", "او گفت به مرکز زمین رفته است."),
                StoryParagraph("He entered through a volcano in Iceland.", "او از آتشفشانی در ایسلند وارد شده بود."),
                StoryParagraph("The professor wanted to follow him.", "پروفسور می‌خواست دنبالش کند.")
            )),
            StoryChapter(2, "The Journey to Iceland", "سفر به ایسلند", listOf(
                StoryParagraph("The professor and Axel traveled to Iceland.", "پروفسور و اکسل به ایسلند سفر کردند."),
                StoryParagraph("They hired a guide named Hans.", "راهنمایی به نام هانس استخدام کردند."),
                StoryParagraph("Hans was quiet and strong.", "هانس ساکت و قوی بود."),
                StoryParagraph("He knew the mountains very well.", "او کوه‌ها را خیلی خوب می‌شناخت."),
                StoryParagraph("They walked to the volcano Sneffels.", "آن‌ها به آتشفشان اسنفل رفتند."),
                StoryParagraph("It was covered in snow and ice.", "پوشیده از برف و یخ بود."),
                StoryParagraph("They climbed to the top.", "آن‌ها به قله صعود کردند."),
                StoryParagraph("The crater was deep and dark.", "دهانه عمیق و تاریک بود."),
                StoryParagraph("They waited for the right day.", "منتظر روز مناسب ماندند."),
                StoryParagraph("Then they entered the volcano.", "بعد وارد آتشفشان شدند.")
            )),
            StoryChapter(3, "Into the Earth", "به داخل زمین", listOf(
                StoryParagraph("They walked down a long, dark tunnel.", "آن‌ها از تونلی طولانی و تاریک پایین رفتند."),
                StoryParagraph("They used ropes to climb down.", "با طناب پایین رفتند."),
                StoryParagraph("The air became hotter and hotter.", "هوا داغ‌تر و داغ‌تر شد."),
                StoryParagraph("They drank the little water they had.", "کم آبی که داشتند نوشیدند."),
                StoryParagraph("Days passed in the darkness.", "روزها در تاریکی گذشتند."),
                StoryParagraph("Then they ran out of water.", "بعد آبشان تمام شد."),
                StoryParagraph("Axel became very sick.", "اکسل خیلی مریض شد."),
                StoryParagraph("He wanted to give up.", "می‌خواست تسلیم شود."),
                StoryParagraph("But Hans went alone to find water.", "اما هانس تنها رفت آب پیدا کند."),
                StoryParagraph("He came back with good news.", "او با خبر خوب برگشت.")
            )),
            StoryChapter(4, "The Underground World", "دنیای زیرزمینی", listOf(
                StoryParagraph("They found a stream underground.", "چشمه‌ای زیرزمینی پیدا کردند."),
                StoryParagraph("They followed it deeper into the Earth.", "آن را عمیق‌تر دنبال کردند."),
                StoryParagraph("Suddenly, they entered a huge cavern.", "ناگهان، وارد غاری بزرگ شدند."),
                StoryParagraph("It was miles wide and high.", "مایل‌ها وسعت و ارتفاع داشت."),
                StoryParagraph("There was a sun inside the Earth.", "خورشیدی درون زمین بود."),
                StoryParagraph("There was an ocean and clouds.", "اقیانوسی و ابرها بود."),
                StoryParagraph("There were giant mushrooms on the shore.", "قارچ‌های غول‌پیکر در ساحل بودند."),
                StoryParagraph("It was a whole world inside a world.", "دنیایی کامل درون دنیایی بود."),
                StoryParagraph("They built a raft to cross the ocean.", "قایقی ساختند تا از اقیانوس بگذرند."),
                StoryParagraph("They sailed on the underground sea.", "روی دریای زیرزمینی حرکت کردند.")
            )),
            StoryChapter(5, "Prehistoric Creatures", "موجودات ماقبل تاریخ", listOf(
                StoryParagraph("They saw two giant creatures fighting.", "دو موجود غول‌پیکر دیدند که می‌جنگیدند."),
                StoryParagraph("One was like a dinosaur.", "یکی شبیه دایناسور بود."),
                StoryParagraph("The other was like a sea monster.", "دیگری شبیه هیولای دریایی بود."),
                StoryParagraph("The sea monster won the fight.", "هیولای دریایی در نبرد پیروز شد."),
                StoryParagraph("The travelers were terrified.", "مسافران وحشت کردند."),
                StoryParagraph("They hid their raft near the shore.", "قایقشان را نزدیک ساحل پنهان کردند."),
                StoryParagraph("They found bones of ancient animals.", "استخوان‌های حیوانات باستانی پیدا کردند."),
                StoryParagraph("There was also a human skeleton.", "اسکلت انسانی هم بود."),
                StoryParagraph("It was a man from prehistoric times.", "مردی از دوران ماقبل تاریخ بود."),
                StoryParagraph("The professor was very excited.", "پروفسور خیلی هیجان‌زده شد.")
            )),
            StoryChapter(6, "The Return to the Surface", "بازگشت به سطح", listOf(
                StoryParagraph("They found a passage going up.", "مسیری رو به بالا پیدا کردند."),
                StoryParagraph("But a huge rock blocked the way.", "اما صخره‌ای بزرگ راه را بسته بود."),
                StoryParagraph("They tried to move it but it was too heavy.", "تلاش کردند جابجایش کنند اما خیلی سنگین بود."),
                StoryParagraph("Axel suggested using gunpowder.", "اکسل پیشنهاد استفاده از باروت را داد."),
                StoryParagraph("They placed it under the rock.", "آن را زیر صخره گذاشتند."),
                StoryParagraph("The explosion was huge.", "انفجار عظیم بود."),
                StoryParagraph("But the sea rushed into the passage.", "اما دریا به داخل مسیر ریخت."),
                StoryParagraph("They were swept up in a flood.", "آن‌ها در سیلاب کشیده شدند."),
                StoryParagraph("They went up faster and faster.", "سریع‌تر و سریع‌تر بالا رفتند."),
                StoryParagraph("It was like a volcanic eruption.", "مثل فوران آتشفشان بود.")
            )),
            StoryChapter(7, "The End of the Journey", "پایان سفر", listOf(
                StoryParagraph("They were thrown out of a volcano.", "آن‌ها از آتشفشانی پرتاب شدند."),
                StoryParagraph("They landed in the sea near Italy.", "در دریایی نزدیک ایتالیا فرود آمدند."),
                StoryParagraph("They had come out on the other side of Europe.", "از طرف دیگر اروپا بیرون آمده بودند."),
                StoryParagraph("They were weak but alive.", "آن‌ها ضعیف اما زنده بودند."),
                StoryParagraph("The professor was proud of their journey.", "پروفسور به سفرشان افتخار می‌کرد."),
                StoryParagraph("Axel was happy to see the sun again.", "اکسل از دیدن دوباره خورشید خوشحال بود."),
                StoryParagraph("Hans went back to Iceland quietly.", "هانس آرام به ایسلند برگشت."),
                StoryParagraph("The world did not believe their story.", "دنیا داستانشان را باور نکرد."),
                StoryParagraph("But they knew the truth.", "اما آن‌ها حقیقت را می‌دانستند."),
                StoryParagraph("The center of the Earth was a hidden world.", "مرکز زمین دنیایی پنهان بود.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۲۰: رابین هود
    // ═══════════════════════════════════════════════════════
    private fun story20() = StoryContent(
        storyId = "robin_hood",
        chapters = listOf(
            StoryChapter(1, "The Noble Thief", "دزد نجیب‌زاده", listOf(
                StoryParagraph("Robin Hood lived in England long ago.", "رابین هود مدت‌ها پیش در انگلیس زندگی می‌کرد."),
                StoryParagraph("He lived in Sherwood Forest.", "او در جنگل شروود زندگی می‌کرد."),
                StoryParagraph("He was a skilled archer with a bow.", "او کمانداری ماهر با کمان بود."),
                StoryParagraph("He robbed the rich and helped the poor.", "او ثروتمندان را غارت می‌کرد و به فقرا کمک می‌کرد."),
                StoryParagraph("His enemies were the Sheriff of Nottingham.", "دشمنانش کلانتر ناتینگهام بودند."),
                StoryParagraph("Robin had been a nobleman once.", "رابین زمانی نجیب‌زاده بود."),
                StoryParagraph("But the Sheriff took his lands and home.", "اما کلانتر زمین‌ها و خانه‌اش را گرفت."),
                StoryParagraph("So Robin became an outlaw.", "پس رابین یاغی شد."),
                StoryParagraph("He gathered a group of loyal men.", "گروهی از مردان وفادار جمع کرد."),
                StoryParagraph("They became his band of Merry Men.", "آن‌ها گروه مردان شاد او شدند.")
            )),
            StoryChapter(2, "Little John", "لیتل جان", listOf(
                StoryParagraph("One day, Robin met a very tall man.", "یک روز، رابین با مرد خیلی بلندقدی ملاقات کرد."),
                StoryParagraph("The man was standing on a bridge.", "آن مرد روی پلی ایستاده بود."),
                StoryParagraph("Robin wanted to cross the bridge.", "رابین می‌خواست از پل بگذرد."),
                StoryParagraph("But the man would not move.", "اما مرد حرکت نمی‌کرد."),
                StoryParagraph("They fought with long sticks.", "آن‌ها با چوب‌های بلند جنگیدند."),
                StoryParagraph("It was a long and hard fight.", "نبرد طولانی و سختی بود."),
                StoryParagraph("Robin fell into the water.", "رابین در آب افتاد."),
                StoryParagraph("The tall man laughed and helped him out.", "مرد بلندقد خندید و کمکش کرد بیرون بیاید."),
                StoryParagraph("His name was John Little.", "اسمش جان لیتل بود."),
                StoryParagraph("Robin renamed him Little John.", "رابین نامش را لیتل جان گذاشت.")
            )),
            StoryChapter(3, "The Merry Men", "مردان شاد", listOf(
                StoryParagraph("Robin's band grew bigger every day.", "گروه رابین هر روز بزرگ‌تر می‌شد."),
                StoryParagraph("There was Friar Tuck, a fat and jolly priest.", "فرایر تاک، کشیشی چاق و شادمان بود."),
                StoryParagraph("There was Will Scarlet, a quick swordsman.", "ویل اسکارلت، شمشیرزنی سریع بود."),
                StoryParagraph("There was Allan-a-Dale, a sweet singer.", "آلن-ا-دیل، خواننده‌ای خوش‌آواز بود."),
                StoryParagraph("There was Much, the miller's son.", "ماچ، پسر آسیابان بود."),
                StoryParagraph("They lived together in the green forest.", "آن‌ها با هم در جنگل سبز زندگی می‌کردند."),
                StoryParagraph("They slept under the trees at night.", "شب‌ها زیر درختان می‌خوابیدند."),
                StoryParagraph("They ate deer and bread together.", "با هم گوشت گوزن و نان می‌خوردند."),
                StoryParagraph("They sang songs around the fire.", "دور آتش آواز می‌خواندند."),
                StoryParagraph("They were happy and free.", "خوشحال و آزاد بودند.")
            )),
            StoryChapter(4, "Helping the Poor", "کمک به فقرا", listOf(
                StoryParagraph("Robin always helped poor people.", "رابین همیشه به فقرا کمک می‌کرد."),
                StoryParagraph("He stopped rich travelers in the forest.", "او مسافران ثروتمند را در جنگل متوقف می‌کرد."),
                StoryParagraph("He took their gold and jewels.", "طلا و جواهراتشان را می‌گرفت."),
                StoryParagraph("But he never hurt them.", "اما هرگز به آن‌ها آسیب نمی‌رساند."),
                StoryParagraph("He gave the money to the poor.", "پول را به فقرا می‌داد."),
                StoryParagraph("He helped widows and orphans.", "به بیوه‌ها و یتیمان کمک می‌کرد."),
                StoryParagraph("He gave food to hungry families.", "به خانواده‌های گرسنه غذا می‌داد."),
                StoryParagraph("Poor people loved him.", "فقرا دوستش داشتند."),
                StoryParagraph("Rich people feared him.", "ثروتمندان از او می‌ترسیدند."),
                StoryParagraph("He was a hero to the common folk.", "او قهرمان مردم عادی بود.")
            )),
            StoryChapter(5, "The Sheriff's Plan", "نقشه کلانتر", listOf(
                StoryParagraph("The Sheriff wanted to catch Robin.", "کلانتر می‌خواست رابین را بگیرد."),
                StoryParagraph("He set a trap with a golden arrow.", "تله‌ای با تیر طلایی گذاشت."),
                StoryParagraph("He announced an archery contest.", "او مسابقه تیراندازی اعلام کرد."),
                StoryParagraph("The winner would get the golden arrow.", "برنده تیر طلایی را می‌گرفت."),
                StoryParagraph("Robin loved archery contests.", "رابین عاشق مسابقات تیراندازی بود."),
                StoryParagraph("He decided to enter the contest.", "تصمیم گرفت در مسابقه شرکت کند."),
                StoryParagraph("His men warned him it was a trap.", "مردانش هشدار دادند تله است."),
                StoryParagraph("But Robin wanted to win.", "اما رابین می‌خواست برنده شود."),
                StoryParagraph("He disguised himself as a poor beggar.", "او خودش را به عنوان گدای فقیری مبدل کرد."),
                StoryParagraph("He went to Nottingham for the contest.", "او برای مسابقه به ناتینگهام رفت.")
            )),
            StoryChapter(6, "The Archery Contest", "مسابقه تیراندازی", listOf(
                StoryParagraph("Many archers came to the contest.", "کمانداران زیادی به مسابقه آمدند."),
                StoryParagraph("Robin hit the center with every arrow.", "رابین با هر تیر وسط را زد."),
                StoryParagraph("People cheered for the beggar.", "مردم برای گدا هورا کشیدند."),
                StoryParagraph("The Sheriff became suspicious.", "کلانتر مشکوک شد."),
                StoryParagraph("He ordered his guards to catch him.", "دستور داد نگهبانانش بگیرندش."),
                StoryParagraph("Robin blew his horn loudly.", "رابین شاخش را با صدای بلند نواخت."),
                StoryParagraph("His Merry Men came from the forest.", "مردان شادش از جنگل آمدند."),
                StoryParagraph("They fought the guards together.", "آن‌ها با هم با نگهبانان جنگیدند."),
                StoryParagraph("Robin escaped back to the forest.", "رابین به جنگل فرار کرد."),
                StoryParagraph("He had won the golden arrow.", "او تیر طلایی را برده بود.")
            )),
            StoryChapter(7, "The Legend Lives On", "افسانه ادامه می‌یابد", listOf(
                StoryParagraph("Robin lived in the forest for many years.", "رابین سال‌ها در جنگل زندگی کرد."),
                StoryParagraph("He continued to help the poor.", "او به کمک به فقرا ادامه داد."),
                StoryParagraph("He continued to fight the Sheriff.", "به جنگ با کلانتر ادامه داد."),
                StoryParagraph("His name became a legend in England.", "نامش در انگلیس افسانه شد."),
                StoryParagraph("Children heard stories about him.", "بچه‌ها داستان‌هایی درباره‌اش می‌شنیدند."),
                StoryParagraph("People sang songs about his bravery.", "مردم آوازهایی درباره شجاعتش می‌خواندند."),
                StoryParagraph("He stood for justice and kindness.", "او نماینده عدالت و مهربانی بود."),
                StoryParagraph("He showed that one man can make a difference.", "او نشان داد یک نفر می‌تواند تفاوت بسازد."),
                StoryParagraph("His story is told even today.", "داستانش حتی امروز گفته می‌شود."),
                StoryParagraph("And so the legend of Robin Hood lives on.", "و اینگونه افسانه رابین هود ادامه می‌یابد.")
            ))
        )
    )
}