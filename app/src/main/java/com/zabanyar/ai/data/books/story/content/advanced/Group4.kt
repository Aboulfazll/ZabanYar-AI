package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۴ پیشرفته — ادبیات جنگ و وجود
 *  ۱۰. وداع با اسلحه
 *  ۱۱. طاعون
 *  ۱۲. هرگز رهایم مکن
 */
object Group4 {

    fun getAll(): List<StoryContent> = listOf(
        story10(),
        story11(),
        story12(),
    )

    // ─────────────── ۱۰: وداع با اسلحه ───────────────
    private fun story10() = StoryContent(
        storyId = "adv_farewell_arms",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The American in Italy", titlePersian = "آمریکایی در ایتالیا",
                paragraphs = listOf(
                    StoryParagraph("Lieutenant Frederic Henry was an American.", "ستوان فردریک هنری آمریکایی بود."),
                    StoryParagraph("He served in the Italian army during World War I.", "او در جنگ جهانی اول در ارتش ایتالیا خدمت می‌کرد."),
                    StoryParagraph("He was an ambulance driver.", "او راننده آمبولانس بود."),
                    StoryParagraph("He did not know why he had joined the war.", "او نمی‌دانست چرا به جنگ پیوسته است."),
                    StoryParagraph("He spoke Italian but was still a foreigner.", "او ایتالیایی صحبت می‌کرد اما هنوز بیگانه بود."),
                    StoryParagraph("His friend was a priest named Don Anselmo.", "دوستش کشیشی به نام دان آنسلمو بود."),
                    StoryParagraph("The priest was kind and gentle.", "کشیش مهربان و ملایم بود."),
                    StoryParagraph("The other officers made fun of him.", "افسران دیگر مسخره‌اش می‌کردند."),
                    StoryParagraph("Henry liked the priest but said nothing.", "هنری کشیش را دوست داشت اما چیزی نمی‌گفت."),
                    StoryParagraph("One day, Henry visited a nearby town.", "یک روز، هنری به شهر نزدیکی رفت."),
                    StoryParagraph("He met a British nurse named Catherine Barkley.", "او پرستار بریتانیایی به نام کاترین بارکلی ملاقات کرد."),
                    StoryParagraph("She was beautiful and had lost her fiancé in the war.", "او زیبا بود و نامزدش را در جنگ از دست داده بود."),
                    StoryParagraph("Henry thought she was lovely.", "هنری فکر کرد او دوست‌داشتنی است."),
                    StoryParagraph("He started to visit her often.", "او شروع کرد زیاد به دیدنش رفتن."),
                    StoryParagraph("At first, he did not love her.", "اول، دوستش نداشت."),
                    StoryParagraph("It was just a game to him.", "برای او فقط بازی بود."),
                    StoryParagraph("But Catherine loved him deeply.", "اما کاترین عمیقاً دوستش داشت."),
                    StoryParagraph("She wanted to be with him always.", "او می‌خواست همیشه با او باشد."),
                    StoryParagraph("Henry started to feel something real.", "هنری شروع کرد چیزی واقعی حس کردن."),
                    StoryParagraph("But the war kept them apart.", "اما جنگ آن‌ها را جدا نگه می‌داشت.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Wound", titlePersian = "زخم",
                paragraphs = listOf(
                    StoryParagraph("One night, Henry was at the front.", "یک شب، هنری در جبهه بود."),
                    StoryParagraph("The soldiers were eating dinner.", "سربازان در حال خوردن شام بودند."),
                    StoryParagraph("A shell fell near them.", "گلوله‌ای نزدیکشان افتاد."),
                    StoryParagraph("Henry was hit in the leg.", "هنری در پایش زخمی شد."),
                    StoryParagraph("He was bleeding and could not walk.", "او خون‌ریزی داشت و نمی‌توانست راه برود."),
                    StoryParagraph("Two soldiers carried him to safety.", "دو سرباز او را به جای امنی بردند."),
                    StoryParagraph("He was taken to a field hospital.", "او به بیمارستان صحرایی برده شد."),
                    StoryParagraph("Then he was sent to a hospital in Milan.", "بعد به بیمارستانی در میلان فرستاده شد."),
                    StoryParagraph("A nurse came to take care of him.", "پرستاری برای مراقبتش آمد."),
                    StoryParagraph("It was Catherine Barkley.", "کاترین بارکلی بود."),
                    StoryParagraph("She was very happy to see him.", "او از دیدنش خیلی خوشحال شد."),
                    StoryParagraph("Henry realized he loved her.", "هنری فهمید عاشقش شده است."),
                    StoryParagraph("They spent every day together.", "آن‌ها هر روز را با هم می‌گذراندند."),
                    StoryParagraph("They walked in the park and went to cafes.", "آن‌ها در پارک قدم می‌زدند و به کافه می‌رفتند."),
                    StoryParagraph("They talked about their future.", "آن‌ها درباره آینده‌شان صحبت کردند."),
                    StoryParagraph("Catherine said she would always love him.", "کاترین گفت همیشه دوستش خواهد داشت."),
                    StoryParagraph("Henry said he wanted to marry her.", "هنری گفت می‌خواهد با او ازدواج کند."),
                    StoryParagraph("But she said they could not marry.", "اما او گفت نمی‌توانند ازدواج کنند."),
                    StoryParagraph("She was afraid of losing him.", "او می‌ترسید از دستش بدهد."),
                    StoryParagraph("They decided to stay together anyway.", "آن‌ها تصمیم گرفتند به هر حال با هم بمانند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Retreat", titlePersian = "عقب‌نشینی",
                paragraphs = listOf(
                    StoryParagraph("Henry recovered and returned to his unit.", "هنری بهبود یافت و به یگانش برگشت."),
                    StoryParagraph("But the Italian army was losing.", "اما ارتش ایتالیا داشت شکست می‌خورد."),
                    StoryParagraph("The Germans had broken through the lines.", "آلمانی‌ها از خطوط عبور کرده بودند."),
                    StoryParagraph("The Italians began a terrible retreat.", "ایتالیایی‌ها عقب‌نشینی وحشتناکی را آغاز کردند."),
                    StoryParagraph("Henry drove an ambulance in the rain.", "هنری در باران آمبولانس می‌راند."),
                    StoryParagraph("The roads were full of soldiers.", "جاده‌ها پر از سرباز بود."),
                    StoryParagraph("Cars and carts were stuck in the mud.", "ماشین‌ها و گاری‌ها در گل گیر کرده بودند."),
                    StoryParagraph("Everyone was tired and hungry.", "همه خسته و گرسنه بودند."),
                    StoryParagraph("Some soldiers left their weapons.", "بعضی سربازان سلاح‌هایشان را رها کردند."),
                    StoryParagraph("They were running for their lives.", "آن‌ها برای زندگی‌شان فرار می‌کردند."),
                    StoryParagraph("Henry picked up two Italian soldiers.", "هنری دو سرباز ایتالیایی را سوار کرد."),
                    StoryParagraph("They rode together toward the rear.", "آن‌ها با هم به سمت عقب رفتند."),
                    StoryParagraph("But the road was blocked.", "اما جاده بسته بود."),
                    StoryParagraph("Henry and his men had to walk.", "هنری و مردانش مجبور شدند پیاده بروند."),
                    StoryParagraph("They crossed a bridge over a river.", "آن‌ها از پلی روی رودخانه گذشتند."),
                    StoryParagraph("Italian military police were there.", "پلیس نظامی ایتالیا آنجا بود."),
                    StoryParagraph("They were arresting officers who left their units.", "آن‌ها افسرانی که یگان‌هایشان را ترک کرده بودند دستگیر می‌کردند."),
                    StoryParagraph("Henry was pulled out of line.", "هنری از صف بیرون کشیده شد."),
                    StoryParagraph("He was going to be shot.", "قرار بود تیرباران شود."),
                    StoryParagraph("So he jumped into the river and escaped.", "پس در رودخانه پرید و فرار کرد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Escape to Switzerland", titlePersian = "فرار به سوئیس",
                paragraphs = listOf(
                    StoryParagraph("Henry swam to the far bank.", "هنری به ساحل دور شنا کرد."),
                    StoryParagraph("He was cold and wet but alive.", "او سرد و خیس اما زنده بود."),
                    StoryParagraph("He jumped onto a moving train.", "او به قطاری در حال حرکت پرید."),
                    StoryParagraph("He hid under a canvas.", "او زیر برزنت پنهان شد."),
                    StoryParagraph("He reached Milan at night.", "شب به میلان رسید."),
                    StoryParagraph("He went to find Catherine.", "او رفت کاترین را پیدا کند."),
                    StoryParagraph("But she had gone to Stresa.", "اما او به استرسا رفته بود."),
                    StoryParagraph("Henry traveled there as well.", "هنری هم آنجا رفت."),
                    StoryParagraph("He found Catherine in a hotel.", "او کاترین را در هتلی پیدا کرد."),
                    StoryParagraph("She was very happy to see him.", "او از دیدنش خیلی خوشحال شد."),
                    StoryParagraph("They spent a few quiet days together.", "آن‌ها چند روز آرام را با هم گذراندند."),
                    StoryParagraph("But the Italian police were looking for Henry.", "اما پلیس ایتالیا دنبال هنری بود."),
                    StoryParagraph("His friend helped them escape in a boat.", "دوستش کمکشان کرد با قایقی فرار کنند."),
                    StoryParagraph("They rowed across Lake Maggiore at night.", "آن‌ها شب از دریاچه ماجوره پارو زدند."),
                    StoryParagraph("They reached Switzerland safely.", "آن‌ها سالم به سوئیس رسیدند."),
                    StoryParagraph("They were arrested by Swiss police.", "پلیس سوئیس دستگیرشان کرد."),
                    StoryParagraph("But they were treated well.", "اما با آن‌ها خوب رفتار شد."),
                    StoryParagraph("They rented a small house in the mountains.", "آن‌ها خانه‌ای کوچک در کوه‌ها اجاره کردند."),
                    StoryParagraph("They lived quietly through the winter.", "آن‌ها زمستان را آرام گذراندند."),
                    StoryParagraph("Catherine was going to have a baby.", "کاترین می‌خواست بچه‌دار شود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Farewell", titlePersian = "وداع",
                paragraphs = listOf(
                    StoryParagraph("Catherine went into labor in the spring.", "کاترین در بهار به زایمان رفت."),
                    StoryParagraph("Henry took her to a hospital in Lausanne.", "هنری او را به بیمارستانی در لوزان برد."),
                    StoryParagraph("The labor was very difficult.", "زایمان خیلی سخت بود."),
                    StoryParagraph("She was in pain for many hours.", "او ساعت‌ها درد می‌کشید."),
                    StoryParagraph("Henry stayed by her side.", "هنری کنارش ماند."),
                    StoryParagraph("The doctors said they had to do surgery.", "دکترها گفتند باید جراحی کنند."),
                    StoryParagraph("Henry waited outside the room.", "هنری بیرون اتاق منتظر ماند."),
                    StoryParagraph("A nurse came out to speak to him.", "پرستاری برای صحبت با او بیرون آمد."),
                    StoryParagraph("The baby was born dead.", "بچه مرده به دنیا آمد."),
                    StoryParagraph("Henry sat alone in the corridor.", "هنری تنها در راهرو نشست."),
                    StoryParagraph("Then another nurse came.", "بعد پرستار دیگری آمد."),
                    StoryParagraph("She told him Catherine was dying.", "او گفت کاترین در حال مرگ است."),
                    StoryParagraph("He went into her room.", "او به اتاقش رفت."),
                    StoryParagraph("Catherine was very pale.", "کاترین خیلی رنگ‌پریده بود."),
                    StoryParagraph("She was bleeding and could not be saved.", "او خون‌ریزی داشت و نمی‌توانست نجات یابد."),
                    StoryParagraph("She told Henry not to worry.", "او به هنری گفت نگران نباشد."),
                    StoryParagraph("She said she loved him.", "او گفت دوستش دارد."),
                    StoryParagraph("Then she died.", "بعد مرد."),
                    StoryParagraph("Henry sat with her for a long time.", "هنری مدت زیادی با او نشست."),
                    StoryParagraph("He could not cry.", "او نمی‌توانست گریه کند.")
                )
            )
        )
    )

    // ─────────────── ۱۱: طاعون ───────────────
    private fun story11() = StoryContent(
        storyId = "adv_the_plague",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Rats of Oran", titlePersian = "موش‌های اوران",
                paragraphs = listOf(
                    StoryParagraph("Oran was a boring city on the Algerian coast.", "اوران شهری کسل‌کننده در ساحل الجزایر بود."),
                    StoryParagraph("The people lived simple, ordinary lives.", "مردم زندگی‌های ساده و عادی داشتند."),
                    StoryParagraph("They worked, ate, made love, and died.", "کار می‌کردند، می‌خوردند، عشق می‌ورزیدند و می‌مردند."),
                    StoryParagraph("Dr. Bernard Rieux was one of the doctors in the city.", "دکتر برنارد ریو یکی از پزشکان شهر بود."),
                    StoryParagraph("One day, he found a dead rat in his hallway.", "یک روز، موش مرده‌ای در راهروی خانه‌اش پیدا کرد."),
                    StoryParagraph("He thought it was strange but forgot about it.", "او فکر کرد عجیب است اما فراموشش کرد."),
                    StoryParagraph("The next day, he found more dead rats.", "روز بعد، موش‌های مرده بیشتری پیدا کرد."),
                    StoryParagraph("Soon, dead rats were everywhere in the city.", "به‌زودی، موش‌های مرده همه‌جای شهر بودند."),
                    StoryParagraph("The garbage collectors found hundreds of them.", "زباله‌جمع‌کنان صدها تا از آن‌ها را پیدا کردند."),
                    StoryParagraph("The city ordered the rats to be burned.", "شهر دستور داد موش‌ها سوزانده شوند."),
                    StoryParagraph("But the rats kept appearing.", "اما موش‌ها مدام ظاهر می‌شدند."),
                    StoryParagraph("Then people began to get sick.", "بعد مردم شروع کردند به مریض شدن."),
                    StoryParagraph("They had high fever and swollen glands.", "تب بالا و غدد متورم داشتند."),
                    StoryParagraph("They died within a few days.", "آن‌ها در چند روز می‌مردند."),
                    StoryParagraph("Dr. Rieux recognized the symptoms.", "دکتر ریو علائم را شناخت."),
                    StoryParagraph("It was the plague.", "طاعون بود."),
                    StoryParagraph("He went to the authorities to report it.", "او برای گزارش به مقامات رفت."),
                    StoryParagraph("At first, they did not want to believe him.", "اول، آن‌ها نمی‌خواستند باورش کنند."),
                    StoryParagraph("They said it was not possible in modern times.", "گفتند در دوران مدرن ممکن نیست."),
                    StoryParagraph("But soon, they had to close the city gates.", "اما به‌زودی مجبور شدند دروازه‌های شهر را ببندند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Quarantine", titlePersian = "قرنطینه",
                paragraphs = listOf(
                    StoryParagraph("Oran was put under quarantine.", "اوران تحت قرنطینه قرار گرفت."),
                    StoryParagraph("No one could enter or leave.", "هیچ‌کس نمی‌توانست وارد یا خارج شود."),
                    StoryParagraph("Families were separated.", "خانواده‌ها جدا شدند."),
                    StoryParagraph("Lovers could not see each other.", "عاشقان نمی‌توانستند هم را ببینند."),
                    StoryParagraph("The people began to feel like prisoners.", "مردم شروع کردند به احساس زندانی بودن."),
                    StoryParagraph("Dr. Rieux worked day and night.", "دکتر ریو شبانه‌روز کار می‌کرد."),
                    StoryParagraph("He visited the sick and comforted the dying.", "او به دیدن بیماران می‌رفت و در حال مرگ‌ها را دلداری می‌داد."),
                    StoryParagraph("A man named Tarrou joined him.", "مردی به نام تارو به او پیوست."),
                    StoryParagraph("Tarrou organized volunteer groups.", "تارو گروه‌های داوطلب سازماندهی کرد."),
                    StoryParagraph("They helped the doctors and buried the dead.", "آن‌ها به دکترها کمک می‌کردند و مرده‌ها را دفن می‌کردند."),
                    StoryParagraph("Another man, Rambert, was a journalist from Paris.", "مرد دیگری به نام رامبرت روزنامه‌نگاری از پاریس بود."),
                    StoryParagraph("He wanted to escape to be with his wife.", "او می‌خواست فرار کند تا با همسرش باشد."),
                    StoryParagraph("He tried many ways to leave the city.", "او راه‌های زیادی برای ترک شهر امتحان کرد."),
                    StoryParagraph("But in the end, he decided to stay.", "اما در نهایت، تصمیم گرفت بماند."),
                    StoryParagraph("He said it was his duty to help.", "او گفت وظیفه‌اش است کمک کند."),
                    StoryParagraph("A priest named Paneloux gave a sermon.", "کشیشی به نام پانلو خطبه‌ای خواند."),
                    StoryParagraph("He said the plague was God's punishment.", "او گفت طاعون مجازات خداست."),
                    StoryParagraph("But later, he began to doubt his own words.", "اما بعد، شروع کرد به شک کردن به حرف‌های خودش."),
                    StoryParagraph("He joined the volunteers himself.", "او خودش به داوطلبان پیوست."),
                    StoryParagraph("The plague lasted for many months.", "طاعون ماه‌ها طول کشید.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Suffering", titlePersian = "رنج",
                paragraphs = listOf(
                    StoryParagraph("The summer was very hot.", "تابستان خیلی گرم بود."),
                    StoryParagraph("The smell of death filled the city.", "بوی مرگ شهر را پر کرده بود."),
                    StoryParagraph("The hospitals were full.", "بیمارستان‌ها پر بودند."),
                    StoryParagraph("Temporary camps were set up outside the walls.", "اردوگاه‌های موقت بیرون دیوارها ساخته شدند."),
                    StoryParagraph("People died by the hundreds every day.", "مردم روزانه صدها نفر می‌مردند."),
                    StoryParagraph("The burial system could not keep up.", "سیستم خاکسپاری نمی‌توانست همگام باشد."),
                    StoryParagraph("Bodies were put in mass graves.", "جسدها در قبرهای جمعی گذاشته می‌شدند."),
                    StoryParagraph("Sometimes they were burned in crematoriums.", "گاهی در کوره‌های آدم‌سوزی سوزانده می‌شدند."),
                    StoryParagraph("Dr. Rieux watched a child die.", "دکتر ریو مرگ کودکی را تماشا کرد."),
                    StoryParagraph("It was the hardest moment of his life.", "سخت‌ترین لحظه زندگی‌اش بود."),
                    StoryParagraph("He could not save the child.", "او نمی‌توانست نجاتش دهد."),
                    StoryParagraph("He felt angry at God and at the world.", "او از خدا و از دنیا عصبانی شد."),
                    StoryParagraph("Father Paneloux watched the same child die.", "پدر پانلو همان کودک را در حال مرگ تماشا کرد."),
                    StoryParagraph("He lost his faith that day.", "او آن روز ایمانش را از دست داد."),
                    StoryParagraph("He fell ill a few days later.", "چند روز بعد مریض شد."),
                    StoryParagraph("The doctors could not save him.", "دکترها نمی‌توانستند نجاتش دهند."),
                    StoryParagraph("He died with a cross in his hands.", "او با صلیبی در دستانش مرد."),
                    StoryParagraph("His death shook the city.", "مرگش شهر را تکان داد."),
                    StoryParagraph("The people began to lose hope.", "مردم شروع کردند به از دست دادن امید."),
                    StoryParagraph("They wondered if the plague would ever end.", "آن‌ها می‌پرسیدند آیا طاعون هرگز تمام می‌شود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Turning Point", titlePersian = "نقطه عطف",
                paragraphs = listOf(
                    StoryParagraph("Months passed and then the plague began to slow.", "ماه‌ها گذشت و بعد طاعون شروع کرد به کند شدن."),
                    StoryParagraph("Fewer people got sick every week.", "هر هفته افراد کمتری مریض می‌شدند."),
                    StoryParagraph("The serum from Paris finally arrived.", "سرم از پاریس بالاخره رسید."),
                    StoryParagraph("It worked for some people.", "برای بعضی‌ها کار می‌کرد."),
                    StoryParagraph("The doctors felt new hope.", "دکترها امید جدیدی حس کردند."),
                    StoryParagraph("Tarrou was happy with the progress.", "تارو از پیشرفت خوشحال بود."),
                    StoryParagraph("But he was hiding something.", "اما چیزی را پنهان می‌کرد."),
                    StoryParagraph("One day, he told Rieux the truth.", "یک روز، حقیقت را به ریو گفت."),
                    StoryParagraph("He had come to Oran to escape his past.", "او به اوران آمده بود تا از گذشته‌اش فرار کند."),
                    StoryParagraph("His father had been a prosecutor.", "پدرش دادستان بود."),
                    StoryParagraph("He had sent many people to death.", "او افراد زیادی را به مرگ فرستاده بود."),
                    StoryParagraph("Tarrou had hated his father for it.", "تارو به همین دلیل از پدرش متنفر بود."),
                    StoryParagraph("He had decided to fight against death.", "او تصمیم گرفته بود علیه مرگ بجنگد."),
                    StoryParagraph("He joined the plague fighters to find peace.", "او به مبارزان طاعون پیوست تا آرامش پیدا کند."),
                    StoryParagraph("Rieux listened in silence.", "ریو در سکوت گوش داد."),
                    StoryParagraph("He understood Tarrou's pain.", "او درد تارو را فهمید."),
                    StoryParagraph("They became the closest of friends.", "آن‌ها نزدیک‌ترین دوستان شدند."),
                    StoryParagraph("Then Tarrou got sick with the plague.", "بعد تارو با طاعون مریض شد."),
                    StoryParagraph("Rieux fought hard to save him.", "ریو سخت جنگید تا نجاتش دهد."),
                    StoryParagraph("But Tarrou died at dawn.", "اما تارو در سپیده‌دم مرد.")
                )
            ),
            StoryChapter(
                number: 5, title = "The End of the Plague", titlePersian = "پایان طاعون",
                paragraphs = listOf(
                    StoryParagraph("The plague finally ended in the spring.", "طاعون بالاخره در بهار تمام شد."),
                    StoryParagraph("The city gates were opened again.", "دروازه‌های شهر دوباره باز شدند."),
                    StoryParagraph("Trains and ships started to arrive.", "قطارها و کشتی‌ها شروع کردند به رسیدن."),
                    StoryParagraph("Families and lovers were reunited.", "خانواده‌ها و عاشقان دوباره به هم رسیدند."),
                    StoryParagraph("There was joy and celebration everywhere.", "همه‌جا شادی و جشن بود."),
                    StoryParagraph("But many people were not there to celebrate.", "اما افراد زیادی نبودند تا جشن بگیرند."),
                    StoryParagraph("Rambert's wife came to find him.", "همسر رامبرت برای یافتنش آمد."),
                    StoryParagraph("They held each other and cried.", "آن‌ها هم را در آغوش گرفتند و گریه کردند."),
                    StoryParagraph("Rieux watched the crowds in the square.", "ریو جمعیت را در میدان تماشا کرد."),
                    StoryParagraph("He did not feel happy.", "او خوشحال نبود."),
                    StoryParagraph("He had lost his friend Tarrou.", "او دوستش تارو را از دست داده بود."),
                    StoryParagraph("He had seen too much suffering.", "او رنج زیادی دیده بود."),
                    StoryParagraph("He knew the plague was not really gone.", "او می‌دانست طاعون واقعاً نرفته."),
                    StoryParagraph("It could always come back.", "همیشه می‌توانست برگردد."),
                    StoryParagraph("It lived in the hearts of men.", "در قلب انسان‌ها زندگی می‌کرد."),
                    StoryParagraph("Rieux decided to write this chronicle.", "ریو تصمیم گرفت این تاریخ را بنویسد."),
                    StoryParagraph("He wanted people to remember.", "می‌خواست مردم به یاد داشته باشند."),
                    StoryParagraph("He wanted to tell the truth about what happened.", "می‌خواست حقیقت درباره آنچه رخ داد را بگوید."),
                    StoryParagraph("He did not want a hero's tale.", "او داستان قهرمان نمی‌خواست."),
                    StoryParagraph("He only wanted to say: we must not give up.", "او فقط می‌خواست بگوید: نباید تسلیم شویم.")
                )
            )
        )
    )

    // ─────────────── ۱۲: هرگز رهایم مکن ───────────────
    private fun story12() = StoryContent(
        storyId = "adv_never_let_me_go",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Hailsham", titlePersian = "هیلشم",
                paragraphs = listOf(
                    StoryParagraph("My name is Kathy H.", "اسم من کتی اچ است."),
                    StoryParagraph("I am a carer.", "من مراقب هستم."),
                    StoryParagraph("I have been a carer for over twelve years.", "بیش از دوازده سال مراقب بوده‌ام."),
                    StoryParagraph("I have looked after many donors.", "از اهداکنندگان زیادی مراقبت کرده‌ام."),
                    StoryParagraph("Some of them did very well.", "بعضی‌شان خیلی خوب عمل کردند."),
                    StoryParagraph("But that is not what I want to talk about.", "اما این چیزی نیست که می‌خواهم درباره‌اش صحبت کنم."),
                    StoryParagraph("I want to talk about Hailsham.", "می‌خواهم درباره هیلشم صحبت کنم."),
                    StoryParagraph("Hailsham was a school in England.", "هیلشم مدرسه‌ای در انگلیس بود."),
                    StoryParagraph("It was a beautiful place with green fields.", "جای زیبایی با مزارع سبز بود."),
                    StoryParagraph("We were students there as children.", "ما آنجا به عنوان کودک دانش‌آموز بودیم."),
                    StoryParagraph("We were told that we were special.", "به ما گفته شد که خاص هستیم."),
                    StoryParagraph("We were told that we were different from other people.", "به ما گفته شد که با دیگران متفاوتیم."),
                    StoryParagraph("We were told that we had an important purpose.", "به ما گفته شد که هدف مهمی داریم."),
                    StoryParagraph("There was a woman called Miss Emily.", "زنی به نام میس امیلی بود."),
                    StoryParagraph("She was the head of the school.", "او مدیر مدرسه بود."),
                    StoryParagraph("There was also a woman called Miss Lucy.", "زنی به نام میس لوسی هم بود."),
                    StoryParagraph("She was younger and kinder.", "او جوان‌تر و مهربان‌تر بود."),
                    StoryParagraph("She sometimes told us things she should not.", "او گاهی چیزهایی می‌گفت که نباید."),
                    StoryParagraph("She said we were not taught enough about our lives.", "او گفت به ما به اندازه کافی درباره زندگی‌مان آموخته نشده."),
                    StoryParagraph("The other teachers did not like this.", "معلمان دیگر این را دوست نداشتند.")
                )
            ),
            StoryChapter(
                number = 2, title = "Friendship", titlePersian = "دوستی",
                paragraphs = listOf(
                    StoryParagraph("My best friend at Hailsham was Ruth.", "بهترین دوستم در هیلشم راث بود."),
                    StoryParagraph("We did everything together.", "همه کارها را با هم می‌کردیم."),
                    StoryParagraph("We shared our secrets and our dreams.", "رازها و رؤیاهایمان را به اشتراک می‌گذاشتیم."),
                    StoryParagraph("There was also a boy named Tommy.", "پسری به نام تامی هم بود."),
                    StoryParagraph("Tommy was quiet and gentle.", "تامی ساکت و ملایم بود."),
                    StoryParagraph("He had a hard time at school.", "روزگار سختی در مدرسه داشت."),
                    StoryParagraph("Some students made fun of him.", "بعضی دانش‌آموزان مسخره‌اش می‌کردند."),
                    StoryParagraph("I felt sorry for him.", "دلم برایش می‌سوخت."),
                    StoryParagraph("But Ruth liked him first.", "اما راث اول او را دوست داشت."),
                    StoryParagraph("So I stayed away from him.", "پس من از او دوری کردم."),
                    StoryParagraph("We grew up together at Hailsham.", "ما در هیلشم با هم بزرگ شدیم."),
                    StoryParagraph("We learned about art and literature.", "درباره هنر و ادبیات آموختیم."),
                    StoryParagraph("We learned about love and friendship.", "درباره عشق و دوستی آموختیم."),
                    StoryParagraph("We learned to be kind to each other.", "یاد گرفتیم با هم مهربان باشیم."),
                    StoryParagraph("But we were never taught about the future.", "اما هیچ‌وقت درباره آینده به ما آموخته نشد."),
                    StoryParagraph("We knew something was waiting for us.", "می‌دانستیم چیزی در انتظارمان است."),
                    StoryParagraph("But no one told us what it was.", "اما هیچ‌کس نگفت چیست."),
                    StoryParagraph("We only knew we had to stay healthy.", "فقط می‌دانستیم باید سالم بمانیم."),
                    StoryParagraph("We were told not to smoke.", "به ما گفته شد سیگار نکشیم."),
                    StoryParagraph("We were told that our bodies were important.", "به ما گفته شد بدن‌هایمان مهم هستند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Truth", titlePersian = "حقیقت",
                paragraphs = listOf(
                    StoryParagraph("When we were sixteen, we learned the truth.", "وقتی شانزده ساله بودیم، حقیقت را فهمیدیم."),
                    StoryParagraph("Miss Lucy told us one day.", "میس لوسی یک روز به ما گفت."),
                    StoryParagraph("She said we were not like other people.", "او گفت ما مثل دیگران نیستیم."),
                    StoryParagraph("She said we were created for a purpose.", "او گفت برای هدفی آفریده شده‌ایم."),
                    StoryParagraph("We were clones.", "ما کلون بودیم."),
                    StoryParagraph("We had been made from other people.", "ما از افراد دیگر ساخته شده بودیم."),
                    StoryParagraph("Our bodies would be used to help them.", "بدن‌هایمان برای کمک به آن‌ها استفاده می‌شد."),
                    StoryParagraph("When we grew up, we would donate our organs.", "وقتی بزرگ می‌شدیم، اعضایمان را اهدا می‌کردیم."),
                    StoryParagraph("We would donate until we completed.", "تا زمانی که تمام می‌شدیم اهدا می‌کردیم."),
                    StoryParagraph("And then we would die.", "و بعد می‌مردیم."),
                    StoryParagraph("Nobody in the outside world cared.", "هیچ‌کس در دنیای بیرون اهمیت نمی‌داد."),
                    StoryParagraph("We were just tools for them.", "ما فقط ابزاری برای آن‌ها بودیم."),
                    StoryParagraph("Miss Lucy was very upset when she said this.", "میس لوسی وقتی این را می‌گفت خیلی ناراحت بود."),
                    StoryParagraph("She said we were not taught enough.", "او گفت به ما به اندازه کافی آموخته نشده."),
                    StoryParagraph("She said we should know the truth.", "او گفت باید حقیقت را بدانیم."),
                    StoryParagraph("We were shocked and confused.", "ما شوکه و گیج شدیم."),
                    StoryParagraph("But we did not really understand.", "اما واقعاً نمی‌فهمیدیم."),
                    StoryParagraph("We were only children.", "ما فقط بچه بودیم."),
                    StoryParagraph("We went back to our normal lives.", "به زندگی عادی‌مان برگشتیم."),
                    StoryParagraph("But something had changed inside us.", "اما چیزی درونمان تغییر کرده بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Cottages", titlePersian = "کلبه‌ها",
                paragraphs = listOf(
                    StoryParagraph("When we were eighteen, we left Hailsham.", "وقتی هجده ساله بودیم، هیلشم را ترک کردیم."),
                    StoryParagraph("We went to live in cottages in the countryside.", "ما برای زندگی در کلبه‌هایی در حومه رفتیم."),
                    StoryParagraph("There were other students from other schools.", "دانش‌آموزان دیگری از مدارس دیگر بودند."),
                    StoryParagraph("We learned to live on our own.", "یاد گرفتیم تنها زندگی کنیم."),
                    StoryParagraph("We had some freedom but not much.", "کمی آزادی داشتیم اما نه زیاد."),
                    StoryParagraph("Ruth, Tommy, and I stayed together.", "راث، تامی و من با هم ماندیم."),
                    StoryParagraph("Ruth and Tommy were a couple.", "راث و تامی زوج بودند."),
                    StoryParagraph("But I still had feelings for Tommy.", "اما من هنوز به تامی احساس داشتم."),
                    StoryParagraph("I tried to hide my feelings.", "تلاش کردم احساساتم را پنهان کنم."),
                    StoryParagraph("Ruth knew, and she was jealous.", "راث می‌دانست و حسود بود."),
                    StoryParagraph("She tried to keep Tommy away from me.", "او تلاش کرد تامی را از من دور کند."),
                    StoryParagraph("One day, we went to see a boat on the beach.", "یک روز، برای دیدن قایقی در ساحل رفتیم."),
                    StoryParagraph("We found a stranded boat in the marshes.", "قایقی به گل نشسته در باتلاق پیدا کردیم."),
                    StoryParagraph("It was old and broken.", "قدیمی و شکسته بود."),
                    StoryParagraph("But it was beautiful in its own way.", "اما به روش خودش زیبا بود."),
                    StoryParagraph("We stood there and talked for a long time.", "ما آنجا ایستادیم و مدت طولانی صحبت کردیم."),
                    StoryParagraph("That was one of the last happy days.", "آن یکی از آخرین روزهای خوش بود."),
                    StoryParagraph("Soon, we would start donating.", "به‌زودی، شروع به اهدا می‌کردیم."),
                    StoryParagraph("Soon, everything would change.", "به‌زودی، همه چیز تغییر می‌کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End", titlePersian = "پایان",
                paragraphs = listOf(
                    StoryParagraph("Ruth started donating first.", "راث اول شروع به اهدا کرد."),
                    StoryParagraph("She became weak very quickly.", "او خیلی سریع ضعیف شد."),
                    StoryParagraph("Tommy and I visited her often.", "تامی و من زیاد به دیدنش می‌رفتیم."),
                    StoryParagraph("She asked us to forgive her.", "او از ما خواست ببخشیمش."),
                    StoryParagraph("She said she had kept us apart.", "او گفت ما را از هم دور نگه داشته."),
                    StoryParagraph("She wanted us to be together before the end.", "می‌خواست قبل از پایان با هم باشیم."),
                    StoryParagraph("After Ruth completed, Tommy and I became close.", "بعد از اینکه راث تمام شد، تامی و من نزدیک شدیم."),
                    StoryParagraph("We fell in love.", "ما عاشق شدیم."),
                    StoryParagraph("But Tommy had already started donating.", "اما تامی قبلاً شروع به اهدا کرده بود."),
                    StoryParagraph("He was getting weaker every day.", "هر روز ضعیف‌تر می‌شد."),
                    StoryParagraph("We heard about a possible deferral.", "درباره تعویق ممکنی شنیدیم."),
                    StoryParagraph("Two donors in love could ask for more time.", "دو اهداکننده عاشق می‌توانستند زمان بیشتری بخواهند."),
                    StoryParagraph("We went to see Miss Emily and Madame.", "ما به دیدن میس امیلی و مادام رفتیم."),
                    StoryParagraph("We hoped to get a few more years.", "امیدوار بودیم چند سال بیشتر بگیریم."),
                    StoryParagraph("But Miss Emily said it was not true.", "اما میس امیلی گفت این درست نیست."),
                    StoryParagraph("There had never been a deferral.", "هرگز تعویقی وجود نداشته."),
                    StoryParagraph("It was only a rumor we told ourselves.", "فقط شایعه‌ای بود که به خودمان می‌گفتیم."),
                    StoryParagraph("Tommy was destroyed by this news.", "تامی از این خبر نابود شد."),
                    StoryParagraph("He completed a few weeks later.", "او چند هفته بعد تمام شد."),
                    StoryParagraph("And now I am alone.", "و حالا من تنهایم.")
                )
            )
        )
    )
}