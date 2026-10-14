package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * ۲۳. مرگ در ونیز — توماس مان
 */
object Story23 {

    fun get(): StoryContent = StoryContent(
        storyId = "adv_death_in_venice",
        chapters = listOf(
            chapter1(),
            chapter2(),
            chapter3(),
            chapter4(),
            chapter5(),
            chapter6(),
        )
    )

    // ─────────── فصل ۱: نویسنده ───────────
    private fun chapter1() = StoryChapter(
        number = 1, title = "The Writer", titlePersian = "نویسنده",
        paragraphs = listOf(
            StoryParagraph("Gustav von Aschenbach was a writer, and he was famous, and he was tired.", "گوستاو فون آشنباخ نویسنده بود و مشهور بود و خسته بود."),
            StoryParagraph("He had been writing for forty years, and his reputation was immense, and his discipline was legendary.", "چهل سال بود که می‌نوشت و شهرتش عظیم بود و انضباطش افسانه‌ای."),
            StoryParagraph("He was born in a small town in Silesia, the son of a judge, the descendant of a long line of Prussian officials.", "در شهرکی در سیلزی زاده شد، پسر قاضی، از نوادگان سلسله‌ای طولانی از مقامات پروسی."),
            StoryParagraph("His father had taught him the virtues of duty, of discipline, of self-control; his mother, of Bohemian blood, had given him the gift of art.", "پدرش به او فضیلت‌های وظیفه آموخته بود، انضباط، خویشتن‌داری؛ مادرش، از تبار بوهمی، موهبت هنر را به او داده بود."),
            StoryParagraph("He had become, over the years, a kind of monument; his name was spoken with reverence; his works were studied in schools.", "در طول سال‌ها به نوعی یادبود تبدیل شده بود؛ نامش با احترام برده می‌شد؛ آثارش در مدارس مطالعه می‌شدند."),
            StoryParagraph("He had received honors, prizes, decorations; he had been made a nobleman; he had dined with kings and presidents.", "افتخارات دریافت کرده بود، جوایز، نشان‌ها؛ نجیب‌زاده شده بود؛ با شاهان و رؤسا شام خورده بود."),
            StoryParagraph("But fame had not made him happy; fame had only made him more aware of his limitations, more conscious of the distance between what he had achieved and what he had dreamed.", "اما شهرت خوشحالش نکرده بود؛ شهرت تنها او را آگاه‌تر کرده بود از محدودیت‌هایش، آگاه‌تر از فاصله میان آنچه به دست آورده و آنچه در خواب دیده بود."),
            StoryParagraph("He was fifty years old, and he was alone, and he had never married, and he had never loved.", "پنجاه ساله بود و تنها بود و هرگز ازدواج نکرده بود و هرگز عشق نورزیده بود."),
            StoryParagraph("He had given his life to his work; he had sacrificed everything for his art; and now, in middle age, he wondered if the sacrifice had been worth it.", "زندگی‌اش را به کارش داده بود؛ همه چیز را برای هنرش فدا کرده بود؛ و حالا، در میانه عمر، حیران بود آیا این فداکاری ارزشش را داشته."),
            StoryParagraph("His health was fragile; his nerves were strained; his doctor had told him to rest, to travel, to seek a change of scene.", "سلامتش شکننده بود؛ اعصابش خسته بود؛ دکترش به او گفته بود استراحت کند، سفر کند، به دنبال تغییر صحنه باشد."),
            StoryParagraph("And so, one spring morning, Aschenbach left his apartment in Munich and boarded a train for the south.", "و اینگونه، یک صبح بهاری، آشنباخ آپارتمانش را در مونیخ ترک کرد و سوار قطاری به سمت جنوب شد."),
            StoryParagraph("He had no plan, no destination, no purpose beyond the vague desire to see something different, to feel something different.", "نقشه‌ای نداشت، نه مقصدی، نه هدفی، جز میل مبهم به دیدن چیز متفاوتی، به حس کردن چیز متفاوتی."),
            StoryParagraph("He traveled through Austria, through the Alps, through the green valleys of the Tyrol.", "از اتریش گذشت، از آلپ، از دره‌های سبز تیرول."),
            StoryParagraph("The mountains rose around him, cold and eternal, and he felt, for the first time in years, a kind of peace.", "کوه‌ها دورش برخاستند، سرد و ابدی و برای نخستین بار در سال‌ها، نوعی آرامش حس کرد."),
            StoryParagraph("But the peace did not last; the restlessness returned; the hunger for something he could not name drove him on.", "اما آرامش دوام نیاورد؛ بی‌قراری بازگشت؛ گرسنگی برای چیزی که نمی‌توانست نامش را ببرد او را به جلو راند."),
            StoryParagraph("He came to Trieste, and then to Pola, and then, on a whim, to Venice.", "به تریسته رسید و بعد به پولا و بعد، بنا به هوسی، به ونیز."),
            StoryParagraph("Venice was a city he had visited before, in his youth, and he had loved it then, and he had feared it then.", "ونیز شهری بود که قبلاً در جوانی دیده بود و آن موقع دوستش داشته و آن موقع از آن ترسیده بود."),
            StoryParagraph("He had loved its beauty, its strangeness, its air of decay; he had feared its sensuality, its danger, its invitation to abandon all discipline.", "زیبایی‌اش را دوست داشته، غرابتش، هوای پوسیدگی‌اش؛ حسی‌اش را ترسیده، خطرش، دعوتش به رها کردن همه انضباط."),
            StoryParagraph("He had sworn, in his youth, never to return; but now, in middle age, tired and uncertain, he found himself drawn back.", "در جوانی قسم خورده بود هرگز برنگردد؛ اما حالا، در میانه عمر، خسته و نامطمئن، خود را به بازگشت کشیده یافت."),
            StoryParagraph("He took a boat from the station to the Lido, and as the boat crossed the lagoon, he saw the city rise from the water.", "از ایستگاه قایقی به لیدو گرفت و همانطور که قایق از تالاب می‌گذشت، شهر را دید که از آب برمی‌خاست."),
            StoryParagraph("It was as he remembered it: beautiful, decaying, seductive, dangerous.", "همان بود که به یاد داشت: زیبا، پوسیده، اغواگر، خطرناک."),
            StoryParagraph("And somewhere in the depths of his being, something stirred, something he had long suppressed, something he had refused to acknowledge.", "و جایی در اعماق وجودش، چیزی تکان خورد، چیزی که مدت‌ها سرکوبش کرده بود، چیزی که از اعتراف به آن امتناع کرده بود."),
            StoryParagraph("He did not know what it was; he did not want to know what it was; he only knew that something had changed, and that the change was irreversible.", "نمی‌دانست چیست؛ نمی‌خواست بداند چیست؛ تنها می‌دانست چیزی تغییر کرده و تغییر برگشت‌ناپذیر بود.")
        )
    )

