package com.zabanyar.ai.data

data class VocabWord(
    val english: String,
    val persian: String,
    val pronunciation: String = ""
)

data class DialogueLine(
    val speaker: String,
    val english: String,
    val persian: String
)

data class GrammarSection(
    val title: String,
    val content: String
)

data class QuizQuestion(
    val question: String,
    val options: List<String>,
    val correctIndex: Int
)

data class LessonContent(
    val bookId: String,
    val chapterNumber: Int,
    val title: String,
    val titlePersian: String,
    val vocabulary: List<VocabWord>,
    val grammar: List<GrammarSection>,
    val conversation: List<DialogueLine>,
    val quiz: List<QuizQuestion>
)

object LessonContentRepository {

    fun getLessonContent(bookId: String, chapterNumber: Int): LessonContent {
        return when (bookId) {
            "top_notch_1" -> getTopNotch1(chapterNumber)
            "top_notch_2" -> getTopNotch2(chapterNumber)
            "top_notch_3" -> getTopNotch3(chapterNumber)
            "four_corners_1" -> getFourCorners1(chapterNumber)
            "four_corners_2" -> getFourCorners2(chapterNumber)
            "four_corners_3" -> getFourCorners3(chapterNumber)
            "basic_grammar" -> getBasicGrammar(chapterNumber)
            "vocab_elementary" -> getVocabElementary(chapterNumber)
            "book_504" -> get504(chapterNumber)
            "everyday_exp_1" -> getEverydayExp1(chapterNumber)
            "gift_magi" -> getGiftMagi(chapterNumber)
            "sleepy_hollow" -> getSleepyHollow(chapterNumber)
            else -> getDefaultContent(bookId, chapterNumber)
        }
    }

