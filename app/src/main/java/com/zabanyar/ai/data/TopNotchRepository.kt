// ==================== Top Notch 2 ====================
fun getTopNotch2(chapter: Int): LessonContent {
    return when (chapter) {
        1 -> LessonContent("top_notch_2", 1, "Getting Acquainted", "آشنایی",
            vocabulary = listOf(
                VocabWord("Introduce", "معرفی کردن", "ˌɪntrəˈduːs"), VocabWord("Neighbor", "همسایه", "ˈneɪbər"),
                VocabWord("Classmate", "همکلاسی", "ˈklæsmeɪt"), VocabWord("Colleague", "همکار", "ˈkɑːliːɡ"),
                VocabWord("Acquaintance", "آشنا", "əˈkweɪntəns"), VocabWord("Nickname", "اسم مستعار", "ˈnɪkneɪm"),
                VocabWord("Last name", "نام خانوادگی", "læst neɪm"), VocabWord("First name", "نام کوچک", "fɜːrst neɪm"),
                VocabWord("Background", "پیشینه", "ˈbækɡraʊnd"), VocabWord("Impression", "تصور", "ɪmˈpreʃən")
            ),
            grammar = listOf(
                GrammarSection("📌 Present Perfect با How long",
                    "ساختار: have/has + p.p.\n\n" +
                    "• How long have you known him?\n" +
                    "• I've known him for two years.\n" +
                    "• I've known her since 2020."),
                GrammarSection("📌 for vs since",
                    "• for + مدت زمان: for two years, for a month\n" +
                    "• since + نقطه شروع: since 2020, since Monday"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ I've known him since 2 years. → ✅ I've known him for 2 years.\n" +
                    "❌ I know him since 2020. → ✅ I've known him since 2020.")
            ),
            conversation = listOf(
                DialogueLine("A", "How long have you known your best friend?", "چقدره بهترین دوستت رو می‌شناسی؟"),
                DialogueLine("B", "I've known him for five years.", "پنج ساله می‌شناسمش."),
                DialogueLine("A", "How did you meet?", "چطور آشنا شدید؟"),
                DialogueLine("B", "We were classmates in college.", "همکلاسی دانشگاه بودیم."),
                DialogueLine("A", "Do you still keep in touch?", "هنوز در ارتباطید؟"),
                DialogueLine("B", "Yes, we meet every week.", "بله، هر هفته همدیگه رو می‌بینیم."),
                DialogueLine("A", "That's a long friendship!", "دوستی طولانی‌ایه!"),
                DialogueLine("B", "Yes, we've been friends since 2019.", "بله، از سال ۲۰۱۹ دوستیم."),
                DialogueLine("A", "What do you usually do together?", "معمولاً با هم چیکار می‌کنید؟"),
                DialogueLine("B", "We go to the gym and watch movies.", "باشگاه می‌ریم و فیلم می‌بینیم.")
            ),
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I've known him since 2 years.", "I've known him for 2 years.", "I know him since 2 years.", "I knowing him for 2 years."), 1),
                QuizQuestion("معنی «Colleague» چیست؟", listOf("همکلاسی", "همسایه", "همکار", "دوست"), 2),
                QuizQuestion("«since» با کدام می‌آید؟", listOf("two years", "a month", "2020", "a long time"), 2),
                QuizQuestion("ساختار Present Perfect؟", listOf("have/has + verb", "have/has + p.p.", "am/is/are + verb-ing", "did + verb"), 1),
                QuizQuestion("«او دو سال است که اینجا زندگی می‌کند.»", listOf("She lives here since 2 years.", "She has lived here for 2 years.", "She lived here for 2 years.", "She is living here 2 years."), 1),
                QuizQuestion("معنی «Acquaintance» چیست؟", listOf("دوست صمیمی", "آشنا", "همکار", "همسایه"), 1),
                QuizQuestion("«How long ___ you known her?»", listOf("do", "did", "have", "are"), 2),
                QuizQuestion("p.p. فعل know؟", listOf("knowed", "knew", "known", "knowing"), 2)
            )
        )
        2 -> LessonContent("top_notch_2", 2, "Going Shopping", "خرید کردن",
            vocabulary = listOf(
                VocabWord("Receipt", "رسید", "rɪˈsiːt"), VocabWord("Refund", "بازپرداخت", "ˈriːfʌnd"),
                VocabWord("Exchange", "تعویض", "ɪksˈtʃeɪndʒ"), VocabWord("Warranty", "گارانتی", "ˈwɔːrənti"),
                VocabWord("Sale", "حراج", "seɪl"), VocabWord("Bargain", "معامله خوب", "ˈbɑːrɡɪn"),
                VocabWord("Fitting room", "اتاق پرو", "ˈfɪtɪŋ ruːm"), VocabWord("Queue", "صف", "kjuː"),
                VocabWord("Quality", "کیفیت", "ˈkwɑːləti"), VocabWord("Brand", "برند", "brænd")
            ),
            grammar = listOf(
                GrammarSection("📌 Comparative",
                    "• cheap → cheaper than\n" +
                    "• expensive → more expensive than\n" +
                    "• good → better than"),
                GrammarSection("📌 Superlative",
                    "• cheap → the cheapest\n" +
                    "• expensive → the most expensive\n" +
                    "• good → the best"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ This is more cheap. → ✅ This is cheaper.")
            ),
            conversation = listOf(
                DialogueLine("A", "I'd like to exchange this shirt.", "می‌خوام این پیراهن رو تعویض کنم."),
                DialogueLine("B", "Sure. Do you have the receipt?", "حتماً. رسید داری؟"),
                DialogueLine("A", "Yes, here it is. It's too small.", "بله. خیلی کوچیکه."),
                DialogueLine("B", "Would you like a larger size?", "سایز بزرگ‌تر می‌خوای؟"),
                DialogueLine("A", "Yes, please. Do you have it in blue?", "بله. آبی‌اش رو دارید؟"),
                DialogueLine("B", "Let me check.", "بذار چک کنم."),
                DialogueLine("A", "Medium, please.", "مدیوم، لطفاً."),
                DialogueLine("B", "Here you go. Try it on.", "بفرما. امتحان کن."),
                DialogueLine("A", "It fits perfectly! Thank you.", "عالی اندازه‌ست! ممنون."),
                DialogueLine("B", "You're welcome.", "خواهش می‌کنم.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Refund» چیست؟", listOf("تعویض", "بازپرداخت", "تخفیف", "گارانتی"), 1),
                QuizQuestion("کدام درست است؟", listOf("This is more cheap.", "This is cheaper.", "This is cheapest.", "This is the cheap."), 1),
                QuizQuestion("صفت تفضیلی good؟", listOf("gooder", "more good", "better", "best"), 2),
                QuizQuestion("معنی «Warranty» چیست؟", listOf("تخفیف", "گارانتی", "رسید", "برند"), 1),
                QuizQuestion("کدام درست است؟", listOf("She is the most tall.", "She is the tallest.", "She is taller than all.", "She tallest."), 1),
                QuizQuestion("صفت برتر bad؟", listOf("bader", "more bad", "worse", "worst"), 2),
                QuizQuestion("کدام درست است؟", listOf("This is the most expensive.", "This is more expensive the.", "This is expensive most.", "This is most expensive than."), 0),
                QuizQuestion("معنی «Quality» چیست؟", listOf("ارزان", "کیفیت", "برند", "حراج"), 1)
            )
        )
        3 -> LessonContent("top_notch_2", 3, "Planning a Trip", "برنامه‌ریزی سفر",
            vocabulary = listOf(
                VocabWord("Reservation", "رزرو", "ˌrezərˈveɪʃən"), VocabWord("Itinerary", "برنامه سفر", "aɪˈtɪnəreri"),
                VocabWord("Destination", "مقصد", "ˌdestɪˈneɪʃən"), VocabWord("Departure", "حرکت", "dɪˈpɑːrtʃər"),
                VocabWord("Arrival", "ورود", "əˈraɪvəl"), VocabWord("Luggage", "چمدان", "ˈlʌɡɪdʒ"),
                VocabWord("Passport", "پاسپورت", "ˈpæspɔːrt"), VocabWord("Boarding pass", "کارت پرواز", "ˈbɔːrdɪŋ pæs"),
                VocabWord("Flight", "پرواز", "flaɪt"), VocabWord("Delay", "تأخیر", "dɪˈleɪ")
            ),
            grammar = listOf(
                GrammarSection("📌 Will vs Going to",
                    "• Will: تصمیم لحظه‌ای / پیش‌بینی\n" +
                    "  I'll help you.\n" +
                    "  It will rain tomorrow.\n\n" +
                    "• Going to: برنامه قبلی\n" +
                    "  I'm going to travel to Turkey next summer."),
                GrammarSection("📌 سوال و منفی",
                    "• Will you come? — No, I won't.\n" +
                    "• Are you going to come? — No, I'm not."),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ I will to travel. → ✅ I will travel.\n" +
                    "❌ She will travels. → ✅ She will travel.")
            ),
            conversation = listOf(
                DialogueLine("A", "Where are you going to travel this year?", "امسال کجا می‌خوای سفر کنی؟"),
                DialogueLine("B", "I'm going to visit Italy.", "می‌خوام ایتالیا برم."),
                DialogueLine("A", "How long will you stay?", "چقدر می‌مونی؟"),
                DialogueLine("B", "I'll stay for two weeks.", "دو هفته می‌مونم."),
                DialogueLine("A", "Have you booked your flight?", "پروازت رو رزرو کردی؟"),
                DialogueLine("B", "Not yet. I'm going to book it tomorrow.", "نه هنوز. فردا رزرو می‌کنم."),
                DialogueLine("A", "Do you need help with hotels?", "برای هتل‌ها کمک لازم داری؟"),
                DialogueLine("B", "Yes, please. Something affordable.", "بله، لطفاً. یه چیز مقرون‌به‌صرفه."),
                DialogueLine("A", "I'll send you some options today.", "امروز چند تا گزینه برات می‌فرستم."),
                DialogueLine("B", "Perfect. Thank you so much!", "عالی. خیلی ممنون!")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Luggage» چیست؟", listOf("پاسپورت", "چمدان", "بلیط", "مقصد"), 1),
                QuizQuestion("کدام برای برنامه قبلی درست است؟", listOf("I will travel.", "I'm going to travel.", "I travel.", "I traveling."), 1),
                QuizQuestion("معنی «Departure» چیست؟", listOf("ورود", "حرکت", "تأخیر", "گمرک"), 1),
                QuizQuestion("کدام درست است؟", listOf("I will to travel.", "I will travel.", "I will traveling.", "I will travels."), 1),
                QuizQuestion("«I'll help you» یعنی؟", listOf("قبلاً تصمیم گرفتم", "تصمیم لحظه‌ای", "برنامه قبلی", "سوال"), 1),
                QuizQuestion("معنی «Accommodation» چیست؟", listOf("حمل و نقل", "اقامتگاه", "بلیط", "گمرک"), 1),
                QuizQuestion("کدام درست است؟", listOf("She will visits.", "She will visit.", "She will to visit.", "She will visiting."), 1),
                QuizQuestion("معنی «Souvenir» چیست؟", listOf("سوغات", "پاسپورت", "چمدان", "مقصد"), 0)
            )
        )
        4 -> LessonContent("top_notch_2", 4, "Food and Restaurants", "غذا و رستوران",
            vocabulary = listOf(
                VocabWord("Appetizer", "پیش‌غذا", "ˈæpɪtaɪzər"), VocabWord("Main course", "غذای اصلی", "meɪn kɔːrs"),
                VocabWord("Dessert", "دسر", "dɪˈzɜːrt"), VocabWord("Menu", "منو", "ˈmenjuː"),
                VocabWord("Waiter", "گارسون", "ˈweɪtər"), VocabWord("Bill", "صورت‌حساب", "bɪl"),
                VocabWord("Tip", "انعام", "tɪp"), VocabWord("Reservation", "رزرو", "ˌrezərˈveɪʃən"),
                VocabWord("Recommend", "پیشنهاد کردن", "ˌrekəˈmend"), VocabWord("Delicious", "خوشمزه", "dɪˈlɪʃəs")
            ),
            grammar = listOf(
                GrammarSection("📌 درخواست مؤدبانه",
                    "I would like (I'd like) + اسم\n" +
                    "• I'd like a coffee.\n" +
                    "• I'd like to make a reservation.\n\n" +
                    "Would you like + اسم؟\n" +
                    "• Would you like some dessert?"),
                GrammarSection("📌 تفاوت want و would like",
                    "• I want coffee. (مستقیم)\n" +
                    "• I'd like coffee. (مؤدبانه ✅)"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ I want to make reservation. → ✅ I'd like to make a reservation.")
            ),
            conversation = listOf(
                DialogueLine("A", "Good evening. Do you have a reservation?", "شب بخیر. رزرو دارید؟"),
                DialogueLine("B", "Yes, a table for two under the name Sara.", "بله، میزی برای دو نفر به نام سارا."),
                DialogueLine("A", "This way, please. Here's your menu.", "از این طرف، لطفاً. بفرمایید منو."),
                DialogueLine("B", "Thank you. What do you recommend?", "ممنون. چی پیشنهاد می‌کنید؟"),
                DialogueLine("A", "The grilled chicken is excellent tonight.", "مرغ گریل امشب عالیه."),
                DialogueLine("B", "Sounds good. I'd like that, please.", "خوبه. اون رو می‌خوام، لطفاً."),
                DialogueLine("A", "Would you like an appetizer?", "پیش‌غذا می‌خواید؟"),
                DialogueLine("B", "Yes, a garden salad, please.", "بله، سالاد باغ، لطفاً."),
                DialogueLine("A", "And to drink?", "و برای نوشیدن؟"),
                DialogueLine("B", "Just water, please. And the bill later.", "فقط آب، لطفاً. و بعداً صورت‌حساب.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Appetizer» چیست؟", listOf("غذای اصلی", "دسر", "پیش‌غذا", "نوشیدنی"), 2),
                QuizQuestion("کدام مؤدبانه‌تر است؟", listOf("I want coffee.", "I'd like coffee.", "Give me coffee.", "Coffee!"), 1),
                QuizQuestion("معنی «Recommend» چیست؟", listOf("سفارش دادن", "پیشنهاد کردن", "پختن", "خوردن"), 1),
                QuizQuestion("«Could I have the bill?» یعنی؟", listOf("منو کجاست؟", "صورت‌حساب لطفاً", "غذا آماده‌ست؟", "میز خالیه؟"), 1),
                QuizQuestion("معنی «Spicy» چیست؟", listOf("شیرین", "تند", "ترش", "شور"), 1),
                QuizQuestion("کدام درست است؟", listOf("I'd like make a reservation.", "I'd like to make a reservation.", "I would like make reservation.", "I like to make reservation."), 1),
                QuizQuestion("معنی «Vegetarian» چیست؟", listOf("گوشت‌خوار", "گیاه‌خوار", "سرآشپز", "گارسون"), 1),
                QuizQuestion("«Would you like dessert?» یعنی؟", listOf("دسر داری؟", "دسر می‌خوای؟", "دسر خوردی؟", "دسر چیه؟"), 1)
            )
        )
        5 -> LessonContent("top_notch_2", 5, "Around Town", "گشت در شهر",
            vocabulary = listOf(
                VocabWord("Downtown", "مرکز شهر", "ˌdaʊnˈtaʊn"), VocabWord("Suburb", "حومه شهر", "ˈsʌbɜːrb"),
                VocabWord("Intersection", "چهارراه", "ˌɪntərˈsekʃən"), VocabWord("Traffic light", "چراغ راهنما", "ˈtræfɪk laɪt"),
                VocabWord("Crosswalk", "خط عابر", "ˈkrɔːswɔːk"), VocabWord("Sidewalk", "پیاده‌رو", "ˈsaɪdwɔːk"),
                VocabWord("Landmark", "نقطه شاخص", "ˈlændmɑːrk"), VocabWord("Neighborhood", "محله", "ˈneɪbərhʊd"),
                VocabWord("Roundabout", "میدان", "ˈraʊndəbaʊt"), VocabWord("Block", "بلوک", "blɑːk")
            ),
            grammar = listOf(
                GrammarSection("📌 Imperatives (امری)",
                    "• Turn left / Turn right\n" +
                    "• Go straight\n" +
                    "• Go past the bank\n" +
                    "• It's on your left / right"),
                GrammarSection("📌 حروف اضافه مکان",
                    "• on: on the corner\n" +
                    "• at: at the traffic light\n" +
                    "• next to: next to the bank\n" +
                    "• between: between the bank and the park\n" +
                    "• opposite: opposite the museum"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ Turn in the left. → ✅ Turn left.\n" +
                    "❌ It's in your right. → ✅ It's on your right.")
            ),
            conversation = listOf(
                DialogueLine("A", "Excuse me, how do I get to the museum?", "ببخشید، چطور به موزه برم؟"),
                DialogueLine("B", "Go straight for two blocks.", "دو بلوک مستقیم برو."),
                DialogueLine("A", "Then what?", "بعدش چی؟"),
                DialogueLine("B", "Turn left at the traffic light.", "سر چراغ راهنما بپیچ چپ."),
                DialogueLine("A", "Is it far?", "دوره؟"),
                DialogueLine("B", "About ten minutes on foot.", "حدود ده دقیقه پیاده."),
                DialogueLine("A", "Is there a landmark?", "نقطه شاخصی هست؟"),
                DialogueLine("B", "Yes, it's opposite the big park.", "بله، روبروی پارک بزرگه."),
                DialogueLine("A", "Thank you so much!", "خیلی ممنون!"),
                DialogueLine("B", "You're welcome. Enjoy your visit!", "خواهش می‌کنم. از بازدیدت لذت ببر!")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Intersection» چیست؟", listOf("پیاده‌رو", "چهارراه", "خیابان", "میدان"), 1),
                QuizQuestion("کدام درست است؟", listOf("Turn in the left.", "Turn left.", "Turn on left.", "Left turn on."), 1),
                QuizQuestion("معنی «Landmark» چیست؟", listOf("فاصله", "نقطه شاخص", "بلوک", "گوشه"), 1),
                QuizQuestion("«روبروی» به انگلیسی؟", listOf("next to", "between", "opposite", "behind"), 2),
                QuizQuestion("کدام درست است؟", listOf("It's in your right.", "It's on your right.", "It's at your right.", "It's your right."), 1),
                QuizQuestion("معنی «Roundabout» چیست؟", listOf("چهارراه", "میدان", "پل", "تونل"), 1),
                QuizQuestion("«Go straight» یعنی؟", listOf("بپیچ", "مستقیم برو", "بایست", "برگرد"), 1),
                QuizQuestion("معنی «Nearby» چیست؟", listOf("دور", "نزدیک", "وسط", "کنار"), 1)
            )
        )
        6 -> LessonContent("top_notch_2", 6, "Shopping for Clothes", "خرید لباس",
            vocabulary = listOf(
                VocabWord("Fit", "اندازه بودن", "fɪt"), VocabWord("Suit", "مناسب بودن", "suːt"),
                VocabWord("Match", "هماهنگ بودن", "mætʃ"), VocabWord("Trend", "مد روز", "trend"),
                VocabWord("Style", "سبک", "staɪl"), VocabWord("Pattern", "طرح", "ˈpætərn"),
                VocabWord("Fabric", "پارچه", "ˈfæbrɪk"), VocabWord("Accessories", "اکسسوری", "əkˈsesəriz"),
                VocabWord("Tailor", "خیاط", "ˈteɪlər"), VocabWord("Outfit", "ست لباس", "ˈaʊtfɪt")
            ),
            grammar = listOf(
                GrammarSection("📌 Too / Enough",
                    "• too + صفت (خیلی زیاد - منفی)\n" +
                    "  This dress is too expensive.\n\n" +
                    "• صفت + enough (به اندازه کافی)\n" +
                    "  The shirt is big enough.\n\n" +
                    "• not + صفت + enough (کافی نیست)\n" +
                    "  The jacket is not warm enough."),
                GrammarSection("📌 So / Such",
                    "• This dress is so beautiful!\n" +
                    "• It's such a beautiful dress!"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ This shirt is too much small. → ✅ This shirt is too small.\n" +
                    "❌ It's so a beautiful dress. → ✅ It's such a beautiful dress.")
            ),
            conversation = listOf(
                DialogueLine("A", "How does it fit?", "چطور اندازه‌ست؟"),
                DialogueLine("B", "It's too tight. Do you have a larger size?", "تنگه. سایز بزرگ‌تر دارید؟"),
                DialogueLine("A", "Sure. Which color?", "حتماً. چه رنگی؟"),
                DialogueLine("B", "Black. It matches everything.", "مشکی. با همه چی هماهنگه."),
                DialogueLine("A", "Here's the black one in large.", "اینم مشکی سایز لارج."),
                DialogueLine("B", "It fits perfectly! I'll take it.", "عالی اندازه‌ست! می‌خرمش."),
                DialogueLine("A", "Would you like to see any accessories?", "اکسسوری هم می‌خواید ببینید؟"),
                DialogueLine("B", "Yes, a matching belt, please.", "بله، یه کمربند هماهنگ، لطفاً."),
                DialogueLine("A", "This one suits you very well.", "این خیلی بهت میاد."),
                DialogueLine("B", "Perfect! I'll take both.", "عالی! هر دو رو می‌خرم.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Fit» چیست؟", listOf("طرح", "اندازه بودن", "پارچه", "مد"), 1),
                QuizQuestion("کدام درست است؟", listOf("This shirt is too small.", "This shirt is small too.", "This shirt is very too small.", "This shirt is much small."), 0),
                QuizQuestion("«enough» بعد از کدام می‌آید؟", listOf("فعل", "صفت", "قید", "حرف اضافه"), 1),
                QuizQuestion("معنی «Outfit» چیست؟", listOf("لباس زیر", "ست لباس", "کاپشن", "شلوار"), 1),
                QuizQuestion("کدام درست است؟", listOf("It's so a nice dress.", "It's such a nice dress.", "It's a such nice dress.", "It's nice so a dress."), 1),
                QuizQuestion("معنی «Vintage» چیست؟", listOf("جدید", "قدیمی و خاص", "ارزان", "گران"), 1),
                QuizQuestion("«not enough» یعنی؟", listOf("بیش از حد", "به اندازه کافی", "کافی نیست", "خیلی زیاد"), 2),
                QuizQuestion("معنی «Tailor» چیست؟", listOf("فروشنده", "خیاط", "طراح", "مشتری"), 1)
            )
        )
        7 -> LessonContent("top_notch_2", 7, "Having Fun", "تفریح",
            vocabulary = listOf(
                VocabWord("Entertainment", "سرگرمی", "ˌentərˈteɪnmənt"), VocabWord("Performance", "اجرا", "pərˈfɔːrməns"),
                VocabWord("Concert", "کنسرت", "ˈkɑːnsərt"), VocabWord("Audience", "تماشاگران", "ˈɔːdiəns"),
                VocabWord("Ticket", "بلیط", "ˈtɪkɪt"), VocabWord("Amusement park", "شهربازی", "əˈmjuːzmənt pɑːrk"),
                VocabWord("Enjoyable", "لذت‌بخش", "ɪnˈdʒɔɪəbəl"), VocabWord("Boring", "خسته‌کننده", "ˈbɔːrɪŋ")
            ),
            grammar = listOf(
                GrammarSection("📌 Gerunds بعد از حروف اضافه",
                    "بعد از حرف اضافه، فعل + ing:\n\n" +
                    "• interested in learning\n" +
                    "• good at singing\n" +
                    "• think about going"),
                GrammarSection("📌 Like / Enjoy / Love / Hate + -ing",
                    "• I enjoy watching movies.\n" +
                    "• She loves playing the piano."),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ I'm interested in watch movies. → ✅ I'm interested in watching movies.\n" +
                    "❌ I enjoy to watch movies. → ✅ I enjoy watching movies.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you do for fun?", "برای تفریح چیکار می‌کنی؟"),
                DialogueLine("B", "I'm interested in watching theater.", "به دیدن تئاتر علاقه دارم."),
                DialogueLine("A", "I love going to concerts.", "عاشق کنسرتم."),
                DialogueLine("B", "There's a concert this weekend.", "این آخر هفته یه کنسرت هست."),
                DialogueLine("A", "Really? What kind of music?", "واقعاً؟ چه نوع موسیقی؟"),
                DialogueLine("B", "Classical. Are you interested in that?", "کلاسیک. به اون علاقه داری؟"),
                DialogueLine("A", "Yes, I enjoy listening to classical music.", "بله، از گوش دادن به موسیقی کلاسیک لذت می‌برم."),
                DialogueLine("B", "Great! Let's go together.", "عالی! بیا با هم بریم."),
                DialogueLine("A", "Should we buy tickets in advance?", "باید بلیط رو از قبل بخریم؟"),
                DialogueLine("B", "Yes, it might be crowded.", "بله، ممکنه شلوغ بشه.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Audience» چیست؟", listOf("بازیگر", "تماشاگران", "کارگردان", "نویسنده"), 1),
                QuizQuestion("کدام درست است؟", listOf("I'm interested in watch.", "I'm interested in watching.", "I'm interested to watching.", "I'm interested watching."), 1),
                QuizQuestion("بعد از «enjoy» چه شکلی می‌آید؟", listOf("to + verb", "verb-ing", "verb ساده", "p.p."), 1),
                QuizQuestion("معنی «Thrilling» چیست؟", listOf("خسته‌کننده", "هیجان‌آور", "آرامش‌بخش", "غمگین"), 1),
                QuizQuestion("کدام درست است؟", listOf("I enjoy to read.", "I enjoy reading.", "I enjoy read.", "I enjoy to reading."), 1),
                QuizQuestion("معنی «Crowded» چیست؟", listOf("خلوت", "شلوغ", "بزرگ", "کوچک"), 1),
                QuizQuestion("بعد از «good at» چه می‌آید؟", listOf("verb", "to verb", "verb-ing", "p.p."), 2),
                QuizQuestion("معنی «Performance» چیست؟", listOf("تماشاگر", "اجرا", "بلیط", "سالن"), 1)
            )
        )
        8 -> LessonContent("top_notch_2", 8, "Health Matters", "مسائل سلامتی",
            vocabulary = listOf(
                VocabWord("Symptom", "نشانه", "ˈsɪmptəm"), VocabWord("Prescription", "نسخه", "prɪˈskrɪpʃən"),
                VocabWord("Appointment", "قرار ملاقات", "əˈpɔɪntmənt"), VocabWord("Emergency", "اورژانس", "ɪˈmɜːrdʒənsi"),
                VocabWord("Allergy", "حساسیت", "ˈælərdʒi"), VocabWord("Injury", "آسیب", "ˈɪndʒəri"),
                VocabWord("Treatment", "درمان", "ˈtriːtmənt"), VocabWord("Recovery", "بهبودی", "rɪˈkʌvəri")
            ),
            grammar = listOf(
                GrammarSection("📌 Should have + p.p.",
                    "باید (ولی انجام ندادی):\n" +
                    "• You should have taken your medicine.\n" +
                    "• I should have gone to the doctor earlier."),
                GrammarSection("📌 Could have + p.p.",
                    "می‌توانستی (ولی نکردی):\n" +
                    "• She could have gone to the hospital earlier."),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ You should saw a doctor. → ✅ You should have seen a doctor.")
            ),
            conversation = listOf(
                DialogueLine("A", "Good morning. What brings you here today?", "صبح بخیر. امروز چی شما رو آورد؟"),
                DialogueLine("B", "I've had a bad cough and a fever for a week.", "یه هفته‌ست سرفه شدید و تب دارم."),
                DialogueLine("A", "Any other symptoms?", "علائم دیگه‌ای هم داری؟"),
                DialogueLine("B", "Yes, a sore throat and a headache.", "بله، گلودرد و سردرد."),
                DialogueLine("A", "You should have come sooner.", "باید زودتر می‌اومدی."),
                DialogueLine("B", "I know. I thought it would go away.", "می‌دونم. فکر کردم خوب می‌شه."),
                DialogueLine("A", "I'll prescribe you some medicine.", "برات دارو تجویز می‌کنم."),
                DialogueLine("B", "Should I rest at home?", "باید خونه استراحت کنم؟"),
                DialogueLine("A", "Yes, for at least three days.", "بله، حداقل سه روز."),
                DialogueLine("B", "Thank you, doctor.", "ممنون دکتر.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Prescription» چیست؟", listOf("نسخه", "قرار", "درمان", "علائم"), 0),
                QuizQuestion("کدام درست است؟", listOf("You should saw a doctor.", "You should have seen a doctor.", "You should have saw.", "You should seen."), 1),
                QuizQuestion("«Should have» یعنی؟", listOf("باید بکنم", "باید می‌کردم", "می‌توانستم", "می‌خواهم"), 1),
                QuizQuestion("معنی «Surgery» چیست؟", listOf("درمان", "جراحی", "واکسن", "تشخیص"), 1),
                QuizQuestion("«Could have» یعنی؟", listOf("باید می‌کردم", "می‌توانستم بکنم", "می‌خواهم بکنم", "نمی‌توانم"), 1),
                QuizQuestion("معنی «Chronic» چیست؟", listOf("حاد", "مزمن", "موقت", "خفیف"), 1),
                QuizQuestion("کدام درست است؟", listOf("I should went.", "I should have gone.", "I should have went.", "I should go have."), 1),
                QuizQuestion("معنی «Recovery» چیست؟", listOf("بیماری", "بهبودی", "درمان", "جراحی"), 1)
            )
        )
        9 -> LessonContent("top_notch_2", 9, "Home and Away", "خانه و سفر",
            vocabulary = listOf(
                VocabWord("Rent", "اجاره", "rent"), VocabWord("Lease", "قرارداد اجاره", "liːs"),
                VocabWord("Landlord", "صاحب‌خانه", "ˈlændlɔːrd"), VocabWord("Furnished", "مبله", "ˈfɜːrnɪʃt"),
                VocabWord("Utilities", "قبض‌های خانه", "juːˈtɪlətiz"), VocabWord("Deposit", "ودیعه", "dɪˈpɑːzɪt"),
                VocabWord("Roommate", "هم‌اتاقی", "ˈruːmmeɪt"), VocabWord("Move in", "اسباب‌کشی کردن", "muːv ɪn")
            ),
            grammar = listOf(
                GrammarSection("📌 Present Perfect vs Past Simple",
                    "• Past Simple: زمان مشخص\n" +
                    "  I moved here last year.\n\n" +
                    "• Present Perfect: زمان نامشخص\n" +
                    "  I've lived here for two years."),
                GrammarSection("📌 کلمات نشانه",
                    "• Past Simple: yesterday, last week, in 2020, ago\n" +
                    "• Present Perfect: for, since, ever, never, just, already, yet"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ I've moved here in 2020. → ✅ I moved here in 2020.\n" +
                    "❌ When have you moved? → ✅ When did you move?")
            ),
            conversation = listOf(
                DialogueLine("A", "Hi, I'm calling about the apartment for rent.", "سلام، برای آپارتمان اجاره‌ای تماس گرفتم."),
                DialogueLine("B", "Sure! What would you like to know?", "حتماً! چی می‌خواید بدونید؟"),
                DialogueLine("A", "Is it furnished?", "مبله‌ست؟"),
                DialogueLine("B", "Yes, fully furnished.", "بله، کاملاً مبله."),
                DialogueLine("A", "How much is the deposit?", "ودیعه چقدره؟"),
                DialogueLine("B", "Two months' rent.", "دو ماه اجاره."),
                DialogueLine("A", "Are utilities included?", "قبض‌ها هم شامل می‌شه؟"),
                DialogueLine("B", "Water and electricity, yes.", "آب و برق، بله."),
                DialogueLine("A", "When can I see it?", "کِی می‌تونم ببینمش؟"),
                DialogueLine("B", "How about tomorrow at 5 PM?", "فردا ساعت ۵ چطوره؟")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Landlord» چیست؟", listOf("همسایه", "صاحب‌خانه", "هم‌اتاقی", "مستأجر"), 1),
                QuizQuestion("کدام درست است؟", listOf("I've moved here in 2020.", "I moved here in 2020.", "I have moved here 2020.", "I moving here."), 1),
                QuizQuestion("«for» با کدام می‌آید؟", listOf("Past Simple", "Present Perfect", "Future", "Past Continuous"), 1),
                QuizQuestion("معنی «Furnished» چیست؟", listOf("خالی", "مبله", "بزرگ", "کوچک"), 1),
                QuizQuestion("«When ___ you move?»", listOf("have", "has", "did", "do"), 2),
                QuizQuestion("معنی «Utilities» چیست؟", listOf("اجاره", "ودیعه", "قبض‌ها", "قرارداد"), 2),
                QuizQuestion("کدام درست است؟", listOf("I've lived here since 3 years.", "I've lived here for 3 years.", "I live here since 3 years.", "I'm living here 3 years."), 1),
                QuizQuestion("معنی «Deposit» چیست؟", listOf("اجاره", "ودیعه", "قبض", "قرارداد"), 1)
            )
        )
        10 -> LessonContent("top_notch_2", 10, "Getting Along", "کنار آمدن",
            vocabulary = listOf(
                VocabWord("Argue", "بحث کردن", "ˈɑːrɡjuː"), VocabWord("Agree", "موافق بودن", "əˈɡriː"),
                VocabWord("Disagree", "مخالف بودن", "ˌdɪsəˈɡriː"), VocabWord("Compromise", "سازش", "ˈkɑːmprəmaɪz"),
                VocabWord("Apologize", "عذرخواهی", "əˈpɑːlədʒaɪz"), VocabWord("Forgive", "بخشیدن", "fərˈɡɪv"),
                VocabWord("Get along", "کنار آمدن", "ɡet əˈlɔːŋ"), VocabWord("Misunderstanding", "سوءتفاهم", "ˌmɪsʌndərˈstændɪŋ")
            ),
            grammar = listOf(
                GrammarSection("📌 Reported Speech",
                    "• Say + (that) + جمله:\n" +
                    "  She said she was tired.\n\n" +
                    "• Tell + شخص + (that) + جمله:\n" +
                    "  She told me she was tired."),
                GrammarSection("📌 تغییر زمان در نقل قول",
                    "• Present → Past: \"I am busy.\" → He said he was busy.\n" +
                    "• Will → Would: \"I will come.\" → She said she would come."),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ He said me he was tired. → ✅ He told me he was tired.\n" +
                    "❌ She told that she was tired. → ✅ She said she was tired.")
            ),
            conversation = listOf(
                DialogueLine("A", "I'm upset about yesterday.", "از دیروز ناراحتم."),
                DialogueLine("B", "I'm sorry. I didn't mean to hurt you.", "متأسفم. قصد نداشتم."),
                DialogueLine("A", "You said you would help me.", "گفتی کمکم می‌کنی."),
                DialogueLine("B", "You're right. I should have been there.", "حق داری. باید اونجا می‌بودم."),
                DialogueLine("A", "I felt really alone.", "واقعاً احساس تنهایی کردم."),
                DialogueLine("B", "I understand. Can we compromise?", "می‌فهمم. می‌تونیم سازش کنیم؟"),
                DialogueLine("A", "What do you suggest?", "چی پیشنهاد می‌کنی؟"),
                DialogueLine("B", "Let me make it up to you this weekend.", "بذار این آخر هفته جبران کنم."),
                DialogueLine("A", "Alright. I forgive you.", "باشه. می‌بخشمت."),
                DialogueLine("B", "Thank you. You're a good friend.", "ممنون. تو دوست خوبی هستی.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Compromise» چیست؟", listOf("بحث", "سازش", "عذرخواهی", "بخشش"), 1),
                QuizQuestion("کدام درست است؟", listOf("He said me he was tired.", "He told me he was tired.", "He said to me he tired.", "He told that tired."), 1),
                QuizQuestion("«Tell» با کدام می‌آید؟", listOf("جمله مستقیم", "شخص", "حرف اضافه", "زمان"), 1),
                QuizQuestion("معنی «Apologize» چیست؟", listOf("بخشیدن", "عذرخواهی", "بحث کردن", "سازش"), 1),
                QuizQuestion("کدام درست است؟", listOf("She said she will come.", "She said she would come.", "She said she come.", "She says she would come."), 1),
                QuizQuestion("معنی «Forgive» چیست؟", listOf("بخشیدن", "فراموش کردن", "ناراحت شدن", "عذرخواهی"), 0),
                QuizQuestion("«Get along» یعنی؟", listOf("دعوا کردن", "کنار آمدن", "جدا شدن", "سفر کردن"), 1),
                QuizQuestion("کدام درست است؟", listOf("She told that she was tired.", "She said she was tired.", "She said me she was tired.", "She told she was tired."), 1)
            )
        )
        else -> getDefaultContent("top_notch_2", chapter)
    }
}