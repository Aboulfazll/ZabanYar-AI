package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * ۱۹. کوه جادو — توماس مان
 */
object Story19 {

    fun get(): StoryContent = StoryContent(
        storyId = "adv_magic_mountain",
        chapters = listOf(
            chapter1(),
            chapter2(),
            chapter3(),
            chapter4(),
            chapter5(),
            chapter6(),
        )
    )

    // ─────────── فصل ۱: ورود ───────────
    private fun chapter1() = StoryChapter(
        number = 1, title = "Arrival", titlePersian = "ورود",
        paragraphs = listOf(
            StoryParagraph("Hans Castorp was a young man of twenty-three, and he had come to visit his cousin at a sanatorium in the mountains.", "هانس کاستورپ جوانی بیست و سه ساله بود و برای دیدن پسرعمویش به آسایشگاهی در کوه‌ها آمده بود."),
            StoryParagraph("The journey had been long, and the mountains had grown stranger at every stage.", "سفر طولانی بود و کوه‌ها در هر مرحله عجیب‌تر می‌شدند."),
            StoryParagraph("He had taken the train from Hamburg, and then another train, and then a small narrow-gauge railway that climbed through pine forests into the Alps.", "او از هامبورگ با قطار رفته بود و بعد با قطار دیگری و بعد با راه‌آهن کوچک باریکی که از میان جنگل‌های کاج به آلپ بالا می‌رفت."),
            StoryParagraph("The air grew thinner, the sky grew clearer, and Hans felt a strange mixture of excitement and unease.", "هوا نازک‌تر شد، آسمان شفاف‌تر و هانس ترکیبی عجیب از هیجان و ناآرامی حس کرد."),
            StoryParagraph("He was going to visit his cousin Joachim Ziemssen, who was being treated for tuberculosis at the Berghof sanatorium.", "او می‌رفت پسرعمویش یواخیم تسیمسن را ببیند، که برای سل در آسایشگاه برگهوف درمان می‌شد."),
            StoryParagraph("Hans had planned to stay for three weeks, no more, for he had studies to complete and a career to begin.", "هانس نقشه داشت سه هفته بماند، نه بیشتر، چون تحصیلاتی برای تکمیل و حرفه‌ای برای آغاز داشت."),
            StoryParagraph("He was an engineer, or would be soon; he had a future before him, a future of ships and machines and progress.", "او مهندس بود، یا به‌زودی می‌شد؛ آینده‌ای پیش رو داشت، آینده‌ای از کشتی‌ها و ماشین‌ها و پیشرفت."),
            StoryParagraph("But in the meantime, there was this journey, this mountain, this strange world above the clouds.", "اما در این بین، این سفر بود، این کوه، این جهان عجیب بالای ابرها."),
            StoryParagraph("At the station, a small man in a fur coat was waiting with a sleigh.", "در ایستگاه، مرد کوچکی با پالتوی خز با سورتمه‌ای منتظر بود."),
            StoryParagraph("He introduced himself as the director's assistant, and he helped Hans into the sleigh.", "خودش را دستیار مدیر معرفی کرد و کمک کرد هانس روی سورتمه بنشیند."),
            StoryParagraph("The sleigh climbed up the winding road, past frozen waterfalls and snow-covered pine trees.", "سورتمه از جاده پرپیچ بالا رفت، از کنار آبشارهای یخ‌زده و درختان کاج پوشیده از برف."),
            StoryParagraph("Hans wrapped himself in the blankets and watched the world grow smaller and stranger.", "هانس خودش را در پتو پیچید و تماشا کرد که جهان کوچک‌تر و عجیب‌تر می‌شود."),
            StoryParagraph("He felt as if he were leaving behind not just the city, but a whole way of being.", "حس کرد نه تنها شهر را، بلکه شیوه‌ای از بودن را پشت سر می‌گذارد."),
            StoryParagraph("The sanatorium came into view: a long white building with many balconies, perched high on the mountainside.", "آسایشگاه در دیدار آمد: ساختمانی بلند و سفید با بالکن‌های بسیاری که در ارتفاعی بالا روی دامنه کوه نشسته بود."),
            StoryParagraph("Above it, the peaks rose to the sky, eternal and indifferent.", "بالای آن، قله‌ها به آسمان می‌رسیدند، ابدی و بی‌تفاوت."),
            StoryParagraph("Below it, the valley fell away into mist, into another world entirely.", "پایین آن، دره به مه می‌ریخت، به جهانی کاملاً دیگر."),
            StoryParagraph("'Welcome to the Berghof,' the assistant said, and his voice was cheerful, as if this were a hotel and not a hospital.", "دستیار گفت: «به برگهوف خوش آمدید.» و صدایش شاد بود، گویی این هتل بود و نه بیمارستان."),
            StoryParagraph("Hans stepped out of the sleigh and looked up at the building, and for a moment he felt dizzy.", "هانس از سورتمه پیاده شد و به ساختمان نگاه کرد و لحظه‌ای سرگیجه گرفت."),
            StoryParagraph("'The air is thin up here,' the assistant said. 'You will get used to it.'", "دستیار گفت: «هوا این بالا نازک است. عادت می‌کنید.»"),
            StoryParagraph("Hans nodded, and he followed the man into the building, into a world that he did not yet understand.", "هانس سر تکان داد و دنبال مرد به داخل ساختمان رفت، به جهانی که هنوز نمی‌فهمید."),
            StoryParagraph("The dining room was full of people, and they all seemed to be staring at him.", "اتاق غذاخوری پر از مردم بود و همه به نظر می‌رسیدند به او خیره شده‌اند."),
            StoryParagraph("Joachim stood up when he saw his cousin, and he smiled, and he came toward him.", "یواخیم وقتی پسرعمویش را دید بلند شد و لبخند زد و به سمتش آمد."),
            StoryParagraph("'Hans,' he said. 'You came.'", "گفت: «هانس. آمدی.»"),
            StoryParagraph("'Of course I came,' Hans said. 'How could I not come?'", "هانس گفت: «البته که آمدم. چطور ممکن بود نیایم؟»"),
            StoryParagraph("They embraced, and the people in the dining room watched, and Hans felt that they were watching him with a strange, knowing curiosity.", "همدیگر را در آغوش گرفتند و مردم در اتاق غذاخوری تماشا کردند و هانس حس کرد که با کنجکاوی‌ای عجیب و آگاهانه تماشایش می‌کنند."),
            StoryParagraph("'Come,' Joachim said. 'Sit down. Eat. You must be hungry.'", "یواخیم گفت: «بیا. بنشین. بخور. باید گرسنه باشی.»"),
            StoryParagraph("Hans sat down at the table, and he looked around, and he saw faces of all kinds: young and old, beautiful and plain, healthy-looking and pale.", "هانس پشت میز نشست و اطراف را نگاه کرد و چهره‌هایی از همه نوع دید: جوان و پیر، زیبا و معمولی، سالم‌نما و رنگ‌پریده."),
            StoryParagraph("They all had one thing in common: a certain look, a certain pallor, a certain intensity, that marked them as belonging to this place.", "همه یک چیز مشترک داشتند: نگاهی خاص، رنگ‌پریدگی خاص، شدتی خاص، که آنان را به این مکان تعلق‌مند می‌کرد."),
            StoryParagraph("'You will meet everyone soon enough,' Joachim said. 'But first, eat. The food here is surprisingly good.'", "یواخیم گفت: «به‌زودی همه را خواهی شناخت. اما اول، بخور. غذای اینجا به‌طور غافلگیرکننده‌ای خوب است.»"),
            StoryParagraph("Hans began to eat, and as he ate, he watched the people around him, and he began to feel that he was entering a world that had its own rules, its own time, its own way of being.", "هانس شروع به خوردن کرد و همانطور که می‌خورد، به مردم اطرافش نگاه کرد و شروع کرد به حس کردن که دارد به جهانی وارد می‌شود که قواعد خودش، زمان خودش، شیوه خودش از بودن را دارد."),
            StoryParagraph("'You look tired,' Joachim said. 'You should rest after the journey. Tomorrow, I will show you around.'", "یواخیم گفت: «خسته به نظر می‌رسی. باید بعد از سفر استراحت کنی. فردا همه جا را نشانت می‌دهم.»"),
            StoryParagraph("Hans nodded, but he was not really listening; he was too busy watching, too busy wondering, too busy trying to understand what he was seeing.", "هانس سر تکان داد اما واقعاً گوش نمی‌داد؛ بیش از حد مشغول تماشا بود، بیش از حد مشغول حیرت، بیش از حد مشغول تلاش برای فهمیدن آنچه می‌دید."),
            StoryParagraph("After the meal, Joachim took him to his room, a small room with a balcony overlooking the valley.", "بعد از غذا، یواخیم او را به اتاقش برد، اتاقی کوچک با بالکنی مشرف به دره."),
            StoryParagraph("'Here you are,' Joachim said. 'Rest now. I will come for you in the evening.'", "یواخیم گفت: «آنجا هستی. حالا استراحت کن. عصر می‌آیم دنبالت.»"),
            StoryParagraph("He left, and Hans was alone, and he stood on the balcony and looked out at the mountains.", "او رفت و هانس تنها شد و روی بالکن ایستاد و به کوه‌ها نگاه کرد."),
            StoryParagraph("The peaks were white and silent, and they seemed to be watching him, patient and eternal.", "قله‌ها سفید و ساکت بودند و به نظر می‌رسید تماشایش می‌کنند، صبور و ابدی."),
            StoryParagraph("'Three weeks,' Hans said to himself. 'Three weeks, and then I will go home.'", "هانس به خودش گفت: «سه هفته. سه هفته و بعد به خانه می‌روم.»"),
            StoryParagraph("But something in him already knew that things would not be so simple.", "اما چیزی درونش از قبل می‌دانست که چیزها اینقدر ساده نخواهد بود."),
            StoryParagraph("Something in him already knew that this mountain, this sanatorium, this strange world above the clouds, would change him forever.", "چیزی درونش از قبل می‌دانست که این کوه، این آسایشگاه، این جهان عجیب بالای ابرها، برای همیشه تغییرش می‌دهد.")
        )
    )

