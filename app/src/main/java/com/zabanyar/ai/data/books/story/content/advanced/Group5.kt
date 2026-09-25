package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۵ پیشرفته — شاهکارهای نهایی
 *  ۱۳. جنگ و صلح
 *  ۱۴. برادران کارامازوف
 *  ۱۵. اولیس
 */
object Group5 {

    fun getAll(): List<StoryContent> = listOf(
        story13(),
        story14(),
        story15(),
    )

    // ─────────────── ۱۳: جنگ و صلح ───────────────
    private fun story13() = StoryContent(
        storyId = "adv_war_and_peace",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Salon of Anna Pavlovna", titlePersian = "سالن آنا پاولونا",
                paragraphs = listOf(
                    StoryParagraph("It was the year 1805.", "سال ۱۸۰۵ بود."),
                    StoryParagraph("Napoleon was marching across Europe.", "ناپلئون در سراسر اروپا پیشروی می‌کرد."),
                    StoryParagraph("In Petersburg, a lady named Anna Pavlovna held a party.", "در پترزبورگ، زنی به نام آنا پاولونا مهمانی برگزار کرد."),
                    StoryParagraph("All the important people of the city were there.", "همه افراد مهم شهر آنجا بودند."),
                    StoryParagraph("They talked about the war and politics.", "آن‌ها درباره جنگ و سیاست صحبت کردند."),
                    StoryParagraph("A young man named Prince Andrei Bolkonsky arrived.", "مرد جوانی به نام شاهزاده آندری بولکونسکی رسید."),
                    StoryParagraph("He was intelligent and handsome.", "او باهوش و خوش‌قیافه بود."),
                    StoryParagraph("But he seemed tired and unhappy.", "اما خسته و ناراضی به نظر می‌رسید."),
                    StoryParagraph("His wife was pregnant, but he did not love her.", "همسرش باردار بود اما دوستش نداشت."),
                    StoryParagraph("He wanted to join the army.", "او می‌خواست به ارتش بپیوندد."),
                    StoryParagraph("He wanted glory and honor.", "او افتخار و ناموس می‌خواست."),
                    StoryParagraph("A friend, Pierre Bezukhov, was also there.", "دوستی به نام پیر بزوخوف هم آنجا بود."),
                    StoryParagraph("Pierre was the illegitimate son of a rich count.", "پیر پسر نامشروع کنت ثروتمندی بود."),
                    StoryParagraph("He had just returned from studying in France.", "او تازه از تحصیل در فرانسه برگشته بود."),
                    StoryParagraph("He was large, clumsy, and shy.", "او بزرگ، دست و پا چلفتی و خجالتی بود."),
                    StoryParagraph("Everyone liked him for his sincerity.", "همه برای صداقتش دوستش داشتند."),
                    StoryParagraph("Pierre admired Napoleon greatly.", "پیر ناپلئون را بسیار تحسین می‌کرد."),
                    StoryParagraph("He saw him as a hero of the modern age.", "او او را قهرمان دوران مدرن می‌دید."),
                    StoryParagraph("Andrei disagreed strongly.", "آندری شدیداً مخالف بود."),
                    StoryParagraph("So began a friendship that would last for years.", "و اینگونه دوستی‌ای آغاز شد که سال‌ها دوام می‌آورد.")
                )
            ),
            StoryChapter(
                number = 2, title = "War and the Death of a Prince", titlePersian = "جنگ و مرگ شاهزاده",
                paragraphs = listOf(
                    StoryParagraph("Andrei joined the Russian army.", "آندری به ارتش روسیه پیوست."),
                    StoryParagraph("He became an officer in the cavalry.", "او افسر سواره‌نظام شد."),
                    StoryParagraph("He fought at the battle of Austerlitz.", "او در نبرد آسترلیتز جنگید."),
                    StoryParagraph("He wanted to be a hero.", "او می‌خواست قهرمان شود."),
                    StoryParagraph("He grabbed a flag and charged forward.", "او پرچمی گرفت و به جلو حمله کرد."),
                    StoryParagraph("He was wounded on the battlefield.", "او در میدان نبرد زخمی شد."),
                    StoryParagraph("He lay on the ground looking at the sky.", "او روی زمین دراز کشید و به آسمان نگاه کرد."),
                    StoryParagraph("He thought about the greatness of the sky.", "او به عظمت آسمان فکر کرد."),
                    StoryParagraph("He thought about how small his dreams were.", "فکر کرد رؤیاهایش چقدر کوچک بودند."),
                    StoryParagraph("He was rescued and sent home.", "او نجات یافت و به خانه فرستاده شد."),
                    StoryParagraph("His wife died while giving birth.", "همسرش در حین زایمان مرد."),
                    StoryParagraph("Andrei felt deeply guilty.", "آندری عمیقاً احساس گناه کرد."),
                    StoryParagraph("He decided to retire from the army.", "او تصمیم گرفت از ارتش بازنشسته شود."),
                    StoryParagraph("He went to live on his estate.", "او برای زندگی در ملکش رفت."),
                    StoryParagraph("He wanted to be alone with his son.", "او می‌خواست با پسرش تنها باشد."),
                    StoryParagraph("Meanwhile, Pierre inherited his father's fortune.", "در همین حال، پیر ثروت پدرش را به ارث برد."),
                    StoryParagraph("He became one of the richest men in Russia.", "او یکی از ثروتمندترین مردان روسیه شد."),
                    StoryParagraph("But he felt empty and lost.", "اما احساس پوچی و گم‌شدگی می‌کرد."),
                    StoryParagraph("He married a beautiful woman named Helene.", "او با زنی زیبا به نام هلن ازدواج کرد."),
                    StoryParagraph("But she only wanted his money.", "اما او فقط پولش را می‌خواست.")
                )
            ),
            StoryChapter(
                number = 3, title = "Natasha Rostova", titlePersian = "ناتاشا روستوا",
                paragraphs = listOf(
                    StoryParagraph("The Rostov family was warm and kind.", "خانواده روستوف گرم و مهربان بودند."),
                    StoryParagraph("The Count and Countess loved their children.", "کنت و کنتس فرزندانشان را دوست داشتند."),
                    StoryParagraph("Their youngest daughter was Natasha.", "کوچک‌ترین دخترشان ناتاشا بود."),
                    StoryParagraph("She was full of life and joy.", "او پر از زندگی و شادی بود."),
                    StoryParagraph("She sang beautifully and danced well.", "او زیبا می‌خواند و خوب می‌رقصید."),
                    StoryParagraph("Andrei met Natasha at a ball.", "آندری ناتاشا را در بالماسکه‌ای ملاقات کرد."),
                    StoryParagraph("He had given up on life until that night.", "او تا آن شب از زندگی دست کشیده بود."),
                    StoryParagraph("But she made him feel young again.", "اما او دوباره جوانش کرد."),
                    StoryParagraph("He fell deeply in love.", "او عمیقاً عاشق شد."),
                    StoryParagraph("They became engaged.", "آن‌ها نامزد شدند."),
                    StoryParagraph("But Andrei's father disapproved.", "اما پدر آندری مخالفت کرد."),
                    StoryParagraph("He said Natasha was too young and poor.", "او گفت ناتاشا خیلی جوان و فقیر است."),
                    StoryParagraph("Andrei went away for a year to please his father.", "آندری برای راضی کردن پدرش یک سال رفت."),
                    StoryParagraph("Natasha waited for him.", "ناتاشا منتظر ماند."),
                    StoryParagraph("But she was lonely and young.", "اما او تنها و جوان بود."),
                    StoryParagraph("A handsome man named Anatole Kuragin courted her.", "مردی خوش‌قیافه به نام آناتول کوراگین خواستگاری‌اش کرد."),
                    StoryParagraph("He was already married but hid it.", "او قبلاً ازدواج کرده بود اما پنهان کرد."),
                    StoryParagraph("Natasha was fooled by him.", "ناتاشا فریبش را خورد."),
                    StoryParagraph("She tried to run away with him.", "او تلاش کرد با او فرار کند."),
                    StoryParagraph("But the plan failed and she was disgraced.", "اما نقشه شکست خورد و بی‌آبرو شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The War of 1812", titlePersian = "جنگ ۱۸۱۲",
                paragraphs = listOf(
                    StoryParagraph("In 1812, Napoleon invaded Russia.", "در ۱۸۱۲، ناپلئون به روسیه حمله کرد."),
                    StoryParagraph("The Russian army retreated before him.", "ارتش روسیه پیش از او عقب‌نشینی کرد."),
                    StoryParagraph("Andrei rejoined the army.", "آندری دوباره به ارتش پیوست."),
                    StoryParagraph("He had forgiven Natasha.", "او ناتاشا را بخشیده بود."),
                    StoryParagraph("But he did not see her again.", "اما دیگر او را ندید."),
                    StoryParagraph("He fought at the great battle of Borodino.", "او در نبرد بزرگ بورودینو جنگید."),
                    StoryParagraph("The battle was terrible and bloody.", "نبرد وحشتناک و خونین بود."),
                    StoryParagraph("Andrei was wounded again.", "آندری دوباره زخمی شد."),
                    StoryParagraph("He was taken to a hospital tent.", "او به چادری بیمارستانی برده شد."),
                    StoryParagraph("There, he saw Anatole Kuragin dying.", "آنجا، آناتول کوراگین را در حال مرگ دید."),
                    StoryParagraph("He forgave him and wept.", "او بخشیدم و گریه کرد."),
                    StoryParagraph("Meanwhile, Moscow was abandoned to Napoleon.", "در همین حال، مسکو به ناپلئون واگذار شد."),
                    StoryParagraph("The city was set on fire.", "شهر به آتش کشیده شد."),
                    StoryParagraph("The Rostov family fled with the army.", "خانواده روستوف با ارتش فرار کردند."),
                    StoryParagraph("They gave their carts to the wounded soldiers.", "آن‌ها گاری‌هایشان را به سربازان زخمی دادند."),
                    StoryParagraph("Natasha helped nurse the wounded.", "ناتاشا در پرستاری زخمی‌ها کمک کرد."),
                    StoryParagraph("Among them, she found Andrei.", "بین آن‌ها، آندری را پیدا کرد."),
                    StoryParagraph("He was dying from his wounds.", "او از زخم‌هایش می‌مرد."),
                    StoryParagraph("She stayed with him day and night.", "شبانه‌روز با او ماند."),
                    StoryParagraph("He died in her arms, at peace.", "او در آغوشش، در آرامش مرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Peace", titlePersian = "صلح",
                paragraphs = listOf(
                    StoryParagraph("Napoleon's army was destroyed by winter.", "ارتش ناپلئون توسط زمستان نابود شد."),
                    StoryParagraph("The Russians drove them out of their land.", "روس‌ها آن‌ها را از سرزمینشان بیرون کردند."),
                    StoryParagraph("Pierre was captured by the French.", "پیر توسط فرانسوی‌ها اسیر شد."),
                    StoryParagraph("He spent months in prison.", "او ماه‌ها در زندان گذراند."),
                    StoryParagraph("There, he met a simple peasant named Platon.", "آنجا، با دهقان ساده‌ای به نام پلاتون ملاقات کرد."),
                    StoryParagraph("Platon taught him about simple happiness.", "پلاتون به او درباره خوشبختی ساده آموخت."),
                    StoryParagraph("Pierre learned to love life as it was.", "پیر یاد گرفت زندگی را همانطور که هست دوست داشته باشد."),
                    StoryParagraph("He was freed when the French retreated.", "وقتی فرانسوی‌ها عقب‌نشینی کردند آزاد شد."),
                    StoryParagraph("His wife Helene had died.", "همسرش هلن مرده بود."),
                    StoryParagraph("He was free to start again.", "او آزاد بود دوباره شروع کند."),
                    StoryParagraph("He met Natasha again, and they fell in love.", "او دوباره ناتاشا را دید و عاشق شدند."),
                    StoryParagraph("They got married and had children.", "آن‌ها ازدواج کردند و بچه‌دار شدند."),
                    StoryParagraph("They lived a simple and happy life.", "آن‌ها زندگی ساده و خوشی داشتند."),
                    StoryParagraph("Pierre became involved in politics.", "پیر درگیر سیاست شد."),
                    StoryParagraph("He wanted a better future for Russia.", "او آینده بهتری برای روسیه می‌خواست."),
                    StoryParagraph("He joined a secret society of reformers.", "او به انجمن مخفی اصلاح‌طلبان پیوست."),
                    StoryParagraph("Natasha supported him fully.", "ناتاشا کاملاً حمایتش کرد."),
                    StoryParagraph("The old Count Rostov had died.", "کنت پیر روستوف مرده بود."),
                    StoryParagraph("Nicholas Rostov married Princess Mary.", "نیکلای روستوف با شاهزاده خانم مری ازدواج کرد."),
                    StoryParagraph("And so the families were united in peace.", "و اینگونه خانواده‌ها در صلح متحد شدند.")
                )
            )
        )
    )

    // ─────────────── ۱۴: برادران کارامازوف ───────────────
    private fun story14() = StoryContent(
        storyId = "adv_karamazov",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Fyodor Karamazov", titlePersian = "فیودور کارامازوف",
                paragraphs = listOf(
                    StoryParagraph("Fyodor Karamazov was a rich landowner.", "فیودور کارامازوف زمیندار ثروتمندی بود."),
                    StoryParagraph("He was a cruel and selfish man.", "او مردی ظالم و خودخواه بود."),
                    StoryParagraph("He had three sons from two marriages.", "او از دو ازدواج سه پسر داشت."),
                    StoryParagraph("He had ignored them as children.", "او در کودکی نادیده‌شان گرفته بود."),
                    StoryParagraph("The oldest was Dmitri.", "پسر بزرگتر دمیتری بود."),
                    StoryParagraph("Dmitri was passionate and wild.", "دمیتری پرشور و وحشی بود."),
                    StoryParagraph("He had been a soldier and a gambler.", "او سرباز و قمارباز بوده است."),
                    StoryParagraph("He had come to claim his inheritance.", "او برای گرفتن ارثش آمده بود."),
                    StoryParagraph("The second son was Ivan.", "پسر دوم ایوان بود."),
                    StoryParagraph("Ivan was an intellectual and a skeptic.", "ایوان روشنفکر و شک‌گرا بود."),
                    StoryParagraph("He studied philosophy and wrote articles.", "او فلسفه خوانده و مقاله می‌نوشت."),
                    StoryParagraph("He questioned God and morality.", "او خدا و اخلاق را زیر سوال می‌برد."),
                    StoryParagraph("The youngest was Alyosha.", "پسر کوچکتر آلکسی بود."),
                    StoryParagraph("Alyosha was gentle and deeply religious.", "آلکسی ملایم و عمیقاً مذهبی بود."),
                    StoryParagraph("He was a novice in a monastery.", "او تازه‌کاری در صومعه بود."),
                    StoryParagraph("His elder was a famous monk named Zosima.", "مرشدش راهبی معروف به نام زوسیما بود."),
                    StoryParagraph("Zosima was known for his wisdom and love.", "زوسیما برای دانایی و عشقش شناخته می‌شد."),
                    StoryParagraph("People came from all over to see him.", "مردم از همه‌جا برای دیدنش می‌آمدند."),
                    StoryParagraph("The family gathered at the monastery.", "خانواده در صومعه جمع شدند."),
                    StoryParagraph("They argued about money and inheritance.", "آن‌ها درباره پول و ارث بحث کردند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Murder", titlePersian = "قتل",
                paragraphs = listOf(
                    StoryParagraph("Dmitri loved a woman named Grushenka.", "دمیتری زنی به نام گروشنکا را دوست داشت."),
                    StoryParagraph("But his father also wanted her.", "اما پدرش هم او را می‌خواست."),
                    StoryParagraph("The two men became bitter enemies.", "دو مرد دشمنان تلخی شدند."),
                    StoryParagraph("Dmitri threatened to kill his father.", "دمیتری تهدید کرد پدرش را می‌کشد."),
                    StoryParagraph("One night, Fyodor was found dead.", "یک شب، فیودور مرده پیدا شد."),
                    StoryParagraph("His head had been smashed.", "سرش خرد شده بود."),
                    StoryParagraph("The money he kept was gone.", "پولی که نگه می‌داشت رفته بود."),
                    StoryParagraph("Dmitri was arrested for the murder.", "دمیتری برای قتل دستگیر شد."),
                    StoryParagraph("He said he was innocent.", "او گفت بی‌گناه است."),
                    StoryParagraph("But all the evidence pointed to him.", "اما تمام شواهد به او اشاره داشت."),
                    StoryParagraph("He had been seen near the house that night.", "او آن شب نزدیک خانه دیده شده بود."),
                    StoryParagraph("He had his father's blood on his hands.", "خون پدرش روی دستانش بود."),
                    StoryParagraph("But he said the blood was from another wound.", "اما گفت خون از زخم دیگری بود."),
                    StoryParagraph("The trial became a national sensation.", "محاکمه به حادثه‌ای ملی تبدیل شد."),
                    StoryParagraph("Ivan was torn apart by guilt.", "ایوان از گناه پاره شد."),
                    StoryParagraph("He suspected that he was the real murderer.", "او شک کرد که قاتل واقعی خودش است."),
                    StoryParagraph("He had wished his father dead in his mind.", "او در ذهنش آرزوی مرگ پدرش را کرده بود."),
                    StoryParagraph("A servant named Smerdyakov confessed.", "خدمتکاری به نام اسمردیاکوف اعتراف کرد."),
                    StoryParagraph("He was Fyodor's illegitimate son.", "او پسر نامشروع فیودور بود."),
                    StoryParagraph("He had killed Fyodor with Ivan's permission.", "او با اجازه ایوان فیودور را کشته بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Grand Inquisitor", titlePersian = "محقق بزرگ",
                paragraphs = listOf(
                    StoryParagraph("Ivan and Alyosha met in a tavern.", "ایوان و آلکسی در میخانه‌ای ملاقات کردند."),
                    StoryParagraph("Ivan told his brother a story he had written.", "ایوان داستانی که نوشته بود به برادرش گفت."),
                    StoryParagraph("It was called The Grand Inquisitor.", "نامش محقق بزرگ بود."),
                    StoryParagraph("It took place in Spain during the Inquisition.", "در اسپانیا در زمان تفتیش عقاید اتفاق می‌افتاد."),
                    StoryParagraph("Jesus returned to earth as a man.", "عیسی به عنوان انسان به زمین برگشت."),
                    StoryParagraph("He walked among the people and healed them.", "او بین مردم راه رفت و شفایشان داد."),
                    StoryParagraph("The Grand Inquisitor arrested him.", "محقق بزرگ او را دستگیر کرد."),
                    StoryParagraph("That night, he came to visit Jesus in his cell.", "آن شب، برای دیدن عیسی در سلولش آمد."),
                    StoryParagraph("He said the church no longer needed Jesus.", "او گفت کلیسا دیگر به عیسی نیاز ندارد."),
                    StoryParagraph("He said humans could not handle freedom.", "او گفت انسان‌ها نمی‌توانند آزادی را تحمل کنند."),
                    StoryParagraph("He said the church had corrected Jesus' work.", "او گفت کلیسا کار عیسی را اصلاح کرده."),
                    StoryParagraph("Jesus listened in silence.", "عیسی در سکوت گوش داد."),
                    StoryParagraph("When the Inquisitor finished, Jesus kissed him.", "وقتی محقق تمام کرد، عیسی بوسیدش."),
                    StoryParagraph("The Inquisitor let him go.", "محقق او را رها کرد."),
                    StoryParagraph("Ivan asked Alyosha what he thought.", "ایوان از آلکسی پرسید نظرش چیست."),
                    StoryParagraph("Alyosha said the kiss was the answer.", "آلکسی گفت بوسه پاسخ بود."),
                    StoryParagraph("But Ivan said he could not accept a world with suffering.", "اما ایوان گفت نمی‌تواند دنیایی با رنج را بپذیرد."),
                    StoryParagraph("He said he would return his ticket to God.", "او گفت بلیطش را به خدا پس می‌دهد."),
                    StoryParagraph("He could not accept harmony bought with a child's tears.", "او نمی‌توانست هماهنگی‌ای که با اشک کودکی خریده شده را بپذیرد."),
                    StoryParagraph("Alyosha was deeply saddened by his brother's words.", "آلکسی از حرف‌های برادرش عمیقاً غمگین شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Ivan's Madness", titlePersian = "جنون ایوان",
                paragraphs = listOf(
                    StoryParagraph("After the murder, Ivan became very sick.", "بعد از قتل، ایوان خیلی مریض شد."),
                    StoryParagraph("He started to see the devil.", "او شروع کرد به دیدن شیطان."),
                    StoryParagraph("The devil appeared to him as a gentleman.", "شیطان به شکل جنتلمنی بر او ظاهر شد."),
                    StoryParagraph("He was polite and mocking.", "او مؤدب و تمسخرآمیز بود."),
                    StoryParagraph("He said everything Ivan believed was vanity.", "او گفت هر چیزی که ایوان باور داشت پوچ بود."),
                    StoryParagraph("Ivan could not tell what was real.", "ایوان نمی‌توانست تشخیص دهد چه واقعی است."),
                    StoryParagraph("He argued with the devil for hours.", "او ساعت‌ها با شیطان بحث کرد."),
                    StoryParagraph("He felt he was going mad.", "او احساس کرد دارد دیوانه می‌شود."),
                    StoryParagraph("At the trial, he gave confused testimony.", "در محاکمه، شهادت گیج‌کننده‌ای داد."),
                    StoryParagraph("He accused himself and Smerdyakov.", "او خودش و اسمردیاکوف را متهم کرد."),
                    StoryParagraph("Smerdyakov had already killed himself.", "اسمردیاکوف قبلاً خودش را کشته بود."),
                    StoryParagraph("Ivan collapsed in the courtroom.", "ایوان در دادگاه از حال رفت."),
                    StoryParagraph("Dmitri was found guilty and sentenced to Siberia.", "دمیتری مجرم شناخته شد و به سیبری محکوم شد."),
                    StoryParagraph("He accepted his fate calmly.", "او سرنوشتش را آرام پذیرفت."),
                    StoryParagraph("He said he deserved to suffer.", "او گفت لایق رنج کشیدن است."),
                    StoryParagraph("Even if he was not the murderer.", "حتی اگر قاتل نبود."),
                    StoryParagraph("He had wanted his father dead in his heart.", "او در قلبش آرزوی مرگ پدرش را کرده بود."),
                    StoryParagraph("Suffering would cleanse him.", "رنج پاکش می‌کرد."),
                    StoryParagraph("The court was shocked by his confession.", "دادگاه از اعترافش شوکه شد."),
                    StoryParagraph("But nothing could change the verdict.", "اما هیچ چیز نمی‌توانست حکم را تغییر دهد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Alyosha's Faith", titlePersian = "ایمان آلکسی",
                paragraphs = listOf(
                    StoryParagraph("Alyosha remained faithful to God.", "آلکسی به خدا وفادار ماند."),
                    StoryParagraph("His elder Zosima had died.", "مرشدش زوسیما مرده بود."),
                    StoryParagraph("His body smelled bad after death.", "جسدش بعد از مرگ بوی بد می‌داد."),
                    StoryParagraph("People said he was not a saint.", "مردم گفتند او مقدس نبود."),
                    StoryParagraph("Alyosha's faith was shaken.", "ایمان آلکسی متزلزل شد."),
                    StoryParagraph("He left the monastery for a while.", "او مدتی صومعه را ترک کرد."),
                    StoryParagraph("He visited his father's house and spoke to many people.", "او به خانه پدرش رفت و با افراد زیادی صحبت کرد."),
                    StoryParagraph("He helped children and the poor.", "او به کودکان و فقرا کمک کرد."),
                    StoryParagraph("He visited Dmitri in prison.", "او در زندان به دیدن دمیتری رفت."),
                    StoryParagraph("Dmitri had found peace in suffering.", "دمیتری در رنج آرامش یافته بود."),
                    StoryParagraph("He told Alyosha to live for all people.", "او به آلکسی گفت برای همه مردم زندگی کن."),
                    StoryParagraph("Alyosha returned to the monastery with new faith.", "آلکسی با ایمان جدید به صومعه برگشت."),
                    StoryParagraph("He spoke to a group of schoolboys.", "او با گروهی از دانش‌آموزان صحبت کرد."),
                    StoryParagraph("He told them to love each other.", "او به آن‌ها گفت هم را دوست بدارند."),
                    StoryParagraph("He said one good memory can save a person.", "او گفت یک خاطره خوب می‌تواند یک نفر را نجات دهد."),
                    StoryParagraph("The boys promised to remember his words.", "پسرها قول دادند حرف‌هایش را به یاد داشته باشند."),
                    StoryParagraph("Alyosha was not sure about God's plan.", "آلکسی مطمئن نبود درباره نقشه خدا."),
                    StoryParagraph("But he chose to believe in love.", "اما انتخاب کرد به عشق ایمان بیاورد."),
                    StoryParagraph("That was enough for him.", "این برایش کافی بود."),
                    StoryParagraph("And so the story of the Karamazovs ended.", "و اینگونه داستان کارامازوف‌ها به پایان رسید.")
                )
            )
        )
    )

    // ─────────────── ۱۵: اولیس ───────────────
    private fun story15() = StoryContent(
        storyId = "adv_ulysses",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Morning in Dublin", titlePersian = "صبح در دوبلین",
                paragraphs = listOf(
                    StoryParagraph("It was June 16, 1904, in Dublin.", "۱۶ ژوئن ۱۹۰۴ در دوبلین بود."),
                    StoryParagraph("A young man named Stephen Dedalus woke up.", "مرد جوانی به نام استیون ددالوس بیدار شد."),
                    StoryParagraph("He lived in an old tower by the sea.", "او در برجی قدیمی کنار دریا زندگی می‌کرد."),
                    StoryParagraph("His friend Buck Mulligan lived there too.", "دوستش باک مالیکن هم آنجا زندگی می‌کرد."),
                    StoryParagraph("Buck made fun of Stephen's sadness.", "باک استیون غمگین را مسخره کرد."),
                    StoryParagraph("Stephen was still grieving for his mother.", "استیون هنوز برای مادرش عزادار بود."),
                    StoryParagraph("He had refused to pray at her deathbed.", "او در بستر مرگش از دعا کردن امتناع کرده بود."),
                    StoryParagraph("His guilt haunted him.", "گناهش تسخیرش می‌کرد."),
                    StoryParagraph("Stephen was a teacher and a writer.", "استیون معلم و نویسنده بود."),
                    StoryParagraph("He felt trapped by Ireland's history and religion.", "او خود را در تاریخ و مذهب ایرلند زندانی حس می‌کرد."),
                    StoryParagraph("He wanted to leave but could not.", "می‌خواست برود اما نمی‌توانست."),
                    StoryParagraph("He walked to the beach and looked at the sea.", "او به ساحل رفت و به دریا نگاه کرد."),
                    StoryParagraph("The sea was dark and cold.", "دریا تاریک و سرد بود."),
                    StoryParagraph("A ship's horn sounded in the distance.", "بوق کشتی در دوردست به صدا درآمد."),
                    StoryParagraph("Stephen thought about his dead mother.", "استیون به مادر مرده‌اش فکر کرد."),
                    StoryParagraph("He thought about his lost faith.", "به ایمان از دست رفته‌اش فکر کرد."),
                    StoryParagraph("He thought about his unlived life.", "به زندگی زیست‌نشده‌اش فکر کرد."),
                    StoryParagraph("The morning was bright but his heart was heavy.", "صبح روشن بود اما قلبش سنگین."),
                    StoryParagraph("He walked to the city to teach his class.", "او به سمت شهر رفت تا کلاسش را تدریس کند."),
                    StoryParagraph("So began a very long day.", "و اینگونه روزی بسیار طولانی آغاز شد.")
                )
            ),
            StoryChapter(
                number = 2, title = "Mr. Bloom's Day", titlePersian = "روز آقای بلوم",
                paragraphs = listOf(
                    StoryParagraph("In another part of the city, Leopold Bloom woke up.", "در بخش دیگری از شهر، لئوپولد بلوم بیدار شد."),
                    StoryParagraph("He was a Jewish man of forty.", "او مرد یهودی چهل ساله‌ای بود."),
                    StoryParagraph("He lived with his wife Molly.", "او با همسرش مالی زندگی می‌کرد."),
                    StoryParagraph("Their son Rudy had died years ago.", "پسرشان رودی سال‌ها پیش مرده بود."),
                    StoryParagraph("The loss had broken their marriage.", "این فقدان ازدواجشان را شکسته بود."),
                    StoryParagraph("Molly had a lover who was coming that day.", "مالی عاشقی داشت که آن روز می‌آمد."),
                    StoryParagraph("Bloom knew about it but said nothing.", "بلوم می‌دانست اما چیزی نمی‌گفت."),
                    StoryParagraph("He made breakfast and fed the cat.", "او صبحانه درست کرد و به گربه غذا داد."),
                    StoryParagraph("He went out to buy a kidney for lunch.", "او برای خرید کلیه برای ناهار بیرون رفت."),
                    StoryParagraph("He walked through the streets of Dublin.", "او در خیابان‌های دوبلین قدم زد."),
                    StoryParagraph("He thought about life, death, and love.", "او به زندگی، مرگ و عشق فکر کرد."),
                    StoryParagraph("He attended a funeral at eleven.", "او ساعت یازده در مراسم خاکسپاری شرکت کرد."),
                    StoryParagraph("The dead man was an old friend.", "مرد مرده دوست قدیمی بود."),
                    StoryParagraph("Bloom thought about his own father's suicide.", "بلوم به خودکشی پدرش فکر کرد."),
                    StoryParagraph("He thought about his son Rudy.", "به پسرش رودی فکر کرد."),
                    StoryParagraph("He visited the newspaper office.", "او به دفتر روزنامه رفت."),
                    StoryParagraph("He helped a friend with an advertisement.", "او به دوستی برای یک آگهی کمک کرد."),
                    StoryParagraph("He ate lunch at a pub.", "او در میخانه‌ای ناهار خورد."),
                    StoryParagraph("He watched the people around him.", "او مردم اطرافش را تماشا کرد."),
                    StoryParagraph("He felt like a stranger in his own city.", "او در شهر خودش احساس غریبی می‌کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "Afternoon Encounters", titlePersian = "ملاقات‌های بعدازظهر",
                paragraphs = listOf(
                    StoryParagraph("Bloom went to the library to check a book.", "بلوم به کتابخانه رفت تا کتابی بررسی کند."),
                    StoryParagraph("There he saw Stephen Dedalus.", "آنجا استیون ددالوس را دید."),
                    StoryParagraph("Stephen was arguing about Shakespeare.", "استیون درباره شکسپیر بحث می‌کرد."),
                    StoryParagraph("He said Shakespeare was betrayed by his wife.", "او گفت شکسپیر توسط همسرش خیانت دیده بود."),
                    StoryParagraph("Bloom listened quietly.", "بلوم آرام گوش داد."),
                    StoryParagraph("He thought Stephen was very clever.", "او فکر کرد استیون خیلی باهوش است."),
                    StoryParagraph("He also thought Stephen was sad.", "او فکر کرد استیون غمگین هم هست."),
                    StoryParagraph("Bloom went to the beach in the afternoon.", "بلوم بعدازظهر به ساحل رفت."),
                    StoryParagraph("There he saw a young woman named Gerty.", "آنجا دختر جوانی به نام گرتی دید."),
                    StoryParagraph("She was sitting with her friends.", "او با دوستانش نشسته بود."),
                    StoryParagraph("Bloom watched her from a distance.", "بلوم از دور تماشایش کرد."),
                    StoryParagraph("He thought about his youth and his desires.", "او به جوانی و هوس‌هایش فکر کرد."),
                    StoryParagraph("Gerty noticed him and was flattered.", "گرتی متوجه‌اش شد و خوشحال شد."),
                    StoryParagraph("But she left with her friends after a while.", "اما بعد از مدتی با دوستانش رفت."),
                    StoryParagraph("The night began to fall over Dublin.", "شب داشت بر دوبلین می‌افتاد."),
                    StoryParagraph("Bloom wandered toward the hospital.", "بلوم به سمت بیمارستان سرگردان شد."),
                    StoryParagraph("A friend was giving birth there.", "دوستی آنجا زایمان می‌کرد."),
                    StoryParagraph("He met Stephen again at the hospital.", "او دوباره استیون را در بیمارستان دید."),
                    StoryParagraph("Stephen was drinking with a group of medical students.", "استیون با گروهی از دانشجویان پزشکی می‌نوشید."),
                    StoryParagraph("The night was just beginning.", "شب تازه شروع شده بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "Nighttown", titlePersian = "شهر شب",
                paragraphs = listOf(
                    StoryParagraph("Stephen and his friends went to Nighttown.", "استیون و دوستانش به شهر شب رفتند."),
                    StoryParagraph("It was the red-light district of Dublin.", "منطقه چراغ‌قرمز دوبلین بود."),
                    StoryParagraph("Bloom followed them there.", "بلوم آنجا دنبالشان رفت."),
                    StoryParagraph("He was worried about Stephen.", "او نگران استیون بود."),
                    StoryParagraph("The night became strange and dreamlike.", "شب عجیب و رؤیایی شد."),
                    StoryParagraph("Bloom saw visions of his dead parents.", "بلوم رؤیاهای والدین مرده‌اش را دید."),
                    StoryParagraph("He saw visions of his lost son Rudy.", "رؤیای پسر از دست رفته‌اش رودی را دید."),
                    StoryParagraph("He saw himself on trial for his sins.", "خودش را در محاکمه برای گناهانش دید."),
                    StoryParagraph("The women of the district accused him.", "زنان منطقه متهمش کردند."),
                    StoryParagraph("He defended himself weakly.", "او ضعیف دفاع کرد."),
                    StoryParagraph("The visions became more and more wild.", "رؤیاها وحشی‌تر و وحشی‌تر شدند."),
                    StoryParagraph("Then a fight broke out in the street.", "بعد دعوایی در خیابان شروع شد."),
                    StoryParagraph("Stephen got into an argument with a soldier.", "استیون با سربازی بحث کرد."),
                    StoryParagraph("The soldier hit him and knocked him down.", "سرباز او را زد و به زمین انداخت."),
                    StoryParagraph("Bloom ran to help him.", "بلوم برای کمکش دوید."),
                    StoryParagraph("He lifted Stephen from the ground.", "او استیون را از زمین بلند کرد."),
                    StoryParagraph("He saw the ghost of his son in Stephen's face.", "او روح پسرش را در چهره استیون دید."),
                    StoryParagraph("He decided to take care of him.", "او تصمیم گرفت مراقبش باشد."),
                    StoryParagraph("He took Stephen to a cabman's shelter.", "او استیون را به پناهگاه کالسکه‌چی‌ها برد."),
                    StoryParagraph("They talked about life, art, and home.", "آن‌ها درباره زندگی، هنر و خانه صحبت کردند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Return Home", titlePersian = "بازگشت به خانه",
                paragraphs = listOf(
                    StoryParagraph("Bloom invited Stephen to his home.", "بلوم استیون را به خانه‌اش دعوت کرد."),
                    StoryParagraph("They drank cocoa and talked quietly.", "آن‌ها کاکائو نوشیدند و آرام صحبت کردند."),
                    StoryParagraph("Bloom offered Stephen a place to stay.", "بلوم به استیون جایی برای ماندن پیشنهاد داد."),
                    StoryParagraph("But Stephen politely refused.", "اما استیون مؤدبانه امتناع کرد."),
                    StoryParagraph("He walked out into the night.", "او در شب بیرون رفت."),
                    StoryParagraph("Bloom was alone again.", "بلوم دوباره تنها شد."),
                    StoryParagraph("He went upstairs to the bedroom.", "او به اتاق خواب بالا رفت."),
                    StoryParagraph("Molly was already in bed.", "مالی قبلاً در تخت بود."),
                    StoryParagraph("He told her about his day.", "او درباره روزش به او گفت."),
                    StoryParagraph("She listened with half attention.", "او با نیم توجه گوش داد."),
                    StoryParagraph("Bloom went to sleep.", "بلوم به خواب رفت."),
                    StoryParagraph("But Molly stayed awake.", "اما مالی بیدار ماند."),
                    StoryParagraph("She thought about her life.", "او به زندگی‌اش فکر کرد."),
                    StoryParagraph("She thought about her lovers.", "به عاشقانش فکر کرد."),
                    StoryParagraph("She thought about Bloom.", "به بلوم فکر کرد."),
                    StoryParagraph("She remembered how they first met.", "اولین ملاقاتشان را به یاد آورد."),
                    StoryParagraph("She remembered saying yes to him.", "بله گفتن به او را به یاد آورد."),
                    StoryParagraph("In her heart, she still loved him.", "در قلبش، هنوز دوستش داشت."),
                    StoryParagraph("She said yes, and yes, and yes.", "او گفت بله، و بله، و بله."),
                    StoryParagraph("And so the long day ended.", "و اینگونه روز طولانی به پایان رسید.")
                )
            )
        )
    )
}