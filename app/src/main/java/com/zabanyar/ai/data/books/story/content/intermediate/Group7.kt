package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۷ — داستان‌های کلاسیک
 *  ۱۹. تصویر دوریان گری
 *  ۲۰. دکتر جکیل و آقای هاید
 *  ۲۱. کنت مونت کریستو
 */
object Group7 {

    fun getAll(): List<StoryContent> = listOf(
        story19(),
        story20(),
        story21(),
    )

    // ─────────────── ۱۹: تصویر دوریان گری ───────────────
    private fun story19() = StoryContent(
        storyId = "int_picture_dorian",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Painter and the Model", titlePersian = "نقاش و مدل",
                paragraphs = listOf(
                    StoryParagraph("Basil Hallward was a talented painter.", "بازیل هالوارد نقاش بااستعدادی بود."),
                    StoryParagraph("He lived and worked in London.", "او در لندن زندگی و کار می‌کرد."),
                    StoryParagraph("One day, he met a young man named Dorian Gray.", "یک روز، مرد جوانی به نام دوریان گری را ملاقات کرد."),
                    StoryParagraph("Dorian was incredibly handsome.", "دوریان فوق‌العاده خوش‌قیافه بود."),
                    StoryParagraph("His beauty was like nothing Basil had seen.", "زیبایی‌اش مثل چیزی بود که بازیل ندیده بود."),
                    StoryParagraph("Basil asked Dorian to be his model.", "بازیل از دوریان خواست مدلش شود."),
                    StoryParagraph("Dorian agreed happily.", "دوریان با خوشحالی موافقت کرد."),
                    StoryParagraph("Basil started painting a portrait of him.", "بازیل شروع کرد به کشیدن پرتره‌اش."),
                    StoryParagraph("It took him many weeks.", "هفته‌ها طول کشید."),
                    StoryParagraph("The painting was his best work ever.", "نقاشی بهترین کارش تا به حال بود."),
                    StoryParagraph("Basil introduced Dorian to his friend Lord Henry.", "بازیل دوریان را به دوستش لرد هنری معرفی کرد."),
                    StoryParagraph("Lord Henry was clever and cynical.", "لرد هنری باهوش و بدبین بود."),
                    StoryParagraph("He talked about beauty and pleasure.", "او درباره زیبایی و لذت صحبت می‌کرد."),
                    StoryParagraph("He told Dorian that youth does not last.", "او به دوریان گفت جوانی ماندگار نیست."),
                    StoryParagraph("Dorian became afraid of growing old.", "دوریان از پیر شدن ترسید."),
                    StoryParagraph("He wished the painting would age instead of him.", "او آرزو کرد نقاشی به جای او پیر شود."),
                    StoryParagraph("He wanted to stay young forever.", "او می‌خواست برای همیشه جوان بماند."),
                    StoryParagraph("Basil finished the painting.", "بازیل نقاشی را تمام کرد."),
                    StoryParagraph("It was a perfect image of Dorian.", "تصویری کامل از دوریان بود."),
                    StoryParagraph("But Dorian did not feel happy.", "اما دوریان خوشحال نبود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Dangerous Wish", titlePersian = "آرزوی خطرناک",
                paragraphs = listOf(
                    StoryParagraph("Dorian looked at his portrait.", "دوریان به پرتره‌اش نگاه کرد."),
                    StoryParagraph("He saw himself young and beautiful.", "او خودش را جوان و زیبا دید."),
                    StoryParagraph("But he knew he would grow old.", "اما می‌دانست پیر می‌شود."),
                    StoryParagraph("The thought made him sad.", "این فکر غمگینش کرد."),
                    StoryParagraph("He wished he could trade his soul.", "او آرزو کرد می‌توانست روحش را معامله کند."),
                    StoryParagraph("He wanted the painting to age for him.", "او می‌خواست نقاشی به جای او پیر شود."),
                    StoryParagraph("Lord Henry laughed at his idea.", "لرد هنری به ایده‌اش خندید."),
                    StoryParagraph("But Dorian was serious.", "اما دوریان جدی بود."),
                    StoryParagraph("He said he would give his soul for it.", "او گفت روحش را برایش می‌داد."),
                    StoryParagraph("He didn't know his wish was heard.", "او نمی‌دانست آرزویش شنیده شده."),
                    StoryParagraph("The next day, Lord Henry's words stayed with him.", "روز بعد، حرف‌های لرد هنری با او ماند."),
                    StoryParagraph("He wanted to experience everything.", "او می‌خواست همه چیز را تجربه کند."),
                    StoryParagraph("He wanted pleasure and beauty.", "او لذت و زیبایی می‌خواست."),
                    StoryParagraph("He met a young actress named Sibyl Vane.", "او بازیگر جوانی به نام سیبیل وین را ملاقات کرد."),
                    StoryParagraph("She was beautiful and talented.", "او زیبا و بااستعداد بود."),
                    StoryParagraph("They fell in love and planned to marry.", "آن‌ها عاشق شدند و نقشه ازدواج کشیدند."),
                    StoryParagraph("But Dorian invited his friends to see her play.", "اما دوریان دوستانش را به دیدن نمایشش دعوت کرد."),
                    StoryParagraph("That night, Sibyl acted badly.", "آن شب، سیبیل بد بازی کرد."),
                    StoryParagraph("She said love had ruined her art.", "او گفت عشق هنرش را خراب کرده."),
                    StoryParagraph("Dorian was angry and left her.", "دوریان عصبانی شد و ترکش کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Portrait Changes", titlePersian = "جوانی ابدی",
                paragraphs = listOf(
                    StoryParagraph("When Dorian got home, he looked at his portrait.", "وقتی دوریان به خانه رسید، به پرتره‌اش نگاه کرد."),
                    StoryParagraph("Something was different.", "چیزی متفاوت بود."),
                    StoryParagraph("There was a cruel smile on the painted face.", "لبخند ظالمانه‌ای روی صورت نقاشی‌شده بود."),
                    StoryParagraph("Dorian was shocked.", "دوریان شوکه شد."),
                    StoryParagraph("He realized his wish had come true.", "او فهمید آرزویش حقیقت یافته."),
                    StoryParagraph("The painting would age for him.", "نقاشی به جای او پیر می‌شد."),
                    StoryParagraph("He decided to go back to Sibyl.", "او تصمیم گرفت پیش سیبیل برگردد."),
                    StoryParagraph("He wanted to apologize and marry her.", "او می‌خواست عذرخواهی کند و با او ازدواج کند."),
                    StoryParagraph("But it was too late.", "اما خیلی دیر بود."),
                    StoryParagraph("Sibyl had killed herself that night.", "سیبیل آن شب خودش را کشته بود."),
                    StoryParagraph("Dorian was sad but not for long.", "دوریان غمگین شد اما نه برای مدت طولانی."),
                    StoryParagraph("Lord Henry told him not to feel guilty.", "لرد هنری به او گفت احساس گناه نکند."),
                    StoryParagraph("He said it was just a tragic love story.", "او گفت فقط یک داستان عاشقانه تراژیک است."),
                    StoryParagraph("Dorian agreed and tried to forget.", "دوریان موافقت کرد و تلاش کرد فراموش کند."),
                    StoryParagraph("He hid the painting in a locked room.", "او نقاشی را در اتاقی قفل‌شده پنهان کرد."),
                    StoryParagraph("He didn't want anyone to see it.", "نمی‌خواست کسی ببیندش."),
                    StoryParagraph("He started to live a life of pleasure.", "او شروع کرد به زندگی لذت‌جویانه."),
                    StoryParagraph("He became selfish and cruel.", "او خودخواه و ظالم شد."),
                    StoryParagraph("But his face stayed young and beautiful.", "اما صورتش جوان و زیبا ماند."),
                    StoryParagraph("While the painting grew old and ugly.", "در حالی که نقاشی پیر و زشت می‌شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Hidden Sins", titlePersian = "گناهان پنهان",
                paragraphs = listOf(
                    StoryParagraph("Years passed and Dorian stayed young.", "سال‌ها گذشت و دوریان جوان ماند."),
                    StoryParagraph("His friends grew old and died.", "دوستانش پیر شدند و مردند."),
                    StoryParagraph("But Dorian looked the same as before.", "اما دوریان مثل قبل به نظر می‌رسید."),
                    StoryParagraph("People started to talk about him.", "مردم شروع کردند درباره‌اش صحبت کنند."),
                    StoryParagraph("They said he had done terrible things.", "آن‌ها گفتند کارهای وحشتناکی کرده."),
                    StoryParagraph("Many of his friends had been ruined.", "بسیاری از دوستانش نابود شده بودند."),
                    StoryParagraph("Some had died mysteriously.", "بعضی به شکل مرموزی مرده بودند."),
                    StoryParagraph("Dorian did not care.", "دوریان اهمیت نمی‌داد."),
                    StoryParagraph("He only cared about his own pleasure.", "او فقط به لذت خودش اهمیت می‌داد."),
                    StoryParagraph("One night, Basil came to visit him.", "یک شب، بازیل به دیدنش آمد."),
                    StoryParagraph("Basil was worried about Dorian's reputation.", "بازیل نگران آبروی دوریان بود."),
                    StoryParagraph("He said people were saying awful things.", "او گفت مردم چیزهای وحشتناکی می‌گویند."),
                    StoryParagraph("Dorian laughed at him.", "دوریان به او خندید."),
                    StoryParagraph("He said Basil could see the truth.", "او گفت بازیل می‌تواند حقیقت را ببیند."),
                    StoryParagraph("He took Basil to the locked room.", "او بازیل را به اتاق قفل‌شده برد."),
                    StoryParagraph("He showed him the portrait.", "پرتره را نشانش داد."),
                    StoryParagraph("Basil was horrified by what he saw.", "بازیل از آنچه دید وحشت کرد."),
                    StoryParagraph("The painting was ugly and evil.", "نقاشی زشت و شیطانی بود."),
                    StoryParagraph("Dorian grabbed a knife and stabbed Basil.", "دوریان چاقویی گرفت و بازیل را زد."),
                    StoryParagraph("He killed his best friend.", "او بهترین دوستش را کشت.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Dark Ending", titlePersian = "پایان تاریک",
                paragraphs = listOf(
                    StoryParagraph("Dorian hid Basil's body in the room.", "دوریان جسد بازیل را در اتاق پنهان کرد."),
                    StoryParagraph("He asked an old friend to destroy the body.", "او از دوست قدیمی‌اش خواست جسد را نابود کند."),
                    StoryParagraph("The friend was a scientist named Alan Campbell.", "دوستش دانشمندی به نام آلن کمپبل بود."),
                    StoryParagraph("Alan did not want to help.", "آلن نمی‌خواست کمک کند."),
                    StoryParagraph("But Dorian knew a secret about him.", "اما دوریان رازی درباره‌اش می‌دانست."),
                    StoryParagraph("He forced Alan to destroy the body.", "او آلن را مجبور کرد جسد را نابود کند."),
                    StoryParagraph("Then Alan killed himself.", "بعد آلن خودش را کشت."),
                    StoryParagraph("Dorian felt nothing.", "دوریان هیچ احساسی نکرد."),
                    StoryParagraph("He went to a party that night.", "آن شب به مهمانی رفت."),
                    StoryParagraph("Sibyl's brother saw him there.", "برادر سیبیل او را آنجا دید."),
                    StoryParagraph("He wanted to kill Dorian for revenge.", "او می‌خواست دوریان را برای انتقام بکشد."),
                    StoryParagraph("But Dorian looked so young.", "اما دوریان خیلی جوان به نظر می‌رسید."),
                    StoryParagraph("The brother thought he had the wrong man.", "برادر فکر کرد مرد اشتباهی را گرفته."),
                    StoryParagraph("Later, the brother was killed in a hunting accident.", "بعد، برادر در یک حادثه شکار کشته شد."),
                    StoryParagraph("Dorian felt safe again.", "دوریان دوباره احساس امنیت کرد."),
                    StoryParagraph("But he was tired of his secret life.", "اما از زندگی مخفیانه‌اش خسته بود."),
                    StoryParagraph("He decided to destroy the painting.", "او تصمیم گرفت نقاشی را نابود کند."),
                    StoryParagraph("He stabbed the portrait with a knife.", "او با چاقو به پرتره زد."),
                    StoryParagraph("A terrible scream was heard.", "جیغ وحشتناکی شنیده شد."),
                    StoryParagraph("Servants found Dorian dead on the floor.", "خدمتکاران دوریان را مرده روی زمین پیدا کردند.")
                )
            )
        )
    )

    // ─────────────── ۲۰: دکتر جکیل و آقای هاید ───────────────
    private fun story20() = StoryContent(
        storyId = "int_jekyll_hyde_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Respectable Doctor", titlePersian = "دکتر محترم",
                paragraphs = listOf(
                    StoryParagraph("Mr. Utterson was a lawyer in London.", "آقای آترسون وکیلی در لندن بود."),
                    StoryParagraph("He was serious and quiet.", "او جدی و ساکت بود."),
                    StoryParagraph("He had a friend named Dr. Henry Jekyll.", "او دوستی به نام دکتر هنری جکیل داشت."),
                    StoryParagraph("Dr. Jekyll was rich and respected.", "دکتر جکیل ثروتمند و محترم بود."),
                    StoryParagraph("He was known for his good work.", "او برای کارهای خوبش شناخته می‌شد."),
                    StoryParagraph("One day, Utterson learned about Jekyll's will.", "یک روز، آترسون از وصیت‌نامه جکیل باخبر شد."),
                    StoryParagraph("The will left everything to a man named Hyde.", "وصیت‌نامه همه چیز را به مردی به نام هاید می‌داد."),
                    StoryParagraph("Utterson had never heard of Mr. Hyde.", "آترسون هرگز درباره آقای هاید نشنیده بود."),
                    StoryParagraph("He asked his friend what it meant.", "او از دوستش پرسید یعنی چه."),
                    StoryParagraph("But Jekyll refused to explain.", "اما جکیل از توضیح دادن امتناع کرد."),
                    StoryParagraph("He said it was a private matter.", "او گفت موضوعی خصوصی است."),
                    StoryParagraph("Utterson was worried about his friend.", "آترسون نگران دوستش شد."),
                    StoryParagraph("He started to look for Mr. Hyde.", "او شروع کرد به دنبال آقای هاید گشتن."),
                    StoryParagraph("One night, he saw a strange man.", "یک شب، مرد عجیبی دید."),
                    StoryParagraph("The man was small and ugly.", "آن مرد کوچک و زشت بود."),
                    StoryParagraph("He had a cruel and evil face.", "صورتی ظالم و شیطانی داشت."),
                    StoryParagraph("He walked over a small girl.", "او روی دختر کوچکی راه رفت."),
                    StoryParagraph("He did not stop to help her.", "او نایستاد تا کمکش کند."),
                    StoryParagraph("Utterson saw that the man was Mr. Hyde.", "آترسون دید آن مرد آقای هاید است."),
                    StoryParagraph("He began to fear for Dr. Jekyll.", "او شروع کرد به ترسیدن برای دکتر جکیل.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Evil Mr. Hyde", titlePersian = "آقای هاید عجیب",
                paragraphs = listOf(
                    StoryParagraph("Mr. Hyde lived in an old house.", "آقای هاید در خانه‌ای قدیمی زندگی می‌کرد."),
                    StoryParagraph("The house was next to Dr. Jekyll's lab.", "خانه کنار آزمایشگاه دکتر جکیل بود."),
                    StoryParagraph("People said Hyde was a strange man.", "مردم می‌گفتند هاید مرد عجیبی است."),
                    StoryParagraph("They did not like to talk to him.", "آن‌ها دوست نداشتند با او صحبت کنند."),
                    StoryParagraph("He was rude and violent.", "او بی‌ادب و خشن بود."),
                    StoryParagraph("One night, a servant saw him beat a man.", "یک شب، خدمتکاری دید او مردی را کتک می‌زند."),
                    StoryParagraph("He beat the man with a cane.", "او مرد را با عصا زد."),
                    StoryParagraph("The man died from his injuries.", "آن مرد از جراحاتش مرد."),
                    StoryParagraph("The victim was a respected politician.", "قربانی سیاستمدار محترمی بود."),
                    StoryParagraph("The police looked for Hyde everywhere.", "پلیس همه‌جا دنبال هاید گشت."),
                    StoryParagraph("But Hyde had disappeared.", "اما هاید ناپدید شده بود."),
                    StoryParagraph("Dr. Jekyll was very sick for a while.", "دکتر جکیل مدتی خیلی مریض بود."),
                    StoryParagraph("Then he seemed to get better.", "بعد به نظر بهتر شد."),
                    StoryParagraph("He gave parties and saw his friends again.", "او مهمانی می‌داد و دوستانش را دوباره می‌دید."),
                    StoryParagraph("But Utterson noticed something strange.", "اما آترسون چیز عجیبی متوجه شد."),
                    StoryParagraph("Dr. Jekyll looked tired and old.", "دکتر جکیل خسته و پیر به نظر می‌رسید."),
                    StoryParagraph("Sometimes his hands shook.", "گاهی دست‌هایش می‌لرزید."),
                    StoryParagraph("He seemed afraid of something.", "او از چیزی می‌ترسید."),
                    StoryParagraph("Utterson asked him about Hyde.", "آترسون از او درباره هاید پرسید."),
                    StoryParagraph("Jekyll said he would never see Hyde again.", "جکیل گفت هرگز دوباره هاید را نمی‌بیند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Strange Transformation", titlePersian = "نوشیدنی جادویی",
                paragraphs = listOf(
                    StoryParagraph("Then one day, Jekyll locked himself in his lab.", "بعد یک روز، جکیل خودش را در آزمایشگاهش حبس کرد."),
                    StoryParagraph("He refused to see anyone.", "او از دیدن هر کسی امتناع کرد."),
                    StoryParagraph("Even his old friends were turned away.", "حتی دوستان قدیمی‌اش را رد می‌کرد."),
                    StoryParagraph("A servant heard strange sounds inside.", "خدمتکاری صداهای عجیبی از داخل شنید."),
                    StoryParagraph("He heard crying and screaming.", "او گریه و جیغ شنید."),
                    StoryParagraph("Utterson was called to help.", "آترسون برای کمک صدا زده شد."),
                    StoryParagraph("They broke down the door of the lab.", "آن‌ها درِ آزمایشگاه را شکستند."),
                    StoryParagraph("Inside, they found a terrible scene.", "داخل، صحنه وحشتناکی پیدا کردند."),
                    StoryParagraph("Mr. Hyde was lying on the floor.", "آقای هاید روی زمین دراز کشیده بود."),
                    StoryParagraph("He was wearing Dr. Jekyll's clothes.", "او لباس‌های دکتر جکیل را پوشیده بود."),
                    StoryParagraph("But the clothes were too big for him.", "اما لباس‌ها برایش خیلی بزرگ بود."),
                    StoryParagraph("He had killed himself with poison.", "او خودش را با سم کشته بود."),
                    StoryParagraph("There was a letter on the table.", "نامه‌ای روی میز بود."),
                    StoryParagraph("It was from Dr. Jekyll.", "از دکتر جکیل بود."),
                    StoryParagraph("Utterson took the letter home.", "آترسون نامه را به خانه برد."),
                    StoryParagraph("He read it with shaking hands.", "با دست‌های لرزان خواندش."),
                    StoryParagraph("The letter explained everything.", "نامه همه چیز را توضیح می‌داد."),
                    StoryParagraph("Dr. Jekyll had made a potion.", "دکتر جکیل معجونی ساخته بود."),
                    StoryParagraph("The potion changed him into Mr. Hyde.", "معجون او را به آقای هاید تبدیل می‌کرد."),
                    StoryParagraph("Hyde was the evil side of Jekyll.", "هاید طرف شیطانی جکیل بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Terrible Change", titlePersian = "تبدیل وحشتناک",
                paragraphs = listOf(
                    StoryParagraph("In the letter, Jekyll told his story.", "در نامه، جکیل داستانش را گفت."),
                    StoryParagraph("He had always been both good and bad.", "او همیشه هم خوب و هم بد بود."),
                    StoryParagraph("He wanted to separate these two sides.", "او می‌خواست این دو طرف را از هم جدا کند."),
                    StoryParagraph("He worked for years on a potion.", "او سال‌ها روی معجونی کار کرد."),
                    StoryParagraph("Finally, he drank it and became Hyde.", "بالاخره، آن را نوشید و هاید شد."),
                    StoryParagraph("Hyde was small and ugly.", "هاید کوچک و زشت بود."),
                    StoryParagraph("But he was free from guilt.", "اما از گناه آزاد بود."),
                    StoryParagraph("He could do whatever he wanted.", "او می‌توانست هر کاری بخواهد بکند."),
                    StoryParagraph("At first, Jekyll enjoyed being Hyde.", "اول، جکیل از هاید بودن لذت می‌برد."),
                    StoryParagraph("He could do bad things secretly.", "او می‌توانست مخفیانه کارهای بد بکند."),
                    StoryParagraph("But Hyde became stronger over time.", "اما هاید به مرور قوی‌تر شد."),
                    StoryParagraph("Soon, Jekyll could not control him.", "به‌زودی، جکیل نمی‌توانست کنترلش کند."),
                    StoryParagraph("Hyde started to take over without the potion.", "هاید بدون معجون هم شروع کرد به تسخیر کردن."),
                    StoryParagraph("Jekyll became Hyde in his sleep.", "جکیل در خواب هاید می‌شد."),
                    StoryParagraph("He could not stop the changes.", "او نمی‌توانست تغییرات را متوقف کند."),
                    StoryParagraph("He tried to stop taking the potion.", "او تلاش کرد معجون را ترک کند."),
                    StoryParagraph("But the change happened anyway.", "اما تغییر به هر حال اتفاق می‌افتاد."),
                    StoryParagraph("He made more potion, but it failed.", "او معجون بیشتری ساخت، اما شکست خورد."),
                    StoryParagraph("He was trapped as Hyde forever.", "او برای همیشه در هاید گیر افتاد."),
                    StoryParagraph("So he decided to end his life.", "پس تصمیم گرفت به زندگی‌اش پایان دهد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Sad Ending", titlePersian = "پایان غم‌انگیز",
                paragraphs = listOf(
                    StoryParagraph("Utterson finished reading the letter.", "آترسون خواندن نامه را تمام کرد."),
                    StoryParagraph("He was shocked and sad.", "او شوکه و غمگین بود."),
                    StoryParagraph("His friend Dr. Jekyll was gone.", "دوستش دکتر جکیل رفته بود."),
                    StoryParagraph("In his place was the evil Mr. Hyde.", "به جای او آقای هاید شیطانی بود."),
                    StoryParagraph("Utterson told the police the whole story.", "آترسون تمام داستان را به پلیس گفت."),
                    StoryParagraph("The case was officially closed.", "پرونده رسماً بسته شد."),
                    StoryParagraph("But people in London kept talking.", "اما مردم لندن مدام صحبت می‌کردند."),
                    StoryParagraph("They told stories about the strange doctor.", "آن‌ها درباره دکتر عجیب داستان می‌گفتند."),
                    StoryParagraph("Some said he was cursed.", "بعضی گفتند نفرین شده بود."),
                    StoryParagraph("Others said he was a genius gone mad.", "دیگران گفتند نابغه‌ای دیوانه شده بود."),
                    StoryParagraph("Dr. Jekyll's house was sold.", "خانه دکتر جکیل فروخته شد."),
                    StoryParagraph("His laboratory was locked up.", "آزمایشگاهش قفل شد."),
                    StoryParagraph("No one wanted to enter the dark room.", "هیچ‌کس نمی‌خواست وارد اتاق تاریک شود."),
                    StoryParagraph("Utterson never forgot his friend.", "آترسون هرگز دوستش را فراموش نکرد."),
                    StoryParagraph("He thought about him often.", "او زیاد به او فکر می‌کرد."),
                    StoryParagraph("He wondered if good and evil exist in everyone.", "او فکر می‌کرد آیا خوب و بد در همه وجود دارد."),
                    StoryParagraph("He decided they probably do.", "او تصمیم گرفت احتمالاً وجود دارند."),
                    StoryParagraph("The important thing is to control them.", "چیز مهم کنترل کردن آن‌هاست."),
                    StoryParagraph("Dr. Jekyll could not do that.", "دکتر جکیل نمی‌توانست این کار را بکند."),
                    StoryParagraph("And so he destroyed himself.", "و بنابراین خودش را نابود کرد.")
                )
            )
        )
    )

    // ─────────────── ۲۱: کنت مونت کریستو ───────────────
    private fun story21() = StoryContent(
        storyId = "int_monte_cristo",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Prison of If", titlePersian = "زندان ایف",
                paragraphs = listOf(
                    StoryParagraph("Edmond Dantès was a young sailor.", "ادموند دانتس ملوان جوانی بود."),
                    StoryParagraph("He worked on a ship called the Pharaon.", "او روی کشتی‌ای به نام فارائون کار می‌کرد."),
                    StoryParagraph("He was kind and hardworking.", "او مهربان و سخت‌کوش بود."),
                    StoryParagraph("The captain died during a voyage.", "کاپیتان در طول سفر مرد."),
                    StoryParagraph("Edmond took command of the ship.", "ادموند فرماندهی کشتی را به دست گرفت."),
                    StoryParagraph("He returned to Marseille safely.", "او سالم به مارسی برگشت."),
                    StoryParagraph("The shipowner was pleased with him.", "صاحب کشتی از او راضی بود."),
                    StoryParagraph("Edmond was going to become captain.", "ادموند می‌خواست کاپیتان شود."),
                    StoryParagraph("He was also going to marry Mercedes.", "او همچنین می‌خواست با مرسدس ازدواج کند."),
                    StoryParagraph("She was beautiful and kind.", "او زیبا و مهربان بود."),
                    StoryParagraph("But some men were jealous of Edmond.", "اما چند مرد به ادموند حسادت می‌کردند."),
                    StoryParagraph("There was Danglars, who wanted his job.", "دانگلار بود که شغلش را می‌خواست."),
                    StoryParagraph("There was Fernand, who loved Mercedes.", "فرناند بود که مرسدس را دوست داشت."),
                    StoryParagraph("And there was Caderousse, a greedy neighbor.", "و کادروس، همسایه‌ای حریص بود."),
                    StoryParagraph("They wrote a letter about Edmond.", "آن‌ها نامه‌ای درباره ادموند نوشتند."),
                    StoryParagraph("The letter said he was a traitor.", "نامه می‌گفت او خائن است."),
                    StoryParagraph("The police arrested Edmond on his wedding day.", "پلیس ادموند را روز عروسی‌اش دستگیر کرد."),
                    StoryParagraph("They took him to a prison called the Château d'If.", "آن‌ها او را به زندانی به نام قلعه ایف بردند."),
                    StoryParagraph("Edmond did not understand why.", "ادموند نمی‌فهمید چرا."),
                    StoryParagraph("He was innocent, but no one listened.", "او بی‌گناه بود، اما کسی گوش نداد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Escape and Treasure", titlePersian = "فرار و گنج",
                paragraphs = listOf(
                    StoryParagraph("Edmond spent fourteen years in prison.", "ادموند چهارده سال در زندان گذراند."),
                    StoryParagraph("He was alone and almost lost hope.", "او تنها بود و تقریباً امیدش را از دست داد."),
                    StoryParagraph("One day, he met another prisoner.", "یک روز، زندانی دیگری را ملاقات کرد."),
                    StoryParagraph("His name was Abbé Faria.", "اسمش آبه فاریا بود."),
                    StoryParagraph("Faria was old and wise.", "فاریا پیر و دانا بود."),
                    StoryParagraph("He taught Edmond many things.", "او چیزهای زیادی به ادموند آموخت."),
                    StoryParagraph("History, science, languages, and sword fighting.", "تاریخ، علم، زبان‌ها و شمشیربازی."),
                    StoryParagraph("Edmond became a new man.", "ادموند مرد جدیدی شد."),
                    StoryParagraph("Faria told him about a secret treasure.", "فاریا به او از گنجی مخفی گفت."),
                    StoryParagraph("The treasure was on the island of Monte Cristo.", "گنج در جزیره مونت کریستو بود."),
                    StoryParagraph("Faria gave Edmond a map.", "فاریا نقشه‌ای به ادموند داد."),
                    StoryParagraph("When Faria died, Edmond escaped.", "وقتی فاریا مرد، ادموند فرار کرد."),
                    StoryParagraph("He swam to a nearby island.", "او به جزیره‌ای نزدیک شنا کرد."),
                    StoryParagraph("He was rescued by a ship.", "او توسط کشتی‌ای نجات یافت."),
                    StoryParagraph("He went to Monte Cristo to find the treasure.", "او برای پیدا کردن گنج به مونت کریستو رفت."),
                    StoryParagraph("The treasure was enormous.", "گنج عظیم بود."),
                    StoryParagraph("Edmond became one of the richest men in the world.", "ادموند یکی از ثروتمندترین مردان جهان شد."),
                    StoryParagraph("Now he could plan his revenge.", "حالا می‌توانست انتقامش را نقشه کشد."),
                    StoryParagraph("He called himself the Count of Monte Cristo.", "او خودش را کنت مونت کریستو نامید."),
                    StoryParagraph("No one knew his real identity.", "هیچ‌کس هویت واقعی‌اش را نمی‌دانست.")
                )
            ),
            StoryChapter(
                number = 3, title = "Return to Paris", titlePersian = "بازگشت به پاریس",
                paragraphs = listOf(
                    StoryParagraph("Years later, the Count arrived in Paris.", "سال‌ها بعد، کنت به پاریس رسید."),
                    StoryParagraph("He had changed his name and appearance.", "اسم و ظاهرش را عوض کرده بود."),
                    StoryParagraph("No one recognized Edmond Dantès.", "هیچ‌کس ادموند دانتس را نمی‌شناخت."),
                    StoryParagraph("He met Danglars, now a rich banker.", "او دانگلار، که حالا بانکدار ثروتمندی بود، را ملاقات کرد."),
                    StoryParagraph("He met Fernand, now a respected count.", "او فرناند، که حالا کنت محترمی بود، را ملاقات کرد."),
                    StoryParagraph("Fernand had married Mercedes.", "فرناند با مرسدس ازدواج کرده بود."),
                    StoryParagraph("The Count invited everyone to his parties.", "کنت همه را به مهمانی‌هایش دعوت کرد."),
                    StoryParagraph("He acted friendly but planned revenge.", "او دوستانه رفتار می‌کرد اما انتقام نقشه می‌کشید."),
                    StoryParagraph("He used his money and knowledge to trick them.", "او از پول و دانشش برای فریبشان استفاده می‌کرد."),
                    StoryParagraph("He made Danglars lose all his money.", "او دانگلار را وادار کرد تمام پولش را از دست بدهد."),
                    StoryParagraph("He exposed Fernand's past betrayal.", "او خیانت گذشته فرناند را افشا کرد."),
                    StoryParagraph("Fernand killed himself in shame.", "فرناند از شرم خودش را کشت."),
                    StoryParagraph("Mercedes learned the truth about her husband.", "مرسدس حقیقت را درباره شوهرش فهمید."),
                    StoryParagraph("She recognized the Count.", "او کنت را شناخت."),
                    StoryParagraph("She asked him to forgive.", "او از او خواست ببخشد."),
                    StoryParagraph("The Count was sad and confused.", "کنت غمگین و گیج بود."),
                    StoryParagraph("He had waited so long for revenge.", "او خیلی منتظر انتقام مانده بود."),
                    StoryParagraph("But now he felt empty.", "اما حالا احساس پوچی می‌کرد."),
                    StoryParagraph("Revenge did not bring him peace.", "انتقام آرامش را برایش نیاورد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Forgiveness and Peace", titlePersian = "انتقام هوشمندانه",
                paragraphs = listOf(
                    StoryParagraph("The Count realized his revenge had gone too far.", "کنت فهمید انتقامش خیلی دور رفته."),
                    StoryParagraph("Innocent people had been hurt.", "افراد بی‌گناه آسیب دیده بودند."),
                    StoryParagraph("He decided to stop.", "او تصمیم گرفت متوقف شود."),
                    StoryParagraph("He helped Mercedes and her son.", "او به مرسدس و پسرش کمک کرد."),
                    StoryParagraph("He saved the son from being killed.", "او پسر را از کشته شدن نجات داد."),
                    StoryParagraph("He also helped his old friend Maximilian.", "او به دوست قدیمی‌اش ماکسیمیلیان هم کمک کرد."),
                    StoryParagraph("Maximilian loved a girl named Valentine.", "ماکسیمیلیان دختری به نام والنتین را دوست داشت."),
                    StoryParagraph("Their families did not want them to marry.", "خانواده‌هایشان نمی‌خواستند ازدواج کنند."),
                    StoryParagraph("The Count helped them be together.", "کنت کمکشان کرد با هم باشند."),
                    StoryParagraph("He wrote a letter to Maximilian.", "او نامه‌ای به ماکسیمیلیان نوشت."),
                    StoryParagraph("The letter told him to be patient.", "نامه به او گفت صبور باشد."),
                    StoryParagraph("Then one day, something wonderful happened.", "بعد یک روز، چیز شگفت‌انگیزی اتفاق افتاد."),
                    StoryParagraph("Maximilian found Valentine alive.", "ماکسیمیلیان والنتین را زنده پیدا کرد."),
                    StoryParagraph("The Count had saved her from poison.", "کنت او را از سم نجات داده بود."),
                    StoryParagraph("Maximilian was overjoyed.", "ماکسیمیلیان بی‌نهایت خوشحال شد."),
                    StoryParagraph("The Count said goodbye to them.", "کنت از آن‌ها خداحافظی کرد."),
                    StoryParagraph("He told them the secret of life.", "او راز زندگی را به آن‌ها گفت."),
                    StoryParagraph("He said: Wait and hope.", "او گفت: صبر کن و امیدوار باش."),
                    StoryParagraph("Then he sailed away on his ship.", "بعد او با کشتی‌اش دور شد."),
                    StoryParagraph("He left his past behind forever.", "او گذشته‌اش را برای همیشه رها کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Happiness", titlePersian = "پایان تلخ و شیرین",
                paragraphs = listOf(
                    StoryParagraph("The Count traveled to the East.", "کنت به شرق سفر کرد."),
                    StoryParagraph("He wanted to find peace in the sun.", "او می‌خواست در آفتاب آرامش پیدا کند."),
                    StoryParagraph("He gave most of his money to the poor.", "او بیشتر پولش را به فقرا داد."),
                    StoryParagraph("He kept only what he needed.", "او فقط چیزهایی که نیاز داشت نگه داشت."),
                    StoryParagraph("One day, he met a young woman named Haydée.", "یک روز، زن جوانی به نام هایده را ملاقات کرد."),
                    StoryParagraph("She had been a slave in his house.", "او در خانه‌اش برده بود."),
                    StoryParagraph("But she loved him deeply.", "اما او عمیقاً دوستش داشت."),
                    StoryParagraph("He finally admitted his love for her.", "او بالاخره عشقش را به او اعتراف کرد."),
                    StoryParagraph("They got married in a quiet ceremony.", "آن‌ها در مراسمی آرام ازدواج کردند."),
                    StoryParagraph("The Count was finally happy.", "کنت بالاخره خوشحال بود."),
                    StoryParagraph("He had learned a great lesson.", "او درس بزرگی یاد گرفته بود."),
                    StoryParagraph("Revenge cannot heal a broken heart.", "انتقام نمی‌تواند قلب شکسته را درمان کند."),
                    StoryParagraph("Only love and forgiveness can.", "فقط عشق و بخشش می‌تواند."),
                    StoryParagraph("He thought about his old friends.", "او به دوستان قدیمی‌اش فکر کرد."),
                    StoryParagraph("He forgave everyone in his heart.", "او همه را در قلبش بخشید."),
                    StoryParagraph("He even forgave Danglars.", "او حتی دانگلار را بخشید."),
                    StoryParagraph("That was the true victory.", "این پیروزی واقعی بود."),
                    StoryParagraph("He lived the rest of his life in peace.", "او بقیه زندگی‌اش را در آرامش گذراند."),
                    StoryParagraph("And Haydée was always by his side.", "و هایده همیشه کنارش بود."),
                    StoryParagraph("And so the story ended happily.", "و اینگونه داستان با خوشحالی پایان یافت.")
                )
            )
        )
    )
}