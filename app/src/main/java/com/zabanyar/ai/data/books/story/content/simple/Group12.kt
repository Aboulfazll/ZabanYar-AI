package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group12 — ۵ داستان مبتدی
 * هر داستان: ۴ فصل × ۲۰ خط = ۸۰ خط
 * با ترجمه فارسی
 *
 * ۴۶. شیر و موش
 * ۴۷. لاک‌پشت و خرگوش
 * ۴۸. پسرک چوپان دروغگو
 * ۴۹. روباه و انگور
 * ۵۰. مورچه و ملخ
 */
object Group12 {

    fun getAll(): List<StoryContent> = listOf(
        story46(), story47(), story48(), story49(), story50()
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۶: شیر و موش
    // ═══════════════════════════════════════════════════════
    private fun story46() = StoryContent(
        storyId = "lion_and_mouse",
        chapters = listOf(
            StoryChapter(1, "The Sleeping Lion", "شیر خوابیده", listOf(
                StoryParagraph("A big lion was sleeping in the forest.", "شیر بزرگی در جنگل خوابیده بود."),
                StoryParagraph("The sun was warm and the day was quiet.", "خورشید گرم بود و روز آرام بود."),
                StoryParagraph("All the animals were resting in the shade.", "همه حیوانات در سایه استراحت می‌کردند."),
                StoryParagraph("Suddenly, a small mouse ran over the lion's nose.", "ناگهان، موش کوچکی روی بینی شیر دوید."),
                StoryParagraph("The lion woke up at once and was very angry.", "شیر فوراً بیدار شد و خیلی عصبانی بود."),
                StoryParagraph("He caught the little mouse with his big paw.", "او موش کوچک را با پنجه بزرگش گرفت."),
                StoryParagraph("The mouse was very scared and could not move.", "موش خیلی ترسیده بود و نمی‌توانست حرکت کند."),
                StoryParagraph("'Please let me go, kind lion,' said the mouse.", "موش گفت: «لطفاً رهایم کن، شیر مهربان.»"),
                StoryParagraph("'I am too small to eat,' said the mouse.", "موش گفت: «من برای خوردن خیلی کوچکم.»"),
                StoryParagraph("'One day, I will help you,' said the mouse.", "موش گفت: «یک روز، کمکت خواهم کرد.»"),
                StoryParagraph("The lion laughed at this funny idea.", "شیر از این فکر خنده‌دار خندید."),
                StoryParagraph("'You are so small,' said the lion.", "شیر گفت: «تو خیلی کوچکی.»"),
                StoryParagraph("'How can you ever help me?' asked the lion.", "شیر پرسید: «چطور می‌توانی کمکی به من بکنی؟»"),
                StoryParagraph("But the lion was kind and let the mouse go.", "اما شیر مهربان بود و موش را رها کرد."),
                StoryParagraph("The mouse thanked the lion and ran away.", "موش از شیر تشکر کرد و فرار کرد."),
                StoryParagraph("The lion went back to sleep in the sun.", "شیر دوباره در خورشید به خواب رفت."),
                StoryParagraph("Many days passed and the forest was peaceful.", "روزهای زیادی گذشت و جنگل آرام بود."),
                StoryParagraph("But one day, the lion was in great danger.", "اما یک روز، شیر در خطر بزرگی افتاد."),
                StoryParagraph("Hunters came to the forest with a strong net.", "شکارچیانی با تور قوی به جنگل آمدند."),
                StoryParagraph("They caught the lion in the net by trick.", "آن‌ها شیر را با ترفند در تور گرفتند.")
            )),
            StoryChapter(2, "The Lion in the Net", "شیر در تور", listOf(
                StoryParagraph("The lion roared and tried to escape.", "شیر غرید و تلاش کرد فرار کند."),
                StoryParagraph("But the net was strong and he could not move.", "اما تور قوی بود و نمی‌توانست حرکت کند."),
                StoryParagraph("The hunters went away to get a cage.", "شکارچیان رفتند تا قفسی بیاورند."),
                StoryParagraph("The lion was alone and very afraid.", "شیر تنها و خیلی ترسیده بود."),
                StoryParagraph("He called for help, but no one came.", "او کمک خواست، اما کسی نیامد."),
                StoryParagraph("The other animals were too scared to help.", "حیوانات دیگر خیلی ترسیده بودند که کمک کنند."),
                StoryParagraph("The lion thought he would never be free.", "شیر فکر می‌کرد هرگز آزاد نخواهد شد."),
                StoryParagraph("He pulled and pulled, but the net was too strong.", "کشید و کشید، اما تور خیلی قوی بود."),
                StoryParagraph("Tears came to his big, sad eyes.", "اشک به چشمان بزرگ و غمگینش آمد."),
                StoryParagraph("Then he heard a small sound near him.", "بعد صدای کوچکی نزدیکش شنید."),
                StoryParagraph("It was the little mouse from many days ago.", "موش کوچک از روزهای پیش بود."),
                StoryParagraph("'Do not worry, kind lion,' said the mouse.", "موش گفت: «نگران نباش، شیر مهربان.»"),
                StoryParagraph("'I will help you now,' said the mouse.", "موش گفت: «حالا کمکت می‌کنم.»"),
                StoryParagraph("The lion could not believe his eyes.", "شیر نمی‌توانست چشمانش را باور کند."),
                StoryParagraph("The mouse began to bite the strong ropes.", "موش شروع کرد به جویدن طناب‌های قوی."),
                StoryParagraph("One by one, the ropes began to break.", "یکی‌یکی، طناب‌ها شروع به پاره شدن کردند."),
                StoryParagraph("The lion felt the net become weaker.", "شیر حس کرد تور ضعیف‌تر می‌شود."),
                StoryParagraph("He pulled with all his power.", "او با تمام قدرتش کشید."),
                StoryParagraph("The net broke and the lion was free.", "تور پاره شد و شیر آزاد شد."),
                StoryParagraph("He was very happy and thanked the mouse.", "او خیلی خوشحال شد و از موش تشکر کرد.")
            )),
            StoryChapter(3, "The Lesson of Kindness", "درس مهربانی", listOf(
                StoryParagraph("'You saved my life, little mouse,' said the lion.", "شیر گفت: «جانم را نجات دادی، موش کوچک.»"),
                StoryParagraph("'I was wrong to laugh at you,' said the lion.", "شیر گفت: «اشتباه کردم که بهت خندیدم.»"),
                StoryParagraph("'Even the smallest friend can help,' said the mouse.", "موش گفت: «حتی کوچک‌ترین دوست هم می‌تواند کمک کند.»"),
                StoryParagraph("The lion learned a very important lesson.", "شیر درس خیلی مهمی یاد گرفت."),
                StoryParagraph("Kindness always comes back to you.", "مهربانی همیشه به تو برمی‌گردد."),
                StoryParagraph("The lion and the mouse became best friends.", "شیر و موش بهترین دوستان شدند."),
                StoryParagraph("They helped each other every day.", "آن‌ها هر روز به هم کمک می‌کردند."),
                StoryParagraph("The mouse rode on the lion's back.", "موش روی پشت شیر سوار می‌شد."),
                StoryParagraph("The lion protected the mouse from danger.", "شیر از موش در برابر خطر محافظت می‌کرد."),
                StoryParagraph("All the animals learned from their friendship.", "همه حیوانات از دوستی‌شان یاد گرفتند."),
                StoryParagraph("They saw that size does not matter.", "آن‌ها دیدند که اندازه مهم نیست."),
                StoryParagraph("What matters is a kind heart.", "چیزی که مهم است قلب مهربان است."),
                StoryParagraph("The forest became a happier place.", "جنگل جای شادتری شد."),
                StoryParagraph("Everyone helped each other with love.", "همه با عشق به هم کمک می‌کردند."),
                StoryParagraph("And the lion never forgot the little mouse.", "و شیر هرگز موش کوچک را فراموش نکرد."),
                StoryParagraph("The mouse never forgot the kind lion.", "موش هرگز شیر مهربان را فراموش نکرد."),
                StoryParagraph("Their story was told for many years.", "داستانشان سال‌ها تعریف شد."),
                StoryParagraph("Parents told it to their children.", "والدین آن را برای فرزندانشان تعریف کردند."),
                StoryParagraph("It taught everyone about kindness.", "به همه درباره مهربانی آموخت."),
                StoryParagraph("And so the story of the lion and the mouse lives on.", "و اینگونه داستان شیر و موش زنده ماند.")
            )),
            StoryChapter(4, "The Hunters Return", "بازگشت شکارچیان", listOf(
                StoryParagraph("The hunters came back with a big cage.", "شکارچیان با قفس بزرگی برگشتند."),
                StoryParagraph("But the net was empty and broken.", "اما تور خالی و پاره بود."),
                StoryParagraph("The lion was gone and free again.", "شیر رفته بود و دوباره آزاد بود."),
                StoryParagraph("The hunters were very angry and confused.", "شکارچیان خیلی عصبانی و گیج شدند."),
                StoryParagraph("They looked everywhere for the lion.", "آن‌ها همه جا را دنبال شیر گشتند."),
                StoryParagraph("But the lion was hiding in a cave.", "اما شیر در غاری پنهان شده بود."),
                StoryParagraph("The mouse was with him, watching.", "موش با او بود و تماشا می‌کرد."),
                StoryParagraph("'We must be careful,' said the mouse.", "موش گفت: «باید مراقب باشیم.»"),
                StoryParagraph("'The hunters may come back,' said the mouse.", "موش گفت: «شکارچیان ممکنه برگردند.»"),
                StoryParagraph("The lion nodded and stayed quiet.", "شیر سر تکان داد و ساکت ماند."),
                StoryParagraph("The hunters searched for many hours.", "شکارچیان ساعت‌ها گشتند."),
                StoryParagraph("But they could not find the lion.", "اما نمی‌توانستند شیر را پیدا کنند."),
                StoryParagraph("Finally, they gave up and left the forest.", "بالاخره، تسلیم شدند و جنگل را ترک کردند."),
                StoryParagraph("The lion and the mouse were safe.", "شیر و موش در امان بودند."),
                StoryParagraph("They came out of the cave slowly.", "آن‌ها آرام‌آرام از غار بیرون آمدند."),
                StoryParagraph("The sun was shining and the birds were singing.", "خورشید می‌تابید و پرنده‌ها آواز می‌خواندند."),
                StoryParagraph("The forest was peaceful again.", "جنگل دوباره آرام بود."),
                StoryParagraph("All the animals came to celebrate.", "همه حیوانات برای جشن آمدند."),
                StoryParagraph("They had a big party for the lion.", "آن‌ها جشن بزرگی برای شیر گرفتند."),
                StoryParagraph("And the mouse sat beside the lion proudly.", "و موش با افتخار کنار شیر نشست.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۷: لاک‌پشت و خرگوش
    // ═══════════════════════════════════════════════════════
    private fun story47() = StoryContent(
        storyId = "tortoise_and_hare",
        chapters = listOf(
            StoryChapter(1, "The Challenge", "چالش", listOf(
                StoryParagraph("A hare was always laughing at a tortoise.", "خرگوشی همیشه به لاک‌پشتی می‌خندید."),
                StoryParagraph("'You are so slow!' said the hare every day.", "خرگوش هر روز می‌گفت: «تو خیلی کندی!»"),
                StoryParagraph("The tortoise listened but said nothing.", "لاک‌پشت گوش می‌داد اما چیزی نمی‌گفت."),
                StoryParagraph("One day, he got tired of the laughing.", "یک روز، از خندیدن خسته شد."),
                StoryParagraph("'I challenge you to a race,' said the tortoise.", "لاک‌پشت گفت: «تو را به مسابقه دعوت می‌کنم.»"),
                StoryParagraph("The hare laughed even louder than before.", "خرگوش حتی بلندتر از قبل خندید."),
                StoryParagraph("'A race? With you?' said the hare.", "خرگوش گفت: «مسابقه؟ با تو؟»"),
                StoryParagraph("'That will be easy for me to win,' he said.", "او گفت: «بردنش برای من آسونه.»"),
                StoryParagraph("'We will see,' said the tortoise quietly.", "لاک‌پشت آرام گفت: «خواهیم دید.»"),
                StoryParagraph("All the animals came to watch the race.", "همه حیوانات برای تماشای مسابقه آمدند."),
                StoryParagraph("The fox was the judge of the race.", "روباه داور مسابقه بود."),
                StoryParagraph("He showed them the path through the forest.", "او مسیر از میان جنگل را به آن‌ها نشان داد."),
                StoryParagraph("The path went up a hill and down a valley.", "مسیر از تپه‌ای بالا و از دره‌ای پایین می‌رفت."),
                StoryParagraph("It ended near a big, old tree.", "نزدیک درخت بزرگ و کهنسالی تمام می‌شد."),
                StoryParagraph("'Are you ready?' asked the fox.", "روباه پرسید: «آماده‌اید؟»"),
                StoryParagraph("'Yes!' said the hare, jumping up and down.", "خرگوش در حالی که بالا و پایین می‌پرید گفت: «بله!»"),
                StoryParagraph("'Yes,' said the tortoise calmly.", "لاک‌پشت آرام گفت: «بله.»"),
                StoryParagraph("The fox counted to three and shouted, 'Go!'", "روباه تا سه شمرد و فریاد زد: «برو!»"),
                StoryParagraph("The hare ran very fast and disappeared.", "خرگوش خیلی سریع دوید و ناپدید شد."),
                StoryParagraph("The tortoise began to walk slowly.", "لاک‌پشت شروع کرد به آرام راه رفتن.")
            )),
            StoryChapter(2, "The Fast Hare", "خرگوش سریع", listOf(
                StoryParagraph("The hare ran faster than the wind.", "خرگوش سریع‌تر از باد دوید."),
                StoryParagraph("He was far ahead of the tortoise.", "او خیلی جلوتر از لاک‌پشت بود."),
                StoryParagraph("'This is too easy,' he thought to himself.", "او با خودش فکر کرد: «این خیلی آسونه.»"),
                StoryParagraph("He looked back but saw no tortoise.", "او به عقب نگاه کرد اما لاک‌پشتی ندید."),
                StoryParagraph("'I have plenty of time,' said the hare.", "خرگوش گفت: «زمان زیادی دارم.»"),
                StoryParagraph("'I will take a short nap,' he decided.", "او تصمیم گرفت: «یک چرت کوتاه می‌زنم.»"),
                StoryParagraph("He found a cool, soft spot of grass.", "او جای خنک و نرمی از علف پیدا کرد."),
                StoryParagraph("He lay down and closed his eyes.", "دراز کشید و چشمانش را بست."),
                StoryParagraph("'I will wake up before the tortoise comes,' he said.", "او گفت: «قبل از اینکه لاک‌پشت بیاد بیدار می‌شم.»"),
                StoryParagraph("Soon, he was fast asleep.", "خیلی زود، به خواب عمیقی رفت."),
                StoryParagraph("He dreamed of winning the race easily.", "او در خواب دید که راحت مسابقه را می‌برد."),
                StoryParagraph("He dreamed of all the animals cheering for him.", "در خواب دید که همه حیوانات برایش تشویق می‌کنند."),
                StoryParagraph("The sun moved slowly across the sky.", "خورشید آرام‌آرام در آسمان حرکت کرد."),
                StoryParagraph("The hare kept sleeping under the tree.", "خرگوش زیر درخت خوابید."),
                StoryParagraph("The birds sang but he did not wake.", "پرنده‌ها آواز خواندند اما بیدار نشد."),
                StoryParagraph("The wind blew softly but he did not wake.", "باد آرام وزید اما بیدار نشد."),
                StoryParagraph("The other animals watched and whispered.", "حیوانات دیگر تماشا کردند و زمزمه کردند."),
                StoryParagraph("'Is he going to sleep forever?' they asked.", "پرسیدند: «آیا برای همیشه می‌خوابد؟»"),
                StoryParagraph("But the hare slept on, dreaming of winning.", "اما خرگوش به خواب رفت، در خواب بردن."),
                StoryParagraph("He did not know the tortoise was coming.", "او نمی‌دانست لاک‌پشت دارد می‌آید.")
            )),
            StoryChapter(3, "The Slow Tortoise", "لاک‌پشت کند", listOf(
                StoryParagraph("The tortoise walked slowly but surely.", "لاک‌پشت آرام اما مطمئن راه رفت."),
                StoryParagraph("He did not stop, not even for a moment.", "او حتی برای لحظه‌ای هم نایستاد."),
                StoryParagraph("'Slow and steady wins the race,' he said.", "او گفت: «آرام و پیوسته مسابقه را می‌برد.»"),
                StoryParagraph("He climbed the hill with patience.", "او با صبر از تپه بالا رفت."),
                StoryParagraph("He crossed the valley without rest.", "بدون استراحت از دره گذشت."),
                StoryParagraph("He saw the hare sleeping under a tree.", "او خرگوش را دید که زیر درختی خوابیده."),
                StoryParagraph("But he did not stop to laugh or rest.", "اما نایستاد تا بخندد یا استراحت کند."),
                StoryParagraph("He just kept walking, step by step.", "او فقط راه رفت، قدم به قدم."),
                StoryParagraph("The other animals cheered for him quietly.", "حیوانات دیگر بی‌صدا برایش تشویق کردند."),
                StoryParagraph("'Keep going, tortoise!' said the fox.", "روباه گفت: «ادامه بده، لاک‌پشت!»"),
                StoryParagraph("The tortoise smiled and kept walking.", "لاک‌پشت لبخند زد و به راه رفتن ادامه داد."),
                StoryParagraph("His legs were tired but his heart was strong.", "پاهایش خسته بودند اما قلبش قوی بود."),
                StoryParagraph("He thought about his home and his family.", "او به خانه و خانواده‌اش فکر کرد."),
                StoryParagraph("He thought about how proud they would be.", "فکر کرد چقدر به او افتخار خواهند کرد."),
                StoryParagraph("He walked past the sleeping hare.", "او از کنار خرگوش خوابیده گذشت."),
                StoryParagraph("Still, the hare did not wake up.", "باز هم، خرگوش بیدار نشد."),
                StoryParagraph("The tortoise saw the big, old tree ahead.", "لاک‌پشت درخت بزرگ و کهنسال را در جلو دید."),
                StoryParagraph("It was the finish line of the race.", "خط پایان مسابقه بود."),
                StoryParagraph("He walked toward it with all his strength.", "با تمام قدرتش به سمتش راه رفت."),
                StoryParagraph("He was going to win the race.", "او می‌خواست مسابقه را ببرد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The tortoise reached the old tree first.", "لاک‌پشت اول به درخت کهنسال رسید."),
                StoryParagraph("All the animals cheered loudly.", "همه حیوانات بلند تشویق کردند."),
                StoryParagraph("'The tortoise wins!' shouted the fox.", "روباه فریاد زد: «لاک‌پشت برنده شد!»"),
                StoryParagraph("The tortoise smiled and sat down to rest.", "لاک‌پشت لبخند زد و نشست تا استراحت کند."),
                StoryParagraph("Just then, the hare woke up.", "همان لحظه، خرگوش بیدار شد."),
                StoryParagraph("He looked around but saw no tortoise.", "او دور و بر را نگاه کرد اما لاک‌پشتی ندید."),
                StoryParagraph("'Where is he?' said the hare, confused.", "خرگوش گیج گفت: «کجاست؟»"),
                StoryParagraph("He ran to the finish line quickly.", "او سریع به خط پایان دوید."),
                StoryParagraph("But the tortoise was already there.", "اما لاک‌پشت قبلاً آنجا بود."),
                StoryParagraph("The hare could not believe his eyes.", "خرگوش نمی‌توانست چشمانش را باور کند."),
                StoryParagraph("'How did you beat me?' asked the hare.", "خرگوش پرسید: «چطور منو بردی؟»"),
                StoryParagraph("'I walked slowly but I never stopped,' said the tortoise.", "لاک‌پشت گفت: «آرام راه رفتم اما هرگز نایستادم.»"),
                StoryParagraph("'You slept, but I kept going,' he added.", "او اضافه کرد: «تو خوابیدی، اما من ادامه دادم.»"),
                StoryParagraph("The hare felt ashamed of himself.", "خرگوش از خودش خجالت کشید."),
                StoryParagraph("'I was too sure of winning,' said the hare.", "خرگوش گفت: «بیش از حد مطمئن بودم که می‌برم.»"),
                StoryParagraph("'You were fast but not wise,' said the tortoise.", "لاک‌پشت گفت: «تو سریع بودی اما عاقل نبودی.»"),
                StoryParagraph("The animals clapped for the tortoise.", "حیوانات برای لاک‌پشت دست زدند."),
                StoryParagraph("The fox gave him a golden medal.", "روباه به او مدال طلا داد."),
                StoryParagraph("The tortoise thanked everyone kindly.", "لاک‌پشت مهربانانه از همه تشکر کرد."),
                StoryParagraph("And the hare promised to learn from this.", "و خرگوش قول داد از این درس بگیرد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۸: پسرک چوپان دروغگو
    // ═══════════════════════════════════════════════════════
    private fun story48() = StoryContent(
        storyId = "boy_who_cried_wolf",
        chapters = listOf(
            StoryChapter(1, "The Shepherd Boy", "پسر چوپان", listOf(
                StoryParagraph("Once there was a young shepherd boy.", "روزی پسری چوپان جوان بود."),
                StoryParagraph("He lived in a small village near the mountains.", "او در روستای کوچکی نزدیک کوه‌ها زندگی می‌کرد."),
                StoryParagraph("Every day, he took the sheep to the hills.", "هر روز، گوسفندان را به تپه‌ها می‌برد."),
                StoryParagraph("He watched them from morning until evening.", "از صبح تا غروب مراقبشان بود."),
                StoryParagraph("The boy was often bored and lonely.", "پسر اغلب حوصله‌اش سر می‌رفت و تنها بود."),
                StoryParagraph("There was no one to talk to on the hills.", "کسی روی تپه‌ها نبود که با او حرف بزند."),
                StoryParagraph("One day, he had a bad idea.", "یک روز، فکر بدی به سرش زد."),
                StoryParagraph("He decided to play a trick on the villagers.", "تصمیم گرفت با روستاییان شوخی کند."),
                StoryParagraph("He ran to the village and shouted loudly.", "او به روستا دوید و بلند فریاد زد."),
                StoryParagraph("'Wolf! Wolf!' he cried. 'A wolf is here!'", "فریاد زد: «گرگ! گرگ! گرگی اینجاست!»"),
                StoryParagraph("The villagers dropped their work and ran.", "روستاییان کارشان را رها کردند و دویدند."),
                StoryParagraph("They came with sticks and pitchforks.", "آن‌ها با چوب و چنگال آمدند."),
                StoryParagraph("'Where is the wolf?' they asked, breathing hard.", "در حالی که نفس‌نفس می‌زدند پرسیدند: «گرگ کجاست؟»"),
                StoryParagraph("The boy laughed and laughed.", "پسر خندید و خندید."),
                StoryParagraph("'There is no wolf!' he said. 'I tricked you!'", "او گفت: «گرگی نیست! شما را فریب دادم!»"),
                StoryParagraph("The villagers were angry and went back.", "روستاییان عصبانی شدند و برگشتند."),
                StoryParagraph("'Do not cry wolf when there is none,' they said.", "آن‌ها گفتند: «وقتی گرگی نیست فریاد گرگ نزن.»"),
                StoryParagraph("But the boy did not listen to them.", "اما پسر به آن‌ها گوش نداد."),
                StoryParagraph("He thought it was just a funny game.", "او فکر می‌کرد فقط بازی خنده‌داری است."),
                StoryParagraph("He did not know what would happen next.", "او نمی‌دانست بعداً چه اتفاقی می‌افتد.")
            )),
            StoryChapter(2, "The Second Trick", "شوخی دوم", listOf(
                StoryParagraph("A few days later, the boy was bored again.", "چند روز بعد، پسر دوباره حوصله‌اش سر رفت."),
                StoryParagraph("He decided to play the same trick again.", "او تصمیم گرفت همان شوخی را دوباره بکند."),
                StoryParagraph("He ran to the village and shouted.", "او به روستا دوید و فریاد زد."),
                StoryParagraph("'Wolf! Wolf! Come quickly!' he cried.", "فریاد زد: «گرگ! گرگ! سریع بیایید!»"),
                StoryParagraph("The villagers ran to help him again.", "روستاییان دوباره برای کمکش دویدند."),
                StoryParagraph("They were worried about their sheep.", "آن‌ها نگران گوسفندانشان بودند."),
                StoryParagraph("But when they arrived, there was no wolf.", "اما وقتی رسیدند، گرگی نبود."),
                StoryParagraph("The boy was laughing on the ground.", "پسر روی زمین می‌خندید."),
                StoryParagraph("'You tricked us again!' said the villagers.", "روستاییان گفتند: «دوباره فریبمان دادی!»"),
                StoryParagraph("'It is just a joke,' said the boy.", "پسر گفت: «فقط یک شوخیه.»"),
                StoryParagraph("'This is not a joke,' said an old man.", "پیرمردی گفت: «این شوخی نیست.»"),
                StoryParagraph("'One day, you will need our help,' he said.", "او گفت: «یک روز، به کمک ما نیاز پیدا می‌کنی.»"),
                StoryParagraph("'And we will not believe you,' he added.", "او اضافه کرد: «و ما باورت نمی‌کنیم.»"),
                StoryParagraph("The boy just laughed more.", "پسر فقط بیشتر خندید."),
                StoryParagraph("'You always believe me,' said the boy.", "پسر گفت: «شما همیشه باورم می‌کنید.»"),
                StoryParagraph("The villagers shook their heads and left.", "روستاییان سر تکان دادند و رفتند."),
                StoryParagraph("They were tired of his tricks.", "آن‌ها از شوخی‌هایش خسته شده بودند."),
                StoryParagraph("The boy went back to his sheep.", "پسر به گوسفندانش برگشت."),
                StoryParagraph("He felt very clever and happy.", "او خیلی باهوش و خوشحال احساس می‌کرد."),
                StoryParagraph("But he was making a big mistake.", "اما داشت اشتباه بزرگی می‌کرد.")
            )),
            StoryChapter(3, "The Real Wolf", "گرگ واقعی", listOf(
                StoryParagraph("One evening, a real wolf came to the hills.", "یک غروب، گرگ واقعی به تپه‌ها آمد."),
                StoryParagraph("The sheep were scared and ran away.", "گوسفندان ترسیدند و فرار کردند."),
                StoryParagraph("The boy was very afraid.", "پسر خیلی ترسیده بود."),
                StoryParagraph("He ran to the village as fast as he could.", "او تا می‌توانست سریع به روستا دوید."),
                StoryParagraph("'Wolf! Wolf!' he shouted with all his might.", "با تمام قدرتش فریاد زد: «گرگ! گرگ!»"),
                StoryParagraph("'Please help me! A real wolf is here!'", "«لطفاً کمکم کنید! گرگ واقعی اینجاست!»"),
                StoryParagraph("But the villagers did not come.", "اما روستاییان نیامدند."),
                StoryParagraph("They thought it was another trick.", "آن‌ها فکر کردند شوخی دیگری است."),
                StoryParagraph("'He is lying again,' they said to each other.", "آن‌ها به هم گفتند: «او دوباره دروغ می‌گوید.»"),
                StoryParagraph("'We will not be fooled this time,' they said.", "گفتند: «این بار فریب نمی‌خوریم.»"),
                StoryParagraph("The boy shouted and cried for help.", "پسر فریاد زد و برای کمک گریه کرد."),
                StoryParagraph("But no one believed him anymore.", "اما دیگر هیچ‌کس باورش نکرد."),
                StoryParagraph("The wolf attacked the sheep on the hill.", "گرگ به گوسفندان روی تپه حمله کرد."),
                StoryParagraph("The boy watched with tears in his eyes.", "پسر با اشک در چشمانش تماشا کرد."),
                StoryParagraph("He could not do anything to stop it.", "او نمی‌توانست کاری برای متوقف کردنش بکند."),
                StoryParagraph("The wolf ate many of the sheep.", "گرگ بسیاری از گوسفندان را خورد."),
                StoryParagraph("Then it went back into the forest.", "بعد به جنگل برگشت."),
                StoryParagraph("The boy sat on the ground and cried.", "پسر روی زمین نشست و گریه کرد."),
                StoryParagraph("He had lost almost all the sheep.", "او تقریباً همه گوسفندان را از دست داده بود."),
                StoryParagraph("And no one had come to help him.", "و هیچ‌کس برای کمکش نیامده بود.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The boy walked home slowly and sadly.", "پسر آرام و غمگین به خانه راه رفت."),
                StoryParagraph("His father saw him and asked what happened.", "پدرش او را دید و پرسید چه اتفاقی افتاده."),
                StoryParagraph("The boy told him everything, crying.", "پسر در حال گریه همه چیز را برایش تعریف کرد."),
                StoryParagraph("His father listened quietly and then spoke.", "پدرش آرام گوش داد و بعد صحبت کرد."),
                StoryParagraph("'No one believes a liar,' said his father.", "پدرش گفت: «هیچ‌کس دروغگو را باور نمی‌کند.»"),
                StoryParagraph("'Even when he tells the truth,' he added.", "او اضافه کرد: «حتی وقتی راست می‌گوید.»"),
                StoryParagraph("The boy understood his big mistake.", "پسر اشتباه بزرگش را فهمید."),
                StoryParagraph("He promised never to lie again.", "قول داد دیگر هرگز دروغ نگوید."),
                StoryParagraph("The next day, he went to the villagers.", "روز بعد، به پیش روستاییان رفت."),
                StoryParagraph("He apologized for all his tricks.", "برای همه شوخی‌هایش عذرخواهی کرد."),
                StoryParagraph("The villagers forgave him kindly.", "روستاییان مهربانانه بخشیدندش."),
                StoryParagraph("They helped him buy new sheep.", "آن‌ها کمکش کردند گوسفندان جدید بخرد."),
                StoryParagraph("The boy worked hard every day.", "پسر هر روز سخت کار کرد."),
                StoryParagraph("He never lied to anyone again.", "او دیگر هرگز به کسی دروغ نگفت."),
                StoryParagraph("He became an honest and trusted shepherd.", "او چوپانی صادق و قابل اعتماد شد."),
                StoryParagraph("Everyone in the village respected him.", "همه در روستا به او احترام می‌گذاشتند."),
                StoryParagraph("The boy learned the value of honesty.", "پسر ارزش صداقت را یاد گرفت."),
                StoryParagraph("He taught the same lesson to his children.", "او همین درس را به فرزندانش آموخت."),
                StoryParagraph("And they taught it to their children too.", "و آن‌ها هم به فرزندانشان آموختند."),
                StoryParagraph("Honesty is always the best way.", "صداقت همیشه بهترین راه است.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۴۹: روباه و انگور
    // ═══════════════════════════════════════════════════════
    private fun story49() = StoryContent(
        storyId = "fox_and_grapes",
        chapters = listOf(
            StoryChapter(1, "The Hungry Fox", "روباه گرسنه", listOf(
                StoryParagraph("A hungry fox was walking through the forest.", "روباه گرسنه‌ای در جنگل راه می‌رفت."),
                StoryParagraph("He had not eaten anything all day.", "تمام روز چیزی نخورده بود."),
                StoryParagraph("His stomach was empty and he felt weak.", "شکمش خالی بود و ضعیف احساس می‌کرد."),
                StoryParagraph("He looked for food everywhere.", "او همه جا دنبال غذا گشت."),
                StoryParagraph("But he could not find anything to eat.", "اما نمی‌توانست چیزی برای خوردن پیدا کند."),
                StoryParagraph("Then he saw a vineyard in the distance.", "بعد تاکستانی در دوردست دید."),
                StoryParagraph("He ran toward it with hope in his heart.", "با امید در قلبش به سمتش دوید."),
                StoryParagraph("The vineyard was full of ripe grapes.", "تاکستان پر از انگورهای رسیده بود."),
                StoryParagraph("They hung from a high branch.", "آن‌ها از شاخه‌ای بلند آویزان بودند."),
                StoryParagraph("The grapes looked purple and delicious.", "انگورها بنفش و خوشمزه به نظر می‌رسیدند."),
                StoryParagraph("The fox's mouth began to water.", "دهان روباه آب افتاد."),
                StoryParagraph("'Those grapes are perfect!' he said happily.", "او با خوشحالی گفت: «آن انگورها عالی هستند!»"),
                StoryParagraph("He walked around the vineyard.", "او دور تاکستان قدم زد."),
                StoryParagraph("He looked for a way to reach them.", "دنبال راهی برای رسیدن به آن‌ها گشت."),
                StoryParagraph("But the branch was too high.", "اما شاخه خیلی بلند بود."),
                StoryParagraph("The fox stopped and thought for a moment.", "روباه ایستاد و لحظه‌ای فکر کرد."),
                StoryParagraph("'I will jump and get them,' he said.", "او گفت: «می‌پرم و می‌گیرمشان.»"),
                StoryParagraph("He took a few steps back.", "چند قدم به عقب رفت."),
                StoryParagraph("Then he ran and jumped with all his power.", "بعد دوید و با تمام قدرتش پرید."),
                StoryParagraph("But he missed the grapes by a lot.", "اما خیلی از انگورها دور ماند.")
            )),
            StoryChapter(2, "The Failed Attempts", "تلاش‌های ناموفق", listOf(
                StoryParagraph("The fox tried again and again.", "روباه دوباره و دوباره تلاش کرد."),
                StoryParagraph("Each time, he jumped as high as he could.", "هر بار، تا می‌توانست بالا پرید."),
                StoryParagraph("But the grapes were always too high.", "اما انگورها همیشه خیلی بلند بودند."),
                StoryParagraph("He rested for a moment and tried again.", "لحظه‌ای استراحت کرد و دوباره تلاش کرد."),
                StoryParagraph("He jumped from a rock, but still missed.", "از سنگی پرید، اما باز هم نرسید."),
                StoryParagraph("He tried to climb the tree, but it was too smooth.", "تلاش کرد از درخت بالا برود، اما خیلی صاف بود."),
                StoryParagraph("He tried to reach them with a stick.", "تلاش کرد با چوبی به آن‌ها برسد."),
                StoryParagraph("But the stick was not long enough.", "اما چوب به اندازه کافی بلند نبود."),
                StoryParagraph("The fox became tired and frustrated.", "روباه خسته و ناامید شد."),
                StoryParagraph("His legs hurt and his body was weak.", "پاهایش درد می‌کرد و بدنش ضعیف بود."),
                StoryParagraph("He sat down under the tree to rest.", "زیر درخت نشست تا استراحت کند."),
                StoryParagraph("He looked up at the grapes one more time.", "یک بار دیگر به انگورها نگاه کرد."),
                StoryParagraph("They were still hanging there, beautiful.", "آن‌ها هنوز آنجا آویزان بودند، زیبا."),
                StoryParagraph("The fox felt angry and sad.", "روباه عصبانی و غمگین شد."),
                StoryParagraph("'Why can't I reach them?' he said to himself.", "با خودش گفت: «چرا نمی‌توانم به آن‌ها برسم؟»"),
                StoryParagraph("He tried one last time to jump.", "یک بار آخر تلاش کرد بپرد."),
                StoryParagraph("But he failed again, even worse.", "اما دوباره شکست خورد، حتی بدتر."),
                StoryParagraph("He was too tired to continue.", "او خیلی خسته بود که ادامه دهد."),
                StoryParagraph("He gave up and turned away.", "تسلیم شد و برگشت."),
                StoryParagraph("His heart was full of disappointment.", "قلبش پر از ناامیدی بود.")
            )),
            StoryChapter(3, "The Sour Grapes", "انگورهای ترش", listOf(
                StoryParagraph("As the fox walked away, he felt ashamed.", "وقتی روباه دور می‌شد، خجالت زده شد."),
                StoryParagraph("He did not want to look like a failure.", "نمی‌خواست مثل یک شکست‌خورده به نظر برسد."),
                StoryParagraph("So he said to himself loudly.", "پس بلند با خودش گفت."),
                StoryParagraph("'Those grapes are probably sour anyway.'", "«آن انگورها احتمالاً ترش هستند.»"),
                StoryParagraph("'They are not worth my time,' he said.", "او گفت: «ارزش وقت من را ندارند.»"),
                StoryParagraph("'I am sure they taste terrible,' he added.", "او اضافه کرد: «مطمئنم طعم وحشتناکی دارند.»"),
                StoryParagraph("A little bird heard him from a tree.", "پرنده کوچکی از درختی صدایش را شنید."),
                StoryParagraph("'But they are sweet and ripe,' said the bird.", "پرنده گفت: «اما آن‌ها شیرین و رسیده‌اند.»"),
                StoryParagraph("'I ate some this morning,' said the bird.", "پرنده گفت: «امروز صبح چندتا خوردم.»"),
                StoryParagraph("The fox became angry at the bird.", "روباه از پرنده عصبانی شد."),
                StoryParagraph("'You do not know anything!' he shouted.", "فریاد زد: «تو هیچی نمی‌دونی!»"),
                StoryParagraph("'They are sour, I tell you!' he repeated.", "تکرار کرد: «بهت می‌گم ترش هستند!»"),
                StoryParagraph("The bird laughed and flew away.", "پرنده خندید و پرید."),
                StoryParagraph("The fox walked home alone and sad.", "روباه تنها و غمگین به خانه رفت."),
                StoryParagraph("He kept telling himself the grapes were sour.", "او مدام به خودش می‌گفت انگورها ترش هستند."),
                StoryParagraph("But deep inside, he knew the truth.", "اما در عمق وجودش، حقیقت را می‌دانست."),
                StoryParagraph("He had failed and he could not accept it.", "او شکست خورده بود و نمی‌توانست قبولش کند."),
                StoryParagraph("He had made up a lie to feel better.", "او دروغی ساخته بود تا احساس بهتری داشته باشد."),
                StoryParagraph("But the lie did not help him at all.", "اما دروغ اصلاً کمکش نکرد."),
                StoryParagraph("He went to sleep with a heavy heart.", "با قلبی سنگین به خواب رفت.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The next morning, the fox woke up early.", "صبح روز بعد، روباه زود بیدار شد."),
                StoryParagraph("He thought about what happened the day before.", "به آنچه روز قبل اتفاق افتاده بود فکر کرد."),
                StoryParagraph("'I was wrong,' he said to himself.", "با خودش گفت: «اشتباه کردم.»"),
                StoryParagraph("'The grapes were not sour,' he admitted.", "اعتراف کرد: «انگورها ترش نبودند.»"),
                StoryParagraph("'I just could not reach them,' he said.", "او گفت: «فقط نمی‌توانستم به آن‌ها برسم.»"),
                StoryParagraph("'It is okay to fail sometimes,' he realized.", "فهمید: «گاهی شکست خوردن اشکالی ندارد.»"),
                StoryParagraph("'But it is not okay to lie about it.'", "«اما دروغ گفتن درباره‌اش اشکالی دارد.»"),
                StoryParagraph("The fox learned a valuable lesson.", "روباه درس ارزشمندی یاد گرفت."),
                StoryParagraph("He went back to the vineyard.", "او به تاکستان برگشت."),
                StoryParagraph("This time, he brought a tall ladder.", "این بار، نردبان بلندی آورد."),
                StoryParagraph("He climbed up and reached the grapes.", "بالا رفت و به انگورها رسید."),
                StoryParagraph("He ate them happily and shared with others.", "با خوشحالی خوردشان و با دیگران تقسیم کرد."),
                StoryParagraph("The grapes were sweet and delicious.", "انگورها شیرین و خوشمزه بودند."),
                StoryParagraph("The fox smiled and felt proud of himself.", "روباه لبخند زد و به خودش افتخار کرد."),
                StoryParagraph("He never lied about his failures again.", "او دیگر هرگز درباره شکست‌هایش دروغ نگفت."),
                StoryParagraph("He learned that honesty is the best way.", "یاد گرفت که صداقت بهترین راه است."),
                StoryParagraph("The other animals respected him more.", "حیوانات دیگر بیشتر به او احترام گذاشتند."),
                StoryParagraph("The fox became wise and humble.", "روباه عاقل و فروتن شد."),
                StoryParagraph("He helped others who had the same problem.", "او به دیگرانی که همین مشکل را داشتند کمک کرد."),
                StoryParagraph("And so the fox lived a happy life.", "و اینگونه روباه زندگی شادی داشت.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۰: مورچه و ملخ
    // ═══════════════════════════════════════════════════════
    private fun story50() = StoryContent(
        storyId = "ant_and_grasshopper",
        chapters = listOf(
            StoryChapter(1, "The Summer Day", "روز تابستان", listOf(
                StoryParagraph("It was a hot summer day in the field.", "روز گرم تابستانی در مزرعه بود."),
                StoryParagraph("A grasshopper was singing and playing.", "ملخی در حال آواز خواندن و بازی کردن بود."),
                StoryParagraph("He jumped from leaf to leaf happily.", "او با خوشحالی از برگی به برگ دیگر می‌پرید."),
                StoryParagraph("Nearby, an ant was working very hard.", "نزدیکش، مورچه‌ای خیلی سخت کار می‌کرد."),
                StoryParagraph("She was carrying food to her nest.", "او غذا به لانه‌اش می‌برد."),
                StoryParagraph("The sun was hot but she did not stop.", "خورشید گرم بود اما او نایستاد."),
                StoryParagraph("The grasshopper watched her and laughed.", "ملخ تماشایش کرد و خندید."),
                StoryParagraph("'Why do you work so hard?' he asked.", "پرسید: «چرا اینقدر سخت کار می‌کنی؟»"),
                StoryParagraph("'Come and sing with me!' he said.", "گفت: «بیا و با من آواز بخون!»"),
                StoryParagraph("'The day is beautiful and warm,' he added.", "اضافه کرد: «روز زیبا و گرمه.»"),
                StoryParagraph("The ant did not stop working.", "مورچه دست از کار نکشید."),
                StoryParagraph("'I am storing food for winter,' she said.", "او گفت: «دارم برای زمستان غذا ذخیره می‌کنم.»"),
                StoryParagraph("The grasshopper laughed again.", "ملخ دوباره خندید."),
                StoryParagraph("'Winter is far away!' he said.", "گفت: «زمستان خیلی دوره!»"),
                StoryParagraph("'There is plenty of time,' he added.", "اضافه کرد: «زمان زیادی هست.»"),
                StoryParagraph("'You worry too much,' said the grasshopper.", "ملخ گفت: «تو خیلی نگرانی.»"),
                StoryParagraph("The ant just shook her head and worked.", "مورچه فقط سر تکان داد و کار کرد."),
                StoryParagraph("She knew winter would come soon.", "او می‌دانست زمستان به زودی می‌آید."),
                StoryParagraph("She had seen many winters before.", "او زمستان‌های زیادی دیده بود."),
                StoryParagraph("She kept working all day long.", "او تمام روز کار کرد.")
            )),
            StoryChapter(2, "The Lazy Days", "روزهای تنبلی", listOf(
                StoryParagraph("All summer, the grasshopper played.", "تمام تابستان، ملخ بازی کرد."),
                StoryParagraph("He sang songs and danced in the sun.", "او در آفتاب آواز خواند و رقصید."),
                StoryParagraph("He drank water from the cool stream.", "از نهر خنک آب نوشید."),
                StoryParagraph("He ate leaves and berries all day.", "تمام روز برگ و توت خورد."),
                StoryParagraph("He slept under the stars at night.", "شب‌ها زیر ستاره‌ها خوابید."),
                StoryParagraph("He did not think about tomorrow.", "به فردا فکر نمی‌کرد."),
                StoryParagraph("He did not save any food.", "هیچ غذایی ذخیره نکرد."),
                StoryParagraph("He did not build a warm home.", "خانه گرمی نساخت."),
                StoryParagraph("The ant kept working every day.", "مورچه هر روز کار کرد."),
                StoryParagraph("She carried seeds and grains to her nest.", "او دانه‌ها و غلات را به لانه‌اش برد."),
                StoryParagraph("Her nest became full of food.", "لانه‌اش پر از غذا شد."),
                StoryParagraph("She also helped other ants.", "او به مورچه‌های دیگر هم کمک کرد."),
                StoryParagraph("They worked together as a team.", "آن‌ها به عنوان یک تیم با هم کار کردند."),
                StoryParagraph("The grasshopper watched and laughed.", "ملخ تماشا کرد و خندید."),
                StoryParagraph("'You are all so serious!' he said.", "گفت: «شما همه خیلی جدی هستید!»"),
                StoryParagraph("'Life is for enjoying!' he said.", "گفت: «زندگی برای لذت بردن است!»"),
                StoryParagraph("The ants did not listen to him.", "مورچه‌ها به او گوش ندادند."),
                StoryParagraph("They knew what they had to do.", "آن‌ها می‌دانستند چه باید بکنند."),
                StoryParagraph("The summer passed quickly.", "تابستان سریع گذشت."),
                StoryParagraph("Autumn came with cool winds.", "پاییز با بادهای خنک آمد.")
            )),
            StoryChapter(3, "The Cold Winter", "زمستان سرد", listOf(
                StoryParagraph("Winter came with snow and ice.", "زمستان با برف و یخ آمد."),
                StoryParagraph("The field became white and cold.", "مزرعه سفید و سرد شد."),
                StoryParagraph("The grasshopper had no food.", "ملخ هیچ غذایی نداشت."),
                StoryParagraph("He had no warm place to stay.", "جای گرمی برای ماندن نداشت."),
                StoryParagraph("He walked through the snow, shivering.", "او در برف راه رفت، در حال لرزیدن."),
                StoryParagraph("His legs were weak and cold.", "پاهایش ضعیف و سرد بودند."),
                StoryParagraph("He looked for something to eat.", "دنبال چیزی برای خوردن گشت."),
                StoryParagraph("But everything was frozen and gone.", "اما همه چیز یخ زده و رفته بود."),
                StoryParagraph("He remembered the ant and her words.", "مورچه و حرف‌هایش را به یاد آورد."),
                StoryParagraph("He wished he had listened to her.", "آرزو کرد کاش به او گوش داده بود."),
                StoryParagraph("He walked to the ant's nest.", "او به لانه مورچه رفت."),
                StoryParagraph("He knocked on the door weakly.", "ضعیف در زد."),
                StoryParagraph("The ant opened the door and saw him.", "مورچه در را باز کرد و او را دید."),
                StoryParagraph("He was thin, cold, and very hungry.", "او لاغر، سرد و خیلی گرسنه بود."),
                StoryParagraph("'Please help me,' said the grasshopper.", "ملخ گفت: «لطفاً کمکم کن.»"),
                StoryParagraph("'I have no food and no home,' he said.", "گفت: «نه غذا دارم نه خانه.»"),
                StoryParagraph("The ant looked at him with kind eyes.", "مورچه با چشمان مهربان به او نگاه کرد."),
                StoryParagraph("She remembered how he had laughed at her.", "یادش آمد چطور به او خندیده بود."),
                StoryParagraph("But she also felt sorry for him.", "اما برایش هم دلش سوخت."),
                StoryParagraph("She invited him inside to get warm.", "دعوتش کرد داخل تا گرم شود.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The ant gave him warm soup and bread.", "مورچه به او سوپ گرم و نان داد."),
                StoryParagraph("The grasshopper ate and felt better.", "ملخ خورد و بهتر شد."),
                StoryParagraph("'Thank you, kind ant,' he said softly.", "آرام گفت: «ممنون، مورچه مهربان.»"),
                StoryParagraph("'I was wrong to laugh at you,' he said.", "گفت: «اشتباه کردم که بهت خندیدم.»"),
                StoryParagraph("'You were right to work hard,' he added.", "اضافه کرد: «حق داشتی سخت کار کنی.»"),
                StoryParagraph("The ant smiled and nodded.", "مورچه لبخند زد و سر تکان داد."),
                StoryParagraph("'It is never too late to learn,' she said.", "او گفت: «هرگز برای یادگیری دیر نیست.»"),
                StoryParagraph("'Next summer, work with us,' she said.", "گفت: «تابستان بعد، با ما کار کن.»"),
                StoryParagraph("The grasshopper promised to work hard.", "ملخ قول داد سخت کار کند."),
                StoryParagraph("He stayed with the ants all winter.", "تمام زمستان با مورچه‌ها ماند."),
                StoryParagraph("He helped them with small tasks.", "او در کارهای کوچک به آن‌ها کمک کرد."),
                StoryParagraph("When spring came, he worked in the field.", "وقتی بهار آمد، در مزرعه کار کرد."),
                StoryParagraph("He stored food for the next winter.", "برای زمستان بعد غذا ذخیره کرد."),
                StoryParagraph("He also sang songs while working.", "هنگام کار آواز هم می‌خواند."),
                StoryParagraph("The ants liked his happy songs.", "مورچه‌ها آوازهای شادش را دوست داشتند."),
                StoryParagraph("The grasshopper learned a big lesson.", "ملخ درس بزرگی یاد گرفت."),
                StoryParagraph("Work and play must both have a time.", "کار و بازی هر دو باید زمان داشته باشند."),
                StoryParagraph("Preparation makes life easier.", "آماده بودن زندگی را راحت‌تر می‌کند."),
                StoryParagraph("The grasshopper became wise and happy.", "ملخ عاقل و خوشحال شد."),
                StoryParagraph("And he never went hungry again.", "و دیگر هرگز گرسنه نماند.")
            ))
        )
    )
}