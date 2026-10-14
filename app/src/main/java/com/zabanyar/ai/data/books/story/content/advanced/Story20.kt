package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * ۲۰. لولیتا — ولادیمیر ناباکوف
 */
object Story20 {

    fun get(): StoryContent = StoryContent(
        storyId = "adv_lolita",
        chapters = listOf(
            chapter1(),
            chapter2(),
            chapter3(),
            chapter4(),
            chapter5(),
            chapter6(),
        )
    )

    // ─────────── فصل ۱: جوانی هومبرت ───────────
    private fun chapter1() = StoryChapter(
        number = 1, title = "Humbert's Youth", titlePersian = "جوانی هومبرت",
        paragraphs = listOf(
            StoryParagraph("My name is Humbert Humbert, and I was born in Paris in 1910, the son of a Swiss father and an English mother.", "نام من هومبرت هومبرت است و در سال ۱۹۱۰ در پاریس زاده شدم، پسر پدری سوئیسی و مادری انگلیسی."),
            StoryParagraph("My father was a wealthy businessman who collected rare books and beautiful women; my mother was a woman of refined taste and fragile health.", "پدرم تاجری ثروتمند بود که کتاب‌های کمیاب و زنان زیبا جمع می‌کرد؛ مادرم زنی با ذوقی لطیف و سلامتی شکننده بود."),
            StoryParagraph("I was raised in luxury, in a world of servants and gardens and fine things; but I was a lonely child, an only child, a child who lived mostly in his own mind.", "در تجمل بزرگ شدم، در جهانی از خدمتکاران و باغ‌ها و چیزهای نفیس؛ اما بچه‌ای تنها بودم، تک‌فرزند، بچه‌ای که بیشتر در ذهن خودش زندگی می‌کرد."),
            StoryParagraph("I was intelligent, precocious, given to reading books beyond my years and dreaming dreams beyond my understanding.", "باهوش بودم، پیش‌رس، عادت داشتم کتاب‌هایی فراتر از سنم بخوانم و رؤیاهایی فراتر از فهمم ببینم."),
            StoryParagraph("When I was thirteen years old, I fell in love for the first time — and, as it would turn out, for the only time that truly mattered.", "وقتی سیزده ساله بودم، نخستین بار عاشق شدم — و همانطور که معلوم شد، تنها بار واقعی."),
            StoryParagraph("Her name was Annabel Leigh, and she was the same age as me, the daughter of English tourists staying at the same hotel as my family.", "نامش آنابل لی بود و هم‌سن من، دختر گردشگران انگلیسی که در همان هتلی می‌ماندند که خانواده‌ام."),
            StoryParagraph("We met on the beach, one summer morning, and something passed between us that I have never been able to forget.", "یک صبح تابستانی در ساحل هم را ملاقات کردیم و چیزی میانمان رد شد که هرگز نتوانسته‌ام فراموشش کنم."),
            StoryParagraph("She had long brown hair, and soft skin, and eyes the color of honey; and she had a smile that seemed to promise everything.", "موهای بلند قهوه‌ای داشت و پوستی لطیف و چشمانی به رنگ عسل؛ و لبخندی داشت که به نظر می‌رسید همه چیز را وعده می‌دهد."),
            StoryParagraph("I loved her with an intensity that frightened me, a love that was pure and passionate and utterly overwhelming.", "او را با شدتی دوست داشتم که می‌ترساندم، عشقی که پاک بود و پرشور و کاملاً طاقت‌فرسا."),
            StoryParagraph("We spent that summer together, in a world of our own, a world of sunlight and sea and secret kisses.", "آن تابستان را با هم گذراندیم، در جهانی از خودمان، جهانی از آفتاب و دریا و بوسه‌های پنهانی."),
            StoryParagraph("But we were only children, and our parents found out, and they separated us before anything could happen.", "اما ما فقط بچه بودیم و والدینمان فهمیدند و قبل از اینکه چیزی اتفاق بیفتد جدایمان کردند."),
            StoryParagraph("They sent Annabel away, back to England, back to her own life, and I was left alone with a love that had nowhere to go.", "آنابل را دور فرستادند، برگرداندند به انگلیس، به زندگی خودش و من با عشقی که هیچ‌جا نداشت بماند تنها شدم."),
            StoryParagraph("A few months later, I received a letter from her mother: Annabel had died of typhus, in a small town in the south of England.", "چند ماه بعد نامه‌ای از مادرش دریافت کردم: آنابل از تیفوس مرده بود، در شهرکی در جنوب انگلیس."),
            StoryParagraph("I did not believe it at first; I could not believe it; I refused to believe it.", "اول باور نکردم؛ نمی‌توانستم باور کنم؛ از باور کردن امتناع کردم."),
            StoryParagraph("But it was true; she was gone; my love was gone; and something in me broke, forever.", "اما درست بود؛ رفته بود؛ عشقم رفته بود؛ و چیزی در من شکست، برای همیشه."),
            StoryParagraph("From that day on, I was a different person. I became obsessed with the memory of Annabel, with the search for her, with the impossible hope of finding her again.", "از آن روز، شخص دیگری شدم. وسواس خاطره آنابل شدم، وسواس جستجویش، وسواس امید ناممکن یافتن دوباره‌اش."),
            StoryParagraph("I searched for her in every woman I met; but no woman could ever satisfy me, because no woman was her.", "در هر زنی که ملاقات می‌کردم دنبالش گشتم؛ اما هیچ زنی نمی‌توانست ارضایم کند، چون هیچ زنی او نبود."),
            StoryParagraph("I married a woman named Valeria, a Polish girl with a dull mind and a heavy body; I married her, I think, because she was the opposite of Annabel.", "با زنی به نام والریا ازدواج کردم، دختری لهستانی با ذهنی کُند و بدنی سنگین؛ فکر می‌کنم با او ازدواج کردم چون نقطه مقابل آنابل بود."),
            StoryParagraph("The marriage was a disaster, as I knew it would be; Valeria left me, and I was alone again.", "ازدواج فاجعه بود، همانطور که می‌دانستم می‌شود؛ والریا ترکم کرد و دوباره تنها شدم."),
            StoryParagraph("I spent the next years in a kind of waking sleep, going through the motions of life without ever truly living.", "سال‌های بعدی را در نوعی خواب بیدار گذراندم، به ظاهر زندگی می‌کردم بدون اینکه هرگز به‌راستی زندگی کنم."),
            StoryParagraph("I taught French literature at a small university; I wrote articles; I traveled; I did all the things that a man of culture is supposed to do.", "ادبیات فرانسه در دانشگاهی کوچک تدریس کردم؛ مقاله نوشتم؛ سفر کردم؛ همه کارهایی را کردم که از مردی اهل فرهنگ انتظار می‌رود."),
            StoryParagraph("But inside, I was empty; inside, I was waiting; inside, I was still hoping, against all reason, for something that could never be.", "اما درونم خالی بود؛ درونم منتظر بود؛ درونم هنوز امیدوار بود، برخلاف همه منطق، به چیزی که هرگز نمی‌توانست باشد."),
            StoryParagraph("And then, in 1947, I came to America.", "و بعد، در ۱۹۴۷، به آمریکا آمدم."),
            StoryParagraph("I came because I had been offered a teaching position, and because I wanted to write a book, and because I wanted, perhaps, to start my life over.", "آمدم چون موقعیت تدریسی به من پیشنهاد شده بود و چون می‌خواستم کتابی بنویسم و چون شاید می‌خواستم زندگی‌ام را از نو شروع کنم."),
            StoryParagraph("I came because I had nothing to lose, and because I had nothing to keep, and because I was, in a sense, already dead.", "آمدم چون چیزی برای از دست دادن نداشتم و چون چیزی برای نگه داشتن نداشتم و چون به نوعی از قبل مرده بودم."),
            StoryParagraph("I did not know that America would give me, at last, what I had been seeking for all those years.", "نمی‌دانستم آمریکا در نهایت آنچه را که این همه سال در جستجویش بودم به من می‌دهد."),
            StoryParagraph("And I did not know that this gift would destroy me.", "و نمی‌دانستم این هدیه نابودم می‌کند.")
        )
    )