    // ==================== Top Notch 1 ====================
    private fun getTopNotch1(chapter: Int): LessonContent {
        return when (chapter) {
            1 -> LessonContent(
                "top_notch_1", 1, "Names and Occupations", "نام‌ها و شغل‌ها",
                vocabulary = listOf(
                    VocabWord("Teacher", "معلم", "ˈtiːtʃər"),
                    VocabWord("Student", "دانش‌آموز", "ˈstuːdənt"),
                    VocabWord("Doctor", "دکتر", "ˈdɑːktər"),
                    VocabWord("Nurse", "پرستار", "nɜːrs"),
                    VocabWord("Engineer", "مهندس", "ˌendʒɪˈnɪr"),
                    VocabWord("Architect", "معمار", "ˈɑːrkɪtekt"),
                    VocabWord("Actor", "بازیگر", "ˈæktər"),
                    VocabWord("Singer", "خواننده", "ˈsɪŋər"),
                    VocabWord("Chef", "سرآشپز", "ʃef"),
                    VocabWord("Pilot", "خلبان", "ˈpaɪlət")
                ),
                grammar = listOf(
                    GrammarSection("📌 a و an",
                        "• a قبل از حروف بی‌صدا: a teacher, a doctor\n" +
                        "• an قبل از حروف صدادار (a,e,i,o,u): an architect, an engineer\n" +
                        "• استثنا: an hour"),
                    GrammarSection("📌 do یا does؟",
                        "• I / You / We / They → do\n" +
                        "  What DO you do? → I'm a teacher.\n" +
                        "• He / She / It → does\n" +
                        "  What DOES he do? → He's a doctor."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ What do he do? → ✅ What does he do?\n" +
                        "❌ She's a engineer. → ✅ She's an engineer.")
                ),
                conversation = listOf(
                    DialogueLine("Sara", "Hi! I'm Sara. Nice to meet you.", "سلام! من سارا هستم. از آشنایی خوشحالم."),
                    DialogueLine("Ali", "Nice to meet you too. I'm Ali.", "من هم خوشحالم. من علی هستم."),
                    DialogueLine("Sara", "What do you do?", "شغلت چیه؟"),
                    DialogueLine("Ali", "I'm an engineer. And you?", "من مهندسم. تو چطور؟"),
                    DialogueLine("Sara", "I'm a teacher. I teach English.", "من معلمم. انگلیسی درس می‌دم."),
                    DialogueLine("Ali", "That's great!", "عالیه!")
                ),
                quiz = listOf(
                    QuizQuestion("کدام درست است؟", listOf("I'm a engineer.", "I'm an engineer.", "I'm engineer.", "I engineer."), 1),
                    QuizQuestion("معنی «What do you do?»", listOf("کجایی؟", "شغلت چیه؟", "چطوری؟", "چیکار می‌کنی؟"), 1),
                    QuizQuestion("What ___ he do?", listOf("do", "does", "is", "are"), 1),
                    QuizQuestion("معنی «Nurse»", listOf("دکتر", "پرستار", "معلم", "مهندس"), 1)
                )
            )
            2 -> LessonContent(
                "top_notch_1", 2, "About People", "درباره مردم",
                vocabulary = listOf(
                    VocabWord("Tall", "قدبلند", "tɔːl"),
                    VocabWord("Short", "کوتاه", "ʃɔːrt"),
                    VocabWord("Young", "جوان", "jʌŋ"),
                    VocabWord("Old", "پیر", "oʊld"),
                    VocabWord("Nice", "مهربان", "naɪs"),
                    VocabWord("Funny", "بامزه", "ˈfʌni"),
                    VocabWord("Friendly", "خوش‌برخورد", "ˈfrendli"),
                    VocabWord("Quiet", "ساکت", "ˈkwaɪət"),
                    VocabWord("Smart", "باهوش", "smɑːrt"),
                    VocabWord("Kind", "مهربان", "kaɪnd")
                ),
                grammar = listOf(
                    GrammarSection("📌 جای صفت",
                        "• بعد از be: She is tall.\n" +
                        "• قبل از اسم: She is a tall girl."),
                    GrammarSection("📌 پرسیدن شخصیت",
                        "• What is he like? → He's kind and funny. (شخصیت)\n" +
                        "• What does he look like? → He's tall and thin. (ظاهر)"),
                    GrammarSection("📌 متضادها",
                        "tall ↔ short\n" +
                        "young ↔ old\n" +
                        "nice ↔ mean")
                ),
                conversation = listOf(
                    DialogueLine("A", "Who is your best friend?", "بهترین دوستت کیه؟"),
                    DialogueLine("B", "Her name is Sara.", "اسمش ساراست."),
                    DialogueLine("A", "What is she like?", "چه جوریه؟"),
                    DialogueLine("B", "She is tall and very friendly.", "قدبلنده و خیلی خوش‌برخورد."),
                    DialogueLine("A", "Is she funny?", "بامزه‌ست؟"),
                    DialogueLine("B", "Yes, she is!", "بله!")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Tall»", listOf("کوتاه", "قدبلند", "پیر", "جوان"), 1),
                    QuizQuestion("کدام درست است؟", listOf("She tall.", "She is tall.", "She are tall.", "Tall she."), 1),
                    QuizQuestion("«What is she like?»", listOf("ظاهرش چطوره؟", "چه جوریه؟", "کجاست؟", "چیکار می‌کنه؟"), 1),
                    QuizQuestion("متضاد «young»", listOf("tall", "old", "short", "nice"), 1)
                )
            )
            3 -> LessonContent(
                "top_notch_1", 3, "Places and Things", "مکان‌ها و اشیا",
                vocabulary = listOf(
                    VocabWord("Book", "کتاب", "bʊk"),
                    VocabWord("Table", "میز", "ˈteɪbəl"),
                    VocabWord("Chair", "صندلی", "tʃer"),
                    VocabWord("Window", "پنجره", "ˈwɪndoʊ"),
                    VocabWord("Door", "در", "dɔːr"),
                    VocabWord("Street", "خیابان", "striːt"),
                    VocabWord("City", "شهر", "ˈsɪti"),
                    VocabWord("Country", "کشور", "ˈkʌntri"),
                    VocabWord("Park", "پارک", "pɑːrk"),
                    VocabWord("Hospital", "بیمارستان", "ˈhɑːspɪtəl")
                ),
                grammar = listOf(
                    GrammarSection("📌 جمع اسم‌ها",
                        "• +s: book → books\n" +
                        "• +es: box → boxes\n" +
                        "• y → ies: city → cities\n" +
                        "• بی‌قاعده: man → men / child → children"),
                    GrammarSection("📌 There is / There are",
                        "• There is + مفرد: There is a book.\n" +
                        "• There are + جمع: There are two books."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ There is two books. → ✅ There are two books.\n" +
                        "❌ two childs → ✅ two children")
                ),
                conversation = listOf(
                    DialogueLine("A", "Where are you from?", "اهل کجایی؟"),
                    DialogueLine("B", "I'm from Tehran. It's the capital of Iran.", "اهل تهرام. پایتخت ایرانه."),
                    DialogueLine("A", "Is it a big city?", "شهر بزرگیه؟"),
                    DialogueLine("B", "Yes, there are many streets and buildings.", "بله، خیابان‌ها و ساختمان‌های زیادی داره."),
                    DialogueLine("A", "Are there any parks?", "پارک هم داره؟"),
                    DialogueLine("B", "Yes, several beautiful parks.", "بله، چند تا پارک زیبا.")
                ),
                quiz = listOf(
                    QuizQuestion("جمع «book»", listOf("bookes", "books", "book", "bookies"), 1),
                    QuizQuestion("جمع «child»", listOf("childs", "childes", "children", "childrens"), 2),
                    QuizQuestion("کدام درست است؟", listOf("There is two books.", "There are two books.", "There have two books.", "There has two."), 1),
                    QuizQuestion("جمع «city»", listOf("citys", "cities", "cityes", "city"), 1)
                )
            )
            else -> getDefaultContent("top_notch_1", chapter)
        }
    }

