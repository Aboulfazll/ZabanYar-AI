package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۹ — داستان‌های ژول ورن و جاناتان سویفت
 *  ۲۵. سفر به مرکز زمین
 *  ۲۶. بیست هزار فرسنگ زیر دریا
 *  ۲۷. سفرهای گالیور
 */
object Group9 {

    fun getAll(): List<StoryContent> = listOf(
        story25(),
        story26(),
        story27(),
    )

    // ─────────────── ۲۵: سفر به مرکز زمین ───────────────
    private fun story25() = StoryContent(
        storyId = "int_journey_center_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Old Manuscript", titlePersian = "رمز قدیمی",
                paragraphs = listOf(
                    StoryParagraph("Professor Lidenbrock was a famous geologist.", "پروفسور لیدنبروک زمین‌شناس معروفی بود."),
                    StoryParagraph("He lived in Hamburg, Germany.", "او در هامبورگ آلمان زندگی می‌کرد."),
                    StoryParagraph("His nephew Axel lived with him.", "خواهرزاده‌اش اکسل با او زندگی می‌کرد."),
                    StoryParagraph("One day, the professor bought an old book.", "یک روز، پروفسور کتابی قدیمی خرید."),
                    StoryParagraph("It was written by an Icelandic scientist.", "توسط دانشمندی ایسلندی نوشته شده بود."),
                    StoryParagraph("The book was hundreds of years old.", "کتاب صدها سال قدمت داشت."),
                    StoryParagraph("A note fell out of the book.", "یادداشتی از کتاب افتاد."),
                    StoryParagraph("It was written in a secret code.", "با رمزی مخفی نوشته شده بود."),
                    StoryParagraph("The professor worked on the code for days.", "پروفسور روزها روی رمز کار کرد."),
                    StoryParagraph("He could not solve it.", "نمی‌توانست حلش کند."),
                    StoryParagraph("Axel finally solved it by accident.", "اکسل بالاخره تصادفی حلش کرد."),
                    StoryParagraph("The message was from the old scientist.", "پیام از دانشمند قدیمی بود."),
                    StoryParagraph("It said he had gone to the center of the Earth.", "می‌گفت او به مرکز زمین رفته است."),
                    StoryParagraph("He had entered through a volcano in Iceland.", "او از طریق آتشفشانی در ایسلند وارد شده بود."),
                    StoryParagraph("The professor was very excited.", "پروفسور خیلی هیجان‌زده شد."),
                    StoryParagraph("He decided to follow the same path.", "او تصمیم گرفت همان مسیر را دنبال کند."),
                    StoryParagraph("Axel was afraid and did not want to go.", "اکسل ترسیده بود و نمی‌خواست برود."),
                    StoryParagraph("But the professor insisted.", "اما پروفسور اصرار کرد."),
                    StoryParagraph("They prepared for the dangerous journey.", "آن‌ها برای سفر خطرناک آماده شدند."),
                    StoryParagraph("They left for Iceland in a few days.", "آن‌ها چند روز بعد به ایسلند رفتند.")
                )
            ),
            StoryChapter(
                number = 2, title = "Into the Volcano", titlePersian = "ورود به آتشفشان",
                paragraphs = listOf(
                    StoryParagraph("In Iceland, they hired a guide named Hans.", "در ایسلند، راهنمایی به نام هانس استخدام کردند."),
                    StoryParagraph("Hans was strong and calm.", "هانس قوی و آرام بود."),
                    StoryParagraph("He did not talk much.", "او زیاد صحبت نمی‌کرد."),
                    StoryParagraph("They traveled to the volcano called Sneffels.", "آن‌ها به آتشفشانی به نام اسنفل سفر کردند."),
                    StoryParagraph("It was a tall mountain covered in snow.", "کوهی بلند پوشیده از برف بود."),
                    StoryParagraph("The crater was deep and dark.", "دهانه‌اش عمیق و تاریک بود."),
                    StoryParagraph("They waited for the right day.", "آن‌ها منتظر روز مناسب ماندند."),
                    StoryParagraph("The shadow of a nearby mountain had to fall.", "سایه کوهی نزدیک باید می‌افتاد."),
                    StoryParagraph("They entered the crater on the right day.", "آن‌ها در روز مناسب وارد دهانه شدند."),
                    StoryParagraph("The descent was steep and dangerous.", "پایین رفتن شیب‌دار و خطرناک بود."),
                    StoryParagraph("They used ropes to climb down.", "آن‌ها با طناب پایین رفتند."),
                    StoryParagraph("The walls were hot and smoky.", "دیوارها داغ و دودی بودند."),
                    StoryParagraph("They reached the bottom of the crater.", "آن‌ها به ته دهانه رسیدند."),
                    StoryParagraph("There were three tunnels going down.", "سه تونل به پایین می‌رفت."),
                    StoryParagraph("The professor chose the one to the east.", "پروفسور تونل شرقی را انتخاب کرد."),
                    StoryParagraph("The path went deeper and deeper.", "مسیر عمیق‌تر و عمیق‌تر می‌رفت."),
                    StoryParagraph("The air became very hot.", "هوا خیلی گرم شد."),
                    StoryParagraph("They drank the little water they had.", "آن‌ها کم آبی که داشتند را نوشیدند."),
                    StoryParagraph("Days passed in the dark tunnels.", "روزها در تونل‌های تاریک گذشت."),
                    StoryParagraph("They did not know where they were.", "آن‌ها نمی‌دانستند کجا هستند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Underground World", titlePersian = "دنیای زیرزمینی",
                paragraphs = listOf(
                    StoryParagraph("They ran out of water.", "آبشان تمام شد."),
                    StoryParagraph("Axel became very sick.", "اکسل خیلی مریض شد."),
                    StoryParagraph("He wanted to give up and die.", "می‌خواست تسلیم شود و بمیرد."),
                    StoryParagraph("Hans went alone to find water.", "هانس تنها رفت آب پیدا کند."),
                    StoryParagraph("He came back many hours later.", "ساعت‌ها بعد برگشت."),
                    StoryParagraph("He had found a stream underground.", "او چشمه‌ای زیرزمینی پیدا کرده بود."),
                    StoryParagraph("They followed the stream deeper.", "آن‌ها عمیق‌تر دنبال چشمه رفتند."),
                    StoryParagraph("Suddenly, they entered a huge cavern.", "ناگهان، وارد غاری بزرگ شدند."),
                    StoryParagraph("The cavern was miles wide.", "غار مایل‌ها وسعت داشت."),
                    StoryParagraph("There was a sun inside the Earth.", "خورشیدی داخل زمین بود."),
                    StoryParagraph("It gave light to a whole world.", "نوری به یک دنیای کامل می‌داد."),
                    StoryParagraph("There was an ocean underground.", "اقیانوسی زیرزمینی بود."),
                    StoryParagraph("There were clouds in the sky.", "ابرها در آسمان بودند."),
                    StoryParagraph("It was like a world inside the world.", "مثل دنیایی داخل دنیا بود."),
                    StoryParagraph("They built a raft to cross the ocean.", "آن‌ها قایقی ساختند تا از اقیانوس بگذرند."),
                    StoryParagraph("They sailed on the underground sea.", "آن‌ها روی دریای زیرزمینی حرکت کردند."),
                    StoryParagraph("Giant mushrooms grew on the shore.", "قارچ‌های غول‌پیکر در ساحل می‌روییدند."),
                    StoryParagraph("Strange creatures lived in the water.", "موجودات عجیبی در آب زندگی می‌کردند."),
                    StoryParagraph("Axel could not believe his eyes.", "اکسل نمی‌توانست چشمانش را باور کند."),
                    StoryParagraph("They had discovered a hidden world.", "آن‌ها دنیایی پنهان کشف کرده بودند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Prehistoric Giants", titlePersian = "دایناسورها",
                paragraphs = listOf(
                    StoryParagraph("One day, they saw something amazing.", "یک روز، چیز شگفت‌انگیزی دیدند."),
                    StoryParagraph("Two giant creatures were fighting.", "دو موجود غول‌پیکر می‌جنگیدند."),
                    StoryParagraph("One was like a dinosaur.", "یکی شبیه دایناسور بود."),
                    StoryParagraph("The other was like a sea monster.", "دیگری شبیه هیولای دریایی بود."),
                    StoryParagraph("The sea monster won the fight.", "هیولای دریایی در نبرد پیروز شد."),
                    StoryParagraph("The travelers were terrified.", "مسافران وحشت کردند."),
                    StoryParagraph("They hid their raft near the shore.", "آن‌ها قایقشان را نزدیک ساحل پنهان کردند."),
                    StoryParagraph("But the monster attacked the raft.", "اما هیولا به قایق حمله کرد."),
                    StoryParagraph("The raft was thrown high in the air.", "قایق در هوا پرتاب شد."),
                    StoryParagraph("They fell into the water.", "آن‌ها در آب افتادند."),
                    StoryParagraph("They swam to shore with difficulty.", "به سختی به ساحل شنا کردند."),
                    StoryParagraph("They had lost most of their supplies.", "بیشتر آذوقه‌شان را از دست داده بودند."),
                    StoryParagraph("They found a forest of giant plants.", "جنگلی از گیاهان غول‌پیکر پیدا کردند."),
                    StoryParagraph("There were trees taller than buildings.", "درختانی بلندتر از ساختمان‌ها بودند."),
                    StoryParagraph("They saw a human skeleton.", "اسکلت انسانی دیدند."),
                    StoryParagraph("It was a prehistoric man.", "مردی ماقبل تاریخ بود."),
                    StoryParagraph("The professor was very excited.", "پروفسور خیلی هیجان‌زده شد."),
                    StoryParagraph("They had found proof of an ancient world.", "آن‌ها مدرکی از دنیای باستانی پیدا کرده بودند."),
                    StoryParagraph("But they had to find a way out.", "اما باید راه خروجی پیدا می‌کردند."),
                    StoryParagraph("They were still trapped underground.", "آن‌ها هنوز زیر زمین گیر افتاده بودند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Return to the Surface", titlePersian = "بازگشت به سطح",
                paragraphs = listOf(
                    StoryParagraph("They found a passage going up.", "آن‌ها مسیری رو به بالا پیدا کردند."),
                    StoryParagraph("But there was a problem.", "اما مشکلی بود."),
                    StoryParagraph("A huge rock was blocking the way.", "صخره‌ای بزرگ راه را بسته بود."),
                    StoryParagraph("They tried to move it, but it was too heavy.", "تلاش کردند جابجایش کنند، اما خیلی سنگین بود."),
                    StoryParagraph("Axel suggested using gunpowder.", "اکسل پیشنهاد استفاده از باروت را داد."),
                    StoryParagraph("They placed it under the rock.", "آن‌ها آن را زیر صخره گذاشتند."),
                    StoryParagraph("The explosion was huge.", "انفجار عظیم بود."),
                    StoryParagraph("The rock broke into pieces.", "صخره تکه‌تکه شد."),
                    StoryParagraph("But the sea rushed into the passage.", "اما دریا به داخل مسیر ریخت."),
                    StoryParagraph("They were swept up in a flood.", "آن‌ها در سیلاب کشیده شدند."),
                    StoryParagraph("They went up faster and faster.", "سریع‌تر و سریع‌تر بالا رفتند."),
                    StoryParagraph("It was like a volcanic eruption.", "مثل فوران آتشفشان بود."),
                    StoryParagraph("They were thrown out of a volcano.", "آن‌ها از آتشفشانی پرتاب شدند."),
                    StoryParagraph("They landed in the sea near Italy.", "آن‌ها در دریایی نزدیک ایتالیا فرود آمدند."),
                    StoryParagraph("They had come out on the other side of Europe.", "آن‌ها از طرف دیگر اروپا بیرون آمده بودند."),
                    StoryParagraph("They were weak but alive.", "آن‌ها ضعیف اما زنده بودند."),
                    StoryParagraph("The professor was proud of their journey.", "پروفسور به سفرشان افتخار می‌کرد."),
                    StoryParagraph("Axel was happy to see the sun again.", "اکسل از دیدن دوباره خورشید خوشحال بود."),
                    StoryParagraph("They had discovered a hidden world.", "آن‌ها دنیایی پنهان کشف کرده بودند."),
                    StoryParagraph("And no one could deny it.", "و هیچ‌کس نمی‌توانست انکارش کند.")
                )
            )
        )
    )

    // ─────────────── ۲۶: بیست هزار فرسنگ زیر دریا ───────────────
    private fun story26() = StoryContent(
        storyId = "int_20000_leagues",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Mysterious Ship", titlePersian = "کشتی مرموز",
                paragraphs = listOf(
                    StoryParagraph("In 1866, strange things happened at sea.", "در سال ۱۸۶۶، چیزهای عجیبی در دریا اتفاق افتاد."),
                    StoryParagraph("Several ships saw a giant sea creature.", "چند کشتی موجود دریایی غول‌پیکری دیدند."),
                    StoryParagraph("It was much bigger than a whale.", "خیلی بزرگتر از نهنگ بود."),
                    StoryParagraph("It glowed with a strange light.", "با نوری عجیب می‌درخشید."),
                    StoryParagraph("Some ships were damaged by it.", "بعضی کشتی‌ها توسط آن آسیب دیدند."),
                    StoryParagraph("People were afraid to travel by sea.", "مردم می‌ترسیدند با دریا سفر کنند."),
                    StoryParagraph("The government sent a ship to find it.", "دولت کشتی‌ای برای پیدا کردنش فرستاد."),
                    StoryParagraph("The ship was called the Abraham Lincoln.", "اسم کشتی آبراهام لینکلن بود."),
                    StoryParagraph("On board was a French scientist.", "دانشمندی فرانسوی روی عرشه بود."),
                    StoryParagraph("His name was Professor Pierre Aronnax.", "اسمش پروفسور پیر آروناکس بود."),
                    StoryParagraph("His servant Conseil came with him.", "خدمتکارش کنسی ی با او آمد."),
                    StoryParagraph("A Canadian harpooner also joined them.", "یک نیزه‌انداز کانادایی هم به آن‌ها پیوست."),
                    StoryParagraph("His name was Ned Land.", "اسمش ند لند بود."),
                    StoryParagraph("Ned was tall and strong.", "ند بلندقد و قوی بود."),
                    StoryParagraph("He was the best harpooner in the world.", "او بهترین نیزه‌انداز جهان بود."),
                    StoryParagraph("They searched the ocean for weeks.", "آن‌ها هفته‌ها اقیانوس را گشتند."),
                    StoryParagraph("Then one night, they saw the creature.", "بعد یک شب، موجود را دیدند."),
                    StoryParagraph("It was glowing in the dark water.", "در آب تاریک می‌درخشید."),
                    StoryParagraph("Ned threw his harpoon at it.", "ند نیزه‌اش را به سمتش پرت کرد."),
                    StoryParagraph("But the harpoon bounced off.", "اما نیزه برگشت خورد.")
                )
            ),
            StoryChapter(
                number = 2, title = "Captain Nemo", titlePersian = "ناخدا نمو",
                paragraphs = listOf(
                    StoryParagraph("The creature attacked the ship.", "موجود به کشتی حمله کرد."),
                    StoryParagraph("Aronnax, Conseil, and Ned fell into the sea.", "آروناکس، کنسی ی و ند در دریا افتادند."),
                    StoryParagraph("They swam for hours.", "آن‌ها ساعت‌ها شنا کردند."),
                    StoryParagraph("They thought they would die.", "فکر کردند می‌میرند."),
                    StoryParagraph("Then they found something metal.", "بعد چیزی فلزی پیدا کردند."),
                    StoryParagraph("It was the top of a submarine.", "بالای یک زیردریایی بود."),
                    StoryParagraph("They climbed on top of it.", "آن‌ها رویش بالا رفتند."),
                    StoryParagraph("A door opened and men came out.", "دری باز شد و مردانی بیرون آمدند."),
                    StoryParagraph("They were taken inside the submarine.", "آن‌ها را به داخل زیردریایی بردند."),
                    StoryParagraph("The submarine was called the Nautilus.", "اسم زیردریایی ناتیلوس بود."),
                    StoryParagraph("Its captain was named Nemo.", "کاپیتانش نمو نام داشت."),
                    StoryParagraph("Captain Nemo was tall and mysterious.", "ناخدا نمو بلندقد و مرموز بود."),
                    StoryParagraph("He spoke many languages.", "او به زبان‌های زیادی صحبت می‌کرد."),
                    StoryParagraph("He had built the Nautilus himself.", "او خودش ناتیلوس را ساخته بود."),
                    StoryParagraph("He had left the world of men.", "او دنیای انسان‌ها را ترک کرده بود."),
                    StoryParagraph("He lived only in the ocean.", "او فقط در اقیانوس زندگی می‌کرد."),
                    StoryParagraph("He did not want to return to land.", "نمی‌خواست به خشکی برگردد."),
                    StoryParagraph("He asked them to stay with him.", "او از آن‌ها خواست با او بمانند."),
                    StoryParagraph("But they could never leave the Nautilus.", "اما آن‌ها هرگز نمی‌توانستند ناتیلوس را ترک کنند."),
                    StoryParagraph("They had become his prisoners.", "آن‌ها زندانی‌اش شده بودند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Underwater Journey", titlePersian = "ماجرا زیر دریا",
                paragraphs = listOf(
                    StoryParagraph("The Nautilus traveled under the sea.", "ناتیلوس زیر دریا سفر می‌کرد."),
                    StoryParagraph("It went through a window in the hull.", "از پنجره‌ای در بدنه بیرون را می‌دیدند."),
                    StoryParagraph("They saw amazing things.", "آن‌ها چیزهای شگفت‌انگیزی دیدند."),
                    StoryParagraph("There were forests of coral.", "جنگل‌هایی از مرجان بود."),
                    StoryParagraph("There were colorful fish everywhere.", "همه‌جا ماهی‌های رنگی بودند."),
                    StoryParagraph("They saw sunken ships.", "آن‌ها کشتی‌های غرق‌شده دیدند."),
                    StoryParagraph("They saw an underwater volcano.", "آتشفشانی زیرآبی دیدند."),
                    StoryParagraph("They even walked on the ocean floor.", "آن‌ها حتی روی کف اقیانوس راه رفتند."),
                    StoryParagraph("They wore special diving suits.", "آن‌ها لباس‌های غواصی مخصوص می‌پوشیدند."),
                    StoryParagraph("They explored the lost city of Atlantis.", "آن‌ها شهر گمشده آتلانتیس را کاوش کردند."),
                    StoryParagraph("Captain Nemo loved the ocean.", "ناخدا نمو عاشق اقیانوس بود."),
                    StoryParagraph("He said the ocean was his country.", "او می‌گفت اقیانوس کشورش است."),
                    StoryParagraph("But he was also a dangerous man.", "اما او مرد خطرناکی هم بود."),
                    StoryParagraph("He hated the nations of the world.", "او از ملت‌های جهان نفرت داشت."),
                    StoryParagraph("He wanted revenge on them.", "او می‌خواست از آن‌ها انتقام بگیرد."),
                    StoryParagraph("The Nautilus sank ships on purpose.", "ناتیلوس عمداً کشتی‌ها را غرق می‌کرد."),
                    StoryParagraph("Hundreds of sailors died.", "صدها ملوان مردند."),
                    StoryParagraph("Aronnax did not agree with this.", "آروناکس با این موافق نبود."),
                    StoryParagraph("He wanted to escape.", "او می‌خواست فرار کند."),
                    StoryParagraph("But escape was impossible.", "اما فرار غیرممکن بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "Escape from the Nautilus", titlePersian = "فرار نهایی",
                paragraphs = listOf(
                    StoryParagraph("The Nautilus traveled to the South Pole.", "ناتیلوس به قطب جنوب سفر کرد."),
                    StoryParagraph("They were the first to reach it.", "آن‌ها اولین کسانی بودند که به آن رسیدند."),
                    StoryParagraph("But the submarine got stuck in ice.", "اما زیردریایی در یخ گیر کرد."),
                    StoryParagraph("The crew worked hard to free it.", "خدمه سخت تلاش کردند آزادش کنند."),
                    StoryParagraph("They used hot water to melt the ice.", "آن‌ها از آب گرم برای ذوب یخ استفاده کردند."),
                    StoryParagraph("Finally, the Nautilus was free.", "بالاخره، ناتیلوس آزاد شد."),
                    StoryParagraph("But the air was running out.", "اما هوا تمام می‌شد."),
                    StoryParagraph("They had to reach the surface quickly.", "آن‌ها باید سریع به سطح می‌رسیدند."),
                    StoryParagraph("They found a giant squid.", "آن‌ها ماهی مرکب غول‌پیکری پیدا کردند."),
                    StoryParagraph("The squid attacked the Nautilus.", "ماهی مرکب به ناتیلوس حمله کرد."),
                    StoryParagraph("The crew fought it with axes.", "خدمه با تبر با آن جنگیدند."),
                    StoryParagraph("One sailor was killed.", "یکی از ملوانان کشته شد."),
                    StoryParagraph("Captain Nemo was very sad.", "ناخدا نمو خیلی غمگین شد."),
                    StoryParagraph("He cried for his lost friend.", "او برای دوست از دست رفته‌اش گریه کرد."),
                    StoryParagraph("Later, the Nautilus attacked a warship.", "بعد، ناتیلوس به یک کشتی جنگی حمله کرد."),
                    StoryParagraph("Aronnax was horrified.", "آروناکس وحشت کرد."),
                    StoryParagraph("He decided to escape that night.", "او تصمیم گرفت آن شب فرار کند."),
                    StoryParagraph("Ned and Conseil agreed to go with him.", "ند و کنسی ی موافقت کردند با او بروند."),
                    StoryParagraph("They waited for the right moment.", "آن‌ها منتظر لحظه مناسب ماندند."),
                    StoryParagraph("They jumped into a small boat.", "آن‌ها به قایق کوچکی پریدند.")
                )
            ),
            StoryChapter(
                number = 5, title = "Back to the World", titlePersian = "بازگشت به دنیا",
                paragraphs = listOf(
                    StoryParagraph("A great storm hit the sea that night.", "آن شب طوفان بزرگی دریا را گرفت."),
                    StoryParagraph("The small boat was tossed by the waves.", "قایق کوچک توسط امواج پرتاب می‌شد."),
                    StoryParagraph("Aronnax, Conseil, and Ned held on tightly.", "آروناکس، کنسی ی و ند محکم چسبیدند."),
                    StoryParagraph("They lost sight of the Nautilus.", "آن‌ها ناتیلوس را از دید از دست دادند."),
                    StoryParagraph("The storm lasted for hours.", "طوفان ساعت‌ها طول کشید."),
                    StoryParagraph("When it ended, they were near land.", "وقتی تمام شد، نزدیک خشکی بودند."),
                    StoryParagraph("Fishermen found them and helped them.", "ماهیگیران آن‌ها را پیدا کردند و کمک کردند."),
                    StoryParagraph("They returned to France.", "آن‌ها به فرانسه برگشتند."),
                    StoryParagraph("Aronnax wrote a book about their journey.", "آروناکس کتابی درباره سفرشان نوشت."),
                    StoryParagraph("But no one believed his story.", "اما هیچ‌کس داستانش را باور نکرد."),
                    StoryParagraph("They thought he had imagined everything.", "آن‌ها فکر کردند همه چیز را خیال کرده."),
                    StoryParagraph("But he knew the truth.", "اما او حقیقت را می‌دانست."),
                    StoryParagraph("The Nautilus was real.", "ناتیلوس واقعی بود."),
                    StoryParagraph("Captain Nemo was real.", "ناخدا نمو واقعی بود."),
                    StoryParagraph("The underwater world was real.", "دنیای زیرآبی واقعی بود."),
                    StoryParagraph("Ned Land returned to his old life.", "ند لند به زندگی قدیمی‌اش برگشت."),
                    StoryParagraph("Conseil stayed with the professor.", "کنسی ی با پروفسور ماند."),
                    StoryParagraph("Years later, they still thought of Nemo.", "سال‌ها بعد، هنوز به نمو فکر می‌کردند."),
                    StoryParagraph("They wondered what happened to him.", "آن‌ها فکر می‌کردند بر سرش چه آمد."),
                    StoryParagraph("But they never saw him again.", "اما هرگز دوباره ندیدندش.")
                )
            )
        )
    )

    // ─────────────── ۲۷: سفرهای گالیور ───────────────
    private fun story27() = StoryContent(
        storyId = "int_gulliver",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Lilliput", titlePersian = "سرزمین لی‌لی‌پوت",
                paragraphs = listOf(
                    StoryParagraph("Lemuel Gulliver was a ship's doctor.", "لموئل گالیور دکتر کشتی بود."),
                    StoryParagraph("He loved to travel and see new places.", "او عاشق سفر و دیدن مکان‌های جدید بود."),
                    StoryParagraph("One day, his ship was caught in a storm.", "یک روز، کشتی‌اش در طوفان گرفتار شد."),
                    StoryParagraph("The ship crashed into a rock.", "کشتی به صخره‌ای خورد."),
                    StoryParagraph("Gulliver swam for his life.", "گالیور برای زندگی‌اش شنا کرد."),
                    StoryParagraph("He reached a strange island.", "او به جزیره‌ای عجیب رسید."),
                    StoryParagraph("He was very tired and fell asleep.", "او خیلی خسته بود و خوابش برد."),
                    StoryParagraph("When he woke up, he could not move.", "وقتی بیدار شد، نمی‌توانست حرکت کند."),
                    StoryParagraph("Tiny people had tied him to the ground.", "مردم کوچکی او را به زمین بسته بودند."),
                    StoryParagraph("They were only six inches tall.", "آن‌ها فقط شش اینچ قد داشتند."),
                    StoryParagraph("They were called the Lilliputians.", "آن‌ها لی‌لی‌پوتی نامیده می‌شدند."),
                    StoryParagraph("They were afraid of the giant man.", "آن‌ها از مرد غول‌پیکر می‌ترسیدند."),
                    StoryParagraph("They shot tiny arrows at him.", "آن‌ها تیرهای کوچکی به او پرت کردند."),
                    StoryParagraph("Gulliver promised to be peaceful.", "گالیور قول داد صلح‌جو باشد."),
                    StoryParagraph("The Lilliputians brought him food.", "لی‌لی‌پوتی‌ها برایش غذا آوردند."),
                    StoryParagraph("The food was tiny but delicious.", "غذا کوچک اما خوشمزه بود."),
                    StoryParagraph("They built a small house for him.", "آن‌ها خانه‌ای کوچک برایش ساختند."),
                    StoryParagraph("Gulliver became friends with them.", "گالیور با آن‌ها دوست شد."),
                    StoryParagraph("He learned their language.", "او زبانشان را یاد گرفت."),
                    StoryParagraph("He lived among them for many months.", "او ماه‌ها بین آن‌ها زندگی کرد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The War of Eggs", titlePersian = "غول‌های بزرگ",
                paragraphs = listOf(
                    StoryParagraph("The Lilliputians had a strange problem.", "لی‌لی‌پوتی‌ها مشکل عجیبی داشتند."),
                    StoryParagraph("There was a war about eggs.", "جنگی درباره تخم‌مرغ بود."),
                    StoryParagraph("Some people broke eggs at the big end.", "بعضی مردم تخم‌مرغ را از سر بزرگ می‌شکستند."),
                    StoryParagraph("Others broke them at the small end.", "دیگران از سر کوچک می‌شکستند."),
                    StoryParagraph("The two groups hated each other.", "دو گروه از هم متنفر بودند."),
                    StoryParagraph("They had been fighting for years.", "آن‌ها سال‌ها جنگیده بودند."),
                    StoryParagraph("The Emperor asked Gulliver for help.", "امپراتور از گالیور کمک خواست."),
                    StoryParagraph("Gulliver captured the enemy's ships.", "گالیور کشتی‌های دشمن را تسخیر کرد."),
                    StoryParagraph("But he did not want to kill anyone.", "اما نمی‌خواست کسی را بکشد."),
                    StoryParagraph("The Emperor was angry with him.", "امپراتور از او عصبانی شد."),
                    StoryParagraph("He planned to punish Gulliver.", "او نقشه کشید گالیور را مجازات کند."),
                    StoryParagraph("Gulliver found out about the plan.", "گالیور از نقشه باخبر شد."),
                    StoryParagraph("He decided to escape.", "او تصمیم گرفت فرار کند."),
                    StoryParagraph("He swam to a nearby island.", "او به جزیره‌ای نزدیک شنا کرد."),
                    StoryParagraph("There he found a giant footprint.", "آنجا رد پای غول‌پیکری پیدا کرد."),
                    StoryParagraph("The island was the land of giants.", "جزیره سرزمین غول‌ها بود."),
                    StoryParagraph("A giant farmer found him.", "کشاورز غول‌پیکری او را پیدا کرد."),
                    StoryParagraph("The farmer took him home.", "کشاورز او را به خانه برد."),
                    StoryParagraph("Gulliver became a tiny pet.", "گالیور حیوان خانگی کوچکی شد."),
                    StoryParagraph("He was shocked by the size of everything.", "او از اندازه همه چیز شوکه شد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Land of Giants", titlePersian = "جزیره پرنده",
                paragraphs = listOf(
                    StoryParagraph("The giant farmer treated Gulliver badly.", "کشاورز غول‌پیکر با گالیور بدرفتاری می‌کرد."),
                    StoryParagraph("He made him perform for money.", "او او را وادار می‌کرد برای پول نمایش دهد."),
                    StoryParagraph("People paid to see the tiny man.", "مردم پول می‌دادند تا مرد کوچک را ببینند."),
                    StoryParagraph("Gulliver became very weak.", "گالیور خیلی ضعیف شد."),
                    StoryParagraph("The queen of the giants heard about him.", "ملکه غول‌ها درباره‌اش شنید."),
                    StoryParagraph("She bought him from the farmer.", "او او را از کشاورز خرید."),
                    StoryParagraph("Gulliver lived in the palace.", "گالیور در قصر زندگی کرد."),
                    StoryParagraph("The queen was kind to him.", "ملکه با او مهربان بود."),
                    StoryParagraph("He talked with the king about Europe.", "او با پادشاه درباره اروپا صحبت کرد."),
                    StoryParagraph("The king laughed at European ways.", "پادشاه به راه‌های اروپایی خندید."),
                    StoryParagraph("He said Europe was full of problems.", "او گفت اروپا پر از مشکلات است."),
                    StoryParagraph("Gulliver realized the king was right.", "گالیور فهمید پادشاه درست می‌گوید."),
                    StoryParagraph("One day, a giant eagle took him.", "یک روز، عقابی غول‌پیکر او را برد."),
                    StoryParagraph("The eagle dropped him in the sea.", "عقاب او را در دریا انداخت."),
                    StoryParagraph("A ship rescued him.", "کشتی‌ای نجاتش داد."),
                    StoryParagraph("He returned to England.", "او به انگلیس برگشت."),
                    StoryParagraph("But he could not forget the giants.", "اما نمی‌توانست غول‌ها را فراموش کند."),
                    StoryParagraph("He felt small even among his own people.", "او حتی بین مردم خودش کوچک احساس می‌کرد."),
                    StoryParagraph("His family was happy to see him.", "خانواده‌اش از دیدنش خوشحال شدند."),
                    StoryParagraph("But Gulliver was changed forever.", "اما گالیور برای همیشه تغییر کرده بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Flying Island", titlePersian = "سرزمین اسب‌ها",
                paragraphs = listOf(
                    StoryParagraph("Gulliver went to sea again.", "گالیور دوباره به دریا رفت."),
                    StoryParagraph("Pirates attacked his ship.", "دزدان دریایی به کشتی‌اش حمله کردند."),
                    StoryParagraph("They left him on a small boat.", "آن‌ها او را در قایق کوچکی رها کردند."),
                    StoryParagraph("He reached a strange island.", "او به جزیره‌ای عجیب رسید."),
                    StoryParagraph("The island was floating in the air.", "جزیره در هوا شناور بود."),
                    StoryParagraph("People there were scientists.", "مردم آنجا دانشمند بودند."),
                    StoryParagraph("They studied math and music.", "آن‌ها ریاضی و موسیقی مطالعه می‌کردند."),
                    StoryParagraph("But they did nothing practical.", "اما هیچ کار عملی انجام نمی‌دادند."),
                    StoryParagraph("Their clothes did not fit.", "لباس‌هایشان اندازه نبود."),
                    StoryParagraph("Their houses were badly built.", "خانه‌هایشان بد ساخته شده بود."),
                    StoryParagraph("Their farms were failing.", "مزرعه‌هایشان شکست می‌خورد."),
                    StoryParagraph("Gulliver thought they were foolish.", "گالیور فکر کرد احمق هستند."),
                    StoryParagraph("He traveled to another island.", "او به جزیره دیگری سفر کرد."),
                    StoryParagraph("There, horses ruled the land.", "آنجا، اسب‌ها بر سرزمین حکومت می‌کردند."),
                    StoryParagraph("The horses were wise and kind.", "اسب‌ها دانا و مهربان بودند."),
                    StoryParagraph("They did not lie or steal.", "آن‌ها دروغ نمی‌گفتند و دزدی نمی‌کردند."),
                    StoryParagraph("They did not have wars.", "آن‌ها جنگ نداشتند."),
                    StoryParagraph("Gulliver loved living among them.", "گالیور عاشق زندگی بین آن‌ها شد."),
                    StoryParagraph("He did not want to leave.", "نمی‌خواست ترک کند."),
                    StoryParagraph("But he had to return to England.", "اما باید به انگلیس برمی‌گشت.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Return Home", titlePersian = "بازگشت به انگلیس",
                paragraphs = listOf(
                    StoryParagraph("The horses asked Gulliver to leave.", "اسب‌ها از گالیور خواستند برود."),
                    StoryParagraph("They said he was too much like a Yahoo.", "آن‌ها گفتند او زیادی شبیه یاهو است."),
                    StoryParagraph("Yahoos were the bad creatures of the island.", "یاهوها موجودات بد جزیره بودند."),
                    StoryParagraph("Gulliver was very sad.", "گالیور خیلی غمگین شد."),
                    StoryParagraph("He built a small boat and sailed away.", "او قایق کوچکی ساخت و دور شد."),
                    StoryParagraph("A ship found him near Australia.", "کشتی‌ای او را نزدیک استرالیا پیدا کرد."),
                    StoryParagraph("He returned to England.", "او به انگلیس برگشت."),
                    StoryParagraph("But he could not live with people.", "اما نمی‌توانست با مردم زندگی کند."),
                    StoryParagraph("He hated the smell of humans.", "او از بوی انسان‌ها متنفر بود."),
                    StoryParagraph("He thought they were all like Yahoos.", "او فکر می‌کرد همه شبیه یاهو هستند."),
                    StoryParagraph("He spent hours talking to his horses.", "او ساعت‌ها با اسب‌هایش صحبت می‌کرد."),
                    StoryParagraph("His wife and children were afraid of him.", "همسر و فرزندانش از او می‌ترسیدند."),
                    StoryParagraph("He became a lonely old man.", "او پیرمردی تنها شد."),
                    StoryParagraph("He wrote a book about his travels.", "او کتابی درباره سفرهایش نوشت."),
                    StoryParagraph("In the book, he said humans are terrible.", "در کتاب، گفت انسان‌ها وحشتناک هستند."),
                    StoryParagraph("He said we should try to be like horses.", "او گفت باید تلاش کنیم مثل اسب‌ها باشیم."),
                    StoryParagraph("Many people did not like his book.", "افراد زیادی کتابش را دوست نداشتند."),
                    StoryParagraph("But others found truth in it.", "اما دیگران در آن حقیقت یافتند."),
                    StoryParagraph("Gulliver died a few years later.", "گالیور چند سال بعد مرد."),
                    StoryParagraph("And his story is still read today.", "و داستانش هنوز امروز خوانده می‌شود.")
                )
            )
        )
    )
}