    // ─────────── فصل ۲: ملاقات دولورس ───────────
    private fun chapter2() = StoryChapter(
        number = 2, title = "Meeting Dolores", titlePersian = "ملاقات دولورس",
        paragraphs = listOf(
            StoryParagraph("I arrived in the small town of Ramsdale in the summer of 1947, and I rented a room in the house of a widow named Charlotte Haze.", "در تابستان ۱۹۴۷ به شهر کوچک رامزدیل رسیدم و اتاقی در خانه بیوه‌ای به نام شارلوت هیز اجاره کردم."),
            StoryParagraph("Charlotte was a woman of about thirty-five, pleasant-looking, eager to please, and full of opinions about everything.", "شارلوت زنی حدوداً سی و پنج ساله بود، خوش‌ظاهر، مشتاق خوشامد، و پر از نظر درباره هر چیزی."),
            StoryParagraph("She talked constantly — about her late husband, about her daughter, about the books she had read and the places she had been.", "مدام صحبت می‌کرد — درباره شوهر مرحومش، درباره دخترش، درباره کتاب‌هایی که خوانده و جاهایی که بوده."),
            StoryParagraph("She talked, I think, because she was lonely; she talked because she wanted to be liked; she talked because she had nothing else to do.", "فکر می‌کنم صحبت می‌کرد چون تنها بود؛ صحبت می‌کرد چون می‌خواست دوست داشته شود؛ صحبت می‌کرد چون کار دیگری نداشت."),
            StoryParagraph("And then, on my first afternoon in the house, I saw her daughter.", "و بعد، در نخستین بعدازظهرم در خانه، دخترش را دیدم."),
            StoryParagraph("She was lying on her stomach on the lawn, in the shade of an apple tree, reading a movie magazine.", "روی شکمش روی چمن دراز کشیده بود، در سایه درخت سیبی، مجله سینمایی می‌خواند."),
            StoryParagraph("She was wearing a blue sundress, and her legs were bare, and her hair was the color of honey.", "پیراهنی آبی به تن داشت و پاهایش برهنه بود و موهایش به رنگ عسل."),
            StoryParagraph("She looked up when she heard me, and she smiled, and the world stopped.", "با شنیدن من سر بلند کرد و لبخند زد و جهان ایستاد."),
            StoryParagraph("Her name was Dolores Haze, but everyone called her Lolita.", "نامش دلورس هیز بود اما همه لولیتا صدایش می‌زدند."),
            StoryParagraph("She was twelve years old — almost thirteen — and she was the exact image of Annabel Leigh.", "دوازده سال داشت — نزدیک سیزده — و تصویر دقیق آنابل لی بود."),
            StoryParagraph("The same long brown hair, the same soft skin, the same honey-colored eyes, the same smile that promised everything.", "همان موهای بلند قهوه‌ای، همان پوست لطیف، همان چشمان عسلی، همان لبخندی که همه چیز را وعده می‌داد."),
            StoryParagraph("I stood there, unable to move, unable to speak, unable to breathe; I was seeing a ghost, a memory, a dream.", "آنجا ایستادم، ناتوان از حرکت، ناتوان از سخن، ناتوان از نفس کشیدن؛ شبحی می‌دیدم، خاطره‌ای، رؤیایی."),
            StoryParagraph("'Hello,' she said. 'You must be the new lodger. I'm Lo.'", "گفت: «سلام. شما باید مستأجر جدید باشید. من لو هستم.»"),
            StoryParagraph("I tried to speak, and my voice came out strange. 'Hello, Lo,' I said. 'I am Mr. Humbert.'", "تلاش کردم صحبت کنم و صدایم عجیب بیرون آمد. گفتم: «سلام لو. من آقای هومبرت هستم.»"),
            StoryParagraph("'That's a funny name,' she said, and she laughed, and her laugh was like music.", "گفت: «چه اسم خنده‌داری.» و خندید و خنده‌اش مثل موسیقی بود."),
            StoryParagraph("'Yes,' I said. 'It is a funny name. But it is my name.'", "گفتم: «بله. اسم خنده‌داری است. اما نام من است.»"),
            StoryParagraph("She looked at me with curiosity, the way children look at adults they do not yet know how to classify.", "با کنجکاوی نگاهم کرد، همانطور که بچه‌ها به بزرگسالانی نگاه می‌کنند که هنوز نمی‌دانند چگونه دسته‌بندی‌شان کنند."),
            StoryParagraph("'Are you going to stay long?' she asked.", "پرسید: «می‌خواهید مدت طولانی بمانید؟»"),
            StoryParagraph("'I do not know,' I said. 'Perhaps.'", "گفتم: «نمی‌دانم. شاید.»"),
            StoryParagraph("'I hope you do,' she said. 'It's boring here in the summer.'", "گفت: «امیدوارم بمانید. تابستان اینجا کسل‌کننده است.»"),
            StoryParagraph("And then she went back to her magazine, and I went into the house, and I sat in my room, and I tried to understand what had just happened.", "و بعد به مجله‌اش برگشت و من به خانه رفتم و در اتاقم نشستم و تلاش کردم بفهمم چه اتفاقی افتاده."),
            StoryParagraph("I had come to America to escape the past; and the past had been waiting for me, in the form of a twelve-year-old girl.", "به آمریکا آمده بودم تا از گذشته بگریزم؛ و گذشته منتظرم بود، در قالب دختری دوازده ساله."),
            StoryParagraph("I knew, even then, that what I was feeling was wrong; I knew that it was forbidden, dangerous, destructive.", "حتی همان موقع می‌دانستم آنچه حس می‌کنم اشتباه است؛ می‌دانستم ممنوع است، خطرناک، ویران‌گر."),
            StoryParagraph("But I also knew that I could not resist it; I could not turn away; I could not save myself.", "اما همچنین می‌دانستم نمی‌توانم مقاومتش کنم؛ نمی‌توانم روی برگردانم؛ نمی‌توانم نجات خودم دهم."),
            StoryParagraph("The nymphet, the demon-child, the impossible love — she was here, at last, in Ramsdale, in the house of her mother, in my life.", "نیمف، بچه-شیطان، عشق ناممکن — بالاخره اینجا بود، در رامزدیل، در خانه مادرش، در زندگی من."),
            StoryParagraph("And I knew, with a certainty that was both terrible and beautiful, that I would do anything — anything at all — to possess her.", "و با یقینی که هم هولناک بود و هم زیبا می‌دانستم هر کاری می‌کنم — هر کاری — تا مالکش شوم."),
            StoryParagraph("So began the ruin of Humbert Humbert.", "و اینگونه نابودی هومبرت هومبرت آغاز شد."),
            StoryParagraph("So began the story of Lolita.", "و اینگونه داستان لولیتا آغاز شد."),
            StoryParagraph("A story of obsession and madness, of cruelty and tenderness, of beauty and horror, all intertwined.", "داستانی از وسواس و جنون، از بی‌رحمی و لطافت، از زیبایی و وحشت، همه درهم‌بافته."),
            StoryParagraph("A story of a man who loved a child, and destroyed her, and destroyed himself, and wrote it all down as a confession.", "داستانی از مردی که بچه‌ای را دوست داشت و نابودش کرد و خودش را نابود کرد و همه‌اش را همچون اعترافی نوشت."),
            StoryParagraph("A story that would be read, and debated, and condemned, and admired, for generations to come.", "داستانی که خوانده می‌شود و بحث می‌شود و محکوم می‌شود و تحسین می‌شود، برای نسل‌های آینده."),
            StoryParagraph("For Lolita is not a love story; it is a horror story, told by the monster himself.", "زیرا لولیتا داستان عشق نیست؛ داستان وحشت است، گفته‌شده توسط خودِ هیولا."),
            StoryParagraph("And yet, in its terrible beauty, in its astonishing language, in its unflinching honesty, it is also one of the greatest novels ever written.", "و با این حال، در زیبایی هولناکش، در زبان حیرت‌انگیزش، در صداقت بی‌لرزشش، یکی از بزرگ‌ترین رمان‌های نوشته‌شده هم هست.")
        )
    )

