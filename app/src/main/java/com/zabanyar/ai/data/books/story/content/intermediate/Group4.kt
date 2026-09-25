package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۴ — داستان‌های کلاسیک و ترسناک
 *  ۱۰. زن سفیدپوش
 *  ۱۱. پیچ گوشتی
 *  ۱۲. قلب افشاگر
 */
object Group4 {

    fun getAll(): List<StoryContent> = listOf(
        story10(),
        story11(),
        story12(),
    )

    // ─────────────── ۱۰: زن سفیدپوش ───────────────
    private fun story10() = StoryContent(
        storyId = "int_woman_white",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Mysterious Woman", titlePersian = "زن مرموز",
                paragraphs = listOf(
                    StoryParagraph("Walter Hartright was a young art teacher.", "والتر هارترایت معلم جوان هنر بود."),
                    StoryParagraph("One night, he was walking to London.", "یک شب، به سمت لندن راه می‌رفت."),
                    StoryParagraph("It was very late and the road was dark.", "خیلی دیر بود و جاده تاریک بود."),
                    StoryParagraph("Suddenly, a woman appeared in front of him.", "ناگهان، زنی جلویش ظاهر شد."),
                    StoryParagraph("She was dressed all in white.", "او تماماً سفید پوشیده بود."),
                    StoryParagraph("Her face was pale and she looked afraid.", "صورتش رنگ‌پریده بود و ترسیده به نظر می‌رسید."),
                    StoryParagraph("She asked him for help.", "او از او کمک خواست."),
                    StoryParagraph("She wanted to know the way to London.", "او می‌خواست راه لندن را بداند."),
                    StoryParagraph("Walter was surprised by her appearance.", "والتر از ظاهرش تعجب کرد."),
                    StoryParagraph("He asked if she was in trouble.", "او پرسید آیا مشکلی دارد."),
                    StoryParagraph("She said someone was following her.", "او گفت کسی دنبالش است."),
                    StoryParagraph("Walter offered to walk with her.", "والتر پیشنهاد کرد با او راه برود."),
                    StoryParagraph("But she refused and ran away.", "اما او قبول نکرد و فرار کرد."),
                    StoryParagraph("Walter watched her disappear into the night.", "والتر تماشا کرد که در شب ناپدید شد."),
                    StoryParagraph("The next day, he arrived at Limmeridge House.", "روز بعد، به خانه لایمریج رسید."),
                    StoryParagraph("He was hired to teach two young women.", "او استخدام شد تا به دو زن جوان آموزش دهد."),
                    StoryParagraph("Their names were Laura Fairlie and Marian Halcombe.", "اسم‌هایشان لورا فیرلی و ماریان هالکوم بود."),
                    StoryParagraph("Laura was beautiful and gentle.", "لورا زیبا و ملایم بود."),
                    StoryParagraph("Marian was clever and strong.", "ماریان باهوش و قوی بود."),
                    StoryParagraph("When Walter saw Laura, he was shocked.", "وقتی والتر لورا را دید، شوکه شد.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Secret Family", titlePersian = "راز خانوادگی",
                paragraphs = listOf(
                    StoryParagraph("Laura looked exactly like the woman in white.", "لورا دقیقاً شبیه زن سفیدپوش بود."),
                    StoryParagraph("Walter told Marian about the meeting.", "والتر به ماریان درباره آن ملاقات گفت."),
                    StoryParagraph("Marian was very interested.", "ماریان خیلی علاقه‌مند شد."),
                    StoryParagraph("She started to investigate.", "او شروع به تحقیق کرد."),
                    StoryParagraph("She found out about a girl named Anne Catherick.", "او درباره دختری به نام آن کاتریک فهمید."),
                    StoryParagraph("Anne had been in an asylum.", "آن در یک تیمارستان بوده است."),
                    StoryParagraph("She had escaped a few days ago.", "او چند روز پیش فرار کرده بود."),
                    StoryParagraph("Anne's mother had worked for Laura's father.", "مادر آن برای پدر لورا کار می‌کرد."),
                    StoryParagraph("There was a secret about Laura's family.", "رازی درباره خانواده لورا بود."),
                    StoryParagraph("Walter fell in love with Laura.", "والتر عاشق لورا شد."),
                    StoryParagraph("Laura also loved him.", "لورا هم او را دوست داشت."),
                    StoryParagraph("But Laura was engaged to another man.", "اما لورا با مرد دیگری نامزد بود."),
                    StoryParagraph("His name was Sir Percival Glyde.", "اسمش سر پرسیوال گلاید بود."),
                    StoryParagraph("He was a rich and important man.", "او مردی ثروتمند و مهم بود."),
                    StoryParagraph("But there was something strange about him.", "اما چیز عجیبی درباره‌اش بود."),
                    StoryParagraph("Anne Catherick was afraid of him.", "آن کاتریک از او می‌ترسید."),
                    StoryParagraph("She said he had done something terrible.", "او گفت او کار وحشتناکی کرده است."),
                    StoryParagraph("Laura didn't want to marry Percival.", "لورا نمی‌خواست با پرسیوال ازدواج کند."),
                    StoryParagraph("But her father had promised her to him.", "اما پدرش او را به او قول داده بود."),
                    StoryParagraph("The wedding was already planned.", "عروسی قبلاً برنامه‌ریزی شده بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Terrible Secret", titlePersian = "توطئه بزرگ",
                paragraphs = listOf(
                    StoryParagraph("Walter decided to leave Limmeridge.", "والتر تصمیم گرفت لایمریج را ترک کند."),
                    StoryParagraph("He could not stay and watch Laura marry.", "او نمی‌توانست بماند و ازدواج لورا را تماشا کند."),
                    StoryParagraph("He went to South America to work.", "او برای کار به آمریکای جنوبی رفت."),
                    StoryParagraph("Laura married Sir Percival.", "لورا با سر پرسیوال ازدواج کرد."),
                    StoryParagraph("Marian went to live with them.", "ماریان رفت تا با آن‌ها زندگی کند."),
                    StoryParagraph("Percival was cruel to Laura.", "پرسیوال با لورا ظالم بود."),
                    StoryParagraph("He wanted her money.", "او پول لورا را می‌خواست."),
                    StoryParagraph("A man named Count Fosco came to visit.", "مردی به نام کنت فوسکو به دیدنشان آمد."),
                    StoryParagraph("Fosco was fat and clever.", "فوسکو چاق و باهوش بود."),
                    StoryParagraph("But he was also evil.", "اما او شرور هم بود."),
                    StoryParagraph("He and Percival planned something terrible.", "او و پرسیوال چیز وحشتناکی نقشه کشیدند."),
                    StoryParagraph("Marian listened to them secretly.", "ماریان مخفیانه به آن‌ها گوش داد."),
                    StoryParagraph("She learned about their plan.", "او درباره نقشه‌شان فهمید."),
                    StoryParagraph("They wanted to switch Laura with Anne.", "آن‌ها می‌خواستند لورا را با آن عوض کنند."),
                    StoryParagraph("Anne was sick and would die soon.", "آن مریض بود و به زودی می‌مرد."),
                    StoryParagraph("If Anne died as Laura, Percival would get the money.", "اگر آن به جای لورا می‌مرد، پرسیوال پول را می‌گرفت."),
                    StoryParagraph("Marian was shocked by this plan.", "ماریان از این نقشه شوکه شد."),
                    StoryParagraph("She tried to stop them.", "او تلاش کرد جلویشان را بگیرد."),
                    StoryParagraph("But they locked her in a room.", "اما آن‌ها او را در اتاقی حبس کردند."),
                    StoryParagraph("They took Laura away.", "آن‌ها لورا را بردند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Escape", titlePersian = "حقیقت آشکار",
                paragraphs = listOf(
                    StoryParagraph("Marian escaped from the room.", "ماریان از اتاق فرار کرد."),
                    StoryParagraph("She looked everywhere for Laura.", "او همه‌جا دنبال لورا گشت."),
                    StoryParagraph("But Laura was gone.", "اما لورا رفته بود."),
                    StoryParagraph("Anne Catherick had died.", "آن کاتریک مرده بود."),
                    StoryParagraph("Everyone thought it was Laura who died.", "همه فکر کردند لورا مرده است."),
                    StoryParagraph("Laura was taken to an asylum.", "لورا به تیمارستان برده شد."),
                    StoryParagraph("She was called Anne Catherick there.", "او آنجا آن کاتریک نامیده می‌شد."),
                    StoryParagraph("Marian finally found her.", "ماریان بالاخره او را پیدا کرد."),
                    StoryParagraph("She took Laura away from the asylum.", "او لورا را از تیمارستان بیرون آورد."),
                    StoryParagraph("But Laura had lost her memory.", "اما لورا حافظه‌اش را از دست داده بود."),
                    StoryParagraph("She didn't remember who she was.", "او یادش نمی‌آمد کیست."),
                    StoryParagraph("Marian took care of her.", "ماریان از او مراقبت کرد."),
                    StoryParagraph("Then Walter Hartright returned.", "بعد والتر هارترایت برگشت."),
                    StoryParagraph("He had come back from South America.", "او از آمریکای جنوبی برگشته بود."),
                    StoryParagraph("He was shocked to see Laura's condition.", "او از دیدن وضعیت لورا شوکه شد."),
                    StoryParagraph("But he still loved her.", "اما هنوز او را دوست داشت."),
                    StoryParagraph("He decided to help her.", "او تصمیم گرفت کمکش کند."),
                    StoryParagraph("He started to investigate Percival.", "او شروع به تحقیق درباره پرسیوال کرد."),
                    StoryParagraph("He wanted to find the truth.", "او می‌خواست حقیقت را پیدا کند."),
                    StoryParagraph("He wanted to punish the guilty men.", "او می‌خواست مردان گناهکار را مجازات کند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Final Justice", titlePersian = "پایان خوش",
                paragraphs = listOf(
                    StoryParagraph("Walter found out about Percival's secret.", "والتر راز پرسیوال را فهمید."),
                    StoryParagraph("Percival was not really a nobleman.", "پرسیوال واقعاً نجیب‌زاده نبود."),
                    StoryParagraph("He had made a false document.", "او سندی جعلی ساخته بود."),
                    StoryParagraph("If anyone found out, he would go to prison.", "اگر کسی می‌فهمید، به زندان می‌رفت."),
                    StoryParagraph("Walter went to the church where the document was.", "والتر به کلیسایی رفت که سند آنجا بود."),
                    StoryParagraph("Percival was there too.", "پرسیوال هم آنجا بود."),
                    StoryParagraph("He tried to stop Walter.", "او تلاش کرد والتر را متوقف کند."),
                    StoryParagraph("But a fire started in the church.", "اما آتشی در کلیسا شروع شد."),
                    StoryParagraph("Percival died in the fire.", "پرسیوال در آتش مرد."),
                    StoryParagraph("Count Fosco ran away to France.", "کنت فوسکو به فرانسه فرار کرد."),
                    StoryParagraph("But Walter followed him.", "اما والتر دنبالش رفت."),
                    StoryParagraph("He found Fosco in Paris.", "او فوسکو را در پاریس پیدا کرد."),
                    StoryParagraph("Fosco was killed by a secret society.", "فوسکو توسط یک انجمن مخفی کشته شد."),
                    StoryParagraph("They were friends of Anne's mother.", "آن‌ها دوستان مادر آن بودند."),
                    StoryParagraph("Justice was finally done.", "عدالت بالاخره اجرا شد."),
                    StoryParagraph("Laura slowly got her memory back.", "لورا کم‌کم حافظه‌اش را به دست آورد."),
                    StoryParagraph("She remembered Walter.", "او والتر را به یاد آورد."),
                    StoryParagraph("They got married and had a son.", "آن‌ها ازدواج کردند و پسری داشتند."),
                    StoryParagraph("They lived a happy and peaceful life.", "آن‌ها زندگی خوش و آرامی داشتند."),
                    StoryParagraph("And the mystery was finally over.", "و معما بالاخره تمام شد.")
                )
            )
        )
    )

    // ─────────────── ۱۱: پیچ گوشتی ───────────────
    private fun story11() = StoryContent(
        storyId = "int_turn_screw",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The New Governess", titlePersian = "معلم خانه جدید",
                paragraphs = listOf(
                    StoryParagraph("A young woman was hired as a governess.", "زن جوانی به عنوان معلم خانه استخدام شد."),
                    StoryParagraph("She was the youngest daughter of a poor family.", "او کوچک‌ترین دختر یک خانواده فقیر بود."),
                    StoryParagraph("Her new job was at a large country house.", "شغل جدیدش در خانه‌ای بزرگ در روستا بود."),
                    StoryParagraph("The house was called Bly.", "اسم خانه بلی بود."),
                    StoryParagraph("She met the owner in London first.", "او اول صاحب خانه را در لندن ملاقات کرد."),
                    StoryParagraph("He was a handsome and charming man.", "او مردی خوش‌قیافه و جذاب بود."),
                    StoryParagraph("She fell in love with him immediately.", "او بلافاصله عاشقش شد."),
                    StoryParagraph("He asked her to take care of two children.", "او از او خواست از دو کودک مراقبت کند."),
                    StoryParagraph("The children were his niece and nephew.", "کودکان خواهرزاده و برادرزاده‌اش بودند."),
                    StoryParagraph("Their names were Flora and Miles.", "اسم‌هایشان فلورا و مایلز بود."),
                    StoryParagraph("Their parents had died in India.", "والدینشان در هند مرده بودند."),
                    StoryParagraph("The uncle did not want to see them.", "عمو نمی‌خواست آن‌ها را ببیند."),
                    StoryParagraph("He asked the governess never to write him.", "او از معلم خواست هرگز به او نامه ننویسد."),
                    StoryParagraph("She thought this was strange.", "او فکر کرد این عجیب است."),
                    StoryParagraph("But she agreed to the job anyway.", "اما به هر حال با شغل موافقت کرد."),
                    StoryParagraph("She traveled to Bly by train.", "او با قطار به بلی رفت."),
                    StoryParagraph("A kind housekeeper met her there.", "خانه‌داری مهربان آنجا از او استقبال کرد."),
                    StoryParagraph("The house was old and beautiful.", "خانه قدیمی و زیبا بود."),
                    StoryParagraph("But there was something sad about it.", "اما چیز غمگینی درباره آن بود."),
                    StoryParagraph("The governess felt a strange feeling.", "معلم احساس عجیبی داشت.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Strange Children", titlePersian = "دو کودک عجیب",
                paragraphs = listOf(
                    StoryParagraph("Flora was a sweet little girl.", "فلورا دختر کوچک شیرینی بود."),
                    StoryParagraph("She was always kind and obedient.", "او همیشه مهربان و مطیع بود."),
                    StoryParagraph("Miles was a handsome young boy.", "مایلز پسر جوان خوش‌قیافه‌ای بود."),
                    StoryParagraph("He was clever but sometimes strange.", "او باهوش اما گاهی عجیب بود."),
                    StoryParagraph("Both children were very polite.", "هر دو کودک خیلی مؤدب بودند."),
                    StoryParagraph("But they seemed too good.", "اما بیش از حد خوب به نظر می‌رسیدند."),
                    StoryParagraph("The governess loved them immediately.", "معلم بلافاصله دوستشان داشت."),
                    StoryParagraph("They became her whole world.", "آن‌ها تمام دنیایش شدند."),
                    StoryParagraph("One day, she received a letter.", "یک روز، نامه‌ای دریافت کرد."),
                    StoryParagraph("It was from Miles' school.", "از مدرسه مایلز بود."),
                    StoryParagraph("The school said Miles was expelled.", "مدرسه گفت مایلز اخراج شده است."),
                    StoryParagraph("But they did not say why.", "اما دلیلش را نگفتند."),
                    StoryParagraph("The governess was confused.", "معلم گیج شد."),
                    StoryParagraph("She asked Miles about it.", "او از مایلز پرسید."),
                    StoryParagraph("Miles said he didn't want to talk.", "مایلز گفت نمی‌خواهد صحبت کند."),
                    StoryParagraph("The governess did not push him.", "معلم فشارش نداد."),
                    StoryParagraph("But she felt something was wrong.", "اما حس کرد چیزی اشتباه است."),
                    StoryParagraph("The housekeeper told her strange stories.", "خانه‌دار داستان‌های عجیبی به او گفت."),
                    StoryParagraph("She talked about the old governess.", "او درباره معلم قبلی صحبت کرد."),
                    StoryParagraph("The old governess was named Miss Jessel.", "اسم معلم قبلی میس جسل بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Ghosts in the House", titlePersian = "ارواح در عمارت",
                paragraphs = listOf(
                    StoryParagraph("One evening, the governess saw a man.", "یک عصر، معلم مردی را دید."),
                    StoryParagraph("He was standing on top of the tower.", "او روی برج ایستاده بود."),
                    StoryParagraph("He looked at her very seriously.", "او با جدیت به او نگاه کرد."),
                    StoryParagraph("She went to see who he was.", "او رفت ببیند او کیست."),
                    StoryParagraph("But when she arrived, he was gone.", "اما وقتی رسید، او رفته بود."),
                    StoryParagraph("She asked the housekeeper about him.", "او از خانه‌دار درباره‌اش پرسید."),
                    StoryParagraph("The housekeeper was very surprised.", "خانه‌دار خیلی تعجب کرد."),
                    StoryParagraph("She said no man was in the house.", "او گفت هیچ مردی در خانه نیست."),
                    StoryParagraph("The governess described the man.", "معلم مرد را توصیف کرد."),
                    StoryParagraph("The housekeeper turned pale.", "خانه‌دار رنگ‌پریده شد."),
                    StoryParagraph("She said it was Peter Quint.", "او گفت پیتر کوینت است."),
                    StoryParagraph("But Peter Quint was dead.", "اما پیتر کوینت مرده بود."),
                    StoryParagraph("He was the old valet of the uncle.", "او خدمتکار قدیمی عمو بود."),
                    StoryParagraph("He had been a bad man.", "او مرد بدی بود."),
                    StoryParagraph("He had spent a lot of time with Miles.", "او زمان زیادی را با مایلز گذرانده بود."),
                    StoryParagraph("Some days later, she saw another ghost.", "چند روز بعد، روح دیگری دید."),
                    StoryParagraph("A woman in black was standing by the lake.", "زنی سیاه‌پوش کنار دریاچه ایستاده بود."),
                    StoryParagraph("The governess was sure it was Miss Jessel.", "معلم مطمئن بود میس جسل است."),
                    StoryParagraph("The ghosts were haunting the house.", "ارواح خانه را تسخیر کرده بودند."),
                    StoryParagraph("And they wanted the children.", "و آن‌ها کودکان را می‌خواستند.")
                )
            ),
            StoryChapter(
                number = 4, title = "Fear and Madness", titlePersian = "ترس و وحشت",
                paragraphs = listOf(
                    StoryParagraph("The governess was very afraid.", "معلم خیلی ترسیده بود."),
                    StoryParagraph("She wanted to protect the children.", "او می‌خواست از کودکان محافظت کند."),
                    StoryParagraph("But she was alone in the house.", "اما او در خانه تنها بود."),
                    StoryParagraph("The housekeeper didn't believe her.", "خانه‌دار او را باور نمی‌کرد."),
                    StoryParagraph("The children acted more and more strangely.", "کودکان عجیب‌تر و عجیب‌تر رفتار می‌کردند."),
                    StoryParagraph("Miles said strange things.", "مایلز چیزهای عجیب می‌گفت."),
                    StoryParagraph("Flora played by the lake alone.", "فلورا تنهایی کنار دریاچه بازی می‌کرد."),
                    StoryParagraph("The governess saw the ghosts more often.", "معلم ارواح را بیشتر می‌دید."),
                    StoryParagraph("She started to lose sleep.", "او شروع کرد به از دست دادن خواب."),
                    StoryParagraph("She became thin and tired.", "او لاغر و خسته شد."),
                    StoryParagraph("One night, she saw Miss Jessel in the classroom.", "یک شب، میس جسل را در کلاس دید."),
                    StoryParagraph("The ghost was sitting at her desk.", "روح پشت میزش نشسته بود."),
                    StoryParagraph("It was looking at her with hatred.", "با نفرت به او نگاه می‌کرد."),
                    StoryParagraph("The governess screamed and ran away.", "معلم جیغ زد و فرار کرد."),
                    StoryParagraph("She told the housekeeper again.", "او دوباره به خانه‌دار گفت."),
                    StoryParagraph("But the housekeeper said she was sick.", "اما خانه‌دار گفت او مریض است."),
                    StoryParagraph("The governess began to doubt herself.", "معلم شروع کرد به شک کردن به خودش."),
                    StoryParagraph("Maybe the ghosts were not real.", "شاید ارواح واقعی نبودند."),
                    StoryParagraph("Maybe she was going mad.", "شاید او داشت دیوانه می‌شد."),
                    StoryParagraph("But she could not leave the children.", "اما نمی‌توانست کودکان را ترک کند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Tragic Ending", titlePersian = "پایان مبهم",
                paragraphs = listOf(
                    StoryParagraph("One day, Flora went to the lake.", "یک روز، فلورا به دریاچه رفت."),
                    StoryParagraph("The governess followed her secretly.", "معلم مخفیانه دنبالش رفت."),
                    StoryParagraph("She saw Flora talking to the ghost.", "او دید فلورا با روح صحبت می‌کند."),
                    StoryParagraph("The ghost of Miss Jessel was there.", "روح میس جسل آنجا بود."),
                    StoryParagraph("The governess grabbed Flora and ran.", "معلم فلورا را گرفت و دوید."),
                    StoryParagraph("Flora was very upset.", "فلورا خیلی ناراحت بود."),
                    StoryParagraph("She said she never wanted to see the governess again.", "او گفت هرگز نمی‌خواهد معلم را دوباره ببیند."),
                    StoryParagraph("The housekeeper took Flora away.", "خانه‌دار فلورا را برد."),
                    StoryParagraph("Now the governess was alone with Miles.", "حالا معلم با مایلز تنها بود."),
                    StoryParagraph("That night, they talked in the study.", "آن شب، در اتاق مطالعه صحبت کردند."),
                    StoryParagraph("Miles asked her what she wanted.", "مایلز پرسید چه می‌خواهد."),
                    StoryParagraph("She said she wanted to talk about Quint.", "او گفت می‌خواهد درباره کوینت صحبت کند."),
                    StoryParagraph("Suddenly, Miles looked at the window.", "ناگهان، مایلز به پنجره نگاه کرد."),
                    StoryParagraph("The ghost of Peter Quint was there.", "روح پیتر کوینت آنجا بود."),
                    StoryParagraph("Miles screamed and pointed at it.", "مایلز جیغ زد و به آن اشاره کرد."),
                    StoryParagraph("The governess held him tightly.", "معلم او را محکم گرفت."),
                    StoryParagraph("She told him it was not real.", "او به او گفت واقعی نیست."),
                    StoryParagraph("But Miles kept staring at the window.", "اما مایلز به خیره شدن به پنجره ادامه داد."),
                    StoryParagraph("Then he stopped moving.", "بعد حرکت را متوقف کرد."),
                    StoryParagraph("His heart had stopped beating.", "قلبش از تپیدن ایستاد.")
                )
            )
        )
    )

    // ─────────────── ۱۲: قلب افشاگر ───────────────
    private fun story12() = StoryContent(
        storyId = "int_tell_tale_heart",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Old Man's Eye", titlePersian = "پیرمرد و چشم",
                paragraphs = listOf(
                    StoryParagraph("The narrator lived with an old man.", "راوی با پیرمردی زندگی می‌کرد."),
                    StoryParagraph("The old man had never hurt him.", "پیرمرد هرگز به او آسیب نرسانده بود."),
                    StoryParagraph("He had never been unkind.", "او هرگز بدرفتار نبود."),
                    StoryParagraph("But the narrator wanted to kill him.", "اما راوی می‌خواست او را بکشد."),
                    StoryParagraph("It was not for money or revenge.", "برای پول یا انتقام نبود."),
                    StoryParagraph("It was because of the old man's eye.", "به خاطر چشم پیرمرد بود."),
                    StoryParagraph("One of his eyes was like a vulture's.", "یکی از چشم‌هایش شبیه چشم کرکس بود."),
                    StoryParagraph("It was pale blue with a film over it.", "آبی روشن با پرده‌ای رویش بود."),
                    StoryParagraph("Every time the eye looked at him, he felt cold.", "هر بار که آن چشم به او نگاه می‌کرد، احساس سرما می‌کرد."),
                    StoryParagraph("So he decided to kill the old man.", "پس تصمیم گرفت پیرمرد را بکشد."),
                    StoryParagraph("But he wanted to do it carefully.", "اما می‌خواست با دقت انجامش دهد."),
                    StoryParagraph("He did not want to be caught.", "نمی‌خواست دستگیر شود."),
                    StoryParagraph("Every night, he watched the old man sleep.", "هر شب، پیرمرد را در خواب تماشا می‌کرد."),
                    StoryParagraph("He opened the door very slowly.", "در را خیلی آرام باز می‌کرد."),
                    StoryParagraph("It took him an hour to open it.", "یک ساعت طول می‌کشید تا بازش کند."),
                    StoryParagraph("He put his head inside the room.", "سرش را داخل اتاق می‌گذاشت."),
                    StoryParagraph("He wanted to see the eye.", "او می‌خواست چشم را ببیند."),
                    StoryParagraph("But the eye was always closed.", "اما چشم همیشه بسته بود."),
                    StoryParagraph("For seven nights, it was the same.", "هفت شب یکسان بود."),
                    StoryParagraph("Then on the eighth night, it was different.", "اما شب هشتم متفاوت بود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Night of the Murder", titlePersian = "شب قتل",
                paragraphs = listOf(
                    StoryParagraph("On the eighth night, the eye was open.", "شب هشتم، چشم باز بود."),
                    StoryParagraph("The narrator felt very happy.", "راوی خیلی خوشحال شد."),
                    StoryParagraph("Now he could finally kill the old man.", "حالا بالاخره می‌توانست پیرمرد را بکشد."),
                    StoryParagraph("But the old man woke up.", "اما پیرمرد بیدار شد."),
                    StoryParagraph("He sat up in bed and looked around.", "او در تخت نشست و به اطراف نگاه کرد."),
                    StoryParagraph("He could not see the narrator.", "او نمی‌توانست راوی را ببیند."),
                    StoryParagraph("But he felt that someone was there.", "اما حس می‌کرد یک نفر آنجاست."),
                    StoryParagraph("He asked who it was.", "او پرسید کیست."),
                    StoryParagraph("There was no answer.", "پاسخی نبود."),
                    StoryParagraph("The old man was afraid.", "پیرمرد ترسید."),
                    StoryParagraph("His heart started to beat faster.", "قلبش شروع به تندتر تپیدن کرد."),
                    StoryParagraph("The narrator could hear it clearly.", "راوی واضح می‌شنید."),
                    StoryParagraph("It sounded like a drum.", "شبیه طبل به نظر می‌رسید."),
                    StoryParagraph("It made the narrator even more excited.", "این راوی را حتی هیجان‌زده‌تر کرد."),
                    StoryParagraph("He stood still for a long time.", "او مدت زیادی بی‌حرکت ماند."),
                    StoryParagraph("Then he moved quickly.", "بعد سریع حرکت کرد."),
                    StoryParagraph("He pulled the old man onto the floor.", "پیرمرد را روی زمین کشید."),
                    StoryParagraph("He pulled the heavy bed on top of him.", "تخت سنگین را رویش کشید."),
                    StoryParagraph("The old man died immediately.", "پیرمرد فوراً مرد."),
                    StoryParagraph("The narrator was very calm.", "راوی خیلی آرام بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "Hiding the Body", titlePersian = "پنهان کردن جسد",
                paragraphs = listOf(
                    StoryParagraph("Now the narrator had to hide the body.", "حالا راوی باید جسد را پنهان می‌کرد."),
                    StoryParagraph("He decided to cut it into pieces.", "او تصمیم گرفت آن را تکه‌تکه کند."),
                    StoryParagraph("He cut off the head, arms, and legs.", "سر، دست‌ها و پاها را جدا کرد."),
                    StoryParagraph("Then he lifted three floorboards.", "بعد سه تخته کف را بلند کرد."),
                    StoryParagraph("He put the pieces under the floor.", "تکه‌ها را زیر کف گذاشت."),
                    StoryParagraph("He put the boards back carefully.", "تخته‌ها را با دقت برگرداند."),
                    StoryParagraph("No one could see anything.", "هیچ‌کس نمی‌توانست چیزی ببیند."),
                    StoryParagraph("There was no blood on the floor.", "خونی روی زمین نبود."),
                    StoryParagraph("The narrator cleaned everything.", "راوی همه چیز را تمیز کرد."),
                    StoryParagraph("It was four o'clock in the morning.", "ساعت چهار صبح بود."),
                    StoryParagraph("Everything was done.", "همه چیز انجام شده بود."),
                    StoryParagraph("He felt very proud of himself.", "او به خودش خیلی افتخار می‌کرد."),
                    StoryParagraph("He had been so clever.", "او خیلی باهوش بوده است."),
                    StoryParagraph("No one would ever know.", "هیچ‌کس هرگز نمی‌فهمید."),
                    StoryParagraph("He washed himself and put on clean clothes.", "خودش را شست و لباس تمیز پوشید."),
                    StoryParagraph("Then he heard a knock at the door.", "بعد صدای در زدن را شنید."),
                    StoryParagraph("Some policemen were there.", "چند پلیس آنجا بودند."),
                    StoryParagraph("A neighbor had heard a scream.", "همسایه‌ای صدای جیغی شنیده بود."),
                    StoryParagraph("The narrator smiled at them.", "راوی به آن‌ها لبخند زد."),
                    StoryParagraph("He invited them inside.", "او آن‌ها را به داخل دعوت کرد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Police Arrive", titlePersian = "ورود پلیس",
                paragraphs = listOf(
                    StoryParagraph("The policemen came into the house.", "پلیس‌ها وارد خانه شدند."),
                    StoryParagraph("They asked the narrator many questions.", "آن‌ها از راوی سوالات زیادی پرسیدند."),
                    StoryParagraph("He answered them easily.", "او راحت جوابشان را داد."),
                    StoryParagraph("He said the old man was in the country.", "او گفت پیرمرد در روستا است."),
                    StoryParagraph("The policemen believed him.", "پلیس‌ها او را باور کردند."),
                    StoryParagraph("They sat down to rest.", "آن‌ها نشستند تا استراحت کنند."),
                    StoryParagraph("They talked about small things.", "آن‌ها درباره چیزهای کوچک صحبت کردند."),
                    StoryParagraph("The narrator talked and laughed.", "راوی صحبت کرد و خندید."),
                    StoryParagraph("He was very friendly.", "او خیلی دوستانه بود."),
                    StoryParagraph("But then he started to feel strange.", "اما بعد شروع کرد به احساس عجیبی کردن."),
                    StoryParagraph("His ears began to ring.", "گوش‌هایش شروع کرد به زنگ زدن."),
                    StoryParagraph("He heard a strange sound.", "او صدای عجیبی شنید."),
                    StoryParagraph("It sounded like a heartbeat.", "شبیه تپش قلب بود."),
                    StoryParagraph("He looked around the room.", "او به اطراف اتاق نگاه کرد."),
                    StoryParagraph("But no one else heard it.", "اما هیچ‌کس دیگری آن را نمی‌شنید."),
                    StoryParagraph("The sound got louder and louder.", "صدا بلندتر و بلندتر شد."),
                    StoryParagraph("He started to sweat.", "او شروع کرد به عرق کردن."),
                    StoryParagraph("He talked faster to cover the sound.", "او تندتر صحبت کرد تا صدا را بپوشاند."),
                    StoryParagraph("But the policemen didn't notice.", "اما پلیس‌ها متوجه نشدند."),
                    StoryParagraph("He could not take it anymore.", "او دیگر نمی‌توانست تحمل کند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Madman's Confession", titlePersian = "اعتراف دیوانه",
                paragraphs = listOf(
                    StoryParagraph("The beating sound was getting louder.", "صدای تپش بلندتر می‌شد."),
                    StoryParagraph("The narrator could not control himself.", "راوی نمی‌توانست خودش را کنترل کند."),
                    StoryParagraph("He jumped up from his chair.", "او از صندلی‌اش پرید."),
                    StoryParagraph("He started to shout at the policemen.", "او شروع کرد به فریاد زدن سر پلیس‌ها."),
                    StoryParagraph("He said they were mocking him.", "او گفت آن‌ها مسخره‌اش می‌کنند."),
                    StoryParagraph("But they had not said anything.", "اما آن‌ها چیزی نگفته بودند."),
                    StoryParagraph("He told them to stop the noise.", "او به آن‌ها گفت صدا را متوقف کنند."),
                    StoryParagraph("The policemen looked confused.", "پلیس‌ها گیج به نظر می‌رسیدند."),
                    StoryParagraph("The narrator fell to his knees.", "راوی روی زانوهایش افتاد."),
                    StoryParagraph("He shouted that he had killed the old man.", "او فریاد زد که پیرمرد را کشته است."),
                    StoryParagraph("He told them where the body was.", "او به آن‌ها گفت جسد کجاست."),
                    StoryParagraph("He said the heart was beating under the floor.", "او گفت قلب زیر زمین می‌تپد."),
                    StoryParagraph("The policemen lifted the floorboards.", "پلیس‌ها تخته‌های کف را بلند کردند."),
                    StoryParagraph("The body was there, cut into pieces.", "جسد آنجا بود، تکه‌تکه شده."),
                    StoryParagraph("The narrator was arrested immediately.", "راوی بلافاصله دستگیر شد."),
                    StoryParagraph("He kept saying he was not mad.", "او مدام می‌گفت دیوانه نیست."),
                    StoryParagraph("But everyone knew the truth.", "اما همه حقیقت را می‌دانستند."),
                    StoryParagraph("Only a madman would confess like that.", "فقط یک دیوانه اینگونه اعتراف می‌کرد."),
                    StoryParagraph("His own heart had betrayed him.", "قلب خودش خیانتش کرده بود."),
                    StoryParagraph("And so the case was closed.", "و اینگونه پرونده بسته شد.")
                )
            )
        )
    )
}