    // ─────────── فصل ۲: تادزیو ───────────
    private fun chapter2() = StoryChapter(
        number = 2, title = "Tadzio", titlePersian = "تادزیو",
        paragraphs = listOf(
            StoryParagraph("Aschenbach checked into the Hotel des Bains, one of the grandest hotels on the Lido, and he took a room on the third floor, with a balcony overlooking the sea.", "آشنباخ در هتل د بن، یکی از باشکوه‌ترین هتل‌های لیدو اقامت کرد و اتاقی در طبقه سوم گرفت، با بالکنی مشرف به دریا."),
            StoryParagraph("The hotel was full of guests: aristocrats, artists, businessmen, families, tourists from every corner of Europe.", "هتل پر از مهمان بود: اشراف، هنرمندان، تاجران، خانواده‌ها، گردشگران از هر گوشه اروپا."),
            StoryParagraph("Among them was a Polish family: a mother, a governess, and three children.", "میانشان خانواده‌ای لهستانی بود: مادری، معلم سرخانه و سه فرزند."),
            StoryParagraph("The eldest child was a boy of about fourteen, and his name was Tadzio.", "بزرگ‌ترین فرزند پسری حدوداً چهارده ساله بود و نامش تادزیو."),
            StoryParagraph("Aschenbach first saw him in the dining room, at breakfast, on his second morning at the hotel.", "آشنباخ نخستین بار او را در اتاق غذاخوری، هنگام صبحانه، در دومین صبحش در هتل دید."),
            StoryParagraph("The boy was standing by the window, in the morning light, and the light seemed to gather around him, seemed to shine from him.", "پسر کنار پنجره ایستاده بود، در نور صبح و نور به نظر می‌رسید دورش جمع می‌شود، به نظر می‌رسید از او می‌تابد."),
            StoryParagraph("His face was beautiful, in a way that Aschenbach had rarely seen; not the beauty of a child, not the beauty of a man, but something in between.", "صورتش زیبا بود، به شیوه‌ای که آشنباخ به‌ندرت دیده بود؛ نه زیبایی بچه، نه زیبایی مرد، بلکه چیزی در میان."),
            StoryParagraph("His hair was dark and curly, falling over his forehead; his skin was pale, like marble; his eyes were grey-blue, like the sea.", "موهایش تیره و فر بود، روی پیشانی‌اش می‌ریخت؛ پوستش رنگ‌پریده بود، چون مرمر؛ چشمانش خاکستری-آبی، چون دریا."),
            StoryParagraph("He was dressed simply, in a sailor suit, and he stood with an unconscious grace that seemed to Aschenbach to be a gift from the gods.", "ساده لباس پوشیده بود، با یونیفرم ملوانی و با ظرافتی ناخودآگاه ایستاده بود که به نظر آشنباخ موهبتی از خدایان بود."),
            StoryParagraph("Aschenbach looked at him, and something happened inside him, something he could not explain.", "آشنباخ نگاهش کرد و چیزی درونش اتفاق افتاد، چیزی که نمی‌توانست توضیح دهد."),
            StoryParagraph("It was not desire, exactly; it was not love, exactly; it was something older, something purer, something more dangerous.", "دقیقاً میل نبود؛ دقیقاً عشق نبود؛ چیزی کهن‌تر بود، پاک‌تر، خطرناک‌تر."),
            StoryParagraph("It was the beauty of the boy, and the beauty of the morning, and the beauty of Venice, all together, overwhelming him.", "زیبایی پسر بود و زیبایی صبح و زیبایی ونیز، همه با هم، بر او غلبه می‌کرد."),
            StoryParagraph("Aschenbach, who had spent his life in the pursuit of form, of discipline, of control, felt himself losing control.", "آشنباخ که عمرش را در جستجوی فرم گذرانده بود، انضباط، کنترل، خود را در حال از دست دادن کنترل حس کرد."),
            StoryParagraph("He tried to look away, but he could not; he tried to think of something else, but he could not; he tried to be the man he had always been, but he could not.", "تلاش کرد روی برگرداند اما نتوانست؛ تلاش کرد به چیز دیگری فکر کند اما نتوانست؛ تلاش کرد همان مردی باشد که همیشه بوده اما نتوانست."),
            StoryParagraph("And so, for the first time in his life, Aschenbach allowed himself to look — truly look — at beauty, and to be overcome by it.", "و اینگونه، برای نخستین بار در زندگی‌اش، آشنباخ به خودش اجازه داد نگاه کند — واقعاً نگاه کند — به زیبایی و مغلوبش شود."),
            StoryParagraph("He watched the boy throughout the day: on the beach, in the garden, in the dining room.", "تمام روز پسر را تماشا کرد: در ساحل، در باغ، در اتاق غذاخوری."),
            StoryParagraph("He watched him play with his sisters, watched him run, watched him swim.", "تماشا کرد که با خواهرهایش بازی می‌کند، تماشا کرد که می‌دود، تماشا کرد که شنا می‌کند."),
            StoryParagraph("He watched him from a distance, never approaching, never speaking, never letting the boy know that he was being watched.", "از دور تماشایش کرد، هرگز نزدیک نشد، هرگز صحبت نکرد، هرگز نگذاشت پسر بداند که تماشا می‌شود."),
            StoryParagraph("It was a kind of worship, Aschenbach realized; it was a kind of prayer.", "آشنباخ دریافت، نوعی پرستش بود؛ نوعی دعا."),
            StoryParagraph("He was worshipping the boy, as the ancients had worshipped their gods, as the Greeks had worshipped beauty.", "پسر را می‌پرستید، همانطور که پیشینیان خدایانشان را می‌پرستیدند، همانطور که یونانیان زیبایی را."),
            StoryParagraph("And like all worship, it was both sacred and dangerous; it was both an elevation and a fall.", "و همچون همه پرستش، هم مقدس بود و هم خطرناک؛ هم تعالی بود و هم سقوط."),
            StoryParagraph("Aschenbach did not know which it would be for him; he only knew that he had crossed a line, and that there was no going back.", "آشنباخ نمی‌دانست برایش کدام خواهد بود؛ تنها می‌دانست از خطی گذشته و بازگشتی نیست."),
            StoryParagraph("He had come to Venice to rest, to recover, to be the man he had always been.", "به ونیز آمده بود تا استراحت کند، بهبود یابد، همان مردی باشد که همیشه بوده."),
            StoryParagraph("But Venice had other plans for him; Venice was a city of masks, of illusions, of transformations; and Aschenbach was about to be transformed.", "اما ونیز نقشه‌های دیگری برایش داشت؛ ونیز شهری بود از نقاب‌ها، از توهمات، از دگرگونی‌ها؛ و آشنباخ در شرف دگرگون شدن بود."),
            StoryParagraph("He did not know it yet; but he would learn; and the learning would cost him everything.", "هنوز نمی‌دانست؛ اما می‌آموخت؛ و یادگیری همه چیز را برایش هزینه می‌کرد.")
        )
    )