    // ─────────── فصل ۲: آسایشگاه ───────────
    private fun chapter2() = StoryChapter(
        number = 2, title = "The Sanatorium", titlePersian = "آسایشگاه",
        paragraphs = listOf(
            StoryParagraph("The days at the Berghof had their own rhythm, a rhythm that Hans learned quickly and could not quite understand.", "روزها در برگهوف ریتم خودشان را داشتند، ریتمی که هانس سریع یاد گرفت و نمی‌توانست کاملاً بفهمد."),
            StoryParagraph("There were five meals a day: breakfast, second breakfast, lunch, afternoon tea, and supper.", "پنج وعده در روز بود: صبحانه، صبحانه دوم، ناهار، چای بعدازظهر و شام."),
            StoryParagraph("There were rests after every meal, and there were walks, and there were conversations on the balconies.", "بعد از هر وعده استراحت بود و پیاده‌روی بود و گفتگو روی بالکن‌ها بود."),
            StoryParagraph("The patients lay on their balconies, wrapped in blankets, in special reclining chairs, for hours at a time.", "بیماران روی بالکن‌هایشان دراز می‌کشیدند، پیچیده در پتو، در صندلی‌های مخصوص درازکش، ساعت‌ها پشت سر هم."),
            StoryParagraph("They called this the 'cure,' and they took it very seriously, as if it were a religion.", "آن را «درمان» می‌نامیدند و آن را خیلی جدی می‌گرفتند، گویی دین بود."),
            StoryParagraph("Hans did not understand why they were always resting, always measuring their temperatures, always talking about their illnesses.", "هانس نمی‌فهمید چرا مدام استراحت می‌کردند، مدام دمایشان را اندازه می‌گرفتند، مدام از بیماری‌شان صحبت می‌کردند."),
            StoryParagraph("But he began to be drawn into their world, into their conversations, into their obsessions.", "اما شروع کرد به کشیده شدن به دنیایشان، به گفتگوهایشان، به وسواس‌هایشان."),
            StoryParagraph("He met a woman named Clavdia Chauchat, a Russian, with a strange beauty and an even stranger manner.", "با زنی به نام کلاودیا شوخات آشنا شد، روسی، با زیبایی عجیب و حالتی عجیب‌تر."),
            StoryParagraph("She had slanted eyes, and a way of walking that seemed to drift rather than step.", "چشمانی مورب داشت و شیوه‌ای از راه رفتن که به نظر می‌رسید می‌خزد نه می‌رود."),
            StoryParagraph("She was beautiful, and she was mysterious, and Hans was attracted to her in a way he could not explain.", "زیبا بود و مرموز و هانس به شیوه‌ای جذبش شد که نمی‌توانست توضیح دهد."),
            StoryParagraph("She reminded him of something, of someone, from long ago, from his childhood.", "او چیزی را به او یادآوری می‌کرد، کسی را، از خیلی وقت پیش، از کودکی‌اش."),
            StoryParagraph("But he could not remember what, or whom, or why.", "اما نمی‌توانست به یاد آورد چه، یا چه کسی، یا چرا."),
            StoryParagraph("He also met a man named Ludovico Settembrini, an Italian, a humanist, a believer in reason and progress and the brotherhood of man.", "همچنین با مردی به نام لودوویکو ستمبرینی آشنا شد، ایتالیایی، اومانیست، باورنده به عقل و پیشرفت و برادری انسان."),
            StoryParagraph("Settembrini talked constantly, and always about ideas, and always with passion.", "ستمبرینی مدام صحبت می‌کرد و همیشه درباره ایده‌ها و همیشه با شور."),
            StoryParagraph("He believed that the world could be improved, that men could be made better, that reason would triumph over ignorance.", "او معتقد بود جهان می‌تواند بهتر شود، مردان می‌توانند بهتر شوند، عقل بر جهل چیره خواهد شد."),
            StoryParagraph("Hans had never met anyone like him, and he was fascinated, and he was also confused.", "هانس هرگز کسی مثل او ندیده بود و مجذوب بود و همچنین گیج."),
            StoryParagraph("Then there was Mynheer Peeperkorn, a Dutchman, a man of enormous appetites and enormous silences.", "بعد ماینهر پیپرکورن بود، هلندی، مردی با اشتهاهای عظیم و سکوت‌های عظیم."),
            StoryParagraph("He did not talk about ideas; he talked about life, about feeling, about the body and its pleasures.", "او درباره ایده‌ها صحبت نمی‌کرد؛ درباره زندگی صحبت می‌کرد، درباره احساس، درباره بدن و لذت‌هایش."),
            StoryParagraph("He was a kind of pagan, a kind of god, a kind of force of nature.", "او نوعی بت‌پرست بود، نوعی خدا، نوعی نیروی طبیعت."),
            StoryParagraph("He and Settembrini hated each other, of course; they represented two opposite ways of being in the world.", "او و ستمبرینی، البته، از هم متنفر بودند؛ آن‌ها دو شیوه متضاد بودن در جهان را نمایندگی می‌کردند."),
            StoryParagraph("Hans was caught between them, drawn to both, unable to choose.", "هانس میانشان گرفتار بود، به هر دو کشیده می‌شد، ناتوان از انتخاب."),
            StoryParagraph("There was also a man named Leo Naphta, a Jew, a Jesuit, a revolutionary, a man of contradictions.", "مردی به نام لئو نافتا هم بود، یهودی، یسوعی، انقلابی، مردی از تناقض‌ها."),
            StoryParagraph("Naphta believed in terror, in violence, in the necessity of bloodshed for a better world.", "نافتا به ترور باور داشت، به خشونت، به ضرورت خونریزی برای جهانی بهتر."),
            StoryParagraph("He was the most brilliant man Hans had ever met, and also the most terrifying.", "او درخشان‌ترین مردی بود که هانس هرگز دیده بود و همچنین هولناک‌ترین."),
            StoryParagraph("Naphta and Settembrini argued constantly, and Hans listened, and Hans learned, and Hans was confused.", "نافتا و ستمبرینی مدام بحث می‌کردند و هانس گوش می‌داد و هانس می‌آموخت و هانس گیج می‌شد."),
            StoryParagraph("'You must choose,' Settembrini said. 'You must decide what you believe.'", "ستمبرینی می‌گفت: «باید انتخاب کنی. باید تصمیم بگیری به چه باور داری.»"),
            StoryParagraph("'I am trying,' Hans said. 'But it is not easy.'", "هانس می‌گفت: «تلاش می‌کنم. اما آسان نیست.»"),
            StoryParagraph("'It is never easy,' Settembrini said. 'But it is necessary.'", "ستمبرینی می‌گفت: «هرگز آسان نیست. اما ضروری است.»"),
            StoryParagraph("Hans nodded, and he continued to listen, and he continued to learn.", "هانس سر تکان می‌داد و به گوش دادن ادامه می‌داد و به آموختن ادامه می‌داد."),
            StoryParagraph("The days passed, and the weeks, and the months.", "روزها گذشتند و هفته‌ها و ماه‌ها."),
            StoryParagraph("Hans had come for three weeks; but he was still there after three months, and after six months, and after a year.", "هانس برای سه هفته آمده بود؛ اما بعد از سه ماه هنوز آنجا بود و بعد از شش ماه و بعد از یک سال."),
            StoryParagraph("He had caught a cold, and then he had a fever, and then the doctors discovered something in his lungs.", "سرما خورده بود و بعد تب داشت و بعد دکترها چیزی در ریه‌هایش کشف کردند."),
            StoryParagraph("He was now a patient, not a visitor; he was now one of them.", "او حالا بیمار بود، نه بازدیدکننده؛ حالا یکی از آنان بود."),
            StoryParagraph("And so his three-week visit became a stay of seven years.", "و اینگونه بازدید سه‌هفته‌ایش به اقامتی هفت‌ساله تبدیل شد."),
            StoryParagraph("Seven years on the magic mountain, seven years in a world apart, seven years in which time itself seemed to lose its meaning.", "هفت سال روی کوه جادو، هفت سال در جهانی جدا، هفت سال که در آن خودِ زمان به نظر می‌رسید معنایش را از دست می‌دهد."),
            StoryParagraph("And Hans Castorp, who had come as a young man, would leave — if he left at all — as a very different person.", "و هانس کاستورپ که به‌عنوان جوانی آمده بود، ترک می‌کرد — اگر اصلاً ترک می‌کرد — به‌عنوان شخصی کاملاً متفاوت.")
        )
    )

