package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۲ پیشرفته — تراژدی‌های شکسپیر
 *  ۴. هملت
 *  ۵. رومئو و ژولیت
 *  ۶. شاه لیر
 */
object Group2 {

    fun getAll(): List<StoryContent> = listOf(
        story4(),
        story5(),
        story6(),
    )

    // ─────────────── ۴: هملت ───────────────
    private fun story4() = StoryContent(
        storyId = "adv_hamlet",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Ghost of the King", titlePersian = "روح پدر",
                paragraphs = listOf(
                    StoryParagraph("Hamlet was the prince of Denmark.", "هملت شاهزاده دانمارک بود."),
                    StoryParagraph("He was studying in Germany when his father died.", "او وقتی پدرش مرد، در آلمان درس می‌خواند."),
                    StoryParagraph("He returned home for the funeral.", "او برای مراسم خاکسپاری به خانه برگشت."),
                    StoryParagraph("His mother Gertrude had already remarried.", "مادرش گرترود قبلاً دوباره ازدواج کرده بود."),
                    StoryParagraph("She had married Claudius, the king's brother.", "او با کلودیوس، برادر پادشاه، ازدواج کرده بود."),
                    StoryParagraph("Claudius was now the new king.", "کلودیوس حالا پادشاه جدید بود."),
                    StoryParagraph("Hamlet was deeply sad and angry.", "هملت عمیقاً غمگین و عصبانی بود."),
                    StoryParagraph("He did not trust his uncle.", "او به عمویش اعتماد نداشت."),
                    StoryParagraph("One cold night, guards saw a ghost.", "یک شب سرد، نگهبانان روحی دیدند."),
                    StoryParagraph("It looked like the dead king.", "شبیه پادشاه مرده بود."),
                    StoryParagraph("Hamlet went to see the ghost.", "هملت رفت روح را ببیند."),
                    StoryParagraph("The ghost spoke to him alone.", "روح با او تنها صحبت کرد."),
                    StoryParagraph("It said Claudius had murdered him.", "گفت کلودیوس او را کشته است."),
                    StoryParagraph("He had poured poison in his ear.", "او سم در گوشش ریخته بود."),
                    StoryParagraph("The ghost demanded revenge.", "روح انتقام خواست."),
                    StoryParagraph("But he told Hamlet not to hurt his mother.", "اما به هملت گفت به مادرش آسیب نرساند."),
                    StoryParagraph("Hamlet was shocked and confused.", "هملت شوکه و گیج شد."),
                    StoryParagraph("He did not know if the ghost was real.", "نمی‌دانست آیا روح واقعی است."),
                    StoryParagraph("He decided to pretend to be mad.", "تصمیم گرفت تظاهر به دیوانگی کند."),
                    StoryParagraph("This would help him find the truth.", "این کمکش می‌کرد حقیقت را پیدا کند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Mad Prince", titlePersian = "تظاهر به جنون",
                paragraphs = listOf(
                    StoryParagraph("Hamlet started to act strangely.", "هملت شروع کرد عجیب رفتار کند."),
                    StoryParagraph("He wore black clothes all the time.", "او همیشه لباس سیاه می‌پوشید."),
                    StoryParagraph("He spoke in confusing words.", "با کلمات گیج‌کننده صحبت می‌کرد."),
                    StoryParagraph("Everyone thought he had gone mad.", "همه فکر کردند دیوانه شده است."),
                    StoryParagraph("The king and queen were worried.", "پادشاه و ملکه نگران شدند."),
                    StoryParagraph("They asked his friends to watch him.", "آن‌ها از دوستانش خواستند مراقبش باشند."),
                    StoryParagraph("A girl named Ophelia loved Hamlet.", "دختری به نام اوفلیا عاشق هملت بود."),
                    StoryParagraph("He had loved her too.", "او هم دوستش داشت."),
                    StoryParagraph("But now he treated her cruelly.", "اما حالا با او ظالمانه رفتار می‌کرد."),
                    StoryParagraph("He told her he did not love her.", "به او گفت دوستش ندارد."),
                    StoryParagraph("Ophelia was heartbroken.", "اوفلیا دلشکسته شد."),
                    StoryParagraph("Her father Polonius was the king's advisor.", "پدرش پولونیوس مشاور پادشاه بود."),
                    StoryParagraph("He thought Hamlet's madness was from love.", "او فکر کرد جنون هملت از عشق است."),
                    StoryParagraph("A group of actors came to the castle.", "گروهی از بازیگران به قصر آمدند."),
                    StoryParagraph("Hamlet had an idea.", "هملت ایده‌ای داشت."),
                    StoryParagraph("He asked them to perform a special play.", "او از آن‌ها خواست نمایش خاصی اجرا کنند."),
                    StoryParagraph("The play showed a king being murdered.", "نمایش پادشاهی را نشان می‌داد که کشته می‌شود."),
                    StoryParagraph("It was exactly like his father's death.", "دقیقاً مثل مرگ پدرش بود."),
                    StoryParagraph("He wanted to see Claudius' reaction.", "می‌خواست واکنش کلودیوس را ببیند."),
                    StoryParagraph("If Claudius was guilty, he would react.", "اگر کلودیوس گناهکار بود، واکنش نشان می‌داد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Play in the Palace", titlePersian = "نمایش در قصر",
                paragraphs = listOf(
                    StoryParagraph("The play was performed that night.", "آن شب نمایش اجرا شد."),
                    StoryParagraph("The whole court was there.", "تمام دربار آنجا بود."),
                    StoryParagraph("Hamlet watched Claudius carefully.", "هملت با دقت کلودیوس را تماشا کرد."),
                    StoryParagraph("When the murder scene began, Claudius stood up.", "وقتی صحنه قتل شروع شد، کلودیوس بلند شد."),
                    StoryParagraph("He shouted for lights and left.", "او فریاد زد چراغ بیاورید و رفت."),
                    StoryParagraph("Hamlet knew the ghost had told the truth.", "هملت فهمید روح حقیقت را گفته است."),
                    StoryParagraph("Claudius was guilty.", "کلودیوس گناهکار بود."),
                    StoryParagraph("Later, Hamlet found Claudius praying.", "بعد، هملت کلودیوس را در حال دعا پیدا کرد."),
                    StoryParagraph("He could have killed him then.", "می‌توانست همان‌جا بکشدش."),
                    StoryParagraph("But he did not.", "اما این کار را نکرد."),
                    StoryParagraph("He thought killing a praying man would send him to heaven.", "او فکر کرد کشتن مردی در حال دعا او را به بهشت می‌فرستد."),
                    StoryParagraph("He wanted Claudius to suffer in hell.", "می‌خواست کلودیوس در جهنم عذاب بکشد."),
                    StoryParagraph("So he waited.", "پس صبر کرد."),
                    StoryParagraph("He went to his mother's room.", "او به اتاق مادرش رفت."),
                    StoryParagraph("They had a terrible argument.", "آن‌ها دعوای وحشتناکی کردند."),
                    StoryParagraph("Polonius was hiding behind a curtain.", "پولونیوس پشت پرده‌ای پنهان شده بود."),
                    StoryParagraph("Hamlet heard a noise and stabbed through the curtain.", "هملت صدایی شنید و از پشت پرده ضربه زد."),
                    StoryParagraph("He thought it was Claudius.", "فکر کرد کلودیوس است."),
                    StoryParagraph("But it was Polonius.", "اما پولونیوس بود."),
                    StoryParagraph("Ophelia's father was dead.", "پدر اوفلیا مرده بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "Ophelia's Fate", titlePersian = "سرنوشت اوفلیا",
                paragraphs = listOf(
                    StoryParagraph("Ophelia went mad with grief.", "اوفلیا از غم دیوانه شد."),
                    StoryParagraph("She walked around singing strange songs.", "او دور خود می‌چرخید و آوازهای عجیب می‌خواند."),
                    StoryParagraph("She gave flowers to everyone.", "به همه گل می‌داد."),
                    StoryParagraph("One day, she climbed a willow tree.", "یک روز، از درخت بیدی بالا رفت."),
                    StoryParagraph("The branch broke and she fell into the river.", "شاخه شکست و در رودخانه افتاد."),
                    StoryParagraph("Her heavy clothes pulled her down.", "لباس‌های سنگینش او را پایین کشیدند."),
                    StoryParagraph("She drowned in the water.", "او در آب غرق شد."),
                    StoryParagraph("Hamlet was sent to England by Claudius.", "هملت توسط کلودیوس به انگلیس فرستاده شد."),
                    StoryParagraph("The king wanted him killed there.", "پادشاه می‌خواست آنجا کشته شود."),
                    StoryParagraph("But Hamlet escaped and returned.", "اما هملت فرار کرد و برگشت."),
                    StoryParagraph("On the way, he saw Fortinbras of Norway.", "در راه، فورتینبراس نروژی را دید."),
                    StoryParagraph("Fortinbras was marching to fight for a small piece of land.", "فورتینبراس برای جنگی بر سر زمینی کوچک می‌رفت."),
                    StoryParagraph("Hamlet realized his own revenge was slow.", "هملت فهمید انتقام خودش کند است."),
                    StoryParagraph("He returned to Denmark secretly.", "او مخفیانه به دانمارک برگشت."),
                    StoryParagraph("He saw Ophelia's funeral.", "او مراسم خاکسپاری اوفلیا را دید."),
                    StoryParagraph("Her brother Laertes jumped into the grave.", "برادرش لائرتس به داخل قبر پرید."),
                    StoryParagraph("He blamed Hamlet for his family's deaths.", "او هملت را برای مرگ خانواده‌اش سرزنش کرد."),
                    StoryParagraph("The king planned a duel between them.", "پادشاه دوئلی بین آن‌ها ترتیب داد."),
                    StoryParagraph("But it was a trap.", "اما تله بود."),
                    StoryParagraph("Laertes' sword would be poisoned.", "شمشیر لائرتس زهرآلود بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Duel", titlePersian = "دوئل نهایی",
                paragraphs = listOf(
                    StoryParagraph("The duel began in the great hall.", "دوئل در تالار بزرگ شروع شد."),
                    StoryParagraph("The whole court watched.", "تمام دربار تماشا می‌کرد."),
                    StoryParagraph("Hamlet and Laertes fought with swords.", "هملت و لائرتس با شمشیر جنگیدند."),
                    StoryParagraph("Claudius had also prepared a cup of poisoned wine.", "کلودیوس جام شراب زهرآلودی هم آماده کرده بود."),
                    StoryParagraph("If Hamlet won, he would drink it.", "اگر هملت برنده می‌شد، آن را می‌نوشید."),
                    StoryParagraph("The queen Gertrude picked up the cup.", "ملکه گرترود جام را برداشت."),
                    StoryParagraph("She drank from it without knowing.", "بدون اینکه بداند از آن نوشید."),
                    StoryParagraph("Then Laertes wounded Hamlet with the poisoned sword.", "بعد لائرتس با شمشیر زهرآلود هملت را زخمی کرد."),
                    StoryParagraph("Hamlet wounded Laertes too.", "هملت هم لائرتس را زخمی کرد."),
                    StoryParagraph("The queen fell to the ground and died.", "ملکه روی زمین افتاد و مرد."),
                    StoryParagraph("Hamlet realized the wine was poisoned.", "هملت فهمید شراب زهرآلود است."),
                    StoryParagraph("Laertes told him the truth before dying.", "لائرتس قبل از مرگ حقیقت را گفت."),
                    StoryParagraph("Hamlet turned to Claudius.", "هملت به کلودیوس روی آورد."),
                    StoryParagraph("He stabbed him with the poisoned sword.", "او با شمشیر زهرآلود ضربه‌اش زد."),
                    StoryParagraph("He also forced him to drink the wine.", "او را مجبور کرد شراب را هم بنوشد."),
                    StoryParagraph("Claudius died immediately.", "کلودیوس فوراً مرد."),
                    StoryParagraph("Hamlet was dying too.", "هملت هم در حال مرگ بود."),
                    StoryParagraph("He asked his friend Horatio to tell the truth.", "او از دوستش هوراشیو خواست حقیقت را بگوید."),
                    StoryParagraph("Fortinbras of Norway arrived to take the throne.", "فورتینبراس نروژی برای گرفتن تخت رسید."),
                    StoryParagraph("And so the tragedy of Hamlet ended.", "و اینگونه تراژدی هملت به پایان رسید.")
                )
            )
        )
    )

    // ─────────────── ۵: رومئو و ژولیت ───────────────
    private fun story5() = StoryContent(
        storyId = "adv_romeo_juliet",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Two Enemy Families", titlePersian = "دو خانواده دشمن",
                paragraphs = listOf(
                    StoryParagraph("In Verona, there were two great families.", "در ورونا، دو خانواده بزرگ بودند."),
                    StoryParagraph("They were the Montagues and the Capulets.", "آن‌ها مونتگیو و کاپولت بودند."),
                    StoryParagraph("They had been enemies for many years.", "سال‌ها دشمن بودند."),
                    StoryParagraph("No one remembered why the quarrel started.", "هیچ‌کس یادش نمی‌آمد دعوا از کجا شروع شده."),
                    StoryParagraph("Even the servants fought in the streets.", "حتی خدمتکاران در خیابان‌ها می‌جنگیدند."),
                    StoryParagraph("The prince of Verona warned them to stop.", "شاهزاده ورونا هشدار داد متوقف شوند."),
                    StoryParagraph("If they fought again, they would be punished.", "اگر دوباره بجنگند، مجازات می‌شوند."),
                    StoryParagraph("Romeo was the son of Lord Montague.", "رومئو پسر لرد مونتگیو بود."),
                    StoryParagraph("He was young and romantic.", "او جوان و رمانتیک بود."),
                    StoryParagraph("He was sad because a girl did not love him.", "غمگین بود چون دختری دوستش نداشت."),
                    StoryParagraph("His friends Mercutio and Benvolio tried to cheer him up.", "دوستانش مرکوتیو و بنولیو تلاش کردند خوشحالش کنند."),
                    StoryParagraph("They decided to go to a Capulet party.", "تصمیم گرفتند به مهمانی کاپولت‌ها بروند."),
                    StoryParagraph("It would be a masquerade ball.", "بالماسکه بود."),
                    StoryParagraph("Romeo wore a mask to hide his face.", "رومئو ماسکی برای پنهان کردن صورتش پوشید."),
                    StoryParagraph("At the party, he saw a beautiful girl.", "در مهمانی، دختر زیبایی دید."),
                    StoryParagraph("It was Juliet, the daughter of Lord Capulet.", "ژولیت، دختر لرد کاپولت بود."),
                    StoryParagraph("They fell in love at first sight.", "آن‌ها در نگاه اول عاشق شدند."),
                    StoryParagraph("They talked and kissed without knowing each other's names.", "بدون دانستن نام یکدیگر صحبت کردند و بوسیدند."),
                    StoryParagraph("Then they learned the terrible truth.", "بعد حقیقت وحشتناک را فهمیدند."),
                    StoryParagraph("Their families were enemies.", "خانواده‌هایشان دشمن بودند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Balcony Scene", titlePersian = "بالکن شبانه",
                paragraphs = listOf(
                    StoryParagraph("That night, Romeo could not sleep.", "آن شب، رومئو نمی‌توانست بخوابد."),
                    StoryParagraph("He climbed over the Capulet garden wall.", "او از دیوار باغ کاپولت‌ها بالا رفت."),
                    StoryParagraph("He stood under Juliet's balcony.", "زیر بالکن ژولیت ایستاد."),
                    StoryParagraph("Juliet came out to the balcony.", "ژولیت به بالکن آمد."),
                    StoryParagraph("She did not know he was there.", "نمی‌دانست او آنجاست."),
                    StoryParagraph("She spoke her thoughts aloud.", "افکارش را با صدای بلند گفت."),
                    StoryParagraph("She said she loved Romeo.", "گفت عاشق رومئو است."),
                    StoryParagraph("But she was sad about their families.", "اما از خانواده‌هایشان غمگین بود."),
                    StoryParagraph("Romeo stepped forward and spoke.", "رومئو جلو آمد و صحبت کرد."),
                    StoryParagraph("Juliet was surprised and happy.", "ژولیت تعجب کرد و خوشحال شد."),
                    StoryParagraph("They talked for hours in the moonlight.", "ساعت‌ها در نور ماه صحبت کردند."),
                    StoryParagraph("Romeo promised to marry her.", "رومئو قول داد با او ازدواج کند."),
                    StoryParagraph("Juliet agreed to meet him the next day.", "ژولیت موافقت کرد روز بعد ببیندش."),
                    StoryParagraph("The next morning, Romeo went to Friar Laurence.", "صبح روز بعد، رومئو به پیش فرایر لارنس رفت."),
                    StoryParagraph("The friar was a kind and wise priest.", "فرایر کشیشی مهربان و دانا بود."),
                    StoryParagraph("He agreed to marry them secretly.", "او موافقت کرد مخفیانه ازدواجشان دهد."),
                    StoryParagraph("He hoped it would end the family feud.", "امیدوار بود دشمنی خانوادگی را تمام کند."),
                    StoryParagraph("That afternoon, Romeo and Juliet were married.", "آن بعدازظهر، رومئو و ژولیت ازدواج کردند."),
                    StoryParagraph("It was a small and secret ceremony.", "مراسمی کوچک و مخفیانه بود."),
                    StoryParagraph("They were the happiest people in the world.", "آن‌ها خوشحال‌ترین مردم جهان بودند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Terrible Fight", titlePersian = "دوئل و تبعید",
                paragraphs = listOf(
                    StoryParagraph("Later that day, Romeo met his friends in the street.", "بعدتر آن روز، رومئو دوستانش را در خیابان دید."),
                    StoryParagraph("Tybalt, Juliet's cousin, came looking for him.", "تایبالت، پسرعموی ژولیت، دنبالش آمد."),
                    StoryParagraph("Tybalt wanted to fight Romeo.", "تایبالت می‌خواست با رومئو بجنگد."),
                    StoryParagraph("But Romeo refused.", "اما رومئو امتناع کرد."),
                    StoryParagraph("He was now Tybalt's relative by marriage.", "او حالا با ازدواج، خویشاوند تایبالت بود."),
                    StoryParagraph("Mercutio was angry at Romeo's calmness.", "مرکوتیو از آرامش رومئو عصبانی شد."),
                    StoryParagraph("He fought Tybalt himself.", "خودش با تایبالت جنگید."),
                    StoryParagraph("Mercutio was wounded badly.", "مرکوتیو بدجور زخمی شد."),
                    StoryParagraph("He died in Romeo's arms.", "او در آغوش رومئو مرد."),
                    StoryParagraph("Romeo was furious.", "رومئو خشمگین شد."),
                    StoryParagraph("He fought and killed Tybalt.", "او جنگید و تایبالت را کشت."),
                    StoryParagraph("The prince of Verona was very angry.", "شاهزاده ورونا خیلی عصبانی شد."),
                    StoryParagraph("Romeo was banished from the city.", "رومئو از شهر تبعید شد."),
                    StoryParagraph("He had to leave Verona forever.", "او باید برای همیشه ورونا را ترک می‌کرد."),
                    StoryParagraph("He went to Friar Laurence's cell.", "او به حجره فرایر لارنس رفت."),
                    StoryParagraph("Juliet came to see him one last time.", "ژولیت برای آخرین بار به دیدنش آمد."),
                    StoryParagraph("They spent one night together.", "آن‌ها یک شب را با هم گذراندند."),
                    StoryParagraph("In the morning, Romeo had to leave.", "صبح، رومئو باید می‌رفت."),
                    StoryParagraph("They cried and promised to meet again.", "آن‌ها گریه کردند و قول دادند دوباره ببینند."),
                    StoryParagraph("But they did not know what would happen.", "اما نمی‌دانستند چه اتفاقی می‌افتد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Plan", titlePersian = "نقشه فرار",
                paragraphs = listOf(
                    StoryParagraph("Lord Capulet decided Juliet must marry.", "لرد کاپولت تصمیم گرفت ژولیت باید ازدواج کند."),
                    StoryParagraph("He chose a young man named Paris.", "او مرد جوانی به نام پاریس را انتخاب کرد."),
                    StoryParagraph("The wedding was set for Thursday.", "عروسی برای پنجشنبه تعیین شد."),
                    StoryParagraph("Juliet was horrified.", "ژولیت وحشت کرد."),
                    StoryParagraph("She was already married to Romeo.", "او قبلاً با رومئو ازدواج کرده بود."),
                    StoryParagraph("She went to Friar Laurence for help.", "او برای کمک به فرایر لارنس رفت."),
                    StoryParagraph("The friar had a dangerous plan.", "فرایر نقشه خطرناکی داشت."),
                    StoryParagraph("He gave Juliet a special potion.", "او معجون خاصی به ژولیت داد."),
                    StoryParagraph("It would make her look dead for two days.", "او را برای دو روز مرده نشان می‌داد."),
                    StoryParagraph("Then she would wake up in the family tomb.", "بعد در مقبره خانوادگی بیدار می‌شد."),
                    StoryParagraph("Romeo would come and take her away.", "رومئو می‌آمد و او را می‌برد."),
                    StoryParagraph("They would live together in Mantua.", "آن‌ها با هم در مانتوا زندگی می‌کردند."),
                    StoryParagraph("Juliet agreed to the plan.", "ژولیت با نقشه موافقت کرد."),
                    StoryParagraph("That night, she drank the potion alone.", "آن شب، معجون را تنها نوشید."),
                    StoryParagraph("Her family thought she was dead.", "خانواده‌اش فکر کردند مرده است."),
                    StoryParagraph("They placed her body in the tomb.", "آن‌ها جسدش را در مقبره گذاشتند."),
                    StoryParagraph("Friar Laurence sent a letter to Romeo.", "فرایر لارنس نامه‌ای به رومئو فرستاد."),
                    StoryParagraph("But the letter never reached him.", "اما نامه هرگز به او نرسید."),
                    StoryParagraph("Romeo heard only that Juliet was dead.", "رومئو فقط شنید ژولیت مرده است."),
                    StoryParagraph("He bought poison and rushed back to Verona.", "او سم خرید و به ورونا شتافت.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Tragic End", titlePersian = "پایان تراژیک",
                paragraphs = listOf(
                    StoryParagraph("Romeo reached the tomb at night.", "رومئو شب به مقبره رسید."),
                    StoryParagraph("He saw Juliet lying there.", "او ژولیت را آنجا دراز کشیده دید."),
                    StoryParagraph("She looked beautiful and peaceful.", "او زیبا و آرام به نظر می‌رسید."),
                    StoryParagraph("Romeo could not live without her.", "رومئو نمی‌توانست بدون او زندگی کند."),
                    StoryParagraph("He drank the poison and died beside her.", "او سم را نوشید و کنارش مرد."),
                    StoryParagraph("Juliet woke up a few minutes later.", "ژولیت چند دقیقه بعد بیدار شد."),
                    StoryParagraph("She saw Romeo dead next to her.", "او رومئو را مرده کنارش دید."),
                    StoryParagraph("Friar Laurence came and told her the truth.", "فرایر لارنس آمد و حقیقت را به او گفت."),
                    StoryParagraph("Juliet did not want to live.", "ژولیت نمی‌خواست زندگی کند."),
                    StoryParagraph("She kissed Romeo's lips for poison.", "او لب‌های رومئو را برای سم بوسید."),
                    StoryParagraph("There was no poison left.", "سمی باقی نمانده بود."),
                    StoryParagraph("She took Romeo's dagger.", "او خنجر رومئو را برداشت."),
                    StoryParagraph("She stabbed herself in the heart.", "او خود را در قلبش زد."),
                    StoryParagraph("The two lovers died together.", "دو عاشق با هم مردند."),
                    StoryParagraph("The next morning, everyone found them.", "صبح روز بعد، همه آن‌ها را پیدا کردند."),
                    StoryParagraph("The prince of Verona questioned the friar.", "شاهزاده ورونا از فرایر بازجویی کرد."),
                    StoryParagraph("He told the whole story.", "او تمام داستان را گفت."),
                    StoryParagraph("The two families realized their foolishness.", "دو خانواده حماقتشان را فهمیدند."),
                    StoryParagraph("They ended their long feud.", "آن‌ها دشمنی طولانی‌شان را تمام کردند."),
                    StoryParagraph("But it was too late for their children.", "اما برای فرزندانشان خیلی دیر بود.")
                )
            )
        )
    )

    // ─────────────── ۶: شاه لیر ───────────────
    private fun story6() = StoryContent(
        storyId = "adv_king_lear",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Division of the Kingdom", titlePersian = "تقسیم پادشاهی",
                paragraphs = listOf(
                    StoryParagraph("King Lear was old and tired.", "شاه لیر پیر و خسته بود."),
                    StoryParagraph("He decided to divide his kingdom among his daughters.", "او تصمیم گرفت پادشاهی‌اش را بین دخترانش تقسیم کند."),
                    StoryParagraph("He had three daughters.", "او سه دختر داشت."),
                    StoryParagraph("The oldest two were Goneril and Regan.", "دو دختر بزرگتر گونریل و ریگان بودند."),
                    StoryParagraph("The youngest was Cordelia.", "کوچکترین کوردلیا بود."),
                    StoryParagraph("He asked them how much they loved him.", "او از آن‌ها پرسید چقدر دوستش دارند."),
                    StoryParagraph("Goneril said she loved him more than anything.", "گونریل گفت بیش از هر چیزی دوستش دارد."),
                    StoryParagraph("Regan said the same thing.", "ریگان همین را گفت."),
                    StoryParagraph("But Cordelia loved him silently and truly.", "اما کوردلیا بی‌صدا و واقعی دوستش داشت."),
                    StoryParagraph("She said she loved him as a daughter should.", "او گفت مثل یک دختر دوستش دارد."),
                    StoryParagraph("She would not flatter him with false words.", "او با کلمات دروغ چاپلوسی‌اش نمی‌کرد."),
                    StoryParagraph("Lear was furious with her.", "لیر از او خشمگین شد."),
                    StoryParagraph("He disowned her and gave her nothing.", "او او را طرد کرد و چیزی به او نداد."),
                    StoryParagraph("He divided the kingdom between the two older daughters.", "او پادشاهی را بین دو دختر بزرگتر تقسیم کرد."),
                    StoryParagraph("But he kept the title of king.", "اما عنوان پادشاه را نگه داشت."),
                    StoryParagraph("He wanted to keep his knights and servants.", "می‌خواست شوالیه‌ها و خدمتکارانش را نگه دارد."),
                    StoryParagraph("A lord named Kent tried to defend Cordelia.", "لردی به نام کنت تلاش کرد از کوردلیا دفاع کند."),
                    StoryParagraph("Lear banished him from the kingdom.", "لیر او را از پادشاهی تبعید کرد."),
                    StoryParagraph("The king of France married Cordelia.", "پادشاه فرانسه با کوردلیا ازدواج کرد."),
                    StoryParagraph("She left England without a dowry.", "او بدون جهیزیه انگلیس را ترک کرد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Daughters' Betrayal", titlePersian = "خیانت دختران",
                paragraphs = listOf(
                    StoryParagraph("Lear went to live with Goneril first.", "لیر اول با گونریل زندگی کرد."),
                    StoryParagraph("She treated him coldly.", "او سرد با او رفتار می‌کرد."),
                    StoryParagraph("She complained about his knights.", "او درباره شوالیه‌هایش شکایت کرد."),
                    StoryParagraph("She wanted to reduce his servants.", "او می‌خواست خدمتکارانش را کم کند."),
                    StoryParagraph("Lear was shocked and angry.", "لیر شوکه و عصبانی شد."),
                    StoryParagraph("He went to Regan's castle.", "او به قلعه ریگان رفت."),
                    StoryParagraph("But Regan was just as cruel.", "اما ریگان هم به همان اندازه ظالم بود."),
                    StoryParagraph("She said he did not need any knights.", "او گفت به هیچ شوالیه‌ای نیاز ندارد."),
                    StoryParagraph("Lear realized his daughters had betrayed him.", "لیر فهمید دخترانش خیانت کرده‌اند."),
                    StoryParagraph("He had given them everything.", "او همه چیز به آن‌ها داده بود."),
                    StoryParagraph("Now they had taken even his dignity.", "حالا حتی آبرویش را گرفته بودند."),
                    StoryParagraph("He walked out into a terrible storm.", "او در طوفانی وحشتناک بیرون رفت."),
                    StoryParagraph("The rain and wind beat against him.", "باران و باد به او می‌زدند."),
                    StoryParagraph("But his heart was heavier than the storm.", "اما قلبش از طوفان سنگین‌تر بود."),
                    StoryParagraph("Kent, still loyal, followed him.", "کنت که هنوز وفادار بود، دنبالش رفت."),
                    StoryParagraph("He had disguised himself as a servant.", "او خودش را به عنوان خدمتکار مبدل کرده بود."),
                    StoryParagraph("The Fool, the king's jester, also stayed with him.", "دلقک پادشاه هم با او ماند."),
                    StoryParagraph("The Fool spoke the truth through jokes.", "دلقک از طریق شوخی حقیقت را می‌گفت."),
                    StoryParagraph("Lear began to lose his mind.", "لیر شروع کرد به از دست دادن عقلش."),
                    StoryParagraph("He wandered in the wilderness.", "او در بیابان سرگردان شد.")
                )
            ),
            StoryChapter(
                number = 3, title = "Madness in the Storm", titlePersian = "جنون در طوفان",
                paragraphs = listOf(
                    StoryParagraph("In the storm, Lear met a poor man.", "در طوفان، لیر مردی فقیر دید."),
                    StoryParagraph("His name was Edgar, the son of Gloucester.", "اسمش ادگار، پسر گلاستر بود."),
                    StoryParagraph("Edgar was pretending to be mad.", "ادگار تظاهر به دیوانگی می‌کرد."),
                    StoryParagraph("His brother Edmund had betrayed him.", "برادرش ادموند خیانتش کرده بود."),
                    StoryParagraph("Edmund wanted his father's title and land.", "ادموند عنوان و زمین پدرش را می‌خواست."),
                    StoryParagraph("He had convinced their father that Edgar was a traitor.", "او پدرشان را متقاعد کرده بود ادگار خائن است."),
                    StoryParagraph("Edgar had escaped and disguised himself.", "ادگار فرار کرده و خود را مبدل کرده بود."),
                    StoryParagraph("Lear talked to Edgar about justice.", "لیر با ادگار درباره عدالت صحبت کرد."),
                    StoryParagraph("He realized rich men had too much power.", "او فهمید مردان ثروتمند قدرت زیادی دارند."),
                    StoryParagraph("He felt sorry for the poor people.", "او برای فقرا دلسوزی کرد."),
                    StoryParagraph("Gloucester found them in the storm.", "گلاستر آن‌ها را در طوفان پیدا کرد."),
                    StoryParagraph("He took them to a small shelter.", "او آن‌ها را به پناهگاهی کوچک برد."),
                    StoryParagraph("Gloucester was still loyal to Lear.", "گلاستر هنوز به لیر وفادار بود."),
                    StoryParagraph("But Edmund told the sisters about this.", "اما ادموند به خواهران این را گفت."),
                    StoryParagraph("They punished Gloucester cruelly.", "آن‌ها گلاستر را ظالمانه مجازات کردند."),
                    StoryParagraph("They blinded him and threw him out.", "او را کور کردند و بیرون انداختند."),
                    StoryParagraph("Edgar found his blind father on the road.", "ادگار پدر کورش را در جاده پیدا کرد."),
                    StoryParagraph("He did not reveal his identity.", "او هویتش را فاش نکرد."),
                    StoryParagraph("He guided his father gently.", "او آرام پدرش را راهنمایی کرد."),
                    StoryParagraph("The old man wanted to die.", "پیرمرد می‌خواست بمیرد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Return of Cordelia", titlePersian = "بازگشت کوردلیا",
                paragraphs = listOf(
                    StoryParagraph("Meanwhile, Cordelia had heard about her father.", "در همین حال، کوردلیا درباره پدرش شنیده بود."),
                    StoryParagraph("She was very worried about him.", "او خیلی نگرانش بود."),
                    StoryParagraph("She came back to England with a French army.", "او با ارتش فرانسوی به انگلیس برگشت."),
                    StoryParagraph("She wanted to save her father.", "او می‌خواست پدرش را نجات دهد."),
                    StoryParagraph("She found him wandering in the fields.", "او او را در مزارع سرگردان پیدا کرد."),
                    She was shocked by his condition. She was shocked by his condition.,
                    She was shocked by his condition.,
                    StoryParagraph("He did not recognize her at first.", "او اول او را نشناخت."),
                    StoryParagraph("But then he knew her voice.", "اما بعد صدایش را شناخت."),
                    StoryParagraph("He knelt down and asked for forgiveness.", "او زانو زد و طلب بخشش کرد."),
                    StoryParagraph("Cordelia forgave him with all her heart.", "کوردلیا با تمام قلبش بخشیدش."),
                    StoryParagraph("She took care of him like a child.", "او مثل یک کودک مراقبش بود."),
                    StoryParagraph("He slowly recovered his mind.", "او آرام‌آرام عقلش را بازیافت."),
                    StoryParagraph("They spent some quiet days together.", "آن‌ها چند روز آرام را با هم گذراندند."),
                    StoryParagraph("But the armies were preparing for battle.", "اما ارتش‌ها برای نبرد آماده می‌شدند."),
                    StoryParagraph("Edmund led the English forces.", "ادموند نیروهای انگلیسی را رهبری می‌کرد."),
                    StoryParagraph("He had become powerful and cruel.", "او قدرتمند و ظالم شده بود."),
                    StoryParagraph("He had also fallen in love with both sisters.", "او همچنین عاشق هر دو خواهر شده بود."),
                    StoryParagraph("The battle was about to begin.", "نبرد در شرف شروع بود."),
                    StoryParagraph("Everything would be decided soon.", "همه چیز به‌زودی تعیین می‌شد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Tragic Ending", titlePersian = "پایان غم‌انگیز",
                paragraphs = listOf(
                    StoryParagraph("The battle was fought near Dover.", "نبرد نزدیک دوور انجام شد."),
                    StoryParagraph("Edmund's army won.", "ارتش ادموند پیروز شد."),
                    StoryParagraph("Lear and Cordelia were captured.", "لیر و کوردلیا دستگیر شدند."),
                    StoryParagraph("Edmund ordered them to be killed.", "ادموند دستور داد کشته شوند."),
                    StoryParagraph("But first, he wanted them to be humiliated.", "اما اول می‌خواست تحقیر شوند."),
                    StoryParagraph("They were taken to prison.", "آن‌ها به زندان برده شدند."),
                    StoryParagraph("Lear was happy to be with Cordelia.", "لیر خوشحال بود که با کوردلیا است."),
                    StoryParagraph("He said they would sing together in prison.", "او گفت در زندان با هم آواز می‌خوانند."),
                    StoryParagraph("But Edmund sent a secret order.", "اما ادموند دستور مخفی فرستاد."),
                    StoryParagraph("Cordelia was hanged in her cell.", "کوردلیا در سلولش به دار آویخته شد."),
                    StoryParagraph("Edgar arrived and fought Edmund.", "ادگار رسید و با ادموند جنگید."),
                    StoryParagraph("Edgar won the duel and Edmund was wounded.", "ادگار در دوئل پیروز شد و ادموند زخمی شد."),
                    StoryParagraph("Edmund, dying, tried to undo his evil.", "ادموند در حال مرگ تلاش کرد شرارتش را جبران کند."),
                    StoryParagraph("But it was too late.", "اما خیلی دیر بود."),
                    StoryParagraph("Lear came out carrying Cordelia's body.", "لیر با جسد کوردلیا بیرون آمد."),
                    StoryParagraph("He was crying and screaming.", "او گریه می‌کرد و فریاد می‌زد."),
                    StoryParagraph("He had lost everything he loved.", "او هر چیزی که دوست داشت از دست داده بود."),
                    StoryParagraph("His heart broke and he died.", "قلبش شکست و مرد."),
                    StoryParagraph("Only Edgar and Albany were left.", "فقط ادگار و آلبانی باقی ماندند."),
                    StoryParagraph("And so the tragedy of King Lear ended.", "و اینگونه تراژدی شاه لیر به پایان رسید.")
                )
            )
        )
    )
}