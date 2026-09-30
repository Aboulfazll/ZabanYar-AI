package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۱۲ — داستان‌های کلاسیک
 *  ۳۴. موبی دیک
 *  ۳۵. ماجراهای تام سایر
 *  ۳۶. پیرمرد و دریا
 */
object Group12 {

    fun getAll(): List<StoryContent> = listOf(
        story34(),
        story35(),
        story36(),
    )

    // ─────────────── ۳۴: موبی دیک ───────────────
    private fun story34() = StoryContent(
        storyId = "int_moby_dick_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Whaling Ship", titlePersian = "کشتی صید نهنگ",
                paragraphs = listOf(
                    StoryParagraph("My name is Ishmael.", "اسم من ایشماعیل است."),
                    StoryParagraph("I wanted to go to sea.", "می‌خواستم به دریا بروم."),
                    StoryParagraph("I traveled to a town called New Bedford.", "به شهری به نام نیوبدفورد سفر کردم."),
                    StoryParagraph("I needed a job on a whaling ship.", "به کاری روی یک کشتی صید نهنگ نیاز داشتم."),
                    StoryParagraph("I went to an inn to sleep.", "به مسافرخانه‌ای رفتم تا بخوابم."),
                    StoryParagraph("The inn was full, so I shared a bed.", "مسافرخانه پر بود، پس تختم را شریک شدم."),
                    StoryParagraph("My roommate was a harpooner named Queequeg.", "هم‌اتاقی‌ام نیزه‌دارى به نام کوی‌کوئگ بود."),
                    StoryParagraph("He was from a faraway island.", "او از جزیره‌ای دور بود."),
                    StoryParagraph("At first, I was afraid of him.", "اول از او می‌ترسیدم."),
                    StoryParagraph("But he was kind and generous.", "اما او مهربان و بخشنده بود."),
                    StoryParagraph("We became good friends.", "ما دوستان خوبی شدیم."),
                    StoryParagraph("We decided to find a ship together.", "تصمیم گرفتیم با هم کشتی پیدا کنیم."),
                    StoryParagraph("We found a ship called the Pequod.", "کشتی‌ای به نام پکود پیدا کردیم."),
                    StoryParagraph("The ship looked old and dark.", "کشتی قدیمی و تاریک به نظر می‌رسید."),
                    StoryParagraph("The owner was a man named Peleg.", "صاحبش مردی به نام پلگ بود."),
                    StoryParagraph("He hired us both for the voyage.", "او هر دوی ما را برای سفر استخدام کرد."),
                    StoryParagraph("We signed the papers.", "ما کاغذها را امضا کردیم."),
                    StoryParagraph("We did not know where we were going.", "نمی‌دانستیم کجا می‌رویم."),
                    StoryParagraph("We only knew it was a long journey.", "فقط می‌دانستیم سفر طولانی است."),
                    StoryParagraph("We boarded the ship at night.", "شب سوار کشتی شدیم."),
                    StoryParagraph("The sea was calm and dark.", "دریا آرام و تاریک بود."),
                    StoryParagraph("I felt both excited and scared.", "هم هیجان‌زده و هم ترسیده بودم."),
                    StoryParagraph("I did not know what awaited us.", "نمی‌دانستم چه چیزی منتظرمان است."),
                    StoryParagraph("The journey had begun.", "سفر آغاز شده بود."),
                    StoryParagraph("And there was no turning back.", "و بازگشتی نبود.")
                )
            ),
            StoryChapter(
                number = 2, title = "Captain Ahab", titlePersian = "کاپیتان اهاب",
                paragraphs = listOf(
                    StoryParagraph("The next morning, we met the captain.", "صبح روز بعد، کاپیتان را دیدیم."),
                    StoryParagraph("His name was Ahab.", "اسمش اهاب بود."),
                    StoryParagraph("He had a wooden leg.", "او پایی چوبی داشت."),
                    StoryParagraph("He had lost his real leg in the sea.", "پای واقعی‌اش را در دریا از دست داده بود."),
                    StoryParagraph("A white whale had bitten it off.", "نهنگی سفید آن را کنده بود."),
                    StoryParagraph("The whale's name was Moby Dick.", "اسم نهنگ موبی دیک بود."),
                    StoryParagraph("Ahab hated that whale.", "اهاب از آن نهنگ متنفر بود."),
                    StoryParagraph("He wanted revenge.", "او انتقام می‌خواست."),
                    StoryParagraph("He told the crew about his plan.", "او نقشه‌اش را به خدمه گفت."),
                    StoryParagraph("He wanted to hunt Moby Dick.", "او می‌خواست موبی دیک را شکار کند."),
                    StoryParagraph("The crew was afraid.", "خدمه ترسیدند."),
                    StoryParagraph("But they agreed to help him.", "اما موافقت کردند کمکش کنند."),
                    StoryParagraph("Ahab offered gold to the first man who saw the whale.", "اهاب به اولین کسی که نهنگ را ببیند طلا پیشنهاد داد."),
                    StoryParagraph("The men became excited.", "مردان هیجان‌زده شدند."),
                    StoryParagraph("The ship left the harbor.", "کشتی بندر را ترک کرد."),
                    StoryParagraph("The journey was long and dangerous.", "سفر طولانی و خطرناک بود."),
                    StoryParagraph("We sailed across the Atlantic Ocean.", "ما از اقیانوس اطلس گذشتیم."),
                    StoryParagraph("We went around Africa.", "دور آفریقا چرخیدیم."),
                    StoryParagraph("We entered the Indian Ocean.", "وارد اقیانوس هند شدیم."),
                    StoryParagraph("The hunt for Moby Dick had begun.", "شکار موبی دیک آغاز شده بود."),
                    StoryParagraph("Ahab watched the sea every day.", "اهاب هر روز دریا را تماشا می‌کرد."),
                    StoryParagraph("He was always looking for the white whale.", "او همیشه دنبال نهنگ سفید بود."),
                    StoryParagraph("His obsession grew stronger.", "وسواسش قوی‌تر شد."),
                    StoryParagraph("The crew worried about him.", "خدمه نگرانش بودند."),
                    StoryParagraph("But no one could stop him.", "اما هیچ‌کس نمی‌توانست متوقفش کند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The First Whale", titlePersian = "اولین نهنگ",
                paragraphs = listOf(
                    StoryParagraph("One day, a sailor saw a whale.", "یک روز، ملوانی نهنگی دید."),
                    StoryParagraph("Everyone ran to the boats.", "همه به قایق‌ها دویدند."),
                    StoryParagraph("We rowed toward the whale.", "به سمت نهنگ پارو زدیم."),
                    StoryParagraph("Queequeg threw his harpoon.", "کوی‌کوئگ نیزه‌اش را پرتاب کرد."),
                    StoryParagraph("He hit the whale.", "او به نهنگ زد."),
                    StoryParagraph("The whale pulled the boat.", "نهنگ قایق را کشید."),
                    StoryParagraph("It was a dangerous ride.", "سواری خطرناکی بود."),
                    StoryParagraph("Finally, the whale became tired.", "بالاخره، نهنگ خسته شد."),
                    StoryParagraph("We killed it and tied it to the ship.", "ما آن را کشتیم و به کشتی بستیم."),
                    StoryParagraph("We got oil from its body.", "ما از بدنش روغن گرفتیم."),
                    StoryParagraph("This was our first catch.", "این اولین شکار ما بود."),
                    StoryParagraph("But Ahab was not happy.", "اما اهاب خوشحال نبود."),
                    StoryParagraph("He only wanted Moby Dick.", "او فقط موبی دیک را می‌خواست."),
                    StoryParagraph("We met other ships on the sea.", "کشتی‌های دیگر را در دریا ملاقات کردیم."),
                    StoryParagraph("They told us about the white whale.", "آن‌ها درباره نهنگ سفید به ما گفتند."),
                    StoryParagraph("Some had seen it.", "بعضی‌ها آن را دیده بودند."),
                    StoryParagraph("The whale was huge and fierce.", "نهنگ عظیم و وحشی بود."),
                    StoryParagraph("It had destroyed many boats.", "بسیاری از قایق‌ها را نابود کرده بود."),
                    StoryParagraph("Ahab became more determined.", "اهاب مصمم‌تر شد."),
                    StoryParagraph("He would not stop until he found it.", "تا پیدایش نکند دست نمی‌کشید."),
                    StoryParagraph("The crew was tired and scared.", "خدمه خسته و ترسیده بودند."),
                    StoryParagraph("But they had no choice.", "اما چاره‌ای نداشتند."),
                    StoryParagraph("They had to follow their captain.", "آن‌ها باید از کاپیتانشان پیروی می‌کردند."),
                    StoryParagraph("The sea was endless.", "دریا بی‌پایان بود."),
                    StoryParagraph("And so was Ahab's anger.", "و خشم اهاب هم همینطور.")
                )
            ),
            StoryChapter(
                number = 4, title = "The White Whale", titlePersian = "نهنگ سفید",
                paragraphs = listOf(
                    StoryParagraph("Months passed on the sea.", "ماه‌ها در دریا گذشت."),
                    StoryParagraph("One day, a lookout shouted.", "یک روز، دیده‌بان فریاد زد."),
                    StoryParagraph("He had seen the white whale.", "او نهنگ سفید را دیده بود."),
                    StoryParagraph("Everyone ran to the deck.", "همه به عرشه دویدند."),
                    StoryParagraph("Moby Dick was swimming in the distance.", "موبی دیک در دوردست شنا می‌کرد."),
                    StoryParagraph("It was enormous and white.", "عظیم و سفید بود."),
                    StoryParagraph("Ahab's eyes burned with hate.", "چشمان اهاب از نفرت می‌سوخت."),
                    StoryParagraph("He ordered the boats to launch.", "او دستور داد قایق‌ها به آب انداخته شوند."),
                    StoryParagraph("The men rowed fast.", "مردان سریع پارو زدند."),
                    StoryParagraph("The whale turned toward them.", "نهنگ به سمتشان چرخید."),
                    StoryParagraph("It hit the first boat.", "به قایق اول زد."),
                    StoryParagraph("The boat broke into pieces.", "قایق تکه‌تکه شد."),
                    StoryParagraph("Men fell into the water.", "مردان در آب افتادند."),
                    StoryParagraph("The whale attacked the second boat.", "نهنگ به قایق دوم حمله کرد."),
                    StoryParagraph("It was too strong for us.", "برای ما خیلی قوی بود."),
                    StoryParagraph("Ahab threw his harpoon.", "اهاب نیزه‌اش را پرتاب کرد."),
                    StoryParagraph("It hit the whale, but did not kill it.", "به نهنگ خورد، اما نکشتش."),
                    StoryParagraph("The whale swam away.", "نهنگ دور شد."),
                    StoryParagraph("The next day, we found it again.", "روز بعد، دوباره پیدایش کردیم."),
                    StoryParagraph("It attacked the boats with great force.", "با نیروی زیاد به قایق‌ها حمله کرد."),
                    StoryParagraph("Ahab's boat was the last one.", "قایق اهاب آخرین بود."),
                    StoryParagraph("He threw his harpoon one final time.", "او یک بار آخر نیزه‌اش را پرتاب کرد."),
                    StoryParagraph("The harpoon stuck in the whale.", "نیزه در نهنگ فرو رفت."),
                    StoryParagraph("But the whale turned and hit the ship.", "اما نهنگ چرخید و به کشتی زد."),
                    StoryParagraph("The Pequod began to sink.", "پکود شروع به غرق شدن کرد.")
                )
            )
        )
    )