    // ─────────── فصل ۳: ستمبرینی و نافتا ───────────
    private fun chapter3() = StoryChapter(
        number = 3, title = "Settembrini and Naphta", titlePersian = "ستمبرینی و نافتا",
        paragraphs = listOf(
            StoryParagraph("Ludovico Settembrini was a man of letters, a scholar, a humanist in the great tradition of the Italian Renaissance.", "لودوویکو ستمبرینی مردی اهل ادب بود، دانشمندی، اومانیستی در سنت بزرگ رنسانس ایتالیایی."),
            StoryParagraph("He believed in reason, in progress, in the perfectibility of mankind.", "او به عقل باور داشت، به پیشرفت، به کمال‌پذیری بشر."),
            StoryParagraph("He believed that men could be educated, could be improved, could be made free.", "او معتقد بود مردان می‌توانند آموزش ببینند، می‌توانند بهتر شوند، می‌توانند آزاد شوند."),
            StoryParagraph("He believed in the dignity of the individual, in the rights of man, in the brotherhood of all peoples.", "او به کرامت فرد باور داشت، به حقوق انسان، به برادری همه مردم."),
            StoryParagraph("Leo Naphta was his opposite in almost every way.", "لئو نافتا در تقریباً هر چیزی نقطه مقابلش بود."),
            StoryParagraph("He was a Jew who had become a Jesuit, a revolutionary who believed in absolute authority.", "او یهودی‌ای بود که یسوعی شده بود، انقلابی‌ای که به اقتدار مطلق باور داشت."),
            StoryParagraph("He believed that the world was fallen, that man was sinful, that only through terror and discipline could anything good be achieved.", "او معتقد بود جهان سقوط کرده، انسان گناهکار است، تنها از طریق ترور و نظم می‌توان چیز خوبی به دست آورد."),
            StoryParagraph("He believed in God, but in a terrible God, a God of judgment and wrath.", "او به خدا باور داشت، اما به خدایی هولناک، خدایی از داوری و خشم."),
            StoryParagraph("He believed in the Middle Ages, in the unity of faith, in the submission of the individual to the whole.", "او به قرون وسطی باور داشت، به وحدت ایمان، به تسلیم فرد در برابر کل."),
            StoryParagraph("These two men, Settembrini and Naphta, argued constantly, and their arguments were the intellectual heart of the novel.", "این دو مرد، ستمبرینی و نافتا، مدام بحث می‌کردند و بحث‌هایشان قلب فکری رمان بود."),
            StoryParagraph("They argued about freedom, about progress, about religion, about politics.", "درباره آزادی بحث می‌کردند، درباره پیشرفت، درباره دین، درباره سیاست."),
            StoryParagraph("They argued about life and death, about body and soul, about time and eternity.", "درباره زندگی و مرگ بحث می‌کردند، درباره بدن و روح، درباره زمان و ابدیت."),
            StoryParagraph("And Hans Castorp, the young engineer, sat between them, listening, learning, trying to understand.", "و هانس کاستورپ، مهندس جوان، میانشان می‌نشست، گوش می‌داد، می‌آموخت، تلاش می‌کرد بفهمد."),
            StoryParagraph("'The individual is everything,' Settembrini said. 'The individual must be free, must be educated, must be allowed to grow.'", "ستمبرینی می‌گفت: «فرد همه چیز است. فرد باید آزاد باشد، باید آموزش ببیند، باید اجازه رشد داشته باشد.»"),
            StoryParagraph("'The individual is nothing,' Naphta said. 'The individual must submit, must be disciplined, must be sacrificed to the whole.'", "نافتا می‌گفت: «فرد هیچ است. فرد باید تسلیم شود، باید منظم شود، باید برای کل قربانی شود.»"),
            StoryParagraph("'That is the language of tyranny,' Settembrini said.", "ستمبرینی می‌گفت: «این زبان استبداد است.»"),
            StoryParagraph("'And yours is the language of chaos,' Naphta replied.", "نافتا پاسخ می‌داد: «و مال تو زبان آشوب است.»"),
            StoryParagraph("'You would destroy civilization,' Settembrini said.", "ستمبرینی می‌گفت: «تو تمدن را نابود می‌کنی.»"),
            StoryParagraph("'And you would destroy the soul,' Naphta replied.", "نافتا پاسخ می‌داد: «و تو روح را نابود می‌کنی.»"),
            StoryParagraph("And so they went on, hour after hour, day after day, and Hans listened, and Hans was torn between them.", "و اینگونه ادامه می‌دادند، ساعت پس از ساعت، روز پس از روز و هانس گوش می‌داد و هانس میانشان پاره می‌شد."),
            StoryParagraph("He admired Settembrini, for his clarity, for his kindness, for his faith in humanity.", "ستمبرینی را تحسین می‌کرد، برای شفافیتش، برای مهربانی‌اش، برای ایمانش به بشریت."),
            StoryParagraph("But he was also drawn to Naphta, to his darkness, to his depth, to his refusal of easy answers.", "اما به سمت نافتا هم کشیده می‌شد، به تاریکی‌اش، به عمقش، به امتناعش از پاسخ‌های آسان."),
            StoryParagraph("'Which of them is right?' Hans asked himself, again and again.", "هانس بارها و بارها از خودش می‌پرسید: «کدام‌شان حق دارد؟»"),
            StoryParagraph("But there was no answer; or rather, there were too many answers, and none of them was complete.", "اما پاسخی نبود؛ یا بهتر، پاسخ‌های بسیاری بود و هیچ‌کدام کامل نبود."),
            StoryParagraph("Settembrini was right about freedom, but he did not understand the darkness in the human heart.", "ستمبرینی درباره آزادی حق داشت، اما تاریکی قلب انسان را نمی‌فهمید."),
            StoryParagraph("Naphta was right about the darkness, but he did not understand the light.", "نافتا درباره تاریکی حق داشت، اما نور را نمی‌فهمید."),
            StoryParagraph("And Hans, who was neither a philosopher nor a saint, found himself caught between them, unable to choose.", "و هانس، که نه فیلسوف بود و نه قدیس، خود را میانشان گرفتار یافت، ناتوان از انتخاب."),
            StoryParagraph("'You are too passive,' Settembrini told him. 'You must take a stand. You must decide what you believe.'", "ستمبرینی به او می‌گفت: «تو بیش از حد منفعلی. باید بایستی. باید تصمیم بگیری به چه باور داری.»"),
            StoryParagraph("'I am trying,' Hans said. 'But the more I learn, the less I know.'", "هانس می‌گفت: «تلاش می‌کنم. اما هر چه بیشتر می‌آموزم، کمتر می‌دانم.»"),
            StoryParagraph("'That is the beginning of wisdom,' Naphta said, with a thin smile.", "نافتا با لبخندی نازک می‌گفت: «این آغاز خرد است.»"),
            StoryParagraph("'Or the end of courage,' Settembrini replied.", "ستمبرینی پاسخ می‌داد: «یا پایان شهامت.»"),
            StoryParagraph("And so the years passed at the Berghof, and the arguments continued, and Hans Castorp, the young man who had come for three weeks, grew older and stranger and deeper.", "و اینگونه سال‌ها در برگهوف گذشتند و بحث‌ها ادامه یافتند و هانس کاستورپ، جوانی که برای سه هفته آمده بود، پیرتر شد و عجیب‌تر و عمیق‌تر."),
            StoryParagraph("He read books, and he thought, and he talked with Clavdia Chauchat, and he watched the mountains.", "کتاب خواند و فکر کرد و با کلاودیا شوخات صحبت کرد و کوه‌ها را تماشا کرد."),
            StoryParagraph("He did not become a philosopher, or a saint, or a revolutionary.", "فیلسوف نشد، نه قدیس، نه انقلابی."),
            StoryParagraph("He became, instead, something more difficult and more valuable: a human being, slowly learning to be human.", "در عوض، چیزی دشوارتر و ارزشمندتر شد: انسانی، آهسته یاد می‌گرفت انسان باشد."),
            StoryParagraph("And what he learned, in the end, was not a doctrine, not a system, not an answer.", "و آنچه در پایان آموخت، نه عقیده‌ای بود، نه نظامی، نه پاسخی."),
            StoryParagraph("It was something simpler, something harder, something that could not be put into words: the ability to live with uncertainty, and to be kind in the face of it.", "چیزی ساده‌تر بود، چیزی دشوارتر، چیزی که نمی‌شد در کلمات ریخت: توانایی زندگی کردن با عدم قطعیت و مهربان بودن در برابرش.")
        )
    )

