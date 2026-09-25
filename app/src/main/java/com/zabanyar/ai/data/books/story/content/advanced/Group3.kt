package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۳ پیشرفته — ادبیات وجودی و مدرن
 *  ۷. قلب تاریکی
 *  ۸. بیگانه
 *  ۹. باقی‌مانده روز
 */
object Group3 {

    fun getAll(): List<StoryContent> = listOf(
        story7(),
        story8(),
        story9(),
    )

    // ─────────────── ۷: قلب تاریکی ───────────────
    private fun story7() = StoryContent(
        storyId = "adv_heart_darkness",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Nellie on the Thames", titlePersian = "کشتی نلی در تیمز",
                paragraphs = listOf(
                    StoryParagraph("The Nellie was anchored on the Thames.", "نلی در تیمز لنگر انداخته بود."),
                    StoryParagraph("It was a small ship with five men on board.", "کشتی کوچکی با پنج مرد روی عرشه بود."),
                    StoryParagraph("The sun was setting over London.", "خورشید در حال غروب بر لندن بود."),
                    StoryParagraph("The city lights were just beginning to appear.", "چراغ‌های شهر تازه داشتند ظاهر می‌شدند."),
                    StoryParagraph("One of the men was named Marlow.", "یکی از مردان مارلو نام داشت."),
                    StoryParagraph("He was a sailor with a thoughtful face.", "او ملوانی با چهره‌ای متفکر بود."),
                    StoryParagraph("He sat cross-legged on the deck.", "او چهارزانو روی عرشه نشسته بود."),
                    StoryParagraph("The others listened as he began to speak.", "دیگران گوش دادند وقتی شروع به صحبت کرد."),
                    StoryParagraph("He told them about a journey he had made.", "او درباره سفری که کرده بود گفت."),
                    StoryParagraph("It was many years ago, in Africa.", "سال‌ها پیش، در آفریقا بود."),
                    StoryParagraph("He had been hired by a trading company.", "او توسط شرکتی تجاری استخدام شده بود."),
                    StoryParagraph("The company traded in ivory.", "شرکت در عاج تجارت می‌کرد."),
                    StoryParagraph("They sent him to find a man named Kurtz.", "آن‌ها او را برای پیدا کردن مردی به نام کورتز فرستادند."),
                    StoryParagraph("Kurtz was their best agent.", "کورتز بهترین نماینده‌شان بود."),
                    StoryParagraph("But no one had heard from him for a long time.", "اما مدت زیادی کسی از او خبری نداشت."),
                    StoryParagraph("Marlow had to travel up a great river.", "مارلو باید از رودخانه‌ای بزرگ بالا می‌رفت."),
                    StoryParagraph("The journey would take many months.", "سفر ماه‌ها طول می‌کشید."),
                    StoryParagraph("Marlow did not know what he would find.", "مارلو نمی‌دانست چه چیزی پیدا می‌کند."),
                    StoryParagraph("He only knew he had to find Kurtz.", "او فقط می‌دانست باید کورتز را پیدا کند."),
                    StoryParagraph("And so began his journey into darkness.", "و اینگونه سفرش به تاریکی آغاز شد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Company Station", titlePersian = "ایستگاه شرکت",
                paragraphs = listOf(
                    StoryParagraph("Marlow traveled down the African coast.", "مارلو در امتداد ساحل آفریقا سفر کرد."),
                    StoryParagraph("He reached the company's first station.", "او به اولین ایستگاه شرکت رسید."),
                    StoryParagraph("What he saw there horrified him.", "آنچه دید وحشتش را برانگیخت."),
                    StoryParagraph("Native workers were treated like slaves.", "کارگران بومی مثل برده رفتار می‌شدند."),
                    StoryParagraph("They were thin and exhausted.", "آن‌ها لاغر و خسته بودند."),
                    StoryParagraph("Many were dying by the side of the road.", "بسیاری در کنار جاده می‌مردند."),
                    StoryParagraph("They were paid almost nothing.", "آن‌ها تقریباً هیچ پولی نمی‌گرفتند."),
                    StoryParagraph("They were forced to work day and night.", "آن‌ها مجبور بودند شبانه‌روز کار کنند."),
                    StoryParagraph("Marlow saw a group of dying men under some trees.", "مارلو گروهی از مردان در حال مرگ زیر درختان دید."),
                    StoryParagraph("They had crawled there to rest.", "آن‌ها برای استراحت به آنجا خزیده بودند."),
                    StoryParagraph("He offered one of them a biscuit.", "او به یکی از آن‌ها بیسکویتی داد."),
                    StoryParagraph("The man looked at him without understanding.", "مرد بدون فهمیدن به او نگاه کرد."),
                    StoryParagraph("Marlow felt he was an intruder.", "مارلو احساس کرد مزاحم است."),
                    StoryParagraph("He met the company's chief accountant.", "او حسابدار ارشد شرکت را ملاقات کرد."),
                    StoryParagraph("The accountant was dressed very neatly.", "حسابدار خیلی مرتب لباس پوشیده بود."),
                    StoryParagraph("He kept his books in perfect order.", "او دفترهایش را در نظم کامل نگه می‌داشت."),
                    StoryParagraph("But outside, people were dying.", "اما بیرون، مردم می‌مردند."),
                    StoryParagraph("The accountant mentioned Kurtz.", "حسابدار از کورتز گفت."),
                    StoryParagraph("He said Kurtz was a remarkable man.", "او گفت کورتز مرد قابل توجهی است."),
                    StoryParagraph("Marlow began to wonder about this man.", "مارلو شروع کرد به فکر کردن درباره این مرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Journey Upstream", titlePersian = "سفر به بالادست",
                paragraphs = listOf(
                    StoryParagraph("Marlow took a steamboat up the river.", "مارلو با کشتی بخاری از رودخانه بالا رفت."),
                    StoryParagraph("The river was long and winding.", "رودخانه طولانی و پرپیچ و خم بود."),
                    StoryParagraph("The forest pressed in from both sides.", "جنگل از دو طرف فشار می‌آورد."),
                    StoryParagraph("It was dark and silent.", "تاریک و ساکت بود."),
                    StoryParagraph("The air was hot and humid.", "هوا گرم و مرطوب بود."),
                    StoryParagraph("Time seemed to stop in that place.", "زمان در آن مکان متوقف شده به نظر می‌رسید."),
                    StoryParagraph("The natives on the shore watched them pass.", "بومیان ساحل تماشا می‌کردند که می‌گذرند."),
                    StoryParagraph("They did not wave or smile.", "آن‌ها دست تکان نمی‌دادند یا لبخند نمی‌زدند."),
                    StoryParagraph("Marlow's crew included native workers.", "خدمه مارلو شامل کارگران بومی بود."),
                    StoryParagraph("They were paid in brass wire.", "آن‌ها با سیم برنجی پرداخت می‌شدند."),
                    StoryParagraph("The journey took many weeks.", "سفر هفته‌ها طول کشید."),
                    StoryParagraph("One morning, they reached a small hut.", "یک صبح، به کلبه‌ای کوچک رسیدند."),
                    StoryParagraph("Inside, Marlow found a book.", "داخل، مارلو کتابی پیدا کرد."),
                    StoryParagraph("It was about navigation and seamanship.", "درباره ناوبری و دریانوردی بود."),
                    StoryParagraph("There were notes in the margins.", "یادداشت‌هایی در حاشیه بود."),
                    StoryParagraph("The handwriting looked English.", "دست‌خط انگلیسی به نظر می‌رسید."),
                    StoryParagraph("Marlow realized it belonged to Kurtz.", "مارلو فهمید متعلق به کورتز است."),
                    StoryParagraph("He studied the notes carefully.", "او یادداشت‌ها را با دقت مطالعه کرد."),
                    StoryParagraph("They were written in a strange, wild style.", "با سبکی عجیب و وحشی نوشته شده بودند."),
                    StoryParagraph("Marlow felt he was getting closer.", "مارلو احساس کرد نزدیک‌تر می‌شود.")
                )
            ),
            StoryChapter(
                number = 4, title = "Kurtz", titlePersian = "کورتز",
                paragraphs = listOf(
                    StoryParagraph("Finally, they reached Kurtz's station.", "بالاخره، به ایستگاه کورتز رسیدند."),
                    StoryParagraph("It was in a terrible state.", "در وضعیت وحشتناکی بود."),
                    StoryParagraph("The buildings were falling apart.", "ساختمان‌ها در حال فروریختن بودند."),
                    StoryParagraph("The native people were thin and afraid.", "مردم بومی لاغر و ترسیده بودند."),
                    StoryParagraph("Kurtz's followers had made him a kind of god.", "پیروان کورتز او را نوعی خدا کرده بودند."),
                    StoryParagraph("They worshipped him and obeyed him.", "او را می‌پرستیدند و اطاعتش می‌کردند."),
                    StoryParagraph("They had decorated his hut with human skulls.", "آن‌ها کلبه‌اش را با جمجمه انسان تزئین کرده بودند."),
                    StoryParagraph("Marlow was shocked by what he saw.", "مارلو از آنچه دید شوکه شد."),
                    StoryParagraph("Kurtz was very sick.", "کورتز خیلی مریض بود."),
                    StoryParagraph("He had been ill for a long time.", "او مدت زیادی مریض بوده است."),
                    StoryParagraph("He was thin and pale.", "او لاغر و رنگ‌پریده بود."),
                    StoryParagraph("But his eyes were bright and fierce.", "اما چشم‌هایش درخشان و وحشی بودند."),
                    StoryParagraph("He spoke to Marlow about many things.", "او درباره چیزهای زیادی با مارلو صحبت کرد."),
                    StoryParagraph("He talked about love and hate.", "درباره عشق و نفرت صحبت کرد."),
                    StoryParagraph("He talked about his plans for the natives.", "درباره نقشه‌هایش برای بومیان صحبت کرد."),
                    StoryParagraph("He wanted to bring civilization to Africa.", "او می‌خواست تمدن را به آفریقا بیاورد."),
                    StoryParagraph("But he had become a monster.", "اما او به هیولا تبدیل شده بود."),
                    StoryParagraph("He had killed many people.", "او افراد زیادی را کشته بود."),
                    StoryParagraph("He had forgotten his original purpose.", "او هدف اصلی‌اش را فراموش کرده بود."),
                    StoryParagraph("Marlow saw the darkness in his heart.", "مارلو تاریکی در قلبش را دید.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Horror", titlePersian = "وحشت",
                paragraphs = listOf(
                    StoryParagraph("Kurtz was dying.", "کورتز داشت می‌مرد."),
                    StoryParagraph("Marlow decided to take him back down the river.", "مارلو تصمیم گرفت او را به پایین رودخانه برگرداند."),
                    StoryParagraph("They put him on the steamboat.", "آن‌ها او را روی کشتی بخاری گذاشتند."),
                    StoryParagraph("One night, Kurtz tried to escape.", "یک شب، کورتز تلاش کرد فرار کند."),
                    StoryParagraph("He crawled toward the native village.", "او به سمت دهکده بومیان خزید."),
                    StoryParagraph("He wanted to return to his god-like life.", "او می‌خواست به زندگی خدایگونه‌اش برگردد."),
                    StoryParagraph("Marlow found him and brought him back.", "مارلو پیدایش کرد و برگرداندش."),
                    StoryParagraph("Kurtz was very angry.", "کورتز خیلی عصبانی شد."),
                    StoryParagraph("He said he had great plans.", "او گفت نقشه‌های بزرگی دارد."),
                    StoryParagraph("He said he would be remembered forever.", "او گفت برای همیشه به یاد خواهد ماند."),
                    StoryParagraph("But he knew he was going to die.", "اما می‌دانست می‌میرد."),
                    StoryParagraph("The next day, he was very weak.", "روز بعد، خیلی ضعیف بود."),
                    StoryParagraph("Marlow sat with him in the dark cabin.", "مارلو در کابین تاریک با او نشست."),
                    StoryParagraph("Kurtz whispered his last words.", "کورتز آخرین کلماتش را زمزمه کرد."),
                    StoryParagraph("He said: The horror! The horror!", "او گفت: وحشت! وحشت!"),
                    StoryParagraph("Then he died.", "بعد مرد."),
                    StoryParagraph("Marlow was deeply shaken.", "مارلو عمیقاً تکان خورد."),
                    StoryParagraph("He buried Kurtz in the river.", "او کورتز را در رودخانه دفن کرد."),
                    StoryParagraph("He returned to Europe alone.", "او تنها به اروپا برگشت."),
                    StoryParagraph("But he never forgot the darkness he had seen.", "اما هرگز تاریکی‌ای که دیده بود را فراموش نکرد.")
                )
            )
        )
    )

    // ─────────────── ۸: بیگانه ───────────────
    private fun story8() = StoryContent(
        storyId = "adv_the_stranger",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Mother's Death", titlePersian = "مرگ مادر",
                paragraphs = listOf(
                    StoryParagraph("My mother died today.", "مادرم امروز مرد."),
                    StoryParagraph("Or maybe yesterday, I don't know.", "یا شاید دیروز، نمی‌دانم."),
                    StoryParagraph("I received a telegram from the home.", "از خانه سالمندان تلگرامی دریافت کردم."),
                    StoryParagraph("It said: Your mother passed away.", "می‌گفت: مادرت درگذشت."),
                    StoryParagraph("The funeral is tomorrow.", "خاکسپاری فردا است."),
                    StoryParagraph("I had to take a bus to Marengo.", "باید با اتوبوس به مارنگو می‌رفتم."),
                    StoryParagraph("It was a long and hot journey.", "سفر طولانی و گرمی بود."),
                    StoryParagraph("I fell asleep on the way.", "در راه خوابم برد."),
                    StoryParagraph("When I arrived, the director met me.", "وقتی رسیدم، مدیر به دیدنم آمد."),
                    StoryParagraph("He asked me if I wanted to see her.", "او پرسید آیا می‌خواهم ببینمش."),
                    StoryParagraph("I said I didn't need to.", "گفتم نیازی نیست."),
                    StoryParagraph("He seemed surprised by my answer.", "او از پاسخم متعجب به نظر می‌رسید."),
                    StoryParagraph("I sat by the coffin during the vigil.", "من در طول شب‌بیداری کنار تابوت نشستم."),
                    StoryParagraph("Some of the old people were there.", "چند نفر از پیرها آنجا بودند."),
                    StoryParagraph("They cried and prayed.", "آن‌ها گریه کردند و دعا خواندند."),
                    StoryParagraph("I felt tired and wanted a cigarette.", "احساس خستگی کردم و سیگار می‌خواستم."),
                    StoryParagraph("But I didn't want to seem rude.", "اما نمی‌خواستم بی‌ادب به نظر بیایم."),
                    StoryParagraph("The next day, we buried her.", "روز بعد، خاکسپاری‌اش کردیم."),
                    StoryParagraph("I went back home to Algiers.", "من به الجزیره برگشتم."),
                    StoryParagraph("And I was glad it was Sunday.", "و خوشحال بودم که یکشنبه بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "Ordinary Days", titlePersian = "روزهای عادی",
                paragraphs = listOf(
                    StoryParagraph("I live in a small apartment in Algiers.", "من در آپارتمانی کوچک در الجزیره زندگی می‌کنم."),
                    StoryParagraph("I work in an office.", "من در دفتری کار می‌کنم."),
                    StoryParagraph("I do the same things every day.", "هر روز همان کارها را انجام می‌دهم."),
                    StoryParagraph("I wake up, take the bus, work, eat, sleep.", "بیدار می‌شوم، اتوبوس می‌گیرم، کار می‌کنم، غذا می‌خورم، می‌خوابم."),
                    StoryParagraph("Nothing ever changes.", "هیچ چیز هرگز تغییر نمی‌کند."),
                    StoryParagraph("One day, I met a woman named Marie.", "یک روز، زنی به نام ماری را ملاقات کردم."),
                    StoryParagraph("She worked in the same office.", "او در همان دفتر کار می‌کرد."),
                    StoryParagraph("She used to be my typist.", "او قبلاً تایپیست من بود."),
                    StoryParagraph("We started to see each other.", "ما شروع کردیم به هم را دیدن."),
                    StoryParagraph("She asked me if I loved her.", "او پرسید آیا دوستش دارم."),
                    StoryParagraph("I said I didn't know.", "گفتم نمی‌دانم."),
                    StoryParagraph("She was sad but did not get angry.", "او غمگین شد اما عصبانی نشد."),
                    StoryParagraph("A neighbor asked me to help him.", "همسایه‌ای از من خواست کمکش کنم."),
                    StoryParagraph("His name was Raymond.", "اسمش ریموند بود."),
                    StoryParagraph("He was a pimp and a violent man.", "او جاکش و مردی خشن بود."),
                    StoryParagraph("His girlfriend had cheated on him.", "دوست‌دخترش به او خیانت کرده بود."),
                    StoryParagraph("He wanted to punish her.", "او می‌خواست مجازاتش کند."),
                    StoryParagraph("I didn't care about his problems.", "من به مشکلات او اهمیت نمی‌دادم."),
                    StoryParagraph("But I helped him anyway.", "اما به هر حال کمکش کردم."),
                    StoryParagraph("I did not think it mattered.", "فکر نمی‌کردم مهم باشد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Beach", titlePersian = "ساحل",
                paragraphs = listOf(
                    StoryParagraph("One Sunday, we went to the beach.", "یک یکشنبه، به ساحل رفتیم."),
                    StoryParagraph("Raymond, Marie, and I went together.", "ریموند، ماری و من با هم رفتیم."),
                    StoryParagraph("We met two Arab men there.", "آنجا با دو مرد عرب ملاقات کردیم."),
                    StoryParagraph("One of them was Raymond's enemy.", "یکی از آن‌ها دشمن ریموند بود."),
                    StoryParagraph("There had been a fight the week before.", "هفته قبل دعوایی شده بود."),
                    StoryParagraph("The Arab had cut Raymond with a knife.", "عرب با چاقو ریموند را زخمی کرده بود."),
                    StoryParagraph("That day, the Arab was watching us.", "آن روز، عرب ما را تماشا می‌کرد."),
                    StoryParagraph("Raymond wanted to fight him.", "ریموند می‌خواست با او بجنگد."),
                    StoryParagraph("I tried to calm him down.", "تلاش کردم آرامش کنم."),
                    StoryParagraph("But he was too angry.", "اما او خیلی عصبانی بود."),
                    StoryParagraph("We went for a walk along the beach.", "ما در ساحل قدم زدیم."),
                    StoryParagraph("The sun was very hot.", "خورشید خیلی داغ بود."),
                    StoryParagraph("I went back toward the spring alone.", "من تنهایی به سمت چشمه برگشتم."),
                    StoryParagraph("The Arab was there.", "عرب آنجا بود."),
                    StoryParagraph("He was lying on the sand.", "او روی ماسه دراز کشیده بود."),
                    StoryParagraph("He had a knife in his hand.", "چاقویی در دستش داشت."),
                    StoryParagraph("I had Raymond's revolver in my pocket.", "من هفت‌تیر ریموند را در جیبم داشتم."),
                    StoryParagraph("The sun was burning my eyes.", "خورشید چشمانم را می‌سوزاند."),
                    StoryParagraph("I took a step forward.", "من قدمی به جلو برداشتم."),
                    StoryParagraph("And I fired.", "و شلیک کردم.")
                )
            ),
            StoryChapter(
                number = 4, title = "Prison", titlePersian = "زندان",
                paragraphs = listOf(
                    StoryParagraph("I was arrested and put in prison.", "من دستگیر و زندانی شدم."),
                    StoryParagraph("The trial lasted for many months.", "محاکمه ماه‌ها طول کشید."),
                    StoryParagraph("The lawyers asked me why I killed him.", "وکلا پرسیدند چرا کشتمش."),
                    StoryParagraph("I said it was because of the sun.", "گفتم به خاطر خورشید بود."),
                    StoryParagraph("Everyone in the court laughed.", "همه در دادگاه خندیدند."),
                    StoryParagraph("They did not understand.", "آن‌ها نمی‌فهمیدند."),
                    StoryParagraph("The judge asked about my mother.", "قاضی درباره مادرم پرسید."),
                    StoryParagraph("Why hadn't I cried at her funeral?", "چرا در خاکسپاری‌اش گریه نکردم؟"),
                    StoryParagraph("I said I did not know.", "گفتم نمی‌دانم."),
                    StoryParagraph("They said I had no soul.", "آن‌ها گفتند من روح ندارم."),
                    StoryParagraph("They said I was a monster.", "آن‌ها گفتند من هیولا هستم."),
                    StoryParagraph("Marie came to visit me once.", "ماری یک بار به دیدنم آمد."),
                    StoryParagraph("She said she still loved me.", "او گفت هنوز دوستم دارد."),
                    StoryParagraph("I said I did not love her.", "گفتم دوستش ندارم."),
                    StoryParagraph("She was hurt, but she forgave me.", "او زخمی شد، اما بخشیدم."),
                    StoryParagraph("The prison guards treated me with respect.", "نگهبانان زندان با احترام با من رفتار می‌کردند."),
                    StoryParagraph("Life in prison became normal for me.", "زندگی در زندان برایم عادی شد."),
                    StoryParagraph("I learned to accept it.", "یاد گرفتم قبولش کنم."),
                    StoryParagraph("The days passed slowly.", "روزها آرام می‌گذشتند."),
                    StoryParagraph("I waited for the end.", "منتظر پایان بودم.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Execution", titlePersian = "اعدام",
                paragraphs = listOf(
                    StoryParagraph("The day of my execution arrived.", "روز اعدامم رسید."),
                    StoryParagraph("A priest came to my cell.", "کشیشی به سلولم آمد."),
                    StoryParagraph("He wanted me to pray and repent.", "او می‌خواست دعا کنم و توبه کنم."),
                    StoryParagraph("I refused to see him.", "من از دیدنش امتناع کردم."),
                    StoryParagraph("He insisted and asked me questions.", "او اصرار کرد و از من سوال پرسید."),
                    StoryParagraph("He asked about God and the afterlife.", "او درباره خدا و زندگی پس از مرگ پرسید."),
                    StoryParagraph("I told him I did not believe.", "گفتم اعتقاد ندارم."),
                    StoryParagraph("He was shocked and sad.", "او شوکه و غمگین شد."),
                    StoryParagraph("Then something strange happened.", "بعد چیز عجیبی اتفاق افتاد."),
                    StoryParagraph("I felt a sudden anger at him.", "نسبت به او خشم ناگهانی حس کردم."),
                    StoryParagraph("I started to shout at him.", "شروع کردم به فریاد زدن بر سرش."),
                    StoryParagraph("I told him I had lived my whole life.", "گفتم تمام زندگی‌ام را زندگی کرده‌ام."),
                    StoryParagraph("I had loved, killed, and lived freely.", "عشق ورزیده، کشته و آزادانه زیسته بودم."),
                    StoryParagraph("I did not regret anything.", "من از چیزی پشیمان نبودم."),
                    StoryParagraph("I was ready to die.", "آماده مردن بودم."),
                    StoryParagraph("For the first time, I understood.", "برای اولین بار، فهمیدم."),
                    StoryParagraph("The universe is indifferent.", "جهان بی‌تفاوت است."),
                    StoryParagraph("Life has no meaning.", "زندگی معنایی ندارد."),
                    StoryParagraph("But we are free to choose.", "اما ما آزادیم انتخاب کنیم."),
                    StoryParagraph("And I chose to accept my fate.", "و من انتخاب کردم سرنوشتم را بپذیرم.")
                )
            )
        )
    )

    // ─────────────── ۹: باقی‌مانده روز ───────────────
    private fun story9() = StoryContent(
        storyId = "adv_remains_day",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Butler's Journey", titlePersian = "سفر سرپیشخدمت",
                paragraphs = listOf(
                    StoryParagraph("Mr. Stevens was an English butler.", "آقای استیونز سرپیشخدمت انگلیسی بود."),
                    StoryParagraph("He had served at Darlington Hall for thirty years.", "او سی سال در تالار دارلینگتون خدمت کرده بود."),
                    StoryParagraph("The year was 1956.", "سال ۱۹۵۶ بود."),
                    StoryParagraph("His master, Lord Darlington, was dead.", "اربابش، لرد دارلینگتون، مرده بود."),
                    StoryParagraph("An American named Mr. Farraday had bought the house.", "آمریکایی به نام آقای فارادی خانه را خریده بود."),
                    StoryParagraph("Mr. Farraday gave Stevens a holiday.", "آقای فارادی به استیونز مرخصی داد."),
                    StoryParagraph("He suggested Stevens take his car.", "او پیشنهاد کرد استیونز ماشینش را بردارد."),
                    StoryParagraph("Stevens decided to visit an old friend.", "استیونز تصمیم گرفت به دیدن دوست قدیمی‌اش برود."),
                    StoryParagraph("Her name was Miss Kenton.", "اسمش میس کنتون بود."),
                    StoryParagraph("She had been the housekeeper at Darlington Hall.", "او خانه‌دار تالار دارلینگتون بود."),
                    StoryParagraph("She had left to get married many years ago.", "او سال‌ها پیش برای ازدواج رفته بود."),
                    StoryParagraph("Stevens wrote her a letter.", "استیونز نامه‌ای برایش نوشت."),
                    StoryParagraph("He said he wanted to see her again.", "او گفت می‌خواهد دوباره ببیندش."),
                    StoryParagraph("He gave her a date and a place.", "او تاریخی و مکانی داد."),
                    StoryParagraph("But he did not tell her his real feelings.", "اما احساسات واقعی‌اش را نگفت."),
                    StoryParagraph("He told himself it was about work.", "او به خودش گفت به خاطر کار است."),
                    StoryParagraph("He said the house needed a good housekeeper.", "او گفت خانه به خانه‌دار خوبی نیاز دارد."),
                    StoryParagraph("He packed his car and left.", "او ماشینش را بست و رفت."),
                    StoryParagraph("He drove through the English countryside.", "او در حومه انگلیس رانندگی کرد."),
                    StoryParagraph("The journey would take many days.", "سفر روزهای زیادی طول می‌کشید.")
                )
            ),
            StoryChapter(
                number = 2, title = "Memories of Darlington Hall", titlePersian = "خاطرات تالار دارلینگتون",
                paragraphs = listOf(
                    StoryParagraph("As he drove, Stevens remembered the past.", "در حین رانندگی، استیونز گذشته را به یاد آورد."),
                    StoryParagraph("He had been a young man when he arrived.", "وقتی رسید، مرد جوانی بود."),
                    StoryParagraph("His father was also a butler.", "پدرش هم سرپیشخدمت بود."),
                    StoryParagraph("His father had been strict and proud.", "پدرش سختگیر و مغرور بود."),
                    StoryParagraph("He had taught Stevens his trade.", "او به استیونز حرفه‌اش را آموخته بود."),
                    StoryParagraph("Stevens wanted to be the perfect butler.", "استیونز می‌خواست سرپیشخدمت کاملی باشد."),
                    StoryParagraph("He believed dignity was the most important quality.", "او معتقد بود وقار مهم‌ترین ویژگی است."),
                    StoryParagraph("A great butler never shows his feelings.", "سرپیشخدمت بزرگ هرگز احساساتش را نشان نمی‌دهد."),
                    StoryParagraph("Stevens tried to live by this rule.", "استیونز تلاش کرد طبق این قانون زندگی کند."),
                    StoryParagraph("Lord Darlington was a gentleman.", "لرد دارلینگتون جنتلمن بود."),
                    StoryParagraph("He wanted to help his country.", "او می‌خواست کشورش را کمک کند."),
                    StoryParagraph("After the first war, he tried for peace.", "بعد از جنگ اول، تلاش کرد برای صلح."),
                    StoryParagraph("He invited important people to his house.", "او افراد مهم را به خانه‌اش دعوت می‌کرد."),
                    StoryParagraph("German and English leaders met there.", "رهبران آلمانی و انگلیسی آنجا ملاقات می‌کردند."),
                    StoryParagraph("Stevens was proud to serve such a man.", "استیونز به خدمت به چنین مردی افتخار می‌کرد."),
                    StoryParagraph("He felt he was part of great events.", "او احساس می‌کرد بخشی از رویدادهای بزرگ است."),
                    StoryParagraph("But later, Lord Darlington was criticized.", "اما بعد، لرد دارلینگتون مورد انتقاد قرار گرفت."),
                    StoryParagraph("People said he had supported the Nazis.", "مردم گفتند او نازی‌ها را حمایت کرده است."),
                    StoryParagraph("Stevens did not want to believe this.", "استیونز نمی‌خواست این را باور کند."),
                    StoryParagraph("But he wondered, deep inside.", "اما در عمق وجودش شک کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "Miss Kenton", titlePersian = "میس کنتون",
                paragraphs = listOf(
                    StoryParagraph("Stevens remembered the day Miss Kenton arrived.", "استیونز روزی که میس کنتون رسید را به یاد آورد."),
                    StoryParagraph("It was 1922.", "سال ۱۹۲۲ بود."),
                    StoryParagraph("She was young and lively.", "او جوان و سرزنده بود."),
                    StoryParagraph("She had red hair and bright eyes.", "موهای قرمز و چشمان درخشان داشت."),
                    StoryParagraph("She was different from the other servants.", "او با دیگر خدمتکاران متفاوت بود."),
                    StoryParagraph("She was not afraid to speak her mind.", "او نمی‌ترسید نظر خود را بگوید."),
                    StoryParagraph("Stevens found her difficult at first.", "استیونز اول او را سخت‌گیر یافت."),
                    StoryParagraph("They argued about small things.", "آن‌ها درباره چیزهای کوچک بحث می‌کردند."),
                    StoryParagraph("But slowly, they became friends.", "اما آرام‌آرام، دوست شدند."),
                    StoryParagraph("They worked together every day.", "آن‌ها هر روز با هم کار می‌کردند."),
                    StoryParagraph("They talked during quiet evenings.", "آن‌ها در عصرهای آرام صحبت می‌کردند."),
                    StoryParagraph("Miss Kenton started to fall in love with him.", "میس کنتون شروع کرد به عاشق شدن او."),
                    StoryParagraph("She tried to show him her feelings.", "او تلاش کرد احساساتش را نشان دهد."),
                    StoryParagraph("But Stevens did not respond.", "اما استیونز پاسخ نداد."),
                    StoryParagraph("He thought love was not for a butler.", "او فکر می‌کرد عشق برای سرپیشخدمت نیست."),
                    StoryParagraph("He chose his duty over his heart.", "او وظیفه‌اش را بر قلبش ترجیح داد."),
                    StoryParagraph("One day, Miss Kenton told him about a proposal.", "یک روز، میس کنتون درباره خواستگاری‌ای به او گفت."),
                    StoryParagraph("A man had asked her to marry him.", "مردی از او خواسته بود با او ازدواج کند."),
                    StoryParagraph("She hoped Stevens would stop her.", "او امیدوار بود استیونز متوقفش کند."),
                    StoryParagraph("But he only said he was happy for her.", "اما او فقط گفت برایش خوشحال است.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Meeting", titlePersian = "ملاقات",
                paragraphs = listOf(
                    StoryParagraph("Stevens finally reached Miss Kenton's town.", "استیونز بالاخره به شهر میس کنتون رسید."),
                    StoryParagraph("He met her at a small tea shop.", "او در چای‌خانه کوچکی او را ملاقات کرد."),
                    StoryParagraph("She looked older than he remembered.", "او پیرتر از آنچه به یاد داشت به نظر می‌رسید."),
                    StoryParagraph("But her eyes were the same.", "اما چشمانش همان بودند."),
                    StoryParagraph("She was happy to see him.", "او از دیدنش خوشحال شد."),
                    StoryParagraph("They sat down and talked.", "آن‌ها نشستند و صحبت کردند."),
                    StoryParagraph("She told him about her life.", "او درباره زندگی‌اش به او گفت."),
                    StoryParagraph("Her marriage had not been happy.", "ازدواجش خوشحال نبوده است."),
                    StoryParagraph("Her husband did not love her.", "شوهرش دوستش نداشت."),
                    StoryParagraph("She had thought about leaving him.", "او به ترک او فکر کرده بود."),
                    StoryParagraph("She had also thought about Darlington Hall.", "او به تالار دارلینگتون هم فکر کرده بود."),
                    StoryParagraph("She said she often remembered those days.", "او گفت اغلب آن روزها را به یاد می‌آورد."),
                    StoryParagraph("Stevens told her about the new owner.", "استیونز درباره صاحب جدید به او گفت."),
                    StoryParagraph("He told her about Mr. Farraday.", "او درباره آقای فارادی گفت."),
                    StoryParagraph("He said he needed a housekeeper.", "او گفت به خانه‌دار نیاز دارد."),
                    StoryParagraph("But Miss Kenton said she could not come back.", "اما میس کنتون گفت نمی‌تواند برگردد."),
                    StoryParagraph("She was going to have a baby.", "او می‌خواست بچه‌دار شود."),
                    StoryParagraph("She had decided to stay with her husband.", "او تصمیم گرفته بود با شوهرش بماند."),
                    StoryParagraph("Stevens hid his disappointment.", "استیونز ناامیدی‌اش را پنهان کرد."),
                    StoryParagraph("He only said he understood.", "او فقط گفت می‌فهمد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Remains of the Day", titlePersian = "باقی‌مانده روز",
                paragraphs = listOf(
                    StoryParagraph("They said goodbye at the bus stop.", "آن‌ها در ایستگاه اتوبوس خداحافظی کردند."),
                    StoryParagraph("Miss Kenton was crying.", "میس کنتون گریه می‌کرد."),
                    StoryParagraph("Stevens did not cry.", "استیونز گریه نکرد."),
                    StoryParagraph("He had never learned how.", "او هرگز یاد نگرفته بود چطور گریه کند."),
                    StoryParagraph("He drove back to Darlington Hall alone.", "او تنها به تالار دارلینگتون برگشت."),
                    StoryParagraph("On the way, he thought about his life.", "در راه، به زندگی‌اش فکر کرد."),
                    StoryParagraph("He had given everything to his work.", "او همه چیز را به کارش داده بود."),
                    StoryParagraph("He had been a perfect butler.", "او سرپیشخدمت کاملی بوده است."),
                    StoryParagraph("But had he been a perfect man?", "اما آیا مرد کاملی بوده است؟"),
                    StoryParagraph("He had missed the chance for love.", "او فرصت عشق را از دست داده بود."),
                    StoryParagraph("He had missed the chance for happiness.", "او فرصت خوشبختی را از دست داده بود."),
                    StoryParagraph("He had served a man who might have been wrong.", "او به مردی خدمت کرده بود که شاید اشتباه کرده بود."),
                    StoryParagraph("He had not questioned anything.", "او هیچ چیز را زیر سوال نبرده بود."),
                    StoryParagraph("He had only obeyed.", "او فقط اطاعت کرده بود."),
                    StoryParagraph("One evening, he sat on a bench by the sea.", "یک عصر، روی نیمکتی کنار دریا نشست."),
                    StoryParagraph("A man talked to him about the evening.", "مردی با او درباره عصر صحبت کرد."),
                    StoryParagraph("He said the evening was the best part of the day.", "او گفت عصر بهترین بخش روز است."),
                    StoryParagraph("Stevens thought about this.", "استیونز به این فکر کرد."),
                    StoryParagraph("He decided to make the best of his remaining days.", "او تصمیم گرفت بهترین استفاده را از روزهای باقی‌مانده بکند."),
                    StoryParagraph("He would serve Mr. Farraday with dignity.", "او با وقار به آقای فارادی خدمت می‌کرد.")
                )
            )
        )
    )
}