    // ─────────── فصل ۳: تعقیب ───────────
    private fun chapter3() = StoryChapter(
        number = 3, title = "The Pursuit", titlePersian = "تعقیب",
        paragraphs = listOf(
            StoryParagraph("In the days that followed, Aschenbach devoted himself entirely to watching the boy.", "در روزهای بعد، آشنباخ خودش را کاملاً وقف تماشای پسر کرد."),
            StoryParagraph("He woke early, so as not to miss the boy at breakfast; he stayed on the beach until the boy left; he lingered in the lobby in the evenings, hoping for a glimpse.", "زود بیدار می‌شد، تا در صبحانه پسر را از دست ندهد؛ در ساحل می‌ماند تا پسر برود؛ عصرها در لابی می‌ماند، به امید یک نگاه."),
            StoryParagraph("He learned the boy's routine: when he woke, when he swam, when he walked, when he slept.", "روتین پسر را یاد گرفت: کی بیدار می‌شد، کی شنا می‌کرد، کی قدم می‌زد، کی می‌خوابید."),
            StoryParagraph("He learned the boy's family: the mother, a Polish countess; the sisters, quiet and well-mannered; the governess, strict and watchful.", "خانواده پسر را شناخت: مادر، کنتسی لهستانی؛ خواهرها، ساکت و مؤدب؛ معلم سرخانه، سختگیر و مراقب."),
            StoryParagraph("He learned the boy's name: Tadzio, a Polish diminutive of Tadeusz, a name that meant 'brave heart.'", "نام پسر را دانست: تادزیو، تصغیر لهستانی تادئوش، نامی که یعنی «قلب شجاع»."),
            StoryParagraph("He whispered the name to himself, in the dark of his room, and it was like a prayer, and it was like a sin.", "نام را در تاریکی اتاقش برای خودش زمزمه کرد و مثل دعا بود و مثل گناه."),
            StoryParagraph("He began to follow the boy, discreetly, from a distance, around the island.", "شروع کرد به دنبال کردن پسر، با احتیاط، از دور، دور جزیره."),
            StoryParagraph("He followed him to the beach, to the piazza, to the church of Santa Maria della Salute; he followed him through the narrow streets, over the bridges, into the markets.", "دنبالش به ساحل، به پیاتزا، به کلیسای سانتا ماریا دلا سالوته؛ در خیابان‌های باریک، روی پل‌ها، به بازارها."),
            StoryParagraph("He never spoke to him; he never approached him; he was content to watch, to admire, to worship from afar.", "هرگز با او صحبت نکرد؛ هرگز نزدیک نشد؛ راضی بود تماشا کند، تحسین کند، از دور پرستش کند."),
            StoryParagraph("But even watching, even admiring, even worshipping from afar, was dangerous; for the more he watched, the more he wanted.", "اما حتی تماشا کردن، حتی تحسین کردن، حتی پرستش از دور، خطرناک بود؛ زیرا هرچه بیشتر تماشا می‌کرد، بیشتر می‌خواست."),
            StoryParagraph("He wanted to touch the boy; he wanted to speak to him; he wanted to be near him, to be with him, to be part of his life.", "می‌خواست لمسش کند؛ می‌خواست با او صحبت کند؛ می‌خواست نزدیکش باشد، با او باشد، بخشی از زندگی‌اش باشد."),
            StoryParagraph("But he could not; he knew he could not; he knew that such desires were forbidden, dangerous, destructive.", "اما نمی‌توانست؛ می‌دانست نمی‌تواند؛ می‌دانست چنین امیالی ممنوعند، خطرناک، ویران‌گر."),
            StoryParagraph("And so he contented himself with watching; and the watching became an obsession; and the obsession became his life.", "و اینگونه به تماشا کردن قانع شد؛ و تماشا کردن وسواس شد؛ و وسواس زندگی‌اش شد."),
            StoryParagraph("He stopped working; he stopped reading; he stopped writing letters; he stopped caring about anything except the boy.", "از کار دست کشید؛ از خواندن؛ از نوشتن نامه؛ از اهمیت دادن به هر چیزی جز پسر."),
            StoryParagraph("The boy, meanwhile, seemed unaware of Aschenbach's attention; or perhaps he was aware, and chose to pretend he was not.", "پسر در همین حال، به نظر می‌رسید از توجه آشنباخ بی‌خبر است؛ یا شاید آگاه بود و انتخاب کرده بود تظاهر کند آگاه نیست."),
            StoryParagraph("Sometimes, when Aschenbach watched him, the boy would look up, and their eyes would meet, and something would pass between them.", "گاهی، وقتی آشنباخ تماشایش می‌کرد، پسر سر بلند می‌کرد و چشمانشان به هم می‌رسید و چیزی میانشان رد می‌شد."),
            StoryParagraph("It was not a look of recognition; it was not a look of invitation; it was simply a look, a moment of contact, a brief acknowledgement.", "نگاه شناخت نبود؛ نگاه دعوت نبود؛ تنها نگاهی بود، لحظه‌ای ارتباط، اقرار کوتاهی."),
            StoryParagraph("And yet, for Aschenbach, those moments were everything; those moments were the only moments in which he felt truly alive.", "و با این حال، برای آشنباخ، آن لحظه‌ها همه چیز بودند؛ آن لحظه‌ها تنها لحظه‌هایی بودند که به‌راستی زنده حس می‌کرد."),
            StoryParagraph("He began to dress more carefully, more youthfully; he began to dye his hair; he began to use cosmetics.", "شروع کرد با دقت بیشتری لباس پوشیدن، جوان‌تر؛ شروع کرد موهایش را رنگ کردن؛ شروع کرد آرایش استفاده کردن."),
            StoryParagraph("He wanted, desperately, impossibly, to be young again, to be beautiful again, to be worthy of the boy's attention.", "می‌خواست، ناامیدانه، ناممکن، دوباره جوان باشد، دوباره زیبا، سزاوار توجه پسر."),
            StoryParagraph("He was sixty years old, or nearly so; he was a famous writer, a respected man, a monument of German letters.", "شصت ساله بود، یا نزدیکش؛ نویسنده‌ای مشهور، مردی محترم، یادبودی از ادبیات آلمان."),
            StoryParagraph("And he was making a fool of himself, for a boy; and he knew it; and he could not stop.", "و داشت خودش را برای پسری لودگی می‌کرد؛ و می‌دانست؛ و نمی‌توانست متوقف شود."),
            StoryParagraph("The pursuit continued, day after day, week after week; the pursuit was now his only purpose, his only meaning, his only life.", "تعقیب ادامه یافت، روز پس از روز، هفته پس از هفته؛ تعقیب حالا تنها هدفش بود، تنها معنایش، تنها زندگی‌اش."),
            StoryParagraph("And then, one day, Aschenbach made a decision; he decided that he would leave Venice, that he would tear himself away, that he would save himself.", "و بعد، یک روز، آشنباخ تصمیمی گرفت؛ تصمیم گرفت ونیز را ترک کند، خودش را جدا کند، خودش را نجات دهد."),
            StoryParagraph("He packed his bags, and he called for a porter, and he went down to the lobby to check out.", "چمدان‌هایش را بست و باربری خبر کرد و به لابی رفت تا تسویه کند."),
            StoryParagraph("But at the last moment, at the very last moment, he could not do it; he could not leave; he could not abandon the boy.", "اما در آخرین لحظه، در همان آخرین لحظه، نتوانست؛ نمی‌توانست برود؛ نمی‌توانست پسر را رها کند."),
            StoryParagraph("He told the porter to take his bags back upstairs; he told the clerk that he had changed his mind; he stayed.", "به باربر گفت چمدان‌ها را به بالا برگرداند؛ به کارمند گفت نظرش عوض شده؛ ماند."),
            StoryParagraph("It was the moment of his fall, though he did not know it yet; it was the moment when he chose beauty over duty, passion over discipline, death over life.", "لحظه سقوطش بود، هرچند هنوز نمی‌دانست؛ لحظه‌ای بود که زیبایی را بر وظیفه برگزید، شور را بر انضباط، مرگ را بر زندگی."),
            StoryParagraph("And from that moment on, there was no turning back; from that moment on, Aschenbach belonged to Venice, and to the boy, and to his own destruction.", "و از آن لحظه به بعد، بازگشتی نبود؛ از آن لحظه به بعد، آشنباخ به ونیز تعلق داشت و به پسر و به نابودی خودش."),
            StoryParagraph("He did not know it yet; but he would learn; and the learning would be terrible, and the learning would be beautiful.", "هنوز نمی‌دانست؛ اما می‌آموخت؛ و یادگیری هولناک می‌بود و یادگیری زیبا.")
        )
    )