    // ─────────── فصل ۳: در جاده ───────────
    private fun chapter3() = StoryChapter(
        number = 3, title = "On the Road", titlePersian = "در جاده",
        paragraphs = listOf(
            StoryParagraph("Charlotte Haze fell in love with me, or with what she imagined I was, which was perhaps even more dangerous.", "شارلوت هیز عاشقم شد، یا عاشق آنچه تصور می‌کرد هستم شد، که شاید حتی خطرناک‌تر بود."),
            StoryParagraph("She saw in me a European gentleman, a man of culture, a man who could give her the life she had always dreamed of.", "در من جنتلمنی اروپایی دید، مردی اهل فرهنگ، مردی که می‌توانست زندگی‌ای که همیشه در خوابش دیده بود به او بدهد."),
            StoryParagraph("I did not love her; I never loved her; I could not love her; but I married her, because I wanted to be near her daughter.", "او را دوست نداشتم؛ هرگز دوستش نداشتم؛ نمی‌توانستم دوستش بدارم؛ اما با او ازدواج کردم، چون می‌خواستم نزدیک دخترش باشم."),
            StoryParagraph("It was a monstrous thing to do, and I knew it was monstrous; but I did it anyway, and I told myself that I had no choice.", "کار هیولاگونه‌ای بود و می‌دانستم هیولاگونه است؛ اما به هر حال انجامش دادم و به خودم گفتم چاره‌ای ندارم."),
            StoryParagraph("Charlotte, poor foolish Charlotte, was happy; she had no idea what she had married, no idea what was coming.", "شارلوت، شارلوت بیچاره و احمق، خوشحال بود؛ هیچ ایده‌ای نداشت با چه ازدواج کرده، هیچ ایده‌ای نداشت چه در راه است."),
            StoryParagraph("She wrote in her diary about her love for me, about her dreams for our life together, about her plans for our future.", "در دفترش درباره عشقش به من نوشت، درباره رؤیاهایش برای زندگی مشترکمان، درباره نقشه‌هایش برای آینده‌مان."),
            StoryParagraph("She wrote about her daughter too, about how she hoped I would be a father to Lolita, a guide, a protector.", "درباره دخترش هم نوشت، درباره اینکه امیدوار بود پدری برای لولیتا باشم، راهنما، محافظ."),
            StoryParagraph("I read her diary, secretly, one night, when she was asleep; and I found there something that terrified me.", "یک شب که خواب بود دزدانه دفترش را خواندم؛ و آنجا چیزی یافتم که هراسانم کرد."),
            StoryParagraph("She had decided to send Lolita away, to a boarding school, because she sensed something between me and the girl, something she could not name.", "تصمیم گرفته بود لولیتا را دور بفرستد، به مدرسه شبانه‌روزی، چون چیزی بین من و دختر حس کرده بود، چیزی که نمی‌توانست نامش را ببرد."),
            StoryParagraph("She did not know what it was; she did not suspect the truth; but she sensed a threat, and she was acting to remove it.", "نمی‌دانست چیست؛ به حقیقت شک نمی‌کرد؛ اما تهدیدی حس کرده بود و برای رفعش عمل می‌کرد."),
            StoryParagraph("I could not allow this; I could not lose Lolita; I could not let her go.", "نمی‌توانستم این را بگذارم؛ نمی‌توانستم لولیتا را از دست بدهم؛ نمی‌توانستم رهایش کنم."),
            StoryParagraph("So I made a plan; a terrible plan; a plan that would change everything.", "پس نقشه‌ای کشیدم؛ نقشه‌ای هولناک؛ نقشه‌ای که همه چیز را تغییر می‌داد."),
            StoryParagraph("I wrote a letter to Charlotte, a cruel letter, a letter in which I told her that I did not love her, that I had never loved her, that I wanted a divorce.", "نامه‌ای به شارلوت نوشتم، نامه‌ای بی‌رحم، نامه‌ای که در آن گفتم دوستش ندارم، هرگز نداشتم، طلاق می‌خواهم."),
            StoryParagraph("I left the letter on the table, where she would find it; and then I went out, pretending to go for a walk.", "نامه را روی میز گذاشتم، جایی که پیدایش می‌کرد؛ و بعد بیرون رفتم، تظاهر به قدم زدن."),
            StoryParagraph("When I came back, I found her on the floor, in the rain, struck by a car.", "وقتی برگشتم او را روی زمین یافتم، زیر باران، ماشین زده بودش."),
            StoryParagraph("She had run out of the house after reading the letter; she had run into the street without looking; and a car had hit her.", "پس از خواندن نامه از خانه دویده بود؛ بدون نگاه کردن به خیابان دویده بود؛ و ماشینی زده بودش."),
            StoryParagraph("She died that evening, in the hospital, without ever regaining consciousness.", "آن عصر در بیمارستان مرد، بدون اینکه هرگز به هوش بیاید."),
            StoryParagraph("I was not sad; I could not be sad; because now, at last, Lolita was mine.", "ناراحت نبودم؛ نمی‌توانستم ناراحت باشم؛ زیرا حالا، بالاخره، لولیتا مال من بود."),
            StoryParagraph("I became her guardian, her protector, her everything; and I took her away from Ramsdale, away from the school, away from everything she had known.", "سرپرستش شدم، محافظش، همه چیزَش؛ و از رامزدیل دورش کردم، از مدرسه، از هر چیزی که می‌شناخت."),
            StoryParagraph("We drove across America, from town to town, from motel to motel, from diner to diner.", "سراسر آمریکا را رانندگی کردیم، از شهری به شهر، از متلی به متل، از رستورانی به رستوران."),
            StoryParagraph("We saw deserts, mountains, forests, cities; we saw the whole vast country, from coast to coast.", "بیابان‌ها را دیدیم، کوه‌ها، جنگل‌ها، شهرها؛ تمام کشور وسیع را دیدیم، از ساحل به ساحل."),
            StoryParagraph("Everywhere we went, I feared being caught, being found out, being exposed; everywhere we went, I watched and waited.", "هر جا می‌رفتیم می‌ترسیدم دستگیر شوم، کشف شوم، افشا شوم؛ هر جا می‌رفتیم، تماشا می‌کردم و منتظر می‌ماندم."),
            StoryParagraph("But we were not caught; we were not found out; we were not exposed; and so we continued, day after day, week after week, month after month.", "اما دستگیر نشدیم؛ کشف نشدیم؛ افشا نشدیم؛ و اینگونه ادامه دادیم، روز پس از روز، هفته پس از هفته، ماه پس از ماه."),
            StoryParagraph("Lolita, poor Lolita, was not happy; how could she be happy?", "لولیتا، لولیتای بیچاره، خوشحال نبود؛ چطور می‌توانست خوشحال باشد؟"),
            StoryParagraph("She was a child, and she was being treated as a woman; she was innocent, and she was being forced into a world she did not understand.", "او بچه بود و مثل زن با او رفتار می‌شد؛ معصوم بود و به جهانی رانده می‌شد که نمی‌فهمید."),
            StoryParagraph("She did what she was told, mostly; she went where I took her; she did what I wanted; but she was not really alive.", "اکثراً آنچه به او می‌گفتم انجام می‌داد؛ به هر جا می‌بردمش می‌رفت؛ آنچه می‌خواستم می‌کرد؛ اما واقعاً زنده نبود."),
            StoryParagraph("Her laughter grew rarer; her eyes grew duller; her spirit grew smaller; and I, who loved her, watched her die by inches.", "خنده‌اش نایاب‌تر شد؛ چشمانش کدرتر؛ روحش کوچک‌تر؛ و من که دوستش داشتم، اینچ‌به‌اینچ تماشا کردم که می‌میرد."),
            StoryParagraph("And still I did not stop; I could not stop; the obsession was too strong, the madness was too deep, the love was too terrible.", "و هنوز متوقف نشدم؛ نمی‌توانستم متوقف شوم؛ وسواس بیش از حد قوی بود، جنون بیش از حد عمیق، عشق بیش از حد هولناک."),
            StoryParagraph("I told myself that I was protecting her, that I was giving her a life of adventure and freedom.", "به خودم گفتم محافظتش می‌کنم، به او زندگی‌ای از ماجراجویی و آزادی می‌دهم."),
            StoryParagraph("But I knew, in my heart, that I was destroying her, that I was consuming her, that I was eating her alive.", "اما در قلبم می‌دانستم نابودش می‌کنم، می‌بلعمش، زنده‌زنده می‌خورمش."),
            StoryParagraph("And so the road went on, and the towns went past, and the days went by, and Lolita grew older, and I grew more desperate.", "و اینگونه جاده ادامه یافت و شهرها گذشتند و روزها گذشتند و لولیتا پیرتر شد و من درمانده‌تر."),
            StoryParagraph("Until, at last, we arrived in the town of Beardsley, where everything would change.", "تا اینکه، سرانجام، به شهر بردزلی رسیدیم، جایی که همه چیز تغییر می‌کرد."),
            StoryParagraph("Until, at last, we came to the end of the beginning.", "تا اینکه، سرانجام، به پایان آغاز رسیدیم.")
        )
    )

