package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group15 — ۵ داستان مبتدی
 * هر داستان: ۴ فصل × ۲۰ خط = ۸۰ خط
 * با ترجمه فارسی
 *
 * ۶۱. سگ و انعکاسش
 * ۶۲. مرغی که تخم طلا می‌گذاشت
 * ۶۳. موش و شیر
 * ۶۴. روباه و کلاغ
 * ۶۵. مورچه و کبوتر
 */
object Group15 {

    fun getAll(): List<StoryContent> = listOf(
        story61(), story62(), story63(), story64(), story65()
    )

    // ═══════════════════════════════════════════════════════
    //  ۶۱: سگ و انعکاسش
    // ═══════════════════════════════════════════════════════
    private fun story61() = StoryContent(
        storyId = "dog_and_reflection",
        chapters = listOf(
            StoryChapter(1, "The Greedy Dog", "سگ طمعکار", listOf(
                StoryParagraph("A dog was walking home one day.", "سگی یک روز به خانه می‌رفت."),
                StoryParagraph("He carried a big piece of meat in his mouth.", "تکه بزرگی گوشت در دهانش داشت."),
                StoryParagraph("He had found it in the market.", "آن را در بازار پیدا کرده بود."),
                StoryParagraph("He was very happy with his prize.", "از جایزه‌اش خیلی خوشحال بود."),
                StoryParagraph("He planned to eat it at home.", "قصد داشت در خانه بخوردش."),
                StoryParagraph("On the way, he crossed a small bridge.", "در راه، از پل کوچکی گذشت."),
                StoryParagraph("Under the bridge was a clear stream.", "زیر پل نهر زلالی بود."),
                StoryParagraph("The dog stopped to look at the water.", "سگ ایستاد تا به آب نگاه کند."),
                StoryParagraph("He saw his own reflection in the stream.", "انعکاس خودش را در نهر دید."),
                StoryParagraph("But he thought it was another dog.", "اما فکر کرد سگ دیگری است."),
                StoryParagraph("The other dog had a piece of meat too.", "سگ دیگر هم تکه گوشتی داشت."),
                StoryParagraph("It looked bigger than his own piece.", "به نظر بزرگ‌تر از تکه خودش بود."),
                StoryParagraph("The dog became jealous and angry.", "سگ حسود و عصبانی شد."),
                StoryParagraph("'I want that meat!' he thought.", "با خودش فکر کرد: «آن گوشت را می‌خواهم!»"),
                StoryParagraph("'Why should he have a bigger piece?'", "«چرا باید تکه بزرگ‌تری داشته باشد؟»"),
                StoryParagraph("He growled at the other dog.", "به سگ دیگر غرید."),
                StoryParagraph("But the other dog growled back.", "اما سگ دیگر هم غرید."),
                StoryParagraph("The dog became even angrier.", "سگ حتی عصبانی‌تر شد."),
                StoryParagraph("He decided to attack the other dog.", "تصمیم گرفت به سگ دیگر حمله کند."),
                StoryParagraph("He opened his mouth to bark loudly.", "دهانش را باز کرد تا بلند پارس کند.")
            )),
            StoryChapter(2, "The Lost Meat", "گوشت از دست رفته", listOf(
                StoryParagraph("The moment he opened his mouth,", "همان لحظه که دهانش را باز کرد،"),
                StoryParagraph("The meat fell into the water.", "گوشت در آب افتاد."),
                StoryParagraph("It sank to the bottom quickly.", "سریع به ته فرو رفت."),
                StoryParagraph("The dog lost his own meat.", "سگ گوشت خودش را از دست داد."),
                StoryParagraph("He tried to find it in the water.", "تلاش کرد در آب پیدایش کند."),
                StoryParagraph("But the stream was too deep.", "اما نهر خیلی عمیق بود."),
                StoryParagraph("The meat was gone forever.", "گوشت برای همیشه رفته بود."),
                StoryParagraph("The dog stood on the bridge sadly.", "سگ غمگین روی پل ایستاد."),
                StoryParagraph("He had no meat at all now.", "حالا هیچ گوشتی نداشت."),
                StoryParagraph("The other dog in the water was gone.", "سگ دیگر در آب رفته بود."),
                StoryParagraph("The dog realized his mistake.", "سگ اشتباهش را فهمید."),
                StoryParagraph("There was no other dog.", "سگ دیگری نبود."),
                StoryParagraph("It was only his own reflection.", "فقط انعکاس خودش بود."),
                StoryParagraph("He had lost his meat for nothing.", "گوشتش را بی‌دلیل از دست داده بود."),
                StoryParagraph("He walked home with an empty mouth.", "با دهان خالی به خانه رفت."),
                StoryParagraph("He was hungry and sad.", "گرسنه و غمگین بود."),
                StoryParagraph("He learned a hard lesson that day.", "آن روز درس سختی یاد گرفت."),
                StoryParagraph("Greed had cost him everything.", "طمع همه چیز را از او گرفته بود."),
                StoryParagraph("He wished he had been happy with what he had.", "آرزو کرد کاش به آنچه داشت راضی بود."),
                StoryParagraph("But it was too late now.", "اما حالا خیلی دیر بود.")
            )),
            StoryChapter(3, "The Lesson Learned", "درس آموخته شده", listOf(
                StoryParagraph("The next day, the dog found another piece of meat.", "روز بعد، سگ تکه گوشت دیگری پیدا کرد."),
                StoryParagraph("He carried it home carefully.", "با دقت به خانه بردش."),
                StoryParagraph("He crossed the same bridge again.", "دوباره از همان پل گذشت."),
                StoryParagraph("He saw his reflection in the water.", "انعکاسش را در آب دید."),
                StoryParagraph("But this time, he did not stop.", "اما این بار، نایستاد."),
                StoryParagraph("He kept walking with his meat.", "با گوشتش به راه رفتن ادامه داد."),
                StoryParagraph("'That is only my reflection,' he said.", "گفت: «آن فقط انعکاس منه.»"),
                StoryParagraph("'I will not be fooled again.'", "«دیگه فریب نمی‌خورم.»"),
                StoryParagraph("He reached home and ate his meat.", "به خانه رسید و گوشتش را خورد."),
                StoryParagraph("He felt happy and full.", "خوشحال و سیر احساس کرد."),
                StoryParagraph("He learned to be happy with what he had.", "یاد گرفت به آنچه دارد راضی باشد."),
                StoryParagraph("He never lost his food again.", "دیگر هرگز غذایش را از دست نداد."),
                StoryParagraph("Other dogs learned from his story.", "سگ‌های دیگر از داستانش یاد گرفتند."),
                StoryParagraph("They stopped being greedy too.", "آن‌ها هم طمعکار بودن را کنار گذاشتند."),
                StoryParagraph("The dog became wise and content.", "سگ عاقل و قانع شد."),
                StoryParagraph("He helped other dogs learn the lesson.", "او به سگ‌های دیگر کمک کرد درس را یاد بگیرند."),
                StoryParagraph("'Be happy with what you have,' he said.", "می‌گفت: «به آنچه داری راضی باش.»"),
                StoryParagraph("'Greed makes you lose everything.'", "«طمع همه چیزت را از دست می‌ده.»"),
                StoryParagraph("The dogs in the village lived in peace.", "سگ‌های روستا در آرامش زندگی کردند."),
                StoryParagraph("And no one lost their food anymore.", "و دیگر هیچ‌کس غذایش را از دست نداد.")
            )),
            StoryChapter(4, "The Final Lesson", "درس نهایی", listOf(
                StoryParagraph("Years passed and the dog grew old.", "سال‌ها گذشت و سگ پیر شد."),
                StoryParagraph("He had many puppies of his own.", "توله‌های زیادی از خودش داشت."),
                StoryParagraph("He told them his story many times.", "بارها داستانش را برایشان تعریف کرد."),
                StoryParagraph("'I lost my meat because of greed,' he said.", "می‌گفت: «گوشتم را به خاطر طمع از دست دادم.»"),
                StoryParagraph("'Do not make the same mistake.'", "«همین اشتباه را نکنید.»"),
                StoryParagraph("The puppies listened carefully.", "توله‌ها با دقت گوش دادند."),
                StoryParagraph("They promised to be content.", "قول دادند قانع باشند."),
                StoryParagraph("They grew up wise and happy.", "عاقل و خوشحال بزرگ شدند."),
                StoryParagraph("The story spread to other animals.", "داستان به حیوانات دیگر پخش شد."),
                StoryParagraph("Cats, birds, and rabbits heard it too.", "گربه‌ها، پرنده‌ها و خرگوش‌ها هم شنیدند."),
                StoryParagraph("They all learned about greed.", "همه درباره طمع یاد گرفتند."),
                StoryParagraph("The forest became a peaceful place.", "جنگل جای آرامی شد."),
                StoryParagraph("Animals shared food with each other.", "حیوانات غذا را با هم تقسیم کردند."),
                StoryParagraph("No one tried to take more than needed.", "هیچ‌کس تلاش نکرد بیشتر از نیازش بگیرد."),
                StoryParagraph("The old dog smiled with pride.", "سگ پیر با افتخار لبخند زد."),
                StoryParagraph("His lesson had changed many lives.", "درسش زندگی‌های زیادی را تغییر داده بود."),
                StoryParagraph("He died peacefully one day.", "یک روز آرام مرد."),
                StoryParagraph("All the animals came to say goodbye.", "همه حیوانات برای خداحافظی آمدند."),
                StoryParagraph("His story lived on forever.", "داستانش برای همیشه زنده ماند."),
                StoryParagraph("And so ends the story of the greedy dog.", "و اینگونه داستان سگ طمعکار به پایان می‌رسد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۶۲: مرغی که تخم طلا می‌گذاشت
    // ═══════════════════════════════════════════════════════
    private fun story62() = StoryContent(
        storyId = "goose_golden_eggs_v2",
        chapters = listOf(
            StoryChapter(1, "The Magic Hen", "مرغ جادویی", listOf(
                StoryParagraph("A farmer had a special hen.", "کشاورزی مرغ خاصی داشت."),
                StoryParagraph("She laid a golden egg every morning.", "او هر صبح یک تخم طلایی می‌گذاشت."),
                StoryParagraph("The farmer sold the eggs at the market.", "کشاورز تخم‌ها را در بازار می‌فروخت."),
                StoryParagraph("He became rich slowly but surely.", "او آرام اما مطمئن ثروتمند شد."),
                StoryParagraph("He had a nice house and good food.", "خانه خوب و غذای خوبی داشت."),
                StoryParagraph("His family lived comfortably.", "خانواده‌اش راحت زندگی می‌کردند."),
                StoryParagraph("But the farmer was never satisfied.", "اما کشاورز هرگز راضی نبود."),
                StoryParagraph("He always wanted more money.", "همیشه پول بیشتری می‌خواست."),
                StoryParagraph("'One egg a day is too slow,' he said.", "می‌گفت: «یک تخم در روز خیلی کمه.»"),
                StoryParagraph("'I want to become rich quickly.'", "«می‌خواهم سریع ثروتمند بشم.»"),
                StoryParagraph("His wife told him to be patient.", "همسرش به او گفت صبور باشد."),
                StoryParagraph("'We have enough,' she said kindly.", "مهربانانه گفت: «به اندازه کافی داریم.»"),
                StoryParagraph("'Be happy with what we have.'", "«به آنچه داریم راضی باش.»"),
                StoryParagraph("But the farmer did not listen.", "اما کشاورز گوش نداد."),
                StoryParagraph("He thought about the hen all day.", "تمام روز به مرغ فکر می‌کرد."),
                StoryParagraph("'The hen must be full of gold inside!'", "«مرغ باید داخلش پر از طلا باشه!»"),
                StoryParagraph("'Why wait for one egg each day?'", "«چرا برای یک تخم در روز صبر کنم؟»"),
                StoryParagraph("'I will take all the gold at once!'", "«همه طلا را یکجا می‌گیرم!»"),
                StoryParagraph("He made a terrible plan.", "نقشه وحشتناکی کشید."),
                StoryParagraph("He decided to cut open the hen.", "تصمیم گرفت مرغ را باز کند.")
            )),
            StoryChapter(2, "The Terrible Mistake", "اشتباه وحشتناک", listOf(
                StoryParagraph("The next morning, he took a knife.", "صبح روز بعد، چاقویی برداشت."),
                StoryParagraph("He went to the hen's coop.", "به قفس مرغ رفت."),
                StoryParagraph("The hen looked at him innocently.", "مرغ معصومانه به او نگاه کرد."),
                StoryParagraph("She did not know what was coming.", "او نمی‌دانست چه در پیش است."),
                StoryParagraph("The farmer raised the knife.", "کشاورز چاقو را بالا برد."),
                StoryParagraph("His wife screamed, 'No, stop!'", "همسرش فریاد زد: «نه، بس کن!»"),
                StoryParagraph("But it was too late.", "اما خیلی دیر بود."),
                StoryParagraph("The farmer cut open the hen.", "کشاورز مرغ را باز کرد."),
                StoryParagraph("He looked inside eagerly.", "با اشتیاق داخل را نگاه کرد."),
                StoryParagraph("But there was no gold!", "اما هیچ طلایی نبود!"),
                StoryParagraph("The hen was just like any other hen.", "مرغ دقیقاً مثل هر مرغ دیگری بود."),
                StoryParagraph("There was nothing special inside.", "هیچ چیز خاصی داخلش نبود."),
                StoryParagraph("The farmer stared in disbelief.", "کشاورز با ناباوری خیره شد."),
                StoryParagraph("He had killed the magic hen.", "او مرغ جادویی را کشته بود."),
                StoryParagraph("There would be no more golden eggs.", "دیگر تخم طلایی نخواهد بود."),
                StoryParagraph("He fell to his knees and cried.", "به زانو افتاد و گریه کرد."),
                StoryParagraph("'What have I done?' he shouted.", "فریاد زد: «چه کردم؟»"),
                StoryParagraph("His wife cried beside him.", "همسرش کنارش گریه کرد."),
                StoryParagraph("Their life would never be the same.", "زندگی‌شان هرگز مثل قبل نمی‌شد."),
                StoryParagraph("The farmer had lost everything.", "کشاورز همه چیز را از دست داده بود.")
            )),
            StoryChapter(3, "The Hard Times", "روزهای سخت", listOf(
                StoryParagraph("The farmer and his family became poor.", "کشاورز و خانواده‌اش فقیر شدند."),
                StoryParagraph("They sold their nice house.", "خانه خوبشان را فروختند."),
                StoryParagraph("They moved to a small hut.", "به کلبه کوچکی نقل مکان کردند."),
                StoryParagraph("They had little food to eat.", "غذای کمی برای خوردن داشتند."),
                StoryParagraph("The farmer worked hard in the fields.", "کشاورز در مزارع سخت کار کرد."),
                StoryParagraph("But it was never enough.", "اما هرگز کافی نبود."),
                StoryParagraph("He thought about the hen every day.", "هر روز به مرغ فکر می‌کرد."),
                StoryParagraph("He wished he could go back in time.", "آرزو می‌کرد کاش می‌توانست به گذشته برگردد."),
                StoryParagraph("His wife became sad and quiet.", "همسرش غمگین و ساکت شد."),
                StoryParagraph("Their children wore old clothes.", "فرزندانشان لباس‌های کهنه می‌پوشیدند."),
                StoryParagraph("The farmer learned a hard lesson.", "کشاورز درس سختی یاد گرفت."),
                StoryParagraph("'Greed destroys what we have,' he said.", "می‌گفت: «طمع آنچه داریم را نابود می‌کند.»"),
                StoryParagraph("'I should have been patient.'", "«باید صبور می‌بودم.»"),
                StoryParagraph("'I should have been grateful.'", "«باید سپاسگزار می‌بودم.»"),
                StoryParagraph("Years passed and the family survived.", "سال‌ها گذشت و خانواده زنده ماندند."),
                StoryParagraph("The children grew up and worked hard.", "بچه‌ها بزرگ شدند و سخت کار کردند."),
                StoryParagraph("They learned from their father's mistake.", "از اشتباه پدرشان یاد گرفتند."),
                StoryParagraph("They were never greedy.", "هرگز طمعکار نبودند."),
                StoryParagraph("They were always grateful.", "همیشه سپاسگزار بودند."),
                StoryParagraph("And they lived peacefully together.", "و با هم در آرامش زندگی کردند.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The farmer told his story to everyone.", "کشاورز داستانش را به همه گفت."),
                StoryParagraph("'Do not kill the goose that lays golden eggs,' he said.", "می‌گفت: «مرغی که تخم طلا می‌گذارد را نکش.»"),
                StoryParagraph("'Be patient and grateful for what you have.'", "«صبور و سپاسگزار آنچه داری باش.»"),
                StoryParagraph("'Greed will destroy your blessings.'", "«طمع برکاتت را نابود می‌کند.»"),
                StoryParagraph("People listened and learned.", "مردم گوش دادند و یاد گرفتند."),
                StoryParagraph("The story spread across the land.", "داستان در سراسر سرزمین پخش شد."),
                StoryParagraph("Parents told it to their children.", "والدین آن را برای فرزندانشان تعریف کردند."),
                StoryParagraph("Teachers told it to their students.", "معلمان آن را برای شاگردانشان تعریف کردند."),
                StoryParagraph("It became a famous story about greed.", "این داستان معروفی درباره طمع شد."),
                StoryParagraph("The farmer lived a long life.", "کشاورز زندگی طولانی داشت."),
                StoryParagraph("He was poor but wise.", "فقیر اما عاقل بود."),
                StoryParagraph("He helped others avoid his mistake.", "به دیگران کمک کرد از اشتباهش دوری کنند."),
                StoryParagraph("His children and grandchildren loved him.", "فرزندان و نوه‌هایش دوستش داشتند."),
                StoryParagraph("They learned patience and gratitude.", "آن‌ها صبر و سپاسگزاری یاد گرفتند."),
                StoryParagraph("The family lived in peace.", "خانواده در آرامش زندگی کردند."),
                StoryParagraph("They were grateful for every day.", "هر روز سپاسگزار بودند."),
                StoryParagraph("And they never forgot the golden hen.", "و هرگز مرغ طلایی را فراموش نکردند."),
                StoryParagraph("Contentment is the greatest wealth.", "قناعت بزرگ‌ترین ثروت است."),
                StoryParagraph("And so ends the story of the golden eggs.", "و اینگونه داستان تخم‌های طلایی به پایان می‌رسد."),
                StoryParagraph("May we all learn to be content.", "باشد که همه ما یاد بگیریم قانع باشیم.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۶۳: موش و شیر (روایت متفاوت)
    // ═══════════════════════════════════════════════════════
    private fun story63() = StoryContent(
        storyId = "mouse_and_lion_v2",
        chapters = listOf(
            StoryChapter(1, "The Forest King", "پادشاه جنگل", listOf(
                StoryParagraph("In a great forest lived a mighty lion.", "در جنگل بزرگی شیری توانا زندگی می‌کرد."),
                StoryParagraph("All the animals called him the king.", "همه حیوانات او را پادشاه می‌نامیدند."),
                StoryParagraph("He was strong, brave, and proud.", "او قوی، شجاع و مغرور بود."),
                StoryParagraph("One afternoon, he was sleeping deeply.", "یک بعدازظهر، عمیقاً خوابیده بود."),
                StoryParagraph("The sun was warm and the forest was quiet.", "خورشید گرم بود و جنگل آرام بود."),
                StoryParagraph("Suddenly, a tiny mouse ran by.", "ناگهان، موش کوچکی از آنجا دوید."),
                StoryParagraph("The mouse was playing with his friends.", "موش با دوستانش بازی می‌کرد."),
                StoryParagraph("He did not see the sleeping lion.", "او شیر خوابیده را ندید."),
                StoryParagraph("He ran right over the lion's paw.", "مستقیم روی پنجه شیر دوید."),
                StoryParagraph("The lion woke up with a start.", "شیر با تکان بیدار شد."),
                StoryParagraph("He caught the mouse in his big paw.", "موش را در پنجه بزرگش گرفت."),
                StoryParagraph("The mouse was terrified.", "موش وحشت کرد."),
                StoryParagraph("'Please do not eat me!' he begged.", "التماس کرد: «لطفاً منو نخور!»"),
                StoryParagraph("'I did not mean to wake you.'", "«قصد نداشتم بیدارت کنم.»"),
                StoryParagraph("The lion looked at the tiny mouse.", "شیر به موش کوچک نگاه کرد."),
                StoryParagraph("'You are so small,' said the lion.", "شیر گفت: «تو خیلی کوچکی.»"),
                StoryParagraph("'You are not even a snack for me.'", "«حتی یک لقمه هم برای من نیستی.»"),
                StoryParagraph("'Please let me go,' said the mouse.", "موش گفت: «لطفاً رهایم کن.»"),
                StoryParagraph("'One day, I will repay your kindness.'", "«یک روز، مهربانی‌ات را جبران می‌کنم.»"),
                StoryParagraph("The lion laughed loudly at this.", "شیر بلند به این خندید.")
            )),
            StoryChapter(2, "The Lion's Mercy", "رحمت شیر", listOf(
                StoryParagraph("'You? Help me?' said the lion.", "شیر گفت: «تو؟ کمک من؟»"),
                StoryParagraph("'That is a funny joke!'", "«این شوخی خنده‌داریه!»"),
                StoryParagraph("But the lion was not cruel.", "اما شیر بی‌رحم نبود."),
                StoryParagraph("He had a kind heart inside.", "او درونش قلب مهربانی داشت."),
                StoryParagraph("'Go, little mouse,' he said.", "گفت: «برو، موش کوچک.»"),
                StoryParagraph("'Enjoy your life in the forest.'", "«از زندگی‌ات در جنگل لذت ببر.»"),
                StoryParagraph("He opened his paw and set the mouse free.", "پنجه‌اش را باز کرد و موش را آزاد کرد."),
                StoryParagraph("The mouse bowed and thanked him.", "موش تعظیم کرد و تشکر کرد."),
                StoryParagraph("'I will never forget this,' said the mouse.", "موش گفت: «هرگز فراموش نمی‌کنم.»"),
                StoryParagraph("'I promise to help you one day.'", "«قول می‌دهم یک روز کمکت کنم.»"),
                StoryParagraph("The lion smiled and shook his head.", "شیر لبخند زد و سرش را تکان داد."),
                StoryParagraph("'You are very funny,' he said.", "گفت: «تو خیلی خنده‌داری.»"),
                StoryParagraph("Then he went back to sleep.", "بعد دوباره به خواب رفت."),
                StoryParagraph("The mouse ran back to his friends.", "موش به سمت دوستانش دوید."),
                StoryParagraph("He told them what happened.", "برایشان تعریف کرد چه شد."),
                StoryParagraph("'The lion let me go!' he said happily.", "با خوشحالی گفت: «شیر رهایم کرد!»"),
                StoryParagraph("His friends could not believe it.", "دوستانش نمی‌توانستند باورش کنند."),
                StoryParagraph("'Lions eat mice!' they said.", "گفتند: «شیرها موش‌ها را می‌خورند!»"),
                StoryParagraph("'This lion is different,' said the mouse.", "موش گفت: «این شیر فرق داره.»"),
                StoryParagraph("'He has a kind heart.'", "«قلب مهربانی داره.»")
            )),
            StoryChapter(3, "The Lion's Trouble", "مشکل شیر", listOf(
                StoryParagraph("Many months later, hunters came to the forest.", "ماه‌ها بعد، شکارچیانی به جنگل آمدند."),
                StoryParagraph("They set a strong net on the lion's path.", "تور قوی‌ای در مسیر شیر گذاشتند."),
                StoryParagraph("The lion walked right into the trap.", "شیر مستقیم به داخل تله رفت."),
                StoryParagraph("The net wrapped around his body.", "تور به دور بدنش پیچید."),
                StoryParagraph("He roared and struggled to be free.", "غرید و برای آزادی تقلا کرد."),
                StoryParagraph("But the net was too strong.", "اما تور خیلی قوی بود."),
                StoryParagraph("The more he struggled, the tighter it became.", "هر چه بیشتر تقلا می‌کرد، محکم‌تر می‌شد."),
                StoryParagraph("The hunters would return soon.", "شکارچیان به زودی برمی‌گشتند."),
                StoryParagraph("The lion was in great danger.", "شیر در خطر بزرگی بود."),
                StoryParagraph("He called for help with all his might.", "با تمام قدرتش کمک خواست."),
                StoryParagraph("The animals heard him but were afraid.", "حیوانات صدایش را شنیدند اما ترسیدند."),
                StoryParagraph("They did not know what to do.", "نمی‌دانستند چه کنند."),
                StoryParagraph("The elephant said, 'I cannot break the net.'", "فیل گفت: «نمی‌تونم تور را پاره کنم.»"),
                StoryParagraph("The bear said, 'I am not strong enough.'", "خرس گفت: «به اندازه کافی قوی نیستم.»"),
                StoryParagraph("The deer said, 'I am too afraid.'", "گوزن گفت: «خیلی ترسیده‌ام.»"),
                StoryParagraph("No one could help the mighty lion.", "هیچ‌کس نمی‌توانست به شیر توانا کمک کند."),
                StoryParagraph("But one small voice spoke up.", "اما صدای کوچکی بلند شد."),
                StoryParagraph("'I can help him!' said the mouse.", "موش گفت: «من می‌تونم کمکش کنم!»"),
                StoryParagraph("All the animals turned to look.", "همه حیوانات برگشتند و نگاه کردند."),
                StoryParagraph("'You? A tiny mouse?' they said.", "گفتند: «تو؟ یک موش کوچک؟»")
            )),
            StoryChapter(4, "The Promise Kept", "قول نگه داشته شده", listOf(
                StoryParagraph("The mouse ran to the trapped lion.", "موش به سمت شیر گرفتار دوید."),
                StoryParagraph("He began to bite the ropes with his small teeth.", "با دندان‌های کوچکش شروع کرد به جویدن طناب‌ها."),
                StoryParagraph("One rope broke, then another.", "یک طناب پاره شد، بعد یکی دیگر."),
                StoryParagraph("The mouse worked quickly and carefully.", "موش سریع و با دقت کار کرد."),
                StoryParagraph("The lion watched in amazement.", "شیر با شگفتی تماشا کرد."),
                StoryParagraph("The tiny mouse was saving his life!", "موش کوچک جانش را نجات می‌داد!"),
                StoryParagraph("The other animals came to help too.", "حیوانات دیگر هم برای کمک آمدند."),
                StoryParagraph("They pulled the net while the mouse bit.", "آن‌ها تور را کشیدند در حالی که موش می‌جوید."),
                StoryParagraph("Finally, the lion was free!", "بالاخره، شیر آزاد شد!"),
                StoryParagraph("He stood up and roared with joy.", "بلند شد و از شادی غرید."),
                StoryParagraph("The mouse was tired but happy.", "موش خسته اما خوشحال بود."),
                StoryParagraph("'You kept your promise,' said the lion.", "شیر گفت: «قولت را نگه داشتی.»"),
                StoryParagraph("'I was wrong to laugh at you.'", "«اشتباه کردم بهت خندیدم.»"),
                StoryParagraph("'You are small but very brave.'", "«تو کوچکی اما خیلی شجاعی.»"),
                StoryParagraph("The mouse smiled and bowed.", "موش لبخند زد و تعظیم کرد."),
                StoryParagraph("'A promise is a promise,' he said.", "گفت: «قول، قوله.»"),
                StoryParagraph("'I will always help my friends.'", "«همیشه به دوستانم کمک می‌کنم.»"),
                StoryParagraph("All the animals cheered for the mouse.", "همه حیوانات برای موش تشویق کردند."),
                StoryParagraph("The lion and mouse became best friends.", "شیر و موش بهترین دوستان شدند."),
                StoryParagraph("They helped each other from that day on.", "از آن روز به بعد به هم کمک کردند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۶۴: روباه و کلاغ
    // ═══════════════════════════════════════════════════════
    private fun story64() = StoryContent(
        storyId = "fox_and_crow",
        chapters = listOf(
            StoryChapter(1, "The Crow's Prize", "جایزه کلاغ", listOf(
                StoryParagraph("A crow was flying over the forest.", "کلاغی بر فراز جنگل پرواز می‌کرد."),
                StoryParagraph("She was looking for food.", "دنبال غذا می‌گشت."),
                StoryParagraph("Suddenly, she saw a piece of cheese.", "ناگهان، تکه پنیری دید."),
                StoryParagraph("It was on a windowsill.", "روی طاقچه پنجره‌ای بود."),
                StoryParagraph("The crow flew down and took it.", "کلاغ پایین پرواز کرد و برداشتش."),
                StoryParagraph("She was very happy with her prize.", "از جایزه‌اش خیلی خوشحال بود."),
                StoryParagraph("She flew to a tall tree.", "به درخت بلندی پرواز کرد."),
                StoryParagraph("She sat on a branch to eat the cheese.", "روی شاخه‌ای نشست تا پنیر را بخورد."),
                StoryParagraph("A hungry fox was walking below.", "روباه گرسنه‌ای پایین راه می‌رفت."),
                StoryParagraph("He saw the crow with the cheese.", "کلاغ را با پنیر دید."),
                StoryParagraph("His mouth began to water.", "دهانش آب افتاد."),
                StoryParagraph("'I want that cheese,' he thought.", "با خودش فکر کرد: «آن پنیر را می‌خواهم.»"),
                StoryParagraph("But the crow was high in the tree.", "اما کلاغ بالای درخت بود."),
                StoryParagraph("The fox could not climb the tree.", "روباه نمی‌توانست از درخت بالا برود."),
                StoryParagraph("So he thought of a clever plan.", "پس نقشه باهوشانه‌ای کشید."),
                StoryParagraph("He would use words, not force.", "او از کلمات استفاده می‌کرد، نه زور."),
                StoryParagraph("He walked under the tree and looked up.", "زیر درخت راه رفت و بالا نگاه کرد."),
                StoryParagraph("'Hello, beautiful crow!' he said.", "گفت: «سلام، کلاغ زیبا!»"),
                StoryParagraph("The crow looked down at him.", "کلاغ به او نگاه کرد."),
                StoryParagraph("But she did not say anything.", "اما چیزی نگفت.")
            )),
            StoryChapter(2, "The Flattery", "تعریف و تمجید", listOf(
                StoryParagraph("The fox smiled and continued.", "روباه لبخند زد و ادامه داد."),
                StoryParagraph("'You have the most beautiful feathers,' he said.", "گفت: «تو زیباترین پرها را داری.»"),
                StoryParagraph("'They shine like black diamonds.'", "«مثل الماس‌های سیاه می‌درخشند.»"),
                StoryParagraph("The crow felt proud and fluffed her feathers.", "کلاغ احساس غرور کرد و پرهایش را پف داد."),
                StoryParagraph("'Your eyes are bright and intelligent,' said the fox.", "روباه گفت: «چشمانت درخشان و باهوشه.»"),
                StoryParagraph("'You are truly the queen of birds.'", "«تو واقعاً ملکه پرنده‌هایی.»"),
                StoryParagraph("The crow liked these words very much.", "کلاغ این کلمات را خیلی دوست داشت."),
                StoryParagraph("She had never heard such praise.", "هرگز چنین تعریفی نشنیده بود."),
                StoryParagraph("'I am sure your voice is beautiful too,' said the fox.", "روباه گفت: «مطمئنم صدایت هم زیباست.»"),
                StoryParagraph("'Won't you sing for me, please?'", "«لطفاً برای من آواز نمی‌خونی؟»"),
                StoryParagraph("'I want to hear the sweetest voice in the forest.'", "«می‌خواهم شیرین‌ترین صدای جنگل را بشنوم.»"),
                StoryParagraph("The crow felt very flattered.", "کلاغ خیلی تعریف‌شده احساس کرد."),
                StoryParagraph("She forgot about the cheese in her beak.", "پنیر در منقارش را فراموش کرد."),
                StoryParagraph("She wanted to show off her voice.", "می‌خواست صدایش را نشان دهد."),
                StoryParagraph("She opened her beak to sing.", "منقارش را باز کرد تا آواز بخواند."),
                StoryParagraph("'Caw! Caw!' she cried loudly.", "بلند فریاد زد: «قار! قار!»"),
                StoryParagraph("The cheese fell from her beak.", "پنیر از منقارش افتاد."),
                StoryParagraph("It fell right into the fox's mouth.", "دقیقاً در دهان روباه افتاد."),
                StoryParagraph("The fox swallowed it in one bite.", "روباه با یک گاز قورتش داد."),
                StoryParagraph("The crow was left with nothing.", "کلاغ با هیچ چیز رها شد.")
            )),
            StoryChapter(3, "The Fox's Trick", "حقه روباه", listOf(
                StoryParagraph("The fox laughed and licked his lips.", "روباه خندید و لب‌هایش را لیسید."),
                StoryParagraph("'Thank you, dear crow,' he said.", "گفت: «ممنون، کلاغ عزیز.»"),
                StoryParagraph("'The cheese was delicious!'", "«پنیر خوشمزه بود!»"),
                StoryParagraph("The crow was shocked and angry.", "کلاغ شوکه و عصبانی شد."),
                StoryParagraph("She had been tricked by pretty words.", "با کلمات قشنگ فریب خورده بود."),
                StoryParagraph("'Give me back my cheese!' she shouted.", "فریاد زد: «پنیرم را پس بده!»"),
                StoryParagraph("But the fox was already walking away.", "اما روباه قبلاً داشت دور می‌شد."),
                StoryParagraph("'Never trust a flatterer,' said the fox.", "روباه گفت: «هرگز به چاپلوس اعتماد نکن.»"),
                StoryParagraph("'They only want what you have.'", "«آن‌ها فقط چیزی که داری را می‌خواهند.»"),
                StoryParagraph("The crow sat on the branch sadly.", "کلاغ غمگین روی شاخه نشست."),
                StoryParagraph("She had lost her cheese for nothing.", "پنیرش را بی‌دلیل از دست داده بود."),
                StoryParagraph("Her pride had made her foolish.", "غرورش او را احمق کرده بود."),
                StoryParagraph("She promised to be wiser next time.", "قول داد دفعه بعد عاقل‌تر باشد."),
                StoryParagraph("She would not listen to flattery.", "به چاپلوسی گوش نمی‌داد."),
                StoryParagraph("She would keep her food safe.", "غذایش را امن نگه می‌داشت."),
                StoryParagraph("She flew away to find more food.", "پرواز کرد تا غذای بیشتری پیدا کند."),
                StoryParagraph("She was sad but learned a lesson.", "غمگین بود اما درسی یاد گرفت."),
                StoryParagraph("'Pretty words can hide bad intentions,' she said.", "گفت: «کلمات قشنگ می‌توانند نیت بد را پنهان کنند.»"),
                StoryParagraph("She told her story to other birds.", "داستانش را به پرنده‌های دیگر گفت."),
                StoryParagraph("They learned from her mistake.", "آن‌ها از اشتباهش یاد گرفتند.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The fox became famous for his trick.", "روباه برای حقه‌اش معروف شد."),
                StoryParagraph("But no one trusted him anymore.", "اما دیگر هیچ‌کس به او اعتماد نکرد."),
                StoryParagraph("The animals avoided him.", "حیوانات از او دوری کردند."),
                StoryParagraph("He became lonely and sad.", "او تنها و غمگین شد."),
                StoryParagraph("The crow became wiser with time.", "کلاغ با گذشت زمان عاقل‌تر شد."),
                StoryParagraph("She taught her children to be careful.", "به فرزندانش یاد داد مراقب باشند."),
                StoryParagraph("'Do not trust people who praise too much,' she said.", "می‌گفت: «به افرادی که زیاد تعریف می‌کنند اعتماد نکنید.»"),
                StoryParagraph("'They may want something from you.'", "«ممکنه چیزی از شما بخواهند.»"),
                StoryParagraph("The little crows listened carefully.", "کلاغ‌های کوچک با دقت گوش دادند."),
                StoryParagraph("They became wise and cautious.", "آن‌ها عاقل و محتاط شدند."),
                StoryParagraph("They never lost their food to flattery.", "هرگز غذایشان را به خاطر چاپلوسی از دست ندادند."),
                StoryParagraph("The story spread across the forest.", "داستان در سراسر جنگل پخش شد."),
                StoryParagraph("All animals learned about flattery.", "همه حیوانات درباره چاپلوسی یاد گرفتند."),
                StoryParagraph("They became careful with sweet words.", "با کلمات شیرین محتاط شدند."),
                StoryParagraph("The forest became a wiser place.", "جنگل جای عاقلانه‌تری شد."),
                StoryParagraph("The fox eventually changed his ways.", "روباه در نهایت روشش را تغییر داد."),
                StoryParagraph("He became honest and kind.", "او صادق و مهربان شد."),
                StoryParagraph("The animals forgave him slowly.", "حیوانات آرام‌آرام بخشیدندش."),
                StoryParagraph("Flattery is a dangerous trap.", "چاپلوسی تله خطرناکی است."),
                StoryParagraph("And so ends the story of the fox and the crow.", "و اینگونه داستان روباه و کلاغ به پایان می‌رسد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۶۵: مورچه و کبوتر
    // ═══════════════════════════════════════════════════════
    private fun story65() = StoryContent(
        storyId = "ant_and_dove",
        chapters = listOf(
            StoryChapter(1, "The Ant's Trouble", "مشکل مورچه", listOf(
                StoryParagraph("A little ant was walking by a river.", "مورچه کوچکی کنار رودخانه راه می‌رفت."),
                StoryParagraph("She was looking for food.", "دنبال غذا می‌گشت."),
                StoryParagraph("The river was wide and fast.", "رودخانه پهن و سریع بود."),
                StoryParagraph("The ant was very thirsty.", "مورچه خیلی تشنه بود."),
                StoryParagraph("She went to the river to drink.", "به رودخانه رفت تا آب بنوشد."),
                StoryParagraph("But the ground was slippery.", "اما زمین لیز بود."),
                StoryParagraph("She slipped and fell into the water!", "لیز خورد و در آب افتاد!"),
                StoryParagraph("The river carried her away quickly.", "رودخانه سریع بردش."),
                StoryParagraph("The ant could not swim.", "مورچه نمی‌توانست شنا کند."),
                StoryParagraph("She struggled to stay above the water.", "تقلا کرد بالای آب بماند."),
                StoryParagraph("She cried for help.", "برای کمک فریاد زد."),
                StoryParagraph("But no one heard her.", "اما هیچ‌کس نشنیدش."),
                StoryParagraph("She was going to drown.", "می‌خواست غرق شود."),
                StoryParagraph("Her tiny legs were tired.", "پاهای کوچکش خسته شدند."),
                StoryParagraph("The water was cold and deep.", "آب سرد و عمیق بود."),
                StoryParagraph("She thought her life was over.", "فکر کرد زندگی‌اش تمام شده."),
                StoryParagraph("She felt very scared and alone.", "خیلی ترسیده و تنها احساس کرد."),
                StoryParagraph("She wished someone would help her.", "آرزو کرد کاش کسی کمکش کند."),
                StoryParagraph("Then she saw a dove above.", "بعد کبوتری در بالا دید."),
                StoryParagraph("The dove was sitting on a tree.", "کبوتر روی درختی نشسته بود.")
            )),
            StoryChapter(2, "The Kind Dove", "کبوتر مهربان", listOf(
                StoryParagraph("The dove saw the ant in trouble.", "کبوتر مورچه را در مشکل دید."),
                StoryParagraph("She felt sorry for the tiny ant.", "برای مورچه کوچک دلش سوخت."),
                StoryParagraph("She quickly flew down to help.", "سریع پایین پرواز کرد تا کمک کند."),
                StoryParagraph("She picked up a leaf with her beak.", "با منقارش برگی برداشت."),
                StoryParagraph("She dropped it into the water.", "آن را در آب انداخت."),
                StoryParagraph("The leaf floated near the ant.", "برگ نزدیک مورچه شنا کرد."),
                StoryParagraph("The ant climbed onto the leaf.", "مورچه روی برگ بالا رفت."),
                StoryParagraph("She was saved from the water.", "از آب نجات یافت."),
                StoryParagraph("The leaf carried her to the shore.", "برگ او را به ساحل برد."),
                StoryParagraph("The ant climbed onto dry land.", "مورچه روی خشکی بالا رفت."),
                StoryParagraph("She shook the water from her body.", "آب را از بدنش تکان داد."),
                StoryParagraph("She looked up at the kind dove.", "به کبوتر مهربان نگاه کرد."),
                StoryParagraph("'Thank you for saving my life!' she said.", "گفت: «ممنون که جانم را نجات دادی!»"),
                StoryParagraph("'I will never forget your kindness.'", "«هرگز مهربانی‌ات را فراموش نمی‌کنم.»"),
                StoryParagraph("The dove smiled gently.", "کبوتر ملایم لبخند زد."),
                StoryParagraph("'It was nothing,' she said.", "گفت: «هیچی نبود.»"),
                StoryParagraph("'I am glad you are safe.'", "«خوشحالم که در امنی.»"),
                StoryParagraph("'Be more careful next time,' she added.", "اضافه کرد: «دفعه بعد بیشتر مراقب باش.»"),
                StoryParagraph("The ant promised to be careful.", "مورچه قول داد مراقب باشد."),
                StoryParagraph("She thanked the dove once more.", "یک بار دیگر از کبوتر تشکر کرد.")
            )),
            StoryChapter(3, "The Hunter", "شکارچی", listOf(
                StoryParagraph("A few days later, the dove was resting.", "چند روز بعد، کبوتر استراحت می‌کرد."),
                StoryParagraph("She was sitting on a tree branch.", "روی شاخه درختی نشسته بود."),
                StoryParagraph("Below, a hunter walked quietly.", "پایین، شکارچی‌ای بی‌صدا راه می‌رفت."),
                StoryParagraph("He had a net and a gun.", "تور و تفنگی داشت."),
                StoryParagraph("He saw the dove on the branch.", "کبوتر را روی شاخه دید."),
                StoryParagraph("He aimed his net at her.", "تورش را به سمتش نشانه گرفت."),
                StoryParagraph("He was ready to throw it.", "آماده بود پرتش کند."),
                StoryParagraph("The dove did not see the hunter.", "کبوتر شکارچی را ندید."),
                StoryParagraph("She was looking the other way.", "به سمت دیگر نگاه می‌کرد."),
                StoryParagraph("She was in great danger.", "او در خطر بزرگی بود."),
                StoryParagraph("The ant was nearby, looking for food.", "مورچه نزدیک بود، دنبال غذا می‌گشت."),
                StoryParagraph("She saw the hunter and was afraid.", "شکارچی را دید و ترسید."),
                StoryParagraph("She remembered the dove's kindness.", "مهربانی کبوتر را به یاد آورد."),
                StoryParagraph("She had to help her friend.", "باید به دوستش کمک می‌کرد."),
                StoryParagraph("She ran quickly to the hunter.", "سریع به سمت شکارچی دوید."),
                StoryParagraph("She climbed up his leg.", "از پایش بالا رفت."),
                StoryParagraph("She bit him hard on the hand.", "دستش را محکم گاز گرفت."),
                StoryParagraph("The hunter cried out in pain.", "شکارچی از درد فریاد زد."),
                StoryParagraph("He dropped the net and the gun.", "تور و تفنگ را انداخت."),
                StoryParagraph("The dove heard the noise and flew away.", "کبوتر صدا را شنید و پرواز کرد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The dove was safe from the hunter.", "کبوتر از شکارچی در امان بود."),
                StoryParagraph("She looked down and saw the ant.", "پایین نگاه کرد و مورچه را دید."),
                StoryParagraph("She understood what had happened.", "فهمید چه اتفاقی افتاده."),
                StoryParagraph("She flew down to her friend.", "به سمت دوستش پرواز کرد."),
                StoryParagraph("'You saved my life!' said the dove.", "کبوتر گفت: «جانم را نجات دادی!»"),
                StoryParagraph("'Now we are even,' said the ant.", "مورچه گفت: «حالا مساوی شدیم.»"),
                StoryParagraph("'Kindness returns to those who give it.'", "«مهربانی به کسی که می‌دهد برمی‌گرده.»"),
                StoryParagraph("The dove nodded and smiled.", "کبوتر سر تکان داد و لبخند زد."),
                StoryParagraph("They became best friends.", "آن‌ها بهترین دوستان شدند."),
                StoryParagraph("They helped each other every day.", "هر روز به هم کمک می‌کردند."),
                StoryParagraph("The ant warned the dove of danger.", "مورچه کبوتر را از خطر آگاه می‌کرد."),
                StoryParagraph("The dove brought food to the ant.", "کبوتر برای مورچه غذا می‌آورد."),
                StoryParagraph("Their friendship grew stronger.", "دوستی‌شان قوی‌تر شد."),
                StoryParagraph("Other animals learned from them.", "حیوانات دیگر از آن‌ها یاد گرفتند."),
                StoryParagraph("'No act of kindness is too small,' they said.", "می‌گفتند: «هیچ عمل مهربانی خیلی کوچک نیست.»"),
                StoryParagraph("'Even a tiny ant can save a life.'", "«حتی یک مورچه کوچک می‌تونه جانی رو نجات بده.»"),
                StoryParagraph("The forest became a kinder place.", "جنگل جای مهربان‌تری شد."),
                StoryParagraph("All animals helped each other.", "همه حیوانات به هم کمک کردند."),
                StoryParagraph("Kindness is never wasted.", "مهربانی هرگز هدر نمی‌رود."),
                StoryParagraph("And so ends the story of the ant and the dove.", "و اینگونه داستان مورچه و کبوتر به پایان می‌رسد.")
            ))
        )
    )
}