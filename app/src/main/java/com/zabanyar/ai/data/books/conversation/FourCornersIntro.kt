package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCornersIntro {

    const val BOOK_ID = "four_corners_intro"

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
    // CHAPTER 1 — Hello!
    // ═══════════════════════════════════════════════════════════
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Hello!",
            titlePersian = "سلام!",
            objectives = listOf(
                "Introduce yourself",
                "Ask and answer basic personal questions",
                "Use the verb be with I, you, he, she",
                "Say where you are from",
                "Spell names and simple words"
            ),
            vocabulary = listOf(
                VocabWord("name", "نام", "/neɪm/", "noun",
                    "My name is Sara.", "اسم من سارا است."),
                VocabWord("first name", "نام کوچک", "/ˌfɜːrst ˈneɪm/", "noun",
                    "My first name is Ali.", "نام کوچک من علی است."),
                VocabWord("last name", "نام خانوادگی", "/ˌlæst ˈneɪm/", "noun",
                    "My last name is Smith.", "نام خانوادگی من اسمیت است."),
                VocabWord("country", "کشور", "/ˈkʌntri/", "noun",
                    "Iran is my country.", "ایران کشور من است."),
                VocabWord("city", "شهر", "/ˈsɪti/", "noun",
                    "I live in a small city.", "در شهر کوچکی زندگی می‌کنم."),
                VocabWord("student", "دانش‌آموز", "/ˈstuːdənt/", "noun",
                    "I am a student.", "دانش‌آموز هستم."),
                VocabWord("teacher", "معلم", "/ˈtiːtʃər/", "noun",
                    "She is an English teacher.", "او معلم انگلیسی است."),
                VocabWord("friend", "دوست", "/frend/", "noun",
                    "He is my new friend.", "او دوست جدید من است."),
                VocabWord("from", "از", "/frəm/", "preposition",
                    "I am from Azerbaijan.", "اهل آذربایجان هستم."),
                VocabWord("welcome", "خوش آمدید", "/ˈwelkəm/", "expression",
                    "Welcome to our class!", "به کلاس ما خوش آمدید!"),
                VocabWord("nice", "خوب", "/naɪs/", "adjective",
                    "Nice to meet you.", "از آشنایی خوشحالم."),
                VocabWord("meet", "ملاقات کردن", "/miːt/", "verb",
                    "It's nice to meet you.", "از آشنایی با شما خوشحالم.")
            ),
            idioms = listOf(
                IdiomExpression("Nice to meet you.", "از آشنایی با شما خوشحالم.",
                    "Hello, I'm David. Nice to meet you.",
                    "سلام، من دیوید هستم. از آشنایی خوشحالم.", "polite"),
                IdiomExpression("See you later.", "بعداً می‌بینمت.",
                    "Goodbye! See you later.",
                    "خداحافظ! بعداً می‌بینمت.", "informal"),
                IdiomExpression("How are you?", "حالت چطوره؟",
                    "Hello! How are you?",
                    "سلام! حالت چطوره؟", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("I'm",
                    "I'm شکل کوتاه I am است: /aɪm/."),
                PronunciationTip("You're",
                    "You're شکل کوتاه you are است و نباید با your اشتباه گرفته شود."),
                PronunciationTip("Spelling",
                    "برای هجی کردن حروف را واضح تلفظ کن: A-L-I.")
            ),
            culturalNotes = listOf(
                CulturalNote("First meetings",
                    "در غرب، Nice to meet you عبارت رایج و مؤدبانه است."),
                CulturalNote("First name and last name",
                    "first name = نام کوچک، last name = نام خانوادگی.")
            ),
            grammar = listOf(
                GrammarSection("Verb Be: I am",
                    """
                        I am Ali.
                        I am a student.
                        I am from Iran.

                        I am → I'm
                    """.trimIndent()),
                GrammarSection("Verb Be: You are",
                    """
                        You are a student.
                        You are from Turkey.

                        You are → You're
                    """.trimIndent()),
                GrammarSection("He and She",
                    """
                        He is Ali. / He's a student.
                        She is Sara. / She's a teacher.
                    """.trimIndent()),
                GrammarSection("Basic Questions",
                    """
                        What's your name? — My name is Reza.
                        Where are you from? — I'm from Iran.
                        Are you a student? — Yes, I am.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I is a student.", "I am a student.", "با I همیشه am."),
                CommonMistake("You is from Iran.", "You are from Iran.", "با you از are."),
                CommonMistake("She are a teacher.", "She is a teacher.", "با she از is."),
                CommonMistake("Where you are from?", "Where are you from?", "فعل قبل از فاعل."),
                CommonMistake("Nice meet you.", "Nice to meet you.", "to لازم است.")
            ),
            conversation = listOf(
                DialogueLine("Teacher", "Good morning, everyone. Welcome to the English class.",
                    "صبح بخیر، همه. به کلاس انگلیسی خوش آمدید."),
                DialogueLine("Ali", "Good morning.",
                    "صبح بخیر."),
                DialogueLine("Teacher", "Let's start by introducing ourselves. What's your name?",
                    "بیایید با معرفی خودمان شروع کنیم. اسمت چیست؟"),
                DialogueLine("Ali", "My name is Ali.",
                    "اسم من علی است."),
                DialogueLine("Teacher", "Nice to meet you, Ali. Where are you from?",
                    "از آشنایی با تو خوشحالم، علی. اهل کجایی؟"),
                DialogueLine("Ali", "I'm from Iran.",
                    "من اهل ایران هستم."),
                DialogueLine("Teacher", "Are you a student?",
                    "دانشجو هستی؟"),
                DialogueLine("Ali", "Yes, I am. I'm a university student.",
                    "بله. من دانشجو هستم."),
                DialogueLine("Teacher", "Great. Please meet Sara. She's also a student.",
                    "عالی. با سارا آشنا شو. او هم دانشجو است."),
                DialogueLine("Sara", "Hi, Ali. I'm Sara.",
                    "سلام علی. من سارا هستم."),
                DialogueLine("Ali", "Hi, Sara. Nice to meet you.",
                    "سلام سارا. از آشنایی خوشحالم."),
                DialogueLine("Sara", "Nice to meet you, too. How are you?",
                    "من هم خوشحال شدم. حالت چطوره؟"),
                DialogueLine("Ali", "I'm fine, thanks. And you?",
                    "خوبم، ممنون. تو چطور؟"),
                DialogueLine("Sara", "I'm fine too. Where are you from?",
                    "من هم خوبم. اهل کجایی؟"),
                DialogueLine("Ali", "I'm from Iran. And you?",
                    "اهل ایرانم. تو چطور؟"),
                DialogueLine("Sara", "I'm from Turkey.",
                    "اهل ترکیه‌ام."),
                DialogueLine("Teacher", "Excellent, everyone. Now let's practice spelling.",
                    "عالی، همه. حالا هجی کردن را تمرین کنیم."),
                DialogueLine("Teacher", "Ali, how do you spell your name?",
                    "علی، اسمت رو چطور هجی می‌کنی؟"),
                DialogueLine("Ali", "A-L-I.",
                    "الف-لام-ی."),
                DialogueLine("Teacher", "Perfect. See you later!",
                    "عالی. بعداً می‌بینمت!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("علی اهل کجاست؟", "اهل ایران."),
                ComprehensionQuestion("علی چه وضعیتی دارد؟", "دانشجو است."),
                ComprehensionQuestion("سارا اهل کجاست؟", "اهل ترکیه."),
                ComprehensionQuestion("علی اسمش را چطور هجی می‌کند؟", "A-L-I.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Introduce yourself.",
                    "خودت رو معرفی کن.",
                    "I'm... / I'm from... / I'm a student."),
                SpeakingTask("Ask a partner basic questions.",
                    "از یک دوست سوالات ساده بپرس.",
                    "What's your name? / Where are you from?")
            ),
            writingTasks = listOf(
                WritingTask("Write a short self-introduction.",
                    "یک معرفی کوتاه بنویس.",
                    60,
                    "Name, city, country, student/job.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ a student.",
                    listOf("is", "are", "am", "be"), 2),
                QuizQuestion("Complete: She ___ a teacher.",
                    listOf("am", "are", "is", "be"), 2),
                QuizQuestion("Choose the correct question.",
                    listOf("What your name?", "What's your name?", "What are your name?", "What name you?"), 1),
                QuizQuestion("Complete: They ___ students.",
                    listOf("is", "am", "are", "be"), 2),
                QuizQuestion("Complete: I'm ___ Iran.",
                    listOf("of", "from", "at", "in"), 1),
                QuizQuestion("What does 'friend' mean?",
                    listOf("معلم", "دوست", "دانش‌آموز", "کشور"), 1),
                QuizQuestion("Complete: Nice to ___ you.",
                    listOf("meet", "meets", "meeting", "met"), 0),
                QuizQuestion("Complete: ___ she a student?",
                    listOf("Am", "Are", "Is", "Be"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 2 — My Class
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "My Class",
            titlePersian = "کلاس من",
            objectives = listOf(
                "Talk about your classroom",
                "Use this/that and these/those",
                "Use possessive adjectives",
                "Name classroom objects"
            ),
            vocabulary = listOf(
                VocabWord("classroom", "کلاس درس", "/ˈklæsruːm/", "noun",
                    "Our classroom is big.", "کلاس ما بزرگ است."),
                VocabWord("book", "کتاب", "/bʊk/", "noun",
                    "This is my book.", "این کتاب من است."),
                VocabWord("pen", "خودکار", "/pen/", "noun",
                    "I need a pen.", "خودکار لازم دارم."),
                VocabWord("pencil", "مداد", "/ˈpensəl/", "noun",
                    "Where is my pencil?", "مدادم کجاست؟"),
                VocabWord("desk", "میز", "/desk/", "noun",
                    "The book is on the desk.", "کتاب روی میز است."),
                VocabWord("chair", "صندلی", "/tʃer/", "noun",
                    "Please sit on the chair.", "لطفاً روی صندلی بنشین."),
                VocabWord("board", "تخته", "/bɔːrd/", "noun",
                    "Look at the board.", "به تخته نگاه کن."),
                VocabWord("notebook", "دفتر", "/ˈnoʊtbʊk/", "noun",
                    "Open your notebook.", "دفترت را باز کن."),
                VocabWord("door", "در", "/dɔːr/", "noun",
                    "Close the door, please.", "لطفاً در را ببند."),
                VocabWord("window", "پنجره", "/ˈwɪndoʊ/", "noun",
                    "Open the window.", "پنجره را باز کن."),
                VocabWord("eraser", "پاک‌کن", "/ɪˈreɪsər/", "noun",
                    "Can I borrow your eraser?", "می‌تونم پاک‌کن تو قرض بگیرم؟"),
                VocabWord("bag", "کیف", "/bæɡ/", "noun",
                    "My bag is heavy.", "کیفم سنگین است.")
            ),
            idioms = listOf(
                IdiomExpression("Excuse me", "ببخشید",
                    "Excuse me, is this your book?",
                    "ببخشید، این کتاب توئه؟", "polite"),
                IdiomExpression("Thank you", "ممنون",
                    "Thank you for your help.",
                    "ممنون از کمکت.", "neutral"),
                IdiomExpression("You're welcome", "خواهش می‌کنم",
                    "Thank you! — You're welcome.",
                    "ممنون! — خواهش می‌کنم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("this / that",
                    "this /ðɪs/، that /ðæt/ — هر دو با /ð/."),
                PronunciationTip("these / those",
                    "these /ðiːz/، those /ðoʊz/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Classroom language",
                    "در کلاس، استفاده از please و thank you مهم است."),
                CulturalNote("Asking politely",
                    "Can I...? و Could I...? ساختارهای مؤدبانه‌اند.")
            ),
            grammar = listOf(
                GrammarSection("This / That / These / Those",
                    """
                        this = این (نزدیک، مفرد)
                        that = آن (دور، مفرد)
                        these = این‌ها (نزدیک، جمع)
                        those = آن‌ها (دور، جمع)

                        This is my book.
                        Those are your pens.
                    """.trimIndent()),
                GrammarSection("Possessive adjectives",
                    """
                        my / your / his / her / our / their

                        This is my desk.
                        That is your chair.
                        Her book is on the table.
                    """.trimIndent()),
                GrammarSection("Questions with be",
                    """
                        Is this your book? — Yes, it is. / No, it isn't.
                        Are these your pens? — Yes, they are.
                    """.trimIndent()),
                GrammarSection("Plural nouns",
                    """
                        book → books
                        pen → pens
                        desk → desks
                        chair → chairs
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("This are my books.", "These are my books.", "جمع با these."),
                CommonMistake("That are my pens.", "Those are my pens.", "جمع دور با those."),
                CommonMistake("This is my bag?", "Is this my bag?", "سؤال با جابه‌جایی فعل."),
                CommonMistake("Her name is Ali. His book.", "Her name is Sara. His book is here.",
                    "his برای مذکر، her برای مؤنث.")
            ),
            conversation = listOf(
                DialogueLine("A", "Hello! Is this your book?",
                    "سلام! این کتاب توئه؟"),
                DialogueLine("B", "Yes, it is. Thank you!",
                    "بله. ممنون!"),
                DialogueLine("A", "You're welcome. What's your name?",
                    "خواهش می‌کنم. اسمت چیه؟"),
                DialogueLine("B", "My name is Reza. And you?",
                    "اسم من رضاست. تو چطور؟"),
                DialogueLine("A", "I'm Mina. Nice to meet you.",
                    "من مینا هستم. از آشنایی خوشحالم."),
                DialogueLine("B", "Nice to meet you, too.",
                    "من هم خوشحال شدم."),
                DialogueLine("A", "Is that your bag?",
                    "اون کیف توئه؟"),
                DialogueLine("B", "No, it isn't. My bag is over there.",
                    "نه. کیف من اونجاست."),
                DialogueLine("A", "Are these your pencils?",
                    "این مدادها مال توئه؟"),
                DialogueLine("B", "Yes, they are.",
                    "بله."),
                DialogueLine("A", "Where is our teacher?",
                    "معلممون کجاست؟"),
                DialogueLine("B", "She's at the board.",
                    "او کنار تخته است."),
                DialogueLine("A", "Let's sit down. Class is starting.",
                    "بیا بشینیم. کلاس داره شروع می‌شه."),
                DialogueLine("B", "Good idea.",
                    "فکر خوبیه."),
                DialogueLine("A", "Do you have your notebook?",
                    "دفترت رو داری؟"),
                DialogueLine("B", "Yes, and my pen and eraser too.",
                    "بله، و خودکار و پاک‌کنم هم."),
                DialogueLine("A", "Perfect. Let's learn English!",
                    "عالی. بیا انگلیسی یاد بگیریم!"),
                DialogueLine("B", "Yes, let's go!",
                    "بله، بزن بریم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("کتاب چه کسی است؟", "کتاب Reza."),
                ComprehensionQuestion("کیف Reza کجاست؟", "آن طرف."),
                ComprehensionQuestion("معلم کجاست؟", "کنار تخته."),
                ComprehensionQuestion("Reza چه چیزهایی دارد؟", "دفتر، خودکار و پاک‌کن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Name classroom objects.",
                    "اسم اشیاء کلاس رو بگو.",
                    "This is a book. / These are pens."),
                SpeakingTask("Ask about possessions.",
                    "درباره مالکیت بپرس.",
                    "Is this your...? / Are these your...?")
            ),
            writingTasks = listOf(
                WritingTask("Describe your classroom.",
                    "کلاس درس خودت رو توصیف کن.",
                    80,
                    "Use this/these/that/those.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: ___ is my book.",
                    listOf("This", "These", "Those", "Them"), 0),
                QuizQuestion("Complete: ___ are my pens.",
                    listOf("This", "That", "These", "It"), 2),
                QuizQuestion("Complete: That is ___ chair.",
                    listOf("I", "my", "me", "mine"), 1),
                QuizQuestion("What does 'desk' mean?",
                    listOf("صندلی", "میز", "کتاب", "پنجره"), 1),
                QuizQuestion("Complete: Is this ___ book?",
                    listOf("you", "your", "yours", "yours'"), 1),
                QuizQuestion("Complete: ___ are your pencils.",
                    listOf("This", "That", "Those", "Them"), 2),
                QuizQuestion("Complete: Open the ___.",
                    listOf("door", "dress", "dish", "dollar"), 0),
                QuizQuestion("Complete: ___ she your teacher?",
                    listOf("Am", "Is", "Are", "Be"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 3 — Family
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Family",
            titlePersian = "خانواده",
            objectives = listOf(
                "Talk about family members",
                "Use possessive 's",
                "Use have/has",
                "Describe your family"
            ),
            vocabulary = listOf(
                VocabWord("mother", "مادر", "/ˈmʌðər/", "noun",
                    "My mother is a teacher.", "مادرم معلم است."),
                VocabWord("father", "پدر", "/ˈfɑːðər/", "noun",
                    "My father works at home.", "پدرم در خانه کار می‌کند."),
                VocabWord("sister", "خواهر", "/ˈsɪstər/", "noun",
                    "I have one sister.", "من یک خواهر دارم."),
                VocabWord("brother", "برادر", "/ˈbrʌðər/", "noun",
                    "My brother is twelve.", "برادرم دوازده سالشه."),
                VocabWord("parents", "والدین", "/ˈperənts/", "noun",
                    "My parents live nearby.", "والدینم نزدیک زندگی می‌کنند."),
                VocabWord("grandmother", "مادربزرگ", "/ˈɡrænmʌðər/", "noun",
                    "My grandmother is 80.", "مادربزرگم ۸۰ سالشه."),
                VocabWord("grandfather", "پدربزرگ", "/ˈɡrænfɑːðər/", "noun",
                    "My grandfather was a doctor.", "پدربزرگم دکتر بود."),
                VocabWord("uncle", "عمو/دایی", "/ˈʌŋkəl/", "noun",
                    "My uncle lives in Canada.", "عمویم در کانادا زندگی می‌کند."),
                VocabWord("aunt", "عمه/خاله", "/ænt/", "noun",
                    "My aunt is a nurse.", "خاله‌ام پرستار است."),
                VocabWord("cousin", "پسرعمو/دخترخاله", "/ˈkʌzən/", "noun",
                    "I have many cousins.", "من پسرعموهای زیادی دارم."),
                VocabWord("family", "خانواده", "/ˈfæməli/", "noun",
                    "I have a big family.", "خانواده بزرگی دارم."),
                VocabWord("married", "متأهل", "/ˈmerid/", "adjective",
                    "My sister is married.", "خواهرم متأهله.")
            ),
            idioms = listOf(
                IdiomExpression("like father, like son", "پسر رو از پدرش بشناس",
                    "He's very hardworking, like father, like son.",
                    "او خیلی سخت‌کوشه، پسر رو از پدرش بشناس.", "idiom"),
                IdiomExpression("get along with", "کنار آمدن با",
                    "I get along well with my sister.",
                    "با خواهرم خوب کنار میام.", "neutral"),
                IdiomExpression("take after", "شبیه بودن به",
                    "She takes after her mother.",
                    "او شبیه مادرشه.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Possessive 's",
                    "Ali's /ˈæliz/ — اگر اسم به s ختم شود: Chris's /ˈkrɪsɪz/."),
                PronunciationTip("th in mother",
                    "mother /ˈmʌðər/ — /ð/ صدادار.")
            ),
            culturalNotes = listOf(
                CulturalNote("Family structure",
                    "immediate family = خانواده نزدیک، extended family = فامیل."),
                CulturalNote("Talking about family",
                    "در غرب، پرسیدن درباره خانواده رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Possessive 's",
                    """
                        Ali's car
                        My father's name
                        Sara's brother

                        جمع: parents' house
                    """.trimIndent()),
                GrammarSection("have / has",
                    """
                        I/You/We/They + have
                        He/She/It + has

                        I have one brother.
                        She has two sisters.
                    """.trimIndent()),
                GrammarSection("Possessive adjectives",
                    """
                        my / your / his / her / our / their

                        My brother is a doctor.
                        Her parents live in Shiraz.
                    """.trimIndent()),
                GrammarSection("Questions about family",
                    """
                        Do you have any siblings?
                        How many brothers do you have?
                        What does your mother do?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She have two brothers.", "She has two brothers.", "سوم شخص مفرد has."),
                CommonMistake("Ali car is new.", "Ali's car is new.", "برای مالکیت از 's."),
                CommonMistake("His name is Ali. His 25 years old.", "His name is Ali. He is 25 years old.",
                    "برای سن از He/She.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you have a big family?",
                    "خانواده بزرگی داری؟"),
                DialogueLine("B", "Yes, I have two brothers and one sister.",
                    "بله، دو برادر و یک خواهر دارم."),
                DialogueLine("A", "What do your parents do?",
                    "والدینت چیکار می‌کنن؟"),
                DialogueLine("B", "My father is an engineer and my mother is a teacher.",
                    "پدرم مهندسه و مادرم معلمه."),
                DialogueLine("A", "Are you the oldest?",
                    "تو بزرگ‌ترین هستی؟"),
                DialogueLine("B", "No, I'm the youngest. My brother is 30.",
                    "نه، من کوچک‌ترینم. برادرم ۳۰ سالشه."),
                DialogueLine("A", "What does your brother do?",
                    "برادرت چیکار می‌کنه؟"),
                DialogueLine("B", "He's a doctor. He works at a hospital downtown.",
                    "دکتره. در بیمارستان مرکز شهر کار می‌کنه."),
                DialogueLine("A", "Does he look like your father?",
                    "شبیه پدرت هست؟"),
                DialogueLine("B", "Yes, he does! He takes after my father.",
                    "بله! شبیه پدرمه."),
                DialogueLine("A", "And what about your sister?",
                    "خواهرت چطور؟"),
                DialogueLine("B", "She's very funny. She's the life of every party!",
                    "خیلی بامزه‌ست. روح هر مهمونیه!"),
                DialogueLine("A", "Do you get along well?",
                    "خوب کنار میاید؟"),
                DialogueLine("B", "Usually, yes. We're very close.",
                    "معمولاً بله. خیلی نزدیکیم."),
                DialogueLine("A", "That's nice. Family is important.",
                    "خوبه. خانواده مهمه."),
                DialogueLine("B", "Yes, it is. Do you have siblings?",
                    "بله. تو خواهر و برادر داری؟"),
                DialogueLine("A", "I have one sister. She's married.",
                    "یه خواهر دارم. متأهله."),
                DialogueLine("B", "Oh, nice. What does her husband do?",
                    "اوه، خوبه. شوهرش چیکار می‌کنه؟"),
                DialogueLine("A", "He's a chef at a restaurant.",
                    "سرآشپز یه رستورانه."),
                DialogueLine("B", "That's a great job!",
                    "شغل عالیه!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند خواهر و برادر دارد؟", "دو برادر و یک خواهر."),
                ComprehensionQuestion("برادر B چه شغلی دارد؟", "دکتر."),
                ComprehensionQuestion("آیا برادر B شبیه پدرش است؟", "بله."),
                ComprehensionQuestion("خواهر A چه وضعیتی دارد؟", "متأهل است و شوهرش سرآشپز است.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your family.",
                    "خانواده‌ات رو توصیف کن.",
                    "I have... / My father is..."),
                SpeakingTask("Talk about who you look like.",
                    "درباره اینکه شبیه کی هستی صحبت کن.",
                    "I take after my...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your family.",
                    "درباره خانواده‌ات بنویس.",
                    100,
                    "Include 3 family members.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ one sister.",
                    listOf("have", "has", "haves", "having"), 1),
                QuizQuestion("Choose correct possessive:",
                    listOf("Ali car", "Ali's car", "Alis car", "Car Ali"), 1),
                QuizQuestion("Complete: I ___ well with my brother.",
                    listOf("get along", "get on", "get with", "go along"), 0),
                QuizQuestion("What does 'take after' mean?",
                    listOf("شبیه بودن", "ترک کردن", "دنبال کردن", "کنار آمدن"), 0),
                QuizQuestion("Complete: My brother ___ 30 years old.",
                    listOf("have", "has", "is", "are"), 2),
                QuizQuestion("Complete: They ___ a big family.",
                    listOf("has", "have", "haves", "having"), 1),
                QuizQuestion("Complete: ___ parents live in Shiraz.",
                    listOf("She", "Her", "Hers", "She's"), 1),
                QuizQuestion("Complete: I have two ___.",
                    listOf("brother", "brothers", "brother's", "brotheres"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 4 — Colors and Clothes
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Colors and Clothes",
            titlePersian = "رنگ‌ها و لباس‌ها",
            objectives = listOf(
                "Name colors",
                "Talk about clothes",
                "Use adjectives before nouns",
                "Describe what you're wearing"
            ),
            vocabulary = listOf(
                VocabWord("red", "قرمز", "/red/", "adjective",
                    "My shirt is red.", "پیراهنم قرمزه."),
                VocabWord("blue", "آبی", "/bluː/", "adjective",
                    "Her dress is blue.", "لباسش آبیه."),
                VocabWord("green", "سبز", "/ɡriːn/", "adjective",
                    "The tree is green.", "درخت سبزه."),
                VocabWord("yellow", "زرد", "/ˈjeloʊ/", "adjective",
                    "The sun is yellow.", "خورشید زرده."),
                VocabWord("black", "مشکی", "/blæk/", "adjective",
                    "My shoes are black.", "کفشام مشکی هستن."),
                VocabWord("white", "سفید", "/waɪt/", "adjective",
                    "He wears a white shirt.", "پیراهن سفید می‌پوشه."),
                VocabWord("shirt", "پیراهن", "/ʃɜːrt/", "noun",
                    "This shirt is nice.", "این پیراهن قشنگه."),
                VocabWord("pants", "شلوار", "/pænts/", "noun",
                    "These pants are new.", "این شلوار نوئه."),
                VocabWord("shoes", "کفش", "/ʃuːz/", "noun",
                    "My shoes are new.", "کفشام نو هستن."),
                VocabWord("hat", "کلاه", "/hæt/", "noun",
                    "His hat is brown.", "کلاهش قهوه‌ایه."),
                VocabWord("dress", "لباس زنانه", "/dres/", "noun",
                    "Her dress is beautiful.", "لباسش زیباست."),
                VocabWord("wear", "پوشیدن", "/wer/", "verb",
                    "I wear a uniform to work.", "برای کار لباس فرم می‌پوشم.")
            ),
            idioms = listOf(
                IdiomExpression("fit like a glove", "دقیقاً اندازه بودن",
                    "This dress fits like a glove.",
                    "این لباس دقیقاً اندازه‌امه.", "idiom"),
                IdiomExpression("dressed to kill", "خیلی شیک پوشیدن",
                    "She was dressed to kill at the party.",
                    "او در مهمونی خیلی شیک پوشیده بود.", "informal"),
                IdiomExpression("in style", "مد روز",
                    "Bell-bottom jeans are back in style.",
                    "شلوارهای جین دم‌پا دوباره مد شدن.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("colors",
                    "red /red/، blue /bluː/، green /ɡriːn/."),
                PronunciationTip("clothes",
                    "clothes /kloʊðz/ — th صدادار.")
            ),
            culturalNotes = listOf(
                CulturalNote("Colors in culture",
                    "رنگ‌ها در فرهنگ‌ها معانی متفاوتی دارند."),
                CulturalNote("Clothing styles",
                    "سبک‌های پوشش در غرب متنوعه.")
            ),
            grammar = listOf(
                GrammarSection("Adjective + noun",
                    """
                        صفت قبل از اسم:
                        a red shirt
                        a blue car
                        black shoes

                        در انگلیسی صفت جمع بسته نمی‌شه:
                        red shirts (نه reds shirts)
                    """.trimIndent()),
                GrammarSection("This / These with clothes",
                    """
                        This shirt is new.
                        These pants are old.

                        This = مفرد
                        These = جمع
                    """.trimIndent()),
                GrammarSection("What color...?",
                    """
                        What color is your shirt?
                        What color are your shoes?

                        It's red. / They're blue.
                    """.trimIndent()),
                GrammarSection("Present continuous for wear",
                    """
                        I'm wearing a blue shirt.
                        She's wearing a red dress.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("a shirt red", "a red shirt", "صفت قبل از اسم."),
                CommonMistake("I wear a blue shirt now.", "I'm wearing a blue shirt now.", "الان = continuous."),
                CommonMistake("This shoes are new.", "These shoes are new.", "جمع = these."),
                CommonMistake("reds shirts", "red shirts", "صفت جمع نمی‌شه.")
            ),
            conversation = listOf(
                DialogueLine("A", "What are you wearing today?",
                    "امروز چی پوشیدی؟"),
                DialogueLine("B", "I'm wearing a blue shirt and black pants.",
                    "پیراهن آبی و شلوار مشکی پوشیدم."),
                DialogueLine("A", "I like that shirt! Where did you get it?",
                    "پیراهنت رو دوست دارم! از کجا خریدی؟"),
                DialogueLine("B", "Thanks! I got it from a shop downtown.",
                    "ممنون! از یه مغازه مرکز شهر خریدم."),
                DialogueLine("A", "What color is your favorite shirt?",
                    "رنگ پیراهن مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "I love white shirts. They're simple and elegant.",
                    "عاشق پیراهن‌های سفیدم. ساده و شیکن."),
                DialogueLine("A", "And what about shoes?",
                    "کفش چطور؟"),
                DialogueLine("B", "I usually wear black shoes.",
                    "معمولاً کفش مشکی می‌پوشم."),
                DialogueLine("A", "Do you like colorful clothes?",
                    "لباس‌های رنگی دوست داری؟"),
                DialogueLine("B", "Sometimes. I like green and blue.",
                    "گاهی. سبز و آبی رو دوست دارم."),
                DialogueLine("A", "What's your favorite color overall?",
                    "رنگ مورد علاقه‌ات به‌طور کلی چیه؟"),
                DialogueLine("B", "Probably blue. It's calm and relaxing.",
                    "احتمالاً آبی. آرام و تسکین‌دهنده‌ست."),
                DialogueLine("A", "I agree. Blue is my favorite too.",
                    "موافقم. آبی مورد علاقه من هم هست."),
                DialogueLine("B", "Nice! We have similar taste.",
                    "خوبه! سلیقه‌مون مشابهه."),
                DialogueLine("A", "Yes! What are you wearing to the party?",
                    "بله! چی می‌پوشی به مهمونی؟"),
                DialogueLine("B", "Maybe a black dress and silver shoes.",
                    "شاید یه لباس مشکی و کفش نقره‌ای."),
                DialogueLine("A", "That sounds elegant.",
                    "شیک به نظر می‌رسه."),
                DialogueLine("B", "Thanks. What about you?",
                    "ممنون. تو چطور؟"),
                DialogueLine("A", "I'll wear a white shirt and blue pants.",
                    "من پیراهن سفید و شلوار آبی می‌پوشم."),
                DialogueLine("B", "Perfect. See you at the party!",
                    "عالی. در مهمونی می‌بینمت!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B امروز چی پوشیده؟", "پیراهن آبی و شلوار مشکی."),
                ComprehensionQuestion("پیراهن مورد علاقه B چیست؟", "سفید."),
                ComprehensionQuestion("رنگ مورد علاقه B چیست؟", "آبی."),
                ComprehensionQuestion("B به مهمونی چی می‌پوشد؟", "لباس مشکی و کفش نقره‌ای.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe what you're wearing.",
                    "توصیف کن امروز چی پوشیدی.",
                    "I'm wearing..."),
                SpeakingTask("Talk about your favorite colors.",
                    "درباره رنگ‌های مورد علاقه‌ات صحبت کن.",
                    "I love... / My favorite is...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your favorite outfit.",
                    "ست لباس مورد علاقه‌ات رو توصیف کن.",
                    80,
                    "Use colors and adjectives.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: a ___ shirt",
                    listOf("red", "reds", "red color", "shirt red"), 0),
                QuizQuestion("Complete: I'm ___ a blue shirt.",
                    listOf("wear", "wears", "wearing", "wore"), 2),
                QuizQuestion("Complete: ___ shoes are new.",
                    listOf("This", "That", "These", "Them"), 2),
                QuizQuestion("What does 'fit like a glove' mean?",
                    listOf("مثل دستکش", "دقیقاً اندازه بودن", "خیلی تنگ", "خیلی گشاد"), 1),
                QuizQuestion("Complete: What color ___ your shoes?",
                    listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: She's ___ a red dress.",
                    listOf("wear", "wears", "wearing", "wore"), 2),
                QuizQuestion("Complete: ___ shirt is nice.",
                    listOf("This", "These", "Those", "Them"), 0),
                QuizQuestion("Complete: My shoes ___ black.",
                    listOf("is", "am", "are", "be"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 5 — Food and Drinks
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Food and Drinks",
            titlePersian = "غذا و نوشیدنی",
            objectives = listOf(
                "Name common foods and drinks",
                "Talk about likes and dislikes",
                "Use some and any",
                "Order simple food"
            ),
            vocabulary = listOf(
                VocabWord("bread", "نان", "/bred/", "noun",
                    "I eat bread for breakfast.", "برای صبحانه نان می‌خورم."),
                VocabWord("rice", "برنج", "/raɪs/", "noun",
                    "We have rice for lunch.", "برای ناهار برنج داریم."),
                VocabWord("meat", "گوشت", "/miːt/", "noun",
                    "I don't eat meat.", "من گوشت نمی‌خورم."),
                VocabWord("chicken", "مرغ", "/ˈtʃɪkɪn/", "noun",
                    "Grilled chicken is my favorite.", "مرغ گریل مورد علاقه‌مه."),
                VocabWord("fish", "ماهی", "/fɪʃ/", "noun",
                    "We eat fish on Fridays.", "جمعه‌ها ماهی می‌خوریم."),
                VocabWord("fruit", "میوه", "/fruːt/", "noun",
                    "Eat more fruit!", "میوه بیشتر بخور!"),
                VocabWord("vegetable", "سبزیجات", "/ˈvedʒtəbəl/", "noun",
                    "I like green vegetables.", "سبزیجات سبز دوست دارم."),
                VocabWord("water", "آب", "/ˈwɔːtər/", "noun",
                    "Can I have some water?", "می‌تونم کمی آب داشته باشم؟"),
                VocabWord("coffee", "قهوه", "/ˈkɔːfi/", "noun",
                    "I drink coffee in the morning.", "صبح قهوه می‌خورم."),
                VocabWord("tea", "چای", "/tiː/", "noun",
                    "Would you like some tea?", "چای میل دارید؟"),
                VocabWord("juice", "آبمیوه", "/dʒuːs/", "noun",
                    "I like orange juice.", "آب‌پرتقال دوست دارم."),
                VocabWord("milk", "شیر", "/mɪlk/", "noun",
                    "Do you want milk in your coffee?", "توی قهوه‌ات شیر می‌خوای؟")
            ),
            idioms = listOf(
                IdiomExpression("piece of cake", "خیلی راحت",
                    "The test was a piece of cake!",
                    "امتحان خیلی راحت بود!", "informal"),
                IdiomExpression("have a sweet tooth", "شیرینی‌دوست بودن",
                    "She has a sweet tooth.",
                    "او شیرینی‌دوست است.", "idiom"),
                IdiomExpression("eat out", "بیرون غذا خوردن",
                    "We eat out every Friday.",
                    "هر جمعه بیرون غذا می‌خوریم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in thirsty",
                    "thirsty /ˈθɜːrsti/ — /θ/ بی‌صدا."),
                PronunciationTip("vegetable",
                    "vegetable /ˈvedʒtəbəl/ — سه سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Meals",
                    "breakfast, lunch, dinner = سه وعده اصلی."),
                CulturalNote("Tipping",
                    "در آمریکا، انعام ۱۵-۲۰٪ رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Countable vs uncountable",
                    """
                        قابل شمارش: apple, egg, sandwich
                        غیرقابل شمارش: water, rice, bread

                        a/an + قابل شمارش
                        some + غیرقابل شمارش
                    """.trimIndent()),
                GrammarSection("some / any",
                    """
                        some در مثبت:
                        I have some bread.

                        any در منفی و سوال:
                        I don't have any milk.
                        Do you have any sugar?
                    """.trimIndent()),
                GrammarSection("Like / don't like",
                    """
                        I like tea.
                        I don't like coffee.
                        She likes juice.

                        Do you like...? — Yes, I do. / No, I don't.
                    """.trimIndent()),
                GrammarSection("Ordering food",
                    """
                        I'd like... please.
                        Can I have...?

                        I'd like a coffee, please.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have some milks.", "I have some milk.", "milk غیرقابل شمارش."),
                CommonMistake("I'd like a water.", "I'd like some water.", "water غیرقابل شمارش."),
                CommonMistake("I like apple.", "I like apples.", "برای جمع از جمع اسم.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you usually have for breakfast?",
                    "معمولاً صبحانه چی می‌خوری؟"),
                DialogueLine("B", "I usually have bread and cheese with tea.",
                    "معمولاً نان و پنیر با چای."),
                DialogueLine("A", "Nice. What about lunch?",
                    "خوبه. ناهار چطور؟"),
                DialogueLine("B", "I have rice with chicken or fish.",
                    "برنج با مرغ یا ماهی."),
                DialogueLine("A", "Do you like vegetables?",
                    "سبزیجات دوست داری؟"),
                DialogueLine("B", "Yes, I love them! Especially green vegetables.",
                    "بله، عاشقشونم! خصوصاً سبزیجات سبز."),
                DialogueLine("A", "Do you drink coffee?",
                    "قهوه می‌خوری؟"),
                DialogueLine("B", "Sometimes. I prefer tea.",
                    "گاهی. چای رو ترجیح می‌دم."),
                DialogueLine("A", "What's your favorite food?",
                    "غذای مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "Ghormeh sabzi. It's a Persian dish.",
                    "قرمه سبزی. یه غذای ایرانیه."),
                DialogueLine("A", "Sounds delicious! Can you cook?",
                    "خوشمزه به نظر می‌رسه! می‌تونی آشپزی کنی؟"),
                DialogueLine("B", "Yes, I can. My mother taught me.",
                    "بله. مادرم یادم داد."),
                DialogueLine("A", "That's great. What about dessert?",
                    "عالیه. دسر چطور؟"),
                DialogueLine("B", "I have a sweet tooth. I love cake.",
                    "شیرینی‌دوست هستم. عاشق کیکم."),
                DialogueLine("A", "Me too! What's your favorite cake?",
                    "منم! کیک مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "Chocolate. What about you?",
                    "شکلاتی. تو چطور؟"),
                DialogueLine("A", "Vanilla for me. Simple but delicious.",
                    "وانیلی. ساده ولی خوشمزه."),
                DialogueLine("B", "Nice! Let's go get some cake later.",
                    "خوبه! بیا بعداً بریم کیک بخوریم."),
                DialogueLine("A", "Great idea!",
                    "فکر عالی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B صبحانه چه می‌خورد؟", "نان و پنیر با چای."),
                ComprehensionQuestion("غذای مورد علاقه B چیست؟", "قرمه سبزی."),
                ComprehensionQuestion("B آشپزی می‌تواند؟", "بله، مادرش یادش داده."),
                ComprehensionQuestion("کیک مورد علاقه B چیست؟", "شکلاتی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your favorite food.",
                    "درباره غذای مورد علاقه‌ات صحبت کن.",
                    "I love... / My favorite is..."),
                SpeakingTask("Order food at a café.",
                    "نقش‌بازی: در کافه سفارش بده.",
                    "I'd like... / Can I have...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite meal.",
                    "درباره غذای مورد علاقه‌ات بنویس.",
                    100,
                    "Describe the food and why you like it.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I'd like ___ water.",
                    listOf("a", "an", "some", "many"), 2),
                QuizQuestion("Complete: Do you have ___ bread?",
                    listOf("some", "any", "a", "many"), 1),
                QuizQuestion("Complete: I have ___ apple.",
                    listOf("a", "an", "some", "any"), 1),
                QuizQuestion("Complete: She ___ eat meat.",
                    listOf("don't", "doesn't", "isn't", "aren't"), 1),
                QuizQuestion("What does 'eat out' mean?",
                    listOf("بیرون غذا خوردن", "داخل غذا خوردن", "آشپزی کردن", "خرید کردن"), 0),
                QuizQuestion("Complete: I ___ vegetables.",
                    listOf("like", "likes", "liking", "liked"), 0),
                QuizQuestion("Complete: I'd like ___ coffee, please.",
                    listOf("a", "an", "some", "any"), 0),
                QuizQuestion("What does 'piece of cake' mean?",
                    listOf("تکه کیک", "خیلی راحت", "شیرینی", "دسر"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 6 — My Day
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "My Day",
            titlePersian = "روز من",
            objectives = listOf(
                "Talk about daily routines",
                "Tell the time",
                "Use the present simple",
                "Use time expressions"
            ),
            vocabulary = listOf(
                VocabWord("wake up", "بیدار شدن", "/weɪk ʌp/", "phrasal verb",
                    "I wake up at 7.", "ساعت ۷ بیدار می‌شم."),
                VocabWord("get up", "بلند شدن", "/ɡet ʌp/", "phrasal verb",
                    "I get up at 7:30.", "ساعت ۷:۳۰ بلند می‌شم."),
                VocabWord("breakfast", "صبحانه", "/ˈbrekfəst/", "noun",
                    "I have breakfast at 8.", "ساعت ۸ صبحانه می‌خورم."),
                VocabWord("lunch", "ناهار", "/lʌntʃ/", "noun",
                    "I have lunch at noon.", "ظهر ناهار می‌خورم."),
                VocabWord("dinner", "شام", "/ˈdɪnər/", "noun",
                    "We have dinner at 7.", "ساعت ۷ شام می‌خوریم."),
                VocabWord("work", "کار کردن", "/wɜːrk/", "verb",
                    "I work from 9 to 5.", "از ۹ تا ۵ کار می‌کنم."),
                VocabWord("study", "درس خواندن", "/ˈstʌdi/", "verb",
                    "I study every evening.", "هر عصر درس می‌خونم."),
                VocabWord("morning", "صبح", "/ˈmɔːrnɪŋ/", "noun",
                    "I exercise in the morning.", "صبح‌ها ورزش می‌کنم."),
                VocabWord("afternoon", "بعدازظهر", "/ˌæftərˈnuːn/", "noun",
                    "I work in the afternoon.", "بعدازظهر کار می‌کنم."),
                VocabWord("evening", "عصر", "/ˈiːvnɪŋ/", "noun",
                    "I read in the evening.", "عصر کتاب می‌خونم."),
                VocabWord("night", "شب", "/naɪt/", "noun",
                    "I sleep at night.", "شب می‌خوابم."),
                VocabWord("always", "همیشه", "/ˈɔːlweɪz/", "adverb",
                    "I always eat breakfast.", "همیشه صبحانه می‌خورم.")
            ),
            idioms = listOf(
                IdiomExpression("early bird", "سحرخیز",
                    "My dad is an early bird.",
                    "بابام سحرخیزه.", "informal"),
                IdiomExpression("night owl", "شب‌زنده‌دار",
                    "I'm a night owl.",
                    "من شب‌زنده‌دارم.", "informal"),
                IdiomExpression("on time", "سر وقت",
                    "I always arrive on time.",
                    "همیشه سر وقت می‌رسم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Third-person -s",
                    "he/she/it + verb + s."),
                PronunciationTip("o'clock",
                    "o'clock /əˈklɑːk/ — استرس روی clock.")
            ),
            culturalNotes = listOf(
                CulturalNote("Work schedules",
                    "9 to 5 رایج‌ترین ساعت کاری در غربه."),
                CulturalNote("Routines",
                    "روتین روزانه در فرهنگ غرب مهمه.")
            ),
            grammar = listOf(
                GrammarSection("Present simple",
                    """
                        I/You/We/They + verb
                        He/She/It + verb + s

                        I work every day.
                        She works at a hospital.
                    """.trimIndent()),
                GrammarSection("Telling time",
                    """
                        It's 7 o'clock.
                        It's half past seven. (7:30)
                        It's quarter past seven. (7:15)
                        It's quarter to eight. (7:45)
                    """.trimIndent()),
                GrammarSection("Time expressions",
                    """
                        at + ساعت: at 7
                        in the + بخش روز: in the morning
                        on + روز: on Monday
                        every + واحد: every day
                    """.trimIndent()),
                GrammarSection("Adverbs of frequency",
                    """
                        always → usually → often → sometimes → never

                        I always eat breakfast.
                        She sometimes works late.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She work every day.", "She works every day.", "سوم شخص مفرد +s."),
                CommonMistake("I go to work in 8.", "I go to work at 8.", "برای ساعت from at."),
                CommonMistake("I wake up in 7.", "I wake up at 7.", "at برای ساعت.")
            ),
            conversation = listOf(
                DialogueLine("A", "What time do you get up?",
                    "چه ساعتی بلند می‌شی؟"),
                DialogueLine("B", "I wake up at 6:30 and get up at 7.",
                    "ساعت ۶:۳۰ بیدار می‌شم و ساعت ۷ بلند می‌شم."),
                DialogueLine("A", "That's early! What do you do in the morning?",
                    "زوده! صبح‌ها چیکار می‌کنی؟"),
                DialogueLine("B", "I take a shower, have breakfast, and go to work.",
                    "دوش می‌گیرم، صبحانه می‌خورم و می‌رم سر کار."),
                DialogueLine("A", "What time do you start work?",
                    "چه ساعتی کارت شروع می‌شه؟"),
                DialogueLine("B", "I start at 9 and finish at 5.",
                    "ساعت ۹ شروع می‌شه و ۵ تموم می‌شه."),
                DialogueLine("A", "Do you work on weekends?",
                    "آخر هفته‌ها کار می‌کنی؟"),
                DialogueLine("B", "Sometimes. But I usually rest on Sundays.",
                    "گاهی. ولی معمولاً یکشنبه‌ها استراحت می‌کنم."),
                DialogueLine("A", "What do you do after work?",
                    "بعد از کار چیکار می‌کنی؟"),
                DialogueLine("B", "I often go for a walk or read.",
                    "غالباً پیاده‌روی می‌رم یا کتاب می‌خونم."),
                DialogueLine("A", "What time do you have dinner?",
                    "چه ساعتی شام می‌خوری؟"),
                DialogueLine("B", "Around 7. Then I relax.",
                    "حدود ۷. بعدش استراحت می‌کنم."),
                DialogueLine("A", "What time do you go to bed?",
                    "چه ساعتی می‌خوابی؟"),
                DialogueLine("B", "Around 11. I never stay up late.",
                    "حدود ۱۱. هرگز دیر بیدار نمی‌مونم."),
                DialogueLine("A", "That's a healthy routine.",
                    "روتین سالمیه."),
                DialogueLine("B", "Thanks! It took time to build.",
                    "ممنون! ساختنش زمان برد."),
                DialogueLine("A", "Do you always have breakfast?",
                    "همیشه صبحانه می‌خوری؟"),
                DialogueLine("B", "Yes, always. It's important for energy.",
                    "بله، همیشه. برای انرژی مهمه."),
                DialogueLine("A", "Great habit! I should do the same.",
                    "عادت خوبی! منم باید همین کار رو بکنم."),
                DialogueLine("B", "You should! It really helps.",
                    "باید بکنی! واقعاً کمک می‌کنه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه ساعتی بیدار می‌شود؟", "ساعت ۶:۳۰."),
                ComprehensionQuestion("B چه ساعتی کارش تمام می‌شود؟", "ساعت ۵."),
                ComprehensionQuestion("B بعد از کار چیکار می‌کند؟", "پیاده‌روی یا کتاب خواندن."),
                ComprehensionQuestion("B چه ساعتی می‌خوابد؟", "حدود ۱۱ شب.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your daily routine.",
                    "روتین روزانه‌ات رو توصیف کن.",
                    "I wake up at... / I usually..."),
                SpeakingTask("Talk about your favorite time of day.",
                    "درباره زمان مورد علاقه‌ات در روز صحبت کن.",
                    "I like... because...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your typical day.",
                    "درباره یه روز معمولی‌ت بنویس.",
                    100,
                    "Use present simple and time expressions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She ___ at 7 every day.",
                    listOf("wake up", "wakes up", "waking up", "woke up"), 1),
                QuizQuestion("Complete: I go to bed ___ 11.",
                    listOf("in", "on", "at", "from"), 2),
                QuizQuestion("Complete: He ___ coffee.",
                    listOf("never drink", "never drinks", "drinks never", "never drinking"), 1),
                QuizQuestion("Complete: What time ___ you get up?",
                    listOf("does", "do", "is", "are"), 1),
                QuizQuestion("Complete: I have breakfast ___ the morning.",
                    listOf("on", "at", "in", "from"), 2),
                QuizQuestion("What does 'night owl' mean?",
                    listOf("آدم شب‌زنده‌دار", "صبح‌خیز", "خسته", "خواب‌آلود"), 0),
                QuizQuestion("Complete: It's half ___ seven.",
                    listOf("to", "past", "at", "for"), 1),
                QuizQuestion("Complete: They ___ work on Sundays.",
                    listOf("doesn't", "don't", "isn't", "aren't"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 7 — Places
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Places",
            titlePersian = "مکان‌ها",
            objectives = listOf(
                "Name common places in a city",
                "Use there is / there are",
                "Ask for directions",
                "Use prepositions of place"
            ),
            vocabulary = listOf(
                VocabWord("bank", "بانک", "/bæŋk/", "noun",
                    "The bank is near the hotel.", "بانک نزدیک هتله."),
                VocabWord("hospital", "بیمارستان", "/ˈhɑːspɪtəl/", "noun",
                    "The hospital is on Main Street.", "بیمارستان در خیابان اصلیه."),
                VocabWord("school", "مدرسه", "/skuːl/", "noun",
                    "Our school is big.", "مدرسه ما بزرگه."),
                VocabWord("park", "پارک", "/pɑːrk/", "noun",
                    "The park is beautiful.", "پارک زیباست."),
                VocabWord("restaurant", "رستوران", "/ˈrestərɑːnt/", "noun",
                    "This restaurant is good.", "این رستوران خوبه."),
                VocabWord("supermarket", "سوپرمارکت", "/ˈsuːpərmɑːrkɪt/", "noun",
                    "The supermarket is open.", "سوپرمارکت بازه."),
                VocabWord("hotel", "هتل", "/hoʊˈtel/", "noun",
                    "We stayed in a hotel.", "در هتل موندیم."),
                VocabWord("street", "خیابان", "/striːt/", "noun",
                    "This street is busy.", "این خیابان شلوغه."),
                VocabWord("corner", "گوشه", "/ˈkɔːrnər/", "noun",
                    "It's on the corner.", "سر خیابونه."),
                VocabWord("near", "نزدیک", "/nɪr/", "preposition",
                    "It's near here.", "نزدیک اینجاست."),
                VocabWord("far", "دور", "/fɑːr/", "adjective",
                    "The airport is far.", "فرودگاه دوره."),
                VocabWord("left", "چپ", "/left/", "noun",
                    "Turn left.", "به چپ بپیچ.")
            ),
            idioms = listOf(
                IdiomExpression("around the corner", "سر کوچه",
                    "The pharmacy is around the corner.",
                    "داروخانه سر کوچه‌ست.", "neutral"),
                IdiomExpression("Excuse me", "ببخشید",
                    "Excuse me, where is the bank?",
                    "ببخشید، بانک کجاست؟", "polite"),
                IdiomExpression("go straight", "مستقیم برو",
                    "Go straight for two blocks.",
                    "دو بلوک مستقیم برو.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in hospital",
                    "hospital /ˈhɑːspɪtəl/ — نه th."),
                PronunciationTip("Directions",
                    "go straight /ɡoʊ streɪt/، turn left /tɜːrn left/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Asking for directions",
                    "در غرب، پرسیدن آدرس از غریبه‌ها عادیه."),
                CulturalNote("Polite openers",
                    "Excuse me یک شروع مؤدبانه‌ست.")
            ),
            grammar = listOf(
                GrammarSection("There is / There are",
                    """
                        There is + مفرد: There is a bank.
                        There are + جمع: There are two shops.

                        منفی: There isn't / There aren't
                        سوال: Is there...? / Are there...?
                    """.trimIndent()),
                GrammarSection("Prepositions of place",
                    """
                        in, on, next to, across from, between

                        The bank is next to the hotel.
                        The park is across from the school.
                    """.trimIndent()),
                GrammarSection("Imperatives for directions",
                    """
                        Go straight.
                        Turn left. / Turn right.
                        Stop at the corner.
                    """.trimIndent()),
                GrammarSection("Questions about location",
                    """
                        Where is the bank?
                        Is there a park near here?
                        How do I get to the station?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("There is two banks.", "There are two banks.", "جمع = there are."),
                CommonMistake("Where is bank?", "Where is the bank?", "the لازم داره."),
                CommonMistake("Turn to left.", "Turn left.", "بدون to.")
            ),
            conversation = listOf(
                DialogueLine("A", "Excuse me, where is the bank?",
                    "ببخشید، بانک کجاست؟"),
                DialogueLine("B", "Go straight for two blocks.",
                    "دو بلوک مستقیم برو."),
                DialogueLine("A", "Then what?",
                    "بعدش چی؟"),
                DialogueLine("B", "Turn left at the traffic light.",
                    "پشت چراغ راهنما به چپ بپیچ."),
                DialogueLine("A", "Left at the light. Got it.",
                    "چپ پشت چراغ. فهمیدم."),
                DialogueLine("B", "The bank is on your right, next to the pharmacy.",
                    "بانک سمت راسته، کنار داروخانه."),
                DialogueLine("A", "Is it far from here?",
                    "از اینجا دوره؟"),
                DialogueLine("B", "No, about 5 minutes on foot.",
                    "نه، حدود ۵ دقیقه پیاده."),
                DialogueLine("A", "Is there a park near the bank?",
                    "پارک نزدیک بانک هست؟"),
                DialogueLine("B", "Yes, there's a park across from it.",
                    "بله، روبروش یه پارک هست."),
                DialogueLine("A", "Great. And a coffee shop?",
                    "عالی. کافه هم هست؟"),
                DialogueLine("B", "Yes, there are two on that street.",
                    "بله، دو تا توی اون خیابون هست."),
                DialogueLine("A", "Perfect. Thank you so much!",
                    "عالی. خیلی ممنون!"),
                DialogueLine("B", "You're welcome. Have a nice day!",
                    "خواهش می‌کنم. روز خوبی داشته باشی!"),
                DialogueLine("A", "One more thing — where's the station?",
                    "یه چیز دیگه — ایستگاه کجاست؟"),
                DialogueLine("B", "It's far. You should take a taxi.",
                    "دوره. باید تاکسی بگیری."),
                DialogueLine("A", "OK, I'll do that. Thanks again!",
                    "باشه، همین کار رو می‌کنم. بازم ممنون!"),
                DialogueLine("B", "Anytime. Good luck!",
                    "هر وقت. موفق باشی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("بانک کجاست؟", "سمت راست، کنار داروخانه."),
                ComprehensionQuestion("بانک چقدر دور است؟", "حدود ۵ دقیقه پیاده."),
                ComprehensionQuestion("پارک کجاست؟", "روبروی بانک."),
                ComprehensionQuestion("ایستگاه چطور؟", "دور است، باید تاکسی بگیرد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Ask for directions.",
                    "مسیر بپرس.",
                    "Excuse me, where is...?"),
                SpeakingTask("Give directions.",
                    "مسیر بده.",
                    "Go straight... / Turn left...")
            ),
            writingTasks = listOf(
                WritingTask("Write directions from your home to a nearby place.",
                    "از خونت به یه جای نزدیک مسیر بنویس.",
                    100,
                    "Use imperatives and prepositions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: There ___ two banks.",
                    listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: Turn ___ at the corner.",
                    listOf("left", "the left", "to left", "lefts"), 0),
                QuizQuestion("Complete: The bank is ___ the hotel.",
                    listOf("next to", "next", "near of", "close"), 0),
                QuizQuestion("What does 'around the corner' mean?",
                    listOf("سر کوچه", "گوشه", "دور", "کنار"), 0),
                QuizQuestion("Complete: Where ___ the bank?",
                    listOf("are", "is", "have", "has"), 1),
                QuizQuestion("Complete: Is there a park ___ here?",
                    listOf("near", "next", "close", "at"), 0),
                QuizQuestion("Complete: Go ___ for two blocks.",
                    listOf("straight", "left", "right", "corner"), 0),
                QuizQuestion("Complete: The bank is ___ your right.",
                    listOf("in", "at", "on", "from"), 2)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 8 — Activities
    // ═══════════════════════════════════════════════════════════
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Activities",
            titlePersian = "فعالیت‌ها",
            objectives = listOf(
                "Talk about hobbies",
                "Use can / can't for ability",
                "Use like / love + verb-ing",
                "Talk about sports"
            ),
            vocabulary = listOf(
                VocabWord("read", "خواندن", "/riːd/", "verb",
                    "I like reading books.", "دوست دارم کتاب بخونم."),
                VocabWord("play", "بازی کردن", "/pleɪ/", "verb",
                    "I play football.", "فوتبال بازی می‌کنم."),
                VocabWord("watch", "تماشا کردن", "/wɑːtʃ/", "verb",
                    "I watch movies.", "فیلم تماشا می‌کنم."),
                VocabWord("listen", "گوش دادن", "/ˈlɪsən/", "verb",
                    "I listen to music.", "به موسیقی گوش می‌دم."),
                VocabWord("cook", "آشپزی کردن", "/kʊk/", "verb",
                    "I love cooking.", "عاشق آشپزی هستم."),
                VocabWord("swim", "شنا کردن", "/swɪm/", "verb",
                    "Can you swim?", "می‌تونی شنا کنی؟"),
                VocabWord("draw", "نقاشی کشیدن", "/drɔː/", "verb",
                    "She draws very well.", "او خیلی خوب نقاشی می‌کشه."),
                VocabWord("sing", "آواز خواندن", "/sɪŋ/", "verb",
                    "I can't sing.", "نمی‌تونم آواز بخونم."),
                VocabWord("dance", "رقصیدن", "/dæns/", "verb",
                    "We dance at parties.", "در مهمونی‌ها می‌رقصیم."),
                VocabWord("run", "دویدن", "/rʌn/", "verb",
                    "I run every morning.", "هر صبح می‌دوم."),
                VocabWord("walk", "پیاده‌روی کردن", "/wɔːk/", "verb",
                    "We walk in the park.", "در پارک قدم می‌زنیم."),
                VocabWord("hobby", "سرگرمی", "/ˈhɑːbi/", "noun",
                    "My hobby is reading.", "سرگرمی من کتاب خواندنه.")
            ),
            idioms = listOf(
                IdiomExpression("hang out", "وقت گذراندن",
                    "I hang out with friends on weekends.",
                    "آخر هفته‌ها با دوستام وقت می‌گذرونم.", "informal"),
                IdiomExpression("have a blast", "خیلی خوش گذروندن",
                    "We had a blast at the party.",
                    "توی مهمونی خیلی خوش گذروندیم.", "informal"),
                IdiomExpression("kill time", "وقت کشتن",
                    "I read to kill time.",
                    "برای کشتن وقت می‌خونم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ing",
                    "swimming /ˈswɪmɪŋ/ — /ɪŋ/."),
                PronunciationTip("can / can't",
                    "can't /kænt/ در آمریکا.")
            ),
            culturalNotes = listOf(
                CulturalNote("Sports culture",
                    "ورزش در فرهنگ غربی مهمه."),
                CulturalNote("Weekend activities",
                    "آخر هفته‌ها برای تفریح و ورزش.")
            ),
            grammar = listOf(
                GrammarSection("can / can't",
                    """
                        I can swim.
                        She can cook.
                        They can't speak French.

                        Can you drive? — Yes, I can.
                    """.trimIndent()),
                GrammarSection("like + verb-ing",
                    """
                        I like reading.
                        I love cooking.
                        I enjoy swimming.
                    """.trimIndent()),
                GrammarSection("go + verb-ing",
                    """
                        go swimming
                        go shopping
                        go dancing

                        I go swimming every Sunday.
                    """.trimIndent()),
                GrammarSection("Present simple questions",
                    """
                        Do you play sports?
                        Does she like cooking?

                        Yes, I do. / No, I don't.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I like read books.", "I like reading books.", "بعد از like فعل +ing."),
                CommonMistake("I can to swim.", "I can swim.", "بعد از can فعل ساده."),
                CommonMistake("She cans cook.", "She can cook.", "can ثابت است."),
                CommonMistake("I go to swimming.", "I go swimming.", "بدون to.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you do in your free time?",
                    "وقت آزادت چیکار می‌کنی؟"),
                DialogueLine("B", "I love reading and watching movies. What about you?",
                    "عاشق کتاب خواندن و فیلم دیدنم. تو چطور؟"),
                DialogueLine("A", "I enjoy cooking. I try new recipes every weekend.",
                    "از آشپزی لذت می‌برم. هر آخر هفته دستور پخت جدید امتحان می‌کنم."),
                DialogueLine("B", "That's cool! Can you cook Persian food?",
                    "باحاله! می‌تونی غذای ایرانی بپزی؟"),
                DialogueLine("A", "Yes, I can! My mother taught me.",
                    "بله! مادرم یادم داد."),
                DialogueLine("B", "What's your favorite dish to cook?",
                    "غذای مورد علاقه‌ات برای پختن چیه؟"),
                DialogueLine("A", "I love making ghormeh sabzi.",
                    "عاشق درست کردن قرمه سبزی هستم."),
                DialogueLine("B", "I've never tried it. Maybe you can teach me!",
                    "تا حالا امتحانش نکردم. شاید بتونی یادم بدی!"),
                DialogueLine("A", "Sure! What sports do you play?",
                    "حتماً! چه ورزشی می‌کنی؟"),
                DialogueLine("B", "I play tennis. I go swimming too.",
                    "تنیس بازی می‌کنم. شنا هم می‌رم."),
                DialogueLine("A", "Can you swim well?",
                    "خوب شنا می‌کنی؟"),
                DialogueLine("B", "Yes, I can. I learned when I was five.",
                    "بله. پنج سالگی یاد گرفتم."),
                DialogueLine("A", "Do you play any instruments?",
                    "ساز هم می‌زنی؟"),
                DialogueLine("B", "I play the guitar, but not very well.",
                    "گیتار می‌زنم، ولی نه خیلی خوب."),
                DialogueLine("A", "That's still impressive! I can't play anything.",
                    "این هم قابل تحسینه! من هیچی نمی‌تونم بزنم."),
                DialogueLine("B", "You could learn! It's never too late.",
                    "می‌تونی یاد بگیری! هیچ‌وقت دیر نیست."),
                DialogueLine("A", "Maybe I will. Thanks for the encouragement.",
                    "شاید یاد بگیرم. ممنون برای تشویق."),
                DialogueLine("B", "Anytime! Let me know if you want lessons.",
                    "هر وقت! اگه کلاس خواستی خبرم کن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("A وقت آزادش چیکار می‌کنه؟", "آشپزی می‌کنه و دستور پخت جدید امتحان می‌کنه."),
                ComprehensionQuestion("B چه ورزش‌هایی می‌کنه؟", "تنیس و شنا."),
                ComprehensionQuestion("B چه سازی می‌زنه؟", "گیتار."),
                ComprehensionQuestion("A چه غذایی دوست داره بپزه؟", "قرمه سبزی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your hobbies.",
                    "درباره سرگرمی‌هات صحبت کن.",
                    "I like... / I love..."),
                SpeakingTask("Talk about what you can/can't do.",
                    "درباره چیزهایی که می‌تونی و نمی‌تونی انجام بدی صحبت کن.",
                    "I can... / I can't...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite hobby.",
                    "درباره سرگرمی مورد علاقه‌ات بنویس.",
                    100,
                    "Use like + verb-ing.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I like ___ books.",
                    listOf("read", "reading", "to read", "reads"), 1),
                QuizQuestion("Complete: She can ___ very well.",
                    listOf("to cook", "cooks", "cook", "cooking"), 2),
                QuizQuestion("Complete: I go ___ on Sundays.",
                    listOf("to swim", "swimming", "swim", "swims"), 1),
                QuizQuestion("What does 'hang out' mean?",
                    listOf("آویزون شدن", "وقت گذراندن", "بیرون رفتن", "خرید کردن"), 1),
                QuizQuestion("Complete: ___ you play tennis?",
                    listOf("Are", "Do", "Is", "Does"), 1),
                QuizQuestion("Complete: She ___ play the piano.",
                    listOf("can", "cans", "is can", "to can"), 0),
                QuizQuestion("Complete: I ___ cooking.",
                    listOf("enjoy", "enjoys", "enjoying", "enjoyed"), 0),
                QuizQuestion("What does 'have a blast' mean?",
                    listOf("انفجار", "خیلی خوش گذروندن", "بیرون رفتن", "دویدن"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 9 — Weather
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Weather",
            titlePersian = "آب و هوا",
            objectives = listOf(
                "Talk about weather",
                "Name seasons",
                "Use present continuous for weather",
                "Talk about seasonal activities"
            ),
            vocabulary = listOf(
                VocabWord("weather", "آب و هوا", "/ˈweðər/", "noun",
                    "The weather is nice.", "هوا خوبه."),
                VocabWord("sunny", "آفتابی", "/ˈsʌni/", "adjective",
                    "It's sunny today.", "امروز آفتابیه."),
                VocabWord("rainy", "بارانی", "/ˈreɪni/", "adjective",
                    "It's rainy in spring.", "بهار بارونیه."),
                VocabWord("cloudy", "ابری", "/ˈklaʊdi/", "adjective",
                    "It's cloudy today.", "امروز ابریه."),
                VocabWord("snowy", "برفی", "/ˈsnoʊi/", "adjective",
                    "It's snowy in winter.", "زمستون برفیه."),
                VocabWord("windy", "بادی", "/ˈwɪndi/", "adjective",
                    "It's windy today.", "امروز بادیه."),
                VocabWord("hot", "گرم", "/hɑːt/", "adjective",
                    "Summer is hot.", "تابستون گرمه."),
                VocabWord("cold", "سرد", "/koʊld/", "adjective",
                    "Winter is cold.", "زمستون سرده."),
                VocabWord("spring", "بهار", "/sprɪŋ/", "noun",
                    "Flowers bloom in spring.", "بهار گل‌ها شکوفه می‌دن."),
                VocabWord("summer", "تابستان", "/ˈsʌmər/", "noun",
                    "We swim in summer.", "تابستون شنا می‌کنیم."),
                VocabWord("autumn", "پاییز", "/ˈɔːtəm/", "noun",
                    "Leaves fall in autumn.", "پاییز برگ‌ها می‌ریزن."),
                VocabWord("winter", "زمستان", "/ˈwɪntər/", "noun",
                    "It snows in winter.", "زمستون برف میاد.")
            ),
            idioms = listOf(
                IdiomExpression("under the weather", "حالش خوب نبودن",
                    "I'm feeling under the weather.",
                    "حالم خوب نیست.", "informal"),
                IdiomExpression("rain or shine", "در هر شرایطی",
                    "We'll go, rain or shine.",
                    "در هر شرایطی می‌ریم.", "idiom"),
                IdiomExpression("save for a rainy day", "برای روز مبادا پس‌انداز",
                    "Save money for a rainy day.",
                    "برای روز مبادا پول پس‌انداز کن.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in weather",
                    "weather /ˈweðər/ — /ð/ صدادار."),
                PronunciationTip("seasons",
                    "spring /sprɪŋ/، summer /ˈsʌmər/، autumn /ˈɔːtəm/، winter /ˈwɪntər/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Small talk about weather",
                    "آب و هوا موضوع رایج Small Talk."),
                CulturalNote("Seasonal activities",
                    "هر فصل فعالیت‌های خاصی داره.")
            ),
            grammar = listOf(
                GrammarSection("Present continuous for weather",
                    """
                        It's raining now.
                        The sun is shining.

                        What's the weather like?
                    """.trimIndent()),
                GrammarSection("Future with going to",
                    """
                        It's going to rain.
                        It's going to be sunny tomorrow.
                    """.trimIndent()),
                GrammarSection("will for predictions",
                    """
                        It will be cold tomorrow.
                        I'll bring an umbrella.
                    """.trimIndent()),
                GrammarSection("Questions about weather",
                    """
                        What's the weather like?
                        How's the weather today?
                        Is it going to rain?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("How is the weather like?", "What's the weather like?", "ساختار صحیح."),
                CommonMistake("Weather is nice.", "The weather is nice.", "the لازم داره."),
                CommonMistake("It rains now.", "It's raining now.", "الان = continuous.")
            ),
            conversation = listOf(
                DialogueLine("A", "What's the weather like today?",
                    "امروز هوا چطوره؟"),
                DialogueLine("B", "It's sunny and warm. Perfect for a walk.",
                    "آفتابی و ملایمه. عالی برای پیاده‌روی."),
                DialogueLine("A", "Nice! What's your favorite season?",
                    "خوبه! فصل مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "I love spring. The flowers bloom everywhere.",
                    "عاشق بهارم. گل‌ها همه‌جا شکوفه می‌دن."),
                DialogueLine("A", "Me too! What about summer?",
                    "منم! تابستون چطور؟"),
                DialogueLine("B", "It's too hot for me. I prefer cooler weather.",
                    "برام خیلی گرمه. هوای خنک‌تر رو ترجیح می‌دم."),
                DialogueLine("A", "Do you like winter?",
                    "زمستون دوست داری؟"),
                DialogueLine("B", "Yes, especially when it snows.",
                    "بله، خصوصاً وقتی برف میاد."),
                DialogueLine("A", "Do you do any winter sports?",
                    "ورزش زمستانی می‌کنی؟"),
                DialogueLine("B", "Yes, I ski sometimes. What about you?",
                    "بله، گاهی اسکی می‌رم. تو چطور؟"),
                DialogueLine("A", "I mostly stay indoors in winter.",
                    "من زمستون بیشتر خونه می‌مونم."),
                DialogueLine("B", "That's understandable. It's cold outside.",
                    "قابل درکه. بیرون سرده."),
                DialogueLine("A", "What are you going to do this weekend?",
                    "این آخر هفته چیکار می‌کنی؟"),
                DialogueLine("B", "I'm going to visit my grandparents if the weather is good.",
                    "اگه هوا خوب باشه، می‌رم دیدن پدربزرگ و مادربزرگم."),
                DialogueLine("A", "The forecast says it's going to be sunny.",
                    "پیش‌بینی می‌گه آفتابی می‌شه."),
                DialogueLine("B", "Perfect! I'll definitely go.",
                    "عالی! حتماً می‌رم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("امروز هوا چطور است؟", "آفتابی و ملایم."),
                ComprehensionQuestion("فصل مورد علاقه B چیست؟", "بهار."),
                ComprehensionQuestion("B چه ورزش زمستانی می‌کند؟", "اسکی."),
                ComprehensionQuestion("B این آخر هفته چیکار می‌کند؟", "به دیدن پدربزرگ و مادربزرگش می‌رود.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about weather in your city.",
                    "درباره آب و هوای شهرت صحبت کن.",
                    "It's usually... in summer."),
                SpeakingTask("Describe your favorite season.",
                    "فصل مورد علاقه‌ات رو توصیف کن.",
                    "I love... because...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite season.",
                    "درباره فصل مورد علاقه‌ات بنویس.",
                    100,
                    "Use weather vocabulary.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: What's the weather ___?",
                    listOf("like", "as", "than", "of"), 0),
                QuizQuestion("Complete: It's ___ rain.",
                    listOf("going to", "will", "go to", "goes"), 0),
                QuizQuestion("Complete: It's ___ today.",
                    listOf("sun", "sunny", "sunshine", "sunny day"), 1),
                QuizQuestion("What does 'under the weather' mean?",
                    listOf("زیر بارون", "حالش خوب نیست", "خوشحال", "سلامت"), 1),
                QuizQuestion("Complete: ___ weather is nice.",
                    listOf("A", "An", "The", "-"), 2),
                QuizQuestion("Complete: Flowers bloom in ___.",
                    listOf("winter", "spring", "summer", "autumn"), 1),
                QuizQuestion("Complete: It's ___ in winter.",
                    listOf("hot", "warm", "cold", "cool"), 2),
                QuizQuestion("What does 'rain or shine' mean?",
                    listOf("بارون یا آفتاب", "در هر شرایطی", "بارونی", "آفتابی"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 10 — Shopping
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Shopping",
            titlePersian = "خرید",
            objectives = listOf(
                "Talk about shopping",
                "Ask about prices",
                "Use this/these/that/those",
                "Talk about sizes and colors"
            ),
            vocabulary = listOf(
                VocabWord("price", "قیمت", "/praɪs/", "noun",
                    "What's the price?", "قیمتش چنده؟"),
                VocabWord("cheap", "ارزان", "/tʃiːp/", "adjective",
                    "This shirt is cheap.", "این پیراهن ارزونه."),
                VocabWord("expensive", "گران", "/ɪkˈspensɪv/", "adjective",
                    "That's too expensive.", "اون خیلی گرونه."),
                VocabWord("size", "سایز", "/saɪz/", "noun",
                    "What size are you?", "چه سایزی هستی؟"),
                VocabWord("color", "رنگ", "/ˈkʌlər/", "noun",
                    "What color is it?", "چه رنگیه؟"),
                VocabWord("buy", "خریدن", "/baɪ/", "verb",
                    "I want to buy this.", "می‌خوام اینو بخرم."),
                VocabWord("pay", "پرداخت کردن", "/peɪ/", "verb",
                    "How much did you pay?", "چقدر پرداخت کردی؟"),
                VocabWord("cash", "نقد", "/kæʃ/", "noun",
                    "Do you take cash?", "نقد می‌گیرید؟"),
                VocabWord("card", "کارت", "/kɑːrd/", "noun",
                    "Can I pay by card?", "می‌تونم با کارت پرداخت کنم؟"),
                VocabWord("sale", "حراج", "/seɪl/", "noun",
                    "The shoes are on sale.", "کفش‌ها حراج هستن."),
                VocabWord("shop", "مغازه", "/ʃɑːp/", "noun",
                    "The shop is open.", "مغازه بازه."),
                VocabWord("receipt", "رسید", "/rɪˈsiːt/", "noun",
                    "Keep the receipt.", "رسید رو نگه دار.")
            ),
            idioms = listOf(
                IdiomExpression("on sale", "حراج",
                    "The shoes are on sale.",
                    "کفش‌ها حراج هستن.", "neutral"),
                IdiomExpression("window shopping", "ویترین‌گردی",
                    "We went window shopping.",
                    "رفتیم ویترین‌گردی.", "informal"),
                IdiomExpression("cost an arm and a leg", "خیلی گران بودن",
                    "That bag cost an arm and a leg.",
                    "اون کیف خیلی گرون بود.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("this / that",
                    "this /ðɪs/، that /ðæt/."),
                PronunciationTip("receipt",
                    "receipt /rɪˈsiːt/ — p سایلنت.")
            ),
            culturalNotes = listOf(
                CulturalNote("Shopping malls",
                    "مال‌ها در غرب رایجند."),
                CulturalNote("Return policy",
                    "بازگشت کالا رایجه.")
            ),
            grammar = listOf(
                GrammarSection("this / these / that / those",
                    """
                        this = این (نزدیک مفرد)
                        these = این‌ها (نزدیک جمع)
                        that = آن (دور مفرد)
                        those = آن‌ها (دور جمع)
                    """.trimIndent()),
                GrammarSection("How much is/are...?",
                    """
                        How much is this shirt?
                        How much are these shoes?
                    """.trimIndent()),
                GrammarSection("Present continuous for shopping",
                    """
                        I'm looking for a blue shirt.
                        She's trying on shoes.
                    """.trimIndent()),
                GrammarSection("Questions about price",
                    """
                        How much is it?
                        How much does it cost?
                        Can I have the receipt?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("How much are this shirt?", "How much is this shirt?", "برای مفرد is."),
                CommonMistake("This shoes are nice.", "These shoes are nice.", "جمع = these."),
                CommonMistake("a shirt red", "a red shirt", "صفت قبل از اسم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Excuse me, how much is this shirt?",
                    "ببخشید، این پیراهن چنده؟"),
                DialogueLine("B", "It's 25 dollars.",
                    "۲۵ دلاره."),
                DialogueLine("A", "And these shoes?",
                    "و این کفش‌ها؟"),
                DialogueLine("B", "Those are 40 dollars.",
                    "اون‌ها ۴۰ دلارن."),
                DialogueLine("A", "That's a bit expensive. Do you have anything cheaper?",
                    "یه کم گرونه. چیز ارزون‌تری دارید؟"),
                DialogueLine("B", "Yes, these are on sale for 30 dollars.",
                    "بله، اینا ۳۰ دلار حراج هستن."),
                DialogueLine("A", "That's better. What sizes do you have?",
                    "این بهتره. چه سایزهایی دارید؟"),
                DialogueLine("B", "We have small, medium, and large.",
                    "اسمال، مدیوم و لارج داریم."),
                DialogueLine("A", "I'll take the medium. Can I try them on?",
                    "مدیوم می‌خوام. می‌تونم امتحانشون کنم؟"),
                DialogueLine("B", "Of course. The fitting room is over there.",
                    "البته. اتاق پرو اونجاست."),
                DialogueLine("A", "Thanks. They fit well. I'll take them.",
                    "ممنون. اندازه هستن. اینا رو می‌خرم."),
                DialogueLine("B", "Great! Cash or card?",
                    "عالی! نقد یا کارت؟"),
                DialogueLine("A", "Card, please. And could I have a bag?",
                    "کارت، لطفاً. و می‌تونم یه کیسه بگیرم؟"),
                DialogueLine("B", "Of course. Here you go.",
                    "البته. بفرمایید."),
                DialogueLine("A", "Thank you. Do you have a return policy?",
                    "ممنون. سیاست بازگشت دارید؟"),
                DialogueLine("B", "Yes, 30 days with the receipt.",
                    "بله، ۳۰ روز با رسید.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("پیراهن چقدر بود؟", "۲۵ دلار."),
                ComprehensionQuestion("کفش‌های حراج چقدر بودند؟", "۳۰ دلار."),
                ComprehensionQuestion("مشتری چه سایزی خرید؟", "مدیوم."),
                ComprehensionQuestion("سیاست بازگشت چقدر است؟", "۳۰ روز با رسید.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Role-play shopping.",
                    "نقش‌بازی خرید.",
                    "How much is...? / Can I try...?"),
                SpeakingTask("Talk about your favorite shop.",
                    "درباره مغازه مورد علاقه‌ات صحبت کن.",
                    "I usually shop at...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your favorite shop.",
                    "درباره مغازه مورد علاقه‌ات بنویس.",
                    100,
                    "Describe what they sell and why you like it.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: How much ___ these shoes?",
                    listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: ___ shirt is nice.",
                    listOf("This", "These", "Those", "Them"), 0),
                QuizQuestion("Complete: I'm ___ a blue shirt.",
                    listOf("wear", "wears", "wearing", "wore"), 2),
                QuizQuestion("Complete: What color ___ it?",
                    listOf("is", "are", "have", "has"), 0),
                QuizQuestion("Complete: ___ shoes are new.",
                    listOf("This", "That", "These", "Them"), 2),
                QuizQuestion("Complete: I want to ___ this shirt.",
                    listOf("buy", "buys", "buying", "bought"), 0),
                QuizQuestion("What does 'on sale' mean?",
                    listOf("حراج", "گران", "خرید", "فروشگاه"), 0),
                QuizQuestion("Complete: How much did you ___?",
                    listOf("buy", "pay", "cost", "spend"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 11 — Travel
    // ═══════════════════════════════════════════════════════════
    private fun chapter11(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 11,
            title = "Travel",
            titlePersian = "سفر",
            objectives = listOf(
                "Talk about travel",
                "Use past simple",
                "Book hotels and tickets",
                "Describe trips"
            ),
            vocabulary = listOf(
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb",
                    "I love traveling.", "عاشق سفرم."),
                VocabWord("trip", "سفر", "/trɪp/", "noun",
                    "How was your trip?", "سفرت چطور بود؟"),
                VocabWord("ticket", "بلیط", "/ˈtɪkɪt/", "noun",
                    "I bought a ticket.", "یه بلیط خریدم."),
                VocabWord("hotel", "هتل", "/hoʊˈtel/", "noun",
                    "We stayed in a hotel.", "در هتل موندیم."),
                VocabWord("airport", "فرودگاه", "/ˈerpɔːrt/", "noun",
                    "The airport is far.", "فرودگاه دوره."),
                VocabWord("passport", "پاسپورت", "/ˈpæspɔːrt/", "noun",
                    "Don't forget your passport!", "پاسپورتت رو فراموش نکن!"),
                VocabWord("luggage", "چمدان", "/ˈlʌɡɪdʒ/", "noun",
                    "My luggage is heavy.", "چمدانم سنگینه."),
                VocabWord("sightseeing", "بازدید", "/ˈsaɪtsiːɪŋ/", "noun",
                    "We went sightseeing.", "رفتیم بازدید."),
                VocabWord("abroad", "خارج", "/əˈbrɔːd/", "adverb",
                    "She lives abroad.", "او در خارج زندگی می‌کنه."),
                VocabWord("visit", "بازدید کردن", "/ˈvɪzɪt/", "verb",
                    "We visited the museum.", "از موزه بازدید کردیم."),
                VocabWord("arrive", "رسیدن", "/əˈraɪv/", "verb",
                    "We arrived late.", "دیر رسیدیم."),
                VocabWord("leave", "ترک کردن", "/liːv/", "verb",
                    "We left early.", "زود رفتیم.")
            ),
            idioms = listOf(
                IdiomExpression("catch a flight", "به پرواز رسیدن",
                    "We need to catch a flight at 6.",
                    "باید ساعت ۶ به پرواز برسیم.", "neutral"),
                IdiomExpression("hit the road", "راه افتادن",
                    "Let's hit the road early.",
                    "بیا زود راه بیفتیم.", "informal"),
                IdiomExpression("off the beaten track", "دور از مسیر معمول",
                    "We visited a village off the beaten track.",
                    "از یه دهکده دور از مسیر معمول بازدید کردیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("travel vs trip",
                    "travel /ˈtrævəl/، trip /trɪp/."),
                PronunciationTip("passport",
                    "passport /ˈpæspɔːrt/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Travel insurance",
                    "بیمه سفر رایجه."),
                CulturalNote("Airport etiquette",
                    "customs و immigration جدا هستند.")
            ),
            grammar = listOf(
                GrammarSection("Past simple",
                    """
                        I went to Paris.
                        She visited London.
                        We arrived late.
                    """.trimIndent()),
                GrammarSection("Was / Were",
                    """
                        I was tired.
                        They were happy.
                        Was the trip good?
                    """.trimIndent()),
                GrammarSection("Questions about travel",
                    """
                        Where did you go?
                        How was your trip?
                        Did you like it?
                    """.trimIndent()),
                GrammarSection("Time expressions",
                    """
                        last week, last month, last year
                        yesterday
                        two days ago

                        I went to Paris last summer.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I go to Paris last year.", "I went to Paris last year.", "past simple."),
                CommonMistake("Did you went?", "Did you go?", "بعد از did فعل ساده."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "How was your trip?",
                    "سفرت چطور بود؟"),
                DialogueLine("B", "It was amazing! I went to Turkey.",
                    "فوق‌العاده بود! رفتم ترکیه."),
                DialogueLine("A", "How long were you there?",
                    "چقدر اونجا بودی؟"),
                DialogueLine("B", "For two weeks.",
                    "دو هفته."),
                DialogueLine("A", "What did you do?",
                    "چیکار کردی؟"),
                DialogueLine("B", "We visited historical sites and relaxed on the beach.",
                    "از جاهای تاریخی بازدید کردیم و در ساحل استراحت کردیم."),
                DialogueLine("A", "Did you like the food?",
                    "غذا رو دوست داشتی؟"),
                DialogueLine("B", "Yes! It was delicious.",
                    "بله! خوشمزه بود."),
                DialogueLine("A", "Where did you stay?",
                    "کجا موندی؟"),
                DialogueLine("B", "In a small hotel near the center.",
                    "در یه هتل کوچیک نزدیک مرکز."),
                DialogueLine("A", "Would you go again?",
                    "دوباره می‌ری؟"),
                DialogueLine("B", "Definitely! I loved it.",
                    "قطعاً! عاشقش شدم."),
                DialogueLine("A", "I want to travel too.",
                    "منم می‌خوام سفر کنم."),
                DialogueLine("B", "Where would you like to go?",
                    "کجا دوست داری بری؟"),
                DialogueLine("A", "Maybe Italy or Japan.",
                    "شاید ایتالیا یا ژاپن."),
                DialogueLine("B", "Both are amazing. Save up and go!",
                    "هر دو فوق‌العاده‌ان. پس‌انداز کن و برو!"),
                DialogueLine("A", "I will. Thanks for the motivation!",
                    "می‌کنم. ممنون برای انگیزه!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B کجا سفر کرد؟", "ترکیه."),
                ComprehensionQuestion("چقدر اونجا بود؟", "دو هفته."),
                ComprehensionQuestion("B کجا موند؟", "هتل کوچک نزدیک مرکز."),
                ComprehensionQuestion("A دوست دارد کجا سفر کند؟", "ایتالیا یا ژاپن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your last trip.",
                    "درباره آخرین سفرت صحبت کن.",
                    "I went to... / It was..."),
                SpeakingTask("Talk about a place you want to visit.",
                    "درباره جایی که می‌خوای بری صحبت کن.",
                    "I'd like to go to...")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable trip.",
                    "درباره یه سفر به‌یادماندنی بنویس.",
                    120,
                    "Use past simple.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ to Paris last year.",
                    listOf("go", "went", "goes", "going"), 1),
                QuizQuestion("Complete: She ___ at home last night.",
                    listOf("were", "was", "is", "are"), 1),
                QuizQuestion("Complete: ___ you see the movie?",
                    listOf("Do", "Does", "Did", "Are"), 2),
                QuizQuestion("Complete: We ___ eat pizza.",
                    listOf("didn't", "don't", "doesn't", "aren't"), 0),
                QuizQuestion("Complete: I ___ a great time.",
                    listOf("have", "has", "had", "having"), 2),
                QuizQuestion("Complete: They ___ to school yesterday.",
                    listOf("go", "went", "goes", "going"), 1),
                QuizQuestion("What does 'hit the road' mean?",
                    listOf("زمین خوردن", "راه افتادن", "برگشتن", "توقف"), 1),
                QuizQuestion("Complete: I ___ a ticket yesterday.",
                    listOf("buy", "bought", "buying", "buys"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 12 — Review
    // ═══════════════════════════════════════════════════════════
    private fun chapter12(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 12,
            title = "Review",
            titlePersian = "مرور",
            objectives = listOf(
                "Review basic grammar",
                "Practice everyday conversations",
                "Use all learned structures",
                "Prepare for next level"
            ),
            vocabulary = listOf(
                VocabWord("review", "مرور", "/rɪˈvjuː/", "noun",
                    "Let's review the lesson.", "بیا درس رو مرور کنیم."),
                VocabWord("practice", "تمرین", "/ˈpræktɪs/", "noun",
                    "Practice makes perfect.", "تمرین باعث پیشرفت."),
                VocabWord("improve", "بهتر کردن", "/ɪmˈpruːv/", "verb",
                    "I want to improve.", "می‌خوام بهتر شم."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective",
                    "I feel confident.", "با اعتماد به نفس‌ام."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "You're making progress.", "داری پیشرفت می‌کنی."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "English is a fun challenge.", "انگلیسی چالش سرگرم‌کننده."),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun",
                    "It's OK to make mistakes.", "اشتباه کردن اشکالی نداره."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb",
                    "Continue practicing.", "تمرین رو ادامه بده."),
                VocabWord("succeed", "موفق شدن", "/səkˈsiːd/", "verb",
                    "You will succeed if you try.", "اگه تلاش کنی موفق می‌شی."),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun",
                    "Learning is a journey.", "یادگیری یه سفره."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "My goal is to speak English.", "هدفم صحبت کردن انگلیسیه."),
                VocabWord("future", "آینده", "/ˈfjuːtʃər/", "noun",
                    "The future is bright.", "آینده روشنه.")
            ),
            idioms = listOf(
                IdiomExpression("practice makes perfect", "تمرین باعث پیشرفت",
                    "Practice makes perfect — keep going!",
                    "تمرین باعث پیشرفت — ادامه بده!", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد",
                    "Don't give up. Rome wasn't built in a day.",
                    "تسلیم نشو. رم در یک روز ساخته نشد.", "idiom"),
                IdiomExpression("break a leg", "موفق باشی",
                    "Break a leg!",
                    "موفق باشی!", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Intonation",
                    "در سؤال‌ها صدای پایان جمله بالا می‌رود."),
                PronunciationTip("Linking",
                    "در گفتار طبیعی، کلمات به هم می‌چسبند.")
            ),
            culturalNotes = listOf(
                CulturalNote("Language learning",
                    "یادگیری زبان یک فرایند طولانیه."),
                CulturalNote("Mistakes",
                    "اشتباه کردن بخش طبیعی یادگیریه.")
            ),
            grammar = listOf(
                GrammarSection("Review: Be",
                    """
                        I am a student.
                        She is a teacher.
                        They are friends.
                    """.trimIndent()),
                GrammarSection("Review: Present simple",
                    """
                        I work every day.
                        She studies English.
                    """.trimIndent()),
                GrammarSection("Review: Past simple",
                    """
                        I went to Paris.
                        She saw a movie.
                    """.trimIndent()),
                GrammarSection("Review: can / like",
                    """
                        I can swim.
                        I like reading.
                        I go swimming every Sunday.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I am agree.", "I agree.", "agree فعل است."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده."),
                CommonMistake("He don't like it.", "He doesn't like it.", "برای he/she/it از doesn't.")
            ),
            conversation = listOf(
                DialogueLine("A", "How's your English going?",
                    "انگلیسی‌ت چطور پیش می‌ره؟"),
                DialogueLine("B", "Pretty well! I've been practicing every day.",
                    "خیلی خوب! هر روز تمرین کرده‌ام."),
                DialogueLine("A", "That's great. Do you feel more confident?",
                    "عالیه. با اعتماد به نفس‌تری؟"),
                DialogueLine("B", "Yes, much more. I can have basic conversations.",
                    "بله، خیلی بیشتر. می‌تونم مکالمات پایه داشته باشم."),
                DialogueLine("A", "Awesome! What was the hardest part?",
                    "عالی! سخت‌ترین قسمت چی بود؟"),
                DialogueLine("B", "Probably the grammar.",
                    "احتمالاً گرامر."),
                DialogueLine("A", "What helped you most?",
                    "چی بیشتر کمک کرد؟"),
                DialogueLine("B", "Watching movies and talking to people.",
                    "فیلم دیدن و صحبت با مردم."),
                DialogueLine("A", "That makes sense. What's your next goal?",
                    "منطقیه. هدف بعدی‌ت چیه؟"),
                DialogueLine("B", "I want to be fluent in two years.",
                    "می‌خوام در دو سال روان بشم."),
                DialogueLine("A", "That's a great goal. How will you get there?",
                    "هدف عالیه. چطور بهش می‌رسی؟"),
                DialogueLine("B", "Practice every day, take more classes, and read.",
                    "هر روز تمرین، کلاس بیشتر، و کتاب خوندن."),
                DialogueLine("A", "Sounds like a good plan. Good luck!",
                    "برنامه خوبی به نظر می‌رسه. موفق باشی!"),
                DialogueLine("B", "Thanks! Practice makes perfect.",
                    "ممنون! تمرین باعث پیشرفت."),
                DialogueLine("A", "Exactly. Rome wasn't built in a day.",
                    "دقیقاً. رم در یک روز ساخته نشد."),
                DialogueLine("B", "True. I'll be patient.",
                    "درسته. صبور خواهم بود."),
                DialogueLine("A", "That's the spirit. See you soon!",
                    "همین روحیه رو می‌خوام. به‌زودی می‌بینمت!"),
                DialogueLine("B", "See you! Thanks for the encouragement.",
                    "می‌بینمت! ممنون برای تشویق.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور انگلیسی‌اش را تقویت کرده؟", "تمرین روزانه، فیلم دیدن، صحبت با مردم."),
                ComprehensionQuestion("سخت‌ترین بخش برای B چه بود؟", "گرامر."),
                ComprehensionQuestion("هدف B چیست؟", "روان شدن در دو سال."),
                ComprehensionQuestion("B چطور به هدفش می‌رسد؟", "تمرین روزانه، کلاس، کتاب خواندن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your English journey.",
                    "درباره مسیر انگلیسی‌ات صحبت کن.",
                    "I started... / I've learned..."),
                SpeakingTask("Give advice to a beginner.",
                    "به یک مبتدی توصیه کن.",
                    "You should... / Don't give up...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your English goals.",
                    "درباره اهداف انگلیسی‌ات بنویس.",
                    120,
                    "Use all structures you've learned.")
            ),
            quiz = listOf(
                QuizQuestion("What does 'practice makes perfect' mean?",
                    listOf("تمرین سخت است", "تمرین باعث پیشرفت", "تمرین بی‌فایده", "تمرین طولانی"), 1),
                QuizQuestion("Complete: I ___ him yesterday.",
                    listOf("see", "saw", "seen", "seeing"), 1),
                QuizQuestion("Complete: She ___ English every day.",
                    listOf("study", "studies", "studying", "studied"), 1),
                QuizQuestion("Complete: I ___ swim.",
                    listOf("can", "cans", "am can", "to can"), 0),
                QuizQuestion("What does 'break a leg' mean?",
                    listOf("شکستن پا", "موفق باشی", "شکست خوردن", "دویدن"), 1),
                QuizQuestion("Complete: I ___ reading.",
                    listOf("like", "likes", "liking", "liked"), 0),
                QuizQuestion("Complete: ___ you ever been to Paris?",
                    listOf("Do", "Did", "Have", "Are"), 2),
                QuizQuestion("Complete: I ___ a student.",
                    listOf("is", "am", "are", "be"), 1)
            )
        )
    }
}