package com.zabanyar.ai.data.books.story.content.intermediate

import com.zabanyar.ai.data.books.story.StoryChapter
import com.zabanyar.ai.data.books.story.StoryContent
import com.zabanyar.ai.data.books.story.StoryParagraph

/**
 * 📚 گروه ۱۱ — داستان‌های کلاسیک روسی
 *  ۳۱. جنگ و صلح
 *  ۳۲. جنایت و مکافات
 *  ۳۳. آنا کارنینا
 */
object Group11 {

    fun getAll(): List<StoryContent> = listOf(
        story31(),
        story32(),
        story33(),
    )

    // ─────────────── ۳۱: جنگ و صلح ───────────────
    private fun story31() = StoryContent(
        storyId = "int_war_and_peace",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "The Society of St. Petersburg", titlePersian = "جامعه‌ی سن‌پترزبورگ",
                paragraphs = listOf(
                    StoryParagraph(
                        "It was the summer of 1805, and the glittering city of St. Petersburg was alive with gossip, parties, and whispered fears of a distant war that was slowly creeping towards the borders of Russia.",
                        "تابستان ۱۸۰۵ بود و شهر پرزرق‌وبرق سن‌پترزبورگ پر از شایعات، مهمانی‌ها و زمزمه‌های ترسان از جنگی دور بود که آهسته به مرزهای روسیه نزدیک می‌شد."
                    ),
                    StoryParagraph(
                        "In a grand mansion on one of the city's finest streets, a famous society hostess named Anna Pavlovna Scherer had spent the entire day preparing for an evening that would be remembered by everyone who attended it.",
                        "در عمارتی باشکوه در یکی از بهترین خیابان‌های شهر، میزبان مشهور مجامع اشرافی به نام آنا پاولونا شرر تمام روز را صرف آماده‌سازی شب‌نشینی کرده بود که هر کس در آن حاضر می‌شد، آن را به خاطر می‌سپرد."
                    ),
                    StoryParagraph(
                        "Although she had been suffering from a severe cold for several days, Anna Pavlovna had stubbornly refused to cancel her gathering, because for her, society was not merely a pleasure but a sacred duty.",
                        "با اینکه چند روز بود از سرماخوردگی شدیدی رنج می‌برد، آنا پاولونا سرسختانه از لغو مهمانی‌اش امتناع کرده بود، چون برای او، مجامع اشرافی فقط لذت نبود، وظیفه‌ای مقدس بود."
                    ),
                    StoryParagraph(
                        "By seven o'clock in the evening, the first carriages had begun to arrive at her door, and the rooms were soon filled with the murmur of elegant conversation and the soft rustle of silk dresses.",
                        "ساعت هفت شب، اولین کالسکه‌ها دم در خانه‌اش رسیدند و اتاق‌ها به‌زودی پر از زمزمه‌ی گفت‌وگوی موقر و خش‌خش ملایم لباس‌های ابریشمی شد."
                    ),
                    StoryParagraph(
                        "The guests were members of the highest aristocracy: princes, counts, diplomats, and generals, all dressed in their finest clothes and carrying themselves with the careful pride of people who knew exactly how important they were.",
                        "مهمانان از بالاترین طبقه‌ی اشراف بودند: شاهزادگان، کنت‌ها، دیپلمات‌ها و ژنرال‌ها، همه با بهترین لباس‌ها و با همان غرور محتاطانه‌ی کسانی که خوب می‌دانستند چقدر مهم هستند."
                    ),
                    StoryParagraph(
                        "Anna Pavlovna moved among them like a skilled dancer, greeting each guest with carefully chosen words and always knowing exactly what to say to make each person feel flattered and comfortable.",
                        "آنا پاولونا مثل رقصنده‌ای ماهر میانشان می‌چرخید و هر مهمان را با کلمات حساب‌شده سلام می‌کرد و همیشه خوب می‌دانست چه بگوید تا هر کس احساس چاپلوسی و راحتی کند."
                    ),
                    StoryParagraph(
                        "The main topic of conversation that evening was Napoleon Bonaparte, the Emperor of the French, whose armies had been marching across Europe for years and whose ambition seemed to know no limits at all.",
                        "موضوع اصلی گفت‌وگوی آن شب، ناپلئون بناپارت، امپراتور فرانسه بود که ارتش‌هایش سال‌ها در سراسر اروپا پیشروی کرده بودند و جاه‌طلبی‌اش به نظر هیچ حدی نمی‌شناخت."
                    ),
                    StoryParagraph(
                        "Most of the guests spoke about him with a mixture of fear and hatred, calling him a monster and a tyrant who had destroyed the peace of Europe and would soon destroy Russia as well if he was not stopped.",
                        "اکثر مهمانان با آمیزه‌ای از ترس و نفرت از او صحبت می‌کردند و او را هیولا و مستبدی می‌خواندند که صلح اروپا را نابود کرده بود و اگر متوقف نمی‌شد، به‌زودی روسیه را هم نابود می‌کرد."
                    ),
                    StoryParagraph(
                        "Among the most respected guests was a tall, elegant prince named Vasily Kuragin, a man known for his charm, his influence at court, and his extraordinary ability to always be present wherever power or money was being discussed.",
                        "در میان محترم‌ترین مهمانان، شاهزاده‌ای بلندقد و خوش‌لباس به نام واسیلی کوراگین بود، مردی که به جذابیت، نفوذش در دربار و توانایی خارق‌العاده‌اش در همیشه حاضر بودن هرجا که از قدرت یا ثروت صحبت می‌شد شناخته می‌شد."
                    ),
                    StoryParagraph(
                        "Prince Vasily had three children, and though he loved none of them very much, he was deeply concerned with finding them good marriages that would strengthen his family's position in society.",
                        "شاهزاده واسیلی سه فرزند داشت و با اینکه هیچ‌کدام را زیاد دوست نداشت، عمیقاً نگران یافتن ازدواج‌های خوب برایشان بود تا موقعیت خانواده‌اش را در جامعه تقویت کند."
                    ),
                    StoryParagraph(
                        "Near the fireplace stood a stout, handsome young man with short hair and glasses, whose awkward movements and absent-minded expression made him stand out immediately from the polished guests around him.",
                        "نزدیک شومینه، جوانی تنومند و خوش‌قیافه با موهای کوتاه و عینک ایستاده بود که حرکات ناهنجار و حالت حواس‌پرت او را فوراً از مهمانان صیقلی اطرافش متمایز می‌کرد."
                    ),
                    StoryParagraph(
                        "This was Pierre Bezukhov, the illegitimate son of the wealthy Count Bezukhov, a young man who had just returned to Russia after many years of education abroad and who understood almost nothing about Russian high society.",
                        "این پیر بزوخوف بود، پسر نامشروع کنت ثروتمند بزوخوف، جوانی که تازه پس از سال‌ها تحصیل در خارج به روسیه بازگشته بود و تقریباً هیچ چیز از جامعه‌ی عالی روسیه نمی‌فهمید."
                    ),
                    StoryParagraph(
                        "Pierre had not been officially invited to the gathering, but Prince Vasily had brought him there, hoping to introduce the awkward young man to useful people before his father's expected death made him a very wealthy heir.",
                        "پیر رسماً به مهمانی دعوت نشده بود، اما شاهزاده واسیلی او را آورده بود، به این امید که پیش از مرگ انتظاری پدرش او را وارثی بسیار ثروتمند کند، جوان دست‌وپاچلفتی را به افراد به‌کارآمد معرفی کند."
                    ),
                    StoryParagraph(
                        "At first, Pierre stood silently near the door, feeling out of place among the aristocrats and watching the room with the curious eyes of a stranger who had not yet learned the rules of the game.",
                        "اول، پیر ساکت نزدیک در ایستاد و میان اشراف احساس بیگانگی می‌کرد و اتاق را با چشمان کنجکاو غریبه‌ای می‌نگریست که هنوز قواعد بازی را نیاموخته بود."
                    ),
                    StoryParagraph(
                        "Anna Pavlovna, however, was too experienced a hostess to allow such an important guest to remain in the shadows, and she soon came to him with a polite smile and began to ask about his travels in France.",
                        "اما آنا پاولونا آن‌قدر میزبان باتجربه‌ای بود که اجازه ندهد چنین مهمان مهمی در سایه بماند، و به‌زودی با لبخندی مؤدبانه به سراغش آمد و شروع کرد به پرسیدن درباره‌ی سفرهایش در فرانسه."
                    ),
                    StoryParagraph(
                        "When she asked him what he thought of Napoleon, Pierre answered with surprising honesty that in his opinion the French Emperor was a great man whose genius could not be denied by any fair-minded person.",
                        "وقتی از او پرسید درباره‌ی ناپلئون چه فکر می‌کند، پیر با صداقتی شگفت‌آور پاسخ داد که به نظر او امپراتور فرانسه مردی بزرگ است که نابغه بودنش را هیچ انسان منصفی نمی‌تواند انکار کند."
                    ),
                    StoryParagraph(
                        "A shocked silence fell over the small group of guests who had gathered to listen, and several of them looked at Pierre with a mixture of pity and disapproval, as if he had said something deeply improper.",
                        "سکوتی شوکه‌شده بر گروه کوچکی از مهمانان که برای شنیدن جمع شده بودند افتاد، و چند نفر با آمیزه‌ای از ترحم و نارضایتی به پیر نگاه کردند، گویی او حرفی عمیقاً ناشایست زده بود."
                    ),
                    StoryParagraph(
                        "But before anyone could respond sharply, a young prince named Andrei Bolkonsky, who had been standing nearby with a bored expression, allowed himself a small smile of amusement at Pierre's boldness.",
                        "اما پیش از آنکه کسی بتواند تندی پاسخ دهد، شاهزاده‌ای جوان به نام آندری بولکونسکی که با حالتی خسته نزدیک ایستاده بود، به خود اجازه داد لبخند کوچکی از سرگرمی به جسارت پیر بزند."
                    ),
                    StoryParagraph(
                        "Prince Andrei was a short but strikingly handsome man of about thirty, with sharp, cold eyes and an expression of quiet intelligence that set him apart from the empty elegance of most people in the room.",
                        "شاهزاده آندری مردی کوتاه‌قد اما به‌طور چشمگیری خوش‌قیافه حدوداً سی‌ساله بود، با چشمانی تیز و سرد و حالتی از هوش آرام که او را از ظرافت پوچ اکثر افراد اتاق متمایز می‌کرد."
                    ),
                    StoryParagraph(
                        "He was the son of the famous old Prince Nikolai Bolkonsky, a man of great pride and strict principles who had once served under Catherine the Great and now lived quietly on his country estate.",
                        "او پسر شاهزاده‌ی مشهور و پیر نیکلای بولکونسکی بود، مردی سرشار از غرور و اصول سختگیرانه که زمانی در دوران کاترین کبیر خدمت کرده بود و حالا آرام در ملک روستایی‌اش زندگی می‌کرد."
                    ),
                    StoryParagraph(
                        "Andrei had little patience for the empty talk of society, and he had come to the gathering only because his pregnant wife Lise had begged him to accompany her and because he knew that his absence would be noticed and criticized.",
                        "آندری برای گفت‌وگوی پوچ جامعه حوصله‌ی کمی داشت و فقط به این دلیل به مهمانی آمده بود که همسر باردارش لیزا التماسش کرده بود همراهی‌اش کند و چون می‌دانست غیبتش دیده و نقد خواهد شد."
                    ),
                    StoryParagraph(
                        "Throughout the evening, he had stood mostly in silence, watching the guests with the cool, detached gaze of a man who had already grown tired of the world before he had even truly entered it.",
                        "در طول آن شب، بیشتر ساکت ایستاده بود و مهمانان را با نگاه سرد و بی‌طرف مردی می‌نگریست که پیش از آنکه واقعاً وارد دنیا شود، از آن خسته شده بود."
                    ),
                    StoryParagraph(
                        "When Pierre spoke, however, Andrei's expression changed, and he looked at the awkward young man with genuine interest for the first time that evening, sensing that here at last was someone who thought for himself.",
                        "اما وقتی پیر حرف زد، حالت آندری تغییر کرد و برای اولین بار آن شب با علاقه‌ی واقعی به جوان دست‌وپاچلفتی نگاه کرد و حس کرد که بالاخره اینجا کسی است که خودش فکر می‌کند."
                    ),
                    StoryParagraph(
                        "Later, when the conversation had drifted to other subjects and the guests had begun to separate into smaller groups, Andrei quietly approached Pierre and stood beside him for a moment without speaking.",
                        "بعدتر، وقتی گفت‌وگو به موضوعات دیگر کشیده شد و مهمانان شروع کردند به تقسیم شدن به گروه‌های کوچک‌تر، آندری بی‌صدا به پیر نزدیک شد و لحظه‌ای بدون حرف‌زدن کنارش ایستاد."
                    ),
                    StoryParagraph(
                        "He then invited Pierre to sit with him, and the two men began a conversation that neither of them could have known would shape the entire course of their lives for years to come.",
                        "سپس پیر را دعوت کرد که کنارش بنشیند و آن دو مرد گفت‌وگویی را آغاز کردند که هیچ‌کدام نمی‌توانستند بدانند سال‌های آینده‌ی زندگی هر دو را شکل می‌دهد."
                    ),
                    StoryParagraph(
                        "I do not understand why you came here, Andrei said honestly, with a faint smile that softened his usually severe features, because you clearly do not belong in this world any more than I do.",
                        "آندری با لبخندی کم‌رنگ که معمولاً چهره‌ی سختش را نرم می‌کرد صادقانه گفت: نمی‌فهمم چرا به اینجا آمدی، چون آشکارا تو هم مثل من به این دنیا تعلق نداری."
                    ),
                    StoryParagraph(
                        "Pierre laughed at this, and for the first time that evening he felt almost comfortable, because he had found in Andrei a man who spoke to him not as a stranger to be judged, but as a friend to be understood.",
                        "پیر به این حرف خندید و برای اولین بار در آن شب تقریباً احساس راحتی کرد، چون در آندری مردی را یافته بود که با او نه مثل غریبه‌ای که باید قضاوت شود، بلکه مثل دوستی که باید فهمیده شود سخن می‌گفت."
                    ),
                    StoryParagraph(
                        "In the weeks that followed, their friendship would grow quickly, and Pierre would come to see Andrei as the only person in St. Petersburg to whom he could speak his true thoughts without fear of being laughed at or misunderstood.",
                        "در هفته‌های بعد، دوستی‌شان به‌سرعت رشد کرد و پیر به آندری همچون تنها فرد در سن‌پترزبورگ نگاه می‌کرد که می‌توانست افکار واقعی‌اش را بدون ترس از مسخره شدن یا بدفهمی با او در میان بگذارد."
                    ),
                    StoryParagraph(
                        "Meanwhile, on the other side of the room, the guests continued their endless chatter about war and politics, about promotions and marriages, about all the small affairs that seemed so important to them but so meaningless to the two men sitting quietly in the corner.",
                        "در همین حال، در طرف دیگر اتاق، مهمانان گفت‌وگوی بی‌پایانشان را درباره جنگ و سیاست، ترفیع و ازدواج، و همه‌ی مسائل کوچکی که برایشان بسیار مهم ولی برای آن دو مرد نشسته در گوشه‌ی آرام کاملاً بی‌معنا به نظر می‌رسید ادامه می‌دادند."
                    ),
                    StoryParagraph(
                        "As the evening drew to a close and the carriages began to be called one by one, the conversation shifted to the coming war with France, and the voices in the room grew suddenly more serious and more anxious.",
                        "وقتی شب به پایان نزدیک شد و کالسکه‌ها یکی‌یکی صدا زده شدند، گفت‌وگو به جنگ پیش‌رو با فرانسه کشیده شد و صداها در اتاق ناگهان جدی‌تر و مضطرب‌تر شدند."
                    ),
                    StoryParagraph(
                        "Prince Vasily spoke confidently of Russian strength, but his eyes betrayed a careful man who was already calculating how to protect his own interests no matter which way the war turned.",
                        "شاهزاده واسیلی با اطمینان از قدرت روسیه سخن گفت، اما چشمانش مردی محتاط را لو می‌داد که از قبل داشت حساب می‌کرد در هر حالتی که جنگ بچرخد، منافع خودش را چطور حفظ کند."
                    ),
                    StoryParagraph(
                        "Andrei listened to all this without expression, but when he finally spoke, his voice was calm and cold, and it silenced even the most talkative guests around him.",
                        "آندری بدون هیچ حالتی به همه‌ی این‌ها گوش داد، اما وقتی بالاخره حرف زد، صدایش آرام و سرد بود و حتی پرسخنگوترین مهمانان اطرافش را ساکت کرد."
                    ),
                    StoryParagraph(
                        "If war must come, he said quietly, then let it come, because a man who has never faced death cannot truly know what he is worth, and I for one am tired of pretending that this society is enough for me.",
                        "او آرام گفت: اگر جنگ باید بیاید، بگذار بیاید، چون مردی که هرگز با مرگ روبه‌رو نشده نمی‌تواند واقعاً بداند ارزشش چقدر است، و من به‌شخصه از تظاهر کردن به اینکه این جامعه برایم کافی است خسته‌ام."
                    ),
                    StoryParagraph(
                        "Soon afterwards, the guests began to leave, one by one, filling the cold night with the sound of carriage wheels on stone and the farewells of polite society.",
                        "کمی بعد، مهمانان یکی‌یکی شروع کردند به رفتن و شب سرد را با صدای چرخ‌های کالسکه روی سنگ و خداحافظی‌های جامعه‌ی مؤدبانه پر کردند."
                    ),
                    StoryParagraph(
                        "Pierre and Andrei were among the last to leave, and as they stepped out into the freezing Russian night, they continued their conversation as if the rest of the world had ceased to exist.",
                        "پیر و آندری از آخرین نفراتی بودند که رفتند و وقتی به شب یخ‌زده‌ی روسی قدم گذاشتند، گفت‌وگویشان را ادامه دادند، گویی بقیه‌ی دنیا دیگر وجود نداشت."
                    ),
                    StoryParagraph(
                        "Neither of them could have known that this evening, this accidental meeting, this single conversation in a crowded room, marked the beginning of a friendship that would carry them through love, betrayal, war, and the slow discovery of what it truly means to be alive.",
                        "هیچ‌کدام نمی‌توانستند بدانند که این شب، این ملاقات تصادفی، این یک گفت‌وگو در اتاقی شلوغ، آغاز دوستی‌ای بود که آن‌ها را از میان عشق، خیانت، جنگ و کشف آهسته‌ی معنای واقعی زنده بودن عبور می‌داد."
                    )
                )
            ),
            StoryChapter(
                number = 2, title = "Prince Andrei's Decision", titlePersian = "تصمیم شاهزاده آندری",
                paragraphs = listOf(
                    StoryParagraph(
                        "A week after the gathering, Prince Andrei Bolkonsky returned to his family's mansion on the edge of St. Petersburg, where he had been living quietly with his young wife and his unmarried sister.",
                        "یک هفته پس از آن شب‌نشینی، شاهزاده آندری بولکونسکی به عمارت خانواده‌اش در حاشیه‌ی سن‌پترزبورگ بازگشت، جایی که آرام با همسر جوانش و خواهر مجردش زندگی می‌کرد."
                    ),
                    StoryParagraph(
                        "The house was old and elegant, filled with portraits of ancestors and the faint smell of wax candles, and it had always felt more like a museum to Andrei than a home.",
                        "خانه قدیمی و باشکوه بود، پر از پرتره‌های نیاکان و بوی ملایم شمع‌های مومی، و برای آندری همیشه بیشتر شبیه موزه‌ای بود تا خانه."
                    ),
                    StoryParagraph(
                        "His wife Lise, a small and pretty woman with a soft upper lip and bright, nervous eyes, was now six months pregnant with their first child, and she spent most of her days resting in her rooms with her ladies-in-waiting.",
                        "همسرش لیزا، زنی کوچک‌اندام و زیبا با لب بالایی نرم و چشمانی درخشان و مضطرب، حالا شش ماهه باردار اولین فرزندشان بود و بیشتر روزها را با ندیمه‌هایش در اتاق‌هایش استراحت می‌کرد."
                    ),
                    StoryParagraph(
                        "Lise loved her husband deeply, but she could not understand him, and the more she tried to draw him into the small, cheerful world she loved, the more distant and silent he became.",
                        "لیزا عمیقاً شوهرش را دوست داشت، اما نمی‌توانست او را درک کند، و هر چه بیشتر تلاش می‌کرد او را به دنیای کوچک و شادِ محبوب خود بکشاند، او دورتر و ساکت‌تر می‌شد."
                    ),
                    StoryParagraph(
                        "His sister Marya, on the other hand, was plain and shy, with a face that seemed to shine with an inner beauty whenever she smiled, and she was the only person in the household whom Andrei genuinely respected and loved.",
                        "از سوی دیگر، خواهرش ماریا زنی ساده و خجالتی بود، با چهره‌ای که هر بار لبخند می‌زد، گویی از زیبایی درونی می‌درخشید، و تنها فرد خانه بود که آندری واقعاً به او احترام می‌گذاشت و دوستش داشت."
                    ),
                    StoryParagraph(
                        "On this particular morning, Andrei entered his study early, sat down at his desk, and remained there for a long time without moving, staring at the letters and papers before him as if he did not see them at all.",
                        "در آن صبح خاص، آندری زودتر وارد دفترش شد، پشت میزش نشست و مدت طولانی بی‌حرکت ماند و به نامه‌ها و کاغذهای پیش‌رویش خیره شد، گویی اصلاً نمی‌بیندشان."
                    ),
                    StoryParagraph(
                        "For weeks, he had been wrestling with a decision that had slowly taken shape in his mind, and now, on this quiet morning, he was finally ready to act on it.",
                        "هفته‌ها بود که با تصمیمی کشتی می‌گرفت که آهسته در ذهنش شکل گرفته بود، و حالا، در این صبح آرام، بالاخره آماده بود عملی‌اش کند."
                    ),
                    StoryParagraph(
                        "The life he was living had come to feel unbearable to him; the parties, the gossip, the small ambitions of the capital, all of it seemed to him like a meaningless performance acted out by people who had never truly lived.",
                        "زندگی‌ای که می‌گذراند برایش تحمل‌ناپذیر شده بود؛ مهمانی‌ها، شایعات، جاه‌طلبی‌های کوچک پایتخت، همه به نظرش نمایشی بی‌معنا می‌آمد که افرادی بازی می‌کردند که هرگز واقعاً زندگی نکرده بودند."
                    ),
                    StoryParagraph(
                        "He wanted something greater, something that would test him, something that would force him to discover what he was truly made of, and he knew that only war could give him that.",
                        "او چیزی بزرگ‌تر می‌خواست، چیزی که او را بیازماید، چیزی که مجبورش کند کشف کند واقعاً از چه ساخته شده، و می‌دانست که فقط جنگ می‌تواند این را به او بدهد."
                    ),
                    StoryParagraph(
                        "He rose from his chair, walked slowly to the window, and looked out at the grey morning sky, and in that quiet moment, he made the decision that would change the entire course of his life.",
                        "از صندلی بلند شد، آهسته به سمت پنجره رفت و به آسمان خاکستری صبح نگاه کرد، و در آن لحظه‌ی آرام، تصمیمی گرفت که تمام مسیر زندگی‌اش را تغییر می‌داد."
                    ),
                    StoryParagraph(
                        "He would join the Russian army and go to the front, where the great battles against Napoleon were already being prepared, and he would not return until he had won glory or died trying.",
                        "او به ارتش روسیه می‌پیوست و به جبهه می‌رفت، جایی که نبردهای بزرگ علیه ناپلئون از قبل در حال آماده شدن بود، و تا افتخار نیابد یا در راهش بمیرد، باز نمی‌گشت."
                    ),
                    StoryParagraph(
                        "That evening, at the family dinner table, he announced his decision calmly, in the same steady voice he might have used to discuss the weather or the harvest.",
                        "آن شب، سر میز شام خانواده، تصمیمش را آرام و با همان صدای ثابتی که ممکن بود برای بحث درباره‌ی هوا یا محصول به کار برد، اعلام کرد."
                    ),
                    StoryParagraph(
                        "The effect was immediate and dramatic; Lise dropped her spoon, and a terrible cry escaped her lips as she turned to stare at her husband in disbelief.",
                        "تأثیرش فوری و دراماتیک بود؛ لیزا قاشقش را انداخت و فریاد هولناکی از لب‌هایش گریخت و با ناباوری به شوهرش خیره شد."
                    ),
                    StoryParagraph(
                        "You cannot mean it, she said, her voice trembling with fear and anger, because you cannot possibly leave me alone now, not when our child is about to be born.",
                        "او با صدایی که از ترس و خشم می‌لرزید گفت: نمی‌توانی جدی بگویی، چون ممکن نیست حالا تنهایم بگذاری، آن هم وقتی فرزندمان در آستانه‌ی تولد است."
                    ),
                    StoryParagraph(
                        "But Andrei only looked at her with the same cold patience he always showed when she became emotional, and he told her that he had already made up his mind.",
                        "اما آندری فقط با همان صبر سردی که هر بار او احساساتی می‌شد نشان می‌داد به او نگاه کرد و گفت که تصمیمش را گرفته است."
                    ),
                    StoryParagraph(
                        "Marya said nothing at first, but her eyes filled with tears, and she quietly reached across the table and touched her brother's hand as if to hold him back from the edge of a cliff.",
                        "ماریا اول چیزی نگفت، اما چشمانش پر از اشک شد و بی‌صدا دستش را روی میز دراز کرد و دست برادرش را لمس کرد، گویی می‌خواهد او را از لبه‌ی پرتگاه عقب بکشد."
                    ),
                    StoryParagraph(
                        "Later that night, Lise came to Andrei's room and begged him, through tears and trembling, not to abandon her in her condition, but he remained unmoved.",
                        "بعدتر آن شب، لیزا به اتاق آندری آمد و با اشک و لرزش التماس کرد که در این وضعیت رهایش نکند، اما او تکان نخورد."
                    ),
                    StoryParagraph(
                        "He told her that he was not leaving her out of cruelty, but because he could no longer bear the life he was living, and that he needed to find meaning somewhere beyond the safe and comfortable world she loved.",
                        "او به او گفت که از سر ظلم رهایش نمی‌کند، بلکه چون دیگر نمی‌تواند زندگی‌ای که می‌گذراند تحمل کند و باید معنایی جایی فراتر از دنیای امن و راحتی که او دوست دارد پیدا کند."
                    ),
                    StoryParagraph(
                        "Lise, exhausted and defeated, finally fell asleep in a chair beside his window, and Andrei watched her for a long time in the dim candlelight, feeling neither love nor hatred, only a strange, hollow distance.",
                        "لیزا، خسته و شکست‌خورده، بالاخره روی صندلی کنار پنجره‌ی او به خواب رفت، و آندری مدت طولانی در نور کم‌رنگ شمع نگاهش کرد، نه عشق احساس می‌کرد نه نفرت، فقط فاصله‌ای عجیب و توخالی."
                    ),
                    StoryParagraph(
                        "The next morning, before dawn, he went to find his father, old Prince Nikolai Bolkonsky, who lived in a separate wing of the house and who was known throughout the region for his fierce pride and his uncompromising character.",
                        "صبح روز بعد، پیش از سپیده‌دم، به دنبال پدرش رفت، شاهزاده نیکلای بولکونسکی پیر، که در بالی جداگانه از خانه زندگی می‌کرد و در سراسر منطقه به غرور شدید و شخصیت سازش‌ناپذیرش شناخته می‌شد."
                    ),
                    StoryParagraph(
                        "The old prince had served under Catherine the Great, had been exiled to the countryside for his stubbornness, and had never forgiven the world for the honors he believed he had been denied.",
                        "شاهزاده‌ی پیر در دوران کاترین کبیر خدمت کرده بود، به خاطر سرسختی‌اش به روستا تبعید شده بود و هرگز دنیا را برای افتخاراتی که باور داشت از او دریغ شده نبخشیده بود."
                    ),
                    StoryParagraph(
                        "He was sitting in his study, surrounded by maps and books and military papers, when Andrei entered, and he looked up at his son with sharp, clever eyes that missed nothing.",
                        "وقتی آندری وارد شد، او در دفترش نشسته بود، احاطه‌شده با نقشه‌ها و کتاب‌ها و کاغذهای نظامی، و با چشمانی تیز و زیرک که هیچ چیز را از دست نمی‌دادند به پسرش نگاه کرد."
                    ),
                    StoryParagraph(
                        "Without wasting words, Andrei told his father that he intended to join the army and go to the front, and then he stood silently, waiting for the old man's response.",
                        "آندری بدون هدر دادن کلمات به پدرش گفت که قصد دارد به ارتش بپیوندد و به جبهه برود، و بعد ساکت ایستاد و منتظر پاسخ پیرمرد ماند."
                    ),
                    StoryParagraph(
                        "For a long moment, the old prince said nothing; he simply studied his son's face with the careful attention of a man who had spent his whole life judging other men.",
                        "لحظه‌ای طولانی، شاهزاده‌ی پیر چیزی نگفت؛ فقط با دقت مردی که تمام عمرش را صرف قضاوت دیگران کرده بود، چهره‌ی پسرش را بررسی کرد."
                    ),
                    StoryParagraph(
                        "Then, slowly, he nodded, and in his harsh, gravelly voice, he said the words that Andrei had been hoping to hear and dreading at the same time.",
                        "سپس، آهسته، سر تکان داد و با صدای خشن و گرفته‌اش کلماتی را گفت که آندری در همان زمان هم امید شنیدنشان را داشت و هم از شنیدنشان می‌ترسید."
                    ),
                    StoryParagraph(
                        "If you must go, he said, then go, and do not come back until you have made a name for yourself that no one can ever take away from you, because I will not have a son who is only a shadow of his father.",
                        "او گفت: اگر باید بروی، برو، و تا نامی برای خودت نساخته‌ای که هیچ‌کس هرگز نتواند از تو بگیرد، برنگرد، چون من پسری را که فقط سایه‌ی پدرش باشد تحمل نمی‌کنم."
                    ),
                    StoryParagraph(
                        "Andrei bowed his head in respect, and something in his chest tightened, because he knew that this was as close to love as his father would ever come.",
                        "آندری از احترام سر خم کرد و چیزی در سینه‌اش فشرده شد، چون می‌دانست که این نزدیک‌ترین چیزی است که پدرش هرگز به عشق خواهد رسید."
                    ),
                    StoryParagraph(
                        "The old prince then turned back to his papers, but before Andrei could leave the room, he spoke once more, without looking up.",
                        "شاهزاده‌ی پیر سپس به کاغذهایش برگشت، اما پیش از آنکه آندری از اتاق بیرون برود، یک بار دیگر، بدون آنکه سر بلند کند، حرف زد."
                    ),
                    StoryParagraph(
                        "Take care of your wife while you are still here, he said quietly, because she is carrying your child, and a man who cannot look after his own family has no business defending his country.",
                        "او آرام گفت: تا وقتی اینجایی، مراقب همسرت باش، چون بچه‌ی تو را حمل می‌کند، و مردی که نمی‌تواند از خانواده‌ی خودش مراقبت کند، حق ندارد از کشورش دفاع کند."
                    ),
                    StoryParagraph(
                        "Those words struck Andrei harder than any speech about glory ever could, and he left his father's study with a new weight pressing on his heart, a weight that he would carry with him all the way to the battlefield.",
                        "این کلمات بیش از هر سخنرانی‌ای درباره افتخار به آندری ضربه زد، و او دفتر پدرش را با وزنی جدید روی قلبش ترک کرد، وزنی که تا میدان نبرد با خود حمل می‌کرد."
                    ),
                    StoryParagraph(
                        "In the days that followed, the household was busy with preparations; servants packed trunks, tailors fitted uniforms, and letters were written to relatives and friends announcing the news.",
                        "در روزهای بعد، خانه درگیر آماده‌سازی بود؛ خدمتکاران صندوق‌ها را می‌بستند، خیاط‌ها یونیفرم را اندازه می‌کردند و نامه‌هایی برای بستگان و دوستان نوشته می‌شد تا خبر را اعلام کنند."
                    ),
                    StoryParagraph(
                        "Marya, though she wept quietly in her room each night, never once tried to change her brother's mind, because she understood him better than anyone else, and she knew that his decision came from something deeper than pride.",
                        "ماریا، هرچند هر شب بی‌صدا در اتاقش گریه می‌کرد، حتی یک بار هم تلاش نکرد نظر برادرش را عوض کند، چون او را بهتر از هر کس دیگری می‌فهمید و می‌دانست تصمیمش از چیزی عمیق‌تر از غرور می‌آید."
                    ),
                    StoryParagraph(
                        "The night before his departure, she came to his room carrying a small silver icon of Christ, an old family treasure that had been passed down through generations of the Bolkonsky family.",
                        "شب پیش از رفتنش، در حالی که شمایل کوچک نقره‌ای مسیح را با خود داشت، به اتاقش آمد؛ گنجینه‌ای خانوادگی و قدیمی که نسل‌های خانواده‌ی بولکونسکی آن را دست‌به‌دست داده بودند."
                    ),
                    StoryParagraph(
                        "She hung it around his neck with trembling hands, and she whispered a prayer for his safety, and for a moment, Andrei allowed himself to hold her close and to feel, for once, the warmth of uncomplicated love.",
                        "او با دستانی لرزان آن را به گردنش آویخت و برای امنیتش دعایی زمزمه کرد، و برای لحظه‌ای، آندری اجازه داد او را محکم در آغوش بگیرد و برای یک بار هم که شده، گرمای عشقی بی‌پیچیدگی را حس کند."
                    ),
                    StoryParagraph(
                        "On the day of his departure, the whole household gathered in the front courtyard; the sky was grey, the air was cold, and everyone was silent, because no one knew what to say.",
                        "روز رفتنش، تمام اهل خانه در حیاط جلویی جمع شدند؛ آسمان خاکستری بود، هوا سرد بود و همه ساکت بودند، چون هیچ‌کس نمی‌دانست چه بگوید."
                    ),
                    StoryParagraph(
                        "Lise clung to her husband's arm and wept without shame, and even old Prince Nikolai came out to see his son off, standing stiffly at the top of the steps with his hands clasped behind his back.",
                        "لیزا به بازوی شوهرش چنگ زد و بی‌شرم گریه کرد، و حتی شاهزاده نیکلای پیر هم برای بدرقه‌ی پسرش بیرون آمد و در بالای پله‌ها، با دست‌های قلاب‌شده در پشت، خشک ایستاد."
                    ),
                    StoryParagraph(
                        "Andrei kissed his wife's forehead, embraced his sister, and bowed once deeply to his father, and then, without another word, he climbed into the waiting carriage.",
                        "آندری پیشانی همسرش را بوسید، خواهرش را در آغوش گرفت و یک بار عمیقاً به پدرش سر تعظیم فرود آورد، و سپس، بدون کلمه‌ی دیگری، سوار کالسکه‌ی منتظر شد."
                    ),
                    StoryParagraph(
                        "As the horses began to move, Lise suddenly cried out and fainted, and Marya and the servants rushed to her side, but Andrei did not turn back, because he knew that if he did, he might never find the strength to leave again.",
                        "وقتی اسب‌ها راه افتادند، لیزا ناگهان فریاد کشید و غش کرد، و ماریا و خدمتکاران به طرفش شتافتند، اما آندری برنگشت، چون می‌دانست اگر برگردد، ممکن است هرگز قدرت رفتن دوباره را پیدا نکند."
                    ),
                    StoryParagraph(
                        "The carriage rolled through the gates and onto the long road that led west, towards the army, towards the war, towards everything that Andrei had convinced himself he was meant to find.",
                        "کالسکه از دروازه‌ها گذشت و به جاده‌ی طولانی‌ای رسید که به سمت غرب می‌رفت، به سوی ارتش، به سوی جنگ، به سوی هر چیزی که آندری خودش را متقاعد کرده بود برای یافتنش آفریده شده است."
                    ),
                    StoryParagraph(
                        "Behind him, the great house of the Bolkonskys slowly shrank into the distance, and the grey morning swallowed it up, and with it, all the small comforts and quiet cruelties of the life he had known.",
                        "پشت سرش، عمارت بزرگ بولکونسکی‌ها آهسته در دوردست کوچک شد و صبح خاکستری آن را بلعید، و با آن، همه‌ی آسایش‌های کوچک و قساوت‌های آرام زندگی‌ای که می‌شناخت."
                    ),
                    StoryParagraph(
                        "What awaited him on the road ahead, he did not know; perhaps glory, perhaps death, perhaps only the bitter discovery that war was not the noble and beautiful thing he had imagined in his dreams.",
                        "آنچه در جاده‌ی پیش‌رو در انتظارش بود را نمی‌دانست؛ شاید افتخار، شاید مرگ، شاید فقط کشف تلخ اینکه جنگ آن چیز نجیب و زیبایی نبود که در رؤیاهایش تصور کرده بود."
                    ),
                    StoryParagraph(
                        "But whatever the future held, he was moving now, and that alone was enough for him; movement was life, and stillness was death, and Prince Andrei Bolkonsky had chosen to live.",
                        "اما هر چه آینده در بر داشت، حالا در حرکت بود، و همین به‌تنهایی برایش کافی بود؛ حرکت زندگی بود و سکون مرگ، و شاهزاده آندری بولکونسکی زندگی را انتخاب کرده بود."
                    )
                )
            ),        StoryChapter(
            number = 3, title = "The Battle of Austerlitz", titlePersian = "نبرد آسترلیتز",
            paragraphs = listOf(
                StoryParagraph(
                    "In December 1805, the Russian and Austrian armies met Napoleon near the small town of Austerlitz, in a battle that would decide the fate of central Europe and the reputation of two great empires.",
                    "در دسامبر ۱۸۰۵، ارتش‌های روسیه و اتریش نزدیک شهر کوچک آسترلیتز با ناپلئون روبرو شدند، در نبردی که سرنوشت اروپای مرکزی و آوازه‌ی دو امپراتوری بزرگ را تعیین می‌کرد."
                ),
                StoryParagraph(
                    "For weeks, Prince Andrei had been travelling with the Russian army, and he had watched the officers and generals around him with growing disappointment and quiet anger.",
                    "هفته‌ها بود که شاهزاده آندری همراه ارتش روسیه سفر می‌کرد و افسران و ژنرال‌های اطرافش را با ناامیدی روزافزون و خشم آرام تماشا می‌کرد."
                ),
                StoryParagraph(
                    "Most of them were more interested in promotions, medals, and political intrigue than in the actual business of war, and their endless flattery and empty boasting disgusted him more than he could express.",
                    "اکثرشان بیشتر به ترفیع، مدال و دسیسه‌های سیاسی علاقه داشتند تا به خود کار جنگ، و چاپلوسی بی‌پایان و لاف‌زنی پوچشان او را بیش از آنچه می‌توانست بگوید منزجر می‌کرد."
                ),
                StoryParagraph(
                    "He had come here to find glory, to test himself against danger, to become a man whose name would be remembered, but so far he had found only confusion and vanity.",
                    "او آمده بود اینجا تا افتخار بیابد، خودش را در برابر خطر بیازماید، مردی شود که نامش به یاد بماند، اما تا این لحظه فقط آشفتگی و خودپسندی یافته بود."
                ),
                StoryParagraph(
                    "The Russian and Austrian commanders had decided on a plan that they believed would crush Napoleon once and for all, and they were confident of an easy victory against the smaller French army.",
                    "فرماندهان روسی و اتریشی نقشه‌ای طراحی کرده بودند که باور داشتند ناپلئون را برای همیشه نابود می‌کند، و به پیروزی آسانی علیه ارتش کوچک‌تر فرانسوی مطمئن بودند."
                ),
                StoryParagraph(
                    "Andrei, who had studied military strategy deeply, felt uneasy about their plan, and he suspected that Napoleon, who was famous for his cunning, might be planning something far cleverer than they imagined.",
                    "آندری که استراتژی نظامی را عمیقاً مطالعه کرده بود، از نقشه‌شان احساس نگرانی می‌کرد و گمان می‌برد ناپلئون که به زیرکی‌اش معروف بود، ممکن بود نقشه‌ای بسیار هوشمندانه‌تر از آنچه تصور می‌کردند بکشد."
                ),
                StoryParagraph(
                    "He tried to warn his superiors, but they dismissed his concerns as the nervousness of an inexperienced young officer who did not yet understand the realities of war.",
                    "او سعی کرد به مافوق‌هایش هشدار دهد، اما آن‌ها نگرانی‌هایش را به‌عنوان اضطراب افسر جوان بی‌تجربه‌ای که هنوز واقعیت‌های جنگ را نمی‌فهمد رد کردند."
                ),
                StoryParagraph(
                    "The night before the battle, Andrei could not sleep, and he stood at the window of his quarters, looking out at the dark, frozen countryside and imagining the glory that awaited him on the battlefield.",
                    "شب قبل از نبرد، آندری نمی‌توانست بخوابد و کنار پنجره‌ی اقامتگاهش ایستاد و به دشت تاریک و یخ‌زده نگاه کرد و افتخاری را که در میدان نبرد در انتظارش بود تصور کرد."
                ),
                StoryParagraph(
                    "In his mind, he saw himself seizing the flag of his regiment and leading a desperate charge, saving the army from disaster, and being celebrated as a hero whose name would live forever.",
                    "در ذهنش خود را می‌دید که پرچم هنگش را می‌قاپد و حمله‌ای ناامیدانه را رهبری می‌کند، ارتش را از فاجعه نجات می‌دهد و به‌عنوان قهرمانی جشن گرفته می‌شود که نامش تا ابد زنده می‌ماند."
                ),
                StoryParagraph(
                    "At dawn, the fighting began, and a thick fog covered the frozen fields, hiding the movements of the armies from one another and filling the air with an eerie, unnatural silence.",
                    "سپیده‌دم، نبرد آغاز شد و مه غلیظی دشت‌های یخ‌زده را پوشاند و حرکات ارتش‌ها را از یکدیگر پنهان کرد و هوا را با سکوتی عجیب و غیرطبیعی پر کرد."
                ),
                StoryParagraph(
                    "Then, suddenly, the French attacked, and they attacked exactly where the allied commanders had least expected them, breaking through the lines with terrifying speed and precision.",
                    "سپس، ناگهان، فرانسوی‌ها حمله کردند، و دقیقاً همان‌جا حمله کردند که فرماندهان متحد کمترین انتظارش را داشتند، و با سرعت و دقتی وحشتناک خطوط را شکستند."
                ),
                StoryParagraph(
                    "The allied army fell into chaos; regiments lost their officers, soldiers fled in every direction, and the carefully planned battle turned into a desperate, bloody retreat within hours.",
                    "ارتش متحد در آشفتگی فرو رفت؛ هنگ‌ها افسرانشان را از دست دادند، سربازان به هر سو فرار کردند و نبرد دقیقاً طراحی‌شده در عرض چند ساعت به عقب‌نشینی ناامیدانه و خونینی تبدیل شد."
                ),
                StoryParagraph(
                    "Andrei, riding with his regiment, watched the disaster unfold around him with horror and disbelief, and he understood in that moment that everything he had been told about the army's strength was a lie.",
                    "آندری که همراه هنگش سوار بود، با وحشت و ناباوری فاجعه را در اطرافش می‌دید، و در آن لحظه فهمید که هر چه درباره‌ی قدرت ارتش به او گفته بودند دروغی بیش نبود."
                ),
                StoryParagraph(
                    "When he saw the standard-bearer of his regiment fall, mortally wounded, Andrei seized the flag and rushed forward on foot, determined to lead the soldiers in one last, desperate charge.",
                    "وقتی دید پرچم‌دار هنگش زخم مرگبار خورد و افتاد، آندری پرچم را گرفت و پیاده به پیش دوید و مصمم بود سربازان را در یک حمله‌ی آخر و ناامیدانه رهبری کند."
                ),
                StoryParagraph(
                    "For a moment, the soldiers, inspired by his courage, followed him forward, and Andrei felt a wild, triumphant joy surge through his body, as if he had finally found the glory he had been seeking all along.",
                    "برای لحظه‌ای، سربازان که از شجاعتش الهام گرفته بودند، از او به پیش پیروی کردند، و آندری شادی وحشی و پیروزمندانه‌ای را در بدنش حس کرد، گویی بالاخره همان افتخاری را یافته بود که تمام مدت در جست‌وجویش بود."
                ),
                StoryParagraph(
                    "Then a bullet struck him, and everything went silent, and the world seemed to slow down to a strange, still dream in which nothing mattered anymore, neither glory nor honor nor any of the things men killed each other for.",
                    "سپس گلوله‌ای به او اصابت کرد و همه‌چیز ساکت شد، و دنیا به رؤیایی عجیب و ساکن آهسته شد که در آن دیگر هیچ چیز اهمیتی نداشت، نه افتخار، نه شرافت، نه هیچ‌کدام از چیزهایی که آدم‌ها برایشان یکدیگر را می‌کشتند."
                ),
                StoryParagraph(
                    "He fell to the ground and lay there on his back, staring up at the vast, empty sky above him, and for the first time in years, he felt completely and utterly peaceful.",
                    "او روی زمین افتاد و به پشت دراز کشید و به آسمان پهناور و خالی بالای سرش خیره شد، و برای اولین بار در سال‌ها، کاملاً و مطلقاً آرامش را حس کرد."
                ),
                StoryParagraph(
                    "How quiet, how peaceful, how unlike the way I always imagined glory, he thought, as the clouds drifted slowly across the grey sky above the frozen fields of Austerlitz.",
                    "او فکر کرد: چقدر آرام، چقدر صلح‌آمیز، چقدر برخلاف تصوری که همیشه از افتخار داشتم، در حالی که ابرها آهسته در آسمان خاکستری بالای دشت‌های یخ‌زده‌ی آسترلیتز شناور بودند."
                ),
                StoryParagraph(
                    "He thought of his wife Lise, whom he had left behind without kindness, and of his sister Marya, whose gentle face now seemed to him more beautiful than all the glory in the world.",
                    "به همسرش لیزا فکر کرد که بدون مهربانی رهایش کرده بود، و به خواهرش ماریا، که چهره‌ی مهربانش حالا از تمام افتخار دنیا زیباتر به نظرش می‌رسید."
                ),
                StoryParagraph(
                    "He thought of his father, whose harsh words had sent him here, and he wondered, with a strange detachment, whether the old man would be proud or disappointed when news of his death finally reached home.",
                    "به پدرش فکر کرد که کلمات خشنش او را به اینجا فرستاده بود، و با جداافتادگی عجیبی از خود پرسید که آیا پیرمرد وقتی خبر مرگش بالاخره به خانه برسد، افتخار می‌کند یا ناامید می‌شود."
                ),
                StoryParagraph(
                    "Then, through the drifting smoke and the grey afternoon light, a figure on horseback appeared above him, and Andrei slowly recognized the small, stocky man in the plain grey coat.",
                    "سپس، از میان دودهای شناور و نور خاکستری بعدازظهر، سوارکاری بالای سرش ظاهر شد، و آندری به‌آرامی مرد کوچک‌اندام و تنومند با پالتوی خاکستری ساده را شناخت."
                ),
                StoryParagraph(
                    "It was Napoleon himself, riding slowly across the battlefield, inspecting the dead and wounded with the calm curiosity of a man who had seen such scenes a thousand times before.",
                    "خود ناپلئون بود که آهسته در میدان نبرد سوار می‌شد و با کنجکاوی آرام مردی که هزار بار پیش چنین صحنه‌هایی را دیده بود، کشته‌ها و زخمی‌ها را بررسی می‌کرد."
                ),
                StoryParagraph(
                    "The Emperor stopped his horse beside Andrei and looked down at him for a long moment, and then, turning to one of his officers, he said calmly that this was a noble death.",
                    "امپراتور اسبش را کنار آندری نگه داشت و لحظه‌ای طولانی به او نگاه کرد، و سپس، رو به یکی از افسرانش کرد و آرام گفت که این مرگی نجیبانه است."
                ),
                StoryParagraph(
                    "But Andrei was still alive, and in that moment, as he stared up at the man he had once admired as the greatest genius of the age, his view of greatness changed forever.",
                    "اما آندری هنوز زنده بود، و در آن لحظه، همانطور که به مردی خیره می‌شد که زمانی او را بزرگ‌ترین نابغه‌ی عصر می‌دانست، دیدگاهش نسبت به بزرگی برای همیشه تغییر کرد."
                ),
                StoryParagraph(
                    "He realized, with a clarity that pierced through his pain, that Napoleon, the conqueror of Europe, the man whose name made kings tremble, was nothing but a small, insignificant man.",
                    "او با وضوحی که از دردش نفوذ می‌کرد، دریافت که ناپلئون، فاتح اروپا، مردی که نامش پادشاهان را می‌لرزاند، چیزی جز مردی کوچک و بی‌اهمیت نبود."
                ),
                StoryParagraph(
                    "In that moment, he saw the true smallness of all earthly fame, and he understood, at last, that the only things that mattered were love, kindness, and the quiet beauty of ordinary life.",
                    "در آن لحظه، کوچکی واقعی تمام شهرت زمینی را دید، و بالاخره فهمید که تنها چیزهایی که اهمیت داشتند عشق، مهربانی و زیبایی آرام زندگی معمولی بودند."
                ),
                StoryParagraph(
                    "Later, after the French had moved on, soldiers from his own regiment found Andrei on the field, barely alive, and carried him to a nearby hospital, where doctors struggled for hours to save his life.",
                    "بعدها، پس از آنکه فرانسوی‌ها گذشتند، سربازانی از هنگ خودش آندری را در میدان یافتند، به‌سختی زنده، و او را به بیمارستانی نزدیک بردند، جایی که پزشکان ساعت‌ها برای نجات جانش تلاش کردند."
                ),
                StoryParagraph(
                    "He survived the operation, but he was weak and feverish, and for many days he drifted in and out of consciousness, dreaming strange dreams about the sky and the clouds and a girl singing somewhere far away.",
                    "او از عمل جان به‌در برد، اما ضعیف و تب‌دار بود و روزهای بسیاری میان هشیاری و بی‌هشیاری شناور بود و رؤیاهای عجیب می‌دید؛ درباره‌ی آسمان و ابرها و دختری که جایی دور آواز می‌خواند."
                ),
                StoryParagraph(
                    "When he finally woke, clear-headed at last, he knew that the man who had left for this war was not the same man who would return from it, and that the life he had once known could never be rebuilt on the old foundations.",
                    "وقتی بالاخره بیدار شد، بالاخره هشیار، دانست که مردی که به این جنگ آمده بود همان مردی نبود که از آن بازمی‌گشت، و زندگی‌ای که زمانی می‌شناخت دیگر هرگز بر پایه‌های قدیمی بازسازی نمی‌شد."
                ),
                StoryParagraph(
                    "The hero he had dreamed of becoming had died in the mud of Austerlitz, and in his place, slowly, painfully, a new man was beginning to be born.",
                    "قهرمانی که آرزوی شدنش را داشت، در گل و لای آسترلیتز مرده بود و به‌جای او، آهسته و دردناک، مردی جدید شروع به متولد شدن کرده بود."
                ),
                StoryParagraph(
                    "What that new man would become, Andrei did not yet know, but he knew that whatever it was, it would be honest, and it would be built not on glory, but on truth.",
                    "آن مرد جدید چه می‌شد را آندری هنوز نمی‌دانست، اما می‌دانست که هر چه باشد، صادقانه خواهد بود، و نه بر افتخار، بلکه بر حقیقت بنا خواهد شد."
                ),
                StoryParagraph(
                    "As winter slowly gave way to spring, he began to recover, and he began to plan his return home, no longer as the proud young officer who had left, but as a man who had been broken and was now slowly, carefully putting himself back together.",
                    "وقتی زمستان آهسته جای خود را به بهار داد، او شروع به بهبودی کرد و شروع کرد به برنامه‌ریزی برای بازگشت به خانه، دیگر نه به‌عنوان افسر جوان مغروری که رفته بود، بلکه به‌عنوان مردی که شکسته شده و حالا آهسته و بادقت خودش را دوباره می‌ساخت."
                )
            )
        ),
        StoryChapter(
            number = 4, title = "War, Love, and Redemption", titlePersian = "جنگ، عشق و رستگاری",
            paragraphs = listOf(
                StoryParagraph(
                    "While Andrei was slowly recovering from his wounds in a distant hospital, his old friend Pierre Bezukhov was living through his own storms in Moscow, and discovering, in pain, the truths he had long avoided.",
                    "در حالی که آندری آهسته در بیمارستانی دور از زخم‌هایش بهبود می‌یافت، دوست قدیمی‌اش پیر بزوخوف در مسکو طوفان‌های خودش را می‌گذراند و دردمندانه حقیقت‌هایی را کشف می‌کرد که مدت‌ها از آن‌ها گریخته بود."
                ),
                StoryParagraph(
                    "After the death of his father, Pierre had unexpectedly inherited an enormous fortune and the title of Count, and overnight, everyone who had once ignored him suddenly wanted to be his closest friend.",
                    "پس از مرگ پدرش، پیر به‌طور غیرمنتظره‌ای ثروتی عظیم و عنوان کنت را به ارث برده بود و یک‌شبه، هر کس که زمانی نادیده‌اش می‌گرفت، ناگهان می‌خواست نزدیک‌ترین دوستش باشد."
                ),
                StoryParagraph(
                    "The beautiful Princess Helene Kuragina, whose father Prince Vasily had been scheming to marry her into a rich family, set her sights on Pierre, and her cold charm and her family's manipulations swept him into a marriage he never truly wanted.",
                    "شاهزاده‌خانم زیبای هلن کوراگینا، که پدرش شاهزاده واسیلی نقشه‌ی ازدواج او با خانواده‌ای ثروتمند را می‌کشید، پیر را هدف گرفت، و جذابیت سردش و دسیسه‌های خانواده‌اش او را به ازدواجی راندند که هرگز واقعاً نمی‌خواست."
                ),
                StoryParagraph(
                    "Within a few months of their wedding, Pierre discovered, from gossip and then from his own eyes, that his wife was having an affair with a young officer named Dolokhov, a reckless man who seemed to take pleasure in humiliating him.",
                    "چند ماه پس از ازدواجشان، پیر از شایعات و سپس با چشمان خودش کشف کرد که همسرش با افسری جوان به نام دولوخوف رابطه دارد، مردی بی‌پروا که به نظر می‌رسید از تحقیر او لذت می‌برد."
                ),
                StoryParagraph(
                    "At a public dinner party, Dolokhov openly mocked Pierre in front of everyone, and Pierre, unable to control his rage, challenged him to a duel, something he had never dreamed of doing in his entire life.",
                    "در مهمانی شامی علنی، دولوخوف آشکارا پیر را در برابر همه مسخره کرد، و پیر که نمی‌توانست خشمش را کنترل کند، او را به دوئل دعوت کرد، کاری که در تمام عمرش هرگز خوابش را هم ندیده بود."
                ),
                StoryParagraph(
                    "The duel took place the next morning in a snowy field outside the city, and Pierre, who had never fired a pistol before, somehow managed to wound Dolokhov, leaving him bleeding in the snow.",
                    "دوئل صبح روز بعد در دشتی برفی بیرون شهر برگزار شد، و پیر که قبلاً هرگز با تپانچه شلیک نکرده بود، به‌نحوی توانست دولوخوف را زخمی کند و او را در برف خونین رها کند."
                ),
                StoryParagraph(
                    "Standing over the wounded man, Pierre felt no triumph, only horror at what he had done, and in that moment, he realized that the society he had once admired was built on lies, vanity, and casual cruelty.",
                    "پیر که بالای سر مرد زخمی ایستاده بود، هیچ پیروزی حس نکرد، فقط وحشت از کاری که کرده بود، و در آن لحظه دریافت که جامعه‌ای که زمانی تحسینش می‌کرد بر پایه‌ی دروغ، خودپسندی و قساوت روزمره بنا شده بود."
                ),
                StoryParagraph(
                    "He left Helene that same week and travelled alone to St. Petersburg, searching desperately for some meaning in life that would be greater and truer than the empty pleasures of wealth and society.",
                    "او همان هفته هلن را ترک کرد و تنها به سن‌پترزبورگ سفر کرد و ناامیدانه در جست‌وجوی معنایی در زندگی بود که بزرگ‌تر و حقیقی‌تر از لذت‌های پوچ ثروت و جامعه باشد."
                ),
                StoryParagraph(
                    "At a post station on the road, he met an old man named Bazdeev, a well-known Freemason, who spoke to him with quiet wisdom about the brotherhood of all men, the search for inner peace, and the duty to help others.",
                    "در ایستگاهی در راه، پیرمردی به نام بازدیف آشنا شد، فراماسونی مشهور، که با حکمت آرامی با او درباره‌ی برادری همه‌ی انسان‌ها، جست‌وجوی آرامش درونی و وظیفه‌ی کمک به دیگران سخن گفت."
                ),
                StoryParagraph(
                    "The old man's words touched something deep and long-buried inside Pierre, and for the first time since childhood, he began to hope that his life might still have a purpose worth living for.",
                    "کلمات آن پیرمرد چیزی عمیق و مدفون در درون پیر را لمس کرد، و برای اولین بار از کودکی، او شروع کرد به امیدواری که زندگی‌اش ممکن است هنوز هدفی داشته باشد که ارزش زیستن داشته باشد."
                ),
                StoryParagraph(
                    "He joined the Freemasons and threw himself into their rituals and charitable works with all the passion of a man desperate to believe in something, and he returned to his estates determined to improve the lives of his peasants.",
                    "او به فراماسون‌ها پیوست و با تمام شور مردی که ناامیدانه می‌خواست به چیزی ایمان بیاورد، خود را در آیین‌ها و کارهای خیرخواهانه‌شان غرق کرد، و با عزمی راسخ برای بهبود زندگی رعایایش به املاکش بازگشت."
                ),
                StoryParagraph(
                    "But the peasants, who had suffered for generations under cruel lords, did not trust his kindness, and they refused most of his reforms, and Pierre slowly realized that doing good was not as simple as he had believed.",
                    "اما رعایا، که نسل‌ها زیر ظلم اربابان بی‌رحم رنج برده بودند، به مهربانی‌اش اعتماد نکردند و اکثر اصلاحاتش را رد کردند، و پیر آهسته دریافت که نیکی کردن آن‌قدر که باور داشت ساده نیست."
                ),
                StoryParagraph(
                    "Still, he continued his search, and in the years that followed, he travelled, he read, he questioned everything, and he slowly began to understand that peace of mind was not a thing to be found, but a thing to be built.",
                    "با این حال، به جست‌وجویش ادامه داد، و در سال‌های بعد، سفر کرد، خواند، همه چیز را زیر سؤال برد، و آهسته شروع کرد به فهمیدن اینکه آرامش ذهن چیزی نیست که یافته شود، بلکه چیزی است که باید ساخته شود."
                ),
                StoryParagraph(
                    "It was during this time that he began to spend more evenings with the Rostov family, one of the oldest and warmest noble families in Moscow, whose home was always full of laughter, music, and life.",
                    "در همین زمان بود که او شروع کرد به گذراندن شب‌های بیشتری با خانواده‌ی روستوف، یکی از قدیمی‌ترین و گرم‌ترین خانواده‌های اصیل مسکو، که خانه‌اش همیشه پر از خنده، موسیقی و زندگی بود."
                ),
                StoryParagraph(
                    "The youngest daughter of the family, Natasha Rostova, was a girl of seventeen, beautiful, lively, and full of song, and Pierre, though many years older than her, found himself more and more drawn to her brightness.",
                    "کوچک‌ترین دختر خانواده، ناتاشا روستوا، دختری هفده‌ساله، زیبا، سرزنده و پر از آواز بود، و پیر، هرچند سال‌ها از او بزرگ‌تر بود، خود را بیشتر و بیشتر کشیده به درخشندگی‌اش می‌یافت."
                ),
                StoryParagraph(
                    "When Prince Andrei returned from the war, still grieving and still searching for a reason to live, he met Natasha at a ball in St. Petersburg, and in that single evening, something in him woke up from a long and terrible sleep.",
                    "وقتی شاهزاده آندری از جنگ بازگشت، هنوز غمگین و هنوز در جست‌وجوی دلیلی برای زندگی، در رقصی در سن‌پترزبورگ با ناتاشا آشنا شد، و در همان یک شب، چیزی در او از خوابی طولانی و هولناک بیدار شد."
                ),
                StoryParagraph(
                    "They fell in love, and though his family objected because of her youth, they became engaged, agreeing to wait a year before the wedding, as old Prince Nikolai had insisted.",
                    "آن‌ها عاشق شدند و هرچند خانواده‌اش به دلیل جوانی او مخالفت کردند، نامزد کردند و توافق کردند، همان‌طور که شاهزاده نیکلای پیر اصرار داشت، یک سال پیش از ازدواج صبر کنند."
                ),
                StoryParagraph(
                    "Andrei then went abroad for his health, leaving Natasha behind in Moscow, and during his absence, lonely and unsure of herself, she was seduced by the handsome and reckless Anatole Kuragin, Helene's brother.",
                    "آندری سپس برای سلامتی‌اش به خارج رفت و ناتاشا را در مسکو رها کرد، و در غیابش، او که تنها و مردد بود، توسط آناتول کوراگین زیبا و بی‌پروا، برادر هلن، فریب خورد."
                ),
                StoryParagraph(
                    "Anatole promised to elope with her, and Natasha, blinded by his charm, broke off her engagement with Andrei in a letter that wounded him more deeply than any wound he had ever received in battle.",
                    "آناتول قول فرار با او را داد، و ناتاشا که از جذابیتش کور شده بود، نامزدی‌اش را با آندری در نامه‌ای به هم زد؛ نامه‌ای که او را عمیق‌تر از هر زخمی که در نبرد خورده بود زخمی کرد."
                ),
                StoryParagraph(
                    "The elopement was discovered at the last moment, and Pierre, who had learned of the whole affair, confronted Anatole and forced him to leave Moscow forever, but the damage had already been done.",
                    "فرار در آخرین لحظه کشف شد، و پیر که از کل ماجرا باخبر شده بود، آناتول را تحت فشار گذاشت و مجبورش کرد برای همیشه مسکو را ترک کند، اما آسیب از قبل وارد شده بود."
                ),
                StoryParagraph(
                    "When Natasha realized how she had been used, she fell into a deep despair and became seriously ill, and Pierre, visiting her during her illness, realized with great surprise that he himself had fallen in love with her.",
                    "وقتی ناتاشا فهمید چطور از او استفاده شده، در ناامیدی عمیقی فرو رفت و به‌شدت بیمار شد، و پیر که در طول بیماری‌اش به دیدنش می‌رفت، با تعجب بسیار دریافت که خودش عاشق او شده است."
                ),
                StoryParagraph(
                    "But he said nothing, because he was still married to Helene and because Natasha was still suffering, and so he buried his love deep inside him and continued to care for her like a brother.",
                    "اما چیزی نگفت، چون هنوز با هلن ازدواج کرده بود و چون ناتاشا هنوز در رنج بود، و بنابراین عشقش را عمیقاً در درونش دفن کرد و مثل یک برادر از او مراقبت کرد."
                ),
                StoryParagraph(
                    "In June of 1812, Napoleon invaded Russia with an army of more than half a million men, and the long, terrible war that had been threatening for years finally arrived on Russian soil.",
                    "در ژوئن ۱۸۱۲، ناپلئون با ارتشى بیش از نیم میلیون نفر به روسیه حمله کرد، و جنگ طولانی و هولناکی که سال‌ها تهدید کرده بود بالاخره به خاک روسیه رسید."
                ),
                StoryParagraph(
                    "The Russian army retreated slowly, drawing the French deeper and deeper into the vast, unforgiving land, and Prince Andrei, though still broken-hearted, returned to the front to fight once more.",
                    "ارتش روسیه آهسته عقب‌نشینی می‌کرد و فرانسوی‌ها را عمیق‌تر و عمیق‌تر به سرزمین پهناور و بی‌رحم می‌کشاند، و شاهزاده آندری، هرچند هنوز دل‌شکسته، برای جنگیدن دوباره به جبهه بازگشت."
                ),
                StoryParagraph(
                    "Pierre, driven by a strange need to witness the truth of war with his own eyes, joined the army as a civilian observer and marched with the soldiers towards the great battle that was coming.",
                    "پیر، که نیازی عجیب به دیدن حقیقت جنگ با چشمان خودش او را می‌راند، به‌عنوان ناظری غیرنظامی به ارتش پیوست و همراه سربازان به سمت نبرد بزرگی که در راه بود راهپیمایی کرد."
                ),
                StoryParagraph(
                    "On the seventh of September, the two old friends met briefly before the Battle of Borodino, and in that short meeting, they exchanged words that neither of them would ever forget.",
                    "در هفتم سپتامبر، این دو دوست قدیمی پیش از نبرد بورودینو برای لحظه‌ای همدیگر را دیدند، و در آن ملاقات کوتاه، کلماتی ردوبدل کردند که هیچ‌کدام هرگز فراموش نمی‌کرد."
                ),
                StoryParagraph(
                    "Andrei told Pierre that he had forgiven Natasha, and that he had come to understand, after everything, that loving and suffering were inseparable, and that perhaps that was what it meant to be alive.",
                    "آندری به پیر گفت که ناتاشا را بخشیده، و بعد از همه چیز فهمیده که دوست داشتن و رنج کشیدن جدانشدنی‌اند، و شاید همین معنای زنده بودن باشد."
                ),
                StoryParagraph(
                    "The Battle of Borodino raged for a full day, and tens of thousands of soldiers fell on both sides, and when the sun set, neither army could claim a clear victory.",
                    "نبرد بورودینو یک روز کامل به‌طول انجامید، و ده‌ها هزار سرباز از هر دو طرف افتادند، و وقتی خورشید غروب کرد، هیچ‌کدام از دو ارتش نمی‌توانست پیروزی روشنی ادعا کند."
                ),
                StoryParagraph(
                    "Prince Andrei was mortally wounded by a shell and carried to a field hospital, and in the bed beside him lay a wounded man he slowly recognized as Anatole Kuragin, the very man who had betrayed Natasha.",
                    "شاهزاده آندری با گلوله‌ی خمپاره‌ای زخم مرگبار خورد و به بیمارستان صحرایی برده شد، و در تخت کنارش مردی زخمی دراز کشیده بود که به‌آرامی شناختش: آناتول کوراگین، همان مردی که به ناتاشا خیانت کرده بود."
                ),
                StoryParagraph(
                    "Seeing his enemy suffering, Andrei felt something break inside him, and all the hatred and desire for revenge that he had carried for so long dissolved into a strange, unexpected pity.",
                    "آندری با دیدن رنج دشمنش، احساس کرد چیزی در درونش شکست، و همه‌ی نفرت و میل به انتقامى که مدت‌ها حمل کرده بود در ترحمی عجیب و غیرمنتظره حل شد."
                ),
                StoryParagraph(
                    "He forgave Anatole in his heart, and in that forgiveness, he found a peace he had never known before, a peace that was deeper and truer than anything he had ever found in glory or in pride.",
                    "او در قلبش آناتول را بخشید، و در آن بخشش، آرامشی یافت که هرگز پیش‌تر نمی‌شناخت، آرامشی که عمیق‌تر و حقیقی‌تر از هر چیزی بود که تا حالا در افتخار یا غرور یافته بود."
                ),
                StoryParagraph(
                    "While being moved to Moscow with other wounded soldiers, Andrei was placed in the same convoy as the Rostov family, who were fleeing the advancing French army.",
                    "هنگام انتقال به مسکو همراه سایر سربازان زخمی، آندری در همان کاروانی قرار گرفت که خانواده‌ی روستوف در آن بودند، که از ارتش پیشروی فرانسوی‌ها فرار می‌کردند."
                ),
                StoryParagraph(
                    "Natasha, learning of his condition, insisted on caring for him herself, and in those final days, she stayed by his side day and night, asking for nothing, expecting nothing, only loving him.",
                    "ناتاشا که از وضعیتش باخبر شد، اصرار کرد خودش از او مراقبت کند، و در آن روزهای آخر، شبانه‌روز کنارش ماند، چیزی نخواست، انتظاری نداشت، فقط دوستش داشت."
                ),
                StoryParagraph(
                    "In those last days together, they forgave each other completely, and they found, in the simple act of being together, a happiness that had nothing to do with the world outside.",
                    "در آن روزهای آخر با هم، کاملاً یکدیگر را بخشیدند، و در عمل ساده‌ی با هم بودن، شادی‌ای یافتند که هیچ ربطی به دنیای بیرون نداشت."
                ),
                StoryParagraph(
                    "Prince Andrei Bolkonsky died peacefully in Natasha's arms, and she wept for him as if her own soul had departed from her body, and in a way, a part of her did.",
                    "شاهزاده آندری بولکونسکی در آغوش ناتاشا آرام مرد، و او چنان برایش گریست که گویی روح خودش از بدنش رفته بود، و به نوعی، بخشی از او واقعاً رفت."
                ),
                StoryParagraph(
                    "Meanwhile, Pierre had stayed in Moscow, disguised as a peasant, planning to assassinate Napoleon himself, but he was captured by French soldiers and taken prisoner before he could act.",
                    "در همین حال، پیر در مسکو مانده بود، با لباس دهقانی، و نقشه‌ی ترور خود ناپلئون را می‌کشید، اما پیش از آنکه بتواند عمل کند، سربازان فرانسوی او را اسیر کردند و به اسارت بردند."
                ),
                StoryParagraph(
                    "In prison, he met a simple peasant named Platon Karataev, a man with no education and no wealth, but with a deep and simple wisdom that Pierre had never encountered in any book or any salon.",
                    "در زندان، با دهقانی ساده به نام پلاتون کاراتایف آشنا شد، مردی بی‌سواد و بی‌ثروت، اما با حکمتی عمیق و ساده که پیر در هیچ کتابی و هیچ مجلسی ندیده بود."
                ),
                StoryParagraph(
                    "From Platon, Pierre learned that true happiness lies not in wealth or glory or the admiration of others, but in simple love, in kindness to every living creature, and in accepting each day as a gift.",
                    "پیر از پلاتون آموخت که خوشبختی واقعی نه در ثروت و افتخار و تحسین دیگران است، بلکه در عشق ساده، در مهربانی با هر موجود زنده، و در پذیرفتن هر روز به‌عنوان هدیه‌ای است."
                ),
                StoryParagraph(
                    "When Platon was killed by French soldiers, Pierre was devastated, but he carried the peasant's wisdom in his heart for the rest of his life, and it saved him more than once in the dark years that followed.",
                    "وقتی پلاتون توسط سربازان فرانسوی کشته شد، پیر ویران شد، اما حکمت آن دهقان را تا آخر عمر در قلبش حمل کرد، و آن حکمت بیش از یک بار او را در سال‌های تاریک بعدی نجات داد."
                ),
                StoryParagraph(
                    "After the war finally ended and Helene had died of an illness, Pierre was finally free, and he went to find Natasha, who was still mourning the death of Andrei and slowly recovering from her own grief.",
                    "پس از آنکه جنگ بالاخره تمام شد و هلن از بیماری مرده بود، پیر بالاخره آزاد بود و به دنبال ناتاشا رفت، که هنوز در سوگ مرگ آندری بود و آهسته از غم خودش بهبود می‌یافت."
                ),
                StoryParagraph(
                    "He told her that he loved her, and that he had loved her for years, and she, in her quiet and shattered way, admitted that she too had begun to love him, though she had not known it herself.",
                    "او به او گفت که دوستش دارد و سال‌هاست که دوستش دارد، و او، به شیوه‌ی آرام و شکسته‌اش، اعتراف کرد که او هم شروع به دوست داشتنش کرده، هرچند خودش نمی‌دانست."
                ),
                StoryParagraph(
                    "They were married a few months later, and they built, slowly and patiently, a life together that was not glamorous or exciting, but was real, and warm, and full of love.",
                    "چند ماه بعد ازدواج کردند، و آهسته و صبورانه، زندگی‌ای با هم ساختند که پرزرق‌وبرق و هیجان‌انگیز نبود، اما واقعی بود، و گرم، و پر از عشق."
                ),
                StoryParagraph(
                    "Pierre became involved in secret political societies, dreaming of a better Russia, and Natasha supported him in everything, though she worried about the dangers he was taking on.",
                    "پیر در انجمن‌های سیاسی مخفی درگیر شد و رؤیای روسیه‌ای بهتر را در سر می‌پروراند، و ناتاشا در همه چیز حمایتش کرد، هرچند نگران خطرهایی بود که به جان می‌خرید."
                ),
                StoryParagraph(
                    "They had children, and as the years passed, Pierre came to understand that the meaning he had been searching for all his life had been with him all along, in the simple, ordinary joys of family and love.",
                    "صاحب فرزندانی شدند، و با گذشت سال‌ها، پیر دریافت که معنایی که تمام عمر در جست‌وجویش بود، تمام مدت با او بوده، در شادی‌های ساده و معمولی خانواده و عشق."
                ),
                StoryParagraph(
                    "In the end, War and Peace was not about war at all, or at least not only about war, but about the long, painful, beautiful process of learning how to live, how to love, and how to die with peace in one's heart.",
                    "در پایان، جنگ و صلح اصلاً درباره‌ی جنگ نبود، یا حداقل نه فقط درباره‌ی جنگ، بلکه درباره‌ی فرآیند طولانی، دردناک و زیبای یادگیری چگونگی زیستن، چگونگی عشق ورزیدن، و چگونگی مردن با آرامش در قلب بود."
                ),
                StoryParagraph(
                    "And in that sense, every human life, whether lived in palaces or in prisons, whether celebrated in history or forgotten by all, was a story of equal grandeur and equal worth.",
                    "و از این نظر، هر زندگی انسانی، چه در کاخ‌ها و چه در زندان‌ها گذرانده شده باشد، چه در تاریخ جشن گرفته شده یا توسط همه فراموش شده باشد، داستانی با عظمت برابر و ارزش برابر بود."
                ),
                StoryParagraph(
                    "This was the truth that Tolstoy wanted his readers to find, hidden beneath the battles and the balls, the duels and the dancing, the laughter and the tears of his enormous, magnificent story.",
                    "این همان حقیقتی بود که تولستوی می‌خواست خوانندگانش آن را بیابند، پنهان در زیر نبردها و رقص‌ها، دوئل‌ها و پایکوبی‌ها، خنده‌ها و اشک‌های داستان عظیم و باشکوهش."
                )
            )
        )
    )
),// ─────────────── ۳۲: جنایت و مکافات ───────────────
private fun story32() = StoryContent(
    storyId = "int_crime_and_punishment",
    chapters = listOf(
        StoryChapter(
            number = 1, title = "The Poor Student", titlePersian = "دانشجوی فقیر",
            paragraphs = listOf(
                StoryParagraph(
                    "In a narrow, dirty street in one of the poorest quarters of St. Petersburg, a young former student named Rodion Raskolnikov lived in a tiny attic room that he could barely afford to rent.",
                    "در خیابانی باریک و کثیف در یکی از فقیرترین محله‌های سن‌پترزبورگ، دانشجوی جوان سابقی به نام رودیون راسکولنیکوف در اتاق زیرشیروانی کوچکی زندگی می‌کرد که به‌سختی می‌توانست اجاره‌اش را بپردازد."
                ),
                StoryParagraph(
                    "The room was so low that a tall man could not stand upright in it, and so cramped that it seemed more like a cupboard than a place for a human being to live.",
                    "اتاق آن‌قدر کوتاه بود که مردی بلندقد نمی‌توانست در آن راست بایستد، و آن‌قدر تنگ بود که بیشتر شبیه گنجه‌ای به نظر می‌رسید تا جایی برای زندگی یک انسان."
                ),
                StoryParagraph(
                    "Raskolnikov had once been a brilliant and promising law student, admired by his teachers and respected by his classmates for his sharp mind and his proud, independent spirit.",
                    "راسکولنیکوف زمانی دانشجوی حقوقی درخشان و امیدوار بود، که استادانش تحسینش می‌کردند و هم‌کلاسی‌هایش به خاطر ذهن تیزش و روح مغرور و مستقلی که داشت احترامش می‌گذاشتند."
                ),
                StoryParagraph(
                    "But poverty had slowly crushed him; he had been forced to abandon his studies, his clothes had become rags, and he had eaten almost nothing for two full days before the story began.",
                    "اما فقر آهسته او را خرد کرده بود؛ مجبور شده بود تحصیلش را رها کند، لباس‌هایش ژنده شده بود و پیش از آغاز داستان، تقریباً دو روز کامل هیچ نخورده بود."
                ),
                StoryParagraph(
                    "He owed money to his landlady, a mean and suspicious woman who had stopped bringing him meals and who now looked at him every day with silent, bitter reproach.",
                    "او به صاحب‌خانه‌اش بدهکار بود، زنی پست و مشکوک که دیگر برایش غذا نمی‌آورد و حالا هر روز با سرزنشی خاموش و تلخ به او نگاه می‌کرد."
                ),
                StoryParagraph(
                    "Raskolnikov had also stopped paying attention to his appearance; his hair was unkempt, his face was pale and thin, and there was a strange, feverish light in his eyes that frightened those who looked at him closely.",
                    "راسکولنیکوف هم توجه به ظاهرش را رها کرده بود؛ موهایش ژولیده بود، صورتش رنگ‌پریده و لاغر و نوری عجیب و تب‌آلود در چشمانش بود که هر کس دقیق نگاهش می‌کرد را می‌ترساند."
                ),
                StoryParagraph(
                    "Yet despite all this, he did not feel sorry for himself; on the contrary, he felt a deep, burning contempt for a world that allowed such suffering to exist in the first place.",
                    "با این حال، با وجود همه‌ی این‌ها، برای خودش احساس ترحم نمی‌کرد؛ برعکس، احساس تحقیری عمیق و سوزان نسبت به دنیایی داشت که اجازه می‌داد چنین رنجی از ابتدا وجود داشته باشد."
                ),
                StoryParagraph(
                    "For weeks, he had been avoiding people, wandering the streets of the city in silence, thinking thoughts that he did not dare to share with anyone, and slowly forming a plan that he knew was terrible.",
                    "هفته‌ها بود که از مردم پرهیز می‌کرد، در سکوت در خیابان‌های شهر پرسه می‌زد، افکاری می‌اندیشید که جرئت نمی‌کرد با کسی در میان بگذارد، و آهسته نقشه‌ای می‌کشید که می‌دانست هولناک است."
                ),
                StoryParagraph(
                    "One evening, shortly before sunset, he walked to the house of an old woman named Alyona Ivanovna, a pawnbroker known throughout the neighborhood for her cruelty and her greed.",
                    "یک شب، کمی پیش از غروب، به خانه‌ی پیرزنی به نام آلیونا ایوانوونا رفت، رباخواری که در سراسر محله به بی‌رحمی و طمعش شناخته شده بود."
                ),
                StoryParagraph(
                    "Alyona was a small, thin woman of about sixty, with sharp, wicked eyes and a mean, suspicious manner, and she lent money to desperate people at interest rates that were little better than robbery.",
                    "آلیونا زنی کوچک‌اندام و لاغر حدوداً شصت‌ساله بود، با چشمانی تیز و شیطانی و حالتی پست و مشکوک، و به افراد درمانده با نرخ بهره‌ای پول قرض می‌داد که کمی بهتر از دزدی بود."
                ),
                StoryParagraph(
                    "Raskolnikov had pawned his father's old silver watch to her several weeks earlier, and he had returned that evening to pawn another small item and to study her habits more carefully.",
                    "راسکولنیکوف چند هفته پیش ساعت نقره‌ای قدیمی پدرش را نزد او گرو گذاشته بود و آن شب بازگشته بود تا چیز کوچک دیگری گرو بگذارد و عادت‌هایش را دقیق‌تر بررسی کند."
                ),
                StoryParagraph(
                    "While he stood in her cramped apartment, he noted how she kept her keys on a ring around her neck, how she stored her money in a locked chest, and how she lived alone with her younger sister, a gentle, simple-minded woman named Lizaveta.",
                    "در حالی که در آپارتمان تنگش ایستاده بود، متوجه شد که چطور کلیدها را روی حلقه‌ای دور گردنش نگه می‌دارد، پولش را در صندوقی قفل‌شده می‌گذارد، و چگونه تنها با خواهر کوچک‌ترش، زنی مهربان و ساده‌دل به نام لیزاویتا، زندگی می‌کند."
                ),
                StoryParagraph(
                    "Alyona spoke to him coldly and rudely, as she always did, and Raskolnikov replied with the same quiet, distant politeness he had been practicing for weeks.",
                    "آلیونا مثل همیشه سرد و بی‌ادبانه با او حرف زد و راسکولنیکوف با همان ادب آرام و دوری که هفته‌ها تمرین کرده بود پاسخ داد."
                ),
                StoryParagraph(
                    "As he was leaving her house, a strange thought passed through his mind, a thought so dark and so tempting that he immediately pushed it away and walked quickly into the street.",
                    "وقتی داشت از خانه‌اش بیرون می‌رفت، فکری عجیب از ذهنش گذشت، فکری چنان تاریک و چنان وسوسه‌انگیز که فوراً آن را از خود راند و سریع به خیابان رفت."
                ),
                StoryParagraph(
                    "But the thought would not leave him, and it followed him through the streets of the city like a shadow that could not be shaken off, whispering to him in a voice that grew louder with every passing day.",
                    "اما فکر رهایش نمی‌کرد و مثل سایه‌ای که نمی‌شد از آن خلاص شد، در خیابان‌های شهر دنبالش می‌آمد و با صدایی که هر روز بلندتر می‌شد با او زمزمه می‌کرد."
                ),
                StoryParagraph(
                    "That same evening, having left Alyona's house, Raskolnikov wandered into a cheap, dirty tavern, where he ordered a glass of beer and sat alone in a dark corner, watching the drunken crowd around him.",
                    "همان شب، پس از ترک خانه‌ی آلیونا، راسکولنیکوف به میخانه‌ای ارزان و کثیف سرگردان شد، جایی که یک لیوان آبجو سفارش داد و تنها در گوشه‌ای تاریک نشست و جمعیت مست اطرافش را تماشا کرد."
                ),
                StoryParagraph(
                    "There, a drunkard named Marmeladov approached him and began, without any introduction, to tell him the long, miserable story of his life.",
                    "آنجا، مستی به نام مارملادوف به او نزدیک شد و بدون هیچ مقدمه‌ای شروع کرد به تعریف داستان طولانی و رقت‌انگیز زندگی‌اش."
                ),
                StoryParagraph(
                    "Marmeladov had once been a government clerk, but drink had ruined him, and he had sold even his wife's stockings to buy more vodka, leaving his family in complete destitution.",
                    "مارملادوف زمانی کارمند دولت بود، اما نوشیدن نابودش کرده بود، و حتی جوراب‌های همسرش را فروخته بود تا ودکای بیشتری بخرد، و خانواده‌اش را کاملاً بی‌چیز رها کرده بود."
                ),
                StoryParagraph(
                    "His wife Katerina Ivanovna, a proud woman of noble birth who had fallen into poverty, was slowly dying of consumption, and his three small children were often left without food for days at a time.",
                    "همسرش کاترینا ایوانوونا، زنی مغرور از تبار اصیل که به فقر افتاده بود، آهسته از بیماری سل می‌مرد، و سه فرزند کوچکش اغلب روزها بدون غذا رها می‌شدند."
                ),
                StoryParagraph(
                    "But the worst of it, Marmeladov said, weeping openly, was that his eldest daughter Sonya, a girl of eighteen, had been forced to become a prostitute in order to feed the family and keep the younger children alive.",
                    "اما بدترینش، مارملادوف در حالی که آشکارا گریه می‌کرد گفت، این بود که دختر بزرگش سونیا، دختری هجده‌ساله، مجبور شده بود برای سیر کردن خانواده و زنده نگه داشتن بچه‌های کوچک‌تر به روسپیگری روی بیاورد."
                ),
                StoryParagraph(
                    "She has taken the yellow ticket, Marmeladov said quietly, and she lives apart from us now, because she does not wish to shame us in the eyes of the neighbors, and yet she brings us every penny she earns and asks for nothing in return.",
                    "مارملادوف آرام گفت: او کارت زرد گرفته و حالا جدا از ما زندگی می‌کند، چون نمی‌خواهد ما را در نظر همسایه‌ها شرمنده کند، و با این حال هر سکه‌ای که به دست می‌آورد برایمان می‌آورد و در عوض هیچ نمی‌خواهد."
                ),
                StoryParagraph(
                    "Raskolnikov listened to this story with a strange, painful attention, and something in his chest tightened, because he sensed that he and this wretched man were connected by something he could not yet name.",
                    "راسکولنیکوف با توجهی عجیب و دردناک به این داستان گوش داد و چیزی در سینه‌اش فشرده شد، چون حس می‌کرد او و این مرد نگون‌بخت با چیزی به هم مرتبط‌اند که هنوز نمی‌توانست نامش را ببرد."
                ),
                StoryParagraph(
                    "When Marmeladov finally stumbled off into the night, Raskolnikov walked with him as far as his home, and there he saw with his own eyes the misery that the drunkard had described.",
                    "وقتی مارملادوف بالاخره تلوتلوخوران در شب ناپدید شد، راسکولنیکوف تا خانه‌اش همراهی‌اش کرد، و آنجا با چشمان خودش بدبختی‌ای که آن مست توصیف کرده بود را دید."
                ),
                StoryParagraph(
                    "Katerina Ivanovna was coughing blood into a handkerchief and shouting at her crying children, and the whole apartment smelled of illness, poverty, and despair.",
                    "کاترینا ایوانوونا در دستمالش خون سرفه می‌کرد و بر سر بچه‌های گریانش فریاد می‌زد، و تمام آپارتمان بوی بیماری، فقر و ناامیدی می‌داد."
                ),
                StoryParagraph(
                    "Raskolnikov quietly left some coins on the windowsill before slipping out, though he had almost no money himself, and as he walked away, he felt a strange and unexpected warmth in his chest.",
                    "راسکولنیکوف بی‌صدا چند سکه روی طاقچه گذاشت و بعد بیرون خزید، هرچند خودش تقریباً هیچ پولی نداشت، و وقتی دور می‌شد، گرمای عجیب و غیرمنتظره‌ای در سینه‌اش حس کرد."
                ),
                StoryParagraph(
                    "But that warmth did not last long, because the dark thought was still waiting for him, patient and quiet, and it grew stronger with every step he took back towards his own miserable room.",
                    "اما آن گرما زیاد دوام نیاورد، چون فکر تاریک هنوز صبور و ساکت منتظرش بود، و با هر قدمی که به سمت اتاق رقت‌انگیز خودش برمی‌گشت قوی‌تر می‌شد."
                ),
                StoryParagraph(
                    "When he finally reached his attic, he threw himself onto his broken sofa and lay there in the dark, staring at the ceiling, while his mind raced with ideas that both terrified and fascinated him.",
                    "وقتی بالاخره به زیرشیروانی‌اش رسید، خود را روی مبل شکسته‌اش انداخت و در تاریکی دراز کشید و به سقف خیره شد، در حالی که ذهنش با ایده‌هایی می‌دوید که هم وحشتزده‌اش می‌کرد و هم مجذوبش."
                ),
                StoryParagraph(
                    "He had read somewhere that certain extraordinary men, men like Napoleon, had the right to step over ordinary moral laws in order to achieve something great for humanity.",
                    "جایی خوانده بود که بعضی مردان استثنایی، مردانی مثل ناپلئون، حق دارند برای دستیابی به چیزی بزرگ برای بشریت، از قوانین اخلاقی معمولی عبور کنند."
                ),
                StoryParagraph(
                    "Was he such a man, he wondered, or was he only a coward, a louse, a trembling creature that did not dare to take what it wanted, and this question haunted him night and day.",
                    "او از خود می‌پرسید آیا او چنین مردی است، یا فقط ترسویی است، شپشی، موجودی لرزان که جرئت نمی‌کند آنچه می‌خواهد را بگیرد، و این پرسش شبانه‌روز تعقیبش می‌کرد."
                ),
                StoryParagraph(
                    "The old pawnbroker was a worthless, cruel creature, he told himself again and again, and her death would free many people from debt and suffering, including her poor, gentle sister Lizaveta.",
                    "رباخوار پیر موجودی بی‌ارزش و بی‌رحم بود، بارها و بارها به خودش می‌گفت، و مرگش بسیاری از مردم را از بدهی و رنج آزاد می‌کرد، از جمله خواهر مهربان و ساده‌اش لیزاویتا."
                ),
                StoryParagraph(
                    "And her money, which she hoarded and never used, could pay for his studies, could support his poor mother and his sister Dunya, could help him become the great man he knew he was meant to be.",
                    "و پولش، که انبار کرده بود و هرگز استفاده نمی‌کرد، می‌توانست تحصیلش را بپردازد، می‌توانست مادر فقیرش و خواهرش دونیا را حمایت کند، می‌توانست به او کمک کند مرد بزرگی شود که می‌دانست برای آن آفریده شده است."
                ),
                StoryParagraph(
                    "But every time he tried to convince himself with these arguments, a small, honest voice deep inside him whispered that none of this was true, that he was simply a murderer in the making.",
                    "اما هر بار که تلاش می‌کرد خودش را با این استدلال‌ها قانع کند، صدایی کوچک و صادق در عمق درونش زمزمه می‌کرد که هیچ‌کدام از این‌ها درست نیست، که او فقط قاتلی در حال شکل‌گیری است."
                ),
                StoryParagraph(
                    "The battle inside him continued for many days, and it was a battle he knew he could not win, because the dark thought had already taken root in his soul, and it would not be torn out.",
                    "نبرد درونی‌اش روزها ادامه یافت، و نبردی بود که می‌دانست نمی‌تواند ببرد، چون فکر تاریک از قبل در روحش ریشه دوانده بود و کنده نمی‌شد."
                ),
                StoryParagraph(
                    "One afternoon, walking through the Hay Market, he overheard a conversation between two young students that would change everything, because one of them was saying, quite casually, that killing Alyona would be a good deed.",
                    "یک بعدازظهر، در حال قدم زدن در بازار علف، گفت‌وگویی بین دو دانشجوی جوان شنید که همه چیز را تغییر می‌داد، چون یکی از آن‌ها کاملاً اتفاقی می‌گفت کشتن آلیونا یک کار خوب خواهد بود."
                ),
                StoryParagraph(
                    "The student argued that Alyona was a useless, wicked woman who deserved to die, and that her money could be used to help thousands of suffering people instead of being hoarded in her filthy chest.",
                    "آن دانشجو استدلال می‌کرد که آلیونا زنی بی‌فایده و پلید است که سزاوار مرگ است، و پولش می‌تواند به‌جای انبار شدن در صندوق کثیفش، برای کمک به هزاران نفر دردمند استفاده شود."
                ),
                StoryParagraph(
                    "Raskolnikov stood frozen, listening, and it felt to him as if fate itself had spoken through the mouths of these two strangers, confirming the terrible plan that had been forming in his mind.",
                    "راسکولنیکوف یخ‌زده ایستاد و گوش داد، و به نظرش رسید که خود تقدیر از دهان این دو غریبه سخن گفته و نقشه‌ی هولناکی که در ذهنش شکل گرفته بود را تأیید کرده است."
                ),
                StoryParagraph(
                    "He walked home in a daze, and that evening, he stopped eating, stopped sleeping, and stopped speaking to anyone, spending his hours lying on his sofa, planning the details of the crime with an attention that frightened even himself.",
                    "گیج به خانه رفت و آن شب، دیگر نخورد، نخوابید و با هیچ‌کس حرف نزد، و ساعت‌هایش را روی مبلش دراز کشیده و با توجهی که حتی خودش را می‌ترساند، جزئیات جنایت را برنامه‌ریزی می‌کرد."
                ),
                StoryParagraph(
                    "He learned Alyona's schedule, he figured out how to make a loop to carry the axe under his coat, he rehearsed the whole thing in his mind until every step felt inevitable and almost familiar.",
                    "برنامه‌ی آلیونا را آموخت، فهمید چطور حلقه‌ای بسازد تا تبر را زیر کتش حمل کند، تمام ماجرا را در ذهنش مرور کرد تا هر قدم اجتناب‌ناپذیر و تقریباً آشنا به نظر برسد."
                ),
                StoryParagraph(
                    "And then, on a hot evening in July, just as the sun was setting and the streets were emptying, he slipped out of his room, put the axe under his coat, and walked slowly towards the old woman's house.",
                    "و سپس، در شبی گرم در ماه ژوئیه، درست وقتی خورشید غروب می‌کرد و خیابان‌ها خالی می‌شد، از اتاقش بیرون خزید، تبر را زیر کتش گذاشت و آهسته به سمت خانه‌ی پیرزن رفت."
                ),
                StoryParagraph(
                    "He told himself, as he walked, that he was not a murderer but a man of destiny, a man following a higher law, but deep inside, he knew, with sickening certainty, that he was lying to himself.",
                    "در حال راه رفتن به خودش می‌گفت که قاتل نیست بلکه مردی سرنوشت‌ساز است، مردی که از قانونی برتر پیروی می‌کند، اما در عمق وجودش، با اطمینانی تهوع‌آور، می‌دانست که به خودش دروغ می‌گوید."
                )
            )
        ),
        StoryChapter(
            number = 2, title = "The Crime", titlePersian = "جنایت",
            paragraphs = listOf(
                StoryParagraph(
                    "Raskolnikov reached Alyona Ivanovna's building just after seven o'clock in the evening, and as he climbed the dark, narrow staircase, he could hear his own heart beating so loudly that he was certain everyone in the building must hear it too.",
                    "راسکولنیکوف کمی بعد از ساعت هفت شب به ساختمان آلیونا ایوانوونا رسید، و در حالی که از پله‌های تاریک و باریک بالا می‌رفت، می‌توانست صدای قلب خودش را چنان بلند بشنود که مطمئن بود همه‌ی اهل ساختمان هم می‌شنوند."
                ),
                StoryParagraph(
                    "His hands were cold and clammy, and his legs felt weak beneath him, as if his body already knew, on some deep and primitive level, what his mind was still refusing to accept.",
                    "دست‌هایش سرد و عرق‌آلود بود و پاهایش زیرش سست می‌شد، گویی بدنش در سطحی عمیق و بدوی از قبل می‌دانست آنچه ذهنش هنوز از پذیرشش سر باز می‌زد."
                ),
                StoryParagraph(
                    "He paused on the landing to catch his breath, and for a brief moment, he considered turning around and going home, but the thought of retreating filled him with an unbearable shame.",
                    "روی پاگرد توقف کرد تا نفس بگیرد، و برای لحظه‌ای کوتاه به بازگشت و رفتن به خانه فکر کرد، اما فکر عقب‌نشینی او را پر از شرمی تحمل‌ناپذیر کرد."
                ),
                StoryParagraph(
                    "He continued up the stairs, and when he reached Alyona's door, he rang the bell three times, exactly as he had planned, and waited with his hand pressed against the wall for support.",
                    "به بالا رفتن از پله‌ها ادامه داد، و وقتی به در خانه‌ی آلیونا رسید، دقیقاً همان‌طور که برنامه‌ریزی کرده بود سه بار زنگ زد، و با دستی که به دیوار فشار می‌داد منتظر ماند."
                ),
                StoryParagraph(
                    "The old woman opened the door and peered out at him with her usual suspicious expression, and Raskolnikov, forcing his voice to remain steady, told her that he had brought another item to pawn.",
                    "پیرزن در را باز کرد و مثل همیشه با حالت مشکوکش به بیرون نگاه کرد، و راسکولنیکوف که صدایش را به‌زور ثابت نگه می‌داشت، به او گفت که چیز دیگری برای گرو گذاشتن آورده است."
                ),
                StoryParagraph(
                    "Alyona hesitated for a moment, but she let him in, as she had done many times before, and she closed the door behind him with a soft click that seemed, to Raskolnikov, to seal his fate forever.",
                    "آلیونا لحظه‌ای تردید کرد، اما راهش داد، همانطور که بارها پیش از این کرده بود، و در را پشت سرش با تق‌تق ملایمی بست که به نظر راسکولنیکوف، سرنوشتش را برای همیشه مُهر کرد."
                ),
                StoryParagraph(
                    "Inside the cramped apartment, the air was stale and heavy, and there was only a single candle burning on the table, casting long, dancing shadows on the walls.",
                    "در آپارتمان تنگ، هوا مانده و سنگین بود، و فقط یک شمع روی میز می‌سوخت و سایه‌های بلند و رقصنده روی دیوارها می‌انداخت."
                ),
                StoryParagraph(
                    "Alyona walked over to the window to examine the item he had given her, turning her back to him for a single, fateful moment, and in that single moment, everything changed.",
                    "آلیونا به سمت پنجره رفت تا چیزی که به او داده بود را بررسی کند و برای لحظه‌ای سرنوشت‌ساز پشتش را به او کرد، و در همان لحظه‌ی واحد، همه چیز تغییر کرد."
                ),
                StoryParagraph(
                    "Raskolnikov pulled the axe from under his coat with trembling hands, and before he could think, before he could hesitate, he brought it down upon the old woman's head with all his strength.",
                    "راسکولنیکوف با دستانی لرزان تبر را از زیر کتش بیرون کشید، و پیش از آنکه بتواند فکر کند، پیش از آنکه بتواند تردید کند، آن را با تمام قدرتش بر سر پیرزن فرود آورد."
                ),
                StoryParagraph(
                    "Alyona collapsed to the floor without a sound, and Raskolnikov stood over her for a moment, breathing hard, staring at the blood spreading slowly across the floorboards beneath her head.",
                    "آلیونا بی‌صدا روی زمین فرو افتاد و راسکولنیکوف لحظه‌ای بالای سرش ایستاد، به‌سختی نفس می‌کشید و به خونی که آهسته زیر سرش روی تخته‌های کف پخش می‌شد خیره شد."
                ),
                StoryParagraph(
                    "He felt nothing at that moment, no guilt, no horror, only a strange, cold emptiness, as if the part of him that could feel such things had been switched off entirely.",
                    "در آن لحظه هیچ حس نکرد، نه گناه، نه وحشت، فقط خالی‌بودنی عجیب و سرد، گویی بخشی از او که می‌توانست چنین چیزهایی را حس کند کاملاً خاموش شده بود."
                ),
                StoryParagraph(
                    "He then rushed to the bedroom to look for her keys and her money, moving quickly and silently, his hands searching the room with a desperate, mechanical precision.",
                    "سپس به اتاق خواب هجوم برد تا کلیدها و پولش را پیدا کند، سریع و بی‌صدا حرکت می‌کرد و دست‌هایش با دقتی ناامیدانه و ماشینی اتاق را می‌گشتند."
                ),
                StoryParagraph(
                    "He found a purse full of banknotes, and he stuffed it into his pocket without counting, and he was just about to leave when he heard a soft sound behind him, the sound of footsteps in the doorway.",
                    "کیفی پر از اسکناس پیدا کرد و بدون شمردن آن را در جیبش فرو کرد، و درست داشت می‌رفت که صدای ملایمی پشت سرش شنید، صدای قدم‌هایی در چارچوب در."
                ),
                StoryParagraph(
                    "He turned around slowly, and there in the doorway stood Lizaveta, Alyona's gentle and innocent sister, holding a bundle of clothes in her arms, staring at the dead body of her sister with wide, horrified eyes.",
                    "آهسته برگشت، و آنجا در چارچوب در، لیزاویتا ایستاده بود، خواهر مهربان و بی‌گناه آلیونا، بقچه‌ای لباس در آغوش داشت و با چشمانی گشاد و وحشت‌زده به جسد خواهرش خیره شده بود."
                ),
                StoryParagraph(
                    "For a long moment, neither of them moved; Lizaveta was too terrified to scream, and Raskolnikov was frozen, unable to decide what to do, unable even to think clearly.",
                    "لحظه‌ای طولانی، هیچ‌کدام تکان نخوردند؛ لیزاویتا آن‌قدر وحشت‌زده بود که نمی‌توانست فریاد بزند، و راسکولنیکوف یخ‌زده بود و نمی‌توانست تصمیم بگیرد چه کند، حتی نمی‌توانست واضح فکر کند."
                ),
                StoryParagraph(
                    "Then, in a sudden movement that he himself did not fully understand, he raised the axe again and brought it down upon Lizaveta's head, killing her as well.",
                    "سپس، در حرکتی ناگهانی که خودش هم کاملاً نمی‌فهمید، تبر را دوباره بالا برد و بر سر لیزاویتا فرود آورد و او را نیز کشت."
                ),
                StoryParagraph(
                    "The moment it was done, he felt a wave of horror sweep through him, not for the old woman, whom he had convinced himself deserved to die, but for the young, innocent sister whose only crime had been to enter the room at the wrong moment.",
                    "همان لحظه که انجام شد، موجی از وحشت او را فرا گرفت، نه برای پیرزن، که خودش را قانع کرده بود سزاوار مرگ است، بلکه برای خواهر جوان و بی‌گناهی که تنها گناهش این بود که در لحظه‌ی اشتباه وارد اتاق شده بود."
                ),
                StoryParagraph(
                    "He stood there, shaking, staring at the two bodies on the floor, and he realized with a terrible clarity that nothing would ever be the same again, that he had crossed a line from which there was no return.",
                    "آنجا ایستاد، می‌لرزید و به دو جسد روی زمین خیره شد، و با وضوحی هولناک دریافت که دیگر هیچ‌چیز مثل قبل نخواهد بود، که از خطی عبور کرده که بازگشتی از آن نیست."
                ),
                StoryParagraph(
                    "He forced himself to move, and he quickly searched the apartment for anything valuable, taking money, jewelry, and a few small items, though his hands were trembling so badly that he dropped more than he collected.",
                    "خودش را مجبور به حرکت کرد و سریع آپارتمان را برای هر چیز باارزشی گشت، پول، جواهرات و چند چیز کوچک برداشت، هرچند دست‌هایش آن‌قدر بد می‌لرزیدند که بیشتر از آنکه جمع کند، می‌انداخت."
                ),
                StoryParagraph(
                    "He then went to the kitchen to wash the blood from his hands and the axe, but the water was cold and rusty, and the blood clung to his skin like a stain that would never come off.",
                    "سپس به آشپزخانه رفت تا خون را از دست‌ها و تبرش بشوید، اما آب سرد و زنگ‌زده بود و خون مثل لکه‌ای که هرگز پاک نمی‌شد به پوستش چسبیده بود."
                ),
                StoryParagraph(
                    "Just as he was finishing, he heard footsteps on the stairs outside, and his blood ran cold, because he knew that if someone found him here, everything would be over.",
                    "درست وقتی داشت تمام می‌کرد، صدای قدم‌هایی از پله‌های بیرون شنید و خونش یخ کرد، چون می‌دانست اگر کسی او را اینجا پیدا کند، همه چیز تمام است."
                ),
                StoryParagraph(
                    "He slipped out of the apartment and hid in an empty room on the same floor, pressing himself against the wall and holding his breath while two men entered Alyona's flat and began to cry out in horror at what they found.",
                    "از آپارتمان بیرون خزید و در اتاقی خالی در همان طبقه پنهان شد، خودش را به دیوار فشار داد و نفسش را نگه داشت، در حالی که دو مرد وارد آپارتمان آلیونا شدند و با وحشت از آنچه یافتند فریاد کشیدند."
                ),
                StoryParagraph(
                    "For what felt like an eternity, he crouched in the darkness, listening to the men's panicked voices, hearing them run down the stairs to fetch help, and knowing that he had only a few seconds to escape.",
                    "برای مدتی که به نظر ابدیت می‌رسید، در تاریکی خمیده ماند و به صداهای هراس‌زده‌ی آن مردان گوش داد، شنید که برای آوردن کمک از پله‌ها پایین دویدند، و می‌دانست که فقط چند ثانیه برای فرار دارد."
                ),
                StoryParagraph(
                    "When the coast was clear, he ran down the stairs and out into the street, and he walked quickly through the dark alleys of the city, keeping his head down, trying to look like an ordinary man on an ordinary errand.",
                    "وقتی راه خالی شد، از پله‌ها پایین دوید و به خیابان زد، و سریع از میان کوچه‌های تاریک شهر گذشت، سرش را پایین گرفته بود و تلاش می‌کرد مثل مردی معمولی در کاری معمولی به نظر برسد."
                ),
                StoryParagraph(
                    "But his legs were shaking, his heart was pounding, and every shadow seemed to him to be a policeman, every voice a witness, every step behind him the sound of the law closing in.",
                    "اما پاهایش می‌لرزید، قلبش می‌کوبید، و هر سایه برایش پلیسی به نظر می‌رسید، هر صدایی شاهدی، هر قدمی پشت سرش صدای قانونی که نزدیک می‌شد."
                ),
                StoryParagraph(
                    "When he finally reached his own building, he climbed the stairs as quietly as he could, entered his room, and locked the door behind him with trembling hands.",
                    "وقتی بالاخره به ساختمان خودش رسید، تا حد امکان بی‌صدا از پله‌ها بالا رفت، وارد اتاقش شد و با دستانی لرزان در را پشت سرش قفل کرد."
                ),
                StoryParagraph(
                    "He then threw himself onto his sofa and lay there, fully clothed, shaking, unable to think, unable to move, unable even to close his eyes, because every time he did, he saw the two bodies on the floor.",
                    "سپس خود را روی مبلش انداخت و همان‌جا با لباس دراز کشید، می‌لرزید، نمی‌توانست فکر کند، نمی‌توانست حرکت کند، حتی نمی‌توانست چشمانش را ببندد، چون هر بار که می‌بست، دو جسد روی زمین را می‌دید."
                ),
                StoryParagraph(
                    "He had hidden the stolen items under a loose stone in an inner courtyard on the way home, and now he realized, with a strange and bitter clarity, that he had not even looked at them, so great had been his horror.",
                    "اشیا دزدیده‌شده را در راه بازگشت زیر سنگی لق در حیاطی داخلی پنهان کرده بود، و حالا با وضوحی عجیب و تلخ دریافت که حتی به آن‌ها نگاه هم نکرده بود، چنان وحشتش زیاد بود."
                ),
                StoryParagraph(
                    "He tried to wash his hands again, but the blood was gone by now, or at least it seemed gone, and yet he could still smell it, still feel it on his skin, still taste it in his mouth.",
                    "دوباره تلاش کرد دست‌هایش را بشوید، اما خون تا حالا رفته بود، یا حداقل به نظر می‌رسید رفته باشد، و با این حال هنوز بویش را حس می‌کرد، هنوز روی پوستش حسش می‌کرد، هنوز در دهانش می‌چشیدش."
                ),
                StoryParagraph(
                    "He checked his clothes for stains, and finding only a small spot on his trousers, he cut the fringed edge off with a knife and burned the piece in the candle flame, watching the fabric curl and blacken.",
                    "لباس‌هایش را برای لکه بررسی کرد و فقط لکه‌ی کوچکی روی شلوارش یافت، پس لبه‌ی ریش‌ریش آن را با چاقو برید و تکه را در شعله‌ی شمع سوزاند و تماشا کرد که پارچه جمع شد و سیاه شد."
                ),
                StoryParagraph(
                    "He then sat on the edge of his sofa for a long time, staring at the wall, listening to the sounds of the city outside, waiting for the knock on the door that he was certain would come at any moment.",
                    "سپس مدت طولانی روی لبه‌ی مبلش نشست و به دیوار خیره شد و به صداهای شهر بیرون گوش داد و منتظر ضربه‌ای به در ماند که مطمئن بود هر لحظه می‌آید."
                ),
                StoryParagraph(
                    "But the knock did not come, and slowly, terribly slowly, the night passed, and the first grey light of dawn began to creep through the window, and Raskolnikov was still awake, still shaking, still waiting.",
                    "اما ضربه نیامد و آهسته، به‌طرز هولناکی آهسته، شب گذشت و اولین نور خاکستری سحر شروع کرد از پنجره داخل شدن، و راسکولنیکوف هنوز بیدار بود، هنوز می‌لرزید، هنوز منتظر بود."
                ),
                StoryParagraph(
                    "He knew, somewhere deep in the exhausted corners of his mind, that he had won nothing, that he had killed two women for nothing, that the money he had taken would never give him what he truly wanted.",
                    "در گوشه‌های خسته‌ی ذهنش، جایی عمیق، می‌دانست که هیچ چیزی نبرده بود، که دو زن را برای هیچ کشته بود، که پولی که گرفته بود هرگز آنچه واقعاً می‌خواست را به او نمی‌داد."
                ),
                StoryParagraph(
                    "And he knew, with a certainty that chilled him to the bone, that the punishment for what he had done would not come from the police, or from a court, or from any prison, but from something far worse inside himself.",
                    "و با اطمینانی که تا مغز استخوانش را سرد کرد می‌دانست که مجازات کاری که کرده بود نه از پلیس می‌آمد، نه از دادگاه، نه از هیچ زندانی، بلکه از چیزی بسیار بدتر در درون خودش."
                ),
                StoryParagraph(
                    "He had imagined, before the murder, that he would feel like a Napoleon after it was done, that he would feel powerful, free, above the ordinary rules of ordinary men, but instead, he felt smaller and weaker than he had ever felt before.",
                    "پیش از قتل تصور کرده بود که پس از انجامش مثل ناپلئون احساس می‌کند، احساس قدرت، آزادی، برتری از قوانین معمولی مردان معمولی، اما در عوض، کوچک‌تر و ضعیف‌تر از هر زمان دیگری در عمرش احساس می‌کرد."
                ),
                StoryParagraph(
                    "He tried to laugh at himself, at his own foolishness, at the proud theories that had led him here, but the laughter stuck in his throat and turned into something closer to a sob.",
                    "تلاش کرد به خودش بخندد، به حماقت خودش، به نظریه‌های مغرورانه‌ای که او را به اینجا کشانده بود، اما خنده در گلویش گیر کرد و به چیزی شبیه به هق‌هق تبدیل شد."
                ),
                StoryParagraph(
                    "The first day after the murder was the longest of his life, and he spent it lying on his sofa in a kind of waking dream, drifting between sleep and waking, between past and present, between horror and numbness.",
                    "اولین روز پس از قتل، طولانی‌ترین روز زندگی‌اش بود، و آن را روی مبلش در نوعی رؤیای بیداری گذراند، میان خواب و بیداری شناور، میان گذشته و حال، میان وحشت و بی‌حسی."
                ),
                StoryParagraph(
                    "And when, at last, evening came and the shadows of the city began to lengthen, he understood, with a strange and terrible calm, that the man who had walked up those stairs to Alyona's flat was not the man who lay here now.",
                    "و وقتی بالاخره شب رسید و سایه‌های شهر شروع به بلند شدن کردند، با آرامشی عجیب و هولناک فهمید که مردی که از آن پله‌ها بالا رفته بود به آپارتمان آلیونا، همان مردی نبود که حالا اینجا دراز کشیده است."
                ),
                StoryParagraph(
                    "He had wanted to become something greater than himself, and he had succeeded, but not in the way he had intended; he had become a murderer, and that was the only title he would ever truly earn.",
                    "می‌خواست چیزی بزرگ‌تر از خودش شود و موفق شده بود، اما نه به شکلی که در نظر داشت؛ او قاتل شده بود، و این تنها عنوانی بود که واقعاً به دست می‌آورد."
                ),
                StoryParagraph(
                    "Yet somewhere, in the darkest and most hidden corner of his soul, a small, stubborn spark still flickered, a spark that whispered that perhaps, despite everything, there might still be a way back to life.",
                    "اما جایی، در تاریک‌ترین و پنهان‌ترین گوشه‌ی روحش، شراره‌ای کوچک و سرسخت هنوز سوسو می‌زد، شراره‌ای که زمزمه می‌کرد شاید با وجود همه چیز، هنوز راهی برای بازگشت به زندگی باشد."
                )
            )
        ),
        StoryChapter(
            number = 3, title = "The Weight of Guilt", titlePersian = "سنگینی گناه",
            paragraphs = listOf(
                StoryParagraph(
                    "For several days after the murders, Raskolnikov lay in his room in a state of delirium, drifting in and out of consciousness, and he could not tell whether the visions that filled his mind were dreams or memories.",
                    "چند روز پس از قتل‌ها، راسکولنیکوف در اتاقش در حالتی از هذیان دراز کشید و میان هشیاری و بی‌هشیاری شناور بود، و نمی‌توانست تشخیص دهد که رؤیاهایی که ذهنش را پر می‌کردند خواب بودند یا خاطره."
                ),
                StoryParagraph(
                    "He saw the old woman's face again and again, her sharp eyes staring at him in silent accusation, and he saw Lizaveta's terrified expression, her mouth opening as if to scream but making no sound.",
                    "بارها و بارها چهره‌ی پیرزن را می‌دید، چشمان تیز و اتهام‌آمیزش در سکوت به او خیره بودند، و حالت وحشت‌زده‌ی لیزاویتا را می‌دید، دهانش باز می‌شد گویی می‌خواهد فریاد بزند اما هیچ صدایی در نمی‌آمد."
                ),
                StoryParagraph(
                    "Then a servant knocked at his door, bringing him a summons from the police station, and Raskolnikov's heart nearly stopped, because he was certain, absolutely certain, that he had been discovered.",
                    "سپس خدمتکاری در اتاقش زد و احضاریه‌ای از کلانتری برایش آورد، و قلب راسکولنیکوف تقریباً ایستاد، چون مطمئن بود، کاملاً مطمئن، که کشف شده است."
                ),
                StoryParagraph(
                    "He dressed with trembling hands, gathered his scattered thoughts as best he could, and walked to the station, rehearsing excuses in his head, planning his defense, preparing for the worst.",
                    "با دستانی لرزان لباس پوشید، تا آنجا که می‌توانست افکار پراکنده‌اش را جمع کرد، و به سمت کلانتری راه افتاد، در ذهنش عذر و بهانه تمرین می‌کرد، دفاعش را برنامه‌ریزی می‌کرد، خود را برای بدترین حالت آماده می‌کرد."
                ),
                StoryParagraph(
                    "But when he arrived, the clerk looked at him with mild annoyance and told him, in a bored voice, that the matter concerned an unpaid debt to his landlady, nothing more.",
                    "اما وقتی رسید، کارمند با نارضایتی ملایمی به او نگاه کرد و با صدایی خسته گفت که موضوع درباره‌ی بدهی پرداخت‌نشده به صاحب‌خانه‌اش است، چیز دیگری نیست."
                ),
                StoryParagraph(
                    "The relief that washed over Raskolnikov was so intense that he nearly laughed out loud, and the policemen, seeing his strange reaction, looked at him with suspicion and asked him if he was feeling unwell.",
                    "آسودگی‌ای که راسکولنیکوف را فرا گرفت چنان شدید بود که تقریباً بلند خندید، و پلیس‌ها که واکنش عجیبش را دیدند، با شک به او نگاه کردند و پرسیدند حالش خوب است یا نه."
                ),
                StoryParagraph(
                    "He left the station in a daze, and as he walked home through the crowded streets, he felt suddenly dizzy, and he collapsed on a bench in a small square, unable to continue.",
                    "گیج از کلانتری بیرون رفت و در حالی که از میان خیابان‌های شلوغ به خانه می‌رفت، ناگهان احساس سرگیجه کرد و روی نیمکتی در میدان کوچکی افتاد و نتوانست ادامه دهد."
                ),
                StoryParagraph(
                    "A kind stranger helped him up and even gave him some money for a cab, but Raskolnikov, suspicious of everyone, threw the money into the river as soon as the stranger had gone away.",
                    "غریبه‌ای مهربان کمکش کرد بلند شود و حتی پولی برای کالسکه به او داد، اما راسکولنیکوف که به همه مشکوک بود، به‌محض رفتن آن غریبه پول را در رودخانه انداخت."
                ),
                StoryParagraph(
                    "When he finally reached his room, he threw himself on his sofa and fell into a deep, feverish sleep, and as he slept, a terrible dream came to him, a dream far worse than anything he had yet endured.",
                    "وقتی بالاخره به اتاقش رسید، خود را روی مبلش انداخت و در خوابی عمیق و تب‌آلود فرو رفت، و در خواب، رؤیای هولناکی به سراغش آمد، رؤیایی بسیار بدتر از هر چیزی که تا حالا تحمل کرده بود."
                ),
                StoryParagraph(
                    "In the dream, he was back in Alyona's apartment, striking her again and again with the axe, but no matter how many times he hit her, she would not die.",
                    "در خواب، دوباره در آپارتمان آلیونا بود، بارها و بارها با تبر به او می‌کوبید، اما هر چقدر ضربه می‌زد، نمی‌مرد."
                ),
                StoryParagraph(
                    "She sat there on the floor, silent and still, watching him with her cold, mocking eyes, and then, slowly, she began to laugh, a terrible, soundless laugh that seemed to come from somewhere far away.",
                    "او همان‌جا روی زمین نشسته بود، ساکت و بی‌حرکت، با چشمانی سرد و طعنه‌آمیز نگاهش می‌کرد، و سپس، آهسته، شروع کرد به خندیدن، خنده‌ای هولناک و بی‌صدا که به نظر از جایی دور می‌آمد."
                ),
                StoryParagraph(
                    "Raskolnikov tried to run, but his legs would not move, and the old woman grew larger and larger, filling the whole room, until he woke up screaming, drenched in sweat, his heart pounding in his chest.",
                    "راسکولنیکوف تلاش کرد فرار کند، اما پاهایش حرکت نمی‌کردند، و پیرزن بزرگ‌تر و بزرگ‌تر شد، تمام اتاق را پر کرد، تا وقتی فریادزنان بیدار شد، غرق در عرق، و قلبش در سینه‌اش می‌کوبید."
                ),
                StoryParagraph(
                    "Just at that moment, there was a loud knock at his door, and Raskolnikov froze, convinced that the police had come for him at last, and that his brief, terrible freedom was finally over.",
                    "همان لحظه، ضربه‌ای بلند به درش خورد و راسکولنیکوف یخ زد، مطمئن شد بالاخره پلیس برایش آمده و آزادی کوتاه و هولناکش بالاخره تمام شده است."
                ),
                StoryParagraph(
                    "But the man who entered was not a policeman; it was Razumikhin, a former classmate and a kind, loyal, and talkative friend whom Raskolnikov had once been close to.",
                    "اما مردی که وارد شد پلیس نبود؛ رازومیخین بود، هم‌کلاسی سابق و دوستی مهربان، وفادار و پرحرف که راسکولنیکوف زمانی با او نزدیک بود."
                ),
                StoryParagraph(
                    "Razumikhin had been looking for him for days, worried about his health, and he was genuinely shocked by his friend's pale, gaunt appearance and wild, feverish eyes.",
                    "رازومیخین روزها بود دنبالش می‌گشت و نگران سلامتی‌اش بود، و از ظاهر رنگ‌پریده و لاغر و چشمان وحشی و تب‌آلود دوستش واقعاً شوکه شد."
                ),
                StoryParagraph(
                    "He had brought Raskolnikov clean clothes, some money, and news from his mother and sister, who were on their way to St. Petersburg to see him.",
                    "او برای راسکولنیکوف لباس تمیز، کمی پول و خبری از مادر و خواهرش آورده بود که در راه سن‌پترزبورگ برای دیدنش بودند."
                ),
                StoryParagraph(
                    "Raskolnikov, however, could not accept any of this kindness; suspicion had become his second nature, and he pushed Razumikhin away with cold, bitter words that wounded the loyal friend deeply.",
                    "اما راسکولنیکوف نمی‌توانست هیچ‌کدام از این مهربانی‌ها را بپذیرد؛ بدگمانی طبیعت دومش شده بود و رازومیخین را با کلماتی سرد و تلخ از خود راند، کلماتی که دوست وفادارش را عمیقاً زخمی کرد."
                ),
                StoryParagraph(
                    "But Razumikhin, being the man he was, did not give up; he promised to return the next day and the day after that, and he told Raskolnikov, quite firmly, that he would not be abandoned no matter how hard he pushed people away.",
                    "اما رازومیخین، چون مردی که بود، رها نکرد؛ قول داد روز بعد و روز بعد از آن برگردد، و با اطمینان به راسکولنیکوف گفت که هر چقدر هم مردم را از خود براند، رها نخواهد شد."
                ),
                StoryParagraph(
                    "When Razumikhin had gone, Raskolnikov lay on his sofa for a long time, thinking about what he had done, and about what he would do next, and about the terrible, unending weight that now pressed upon his soul.",
                    "وقتی رازومیخین رفت، راسکولنیکوف مدت طولانی روی مبلش دراز کشید و به آنچه کرده بود فکر کرد، و به آنچه بعداً می‌کرد، و به وزن هولناک و بی‌پایانی که حالا بر روحش فشار می‌آورد."
                ),
                StoryParagraph(
                    "He had believed that the murder would make him free, but instead, it had bound him tighter than any chain, and it had cut him off from every human being who might have loved him.",
                    "باور داشت که قتل آزادش می‌کند، اما در عوض، او را محکم‌تر از هر زنجیری بسته بود، و او را از هر انسانی که ممکن بود دوستش داشته باشد جدا کرده بود."
                ),
                StoryParagraph(
                    "The investigation into the murders had begun, and a clever, patient investigator named Porfiry Petrovich had been assigned to the case, a man who had studied Raskolnikov's mind from the very beginning.",
                    "تحقیق درباره‌ی قتل‌ها آغاز شده بود، و بازپرسی زیرک و صبور به نام پورفیری پتروویچ به پرونده گمارده شده بود، مردی که از همان ابتدا ذهن راسکولنیکوف را مطالعه کرده بود."
                ),
                StoryParagraph(
                    "Porfiry had read an article that Raskolnikov had written months earlier, in which the young student argued that extraordinary men had the right to step over moral laws for the sake of a greater purpose.",
                    "پورفیری مقاله‌ای خوانده بود که راسکولنیکوف ماه‌ها پیش نوشته بود، در آن دانشجوی جوان استدلال می‌کرد که مردان استثنایی حق دارند برای هدفی بزرگ‌تر از قوانین اخلاقی عبور کنند."
                ),
                StoryParagraph(
                    "This article, more than any other clue, made Porfiry suspect that Raskolnikov might be the murderer, and from that moment on, he began to weave a careful, patient trap.",
                    "این مقاله، بیش از هر سرنخ دیگری، پورفیری را مشکوک کرد که راسکولنیکوف ممکن است قاتل باشد، و از آن لحظه به بعد، شروع کرد به تنیدن تله‌ای دقیق و صبورانه."
                ),
                StoryParagraph(
                    "When Raskolnikov came to the police station to register some pawned items, he and Porfiry met for the first time, and the meeting was strange and unsettling for both of them.",
                    "وقتی راسکولنیکوف برای ثبت اشیای گروگذاشته‌شده به کلانتری رفت، او و پورفیری برای اولین بار همدیگر را دیدند، و این ملاقات برای هر دو عجیب و نگران‌کننده بود."
                ),
                StoryParagraph(
                    "Porfiry smiled constantly, speaking in a soft, gentle voice, but his questions were sharp as knives, and he watched Raskolnikov's face for every flicker of emotion, every tiny, unconscious reaction.",
                    "پورفیری مدام لبخند می‌زد و با صدایی نرم و ملایم صحبت می‌کرد، اما سوالاتش مثل چاقو تیز بود، و برای هر تکان احساس، هر واکنش کوچک و ناخودآگاه، چهره‌ی راسکولنیکوف را می‌پایید."
                ),
                StoryParagraph(
                    "He asked Raskolnikov about his article, about his theory of extraordinary men, and about whether he himself believed he was one of those men, and Raskolnikov, trying to remain calm, felt cold sweat forming on his forehead.",
                    "او از راسکولنیکوف درباره‌ی مقاله‌اش پرسید، درباره‌ی نظریه‌اش درباره‌ی مردان استثنایی، و اینکه آیا خودش باور دارد یکی از آن مردان است، و راسکولنیکوف که تلاش می‌کرد آرام بماند، عرق سردی روی پیشانی‌اش حس کرد."
                ),
                StoryParagraph(
                    "When Raskolnikov finally left the office, he felt both relieved and more terrified than before, because he sensed, somehow, that Porfiry had not been fooled for a single moment.",
                    "وقتی راسکولنیکوف بالاخره از دفتر بیرون رفت، هم آسوده شد و هم بیشتر از قبل ترسید، چون حس کرد، به‌نحوی، که پورفیری حتی برای یک لحظه فریب نخورده است."
                ),
                StoryParagraph(
                    "A few days later, Porfiry appeared unexpectedly at Raskolnikov's own room, and their second meeting was even more disturbing than the first, because this time, there were no formalities to hide behind.",
                    "چند روز بعد، پورفیری به‌طور غیرمنتظره در اتاق خود راسکولنیکوف ظاهر شد، و ملاقات دومشان حتی نگران‌کننده‌تر از اولی بود، چون این بار تشریفاتی نبود که پشتش پنهان شوند."
                ),
                StoryParagraph(
                    "The investigator mentioned the murders, described them in careful detail, and then, quite casually, asked Raskolnikov what he thought of the whole affair.",
                    "بازپرس به قتل‌ها اشاره کرد، با جزئیات دقیق توصیفشان کرد، و سپس، کاملاً اتفاقی، از راسکولنیکوف پرسید که درباره‌ی کل ماجرا چه فکر می‌کند."
                ),
                StoryParagraph(
                    "Raskolnikov tried to answer calmly, but his hands were shaking, and his voice cracked more than once, and he knew that Porfiry saw everything, that Porfiry was only waiting for him to break down.",
                    "راسکولنیکوف تلاش کرد آرام پاسخ دهد، اما دست‌هایش می‌لرزیدند و صدایش بیش از یک بار شکست، و می‌دانست که پورفیری همه چیز را می‌بیند، که پورفیری فقط منتظر است او فرو بریزد."
                ),
                StoryParagraph(
                    "At the very moment of greatest tension, a strange man burst into the room and confessed to the murders, claiming that he, and not Raskolnikov, had killed Alyona and Lizaveta.",
                    "در همان لحظه‌ی بیشترین تنش، مردی عجیب به اتاق هجوم برد و به قتل‌ها اعتراف کرد و ادعا کرد که او، نه راسکولنیکوف، آلیونا و لیزاویتا را کشته است."
                ),
                StoryParagraph(
                    "Raskolnikov left the room in a daze, hardly able to believe his luck, but Porfiry was not fooled; he knew that the confession was false, and he continued to wait, patient as always.",
                    "راسکولنیکوف گیج از اتاق بیرون رفت و به‌سختی می‌توانست باورش کند، اما پورفیری فریب نخورد؛ می‌دانست که آن اعتراف دروغین است، و مثل همیشه صبورانه ادامه داد به انتظار."
                ),
                StoryParagraph(
                    "The game between the two men had only just begun, and both of them knew that it could only end in one way, with Raskolnikov either confessing on his own or being broken by the weight of his own conscience.",
                    "بازی میان آن دو مرد تازه شروع شده بود، و هر دو می‌دانستند که فقط به یک شکل می‌تواند پایان یابد، یا راسکولنیکوف خودش اعتراف می‌کند، یا زیر وزن وجدان خودش خرد می‌شود."
                ),
                StoryParagraph(
                    "Raskolnikov began to wander the streets of St. Petersburg like a ghost, unable to eat, unable to sleep, unable to find peace in any corner of the city, pursued by a guilt that would not let him rest.",
                    "راسکولنیکوف شروع کرد مثل شبحی در خیابان‌های سن‌پترزبورگ پرسه زدن، نه می‌توانست بخورد، نه بخوابد، نه در هیچ گوشه‌ای از شهر آرامش بیابد، تعقیب‌شده توسط گناهی که رهایش نمی‌کرد."
                ),
                StoryParagraph(
                    "He visited the scenes of his old life, the university, the streets where he had once walked as a free man, and everywhere he went, he felt like a stranger, like someone who no longer belonged to the human race.",
                    "او به صحنه‌های زندگی گذشته‌اش سر زد، دانشگاه، خیابان‌هایی که زمانی به‌عنوان مردی آزاد در آن‌ها قدم زده بود، و هر جا می‌رفت، مثل غریبه‌ای احساس می‌کرد، مثل کسی که دیگر به نسل بشر تعلق ندارد."
                ),
                StoryParagraph(
                    "His mother and sister arrived in the city, and when he saw them, he was overcome with shame, because he knew that they had sacrificed everything for him and that he had betrayed them in the worst way possible.",
                    "مادر و خواهرش به شهر رسیدند، و وقتی آن‌ها را دید، شرم او را فرا گرفت، چون می‌دانست که آن‌ها همه چیز را برایش فدا کرده بودند و او به بدترین شکل ممکن به آن‌ها خیانت کرده بود."
                ),
                StoryParagraph(
                    "His sister Dunya had accepted a proposal of marriage from a wealthy but cruel man named Luzhin, partly to help her brother, partly to save her family from ruin, and Raskolnikov, when he learned of it, felt a fresh wave of self-loathing.",
                    "خواهرش دونیا پیشنهاد ازدواج مردی ثروتمند اما بی‌رحم به نام لوژین را پذیرفته بود، نیمه برای کمک به برادرش، نیمه برای نجات خانواده‌اش از تباهی، و راسکولنیکوف وقتی از آن باخبر شد، موج تازه‌ای از نفرت از خودش حس کرد."
                ),
                StoryParagraph(
                    "He forbade the marriage, he argued with his mother, he drove his sister to tears, and then, when they had gone, he sat alone in his room and wept like a child, because he knew that everything he touched turned to ruin.",
                    "او ازدواج را ممنوع کرد، با مادرش بحث کرد، خواهرش را به گریه انداخت، و سپس، وقتی رفتند، تنها در اتاقش نشست و مثل بچه‌ای گریه کرد، چون می‌دانست هر چیزی که لمس می‌کند به تباهی تبدیل می‌شود."
                ),
                StoryParagraph(
                    "In the middle of all this, he found himself drawn, again and again, to the home of Marmeladov, the drunkard he had met in the tavern, and to Marmeladov's daughter Sonya, the young woman who had sacrificed everything for her family.",
                    "در میانه‌ی همه‌ی این‌ها، خودش را بارها و بارها کشیده به خانه‌ی مارملادوف، همان مستی که در میخانه دیده بود، و به سونیا دختر مارملادوف، زن جوانی که همه چیز را برای خانواده‌اش فدا کرده بود."
                ),
                StoryParagraph(
                    "There was something in Sonya that drew him, something that had nothing to do with her poverty or her profession, but with the simple, unshakeable goodness that shone from her gentle face.",
                    "چیزی در سونیا او را می‌کشید، چیزی که هیچ ربطی به فقر یا حرفه‌اش نداشت، بلکه به نیکی ساده و تزلزل‌ناپذیری داشت که از چهره‌ی مهربانش می‌درخشید."
                ),
                StoryParagraph(
                    "He did not yet understand why he felt this way, but he sensed, dimly, that this young woman held the key to something he had been searching for all his life, without ever knowing what it was.",
                    "او هنوز نمی‌فهمید چرا اینطور احساس می‌کند، اما به‌طور محو حس می‌کرد که این زن جوان کلیدی برای چیزی دارد که تمام عمر در جست‌وجویش بود، بی‌آنکه بداند چیست."
                ),
                StoryParagraph(
                    "And so, without fully realizing it, he began to walk a path that would lead him, slowly and painfully, not towards escape, but towards a confession that would save his soul.",
                    "و بنابراین، بدون آنکه کاملاً متوجه باشد، شروع کرد به قدم زدن در مسیری که او را، آهسته و دردناک، نه به سوی فرار، بلکه به سوی اعترافی می‌برد که روحش را نجات می‌داد."
                )
            )
        ),
        StoryChapter(
            number = 4, title = "Redemption and Love", titlePersian = "رستگاری و عشق",
            paragraphs = listOf(
                StoryParagraph(
                    "One evening, soon after his painful meeting with his mother and sister, Raskolnikov went to Sonya's small rented room for the first time, driven by a need he could not fully explain.",
                    "یک شب، کمی پس از دیدار دردناکش با مادر و خواهرش، راسکولنیکوف برای اولین بار به اتاق کوچک اجاره‌ای سونیا رفت، رانده‌شده توسط نیازی که کاملاً نمی‌توانست توضیح دهد."
                ),
                StoryParagraph(
                    "Sonya was the daughter of the drunkard Marmeladov, a young woman of eighteen who had been forced into prostitution by the poverty of her family, and yet she remained one of the gentlest souls in all of St. Petersburg.",
                    "سونیا دختر مارملادوف مست بود، زن جوانی هجده‌ساله که فقر خانواده‌اش او را به روسپیگری کشانده بود، و با این حال یکی از مهربان‌ترین روح‌های تمام سن‌پترزبورگ باقی مانده بود."
                ),
                StoryParagraph(
                    "Her room was small and poor, but she kept it clean and tidy, and there was something peaceful about it, something that seemed to belong to another world, far from the filth and misery of the streets outside.",
                    "اتاقش کوچک و فقیرانه بود، اما آن را تمیز و مرتب نگه می‌داشت، و چیزی آرامش‌بخش در آن بود، چیزی که به نظر می‌رسید به دنیای دیگری تعلق دارد، دور از کثافت و بدبختی خیابان‌های بیرون."
                ),
                StoryParagraph(
                    "When Raskolnikov entered, Sonya looked up at him with her large, gentle eyes, and she did not seem surprised to see him, as if she had somehow been expecting him all along.",
                    "وقتی راسکولنیکوف وارد شد، سونیا با چشمان بزرگ و مهربانش به او نگاه کرد، و به نظر نمی‌رسید از دیدنش تعجب کرده باشد، گویی به‌نحوی تمام مدت منتظرش بود."
                ),
                StoryParagraph(
                    "He sat down across from her, and for a long moment, neither of them spoke, and in that silence, Raskolnikov felt, for the first time in weeks, something like a faint trace of peace.",
                    "او روبه‌رویش نشست، و برای لحظه‌ای طولانی، هیچ‌کدام حرف نزدند، و در آن سکوت، راسکولنیکوف برای اولین بار در هفته‌ها، چیزی شبیه رد محوی از آرامش حس کرد."
                ),
                StoryParagraph(
                    "He then asked her to read him a passage from the Bible, the story of Lazarus, the man whom Jesus had raised from the dead after four days in the tomb.",
                    "سپس از او خواست برایش بخشی از انجیل را بخواند، داستان ایلعازر، مردی که عیسی پس از چهار روز در قبر، او را از مردگان برخاسته بود."
                ),
                StoryParagraph(
                    "Sonya hesitated for a moment, because she had not read aloud to anyone in a long time, but then she took the old, worn Bible from a shelf and began to read in a low, trembling voice.",
                    "سونیا لحظه‌ای تردید کرد، چون مدت‌ها بود برای کسی بلند نخوانده بود، اما سپس انجیل قدیمی و فرسوده را از قفسه‌ای برداشت و با صدایی آهسته و لرزان شروع به خواندن کرد."
                ),
                StoryParagraph(
                    "As she read the story of the dead man who rose again, her voice grew stronger, and something stirred deep inside Raskolnikov, something that had been buried under years of pride, bitterness, and despair.",
                    "وقتی داستان مرد مرده‌ای را می‌خواند که دوباره برخاست، صدایش قوی‌تر شد، و چیزی در عمق درون راسکولنیکوف تکان خورد، چیزی که زیر سال‌ها غرور، تلخی و ناامیدی مدفون شده بود."
                ),
                StoryParagraph(
                    "When she had finished, he looked at her for a long time without speaking, and then, in a broken whisper, he told her that he had come to her because he had no one else, and that he needed to tell her something terrible.",
                    "وقتی تمام کرد، مدت طولانی بدون حرف زدن نگاهش کرد، و سپس، در زمزمه‌ای شکسته، به او گفت که به او پناه آورده چون کس دیگری را ندارد، و باید چیز هولناکی به او بگوید."
                ),
                StoryParagraph(
                    "Sonya did not interrupt him, did not look away, but simply waited, patient and gentle, and her quiet presence gave him the courage he needed to speak the words he had been carrying for so long.",
                    "سونیا حرفش را قطع نکرد، نگاهش را برنگرداند، بلکه فقط منتظر ماند، صبور و مهربان، و حضور آرامش شجاعتی که لازم داشت را به او داد تا کلماتی را که این‌قدر طولانی حمل کرده بود بر زبان بیاورد."
                ),
                StoryParagraph(
                    "I killed the old pawnbroker and her sister Lizaveta, he said at last, and he told her everything, the plan, the murder, the escape, the guilt, the horror, and the endless, unending suffering that had followed.",
                    "او بالاخره گفت: من رباخوار پیر و خواهرش لیزاویتا را کشتم، و همه چیز را برایش تعریف کرد، نقشه، قتل، فرار، گناه، وحشت و رنج بی‌پایان و بی‌پایانی که به دنبالش آمده بود."
                ),
                StoryParagraph(
                    "When he was finished, he expected her to recoil from him in horror, to scream, to run, to call the police, but Sonya did none of these things.",
                    "وقتی تمام کرد، انتظار داشت با وحشت از او دور شود، فریاد بزند، فرار کند، پلیس خبر کند، اما سونیا هیچ‌کدام از این کارها را نکرد."
                ),
                StoryParagraph(
                    "Instead, she rose slowly from her chair, walked over to him, and without a word, she embraced him, and she wept, not for herself, not even for the victims, but for him, for the terrible suffering that had broken his soul.",
                    "در عوض، آهسته از صندلی بلند شد، به طرفش رفت، و بدون کلمه‌ای، او را در آغوش گرفت و گریست، نه برای خودش، نه حتی برای قربانیان، بلکه برای او، برای رنج هولناکی که روحش را شکسته بود."
                ),
                StoryParagraph(
                    "Raskolnikov was stunned by her reaction, and something inside him cracked open, and for the first time since the murders, he allowed himself to feel the full weight of what he had done.",
                    "راسکولنیکوف از واکنشش شوکه شد، و چیزی در درونش شکافت و باز شد، و برای اولین بار پس از قتل‌ها، اجازه داد وزن کامل کاری که کرده بود را حس کند."
                ),
                StoryParagraph(
                    "He buried his face in her shoulder and wept, and he wept for a long time, and Sonya held him, and neither of them spoke, because there were no words that could express what was happening between them.",
                    "صورتش را در شانه‌اش پنهان کرد و گریست، و مدت طولانی گریست، و سونیا او را نگه داشت، و هیچ‌کدام حرف نزدند، چون کلمه‌ای نبود که بتواند بیان کند چه چیزی میانشان می‌گذشت."
                ),
                StoryParagraph(
                    "When at last he pulled away, he looked at her with new eyes, and he understood, with a clarity that pierced through all his confusion, that this woman, this fallen woman, was perhaps the purest soul he had ever met.",
                    "وقتی بالاخره کنار کشید، با چشمانی جدید به او نگاه کرد، و با وضوحی که از تمام سردرگمی‌اش نفوذ می‌کرد، فهمید که این زن، این زن افتاده، شاید خالص‌ترین روحی بود که تا حالا دیده بود."
                ),
                StoryParagraph(
                    "She had broken the laws of society, just as he had, but where his crime had been born of pride and hatred, hers had been born of love and sacrifice, and that made all the difference in the world.",
                    "او هم مثل او قوانین جامعه را شکسته بود، اما آنجا که جنایت او از غرور و نفرت زاده شده بود، جنایت او از عشق و فداکاری زاده شده بود، و همین تمام تفاوت دنیا را می‌ساخت."
                ),
                StoryParagraph(
                    "Sonya told him that he must confess his crime, that he must go to the crossroads, kiss the earth he had defiled, and tell the world what he had done, and she promised to stand by him no matter what happened.",
                    "سونیا به او گفت که باید به جنایتش اعتراف کند، باید به چهارراه برود، زمینی را که آلوده کرده بوسد و به دنیا بگوید چه کرده، و قول داد هر چه پیش بیاید کنارش بماند."
                ),
                StoryParagraph(
                    "Raskolnikov was terrified by her words, because confessing meant the end of everything he had ever known, but deep down, he knew she was right, and he knew that she was the only person in the world whose judgment he truly trusted.",
                    "راسکولنیکوف از کلماتش وحشت کرد، چون اعتراف یعنی پایان هر چیزی که می‌شناخت، اما در عمق وجودش، می‌دانست که حق با اوست، و می‌دانست که او تنها فرد دنیاست که واقعاً به قضاوتش اعتماد دارد."
                ),
                StoryParagraph(
                    "A few days later, Porfiry Petrovich came to Raskolnikov's room one last time, and this time, there were no games, no hints, no careful words; he simply told him, plainly, that he knew he was the murderer.",
                    "چند روز بعد، پورفیری پتروویچ یک بار آخر به اتاق راسکولنیکوف آمد، و این بار، هیچ بازی، هیچ اشاره، هیچ کلمه‌ی محتاطانه‌ای نبود؛ او صریح گفت که می‌داند او قاتل است."
                ),
                StoryParagraph(
                    "Porfiry advised him to confess and accept his punishment, telling him that a confession would be far lighter than the endless torture of hiding, and that in prison, there might still be a chance for peace.",
                    "پورفیری به او توصیه کرد اعتراف کند و مجازاتش را بپذیرد و گفت که اعتراف بسیار سبک‌تر از شکنجه‌ی بی‌پایان پنهان شدن خواهد بود، و در زندان، شاید هنوز فرصتی برای آرامش باشد."
                ),
                StoryParagraph(
                    "Raskolnikov listened to him in silence, and when Porfiry had gone, he sat alone in his room for hours, wrestling with the last remnants of his pride, until at last, exhausted, he made his decision.",
                    "راسکولنیکوف در سکوت به او گوش داد، و وقتی پورفیری رفت، ساعت‌ها تنها در اتاقش نشست و با آخرین بازمانده‌های غرورش کشتی گرفت، تا بالاخره، خسته، تصمیمش را گرفت."
                ),
                StoryParagraph(
                    "That evening, at Sonya's insistence, he went out into the street and stopped at a crossroads, and he knelt down, and he kissed the earth, and he whispered, loud enough for passersby to hear, that he was a murderer.",
                    "آن شب، به اصرار سونیا، به خیابان رفت و در چهارراهی توقف کرد، و به زانو افتاد، و زمین را بوسید، و زمزمه کرد، به‌اندازه‌ای بلند که عابران بشنوند، که او قاتل است."
                ),
                StoryParagraph(
                    "Some of the people around him laughed, others looked at him with pity, but Raskolnikov did not care; he had done what Sonya had asked of him, and for the first time in months, he felt almost peaceful.",
                    "بعضی از مردم اطرافش خندیدند، بعضی با ترحم نگاهش کردند، اما راسکولنیکوف اهمیت نداد؛ او کاری که سونیا خواسته بود انجام داده بود، و برای اولین بار در ماه‌ها، تقریباً احساس آرامش کرد."
                ),
                StoryParagraph(
                    "A few minutes later, he walked into the police station and, in a quiet, steady voice, confessed to the murders of Alyona Ivanovna and Lizaveta Ivanovna, and then he sat down and waited for them to take him away.",
                    "چند دقیقه بعد، وارد کلانتری شد و با صدایی آرام و ثابت، به قتل‌های آلیونا ایوانوونا و لیزاویتا ایوانوونا اعتراف کرد، و سپس نشست و منتظر ماند تا او را ببرند."
                ),
                StoryParagraph(
                    "The officers were surprised, but they took his confession calmly and prepared the paperwork for his arrest, and within an hour, Raskolnikov was sitting in a prison cell, feeling stranger and freer than he had felt in weeks.",
                    "افسران تعجب کردند، اما اعترافش را آرام گرفتند و کاغذبازی دستگیری‌اش را آماده کردند، و در عرض یک ساعت، راسکولنیکوف در سلولی نشسته بود، و عجیب‌تر و آزادتر از هفته‌ها احساس می‌کرد."
                ),
                StoryParagraph(
                    "He was tried for the murders, and because of his confession and his evident remorse, he was sentenced to eight years of hard labour in Siberia, rather than to death, as many had expected.",
                    "او برای قتل‌ها محاکمه شد، و به‌خاطر اعتراف و پشیمانی آشکارش، به هشت سال کار سخت در سیبری محکوم شد، نه به اعدام، همان‌طور که بسیاری انتظار داشتند."
                ),
                StoryParagraph(
                    "Sonya, when she heard the sentence, did not weep, did not despair, did not argue; she simply packed her things, said goodbye to her family, and prepared to follow him to Siberia.",
                    "سونیا وقتی حکم را شنید، نه گریه کرد، نه ناامید شد، نه بحث کرد؛ فقط وسایلش را بست، با خانواده‌اش خداحافظی کرد و آماده شد تا به سیبری دنبالش برود."
                ),
                StoryParagraph(
                    "Her mother and sister were horrified, and they begged her not to go, but Sonya was unmoved; she told them that she loved him, that he needed her, and that she would not abandon him no matter what.",
                    "مادر و خواهرش وحشت کردند و التماس کردند نرود، اما سونیا تکان نخورد؛ به آن‌ها گفت که دوستش دارد، که او به او نیاز دارد، و هر چه پیش بیاید رهایش نمی‌کند."
                ),
                StoryParagraph(
                    "And so, a few weeks later, on a cold, grey morning in November, Raskolnikov and Sonya set off together for the long, difficult journey to Siberia, and neither of them knew what awaited them at the end of it.",
                    "و بنابراین، چند هفته بعد، در صبحی سرد و خاکستری در ماه نوامبر، راسکولنیکوف و سونیا با هم برای سفر طولانی و دشوار به سیبری راه افتادند، و هیچ‌کدام نمی‌دانستند در انتهایش چه چیزی در انتظارشان است."
                ),
                StoryParagraph(
                    "The journey took many weeks, and Raskolnikov sat in silence for most of it, thinking about his crime, about his punishment, about the strange twist of fate that had brought him here.",
                    "سفر هفته‌های بسیاری طول کشید، و راسکولنیکوف بیشترش را در سکوت نشست، به جنایتش فکر می‌کرد، به مجازاتش، به پیچش عجیب تقدیری که او را به اینجا آورده بود."
                ),
                StoryParagraph(
                    "But as the miles passed, something began to change in him, something subtle and slow, and by the time they reached the prison colony in Siberia, he was not the same man who had left St. Petersburg.",
                    "اما با گذشت مایل‌ها، چیزی در او شروع به تغییر کرد، چیزی ظریف و آهسته، و تا زمانی که به مستعمره‌ی زندان در سیبری رسیدند، او همان مردی نبود که سن‌پترزبورگ را ترک کرده بود."
                ),
                StoryParagraph(
                    "In prison, Raskolnikov was at first withdrawn and bitter, refusing to speak to the other prisoners, unable to accept his situation, unable to forgive himself for what he had done.",
                    "در زندان، راسکولنیکوف ابتدا در خود فرو رفته و تلخ بود، از حرف زدن با سایر زندانیان امتناع می‌کرد، نمی‌توانست وضعیتش را بپذیرد، نمی‌توانست خودش را برای کاری که کرده بود ببخشد."
                ),
                StoryParagraph(
                    "Sonya settled in a small town near the prison, and every Sunday, she came to visit him, bringing him bread, books, and news of the outside world, and slowly, patiently, she began to break through his walls.",
                    "سونیا در شهر کوچکی نزدیک زندان ساکن شد، و هر یکشنبه، به دیدنش می‌آمد، نان، کتاب و خبرهایی از دنیای بیرون برایش می‌آورد، و آهسته و صبورانه، شروع کرد به شکستن دیوارهایش."
                ),
                StoryParagraph(
                    "At first, Raskolnikov accepted her visits coldly, almost with resentment, because her kindness seemed to him an accusation of everything he was not, but she did not waver, and she did not stop coming.",
                    "اول، راسکولنیکوف دیدارهایش را سرد پذیرفت، تقریباً با کینه، چون مهربانی‌اش برایش اتهامی بود به هر چیزی که نبود، اما او متزلزل نشد و از آمدن دست نکشید."
                ),
                StoryParagraph(
                    "Months passed, and then a year, and slowly, without his even realizing it, Raskolnikov began to look forward to her visits, and to feel, in her presence, the first real peace he had known since the murders.",
                    "ماه‌ها گذشت، و سپس یک سال، و آهسته، بی‌آنکه خودش حتی متوجه شود، راسکولنیکوف شروع کرد به انتظار دیدارهایش، و در حضورش، اولین آرامش واقعی را که از زمان قتل‌ها شناخته بود حس کرد."
                ),
                StoryParagraph(
                    "One day, watching her from across the prison yard, Raskolnikov suddenly understood, with a shock that went through his entire body, that he loved her, and that he had perhaps loved her from the very beginning.",
                    "یک روز، در حالی که از آن طرف حیاط زندان تماشایش می‌کرد، راسکولنیکوف ناگهان فهمید، با شوکي که در تمام بدنش پیچید، که دوستش دارد، و شاید از همان ابتدا دوستش داشته است."
                ),
                StoryParagraph(
                    "He threw himself at her feet and wept, and for the first time, he wept not out of guilt, or despair, or self-hatred, but out of love, out of gratitude, out of the simple, overwhelming recognition that he was not alone.",
                    "خود را به پای او انداخت و گریست، و برای اولین بار، نه از گناه گریست، نه از ناامیدی، نه از نفرت از خود، بلکه از عشق، از سپاسگزاری، از شناخت ساده و فراگیر اینکه تنها نیست."
                ),
                StoryParagraph(
                    "Sonya knelt beside him and held him, and she too wept, and in that moment, on the cold, distant soil of Siberia, both of them began, at last, to heal from the wounds that life had given them.",
                    "سونیا کنارش زانو زد و او را در آغوش گرفت، و او هم گریست، و در آن لحظه، روی خاک سرد و دورافتاده‌ی سیبری، هر دوی آن‌ها بالاخره شروع کردند به بهبودی از زخم‌هایی که زندگی به آن‌ها زده بود."
                ),
                StoryParagraph(
                    "Raskolnikov still had many years of his sentence to serve, and he knew that the road ahead would be long and difficult, but for the first time in his life, he had something worth serving his sentence for.",
                    "راسکولنیکوف هنوز سال‌های بسیاری از محکومیتش را باید می‌گذراند، و می‌دانست که راه پیش‌رو طولانی و دشوار خواهد بود، اما برای اولین بار در زندگی‌اش، چیزی داشت که ارزش گذراندن دوران محکومیتش را داشته باشد."
                ),
                StoryParagraph(
                    "He had killed two women because he believed he was extraordinary, because he believed the rules of ordinary men did not apply to him, and now, sitting in a prison in Siberia, he finally understood how wrong he had been.",
                    "او دو زن را کشته بود چون باور داشت استثنایی است، چون باور داشت قوانین مردان معمولی به او مربوط نمی‌شود، و حالا، در زندانی در سیبری نشسته، بالاخره فهمید که چقدر اشتباه کرده بود."
                ),
                StoryParagraph(
                    "There were no extraordinary men, he realized, or rather, every man was extraordinary, in his own small way, and the only true greatness lay not in rising above others, but in loving them.",
                    "مرد استثنایی وجود نداشت، دریافت، یا بهتر بگویم، هر انسانی استثنایی بود، به شیوه‌ی کوچک خودش، و تنها عظمت واقعی در برتری از دیگران نبود، بلکه در دوست داشتن آن‌ها بود."
                ),
                StoryParagraph(
                    "Sonya had taught him this, not with words or arguments or theories, but with her life, with her quiet sacrifice, with the way she gave everything she had and asked for nothing in return.",
                    "سونیا این را به او آموخته بود، نه با کلمات یا بحث یا نظریه‌ها، بلکه با زندگی‌اش، با فداکاری آرامش، با شیوه‌ای که هر چه داشت می‌داد و در عوض چیزی نمی‌خواست."
                ),
                StoryParagraph(
                    "He thought of his mother, who had died during his imprisonment, of his sister Dunya, who had forgiven him and built a life of her own, and he wept for the years he had wasted in pride and hatred.",
                    "به مادرش فکر کرد که در طول زندانیش مرده بود، به خواهرش دونیا که بخشیده بودش و زندگی خودش را ساخته بود، و برای سال‌هایی که در غرور و نفرت هدر داده بود گریست."
                ),
                StoryParagraph(
                    "When the novel ends, Raskolnikov still has seven years of his sentence left to serve, and he is still on the long road towards true peace, but he is no longer alone on that road.",
                    "وقتی رمان به پایان می‌رسد، راسکولنیکوف هنوز هفت سال از محکومیتش را باید بگذراند، و هنوز در مسیر طولانی به سوی آرامش واقعی است، اما دیگر در آن مسیر تنها نیست."
                ),
                StoryParagraph(
                    "Sonya remains by his side, patient and loving, and every Sunday, she still comes to visit him, and every Sunday, they sit together and talk about the future they will build when he is free.",
                    "سونیا کنارش می‌ماند، صبور و پر عشق، و هر یکشنبه هنوز به دیدنش می‌آید، و هر یکشنبه با هم می‌نشینند و درباره‌ی آینده‌ای که وقتی آزاد شود خواهند ساخت حرف می‌زنند."
                ),
                StoryParagraph(
                    "And slowly, painfully, one day at a time, the man who had once believed himself to be above all other men was learning, at last, what it truly means to be human.",
                    "و آهسته، دردناک، روزی یکی، مردی که زمانی خودش را بالاتر از همه‌ی مردان دیگر می‌دانست، بالاخره داشت می‌آموخت معنای واقعی انسان بودن چیست."
                ),
                StoryParagraph(
                    "This was the redemption that Dostoevsky wanted his readers to find, hidden beneath all the suffering and the crime, the quiet, humble truth that love could heal what nothing else could.",
                    "این همان رستگاری بود که داستایوفسکی می‌خواست خوانندگانش آن را بیابند، پنهان در زیر تمام رنج و جنایت، حقیقت آرام و فروتنانه‌ای که عشق می‌توانست چیزی را درمان کند که هیچ چیز دیگری نمی‌توانست."
                )
            )
        )
    )
),    // ─────────────── ۳۳: آنا کارنینا ───────────────
    private fun story33() = StoryContent(
        storyId = "int_anna_karenina",
        chapters = listOf(
            StoryChapter(
                number = 1, title = "A Chance Meeting", titlePersian = "ملاقاتی تصادفی",
                paragraphs = listOf(
                    StoryParagraph(
                        "Prince Stepan Arkadyevich Oblonsky, known to his friends as Stiva, had caused a scandal in his household, and for the past three days, his wife Dolly had refused to leave her room or speak to him.",
                        "شاهزاده استپان آرکادیویچ ابلونسکی، که دوستانش او را استیوا می‌نامیدند، در خانه‌اش رسوایی به بار آورده بود، و سه روز بود که همسرش دالی از اتاقش بیرون نمی‌آمد و با او حرف نمی‌زد."
                    ),
                    StoryParagraph(
                        "Dolly had discovered that her husband had been having an affair with the children's French governess, and the betrayal had shattered something deep inside her.",
                        "دالی کشف کرده بود که شوهرش با معلم سرخانه‌ی فرانسوی بچه‌ها رابطه دارد، و این خیانت چیزی عمیق در درونش را شکسته بود."
                    ),
                    StoryParagraph(
                        "Stiva, though guilty, could not bring himself to feel truly sorry for what he had done; he was a man who lived for pleasure and could not understand why anyone would make such a fuss over a passing fancy.",
                        "استیوا، هرچند گناهکار بود، نمی‌توانست واقعاً از کاری که کرده بود پشیمان شود؛ او مردی بود که برای لذت زندگی می‌کرد و نمی‌فهمید چرا کسی باید بر سر هوسی گذرا این‌قدر جنجال کند."
                    ),
                    StoryParagraph(
                        "In desperation, he sent a telegram to his sister Anna Arkadyevna Karenina in St. Petersburg, begging her to come to Moscow and help him save his marriage.",
                        "در ناچاری، تلگرافی برای خواهرش آنا آرکادیونا کارنینا در سن‌پترزبورگ فرستاد و التماس کرد به مسکو بیاید و کمکش کند ازدواجش را نجات دهد."
                    ),
                    StoryParagraph(
                        "Anna was the wife of Alexei Alexandrovich Karenin, a senior government official twenty years older than her, a man of cold precision and rigid principle.",
                        "آنا همسر آلکسی آلکساندراویچ کارنین بود، مقام عالی‌رتبه‌ی دولتی بیست سال بزرگ‌تر از او، مردی با دقت سرد و اصول سختگیرانه."
                    ),
                    StoryParagraph(
                        "Her marriage had never been a love match; it had been arranged, like most marriages in their circle, and though she respected her husband, she did not love him, and she knew in her heart that he did not truly love her either.",
                        "ازدواجش هرگز ازدواج عاشقانه‌ای نبوده بود؛ مثل اکثر ازدواج‌های طبقه‌شان ترتیب داده شده بود، و هرچند به شوهرش احترام می‌گذاشت، دوستش نداشت، و در قلبش می‌دانست که او هم واقعاً دوستش ندارد."
                    ),
                    StoryParagraph(
                        "When the telegram arrived, Anna was sitting in her elegant Petersburg drawing room, and she read her brother's desperate words with a mixture of pity and amusement.",
                        "وقتی تلگراف رسید، آنا در نشیمن شیک پترزبورگش نشسته بود و کلمات درمانده‌ی برادرش را با آمیزه‌ای از ترحم و سرگرمی خواند."
                    ),
                    StoryParagraph(
                        "She loved Stiva dearly, despite all his faults, and she decided at once that she would go to Moscow and try to repair the damage he had caused.",
                        "او استیوا را با وجود همه‌ی عیب‌هایش عمیقاً دوست داشت و فوراً تصمیم گرفت به مسکو برود و تلاش کند خرابی‌ای که او ایجاد کرده بود ترمیم کند."
                    ),
                    StoryParagraph(
                        "Her husband, when she told him of her plan, responded with his usual cold politeness, saying only that he hoped her journey would be useful and that she should not stay away too long from their son Seryozha.",
                        "شوهرش وقتی از نقشه‌اش باخبر شد، با ادب سرد همیشگی‌اش پاسخ داد و فقط گفت امیدوار است سفرش مفید باشد و نباید زیاد از پسرشان سریوژا دور بماند."
                    ),
                    StoryParagraph(
                        "The next morning, Anna boarded the night train to Moscow, and as the snow-covered fields of Russia rushed past her window, she felt a strange, unfamiliar excitement stirring in her heart.",
                        "صبح روز بعد، آنا سوار قطار شبانه به مسکو شد، و در حالی که دشت‌های پوشیده از برف روسیه از پنجره‌اش می‌گذشتند، هیجانی عجیب و ناآشنا در قلبش احساس کرد."
                    ),
                    StoryParagraph(
                        "She did not know why she felt this way, and she did not try to understand it; she only knew that she was leaving behind, for a little while, the cold formality of her life in Petersburg.",
                        "نمی‌دانست چرا اینطور احساس می‌کند و تلاش نکرد بفهمد؛ فقط می‌دانست که برای مدتی کوتاه، رسمیت سرد زندگی‌اش در پترزبورگ را پشت سر می‌گذارد."
                    ),
                    StoryParagraph(
                        "At the Moscow railway station, she was met by her brother Stiva, whose handsome face was clouded with shame and whose cheerful eyes could not quite meet hers.",
                        "در ایستگاه راه‌آهن مسکو، برادرش استیوا به استقبالش آمد، چهره‌ی خوش‌قیافه‌اش از شرم ابری بود و چشمان شادش نمی‌توانستند مستقیم به او نگاه کنند."
                    ),
                    StoryParagraph(
                        "He embraced her warmly, as he always did, and thanked her again and again for coming, and he told her, with his usual carelessness, that everything would surely work out in the end.",
                        "او مثل همیشه گرم در آغوشش گرفت و بارها و بارها از آمدنش تشکر کرد، و با بی‌خیالی همیشگی‌اش گفت که مطمئناً در نهایت همه چیز حل می‌شود."
                    ),
                    StoryParagraph(
                        "As they walked through the crowded station towards the exit, Anna noticed, in a group of waiting passengers, a young officer with a kind and serious face, whose eyes, for a brief moment, met hers.",
                        "در حالی که از میان ایستگاه شلوغ به سمت خروجی می‌رفتند، آنا در میان گروهی از مسافران منتظر، افسر جوانی با چهره‌ای مهربان و جدی دید که چشمانش برای لحظه‌ای کوتاه به چشمان او افتاد."
                    ),
                    StoryParagraph(
                        "At that very moment, a terrible cry rose from somewhere on the platform, and everyone turned to see what had happened, and in the confusion that followed, Anna learned that a railway worker had fallen and been crushed by a passing train.",
                        "در همان لحظه، فریاد هولناکی از جایی روی سکو بلند شد و همه برگشتند تا ببینند چه اتفاقی افتاده، و در آشفتگی بعدی، آنا فهمید که کارگری راه‌آهن افتاده و قطاری در حال عبور او را له کرده است."
                    ),
                    StoryParagraph(
                        "The young officer, whose name was Count Alexei Kirillovich Vronsky, rushed forward without hesitation to help, and he gave money to the widow of the dead man without a second thought.",
                        "افسر جوان، که نامش کنت آلکسی کیریلوویچ ورونسکی بود، بدون تردید برای کمک شتافت و بی‌درنگ به بیوه‌ی مرد مرده پول داد."
                    ),
                    StoryParagraph(
                        "Anna was deeply moved by his kindness and by the tragedy she had just witnessed, and she felt, in that moment, that this day would somehow be important in her life.",
                        "آنا از مهربانی او و از تراژدی‌ای که تازه دیده بود عمیقاً متأثر شد، و در آن لحظه حس کرد که این روز به‌نحوی در زندگی‌اش مهم خواهد بود."
                    ),
                    StoryParagraph(
                        "To her, the accident seemed like a bad omen for her visit to Moscow, a dark shadow that fell across the beginning of something she did not yet understand.",
                        "به نظرش، آن حادثه مثل فال بدی برای سفرش به مسکو آمد، سایه‌ای تاریک که بر آغاز چیزی که هنوز نمی‌فهمید افتاده بود."
                    ),
                    StoryParagraph(
                        "Vronsky, on his part, was struck by Anna's beauty and by the peculiar grace of her every movement, and he could not stop himself from looking at her as she walked past him with her brother.",
                        "ورونسکی هم از زیبایی آنا و از ظرافت عجیب هر حرکتش مسحور شد و نتوانست جلوی خودش را بگیرد که وقتی او با برادرش از کنارش می‌گذشت، نگاهش نکند."
                    ),
                    StoryParagraph(
                        "Although he was, at that time, paying court to Dolly's younger sister Kitty, a sweet and innocent girl of eighteen, he found his thoughts drifting, again and again, back to the dark-eyed woman he had just seen.",
                        "با اینکه در آن زمان به خواستگاری خواهر کوچک‌تر دالی، کیتی، دختری شیرین و معصوم هجده‌ساله می‌رفت، متوجه شد که افکارش بارها و بارها به زن سیاه‌چشمی که تازه دیده بود برمی‌گردد."
                    ),
                    StoryParagraph(
                        "Anna herself was unaware of the effect she had on him, just as she was unaware of the effect she had on almost everyone she met, and all she wanted, in those first days in Moscow, was to help her brother and his suffering wife.",
                        "خود آنا از تأثیری که بر او گذاشته بود بی‌خبر بود، همان‌طور که از تأثیری که بر تقریباً همه‌ی کسانی که ملاقات می‌کرد داشت بی‌خبر بود، و تنها چیزی که در آن روزهای اول در مسکو می‌خواست این بود که به برادرش و همسر رنج‌کشیده‌اش کمک کند."
                    ),
                    StoryParagraph(
                        "But she could not forget the young officer's face, nor the strange sense of recognition she had felt when their eyes had met, and she knew, even then, that something had begun that could not be stopped.",
                        "اما نمی‌توانست چهره‌ی آن افسر جوان را فراموش کند، و نه حس عجیب آشنایی‌ای که وقتی چشمانشان به هم افتاد حس کرده بود، و حتی همان موقع می‌دانست که چیزی شروع شده که نمی‌توان متوقفش کرد."
                    ),
                    StoryParagraph(
                        "She arrived at Stiva's house, where she found her sister-in-law Dolly in a state of utter despair, weeping in her room while her children played noisily in the next room, unaware of their parents' pain.",
                        "به خانه‌ی استیوا رسید و خواهرشوهرش دالی را در وضعیت ناامیدی مطلق یافت، در اتاقش گریه می‌کرد در حالی که بچه‌هایش در اتاق بعدی پر سر و صدا بازی می‌کردند و از رنج والدینشان بی‌خبر بودند."
                    ),
                    StoryParagraph(
                        "Anna sat with Dolly for hours, listening to her grief, holding her hand, and speaking to her with a gentleness that no one else in the family could have managed.",
                        "آنا ساعت‌ها با دالی نشست، به غمش گوش داد، دستش را گرفت، و با مهربانی‌ای با او سخن گفت که هیچ‌کس دیگر در خانواده نمی‌توانست."
                    ),
                    StoryParagraph(
                        "She did not defend her brother, did not make excuses for him, but she spoke to Dolly of forgiveness, of the strength of women, of the importance of holding a family together for the sake of the children.",
                        "او از برادرش دفاع نکرد، برایش بهانه نیاورد، اما با دالی از بخشش گفت، از قدرت زنان، از اهمیت حفظ خانواده برای خاطر بچه‌ها."
                    ),
                    StoryParagraph(
                        "By the end of the day, Dolly had agreed, reluctantly, to give Stiva another chance, not because she had forgiven him, but because she could not imagine a life without him and her children.",
                        "تا پایان روز، دالی به‌اکراه موافقت کرد به استیوا فرصت دیگری بدهد، نه چون بخشیده بودش، بلکه چون نمی‌توانست زندگی‌ای بدون او و بچه‌هایش تصور کند."
                    ),
                    StoryParagraph(
                        "Anna was pleased with her success, but she was also troubled, because she knew in her heart that forgiving a man like Stiva was not the same as trusting him, and that Dolly's happiness might be fragile.",
                        "آنا از موفقیتش خوشحال بود، اما مضطرب هم بود، چون در قلبش می‌دانست بخشیدن مردی مثل استیوا همان اعتماد کردن به او نیست، و خوشبختی دالی ممکن بود شکننده باشد."
                    ),
                    StoryParagraph(
                        "That evening, she attended a grand ball at the governor's house, and it was there, in that glittering hall of candles and music, that everything changed.",
                        "آن شب، در رقصی باشکوه در خانه‌ی فرماندار شرکت کرد، و آنجا بود، در آن تالار پرزرق‌وبرق شمع و موسیقی، که همه چیز تغییر کرد."
                    ),
                    StoryParagraph(
                        "Kitty, who loved Vronsky with all the innocence of her young heart, had been dreaming of this ball for weeks, and she wore a pale pink gown that made her look like a princess.",
                        "کیتی که با تمام معصومیت قلب جوانش عاشق ورونسکی بود، هفته‌ها رویای این رقص را در سر داشت و لباس صورتی کم‌رنگی پوشیده بود که او را شبیه شاهزاده‌خانمی می‌کرد."
                    ),
                    StoryParagraph(
                        "She believed that tonight, at last, Vronsky would propose to her, and she had rehearsed the moment in her mind so many times that she was certain of what would happen.",
                        "باور داشت که امشب، بالاخره، ورونسکی خواستگاری‌اش می‌کند، و آن لحظه را آن‌قدر بارها در ذهنش مرور کرده بود که از آنچه خواهد شد مطمئن بود."
                    ),
                    StoryParagraph(
                        "But when Vronsky arrived, his eyes searched the room for someone else, and when he found Anna, standing quietly near a window in her simple black gown, he forgot entirely that Kitty existed.",
                        "اما وقتی ورونسکی رسید، چشمانش کس دیگری را در اتاق می‌جست، و وقتی آنا را یافت که در لباس ساده‌ی سیاهش آرام نزدیک پنجره ایستاده بود، کاملاً فراموش کرد که کیتی وجود دارد."
                    ),
                    StoryParagraph(
                        "He walked over to Anna and asked her to dance the first waltz, and she accepted, and as they moved together across the ballroom floor, something between them began that neither of them could control.",
                        "او به طرف آنا رفت و از او خواست اولین والس را برقصند، و او پذیرفت، و در حالی که با هم روی زمین تالار رقص می‌چرخیدند، چیزی میانشان شروع شد که هیچ‌کدام نمی‌توانستند کنترل کنند."
                    ),
                    StoryParagraph(
                        "Kitty watched from the side, and with every turn of the dance, her heart broke a little more, until at last, unable to bear it any longer, she fled the ballroom in tears.",
                        "کیتی از کنار تماشا کرد، و با هر چرخی که می‌زدند قلبش کمی بیشتر شکست، تا بالاخره، چون دیگر نتوانست تحمل کند، گریان از تالار فرار کرد."
                    ),
                    StoryParagraph(
                        "Anna noticed Kitty's pain, and she felt a sharp pang of guilt, but even that guilt could not stop her from dancing with Vronsky again and again, until the ball came to an end.",
                        "آنا درد کیتی را دید و نیش تندی از گناه حس کرد، اما حتی آن گناه هم نتوانست مانعش شود که بارها و بارها با ورونسکی برقصد، تا وقتی رقص به پایان رسید."
                    ),
                    StoryParagraph(
                        "That night, as she lay in her bed at Stiva's house, Anna told herself that she had done nothing wrong, that she had only danced with a young man, that her feelings were foolish and would pass.",
                        "آن شب، در حالی که در تختش در خانه‌ی استیوا دراز کشیده بود، آنا به خودش گفت که کار اشتباهی نکرده، که فقط با جوانی رقصیده، که احساساتش احمقانه‌اند و می‌گذرند."
                    ),
                    StoryParagraph(
                        "But deep inside, she knew the truth; she knew that something had awakened in her that she had long thought dead, and she knew that the safe, orderly life she had built for herself in Petersburg would never feel the same again.",
                        "اما در عمق وجودش، حقیقت را می‌دانست؛ می‌دانست که چیزی در او بیدار شده بود که مدت‌ها فکر می‌کرد مرده است، و می‌دانست که زندگی امن و منظمی که در پترزبورگ برای خودش ساخته بود هرگز دیگر همان حس را نخواهد داشت."
                    ),
                    StoryParagraph(
                        "The next morning, she went to see Dolly one last time before her departure, and she found her sister-in-law calmer, ready to try again, grateful for Anna's help.",
                        "صبح روز بعد، پیش از رفتنش یک بار آخر به دیدن دالی رفت، و خواهرشوهرش را آرام‌تر یافت، آماده‌ی تلاش دوباره، سپاسگزار برای کمک آنا."
                    ),
                    StoryParagraph(
                        "Anna embraced her warmly, and then she embraced the children, and then she went to the station to catch the train back to Petersburg, hoping that distance would help her forget the young officer's face.",
                        "آنا او را گرم در آغوش گرفت، و بعد بچه‌ها را در آغوش گرفت، و سپس به ایستگاه رفت تا قطار بازگشت به پترزبورگ را بگیرد، به امید آنکه فاصله کمکش کند چهره‌ی آن افسر جوان را فراموش کند."
                    ),
                    StoryParagraph(
                        "But when she stepped onto the platform, she saw him again, standing there in the falling snow, waiting for her, and she knew, with a certainty that chilled her, that he had followed her.",
                        "اما وقتی روی سکو قدم گذاشت، او را دوباره دید، آنجا در برف در حال بارش ایستاده بود، منتظر او، و با اطمینانی که سردش کرد فهمید که او دنبالش آمده است."
                    ),
                    StoryParagraph(
                        "Vronsky walked up to her and said, in a low voice, that he had to see her again, that he could not let her leave without telling her what he felt.",
                        "ورونسکی به طرفش رفت و با صدایی آهسته گفت که باید دوباره ببیندش، که نمی‌تواند بگذارد بدون آنکه احساساتش را به او بگوید برود."
                    ),
                    StoryParagraph(
                        "Anna told him, calmly, that she was a married woman, that she loved her husband, that she loved her son, and that she did not want to hear such words from him ever again.",
                        "آنا آرام به او گفت که زنی متأهل است، شوهرش را دوست دارد، پسرش را دوست دارد، و نمی‌خواهد هرگز دوباره چنین کلماتی از او بشنود."
                    ),
                    StoryParagraph(
                        "But even as she spoke these words, she knew they were not entirely true, and Vronsky, looking into her eyes, knew it too, and he smiled, not with triumph, but with a strange and sad tenderness.",
                        "اما حتی همان‌طور که این کلمات را می‌گفت، می‌دانست که کاملاً درست نیستند، و ورونسکی، در حالی که به چشمانش نگاه می‌کرد، او هم می‌دانست، و لبخند زد، نه از پیروزی، بلکه با مهربانی عجیب و غمگینی."
                    ),
                    StoryParagraph(
                        "Anna boarded the train, and as it pulled away from the station, she looked out the window and saw him standing there, watching her go, and she felt something inside her break.",
                        "آنا سوار قطار شد، و وقتی قطار از ایستگاه دور می‌شد، از پنجره به بیرون نگاه کرد و او را دید که همان‌جا ایستاده و رفتنش را تماشا می‌کند، و حس کرد چیزی در درونش شکست."
                    ),
                    StoryParagraph(
                        "She wept quietly in her compartment, and she told herself that she would forget him, that she would return to her old life, that everything would go back to the way it had been before.",
                        "در کوپه‌اش بی‌صدا گریه کرد و به خودش گفت که فراموشش می‌کند، به زندگی قدیمی‌اش برمی‌گردد، همه چیز به همان شکلی که بود برمی‌گردد."
                    ),
                    StoryParagraph(
                        "But she knew, in the deepest part of her being, that she was lying to herself, and that the life she was returning to was not the same life at all, because she was no longer the same woman who had left it.",
                        "اما در عمیق‌ترین بخش وجودش می‌دانست که به خودش دروغ می‌گوید، و زندگی‌ای که به آن برمی‌گشت اصلاً همان زندگی نبود، چون دیگر همان زنی نبود که ترکش کرده بود."
                    ),
                    StoryParagraph(
                        "She had been kissed by fate, and fate, once invited in, does not easily leave, and she knew that her life would be divided forever into the time before this moment and the time after it.",
                        "تقدیر او را بوسیده بود، و تقدیر، وقتی یک بار دعوت شود، به‌آسانی نمی‌رود، و می‌دانست که زندگی‌اش برای همیشه به زمان پیش از این لحظه و زمان پس از آن تقسیم می‌شود."
                    ),
                    StoryParagraph(
                        "The train rushed on through the winter night, carrying her back to Petersburg, to her husband, to her son, to the life she had promised to live.",
                        "قطار در شب زمستانی به پیش می‌رفت و او را به پترزبورگ برمی‌گرداند، نزد شوهرش، نزد پسرش، نزد زندگی‌ای که قول داده بود بگذراند."
                    ),
                    StoryParagraph(
                        "But even as it carried her home, she knew, with a certainty that terrified her, that she was not going home at all, but towards something entirely new and entirely dangerous.",
                        "اما حتی همان‌طور که او را به خانه می‌برد، با اطمینانی که وحشتزده‌اش کرد می‌دانست که اصلاً به خانه نمی‌رود، بلکه به سوی چیزی کاملاً جدید و کاملاً خطرناک می‌رود."
                    ),
                    StoryParagraph(
                        "And so began the story of Anna Karenina, the story of a woman who broke the rules of her society and paid for it with everything she had.",
                        "و اینگونه داستان آنا کارنینا آغاز شد، داستان زنی که قوانین جامعه‌اش را شکست و با هر چه داشت تاوانش را پرداخت."
                    ),
                    StoryParagraph(
                        "It is a story that has been told and retold for more than a century, and it will continue to be told as long as there are people who understand what it means to love beyond the boundaries of the permitted.",
                        "داستانی است که بیش از یک قرن است تعریف و بازتعریف می‌شود و تا وقتی افرادی هستند که می‌فهمند عشق ورزیدن فراتر از مرزهای مجاز یعنی چه، همچنان تعریف خواهد شد."
                    )
                )
            ),
            StoryChapter(
                number = 2, title = "Love and Marriage", titlePersian = "عشق و ازدواج",
                paragraphs = listOf(
                    StoryParagraph(
                        "When Anna returned to St. Petersburg, she found that the life she had left behind had not changed at all, but she herself had changed, and the change made everything around her feel strange and cold.",
                        "وقتی آنا به سن‌پترزبورگ بازگشت، دید زندگی‌ای که پشت سر گذاشته بود اصلاً تغییر نکرده، اما خودش تغییر کرده بود، و این تغییر همه چیز اطرافش را عجیب و سرد می‌کرد."
                    ),
                    StoryParagraph(
                        "Her husband Alexei Alexandrovich, as always, greeted her with formal politeness, asking about her journey, her brother's health, and her sister-in-law's situation, without a single question that suggested he truly cared.",
                        "شوهرش آلکسی آلکساندراویچ، مثل همیشه، با ادب رسمی به استقبالش آمد و درباره‌ی سفرش، سلامت برادرش و وضعیت خواهرشوهرش پرسید، بدون حتی یک سوال که نشان دهد واقعاً اهمیت می‌دهد."
                    ),
                    StoryParagraph(
                        "Their son Seryozha, however, ran into her arms with all the joy of a child who had missed his mother, and for a few moments, Anna felt that perhaps she really was home.",
                        "اما پسرشان سریوژا با تمام شادی بچه‌ای که دلتنگ مادرش شده بود به آغوشش دوید، و برای چند لحظه، آنا حس کرد که شاید واقعاً به خانه برگشته است."
                    ),
                    StoryParagraph(
                        "She spent the next few days in her usual routine, visiting friends, attending dinners, receiving guests, and every day, she told herself that the strange excitement she had felt in Moscow had been nothing but a passing fancy.",
                        "روزهای بعد را در روال همیشگی‌اش گذراند، به دیدن دوستان رفت، در شام‌ها شرکت کرد، مهمان پذیرفت، و هر روز به خودش می‌گفت که هیجان عجیبی که در مسکو حس کرده بود فقط هوسی گذرا بوده است."
                    ),
                    StoryParagraph(
                        "But she could not quite believe her own words, because every time she closed her eyes, she saw Vronsky's face, and every time she heard footsteps behind her, she turned, half-hoping, half-fearing, that it would be him.",
                        "اما نمی‌توانست کاملاً به حرف‌های خودش باور داشته باشد، چون هر بار چشمانش را می‌بست چهره‌ی ورونسکی را می‌دید، و هر بار صدای قدم‌هایی پشت سرش می‌شنید برمی‌گشت، نیمی امیدوار، نیمی هراسان، که او باشد."
                    ),
                    StoryParagraph(
                        "Then, a few weeks after her return, she saw him at a party, standing across the room, looking at her with those serious eyes that she remembered so well.",
                        "سپس، چند هفته پس از بازگشتش، در یک مهمانی دیدش، آن طرف اتاق ایستاده بود و با همان چشمان جدی که خوب به یاد داشت نگاهش می‌کرد."
                    ),
                    StoryParagraph(
                        "Her heart stopped, then raced, then stopped again, and she had to sit down because her legs would not hold her, and she knew then that all her efforts to forget him had been in vain.",
                        "قلبش ایستاد، سپس تند زد، سپس دوباره ایستاد، و مجبور شد بنشیند چون پاهایش نگهش نمی‌داشتند، و آن موقع دانست که تمام تلاش‌هایش برای فراموش کردنش بیهوده بوده است."
                    ),
                    StoryParagraph(
                        "From that evening onwards, Vronsky began to appear everywhere Anna went; at balls, at the theatre, at the homes of mutual friends, at dinners, at concerts, at every possible place where polite society gathered.",
                        "از آن شب به بعد، ورونسکی شروع کرد در هر جایی که آنا می‌رفت ظاهر شدن؛ در رقص‌ها، در تئاتر، در خانه‌های دوستان مشترک، در شام‌ها، در کنسرت‌ها، در هر جای ممکنی که جامعه‌ی مؤدبانه جمع می‌شد."
                    ),
                    StoryParagraph(
                        "He did not speak to her of love again, but he did not need to, because his presence spoke louder than any words could, and everyone around them began to notice.",
                        "او دیگر با او از عشق حرف نزد، اما نیازی نبود، چون حضورش بلندتر از هر کلمه‌ای سخن می‌گفت، و همه‌ی اطرافیانشان شروع کردند به توجه."
                    ),
                    StoryParagraph(
                        "Society, which had once welcomed Anna as one of its most admired women, began to whisper behind her back, to raise eyebrows, to exchange meaningful glances whenever she entered a room.",
                        "جامعه‌ای که زمانی آنا را به‌عنوان یکی از محبوب‌ترین زنانش پذیرفته بود، شروع کرد پشت سرش پچ‌پچ کردن، ابرو بالا بردن، نگاه‌های معنادار ردوبدل کردن هر بار که وارد اتاقی می‌شد."
                    ),
                    StoryParagraph(
                        "Her husband, who was too proud to ask and too cold to care, said nothing for a long time, but Anna could feel his disapproval growing like a silent pressure around her.",
                        "شوهرش که بیش از حد مغرور بود که بپرسد و بیش از حد سرد که اهمیت دهد، مدت طولانی چیزی نگفت، اما آنا می‌توانست نارضایتی‌اش را مثل فشاری خاموش دور خودش حس کند."
                    ),
                    StoryParagraph(
                        "One evening, after a particularly painful party where she had felt the eyes of everyone upon her, Karenin finally spoke to her about it in his calm, measured voice.",
                        "یک شب، پس از مهمانی‌ای به‌ویژه دردناک که در آن نگاه همه را روی خودش حس کرده بود، کارنین بالاخره با صدای آرام و سنجیده‌اش درباره‌اش با او صحبت کرد."
                    ),
                    StoryParagraph(
                        "He reminded her of her duties as a wife and a mother, of the importance of reputation, of the sacredness of the family, and he asked her, without anger but with cold authority, to end whatever it was that was going on.",
                        "او وظایفش را به‌عنوان همسر و مادر یادآوری کرد، اهمیت آبرو را، قداست خانواده را، و بدون خشم اما با اقتدار سردی از او خواست هر چه در جریان است را تمام کند."
                    ),
                    StoryParagraph(
                        "Anna listened to him in silence, and when he had finished, she simply said that she had done nothing wrong, that she was merely a friend of Count Vronsky, and that her husband had no right to speak to her in such a way.",
                        "آنا در سکوت به او گوش داد و وقتی تمام کرد، فقط گفت که کار اشتباهی نکرده، فقط دوست کنت ورونسکی است، و شوهرش حق ندارد با او چنین حرف بزند."
                    ),
                    StoryParagraph(
                        "But even as she said these words, she knew they were not true, and Karenin knew it too, and the distance between them, which had always been there, suddenly became an ocean.",
                        "اما حتی همان‌طور که این کلمات را می‌گفت، می‌دانست که درست نیستند، و کارنین هم می‌دانست، و فاصله‌ای که همیشه میانشان بود، ناگهان به اقیانوسی تبدیل شد."
                    ),
                    StoryParagraph(
                        "That night, Anna lay awake for hours, and for the first time since her return, she allowed herself to think, honestly, about what she truly wanted.",
                        "آن شب، آنا ساعت‌ها بیدار دراز کشید، و برای اولین بار پس از بازگشتش، به خودش اجازه داد صادقانه فکر کند که واقعاً چه می‌خواهد."
                    ),
                    StoryParagraph(
                        "She wanted Vronsky, she wanted to be free, she wanted to live a life that was truly hers, and yet she also loved her son, she respected her husband in a strange, unfeeling way, and she did not want to lose the world that had made her who she was.",
                        "ورونسکی را می‌خواست، می‌خواست آزاد باشد، می‌خواست زندگی‌ای داشته باشد که واقعاً مال خودش باشد، و با این حال پسرش را هم دوست داشت، به‌طرز عجیب و بی‌احساسی به شوهرش احترام می‌گذاشت، و نمی‌خواست دنیایی را از دست بدهد که او را آن کسی ساخته بود که بود."
                    ),
                    StoryParagraph(
                        "It was an impossible situation, and she knew it, and yet she could not bring herself to do what was expected of her, which was to turn Vronsky away once and for all.",
                        "وضعیتی غیرممکن بود و می‌دانست، و با این حال نمی‌توانست خودش را راضی کند کاری که از او انتظار می‌رفت را انجام دهد، یعنی ورونسکی را برای همیشه براند."
                    ),
                    StoryParagraph(
                        "A few days later, at a horse race in which Vronsky was riding, Anna attended with her husband, and she watched with her heart in her throat as the young officer raced towards the finish line.",
                        "چند روز بعد، در مسابقه‌ی اسب‌دوانی‌ای که ورونسکی در آن می‌تاخت، آنا با شوهرش شرکت کرد و با قلبش در گلویش تماشا کرد که آن افسر جوان به سمت خط پایان می‌تازد."
                    ),
                    StoryParagraph(
                        "Then, just as he was about to win, something went wrong; his horse stumbled, and he fell to the ground, and Anna, unable to control herself, cried out loud in front of the entire crowd.",
                        "سپس، درست وقتی داشت برنده می‌شد، چیزی اشتباه شد؛ اسبش لغزید و او روی زمین افتاد، و آنا که نمی‌توانست خودش را کنترل کند، در برابر تمام جمعیت بلند فریاد کشید."
                    ),
                    StoryParagraph(
                        "The sound of her cry silenced the crowd, and everyone turned to look at her, and her husband, sitting beside her, felt every eye upon them both, and knew, in that moment, that everything had been exposed.",
                        "صدای فریادش جمعیت را ساکت کرد و همه برگشتند که به او نگاه کنند، و شوهرش که کنارش نشسته بود، نگاه همه را روی هر دو حس کرد و در آن لحظه دانست که همه چیز آشکار شده است."
                    ),
                    StoryParagraph(
                        "Anna herself realized immediately what she had done, and she looked at her husband with a strange mixture of fear and defiance, and in that look, Karenin saw the truth he had been avoiding.",
                        "خود آنا هم فوراً فهمید چه کرده، و با آمیزه‌ی عجیبی از ترس و سرکشی به شوهرش نگاه کرد، و در آن نگاه، کارنین حقیقتی را دید که از آن دوری می‌کرد."
                    ),
                    StoryParagraph(
                        "That night, in the carriage on the way home, Karenin confronted her with cold fury, and for the first time in their marriage, he allowed his true feelings to show.",
                        "آن شب، در کالسکه در راه خانه، کارنین با خشمی سرد با او روبرو شد، و برای اولین بار در ازدواجشان، اجازه داد احساسات واقعی‌اش نمایان شود."
                    ),
                    StoryParagraph(
                        "He told her that he had known for some time, that he had hoped she would come to her senses, that he did not care about love but he cared deeply about propriety, and that he would not be made a fool of by her.",
                        "او به او گفت که مدتی است می‌داند، امیدوار بود به خودش بیاید، به عشق اهمیت نمی‌دهد اما به آبرو عمیقاً اهمیت می‌دهد، و اجازه نمی‌دهد او دستش بیندازد."
                    ),
                    StoryParagraph(
                        "Anna, exhausted by years of pretending, finally broke, and she confessed, in a voice that was almost calm, that she loved Vronsky, that she could not help it, that she was sorry but she could not be sorry enough to stop.",
                        "آنا که از سال‌ها تظاهر خسته شده بود، بالاخره فرو ریخت و با صدایی که تقریباً آرام بود اعتراف کرد که ورونسکی را دوست دارد، نمی‌تواند جلویش را بگیرد، متأسف است اما نمی‌تواند آن‌قدر متأسف باشد که متوقف شود."
                    ),
                    StoryParagraph(
                        "Karenin listened to her in silence, and when she had finished, he told her, in the same cold voice he had used all their married life, that he would not grant her a divorce and that he would not let her see her son if she left him.",
                        "کارنین در سکوت به او گوش داد و وقتی تمام کرد، با همان صدای سردی که تمام زندگی زناشویی‌شان به کار برده بود گفت که به او طلاق نمی‌دهد و اگر ترکش کند اجازه نمی‌دهد پسرش را ببیند."
                    ),
                    StoryParagraph(
                        "Anna was stunned by his words, and she realized, in that moment, that her husband was not the weak, cold man she had always dismissed him as, but a man who would fight back with every weapon he had.",
                        "آنا از کلماتش شوکه شد و در آن لحظه فهمید که شوهرش آن مرد ضعیف و سردی که همیشه دست‌کمش می‌گرفت نبود، بلکه مردی بود که با هر سلاحی که داشت می‌جنگید."
                    ),
                    StoryParagraph(
                        "But she also realized, in that same moment, that she did not care; she loved Vronsky, and she would rather lose everything than continue to live a lie.",
                        "اما در همان لحظه فهمید که اهمیت نمی‌دهد؛ ورونسکی را دوست داشت و ترجیح می‌داد همه چیز را از دست بدهد تا به زندگی در دروغ ادامه دهد."
                    ),
                    StoryParagraph(
                        "A few weeks later, she left her husband's house and went to live with Vronsky, and from that day on, society closed its doors to her, one by one, until she found herself almost entirely alone.",
                        "چند هفته بعد، خانه‌ی شوهرش را ترک کرد و رفت با ورونسکی زندگی کند، و از آن روز به بعد، جامعه درهایش را یکی‌یکی به رویش بست، تا خودش را تقریباً کاملاً تنها یافت."
                    ),
                    StoryParagraph(
                        "Her old friends would not receive her, her old acquaintances would not greet her in public, and even the servants in shops would look at her with knowing, disapproving eyes.",
                        "دوستان قدیمی‌اش دیگر نمی‌پذیرفتندش، آشنایان قدیمی‌اش در ملا عام به او سلام نمی‌کردند، و حتی پیشخدمت‌های مغازه‌ها با نگاهی دانا و نارضایتی به او نگاه می‌کردند."
                    ),
                    StoryParagraph(
                        "Only a few people remained loyal to her, and among them was her brother Stiva, who, with his usual carelessness, said that he could not judge her, because he himself had done worse things and no one had punished him for them.",
                        "فقط چند نفر به او وفادار ماندند، و از جمله‌ی آن‌ها برادرش استیوا بود که با بی‌خیالی همیشگی‌اش گفت نمی‌تواند قضاوتش کند، چون خودش کارهای بدتری کرده و هیچ‌کس مجازاتش نکرده بود."
                    ),
                    StoryParagraph(
                        "Anna was grateful for his support, but she was also aware of the double standard, and she knew that no amount of argument would ever change the world's mind about her.",
                        "آنا برای حمایتش سپاسگزار بود، اما از استاندارد دوگانه هم آگاه بود، و می‌دانست هیچ استدلالی هرگز نظر دنیا را درباره‌اش تغییر نمی‌دهد."
                    ),
                    StoryParagraph(
                        "She and Vronsky lived together in his apartment in Petersburg, and at first, they were happy, or at least as happy as two people in their situation could be.",
                        "او و ورونسکی در آپارتمانش در پترزبورگ با هم زندگی کردند، و اول، خوشحال بودند، یا حداقل تا آنجا که دو نفر در موقعیت آن‌ها می‌توانستند خوشحال باشند."
                    ),
                    StoryParagraph(
                        "But the shadow of what she had lost hung over everything, and Anna, for all her courage, could not stop thinking about her son Seryozha, who was now forbidden to see her.",
                        "اما سایه‌ی آنچه از دست داده بود بر همه چیز آویزان بود، و آنا با تمام شجاعتش نمی‌توانست از فکر کردن به پسرش سریوژا که حالا دیدنش برایش ممنوع بود دست بکشد."
                    ),
                    StoryParagraph(
                        "She wrote him letters, which Karenin tore up without showing them, and she asked visitors to carry messages to him, and she spent hours staring at his photograph in silent grief.",
                        "برای او نامه نوشت که کارنین بدون نشان دادنشان پاره کرد، و از ملاقات‌کنندگان خواست پیام‌هایی به او برسانند، و ساعت‌ها به عکسش خیره شد، در غم خاموش."
                    ),
                    StoryParagraph(
                        "Vronsky tried to comfort her, but he did not understand, because he had never loved anyone as she loved her son, and he could not see why she would not simply move on.",
                        "ورونسکی تلاش کرد دلداری‌اش دهد، اما نمی‌فهمید، چون او هرگز کسی را آن‌قدر که آنا پسرش را دوست داشت دوست نداشت، و نمی‌فهمید چرا او به‌سادگی رها نمی‌کند."
                    ),
                    StoryParagraph(
                        "This was the first crack in their relationship, small at first, but growing slowly wider with every passing day, until it became a chasm that neither of them could cross.",
                        "این اولین ترک در رابطه‌شان بود، اول کوچک، اما آهسته با هر روزی که می‌گذشت پهن‌تر می‌شد، تا به شکافی تبدیل شد که هیچ‌کدام نمی‌توانستند از آن عبور کنند."
                    ),
                    StoryParagraph(
                        "And so, even in the first months of their life together, the seeds of their destruction had already been planted, waiting patiently for the right moment to grow.",
                        "و بنابراین، حتی در همان ماه‌های اول زندگی مشترکشان، بذرهای نابودی‌شان از قبل کاشته شده بود، صبورانه منتظر لحظه‌ی مناسب برای رشد."
                    ),
                    StoryParagraph(
                        "Tolstoy understood, better than any writer of his age, that love alone was not enough to sustain a life, and that society, for all its hypocrisy, had powers that no individual could fight forever.",
                        "تولستوی بهتر از هر نویسنده‌ی عصرش می‌فهمید که عشق به‌تنهایی برای نگه داشتن یک زندگی کافی نیست، و جامعه با تمام ریاکاری‌اش قدرت‌هایی داشت که هیچ فردی نمی‌توانست تا ابد با آن‌ها بجنگد."
                    )
                )
            ),
            StoryChapter(
                number = 3, title = "The Cost of Passion", titlePersian = "بهای شور",
                paragraphs = listOf(
                    StoryParagraph(
                        "Anna and Vronsky travelled to Italy in the first year of their life together, hoping to find peace far from the gossiping drawing rooms of Russian society.",
                        "آنا و ورونسکی در سال اول زندگی مشترکشان به ایتالیا سفر کردند، به امید یافتن آرامش دور از نشیمن‌های پر از شایعه‌ی جامعه‌ی روسیه."
                    ),
                    StoryParagraph(
                        "For a few months, in a small villa in Venice, they were almost happy; they wandered through the gardens, they read together, they spoke of the future as if the past had never existed.",
                        "برای چند ماه، در ویلایی کوچک در ونیز، تقریباً خوشحال بودند؛ در باغ‌ها قدم می‌زدند، با هم می‌خواندند، از آینده سخن می‌گفتند، گویی گذشته هرگز وجود نداشت."
                    ),
                    StoryParagraph(
                        "Vronsky, for his part, threw himself into painting, a hobby he had taken up in Petersburg, and for a while, he convinced himself that he could be an artist, that he could build a new identity for himself in this new land.",
                        "ورونسکی هم خود را در نقاشی غرق کرد، سرگرمی‌ای که در پترزبورگ شروع کرده بود، و برای مدتی خودش را قانع کرد که می‌تواند هنرمند باشد، که می‌تواند در این سرزمین جدید هویت جدیدی برای خودش بسازد."
                    ),
                    StoryParagraph(
                        "But Anna could not paint, could not write, could not do anything that required her to forget her son, and she spent many hours of every day in silent mourning for the child she had lost.",
                        "اما آنا نمی‌توانست نقاشی کند، نمی‌توانست بنویسد، نمی‌توانست کاری بکند که مستلزم فراموش کردن پسرش باشد، و ساعت‌های زیادی از هر روز را در سوگ خاموش برای بچه‌ای که از دست داده بود می‌گذراند."
                    ),
                    StoryParagraph(
                        "She wrote letters to Seryozha, which Karenin returned unopened, and she began to suspect that her husband had told the boy that his mother was dead, and the thought was almost unbearable.",
                        "برای سریوژا نامه نوشت که کارنین بازنکرده پس فرستاد، و شروع کرد به شک کردن که شوهرش به پسر گفته مادرش مرده است، و این فکر تقریباً غیرقابل تحمل بود."
                    ),
                    StoryParagraph(
                        "Vronsky, seeing her sorrow, tried to distract her, and he suggested that they return to Russia, that he would build a new life for them on his country estate, away from the city and its judgments.",
                        "ورونسکی با دیدن غم او، تلاش کرد حواسش را پرت کند و پیشنهاد کرد به روسیه بازگردند، که او در ملک روستایی‌اش زندگی جدیدی برایشان بسازد، دور از شهر و داوری‌هایش."
                    ),
                    StoryParagraph(
                        "Anna agreed, and they returned to Russia, and settled in his family estate, where, at first, the quiet countryside seemed to offer the peace they had been seeking.",
                        "آنا موافقت کرد و آن‌ها به روسیه بازگشتند و در ملک خانوادگی‌اش ساکن شدند، جایی که اول، روستای آرام به نظر می‌رسید همان آرامشی که در جست‌وجویش بودند را ارائه دهد."
                    ),
                    StoryParagraph(
                        "But in Russia, even in the countryside, society had long arms, and Anna soon discovered that she was still excluded from everything that mattered to a Russian woman of her class.",
                        "اما در روسیه، حتی در روستا، جامعه دستان بلندی داشت، و آنا به‌زودی کشف کرد که هنوز از هر چیزی که برای یک زن روسی از طبقه‌اش مهم بود حذف شده است."
                    ),
                    StoryParagraph(
                        "Only one person came to visit her in the first months on the estate, and that was her sister-in-law Dolly, who came more out of pity than approval, and who stayed only a few days.",
                        "فقط یک نفر در ماه‌های اول در ملک به دیدنش آمد، و آن خواهرشوهرش دالی بود که بیشتر از سر ترحم آمده بود تا تأیید، و فقط چند روز ماند."
                    ),
                    StoryParagraph(
                        "During that visit, Anna poured out her heart to Dolly, speaking of her love for Vronsky, her grief for her son, her loneliness, and the impossibility of the situation in which she found herself.",
                        "در آن دیدار، آنا دلش را برای دالی خالی کرد و از عشقش به ورونسکی، غمش برای پسرش، تنهایی‌اش و غیرممکن بودن وضعیتی که در آن بود گفت."
                    ),
                    StoryParagraph(
                        "Dolly listened with sympathy, but she could not quite hide her disapproval, and Anna, sensing it, felt a new wave of bitterness rise within her.",
                        "دالی با همدردی گوش داد، اما نمی‌توانست کاملاً نارضایتی‌اش را پنهان کند، و آنا که حسش کرده بود، موج جدیدی از تلخی درونش حس کرد."
                    ),
                    StoryParagraph(
                        "A few days later, Anna sent Dolly away with kindness, and then sat alone in her room and wept, because she realized, with a terrible clarity, that she could not even fully explain herself to those who came to see her.",
                        "چند روز بعد، آنا دالی را با مهربانی بدرقه کرد و سپس تنها در اتاقش نشست و گریه کرد، چون با وضوحی هولناک دریافت که حتی نمی‌تواند خودش را برای کسانی که به دیدنش می‌آیند کاملاً توضیح دهد."
                    ),
                    StoryParagraph(
                        "Vronsky, meanwhile, had begun to grow restless; he missed the city, missed the balls and the parties and the excitement of his old life, and he found the quiet countryside increasingly boring.",
                        "ورونسکی در همین حال شروع کرده بود به بی‌قراری؛ دلتنگ شهر بود، دلتنگ رقص‌ها و مهمانی‌ها و هیجان زندگی قدیمی‌اش، و روستای آرام را هر روز خسته‌کننده‌تر می‌یافت."
                    ),
                    StoryParagraph(
                        "He loved Anna, but he also wanted a career, wanted respect, wanted to be a man of importance in the world, and he began to feel that Anna was holding him back from all of that.",
                        "آنا را دوست داشت، اما حرفه هم می‌خواست، احترام می‌خواست، می‌خواست مردی مهم در دنیا باشد، و شروع کرد به حس کردن که آنا او را از همه‌ی این‌ها عقب نگه می‌دارد."
                    ),
                    StoryParagraph(
                        "He tried to hide these feelings, but Anna, who knew him better than anyone, sensed the change in him, and she began to fear that she was losing him.",
                        "تلاش کرد این احساسات را پنهان کند، اما آنا که او را بهتر از هر کس دیگری می‌شناخت، تغییرش را حس کرد، و شروع کرد به ترسیدن که از دستش می‌دهد."
                    ),
                    StoryParagraph(
                        "She became jealous, watching him for every sign of interest in other women, questioning every absence, demanding reassurance again and again, until Vronsky began to feel suffocated by her need.",
                        "حسود شد، برای هر نشانه‌ای از علاقه به زنان دیگر نگاهش می‌کرد، هر غیبتی را زیر سؤال می‌برد، بارها و بارها اطمینان می‌خواست، تا ورونسکی شروع کرد به احساس خفگی از نیازش."
                    ),
                    StoryParagraph(
                        "They quarrelled more and more often, and over smaller and smaller things, until their life together became a series of petty conflicts punctuated by brief, exhausted reconciliations.",
                        "بیشتر و بیشتر دعوا می‌کردند، بر سر چیزهای کوچک‌تر و کوچک‌تر، تا زندگی مشترکشان به مجموعه‌ای از درگیری‌های کوچک تبدیل شد که با آشتی‌های کوتاه و خسته‌آور نقطه‌گذاری می‌شدند."
                    ),
                    StoryParagraph(
                        "Anna began to take morphine to help her sleep, and then to help her through the day, and her health, which had never been strong, began to decline noticeably.",
                        "آنا برای کمک به خواب شروع کرد به مصرف مورفین، و بعد برای گذراندن روز، و سلامتی‌اش که هرگز قوی نبود، شروع کرد به‌طور محسوسی رو به زوال رفتن."
                    ),
                    StoryParagraph(
                        "She grew thin, her face became pale and drawn, and her beauty, which had once been legendary, began to fade, and with it, her confidence in herself.",
                        "لاغر شد، صورتش رنگ‌پریده و خسته شد، و زیبایی‌اش که زمانی افسانه‌ای بود شروع کرد به محو شدن، و با آن، اعتمادش به خودش."
                    ),
                    StoryParagraph(
                        "Then, unexpectedly, she discovered that she was pregnant again, and for a moment, she hoped that the child would bring them back together, would give them something to live for beyond themselves.",
                        "سپس، به‌طور غیرمنتظره‌ای، کشف کرد که دوباره باردار است، و برای لحظه‌ای، امیدوار شد که این بچه آن‌ها را دوباره به هم نزدیک کند، چیزی برای زندگی فراتر از خودشان به آن‌ها بدهد."
                    ),
                    StoryParagraph(
                        "But the birth was difficult, and Anna nearly died, and though she recovered, something in her had changed; she felt, for the first time, the full weight of what she had given up.",
                        "اما زایمان دشوار بود و آنا تقریباً مرد، و هرچند بهبود یافت، چیزی در او تغییر کرده بود؛ برای اولین بار، وزن کامل آنچه از دست داده بود را حس کرد."
                    ),
                    StoryParagraph(
                        "While she was ill, Karenin, in a moment of strange tenderness, came to see her, and he forgave her, and for a few days, there was a possibility that everything might be resolved.",
                        "در حالی که بیمار بود، کارنین در لحظه‌ای از مهربانی عجیب به دیدنش آمد و بخشیدش، و برای چند روز، امکانی بود که همه چیز حل شود."
                    ),
                    StoryParagraph(
                        "But when Anna recovered, the old coldness returned, and Karenin took back his forgiveness, and the situation became even worse than before, because now everyone knew where everyone stood.",
                        "اما وقتی آنا بهبود یافت، سردی قدیمی بازگشت و کارنین بخشش‌اش را پس گرفت، و وضعیت حتی از قبل بدتر شد، چون حالا همه می‌دانستند هر کسی کجاست."
                    ),
                    StoryParagraph(
                        "Vronsky, humiliated by having had to accept Karenin's generosity during Anna's illness, felt wounded in his pride, and he began to spend more and more time away from the estate.",
                        "ورونسکی که از پذیرفتن سخاوت کارنین در طول بیماری آنا خوار شده بود، در غرورش زخم خورد، و شروع کرد به گذراندن وقت بیشتر و بیشتری دور از ملک."
                    ),
                    StoryParagraph(
                        "He involved himself in local politics, in farming, in anything that would take him away from the house and from Anna, and Anna, watching him go, felt her heart harden towards him.",
                        "خود را درگیر سیاست محلی کرد، در کشاورزی، در هر چیزی که او را از خانه و از آنا دور کند، و آنا که رفتنش را تماشا می‌کرد، قلبش نسبت به او سخت می‌شد."
                    ),
                    StoryParagraph(
                        "They continued to live together, but they no longer shared a life; they were two people bound by a love that had become a burden, unable to leave and unable to stay.",
                        "با هم زندگی می‌کردند، اما دیگر زندگی مشترکی نداشتند؛ دو نفر بودند که با عشقی به هم بسته بودند که به باری تبدیل شده بود، نه می‌توانستند بروند نه بمانند."
                    ),
                    StoryParagraph(
                        "Karenin, in his own way, suffered too; he had been publicly humiliated, he had been forced to appear weak in front of everyone he knew, and his pride could not forgive the woman who had done this to him.",
                        "کارنین هم به شیوه‌ی خودش رنج می‌کشید؛ علناً تحقیر شده بود، مجبور شده بود در برابر همه‌ی کسانی که می‌شناخت ضعیف به نظر برسد، و غرورش نمی‌توانست زنی را که این کار را با او کرده بود ببخشد."
                    ),
                    StoryParagraph(
                        "He refused to grant Anna a divorce, partly out of spite and partly out of duty, and he refused to let her see Seryozha, and these two refusals were the source of most of Anna's suffering.",
                        "او از دادن طلاق به آنا امتناع می‌کرد، نیمی از سر کینه و نیمی از سر وظیفه، و از دیدن سریوژا محرومش می‌کرد، و این دو امتناع منبع اصلی رنج آنا بود."
                    ),
                    StoryParagraph(
                        "Without a divorce, Anna could not marry Vronsky, and their daughter, whom they had named Annie, had no legal father, and Anna felt the shame of this more deeply than she was willing to admit.",
                        "بدون طلاق، آنا نمی‌توانست با ورونسکی ازدواج کند، و دخترشان، که آنی نامش نهاده بودند، پدر قانونی نداشت، و آنا شرم این را عمیق‌تر از آنچه حاضر بود بپذیرد حس می‌کرد."
                    ),
                    StoryParagraph(
                        "She began to feel that her life was a lie, that she was slowly being erased from the world, and the feeling grew stronger with every passing day.",
                        "شروع کرد به حس کردن که زندگی‌اش دروغی است، که آهسته از جهان پاک می‌شود، و این حس با هر روزی که می‌گذشت قوی‌تر می‌شد."
                    ),
                    StoryParagraph(
                        "She began to suspect, without any real evidence, that Vronsky no longer loved her as he once had, and her jealousy became obsessive, destructive, unbearable to both of them.",
                        "بدون هیچ مدرک واقعی شروع کرد به شک کردن که ورونسکی دیگر مثل قبل دوستش ندارد، و حسادتش وسواسی، مخرب و برای هر دویشان غیرقابل تحمل شد."
                    ),
                    StoryParagraph(
                        "Every time he left the house, she imagined him with another woman, and every time he came back, she questioned him, and every time he answered, she refused to believe him.",
                        "هر بار که از خانه بیرون می‌رفت، تصور می‌کرد با زن دیگری است، و هر بار که برمی‌گشت، بازجویی‌اش می‌کرد، و هر بار که جواب می‌داد، باورش نمی‌کرد."
                    ),
                    StoryParagraph(
                        "Vronsky, exhausted by her jealousy, began to avoid being alone with her, and Anna, seeing this, took it as confirmation of her fears, and the cycle continued endlessly.",
                        "ورونسکی که از حسادتش خسته شده بود، شروع کرد به دوری از تنها بودن با او، و آنا که این را می‌دید، تأییدی بر ترس‌هایش می‌گرفت، و این چرخه بی‌پایان ادامه می‌یافت."
                    ),
                    StoryParagraph(
                        "She began to take more morphine, and then to drink, and then to do both at once, and her mind, which had once been her greatest strength, began to betray her.",
                        "شروع کرد به مصرف مورفین بیشتر، و بعد به نوشیدن، و بعد هر دو با هم، و ذهنش که زمانی بزرگ‌ترین قدرتش بود، شروع کرد به خیانت به او."
                    ),
                    StoryParagraph(
                        "She saw enemies everywhere, in every glance, in every whispered conversation, in every silence, and she could no longer distinguish between what was real and what her own tortured mind had invented.",
                        "دشمنان را همه‌جا می‌دید، در هر نگاهی، در هر گفت‌وگوی زمزمه‌ای، در هر سکوتی، و دیگر نمی‌توانست بین آنچه واقعی بود و آنچه ذهن شکنجه‌شده‌ی خودش ساخته بود تفاوت بگذارد."
                    ),
                    StoryParagraph(
                        "Vronsky tried to help her, but he no longer knew how, and the love that had once been the centre of both their lives had become, for both of them, a wound that would not heal.",
                        "ورونسکی تلاش کرد کمکش کند، اما دیگر نمی‌دانست چطور، و عشقی که زمانی مرکز زندگی هر دویشان بود، برای هر دویشان به زخمی تبدیل شده بود که التیام نمی‌یافت."
                    ),
                    StoryParagraph(
                        "The crisis was coming, and they both knew it, and yet neither of them could do anything to prevent it, and so they waited, in silent dread, for the end.",
                        "بحران در راه بود و هر دو می‌دانستند، و با این حال هیچ‌کدام نمی‌توانستند کاری برای جلوگیری از آن کنند، و بنابراین منتظر ماندند، در ترس خاموش، برای پایان."
                    )
                )
            ),
            StoryChapter(
                number = 4, title = "The Long Winter", titlePersian = "زمستان طولانی",
                paragraphs = listOf(
                    StoryParagraph(
                        "In the autumn of the second year of their life together, Anna and Vronsky moved back to his apartment in Moscow, because Vronsky had business to attend to and could no longer stay on the estate.",
                        "در پاییز سال دوم زندگی مشترکشان، آنا و ورونسکی به آپارتمانش در مسکو بازگشتند، چون ورونسکی کارهایی داشت که باید انجام می‌داد و دیگر نمی‌توانست در ملک بماند."
                    ),
                    StoryParagraph(
                        "The city, which had once been the scene of their happiness, now felt to Anna like a cage, and she found herself unable to leave her room for days at a time.",
                        "شهر، که زمانی صحنه‌ی خوشبختی‌شان بود، حالا برای آنا مثل قفسی بود، و خودش را می‌یافت که روزها نمی‌تواند از اتاقش بیرون بیاید."
                    ),
                    StoryParagraph(
                        "Vronsky was away most of the day, attending to his affairs, and when he came home, he was tired and distracted, and Anna, seeing this, took it as evidence of his growing indifference.",
                        "ورونسکی بیشتر روز را دور از خانه بود، به کارهایش رسیدگی می‌کرد، و وقتی برمی‌گشت، خسته و حواس‌پرت بود، و آنا که این را می‌دید، مدرکی بر بی‌تفاوتی روزافزونش می‌گرفت."
                    ),
                    StoryParagraph(
                        "One evening, after a particularly tense dinner, during which Vronsky had said almost nothing to her, Anna confronted him with accusations that he could not entirely deny.",
                        "یک شب، پس از شامی به‌ویژه پرتنش، که در آن ورونسکی تقریباً هیچ چیز به او نگفته بود، آنا با اتهاماتی که کاملاً نمی‌توانست انکار کند با او روبرو شد."
                    ),
                    StoryParagraph(
                        "She told him that he no longer loved her, that he was tired of her, that he wished she would disappear, and Vronsky, exhausted, could not find the words to reassure her.",
                        "به او گفت که دیگر دوستش ندارد، از او خسته شده، آرزو می‌کند ناپدید شود، و ورونسکی که خسته بود، کلماتی برای اطمینان دادن به او نیافت."
                    ),
                    StoryParagraph(
                        "He told her, in a voice that was weary rather than angry, that he had given up everything for her, that he had sacrificed his career, his reputation, his family, and that he was still here, wasn't he?",
                        "او با صدایی که خسته بود نه عصبانی، به او گفت که همه چیز را برایش فدا کرده، حرفه‌اش را، آبرویش را، خانواده‌اش را، و هنوز اینجاست، نه؟"
                    ),
                    StoryParagraph(
                        "But Anna could not hear the love in his words, because she was no longer able to believe in it, and she told him that if he loved her, he would understand why she needed him to prove it.",
                        "اما آنا نمی‌توانست عشق را در کلماتش بشنود، چون دیگر نمی‌توانست به آن ایمان بیاورد، و به او گفت اگر دوستش دارد، می‌فهمد چرا او لازم دارد اثباتش کند."
                    ),
                    StoryParagraph(
                        "They went round and round in circles, saying the same things again and again, until at last Vronsky, unable to bear it any longer, left the room and went out.",
                        "بارها و بارها دور یک دایره می‌گشتند، حرف‌های یکسان را تکرار می‌کردند، تا بالاخره ورونسکی که دیگر نتوانست تحمل کند از اتاق بیرون رفت."
                    ),
                    StoryParagraph(
                        "He told her that he was going to visit his mother, and he said it in a cold, distant voice, and Anna, watching him leave, felt something inside her snap.",
                        "به او گفت که می‌رود به دیدن مادرش، و آن را با صدایی سرد و دور گفت، و آنا که رفتنش را تماشا می‌کرد، حس کرد چیزی در درونش شکست."
                    ),
                    StoryParagraph(
                        "She sat alone in their apartment for hours, staring at the wall, and as the evening wore on, her thoughts began to spiral into a dark place from which there was no return.",
                        "ساعت‌ها تنها در آپارتمانشان نشست و به دیوار خیره شد، و با گذشت شب، افکارش شروع کرد به چرخیدن به جای تاریکی که بازگشتی از آن نبود."
                    ),
                    StoryParagraph(
                        "She thought about her life, about her son, about her husband, about Vronsky, about her daughter, about all the choices she had made and all the mistakes she could not undo.",
                        "به زندگی‌اش فکر کرد، به پسرش، به شوهرش، به ورونسکی، به دخترش، به همه‌ی انتخاب‌هایی که کرده بود و همه‌ی اشتباهاتی که نمی‌توانست جبران کند."
                    ),
                    StoryParagraph(
                        "She thought about the first day she had met Vronsky, at that railway station in Moscow, and she remembered the worker who had been crushed by the train, and she remembered thinking that it was a bad omen.",
                        "به روز اولی فکر کرد که ورونسکی را در آن ایستگاه راه‌آهن در مسکو دیده بود، و کارگری که توسط قطار له شده بود را به یاد آورد، و به یاد آورد که فکر کرده بود این فال بدی است."
                    ),
                    StoryParagraph(
                        "She wrote a letter to Vronsky, a letter full of love and reproach, a letter in which she tried, one last time, to explain herself, and then she went to the station to catch the train to him.",
                        "نامه‌ای به ورونسکی نوشت، نامه‌ای پر از عشق و سرزنش، نامه‌ای که در آن یک بار آخر تلاش کرد خودش را توضیح دهد، و بعد به ایستگاه رفت تا قطار به سمت او را بگیرد."
                    ),
                    StoryParagraph(
                        "She stood on the platform, waiting for his train, but the train was delayed, and as she waited, she felt a strange, cold calm come over her.",
                        "روی سکو ایستاد و منتظر قطار او ماند، اما قطار تأخیر داشت، و در حالی که منتظر بود، آرامش عجیب و سردی بر او حاکم شد."
                    ),
                    StoryParagraph(
                        "She looked around her at the people on the platform, at the porters, at the passengers, at a young couple laughing together, and she felt that she was no longer a part of the world she saw.",
                        "به اطرافش نگاه کرد، به مردم روی سکو، به باربران، به مسافران، به زوج جوانی که با هم می‌خندیدند، و حس کرد که دیگر بخشی از دنیایی که می‌دید نیست."
                    ),
                    StoryParagraph(
                        "She walked to the edge of the platform and looked down at the tracks, and in that moment, she made her decision, not with hatred, not with despair, but with a strange, terrible clarity.",
                        "به لبه‌ی سکو رفت و به ریل‌ها نگاه کرد، و در آن لحظه، تصمیمش را گرفت، نه از نفرت، نه از ناامیدی، بلکه با وضوحی عجیب و هولناک."
                    ),
                    StoryParagraph(
                        "She thought about what it would mean to die, and she thought about what it would mean to live, and she decided, in the end, that dying was the lesser of the two sufferings.",
                        "به این فکر کرد که مردن یعنی چه، و به این فکر کرد که زندگی کردن یعنی چه، و در نهایت تصمیم گرفت که مردن، کمتر از دو رنج است."
                    ),
                    StoryParagraph(
                        "A train was coming, and she watched it approach, and she thought of Vronsky, and she hoped that he would be sorry, and she hoped that he would understand.",
                        "قطاری می‌آمد و نزدیک شدنش را تماشا کرد، و به ورونسکی فکر کرد، و امیدوار بود متأسف شود، و امیدوار بود بفهمد."
                    ),
                    StoryParagraph(
                        "And then, before she could change her mind, she stepped forward, and the train was upon her, and in an instant, everything was over.",
                        "و سپس، پیش از آنکه بتواند نظرش را عوض کند، به جلو قدم گذاشت، و قطار رویش آمد، و در یک لحظه، همه چیز تمام شد."
                    ),
                    StoryParagraph(
                        "Vronsky arrived at the station half an hour later, and he found a crowd gathered around something on the tracks, and he knew, before he was told, what he would see.",
                        "ورونسکی نیم ساعت بعد به ایستگاه رسید و جمعیتی را یافت که دور چیزی روی ریل‌ها جمع شده بودند، و پیش از آنکه به او بگویند، می‌دانست چه خواهد دید."
                    ),
                    StoryParagraph(
                        "He stood frozen, unable to move or speak, and the woman he had loved more than anything in the world, the woman for whom he had given up everything, was dead, and she had died believing that he no longer loved her.",
                        "یخ‌زده ایستاد، قادر به حرکت یا سخن گفتن نبود، و زنی که بیش از هر چیزی در دنیا دوستش داشت، زنی که برایش همه چیز را فدا کرده بود، مرده بود، و مرده بود با این باور که او دیگر دوستش ندارد."
                    ),
                    StoryParagraph(
                        "Guilt and grief overwhelmed him completely, and for weeks after her death, he could not eat, could not sleep, could not speak, could not even cry.",
                        "گناه و غم او را کاملاً فرا گرفت، و هفته‌ها پس از مرگش، نه می‌توانست بخورد، نه بخوابد، نه حرف بزند، نه حتی گریه کند."
                    ),
                    StoryParagraph(
                        "He returned to the army, hoping that war and danger might distract him from his pain, and he took his young daughter Annie with him and left her in the care of his mother.",
                        "به ارتش بازگشت، به امید آنکه جنگ و خطر او را از دردش غافل کند، و دختر کوچکش آنی را با خود برد و او را به مادرش سپرد."
                    ),
                    StoryParagraph(
                        "He fought bravely, and some said he was seeking death, and others said he was punishing himself, and only he knew the truth, which was that both were correct.",
                        "شجاعانه جنگید، و بعضی گفتند دنبال مرگ است، و بعضی گفتند دارد خودش را مجازات می‌کند، و فقط خودش می‌دانست حقیقت این است که هر دو درست است."
                    ),
                    StoryParagraph(
                        "He never remarried, and he never loved again, and he carried with him, for the rest of his life, the memory of the woman who had given up everything for him and had died believing he had abandoned her.",
                        "هرگز دوباره ازدواج نکرد، و هرگز دوباره عاشق نشد، و تا آخر عمر، خاطره‌ی زنی که همه چیز را برایش فدا کرده بود و با این باور که او رهایش کرده مرده بود را با خود حمل کرد."
                    ),
                    StoryParagraph(
                        "Meanwhile, far from all this tragedy, another story was unfolding, the story of Levin and Kitty, whose quiet, honest love stood in sharp contrast to the passionate, destructive love of Anna and Vronsky.",
                        "در همین حال، دور از این تراژدی، داستان دیگری در جریان بود، داستان لوین و کیتی، که عشق آرام و صادقانه‌شان در تضاد شدیدی با عشق پرشور و ویرانگر آنا و ورونسکی بود."
                    ),
                    StoryParagraph(
                        "Levin was a landowner who loved the countryside and distrusted the empty talk of the cities, and he had loved Kitty since the beginning of the novel, though she had once refused him.",
                        "لوین مالکی بود که روستا را دوست داشت و به گفت‌وگوی پوچ شهرها بی‌اعتماد بود، و از ابتدای رمان عاشق کیتی بود، هرچند او یک بار ردش کرده بود."
                    ),
                    StoryParagraph(
                        "After her humiliation at the ball where Vronsky had abandoned her for Anna, Kitty had gone abroad to recover her health and her spirit, and she returned quieter, wiser, and more ready to accept real love.",
                        "کیتی پس از تحقیر در رقصی که ورونسکی برای آنا رهایش کرده بود، برای بازیابی سلامت و روحش به خارج رفته بود، و ساکت‌تر، داناتر و آماده‌تر برای پذیرش عشق واقعی بازگشت."
                    ),
                    StoryParagraph(
                        "When she and Levin met again, something true began to grow between them, and this time, Kitty did not run away, and this time, Levin found the courage to speak.",
                        "وقتی او و لوین دوباره همدیگر را دیدند، چیزی حقیقی میانشان شروع به رشد کرد، و این بار کیتی فرار نکرد، و این بار لوین شجاعت حرف زدن را یافت."
                    ),
                    StoryParagraph(
                        "They married, and settled on Levin's country estate, and built a life that was not glamorous or exciting, but was real, and warm, and full of love.",
                        "ازدواج کردند و در ملک روستایی لوین ساکن شدند و زندگی‌ای ساختند که پرزرق‌وبرق و هیجان‌انگیز نبود، اما واقعی بود، و گرم، و پر از عشق."
                    ),
                    StoryParagraph(
                        "Their life together was not without difficulty; Levin struggled with questions of faith and meaning, and Kitty struggled with the demands of being a wife and mother, and both of them struggled with the small daily challenges of living with another person.",
                        "زندگی مشترکشان بی‌دشواری نبود؛ لوین با پرسش‌های ایمان و معنا دست‌وپنجه نرم می‌کرد، و کیتی با خواسته‌های همسر و مادر بودن، و هر دو با چالش‌های کوچک روزانه‌ی زندگی با دیگری."
                    ),
                    StoryParagraph(
                        "But they faced these difficulties together, honestly, without secrets and without lies, and it was this honesty, more than anything else, that made their love endure.",
                        "اما این دشواری‌ها را با هم روبرو شدند، صادقانه، بدون راز و بدون دروغ، و این صداقت، بیش از هر چیز دیگری، عشقشان را پایدار کرد."
                    ),
                    StoryParagraph(
                        "Tolstoy, in telling these two stories side by side, wanted to show that there were two ways to live, two ways to love, and two ways to face the inevitable difficulties of human existence.",
                        "تولستوی با تعریف این دو داستان در کنار هم، می‌خواست نشان دهد که دو راه برای زیستن وجود دارد، دو راه برای عشق ورزیدن، و دو راه برای روبرو شدن با دشواری‌های اجتناب‌ناپذیر وجود انسانی."
                    ),
                    StoryParagraph(
                        "Anna chose passion, chose to break the rules, chose to follow her heart wherever it led, and she paid for that choice with her life.",
                        "آنا شور را انتخاب کرد، انتخاب کرد قوانین را بشکند، انتخاب کرد قلبش را هر جا که می‌برد دنبال کند، و تاوان آن انتخاب را با زندگی‌اش پرداخت."
                    ),
                    StoryParagraph(
                        "Levin and Kitty chose patience, chose to respect the rules, chose to build their love slowly and carefully, and they were rewarded with a happiness that Anna could never find.",
                        "لوین و کیتی صبر را انتخاب کردند، انتخاب کردند به قوانین احترام بگذارند، انتخاب کردند عشقشان را آهسته و بادقت بسازند، و پاداششان خوشبختی‌ای بود که آنا هرگز نمی‌توانست بیابد."
                    ),
                    StoryParagraph(
                        "Which of them was right, Tolstoy does not say, because the question is not so simple, and life, he knew, is never as clear as we would like it to be.",
                        "کدام یک درست بودند، تولستوی نمی‌گوید، چون پرسش این‌قدر ساده نیست، و زندگی، او می‌دانست، هرگز آن‌قدر شفاف نیست که ما دوست داریم باشد."
                    ),
                    StoryParagraph(
                        "Perhaps both were right, and both were wrong, and perhaps the truth is that each of us must find our own way, and live with the consequences of the choices we make.",
                        "شاید هر دو درست بودند، و هر دو اشتباه، و شاید حقیقت این است که هر یک از ما باید راه خودش را پیدا کند، و با پیامدهای انتخاب‌هایش زندگی کند."
                    ),
                    StoryParagraph(
                        "This was the great novel that Tolstoy wrote, a novel about love and marriage, about society and the individual, about faith and doubt, and above all about the endless complexity of the human heart.",
                        "این همان رمان بزرگی بود که تولستوی نوشت، رمانی درباره‌ی عشق و ازدواج، درباره‌ی جامعه و فرد، درباره‌ی ایمان و تردید، و بیش از همه درباره‌ی پیچیدگی بی‌پایان قلب انسانی."
                    ),
                    StoryParagraph(
                        "Anna Karenina is one of the greatest novels ever written, not because it provides answers, but because it asks the right questions, and because it makes us feel, deeply and unforgettably, what it means to be human.",
                        "آنا کارنینا یکی از بزرگترین رمان‌هایی است که تاکنون نوشته شده، نه چون پاسخ می‌دهد، بلکه چون پرسش‌های درست را می‌پرسد، و چون ما را وادار می‌کند عمیقاً و فراموش‌نشدنی حس کنیم که انسان بودن یعنی چه."
                    ),
                    StoryParagraph(
                        "And so, more than a century after it was written, we still read it, and we still argue about it, and we still see ourselves in its pages, because the story of Anna Karenina is, in the end, the story of all of us.",
                        "و بنابراین، بیش از یک قرن پس از نوشته شدنش، هنوز می‌خوانیمش، و هنوز درباره‌اش بحث می‌کنیم، و هنوز خودمان را در صفحاتش می‌بینیم، چون داستان آنا کارنینا در نهایت، داستان همه‌ی ماست."
                    )
                )
            )
        )
    )
}