    // ─────────── فصل ۴: فرار ───────────
    private fun chapter4() = StoryChapter(
        number = 4, title = "The Escape", titlePersian = "فرار",
        paragraphs = listOf(
            StoryParagraph("In Beardsley, I enrolled Lolita in a girls' school, and I pretended to be a respectable widower raising his daughter.", "در بردزلی، لولیتا را در مدرسه دخترانه ثبت‌نام کردم و تظاهر کردم بیوه‌ای محترم هستم که دخترش را بزرگ می‌کند."),
            StoryParagraph("The school was progressive, and the teachers were enlightened, and the girls were encouraged to express themselves.", "مدرسه پیشرو بود و معلمان روشن‌فکر و دخترها تشویق می‌شدند خودشان را بیان کنند."),
            StoryParagraph("Lolita threw herself into it all with an energy that surprised me; she joined the school play, she made friends, she began to have a life of her own.", "لولیتا با انرژی‌ای که حیرت‌زده‌ام کرد خودش را به همه‌اش انداخت؛ در نمایش مدرسه شرکت کرد، دوست پیدا کرد، شروع کرد به داشتن زندگی خودش."),
            StoryParagraph("I should have been happy for her; I should have been glad to see her happy; but I was not happy, and I was not glad.", "باید برایش خوشحال می‌بودم؛ باید خوشحال می‌شدم که خوشحالش می‌بینم؛ اما خوشحال نبودم و خوشحال نمی‌شدم."),
            StoryParagraph("I was jealous, jealous of her friends, jealous of her teachers, jealous of every person who took her attention away from me.", "حسود بودم، به دوستانش، به معلمانش، به هر کسی که توجهش را از من می‌گرفت."),
            StoryParagraph("I followed her, I watched her, I questioned her; I became the tyrant I had always feared I would become.", "دنبالش می‌کردم، تماشایش می‌کردم، بازپرسی‌اش می‌کردم؛ مستبدی شدم که همیشه می‌ترسیدم بشوم."),
            StoryParagraph("And then, one afternoon, I saw a man watching her from across the street.", "و بعد، یک بعدازظهر، مردی را دیدم که از آنسوی خیابان تماشایش می‌کرد."),
            StoryParagraph("He was tall, and he wore dark glasses, and he smiled a thin, knowing smile.", "بلندقد بود و عینک آفتابی تیره می‌زد و لبخندی نازک و آگاهانه می‌زد."),
            StoryParagraph("I did not recognize him, but something about him made me uneasy, something about him made me afraid.", "او را نمی‌شناختم اما چیزی در او ناآرامم می‌کرد، چیزی در او می‌ترساندم."),
            StoryParagraph("I saw him again a few days later, and then again a week after that; each time, he was watching, waiting, smiling.", "چند روز بعد دوباره دیدمش و بعد دوباره یک هفته بعد؛ هر بار، تماشا می‌کرد، منتظر می‌ماند، لبخند می‌زد."),
            StoryParagraph("I asked Lolita if she knew him, and she said no; but her eyes flickered when she said it, and I knew she was lying.", "از لولیتا پرسیدم می‌شناسدش و گفت نه؛ اما وقتی این را می‌گفت چشمانش سوسو زد و می‌دانستم دروغ می‌گوید."),
            StoryParagraph("I did not press her; I was too afraid of what I might learn; I was too afraid of losing her.", "اصرار نکردم؛ بیش از حد می‌ترسیدم از آنچه ممکن بود بفهمم؛ بیش از حد می‌ترسیدم از دست دادنش."),
            StoryParagraph("And then, on a rainy afternoon in April, when I came home from the library, Lolita was gone.", "و بعد، در بعدازظهری بارانی در آوریل، وقتی از کتابخانه به خانه آمدم، لولیتا رفته بود."),
            StoryParagraph("She had packed a small bag, and she had left a note, and she had walked out of the house.", "کیسه‌ای کوچک بسته بود و یادداشتی گذاشته بود و از خانه بیرون رفته بود."),
            StoryParagraph("The note said that she was leaving, that she could not stay with me any longer, that she was going somewhere she would be happy.", "یادداشت می‌گفت دارد می‌رود، نمی‌تواند بیشتر با من بماند، به جایی می‌رود که خوشحال باشد."),
            StoryParagraph("It did not say where, or with whom, or why; it simply said goodbye.", "نمی‌گفت کجا، یا با کی، یا چرا؛ تنها می‌گفت خداحافظ."),
            StoryParagraph("I went mad; I searched everywhere; I called the police, the schools, the hospitals; I did everything I could.", "دیوانه شدم؛ همه‌جا گشتم؛ به پلیس زنگ زدم، به مدارس، به بیمارستان‌ها؛ هر کاری می‌توانستم کردم."),
            StoryParagraph("But she was gone; she was truly gone; and I was alone again, more alone than I had ever been.", "اما رفته بود؛ به‌راستی رفته بود؛ و دوباره تنها بودم، تنهاتر از آنچه هرگز بودم."),
            StoryParagraph("For months, I searched for her; for years, I waited for news; but no news came.", "ماه‌ها دنبالش گشتم؛ سال‌ها منتظر خبری ماندم؛ اما هیچ خبری نیامد."),
            StoryParagraph("I became a ghost, a shadow, a man without a purpose; I wandered from town to town, from city to city, looking for the girl I had lost.", "شبحی شدم، سایه‌ای، مردی بدون هدف؛ از شهری به شهر سرگردان شدم، از شهری به شهر دیگر، دنبال دختری که از دست داده بودم."),
            StoryParagraph("I thought of her constantly; I dreamed of her every night; I could not eat, could not sleep, could not live.", "مدام به او فکر می‌کردم؛ هر شب خوابش را می‌دیدم؛ نمی‌توانستم بخورم، بخوابم، زندگی کنم."),
            StoryParagraph("I had destroyed her, and in destroying her, I had destroyed myself; and there was no undoing it, no forgiving it, no forgetting it.", "نابودش کرده بودم و در نابود کردنش، خودم را نابود کرده بودم؛ و بازگرداندنش نبود، نه بخشیدنش، نه فراموش کردنش."),
            StoryParagraph("And then, one day, in September, I received a letter.", "و بعد، یک روز، در سپتامبر، نامه‌ای دریافت کردم."),
            StoryParagraph("It was from Lolita.", "از لولیتا بود."),
            StoryParagraph("She was married, she wrote; she was pregnant, she wrote; she needed money, she wrote.", "نوشته بود ازدواج کرده؛ نوشته بود باردار است؛ نوشته بود به پول نیاز دارد."),
            StoryParagraph("She gave an address in a small town in the Midwest.", "آدرسی در شهرکی در غرب میانه داد."),
            StoryParagraph("She did not say she forgave me.", "نگفت بخشیده‌ام."),
            StoryParagraph("She did not say she loved me.", "نگفت دوستت دارم."),
            StoryParagraph("She simply asked for help.", "تنها کمک خواست."),
            StoryParagraph("And I, who had destroyed her, who had lost her, who had never stopped loving her, went to her at once.", "و من که نابودش کرده بودم، که از دستش داده بودم، که هرگز از دوست داشتنش دست نکشیده بودم، فوراً به نزدش رفتم.")
        )
    )

