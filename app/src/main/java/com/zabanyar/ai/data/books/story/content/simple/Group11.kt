package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group11 — ۵ داستان مبتدی
 * هر داستان: ۴ فصل × ۲۰ خط = ۸۰ خط
 * با ترجمه فارسی
 *
 * ۴۱. معمای هویت
 * ۴۲. معمای دره بوسکوم
 * ۴۳. پنج دانه پرتقال
 * ۴۴. مرد با لب شکری
 * ۴۵. انگشت شست مهندس
 */
object Group11 {

    fun getAll(): List<StoryContent> = listOf(
        story41(), story42(), story43(), story44(), story45()
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۱: معمای هویت
    // ═══════════════════════════════════════════════════════
    private fun story41() = StoryContent(
        storyId = "sherlock_case_identity",
        chapters = listOf(
            StoryChapter(1, "The Missing Groom", "داماد گمشده", listOf(
                StoryParagraph("A young woman came to Baker Street one morning.", "زن جوانی یک صبح به خیابان بیکر آمد."),
                StoryParagraph("Her name was Mary Sutherland.", "اسمش مری ساترلند بود."),
                StoryParagraph("She was engaged to a man named Hosmer Angel.", "او با مردی به نام هازمر ایجیل نامزد بود."),
                StoryParagraph("But he had disappeared on their wedding day.", "اما او در روز عروسی‌شان ناپدید شده بود."),
                StoryParagraph("She wanted Holmes to find him.", "می‌خواست هلمز پیدایش کند."),
                StoryParagraph("She described him as a quiet man.", "او را مردی ساکت توصیف کرد."),
                StoryParagraph("He always wore dark glasses and a hat.", "همیشه عینک تیره و کلاه می‌پوشید."),
                StoryParagraph("He spoke in a soft and strange voice.", "با صدای آرام و عجیبی صحبت می‌کرد."),
                StoryParagraph("Holmes listened to every detail carefully.", "هلمز با دقت به هر جزئیات گوش داد."),
                StoryParagraph("He asked about her family and her home.", "او درباره خانواده و خانه‌اش پرسید."),
                StoryParagraph("She lived with her mother and stepfather.", "او با مادر و ناپدری‌اش زندگی می‌کرد."),
                StoryParagraph("Her stepfather was Mr. Windibank.", "ناپدری‌اش آقای ویندیبنک بود."),
                StoryParagraph("Mary earned good money from her own work.", "مری از کار خودش پول خوبی درمی‌آورد."),
                StoryParagraph("She gave most of it to her mother.", "بیشترش را به مادرش می‌داد."),
                StoryParagraph("Mary showed Holmes some letters.", "مری چند نامه به هلمز نشان داد."),
                StoryParagraph("They were from Hosmer Angel.", "آن‌ها از هازمر ایجیل بودند."),
                StoryParagraph("The handwriting was not normal.", "دست‌خط عادی نبود."),
                StoryParagraph("It looked like it was typed or changed.", "به نظر می‌رسید تایپ شده یا تغییر کرده."),
                StoryParagraph("Holmes took notes and thought deeply.", "هلمز یادداشت برداشت و عمیق فکر کرد."),
                StoryParagraph("He promised to look into the matter.", "او قول داد موضوع را بررسی کند.")
            )),
            StoryChapter(2, "The Wedding Day", "روز عروسی", listOf(
                StoryParagraph("Mary told Holmes about the wedding day.", "مری درباره روز عروسی به هلمز گفت."),
                StoryParagraph("They were going to marry at a church.", "قرار بود در کلیسایی ازدواج کنند."),
                StoryParagraph("Hosmer arrived in a carriage.", "هازمر با کالسکه رسید."),
                StoryParagraph("They walked to the church together.", "آن‌ها با هم به کلیسا رفتند."),
                StoryParagraph("Suddenly, Hosmer stopped and turned back.", "ناگهان، هازمر ایستاد و برگشت."),
                StoryParagraph("He ran to the street and jumped in a cab.", "به خیابان دوید و سوار تاکسی شد."),
                StoryParagraph("The cab drove away very fast.", "تاکسی خیلی سریع دور شد."),
                StoryParagraph("Mary never saw him again.", "مری دیگر هرگز ندیدش."),
                StoryParagraph("Holmes went to visit Mary's mother.", "هلمز به دیدن مادر مری رفت."),
                StoryParagraph("He wanted to ask some questions.", "می‌خواست چند سؤال بپرسد."),
                StoryParagraph("Mrs. Windibank welcomed him politely.", "خانم ویندیبنک مؤدبانه خوش‌آمد گفت."),
                StoryParagraph("But she seemed a little nervous.", "اما کمی مضطرب به نظر می‌رسید."),
                StoryParagraph("Mr. Windibank was the same height as Hosmer.", "قد آقای ویندیبنک مثل هازمر بود."),
                StoryParagraph("They had the same way of walking.", "روش راه رفتن یکسانی داشتند."),
                StoryParagraph("Their handwriting was almost the same.", "دست‌خطشان تقریباً یکسان بود."),
                StoryParagraph("Holmes smiled to himself.", "هلمز در دلش لبخند زد."),
                StoryParagraph("He now knew the truth.", "او حالا حقیقت را می‌دانست."),
                StoryParagraph("He told Mary to write another letter.", "او به مری گفت نامه دیگری بنویسد."),
                StoryParagraph("The letter was to Hosmer Angel.", "نامه به هازمر ایجیل بود."),
                StoryParagraph("Then he went back to Baker Street.", "بعد به خیابان بیکر برگشت.")
            )),
            StoryChapter(3, "The Truth Revealed", "حقیقت آشکار شد", listOf(
                StoryParagraph("The answer to the letter came soon.", "جواب نامه خیلی زود آمد."),
                StoryParagraph("It was written by Mr. Windibank.", "توسط آقای ویندیبنک نوشته شده بود."),
                StoryParagraph("He wrote that Hosmer Angel did not exist.", "او نوشت هازمر ایجیل وجود ندارد."),
                StoryParagraph("He said it was all a cruel trick.", "گفت همه‌اش حقه‌ای بی‌رحمانه بود."),
                StoryParagraph("Mary was shocked and heartbroken.", "مری شوکه و دل‌شکسته شد."),
                StoryParagraph("Holmes explained everything to her.", "هلمز همه چیز را برایش توضیح داد."),
                StoryParagraph("Hosmer Angel was really her stepfather.", "هازمر ایجیل واقعاً ناپدری‌اش بود."),
                StoryParagraph("He had worn a disguise and a fake voice.", "او تغییر قیافه داده بود و صدای جعلی داشت."),
                StoryParagraph("He wanted to keep Mary's money.", "او پول مری را می‌خواست."),
                StoryParagraph("If she married, she would leave the house.", "اگر ازدواج می‌کرد، از خانه می‌رفت."),
                StoryParagraph("Then he would lose her income.", "بعد درآمدش را از دست می‌داد."),
                StoryParagraph("So he invented Hosmer to stop the marriage.", "پس هازمر را ساخت تا جلوی ازدواج را بگیرد."),
                StoryParagraph("On the wedding day, he ran away.", "روز عروسی، فرار کرد."),
                StoryParagraph("He knew Mary would wait forever.", "می‌دانست مری همیشه منتظر می‌ماند."),
                StoryParagraph("He never thought Holmes would find out.", "هرگز فکر نمی‌کرد هلمز بفهمد."),
                StoryParagraph("But Holmes was too clever for him.", "اما هلمز از او باهوش‌تر بود."),
                StoryParagraph("Mary cried for a long time.", "مری مدت زیادی گریه کرد."),
                StoryParagraph("Then she said she was glad to know the truth.", "بعد گفت خوشحاله حقیقت را می‌داند."),
                StoryParagraph("Holmes called the police.", "هلمز پلیس را خبر کرد."),
                StoryParagraph("Mr. Windibank was arrested at his office.", "آقای ویندیبنک در دفترش دستگیر شد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("Mr. Windibank was sent to prison.", "آقای ویندیبنک به زندان فرستاده شد."),
                StoryParagraph("His wife was shocked and ashamed.", "همسرش شوکه و شرمنده شد."),
                StoryParagraph("She left him soon after.", "او خیلی زود ترکش کرد."),
                StoryParagraph("Mary moved to a new town.", "مری به شهر جدیدی نقل مکان کرد."),
                StoryParagraph("She got a new job and worked hard.", "شغل جدیدی گرفت و سخت کار کرد."),
                StoryParagraph("Slowly, she began to heal.", "آرام‌آرام شروع کرد به التیام."),
                StoryParagraph("She never trusted strangers easily again.", "دیگر هرگز به راحتی به غریبه‌ها اعتماد نکرد."),
                StoryParagraph("But she learned to be strong.", "اما یاد گرفت قوی باشد."),
                StoryParagraph("Watson asked Holmes about the case.", "واتسون از هلمز درباره پرونده پرسید."),
                StoryParagraph("Holmes said it was one of his strangest.", "هلمز گفت یکی از عجیب‌ترین‌هایش بود."),
                StoryParagraph("A man had pretended to be himself in disguise.", "مردی تظاهر کرده بود خودش با تغییر قیافه است."),
                StoryParagraph("He had tricked his own stepdaughter.", "او دخترخوانده خودش را فریب داده بود."),
                StoryParagraph("But love had made Mary blind.", "اما عشق مری را کور کرده بود."),
                StoryParagraph("A smart detective sees small things.", "کارآگاه باهوش چیزهای کوچک را می‌بیند."),
                StoryParagraph("Small things often reveal big truths.", "چیزهای کوچک اغلب حقایق بزرگ را فاش می‌کنند."),
                StoryParagraph("Watson nodded and wrote it down.", "واتسون سر تکان داد و نوشتش."),
                StoryParagraph("Holmes lit his pipe and sat back.", "هلمز پیپش را روشن کرد و عقب نشست."),
                StoryParagraph("The case was finally closed.", "پرونده بالاخره بسته شد."),
                StoryParagraph("And so justice was done.", "و اینگونه عدالت اجرا شد."),
                StoryParagraph("Holmes waited for the next mystery.", "هلمز منتظر معمای بعدی ماند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۲: معمای دره بوسکوم
    // ═══════════════════════════════════════════════════════
    private fun story42() = StoryContent(
        storyId = "sherlock_boscombe_valley",
        chapters = listOf(
            StoryChapter(1, "The Murder", "قتل", listOf(
                StoryParagraph("A murder happened in Boscombe Valley.", "قتلی در دره بوسکوم اتفاق افتاد."),
                StoryParagraph("A man named Charles McCarthy was killed.", "مردی به نام چارلز مک‌کارتی کشته شد."),
                StoryParagraph("His son James was arrested for the crime.", "پسرش جیمز برای جنایت دستگیر شد."),
                StoryParagraph("The police said James killed his father.", "پلیس گفت جیمز پدرش را کشت."),
                StoryParagraph("But James said he was innocent.", "اما جیمز گفت بی‌گناه است."),
                StoryParagraph("He asked Holmes to help him.", "او از هلمز خواست کمکش کند."),
                StoryParagraph("Holmes and Watson went to Boscombe.", "هلمز و واتسون به بوسکوم رفتند."),
                StoryParagraph("They arrived at the small town.", "آن‌ها به شهر کوچک رسیدند."),
                StoryParagraph("Everyone believed James was guilty.", "همه باور داشتند جیمز گناهکار است."),
                StoryParagraph("Holmes wanted to see the crime scene.", "هلمز می‌خواست صحنه جرم را ببیند."),
                StoryParagraph("They walked to the place in the woods.", "آن‌ها به محل در جنگل رفتند."),
                StoryParagraph("A small lake was near the path.", "دریاچه کوچکی نزدیک مسیر بود."),
                StoryParagraph("The ground was soft and muddy.", "زمین نرم و گلی بود."),
                StoryParagraph("Holmes looked at everything carefully.", "هلمز با دقت به همه چیز نگاه کرد."),
                StoryParagraph("He found some footprints near the lake.", "چند ردپا نزدیک دریاچه پیدا کرد."),
                StoryParagraph("They were small and not James's size.", "کوچک بودند و اندازه جیمز نبودند."),
                StoryParagraph("James said his father called someone 'Cooee'.", "جیمز گفت پدرش کسی را «کووی» صدا زد."),
                StoryParagraph("That word meant something to Holmes.", "آن کلمه برای هلمز معنی داشت."),
                StoryParagraph("It was a call used in Australia.", "فریادی بود که در استرالیا استفاده می‌شد."),
                StoryParagraph("So another Australian was there.", "پس استرالیایی دیگری آنجا بود.")
            )),
            StoryChapter(2, "The Landowner", "زمین‌دار", listOf(
                StoryParagraph("Near the lake lived a rich man.", "نزدیک دریاچه مردی ثروتمند زندگی می‌کرد."),
                StoryParagraph("His name was John Turner.", "اسمش جان ترنر بود."),
                StoryParagraph("He was old and sick.", "او پیر و مریض بود."),
                StoryParagraph("He had a daughter named Alice.", "دختری به نام آلیس داشت."),
                StoryParagraph("James loved Alice very much.", "جیمز آلیس را خیلی دوست داشت."),
                StoryParagraph("Mr. Turner liked James.", "آقای ترنر جیمز را دوست داشت."),
                StoryParagraph("But he did not want them to marry.", "اما نمی‌خواست ازدواج کنند."),
                StoryParagraph("Holmes visited Mr. Turner.", "هلمز به دیدن آقای ترنر رفت."),
                StoryParagraph("The old man looked very worried.", "پیرمرد خیلی نگران به نظر می‌رسید."),
                StoryParagraph("Holmes asked him about Australia.", "هلمز از او درباره استرالیا پرسید."),
                StoryParagraph("Turner became pale and quiet.", "ترنر رنگ‌پریده و ساکت شد."),
                StoryParagraph("Holmes said he knew the truth.", "هلمز گفت حقیقت را می‌داند."),
                StoryParagraph("Turner had been in Australia too.", "ترنر هم در استرالیا بوده."),
                StoryParagraph("He had known Charles McCarthy there.", "او چارلز مک‌کارتی را آنجا می‌شناخت."),
                StoryParagraph("They had been partners in crime.", "آن‌ها شریک جنایت بودند."),
                StoryParagraph("Charles had been blackmailing Turner.", "چارلز ترنر را اخاذی می‌کرد."),
                StoryParagraph("That was why they argued at the lake.", "به همین دلیل کنار دریاچه بحث کردند."),
                StoryParagraph("Turner shot Charles in anger.", "ترنر چارلز را از خشم زد."),
                StoryParagraph("Then he ran away through the woods.", "بعد از میان جنگل فرار کرد."),
                StoryParagraph("He was sorry but could not undo it.", "پشیمان بود اما نمی‌توانست جبرانش کند.")
            )),
            StoryChapter(3, "The Trial", "محاکمه", listOf(
                StoryParagraph("The trial of James McCarthy began.", "محاکمه جیمز مک‌کارتی شروع شد."),
                StoryParagraph("Many people came to watch.", "مردم زیادی برای تماشا آمدند."),
                StoryParagraph("The evidence was against James.", "مدارک علیه جیمز بود."),
                StoryParagraph("The gun had his fingerprints.", "تفنگ اثر انگشتش را داشت."),
                StoryParagraph("Everyone thought he was guilty.", "همه فکر می‌کردند گناهکار است."),
                StoryParagraph("But Holmes came to testify.", "اما هلمز برای شهادت آمد."),
                StoryParagraph("He showed the footprints from the lake.", "او ردپاهای دریاچه را نشان داد."),
                StoryParagraph("They were not James's size.", "اندازه جیمز نبودند."),
                StoryParagraph("He told the court about the word 'Cooee'.", "او به دادگاه درباره کلمه «کووی» گفت."),
                StoryParagraph("It was a call from Australia.", "فریادی از استرالیا بود."),
                StoryParagraph("James had never been to Australia.", "جیمز هرگز در استرالیا نبوده."),
                StoryParagraph("So someone else was at the lake.", "پس شخص دیگری در دریاچه بود."),
                StoryParagraph("The court was shocked.", "دادگاه شوکه شد."),
                StoryParagraph("Mr. Turner then stood up.", "بعد آقای ترنر بلند شد."),
                StoryParagraph("He confessed to the murder.", "او به قتل اعتراف کرد."),
                StoryParagraph("James was declared innocent.", "جیمز بی‌گناه اعلام شد."),
                StoryParagraph("The courtroom cheered loudly.", "دادگاه بلند تشویق کرد."),
                StoryParagraph("James ran to Alice and hugged her.", "جیمز به سمت آلیس دوید و بغلش کرد."),
                StoryParagraph("The judge was kind to Turner.", "قاضی با ترنر مهربان بود."),
                StoryParagraph("He had saved an innocent man.", "او مرد بی‌گناهی را نجات داده بود.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("John Turner was very sick.", "جان ترنر خیلی مریض بود."),
                StoryParagraph("The doctors said he would not live long.", "دکترها گفتند زیاد زنده نمی‌ماند."),
                StoryParagraph("He stayed in his house until the end.", "او تا آخر در خانه‌اش ماند."),
                StoryParagraph("Alice took care of him every day.", "آلیس هر روز از او مراقبت می‌کرد."),
                StoryParagraph("She forgave her father.", "او پدرش را بخشید."),
                StoryParagraph("James visited them often.", "جیمز اغلب به دیدنشان می‌رفت."),
                StoryParagraph("Turner asked James to take care of Alice.", "او از جیمز خواست از آلیس مراقبت کند."),
                StoryParagraph("James promised with all his heart.", "جیمز با تمام قلبش قول داد."),
                StoryParagraph("Turner died peacefully a few weeks later.", "چند هفته بعد آرام مرد."),
                StoryParagraph("James and Alice married soon after.", "جیمز و آلیس خیلی زود ازدواج کردند."),
                StoryParagraph("They lived a happy life in the valley.", "آن‌ها زندگی خوشی در دره داشتند."),
                StoryParagraph("Watson asked Holmes about the case.", "واتسون از هلمز درباره پرونده پرسید."),
                StoryParagraph("Holmes said it was about the past.", "هلمز گفت درباره گذشته بود."),
                StoryParagraph("Old crimes often return.", "جنایت‌های قدیمی اغلب برمی‌گردند."),
                StoryParagraph("Charles had ruined Turner's life.", "چارلز زندگی ترنر را نابود کرده بود."),
                StoryParagraph("Turner had lived in fear for years.", "ترنر سال‌ها در ترس زندگی کرده بود."),
                StoryParagraph("But he still confessed and saved James.", "اما هنوز اعتراف کرد و جیمز را نجات داد."),
                StoryParagraph("Holmes said justice must be done.", "هلمز گفت عدالت باید اجرا شود."),
                StoryParagraph("And so justice was done.", "و اینگونه عدالت اجرا شد."),
                StoryParagraph("Holmes waited for the next mystery.", "هلمز منتظر معمای بعدی ماند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۳: پنج دانه پرتقال
    // ═══════════════════════════════════════════════════════
    private fun story43() = StoryContent(
        storyId = "sherlock_five_orange_pips",
        chapters = listOf(
            StoryChapter(1, "The Strange Letter", "نامه عجیب", listOf(
                StoryParagraph("A young man came to see Holmes.", "مرد جوانی به دیدن هلمز آمد."),
                StoryParagraph("His name was John Openshaw.", "اسمش جان اپنشاو بود."),
                StoryParagraph("He was pale and very afraid.", "او رنگ‌پریده و خیلی ترسیده بود."),
                StoryParagraph("He told Holmes a strange story.", "او داستان عجیبی برای هلمز تعریف کرد."),
                StoryParagraph("His uncle had died two years ago.", "عمویش دو سال پیش مرده بود."),
                StoryParagraph("His father had died last year.", "پدرش سال پیش مرده بود."),
                StoryParagraph("Both deaths were very strange.", "هر دو مرگ خیلی عجیب بودند."),
                StoryParagraph("Before each death, a letter came.", "قبل از هر مرگ، نامه‌ای می‌آمد."),
                StoryParagraph("The letter had five orange pips inside.", "نامه پنج دانه پرتقال داخلش داشت."),
                StoryParagraph("The letter also had the letters K.K.K.", "نامه حروف K.K.K هم داشت."),
                StoryParagraph("After the letter, the person died.", "بعد از نامه، آن شخص می‌مرد."),
                StoryParagraph("John was afraid he would be next.", "جان می‌ترسید نفر بعدی او باشد."),
                StoryParagraph("He asked Holmes to protect him.", "او از هلمز خواست محافظتش کند."),
                StoryParagraph("Holmes studied the letters carefully.", "هلمز نامه‌ها را با دقت بررسی کرد."),
                StoryParagraph("He noticed the paper was from America.", "متوجه شد کاغذ از آمریکا بود."),
                StoryParagraph("His uncle Elias had lived in America.", "عمویش الیاس در آمریکا زندگی کرده بود."),
                StoryParagraph("Elias had been a member of the K.K.K.", "الیاس عضو ک.ک.ک. بود."),
                StoryParagraph("But he left the group and ran away.", "اما گروه را ترک کرد و فرار کرد."),
                StoryParagraph("The Klan wanted revenge.", "کلان انتقام می‌خواست."),
                StoryParagraph("Holmes told John to go home and be careful.", "هلمز گفت به خانه برود و مراقب باشد.")
            )),
            StoryChapter(2, "The K.K.K.", "ک.ک.ک", listOf(
                StoryParagraph("Holmes knew what K.K.K. meant.", "هلمز می‌دانست K.K.K یعنی چه."),
                StoryParagraph("It was the Ku Klux Klan.", "کو کلاکس کلان بود."),
                StoryParagraph("They were a violent group in America.", "آن‌ها گروهی خشن در آمریکا بودند."),
                StoryParagraph("They killed many innocent people.", "آن‌ها افراد بی‌گناه زیادی را کشتند."),
                StoryParagraph("Elias had taken secret papers with him.", "الیاس کاغذهای سری با خودش برده بود."),
                StoryParagraph("The Klan wanted those papers back.", "کلان آن کاغذها را می‌خواست."),
                StoryParagraph("Five pips meant death.", "پنج دانه به معنی مرگ بود."),
                StoryParagraph("Holmes found a clue in the letters.", "هلمز سرنخی در نامه‌ها پیدا کرد."),
                StoryParagraph("The ship that brought them was Lone Star.", "کشتی که آوردش «ستاره تنها» بود."),
                StoryParagraph("It was a sailing ship from Georgia.", "کشتی بادبانی از جورجیا بود."),
                StoryParagraph("Holmes looked up the ship's records.", "هلمز سوابق کشتی را بررسی کرد."),
                StoryParagraph("Each time the ship sailed, someone died.", "هر بار کشتی سفر می‌کرد، کسی می‌مرد."),
                StoryParagraph("Holmes sent a telegram to America.", "هلمز تلگرافی به آمریکا فرستاد."),
                StoryParagraph("He asked the police to watch the ship.", "او از پلیس خواست کشتی را زیر نظر بگیرد."),
                StoryParagraph("But the ship had already left port.", "اما کشتی بندر را ترک کرده بود."),
                StoryParagraph("Holmes sent a letter to Savannah.", "هلمز نامه‌ای به ساوانا فرستاد."),
                StoryParagraph("He told them to arrest the men.", "او گفت مردان را دستگیر کنند."),
                StoryParagraph("But the ship never arrived there.", "اما کشتی هرگز به آنجا نرسید."),
                StoryParagraph("It was lost in a storm at sea.", "در طوفانی در دریا گم شد."),
                StoryParagraph("All the men on board were drowned.", "همه مردان داخل کشتی غرق شدند.")
            )),
            StoryChapter(3, "The Sad News", "خبر غمگین", listOf(
                StoryParagraph("Holmes went to see John in the country.", "هلمز به دیدن جان در حومه رفت."),
                StoryParagraph("But John was not at the house.", "اما جان در خانه نبود."),
                StoryParagraph("The housekeeper said he went for a walk.", "خانه‌دار گفت برای قدم زدن رفته."),
                StoryParagraph("Holmes waited for him to return.", "هلمز منتظر برگشتنش ماند."),
                StoryParagraph("Hours passed and John did not come.", "ساعت‌ها گذشت و جان نیامد."),
                StoryParagraph("Holmes went to look for John himself.", "خودش به دنبال جان رفت."),
                StoryParagraph("He found him near a small lake.", "او را نزدیک دریاچه کوچکی یافت."),
                StoryParagraph("John had fallen into the water.", "جان در آب افتاده بود."),
                StoryParagraph("He was already dead.", "او قبلاً مرده بود."),
                StoryParagraph("Holmes was very sad.", "هلمز خیلی غمگین شد."),
                StoryParagraph("He had tried to save John but failed.", "او تلاش کرده بود جان را نجات دهد اما نتوانست."),
                StoryParagraph("The K.K.K. had killed him after all.", "ک.ک.ک. بعد از همه این‌ها کشتش."),
                StoryParagraph("Holmes blamed himself a little.", "هلمز کمی خودش را سرزنش کرد."),
                StoryParagraph("But he knew it was not his fault.", "اما می‌دانست تقصیرش نبود."),
                StoryParagraph("He wrote a letter to Watson.", "نامه‌ای به واتسون نوشت."),
                StoryParagraph("Watson came at once.", "واتسون فوراً آمد."),
                StoryParagraph("Together, they buried John quietly.", "با هم، جان را بی‌صدا دفن کردند."),
                StoryParagraph("And they said a prayer for him.", "و برایش دعا کردند."),
                StoryParagraph("The K.K.K. slowly lost its power.", "ک.ک.ک. آرام‌آرام قدرتش را از دست داد."),
                StoryParagraph("Many of its members were arrested.", "اعضای زیادی از آن دستگیر شدند.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The American government fought the Klan.", "دولت آمریکا با کلان جنگید."),
                StoryParagraph("The group became weaker every year.", "گروه هر سال ضعیف‌تر شد."),
                StoryParagraph("Holmes followed the news closely.", "هلمز خبر را از نزدیک دنبال کرد."),
                StoryParagraph("He was glad to see them fall.", "از سقوطشان خوشحال شد."),
                StoryParagraph("He said justice always comes.", "او گفت عدالت همیشه می‌آید."),
                StoryParagraph("Sometimes it takes a long time.", "گاهی وقت زیادی می‌برد."),
                StoryParagraph("But it always comes in the end.", "اما در نهایت همیشه می‌آید."),
                StoryParagraph("Watson agreed with him.", "واتسون با او موافق بود."),
                StoryParagraph("They had seen many bad men fall.", "آن‌ها افتادن مردان بد زیادی را دیده بودند."),
                StoryParagraph("Holmes said the world was still good.", "هلمز گفت دنیا هنوز خوب است."),
                StoryParagraph("There were more good people than bad.", "مردم خوب بیشتر از بد بودند."),
                StoryParagraph("He had faith in human kindness.", "او به مهربانی انسان ایمان داشت."),
                StoryParagraph("Watson admired his friend's hope.", "واتسون به امید دوستش تحسین کرد."),
                StoryParagraph("Holmes said evil never lasts forever.", "هلمز گفت شر هرگز برای همیشه نمی‌ماند."),
                StoryParagraph("Bad men may win for a time.", "مردان بد ممکن است مدتی ببرند."),
                StoryParagraph("But in the end, they fall.", "اما در نهایت، سقوط می‌کنند."),
                StoryParagraph("The rain fell softly outside.", "باران آرام بیرون می‌بارید."),
                StoryParagraph("The fire burned warm in the room.", "آتش گرم در اتاق می‌سوخت."),
                StoryParagraph("And so justice was done.", "و اینگونه عدالت اجرا شد."),
                StoryParagraph("Holmes waited for the next mystery.", "هلمز منتظر معمای بعدی ماند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۴: مرد با لب شکری
    // ═══════════════════════════════════════════════════════
    private fun story44() = StoryContent(
        storyId = "sherlock_twisted_lip",
        chapters = listOf(
            StoryChapter(1, "The Missing Husband", "شوهر گمشده", listOf(
                StoryParagraph("A woman came to see Holmes one evening.", "زنی یک عصر به دیدن هلمز آمد."),
                StoryParagraph("Her name was Mrs. Saint Clair.", "اسمش خانم سنت کلر بود."),
                StoryParagraph("She was very worried about her husband.", "او خیلی نگران شوهرش بود."),
                StoryParagraph("He had gone to London on business.", "او برای کار به لندن رفته بود."),
                StoryParagraph("He had not come home that night.", "آن شب به خانه نیامده بود."),
                StoryParagraph("She had not heard from him since.", "از آن موقع خبری از او نداشت."),
                StoryParagraph("He was a quiet man who loved his family.", "او مردی ساکت بود که خانواده‌اش را دوست داشت."),
                StoryParagraph("His disappearance was very strange.", "ناپدید شدنش خیلی عجیب بود."),
                StoryParagraph("Holmes promised to help her find him.", "هلمز قول داد کمکش کند پیدایش کند."),
                StoryParagraph("He looked at the last place the man was seen.", "او آخرین جایی که مرد دیده شده بود را بررسی کرد."),
                StoryParagraph("It was near the river in East London.", "نزدیک رودخانه در شرق لندن بود."),
                StoryParagraph("The area was dangerous and poor.", "منطقه خطرناک و فقیر بود."),
                StoryParagraph("Holmes decided to go there himself.", "هلمز تصمیم گرفت خودش برود."),
                StoryParagraph("He told Watson to come with him.", "او به واتسون گفت با او بیاید."),
                StoryParagraph("They left for the East End that night.", "آن شب به سمت ایست اند رفتند."),
                StoryParagraph("Holmes went to an opium den.", "هلمز به قلیان‌خانه تریاک رفت."),
                StoryParagraph("It was dark and full of smoke.", "تاریک و پر از دود بود."),
                StoryParagraph("People lay on beds, sleeping.", "مردم روی تخت‌ها دراز کشیده بودند، خواب بودند."),
                StoryParagraph("Holmes looked for the missing man.", "هلمز به دنبال مرد گمشده می‌گشت."),
                StoryParagraph("As he walked out, someone touched his arm.", "وقتی بیرون می‌رفت، کسی بازویش را لمس کرد.")
            )),
            StoryChapter(2, "The Beggar", "گدا", listOf(
                StoryParagraph("It was Mrs. Saint Clair herself.", "خود خانم سنت کلر بود."),
                StoryParagraph("She had come to look for her husband too.", "او هم برای پیدا کردن شوهرش آمده بود."),
                StoryParagraph("She thought her husband was nearby.", "فکر می‌کرد شوهرش نزدیک است."),
                StoryParagraph("Holmes told her to go home and wait.", "هلمز گفت به خانه برود و منتظر بماند."),
                StoryParagraph("Near the opium den lived a beggar.", "نزدیک قلیان‌خانه گدایی زندگی می‌کرد."),
                StoryParagraph("His name was Hugh Boone.", "اسمش هیو بون بود."),
                StoryParagraph("He had a twisted lip and ugly face.", "لب شکری و صورت زشتی داشت."),
                StoryParagraph("People gave him money on the street.", "مردم در خیابان به او پول می‌دادند."),
                StoryParagraph("One day, he was arrested by the police.", "یک روز، پلیس دستگیرش کرد."),
                StoryParagraph("They said he had killed Mr. Saint Clair.", "گفتند آقای سنت کلر را کشته."),
                StoryParagraph("They found blood on his clothes.", "خون روی لباسش پیدا کردند."),
                StoryParagraph("And they found Saint Clair's money on him.", "و پول سنت کلر را رویش یافتند."),
                StoryParagraph("Holmes went to see Boone in prison.", "هلمز به دیدن بون در زندان رفت."),
                StoryParagraph("He looked at the beggar's face closely.", "او با دقت به صورت گدا نگاه کرد."),
                StoryParagraph("He washed the beggar's face with water.", "صورت گدا را با آب شست."),
                StoryParagraph("The ugly makeup came off.", "گریم زشت پاک شد."),
                StoryParagraph("Underneath was the face of Mr. Saint Clair.", "زیرش صورت آقای سنت کلر بود."),
                StoryParagraph("Everyone in the prison was shocked.", "همه در زندان شوکه شدند."),
                StoryParagraph("The missing man was the beggar.", "مرد گمشده همان گدا بود."),
                StoryParagraph("He had been hiding in plain sight.", "او در دید آشکار پنهان شده بود.")
            )),
            StoryChapter(3, "The Secret Life", "زندگی مخفی", listOf(
                StoryParagraph("Mr. Saint Clair told his story.", "آقای سنت کلر داستانش را گفت."),
                StoryParagraph("He had once been a poor actor.", "او زمانی بازیگر فقیری بود."),
                StoryParagraph("He learned to change his face well.", "او یاد گرفت صورتش را خوب تغییر دهد."),
                StoryParagraph("Later, he became a beggar.", "بعداً، گدا شد."),
                StoryParagraph("As a beggar, he earned a lot of money.", "به عنوان گدا، پول زیادی درمی‌آورد."),
                StoryParagraph("He made more money than his real job.", "او بیشتر از شغل واقعی‌اش پول درمی‌آورد."),
                StoryParagraph("So he kept both lives separate.", "پس هر دو زندگی را جدا نگه می‌داشت."),
                StoryParagraph("In the morning, he was a beggar.", "صبح‌ها گدا بود."),
                StoryParagraph("In the evening, he was a family man.", "عصرها مرد خانواده بود."),
                StoryParagraph("His wife never knew the truth.", "همسرش هرگز حقیقت را نمی‌دانست."),
                StoryParagraph("One day, he fell from a window.", "یک روز، از پنجره‌ای افتاد."),
                StoryParagraph("He was hurt and went to the opium den.", "او زخمی شد و به قلیان‌خانه رفت."),
                StoryParagraph("He stayed there to hide his wounds.", "آنجا ماند تا زخم‌هایش را پنهان کند."),
                StoryParagraph("The police found him there later.", "پلیس بعداً پیدایش کرد."),
                StoryParagraph("They thought he had killed someone.", "فکر کردند کسی را کشته."),
                StoryParagraph("But he had only hurt himself.", "اما فقط خودش را زخمی کرده بود."),
                StoryParagraph("The blood was from his own wound.", "خون از زخم خودش بود."),
                StoryParagraph("The money was his own savings.", "پول پس‌انداز خودش بود."),
                StoryParagraph("He was innocent of any crime.", "او از هر جنایتی بی‌گناه بود."),
                StoryParagraph("Holmes listened in silence.", "هلمز در سکوت گوش داد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("Mrs. Saint Clair heard the truth.", "خانم سنت کلر حقیقت را شنید."),
                StoryParagraph("She was shocked and hurt.", "او شوکه و دل‌شکسته شد."),
                StoryParagraph("But she still loved him.", "اما هنوز دوستش داشت."),
                StoryParagraph("She thought about their children.", "به فرزندانشان فکر کرد."),
                StoryParagraph("In the end, she chose to forgive.", "در نهایت، بخشیدن را انتخاب کرد."),
                StoryParagraph("She asked him to stop begging.", "او خواست گدایی را متوقف کند."),
                StoryParagraph("He promised never to do it again.", "او قول داد دیگر انجامش ندهد."),
                StoryParagraph("They moved to a new house.", "آن‌ها به خانه جدیدی نقل مکان کردند."),
                StoryParagraph("They started their life again.", "زندگی‌شان را دوباره شروع کردند."),
                StoryParagraph("The children grew up happy.", "بچه‌ها خوشحال بزرگ شدند."),
                StoryParagraph("Watson asked Holmes about the case.", "واتسون از هلمز درباره پرونده پرسید."),
                StoryParagraph("Holmes said it was about two lives.", "هلمز گفت درباره دو زندگی بود."),
                StoryParagraph("A man can live two different lives.", "یک مرد می‌تواند دو زندگی متفاوت داشته باشد."),
                StoryParagraph("But the truth always comes out.", "اما حقیقت همیشه بیرون می‌آید."),
                StoryParagraph("Watson asked why he kept it secret.", "واتسون پرسید چرا پنهانش کرد."),
                StoryParagraph("Holmes said the family was more important.", "هلمز گفت خانواده مهم‌تر بود."),
                StoryParagraph("Justice is not always punishment.", "عدالت همیشه مجازات نیست."),
                StoryParagraph("Sometimes it is mercy.", "گاهی بخشش است."),
                StoryParagraph("And so the case was closed.", "و اینگونه پرونده بسته شد."),
                StoryParagraph("Holmes waited for the next mystery.", "هلمز منتظر معمای بعدی ماند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۵: انگشت شست مهندس
    // ═══════════════════════════════════════════════════════
    private fun story45() = StoryContent(
        storyId = "sherlock_engineers_thumb",
        chapters = listOf(
            StoryChapter(1, "The Wounded Man", "مرد زخمی", listOf(
                StoryParagraph("A young man came to Watson's office.", "مرد جوانی به مطب واتسون آمد."),
                StoryParagraph("His name was Victor Hatherley.", "اسمش ویکتور هترلی بود."),
                StoryParagraph("He was an engineer by profession.", "او مهندس بود."),
                StoryParagraph("His hand was covered in blood.", "دستش پوشیده از خون بود."),
                StoryParagraph("His thumb had been cut off.", "شستش بریده شده بود."),
                StoryParagraph("Watson treated the wound at once.", "واتسون فوراً زخم را درمان کرد."),
                StoryParagraph("Then he asked what had happened.", "بعد پرسید چه اتفاقی افتاده."),
                StoryParagraph("Victor told him a strange story.", "ویکتور داستان عجیبی برایش گفت."),
                StoryParagraph("The night before, a man had come to him.", "شب قبل، مردی به دیدنش آمده بود."),
                StoryParagraph("The man offered him a job.", "مرد کاری به او پیشنهاد داد."),
                StoryParagraph("The job paid very well.", "کار پول خیلی خوبی می‌داد."),
                StoryParagraph("Victor agreed to go with him.", "ویکتور موافقت کرد با او برود."),
                StoryParagraph("They traveled far into the countryside.", "آن‌ها دور به حومه سفر کردند."),
                StoryParagraph("They reached a lonely house at night.", "شب به خانه‌ای دورافتاده رسیدند."),
                StoryParagraph("Inside was a strange machine.", "داخلش ماشین عجیبی بود."),
                StoryParagraph("The man asked Victor to fix it.", "مرد از ویکتور خواست تعمیرش کند."),
                StoryParagraph("Victor worked on it for hours.", "ویکتور ساعت‌ها رویش کار کرد."),
                StoryParagraph("Then he discovered a terrible secret.", "بعد راز وحشتناکی کشف کرد."),
                StoryParagraph("He tried to escape but was attacked.", "تلاش کرد فرار کند اما مورد حمله قرار گرفت."),
                StoryParagraph("He jumped from a window and ran.", "از پنجره پرید و دوید.")
            )),
            StoryChapter(2, "The Strange Job", "کار عجیب", listOf(
                StoryParagraph("The man was named Colonel Lysander Stark.", "مرد سرهنگ لایسندر استارک نام داشت."),
                StoryParagraph("He said he needed a hydraulic press fixed.", "او گفت نیاز به تعمیر پرس هیدرولیکی دارد."),
                StoryParagraph("He offered fifty guineas for the job.", "برای کار پنجاه گینی پیشنهاد داد."),
                StoryParagraph("That was a huge amount of money.", "آن مبلغ خیلی زیادی بود."),
                StoryParagraph("Victor needed the money badly.", "ویکتور به شدت به پول نیاز داشت."),
                StoryParagraph("So he agreed to go that night.", "پس موافقت کرد آن شب برود."),
                StoryParagraph("They arrived at a small, dark house.", "آن‌ها به خانه‌ای کوچک و تاریک رسیدند."),
                StoryParagraph("Inside, the machine was in a back room.", "داخل، ماشین در اتاق پشتی بود."),
                StoryParagraph("The machine pressed metal into small bars.", "ماشین فلز را به میله‌های کوچک فشار می‌داد."),
                StoryParagraph("Victor noticed the bars were not metal.", "ویکتور متوجه شد میله‌ها فلز نیستند."),
                StoryParagraph("They looked like gold or silver.", "شبیه طلا یا نقره بودند."),
                StoryParagraph("He began to fix the machine carefully.", "او شروع کرد با دقت تعمیر ماشین کند."),
                StoryParagraph("Stark watched him the whole time.", "استارک تمام مدت تماشایش می‌کرد."),
                StoryParagraph("Victor felt something was wrong.", "ویکتور احساس کرد چیزی اشتباه است."),
                StoryParagraph("A woman was whispering behind the wall.", "زنی پشت دیوار زمزمه می‌کرد."),
                StoryParagraph("She told him to run away at once.", "او گفت فوراً فرار کند."),
                StoryParagraph("She said the men would kill him.", "گفت مردان می‌کشندش."),
                StoryParagraph("The machine started to move toward him.", "ماشین شروع کرد به حرکت به سمتش."),
                StoryParagraph("The walls were closing in.", "دیوارها داشتند به هم می‌رسیدند."),
                StoryParagraph("Victor ran to the window and jumped.", "ویکتور به سمت پنجره دوید و پرید.")
            )),
            StoryChapter(3, "The Counterfeiters", "جعل‌کنندگان", listOf(
                StoryParagraph("Stark caught Victor's hand.", "استارک دست ویکتور را گرفت."),
                StoryParagraph("He cut off Victor's thumb with a knife.", "او با چاقو شست ویکتور را برید."),
                StoryParagraph("Then Victor escaped into the night.", "بعد ویکتور به شب فرار کرد."),
                StoryParagraph("Victor went to the police at once.", "ویکتور فوراً به پلیس رفت."),
                StoryParagraph("He told them everything that happened.", "او همه چیز را که اتفاق افتاده بود گفت."),
                StoryParagraph("The police went to the house with him.", "پلیس با او به خانه رفت."),
                StoryParagraph("But the house was empty.", "اما خانه خالی بود."),
                StoryParagraph("The machine and the men were gone.", "ماشین و مردان رفته بودند."),
                StoryParagraph("The police did not believe Victor.", "پلیس ویکتور را باور نکرد."),
                StoryParagraph("They thought he had made up the story.", "فکر کردند داستان را ساخته."),
                StoryParagraph("Victor went to see Holmes for help.", "او برای کمک به دیدن هلمز رفت."),
                StoryParagraph("Holmes listened to the whole story.", "هلمز کل داستان را گوش داد."),
                StoryParagraph("He asked Victor about the woman.", "او از ویکتور درباره زن پرسید."),
                StoryParagraph("Victor said she had a German accent.", "ویکتور گفت لهجه آلمانی داشت."),
                StoryParagraph("Holmes looked up records of the house.", "او سوابق خانه را بررسی کرد."),
                StoryParagraph("The house had been rented by a German man.", "خانه توسط مردی آلمانی اجاره شده بود."),
                StoryParagraph("The man had left suddenly the night before.", "مرد شب قبل ناگهان رفته بود."),
                StoryParagraph("Holmes discovered the truth.", "هلمز حقیقت را کشف کرد."),
                StoryParagraph("The men were counterfeiters.", "مردان جعل‌کننده پول بودند."),
                StoryParagraph("They made fake gold coins.", "آن‌ها سکه‌های طلای جعلی می‌ساختند.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("They needed an engineer to fix the machine.", "آن‌ها به مهندسی برای تعمیرش نیاز داشتند."),
                StoryParagraph("But they did not want to be caught.", "اما نمی‌خواستند دستگیر شوند."),
                StoryParagraph("So they planned to kill Victor.", "پس نقشه کشیدند ویکتور را بکشند."),
                StoryParagraph("The woman in the house was Stark's wife.", "زن در خانه همسر استارک بود."),
                StoryParagraph("She felt sorry for Victor.", "او برای ویکتور دلش سوخت."),
                StoryParagraph("So she warned him to run.", "پس هشدارش داد فرار کند."),
                StoryParagraph("Thanks to her, Victor escaped.", "به لطف او، ویکتور فرار کرد."),
                StoryParagraph("Holmes searched for the counterfeiters.", "هلمز به دنبال جعل‌کنندگان گشت."),
                StoryParagraph("But they had left the country.", "اما آن‌ها کشور را ترک کرده بودند."),
                StoryParagraph("They went back to Germany.", "آن‌ها به آلمان برگشتند."),
                StoryParagraph("Victor lost his thumb that night.", "ویکتور آن شب شستش را از دست داد."),
                StoryParagraph("But he gained a new respect for life.", "اما احترام جدیدی برای زندگی به دست آورد."),
                StoryParagraph("He stopped chasing easy money.", "او دست از دنبال کردن پول آسان کشید."),
                StoryParagraph("He worked hard at his real job.", "او در شغل واقعی‌اش سخت کار کرد."),
                StoryParagraph("He became a successful engineer.", "او مهندس موفقی شد."),
                StoryParagraph("Watson asked Holmes about the case.", "واتسون از هلمز درباره پرونده پرسید."),
                StoryParagraph("Holmes said it was a warning.", "هلمز گفت هشداری بود."),
                StoryParagraph("Easy money often brings danger.", "پول آسان اغلب خطر می‌آورد."),
                StoryParagraph("And so justice was done.", "و اینگونه عدالت اجرا شد."),
                StoryParagraph("Holmes waited for the next mystery.", "هلمز منتظر معمای بعدی ماند.")
            ))
        )
    )
} 