package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۵ — داستان‌های ادگار آلن پو و ترسناک
 *  ۱۳. بشکه آمونتیلادو
 *  ۱۴. نقاب مرگ سرخ
 *  ۱۵. تسخیر خانه هیل
 */
object Group5 {

    fun getAll(): List<StoryContent> = listOf(
        story13(),
        story14(),
        story15(),
    )

    // ─────────────── ۱۳: بشکه آمونتیلادو ───────────────
    private fun story13() = StoryContent(
        storyId = "int_cask_amontillado",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "An Old Insult", titlePersian = "توهین قدیمی",
                paragraphs = listOf(
                    StoryParagraph("My name is Montresor.", "اسم من مونترسور است."),
                    StoryParagraph("I have kept a secret for fifty years.", "من پنجاه سال یک راز را نگه داشته‌ام."),
                    StoryParagraph("Now I will tell the story.", "حالا داستان را تعریف می‌کنم."),
                    StoryParagraph("I had a friend named Fortunato.", "دوستی داشتم به نام فورچوناتو."),
                    StoryParagraph("He was a rich and respected man.", "او مردی ثروتمند و محترم بود."),
                    StoryParagraph("But he had hurt me many times.", "اما او بارها به من آسیب رسانده بود."),
                    StoryParagraph("He had insulted me in public.", "او در جمع توهینم کرده بود."),
                    StoryParagraph("I wanted revenge.", "من انتقام می‌خواستم."),
                    StoryParagraph("But I did not want to be caught.", "اما نمی‌خواستم دستگیر شوم."),
                    StoryParagraph("So I waited patiently.", "پس با صبر منتظر ماندم."),
                    StoryParagraph("I smiled at him and acted friendly.", "به او لبخند می‌زدم و دوستانه رفتار می‌کردم."),
                    StoryParagraph("He did not know my true feelings.", "او احساسات واقعی من را نمی‌دانست."),
                    StoryParagraph("One evening, I met him at a carnival.", "یک عصر، او را در کارناوال دیدم."),
                    StoryParagraph("He was very drunk and happy.", "او خیلی مست و خوشحال بود."),
                    StoryParagraph("He was wearing a jester's costume.", "او لباس دلقک پوشیده بود."),
                    StoryParagraph("I told him I had bought a rare wine.", "به او گفتم شراب کمیابی خریده‌ام."),
                    StoryParagraph("The wine was called Amontillado.", "اسم شراب آمونتیلادو بود."),
                    StoryParagraph("I said I was not sure it was real.", "گفتم مطمئن نیستم اصل باشد."),
                    StoryParagraph("I said I needed his opinion.", "گفتم به نظر او نیاز دارم."),
                    StoryParagraph("He wanted to see it immediately.", "او می‌خواست فوراً ببیندش.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Underground", titlePersian = "انتقام‌جویی",
                paragraphs = listOf(
                    StoryParagraph("I took Fortunato to my house.", "فورچوناتو را به خانه‌ام بردم."),
                    StoryParagraph("My servants were not at home.", "خدمتکارانم خانه نبودند."),
                    StoryParagraph("I had told them to leave.", "به آن‌ها گفته بودم بروند."),
                    StoryParagraph("We entered the wine cellar.", "ما وارد زیرزمین شراب شدیم."),
                    StoryParagraph("It was dark and cold.", "تاریک و سرد بود."),
                    StoryParagraph("There were many bottles of wine.", "بطری‌های زیادی شراب بود."),
                    StoryParagraph("We walked down a long passage.", "در راهرویی طولانی راه رفتیم."),
                    StoryParagraph("The walls were covered with moss.", "دیوارها با خزه پوشیده شده بودند."),
                    StoryParagraph("The air was very cold and wet.", "هوا خیلی سرد و مرطوب بود."),
                    StoryParagraph("Fortunato started to cough.", "فورچوناتو شروع کرد به سرفه کردن."),
                    StoryParagraph("I asked him if he wanted to go back.", "از او پرسیدم آیا می‌خواهد برگردد."),
                    StoryParagraph("But he said he was fine.", "اما گفت حالش خوب است."),
                    StoryParagraph("He wanted to taste the wine.", "او می‌خواست شراب را بچشد."),
                    StoryParagraph("We walked deeper and deeper.", "عمیق‌تر و عمیق‌تر رفتیم."),
                    StoryParagraph("The bones of our ancestors were there.", "استخوان‌های اجدادمان آنجا بودند."),
                    StoryParagraph("The skulls were piled along the walls.", "جمجمه‌ها در کنار دیوارها روی هم چیده شده بودند."),
                    StoryParagraph("Fortunato made jokes about the bones.", "فورچوناتو درباره استخوان‌ها شوخی می‌کرد."),
                    StoryParagraph("I gave him more wine to drink.", "شراب بیشتری به او دادم بنوشد."),
                    StoryParagraph("He got drunker and drunker.", "او مست‌تر و مست‌تر شد."),
                    StoryParagraph("Finally, we reached a small niche.", "بالاخره، به یک حفره کوچک رسیدیم.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Stone Wall", titlePersian = "شراب کمیاب",
                paragraphs = listOf(
                    StoryParagraph("I told him the wine was inside the niche.", "به او گفتم شراب داخل حفره است."),
                    StoryParagraph("He went inside to look.", "او داخل رفت تا نگاه کند."),
                    StoryParagraph("I quickly chained him to the wall.", "سریع او را به دیوار زنجیر کردم."),
                    StoryParagraph("There were old chains there.", "زنجیرهای قدیمی آنجا بودند."),
                    StoryParagraph("He was too surprised to move.", "او خیلی متعجب بود که حرکت کند."),
                    StoryParagraph("He asked me what I was doing.", "از من پرسید چه کار می‌کنم."),
                    StoryParagraph("I did not answer him.", "به او جواب ندادم."),
                    StoryParagraph("I picked up a stone and a trowel.", "سنگی و ماله‌ای برداشتم."),
                    StoryParagraph("I had hidden them there before.", "قبلاً آن‌ها را آنجا پنهان کرده بودم."),
                    StoryParagraph("I started to build a wall.", "شروع کردم به ساختن دیوار."),
                    StoryParagraph("Fortunato screamed loudly.", "فورچوناتو با صدای بلند جیغ زد."),
                    StoryParagraph("But no one could hear him.", "اما هیچ‌کس نمی‌توانست بشنود."),
                    StoryParagraph("The house was empty.", "خانه خالی بود."),
                    StoryParagraph("I worked quickly and carefully.", "سریع و با دقت کار کردم."),
                    StoryParagraph("I put one stone on top of another.", "سنگی را روی سنگ دیگر گذاشتم."),
                    StoryParagraph("Fortunato shouted and begged.", "فورچوناتو فریاد زد و التماس کرد."),
                    StoryParagraph("He said it was a joke.", "او گفت شوخی است."),
                    StoryParagraph("I said nothing.", "من چیزی نگفتم."),
                    StoryParagraph("The wall grew higher and higher.", "دیوار بلندتر و بلندتر شد."),
                    StoryParagraph("Soon I could not see his face.", "به‌زودی نتوانستم صورتش را ببینم.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Final Stone", titlePersian = "زیرزمین تاریک",
                paragraphs = listOf(
                    StoryParagraph("I heard Fortunato laughing.", "شنیدم فورچوناتو می‌خندد."),
                    StoryParagraph("He thought I was playing a trick.", "او فکر می‌کرد من ترفندی بازی می‌کنم."),
                    StoryParagraph("But then he started to scream.", "اما بعد شروع کرد به جیغ زدن."),
                    StoryParagraph("He screamed for help.", "او برای کمک جیغ زد."),
                    StoryParagraph("No one came.", "هیچ‌کس نیامد."),
                    StoryParagraph("The darkness swallowed his voice.", "تاریکی صدایش را بلعید."),
                    StoryParagraph("I continued building the wall.", "به ساختن دیوار ادامه دادم."),
                    StoryParagraph("My hands were steady.", "دست‌هایم محکم بودند."),
                    StoryParagraph("I felt no guilt.", "احساس گناه نمی‌کردم."),
                    StoryParagraph("I felt only satisfaction.", "فقط رضایت حس می‌کردم."),
                    StoryParagraph("Fortunato made one last scream.", "فورچوناتو یک جیغ آخر کشید."),
                    StoryParagraph("Then everything became quiet.", "بعد همه چیز ساکت شد."),
                    StoryParagraph("I finished the wall.", "دیوار را تمام کردم."),
                    StoryParagraph("The last stone was placed.", "آخرین سنگ گذاشته شد."),
                    StoryParagraph("No one could tell there was a wall there.", "هیچ‌کس نمی‌توانست بگوید دیواری آنجا هست."),
                    StoryParagraph("I stepped back and looked at my work.", "عقب رفتم و به کارم نگاه کردم."),
                    StoryParagraph("The wall looked old.", "دیوار قدیمی به نظر می‌رسید."),
                    StoryParagraph("Just like the other walls.", "دقیقاً مثل دیگر دیوارها."),
                    StoryParagraph("Fortunato was buried alive.", "فورچوناتو زنده به گور شد."),
                    StoryParagraph("And no one ever found him.", "و هیچ‌کس هرگز او را پیدا نکرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End of Revenge", titlePersian = "پایان آتش",
                paragraphs = listOf(
                    StoryParagraph("I put the trowel back in its place.", "ماله را به جایش برگرداندم."),
                    StoryParagraph("I walked back up the stairs slowly.", "آرام از پله‌ها بالا رفتم."),
                    StoryParagraph("I went to my bedroom.", "به اتاق خوابم رفتم."),
                    StoryParagraph("I slept well that night.", "آن شب خوب خوابیدم."),
                    StoryParagraph("I was not afraid.", "نمی‌ترسیدم."),
                    StoryParagraph("I had waited fifty years to tell this story.", "پنجاه سال منتظر مانده بودم تا این داستان را تعریف کنم."),
                    StoryParagraph("Fortunato had insulted me many times.", "فورچوناتو بارها به من توهین کرده بود."),
                    StoryParagraph("I did not say what the insult was.", "نگفتم توهین چه بود."),
                    StoryParagraph("It does not matter now.", "حالا مهم نیست."),
                    StoryParagraph("He was punished.", "او مجازات شد."),
                    StoryParagraph("I was never caught.", "من هرگز دستگیر نشدم."),
                    StoryParagraph("I lived a long and peaceful life.", "من زندگی طولانی و آرامی داشتم."),
                    StoryParagraph("But I never forgot that night.", "اما هرگز آن شب را فراموش نکردم."),
                    StoryParagraph("The sound of his screams stayed with me.", "صدای جیغ‌هایش با من ماند."),
                    StoryParagraph("But I did not feel sorry.", "اما احساس پشیمانی نکردم."),
                    StoryParagraph("He deserved it.", "او لایقش بود."),
                    StoryParagraph("My family motto was No one insults me.", "شعار خانواده‌ام این بود: هیچ‌کس به من توهین نمی‌کند."),
                    StoryParagraph("I followed that motto.", "من از آن شعار پیروی کردم."),
                    StoryParagraph("And I do not regret it.", "و پشیمان نیستم."),
                    StoryParagraph("Rest in peace, Fortunato.", "در آرامش بخواب، فورچوناتو.")
                )
            )
        )
    )

    // ─────────────── ۱۴: نقاب مرگ سرخ ───────────────
    private fun story14() = StoryContent(
        storyId = "int_masque_red_death",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Red Death", titlePersian = "طاعون سرخ",
                paragraphs = listOf(
                    StoryParagraph("A terrible disease had come to the land.", "بیماری وحشتناکی به سرزمین آمده بود."),
                    StoryParagraph("It was called the Red Death.", "اسمش مرگ سرخ بود."),
                    StoryParagraph("People who got sick had red blood everywhere.", "کسانی که مریض می‌شدند همه‌جا خون سرخ داشتند."),
                    StoryParagraph("First, they felt pain.", "اول، درد حس می‌کردند."),
                    StoryParagraph("Then they started to bleed.", "بعد شروع به خون‌ریزی می‌کردند."),
                    StoryParagraph("They died within half an hour.", "آن‌ها در عرض نیم ساعت می‌مردند."),
                    StoryParagraph("The disease spread very fast.", "بیماری خیلی سریع پخش می‌شد."),
                    StoryParagraph("Half the people in the kingdom died.", "نیمی از مردم پادشاهی مردند."),
                    StoryParagraph("Everyone was afraid.", "همه ترسیده بودند."),
                    StoryParagraph("But Prince Prospero was not afraid.", "اما شاهزاده پراسپرو نمی‌ترسید."),
                    StoryParagraph("He was a rich and powerful man.", "او مردی ثروتمند و قدرتمند بود."),
                    StoryParagraph("He decided to hide from the disease.", "او تصمیم گرفت از بیماری پنهان شود."),
                    StoryParagraph("He invited a thousand friends to his castle.", "او هزار دوست را به قلعه‌اش دعوت کرد."),
                    StoryParagraph("They were all young and happy.", "همه‌شان جوان و خوشحال بودند."),
                    StoryParagraph("The castle had strong walls and doors.", "قلعه دیوارها و درهای محکمی داشت."),
                    StoryParagraph("The gates were locked with iron.", "دروازه‌ها با آهن قفل شده بودند."),
                    StoryParagraph("No one could come in or out.", "هیچ‌کس نمی‌توانست وارد یا خارج شود."),
                    StoryParagraph("The prince promised them a party.", "شاهزاده به آن‌ها یک مهمانی وعده داد."),
                    StoryParagraph("A party that no one would forget.", "مهمانی‌ای که هیچ‌کس فراموش نمی‌کرد."),
                    StoryParagraph("And so they waited inside.", "و اینگونه آن‌ها داخل منتظر ماندند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Locked Castle", titlePersian = "قلعه امن",
                paragraphs = listOf(
                    StoryParagraph("Inside the castle, everyone was happy.", "داخل قلعه، همه خوشحال بودند."),
                    StoryParagraph("There was music and dancing every night.", "هر شب موسیقی و رقص بود."),
                    StoryParagraph("There was food and wine.", "غذا و شراب بود."),
                    StoryParagraph("There were jesters and acrobats.", "دلقک‌ها و بندبازها بودند."),
                    StoryParagraph("There were dancers and singers.", "رقاصان و خوانندگان بودند."),
                    StoryParagraph("The castle was full of life.", "قلعه پر از زندگی بود."),
                    StoryParagraph("The prince had brought everything inside.", "شاهزاده همه چیز را داخل آورده بود."),
                    StoryParagraph("Beauty, wine, and happiness.", "زیبایی، شراب و خوشحالی."),
                    StoryParagraph("But outside, the disease was everywhere.", "اما بیرون، بیماری همه‌جا بود."),
                    StoryParagraph("People were dying by the thousands.", "مردم هزاران‌هزار می‌مردند."),
                    StoryParagraph("The prince laughed at them.", "شاهزاده به آن‌ها می‌خندید."),
                    StoryParagraph("He said he was safe inside.", "او می‌گفت داخل امن است."),
                    StoryParagraph("Five months passed this way.", "پنج ماه اینگونه گذشت."),
                    StoryParagraph("The prince decided to hold a great party.", "شاهزاده تصمیم گرفت یک مهمانی بزرگ برگزار کند."),
                    StoryParagraph("It would be a masquerade ball.", "یک بالماسکه بود."),
                    StoryParagraph("Everyone would wear a costume and mask.", "همه لباس و ماسک می‌پوشیدند."),
                    StoryParagraph("The ball would be in seven rooms.", "مهمانی در هفت اتاق بود."),
                    StoryParagraph("Each room had a different color.", "هر اتاق رنگ متفاوتی داشت."),
                    StoryParagraph("Blue, purple, green, orange, white, and violet.", "آبی، بنفش، سبز، نارنجی، سفید و یاسی."),
                    StoryParagraph("The seventh room was black.", "اتاق هفتم سیاه بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Masquerade", titlePersian = "مهمانی بالماسکه",
                paragraphs = listOf(
                    StoryParagraph("The seventh room was very strange.", "اتاق هفتم خیلی عجیب بود."),
                    StoryParagraph("The walls were black.", "دیوارها سیاه بودند."),
                    StoryParagraph("But the windows were red.", "اما پنجره‌ها سرخ بودند."),
                    StoryParagraph("The red light came through the windows.", "نور سرخ از پنجره‌ها می‌آمد."),
                    StoryParagraph("It looked like blood.", "شبیه خون به نظر می‌رسید."),
                    StoryParagraph("Everyone was afraid of that room.", "همه از آن اتاق می‌ترسیدند."),
                    StoryParagraph("No one went inside it.", "هیچ‌کس داخلش نمی‌رفت."),
                    StoryParagraph("In that room was a large clock.", "در آن اتاق یک ساعت بزرگ بود."),
                    StoryParagraph("The clock made a loud sound every hour.", "ساعت هر ساعت صدای بلندی می‌کرد."),
                    StoryParagraph("When it rang, everyone stopped.", "وقتی زنگ می‌زد، همه متوقف می‌شدند."),
                    StoryParagraph("Musicians stopped playing.", "نوازندگان از نواختن دست می‌کشیدند."),
                    StoryParagraph("Dancers stopped dancing.", "رقاصان از رقصیدن دست می‌کشیدند."),
                    StoryParagraph("For a moment, there was silence.", "برای لحظه‌ای سکوت بود."),
                    StoryParagraph("Then everyone started again.", "بعد همه دوباره شروع می‌کردند."),
                    StoryParagraph("The night of the party arrived.", "شب مهمانی رسید."),
                    StoryParagraph("The palace was bright with candles.", "قصر با شمع‌ها روشن بود."),
                    StoryParagraph("Everyone wore strange and beautiful costumes.", "همه لباس‌های عجیب و زیبا پوشیده بودند."),
                    StoryParagraph("There were animals and ghosts.", "حیوانات و ارواح بودند."),
                    StoryParagraph("There were kings and witches.", "پادشاهان و جادوگران بودند."),
                    StoryParagraph("The party was a great success.", "مهمانی موفقیت بزرگی بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Uninvited Guest", titlePersian = "ورود ناخوانده",
                paragraphs = listOf(
                    StoryParagraph("At midnight, a new guest arrived.", "در نیمه‌شب، مهمان جدیدی رسید."),
                    StoryParagraph("No one had seen him before.", "هیچ‌کس قبلاً او را ندیده بود."),
                    StoryParagraph("He was tall and thin.", "او بلندقد و لاغر بود."),
                    StoryParagraph("He wore a dark costume.", "لباس تیره‌ای پوشیده بود."),
                    StoryParagraph("His mask looked like a dead face.", "ماسکش شبیه صورت مرده بود."),
                    StoryParagraph("The mask was red with blood.", "ماسک با خون سرخ بود."),
                    StoryParagraph("Everyone was afraid of him.", "همه از او ترسیدند."),
                    StoryParagraph("The prince was very angry.", "شاهزاده خیلی عصبانی شد."),
                    StoryParagraph("Who dared to come like this?", "چه کسی جسارت کرده بود اینگونه بیاید؟"),
                    StoryParagraph("He asked his servants to catch him.", "او از خدمتکارانش خواست بگیرندش."),
                    StoryParagraph("But no one wanted to touch the stranger.", "اما هیچ‌کس نمی‌خواست غریبه را لمس کند."),
                    StoryParagraph("The prince grabbed his sword.", "شاهزاده شمشیرش را گرفت."),
                    StoryParagraph("He ran after the stranger.", "او دنبال غریبه دوید."),
                    StoryParagraph("The stranger walked slowly.", "غریبه آرام راه می‌رفت."),
                    StoryParagraph("He passed through every room.", "او از هر اتاقی گذشت."),
                    StoryParagraph("The prince followed him.", "شاهزاده دنبالش کرد."),
                    StoryParagraph("They went through blue, purple, green.", "آن‌ها از آبی، بنفش، سبز گذشتند."),
                    StoryParagraph("Through orange, white, and violet.", "از نارنجی، سفید و یاسی."),
                    StoryParagraph("Finally, they reached the black room.", "بالاخره، به اتاق سیاه رسیدند."),
                    StoryParagraph("The stranger stopped there.", "غریبه آنجا ایستاد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Death Comes for All", titlePersian = "مرگ همه",
                paragraphs = listOf(
                    StoryParagraph("The prince raised his sword.", "شاهزاده شمشیرش را بالا برد."),
                    StoryParagraph("He was ready to kill the stranger.", "او آماده بود غریبه را بکشد."),
                    StoryParagraph("But suddenly, he stopped.", "اما ناگهان، ایستاد."),
                    StoryParagraph("A strange feeling came over him.", "احساس عجیبی به او دست داد."),
                    StoryParagraph("He started to shake.", "شروع کرد به لرزیدن."),
                    StoryParagraph("He fell to the ground and died.", "او روی زمین افتاد و مرد."),
                    StoryParagraph("The guests ran to help him.", "مهمانان دویدند کمکش کنند."),
                    StoryParagraph("But they also started to fall.", "اما آن‌ها هم شروع کردند به افتادن."),
                    StoryParagraph("One by one, they dropped dead.", "یکی‌یکی، مرده افتادند."),
                    StoryParagraph("The red death had entered the castle.", "مرگ سرخ وارد قلعه شده بود."),
                    StoryParagraph("It had come as the strange guest.", "به شکل مهمان عجیب آمده بود."),
                    StoryParagraph("No wall could stop it.", "هیچ دیواری نمی‌توانست جلویش را بگیرد."),
                    StoryParagraph("No lock could keep it out.", "هیچ قفلی نمی‌توانست بیرون نگهش دارد."),
                    StoryParagraph("Everyone died that night.", "همه آن شب مردند."),
                    StoryParagraph("The thousand guests, the servants, the prince.", "هزار مهمان، خدمتکاران، شاهزاده."),
                    StoryParagraph("The candles went out one by one.", "شمع‌ها یکی‌یکی خاموش شدند."),
                    StoryParagraph("The music stopped.", "موسیقی متوقف شد."),
                    StoryParagraph("The castle became dark and silent.", "قلعه تاریک و ساکت شد."),
                    StoryParagraph("And the red death ruled over all.", "و مرگ سرخ بر همه حکومت کرد."),
                    StoryParagraph("No one can escape death.", "هیچ‌کس نمی‌تواند از مرگ فرار کند.")
                )
            )
        )
    )

    // ─────────────── ۱۵: تسخیر خانه هیل ───────────────
    private fun story15() = StoryContent(
        storyId = "int_haunting_hill",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Invitation", titlePersian = "دعوت به خانه",
                paragraphs = listOf(
                    StoryParagraph("Dr. Montague was a scientist.", "دکتر مونتاگ دانشمند بود."),
                    StoryParagraph("He was interested in ghosts.", "او به ارواح علاقه‌مند بود."),
                    StoryParagraph("He had studied them for many years.", "سال‌ها آن‌ها را مطالعه کرده بود."),
                    StoryParagraph("He heard about a haunted house.", "او درباره خانه‌ای تسخیرشده شنید."),
                    StoryParagraph("The house was called Hill House.", "اسم خانه، خانه هیل بود."),
                    StoryParagraph("It was old and very large.", "قدیمی و خیلی بزرگ بود."),
                    StoryParagraph("No one had lived there for years.", "سال‌ها هیچ‌کس آنجا زندگی نکرده بود."),
                    StoryParagraph("Strange things happened there.", "چیزهای عجیبی آنجا اتفاق می‌افتاد."),
                    StoryParagraph("Doors closed by themselves.", "درها خودشان بسته می‌شدند."),
                    StoryParagraph("Voices were heard at night.", "شب‌ها صداهایی شنیده می‌شد."),
                    StoryParagraph("Dr. Montague decided to investigate.", "دکتر مونتاگ تصمیم گرفت تحقیق کند."),
                    StoryParagraph("He invited some people to help him.", "او چند نفر را برای کمک دعوت کرد."),
                    StoryParagraph("The first was Eleanor Vance.", "اولی النور ونس بود."),
                    StoryParagraph("She was a lonely young woman.", "او زن جوان تنهایی بود."),
                    StoryParagraph("She had taken care of her mother for years.", "سال‌ها از مادرش مراقبت کرده بود."),
                    StoryParagraph("Now her mother was dead.", "حالا مادرش مرده بود."),
                    StoryParagraph("She had no friends and no home.", "دوستان و خانه‌ای نداشت."),
                    StoryParagraph("She was happy to be invited.", "او از دعوت شدن خوشحال بود."),
                    StoryParagraph("She saw it as a new beginning.", "او آن را شروعی جدید می‌دید."),
                    StoryParagraph("She did not know what waited for her.", "نمی‌دانست چه چیزی در انتظارش است.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Research Group", titlePersian = "گروه تحقیقاتی",
                paragraphs = listOf(
                    StoryParagraph("Eleanor arrived at Hill House.", "النور به خانه هیل رسید."),
                    StoryParagraph("The house was huge and dark.", "خانه بزرگ و تاریک بود."),
                    StoryParagraph("The housekeeper showed her inside.", "خانه‌دار او را داخل برد."),
                    StoryParagraph("She met the other guests.", "او دیگر مهمانان را ملاقات کرد."),
                    StoryParagraph("There was a woman named Theodora.", "زنی به نام تئودورا بود."),
                    StoryParagraph("Theodora was lively and clever.", "تئودورا سرزنده و باهوش بود."),
                    StoryParagraph("There was a young man named Luke.", "مرد جوانی به نام لوک بود."),
                    StoryParagraph("Luke would inherit the house one day.", "لوک روزی وارث خانه می‌شد."),
                    StoryParagraph("And there was Dr. Montague himself.", "و خود دکتر مونتاگ بود."),
                    StoryParagraph("His wife would come later.", "همسرش بعداً می‌آمد."),
                    StoryParagraph("Dr. Montague explained his plan.", "دکتر مونتاگ نقشه‌اش را توضیح داد."),
                    StoryParagraph("They would stay in the house for weeks.", "هفته‌ها در خانه می‌ماندند."),
                    StoryParagraph("They would write down everything strange.", "هر چیز عجیبی را یادداشت می‌کردند."),
                    StoryParagraph("They would try to understand the ghosts.", "تلاش می‌کردند ارواح را بفهمند."),
                    StoryParagraph("The housekeeper warned them.", "خانه‌دار هشدارشان داد."),
                    StoryParagraph("She said the house was not normal.", "او گفت خانه عادی نیست."),
                    StoryParagraph("She said no one should stay alone.", "او گفت هیچ‌کس نباید تنها بماند."),
                    StoryParagraph("They laughed at her fears.", "آن‌ها به ترس‌هایش خندیدند."),
                    StoryParagraph("They were educated and modern.", "آن‌ها تحصیل‌کرده و مدرن بودند."),
                    StoryParagraph("They did not believe in ghosts.", "آن‌ها به ارواح اعتقاد نداشتند.")
                )
            ),
            StoryChapter(
                number = 3, title = "Strange Sounds", titlePersian = "صدای عجیب",
                paragraphs = listOf(
                    StoryParagraph("On the first night, Eleanor heard a noise.", "شب اول، النور صدایی شنید."),
                    StoryParagraph("It was a loud knock.", "صدای ضربه بلندی بود."),
                    StoryParagraph("But no one was there.", "اما هیچ‌کس آنجا نبود."),
                    StoryParagraph("She thought it was the wind.", "او فکر کرد باد است."),
                    StoryParagraph("The next night, it happened again.", "شب بعد، دوباره اتفاق افتاد."),
                    StoryParagraph("This time, it was louder.", "این بار، بلندتر بود."),
                    StoryParagraph("She told the others.", "او به دیگران گفت."),
                    StoryParagraph("They had heard it too.", "آن‌ها هم شنیده بودند."),
                    StoryParagraph("Dr. Montague was very interested.", "دکتر مونتاگ خیلی علاقه‌مند شد."),
                    StoryParagraph("He wrote everything down.", "او همه چیز را یادداشت کرد."),
                    StoryParagraph("A few nights later, they heard a voice.", "چند شب بعد، صدایی شنیدند."),
                    StoryParagraph("It was a child's voice.", "صدای کودکی بود."),
                    StoryParagraph("It laughed quietly.", "آرام می‌خندید."),
                    StoryParagraph("The voice seemed to come from inside Eleanor.", "صدا به نظر از داخل النور می‌آمد."),
                    StoryParagraph("Or from the walls around her.", "یا از دیوارهای اطرافش."),
                    StoryParagraph("Eleanor started to feel strange.", "النور شروع کرد به احساس عجیبی کردن."),
                    StoryParagraph("She felt the house was calling her.", "او حس کرد خانه صدایش می‌زند."),
                    StoryParagraph("She felt she belonged there.", "او حس کرد به آنجا تعلق دارد."),
                    StoryParagraph("She didn't want to leave.", "نمی‌خواست ترک کند."),
                    StoryParagraph("The house was slowly claiming her.", "خانه آرام‌آرام او را تصاحب می‌کرد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Growing Madness", titlePersian = "جنون تدریجی",
                paragraphs = listOf(
                    StoryParagraph("Each day, the strange events got worse.", "هر روز، اتفاقات عجیب بدتر می‌شد."),
                    StoryParagraph("Walls started to move.", "دیوارها شروع به حرکت کردند."),
                    StoryParagraph("Doors closed by themselves.", "درها خودشان بسته شدند."),
                    StoryParagraph("Words appeared on the walls.", "کلماتی روی دیوارها ظاهر شد."),
                    StoryParagraph("The words said: Help Eleanor come home.", "کلمات می‌گفتند: به النور کمک کنید به خانه بیاید."),
                    StoryParagraph("Eleanor was both scared and happy.", "النور هم ترسیده و هم خوشحال بود."),
                    StoryParagraph("She felt chosen by the house.", "او حس کرد خانه انتخابش کرده."),
                    StoryParagraph("Theodora started to hate her.", "تئودورا شروع کرد به نفرت از او."),
                    StoryParagraph("Luke was afraid of her.", "لوک از او می‌ترسید."),
                    StoryParagraph("Dr. Montague tried to understand.", "دکتر مونتاگ تلاش کرد بفهمد."),
                    StoryParagraph("His wife arrived with a friend.", "همسرش با دوستی رسید."),
                    StoryParagraph("The friend was a fake psychic.", "دوستش یک واسطه روحی قلابی بود."),
                    StoryParagraph("He tried to talk to the ghosts.", "او تلاش کرد با ارواح صحبت کند."),
                    StoryParagraph("But the house was too strong.", "اما خانه خیلی قوی بود."),
                    StoryParagraph("The ghosts ignored him.", "ارواح نادیده‌اش گرفتند."),
                    StoryParagraph("One night, Eleanor saw a vision.", "یک شب، النور یک رؤیا دید."),
                    StoryParagraph("She saw her mother in the house.", "او مادرش را در خانه دید."),
                    StoryParagraph("Her mother was calling her.", "مادرش صدایش می‌زد."),
                    StoryParagraph("Eleanor walked toward the voice.", "النور به سمت صدا رفت."),
                    StoryParagraph("She was losing her mind.", "او داشت عقلش را از دست می‌داد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Escape from the House", titlePersian = "فرار از خانه",
                paragraphs = listOf(
                    StoryParagraph("Dr. Montague saw the danger.", "دکتر مونتاگ خطر را دید."),
                    StoryParagraph("He told everyone to leave.", "او به همه گفت بروند."),
                    StoryParagraph("They packed their things quickly.", "سریع وسایلشان را بستند."),
                    StoryParagraph("But Eleanor did not want to go.", "اما النور نمی‌خواست برود."),
                    StoryParagraph("The house was her home now.", "خانه حالا خانه‌اش بود."),
                    StoryParagraph("She ran away from the others.", "او از دیگران فرار کرد."),
                    StoryParagraph("She went to the top of the stairs.", "او به بالای پله‌ها رفت."),
                    StoryParagraph("The others followed her.", "دیگران دنبالش رفتند."),
                    StoryParagraph("Theodora called her name.", "تئودورا اسمش را صدا زد."),
                    StoryParagraph("Eleanor did not answer.", "النور جواب نداد."),
                    StoryParagraph("She climbed onto the railing.", "او روی نرده رفت."),
                    StoryParagraph("The house whispered to her.", "خانه به او نجوا کرد."),
                    StoryParagraph("She jumped.", "او پرید."),
                    StoryParagraph("The others found her on the floor.", "دیگران او را روی زمین پیدا کردند."),
                    StoryParagraph("She was dead.", "او مرده بود."),
                    StoryParagraph("The house had won.", "خانه برده بود."),
                    StoryParagraph("Dr. Montague wrote about the case.", "دکتر مونتاگ درباره پرونده نوشت."),
                    StoryParagraph("He said the house was truly evil.", "او گفت خانه واقعاً شیطانی بود."),
                    StoryParagraph("Luke never returned to the house.", "لوک هرگز به خانه برنگشت."),
                    StoryParagraph("But the house still stood there.", "اما خانه هنوز آنجا ایستاده بود.")
                )
            )
        )
    )
}