    // ─────────── فصل ۴: طاعون ───────────
    private fun chapter4() = StoryChapter(
        number = 4, title = "The Plague", titlePersian = "طاعون",
        paragraphs = listOf(
            StoryParagraph("Venice, that summer, was not the city it appeared to be.", "ونیز، آن تابستان، شهری نبود که به نظر می‌رسید."),
            StoryParagraph("Beneath the beauty, beneath the glitter, beneath the laughter, something was wrong; something was dying; something was spreading.", "زیر زیبایی، زیر درخشش، زیر خنده، چیزی اشتباه بود؛ چیزی می‌مرد؛ چیزی پخش می‌شد."),
            StoryParagraph("The canals smelled worse than usual; the air was heavier; the people were paler, thinner, more afraid.", "کانال‌ها بدتر از معمول بو می‌دادند؛ هوا سنگین‌تر بود؛ مردم رنگ‌پریده‌تر، لاغرتر، ترسیده‌تر."),
            StoryParagraph("There were rumors of a disease, of a plague, of a cholera that had come from the east.", "شایعاتی از بیماری بود، از طاعون، از وبایی که از شرق آمده بود."),
            StoryParagraph("The authorities denied everything; the authorities wanted nothing to disturb the tourist season; the authorities lied.", "مقامات همه چیز را انکار کردند؛ مقامات نمی‌خواستند چیزی فصل توریستی را مختل کند؛ مقامات دروغ گفتند."),
            StoryParagraph("The newspapers printed nothing; the doctors were warned to be silent; the hotels were warned to keep their guests.", "روزنامه‌ها چیزی چاپ نکردند؛ دکترها هشدار داده شدند ساکت باشند؛ هتل‌ها هشدار داده شدند مهمانانشان را نگه دارند."),
            StoryParagraph("But Aschenbach, who had learned to watch, who had learned to notice, who had learned to see, began to understand.", "اما آشنباخ که یاد گرفته بود تماشا کند، یاد گرفته بود متوجه شود، یاد گرفته بود ببیند، شروع کرد به فهمیدن."),
            StoryParagraph("He saw the officials huddling together; he saw the doctors running at night; he saw the bodies being carried away in secret.", "مقامات را دید که با هم جمع می‌شوند؛ دکترها را دید که شب‌ها می‌دوند؛ جسدها را دید که مخفیانه برده می‌شوند."),
            StoryParagraph("He smelled the disinfectant, that smell of chlorine and lime, that smell of death concealed.", "بوی مواد ضدعفونی‌کننده را حس کرد، آن بوی کلر و آهک، آن بوی مرگ پنهان."),
            StoryParagraph("He knew, now, that the plague had come to Venice; he knew that it was spreading; he knew that it would kill many.", "حالا می‌دانست که طاعون به ونیز آمده؛ می‌دانست که در حال انتشار است؛ می‌دانست که بسیاری را می‌کشد."),
            StoryParagraph("And he knew that he should warn the boy's family; he knew that he should tell them to leave; he knew that he should save them, if he could.", "و می‌دانست باید به خانواده پسر هشدار دهد؛ می‌دانست باید بگوید بروند؛ می‌دانست باید نجاتشان دهد، اگر می‌توانست."),
            StoryParagraph("But he did not; he could not; he could not bear the thought of the boy leaving, of the boy disappearing from his life, of the boy being lost to him forever.", "اما نکرد؛ نمی‌توانست؛ نمی‌توانست فکر رفتن پسر را تحمل کند، ناپدید شدن پسر از زندگی‌اش، از دست رفتن پسر برای همیشه."),
            StoryParagraph("And so he kept silent; and his silence was a sin; and his sin was unforgivable.", "و اینگونه سکوت کرد؛ و سکوتش گناه بود؛ و گناهش غیرقابل بخشش."),
            StoryParagraph("He chose the boy's presence over the boy's safety; he chose his own desire over the boy's life; he chose beauty over duty, once again, and always.", "حضور پسر را بر امنیت پسر برگزید؛ میل خودش را بر جان پسر؛ زیبایی را بر وظیفه، بار دیگر، و همیشه."),
            StoryParagraph("The summer grew hotter; the plague grew worse; the tourists began to leave.", "تابستان گرم‌تر شد؛ طاعون بدتر شد؛ توریست‌ها شروع کردند به رفتن."),
            StoryParagraph("But the Polish family stayed; they did not know what was happening; they had not been warned.", "اما خانواده لهستانی ماندند؛ نمی‌دانستند چه می‌گذرد؛ به آن‌ها هشدار داده نشده بود."),
            StoryParagraph("And Aschenbach stayed too; he stayed to be near the boy; he stayed though he knew it might kill him; he stayed though he knew it would kill him.", "و آشنباخ هم ماند؛ ماند تا نزدیک پسر باشد؛ ماند هرچند می‌دانست ممکن است بکشدش؛ ماند هرچند می‌دانست می‌کشدش."),
            StoryParagraph("He was no longer the great Aschenbach, the disciplined artist, the monument of German letters; he was a man, a fool, a lover, dying for beauty.", "دیگر آشنباخ بزرگ نبود، هنرمند منضبط، یادبود ادبیات آلمان؛ مردی بود، احمقی، عاشقی، که برای زیبایی می‌مرد."),
            StoryParagraph("One evening, he went to a café in the piazza, and he sat and listened to the music, and he watched the boy, who was there with his family.", "یک عصر، به کافه‌ای در پیاتزا رفت و نشست و به موسیقی گوش داد و پسر را تماشا کرد که با خانواده‌اش آنجا بود."),
            StoryParagraph("The boy was dancing, with a group of young people, and he was graceful and joyful and alive.", "پسر می‌رقصید، با گروهی از جوانان و ظریف بود و شاد و زنده."),
            StoryParagraph("And Aschenbach watched him, and he wept, silently, in the darkness, and no one saw.", "و آشنباخ تماشایش کرد و گریست، بی‌صدا، در تاریکی و هیچ‌کس ندید."),
            StoryParagraph("He wept for the boy, for his beauty, for his youth; he wept for himself, for his age, for his loss.", "برای پسر گریست، برای زیبایی‌اش، برای جوانی‌اش؛ برای خودش گریست، برای پیری‌اش، برای فقدانش."),
            StoryParagraph("He wept because he knew, in that moment, that he had wasted his life; he had spent it in pursuit of form, of discipline, of control; and he had missed the only thing that mattered.", "گریست چون در آن لحظه می‌دانست زندگی‌اش را هدر داده؛ صرفش کرده بود در جستجوی فرم، انضباط، کنترل؛ و تنها چیزی که اهمیت داشت را از دست داده بود."),
            StoryParagraph("He had missed beauty; he had missed passion; he had missed love.", "زیبایی را از دست داده بود؛ شور را از دست داده بود؛ عشق را از دست داده بود."),
            StoryParagraph("He had been afraid of life; he had hidden from life; he had protected himself from life; and now, at the end, life was passing him by.", "از زندگی ترسیده بود؛ از زندگی پنهان شده بود؛ از زندگی خودش را محافظت کرده بود؛ و حالا، در پایان، زندگی از کنارش می‌گذشت."),
            StoryParagraph("And so he watched the boy dance, and he wept, and he knew that this was the closest he would ever come to happiness.", "و اینگونه تماشا کرد که پسر می‌رقصد و گریست و می‌دانست این نزدیک‌ترین چیزی بود که هرگز به خوشبختی می‌رسید."),
            StoryParagraph("The plague was spreading; the city was dying; and Aschenbach was dying with it, though he did not know it yet.", "طاعون پخش می‌شد؛ شهر می‌مرد؛ و آشنباخ با آن می‌مرد، هرچند هنوز نمی‌دانست."),
            StoryParagraph("The final days were approaching; the final days always approach; and no one knows when they will arrive.", "روزهای آخر نزدیک می‌شدند؛ روزهای آخر همیشه نزدیک می‌شوند؛ و هیچ‌کس نمی‌داند کِی می‌رسند.")
        )
    )