    // ─────────── فصل ۵: پایان ───────────
    private fun chapter5() = StoryChapter(
        number = 5, title = "The End", titlePersian = "پایان",
        paragraphs = listOf(
            StoryParagraph("I found her in a small, poor house on the edge of a small, poor town.", "او را در خانه‌ای کوچک و فقیر در حاشیه شهرکی کوچک و فقیر یافتم."),
            StoryParagraph("She was seventeen years old now, thin and tired, with the face of a woman who has aged too quickly.", "حالا هفده ساله بود، لاغر و خسته، با چهره زنی که زودتر از موعد پیر شده."),
            StoryParagraph("She did not look like Annabel anymore; she did not look like Lolita anymore; she looked like someone else entirely, someone I had never met.", "دیگر شبیه آنابل نبود؛ دیگر شبیه لولیتا نبود؛ شبیه شخص کاملاً دیگری بود، کسی که هرگز ملاقات نکرده بودم."),
            StoryParagraph("'Hello, Humbert,' she said, and her voice was flat, and her eyes were flat.", "گفت: «سلام هومبرت.» و صدایش تخت بود و چشمانش تخت."),
            StoryParagraph("'Hello, Lolita,' I said, and my voice broke.", "گفتم: «سلام لولیتا.» و صدایم شکست."),
            StoryParagraph("She was married to a young man named Dick Schiller, a mechanic, a veteran of the war, a simple and decent man.", "با مرد جوانی به نام دیک شیلر ازدواج کرده بود، مکانیکی، کهنه‌سرباز جنگ، مردی ساده و محترم."),
            StoryParagraph("She was pregnant with his child; she was going to be a mother; she was going to have a life, a real life, without me.", "از او باردار بود؛ مادر می‌شد؛ زندگی می‌داشت، زندگی‌ای واقعی، بدون من."),
            StoryParagraph("'You look terrible,' she said, and there was a hint of the old Lolita in her voice, a hint of the girl who had once laughed at my name.", "گفت: «افتضاح به نظر می‌رسی.» و نشانی از لولیتای قدیم در صدایش بود، نشانی از دختری که روزی به نامم خندیده بود."),
            StoryParagraph("'I am terrible,' I said. 'I have been terrible since you left.'", "گفتم: «افتضاحم. از وقتی رفتی افتضاح بوده‌ام.»"),
            StoryParagraph("'I am not going back to you,' she said. 'You must understand that. I am never going back.'", "گفت: «به تو برنمی‌گردم. باید این را بفهمی. هرگز برنمی‌گردم.»"),
            StoryParagraph("'I know,' I said. 'I am not asking you to.'", "گفتم: «می‌دانم. نمی‌خواهم برگردی.»"),
            StoryParagraph("And I gave her all the money I had, several thousand dollars, everything I had saved, everything I had earned, everything I owned.", "و تمام پولی که داشتم به او دادم، چند هزار دلار، هر چیزی که پس‌انداز کرده بودم، هر چیزی که به دست آورده بودم، هر چیزی که مالکش بودم."),
            StoryParagraph("'This is for you,' I said. 'And for the child. You will need it.'", "گفتم: «این برای توست. و برای بچه. نیازش خواهی داشت.»"),
            StoryParagraph("She took the money, and she looked at me for a long moment, and I saw something in her eyes that I had never seen before.", "پول را گرفت و مدت طولانی نگاهم کرد و چیزی در چشمانش دیدم که هرگز قبلاً ندیده بودم."),
            StoryParagraph("'You ruined my life,' she said, quietly. 'You know that, don't you? You ruined my life.'", "آرام گفت: «زندگی‌ام را نابود کردی. این را می‌دانی، نه؟ زندگی‌ام را نابود کردی.»"),
            StoryParagraph("'I know,' I said. 'I have always known.'", "گفتم: «می‌دانم. همیشه می‌دانستم.»"),
            StoryParagraph("'Then why did you do it?' she asked. 'Why?'", "پرسید: «پس چرا کردی؟ چرا؟»"),
            StoryParagraph("I did not have an answer; or rather, I had too many answers, none of which were adequate, none of which were true.", "پاسخی نداشتم؛ یا بهتر، پاسخ‌های زیادی داشتم، هیچ‌کدام کافی نبود، هیچ‌کدام راستین نبود."),
            StoryParagraph("'Because I loved you,' I said, at last. 'Because I loved you more than I loved anything, or anyone, or myself.'", "سرانجام گفتم: «چون دوستت داشتم. چون بیش از هر چیزی یا هر کسی یا خودم دوستت داشتم.»"),
            StoryParagraph("'That is not love,' she said. 'That is madness. That is possession. That is not love.'", "گفت: «این عشق نیست. جنون است. تملک است. عشق نیست.»"),
            StoryParagraph("And she was right; she was absolutely right; and I knew it, and I had always known it, and I had never been able to admit it.", "و حق داشت؛ کاملاً حق داشت؛ و می‌دانستم و همیشه می‌دانستم و هرگز نتوانسته بودم اقرار کنم."),
            StoryParagraph("I left her house, and I drove away, and I did not look back; and I knew that I would never see her again.", "خانه‌اش را ترک کردم و دور شدم و عقب نگاه نکردم؛ و می‌دانستم هرگز دوباره نمی‌بینمش."),
            StoryParagraph("But before I left, I asked her one question: who had taken her away from me, all those years ago?", "اما پیش از رفتن، یک پرسش پرسیدم: چه کسی آن همه سال پیش از من بردش؟"),
            StoryParagraph("She hesitated, then told me the name: Clare Quilty.", "تردید کرد، بعد نام را گفت: کلر کویلتی."),
            StoryParagraph("'He was a playwright,' she said. 'He had friends everywhere. He met me at the school. He promised me a life of art and freedom.'", "گفت: «نمایشنامه‌نویس بود. همه‌جا دوست داشت. در مدرسه ملاقاتم کرد. زندگی‌ای از هنر و آزادی به من وعده داد.»"),
            StoryParagraph("'And did he give you that life?' I asked.", "پرسیدم: «و آن زندگی را به تو داد؟»"),
            StoryParagraph("'No,' she said. 'He used me, and then he threw me out. And I wandered for years, until I met Dick.'", "گفت: «نه. از من استفاده کرد و بعد بیرونم انداخت. و سال‌ها سرگردان بودم تا دیک را ملاقات کردم.»"),
            StoryParagraph("I thanked her, and I left, and I drove to the house of Clare Quilty.", "تشکر کردم و رفتم و به خانه کلر کویلتی راندم."),
            StoryParagraph("I found him there, in his mansion, drunk and arrogant and terrible.", "او را آنجا یافتم، در عمارتش، مست و متکبر و هولناک."),
            StoryParagraph("I told him why I had come; I told him what he had done; I told him what he deserved.", "گفتم چرا آمده‌ام؛ گفتم چه کرده؛ گفتم سزاوار چیست."),
            StoryParagraph("He laughed at me; he mocked me; he told me that I was no better than he was, and that I knew it.", "به من خندید؛ مسخره‌ام کرد؛ گفت من از او بهتر نیستم و خودم می‌دانم."),
            StoryParagraph("And he was right; he was absolutely right; and that is why I killed him.", "و حق داشت؛ کاملاً حق داشت؛ و به همین دلیل کشتمش."),
            StoryParagraph("I shot him, again and again, until he was dead; and then I drove away, and I was arrested by the police.", "شلیک کردم، بارها و بارها، تا مرد؛ و بعد دور شدم و پلیس دستگیرم کرد."),
            StoryParagraph("I was put in prison, and there I wrote this confession, this terrible book, this monument to my love and my crime.", "زندانی شدم و آنجا این اعتراف را نوشتم، این کتاب هولناک، این یادبود عشق و جنایتم."),
            StoryParagraph("I died of a heart attack before my trial could begin.", "قبل از اینکه محاکمه‌ام آغاز شود از سکته قلبی مردم."),
            StoryParagraph("And Lolita died on Christmas Day, in childbirth, in a small town in the Northwest.", "و لولیتا روز کریسمس، در زایمان، در شهرکی در شمال غربی مرد."),
            StoryParagraph("A girl-child was born, and lived, and was raised by Dick Schiller and his second wife.", "دختربچه‌ای زاده شد و زنده ماند و توسط دیک شیلر و همسر دومش بزرگ شد."),
            StoryParagraph("And so the story ended, as all such stories must, in death and sorrow and the terrible, terrible beauty of it all.", "و اینگونه داستان پایان یافت، همانطور که همه چنین داستان‌هایی باید، در مرگ و اندوه و زیبایی هولناک و هولناک همه‌اش."),
            StoryParagraph("This is my confession; this is my story; this is the only truth I have ever told.", "این اعتراف من است؛ این داستان من است؛ این تنها حقیقتی است که هرگز گفته‌ام."),
            StoryParagraph("I loved her; I destroyed her; I am sorry.", "دوستش داشتم؛ نابودش کردم؛ متأسفم.")
        )
    )

