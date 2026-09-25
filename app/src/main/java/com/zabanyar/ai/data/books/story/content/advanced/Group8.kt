package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۸ پیشرفته — ادبیات اروپایی و آفریقایی
 *  ۲۲. کوه جادو
 *  ۲۳. مرگ در ونیز
 *  ۲۴. آدم‌های ناچیز
 */
object Group8 {

    fun getAll(): List<StoryContent> = listOf(
        story22(),
        story23(),
        story24(),
    )

    // ─────────────── ۲۲: کوه جادو ───────────────
    private fun story22() = StoryContent(
        storyId = "adv_magic_mountain",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Arrival at the Sanatorium", titlePersian = "ورود به آسایشگاه",
                paragraphs = listOf(
                    StoryParagraph("Hans Castorp was a young German engineer.", "هانس کاستورپ مهندس جوان آلمانی بود."),
                    StoryParagraph("He came from a wealthy merchant family.", "او از خانواده‌ای تاجر ثروتمند می‌آمد."),
                    StoryParagraph("He was practical and modest.", "او عملی و فروتن بود."),
                    StoryParagraph("He planned to visit his cousin Joachim.", "او نقشه داشت به دیدن پسرعمویش یواخیم برود."),
                    StoryParagraph("Joachim was sick with tuberculosis.", "یواخیم به سل مبتلا بود."),
                    StoryParagraph("He was staying at a sanatorium in Davos.", "او در آسایشگاهی در داووس می‌ماند."),
                    StoryParagraph("It was high in the Swiss mountains.", "در ارتفاعات کوه‌های سوئیس بود."),
                    StoryParagraph("Hans traveled there by train.", "هانس با قطار به آنجا سفر کرد."),
                    StoryParagraph("The journey took two days.", "سفر دو روز طول کشید."),
                    StoryParagraph("He planned to stay for three weeks.", "نقشه داشت سه هفته بماند."),
                    StoryParagraph("The air was thin and cold.", "هوا رقیق و سرد بود."),
                    StoryParagraph("The sanatorium was called Berghof.", "آسایشگاه برگهوف نام داشت."),
                    StoryParagraph("It was full of sick people from many countries.", "پر از افراد مریض از کشورهای زیادی بود."),
                    StoryParagraph("They rested on balconies all day.", "آن‌ها تمام روز روی بالکن‌ها استراحت می‌کردند."),
                    StoryParagraph("They ate five rich meals a day.", "روزی پنج وعده غنی می‌خوردند."),
                    StoryParagraph("They measured their temperature constantly.", "مدام دمایشان را اندازه می‌گرفتند."),
                    StoryParagraph("Hans found the life strange and slow.", "هانس زندگی را عجیب و کند یافت."),
                    StoryParagraph("Time seemed to move differently there.", "زمان به نظر می‌رسید آنجا متفاوت می‌گذرد."),
                    StoryParagraph("He met a Russian woman named Clavdia.", "او زنی روسی به نام کلودیا ملاقات کرد."),
                    StoryParagraph("He was immediately drawn to her.", "او بلافاصله جذبش شد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Diagnosis", titlePersian = "تشخیص",
                paragraphs = listOf(
                    StoryParagraph("Hans began to feel unwell.", "هانس شروع کرد به احساس ناخوشی."),
                    StoryParagraph("He had a cough and a fever.", "او سرفه و تب داشت."),
                    StoryParagraph("The doctor examined him carefully.", "دکتر با دقت معاینه‌اش کرد."),
                    StoryParagraph("The doctor was named Hofrat Behrens.", "اسم دکتر هوفرات بهرنز بود."),
                    StoryParagraph("He was large and loud.", "او بزرگ و پرصدا بود."),
                    StoryParagraph("He told Hans he had tuberculosis.", "او به هانس گفت سل دارد."),
                    StoryParagraph("Hans was surprised and doubtful.", "هانس تعجب کرد و شک کرد."),
                    StoryParagraph("He felt fine most of the time.", "اکثر اوقات حالش خوب بود."),
                    StoryParagraph("But the doctor insisted he must stay.", "اما دکتر اصرار کرد باید بماند."),
                    StoryParagraph("Hans wrote to his family in Hamburg.", "هانس به خانواده‌اش در هامبورگ نامه نوشت."),
                    StoryParagraph("His uncle sent money for treatment.", "عمویش برای درمان پول فرستاد."),
                    StoryParagraph("So Hans stayed for months.", "پس هانس ماه‌ها ماند."),
                    StoryParagraph("He moved into his own room.", "او به اتاق خودش نقل مکان کرد."),
                    StoryParagraph("He learned the daily routines.", "او روتین‌های روزانه را یاد گرفت."),
                    StoryParagraph("He sat on the balcony wrapped in blankets.", "او با پتو روی بالکن می‌نشست."),
                    StoryParagraph("He took his temperature every hour.", "هر ساعت دمایش را اندازه می‌گرفت."),
                    StoryParagraph("He ate with the other patients.", "او با دیگر بیماران غذا می‌خورد."),
                    StoryParagraph("He listened to their conversations.", "به صحبت‌هایشان گوش می‌داد."),
                    StoryParagraph("Time became strange to him.", "زمان برایش عجیب شد."),
                    StoryParagraph("One week felt like a day.", "یک هفته مثل یک روز می‌گذشت.")
                )
            ),
            StoryChapter(
                number = 3, title = "Settembrini and Naphta", titlePersian = "ستیمبرینی و نافتا",
                paragraphs = listOf(
                    StoryParagraph("Two men often argued at the sanatorium.", "دو مرد زیاد در آسایشگاه بحث می‌کردند."),
                    StoryParagraph("The first was Lodovico Settembrini.", "اولی لودویکو ستیمبرینی بود."),
                    StoryParagraph("He was an Italian writer.", "او نویسنده‌ای ایتالیایی بود."),
                    StoryParagraph("He believed in reason and progress.", "او به عقل و پیشرفت اعتقاد داشت."),
                    StoryParagraph("He believed in human freedom.", "او به آزادی انسان اعتقاد داشت."),
                    StoryParagraph("He wanted to educate Hans.", "او می‌خواست هانس را آموزش دهد."),
                    StoryParagraph("The second was Leo Naphta.", "دومی لئو نافتا بود."),
                    StoryParagraph("He was a Jewish Jesuit.", "او یهودی یسوعی بود."),
                    StoryParagraph("He believed in faith and authority.", "او به ایمان و اقتدار اعتقاد داشت."),
                    StoryParagraph("He criticized democracy and capitalism.", "او دموکراسی و سرمایه‌داری را نقد می‌کرد."),
                    StoryParagraph("He said suffering was noble.", "او گفت رنج نجیب است."),
                    StoryParagraph("He said freedom was an illusion.", "او گفت آزادی توهم است."),
                    StoryParagraph("Hans listened to both of them.", "هانس به هر دو گوش داد."),
                    StoryParagraph("He was confused and fascinated.", "او گیج و مجذوب بود."),
                    StoryParagraph("The two men argued for hours.", "دو مرد ساعت‌ها بحث می‌کردند."),
                    StoryParagraph("They argued about politics and religion.", "درباره سیاست و مذهب بحث می‌کردند."),
                    StoryParagraph("They argued about life and death.", "درباره زندگی و مرگ بحث می‌کردند."),
                    StoryParagraph("Hans could not decide who was right.", "هانس نمی‌توانست تصمیم بگیرد کدام درست می‌گوید."),
                    StoryParagraph("So he listened and waited.", "پس گوش داد و منتظر ماند."),
                    StoryParagraph("The arguments became his education.", "بحث‌ها آموزشش شدند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Snow", titlePersian = "برف",
                paragraphs = listOf(
                    StoryParagraph("One winter day, Hans went skiing alone.", "یک روز زمستانی، هانس تنهایی به اسکی رفت."),
                    StoryParagraph("He had been given skis by the doctor.", "دکتر اسکی‌هایی به او داده بود."),
                    StoryParagraph("He wanted to be alone with his thoughts.", "می‌خواست با افکارش تنها باشد."),
                    StoryParagraph("He went further than he should.", "او دورتر از آنچه باید رفت."),
                    StoryParagraph("A snowstorm suddenly began.", "طوفانی ناگهان شروع شد."),
                    StoryParagraph("He could not see the way back.", "نمی‌توانست راه برگشت را ببیند."),
                    StoryParagraph("He became cold and afraid.", "او سرد و ترسیده شد."),
                    StoryParagraph("He found a small shed and hid inside.", "کلبه کوچکی پیدا کرد و داخلش پنهان شد."),
                    StoryParagraph("He wanted to sleep but knew he would die.", "می‌خواست بخوابد اما می‌دانست می‌میرد."),
                    StoryParagraph("So he stayed awake and thought.", "پس بیدار ماند و فکر کرد."),
                    StoryParagraph("He had a dream or a vision.", "خواب یا رؤیایی دید."),
                    StoryParagraph("He saw a beautiful green landscape.", "منظره‌ای سبز و زیبا دید."),
                    StoryParagraph("He saw people living in peace.", "مردم را دید که در آرامش زندگی می‌کردند."),
                    StoryParagraph("A child was helping an old woman.", "کودکی به پیرزنی کمک می‌کرد."),
                    StoryParagraph("He understood something deep.", "چیزی عمیق را فهمید."),
                    StoryParagraph("He said: I will be good.", "او گفت: خوب خواهم بود."),
                    StoryParagraph("He said: I will keep death out of my heart.", "او گفت: مرگ را در قلبم راه نخواهم داد."),
                    StoryParagraph("The dream gave him strength to live.", "خواب به او قدرت زندگی داد."),
                    StoryParagraph("He found his way back to the sanatorium.", "او راه برگشت به آسایشگاه را پیدا کرد."),
                    StoryParagraph("He never forgot that vision.", "او هرگز آن رؤیا را فراموش نکرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Thunderbolt", titlePersian = "آذرخش",
                paragraphs = listOf(
                    StoryParagraph("Hans stayed on the mountain for seven years.", "هانس هفت سال روی کوه ماند."),
                    StoryParagraph("He never left the sanatorium.", "او هرگز آسایشگاه را ترک نکرد."),
                    StoryParagraph("Time passed without meaning.", "زمان بی‌معنا گذشت."),
                    StoryParagraph("His cousin Joachim died.", "پسرعمویش یواخیم مرد."),
                    StoryParagraph("Settembrini and Naphta argued until the end.", "ستیمبرینی و نافتا تا آخر بحث کردند."),
                    StoryParagraph("Naphta finally shot himself in a duel.", "نافتا در نهایت در دوئلی خودش را کشت."),
                    StoryParagraph("Clavdia left the sanatorium.", "کلودیا آسایشگاه را ترک کرد."),
                    StoryParagraph("Hans was alone with his thoughts.", "هانس با افکارش تنها شد."),
                    StoryParagraph("He was no longer a young man.", "او دیگر مرد جوانی نبود."),
                    StoryParagraph("Then news came from the world below.", "بعد خبری از دنیای پایین رسید."),
                    StoryParagraph("A great war had begun.", "جنگ بزرگی شروع شده بود."),
                    StoryParagraph("The year was 1914.", "سال ۱۹۱۴ بود."),
                    StoryParagraph("All the patients rushed to leave.", "همه بیماران شتافتند تا بروند."),
                    StoryParagraph("They wanted to join their countries' armies.", "می‌خواستند به ارتش کشورهایشان بپیوندند."),
                    StoryParagraph("Hans also went down from the mountain.", "هانس هم از کوه پایین رفت."),
                    StoryParagraph("He joined the German army as a soldier.", "او به عنوان سرباز به ارتش آلمان پیوست."),
                    StoryParagraph("He fought in the muddy trenches.", "او در سنگرهای گلی جنگید."),
                    StoryParagraph("The magic mountain was now far away.", "کوه جادو حالا دور بود."),
                    StoryParagraph("Suddenly, a shell exploded near him.", "ناگهان، گلوله‌ای نزدیکش منفجر شد."),
                    StoryParagraph("And the story ended with that thunderbolt.", "و داستان با آن آذرخش پایان یافت.")
                )
            )
        )
    )

    // ─────────────── ۲۳: مرگ در ونیز ───────────────
    private fun story23() = StoryContent(
        storyId = "adv_death_venice",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Writer's Weariness", titlePersian = "خستگی نویسنده",
                paragraphs = listOf(
                    StoryParagraph("Gustav von Aschenbach was a famous German writer.", "گوستاو فون آشنباخ نویسنده معروف آلمانی بود."),
                    StoryParagraph("He was in his early fifties.", "او در اوایل پنجاه سالگی بود."),
                    StoryParagraph("He was respected by everyone.", "همه به او احترام می‌گذاشتند."),
                    StoryParagraph("He had won many literary prizes.", "او جوایز ادبی زیادی برده بود."),
                    StoryParagraph("He had even been made a nobleman.", "حتی نجیب‌زاده شده بود."),
                    StoryParagraph("His life was disciplined and orderly.", "زندگی‌اش منظم و مرتب بود."),
                    StoryParagraph("He worked every day with great effort.", "او هر روز با تلاش زیاد کار می‌کرد."),
                    StoryParagraph("He never rested or played.", "او هرگز استراحت یا بازی نمی‌کرد."),
                    StoryParagraph("But one spring, he felt exhausted.", "اما یک بهار، احساس خستگی کرد."),
                    StoryParagraph("He could not write anymore.", "او دیگر نمی‌توانست بنویسد."),
                    StoryParagraph("He felt a strange longing for the south.", "او اشتیاق عجیبی برای جنوب حس کرد."),
                    StoryParagraph("He wanted to see warm countries.", "می‌خواست کشورهای گرم را ببیند."),
                    StoryParagraph("He decided to travel to Venice.", "او تصمیم گرفت به ونیز سفر کند."),
                    StoryParagraph("Venice was a city of canals and beauty.", "ونیز شهری پر از کانال و زیبایی بود."),
                    StoryParagraph("He took a boat to the island of Lido.", "او با قایقی به جزیره لیدو رفت."),
                    StoryParagraph("He checked into a grand hotel.", "او در هتلی بزرگ اقامت کرد."),
                    StoryParagraph("The hotel was full of rich guests.", "هتل پر از مهمانان ثروتمند بود."),
                    StoryParagraph("He sat on the beach and watched the sea.", "او روی ساحل نشست و دریا را تماشا کرد."),
                    StoryParagraph("He felt something was about to happen.", "احساس کرد چیزی در شرف وقوع است."),
                    StoryParagraph("And then he saw the boy.", "و بعد پسر را دید.")
                )
            ),
            StoryChapter(
                number = 2, title = "Tadzio", titlePersian = "تادزیو",
                paragraphs = listOf(
                    StoryParagraph("Among the hotel guests was a Polish family.", "بین مهمانان هتل خانواده‌ای لهستانی بود."),
                    StoryParagraph("There were three children.", "سه فرزند داشتند."),
                    StoryParagraph("The oldest was a boy of about fourteen.", "بزرگ‌ترین پسری حدوداً چهارده ساله بود."),
                    StoryParagraph("His name was Tadzio.", "اسمش تادزیو بود."),
                    StoryParagraph("He was incredibly beautiful.", "او فوق‌العاده زیبا بود."),
                    StoryParagraph("His face was like a Greek statue.", "صورتش مثل مجسمه یونانی بود."),
                    StoryParagraph("His hair was dark and curly.", "موهایش تیره و فر بود."),
                    StoryParagraph("His smile was like a god's smile.", "لبخندش مثل لبخند خدایان بود."),
                    StoryParagraph("Aschenbach was stunned by his beauty.", "آشنباخ از زیبایی‌اش مات شد."),
                    StoryParagraph("He could not stop looking at him.", "نمی‌توانست از نگاه کردنش دست بکشد."),
                    StoryParagraph("He watched the boy play on the beach.", "تماشا کرد که پسر روی ساحل بازی می‌کند."),
                    StoryParagraph("He watched him run and swim.", "تماشا کرد که می‌دود و شنا می‌کند."),
                    StoryParagraph("He felt something he had never felt before.", "چیزی حس کرد که هرگز قبلاً حس نکرده بود."),
                    StoryParagraph("It was not love exactly.", "دقیقاً عشق نبود."),
                    StoryParagraph("It was more like worship.", "بیشتر شبیه پرستش بود."),
                    StoryParagraph("He began to follow the boy quietly.", "او شروع کرد بی‌صدا دنبال پسر کردن."),
                    StoryParagraph("He watched him in the dining room.", "او را در اتاق غذاخوری تماشا کرد."),
                    StoryParagraph("He watched him in the garden.", "او را در باغ تماشا کرد."),
                    StoryParagraph("He watched him in the gondolas.", "او را در گوندولاها تماشا کرد."),
                    StoryParagraph("He forgot his work and his home.", "کار و خانه‌اش را فراموش کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Pursuit", titlePersian = "تعقیب",
                paragraphs = listOf(
                    StoryParagraph("Aschenbach began to follow Tadzio everywhere.", "آشنباخ شروع کرد همه‌جا دنبال تادزیو کردن."),
                    StoryParagraph("He watched him from afar.", "از دور تماشایش می‌کرد."),
                    StoryParagraph("He wanted to be near him.", "می‌خواست نزدیکش باشد."),
                    StoryParagraph("He wanted to touch him.", "می‌خواست لمسش کند."),
                    StoryParagraph("But he never spoke to him.", "اما هرگز با او صحبت نکرد."),
                    StoryParagraph("He did not even know his voice.", "حتی صدایش را نمی‌شناخت."),
                    StoryParagraph("He thought he should leave Venice.", "فکر کرد باید ونیز را ترک کند."),
                    StoryParagraph("He tried to leave one morning.", "یک صبح تلاش کرد برود."),
                    StoryParagraph("But at the train station, he turned back.", "اما در ایستگاه قطار، برگشت."),
                    StoryParagraph("He could not leave the boy.", "نمی‌توانست پسر را ترک کند."),
                    StoryParagraph("He returned to the hotel.", "او به هتل برگشت."),
                    StoryParagraph("He began to look younger.", "او شروع کرد جوان‌تر به نظر رسیدن."),
                    StoryParagraph("He dressed more carefully.", "با دقت بیشتری لباس می‌پوشید."),
                    StoryParagraph("He dyed his hair black.", "موهایش را سیاه رنگ کرد."),
                    StoryParagraph("He used makeup on his face.", "روی صورتش آرایش می‌کرد."),
                    StoryParagraph("He wanted to be beautiful for Tadzio.", "می‌خواست برای تادزیو زیبا باشد."),
                    StoryParagraph("He was becoming someone else.", "او داشت شخص دیگری می‌شد."),
                    StoryParagraph("His dignity was slipping away.", "وقارش داشت از دست می‌رفت."),
                    StoryParagraph("But he did not care anymore.", "اما دیگر اهمیت نمی‌داد."),
                    StoryParagraph("He only cared about the boy.", "او فقط به پسر اهمیت می‌داد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Plague", titlePersian = "طاعون",
                paragraphs = listOf(
                    StoryParagraph("A strange smell filled the air of Venice.", "بوی عجیبی هوای ونیز را پر کرده بود."),
                    StoryParagraph("There were rumors of a disease.", "شایعاتی از بیماری بود."),
                    StoryParagraph("The authorities denied everything.", "مقامات همه چیز را انکار می‌کردند."),
                    StoryParagraph("They did not want tourists to leave.", "نمی‌خواستند توریست‌ها بروند."),
                    StoryParagraph("But people were dying in the city.", "اما مردم در شهر می‌مردند."),
                    StoryParagraph("It was cholera from the east.", "وبا از شرق بود."),
                    StoryParagraph("Aschenbach learned the truth.", "آشنباخ حقیقت را فهمید."),
                    StoryParagraph("He knew he should warn Tadzio's family.", "می‌دانست باید خانواده تادزیو را هشدار دهد."),
                    StoryParagraph("He knew they should leave.", "می‌دانست باید بروند."),
                    StoryParagraph("But he did not tell them.", "اما به آن‌ها نگفت."),
                    StoryParagraph("He wanted the boy to stay with him.", "می‌خواست پسر با او بماند."),
                    StoryParagraph("He was ready to die for this.", "آماده بود برای این بمیرد."),
                    StoryParagraph("The city became hot and humid.", "شهر داغ و مرطوب شد."),
                    StoryParagraph("The smell of death was everywhere.", "بوی مرگ همه‌جا بود."),
                    StoryParagraph("Aschenbach felt sick.", "آشنباخ مریض شد."),
                    StoryParagraph("But he still went to the beach every day.", "اما هر روز به ساحل می‌رفت."),
                    StoryParagraph("He still watched the boy play.", "هنوز تماشا می‌کرد پسر بازی کند."),
                    StoryParagraph("He watched a fight between Tadzio and another boy.", "تماشا کرد که تادزیو با پسر دیگری دعوا کرد."),
                    StoryParagraph("Tadzio lost and walked away.", "تادزیو شکست خورد و رفت."),
                    StoryParagraph("Aschenbach felt every emotion with him.", "آشنباخ هر احساسی را با او حس کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Last Day", titlePersian = "آخرین روز",
                paragraphs = listOf(
                    StoryParagraph("One afternoon, Aschenbach sat on the beach.", "یک بعدازظهر، آشنباخ روی ساحل نشست."),
                    StoryParagraph("He was very weak from the disease.", "او از بیماری خیلی ضعیف بود."),
                    StoryParagraph("But he did not want to go to a doctor.", "اما نمی‌خواست به دکتر برود."),
                    StoryParagraph("He watched Tadzio playing in the sea.", "تماشا کرد که تادزیو در دریا بازی می‌کند."),
                    StoryParagraph("The boy was beautiful as always.", "پسر مثل همیشه زیبا بود."),
                    StoryParagraph("Suddenly, Tadzio looked at him.", "ناگهان، تادزیو به او نگاه کرد."),
                    StoryParagraph("He looked directly into his eyes.", "مستقیم به چشمانش نگاه کرد."),
                    StoryParagraph("He smiled a strange smile.", "لبخند عجیبی زد."),
                    StoryParagraph("It was a smile of understanding.", "لبخندی از درک بود."),
                    StoryParagraph("Or perhaps a smile of farewell.", "یا شاید لبخندی از وداع."),
                    StoryParagraph("Aschenbach tried to stand up.", "آشنباخ تلاش کرد بلند شود."),
                    StoryParagraph("He wanted to reach the boy.", "می‌خواست به پسر برسد."),
                    StoryParagraph("But his body would not obey him.", "اما بدنش اطاعتش نکرد."),
                    StoryParagraph("He fell back onto the chair.", "او روی صندلی افتاد."),
                    StoryParagraph("His head dropped to his chest.", "سرش روی سینه‌اش افتاد."),
                    StoryParagraph("Death came quietly for him.", "مرگ بی‌صدا به سراغش آمد."),
                    StoryParagraph("The hotel staff found him later.", "کارکنان هتل بعداً پیدایش کردند."),
                    StoryParagraph("They took his body away in secret.", "آن‌ها جسدش را مخفیانه بردند."),
                    StoryParagraph("Tadzio never knew who he was.", "تادزیو هرگز نفهمید او کیست."),
                    StoryParagraph("And so the writer died in Venice.", "و اینگونه نویسنده در ونیز مرد.")
                )
            )
        )
    )

    // ─────────────── ۲۴: آدم‌های ناچیز ───────────────
    private fun story24() = StoryContent(
        storyId = "adv_things_fall_apart",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Okonkwo's Youth", titlePersian = "جوانی اوکونکوو",
                paragraphs = listOf(
                    StoryParagraph("Okonkwo was a great wrestler.", "اوکونکوو کشتی‌گیر بزرگی بود."),
                    StoryParagraph("He had thrown the Cat, the greatest wrestler.", "او گربه، بزرگ‌ترین کشتی‌گیر را پرت کرده بود."),
                    StoryParagraph("The whole village of Umuofia respected him.", "تمام دهکده اوموئوفیا به او احترام می‌گذاشتند."),
                    StoryParagraph("He was only eighteen years old then.", "او آن موقع فقط هجده ساله بود."),
                    StoryParagraph("His father Unoka had been a failure.", "پدرش اونوکا شکست‌خورده بود."),
                    StoryParagraph("Unoka was lazy and owed everyone money.", "اونوکا تنبل بود و به همه پول بدهکار بود."),
                    StoryParagraph("He loved music and conversation.", "او موسیقی و صحبت را دوست داشت."),
                    StoryParagraph("He died a shameful death.", "او مرگ شرم‌آوری مرد."),
                    StoryParagraph("Okonkwo hated everything his father loved.", "اوکونکوو از هر چیزی که پدرش دوست داشت متنفر بود."),
                    StoryParagraph("He wanted to be strong and successful.", "می‌خواست قوی و موفق باشد."),
                    StoryParagraph("He worked hard on his farm.", "او سخت روی مزرعه‌اش کار می‌کرد."),
                    StoryParagraph("He became a wealthy man.", "او مرد ثروتمندی شد."),
                    StoryParagraph("He had three wives and many children.", "او سه همسر و فرزندان زیادی داشت."),
                    StoryParagraph("His oldest son was named Nwoye.", "پسر بزرگش نوویه نام داشت."),
                    StoryParagraph("Okonkwo was harsh with his family.", "اوکونکوو با خانواده‌اش خشن بود."),
                    StoryParagraph("He ruled them with fear.", "او با ترس بر آن‌ها حکومت می‌کرد."),
                    StoryParagraph("He showed no kindness or patience.", "هیچ مهربانی و صبری نشان نمی‌داد."),
                    StoryParagraph("He was afraid of being like his father.", "می‌ترسید مثل پدرش شود."),
                    StoryParagraph("He became a leader of the village.", "او رهبر دهکده شد."),
                    StoryParagraph("He was chosen to be a guardian of traditions.", "او برای محافظت از سنت‌ها انتخاب شد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Week of Peace", titlePersian = "هفته صلح",
                paragraphs = listOf(
                    StoryParagraph("The village had a special week called the Week of Peace.", "دهکده هفته‌ای ویژه به نام هفته صلح داشت."),
                    StoryParagraph("During that week, no one was allowed to fight.", "در آن هفته، هیچ‌کس اجازه دعوا نداشت."),
                    StoryParagraph("Everyone had to be kind to each other.", "همه باید با هم مهربان بودند."),
                    StoryParagraph("It was a sacred time for the earth goddess.", "زمانی مقدس برای الهه زمین بود."),
                    StoryParagraph("One day, Okonkwo lost his temper.", "یک روز، اوکونکوو عصبانی شد."),
                    StoryParagraph("His youngest wife had not cooked dinner.", "همسر کوچکش شام نپخته بود."),
                    StoryParagraph("She had gone to braid her hair.", "او رفته بود موهایش را ببافد."),
                    StoryParagraph("He beat her badly.", "او بدجور کتکش زد."),
                    StoryParagraph("The village was shocked.", "دهکده شوکه شد."),
                    StoryParagraph("Breaking the Week of Peace was a great sin.", "شکستن هفته صلح گناه بزرگی بود."),
                    StoryParagraph("It could bring disaster to the whole village.", "می‌توانست بلا به تمام دهکده بیاورد."),
                    StoryParagraph("The priestess of the earth came to him.", "کاهنه زمین به پیشش آمد."),
                    StoryParagraph("She told him he had angered the gods.", "او گفت خدایان را خشمگین کرده."),
                    StoryParagraph("He had to bring gifts to the shrine.", "باید هدیه‌هایی به معبد می‌آورد."),
                    StoryParagraph("He had to beg for forgiveness.", "باید التماس بخشش می‌کرد."),
                    StoryParagraph("Okonkwo did what was required.", "اوکونکوو آنچه لازم بود انجام داد."),
                    StoryParagraph("But he was not truly sorry.", "اما واقعاً پشیمان نبود."),
                    StoryParagraph("He only feared punishment.", "او فقط از مجازات می‌ترسید."),
                    StoryParagraph("He could not admit he was wrong.", "نمی‌توانست بپذیرد اشتباه کرده."),
                    StoryParagraph("That was his weakness.", "این ضعفش بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Coming of the White Men", titlePersian = "آمدن سفیدپوستان",
                paragraphs = listOf(
                    StoryParagraph("One day, a white man came to the village.", "یک روز، مرد سفیدپوستی به دهکده آمد."),
                    StoryParagraph("He was a missionary.", "او میسیونری بود."),
                    StoryParagraph("He spoke through an interpreter.", "او از طریق مترجم صحبت می‌کرد."),
                    StoryParagraph("He talked about a new god.", "او درباره خدای جدیدی صحبت کرد."),
                    StoryParagraph("His god was loving and forgiving.", "خدایش مهربان و بخشنده بود."),
                    StoryParagraph("The villagers were confused.", "دهکده گیج شد."),
                    StoryParagraph("They already had many gods.", "آن‌ها قبلاً خدایان زیادی داشتند."),
                    StoryParagraph("Some were curious about the new religion.", "بعضی درباره دین جدید کنجکاو بودند."),
                    StoryParagraph("The missionaries built a church.", "میسیونرها کلیسایی ساختند."),
                    StoryParagraph("They also built a school and a hospital.", "آن‌ها مدرسه و بیمارستانی هم ساختند."),
                    StoryParagraph("Nwoye, Okonkwo's son, was interested.", "نوویه، پسر اوکونکوو، علاقه‌مند شد."),
                    StoryParagraph("He was unhappy with his father.", "او از پدرش ناراضی بود."),
                    StoryParagraph("He was drawn to the kindness of Christians.", "او به مهربانی مسیحیان کشیده شد."),
                    StoryParagraph("He converted to Christianity.", "او به مسیحیت گروید."),
                    StoryParagraph("Okonkwo was furious.", "اوکونکوو خشمگین شد."),
                    StoryParagraph("He felt his son had betrayed him.", "احساس کرد پسرش خیانت کرده."),
                    StoryParagraph("He disowned Nwoye.", "او نوویه را طرد کرد."),
                    StoryParagraph("He said his son was dead to him.", "او گفت پسرش برایش مرده است."),
                    StoryParagraph("Other young people also converted.", "جوانان دیگر هم گرویدند."),
                    StoryParagraph("The old ways began to break.", "راه‌های قدیمی شروع کردند به شکستن.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Conflict", titlePersian = "درگیری",
                paragraphs = listOf(
                    StoryParagraph("The Christians grew in number.", "مسیحیان بیشتر شدند."),
                    StoryParagraph("They built more churches in nearby villages.", "آن‌ها در دهکده‌های نزدیک کلیساهای بیشتری ساختند."),
                    StoryParagraph("They began to speak against the old gods.", "آن‌ها شروع کردند علیه خدایان قدیم صحبت کردن."),
                    StoryParagraph("One of the converts insulted a sacred mask.", "یکی از گرویدگان نقابی مقدس را توهین کرد."),
                    StoryParagraph("The mask was a spirit of the ancestors.", "نقاب روحی از اجداد بود."),
                    StoryParagraph("The village elders were angry.", "ریش‌سفیدان دهکده عصبانی شدند."),
                    StoryParagraph("The mask spirit had to punish the man.", "روح نقاب باید مرد را مجازات می‌کرد."),
                    StoryParagraph("But the Christians protected him.", "اما مسیحیان از او محافظت کردند."),
                    StoryParagraph("Okonkwo wanted war.", "اوکونکوو جنگ می‌خواست."),
                    StoryParagraph("But other elders chose patience.", "اما دیگر ریش‌سفیدان صبر انتخاب کردند."),
                    StoryParagraph("Then the British government interfered.", "بعد دولت بریتانیا مداخله کرد."),
                    StoryParagraph("They sent a district commissioner.", "آن‌ها کمیسر منطقه‌ای فرستادند."),
                    StoryParagraph("He wanted to rule the village.", "او می‌خواست دهکده را حکومت کند."),
                    StoryParagraph("He set up a court and a prison.", "او دادگاه و زندانی تاسیس کرد."),
                    StoryParagraph("He appointed local men as judges.", "او مردان محلی را قاضی کرد."),
                    StoryParagraph("These men were weak and easily controlled.", "این مردان ضعیف و آسان‌کنترل بودند."),
                    StoryParagraph("One day, they arrested a village leader.", "یک روز، رهبر دهکده را دستگیر کردند."),
                    StoryParagraph("The village gathered to free him.", "دهکده برای آزادکردنش جمع شد."),
                    StoryParagraph("Okonkwo led the crowd.", "اوکونکوو جمعیت را رهبری کرد."),
                    StoryParagraph("There was a violent confrontation.", "رویارویی خشونت‌باری شد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Fall of the Strong Man", titlePersian = "سقوط مرد قوی",
                paragraphs = listOf(
                    StoryParagraph("The British called a meeting.", "بریتانیایی‌ها جلسه‌ای فراخواندند."),
                    StoryParagraph("They wanted to discuss peace.", "می‌خواستند درباره صلح صحبت کنند."),
                    StoryParagraph("Okonkwo and other leaders went.", "اوکونکوو و رهبران دیگر رفتند."),
                    StoryParagraph("They were arrested and humiliated.", "آن‌ها دستگیر و تحقیر شدند."),
                    StoryParagraph("They were beaten and fined.", "آن‌ها کتک خوردند و جریمه شدند."),
                    StoryParagraph("The village had to pay a heavy price.", "دهکده مجبور شد بهای سنگینی بپردازد."),
                    StoryParagraph("Okonkwo was deeply wounded inside.", "اوکونکوو از درون عمیقاً زخمی شد."),
                    StoryParagraph("He had lost his honor.", "آبرویش را از دست داده بود."),
                    StoryParagraph("He wanted to fight the British.", "می‌خواست با بریتانیایی‌ها بجنگد."),
                    StoryParagraph("But the other leaders refused.", "اما رهبران دیگر امتناع کردند."),
                    StoryParagraph("They were afraid.", "آن‌ها ترسیده بودند."),
                    StoryParagraph("The village had lost its spirit.", "دهکده روحش را از دست داده بود."),
                    StoryParagraph("A final meeting was held in the market.", "جلسه نهایی در بازار برگزار شد."),
                    StoryParagraph("British soldiers came to stop it.", "سربازان بریتانیایی برای متوقف کردنش آمدند."),
                    StoryParagraph("Okonkwo drew his machete.", "اوکونکوو قمه‌اش را بیرون آورد."),
                    StoryParagraph("He killed a British messenger.", "او یک پیام‌آور بریتانیایی را کشت."),
                    StoryParagraph("He looked at the village elders.", "او به ریش‌سفیدان دهکده نگاه کرد."),
                    StoryParagraph("They did not stand with him.", "آن‌ها با او نایستادند."),
                    StoryParagraph("He knew his world was over.", "او فهمید دنیایش تمام شده است."),
                    StoryParagraph("So he hanged himself from a tree.", "پس خودش را از درختی حلق‌آویز کرد.")
                )
            )
        )
    )
}