    // ─────────── فصل ۴: عشق و بیماری ───────────
    private fun chapter4() = StoryChapter(
        number = 4, title = "Love and Illness", titlePersian = "عشق و بیماری",
        paragraphs = listOf(
            StoryParagraph("Clavdia Chauchat was a Russian woman of about thirty, with wide cheekbones and narrow eyes and a way of moving that was both lazy and graceful.", "کلاودیا شوخات زنی روسی حدوداً سی ساله بود، با استخوان‌های گونه پهن و چشمان باریک و شیوه‌ای از حرکت که هم تنبل بود و هم با ظرافت."),
            StoryParagraph("She had been at the Berghof for years, and she would be there for years more; she was one of the permanent residents, one of those who had given up on the world below.", "سال‌ها در برگهوف بود و سال‌های بیشتری هم می‌ماند؛ او یکی از ساکنان دائمی بود، یکی از آنانی که از جهان پایین دست کشیده بودند."),
            StoryParagraph("When Hans first saw her, he felt something that he could not name; it was not quite love, not quite desire, not quite recognition.", "هانس وقتی اول دیدش، چیزی حس کرد که نمی‌توانست نامش را ببرد؛ نه دقیقاً عشق بود، نه دقیقاً میل، نه دقیقاً تشخیص."),
            StoryParagraph("But it was something powerful, something that would grow, something that would shape the rest of his life.", "اما چیزی قدرتمند بود، چیزی که رشد می‌کرد، چیزی که باقی زندگی‌اش را شکل می‌داد."),
            StoryParagraph("She reminded him of a boy he had known as a child, a boy named Pribislav Hippe, for whom he had felt a strange and troubling affection.", "او پسری را به او یادآوری می‌کرد که در کودکی شناخته بود، پسری به نام پریبیسلاو هیپه، که برایش محبتی عجیب و نگران‌کننده حس کرده بود."),
            StoryParagraph("Hippe had had slanted eyes, like Clavdia's; Hippe had moved in the same lazy, graceful way.", "هیپه چشمانی مورب داشت، مثل کلاودیا؛ هیپه به همان شیوه تنبل و با ظرافت حرکت می‌کرد."),
            StoryParagraph("And so Hans, seeing Clavdia, felt that he was seeing not just a woman, but a memory, a ghost, a piece of his own past.", "و اینگونه هانس، در دیدن کلاودیا، حس کرد نه تنها زنی می‌بیند، بلکه خاطره‌ای، شبحی، تکه‌ای از گذشته خودش."),
            StoryParagraph("He became obsessed with her, in a quiet, patient, almost respectful way.", "او به شیوه‌ای ساکت و صبور و تقریباً محترمانه وسواسش شد."),
            StoryParagraph("He borrowed a pencil from her, once, and he kept it for years, as a relic, as a talisman, as a piece of her.", "یک بار مدادی از او قرض گرفت و سال‌ها نگهش داشت، همچون یادگاری، همچون طلسمی، همچون تکه‌ای از او."),
            StoryParagraph("He dreamed about her, and he thought about her, and he wrote about her in his diary.", "خوابش را دید و به او فکر کرد و در دفترش درباره او نوشت."),
            StoryParagraph("But he did not speak to her, not really; he did not tell her how he felt; he did not try to win her.", "اما با او صحبت نکرد، نه واقعاً؛ به او نگفت چه احساسی دارد؛ تلاش نکرد به دستش آورد."),
            StoryParagraph("He simply loved her, in silence, in patience, in the strange and beautiful way of a man who does not know what to do with his love.", "تنها دوستش داشت، در سکوت، در صبر، به شیوه عجیب و زیبای مردی که نمی‌داند با عشقش چه کند."),
            StoryParagraph("And Clavdia, who was not foolish, understood; she saw what was happening in him; she knew what he was feeling.", "و کلاودیا، که احمق نبود، فهمید؛ دید چه در او می‌گذرد؛ می‌دانست چه حس می‌کند."),
            StoryParagraph("But she did not encourage him, and she did not discourage him; she simply waited, as she had learned to wait, on the mountain, in the sanatorium, in the strange suspended time of the sick.", "اما نه تشویقش کرد و نه دلسردش؛ تنها منتظر ماند، همانطور که یاد گرفته بود منتظر بماند، روی کوه، در آسایشگاه، در زمان عجیب معلق بیماران."),
            StoryParagraph("One evening, at a carnival, in a moment of revelry and release, Hans finally spoke to her.", "یک عصر، در کارناوالی، در لحظه‌ای از شادی و رهایی، هانس بالاخره با او صحبت کرد."),
            StoryParagraph("He told her that he loved her; he told her about Pribislav Hippe; he told her everything.", "گفت دوستش دارد؛ از پریبیسلاو هیپه گفت؛ همه چیز گفت."),
            StoryParagraph("She listened, and she smiled, and she did not laugh at him.", "گوش داد و لبخند زد و مسخره‌اش نکرد."),
            StoryParagraph("'You are a strange boy,' she said, in her Russian-accented German. 'But I like you.'", "گفت: «پسر عجیبی هستی.» به آلمانی روسی‌لهجه‌اش. «اما دوستت دارم.»"),
            StoryParagraph("And then she was gone; she left the sanatorium, as she had left before, as she would leave again.", "و بعد رفت؛ آسایشگاه را ترک کرد، همانطور که قبلاً ترک کرده بود، همانطور که دوباره ترک می‌کرد."),
            StoryParagraph("Hans was left behind, alone with his love, alone with his memory, alone with the mountain.", "هانس رها شد، تنها با عشقش، تنها با خاطره‌اش، تنها با کوه."),
            StoryParagraph("He waited for her, as she had waited for him; and waiting, on the mountain, became his life.", "منتظرش ماند، همانطور که او منتظر او مانده بود؛ و انتظار، روی کوه، زندگی‌اش شد."),
            StoryParagraph("For on the magic mountain, time was not like time in the world below; it was slower, deeper, stranger.", "زیرا روی کوه جادو، زمان مثل زمان در جهان پایین نبود؛ آهسته‌تر بود، عمیق‌تر، عجیب‌تر."),
            StoryParagraph("A month felt like a week; a year felt like a month; seven years felt like a season.", "یک ماه مثل یک هفته حس می‌شد؛ یک سال مثل یک ماه؛ هفت سال مثل یک فصل."),
            StoryParagraph("And in that strange suspended time, Hans Castorp learned something about love, about illness, about life.", "و در آن زمان عجیب معلق، هانس کاستورپ چیزی درباره عشق آموخت، درباره بیماری، درباره زندگی."),
            StoryParagraph("He learned that love and illness are not so different; both are a kind of heightened awareness, a kind of intensity, a kind of living more fully.", "آموخت عشق و بیماری چندان متفاوت نیستند؛ هر دو نوعی آگاهی افزایش‌یافته‌اند، نوعی شدت، نوعی کامل‌تر زندگی کردن."),
            StoryParagraph("He learned that waiting is not passive; it is a kind of action, a kind of faith, a kind of love.", "آموخت انتظار منفعل نیست؛ نوعی عمل است، نوعی ایمان، نوعی عشق."),
            StoryParagraph("He learned that the mountain was not just a place; it was a state of mind, a way of being, a philosophy.", "آموخت کوه تنها مکان نیست؛ حالتی ذهنی است، شیوه‌ای از بودن، فلسفه‌ای."),
            StoryParagraph("And he learned that, in the end, we are all of us on the magic mountain; we are all of us waiting, and loving, and dying, in our own strange suspended time.", "و آموخت که در پایان، همه‌مان روی کوه جادو هستیم؛ همه‌مان منتظریم و عشق می‌ورزیم و می‌میریم، در زمان عجیب معلق خودمان."),
            StoryParagraph("The difference is only this: some of us know it, and some of us do not.", "تفاوت تنها این است: برخی می‌دانیم و برخی نمی‌دانیم."),
            StoryParagraph("Hans Castorp, on the magic mountain, came to know it.", "هانس کاستورپ، روی کوه جادو، شروع کرد به دانستنش."),
            StoryParagraph("And that knowledge, painful and beautiful as it was, was the greatest gift he ever received.", "و آن دانش، هر چقدر هم دردناک و زیبا، بزرگ‌ترین هدیه‌ای بود که هرگز دریافت کرد.")
        )
    )

