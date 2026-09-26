package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۱ پیشرفته — ادبیات روسی و آلمانی
 *  ۱. جنایت و مکافات
 *  ۲. آنا کارنینا
 *  ۳. مسخ
 */
object Group1 {

    fun getAll(): List<StoryContent> = listOf(
        story1(),
        story2(),
        story3(),
    )

    // ─────────────── ۱: جنایت و مکافات ───────────────
    private fun story1() = StoryContent(
        storyId = "adv_crime_punishment",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Student in Petersburg", titlePersian = "دانشجوی پترزبورگ",
                paragraphs = listOf(
                    StoryParagraph("Rodion Raskolnikov was a poor student.", "رودیون راسکولنیکوف دانشجوی فقیری بود."),
                    StoryParagraph("He lived in a tiny room in Petersburg.", "او در اتاقی کوچک در پترزبورگ زندگی می‌کرد."),
                    StoryParagraph("The room was more like a closet.", "اتاق بیشتر شبیه کمدی بود."),
                    StoryParagraph("He had stopped going to university.", "او رفتن به دانشگاه را متوقف کرده بود."),
                    StoryParagraph("He owed money to his landlady.", "او به صاحب‌خانه‌اش پول بدهکار بود."),
                    StoryParagraph("His mother sent him what little she had.", "مادرش آن کم را که داشت برایش می‌فرستاد."),
                    StoryParagraph("His sister Dunya worked hard for the family.", "خواهرش دونیا سخت برای خانواده کار می‌کرد."),
                    StoryParagraph("Raskolnikov was proud and intelligent.", "راسکولنیکوف مغرور و باهوش بود."),
                    StoryParagraph("But he was also bitter and desperate.", "اما تلخ و درمانده هم بود."),
                    StoryParagraph("He had developed a strange theory.", "او نظریه عجیبی ساخته بود."),
                    StoryParagraph("He believed some people had the right to kill.", "او معتقد بود بعضی مردم حق کشتن دارند."),
                    StoryParagraph("Great men like Napoleon could do anything.", "مردان بزرگ مثل ناپلئون می‌توانند هر کاری بکنند."),
                    StoryParagraph("They were above the law and morality.", "آن‌ها بالاتر از قانون و اخلاق بودند."),
                    StoryParagraph("Raskolnikov wondered if he was such a man.", "راسکولنیکوف می‌پرسید آیا او چنین مردی است."),
                    StoryParagraph("He decided to test himself.", "تصمیم گرفت خودش را آزمایش کند."),
                    StoryParagraph("He would kill an old pawnbroker.", "او پیرزنی رباخوار را می‌کشت."),
                    StoryParagraph("She was cruel and greedy.", "او ظالم و حریص بود."),
                    StoryParagraph("Her death would help many people.", "مرگش به افراد زیادی کمک می‌کرد."),
                    StoryParagraph("Her money could help him and his family.", "پولش می‌توانست به او و خانواده‌اش کمک کند."),
                    StoryParagraph("He planned everything carefully.", "او همه چیز را با دقت نقشه کشید.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Murder", titlePersian = "قتل",
                paragraphs = listOf(
                    StoryParagraph("One evening, Raskolnikov went to the pawnbroker's.", "یک عصر، راسکولنیکوف به خانه رباخوار رفت."),
                    StoryParagraph("He carried an axe hidden under his coat.", "تبری زیر کتش پنهان داشت."),
                    StoryParagraph("The old woman opened the door.", "پیرزن در را باز کرد."),
                    StoryParagraph("He entered her apartment.", "او وارد آپارتمانش شد."),
                    StoryParagraph("She turned her back to him.", "او پشتش را به او کرد."),
                    StoryParagraph("He struck her on the head with the axe.", "او با تبر به سرش زد."),
                    StoryParagraph("She fell dead on the floor.", "او مرده روی زمین افتاد."),
                    StoryParagraph("He searched for her money and jewels.", "او دنبال پول و جواهراتش گشت."),
                    StoryParagraph("Suddenly, he heard footsteps.", "ناگهان، صدای پا شنید."),
                    StoryParagraph("The pawnbroker's sister had returned.", "خواهر رباخوار برگشته بود."),
                    StoryParagraph("She saw her sister's body and screamed.", "او جسد خواهرش را دید و جیغ زد."),
                    StoryParagraph("Raskolnikov killed her too.", "راسکولنیکوف او را هم کشت."),
                    StoryParagraph("He was now a double murderer.", "او حالا قاتل دوگانه بود."),
                    StoryParagraph("He took some jewelry and ran away.", "او کمی جواهر برداشت و فرار کرد."),
                    StoryParagraph("He hid the axe in an empty courtyard.", "تبر را در حیاطی خالی پنهان کرد."),
                    StoryParagraph("He went back to his room.", "او به اتاقش برگشت."),
                    StoryParagraph("He lay on his bed without sleeping.", "بدون خواب روی تختش دراز کشید."),
                    StoryParagraph("He was in a state of shock.", "او در حالت شوک بود."),
                    StoryParagraph("The next morning, he was called to the police station.", "صبح روز بعد، به کلانتری احضار شد."),
                    StoryParagraph("But it was only about the rent he owed.", "اما فقط درباره اجاره‌ای بود که بدهکار بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Torment of Guilt", titlePersian = "عذاب گناه",
                paragraphs = listOf(
                    StoryParagraph("After the murders, Raskolnikov became very ill.", "بعد از قتل‌ها، راسکولنیکوف خیلی مریض شد."),
                    StoryParagraph("He had a terrible fever for days.", "روزها تب وحشتناکی داشت."),
                    StoryParagraph("He did not know what was real and what was not.", "نمی‌دانست چه واقعی است و چه نیست."),
                    StoryParagraph("His friend Razumikhin took care of him.", "دوستش رازومیخین مراقبش بود."),
                    StoryParagraph("His mother and sister arrived in Petersburg.", "مادر و خواهرش به پترزبورگ رسیدند."),
                    StoryParagraph("They wanted to help him.", "می‌خواستند کمکش کنند."),
                    StoryParagraph("But he pushed them away.", "اما او آن‌ها را دور کرد."),
                    StoryParagraph("He could not face them with his guilt.", "او نمی‌توانست با گناهش روبرویشان شود."),
                    StoryParagraph("He hid the stolen jewelry under a stone.", "جواهرات دزدیده‌شده را زیر سنگی پنهان کرد."),
                    StoryParagraph("He never used any of it.", "او هیچ‌کدام را استفاده نکرد."),
                    StoryParagraph("A police investigator named Porfiry became interested.", "بازپرسی به نام پورفیری علاقه‌مند شد."),
                    StoryParagraph("He suspected Raskolnikov of the murders.", "او به راسکولنیکوف به خاطر قتل‌ها شک کرد."),
                    StoryParagraph("But he had no proof.", "اما مدرکی نداشت."),
                    StoryParagraph("He started to play a psychological game.", "او شروع کرد به بازی روانی."),
                    StoryParagraph("He asked Raskolnikov questions about his theory.", "او از راسکولنیکوف درباره نظریه‌اش سوال پرسید."),
                    StoryParagraph("Raskolnikov became more and more nervous.", "راسکولنیکوف عصبی‌تر و عصبی‌تر شد."),
                    StoryParagraph("He almost confessed several times.", "چندین بار تقریباً اعتراف کرد."),
                    StoryParagraph("But he always stopped himself.", "اما همیشه جلوی خودش را می‌گرفت."),
                    StoryParagraph("The guilt was destroying him from inside.", "گناه او را از داخل نابود می‌کرد."),
                    StoryParagraph("He began to think about confession.", "او شروع کرد به فکر کردن درباره اعتراف.")
                )
            ),
            StoryChapter(
                number = 4, title = "Sonya's Love", titlePersian = "عشق سونیا",
                paragraphs = listOf(
                    StoryParagraph("Raskolnikov met a young woman named Sonya.", "راسکولنیکوف زن جوانی به نام سونیا ملاقات کرد."),
                    StoryParagraph("She was the daughter of a drunkard.", "او دختر مردی میگسار بود."),
                    StoryParagraph("Her family was very poor.", "خانواده‌اش خیلی فقیر بودند."),
                    StoryParagraph("She had become a prostitute to save them.", "او برای نجاتشان روسپی شده بود."),
                    StoryParagraph("Despite her life, she was deeply religious.", "با وجود زندگی‌اش، عمیقاً مذهبی بود."),
                    StoryParagraph("She believed in God and in forgiveness.", "او به خدا و بخشش اعتقاد داشت."),
                    StoryParagraph("Raskolnikov was drawn to her.", "راسکولنیکوف به سمتش کشیده شد."),
                    StoryParagraph("He told her about the murders.", "او درباره قتل‌ها به او گفت."),
                    StoryParagraph("But he did not say it was him.", "اما نگفت که خودش بوده."),
                    StoryParagraph("Sonya guessed the truth.", "سونیا حقیقت را حدس زد."),
                    StoryParagraph("She was horrified but did not judge him.", "او وحشت کرد اما قضاوتش نکرد."),
                    StoryParagraph("She said he should confess and be punished.", "او گفت باید اعتراف کند و مجازات شود."),
                    StoryParagraph("She said God would forgive him.", "او گفت خدا می‌بخشدش."),
                    StoryParagraph("She promised to stay with him always.", "او قول داد همیشه با او بماند."),
                    StoryParagraph("Raskolnikov felt something new inside him.", "راسکولنیکوف چیز جدیدی درونش حس کرد."),
                    StoryParagraph("It was the beginning of love.", "این شروع عشق بود."),
                    StoryParagraph("But he still could not confess.", "اما هنوز نمی‌توانست اعتراف کند."),
                    StoryParagraph("Porfiry finally told him the truth.", "پورفیری بالاخره حقیقت را به او گفت."),
                    StoryParagraph("He knew Raskolnikov was the murderer.", "او می‌دانست راسکولنیکوف قاتل است."),
                    StoryParagraph("He advised him to confess.", "او توصیه کرد اعتراف کند.")
                )
            ),
            StoryChapter(
                number = 5, title = "Confession and Redemption", titlePersian = "اعتراف و رستگاری",
                paragraphs = listOf(
                    StoryParagraph("Raskolnikov went to Sonya one last time.", "راسکولنیکوف یک بار آخر به دیدن سونیا رفت."),
                    StoryParagraph("She gave him a cross to wear.", "او صلیبی به او داد که بپوشد."),
                    StoryParagraph("He walked to the police station slowly.", "او آرام به سمت کلانتری رفت."),
                    StoryParagraph("In the courtyard, he hesitated.", "در حیاط، تردید کرد."),
                    StoryParagraph("He knelt down and kissed the ground.", "او زانو زد و زمین را بوسید."),
                    StoryParagraph("He said he was a murderer.", "او گفت قاتل است."),
                    StoryParagraph("Then he went inside and confessed.", "بعد داخل رفت و اعتراف کرد."),
                    StoryParagraph("He was arrested and sent to Siberia.", "او دستگیر و به سیبری فرستاده شد."),
                    StoryParagraph("He was sentenced to eight years of hard labor.", "او به هشت سال کار سخت محکوم شد."),
                    StoryParagraph("Sonya went with him to Siberia.", "سونیا با او به سیبری رفت."),
                    StoryParagraph("She visited him whenever she could.", "هر وقت می‌توانست به دیدنش می‌رفت."),
                    StoryParagraph("At first, Raskolnikov was cold and angry.", "اول، راسکولنیکوف سرد و عصبانی بود."),
                    StoryParagraph("He did not accept his punishment.", "او مجازاتش را قبول نمی‌کرد."),
                    StoryParagraph("He still believed his theory was right.", "او هنوز معتقد بود نظریه‌اش درست است."),
                    StoryParagraph("But Sonya's love slowly changed him.", "اما عشق سونیا آرام‌آرام تغییرش داد."),
                    StoryParagraph("One day, he realized he loved her.", "یک روز، فهمید دوستش دارد."),
                    StoryParagraph("He fell at her feet and wept.", "او به پای او افتاد و گریه کرد."),
                    StoryParagraph("She wept with him.", "او هم با او گریه کرد."),
                    StoryParagraph("He knew a new life was beginning.", "او می‌دانست زندگی جدیدی شروع شده."),
                    StoryParagraph("Redemption had finally come to him.", "رستگاری بالاخره به سراغش آمد.")
                )
            )
        )
    )

    // ─────────────── ۲: آنا کارنینا ───────────────
    private fun story2() = StoryContent(
        storyId = "adv_anna_karenina",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "A Family in Crisis", titlePersian = "خانواده‌ای در بحران",
                paragraphs = listOf(
                    StoryParagraph("Prince Oblonsky, known as Stiva, had a problem.", "شاهزاده ابلونسکی، معروف به استیوا، مشکلی داشت."),
                    StoryParagraph("His wife Dolly had discovered his affair.", "همسرش دالی خیانتش را کشف کرده بود."),
                    StoryParagraph("She refused to leave her room or see him.", "او از ترک اتاق و دیدن او امتناع می‌کرد."),
                    StoryParagraph("The whole household was in chaos.", "تمام خانه در آشفتگی بود."),
                    StoryParagraph("Stiva sent for his sister Anna Karenina.", "استیوا خواهرش آنا کارنینا را فراخواند."),
                    StoryParagraph("Anna lived in Petersburg with her husband Karenin.", "آنا در پترزبورگ با شوهرش کارنین زندگی می‌کرد."),
                    StoryParagraph("Karenin was a cold and important official.", "کارنین مقامی سرد و مهم بود."),
                    StoryParagraph("Anna took the train to Moscow to help.", "آنا برای کمک با قطار به مسکو رفت."),
                    StoryParagraph("On the train, she met a handsome officer.", "در قطار، افسر خوش‌قیافه‌ای ملاقات کرد."),
                    StoryParagraph("His name was Count Vronsky.", "اسمش کنت ورونسکی بود."),
                    StoryParagraph("He was charming and full of life.", "او جذاب و پر از زندگی بود."),
                    StoryParagraph("When Anna arrived, she talked to Dolly.", "وقتی آنا رسید، با دالی صحبت کرد."),
                    StoryParagraph("She convinced her to forgive Stiva.", "او متقاعدش کرد استیوا را ببخشد."),
                    StoryParagraph("The family was saved from destruction.", "خانواده از نابودی نجات یافت."),
                    StoryParagraph("At a ball that night, Anna met Vronsky again.", "آن شب در بالماسکه، آنا دوباره ورونسکی را دید."),
                    StoryParagraph("He had been courting Kitty, Dolly's sister.", "او در حال خواستگاری از کیتی، خواهر دالی بود."),
                    StoryParagraph("But when he saw Anna, he forgot Kitty.", "اما وقتی آنا را دید، کیتی را فراموش کرد."),
                    StoryParagraph("Anna was beautiful and elegant.", "آنا زیبا و باوقار بود."),
                    StoryParagraph("She was married but only twenty-eight.", "او متأهل بود اما فقط بیست و هشت سال داشت."),
                    StoryParagraph("Something began between them that night.", "آن شب چیزی بین آن‌ها شروع شد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Forbidden Love", titlePersian = "عشق ممنوع",
                paragraphs = listOf(
                    StoryParagraph("Anna went back to Petersburg.", "آنا به پترزبورگ برگشت."),
                    StoryParagraph("Vronsky followed her on the same train.", "ورونسکی با همان قطار دنبالش رفت."),
                    StoryParagraph("He started to appear everywhere she went.", "او شروع کرد همه‌جا که آنا می‌رفت ظاهر شود."),
                    StoryParagraph("He went to parties where she was invited.", "او به مهمانی‌هایی می‌رفت که آنا دعوت بود."),
                    StoryParagraph("He came to her house without an invitation.", "او بدون دعوت به خانه‌اش می‌آمد."),
                    StoryParagraph("Anna was flattered but also afraid.", "آنا خوشحال بود اما می‌ترسید."),
                    StoryParagraph("Her husband Karenin noticed nothing at first.", "شوهرش کارنین اول چیزی متوجه نشد."),
                    StoryParagraph("He was too busy with his work.", "او بیش از حد مشغول کارش بود."),
                    StoryParagraph("But society began to talk.", "اما جامعه شروع کرد به صحبت کردن."),
                    StoryParagraph("Karenin asked Anna to be more careful.", "کارنین از آنا خواست محتاط‌تر باشد."),
                    StoryParagraph("Anna denied everything.", "آنا همه چیز را انکار کرد."),
                    StoryParagraph("But she knew she was lying.", "اما می‌دانست دروغ می‌گوید."),
                    StoryParagraph("She was falling deeply in love with Vronsky.", "او عمیقاً عاشق ورونسکی می‌شد."),
                    StoryParagraph("One night, she admitted her feelings to him.", "یک شب، احساساتش را به او اعتراف کرد."),
                    StoryParagraph("They became lovers.", "آن‌ها عاشق هم شدند."),
                    StoryParagraph("Anna was happier than she had ever been.", "آنا خوشحال‌تر از همیشه بود."),
                    StoryParagraph("But she also felt deep shame.", "اما شرم عمیقی هم حس می‌کرد."),
                    StoryParagraph("She was betraying her husband and her son.", "او به شوهر و پسرش خیانت می‌کرد."),
                    StoryParagraph("Her son Seryozha was only eight.", "پسرش سریوژا فقط هشت سال داشت."),
                    StoryParagraph("She loved him more than anything.", "او بیش از هر چیزی دوستش داشت.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Public Scandal", titlePersian = "رسوایی عمومی",
                paragraphs = listOf(
                    StoryParagraph("Karenin finally learned the truth.", "کارنین بالاخره حقیقت را فهمید."),
                    StoryParagraph("He was coldly furious.", "او سرد و خشمگین شد."),
                    StoryParagraph("He did not challenge Vronsky to a duel.", "او ورونسکی را به دوئل دعوت نکرد."),
                    StoryParagraph("He did not want a scandal.", "او رسوایی نمی‌خواست."),
                    StoryParagraph("He told Anna their marriage would continue in name only.", "او به آنا گفت ازدواجشان فقط اسمی ادامه می‌یابد."),
                    StoryParagraph("He would not let her see Seryozha often.", "او اجازه نمی‌داد زیاد سریوژا را ببیند."),
                    StoryParagraph("Anna was devastated.", "آنا ویران شد."),
                    StoryParagraph("She begged to keep her son.", "او التماس کرد پسرش را نگه دارد."),
                    StoryParagraph("Karenin refused.", "کارنین امتناع کرد."),
                    StoryParagraph("Vronsky asked her to leave her husband.", "ورونسکی از او خواست شوهرش را ترک کند."),
                    StoryParagraph("Anna could not decide.", "آنا نمی‌توانست تصمیم بگیرد."),
                    StoryParagraph("She loved Vronsky but could not abandon Seryozha.", "او ورونسکی را دوست داشت اما نمی‌توانست سریوژا را رها کند."),
                    StoryParagraph("She became more and more unhappy.", "او ناراضی‌تر و ناراضی‌تر شد."),
                    StoryParagraph("She started to use morphine to sleep.", "او شروع کرد به استفاده از مورفین برای خوابیدن."),
                    StoryParagraph("Then she discovered she was pregnant.", "بعد فهمید باردار است."),
                    StoryParagraph("Vronsky was happy about the baby.", "ورونسکی از بچه خوشحال شد."),
                    StoryParagraph("Anna was terrified.", "آنا وحشت کرد."),
                    StoryParagraph("The birth was difficult and dangerous.", "زایمان سخت و خطرناک بود."),
                    StoryParagraph("She almost died.", "او تقریباً مرد."),
                    StoryParagraph("In her fever, she asked for Karenin.", "در تبش، کارنین را خواست.")
                )
            ),
            StoryChapter(
                number = 4, title = "Escape to Italy", titlePersian = "فرار به ایتالیا",
                paragraphs = listOf(
                    StoryParagraph("Karenin came to see Anna on her deathbed.", "کارنین در بستر مرگ به دیدن آنا آمد."),
                    StoryParagraph("He forgave her and Vronsky.", "او آنا و ورونسکی را بخشید."),
                    StoryParagraph("Vronsky was deeply moved.", "ورونسکی عمیقاً تحت تأثیر قرار گرفت."),
                    StoryParagraph("He felt ashamed of himself.", "او از خودش شرمنده شد."),
                    StoryParagraph("But Anna recovered.", "اما آنا بهبود یافت."),
                    StoryParagraph("The forgiveness did not last.", "بخشش دوام نیاورد."),
                    StoryParagraph("Karenin went back to his cold ways.", "کارنین به راه‌های سردش برگشت."),
                    StoryParagraph("Anna decided to leave him forever.", "آنا تصمیم گرفت برای همیشه ترکش کند."),
                    StoryParagraph("She and Vronsky went to Italy.", "او و ورونسکی به ایتالیا رفتند."),
                    StoryParagraph("They lived together in Venice and Rome.", "آن‌ها با هم در ونیز و روم زندگی کردند."),
                    StoryParagraph("At first, they were very happy.", "اول، خیلی خوشحال بودند."),
                    StoryParagraph("They had a daughter named Annie.", "آن‌ها دختری به نام آنی داشتند."),
                    StoryParagraph("But Anna missed her son terribly.", "اما آنا به شدت دلتنگ پسرش بود."),
                    StoryParagraph("She wrote to Karenin asking to see Seryozha.", "او به کارنین نامه نوشت و خواست سریوژا را ببیند."),
                    StoryParagraph("Karenin refused to answer.", "کارنین از جواب دادن امتناع کرد."),
                    StoryParagraph("Anna became depressed.", "آنا افسرده شد."),
                    StoryParagraph("She and Vronsky started to argue.", "او و ورونسکی شروع کردند به دعوا کردن."),
                    StoryParagraph("They returned to Russia but could not settle.", "آن‌ها به روسیه برگشتند اما نمی‌توانستند ساکن شوند."),
                    StoryParagraph("Society rejected Anna everywhere.", "جامعه همه‌جا آنا را طرد می‌کرد."),
                    StoryParagraph("Vronsky could still go out, but she could not.", "ورونسکی هنوز می‌توانست بیرون برود، اما او نمی‌توانست.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Tragic End", titlePersian = "پایان تراژیک",
                paragraphs = listOf(
                    StoryParagraph("Anna and Vronsky moved to his country estate.", "آنا و ورونسکی به ملک روستایی‌اش رفتند."),
                    StoryParagraph("They lived in isolation.", "آن‌ها در انزوا زندگی می‌کردند."),
                    StoryParagraph("Anna became more and more jealous.", "آنا حسودتر و حسودتر شد."),
                    StoryParagraph("She was afraid Vronsky would leave her.", "می‌ترسید ورونسکی ترکش کند."),
                    StoryParagraph("She started to imagine things.", "او شروع کرد به تصور کردن چیزها."),
                    StoryParagraph("She and Vronsky argued constantly.", "او و ورونسکی مدام دعوا می‌کردند."),
                    StoryParagraph("One day, they had a terrible fight.", "یک روز، دعوای وحشتناکی کردند."),
                    StoryParagraph("Vronsky left to visit his mother.", "ورونسکی برای دیدن مادرش رفت."),
                    StoryParagraph("Anna thought he was going to see another woman.", "آنا فکر کرد می‌رود زن دیگری را ببیند."),
                    StoryParagraph("She followed him to the train station.", "او دنبالش تا ایستگاه قطار رفت."),
                    StoryParagraph("She sent him a desperate telegram.", "او تلگرام ناامیدانه‌ای برایش فرستاد."),
                    StoryParagraph("Then she went to the railway tracks.", "بعد به ریل‌های قطار رفت."),
                    StoryParagraph("She remembered the first time she met Vronsky.", "او اولین باری که ورونسکی را دید به یاد آورد."),
                    StoryParagraph("It had been at a train station.", "در ایستگاه قطار بود."),
                    StoryParagraph("She wanted to end her suffering.", "او می‌خواست رنجش را تمام کند."),
                    StoryParagraph("She threw herself under a train.", "او خودش را زیر قطار انداخت."),
                    StoryParagraph("She died immediately.", "او فوراً مرد."),
                    StoryParagraph("Vronsky was destroyed by grief.", "ورونسکی از غم نابود شد."),
                    StoryParagraph("He joined the army to seek death.", "او برای جستجوی مرگ به ارتش پیوست."),
                    StoryParagraph("And so the tragedy of Anna Karenina ended.", "و اینگونه تراژدی آنا کارنینا به پایان رسید.")
                )
            )
        )
    )

    // ─────────────── ۳: مسخ ───────────────
    private fun story3() = StoryContent(
        storyId = "adv_metamorphosis",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Awakening", titlePersian = "بیداری",
                paragraphs = listOf(
                    StoryParagraph("One morning, Gregor Samsa woke up.", "یک صبح، گرگور سامسا بیدار شد."),
                    StoryParagraph("He was a traveling salesman.", "او فروشنده دوره‌گرد بود."),
                    StoryParagraph("He worked hard to support his family.", "او سخت کار می‌کرد تا خانواده‌اش را حمایت کند."),
                    StoryParagraph("His parents and sister lived with him.", "والدین و خواهرش با او زندگی می‌کردند."),
                    StoryParagraph("He was the only one with a job.", "او تنها کسی بود که شغل داشت."),
                    StoryParagraph("But that morning, something was wrong.", "اما آن صبح، چیزی اشتباه بود."),
                    StoryParagraph("He could not move his body normally.", "او نمی‌توانست بدنش را عادی حرکت دهد."),
                    StoryParagraph("He looked at himself in horror.", "او با وحشت به خودش نگاه کرد."),
                    StoryParagraph("He had become a giant insect.", "او به حشره‌ای غول‌پیکر تبدیل شده بود."),
                    StoryParagraph("He had many thin legs.", "پاهای نازک زیادی داشت."),
                    StoryParagraph("His back was hard like a shell.", "پشتش مثل صدف سخت بود."),
                    StoryParagraph("He could not believe it was real.", "او نمی‌توانست باور کند واقعی است."),
                    StoryParagraph("He tried to get out of bed.", "او تلاش کرد از تخت بیرون بیاید."),
                    StoryParagraph("But his new body would not obey him.", "اما بدن جدیدش اطاعتش نمی‌کرد."),
                    StoryParagraph("His mother knocked on the door.", "مادرش به در زد."),
                    StoryParagraph("She asked if he was late for work.", "او پرسید آیا برای کار دیر شده."),
                    StoryParagraph("Gregor tried to answer.", "گرگور تلاش کرد جواب دهد."),
                    StoryParagraph("But his voice had changed too.", "اما صدایش هم تغییر کرده بود."),
                    StoryParagraph("It was strange and animal-like.", "عجیب و شبیه حیوان بود."),
                    StoryParagraph("He could not explain what had happened.", "او نمی‌توانست توضیح دهد چه اتفاقی افتاده.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Family's Shock", titlePersian = "شوک خانواده",
                paragraphs = listOf(
                    StoryParagraph("The family called a doctor.", "خانواده دکتری صدا زدند."),
                    StoryParagraph("The doctor could not understand the illness.", "دکتر نمی‌توانست بیماری را بفهمد."),
                    StoryParagraph("He only said it was not a normal sickness.", "او فقط گفت بیماری عادی نیست."),
                    StoryParagraph("Gregor stayed locked in his room.", "گرگور در اتاقش قفل شد."),
                    StoryParagraph("His sister Grete brought him food.", "خواهرش گرته برایش غذا آورد."),
                    StoryParagraph("She tried milk and bread first.", "او اول شیر و نان امتحان کرد."),
                    StoryParagraph("But Gregor did not like these anymore.", "اما گرگور دیگر دوستشان نداشت."),
                    StoryParagraph("He preferred old and rotting food.", "او غذای کهنه و پوسیده را ترجیح می‌داد."),
                    StoryParagraph("Grete noticed this and brought him leftovers.", "گرته این را متوجه شد و برایش باقی‌مانده‌ها را آورد."),
                    StoryParagraph("She became his caretaker.", "او مراقبش شد."),
                    StoryParagraph("She cleaned his room and brought his food.", "او اتاقش را تمیز می‌کرد و غذایش را می‌آورد."),
                    StoryParagraph("She was the only one who could enter.", "او تنها کسی بود که می‌توانست وارد شود."),
                    StoryParagraph("His parents could not bear to see him.", "والدینش نمی‌توانستند تحمل کنند ببینندش."),
                    StoryParagraph("They were ashamed and afraid.", "آن‌ها شرمنده و ترسیده بودند."),
                    StoryParagraph("The family had lost its only income.", "خانواده تنها درآمدش را از دست داده بود."),
                    StoryParagraph("They started to rent out rooms to lodgers.", "آن‌ها شروع کردند اتاق‌ها را به مستأجران اجاره دهند."),
                    StoryParagraph("Gregor listened to them from his room.", "گرگور از اتاقش به آن‌ها گوش می‌داد."),
                    StoryParagraph("He felt guilty for causing their problems.", "او از ایجاد مشکلاتشان احساس گناه می‌کرد."),
                    StoryParagraph("He wanted to help but could not.", "او می‌خواست کمک کند اما نمی‌توانست."),
                    StoryParagraph("He spent his days crawling on the walls.", "روزها روی دیوارها می‌خزید.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Family's Decline", titlePersian = "افول خانواده",
                paragraphs = listOf(
                    StoryParagraph("Months passed and Gregor got worse.", "ماه‌ها گذشت و گرگور بدتر شد."),
                    StoryParagraph("His family slowly forgot he was human.", "خانواده‌اش آرام‌آرام فراموش کردند انسان است."),
                    StoryParagraph("They stopped talking to him.", "آن‌ها از صحبت با او دست کشیدند."),
                    StoryParagraph("They started calling him 'the creature'.", "آن‌ها شروع کردند به او 'موجود' بگویند."),
                    StoryParagraph("Grete got tired of taking care of him.", "گرته از مراقبت از او خسته شد."),
                    StoryParagraph("She started to neglect his room.", "او شروع کرد به بی‌توجهی به اتاقش."),
                    StoryParagraph("The room became dirty and full of dust.", "اتاق کثیف و پر از گرد و غبار شد."),
                    StoryParagraph("His father became angry and violent.", "پدرش عصبانی و خشن شد."),
                    StoryParagraph("One day, he threw apples at Gregor.", "یک روز، سیب‌ها را به سمت گرگور پرت کرد."),
                    StoryParagraph("One apple stuck in Gregor's back.", "یک سیب در پشت گرگور گیر کرد."),
                    StoryParagraph("The wound became infected.", "زخم عفونی شد."),
                    StoryParagraph("Gregor became weaker and weaker.", "گرگور ضعیف‌تر و ضعیف‌تر شد."),
                    StoryParagraph("He stopped eating almost completely.", "او تقریباً به طور کامل از خوردن دست کشید."),
                    StoryParagraph("One day, the family had a big argument.", "یک روز، خانواده دعوای بزرگی کردند."),
                    StoryParagraph("Grete said they must get rid of him.", "گرته گفت باید از شرش خلاص شوند."),
                    StoryParagraph("She said he was not her brother anymore.", "او گفت دیگر برادرش نیست."),
                    StoryParagraph("Gregor heard everything from his room.", "گرگور همه چیز را از اتاقش شنید."),
                    StoryParagraph("He felt hopeless and sad.", "او احساس ناامیدی و غم کرد."),
                    StoryParagraph("He decided to stop fighting.", "او تصمیم گرفت از تلاش دست بکشد."),
                    StoryParagraph("He wanted to end his own life.", "می‌خواست به زندگی‌اش پایان دهد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Gregor's Death", titlePersian = "مرگ گرگور",
                paragraphs = listOf(
                    StoryParagraph("That night, Gregor lay in his dark room.", "آن شب، گرگور در اتاق تاریکش دراز کشید."),
                    StoryParagraph("He thought about his family.", "او به خانواده‌اش فکر کرد."),
                    StoryParagraph("He still loved them deeply.", "او هنوز عمیقاً دوستشان داشت."),
                    StoryParagraph("He wanted them to live happy lives.", "می‌خواست زندگی‌های خوشی داشته باشند."),
                    StoryParagraph("He thought about his sister's wish.", "او به آرزوی خواهرش فکر کرد."),
                    StoryParagraph("She wanted him gone.", "او می‌خواست او رفته باشد."),
                    StoryParagraph("He agreed with her.", "او با او موافق بود."),
                    StoryParagraph("He was a burden to them.", "او سرباری برای آن‌ها بود."),
                    StoryParagraph("He decided to die.", "تصمیم گرفت بمیرد."),
                    StoryParagraph("He stopped breathing in the early morning.", "صبح زود نفس کشیدن را متوقف کرد."),
                    StoryParagraph("A cleaning lady found his body.", "زنی نظافتچی جسدش را پیدا کرد."),
                    StoryParagraph("She told the family he was dead.", "او به خانواده گفت مرده است."),
                    StoryParagraph("The family came to see him.", "خانواده برای دیدنش آمدند."),
                    StoryParagraph("Grete looked at the dry, flat body.", "گرته به جسد خشک و تخت نگاه کرد."),
                    StoryParagraph("The father said they could finally thank God.", "پدر گفت بالاخره می‌توانند خدا را شکر کنند."),
                    StoryParagraph("The mother cried a little.", "مادر کمی گریه کرد."),
                    StoryParagraph("But everyone felt relief.", "اما همه احساس آرامش کردند."),
                    StoryParagraph("They took the day off from work.", "آن‌ها آن روز را از کار مرخصی گرفتند."),
                    StoryParagraph("They went for a walk in the countryside.", "آن‌ها برای قدم زدن به حومه شهر رفتند."),
                    StoryParagraph("The future seemed bright again.", "آینده دوباره روشن به نظر می‌رسید.")
                )
            ),
            StoryChapter(
                number = 5, title = "A New Beginning", titlePersian = "شروع جدید",
                paragraphs = listOf(
                    StoryParagraph("The family moved to a smaller apartment.", "خانواده به آپارتمانی کوچکتر اسباب‌کشی کردند."),
                    StoryParagraph("They could not afford the old one.", "نمی‌توانستند قبلی را بپردازند."),
                    StoryParagraph("But they felt free.", "اما احساس آزادی می‌کردند."),
                    StoryParagraph("The father and mother found new jobs.", "پدر و مادر شغل‌های جدیدی پیدا کردند."),
                    StoryParagraph("Grete found work in a shop.", "گرته در مغازه‌ای کار پیدا کرد."),
                    StoryParagraph("She had become a strong young woman.", "او زن جوان قوی‌ای شده بود."),
                    StoryParagraph("She helped her parents with money.", "او با پول به والدینش کمک می‌کرد."),
                    StoryParagraph("They did not speak of Gregor anymore.", "آن‌ها دیگر درباره گرگور صحبت نمی‌کردند."),
                    StoryParagraph("His name was never mentioned.", "اسمش هرگز برده نمی‌شد."),
                    StoryParagraph("It was as if he had never existed.", "مثل اینکه هرگز وجود نداشته."),
                    StoryParagraph("One day, the three of them took a trip.", "یک روز، آن سه به سفر رفتند."),
                    StoryParagraph("They rode a tram to the countryside.", "آن‌ها با تراموا به حومه شهر رفتند."),
                    StoryParagraph("The weather was warm and sunny.", "هوا گرم و آفتابی بود."),
                    StoryParagraph("They talked about their plans for the future.", "آن‌ها درباره نقشه‌هایشان برای آینده صحبت کردند."),
                    StoryParagraph("The parents looked at their daughter.", "والدین به دخترشان نگاه کردند."),
                    StoryParagraph("She was young and full of life.", "او جوان و پر از زندگی بود."),
                    StoryParagraph("They realized it was time for her to marry.", "آن‌ها فهمیدند وقت ازدواج او رسیده."),
                    StoryParagraph("The future looked promising.", "آینده امیدوارکننده به نظر می‌رسید."),
                    StoryParagraph("The tragedy of Gregor was forgotten.", "تراژدی گرگور فراموش شد."),
                    StoryParagraph("And life went on without him.", "و زندگی بدون او ادامه یافت.")
                )
            )
        )
    )
}l