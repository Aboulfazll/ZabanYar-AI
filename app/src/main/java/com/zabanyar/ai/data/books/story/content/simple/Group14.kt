package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group14 — ۵ داستان مبتدی
 * هر داستان: ۴ فصل × ۲۰ خط = ۸۰ خط
 * با ترجمه فارسی
 *
 * ۵۶. دو قورباغه
 * ۵۷. خرس و دو مسافر
 * ۵۸. دسته چوب
 * ۵۹. کشاورز و پسرانش
 * ۶۰. باد و خورشید
 */
object Group14 {

    fun getAll(): List<StoryContent> = listOf(
        story56(), story57(), story58(), story59(), story60()
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۶: دو قورباغه
    // ═══════════════════════════════════════════════════════
    private fun story56() = StoryContent(
        storyId = "two_frogs",
        chapters = listOf(
            StoryChapter(1, "The Two Frogs", "دو قورباغه", listOf(
                StoryParagraph("Two frogs lived in a small pond.", "دو قورباغه در برکه کوچکی زندگی می‌کردند."),
                StoryParagraph("The pond was their home for many years.", "برکه سال‌ها خانه‌شان بود."),
                StoryParagraph("But one hot summer, the pond dried up.", "اما یک تابستان گرم، برکه خشک شد."),
                StoryParagraph("There was no water left for them.", "هیچ آبی برایشان نمانده بود."),
                StoryParagraph("The two frogs had to find a new home.", "دو قورباغه باید خانه جدیدی پیدا می‌کردند."),
                StoryParagraph("They hopped away from their old pond.", "آن‌ها از برکه قدیمی‌شان دور شدند."),
                StoryParagraph("They traveled through fields and forests.", "از میان مزارع و جنگل‌ها سفر کردند."),
                StoryParagraph("After many days, they found a well.", "بعد از روزهای زیادی، چاهی پیدا کردند."),
                StoryParagraph("The well was deep and dark.", "چاه عمیق و تاریک بود."),
                StoryParagraph("There was water at the bottom.", "آب در ته آن بود."),
                StoryParagraph("One frog looked down and felt happy.", "یک قورباغه به پایین نگاه کرد و خوشحال شد."),
                StoryParagraph("'Come on! Let us jump in!' he said.", "گفت: «بیا! بپریم داخل!»"),
                StoryParagraph("'There is plenty of water down there.'", "«آب زیادی پایین هست.»"),
                StoryParagraph("The other frog was quiet and thoughtful.", "قورباغه دیگر ساکت و متفکر بود."),
                StoryParagraph("He looked at the deep well carefully.", "با دقت به چاه عمیق نگاه کرد."),
                StoryParagraph("'Wait a moment,' said the second frog.", "قورباغه دوم گفت: «یک لحظه صبر کن.»"),
                StoryParagraph("'What if the water dries up too?'", "«اگه آب این هم خشک بشه چی؟»"),
                StoryParagraph("'How will we get out then?'", "«بعد چطور بیرون بیایم؟»"),
                StoryParagraph("The first frog stopped and thought.", "قورباغه اول ایستاد و فکر کرد."),
                StoryParagraph("He realized his friend was right.", "فهمید دوستش درست می‌گوید.")
            )),
            StoryChapter(2, "The Wise Frog", "قورباغه عاقل", listOf(
                StoryParagraph("'You are right,' said the first frog.", "قورباغه اول گفت: «حق با توئه.»"),
                StoryParagraph("'It is too dangerous to jump in.'", "«پریدن داخل خیلی خطرناکه.»"),
                StoryParagraph("'We cannot see the bottom clearly.'", "«نمی‌تونیم تهش رو واضح ببینیم.»"),
                StoryParagraph("'What if there are snakes down there?'", "«اگه مارهایی پایین باشه چی؟»"),
                StoryParagraph("The two frogs sat and talked.", "دو قورباغه نشستند و صحبت کردند."),
                StoryParagraph("They made a smart plan together.", "با هم نقشه باهوشانه‌ای کشیدند."),
                StoryParagraph("'Let us look for a shallow pond,' said the wise frog.", "قورباغه عاقل گفت: «بیا دنبال برکه کم‌عمق بگردیم.»"),
                StoryParagraph("'A pond we can see and leave easily.'", "«برکه‌ای که بتونیم ببینیم و راحت ترکش کنیم.»"),
                StoryParagraph("They left the deep well behind.", "چاه عمیق را پشت سر گذاشتند."),
                StoryParagraph("They kept searching for many days.", "روزهای زیادی به جستجو ادامه دادند."),
                StoryParagraph("They crossed hills and small streams.", "از تپه‌ها و نهرهای کوچک گذشتند."),
                StoryParagraph("They met other animals on the way.", "در راه با حیوانات دیگر ملاقات کردند."),
                StoryParagraph("A turtle gave them good advice.", "لاک‌پشتی نصیحت خوبی به آن‌ها کرد."),
                StoryParagraph("'Look for a place with plants and trees,' she said.", "او گفت: «دنبال جایی با گیاهان و درختان بگردید.»"),
                StoryParagraph("'That means water is nearby.'", "«این یعنی آب نزدیکه.»"),
                StoryParagraph("The frogs thanked the turtle.", "قورباغه‌ها از لاک‌پشت تشکر کردند."),
                StoryParagraph("They followed her advice carefully.", "با دقت نصیحتش را دنبال کردند."),
                StoryParagraph("Finally, they found a beautiful pond.", "بالاخره، برکه زیبایی پیدا کردند."),
                StoryParagraph("It was shallow, clear, and full of life.", "کم‌عمق، شفاف و پر از زندگی بود."),
                StoryParagraph("The two frogs jumped in happily.", "دو قورباغه با خوشحالی داخل پریدند.")
            )),
            StoryChapter(3, "The New Home", "خانه جدید", listOf(
                StoryParagraph("The new pond was perfect for them.", "برکه جدید برایشان عالی بود."),
                StoryParagraph("There were lily pads and small fish.", "نیلوفرهای آبی و ماهی‌های کوچک بودند."),
                StoryParagraph("The water was cool and clean.", "آب خنک و تمیز بود."),
                StoryParagraph("The two frogs made it their home.", "دو قورباغه آن را خانه‌شان کردند."),
                StoryParagraph("They made new friends quickly.", "سریع دوستان جدیدی پیدا کردند."),
                StoryParagraph("Other frogs, fish, and turtles lived there.", "قورباغه‌ها، ماهی‌ها و لاک‌پشت‌های دیگر آنجا زندگی می‌کردند."),
                StoryParagraph("Everyone lived together in peace.", "همه با هم در آرامش زندگی می‌کردند."),
                StoryParagraph("The wise frog became a leader.", "قورباغه عاقل رهبر شد."),
                StoryParagraph("He helped solve problems in the pond.", "او کمک می‌کرد مشکلات برکه را حل کند."),
                StoryParagraph("The first frog learned from his friend.", "قورباغه اول از دوستش یاد گرفت."),
                StoryParagraph("He became wiser every day.", "او هر روز عاقل‌تر می‌شد."),
                StoryParagraph("They often talked about the deep well.", "آن‌ها اغلب درباره چاه عمیق صحبت می‌کردند."),
                StoryParagraph("'We almost made a big mistake,' said one.", "یکی گفت: «تقریباً اشتباه بزرگی کردیم.»"),
                StoryParagraph("'Thinking first saved us,' said the other.", "دیگری گفت: «اول فکر کردن نجاتمان داد.»"),
                StoryParagraph("The pond became a happy place.", "برکه جای شادی شد."),
                StoryParagraph("All the animals loved living there.", "همه حیوانات عاشق زندگی آنجا بودند."),
                StoryParagraph("The two frogs had many baby frogs.", "دو قورباغه بچه‌قورباغه‌های زیادی داشتند."),
                StoryParagraph("They taught them to think carefully.", "به آن‌ها یاد دادند با دقت فکر کنند."),
                StoryParagraph("And so the family grew and grew.", "و اینگونه خانواده رشد کرد و رشد کرد."),
                StoryParagraph("The story was told to every new frog.", "داستان برای هر قورباغه جدید تعریف شد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("Many years passed and the frogs grew old.", "سال‌های زیادی گذشت و قورباغه‌ها پیر شدند."),
                StoryParagraph("They had many grandchildren.", "نوه‌های زیادی داشتند."),
                StoryParagraph("They told them the story of the well.", "داستان چاه را برایشان تعریف کردند."),
                StoryParagraph("'Always look before you leap,' they said.", "می‌گفتند: «همیشه قبل از پریدن نگاه کن.»"),
                StoryParagraph("'Think about the future, not just now.'", "«به آینده فکر کن، نه فقط حالا.»"),
                StoryParagraph("'A quick decision can bring trouble.'", "«تصمیم سریع دردسر می‌آورد.»"),
                StoryParagraph("'But wise thinking brings safety.'", "«اما فکر عاقلانه امنیت می‌آورد.»"),
                StoryParagraph("The young frogs listened carefully.", "قورباغه‌های جوان با دقت گوش دادند."),
                StoryParagraph("They promised to be wise like their grandparents.", "قول دادند مثل پدربزرگ و مادربزرگشان عاقل باشند."),
                StoryParagraph("The wise frog died peacefully one day.", "قورباغه عاقل یک روز آرام مرد."),
                StoryParagraph("Everyone in the pond was sad.", "همه در برکه غمگین شدند."),
                StoryParagraph("But his wisdom lived on in them.", "اما خردش در آن‌ها زنده ماند."),
                StoryParagraph("They built a small statue for him.", "آن‌ها مجسمه کوچکی برایش ساختند."),
                StoryParagraph("It stood beside the beautiful pond.", "کنار برکه زیبا ایستاد."),
                StoryParagraph("Every frog remembered his lesson.", "هر قورباغه درسش را به یاد آورد."),
                StoryParagraph("They lived safely for many years.", "سال‌ها با امنیت زندگی کردند."),
                StoryParagraph("The pond stayed full of life and joy.", "برکه پر از زندگی و شادی ماند."),
                StoryParagraph("And the story was passed down forever.", "و داستان برای همیشه منتقل شد."),
                StoryParagraph("Always think before you act.", "همیشه قبل از عمل فکر کن."),
                StoryParagraph("And so ends the story of the two frogs.", "و اینگونه داستان دو قورباغه به پایان می‌رسد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۷: خرس و دو مسافر
    // ═══════════════════════════════════════════════════════
    private fun story57() = StoryContent(
        storyId = "bear_and_travelers",
        chapters = listOf(
            StoryChapter(1, "Two Friends on a Journey", "دو دوست در سفر", listOf(
                StoryParagraph("Two friends were walking through a forest.", "دو دوست در جنگلی راه می‌رفتند."),
                StoryParagraph("They were traveling to a faraway village.", "آن‌ها به روستای دوری سفر می‌کردند."),
                StoryParagraph("They promised to help each other always.", "قول دادند همیشه به هم کمک کنند."),
                StoryParagraph("'We are best friends forever,' said one.", "یکی گفت: «ما برای همیشه بهترین دوستیم.»"),
                StoryParagraph("'We will face any danger together.'", "«با هر خطری با هم روبرو می‌شویم.»"),
                StoryParagraph("The other nodded and smiled.", "دیگری سر تکان داد و لبخند زد."),
                StoryParagraph("They walked deeper into the forest.", "آن‌ها عمیق‌تر به جنگل رفتند."),
                StoryParagraph("The trees grew tall and dark.", "درختان بلند و تاریک شدند."),
                StoryParagraph("Strange sounds came from the shadows.", "صداهای عجیبی از سایه‌ها می‌آمد."),
                StoryParagraph("The friends held their bags tightly.", "دوستان کیف‌هایشان را محکم گرفتند."),
                StoryParagraph("Suddenly, they heard a loud growl.", "ناگهان، صدای غرش بلندی شنیدند."),
                StoryParagraph("A big bear came out of the bushes!", "خرس بزرگی از بوته‌ها بیرون آمد!"),
                StoryParagraph("It was huge, brown, and very scary.", "او بزرگ، قهوه‌ای و خیلی ترسناک بود."),
                StoryParagraph("The bear looked at them with dark eyes.", "خرس با چشمان تیره به آن‌ها نگاه کرد."),
                StoryParagraph("The two friends were very afraid.", "دو دوست خیلی ترسیدند."),
                StoryParagraph("They did not know what to do.", "نمی‌دانستند چه کنند."),
                StoryParagraph("One friend started to run away.", "یک دوست شروع کرد به فرار کردن."),
                StoryParagraph("He climbed a tree very fast.", "خیلی سریع از درختی بالا رفت."),
                StoryParagraph("He did not think about his friend.", "به دوستش فکر نکرد."),
                StoryParagraph("He only thought about saving himself.", "فقط به نجات خودش فکر کرد.")
            )),
            StoryChapter(2, "The Friend Who Stayed", "دوستی که ماند", listOf(
                StoryParagraph("The other friend could not climb trees.", "دوست دیگر نمی‌توانست از درخت بالا برود."),
                StoryParagraph("He did not know what to do.", "نمی‌دانست چه کند."),
                StoryParagraph("He remembered something he heard once.", "چیزی که یک بار شنیده بود به یاد آورد."),
                StoryParagraph("'Bears do not eat dead animals,' he thought.", "با خودش فکر کرد: «خرس‌ها حیوانات مرده را نمی‌خورند.»"),
                StoryParagraph("So he fell to the ground.", "پس روی زمین افتاد."),
                StoryParagraph("He lay very still, like a dead man.", "خیلی ساکن دراز کشید، مثل مرده."),
                StoryParagraph("He held his breath and closed his eyes.", "نفسش را حبس کرد و چشمانش را بست."),
                StoryParagraph("The bear came close to him.", "خرس نزدیکش آمد."),
                StoryParagraph("It sniffed his head and his ears.", "سر و گوش‌هایش را بو کرد."),
                StoryParagraph("It sniffed his arms and legs.", "دست‌ها و پاهایش را بو کرد."),
                StoryParagraph("The man did not move at all.", "مرد اصلاً حرکت نکرد."),
                StoryParagraph("The bear thought he was dead.", "خرس فکر کرد مرده است."),
                StoryParagraph("It turned and walked away slowly.", "برگشت و آرام دور شد."),
                StoryParagraph("It went back into the dark forest.", "به جنگل تاریک برگشت."),
                StoryParagraph("The friend in the tree came down.", "دوست روی درخت پایین آمد."),
                StoryParagraph("He was surprised to see his friend alive.", "از دیدن دوستش زنده تعجب کرد."),
                StoryParagraph("'How did you survive?' he asked.", "پرسید: «چطور زنده موندی؟»"),
                StoryParagraph("'The bear was so close to you!'", "«خرس خیلی بهت نزدیک بود!»"),
                StoryParagraph("'What did it say to you?'", "«بهت چی گفت؟»"),
                StoryParagraph("The friend stood up slowly.", "دوست آرام بلند شد.")
            )),
            StoryChapter(3, "The Truth", "حقیقت", listOf(
                StoryParagraph("'The bear gave me a good advice,' said the friend.", "دوست گفت: «خرس نصیحت خوبی به من کرد.»"),
                StoryParagraph("'It said something very important.'", "«چیز خیلی مهمی گفت.»"),
                StoryParagraph("'It said: do not trust friends who run away.'", "«گفت: به دوستانی که فرار می‌کنند اعتماد نکن.»"),
                StoryParagraph("The other friend felt ashamed.", "دوست دیگر خجالت زده شد."),
                StoryParagraph("He had left his friend in danger.", "او دوستش را در خطر رها کرده بود."),
                StoryParagraph("He had only thought about himself.", "فقط به خودش فکر کرده بود."),
                StoryParagraph("'I am sorry,' he said softly.", "آرام گفت: «متأسفم.»"),
                StoryParagraph("'I was too afraid to think clearly.'", "«خیلی ترسیده بودم که واضح فکر کنم.»"),
                StoryParagraph("The good friend listened quietly.", "دوست خوب بی‌صدا گوش داد."),
                StoryParagraph("He had been very hurt by the betrayal.", "او از این خیانت خیلی دل‌شکسته شده بود."),
                StoryParagraph("But he also understood human weakness.", "اما ضعف انسانی را هم می‌فهمید."),
                StoryParagraph("'Fear makes people do strange things,' he said.", "گفت: «ترس باعث می‌شود مردم کارهای عجیب بکنند.»"),
                StoryParagraph("'But a true friend never leaves you.'", "«اما دوست واقعی هرگز تو را رها نمی‌کند.»"),
                StoryParagraph("The other friend promised to change.", "دوست دیگر قول داد تغییر کند."),
                StoryParagraph("'I will prove I am a true friend,' he said.", "گفت: «ثابت می‌کنم دوست واقعی هستم.»"),
                StoryParagraph("They continued their journey together.", "آن‌ها سفرشان را با هم ادامه دادند."),
                StoryParagraph("The friend became braver and kinder.", "دوست شجاع‌تر و مهربان‌تر شد."),
                StoryParagraph("He protected his friend from then on.", "از آن به بعد از دوستش محافظت کرد."),
                StoryParagraph("They faced many dangers together.", "با هم با خطرات زیادی روبرو شدند."),
                StoryParagraph("And their friendship grew stronger.", "و دوستی‌شان قوی‌تر شد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The two friends reached the village safely.", "دو دوست سالم به روستا رسیدند."),
                StoryParagraph("They told their story to the villagers.", "داستانشان را به روستاییان گفتند."),
                StoryParagraph("'A true friend stays in hard times,' they said.", "گفتند: «دوست واقعی در سختی‌ها می‌ماند.»"),
                StoryParagraph("'A true friend never runs away.'", "«دوست واقعی هرگز فرار نمی‌کند.»"),
                StoryParagraph("The villagers learned a valuable lesson.", "روستاییان درس ارزشمندی یاد گرفتند."),
                StoryParagraph("They told the story to their children.", "داستان را به فرزندانشان گفتند."),
                StoryParagraph("'Misfortune shows who your real friends are.'", "«بدبختی نشان می‌دهد دوستان واقعی‌ات کی هستند.»"),
                StoryParagraph("The two friends lived in the village.", "دو دوست در روستا زندگی کردند."),
                StoryParagraph("They worked together and helped each other.", "با هم کار کردند و به هم کمک کردند."),
                StoryParagraph("Their friendship lasted a lifetime.", "دوستی‌شان یک عمر طول کشید."),
                StoryParagraph("They never faced danger alone again.", "دیگر هرگز تنها با خطر روبرو نشدند."),
                StoryParagraph("The story spread across the land.", "داستان در سراسر سرزمین پخش شد."),
                StoryParagraph("People told it in every village.", "مردم آن را در هر روستا تعریف کردند."),
                StoryParagraph("It became a famous tale of friendship.", "این افسانه معروفی از دوستی شد."),
                StoryParagraph("Children learned to be true friends.", "بچه‌ها یاد گرفتند دوستان واقعی باشند."),
                StoryParagraph("They never abandoned each other.", "آن‌ها هرگز همدیگر را رها نکردند."),
                StoryParagraph("And the world became a better place.", "و دنیا جای بهتری شد."),
                StoryParagraph("True friendship is the greatest treasure.", "دوستی واقعی بزرگ‌ترین گنج است."),
                StoryParagraph("And so ends the story of the bear and the travelers.", "و اینگونه داستان خرس و مسافران به پایان می‌رسد."),
                StoryParagraph("May we all find true friends.", "باشد که همه ما دوستان واقعی پیدا کنیم.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۸: دسته چوب
    // ═══════════════════════════════════════════════════════
    private fun story58() = StoryContent(
        storyId = "bundle_of_sticks",
        chapters = listOf(
            StoryChapter(1, "The Old Farmer", "کشاورز پیر", listOf(
                StoryParagraph("An old farmer lived in a small village.", "کشاورز پیری در روستای کوچکی زندگی می‌کرد."),
                StoryParagraph("He had four strong sons.", "او چهار پسر قوی داشت."),
                StoryParagraph("The sons worked on the farm together.", "پسران با هم در مزرعه کار می‌کردند."),
                StoryParagraph("But they always fought with each other.", "اما همیشه با هم دعوا می‌کردند."),
                StoryParagraph("They argued about everything.", "درباره همه چیز بحث می‌کردند."),
                StoryParagraph("They argued about work and money.", "درباره کار و پول بحث می‌کردند."),
                StoryParagraph("They argued about food and clothes.", "درباره غذا و لباس بحث می‌کردند."),
                StoryParagraph("The old farmer was very sad.", "کشاورز پیر خیلی غمگین بود."),
                StoryParagraph("He wanted his sons to work together.", "می‌خواست پسرانش با هم کار کنند."),
                StoryParagraph("But they never listened to him.", "اما آن‌ها هرگز به او گوش نمی‌دادند."),
                StoryParagraph("The farm was falling apart.", "مزرعه داشت از هم می‌پاشید."),
                StoryParagraph("The crops were not growing well.", "محصولات خوب رشد نمی‌کردند."),
                StoryParagraph("The animals were not taken care of.", "از حیوانات مراقبت نمی‌شد."),
                StoryParagraph("The farmer became sick with worry.", "کشاورز از نگرانی بیمار شد."),
                StoryParagraph("He knew he did not have much time.", "می‌دانست زمان زیادی ندارد."),
                StoryParagraph("He wanted to teach his sons one last lesson.", "می‌خواست آخرین درس را به پسرانش بیاموزد."),
                StoryParagraph("So he called them to his bedside.", "پس آن‌ها را به بالینش صدا زد."),
                StoryParagraph("'My sons,' he said weakly.", "ضعیف گفت: «پسرانم.»"),
                StoryParagraph("'I have something important to show you.'", "«چیز مهمی دارم که نشانتان دهم.»"),
                StoryParagraph("The sons came close and listened.", "پسران نزدیک آمدند و گوش دادند.")
            )),
            StoryChapter(2, "The Bundle of Sticks", "دسته چوب", listOf(
                StoryParagraph("The farmer asked for a bundle of sticks.", "کشاورز دسته‌ای چوب خواست."),
                StoryParagraph("His wife brought it to him.", "همسرش آن را برایش آورد."),
                StoryParagraph("The bundle had many thin sticks tied together.", "دسته چوب‌های نازک زیادی داشت که به هم بسته بودند."),
                StoryParagraph("'Take this bundle,' said the farmer to his oldest son.", "کشاورز به پسر بزرگش گفت: «این دسته را بگیر.»"),
                StoryParagraph("'Try to break it in half.'", "«تلاش کن نصفش کنی.»"),
                StoryParagraph("The oldest son tried with all his strength.", "پسر بزرگ با تمام قدرتش تلاش کرد."),
                StoryParagraph("But the bundle did not break.", "اما دسته نشکست."),
                StoryParagraph("He tried again and again.", "دوباره و دوباره تلاش کرد."),
                StoryParagraph("His face turned red from effort.", "صورتش از تلاش سرخ شد."),
                StoryParagraph("But still, the bundle stayed whole.", "اما باز هم، دسته سالم ماند."),
                StoryParagraph("The farmer called his second son.", "کشاورز پسر دومش را صدا زد."),
                StoryParagraph("'You try,' he said quietly.", "آرام گفت: «تو امتحان کن.»"),
                StoryParagraph("The second son took the bundle.", "پسر دوم دسته را گرفت."),
                StoryParagraph("He pulled and twisted and pushed.", "کشید و پیچاند و فشار داد."),
                StoryParagraph("But he could not break it either.", "اما او هم نمی‌توانست بشکندش."),
                StoryParagraph("The third and fourth sons tried too.", "پسر سوم و چهارم هم تلاش کردند."),
                StoryParagraph("All of them failed to break the bundle.", "همه‌شان در شکستن دسته شکست خوردند."),
                StoryParagraph("They were surprised and tired.", "آن‌ها متعجب و خسته بودند."),
                StoryParagraph("'How can this be?' they asked.", "پرسیدند: «چطور ممکنه؟»"),
                StoryParagraph("'These sticks are so thin!'", "«این چوب‌ها خیلی نازکن!»")
            )),
            StoryChapter(3, "One by One", "یکی‌یکی", listOf(
                StoryParagraph("The father smiled and untied the bundle.", "پدر لبخند زد و دسته را باز کرد."),
                StoryParagraph("He gave one stick to each son.", "به هر پسر یک چوب داد."),
                StoryParagraph("'Now break your stick,' he said.", "گفت: «حالا چوبت را بشکن.»"),
                StoryParagraph("Each son broke his stick easily.", "هر پسر به راحتی چوبش را شکست."),
                StoryParagraph("The sticks snapped in a second.", "چوب‌ها در یک لحظه شکستند."),
                StoryParagraph("'Do you see?' said the old farmer.", "کشاورز پیر گفت: «می‌بینید؟»"),
                StoryParagraph("'When the sticks are together, they are strong.'", "«وقتی چوب‌ها با هم هستند، قوی‌اند.»"),
                StoryParagraph("'When they are alone, they are weak.'", "«وقتی تنها هستند، ضعیف‌اند.»"),
                StoryParagraph("'You are like these sticks,' he said.", "گفت: «شما مثل این چوب‌ها هستید.»"),
                StoryParagraph("'If you stay together, no one can hurt you.'", "«اگه با هم بمانید، هیچ‌کس نمی‌تونه بهتون آسیب بزنه.»"),
                StoryParagraph("'But if you fight and separate,' he added.", "اضافه کرد: «اما اگه دعوا کنید و جدا شید.»"),
                StoryParagraph("'You will break like these sticks.'", "«مثل این چوب‌ها می‌شکنید.»"),
                StoryParagraph("The sons looked at each other.", "پسران به هم نگاه کردند."),
                StoryParagraph("They finally understood the lesson.", "بالاخره درس را فهمیدند."),
                StoryParagraph("'We are sorry, father,' they said.", "گفتند: «متأسفیم، پدر.»"),
                StoryParagraph("'We will stay together from now on.'", "«از حالا با هم می‌مانیم.»"),
                StoryParagraph("The old farmer smiled with relief.", "کشاورز پیر با آسودگی لبخند زد."),
                StoryParagraph("He closed his eyes peacefully.", "چشمانش را با آرامش بست."),
                StoryParagraph("He knew his sons would be fine.", "می‌دانست پسرانش خوب خواهند بود."),
                StoryParagraph("And so he passed away quietly.", "و اینگونه آرام از دنیا رفت.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The four sons kept their promise.", "چهار پسر قولشان را نگه داشتند."),
                StoryParagraph("They worked together on the farm.", "با هم در مزرعه کار کردند."),
                StoryParagraph("They stopped fighting with each other.", "دست از دعوا با هم کشیدند."),
                StoryParagraph("The farm became successful again.", "مزرعه دوباره موفق شد."),
                StoryParagraph("The crops grew tall and healthy.", "محصولات بلند و سالم رشد کردند."),
                StoryParagraph("The animals became strong and happy.", "حیوانات قوی و خوشحال شدند."),
                StoryParagraph("The village admired the four brothers.", "روستا چهار برادر را تحسین کرد."),
                StoryParagraph("People came to learn from them.", "مردم برای یادگیری از آن‌ها می‌آمدند."),
                StoryParagraph("The brothers shared their father's lesson.", "برادران درس پدرشان را به اشتراک گذاشتند."),
                StoryParagraph("'Unity is strength,' they always said.", "همیشه می‌گفتند: «اتحاد قدرت است.»"),
                StoryParagraph("'Together we can do anything.'", "«با هم می‌توانیم هر کاری بکنیم.»"),
                StoryParagraph("'Alone, we are weak and lost.'", "«تنها، ضعیف و گمشده‌ایم.»"),
                StoryParagraph("The story spread across the land.", "داستان در سراسر سرزمین پخش شد."),
                StoryParagraph("Parents told it to their children.", "والدین آن را برای فرزندانشان تعریف کردند."),
                StoryParagraph("Teachers told it to their students.", "معلمان آن را برای شاگردانشان تعریف کردند."),
                StoryParagraph("It became a famous story of unity.", "این داستان معروفی از اتحاد شد."),
                StoryParagraph("The bundle of sticks was kept forever.", "دسته چوب برای همیشه نگه داشته شد."),
                StoryParagraph("It hung on the wall of the farmhouse.", "روی دیوار خانه مزرعه آویزان شد."),
                StoryParagraph("As a reminder of the father's wisdom.", "به عنوان یادآوری خرد پدر."),
                StoryParagraph("And so ends the story of the bundle of sticks.", "و اینگونه داستان دسته چوب به پایان می‌رسد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۹: کشاورز و پسرانش
    // ═══════════════════════════════════════════════════════
    private fun story59() = StoryContent(
        storyId = "farmer_and_sons",
        chapters = listOf(
            StoryChapter(1, "The Hidden Treasure", "گنج پنهان", listOf(
                StoryParagraph("An old farmer lived with his three sons.", "کشاورز پیری با سه پسرش زندگی می‌کرد."),
                StoryParagraph("He worked hard all his life.", "او تمام عمرش سخت کار کرده بود."),
                StoryParagraph("But his sons were lazy and careless.", "اما پسرانش تنبل و بی‌دقت بودند."),
                StoryParagraph("They did not want to work on the farm.", "نمی‌خواستند در مزرعه کار کنند."),
                StoryParagraph("They spent their days sleeping and playing.", "روزهایشان را با خواب و بازی می‌گذراندند."),
                StoryParagraph("The farmer was very worried about them.", "کشاورز خیلی نگرانشان بود."),
                StoryParagraph("He knew the farm would fail without work.", "می‌دانست بدون کار مزرعه شکست می‌خورد."),
                StoryParagraph("One day, he became very sick.", "یک روز، خیلی مریض شد."),
                StoryParagraph("He called his three sons to him.", "سه پسرش را نزد خود صدا زد."),
                StoryParagraph("'My sons,' he said weakly.", "ضعیف گفت: «پسرانم.»"),
                StoryParagraph("'I have a secret to tell you.'", "«رازی دارم که بهتون بگم.»"),
                StoryParagraph("'There is a treasure buried in our field.'", "«گنجی در مزرعه‌مان دفن شده.»"),
                StoryParagraph("The sons' eyes opened wide.", "چشمان پسران گشاد شد."),
                StoryParagraph("'Where is it?' they asked excitedly.", "با هیجان پرسیدند: «کجاست؟»"),
                StoryParagraph("'I do not know the exact place,' said the farmer.", "کشاورز گفت: «جای دقیقش را نمی‌دانم.»"),
                StoryParagraph("'You must dig everywhere to find it.'", "«باید همه جا را بکنید تا پیدایش کنید.»"),
                StoryParagraph("Then the old farmer closed his eyes.", "بعد کشاورز پیر چشمانش را بست."),
                StoryParagraph("He passed away peacefully.", "آرام از دنیا رفت."),
                StoryParagraph("The sons were sad but also excited.", "پسران غمگین اما هیجان‌زده بودند."),
                StoryParagraph("They thought about the treasure.", "به گنج فکر کردند.")
            )),
            StoryChapter(2, "Digging for Treasure", "کندن برای گنج", listOf(
                StoryParagraph("The next morning, the sons took their shovels.", "صبح روز بعد، پسران بیل‌هایشان را برداشتند."),
                StoryParagraph("They went to the field to dig.", "به مزرعه رفتند تا بکنند."),
                StoryParagraph("They dug and dug for many hours.", "ساعت‌ها کندند و کندند."),
                StoryParagraph("They dug in one corner, then another.", "یک گوشه کندند، بعد گوشه دیگر."),
                StoryParagraph("But they found no treasure.", "اما گنجی پیدا نکردند."),
                StoryParagraph("They did not give up hope.", "امیدشان را از دست ندادند."),
                StoryParagraph("'It must be deeper!' said the oldest.", "بزرگ‌تر گفت: «باید عمیق‌تر باشه!»"),
                StoryParagraph("'Or maybe in another spot,' said the second.", "دومی گفت: «یا شاید جای دیگه.»"),
                StoryParagraph("They dug every part of the field.", "هر قسمت مزرعه را کندند."),
                StoryParagraph("They turned the soil upside down.", "خاک را زیر و رو کردند."),
                StoryParagraph("Days passed and they kept digging.", "روزها گذشت و به کندن ادامه دادند."),
                StoryParagraph("Weeks passed and still no treasure.", "هفته‌ها گذشت و هنوز گنجی نبود."),
                StoryParagraph("Their hands became rough and tired.", "دست‌هایشان زبر و خسته شد."),
                StoryParagraph("Their clothes became dirty and torn.", "لباس‌هایشان کثیف و پاره شد."),
                StoryParagraph("But they did not stop digging.", "اما دست از کندن نکشیدند."),
                StoryParagraph("They believed in their father's words.", "به حرف‌های پدرشان ایمان داشتند."),
                StoryParagraph("Finally, they dug the whole field.", "بالاخره، کل مزرعه را کندند."),
                StoryParagraph("But there was no treasure anywhere.", "اما هیچ گنجی هیچ جا نبود."),
                StoryParagraph("They were disappointed and tired.", "ناامید و خسته شدند."),
                StoryParagraph("They sat on the ground and thought.", "روی زمین نشستند و فکر کردند.")
            )),
            StoryChapter(3, "The Harvest", "برداشت", listOf(
                StoryParagraph("Spring came and the field was ready.", "بهار آمد و مزرعه آماده بود."),
                StoryParagraph("The soil was soft and rich from digging.", "خاک از کندن نرم و حاصلخیز بود."),
                StoryParagraph("The sons decided to plant seeds.", "پسران تصمیم گرفتند دانه بکارند."),
                StoryParagraph("They planted wheat in the field.", "آن‌ها در مزرعه گندم کاشتند."),
                StoryParagraph("The rain came and helped the seeds grow.", "باران آمد و به رشد دانه‌ها کمک کرد."),
                StoryParagraph("The sun shone warm and bright.", "خورشید گرم و درخشان تابید."),
                StoryParagraph("The wheat grew tall and golden.", "گندم بلند و طلایی شد."),
                StoryParagraph("The sons took care of the field.", "پسران از مزرعه مراقبت کردند."),
                StoryParagraph("They watered and weeded every day.", "هر روز آبیاری و وجین کردند."),
                StoryParagraph("They had never worked so hard before.", "هرگز اینقدر سخت کار نکرده بودند."),
                StoryParagraph("Summer came and the wheat was ready.", "تابستان آمد و گندم آماده بود."),
                StoryParagraph("The brothers harvested the golden wheat.", "برادران گندم طلایی را برداشت کردند."),
                StoryParagraph("They filled many bags with grain.", "کیسه‌های زیادی را با غله پر کردند."),
                StoryParagraph("They sold the wheat at the market.", "گندم را در بازار فروختند."),
                StoryParagraph("They earned a lot of money.", "پول زیادی به دست آوردند."),
                StoryParagraph("They looked at the gold coins.", "به سکه‌های طلا نگاه کردند."),
                StoryParagraph("'This is the treasure!' said the oldest.", "بزرگ‌تر گفت: «این همون گنجه!»"),
                StoryParagraph("'Father knew it all along,' said the second.", "دومی گفت: «پدر از اول می‌دونست.»"),
                StoryParagraph("'The treasure was the harvest,' said the youngest.", "کوچک‌تر گفت: «گنج همون برداشته.»"),
                StoryParagraph("They finally understood the lesson.", "بالاخره درس را فهمیدند.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The three brothers became hard workers.", "سه برادر کارگران سخت‌کوشی شدند."),
                StoryParagraph("They worked the farm every day.", "هر روز در مزرعه کار کردند."),
                StoryParagraph("The farm became rich and successful.", "مزرعه ثروتمند و موفق شد."),
                StoryParagraph("They never went hungry again.", "دیگر هرگز گرسنه نماندند."),
                StoryParagraph("They realized their father's wisdom.", "خرد پدرشان را درک کردند."),
                StoryParagraph("'Work is the real treasure,' they said.", "می‌گفتند: «کار گنج واقعیه.»"),
                StoryParagraph("'It gives us everything we need.'", "«هر چیزی که لازم داریم به ما می‌ده.»"),
                StoryParagraph("They taught this lesson to their children.", "این درس را به فرزندانشان آموختند."),
                StoryParagraph("'Do not wait for treasure to come to you.'", "«منتظر نباشید گنج به سراغتان بیاد.»"),
                StoryParagraph("'Work hard and make your own treasure.'", "«سخت کار کنید و گنج خودتان را بسازید.»"),
                StoryParagraph("The children learned and worked hard.", "بچه‌ها یاد گرفتند و سخت کار کردند."),
                StoryParagraph("The farm grew bigger and bigger.", "مزرعه بزرگ‌تر و بزرگ‌تر شد."),
                StoryParagraph("The family became famous for their success.", "خانواده برای موفقیتشان معروف شدند."),
                StoryParagraph("People came to learn from them.", "مردم برای یادگیری از آن‌ها می‌آمدند."),
                StoryParagraph("The brothers shared their story.", "برادران داستانشان را تعریف کردند."),
                StoryParagraph("'Our father gave us a great gift,' they said.", "می‌گفتند: «پدرمان هدیه بزرگی به ما داد.»"),
                StoryParagraph("'He taught us the value of hard work.'", "«ارزش کار سخت را به ما آموخت.»"),
                StoryParagraph("The story spread across the land.", "داستان در سراسر سرزمین پخش شد."),
                StoryParagraph("Hard work is the true treasure of life.", "کار سخت گنج واقعی زندگی است."),
                StoryParagraph("And so ends the story of the farmer and his sons.", "و اینگونه داستان کشاورز و پسرانش به پایان می‌رسد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۶۰: باد و خورشید
    // ═══════════════════════════════════════════════════════
    private fun story60() = StoryContent(
        storyId = "wind_and_sun",
        chapters = listOf(
            StoryChapter(1, "The Argument", "بحث", listOf(
                StoryParagraph("The Wind and the Sun were arguing one day.", "باد و خورشید یک روز بحث می‌کردند."),
                StoryParagraph("Each thought he was stronger than the other.", "هر کدام فکر می‌کرد از دیگری قوی‌تر است."),
                StoryParagraph("'I am the strongest!' said the Wind.", "باد گفت: «من قوی‌ترینم!»"),
                StoryParagraph("'I can blow down trees and houses!'", "«می‌توانم درختان و خانه‌ها را بیندازم!»"),
                StoryParagraph("'I can create storms and waves!'", "«می‌توانم طوفان و موج بسازم!»"),
                StoryParagraph("The Sun smiled and said nothing.", "خورشید لبخند زد و چیزی نگفت."),
                StoryParagraph("'You are quiet,' said the Wind.", "باد گفت: «تو ساکتی.»"),
                StoryParagraph("'Maybe you are weak and afraid!'", "«شاید ضعیف و ترسیده‌ای!»"),
                StoryParagraph("The Sun finally spoke softly.", "خورشید بالاخره آرام صحبت کرد."),
                StoryParagraph("'Strength is not only about power,' he said.", "گفت: «قدرت فقط درباره زور نیست.»"),
                StoryParagraph("'Sometimes gentleness is stronger.'", "«گاهی ملایمت قوی‌تره.»"),
                StoryParagraph("The Wind laughed loudly.", "باد بلند خندید."),
                StoryParagraph("'That is a silly idea!' he said.", "گفت: «این فکر احمقانه‌ایه!»"),
                StoryParagraph("'Let us have a contest,' said the Sun.", "خورشید گفت: «بیا مسابقه بدهیم.»"),
                StoryParagraph("'Do you see that traveler below?'", "«اون مسافر پایین رو می‌بینی؟»"),
                StoryParagraph("A man was walking on the road.", "مردی در جاده راه می‌رفت."),
                StoryParagraph("He wore a warm coat.", "او کاپشن گرمی پوشیده بود."),
                StoryParagraph("'Whoever makes him take off his coat wins,' said the Sun.", "خورشید گفت: «هر کس باعث شود کاپشنش را دربیاورد برنده است.»"),
                StoryParagraph("The Wind agreed to the contest.", "باد با مسابقه موافقت کرد."),
                StoryParagraph("'I will go first,' said the Wind.", "باد گفت: «من اول می‌رم.»")
            )),
            StoryChapter(2, "The Wind's Try", "تلاش باد", listOf(
                StoryParagraph("The Wind blew with all his might.", "باد با تمام قدرتش وزید."),
                StoryParagraph("He blew cold air from the north.", "هوای سرد از شمال وزید."),
                StoryParagraph("The man pulled his coat tighter.", "مرد کاپشنش را محکم‌تر کشید."),
                StoryParagraph("The Wind blew harder and harder.", "باد محکم‌تر و محکم‌تر وزید."),
                StoryParagraph("The trees bent and the leaves flew.", "درختان خم شدند و برگ‌ها پریدند."),
                StoryParagraph("The man's hat almost flew away.", "کلاه مرد تقریباً پرید."),
                StoryParagraph("But he held his coat tightly.", "اما کاپشنش را محکم گرفت."),
                StoryParagraph("The Wind became angry and blew more.", "باد عصبانی شد و بیشتر وزید."),
                StoryParagraph("He created a strong storm.", "طوفان قوی ایجاد کرد."),
                StoryParagraph("The man struggled to walk forward.", "مرد برای راه رفتن به جلو تلاش کرد."),
                StoryParagraph("But he did not take off his coat.", "اما کاپشنش را درنیاورد."),
                StoryParagraph("In fact, he wrapped it around himself.", "در واقع، آن را دور خودش پیچید."),
                StoryParagraph("'This coat is keeping me warm,' he said.", "گفت: «این کاپشن گرمم نگه می‌داره.»"),
                StoryParagraph("'I will never take it off in this wind.'", "«در این باد هرگز درش نمی‌آرم.»"),
                StoryParagraph("The Wind blew until he was tired.", "باد تا خسته شد وزید."),
                StoryParagraph("But the man still wore his coat.", "اما مرد هنوز کاپشنش را پوشیده بود."),
                StoryParagraph("Finally, the Wind gave up.", "بالاخره، باد تسلیم شد."),
                StoryParagraph("'I cannot do it,' he said, breathing hard.", "در حالی که نفس‌نفس می‌زد گفت: «نمی‌تونم.»"),
                StoryParagraph("'It is your turn now, Sun.'", "«حالا نوبت توئه، خورشید.»"),
                StoryParagraph("The Sun smiled and nodded.", "خورشید لبخند زد و سر تکان داد.")
            )),
            StoryChapter(3, "The Sun's Turn", "نوبت خورشید", listOf(
                StoryParagraph("The Sun came out from behind a cloud.", "خورشید از پشت ابری بیرون آمد."),
                StoryParagraph("He shone gently on the traveler.", "او ملایم بر مسافر تابید."),
                StoryParagraph("The man felt the warm sunlight.", "مرد نور گرم خورشید را حس کرد."),
                StoryParagraph("He looked up at the sky.", "به آسمان نگاه کرد."),
                StoryParagraph("'The weather is getting nicer,' he said.", "گفت: «هوا داره بهتر می‌شه.»"),
                StoryParagraph("The Sun shone a little warmer.", "خورشید کمی گرم‌تر تابید."),
                StoryParagraph("The man unbuttoned his coat.", "مرد دکمه‌های کاپشنش را باز کرد."),
                StoryParagraph("'It is becoming warm,' he said.", "گفت: «داره گرم می‌شه.»"),
                StoryParagraph("The Sun shone even warmer.", "خورشید حتی گرم‌تر تابید."),
                StoryParagraph("The man opened his coat wide.", "مرد کاپشنش را کاملاً باز کرد."),
                StoryParagraph("'This is a beautiful day,' he said happily.", "با خوشحالی گفت: «روز زیباییه.»"),
                StoryParagraph("The Sun shone brighter and warmer.", "خورشید درخشان‌تر و گرم‌تر تابید."),
                StoryParagraph("The man began to sweat.", "مرد شروع کرد به عرق کردن."),
                StoryParagraph("'It is too hot!' he said.", "گفت: «خیلی گرمه!»"),
                StoryParagraph("He took off his coat at last.", "بالاخره کاپشنش را درآورد."),
                StoryParagraph("He folded it and carried it on his arm.", "آن را تا کرد و روی بازویش حمل کرد."),
                StoryParagraph("He walked happily down the road.", "با خوشحالی در جاده راه رفت."),
                StoryParagraph("The Sun had won the contest.", "خورشید مسابقه را برده بود."),
                StoryParagraph("The Wind was surprised and quiet.", "باد متعجب و ساکت بود."),
                StoryParagraph("He finally understood the lesson.", "بالاخره درس را فهمید.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("'You were right, Sun,' said the Wind.", "باد گفت: «حق با تو بود، خورشید.»"),
                StoryParagraph("'Gentleness is stronger than force.'", "«ملایمت از زور قوی‌تره.»"),
                StoryParagraph("'I tried to force him and failed.'", "«تلاش کردم مجبورش کنم و شکست خوردم.»"),
                StoryParagraph("'You were gentle and won.'", "«تو ملایم بودی و بردی.»"),
                StoryParagraph("The Sun smiled kindly.", "خورشید مهربانانه لبخند زد."),
                StoryParagraph("'We are both needed in the world,' he said.", "گفت: «ما هر دو در دنیا لازمیم.»"),
                StoryParagraph("'You bring rain and cool the earth.'", "«تو باران می‌آوری و زمین را خنک می‌کنی.»"),
                StoryParagraph("'I bring light and warmth.'", "«من نور و گرما می‌آورم.»"),
                StoryParagraph("'Together, we help all living things.'", "«با هم، به همه موجودات زنده کمک می‌کنیم.»"),
                StoryParagraph("The Wind nodded and felt better.", "باد سر تکان داد و بهتر شد."),
                StoryParagraph("They became friends from that day.", "از آن روز دوست شدند."),
                StoryParagraph("They worked together for the earth.", "با هم برای زمین کار کردند."),
                StoryParagraph("The story spread across the world.", "داستان در سراسر جهان پخش شد."),
                StoryParagraph("Parents told it to their children.", "والدین آن را به فرزندانشان تعریف کردند."),
                StoryParagraph("'Gentleness wins more than force,' they said.", "می‌گفتند: «ملایمت بیشتر از زور می‌برد.»"),
                StoryParagraph("'Kindness opens more doors than anger.'", "«مهربانی بیشتر از خشم درها را باز می‌کند.»"),
                StoryParagraph("Children learned to be gentle and kind.", "بچه‌ها یاد گرفتند ملایم و مهربان باشند."),
                StoryParagraph("The world became a better place.", "دنیا جای بهتری شد."),
                StoryParagraph("And the Sun and Wind lived in peace.", "و خورشید و باد در آرامش زندگی کردند."),
                StoryParagraph("And so ends the story of the wind and the sun.", "و اینگونه داستان باد و خورشید به پایان می‌رسد.")
            ))
        )
    )
}