    // ─────────── فصل ۵: برف و مکاشفه ───────────
    private fun chapter5() = StoryChapter(
        number = 5, title = "Snow and Revelation", titlePersian = "برف و مکاشفه",
        paragraphs = listOf(
            StoryParagraph("One winter day, Hans Castorp went skiing alone on the mountain.", "یک روز زمستانی، هانس کاستورپ تنها برای اسکی به کوه رفت."),
            StoryParagraph("He had been at the Berghof for years now; he knew the mountain, its paths, its dangers, its silences.", "سال‌ها بود در برگهوف بود؛ کوه را می‌شناخت، راه‌هایش، خطرهایش، سکوت‌هایش."),
            StoryParagraph("But on this day, something was different; on this day, he felt drawn to go further, to go higher, to go into the unknown.", "اما این روز، چیزی متفاوت بود؛ این روز، حس کرد به جلوتر رفتن کشیده می‌شود، به بالاتر، به ناشناخته."),
            StoryParagraph("He skied up the slope, past the last trees, into the high alpine wilderness.", "از دامنه بالا رفت، از آخرین درختان گذشت، به بیابان آلپی بلند."),
            StoryParagraph("The snow was deep, and the sky was grey, and the wind was cold.", "برف عمیق بود و آسمان خاکستری و باد سرد."),
            StoryParagraph("And then the storm came, sudden and terrible, and Hans was lost in the whiteness.", "و بعد طوفان آمد، ناگهانی و هولناک و هانس در سفیدی گم شد."),
            StoryParagraph("He could not see, could not hear, could not tell which way was up or down.", "نمی‌توانست ببیند، نمی‌توانست بشنود، نمی‌توانست بگوید کدام طرف بالا و پایین است."),
            StoryParagraph("He was alone, in the storm, on the mountain; he was going to die.", "تنها بود، در طوفان، روی کوه؛ می‌مرد."),
            StoryParagraph("But he did not panic; he did not despair; he simply kept moving, slowly, carefully, one step at a time.", "اما وحشت نکرد؛ ناامید نشد؛ تنها به حرکت ادامه داد، آهسته، با احتیاط، یک قدم در یک زمان."),
            StoryParagraph("And then, suddenly, he saw something ahead: a small hut, half-buried in the snow.", "و بعد، ناگهان، چیزی جلوتر دید: کلبه‌ای کوچک، نیمه‌دفن در برف."),
            StoryParagraph("He reached the hut, and he pushed open the door, and he stumbled inside.", "به کلبه رسید و در را باز کرد و داخل افتاد."),
            StoryParagraph("The hut was empty, but it was shelter; it was safety; it was life.", "کلبه خالی بود اما سرپناه بود؛ امنیت بود؛ زندگی بود."),
            StoryParagraph("Hans lay on the floor, and he breathed, and he waited for the storm to pass.", "هانس روی زمین دراز کشید و نفس کشید و منتظر ماند تا طوفان بگذرد."),
            StoryParagraph("And while he waited, he dreamed; or perhaps he did not dream, but saw.", "و در حالی که منتظر می‌ماند، خواب دید؛ یا شاید خواب نمی‌دید، بلکه می‌دید."),
            StoryParagraph("He saw a beautiful landscape, a Mediterranean landscape, with blue sea and green hills and happy people.", "منظره‌ای زیبا دید، منظره‌ای مدیترانه‌ای، با دریای آبی و تپه‌های سبز و مردمان شاد."),
            StoryParagraph("He saw children playing, young people dancing, old people smiling.", "بچه‌هایی دید که بازی می‌کنند، جوانانی که می‌رقصند، پیرانی که لبخند می‌زنند."),
            StoryParagraph("He saw a world of peace and joy, a world without illness, without suffering, without death.", "جهانی از صلح و شادی دید، جهانی بدون بیماری، بدون رنج، بدون مرگ."),
            StoryParagraph("And then, in the midst of this beautiful vision, he saw something else: two witches, or two goddesses, tearing a child apart.", "و بعد، در میان این رؤیای زیبا، چیز دیگری دید: دو جادوگر، یا دو الهه، که بچه‌ای را از هم می‌درند."),
            StoryParagraph("They were fighting over the child, and the child was screaming, and no one was helping.", "بر سر بچه می‌جنگیدند و بچه فریاد می‌زد و هیچ‌کس کمک نمی‌کرد."),
            StoryParagraph("And Hans understood, in that moment, something that he had never understood before.", "و هانس در آن لحظه چیزی فهمید که هرگز قبلاً نفهمیده بود."),
            StoryParagraph("He understood that the world contains both the beautiful and the terrible, both the joyful and the cruel, both the light and the dark.", "فهمید جهان هم زیبا را در خود دارد و هم هولناک، هم شاد و هم بی‌رحم، هم نور و هم تاریکی."),
            StoryParagraph("He understood that we cannot choose one without the other; we cannot have the light without the dark.", "فهمید نمی‌توانیم یکی را بدون دیگری برگزینیم؛ نمی‌توانیم نور را بدون تاریکی داشته باشیم."),
            StoryParagraph("And he understood that wisdom is not about choosing one over the other; it is about holding both, accepting both, living with both.", "و فهمید خرد درباره برگزیدن یکی بر دیگری نیست؛ درباره نگه داشتن هر دو است، پذیرش هر دو، زندگی با هر دو."),
            StoryParagraph("Then he dreamed, or saw, something else: a young man, beautiful and serious, walking toward him through the snow.", "بعد خواب دید، یا دید، چیز دیگری: جوانی، زیبا و جدی، در برف به سمتش راه می‌رفت."),
            StoryParagraph("The young man had the face of Clavdia Chauchat, and the face of Pribislav Hippe, and the face of someone else, someone he could not name.", "جوان چهره کلاودیا شوخات را داشت و چهره پریبیسلاو هیپه و چهره شخص دیگری، کسی که نمی‌توانست نامش را ببرد."),
            StoryParagraph("The young man smiled at Hans, and he said something that Hans could not quite hear.", "جوان به هانس لبخند زد و چیزی گفت که هانس کاملاً نمی‌شنید."),
            StoryParagraph("But the meaning was clear: it was a message of love, of hope, of courage.", "اما معنا واضح بود: پیامی از عشق، از امید، از شجاعت."),
            StoryParagraph("And Hans woke, or came to himself, and the storm had passed, and the sky was clear, and the sun was shining on the snow.", "و هانس بیدار شد، یا به خودش آمد و طوفان گذشته بود و آسمان صاف و خورشید روی برف می‌تابید."),
            StoryParagraph("He stood up, and he walked out of the hut, and he looked at the mountains, and he felt a strange peace.", "بلند شد و از کلبه بیرون رفت و به کوه‌ها نگاه کرد و آرامشی عجیب حس کرد."),
            StoryParagraph("He had been lost, and he had been found; he had been dying, and he had been reborn.", "گم شده بود و یافته شده بود؛ می‌مرد و دوباره زاده شده بود."),
            StoryParagraph("And he knew, with a certainty that he could not explain, that he had learned something important, something essential, something that he would carry with him forever.", "و می‌دانست، با یقینی که نمی‌توانست توضیح دهد، چیزی مهم آموخته بود، چیزی اساسی، چیزی که برای همیشه با خود حمل می‌کرد."),
            StoryParagraph("'For the sake of goodness and love,' he said to himself, 'man shall not allow death to rule over his thoughts.'", "به خودش گفت: «به خاطر خوبی و عشق، انسان نباید بگذارد مرگ بر افکارش حکومت کند.»"),
            StoryParagraph("It was not a grand philosophy, not a complete system, not an answer to all questions.", "فلسفه‌ای بزرگ نبود، نظامی کامل نبود، پاسخی به همه پرسش‌ها نبود."),
            StoryParagraph("But it was enough; it was more than enough; it was everything.", "اما کافی بود؛ بیش از کافی بود؛ همه چیز بود."),
            StoryParagraph("Hans Castorp skied back to the Berghof, and he did not tell anyone what had happened.", "هانس کاستورپ به برگهوف بازگشت و به کسی نگفت چه اتفاقی افتاده."),
            StoryParagraph("But something in him had changed; something in him had awakened; something in him had been born.", "اما چیزی در او تغییر کرده بود؛ چیزی در او بیدار شده بود؛ چیزی در او زاده شده بود."),
            StoryParagraph("And that something, unknown and unnameable, would be the truest thing he ever found on the magic mountain.", "و آن چیز، ناشناخته و نام‌ناپذیر، راستین‌ترین چیزی بود که هرگز روی کوه جادو می‌یافت.")
        )
    )