    // ─────────── فصل ۵: آخرین روز ───────────
    private fun chapter5() = StoryChapter(
        number = 5, title = "The Last Day", titlePersian = "آخرین روز",
        paragraphs = listOf(
            StoryParagraph("The last day of Aschenbach's life was a day like all the others, and yet unlike all the others.", "آخرین روز زندگی آشنباخ روزی بود مثل همه روزهای دیگر و با این حال متفاوت از همه."),
            StoryParagraph("The sun was hot, the sea was calm, the beach was crowded with the last remaining guests of the hotel.", "خورشید داغ بود، دریا آرام، ساحل پر از آخرین مهمانان باقی‌مانده هتل."),
            StoryParagraph("Aschenbach had risen late; he had not slept well; he had dreamed, in the night, of terrible things, of death, of dissolution, of the end.", "آشنباخ دیر بیدار شده بود؛ خوب نخوابیده بود؛ در شب خواب دیده بود، چیزهای هولناک، مرگ، فروپاشی، پایان."),
            StoryParagraph("He had dreamed of a sacrifice, of a ritual, of a god who demanded blood; he had dreamed of himself, as the sacrifice, as the victim, as the god.", "خواب قربانی را دیده بود، آینی، خدایی که خون می‌خواست؛ خواب خودش را دیده بود، همچون قربانی، همچون قربانی، همچون خدا."),
            StoryParagraph("He woke in a cold sweat, and he lay in bed for a long time, listening to his heart, which beat slowly and irregularly.", "غرق عرق سرد بیدار شد و مدت طولانی در تخت دراز کشید و به قلبش گوش داد که آهسته و نامنظم می‌تپید."),
            StoryParagraph("He was sick, he knew; the plague had entered him; the plague had found him; the plague was killing him.", "می‌دانست مریض است؛ طاعون واردش شده بود؛ طاعون پیدایش کرده بود؛ طاعون می‌کشتش."),
            StoryParagraph("And yet, he did not go to a doctor; he did not leave Venice; he did not try to save himself.", "و با این حال، به دکتر نرفت؛ ونیز را ترک نکرد؛ تلاش نکرد نجات خودش دهد."),
            StoryParagraph("He wanted only to see the boy, one more time, one last time, before the end.", "تنها می‌خواست پسر را ببیند، یک بار دیگر، یک بار آخر، پیش از پایان."),
            StoryParagraph("He dressed carefully, in his best suit, the one he had bought in Munich; he dyed his hair; he applied his cosmetics; he looked at himself in the mirror.", "با دقت لباس پوشید، بهترین کتش، همان که در مونیخ خریده بود؛ موهایش را رنگ کرد؛ آرایشش را زد؛ در آینه به خودش نگاه کرد."),
            StoryParagraph("He saw an old man, painted, pathetic, dying; and he smiled, and he went down to the beach.", "پیرمردی دید، رنگ‌آمیزی‌شده، رقت‌انگیز، در حال مرگ؛ و لبخند زد و به ساحل رفت."),
            StoryParagraph("The beach was as it always was: the same sand, the same sea, the same sky; and the boy was there, as he always was, playing with his friends.", "ساحل مثل همیشه بود: همان شن، همان دریا، همان آسمان؛ و پسر آنجا بود، مثل همیشه، با دوستانش بازی می‌کرد."),
            StoryParagraph("Aschenbach sat in his usual chair, under his usual umbrella, and he watched the boy.", "آشنباخ روی صندلی معمولش نشست، زیر چتر معمولش و پسر را تماشا کرد."),
            StoryParagraph("He watched him run, watched him swim, watched him laugh; he watched him, for the last time, with all the love he had, with all the love he had never given, with all the love he had never allowed himself to feel.", "تماشا کرد که می‌دود، شنا می‌کند، می‌خندد؛ تماشایش کرد، برای آخرین بار، با تمام عشقی که داشت، با تمام عشقی که هرگز نداده بود، با تمام عشقی که هرگز به خودش اجازه نداده بود حس کند."),
            StoryParagraph("And the boy, as if he knew, as if he sensed something, turned and looked at Aschenbach.", "و پسر، گویی می‌دانست، گویی چیزی حس می‌کرد، برگشت و به آشنباخ نگاه کرد."),
            StoryParagraph("Their eyes met, for a long moment, a longer moment than usual; and something passed between them, something that could not be put into words.", "چشمانشان به هم رسید، لحظه‌ای طولانی، طولانی‌تر از معمول؛ و چیزی میانشان رد شد، چیزی که نمی‌شد در کلمات ریخت."),
            StoryParagraph("It was recognition; it was farewell; it was love.", "شناخت بود؛ وداع بود؛ عشق بود."),
            StoryParagraph("The boy smiled, a small smile, a sad smile; and Aschenbach smiled back, a smile that was also a farewell, a smile that was also a surrender.", "پسر لبخند زد، لبخندی کوچک، لبخندی غمگین؛ و آشنباخ متقابلاً لبخند زد، لبخندی که وداع هم بود، لبخندی که تسلیم هم بود."),
            StoryParagraph("And then the boy turned away, and he ran back to his friends, and he disappeared into the crowd.", "و بعد پسر روی برگرداند و به سمت دوستانش دوید و در جمعیت ناپدید شد."),
            StoryParagraph("Aschenbach tried to rise from his chair; he wanted to follow the boy, one more time, one last time.", "آشنباخ تلاش کرد از صندلی بلند شود؛ می‌خواست دنبال پسر برود، یک بار دیگر، یک بار آخر."),
            StoryParagraph("But his body would not obey; his legs would not move; his heart, that weak and failing heart, gave one final beat, and then stopped.", "اما بدنش اطاعت نکرد؛ پاهایش حرکت نکردند؛ قلبش، آن قلب ضعیف و ناتوان، یک ضربان آخر زد و بعد ایستاد."),
            StoryParagraph("He fell back into his chair, and his head dropped to his chest, and he was dead.", "به صندلی افتاد و سرش روی سینه‌اش افتاد و مرده بود."),
            StoryParagraph("The people on the beach did not notice at first; they were too busy with their own lives, their own pleasures, their own concerns.", "مردم روی ساحل اول متوجه نشدند؛ بیش از حد مشغول زندگی‌های خودشان بودند، لذت‌های خودشان، دغدغه‌های خودشان."),
            StoryParagraph("It was only later, hours later, when the beach began to empty, that someone noticed the old man in the chair, still, silent, unmoving.", "تنها بعداً، ساعت‌ها بعد، وقتی ساحل شروع به خالی شدن کرد، کسی متوجه پیرمردی روی صندلی شد، ساکن، ساکت، بی‌حرکت."),
            StoryParagraph("They called for a doctor, but it was too late; they called for the police, but it was too late; everything was too late.", "دکتر خبر کردند اما دیر بود؛ پلیس خبر کردند اما دیر بود؛ همه چیز دیر بود."),
            StoryParagraph("And so Aschenbach died, in Venice, in the city he had loved and feared, in the city of beauty and death.", "و اینگونه آشنباخ مرد، در ونیز، در شهری که دوستش داشته و از آن ترسیده بود، در شهر زیبایی و مرگ."),
            StoryParagraph("He died alone, as he had lived alone; he died far from home, as he had always been far from home; he died in pursuit of beauty, as he had always been in pursuit of beauty.", "تنها مرد، همانطور که تنها زیسته بود؛ دور از خانه مرد، همانطور که همیشه دور از خانه بوده؛ در جستجوی زیبایی مرد، همانطور که همیشه در جستجوی زیبایی بوده."),
            StoryParagraph("His body was taken away in secret, because of the plague, because of the panic, because of the need to hide the truth.", "جسدش مخفیانه برده شد، به خاطر طاعون، به خاطر وحشت، به خاطر نیاز به پنهان کردن حقیقت."),
            StoryParagraph("His death was not announced; his funeral was not attended; his grave was not marked.", "مرگش اعلام نشد؛ خاکسپاری‌اش کسی نبود؛ گورش علامت‌گذاری نشد."),
            StoryParagraph("And the boy, Tadzio, never knew that the old man had died for him; never knew that the old man had loved him; never knew that the old man had sacrificed everything for a single glance.", "و پسر، تادزیو، هرگز نفهمید آن پیرمرد برایش مرده؛ هرگز نفهمید دوستش داشته؛ هرگز نفهمید همه چیز را برای یک نگاه فدا کرده بود."),
            StoryParagraph("He would grow up, and forget; he would live, and love, and die; and he would never know that once, in Venice, an old writer had loved him with all the love that a human heart can hold.", "بزرگ می‌شد و فراموش می‌کرد؛ زندگی می‌کرد و عشق می‌ورزید و می‌مرد؛ و هرگز نمی‌دانست که روزی، در ونیز، نویسنده‌ای پیر او را با تمام عشقی که قلب انسانی می‌تواند داشته باشد دوست داشته."),
            StoryParagraph("And so the story ends, as such stories always end, in death, in loss, in the beautiful, terrible futility of love.", "و اینگونه داستان پایان می‌یابد، همانطور که چنین داستان‌هایی همیشه پایان می‌یابند، در مرگ، در فقدان، در بی‌فایدگی زیبا و هولناک عشق."),
            StoryParagraph("But it is not entirely futile; it is not entirely meaningless; because love, even love that ends in death, even love that is never returned, is still love.", "اما کاملاً بی‌فایده نیست؛ کاملاً بی‌معنا نیست؛ زیرا عشق، حتی عشقی که به مرگ ختم می‌شود، حتی عشقی که هرگز پاسخ نمی‌گیرد، هنوز عشق است."),
            StoryParagraph("And love, in the end, is the only thing that matters.", "و عشق، در پایان، تنها چیزی است که اهمیت دارد."),
            StoryParagraph("Aschenbach learned this too late; but he learned it; and that, perhaps, is enough.", "آشنباخ خیلی دیر یاد گرفت؛ اما یاد گرفت؛ و این، شاید، کافی است."),
            StoryParagraph("The end.", "پایان."),
            StoryParagraph("And the beginning.", "و آغاز.")
        )
    )

