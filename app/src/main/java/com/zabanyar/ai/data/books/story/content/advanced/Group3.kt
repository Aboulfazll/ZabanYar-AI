package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۳ پیشرفته — شکسپیر و کلاسیک
 *  ۷. مکبث
 *  ۸. اتللو
 *  ۹. جین ایر
 */
object Group3 {

    fun getAll(): List<StoryContent> = listOf(
        story7(),
        story8(),
        story9(),
    )

    // ─────────────── ۷: مکبث ───────────────
    private fun story7() = StoryContent(
        storyId = "adv_macbeth",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Witches' Prophecy", titlePersian = "پیش‌گویی جادوگران",
                paragraphs = listOf(
                    StoryParagraph("Macbeth was a brave Scottish general.", "مکبث ژنرال شجاع اسکاتلندی بود."),
                    StoryParagraph("He had just won a great battle.", "او تازه در نبردی بزرگ پیروز شده بود."),
                    StoryParagraph("He was returning home with his friend Banquo.", "او با دوستش بانکو به خانه برمی‌گشت."),
                    StoryParagraph("On a lonely heath, they met three witches.", "در دشتی خلوت، سه جادوگر دیدند."),
                    StoryParagraph("The witches greeted Macbeth with strange words.", "جادوگران مکبث را با کلمات عجیبی خطاب کردند."),
                    StoryParagraph("They called him Thane of Glamis.", "آن‌ها او را تان گلامیس نامیدند."),
                    StoryParagraph("Then they called him Thane of Cawdor.", "بعد او را تان کاودور نامیدند."),
                    StoryParagraph("Finally, they called him King of Scotland.", "بالاخره، او را پادشاه اسکاتلند نامیدند."),
                    StoryParagraph("Macbeth was shocked and confused.", "مکبث شوکه و گیج شد."),
                    StoryParagraph("The witches also spoke to Banquo.", "جادوگران با بانکو هم صحبت کردند."),
                    StoryParagraph("They said his sons would be kings.", "آن‌ها گفتند پسرانش پادشاه می‌شوند."),
                    StoryParagraph("Then they disappeared into the mist.", "بعد در مه ناپدید شدند."),
                    StoryParagraph("Soon after, messengers arrived.", "کمی بعد، پیام‌آورانی رسیدند."),
                    StoryParagraph("They said Macbeth was now Thane of Cawdor.", "آن‌ها گفتند مکبث حالا تان کاودور است."),
                    StoryParagraph("The first prophecy had come true.", "اولین پیش‌گویی حقیقت یافته بود."),
                    StoryParagraph("Macbeth started to think about being king.", "مکبث شروع کرد به فکر پادشاه شدن."),
                    StoryParagraph("He wrote a letter to his wife.", "او نامه‌ای به همسرش نوشت."),
                    StoryParagraph("Lady Macbeth was even more ambitious.", "لیدی مکبث حتی جاه‌طلب‌تر بود."),
                    StoryParagraph("She wanted him to become king quickly.", "او می‌خواست سریع پادشاه شود."),
                    StoryParagraph("She started to plan a terrible act.", "او شروع کرد به نقشه کشیدن برای کاری وحشتناک.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Murder of the King", titlePersian = "قتل پادشاه",
                paragraphs = listOf(
                    StoryParagraph("King Duncan came to Macbeth's castle.", "پادشاه دانکن به قلعه مکبث آمد."),
                    StoryParagraph("He was a kind and generous king.", "او پادشاهی مهربان و سخاوتمند بود."),
                    StoryParagraph("He trusted Macbeth completely.", "او کاملاً به مکبث اعتماد داشت."),
                    StoryParagraph("Lady Macbeth welcomed him warmly.", "لیدی مکبث با گرمی از او استقبال کرد."),
                    StoryParagraph("But in her heart, she planned to kill him.", "اما در قلبش نقشه کشت او را کشید."),
                    StoryParagraph("That night, Duncan went to sleep.", "آن شب، دانکن به خواب رفت."),
                    StoryParagraph("Lady Macbeth gave wine to the guards.", "لیدی مکبث به نگهبانان شراب داد."),
                    StoryParagraph("The guards fell asleep quickly.", "نگهبانان سریع به خواب رفتند."),
                    StoryParagraph("Macbeth entered the king's room.", "مکبث وارد اتاق پادشاه شد."),
                    StoryParagraph("He saw a dagger floating in the air.", "او خنجری شناور در هوا دید."),
                    StoryParagraph("It pointed toward Duncan's room.", "به سمت اتاق دانکن اشاره می‌کرد."),
                    StoryParagraph("Macbeth knew it was a vision.", "مکبث می‌دانست توهمی است."),
                    StoryParagraph("He killed the king with his dagger.", "او پادشاه را با خنجرش کشت."),
                    StoryParagraph("He came out covered in blood.", "او خونی بیرون آمد."),
                    StoryParagraph("He was shaking with fear.", "او از ترس می‌لرزید."),
                    StoryParagraph("Lady Macbeth took the dagger back.", "لیدی مکبث خنجر را پس گرفت."),
                    StoryParagraph("She put blood on the sleeping guards.", "او خون روی نگهبانان خوابیده ریخت."),
                    StoryParagraph("In the morning, the murder was discovered.", "صبح، قتل کشف شد."),
                    StoryParagraph("Macbeth killed the guards in pretend anger.", "مکبث نگهبانان را با خشم ساختگی کشت."),
                    StoryParagraph("He became king of Scotland.", "او پادشاه اسکاتلند شد.")
                )
            ),
            StoryChapter(
                number = 3, title = "Fear and Suspicion", titlePersian = "تاج و تخت خونین",
                paragraphs = listOf(
                    StoryParagraph("Macbeth was now the king.", "مکبث حالا پادشاه بود."),
                    StoryParagraph("But he was not happy.", "اما خوشحال نبود."),
                    StoryParagraph("He remembered the witches' words about Banquo.", "او حرف‌های جادوگران درباره بانکو را به یاد آورد."),
                    StoryParagraph("He was afraid Banquo's sons would be kings.", "می‌ترسید پسران بانکو پادشاه شوند."),
                    StoryParagraph("He decided to kill Banquo and his son.", "او تصمیم گرفت بانکو و پسرش را بکشد."),
                    StoryParagraph("He hired three murderers.", "او سه قاتل استخدام کرد."),
                    StoryParagraph("They attacked Banquo on the road.", "آن‌ها در جاده به بانکو حمله کردند."),
                    StoryParagraph("They killed him, but his son escaped.", "او را کشتند اما پسرش فرار کرد."),
                    StoryParagraph("That night, Macbeth held a great feast.", "آن شب، مکبث ضیافت بزرگی برگزار کرد."),
                    StoryParagraph("He saw Banquo's ghost at the table.", "او روح بانکو را سر میز دید."),
                    StoryParagraph("The ghost was covered in blood.", "روح غرق در خون بود."),
                    StoryParagraph("Macbeth screamed in terror.", "مکبث از وحشت جیغ زد."),
                    StoryParagraph("The guests thought he had gone mad.", "مهمانان فکر کردند دیوانه شده است."),
                    StoryParagraph("Lady Macbeth tried to calm him.", "لیدی مکبث تلاش کرد آرامش کند."),
                    StoryParagraph("But the ghost kept appearing.", "اما روح مدام ظاهر می‌شد."),
                    StoryParagraph("The feast ended in confusion.", "ضیافت در سردرگمی تمام شد."),
                    StoryParagraph("Macbeth became more and more afraid.", "مکبث ترسیده‌تر و ترسیده‌تر شد."),
                    StoryParagraph("He decided to visit the witches again.", "او تصمیم گرفت دوباره به جادوگران برود."),
                    StoryParagraph("He wanted to know his future.", "می‌خواست آینده‌اش را بداند."),
                    StoryParagraph("He would do anything to keep his crown.", "او هر کاری می‌کرد تا تاجش را نگه دارد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Lady Macbeth's Madness", titlePersian = "جنون لیدی مکبث",
                paragraphs = listOf(
                    StoryParagraph("The witches showed Macbeth three visions.", "جادوگران سه رؤیا به مکبث نشان دادند."),
                    StoryParagraph("First, a floating head warned him of Macduff.", "اول، سری شناور او را از مکداف هشدار داد."),
                    StoryParagraph("Second, a bloody child said no man born of woman could harm him.", "دوم، کودکی خونی گفت هیچ مردی که از زن زاده شده نمی‌تواند آسیبش برساند."),
                    StoryParagraph("Third, a crowned child said he was safe until Birnam Wood moved.", "سوم، کودکی تاج‌دار گفت تا وقتی جنگل بیرنام حرکت نکند، امن است."),
                    StoryParagraph("Macbeth felt safe because forests cannot move.", "مکبث احساس امنیت کرد چون جنگل‌ها حرکت نمی‌کنند."),
                    StoryParagraph("He decided to kill Macduff's family.", "او تصمیم گرفت خانواده مکداف را بکشد."),
                    StoryParagraph("His soldiers killed Macduff's wife and children.", "سربازانش زن و بچه‌های مکداف را کشتند."),
                    StoryParagraph("Macduff was in England at the time.", "مکداف آن موقع در انگلیس بود."),
                    StoryParagraph("He returned and swore revenge.", "او برگشت و قسم انتقام خورد."),
                    StoryParagraph("Meanwhile, Lady Macbeth was going mad.", "در همین حال، لیدی مکبث داشت دیوانه می‌شد."),
                    StoryParagraph("She walked in her sleep every night.", "او هر شب در خواب راه می‌رفت."),
                    StoryParagraph("She tried to wash blood from her hands.", "او تلاش می‌کرد خون را از دستانش بشوید."),
                    StoryParagraph("But she could still see the blood.", "اما هنوز خون را می‌دید."),
                    StoryParagraph("She said no water could clean her hands.", "او گفت هیچ آبی نمی‌تواند دستانش را تمیز کند."),
                    StoryParagraph("A doctor watched her with sadness.", "دکتری با غم تماشایش کرد."),
                    StoryParagraph("He said she needed God's help, not a doctor's.", "او گفت به کمک خدا نیاز دارد، نه دکتر."),
                    StoryParagraph("One night, she killed herself.", "یک شب، خودش را کشت."),
                    StoryParagraph("Macbeth heard the news without feeling.", "مکبث خبر را بدون احساس شنید."),
                    StoryParagraph("He said life had no meaning anymore.", "او گفت زندگی دیگر معنایی ندارد."),
                    StoryParagraph("He was alone and empty.", "او تنها و پوچ بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Battle", titlePersian = "پایان تاریک",
                paragraphs = listOf(
                    StoryParagraph("Macduff's army marched toward Macbeth's castle.", "ارتش مکداف به سمت قلعه مکبث حرکت کرد."),
                    StoryParagraph("They had joined with the English forces.", "آن‌ها با نیروهای انگلیسی متحد شده بودند."),
                    StoryParagraph("Macbeth prepared for battle.", "مکبث برای نبرد آماده شد."),
                    StoryParagraph("He still trusted the witches' prophecy.", "او هنوز به پیش‌گویی جادوگران اعتماد داشت."),
                    StoryParagraph("But the soldiers cut branches from Birnam Wood.", "اما سربازان شاخه‌هایی از جنگل بیرنام بریدند."),
                    StoryParagraph("They carried the branches to hide their numbers.", "آن‌ها شاخه‌ها را حمل کردند تا تعدادشان پنهان شود."),
                    StoryParagraph("From a distance, it looked like a moving forest.", "از دور، شبیه جنگلی متحرک به نظر می‌رسید."),
                    StoryParagraph("Macbeth saw it and was terrified.", "مکبث دید و وحشت کرد."),
                    StoryParagraph("The prophecy was coming true.", "پیش‌گویی داشت حقیقت می‌یافت."),
                    StoryParagraph("He still thought he was safe.", "او هنوز فکر می‌کرد امن است."),
                    StoryParagraph("No man born of woman could kill him.", "هیچ مردی که از زن زاده شده نمی‌تواند بکشدش."),
                    StoryParagraph("He fought bravely in the battle.", "او شجاعانه در نبرد جنگید."),
                    StoryParagraph("He killed many soldiers.", "او سربازان زیادی را کشت."),
                    StoryParagraph("Then he faced Macduff.", "بعد با مکداف روبرو شد."),
                    StoryParagraph("He told Macduff about the prophecy.", "او به مکداف درباره پیش‌گویی گفت."),
                    StoryParagraph("Macduff said he was born by caesarean.", "مکداف گفت با سزارین به دنیا آمده."),
                    StoryParagraph("He was not born of woman in the normal way.", "او به روش عادی از زن زاده نشده بود."),
                    StoryParagraph("Macbeth knew he would die.", "مکبث فهمید می‌میرد."),
                    StoryParagraph("Macduff killed him and cut off his head.", "مکداف او را کشت و سرش را برید."),
                    StoryParagraph("And so the tyrant Macbeth fell.", "و اینگونه مستبد مکبث سقوط کرد.")
                )
            )
        )
    )

    // ─────────────── ۸: اتللو ───────────────
    private fun story8() = StoryContent(
        storyId = "adv_othello",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Moor of Venice", titlePersian = "سردار مغربی",
                paragraphs = listOf(
                    StoryParagraph("Othello was a Moorish general in Venice.", "اتللو ژنرال مغربی در ونیز بود."),
                    StoryParagraph("He was a brave and respected soldier.", "او سربازی شجاع و محترم بود."),
                    StoryParagraph("He had won many battles for Venice.", "او نبردهای زیادی برای ونیز برده بود."),
                    StoryParagraph("He was also a dark-skinned foreigner.", "او همچنین بیگانه‌ای تیره‌پوست بود."),
                    StoryParagraph("Some people did not like him for this.", "بعضی مردم به همین دلیل دوستش نداشتند."),
                    StoryParagraph("A senator named Brabantio had a daughter.", "سناتوری به نام برابانتیو دختری داشت."),
                    StoryParagraph("Her name was Desdemona.", "اسمش دزدمونا بود."),
                    StoryParagraph("She was beautiful and kind.", "او زیبا و مهربان بود."),
                    StoryParagraph("Othello told her stories of his adventures.", "اتللو داستان‌های ماجراهایش را برایش می‌گفت."),
                    StoryParagraph("Desdemona fell in love with him.", "دزدمونا عاشقش شد."),
                    StoryParagraph("They married in secret.", "آن‌ها مخفیانه ازدواج کردند."),
                    StoryParagraph("Brabantio was furious when he found out.", "برابانتیو وقتی فهمید خشمگین شد."),
                    StoryParagraph("He accused Othello of using magic.", "او اتللو را به استفاده از جادو متهم کرد."),
                    StoryParagraph("But Desdemona defended her husband.", "اما دزدمونا از شوهرش دفاع کرد."),
                    StoryParagraph("She said she loved him freely.", "او گفت آزادانه دوستش دارد."),
                    StoryParagraph("The Duke of Venice supported the marriage.", "دوک ونیز از این ازدواج حمایت کرد."),
                    StoryParagraph("Othello was sent to Cyprus on military duty.", "اتللو برای مأموریت نظامی به قبرس فرستاده شد."),
                    StoryParagraph("Desdemona went with him.", "دزدمونا با او رفت."),
                    StoryParagraph("A man named Iago also went.", "مردی به نام یاگو هم رفت."),
                    StoryParagraph("Iago was Othello's officer, but he hated him.", "یاگو افسر اتللو بود اما از او متنفر بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "Iago's Plot", titlePersian = "توطئه یاگو",
                paragraphs = listOf(
                    StoryParagraph("Iago was angry because Othello promoted Cassio.", "یاگو عصبانی بود چون اتللو کاسیو را ارتقا داد."),
                    StoryParagraph("Cassio became lieutenant instead of Iago.", "کاسیو به جای یاگو ستوان شد."),
                    StoryParagraph("Iago wanted revenge on both of them.", "یاگو می‌خواست از هر دو انتقام بگیرد."),
                    StoryParagraph("He was a master of lies and tricks.", "او استاد دروغ و ترفند بود."),
                    StoryParagraph("In Cyprus, he started his evil plan.", "در قبرس، نقشه شیطانی‌اش را شروع کرد."),
                    StoryParagraph("He got Cassio drunk one night.", "او یک شب کاسیو را مست کرد."),
                    StoryParagraph("Cassio got into a fight and lost his rank.", "کاسیو در دعوایی افتاد و درجه‌اش را از دست داد."),
                    StoryParagraph("Cassio was very upset.", "کاسیو خیلی ناراحت شد."),
                    StoryParagraph("Iago told him to ask Desdemona for help.", "یاگو به او گفت از دزدمونا کمک بخواهد."),
                    StoryParagraph("Cassio did not know this was part of the plan.", "کاسیو نمی‌دانست این بخشی از نقشه است."),
                    StoryParagraph("Desdemona promised to speak to Othello.", "دزدمونا قول داد با اتللو صحبت کند."),
                    StoryParagraph("She asked her husband many times.", "او بارها از شوهرش خواست."),
                    StoryParagraph("Iago used this to plant doubt in Othello's mind.", "یاگو از این استفاده کرد تا شک در ذهن اتللو بکارد."),
                    StoryParagraph("He said Cassio and Desdemona were too close.", "او گفت کاسیو و دزدمونا بیش از حد نزدیکند."),
                    StoryParagraph("Othello started to feel jealous.", "اتللو شروع کرد به حسادت کردن."),
                    StoryParagraph("He asked Iago for proof.", "او از یاگو مدرک خواست."),
                    StoryParagraph("Iago said he would find evidence.", "یاگو گفت مدرک پیدا می‌کند."),
                    StoryParagraph("But there was no evidence.", "اما مدرکی نبود."),
                    StoryParagraph("Everything was a lie.", "همه چیز دروغ بود."),
                    StoryParagraph("Iago was destroying Othello from inside.", "یاگو اتللو را از داخل نابود می‌کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Poison of Jealousy", titlePersian = "حسادت مرگبار",
                paragraphs = listOf(
                    StoryParagraph("Othello could not sleep or eat.", "اتللو نمی‌توانست بخوابد یا بخورد."),
                    StoryParagraph("The jealousy was eating his heart.", "حسادت قلبش را می‌خورد."),
                    StoryParagraph("He loved Desdemona deeply.", "او عمیقاً دزدمونا را دوست داشت."),
                    StoryParagraph("But he believed Iago's lies.", "اما دروغ‌های یاگو را باور کرد."),
                    StoryParagraph("Iago told him about a handkerchief.", "یاگو درباره دستمالی به او گفت."),
                    StoryParagraph("It was Othello's first gift to Desdemona.", "اولین هدیه اتللو به دزدمونا بود."),
                    StoryParagraph("Iago's wife Emilia was Desdemona's maid.", "امیلیا همسر یاگو خدمتکار دزدمونا بود."),
                    StoryParagraph("Iago asked her to steal the handkerchief.", "یاگو از او خواست دستمال را بدزدد."),
                    StoryParagraph("Emilia did not know why.", "امیلیا نمی‌دانست چرا."),
                    StoryParagraph("Iago then planted it in Cassio's room.", "یاگو بعد آن را در اتاق کاسیو گذاشت."),
                    StoryParagraph("He told Othello he had seen Cassio with it.", "او به اتللو گفت کاسیو را با آن دیده."),
                    StoryParagraph("Othello believed him completely.", "اتللو کاملاً باورش کرد."),
                    StoryParagraph("He decided to kill Desdemona.", "او تصمیم گرفت دزدمونا را بکشد."),
                    StoryParagraph("He asked Iago to kill Cassio.", "او از یاگو خواست کاسیو را بکشد."),
                    StoryParagraph("Iago agreed happily.", "یاگو با خوشحالی موافقت کرد."),
                    StoryParagraph("Othello confronted Desdemona.", "اتللو دزدمونا را بازخواست کرد."),
                    StoryParagraph("She swore she was innocent.", "او قسم خورد بی‌گناه است."),
                    StoryParagraph("But Othello did not believe her.", "اما اتللو باورش نکرد."),
                    StoryParagraph("He called her terrible names.", "او او را با نام‌های وحشتناکی صدا زد."),
                    StoryParagraph("Desdemona was confused and hurt.", "دزدمونا گیج و زخمی شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Night of Murder", titlePersian = "پایان تراژیک",
                paragraphs = listOf(
                    StoryParagraph("That night, Othello went to Desdemona's room.", "آن شب، اتللو به اتاق دزدمونا رفت."),
                    StoryParagraph("She was sleeping peacefully.", "او آرام خوابیده بود."),
                    StoryParagraph("Othello looked at her for a long time.", "اتللو مدت طولانی نگاهش کرد."),
                    StoryParagraph("He loved her more than ever.", "او بیشتر از همیشه دوستش داشت."),
                    StoryParagraph("But the jealousy was too strong.", "اما حسادت خیلی قوی بود."),
                    StoryParagraph("He woke her up and told her to pray.", "او بیدارش کرد و گفت دعا کند."),
                    StoryParagraph("Desdemona was terrified.", "دزدمونا وحشت کرد."),
                    StoryParagraph("She begged him to tell her what was wrong.", "او التماس کرد بگوید چه شده."),
                    StoryParagraph("Othello said she had been unfaithful.", "اتللو گفت خیانت کرده."),
                    StoryParagraph("She swore on her life it was not true.", "او قسم خورد به جانش دروغ است."),
                    StoryParagraph("But Othello did not listen.", "اما اتللو گوش نداد."),
                    StoryParagraph("He smothered her with a pillow.", "او با بالشی خفه‌اش کرد."),
                    StoryParagraph("Emilia ran in when she heard noises.", "امیلیا با شنیدن صداها دوید داخل."),
                    StoryParagraph("She saw Desdemona dying.", "او دزدمونا را در حال مرگ دید."),
                    StoryParagraph("Desdemona said one last thing.", "دزدمونا آخرین حرف را زد."),
                    StoryParagraph("She said she killed herself.", "او گفت خودش را کشت."),
                    StoryParagraph("But Emilia told the truth.", "اما امیلیا حقیقت را گفت."),
                    StoryParagraph("She said Iago had planned everything.", "او گفت یاگو همه چیز را نقشه کشیده."),
                    StoryParagraph("Iago killed her to silence her.", "یاگو برای سکوتش او را کشت."),
                    StoryParagraph("But the truth was already known.", "اما حقیقت قبلاً معلوم شده بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Fall of Othello", titlePersian = "پایان تراژیک",
                paragraphs = listOf(
                    StoryParagraph("Othello realized his terrible mistake.", "اتللو اشتباه وحشتناکش را فهمید."),
                    StoryParagraph("He had killed his innocent wife.", "او همسر بی‌گناهش را کشته بود."),
                    StoryParagraph("He could not live with the guilt.", "او نمی‌توانست با این گناه زندگی کند."),
                    StoryParagraph("He tried to kill Iago.", "او تلاش کرد یاگو را بکشد."),
                    StoryParagraph("But Iago escaped with a wound.", "اما یاگو با زخم فرار کرد."),
                    StoryParagraph("Iago was captured later.", "یاگو بعداً دستگیر شد."),
                    StoryParagraph("He was taken to Venice for trial.", "او برای محاکمه به ونیز برده شد."),
                    StoryParagraph("He never explained why he did it.", "او هرگز توضیح نداد چرا این کار را کرد."),
                    StoryParagraph("Othello gave a final speech.", "اتللو آخرین سخنرانی‌اش را کرد."),
                    StoryParagraph("He told the story of his life.", "او داستان زندگی‌اش را گفت."),
                    StoryParagraph("He asked to be remembered as he was.", "او خواست همانطور که بود به یاد آورده شود."),
                    StoryParagraph("A man who loved too much and not wisely.", "مردی که بیش از حد و نه عاقلانه دوست داشت."),
                    StoryParagraph("Then he stabbed himself.", "بعد خودش را با خنجر زد."),
                    StoryParagraph("He died beside Desdemona.", "او کنار دزدمونا مرد."),
                    StoryParagraph("Cassio became the new governor of Cyprus.", "کاسیو فرماندار جدید قبرس شد."),
                    StoryParagraph("He punished Iago for his crimes.", "او یاگو را برای جنایاتش مجازات کرد."),
                    StoryParagraph("But nothing could bring back the dead.", "اما هیچ چیز نمی‌توانست مرده‌ها را برگرداند."),
                    StoryParagraph("The story became famous in Venice.", "داستان در ونیز معروف شد."),
                    StoryParagraph("People talked about jealousy and its power.", "مردم درباره حسادت و قدرتش صحبت می‌کردند."),
                    StoryParagraph("And so the tragedy of Othello ended.", "و اینگونه تراژدی اتللو به پایان رسید.")
                )
            )
        )
    )

    // ─────────────── ۹: جین ایر ───────────────
    private fun story9() = StoryContent(
        storyId = "adv_jane_eyre",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Gateshead Hall", titlePersian = "کودکی سخت",
                paragraphs = listOf(
                    StoryParagraph("Jane Eyre was an orphan.", "جین ایر یتیم بود."),
                    StoryParagraph("Her parents died when she was very young.", "والدینش وقتی خیلی کوچک بود مردند."),
                    StoryParagraph("She was sent to live with her uncle's family.", "او برای زندگی با خانواده عمویش فرستاده شد."),
                    StoryParagraph("Her uncle loved her but soon died.", "عمویش دوستش داشت اما خیلی زود مرد."),
                    StoryParagraph("His wife, Mrs. Reed, hated Jane.", "همسرش، خانم رید، از جین متنفر بود."),
                    StoryParagraph("Her children treated Jane like a servant.", "فرزندانش با جین مثل خدمتکار رفتار می‌کردند."),
                    StoryParagraph("Jane was often beaten and locked up.", "جین اغلب کتک می‌خورد و حبس می‌شد."),
                    StoryParagraph("One day, her cousin John hit her.", "یک روز، پسرعمویش جان کتکش زد."),
                    StoryParagraph("Jane fought back and was punished.", "جین مقابله کرد و مجازات شد."),
                    StoryParagraph("She was locked in the red room.", "او در اتاق سرخ حبس شد."),
                    StoryParagraph("It was the room where her uncle had died.", "اتاقی بود که عمویش مرده بود."),
                    StoryParagraph("Jane was terrified of ghosts.", "جین از ارواح می‌ترسید."),
                    StoryParagraph("She screamed until she fainted.", "او جیغ زد تا غش کرد."),
                    StoryParagraph("The servants found her unconscious.", "خدمتکاران او را بیهوش پیدا کردند."),
                    StoryParagraph("A doctor came to examine her.", "دکتری برای معاینه‌اش آمد."),
                    StoryParagraph("He suggested she go to school.", "او پیشنهاد کرد به مدرسه برود."),
                    StoryParagraph("Mrs. Reed was happy to send her away.", "خانم رید خوشحال شد او را بفرستد."),
                    StoryParagraph("Jane left Gateshead Hall.", "جین تالار گیتس‌هد را ترک کرد."),
                    StoryParagraph("She was only ten years old.", "او فقط ده سال داشت."),
                    StoryParagraph("But she was glad to go.", "اما خوشحال بود که می‌رود.")
                )
            ),
            StoryChapter(
                number = 2, title = "Lowood School", titlePersian = "مدرسه لووود",
                paragraphs = listOf(
                    StoryParagraph("Lowood was a school for poor orphan girls.", "لووود مدرسه‌ای برای دختران یتیم فقیر بود."),
                    StoryParagraph("The conditions were very harsh.", "شرایط خیلی سخت بود."),
                    StoryParagraph("The girls were cold and hungry.", "دخترها سرد و گرسنه بودند."),
                    StoryParagraph("The headmaster, Mr. Brocklehurst, was cruel.", "مدیر، آقای براکلهرست، ظالم بود."),
                    StoryParagraph("He said the girls should suffer to be humble.", "او می‌گفت دخترها باید رنج بکشند تا فروتن شوند."),
                    StoryParagraph("Jane made a friend named Helen Burns.", "جین دوستی به نام هلن برنز پیدا کرد."),
                    StoryParagraph("Helen was kind, patient, and wise.", "هلن مهربان، صبور و دانا بود."),
                    StoryParagraph("She taught Jane about forgiveness.", "او به جین بخشش آموخت."),
                    StoryParagraph("Many girls became sick with fever.", "دختران زیادی از تب مریض شدند."),
                    StoryParagraph("Helen became very ill.", "هلن خیلی مریض شد."),
                    StoryParagraph("Jane visited her every night.", "جین هر شب به دیدنش می‌رفت."),
                    StoryParagraph("One night, Helen died in Jane's arms.", "یک شب، هلن در آغوش جین مرد."),
                    StoryParagraph("Jane was very sad but strong.", "جین خیلی غمگین بود اما قوی."),
                    StoryParagraph("She stayed at Lowood for eight years.", "او هشت سال در لووود ماند."),
                    StoryParagraph("Six as a student and two as a teacher.", "شش سال شاگرد و دو سال معلم."),
                    StoryParagraph("She learned many things.", "او چیزهای زیادی یاد گرفت."),
                    StoryParagraph("She became a skilled and educated young woman.", "او زن جوانی ماهر و تحصیل‌کرده شد."),
                    StoryParagraph("Then she decided to leave Lowood.", "بعد تصمیم گرفت لووود را ترک کند."),
                    StoryParagraph("She wanted to see the world.", "می‌خواست دنیا را ببیند."),
                    StoryParagraph("She put an advertisement in the newspaper.", "او آگهی‌ای در روزنامه گذاشت.")
                )
            ),
            StoryChapter(
                number = 3, title = "Thornfield Hall", titlePersian = "عشق آقای روچستر",
                paragraphs = listOf(
                    StoryParagraph("A reply came from Thornfield Hall.", "جوابی از تالار تورنفیلد آمد."),
                    StoryParagraph("Jane was hired as a governess.", "جین به عنوان معلم خانه استخدام شد."),
                    StoryParagraph("She would teach a young French girl named Adèle.", "او دختر کوچک فرانسوی به نام آدل را آموزش می‌داد."),
                    StoryParagraph("Thornfield was a large, old mansion.", "تورنفیلد عمارتی بزرگ و قدیمی بود."),
                    StoryParagraph("The housekeeper, Mrs. Fairfax, welcomed her.", "خانه‌دار، خانم فیرفکس، از او استقبال کرد."),
                    StoryParagraph("Mrs. Fairfax was kind and pleasant.", "خانم فیرفکس مهربان و خوش‌برخورد بود."),
                    StoryParagraph("The owner was rarely at home.", "صاحب خانه به‌ندرت خانه بود."),
                    StoryParagraph("His name was Mr. Rochester.", "اسمش آقای روچستر بود."),
                    StoryParagraph("One winter evening, Jane went for a walk.", "یک عصر زمستانی، جین برای قدم زدن رفت."),
                    StoryParagraph("A man on horseback fell on the icy road.", "مردی سوار بر اسب در جاده یخ‌زده افتاد."),
                    StoryParagraph("Jane helped him back onto his horse.", "جین کمکش کرد دوباره سوار اسب شود."),
                    StoryParagraph("She did not know it was Mr. Rochester.", "نمی‌دانست آقای روچستر است."),
                    StoryParagraph("Later, she met him at the house.", "بعد، او را در خانه ملاقات کرد."),
                    StoryParagraph("He was a strange and moody man.", "او مردی عجیب و بداخلاق بود."),
                    StoryParagraph("He asked her many questions.", "سوالات زیادی از او پرسید."),
                    StoryParagraph("Jane answered honestly and bravely.", "جین صادقانه و شجاعانه جواب داد."),
                    StoryParagraph("He was impressed by her character.", "او از شخصیتش تحت تأثیر قرار گرفت."),
                    StoryParagraph("They began to talk every evening.", "آن‌ها هر عصر شروع کردند به صحبت کردن."),
                    StoryParagraph("Jane started to fall in love.", "جین شروع کرد به عاشق شدن."),
                    StoryParagraph("But she did not know his secrets.", "اما رازهایش را نمی‌دانست.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Secret of Thornfield", titlePersian = "راز عمارت",
                paragraphs = listOf(
                    StoryParagraph("Strange things happened at Thornfield.", "چیزهای عجیبی در تورنفیلد اتفاق می‌افتاد."),
                    StoryParagraph("Jane heard a strange laugh at night.", "جین شب‌ها صدای خنده عجیبی می‌شنید."),
                    StoryParagraph("One night, a fire started in Rochester's room.", "یک شب، آتشی در اتاق روچستر شروع شد."),
                    StoryParagraph("Jane woke up and saved him.", "جین بیدار شد و نجاتش داد."),
                    StoryParagraph("He was very grateful.", "او خیلی سپاسگزار بود."),
                    StoryParagraph("A beautiful woman named Blanche Ingram came to visit.", "زنی زیبا به نام بلانش اینگرام به دیدنشان آمد."),
                    StoryParagraph("Everyone thought Rochester would marry her.", "همه فکر می‌کردند روچستر با او ازدواج می‌کند."),
                    StoryParagraph("Jane was jealous but said nothing.", "جین حسادت کرد اما چیزی نگفت."),
                    StoryParagraph("Then a stranger arrived named Mr. Mason.", "بعد غریبه‌ای به نام آقای میسون رسید."),
                    StoryParagraph("He came from Jamaica.", "او از جامائیکا آمده بود."),
                    StoryParagraph("That night, a terrible scream was heard.", "آن شب، جیغ وحشتناکی شنیده شد."),
                    StoryParagraph("Mr. Mason had been attacked.", "آقای میسون مورد حمله قرار گرفته بود."),
                    StoryParagraph("Rochester asked Jane to keep it secret.", "روچستر از جین خواست مخفی نگه دارد."),
                    StoryParagraph("She agreed without asking questions.", "او بدون پرسیدن سوال موافقت کرد."),
                    StoryParagraph("Rochester went to Jamaica for a while.", "روچستر مدتی به جامائیکا رفت."),
                    StoryParagraph("When he returned, he asked Jane to marry him.", "وقتی برگشت، از جین خواست با او ازدواج کند."),
                    StoryParagraph("Jane could not believe it.", "جین نمی‌توانست باورش کند."),
                    StoryParagraph("She thought he loved Blanche.", "او فکر می‌کرد بلانش را دوست دارد."),
                    StoryParagraph("But he said he loved only her.", "اما گفت فقط او را دوست دارد."),
                    StoryParagraph("Jane accepted with all her heart.", "جین با تمام قلبش قبول کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Truth and the Return", titlePersian = "بازگشت به عشق",
                paragraphs = listOf(
                    StoryParagraph("The wedding day arrived.", "روز عروسی رسید."),
                    StoryParagraph("But at the church, a man stood up.", "اما در کلیسا، مردی بلند شد."),
                    StoryParagraph("He said the wedding could not happen.", "او گفت عروسی نمی‌تواند برگزار شود."),
                    StoryParagraph("Rochester was already married.", "روچستر قبلاً ازدواج کرده بود."),
                    StoryParagraph("His wife was Bertha Mason, Mr. Mason's sister.", "همسرش برتا میسون، خواهر آقای میسون بود."),
                    StoryParagraph("She was insane and dangerous.", "او دیوانه و خطرناک بود."),
                    StoryParagraph("She was kept in a room on the third floor.", "او در اتاقی در طبقه سوم نگه داشته می‌شد."),
                    StoryParagraph("She was the source of the strange laugh.", "او منبع خنده‌های عجیب بود."),
                    StoryParagraph("Jane was heartbroken.", "جین دلشکسته شد."),
                    StoryParagraph("She could not marry a married man.", "او نمی‌توانست با مرد متأهلی ازدواج کند."),
                    StoryParagraph("She refused to stay with Rochester.", "او از ماندن با روچستر امتناع کرد."),
                    StoryParagraph("That night, she left Thornfield.", "آن شب، تورنفیلد را ترک کرد."),
                    StoryParagraph("She wandered for days without food or money.", "روزها بدون غذا و پول سرگردان بود."),
                    StoryParagraph("A family named Rivers took her in.", "خانواده‌ای به نام ریورز پناهش داد."),
                    StoryParagraph("She became a teacher in their village.", "او در دهکده‌شان معلم شد."),
                    StoryParagraph("She inherited money from an uncle.", "او از عمویش پول به ارث برد."),
                    StoryParagraph("She learned the Rivers were her cousins.", "او فهمید ریورزها پسرعموهایش هستند."),
                    StoryParagraph("St. John Rivers asked her to marry him.", "سنت جان ریورز از او خواست با او ازدواج کند."),
                    StoryParagraph("But she did not love him.", "اما او دوستش نداشت."),
                    StoryParagraph("Then she heard Rochester's voice calling her.", "بعد صدای روچستر را شنید که صدایش می‌زد.")
                )
            )
        )
    )
}