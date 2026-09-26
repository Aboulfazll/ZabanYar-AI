package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۶ پیشرفته — مدرنیسم و ادبیات آمریکایی
 *  ۱۶. محاکمه
 *  ۱۷. به سوی فانوس دریایی
 *  ۱۸. دلبند
 */
object Group6 {

    fun getAll(): List<StoryContent> = listOf(
        story16(),
        story17(),
        story18(),
    )

    // ─────────────── ۱۶: محاکمه ───────────────
    private fun story16() = StoryContent(
        storyId = "adv_the_trial",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Arrest", titlePersian = "دستگیری",
                paragraphs = listOf(
                    StoryParagraph("Josef K. was arrested one morning.", "یوزف ک. یک روز صبح دستگیر شد."),
                    StoryParagraph("He had done nothing wrong.", "او هیچ کار اشتباهی نکرده بود."),
                    StoryParagraph("Two men came to his room.", "دو مرد به اتاقش آمدند."),
                    StoryParagraph("They told him he was under arrest.", "به او گفتند دستگیر است."),
                    StoryParagraph("But they did not tell him why.", "اما نگفتند چرا."),
                    StoryParagraph("They did not tell him the charges.", "اتهامات را نگفتند."),
                    StoryParagraph("Josef K. was confused and angry.", "یوزف ک. گیج و عصبانی شد."),
                    StoryParagraph("He was a respectable bank clerk.", "او کارمند محترم بانکی بود."),
                    StoryParagraph("He had always followed the law.", "او همیشه قانون را رعایت کرده بود."),
                    StoryParagraph("He asked to see the authorities.", "او خواست مقامات را ببیند."),
                    StoryParagraph("But he was told to wait.", "اما به او گفتند صبر کند."),
                    StoryParagraph("He was allowed to go to work.", "به او اجازه دادند سر کار برود."),
                    StoryParagraph("But he knew his life had changed.", "اما می‌دانست زندگی‌اش تغییر کرده."),
                    StoryParagraph("He felt watched everywhere.", "همه‌جا احساس می‌کرد تحت نظر است."),
                    StoryParagraph("He felt guilty even though he was innocent.", "با اینکه بی‌گناه بود احساس گناه می‌کرد."),
                    StoryParagraph("He could not concentrate on his work.", "نمی‌توانست روی کارش تمرکز کند."),
                    StoryParagraph("He thought about the arrest constantly.", "مدام به دستگیری فکر می‌کرد."),
                    StoryParagraph("He did not know who to trust.", "نمی‌دانست به کی اعتماد کند."),
                    StoryParagraph("He did not know what would happen.", "نمی‌دانست چه اتفاقی می‌افتد."),
                    StoryParagraph("He did not know when it would end.", "نمی‌دانست کِی تمام می‌شود."),
                    StoryParagraph("He was trapped in a nightmare.", "او در کابوسی گرفتار شده بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Court", titlePersian = "دادگاه",
                paragraphs = listOf(
                    StoryParagraph("Josef K. was told to appear in court.", "به یوزف ک. گفته شد در دادگاه حاضر شود."),
                    StoryParagraph("But he was not told where or when.", "اما نگفتند کجا و کِی."),
                    StoryParagraph("He wandered through the city.", "او در شهر سرگردان شد."),
                    StoryParagraph("He found the court in a strange attic.", "دادگاه را در اتاق زیرشیروانی عجیبی پیدا کرد."),
                    StoryParagraph("The room was crowded and airless.", "اتاق پر از جمعیت و بی‌هوا بود."),
                    StoryParagraph("People were waiting for their trials.", "مردم منتظر محاکمه‌هایشان بودند."),
                    StoryParagraph("Nobody knew what they were accused of.", "هیچ‌کس نمی‌دانست به چه متهم است."),
                    StoryParagraph("Josef K. gave a passionate speech.", "یوزف ک. سخنرانی پرشوری کرد."),
                    StoryParagraph("He said the court was unjust.", "گفت دادگاه ظالمانه است."),
                    StoryParagraph("He said he was innocent.", "گفت بی‌گناه است."),
                    StoryParagraph("The crowd applauded him.", "جمعیت تشویقش کردند."),
                    StoryParagraph("But the judge was not impressed.", "اما قاضی تحت تأثیر قرار نگرفت."),
                    StoryParagraph("The trial continued without him.", "محاکمه بدون او ادامه یافت."),
                    StoryParagraph("He was allowed to leave.", "به او اجازه دادند برود."),
                    StoryParagraph("He returned to his office.", "به دفترش برگشت."),
                    StoryParagraph("But he could not forget the court.", "اما نمی‌توانست دادگاه را فراموش کند."),
                    StoryParagraph("He could not forget the injustice.", "نمی‌توانست بی‌عدالتی را فراموش کند."),
                    StoryParagraph("He could not forget the fear.", "نمی‌توانست ترس را فراموش کند."),
                    StoryParagraph("He could not forget the mystery.", "نمی‌توانست رمز و راز را فراموش کند."),
                    StoryParagraph("He could not forget anything.", "او هیچ چیز را نمی‌توانست فراموش کند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Lawyer", titlePersian = "وکیل",
                paragraphs = listOf(
                    StoryParagraph("Josef K. hired a lawyer.", "یوزف ک. وکیلی استخدام کرد."),
                    StoryParagraph("His name was Huld.", "اسمش هولد بود."),
                    StoryParagraph("He was old and sick.", "او پیر و مریض بود."),
                    StoryParagraph("He spent most of his time in bed.", "بیشتر وقتش را در تخت می‌گذراند."),
                    StoryParagraph("He knew many important people.", "افراد مهم زیادی را می‌شناخت."),
                    StoryParagraph("But he did not help Josef K.", "اما به یوزف ک. کمک نکرد."),
                    StoryParagraph("He talked about his connections.", "درباره ارتباطاتش صحبت کرد."),
                    StoryParagraph("He talked about his other clients.", "درباره موکلان دیگرش صحبت کرد."),
                    StoryParagraph("He talked about everything but the case.", "درباره همه چیز جز پرونده صحبت کرد."),
                    StoryParagraph("Josef K. grew more anxious.", "یوزف ک. مضطرب‌تر شد."),
                    StoryParagraph("He met a painter named Titorelli.", "با نقاشی به نام تیتورلی آشنا شد."),
                    StoryParagraph("Titorelli knew about the court.", "تیتورلی درباره دادگاه می‌دانست."),
                    StoryParagraph("He said there was no acquittal.", "گفت تبرئه‌ای وجود ندارد."),
                    StoryParagraph("He said there was only delay.", "گفت فقط تعویق وجود دارد."),
                    StoryParagraph("He said the court never forgot.", "گفت دادگاه هرگز فراموش نمی‌کند."),
                    StoryParagraph("He said the case would follow Josef K. forever.", "گفت پرونده برای همیشه دنبال یوزف ک. می‌آید."),
                    StoryParagraph("Josef K. felt hopeless.", "یوزف ک. ناامید شد."),
                    StoryParagraph("He felt like he was drowning.", "احساس کرد در حال غرق شدن است."),
                    StoryParagraph("He felt like he had no future.", "احساس کرد آینده‌ای ندارد."),
                    StoryParagraph("He felt like the world was against him.", "احساس کرد دنیا علیه اوست.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Cathedral", titlePersian = "کلیسای جامع",
                paragraphs = listOf(
                    StoryParagraph("Josef K. was asked to give a tour of the cathedral.", "از یوزف ک. خواسته شد تور کلیسای جامع بدهد."),
                    StoryParagraph("It was an important business event.", "این رویداد مهم تجاری بود."),
                    StoryParagraph("He went to the cathedral alone.", "تنها به کلیسا رفت."),
                    StoryParagraph("The church was dark and empty.", "کلیسا تاریک و خالی بود."),
                    StoryParagraph("A priest appeared from behind the altar.", "کشیشی از پشت محراب ظاهر شد."),
                    StoryParagraph("He called Josef K. by name.", "یوزف ک. را با اسم صدا زد."),
                    StoryParagraph("He told him a parable about the law.", "مَثَلی درباره قانون به او گفت."),
                    StoryParagraph("It was about a man waiting at a door.", "درباره مردی بود که پشت دری منتظر بود."),
                    StoryParagraph("The door was guarded by a doorkeeper.", "دریبان از در محافظت می‌کرد."),
                    StoryParagraph("The man waited his whole life.", "مرد تمام عمرش منتظر ماند."),
                    StoryParagraph("He never tried to enter.", "هرگز تلاش نکرد وارد شود."),
                    StoryParagraph("He asked why nobody else came.", "پرسید چرا هیچ‌کس دیگری نیامد."),
                    StoryParagraph("The doorkeeper said the door was for him alone.", "دریبان گفت در فقط برای اوست."),
                    StoryParagraph("The man died without ever entering.", "مرد بدون اینکه وارد شود مرد."),
                    StoryParagraph("Josef K. did not understand the meaning.", "یوزف ک. معنا را نفهمید."),
                    StoryParagraph("The priest said the man had deceived himself.", "کشیش گفت مرد خودش را فریب داده بود."),
                    StoryParagraph("Josef K. felt the parable was about him.", "یوزف ک. احساس کرد مَثَل درباره اوست."),
                    StoryParagraph("He felt he had been deceived too.", "احساس کرد او هم فریب خورده."),
                    StoryParagraph("He felt he had been waiting his whole life.", "احساس کرد تمام عمرش منتظر مانده."),
                    StoryParagraph("And now it was too late.", "و حالا دیگر خیلی دیر بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End", titlePersian = "پایان",
                paragraphs = listOf(
                    StoryParagraph("Two men came for Josef K. one night.", "دو مرد یک شب برای یوزف ک. آمدند."),
                    StoryParagraph("It was the eve of his thirty-first birthday.", "شب قبل از سی و یکمین تولدش بود."),
                    StoryParagraph("They took him to the outskirts of town.", "او را به حاشیه شهر بردند."),
                    StoryParagraph("They walked through dark streets.", "از خیابان‌های تاریک گذشتند."),
                    StoryParagraph("Josef K. did not resist.", "یوزف ک. مقاومت نکرد."),
                    StoryParagraph("He knew it was useless.", "می‌دانست بی‌فایده است."),
                    StoryParagraph("They reached a quarry.", "به معدن سنگی رسیدند."),
                    StoryParagraph("One man held him.", "یکی او را نگه داشت."),
                    StoryParagraph("The other stabbed him in the heart.", "دیگری به قلبش چاقو زد."),
                    StoryParagraph("Josef K. died without knowing his crime.", "یوزف ک. بدون اینکه جرمش را بداند مرد."),
                    StoryParagraph("He died without understanding the law.", "بدون اینکه قانون را بفهمد مرد."),
                    StoryParagraph("He died like a dog.", "مثل سگی مرد."),
                    StoryParagraph("The shame of it outlived him.", "شرمش از او بیشتر زنده ماند."),
                    StoryParagraph("His story was never told.", "داستانش هرگز گفته نشد."),
                    StoryParagraph("His case was never solved.", "پرونده‌اش هرگز حل نشد."),
                    StoryParagraph("His death was never explained.", "مرگش هرگز توضیح داده نشد."),
                    StoryParagraph("The court continued without him.", "دادگاه بدون او ادامه یافت."),
                    StoryParagraph("The system went on as before.", "سیستم مثل قبل ادامه یافت."),
                    StoryParagraph("Nothing changed.", "هیچ چیز تغییر نکرد."),
                    StoryParagraph("And nobody cared.", "و هیچ‌کس اهمیت نداد.")
                )
            )
        )
    )

    // ─────────────── ۱۷: به سوی فانوس دریایی ───────────────
    private fun story17() = StoryContent(
        storyId = "adv_to_the_lighthouse",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Window", titlePersian = "پنجره",
                paragraphs = listOf(
                    StoryParagraph("The Ramsays were staying at their summer house.", "رامزی‌ها در خانه تابستانی‌شان اقامت داشتند."),
                    StoryParagraph("It was on the Isle of Skye in Scotland.", "در جزیره اسکای در اسکاتلند بود."),
                    StoryParagraph("Mr. Ramsay was a philosopher.", "آقای رامزی فیلسوف بود."),
                    StoryParagraph("He was brilliant but cold.", "او نابغه اما سرد بود."),
                    StoryParagraph("He was often cruel to his family.", "او اغلب با خانواده‌اش ظالم بود."),
                    StoryParagraph("Mrs. Ramsay was beautiful and kind.", "خانم رامزی زیبا و مهربان بود."),
                    StoryParagraph("She was the heart of the family.", "او قلب خانواده بود."),
                    StoryParagraph("She brought people together.", "او مردم را گرد هم می‌آورد."),
                    StoryParagraph("She understood them without words.", "بدون کلام آن‌ها را می‌فهمید."),
                    StoryParagraph("Their son James wanted to go to the lighthouse.", "پسرشان جیمز می‌خواست به فانوس دریایی برود."),
                    StoryParagraph("He was six years old.", "او شش ساله بود."),
                    StoryParagraph("Mrs. Ramsay said yes.", "خانم رامزی بله گفت."),
                    StoryParagraph("But Mr. Ramsay said no.", "اما آقای رامزی نه گفت."),
                    StoryParagraph("He said the weather would be bad.", "گفت هوا بد خواهد بود."),
                    StoryParagraph("James hated his father for it.", "جیمز برای این کار از پدرش متنفر شد."),
                    StoryParagraph("A young painter named Lily Briscoe was visiting.", "نقاش جوانی به نام لیلی بریسکو مهمان بود."),
                    StoryParagraph("She was painting Mrs. Ramsay and James.", "او در حال نقاشی خانم رامزی و جیمز بود."),
                    StoryParagraph("She wanted to capture the truth of life.", "می‌خواست حقیقت زندگی را ثبت کند."),
                    StoryParagraph("But she did not know how.", "اما نمی‌دانست چطور."),
                    StoryParagraph("The day passed slowly.", "روز به کندی گذشت."),
                    StoryParagraph("The trip was postponed.", "سفر به تعویق افتاد.")
                )
            ),
            StoryChapter(
                number = 2, title = "Time Passes", titlePersian = "زمان می‌گذرد",
                paragraphs = listOf(
                    StoryParagraph("The war came.", "جنگ آمد."),
                    StoryParagraph("The world changed.", "دنیا تغییر کرد."),
                    StoryParagraph("The Ramsay house stood empty.", "خانه رامزی خالی ماند."),
                    StoryParagraph("The wind blew through the rooms.", "باد از اتاق‌ها می‌گذشت."),
                    StoryParagraph("The rain fell on the roof.", "باران روی سقف می‌ریخت."),
                    StoryParagraph("The wallpaper peeled from the walls.", "کاغذدیواری از دیوارها کنده می‌شد."),
                    StoryParagraph("The garden grew wild.", "باغ وحشی شد."),
                    StoryParagraph("Weeds covered the paths.", "علف‌های هرز راه‌ها را پوشاندند."),
                    StoryParagraph("Dust filled every corner.", "گرد و غبار هر گوشه را پر کرد."),
                    StoryParagraph("The house was forgotten.", "خانه فراموش شد."),
                    StoryParagraph("Mrs. Ramsay died suddenly.", "خانم رامزی ناگهان مرد."),
                    StoryParagraph("Her death was written in brackets.", "مرگش در پرانتز نوشته شد."),
                    StoryParagraph("Her son Prue died in childbirth.", "پسرش پرو در زایمان مرد."),
                    StoryParagraph("Her son Andrew died in the war.", "پسرش اندرو در جنگ مرد."),
                    StoryParagraph("The family was shattered.", "خانواده از هم پاشید."),
                    StoryParagraph("The years passed like shadows.", "سال‌ها مثل سایه گذشتند."),
                    StoryParagraph("Time moved without meaning.", "زمان بی‌معنا گذشت."),
                    StoryParagraph("Nothing and everything changed.", "هیچ چیز و همه چیز تغییر کرد."),
                    StoryParagraph("The lighthouse still stood.", "فانوس دریایی هنوز پابرجا بود."),
                    StoryParagraph("Its light still shone across the sea.", "نورش هنوز روی دریا می‌تابید.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Lighthouse", titlePersian = "فانوس دریایی",
                paragraphs = listOf(
                    StoryParagraph("Ten years had passed.", "ده سال گذشته بود."),
                    StoryParagraph("The remaining Ramsays returned to the house.", "رامزی‌های باقی‌مانده به خانه برگشتند."),
                    StoryParagraph("Mr. Ramsay was old now.", "آقای رامزی حالا پیر شده بود."),
                    StoryParagraph("He finally decided to go to the lighthouse.", "او بالاخره تصمیم گرفت به فانوس دریایی برود."),
                    StoryParagraph("James was sixteen now.", "جیمز حالا شانزده ساله بود."),
                    StoryParagraph("He was angry and resentful.", "او عصبانی و دلخور بود."),
                    StoryParagraph("He did not want to go.", "نمی‌خواست برود."),
                    StoryParagraph("He still hated his father.", "هنوز از پدرش متنفر بود."),
                    StoryParagraph("But he went.", "اما رفت."),
                    StoryParagraph("On the boat, something changed.", "در قایق، چیزی تغییر کرد."),
                    StoryParagraph("Mr. Ramsay praised James.", "آقای رامزی جیمز را تحسین کرد."),
                    StoryParagraph("He said James steered well.", "گفت جیمز خوب هدایت کرد."),
                    StoryParagraph("James felt a strange forgiveness.", "جیمز بخشش عجیبی حس کرد."),
                    StoryParagraph("He realized his father was human.", "فهمید پدرش انسان است."),
                    StoryParagraph("He realized his father was weak.", "فهمید پدرش ضعیف است."),
                    StoryParagraph("He realized his father was afraid.", "فهمید پدرش می‌ترسد."),
                    StoryParagraph("They reached the lighthouse together.", "با هم به فانوس دریایی رسیدند."),
                    StoryParagraph("It was a simple thing.", "چیز ساده‌ای بود."),
                    StoryParagraph("But it meant everything.", "اما معنایش همه چیز بود."),
                    StoryParagraph("The journey was complete.", "سفر کامل شد."),
                    StoryParagraph("The dream was fulfilled.", "رؤیا برآورده شد."),
                    StoryParagraph("The past was forgiven.", "گذشته بخشیده شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Lily's Painting", titlePersian = "نقاشی لیلی",
                paragraphs = listOf(
                    StoryParagraph("Lily Briscoe returned to the house.", "لیلی بریسکو به خانه برگشت."),
                    StoryParagraph("She had never finished her painting.", "او هرگز نقاشی‌اش را تمام نکرده بود."),
                    StoryParagraph("She had been trying for ten years.", "ده سال تلاش کرده بود."),
                    StoryParagraph("She remembered Mrs. Ramsay.", "خانم رامزی را به یاد آورد."),
                    StoryParagraph("She remembered her beauty and kindness.", "زیبایی و مهربانی‌اش را به یاد آورد."),
                    StoryParagraph("She remembered her strength and wisdom.", "قدرت و دانایی‌اش را به یاد آورد."),
                    StoryParagraph("She remembered her love.", "عشقش را به یاد آورد."),
                    StoryParagraph("She set up her easel again.", "سه‌پایه نقاشی‌اش را دوباره برپا کرد."),
                    StoryParagraph("She began to paint.", "شروع به نقاشی کرد."),
                    StoryParagraph("She painted from memory.", "از حافظه نقاشی کرد."),
                    StoryParagraph("She painted from love.", "از عشق نقاشی کرد."),
                    StoryParagraph("She painted from sorrow.", "از اندوه نقاشی کرد."),
                    StoryParagraph("She painted from hope.", "از امید نقاشی کرد."),
                    StoryParagraph("She painted from life.", "از زندگی نقاشی کرد."),
                    StoryParagraph("Suddenly, she understood.", "ناگهان، فهمید."),
                    StoryParagraph("She saw the vision clearly.", "رؤیا را واضح دید."),
                    StoryParagraph("She made a mark on the canvas.", "نشانه‌ای روی بوم گذاشت."),
                    StoryParagraph("She saw the shape of the painting.", "شکل نقاشی را دید."),
                    StoryParagraph("She had made her vision real.", "رؤیایش را واقعی کرده بود."),
                    StoryParagraph("It was enough.", "کافی بود."),
                    StoryParagraph("She had done it.", "او انجامش داده بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Meaning of It All", titlePersian = "معنای همه چیز",
                paragraphs = listOf(
                    StoryParagraph("The novel is about time and memory.", "رمان درباره زمان و حافظه است."),
                    StoryParagraph("It is about love and loss.", "درباره عشق و فقدان است."),
                    StoryParagraph("It is about family and loneliness.", "درباره خانواده و تنهایی است."),
                    StoryParagraph("It is about art and life.", "درباره هنر و زندگی است."),
                    StoryParagraph("It is about the search for truth.", "درباره جستجوی حقیقت است."),
                    StoryParagraph("Mrs. Ramsay found truth in love.", "خانم رامزی حقیقت را در عشق یافت."),
                    StoryParagraph("Lily found truth in art.", "لیلی حقیقت را در هنر یافت."),
                    StoryParagraph("James found truth in forgiveness.", "جیمز حقیقت را در بخشش یافت."),
                    StoryParagraph("Mr. Ramsay found truth in old age.", "آقای رامزی حقیقت را در پیری یافت."),
                    StoryParagraph("Each person found their own truth.", "هر کس حقیقت خودش را یافت."),
                    StoryParagraph("Each person found their own peace.", "هر کس آرامش خودش را یافت."),
                    StoryParagraph("The lighthouse was a symbol.", "فانوس دریایی نمادی بود."),
                    StoryParagraph("It was a goal and a dream.", "هدف و رؤیا بود."),
                    StoryParagraph("It was a light in the darkness.", "نوری در تاریکی بود."),
                    StoryParagraph("It was hope in the despair.", "امیدی در ناامیدی بود."),
                    StoryParagraph("It was love in the loneliness.", "عشقی در تنهایی بود."),
                    StoryParagraph("It was life in the death.", "زندگی در مرگ بود."),
                    StoryParagraph("The Ramsays reached it.", "رامزی‌ها به آن رسیدند."),
                    StoryParagraph("Lily reached it in her art.", "لیلی در هنرش به آن رسید."),
                    StoryParagraph("Mrs. Ramsay reached it in her love.", "خانم رامزی در عشقش به آن رسید."),
                    StoryParagraph("And we reach it in our lives.", "و ما در زندگی‌مان به آن می‌رسیم.")
                )
            )
        )
    )

    // ─────────────── ۱۸: دلبند ───────────────
    private fun story18() = StoryContent(
        storyId = "adv_beloved",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Haunted House", titlePersian = "خانه تسخیرشده",
                paragraphs = listOf(
                    StoryParagraph("124 Bluestone Road was a haunted house.", "خیابان بلوستون ۱۲۴ خانه‌ای تسخیرشده بود."),
                    StoryParagraph("The house was in Cincinnati, Ohio.", "خانه در سینسیناتی، اوهایو بود."),
                    StoryParagraph("It was 1873, after the Civil War.", "سال ۱۸۷۳ بود، بعد از جنگ داخلی."),
                    StoryParagraph("Sethe lived there with her daughter Denver.", "ست در آنجا با دخترش دنور زندگی می‌کرد."),
                    StoryParagraph("The ghost of her dead baby haunted the house.", "روح نوزاد مرده‌اش خانه را تسخیر کرده بود."),
                    StoryParagraph("The ghost threw things and made noises.", "روح چیزها را پرت می‌کرد و صدا ایجاد می‌کرد."),
                    StoryParagraph("Denver was lonely and afraid.", "دنور تنها و ترسیده بود."),
                    StoryParagraph("She had no friends.", "او دوستی نداشت."),
                    StoryParagraph("Her brothers had run away years ago.", "برادرانش سال‌ها پیش فرار کرده بودند."),
                    StoryParagraph("Her grandmother Baby Suggs had died.", "مادربزرگش بیبی ساگز مرده بود."),
                    StoryParagraph("Sethe had been a slave in Kentucky.", "ست در کنتاکی برده بوده."),
                    StoryParagraph("She had escaped to freedom.", "او به آزادی فرار کرده بود."),
                    StoryParagraph("She had killed her baby daughter to save her.", "دختر نوزادش را برای نجاتش کشته بود."),
                    StoryParagraph("She did not want her to be a slave.", "نمی‌خواست برده شود."),
                    StoryParagraph("She carved the word 'Beloved' on her tombstone.", "کلمه «دلبند» را روی سنگ قبرش حک کرد."),
                    StoryParagraph("She had paid for it with her body.", "با بدنش هزینه‌اش را پرداخته بود."),
                    StoryParagraph("She never forgot what she had done.", "هرگز فراموش نکرد چه کرده."),
                    StoryParagraph("She never forgave herself.", "هرگز خودش را نبخشید."),
                    StoryParagraph("But she believed she had no choice.", "اما معتقد بود چاره‌ای نداشته."),
                    StoryParagraph("Slavery had made her do it.", "بردگی مجبورش کرده بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "Paul D", titlePersian = "پاول دی",
                paragraphs = listOf(
                    StoryParagraph("A man named Paul D came to the house.", "مردی به نام پاول دی به خانه آمد."),
                    StoryParagraph("He had been a slave with Sethe.", "او با ست برده بوده."),
                    StoryParagraph("They had worked on the same plantation.", "در همان مزرعه کار می‌کردند."),
                    StoryParagraph("It was called Sweet Home.", "اسمش خانه شیرین بود."),
                    StoryParagraph("Paul D had been running for years.", "پاول دی سال‌ها در فرار بود."),
                    StoryParagraph("He had suffered terribly.", "او به شدت رنج کشیده بود."),
                    StoryParagraph("He had been chained and tortured.", "او را زنجیر و شکنجه کرده بودند."),
                    StoryParagraph("He had lost his manhood.", "مردانگی‌اش را از دست داده بود."),
                    StoryParagraph("He was afraid to love.", "از عشق می‌ترسید."),
                    StoryParagraph("He was afraid to feel.", "از احساس می‌ترسید."),
                    StoryParagraph("But he loved Sethe.", "اما ست را دوست داشت."),
                    StoryParagraph("He wanted to build a life with her.", "می‌خواست با او زندگی بسازد."),
                    StoryParagraph("He chased the ghost away.", "روح را فراری داد."),
                    StoryParagraph("For a while, they were happy.", "مدتی خوشحال بودند."),
                    StoryParagraph("For a while, they had peace.", "مدتی صلح داشتند."),
                    StoryParagraph("But the past cannot be forgotten.", "اما گذشته را نمی‌توان فراموش کرد."),
                    StoryParagraph("The past always returns.", "گذشته همیشه برمی‌گردد."),
                    StoryParagraph("One day, a young woman appeared.", "یک روز، زن جوانی ظاهر شد."),
                    StoryParagraph("She said her name was Beloved.", "گفت اسمش دلبند است."),
                    StoryParagraph("She was the same age the baby would have been.", "او هم‌سن نوزاد بود اگر زنده می‌ماند.")
                )
            ),
            StoryChapter(
                number = 3, title = "Beloved", titlePersian = "دلبند",
                paragraphs = listOf(
                    StoryParagraph("Beloved had no past.", "دلبند گذشته‌ای نداشت."),
                    StoryParagraph("She had no memories before the house.", "قبل از خانه خاطره‌ای نداشت."),
                    StoryParagraph("She could not explain where she came from.", "نمی‌توانست توضیح دهد از کجا آمده."),
                    StoryParagraph("She had smooth skin and strange eyes.", "پوست صاف و چشمان عجیبی داشت."),
                    StoryParagraph("She was like a child and a woman.", "او مثل بچه و زن بود."),
                    StoryParagraph("She loved Sethe desperately.", "او دیوانه‌وار ست را دوست داشت."),
                    StoryParagraph("She followed her everywhere.", "همه‌جا دنبالش می‌کرد."),
                    StoryParagraph("She wanted all her attention.", "تمام توجهش را می‌خواست."),
                    StoryParagraph("She hated Paul D.", "از پاول دی متنفر بود."),
                    StoryParagraph("She wanted him gone.", "می‌خواست او برود."),
                    StoryParagraph("She seduced him and drove him away.", "او را فریب داد و فراری‌اش داد."),
                    StoryParagraph("She became more demanding every day.", "هر روز طلبکارتر می‌شد."),
                    StoryParagraph("She ate more and more.", "بیشتر و بیشتر می‌خورد."),
                    StoryParagraph("She grew bigger and stronger.", "بزرگ‌تر و قوی‌تر شد."),
                    StoryParagraph("Sethe gave her everything.", "ست همه چیز به او داد."),
                    StoryParagraph("Sethe quit her job to care for her.", "ست کارش را رها کرد تا از او مراقبت کند."),
                    StoryParagraph("Sethe stopped eating.", "ست از خوردن دست کشید."),
                    StoryParagraph("Sethe became weak and thin.", "ست ضعیف و لاغر شد."),
                    StoryParagraph("Sethe was dying for her daughter.", "ست برای دخترش در حال مرگ بود."),
                    StoryParagraph("Beloved was draining her life.", "دلبند زندگی‌اش را می‌مکید."),
                    StoryParagraph("Denver realized the truth.", "دنور حقیقت را فهمید.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Community", titlePersian = "جامعه",
                paragraphs = listOf(
                    StoryParagraph("Denver went out for help.", "دنور برای کمک بیرون رفت."),
                    StoryParagraph("She asked the women of the community.", "از زنان جامعه کمک خواست."),
                    StoryParagraph("The women had once rejected Sethe.", "زنان یک بار ست را طرد کرده بودند."),
                    StoryParagraph("They had judged her for killing her baby.", "او را برای کشتن نوزادش قضاوت کرده بودند."),
                    StoryParagraph("But they also understood her pain.", "اما دردش را هم می‌فهمیدند."),
                    StoryParagraph("They also knew slavery's cruelty.", "ظلم بردگی را هم می‌دانستند."),
                    StoryParagraph("They decided to help her.", "تصمیم گرفتند کمکش کنند."),
                    StoryParagraph("Thirty women gathered at the house.", "سی زن در خانه جمع شدند."),
                    StoryParagraph("They prayed and sang.", "دعا خواندند و آواز خواندند."),
                    StoryParagraph("Their voices filled the air.", "صدایشان هوا را پر کرد."),
                    StoryParagraph("Sethe came to the door.", "ست به در آمد."),
                    StoryParagraph("She was holding an ice pick.", "اسکنه‌ای در دست داشت."),
                    StoryParagraph("She thought the white man had come.", "فکر کرد مرد سفیدپوست آمده."),
                    StoryParagraph("She thought she had to protect her children.", "فکر کرد باید از بچه‌هایش محافظت کند."),
                    StoryParagraph("She attacked the man.", "به مرد حمله کرد."),
                    StoryParagraph("The women held her back.", "زنان نگهش داشتند."),
                    StoryParagraph("Beloved disappeared.", "دلبند ناپدید شد."),
                    StoryParagraph("She was never seen again.", "او هرگز دیده نشد."),
                    StoryParagraph("The ghost was finally gone.", "روح بالاخره رفت."),
                    StoryParagraph("The house was peaceful.", "خانه آرام شد."),
                    StoryParagraph("But the memory remained.", "اما خاطره باقی ماند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Healing", titlePersian = "شفا",
                paragraphs = listOf(
                    StoryParagraph("Sethe was broken after Beloved left.", "ست بعد از رفتن دلبند شکسته شد."),
                    StoryParagraph("She had lost her daughter twice.", "دخترش را دو بار از دست داده بود."),
                    StoryParagraph("She did not want to live.", "نمی‌خواست زندگی کند."),
                    StoryParagraph("But Paul D returned.", "اما پاول دی برگشت."),
                    StoryParagraph("He found her sick in bed.", "او را مریض در تخت پیدا کرد."),
                    StoryParagraph("He took care of her.", "از او مراقبت کرد."),
                    StoryParagraph("He washed her and fed her.", "شستش و غذا داد."),
                    StoryParagraph("He told her she was her own best thing.", "به او گفت خودش بهترین چیز خودش است."),
                    StoryParagraph("She did not understand at first.", "اول نفهمید."),
                    StoryParagraph("She had never believed in herself.", "هرگز به خودش باور نداشت."),
                    StoryParagraph("She had only believed in her children.", "فقط به بچه‌هایش باور داشت."),
                    StoryParagraph("But slowly, she began to heal.", "اما به آرامی، شروع به شفا کرد."),
                    StoryParagraph("She began to forgive herself.", "شروع کرد به بخشیدن خودش."),
                    StoryParagraph("She began to love herself.", "شروع کرد به دوست داشتن خودش."),
                    StoryParagraph("She began to live again.", "شروع کرد به زندگی دوباره."),
                    StoryParagraph("The past was still there.", "گذشته هنوز آنجا بود."),
                    StoryParagraph("But it was not the only thing.", "اما تنها چیز نبود."),
                    StoryParagraph("The future was also there.", "آینده هم آنجا بود."),
                    StoryParagraph("And the present was a gift.", "و حال هدیه بود."),
                    StoryParagraph("And she was finally free.", "و او بالاخره آزاد بود."),
                    StoryParagraph("She was finally at peace.", "بالاخره در آرامش بود.")
                )
            )
        )
    )
}