    // ─────────── فصل ۶: معنا ───────────
    private fun chapter6() = StoryChapter(
        number = 6, title = "The Meaning", titlePersian = "معنا",
        paragraphs = listOf(
            StoryParagraph("The Magic Mountain, published in 1924, is one of the greatest novels of the twentieth century, and one of the most complex.", "کوه جادو، منتشرشده در ۱۹۲۴، یکی از بزرگ‌ترین رمان‌های قرن بیستم و یکی از پیچیده‌ترین است."),
            StoryParagraph("It tells the story of Hans Castorp, a young German engineer who visits his cousin at a Swiss sanatorium and ends up staying for seven years.", "داستان هانس کاستورپ را تعریف می‌کند، مهندس جوان آلمانی که به دیدن پسرعمویش در آسایشگاهی سوئیسی می‌رود و در نهایت هفت سال می‌ماند."),
            StoryParagraph("But it is not really about the sanatorium, or the mountain, or the illness; it is about Europe on the eve of the First World War.", "اما واقعاً درباره آسایشگاه نیست، یا کوه، یا بیماری؛ درباره اروپا در آستانه جنگ جهانی اول است."),
            StoryParagraph("The Berghof is a symbol of Europe before the catastrophe: a world of leisure, of culture, of philosophy, of decay.", "برگهوف نمادی از اروپای پیش از فاجعه است: جهانی از فراغت، از فرهنگ، از فلسفه، از پوسیدگی."),
            StoryParagraph("The patients are the Europeans, the members of a civilization that had lost its way, that was waiting, without knowing it, for the end.", "بیماران اروپاییانند، اعضای تمدنی که راهش را گم کرده بود، منتظر بود، بدون دانستن، برای پایان."),
            StoryParagraph("Settembrini and Naphta are two sides of the European soul: the humanist and the authoritarian, the Enlightenment and the Counter-Reformation.", "ستمبرینی و نافتا دو روی روح اروپایی‌اند: اومانیست و اقتدارگرا، روشنگری و ضداصلاح."),
            StoryParagraph("Clavdia Chauchat is the East, or the feminine, or desire: something that Hans desires but cannot possess, something that draws him but cannot save him.", "کلاودیا شوخات شرق است، یا زنانه، یا میل: چیزی که هانس می‌خواهد اما نمی‌تواند داشته باشد، چیزی که جذبش می‌کند اما نمی‌تواند نجاتش دهد."),
            StoryParagraph("And Hans himself is the ordinary European, the man in the middle, the man who does not know what to believe, the man who is caught between competing ideologies.", "و خود هانس اروپایی معمولی است، مرد میانی، مردی که نمی‌داند به چه باور دارد، مردی که میان ایدئولوژی‌های رقیب گرفتار است."),
            StoryParagraph("The novel is, in this sense, a philosophical novel, a novel of ideas, a novel about the great questions of Western civilization.", "رمان از این نظر رمانی فلسفی است، رمانی از ایده‌ها، رمانی درباره پرسش‌های بزرگ تمدن غربی."),
            StoryParagraph("But it is also, and perhaps more importantly, a novel about time, and about the way time passes—or does not pass—on the magic mountain.", "اما همچنین، و شاید مهم‌تر، رمانی درباره زمان است و درباره شیوه‌ای که زمان می‌گذرد—یا نمی‌گذرد—روی کوه جادو."),
            StoryParagraph("On the mountain, time is different: slower, stranger, more subjective.", "روی کوه، زمان متفاوت است: آهسته‌تر، عجیب‌تر، ذهنی‌تر."),
            StoryParagraph("A day can feel like a week; a year can feel like a month; seven years can feel like a single moment.", "یک روز می‌تواند مثل یک هفته حس شود؛ یک سال مثل یک ماه؛ هفت سال مثل یک لحظه واحد."),
            StoryParagraph("Mann explores this phenomenon with great care, showing us how time expands and contracts, how it is shaped by our attention, our habits, our hopes.", "مان این پدیده را با دقت بسیار بررسی می‌کند و نشانمان می‌دهد چگونه زمان گسترده و فشرده می‌شود، چگونه با توجه ما شکل می‌گیرد، با عادت‌هایمان، با امیدهایمان."),
            StoryParagraph("And in the process, he asks a deeper question: what is time, really? Is it a fact of nature, or a creation of the mind?", "و در این فرآیند، پرسشی عمیق‌تر می‌پرسد: زمان واقعاً چیست؟ واقعیتی از طبیعت است، یا آفریده‌ای ذهنی؟"),
            StoryParagraph("Is it a river that flows, or a circle that repeats, or something else entirely?", "رودی است که جاری است، یا دایره‌ای که تکرار می‌شود، یا چیز کاملاً دیگری است؟"),
            StoryParagraph("Mann does not answer these questions; he simply poses them, and lets us think.", "مان به این پرسش‌ها پاسخ نمی‌دهد؛ تنها مطرحشان می‌کند و می‌گذارد فکر کنیم."),
            StoryParagraph("The novel's central theme is what Mann called 'the snow chapter'—the vision Hans has when he is lost in the storm.", "مضمون محوری رمان همان چیزی است که مان «فصل برف» نامید—رؤیایی که هانس وقتی در طوفان گم شده دارد."),
            StoryParagraph("In that vision, Hans sees the beauty of life and the horror of life, together, inseparable.", "در آن رؤیا، هانس زیبایی زندگی را می‌بیند و هولناکی زندگی را، با هم، جدانشدنی."),
            StoryParagraph("And he understands that wisdom is not about choosing between them; it is about accepting both, living with both, and choosing, nonetheless, to be kind.", "و می‌فهمد خرد درباره انتخاب میان آن‌ها نیست؛ درباره پذیرش هر دو است، زندگی با هر دو و با این حال، انتخاب مهربان بودن."),
            StoryParagraph("'For the sake of goodness and love,' he says, 'man shall not allow death to rule over his thoughts.'", "می‌گوید: «به خاطر خوبی و عشق، انسان نباید بگذارد مرگ بر افکارش حکومت کند.»"),
            StoryParagraph("This is Mann's humanism: not a naive optimism, not a blind faith in progress, but a clear-eyed recognition that, in a world full of death and suffering, we must still choose life.", "این اومانیسم مان است: نه خوش‌بینی ساده‌لوحانه، نه ایمان کور به پیشرفت، بلکه تشخیص روشن‌بینانه که در جهانی پر از مرگ و رنج، باید هنوز زندگی را برگزینیم."),
            StoryParagraph("The novel ends with the outbreak of the First World War, and with Hans going off to fight, and with his fate uncertain.", "رمان با آغاز جنگ جهانی اول پایان می‌یابد و با رفتن هانس به جنگ و با سرنوشت نامعلومش."),
            StoryParagraph("The last lines ask whether Hans will survive, whether anything he learned on the mountain will matter, whether love can rise above death.", "خطوط آخر می‌پرسد آیا هانس زنده می‌ماند، آیا چیزی که روی کوه آموخت اهمیت خواهد داشت، آیا عشق می‌تواند بر مرگ برخیزد."),
            StoryParagraph("Mann does not answer; but the question itself is an answer, because the fact that we can ask it, that we can hope, that we can love, is already a kind of victory.", "مان پاسخ نمی‌دهد؛ اما خودِ پرسش پاسخی است، زیرا اینکه می‌توانیم بپرسیم، که می‌توانیم امید داشته باشیم، که می‌توانیم عشق بورزیم، از قبل نوعی پیروزی است."),
            StoryParagraph("The Magic Mountain is not an easy novel; it is dense, and slow, and demanding.", "کوه جادو رمان آسانی نیست؛ متراکم است و آهسته و طلبکار."),
            StoryParagraph("But it is a great novel, a wise novel, a novel that rewards patience and attention with something rare: understanding.", "اما رمانی بزرگ است، رمانی فرزانه، رمانی که صبر و توجه را با چیزی نادر پاداش می‌دهد: فهم."),
            StoryParagraph("It is a novel about a young man who goes to visit a sick cousin and ends up understanding what it means to be human.", "رمانی است درباره جوانی که به دیدن پسرعموی بیمارش می‌رود و در نهایت می‌فهمد انسان بودن یعنی چه."),
            StoryParagraph("It is a novel about Europe on the eve of catastrophe, and about the ideologies that led to that catastrophe.", "رمانی است درباره اروپا در آستانه فاجعه و درباره ایدئولوژی‌هایی که به آن فاجعه انجامیدند."),
            StoryParagraph("It is a novel about time, and illness, and love, and death, and about the strange ways in which all of these are connected.", "رمانی است درباره زمان و بیماری و عشق و مرگ و درباره شیوه‌های عجیبی که همه‌شان به هم وصلند."),
            StoryParagraph("And it is a novel about the magic mountain itself: the place where we are all of us, in our own way, waiting for something, waiting for someone, waiting for meaning.", "و رمانی است درباره خود کوه جادو: جایی که همه‌مان هستیم، به شیوه خودمان، منتظر چیزی، منتظر کسی، منتظر معنا."),
            StoryParagraph("Hans Castorp waited seven years on his mountain; he learned much, suffered much, loved much.", "هانس کاستورپ هفت سال روی کوهش منتظر ماند؛ بسیار آموخت، بسیار رنج کشید، بسیار عشق ورزید."),
            StoryParagraph("And in the end, he learned something that all of us must learn, if we are to live fully, if we are to love truly, if we are to die peacefully.", "و در پایان، چیزی آموخت که همه‌مان باید بیاموزیم، اگر می‌خواهیم کامل زندگی کنیم، اگر می‌خواهیم راستین عشق بورزیم، اگر می‌خواهیم صلح‌جویانه بمیریم."),
            StoryParagraph("He learned that life is precious, even when it is painful; that love is real, even when it is impossible; that hope is worth having, even when it is uncertain.", "آموخت زندگی گرانبهاست، حتی وقتی دردناک است؛ عشق واقعی است، حتی وقتی ناممکن است؛ امید ارزش داشتن دارد، حتی وقتی نامعلوم است."),
            StoryParagraph("He learned that we are all of us on the magic mountain, and that the only way to live is to keep climbing, keep waiting, keep loving, until the very end.", "آموخت همه‌مان روی کوه جادو هستیم و تنها راه زندگی این است که به بالا رفتن ادامه دهیم، به انتظار، به عشق ورزیدن، تا همان پایان."),
            StoryParagraph("The end.", "پایان."),
            StoryParagraph("And the beginning.", "و آغاز."),
            StoryParagraph("For every reader of The Magic Mountain begins, in a sense, their own stay on the mountain, their own seven years of learning and waiting and loving.", "زیرا هر خواننده کوه جادو، به نوعی، اقامت خودش را روی کوه آغاز می‌کند، هفت سال خودش از آموختن و انتظار و عشق ورزیدن."),
            StoryParagraph("And like Hans Castorp, they will emerge changed.", "و همچون هانس کاستورپ، تغییر یافته بیرون می‌آیند.")
        )
    )
}