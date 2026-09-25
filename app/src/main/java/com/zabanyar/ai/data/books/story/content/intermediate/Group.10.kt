package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۱۰ — داستان‌های کلاسیک پایانی
 *  ۲۸. ماجراهای هاکلبری فین
 *  ۲۹. غرور و تعصب
 *  ۳۰. جین ایر
 */
object Group10 {

    fun getAll(): List<StoryContent> = listOf(
        story28(),
        story29(),
        story30(),
    )

    // ─────────────── ۲۸: ماجراهای هاکلبری فین ───────────────
    private fun story28() = StoryContent(
        storyId = "int_huck_finn_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "Escape from Home", titlePersian = "فرار از خانه",
                paragraphs = listOf(
                    StoryParagraph("My name is Huckleberry Finn.", "اسم من هاکلبری فین است."),
                    StoryParagraph("Everyone calls me Huck.", "همه مرا هاک صدا می‌زنند."),
                    StoryParagraph("I lived with a widow named Douglas.", "من با بیوه‌ای به نام داگلاس زندگی می‌کردم."),
                    StoryParagraph("She tried to teach me good manners.", "او تلاش می‌کرد به من آداب خوب بیاموزد."),
                    StoryParagraph("But I did not like that life.", "اما آن زندگی را دوست نداشتم."),
                    StoryParagraph("I wanted to be free and wild.", "می‌خواستم آزاد و وحشی باشم."),
                    StoryParagraph("My father came back to town.", "پدرم به شهر برگشت."),
                    StoryParagraph("He was a drunk and a violent man.", "او مردی مست و خشن بود."),
                    StoryParagraph("He took me to a cabin in the woods.", "او مرا به کلبه‌ای در جنگل برد."),
                    StoryParagraph("He locked me inside every day.", "او هر روز مرا داخل حبس می‌کرد."),
                    StoryParagraph("He beat me when he was drunk.", "وقتی مست بود کتکم می‌زد."),
                    StoryParagraph("I had to escape from him.", "باید از او فرار می‌کردم."),
                    StoryParagraph("One night, I found a small canoe.", "یک شب، قایق کوچکی پیدا کردم."),
                    StoryParagraph("I made it look like I was murdered.", "کاری کردم که به نظر برسد کشته شده‌ام."),
                    StoryParagraph("I put blood on the floor.", "خون روی زمین ریختم."),
                    StoryParagraph("Then I took food and left.", "بعد غذا برداشتم و رفتم."),
                    StoryParagraph("I paddled to a small island.", "به جزیره کوچکی پارو زدم."),
                    StoryParagraph("It was called Jackson's Island.", "اسمش جزیره جکسون بود."),
                    StoryParagraph("I was finally free.", "بالاخره آزاد بودم."),
                    StoryParagraph("But I was also very lonely.", "اما خیلی هم تنها بودم.")
                )
            ),
            StoryChapter(
                number = 2, title = "Jim on the Island", titlePersian = "جزیره جکسون",
                paragraphs = listOf(
                    StoryParagraph("On the island, I found a man.", "در جزیره، مردی پیدا کردم."),
                    StoryParagraph("His name was Jim.", "اسمش جیم بود."),
                    StoryParagraph("He was a slave from the widow's house.", "او برده‌ای از خانه بیوه بود."),
                    StoryParagraph("He had run away too.", "او هم فرار کرده بود."),
                    StoryParagraph("He was afraid of being caught.", "او می‌ترسید دستگیر شود."),
                    StoryParagraph("I promised not to tell anyone.", "قول دادم به کسی نگویم."),
                    StoryParagraph("We became friends.", "ما دوست شدیم."),
                    StoryParagraph("We shared food and stories.", "غذا و داستان‌ها را تقسیم کردیم."),
                    StoryParagraph("One night, the river rose.", "یک شب، رودخانه بالا آمد."),
                    StoryParagraph("We found a house floating on the water.", "خانه‌ای پیدا کردیم که روی آب شناور بود."),
                    StoryParagraph("Inside was a dead man.", "داخلش مرده‌ای بود."),
                    StoryParagraph("Jim said it was my father.", "جیم گفت پدرم است."),
                    StoryParagraph("But he told me not to look.", "اما گفت نگاه نکنم."),
                    StoryParagraph("We took supplies from the house.", "ما از خانه آذوقه برداشتیم."),
                    StoryParagraph("We decided to travel down the river.", "تصمیم گرفتیم پایین رودخانه سفر کنیم."),
                    StoryParagraph("We built a raft from logs.", "قایقی از تنه درختان ساختیم."),
                    StoryParagraph("The Mississippi River was long and wide.", "رودخانه می‌سی‌سی‌پی طولانی و عریض بود."),
                    StoryParagraph("We wanted to reach a free state.", "می‌خواستیم به ایالتی آزاد برسیم."),
                    StoryParagraph("There, Jim would be free.", "آنجا، جیم آزاد می‌شد."),
                    StoryParagraph("We started our journey at night.", "سفرمان را شب شروع کردیم.")
                )
            ),
            StoryChapter(
                number = 3, title = "Traveling with Jim", titlePersian = "سفر با قایق",
                paragraphs = listOf(
                    StoryParagraph("We traveled down the river for days.", "روزها پایین رودخانه سفر کردیم."),
                    StoryParagraph("We only moved at night.", "فقط شب‌ها حرکت می‌کردیم."),
                    StoryParagraph("During the day, we hid the raft.", "روزها قایق را پنهان می‌کردیم."),
                    StoryParagraph("We caught fish and cooked them.", "ماهی می‌گرفتیم و می‌پختیم."),
                    StoryParagraph("Jim was kind and wise.", "جیم مهربان و دانا بود."),
                    StoryParagraph("He took care of me.", "او مراقبم بود."),
                    StoryParagraph("We talked about many things.", "درباره چیزهای زیادی صحبت می‌کردیم."),
                    StoryParagraph("He told me about his family.", "او درباره خانواده‌اش به من گفت."),
                    StoryParagraph("He missed his wife and children.", "دلتنگ زن و بچه‌هایش بود."),
                    StoryParagraph("They were slaves in another town.", "آن‌ها در شهر دیگری برده بودند."),
                    StoryParagraph("He wanted to buy their freedom.", "می‌خواست آزادی‌شان را بخرد."),
                    StoryParagraph("I promised to help him.", "قول دادم کمکش کنم."),
                    StoryParagraph("One night, a steamboat hit our raft.", "یک شب، کشتی بخاری به قایقمان خورد."),
                    StoryParagraph("We fell into the water.", "ما در آب افتادیم."),
                    StoryParagraph("I lost Jim in the dark.", "جیم را در تاریکی گم کردم."),
                    StoryParagraph("I swam to shore alone.", "تنها به ساحل شنا کردم."),
                    StoryParagraph("I looked for him everywhere.", "همه‌جا دنبالش گشتم."),
                    StoryParagraph("But I could not find him.", "اما نتوانستم پیدایش کنم."),
                    StoryParagraph("I thought he was dead.", "فکر کردم مرده است."),
                    StoryParagraph("I cried for my friend.", "برای دوستم گریه کردم.")
                )
            ),
            StoryChapter(
                number = 4, title = "The King and the Duke", titlePersian = "کلاهبرداران",
                paragraphs = listOf(
                    StoryParagraph("Two men joined us on the river.", "دو مرد در رودخانه به ما پیوستند."),
                    StoryParagraph("They said they were a king and a duke.", "گفتند پادشاه و دوک هستند."),
                    StoryParagraph("But they were really thieves.", "اما واقعاً دزد بودند."),
                    StoryParagraph("Jim and I knew the truth.", "جیم و من حقیقت را می‌دانستیم."),
                    StoryParagraph("But we let them stay.", "اما اجازه دادیم بمانند."),
                    StoryParagraph("They made us do everything for them.", "آن‌ها ما را وادار می‌کردند همه کار برایشان بکنیم."),
                    StoryParagraph("They lied and cheated everywhere.", "هر جا دروغ می‌گفتند و تقلب می‌کردند."),
                    StoryParagraph("They pretended to be actors.", "تظاهر می‌کردند بازیگرند."),
                    StoryParagraph("They stole money from poor people.", "از فقرا پول می‌دزدیدند."),
                    StoryParagraph("One day, they heard about a dead man.", "یک روز، درباره مرده‌ای شنیدند."),
                    StoryParagraph("His name was Peter Wilks.", "اسمش پیتر ویلکس بود."),
                    StoryParagraph("He had left money to his brothers.", "او پولش را به برادرانش داده بود."),
                    StoryParagraph("The king pretended to be one brother.", "پادشاه تظاهر کرد یکی از برادران است."),
                    StoryParagraph("The duke pretended to be the other.", "دوک تظاهر کرد برادر دیگر است."),
                    StoryParagraph("The family believed them at first.", "خانواده اول باورشان کردند."),
                    StoryParagraph("But I felt sorry for the family.", "اما من دلم برای خانواده سوخت."),
                    StoryParagraph("I decided to help them.", "تصمیم گرفتم کمکشان کنم."),
                    StoryParagraph("I stole the money back from the king.", "پول را از پادشاه دزدیدم."),
                    StoryParagraph("I hid it in the dead man's coffin.", "آن را در تابوت مرده پنهان کردم."),
                    StoryParagraph("The truth came out later.", "حقیقت بعداً فاش شد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Freedom at Last", titlePersian = "آزادی جیم",
                paragraphs = listOf(
                    StoryParagraph("The king and duke were caught.", "پادشاه و دوک دستگیر شدند."),
                    StoryParagraph("They were punished for their crimes.", "آن‌ها برای جنایاتشان مجازات شدند."),
                    StoryParagraph("Jim and I traveled on alone.", "جیم و من تنها ادامه دادیم."),
                    StoryParagraph("But then Jim was captured.", "اما بعد جیم دستگیر شد."),
                    StoryParagraph("He was sold as a slave again.", "او دوباره به عنوان برده فروخته شد."),
                    StoryParagraph("I had to save him.", "باید نجاتش می‌دادم."),
                    StoryParagraph("I found out where he was.", "فهمیدم کجاست."),
                    StoryParagraph("He was on a farm nearby.", "او در مزرعه‌ای نزدیک بود."),
                    StoryParagraph("The owners were a kind family.", "صاحبانش خانواده‌ای مهربان بودند."),
                    StoryParagraph("Their name was Phelps.", "اسمشان فلپس بود."),
                    StoryParagraph("They thought I was their nephew Tom.", "آن‌ها فکر می‌کردند من برادرزاده‌شان تام هستم."),
                    StoryParagraph("I pretended to be Tom Sawyer.", "من تظاهر کردم تام سایر هستم."),
                    StoryParagraph("The real Tom Sawyer arrived later.", "تام سایر واقعی بعداً رسید."),
                    StoryParagraph("He helped me free Jim.", "او کمکم کرد جیم را آزاد کنیم."),
                    StoryParagraph("We made a dangerous plan.", "نقشه خطرناکی کشیدیم."),
                    StoryParagraph("But we succeeded.", "اما موفق شدیم."),
                    StoryParagraph("Jim was free at last.", "جیم بالاخره آزاد شد."),
                    StoryParagraph("Then we learned great news.", "بعد خبر بزرگی فهمیدیم."),
                    StoryParagraph("Jim's owner had died and freed him.", "صاحب جیم مرده بود و او را آزاد کرده بود."),
                    StoryParagraph("He had been free all along.", "او از اول آزاد بود.")
                )
            )
        )
    )

