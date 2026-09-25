package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۶ پیشرفته — شاهکارهای قرن بیستم
 *  ۱۶. محاکمه
 *  ۱۷. به سوی فانوس دریایی
 *  ۱۸. دلبند
 */
object Group6 {

    fun getAll(): List<StoryContent> = listOf(
        story16(),
        story17(),
        story18(),
    )

    // ─────────────── ۱۶: محاکمه ───────────────
    private fun story16() = StoryContent(
        storyId = "adv_the_trial",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Arrest", titlePersian = "دستگیری",
                paragraphs = listOf(
                    StoryParagraph("Josef K. was a respected bank official.", "یوزف ک. کارمند محترم بانکی بود."),
                    StoryParagraph("He lived in a boarding house in the city.", "او در پانسیونی در شهر زندگی می‌کرد."),
                    StoryParagraph("One morning, two men came to his room.", "یک صبح، دو مرد به اتاقش آمدند."),
                    StoryParagraph("They said he was under arrest.", "آن‌ها گفتند او دستگیر است."),
                    StoryParagraph("But they did not tell him why.", "اما نگفتند چرا."),
                    StoryParagraph("They did not take him to prison.", "آن‌ها او را به زندان نبردند."),
                    StoryParagraph("He was free to go to work.", "او آزاد بود سر کار برود."),
                    StoryParagraph("But he had to appear for questioning.", "اما باید برای بازجویی حاضر می‌شد."),
                    StoryParagraph("Josef K. was confused and angry.", "یوزف ک. گیج و عصبانی بود."),
                    StoryParagraph("He had done nothing wrong.", "او هیچ کار اشتباهی نکرده بود."),
                    StoryParagraph("He asked what crime he was accused of.", "پرسید به چه جرمی متهم است."),
                    StoryParagraph("No one could tell him.", "هیچ‌کس نمی‌توانست بگوید."),
                    StoryParagraph("His landlady's cook watched him with curiosity.", "آشپز صاحب‌خانه با کنجکاوی تماشایش می‌کرد."),
                    StoryParagraph("A supervisor told him to wait.", "سرپرستی به او گفت صبر کند."),
                    StoryParagraph("Josef K. went to work as usual.", "یوزف ک. مثل همیشه به سر کار رفت."),
                    StoryParagraph("At the bank, everything seemed normal.", "در بانک، همه چیز عادی به نظر می‌رسید."),
                    StoryParagraph("But he felt watched by everyone.", "اما احساس می‌کرد همه تماشایش می‌کنند."),
                    StoryParagraph("That evening, he received a phone call.", "آن عصر، تماس تلفنی گرفت."),
                    StoryParagraph("He was told to appear on Sunday.", "به او گفته شد یکشنبه حاضر شود."),
                    StoryParagraph("He did not know where to go.", "نمی‌دانست کجا برود.")
                )
            ),
            StoryChapter(
                number = 2, title = "The First Hearing", titlePersian = "اولین بازجویی",
                paragraphs = listOf(
                    StoryParagraph("On Sunday, Josef K. went to the address.", "یکشنبه، یوزف ک. به آن آدرس رفت."),
                    StoryParagraph("It was a poor neighborhood.", "محله‌ای فقیر بود."),
                    StoryParagraph("The building was old and crowded.", "ساختمان قدیمی و شلوغ بود."),
                    StoryParagraph("He found a room full of people.", "اتاقی پر از مردم پیدا کرد."),
                    StoryParagraph("They were all waiting for something.", "همه منتظر چیزی بودند."),
                    StoryParagraph("A man asked him why he had come late.", "مردی پرسید چرا دیر آمده."),
                    StoryParagraph("Josef K. said he was not late.", "یوزف ک. گفت دیر نکرده."),
                    StoryParagraph("The examiner began to question him.", "بازپرس شروع کرد به بازجویی."),
                    StoryParagraph("He asked about his name, job, and life.", "درباره اسم، شغل و زندگی‌اش پرسید."),
                    StoryParagraph("Josef K. answered with confidence.", "یوزف ک. با اطمینان جواب داد."),
                    StoryParagraph("He said there must be a mistake.", "او گفت باید اشتباهی باشد."),
                    StoryParagraph("The crowd began to laugh.", "جمعیت شروع کرد به خندیدن."),
                    StoryParagraph("Josef K. felt humiliated.", "یوزف ک. تحقیر شد."),
                    StoryParagraph("He spoke against the court itself.", "او علیه خود دادگاه صحبت کرد."),
                    StoryParagraph("He said the court was corrupt.", "او گفت دادگاه فاسد است."),
                    StoryParagraph("The examiner said nothing.", "بازپرس چیزی نگفت."),
                    StoryParagraph("A woman in the crowd looked at Josef K. with pity.", "زنی در جمعیت با ترحم به یوزف ک. نگاه کرد."),
                    StoryParagraph("He was told to leave the room.", "به او گفته شد اتاق را ترک کند."),
                    StoryParagraph("Outside, he felt he had failed.", "بیرون، احساس کرد شکست خورده."),
                    StoryParagraph("But he did not know why.", "اما نمی‌دانست چرا.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Lawyer and the Painter", titlePersian = "وکیل و نقاش",
                paragraphs = listOf(
                    StoryParagraph("Josef K.'s uncle came to see him.", "عموی یوزف ک. به دیدنش آمد."),
                    StoryParagraph("He was worried about the trial.", "او نگران محاکمه بود."),
                    StoryParagraph("He took Josef to a famous lawyer named Huld.", "او یوزف را به وکیلی معروف به نام هولد برد."),
                    StoryParagraph("Huld was sick and stayed in bed.", "هولد مریض بود و در رختخواب می‌ماند."),
                    StoryParagraph("He knew the court very well.", "او دادگاه را خیلی خوب می‌شناخت."),
                    StoryParagraph("But he was slow and weak.", "اما کند و ضعیف بود."),
                    StoryParagraph("Josef K. was not satisfied with him.", "یوزف ک. از او راضی نبود."),
                    StoryParagraph("He decided to look for other help.", "او تصمیم گرفت دنبال کمک دیگری بگردد."),
                    StoryParagraph("A friend told him about a painter named Titorelli.", "دوستی درباره نقاشی به نام تیتورلی به او گفت."),
                    StoryParagraph("Titorelli painted portraits of the judges.", "تیتورلی پرتره قاضی‌ها را نقاشی می‌کرد."),
                    StoryParagraph("He knew secrets about the court.", "او رازهای دادگاه را می‌دانست."),
                    StoryParagraph("Josef K. visited him in a poor attic.", "یوزف ک. در زیرشیروانی فقیرانه‌ای به دیدنش رفت."),
                    StoryParagraph("Titorelli showed him three ways out.", "تیتورلی سه راه خروج به او نشان داد."),
                    StoryParagraph("First: a real acquittal, but it almost never happened.", "اول: تبرئه واقعی، اما تقریباً هرگز اتفاق نمی‌افتاد."),
                    StoryParagraph("Second: a false acquittal, but the trial never ended.", "دوم: تبرئه ساختگی، اما محاکمه هرگز تمام نمی‌شد."),
                    StoryParagraph("Third: indefinite postponement.", "سوم: تعویق نامحدود."),
                    StoryParagraph("None of these offered true freedom.", "هیچ‌کدام آزادی واقعی نمی‌داد."),
                    StoryParagraph("Josef K. felt more and more hopeless.", "یوزف ک. ناامیدتر و ناامیدتر شد."),
                    StoryParagraph("The trial had become his whole life.", "محاکمه تمام زندگی‌اش شده بود."),
                    StoryParagraph("And he still did not know his crime.", "و هنوز جرمش را نمی‌دانست.")
                )
            ),
            StoryChapter(
                number = 4, title = "In the Cathedral", titlePersian = "در کلیسا",
                paragraphs = listOf(
                    StoryParagraph("Josef K. was asked to show a visitor the cathedral.", "از یوزف ک. خواسته شد به بازدیدکننده‌ای کلیسا را نشان دهد."),
                    StoryParagraph("The visitor did not come.", "بازدیدکننده نیامد."),
                    StoryParagraph("Josef K. was left alone in the empty church.", "یوزف ک. در کلیسای خالی تنها ماند."),
                    StoryParagraph("The light was dim and the air was cold.", "نور کم و هوا سرد بود."),
                    StoryParagraph("Suddenly, a priest called his name.", "ناگهان، کشیشی اسمش را صدا زد."),
                    StoryParagraph("Josef K. was surprised and afraid.", "یوزف ک. تعجب کرد و ترسید."),
                    StoryParagraph("The priest said he was the prison chaplain.", "کشیش گفت او کشیش زندان است."),
                    StoryParagraph("He said he had been told about Josef K.'s case.", "او گفت درباره پرونده یوزف ک. به او گفته شده."),
                    StoryParagraph("Josef K. asked if he was guilty.", "یوزف ک. پرسید آیا گناهکار است."),
                    StoryParagraph("The priest said the court never says that.", "کشیش گفت دادگاه هرگز این را نمی‌گوید."),
                    StoryParagraph("The court only says you are accused.", "دادگاه فقط می‌گوید تو متهمی."),
                    StoryParagraph("Then the priest told him a story.", "بعد کشیش داستانی برایش تعریف کرد."),
                    StoryParagraph("It was called 'Before the Law'.", "نامش 'پیش از قانون' بود."),
                    StoryParagraph("A man from the country came to a gate.", "مردی از دهات به دری رسید."),
                    StoryParagraph("A gatekeeper stood before it.", "دربانی پیش آن ایستاده بود."),
                    StoryParagraph("The man asked to enter the law.", "مرد خواست وارد قانون شود."),
                    StoryParagraph("The gatekeeper said: not now.", "دربان گفت: نه حالا."),
                    StoryParagraph("The man waited his whole life.", "مرد تمام زندگی‌اش منتظر ماند."),
                    StoryParagraph("At the end, the gatekeeper said: this door was only for you.", "در آخر، دربان گفت: این در فقط برای تو بود."),
                    StoryParagraph("Josef K. did not understand the story.", "یوزف ک. داستان را نفهمید.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Execution", titlePersian = "پایان",
                paragraphs = listOf(
                    StoryParagraph("On the evening of his thirty-first birthday, two men came.", "عصر سی و یکمین سالگرد تولدش، دو مرد آمدند."),
                    StoryParagraph("They took Josef K. by the arms.", "آن‌ها بازوهای یوزف ک. را گرفتند."),
                    StoryParagraph("He did not resist.", "او مقاومت نکرد."),
                    StoryParagraph("He felt he had to go with them.", "احساس کرد باید با آن‌ها برود."),
                    StoryParagraph("They walked through the dark streets.", "آن‌ها در خیابان‌های تاریک راه رفتند."),
                    StoryParagraph("People watched but said nothing.", "مردم تماشا کردند اما چیزی نگفتند."),
                    StoryParagraph("They came to a small stone quarry outside the city.", "آن‌ها به معدن سنگی کوچکی بیرون شهر رسیدند."),
                    StoryParagraph("One of the men took out a knife.", "یکی از مردان چاقویی بیرون آورد."),
                    StoryParagraph("The other held Josef K. by the throat.", "دیگری گلوی یوزف ک. را گرفت."),
                    StoryParagraph("Josef K. thought about his life.", "یوزف ک. به زندگی‌اش فکر کرد."),
                    StoryParagraph("He had never learned why he was accused.", "هرگز نفهمیده بود چرا متهم شده."),
                    StoryParagraph("He had never seen a judge or a verdict.", "هرگز قاضی یا حکمی ندیده بود."),
                    StoryParagraph("He had lived his whole life as an accused man.", "تمام زندگی‌اش را به عنوان متهم زندگی کرده بود."),
                    StoryParagraph("He wondered where the judge was.", "فکر کرد قاضی کجاست."),
                    StoryParagraph("He wondered where the high court was.", "فکر کرد دادگاه عالی کجاست."),
                    StoryParagraph("But no one answered.", "اما هیچ‌کس جواب نداد."),
                    StoryParagraph("The knife went into his heart.", "چاقو به قلبش فرو رفت."),
                    StoryParagraph("And so Josef K. died.", "و اینگونه یوزف ک. مرد."),
                    StoryParagraph("Like a dog, he said.", "مثل یک سگ، گفت."),
                    StoryParagraph("The shame of it would live on.", "شرمش ادامه می‌یافت.")
                )
            )
        )
    )

    // ─────────────── ۱۷: به سوی فانوس دریایی ───────────────
    private fun story17() = StoryContent(
        storyId = "adv_to_the_lighthouse",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Window", titlePersian = "پنجره",
                paragraphs = listOf(
                    StoryParagraph("The Ramsay family was at their summer house.", "خانواده رامزی در خانه تابستانی‌شان بودند."),
                    StoryParagraph("The house was on an island in Scotland.", "خانه در جزیره‌ای در اسکاتلند بود."),
                    StoryParagraph("Mr. Ramsay was a philosopher.", "آقای رامزی فیلسوف بود."),
                    StoryParagraph("He was brilliant but often harsh.", "او باهوش اما اغلب خشن بود."),
                    StoryParagraph("Mrs. Ramsay was beautiful and gentle.", "خانم رامزی زیبا و ملایم بود."),
                    StoryParagraph("She brought peace and order to the family.", "او آرامش و نظم را به خانواده می‌آورد."),
                    StoryParagraph("They had eight children.", "آن‌ها هشت فرزند داشتند."),
                    StoryParagraph("Their youngest son, James, was six.", "کوچک‌ترین پسرشان، جیمز، شش ساله بود."),
                    StoryParagraph("James wanted to go to the lighthouse.", "جیمز می‌خواست به فانوس دریایی برود."),
                    StoryParagraph("The lighthouse was across the bay.", "فانوس دریایی آن‌طرف خلیج بود."),
                    StoryParagraph("It had stood there for many years.", "سال‌ها آنجا ایستاده بود."),
                    StoryParagraph("Tomorrow, they would finally go.", "فردا، بالاخره می‌رفتند."),
                    StoryParagraph("But his father said the weather would be bad.", "اما پدرش گفت هوا بد می‌شود."),
                    StoryParagraph("James hated his father for this.", "جیمز از پدرش به همین دلیل متنفر شد."),
                    StoryParagraph("A guest named Lily Briscoe was staying with them.", "مهمانی به نام لیلی بریسکو با آن‌ها بود."),
                    StoryParagraph("Lily was a young painter.", "لیلی نقاش جوانی بود."),
                    StoryParagraph("She was painting a picture of Mrs. Ramsay.", "او تصویری از خانم رامزی می‌کشید."),
                    StoryParagraph("She struggled with the painting.", "با نقاشی دست و پنجه نرم می‌کرد."),
                    StoryParagraph("Mr. Ramsay said women could not paint.", "آقای رامزی گفت زنان نمی‌توانند نقاشی کنند."),
                    StoryParagraph("Lily continued anyway.", "لیلی به هر حال ادامه داد.")
                )
            ),
            StoryChapter(
                number = 2, title = "Time Passes", titlePersian = "گذر زمان",
                paragraphs = listOf(
                    StoryParagraph("That night, the storm was terrible.", "آن شب، طوفان وحشتناک بود."),
                    StoryParagraph("The house shook in the wind.", "خانه در باد می‌لرزید."),
                    StoryParagraph("Everyone went to bed early.", "همه زود به رختخواب رفتند."),
                    StoryParagraph("Mrs. Ramsay sat by the window for a while.", "خانم رامزی مدتی کنار پنجره نشست."),
                    StoryParagraph("She thought about her children.", "او به فرزندانش فکر کرد."),
                    StoryParagraph("She thought about life and death.", "به زندگی و مرگ فکر کرد."),
                    StoryParagraph("Then she went to sleep.", "بعد به خواب رفت."),
                    StoryParagraph("Many years passed.", "سال‌ها گذشت."),
                    StoryParagraph("The world changed forever.", "دنیا برای همیشه تغییر کرد."),
                    StoryParagraph("A great war came to Europe.", "جنگ بزرگی به اروپا آمد."),
                    StoryParagraph("Many young men went and never returned.", "مردان جوان زیادی رفتند و هرگز برنگشتند."),
                    StoryParagraph("The Ramsay family was deeply changed.", "خانواده رامزی عمیقاً تغییر کرد."),
                    StoryParagraph("Mrs. Ramsay died one night.", "خانم رامزی یک شب مرد."),
                    StoryParagraph("Her death was told in a short sentence.", "مرگش در جمله‌ای کوتاه گفته شد."),
                    StoryParagraph("Her son Andrew died in the war.", "پسرش اندرو در جنگ مرد."),
                    StoryParagraph("Her daughter Prue died in childbirth.", "دخترش پرو در زایمان مرد."),
                    StoryParagraph("The house was empty for many years.", "خانه سال‌ها خالی ماند."),
                    StoryParagraph("Dust and darkness filled the rooms.", "گرد و تاریکی اتاق‌ها را پر کرد."),
                    StoryParagraph("Only the wind and the sea remained.", "فقط باد و دریا باقی ماندند."),
                    StoryParagraph("The lighthouse still stood across the bay.", "فانوس دریایی هنوز آن‌طرف خلیج ایستاده بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Return", titlePersian = "بازگشت",
                paragraphs = listOf(
                    StoryParagraph("After the war, some of the family returned.", "بعد از جنگ، برخی از خانواده برگشتند."),
                    StoryParagraph("Mr. Ramsay was old and tired.", "آقای رامزی پیر و خسته بود."),
                    StoryParagraph("Lily Briscoe came back to the house.", "لیلی بریسکو به خانه برگشت."),
                    StoryParagraph("She had never finished her painting.", "او هرگز نقاشی‌اش را تمام نکرده بود."),
                    StoryParagraph("Her unfinished painting haunted her.", "نقاشی ناتمامش تسخیرش می‌کرد."),
                    StoryParagraph("Mr. Ramsay wanted to go to the lighthouse.", "آقای رامزی می‌خواست به فانوس دریایی برود."),
                    StoryParagraph("His son James was now sixteen.", "پسرش جیمز حالا شانزده ساله بود."),
                    StoryParagraph("His daughter Cam was also with them.", "دخترش کم هم با آن‌ها بود."),
                    StoryParagraph("They prepared the boat for the journey.", "آن‌ها قایق را برای سفر آماده کردند."),
                    StoryParagraph("James had never forgotten his anger.", "جیمز هرگز خشمش را فراموش نکرده بود."),
                    StoryParagraph("He still hated his father.", "او هنوز از پدرش متنفر بود."),
                    StoryParagraph("His father praised him as they sailed.", "پدرش وقتی قایقرانی می‌کردند تحسینش کرد."),
                    StoryParagraph("James wanted to hear the praise.", "جیمز می‌خواست تحسین را بشنود."),
                    StoryParagraph("But he did not want to want it.", "اما نمی‌خواست آن را بخواهد."),
                    StoryParagraph("He struggled with his feelings.", "او با احساساتش دست و پنجه نرم می‌کرد."),
                    StoryParagraph("Cam watched her father and brother.", "کم پدر و برادرش را تماشا کرد."),
                    StoryParagraph("She felt the pain between them.", "او درد بین آن‌ها را حس کرد."),
                    StoryParagraph("The journey was long and silent.", "سفر طولانی و ساکت بود."),
                    StoryParagraph("Everyone had their own thoughts.", "هر کس افکار خودش را داشت."),
                    StoryParagraph("The lighthouse came closer.", "فانوس دریایی نزدیک‌تر شد.")
                )
            ),
            StoryChapter(
                number = 4, title = "Lily's Vision", titlePersian = "رؤیای لیلی",
                paragraphs = listOf(
                    StoryParagraph("While the others sailed, Lily stayed at the house.", "وقتی دیگران قایق‌رانی می‌کردند، لیلی در خانه ماند."),
                    StoryParagraph("She stood in front of her canvas.", "او جلوی بومش ایستاد."),
                    StoryParagraph("She remembered Mrs. Ramsay's face.", "چهره خانم رامزی را به یاد آورد."),
                    StoryParagraph("She remembered the way she walked.", "راه رفتنش را به یاد آورد."),
                    StoryParagraph("She remembered her kindness.", "مهربانی‌اش را به یاد آورد."),
                    StoryParagraph("Mrs. Ramsay had always brought people together.", "خانم رامزی همیشه مردم را دور هم جمع می‌کرد."),
                    StoryParagraph("She had made the world beautiful.", "او دنیا را زیبا کرده بود."),
                    StoryParagraph("But she was gone now.", "اما حالا رفته بود."),
                    StoryParagraph("Lily felt the emptiness she left.", "لیلی پوچی‌ای که ترک کرده بود را حس کرد."),
                    StoryParagraph("She picked up her brush again.", "دوباره قلم‌مویش را برداشت."),
                    StoryParagraph("She began to paint with new energy.", "او با انرژی جدید شروع به نقاشی کرد."),
                    StoryParagraph("Something had changed inside her.", "چیزی درونش تغییر کرده بود."),
                    StoryParagraph("She no longer tried to capture Mrs. Ramsay exactly.", "او دیگر تلاش نمی‌کرد دقیقاً خانم رامزی را ثبت کند."),
                    StoryParagraph("She tried to capture the feeling of her.", "تلاش کرد حس او را ثبت کند."),
                    StoryParagraph("She painted the shadow, the light, the color.", "سایه، نور، رنگ را کشید."),
                    StoryParagraph("She painted the shape of love.", "شکل عشق را کشید."),
                    StoryParagraph("She painted the passage of time.", "گذر زمان را کشید."),
                    StoryParagraph("When she finished, she felt peace.", "وقتی تمام کرد، آرامش حس کرد."),
                    StoryParagraph("She had finally seen her vision.", "او بالاخره رؤیایش را دیده بود."),
                    StoryParagraph("It was enough.", "کافی بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The Lighthouse", titlePersian = "فانوس دریایی",
                paragraphs = listOf(
                    StoryParagraph("The boat reached the lighthouse.", "قایق به فانوس دریایی رسید."),
                    StoryParagraph("Mr. Ramsay jumped onto the rock.", "آقای رامزی روی صخره پرید."),
                    StoryParagraph("He was full of energy.", "او پر از انرژی بود."),
                    StoryParagraph("James watched him with mixed feelings.", "جیمز با احساسات متناقض تماشایش کرد."),
                    StoryParagraph("His father was old now.", "پدرش حالا پیر بود."),
                    StoryParagraph("But he still had that fire in him.", "اما هنوز آن آتش درونش بود."),
                    StoryParagraph("The lighthouse keeper welcomed them.", "نگهبان فانوس دریایی از آن‌ها استقبال کرد."),
                    StoryParagraph("He gave them small gifts.", "او هدیه‌های کوچکی به آن‌ها داد."),
                    StoryParagraph("Cam felt this moment was important.", "کم حس کرد این لحظه مهم است."),
                    StoryParagraph("She looked at her father and brother.", "او به پدر و برادرش نگاه کرد."),
                    StoryParagraph("The anger between them had softened.", "خشم بین آن‌ها نرم شده بود."),
                    StoryParagraph("James finally felt some peace.", "جیمز بالاخره کمی آرامش حس کرد."),
                    StoryParagraph("The journey had changed him.", "سفر تغییرش داده بود."),
                    StoryParagraph("He no longer needed his father's approval.", "او دیگر به تأیید پدرش نیاز نداشت."),
                    StoryParagraph("But he accepted it anyway.", "اما به هر حال پذیرفتش."),
                    StoryParagraph("They returned to the shore in silence.", "آن‌ها در سکوت به ساحل برگشتند."),
                    StoryParagraph("Lily was waiting for them.", "لیلی منتظرشان بود."),
                    StoryParagraph("She showed them her painting.", "او نقاشی‌اش را به آن‌ها نشان داد."),
                    StoryParagraph("It was finally finished.", "بالاخره تمام شده بود."),
                    StoryParagraph("And so life went on, without Mrs. Ramsay.", "و اینگونه زندگی بدون خانم رامزی ادامه یافت.")
                )
            )
        )
    )

    // ─────────────── ۱۸: دلبند ───────────────
    private fun story18() = StoryContent(
        storyId = "adv_beloved",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "124 Bluestone Road", titlePersian = "خانه شماره ۱۲۴",
                paragraphs = listOf(
                    StoryParagraph("The house at 124 Bluestone Road was haunted.", "خانه شماره ۱۲۴ خیابان بلوستون تسخیرشده بود."),
                    StoryParagraph("Everyone in Cincinnati knew this.", "همه در سینسیناتی این را می‌دانستند."),
                    StoryParagraph("The ghost was angry and sad.", "روح عصبانی و غمگین بود."),
                    StoryParagraph("It threw things and made loud noises.", "چیزها را پرت می‌کرد و صداهای بلند درمی‌آورد."),
                    StoryParagraph("The house belonged to Sethe.", "خانه به سِتی تعلق داشت."),
                    StoryParagraph("Sethe was a Black woman, about forty.", "ستی زن سیاه‌پوستی حدوداً چهل ساله بود."),
                    StoryParagraph("She had lived there for many years.", "سال‌ها آنجا زندگی کرده بود."),
                    StoryParagraph("Her daughter Denver lived with her.", "دخترش دنور با او زندگی می‌کرد."),
                    StoryParagraph("Denver was eighteen.", "دنور هجده ساله بود."),
                    StoryParagraph("She was lonely and afraid.", "او تنها و ترسیده بود."),
                    StoryParagraph("Her brothers had run away years ago.", "برادرانش سال‌ها پیش فرار کرده بودند."),
                    StoryParagraph("They could not bear the ghost.", "آن‌ها نمی‌توانستند روح را تحمل کنند."),
                    StoryParagraph("Sethe's mother-in-law, Baby Suggs, had died.", "مادرشوهر ستی، بیبی ساگز، مرده بود."),
                    StoryParagraph("She had been a holy woman.", "او زن مقدسی بوده است."),
                    StoryParagraph("She had loved everyone freely.", "او همه را آزادانه دوست داشت."),
                    StoryParagraph("The house had felt her loss deeply.", "خانه فقدانش را عمیقاً حس کرده بود."),
                    StoryParagraph("Sethe worked hard to keep going.", "ستی سخت کار می‌کرد تا ادامه دهد."),
                    StoryParagraph("She did not speak of her past.", "او از گذشته‌اش صحبت نمی‌کرد."),
                    StoryParagraph("But her past lived in that house.", "اما گذشته‌اش در آن خانه زندگی می‌کرد."),
                    StoryParagraph("And it would not let her go.", "و رهایش نمی‌کرد.")
                )
            ),
            StoryChapter(
                number = 2, title = "Paul D Arrives", titlePersian = "ورود پاول دی",
                paragraphs = listOf(
                    StoryParagraph("One day, a man came to the house.", "یک روز، مردی به خانه آمد."),
                    StoryParagraph("His name was Paul D.", "اسمش پاول دی بود."),
                    StoryParagraph("He had known Sethe long ago.", "او خیلی وقت پیش ستی را می‌شناخت."),
                    StoryParagraph("They had been slaves on the same farm.", "آن‌ها در همان مزرعه برده بودند."),
                    StoryParagraph("The farm was called Sweet Home.", "اسم مزرعه خانه شیرین بود."),
                    StoryParagraph("It had not been sweet at all.", "اصلاً شیرین نبود."),
                    StoryParagraph("Paul D was kind and strong.", "پاول دی مهربان و قوی بود."),
                    StoryParagraph("He had been wandering for years.", "او سال‌ها سرگردان بود."),
                    StoryParagraph("He wanted a place to rest.", "او جایی برای استراحت می‌خواست."),
                    StoryParagraph("Sethe welcomed him into the house.", "ستی او را به خانه خوش‌آمد گفت."),
                    StoryParagraph("The ghost did not like him.", "روح دوستش نداشت."),
                    StoryParagraph("It tried to drive him away.", "تلاش کرد فراری‌اش دهد."),
                    StoryParagraph("Paul D shouted at the ghost.", "پاول دی سر روح فریاد زد."),
                    StoryParagraph("He told it to leave the house.", "او به آن گفت خانه را ترک کند."),
                    StoryParagraph("The house became quiet.", "خانه ساکت شد."),
                    StoryParagraph("The ghost seemed to be gone.", "به نظر می‌رسید روح رفته."),
                    StoryParagraph("Denver was not happy about this.", "دنور از این خوشحال نبود."),
                    StoryParagraph("She missed the ghost.", "او دلتنگ روح بود."),
                    StoryParagraph("It was the only company she had known.", "تنها همدمی بود که می‌شناخت."),
                    StoryParagraph("Paul D and Sethe became close.", "پاول دی و ستی نزدیک شدند.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Girl in the Water", titlePersian = "دختری از آب",
                paragraphs = listOf(
                    StoryParagraph("One evening, a young woman appeared.", "یک عصر، زن جوانی ظاهر شد."),
                    StoryParagraph("She was sitting on a tree stump.", "روی کنده درختی نشسته بود."),
                    StoryParagraph("Her skin was smooth and new.", "پوستش صاف و تازه بود."),
                    StoryParagraph("Her hair was long and black.", "موهایش بلند و سیاه بود."),
                    StoryParagraph("She said her name was Beloved.", "او گفت اسمش دلبند است."),
                    StoryParagraph("She was about twenty years old.", "او حدوداً بیست ساله بود."),
                    StoryParagraph("She could barely speak.", "او به سختی می‌توانست صحبت کند."),
                    StoryParagraph("She drank water like a baby.", "او مثل بچه آب می‌نوشید."),
                    StoryParagraph("Sethe took her in like a daughter.", "ستی او را مثل دخترش پذیرفت."),
                    StoryParagraph("Denver was happy to have a friend.", "دنور از داشتن دوست خوشحال شد."),
                    StoryParagraph("But Paul D was suspicious.", "اما پاول دی مشکوک بود."),
                    StoryParagraph("There was something strange about Beloved.", "چیز عجیبی درباره دلبند بود."),
                    StoryParagraph("She knew things she should not know.", "او چیزهایی می‌دانست که نباید."),
                    StoryParagraph("She sang a song Sethe used to sing.", "او آهنگی می‌خواند که ستی قبلاً می‌خواند."),
                    StoryParagraph("It was a song only Sethe knew.", "آهنگی بود که فقط ستی می‌دانست."),
                    StoryParagraph("Sethe began to remember the past.", "ستی شروع کرد به یاد آوردن گذشته."),
                    StoryParagraph("She remembered her baby daughter.", "دختر بچه‌اش را به یاد آورد."),
                    StoryParagraph("The baby who had died.", "بچه‌ای که مرده بود."),
                    StoryParagraph("The baby whose tombstone said: Beloved.", "بچه‌ای که سنگ قبرش نوشته بود: دلبند."),
                    StoryParagraph("Sethe began to believe the impossible.", "ستی شروع کرد به باور کردن ناممکن.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Truth of Sethe", titlePersian = "حقیقت ستی",
                paragraphs = listOf(
                    StoryParagraph("Sethe told Paul D about her escape.", "ستی به پاول دی درباره فرارش گفت."),
                    StoryParagraph("She had run away from Sweet Home.", "او از خانه شیرین فرار کرده بود."),
                    StoryParagraph("She was pregnant and alone.", "او باردار و تنها بود."),
                    StoryParagraph("She walked for many days.", "روزهای زیادی راه رفت."),
                    StoryParagraph("A white girl named Amy helped her.", "دختر سفیدپوستی به نام امی کمکش کرد."),
                    StoryParagraph("Sethe reached Cincinnati.", "ستی به سینسیناتی رسید."),
                    StoryParagraph("She found her mother-in-law Baby Suggs.", "مادرشوهرش بیبی ساگز را پیدا کرد."),
                    StoryParagraph("She had her baby in a boat.", "بچه‌اش را در قایقی به دنیا آورد."),
                    StoryParagraph("She was free for twenty-eight days.", "او بیست و هشت روز آزاد بود."),
                    StoryParagraph("Then the slave catchers came.", "بعد شکارچیان برده آمدند."),
                    StoryParagraph("Sethe saw them coming from the yard.", "ستی آن‌ها را از حیاط دید که می‌آیند."),
                    StoryParagraph("She made a terrible decision.", "او تصمیم وحشتناکی گرفت."),
                    StoryParagraph("She took her children to the shed.", "او بچه‌هایش را به انبار برد."),
                    StoryParagraph("She tried to kill them all.", "تلاش کرد همه‌شان را بکشد."),
                    StoryParagraph("She killed her two-year-old daughter.", "او دختر دو ساله‌اش را کشت."),
                    StoryParagraph("She did not want them to be slaves.", "نمی‌خواست برده شوند."),
                    StoryParagraph("She was arrested and taken to prison.", "او دستگیر و به زندان برده شد."),
                    StoryParagraph("The dead baby was buried as Beloved.", "بچه مرده به عنوان دلبند دفن شد."),
                    StoryParagraph("And her ghost came back to the house.", "و روحش به خانه برگشت."),
                    StoryParagraph("Paul D was shocked and horrified.", "پاول دی شوکه و وحشت‌زده شد.")
                )
            ),
            StoryChapter(
                number = 5, title = "Exorcism", titlePersian = "آزادسازی",
                paragraphs = listOf(
                    StoryParagraph("Beloved grew stronger every day.", "دلبند هر روز قوی‌تر می‌شد."),
                    StoryParagraph("She demanded all of Sethe's love.", "او تمام عشق ستی را می‌خواست."),
                    StoryParagraph("She drained the life out of her.", "زندگی را از او می‌کشید."),
                    StoryParagraph("Sethe became weak and thin.", "ستی ضعیف و لاغر شد."),
                    StoryParagraph("She stopped eating.", "او از خوردن دست کشید."),
                    StoryParagraph("She thought only of Beloved.", "او فقط به دلبند فکر می‌کرد."),
                    StoryParagraph("She said Beloved was her best thing.", "او گفت دلبند بهترین چیز اوست."),
                    StoryParagraph("Beloved was pregnant and growing huge.", "دلبند باردار و به شکل عظیمی رشد می‌کرد."),
                    StoryParagraph("Denver realized she had to act.", "دنور فهمید باید کاری کند."),
                    StoryParagraph("She went out into the community for help.", "او برای کمک به جامعه بیرون رفت."),
                    StoryParagraph("The women of the neighborhood came.", "زنان محله آمدند."),
                    StoryParagraph("They came to free Sethe from Beloved.", "آن‌ها آمدند تا ستی را از دلبند آزاد کنند."),
                    StoryParagraph("Thirty women stood in front of the house.", "سی زن جلوی خانه ایستادند."),
                    StoryParagraph("They began to sing.", "آن‌ها شروع کردند به آواز خواندن."),
                    StoryParagraph("The singing grew louder and louder.", "آواز بلندتر و بلندتر شد."),
                    StoryParagraph("Beloved screamed and disappeared.", "دلبند جیغ زد و ناپدید شد."),
                    StoryParagraph("She was gone forever.", "او برای همیشه رفت."),
                    StoryParagraph("Sethe was free at last.", "ستی بالاخره آزاد شد."),
                    StoryParagraph("But she was also empty.", "اما پوچ هم بود."),
                    StoryParagraph("The past had finally let her go.", "گذشته بالاخره رهایش کرد.")
                )
            )
        )
    )
}