    // ─────────── فصل ۶: معنا ───────────
    private fun chapter6() = StoryChapter(
        number = 6, title = "The Meaning", titlePersian = "معنا",
        paragraphs = listOf(
            StoryParagraph("Death in Venice, published in 1912, is one of Thomas Mann's most celebrated works, and one of the most perfect novellas in the German language.", "مرگ در ونیز، منتشرشده در ۱۹۱۲، یکی از مشهورترین آثار توماس مان و یکی از کامل‌ترین نوولاهای زبان آلمانی است."),
            StoryParagraph("It is a short work, barely a hundred pages, but in those pages Mann compressed a lifetime of thought about art, about beauty, about love, about death.", "اثری کوتاه است، به‌سختی صد صفحه، اما در آن صفحات مان تمام عمری اندیشه درباره هنر فشرده کرد، درباره زیبایی، درباره عشق، درباره مرگ."),
            StoryParagraph("The story is simple: a famous writer, Gustav von Aschenbach, travels to Venice, sees a beautiful boy, becomes obsessed with him, and dies.", "داستان ساده است: نویسنده‌ای مشهور، گوستاو فون آشنباخ، به ونیز سفر می‌کند، پسر زیبایی را می‌بیند، وسواسش می‌شود و می‌میرد."),
            StoryParagraph("But beneath that simple surface, there are depths within depths; the story is a palimpsest, a puzzle, a labyrinth of meanings.", "اما زیر آن سطح ساده، عمق‌هایی در عمق‌ها هست؛ داستان پالیمپسستی است، معمایی، هزارتویی از معانی."),
            StoryParagraph("It is, first of all, a story about art and the artist; about the price that the artist pays for his art; about the sacrifice that art demands.", "نخست از همه، داستانی است درباره هنر و هنرمند؛ درباره بهایی که هنرمند برای هنرش می‌پردازد؛ درباره فداکاری‌ای که هنر می‌طلبد."),
            StoryParagraph("Aschenbach has spent his life in pursuit of form, of discipline, of control; he has suppressed his passions, his desires, his life, in order to create.", "آشنباخ عمرش را صرف جستجوی فرم کرده، انضباط، کنترل؛ شورهایش را سرکوب کرده، امیالش را، زندگی‌اش را، تا بیافریند."),
            StoryParagraph("But the passions that he has suppressed have not disappeared; they have been waiting, all these years, for a chance to return.", "اما شورهایی که سرکوب کرده ناپدید نشده‌اند؛ سال‌ها منتظر مانده‌اند، برای فرصتی برای بازگشت."),
            StoryParagraph("And when Aschenbach comes to Venice, when he sees Tadzio, the passions return, and they return with a vengeance.", "و وقتی آشنباخ به ونیز می‌آید، وقتی تادزیو را می‌بیند، شورها بازمی‌گردند و با انتقام بازمی‌گردند."),
            StoryParagraph("Venice, in the novel, is not just a city; it is a symbol of the sensual, the beautiful, the dangerous; it is the opposite of Aschenbach's disciplined Munich.", "ونیز، در رمان، تنها شهر نیست؛ نمادِ حسی است، زیبا، خطرناک؛ متضاد مونیخ منضبط آشنباخ است."),
            StoryParagraph("Venice is the city of masks, of illusions, of appearances; it is the city where nothing is what it seems; it is the city of death.", "ونیز شهر نقاب‌ها است، توهمات، ظواهر؛ شهری است که در آن هیچ چیز آن نیست که به نظر می‌رسد؛ شهر مرگ است."),
            StoryParagraph("The plague that spreads through Venice is also a symbol; it is the disease of passion, the disease of desire, the disease of life itself.", "طاعونی که در ونیز پخش می‌شود نمادی هم هست؛ بیماری شور است، بیماری میل، بیماری خود زندگی."),
            StoryParagraph("Aschenbach dies of the plague, but he also dies of beauty; he is killed by the very thing he has spent his life pursuing.", "آشنباخ از طاعون می‌میرد اما از زیبایی هم می‌میرد؛ توسط همان چیزی کشته می‌شود که عمرش را صرف جستجویش کرده."),
            StoryParagraph("Tadzio, the boy, is the most complex symbol in the novel; he is beauty, but he is also death; he is life, but he is also destruction.", "تادزیو، پسر، پیچیده‌ترین نماد رمان است؛ زیبایی است اما مرگ هم؛ زندگی است اما نابودی هم."),
            StoryParagraph("He is based, in part, on a real boy whom Mann saw in Venice; he is based, in part, on the figure of Eros in Greek mythology; he is based, in part, on the ideal of beauty that haunts all art.", "بخشی بر اساس پسری واقعی است که مان در ونیز دیده بود؛ بخشی بر اساس پیکره اروس در اساطیر یونانی؛ بخشی بر اساس آرمان زیبایی که تمام هنر را تسخیر می‌کند."),
            StoryParagraph("Tadzio does not love Aschenbach; he does not even know him; he is the object of desire, the beautiful thing that cannot be possessed, the ideal that cannot be achieved.", "تادزیو آشنباخ را دوست ندارد؛ حتی نمی‌شناسدش؛ ابژه میل است، چیز زیبایی که نمی‌توان مالکش شد، آرمانی که نمی‌توان به آن رسید."),
            StoryParagraph("And Aschenbach, in pursuing Tadzio, in desiring him, in loving him, is pursuing not the boy himself but what the boy represents: youth, beauty, life, love.", "و آشنباخ، در تعقیب تادزیو، در میلش به او، در عشقش به او، نه خودِ پسر را دنبال می‌کند بلکه آنچه پسر نمایندگی می‌کند: جوانی، زیبایی، زندگی، عشق."),
            StoryParagraph("The novel is also about the relationship between Apollonian and Dionysian forces, between order and chaos, between reason and passion.", "رمان همچنین درباره رابطه میان نیروهای آپولونی و دیونیزوسی است، میان نظم و آشوب، میان عقل و شور."),
            StoryParagraph("Aschenbach has lived his life according to the Apollonian principles: order, discipline, form, control.", "آشنباخ عمرش را بر اساس اصول آپولونی زیسته: نظم، انضباط، فرم، کنترل."),
            StoryParagraph("But in Venice, in his love for Tadzio, he surrenders to the Dionysian: chaos, passion, dissolution, loss of self.", "اما در ونیز، در عشقش به تادزیو، به دیونیزوسی تسلیم می‌شود: آشوب، شور، فروپاشی، از دست دادن خود."),
            StoryParagraph("The novel, in this sense, is a tragedy of self-destruction; Aschenbach destroys himself by surrendering to the forces he has spent his life suppressing.", "رمان از این نظر تراژدی خود-نابودی است؛ آشنباخ خودش را نابود می‌کند با تسلیم شدن به نیروهایی که عمرش را صرف سرکوبشان کرده."),
            StoryParagraph("But it is also, perhaps, a tragedy of self-realization; Aschenbach, in his final days, comes closer to life than he ever did in his disciplined years.", "اما همچنین، شاید، تراژدی خود-شکوفایی است؛ آشنباخ، در روزهای آخرش، به زندگی نزدیک‌تر می‌شود از هر وقت در سال‌های منضبطش."),
            StoryParagraph("He experiences, for the first time, the joy of beauty, the joy of desire, the joy of love; and though these joys destroy him, they also fulfill him.", "برای نخستین بار، لذت زیبایی را تجربه می‌کند، لذت میل، لذت عشق؛ و هرچند این لذت‌ها نابودش می‌کنند، او را هم کامل می‌کنند."),
            StoryParagraph("The novel, in this sense, is a meditation on the paradox of human existence: that we are destroyed by the very things that make us fully alive.", "رمان از این نظر مراقبه‌ای است درباره پارادوکس وجود انسانی: که توسط همان چیزهایی نابود می‌شویم که ما را کاملاً زنده می‌کنند."),
            StoryParagraph("Death in Venice is also, and perhaps most painfully, a novel about aging, about the loss of youth, about the impossibility of recapturing the past.", "مرگ در ونیز همچنین، و شاید دردناک‌ترین، رمانی است درباره پیری، درباره از دست دادن جوانی، درباره ناممکن بودن بازگرداندن گذشته."),
            StoryParagraph("Aschenbach is fifty, or nearly so; he is no longer young; he knows it, and he cannot accept it.", "آشنباخ پنجاه ساله است، یا نزدیکش؛ دیگر جوان نیست؛ می‌داند و نمی‌تواند بپذیرد."),
            StoryParagraph("He dyes his hair, he uses cosmetics, he tries to look younger, to be younger; but he cannot be; the years cannot be undone.", "موهایش را رنگ می‌کند، آرایش می‌کند، تلاش می‌کند جوان‌تر به نظر برسد، جوان‌تر باشد؛ اما نمی‌تواند؛ سال‌ها را نمی‌توان بازگرداند."),
            StoryParagraph("And so he pursues youth in the form of Tadzio; he tries to recapture, through the boy, what he has lost.", "و اینگونه جوانی را در قالب تادزیو دنبال می‌کند؛ تلاش می‌کند، از طریق پسر، آنچه از دست داده را بازگرداند."),
            StoryParagraph("But youth cannot be recaptured; love cannot be forced; beauty cannot be possessed; and Aschenbach learns this, in the end, in the most terrible way possible.", "اما جوانی را نمی‌توان بازگرداند؛ عشق را نمی‌توان اجبار کرد؛ زیبایی را نمی‌توان مالک شد؛ و آشنباخ این را در پایان به هولناک‌ترین شکل ممکن می‌آموزد."),
            StoryParagraph("Death in Venice is a short novel, but it contains multitudes; it can be read as a story about art, about love, about death, about aging, about beauty, about madness.", "مرگ در ونیز رمانی کوتاه است اما انبوهی در خود دارد؛ می‌توان آن را داستانی خواند درباره هنر، درباره عشق، درباره مرگ، درباره پیری، درباره زیبایی، درباره جنون."),
            StoryParagraph("It can be read as a homoerotic novel, as a philosophical novel, as a psychological novel, as a mythological novel.", "می‌توان آن را رمانی همجنس‌گرا خواند، رمانی فلسفی، رمانی روانشناختی، رمانی اساطیری."),
            StoryParagraph("It can be read as a critique of bourgeois society, as a celebration of passion, as a warning about obsession.", "می‌توان آن را نقدی بر جامعه بورژوایی خواند، جشنی برای شور، هشداری درباره وسواس."),
            StoryParagraph("But whatever interpretation one brings to it, one thing remains constant: the beauty of the prose, the precision of the observation, the depth of the understanding.", "اما هر تفسیری که به آن بیاوریم، یک چیز ثابت می‌ماند: زیبایی نثر، دقت مشاهده، عمق فهم."),
            StoryParagraph("Mann wrote the novel after a trip to Venice, where he had seen a beautiful boy on the beach of the Lido; he wrote it, in part, to exorcise his own demons, his own desires, his own fears.", "مان رمان را پس از سفری به ونیز نوشت، جایی که پسری زیبا در ساحل لیدو دیده بود؛ آن را، بخشی، برای بیرون راندن دیوهای خودش نوشت، امیالش، ترس‌هایش."),
            StoryParagraph("And in writing it, he created one of the most perfect works of art in the German language; a work that continues to move readers more than a century after its publication.", "و در نوشتنش، یکی از کامل‌ترین آثار هنری زبان آلمانی را آفرید؛ اثری که بیش از یک قرن پس از انتشارش همچنان خوانندگان را متأثر می‌کند."),
            StoryParagraph("The novel's final message is ambiguous; it can be read as a condemnation of passion, or as a celebration of passion, or as something in between.", "پیام نهایی رمان مبهم است؛ می‌توان آن را محکومیتی بر شور خواند، یا جشنی برای شور، یا چیزی در میان."),
            StoryParagraph("But one thing is clear: Aschenbach's death is both a punishment and a fulfillment; he dies because he has loved, and he dies because he has lived.", "اما یک چیز واضح است: مرگ آشنباخ هم مجازات است و هم کامل شدن؛ می‌میرد چون عشق ورزیده و می‌میرد چون زیسته."),
            StoryParagraph("In the end, perhaps, that is all any of us can ask: to die because we have loved, to die because we have lived.", "در پایان، شاید، این تمام چیزی است که هر یک از ما می‌تواند بخواهد: مردن چون عشق ورزیده‌ایم، مردن چون زیسته‌ایم."),
            StoryParagraph("The end.", "پایان."),
            StoryParagraph("And the beginning.", "و آغاز."),
            StoryParagraph("For the story of Aschenbach is the story of all of us, in our own cities, in our own loves, in our own deaths.", "زیرا داستان آشنباخ داستان همه‌مان است، در شهرهای خودمان، در عشق‌های خودمان، در مرگ‌های خودمان."),
            StoryParagraph("And it will continue to be told, as long as human beings love beauty, and fear death, and struggle to understand the mystery of existence.", "و به گفتن ادامه می‌یابد، تا وقتی انسان‌ها زیبایی را دوست داشته باشند و از مرگ بترسند و بکوشند معمای وجود را بفهمند.")
        )
    )
}