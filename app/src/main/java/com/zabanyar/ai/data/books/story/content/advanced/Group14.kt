package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۱۴ — پیشرفته — ادبیات قرن بیستم
 *  ۴۰. بربادرفته (مارگارت میچل)
 *  ۴۱. بیلی باد (هرمان ملویل)
 *  ۴۲. آمریکایی آرام (گراهام گرین)
 */
object Group14 {

    fun getAll(): List<StoryContent> = listOf(
        story40(),
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۰: بربادرفته
    // ═══════════════════════════════════════════════════════
    private fun story40() = StoryContent(
        storyId = "adv_gone_with_wind",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Scarlett O'Hara", titlePersian = "اسکارلت اوهارا",
                paragraphs = listOf(
                    StoryParagraph(
                        "Scarlett O'Hara was not beautiful, but men seldom realized it when caught by her charm, as the Tarleton twins were now, sitting on either side of her on the wide white-pillared porch of Tara, the plantation her father had built in the red soil of Georgia.",
                        "اسکارلت اوهارا زیبا نبود، اما مردان وقتی اسیر جذابیتش می‌شدند به‌ندرت این را می‌فهمیدند، همان‌طور که الان دوقلوهای تارلتون، هر کدام در یک طرف او روی ایوان پهن و ستون‌سفید تارا نشسته بودند، مزرعه‌ای که پدرش در خاک سرخ جورجیا ساخته بود."
                    ),
                    StoryParagraph(
                        "Her face was not delicate like her mother's, nor noble like her father's, but the combination of her sharp green eyes and thick black lashes created an effect that no man could quite resist, especially when she smiled and showed the dimples in her cheeks.",
                        "چهره‌اش مثل مادرش ظریف نبود، نه مثل پدرش نجیب، اما ترکیب چشمان سبز تیزش و مژه‌های سیاه انبوهش اثری می‌ساخت که هیچ مردی کاملاً نمی‌توانست در برابرش مقاومت کند، به‌ویژه وقتی لبخند می‌زد و چال‌های گونه‌اش را نشان می‌داد."
                    ),
                    StoryParagraph(
                        "Her thick black hair fell in waves about her shoulders, and her waist was the smallest in three counties, a fact she never allowed herself to forget, for Scarlett understood the power of beauty in a world that worshipped it.",
                        "موهای سیاه و انبوهش در موج‌هایی دور شانه‌هایش می‌ریخت و کمرش باریک‌ترین در سه شهرستان بود، حقیقتی که هرگز اجازه نمی‌داد فراموشش کند، چون اسکارلت قدرت زیبایی را در جهانی که آن را می‌پرستید درک می‌کرد."
                    ),
                    StoryParagraph(
                        "The Tarleton twins, Stuart and Brent, were nineteen years old, tall, broad-shouldered, and full of the careless energy of young Southern gentlemen who had never known a day of real hardship, and they had come to Tara that April afternoon with a piece of news.",
                        "دوقلوهای تارلتون، استوارت و برنت، نوزده‌ساله بودند، بلندقد، پهن‌شانه و پر از انرژی بی‌خیال جوانان جنتلمن جنوبی که هرگز روزی از سختی واقعی را نشناخته بودند، و آن بعدازظهر آوریل با خبری به تارا آمده بودند."
                    ),
                    StoryParagraph(
                        "They had been expelled from the University of Georgia that very morning for some forgotten offense, and they were eager to share their disgrace, hoping Scarlett would find their adventure as amusing as they did.",
                        "همان صبح از دانشگاه جورجیا به‌خاطر تخلفی فراموش‌شده اخراج شده بودند و مشتاق بودند رسوایی‌شان را به اشتراک بگذارند، به امید آنکه اسکارلت ماجراجویی‌شان را به همان اندازه آنان خنده‌دار بیابد."
                    ),
                    StoryParagraph(
                        "But Scarlett was not listening to their story, for her attention had been captured by a casual remark that Stuart had let slip without realizing its devastating importance, a remark that would change the entire course of her young life.",
                        "اما اسکارلت به داستانشان گوش نمی‌داد، چون توجهش توسط حرفی اتفاقی به دام افتاده بود که استوارت بدون درک اهمیت ویران‌کننده‌اش ناخواسته گفته بود، حرفی که تمام مسیر زندگی جوانش را تغییر می‌داد."
                    ),
                    StoryParagraph(
                        "Ashley Wilkes was going to marry Melanie Hamilton, and the announcement would be made at the barbecue at Twelve Oaks the very next day, a fact that struck Scarlett like a physical blow, though she kept her face perfectly composed.",
                        "اشلی ویلکز قصد داشت با ملانی همیلتون ازدواج کند و اعلام آن فردا در باربیکیو در توئلوکس صورت می‌گرفت، حقیقتی که به اسکارلت مثل ضربه‌ای فیزیکی خورد، هرچند چهره‌اش را کاملاً محتاط نگه داشت."
                    ),
                    StoryParagraph(
                        "For two years, ever since the day she had first seen Ashley at a neighboring plantation, Scarlett had loved him with a fierce, possessive, unreasoning love, the kind of love that a spoiled child feels for a toy she cannot have.",
                        "دو سال بود، از همان روزی که نخستین بار اشلی را در مزرعه‌ای مجاور دیده بود، اسکارلت او را با عشقی سرکش، مالکانه و بی‌منطق دوست می‌داشت، از آن نوع عشقی که کودک لوس برای اسباب‌بازی‌ای که نمی‌تواند داشته باشد حس می‌کند."
                    ),
                    StoryParagraph(
                        "She was convinced that Ashley loved her too, that he was only marrying Melanie out of family duty or some other foolish reason, and she was determined to prevent this marriage before it was too late.",
                        "او متقاعد بود اشلی هم دوستش دارد، که تنها از سر وظیفه خانوادگی یا دلیل احمقانه دیگری با ملانی ازدواج می‌کند، و مصمم بود پیش از آنکه خیلی دیر شود جلوی این ازدواج را بگیرد."
                    ),
                    StoryParagraph(
                        "The twins spoke of the Yankees as though they were a distant, harmless race of shopkeepers, and of the coming war as a grand adventure that would be won in a single battle, but Scarlett cared nothing for politics or war.",
                        "دوقلوها از یانکی‌ها طوری سخن می‌گفتند که گویی نژادی دور و بی‌ضرر از مغازه‌داران هستند و از جنگ پیش رو به‌عنوان ماجراجویی باشکوهی که در یک نبرد برنده می‌شود، اما اسکارلت به سیاست یا جنگ اهمیت نمی‌داد."
                    ),
                    StoryParagraph(
                        "She wished them away with a few sharp words, and when they had gone, she sat alone on the porch, watching the red clay road that led away from Tara and thinking about how she would speak to Ashley tomorrow.",
                        "با چند کلمه تیز فرستادشان و وقتی رفتند، تنها روی ایوان نشست، جاده خاک‌رس سرخی را که از تارا دور می‌شد تماشا کرد و به این فکر کرد فردا چطور با اشلی صحبت می‌کند."
                    ),
                    StoryParagraph(
                        "That evening, she sat at supper with her father Gerald, an Irishman of great energy and small subtlety, and her mother Ellen, a woman of aristocratic French descent whose every movement was governed by an unbreakable code of gentility.",
                        "آن شب سر شام با پدرش جرالد نشست، ایرلندی‌ای با انرژی فراوان و ظرافت اندک، و مادرش الن، زنی از تبار اشراف فرانسوی که هر حرکتش با کد ناگسستنی نجابت هدایت می‌شد."
                    ),
                    StoryParagraph(
                        "Her two sisters, Suellen and Carreen, chattered about the coming barbecue, about who would wear what, about which young man would dance with whom, but Scarlett said little, for her mind was entirely occupied with Ashley.",
                        "دو خواهرش، سولن و کارین، درباره باربیکیوی پیش رو پچ‌پچ کردند، درباره اینکه چه کسی چه می‌پوشد، کدام جوان با کدام می‌رقصد، اما اسکارلت کم گفت، چون ذهنش کاملاً در تسخیر اشلی بود."
                    ),
                    StoryParagraph(
                        "After supper, she climbed the stairs to her room, and she stood before the mirror for a long time, studying her face with the cold, calculating gaze of a woman who knew the power of her own beauty and was willing to use it.",
                        "بعد از شام از پله‌ها به اتاقش بالا رفت و مدتی طولانی جلوی آینه ایستاد و چهره‌اش را با نگاه سرد و حسابگر زنی که قدرت زیبایی خودش را می‌دانست و حاضر بود از آن استفاده کند، بررسی کرد."
                    ),
                    StoryParagraph(
                        "She thought about Ashley, about the gentle way he spoke, about the books he read, about the way he looked at her when he thought she was not watching, and her heart ached with a longing that no words could express.",
                        "به اشلی فکر کرد، به شیوه ملایم صحبت کردنش، به کتاب‌هایی که می‌خواند، به شیوه نگاه کردنش وقتی فکر می‌کرد او نمی‌بیند، و قلبش از اشتیاقی که هیچ کلمه‌ای نمی‌توانست بیانش کند به درد آمد."
                    ),
                    StoryParagraph(
                        "She decided she would wear her most beautiful dress, the green one that matched her eyes, and that she would be more charming, more beautiful, more captivating than she had ever been before.",
                        "تصمیم گرفت زیباترین لباسش را بپوشد، لباس سبزی که با چشمانش هماهنگ بود، و از همیشه جذاب‌تر، زیباتر و دلرباتر باشد."
                    ),
                    StoryParagraph(
                        "She did not know, as she lay there in the warm Georgia darkness with the scent of honeysuckle drifting through her open window, that the world she loved was about to end, and that she herself was about to begin a journey that would change her forever.",
                        "او نمی‌دانست، در حالی که آنجا در تاریکی گرم جورجیا دراز کشیده بود و بوی پیچ‌امیرسلیمان در پنجره بازش می‌پیچید، جهانی که دوست داشت به زودی پایان می‌یافت و خودش سفری را آغاز می‌کرد که برای همیشه تغییرش می‌داد."
                    ),
                    StoryParagraph(
                        "The next day, the O'Hara family set out for Twelve Oaks, with Scarlett radiant in her green dress, her heart beating fast with excitement and fear at the thought of what she was about to do.",
                        "روز بعد، خانواده اوهارا به سمت توئلوکس راه افتادند، اسکارلت درخشان در لباس سبزش، قلبش با هیجان و ترس از فکر کاری که در شرف انجامش بود تند می‌کوبید."
                    ),
                    StoryParagraph(
                        "They arrived in the late morning, and the great house, with its white columns and wide green lawn, was already crowded with carriages, horses, and elegantly dressed guests who had come from every plantation in the county.",
                        "اواخر صبح رسیدند و خانه بزرگ، با ستون‌های سفید و چمنزار وسیع سبزش، از قبل پر بود از کالسکه‌ها، اسب‌ها و مهمانان شیک‌پوشی که از هر مزرعه‌ای در منطقه آمده بودند."
                    ),
                    StoryParagraph(
                        "Scarlett saw Ashley standing with Melanie, his face calm and gentle as always, and she felt a mixture of joy and pain, for Melanie Hamilton was small and frail, with soft brown hair and gentle eyes, and there was about her a quiet dignity that made everyone love her.",
                        "اسکارلت اشلی را در کنار ملانی دید، صورتش مثل همیشه آرام و ملایم، و ترکیبی از شادی و درد حس کرد، چون ملانی همیلتون کوچک و نحیف بود، با موهای قهوه‌ای نرم و چشمانی ملایم، و در او وقاری آرام بود که همه را وادار به دوست داشتنش می‌کرد."
                    ),
                    StoryParagraph(
                        "She spent the next hour moving through the crowd, laughing, talking, flirting, playing the part of the carefree belle of the county, while her eyes followed Ashley everywhere he went.",
                        "ساعت بعد را در میان جمعیت گذراند، خندید، صحبت کرد، لاس زد، نقش زیبای بی‌خیال منطقه را بازی کرد، در حالی که چشمانش هر جا اشلی می‌رفت او را دنبال می‌کرد."
                    ),
                    StoryParagraph(
                        "At last, in the middle of the afternoon, she saw him slip away from the crowd and go into the house, and she knew this was her moment, the moment she had been waiting for since the night before.",
                        "سرانجام، در میانه بعدازظهر، دید که از میان جمعیت لغزید و به داخل خانه رفت، و دانست این لحظه اوست، لحظه‌ای که از شب قبل در انتظارش بود."
                    ),
                    StoryParagraph(
                        "She followed him quietly, her heart pounding, and she found him alone in the library, a book of poetry open in his hands, his face thoughtful and sad in the dim afternoon light.",
                        "بی‌صدا دنبالش رفت، قلبش می‌کوبید، و او را در کتابخانه تنها یافت، کتابی از شعر در دستانش باز، صورتش در نور کم‌رنگ بعدازظهر متفکر و غمگین بود."
                    ),
                    StoryParagraph(
                        "'Scarlett,' he said, 'I was just thinking about you.' It was the kind of thing he often said, and it meant nothing, but Scarlett seized it as a sign, a confirmation of what she had always believed.",
                        "گفت: «اسکارلت، تازه به تو فکر می‌کردم.» از آن چیزهایی بود که اغلب می‌گفت و معنایی نداشت، اما اسکارلت آن را نشانه‌ای گرفت، تأییدی بر آنچه همیشه باور داشت."
                    ),
                    StoryParagraph(
                        "She walked toward him, her green eyes shining with a passion she could no longer hide, and she began to speak, to tell him of her love, to beg him not to marry Melanie, to promise him they could be happy together if only he would choose her.",
                        "به سمتش رفت، چشمان سبزش از شوری که دیگر نمی‌توانست پنهان کند می‌درخشید، و شروع به سخن گفتن کرد، از عشقش به او بگوید، التماس کند با ملانی ازدواج نکند، قول دهد اگر او را انتخاب کند می‌توانند با هم خوشحال باشند."
                    ),
                    StoryParagraph(
                        "Ashley listened in silence, his face growing sadder with every word she spoke, and when she had finished, he took her hands gently in his and looked at her with a tenderness that only made her pain worse.",
                        "اشلی در سکوت گوش داد و با هر کلمه‌ای که می‌گفت چهره‌اش غمگین‌تر شد، و وقتی تمام کرد، دستانش را به ملایمت در دستانش گرفت و با چنان لطافتی نگاهش کرد که فقط دردش را بدتر کرد."
                    ),
                    StoryParagraph(
                        "'I love you,' he said, 'but not in the way you want me to love you. I love your spirit, your courage, your fire, but I cannot marry you, for you and I are too different. Melanie is my match, not in fire, but in calm.'",
                        "گفت: «تو را دوست دارم، اما نه به شیوه‌ای که می‌خواهی. روحت را دوست دارم، شجاعتت را، آتشت را، اما نمی‌توانم با تو ازدواج کنم، چون من و تو خیلی متفاوتیم. ملانی جفت من است، نه در آتش، بلکه در آرامش.»"
                    ),
                    StoryParagraph(
                        "'You are a coward, Ashley Wilkes,' she cried, 'you are afraid of life, afraid of feeling! You hide behind your books and your gentility and your Melanie, and you call it peace, but it is only fear!'",
                        "فریاد زد: «تو ترسویی، اشلی ویلکز، از زندگی می‌ترسی، از احساس می‌ترسی! پشت کتاب‌ها و نجابتت و ملانی‌ات پنهان می‌شوی و اسمش را آرامش می‌گذاری، اما فقط ترس است!»"
                    ),
                    StoryParagraph(
                        "Scarlett felt her heart grow hard inside her chest. 'Then I hope you will be happy, Ashley,' she said, in a voice cold as winter, 'and I hope I never see you again.'",
                        "اسکارلت قلبش را در قفسه سینه‌اش سخت شدن حس کرد. گفت: «پس امیدوارم خوشحال باشی، اشلی،» با صدایی سرد مثل زمستان، «و امیدوارم هرگز دیگر تو را نبینم.»"
                    ),
                    StoryParagraph(
                        "She stepped out of the house into the bright April sunshine, and there, standing on the front steps, she saw a man she had never seen before — tall, dark, broad-shouldered, with a mocking smile and eyes that seemed to see right through her.",
                        "از خانه به آفتاب روشن آوریل قدم گذاشت و آنجا، روی پله‌های جلویی، مردی را دید که هرگز ندیده بود — بلندقد، تیره، پهن‌شانه، با لبخندی ریشخندآمیز و چشمانی که به نظر می‌رسید مستقیم از او رد می‌شوند."
                    ),
                    StoryParagraph(
                        "His name was Rhett Butler, and he was the black sheep of a fine Charleston family, a man with a reputation as scandalous as his smile, and he had heard everything, every word, every tear, every broken promise.",
                        "نامش رت باتلر بود و گوسفند سیاه خانواده‌ای شریف از چارلستون، مردی با آوازه‌ای به رسوایی لبخندش، و همه چیز را شنیده بود، هر کلمه، هر اشک، هر وعده شکسته."
                    ),
                )
            ),
        )
    )
}
StoryChapter(
    number = 2, title = "The Widow", titlePersian = "بیوه",
    paragraphs = listOf(
        StoryParagraph(
            "That same evening, in an act of pure spite, Scarlett married Melanie's brother Charles Hamilton, a shy young man she did not love and barely knew, a marriage made in anger to wound Ashley.",
            "همان شب، در عملی از کینه محض، اسکارلت با برادر ملانی، چارلز همیلتون ازدواج کرد، جوانی خجالتی که دوستش نداشت و به‌سختی می‌شناخت، ازدواجی که از خشم زاده شد تا اشلی را زخم بزند."
        ),
        StoryParagraph(
            "It lasted barely two months before Charles died of pneumonia in a military camp, without ever firing a shot in battle, leaving Scarlett a widow at seventeen, dressed in black from head to foot.",
            "به‌سختی دو ماه دوام آورد پیش از آنکه چارلز در اردوگاهی نظامی از ذات‌الریه بمیرد، بدون اینکه هرگز گلوله‌ای در نبرد شلیک کند، و اسکارلت را در هفده‌سالگی بیوه کرد، از سر تا پا سیاه‌پوش."
        ),
        StoryParagraph(
            "She hated every moment of her mourning, hated the black dresses, hated the silence, hated the endless days of grief for a man she had never loved, and she felt trapped by the rules of a society she despised.",
            "از هر لحظه سوگواری‌اش متنفر بود، از لباس‌های سیاه، از سکوت، از روزهای بی‌پایان غم برای مردی که هرگز دوستش نداشته، و در قواعد جامعه‌ای که تحقیرش می‌کرد گرفتار احساس می‌کرد."
        ),
        StoryParagraph(
            "Her mother sent her to Atlanta to stay with Melanie, hoping the change would help, and Scarlett found herself living with the woman she had once considered her rival, under the same roof, sharing the same daily life.",
            "مادرش او را به آتلانتا فرستاد تا با ملانی بماند، به امید آنکه تغییر کمکش کند، و اسکارلت خودش را با زنی دید که روزی رقیبش می‌دانست، زیر یک سقف، در زندگی روزمره مشترک."
        ),
        StoryParagraph(
            "Melanie was gentle, kind, and utterly devoted to Scarlett, unaware of her secret love for Ashley, and Scarlett found her sweetness unbearable though she had nowhere else to go.",
            "ملانی مهربان، خوش‌قلب و کاملاً فدایی اسکارلت بود، بی‌خبر از عشق پنهانی‌اش به اشلی، و اسکارلت شیرینی‌اش را غیرقابل تحمل می‌یافت، هرچند جای دیگری نداشت برود."
        ),
        StoryParagraph(
            "The war dragged on, and Atlanta filled with hospitals and wounded soldiers. Scarlett was forced to work as a nurse, tending dying men she did not know, and she hated the smell, the screams, the blood.",
            "جنگ ادامه یافت و آتلانتا پر شد از بیمارستان‌ها و سربازان زخمی. اسکارلت مجبور شد به‌عنوان پرستار کار کند و از مردان در حال مرگی که نمی‌شناخت مراقبت کند، و از بو، جیغ‌ها و خون متنفر بود."
        ),
        StoryParagraph(
            "At a charity bazaar, she danced in public despite her mourning, scandalizing society, and there she met Rhett Butler again, now a blockade runner, watching her with his knowing smile.",
            "در بازار خیریه‌ای، با وجود سوگواری‌اش در عموم رقصید و جامعه را رسوا کرد، و آنجا دوباره رت باتلر را ملاقات کرد، که حالا دونده محاصره بود و با لبخند دانایش تماشایش می‌کرد."
        ),
        StoryParagraph(
            "'I like your spirit,' he told her. 'It matches mine.' Scarlett was drawn to him despite herself, and she hated him for it, for he saw through every pretense and laughed at every lie she told.",
            "به او گفت: «روحت را دوست دارم. با روح من می‌خواند.» اسکارلت با وجود خودش به سمتش کشیده شد و برای این از او متنفر بود، چون او از هر تظاهری رد می‌شد و به هر دروغی که می‌گفت می‌خندید."
        ),
        StoryParagraph(
            "Rhett was a man without illusions, without patriotism, without respect for society. He saw the world as it was, and he laughed at those who pretended otherwise.",
            "رت مردی بدون توهم بود، بدون میهن‌پرستی، بدون احترام به جامعه. جهان را همان‌طور که بود می‌دید و به کسانی که خلافش تظاهر می‌کردند می‌خندید."
        ),
        StoryParagraph(
            "He told her that the South would lose the war, that the great plantations would burn, that the world she loved would vanish forever, and Scarlett refused to believe him, called him a traitor and a coward.",
            "به او گفت جنوب جنگ را می‌بازد، مزارع بزرگ می‌سوزند، جهانی که دوست دارد برای همیشه ناپدید می‌شود، و اسکارلت از باورش امتناع کرد، او را خائن و بزدل خواند."
        ),
        StoryParagraph(
            "But later that night, alone in her room, she could not stop thinking about his words, about the cold certainty in his voice, about the fear that had settled in her chest like a stone.",
            "اما بعدتر آن شب، تنها در اتاقش، نمی‌توانست از فکر کردن به حرف‌هایش دست بکشد، به اطمینان سرد در صدایش، به ترسی که مثل سنگی در سینه‌اش نشسته بود."
        ),
        StoryParagraph(
            "By 1864, the war had turned against the South, and Atlanta was under siege. Yankee shells fell day and night, and Melanie was pregnant, sick and weak, unable to flee.",
            "تا سال ۱۸۶۴ جنگ به ضرر جنوب چرخیده بود و آتلانتا در محاصره بود. گلوله‌های یانکی شبانه‌روز می‌بارید و ملانی باردار، بیمار و ضعیف بود و نمی‌توانست فرار کند."
        ),
        StoryParagraph(
            "The doctor was busy with soldiers, so Scarlett had to deliver Melanie's baby herself. It was a long, terrible night, but the child came at last — a healthy boy.",
            "دکتر با سربازان مشغول بود، پس اسکارلت مجبور شد نوزاد ملانی را خودش به دنیا بیاورد. شب طولانی و هولناکی بود، اما بچه در نهایت آمد — پسری سالم."
        ),
        StoryParagraph(
            "The next day, Sherman's army entered the city, burning everything in its path. Scarlett sent for Rhett, begging him to help them escape, and he came, driving a stolen wagon and a half-crazed horse.",
            "روز بعد، ارتش شرمن وارد شهر شد و همه چیز در راهش را سوزاند. اسکارلت دنبال رت فرستاد و التماس کرد کمکشان کند فرار کنند، و او آمد، کالسکه‌ای دزدیده و اسبی نیمه‌دیوانه را می‌راند."
        ),
        StoryParagraph(
            "They fled through streets filled with fire and smoke and fleeing crowds, Scarlett driving the wagon, her hands blistered, her mind fixed on one thing: survival.",
            "آن‌ها از خیابان‌های پر از آتش و دود و جمعیت‌های فراری گریختند، اسکارلت کالسکه را می‌راند، دستانش تاول زده، ذهنش روی یک چیز متمرکز: بقا."
        ),
        StoryParagraph(
            "The Yankees had blocked the roads, and Sherman's men were everywhere, and Rhett had to guide the wagon through back streets and alleys he knew from his gambling days.",
            "یانکی‌ها جاده‌ها را بسته بودند و مردان شرمن همه‌جا بودند و رت مجبور شد کالسکه را از خیابان‌های پشتی و کوچه‌هایی که از روزهای قمارش می‌شناخت عبور دهد."
        ),
        StoryParagraph(
            "Twice they had to hide in the ruins of abandoned houses while Yankee patrols passed within a few feet, and twice Melanie's baby almost cried out and gave them away.",
            "دو بار مجبور شدند در ویرانه‌های خانه‌های رهاشده پنهان شوند در حالی که گشت‌های یانکی چند قدمی‌شان می‌گذشتند و دو بار نزدیک بود نوزاد ملانی گریه کند و لوشان دهد."
        ),
        StoryParagraph(
            "When they reached the edge of the city, Rhett stopped the wagon and told her he was leaving them, that he was going to join the army at last, that he had decided to do his duty.",
            "وقتی به لبه شهر رسیدند، رت کالسکه را متوقف کرد و به او گفت آن‌ها را ترک می‌کند، که بالاخره می‌خواهد به ارتش بپیوندد، که تصمیم گرفته وظیفه‌اش را انجام دهد."
        ),
        StoryParagraph(
            "Scarlett was furious, terrified, begged him not to leave her in the wilderness with a sick woman and a newborn baby, but Rhett laughed his bitter laugh and kissed her hard.",
            "اسکارلت خشمگین و وحشت‌زده شد، التماس کرد او را در بیابان با زنی بیمار و نوزادی تازه‌متولدشده رها نکند، اما رت خنده تلخش را کرد و محکم بوسیدش."
        ),
        StoryParagraph(
            "'You are a fool, Rhett Butler,' she cried, 'and I hope you get killed in the war!' But he only laughed again and walked away into the smoky darkness, leaving her alone with her fear.",
            "فریاد زد: «تو احمقی، رت باتلر، و امیدوارم در جنگ کشته بشی!» اما او فقط دوباره خندید و به تاریکی دودی رفت و او را با ترسش تنها گذاشت."
        ),
        StoryParagraph(
            "Scarlett was left alone with Melanie, the baby, and a broken wagon, and she drove on through the night, through burning country, through terror and despair, her only thought Tara.",
            "اسکارلت با ملانی، نوزاد و کالسکه‌ای خراب تنها ماند و در شب راند، از کشور در حال سوختن، از وحشت و ناامیدی، تنها فکرش تارا."
        ),
        StoryParagraph(
            "A rain began to fall, a cold November rain that soaked through her clothes and chilled her to the bone, and the horse stumbled on the muddy road, and Melanie moaned in fever in the back of the wagon.",
            "بارانی شروع به باریدن کرد، باران سرد نوامبری که از لباس‌هایش رد شد و تا مغز استخوان سردش کرد، و اسب در جاده گل‌آلود لغزید و ملانی در عقب کالسکه از تب ناله کرد."
        ),
        StoryParagraph(
            "They passed a farm where Yankee soldiers had been, a farm that was nothing but charred beams and dead animals now, and Scarlett saw a woman sitting in the ruins, holding a dead child, singing to it softly.",
            "از مزرعه‌ای گذشتند که سربازان یانکی در آن بوده بودند، مزرعه‌ای که حالا چیزی جز تیرهای سوخته و حیوانات مرده نبود، و اسکارلت زنی را دید که در ویرانه‌ها نشسته بود و بچه‌ای مرده در آغوش داشت و آرام برایش آواز می‌خواند."
        ),
        StoryParagraph(
            "Scarlett did not stop. She could not stop. She had learned, in the fire of Atlanta, that pity was a luxury she could not afford, that survival came first, that the dead would bury the dead.",
            "اسکارلت نایستاد. نمی‌توانست بایستد. در آتش آتلانتا آموخته بود که ترحم تجملی است که نمی‌تواند از عهده‌اش برآید، که بقا اول است، که مرده‌ها، مرده‌هایشان را دفن می‌کنند."
        ),
        StoryParagraph(
            "She drove through the night and through the next day, stopping only once to water the horse, stopping only once to change the baby's cloth and give Melanie a sip of water.",
            "او در شب و روز بعد راند، تنها یک بار برای آب دادن به اسب ایستاد، تنها یک بار برای عوض کردن پارچه نوزاد و دادن جرعه‌ای آب به ملانی."
        ),
        StoryParagraph(
            "The countryside was a graveyard. Burned houses, dead fields, abandoned wagons, unburied bodies. Every mile was a reminder of what war had done to a world she had loved.",
            "حومه گورستانی بود. خانه‌های سوخته، مزارع مرده، کالسکه‌های رهاشده، اجساد دفن‌نشده. هر مایل یادآوری بود از آنچه جنگ به جهانی که دوستش داشت کرده بود."
        ),
        StoryParagraph(
            "At last, at dawn of the third day, the white columns of Tara appeared through the trees, and Scarlett wept for the first time since the flight began, wept with relief and with grief.",
            "سرانجام، در سپیده‌دم روز سوم، ستون‌های سفید تارا از میان درختان ظاهر شد، و اسکارلت برای اولین بار از زمان آغاز فرار گریه کرد، از آسودگی و از غم."
        ),
        StoryParagraph(
            "But her tears were not of joy, for she could already see that the fields were burned, that the barns were empty, that the great house had been stripped of everything of value.",
            "اما اشک‌هایش از شوق نبود، چون از قبل می‌توانست ببیند مزارع سوخته‌اند، انبارها خالی، خانه بزرگ از هر چیز باارزشی لخت شده."
        ),
        StoryParagraph(
            "The house was still standing, but the world around it was dead, and as she drove the wagon up the long red clay drive, Scarlett knew that the life she had known was over.",
            "خانه هنوز سرپا بود، اما جهان اطرافش مرده بود، و در حالی که کالسکه را در مسیر طولانی خاک‌رس سرخ بالا می‌راند، اسکارلت دانست زندگی‌ای که می‌شناخت تمام شده."
        ),
    )
),
StoryChapter(
    number = 3, title = "Tara", titlePersian = "تارا",
    paragraphs = listOf(
        StoryParagraph(
            "Scarlett reached Tara at dawn, after a nightmare journey through the ruined countryside, and what she found was worse than anything she had imagined in her darkest moments.",
            "اسکارلت در سپیده‌دم پس از سفری کابوس‌وار از میان حومه ویران به تارا رسید و آنچه یافت از هر چیزی که در تاریک‌ترین لحظه‌هایش تصور کرده بود بدتر بود."
        ),
        StoryParagraph(
            "The plantation was still standing, but the fields were burned, the barns were empty, the Yankees had taken everything of value, and there was almost no food left in the house.",
            "مزرعه هنوز سرپا بود، اما مزارع سوخته، انبارها خالی، یانکی‌ها هر چیز باارزشی را برده بودند و تقریباً هیچ غذایی در خانه نمانده بود."
        ),
        StoryParagraph(
            "Her mother was dead of typhoid, and her father had lost his mind with grief, wandering the fields and calling for his wife, unaware that she was gone, unaware of anything.",
            "مادرش از حصبه مرده بود و پدرش از غم عقلش را از دست داده بود، در مزارع پرسه می‌زد و همسرش را صدا می‌کرد، بی‌خبر از رفتنش، بی‌خبر از هر چیزی."
        ),
        StoryParagraph(
            "The house was filled with hungry, frightened family members and former slaves who had nowhere else to go, and Scarlett, at nineteen, found herself the head of a household that was falling apart.",
            "خانه پر بود از اعضای خانواده گرسنه و ترسیده و بردگان سابقی که جای دیگری نداشتند بروند، و اسکارلت، در نوزده‌سالگی، خود را سرپرست خانواده‌ای یافت که در حال از هم پاشیدن بود."
        ),
        StoryParagraph(
            "Her sisters were useless, one complaining endlessly and the other weak with fever. The servants were loyal but old and tired. Everyone looked to Scarlett, and Scarlett had nothing left to give.",
            "خواهرانش بی‌فایده بودند، یکی بی‌پایان شکایت می‌کرد و دیگری از تب ضعیف بود. خدمتکاران وفادار اما پیر و خسته بودند. همه به اسکارلت نگاه می‌کردند و اسکارلت چیزی برای دادن نداشت."
        ),
        StoryParagraph(
            "She dug in the garden with her own hands, finding a few radishes half-eaten by worms, and she ate them raw, the bitter taste making her retch, but she kept them down.",
            "با دستان خودش در باغ کند و چند تربچه نیمه‌خورده توسط کرم‌ها پیدا کرد و آن‌ها را خام خورد، طعم تلخ بالا آوردش، اما نگهشان داشت."
        ),
        StoryParagraph(
            "'As God is my witness,' she said aloud, standing in the ruined garden with the dirt on her hands and the tears on her face, 'I will never be hungry again.'",
            "بلند گفت: «خدا شاهد من است،» در حالی که در باغ ویران ایستاده بود با خاک روی دستانش و اشک روی صورتش، «هرگز دیگر گرسنه نخواهم ماند.»"
        ),
        StoryParagraph(
            "She swore that she and her family would survive, no matter what it took, no matter what she had to do, no matter what laws she had to break, no matter what kindness she had to sacrifice.",
            "قسم خورد که او و خانواده‌اش زنده می‌مانند، هر چه می‌خواهد بشود، هر چه باید بکند، هر قانونی که باید بشکند، هر مهربانی‌ای که باید قربانی کند."
        ),
        StoryParagraph(
            "She planted cotton with the help of the few remaining hands, worked from sunrise to sunset, her hands bleeding, her back aching, and she refused to let anyone see her cry.",
            "با کمک چند کارگر باقی‌مانده پنبه کاشت، از طلوع تا غروب کار کرد، دستانش خونریزی می‌کرد، کمرش درد می‌گرفت، و نمی‌گذاشت کسی ببیند گریه می‌کند."
        ),
        StoryParagraph(
            "She plowed the fields herself when the hands were too weak. She milked the cow when no one else could. She shot a chicken for dinner with the same gun she had used to kill a man.",
            "وقتی کارگران خیلی ضعیف بودند، خودش مزارع را شخم زد. وقتی هیچ‌کس دیگری نمی‌توانست، گاو را دوشید. برای شام مرغی را با همان تفنگی کشت که با آن مردی را کشته بود."
        ),
        StoryParagraph(
            "When a Yankee deserter came to the house to steal, she shot him without hesitation, buried the body herself, took his money and his boots, and felt not a moment of guilt.",
            "وقتی سرباز فراری یانکی برای دزدی به خانه آمد، بی‌تردید با گلوله کشتش، خودش جسد را دفن کرد، پول و چکمه‌هایش را برداشت و لحظه‌ای احساس گناه نکرد."
        ),
        StoryParagraph(
            "'I'll never be a lady again,' she thought, 'but I'll never be hungry either.' Tara became her obsession, the land the only thing worth fighting for, dying for, killing for.",
            "فکر کرد: «هرگز دوباره بانو نمی‌شوم، اما هرگز گرسنه هم نخواهم بود.» تارا وسواسش شد، زمین تنها چیزی که ارزش جنگیدن داشت، مردن داشت، کشتن داشت."
        ),
        StoryParagraph(
            "The war ended, and the South lay in ruins, its economy destroyed, its pride broken, its young men dead or crippled, its old men bitter and defeated.",
            "جنگ تمام شد و جنوب در ویرانی افتاد، اقتصادش نابود، غرورش شکسته، جوانانش مرده یا فلج، پیرمردانش تلخ و شکست‌خورده."
        ),
        StoryParagraph(
            "Scarlett received a letter demanding three hundred dollars in taxes on Tara, and if she did not pay within thirty days, she would lose the plantation she had sacrificed everything for.",
            "اسکارلت نامه‌ای دریافت کرد که سیصد دلار مالیات تارا را طلب می‌کرد و اگر ظرف سی روز نمی‌پرداخت، مزرعه‌ای که برایش همه چیز را فدا کرده بود از دست می‌داد."
        ),
        StoryParagraph(
            "Three hundred dollars. It might as well have been three million. She had no money, no jewels, no silver, no horses, nothing that anyone would buy.",
            "سیصد دلار. مثل سه میلیون بود. پول نداشت، جواهر نداشت، نقره نداشت، اسب نداشت، چیزی که کسی بخرد نداشت."
        ),
        StoryParagraph(
            "She thought of Rhett, rich in his prison cell in Atlanta, accused of murder, waiting for a trial that might never come. He had money. He had always had money.",
            "به رت فکر کرد، ثروتمند در سلول زندانش در آتلانتا، متهم به قتل، منتظر محاکمه‌ای که شاید هرگز نمی‌آمد. او پول داشت. همیشه پول داشت."
        ),
        StoryParagraph(
            "She dressed in her mother's old green velvet curtains, making a dress fit for a queen, and she made herself a hat from the matching fabric, and she looked at herself in the mirror and smiled.",
            "پرده‌های مخملی سبز کهنه مادرش را پوشید و لباسی شایسته ملکه‌ای ساخت، از پارچه هماهنگ کلاهی برای خودش ساخت، و در آینه به خودش نگاه کرد و لبخند زد."
        ),
        StoryParagraph(
            "She went to Rhett in the prison, and she tried to charm him, tried to make him believe she was still the belle of the county, tried to make him want to help her.",
            "او نزد رت در زندان رفت و تلاش کرد با جذابیتش فریبش دهد، او را باوراند که هنوز زیبای منطقه است، او را وادار کند بخواهد کمکش کند."
        ),
        StoryParagraph(
            "Rhett saw through her immediately, saw through the borrowed dress and the false smile and the lies she told about her prosperity, and he refused her with a mocking smile.",
            "رت فوراً از او رد شد، از لباس قرضی و لبخند جعلی و دروغ‌هایی که درباره رفاهش می‌گفت رد شد، و با لبخندی ریشخندآمیز ردش کرد."
        ),
        StoryParagraph(
            "He told her that her hands were too rough for a lady, that her face was too thin, that her dress was made from curtains, and that he would not give her a single cent.",
            "به او گفت دستانش برای یک بانو خیلی خشن است، صورتش خیلی لاغر است، لباسش از پرده ساخته شده و او یک سنت هم به او نمی‌دهد."
        ),
        StoryParagraph(
            "Scarlett stormed out of the prison, her pride wounded but her determination unbroken, and she walked through the streets of Atlanta, trying to think of another way.",
            "اسکارلت خشمگین از زندان بیرون رفت، غرورش زخمی اما اراده‌اش نشکسته، و در خیابان‌های آتلانتا قدم زد، تلاش کرد راه دیگری بیندیشد."
        ),
        StoryParagraph(
            "But on the road back to Tara, she met Frank Kennedy, her sister's fiancé, now a rich store owner, a man of forty with a bald spot and a kind heart and a small fortune.",
            "اما در راه بازگشت به تارا با فرانک کندی، نامزد خواهرش، که حالا صاحب مغازه ثروتمندی بود آشنا شد، مردی چهل‌ساله با طاسی و قلبی مهربان و ثروتی کوچک."
        ),
        StoryParagraph(
            "She lied to him, telling him her sister Suellen had married another man, had broken the engagement, had never loved him. Frank believed her, because he wanted to believe her.",
            "به او دروغ گفت و گفت خواهرش سولن با مرد دیگری ازدواج کرده، نامزدی را شکسته، هرگز دوستش نداشته. فرانک باورش کرد، چون می‌خواست باورش کند."
        ),
        StoryParagraph(
            "Frank married Scarlett within two weeks, and she used his money to pay the taxes on Tara, and then she convinced him to lend her more money to buy a sawmill.",
            "فرانک در عرض دو هفته با اسکارلت ازدواج کرد و او از پولش برای پرداخت مالیات تارا استفاده کرد و سپس فرانک را متقاعد کرد پول بیشتری برای خرید کارخانه چوب‌بری به او قرض دهد."
        ),
        StoryParagraph(
            "She ran the mill ruthlessly, hiring convict labor, undercutting her competitors, working her men to exhaustion, and becoming richer than any woman in Atlanta had ever been.",
            "کارخانه را بی‌رحمانه اداره کرد، کارگر اجباری استخدام کرد، رقبایش را زیر پا گذاشت، مردانش را تا حد خستگی کار کشید و ثروتمندتر از هر زنی در آتلانتا شد."
        ),
        StoryParagraph(
            "But the old families hated her, called her a speculator, a vulture, a traitor to her class, a woman who had forgotten what it meant to be a lady, and Scarlett did not care.",
            "اما خانواده‌های اصیل قدیمی از او متنفر بودند، او را سوداگر، کرکس، خائن به طبقه‌اش، زنی که فراموش کرده بانو بودن یعنی چه می‌نامیدند و اسکارلت اهمیت نمی‌داد."
        ),
        StoryParagraph(
            "She had money, and money was all that mattered. She had Tara, and Tara was all that mattered. She had survival, and survival was all that mattered.",
            "پول داشت و پول تنها چیزی بود که اهمیت داشت. تارا را داشت و تارا تنها چیزی بود که اهمیت داشت. بقا داشت و بقا تنها چیزی بود که اهمیت داشت."
        ),
        StoryParagraph(
            "One night, she was attacked in a shantytown on her way home from the mill, and she barely escaped with her life, hiding in the woods until the men who had chased her gave up and left.",
            "یک شب، در راه بازگشت از کارخانه، در حلبی‌آبادی مورد حمله قرار گرفت و به‌سختی با زندگی فرار کرد، در جنگل پنهان شد تا مردانی که تعقیبش می‌کردند تسلیم شدند و رفتند."
        ),
        StoryParagraph(
            "The men of the town, including Ashley and Frank, went for revenge the next night, but it was a trap, and Frank was shot and killed in the darkness, and Ashley was wounded.",
            "مردان شهر، از جمله اشلی و فرانک، شب بعد برای انتقام رفتند، اما تله بود و فرانک در تاریکی با گلوله کشته شد و اشلی زخمی شد."
        ),
        StoryParagraph(
            "Rhett came to her the next morning, and he told her that Frank was dead, that she was a widow again, that the world would blame her for what had happened, and that she was a fool.",
            "رت صبح روز بعد نزد او آمد و به او گفت فرانک مرده، دوباره بیوه شده، جهان او را برای آنچه اتفاق افتاده سرزنش می‌کند، و او احمق است."
        ),
        StoryParagraph(
            "Then he laughed, and he asked her to marry him, and Scarlett, sitting in her black mourning dress with her tear-stained face, looked at him with cold, calculating eyes, and said yes.",
            "بعد خندید و از او خواست با او ازدواج کند و اسکارلت، نشسته در لباس سوگ سیاهش با صورت اشک‌آلود، با چشمانی سرد و حسابگر نگاهش کرد و گفت بله."
        ),
    )
),
StoryChapter(
    number = 4, title = "The Fall", titlePersian = "سقوط",
    paragraphs = listOf(
        StoryParagraph(
            "Scarlett married Rhett Butler, who was now the richest man in Atlanta, a man who had made his fortune in blockade running and speculation during the war, a man whose reputation was as scandalous as his wealth was great.",
            "اسکارلت با رت باتلر ازدواج کرد که حالا ثروتمندترین مرد آتلانتا بود، مردی که ثروتش را در دویدن محاصره و سوداگری در طول جنگ ساخته بود، مردی که آوازه‌اش به رسوایی به اندازه ثروتش بزرگ بود."
        ),
        StoryParagraph(
            "They built a grand house on Peachtree Street, bigger and more magnificent than any in the city, and Scarlett filled it with furniture, carpets, chandeliers, and everything she had ever wanted.",
            "آن‌ها خانه‌ای باشکوه در خیابان پیچ‌تری ساختند، بزرگ‌تر و باشکوه‌تر از هر خانه‌ای در شهر، و اسکارلت آن را پر کرد از مبل، فرش، لوستر و هر چیزی که تا کنون خواسته بود."
        ),
        StoryParagraph(
            "But she was not happy. She could never be happy, for she still loved Ashley, and no amount of money, no amount of luxury, no amount of Rhett's devotion could change that.",
            "اما خوشحال نبود. هرگز نمی‌توانست خوشحال باشد، چون هنوز اشلی را دوست داشت، و هیچ مقدار پول، هیچ مقدار تجمل، هیچ مقدار فداکاری رت نمی‌توانست آن را تغییر دهد."
        ),
        StoryParagraph(
            "They had a daughter, Bonnie, beautiful and spirited like her mother, with golden curls and blue eyes and a laugh that could melt anyone's heart, and Rhett adored her beyond reason.",
            "آن‌ها دختری به نام بانی داشتند، زیبا و پر روح مثل مادرش، با فرهای طلایی و چشمان آبی و خنده‌ای که می‌توانست قلب هر کسی را آب کند، و رت او را فراتر از عقل می‌پرستید."
        ),
        StoryParagraph(
            "He gave her everything, bought her everything, spoiled her beyond measure, and in his love for his daughter, he found the only pure joy he had ever known.",
            "او همه چیز به او داد، همه چیز برایش خرید، فراتر از حد لوسش کرد، و در عشقش به دخترش، تنها شادی خالصی که تا کنون شناخته بود را یافت."
        ),
        StoryParagraph(
            "But Scarlett was jealous of the child, jealous of the love Rhett gave so freely to Bonnie, and she began to compete with her own daughter for her husband's attention.",
            "اما اسکارلت به بچه حسادت می‌کرد، به عشقی که رت با چنان آزادی به بانی می‌داد حسادت می‌کرد و شروع کرد با دختر خودش برای توجه شوهرش رقابت کند."
        ),
        StoryParagraph(
            "She spent her days at the mill with Ashley, and her nights at parties and balls, and she avoided Rhett as much as she could, for his eyes saw too much, and his smile mocked too freely.",
            "روزهایش را با اشلی در کارخانه می‌گذراند و شب‌هایش را در مهمانی‌ها و رقص‌ها، و تا می‌توانست از رت دوری می‌کرد، چون چشمانش خیلی زیاد می‌دید و لبخندش خیلی آزادانه ریشخند می‌کرد."
        ),
        StoryParagraph(
            "Rhett drank more and more, gambled more and more, stayed away from home more and more, and when he was home, he was cold and distant and cruel in his wit.",
            "رت بیشتر و بیشتر می‌نوشید، بیشتر و بیشتر قمار می‌کرد، بیشتر و بیشتر از خانه دور می‌ماند، و وقتی در خانه بود، سرد و دور و در طنزش بی‌رحم بود."
        ),
        StoryParagraph(
            "The years passed, and their marriage slowly fell apart, night by night, argument by argument, silence by silence, until they were strangers sharing the same bed.",
            "سال‌ها گذشت و ازدواجشان آهسته از هم پاشید، شبی به شب، بحثی به بحث، سکوتی به سکوت، تا وقتی غریبه‌هایی شدند که یک تخت را قسمت می‌کردند."
        ),
        StoryParagraph(
            "Scarlett told herself that she was happy, that she had everything she had ever wanted, that money and Tara and Ashley's presence were enough. But she was not happy, and she knew it.",
            "اسکارلت به خودش می‌گفت خوشحال است، که هر چیزی که همیشه می‌خواسته را دارد، که پول و تارا و حضور اشلی کافی است. اما خوشحال نبود و می‌دانست."
        ),
        StoryParagraph(
            "One afternoon, at a political meeting, Scarlett was seen in the company of Ashley Wilkes, and Rhett was seen leaving the meeting with another woman, and the scandal spread through Atlanta like fire.",
            "یک بعدازظهر، در جلسه‌ای سیاسی، اسکارلت در همراهی اشلی ویلکز دیده شد و رت در حال ترک جلسه با زن دیگری دیده شد و رسوایی مثل آتش در آتلانتا پخش شد."
        ),
        StoryParagraph(
            "Rhett and Scarlett fought that night as they had never fought before, and Rhett told her the truth about herself, the truth she had hidden from for years, the truth she could not bear to hear.",
            "رت و اسکارلت آن شب جوری دعوا کردند که هرگز نکرده بودند، و رت حقیقت را درباره او به او گفت، حقیقتی که سال‌ها از آن پنهان شده بود، حقیقتی که تحمل شنیدنش را نداشت."
        ),
        StoryParagraph(
            "He told her that she was selfish, that she was cold, that she was incapable of love, that she had never loved anyone in her life, not Ashley, not him, not even her own children.",
            "به او گفت خودخواه است، سرد است، قادر به عشق نیست، هرگز در عمرش کسی را دوست نداشته، نه اشلی، نه او، نه حتی فرزندان خودش."
        ),
        StoryParagraph(
            "He told her that he had loved her from the first moment he saw her, that he had waited for her for years, that he had married her hoping she would change, and that she had broken his heart.",
            "به او گفت از همان نخستین لحظه که دیده بودش دوستش داشته، سال‌ها منتظرش مانده، با امید تغییرش با او ازدواج کرده و او قلبش را شکسته."
        ),
        StoryParagraph(
            "Then Bonnie died. She fell from her pony while jumping a fence, and she broke her neck, and she died before they could reach her, and Rhett held her body in his arms all night.",
            "بعد بانی مرد. از اسبچه‌اش هنگام پریدن از حصاری افتاد و گردنش شکست و پیش از آنکه به او برسند مرد، و رت تمام شب جسدش را در آغوش نگه داشت."
        ),
        StoryParagraph(
            "Rhett was destroyed by grief. He locked himself in his room, refused to eat, refused to speak, refused to see anyone, and when he finally emerged, he was a different man, hollow and cold.",
            "رت از غم نابود شد. خود را در اتاقش حبس کرد، از خوردن امتناع کرد، از صحبت کردن امتناع کرد، از دیدن کسی امتناع کرد، و وقتی در نهایت بیرون آمد، مرد دیگری بود، توخالی و سرد."
        ),
        StoryParagraph(
            "Scarlett too was devastated, but she could not reach Rhett, could not comfort him, could not even touch him. He blamed her for Bonnie's death, and she blamed herself.",
            "اسکارلت هم ویران شد، اما نمی‌توانست به رت برسد، نمی‌توانست تسلی‌اش دهد، حتی نمی‌توانست لمسش کند. او اسکارلت را برای مرگ بانی سرزنش می‌کرد و اسکارلت خودش را."
        ),
        StoryParagraph(
            "Melanie, always frail, grew sick from a complicated pregnancy and died in the spring, and on her deathbed she asked Scarlett to take care of Ashley, and Scarlett, weeping, promised she would.",
            "ملانی که همیشه نحیف بود از بارداری پیچیده‌ای بیمار شد و در بهار مرد، و در بستر مرگ از اسکارلت خواست از اشلی مراقبت کند و اسکارلت، در حال گریه، قول داد."
        ),
        StoryParagraph(
            "At that moment, in that room, watching Melanie die, Scarlett realized with a terrible clarity that she had never really loved Ashley, only an image of him.",
            "در آن لحظه، در آن اتاق، در حال تماشای مرگ ملانی، اسکارلت با وضوحی هولناک دریافت که هرگز واقعاً اشلی را دوست نداشته، تنها تصویری از او."
        ),
        StoryParagraph(
            "She had loved a dream, a ghost, a fantasy she had chased for years. She had wasted her life on a man who was never worth it, a man who had never loved her, a man who was not even real.",
            "رؤیایی را دوست داشته، شبحی، خیالی که سال‌ها دنبالش دویده. عمرش را بر مردی هدر داده که هرگز ارزشش را نداشت، مردی که هرگز دوستش نداشت، مردی که حتی واقعی نبود."
        ),
        StoryParagraph(
            "She had loved Rhett all along, she understood now, in his way, in his mocking, bitter, faithful way, and she had treated him terribly, and she had driven him away with her coldness and her cruelty.",
            "همیشه رت را دوست داشته، حالا می‌فهمید، به شیوه خودش، به شیوه ریشخندآمیز، تلخ و وفادارش، و به‌طرز وحشتناکی با او رفتار کرده و او را با سردی و بی‌رحمی‌اش رانده بود."
        ),
        StoryParagraph(
            "She ran home through the rain, ran as she had never run before, ran to tell Rhett that she loved him, that she had always loved him, that she was sorry, that she would do anything to make it right.",
            "او زیر باران به خانه دوید، جوری دوید که هرگز ندوید، دوید تا به رت بگوید دوستش دارد، همیشه دوستش داشته، متأسف است، هر کاری می‌کند تا جبران کند."
        ),
        StoryParagraph(
            "She found him in the study, calm and cold, packing his bags, ready to leave her forever. He had made his decision, he told her, and nothing she could say would change it.",
            "او را در دفتر یافت، آرام و سرد، در حال بستن چمدان‌هایش، آماده ترک برای همیشه. به او گفت تصمیمش را گرفته و هیچ چیزی که بگوید تغییرش نمی‌دهد."
        ),
        StoryParagraph(
            "She told him she loved him. She told him she had always loved him. She told him she had been a fool, a blind fool, and that she would spend the rest of her life making it up to him if only he would stay.",
            "به او گفت دوستش دارد. به او گفت همیشه دوستش داشته. به او گفت احمقی بوده، احمق کوری، و اگر بماند باقی عمرش را صرف جبرانش می‌کند."
        ),
        StoryParagraph(
            "For a moment, just for a moment, something flickered in Rhett's eyes, something like hope, something like love, something from a time when he still believed in her.",
            "برای لحظه‌ای، فقط برای لحظه‌ای، چیزی در چشمان رت روشن شد، چیزی شبیه امید، چیزی شبیه عشق، چیزی از زمانی که هنوز به او باور داشت."
        ),
        StoryParagraph(
            "But then the light went out, and his face hardened, and he replied with cold finality: 'My dear, I don't give a damn.' And he walked out of the house and into the fog.",
            "اما بعد نور خاموش شد و صورتش سخت شد و با قاطعیتی سرد پاسخ داد: «عزیزم، برایم اهمیتی ندارد.» و از خانه بیرون رفت و به مه رفت."
        ),
        StoryParagraph(
            "Scarlett sat alone in the empty house, the house she had built with his money, the house that would never be a home, and she thought about everything she had lost.",
            "اسکارلت تنها در خانه خالی نشست، خانه‌ای که با پول او ساخته بود، خانه‌ای که هرگز خانه نمی‌شد، و به همه چیزی که از دست داده بود فکر کرد."
        ),
        StoryParagraph(
            "She had lost Rhett, the only man who had ever truly loved her. She had lost Bonnie, the only child who had ever truly loved her. She had lost Melanie, the only friend she had ever truly had.",
            "رت را از دست داده بود، تنها مردی که هرگز به‌راستی دوستش داشته بود. بانی را از دست داده بود، تنها بچه‌ای که هرگز به‌راستی دوستش داشته بود. ملانی را از دست داده بود، تنها دوستی که هرگز به‌راستی داشته بود."
        ),
        StoryParagraph(
            "She had lost everything, everything except Tara, the land, the only thing that had never failed her, the only thing that had always been there, the only thing that would always be there.",
            "همه چیز را از دست داده بود، همه چیز جز تارا، زمین، تنها چیزی که هرگز رهایش نکرده بود، تنها چیزی که همیشه آنجا بود، تنها چیزی که همیشه آنجا می‌بود."
        ),
    )
),
StoryChapter(
    number = 5, title = "The Aftermath", titlePersian = "پس از آن",
    paragraphs = listOf(
        StoryParagraph(
            "The next morning, Scarlett left Atlanta for Tara. The city was rebuilding, and she watched it with indifferent eyes, for she had no more use for cities or for the people in them.",
            "صبح روز بعد، اسکارلت آتلانتا را به سمت تارا ترک کرد. شهر در حال بازسازی بود و او با چشمانی بی‌تفاوت تماشایش کرد، چون دیگر به شهرها یا مردمشان نیازی نداشت."
        ),
        StoryParagraph(
            "She thought about Rhett and wondered if she could win him back. She knew she would try, because giving up was not in her nature, but she also knew it might be too late.",
            "به رت فکر کرد و حیران بود آیا می‌تواند دوباره به دستش آورد. می‌دانست تلاش می‌کند، چون تسلیم شدن در طبیعتش نبود، اما می‌دانست شاید خیلی دیر شده باشد."
        ),
        StoryParagraph(
            "She thought about Bonnie and wept, for the child had been innocent, had been pure, had been everything that Scarlett was not, and had died because of Scarlett's neglect.",
            "به بانی فکر کرد و گریه کرد، چون بچه معصوم بود، پاک بود، هر چیزی بود که اسکارلت نبود و به‌خاطر غفلت اسکارلت مرده بود."
        ),
        StoryParagraph(
            "She thought about Melanie and wept again, for Melanie had loved her, had trusted her, had believed in her, and Scarlett had repaid that love with indifference and barely veiled contempt.",
            "به ملانی فکر کرد و دوباره گریه کرد، چون ملانی دوستش داشت، به او اعتماد داشت، به او باور داشت و اسکارلت آن عشق را با بی‌تفاوتی و تحقیر به‌سختی پنهان جبران کرده بود."
        ),
        StoryParagraph(
            "She thought about Ashley and felt nothing, nothing at all, as though a fever had finally broken and left her weak and clear-headed and free.",
            "به اشلی فکر کرد و هیچ حس نکرد، هیچ چیز، گویی تبی در نهایت شکسته و او را ضعیف و روشن‌ذهن و آزاد رها کرده بود."
        ),
        StoryParagraph(
            "At Tara, she found the fields green with new cotton, and she walked them slowly, touching the soft white bolls, and she felt the strength of the earth beneath her feet.",
            "در تارا، مزارع را با پنبه نو سبز یافت و آهسته در آن‌ها قدم زد و غوزه‌های سفید نرم را لمس کرد و قوت زمین را زیر پاهایش حس کرد."
        ),
        StoryParagraph(
            "Her father's words echoed in her mind: land is the only thing worth working for, worth fighting for, worth dying for, because it is the only thing that lasts.",
            "کلمات پدرش در ذهنش طنین انداخت: زمین تنها چیزی است که ارزش کار کردن دارد، ارزش جنگیدن دارد، ارزش مردن دارد، چون تنها چیزی است که باقی می‌ماند."
        ),
        StoryParagraph(
            "She decided that she would rebuild Tara into something greater than it had ever been, that she would make the O'Haras powerful again, that she would prove to everyone who had ever doubted her that she could not be defeated.",
            "تصمیم گرفت تارا را به چیزی بزرگ‌تر از آنچه تا کنون بوده بازسازی کند، خاندان اوهارا را دوباره قدرتمند کند، به هر کس که هرگز به او شک کرده بود ثابت کند که نمی‌توان شکستش داد."
        ),
        StoryParagraph(
            "She would plant more cotton, and she would hire more workers, and she would build a new house, and she would fill it with the laughter of children she had not yet had.",
            "پنبه بیشتری می‌کاشت و کارگران بیشتری استخدام می‌کرد و خانه‌ای نو می‌ساخت و آن را با خنده بچه‌هایی که هنوز نداشت پر می‌کرد."
        ),
        StoryParagraph(
            "And if Rhett never came back, she would find a way to live without him. She would find a way to be happy without him. She would find a way to be herself without him.",
            "و اگر رت هرگز برنگشت، راهی برای زندگی بدون او می‌یافت. راهی برای خوشحال بودن بدون او. راهی برای خودش بودن بدون او."
        ),
        StoryParagraph(
            "She had lost everything, but she had not lost herself. And that, for Scarlett O'Hara, was enough to begin again.",
            "او همه چیز را از دست داده بود، اما خودش را از دست نداده بود. و این، برای اسکارلت اوهارا، برای شروع دوباره کافی بود."
        ),
        StoryParagraph(
            "She stood on the porch of Tara and looked out over the red clay fields, and she felt the sun on her face and the wind in her hair, and she smiled, for the first time in months, a real smile.",
            "روی ایوان تارا ایستاد و به مزارع خاک‌رس سرخ نگاه کرد و خورشید را روی صورتش و باد را در موهایش حس کرد و لبخند زد، برای اولین بار در ماه‌ها، لبخندی واقعی."
        ),
        StoryParagraph(
            "She had been broken, but she had not been destroyed. She had fallen, but she would rise again. She had wept, but she would laugh again.",
            "شکسته شده بود، اما نابود نشده بود. افتاده بود، اما دوباره برمی‌خاست. گریه کرده بود، اما دوباره می‌خندید."
        ),
        StoryParagraph(
            "For Scarlett O'Hara was not a woman who gave up. She was not a woman who surrendered. She was not a woman who wept forever over what could not be changed.",
            "زیرا اسکارلت اوهارا زنی نبود که تسلیم شود. زنی نبود که سر تسلیم فرود آورد. زنی نبود که تا ابد برای آنچه تغییرناپذیر بود گریه کند."
        ),
        StoryParagraph(
            "She was a woman who fought, who endured, who survived, and who, in the end, always found a way to go on.",
            "زنی بود که می‌جنگید، تحمل می‌کرد، زنده می‌ماند و در نهایت، همیشه راهی برای ادامه دادن می‌یافت."
        ),
        StoryParagraph(
            "She wrote to Rhett that night, a long letter, a letter in which she told him everything, the truth about Ashley, the truth about Bonnie, the truth about herself, the truth about her love for him.",
            "آن شب به رت نامه نوشت، نامه‌ای بلند، نامه‌ای که در آن همه چیز به او گفت، حقیقت درباره اشلی، حقیقت درباره بانی، حقیقت درباره خودش، حقیقت درباره عشقش به او."
        ),
        StoryParagraph(
            "She told him that she did not expect him to come back, that she did not deserve him, that she had been a fool. She told him that she loved him, and that she always would, no matter what.",
            "به او گفت انتظار ندارد برگردد، لایقش نیست، احمقی بوده. به او گفت دوستش دارد و همیشه دوستش خواهد داشت، هر چه باشد."
        ),
        StoryParagraph(
            "She sent the letter to his house in Atlanta, and she waited for a reply, and no reply came. She sent a second letter, and a third, and no reply came to any of them.",
            "نامه را به خانه‌اش در آتلانتا فرستاد و منتظر جواب ماند و جوابی نیامد. نامه دوم فرستاد، سوم، و هیچ‌کدام جوابی نگرفت."
        ),
        StoryParagraph(
            "Weeks passed, then months, and Rhett did not come back, and slowly, painfully, Scarlett began to accept that he never would, that she had lost him forever, that the last love of her life was gone.",
            "هفته‌ها گذشت، ماه‌ها، و رت برنگشت، و آهسته، دردناک، اسکارلت شروع کرد به پذیرش اینکه هرگز نمی‌آید، که برای همیشه از دستش داده، که آخرین عشق عمرش رفته."
        ),
        StoryParagraph(
            "She cried for three days, and then she stopped. She could not afford to cry any more. She had work to do, a plantation to rebuild, a family to support, a future to create.",
            "سه روز گریه کرد و بعد ایستاد. نمی‌توانست دیگر گریه کند. کار داشت، مزرعه‌ای برای بازسازی، خانواده‌ای برای حمایت، آینده‌ای برای ساختن."
        ),
        StoryParagraph(
            "She married again, a few years later, a kind man, a patient man, a man who did not ask her to love him, only to be his wife. She did not love him, but she respected him, and she was grateful to him.",
            "چند سال بعد دوباره ازدواج کرد، با مردی مهربان، مردی صبور، مردی که از او نخواست دوستش بدارد، تنها همسرش باشد. او را دوست نداشت، اما به او احترام می‌گذاشت و سپاسگزارش بود."
        ),
        StoryParagraph(
            "She had more children, and she loved them, as much as she was capable of loving anyone, and she raised them to be strong, to be practical, to be survivors like their mother.",
            "فرزندان بیشتری داشت و دوستشان داشت، تا آنجا که قادر به دوست داشتن کسی بود، و آن‌ها را طوری بزرگ کرد که قوی، عمل‌گرا و بازمانده‌هایی مثل مادرشان باشند."
        ),
        StoryParagraph(
            "Tara grew and prospered, and Scarlett became one of the wealthiest women in Georgia, and she was respected, and she was feared, and she was envied, and she was alone.",
            "تارا رشد کرد و رونق گرفت و اسکارلت یکی از ثروتمندترین زنان جورجیا شد و محترم بود و ترسیده می‌شد و به او حسادت می‌شد و تنها بود."
        ),
        StoryParagraph(
            "She lived long enough to see her grandchildren grow, to see Tara become a legend, to see her own story become part of the history of the South, and she never once spoke of Rhett Butler again.",
            "آنقدر عمر کرد که نوه‌هایش را بزرگ شدن ببیند، تارا را به افسانه‌ای تبدیل شدن، داستان خودش را بخشی از تاریخ جنوب شدن، و هرگز یک بار هم دیگر درباره رت باتلر حرف نزد."
        ),
        StoryParagraph(
            "But every night, before she slept, she stood at the window of her room at Tara and looked out over the fields, and she thought of him, of the man she had loved too late, of the man she had lost forever.",
            "اما هر شب، پیش از خواب، کنار پنجره اتاقش در تارا می‌ایستاد و به مزارع نگاه می‌کرد و به او فکر می‌کرد، به مردی که خیلی دیر دوستش داشته بود، به مردی که برای همیشه از دست داده بود."
        ),
        StoryParagraph(
            "And every night, she whispered the same words, the words he had said to her in her youth, the words she had carried in her heart for all the years since: tomorrow is another day.",
            "و هر شب، همان کلمات را زمزمه می‌کرد، کلماتی که او در جوانی به او گفته بود، کلماتی که در تمام سال‌های بعد در قلبش حمل کرده بود: فردا روز دیگری است."
        ),
        StoryParagraph(
            "She never saw him again. She never heard from him again. She never knew where he went, or what he did, or whether he ever thought of her.",
            "هرگز دوباره ندیدش. هرگز دوباره از او خبری نگرفت. هرگز ندانست کجا رفت، چه کرد، یا آیا هرگز به او فکر کرد."
        ),
        StoryParagraph(
            "But she knew one thing, with a certainty that never left her: he had loved her, truly, deeply, faithfully, and she had thrown that love away, and no matter how much she prospered, she would never be able to earn it back.",
            "اما یک چیز را می‌دانست، با اطمینانی که هرگز رهایش نکرد: او دوستش داشته، واقعاً، عمیقاً، وفادارانه، و او آن عشق را دور انداخته، و هر چقدر هم رونق گرفته باشد، هرگز نمی‌تواند بازش گرداند."
        ),
        StoryParagraph(
            "And that, in the end, was the tragedy of Scarlett O'Hara: she had everything, and nothing, and the one thing that mattered most, she had destroyed with her own hands.",
            "و این، در پایان، تراژدی اسکارلت اوهارا بود: همه چیز داشت و هیچ، و تنها چیزی که بیشترین اهمیت را داشت را با دستان خودش نابود کرده بود."
        ),
    )
),
StoryChapter(
    number = 6, title = "Tomorrow Is Another Day", titlePersian = "فردا روز دیگری است",
    paragraphs = listOf(
        StoryParagraph(
            "The years passed, as years always do, and Scarlett grew older, and the world around her changed, and she changed with it, though some things in her never changed at all.",
            "سال‌ها گذشت، همان‌طور که سال‌ها همیشه می‌گذرند، و اسکارلت پیر شد و جهان اطرافش تغییر کرد و او هم با آن تغییر کرد، هرچند برخی چیزها در او هرگز تغییر نکردند."
        ),
        StoryParagraph(
            "She had become a woman of substance, respected throughout Georgia, a woman who had built a fortune from nothing, who had saved her family from ruin, who had raised her children to be survivors.",
            "زنی صاحب ثروت شده بود، در سراسر جورجیا محترم، زنی که از هیچ ثروتی ساخته بود، خانواده‌اش را از تباهی نجات داده، فرزندانش را بازمانده‌هایی بزرگ کرده بود."
        ),
        StoryParagraph(
            "But she was not happy. She had never been happy, and she had come to understand, in her later years, that she had never expected to be happy, that she had only expected to survive.",
            "اما خوشحال نبود. هرگز خوشحال نبوده بود و در سال‌های آخر عمرش فهمیده بود که هرگز انتظار خوشحالی نداشته، تنها انتظار بقا داشته."
        ),
        StoryParagraph(
            "And she had survived, gloriously, magnificently, in a way that no one could have predicted when she was a seventeen-year-old widow with nothing but a ruined plantation and a broken heart.",
            "و زنده مانده بود، با شکوه، با عظمت، به شکلی که هیچ‌کس نمی‌توانست پیش‌بینی کند وقتی بیوه‌ای هفده‌ساله بود با هیچ جز مزرعه‌ای ویران و قلبی شکسته."
        ),
        StoryParagraph(
            "She had saved Tara. She had raised her children. She had rebuilt her family's fortune. She had proven to everyone who had ever doubted her that she was stronger than they were.",
            "تارا را نجات داده بود. فرزندانش را بزرگ کرده بود. ثروت خانواده‌اش را بازسازی کرده بود. به هر کس که هرگز به او شک کرده بود ثابت کرده بود که از آنان قوی‌تر است."
        ),
        StoryParagraph(
            "But she had not saved herself. She had not raised her own soul. She had not rebuilt her own heart. She had not proven anything to herself, only to others.",
            "اما خودش را نجات نداده بود. روح خودش را بزرگ نکرده بود. قلب خودش را بازسازی نکرده بود. به خودش چیزی ثابت نکرده بود، تنها به دیگران."
        ),
        StoryParagraph(
            "She was still, in her old age, the same woman she had always been: selfish, calculating, cold, incapable of love, unable to accept love, and desperately, desperately alone.",
            "او در پیری هنوز همان زنی بود که همیشه بوده: خودخواه، حسابگر، سرد، قادر به عشق نبودن، ناتوان از پذیرش عشق و به‌شدت، به‌شدت تنها."
        ),
        StoryParagraph(
            "She had everything, and nothing, and she knew it, and she could not change it, for it was too late, too late for everything she should have done, should have said, should have been.",
            "همه چیز داشت و هیچ، و می‌دانست، و نمی‌توانست تغییرش دهد، چون خیلی دیر بود، خیلی دیر برای هر چیزی که باید می‌کرد، باید می‌گفت، باید می‌بود."
        ),
        StoryParagraph(
            "She thought often of the people she had loved and lost. She thought of Rhett, always of Rhett, the man who had seen her clearly and loved her anyway, until she had finally convinced him not to.",
            "او اغلب به کسانی فکر می‌کرد که دوست داشته و از دست داده. به رت فکر می‌کرد، همیشه به رت، مردی که واضح دیده بودش و به هر حال دوستش داشت، تا وقتی در نهایت او را متقاعد کرد که نداشته باشد."
        ),
        StoryParagraph(
            "She thought of Bonnie, the child she had not loved enough, the child who had died because of her carelessness, the child who haunted her dreams even now, after all these years.",
            "به بانی فکر می‌کرد، بچه‌ای که به اندازه کافی دوستش نداشته، بچه‌ای که به‌خاطر بی‌احتیاطی‌اش مرده بود، بچه‌ای که حتی حالا، بعد از این همه سال، خواب‌هایش را تسخیر می‌کرد."
        ),
        StoryParagraph(
            "She thought of Melanie, the only friend she had ever truly had, the woman she had secretly despised, the woman who had loved her without judgment, without expectation, without condition.",
            "به ملانی فکر می‌کرد، تنها دوستی که هرگز به‌راستی داشته، زنی که پنهانی تحقیرش می‌کرد، زنی که بدون قضاوت، بدون انتظار، بدون شرط دوستش داشته بود."
        ),
        StoryParagraph(
            "She thought of her mother, who had died of typhoid while she was in Atlanta, who had been the only person who could have softened Scarlett, if she had lived long enough to do it.",
            "به مادرش فکر می‌کرد، که وقتی در آتلانتا بود از حصبه مرده بود، که تنها کسی بود که می‌توانست اسکارلت را نرم کند، اگر آنقدر زنده می‌ماند که این کار را بکند."
        ),
        StoryParagraph(
            "She thought of her father, who had died without ever knowing who she had become, who had loved her without understanding her, who had built Tara with his own hands.",
            "به پدرش فکر می‌کرد، که بدون اینکه هرگز بداند او چه شده مرده بود، که بدون درکش دوستش داشته، که تارا را با دستان خودش ساخته بود."
        ),
        StoryParagraph(
            "And she thought of Ashley, with indifference now, with something close to contempt, for he had been weak, and she had wasted her youth on him, and he had never been worth it, not one moment of it.",
            "و به اشلی فکر می‌کرد، حالا با بی‌تفاوتی، با چیزی نزدیک به تحقیر، چون او ضعیف بوده و او جوانی‌اش را بر او هدر داده و او هرگز ارزشش را نداشته، حتی یک لحظه‌اش."
        ),
        StoryParagraph(
            "She had learned, in her old age, that the only thing she had ever truly loved was Tara, the land, the red earth, the only thing that had never abandoned her, the only thing that could never lie.",
            "او در پیری آموخته بود که تنها چیزی که هرگز به‌راستی دوست داشته تارا بوده، زمین، خاک سرخ، تنها چیزی که هرگز ترکش نکرده، تنها چیزی که هرگز نمی‌توانسته دروغ بگوید."
        ),
        StoryParagraph(
            "Tara had given her everything, and Tara would outlive her, as it had outlived her father, as it would outlive her children and grandchildren, as it would outlive everyone who had ever loved it or fought for it.",
            "تارا به او همه چیز داده بود و تارا از او بیشتر عمر می‌کرد، همان‌طور که از پدرش بیشتر عمر کرده بود، همان‌طور که از فرزندان و نوه‌هایش بیشتر عمر می‌کرد، همان‌طور که از هر کس که هرگز دوستش داشته یا برایش جنگیده بود بیشتر عمر می‌کرد."
        ),
        StoryParagraph(
            "And so Scarlett had kept Tara, and Tara had kept her, and the two of them, the woman and the land, the survivor and the soil, had lived out their days together, inseparable and eternal.",
            "و اینگونه اسکارلت تارا را نگه داشته بود و تارا او را نگه داشته بود، و آن دو، زن و زمین، بازمانده و خاک، روزهایشان را با هم گذرانده بودند، جدانشدنی و جاودان."
        ),
        StoryParagraph(
            "She had nothing left to prove, and no one left to prove it to. She had no one left to love, and no one left to love her. She had nothing but Tara, and Tara was enough.",
            "دیگر چیزی برای اثبات نداشت و کسی نمانده بود که به او ثابت کند. کسی برای دوست داشتن نداشت و کسی نمانده بود که دوستش بدارد. هیچ نداشت جز تارا و تارا کافی بود."
        ),
        StoryParagraph(
            "And so she sat, in the evening of her life, on the porch of the house she had rebuilt, and she looked out over the fields she had planted, and she felt the sun on her face and the wind in her hair.",
            "و اینگونه در غروب عمرش روی ایوان خانه‌ای که بازسازی کرده بود نشست و به مزارعی که کاشته بود نگاه کرد و خورشید را روی صورتش و باد را در موهایش حس کرد."
        ),
        StoryParagraph(
            "And she remembered, as she always did at sunset, the words she had spoken as a girl, the vow she had made, the promise that had carried her through war and famine and loss and love.",
            "و به یاد آورد، همان‌طور که همیشه در غروب به یاد می‌آورد، کلماتی که در جوانی گفته بود، عهدی که کرده بود، وعده‌ای که او را از جنگ و قحطی و فقدان و عشق عبور داده بود."
        ),
        StoryParagraph(
            "'As God is my witness, I will never be hungry again.' She had kept that vow. She had kept every vow she had ever made to herself. And she had broken every vow she had ever made to anyone else.",
            "«خدا شاهد من است، هرگز دیگر گرسنه نخواهم ماند.» آن عهد را نگه داشته بود. هر عهدی که هرگز به خودش کرده بود را نگه داشته بود. و هر عهدی که هرگز به کس دیگری کرده بود را شکسته بود."
        ),
        StoryParagraph(
            "She thought, one last time, of Rhett, and she wondered where he was, and she wondered if he was alive, and she wondered if he ever thought of her, and she hoped, with all her heart, that he did not.",
            "برای آخرین بار به رت فکر کرد و حیران بود کجاست، و حیران بود زنده است یا نه، و حیران بود آیا هرگز به او فکر می‌کند، و با تمام قلبش امیدوار بود که نکند."
        ),
        StoryParagraph(
            "For she had hurt him enough, and she did not want to hurt him anymore, not even in memory, not even in thought, not even in the small, quiet places of his heart where she still might live.",
            "زیرا به اندازه کافی آزارش داده بود و نمی‌خواست بیشتر آزارش دهد، نه حتی در خاطره، نه حتی در فکر، نه حتی در جاهای کوچک و آرام قلبش که شاید هنوز در آن‌ها زندگی می‌کرد."
        ),
        StoryParagraph(
            "She hoped that he was happy, wherever he was. She hoped that he had found someone who loved him as he deserved to be loved, honestly, simply, completely, without games and without lies.",
            "امیدوار بود خوشحال باشد، هر کجا که هست. امیدوار بود کسی را یافته باشد که او را آن‌گونه که سزاوار بود دوست بدارد، صادقانه، ساده، کامل، بدون بازی و بدون دروغ."
        ),
        StoryParagraph(
            "She hoped that he had forgotten her. And she knew, with a certainty that had never left her, that he never would.",
            "امیدوار بود فراموشش کرده باشد. و با اطمینانی که هرگز رهایش نکرده بود می‌دانست که هرگز نمی‌کرد."
        ),
        StoryParagraph(
            "And so Scarlett O'Hara, in the last years of her long life, sat on the porch of Tara, and watched the sun set over the red clay fields, and waited for whatever came next.",
            "و اینگونه اسکارلت اوهارا در سال‌های آخر عمر طولانی‌اش، روی ایوان تارا نشست و غروب خورشید را بر مزارع خاک‌رس سرخ تماشا کرد و منتظر ماند برای هر چه بعد می‌آمد."
        ),
        StoryParagraph(
            "She was not afraid of death, for she had faced it many times. She was not afraid of the future, for she had built the future with her own hands. She was not afraid of anything.",
            "از مرگ نمی‌ترسید، چون بارها با آن روبرو شده بود. از آینده نمی‌ترسید، چون آینده را با دستان خودش ساخته بود. از هیچ چیز نمی‌ترسید."
        ),
        StoryParagraph(
            "And as the last light of day faded from the sky, she whispered the words one final time, the words that had been her strength and her curse, her salvation and her damnation.",
            "و در حالی که آخرین نور روز از آسمان محو می‌شد، کلمات را برای آخرین بار زمزمه کرد، کلماتی که قوت و نفرینش، نجات و لعنتش بوده‌اند."
        ),
        StoryParagraph(
            "'Tomorrow is another day.' And she closed her eyes, and she smiled, and she let the darkness take her, and the story of Scarlett O'Hara came to its end.",
            "«فردا روز دیگری است.» و چشمانش را بست و لبخند زد و گذاشت تاریکی او را ببرد و داستان اسکارلت اوهارا به پایانش رسید."
        ),
        StoryParagraph(
            "She had been a daughter, a wife, a widow, a mother, a businesswoman, a survivor. She had been loved, and she had lost. She had been hated, and she had prevailed. She had been Scarlett O'Hara of Tara, and she had lived.",
            "او دختری بوده، همسری، بیوه‌ای، مادری، زنی تاجر، بازمانده‌ای. دوست داشته شده بود و از دست داده بود. از او متنفر بودند و او پیروز شده بود. او اسکارلت اوهارای تارا بوده و زیسته بود."
        ),
    )
),