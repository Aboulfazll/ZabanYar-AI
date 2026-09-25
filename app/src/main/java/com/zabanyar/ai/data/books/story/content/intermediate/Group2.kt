package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۲ — داستان‌های آگاتا کریستی
 *  ۴. قتل راجر آکروید
 *  ۵. مرگ روی نیل
 *  ۶. و سپس هیچ‌کس نماند
 */
object Group2 {

    fun getAll(): List<StoryContent> = listOf(
        story4(),
        story5(),
        story6(),
    )

    // ─────────────── ۴: قتل راجر آکروید ───────────────
    private fun story4() = StoryContent(
        storyId = "int_murder_ackroyd",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Death of Mrs. Ferrars", titlePersian = "مرگ خانم فرارز",
                paragraphs = listOf(
                    StoryParagraph("Dr. Sheppard lived in a quiet English village.", "دکتر شپرد در دهکده‌ای آرام در انگلیس زندگی می‌کرد."),
                    StoryParagraph("He was the doctor for all the people there.", "او دکتر همه مردم آنجا بود."),
                    StoryParagraph("One morning, he received an urgent phone call.", "یک صبح، تماس تلفنی فوری دریافت کرد."),
                    StoryParagraph("Mrs. Ferrars had died suddenly that night.", "خانم فرارز آن شب ناگهان مرده بود."),
                    StoryParagraph("Everyone thought it was a suicide.", "همه فکر کردند خودکشی بوده است."),
                    StoryParagraph("But Dr. Sheppard was not sure.", "اما دکتر شپرد مطمئن نبود."),
                    StoryParagraph("A few days later, Roger Ackroyd was killed.", "چند روز بعد، راجر آکروید کشته شد."),
                    StoryParagraph("Roger was a rich man in the village.", "راجر مرد ثروتمندی در دهکده بود."),
                    StoryParagraph("He had been in love with Mrs. Ferrars.", "او عاشق خانم فرارز بود."),
                    StoryParagraph("He wanted to marry her.", "او می‌خواست با او ازدواج کند."),
                    StoryParagraph("But now both of them were dead.", "اما حالا هر دو مرده بودند."),
                    StoryParagraph("The police came to investigate.", "پلیس برای تحقیق آمد."),
                    StoryParagraph("Dr. Sheppard's sister told him about a detective.", "خواهر دکتر شپرد درباره یک کارآگاه به او گفت."),
                    StoryParagraph("The detective's name was Hercule Poirot.", "اسم کارآگاه هرکول پوآرو بود."),
                    StoryParagraph("He was a famous detective from Belgium.", "او کارآگاه معروفی از بلژیک بود."),
                    StoryParagraph("He was now living in the village.", "او حالا در دهکده زندگی می‌کرد."),
                    StoryParagraph("He was growing vegetables in his garden.", "او در باغش سبزی می‌کاشت."),
                    StoryParagraph("Dr. Sheppard went to visit him.", "دکتر شپرد به دیدنش رفت."),
                    StoryParagraph("Poirot agreed to help with the case.", "پوآرو موافقت کرد به پرونده کمک کند."),
                    StoryParagraph("He began to ask many questions.", "او شروع کرد به پرسیدن سوالات زیاد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Murder of Roger", titlePersian = "قتل راجر",
                paragraphs = listOf(
                    StoryParagraph("Poirot went to Fernly Park.", "پوآرو به پارک فرنلی رفت."),
                    StoryParagraph("That was the name of Roger's house.", "آن نام خانه راجر بود."),
                    StoryParagraph("He examined the room carefully.", "او اتاق را با دقت بررسی کرد."),
                    StoryParagraph("There was a chair by the fire.", "صندلی‌ای کنار شومینه بود."),
                    StoryParagraph("A window was open.", "پنجره‌ای باز بود."),
                    StoryParagraph("A small tape recorder was found.", "یک ضبط‌صوت کوچک پیدا شد."),
                    StoryParagraph("It had been set to play a voice.", "برای پخش صدایی تنظیم شده بود."),
                    StoryParagraph("The voice said Roger was dead.", "صدا گفت راجر مرده است."),
                    StoryParagraph("But the voice was not Roger's.", "اما صدا صدای راجر نبود."),
                    StoryParagraph("Someone had made a false recording.", "یک نفر ضبط جعلی ساخته بود."),
                    StoryParagraph("Poirot asked about a missing letter.", "پوآرو درباره نامه‌ای گمشده پرسید."),
                    StoryParagraph("Roger had received it before his death.", "راجر قبل از مرگش آن را دریافت کرده بود."),
                    StoryParagraph("The letter was from Mrs. Ferrars.", "نامه از خانم فرارز بود."),
                    StoryParagraph("She had confessed to killing her husband.", "او اعتراف کرده بود شوهرش را کشته است."),
                    StoryParagraph("Roger was shocked by the news.", "راجر از این خبر شوکه شده بود."),
                    StoryParagraph("He wanted to tell the police.", "او می‌خواست به پلیس بگوید."),
                    StoryParagraph("But someone killed him first.", "اما یک نفر اول او را کشت."),
                    StoryParagraph("Poirot found a footprint outside.", "پوآرو یک رد پا بیرون پیدا کرد."),
                    StoryParagraph("It belonged to a man's shoe.", "به کفش یک مرد تعلق داشت."),
                    StoryParagraph("But no man admitted being there.", "اما هیچ مردی اعتراف نکرد آنجا بوده.")
                )
            ),
            StoryChapter(
                number = 3, title = "Hercule Poirot", titlePersian = "هرکول پوآرو",
                paragraphs = listOf(
                    StoryParagraph("Poirot sat in his garden and thought.", "پوآرو در باغش نشست و فکر کرد."),
                    StoryParagraph("He thought about each person in the house.", "او به هر کس در خانه فکر کرد."),
                    StoryParagraph("There was Mrs. Ackroyd, Roger's sister-in-law.", "خانم آکروید، خواهرزن راجر بود."),
                    StoryParagraph("She wanted money from the will.", "او از وصیت‌نامه پول می‌خواست."),
                    StoryParagraph("There was Flora, Roger's niece.", "فلورا، خواهرزاده راجر بود."),
                    StoryParagraph("She was engaged to Ralph Paton.", "او با رالف پیتون نامزد بود."),
                    StoryParagraph("Ralph was Roger's stepson.", "رالف پسرخوانده راجر بود."),
                    StoryParagraph("He had disappeared after the murder.", "او بعد از قتل ناپدید شده بود."),
                    StoryParagraph("There was Major Blunt, a guest.", "سرگرد بلانت، یک مهمان بود."),
                    StoryParagraph("There was Parker, the butler.", "پارکر، پیشخدمت بود."),
                    StoryParagraph("And there was Dr. Sheppard himself.", "و خود دکتر شپرد بود."),
                    StoryParagraph("Poirot asked about a mysterious man.", "پوآرو درباره مردی مرموز پرسید."),
                    StoryParagraph("A stranger had been seen near the house.", "غریبه‌ای نزدیک خانه دیده شده بود."),
                    StoryParagraph("Dr. Sheppard remembered seeing him.", "دکتر شپرد به یاد آورد او را دیده بود."),
                    StoryParagraph("The man was tall and dark.", "آن مرد بلندقد و تیره بود."),
                    StoryParagraph("He was asking about Mrs. Ferrars.", "او درباره خانم فرارز می‌پرسید."),
                    StoryParagraph("Poirot wanted to find this man.", "پوآرو می‌خواست این مرد را پیدا کند."),
                    StoryParagraph("He asked the police to search.", "او از پلیس خواست جستجو کنند."),
                    StoryParagraph("The stranger was found in a hotel.", "غریبه در یک هتل پیدا شد."),
                    StoryParagraph("His name was Charles Kent.", "اسمش چارلز کنت بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Hunt for the Killer", titlePersian = "شکار قاتل",
                paragraphs = listOf(
                    StoryParagraph("Poirot gathered everyone in the library.", "پوآرو همه را در کتابخانه جمع کرد."),
                    StoryParagraph("He said he knew who the killer was.", "او گفت می‌داند قاتل کیست."),
                    StoryParagraph("Everyone looked at each other nervously.", "همه با نگرانی به هم نگاه کردند."),
                    StoryParagraph("Poirot talked about the tape recorder.", "پوآرو درباره ضبط‌صوت صحبت کرد."),
                    StoryParagraph("He said it was a trick.", "او گفت ترفند بود."),
                    StoryParagraph("The killer had used it to create a false time.", "قاتل از آن استفاده کرده بود تا زمان جعلی بسازد."),
                    StoryParagraph("Then he talked about the footprint.", "بعد درباره رد پا صحبت کرد."),
                    StoryParagraph("It was made by a shoe from the house.", "با کفشی از خود خانه ساخته شده بود."),
                    StoryParagraph("Someone inside had killed Roger.", "یک نفر از داخل راجر را کشته بود."),
                    StoryParagraph("Poirot looked at Dr. Sheppard.", "پوآرو به دکتر شپرد نگاه کرد."),
                    StoryParagraph("He said the doctor had been there.", "او گفت دکتر آنجا بوده است."),
                    StoryParagraph("Dr. Sheppard was surprised.", "دکتر شپرد تعجب کرد."),
                    StoryParagraph("But Poirot explained everything.", "اما پوآرو همه چیز را توضیح داد."),
                    StoryParagraph("Dr. Sheppard needed money.", "دکتر شپرد به پول نیاز داشت."),
                    StoryParagraph("Mrs. Ferrars had told him her secret.", "خانم فرارز رازش را به او گفته بود."),
                    StoryParagraph("He decided to blackmail her.", "او تصمیم گرفت از او اخاذی کند."),
                    StoryParagraph("She killed herself from fear.", "او از ترس خودکشی کرد."),
                    StoryParagraph("Then Dr. Sheppard killed Roger.", "بعد دکتر شپرد راجر را کشت."),
                    StoryParagraph("He was the last person to see Roger alive.", "او آخرین کسی بود که راجر را زنده دید.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Confession", titlePersian = "اعتراف نهایی",
                paragraphs = listOf(
                    StoryParagraph("Dr. Sheppard did not say a word.", "دکتر شپرد یک کلمه هم نگفت."),
                    StoryParagraph("He knew Poirot was right.", "او می‌دانست پوآرو درست می‌گوید."),
                    StoryParagraph("The evidence was clear.", "شواهد روشن بود."),
                    StoryParagraph("The police arrested him that night.", "پلیس آن شب او را دستگیر کرد."),
                    StoryParagraph("Ralph Paton came back to the village.", "رالف پیتون به دهکده برگشت."),
                    StoryParagraph("He was innocent all along.", "او از اول بی‌گناه بود."),
                    StoryParagraph("Flora was happy to see him.", "فلورا از دیدنش خوشحال شد."),
                    StoryParagraph("They planned to get married.", "آن‌ها برنامه ازدواج داشتند."),
                    StoryParagraph("Mrs. Ackroyd got nothing from the will.", "خانم آکروید چیزی از وصیت‌نامه نگرفت."),
                    StoryParagraph("Roger had changed his will.", "راجر وصیت‌نامه‌اش را عوض کرده بود."),
                    StoryParagraph("He left his money to Flora.", "او پولش را به فلورا داد."),
                    StoryParagraph("Poirot was happy with his work.", "پوآرو از کارش خوشحال بود."),
                    StoryParagraph("He solved one of his hardest cases.", "او یکی از سخت‌ترین پرونده‌هایش را حل کرد."),
                    StoryParagraph("Everyone thanked him for his help.", "همه از او برای کمکش تشکر کردند."),
                    StoryParagraph("Dr. Sheppard wrote his confession.", "دکتر شپرد اعترافش را نوشت."),
                    StoryParagraph("He explained everything in detail.", "او همه چیز را با جزئیات توضیح داد."),
                    StoryParagraph("But he did not feel sorry.", "اما او پشیمان نبود."),
                    StoryParagraph("He thought he was clever.", "او فکر می‌کرد باهوش است."),
                    StoryParagraph("But Poirot was cleverer.", "اما پوآرو باهوش‌تر بود."),
                    StoryParagraph("And so the case was closed.", "و اینگونه پرونده بسته شد.")
                )
            )
        )
    )

    // ─────────────── ۵: مرگ روی نیل ───────────────
    private fun story5() = StoryContent(
        storyId = "int_death_nile",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Journey to Egypt", titlePersian = "سفر به مصر",
                paragraphs = listOf(
                    StoryParagraph("Linnet Ridgeway was a rich and beautiful woman.", "لینت ریجوی زنی ثروتمند و زیبا بود."),
                    StoryParagraph("She lived in a large house in England.", "او در خانه‌ای بزرگ در انگلیس زندگی می‌کرد."),
                    StoryParagraph("Her best friend was Jacqueline de Bellefort.", "بهترین دوستش ژاکلین دو بلوفورت بود."),
                    StoryParagraph("Jacqueline was poor but happy.", "ژاکلین فقیر بود اما خوشحال."),
                    StoryParagraph("She was engaged to a man named Simon Doyle.", "او با مردی به نام سایمون دویل نامزد بود."),
                    StoryParagraph("Linnet met Simon and fell in love.", "لینت با سایمون آشنا شد و عاشقش شد."),
                    StoryParagraph("She asked him to marry her instead.", "او از او خواست به جایش با او ازدواج کند."),
                    StoryParagraph("Simon agreed and left Jacqueline.", "سایمون موافقت کرد و ژاکلین را ترک کرد."),
                    StoryParagraph("Jacqueline was very angry.", "ژاکلین خیلی عصبانی شد."),
                    StoryParagraph("She followed them everywhere.", "او همه‌جا دنبالشان می‌رفت."),
                    StoryParagraph("Linnet and Simon went to Egypt for their honeymoon.", "لینت و سایمون برای ماه عسل به مصر رفتند."),
                    StoryParagraph("Jacqueline followed them there too.", "ژاکلین هم آنجا دنبالشان رفت."),
                    StoryParagraph("They met Hercule Poirot on a boat.", "آن‌ها هرکول پوآرو را در یک کشتی دیدند."),
                    StoryParagraph("The boat was called the Karnak.", "اسم کشتی کارناک بود."),
                    StoryParagraph("It was sailing on the Nile River.", "آن در رود نیل حرکت می‌کرد."),
                    StoryParagraph("Many other people were on the boat.", "افراد زیادی روی کشتی بودند."),
                    StoryParagraph("There was a doctor, a writer, and a maid.", "یک دکتر، یک نویسنده و یک خدمتکار بود."),
                    StoryParagraph("Everyone had their own secrets.", "هر کس رازهای خودش را داشت."),
                    StoryParagraph("Poirot watched them all carefully.", "پوآرو با دقت همه را تماشا می‌کرد."),
                    StoryParagraph("He felt something bad would happen.", "او حس می‌کرد چیز بدی اتفاق می‌افتد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Murder on the Boat", titlePersian = "قتل در کشتی",
                paragraphs = listOf(
                    StoryParagraph("One night, there was a loud noise.", "یک شب، صدای بلندی شنیده شد."),
                    StoryParagraph("It sounded like a gunshot.", "شبیه صدای شلیک بود."),
                    StoryParagraph("People ran to see what happened.", "مردم دویدند ببینند چه شده."),
                    StoryParagraph("Linnet was found dead in her cabin.", "لینت در کابینش مرده پیدا شد."),
                    StoryParagraph("She had been shot in the head.", "به سرش شلیک شده بود."),
                    StoryParagraph("Her pearls were stolen.", "مرواریدهایش دزدیده شده بود."),
                    StoryParagraph("There was a letter J on the wall.", "حرف J روی دیوار بود."),
                    StoryParagraph("It was written in blood.", "با خون نوشته شده بود."),
                    StoryParagraph("Simon was very upset.", "سایمون خیلی ناراحت بود."),
                    StoryParagraph("He said Jacqueline did it.", "او گفت ژاکلین این کار را کرده."),
                    StoryParagraph("But Jacqueline was in her cabin.", "اما ژاکلین در کابینش بود."),
                    StoryParagraph("A nurse was with her all night.", "یک پرستار تمام شب با او بود."),
                    StoryParagraph("She could not have done it.", "او نمی‌توانست این کار را کرده باشد."),
                    StoryParagraph("Poirot began his investigation.", "پوآرو تحقیقاتش را شروع کرد."),
                    StoryParagraph("He asked everyone where they were.", "او از همه پرسید کجا بودند."),
                    StoryParagraph("Some people had no alibi.", "بعضی‌ها آلبی نداشتند."),
                    StoryParagraph("Everyone on the boat was a suspect.", "همه روی کشتی مظنون بودند."),
                    StoryParagraph("A pearl was found in a cabin.", "یک مروارید در کابینی پیدا شد."),
                    StoryParagraph("It belonged to Linnet.", "به لینت تعلق داشت."),
                    StoryParagraph("The mystery was very complicated.", "معما خیلی پیچیده بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Missing Pearl", titlePersian = "مروارید گمشده",
                paragraphs = listOf(
                    StoryParagraph("Poirot asked about the pearls.", "پوآرو درباره مرواریدها پرسید."),
                    StoryParagraph("They were very expensive.", "آن‌ها خیلی گران بودند."),
                    StoryParagraph("Linnet had brought them from England.", "لینت آن‌ها را از انگلیس آورده بود."),
                    StoryParagraph("Someone tried to steal them before.", "یک نفر قبلاً تلاش کرده بود آن‌ها را بدزدد."),
                    StoryParagraph("A maid named Louise had seen something.", "خدمتکاری به نام لوئیز چیزی دیده بود."),
                    StoryParagraph("She wanted money for her silence.", "او برای سکوتش پول می‌خواست."),
                    StoryParagraph("That night, Louise was killed too.", "آن شب، لوئیز هم کشته شد."),
                    StoryParagraph("She was stabbed with a knife.", "با چاقو زخمی شده بود."),
                    StoryParagraph("A piece of money was in her hand.", "تکه‌ای پول در دستش بود."),
                    StoryParagraph("Someone paid her before killing her.", "یک نفر قبل از کشتنش به او پول داده بود."),
                    StoryParagraph("Poirot was angry about the second murder.", "پوآرو از قتل دوم عصبانی شد."),
                    StoryParagraph("He promised to find the truth.", "او قول داد حقیقت را پیدا کند."),
                    StoryParagraph("He thought about the letter J.", "او به حرف J فکر کرد."),
                    StoryParagraph("It was not for Jacqueline.", "برای ژاکلین نبود."),
                    StoryParagraph("It was for someone else.", "برای شخص دیگری بود."),
                    StoryParagraph("Poirot remembered a woman named Mrs. Otterbourne.", "پوآرو زنی به نام خانم اتربورن را به یاد آورد."),
                    StoryParagraph("She wrote mystery novels.", "او رمان‌های معمایی می‌نوشت."),
                    StoryParagraph("She said she saw the killer.", "او گفت قاتل را دیده است."),
                    StoryParagraph("But before she could tell, she was killed.", "اما قبل از اینکه بگوید، کشته شد."),
                    StoryParagraph("Someone was very afraid.", "یک نفر خیلی می‌ترسید.")
                )
            ),
            StoryChapter(
                number = 4, title = "Poirot's Investigation", titlePersian = "بازجویی مسافران",
                paragraphs = listOf(
                    StoryParagraph("Poirot gathered all the passengers.", "پوآرو همه مسافران را جمع کرد."),
                    StoryParagraph("He said there were three murders.", "او گفت سه قتل بوده."),
                    StoryParagraph("Linnet, Louise, and Mrs. Otterbourne.", "لینت، لوئیز و خانم اتربورن."),
                    StoryParagraph("All three were killed by the same person.", "هر سه توسط یک نفر کشته شده بودند."),
                    StoryParagraph("Poirot explained the pearls.", "پوآرو مرواریدها را توضیح داد."),
                    StoryParagraph("They were not stolen for money.", "برای پول دزدیده نشده بودند."),
                    StoryParagraph("They were taken to confuse the police.", "برای گیج کردن پلیس برداشته شده بودند."),
                    StoryParagraph("He asked about the letter J.", "او درباره حرف J پرسید."),
                    StoryParagraph("It was not J for Jacqueline.", "J برای ژاکلین نبود."),
                    StoryParagraph("It was J for another name.", "J برای اسم دیگری بود."),
                    StoryParagraph("Everyone looked at Simon Doyle.", "همه به سایمون دویل نگاه کردند."),
                    StoryParagraph("He was very nervous.", "او خیلی مضطرب بود."),
                    StoryParagraph("Poirot said Simon killed his wife.", "پوآرو گفت سایمون همسرش را کشت."),
                    StoryParagraph("He and Jacqueline planned it together.", "او و ژاکلین با هم نقشه کشیده بودند."),
                    StoryParagraph("Jacqueline shot Simon in the leg.", "ژاکلین به پای سایمون شلیک کرد."),
                    StoryParagraph("It was to make him look innocent.", "تا او بی‌گناه به نظر برسد."),
                    StoryParagraph("Then Simon went to Linnet's cabin.", "بعد سایمون به کابین لینت رفت."),
                    StoryParagraph("He killed her and came back.", "او او را کشت و برگشت."),
                    StoryParagraph("Everyone thought Jacqueline did it.", "همه فکر کردند ژاکلین این کار را کرده."),
                    StoryParagraph("But she was innocent.", "اما او بی‌گناه بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Truth Revealed", titlePersian = "راز پیچیده",
                paragraphs = listOf(
                    StoryParagraph("Simon and Jacqueline were arrested.", "سایمون و ژاکلین دستگیر شدند."),
                    StoryParagraph("They had planned everything.", "آن‌ها همه چیز را نقشه کشیده بودند."),
                    StoryParagraph("Simon married Linnet for her money.", "سایمون برای پولش با لینت ازدواج کرد."),
                    StoryParagraph("Then he planned to kill her.", "بعد نقشه کشت او را کشید."),
                    StoryParagraph("Jacqueline helped him.", "ژاکلین کمکش کرد."),
                    StoryParagraph("They thought they would never be caught.", "آن‌ها فکر می‌کردند هرگز دستگیر نمی‌شوند."),
                    StoryParagraph("But Poirot was too clever.", "اما پوآرو خیلی باهوش بود."),
                    StoryParagraph("He found small mistakes in their story.", "او اشتباهات کوچکی در داستانشان پیدا کرد."),
                    StoryParagraph("The Karnak continued its journey.", "کارناک به سفرش ادامه داد."),
                    StoryParagraph("The other passengers were free.", "بقیه مسافران آزاد بودند."),
                    StoryParagraph("A writer named Mrs. Otterbourne was gone.", "نویسنده‌ای به نام خانم اتربورن رفته بود."),
                    StoryParagraph("A doctor returned to his work.", "دکتری به کارش برگشت."),
                    StoryParagraph("A maid went home to England.", "خدمتکاری به انگلیس برگشت."),
                    StoryParagraph("Poirot sat on the deck and watched the Nile.", "پوآرو روی عرشه نشست و نیل را تماشا کرد."),
                    StoryParagraph("He was tired but satisfied.", "او خسته اما راضی بود."),
                    StoryParagraph("Justice had been done.", "عدالت اجرا شده بود."),
                    StoryParagraph("Linnet's family would know the truth.", "خانواده لینت حقیقت را می‌فهمیدند."),
                    StoryParagraph("The pearls were returned.", "مرواریدها برگردانده شدند."),
                    StoryParagraph("And the Karnak sailed on.", "و کارناک به راهش ادامه داد."),
                    StoryParagraph("The case was finally closed.", "پرونده بالاخره بسته شد.")
                )
            )
        )
    )

    // ─────────────── ۶: و سپس هیچ‌کس نماند ───────────────
    private fun story6() = StoryContent(
        storyId = "int_and_then_none",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Invitation to the Island", titlePersian = "دعوت به جزیره",
                paragraphs = listOf(
                    StoryParagraph("Ten people received letters one day.", "ده نفر یک روز نامه دریافت کردند."),
                    StoryParagraph("Each letter invited them to an island.", "هر نامه آن‌ها را به یک جزیره دعوت می‌کرد."),
                    StoryParagraph("The island was called Soldier Island.", "اسم جزیره جزیره سرباز بود."),
                    StoryParagraph("A man named Mr. Owen had sent the letters.", "مردی به نام آقای اوون نامه‌ها را فرستاده بود."),
                    StoryParagraph("None of them knew Mr. Owen.", "هیچ‌کدام آقای اوون را نمی‌شناختند."),
                    StoryParagraph("But all of them were curious.", "اما همه‌شان کنجکاو بودند."),
                    StoryParagraph("A judge, a doctor, a teacher, and a soldier came.", "یک قاضی، یک دکتر، یک معلم و یک سرباز آمدند."),
                    StoryParagraph("A secretary, a butler, and a maid came too.", "یک منشی، یک پیشخدمت و یک خدمتکار هم آمدند."),
                    StoryParagraph("And there was a young man named Anthony.", "و مرد جوانی به نام آنتونی بود."),
                    StoryParagraph("And an old woman named Emily Brent.", "و زن پیری به نام امیلی برنت."),
                    StoryParagraph("They all arrived by boat.", "همه با قایق رسیدند."),
                    StoryParagraph("A man and his wife were the servants.", "مردی و همسرش خدمتکاران بودند."),
                    StoryParagraph("They said Mr. Owen had not arrived yet.", "آن‌ها گفتند آقای اوون هنوز نرسیده."),
                    StoryParagraph("The guests went to their rooms.", "مهمانان به اتاق‌هایشان رفتند."),
                    StoryParagraph("In each room was a framed poem.", "در هر اتاق یک شعر قاب‌شده بود."),
                    StoryParagraph("The poem was about ten little soldiers.", "شعر درباره ده سرباز کوچک بود."),
                    StoryParagraph("It talked about how they all died.", "درباره این بود که چطور همه مردند."),
                    StoryParagraph("Nobody understood the poem.", "هیچ‌کس شعر را نفهمید."),
                    StoryParagraph("They thought it was just a decoration.", "آن‌ها فکر کردند فقط یک تزئین است."),
                    StoryParagraph("But the deaths were about to begin.", "اما مرگ‌ها در شرف شروع بودند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The First Death", titlePersian = "مرگ اول",
                paragraphs = listOf(
                    StoryParagraph("After dinner, a voice spoke from a gramophone.", "بعد از شام، صدایی از گرامافون آمد."),
                    StoryParagraph("It accused each guest of a murder.", "هر مهمان را به یک قتل متهم کرد."),
                    StoryParagraph("Each of them had killed someone in the past.", "هر کدام در گذشته کسی را کشته بودند."),
                    StoryParagraph("The voice said they would pay for their crimes.", "صدا گفت آن‌ها برای جنایاتشان تاوان می‌دهند."),
                    StoryParagraph("Everyone was very shocked.", "همه خیلی شوکه شدند."),
                    StoryParagraph("Then Anthony drank a glass of wine.", "بعد آنتونی یک لیوان شراب نوشید."),
                    StoryParagraph("He fell to the ground and died.", "او روی زمین افتاد و مرد."),
                    StoryParagraph("The wine was poisoned.", "شراب سمی بود."),
                    StoryParagraph("Everyone started to panic.", "همه شروع کردند به وحشت کردن."),
                    StoryParagraph("The next morning, Mrs. Rogers was dead.", "صبح روز بعد، خانم راجرز مرده بود."),
                    StoryParagraph("She had died in her sleep.", "او در خواب مرده بود."),
                    StoryParagraph("The doctor said it was poison.", "دکتر گفت سم بود."),
                    StoryParagraph("Only nine people were left on the island.", "فقط نه نفر در جزیره مانده بودند."),
                    StoryParagraph("The guests did not know what to do.", "مهمانان نمی‌دانستند چکار کنند."),
                    StoryParagraph("There was no way to leave the island.", "راهی برای ترک جزیره نبود."),
                    StoryParagraph("The boat had disappeared.", "قایق ناپدید شده بود."),
                    StoryParagraph("They were trapped with a killer.", "آن‌ها با یک قاتل گیر افتاده بودند."),
                    StoryParagraph("Someone among them was the murderer.", "یک نفر بین خودشان قاتل بود."),
                    StoryParagraph("Everyone looked at each other with fear.", "همه با ترس به هم نگاه کردند."),
                    StoryParagraph("The poem was coming true.", "شعر در حال حقیقت یافتن بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "Fear and Panic", titlePersian = "ترس و وحشت",
                paragraphs = listOf(
                    StoryParagraph("More people began to die each day.", "هر روز افراد بیشتری می‌مردند."),
                    StoryParagraph("General MacArthur was found dead in the garden.", "ژنرال مک‌آرتور مرده در باغ پیدا شد."),
                    StoryParagraph("Then the butler Rogers was killed.", "بعد پیشخدمت راجرز کشته شد."),
                    StoryParagraph("Emily Brent was also found dead.", "امیلی برنت هم مرده پیدا شد."),
                    StoryParagraph("Each death matched the poem.", "هر مرگ با شعر مطابقت داشت."),
                    StoryParagraph("The judge said one of them was the killer.", "قاضی گفت یکی از آن‌ها قاتل است."),
                    StoryParagraph("They searched the whole island.", "آن‌ها کل جزیره را گشتند."),
                    StoryParagraph("But no stranger was found.", "اما هیچ غریبه‌ای پیدا نشد."),
                    StoryParagraph("Everyone suspected everyone.", "همه به همه شک داشتند."),
                    StoryParagraph("The doctor and the judge argued.", "دکتر و قاضی بحث کردند."),
                    StoryParagraph("The secretary was afraid of the judge.", "منشی از قاضی می‌ترسید."),
                    StoryParagraph("The soldier was afraid of everyone.", "سرباز از همه می‌ترسید."),
                    StoryParagraph("Then the doctor was found dead.", "بعد دکتر مرده پیدا شد."),
                    StoryParagraph("He had been hit on the head.", "به سرش ضربه خورده بود."),
                    StoryParagraph("Only a few people remained.", "فقط چند نفر باقی مانده بودند."),
                    StoryParagraph("The soldier was shot by someone.", "سرباز توسط یک نفر شلیک شد."),
                    StoryParagraph("The secretary was also found dead.", "منشی هم مرده پیدا شد."),
                    StoryParagraph("Only the judge was still alive.", "فقط قاضی هنوز زنده بود."),
                    StoryParagraph("He sat alone in his room.", "او تنها در اتاقش نشست."),
                    StoryParagraph("He knew the end was near.", "او می‌دانست پایان نزدیک است.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Secret of the Island", titlePersian = "راز جزیره",
                paragraphs = listOf(
                    StoryParagraph("The judge was found dead in his chair.", "قاضی مرده روی صندلی‌اش پیدا شد."),
                    StoryParagraph("He had been shot in the head.", "به سرش شلیک شده بود."),
                    StoryParagraph("Now everyone on the island was dead.", "حالا همه در جزیره مرده بودند."),
                    StoryParagraph("When the police arrived, they were confused.", "وقتی پلیس رسید، گیج شدند."),
                    StoryParagraph("Ten people had died on the island.", "ده نفر در جزیره مرده بودند."),
                    StoryParagraph("But no killer was found.", "اما هیچ قاتلی پیدا نشد."),
                    StoryParagraph("The mystery was unsolved for a long time.", "معما برای مدت طولانی حل‌نشده ماند."),
                    StoryParagraph("Then a bottle was found in the sea.", "بعد یک بطری در دریا پیدا شد."),
                    StoryParagraph("Inside was a written confession.", "داخلش یک اعتراف نوشته‌شده بود."),
                    StoryParagraph("It was written by Justice Wargrave.", "توسط قاضی وارگریو نوشته شده بود."),
                    StoryParagraph("He was the judge on the island.", "او قاضی در جزیره بود."),
                    StoryParagraph("He had planned everything from the start.", "او همه چیز را از ابتدا نقشه کشیده بود."),
                    StoryParagraph("He wanted to punish people who escaped the law.", "او می‌خواست کسانی که از قانون فرار کرده بودند مجازات کند."),
                    StoryParagraph("Each guest had killed someone in secret.", "هر مهمان مخفیانه کسی را کشته بود."),
                    StoryParagraph("The law could not punish them.", "قانون نمی‌توانست مجازاتشان کند."),
                    StoryParagraph("So Wargrave decided to do it himself.", "پس وارگریو تصمیم گرفت خودش این کار را بکند."),
                    StoryParagraph("He pretended to be a victim.", "او تظاهر کرد قربانی است."),
                    StoryParagraph("He faked his own death.", "او مرگ خودش را جعل کرد."),
                    StoryParagraph("Then he killed the others one by one.", "بعد بقیه را یکی‌یکی کشت."),
                    StoryParagraph("Finally, he shot himself.", "بالاخره خودش را شلیک کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End of the Case", titlePersian = "معمای حل‌نشدنی",
                paragraphs = listOf(
                    StoryParagraph("The police read the confession with shock.", "پلیس اعتراف را با شوک خواند."),
                    StoryParagraph("Justice Wargrave was a respected judge.", "قاضی وارگریو قاضی محترمی بود."),
                    StoryParagraph("Nobody suspected him.", "هیچ‌کس به او شک نکرده بود."),
                    StoryParagraph("He had planned the murders for years.", "او سال‌ها برای قتل‌ها نقشه کشیده بود."),
                    StoryParagraph("He chose his victims very carefully.", "او قربانیانش را با دقت انتخاب کرده بود."),
                    StoryParagraph("Each had committed a crime but escaped justice.", "هر کدام جنایتی کرده بودند اما از عدالت فرار کرده بودند."),
                    StoryParagraph("The law could not touch them.", "قانون نمی‌توانست به آن‌ها دست بزند."),
                    StoryParagraph("So Wargrave became the judge and the killer.", "پس وارگریو قاضی و قاتل شد."),
                    StoryParagraph("He wanted to feel the pleasure of killing.", "او می‌خواست لذت کشتن را حس کند."),
                    StoryParagraph("But he also wanted justice.", "اما او عدالت هم می‌خواست."),
                    StoryParagraph("The poem was his plan from the beginning.", "شعر نقشه‌اش از ابتدا بود."),
                    StoryParagraph("Each death followed the poem in order.", "هر مرگ به ترتیب از شعر پیروی می‌کرد."),
                    StoryParagraph("He made it look like someone else did it.", "او کاری کرد که به نظر برسد شخص دیگری این کار را کرده."),
                    StoryParagraph("Even the police were fooled for weeks.", "حتی پلیس هفته‌ها فریب خورد."),
                    StoryParagraph("The bottle confession solved the mystery.", "اعتراف بطری معما را حل کرد."),
                    StoryParagraph("But ten people were already dead.", "اما ده نفر قبلاً مرده بودند."),
                    StoryParagraph("Their families finally knew the truth.", "خانواده‌هایشان بالاخره حقیقت را فهمیدند."),
                    StoryParagraph("The case became world-famous.", "این پرونده در جهان معروف شد."),
                    StoryParagraph("No one could believe the judge was a killer.", "هیچ‌کس نمی‌توانست باور کند قاضی قاتل بوده."),
                    StoryParagraph("And so ended one of the greatest mysteries.", "و اینگونه یکی از بزرگ‌ترین معماها پایان یافت.")
                )
            )
        )
    )
}