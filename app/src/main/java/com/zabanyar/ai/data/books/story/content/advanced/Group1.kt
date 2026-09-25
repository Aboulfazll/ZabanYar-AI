package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۱ پیشرفته — داستان‌های ادبی کلاسیک
 *  ۱. عقل و احساس
 *  ۲. آرزوهای بزرگ
 *  ۳. موبی دیک
 */
object Group1 {

    fun getAll(): List<StoryContent> = listOf(
        story1(),
        story2(),
        story3(),
    )

    // ─────────────── ۱: عقل و احساس ───────────────
    private fun story1() = StoryContent(
        storyId = "adv_sense_sensibility",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Dashwood Family", titlePersian = "خانواده دشوود",
                paragraphs = listOf(
                    StoryParagraph("Mr. Dashwood was a wealthy landowner.", "آقای دشوود زمیندار ثروتمندی بود."),
                    StoryParagraph("He had a wife and three daughters.", "او همسر و سه دختر داشت."),
                    StoryParagraph("When he died, the law gave everything to his son.", "وقتی مرد، قانون همه چیز را به پسرش داد."),
                    StoryParagraph("His son was from a first marriage.", "پسرش از ازدواج اول بود."),
                    StoryParagraph("The son did not want to share the money.", "پسر نمی‌خواست پول را تقسیم کند."),
                    StoryParagraph("He gave his stepmother and sisters very little.", "او به نامادری و خواهرانش خیلی کم داد."),
                    StoryParagraph("The Dashwood women had to leave their home.", "زنان دشوود مجبور شدند خانه‌شان را ترک کنند."),
                    StoryParagraph("They found a small cottage in Devonshire.", "آن‌ها کلبه‌ای کوچک در دوون‌شر پیدا کردند."),
                    StoryParagraph("It was owned by a distant cousin named Sir John.", "صاحبش پسرعموی دوری به نام سر جان بود."),
                    StoryParagraph("Sir John was a friendly and kind man.", "سر جان مردی خوش‌برخورد و مهربان بود."),
                    StoryParagraph("The oldest daughter was Elinor.", "دختر بزرگتر الینور بود."),
                    StoryParagraph("She was calm and sensible.", "او آرام و عاقل بود."),
                    StoryParagraph("She hid her feelings from everyone.", "او احساساتش را از همه پنهان می‌کرد."),
                    StoryParagraph("The second daughter was Marianne.", "دختر دوم ماریان بود."),
                    StoryParagraph("She was romantic and emotional.", "او رمانتیک و احساسی بود."),
                    StoryParagraph("She showed her feelings openly.", "او احساساتش را آشکارا نشان می‌داد."),
                    StoryParagraph("The youngest was Margaret.", "کوچک‌ترین مارگارت بود."),
                    StoryParagraph("She was still just a girl.", "او هنوز فقط یک دختر بود."),
                    StoryParagraph("The three sisters loved each other deeply.", "سه خواهر عمیقاً یکدیگر را دوست داشتند."),
                    StoryParagraph("They tried to be happy in their new life.", "آن‌ها تلاش کردند در زندگی جدیدشان خوشحال باشند.")
                )
            ),
            StoryChapter(
                number = 2, title = "Love and Betrayal", titlePersian = "عشق و خیانت",
                paragraphs = listOf(
                    StoryParagraph("At Sir John's house, Elinor met a young man.", "در خانه سر جان، الینور مرد جوانی را ملاقات کرد."),
                    StoryParagraph("His name was Edward Ferrars.", "اسمش ادوارد فرارز بود."),
                    StoryParagraph("Edward was shy and gentle.", "ادوارد خجالتی و ملایم بود."),
                    StoryParagraph("He and Elinor fell in love.", "او و الینور عاشق شدند."),
                    StoryParagraph("But Edward's family was rich and proud.", "اما خانواده ادوارد ثروتمند و مغرور بودند."),
                    StoryParagraph("They wanted him to marry a wealthy woman.", "آن‌ها می‌خواستند با زنی ثروتمند ازدواج کند."),
                    StoryParagraph("Edward's mother was very cruel.", "مادر ادوارد خیلی ظالم بود."),
                    StoryParagraph("She did not approve of Elinor.", "او الینور را قبول نداشت."),
                    StoryParagraph("Meanwhile, Marianne met a man named Willoughby.", "در همین حال، ماریان مردی به نام ویلوبی را ملاقات کرد."),
                    StoryParagraph("Willoughby was handsome and charming.", "ویلوبی خوش‌قیافه و جذاب بود."),
                    StoryParagraph("He loved poetry and music like Marianne.", "او مثل ماریان عاشق شعر و موسیقی بود."),
                    StoryParagraph("They spent every day together.", "آن‌ها هر روز را با هم می‌گذراندند."),
                    StoryParagraph("Marianne fell deeply in love.", "ماریان عمیقاً عاشق شد."),
                    StoryParagraph("Everyone expected them to marry.", "همه انتظار داشتند ازدواج کنند."),
                    StoryParagraph("But then Willoughby left suddenly.", "اما بعد ویلوبی ناگهان رفت."),
                    StoryParagraph("He did not explain why.", "او توضیح نداد چرا."),
                    StoryParagraph("Marianne was heartbroken.", "ماریان دلشکسته شد."),
                    StoryParagraph("She cried for weeks.", "هفته‌ها گریه کرد."),
                    StoryParagraph("Elinor tried to comfort her.", "الینور تلاش کرد دلداری‌اش دهد."),
                    StoryParagraph("But she also had her own sorrow.", "اما او هم غم خودش را داشت.")
                )
            ),
            StoryChapter(
                number = 3, title = "A Journey to London", titlePersian = "سفر به لندن",
                paragraphs = listOf(
                    StoryParagraph("A friend invited Elinor and Marianne to London.", "دوستی الینور و ماریان را به لندن دعوت کرد."),
                    StoryParagraph("They went with great excitement.", "آن‌ها با هیجان زیادی رفتند."),
                    StoryParagraph("Marianne hoped to see Willoughby again.", "ماریان امیدوار بود دوباره ویلوبی را ببیند."),
                    StoryParagraph("She wrote him many letters.", "او نامه‌های زیادی به او نوشت."),
                    StoryParagraph("But he did not answer any of them.", "اما او به هیچ‌کدام جواب نداد."),
                    StoryParagraph("At a party, they finally saw him.", "در مهمانی‌ای، بالاخره دیدندش."),
                    StoryParagraph("He was with a rich young woman.", "او با زن جوان ثروتمندی بود."),
                    StoryParagraph("He acted cold and distant.", "او سرد و دور رفتار می‌کرد."),
                    StoryParagraph("Marianne was shocked and hurt.", "ماریان شوکه و زخمی شد."),
                    StoryParagraph("She wrote him a desperate letter.", "او نامه‌ای ناامیدانه به او نوشت."),
                    StoryParagraph("Willoughby replied with cruelty.", "ویلوبی با ظلم جواب داد."),
                    StoryParagraph("He said he never loved her.", "او گفت هرگز دوستش نداشته."),
                    StoryParagraph("Marianne became very ill.", "ماریان خیلی مریض شد."),
                    StoryParagraph("She had a terrible fever.", "تب وحشتناکی داشت."),
                    StoryParagraph("Elinor stayed by her side day and night.", "الینور شبانه‌روز کنارش ماند."),
                    StoryParagraph("Meanwhile, Elinor learned about Edward.", "در همین حال، الینور درباره ادوارد فهمید."),
                    StoryParagraph("He was secretly engaged to another woman.", "او مخفیانه با زن دیگری نامزد بود."),
                    StoryParagraph("Her name was Lucy Steele.", "اسمش لوسی استیل بود."),
                    StoryParagraph("Elinor was heartbroken but stayed silent.", "الینور دلشکسته شد اما سکوت کرد."),
                    StoryParagraph("She had to be strong for her sister.", "او باید برای خواهرش قوی می‌ماند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Truth Revealed", titlePersian = "حقیقت آشکار",
                paragraphs = listOf(
                    StoryParagraph("Edward's mother found out about Lucy.", "مادر ادوارد درباره لوسی فهمید."),
                    StoryParagraph("She was furious.", "او خشمگین شد."),
                    StoryParagraph("She disinherited Edward completely.", "او ادوارد را کاملاً از ارث محروم کرد."),
                    StoryParagraph("Edward lost all his money.", "ادوارد تمام پولش را از دست داد."),
                    StoryParagraph("But he kept his promise to Lucy.", "اما به قولش به لوسی وفادار ماند."),
                    StoryParagraph("Meanwhile, Willoughby came to see Elinor.", "در همین حال، ویلوبی به دیدن الینور آمد."),
                    StoryParagraph("He confessed his love for Marianne.", "او عشقش به ماریان را اعتراف کرد."),
                    StoryParagraph("But he had married for money.", "اما او برای پول ازدواج کرده بود."),
                    StoryParagraph("He was ashamed and miserable.", "او شرمنده و بدبخت بود."),
                    StoryParagraph("Marianne slowly recovered from her illness.", "ماریان آرام‌آرام از بیماری‌اش بهبود یافت."),
                    StoryParagraph("She learned to value sense over sensibility.", "او یاد گرفت عقل را بر احساس ترجیح دهد."),
                    StoryParagraph("She started to appreciate a kind man named Colonel Brandon.", "او شروع کرد به قدردانی از مردی مهربان به نام سرهنگ براندون."),
                    StoryParagraph("Brandon had loved her silently for months.", "براندون ماه‌ها مخفیانه دوستش داشت."),
                    StoryParagraph("He had always been patient and gentle.", "او همیشه صبور و ملایم بود."),
                    StoryParagraph("Then news came about Lucy Steele.", "بعد خبری درباره لوسی استیل رسید."),
                    StoryParagraph("She had married Edward's brother instead.", "او به جای ادوارد با برادرش ازدواج کرده بود."),
                    StoryParagraph("Edward was finally free.", "ادوارد بالاخره آزاد شد."),
                    StoryParagraph("He came to see Elinor immediately.", "او فوراً به دیدن الینور آمد."),
                    StoryParagraph("He asked her to marry him.", "او از او خواست با او ازدواج کند."),
                    StoryParagraph("She said yes with tears of joy.", "او با اشک شوق بله گفت.")
                )
            ),
            StoryChapter(
                number = 5, title = "Two Happy Marriages", titlePersian = "ازدواج‌های خوش",
                paragraphs = listOf(
                    StoryParagraph("Edward and Elinor got married in a small church.", "ادوارد و الینور در کلیسایی کوچک ازدواج کردند."),
                    StoryParagraph("It was a quiet and simple ceremony.", "مراسمی آرام و ساده بود."),
                    StoryParagraph("Their love was based on respect and understanding.", "عشقشان بر پایه احترام و درک بود."),
                    StoryParagraph("They settled in a small house near the cottage.", "آن‌ها در خانه‌ای کوچک نزدیک کلبه ساکن شدند."),
                    StoryParagraph("Edward became a priest in the village.", "ادوارد کشیش دهکده شد."),
                    StoryParagraph("Elinor managed the household with care.", "الینور با دقت خانه را اداره می‌کرد."),
                    StoryParagraph("They were happy and content.", "آن‌ها خوشحال و راضی بودند."),
                    StoryParagraph("Meanwhile, Colonel Brandon kept visiting Marianne.", "در همین حال، سرهنگ براندون به دیدن ماریان ادامه داد."),
                    StoryParagraph("His love for her never changed.", "عشقش به او هرگز تغییر نکرد."),
                    StoryParagraph("Marianne slowly learned to love him back.", "ماریان آرام‌آرام یاد گرفت متقابلاً دوستش داشته باشد."),
                    StoryParagraph("He was not passionate like Willoughby.", "او مثل ویلوبی پرشور نبود."),
                    StoryParagraph("But he was steady and kind.", "اما ثابت‌قدم و مهربان بود."),
                    StoryParagraph("She realized that true love is not always dramatic.", "او فهمید عشق واقعی همیشه دراماتیک نیست."),
                    StoryParagraph("They got married a year later.", "آن‌ها یک سال بعد ازدواج کردند."),
                    StoryParagraph("Marianne became the mistress of Brandon's estate.", "ماریان بانوی ملک براندون شد."),
                    StoryParagraph("She was happy in her new life.", "او در زندگی جدیدش خوشحال بود."),
                    StoryParagraph("The two sisters lived close to each other.", "دو خواهر نزدیک هم زندگی می‌کردند."),
                    StoryParagraph("They visited each other every week.", "آن‌ها هر هفته به دیدن هم می‌رفتند."),
                    StoryParagraph("Their mother was proud of them.", "مادرشان به آن‌ها افتخار می‌کرد."),
                    StoryParagraph("And so the Dashwood sisters found happiness.", "و اینگونه خواهران دشوود خوشبختی را یافتند.")
                )
            )
        )
    )

