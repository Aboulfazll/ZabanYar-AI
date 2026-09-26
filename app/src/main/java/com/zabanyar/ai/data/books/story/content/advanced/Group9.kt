package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۹ پیشرفته — ادبیات پست‌مدرن
 *  ۲۵. پرواز بر فراز آشیانه فاخته
 *  ۲۶. کشتارگاه پنج
 *  ۲۷. تحمل‌ناپذیری هستی
 */
object Group9 {

    fun getAll(): List<StoryContent> = listOf(
        story25(),
        story26(),
        story27(),
    )

    // ─────────────── ۲۵: پرواز بر فراز آشیانه فاخته ───────────────
    private fun story25() = StoryContent(
        storyId = "adv_one_flew_over_the_cuckoos_nest",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Arrival at the Ward", titlePersian = "ورود به بخش",
                paragraphs = listOf(
                    StoryParagraph("My name is Chief Bromden.", "اسم من رئیس برومدن است."),
                    StoryParagraph("I am a patient in a mental hospital.", "من بیماری در بیمارستان روانی هستم."),
                    StoryParagraph("The hospital is in Oregon.", "بیمارستان در اورگان است."),
                    StoryParagraph("I am half Native American.", "من نیمه سرخ‌پوست هستم."),
                    StoryParagraph("I am very tall and strong.", "من خیلی بلند و قوی هستم."),
                    StoryParagraph("But I pretend to be deaf and mute.", "اما تظاهر می‌کنم کر و لالم."),
                    StoryParagraph("Nobody knows I can hear everything.", "هیچ‌کس نمی‌داند من همه چیز را می‌شنوم."),
                    StoryParagraph("I have been here for many years.", "سال‌ها اینجا بوده‌ام."),
                    StoryParagraph("The Big Nurse rules the ward.", "پرستار بزرگ بخش را اداره می‌کند."),
                    StoryParagraph("Her name is Nurse Ratched.", "اسمش پرستار رچد است."),
                    StoryParagraph("She is calm and polite.", "او آرام و مؤدب است."),
                    StoryParagraph("But she controls everyone with fear.", "اما همه را با ترس کنترل می‌کند."),
                    StoryParagraph("The patients are called Acutes and Chronics.", "بیماران به حاد و مزمن تقسیم می‌شوند."),
                    StoryParagraph("The Acutes can be cured.", "حادها می‌توانند درمان شوند."),
                    StoryParagraph("The Chronics cannot.", "مزمن‌ها نمی‌توانند."),
                    StoryParagraph("I am a Chronic.", "من مزمن هستم."),
                    StoryParagraph("Every day is the same.", "هر روز یکسان است."),
                    StoryParagraph("We take pills and attend meetings.", "ما قرص می‌خوریم و در جلسات شرکت می‌کنیم."),
                    StoryParagraph("Everything is controlled.", "همه چیز کنترل می‌شود."),
                    StoryParagraph("And then McMurphy arrived.", "و بعد مک‌مرفی رسید.")
                )
            ),
            StoryChapter(
                number = 2, title = "McMurphy the Gambler", titlePersian = "مک‌مرفی قمارباز",
                paragraphs = listOf(
                    StoryParagraph("McMurphy was a new patient.", "مک‌مرفی بیماری جدید بود."),
                    StoryParagraph("He was a gambler and a con man.", "او قمارباز و کلاهبردار بود."),
                    StoryParagraph("He had faked insanity to escape prison.", "او تظاهر به دیوانگی کرده بود تا از زندان فرار کند."),
                    StoryParagraph("He thought the hospital would be easier.", "او فکر می‌کرد بیمارستان راحت‌تر است."),
                    StoryParagraph("But he was wrong.", "اما اشتباه می‌کرد."),
                    StoryParagraph("The Big Nurse controlled everything.", "پرستار بزرگ همه چیز را کنترل می‌کرد."),
                    StoryParagraph("McMurphy was loud and full of life.", "مک‌مرفی پرصدا و پر از زندگی بود."),
                    StoryParagraph("He laughed and joked with everyone.", "با همه می‌خندید و شوخی می‌کرد."),
                    StoryParagraph("He taught the patients to play cards.", "او به بیماران یاد داد ورق بازی کنند."),
                    StoryParagraph("He even taught me to speak again.", "او حتی یادم داد دوباره صحبت کنم."),
                    StoryParagraph("He saw I was pretending.", "او فهمید تظاهر می‌کنم."),
                    StoryParagraph("He treated me like a real person.", "با من مثل یک انسان واقعی رفتار می‌کرد."),
                    StoryParagraph("Nobody had done that for years.", "سال‌ها هیچ‌کس این کار را نکرده بود."),
                    StoryParagraph("McMurphy saw the truth of the ward.", "مک‌مرفی حقیقت بخش را دید."),
                    StoryParagraph("Most patients were there by choice.", "بیشتر بیماران با انتخاب خودشان آنجا بودند."),
                    StoryParagraph("They could leave if they wanted.", "می‌توانستند اگر می‌خواستند بروند."),
                    StoryParagraph("But they were too afraid of the outside world.", "اما از دنیای بیرون بیش از حد می‌ترسیدند."),
                    StoryParagraph("The Big Nurse kept them weak.", "پرستار بزرگ آن‌ها را ضعیف نگه می‌داشت."),
                    StoryParagraph("McMurphy wanted to change that.", "مک‌مرفی می‌خواست این را تغییر دهد."),
                    StoryParagraph("He was going to fight her.", "او می‌خواست با او بجنگد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Fishing Trip", titlePersian = "سفر ماهیگیری",
                paragraphs = listOf(
                    StoryParagraph("McMurphy organized a fishing trip.", "مک‌مرفی سفر ماهیگیری ترتیب داد."),
                    StoryParagraph("He got permission from the doctor.", "او از دکتر اجازه گرفت."),
                    StoryParagraph("The Big Nurse did not like it.", "پرستار بزرگ دوستش نداشت."),
                    StoryParagraph("But she could not stop them.", "اما نمی‌توانست متوقفشان کند."),
                    StoryParagraph("A group of patients went to the coast.", "گروهی از بیماران به ساحل رفتند."),
                    StoryParagraph("They felt free for the first time.", "آن‌ها برای اولین بار آزاد احساس کردند."),
                    StoryParagraph("McMurphy taught them to fish.", "مک‌مرفی یادشان داد ماهی بگیرند."),
                    StoryParagraph("They laughed and shouted with joy.", "آن‌ها با خوشحالی خندیدند و فریاد زدند."),
                    StoryParagraph("They felt like real men.", "آن‌ها مثل مردان واقعی احساس کردند."),
                    StoryParagraph("McMurphy also hired a woman for the boat.", "مک‌مرفی زنی هم برای قایق استخدام کرد."),
                    StoryParagraph("Her name was Candy.", "اسمش کندی بود."),
                    StoryParagraph("She was a friend of McMurphy.", "او دوست مک‌مرفی بود."),
                    StoryParagraph("The men were shy at first.", "مردان اول خجالتی بودند."),
                    StoryParagraph("But Candy was kind and easy-going.", "اما کندی مهربان و راحت بود."),
                    StoryParagraph("They all had a wonderful day.", "همه روز فوق‌العاده‌ای داشتند."),
                    StoryParagraph("They caught many fish.", "آن‌ها ماهی‌های زیادی گرفتند."),
                    StoryParagraph("They told stories and laughed.", "داستان گفتند و خندیدند."),
                    StoryParagraph("That day changed something in them.", "آن روز چیزی در آن‌ها را تغییر داد."),
                    StoryParagraph("They saw they could be free.", "آن‌ها دیدند می‌توانند آزاد باشند."),
                    StoryParagraph("When they returned, they were different.", "وقتی برگشتند، متفاوت بودند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Battle of Wills", titlePersian = "نبرد اراده‌ها",
                paragraphs = listOf(
                    StoryParagraph("The Big Nurse fought back.", "پرستار بزرگ مقابله کرد."),
                    StoryParagraph("She called McMurphy dangerous.", "او مک‌مرفی را خطرناک خواند."),
                    StoryParagraph("She sent him for electroshock therapy.", "او را برای شوک الکتریکی فرستاد."),
                    StoryParagraph("McMurphy came back weak and tired.", "مک‌مرفی ضعیف و خسته برگشت."),
                    StoryParagraph("But he did not give up.", "اما تسلیم نشد."),
                    StoryParagraph("He punched a glass window in protest.", "او در اعتراض شیشه پنجره‌ای را شکست."),
                    StoryParagraph("He was punished with more shocks.", "با شوک بیشتری مجازات شد."),
                    StoryParagraph("The patients watched in silence.", "بیماران در سکوت تماشا کردند."),
                    StoryParagraph("One patient, Billy Bibbit, was fragile.", "بیماری به نام بیلی بیبیت شکننده بود."),
                    StoryParagraph("He stuttered and was afraid of women.", "او لکنت داشت و از زنان می‌ترسید."),
                    StoryParagraph("His mother was a friend of the Big Nurse.", "مادرش دوست پرستار بزرگ بود."),
                    StoryParagraph("McMurphy wanted to help Billy.", "مک‌مرفی می‌خواست به بیلی کمک کند."),
                    StoryParagraph("He arranged for Billy to be with Candy.", "او ترتیب داد بیلی با کندی باشد."),
                    StoryParagraph("That night, Billy became a man.", "آن شب، بیلی مرد شد."),
                    StoryParagraph("The next morning, he was confident.", "صبح روز بعد، با اعتماد به نفس بود."),
                    StoryParagraph("But the Big Nurse threatened him.", "اما پرستار بزرگ تهدیدش کرد."),
                    StoryParagraph("She said she would tell his mother.", "او گفت به مادرش می‌گوید."),
                    StoryParagraph("Billy was terrified and killed himself.", "بیلی وحشت کرد و خودش را کشت."),
                    StoryParagraph("McMurphy was furious.", "مک‌مرفی خشمگین شد."),
                    StoryParagraph("He attacked the Big Nurse.", "او به پرستار بزرگ حمله کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Sacrifice", titlePersian = "فداکاری",
                paragraphs = listOf(
                    StoryParagraph("McMurphy tried to strangle the Big Nurse.", "مک‌مرفی تلاش کرد پرستار بزرگ را خفه کند."),
                    StoryParagraph("The guards pulled him away.", "نگهبانان او را کنار کشیدند."),
                    StoryParagraph("She was hurt but survived.", "او آسیب دید اما زنده ماند."),
                    StoryParagraph("McMurphy was sent for a lobotomy.", "مک‌مرفی برای لوبوتومی فرستاده شد."),
                    StoryParagraph("The operation damaged his brain.", "عمل مغزش را آسیب زد."),
                    StoryParagraph("When he returned, he was like a vegetable.", "وقتی برگشت، مثل یک سبزی بود."),
                    StoryParagraph("He could not speak or move.", "او نمی‌توانست صحبت کند یا حرکت کند."),
                    StoryParagraph("The patients were devastated.", "بیماران ویران شدند."),
                    StoryParagraph("The man who had given them life was gone.", "مردی که به آن‌ها زندگی داده بود رفته بود."),
                    StoryParagraph("That night, I made a decision.", "آن شب، تصمیمی گرفتم."),
                    StoryParagraph("I put a pillow over McMurphy's face.", "بالشی روی صورت مک‌مرفی گذاشتم."),
                    StoryParagraph("I held it there until he stopped breathing.", "آن را نگه داشتم تا نفس نکشید."),
                    StoryParagraph("I did it out of love.", "این کار را از عشق کردم."),
                    StoryParagraph("Then I lifted the heavy control panel.", "بعد پنل کنترل سنگین را بلند کردم."),
                    StoryParagraph("I threw it through the window.", "آن را از پنجره پرت کردم."),
                    StoryParagraph("The window broke and light poured in.", "پنجره شکست و نور به داخل ریخت."),
                    StoryParagraph("I ran away into the night.", "من در شب فرار کردم."),
                    StoryParagraph("I felt free for the first time in years.", "برای اولین بار در سال‌ها آزاد احساس کردم."),
                    StoryParagraph("McMurphy had given me my life back.", "مک‌مرفی زندگی‌ام را به من برگردانده بود."),
                    StoryParagraph("And so I flew over the cuckoo's nest.", "و اینگونه بر فراز آشیانه فاخته پرواز کردم.")
                )
            )
        )
    )

    // ─────────────── ۲۶: کشتارگاه پنج ───────────────
    private fun story26() = StoryContent(
        storyId = "adv_slaughterhouse_five",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Billy Pilgrim's Time Travel", titlePersian = "سفر در زمان بیلی",
                paragraphs = listOf(
                    StoryParagraph("Billy Pilgrim was a soldier in World War II.", "بیلی پیلگریم سربازی در جنگ جهانی دوم بود."),
                    StoryParagraph("He was young and skinny.", "او جوان و لاغر بود."),
                    StoryParagraph("He was not a good soldier.", "او سرباز خوبی نبود."),
                    StoryParagraph("He was captured by the Germans.", "او توسط آلمانی‌ها اسیر شد."),
                    StoryParagraph("They sent him to a prison camp.", "آن‌ها او را به اردوگاه اسرا فرستادند."),
                    StoryParagraph("The camp was in Dresden.", "اردوگاه در درسدن بود."),
                    StoryParagraph("Billy survived the bombing of Dresden.", "بیلی از بمباران درسدن جان سالم برد."),
                    StoryParagraph("Over 135,000 people died in that raid.", "بیش از ۱۳۵ هزار نفر در آن حمله مردند."),
                    StoryParagraph("Billy was one of the few survivors.", "بیلی یکی از معدود بازماندگان بود."),
                    StoryParagraph("But Billy had a strange condition.", "اما بیلی وضعیت عجیبی داشت."),
                    StoryParagraph("He had become unstuck in time.", "او در زمان بی‌قید شده بود."),
                    StoryParagraph("He traveled to different moments of his life.", "او به لحظات مختلف زندگی‌اش سفر می‌کرد."),
                    StoryParagraph("One moment he was a child.", "یک لحظه بچه بود."),
                    StoryParagraph("Another moment he was a middle-aged man.", "لحظه‌ای دیگر مردی میان‌سال بود."),
                    StoryParagraph("The moments were not in order.", "لحظه‌ها به ترتیب نبودند."),
                    StoryParagraph("He could be born and die in the same hour.", "می‌توانست در یک ساعت به دنیا بیاید و بمیرد."),
                    StoryParagraph("He could not control where he went.", "او نمی‌توانست کنترل کند کجا می‌رود."),
                    StoryParagraph("He just accepted it.", "او فقط می‌پذیرفتش."),
                    StoryParagraph("He said: So it goes.", "او می‌گفت: همینطوره."),
                    StoryParagraph("That became his philosophy of life.", "این فلسفه زندگی‌اش شد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Tralfamadorians", titlePersian = "ترالفامادوری‌ها",
                paragraphs = listOf(
                    StoryParagraph("At some point, Billy was kidnapped by aliens.", "در نقطه‌ای، بیلی توسط موجودات فضایی ربوده شد."),
                    StoryParagraph("They were from the planet Tralfamadore.", "آن‌ها از سیاره ترالفامادور بودند."),
                    StoryParagraph("They looked like green toilet plungers.", "آن‌ها شبیه چاه‌بازکن‌های سبز بودند."),
                    StoryParagraph("They had one eye in the middle of their heads.", "آن‌ها یک چشم در وسط سرشان داشتند."),
                    StoryParagraph("They saw time differently than humans.", "آن‌ها زمان را متفاوت از انسان‌ها می‌دیدند."),
                    StoryParagraph("For them, all moments exist at once.", "برای آن‌ها، همه لحظات به طور همزمان وجود دارند."),
                    StoryParagraph("Past, present, and future are the same.", "گذشته، حال و آینده یکسانند."),
                    StoryParagraph("They showed Billy their view of life.", "آن‌ها دیدگاهشان از زندگی را به بیلی نشان دادند."),
                    StoryParagraph("They said life is a collection of moments.", "آن‌ها گفتند زندگی مجموعه‌ای از لحظات است."),
                    StoryParagraph("We should enjoy each moment as it is.", "باید از هر لحظه همانطور که هست لذت ببریم."),
                    StoryParagraph("Billy learned about death from them.", "بیلی از آن‌ها درباره مرگ یاد گرفت."),
                    StoryParagraph("When someone dies, they only seem to die.", "وقتی کسی می‌میرد، فقط به نظر می‌رسد مرده."),
                    StoryParagraph("They are still alive in other moments.", "آن‌ها در لحظات دیگر هنوز زنده‌اند."),
                    StoryParagraph("So we should not mourn too much.", "پس نباید بیش از حد عزادار باشیم."),
                    StoryParagraph("Billy liked this way of thinking.", "بیلی این روش فکر کردن را دوست داشت."),
                    StoryParagraph("It made death less painful.", "مرگ را کم‌دردتر می‌کرد."),
                    StoryParagraph("The Tralfamadorians also gave Billy a wife.", "ترالفامادوری‌ها همسرش را هم به بیلی دادند."),
                    StoryParagraph("Her name was Montana Wildhack.", "اسمش مونتانا وایلدهاک بود."),
                    StoryParagraph("She was a movie star from Earth.", "او ستاره فیلمی از زمین بود."),
                    StoryParagraph("They lived together in a zoo on Tralfamadore.", "آن‌ها با هم در باغ‌وحشی در ترالفامادور زندگی کردند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The War Years", titlePersian = "سال‌های جنگ",
                paragraphs = listOf(
                    StoryParagraph("Billy remembered his time in the war.", "بیلی زمانش در جنگ را به یاد آورد."),
                    StoryParagraph("He had been with other American soldiers.", "او با سربازان آمریکایی دیگری بود."),
                    StoryParagraph("One was a loud man named Roland Weary.", "یکی مرد پرصدایی به نام رولاند ویر بود."),
                    StoryParagraph("Weary was cruel and stupid.", "ویر ظالم و احمق بود."),
                    StoryParagraph("He liked to hurt people.", "او دوست داشت به مردم آسیب برساند."),
                    StoryParagraph("Another was a kind man named Edgar Derby.", "دیگری مردی مهربان به نام ادگار دِربی بود."),
                    StoryParagraph("Derby was a teacher.", "دربی معلم بود."),
                    StoryParagraph("He tried to protect Billy.", "او تلاش کرد از بیلی محافظت کند."),
                    StoryParagraph("The Germans captured them all.", "آلمانی‌ها همه‌شان را اسیر کردند."),
                    StoryParagraph("They were put in boxcars.", "آن‌ها را در واگن‌های باری گذاشتند."),
                    StoryParagraph("The journey was terrible.", "سفر وحشتناکی بود."),
                    StoryParagraph("Many prisoners died on the way.", "بسیاری از اسرا در راه مردند."),
                    StoryParagraph("Weary died of gangrene in his feet.", "ویر از قانقاریا در پاهایش مرد."),
                    StoryParagraph("Before dying, he told everyone Billy killed him.", "قبل از مرگ، به همه گفت بیلی او را کشته."),
                    StoryParagraph("That was a lie.", "این دروغ بود."),
                    StoryParagraph("But people believed it.", "اما مردم باور کردند."),
                    StoryParagraph("In Dresden, Billy worked in a factory.", "در درسدن، بیلی در کارخانه‌ای کار می‌کرد."),
                    StoryParagraph("They made vitamin syrup for pregnant women.", "آن‌ها شربت ویتامین برای زنان باردار می‌ساختند."),
                    StoryParagraph("Then came the bombing.", "بعد بمباران آمد."),
                    StoryParagraph("The beautiful city was destroyed.", "شهر زیبا نابود شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Aftermath", titlePersian = "پیامدها",
                paragraphs = listOf(
                    StoryParagraph("After the war, Billy returned to America.", "بعد از جنگ، بیلی به آمریکا برگشت."),
                    StoryParagraph("He studied to become an optometrist.", "او تحصیل کرد تا عینک‌ساز شود."),
                    StoryParagraph("He married a rich woman's daughter.", "او با دختر زن ثروتمندی ازدواج کرد."),
                    StoryParagraph("Her name was Valencia Merble.", "اسمش والنسیا مربل بود."),
                    StoryParagraph("She was fat and not very smart.", "او چاق و زیاد باهوش نبود."),
                    StoryParagraph("But she loved him deeply.", "اما عمیقاً دوستش داشت."),
                    StoryParagraph("They had two children.", "آن‌ها دو فرزند داشتند."),
                    StoryParagraph("Billy became a successful businessman.", "بیلی تاجر موفقی شد."),
                    StoryParagraph("He was president of the Lion's Club.", "او رئیس باشگاه لاینز بود."),
                    StoryParagraph("But he was strange to everyone.", "اما برای همه عجیب بود."),
                    StoryParagraph("He spoke about Tralfamadore openly.", "او آشکارا درباره ترالفامادور صحبت می‌کرد."),
                    StoryParagraph("People thought he was crazy.", "مردم فکر کردند دیوانه است."),
                    StoryParagraph("His daughter Barbara was worried.", "دخترش باربارا نگران بود."),
                    StoryParagraph("She did not believe his stories.", "او داستان‌هایش را باور نمی‌کرد."),
                    StoryParagraph("She wanted to take care of him.", "می‌خواست مراقبش باشد."),
                    StoryParagraph("Billy did not mind.", "بیلی اهمیت نمی‌داد."),
                    StoryParagraph("He just lived his life moment by moment.", "او فقط زندگی‌اش را لحظه به لحظه زندگی می‌کرد."),
                    StoryParagraph("He accepted both joy and sorrow.", "هم شادی و هم غم را می‌پذیرفت."),
                    StoryParagraph("His wife died in a car accident.", "همسرش در حادثه ماشین مرد."),
                    StoryParagraph("Billy did not cry at her funeral.", "بیلی در خاکسپاری‌اش گریه نکرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End and the Beginning", titlePersian = "پایان و آغاز",
                paragraphs = listOf(
                    StoryParagraph("Billy knew how he would die.", "بیلی می‌دانست چطور می‌میرد."),
                    StoryParagraph("The Tralfamadorians had told him.", "ترالفامادوری‌ها به او گفته بودند."),
                    StoryParagraph("He would be shot by a man named Paul Lazzaro.", "او توسط مردی به نام پاول لازارو تیرباران می‌شود."),
                    StoryParagraph("Lazzaro was a friend of Roland Weary.", "لازارو دوست رولاند ویر بود."),
                    StoryParagraph("He had sworn revenge for Weary's death.", "او برای مرگ ویر قسم انتقام خورده بود."),
                    StoryParagraph("Billy accepted this calmly.", "بیلی این را آرام پذیرفت."),
                    StoryParagraph("He went to a public speech in Chicago.", "او به سخنرانی عمومی در شیکاگو رفت."),
                    StoryParagraph("He spoke about his time travel.", "او درباره سفرش در زمان صحبت کرد."),
                    StoryParagraph("He said death was not the end.", "او گفت مرگ پایان نیست."),
                    StoryParagraph("He said everyone is alive in some moment.", "او گفت هر کس در لحظه‌ای زنده است."),
                    StoryParagraph("The audience laughed at him.", "حضار به او خندیدند."),
                    StoryParagraph("After the speech, he walked outside.", "بعد از سخنرانی، بیرون رفت."),
                    StoryParagraph("He saw Paul Lazzaro waiting.", "او پاول لازارو را دید که منتظر است."),
                    StoryParagraph("Lazzaro had a gun.", "لازارو اسلحه داشت."),
                    StoryParagraph("He shot Billy several times.", "او چند بار به بیلی شلیک کرد."),
                    StoryParagraph("Billy fell to the ground.", "بیلی روی زمین افتاد."),
                    StoryParagraph("But he was not afraid.", "اما نترسید."),
                    StoryParagraph("He had lived and relived his life many times.", "او زندگی‌اش را بارها زندگی و دوباره زندگی کرده بود."),
                    StoryParagraph("And that was enough.", "و این کافی بود."),
                    StoryParagraph("So it goes.", "همینطوره.")
                )
            )
        )
    )

    // ─────────────── ۲۷: تحمل‌ناپذیری هستی ───────────────
    private fun story27() = StoryContent(
        storyId = "adv_the_unbearable_lightness_of_being",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Prague Doctor", titlePersian = "دکتر پراگی",
                paragraphs = listOf(
                    StoryParagraph("Tomas was a successful surgeon in Prague.", "توماس جراح موفقی در پراگ بود."),
                    StoryParagraph("He was divorced and lived alone.", "او طلاق گرفته بود و تنها زندگی می‌کرد."),
                    StoryParagraph("He had many lovers.", "او عاشقان زیادی داشت."),
                    StoryParagraph("He loved women but did not love love.", "او زنان را دوست داشت اما عشق را دوست نداشت."),
                    StoryParagraph("He said love and sex were different things.", "او می‌گفت عشق و رابطه دو چیز متفاوتند."),
                    StoryParagraph("He was a man of lightness.", "او مردی از سبکی بود."),
                    StoryParagraph("He did not want responsibilities.", "او مسئولیت نمی‌خواست."),
                    StoryParagraph("He did not want to be tied down.", "نمی‌خواست مقید شود."),
                    StoryParagraph("One day, he met a young woman in a small town.", "یک روز، زن جوانی را در شهر کوچکی ملاقات کرد."),
                    StoryParagraph("Her name was Tereza.", "اسمش ترزا بود."),
                    StoryParagraph("She was a waitress in a hotel.", "او پیشخدمت هتلی بود."),
                    StoryParagraph("She was simple and innocent.", "او ساده و بی‌گناه بود."),
                    StoryParagraph("They spent one evening together.", "آن‌ها یک عصر را با هم گذراندند."),
                    StoryParagraph("Then Tomas returned to Prague.", "بعد توماس به پراگ برگشت."),
                    StoryParagraph("But he could not forget her.", "اما نمی‌توانست فراموشش کند."),
                    StoryParagraph("Something about her called to him.", "چیزی درباره‌اش صدایش می‌زد."),
                    StoryParagraph("He felt a heaviness he had never felt.", "سنگینی‌ای حس کرد که هرگز حس نکرده بود."),
                    StoryParagraph("He wanted to see her again.", "می‌خواست دوباره ببیندش."),
                    StoryParagraph("So he went back to her town.", "پس به شهرش برگشت."),
                    StoryParagraph("He asked her to come to Prague.", "او از او خواست به پراگ بیاید.")
                )
            ),
            StoryChapter(
                number = 2, title = "Tereza's Love", titlePersian = "عشق ترزا",
                paragraphs = listOf(
                    StoryParagraph("Tereza came to Prague with a heavy suitcase.", "ترزا با چمدانی سنگین به پراگ آمد."),
                    StoryParagraph("She had left her home and her mother.", "او خانه و مادرش را ترک کرده بود."),
                    StoryParagraph("Her mother was a bitter woman.", "مادرش زنی تلخ بود."),
                    StoryParagraph("She had ruined Tereza's childhood.", "او کودکی ترزا را نابود کرده بود."),
                    StoryParagraph("Tereza wanted a new life.", "ترزا زندگی جدیدی می‌خواست."),
                    StoryParagraph("She wanted to be loved.", "می‌خواست دوست داشته شود."),
                    StoryParagraph("She loved Tomas deeply.", "او عمیقاً توماس را دوست داشت."),
                    StoryParagraph("But she was always afraid.", "اما همیشه می‌ترسید."),
                    StoryParagraph("Tomas had other women.", "توماس زنان دیگری داشت."),
                    StoryParagraph("Tereza knew this and suffered.", "ترزا می‌دانست و رنج می‌کشید."),
                    StoryParagraph("She had terrible nightmares.", "او کابوس‌های وحشتناکی داشت."),
                    StoryParagraph("She dreamed of Tomas with other women.", "خواب می‌دید توماس با زنان دیگر است."),
                    StoryParagraph("She woke up shaking and crying.", "او لرزان و گریان بیدار می‌شد."),
                    StoryParagraph("Tomas did not understand her pain.", "توماس دردش را نمی‌فهمید."),
                    StoryParagraph("He thought he had done nothing wrong.", "او فکر می‌کرد کار اشتباهی نکرده."),
                    StoryParagraph("For him, sex was not love.", "برای او، رابطه عشق نبود."),
                    StoryParagraph("But for Tereza, they were the same.", "اما برای ترزا، یکی بودند."),
                    StoryParagraph("She wanted him to belong only to her.", "می‌خواست او فقط به او تعلق داشته باشد."),
                    StoryParagraph("She became his heaviest burden.", "او سنگین‌ترین بارش شد."),
                    StoryParagraph("But he could not let her go.", "اما نمی‌توانست رهایش کند.")
                )
            ),
            StoryChapter(
                number = 3, title = "Sabina the Artist", titlePersian = "سابینا نقاش",
                paragraphs = listOf(
                    StoryParagraph("Sabina was one of Tomas's lovers.", "سابینا یکی از عاشقان توماس بود."),
                    StoryParagraph("She was a painter.", "او نقاش بود."),
                    StoryParagraph("She was free and independent.", "او آزاد و مستقل بود."),
                    StoryParagraph("She did not want love or commitment.", "او عشق یا تعهد نمی‌خواست."),
                    StoryParagraph("She was the opposite of Tereza.", "او نقطه مقابل ترزا بود."),
                    StoryParagraph("She liked Tomas because he was free too.", "او توماس را دوست داشت چون او هم آزاد بود."),
                    StoryParagraph("They understood each other.", "آن‌ها هم را می‌فهمیدند."),
                    StoryParagraph("One day, Sabina went to a protest meeting.", "یک روز، سابینا به جلسه اعتراضی رفت."),
                    StoryParagraph("The communists had taken over the country.", "کمونیست‌ها کشور را گرفته بودند."),
                    StoryParagraph("Many people suffered under them.", "افراد زیادی زیر دستشان رنج کشیدند."),
                    StoryParagraph("Sabina felt she had to act.", "سابینا احساس کرد باید کاری کند."),
                    StoryParagraph("Tomas was there too.", "توماس هم آنجا بود."),
                    StoryParagraph("Tereza also came, to see Tomas.", "ترزا هم آمد، تا توماس را ببیند."),
                    StoryParagraph("She saw Sabina and Tomas together.", "او سابینا و توماس را با هم دید."),
                    StoryParagraph("She was hurt and jealous.", "او زخمی و حسود شد."),
                    StoryParagraph("But she did not say anything.", "اما چیزی نگفت."),
                    StoryParagraph("She also had a camera.", "او دوربینی هم داشت."),
                    StoryParagraph("She took pictures of the protests.", "او از اعتراضات عکس گرفت."),
                    StoryParagraph("The pictures became important.", "عکس‌ها مهم شدند."),
                    StoryParagraph("They showed the truth of the time.", "آن‌ها حقیقت زمانه را نشان می‌دادند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Russian Invasion", titlePersian = "تهاجم روسیه",
                paragraphs = listOf(
                    StoryParagraph("In 1968, Russian tanks invaded Prague.", "در سال ۱۹۶۸، تانک‌های روسی به پراگ حمله کردند."),
                    StoryParagraph("The people were helpless.", "مردم درمانده بودند."),
                    StoryParagraph("They threw stones at the tanks.", "آن‌ها به تانک‌ها سنگ پرت کردند."),
                    StoryParagraph("But they could not stop them.", "اما نمی‌توانستند متوقفشان کنند."),
                    StoryParagraph("Tereza photographed the invasion.", "ترزا از تهاجم عکس گرفت."),
                    StoryParagraph("She gave the film to journalists.", "او فیلم را به روزنامه‌نگاران داد."),
                    StoryParagraph("The pictures went around the world.", "عکس‌ها دور دنیا چرخیدند."),
                    StoryParagraph("Tomas and Tereza decided to leave.", "توماس و ترزا تصمیم گرفتند بروند."),
                    StoryParagraph("They moved to Switzerland.", "آن‌ها به سوئیس رفتند."),
                    StoryParagraph("Tereza was sad and lonely there.", "ترزا آنجا غمگین و تنها بود."),
                    StoryParagraph("She could not speak the language.", "او نمی‌توانست زبان را صحبت کند."),
                    StoryParagraph("She missed her country.", "دلتنگ کشورش بود."),
                    StoryParagraph("Tomas was happy and busy.", "توماس خوشحال و مشغول بود."),
                    StoryParagraph("He found work as a doctor.", "او کار به عنوان دکتر پیدا کرد."),
                    StoryParagraph("Sabina was also in Switzerland.", "سابینا هم در سوئیس بود."),
                    StoryParagraph("Tomas continued to see her.", "توماس به دیدنش ادامه داد."),
                    StoryParagraph("Tereza could not bear it anymore.", "ترزا دیگر نمی‌توانست تحمل کند."),
                    StoryParagraph("She returned to Prague alone.", "او تنها به پراگ برگشت."),
                    StoryParagraph("Tomas followed her back.", "توماس هم دنبالش برگشت."),
                    StoryParagraph("He chose her over his freedom.", "او او را بر آزادی‌اش ترجیح داد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Countryside", titlePersian = "روستا",
                paragraphs = listOf(
                    StoryParagraph("Back in Prague, Tomas lost his job.", "در پراگ، توماس شغلش را از دست داد."),
                    StoryParagraph("He had written an article years ago.", "سال‌ها پیش مقاله‌ای نوشته بود."),
                    StoryParagraph("The communists did not like it.", "کمونیست‌ها دوستش نداشتند."),
                    StoryParagraph("So he could not work as a doctor.", "پس نمی‌توانست به عنوان دکتر کار کند."),
                    StoryParagraph("He became a window washer.", "او شیشه‌شور شد."),
                    StoryParagraph("He was free but lost his purpose.", "او آزاد بود اما هدفش را از دست داده بود."),
                    StoryParagraph("Tereza worked in a bar.", "ترزا در باری کار می‌کرد."),
                    StoryParagraph("They were poor but together.", "آن‌ها فقیر اما با هم بودند."),
                    StoryParagraph("Tereza suggested moving to the countryside.", "ترزا پیشنهاد کرد به روستا بروند."),
                    StoryParagraph("Tomas agreed.", "توماس موافقت کرد."),
                    StoryParagraph("They bought a small farm.", "آن‌ها مزرعه کوچکی خریدند."),
                    StoryParagraph("They had a dog named Karenin.", "آن‌ها سگی به نام کارنین داشتند."),
                    StoryParagraph("Life was simple and quiet.", "زندگی ساده و آرام بود."),
                    StoryParagraph("They danced in the village.", "آن‌ها در دهکده می‌رقصیدند."),
                    StoryParagraph("They drank beer with neighbors.", "با همسایه‌ها آبجو می‌نوشیدند."),
                    StoryParagraph("For the first time, Tereza felt happy.", "برای اولین بار، ترزا خوشحال حس کرد."),
                    StoryParagraph("Tomas felt peaceful too.", "توماس هم آرامش حس کرد."),
                    StoryParagraph("They grew old together.", "آن‌ها با هم پیر شدند."),
                    StoryParagraph("One day, their truck crashed on a hill.", "یک روز، کامیونشان روی تپه‌ای تصادف کرد."),
                    StoryParagraph("They died together under the trees.", "آن‌ها با هم زیر درختان مردند.")
                )
            )
        )
    )
}