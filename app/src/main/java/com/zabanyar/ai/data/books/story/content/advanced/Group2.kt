package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۲ پیشرفته — ادبیات مدرن و فلسفی
 *  ۴. صد سال تنهایی
 *  ۵. خانم دالووی
 *  ۶. سیدارتا
 */
object Group2 {

    fun getAll(): List<StoryContent> = listOf(
        story4(),
        story5(),
        story6(),
    )

    // ─────────────── ۴: صد سال تنهایی ───────────────
    private fun story4() = StoryContent(
        storyId = "adv_hundred_years",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Founding of Macondo", titlePersian = "بنیان‌گذاری ماکوندو",
                paragraphs = listOf(
                    StoryParagraph("Colonel Aureliano Buendía remembered his childhood.", "سرهنگ اورلیانو بوئندیا کودکی‌اش را به یاد آورد."),
                    StoryParagraph("He remembered the day his father took him to see ice.", "او روزی را به یاد آورد که پدرش او را برای دیدن یخ برد."),
                    StoryParagraph("That was when Macondo was still a young village.", "آن زمان ماکوندو هنوز دهکده‌ای جوان بود."),
                    StoryParagraph("His father, José Arcadio Buendía, had founded it.", "پدرش، خوزه آرکادیو بوئندیا، آن را بنیان گذاشته بود."),
                    StoryParagraph("He had left his old home with a group of families.", "او خانه قدیمی‌اش را با گروهی از خانواده‌ها ترک کرده بود."),
                    StoryParagraph("They walked for many months through the jungle.", "آن‌ها ماه‌ها از میان جنگل راه رفتند."),
                    StoryParagraph("Finally, they stopped by a river.", "بالاخره، کنار رودخانه‌ای ایستادند."),
                    StoryParagraph("José Arcadio dreamed of a city of mirrors.", "خوزه آرکادیو شهر آینه‌ها را خواب دید."),
                    StoryParagraph("He decided to build the town there.", "او تصمیم گرفت شهر را آنجا بسازد."),
                    StoryParagraph("They named it Macondo.", "آن را ماکوندو نامیدند."),
                    StoryParagraph("It was a peaceful and isolated place.", "جایی آرام و منزوی بود."),
                    StoryParagraph("Nobody had died there yet.", "هنوز هیچ‌کس آنجا نمرده بود."),
                    StoryParagraph("Every year, a group of gypsies came to visit.", "هر سال، گروهی از کولی‌ها به دیدنشان می‌آمدند."),
                    StoryParagraph("They brought new inventions and wonders.", "آن‌ها اختراعات و شگفتی‌های جدید می‌آوردند."),
                    StoryParagraph("A man named Melquíades became José's friend.", "مردی به نام مِلکیادس دوست خوزه شد."),
                    StoryParagraph("He brought magnets, telescopes, and ice.", "او آهن‌ربا، تلسکوپ و یخ آورد."),
                    StoryParagraph("José Arcadio was obsessed with science.", "خوزه آرکادیو به علم معتاد شد."),
                    StoryParagraph("He spent his days studying the stars.", "او روزها را به مطالعه ستارگان می‌گذراند."),
                    StoryParagraph("His wife Úrsula raised the family alone.", "همسرش اورسولا خانواده را تنهایی بزرگ کرد."),
                    StoryParagraph("Their children were the first of many generations.", "فرزندانشان اولین نسل از نسل‌های زیادی بودند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The War Years", titlePersian = "سال‌های جنگ",
                paragraphs = listOf(
                    StoryParagraph("Colonel Aureliano Buendía went to war.", "سرهنگ اورلیانو بوئندیا به جنگ رفت."),
                    StoryParagraph("He fought against the conservative government.", "او علیه دولت محافظه‌کار جنگید."),
                    StoryParagraph("He led thirty-two armed uprisings.", "او سی و دو قیام مسلحانه رهبری کرد."),
                    StoryParagraph("He had seventeen sons from seventeen women.", "او هفده پسر از هفده زن داشت."),
                    StoryParagraph("All of them were killed in one night.", "همه‌شان یک شب کشته شدند."),
                    StoryParagraph("He survived many attempts on his life.", "او از تلاش‌های زیادی برای کشتنش جان سالم برد."),
                    StoryParagraph("He became a legendary figure.", "او چهره‌ای افسانه‌ای شد."),
                    StoryParagraph("But he also became cold and lonely.", "اما او سرد و تنها هم شد."),
                    StoryParagraph("He no longer knew why he was fighting.", "او دیگر نمی‌دانست برای چه می‌جنگد."),
                    StoryParagraph("One day, he signed a peace treaty.", "یک روز، پیمان صلحی امضا کرد."),
                    StoryParagraph("He retired to his workshop.", "او به کارگاهش بازنشسته شد."),
                    StoryParagraph("He made little gold fishes all day.", "او تمام روز ماهی‌های طلایی کوچک می‌ساخت."),
                    StoryParagraph("He made them, then melted them down.", "آن‌ها را می‌ساخت، بعد ذوبشان می‌کرد."),
                    StoryParagraph("He did this over and over again.", "او این کار را بارها و بارها انجام می‌داد."),
                    StoryParagraph("Meanwhile, Macondo was growing.", "در همین حال، ماکوندو رشد می‌کرد."),
                    StoryParagraph("A railway arrived, then a banana company.", "راه‌آهنی رسید، بعد شرکتی موز."),
                    StoryParagraph("Foreign workers came from all over the world.", "کارگران خارجی از همه‌جا آمدند."),
                    StoryParagraph("The town became rich but also corrupt.", "شهر ثروتمند اما فاسد شد."),
                    StoryParagraph("The people lost their innocence.", "مردم بی‌گناهی‌شان را از دست دادند."),
                    StoryParagraph("Nobody noticed what was happening.", "هیچ‌کس متوجه نشد چه اتفاقی می‌افتد.")
                )
            ),
            StoryChapter(
                number = 3, title = "The Banana Massacre", titlePersian = "کشتار موز",
                paragraphs = listOf(
                    StoryParagraph("The workers of the banana company went on strike.", "کارگران شرکت موز اعتصاب کردند."),
                    StoryParagraph("They wanted better pay and conditions.", "آن‌ها دستمزد و شرایط بهتر می‌خواستند."),
                    StoryParagraph("The company refused to negotiate.", "شرکت از مذاکره امتناع کرد."),
                    StoryParagraph("The government sent the army to stop them.", "دولت ارتش را برای متوقف کردنشان فرستاد."),
                    StoryParagraph("One day, three thousand workers gathered in the square.", "یک روز، سه هزار کارگر در میدان جمع شدند."),
                    StoryParagraph("The army surrounded them with machine guns.", "ارتش آن‌ها را با مسلسل محاصره کرد."),
                    StoryParagraph("They opened fire on the crowd.", "آن‌ها به سمت جمعیت آتش گشودند."),
                    StoryParagraph("Thousands of people were killed.", "هزاران نفر کشته شدند."),
                    StoryParagraph("The bodies were loaded onto a train.", "جسدها روی قطاری بار زده شدند."),
                    StoryParagraph("They were thrown into the sea.", "آن‌ها را در دریا انداختند."),
                    StoryParagraph("The government denied everything.", "دولت همه چیز را انکار کرد."),
                    StoryParagraph("They said nothing had happened.", "آن‌ها گفتند هیچ اتفاقی نیفتاده."),
                    StoryParagraph("Only one man remembered the truth.", "فقط یک مرد حقیقت را به یاد داشت."),
                    StoryParagraph("It was José Arcadio Segundo.", "خوزه آرکادیو سگوندو بود."),
                    StoryParagraph("Everyone thought he was crazy.", "همه فکر کردند دیوانه است."),
                    StoryParagraph("He tried to tell everyone the truth.", "او تلاش کرد حقیقت را به همه بگوید."),
                    StoryParagraph("But no one wanted to listen.", "اما هیچ‌کس نمی‌خواست گوش کند."),
                    StoryParagraph("The town forgot the massacre.", "شهر کشتار را فراموش کرد."),
                    StoryParagraph("History was rewritten.", "تاریخ بازنویسی شد."),
                    StoryParagraph("And Macondo continued to decline.", "و ماکوندو به افول ادامه داد.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Family Curse", titlePersian = "نفرین خانوادگی",
                paragraphs = listOf(
                    StoryParagraph("Úrsula lived for over a hundred years.", "اورسولا بیش از صد سال زندگی کرد."),
                    StoryParagraph("She had seen her whole family grow and fall.", "او تمام خانواده‌اش را دیده بود که رشد و سقوط کردند."),
                    StoryParagraph("She had seen many strange things.", "او چیزهای عجیب زیادی دیده بود."),
                    StoryParagraph("Her family was cursed with solitude.", "خانواده‌اش به تنهایی نفرین شده بودند."),
                    StoryParagraph("Every generation repeated the same mistakes.", "هر نسل همان اشتباهات را تکرار می‌کرد."),
                    StoryParagraph("Men were named Aureliano or José Arcadio.", "مردان اورلیانو یا خوزه آرکادیو نام داشتند."),
                    StoryParagraph("Women were named Úrsula, Amaranta, or Remedios.", "زنان اورسولا، آمارانتا یا رمدیوس نام داشتند."),
                    StoryParagraph("The names repeated like a wheel.", "اسم‌ها مثل چرخ تکرار می‌شدند."),
                    StoryParagraph("Aureliano Segundo married a woman named Fernanda.", "اورلیانو سگوندو با زنی به نام فرناندا ازدواج کرد."),
                    StoryParagraph("They had children: Meme, Amaranta Úrsula, and José Arcadio.", "آن‌ها بچه‌هایی داشتند: ممه، آمارانتا اورسولا و خوزه آرکادیو."),
                    StoryParagraph("The family became more and more isolated.", "خانواده منزوی‌تر و منزوی‌تر شد."),
                    StoryParagraph("They built walls around themselves.", "آن‌ها دور خودشان دیوار کشیدند."),
                    StoryParagraph("The house became old and full of ghosts.", "خانه پیر و پر از ارواح شد."),
                    StoryParagraph("Rain fell on Macondo for four years.", "باران چهار سال روی ماکوندو بارید."),
                    StoryParagraph("It was called the rain of the banana company.", "آن را باران شرکت موز می‌نامیدند."),
                    StoryParagraph("Everything was flooded.", "همه چیز سیلابی شد."),
                    StoryParagraph("The town slowly fell apart.", "شهر آرام‌آرام از هم پاشید."),
                    StoryParagraph("People left or died.", "مردم رفتند یا مردند."),
                    StoryParagraph("The Buendía family was dying out.", "خانواده بوئندیا داشت منقرض می‌شد."),
                    StoryParagraph("Only a few members remained.", "فقط چند عضو باقی ماندند.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End of Macondo", titlePersian = "پایان ماکوندو",
                paragraphs = listOf(
                    StoryParagraph("The last Buendía was born with a pig's tail.", "آخرین بوئندیا با دمی خوک به دنیا آمد."),
                    StoryParagraph("His mother Amaranta Úrsula died in childbirth.", "مادرش آمارانتا اورسولا در زایمان مرد."),
                    StoryParagraph("His father Aureliano was devastated.", "پدرش اورلیانو ویران شد."),
                    StoryParagraph("He spent his days reading old manuscripts.", "او روزها را به خواندن دست‌نوشته‌های قدیمی می‌گذراند."),
                    StoryParagraph("The manuscripts were written by Melquíades.", "دست‌نوشته‌ها توسط ملکیادس نوشته شده بودند."),
                    StoryParagraph("They told the entire history of the family.", "آن‌ها تمام تاریخ خانواده را می‌گفتند."),
                    StoryParagraph("Everything had been predicted a hundred years ago.", "همه چیز صد سال پیش پیش‌بینی شده بود."),
                    StoryParagraph("Every event, every name, every death.", "هر رویداد، هر نام، هر مرگ."),
                    StoryParagraph("Aureliano finally understood.", "اورلیانو بالاخره فهمید."),
                    StoryParagraph("He realized he would never leave Macondo.", "او فهمید هرگز ماکوندو را ترک نمی‌کند."),
                    StoryParagraph("He would die in the room he was born in.", "او در همان اتاقی که به دنیا آمده بود می‌مرد."),
                    StoryParagraph("He began to read the last page.", "او شروع کرد به خواندن آخرین صفحه."),
                    StoryParagraph("The text said the Buendía family would end.", "متن گفت خانواده بوئندیا پایان می‌یابد."),
                    StoryParagraph("It said the last member would be eaten by ants.", "گفت آخرین عضو توسط مورچه‌ها خورده می‌شود."),
                    StoryParagraph("Aureliano looked at his baby.", "اورلیانو به بچه‌اش نگاه کرد."),
                    StoryParagraph("The baby was being carried away by ants.", "بچه توسط مورچه‌ها برده می‌شد."),
                    StoryParagraph("He realized the manuscripts were true.", "او فهمید دست‌نوشته‌ها واقعی هستند."),
                    StoryParagraph("A hurricane struck Macondo.", "طوفانی ماکوندو را درنوردید."),
                    StoryParagraph("The town was blown away.", "شهر نابود شد."),
                    StoryParagraph("And so ended one hundred years of solitude.", "و اینگونه صد سال تنهایی به پایان رسید.")
                )
            )
        )
    )

    // ─────────────── ۵: خانم دالووی ───────────────
    private fun story5() = StoryContent(
        storyId = "adv_mrs_dalloway",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "A Morning in London", titlePersian = "صبحی در لندن",
                paragraphs = listOf(
                    StoryParagraph("Clarissa Dalloway went out to buy flowers.", "کلاریسا دالووی برای خرید گل بیرون رفت."),
                    StoryParagraph("It was a beautiful morning in June.", "صبح زیبایی در ماه ژوئن بود."),
                    StoryParagraph("She loved the streets of London.", "او خیابان‌های لندن را دوست داشت."),
                    StoryParagraph("She loved the sound of the buses and the smell of the air.", "او صدای اتوبوس‌ها و بوی هوا را دوست داشت."),
                    StoryParagraph("She was fifty-one years old.", "او پنجاه و یک ساله بود."),
                    StoryParagraph("She had been ill and her heart was weak.", "او مریض بوده و قلبش ضعیف بود."),
                    StoryParagraph("But she still loved life deeply.", "اما هنوز عمیقاً زندگی را دوست داشت."),
                    StoryParagraph("She was preparing a party for that night.", "او برای آن شب مهمانی آماده می‌کرد."),
                    StoryParagraph("It was an important party for her husband.", "مهمانی مهمی برای شوهرش بود."),
                    StoryParagraph("Her husband Richard was a government official.", "شوهرش ریچارد مقام دولتی بود."),
                    StoryParagraph("Their daughter Elizabeth was seventeen.", "دخترشان الیزابت هفده ساله بود."),
                    StoryParagraph("While walking, Clarissa thought about the past.", "در حین راه رفتن، کلاریسا به گذشته فکر کرد."),
                    StoryParagraph("She remembered her old love, Peter Walsh.", "او عشق قدیمی‌اش، پیتر والش را به یاد آورد."),
                    StoryParagraph("Peter had asked her to marry him long ago.", "پیتر مدت‌ها پیش از او خواسته بود با او ازدواج کند."),
                    StoryParagraph("But she had chosen Richard instead.", "اما او ریچارد را انتخاب کرده بود."),
                    StoryParagraph("Peter had been too demanding and jealous.", "پیتر بیش از حد طلبکار و حسود بود."),
                    StoryParagraph("Richard had given her peace and freedom.", "ریچارد آرامش و آزادی به او داده بود."),
                    StoryParagraph("But still, she wondered sometimes.", "اما هنوز، گاهی فکر می‌کرد."),
                    StoryParagraph("She wondered what her life might have been.", "او فکر می‌کرد زندگی‌اش چه می‌توانست باشد."),
                    StoryParagraph("She reached the flower shop and went inside.", "او به گلفروشی رسید و داخل رفت.")
                )
            ),
            StoryChapter(
                number = 2, title = "Septimus Smith", titlePersian = "سپتیموس اسمیت",
                paragraphs = listOf(
                    StoryParagraph("Across London, another person was thinking.", "آنجا در لندن، شخص دیگری در حال فکر کردن بود."),
                    StoryParagraph("His name was Septimus Warren Smith.", "اسمش سپتیموس وارن اسمیت بود."),
                    StoryParagraph("He was a young man, about thirty.", "او مرد جوانی بود، حدوداً سی ساله."),
                    StoryParagraph("He was sitting with his wife Lucrezia in a park.", "او با همسرش لوکرزیا در پارکی نشسته بود."),
                    StoryParagraph("Lucrezia was Italian and worried about him.", "لوکرزیا ایتالیایی بود و نگرانش بود."),
                    StoryParagraph("Septimus had been a soldier in the war.", "سپتیموس در جنگ سرباز بوده است."),
                    StoryParagraph("He had seen his best friend Evans die.", "او مرگ بهترین دوستش ایوانز را دیده بود."),
                    StoryParagraph("Now he had a mental illness.", "حالا او بیماری روانی داشت."),
                    StoryParagraph("He saw things that were not there.", "او چیزهایی می‌دید که آنجا نبودند."),
                    StoryParagraph("He heard voices that were not real.", "او صداهایی می‌شنید که واقعی نبودند."),
                    StoryParagraph("He thought the world was against him.", "او فکر می‌کرد دنیا علیه اوست."),
                    StoryParagraph("He felt empty and hopeless.", "او احساس پوچی و ناامیدی می‌کرد."),
                    StoryParagraph("His wife took him to a doctor.", "همسرش او را به دکتر برد."),
                    StoryParagraph("The doctor, Sir William Bradshaw, was cold and proud.", "دکتر، سر ویلیام بردشاو، سرد و مغرور بود."),
                    StoryParagraph("He said Septimus needed rest in a hospital.", "او گفت سپتیموس به استراحت در بیمارستان نیاز دارد."),
                    StoryParagraph("He did not understand Septimus' pain.", "او درد سپتیموس را نمی‌فهمید."),
                    StoryParagraph("He only wanted to lock him up.", "او فقط می‌خواست او را حبس کند."),
                    StoryParagraph("Septimus felt like he was being hunted.", "سپتیموس احساس می‌کرد شکار می‌شود."),
                    StoryParagraph("He felt he could not survive.", "او احساس می‌کرد نمی‌تواند زنده بماند."),
                    StoryParagraph("He wanted to escape from everything.", "او می‌خواست از همه چیز فرار کند.")
                )
            ),
            StoryChapter(
                number = 3, title = "Peter Walsh Returns", titlePersian = "بازگشت پیتر والش",
                paragraphs = listOf(
                    StoryParagraph("That morning, Peter Walsh returned to London.", "آن صبح، پیتر والش به لندن برگشت."),
                    StoryParagraph("He had been in India for five years.", "او پنج سال در هند بوده است."),
                    StoryParagraph("He was now about fifty-five years old.", "او حالا حدوداً پنجاه و پنج ساله بود."),
                    StoryParagraph("He was still unmarried.", "او هنوز ازدواج نکرده بود."),
                    StoryParagraph("He had just fallen in love with a young married woman.", "او تازه عاشق زن جوان متأهلی شده بود."),
                    StoryParagraph("She was the wife of a major in the Indian army.", "او همسر سرگردی در ارتش هند بود."),
                    StoryParagraph("Peter had come to London to arrange a divorce.", "پیتر برای ترتیب دادن طلاق به لندن آمده بود."),
                    StoryParagraph("He wanted to marry the young woman.", "او می‌خواست با زن جوان ازدواج کند."),
                    StoryParagraph("He went to see Clarissa first.", "او اول به دیدن کلاریسا رفت."),
                    StoryParagraph("Clarissa was very happy to see him.", "کلاریسا از دیدنش خیلی خوشحال شد."),
                    StoryParagraph("They had not met for many years.", "آن‌ها سال‌ها همدیگر را ندیده بودند."),
                    StoryParagraph("They talked and laughed together.", "آن‌ها با هم صحبت کردند و خندیدند."),
                    StoryParagraph("But Peter felt the old pain again.", "اما پیتر دوباره درد قدیمی را حس کرد."),
                    StoryParagraph("He realized he still loved her.", "او فهمید هنوز دوستش دارد."),
                    StoryParagraph("But she was married and settled.", "اما او متأهل و ساکن بود."),
                    StoryParagraph("Their lives had gone in different directions.", "زندگی‌هایشان در جهت‌های متفاوتی رفته بود."),
                    StoryParagraph("Peter left her house feeling sad.", "پیتر با احساس غم خانه‌اش را ترک کرد."),
                    StoryParagraph("He walked through the streets of London.", "او در خیابان‌های لندن قدم زد."),
                    StoryParagraph("He thought about what could have been.", "او به آنچه می‌توانست باشد فکر کرد."),
                    StoryParagraph("But it was too late for regrets.", "اما برای پشیمانی خیلی دیر بود.")
                )
            ),
            StoryChapter(
                number = 4, title = "The Party", titlePersian = "مهمانی",
                paragraphs = listOf(
                    StoryParagraph("That evening, Clarissa's party began.", "آن عصر، مهمانی کلاریسا شروع شد."),
                    StoryParagraph("The house was full of guests.", "خانه پر از مهمان بود."),
                    StoryParagraph("There were politicians, writers, and old friends.", "سیاستمداران، نویسندگان و دوستان قدیمی بودند."),
                    StoryParagraph("The Prime Minister himself came.", "خود نخست‌وزیر آمد."),
                    StoryParagraph("It was a great success.", "موفقیت بزرگی بود."),
                    StoryParagraph("But Clarissa felt strangely empty.", "اما کلاریسا به شکل عجیبی احساس پوچی کرد."),
                    StoryParagraph("She felt she was playing a role.", "او احساس می‌کرد نقش بازی می‌کند."),
                    StoryParagraph("She felt separate from everyone.", "او از همه جدا احساس می‌کرد."),
                    StoryParagraph("Peter Walsh was at the party too.", "پیتر والش هم در مهمانی بود."),
                    StoryParagraph("He looked at Clarissa with sad eyes.", "او با چشمان غمگین به کلاریسا نگاه کرد."),
                    StoryParagraph("Then the doctor Sir William arrived.", "بعد دکتر سر ویلیام رسید."),
                    StoryParagraph("He told everyone some terrible news.", "او خبر وحشتناکی به همه گفت."),
                    StoryParagraph("One of his patients had killed himself.", "یکی از بیمارانش خودش را کشته بود."),
                    StoryParagraph("It was Septimus Warren Smith.", "سپتیموس وارن اسمیت بود."),
                    StoryParagraph("He had jumped out of a window.", "او از پنجره پریده بود."),
                    StoryParagraph("Clarissa was very shocked.", "کلاریسا خیلی شوکه شد."),
                    StoryParagraph("She went into a small room alone.", "او تنهایی به اتاق کوچکی رفت."),
                    StoryParagraph("She felt a strange connection to the dead man.", "او ارتباط عجیبی با مرد مرده حس کرد."),
                    StoryParagraph("She understood his need for freedom.", "او نیاز او به آزادی را فهمید."),
                    StoryParagraph("She felt glad he had escaped.", "او خوشحال شد که فرار کرده بود.")
                )
            ),
            StoryChapter(
                number = 5, title = "The End of the Day", titlePersian = "پایان روز",
                paragraphs = listOf(
                    StoryParagraph("Clarissa came back to the party.", "کلاریسا به مهمانی برگشت."),
                    StoryParagraph("She felt more alive than before.", "او بیشتر از قبل زنده احساس می‌کرد."),
                    StoryParagraph("She realized life was precious.", "او فهمید زندگی ارزشمند است."),
                    StoryParagraph("She looked at her guests with new eyes.", "او با چشمان جدیدی به مهمانانش نگاه کرد."),
                    StoryParagraph("She saw their fears and their joys.", "او ترس‌ها و شادی‌هایشان را دید."),
                    StoryParagraph("She saw the beauty in ordinary things.", "او زیبایی در چیزهای معمولی دید."),
                    StoryParagraph("Peter Walsh came to say goodbye.", "پیتر والش برای خداحافظی آمد."),
                    StoryParagraph("He was leaving for India the next day.", "او فردا به هند می‌رفت."),
                    StoryParagraph("They said farewell with mixed feelings.", "آن‌ها با احساسات متناقض خداحافظی کردند."),
                    StoryParagraph("Clarissa watched him go.", "کلاریسا تماشا کرد که رفت."),
                    StoryParagraph("She went back to her party.", "او به مهمانی‌اش برگشت."),
                    StoryParagraph("The night went on beautifully.", "شب به زیبایی ادامه یافت."),
                    StoryParagraph("The guests finally went home.", "مهمانان بالاخره به خانه رفتند."),
                    StoryParagraph("Clarissa was alone with her thoughts.", "کلاریسا با افکارش تنها بود."),
                    StoryParagraph("She thought about the young man who had died.", "او به مرد جوانی که مرده بود فکر کرد."),
                    StoryParagraph("She felt he had given her a gift.", "او احساس کرد به او هدیه‌ای داده است."),
                    StoryParagraph("It was the gift of understanding.", "هدیه درک بود."),
                    StoryParagraph("She realized life and death were connected.", "او فهمید زندگی و مرگ به هم وصلند."),
                    StoryParagraph("She went to bed peacefully.", "او با آرامش به رختخواب رفت."),
                    StoryParagraph("And so the day ended.", "و اینگونه روز به پایان رسید.")
                )
            )
        )
    )

    // ─────────────── ۶: سیدارتا ───────────────
    private fun story6() = StoryContent(
        storyId = "adv_siddhartha",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Brahmin's Son", titlePersian = "پسر برهمن",
                paragraphs = listOf(
                    StoryParagraph("Siddhartha was a young Brahmin in ancient India.", "سیدارتا برهمنی جوان در هند باستان بود."),
                    StoryParagraph("He was handsome, intelligent, and loved by all.", "او خوش‌قیافه، باهوش و محبوب همه بود."),
                    StoryParagraph("His father was a wise and respected priest.", "پدرش کشیشی دانا و محترم بود."),
                    StoryParagraph("Everyone expected Siddhartha to become a great Brahmin.", "همه انتظار داشتند سیدارتا برهمن بزرگی شود."),
                    StoryParagraph("But Siddhartha was not happy.", "اما سیدارتا خوشحال نبود."),
                    StoryParagraph("He had learned all the sacred teachings.", "او تمام تعالیم مقدس را آموخته بود."),
                    StoryParagraph("But he still did not understand the meaning of life.", "اما هنوز معنای زندگی را نمی‌فهمید."),
                    StoryParagraph("He felt a deep emptiness inside.", "او پوچی عمیقی درونش حس می‌کرد."),
                    StoryParagraph("His friend Govinda loved him and followed him.", "دوستش گویندا دوستش داشت و دنبالش می‌رفت."),
                    StoryParagraph("One day, a group of wandering monks passed through.", "یک روز، گروهی از راهبان سرگردان گذشتند."),
                    StoryParagraph("They were called Samanas.", "آن‌ها سامانا نامیده می‌شدند."),
                    StoryParagraph("They had given up all possessions.", "آن‌ها از تمام دارایی‌ها دست کشیده بودند."),
                    StoryParagraph("Siddhartha decided to join them.", "سیدارتا تصمیم گرفت به آن‌ها بپیوندد."),
                    StoryParagraph("His father was very sad.", "پدرش خیلی غمگین شد."),
                    StoryParagraph("But he finally allowed his son to go.", "اما بالاخره به پسرش اجازه داد برود."),
                    StoryParagraph("Siddhartha left his home and his family.", "سیدارتا خانه و خانواده‌اش را ترک کرد."),
                    StoryParagraph("Govinda went with him.", "گویندا با او رفت."),
                    StoryParagraph("They began their life as wandering monks.", "آن‌ها زندگی‌شان را به عنوان راهبان سرگردان شروع کردند."),
                    StoryParagraph("They learned to fast and to meditate.", "آن‌ها روزه گرفتن و مراقبه را یاد گرفتند."),
                    StoryParagraph("They learned to endure pain and suffering.", "آن‌ها تحمل درد و رنج را یاد گرفتند.")
                )
            ),
            StoryChapter(
                number = 2, title = "The Buddha", titlePersian = "بودا",
                paragraphs = listOf(
                    StoryParagraph("After three years with the Samanas, they heard news.", "بعد از سه سال با ساماناها، خبری شنیدند."),
                    StoryParagraph("A great teacher had appeared in the world.", "استاد بزرگی در جهان ظاهر شده بود."),
                    StoryParagraph("He was called the Buddha, the Enlightened One.", "او بودا، روشن‌ضمیر نامیده می‌شد."),
                    StoryParagraph("He taught the way to end all suffering.", "او راه پایان دادن به همه رنج‌ها را تعلیم می‌داد."),
                    StoryParagraph("Siddhartha and Govinda went to hear him.", "سیدارتا و گویندا برای شنیدنش رفتند."),
                    StoryParagraph("They found the Buddha in a grove of trees.", "آن‌ها بودا را در بیشه‌ای از درختان پیدا کردند."),
                    StoryParagraph("He was calm and peaceful.", "او آرام و صلح‌جو بود."),
                    StoryParagraph("He spoke about the Four Noble Truths.", "او درباره چهار حقیقت شریف صحبت کرد."),
                    StoryParagraph("He spoke about the Eightfold Path.", "او درباره راه هشتگانه صحبت کرد."),
                    StoryParagraph("Everyone listened in silence.", "همه در سکوت گوش دادند."),
                    StoryParagraph("Govinda was deeply moved.", "گویندا عمیقاً تحت تأثیر قرار گرفت."),
                    StoryParagraph("He decided to become a follower of the Buddha.", "او تصمیم گرفت پیرو بودا شود."),
                    StoryParagraph("But Siddhartha was not satisfied.", "اما سیدارتا راضی نشد."),
                    StoryParagraph("He felt the Buddha's teaching was not complete.", "او احساس کرد تعالیم بودا کامل نیست."),
                    StoryParagraph("He wanted to find his own way to enlightenment.", "او می‌خواست راه خودش به روشن‌ضمیری را پیدا کند."),
                    StoryParagraph("The Buddha did not try to stop him.", "بودا تلاش نکرد متوقفش کند."),
                    StoryParagraph("He wished him well on his journey.", "او برایش در سفرش آرزوی خوبی کرد."),
                    StoryParagraph("Govinda stayed with the Buddha.", "گویندا با بودا ماند."),
                    StoryParagraph("Siddhartha went on alone.", "سیدارتا تنها ادامه داد."),
                    StoryParagraph("He was now completely by himself.", "او حالا کاملاً تنها بود.")
                )
            ),
            StoryChapter(
                number = 3, title = "Kamala and the World", titlePersian = "کامالا و دنیا",
                paragraphs = listOf(
                    StoryParagraph("Siddhartha walked to a great city.", "سیدارتا به شهری بزرگ رفت."),
                    StoryParagraph("He met a beautiful woman named Kamala.", "او زنی زیبا به نام کامالا ملاقات کرد."),
                    StoryParagraph("She was a famous courtesan.", "او روسپی معروفی بود."),
                    StoryParagraph("She was intelligent and sophisticated.", "او باهوش و مجرب بود."),
                    StoryParagraph("Siddhartha asked her to teach him about love.", "سیدارتا از او خواست درباره عشق به او بیاموزد."),
                    StoryParagraph("She agreed, but asked him to bring her gifts.", "او موافقت کرد، اما از او خواست هدیه‌هایی برایش بیاورد."),
                    StoryParagraph("She wanted money, clothes, and shoes.", "او پول، لباس و کفش می‌خواست."),
                    StoryParagraph("Siddhartha did not have any of these.", "سیدارتا هیچ‌کدام را نداشت."),
                    StoryParagraph("He went to work for a rich merchant named Kamaswami.", "او برای تاجری ثروتمند به نام کاماسوامی کار کرد."),
                    StoryParagraph("He learned the ways of business quickly.", "او سریع راه‌های تجارت را یاد گرفت."),
                    StoryParagraph("He became successful and rich.", "او موفق و ثروتمند شد."),
                    StoryParagraph("He bought Kamala gifts and learned about love.", "او برای کامالا هدیه می‌خرید و درباره عشق می‌آموخت."),
                    StoryParagraph("They spent many years together.", "آن‌ها سال‌ها با هم گذراندند."),
                    StoryParagraph("But Siddhartha slowly became trapped in the world.", "اما سیدارتا آرام‌آرام در دنیا گرفتار شد."),
                    StoryParagraph("He became greedy for money and pleasure.", "او نسبت به پول و لذت حریص شد."),
                    StoryParagraph("He started to drink and gamble.", "او شروع کرد به نوشیدن و قمار."),
                    StoryParagraph("He forgot his spiritual goals.", "او اهداف روحانی‌اش را فراموش کرد."),
                    StoryParagraph("He felt sick and disgusted with himself.", "او از خودش مریض و منزجر شد."),
                    StoryParagraph("One night, he had a terrible dream.", "یک شب، کابوس وحشتناکی دید."),
                    StoryParagraph("He decided to leave everything behind.", "او تصمیم گرفت همه چیز را رها کند.")
                )
            ),
            StoryChapter(
                number = 4, title = "The River", titlePersian = "رودخانه",
                paragraphs = listOf(
                    StoryParagraph("Siddhartha left the city without looking back.", "سیدارتا بدون نگاه به عقب شهر را ترک کرد."),
                    StoryParagraph("He wandered into the forest.", "او در جنگل سرگردان شد."),
                    StoryParagraph("He felt worthless and hopeless.", "او احساس بی‌ارزشی و ناامیدی می‌کرد."),
                    StoryParagraph("He thought about ending his life in the river.", "او به پایان دادن زندگی‌اش در رودخانه فکر کرد."),
                    StoryParagraph("But at the last moment, a sacred word came to him.", "اما در آخرین لحظه، کلمه مقدسی به ذهنش آمد."),
                    StoryParagraph("It was the word 'Om'.", "کلمه 'اوم' بود."),
                    StoryParagraph("He fell into a deep sleep.", "او به خواب عمیقی رفت."),
                    StoryParagraph("When he woke up, he felt new and different.", "وقتی بیدار شد، جدید و متفاوت احساس کرد."),
                    StoryParagraph("A man was sitting next to him.", "مردی کنارش نشسته بود."),
                    StoryParagraph("It was Govinda, his old friend.", "گویندا، دوست قدیمی‌اش بود."),
                    StoryParagraph("They spoke for a while and then parted again.", "آن‌ها مدتی صحبت کردند و بعد دوباره جدا شدند."),
                    StoryParagraph("Siddhartha went to a river.", "سیدارتا به رودخانه‌ای رفت."),
                    StoryParagraph("There was an old ferryman named Vasudeva.", "پیرمرد قایق‌رانی به نام واسودوا آنجا بود."),
                    StoryParagraph("He lived simply and understood the river.", "او ساده زندگی می‌کرد و رودخانه را می‌فهمید."),
                    StoryParagraph("Siddhartha decided to stay with him.", "سیدارتا تصمیم گرفت با او بماند."),
                    StoryParagraph("He became Vasudeva's apprentice.", "او شاگرد واسودوا شد."),
                    StoryParagraph("He learned to listen to the river.", "او یاد گرفت به رودخانه گوش دهد."),
                    StoryParagraph("The river taught him many things.", "رودخانه چیزهای زیادی به او آموخت."),
                    StoryParagraph("It taught him about time, change, and unity.", "به او درباره زمان، تغییر و وحدت آموخت."),
                    StoryParagraph("Slowly, Siddhartha found peace.", "آرام‌آرام، سیدارتا آرامش یافت.")
                )
            ),
            StoryChapter(
                number = 5, title = "Enlightenment", titlePersian = "روشن‌ضمیری",
                paragraphs = listOf(
                    StoryParagraph("Years passed and Siddhartha grew old.", "سال‌ها گذشت و سیدارتا پیر شد."),
                    StoryParagraph("One day, Kamala came to the river.", "یک روز، کامالا به رودخانه آمد."),
                    StoryParagraph("She was with her son, who was also Siddhartha's son.", "او با پسرش بود، که پسر سیدارتا هم بود."),
                    StoryParagraph("She had become a follower of the Buddha.", "او پیرو بودا شده بود."),
                    StoryParagraph("But she was bitten by a snake near the river.", "اما نزدیک رودخانه ماری او را گزید."),
                    StoryParagraph("Siddhartha found her and held her.", "سیدارتا او را پیدا کرد و در آغوش گرفت."),
                    StoryParagraph("She died in his arms.", "او در آغوشش مرد."),
                    StoryParagraph("Their son stayed with Siddhartha.", "پسرشان با سیدارتا ماند."),
                    StoryParagraph("But the boy was angry and unhappy.", "اما پسر عصبانی و ناراضی بود."),
                    StoryParagraph("He did not want to live like his father.", "او نمی‌خواست مثل پدرش زندگی کند."),
                    StoryParagraph("One night, he ran away.", "یک شب فرار کرد."),
                    StoryParagraph("Siddhartha was very sad.", "سیدارتا خیلی غمگین شد."),
                    StoryParagraph("But he remembered that everyone has their own path.", "اما به یاد آورد که هر کس مسیر خودش را دارد."),
                    StoryParagraph("Vasudeva told him to listen to the river.", "واسودوا به او گفت به رودخانه گوش دهد."),
                    StoryParagraph("Siddhartha listened deeply.", "سیدارتا عمیق گوش داد."),
                    StoryParagraph("He heard all voices in the river.", "او همه صداها را در رودخانه شنید."),
                    StoryParagraph("He heard joy, sorrow, laughter, and pain.", "شادی، غم، خنده و درد را شنید."),
                    StoryParagraph("They were all part of one great song.", "همه بخشی از یک آهنگ بزرگ بودند."),
                    StoryParagraph("Siddhartha finally understood everything.", "سیدارتا بالاخره همه چیز را فهمید."),
                    StoryParagraph("He had achieved enlightenment.", "او روشن‌ضمیری را به دست آورد.")
                )
            )
        )
    )
}