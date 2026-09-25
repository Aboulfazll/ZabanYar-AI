package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۸ — داستان‌های ماجراجویی
 *  ۲۲. سه تفنگدار
 *  ۲۳. مردی با نقاب آهنین
 *  ۲۴. معدن‌های شاه سلیمان
 */
object Group8 {

    fun getAll(): List<StoryContent> = listOf(
        story22(),
        story23(),
        story24(),
    )

    // ─────────────── ۲۲: سه تفنگدار ───────────────
    private fun story22() = StoryContent(
        storyId = "int_three_musketeers_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Young D'Artagnan", titlePersian = "دارتانیان جوان",
                paragraphs = listOf(
                    StoryParagraph("D'Artagnan was a young man from Gascony.", "دارتانیان مرد جوانی از گاسکونی بود."),
                    StoryParagraph("He wanted to join the king's musketeers.", "او می‌خواست به تفنگداران پادشاه بپیوندد."),
                    StoryParagraph("He rode to Paris on an old yellow horse.", "او با اسب زرد کهنه‌ای به پاریس رفت."),
                    StoryParagraph("His father gave him a letter and some advice.", "پدرش نامه‌ای و اندرزی به او داد."),
                    StoryParagraph("The advice was to fight for honor.", "اندرز این بود برای ناموس بجنگد."),
                    StoryParagraph("In Paris, he went to see Mr. de Treville.", "در پاریس، به دیدن آقای دو تراویل رفت."),
                    StoryParagraph("De Treville was the captain of the musketeers.", "دو تراویل کاپیتان تفنگداران بود."),
                    StoryParagraph("On the way, D'Artagnan got into trouble.", "در راه، دارتانیان دچار مشکل شد."),
                    StoryParagraph("He saw a man with a scar on his face.", "او مردی با زخمی روی صورتش دید."),
                    StoryParagraph("The man was laughing at him.", "آن مرد به او می‌خندید."),
                    StoryParagraph("D'Artagnan chased him but lost him.", "دارتانیان دنبالش کرد اما گمش کرد."),
                    StoryParagraph("Later, he met three famous musketeers.", "بعد، سه تفنگدار معروف را ملاقات کرد."),
                    StoryParagraph("Their names were Athos, Porthos, and Aramis.", "اسم‌هایشان آتوس، پورتوس و آرامیس بود."),
                    StoryParagraph("Each of them challenged D'Artagnan to a duel.", "هر کدام دارتانیان را به دوئل دعوت کردند."),
                    StoryParagraph("D'Artagnan accepted all three.", "دارتانیان هر سه را قبول کرد."),
                    StoryParagraph("At the duel, the Cardinal's guards attacked.", "در دوئل، نگهبانان کاردینال حمله کردند."),
                    StoryParagraph("The four men fought together.", "چهار مرد با هم جنگیدند."),
                    StoryParagraph("They won the fight.", "آن‌ها در نبرد پیروز شدند."),
                    StoryParagraph("From that day, they became friends.", "از آن روز، دوست شدند."),
                    StoryParagraph("Their motto was: All for one, one for all.", "شعارشان این بود: همه برای یکی، یکی برای همه.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Cardinal's Plot", titlePersian = "توطئه کاردینال",
                paragraphs = listOf(
                    StoryParagraph("Cardinal Richelieu was a powerful man.", "کاردینال ریشلیو مرد قدرتمندی بود."),
                    StoryParagraph("He wanted to control the king.", "او می‌خواست پادشاه را کنترل کند."),
                    StoryParagraph("The queen, Anne of Austria, was his enemy.", "ملکه آن اتریش دشمنش بود."),
                    StoryParagraph("The queen loved the Duke of Buckingham.", "ملکه دوک باکینگهام را دوست داشت."),
                    StoryParagraph("She gave him a gift of diamond studs.", "او هدیه‌ای از گل‌میخ‌های الماس به او داد."),
                    StoryParagraph("The Cardinal found out about this.", "کاردینال از این موضوع باخبر شد."),
                    StoryParagraph("He told the king about it.", "او به پادشاه گفت."),
                    StoryParagraph("The king asked the queen to wear the studs.", "پادشاه از ملکه خواست گل‌میخ‌ها را بپوشد."),
                    StoryParagraph("But she had given them away.", "اما او آن‌ها را داده بود."),
                    StoryParagraph("The queen was in great danger.", "ملکه در خطر بزرگی بود."),
                    StoryParagraph("D'Artagnan offered to help her.", "دارتانیان پیشنهاد کمک به او را داد."),
                    StoryParagraph("He had to go to London and get the studs back.", "او باید به لندن می‌رفت و گل‌میخ‌ها را برمی‌گرداند."),
                    StoryParagraph("He took his three friends with him.", "او سه دوستش را با خود برد."),
                    StoryParagraph("The Cardinal's men chased them.", "مردان کاردینال دنبالشان کردند."),
                    StoryParagraph("There were fights along the way.", "در طول راه نبردهایی بود."),
                    StoryParagraph("One by one, his friends were left behind.", "یکی‌یکی، دوستانش جا ماندند."),
                    StoryParagraph("D'Artagnan reached London alone.", "دارتانیان تنها به لندن رسید."),
                    StoryParagraph("But Buckingham had already given two studs away.", "اما باکینگهام قبلاً دو گل‌میخ را داده بود."),
                    StoryParagraph("His jeweler made two more in time.", "جواهرسازش به موقع دو تای دیگر ساخت."),
                    StoryParagraph("D'Artagnan returned to Paris in time.", "دارتانیان به موقع به پاریس برگشت.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Queen's Diamond Studs", titlePersian = "نجات ملکه",
                paragraphs = listOf(
                    StoryParagraph("The queen wore the diamond studs to the ball.", "ملکه گل‌میخ‌های الماس را به مهمانی پوشید."),
                    StoryParagraph("The king was very happy.", "پادشاه خیلی خوشحال شد."),
                    StoryParagraph("The Cardinal was surprised and angry.", "کاردینال تعجب کرد و عصبانی شد."),
                    StoryParagraph("His plan had failed.", "نقشه‌اش شکست خورده بود."),
                    StoryParagraph("He decided to get revenge on D'Artagnan.", "او تصمیم گرفت از دارتانیان انتقام بگیرد."),
                    StoryParagraph("A beautiful woman was sent to trap him.", "زنی زیبا فرستاده شد تا تله‌اش کند."),
                    StoryParagraph("Her name was Milady de Winter.", "اسمش می‌لیدی دو وینتر بود."),
                    StoryParagraph("She was the Cardinal's spy.", "او جاسوس کاردینال بود."),
                    StoryParagraph("Milady pretended to love D'Artagnan.", "می‌لیدی تظاهر کرد دارتانیان را دوست دارد."),
                    StoryParagraph("But she was using him.", "اما او داشت از او استفاده می‌کرد."),
                    StoryParagraph("D'Artagnan discovered her secret.", "دارتانیان رازش را کشف کرد."),
                    StoryParagraph("Milady had a mark on her shoulder.", "می‌لیدی نشانی روی شانه‌اش داشت."),
                    StoryParagraph("It was the mark of a criminal.", "نشان یک جنایتکار بود."),
                    StoryParagraph("She had been married to Athos long ago.", "او سال‌ها پیش همسر آتوس بود."),
                    StoryParagraph("Athos thought she was dead.", "آتوس فکر می‌کرد او مرده است."),
                    StoryParagraph("Milady escaped before they could catch her.", "می‌لیدی قبل از دستگیری فرار کرد."),
                    StoryParagraph("She swore revenge on D'Artagnan.", "او قسم خورد از دارتانیان انتقام بگیرد."),
                    StoryParagraph("She went to England to spy.", "او برای جاسوسی به انگلیس رفت."),
                    StoryParagraph("She planned to kill Buckingham.", "او نقشه کشید باکینگهام را بکشد."),
                    StoryParagraph("The musketeers prepared for more danger.", "تفنگداران برای خطر بیشتری آماده شدند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Woman Called Milady", titlePersian = "نبرد با می‌لیدی",
                paragraphs = listOf(
                    StoryParagraph("Milady went to England as a spy.", "می‌لیدی به عنوان جاسوس به انگلیس رفت."),
                    StoryParagraph("She convinced a man to kill Buckingham.", "او مردی را متقاعد کرد باکینگهام را بکشد."),
                    StoryParagraph("The Duke of Buckingham was murdered.", "دوک باکینگهام به قتل رسید."),
                    StoryParagraph("England was in shock.", "انگلیس در شوک بود."),
                    StoryParagraph("D'Artagnan and his friends knew Milady did it.", "دارتانیان و دوستانش می‌دانستند می‌لیدی این کار را کرده."),
                    StoryParagraph("They decided to stop her once and for all.", "آن‌ها تصمیم گرفتند برای همیشه متوقفش کنند."),
                    StoryParagraph("But Milady had another plan.", "اما می‌لیدی نقشه دیگری داشت."),
                    StoryParagraph("She poisoned Constance, D'Artagnan's love.", "او کنستانس، عشق دارتانیان را مسموم کرد."),
                    StoryParagraph("Constance died in D'Artagnan's arms.", "کنستانس در آغوش دارتانیان مرد."),
                    StoryParagraph("D'Artagnan was heartbroken.", "دارتانیان دلشکسته شد."),
                    StoryParagraph("The musketeers chased Milady to a village.", "تفنگداران می‌لیدی را تا دهکده‌ای تعقیب کردند."),
                    StoryParagraph("They caught her at night.", "آن‌ها شب دستگیرش کردند."),
                    StoryParagraph("Athos judged her for her crimes.", "آتوس او را برای جنایاتش محاکمه کرد."),
                    StoryParagraph("She had killed many innocent people.", "او افراد بی‌گناه زیادی کشته بود."),
                    StoryParagraph("The musketeers decided her fate.", "تفنگداران سرنوشتش را تعیین کردند."),
                    StoryParagraph("An executioner took her away.", "جلادی او را برد."),
                    StoryParagraph("She was punished for her crimes.", "او برای جنایاتش مجازات شد."),
                    StoryParagraph("Justice had been served.", "عدالت اجرا شده بود."),
                    StoryParagraph("But D'Artagnan was still sad.", "اما دارتانیان هنوز غمگین بود."),
                    StoryParagraph("He had lost the woman he loved.", "او زنی که دوست داشت را از دست داده بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Victory", titlePersian = "پیروزی نهایی",
                paragraphs = listOf(
                    StoryParagraph("The Cardinal knew about Milady's death.", "کاردینال از مرگ می‌لیدی باخبر شد."),
                    StoryParagraph("He sent for D'Artagnan.", "او دارتانیان را احضار کرد."),
                    StoryParagraph("He wanted to punish him.", "او می‌خواست مجازاتش کند."),
                    StoryParagraph("D'Artagnan came to see him.", "دارتانیان به دیدنش آمد."),
                    StoryParagraph("The Cardinal showed him a letter.", "کاردینال نامه‌ای به او نشان داد."),
                    StoryParagraph("The letter said D'Artagnan was a traitor.", "نامه می‌گفت دارتانیان خائن است."),
                    StoryParagraph("D'Artagnan remained calm.", "دارتانیان آرام ماند."),
                    StoryParagraph("He told the Cardinal the truth.", "او حقیقت را به کاردینال گفت."),
                    StoryParagraph("The Cardinal was impressed by his courage.", "کاردینال از شجاعتش تحت تأثیر قرار گرفت."),
                    StoryParagraph("He decided to reward him.", "او تصمیم گرفت پاداشش دهد."),
                    StoryParagraph("D'Artagnan became a lieutenant of the musketeers.", "دارتانیان ستوان تفنگداران شد."),
                    StoryParagraph("His friends were promoted too.", "دوستانش هم ارتقا یافتند."),
                    StoryParagraph("They celebrated together.", "آن‌ها با هم جشن گرفتند."),
                    StoryParagraph("But there was still danger ahead.", "اما هنوز خطر در پیش بود."),
                    StoryParagraph("The Cardinal would try again.", "کاردینال دوباره تلاش می‌کرد."),
                    StoryParagraph("The musketeers stayed loyal to the queen.", "تفنگداران به ملکه وفادار ماندند."),
                    StoryParagraph("They protected her from all enemies.", "آن‌ها از او در برابر همه دشمنان محافظت کردند."),
                    StoryParagraph("Their friendship grew stronger.", "دوستی‌شان قوی‌تر شد."),
                    StoryParagraph("They would always fight together.", "آن‌ها همیشه با هم می‌جنگیدند."),
                    StoryParagraph("All for one, and one for all.", "همه برای یکی، و یکی برای همه.")
                )
            )
        )
    )

    // ─────────────── ۲۳: مردی با نقاب آهنین ───────────────
    private fun story23() = StoryContent(
        storyId = "int_iron_mask",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Prisoner in the Mask", titlePersian = "زندانی مرموز",
                paragraphs = listOf(
                    StoryParagraph("In the Bastille prison, there was a strange prisoner.", "در زندان باستیل، زندانی عجیبی بود."),
                    StoryParagraph("He had been there for many years.", "سال‌ها آنجا بود."),
                    StoryParagraph("No one knew his name.", "هیچ‌کس اسمش را نمی‌دانست."),
                    StoryParagraph("His face was always covered with a mask.", "صورتش همیشه با نقابی پوشیده بود."),
                    StoryParagraph("The mask was made of iron.", "نقاب از آهن بود."),
                    StoryParagraph("The guards were not allowed to speak to him.", "نگهبانان اجازه نداشتند با او صحبت کنند."),
                    StoryParagraph("They brought him food in silence.", "آن‌ها در سکوت برایش غذا می‌آوردند."),
                    StoryParagraph("He was treated like a nobleman.", "با او مثل یک نجیب‌زاده رفتار می‌شد."),
                    StoryParagraph("But he was a prisoner.", "اما او زندانی بود."),
                    StoryParagraph("He had been there since he was young.", "او از جوانی آنجا بود."),
                    StoryParagraph("He did not know why he was arrested.", "او نمی‌دانست چرا دستگیر شده."),
                    StoryParagraph("He did not know his own name.", "او اسم خودش را نمی‌دانست."),
                    StoryParagraph("The King of France knew the secret.", "پادشاه فرانسه راز را می‌دانست."),
                    StoryParagraph("Only two other men knew it.", "فقط دو مرد دیگر می‌دانستند."),
                    StoryParagraph("One was the Cardinal.", "یکی کاردینال بود."),
                    StoryParagraph("The other was a soldier named Duval.", "دیگری سربازی به نام دووال بود."),
                    StoryParagraph("They had guarded the secret for years.", "آن‌ها سال‌ها از راز محافظت کرده بودند."),
                    StoryParagraph("The prisoner was the king's twin brother.", "زندانی برادر دوقلوی پادشاه بود."),
                    StoryParagraph("If anyone knew, there would be war.", "اگر کسی می‌دانست، جنگ می‌شد."),
                    StoryParagraph("So the mask stayed on forever.", "پس نقاب برای همیشه می‌ماند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Musketeers' Discovery", titlePersian = "نقشه نجات",
                paragraphs = listOf(
                    StoryParagraph("D'Artagnan and his friends were on a mission.", "دارتانیان و دوستانش در مأموریتی بودند."),
                    StoryParagraph("They were sent to the Bastille.", "آن‌ها به باستیل فرستاده شدند."),
                    StoryParagraph("They had to deliver a message to the governor.", "آن‌ها باید پیامی به فرماندار می‌رساندند."),
                    StoryParagraph("D'Artagnan noticed the masked prisoner.", "دارتانیان زندانی نقاب‌دار را متوجه شد."),
                    StoryParagraph("He asked about him.", "او درباره‌اش پرسید."),
                    StoryParagraph("The guards refused to answer.", "نگهبانان از جواب دادن امتناع کردند."),
                    StoryParagraph("But D'Artagnan was curious.", "اما دارتانیان کنجکاو بود."),
                    StoryParagraph("He decided to investigate.", "او تصمیم گرفت تحقیق کند."),
                    StoryParagraph("He found out about the king's twin.", "او درباره دوقلوی پادشاه فهمید."),
                    StoryParagraph("The prisoner was named Philippe.", "اسم زندانی فیلیپ بود."),
                    StoryParagraph("He looked exactly like the king.", "او دقیقاً شبیه پادشاه بود."),
                    StoryParagraph("D'Artagnan was shocked.", "دارتانیان شوکه شد."),
                    StoryParagraph("He told Athos and the others.", "او به آتوس و دیگران گفت."),
                    StoryParagraph("They decided to help Philippe.", "آن‌ها تصمیم گرفتند به فیلیپ کمک کنند."),
                    StoryParagraph("They would switch him with the king.", "آن‌ها او را با پادشاه عوض می‌کردند."),
                    StoryParagraph("The fake king would rule for the people.", "پادشاه جعلی برای مردم حکومت می‌کرد."),
                    StoryParagraph("The real king would go to prison.", "پادشاه واقعی به زندان می‌رفت."),
                    StoryParagraph("It was a dangerous plan.", "نقشه خطرناکی بود."),
                    StoryParagraph("But it was the only way.", "اما تنها راه بود."),
                    StoryParagraph("They prepared for the switch.", "آن‌ها برای تعویض آماده شدند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Secret of the Twin", titlePersian = "راز سلطنتی",
                paragraphs = listOf(
                    StoryParagraph("The King was at a party in the palace.", "پادشاه در مهمانی‌ای در قصر بود."),
                    StoryParagraph("The musketeers came in disguise.", "تفنگداران مبدل آمدند."),
                    StoryParagraph("They captured the King quietly.", "آن‌ها پادشاه را بی‌صدا دستگیر کردند."),
                    StoryParagraph("They took him to the Bastille.", "آن‌ها او را به باستیل بردند."),
                    StoryParagraph("They dressed Philippe in royal clothes.", "آن‌ها فیلیپ را در لباس‌های سلطنتی پوشاندند."),
                    StoryParagraph("He looked exactly like the King.", "او دقیقاً شبیه پادشاه به نظر می‌رسید."),
                    StoryParagraph("The switch was done.", "تعویض انجام شد."),
                    StoryParagraph("The next day, Philippe sat on the throne.", "روز بعد، فیلیپ روی تخت نشست."),
                    StoryParagraph("No one noticed the difference.", "هیچ‌کس تفاوت را متوجه نشد."),
                    StoryParagraph("The new King was kind and fair.", "پادشاه جدید مهربان و عادل بود."),
                    StoryParagraph("He helped the poor and the weak.", "او به فقرا و ضعیفان کمک می‌کرد."),
                    StoryParagraph("The people loved him.", "مردم دوستش داشتند."),
                    StoryParagraph("The Cardinal was suspicious.", "کاردینال مشکوک شد."),
                    StoryParagraph("He had known the real King well.", "او پادشاه واقعی را خوب می‌شناخت."),
                    StoryParagraph("He noticed small differences.", "او تفاوت‌های کوچکی متوجه شد."),
                    StoryParagraph("He decided to investigate.", "او تصمیم گرفت تحقیق کند."),
                    StoryParagraph("He went to the Bastille.", "او به باستیل رفت."),
                    StoryParagraph("He saw the real King in the iron mask.", "او پادشاه واقعی را با نقاب آهنین دید."),
                    StoryParagraph("He knew the secret was out.", "او فهمید راز فاش شده."),
                    StoryParagraph("He planned to restore the real King.", "او نقشه کشید پادشاه واقعی را برگرداند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Fight for the Throne", titlePersian = "خطر بزرگ",
                paragraphs = listOf(
                    StoryParagraph("The Cardinal gathered his soldiers.", "کاردینال سربازانش را جمع کرد."),
                    StoryParagraph("He attacked the palace at night.", "او شب به قصر حمله کرد."),
                    StoryParagraph("The musketeers defended the new King.", "تفنگداران از پادشاه جدید دفاع کردند."),
                    StoryParagraph("There was a terrible battle.", "نبرد وحشتناکی شد."),
                    StoryParagraph("Porthos was wounded badly.", "پورتوس بدجور زخمی شد."),
                    StoryParagraph("Aramis was captured.", "آرامیس دستگیر شد."),
                    StoryParagraph("Athos and D'Artagnan kept fighting.", "آتوس و دارتانیان به جنگ ادامه دادند."),
                    StoryParagraph("They reached the Cardinal.", "آن‌ها به کاردینال رسیدند."),
                    StoryParagraph("D'Artagnan held his sword to the Cardinal's throat.", "دارتانیان شمشیرش را به گلوی کاردینال گذاشت."),
                    StoryParagraph("He demanded the release of his friends.", "او آزادی دوستانش را خواست."),
                    StoryParagraph("The Cardinal agreed.", "کاردینال موافقت کرد."),
                    StoryParagraph("Aramis was set free.", "آرامیس آزاد شد."),
                    StoryParagraph("The battle was won.", "نبرد پیروز شد."),
                    StoryParagraph("Philippe stayed as the King.", "فیلیپ به عنوان پادشاه ماند."),
                    StoryParagraph("The real King stayed in the Bastille.", "پادشاه واقعی در باستیل ماند."),
                    StoryParagraph("He wore the iron mask for the rest of his life.", "او بقیه عمرش را با نقاب آهنین گذراند."),
                    StoryParagraph("The Cardinal was sent into exile.", "کاردینال به تبعید فرستاده شد."),
                    StoryParagraph("He never returned to France.", "او هرگز به فرانسه برنگشت."),
                    StoryParagraph("Peace was restored.", "آرامش برقرار شد."),
                    StoryParagraph("The musketeers were honored.", "تفنگداران مورد احترام قرار گرفتند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Years", titlePersian = "فداکاری نهایی",
                paragraphs = listOf(
                    StoryParagraph("The new King ruled wisely for many years.", "پادشاه جدید سال‌ها عاقلانه حکومت کرد."),
                    StoryParagraph("He was loved by all the people.", "همه مردم دوستش داشتند."),
                    StoryParagraph("But he never forgot his brother.", "اما او هرگز برادرش را فراموش نکرد."),
                    StoryParagraph("He visited him secretly sometimes.", "گاهی مخفیانه به دیدنش می‌رفت."),
                    StoryParagraph("He told him about the kingdom.", "او درباره پادشاهی به او می‌گفت."),
                    StoryParagraph("The real King listened in silence.", "پادشاه واقعی در سکوت گوش می‌داد."),
                    StoryParagraph("He had given up his throne.", "او از تختش دست کشیده بود."),
                    StoryParagraph("But he was not sad.", "اما غمگین نبود."),
                    StoryParagraph("He had found peace in his prison.", "او در زندانش آرامش پیدا کرده بود."),
                    StoryParagraph("The musketeers grew old together.", "تفنگداران با هم پیر شدند."),
                    StoryParagraph("Athos became a writer.", "آتوس نویسنده شد."),
                    StoryParagraph("Porthos married and had children.", "پورتوس ازدواج کرد و بچه دار شد."),
                    StoryParagraph("Aramis became a priest.", "آرامیس کشیش شد."),
                    StoryParagraph("D'Artagnan stayed in the king's service.", "دارتانیان در خدمت پادشاه ماند."),
                    StoryParagraph("He became the captain of the musketeers.", "او کاپیتان تفنگداران شد."),
                    StoryParagraph("He trained young soldiers.", "او سربازان جوان را آموزش می‌داد."),
                    StoryParagraph("He told them about his old adventures.", "او از ماجراهای قدیمی‌اش برایشان می‌گفت."),
                    StoryParagraph("The mask was kept in a secret room.", "نقاب در اتاقی مخفی نگه داشته شد."),
                    StoryParagraph("Only the closest friends knew the story.", "فقط نزدیک‌ترین دوستان داستان را می‌دانستند."),
                    StoryParagraph("And so the secret died with them.", "و اینگونه راز با آن‌ها مرد.")
                )
            )
        )
    )

    // ─────────────── ۲۴: معدن‌های شاه سلیمان ───────────────
    private fun story24() = StoryContent(
        storyId = "int_king_solomon",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Treasure Map", titlePersian = "نقشه گنج",
                paragraphs = listOf(
                    StoryParagraph("Allan Quatermain was an elephant hunter.", "آلن کوئترمین شکارچی فیل بود."),
                    StoryParagraph("He lived in Africa for many years.", "او سال‌ها در آفریقا زندگی کرده بود."),
                    StoryParagraph("One day, he met a man named Sir Henry Curtis.", "یک روز، مردی به نام سر هنری کرتیس را ملاقات کرد."),
                    StoryParagraph("Sir Henry was looking for his brother.", "سر هنری دنبال برادرش می‌گشت."),
                    StoryParagraph("His brother had gone to find King Solomon's Mines.", "برادرش رفته بود معدن‌های شاه سلیمان را پیدا کند."),
                    StoryParagraph("No one had returned from that journey.", "هیچ‌کس از آن سفر برنگشته بود."),
                    StoryParagraph("Quatermain had an old map.", "کوئترمین نقشه‌ای قدیمی داشت."),
                    StoryParagraph("It was drawn by a Portuguese explorer.", "توسط کاشفی پرتغالی کشیده شده بود."),
                    StoryParagraph("The map showed the way to the mines.", "نقشه راه معدن‌ها را نشان می‌داد."),
                    StoryParagraph("It also showed a path through the desert.", "همچنین مسیری از میان صحرا نشان می‌داد."),
                    StoryParagraph("Quatermain agreed to lead the journey.", "کوئترمین موافقت کرد رهبری سفر را بکند."),
                    StoryParagraph("A man named Captain Good joined them.", "مردی به نام کاپیتان گود به آن‌ها پیوست."),
                    StoryParagraph("They hired African porters.", "آن‌ها باربران آفریقایی استخدام کردند."),
                    StoryParagraph("One porter was named Umbopa.", "یکی از باربران اومبوپا نام داشت."),
                    StoryParagraph("Umbopa was tall and proud.", "اومبوپا بلندقد و مغرور بود."),
                    StoryParagraph("He was not like the others.", "او مثل دیگران نبود."),
                    StoryParagraph("They started their journey into the desert.", "آن‌ها سفرشان را به صحرا شروع کردند."),
                    StoryParagraph("The sun was hot and water was scarce.", "آفتاب داغ بود و آب کم."),
                    StoryParagraph("Many porters died along the way.", "باربران زیادی در راه مردند."),
                    StoryParagraph("But Quatermain kept going.", "اما کوئترمین ادامه داد.")
                )
            ),
            StoryChapter(
                number = 2, title = "Across the Desert", titlePersian = "سفر به آفریقا",
                paragraphs = listOf(
                    StoryParagraph("After many days, they reached the mountains.", "بعد از روزهای زیاد، به کوه‌ها رسیدند."),
                    StoryParagraph("They found a cave with fresh water.", "غاری با آب تازه پیدا کردند."),
                    StoryParagraph("The map showed a secret passage.", "نقشه مسیری مخفی نشان می‌داد."),
                    StoryParagraph("They entered the passage through the cave.", "آن‌ها از طریق غار وارد مسیر شدند."),
                    StoryParagraph("It was dark and narrow.", "تاریک و باریک بود."),
                    StoryParagraph("They had to crawl on their hands and knees.", "آن‌ها باید روی دست و زانو می‌خزیدند."),
                    StoryParagraph("Finally, they came out on the other side.", "بالاخره، طرف دیگر بیرون آمدند."),
                    StoryParagraph("They saw a beautiful green valley.", "آن‌ها دره‌ای سرسبز و زیبا دیدند."),
                    StoryParagraph("It was called Kukuanaland.", "اسمش کوکوانالند بود."),
                    StoryParagraph("The people there were warriors.", "مردم آنجا جنگجو بودند."),
                    StoryParagraph("A cruel king named Twala ruled them.", "پادشاه ظالمی به نام توالا بر آن‌ها حکومت می‌کرد."),
                    StoryParagraph("Umbopa told them his secret.", "اومبوپا رازش را به آن‌ها گفت."),
                    StoryParagraph("He was the rightful king of Kukuanaland.", "او پادشاه قانونی کوکوانالند بود."),
                    StoryParagraph("His father had been killed by Twala.", "پدرش توسط توالا کشته شده بود."),
                    StoryParagraph("He wanted to take back his throne.", "او می‌خواست تختش را پس بگیرد."),
                    StoryParagraph("Quatermain and his friends agreed to help.", "کوئترمین و دوستانش موافقت کردند کمک کنند."),
                    StoryParagraph("They had to fight in a great battle.", "آن‌ها باید در نبردی بزرگ می‌جنگیدند."),
                    StoryParagraph("But first, they had to survive.", "اما اول باید زنده می‌ماندند."),
                    StoryParagraph("The people of the valley were suspicious.", "مردم دره مشکوک بودند."),
                    StoryParagraph("They had never seen white men before.", "آن‌ها هرگز مرد سفیدپوست ندیده بودند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Lost Kingdom", titlePersian = "کوه‌های مرموز",
                paragraphs = listOf(
                    StoryParagraph("The travelers were captured by warriors.", "مسافران توسط جنگجویان دستگیر شدند."),
                    StoryParagraph("They were taken to the king.", "آن‌ها را به نزد پادشاه بردند."),
                    StoryParagraph("King Twala wanted to kill them.", "پادشاه توالا می‌خواست بکشدشان."),
                    StoryParagraph("But an old woman stopped him.", "اما پیرزنی جلویش را گرفت."),
                    StoryParagraph("She was named Gagool.", "اسمش گاگول بود."),
                    StoryParagraph("She was a witch and an advisor.", "او جادوگر و مشاور بود."),
                    StoryParagraph("She said they should not be killed yet.", "او گفت نباید هنوز کشته شوند."),
                    StoryParagraph("Twala agreed to let them live.", "توالا موافقت کرد زنده‌شان بگذارد."),
                    StoryParagraph("But they had to fight in the next battle.", "اما آن‌ها باید در نبرد بعدی می‌جنگیدند."),
                    StoryParagraph("The battle was against Twala's enemies.", "نبرد علیه دشمنان توالا بود."),
                    StoryParagraph("Quatermain and his friends fought bravely.", "کوئترمین و دوستانش شجاعانه جنگیدند."),
                    StoryParagraph("Umbopa fought like a lion.", "اومبوپا مثل شیری جنگید."),
                    StoryParagraph("The enemy was defeated.", "دشمن شکست خورد."),
                    StoryParagraph("Twala was angry but impressed.", "توالا عصبانی بود اما تحت تأثیر قرار گرفت."),
                    StoryParagraph("Umbopa revealed his true identity.", "اومبوپا هویت واقعی‌اش را فاش کرد."),
                    StoryParagraph("Many warriors joined him.", "جنگجویان زیادی به او پیوستند."),
                    StoryParagraph("A civil war was about to begin.", "جنگ داخلی در شرف شروع بود."),
                    StoryParagraph("Umbopa and Twala faced each other.", "اومبوپا و توالا روبروی هم ایستادند."),
                    StoryParagraph("Only one could be king.", "فقط یکی می‌توانست پادشاه باشد."),
                    StoryParagraph("The final battle was coming.", "نبرد نهایی نزدیک بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Diamond Mines", titlePersian = "معدن الماس",
                paragraphs = listOf(
                    StoryParagraph("Umbopa defeated Twala in single combat.", "اومبوپا در نبردی تن‌به‌تن توالا را شکست داد."),
                    StoryParagraph("He became the new king.", "او پادشاه جدید شد."),
                    StoryParagraph("His first act was to thank his friends.", "اولین کارش تشکر از دوستانش بود."),
                    StoryParagraph("He promised to help them find the mines.", "او قول داد به آن‌ها در پیدا کردن معدن‌ها کمک کند."),
                    StoryParagraph("Gagool led them to the secret chamber.", "گاگول آن‌ها را به اتاق مخفی برد."),
                    StoryParagraph("They went deep into the mountain.", "آن‌ها عمیق به کوه رفتند."),
                    StoryParagraph("There were three stone doors.", "سه در سنگی بود."),
                    StoryParagraph("Only Gagool knew which one to open.", "فقط گاگول می‌دانست کدام را باز کند."),
                    StoryParagraph("She pressed a hidden button.", "او دکمه‌ای مخفی فشار داد."),
                    StoryParagraph("The door opened slowly.", "در آرام باز شد."),
                    StoryParagraph("Inside were piles of diamonds and gold.", "داخل توده‌های الماس و طلا بود."),
                    StoryParagraph("They had never seen so much wealth.", "آن‌ها هرگز اینقدر ثروت ندیده بودند."),
                    StoryParagraph("But suddenly, the door started to close.", "اما ناگهان، در شروع به بسته شدن کرد."),
                    StoryParagraph("Gagool tried to trap them inside.", "گاگول تلاش کرد آن‌ها را داخل حبس کند."),
                    StoryParagraph("She wanted the treasure for herself.", "او گنج را برای خودش می‌خواست."),
                    StoryParagraph("But she slipped and fell.", "اما لیز خورد و افتاد."),
                    StoryParagraph("The door crushed her.", "در او را له کرد."),
                    StoryParagraph("The travelers escaped with some diamonds.", "مسافران با کمی الماس فرار کردند."),
                    StoryParagraph("They had found the treasure.", "آن‌ها گنج را پیدا کرده بودند."),
                    StoryParagraph("And they had survived.", "و زنده مانده بودند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Return Home", titlePersian = "بازگشت با ثروت",
                paragraphs = listOf(
                    StoryParagraph("Sir Henry found his brother's body.", "سر هنری جسد برادرش را پیدا کرد."),
                    StoryParagraph("His brother had died in the mountains.", "برادرش در کوه‌ها مرده بود."),
                    StoryParagraph("Sir Henry was sad but not surprised.", "سر هنری غمگین بود اما متعجب نه."),
                    StoryParagraph("He had known the journey was dangerous.", "او می‌دانست سفر خطرناک است."),
                    StoryParagraph("The travelers decided to go home.", "مسافران تصمیم گرفتند به خانه برگردند."),
                    StoryParagraph("Umbopa became a good king.", "اومبوپا پادشاه خوبی شد."),
                    StoryParagraph("He ruled fairly and wisely.", "او عادلانه و عاقلانه حکومت کرد."),
                    StoryParagraph("His people loved him.", "مردمش دوستش داشتند."),
                    StoryParagraph("The three friends said goodbye to him.", "سه دوست از او خداحافظی کردند."),
                    StoryParagraph("They promised to return one day.", "آن‌ها قول دادند روزی برگردند."),
                    StoryParagraph("They crossed the desert again.", "آن‌ها دوباره از صحرا گذشتند."),
                    StoryParagraph("This time, they had water and food.", "این بار، آب و غذا داشتند."),
                    StoryParagraph("They reached the coast safely.", "آن‌ها سالم به ساحل رسیدند."),
                    StoryParagraph("They took a ship to England.", "آن‌ها با کشتی به انگلیس رفتند."),
                    StoryParagraph("Back home, they were rich and famous.", "در خانه، ثروتمند و مشهور بودند."),
                    StoryParagraph("Quatermain wrote a book about the journey.", "کوئترمین کتابی درباره سفر نوشت."),
                    StoryParagraph("Many people read it with excitement.", "افراد زیادی با هیجان خواندندش."),
                    StoryParagraph("But no one else found the mines.", "اما هیچ‌کس دیگر معدن‌ها را پیدا نکرد."),
                    StoryParagraph("The mines of King Solomon were lost again.", "معدن‌های شاه سلیمان دوباره گم شدند."),
                    StoryParagraph("And so the legend continued.", "و اینگونه افسانه ادامه یافت.")
                )
            )
        )
    )
}