    // ─────────────── ۲: آرزوهای بزرگ ───────────────
    private fun story2() = StoryContent(
        storyId = "adv_great_expectations",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Pip's Childhood", titlePersian = "کودکی پیپ",
                paragraphs = listOf(
                    StoryParagraph("My name is Philip Pirrip.", "اسم من فیلیپ پیریپ است."),
                    StoryParagraph("But everyone calls me Pip.", "اما همه مرا پیپ صدا می‌زنند."),
                    StoryParagraph("I was an orphan from a small village.", "من یتیمی از دهکده‌ای کوچک بودم."),
                    StoryParagraph("My sister raised me by hand.", "خواهرم مرا با سختی بزرگ کرد."),
                    StoryParagraph("She was often angry and cruel.", "او اغلب عصبانی و ظالم بود."),
                    StoryParagraph("Her husband Joe was a blacksmith.", "شوهرش جو آهنگر بود."),
                    StoryParagraph("Joe was kind and gentle.", "جو مهربان و ملایم بود."),
                    StoryParagraph("He was my only real friend.", "او تنها دوست واقعی من بود."),
                    StoryParagraph("One cold evening, I went to the graveyard.", "یک عصر سرد، به قبرستان رفتم."),
                    StoryParagraph("I wanted to visit my parents' graves.", "می‌خواستم قبر والدینم را زیارت کنم."),
                    StoryParagraph("Suddenly, a man appeared from behind a tombstone.", "ناگهان، مردی از پشت سنگی قبر ظاهر شد."),
                    StoryParagraph("He was a convict who had escaped.", "او محکومی فراری بود."),
                    StoryParagraph("He threatened to kill me.", "او تهدید کرد می‌کُشدم."),
                    StoryParagraph("He wanted food and a file.", "او غذا و سوهانی می‌خواست."),
                    StoryParagraph("I was terrified.", "من وحشت کردم."),
                    StoryParagraph("I stole food from my sister's kitchen.", "از آشپزخانه خواهرم غذا دزدیدم."),
                    StoryParagraph("I also brought him a file.", "سوهانی هم برایش آوردم."),
                    StoryParagraph("He was grateful and disappeared.", "او سپاسگزار بود و ناپدید شد."),
                    StoryParagraph("Later, soldiers caught him again.", "بعد، سربازان دوباره دستگیرش کردند."),
                    StoryParagraph("But I never forgot that night.", "اما هرگز آن شب را فراموش نکردم.")
                )
            ),
            StoryChapter(
                number = 2, title = "Miss Havisham", titlePersian = "بانو هاویشام",
                paragraphs = listOf(
                    StoryParagraph("A rich woman wanted a boy to visit her.", "زنی ثروتمند می‌خواست پسری به دیدنش برود."),
                    StoryParagraph("Her name was Miss Havisham.", "اسمش میس هاویشام بود."),
                    StoryParagraph("She lived in a large old house called Satis House.", "او در خانه‌ای بزرگ و قدیمی به نام ساتیس هاوس زندگی می‌کرد."),
                    StoryParagraph("The house was dark and full of cobwebs.", "خانه تاریک و پر از تار عنکبوت بود."),
                    StoryParagraph("Miss Havisham wore an old wedding dress.", "میس هاویشام لباس عروسی قدیمی می‌پوشید."),
                    StoryParagraph("She had been jilted on her wedding day.", "او روز عروسی‌اش رها شده بود."),
                    StoryParagraph("She never left the house after that.", "بعد از آن هرگز خانه را ترک نکرد."),
                    StoryParagraph("All the clocks were stopped at the same time.", "همه ساعت‌ها در همان زمان متوقف شده بودند."),
                    StoryParagraph("The wedding cake was still on the table.", "کیک عروسی هنوز روی میز بود."),
                    StoryParagraph("Miss Havisham had adopted a girl named Estella.", "میس هاویشام دختری به نام استلا را به فرزندی گرفته بود."),
                    StoryParagraph("Estella was beautiful and proud.", "استلا زیبا و مغرور بود."),
                    StoryParagraph("She was taught to break men's hearts.", "به او آموخته بودند دل مردان را بشکند."),
                    StoryParagraph("I fell in love with her immediately.", "من بلافاصله عاشقش شدم."),
                    StoryParagraph("But she treated me with contempt.", "اما او با تحقیر با من رفتار می‌کرد."),
                    StoryParagraph("She called me common and coarse.", "او مرا عامی و خشن صدا می‌زد."),
                    StoryParagraph("I felt ashamed of my poor background.", "من از پیشینه فقیرانه‌ام شرمنده شدم."),
                    StoryParagraph("I wanted to become a gentleman.", "می‌خواستم یک نجیب‌زاده شوم."),
                    StoryParagraph("I wanted to be worthy of Estella.", "می‌خواستم لایق استلا باشم."),
                    StoryParagraph("But I did not know how.", "اما نمی‌دانستم چطور."),
                    StoryParagraph("Then one day, everything changed.", "بعد یک روز، همه چیز عوض شد.")
                )
            ),
            StoryChapter(
                number = 3, title = "Sudden Fortune", titlePersian = "ثروت ناگهانی",
                paragraphs = listOf(
                    StoryParagraph("A lawyer named Mr. Jaggers came to see me.", "وکیلی به نام آقای جگرز به دیدنم آمد."),
                    StoryParagraph("He had important news.", "خبر مهمی داشت."),
                    StoryParagraph("An unknown person wanted to make me rich.", "شخصی ناشناس می‌خواست مرا ثروتمند کند."),
                    StoryParagraph("I would receive a large fortune.", "من ثروت زیادی دریافت می‌کردم."),
                    StoryParagraph("But I could not know who gave it.", "اما نمی‌توانستم بدانم چه کسی داده."),
                    StoryParagraph("I had to move to London and become a gentleman.", "باید به لندن می‌رفتم و نجیب‌زاده می‌شدم."),
                    StoryParagraph("I was overjoyed.", "من بی‌نهایت خوشحال شدم."),
                    StoryParagraph("I thought Miss Havisham was my benefactor.", "فکر کردم میس هاویشام حامی من است."),
                    StoryParagraph("I thought she wanted me to marry Estella.", "فکر کردم می‌خواهد با استلا ازدواج کنم."),
                    StoryParagraph("I said goodbye to Joe and my sister.", "از جو و خواهرم خداحافظی کردم."),
                    StoryParagraph("Joe was sad but happy for me.", "جو غمگین بود اما برایم خوشحال."),
                    StoryParagraph("In London, I lived with a young man named Herbert.", "در لندن، با مرد جوانی به نام هربرت زندگی کردم."),
                    StoryParagraph("Herbert became my best friend.", "هربرت بهترین دوستم شد."),
                    StoryParagraph("I learned to dress and speak like a gentleman.", "یاد گرفتم مثل نجیب‌زاده‌ها لباس بپوشم و صحبت کنم."),
                    StoryParagraph("I spent money carelessly.", "بی‌احتیاطی پول خرج می‌کردم."),
                    StoryParagraph("I became ashamed of Joe's simple ways.", "از راه‌های ساده جو شرمنده شدم."),
                    StoryParagraph("I did not visit him for a long time.", "مدت زیادی به دیدنش نرفتم."),
                    StoryParagraph("Estella came to London too.", "استلا هم به لندن آمد."),
                    StoryParagraph("I saw her often at parties.", "او را زیاد در مهمانی‌ها می‌دیدم."),
                    StoryParagraph("But she still treated me coldly.", "اما او هنوز سرد با من رفتار می‌کرد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Truth About My Benefactor", titlePersian = "حقیقت آشکار",
                paragraphs = listOf(
                    StoryParagraph("One stormy night, a man came to my door.", "یک شب طوفانی، مردی به در خانه‌ام آمد."),
                    StoryParagraph("He was old and rough.", "او پیر و خشن بود."),
                    StoryParagraph("It was the convict from the graveyard.", "همان محکوم قبرستان بود."),
                    StoryParagraph("His name was Magwitch.", "اسمش مگویچ بود."),
                    StoryParagraph("He had been sent to Australia years ago.", "سال‌ها پیش به استرالیا فرستاده شده بود."),
                    StoryParagraph("He had become rich there.", "آنجا ثروتمند شده بود."),
                    StoryParagraph("He was my secret benefactor.", "او حامی مخفی من بود."),
                    StoryParagraph("I was horrified.", "من وحشت کردم."),
                    StoryParagraph("All my dreams were shattered.", "تمام رؤیاهایم خرد شد."),
                    StoryParagraph("I was not meant to marry Estella.", "من قرار نبود با استلا ازدواج کنم."),
                    StoryParagraph("Miss Havisham was not my benefactor.", "میس هاویشام حامی من نبود."),
                    StoryParagraph("But there was more terrible news.", "اما خبر وحشتناک‌تری بود."),
                    StoryParagraph("Magwitch was Estella's real father.", "مگویچ پدر واقعی استلا بود."),
                    StoryParagraph("Miss Havisham had adopted her.", "میس هاویشام او را به فرزندی گرفته بود."),
                    StoryParagraph("Estella had married a cruel man named Bentley Drummle.", "استلا با مردی ظالم به نام بنتلی درامل ازدواج کرده بود."),
                    StoryParagraph("My heart was broken.", "قلبم شکست."),
                    StoryParagraph("I realized I had wasted my life.", "فهمیدم زندگی‌ام را هدر داده‌ام."),
                    StoryParagraph("I had turned my back on Joe.", "به جو پشت کرده بودم."),
                    StoryParagraph("I had been proud and foolish.", "مغرور و احمق بوده‌ام."),
                    StoryParagraph("I decided to change.", "تصمیم گرفتم تغییر کنم.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Return", titlePersian = "بازگشت به دهکده",
                paragraphs = listOf(
                    StoryParagraph("Magwitch was arrested by the police.", "مگویچ توسط پلیس دستگیر شد."),
                    StoryParagraph("He was very sick and died in prison.", "او خیلی مریض بود و در زندان مرد."),
                    StoryParagraph("I stayed with him until the end.", "من تا آخر با او ماندم."),
                    StoryParagraph("I learned that he had truly loved me.", "فهمیدم او واقعاً دوستم داشت."),
                    StoryParagraph("He had worked hard to make me a gentleman.", "او سخت کار کرده بود تا مرا نجیب‌زاده کند."),
                    StoryParagraph("I forgave him for everything.", "همه چیز را بخشیدمش."),
                    StoryParagraph("I also forgave Miss Havisham.", "میس هاویشام را هم بخشیدم."),
                    StoryParagraph("She realized she had done wrong.", "او فهمید اشتباه کرده."),
                    StoryParagraph("She died in a fire at Satis House.", "او در آتش‌سوزی ساتیس هاوس مرد."),
                    StoryParagraph("I went back to my village.", "به دهکده‌ام برگشتم."),
                    StoryParagraph("Joe welcomed me with open arms.", "جو مرا با آغوش باز پذیرفت."),
                    StoryParagraph("I asked for his forgiveness.", "از او طلب بخشش کردم."),
                    StoryParagraph("He forgave me without hesitation.", "بدون تردید بخشیدم."),
                    StoryParagraph("I lived with Joe for a while.", "مدتی با جو زندگی کردم."),
                    StoryParagraph("I worked hard and became honest.", "سخت کار کردم و صادق شدم."),
                    StoryParagraph("Years later, I saw Estella again.", "سال‌ها بعد، دوباره استلا را دیدم."),
                    StoryParagraph("She had suffered in her marriage.", "او در ازدواجش رنج کشیده بود."),
                    StoryParagraph("She had become kinder and softer.", "او مهربان‌تر و نرم‌تر شده بود."),
                    StoryParagraph("We walked together in the ruins of Satis House.", "با هم در ویرانه‌های ساتیس هاوس قدم زدیم."),
                    StoryParagraph("I saw no shadow of another parting.", "سایه جدایی دیگری ندیدم.")
                )
            )
        )
    )

    // ─────────────── ۳: موبی دیک ───────────────
    private fun story3() = StoryContent(
        storyId = "adv_moby_dick",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Sea Journey", titlePersian = "سفر به دریا",
                paragraphs = listOf(
                    StoryParagraph("My name is Ishmael.", "اسم من ایشمائیل است."),
                    StoryParagraph("I am a sailor and a wanderer.", "من ملوان و سرگردانی هستم."),
                    StoryParagraph("I wanted to go to sea again.", "می‌خواستم دوباره به دریا بروم."),
                    StoryParagraph("I traveled to New Bedford, Massachusetts.", "به نیو بدفورد، ماساچوست سفر کردم."),
                    StoryParagraph("It was a cold winter night.", "شب سرد زمستانی بود."),
                    StoryParagraph("I looked for a place to sleep.", "دنبال جایی برای خواب گشتم."),
                    StoryParagraph("The inns were full and expensive.", "مسافرخانه‌ها پر و گران بودند."),
                    StoryParagraph("Someone told me about the Spouter Inn.", "کسی درباره مسافرخانه اسپاوتر به من گفت."),
                    StoryParagraph("The inn was old and small.", "مسافرخانه قدیمی و کوچک بود."),
                    StoryParagraph("The owner said I had to share a bed.", "صاحبش گفت باید تختی را شریک شوم."),
                    StoryParagraph("My roommate was a harpooner named Queequeg.", "هم‌اتاقی‌ام نیزه‌اندازی به نام کوییکگ بود."),
                    StoryParagraph("He was from a Pacific island.", "او از جزیره‌ای در اقیانوس آرام بود."),
                    StoryParagraph("He had tattoos all over his face.", "همه صورتش خالکوبی داشت."),
                    StoryParagraph("At first, I was afraid of him.", "اول از او ترسیدم."),
                    StoryParagraph("But he was kind and generous.", "اما او مهربان و سخاوتمند بود."),
                    StoryParagraph("We became good friends.", "ما دوستان خوبی شدیم."),
                    StoryParagraph("We decided to find a whaling ship together.", "تصمیم گرفتیم با هم کشتی صید نهنگ پیدا کنیم."),
                    StoryParagraph("We went to Nantucket, the whaling port.", "به نانتاکت، بندر صید نهنگ رفتیم."),
                    StoryParagraph("We found a ship called the Pequod.", "کشتی‌ای به نام پیکود پیدا کردیم."),
                    StoryParagraph("We signed up for a long voyage.", "برای سفری طولانی ثبت‌نام کردیم.")
                )
            ),
            StoryChapter(
                number = 2, title = "Captain Ahab", titlePersian = "کاپیتان اهب",
                paragraphs = listOf(
                    StoryParagraph("The Pequod left the harbor on a cold morning.", "پیکود در صبحی سرد بندر را ترک کرد."),
                    StoryParagraph("For several days, we did not see the captain.", "چند روز کاپیتان را ندیدیم."),
                    StoryParagraph("Then one morning, he appeared on deck.", "بعد یک صبح، روی عرشه ظاهر شد."),
                    StoryParagraph("His name was Captain Ahab.", "اسمش کاپیتان اهب بود."),
                    StoryParagraph("He was tall and fierce.", "او بلندقد و خشن بود."),
                    StoryParagraph("He had a white scar across his face.", "زخم سفیدی روی صورتش داشت."),
                    StoryParagraph("He had a peg leg made of whalebone.", "پایی چوبی از استخوان نهنگ داشت."),
                    StoryParagraph("His real leg had been bitten off by a whale.", "پای واقعی‌اش توسط نهنگی گاز گرفته شده بود."),
                    StoryParagraph("The whale was called Moby Dick.", "اسم نهنگ موبی دیک بود."),
                    StoryParagraph("It was a giant white whale.", "نهنگ سفید غول‌پیکری بود."),
                    StoryParagraph("Ahab hated it with all his heart.", "اهب با تمام قلبش از آن متنفر بود."),
                    StoryParagraph("He wanted revenge.", "او انتقام می‌خواست."),
                    StoryParagraph("He called the crew together.", "او خدمه را جمع کرد."),
                    StoryParagraph("He showed them a gold coin.", "او سکه طلایی به آن‌ها نشان داد."),
                    StoryParagraph("He nailed it to the mast.", "آن را به دکل میخ کرد."),
                    StoryParagraph("Whoever saw Moby Dick first would get it.", "هر کس اول موبی دیک را ببیند آن را می‌گیرد."),
                    StoryParagraph("The crew cheered.", "خدمه هورا کشیدند."),
                    StoryParagraph("But Starbuck, the first mate, was worried.", "اما استارباک، افسر اول، نگران بود."),
                    StoryParagraph("He thought Ahab was mad.", "او فکر می‌کرد اهب دیوانه است."),
                    StoryParagraph("But he could not stop him.", "اما نمی‌توانست متوقفش کند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Hunt for the Whale", titlePersian = "شکار نهنگ",
                paragraphs = listOf(
                    StoryParagraph("The Pequod sailed around the world.", "پیکود دور دنیا را گشت."),
                    StoryParagraph("It crossed the Atlantic and Indian Oceans.", "از اقیانوس اطلس و هند گذشت."),
                    StoryParagraph("It went around the Cape of Good Hope.", "دور دماغه امید نیک چرخید."),
                    StoryParagraph("It sailed through the Pacific Ocean.", "از اقیانوس آرام گذشت."),
                    StoryParagraph("Months passed.", "ماه‌ها گذشت."),
                    StoryParagraph("The crew hunted many whales.", "خدمه نهنگ‌های زیادی شکار کردند."),
                    StoryParagraph("They filled the ship with oil.", "کشتی را پر از روغن کردند."),
                    StoryParagraph("But Ahab was not interested in other whales.", "اما اهب به نهنگ‌های دیگر علاقه‌ای نداشت."),
                    StoryParagraph("He only wanted Moby Dick.", "او فقط موبی دیک را می‌خواست."),
                    StoryParagraph("They met other ships along the way.", "در راه کشتی‌های دیگری دیدند."),
                    StoryParagraph("Some had seen the white whale.", "بعضی نهنگ سفید را دیده بودند."),
                    StoryParagraph("They told terrible stories about it.", "آن‌ها داستان‌های وحشتناکی درباره‌اش گفتند."),
                    StoryParagraph("It had destroyed many ships.", "کشتی‌های زیادی را نابود کرده بود."),
                    StoryParagraph("It had killed many men.", "مردان زیادی را کشته بود."),
                    StoryParagraph("Ahab became more and more obsessed.", "اهب وسواس‌مندتر و وسواس‌مندتر شد."),
                    StoryParagraph("He did not sleep or eat.", "او نمی‌خوابید و نمی‌خورد."),
                    StoryParagraph("He stood on deck day and night.", "شبانه‌روز روی عرشه می‌ایستاد."),
                    StoryParagraph("He looked for the white whale everywhere.", "همه‌جا دنبال نهنگ سفید می‌گشت."),
                    StoryParagraph("The crew started to fear him.", "خدمه شروع کردند به ترسیدن از او."),
                    StoryParagraph("But they followed him anyway.", "اما به هر حال دنبالش رفتند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Obsession", titlePersian = "وسواس کاپیتان",
                paragraphs = listOf(
                    StoryParagraph("One day, a ship called the Rachel passed by.", "یک روز، کشتی‌ای به نام راشل از کنار گذشت."),
                    StoryParagraph("The captain was looking for his lost sons.", "کاپیتانش دنبال پسران گمشده‌اش می‌گشت."),
                    StoryParagraph("Their boats had been lost in a storm.", "قایق‌هایشان در طوفانی گم شده بود."),
                    StoryParagraph("He begged Ahab to help search.", "او التماس کرد اهب کمک کند جستجو کند."),
                    StoryParagraph("But Ahab refused.", "اما اهب امتناع کرد."),
                    StoryParagraph("He only cared about Moby Dick.", "او فقط به موبی دیک اهمیت می‌داد."),
                    StoryParagraph("The next day, Ahab saw the white whale.", "روز بعد، اهب نهنگ سفید را دید."),
                    StoryParagraph("He shouted with joy and anger.", "او از خوشحالی و خشم فریاد زد."),
                    StoryParagraph("The crew prepared the boats.", "خدمه قایق‌ها را آماده کردند."),
                    StoryParagraph("They chased Moby Dick for three days.", "آن‌ها سه روز موبی دیک را تعقیب کردند."),
                    StoryParagraph("The whale was fast and dangerous.", "نهنگ سریع و خطرناک بود."),
                    StoryParagraph("On the first day, it destroyed one boat.", "روز اول، یک قایق را نابود کرد."),
                    StoryParagraph("On the second day, it destroyed two more.", "روز دوم، دو قایق دیگر را نابود کرد."),
                    StoryParagraph("On the third day, Ahab joined the chase himself.", "روز سوم، اهب خودش به تعقیب پیوست."),
                    StoryParagraph("He threw his harpoon into the whale.", "نیزه‌اش را به نهنگ پرت کرد."),
                    StoryParagraph("But the whale turned on the ship.", "اما نهنگ به سمت کشتی چرخید."),
                    StoryParagraph("It hit the Pequod with great force.", "با قدرت زیاد به پیکود خورد."),
                    StoryParagraph("The ship started to sink.", "کشتی شروع به غرق شدن کرد."),
                    StoryParagraph("Ahab was caught in the ropes.", "اهب در طناب‌ها گرفتار شد."),
                    StoryParagraph("He was dragged down into the sea.", "او به دریا کشیده شد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Only Survivor", titlePersian = "غرق شدن",
                paragraphs = listOf(
                    StoryParagraph("The Pequod sank into the ocean.", "پیکود در اقیانوس غرق شد."),
                    StoryParagraph("Everyone on board died.", "همه سرنشینان مردند."),
                    StoryParagraph("The boats were destroyed.", "قایق‌ها نابود شدند."),
                    StoryParagraph("The whale disappeared into the deep.", "نهنگ در اعماق ناپدید شد."),
                    StoryParagraph("Only one person survived.", "فقط یک نفر زنده ماند."),
                    StoryParagraph("It was me, Ishmael.", "من بودم، ایشمائیل."),
                    StoryParagraph("I was thrown from my boat into the water.", "من از قایقم به آب پرتاب شدم."),
                    StoryParagraph("I found a floating coffin.", "تابوتی شناور پیدا کردم."),
                    StoryParagraph("It had been made for my friend Queequeg.", "برای دوستم کوییکگ ساخته شده بود."),
                    StoryParagraph("But he had recovered from his illness.", "اما او از بیماری‌اش بهبود یافته بود."),
                    StoryParagraph("The coffin saved my life.", "تابوت زندگی‌ام را نجات داد."),
                    StoryParagraph("I floated on it for a day and a night.", "یک شبانه‌روز روی آن شناور ماندم."),
                    StoryParagraph("Then the ship Rachel found me.", "بعد کشتی راشل مرا پیدا کرد."),
                    StoryParagraph("It was still looking for its lost children.", "او هنوز دنبال بچه‌های گمشده‌اش می‌گشت."),
                    StoryParagraph("They took me on board.", "آن‌ها مرا به عرشه بردند."),
                    StoryParagraph("I told them the story of the Pequod.", "داستان پیکود را به آن‌ها گفتم."),
                    StoryParagraph("They could not believe what they heard.", "نمی‌توانستند باور کنند چه شنیدند."),
                    StoryParagraph("The sea was calm and empty.", "دریا آرام و خالی بود."),
                    StoryParagraph("Moby Dick had vanished forever.", "موبی دیک برای همیشه ناپدید شده بود."),
                    StoryParagraph("And so I lived to tell this tale.", "و اینگونه زنده ماندم تا این داستان را بگویم.")
                )
            )
        )
    )
}