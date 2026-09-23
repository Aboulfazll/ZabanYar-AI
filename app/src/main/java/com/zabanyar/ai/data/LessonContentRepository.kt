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
            else -> getDefaultContent(bookId, chapterNumber)
        }
    }

    // ==================== Top Notch 1 ====================
    private fun getTopNotch1(chapter: Int): LessonContent {
        return when (chapter) {
            1 -> LessonContent("top_notch_1", 1, "Names and Occupations", "نام‌ها و شغل‌ها",
                vocabulary = listOf(
                    VocabWord("Teacher", "معلم", "ˈtiːtʃər"), VocabWord("Student", "دانش‌آموز", "ˈstuːdənt"),
                    VocabWord("Doctor", "دکتر", "ˈdɑːktər"), VocabWord("Nurse", "پرستار", "nɜːrs"),
                    VocabWord("Engineer", "مهندس", "ˌendʒɪˈnɪr"), VocabWord("Architect", "معمار", "ˈɑːrkɪtekt"),
                    VocabWord("Actor", "بازیگر", "ˈæktər"), VocabWord("Singer", "خواننده", "ˈsɪŋər"),
                    VocabWord("Chef", "سرآشپز", "ʃef"), VocabWord("Pilot", "خلبان", "ˈpaɪlət")
                ),
                grammar = listOf(
                    GrammarSection("📌 a / an + Occupations",
                        "برای شغل‌ها از a یا an استفاده می‌کنیم:\n\n" +
                        "• a قبل از حروف بی‌صدا: a teacher, a doctor\n" +
                        "• an قبل از حروف صدادار (a,e,i,o,u): an architect, an engineer\n" +
                        "• استثنا: an hour\n\n" +
                        "ساختار: Subject + be + a/an + job\n" +
                        "• I am a teacher.\n" +
                        "• She is an architect."),
                    GrammarSection("📌 do / does در سوال",
                        "برای پرسیدن شغل:\n\n" +
                        "• I / You / We / They → do\n" +
                        "  What DO you do? → I'm a teacher.\n\n" +
                        "• He / She / It → does\n" +
                        "  What DOES he do? → He's a doctor.\n" +
                        "  What DOES she do? → She's an architect."),
                    GrammarSection("📌 پاسخ کوتاه",
                        "• Are you a teacher? → Yes, I am. / No, I'm not.\n" +
                        "• Is he a doctor? → Yes, he is. / No, he isn't.\n" +
                        "• Are they students? → Yes, they are. / No, they aren't."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ What do he do? → ✅ What does he do?\n" +
                        "❌ She's a engineer. → ✅ She's an engineer.\n" +
                        "❌ I'm teacher. → ✅ I'm a teacher.")
                ),
                conversation = listOf(
                    DialogueLine("Sara", "Hi! I'm Sara. Nice to meet you.", "سلام! من سارا هستم. از آشنایی خوشحالم."),
                    DialogueLine("Ali", "Nice to meet you too, Sara. I'm Ali.", "من هم خوشحالم سارا. من علی هستم."),
                    DialogueLine("Sara", "Are you new here?", "اینجا تازه‌وارد هستی؟"),
                    DialogueLine("Ali", "Yes, I just moved here last week.", "بله، هفته پیش اومدم."),
                    DialogueLine("Sara", "Welcome! What do you do?", "خوش اومدی! شغلت چیه؟"),
                    DialogueLine("Ali", "I'm an engineer. I work at a tech company.", "من مهندسم. توی یه شرکت فناوری کار می‌کنم."),
                    DialogueLine("Sara", "That's interesting! And what does your wife do?", "جالبه! زنت چیکار می‌کنه؟"),
                    DialogueLine("Ali", "She's a doctor. She works at the city hospital.", "اون دکتره. توی بیمارستان شهر کار می‌کنه."),
                    DialogueLine("Sara", "Wow! So you're both professionals.", "واو! پس هر دوتون حرفه‌ای هستید."),
                    DialogueLine("Ali", "Yes. And you? What do you do?", "بله. تو چطور؟ شغلت چیه؟"),
                    DialogueLine("Sara", "I'm a teacher. I teach English at a high school.", "من معلمم. دبیرستان انگلیسی درس می‌دم."),
                    DialogueLine("Ali", "That's great! Maybe you can teach me some English.", "عالیه! شاید بتونی یه کم انگلیسی به من یاد بدی.")
                ),
                quiz = listOf(
                    QuizQuestion("کدام درست است؟", listOf("I'm a engineer.", "I'm an engineer.", "I'm engineer.", "I engineer."), 1),
                    QuizQuestion("معنی «What do you do?» چیست؟", listOf("کجایی؟", "چیکار می‌کنی؟", "شغلت چیه؟", "چطوری؟"), 2),
                    QuizQuestion("کدام برای سوم شخص مفرد درست است؟", listOf("What do he do?", "What does he do?", "What he does?", "What do he does?"), 1),
                    QuizQuestion("«او (مونث) یک معمار است.»", listOf("She's a architect.", "She's an architect.", "She's architect.", "She architect."), 1),
                    QuizQuestion("پاسخ مناسب به «Is she a doctor?»", listOf("Yes, she does.", "Yes, she is.", "Yes, she do.", "Yes, she are."), 1),
                    QuizQuestion("کدام کلمه با «an» می‌آید؟", listOf("teacher", "doctor", "engineer", "nurse"), 2),
                    QuizQuestion("«What ___ they do?»", listOf("does", "do", "is", "are"), 1),
                    QuizQuestion("معنی «Nurse» چیست؟", listOf("دکتر", "پرستار", "مهندس", "معلم"), 1)
                )
            )

            2 -> LessonContent("top_notch_1", 2, "About People", "درباره مردم",
                vocabulary = listOf(
                    VocabWord("Tall", "قدبلند", "tɔːl"), VocabWord("Short", "کوتاه", "ʃɔːrt"),
                    VocabWord("Young", "جوان", "jʌŋ"), VocabWord("Old", "پیر", "oʊld"),
                    VocabWord("Nice", "مهربان", "naɪs"), VocabWord("Funny", "بامزه", "ˈfʌni"),
                    VocabWord("Serious", "جدی", "ˈsɪriəs"), VocabWord("Friendly", "خوش‌برخورد", "ˈfrendli"),
                    VocabWord("Quiet", "ساکت", "ˈkwaɪət"), VocabWord("Talkative", "پرحرف", "ˈtɔːkətɪv")
                ),
                grammar = listOf(
                    GrammarSection("📌 جای صفت در جمله",
                        "صفت بعد از be یا قبل از اسم:\n\n" +
                        "• She is tall.\n" +
                        "• She is a tall girl.\n" +
                        "• ❌ She tall is. → ✅ She is tall."),
                    GrammarSection("📌 پرسیدن شخصیت و ظاهر",
                        "• What is he like? → He's kind and funny. (شخصیت)\n" +
                        "• What does he look like? → He's tall and thin. (ظاهر)"),
                    GrammarSection("📌 صفت‌های متضاد",
                        "tall ↔ short\nyoung ↔ old\nnice ↔ mean\nquiet ↔ talkative"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ She very nice. → ✅ She is very nice.\n" +
                        "❌ He is a man tall. → ✅ He is a tall man.")
                ),
                conversation = listOf(
                    DialogueLine("Anna", "Who is your best friend?", "بهترین دوستت کیه؟"),
                    DialogueLine("Mike", "Her name is Sara. She's my classmate.", "اسمش ساراست. همکلاسیمه."),
                    DialogueLine("Anna", "What is she like?", "چه جوریه؟"),
                    DialogueLine("Mike", "She is tall and very friendly. She's also very smart.", "قدبلنده و خیلی خوش‌برخورد. خیلی هم باهوشه."),
                    DialogueLine("Anna", "Is she funny?", "بامزه‌ست؟"),
                    DialogueLine("Mike", "Yes! She makes everyone laugh.", "بله! همه رو می‌خندونه."),
                    DialogueLine("Anna", "What does she look like?", "ظاهرش چطوره؟"),
                    DialogueLine("Mike", "She has long black hair and brown eyes.", "موهای بلند مشکی و چشم‌های قهوه‌ای داره."),
                    DialogueLine("Anna", "Is she talkative?", "پرحرفه؟"),
                    DialogueLine("Mike", "Not really. She's actually quite quiet.", "نه زیاد. در واقع خیلی ساکته."),
                    DialogueLine("Anna", "And what does she do?", "و چیکار می‌کنه؟"),
                    DialogueLine("Mike", "She's a student. She wants to be a doctor.", "دانش‌آموزه. می‌خواد دکتر بشه.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Tall» چیست؟", listOf("کوتاه", "قدبلند", "پیر", "جوان"), 1),
                    QuizQuestion("کدام درست است؟", listOf("She tall.", "She is tall.", "She are tall.", "Tall she."), 1),
                    QuizQuestion("«What is she like?» یعنی چه؟", listOf("ظاهرش چطوره؟", "چه جوریه؟", "کجاست؟", "چیکار می‌کنه؟"), 1),
                    QuizQuestion("متضاد «young» کدام است؟", listOf("tall", "old", "short", "nice"), 1),
                    QuizQuestion("کدام درست است؟", listOf("He is a man tall.", "He is a tall man.", "He tall is.", "Tall he is."), 1),
                    QuizQuestion("معنی «Quiet» چیست؟", listOf("پرحرف", "ساکت", "مهربان", "باهوش"), 1),
                    QuizQuestion("کدام جمله درست است؟", listOf("She very nice.", "She is very nice.", "She be nice.", "Nice she is."), 1),
                    QuizQuestion("«او خجالتی است.»", listOf("He is shy.", "He are shy.", "He shy.", "Shy he."), 0)
                )
            )

            3 -> LessonContent("top_notch_1", 3, "Places and Things", "مکان‌ها و اشیا",
                vocabulary = listOf(
                    VocabWord("Book", "کتاب", "bʊk"), VocabWord("Table", "میز", "ˈteɪbəl"),
                    VocabWord("Chair", "صندلی", "tʃer"), VocabWord("Window", "پنجره", "ˈwɪndoʊ"),
                    VocabWord("Door", "در", "dɔːr"), VocabWord("Street", "خیابان", "striːt"),
                    VocabWord("City", "شهر", "ˈsɪti"), VocabWord("Country", "کشور", "ˈkʌntri"),
                    VocabWord("Park", "پارک", "pɑːrk"), VocabWord("Hospital", "بیمارستان", "ˈhɑːspɪtəl")
                ),
                grammar = listOf(
                    GrammarSection("📌 جمع اسم‌ها",
                        "• +s: book → books\n" +
                        "• +es (بعد از s,x,ch,sh,o): box → boxes\n" +
                        "• y → ies: city → cities\n" +
                        "• بی‌قاعده: man → men / child → children"),
                    GrammarSection("📌 There is / There are",
                        "• There is + مفرد: There is a book.\n" +
                        "• There are + جمع: There are two books.\n" +
                        "• سوال: Is there a bank? / Are there any parks?"),
                    GrammarSection("📌 حروف اضافه مکان",
                        "• in (داخل): in the room\n" +
                        "• on (روی): on the table\n" +
                        "• under (زیر): under the bed\n" +
                        "• next to (کنار): next to the door"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ There is two books. → ✅ There are two books.\n" +
                        "❌ two childs → ✅ two children")
                ),
                conversation = listOf(
                    DialogueLine("David", "Where are you from?", "اهل کجایی؟"),
                    DialogueLine("Lisa", "I'm from Tehran. It's the capital of Iran.", "اهل تهرام. پایتخت ایرانه."),
                    DialogueLine("David", "Is it a big city?", "شهر بزرگیه؟"),
                    DialogueLine("Lisa", "Yes, very big. There are many streets.", "بله، خیلی بزرگ. خیابان‌های زیادی داره."),
                    DialogueLine("David", "Are there any parks?", "پارک هم داره؟"),
                    DialogueLine("Lisa", "Yes, there are several beautiful parks.", "بله، چند تا پارک زیبا داره."),
                    DialogueLine("David", "What about museums?", "موزه چطور؟"),
                    DialogueLine("Lisa", "There are many museums. The National Museum is famous.", "موزه‌های زیادی داره. موزه ملی معروفه."),
                    DialogueLine("David", "Is there a good restaurant near your home?", "رستوران خوبی نزدیک خونت هست؟"),
                    DialogueLine("Lisa", "Yes, there's an Italian restaurant on my street.", "بله، یه رستوران ایتالیایی توی خیابون ما هست.")
                ),
                quiz = listOf(
                    QuizQuestion("جمع «book» چیست؟", listOf("bookes", "books", "book", "bookies"), 1),
                    QuizQuestion("جمع «child» چیست؟", listOf("childs", "childes", "children", "childrens"), 2),
                    QuizQuestion("کدام درست است؟", listOf("There is two books.", "There are two books.", "There have two books.", "There has two books."), 1),
                    QuizQuestion("جمع «city» چیست؟", listOf("citys", "cities", "cityes", "city"), 1),
                    QuizQuestion("«There ___ a park near my house.»", listOf("are", "is", "have", "has"), 1),
                    QuizQuestion("جمع «woman» چیست؟", listOf("womans", "womens", "women", "womanes"), 2),
                    QuizQuestion("کدام درست است؟", listOf("There are a pen.", "There is a pen.", "There have a pen.", "There has a pen."), 1),
                    QuizQuestion("جمع «box» چیست؟", listOf("boxs", "box", "boxes", "boxies"), 2)
                )
            )

            4 -> LessonContent("top_notch_1", 4, "Family", "خانواده",
                vocabulary = listOf(
                    VocabWord("Father", "پدر", "ˈfɑːðər"), VocabWord("Mother", "مادر", "ˈmʌðər"),
                    VocabWord("Brother", "برادر", "ˈbrʌðər"), VocabWord("Sister", "خواهر", "ˈsɪstər"),
                    VocabWord("Son", "پسر", "sʌn"), VocabWord("Daughter", "دختر", "ˈdɔːtər"),
                    VocabWord("Grandfather", "پدربزرگ", "ˈɡrænfɑːðər"), VocabWord("Grandmother", "مادربزرگ", "ˈɡrænmʌðər"),
                    VocabWord("Uncle", "عمو/دایی", "ˈʌŋkəl"), VocabWord("Aunt", "عمه/خاله", "ænt")
                ),
                grammar = listOf(
                    GrammarSection("📌 مالکیت با 's",
                        "• Ali's book = کتاب علی\n" +
                        "• My father's car = ماشین پدرم\n" +
                        "• Sara's mother = مادر سارا\n\n" +
                        "برای جمع: The students' classroom"),
                    GrammarSection("📌 Have / Has",
                        "• I / You / We / They → have\n" +
                        "  I have two brothers.\n\n" +
                        "• He / She / It → has\n" +
                        "  She has one sister."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ Ali book → ✅ Ali's book\n" +
                        "❌ She have a brother. → ✅ She has a brother.")
                ),
                conversation = listOf(
                    DialogueLine("A", "Do you have a big family?", "خانواده بزرگی داری؟"),
                    DialogueLine("B", "Yes, I have two brothers and one sister.", "بله، دو برادر و یه خواهر دارم."),
                    DialogueLine("A", "What does your father do?", "پدرت چیکار می‌کنه؟"),
                    DialogueLine("B", "He's a doctor. He works at a hospital.", "دکتره. توی بیمارستان کار می‌کنه."),
                    DialogueLine("A", "And your mother?", "مادرت؟"),
                    DialogueLine("B", "She's a teacher. She teaches at a school.", "معلمه. توی مدرسه درس می‌ده."),
                    DialogueLine("A", "Do you have any grandparents?", "پدربزرگ و مادربزرگ داری؟"),
                    DialogueLine("B", "Yes, my grandmother lives with us.", "بله، مادربزرگم با ما زندگی می‌کنه."),
                    DialogueLine("A", "That's nice. What about your sister?", "چه خوب. خواهرت چطور؟"),
                    DialogueLine("B", "She wants to be an engineer.", "می‌خواد مهندس بشه.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Daughter» چیست؟", listOf("پسر", "دختر", "برادر", "خواهر"), 1),
                    QuizQuestion("کدام درست است؟", listOf("Ali book", "Ali's book", "Alis book", "Book Ali"), 1),
                    QuizQuestion("کدام درست است؟", listOf("She have a brother.", "She has a brother.", "She haves a brother.", "She having a brother."), 1),
                    QuizQuestion("معنی «Uncle» چیست؟", listOf("عمو/دایی", "عمه/خاله", "پدربزرگ", "پسرعمو"), 0),
                    QuizQuestion("«خانه‌ی والدینم»؟", listOf("My parents house", "My parent's house", "My parents' house", "My parents's house"), 2),
                    QuizQuestion("کدام درست است؟", listOf("I has a sister.", "I have a sister.", "I having a sister.", "I haves a sister."), 1),
                    QuizQuestion("معنی «Wife» چیست؟", listOf("شوهر", "همسر (زن)", "خواهر", "مادر"), 1),
                    QuizQuestion("«The students' classroom»؟", listOf("کلاس یک دانش‌آموز", "کلاس دانش‌آموزان", "دانش‌آموز کلاس", "معلم کلاس"), 1)
                )
            )

            5 -> LessonContent("top_notch_1", 5, "Events and Times", "رویدادها و زمان‌ها",
                vocabulary = listOf(
                    VocabWord("Today", "امروز", "təˈdeɪ"), VocabWord("Tomorrow", "فردا", "təˈmɑːroʊ"),
                    VocabWord("Yesterday", "دیروز", "ˈjestərdeɪ"), VocabWord("Morning", "صبح", "ˈmɔːrnɪŋ"),
                    VocabWord("Afternoon", "بعدازظهر", "ˌæftərˈnuːn"), VocabWord("Evening", "عصر", "ˈiːvnɪŋ"),
                    VocabWord("Night", "شب", "naɪt"), VocabWord("Week", "هفته", "wiːk"),
                    VocabWord("Month", "ماه", "mʌnθ"), VocabWord("Year", "سال", "jɪr")
                ),
                grammar = listOf(
                    GrammarSection("📌 at / on / in",
                        "• at + ساعت: at 7 AM, at 3 PM, at noon\n" +
                        "• on + روز: on Monday, on July 5th\n" +
                        "• in + ماه/سال/فصل: in May, in 2024, in summer"),
                    GrammarSection("📌 قیود زمان",
                        "• today, tomorrow, yesterday\n" +
                        "• now, later, soon"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ in Monday → ✅ on Monday\n" +
                        "❌ at the morning → ✅ in the morning\n" +
                        "❌ on 2024 → ✅ in 2024")
                ),
                conversation = listOf(
                    DialogueLine("A", "What time is the meeting?", "جلسه چه ساعتیه؟"),
                    DialogueLine("B", "It's at 3 PM on Tuesday.", "ساعت ۳ بعدازظهر سه‌شنبه."),
                    DialogueLine("A", "Where is it?", "کجاست؟"),
                    DialogueLine("B", "In the main conference room.", "توی اتاق کنفرانس اصلی."),
                    DialogueLine("A", "How long will it take?", "چقدر طول می‌کشه؟"),
                    DialogueLine("B", "About an hour.", "حدود یه ساعت."),
                    DialogueLine("A", "Do I need to prepare anything?", "باید چیزی آماده کنم؟"),
                    DialogueLine("B", "Yes, please bring your reports.", "بله، لطفاً گزارش‌هات رو بیار."),
                    DialogueLine("A", "OK. See you on Tuesday.", "باشه. سه‌شنبه می‌بینمت."),
                    DialogueLine("B", "See you! Don't be late.", "می‌بینمت! دیر نکن.")
                ),
                quiz = listOf(
                    QuizQuestion("کدام درست است؟", listOf("in Monday", "on Monday", "at Monday", "Monday in"), 1),
                    QuizQuestion("معنی «Tomorrow» چیست؟", listOf("امروز", "دیروز", "فردا", "پریروز"), 2),
                    QuizQuestion("«at» با کدام می‌آید؟", listOf("Monday", "May", "7 PM", "2024"), 2),
                    QuizQuestion("«in» با کدام می‌آید؟", listOf("noon", "May", "Monday", "midnight"), 1),
                    QuizQuestion("کدام درست است؟", listOf("at the morning", "in the morning", "on the morning", "the morning"), 1),
                    QuizQuestion("معنی «Week» چیست؟", listOf("روز", "ماه", "هفته", "سال"), 2),
                    QuizQuestion("کدام درست است؟", listOf("on 2024", "at 2024", "in 2024", "2024 in"), 2),
                    QuizQuestion("معنی «Yesterday» چیست؟", listOf("امروز", "فردا", "دیروز", "پریروز"), 2)
                )
            )

            6 -> LessonContent("top_notch_1", 6, "Cities and Countries", "شهرها و کشورها",
                vocabulary = listOf(
                    VocabWord("Country", "کشور", "ˈkʌntri"), VocabWord("City", "شهر", "ˈsɪti"),
                    VocabWord("Capital", "پایتخت", "ˈkæpɪtəl"), VocabWord("Language", "زبان", "ˈlæŋɡwɪdʒ"),
                    VocabWord("Nationality", "ملیت", "ˌnæʃəˈnæləti"), VocabWord("Continent", "قاره", "ˈkɑːntɪnənt"),
                    VocabWord("World", "جهان", "wɜːrld"), VocabWord("Flag", "پرچم", "flæɡ"),
                    VocabWord("Tourist", "توریست", "ˈtʊrɪst"), VocabWord("Citizen", "شهروند", "ˈsɪtɪzən")
                ),
                grammar = listOf(
                    GrammarSection("📌 Where are you from?",
                        "• Where are you from? — I'm from Iran.\n" +
                        "• Where is she from? — She's from France."),
                    GrammarSection("📌 ملیت‌ها",
                        "• Iran → Iranian\n" +
                        "• France → French\n" +
                        "• Japan → Japanese\n" +
                        "• USA → American"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ Where you from? → ✅ Where are you from?\n" +
                        "❌ I from Iran. → ✅ I'm from Iran.")
                ),
                conversation = listOf(
                    DialogueLine("A", "Where are you from?", "اهل کجایی؟"),
                    DialogueLine("B", "I'm from Japan.", "اهل ژاپنم."),
                    DialogueLine("A", "What nationality are you?", "ملیتت چیه؟"),
                    DialogueLine("B", "I'm Japanese.", "ژاپنی‌ام."),
                    DialogueLine("A", "What language do you speak?", "چه زبانی صحبت می‌کنی؟"),
                    DialogueLine("B", "I speak Japanese and English.", "ژاپنی و انگلیسی صحبت می‌کنم."),
                    DialogueLine("A", "What's the capital of Japan?", "پایتخت ژاپن کجاست؟"),
                    DialogueLine("B", "Tokyo. It's a huge city.", "توکیو. شهر خیلی بزرگیه."),
                    DialogueLine("A", "I'd love to visit Japan someday.", "دوست دارم یه روز ژاپن رو ببینم."),
                    DialogueLine("B", "You should! It's a beautiful country.", "باید بیای! کشور زیباییه.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Capital» چیست؟", listOf("شهر", "پایتخت", "کشور", "استان"), 1),
                    QuizQuestion("کدام درست است؟", listOf("Where you from?", "Where are you from?", "From where you?", "You from?"), 1),
                    QuizQuestion("ملیت France؟", listOf("Francian", "French", "Francean", "Franish"), 1),
                    QuizQuestion("ملیت Japan؟", listOf("Japanian", "Japanish", "Japanese", "Japanes"), 2),
                    QuizQuestion("معنی «Flag» چیست؟", listOf("نقشه", "پرچم", "مرز", "کشور"), 1),
                    QuizQuestion("پایتخت ایران؟", listOf("Tehran", "Isfahan", "Shiraz", "Tabriz"), 0),
                    QuizQuestion("معنی «Tourist» چیست؟", listOf("شهروند", "توریست", "بومی", "خارجی"), 1),
                    QuizQuestion("کدام درست است؟", listOf("I from Iran.", "I'm from Iran.", "I is from Iran.", "From Iran I."), 1)
                )
            )

            7 -> LessonContent("top_notch_1", 7, "Clothes", "لباس‌ها",
                vocabulary = listOf(
                    VocabWord("Shirt", "پیراهن", "ʃɜːrt"), VocabWord("Pants", "شلوار", "pænts"),
                    VocabWord("Dress", "لباس زنانه", "dres"), VocabWord("Jacket", "کاپشن", "ˈdʒækɪt"),
                    VocabWord("Shoes", "کفش", "ʃuːz"), VocabWord("Hat", "کلاه", "hæt"),
                    VocabWord("Socks", "جوراب", "sɑːks"), VocabWord("Coat", "پالتو", "koʊt"),
                    VocabWord("Skirt", "دامن", "skɜːrt"), VocabWord("Sweater", "پلیور", "ˈswetər")
                ),
                grammar = listOf(
                    GrammarSection("📌 ترتیب رنگ + اسم", "a red shirt | blue pants"),
                    GrammarSection("📌 This / These",
                        "• This + مفرد: This is my shirt.\n" +
                        "• These + جمع: These are my shoes."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ a shirt red → ✅ a red shirt\n" +
                        "❌ This shoes → ✅ These shoes")
                ),
                conversation = listOf(
                    DialogueLine("A", "What are you wearing today?", "امروز چی پوشیدی؟"),
                    DialogueLine("B", "A blue shirt and black pants.", "پیراهن آبی و شلوار مشکی."),
                    DialogueLine("A", "Nice shoes!", "کفش‌های قشنگی!"),
                    DialogueLine("B", "Thanks! They're new.", "ممنون! جدیدن."),
                    DialogueLine("A", "Where did you buy them?", "از کجا خریدی؟"),
                    DialogueLine("B", "At the mall. There's a sale.", "از پاساژ. حراج داره."),
                    DialogueLine("A", "I need a new jacket too.", "منم کاپشن جدید لازم دارم."),
                    DialogueLine("B", "Let's go together!", "بیا با هم بریم!"),
                    DialogueLine("A", "Great idea! What color?", "عالیه! چه رنگی؟"),
                    DialogueLine("B", "A black one. It matches everything.", "مشکی. با همه چی هماهنگه.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Jacket» چیست؟", listOf("پیراهن", "کاپشن", "شلوار", "کفش"), 1),
                    QuizQuestion("کدام درست است؟", listOf("a shirt blue", "blue a shirt", "a blue shirt", "shirt blue"), 2),
                    QuizQuestion("کدام درست است؟", listOf("This shoes", "These shoes", "This shoe are", "These shoe"), 1),
                    QuizQuestion("معنی «Skirt» چیست؟", listOf("شلوار", "دامن", "پیراهن", "کاپشن"), 1),
                    QuizQuestion("«این پیراهن من است.»", listOf("This is my shirt.", "These is my shirt.", "This are my shirt.", "My shirt this is."), 0),
                    QuizQuestion("معنی «Socks» چیست؟", listOf("جوراب", "دستکش", "کلاه", "شال"), 0),
                    QuizQuestion("کدام درست است؟", listOf("These are my shoes.", "This are my shoes.", "These is my shoes.", "This is my shoes."), 0),
                    QuizQuestion("معنی «Sweater» چیست؟", listOf("پالتو", "پلیور", "کاپشن", "جلیقه"), 1)
                )
            )

            8 -> LessonContent("top_notch_1", 8, "Daily Life", "زندگی روزمره",
                vocabulary = listOf(
                    VocabWord("Wake up", "بیدار شدن", "weɪk ʌp"), VocabWord("Get dressed", "لباس پوشیدن", "ɡet drest"),
                    VocabWord("Brush teeth", "مسواک زدن", "brʌʃ tiːθ"), VocabWord("Have breakfast", "صبحانه خوردن", "hæv ˈbrekfəst"),
                    VocabWord("Go to work", "به سر کار رفتن", "ɡoʊ tə wɜːrk"), VocabWord("Come home", "به خانه آمدن", "kʌm hoʊm"),
                    VocabWord("Watch TV", "تلویزیون تماشا کردن", "wɑːtʃ ˌtiːˈviː"), VocabWord("Go to bed", "به رختخواب رفتن", "ɡoʊ tə bed")
                ),
                grammar = listOf(
                    GrammarSection("📌 حال ساده برای عادت‌ها",
                        "• I wake up at 7 every day.\n" +
                        "• She gets dressed after breakfast."),
                    GrammarSection("📌 سوم شخص مفرد",
                        "• He/She/It → فعل + s\n" +
                        "• I wake up → She wakes up\n" +
                        "• I go → He goes"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ I wake up 7. → ✅ I wake up at 7.\n" +
                        "❌ She wake up early. → ✅ She wakes up early.")
                ),
                conversation = listOf(
                    DialogueLine("A", "What time do you wake up?", "ساعت چند بیدار می‌شی؟"),
                    DialogueLine("B", "At 6:30. I like to start early.", "۶:۳۰. دوست دارم زود شروع کنم."),
                    DialogueLine("A", "When do you go to work?", "کِی می‌ری سر کار؟"),
                    DialogueLine("B", "At 8 o'clock. I take the bus.", "ساعت ۸. اتوبوس می‌گیرم."),
                    DialogueLine("A", "What do you do in the evening?", "عصرها چیکار می‌کنی؟"),
                    DialogueLine("B", "I usually exercise, then have dinner.", "معمولاً ورزش می‌کنم، بعد شام می‌خورم."),
                    DialogueLine("A", "What time do you go to bed?", "ساعت چند می‌خوابی؟"),
                    DialogueLine("B", "Around 11. I read a book before sleeping.", "حدود ۱۱. قبل خواب کتاب می‌خونم."),
                    DialogueLine("A", "That's a healthy routine!", "روتین سالمیه!"),
                    DialogueLine("B", "Yes, it works for me.", "بله، برای من جواب می‌ده.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Brush teeth» چیست؟", listOf("شستن دست", "مسواک زدن", "شام خوردن", "خوابیدن"), 1),
                    QuizQuestion("کدام درست است؟", listOf("I wake up 7.", "I wake up at 7.", "I wake at 7 up.", "Wake I up 7."), 1),
                    QuizQuestion("سوم شخص مفرد درست؟", listOf("She wake up early.", "She wakes up early.", "She waking up early.", "She wake ups early."), 1),
                    QuizQuestion("معنی «Have dinner» چیست؟", listOf("صبحانه خوردن", "ناهار خوردن", "شام خوردن", "میان‌وعده"), 2),
                    QuizQuestion("«همیشه» به انگلیسی؟", listOf("never", "always", "sometimes", "rarely"), 1),
                    QuizQuestion("کدام درست است؟", listOf("He go to work.", "He goes to work.", "He going to work.", "He go work."), 1),
                    QuizQuestion("معنی «Exercise» چیست؟", listOf("خوابیدن", "ورزش کردن", "درس خواندن", "استراحت"), 1),
                    QuizQuestion("«هرگز» به انگلیسی؟", listOf("always", "usually", "never", "often"), 2)
                )
            )

            9 -> LessonContent("top_notch_1", 9, "Shopping", "خرید",
                vocabulary = listOf(
                    VocabWord("Store", "فروشگاه", "stɔːr"), VocabWord("Price", "قیمت", "praɪs"),
                    VocabWord("Dollar", "دلار", "ˈdɑːlər"), VocabWord("Credit card", "کارت اعتباری", "ˈkredɪt kɑːrd"),
                    VocabWord("Cash", "پول نقد", "kæʃ"), VocabWord("Discount", "تخفیف", "ˈdɪskaʊnt"),
                    VocabWord("Receipt", "رسید", "rɪˈsiːt"), VocabWord("Customer", "مشتری", "ˈkʌstəmər"),
                    VocabWord("Sale", "حراج", "seɪl"), VocabWord("Expensive", "گران", "ɪkˈspensɪv")
                ),
                grammar = listOf(
                    GrammarSection("📌 How much?",
                        "• How much is this? — It's 10 dollars.\n" +
                        "• How much are these? — They're 20 dollars."),
                    GrammarSection("📌 This / That / These / Those",
                        "• This (این - نزدیک مفرد)\n" +
                        "• That (آن - دور مفرد)\n" +
                        "• These (این‌ها - نزدیک جمع)\n" +
                        "• Those (آنها - دور جمع)"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ How much these? → ✅ How much are these?\n" +
                        "❌ How many is this? → ✅ How much is this?")
                ),
                conversation = listOf(
                    DialogueLine("A", "Excuse me, how much is this jacket?", "ببخشید، این کاپشن چنده؟"),
                    DialogueLine("B", "It's sixty dollars.", "شصت دلار."),
                    DialogueLine("A", "Any discount?", "تخفیف دارید؟"),
                    DialogueLine("B", "Yes, 20% off today.", "بله، امروز ۲۰٪."),
                    DialogueLine("A", "Great! Can I try it on?", "عالی! می‌تونم امتحانش کنم؟"),
                    DialogueLine("B", "Sure. The fitting room is over there.", "حتماً. اتاق پرو اونجاست."),
                    DialogueLine("A", "How do I pay?", "چطور پرداخت کنم؟"),
                    DialogueLine("B", "Cash or credit card, both are fine.", "نقد یا کارت، هر دو."),
                    DialogueLine("A", "Credit card, please.", "کارت، لطفاً."),
                    DialogueLine("B", "Here's your receipt. Have a nice day!", "اینم رسیدت. روز خوبی داشته باشی!")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Discount» چیست؟", listOf("افزایش", "تخفیف", "رسید", "مالیات"), 1),
                    QuizQuestion("کدام درست است؟", listOf("How much these?", "How much are these?", "How many are these?", "How these much?"), 1),
                    QuizQuestion("معنی «Receipt» چیست؟", listOf("قیمت", "رسید", "پول خرد", "کیسه"), 1),
                    QuizQuestion("معنی «Expensive» چیست؟", listOf("ارزان", "گران", "متوسط", "رایگان"), 1),
                    QuizQuestion("کدام درست است؟", listOf("How much is this?", "How much are this?", "How many is this?", "How is this much?"), 0),
                    QuizQuestion("معنی «Cash» چیست؟", listOf("کارت", "چک", "پول نقد", "وام"), 2),
                    QuizQuestion("«How much are these?» جواب؟", listOf("It's 10 dollars.", "They're 10 dollars.", "Is 10 dollars.", "Are 10 dollars."), 1),
                    QuizQuestion("معنی «Customer» چیست؟", listOf("فروشنده", "مشتری", "مدیر", "کارمند"), 1)
                )
            )

            10 -> LessonContent("top_notch_1", 10, "Food", "غذا",
                vocabulary = listOf(
                    VocabWord("Bread", "نان", "bred"), VocabWord("Cheese", "پنیر", "tʃiːz"),
                    VocabWord("Egg", "تخم‌مرغ", "eɡ"), VocabWord("Milk", "شیر", "mɪlk"),
                    VocabWord("Meat", "گوشت", "miːt"), VocabWord("Rice", "برنج", "raɪs"),
                    VocabWord("Fruit", "میوه", "fruːt"), VocabWord("Vegetable", "سبزیجات", "ˈvedʒtəbəl"),
                    VocabWord("Chicken", "مرغ", "ˈtʃɪkɪn"), VocabWord("Fish", "ماهی", "fɪʃ")
                ),
                grammar = listOf(
                    GrammarSection("📌 Some / Any",
                        "• Some در جملات مثبت: I have some cheese.\n" +
                        "• Any در منفی و سوال: I don't have any milk. / Do you have any eggs?"),
                    GrammarSection("📌 Countable / Uncountable",
                        "• قابل شمارش: egg → eggs / apple → apples\n" +
                        "• غیرقابل شمارش: milk, water, rice (بدون s)"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ I have any bread. → ✅ I have some bread.\n" +
                        "❌ two breads → ✅ two loaves of bread")
                ),
                conversation = listOf(
                    DialogueLine("A", "Do we have any bread?", "نان داریم؟"),
                    DialogueLine("B", "No, we need to buy some.", "نه، باید بخریم."),
                    DialogueLine("A", "What about eggs?", "تخم‌مرغ چطور؟"),
                    DialogueLine("B", "We have some eggs. Maybe five or six.", "چند تا تخم‌مرغ داریم. شاید پنج شش تا."),
                    DialogueLine("A", "Do we need milk?", "شیر لازم داریم؟"),
                    DialogueLine("B", "Yes, and some cheese too.", "بله، پنیر هم."),
                    DialogueLine("A", "Let me make a shopping list.", "بذار یه لیست خرید بنویسم."),
                    DialogueLine("B", "Good idea. We also need vegetables.", "فکر خوبیه. سبزیجات هم لازم داریم."),
                    DialogueLine("A", "Anything else?", "چیز دیگه‌ای هم هست؟"),
                    DialogueLine("B", "No, that's all. Let's go!", "نه، همین. بریم!")
                ),
                quiz = listOf(
                    QuizQuestion("کدام درست است؟", listOf("I have some bread.", "I have any bread.", "I have a bread.", "I have breads."), 0),
                    QuizQuestion("معنی «Vegetable» چیست؟", listOf("میوه", "گوشت", "سبزیجات", "نان"), 2),
                    QuizQuestion("کدام غیرقابل شمارش است؟", listOf("apple", "egg", "milk", "book"), 2),
                    QuizQuestion("در سوال از کدام استفاده می‌کنیم؟", listOf("some", "any", "a", "the"), 1),
                    QuizQuestion("«I don't have ___ milk.»", listOf("some", "any", "a", "an"), 1),
                    QuizQuestion("معنی «Chicken» چیست؟", listOf("گوشت", "مرغ", "ماهی", "تخم‌مرغ"), 1),
                    QuizQuestion("کدام درست است؟", listOf("two breads", "two bread", "two loaves of bread", "two breads"), 2),
                    QuizQuestion("معنی «Juice» چیست؟", listOf("آب", "چای", "آبمیوه", "شیر"), 2)
                )
            )

            11 -> LessonContent("top_notch_1", 11, "Health", "سلامتی",
                vocabulary = listOf(
                    VocabWord("Headache", "سردرد", "ˈhedeɪk"), VocabWord("Stomachache", "دل‌درد", "ˈstʌməkeɪk"),
                    VocabWord("Fever", "تب", "ˈfiːvər"), VocabWord("Cough", "سرفه", "kɔːf"),
                    VocabWord("Cold", "سرماخوردگی", "koʊld"), VocabWord("Medicine", "دارو", "ˈmedɪsɪn"),
                    VocabWord("Pharmacy", "داروخانه", "ˈfɑːrməsi"), VocabWord("Rest", "استراحت", "rest"),
                    VocabWord("Doctor", "دکتر", "ˈdɑːktər"), VocabWord("Sore throat", "گلودرد", "sɔːr θroʊt")
                ),
                grammar = listOf(
                    GrammarSection("📌 Should / Shouldn't",
                        "• Should = باید (توصیه)\n" +
                        "  You should rest.\n" +
                        "  You should drink water.\n\n" +
                        "• Shouldn't = نباید\n" +
                        "  You shouldn't eat too much."),
                    GrammarSection("📌 ساختار",
                        "Subject + should + verb (بدون to)"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ You should to rest. → ✅ You should rest.\n" +
                        "❌ You should resting. → ✅ You should rest.")
                ),
                conversation = listOf(
                    DialogueLine("A", "Good morning. How can I help you?", "صبح بخیر. چطور کمکتون کنم؟"),
                    DialogueLine("B", "I have a headache and a fever.", "سردرد و تب دارم."),
                    DialogueLine("A", "Do you have a cough too?", "سرفه هم دارید؟"),
                    DialogueLine("B", "Yes, and a sore throat.", "بله، گلودرد هم دارم."),
                    DialogueLine("A", "You should take this medicine.", "باید این دارو رو بخورید."),
                    DialogueLine("B", "How often should I take it?", "هر چند وقت یه بار بخورم؟"),
                    DialogueLine("A", "Three times a day after meals.", "روزی سه بار بعد از غذا."),
                    DialogueLine("B", "Should I see a doctor?", "باید دکتر برم؟"),
                    DialogueLine("A", "If it doesn't get better in 2 days, yes.", "اگه تا ۲ روز بهتر نشد، بله."),
                    DialogueLine("B", "Thank you so much.", "خیلی ممنون.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Fever» چیست؟", listOf("سردرد", "تب", "سرفه", "دل‌درد"), 1),
                    QuizQuestion("کدام درست است؟", listOf("You should rest.", "You should to rest.", "You should resting.", "Should you rest."), 0),
                    QuizQuestion("معنی «Sore throat» چیست؟", listOf("سردرد", "گلودرد", "دل‌درد", "دندان‌درد"), 1),
                    QuizQuestion("«You ___ eat too much.»", listOf("should", "shouldn't", "must", "can"), 1),
                    QuizQuestion("معنی «Medicine» چیست؟", listOf("دارو", "دکتر", "بیمار", "بیماری"), 0),
                    QuizQuestion("کدام درست است؟", listOf("You should take medicine.", "You should takes medicine.", "You should taking medicine.", "You should to take."), 0),
                    QuizQuestion("معنی «Pharmacy» چیست؟", listOf("بیمارستان", "داروخانه", "مطب", "آزمایشگاه"), 1),
                    QuizQuestion("معنی «Healthy» چیست؟", listOf("بیمار", "سالم", "خسته", "ضعیف"), 1)
                )
            )

            12 -> LessonContent("top_notch_1", 12, "Weekend Activities", "آخر هفته",
                vocabulary = listOf(
                    VocabWord("Go out", "بیرون رفتن", "ɡoʊ aʊt"), VocabWord("Stay home", "خونه موندن", "steɪ hoʊm"),
                    VocabWord("Visit friends", "دیدن دوستان", "ˈvɪzɪt frendz"), VocabWord("Play sports", "ورزش کردن", "pleɪ spɔːrts"),
                    VocabWord("Watch movies", "فیلم دیدن", "wɑːtʃ ˈmuːviz"), VocabWord("Go shopping", "خرید رفتن", "ɡoʊ ˈʃɑːpɪŋ"),
                    VocabWord("Read books", "کتاب خواندن", "riːd bʊks"), VocabWord("Relax", "استراحت کردن", "rɪˈlæks")
                ),
                grammar = listOf(
                    GrammarSection("📌 Going to (Future Plans)",
                        "am/is/are + going to + verb\n\n" +
                        "• I'm going to visit my family.\n" +
                        "• She's going to travel."),
                    GrammarSection("📌 سوال با Going to",
                        "• What are you going to do?\n" +
                        "• Where is she going to go?"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ I going to stay. → ✅ I'm going to stay.\n" +
                        "❌ I'm go to stay. → ✅ I'm going to stay.")
                ),
                conversation = listOf(
                    DialogueLine("A", "What are you going to do this weekend?", "این آخر هفته چیکار می‌کنی؟"),
                    DialogueLine("B", "I'm going to visit my grandma.", "می‌خوام مادربزرگم رو ببینم."),
                    DialogueLine("A", "That sounds nice. What about Sunday?", "چه خوب. یکشنبه چطور؟"),
                    DialogueLine("B", "I'm going to relax at home.", "می‌خوام خونه استراحت کنم."),
                    DialogueLine("A", "I'm going to go hiking with friends.", "من با دوستام می‌ریم کوه‌پیمایی."),
                    DialogueLine("B", "That's a great idea! Where?", "فکر عالیه! کجا؟"),
                    DialogueLine("A", "To the mountains north of the city.", "کوه‌های شمال شهر."),
                    DialogueLine("B", "Have fun! Take lots of photos.", "خوش بگذره! عکس زیاد بگیر."),
                    DialogueLine("A", "I will! See you Monday.", "حتماً! دوشنبه می‌بینمت."),
                    DialogueLine("B", "See you!", "می‌بینمت!")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Relax» چیست؟", listOf("خسته شدن", "استراحت کردن", "کار کردن", "دویدن"), 1),
                    QuizQuestion("کدام درست است؟", listOf("I going to stay.", "I'm going to stay.", "I'm go to stay.", "I going stay."), 1),
                    QuizQuestion("معنی «Picnic» چیست؟", listOf("سفر", "پیک‌نیک", "مهمانی", "کمپینگ"), 1),
                    QuizQuestion("«او می‌خواهد سفر کند.»", listOf("She going to travel.", "She's going to travel.", "She go to travel.", "She going travel."), 1),
                    QuizQuestion("معنی «Hiking» چیست؟", listOf("شنا", "کوه‌پیمایی", "سفر", "پیک‌نیک"), 1),
                    QuizQuestion("کدام درست است؟", listOf("We going to watch.", "We're going to watch.", "We're go to watch.", "We going watch."), 1),
                    QuizQuestion("معنی «Sightseeing» چیست؟", listOf("خرید", "گردش", "ورزش", "استراحت"), 1),
                    QuizQuestion("«What are you going to do?» یعنی؟", listOf("چیکار کردی؟", "چیکار می‌کنی؟", "چیکار می‌خوای بکنی؟", "چیکار نمی‌کنی؟"), 2)
                )
            )

            13 -> LessonContent("top_notch_1", 13, "Home and Neighborhood", "خانه و محله",
                vocabulary = listOf(
                    VocabWord("House", "خانه", "haʊs"), VocabWord("Apartment", "آپارتمان", "əˈpɑːrtmənt"),
                    VocabWord("Kitchen", "آشپزخانه", "ˈkɪtʃɪn"), VocabWord("Bedroom", "اتاق خواب", "ˈbedruːm"),
                    VocabWord("Bathroom", "حمام", "ˈbæθruːm"), VocabWord("Living room", "اتاق نشیمن", "ˈlɪvɪŋ ruːm"),
                    VocabWord("Garden", "باغ", "ˈɡɑːrdən"), VocabWord("Balcony", "بالکن", "ˈbælkəni")
                ),
                grammar = listOf(
                    GrammarSection("📌 There is / There are + Prepositions",
                        "• There is a sofa in the living room.\n" +
                        "• There are two bedrooms.\n\n" +
                        "• in (داخل): in the kitchen\n" +
                        "• on (روی): on the table\n" +
                        "• under (زیر): under the bed\n" +
                        "• next to (کنار): next to the door"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ There is two beds. → ✅ There are two beds.")
                ),
                conversation = listOf(
                    DialogueLine("A", "Do you live in a house or an apartment?", "خونه زندگی می‌کنی یا آپارتمان؟"),
                    DialogueLine("B", "An apartment on the fifth floor.", "آپارتمان توی طبقه پنجم."),
                    DialogueLine("A", "How many rooms does it have?", "چند اتاق داره؟"),
                    DialogueLine("B", "Three: two bedrooms and a living room.", "سه تا: دو تا اتاق خواب و یه نشیمن."),
                    DialogueLine("A", "Is there a balcony?", "بالکن داره؟"),
                    DialogueLine("B", "Yes, with a beautiful view.", "بله، با منظره زیبا."),
                    DialogueLine("A", "What about the neighborhood?", "محله چطوره؟"),
                    DialogueLine("B", "It's quiet and safe. There's a park nearby.", "ساکت و امنه. یه پارک هم نزدیکشه."),
                    DialogueLine("A", "That sounds perfect!", "عالی به نظر می‌رسه!"),
                    DialogueLine("B", "Yes, I love living there.", "بله، عاشق زندگی اونجام.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Kitchen» چیست؟", listOf("اتاق خواب", "آشپزخانه", "حمام", "نشیمن"), 1),
                    QuizQuestion("کدام درست است؟", listOf("There is two beds.", "There are two beds.", "There have two beds.", "There has two."), 1),
                    QuizQuestion("معنی «Balcony» چیست؟", listOf("حیاط", "بالکن", "گاراژ", "پشت‌بام"), 1),
                    QuizQuestion("«زیر میز» کدام است؟", listOf("on the table", "in the table", "under the table", "next to the table"), 2),
                    QuizQuestion("کدام درست است؟", listOf("There are a sofa.", "There is a sofa.", "There have a sofa.", "There has a sofa."), 1),
                    QuizQuestion("معنی «Neighbor» چیست؟", listOf("دوست", "همسایه", "فامیل", "همکار"), 1),
                    QuizQuestion("«کنار در» کدام است؟", listOf("on the door", "under the door", "next to the door", "in the door"), 2),
                    QuizQuestion("معنی «Elevator» چیست؟", listOf("پله", "آسانسور", "راهرو", "بالکن"), 1)
                )
            )

            14 -> LessonContent("top_notch_1", 14, "Review", "مرور",
                vocabulary = listOf(
                    VocabWord("Remember", "به یاد آوردن", "rɪˈmembər"), VocabWord("Practice", "تمرین", "ˈpræktɪs"),
                    VocabWord("Learn", "یاد گرفتن", "lɜːrn"), VocabWord("Teach", "یاد دادن", "tiːtʃ"),
                    VocabWord("Understand", "فهمیدن", "ˌʌndərˈstænd"), VocabWord("Speak", "صحبت کردن", "spiːk"),
                    VocabWord("Listen", "گوش دادن", "ˈlɪsən"), VocabWord("Write", "نوشتن", "raɪt")
                ),
                grammar = listOf(
                    GrammarSection("📌 مرور مهم‌ترین ساختارها",
                        "۱. a / an + شغل\n" +
                        "۲. do / does\n" +
                        "۳. جمع اسم‌ها\n" +
                        "۴. 's مالکیت\n" +
                        "۵. at / on / in\n" +
                        "۶. some / any\n" +
                        "۷. There is / There are\n" +
                        "۸. Going to"),
                    GrammarSection("📌 تمرین نهایی",
                        "همه ساختارها رو با مثال تمرین کن و با صدای بلند تکرار کن.")
                ),
                conversation = listOf(
                    DialogueLine("A", "Hello! How are you?", "سلام! حالت چطوره؟"),
                    DialogueLine("B", "I'm fine, thanks. And you?", "خوبم، ممنون. تو چطور؟"),
                    DialogueLine("A", "Great! What do you do?", "عالی! شغلت چیه؟"),
                    DialogueLine("B", "I'm a teacher. I teach English.", "معلمم. انگلیسی درس می‌دم."),
                    DialogueLine("A", "That's nice! Where are you from?", "چه خوب! اهل کجایی؟"),
                    DialogueLine("B", "I'm from Iran. And you?", "اهل ایرانم. تو چطور؟"),
                    DialogueLine("A", "I'm from Turkey. I'm a student.", "من از ترکیه‌ام. دانش‌آموزم."),
                    DialogueLine("B", "Do you speak English well?", "انگلیسی رو خوب صحبت می‌کنی؟"),
                    DialogueLine("A", "I'm learning. I practice every day.", "دارم یاد می‌گیرم. هر روز تمرین می‌کنم."),
                    DialogueLine("B", "That's the best way to improve!", "بهترین راه برای پیشرفت همینه!")
                ),
                quiz = listOf(
                    QuizQuestion("کدام درست است؟", listOf("I'm a engineer.", "I'm an engineer.", "I'm engineer.", "I engineer."), 1),
                    QuizQuestion("معنی «Daughter» چیست؟", listOf("پسر", "دختر", "برادر", "خواهر"), 1),
                    QuizQuestion("What ___ she do?", listOf("do", "does", "is", "are"), 1),
                    QuizQuestion("«You ___ rest.»", listOf("should", "shouldn't", "must not", "can't"), 0),
                    QuizQuestion("جمع «child» چیست؟", listOf("childs", "childes", "children", "childrens"), 2),
                    QuizQuestion("کدام درست است؟", listOf("in Monday", "on Monday", "at Monday", "Monday in"), 1),
                    QuizQuestion("«I have ___ bread.»", listOf("any", "some", "a", "an"), 1),
                    QuizQuestion("کدام درست است؟", listOf("There is two books.", "There are two books.", "There have two books.", "There has two."), 1)
                )
            )

            else -> getDefaultContent("top_notch_1", chapter)
        }
    }

    // ==================== Top Notch 2 ====================
    private fun getTopNotch2(chapter: Int): LessonContent {
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
}    // ==================== Top Notch 3 ====================
    private fun getTopNotch3(chapter: Int): LessonContent {
        return when (chapter) {
            1 -> LessonContent("top_notch_3", 1, "Cultural Literacy", "آگاهی فرهنگی",
                vocabulary = listOf(
                    VocabWord("Culture", "فرهنگ", "ˈkʌltʃər"), VocabWord("Tradition", "سنت", "trəˈdɪʃən"),
                    VocabWord("Custom", "رسم و رسوم", "ˈkʌstəm"), VocabWord("Society", "جامعه", "səˈsaɪəti"),
                    VocabWord("Diversity", "تنوع", "dɪˈvɜːrsəti"), VocabWord("Heritage", "میراث", "ˈherɪtɪdʒ"),
                    VocabWord("Etiquette", "آداب معاشرت", "ˈetɪket"), VocabWord("Taboo", "تابو", "təˈbuː")
                ),
                grammar = listOf(
                    GrammarSection("📌 Present Perfect Continuous",
                        "have/has + been + verb-ing\n\n" +
                        "• I've been studying English for three years.\n" +
                        "• She's been living in Tokyo since 2019."),
                    GrammarSection("📌 تفاوت با Present Perfect ساده",
                        "• I've read the book. (تمام شد)\n" +
                        "• I've been reading the book. (ادامه دارد)"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ I've studying English. → ✅ I've been studying English.\n" +
                        "❌ I has been studying. → ✅ I have been studying.")
                ),
                conversation = listOf(
                    DialogueLine("A", "Have you noticed cultural differences here?", "تفاوت‌های فرهنگی‌ای اینجا متوجه شدی؟"),
                    DialogueLine("B", "Yes, I've been learning a lot.", "بله، دارم خیلی یاد می‌گیرم."),
                    DialogueLine("A", "What surprised you most?", "چی بیشتر تعجبت کرد؟"),
                    DialogueLine("B", "The food etiquette and table manners.", "آداب غذا خوردن و رفتار سر میز."),
                    DialogueLine("A", "How long have you been living abroad?", "چقدره خارج زندگی می‌کنی؟"),
                    DialogueLine("B", "For two years now.", "دو ساله."),
                    DialogueLine("A", "Have you experienced any culture shock?", "شوک فرهنگی تجربه کردی؟"),
                    DialogueLine("B", "Definitely. Especially in the beginning.", "قطعاً. مخصوصاً اولش."),
                    DialogueLine("A", "What helped you adapt?", "چی به سازگاری‌ت کمک کرد؟"),
                    DialogueLine("B", "Making local friends and being open-minded.", "دوست پیدا کردن با مردم محلی و ذهن باز.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Etiquette» چیست؟", listOf("فرهنگ", "آداب معاشرت", "سنت", "زبان"), 1),
                    QuizQuestion("کدام درست است؟", listOf("I've studying English.", "I've been studying English.", "I has been studying.", "I have be studying."), 1),
                    QuizQuestion("ساختار Present Perfect Continuous؟", listOf("have/has + p.p.", "have/has + been + verb-ing", "am/is/are + verb-ing", "did + verb"), 1),
                    QuizQuestion("«since» با کدام می‌آید؟", listOf("three years", "two months", "2019", "a long time"), 2),
                    QuizQuestion("معنی «Diversity» چیست؟", listOf("یکنواختی", "تنوع", "اختلاف", "شباهت"), 1),
                    QuizQuestion("کدام درست است؟", listOf("How long you been working?", "How long have you been working?", "How long you working?", "How long are you working?"), 1),
                    QuizQuestion("معنی «Stereotype» چیست؟", listOf("واقعیت", "کلیشه", "حقیقت", "داستان"), 1),
                    QuizQuestion("تفاوت Present Perfect و Continuous؟", listOf("هیچ فرقی ندارند", "Continuous ادامه دارد", "Perfect ادامه دارد", "هر دو تمام شده"), 1)
                )
            )
            2 -> LessonContent("top_notch_3", 2, "Shopping and Consumerism", "خرید و مصرف‌گرایی",
                vocabulary = listOf(
                    VocabWord("Consumer", "مصرف‌کننده", "kənˈsuːmər"), VocabWord("Brand", "برند", "brænd"),
                    VocabWord("Advertisement", "تبلیغات", "ˌædvərˈtaɪzmənt"), VocabWord("Budget", "بودجه", "ˈbʌdʒɪt"),
                    VocabWord("Impulse buying", "خرید لحظه‌ای", "ˈɪmpʌls ˈbaɪɪŋ"), VocabWord("Quality", "کیفیت", "ˈkwɑːləti"),
                    VocabWord("Warranty", "گارانتی", "ˈwɔːrənti"), VocabWord("Sustainable", "پایدار", "səˈsteɪnəbəl")
                ),
                grammar = listOf(
                    GrammarSection("📌 too + صفت/قید",
                        "خیلی زیاد (منفی):\n" +
                        "• This watch is too expensive.\n" +
                        "• He drives too fast."),
                    GrammarSection("📌 صفت + enough / not enough",
                        "• The car is small enough for the city.\n" +
                        "• This apartment is not big enough."),
                    GrammarSection("📌 تفاوت too و very",
                        "• too = بیش از حد (منفی)\n" +
                        "• very = خیلی (خنثی)"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ It's too much expensive. → ✅ It's too expensive.\n" +
                        "❌ It's enough big. → ✅ It's big enough.")
                ),
                conversation = listOf(
                    DialogueLine("A", "I've become a smart shopper recently.", "اخیراً خریدار باهوشی شده‌ام."),
                    DialogueLine("B", "What changed?", "چی عوض شد؟"),
                    DialogueLine("A", "I used to buy on impulse. Now I plan.", "قبلاً لحظه‌ای می‌خریدم. حالا برنامه‌ریزی می‌کنم."),
                    DialogueLine("B", "That's a great habit!", "عادت عالیه!"),
                    DialogueLine("A", "I've been tracking my expenses.", "هزینه‌هامو پیگیری می‌کنم."),
                    DialogueLine("B", "Do you think advertising affects us too much?", "فکر می‌کنی تبلیغات زیاد روی ما اثر می‌ذاره؟"),
                    DialogueLine("A", "Definitely. We're constantly being manipulated.", "قطعاً. مدام داریم دستکاری می‌شیم."),
                    DialogueLine("B", "So how do you avoid it?", "پس چطور ازش دوری می‌کنی؟"),
                    DialogueLine("A", "I ask myself: do I really need this?", "از خودم می‌پرسم: واقعاً لازمش دارم؟"),
                    DialogueLine("B", "I should learn from you.", "باید از تو یاد بگیرم.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Consumer» چیست؟", listOf("فروشنده", "مصرف‌کننده", "تولیدکننده", "برند"), 1),
                    QuizQuestion("کدام درست است؟", listOf("It's expensive too.", "It's too expensive.", "It's very too expensive.", "It's much expensive."), 1),
                    QuizQuestion("«enough» کجای جمله می‌آید؟", listOf("قبل از صفت", "بعد از صفت", "قبل از فعل", "بعد از حرف اضافه"), 1),
                    QuizQuestion("معنی «Impulse buying» چیست؟", listOf("خرید برنامه‌ریزی شده", "خرید لحظه‌ای", "خرید اقتصادی", "خرید آنلاین"), 1),
                    QuizQuestion("تفاوت too و very؟", listOf("هیچ فرقی ندارند", "too منفی، very خنثی", "very منفی، too خنثی", "too برای فعل"), 1),
                    QuizQuestion("کدام درست است؟", listOf("It's enough big.", "It's big enough.", "It's big too enough.", "Enough it's big."), 1),
                    QuizQuestion("معنی «Counterfeit» چیست؟", listOf("اصل", "تقلبی", "لوکس", "ارزان"), 1),
                    QuizQuestion("کدام درست است؟", listOf("She's too young.", "She's young too.", "She's very too young.", "She's too much young."), 0)
                )
            )
            3 -> LessonContent("top_notch_3", 3, "Personal Care and Appearance", "مراقبت شخصی و ظاهر",
                vocabulary = listOf(
                    VocabWord("Appearance", "ظاهر", "əˈpɪrəns"), VocabWord("Cosmetic", "آرایشی", "kɑːzˈmetɪk"),
                    VocabWord("Grooming", "آراستگی", "ˈɡruːmɪŋ"), VocabWord("Hygiene", "بهداشت", "ˈhaɪdʒiːn"),
                    VocabWord("Moisturizer", "مرطوب‌کننده", "ˈmɔɪstʃəraɪzər"), VocabWord("Sunscreen", "ضد آفتاب", "ˈsʌnskriːn"),
                    VocabWord("Makeover", "تغییر چهره", "ˈmeɪkoʊvər"), VocabWord("Confidence", "اعتماد به نفس", "ˈkɑːnfɪdəns")
                ),
                grammar = listOf(
                    GrammarSection("📌 Causative: Have / Get Something Done",
                        "have/get + مفعول + past participle\n\n" +
                        "• I had my hair cut yesterday.\n" +
                        "• She gets her nails done every week.\n" +
                        "• We had our house painted last month."),
                    GrammarSection("📌 تفاوت با ساختار عادی",
                        "• I cut my hair. (خودم)\n" +
                        "• I had my hair cut. (کسی دیگر)"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ I had cut my hair. → ✅ I had my hair cut.")
                ),
                conversation = listOf(
                    DialogueLine("A", "You look great today!", "امروز عالی به نظر می‌رسی!"),
                    DialogueLine("B", "Thanks! I had my hair cut.", "ممنون! موهامو کوتاه کردم."),
                    DialogueLine("A", "It really suits you!", "واقعاً بهت میاد!"),
                    DialogueLine("B", "I also started a new skincare routine.", "یه روتین مراقبت پوست جدید هم شروع کردم."),
                    DialogueLine("A", "What do you use?", "چی استفاده می‌کنی؟"),
                    DialogueLine("B", "Just a gentle cleanser and moisturizer.", "فقط یه شوینده ملایم و مرطوب‌کننده."),
                    DialogueLine("A", "Do you use sunscreen?", "ضدآفتاب هم استفاده می‌کنی؟"),
                    DialogueLine("B", "Every single day. It's essential.", "هر روز. ضروریه."),
                    DialogueLine("A", "I should take better care of myself.", "باید بهتر از خودم مراقبت کنم."),
                    DialogueLine("B", "Small habits make a big difference.", "عادت‌های کوچک تفاوت بزرگی می‌سازن.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Confidence» چیست؟", listOf("خجالت", "اعتماد به نفس", "غرور", "ترس"), 1),
                    QuizQuestion("کدام درست است؟", listOf("I cut my hair yesterday.", "I had my hair cut yesterday.", "I have cut hair yesterday.", "I had cut my hair."), 1),
                    QuizQuestion("ساختار Causative؟", listOf("have + verb", "have + p.p.", "have + مفعول + p.p.", "have + to verb"), 2),
                    QuizQuestion("معنی «Skincare» چیست؟", listOf("مراقبت مو", "مراقبت پوست", "آرایش", "بهداشت"), 1),
                    QuizQuestion("«She gets her nails done» یعنی؟", listOf("خودش ناخنهاش رو درست کرد", "کسی دیگر ناخنهاش رو درست کرد", "ناخن مصنوعی داره", "ناخن نداره"), 1),
                    QuizQuestion("معنی «Grooming» چیست؟", listOf("آراستگی", "بهداشت", "ورزش", "غذا"), 0),
                    QuizQuestion("کدام درست است؟", listOf("I had paint my house.", "I had my house painted.", "I had painted my house.", "I my house had painted."), 1),
                    QuizQuestion("معنی «Posture» چیست؟", listOf("وضعیت بدن", "ظاهر", "آرایش", "لباس"), 0)
                )
            )
            4 -> LessonContent("top_notch_3", 4, "Modern Technology", "تکنولوژی مدرن",
                vocabulary = listOf(
                    VocabWord("Artificial Intelligence", "هوش مصنوعی", "ˌɑːrtɪˈfɪʃəl ɪnˈtelɪdʒəns"),
                    VocabWord("Algorithm", "الگوریتم", "ˈælɡərɪðəm"),
                    VocabWord("Encryption", "رمزنگاری", "ɪnˈkrɪpʃən"),
                    VocabWord("Cybersecurity", "امنیت سایبری", "ˌsaɪbərsɪˈkjʊrəti"),
                    VocabWord("Cloud storage", "ذخیره ابری", "klaʊd ˈstɔːrɪdʒ"),
                    VocabWord("Bandwidth", "پهنای باند", "ˈbændwɪdθ"),
                    VocabWord("Interface", "رابط کاربری", "ˈɪntərfeɪs"),
                    VocabWord("Automation", "اتوماسیون", "ˌɔːtəˈmeɪʃən")
                ),
                grammar = listOf(
                    GrammarSection("📌 Modals of Deduction",
                        "• must be = قطعاً هست: The data must be encrypted.\n" +
                        "• might be = ممکنه باشه: AI might replace some jobs.\n" +
                        "• can't be = غیرممکنه: That can't be true!"),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ That must to be true. → ✅ That must be true.\n" +
                        "❌ He can't be knows. → ✅ He can't know.")
                ),
                conversation = listOf(
                    DialogueLine("A", "Will AI change our lives dramatically?", "آیا AI زندگی ما رو به‌شدت تغییر می‌ده؟"),
                    DialogueLine("B", "It must be already happening.", "قطعاً همین الان داره اتفاق میفته."),
                    DialogueLine("A", "I'm worried about cybersecurity.", "نگران امنیت سایبریم."),
                    DialogueLine("B", "Encryption must be much stronger.", "رمزنگاری باید خیلی قوی‌تر باشه."),
                    DialogueLine("A", "What about job automation?", "اتوماسیون شغل‌ها چطور؟"),
                    DialogueLine("B", "It might create new opportunities.", "ممکنه فرصت‌های جدیدی هم ایجاد کنه."),
                    DialogueLine("A", "Could AI be dangerous?", "آیا AI می‌تونه خطرناک باشه؟"),
                    DialogueLine("B", "It depends on how we use it.", "بستگی داره چطور استفاده کنیم."),
                    DialogueLine("A", "Should governments regulate it?", "دولت‌ها باید قانون‌گذاری کنن؟"),
                    DialogueLine("B", "Absolutely. It can't be left unregulated.", "قطعاً. نمی‌شه بدون قانون ولش کرد.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Encryption» چیست؟", listOf("رمزنگاری", "الگوریتم", "امنیت", "اتوماسیون"), 0),
                    QuizQuestion("کدام درست است؟", listOf("That must to be true.", "That must be true.", "That musts be true.", "That be must true."), 1),
                    QuizQuestion("«might» یعنی چه سطحی از احتمال؟", listOf("قطعاً", "ممکنه", "غیرممکن", "باید"), 1),
                    QuizQuestion("معنی «Cybersecurity» چیست؟", listOf("امنیت سایبری", "رمزنگاری", "شبکه", "الگوریتم"), 0),
                    QuizQuestion("«can't be» یعنی؟", listOf("قطعاً هست", "ممکنه باشه", "غیرممکنه باشه", "باید باشه"), 2),
                    QuizQuestion("معنی «Innovation» چیست؟", listOf("اختراع", "نوآوری", "تخریب", "کپی"), 1),
                    QuizQuestion("کدام درست است؟", listOf("He can't be knows.", "He can't know.", "He can't to know.", "He can't knowing."), 1),
                    QuizQuestion("معنی «Data breach» چیست؟", listOf("امنیت داده", "نقض داده", "ذخیره داده", "بازیابی داده"), 1)
                )
            )
            5 -> LessonContent("top_notch_3", 5, "Holidays and Celebrations", "تعطیلات و جشن‌ها",
                vocabulary = listOf(
                    VocabWord("Celebration", "جشن", "ˌselɪˈbreɪʃən"), VocabWord("Ceremony", "مراسم", "ˈserəmoʊni"),
                    VocabWord("Anniversary", "سالگرد", "ˌænɪˈvɜːrsəri"), VocabWord("Festival", "فستیوال", "ˈfestɪvəl"),
                    VocabWord("Decoration", "تزئینات", "ˌdekəˈreɪʃən"), VocabWord("Fireworks", "آتش‌بازی", "ˈfaɪərwɜːrks"),
                    VocabWord("Tradition", "سنت", "trəˈdɪʃən"), VocabWord("Gathering", "گردهمایی", "ˈɡæðərɪŋ")
                ),
                grammar = listOf(
                    GrammarSection("📌 Passive Voice (حال ساده)",
                        "is/are + p.p.\n\n" +
                        "• Nowruz is celebrated in many countries.\n" +
                        "• The gifts are opened on Christmas morning."),
                    GrammarSection("📌 Passive Voice (گذشته ساده)",
                        "was/were + p.p.\n\n" +
                        "• The party was organized by my sister.\n" +
                        "• The fireworks were set off at midnight."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ Nowruz celebrated in Iran. → ✅ Nowruz is celebrated in Iran.")
                ),
                conversation = listOf(
                    DialogueLine("A", "How is Nowruz celebrated in Iran?", "نوروز در ایران چطور جشن گرفته می‌شه؟"),
                    DialogueLine("B", "The house is cleaned before the new year.", "خونه قبل از سال نو تمیز می‌شه."),
                    DialogueLine("A", "What special food is prepared?", "چه غذای خاصی آماده می‌شه؟"),
                    DialogueLine("B", "Many dishes are cooked, like sabzi polo.", "غذاهای زیادی پخته می‌شه، مثل سبزی پلو."),
                    DialogueLine("A", "Are gifts given?", "هدیه داده می‌شه؟"),
                    DialogueLine("B", "Yes, money is usually given to children.", "بله، معمولاً به بچه‌ها پول داده می‌شه."),
                    DialogueLine("A", "What about the Haft-Seen table?", "سفره هفت‌سین چطور؟"),
                    DialogueLine("B", "It's beautifully decorated with seven symbolic items.", "با هفت آیتم نمادین زیبا تزئین می‌شه."),
                    DialogueLine("A", "That sounds fascinating!", "چه جالب!"),
                    DialogueLine("B", "It's my favorite tradition!", "محبوب‌ترین سنت منه!")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Ceremony» چیست؟", listOf("جشن", "مراسم", "فستیوال", "سالگرد"), 1),
                    QuizQuestion("کدام مجهول درست است؟", listOf("Nowruz celebrated in Iran.", "Nowruz is celebrated in Iran.", "Nowruz is celebrate in Iran.", "Nowruz celebrating in Iran."), 1),
                    QuizQuestion("ساختار مجهول حال ساده؟", listOf("is/are + verb", "is/are + p.p.", "has/have + p.p.", "was/were + p.p."), 1),
                    QuizQuestion("معنی «Commemorate» چیست؟", listOf("جشن گرفتن", "گرامی داشتن", "فراموش کردن", "تزئین کردن"), 1),
                    QuizQuestion("«The party was organized» یعنی؟", listOf("مهمانی برگزار کرد", "مهمانی برگزار شد", "مهمانی برگزار می‌شود", "مهمانی برگزار خواهد شد"), 1),
                    QuizQuestion("معنی «Feast» چیست؟", listOf("روزه", "ضیافت", "جشن", "رژه"), 1),
                    QuizQuestion("کدام درست است؟", listOf("Gifts was exchanged.", "Gifts were exchanged.", "Gifts exchange.", "Gifts exchanging."), 1),
                    QuizQuestion("معنی «Parade» چیست؟", listOf("ضیافت", "رژه", "آتش‌بازی", "تزئین"), 1)
                )
            )
            6 -> LessonContent("top_notch_3", 6, "Eating Well", "تغذیه سالم",
                vocabulary = listOf(
                    VocabWord("Nutrition", "تغذیه", "nuˈtrɪʃən"), VocabWord("Calorie", "کالری", "ˈkæləri"),
                    VocabWord("Protein", "پروتئین", "ˈproʊtiːn"), VocabWord("Carbohydrate", "کربوهیدرات", "ˌkɑːrboʊˈhaɪdreɪt"),
                    VocabWord("Balanced diet", "رژیم متعادل", "ˈbælənst ˈdaɪət"), VocabWord("Organic", "ارگانیک", "ɔːrˈɡænɪk"),
                    VocabWord("Processed food", "غذای فرآوری‌شده", "ˈprɑːsest fuːd"), VocabWord("Portion", "سهم", "ˈpɔːrʃən")
                ),
                grammar = listOf(
                    GrammarSection("📌 Quantifiers",
                        "• a few + اسم قابل شمارش: I eat a few vegetables.\n" +
                        "• a little + اسم غیرقابل شمارش: She drinks a little coffee.\n" +
                        "• a lot of + هر دو: They consume a lot of processed food."),
                    GrammarSection("📌 few / little (بدون a) = منفی",
                        "• Few people eat a balanced diet.\n" +
                        "• He has little time."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ I eat a little vegetables. → ✅ I eat a few vegetables.")
                ),
                conversation = listOf(
                    DialogueLine("A", "I'm trying to eat healthier these days.", "این روزها سعی می‌کنم سالم‌تر بخورم."),
                    DialogueLine("B", "What changes have you made?", "چه تغییراتی دادی؟"),
                    DialogueLine("A", "I eat a lot of vegetables and a little red meat.", "سبزیجات زیاد و کمی گوشت قرمز می‌خورم."),
                    DialogueLine("B", "Do you count calories?", "کالری می‌شمری؟"),
                    DialogueLine("A", "No, but I watch my portions.", "نه، ولی مراقب سهم‌هام هستم."),
                    DialogueLine("B", "That's smart. Do you eat organic food?", "باهوشه. غذای ارگانیک می‌خوری؟"),
                    DialogueLine("A", "When I can. It's expensive though.", "وقتی بتونم. ولی گرونه."),
                    DialogueLine("B", "Do you take any supplements?", "مکمل مصرف می‌کنی؟"),
                    DialogueLine("A", "Just vitamin D in winter.", "فقط ویتامین D در زمستان."),
                    DialogueLine("B", "A balanced diet is the key.", "رژیم متعادل کلیدیه.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Balanced diet» چیست؟", listOf("رژیم سخت", "رژیم متعادل", "غذای ارگانیک", "کالری"), 1),
                    QuizQuestion("کدام درست است؟", listOf("I eat a little vegetables.", "I eat a few vegetables.", "I eat few vegetables.", "I eat little vegetables."), 1),
                    QuizQuestion("«a few» با کدام می‌آید؟", listOf("غیرقابل شمارش", "قابل شمارش", "فعل", "صفت"), 1),
                    QuizQuestion("معنی «Portion» چیست؟", listOf("کالری", "سهم", "ویتامین", "پروتئین"), 1),
                    QuizQuestion("«a little» با کدام می‌آید؟", listOf("قابل شمارش", "غیرقابل شمارش", "فعل", "قید"), 1),
                    QuizQuestion("معنی «Metabolism» چیست؟", listOf("سوخت‌وساز", "هضم", "تنفس", "گردش خون"), 0),
                    QuizQuestion("تفاوت few و a few؟", listOf("هیچ فرقی ندارند", "few منفی، a few مثبت", "a few منفی", "few برای غیرقابل شمارش"), 1),
                    QuizQuestion("معنی «Supplements» چیست؟", listOf("غذا", "مکمل‌ها", "دارو", "ویتامین"), 1)
                )
            )
            7 -> LessonContent("top_notch_3", 7, "About the Environment", "محیط زیست",
                vocabulary = listOf(
                    VocabWord("Climate change", "تغییرات اقلیمی", "ˈklaɪmət tʃeɪndʒ"), VocabWord("Carbon footprint", "ردپای کربنی", "ˈkɑːrbən ˈfʊtprɪnt"),
                    VocabWord("Renewable energy", "انرژی تجدیدپذیر", "rɪˈnuːəbəl ˈenərdʒi"), VocabWord("Deforestation", "جنگل‌زدایی", "ˌdiːˌfɔːrɪˈsteɪʃən"),
                    VocabWord("Emissions", "انتشار گازها", "ɪˈmɪʃənz"), VocabWord("Conservation", "حفاظت", "ˌkɑːnsərˈveɪʃən"),
                    VocabWord("Ecosystem", "اکوسیستم", "ˈiːkoʊsɪstəm"), VocabWord("Biodiversity", "تنوع زیستی", "ˌbaɪoʊdaɪˈvɜːrsəti")
                ),
                grammar = listOf(
                    GrammarSection("📌 Third Conditional",
                        "If + had + p.p., would have + p.p.\n\n" +
                        "• If we had acted sooner, we would have prevented the damage.\n" +
                        "• If governments had invested in renewable energy, emissions would have decreased."),
                    GrammarSection("📌 تفاوت شرطی‌ها",
                        "• نوع ۱: If it rains, I will stay home.\n" +
                        "• نوع ۲: If I were rich, I would travel.\n" +
                        "• نوع ۳: If I had studied, I would have passed."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ If I would have known, I would have helped. → ✅ If I had known, I would have helped.")
                ),
                conversation = listOf(
                    DialogueLine("A", "What's the biggest environmental challenge?", "بزرگ‌ترین چالش زیست‌محیطی چیه؟"),
                    DialogueLine("B", "Climate change, without a doubt.", "تغییرات اقلیمی، بدون شک."),
                    DialogueLine("A", "If we had started earlier, what would have happened?", "اگه زودتر شروع کرده بودیم، چی می‌شد؟"),
                    DialogueLine("B", "We would have slowed it down significantly.", "خیلی کندش کرده بودیم."),
                    DialogueLine("A", "What can we do now?", "الان چیکار می‌تونیم بکنیم؟"),
                    DialogueLine("B", "Reduce our carbon footprint and use renewable energy.", "ردپای کربنیمون رو کم کنیم و از انرژی تجدیدپذیر استفاده کنیم."),
                    DialogueLine("A", "Do you think it's too late?", "فکر می‌کنی خیلی دیره؟"),
                    DialogueLine("B", "It's never too late to make a difference.", "هرگز برای ایجاد تفاوت دیر نیست."),
                    DialogueLine("A", "I'll start recycling more.", "منم بازیافت رو بیشتر می‌کنم."),
                    DialogueLine("B", "Every small action counts.", "هر اقدام کوچکی مهمه.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Renewable energy» چیست؟", listOf("انرژی فسیلی", "انرژی تجدیدپذیر", "آلودگی", "حفاظت"), 1),
                    QuizQuestion("کدام درست است؟", listOf("If we acted, we would have prevented.", "If we had acted, we would have prevented.", "If we had acted, we prevent.", "If we act, we would prevent."), 1),
                    QuizQuestion("ساختار شرطی نوع سوم؟", listOf("If + present, will + verb", "If + past, would + verb", "If + had + p.p., would have + p.p.", "If + present, would + verb"), 2),
                    QuizQuestion("معنی «Deforestation» چیست؟", listOf("جنگل‌کاری", "جنگل‌زدایی", "کشاورزی", "آبیاری"), 1),
                    QuizQuestion("کدام درست است؟", listOf("If I would have known, I would have helped.", "If I had known, I would have helped.", "If I knew, I would help.", "If I know, I will help."), 1),
                    QuizQuestion("معنی «Biodiversity» چیست؟", listOf("تنوع زیستی", "آلودگی", "جنگل‌زدایی", "گرمایش"), 0),
                    QuizQuestion("معنی «Carbon footprint» چیست؟", listOf("گاز کربن", "ردپای کربنی", "سوخت فسیلی", "آلودگی هوا"), 1),
                    QuizQuestion("«If I had studied» یعنی چه زمانی؟", listOf("حال", "آینده", "گذشته", "همیشه"), 2)
                )
            )
            8 -> LessonContent("top_notch_3", 8, "Education and Learning", "آموزش و یادگیری",
                vocabulary = listOf(
                    VocabWord("Curriculum", "برنامه درسی", "kəˈrɪkjələm"), VocabWord("Scholarship", "بورسیه", "ˈskɑːlərʃɪp"),
                    VocabWord("Degree", "مدرک", "dɪˈɡriː"), VocabWord("Lecture", "سخنرانی", "ˈlektʃər"),
                    VocabWord("Assignment", "تکلیف", "əˈsaɪnmənt"), VocabWord("Seminar", "سمینار", "ˈsemɪnɑːr"),
                    VocabWord("Dissertation", "پایان‌نامه", "ˌdɪsərˈteɪʃən"), VocabWord("Critical thinking", "تفکر انتقادی", "ˈkrɪtɪkəl ˈθɪŋkɪŋ")
                ),
                grammar = listOf(
                    GrammarSection("📌 Wish + Past Perfect",
                        "آرزو در مورد گذشته (پشیمانی):\n" +
                        "• I wish I had studied harder.\n" +
                        "• I wish I hadn't quit."),
                    GrammarSection("📌 Wish + Past Simple",
                        "آرزو در مورد حال:\n" +
                        "• I wish I spoke French.\n" +
                        "• I wish I were rich."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ I wish I studied harder. → ✅ I wish I had studied harder.\n" +
                        "❌ I wish I would have studied. → ✅ I wish I had studied.")
                ),
                conversation = listOf(
                    DialogueLine("A", "Any regrets about your education?", "پشیمانی‌ای از تحصیلاتت داری؟"),
                    DialogueLine("B", "I wish I had studied abroad.", "کاش خارج درس خوانده بودم."),
                    DialogueLine("A", "Why didn't you?", "چرا نخوندی؟"),
                    DialogueLine("B", "I didn't have enough money for tuition.", "شهریه‌اش رو نداشتم."),
                    DialogueLine("A", "Could you have gotten a scholarship?", "می‌تونستی بورسیه بگیری؟"),
                    DialogueLine("B", "I wish I had applied for one.", "کاش برای یکی درخواست داده بودم."),
                    DialogueLine("A", "It's never too late to learn.", "هرگز برای یادگیری دیر نیست."),
                    DialogueLine("B", "You're right. I could still take online courses.", "حق داری. هنوز می‌تونم دوره‌های آنلاین بگیرم."),
                    DialogueLine("A", "That's the spirit!", "همین روحیه رو دوست دارم!"),
                    DialogueLine("B", "Better late than never.", "دیر رسیدن بهتر از هرگز نرسیدنه.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Critical thinking» چیست؟", listOf("تفکر ساده", "تفکر انتقادی", "حفظ کردن", "نوشتن"), 1),
                    QuizQuestion("کدام درست است؟", listOf("I wish I studied harder.", "I wish I had studied harder.", "I wish I study harder.", "I wish I will study."), 1),
                    QuizQuestion("«Wish + Past Perfect» برای چه زمانی؟", listOf("حال", "آینده", "گذشته", "همیشه"), 2),
                    QuizQuestion("معنی «Scholarship» چیست؟", listOf("شهریه", "بورسیه", "مدرک", "دانشگاه"), 1),
                    QuizQuestion("کدام درست است؟", listOf("I wish I would have studied.", "I wish I had studied.", "I wish I study.", "I wish I will study."), 1),
                    QuizQuestion("معنی «Dissertation» چیست؟", listOf("تکلیف", "پایان‌نامه", "سخنرانی", "سمینار"), 1),
                    QuizQuestion("«I wish I spoke French» یعنی؟", listOf("کاش فرانسه صحبت می‌کردم (حال)", "کاش فرانسه صحبت کرده بودم (گذشته)", "فرانسه صحبت می‌کنم", "فرانسه یاد خواهم گرفت"), 0),
                    QuizQuestion("معنی «Tuition» چیست؟", listOf("بورسیه", "شهریه", "مدرک", "کلاس"), 1)
                )
            )
            9 -> LessonContent("top_notch_3", 9, "Jobs and Careers", "شغل‌ها و حرفه‌ها",
                vocabulary = listOf(
                    VocabWord("Entrepreneur", "کارآفرین", "ˌɑːntrəprəˈnɜːr"),
                    VocabWord("Freelancer", "فریلنسر", "ˈfriːlænsər"),
                    VocabWord("Networking", "شبکه‌سازی", "ˈnetwɜːrkɪŋ"),
                    VocabWord("Interview", "مصاحبه", "ˈɪntərvjuː"),
                    VocabWord("Resume", "رزومه", "ˈrezəmeɪ"),
                    VocabWord("Salary", "حقوق", "ˈsæləri"),
                    VocabWord("Promotion", "ترفیع", "prəˈmoʊʃən"),
                    VocabWord("Work-life balance", "تعادل کار و زندگی", "wɜːrk laɪf ˈbæləns")
                ),
                grammar = listOf(
                    GrammarSection("📌 Relative Clauses",
                        "• who برای افراد: She's the manager who hired me.\n" +
                        "• which / that برای اشیا: That's the job which I applied for.\n" +
                        "• whose برای مالکیت: He's the colleague whose advice helped me."),
                    GrammarSection("📌 Defining vs Non-defining",
                        "• Defining (ضروری): The man who called is my boss.\n" +
                        "• Non-defining (اضافی): Mr. Smith, who is my boss, called."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ She's the manager which hired me. → ✅ She's the manager who hired me.")
                ),
                conversation = listOf(
                    DialogueLine("A", "What career path do you want to follow?", "چه مسیر شغلی می‌خوای دنبال کنی؟"),
                    DialogueLine("B", "I want to be an entrepreneur who builds startups.", "می‌خوام کارآفرینی باشم که استارتاپ می‌سازه."),
                    DialogueLine("A", "Do you have a mentor?", "مربی داری؟"),
                    DialogueLine("B", "Yes, a businessman whose company went global.", "بله، تاجری که شرکتش جهانی شد."),
                    DialogueLine("A", "How important is networking?", "شبکه‌سازی چقدر مهمه؟"),
                    DialogueLine("B", "It's the key to success.", "کلید موفقیته."),
                    DialogueLine("A", "What about work-life balance?", "تعادل کار و زندگی چطور؟"),
                    DialogueLine("B", "It's essential to avoid burnout.", "برای جلوگیری از فرسودگی ضروریه."),
                    DialogueLine("A", "Any advice for negotiation?", "برای مذاکره توصیه‌ای داری؟"),
                    DialogueLine("B", "Know your value and don't be afraid to ask.", "ارزشت رو بدون و از پرسیدن نترس.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Entrepreneur» چیست؟", listOf("کارمند", "کارآفرین", "مدیر", "فریلنسر"), 1),
                    QuizQuestion("کدام درست است؟", listOf("She's the manager who hired me.", "She's the manager which hired me.", "She's the manager whose hired me.", "She's the manager what hired me."), 0),
                    QuizQuestion("«whose» برای چه استفاده می‌شود؟", listOf("افراد", "اشیا", "مالکیت", "زمان"), 2),
                    QuizQuestion("معنی «Mentor» چیست؟", listOf("شاگرد", "مربی", "مدیر", "همکار"), 1),
                    QuizQuestion("کدام درست است؟", listOf("This is the job which I applied.", "This is the job which I applied for.", "This is the job who I applied.", "This is the job what I applied."), 1),
                    QuizQuestion("معنی «Work-life balance» چیست؟", listOf("تعادل کار و زندگی", "کار تمام وقت", "استراحت", "تعطیلات"), 0),
                    QuizQuestion("«who» برای چه استفاده می‌شود؟", listOf("اشیا", "افراد", "مکان", "زمان"), 1),
                    QuizQuestion("معنی «Burnout» چیست؟", listOf("موفقیت", "فرسودگی شغلی", "ترفیع", "استعفا"), 1)
                )
            )
            10 -> LessonContent("top_notch_3", 10, "Life Changes", "تغییرات زندگی",
                vocabulary = listOf(
                    VocabWord("Transition", "گذار", "trænˈzɪʃən"),
                    VocabWord("Milestone", "نقطه عطف", "ˈmaɪlstoʊn"),
                    VocabWord("Adapt", "سازگار شدن", "əˈdæpt"),
                    VocabWord("Overcome", "غلبه کردن", "ˌoʊvərˈkʌm"),
                    VocabWord("Significant", "قابل توجه", "sɪɡˈnɪfɪkənt"),
                    VocabWord("Challenge", "چالش", "ˈtʃælɪndʒ"),
                    VocabWord("Growth", "رشد", "ɡroʊθ"),
                    VocabWord("Perspective", "چشم‌انداز", "pərˈspektɪv")
                ),
                grammar = listOf(
                    GrammarSection("📌 Cleft Sentences for Emphasis",
                        "• It-cleft: It is/was + ... that/who ...\n" +
                        "  It was the birth of my child that changed me.\n" +
                        "  It is challenges that make us stronger.\n\n" +
                        "• Wh-cleft: What + clause + is/was ...\n" +
                        "  What I value most is family."),
                    GrammarSection("❌ اشتباهات رایج",
                        "❌ It challenges that make us stronger. → ✅ It is challenges that make us stronger.\n" +
                        "❌ What I value most family is. → ✅ What I value most is family.")
                ),
                conversation = listOf(
                    DialogueLine("A", "What was a significant milestone in your life?", "نقطه عطف مهم زندگی‌ت چی بود؟"),
                    DialogueLine("B", "It was moving abroad that changed my perspective.", "مهاجرت بود که چشم‌اندازم رو تغییر داد."),
                    DialogueLine("A", "How did you adapt?", "چطور سازگار شدی؟"),
                    DialogueLine("B", "I overcame it step by step.", "قدم به قدم غلبه کردم."),
                    DialogueLine("A", "What would you tell others?", "به دیگران چی می‌گی؟"),
                    DialogueLine("B", "What matters most is resilience.", "چیزی که مهمه تاب‌آوریه."),
                    DialogueLine("A", "Did you ever feel like giving up?", "حس کردی می‌خوای تسلیم بشی؟"),
                    DialogueLine("B", "Many times. But what kept me going was hope.", "خیلی وقت‌ها. ولی چیزی که منو جلو برد امید بود."),
                    DialogueLine("A", "You've grown so much!", "خیلی رشد کردی!"),
                    DialogueLine("B", "Growth comes from discomfort.", "رشد از ناراحتی میاد.")
                ),
                quiz = listOf(
                    QuizQuestion("معنی «Transition» چیست؟", listOf("توقف", "گذار", "شروع", "پایان"), 1),
                    QuizQuestion("کدام cleft درست است؟", listOf("It challenges that make us stronger.", "It is challenges that make us stronger.", "Challenges is that make us stronger.", "It that challenges make us stronger."), 1),
                    QuizQuestion("معنی «Overcome» چیست؟", listOf("شکست خوردن", "غلبه کردن", "فرار کردن", "تسلیم شدن"), 1),
                    QuizQuestion("ساختار It-cleft؟", listOf("It + is/was + ... + that/who", "What + verb + is", "It + verb + that", "That + it + is"), 0),
                    QuizQuestion("معنی «Resilience» چیست؟", listOf("ضعف", "تاب‌آوری", "ترس", "خستگی"), 1),
                    QuizQuestion("«What I value most is family» یعنی؟", listOf("چیزی که بیشتر ارزشش رو دارم خانواده‌ست", "خانواده‌ام چیه؟", "خانواده ارزش داره", "من خانواده رو دوست دارم"), 0),
                    QuizQuestion("معنی «Embrace» چیست؟", listOf("رد کردن", "پذیرفتن", "ترک کردن", "فراموش کردن"), 1),
                    QuizQuestion("معنی «Wisdom» چیست؟", listOf("ثروت", "خرد", "قدرت", "جوانی"), 1)
                )
            )

            else -> getDefaultContent("top_notch_3", chapter)
        }
    }

    // ==================== Default Content ====================
    private fun getDefaultContent(bookId: String, chapter: Int): LessonContent {
        return LessonContent(
            bookId = bookId,
            chapterNumber = chapter,
            title = "Coming Soon",
            titlePersian = "به زودی...",
            vocabulary = emptyList(),
            grammar = emptyList(),
            conversation = emptyList(),
            quiz = emptyList()
        )
    }
}