    // ─────────────── ۳۵: ماجراهای تام سایر ───────────────
    private fun story35() = StoryContent(
        storyId = "int_tom_sawyer_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Naughty Boy", titlePersian = "پسر شیطون",
                paragraphs = listOf(
                    StoryParagraph("Tom Sawyer was a young boy.", "تام سایر پسر جوانی بود."),
                    StoryParagraph("He lived with his Aunt Polly.", "او با خاله‌اش پالی زندگی می‌کرد."),
                    StoryParagraph("His parents had died.", "والدینش مرده بودند."),
                    StoryParagraph("Tom was very naughty.", "تام خیلی شیطون بود."),
                    StoryParagraph("He hated school and rules.", "از مدرسه و قوانین متنفر بود."),
                    StoryParagraph("He loved adventures.", "عاشق ماجراجویی بود."),
                    StoryParagraph("One day, Aunt Polly punished him.", "یک روز، خاله پالی مجازاتش کرد."),
                    StoryParagraph("She made him paint a fence.", "او را وادار کرد حصاری را رنگ کند."),
                    StoryParagraph("The fence was very long.", "حصار خیلی طولانی بود."),
                    StoryParagraph("Tom did not want to work.", "تام نمی‌خواست کار کند."),
                    StoryParagraph("He had a clever idea.", "او ایده باهوشی داشت."),
                    StoryParagraph("When a boy came by, Tom pretended to enjoy painting.", "وقتی پسری رد شد، تام تظاهر کرد از رنگ کردن لذت می‌برد."),
                    StoryParagraph("The boy wanted to try it too.", "پسر هم می‌خواست امتحان کند."),
                    StoryParagraph("Tom let him paint for a price.", "تام اجازه داد در ازای قیمتی رنگ کند."),
                    StoryParagraph("Soon, many boys were paying Tom.", "به زودی، پسران زیادی به تام پول می‌دادند."),
                    StoryParagraph("They painted the fence for him.", "آن‌ها حصار را برایش رنگ کردند."),
                    StoryParagraph("Tom became rich with toys and sweets.", "تام با اسباب‌بازی و شیرینی ثروتمند شد."),
                    StoryParagraph("Aunt Polly was surprised.", "خاله پالی شگفت‌زده شد."),
                    StoryParagraph("She thought Tom had worked hard.", "او فکر کرد تام سخت کار کرده."),
                    StoryParagraph("But Tom had just been clever.", "اما تام فقط باهوش بود."),
                    StoryParagraph("Tom liked to skip school.", "تام دوست داشت مدرسه را فرار کند."),
                    StoryParagraph("He played with his friends all day.", "او تمام روز با دوستانش بازی می‌کرد."),
                    StoryParagraph("He was the leader of the boys.", "او رهبر پسرها بود."),
                    StoryParagraph("Everyone admired his tricks.", "همه حقه‌هایش را تحسین می‌کردند."),
                    StoryParagraph("But Tom was also kind.", "اما تام مهربان هم بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Graveyard", titlePersian = "قبرستان",
                paragraphs = listOf(
                    StoryParagraph("One night, Tom went to the graveyard.", "یک شب، تام به قبرستان رفت."),
                    StoryParagraph("His friend Huck Finn went with him.", "دوستش هاک فین با او رفت."),
                    StoryParagraph("They wanted to see ghosts.", "آن‌ها می‌خواستند ارواح ببینند."),
                    StoryParagraph("Instead, they saw three men.", "در عوض، سه مرد دیدند."),
                    StoryParagraph("One was Muff Potter.", "یکی ماف پاتر بود."),
                    StoryParagraph("One was Injun Joe.", "یکی اینجان جو بود."),
                    StoryParagraph("The third was Dr. Robinson.", "سومی دکتر رابینسون بود."),
                    StoryParagraph("The men were digging up a grave.", "مردان قبری را می‌کندند."),
                    StoryParagraph("They began to fight.", "آن‌ها شروع به دعوا کردند."),
                    StoryParagraph("Injun Joe attacked the doctor.", "اینجان جو به دکتر حمله کرد."),
                    StoryParagraph("He killed him with a knife.", "او را با چاقو کشت."),
                    StoryParagraph("Muff Potter was drunk.", "ماف پاتر مست بود."),
                    StoryParagraph("He did not know what happened.", "او نمی‌دانست چه شد."),
                    StoryParagraph("Injun Joe put the knife in his hand.", "اینجان جو چاقو را در دستش گذاشت."),
                    StoryParagraph("He blamed Muff Potter.", "او ماف پاتر را متهم کرد."),
                    StoryParagraph("Tom and Huck were terrified.", "تام و هاک وحشت کردند."),
                    StoryParagraph("They ran away quietly.", "آن‌ها آرام فرار کردند."),
                    StoryParagraph("They promised to keep the secret.", "قول دادند راز را نگه دارند."),
                    StoryParagraph("But Tom felt very guilty.", "اما تام خیلی احساس گناه می‌کرد."),
                    StoryParagraph("An innocent man was in jail.", "مرد بی‌گناهی در زندان بود."),
                    StoryParagraph("Muff Potter was put on trial.", "ماف پاتر محاکمه شد."),
                    StoryParagraph("Everyone thought he was guilty.", "همه فکر می‌کردند او مجرم است."),
                    StoryParagraph("He would be hanged.", "او اعدام می‌شد."),
                    StoryParagraph("Tom could not let that happen.", "تام نمی‌توانست اجازه دهد این اتفاق بیفتد."),
                    StoryParagraph("He went to the judge.", "او نزد قاضی رفت.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Trial", titlePersian = "محاکمه",
                paragraphs = listOf(
                    StoryParagraph("Tom told the whole truth.", "تام تمام حقیقت را گفت."),
                    StoryParagraph("He said Injun Joe was the killer.", "او گفت اینجان جو قاتل است."),
                    StoryParagraph("The courtroom was shocked.", "دادگاه شوکه شد."),
                    StoryParagraph("Injun Joe jumped out the window.", "اینجان جو از پنجره بیرون پرید."),
                    StoryParagraph("He escaped from the town.", "او از شهر فرار کرد."),
                    StoryParagraph("Muff Potter was set free.", "ماف پاتر آزاد شد."),
                    StoryParagraph("He thanked Tom with tears.", "او با گریه از تام تشکر کرد."),
                    StoryParagraph("Tom became a hero.", "تام قهرمان شد."),
                    StoryParagraph("But he was afraid of Injun Joe.", "اما او از اینجان جو می‌ترسید."),
                    StoryParagraph("Injun Joe wanted revenge.", "اینجان جو انتقام می‌خواست."),
                    StoryParagraph("Tom could not feel safe.", "تام نمی‌توانست احساس امنیت کند."),
                    StoryParagraph("He always looked behind him.", "او همیشه پشت سرش را نگاه می‌کرد."),
                    StoryParagraph("Days passed slowly.", "روزها کند می‌گذشتند."),
                    StoryParagraph("Tom tried to forget his fear.", "تام تلاش کرد ترسش را فراموش کند."),
                    StoryParagraph("But danger was still near.", "اما خطر هنوز نزدیک بود."),
                    StoryParagraph("Tom and Huck decided to find treasure.", "تام و هاک تصمیم گرفتند گنج پیدا کنند."),
                    StoryParagraph("They heard about a hidden box of gold.", "آن‌ها درباره جعبه طلای پنهانی شنیدند."),
                    StoryParagraph("It was buried near an old house.", "نزدیک خانه‌ای قدیمی دفن شده بود."),
                    StoryParagraph("One night, they went to the house.", "یک شب، به خانه رفتند."),
                    StoryParagraph("Suddenly, they heard voices.", "ناگهان، صداهایی شنیدند."),
                    StoryParagraph("It was Injun Joe and his friend.", "اینجان جو و دوستش بودند."),
                    StoryParagraph("They were also looking for treasure.", "آن‌ها هم دنبال گنج بودند."),
                    StoryParagraph("Tom and Huck hid upstairs.", "تام و هاک در طبقه بالا پنهان شدند."),
                    StoryParagraph("They were too scared to move.", "آن‌ها خیلی ترسیده بودند که حرکت کنند."),
                    StoryParagraph("Finally, the men left.", "بالاخره، مردها رفتند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Treasure", titlePersian = "گنج",
                paragraphs = listOf(
                    StoryParagraph("Tom and Huck found the treasure later.", "تام و هاک بعداً گنج را پیدا کردند."),
                    StoryParagraph("It was in a cave.", "آن در غاری بود."),
                    StoryParagraph("Injun Joe was hiding there too.", "اینجان جو هم آنجا پنهان شده بود."),
                    StoryParagraph("He died in the cave.", "او در غار مرد."),
                    StoryParagraph("The boys took the gold home.", "پسرها طلا را به خانه بردند."),
                    StoryParagraph("They became rich.", "آن‌ها ثروتمند شدند."),
                    StoryParagraph("Aunt Polly was very proud.", "خاله پالی خیلی افتخار می‌کرد."),
                    StoryParagraph("Huck went to live with a widow.", "هاک رفت با بیوه‌ای زندگی کند."),
                    StoryParagraph("But he did not like it.", "اما آن را دوست نداشت."),
                    StoryParagraph("He wanted to be free.", "او می‌خواست آزاد باشد."),
                    StoryParagraph("Tom convinced him to stay.", "تام متقاعدش کرد بماند."),
                    StoryParagraph("They promised to be friends forever.", "آن‌ها قول دادند برای همیشه دوست بمانند."),
                    StoryParagraph("Tom and Huck had many more adventures.", "تام و هاک ماجراهای بیشتری داشتند."),
                    StoryParagraph("They were the best of friends.", "آن‌ها بهترین دوستان بودند."),
                    StoryParagraph("The village remembered them forever.", "دهکده آن‌ها را برای همیشه به یاد آورد."),
                    StoryParagraph("Tom Sawyer was a legend.", "تام سایر یک افسانه بود."),
                    StoryParagraph("His story was told for generations.", "داستانش برای نسل‌ها گفته شد."),
                    StoryParagraph("He was a boy full of life.", "او پسری پر از زندگی بود."),
                    StoryParagraph("He was brave and clever.", "او شجاع و باهوش بود."),
                    StoryParagraph("He loved his friends deeply.", "او دوستانش را عمیقاً دوست داشت."),
                    StoryParagraph("His adventures never ended.", "ماجراهایش هرگز تمام نشد."),
                    StoryParagraph("And his spirit lived on.", "و روحش زنده ماند."),
                    StoryParagraph("The end of one story.", "پایان یک داستان."),
                    StoryParagraph("But the beginning of many more.", "اما آغاز بسیاری دیگر."),
                    StoryParagraph("Tom Sawyer would always be remembered.", "تام سایر همیشه به یاد می‌ماند.")
                )
            )
        )
    )

    // ─────────────── ۳۶: پیرمرد و دریا ───────────────
    private fun story36() = StoryContent(
        storyId = "int_old_man_sea_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Old Fisherman", titlePersian = "ماهیگیر پیر",
                paragraphs = listOf(
                    StoryParagraph("Santiago was an old fisherman.", "سانتیاگو ماهیگیر پیری بود."),
                    StoryParagraph("He lived in a small hut near the sea.", "او در کلبه‌ای کوچک نزدیک دریا زندگی می‌کرد."),
                    StoryParagraph("He had no wife and no children.", "او زن و فرزندی نداشت."),
                    StoryParagraph("He fished alone in his small boat.", "او تنها در قایق کوچکش ماهیگیری می‌کرد."),
                    StoryParagraph("He had not caught a fish for 84 days.", "او ۸۴ روز بود که ماهی نگرفته بود."),
                    StoryParagraph("The other fishermen laughed at him.", "ماهیگیران دیگر به او می‌خندیدند."),
                    StoryParagraph("They called him unlucky.", "او را بدشانس می‌نامیدند."),
                    StoryParagraph("But Santiago did not give up.", "اما سانتیاگو تسلیم نشد."),
                    StoryParagraph("He had a young friend named Manolin.", "او دوست جوانی به نام مانولین داشت."),
                    StoryParagraph("Manolin helped him every day.", "مانولین هر روز کمکش می‌کرد."),
                    StoryParagraph("He brought him food and water.", "او برایش غذا و آب می‌آورد."),
                    StoryParagraph("They talked about baseball.", "آن‌ها درباره بیسبال صحبت می‌کردند."),
                    StoryParagraph("Santiago loved the game.", "سانتیاگو عاشق این بازی بود."),
                    StoryParagraph("Manolin's parents did not want him to fish with Santiago.", "والدین مانولین نمی‌خواستند او با سانتیاگو ماهیگیری کند."),
                    StoryParagraph("They thought Santiago was unlucky.", "آن‌ها فکر می‌کردند سانتیاگو بدشانس است."),
                    StoryParagraph("But Manolin still loved the old man.", "اما مانولین هنوز پیرمرد را دوست داشت."),
                    StoryParagraph("One morning, Santiago decided to go far out.", "یک صبح، سانتیاگو تصمیم گرفت دور برود."),
                    StoryParagraph("He wanted to catch a big fish.", "او می‌خواست ماهی بزرگی بگیرد."),
                    StoryParagraph("He sailed into the deep sea.", "او به دریای عمیق رفت."),
                    StoryParagraph("The sun was hot and the sea was calm.", "خورشید داغ بود و دریا آرام."),
                    StoryParagraph("He waited patiently.", "او صبورانه منتظر ماند."),
                    StoryParagraph("Then, something pulled the line.", "بعد، چیزی نخ را کشید."),
                    StoryParagraph("It was a huge fish.", "ماهی عظیمی بود."),
                    StoryParagraph("The battle had begun.", "نبرد آغاز شده بود."),
                    StoryParagraph("Santiago held the line tight.", "سانتیاگو نخ را محکم نگه داشت.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Great Fish", titlePersian = "ماهی بزرگ",
                paragraphs = listOf(
                    StoryParagraph("The fish pulled the boat for hours.", "ماهی ساعت‌ها قایق را کشید."),
                    StoryParagraph("Santiago's hands were bleeding.", "دست‌های سانتیاگو خونریزی می‌کرد."),
                    StoryParagraph("But he did not let go.", "اما رهایش نکرد."),
                    StoryParagraph("The fish was a giant marlin.", "ماهی یک نیزه‌ماهی غول‌پیکر بود."),
                    StoryParagraph("It was longer than the boat.", "از قایق بلندتر بود."),
                    StoryParagraph("Santiago admired the fish.", "سانتیاگو ماهی را تحسین کرد."),
                    StoryParagraph("He called it his brother.", "او آن را برادرش نامید."),
                    StoryParagraph("Night came and the fish still pulled.", "شب آمد و ماهی هنوز می‌کشید."),
                    StoryParagraph("Santiago was exhausted.", "سانتیاگو خسته شده بود."),
                    StoryParagraph("But he held on.", "اما محکم نگه داشت."),
                    StoryParagraph("He talked to the fish.", "او با ماهی صحبت کرد."),
                    StoryParagraph("He said he would never give up.", "او گفت هرگز تسلیم نمی‌شود."),
                    StoryParagraph("The next day, the fish jumped.", "روز بعد، ماهی پرید."),
                    StoryParagraph("It was beautiful and powerful.", "زیبا و قدرتمند بود."),
                    StoryParagraph("Santiago saw its size.", "سانتیاگو اندازه‌اش را دید."),
                    StoryParagraph("He knew he had to be strong.", "او می‌دانست باید قوی باشد."),
                    StoryParagraph("His back hurt terribly.", "کمرش به شدت درد می‌کرد."),
                    StoryParagraph("His hands were cut and swollen.", "دست‌هایش بریده و ورم کرده بود."),
                    StoryParagraph("But he did not sleep.", "اما نخوابید."),
                    StoryParagraph("He ate raw fish to keep his strength.", "او ماهی خام خورد تا قدرتش را حفظ کند."),
                    StoryParagraph("He remembered his youth.", "او جوانی‌اش را به یاد آورد."),
                    StoryParagraph("He had been a strong man.", "او مرد قدرتمندی بود."),
                    StoryParagraph("Now he was old but still brave.", "حالا پیر بود اما هنوز شجاع."),
                    StoryParagraph("The fish was also tired.", "ماهی هم خسته بود."),
                    StoryParagraph("It began to circle the boat.", "دور قایق شروع به چرخیدن کرد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Kill", titlePersian = "کشتن ماهی",
                paragraphs = listOf(
                    StoryParagraph("The fish circled the boat many times.", "ماهی بارها دور قایق چرخید."),
                    StoryParagraph("Santiago pulled the line with all his strength.", "سانتیاگو با تمام قدرتش نخ را کشید."),
                    StoryParagraph("He brought the fish closer.", "او ماهی را نزدیک‌تر آورد."),
                    StoryParagraph("He raised his harpoon.", "او نیزه‌اش را بالا برد."),
                    StoryParagraph("He struck the fish in the heart.", "او به قلب ماهی زد."),
                    StoryParagraph("The fish jumped one last time.", "ماهی یک بار آخر پرید."),
                    StoryParagraph("Then it was still.", "بعد ساکن شد."),
                    StoryParagraph("Santiago had killed the great fish.", "سانتیاگو ماهی بزرگ را کشته بود."),
                    StoryParagraph("He tied it to the side of the boat.", "او آن را به کنار قایق بست."),
                    StoryParagraph("It was too big to put inside.", "برای گذاشتن داخل خیلی بزرگ بود."),
                    StoryParagraph("He began to sail home.", "او شروع به بازگشت کرد."),
                    StoryParagraph("But the fish left a trail of blood.", "اما ماهی دنباله‌ای از خون گذاشت."),
                    StoryParagraph("Sharks smelled the blood.", "کوسه‌ها بوی خون را حس کردند."),
                    StoryParagraph("The first shark came quickly.", "اولین کوسه سریع آمد."),
                    StoryParagraph("It took a big bite.", "تکه بزرگی خورد."),
                    StoryParagraph("Santiago fought the shark.", "سانتیاگو با کوسه جنگید."),
                    StoryParagraph("He killed it with his harpoon.", "او با نیزه‌اش کشتش."),
                    StoryParagraph("But more sharks came.", "اما کوسه‌های بیشتری آمدند."),
                    StoryParagraph("He made a new weapon from his knife.", "او از چاقویش سلاح جدیدی ساخت."),
                    StoryParagraph("He fought them all night.", "او تمام شب با آن‌ها جنگید."),
                    StoryParagraph("The sharks ate the fish.", "کوسه‌ها ماهی را خوردند."),
                    StoryParagraph("By morning, only bones were left.", "تا صبح، فقط استخوان‌ها ماندند."),
                    StoryParagraph("Santiago was sad and tired.", "سانتیاگو غمگین و خسته بود."),
                    StoryParagraph("He had lost the fish.", "او ماهی را از دست داده بود."),
                    StoryParagraph("But he had not lost his pride.", "اما غرورش را از دست نداده بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Return", titlePersian = "بازگشت",
                paragraphs = listOf(
                    StoryParagraph("Santiago returned to the harbor.", "سانتیاگو به بندر برگشت."),
                    StoryParagraph("The other fishermen were waiting.", "ماهیگیران دیگر منتظر بودند."),
                    StoryParagraph("They saw the giant skeleton.", "آن‌ها اسکلت غول‌پیکر را دیدند."),
                    StoryParagraph("They were amazed.", "آن‌ها شگفت‌زده شدند."),
                    StoryParagraph("The fish was 18 feet long.", "ماهی ۱۸ فوت طول داشت."),
                    StoryParagraph("No one had ever seen such a fish.", "هیچ‌کس هرگز چنین ماهی‌ای ندیده بود."),
                    StoryParagraph("Santiago went home and slept.", "سانتیاگو به خانه رفت و خوابید."),
                    StoryParagraph("He dreamed of lions on a beach.", "او در خواب شیرهایی روی ساحل دید."),
                    StoryParagraph("Manolin found him in the morning.", "مانولین صبح پیدایش کرد."),
                    StoryParagraph("He cried when he saw the old man's hands.", "او وقتی دست‌های پیرمرد را دید گریه کرد."),
                    StoryParagraph("He brought him coffee and food.", "او برایش قهوه و غذا آورد."),
                    StoryParagraph("Santiago was happy to see him.", "سانتیاگو از دیدنش خوشحال شد."),
                    StoryParagraph("Manolin said he would fish with him again.", "مانولین گفت دوباره با او ماهیگیری می‌کند."),
                    StoryParagraph("Santiago smiled.", "سانتیاگو لبخند زد."),
                    StoryParagraph("He had not caught the fish completely.", "او ماهی را کامل نگرفته بود."),
                    StoryParagraph("But he had won a greater victory.", "اما پیروزی بزرگتری کسب کرده بود."),
                    StoryParagraph("He had proven his courage.", "او شجاعتش را ثابت کرده بود."),
                    StoryParagraph("The other fishermen respected him now.", "ماهیگیران دیگر حالا به او احترام می‌گذاشتند."),
                    StoryParagraph("He was no longer unlucky.", "او دیگر بدشانس نبود."),
                    StoryParagraph("He was a hero.", "او یک قهرمان بود."),
                    StoryParagraph("Manolin promised to learn from him.", "مانولین قول داد از او یاد بگیرد."),
                    StoryParagraph("The old man had taught him everything.", "پیرمرد همه چیز را به او آموخته بود."),
                    StoryParagraph("Courage and patience.", "شجاعت و صبر."),
                    StoryParagraph("That was the true treasure.", "این گنج واقعی بود."),
                    StoryParagraph("And Santiago slept peacefully.", "و سانتیاگو آرام خوابید.")
                )
            )
        )
    )
}