package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group8 — ۵ افسانه معروف
 * هر داستان: ۷ فصل × ۱۰ خط = ۷۰ خط
 * با ترجمه فارسی
 *
 *  ۳۶. سه خوک کوچک
 *  ۳۷. شنل قرمزی
 *  ۳۸. گربه چکمه‌پوش
 *  ۳۹. شاهزاده خانم و نخود
 *  ۴۰. بند انگشتی
 */
object Group8 {

    fun getAll(): List<StoryContent> = listOf(
        story36(), story37(), story38(), story39(), story40()
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۶: سه خوک کوچک
    // ═══════════════════════════════════════════════════════
    private fun story36() = StoryContent(
        storyId = "three_little_pigs",
        chapters = listOf(
            StoryChapter(1, "Three Brothers", "سه برادر", listOf(
                StoryParagraph("Three little pigs lived with their mother.", "سه خوک کوچک با مادرشان زندگی می‌کردند."),
                StoryParagraph("One day, their mother sent them away.", "یک روز، مادرشان فرستادشان بروند."),
                StoryParagraph("She said they were old enough to build homes.", "او گفت به اندازه کافی بزرگ شده‌اند خانه بسازند."),
                StoryParagraph("The first pig was lazy.", "خوک اول تنبل بود."),
                StoryParagraph("The second pig was a little smarter.", "خوک دوم کمی باهوش‌تر بود."),
                StoryParagraph("The third pig was very hardworking.", "خوک سوم خیلی سخت‌کوش بود."),
                StoryParagraph("They said goodbye to their mother.", "آن‌ها از مادرشان خداحافظی کردند."),
                StoryParagraph("They walked down the road together.", "آن‌ها با هم در جاده راه رفتند."),
                StoryParagraph("Soon, they found a good place to build.", "به‌زودی، جای خوبی برای ساختن پیدا کردند."),
                StoryParagraph("Each pig started his own house.", "هر خوک خانه خودش را شروع کرد.")
            )),
            StoryChapter(2, "The Straw House", "خانه کاه", listOf(
                StoryParagraph("The first pig built a house of straw.", "خوک اول خانه‌ای از کاه ساخت."),
                StoryParagraph("It was quick and easy to build.", "ساختنش سریع و راحت بود."),
                StoryParagraph("He finished it in one day.", "او در یک روز تمامش کرد."),
                StoryParagraph("Then he sat down to rest.", "بعد نشست تا استراحت کند."),
                StoryParagraph("A wolf saw the house from the forest.", "گرگی خانه را از جنگل دید."),
                StoryParagraph("The wolf was very hungry.", "گرگ خیلی گرسنه بود."),
                StoryParagraph("He walked to the house slowly.", "آرام به سمت خانه رفت."),
                StoryParagraph("He knocked on the door.", "به در زد."),
                StoryParagraph("He said: Little pig, let me come in!", "او گفت: خوک کوچک، بگذار بیایم داخل!"),
                StoryParagraph("The pig said: Not by the hair of my chinny chin chin!", "خوک گفت: نه به موی چانه‌ام!")
            )),
            StoryChapter(3, "The Wolf and the Straw", "گرگ و کاه", listOf(
                StoryParagraph("The wolf became angry.", "گرگ عصبانی شد."),
                StoryParagraph("He said he would huff and puff.", "او گفت فوت می‌کند و پف می‌کند."),
                StoryParagraph("He would blow the house down.", "خانه را فرو می‌ریزد."),
                StoryParagraph("He took a deep breath.", "نفس عمیقی کشید."),
                StoryParagraph("He blew with all his might.", "با تمام قدرتش فوت کرد."),
                StoryParagraph("The straw house fell down.", "خانه کاه فرو ریخت."),
                StoryParagraph("The first pig ran to his brother's house.", "خوک اول به خانه برادرش دوید."),
                StoryParagraph("He was very scared.", "او خیلی ترسیده بود."),
                StoryParagraph("The wolf followed him.", "گرگ دنبالش کرد."),
                StoryParagraph("He was still hungry.", "او هنوز گرسنه بود.")
            )),
            StoryChapter(4, "The Wooden House", "خانه چوبی", listOf(
                StoryParagraph("The second pig had built a wooden house.", "خوک دوم خانه‌ای چوبی ساخته بود."),
                StoryParagraph("It was stronger than straw.", "از کاه محکم‌تر بود."),
                StoryParagraph("The two pigs hid inside.", "دو خوک داخل پنهان شدند."),
                StoryParagraph("The wolf knocked on the door.", "گرگ به در زد."),
                StoryParagraph("He said: Little pigs, let me come in!", "او گفت: خوک‌های کوچک، بگذارید بیایم داخل!"),
                StoryParagraph("The pigs said no.", "خوک‌ها گفتند نه."),
                StoryParagraph("The wolf huffed and puffed.", "گرگ فوت و پف کرد."),
                StoryParagraph("He blew the wooden house down.", "خانه چوبی را فرو ریخت."),
                StoryParagraph("The pigs ran to the third brother's house.", "خوک‌ها به خانه برادر سوم دویدند."),
                StoryParagraph("They were out of breath.", "آن‌ها نفس‌نفس می‌زدند.")
            )),
            StoryChapter(5, "The Brick House", "خانه آجری", listOf(
                StoryParagraph("The third pig had built a brick house.", "خوک سوم خانه‌ای آجری ساخته بود."),
                StoryParagraph("It took him many weeks to build.", "هفته‌ها طول کشید تا بسازدش."),
                StoryParagraph("It was strong and safe.", "محکم و امن بود."),
                StoryParagraph("The three pigs hid inside.", "سه خوک داخل پنهان شدند."),
                StoryParagraph("The wolf came to the door.", "گرگ دم در آمد."),
                StoryParagraph("He knocked and called out.", "در زد و صدا زد."),
                StoryParagraph("He said: Little pigs, let me come in!", "او گفت: خوک‌های کوچک، بگذارید بیایم داخل!"),
                StoryParagraph("The pigs said no again.", "خوک‌ها دوباره گفتند نه."),
                StoryParagraph("The wolf huffed and puffed.", "گرگ فوت و پف کرد."),
                StoryParagraph("But the brick house did not fall.", "اما خانه آجری فرو نریخت.")
            )),
            StoryChapter(6, "The Chimney", "دودکش", listOf(
                StoryParagraph("The wolf was very angry.", "گرگ خیلی عصبانی شد."),
                StoryParagraph("He tried again and again.", "بارها و بارها تلاش کرد."),
                StoryParagraph("But the brick house was too strong.", "اما خانه آجری خیلی محکم بود."),
                StoryParagraph("Then he had an idea.", "بعد ایده‌ای داشت."),
                StoryParagraph("He climbed onto the roof.", "او از پشت‌بام بالا رفت."),
                StoryParagraph("He planned to come down the chimney.", "نقشه داشت از دودکش پایین بیاید."),
                StoryParagraph("The third pig was very clever.", "خوک سوم خیلی باهوش بود."),
                StoryParagraph("He had a pot of boiling water.", "قابلمه‌ای آب جوش داشت."),
                StoryParagraph("He put it under the chimney.", "آن را زیر دودکش گذاشت."),
                StoryParagraph("The wolf fell into the hot water.", "گرگ در آب جوش افتاد.")
            )),
            StoryChapter(7, "The Happy Ending", "پایان خوش", listOf(
                StoryParagraph("The wolf ran away screaming.", "گرگ جیغ‌زنان فرار کرد."),
                StoryParagraph("He never came back again.", "هرگز دوباره برنگشت."),
                StoryParagraph("The three pigs were safe.", "سه خوک در امان بودند."),
                StoryParagraph("They thanked the third pig.", "از خوک سوم تشکر کردند."),
                StoryParagraph("They learned a good lesson.", "درسی خوب یاد گرفتند."),
                StoryParagraph("Hard work is always best.", "سخت‌کوشی همیشه بهترین است."),
                StoryParagraph("Shortcuts do not last long.", "راه‌های میان‌بر دوام نمی‌آورند."),
                StoryParagraph("They built new houses of brick.", "آن‌ها خانه‌های جدید آجری ساختند."),
                StoryParagraph("They lived together happily.", "با هم خوشحال زندگی کردند."),
                StoryParagraph("And the mother pig was proud.", "و مادر خوک افتخار می‌کرد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۷: شنل قرمزی
    // ═══════════════════════════════════════════════════════
    private fun story37() = StoryContent(
        storyId = "red_riding_hood",
        chapters = listOf(
            StoryChapter(1, "The Red Cape", "شنل قرمز", listOf(
                StoryParagraph("A girl lived with her mother in a village.", "دختری با مادرش در دهکده‌ای زندگی می‌کرد."),
                StoryParagraph("Her grandmother had made her a red cape.", "مادربزرگش شنل قرمزی برایش دوخته بود."),
                StoryParagraph("She wore it every day.", "هر روز می‌پوشیدش."),
                StoryParagraph("Everyone called her Little Red Riding Hood.", "همه او را شنل قرمزی کوچک صدا می‌زدند."),
                StoryParagraph("One day, her mother called her.", "یک روز، مادرش صدایش زد."),
                StoryParagraph("Grandmother was sick.", "مادربزرگ مریض بود."),
                StoryParagraph("She had to take her food and medicine.", "باید برایش غذا و دارو می‌برد."),
                StoryParagraph("The girl promised to be careful.", "دختر قول داد محتاط باشد."),
                StoryParagraph("She took the basket and left.", "سبد را برداشت و رفت."),
                StoryParagraph("The forest was dark and deep.", "جنگل تاریک و عمیق بود.")
            )),
            StoryChapter(2, "The Wolf in the Woods", "گرگ در جنگل", listOf(
                StoryParagraph("On the way, she met a wolf.", "در راه، گرگی ملاقات کرد."),
                StoryParagraph("The wolf was polite and friendly.", "گرگ مؤدب و دوستانه بود."),
                StoryParagraph("He asked where she was going.", "پرسید کجا می‌رود."),
                StoryParagraph("She told him about her sick grandmother.", "درباره مادربزرگ مریضش به او گفت."),
                StoryParagraph("The wolf asked where she lived.", "گرگ پرسید کجا زندگی می‌کند."),
                StoryParagraph("She told him the house in the woods.", "خانه در جنگل را گفت."),
                StoryParagraph("The wolf had a plan in his mind.", "گرگ نقشه‌ای در ذهن داشت."),
                StoryParagraph("He said goodbye and ran ahead.", "خداحافظی کرد و جلوتر دوید."),
                StoryParagraph("He reached grandmother's house first.", "اول به خانه مادربزرگ رسید."),
                StoryParagraph("He knocked on the door.", "به در زد.")
            )),
            StoryChapter(3, "The Wolf's Trick", "ترفند گرگ", listOf(
                StoryParagraph("Grandmother asked who was there.", "مادربزرگ پرسید کیست."),
                StoryParagraph("The wolf said it was Little Red Riding Hood.", "گرگ گفت شنل قرمزی کوچک است."),
                StoryParagraph("Grandmother opened the door.", "مادربزرگ در را باز کرد."),
                StoryParagraph("The wolf jumped inside quickly.", "گرگ سریع داخل پرید."),
                StoryParagraph("He locked grandmother in the closet.", "مادربزرگ را در گنجه حبس کرد."),
                StoryParagraph("Then he put on her clothes.", "بعد لباس‌هایش را پوشید."),
                StoryParagraph("He put on her nightcap.", "کلاه شبش را پوشید."),
                StoryParagraph("He got into her bed.", "به تختش رفت."),
                StoryParagraph("He pulled the covers up high.", "پتو را بالا کشید."),
                StoryParagraph("Then he waited for the girl.", "بعد منتظر دختر ماند.")
            )),
            StoryChapter(4, "The Strange Grandmother", "مادربزرگ عجیب", listOf(
                StoryParagraph("Little Red Riding Hood arrived at the house.", "شنل قرمزی کوچک به خانه رسید."),
                StoryParagraph("She knocked on the door.", "به در زد."),
                StoryParagraph("A strange voice said: Come in.", "صدای عجیبی گفت: بیا داخل."),
                StoryParagraph("She walked to the bed slowly.", "آرام به سمت تخت رفت."),
                StoryParagraph("Grandmother looked very strange.", "مادربزرگ خیلی عجیب به نظر می‌رسید."),
                StoryParagraph("Her ears were very big.", "گوش‌هایش خیلی بزرگ بودند."),
                StoryParagraph("Her eyes were very large.", "چشم‌هایش خیلی درشت بودند."),
                StoryParagraph("Her hands were very big.", "دست‌هایش خیلی بزرگ بودند."),
                StoryParagraph("Her mouth was huge.", "دهانش عظیم بود."),
                StoryParagraph("The girl became afraid.", "دختر ترسید.")
            )),
            StoryChapter(5, "The Rescue", "نجات", listOf(
                StoryParagraph("The wolf jumped out of the bed.", "گرگ از تخت بیرون پرید."),
                StoryParagraph("He tried to catch the girl.", "تلاش کرد دختر را بگیرد."),
                StoryParagraph("She screamed as loud as she could.", "هر چه می‌توانست فریاد زد."),
                StoryParagraph("A woodcutter was nearby.", "هیزم‌شکنی نزدیک بود."),
                StoryParagraph("He heard her screams and ran to help.", "فریادش را شنید و برای کمک دوید."),
                StoryParagraph("He hit the wolf with his axe.", "با تبرش به گرگ زد."),
                StoryParagraph("The wolf ran away into the forest.", "گرگ به جنگل فرار کرد."),
                StoryParagraph("The woodcutter saved the girl.", "هیزم‌شکن دختر را نجات داد."),
                StoryParagraph("He opened the closet door.", "در گنجه را باز کرد."),
                StoryParagraph("Grandmother was safe inside.", "مادربزرگ داخل در امان بود.")
            )),
            StoryChapter(6, "A Safe Return Home", "بازگشت امن", listOf(
                StoryParagraph("Grandmother hugged the girl tightly.", "مادربزرگ دختر را محکم در آغوش گرفت."),
                StoryParagraph("She was very happy to see her.", "از دیدنش خیلی خوشحال شد."),
                StoryParagraph("They ate the food from the basket.", "غذای سبد را خوردند."),
                StoryParagraph("The woodcutter stayed for tea.", "هیزم‌شکن برای چای ماند."),
                StoryParagraph("They all talked about the adventure.", "همه درباره ماجرا صحبت کردند."),
                StoryParagraph("The girl learned a lesson.", "دختر درسی آموخت."),
                StoryParagraph("Never talk to strangers.", "هرگز با غریبه‌ها صحبت نکن."),
                StoryParagraph("She promised to be more careful.", "قول داد محتاط‌تر باشد."),
                StoryParagraph("Grandmother got better quickly.", "مادربزرگ سریع بهتر شد."),
                StoryParagraph("And they lived in peace.", "و در آرامش زندگی کردند.")
            )),
            StoryChapter(7, "The Lesson", "درس", listOf(
                StoryParagraph("Little Red Riding Hood went home.", "شنل قرمزی کوچک به خانه رفت."),
                StoryParagraph("She told her mother everything.", "همه چیز را به مادرش گفت."),
                StoryParagraph("Her mother was very proud.", "مادرش خیلی افتخار کرد."),
                StoryParagraph("The girl learned to obey her mother.", "دختر یاد گرفت از مادرش اطاعت کند."),
                StoryParagraph("She never talked to strangers again.", "هرگز دوباره با غریبه‌ها صحبت نکرد."),
                StoryParagraph("The villagers were told the story.", "داستان به روستاییان گفته شد."),
                StoryParagraph("It became a warning for children.", "تبدیل به هشداری برای بچه‌ها شد."),
                StoryParagraph("She kept her red cape always.", "شنل قرمزش را همیشه نگه داشت."),
                StoryParagraph("It reminded her of that day.", "آن روز را به یادش می‌آورد."),
                StoryParagraph("And so her story lives on.", "و اینگونه داستانش ادامه می‌یابد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۸: گربه چکمه‌پوش
    // ═══════════════════════════════════════════════════════
    private fun story38() = StoryContent(
        storyId = "puss_in_boots",
        chapters = listOf(
            StoryChapter(1, "The Youngest Son", "پسر کوچک", listOf(
                StoryParagraph("A miller had three sons.", "آسیابانی سه پسر داشت."),
                StoryParagraph("When he died, he left them his things.", "وقتی مرد، چیزهایش را برایشان گذاشت."),
                StoryParagraph("The oldest son got the mill.", "پسر بزرگتر آسیاب را گرفت."),
                StoryParagraph("The second son got the donkey.", "پسر دوم خر را گرفت."),
                StoryParagraph("The youngest son got only the cat.", "پسر کوچک فقط گربه را گرفت."),
                StoryParagraph("He was very disappointed.", "او خیلی ناامید شد."),
                StoryParagraph("But the cat spoke to him.", "اما گربه با او صحبت کرد."),
                StoryParagraph("The cat promised to help him.", "گربه قول داد کمکش کند."),
                StoryParagraph("It asked for a pair of boots.", "درخواست یک جفت چکمه کرد."),
                StoryParagraph("The boy bought the boots for the cat.", "پسر چکمه‌ها را برای گربه خرید.")
            )),
            StoryChapter(2, "The Clever Plan", "نقشه هوشمندانه", listOf(
                StoryParagraph("The cat put on his new boots.", "گربه چکمه‌های جدیدش را پوشید."),
                StoryParagraph("He took a bag and went to the fields.", "کیسه‌ای برداشت و به مزارع رفت."),
                StoryParagraph("He caught many rabbits in the bag.", "خرگوش‌های زیادی در کیسه گرفت."),
                StoryParagraph("He took them to the king's palace.", "آن‌ها را به قصر پادشاه برد."),
                StoryParagraph("He said they were a gift from his master.", "گفت هدیه‌ای از اربابش هستند."),
                StoryParagraph("His master was the Marquis of Carabas.", "اربابش مارکی کاراباس بود."),
                StoryParagraph("The king was very pleased.", "پادشاه خیلی راضی شد."),
                StoryParagraph("The cat brought gifts every week.", "گربه هر هفته هدیه می‌آورد."),
                StoryParagraph("The king began to like the marquis.", "پادشاه شروع کرد به دوست داشتن مارکی."),
                StoryParagraph("The cat had a bigger plan.", "گربه نقشه بزرگ‌تری داشت.")
            )),
            StoryChapter(3, "The River Plan", "نقشه رودخانه", listOf(
                StoryParagraph("The cat told his master to swim in the river.", "گربه به اربابش گفت در رودخانه شنا کند."),
                StoryParagraph("The young man did not understand.", "مرد جوان نفهمید."),
                StoryParagraph("But he trusted the cat.", "اما به گربه اعتماد کرد."),
                StoryParagraph("He went into the river.", "داخل رودخانه رفت."),
                StoryParagraph("The cat hid his clothes.", "گربه لباس‌هایش را پنهان کرد."),
                StoryParagraph("Then he called for help.", "بعد برای کمک فریاد زد."),
                StoryParagraph("The king's carriage was passing by.", "کالسکه پادشاه داشت می‌گذشت."),
                StoryParagraph("The king saw the young man in the river.", "پادشاه مرد جوان را در رودخانه دید."),
                StoryParagraph("He gave him rich clothes.", "لباس‌های غنی به او داد."),
                StoryParagraph("The young man looked like a marquis.", "مرد جوان شبیه مارکی به نظر می‌رسید.")
            )),
            StoryChapter(4, "The Ogre's Castle", "قلعه دیو", listOf(
                StoryParagraph("The cat ran ahead of the carriage.", "گربه جلوتر از کالسکه دوید."),
                StoryParagraph("He came to a great castle.", "به قلعه‌ای بزرگ رسید."),
                StoryParagraph("An ogre lived in the castle.", "دیوی در قلعه زندگی می‌کرد."),
                StoryParagraph("The ogre could change into any animal.", "دیو می‌توانست به هر حیوانی تبدیل شود."),
                StoryParagraph("The cat went to see the ogre.", "گربه به دیدن دیو رفت."),
                StoryParagraph("He asked if the ogre could become a lion.", "پرسید آیا دیو می‌تواند شیر شود."),
                StoryParagraph("The ogre became a fierce lion.", "دیو شیری خشمگین شد."),
                StoryParagraph("The cat asked if he could become a mouse.", "گربه پرسید آیا می‌تواند موش شود."),
                StoryParagraph("The ogre became a tiny mouse.", "دیو موش کوچکی شد."),
                StoryParagraph("The cat caught and ate him.", "گربه گرفتش و خوردش.")
            )),
            StoryChapter(5, "The Marquis's Feast", "جشن مارکی", listOf(
                StoryParagraph("The carriage arrived at the castle.", "کالسکه به قلعه رسید."),
                StoryParagraph("The cat welcomed them at the door.", "گربه دم در استقبالشان کرد."),
                StoryParagraph("He said the castle belonged to the marquis.", "گفت قلعه به مارکی تعلق دارد."),
                StoryParagraph("The king was very impressed.", "پادشاه خیلی تحت تأثیر قرار گرفت."),
                StoryParagraph("He had never seen such a beautiful place.", "هرگز چنین جای زیبایی ندیده بود."),
                StoryParagraph("They had a great feast in the hall.", "آن‌ها ضیافت بزرگی در تالار داشتند."),
                StoryParagraph("There was music and dancing.", "موسیقی و رقص بود."),
                StoryParagraph("The king's daughter was with them.", "دختر پادشاه با آن‌ها بود."),
                StoryParagraph("She was very beautiful.", "او خیلی زیبا بود."),
                StoryParagraph("The young marquis fell in love with her.", "مارکی جوان عاشقش شد.")
            )),
            StoryChapter(6, "The Royal Wedding", "عروسی سلطنتی", listOf(
                StoryParagraph("The king spoke to the young man.", "پادشاه با مرد جوان صحبت کرد."),
                StoryParagraph("He asked him to marry his daughter.", "از او خواست با دخترش ازدواج کند."),
                StoryParagraph("The young man agreed happily.", "مرد جوان با خوشحالی موافقت کرد."),
                StoryParagraph("The princess also loved him.", "شاهزاده‌خانم هم دوستش داشت."),
                StoryParagraph("They had a great wedding.", "آن‌ها عروسی بزرگی داشتند."),
                StoryParagraph("People came from all over the kingdom.", "مردم از همه‌جای پادشاهی آمدند."),
                StoryParagraph("The cat sat at the head of the table.", "گربه در سر میز نشست."),
                StoryParagraph("He was the hero of the day.", "او قهرمان آن روز بود."),
                StoryParagraph("He wore his boots proudly.", "او با افتخار چکمه‌هایش را پوشید."),
                StoryParagraph("The young man became a prince.", "مرد جوان شاهزاده شد.")
            )),
            StoryChapter(7, "The Happy Ending", "پایان خوش", listOf(
                StoryParagraph("The young prince was rich and happy.", "شاهزاده جوان ثروتمند و خوشحال بود."),
                StoryParagraph("He never forgot his clever cat.", "هرگز گربه باهوشش را فراموش نکرد."),
                StoryParagraph("The cat lived in the palace with him.", "گربه با او در قصر زندگی کرد."),
                StoryParagraph("He was treated like a nobleman.", "با او مثل یک نجیب‌زاده رفتار می‌شد."),
                StoryParagraph("He ate the best food every day.", "هر روز بهترین غذا را می‌خورد."),
                StoryParagraph("The old mill was given to his brothers.", "آسیاب قدیمی به برادرانش داده شد."),
                StoryParagraph("Everyone in the family was happy.", "همه در خانواده خوشحال بودند."),
                StoryParagraph("And the cat was the happiest of all.", "و گربه از همه خوشحال‌تر بود."),
                StoryParagraph("He had earned his place in the palace.", "جایش را در قصر به دست آورده بود."),
                StoryParagraph("And so the story ended with joy.", "و اینگونه داستان با شادی پایان یافت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۳۹: شاهزاده خانم و نخود
    // ═══════════════════════════════════════════════════════
    private fun story39() = StoryContent(
        storyId = "princess_and_pea",
        chapters = listOf(
            StoryChapter(1, "The Lonely Prince", "شاهزاده تنها", listOf(
                StoryParagraph("A prince wanted to marry a princess.", "شاهزاده‌ای می‌خواست با شاهزاده‌خانمی ازدواج کند."),
                StoryParagraph("But she had to be a real princess.", "اما باید شاهزاده‌خانم واقعی می‌بود."),
                StoryParagraph("He traveled the world to find one.", "او دنیا را گشت تا یکی پیدا کند."),
                StoryParagraph("He met many princesses.", "با شاهزاده‌خانم‌های زیادی ملاقات کرد."),
                StoryParagraph("But he was never sure about them.", "اما هرگز مطمئن نبود درباره‌شان."),
                StoryParagraph("Some were not real princesses.", "بعضی‌ها شاهزاده‌خانم واقعی نبودند."),
                StoryParagraph("He came home sadly.", "غمگین به خانه برگشت."),
                StoryParagraph("His mother the queen was worried.", "مادرش ملکه نگران بود."),
                StoryParagraph("She wanted him to be happy.", "می‌خواست خوشحالش کند."),
                StoryParagraph("One stormy night, someone knocked.", "یک شب طوفانی، کسی در زد.")
            )),
            StoryChapter(2, "The Wet Girl", "دختر خیس", listOf(
                StoryParagraph("A young girl stood at the door.", "دختر جوانی دم در ایستاده بود."),
                StoryParagraph("The rain was pouring down.", "باران شدید می‌بارید."),
                StoryParagraph("Her clothes were soaked.", "لباس‌هایش خیس بودند."),
                StoryParagraph("Water dripped from her hair.", "آب از موهایش می‌چکید."),
                StoryParagraph("She said she was a real princess.", "او گفت شاهزاده‌خانم واقعی است."),
                StoryParagraph("The queen looked at her carefully.", "ملکه با دقت نگاهش کرد."),
                StoryParagraph("She had a plan to test the girl.", "نقشه‌ای برای آزمایش دختر داشت."),
                StoryParagraph("She said the girl could stay for the night.", "گفت دختر می‌تواند شب بماند."),
                StoryParagraph("The girl was very grateful.", "دختر خیلی سپاسگزار بود."),
                StoryParagraph("She did not know about the test.", "از آزمایش خبر نداشت.")
            )),
            StoryChapter(3, "The Secret Test", "آزمایش مخفی", listOf(
                StoryParagraph("The queen went to the guest room.", "ملکه به اتاق مهمان رفت."),
                StoryParagraph("She took all the sheets off the bed.", "همه ملافه‌ها را از تخت برداشت."),
                StoryParagraph("She put a small pea on the mattress.", "نخودی کوچک روی تشک گذاشت."),
                StoryParagraph("Then she put twenty mattresses on top.", "بعد بیست تشک رویش گذاشت."),
                StoryParagraph("Then twenty more on top of those.", "بیست تای دیگر هم روی آن‌ها."),
                StoryParagraph("The bed was very tall.", "تخت خیلی بلند شده بود."),
                StoryParagraph("The princess had to climb a ladder.", "شاهزاده‌خانم مجبور شد از نردبان بالا برود."),
                StoryParagraph("She lay down on the soft mattresses.", "روی تشک‌های نرم دراز کشید."),
                StoryParagraph("She said goodnight to the queen.", "به ملکه شب‌بخیر گفت."),
                StoryParagraph("The queen smiled and left.", "ملکه لبخند زد و رفت.")
            )),
            StoryChapter(4, "A Terrible Night", "شبی وحشتناک", listOf(
                StoryParagraph("The princess could not sleep.", "شاهزاده‌خانم نمی‌توانست بخوابد."),
                StoryParagraph("Something was bothering her back.", "چیزی پشتش را اذیت می‌کرد."),
                StoryParagraph("She turned from side to side.", "از این پهلو به آن پهلو می‌چرخید."),
                StoryParagraph("She felt a hard lump under her.", "زیر خودش برجستگی سختی حس می‌کرد."),
                StoryParagraph("It was very uncomfortable.", "خیلی ناراحت‌کننده بود."),
                StoryParagraph("She could not find a soft spot.", "نمی‌توانست جای نرمی پیدا کند."),
                StoryParagraph("She stayed awake all night.", "تمام شب بیدار ماند."),
                StoryParagraph("Her back began to hurt badly.", "پشتش شروع کرد به درد شدید."),
                StoryParagraph("She felt bruised all over.", "همه‌جایش کبود حس می‌کرد."),
                StoryParagraph("She was very tired by morning.", "صبح خیلی خسته بود.")
            )),
            StoryChapter(5, "The Real Princess", "شاهزاده‌خانم واقعی", listOf(
                StoryParagraph("In the morning, the queen asked her.", "صبح، ملکه از او پرسید."),
                StoryParagraph("How did you sleep, my dear?", "چطور خوابیدی عزیزم؟"),
                StoryParagraph("The princess said she did not sleep.", "شاهزاده‌خانم گفت نخوابید."),
                StoryParagraph("She said she felt something hard.", "گفت چیزی سخت حس کرد."),
                StoryParagraph("She had bruises all over her body.", "تمام بدنش کبود شده بود."),
                StoryParagraph("The queen was amazed.", "ملکه شگفت‌زده شد."),
                StoryParagraph("Only a real princess could feel the pea.", "فقط شاهزاده‌خانم واقعی می‌توانست نخود را حس کند."),
                StoryParagraph("No one else was so sensitive.", "هیچ‌کس اینقدر حساس نبود."),
                StoryParagraph("The prince was very happy.", "شاهزاده خیلی خوشحال شد."),
                StoryParagraph("He had found his real princess.", "شاهزاده‌خانم واقعی‌اش را پیدا کرده بود.")
            )),
            StoryChapter(6, "The Wedding", "عروسی", listOf(
                StoryParagraph("The prince asked her to marry him.", "شاهزاده از او خواست با او ازدواج کند."),
                StoryParagraph("She said yes with joy.", "او با خوشحالی بله گفت."),
                StoryParagraph("The kingdom celebrated for days.", "پادشاهی روزها جشن گرفت."),
                StoryParagraph("People came from everywhere.", "مردم از همه‌جا آمدند."),
                StoryParagraph("The queen told everyone the story.", "ملکه داستان را به همه گفت."),
                StoryParagraph("They all admired the clever test.", "همه آزمایش هوشمندانه را تحسین کردند."),
                StoryParagraph("The pea was put in a museum.", "نخود در موزه‌ای گذاشته شد."),
                StoryParagraph("People came to see it.", "مردم برای دیدنش می‌آمدند."),
                StoryParagraph("It became a famous story in the kingdom.", "تبدیل به داستان معروفی در پادشاهی شد."),
                StoryParagraph("The princess laughed about it often.", "شاهزاده‌خانم اغلب درباره‌اش می‌خندید.")
            )),
            StoryChapter(7, "Happily Ever After", "خوشبختی همیشگی", listOf(
                StoryParagraph("The prince and princess lived in the palace.", "شاهزاده و شاهزاده‌خانم در قصر زندگی کردند."),
                StoryParagraph("They loved each other deeply.", "آن‌ها عمیقاً یکدیگر را دوست داشتند."),
                StoryParagraph("The princess was kind to everyone.", "شاهزاده‌خانم با همه مهربان بود."),
                StoryParagraph("She helped the poor and the sick.", "به فقرا و بیماران کمک می‌کرد."),
                StoryParagraph("The kingdom became rich and happy.", "پادشاهی ثروتمند و خوشحال شد."),
                StoryParagraph("She had many children.", "فرزندان زیادی داشت."),
                StoryParagraph("They all heard the story of the pea.", "همه‌شان داستان نخود را شنیدند."),
                StoryParagraph("The family laughed about it together.", "خانواده با هم درباره‌اش می‌خندیدند."),
                StoryParagraph("And they lived happily ever after.", "و تا همیشه خوشحال زندگی کردند."),
                StoryParagraph("And so the story was told forever.", "و اینگونه داستان برای همیشه گفته شد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۰: بند انگشتی
    // ═══════════════════════════════════════════════════════
    private fun story40() = StoryContent(
        storyId = "thumbelina",
        chapters = listOf(
            StoryChapter(1, "The Tiny Girl", "دختر کوچک", listOf(
                StoryParagraph("A woman wanted a tiny child.", "زنی بچه‌ای بسیار کوچک می‌خواست."),
                StoryParagraph("She asked a witch for help.", "از جادوگری کمک خواست."),
                StoryParagraph("The witch gave her a magic seed.", "جادوگر بذر جادویی به او داد."),
                StoryParagraph("She planted it in a flower pot.", "آن را در گلدانی کاشت."),
                StoryParagraph("A beautiful flower grew the next day.", "روز بعد گل زیبایی رشد کرد."),
                StoryParagraph("Inside was a tiny girl.", "داخلش دختر کوچکی بود."),
                StoryParagraph("She was only as tall as a thumb.", "او فقط به اندازه یک شست قد داشت."),
                StoryParagraph("She was named Thumbelina.", "او را بند انگشتی نامیدند."),
                StoryParagraph("She slept in a walnut shell.", "او در پوست گردویی می‌خوابید."),
                StoryParagraph("She was happy and safe.", "خوشحال و در امان بود.")
            )),
            StoryChapter(2, "The Toad", "وزغ", listOf(
                StoryParagraph("One night, a toad came to the window.", "یک شب، وزغی به پنجره آمد."),
                StoryParagraph("He saw Thumbelina sleeping.", "بند انگشتی را در خواب دید."),
                StoryParagraph("He wanted her to marry his son.", "می‌خواست با پسرش ازدواج کند."),
                StoryParagraph("He took her to the river.", "او را به رودخانه برد."),
                StoryParagraph("He put her on a lily pad.", "روی برگ نیلوفری گذاشتش."),
                StoryParagraph("Thumbelina woke up and cried.", "بند انگشتی بیدار شد و گریه کرد."),
                StoryParagraph("She was trapped on the lily pad.", "روی برگ نیلوفر اسیر شده بود."),
                StoryParagraph("Fish felt sorry for her.", "ماهی‌ها برایش دلسوزی کردند."),
                StoryParagraph("They bit the stem of the leaf.", "ساقه برگ را جویدند."),
                StoryParagraph("The leaf floated down the river.", "برگ در رودخانه شناور شد.")
            )),
            StoryChapter(3, "The Butterfly", "پروانه", listOf(
                StoryParagraph("A butterfly saw Thumbelina on the leaf.", "پروانه‌ای بند انگشتی را روی برگ دید."),
                StoryParagraph("It liked her very much.", "خیلی دوستش داشت."),
                StoryParagraph("It tied a string to the leaf.", "رشته‌ای به برگ بست."),
                StoryParagraph("It pulled the leaf to shore.", "برگ را به ساحل کشید."),
                StoryParagraph("Thumbelina was safe on land.", "بند انگشتی روی خشکی در امان بود."),
                StoryParagraph("But the butterfly flew away.", "اما پروانه پرواز کرد."),
                StoryParagraph("She walked through the fields alone.", "تنها از میان مزارع گذشت."),
                StoryParagraph("She was cold and hungry.", "سرد و گرسنه بود."),
                StoryParagraph("She found a field of flowers.", "مزرعه‌ای از گل‌ها پیدا کرد."),
                StoryParagraph("She made a home there.", "آنجا خانه‌ای ساخت.")
            )),
            StoryChapter(4, "The Winter", "زمستان", listOf(
                StoryParagraph("Winter came and the flowers died.", "زمستان آمد و گل‌ها مردند."),
                StoryParagraph("Thumbelina was cold and sad.", "بند انگشتی سرد و غمگین شد."),
                StoryParagraph("She walked through the snow.", "در برف راه رفت."),
                StoryParagraph("She came to a field mouse's house.", "به خانه موش صحرایی رسید."),
                StoryParagraph("The mouse was kind and gave her shelter.", "موش مهربان بود و پناهش داد."),
                StoryParagraph("She lived with the mouse all winter.", "تمام زمستان با موش زندگی کرد."),
                StoryParagraph("The mouse taught her many things.", "موش چیزهای زیادی یادش داد."),
                StoryParagraph("Thumbelina worked hard for the mouse.", "بند انگشتی سخت برای موش کار می‌کرد."),
                StoryParagraph("She cooked and cleaned every day.", "هر روز آشپزی و نظافت می‌کرد."),
                StoryParagraph("But she was not truly happy.", "اما واقعاً خوشحال نبود.")
            )),
            StoryChapter(5, "The Mole", "موش کور", listOf(
                StoryParagraph("A rich mole lived nearby.", "موش کوری ثروتمند نزدیک زندگی می‌کرد."),
                StoryParagraph("He wanted to marry Thumbelina.", "می‌خواست با بند انگشتی ازدواج کند."),
                StoryParagraph("The field mouse thought it was a good match.", "موش صحرایی فکر کرد همسری خوب است."),
                StoryParagraph("The mole took her to his underground home.", "موش کور او را به خانه زیرزمینی‌اش برد."),
                StoryParagraph("It was dark and sad there.", "آنجا تاریک و غمگین بود."),
                StoryParagraph("Thumbelina did not want to marry the mole.", "بند انگشتی نمی‌خواست با موش کور ازدواج کند."),
                StoryParagraph("She wanted to see the sun again.", "می‌خواست دوباره خورشید را ببیند."),
                StoryParagraph("One day, she found a hurt swallow.", "یک روز، پرستوی زخمی پیدا کرد."),
                StoryParagraph("She took care of it all winter.", "تمام زمستان از آن مراقبت کرد."),
                StoryParagraph("The swallow became her friend.", "پرستو دوستش شد.")
            )),
            StoryChapter(6, "The Escape", "فرار", listOf(
                StoryParagraph("Spring came and the swallow was better.", "بهار آمد و پرستو بهتر شد."),
                StoryParagraph("The swallow wanted to fly away.", "پرستو می‌خواست پرواز کند."),
                StoryParagraph("Thumbelina did not want to marry the mole.", "بند انگشتی نمی‌خواست با موش کور ازدواج کند."),
                StoryParagraph("The swallow offered to take her.", "پرستو پیشنهاد کرد او را ببرد."),
                StoryParagraph("Thumbelina climbed onto its back.", "بند انگشتی روی پشتش بالا رفت."),
                StoryParagraph("They flew high into the sky.", "آن‌ها بلند به آسمان پرواز کردند."),
                StoryParagraph("They flew over mountains and rivers.", "از کوه‌ها و رودخانه‌ها گذشتند."),
                StoryParagraph("They reached a land of flowers.", "به سرزمین گل‌ها رسیدند."),
                StoryParagraph("Each flower had a tiny person.", "هر گل آدم کوچکی داشت."),
                StoryParagraph("Thumbelina was very happy.", "بند انگشتی خیلی خوشحال شد.")
            )),
            StoryChapter(7, "The King of the Flowers", "پادشاه گل‌ها", listOf(
                StoryParagraph("The king of the flowers saw her.", "پادشاه گل‌ها او را دید."),
                StoryParagraph("He fell in love with her beauty.", "عاشق زیبایی‌اش شد."),
                StoryParagraph("He asked her to be his queen.", "از او خواست ملکه‌اش شود."),
                StoryParagraph("Thumbelina said yes with joy.", "بند انگشتی با خوشحالی بله گفت."),
                StoryParagraph("She was given the name Maya.", "به او نام مایا داده شد."),
                StoryParagraph("She got beautiful wings like the others.", "بال‌های زیبایی مثل دیگران گرفت."),
                StoryParagraph("The swallow was very happy for her.", "پرستو برایش خیلی خوشحال شد."),
                StoryParagraph("It sang a farewell song and flew away.", "آواز خداحافظی خواند و پرواز کرد."),
                StoryParagraph("Thumbelina lived with the flower people.", "بند انگشتی با گل‌مردم زندگی کرد."),
                StoryParagraph("And so she found her true home.", "و اینگونه خانه واقعی‌اش را یافت.")
            ))
        )
    )
}