    // ==================== Top Notch 2 ====================
    private fun getTopNotch2(chapter: Int): LessonContent {
        return when (chapter) {
            1 -> LessonContent(
                "top_notch_2", 1, "Getting Acquainted", "آشنایی",
                vocabulary = listOf(
                    VocabWord("Introduce", "معرفی کردن", "ˌɪntrəˈduːs"),
                    VocabWord("Neighbor", "همسایه", "ˈneɪbər"),
                    VocabWord("Colleague", "همکار", "ˈkɑːliːɡ"),
                    VocabWord("Acquaintance", "آشنا", "əˈkweɪntəns"),
                    VocabWord("Nickname", "اسم مستعار", "ˈnɪkneɪm"),
                    VocabWord("Last name", "نام خانوادگی", "læst neɪm"),
                    VocabWord("First name", "نام کوچک", "fɜːrst neɪm"),
                    VocabWord("Background", "پیشینه", "ˈbækɡraʊnd"),
                    VocabWord("Interests", "علایق", "ˈɪntrəsts"),
                    VocabWord("Personality", "شخصیت", "ˌpɜːrsəˈnæləti")
                ),
                grammar = listOf(
                    GrammarSection("📌 Present Perfect",
                        "ساختار: have/has + p.p.\n" +
                        "برای کارهایی که در گذشته شروع شده و ادامه دارند."),
                    GrammarSection("📌 How long...?",
                        "• How long have you known him?\n" +
                        "• I've known him for two years.\n" +
                        "• I've known her since 2020."),
                    GrammarSection("📌 for vs since",
                        "• for + مدت زمان: for two years\n" +
                        "• since + نقطه شروع: since 2020")
                ),
                conversation = listOf(
                    DialogueLine("A", "How long have you known your best friend?", "چقدره بهترین دوستت رو می‌شناسی؟"),
                    DialogueLine("B", "I've known him for five years.", "پنج ساله می‌شناسمش."),
                    DialogueLine("A", "How did you meet?", "چطور آشنا شدید؟"),
                    DialogueLine("B", "We were classmates in college.", "همکلاسی دانشگاه بودیم."),
                    DialogueLine("A", "Do you still keep in touch?", "هنوز در ارتباطید؟"),
                    DialogueLine("B", "Yes, we meet every week.", "بله، هر هفته همدیگه رو می‌بینیم.")
                ),
                quiz = listOf(
                    QuizQuestion("کدام درست است؟", listOf("I've known him since 2 years.", "I've known him for 2 years.", "I know him since 2 years.", "I knowing him for 2 years."), 1),
                    QuizQuestion("معنی «Colleague»", listOf("همکلاسی", "همسایه", "همکار", "دوست"), 2),
                    QuizQuestion("«since» با کدام می‌آید؟", listOf("two years", "a month", "2020", "a long time"), 2),
                    QuizQuestion("ساختار Present Perfect؟", listOf("have/has + verb", "have/has + p.p.", "am/is/are + verb-ing", "did + verb"), 1)
                )
            )
            2 -> LessonContent(
                "top_notch_2", 2, "Going Shopping", "خرید کردن",
                vocabulary = listOf(
                    VocabWord("Receipt", "رسید", "rɪˈsiːt"),
                    VocabWord("Refund", "بازپرداخت", "ˈriːfʌnd"),
                    VocabWord("Exchange", "تعویض", "ɪksˈtʃeɪndʒ"),
                    VocabWord("Warranty", "گارانتی", "ˈwɔːrənti"),
                    VocabWord("Sale", "حراج", "seɪl"),
                    VocabWord("Bargain", "معامله خوب", "ˈbɑːrɡɪn"),
                    VocabWord("Fitting room", "اتاق پرو", "ˈfɪtɪŋ ruːm"),
                    VocabWord("Queue", "صف", "kjuː"),
                    VocabWord("Quality", "کیفیت", "ˈkwɑːləti"),
                    VocabWord("Brand", "برند", "brænd")
                ),
                grammar = listOf(
                    GrammarSection("📌 Comparative",
                        "مقایسه بین دو چیز:\n" +
                        "• cheap → cheaper than\n" +
                        "• expensive → more expensive than\n" +
                        "• good → better than"),
                    GrammarSection("📌 Superlative",
                        "بهترین بین چند چیز:\n" +
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
                    DialogueLine("B", "Let me check.", "بذار چک کنم.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Refund»", listOf("تعویض", "بازپرداخت", "تخفیف", "گارانتی"), 1),
                    QuizQuestion("کدام درست است؟", listOf("This is more cheap.", "This is cheaper.", "This is cheapest.", "This is the cheap."), 1),
                    QuizQuestion("صفت تفضیلی «good»", listOf("gooder", "more good", "better", "best"), 2),
                    QuizQuestion("معنی «Warranty»", listOf("تخفیف", "گارانتی", "رسید", "برند"), 1)
                )
            )
            else -> getDefaultContent("top_notch_2", chapter)
        }
    }

    // ==================== Top Notch 3 ====================
    private fun getTopNotch3(chapter: Int): LessonContent {
        return LessonContent(
            "top_notch_3", chapter, "Cultural Literacy", "آگاهی فرهنگی",
            vocabulary = listOf(
                VocabWord("Culture", "فرهنگ", "ˈkʌltʃər"),
                VocabWord("Tradition", "سنت", "trəˈdɪʃən"),
                VocabWord("Custom", "رسم و رسوم", "ˈkʌstəm"),
                VocabWord("Society", "جامعه", "səˈsaɪəti"),
                VocabWord("Diversity", "تنوع", "dɪˈvɜːrsəti"),
                VocabWord("Heritage", "میراث", "ˈherɪtɪdʒ"),
                VocabWord("Etiquette", "آداب معاشرت", "ˈetɪket"),
                VocabWord("Taboo", "تابو", "təˈbuː"),
                VocabWord("Ritual", "آیین", "ˈrɪtʃuəl"),
                VocabWord("Values", "ارزش‌ها", "ˈvæljuːz")
            ),
            grammar = listOf(
                GrammarSection("📌 Present Perfect Continuous",
                    "have/has + been + verb-ing\n\n" +
                    "برای کارهایی که در گذشته شروع شده و ادامه دارند."),
                GrammarSection("📌 مثال‌ها",
                    "• I've been studying English for three years.\n" +
                    "• She's been living in Tokyo since 2019.\n" +
                    "• How long have you been working here?"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ I've studying English. → ✅ I've been studying English.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you noticed cultural differences?", "تفاوت‌های فرهنگی رو متوجه شدی؟"),
                DialogueLine("B", "Yes, I've been learning a lot.", "بله، دارم خیلی یاد می‌گیرم."),
                DialogueLine("A", "What surprised you most?", "چی بیشتر تعجبت کرد؟"),
                DialogueLine("B", "The food etiquette.", "آداب غذا خوردن."),
                DialogueLine("A", "How long have you been living abroad?", "چقدره خارج زندگی می‌کنی؟"),
                DialogueLine("B", "For two years now.", "دو ساله.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Etiquette»", listOf("فرهنگ", "آداب معاشرت", "سنت", "زبان"), 1),
                QuizQuestion("کدام درست است؟", listOf("I've studying.", "I've been studying.", "I has been studying.", "I have be studying."), 1),
                QuizQuestion("ساختار Present Perfect Continuous؟", listOf("have/has + p.p.", "have/has + been + verb-ing", "am/is/are + verb-ing", "did + verb"), 1),
                QuizQuestion("«since» با کدام می‌آید؟", listOf("three years", "two months", "2019", "a long time"), 2)
            )
        )
    }

    // ==================== Four Corners 1 ====================
    private fun getFourCorners1(chapter: Int): LessonContent {
        return LessonContent(
            "four_corners_1", chapter, "Welcome!", "خوش آمدید!",
            vocabulary = listOf(
                VocabWord("Hello", "سلام", "həˈloʊ"),
                VocabWord("Goodbye", "خداحافظ", "ɡʊdˈbaɪ"),
                VocabWord("Morning", "صبح", "ˈmɔːrnɪŋ"),
                VocabWord("Afternoon", "بعدازظهر", "ˌæftərˈnuːn"),
                VocabWord("Evening", "عصر", "ˈiːvnɪŋ"),
                VocabWord("Night", "شب", "naɪt"),
                VocabWord("Name", "اسم", "neɪm"),
                VocabWord("Friend", "دوست", "frend"),
                VocabWord("Family", "خانواده", "ˈfæməli"),
                VocabWord("Home", "خانه", "hoʊm")
            ),
            grammar = listOf(
                GrammarSection("📌 Verb to be",
                    "• I am (I'm)\n• You are (You're)\n• He/She/It is\n• We/They are"),
                GrammarSection("📌 Possessive Adjectives",
                    "• my, your, his, her, its, our, their"),
                GrammarSection("📌 Greetings",
                    "• Hello! / Hi!\n• Good morning / afternoon / evening\n• How are you? — I'm fine, thanks.")
            ),
            conversation = listOf(
                DialogueLine("A", "Hello! I'm Sara.", "سلام! من سارا هستم."),
                DialogueLine("B", "Hi Sara. I'm Ali.", "سلام سارا. من علی هستم."),
                DialogueLine("A", "Nice to meet you.", "از آشنایی خوشحالم."),
                DialogueLine("B", "Nice to meet you too.", "من هم خوشحالم."),
                DialogueLine("A", "How are you?", "حالت چطوره؟"),
                DialogueLine("B", "I'm fine, thanks.", "خوبم، ممنون.")
            ),
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I is", "I am", "I are", "I be"), 1),
                QuizQuestion("معنی «Good morning»", listOf("شب بخیر", "صبح بخیر", "عصر بخیر", "خداحافظ"), 1),
                QuizQuestion("«How are you?» جواب؟", listOf("I'm fine, thanks.", "Yes.", "No.", "Goodbye."), 0),
                QuizQuestion("Which is correct?", listOf("She am", "She is", "She are", "She be"), 1)
            )
        )
    }

    // ==================== Four Corners 2 ====================
    private fun getFourCorners2(chapter: Int): LessonContent {
        return LessonContent(
            "four_corners_2", chapter, "Life Stories", "داستان‌های زندگی",
            vocabulary = listOf(
                VocabWord("Born", "متولد شدن", "bɔːrn"),
                VocabWord("Grow up", "بزرگ شدن", "ɡroʊ ʌp"),
                VocabWord("Move", "اسباب‌کشی", "muːv"),
                VocabWord("Marry", "ازدواج کردن", "ˈmæri"),
                VocabWord("Study", "درس خواندن", "ˈstʌdi"),
                VocabWord("Graduate", "فارغ‌التحصیل شدن", "ˈɡrædʒueɪt"),
                VocabWord("Career", "حرفه", "kəˈrɪr"),
                VocabWord("Achieve", "دست یافتن", "əˈtʃiːv"),
                VocabWord("Experience", "تجربه", "ɪkˈspɪriəns"),
                VocabWord("Remember", "به یاد آوردن", "rɪˈmembər")
            ),
            grammar = listOf(
                GrammarSection("📌 Past Simple",
                    "افعال با قاعده: +ed\n" +
                    "• work → worked\n" +
                    "• play → played\n\n" +
                    "افعال بی‌قاعده:\n" +
                    "• go → went\n" +
                    "• have → had\n" +
                    "• be → was/were"),
                GrammarSection("📌 زمان گذشته",
                    "• yesterday, last week, in 2020, two years ago"),
                GrammarSection("📌 سوالی کردن",
                    "• Did you go to school?\n" +
                    "• Where did you grow up?")
            ),
            conversation = listOf(
                DialogueLine("A", "Where were you born?", "کجا متولد شدی؟"),
                DialogueLine("B", "I was born in Tehran.", "در تهران متولد شدم."),
                DialogueLine("A", "Where did you grow up?", "کجا بزرگ شدی؟"),
                DialogueLine("B", "I grew up in Shiraz.", "در شیراز بزرگ شدم."),
                DialogueLine("A", "When did you move here?", "کِی اومدی اینجا؟"),
                DialogueLine("B", "I moved here in 2020.", "سال ۲۰۲۰ اومدم.")
            ),
            quiz = listOf(
                QuizQuestion("گذشته «go»", listOf("goed", "went", "gone", "going"), 1),
                QuizQuestion("کدام درست است؟", listOf("I was born in Tehran.", "I born in Tehran.", "I am born in Tehran.", "I were born in Tehran."), 0),
                QuizQuestion("«Where ___ you grow up?»", listOf("do", "does", "did", "are"), 2),
                QuizQuestion("گذشته «have»", listOf("haved", "had", "has", "having"), 1)
            )
        )
    }

    // ==================== Four Corners 3 ====================
    private fun getFourCorners3(chapter: Int): LessonContent {
        return LessonContent(
            "four_corners_3", chapter, "New Friends", "دوستان جدید",
            vocabulary = listOf(
                VocabWord("Personality", "شخصیت", "ˌpɜːrsəˈnæləti"),
                VocabWord("Confident", "با اعتماد به نفس", "ˈkɑːnfɪdənt"),
                VocabWord("Shy", "خجالتی", "ʃaɪ"),
                VocabWord("Generous", "بخشنده", "ˈdʒenərəs"),
                VocabWord("Honest", "صادق", "ˈɑːnɪst"),
                VocabWord("Reliable", "قابل اعتماد", "rɪˈlaɪəbəl"),
                VocabWord("Ambitious", "جاه‌طلب", "æmˈbɪʃəs"),
                VocabWord("Patient", "صبور", "ˈpeɪʃənt"),
                VocabWord("Creative", "خلاق", "kriˈeɪtɪv"),
                VocabWord("Optimistic", "خوش‌بین", "ˌɑːptɪˈmɪstɪk")
            ),
            grammar = listOf(
                GrammarSection("📌 Present Perfect vs Past Simple",
                    "Past Simple: زمان مشخص\n" +
                    "• I met him yesterday.\n\n" +
                    "Present Perfect: زمان نامشخص\n" +
                    "• I've met him before."),
                GrammarSection("📌 for / since / already / yet",
                    "• I've known her for two years.\n" +
                    "• I've known her since 2020.\n" +
                    "• Have you finished yet?"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ I've met him yesterday. → ✅ I met him yesterday.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you met the new neighbor?", "همسایه جدید رو دیدی؟"),
                DialogueLine("B", "Yes, I met her yesterday.", "بله، دیروز دیدمش."),
                DialogueLine("A", "What is she like?", "چه جوریه؟"),
                DialogueLine("B", "She's very friendly and generous.", "خیلی خوش‌برخورد و بخشنده‌ست."),
                DialogueLine("A", "How long have you known her?", "چقدره می‌شناسیش؟"),
                DialogueLine("B", "I've known her for just a week.", "فقط یه هفته‌ست.")
            ),
            quiz = listOf(
                QuizQuestion("کدام درست است؟", listOf("I've met him yesterday.", "I met him yesterday.", "I meet him yesterday.", "I am meeting him yesterday."), 1),
                QuizQuestion("معنی «Generous»", listOf("خجالتی", "بخشنده", "صبور", "خلاق"), 1),
                QuizQuestion("«for» با کدام می‌آید؟", listOf("2020", "yesterday", "two years", "last week"), 2),
                QuizQuestion("معنی «Reliable»", listOf("خوش‌بین", "قابل اعتماد", "جاه‌طلب", "خجالتی"), 1)
            )
        )
    }

    // ==================== Basic Grammar ====================
    private fun getBasicGrammar(chapter: Int): LessonContent {
        return LessonContent(
            "basic_grammar", chapter, "Verb Tenses", "زمان‌های فعل",
            vocabulary = listOf(
                VocabWord("Tense", "زمان", "tens"),
                VocabWord("Verb", "فعل", "vɜːrb"),
                VocabWord("Present", "حال", "ˈprezənt"),
                VocabWord("Past", "گذشته", "pæst"),
                VocabWord("Future", "آینده", "ˈfjuːtʃər"),
                VocabWord("Continuous", "استمراری", "kənˈtɪnjuəs"),
                VocabWord("Perfect", "کامل", "ˈpɜːrfɪkt"),
                VocabWord("Simple", "ساده", "ˈsɪmpəl"),
                VocabWord("Action", "عمل", "ˈækʃən"),
                VocabWord("State", "وضعیت", "steɪt")
            ),
            grammar = listOf(
                GrammarSection("📌 Present Simple",
                    "• I work every day.\n" +
                    "• She works at a hospital."),
                GrammarSection("📌 Present Continuous",
                    "• I am working right now.\n" +
                    "• She is studying for the exam."),
                GrammarSection("📌 Past Simple",
                    "• I worked yesterday.\n" +
                    "• She studied last night.")
            ),
            conversation = listOf(
                DialogueLine("Teacher", "What are you doing now?", "الان چیکار می‌کنی؟"),
                DialogueLine("Student", "I'm studying English.", "دارم انگلیسی می‌خونم."),
                DialogueLine("Teacher", "How often do you study?", "چند وقت یه بار درس می‌خونی؟"),
                DialogueLine("Student", "I study every day.", "هر روز درس می‌خونم."),
                DialogueLine("Teacher", "Did you study yesterday?", "دیروز درس خوندی؟"),
                DialogueLine("Student", "Yes, I studied for two hours.", "بله، دو ساعت درس خوندم.")
            ),
            quiz = listOf(
                QuizQuestion("کدام Present Simple است؟", listOf("I am working.", "I work every day.", "I worked.", "I will work."), 1),
                QuizQuestion("کدام Present Continuous است؟", listOf("I work.", "I am working.", "I worked.", "I will work."), 1),
                QuizQuestion("کدام Past Simple است؟", listOf("I work.", "I am working.", "I worked.", "I will work."), 2),
                QuizQuestion("ساختار Present Continuous؟", listOf("do + verb", "am/is/are + verb-ing", "have + p.p.", "will + verb"), 1)
            )
        )
    }

    // ==================== Vocabulary Elementary ====================
    private fun getVocabElementary(chapter: Int): LessonContent {
        return LessonContent(
            "vocab_elementary", chapter, "Everyday Words", "کلمات روزمره",
            vocabulary = listOf(
                VocabWord("Apple", "سیب", "ˈæpəl"),
                VocabWord("Banana", "موز", "bəˈnænə"),
                VocabWord("Orange", "پرتقال", "ˈɔːrɪndʒ"),
                VocabWord("Water", "آب", "ˈwɔːtər"),
                VocabWord("Bread", "نان", "bred"),
                VocabWord("Milk", "شیر", "mɪlk"),
                VocabWord("Cheese", "پنیر", "tʃiːz"),
                VocabWord("Rice", "برنج", "raɪs"),
                VocabWord("Chicken", "مرغ", "ˈtʃɪkɪn"),
                VocabWord("Egg", "تخم‌مرغ", "eɡ")
            ),
            grammar = listOf(
                GrammarSection("📌 Countable / Uncountable",
                    "قابل شمارش:\n• apple → apples\n• egg → eggs\n\n" +
                    "غیرقابل شمارش:\n• water, milk, rice (بدون s)"),
                GrammarSection("📌 a / an / some",
                    "• a apple → an apple\n" +
                    "• some water\n" +
                    "• some apples"),
                GrammarSection("❌ اشتباهات رایج",
                    "❌ two breads → ✅ two loaves of bread")
            ),
            conversation = listOf(
                DialogueLine("A", "What's for breakfast?", "صبحانه چی هست؟"),
                DialogueLine("B", "Bread and cheese.", "نان و پنیر."),
                DialogueLine("A", "Do we have any eggs?", "تخم‌مرغ داریم؟"),
                DialogueLine("B", "Yes, we have some eggs.", "بله، چند تا داریم."),
                DialogueLine("A", "What about milk?", "شیر چطور؟"),
                DialogueLine("B", "No, we need to buy some.", "نه، باید بخریم.")
            ),
            quiz = listOf(
                QuizQuestion("کدام غیرقابل شمارش است؟", listOf("apple", "egg", "water", "book"), 2),
                QuizQuestion("کدام درست است؟", listOf("a apple", "an apple", "the apple", "- apple"), 1),
                QuizQuestion("معنی «Cheese»", listOf("نان", "پنیر", "شیر", "برنج"), 1),
                QuizQuestion("کدام درست است؟", listOf("two breads", "two bread", "two loaves of bread", "breads two"), 2)
            )
        )
    }

    // ==================== 504 Words ====================
    private fun get504(chapter: Int): LessonContent {
        return LessonContent(
            "book_504", chapter, "Essential Words", "واژه‌های ضروری",
            vocabulary = listOf(
                VocabWord("Abandon", "رها کردن", "əˈbændən"),
                VocabWord("Ability", "توانایی", "əˈbɪləti"),
                VocabWord("Absorb", "جذب کردن", "əbˈzɔːrb"),
                VocabWord("Accurate", "دقیق", "ˈækjərət"),
                VocabWord("Achieve", "دست یافتن", "əˈtʃiːv"),
                VocabWord("Acquire", "به دست آوردن", "əˈkwaɪər"),
                VocabWord("Adapt", "سازگار شدن", "əˈdæpt"),
                VocabWord("Adequate", "کافی", "ˈædɪkwət"),
                VocabWord("Adjust", "تنظیم کردن", "əˈdʒʌst"),
                VocabWord("Advantage", "مزیت", "ədˈvæntɪdʒ")
            ),
            grammar = listOf(
                GrammarSection("📌 Word Forms",
                    "• Abandon (verb) → abandonment (noun)\n" +
                    "• Able (adj) → ability (noun)\n" +
                    "• Accurate (adj) → accuracy (noun)"),
                GrammarSection("📌 Collocations",
                    "• abandon a plan\n" +
                    "• achieve a goal\n" +
                    "• adapt to change\n" +
                    "• adjust to a new situation"),
                GrammarSection("📌 در جمله",
                    "• He abandoned his car in the desert.\n" +
                    "• She achieved her goal.")
            ),
            conversation = listOf(
                DialogueLine("A", "Did you achieve your goal?", "به هدفت رسیدی؟"),
                DialogueLine("B", "Yes, I worked hard for it.", "بله، براش سخت کار کردم."),
                DialogueLine("A", "How did you adapt to the new job?", "چطور با شغل جدید سازگار شدی؟"),
                DialogueLine("B", "It took me a few weeks.", "چند هفته طول کشید."),
                DialogueLine("A", "What's the main advantage?", "مزیت اصلیش چیه؟"),
                DialogueLine("B", "The salary is much better.", "حقوقش خیلی بهتره.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Abandon»", listOf("پیدا کردن", "رها کردن", "جذب کردن", "سازگار شدن"), 1),
                QuizQuestion("معنی «Achieve»", listOf("رها کردن", "دست یافتن", "جذب کردن", "دقیق"), 1),
                QuizQuestion("noun «able»؟", listOf("ableness", "ability", "ably", "ablement"), 1),
                QuizQuestion("معنی «Advantage»", listOf("مزیت", "عیب", "خطر", "شانس"), 0)
            )
        )
    }

    // ==================== Everyday Expressions 1 ====================
    private fun getEverydayExp1(chapter: Int): LessonContent {
        return LessonContent(
            "everyday_exp_1", chapter, "Common Idioms", "اصطلاحات رایج",
            vocabulary = listOf(
                VocabWord("Break a leg", "موفق باشی", "breɪk ə leɡ"),
                VocabWord("Piece of cake", "مثل آب خوردن", "piːs əv keɪk"),
                VocabWord("Hit the books", "درس خواندن", "hɪt ðə bʊks"),
                VocabWord("Under the weather", "ناخوش", "ˈʌndər ðə ˈweðər"),
                VocabWord("Once in a blue moon", "هر گِه گِه", "wʌns ɪn ə bluː muːn"),
                VocabWord("Cost an arm and a leg", "خیلی گران بودن", "kɔːst ən ɑːrm ənd ə leɡ"),
                VocabWord("Let the cat out of the bag", "لو دادن", "let ðə kæt aʊt əv ðə bæɡ"),
                VocabWord("Bite the bullet", "دندون رو جگر گذاشتن", "baɪt ðə ˈbʊlɪt"),
                VocabWord("Call it a day", "کار رو تموم کردن", "kɔːl ɪt ə deɪ"),
                VocabWord("Hit the sack", "خوابیدن", "hɪt ðə sæk")
            ),
            grammar = listOf(
                GrammarSection("📌 کاربرد اصطلاحات",
                    "اصطلاحات (Idioms) عباراتی هستند که معنای کلیشون با معنای کلمات تشکیل‌دهنده‌شون فرق داره."),
                GrammarSection("📌 مثال‌ها",
                    "• The exam was a piece of cake.\n" +
                    "• I only see him once in a blue moon.\n" +
                    "• That car costs an arm and a leg."),
                GrammarSection("📌 نکته",
                    "اصطلاحات رو نباید کلمه‌به‌کلمه ترجمه کنی.")
            ),
            conversation = listOf(
                DialogueLine("A", "How was your exam?", "امتحانت چطور بود؟"),
                DialogueLine("B", "It was a piece of cake!", "مثل آب خوردن بود!"),
                DialogueLine("A", "Really? I need to hit the books.", "واقعاً؟ من باید درس بخونم."),
                DialogueLine("B", "Yeah, you should. Good luck!", "آره، باید بخونی. موفق باشی!"),
                DialogueLine("A", "Thanks. Break a leg on yours!", "ممنون. تو هم موفق باشی!")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Piece of cake»", listOf("کیک", "مثل آب خوردن", "شیرینی", "دسر"), 1),
                QuizQuestion("معنی «Hit the books»", listOf("کتاب زدن", "درس خواندن", "کتاب خریدن", "کتاب نوشتن"), 1),
                QuizQuestion("معنی «Under the weather»", listOf("زیر باران", "ناخوش", "خوشحال", "خسته"), 1),
                QuizQuestion("«Break a leg» یعنی؟", listOf("پات بشکنه", "موفق باشی", "بدو", "بتمرگ"), 1)
            )
        )
    }

    // ==================== Gift of the Magi ====================
    private fun getGiftMagi(chapter: Int): LessonContent {
        return when (chapter) {
            1 -> LessonContent(
                "gift_magi", 1, "The Gift of the Magi", "هدیه مغان",
                vocabulary = listOf(
                    VocabWord("Gift", "هدیه", "ɡɪft"),
                    VocabWord("Sacrifice", "فداکاری", "ˈsækrɪfaɪs"),
                    VocabWord("Precious", "با ارزش", "ˈpreʃəs"),
                    VocabWord("Treasure", "گنج", "ˈtreʒər"),
                    VocabWord("Generous", "بخشنده", "ˈdʒenərəs"),
                    VocabWord("Poverty", "فقر", "ˈpɑːvərti"),
                    VocabWord("Love", "عشق", "lʌv"),
                    VocabWord("Worth", "ارزش", "wɜːrθ"),
                    VocabWord("Cherish", "عزیز داشتن", "ˈtʃerɪʃ"),
                    VocabWord("Devotion", "فداکاری", "dɪˈvoʊʃən")
                ),
                grammar = listOf(
                    GrammarSection("📌 Past Simple در داستان",
                        "داستان‌ها معمولاً با زمان گذشته روایت می‌شوند:\n" +
                        "• Della counted her money.\n" +
                        "• She wanted to buy a gift."),
                GrammarSection("📌 توصیف شخصیت",
                        "• Della was a loving wife.\n" +
                        "• Jim was a hardworking man."),
                GrammarSection("📌 محتوای داستان",
                        "داستان درباره زوج جوانی است که در فقر زندگی می‌کنند " +
                        "ولی برای همدیگه هدیه می‌خرند و هر کدوم باارزش‌ترین " +
                        "چیزی که دارن رو فدا می‌کنن.")
                ),
                conversation = listOf(
                    DialogueLine("Narrator", "Della had only $1.87.", "دلا فقط ۱.۸۷ دلار داشت."),
                    DialogueLine("Della", "What can I buy for Jim?", "برای جیم چی بخرم؟"),
                    DialogueLine("Narrator", "She decided to sell her hair.", "تصمیم گرفت موهاش رو بفروشه."),
                    DialogueLine("Della", "I hope he still loves me.", "امیدوارم هنوز دوستم داشته باشه."),
                    DialogueLine("Narrator", "Jim sold his watch to buy her a gift.", "جیم ساعتش رو فروخت تا براش هدیه بخره."),
                    DialogueLine("Jim", "Happy Christmas, Della.", "کریسمس مبارک، دلا.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Sacrifice»", listOf("هدیه", "فداکاری", "عشق", "گنج"), 1),
                    QuizQuestion("معنی «Precious»", listOf("ارزان", "با ارزش", "قدیمی", "جدید"), 1),
                    QuizQuestion("داستان درباره چیه؟", listOf("جنگ", "عشق و فداکاری", "سفر", "کسب و کار"), 1),
                    QuizQuestion("معنی «Cherish»", listOf("فراموش کردن", "عزیز داشتن", "بیرون انداختن", "خریدن"), 1)
                )
            )
            else -> getDefaultContent("gift_magi", chapter)
        }
    }

    // ==================== Sleepy Hollow ====================
    private fun getSleepyHollow(chapter: Int): LessonContent {
        return LessonContent(
            "sleepy_hollow", chapter, "The Headless Horseman", "سوار بی سر",
            vocabulary = listOf(
                VocabWord("Legend", "افسانه", "ˈledʒənd"),
                VocabWord("Haunted", "جن‌زده", "ˈhɔːntɪd"),
                VocabWord("Ghost", "روح", "ɡoʊst"),
                VocabWord("Mysterious", "مرموز", "mɪˈstɪriəs"),
                VocabWord("Brave", "شجاع", "breɪv"),
                VocabWord("Fear", "ترس", "fɪr"),
                VocabWord("Night", "شب", "naɪt"),
                VocabWord("Forest", "جنگل", "ˈfɔːrɪst"),
                VocabWord("Bridge", "پل", "brɪdʒ"),
                VocabWord("Disappear", "ناپدید شدن", "ˌdɪsəˈpɪr")
            ),
            grammar = listOf(
                GrammarSection("📌 Past Continuous",
                    "was/were + verb-ing\n" +
                    "• He was walking in the forest.\n" +
                    "• They were talking about the ghost."),
                GrammarSection("📌 ترکیب Past Simple و Past Continuous",
                    "• He was walking when he saw the horseman.\n" +
                    "• She was reading when the phone rang."),
                GrammarSection("📌 محتوای داستان",
                    "داستان درباره معلمی به نام ایکباد کرین است که به " +
                    "دره خواب‌آلود می‌ره و با افسانه سوار بی‌سر روبرو می‌شه.")
            ),
            conversation = listOf(
                DialogueLine("Narrator", "Ichabod was new in town.", "ایکباد تازه به شهر اومده بود."),
                DialogueLine("Ichabod", "What's this legend about?", "این افسانه درباره چیه؟"),
                DialogueLine("Villager", "A headless horseman!", "یه سوار بی سر!"),
                DialogueLine("Ichabod", "That's just a story, right?", "این فقط یه داستانه، نه؟"),
                DialogueLine("Villager", "Be careful at night.", "شب‌ها مراقب باش."),
                DialogueLine("Narrator", "One night, Ichabod disappeared forever.", "یک شب، ایکباد برای همیشه ناپدید شد.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Legend»", listOf("داستان", "افسانه", "کتاب", "خاطره"), 1),
                QuizQuestion("معنی «Haunted»", listOf("شاد", "جن‌زده", "خالی", "بزرگ"), 1),
                QuizQuestion("ساختار Past Continuous؟", listOf("was/were + verb", "was/were + verb-ing", "did + verb", "have + p.p."), 1),
                QuizQuestion("داستان درباره چیه؟", listOf("عشق", "ترس و افسانه", "سفر", "کسب و کار"), 1)
            )
        )
    }

    // ==================== Default ====================
    private fun getDefaultContent(bookId: String, chapter: Int): LessonContent {
        return LessonContent(
            bookId, chapter, "Lesson $chapter", "درس $chapter",
            vocabulary = listOf(
                VocabWord("Learn", "یاد گرفتن", "lɜːrn"),
                VocabWord("Practice", "تمرین", "ˈpræktɪs"),
                VocabWord("Study", "درس خواندن", "ˈstʌdi"),
                VocabWord("Understand", "فهمیدن", "ˌʌndərˈstænd"),
                VocabWord("Remember", "به یاد آوردن", "rɪˈmembər"),
                VocabWord("Improve", "بهبود دادن", "ɪmˈpruːv"),
                VocabWord("Achieve", "دست یافتن", "əˈtʃiːv"),
                VocabWord("Succeed", "موفق شدن", "səkˈsiːd"),
                VocabWord("Focus", "تمرکز کردن", "ˈfoʊkəs"),
                VocabWord("Review", "مرور کردن", "rɪˈvjuː")
            ),
            grammar = listOf(
                GrammarSection("📌 نکته این درس",
                    "محتوای این درس به‌زودی اضافه میشه."),
                GrammarSection("📌 یادگیری",
                    "برای یادگیری بهتر، هر روز ۱۰ دقیقه تمرین کن."),
                GrammarSection("📌 تمرین",
                    "مثال‌ها رو با صدای بلند بخون.")
            ),
            conversation = listOf(
                DialogueLine("A", "How do you learn English?", "چطور انگلیسی یاد می‌گیری؟"),
                DialogueLine("B", "I practice every day.", "هر روز تمرین می‌کنم."),
                DialogueLine("A", "What's the best way?", "بهترین راه چیه؟"),
                DialogueLine("B", "Listening and speaking.", "گوش دادن و صحبت کردن."),
                DialogueLine("A", "Any tips?", "توصیه‌ای داری؟"),
                DialogueLine("B", "Be patient and consistent.", "صبور و پیوسته باش.")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Practice»", listOf("درس خواندن", "تمرین", "فهمیدن", "یاد گرفتن"), 1),
                QuizQuestion("معنی «Improve»", listOf("بهبود دادن", "خراب کردن", "شروع کردن", "تمام کردن"), 0),
                QuizQuestion("معنی «Focus»", listOf("استراحت", "تمرکز", "خواب", "غذا"), 1),
                QuizQuestion("معنی «Succeed»", listOf("شکست خوردن", "موفق شدن", "خسته شدن", "پیر شدن"), 1)
            )
        )
    }
}