    // ─────────── فصل ۶: معنا ───────────
    private fun chapter6() = StoryChapter(
        number = 6, title = "The Meaning", titlePersian = "معنا",
        paragraphs = listOf(
            StoryParagraph("Lolita, published in 1955, is one of the most controversial and most admired novels of the twentieth century.", "لولیتا، منتشرشده در ۱۹۵۵، یکی از بحث‌برانگیزترین و تحسین‌شده‌ترین رمان‌های قرن بیستم است."),
            StoryParagraph("It was rejected by several American publishers, who found it obscene; it was first published in Paris, by Olympia Press, a house known for publishing erotic literature.", "چندین ناشر آمریکایی آن را رد کردند و فحشا یافتند؛ نخستین بار در پاریس منتشر شد، توسط انتشارات المپیا، خانه‌ای که به انتشار ادبیات اروتیک شهرت داشت."),
            StoryParagraph("When it was finally published in America, in 1958, it became an immediate bestseller, and it made Nabokov famous.", "وقتی سرانجام در ۱۹۵۸ در آمریکا منتشر شد، بلافاصله پرفروش شد و ناباکوف را مشهور کرد."),
            StoryParagraph("It has since been translated into dozens of languages, adapted into films and plays, and studied in universities around the world.", "از آن زمان به ده‌ها زبان ترجمه شده، به فیلم و نمایش اقتباس شده و در دانشگاه‌های سراسر جهان مطالعه شده است."),
            StoryParagraph("And it remains, more than sixty years after its publication, one of the most difficult and most necessary books in modern literature.", "و بیش از شصت سال پس از انتشارش، یکی از دشوارترین و ضروری‌ترین کتاب‌های ادبیات مدرن باقی مانده است."),
            StoryParagraph("The novel is narrated by Humbert Humbert, a middle-aged European intellectual who is obsessed with a twelve-year-old girl named Dolores Haze.", "رمان توسط هومبرت هومبرت روایت می‌شود، روشنفکری اروپایی میان‌سال که به دختری دوازده ساله به نام دلورس هیز وسواس دارد."),
            StoryParagraph("Humbert calls Dolores 'Lolita,' and in doing so, he does not merely give her a nickname; he creates a persona, a projection, a fantasy.", "هومبرت دلورس را «لولیتا» صدا می‌زند و در این کار، تنها نام مستعار به او نمی‌دهد؛ شخصیتی می‌آفریند، تصویری، فانتزی‌ای."),
            StoryParagraph("The 'Lolita' of the title is not a real girl; she is the creation of Humbert's imagination, the object of his desire, the victim of his obsession.", "«لولیتای» عنوان دختری واقعی نیست؛ آفریده تخیل هومبرت است، موضوع میلش، قربانی وسواسش."),
            StoryParagraph("The real girl, Dolores, is a child — an ordinary, sometimes irritating, sometimes vulnerable child — who is destroyed by the man who claims to love her.", "دختر واقعی، دلورس، بچه‌ای است — بچه‌ای معمولی، گاهی آزاردهنده، گاهی آسیب‌پذیر — که توسط مردی که ادعا می‌کند دوستش دارد نابود می‌شود."),
            StoryParagraph("And this, perhaps, is the central horror of the novel: that Humbert's love, which he describes with such eloquence and such beauty, is not love at all.", "و این، شاید، وحشت محوری رمان است: عشق هومبرت، که با چنان فصاحت و چنان زیبایی توصیفش می‌کند، اصلاً عشق نیست."),
            StoryParagraph("It is obsession, it is possession, it is power; but it is not love.", "وسواس است، تملک است، قدرت است؛ اما عشق نیست."),
            StoryParagraph("Love, real love, respects the other; it does not consume them; it does not force them; it does not destroy them.", "عشق، عشق واقعی، به دیگری احترام می‌گذارد؛ بلعدش نمی‌کند؛ مجبورش نمی‌کند؛ نابودش نمی‌کند."),
            StoryParagraph("Humbert's love does none of these things; it consumes, forces, destroys; and it destroys the one person he claims to love most.", "عشق هومبرت هیچ‌کدام از اینها را نمی‌کند؛ می‌بلعد، مجبور می‌کند، نابود می‌کند؛ و تنها کسی که ادعا می‌کند بیشتر از همه دوستش دارد را نابود می‌کند."),
            StoryParagraph("The novel is also, and perhaps most importantly, a meditation on language and beauty.", "رمان همچنین، و شاید مهم‌تر از همه، مراقبه‌ای است درباره زبان و زیبایی."),
            StoryParagraph("Nabokov was one of the greatest prose stylists of the twentieth century, and Lolita is his masterpiece.", "ناباکوف یکی از بزرگ‌ترین سبک‌شناسان نثر قرن بیستم بود و لولیتا شاهکارش است."),
            StoryParagraph("The novel is written in a language that is at once beautiful and disturbing, elegant and horrifying; it uses the most refined literary techniques to describe the most terrible of crimes.", "رمان به زبانی نوشته شده که همزمان زیبا و آشفته‌کننده است، ظریف و هولناک؛ از دقیق‌ترین تکنیک‌های ادبی استفاده می‌کند تا هولناک‌ترین جنایات را توصیف کند."),
            StoryParagraph("This is what makes the novel so dangerous, and so necessary: it seduces us with its beauty, and then it forces us to confront what we have been seduced by.", "این همان چیزی است که رمان را اینقدر خطرناک و اینقدر ضروری می‌کند: با زیبایی‌اش فریبمان می‌دهد و بعد وادارمان می‌کند با آنچه فریب خورده‌ایم روبرو شویم."),
            StoryParagraph("We read the novel, and we are moved by Humbert's language, and we feel for him, and we almost sympathize with him.", "رمان را می‌خوانیم و توسط زبان هومبرت متأثر می‌شویم و برایش حس می‌کنیم و تقریباً دلسوزی می‌کنیم."),
            StoryParagraph("And then we remember what he has done; we remember that he has destroyed a child; we remember that he is a monster.", "و بعد یاد می‌آوریم چه کرده؛ یاد می‌آوریم بچه‌ای را نابود کرده؛ یاد می‌آوریم هیولایی است."),
            StoryParagraph("And we are forced to confront a question that is at the heart of the novel, and perhaps at the heart of art itself: can beauty be separated from morality?", "و مجبور می‌شویم با پرسشی روبرو شویم که در قلب رمان است و شاید در قلب خود هنر: آیا زیبایی می‌تواند از اخلاق جدا شود؟"),
            StoryParagraph("Can a book be beautiful, and great, and important, even if its subject is terrible, even if its narrator is monstrous?", "آیا کتابی می‌تواند زیبا باشد و بزرگ و مهم، حتی اگر موضوعش هولناک باشد، حتی اگر راوی‌اش هیولا باشد؟"),
            StoryParagraph("Nabokov's answer, I think, is yes; and the proof of that answer is Lolita itself.", "پاسخ ناباکوف، فکر می‌کنم، بله است؛ و اثبات آن پاسخ خودِ لولیتا است."),
            StoryParagraph("But he also insists, in the end, that we do not forget the horror; that we do not let the beauty blind us to the crime; that we see, clearly, what Humbert has done.", "اما در پایان هم اصرار می‌کند که وحشت را فراموش نکنیم؛ نگذاریم زیبایی ما را به جنایت کور کند؛ واضح ببینیم هومبرت چه کرده."),
            StoryParagraph("And what Humbert has done is this: he has taken a child, a real child, with a real life and a real future, and he has used her, and he has destroyed her, and he has justified it all with the most beautiful of words.", "و آنچه هومبرت کرده این است: بچه‌ای گرفته، بچه‌ای واقعی، با زندگی‌ای واقعی و آینده‌ای واقعی و از او استفاده کرده و نابودش کرده و همه‌اش را با زیباترین کلمات توجیه کرده."),
            StoryParagraph("The novel does not excuse him; it does not romanticize him; it simply lets him speak, and lets us see him for what he is.", "رمان تبرئه‌اش نمی‌کند؛ رمانتیکش نمی‌کند؛ تنها می‌گذارد صحبت کند و ما را وادار می‌کند او را همانطور که هست ببینیم."),
            StoryParagraph("And what we see is a man who is brilliant, and cultured, and articulate, and who is, nonetheless, a monster.", "و آنچه می‌بینیم مردی است که درخشان است و با فرهنگ و فصیح، و با این حال، هیولایی است."),
            StoryParagraph("Lolita is a novel about many things: about obsession, about language, about America, about Europe, about childhood, about adulthood, about innocence, about evil.", "لولیتا رمانی است درباره چیزهای بسیاری: درباره وسواس، درباره زبان، درباره آمریکا، درباره اروپا، درباره کودکی، درباره بزرگسالی، درباره معصومیت، درباره شر."),
            StoryParagraph("But most of all, it is a novel about the abuse of power, and about the way that abuse is disguised, justified, and even beautified, by those who commit it.", "اما بیش از همه، رمانی است درباره سوءاستفاده از قدرت و شیوه‌ای که این سوءاستفاده توسط مرتکبانش پنهان می‌شود، توجیه می‌شود و حتی زیبا می‌شود."),
            StoryParagraph("Humbert Humbert is not a romantic hero; he is a predator, a rapist, a destroyer of children.", "هومبرت هومبرت قهرمان رمانتیک نیست؛ شکارچی است، متجاوز، نابودکننده کودکان."),
            StoryParagraph("And Lolita, whatever we may feel about its beauty, whatever we may admire about its language, is a book that reminds us, in the most powerful way possible, that such people exist.", "و لولیتا، هر چه درباره زیبایی‌اش حس کنیم، هر چه در زبانش تحسین کنیم، کتابی است که به قوی‌ترین شکل ممکن یادآوری‌مان می‌کند چنین افرادی وجود دارند."),
            StoryParagraph("They exist in our world; they exist in our neighborhoods; they exist in our families.", "در جهان ما وجود دارند؛ در محله‌هایمان وجود دارند؛ در خانواده‌هایمان وجود دارند."),
            StoryParagraph("And they often look just like Humbert: intelligent, charming, cultured, respectable.", "و اغلب دقیقاً مثل هومبرت به نظر می‌رسند: باهوش، جذاب، با فرهنگ، محترم."),
            StoryParagraph("This is what makes Lolita so disturbing, and so necessary: it shows us, with the most beautiful prose imaginable, the face of a monster.", "این همان چیزی است که لولیتا را اینقدر آشفته‌کننده و اینقدر ضروری می‌کند: با زیباترین نثر قابل تصور، چهره یک هیولا را نشانمان می‌دهد."),
            StoryParagraph("And it forces us to look, and to remember, and to never, ever forget.", "و مجبورمان می‌کند نگاه کنیم و به یاد بیاوریم و هرگز، هرگز فراموش نکنیم."),
            StoryParagraph("The end.", "پایان."),
            StoryParagraph("And the beginning.", "و آغاز."),
            StoryParagraph("For the story of Lolita is not over; it is being told, every day, in every place, in every life that has been touched by such abuse.", "زیرا داستان لولیتا تمام نشده؛ هر روز گفته می‌شود، در هر مکان، در هر زندگی‌ای که توسط چنین سوءاستفاده‌ای لمس شده."),
            StoryParagraph("And it will not be over until we have learned to see, clearly and without illusion, what such love really is.", "و تمام نمی‌شود تا وقتی یاد گرفته باشیم ببینیم، واضح و بدون توهم، چنین عشقی واقعاً چیست."),
            StoryParagraph("It is not love.", "عشق نیست."),
            StoryParagraph("It is abuse.", "سوءاستفاده است."),
            StoryParagraph("And Lolita, the novel, is the most powerful witness to that truth that literature has ever produced.", "و لولیتا، رمان، قوی‌ترین شاهد بر آن حقیقت است که ادبیات هرگز تولید کرده.")
        )
    )
}