    // ─────────────── ۲۹: غرور و تعصب ───────────────
    private fun story29() = StoryContent(
        storyId = "int_pride_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Bennet Family", titlePersian = "خانواده بنت",
                paragraphs = listOf(
                    StoryParagraph("Mr. Bennet had five daughters.", "آقای بنت پنج دختر داشت."),
                    StoryParagraph("They lived in a village called Longbourn.", "آن‌ها در دهکده‌ای به نام لانگبورن زندگی می‌کردند."),
                    StoryParagraph("Mrs. Bennet wanted them to marry rich men.", "خانم بنت می‌خواست آن‌ها با مردان ثروتمند ازدواج کنند."),
                    StoryParagraph("The oldest was Jane.", "بزرگترین جین بود."),
                    StoryParagraph("She was beautiful and kind.", "او زیبا و مهربان بود."),
                    StoryParagraph("The second was Elizabeth.", "دومی الیزابت بود."),
                    StoryParagraph("She was clever and independent.", "او باهوش و مستقل بود."),
                    StoryParagraph("The others were Mary, Kitty, and Lydia.", "بقیه مری، کیتی و لیدیا بودند."),
                    StoryParagraph("One day, a rich man came to town.", "یک روز، مرد ثروتمندی به شهر آمد."),
                    StoryParagraph("His name was Mr. Bingley.", "اسمش آقای بینگلی بود."),
                    StoryParagraph("He rented a large house nearby.", "او خانه‌ای بزرگ نزدیک اجاره کرد."),
                    StoryParagraph("He brought a friend with him.", "او دوستی با خود آورد."),
                    StoryParagraph("The friend was Mr. Darcy.", "دوستش آقای دارسی بود."),
                    StoryParagraph("Mr. Darcy was even richer.", "آقای دارسی حتی ثروتمندتر بود."),
                    StoryParagraph("He owned a great estate in the north.", "او ملکی بزرگ در شمال داشت."),
                    StoryParagraph("He earned ten thousand pounds a year.", "سالانه ده هزار پوند درآمد داشت."),
                    StoryParagraph("At a party, Bingley danced with Jane.", "در مهمانی‌ای، بینگلی با جین رقصید."),
                    StoryParagraph("They liked each other immediately.", "آن‌ها بلافاصله یکدیگر را دوست داشتند."),
                    StoryParagraph("But Darcy refused to dance.", "اما دارسی از رقصیدن امتناع کرد."),
                    StoryParagraph("He said Elizabeth was not pretty enough.", "او گفت الیزابت به اندازه کافی زیبا نیست.")
                )
            ),
            StoryChapter(
                number = 2, title = "Mr. Darcy's Pride", titlePersian = "آقای دارسی مغرور",
                paragraphs = listOf(
                    StoryParagraph("Elizabeth heard what Darcy said.", "الیزابت شنید دارسی چه گفت."),
                    StoryParagraph("She did not forgive him.", "او نبخشیدش."),
                    StoryParagraph("She thought he was arrogant.", "او فکر می‌کرد او متکبر است."),
                    StoryParagraph("Darcy started to like Elizabeth.", "دارسی شروع کرد الیزابت را دوست داشته باشد."),
                    StoryParagraph("He admired her intelligence.", "او باهوشی‌اش را تحسین می‌کرد."),
                    StoryParagraph("But he did not show his feelings.", "اما احساساتش را نشان نمی‌داد."),
                    StoryParagraph("A young officer came to town.", "افسر جوانی به شهر آمد."),
                    StoryParagraph("His name was Mr. Wickham.", "اسمش آقای ویکهام بود."),
                    StoryParagraph("He was handsome and charming.", "او خوش‌قیافه و جذاب بود."),
                    StoryParagraph("He told Elizabeth a story about Darcy.", "او داستانی درباره دارسی به الیزابت گفت."),
                    StoryParagraph("He said Darcy had cheated him.", "او گفت دارسی به او ظلم کرده."),
                    StoryParagraph("Darcy had taken his inheritance.", "دارسی ارثش را گرفته بود."),
                    StoryParagraph("Elizabeth believed Wickham.", "الیزابت ویکهام را باور کرد."),
                    StoryParagraph("She hated Darcy even more.", "او بیشتر از دارسی متنفر شد."),
                    StoryParagraph("Then Bingley suddenly left the village.", "بعد بینگلی ناگهان دهکده را ترک کرد."),
                    StoryParagraph("He did not say goodbye to Jane.", "او از جین خداحافظی نکرد."),
                    StoryParagraph("Jane was heartbroken.", "جین دلشکسته شد."),
                    StoryParagraph("Elizabeth thought Darcy was behind it.", "الیزابت فکر کرد دارسی پشت این ماجراست."),
                    StoryParagraph("She was right.", "حق داشت."),
                    StoryParagraph("Darcy had convinced Bingley to leave.", "دارسی بینگلی را متقاعد کرده بود برود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Proposal", titlePersian = "رد پیشنهاد",
                paragraphs = listOf(
                    StoryParagraph("Elizabeth went to visit her friend Charlotte.", "الیزابت به دیدن دوستش شارلوت رفت."),
                    StoryParagraph("Charlotte had married Mr. Collins.", "شارلوت با آقای کالینز ازدواج کرده بود."),
                    StoryParagraph("Mr. Collins was a cousin of the Bennets.", "آقای کالینز پسرعموی بنت‌ها بود."),
                    StoryParagraph("He was boring and foolish.", "او خسته‌کننده و احمق بود."),
                    StoryParagraph("They lived near Darcy's estate.", "آن‌ها نزدیک ملک دارسی زندگی می‌کردند."),
                    StoryParagraph("One day, Darcy came to visit.", "یک روز، دارسی به دیدنشان آمد."),
                    StoryParagraph("He was nervous and strange.", "او مضطرب و عجیب بود."),
                    StoryParagraph("He asked Elizabeth to marry him.", "او از الیزابت خواست با او ازدواج کند."),
                    StoryParagraph("He said he loved her despite her family.", "او گفت با وجود خانواده‌اش دوستش دارد."),
                    StoryParagraph("Elizabeth was very angry.", "الیزابت خیلی عصبانی شد."),
                    StoryParagraph("She refused him immediately.", "او فوراً ردش کرد."),
                    StoryParagraph("She said he was arrogant and cruel.", "او گفت او متکبر و ظالم است."),
                    StoryParagraph("She blamed him for Jane's sadness.", "او برای غم جین سرزنشش کرد."),
                    StoryParagraph("She blamed him for Wickham's troubles.", "او برای مشکلات ویکهام سرزنشش کرد."),
                    StoryParagraph("Darcy was shocked by her words.", "دارسی از حرف‌هایش شوکه شد."),
                    StoryParagraph("He left the room quickly.", "او سریع اتاق را ترک کرد."),
                    StoryParagraph("But the next morning, he came back.", "اما صبح روز بعد، برگشت."),
                    StoryParagraph("He brought her a letter.", "او نامه‌ای برایش آورد."),
                    StoryParagraph("In the letter, he told her the truth.", "در نامه، حقیقت را به او گفت."),
                    StoryParagraph("Elizabeth realized she had been wrong.", "الیزابت فهمید اشتباه کرده.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Truth About Wickham", titlePersian = "نامه اعتراف",
                paragraphs = listOf(
                    StoryParagraph("In the letter, Darcy explained everything.", "در نامه، دارسی همه چیز را توضیح داد."),
                    StoryParagraph("Wickham had lied to Elizabeth.", "ویکهام به الیزابت دروغ گفته بود."),
                    StoryParagraph("Darcy had not cheated him.", "دارسی به او ظلم نکرده بود."),
                    StoryParagraph("Wickham had tried to run away with Darcy's sister.", "ویکهام تلاش کرده بود با خواهر دارسی فرار کند."),
                    StoryParagraph("She was only fifteen years old.", "او فقط پانزده سال داشت."),
                    StoryParagraph("Darcy had saved her just in time.", "دارسی به موقع نجاتش داده بود."),
                    StoryParagraph("About Jane, Darcy explained too.", "درباره جین، دارسی هم توضیح داد."),
                    StoryParagraph("He thought Jane did not love Bingley.", "او فکر می‌کرد جین بینگلی را دوست ندارد."),
                    StoryParagraph("So he advised Bingley to leave.", "پس به بینگلی توصیه کرد برود."),
                    StoryParagraph("Elizabeth was ashamed.", "الیزابت شرمنده شد."),
                    StoryParagraph("She had judged Darcy unfairly.", "او درباره دارسی ناعادلانه قضاوت کرده بود."),
                    StoryParagraph("She started to see him differently.", "او شروع کرد متفاوت دیدنش."),
                    StoryParagraph("She realized she loved him.", "او فهمید دوستش دارد."),
                    StoryParagraph("Months later, she visited Pemberley.", "ماه‌ها بعد، از پمبرلی دیدن کرد."),
                    StoryParagraph("Pemberley was Darcy's great house.", "پمبرلی خانه بزرگ دارسی بود."),
                    StoryParagraph("She was amazed by its beauty.", "او از زیبایی‌اش شگفت‌زده شد."),
                    StoryParagraph("The housekeeper praised Darcy.", "خانه‌دار دارسی را تحسین کرد."),
                    StoryParagraph("She said he was a good master.", "او گفت ارباب خوبی است."),
                    StoryParagraph("Then Darcy appeared suddenly.", "بعد دارسی ناگهان ظاهر شد."),
                    StoryParagraph("He was kind and polite to her.", "او با او مهربان و مؤدب بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "A Happy Ending", titlePersian = "ازدواج نهایی",
                paragraphs = listOf(
                    StoryParagraph("A terrible thing happened to the Bennet family.", "اتفاق وحشتناکی برای خانواده بنت افتاد."),
                    StoryParagraph("Lydia ran away with Wickham.", "لیدیا با ویکهام فرار کرد."),
                    StoryParagraph("She was only sixteen.", "او فقط شانزده سال داشت."),
                    StoryParagraph("The family was disgraced.", "خانواده بی‌آبرو شدند."),
                    StoryParagraph("But Darcy found them in London.", "اما دارسی آن‌ها را در لندن پیدا کرد."),
                    StoryParagraph("He paid Wickham to marry Lydia.", "او به ویکهام پول داد تا با لیدیا ازدواج کند."),
                    StoryParagraph("He saved the family's honor.", "او آبروی خانواده را نجات داد."),
                    StoryParagraph("Elizabeth found out about this later.", "الیزابت بعداً این را فهمید."),
                    StoryParagraph("She was deeply grateful.", "او عمیقاً سپاسگزار بود."),
                    StoryParagraph("Bingley returned and proposed to Jane.", "بینگلی برگشت و به جین پیشنهاد داد."),
                    StoryParagraph("Jane accepted happily.", "جین با خوشحالی قبول کرد."),
                    StoryParagraph("Then Darcy proposed to Elizabeth again.", "بعد دارسی دوباره به الیزابت پیشنهاد داد."),
                    StoryParagraph("This time, she accepted.", "این بار، او قبول کرد."),
                    StoryParagraph("They got married in a small ceremony.", "آن‌ها در مراسمی کوچک ازدواج کردند."),
                    StoryParagraph("The two couples lived happily.", "دو زوج خوشحال زندگی کردند."),
                    StoryParagraph("Mrs. Bennet was very proud.", "خانم بنت خیلی افتخار می‌کرد."),
                    StoryParagraph("Her daughters had married rich men.", "دخترانش با مردان ثروتمند ازدواج کرده بودند."),
                    StoryParagraph("Elizabeth and Darcy loved each other deeply.", "الیزابت و دارسی عمیقاً یکدیگر را دوست داشتند."),
                    StoryParagraph("Their love had grown from pride and prejudice.", "عشقشان از غرور و تعصب رشد کرده بود."),
                    StoryParagraph("And so the story ended happily.", "و اینگونه داستان با خوشحالی پایان یافت.")
                )
            )
        )
    )

    // ─────────────── ۳۰: جین ایر ───────────────
    private fun story30() = StoryContent(
        storyId = "int_jane_eyre_int",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Orphan Girl", titlePersian = "کودکی سخت",
                paragraphs = listOf(
                    StoryParagraph("Jane Eyre was an orphan.", "جین ایر یتیم بود."),
                    StoryParagraph("Both her parents had died.", "هر دو والدینش مرده بودند."),
                    StoryParagraph("She lived with her aunt, Mrs. Reed.", "او با خاله‌اش، خانم رید، زندگی می‌کرد."),
                    StoryParagraph("Her aunt did not love her.", "خاله‌اش دوستش نداشت."),
                    StoryParagraph("Her cousins were cruel to her.", "پسرعموهایش با او ظالم بودند."),
                    StoryParagraph("One day, her cousin John hit her.", "یک روز، پسرعمویش جان کتکش زد."),
                    StoryParagraph("Jane fought back.", "جین مقابله کرد."),
                    StoryParagraph("She was punished and locked in a room.", "او مجازات شد و در اتاقی حبس شد."),
                    StoryParagraph("The room was where her uncle died.", "اتاق جایی بود که عمویش مرده بود."),
                    StoryParagraph("Jane was terrified.", "جین وحشت کرد."),
                    StoryParagraph("She became very sick.", "او خیلی مریض شد."),
                    StoryParagraph("A doctor came to see her.", "دکتری به دیدنش آمد."),
                    StoryParagraph("He suggested sending her to school.", "او پیشنهاد کرد به مدرسه فرستاده شود."),
                    StoryParagraph("Mrs. Reed was happy to send her away.", "خانم رید خوشحال شد که او را بفرستد."),
                    StoryParagraph("Jane went to Lowood School.", "جین به مدرسه لووود رفت."),
                    StoryParagraph("The school was cold and strict.", "مدرسه سرد و سختگیر بود."),
                    StoryParagraph("The food was bad and there was little of it.", "غذا بد بود و کم."),
                    StoryParagraph("But Jane made a friend named Helen.", "اما جین دوستی به نام هلن پیدا کرد."),
                    StoryParagraph("Helen was kind and patient.", "هلن مهربان و صبور بود."),
                    StoryParagraph("She taught Jane about forgiveness.", "او به جین بخشش آموخت.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Governess of Thornfield", titlePersian = "معلم خانه",
                paragraphs = listOf(
                    StoryParagraph("Jane stayed at Lowood for eight years.", "جین هشت سال در لووود ماند."),
                    StoryParagraph("Six as a student and two as a teacher.", "شش سال شاگرد و دو سال معلم."),
                    StoryParagraph("Then she decided to leave.", "بعد تصمیم گرفت برود."),
                    StoryParagraph("She put an advertisement in the newspaper.", "او آگهی‌ای در روزنامه گذاشت."),
                    StoryParagraph("A woman replied from Thornfield Hall.", "زنی از تالار تورنفیلد جواب داد."),
                    StoryParagraph("Jane was hired as a governess.", "جین به عنوان معلم خانه استخدام شد."),
                    StoryParagraph("She had to teach a young French girl.", "او باید دختر کوچک فرانسوی را آموزش می‌داد."),
                    StoryParagraph("The girl's name was Adèle.", "اسم دختر آدل بود."),
                    StoryParagraph("Thornfield was a large old house.", "تورنفیلد خانه‌ای بزرگ و قدیمی بود."),
                    StoryParagraph("The housekeeper was named Mrs. Fairfax.", "خانه‌دار خانم فیرفکس نام داشت."),
                    StoryParagraph("She was kind and welcoming.", "او مهربان و خوش‌برخورد بود."),
                    StoryParagraph("The owner of the house was rarely there.", "صاحب خانه به‌ندرت آنجا بود."),
                    StoryParagraph("His name was Mr. Rochester.", "اسمش آقای روچستر بود."),
                    StoryParagraph("One winter evening, Jane heard a horse.", "یک عصر زمستانی، جین صدای اسبی شنید."),
                    StoryParagraph("A man had fallen on the icy road.", "مردی روی جاده یخ‌زده افتاده بود."),
                    StoryParagraph("Jane helped him.", "جین کمکش کرد."),
                    StoryParagraph("She did not know he was Mr. Rochester.", "او نمی‌دانست او آقای روچستر است."),
                    StoryParagraph("Later, she met him at the house.", "بعد، او را در خانه ملاقات کرد."),
                    StoryParagraph("He was a strange and moody man.", "او مردی عجیب و بداخلاق بود."),
                    StoryParagraph("But Jane liked his honesty.", "اما جین صداقتش را دوست داشت.")
                )
            ),
            StoryChapter(
                number = 3, title = "Love at Thornfield", titlePersian = "عشق آقای روچستر",
                paragraphs = listOf(
                    StoryParagraph("Jane and Mr. Rochester talked every evening.", "جین و آقای روچستر هر عصر صحبت می‌کردند."),
                    StoryParagraph("He told her about his travels.", "او از سفرهایش به او می‌گفت."),
                    StoryParagraph("She told him about her sad childhood.", "او از کودکی غمگینش به او می‌گفت."),
                    StoryParagraph("They understood each other deeply.", "آن‌ها عمیقاً یکدیگر را می‌فهمیدند."),
                    StoryParagraph("Strange things happened in the house.", "چیزهای عجیبی در خانه اتفاق می‌افتاد."),
                    StoryParagraph("Jane heard a strange laugh at night.", "جین شب‌ها صدای خنده عجیبی می‌شنید."),
                    StoryParagraph("One night, a fire started in Rochester's room.", "یک شب، آتشی در اتاق روچستر شروع شد."),
                    StoryParagraph("Jane saved his life.", "جین جانش را نجات داد."),
                    StoryParagraph("He was very grateful.", "او خیلی سپاسگزار بود."),
                    StoryParagraph("A guest came to stay at Thornfield.", "مهمانی به تورنفیلد آمد."),
                    StoryParagraph("Her name was Blanche Ingram.", "اسمش بلانش اینگرام بود."),
                    StoryParagraph("She was beautiful and rich.", "او زیبا و ثروتمند بود."),
                    StoryParagraph("Everyone thought Rochester would marry her.", "همه فکر می‌کردند روچستر با او ازدواج می‌کند."),
                    StoryParagraph("Jane was jealous but hid her feelings.", "جین حسادت کرد اما احساساتش را پنهان کرد."),
                    StoryParagraph("Then a stranger came to the house.", "بعد غریبه‌ای به خانه آمد."),
                    StoryParagraph("His name was Mr. Mason.", "اسمش آقای میسون بود."),
                    StoryParagraph("He came from the West Indies.", "او از هند غربی آمده بود."),
                    StoryParagraph("That night, a terrible scream was heard.", "آن شب، جیغ وحشتناکی شنیده شد."),
                    StoryParagraph("Mr. Mason had been attacked.", "آقای میسون مورد حمله قرار گرفته بود."),
                    StoryParagraph("Rochester asked Jane to keep it secret.", "روچستر از جین خواست آن را مخفی نگه دارد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Secret of the House", titlePersian = "راز عمارت",
                paragraphs = listOf(
                    StoryParagraph("Rochester asked Jane to marry him.", "روچستر از جین خواست با او ازدواج کند."),
                    StoryParagraph("Jane could not believe it.", "جین نمی‌توانست باورش کند."),
                    StoryParagraph("She thought he loved Blanche.", "او فکر می‌کرد بلانش را دوست دارد."),
                    StoryParagraph("But he said he loved only Jane.", "اما گفت فقط جین را دوست دارد."),
                    StoryParagraph("Jane accepted with joy.", "جین با خوشحالی قبول کرد."),
                    StoryParagraph("The wedding day was set.", "روز عروسی تعیین شد."),
                    StoryParagraph("But on the wedding day, a man appeared.", "اما روز عروسی، مردی ظاهر شد."),
                    StoryParagraph("He said the wedding could not happen.", "او گفت عروسی نمی‌تواند برگزار شود."),
                    StoryParagraph("He said Rochester was already married.", "او گفت روچستر قبلاً ازدواج کرده است."),
                    StoryParagraph("His wife was still alive.", "همسرش هنوز زنده است."),
                    StoryParagraph("She was the woman in the attic.", "او زن داخل اتاق زیرشیروانی بود."),
                    StoryParagraph("Her name was Bertha Mason.", "اسمش برتا میسون بود."),
                    StoryParagraph("She was insane and dangerous.", "او دیوانه و خطرناک بود."),
                    StoryParagraph("She had been locked in the attic for years.", "سال‌ها در اتاق زیرشیروانی حبس شده بود."),
                    StoryParagraph("Rochester had hidden her from everyone.", "روچستر او را از همه پنهان کرده بود."),
                    StoryParagraph("He had tried to marry Jane anyway.", "او تلاش کرده بود به هر حال با جین ازدواج کند."),
                    StoryParagraph("Jane was heartbroken.", "جین دلشکسته شد."),
                    StoryParagraph("She could not marry a married man.", "او نمی‌توانست با مرد متأهلی ازدواج کند."),
                    StoryParagraph("She refused to stay with him.", "او از ماندن با او امتناع کرد."),
                    StoryParagraph("That night, she ran away.", "آن شب، فرار کرد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Return to Love", titlePersian = "بازگشت به عشق",
                paragraphs = listOf(
                    StoryParagraph("Jane wandered alone for days.", "جین روزها تنها سرگردان بود."),
                    StoryParagraph("She had no money and no food.", "پول و غذا نداشت."),
                    StoryParagraph("She almost died from hunger.", "تقریباً از گرسنگی مرد."),
                    StoryParagraph("A family found her and took her in.", "خانواده‌ای او را پیدا کرد و پناهش داد."),
                    StoryParagraph("Their name was Rivers.", "اسمشان ریورز بود."),
                    StoryParagraph("There were two sisters and a brother.", "دو خواهر و یک برادر بودند."),
                    StoryParagraph("The brother's name was St. John.", "اسم برادر سنت جان بود."),
                    StoryParagraph("He was a serious young priest.", "او کشیش جوان جدی‌ای بود."),
                    StoryParagraph("Jane became a teacher in their village.", "جین در دهکده‌شان معلم شد."),
                    StoryParagraph("She inherited money from her uncle.", "او از عمویش پول به ارث برد."),
                    StoryParagraph("She found out the Rivers were her cousins.", "او فهمید ریورزها پسرعموهایش هستند."),
                    StoryParagraph("She shared the money with them.", "او پول را با آن‌ها تقسیم کرد."),
                    StoryParagraph("St. John asked her to marry him.", "سنت جان از او خواست با او ازدواج کند."),
                    StoryParagraph("But he did not love her.", "اما او دوستش نداشت."),
                    StoryParagraph("He wanted a wife for his work.", "او همسری برای کارش می‌خواست."),
                    StoryParagraph("Jane almost agreed.", "جین تقریباً موافقت کرد."),
                    StoryParagraph("Then she heard Rochester's voice calling her.", "بعد صدای روچستر را شنید که صدایش می‌زد."),
                    StoryParagraph("She went back to Thornfield.", "او به تورنفیلد برگشت."),
                    StoryParagraph("The house was in ruins.", "خانه در ویرانه بود."),
                    StoryParagraph("Bertha had set it on fire and died.", "برتا آن را آتش زد و مرد.")
                )
            )
        )
    )
}