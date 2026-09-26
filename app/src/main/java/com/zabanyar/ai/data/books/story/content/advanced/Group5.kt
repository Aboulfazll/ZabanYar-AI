package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۵ پیشرفته — رمان‌های کلاسیک روسی و مدرنیسم
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
                    StoryParagraph("Napoleon was conquering Europe.", "ناپلئون در حال فتح اروپا بود."),
                    StoryParagraph("In St. Petersburg, a grand party was taking place.", "در سنت پترزبورگ، مهمانی باشکوهی برگزار می‌شد."),
                    StoryParagraph("The hostess was Anna Pavlovna Scherer.", "میزبان آنا پاولونا شرر بود."),
                    StoryParagraph("She was a wealthy and influential woman.", "او زنی ثروتمند و بانفوذ بود."),
                    StoryParagraph("Her guests were the richest and most powerful people.", "مهمانانش ثروتمندترین و قدرتمندترین افراد بودند."),
                    StoryParagraph("Prince Vasily Kuragin arrived first.", "شاهزاده واسیلی کوراگین اول رسید."),
                    StoryParagraph("He was a cold and ambitious man.", "او مردی سرد و جاه‌طلب بود."),
                    StoryParagraph("He wanted to marry his daughter to a rich man.", "می‌خواست دخترش را به مردی ثروتمند شوهر دهد."),
                    StoryParagraph("His daughter Helene was beautiful but empty.", "دخترش هلن زیبا اما پوچ بود."),
                    StoryParagraph("His son Anatole was handsome but foolish.", "پسرش آناتول خوش‌قیافه اما احمق بود."),
                    StoryParagraph("The guests talked about the war.", "مهمانان درباره جنگ صحبت کردند."),
                    StoryParagraph("Some admired Napoleon.", "بعضی ناپلئون را تحسین می‌کردند."),
                    StoryParagraph("Others hated him.", "دیگران از او متنفر بودند."),
                    StoryParagraph("A young man named Pierre Bezukhov entered.", "مرد جوانی به نام پیر بزوخوف وارد شد."),
                    StoryParagraph("He was the illegitimate son of a rich count.", "او پسر نامشروع کنت ثروتمندی بود."),
                    StoryParagraph("He was awkward and shy.", "او دست‌وپاچلفتی و خجالتی بود."),
                    StoryParagraph("He had just returned from studying abroad.", "او تازه از تحصیل در خارج برگشته بود."),
                    StoryParagraph("He did not know what to do with his life.", "نمی‌دانست با زندگی‌اش چه کند."),
                    StoryParagraph("Anna Pavlovna welcomed him warmly.", "آنا پاولونا با گرمی پذیرایش شد."),
                    StoryParagraph("She saw him as a potential rich husband.", "او را شوهر ثروتمند بالقوه می‌دید.")
                )
            ),
            StoryChapter(
                number = 2, title = "Prince Andrei Bolkonsky", titlePersian = "شاهزاده آندری بولکونسکی",
                paragraphs = listOf(
                    StoryParagraph("Prince Andrei Bolkonsky was at the party.", "شاهزاده آندری بولکونسکی در مهمانی بود."),
                    StoryParagraph("He was handsome and intelligent.", "او خوش‌قیافه و باهوش بود."),
                    StoryParagraph("But he was bored and unhappy.", "اما خسته و ناراضی بود."),
                    StoryParagraph("He was married to a woman he did not love.", "او با زنی ازدواج کرده بود که دوستش نداشت."),
                    StoryParagraph("His wife Lise was pregnant.", "همسرش لیزا باردار بود."),
                    StoryParagraph("Andrei felt trapped in his life.", "آندری احساس می‌کرد در زندگی‌اش گیر افتاده."),
                    StoryParagraph("He wanted to join the army.", "می‌خواست به ارتش بپیوندد."),
                    StoryParagraph("He wanted to find glory on the battlefield.", "می‌خواست در میدان نبرد شهرت بیابد."),
                    StoryParagraph("He wanted to be like Napoleon.", "می‌خواست مثل ناپلئون باشد."),
                    StoryParagraph("He admired Napoleon's genius.", "نابغه بودن ناپلئون را تحسین می‌کرد."),
                    StoryParagraph("He met Pierre at the party.", "او پیر را در مهمانی دید."),
                    StoryParagraph("They were old friends.", "آن‌ها دوستان قدیمی بودند."),
                    StoryParagraph("They talked about life and death.", "درباره زندگی و مرگ صحبت کردند."),
                    StoryParagraph("Andrei said marriage was a trap.", "آندری گفت ازدواج تله است."),
                    StoryParagraph("He told Pierre never to marry.", "به پیر گفت هرگز ازدواج نکن."),
                    StoryParagraph("Pierre was confused by his words.", "پیر از حرف‌هایش گیج شد."),
                    StoryParagraph("He thought Andrei was wrong.", "فکر کرد آندری اشتباه می‌کند."),
                    StoryParagraph("He wanted to find love.", "می‌خواست عشق پیدا کند."),
                    StoryParagraph("He wanted to find happiness.", "می‌خواست خوشبختی پیدا کند."),
                    StoryParagraph("But he did not know where to look.", "اما نمی‌دانست کجا دنبالش بگردد."),
                    StoryParagraph("Andrei left the party early.", "آندری زودتر مهمانی را ترک کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "War and Love", titlePersian = "جنگ و عشق",
                paragraphs = listOf(
                    StoryParagraph("Andrei joined the Russian army.", "آندری به ارتش روسیه پیوست."),
                    StoryParagraph("He fought bravely at Austerlitz.", "او در آسترلیتز شجاعانه جنگید."),
                    StoryParagraph("He was wounded and left for dead.", "زخمی شد و مرده رهایش کردند."),
                    StoryParagraph("He looked up at the sky and felt peace.", "به آسمان نگاه کرد و آرامش حس کرد."),
                    StoryParagraph("He realized Napoleon was just a small man.", "فهمید ناپلئون فقط مرد کوچکی است."),
                    StoryParagraph("He realized glory was meaningless.", "فهمید شهرت بی‌معناست."),
                    StoryParagraph("He returned home to find his wife dying.", "به خانه برگشت و همسرش را در حال مرگ یافت."),
                    StoryParagraph("She died giving birth to their son.", "او در زایمان پسرشان مرد."),
                    StoryParagraph("Andrei was devastated.", "آندری ویران شد."),
                    StoryParagraph("He stopped believing in happiness.", "دیگر به خوشبختی اعتقاد نداشت."),
                    StoryParagraph("Meanwhile, Pierre inherited a fortune.", "در همین حال، پیر ثروتی به ارث برد."),
                    StoryParagraph("He became Count Bezukhov.", "او کنت بزوخوف شد."),
                    StoryParagraph("He married Helene Kuragin.", "با هلن کوراگین ازدواج کرد."),
                    StoryParagraph("But the marriage was a disaster.", "اما ازدواج فاجعه بود."),
                    StoryParagraph("Helene did not love him.", "هلن دوستش نداشت."),
                    StoryParagraph("She only wanted his money.", "او فقط پولش را می‌خواست."),
                    StoryParagraph("Pierre suspected she had a lover.", "پیر مشکوک شد که معشوقی دارد."),
                    StoryParagraph("He challenged the man to a duel.", "او مرد را به دوئل دعوت کرد."),
                    StoryParagraph("Pierre won but was full of regret.", "پیر برد اما پر از پشیمانی بود."),
                    StoryParagraph("He left Helene and searched for meaning.", "هلن را ترک کرد و دنبال معنا گشت."),
                    StoryParagraph("He joined the Freemasons.", "او به فراماسون‌ها پیوست.")
                )
            ),
            StoryChapter(
                number = 4, title = "Natasha Rostova", titlePersian = "ناتاشا روستوا",
                paragraphs = listOf(
                    StoryParagraph("Natasha Rostova was a young and joyful girl.", "ناتاشا روستوا دختری جوان و شاد بود."),
                    StoryParagraph("She lived with her loving family.", "او با خانواده محبوبش زندگی می‌کرد."),
                    StoryParagraph("The Rostovs were kind but poor.", "روستوف‌ها مهربان اما فقیر بودند."),
                    StoryParagraph("Natasha loved to sing and dance.", "ناتاشا عاشق آواز و رقص بود."),
                    StoryParagraph("She was full of life and hope.", "او پر از زندگی و امید بود."),
                    StoryParagraph("Andrei met her at a ball.", "آندری او را در یک بالماسکه ملاقات کرد."),
                    StoryParagraph("He fell in love with her instantly.", "بلافاصله عاشقش شد."),
                    StoryParagraph("She made him feel alive again.", "او باعث شد دوباره زنده احساس کند."),
                    StoryParagraph("They became engaged.", "آن‌ها نامزد کردند."),
                    StoryParagraph("But Andrei's father opposed the marriage.", "اما پدر آندری مخالف ازدواج بود."),
                    StoryParagraph("He said Natasha was too young.", "گفت ناتاشا خیلی جوان است."),
                    StoryParagraph("He sent Andrei away for a year.", "آندری را یک سال دور فرستاد."),
                    StoryParagraph("Natasha was lonely and sad.", "ناتاشا تنها و غمگین شد."),
                    StoryParagraph("She met Anatole Kuragin.", "او آناتول کوراگین را ملاقات کرد."),
                    StoryParagraph("He was handsome and charming.", "او خوش‌قیافه و جذاب بود."),
                    StoryParagraph("He seduced her with lies.", "او را با دروغ فریب داد."),
                    StoryParagraph("She almost ran away with him.", "نزدیک بود با او فرار کند."),
                    StoryParagraph("But Pierre stopped her in time.", "اما پیر به موقع متوقفش کرد."),
                    StoryParagraph("Andrei was heartbroken.", "آندری دلشکسته شد."),
                    StoryParagraph("He refused to forgive her.", "از بخشیدنش امتناع کرد."),
                    StoryParagraph("Natasha became ill with grief.", "ناتاشا از غم مریض شد.")
                )
            ),
            StoryChapter(
                number = 5, title = "War and Peace", titlePersian = "جنگ و صلح",
                paragraphs = listOf(
                    StoryParagraph("Napoleon invaded Russia in 1812.", "ناپلئون در ۱۸۱۲ به روسیه حمله کرد."),
                    StoryParagraph("The Russian army retreated.", "ارتش روسیه عقب‌نشینی کرد."),
                    StoryParagraph("The battle of Borodino was terrible.", "نبرد بورودینو وحشتناک بود."),
                    StoryParagraph("Thousands of men died on both sides.", "هزاران نفر از هر دو طرف مردند."),
                    StoryParagraph("Andrei was wounded again.", "آندری دوباره زخمی شد."),
                    StoryParagraph("He was taken to a hospital.", "او را به بیمارستان بردند."),
                    StoryParagraph("Natasha found him there.", "ناتاشا آنجا پیدایش کرد."),
                    StoryParagraph("She nursed him and asked for forgiveness.", "از او مراقبت کرد و طلب بخشش کرد."),
                    StoryParagraph("He forgave her and said he loved her.", "او بخشیدش و گفت دوستش دارد."),
                    StoryParagraph("He died in her arms peacefully.", "او در آغوشش آرام مرد."),
                    StoryParagraph("Pierre stayed in Moscow.", "پیر در مسکو ماند."),
                    StoryParagraph("He wanted to kill Napoleon.", "می‌خواست ناپلئون را بکشد."),
                    StoryParagraph("He was captured by the French.", "توسط فرانسوی‌ها اسیر شد."),
                    StoryParagraph("He suffered terribly in prison.", "در زندان به شدت رنج کشید."),
                    StoryParagraph("He met a peasant named Platon.", "با دهقانی به نام پلاتون آشنا شد."),
                    StoryParagraph("Platon taught him about simple happiness.", "پلاتون به او درباره خوشبختی ساده آموخت."),
                    StoryParagraph("Pierre learned to accept his fate.", "پیر یاد گرفت سرنوشتش را بپذیرد."),
                    StoryParagraph("He was freed when the French retreated.", "وقتی فرانسوی‌ها عقب‌نشینی کردند آزاد شد."),
                    StoryParagraph("He returned to Moscow and found Natasha.", "به مسکو برگشت و ناتاشا را یافت."),
                    StoryParagraph("They fell in love and married.", "عاشق شدند و ازدواج کردند."),
                    StoryParagraph("They lived a simple and happy life.", "زندگی ساده و خوشی داشتند."),
                    StoryParagraph("And so war ended and peace began.", "و اینگونه جنگ تمام شد و صلح آغاز شد.")
                )
            )
        )
    )

    // ─────────────── ۱۴: برادران کارامازوف ───────────────
    private fun story14() = StoryContent(
        storyId = "adv_karamazov",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Karamazov Family", titlePersian = "خانواده کارامازوف",
                paragraphs = listOf(
                    StoryParagraph("Fyodor Karamazov was a cruel and greedy man.", "فیودور کارامازوف مردی ظالم و حریص بود."),
                    StoryParagraph("He had three sons from two marriages.", "او از دو ازدواج سه پسر داشت."),
                    StoryParagraph("His first son was Dmitri.", "پسر اولش دمیتری بود."),
                    StoryParagraph("Dmitri was passionate and wild.", "دمیتری پرشور و وحشی بود."),
                    StoryParagraph("He was a soldier and a gambler.", "او سرباز و قمارباز بود."),
                    StoryParagraph("He loved a woman named Grushenka.", "زنی به نام گروشنکا را دوست داشت."),
                    StoryParagraph("His father also loved Grushenka.", "پدرش هم گروشنکا را دوست داشت."),
                    StoryParagraph("They fought over her constantly.", "بر سر او مدام می‌جنگیدند."),
                    StoryParagraph("The second son was Ivan.", "پسر دوم ایوان بود."),
                    StoryParagraph("Ivan was an intellectual and a philosopher.", "ایوان روشنفکر و فیلسوف بود."),
                    StoryParagraph("He questioned God and morality.", "او خدا و اخلاق را زیر سؤال می‌برد."),
                    StoryParagraph("He believed that everything was permitted.", "او معتقد بود همه چیز مجاز است."),
                    StoryParagraph("The third son was Alyosha.", "پسر سوم آلیوشا بود."),
                    StoryParagraph("Alyosha was kind and deeply religious.", "آلیوشا مهربان و عمیقاً مذهبی بود."),
                    StoryParagraph("He was a novice in a monastery.", "او مبتدی در صومعه بود."),
                    StoryParagraph("His elder was Father Zosima.", "مرشدش پدر زوسیما بود."),
                    StoryParagraph("Zosima was a wise and holy man.", "زوسیما مردی دانا و مقدس بود."),
                    StoryParagraph("People came to him for advice.", "مردم برای مشورت به او می‌آمدند."),
                    StoryParagraph("The family gathered at the monastery.", "خانواده در صومعه جمع شدند."),
                    StoryParagraph("They argued about money and Grushenka.", "درباره پول و گروشنکا بحث کردند."),
                    StoryParagraph("The meeting ended in anger.", "جلسه با خشم پایان یافت.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Grand Inquisitor", titlePersian = "بازپرس بزرگ",
                paragraphs = listOf(
                    StoryParagraph("Ivan wrote a poem called The Grand Inquisitor.", "ایوان شعری به نام بازپرس بزرگ نوشت."),
                    StoryParagraph("He told it to Alyosha in a cafe.", "آن را در کافه‌ای برای آلیوشا تعریف کرد."),
                    StoryParagraph("The poem was set in Spain during the Inquisition.", "شعر در اسپانیا در دوران تفتیش عقاید می‌گذشت."),
                    StoryParagraph("Jesus returned to Earth.", "عیسی به زمین بازگشت."),
                    StoryParagraph("He healed the sick and raised the dead.", "بیماران را شفا داد و مردگان را زنده کرد."),
                    StoryParagraph("The Grand Inquisitor arrested him.", "بازپرس بزرگ او را دستگیر کرد."),
                    StoryParagraph("He visited Jesus in his cell at night.", "شب در سلولش به دیدار عیسی رفت."),
                    StoryParagraph("He accused Jesus of giving humans too much freedom.", "او عیسی را متهم کرد که به انسان‌ها آزادی زیادی داده."),
                    StoryParagraph("He said people cannot handle freedom.", "گفت مردم نمی‌توانند آزادی را تحمل کنند."),
                    StoryParagraph("He said the Church had corrected Jesus's mistake.", "گفت کلیسا اشتباه عیسی را تصحیح کرده."),
                    StoryParagraph("The Church gave people security instead of freedom.", "کلیسا به جای آزادی، امنیت به مردم داد."),
                    StoryParagraph("Jesus listened in silence.", "عیسی در سکوت گوش داد."),
                    StoryParagraph("Then he kissed the old man on the lips.", "سپس پیرمرد را بر لب بوسید."),
                    StoryParagraph("The Inquisitor let him go.", "بازپرس او را آزاد کرد."),
                    StoryParagraph("He told him never to return.", "به او گفت هرگز برنگردد."),
                    StoryParagraph("Alyosha was moved by the poem.", "آلیوشا از شعر متأثر شد."),
                    StoryParagraph("He kissed Ivan on the lips.", "او ایوان را بر لب بوسید."),
                    StoryParagraph("It was a moment of love and understanding.", "لحظه‌ای از عشق و درک بود."),
                    StoryParagraph("But Ivan's soul was still troubled.", "اما روح ایوان هنوز پریشان بود."),
                    StoryParagraph("He could not accept God's world.", "او نمی‌توانست دنیای خدا را بپذیرد."),
                    StoryParagraph("He could not accept the suffering of children.", "نمی‌توانست رنج کودکان را بپذیرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Murder", titlePersian = "قتل",
                paragraphs = listOf(
                    StoryParagraph("Fyodor Karamazov was found dead.", "فیودور کارامازوف مرده پیدا شد."),
                    StoryParagraph("He had been hit on the head.", "به سرش ضربه خورده بود."),
                    StoryParagraph("His money was missing.", "پولش گم شده بود."),
                    StoryParagraph("Dmitri was arrested for the murder.", "دمیتری برای قتل دستگیر شد."),
                    StoryParagraph("He had been at the house that night.", "آن شب در خانه بود."),
                    StoryParagraph("He had blood on his hands.", "دست‌هایش خونی بود."),
                    StoryParagraph("He had taken the money.", "پول را برداشته بود."),
                    StoryParagraph("But he said he did not kill his father.", "اما گفت پدرش را نکشته."),
                    StoryParagraph("He said he only took the money.", "گفت فقط پول را برداشته."),
                    StoryParagraph("The real murderer was Smerdyakov.", "قاتل واقعی اسمردیاکوف بود."),
                    StoryParagraph("Smerdyakov was Fyodor's servant.", "اسمردیاکوف خدمتکار فیودور بود."),
                    StoryParagraph("He was also his illegitimate son.", "او پسر نامشروعش هم بود."),
                    StoryParagraph("He had epilepsy and was strange.", "صرع داشت و عجیب بود."),
                    StoryParagraph("Ivan had told him that everything was permitted.", "ایوان به او گفته بود همه چیز مجاز است."),
                    StoryParagraph("Smerdyakov took those words to heart.", "اسمردیاکوف آن حرف‌ها را جدی گرفت."),
                    StoryParagraph("He killed Fyodor and took the money.", "او فیودور را کشت و پول را برداشت."),
                    StoryParagraph("Then he pretended to be sick.", "بعد تظاهر به مریضی کرد."),
                    StoryParagraph("He confessed to Ivan later.", "بعداً به ایوان اعتراف کرد."),
                    StoryParagraph("Ivan was horrified by what he had caused.", "ایوان از آنچه باعث شده بود وحشت کرد."),
                    StoryParagraph("He realized his ideas had led to murder.", "فهمید ایده‌هایش به قتل انجامیده."),
                    StoryParagraph("Smerdyakov hanged himself.", "اسمردیاکوف خودش را حلق‌آویز کرد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Trial", titlePersian = "محاکمه",
                paragraphs = listOf(
                    StoryParagraph("The trial of Dmitri began.", "محاکمه دمیتری آغاز شد."),
                    StoryParagraph("The whole town attended.", "تمام شهر شرکت کردند."),
                    StoryParagraph("The lawyers argued for days.", "وکلای دادگستری روزها بحث کردند."),
                    StoryParagraph("The prosecutor said Dmitri was guilty.", "دادستان گفت دمیتری مجرم است."),
                    StoryParagraph("He said Dmitri was a violent man.", "گفت دمیتری مردی خشن است."),
                    StoryParagraph("He said he had killed his father for money.", "گفت پدرش را برای پول کشته."),
                    StoryParagraph("The defense lawyer said Dmitri was innocent.", "وکیل مدافع گفت دمیتری بی‌گناه است."),
                    StoryParagraph("He said the evidence was not clear.", "گفت شواهد روشن نیست."),
                    StoryParagraph("He said Dmitri was a victim of fate.", "گفت دمیتری قربانی سرنوشت است."),
                    StoryParagraph("Ivan testified at the trial.", "ایوان در محاکمه شهادت داد."),
                    StoryParagraph("He said Smerdyakov was the murderer.", "گفت اسمردیاکوف قاتل است."),
                    StoryParagraph("But he was confused and sick.", "اما گیج و مریض بود."),
                    StoryParagraph("The court did not believe him.", "دادگاه باورش نکرد."),
                    StoryParagraph("Dmitri was found guilty.", "دمیتری مجرم شناخته شد."),
                    StoryParagraph("He was sentenced to twenty years in Siberia.", "به بیست سال تبعید در سیبری محکوم شد."),
                    StoryParagraph("He accepted his fate calmly.", "سرنوشتش را آرام پذیرفت."),
                    StoryParagraph("He said he deserved to suffer.", "گفت سزاوار رنج است."),
                    StoryParagraph("He said suffering would purify his soul.", "گفت رنج روحش را پاک می‌کند."),
                    StoryParagraph("Alyosha believed in his brother's innocence.", "آلیوشا به بی‌گناهی برادرش اعتقاد داشت."),
                    StoryParagraph("He planned to help him escape.", "نقشه فرار او را کشید."),
                    StoryParagraph("But Dmitri refused to run away.", "اما دمیتری از فرار امتناع کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Boys and the Future", titlePersian = "پسرها و آینده",
                paragraphs = listOf(
                    StoryParagraph("Alyosha loved the children of the town.", "آلیوشا بچه‌های شهر را دوست داشت."),
                    StoryParagraph("He taught them and played with them.", "به آن‌ها آموزش می‌داد و با آن‌ها بازی می‌کرد."),
                    StoryParagraph("One boy named Kolya was very smart.", "پسری به نام کولیا خیلی باهوش بود."),
                    StoryParagraph("He was proud and stubborn.", "او مغرور و لجباز بود."),
                    StoryParagraph("But he loved Alyosha deeply.", "اما عمیقاً آلیوشا را دوست داشت."),
                    StoryParagraph("Another boy named Ilyusha was sick.", "پسری دیگر به نام ایلیوشا مریض بود."),
                    StoryParagraph("His father had been humiliated by Dmitri.", "پدرش توسط دمیتری تحقیر شده بود."),
                    StoryParagraph("The boy was heartbroken.", "پسر دلشکسته بود."),
                    StoryParagraph("He died of his illness.", "از بیماری‌اش مرد."),
                    StoryParagraph("All his friends mourned him.", "همه دوستانش عزادار شدند."),
                    StoryParagraph("Alyosha spoke at his funeral.", "آلیوشا در خاکسپاری‌اش صحبت کرد."),
                    StoryParagraph("He told the boys to remember Ilyusha.", "به پسرها گفت ایلیوشا را به یاد بیاورند."),
                    StoryParagraph("He told them to be kind and good.", "به آن‌ها گفت مهربان و خوب باشند."),
                    StoryParagraph("He told them to love each other.", "به آن‌ها گفت یکدیگر را دوست بدارند."),
                    StoryParagraph("He said a good memory lasts forever.", "گفت خاطره خوب برای همیشه می‌ماند."),
                    StoryParagraph("It can save a person from evil.", "می‌تواند فرد را از شر نجات دهد."),
                    StoryParagraph("The boys promised to remember.", "پسرها قول دادند به یاد بیاورند."),
                    StoryParagraph("They held hands and shouted with joy.", "دست هم را گرفتند و با شادی فریاد زدند."),
                    StoryParagraph("Alyosha was happy for the first time.", "آلیوشا برای اولین بار خوشحال شد."),
                    StoryParagraph("He believed in the future.", "او به آینده اعتقاد داشت."),
                    StoryParagraph("He believed in love and goodness.", "او به عشق و خوبی اعتقاد داشت.")
                )
            )
        )
    )

    // ─────────────── ۱۵: اولیس ───────────────
    private fun story15() = StoryContent(
        storyId = "adv_ulysses",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Tower", titlePersian = "برج",
                paragraphs = listOf(
                    StoryParagraph("It was June 16, 1904, in Dublin.", "۱۶ ژوئن ۱۹۰۴ در دوبلین بود."),
                    StoryParagraph("Stephen Dedalus woke up in a tower.", "استیون ددالوس در برجی بیدار شد."),
                    StoryParagraph("He lived with Buck Mulligan and Haines.", "او با باک مولگان و هینز زندگی می‌کرد."),
                    StoryParagraph("Mulligan was a medical student.", "مولگان دانشجوی پزشکی بود."),
                    StoryParagraph("He was loud and mocking.", "او پرصدا و تمسخرآمیز بود."),
                    StoryParagraph("Haines was an Englishman.", "هینز انگلیسی بود."),
                    StoryParagraph("He studied Irish culture.", "او فرهنگ ایرلندی را مطالعه می‌کرد."),
                    StoryParagraph("Stephen was a young teacher and writer.", "استیون معلم و نویسنده جوانی بود."),
                    StoryParagraph("He was troubled by his past.", "او از گذشته‌اش پریشان بود."),
                    StoryParagraph("His mother had died recently.", "مادرش اخیراً مرده بود."),
                    StoryParagraph("He had refused to pray at her deathbed.", "او در بستر مرگش از دعا خواندن امتناع کرده بود."),
                    StoryParagraph("He was full of guilt and grief.", "او پر از گناه و اندوه بود."),
                    StoryParagraph("The three men ate breakfast together.", "سه مرد با هم صبحانه خوردند."),
                    StoryParagraph("An old woman came to deliver milk.", "زنی پیر برای آوردن شیر آمد."),
                    StoryParagraph("She was a symbol of Ireland.", "او نمادی از ایرلند بود."),
                    StoryParagraph("Stephen left the tower in anger.", "استیون با خشم برج را ترک کرد."),
                    StoryParagraph("He decided not to return.", "تصمیم گرفت برنگردد."),
                    StoryParagraph("He walked along the beach and thought.", "او در ساحل قدم زد و فکر کرد."),
                    StoryParagraph("He thought about history and art.", "درباره تاریخ و هنر فکر کرد."),
                    StoryParagraph("He thought about his identity as an Irishman.", "درباره هویت خود به عنوان ایرلندی فکر کرد."),
                    StoryParagraph("He felt like an outsider everywhere.", "همه‌جا احساس غریبی می‌کرد.")
                )
            ),
            StoryChapter(
                number = 2, title = "Leopold Bloom", titlePersian = "لئوپولد بلوم",
                paragraphs = listOf(
                    StoryParagraph("Leopold Bloom was a middle-aged man.", "لئوپولد بلوم مردی میان‌سال بود."),
                    StoryParagraph("He was Jewish in a Catholic city.", "او در شهری کاتولیک یهودی بود."),
                    StoryParagraph("He worked as an advertising agent.", "او به عنوان تبلیغ‌کننده کار می‌کرد."),
                    StoryParagraph("He lived with his wife Molly.", "با همسرش مالی زندگی می‌کرد."),
                    StoryParagraph("Molly was a singer.", "مالی خواننده بود."),
                    StoryParagraph("She was unfaithful to him.", "او به بلوم خیانت می‌کرد."),
                    StoryParagraph("Bloom knew but did not say anything.", "بلوم می‌دانست اما چیزی نمی‌گفت."),
                    StoryParagraph("He loved her deeply.", "عمیقاً دوستش داشت."),
                    StoryParagraph("Their son Rudy had died as a baby.", "پسرشان رادی در نوزادی مرده بود."),
                    StoryParagraph("Bloom was haunted by the loss.", "بلوم از این فقدان رنج می‌برد."),
                    StoryParagraph("He wandered around Dublin all day.", "تمام روز در دوبلین سرگردان بود."),
                    StoryParagraph("He went to a funeral.", "به خاکسپاری رفت."),
                    StoryParagraph("He visited a newspaper office.", "به دفتر روزنامه‌ای سر زد."),
                    StoryParagraph("He walked along the river Liffey.", "کنار رود لیفی قدم زد."),
                    StoryParagraph("He met many people and had many thoughts.", "افراد زیادی را دید و افکار زیادی داشت."),
                    StoryParagraph("He thought about life and death.", "درباره زندگی و مرگ فکر کرد."),
                    StoryParagraph("He thought about love and betrayal.", "درباره عشق و خیانت فکر کرد."),
                    StoryParagraph("He thought about his identity as a Jew.", "درباره هویت خود به عنوان یهودی فکر کرد."),
                    StoryParagraph("He thought about his father who had died.", "درباره پدرش که مرده بود فکر کرد."),
                    StoryParagraph("He thought about his son who had died.", "درباره پسرش که مرده بود فکر کرد."),
                    StoryParagraph("He felt lonely and lost.", "احساس تنهایی و سرگشتگی کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Meeting", titlePersian = "ملاقات",
                paragraphs = listOf(
                    StoryParagraph("Bloom and Stephen met in the evening.", "بلوم و استیون عصر ملاقات کردند."),
                    StoryParagraph("They met at a maternity hospital.", "در بیمارستان زایمان ملاقات کردند."),
                    StoryParagraph("Bloom was checking on a friend.", "بلوم به دیدن دوستی رفته بود."),
                    StoryParagraph("Stephen was drinking with medical students.", "استیون با دانشجویان پزشکی مشروب می‌خورد."),
                    StoryParagraph("They talked about many things.", "درباره چیزهای زیادی صحبت کردند."),
                    StoryParagraph("They talked about Shakespeare.", "درباره شکسپیر صحبت کردند."),
                    StoryParagraph("They talked about Ireland.", "درباره ایرلند صحبت کردند."),
                    StoryParagraph("They talked about life and death.", "درباره زندگی و مرگ صحبت کردند."),
                    StoryParagraph("Bloom felt a connection to Stephen.", "بلوم به استیون احساس نزدیکی کرد."),
                    StoryParagraph("He saw him as a son.", "او را مثل پسر می‌دید."),
                    StoryParagraph("Stephen saw Bloom as a father figure.", "استیون بلوم را مثل پدر می‌دید."),
                    StoryParagraph("They went to a brothel together.", "با هم به فاحشه‌خانه رفتند."),
                    StoryParagraph("Stephen had strange visions.", "استیون رؤیاهای عجیبی دید."),
                    StoryParagraph("He saw his mother's ghost.", "روح مادرش را دید."),
                    StoryParagraph("He broke a chandelier in a rage.", "در خشم چلچراغی را شکست."),
                    StoryParagraph("Bloom saved him from the police.", "بلوم او را از پلیس نجات داد."),
                    StoryParagraph("They went to Bloom's house for coffee.", "برای قهوه به خانه بلوم رفتند."),
                    StoryParagraph("They talked about their lives.", "درباره زندگی‌شان صحبت کردند."),
                    StoryParagraph("They talked about their hopes and fears.", "درباره امیدها و ترس‌هایشان صحبت کردند."),
                    StoryParagraph("Stephen left at dawn.", "استیون هنگام سحر رفت."),
                    StoryParagraph("Bloom was alone again.", "بلوم دوباره تنها شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Stream of Consciousness", titlePersian = "جریان آگاهی",
                paragraphs = listOf(
                    StoryParagraph("The novel is written as a stream of consciousness.", "رمان به صورت جریان آگاهی نوشته شده."),
                    StoryParagraph("We see the thoughts of the characters directly.", "افکار شخصیت‌ها را مستقیم می‌بینیم."),
                    StoryParagraph("Bloom thinks about many things.", "بلوم درباره چیزهای زیادی فکر می‌کند."),
                    StoryParagraph("He thinks about soap and food.", "درباره صابون و غذا فکر می‌کند."),
                    StoryParagraph("He thinks about sex and love.", "درباره رابطه و عشق فکر می‌کند."),
                    StoryParagraph("He thinks about God and death.", "درباره خدا و مرگ فکر می‌کند."),
                    StoryParagraph("Stephen thinks about art and philosophy.", "استیون درباره هنر و فلسفه فکر می‌کند."),
                    StoryParagraph("He thinks about words and language.", "درباره کلمات و زبان فکر می‌کند."),
                    StoryParagraph("He thinks about history and memory.", "درباره تاریخ و حافظه فکر می‌کند."),
                    StoryParagraph("Molly thinks about her lovers.", "مالی درباره عاشقانش فکر می‌کند."),
                    StoryParagraph("She thinks about her husband.", "درباره شوهرش فکر می‌کند."),
                    StoryParagraph("She thinks about her children.", "درباره بچه‌هایش فکر می‌کند."),
                    StoryParagraph("She thinks about her past.", "درباره گذشته‌اش فکر می‌کند."),
                    StoryParagraph("The novel captures the chaos of the mind.", "رمان آشفتگی ذهن را ثبت می‌کند."),
                    StoryParagraph("It captures the beauty of the ordinary.", "زیبایی معمولی را ثبت می‌کند."),
                    StoryParagraph("It captures the wonder of everyday life.", "شگفتی زندگی روزمره را ثبت می‌کند."),
                    StoryParagraph("It captures the pain of being human.", "درد انسان بودن را ثبت می‌کند."),
                    StoryParagraph("It captures the joy of being alive.", "شادی زنده بودن را ثبت می‌کند."),
                    StoryParagraph("And it captures the mystery of love.", "و رمز و راز عشق را ثبت می‌کند."),
                    StoryParagraph("It is a celebration of life itself.", "این جشن خود زندگی است."),
                    StoryParagraph("It is a masterpiece of modern literature.", "شاهکاری از ادبیات مدرن است.")
                )
            ),
            StoryChapter(
                number = 5, title = "Molly's Soliloquy", titlePersian = "تک‌گویی مالی",
                paragraphs = listOf(
                    StoryParagraph("Molly Bloom lay in bed and thought.", "مالی بلوم در تخت دراز کشید و فکر کرد."),
                    StoryParagraph("She thought about her life.", "درباره زندگی‌اش فکر کرد."),
                    StoryParagraph("She thought about her childhood in Gibraltar.", "درباره کودکی‌اش در جبل‌طارق فکر کرد."),
                    StoryParagraph("She thought about her first love.", "درباره عشق اولش فکر کرد."),
                    StoryParagraph("She thought about her husband Bloom.", "درباره شوهرش بلوم فکر کرد."),
                    StoryParagraph("She thought about his kindness.", "درباره مهربانی‌اش فکر کرد."),
                    StoryParagraph("She thought about his patience.", "درباره صبرش فکر کرد."),
                    StoryParagraph("She knew he loved her more than anything.", "می‌دانست او را بیش از هر چیزی دوست دارد."),
                    StoryParagraph("She thought about her lovers.", "درباره عاشقانش فکر کرد."),
                    StoryParagraph("She thought about their passion.", "درباره شورشان فکر کرد."),
                    StoryParagraph("She thought about their selfishness.", "درباره خودخواهی‌شان فکر کرد."),
                    StoryParagraph("She thought about her daughter Milly.", "درباره دخترش میلی فکر کرد."),
                    StoryParagraph("She thought about her son Rudy.", "درباره پسرش رادی فکر کرد."),
                    StoryParagraph("She thought about his death.", "درباره مرگش فکر کرد."),
                    StoryParagraph("She thought about her own death.", "درباره مرگ خودش فکر کرد."),
                    StoryParagraph("She thought about God and nature.", "درباره خدا و طبیعت فکر کرد."),
                    StoryParagraph("She thought about the beauty of the world.", "درباره زیبایی جهان فکر کرد."),
                    StoryParagraph("She thought about the mystery of love.", "درباره رمز و راز عشق فکر کرد."),
                    StoryParagraph("Then she said yes to everything.", "بعد به همه چیز بله گفت."),
                    StoryParagraph("She said yes to life and death.", "به زندگی و مرگ بله گفت."),
                    StoryParagraph("She said yes to love and loss.", "به عشق و فقدان بله گفت."),
                    StoryParagraph("She said yes to being human.", "به انسان بودن بله گفت.")
                )
            )
        )
    )
}