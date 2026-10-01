package com.zabanyar.ai.data.books.story.content.simple

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 Simple Group13 — ۵ داستان مبتدی
 * هر داستان: ۴ فصل × ۲۰ خط = ۸۰ خط
 * با ترجمه فارسی
 *
 * ۵۱. گرگ در لباس گوسفند
 * ۵۲. موش روستایی و موش شهری
 * ۵۳. دختر شیرفروش و سطلش
 * ۵۴. کلاغ و کوزه
 * ۵۵. غاز طلایی
 */
object Group13 {

    fun getAll(): List<StoryContent> = listOf(
        story51(), story52(), story53(), story54(), story55()
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۱: گرگ در لباس گوسفند
    // ═══════════════════════════════════════════════════════
    private fun story51() = StoryContent(
        storyId = "wolf_in_sheep_clothing",
        chapters = listOf(
            StoryChapter(1, "The Hungry Wolf", "گرگ گرسنه", listOf(
                StoryParagraph("A hungry wolf lived near a farm.", "گرگ گرسنه‌ای نزدیک مزرعه‌ای زندگی می‌کرد."),
                StoryParagraph("He wanted to eat the sheep every day.", "او هر روز می‌خواست گوسفندان را بخورد."),
                StoryParagraph("But a shepherd always watched them.", "اما چوپانی همیشه مراقبشان بود."),
                StoryParagraph("The shepherd had a big dog too.", "چوپان سگ بزرگی هم داشت."),
                StoryParagraph("The dog barked at the wolf every night.", "سگ هر شب به گرگ پارس می‌کرد."),
                StoryParagraph("The wolf could not get close to the sheep.", "گرگ نمی‌توانست به گوسفندان نزدیک شود."),
                StoryParagraph("He sat and thought about a plan.", "او نشست و درباره نقشه‌ای فکر کرد."),
                StoryParagraph("'I need a clever trick,' he said.", "او گفت: «به یک حقه باهوشانه نیاز دارم.»"),
                StoryParagraph("One day, he found a sheep's skin.", "یک روز، پوست گوسفندی پیدا کرد."),
                StoryParagraph("It was on the ground near the farm.", "روی زمین نزدیک مزرعه بود."),
                StoryParagraph("The wolf had a clever idea.", "گرگ فکر باهوشانه‌ای کرد."),
                StoryParagraph("'I will wear this skin,' he said.", "گفت: «این پوست را می‌پوشم.»"),
                StoryParagraph("'The shepherd will think I am a sheep.'", "«چوپان فکر می‌کند من گوسفندم.»"),
                StoryParagraph("He put on the sheep's skin.", "او پوست گوسفند را پوشید."),
                StoryParagraph("He looked just like a real sheep.", "او دقیقاً شبیه گوسفند واقعی به نظر می‌رسید."),
                StoryParagraph("He walked slowly toward the flock.", "آرام‌آرام به سمت گله راه رفت."),
                StoryParagraph("The dog did not bark at him.", "سگ به او پارس نکرد."),
                StoryParagraph("The shepherd did not notice him.", "چوپان متوجه‌اش نشد."),
                StoryParagraph("The wolf smiled under the skin.", "گرگ زیر پوست لبخند زد."),
                StoryParagraph("His plan was working perfectly.", "نقشه‌اش عالی کار می‌کرد.")
            )),
            StoryChapter(2, "Among the Sheep", "در میان گوسفندان", listOf(
                StoryParagraph("The wolf walked among the sheep.", "گرگ میان گوسفندان راه رفت."),
                StoryParagraph("They did not know he was a wolf.", "آن‌ها نمی‌دانستند او گرگ است."),
                StoryParagraph("They thought he was one of them.", "فکر می‌کردند یکی از خودشان است."),
                StoryParagraph("The shepherd took them to the field.", "چوپان آن‌ها را به مزرعه برد."),
                StoryParagraph("The wolf walked with them quietly.", "گرگ بی‌صدا با آن‌ها راه رفت."),
                StoryParagraph("He waited for the right moment.", "منتظر لحظه مناسب ماند."),
                StoryParagraph("At night, the shepherd locked the gate.", "شب، چوپان دروازه را قفل کرد."),
                StoryParagraph("All the sheep were inside the pen.", "همه گوسفندان داخل قفس بودند."),
                StoryParagraph("The wolf was inside too!", "گرگ هم داخل بود!"),
                StoryParagraph("Now he could eat as many as he wanted.", "حالا می‌توانست هر چقدر بخواهد بخورد."),
                StoryParagraph("The other sheep were asleep.", "گوسفندان دیگر خواب بودند."),
                StoryParagraph("The wolf took off the sheep's skin.", "گرگ پوست گوسفند را درآورد."),
                StoryParagraph("He showed his sharp teeth and claws.", "دندان‌ها و چنگال‌های تیزش را نشان داد."),
                StoryParagraph("He attacked the sheep one by one.", "یکی‌یکی به گوسفندان حمله کرد."),
                StoryParagraph("The sheep cried out in fear.", "گوسفندان از ترس فریاد زدند."),
                StoryParagraph("The shepherd heard the noise.", "چوپان سر و صدا را شنید."),
                StoryParagraph("He ran to the pen with his dog.", "با سگش به سمت قفس دوید."),
                StoryParagraph("But it was too late for many sheep.", "اما برای بسیاری از گوسفندان خیلی دیر بود."),
                StoryParagraph("The wolf had eaten them all.", "گرگ همه‌شان را خورده بود."),
                StoryParagraph("The shepherd was very sad and angry.", "چوپان خیلی غمگین و عصبانی شد.")
            )),
            StoryChapter(3, "The Discovery", "کشف حقیقت", listOf(
                StoryParagraph("The shepherd looked for the wolf.", "چوپان دنبال گرگ گشت."),
                StoryParagraph("But the wolf had run away.", "اما گرگ فرار کرده بود."),
                StoryParagraph("The shepherd found the sheep's skin.", "چوپان پوست گوسفند را پیدا کرد."),
                StoryParagraph("He understood what had happened.", "او فهمید چه اتفاقی افتاده."),
                StoryParagraph("'The wolf tricked me,' he said sadly.", "او غمگین گفت: «گرگ فریبم داد.»"),
                StoryParagraph("'I should have been more careful,' he added.", "اضافه کرد: «باید بیشتر مراقب می‌بودم.»"),
                StoryParagraph("The next day, he told the villagers.", "روز بعد، به روستاییان گفت."),
                StoryParagraph("'Watch your sheep carefully,' he warned.", "هشدار داد: «مراقب گوسفندانتان باشید.»"),
                StoryParagraph("'A wolf may be hiding among them.'", "«ممکنه گرگی میانشان پنهان شده باشد.»"),
                StoryParagraph("The villagers were afraid.", "روستاییان ترسیدند."),
                StoryParagraph("They checked their sheep every night.", "آن‌ها هر شب گوسفندانشان را بررسی کردند."),
                StoryParagraph("They looked for strange behavior.", "دنبال رفتار عجیب گشتند."),
                StoryParagraph("Some sheep walked differently.", "بعضی گوسفندان متفاوت راه می‌رفتند."),
                StoryParagraph("Some had strange eyes or teeth.", "بعضی چشمان یا دندان‌های عجیب داشتند."),
                StoryParagraph("The villagers found two more wolves.", "روستاییان دو گرگ دیگر پیدا کردند."),
                StoryParagraph("They chased them away from the farms.", "آن‌ها را از مزرعه‌ها دور کردند."),
                StoryParagraph("The wolves never came back.", "گرگ‌ها هرگز برنگشتند."),
                StoryParagraph("The village became safe again.", "روستا دوباره امن شد."),
                StoryParagraph("The shepherd learned a hard lesson.", "چوپان درس سختی یاد گرفت."),
                StoryParagraph("He never trusted appearances again.", "او دیگر هرگز به ظاهر اعتماد نکرد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The shepherd shared his story with everyone.", "چوپان داستانش را با همه به اشتراک گذاشت."),
                StoryParagraph("'Appearances can be deceiving,' he said.", "گفت: «ظاهر می‌تواند فریبنده باشد.»"),
                StoryParagraph("'A wolf may look like a sheep,' he added.", "اضافه کرد: «گرگ ممکنه شبیه گوسفند به نظر برسد.»"),
                StoryParagraph("The villagers remembered his words.", "روستاییان حرف‌هایش را به یاد آوردند."),
                StoryParagraph("They taught their children too.", "آن‌ها به فرزندانشان هم آموختند."),
                StoryParagraph("'Be careful of people who seem too nice,' they said.", "گفتند: «مراقب افرادی که خیلی مهربان به نظر می‌رسند باشید.»"),
                StoryParagraph("'They may have bad intentions.'", "«ممکنه نیت بدی داشته باشند.»"),
                StoryParagraph("The wolf learned a lesson too.", "گرگ هم درسی یاد گرفت."),
                StoryParagraph("He could not trick people forever.", "او نمی‌توانست برای همیشه مردم را فریب دهد."),
                StoryParagraph("The truth always comes out in the end.", "حقیقت همیشه در نهایت آشکار می‌شود."),
                StoryParagraph("The shepherd bought new sheep.", "چوپان گوسفندان جدیدی خرید."),
                StoryParagraph("He watched them more carefully.", "او با دقت بیشتری مراقبشان بود."),
                StoryParagraph("He trained his dog to be more alert.", "سگش را آموزش داد هوشیارتر باشد."),
                StoryParagraph("The farm became peaceful again.", "مزرعه دوباره آرام شد."),
                StoryParagraph("The sheep lived safely and happily.", "گوسفندان با امنیت و خوشحالی زندگی کردند."),
                StoryParagraph("The shepherd became wise and careful.", "چوپان عاقل و محتاط شد."),
                StoryParagraph("He helped other shepherds in the village.", "او به چوپان‌های دیگر در روستا کمک کرد."),
                StoryParagraph("They all learned to be careful.", "همه‌شان یاد گرفتند محتاط باشند."),
                StoryParagraph("And the village lived in peace.", "و روستا در آرامش زندگی کرد."),
                StoryParagraph("The story was told for many years.", "داستان سال‌ها تعریف شد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۲: موش روستایی و موش شهری
    // ═══════════════════════════════════════════════════════
    private fun story52() = StoryContent(
        storyId = "country_mouse_city_mouse",
        chapters = listOf(
            StoryChapter(1, "The Country Mouse", "موش روستایی", listOf(
                StoryParagraph("A country mouse lived in a field.", "موش روستایی در مزرعه‌ای زندگی می‌کرد."),
                StoryParagraph("He had a small home under a tree.", "خانه کوچکی زیر درختی داشت."),
                StoryParagraph("He ate simple food like seeds and grains.", "غذای ساده‌ای مثل دانه‌ها و غلات می‌خورد."),
                StoryParagraph("He drank water from a clear stream.", "از نهر زلالی آب می‌نوشید."),
                StoryParagraph("He slept under the stars every night.", "هر شب زیر ستاره‌ها می‌خوابید."),
                StoryParagraph("His life was quiet and peaceful.", "زندگی‌اش آرام و صلح‌آمیز بود."),
                StoryParagraph("But sometimes he felt lonely.", "اما گاهی احساس تنهایی می‌کرد."),
                StoryParagraph("One day, his cousin came to visit.", "یک روز، پسرخاله‌اش به دیدنش آمد."),
                StoryParagraph("The cousin was a city mouse.", "پسرخاله‌اش موش شهری بود."),
                StoryParagraph("He wore fine clothes and a hat.", "او لباس‌های شیک و کلاه می‌پوشید."),
                StoryParagraph("He looked rich and important.", "او ثروتمند و مهم به نظر می‌رسید."),
                StoryParagraph("'How are you, cousin?' asked the country mouse.", "موش روستایی پرسید: «چطوری، پسرخاله؟»"),
                StoryParagraph("'I am well,' said the city mouse.", "موش شهری گفت: «خوبم.»"),
                StoryParagraph("'But your home is so small,' he added.", "اضافه کرد: «اما خانه‌ات خیلی کوچکه.»"),
                StoryParagraph("'Come to the city with me,' he said.", "گفت: «با من به شهر بیا.»"),
                StoryParagraph("'You will see a wonderful life,' he said.", "گفت: «زندگی فوق‌العاده‌ای خواهی دید.»"),
                StoryParagraph("The country mouse was curious.", "موش روستایی کنجکاو شد."),
                StoryParagraph("'I would like to see the city,' he said.", "گفت: «دوست دارم شهر را ببینم.»"),
                StoryParagraph("So they walked to the city together.", "پس با هم به شهر راه رفتند."),
                StoryParagraph("It was a long journey.", "سفر طولانی بود.")
            )),
            StoryChapter(2, "The City Life", "زندگی شهری", listOf(
                StoryParagraph("They arrived at a big, rich house.", "آن‌ها به خانه‌ای بزرگ و ثروتمند رسیدند."),
                StoryParagraph("The city mouse led his cousin inside.", "موش شهری پسرخاله‌اش را داخل برد."),
                StoryParagraph("The room was full of delicious food.", "اتاق پر از غذای خوشمزه بود."),
                StoryParagraph("There was cheese, cake, and fruit.", "پنیر، کیک و میوه بود."),
                StoryParagraph("The country mouse could not believe his eyes.", "موش روستایی نمی‌توانست چشمانش را باور کند."),
                StoryParagraph("'Eat as much as you want,' said the city mouse.", "موش شهری گفت: «هر چقدر می‌خواهی بخور.»"),
                StoryParagraph("The country mouse ate and ate.", "موش روستایی خورد و خورد."),
                StoryParagraph("The food was the best he ever tasted.", "غذا بهترین چیزی بود که تا حالا چشیده بود."),
                StoryParagraph("'This is wonderful!' he said happily.", "با خوشحالی گفت: «این فوق‌العاده است!»"),
                StoryParagraph("'I wish I lived here,' he added.", "اضافه کرد: «کاش اینجا زندگی می‌کردم.»"),
                StoryParagraph("The city mouse smiled and nodded.", "موش شهری لبخند زد و سر تکان داد."),
                StoryParagraph("'Let me show you more,' he said.", "گفت: «بگذار بیشتر نشانت بدهم.»"),
                StoryParagraph("They walked through the big house.", "آن‌ها از خانه بزرگ عبور کردند."),
                StoryParagraph("Everything was beautiful and rich.", "همه چیز زیبا و ثروتمند بود."),
                StoryParagraph("The country mouse felt very happy.", "موش روستایی خیلی خوشحال شد."),
                StoryParagraph("Suddenly, they heard a loud noise.", "ناگهان، صدای بلندی شنیدند."),
                StoryParagraph("It was a big cat coming into the room.", "گربه بزرگی بود که وارد اتاق می‌شد."),
                StoryParagraph("The two mice ran and hid quickly.", "دو موش سریع دویدند و پنهان شدند."),
                StoryParagraph("Their hearts were beating fast.", "قلبشان تند می‌زد."),
                StoryParagraph("The cat looked around for them.", "گربه دور و بر را دنبالشان گشت.")
            )),
            StoryChapter(3, "The Danger", "خطر", listOf(
                StoryParagraph("The cat searched for a long time.", "گربه مدت زیادی گشت."),
                StoryParagraph("Finally, it went away.", "بالاخره، رفت."),
                StoryParagraph("The mice came out of their hiding place.", "موش‌ها از مخفیگاهشان بیرون آمدند."),
                StoryParagraph("The country mouse was shaking with fear.", "موش روستایی از ترس می‌لرزید."),
                StoryParagraph("'What was that?' he asked.", "پرسید: «آن چیست؟»"),
                StoryParagraph("'That was the house cat,' said the city mouse.", "موش شهری گفت: «آن گربه خانه بود.»"),
                StoryParagraph("'It tries to catch us every day,' he added.", "اضافه کرد: «هر روز تلاش می‌کند ما را بگیرد.»"),
                StoryParagraph("The country mouse was shocked.", "موش روستایی شوکه شد."),
                StoryParagraph("'Every day?' he asked again.", "دوباره پرسید: «هر روز؟»"),
                StoryParagraph("'Yes, and sometimes worse,' said his cousin.", "پسرخاله‌اش گفت: «بله، و گاهی بدتر.»"),
                StoryParagraph("'There is also a big dog in the yard.'", "«سگ بزرگی هم در حیاط هست.»"),
                StoryParagraph("'And traps in the kitchen.'", "«و تله‌هایی در آشپزخانه.»"),
                StoryParagraph("The country mouse could not believe it.", "موش روستایی نمی‌توانست باورش کند."),
                StoryParagraph("'How do you live like this?' he asked.", "پرسید: «چطور اینطوری زندگی می‌کنی؟»"),
                StoryParagraph("The city mouse looked sad.", "موش شهری غمگین به نظر رسید."),
                StoryParagraph("'We must always be careful,' he said.", "گفت: «باید همیشه مراقب باشیم.»"),
                StoryParagraph("'We never feel safe in our own home.'", "«هرگز در خانه خودمان احساس امنیت نمی‌کنیم.»"),
                StoryParagraph("The country mouse thought for a moment.", "موش روستایی لحظه‌ای فکر کرد."),
                StoryParagraph("Then he made a big decision.", "بعد تصمیم بزرگی گرفت."),
                StoryParagraph("'I want to go home,' he said.", "گفت: «می‌خواهم به خانه بروم.»")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The country mouse went back to his field.", "موش روستایی به مزرعه‌اش برگشت."),
                StoryParagraph("He was happy to see his small home.", "از دیدن خانه کوچکش خوشحال شد."),
                StoryParagraph("He ate his simple food with joy.", "غذای ساده‌اش را با شادی خورد."),
                StoryParagraph("He drank water from his clear stream.", "از نهر زلالش آب نوشید."),
                StoryParagraph("'Simple food in peace is better than a feast in fear.'", "«غذای ساده در آرامش بهتر از جشن در ترسه.»"),
                StoryParagraph("He slept peacefully under the stars.", "زیر ستاره‌ها با آرامش خوابید."),
                StoryParagraph("He never felt lonely again.", "دیگر هرگز احساس تنهایی نکرد."),
                StoryParagraph("The city mouse visited him sometimes.", "موش شهری گاهی به دیدنش می‌آمد."),
                StoryParagraph("They shared stories and laughed.", "آن‌ها داستان تعریف کردند و خندیدند."),
                StoryParagraph("The city mouse wished he could live simply too.", "موش شهری آرزو می‌کرد کاش او هم ساده زندگی می‌کرد."),
                StoryParagraph("But he was too used to the city.", "اما او خیلی به شهر عادت کرده بود."),
                StoryParagraph("The country mouse understood.", "موش روستایی فهمید."),
                StoryParagraph("Everyone has their own way of life.", "هرکسی روش زندگی خودش را دارد."),
                StoryParagraph("What matters is peace and happiness.", "چیزی که مهم است آرامش و خوشحالی است."),
                StoryParagraph("The country mouse was happy.", "موش روستایی خوشحال بود."),
                StoryParagraph("He taught this lesson to his children.", "او این درس را به فرزندانش آموخت."),
                StoryParagraph("'Peace is more valuable than riches.'", "«آرامش از ثروت باارزش‌تره.»"),
                StoryParagraph("And so he lived a happy life.", "و اینگونه زندگی شادی داشت."),
                StoryParagraph("The two cousins stayed friends forever.", "دو پسرخاله برای همیشه دوست ماندند."),
                StoryParagraph("And both learned from each other.", "و هر دو از هم یاد گرفتند.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۳: دختر شیرفروش و سطلش
    // ═══════════════════════════════════════════════════════
    private fun story53() = StoryContent(
        storyId = "milkmaid_and_pail",
        chapters = listOf(
            StoryChapter(1, "The Milkmaid", "دختر شیرفروش", listOf(
                StoryParagraph("A milkmaid was walking to the market.", "دختر شیرفروشی به سمت بازار می‌رفت."),
                StoryParagraph("She carried a pail of fresh milk on her head.", "سطل شیری تازه روی سرش داشت."),
                StoryParagraph("She was going to sell the milk.", "می‌خواست شیر را بفروشد."),
                StoryParagraph("The milk was white and fresh.", "شیر سفید و تازه بود."),
                StoryParagraph("She would get good money for it.", "پول خوبی برایش می‌گرفت."),
                StoryParagraph("The girl began to think about the money.", "دختر شروع کرد به فکر کردن درباره پول."),
                StoryParagraph("'With this money, I will buy eggs,' she said.", "گفت: «با این پول، تخم‌مرغ می‌خرم.»"),
                StoryParagraph("'The eggs will hatch into chickens.'", "«تخم‌مرغ‌ها به جوجه تبدیل می‌شوند.»"),
                StoryParagraph("'Then I will have many chickens.'", "«بعد جوجه‌های زیادی خواهم داشت.»"),
                StoryParagraph("'I will sell some chickens,' she said.", "گفت: «چند جوجه را می‌فروشم.»"),
                StoryParagraph("'With that money, I will buy a new dress.'", "«با آن پول، لباس جدیدی می‌خرم.»"),
                StoryParagraph("'A beautiful green dress with ribbons.'", "«لباس سبز زیبایی با روبان.»"),
                StoryParagraph("'I will wear it to the fair,' she said.", "گفت: «آن را در نمایشگاه می‌پوشم.»"),
                StoryParagraph("'All the young men will look at me.'", "«همه مردان جوان به من نگاه می‌کنند.»"),
                StoryParagraph("'They will ask me to dance.'", "«از من می‌خواهند برقصم.»"),
                StoryParagraph("'I will shake my head like this,' she said.", "گفت: «سرم را اینطوری تکان می‌دهم.»"),
                StoryParagraph("She tilted her head proudly.", "او با افتخار سرش را کج کرد."),
                StoryParagraph("But she forgot about the pail!", "اما سطل را فراموش کرد!"),
                StoryParagraph("The pail fell off her head.", "سطل از سرش افتاد."),
                StoryParagraph("The milk spilled all over the ground.", "شیر همه روی زمین ریخت.")
            )),
            StoryChapter(2, "The Lost Milk", "شیر از دست رفته", listOf(
                StoryParagraph("The milkmaid stared at the ground.", "دختر شیرفروش به زمین خیره شد."),
                StoryParagraph("The milk was gone in a moment.", "شیر در یک لحظه از بین رفت."),
                StoryParagraph("No milk, no money.", "نه شیر، نه پول."),
                StoryParagraph("No eggs, no chickens.", "نه تخم‌مرغ، نه جوجه."),
                StoryParagraph("No dress, no ribbons.", "نه لباس، نه روبان."),
                StoryParagraph("No dancing at the fair.", "نه رقصیدن در نمایشگاه."),
                StoryParagraph("Everything was lost in a second.", "همه چیز در یک لحظه از دست رفت."),
                StoryParagraph("All because of a silly daydream.", "همه به خاطر یک خیال احمقانه."),
                StoryParagraph("The girl sat down and cried.", "دختر نشست و گریه کرد."),
                StoryParagraph("People walked by and asked what happened.", "مردم از کنارش می‌گذشتند و می‌پرسیدند چه شد."),
                StoryParagraph("She told them about the spilled milk.", "او درباره شیر ریخته به آن‌ها گفت."),
                StoryParagraph("Some people laughed at her.", "بعضی‌ها به او خندیدند."),
                StoryParagraph("Some people felt sorry for her.", "بعضی‌ها برایش دلشان سوخت."),
                StoryParagraph("An old woman came and helped her up.", "پیرزنی آمد و کمکش کرد بلند شود."),
                StoryParagraph("'Do not cry, my dear,' said the old woman.", "پیرزن گفت: «گریه نکن، عزیزم.»"),
                StoryParagraph("'You can always get more milk.'", "«همیشه می‌تونی شیر بیشتری بگیری.»"),
                StoryParagraph("'But you cannot get back lost time.'", "«اما زمان از دست رفته را نمی‌تونی برگردونی.»"),
                StoryParagraph("The girl wiped her tears and listened.", "دختر اشک‌هایش را پاک کرد و گوش داد."),
                StoryParagraph("'Work for today, dream for tomorrow,' said the old woman.", "پیرزن گفت: «برای امروز کار کن، برای فردا خواب ببین.»"),
                StoryParagraph("The girl nodded and went home.", "دختر سر تکان داد و به خانه رفت.")
            )),
            StoryChapter(3, "The New Start", "شروع جدید", listOf(
                StoryParagraph("The next morning, the girl woke up early.", "صبح روز بعد، دختر زود بیدار شد."),
                StoryParagraph("She went to the cows to get fresh milk.", "او به سمت گاوها رفت تا شیر تازه بگیرد."),
                StoryParagraph("She filled her pail carefully.", "سطلش را با دقت پر کرد."),
                StoryParagraph("This time, she did not daydream.", "این بار، خیال‌پردازی نکرد."),
                StoryParagraph("She walked slowly to the market.", "آرام‌آرام به سمت بازار راه رفت."),
                StoryParagraph("She kept her eyes on the road.", "چشمانش را روی جاده نگه داشت."),
                StoryParagraph("She sold the milk for a good price.", "شیر را با قیمت خوبی فروخت."),
                StoryParagraph("She bought some eggs with the money.", "با پولش چند تخم‌مرغ خرید."),
                StoryParagraph("This time, she took them home safely.", "این بار، آن‌ها را سالم به خانه برد."),
                StoryParagraph("The eggs hatched into small chicks.", "تخم‌مرغ‌ها به جوجه‌های کوچک تبدیل شدند."),
                StoryParagraph("The girl took care of them every day.", "دختر هر روز از آن‌ها مراقبت کرد."),
                StoryParagraph("The chicks grew into healthy chickens.", "جوجه‌ها به مرغ‌های سالم تبدیل شدند."),
                StoryParagraph("She sold some and kept some.", "بعضی را فروخت و بعضی را نگه داشت."),
                StoryParagraph("She saved her money carefully.", "پولش را با دقت ذخیره کرد."),
                StoryParagraph("After many months, she bought a dress.", "بعد از ماه‌ها، لباس خرید."),
                StoryParagraph("It was green with pretty ribbons.", "سبز بود با روبان‌های زیبا."),
                StoryParagraph("She wore it to the fair.", "آن را در نمایشگاه پوشید."),
                StoryParagraph("But she did not shake her head.", "اما سرش را تکان نداد."),
                StoryParagraph("She remembered the spilled milk.", "شیر ریخته را به یاد آورد."),
                StoryParagraph("She learned to be patient and careful.", "یاد گرفت صبور و محتاط باشد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The milkmaid became a wise woman.", "دختر شیرفروش زن عاقلی شد."),
                StoryParagraph("She taught her children about patience.", "او به فرزندانش درباره صبر آموخت."),
                StoryParagraph("'Do not count your chickens before they hatch,' she said.", "می‌گفت: «جوجه‌ها را قبل از بیرون آمدن نشمار.»"),
                StoryParagraph("'Do not dream before the work is done.'", "«قبل از تمام شدن کار خواب نبین.»"),
                StoryParagraph("Her children learned this lesson well.", "فرزندانش این درس را خوب یاد گرفتند."),
                StoryParagraph("They worked hard and planned carefully.", "سخت کار کردند و با دقت برنامه ریختند."),
                StoryParagraph("They became successful farmers.", "آن‌ها کشاورزان موفقی شدند."),
                StoryParagraph("The story of the milkmaid was told in the village.", "داستان دختر شیرفروش در روستا تعریف شد."),
                StoryParagraph("Parents told it to their children.", "والدین آن را به فرزندانشان گفتند."),
                StoryParagraph("It taught them to be careful.", "به آن‌ها یاد داد محتاط باشند."),
                StoryParagraph("It taught them to work before dreaming.", "به آن‌ها یاد داد قبل از خواب، کار کنند."),
                StoryParagraph("The milkmaid became an example for everyone.", "دختر شیرفروش الگویی برای همه شد."),
                StoryParagraph("She never spilled milk again.", "او دیگر هرگز شیر نریخت."),
                StoryParagraph("She lived a happy and peaceful life.", "او زندگی شاد و آرامی داشت."),
                StoryParagraph("Her children loved and respected her.", "فرزندانش دوستش داشتند و به او احترام می‌گذاشتند."),
                StoryParagraph("She helped other girls in the village.", "او به دختران دیگر روستا کمک کرد."),
                StoryParagraph("'Learn from my mistake,' she always said.", "همیشه می‌گفت: «از اشتباه من درس بگیرید.»"),
                StoryParagraph("The girls listened and worked hard.", "دختران گوش دادند و سخت کار کردند."),
                StoryParagraph("The village became rich and happy.", "روستا ثروتمند و خوشحال شد."),
                StoryParagraph("And the milkmaid was proud of them all.", "و دختر شیرفروش به همه‌شان افتخار کرد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۴: کلاغ و کوزه
    // ═══════════════════════════════════════════════════════
    private fun story54() = StoryContent(
        storyId = "crow_and_pitcher",
        chapters = listOf(
            StoryChapter(1, "The Thirsty Crow", "کلاغ تشنه", listOf(
                StoryParagraph("It was a hot summer day.", "روز گرم تابستانی بود."),
                StoryParagraph("A crow was flying over the fields.", "کلاغی بر فراز مزارع پرواز می‌کرد."),
                StoryParagraph("He had not drunk water for a long time.", "مدت زیادی آب ننوشیده بود."),
                StoryParagraph("His throat was dry and painful.", "گلویش خشک و دردناک بود."),
                StoryParagraph("He flew here and there, looking for water.", "اینجا و آنجا پرواز کرد، دنبال آب گشت."),
                StoryParagraph("But he could not find any.", "اما نمی‌توانست هیچی پیدا کند."),
                StoryParagraph("The sun was very hot and bright.", "خورشید خیلی گرم و درخشان بود."),
                StoryParagraph("The crow felt weaker and weaker.", "کلاغ ضعیف‌تر و ضعیف‌تر شد."),
                StoryParagraph("He thought he might die of thirst.", "فکر کرد ممکن است از تشنگی بمیرد."),
                StoryParagraph("Then he saw a small house below.", "بعد خانه کوچکی در پایین دید."),
                StoryParagraph("He flew closer to look.", "نزدیک‌تر پرواز کرد تا نگاه کند."),
                StoryParagraph("Near the house was a pitcher on the ground.", "نزدیک خانه کوزه‌ای روی زمین بود."),
                StoryParagraph("It was a clay pitcher, old and brown.", "کوزه‌ای سفالی بود، قدیمی و قهوه‌ای."),
                StoryParagraph("The crow landed beside it quickly.", "کلاغ سریع کنارش فرود آمد."),
                StoryParagraph("He looked inside the pitcher.", "داخل کوزه را نگاه کرد."),
                StoryParagraph("There was water at the bottom!", "آب در ته آن بود!"),
                StoryParagraph("The crow was very happy.", "کلاغ خیلی خوشحال شد."),
                StoryParagraph("But the water was very low.", "اما آب خیلی پایین بود."),
                StoryParagraph("His beak could not reach it.", "منقارش نمی‌توانست به آن برسد."),
                StoryParagraph("He tried again and again, but failed.", "دوباره و دوباره تلاش کرد، اما شکست خورد.")
            )),
            StoryChapter(2, "The Smart Crow", "کلاغ باهوش", listOf(
                StoryParagraph("The crow did not give up.", "کلاغ تسلیم نشد."),
                StoryParagraph("He sat and thought for a while.", "نشست و مدتی فکر کرد."),
                StoryParagraph("'I need a clever idea,' he said.", "گفت: «به یک فکر باهوشانه نیاز دارم.»"),
                StoryParagraph("He looked around for something to use.", "دنبال چیزی برای استفاده گشت."),
                StoryParagraph("Near the pitcher, he saw small stones.", "نزدیک کوزه، سنگ‌های کوچکی دید."),
                StoryParagraph("Suddenly, he had a great idea.", "ناگهان، فکر عالی‌ای کرد."),
                StoryParagraph("'I will put stones in the pitcher,' he said.", "گفت: «سنگ‌ها را در کوزه می‌گذارم.»"),
                StoryParagraph("'The water will rise up.'", "«آب بالا می‌آید.»"),
                StoryParagraph("He picked up a small stone.", "سنگ کوچکی برداشت."),
                StoryParagraph("He dropped it into the pitcher.", "آن را در کوزه انداخت."),
                StoryParagraph("Then he picked up another stone.", "بعد سنگ دیگری برداشت."),
                StoryParagraph("He dropped it in too.", "آن را هم انداخت."),
                StoryParagraph("One by one, he dropped the stones.", "یکی‌یکی، سنگ‌ها را انداخت."),
                StoryParagraph("The water began to rise slowly.", "آب شروع کرد به آرام بالا آمدن."),
                StoryParagraph("The crow kept working patiently.", "کلاغ صبورانه کار کرد."),
                StoryParagraph("He did not stop or rest.", "او نایستاد و استراحت نکرد."),
                StoryParagraph("The water came higher and higher.", "آب بالاتر و بالاتر آمد."),
                StoryParagraph("Finally, it reached the top!", "بالاخره، به بالا رسید!"),
                StoryParagraph("The crow drank the cool water.", "کلاغ آب خنک را نوشید."),
                StoryParagraph("He felt strong and happy again.", "دوباره قوی و خوشحال شد.")
            )),
            StoryChapter(3, "The Reward", "پاداش", listOf(
                StoryParagraph("The crow flew up to a tree.", "کلاغ به درختی پرواز کرد."),
                StoryParagraph("He sat on a branch and rested.", "روی شاخه‌ای نشست و استراحت کرد."),
                StoryParagraph("He felt proud of his clever idea.", "به فکر باهوشانه‌اش افتخار کرد."),
                StoryParagraph("A farmer came out of the house.", "کشاورزی از خانه بیرون آمد."),
                StoryParagraph("He saw the stones in the pitcher.", "سنگ‌ها را در کوزه دید."),
                StoryParagraph("He looked up and saw the crow.", "بالا نگاه کرد و کلاغ را دید."),
                StoryParagraph("'What a smart bird!' said the farmer.", "کشاورز گفت: «چه پرنده باهوشی!»"),
                StoryParagraph("'You saved your own life,' he added.", "اضافه کرد: «جان خودت را نجات دادی.»"),
                StoryParagraph("The farmer brought more water for the crow.", "کشاورز آب بیشتری برای کلاغ آورد."),
                StoryParagraph("He also brought some bread crumbs.", "چند تکه نان هم آورد."),
                StoryParagraph("The crow ate and drank happily.", "کلاغ با خوشحالی خورد و نوشید."),
                StoryParagraph("He thanked the farmer with a song.", "با آوازی از کشاورز تشکر کرد."),
                StoryParagraph("The farmer smiled and went inside.", "کشاورز لبخند زد و داخل رفت."),
                StoryParagraph("The crow stayed in the tree.", "کلاغ در درخت ماند."),
                StoryParagraph("He watched the field and the sky.", "مزرعه و آسمان را تماشا کرد."),
                StoryParagraph("He thought about his clever trick.", "به حقه باهوشانه‌اش فکر کرد."),
                StoryParagraph("'Being smart is better than being strong,' he said.", "گفت: «باهوش بودن بهتر از قوی بودنه.»"),
                StoryParagraph("He flew away to find his family.", "پرواز کرد تا خانواده‌اش را پیدا کند."),
                StoryParagraph("He wanted to share his story.", "می‌خواست داستانش را تعریف کند."),
                StoryParagraph("And he never forgot that hot day.", "و هرگز آن روز گرم را فراموش نکرد.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The crow told his story to other birds.", "کلاغ داستانش را به پرنده‌های دیگر گفت."),
                StoryParagraph("They were amazed by his cleverness.", "آن‌ها از باهوشی‌اش شگفت‌زده شدند."),
                StoryParagraph("'Never give up,' said the crow.", "کلاغ گفت: «هرگز تسلیم نشو.»"),
                StoryParagraph("'Think and find a way,' he added.", "اضافه کرد: «فکر کن و راهی پیدا کن.»"),
                StoryParagraph("'Every problem has a solution.'", "«هر مشکلی راه‌حلی داره.»"),
                StoryParagraph("The birds learned from his story.", "پرنده‌ها از داستانش یاد گرفتند."),
                StoryParagraph("They started to think before acting.", "آن‌ها شروع کردند قبل از عمل فکر کنند."),
                StoryParagraph("They became smarter and stronger.", "آن‌ها باهوش‌تر و قوی‌تر شدند."),
                StoryParagraph("The story of the crow spread far.", "داستان کلاغ دور و بر پخش شد."),
                StoryParagraph("Mothers told it to their children.", "مادران آن را به فرزندانشان گفتند."),
                StoryParagraph("Teachers told it to their students.", "معلمان آن را به شاگردانشان گفتند."),
                StoryParagraph("It became a famous story of wisdom.", "این داستان معروفی از خرد شد."),
                StoryParagraph("The crow lived a long and happy life.", "کلاغ زندگی طولانی و شادی داشت."),
                StoryParagraph("He was known for his smart ideas.", "او برای فکرهای باهوشانه‌اش شناخته می‌شد."),
                StoryParagraph("He helped other birds in trouble.", "او به پرنده‌های دیگر در مشکلات کمک کرد."),
                StoryParagraph("And they all respected him.", "و همه به او احترام می‌گذاشتند."),
                StoryParagraph("The lesson was simple but powerful.", "درس ساده اما قدرتمند بود."),
                StoryParagraph("Where there is a will, there is a way.", "خواستن، توانستن است."),
                StoryParagraph("Never give up, no matter what.", "هرگز تسلیم نشو، هر چه باشد."),
                StoryParagraph("And so ends the story of the clever crow.", "و اینگونه داستان کلاغ باهوش به پایان می‌رسد.")
            ))
        )
    )

    // ═══════════════════════════════════════════════════════
    //  ۵۵: غاز طلایی
    // ═══════════════════════════════════════════════════════
    private fun story55() = StoryContent(
        storyId = "golden_goose",
        chapters = listOf(
            StoryChapter(1, "The Kind Brother", "برادر مهربان", listOf(
                StoryParagraph("Once there were two brothers.", "روزی دو برادر بودند."),
                StoryParagraph("The older brother was greedy and mean.", "برادر بزرگ‌تر طمعکار و بدجنس بود."),
                StoryParagraph("The younger brother was kind and good.", "برادر کوچک‌تر مهربان و خوب بود."),
                StoryParagraph("The older brother took everything.", "برادر بزرگ‌تر همه چیز را گرفت."),
                StoryParagraph("He left the younger with nothing.", "برادر کوچک‌تر را با هیچ چیز رها کرد."),
                StoryParagraph("The younger brother went into the forest.", "برادر کوچک‌تر به جنگل رفت."),
                StoryParagraph("He was sad but did not complain.", "غمگین بود اما شکایت نکرد."),
                StoryParagraph("He walked until he found a small hut.", "راه رفت تا کلبه کوچکی پیدا کرد."),
                StoryParagraph("In the hut lived an old man.", "در کلبه پیرمردی زندگی می‌کرد."),
                StoryParagraph("The old man was very hungry.", "پیرمرد خیلی گرسنه بود."),
                StoryParagraph("The younger brother gave him his food.", "برادر کوچک‌تر غذایش را به او داد."),
                StoryParagraph("He did not keep anything for himself.", "هیچی برای خودش نگه نداشت."),
                StoryParagraph("The old man smiled kindly.", "پیرمرد مهربانانه لبخند زد."),
                StoryParagraph("'You are a good man,' he said.", "گفت: «تو مرد خوبی هستی.»"),
                StoryParagraph("'I will give you a gift,' he added.", "اضافه کرد: «هدیه‌ای به تو می‌دهم.»"),
                StoryParagraph("He gave him a golden goose.", "غاز طلایی به او داد."),
                StoryParagraph("The goose was beautiful and shiny.", "غاز زیبا و درخشان بود."),
                StoryParagraph("Its feathers were made of gold.", "پرهایش از طلا بود."),
                StoryParagraph("'Take care of it,' said the old man.", "پیرمرد گفت: «ازش مراقبت کن.»"),
                StoryParagraph("'It will bring you good luck.'", "«برای تو خوش‌شانسی می‌آورد.»")
            )),
            StoryChapter(2, "The Golden Feathers", "پرهای طلایی", listOf(
                StoryParagraph("The younger brother took the goose home.", "برادر کوچک‌تر غاز را به خانه برد."),
                StoryParagraph("The goose laid a golden egg every day.", "غاز هر روز یک تخم طلایی می‌گذاشت."),
                StoryParagraph("The brother sold the eggs in the market.", "برادر تخم‌ها را در بازار فروخت."),
                StoryParagraph("He became rich slowly but surely.", "او آرام اما مطمئن ثروتمند شد."),
                StoryParagraph("He was happy but not greedy.", "خوشحال بود اما طمعکار نبود."),
                StoryParagraph("He shared his money with the poor.", "پولش را با فقرا تقسیم کرد."),
                StoryParagraph("The older brother heard about the goose.", "برادر بزرگ‌تر درباره غاز شنید."),
                StoryParagraph("He became very jealous and angry.", "او خیلی حسود و عصبانی شد."),
                StoryParagraph("'I want that goose!' he said.", "گفت: «آن غاز را می‌خواهم!»"),
                StoryParagraph("'I will take it from him.'", "«از او می‌گیرمش.»"),
                StoryParagraph("One night, he went to his brother's house.", "یک شب، به خانه برادرش رفت."),
                StoryParagraph("He stole the golden goose.", "او غاز طلایی را دزدید."),
                StoryParagraph("He took it home quickly.", "سریع به خانه برد."),
                StoryParagraph("'I will take all the golden feathers,' he said.", "گفت: «همه پرهای طلایی را می‌گیرم.»"),
                StoryParagraph("'I will become rich tonight!'", "«امشب ثروتمند می‌شوم!»"),
                StoryParagraph("He grabbed the goose and pulled.", "غاز را گرفت و کشید."),
                StoryParagraph("But the feathers did not come off.", "اما پرها جدا نشدند."),
                StoryParagraph("The goose cried out in pain.", "غاز از درد فریاد زد."),
                StoryParagraph("The brother became very angry.", "برادر خیلی عصبانی شد."),
                StoryParagraph("He shook the goose harder and harder.", "غاز را محکم‌تر و محکم‌تر تکان داد.")
            )),
            StoryChapter(3, "The Magic", "جادو", listOf(
                StoryParagraph("Suddenly, magic happened.", "ناگهان، جادو اتفاق افتاد."),
                StoryParagraph("The brother's hands stuck to the goose!", "دست‌های برادر به غاز چسبید!"),
                StoryParagraph("He could not let go.", "نمی‌توانست رهایش کند."),
                StoryParagraph("He tried to pull away, but failed.", "تلاش کرد جدا شود، اما نشد."),
                StoryParagraph("He shouted for help.", "برای کمک فریاد زد."),
                StoryParagraph("His wife came running.", "همسرش دوان‌دوان آمد."),
                StoryParagraph("She grabbed him to pull him away.", "او را گرفت تا جدا کند."),
                StoryParagraph("But her hands stuck to him too!", "اما دست‌های او هم به او چسبید!"),
                StoryParagraph("Their daughter came to help.", "دخترشان برای کمک آمد."),
                StoryParagraph("She grabbed her mother and stuck too.", "مادرش را گرفت و او هم چسبید."),
                StoryParagraph("The whole family was stuck together.", "تمام خانواده به هم چسبیدند."),
                StoryParagraph("They walked to the village for help.", "برای کمک به روستا راه افتادند."),
                StoryParagraph("People laughed at the funny group.", "مردم به گروه خنده‌دار خندیدند."),
                StoryParagraph("A baker tried to help them.", "نانوایی تلاش کرد کمکشان کند."),
                StoryParagraph("But he stuck to them too.", "اما او هم به آن‌ها چسبید."),
                StoryParagraph("More and more people stuck.", "مردم بیشتر و بیشتری چسبیدند."),
                StoryParagraph("The line of people became very long.", "صف مردم خیلی طولانی شد."),
                StoryParagraph("They walked through the whole village.", "آن‌ها از کل روستا گذشتند."),
                StoryParagraph("Everyone was laughing and shouting.", "همه می‌خندیدند و فریاد می‌زدند."),
                StoryParagraph("It was a funny and strange sight.", "منظره خنده‌دار و عجیبی بود.")
            )),
            StoryChapter(4, "The Lesson", "درس", listOf(
                StoryParagraph("The younger brother saw the crowd.", "برادر کوچک‌تر جمعیت را دید."),
                StoryParagraph("He knew what had happened.", "او فهمید چه اتفاقی افتاده."),
                StoryParagraph("He went to his older brother.", "به سمت برادر بزرگ‌ترش رفت."),
                StoryParagraph("'Let go of the goose,' he said kindly.", "مهربانانه گفت: «غاز را رها کن.»"),
                StoryParagraph("'I forgive you for stealing it.'", "«برای دزدیدنش می‌بخشمَت.»"),
                StoryParagraph("The older brother cried with shame.", "برادر بزرگ‌تر از شرم گریه کرد."),
                StoryParagraph("'I am sorry,' he said softly.", "آرام گفت: «متأسفم.»"),
                StoryParagraph("The moment he said sorry, everyone was free.", "همان لحظه که عذرخواهی کرد، همه آزاد شدند."),
                StoryParagraph("The magic disappeared.", "جادو ناپدید شد."),
                StoryParagraph("The older brother learned a lesson.", "برادر بزرگ‌تر درسی یاد گرفت."),
                StoryParagraph("He promised to be kind and honest.", "قول داد مهربان و صادق باشد."),
                StoryParagraph("The younger brother forgave him.", "برادر کوچک‌تر بخشیدش."),
                StoryParagraph("They shared the golden eggs together.", "آن‌ها تخم‌های طلایی را با هم تقسیم کردند."),
                StoryParagraph("Both became good and happy men.", "هر دو مردان خوب و خوشحالی شدند."),
                StoryParagraph("The village became peaceful again.", "روستا دوباره آرام شد."),
                StoryParagraph("The story taught everyone about kindness.", "داستان به همه درباره مهربانی آموخت."),
                StoryParagraph("Greed brings trouble.", "طمع دردسر می‌آورد."),
                StoryParagraph("Kindness brings true happiness.", "مهربانی خوشحالی واقعی می‌آورد."),
                StoryParagraph("And so the two brothers lived in peace.", "و اینگونه دو برادر در آرامش زندگی کردند."),
                StoryParagraph("The golden goose stayed with them forever.", "غاز طلایی برای همیشه با آن‌ها ماند.")
            ))
        )
    )
}