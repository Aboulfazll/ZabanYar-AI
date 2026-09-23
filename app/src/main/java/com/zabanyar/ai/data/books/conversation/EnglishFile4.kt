package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile4 {

    const val BOOK_ID = "english_file_4"

    fun getChapter(chapterNumber: Int): LessonContent {
        return when (chapterNumber) {
            1 -> chapter1()
            2 -> chapter2()
            3 -> chapter3()
            4 -> chapter4()
            5 -> chapter5()
            6 -> chapter6()
            7 -> chapter7()
            8 -> chapter8()
            9 -> chapter9()
            10 -> chapter10()
            11 -> chapter11()
            12 -> chapter12()
            else -> getDefaultContent(BOOK_ID, chapterNumber)
        }
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 1 — Unexpected Moments
    // ═══════════════════════════════════════════════════════════
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Unexpected Moments",
            titlePersian = "لحظه‌های غیرمنتظره",
            objectives = listOf(
                "Tell a story about something that happened in the past",
                "Use past simple and past continuous together",
                "Use the past perfect",
                "Talk about past habits with used to"
            ),
            vocabulary = listOf(
                VocabWord("unexpected", "غیرمنتظره", "/ˌʌnɪkˈspektɪd/", "adjective", "We had an unexpected problem.", "مشکل غیرمنتظره‌ای داشتیم."),
                VocabWord("incident", "اتفاق", "/ˈɪnsɪdənt/", "noun", "A strange incident happened.", "اتفاق عجیبی افتاد."),
                VocabWord("suddenly", "ناگهان", "/ˈsʌdənli/", "adverb", "Suddenly, the lights went out.", "ناگهان چراغ‌ها خاموش شد."),
                VocabWord("realize", "متوجه شدن", "/ˈriːəlaɪz/", "verb", "I realized I had lost my phone.", "متوجه شدم تلفنم را گم کرده‌ام.", "verb"),
                VocabWord("notice", "توجه کردن", "/ˈnoʊtɪs/", "verb", "Did you notice anything unusual?", "چیز غیرعادی دیدی؟", "verb"),
                VocabWord("fortunately", "خوشبختانه", "/ˈfɔːrtʃənətli/", "adverb", "Fortunately, nobody was hurt.", "خوشبختانه کسی آسیب ندید."),
                VocabWord("eventually", "در نهایت", "/ɪˈventʃuəli/", "adverb", "Eventually, we found the address.", "در نهایت آدرس را پیدا کردیم."),
                VocabWord("delay", "تأخیر", "/dɪˈleɪ/", "noun", "Our flight was delayed.", "پروازمون تأخیر داشت."),
                VocabWord("destination", "مقصد", "/ˌdestɪˈneɪʃən/", "noun", "We reached our destination.", "به مقصد رسیدیم."),
                VocabWord("embarrassed", "خجالت‌زده", "/ɪmˈbærəst/", "adjective", "I felt embarrassed.", "خجالت کشیدم."),
                VocabWord("memorable", "به‌یادماندنی", "/ˈmemərəbəl/", "adjective", "It was a memorable day.", "روز به‌یادماندنی‌ای بود."),
                VocabWord("escape", "فرار کردن", "/ɪˈskeɪp/", "verb", "We escaped the rain.", "از باران در امان ماندیم.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("out of the blue", "ناگهان و بدون مقدمه", "She called me out of the blue.", "ناگهان بهم زنگ زد.", "informal"),
                IdiomExpression("by accident", "اتفاقی", "I found it by accident.", "اتفاقی پیداش کردم.", "neutral"),
                IdiomExpression("in the end", "در نهایت", "In the end, everything worked out.", "در نهایت همه چیز خوب پیش رفت.", "neutral")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("run into", "اتفاقی دیدن", "meet unexpectedly", "I ran into an old friend.", "اتفاقی یه دوست قدیمی دیدم.", "No"),
                PhrasalVerb("find out", "فهمیدن", "discover", "We found out the train was canceled.", "فهمیدیم قطار لغو شده.", "Sometimes"),
                PhrasalVerb("end up", "در نهایت رسیدن به", "finally be in a situation", "We ended up at a small hotel.", "در نهایت در یه هتل کوچیک ماندیم.", "No")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Past -ed endings", "پایان -ed سه تلفظ داره: /t/، /d/، /ɪd/."),
                PronunciationTip("Was and were", "was و were در گفتار طبیعی کوتاه تلفظ می‌شن."),
                PronunciationTip("Story rhythm", "کلمات suddenly، then، finally تأکید بیشتری می‌گیرن.")
            ),
            culturalNotes = listOf(
                CulturalNote("Telling stories", "تعریف اتفاق غیرمنتظره راهی طبیعی برای ادامه مکالمه‌ست."),
                CulturalNote("Follow-up questions", "What happened next? / How did you feel? رایجند.")
            ),
            grammar = listOf(
                GrammarSection("Past Simple and Past Continuous",
                    """
                        Past continuous: I was walking home at eight.
                        Past simple: I was walking home when I saw an old friend.
                        الگو: Past continuous + when + Past simple
                    """.trimIndent()),
                GrammarSection("When and While",
                    """
                        while + past continuous: While I was driving, it started to rain.
                        when + past simple: I was driving when it started to rain.
                    """.trimIndent()),
                GrammarSection("Past Perfect",
                    """
                        had + past participle
                        When I arrived, the movie had already started.
                        She was tired because she had worked all day.
                    """.trimIndent()),
                GrammarSection("Used To",
                    """
                        I used to live in a small town.
                        I didn't use to like coffee.
                        Did you use to live here?
                    """.trimIndent()),
                GrammarSection("Story Sequence",
                    """
                        first, then, suddenly, after that, eventually, finally, in the end
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I was walk home when I saw him.", "I was walking home when I saw him.", "بعد از was/were از verb+ing."),
                CommonMistake("When I arrived, the movie already started.", "When I arrived, the movie had already started.", "past perfect لازمه."),
                CommonMistake("I use to live there.", "I used to live there.", "در مثبت used to."),
                CommonMistake("Did you used to play football?", "Did you use to play football?", "بعد از did از use.")
            ),
            conversation = listOf(
                DialogueLine("Daniel", "You won't believe what happened to me yesterday.", "باورت نمی‌شود دیروز چه اتفاقی افتاد."),
                DialogueLine("Maya", "Really? What happened?", "واقعاً؟ چی شد؟"),
                DialogueLine("Daniel", "I was walking home when I suddenly heard someone calling my name.", "داشتم به خانه می‌رفتم که ناگهان شنیدم کسی اسمم را صدا می‌زند."),
                DialogueLine("Maya", "Who was it?", "کی بود؟"),
                DialogueLine("Daniel", "An old classmate I hadn't seen for almost ten years.", "همکلاسی قدیمی که ده سال بود ندیده بودمش."),
                DialogueLine("Maya", "No way! Where did you meet?", "باورکردنی نیست! کجا همدیگه رو دیدید؟"),
                DialogueLine("Daniel", "Outside a small bookstore near my apartment.", "جلوی یه کتاب‌فروشی کوچیک نزدیک آپارتمانم."),
                DialogueLine("Maya", "What was he doing there?", "اونجا چیکار می‌کرد؟"),
                DialogueLine("Daniel", "He was looking for a birthday present for his sister.", "دنبال هدیه تولد برای خواهرش می‌گشت."),
                DialogueLine("Maya", "Did you recognize him immediately?", "فوراً شناختیش؟"),
                DialogueLine("Daniel", "Not at first. He had changed a lot.", "اولش نه. خیلی عوض شده بود."),
                DialogueLine("Maya", "What made you realize who he was?", "چی باعث شد بفهمی کیه؟"),
                DialogueLine("Daniel", "He mentioned our old science teacher.", "اسم معلم علوم قدیمی‌مون رو آورد."),
                DialogueLine("Maya", "That must have been strange.", "حتماً عجیب بوده."),
                DialogueLine("Daniel", "It was. We hadn't spoken since school.", "بود. از مدرسه با هم صحبت نکرده بودیم."),
                DialogueLine("Maya", "Did you stay and talk?", "موندید و صحبت کردید؟"),
                DialogueLine("Daniel", "Yes. We talked for almost an hour.", "بله. تقریباً یه ساعت صحبت کردیم."),
                DialogueLine("Maya", "What have you both been doing since school?", "از مدرسه هر کدوم چیکار کرده‌اید؟"),
                DialogueLine("Daniel", "He's become a doctor, and I've been working in software.", "اون دکتر شده و من در نرم‌افزار کار می‌کنم."),
                DialogueLine("Maya", "Did you used to have the same interests?", "قبلاً علایق مشابهی داشتید؟"),
                DialogueLine("Daniel", "Yes. We used to talk about technology for hours.", "بله. ساعت‌ها درباره تکنولوژی صحبت می‌کردیم."),
                DialogueLine("Maya", "That's a great story.", "داستان جالبیه."),
                DialogueLine("Daniel", "We exchanged numbers and decided to meet next week.", "شماره رد و بدل کردیم و قرار شد هفته بعد ببینیم."),
                DialogueLine("Maya", "Life brings people back together unexpectedly.", "زندگی آدم‌ها رو غیرمنتظره به هم می‌رسونه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Where was Daniel going?", "He was walking home from work."),
                ComprehensionQuestion("Who did Daniel meet?", "An old classmate."),
                ComprehensionQuestion("How long since he had seen him?", "Almost ten years."),
                ComprehensionQuestion("What helped him remember?", "The classmate mentioned their old science teacher."),
                ComprehensionQuestion("What did they decide?", "To meet for coffee the following week.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Tell a story about an unexpected meeting.", "داستان یه ملاقات غیرمنتظره تعریف کن.", "I was... when... / Suddenly... / Eventually..."),
                SpeakingTask("Describe something you used to do.", "درباره کاری که قبلاً می‌کردی صحبت کن.", "I used to... / When I was younger..."),
                SpeakingTask("Ask detailed questions about a memorable day.", "درباره یه روز به‌یادماندنی سؤال‌های جزئی بپرس.", "What happened? / What were you doing?")
            ),
            writingTasks = listOf(
                WritingTask("Write a story about an unexpected event.", "داستانی درباره یه اتفاق غیرمنتظره بنویس.", 220, "First... / While... / Suddenly... / Eventually...")
            ),
            quiz = listOf(
                QuizQuestion("Choose the correct sentence.", listOf("I was walk home when he called.", "I was walking home when he called.", "I walking home when he called.", "I were walking home."), 1),
                QuizQuestion("Complete: When I arrived, the movie ___ already started.", listOf("has", "had", "was", "did"), 1),
                QuizQuestion("Choose the correct sentence.", listOf("I used to live there.", "I use to lived there.", "I used live there.", "I was use to live."), 0),
                QuizQuestion("Complete: Did you ___ to play football?", listOf("used", "use", "using", "uses"), 1),
                QuizQuestion("Which word means 'unexpectedly'?", listOf("suddenly", "usually", "carefully", "regularly"), 0),
                QuizQuestion("Choose the correct sentence.", listOf("While I was driving, it started to rain.", "While I drove, it was started raining.", "While I driving, it started rain.", "While I was drive, it raining."), 0),
                QuizQuestion("Which phrase means 'meet unexpectedly'?", listOf("give up", "run into", "take up", "look after"), 1),
                QuizQuestion("Complete: She was tired because she ___ all day.", listOf("worked", "has worked", "had worked", "was work"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 2 — Home and Furniture
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "Home and Furniture",
            titlePersian = "خانه و مبلمان",
            objectives = listOf(
                "Describe homes and furniture",
                "Use the passive voice",
                "Talk about renovating and decorating",
                "Use have something done"
            ),
            vocabulary = listOf(
                VocabWord("furniture", "مبلمان", "/ˈfɜːrnɪtʃər/", "noun", "We bought new furniture.", "مبلمان جدید خریدیم."),
                VocabWord("sofa", "مبل", "/ˈsoʊfə/", "noun", "The sofa is very comfortable.", "مبل خیلی راحته."),
                VocabWord("cupboard", "کمد", "/ˈkʌbərd/", "noun", "The cups are in the cupboard.", "فنجان‌ها در کمد هستند."),
                VocabWord("shelf", "قفسه", "/ʃelf/", "noun", "Put the books on the shelf.", "کتاب‌ها رو روی قفسه بگذار."),
                VocabWord("curtain", "پرده", "/ˈkɜːrtən/", "noun", "The curtains are blue.", "پرده‌ها آبی هستند."),
                VocabWord("carpet", "فرش", "/ˈkɑːrpɪt/", "noun", "We have a Persian carpet.", "ما یه فرش ایرانی داریم."),
                VocabWord("renovate", "بازسازی کردن", "/ˈrenəveɪt/", "verb", "We're renovating the kitchen.", "داریم آشپزخانه رو بازسازی می‌کنیم.", "verb"),
                VocabWord("decorate", "تزئین کردن", "/ˈdekəreɪt/", "verb", "She decorated the room.", "او اتاق رو تزئین کرد.", "verb"),
                VocabWord("repair", "تعمیر کردن", "/rɪˈper/", "verb", "The roof needs repairing.", "سقف نیاز به تعمیر داره.", "verb"),
                VocabWord("comfortable", "راحت", "/ˈkʌmftərbəl/", "adjective", "The chairs are very comfortable.", "صندلی‌ها خیلی راحتند."),
                VocabWord("spacious", "جادار", "/ˈspeɪʃəs/", "adjective", "The living room is spacious.", "اتاق نشیمن جاداره."),
                VocabWord("modern", "مدرن", "/ˈmɑːdərn/", "adjective", "The kitchen is very modern.", "آشپزخانه خیلی مدرنه.")
            ),
            idioms = listOf(
                IdiomExpression("home sweet home", "خونه خود آدم خوبه", "After the trip, home sweet home.", "بعد از سفر، خونه خود آدم خوبه.", "idiom"),
                IdiomExpression("make yourself at home", "راحت باش", "Please make yourself at home.", "لطفاً راحت باش.", "neutral"),
                IdiomExpression("spruce up", "سر و سامان دادن", "We need to spruce up the living room.", "باید اتاق نشیمن رو سر و سامان بدیم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Silent letters", "در cupboard، حرف p و r تلفظ نمی‌شن: /ˈkʌbərd/."),
                PronunciationTip("Compound words", "در living room و bedroom استرس روی کلمه اول.")
            ),
            culturalNotes = listOf(
                CulturalNote("Home decoration", "در غرب، تزئین خانه بخش مهمی از زندگیه."),
                CulturalNote("DIY culture", "خودت انجام بده در غرب رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Passive Voice",
                    """
                        be + past participle
                        The house was built in 1950.
                        The kitchen has been renovated.
                        The rooms are cleaned every day.
                    """.trimIndent()),
                GrammarSection("Have something done",
                    """
                        have + object + past participle
                        I had my roof repaired.
                        She's having her kitchen painted.
                        We need to have the carpets cleaned.
                    """.trimIndent()),
                GrammarSection("Describing homes",
                    """
                        It's a spacious apartment.
                        The kitchen is modern and bright.
                        There are two bedrooms.
                    """.trimIndent()),
                GrammarSection("Prepositions of place",
                    """
                        on the wall, on the floor, in the corner, next to the window
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The house built in 1950.", "The house was built in 1950.", "passive: was + pp."),
                CommonMistake("I repaired my roof (by myself).", "I had my roof repaired (by someone).", "have something done."),
                CommonMistake("Furnitures are expensive.", "Furniture is expensive.", "furniture غیرقابل شمارشه.")
            ),
            conversation = listOf(
                DialogueLine("A", "Your apartment looks amazing!", "آپارتمانت فوق‌العاده به نظر می‌رسه!"),
                DialogueLine("B", "Thanks! We've just finished renovating it.", "ممنون! تازه بازسازی‌اش رو تموم کردیم."),
                DialogueLine("A", "When was it built?", "کِی ساخته شده؟"),
                DialogueLine("B", "It was built in 1970, but everything has been updated.", "۱۹۷۰ ساخته شده، ولی همه چیز به‌روز شده."),
                DialogueLine("A", "Did you do the work yourselves?", "خودتون کار رو انجام دادید؟"),
                DialogueLine("B", "Some of it. But we had the kitchen painted professionally.", "بخشی از کار رو. ولی آشپزخانه رو حرفه‌ای رنگ کردیم."),
                DialogueLine("A", "I love the furniture. Is it new?", "عاشق مبلمانشم. جدیده؟"),
                DialogueLine("B", "Yes, we bought a new sofa and shelves.", "بله، یه مبل و قفسه جدید خریدیم."),
                DialogueLine("A", "The curtains match perfectly.", "پرده‌ها کاملاً هماهنگن."),
                DialogueLine("B", "Thanks. My mother made them.", "ممنون. مادرم درستشون کرد."),
                DialogueLine("A", "Really? She's talented!", "واقعاً؟ با استعداده!"),
                DialogueLine("B", "She is. She also helped with the carpet.", "هست. با فرش هم کمک کرد."),
                DialogueLine("A", "It must have been a lot of work.", "حتماً کار زیادی بوده."),
                DialogueLine("B", "It was. But now it feels like home.", "بود. ولی الان حس خونه می‌ده."),
                DialogueLine("A", "I bet. Do you need any help with anything?", "قطعاً. کمکی لازم داری؟"),
                DialogueLine("B", "Actually, I need to have the roof checked.", "در واقع، باید سقف رو بررسی کنم."),
                DialogueLine("A", "I know a good roofer.", "یه سقف‌ساز خوب می‌شناسم."),
                DialogueLine("B", "That would be great. Thanks!", "عالی می‌شه. ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("When was the apartment built?", "In 1970."),
                ComprehensionQuestion("What did they have professionally painted?", "The kitchen."),
                ComprehensionQuestion("Who made the curtains?", "B's mother."),
                ComprehensionQuestion("What does B need help with?", "Having the roof checked.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your home.", "خونت رو توصیف کن.", "It's a... / It was built in... / There is/are..."),
                SpeakingTask("Talk about a renovation project.", "درباره یه پروژه بازسازی صحبت کن.", "We had... / It was...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your ideal home.", "خونه رویایی‌ات رو توصیف کن.", 180, "Use passive voice and have something done.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The house ___ built in 1950.", listOf("is", "was", "has", "did"), 1),
                QuizQuestion("Complete: I had my roof ___.", listOf("repair", "repairing", "repaired", "repairs"), 2),
                QuizQuestion("Complete: The rooms ___ cleaned every day.", listOf("is", "are", "was", "has"), 1),
                QuizQuestion("What does 'spruce up' mean?", listOf("سر و سامان دادن", "تمیز کردن", "خرید کردن", "تعمیر کردن"), 0),
                QuizQuestion("Complete: She's having her kitchen ___.", listOf("paint", "paints", "painted", "painting"), 2),
                QuizQuestion("Complete: Furniture ___ expensive.", listOf("are", "is", "were", "have"), 1),
                QuizQuestion("Complete: The kitchen has been ___.", listOf("renovate", "renovated", "renovating", "renovates"), 1),
                QuizQuestion("What does 'make yourself at home' mean?", listOf("راحت باش", "برو خونه", "خونه بساز", "تمیز کن"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 3 — Healthy Living
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Healthy Living",
            titlePersian = "زندگی سالم",
            objectives = listOf(
                "Discuss health and lifestyle",
                "Use modal verbs for advice",
                "Use gerunds and infinitives",
                "Talk about healthy habits"
            ),
            vocabulary = listOf(
                VocabWord("nutrition", "تغذیه", "/nuːˈtrɪʃən/", "noun", "Nutrition is important.", "تغذیه مهمه."),
                VocabWord("diet", "رژیم", "/ˈdaɪət/", "noun", "She's on a healthy diet.", "او رژیم سالمی داره."),
                VocabWord("calorie", "کالری", "/ˈkæləri/", "noun", "This meal has too many calories.", "این غذا کالری زیادی داره."),
                VocabWord("exercise", "ورزش", "/ˈeksərsaɪz/", "noun", "Regular exercise is good.", "ورزش منظم خوبه."),
                VocabWord("stress", "استرس", "/stres/", "noun", "Stress affects your health.", "استرس سلامت رو تحت تأثیر قرار می‌ده."),
                VocabWord("relax", "استراحت کردن", "/rɪˈlæks/", "verb", "You need to relax more.", "باید بیشتر استراحت کنی.", "verb"),
                VocabWord("balanced", "متعادل", "/ˈbælənst/", "adjective", "Eat a balanced diet.", "رژیم متعادل داشته باش."),
                VocabWord("organic", "ارگانیک", "/ɔːrˈɡænɪk/", "adjective", "Organic food is healthier.", "غذای ارگانیک سالم‌تره."),
                VocabWord("addicted", "معتاد", "/əˈdɪktɪd/", "adjective", "He's addicted to sugar.", "او به شکر معتوده."),
                VocabWord("mental health", "سلامت روان", "/ˈmentl helθ/", "noun", "Mental health matters.", "سلامت روان مهمه."),
                VocabWord("sleep", "خواب", "/sliːp/", "noun", "You need more sleep.", "به خواب بیشتری نیاز داری."),
                VocabWord("routine", "روتین", "/ruːˈtiːn/", "noun", "I have a morning routine.", "روتین صبحگاهی دارم.")
            ),
            idioms = listOf(
                IdiomExpression("burn out", "فرسوده شدن", "Many people burn out from work.", "بسیاری از کار فرسوده می‌شن.", "informal"),
                IdiomExpression("under the weather", "حالش خوب نبودن", "I'm feeling under the weather.", "حالم خوب نیست.", "informal"),
                IdiomExpression("take it easy", "سخت نگیر", "Take it easy this weekend.", "این آخر هفته سخت نگیر.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("stress", "stress /stres/ — ترکیب st+r."),
                PronunciationTip("calorie", "calorie /ˈkæləri/ — سه سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Mental health", "سلامت روان در غرب مهمه."),
                CulturalNote("Gym culture", "عضویت در باشگاه رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Modal verbs for advice",
                    """
                        You should exercise more.
                        You shouldn't eat junk food.
                        You ought to sleep more.
                    """.trimIndent()),
                GrammarSection("Gerunds after prepositions",
                    """
                        I'm good at relaxing.
                        She's interested in yoga.
                        He's thinking about changing jobs.
                    """.trimIndent()),
                GrammarSection("Infinitives after certain verbs",
                    """
                        I want to lose weight.
                        I need to sleep more.
                        She decided to quit smoking.
                    """.trimIndent()),
                GrammarSection("Present perfect for lifestyle",
                    """
                        I've started going to the gym.
                        She's quit smoking.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("You should to exercise.", "You should exercise.", "بعد از should فعل ساده."),
                CommonMistake("I'm interesting in yoga.", "I'm interested in yoga.", "interested."),
                CommonMistake("I want lose weight.", "I want to lose weight.", "بعد از want از to.")
            ),
            conversation = listOf(
                DialogueLine("A", "You look great! What's your secret?", "عالی به نظر می‌رسی! رازت چیه؟"),
                DialogueLine("B", "I've started living a healthier lifestyle.", "شروع کرده‌ام سبک زندگی سالم‌تری داشته باشم."),
                DialogueLine("A", "What changes have you made?", "چه تغییراتی دادی؟"),
                DialogueLine("B", "I exercise three times a week and eat a balanced diet.", "هفته‌ای سه بار ورزش می‌کنم و رژیم متعادل دارم."),
                DialogueLine("A", "Do you still eat fast food?", "هنوز فست‌فود می‌خوری؟"),
                DialogueLine("B", "Rarely. I've cut down on sugar too.", "به‌ندرت. شکر رو هم کم کرده‌ام."),
                DialogueLine("A", "How do you deal with stress?", "با استرس چطور کنار میای؟"),
                DialogueLine("B", "I meditate and make sure I sleep enough.", "مدیتیشن می‌کنم و مطمئن می‌شم به‌اندازه کافی بخوابم."),
                DialogueLine("A", "That sounds great. I should try that.", "عالی به نظر می‌رسه. منم باید امتحان کنم."),
                DialogueLine("B", "You should! It's never too late.", "باید بکنی! هیچ‌وقت دیر نیست."),
                DialogueLine("A", "What's the hardest part?", "سخت‌ترین قسمت چیه؟"),
                DialogueLine("B", "Staying consistent. Some days I don't feel motivated.", "پیوسته موندن. بعضی روزها انگیزه ندارم."),
                DialogueLine("A", "I understand. Do you have any tips?", "می‌فهمم. توصیه‌ای داری؟"),
                DialogueLine("B", "Start small. Small changes add up.", "کوچک شروع کن. تغییرات کوچک جمع می‌شن."),
                DialogueLine("A", "Good advice. Thanks!", "توصیه خوبی. ممنون!"),
                DialogueLine("B", "Anytime. Take care of yourself.", "هر وقت. از خودت مراقبت کن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What changes has B made?", "Exercises three times a week, eats balanced diet, cut down on sugar."),
                ComprehensionQuestion("How does B deal with stress?", "Meditates and sleeps enough."),
                ComprehensionQuestion("What's the hardest part?", "Staying consistent."),
                ComprehensionQuestion("What's B's advice?", "Start small.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your healthy habits.", "درباره عادات سالمت صحبت کن.", "I usually... / I've started..."),
                SpeakingTask("Give advice about reducing stress.", "درباره کاهش استرس توصیه کن.", "You should...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your health goals.", "درباره اهداف سلامتی‌ات بنویس.", 150, "Use modal verbs and gerunds.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: You ___ exercise more.", listOf("should", "should to", "shoulds", "shoulding"), 0),
                QuizQuestion("Complete: I'm interested ___ yoga.", listOf("on", "in", "at", "for"), 1),
                QuizQuestion("Complete: I want ___ lose weight.", listOf("to", "for", "at", "on"), 0),
                QuizQuestion("What does 'burn out' mean?", listOf("آتش زدن", "فرسوده شدن", "روشن شدن", "خاموش شدن"), 1),
                QuizQuestion("Complete: I've ___ going to the gym.", listOf("start", "started", "starting", "starts"), 1),
                QuizQuestion("Complete: I need ___ sleep more.", listOf("to", "for", "at", "on"), 0),
                QuizQuestion("Complete: She's thinking ___ changing jobs.", listOf("on", "about", "at", "for"), 1),
                QuizQuestion("What does 'take it easy' mean?", listOf("سخت بگیر", "سخت نگیر", "سریع برو", "کار کن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 4 — Life Stories
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Life Stories",
            titlePersian = "داستان‌های زندگی",
            objectives = listOf(
                "Tell life stories and biographies",
                "Use narrative tenses",
                "Talk about important life events",
                "Use time expressions for narration"
            ),
            vocabulary = listOf(
                VocabWord("biography", "زندگی‌نامه", "/baɪˈɑːɡrəfi/", "noun", "I read her biography.", "زندگی‌نامه‌اش رو خوندم."),
                VocabWord("childhood", "کودکی", "/ˈtʃaɪldhʊd/", "noun", "He had a happy childhood.", "کودکی شادی داشت."),
                VocabWord("achieve", "دست یافتن", "/əˈtʃiːv/", "verb", "She achieved her dream.", "به رویاش رسید.", "verb"),
                VocabWord("career", "حرفه", "/kəˈrɪr/", "noun", "He had a successful career.", "حرفه موفقی داشت."),
                VocabWord("milestone", "نقطه عطف", "/ˈmaɪlstoʊn/", "noun", "Graduation was a milestone.", "فارغ‌التحصیلی نقطه عطف بود."),
                VocabWord("inspire", "الهام بخشیدن", "/ɪnˈspaɪər/", "verb", "She inspires many people.", "او به بسیاری الهام می‌بخشد.", "verb"),
                VocabWord("overcome", "غلبه کردن", "/ˌoʊvərˈkʌm/", "verb", "He overcame many challenges.", "او بر چالش‌های زیادی غلبه کرد.", "verb"),
                VocabWord("inspiration", "الهام", "/ˌɪnspəˈreɪʃən/", "noun", "She's my inspiration.", "او الهام‌بخش منه."),
                VocabWord("talent", "استعداد", "/ˈtælənt/", "noun", "He has a natural talent.", "استعداد طبیعی داره."),
                VocabWord("passion", "اشتیاق", "/ˈpæʃən/", "noun", "She has a passion for music.", "او به موسیقی اشتیاق داره."),
                VocabWord("legacy", "میراث", "/ˈleɡəsi/", "noun", "He left a lasting legacy.", "میراث ماندگاری به جا گذاشت."),
                VocabWord("pioneer", "پیشگام", "/ˌpaɪəˈnɪr/", "noun", "She was a pioneer in science.", "او در علم پیشگام بود.")
            ),
            idioms = listOf(
                IdiomExpression("come a long way", "پیشرفت زیادی کردن", "She's come a long way.", "خیلی پیشرفت کرده.", "idiom"),
                IdiomExpression("from rags to riches", "از فقر به ثروت", "His story is from rags to riches.", "داستانش از فقر به ثروته.", "idiom"),
                IdiomExpression("against all odds", "برخلاف همه شانس‌ها", "She succeeded against all odds.", "برخلاف همه شانس‌ها موفق شد.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Narrative rhythm", "در داستان‌گویی، فعل‌های اصلی تأکید بیشتری می‌گیرن."),
                PronunciationTip("Time expressions", "In 1990، at the age of... — تلفظ واضح.")
            ),
            culturalNotes = listOf(
                CulturalNote("Biographies", "زندگی‌نامه‌ها بخش مهمی از ادبیات غربند."),
                CulturalNote("Inspiring stories", "داستان‌های الهام‌بخش محبوبند.")
            ),
            grammar = listOf(
                GrammarSection("Narrative Tenses",
                    """
                        Past simple: She was born in 1980.
                        Past continuous: She was working as a teacher.
                        Past perfect: She had studied abroad.
                    """.trimIndent()),
                GrammarSection("Time Expressions",
                    """
                        In 1985, at the age of 20, after that, later, eventually
                    """.trimIndent()),
                GrammarSection("Connecting Ideas",
                    """
                        She grew up in a small town. Later, she moved to the city.
                    """.trimIndent()),
                GrammarSection("Describing Achievements",
                    """
                        She became the first woman to...
                        He was awarded...
                        They achieved...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She born in 1980.", "She was born in 1980.", "passive لازم داره was."),
                CommonMistake("He has achieved a lot last year.", "He achieved a lot last year.", "زمان مشخص = past simple."),
                CommonMistake("She successed.", "She succeeded.", "spelling.")
            ),
            conversation = listOf(
                DialogueLine("A", "Who's your biggest inspiration?", "بزرگ‌ترین الهام‌بخش تو کیه؟"),
                DialogueLine("B", "Malala Yousafzai. Her story is incredible.", "ملالا یوسفزی. داستانش باورنکردنیه."),
                DialogueLine("A", "What do you admire about her?", "چی در موردش تحسین می‌کنی؟"),
                DialogueLine("B", "She stood up for education against all odds.", "او برخلاف همه شانس‌ها برای آموزش ایستاد."),
                DialogueLine("A", "Was she always an activist?", "همیشه فعال بود؟"),
                DialogueLine("B", "No, she started as a young blogger.", "نه، به عنوان یه وبلاگ‌نویس جوان شروع کرد."),
                DialogueLine("A", "When did she become famous?", "کِی معروف شد؟"),
                DialogueLine("B", "In 2012, after she was attacked.", "در سال ۲۰۱۲، بعد از حمله به او."),
                DialogueLine("A", "That must have been terrifying.", "این باید ترسناک بوده."),
                DialogueLine("B", "It was. But she didn't give up.", "بود. ولی تسلیم نشد."),
                DialogueLine("A", "What has she achieved since then?", "از آن موقع چی به دست آورده؟"),
                DialogueLine("B", "She won the Nobel Peace Prize in 2014.", "جایزه نوبل صلح رو در ۲۰۱۴ برد."),
                DialogueLine("A", "That's amazing for someone so young.", "برای یه نفر اینقدر جوان فوق‌العاده‌ست."),
                DialogueLine("B", "Yes, she's inspired millions.", "بله، به میلیون‌ها نفر الهام بخشیده."),
                DialogueLine("A", "What can we learn from her?", "چی می‌تونیم ازش یاد بگیریم؟"),
                DialogueLine("B", "That one person can make a difference.", "که یه نفر می‌تونه تفاوت ایجاد کنه."),
                DialogueLine("A", "That's powerful.", "این قدرتمنده."),
                DialogueLine("B", "It is. She's a true pioneer.", "هست. اون واقعاً یه پیشگامه."),
                DialogueLine("A", "Thanks for sharing her story.", "ممنون که داستانش رو گفتی."),
                DialogueLine("B", "Anytime.", "هر وقت.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Who is B's biggest inspiration?", "Malala Yousafzai."),
                ComprehensionQuestion("What did Malala stand up for?", "Education."),
                ComprehensionQuestion("When did she win the Nobel Prize?", "In 2014."),
                ComprehensionQuestion("What can we learn from her?", "One person can make a difference.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about someone who inspires you.", "درباره کسی که بهت الهام می‌بخشه صحبت کن.", "I admire... / She's... / She inspires me because..."),
                SpeakingTask("Tell a short biography of a famous person.", "زندگی‌نامه کوتاهی از یه شخص مشهور تعریف کن.", "She was born in... / She achieved...")
            ),
            writingTasks = listOf(
                WritingTask("Write a short biography of someone you admire.", "زندگی‌نامه کوتاهی از کسی که تحسینش می‌کنی بنویس.", 200, "Use narrative tenses and time expressions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ born in 1980.", listOf("is", "was", "has", "did"), 1),
                QuizQuestion("Complete: He ___ a lot last year.", listOf("has achieved", "achieved", "achieves", "achieving"), 1),
                QuizQuestion("Complete: She had ___ abroad.", listOf("study", "studied", "studying", "studies"), 1),
                QuizQuestion("What does 'come a long way' mean?", listOf("راه طولانی", "پیشرفت زیادی", "دور رفتن", "بازگشت"), 1),
                QuizQuestion("Complete: She was ___ as a teacher.", listOf("work", "worked", "working", "works"), 2),
                QuizQuestion("What does 'against all odds' mean?", listOf("برخلاف همه شانس‌ها", "با شانس", "بی‌شانس", "خوش‌شانس"), 0),
                QuizQuestion("Complete: She ___ a pioneer.", listOf("is", "are", "have", "has"), 0),
                QuizQuestion("What does 'from rags to riches' mean?", listOf("از فقر به ثروت", "فقیر", "ثروتمند", "متوسط"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 5 — Appearance and Fashion
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Appearance and Fashion",
            titlePersian = "ظاهر و مد",
            objectives = listOf(
                "Describe appearance and style",
                "Use comparatives and superlatives",
                "Talk about fashion trends",
                "Express opinions about style"
            ),
            vocabulary = listOf(
                VocabWord("appearance", "ظاهر", "/əˈpɪrəns/", "noun", "Appearance is important to some.", "ظاهر برای برخی مهمه."),
                VocabWord("fashion", "مد", "/ˈfæʃən/", "noun", "She loves fashion.", "او عاشق مده."),
                VocabWord("style", "استایل", "/staɪl/", "noun", "He has a unique style.", "او استایل منحصربه‌فردی داره."),
                VocabWord("trend", "ترند", "/trend/", "noun", "This is the latest trend.", "این آخرین ترنده."),
                VocabWord("elegant", "شیک", "/ˈelɪɡənt/", "adjective", "She wore an elegant dress.", "یه لباس شیک پوشید."),
                VocabWord("casual", "غیررسمی", "/ˈkæʒuəl/", "adjective", "I prefer casual clothes.", "لباس غیررسمی ترجیح می‌دم."),
                VocabWord("formal", "رسمی", "/ˈfɔːrməl/", "adjective", "It's a formal event.", "رویداد رسمیه."),
                VocabWord("trendy", "مدروز", "/ˈtrendi/", "adjective", "That outfit is very trendy.", "این ست خیلی مدروزه."),
                VocabWord("outfit", "ست لباس", "/ˈaʊtfɪt/", "noun", "I love your outfit!", "عاشق ستت هستم!"),
                VocabWord("accessory", "اکسسوری", "/əkˈsesəri/", "noun", "Accessories complete an outfit.", "اکسسوری‌ها ست رو کامل می‌کنن."),
                VocabWord("match", "ست شدن", "/mætʃ/", "verb", "Your shoes match your bag.", "کفشت با کیفت ست شده.", "verb"),
                VocabWord("wear", "پوشیدن", "/wer/", "verb", "She wears glasses.", "او عینک می‌زنه.", "verb")
            ),
            idioms = listOf(
                IdiomExpression("dressed to kill", "خیلی شیک پوشیدن", "She was dressed to kill.", "خیلی شیک پوشیده بود.", "informal"),
                IdiomExpression("fit like a glove", "دقیقاً اندازه بودن", "The dress fits like a glove.", "لباس دقیقاً اندازه‌ست.", "idiom"),
                IdiomExpression("in style", "مد روز", "Bell-bottoms are back in style.", "شلوارهای دم‌پا دوباره مد شدن.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Silent letters", "در clothes، th صدادار."),
                PronunciationTip("Word stress", "elegant /ˈelɪɡənt/ — استرس روی el.")
            ),
            culturalNotes = listOf(
                CulturalNote("Fashion industry", "صنعت مد در غرب بزرگه."),
                CulturalNote("Dress codes", "کدهای پوشش در محیط کار مهمند.")
            ),
            grammar = listOf(
                GrammarSection("Comparatives",
                    """
                        -er + than: taller than, cheaper than
                        more + adjective + than: more elegant than
                    """.trimIndent()),
                GrammarSection("Superlatives",
                    """
                        the + -est: the tallest, the cheapest
                        the most + adjective: the most elegant
                    """.trimIndent()),
                GrammarSection("Too and enough",
                    """
                        This dress is too expensive.
                        The shirt isn't big enough.
                    """.trimIndent()),
                GrammarSection("Opinions about style",
                    """
                        I think... / In my opinion... / It seems to me...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She is more tall.", "She is taller.", "صفت کوتاه: -er."),
                CommonMistake("This is the most cheap.", "This is the cheapest.", "صفت کوتاه: -est."),
                CommonMistake("I like her cloth.", "I like her clothes.", "clothes جمع.")
            ),
            conversation = listOf(
                DialogueLine("A", "I love your outfit! Where did you get it?", "عاشق ستت هستم! از کجا گرفتی؟"),
                DialogueLine("B", "Thanks! I got it from a small boutique downtown.", "ممنون! از یه بوتیک کوچیک مرکز شهر خریدم."),
                DialogueLine("A", "The colors really suit you.", "رنگ‌ها خیلی بهت میاد."),
                DialogueLine("B", "Thanks. I try to match my accessories.", "ممنون. سعی می‌کنم اکسسوری‌هام رو ست کنم."),
                DialogueLine("A", "Do you follow fashion trends?", "ترندهای مد رو دنبال می‌کنی؟"),
                DialogueLine("B", "A bit. But I prefer my own style.", "یه کم. ولی استایل خودم رو ترجیح می‌دم."),
                DialogueLine("A", "That's smart. Trends change so fast.", "هوشمندانه‌ست. ترندها سریع عوض می‌شن."),
                DialogueLine("B", "Exactly. I buy timeless pieces.", "دقیقاً. قطعات بی‌زمان می‌خرم."),
                DialogueLine("A", "What's your favorite thing to wear?", "لباس مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "Probably a simple black dress. It's very versatile.", "احتمالاً یه لباس مشکی ساده. خیلی انعطاف‌پذیره."),
                DialogueLine("A", "Do you ever wear formal clothes?", "تا حالا لباس رسمی می‌پوشی؟"),
                DialogueLine("B", "Only for special events. I prefer casual.", "فقط برای رویدادهای خاص. غیررسمی رو ترجیح می‌دم."),
                DialogueLine("A", "What about shoes?", "کفش چطور؟"),
                DialogueLine("B", "I love comfortable shoes. Style and comfort.", "عاشق کفش‌های راحت هستم. استایل و راحتی."),
                DialogueLine("A", "Do you spend a lot on clothes?", "زیاد برای لباس خرج می‌کنی؟"),
                DialogueLine("B", "Not too much. I look for sales.", "زیاد نه. دنبال حراج می‌گردم."),
                DialogueLine("A", "Good strategy. Quality over quantity.", "استراتژی خوب. کیفیت بهتر از کمیت."),
                DialogueLine("B", "Exactly. Fewer pieces, better quality.", "دقیقاً. قطعات کمتر، کیفیت بهتر.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Where did B buy the outfit?", "From a small boutique downtown."),
                ComprehensionQuestion("Does B follow trends?", "A bit, but prefers own style."),
                ComprehensionQuestion("What's B's favorite thing?", "A simple black dress."),
                ComprehensionQuestion("How does B shop?", "Looks for sales, quality over quantity.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe what someone is wearing.", "توصیف کن یکی چی پوشیده.", "She's wearing... / He has... on."),
                SpeakingTask("Talk about your style.", "درباره استایلت صحبت کن.", "I prefer... / My style is...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your fashion style.", "استایل مد خودت رو توصیف کن.", 150, "Use comparatives and superlatives.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She is ___ than me.", listOf("tall", "taller", "tallest", "more tall"), 1),
                QuizQuestion("Complete: This is the ___ expensive.", listOf("most", "more", "much", "many"), 0),
                QuizQuestion("What does 'dressed to kill' mean?", listOf("کشتن", "خیلی شیک پوشیدن", "لباس تیره", "لباس نپوشیدن"), 1),
                QuizQuestion("Complete: This dress is ___ expensive.", listOf("to", "too", "two", "much"), 1),
                QuizQuestion("What does 'fit like a glove' mean?", listOf("مثل دستکش", "دقیقاً اندازه", "خیلی تنگ", "خیلی گشاد"), 1),
                QuizQuestion("Complete: I like her ___.", listOf("cloth", "clothes", "clothing", "cloths"), 1),
                QuizQuestion("Complete: Your shoes ___ your bag.", listOf("match", "matches", "matching", "matched"), 0),
                QuizQuestion("Complete: She ___ glasses.", listOf("wear", "wears", "wearing", "wore"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 6 — Speaking to the World
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Speaking to the World",
            titlePersian = "صحبت با جهان",
            objectives = listOf(
                "Discuss communication and media",
                "Use reported speech",
                "Talk about languages and communication",
                "Express opinions about media"
            ),
            vocabulary = listOf(
                VocabWord("communicate", "ارتباط برقرار کردن", "/kəˈmjuːnɪkeɪt/", "verb", "We communicate daily.", "روزانه ارتباط برقرار می‌کنیم.", "verb"),
                VocabWord("language", "زبان", "/ˈlæŋɡwɪdʒ/", "noun", "English is a global language.", "انگلیسی یه زبان جهانیه."),
                VocabWord("media", "رسانه", "/ˈmiːdiə/", "noun", "The media is powerful.", "رسانه قدرتمنده."),
                VocabWord("audience", "مخاطب", "/ˈɔːdiəns/", "noun", "Know your audience.", "مخاطبت رو بشناس."),
                VocabWord("message", "پیام", "/ˈmesɪdʒ/", "noun", "I sent you a message.", "بهت پیام فرستادم."),
                VocabWord("platform", "پلتفرم", "/ˈplætfɔːrm/", "noun", "Many platforms exist.", "پلتفرم‌های زیادی هست."),
                VocabWord("influence", "تأثیر", "/ˈɪnfluəns/", "noun", "Media has influence.", "رسانه تأثیر داره."),
                VocabWord("source", "منبع", "/sɔːrs/", "noun", "Check your sources.", "منابعت رو چک کن."),
                VocabWord("article", "مقاله", "/ˈɑːrtɪkəl/", "noun", "I read an article.", "یه مقاله خوندم."),
                VocabWord("interview", "مصاحبه", "/ˈɪntərvjuː/", "noun", "I watched an interview.", "یه مصاحبه دیدم."),
                VocabWord("report", "گزارش", "/rɪˈpɔːrt/", "noun", "The report was accurate.", "گزارش دقیق بود."),
                VocabWord("misinformation", "اطلاعات نادرست", "/ˌmɪsɪnfərˈmeɪʃən/", "noun", "Misinformation spreads fast.", "اطلاعات نادرست سریع پخش می‌شه.")
            ),
            idioms = listOf(
                IdiomExpression("word of mouth", "شفاهی", "The news spread by word of mouth.", "خبر شفاهی پخش شد.", "neutral"),
                IdiomExpression("get the message", "پیام را گرفتن", "I got the message.", "پیام رو گرفتم.", "informal"),
                IdiomExpression("break the news", "خبر را گفتن", "She broke the news gently.", "خبر رو با ملایمت گفت.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("communication", "communication /kəˌmjuːnɪˈkeɪʃən/."),
                PronunciationTip("information", "information /ˌɪnfərˈmeɪʃən/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Media literacy", "سواد رسانه‌ای مهمه."),
                CulturalNote("Digital privacy", "حریم خصوصی دیجیتال دغدغه‌ست.")
            ),
            grammar = listOf(
                GrammarSection("Reported speech",
                    """
                        He said that he was busy.
                        She told me she would come.
                        They asked if I was ready.
                    """.trimIndent()),
                GrammarSection("Reporting verbs",
                    """
                        claim, admit, deny, suggest, promise, warn
                    """.trimIndent()),
                GrammarSection("Passive in media",
                    """
                        The news was reported yesterday.
                        The article has been published.
                    """.trimIndent()),
                GrammarSection("Expressing opinions",
                    """
                        I think... / In my opinion...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("He said me...", "He told me...", "tell + ضمیر مفعولی."),
                CommonMistake("He said he will come.", "He said he would come.", "will → would."),
                CommonMistake("The news are important.", "The news is important.", "news غیرقابل شمارش.")
            ),
            conversation = listOf(
                DialogueLine("A", "How do you get your news?", "اخبار رو از کجا می‌گیری؟"),
                DialogueLine("B", "Mostly social media.", "بیشتر شبکه‌های اجتماعی."),
                DialogueLine("A", "I use multiple sources.", "من چند منبع."),
                DialogueLine("B", "Smart. There's so much misinformation.", "هوشمندانه. اطلاعات نادرست زیاده."),
                DialogueLine("A", "Do you trust social media?", "به شبکه‌های اجتماعی اعتماد داری؟"),
                DialogueLine("B", "Only partly. I verify first.", "فقط تا حدی. اول تأیید می‌کنم."),
                DialogueLine("A", "What about influencers?", "اینفلوئنسرها چطور؟"),
                DialogueLine("B", "Some spread misinformation.", "بعضی اطلاعات نادرست پخش می‌کنن."),
                DialogueLine("A", "Should governments regulate?", "دولت‌ها باید تنظیم کنن؟"),
                DialogueLine("B", "Maybe to a degree. Balance is important.", "شاید تا حدی. تعادل مهمه."),
                DialogueLine("A", "What about privacy?", "حریم خصوصی چطور؟"),
                DialogueLine("B", "Companies collect too much data.", "شرکت‌ها داده‌های زیادی جمع می‌کنن."),
                DialogueLine("A", "We should be careful.", "باید محتاط باشیم."),
                DialogueLine("B", "Being aware is the first step.", "آگاه بودن اولین قدمه."),
                DialogueLine("A", "Any advice?", "توصیه‌ای؟"),
                DialogueLine("B", "Check sources, think critically.", "منابع رو چک کن، انتقادی فکر کن."),
                DialogueLine("A", "Great advice.", "توصیه عالی."),
                DialogueLine("B", "Stay informed!", "آگاه بمون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Where does B get news?", "Social media."),
                ComprehensionQuestion("What does B do before sharing?", "Verifies first."),
                ComprehensionQuestion("What's B's main concern?", "Privacy and misinformation."),
                ComprehensionQuestion("What's B's advice?", "Check sources and think critically.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss media in your life.", "درباره رسانه صحبت کن.", "I use... / I check..."),
                SpeakingTask("Express opinions on social media.", "نظرت درباره شبکه‌های اجتماعی رو بگو.", "I think... / In my opinion...")
            ),
            writingTasks = listOf(
                WritingTask("Write about the pros and cons of social media.", "درباره مزایا و معایب شبکه‌های اجتماعی بنویس.", 200, "Use reported speech and passive.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: He ___ me he was tired.", listOf("said", "told", "spoke", "talked"), 1),
                QuizQuestion("Complete: He said he ___ come.", listOf("will", "would", "can", "could"), 1),
                QuizQuestion("Complete: The news ___ important.", listOf("are", "is", "were", "have"), 1),
                QuizQuestion("What does 'word of mouth' mean?", listOf("کلمه دهان", "شفاهی", "نوشتاری", "رسمی"), 1),
                QuizQuestion("Complete: The article has been ___.", listOf("publish", "published", "publishing", "publishes"), 1),
                QuizQuestion("Complete: She ___ that she was wrong.", listOf("admits", "admitted", "admitting", "admit"), 1),
                QuizQuestion("What does 'break the news' mean?", listOf("شکستن خبر", "خبر را گفتن", "خبر را پنهان کردن", "خبر بد"), 1),
                QuizQuestion("Complete: The video is ___ shared.", listOf("be", "being", "been", "is"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 7 — Bright Lights, Big City
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Bright Lights, Big City",
            titlePersian = "چراغ‌های روشن، شهر بزرگ",
            objectives = listOf(
                "Discuss city life",
                "Use future forms",
                "Talk about urban problems and solutions",
                "Express opinions about cities"
            ),
            vocabulary = listOf(
                VocabWord("urban", "شهری", "/ˈɜːrbən/", "adjective", "Urban life is busy.", "زندگی شهری شلوغه."),
                VocabWord("suburb", "حومه", "/ˈsʌbɜːrb/", "noun", "They live in the suburbs.", "در حومه زندگی می‌کنن."),
                VocabWord("downtown", "مرکز شهر", "/ˌdaʊnˈtaʊn/", "noun", "Let's go downtown.", "بیا بریم مرکز شهر."),
                VocabWord("crowded", "شلوغ", "/ˈkraʊdɪd/", "adjective", "The city is crowded.", "شهر شلوغه."),
                VocabWord("noisy", "پرسروصدا", "/ˈnɔɪzi/", "adjective", "It's too noisy.", "خیلی پرسروصداست."),
                VocabWord("peaceful", "آرام", "/ˈpiːsfəl/", "adjective", "The suburbs are peaceful.", "حومه آرامه."),
                VocabWord("transport", "حمل و نقل", "/ˈtrænspɔːrt/", "noun", "Public transport is convenient.", "حمل و نقل عمومی راحته."),
                VocabWord("pollution", "آلودگی", "/pəˈluːʃən/", "noun", "City pollution is a problem.", "آلودگی شهر مشکل‌سازه."),
                VocabWord("amenities", "امکانات", "/əˈmenətiz/", "noun", "The city has many amenities.", "شهر امکانات زیادی داره."),
                VocabWord("atmosphere", "فضا", "/ˈætməsfɪr/", "noun", "I love the atmosphere.", "عاشق فضاشم."),
                VocabWord("affordable", "مقرون‌به‌صرفه", "/əˈfɔːrdəbəl/", "adjective", "Housing isn't affordable.", "مسکن مقرون‌به‌صرفه نیست."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun", "Cities offer opportunities.", "شهرها فرصت می‌دن.")
            ),
            idioms = listOf(
                IdiomExpression("the big city", "شهر بزرگ", "She moved to the big city.", "به شهر بزرگ نقل مکان کرد.", "informal"),
                IdiomExpression("concrete jungle", "جنگل بتنی", "New York is a concrete jungle.", "نیویورک یه جنگل بتنیه.", "idiom"),
                IdiomExpression("bright lights", "چراغ‌های روشن شهر", "He was attracted to the bright lights.", "به چراغ‌های روشن شهر جذب شد.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("urban", "urban /ˈɜːrbən/."),
                PronunciationTip("amenities", "amenities /əˈmenətiz/.")
            ),
            culturalNotes = listOf(
                CulturalNote("City vs suburb", "انتخاب بین شهر و حومه مهمه."),
                CulturalNote("Urbanization", "شهرنشینی در حال افزایشه.")
            ),
            grammar = listOf(
                GrammarSection("Future forms",
                    """
                        will: I'll help you.
                        going to: I'm going to move.
                        Present continuous: I'm meeting Ali tomorrow.
                    """.trimIndent()),
                GrammarSection("Comparatives",
                    """
                        The city is busier than the suburbs.
                        The suburbs are quieter than downtown.
                    """.trimIndent()),
                GrammarSection("Predictions about cities",
                    """
                        Cities will become greener.
                        More people will move to cities.
                    """.trimIndent()),
                GrammarSection("Expressing opinions",
                    """
                        I think... / In my opinion... / It seems to me...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The city is more busy.", "The city is busier.", "صفت کوتاه: -er."),
                CommonMistake("There is many shops.", "There are many shops.", "جمع = there are."),
                CommonMistake("I will to move.", "I will move.", "بعد از will فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you prefer the city or the suburbs?", "شهر رو ترجیح می‌دی یا حومه؟"),
                DialogueLine("B", "I prefer the city. There's always something to do.", "شهر. همیشه چیزی برای انجام دادن هست."),
                DialogueLine("A", "But isn't it too noisy?", "ولی خیلی پرسروصدا نیست؟"),
                DialogueLine("B", "Sometimes. But the convenience is worth it.", "گاهی. ولی راحتی‌اش ارزشش رو داره."),
                DialogueLine("A", "What do you like most?", "چی بیشتر دوست داری؟"),
                DialogueLine("B", "Public transport, restaurants, and cultural events.", "حمل و نقل عمومی، رستوران و رویدادهای فرهنگی."),
                DialogueLine("A", "What about the cost of living?", "هزینه زندگی چطور؟"),
                DialogueLine("B", "It's high, honestly. Rent takes most of my salary.", "صادقانه بالاست. اجاره بیشتر حقوقم رو می‌بره."),
                DialogueLine("A", "Do you ever think about the suburbs?", "تا حالا به حومه فکر کرده‌ای؟"),
                DialogueLine("B", "Sometimes. The suburbs are quieter and more peaceful.", "گاهی. حومه ساکت‌تر و آرام‌تره."),
                DialogueLine("A", "But then you'd need a car.", "ولی اون موقع ماشین لازم داری."),
                DialogueLine("B", "True. It's a trade-off.", "درسته. یه معاوضه‌ست."),
                DialogueLine("A", "Which city do you think is the best?", "کدوم شهر بهترینه؟"),
                DialogueLine("B", "I've heard Tokyo is amazing.", "شنیده‌ام توکیو فوق‌العاده‌ست."),
                DialogueLine("A", "Me too. It's one of the biggest cities.", "منم. یکی از بزرگ‌ترین شهرهای جهانه."),
                DialogueLine("B", "Maybe one day. For now, I'm happy here.", "شاید یه روز. فعلاً اینجا خوشحالم."),
                DialogueLine("A", "That's what matters.", "همین مهمه."),
                DialogueLine("B", "Exactly.", "دقیقاً.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What does B prefer?", "The city."),
                ComprehensionQuestion("What does B like most?", "Public transport, restaurants, cultural events."),
                ComprehensionQuestion("What's the main challenge?", "High cost of living."),
                ComprehensionQuestion("Which city does B want to see?", "Tokyo.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your city.", "شهرت رو توصیف کن.", "It's... / There are..."),
                SpeakingTask("Compare city and country life.", "زندگی شهری و روستایی رو مقایسه کن.", "City is... / Country is...")
            ),
            writingTasks = listOf(
                WritingTask("Write about the pros and cons of city life.", "درباره مزایا و معایب زندگی شهری بنویس.", 180, "Use comparatives and future forms.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The city is ___ than the suburbs.", listOf("busy", "busier", "busiest", "more busy"), 1),
                QuizQuestion("Complete: There ___ many shops.", listOf("is", "are", "was", "has"), 1),
                QuizQuestion("What does 'concrete jungle' mean?", listOf("جنگل بتنی", "پارک", "باغ", "روستا"), 0),
                QuizQuestion("Complete: Tokyo is ___ of the biggest cities.", listOf("one", "first", "a", "the"), 0),
                QuizQuestion("Complete: I ___ move next month.", listOf("will", "am going to", "go", "going"), 1),
                QuizQuestion("Complete: The suburbs are ___ than downtown.", listOf("quiet", "quieter", "quietest", "more quiet"), 1),
                QuizQuestion("Complete: I'll ___ you tomorrow.", listOf("help", "helps", "helping", "helped"), 0),
                QuizQuestion("What does 'bright lights' mean?", listOf("چراغ‌های روشن شهر", "نور خورشید", "برق", "آتش"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 8 — Eureka!
    // ═══════════════════════════════════════════════════════════
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Eureka!",
            titlePersian = "یافتم!",
            objectives = listOf(
                "Discuss inventions and discoveries",
                "Use the passive voice",
                "Talk about scientific breakthroughs",
                "Express wonder and curiosity"
            ),
            vocabulary = listOf(
                VocabWord("invention", "اختراع", "/ɪnˈvenʃən/", "noun", "The telephone was a great invention.", "تلفن اختراع بزرگی بود."),
                VocabWord("discovery", "کشف", "/dɪˈskʌvəri/", "noun", "The discovery changed medicine.", "کشف پزشکی را تغییر داد."),
                VocabWord("inventor", "مخترع", "/ɪnˈventər/", "noun", "Who was the inventor?", "مخترع کی بود؟"),
                VocabWord("breakthrough", "پیشرفت بزرگ", "/ˈbreɪkθruː/", "noun", "Scientists made a breakthrough.", "دانشمندان پیشرفت بزرگی کردند."),
                VocabWord("experiment", "آزمایش", "/ɪkˈsperɪmənt/", "noun", "The experiment was successful.", "آزمایش موفق بود."),
                VocabWord("research", "تحقیق", "/rɪˈsɜːrtʃ/", "noun", "Research takes time.", "تحقیق زمان می‌بره."),
                VocabWord("patent", "اختراع‌نامه", "/ˈpætənt/", "noun", "He applied for a patent.", "برای اختراع‌نامه درخواست داد."),
                VocabWord("device", "دستگاه", "/dɪˈvaɪs/", "noun", "The device is portable.", "دستگاه قابل حمله."),
                VocabWord("develop", "توسعه دادن", "/dɪˈveləp/", "verb", "They developed a new app.", "یه اپ جدید توسعه دادن.", "verb"),
                VocabWord("innovative", "نوآورانه", "/ˈɪnəveɪtɪv/", "adjective", "It's an innovative solution.", "راه‌حل نوآورانه‌ایه."),
                VocabWord("impact", "تأثیر", "/ˈɪmpækt/", "noun", "The impact was huge.", "تأثیرش عظیم بود."),
                VocabWord("revolutionary", "انقلابی", "/ˌrevəˈluːʃəneri/", "adjective", "It was a revolutionary idea.", "ایده انقلابی‌ای بود.")
            ),
            idioms = listOf(
                IdiomExpression("think outside the box", "خارج از چارچوب فکر کردن", "To invent, you must think outside the box.", "برای اختراع باید خارج از چارچوب فکر کنی.", "neutral"),
                IdiomExpression("a game changer", "چیزی که همه چیز را تغییر می‌دهد", "The internet was a game changer.", "اینترنت همه چیز را تغییر داد.", "informal"),
                IdiomExpression("lightbulb moment", "لحظه ایده گرفتن", "I had a lightbulb moment.", "لحظه‌ای بود که ایده به ذهنم رسید.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("invention", "invention /ɪnˈvenʃən/."),
                PronunciationTip("breakthrough", "breakthrough /ˈbreɪkθruː/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Inventors", "مخترعان در تاریخ غرب مهمند."),
                CulturalNote("Innovation", "نوآوری در غرب ارزشمنده.")
            ),
            grammar = listOf(
                GrammarSection("Passive voice",
                    """
                        Present: The device is used worldwide.
                        Past: The telephone was invented in 1876.
                        Perfect: It has been improved.
                    """.trimIndent()),
                GrammarSection("Passive with modals",
                    """
                        The problem can be solved.
                        The invention must be protected.
                    """.trimIndent()),
                GrammarSection("Discussing causes and effects",
                    """
                        Because of this invention, ...
                        As a result, ...
                        Consequently, ...
                    """.trimIndent()),
                GrammarSection("Expressing wonder",
                    """
                        It's amazing that...
                        I wonder how...
                        How fascinating!
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The telephone invented in 1876.", "The telephone was invented in 1876.", "passive: was + pp."),
                CommonMistake("It has being improved.", "It has been improved.", "has been + pp."),
                CommonMistake("Who invented by?", "Who was it invented by?", "ساختار صحیح سؤال مجهول.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you think is the greatest invention?", "بزرگ‌ترین اختراع به نظرت چیه؟"),
                DialogueLine("B", "The printing press, in my opinion.", "ماشین چاپ، به نظر من."),
                DialogueLine("A", "Why is that?", "چرا؟"),
                DialogueLine("B", "It made books available to everyone.", "کتاب‌ها رو برای همه در دسترس کرد."),
                DialogueLine("A", "That's a good point. What about electricity?", "نکته خوبیه. برق چطور؟"),
                DialogueLine("B", "Definitely up there. It transformed everything.", "قطعاً یکی از اوناست. همه چیز رو متحول کرد."),
                DialogueLine("A", "What invention do you use most?", "کدوم اختراع رو بیشتر استفاده می‌کنی؟"),
                DialogueLine("B", "Probably my smartphone.", "احتمالاً گوشی هوشمندم."),
                DialogueLine("A", "When was the smartphone invented?", "گوشی هوشمند کِی اختراع شد؟"),
                DialogueLine("B", "The first ones were developed in the 1990s.", "اولین‌هاشون در دهه ۹۰ توسعه یافتن."),
                DialogueLine("A", "Who invented it?", "کی اختراعش کرد؟"),
                DialogueLine("B", "Several companies and engineers contributed.", "چندین شرکت و مهندس کمک کردن."),
                DialogueLine("A", "What do you think will be invented next?", "فکر می‌کنی بعدی چی اختراع می‌شه؟"),
                DialogueLine("B", "Something in AI or clean energy.", "چیزی در هوش مصنوعی یا انرژی پاک."),
                DialogueLine("A", "I hope so. We need those.", "امیدوارم. به اون‌ها نیاز داریم."),
                DialogueLine("B", "Me too. Innovation is our future.", "منم. نوآوری آینده ماست."),
                DialogueLine("A", "Well said.", "خوب گفتی."),
                DialogueLine("B", "Thanks. It's amazing what humans can create.", "ممنون. شگفت‌انگیزه چیزهایی که انسان‌ها می‌تونن بسازن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What is B's pick for greatest invention?", "The printing press."),
                ComprehensionQuestion("When was the smartphone developed?", "In the 1990s."),
                ComprehensionQuestion("What does B hope for the future?", "Innovations in AI or clean energy."),
                ComprehensionQuestion("What does B say about human creativity?", "It's amazing what humans can create.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss an invention that changed the world.", "درباره اختراعی که جهان را تغییر داد صحبت کن.", "It was invented by... / It changed..."),
                SpeakingTask("Speculate about future inventions.", "درباره اختراعات آینده پیش‌بینی کن.", "I think... will be invented. / There might be...")
            ),
            writingTasks = listOf(
                WritingTask("Write about an invention that changed the world.", "درباره اختراعی که جهان را تغییر داد بنویس.", 200, "Use passive voice.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The telephone ___ invented in 1876.", listOf("is", "was", "has", "did"), 1),
                QuizQuestion("Complete: It has ___ improved.", listOf("be", "being", "been", "is"), 2),
                QuizQuestion("What does 'think outside the box' mean?", listOf("خارج از جعبه", "خارج از چارچوب", "توی جعبه", "بی‌فکر"), 1),
                QuizQuestion("Complete: The problem can ___ solved.", listOf("be", "is", "been", "being"), 0),
                QuizQuestion("What does 'game changer' mean?", listOf("بازی‌کن", "چیزی که همه چیز را تغییر می‌دهد", "بازیکن", "برنده"), 1),
                QuizQuestion("Complete: Who was it invented ___?", listOf("from", "by", "with", "at"), 1),
                QuizQuestion("What does 'lightbulb moment' mean?", listOf("لحظه ایده", "لامپ", "روشنایی", "برق"), 0),
                QuizQuestion("Complete: The device is ___ worldwide.", listOf("use", "used", "using", "uses"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 9 — I Wish You Wouldn't
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "I Wish You Wouldn't",
            titlePersian = "ای کاش این کار را نمی‌کردی",
            objectives = listOf(
                "Complain about behavior and habits",
                "Use wish + would and wish + past simple",
                "Express annoyance and frustration",
                "Make polite requests"
            ),
            vocabulary = listOf(
                VocabWord("annoying", "آزاردهنده", "/əˈnɔɪɪŋ/", "adjective", "That noise is annoying.", "این صدا آزاردهنده‌ست."),
                VocabWord("complain", "شکایت کردن", "/kəmˈpleɪn/", "verb", "He always complains.", "همیشه شکایت می‌کنه.", "verb"),
                VocabWord("frustrated", "دلسرد", "/ˈfrʌstreɪtɪd/", "adjective", "I feel frustrated.", "احساس دلسردی می‌کنم."),
                VocabWord("habit", "عادت", "/ˈhæbɪt/", "noun", "It's a bad habit.", "عادت بدیه."),
                VocabWord("behavior", "رفتار", "/bɪˈheɪvjər/", "noun", "His behavior is strange.", "رفتارش عجیبه."),
                VocabWord("manners", "ادب", "/ˈmænərz/", "noun", "He has good manners.", "ادب داره."),
                VocabWord("polite", "مؤدب", "/pəˈlaɪt/", "adjective", "Be polite.", "مؤدب باش."),
                VocabWord("rude", "بی‌ادب", "/ruːd/", "adjective", "That was rude.", "این بی‌ادبی بود."),
                VocabWord("bother", "اذیت کردن", "/ˈbɑːðər/", "verb", "Don't bother me.", "اذیتم نکن.", "verb"),
                VocabWord("tolerate", "تحمل کردن", "/ˈtɑːləreɪt/", "verb", "I can't tolerate it.", "نمی‌تونم تحملش کنم.", "verb"),
                VocabWord("patience", "صبر", "/ˈpeɪʃəns/", "noun", "My patience is running out.", "صبرم داره تموم می‌شه."),
                VocabWord("upset", "ناراحت", "/ʌpˈset/", "adjective", "She was upset.", "او ناراحت بود.")
            ),
            idioms = listOf(
                IdiomExpression("drive someone crazy", "کسی را دیوانه کردن", "That noise drives me crazy.", "این صدا دیوانه‌ام می‌کنه.", "informal"),
                IdiomExpression("get on my nerves", "روی اعصابم راه رفتن", "His behavior gets on my nerves.", "رفتارش روی اعصابمه.", "informal"),
                IdiomExpression("push someone's buttons", "کسی را تحریک کردن", "He knows how to push my buttons.", "می‌دونه چطور تحریکم کنه.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("wish + would", "wish /wɪʃ/ — تلفظ واضح."),
                PronunciationTip("I wish you would...", "در گفتار طبیعی، you would → you'd.")
            ),
            culturalNotes = listOf(
                CulturalNote("Politeness", "در غرب، شکایت مؤدبانه مهمه."),
                CulturalNote("Making requests", "Could/Would in requests.")
            ),
            grammar = listOf(
                GrammarSection("Wish + would",
                    """
                        برای شکایت از رفتار دیگران:
                        I wish you would stop.
                        I wish he wouldn't smoke.
                    """.trimIndent()),
                GrammarSection("Wish + past simple",
                    """
                        برای وضعیت فعلی:
                        I wish I had more time.
                        I wish it were warmer.
                    """.trimIndent()),
                GrammarSection("Wish + past perfect",
                    """
                        برای پشیمانی از گذشته:
                        I wish I had studied harder.
                    """.trimIndent()),
                GrammarSection("Polite requests",
                    """
                        Could you please...?
                        Would you mind...?
                        I'd appreciate it if...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I wish you stop.", "I wish you would stop.", "wish + would + verb."),
                CommonMistake("I wish I have more time.", "I wish I had more time.", "wish + past simple."),
                CommonMistake("I wish I studied harder (for past).", "I wish I had studied harder.", "برای گذشته: past perfect.")
            ),
            conversation = listOf(
                DialogueLine("A", "You look annoyed. What's wrong?", "دلخور به نظر می‌رسی. چی شده؟"),
                DialogueLine("B", "My roommate. He keeps playing loud music at night.", "هم‌اتاقیم. شب‌ها موسیقی بلند پخش می‌کنه."),
                DialogueLine("A", "That must be frustrating.", "این باید دلسردکننده باشه."),
                DialogueLine("B", "It is. I wish he would use headphones.", "هست. ای کاش هدفون استفاده می‌کرد."),
                DialogueLine("A", "Have you talked to him about it?", "باهاش صحبت کردی؟"),
                DialogueLine("B", "I have. But he says he forgets.", "بله. ولی می‌گه یادش می‌ره."),
                DialogueLine("A", "Maybe you could ask him politely again.", "شاید مؤدبانه دوباره ازش بخوای."),
                DialogueLine("B", "I will. I wish I had said something earlier.", "می‌کنم. ای کاش زودتر چیزی گفته بودم."),
                DialogueLine("A", "Sometimes it's hard to speak up.", "گاهی سختِ حرف بزنی."),
                DialogueLine("B", "True. I don't want to create tension.", "درسته. نمی‌خوام تنش ایجاد کنم."),
                DialogueLine("A", "Understandable. But your peace matters too.", "قابل درکه. ولی آرامش تو هم مهمه."),
                DialogueLine("B", "You're right. I wish he understood that.", "حق داری. ای کاش اون این رو می‌فهمید."),
                DialogueLine("A", "Try talking to him calmly.", "سعی کن آروم باهاش صحبت کنی."),
                DialogueLine("B", "I will. Thanks for listening.", "می‌کنم. ممنون که گوش دادی."),
                DialogueLine("A", "Anytime. I hope it works out.", "هر وقت. امیدوارم حل بشه."),
                DialogueLine("B", "Me too.", "منم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What's B's problem?", "His roommate plays loud music at night."),
                ComprehensionQuestion("Has B talked to the roommate?", "Yes, but he forgets."),
                ComprehensionQuestion("What does A suggest?", "Talking to him politely again."),
                ComprehensionQuestion("What does B wish?", "That the roommate would understand.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Complain about a habit you dislike.", "درباره عادتی که دوست نداری شکایت کن.", "I wish... would... / It drives me crazy."),
                SpeakingTask("Make polite requests.", "درخواست مؤدبانه کن.", "Could you please...? / Would you mind...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about something you wish were different.", "درباره چیزی که دوست داری متفاوت باشه بنویس.", 150, "Use wish + would and wish + past simple.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I wish you ___ stop.", listOf("will", "would", "can", "are"), 1),
                QuizQuestion("Complete: I wish I ___ more time.", listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("Complete: I wish I ___ studied harder.", listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("What does 'drive someone crazy' mean?", listOf("رانندگی", "دیوانه کردن", "آرام کردن", "خوشحال کردن"), 1),
                QuizQuestion("Complete: Would you mind ___?", listOf("help", "helping", "to help", "helps"), 1),
                QuizQuestion("What does 'get on my nerves' mean?", listOf("روی اعصابم راه رفتن", "آرام کردن", "خوشحال کردن", "کمک کردن"), 0),
                QuizQuestion("Complete: I'd appreciate it if you ___.", listOf("stop", "stopped", "stopping", "stops"), 1),
                QuizQuestion("What does 'push someone's buttons' mean?", listOf("دکمه زدن", "تحریک کردن", "کمک کردن", "آرام کردن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 10 — A Test of Honesty
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "A Test of Honesty",
            titlePersian = "آزمون صداقت",
            objectives = listOf(
                "Discuss ethical situations",
                "Use unreal conditionals",
                "Talk about moral dilemmas",
                "Express hypothetical situations"
            ),
            vocabulary = listOf(
                VocabWord("honest", "صادق", "/ˈɑːnɪst/", "adjective", "She's an honest person.", "او آدم صادقیه."),
                VocabWord("dilemma", "دوراهی", "/dɪˈlemə/", "noun", "It's a moral dilemma.", "دوراهی اخلاقیه."),
                VocabWord("moral", "اخلاقی", "/ˈmɔːrəl/", "adjective", "It's a moral question.", "سؤال اخلاقیه."),
                VocabWord("integrity", "درستکاری", "/ɪnˈteɡrəti/", "noun", "He has integrity.", "درستکاری داره."),
                VocabWord("ethical", "اخلاقی", "/ˈeθɪkəl/", "adjective", "Ethical decisions matter.", "تصمیمات اخلاقی مهمند."),
                VocabWord("consequence", "پیامد", "/ˈkɑːnsəkwens/", "noun", "Every action has consequences.", "هر عملی پیامد داره."),
                VocabWord("responsibility", "مسئولیت", "/rɪˌspɑːnsəˈbɪləti/", "noun", "We have responsibility.", "مسئولیت داریم."),
                VocabWord("conscience", "وجدان", "/ˈkɑːnʃəns/", "noun", "Listen to your conscience.", "به وجدانت گوش کن."),
                VocabWord("temptation", "وسوسه", "/tempˈteɪʃən/", "noun", "He resisted temptation.", "در برابر وسوسه مقاومت کرد."),
                VocabWord("guilt", "احساس گناه", "/ɡɪlt/", "noun", "He felt guilt.", "احساس گناه کرد."),
                VocabWord("justify", "توجیه کردن", "/ˈdʒʌstɪfaɪ/", "verb", "How do you justify that?", "چطور توجیهش می‌کنی؟", "verb"),
                VocabWord("principle", "اصل", "/ˈprɪnsəpəl/", "noun", "It's a matter of principle.", "موضوع اصولیه.")
            ),
            idioms = listOf(
                IdiomExpression("do the right thing", "کار درست را انجام دادن", "Always do the right thing.", "همیشه کار درست رو انجام بده.", "neutral"),
                IdiomExpression("draw the line", "مرز کشیدن", "I draw the line at lying.", "مرز رو در دروغ کشیدن می‌کشم.", "idiom"),
                IdiomExpression("on the fence", "دودل", "I'm still on the fence.", "هنوز دودلم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Second conditional", "If I were you → /ɪf aɪ wər ju/."),
                PronunciationTip("Third conditional", "would have → would've /wʊdəv/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Ethics", "اخلاق در غرب مهمه."),
                CulturalNote("Moral dilemmas", "دوراهی‌های اخلاقی رایجند.")
            ),
            grammar = listOf(
                GrammarSection("Second conditional (unreal present)",
                    """
                        If + past simple, would + verb
                        If I found money, I would return it.
                        If I were you, I would tell the truth.
                    """.trimIndent()),
                GrammarSection("Third conditional (unreal past)",
                    """
                        If + past perfect, would have + pp
                        If I had known, I would have said something.
                    """.trimIndent()),
                GrammarSection("Wish + past perfect",
                    """
                        I wish I had been honest.
                    """.trimIndent()),
                GrammarSection("Expressing moral opinions",
                    """
                        I believe that... / In my view... / It seems to me that...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("If I would find money...", "If I found money...", "second conditional: past simple."),
                CommonMistake("If I was you...", "If I were you...", "در second conditional از were."),
                CommonMistake("If I had knew...", "If I had known...", "past participle.")
            ),
            conversation = listOf(
                DialogueLine("A", "Would you return money if you found it?", "اگه پول پیدا کنی، برمی‌گردونی؟"),
                DialogueLine("B", "Yes, I would. It's the right thing to do.", "بله، برمی‌گردونم. کار درستیه."),
                DialogueLine("A", "What if it was a lot of money?", "اگه پول زیادی باشه؟"),
                DialogueLine("B", "I'd still return it. My conscience wouldn't let me keep it.", "بازم برمی‌گردونم. وجدانم نمی‌ذاره نگهش دارم."),
                DialogueLine("A", "That's admirable. What about smaller ethical choices?", "تحسین‌برانگیزه. انتخاب‌های اخلاقی کوچک‌تر چطور؟"),
                DialogueLine("B", "Like what?", "مثل چی؟"),
                DialogueLine("A", "Like telling a small lie to avoid hurting someone.", "مثل گفتن یه دروغ کوچک برای اینکه کسی رو ناراحت نکنی."),
                DialogueLine("B", "That's harder. Sometimes honesty hurts.", "این سخت‌تره. گاهی صداقت دردناکه."),
                DialogueLine("A", "Where do you draw the line?", "کجا مرز می‌کشی؟"),
                DialogueLine("B", "I draw the line at lies that cause real harm.", "مرز رو در دروغ‌هایی می‌کشم که آسیب واقعی می‌زنن."),
                DialogueLine("A", "That's a good principle.", "اصل خوبیه."),
                DialogueLine("B", "What about you? What's your moral compass?", "تو چطور؟ قطب‌نمای اخلاقی‌ت چیه؟"),
                DialogueLine("A", "I try to follow the golden rule.", "سعی می‌کنم قانون طلایی رو رعایت کنم."),
                DialogueLine("B", "Treat others as you want to be treated.", "با دیگران طوری رفتار کن که می‌خوای با تو رفتار کنن."),
                DialogueLine("A", "Exactly. It guides most of my decisions.", "دقیقاً. بیشتر تصمیماتم رو هدایت می‌کنه."),
                DialogueLine("B", "That's a beautiful way to live.", "شیوه زندگی زیباییه."),
                DialogueLine("A", "Thanks. It's not always easy, but it's worth it.", "ممنون. همیشه آسان نیست، ولی ارزشش رو داره."),
                DialogueLine("B", "True. Integrity takes courage.", "درسته. درستکاری شجاعت می‌خواد.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Would B return found money?", "Yes, he would."),
                ComprehensionQuestion("What's harder than returning money?", "Telling small lies to avoid hurting someone."),
                ComprehensionQuestion("Where does B draw the line?", "Lies that cause real harm."),
                ComprehensionQuestion("What does A follow?", "The golden rule.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss an ethical dilemma.", "درباره یه دوراهی اخلاقی صحبت کن.", "If I..., I would... / It depends on..."),
                SpeakingTask("Talk about your values.", "درباره ارزش‌هات صحبت کن.", "I believe... / It's important to...")
            ),
            writingTasks = listOf(
                WritingTask("Write about an ethical choice you've faced.", "درباره یه انتخاب اخلاقی که با آن روبرو شده‌ای بنویس.", 200, "Use conditionals and modals.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: If I ___ money, I would return it.", listOf("find", "found", "will find", "have found"), 1),
                QuizQuestion("Complete: If I ___ you, I would tell the truth.", listOf("am", "was", "were", "be"), 2),
                QuizQuestion("Complete: If I had known, I ___ said something.", listOf("will have", "would have", "have", "had"), 1),
                QuizQuestion("What does 'draw the line' mean?", listOf("خط کشیدن", "مرز کشیدن", "نقاشی کردن", "شکستن"), 1),
                QuizQuestion("Complete: I wish I ___ been honest.", listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("What does 'on the fence' mean?", listOf("روی نرده", "دودل", "بالا", "پایین"), 1),
                QuizQuestion("Complete: If I ___ known, I would have acted differently.", listOf("have", "had", "will have", "having"), 1),
                QuizQuestion("What does 'do the right thing' mean?", listOf("کار درست", "کار غلط", "کار سخت", "کار آسان"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 11 — Tingo
    // ═══════════════════════════════════════════════════════════
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Tingo",
            titlePersian = "تینگو",
            objectives = listOf(
                "Discuss untranslatable words and cultural concepts",
                "Use relative clauses",
                "Talk about language and culture",
                "Express linguistic curiosity"
            ),
            vocabulary = listOf(
                VocabWord("untranslatable", "غیرقابل ترجمه", "/ˌʌntrænsˈleɪtəbəl/", "adjective", "Some words are untranslatable.", "برخی کلمات غیرقابل ترجمه‌اند."),
                VocabWord("concept", "مفهوم", "/ˈkɑːnsept/", "noun", "It's a cultural concept.", "مفهوم فرهنگیه."),
                VocabWord("expression", "عبارت", "/ɪkˈspreʃən/", "noun", "It's a common expression.", "عبارت رایجیه."),
                VocabWord("meaning", "معنی", "/ˈmiːnɪŋ/", "noun", "What's the meaning?", "معنیش چیه؟"),
                VocabWord("translate", "ترجمه کردن", "/trænsˈleɪt/", "verb", "Can you translate this?", "می‌تونی اینو ترجمه کنی؟", "verb"),
                VocabWord("linguistic", "زبانی", "/lɪŋˈɡwɪstɪk/", "adjective", "Linguistic diversity is rich.", "تنوع زبانی غنیه."),
                VocabWord("cultural", "فرهنگی", "/ˈkʌltʃərəl/", "adjective", "Cultural differences matter.", "تفاوت‌های فرهنگی مهمند."),
                VocabWord("unique", "منحصربه‌فرد", "/juˈniːk/", "adjective", "Every language is unique.", "هر زبانی منحصربه‌فرده."),
                VocabWord("vocabulary", "واژگان", "/vəˈkæbjəleri/", "noun", "Expand your vocabulary.", "واژگانت رو گسترش بده."),
                VocabWord("fluent", "روان", "/ˈfluːənt/", "adjective", "She's fluent in three languages.", "او در سه زبان روانه."),
                VocabWord("native", "بومی", "/ˈneɪtɪv/", "adjective", "He's a native speaker.", "او یه نیتیو اسپیکره."),
                VocabWord("bilingual", "دوزبانه", "/baɪˈlɪŋɡwəl/", "adjective", "She's bilingual.", "او دوزبانه‌ست.")
            ),
            idioms = listOf(
                IdiomExpression("lost in translation", "در ترجمه گم شدن", "The joke was lost in translation.", "جوک در ترجمه گم شد.", "idiom"),
                IdiomExpression("on the tip of my tongue", "نوک زبونم بود", "Her name is on the tip of my tongue.", "اسمش نوک زبونم بود.", "idiom"),
                IdiomExpression("in other words", "به عبارت دیگر", "In other words, it's complicated.", "به عبارت دیگر، پیچیده‌ست.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("untranslatable", "untranslatable /ˌʌntrænsˈleɪtəbəl/."),
                PronunciationTip("linguistic", "linguistic /lɪŋˈɡwɪstɪk/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Language diversity", "تنوع زبانی در جهان غنیه."),
                CulturalNote("Culture and language", "زبان و فرهنگ به هم مرتبطند.")
            ),
            grammar = listOf(
                GrammarSection("Relative clauses",
                    """
                        The word that has no translation...
                        People who speak multiple languages...
                    """.trimIndent()),
                GrammarSection("Defining vs non-defining",
                    """
                        Defining: The book that I read was good.
                        Non-defining: My friend, who lives in Paris, is a linguist.
                    """.trimIndent()),
                GrammarSection("Talking about concepts",
                    """
                        It's the idea of...
                        It refers to...
                        It describes when...
                    """.trimIndent()),
                GrammarSection("Expressing curiosity",
                    """
                        I wonder if...
                        It's fascinating that...
                        I've always been curious about...
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("The word who has no translation...", "The word that has no translation...", "برای اشیا از that/which."),
                CommonMistake("The person which speaks...", "The person who speaks...", "برای افراد از who."),
                CommonMistake("It refer to...", "It refers to...", "سوم شخص مفرد refers.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you know any untranslatable words?", "کلمه غیرقابل ترجمه می‌شناسی؟"),
                DialogueLine("B", "Yes! In Portuguese, there's 'saudade'.", "بله! در پرتغالی، «ساوداژی» هست."),
                DialogueLine("A", "What does it mean?", "معنیش چیه؟"),
                DialogueLine("B", "It's a longing for something or someone you love.", "یه دلتنگی برای چیزی یا کسی که دوستش داری."),
                DialogueLine("A", "That's beautiful. We have something similar in Persian.", "زیباست. ما هم چیزی مشابه در فارسی داریم."),
                DialogueLine("B", "Really? What is it?", "واقعاً؟ چیه؟"),
                DialogueLine("A", "'Del-tangi' — it means heart tightness.", "«دلتنگی» — یعنی تنگی دل."),
                DialogueLine("B", "That's a lovely way to describe it.", "روش قشنگی برای توصیفشه."),
                DialogueLine("A", "Do you speak other languages?", "زبان دیگه‌ای صحبت می‌کنی؟"),
                DialogueLine("B", "I speak English and a bit of Spanish.", "انگلیسی و کمی اسپانیایی."),
                DialogueLine("A", "I'm bilingual in Persian and English.", "من دوزبانه فارسی و انگلیسی هستم."),
                DialogueLine("B", "That's a gift. It opens up two worlds.", "این یه نعمته. دو دنیا رو باز می‌کنه."),
                DialogueLine("A", "True. Each language has its own way of seeing things.", "درسته. هر زبانی روش خودش رو برای دیدن چیزها داره."),
                DialogueLine("B", "That's why translation is so hard.", "برای همین ترجمه اینقدر سخته."),
                DialogueLine("A", "Exactly. Some things get lost in translation.", "دقیقاً. بعضی چیزها در ترجمه گم می‌شن."),
                DialogueLine("B", "But that's also what makes languages fascinating.", "ولی همین هم زبون‌ها رو جذاب می‌کنه."),
                DialogueLine("A", "Agreed. I love learning about these differences.", "موافقم. عاشق یادگیری درباره این تفاوت‌هام."),
                DialogueLine("B", "Me too. It makes the world richer.", "منم. جهان رو غنی‌تر می‌کنه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("What does 'saudade' mean?", "A longing for something or someone you love."),
                ComprehensionQuestion("What's the Persian equivalent A mentions?", "Del-tangi."),
                ComprehensionQuestion("What languages does B speak?", "English and a bit of Spanish."),
                ComprehensionQuestion("Why is translation hard?", "Each language has its own way of seeing things.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Discuss untranslatable words you know.", "درباره کلمات غیرقابل ترجمه صحبت کن.", "In my language, there's a word... / It means..."),
                SpeakingTask("Talk about the connection between language and culture.", "درباره ارتباط زبان و فرهنگ صحبت کن.", "Language reflects culture because...")
            ),
            writingTasks = listOf(
                WritingTask("Write about an untranslatable word in your language.", "درباره یه کلمه غیرقابل ترجمه در زبانت بنویس.", 180, "Use relative clauses.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: The word ___ has no translation...", listOf("who", "that", "whose", "where"), 1),
                QuizQuestion("Complete: People ___ speak multiple languages...", listOf("which", "who", "whose", "where"), 1),
                QuizQuestion("What does 'lost in translation' mean?", listOf("گم در ترجمه", "کاملاً ترجمه شده", "ترجمه سریع", "ترجمه اشتباه"), 0),
                QuizQuestion("Complete: It ___ to a feeling of longing.", listOf("refer", "refers", "referring", "referred"), 1),
                QuizQuestion("Complete: My friend, ___ lives in Paris, is a linguist.", listOf("which", "who", "whose", "where"), 1),
                QuizQuestion("What does 'on the tip of my tongue' mean?", listOf("نوک زبون", "یادم نمیاد ولی نزدیکه", "زبونم درد می‌کنه", "ساکتم"), 1),
                QuizQuestion("Complete: A person ___ speaks two languages is bilingual.", listOf("which", "who", "whose", "where"), 1),
                QuizQuestion("What does 'in other words' mean?", listOf("به کلمه دیگر", "به عبارت دیگر", "کلمه‌ای دیگر", "دروغ"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // FILE 12 — Review
    // ═══════════════════════════════════════════════════════════
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review",
            titlePersian = "مرور",
            objectives = listOf(
                "Review all grammar from the book",
                "Practice all conversation skills",
                "Consolidate vocabulary",
                "Prepare for next level"
            ),
            vocabulary = listOf(
                VocabWord("review", "مرور", "/rɪˈvjuː/", "noun", "Let's review.", "بیا مرور کنیم."),
                VocabWord("practice", "تمرین", "/ˈpræktɪs/", "noun", "Practice makes perfect.", "تمرین باعث پیشرفت."),
                VocabWord("improve", "بهتر کردن", "/ɪmˈpruːv/", "verb", "I want to improve.", "می‌خوام بهتر شم.", "verb"),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective", "I feel confident.", "با اعتماد به نفس‌ام."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun", "You're making progress.", "داری پیشرفت می‌کنی."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun", "English is a challenge.", "انگلیسی یه چالشه."),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun", "It's OK to make mistakes.", "اشتباه کردن اشکالی نداره."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb", "Continue practicing.", "تمرین رو ادامه بده.", "verb"),
                VocabWord("succeed", "موفق شدن", "/səkˈsiːd/", "verb", "You will succeed.", "موفق می‌شی.", "verb"),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun", "Learning is a journey.", "یادگیری یه سفره."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun", "My goal is fluency.", "هدفم روانی‌ه."),
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun", "The future is bright.", "آینده روشنه.")
            ),
            idioms = listOf(
                IdiomExpression("practice makes perfect", "تمرین باعث پیشرفت", "Practice makes perfect!", "تمرین باعث پیشرفت!", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد", "Don't give up.", "تسلیم نشو.", "idiom"),
                IdiomExpression("break a leg", "موفق باشی", "Break a leg!", "موفق باشی!", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Intonation", "در سؤال‌ها صدای پایان جمله بالا می‌رود."),
                PronunciationTip("Linking", "کلمات در گفتار طبیعی به هم می‌چسبند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Language learning", "یادگیری زبان فرایندی طولانیه."),
                CulturalNote("Mistakes", "اشتباه بخش طبیعی یادگیریه.")
            ),
            grammar = listOf(
                GrammarSection("Review: Narrative tenses",
                    """
                        I was walking when I saw him.
                        When I arrived, he had left.
                    """.trimIndent()),
                GrammarSection("Review: Conditionals",
                    """
                        First: If I study, I will pass.
                        Second: If I studied, I would pass.
                        Third: If I had studied, I would have passed.
                    """.trimIndent()),
                GrammarSection("Review: Passive voice",
                    """
                        The house was built in 1950.
                        The report has been published.
                    """.trimIndent()),
                GrammarSection("Review: Wish + would",
                    """
                        I wish you would stop.
                        I wish I had more time.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I am agree.", "I agree.", "agree فعل است."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده."),
                CommonMistake("He don't like it.", "He doesn't like it.", "برای he/she/it از doesn't.")
            ),
            conversation = listOf(
                DialogueLine("A", "How's your English going?", "انگلیسی‌ت چطور پیش می‌ره؟"),
                DialogueLine("B", "Pretty well! I've been practicing.", "خیلی خوب! تمرین کرده‌ام."),
                DialogueLine("A", "More confident?", "با اعتماد به نفس‌تر؟"),
                DialogueLine("B", "Yes, much more.", "بله، خیلی بیشتر."),
                DialogueLine("A", "Hardest part?", "سخت‌ترین قسمت؟"),
                DialogueLine("B", "The grammar.", "گرامر."),
                DialogueLine("A", "What helped?", "چی کمک کرد؟"),
                DialogueLine("B", "Movies and conversations.", "فیلم و مکالمه."),
                DialogueLine("A", "Next goal?", "هدف بعدی؟"),
                DialogueLine("B", "Fluent in two years.", "روانی در دو سال."),
                DialogueLine("A", "How?", "چطور؟"),
                DialogueLine("B", "Daily practice and classes.", "تمرین روزانه و کلاس."),
                DialogueLine("A", "Good plan.", "برنامه خوب."),
                DialogueLine("B", "Practice makes perfect.", "تمرین باعث پیشرفت."),
                DialogueLine("A", "Rome wasn't built in a day.", "رم در یک روز ساخته نشد."),
                DialogueLine("B", "I'll be patient.", "صبور خواهم بود."),
                DialogueLine("A", "That's the spirit!", "همین روحیه رو می‌خوام!"),
                DialogueLine("B", "Thanks!", "ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("How has B improved?", "Daily practice, movies, conversations."),
                ComprehensionQuestion("Hardest part?", "Grammar."),
                ComprehensionQuestion("B's goal?", "Fluent in two years."),
                ComprehensionQuestion("How will B get there?", "Daily practice and classes.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your English journey.", "درباره مسیر انگلیسی‌ات صحبت کن.", "I started... / I've learned..."),
                SpeakingTask("Give advice to a beginner.", "به یه مبتدی توصیه کن.", "You should... / Don't give up...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your English learning goals.", "درباره اهداف انگلیسی‌ات بنویس.", 150, "Use all structures you've learned.")
            ),
            quiz = listOf(
                QuizQuestion("What does 'practice makes perfect' mean?", listOf("تمرین سخت", "تمرین باعث پیشرفت", "بی‌فایده", "طولانی"), 1),
                QuizQuestion("Complete: I ___ him yesterday.", listOf("see", "saw", "seen", "seeing"), 1),
                QuizQuestion("Complete: She ___ English every day.", listOf("study", "studies", "studying", "studied"), 1),
                QuizQuestion("Complete: I ___ to London twice.", listOf("was", "have been", "go", "going"), 1),
                QuizQuestion("What does 'break a leg' mean?", listOf("شکستن پا", "موفق باشی", "شکست خوردن", "دویدن"), 1),
                QuizQuestion("Complete: I ___ help you tomorrow.", listOf("will", "am", "do", "have"), 0),
                QuizQuestion("Complete: If you practice, you ___ improve.", listOf("will", "are", "do", "have"), 0),
                QuizQuestion("Complete: ___ you ever been to Paris?", listOf("Do", "Did", "Have", "Are"), 2)
            )
        )
    }
}