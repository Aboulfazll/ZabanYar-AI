package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCorners2 {

    const val BOOK_ID = "four_corners_2"

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
    // CHAPTER 1 — Life Stories
    // ═══════════════════════════════════════════════════════════
    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Life Stories",
            titlePersian = "داستان‌های زندگی",
            objectives = listOf(
                "Talk about past experiences",
                "Describe important events in your life",
                "Use the simple past",
                "Use common irregular past verbs",
                "Tell a short personal story"
            ),
            vocabulary = listOf(
                VocabWord("experience", "تجربه", "/ɪkˈspɪriəns/", "noun",
                    "It was a great experience.",
                    "تجربه خوبی بود."),
                VocabWord("memory", "خاطره", "/ˈmeməri/", "noun",
                    "I have many good memories from school.",
                    "خاطرات خوبی از مدرسه دارم."),
                VocabWord("trip", "سفر", "/trɪp/", "noun",
                    "We took a trip to the mountains.",
                    "به کوهستان سفر کردیم."),
                VocabWord("visit", "بازدید کردن", "/ˈvɪzɪt/", "verb",
                    "I visited my grandparents last weekend.",
                    "آخر هفته گذشته به دیدن پدربزرگ و مادربزرگم رفتم."),
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb",
                    "She traveled to several countries.",
                    "او به چند کشور سفر کرد."),
                VocabWord("arrive", "رسیدن", "/əˈraɪv/", "verb",
                    "We arrived at the hotel late.",
                    "دیر به هتل رسیدیم."),
                VocabWord("leave", "ترک کردن", "/liːv/", "verb",
                    "We left home early.",
                    "صبح زود خانه را ترک کردیم."),
                VocabWord("remember", "به یاد آوردن", "/rɪˈmembər/", "verb",
                    "I remember my first day at school.",
                    "اولین روز مدرسه‌ام را به یاد دارم."),
                VocabWord("forget", "فراموش کردن", "/fərˈɡet/", "verb",
                    "I never forget that day.",
                    "آن روز را هرگز فراموش نمی‌کنم."),
                VocabWord("special", "خاص", "/ˈspeʃəl/", "adjective",
                    "It was a very special day.",
                    "روز خیلی خاصی بود."),
                VocabWord("exciting", "هیجان‌انگیز", "/ɪkˈsaɪtɪŋ/", "adjective",
                    "The trip was exciting.",
                    "سفر هیجان‌انگیز بود."),
                VocabWord("surprising", "تعجب‌آور", "/sərˈpraɪzɪŋ/", "adjective",
                    "The ending was surprising.",
                    "پایان داستان تعجب‌آور بود.")
            ),
            idioms = listOf(
                IdiomExpression("Once upon a time", "روزی روزگاری",
                    "Once upon a time, I lived in a small village.",
                    "روزی روزگاری، در روستای کوچکی زندگی می‌کردم.", "storytelling"),
                IdiomExpression("a long time ago", "مدت زیادی پیش",
                    "I met him a long time ago.",
                    "مدت زیادی پیش او را ملاقات کردم.", "neutral"),
                IdiomExpression("the good old days", "روزهای خوب قدیم",
                    "We often talk about the good old days.",
                    "ما اغلب درباره روزهای خوب قدیم صحبت می‌کنیم.", "informal")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("grow up", "بزرگ شدن", "بزرگ شدن",
                    "I grew up in a small town.",
                    "در شهر کوچکی بزرگ شدم.", "No"),
                PhrasalVerb("come back", "برگشتن", "برگشتن",
                    "We came back home at midnight.",
                    "نیمه‌شب به خانه برگشتیم.", "No"),
                PhrasalVerb("look back", "به گذشته نگاه کردن", "به گذشته نگاه کردن",
                    "When I look back, I smile.",
                    "وقتی به گذشته نگاه می‌کنم، لبخند می‌زنم.", "No")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ed endings",
                    "پایان -ed در گذشته سه شکل دارد: /t/، /d/، /ɪd/."),
                PronunciationTip("visited",
                    "در visited پایان -ed به صورت /ɪd/ تلفظ می‌شود: /ˈvɪzɪtɪd/."),
                PronunciationTip("was / were",
                    "was برای I, he, she, it و were برای you, we, they.")
            ),
            culturalNotes = listOf(
                CulturalNote("Sharing memories",
                    "در فرهنگ‌های انگلیسی‌زبان، صحبت درباره خاطرات شخصی بخش مهمی از ارتباط اجتماعی است."),
                CulturalNote("Telling stories",
                    "در مکالمات غیررسمی، تعریف داستان‌های کوتاه از زندگی رایج است.")
            ),
            grammar = listOf(
                GrammarSection("Simple past of be",
                    """
                        I/He/She/It + was
                        You/We/They + were

                        I was at home.
                        They were happy.
                        She wasn't tired.
                        Were you at school?
                    """.trimIndent()),
                GrammarSection("Simple past regular verbs",
                    """
                        verb + ed
                        work → worked
                        play → played
                        visit → visited
                        study → studied
                    """.trimIndent()),
                GrammarSection("Common irregular verbs",
                    """
                        go → went
                        see → saw
                        eat → ate
                        have → had
                        come → came
                        buy → bought
                        leave → left
                        take → took
                    """.trimIndent()),
                GrammarSection("Questions with did",
                    """
                        Did + subject + verb?

                        Did you go to the party?
                        Where did you go?
                        What did you do?
                    """.trimIndent()),
                GrammarSection("Negative with didn't",
                    """
                        Subject + didn't + verb

                        I didn't go.
                        She didn't eat.
                        They didn't come.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده."),
                CommonMistake("Did you went?", "Did you go?", "بعد از did فعل ساده."),
                CommonMistake("She were at home.", "She was at home.", "با she از was."),
                CommonMistake("I was go to school.", "I went to school.", "برای گذشته فعل گذشته.")
            ),
            conversation = listOf(
                DialogueLine("A", "How was your weekend?", "آخر هفته‌ات چطور بود؟"),
                DialogueLine("B", "It was great! I went to the mountains with friends.", "عالی بود! با دوستام رفتم کوه."),
                DialogueLine("A", "Sounds fun. What did you do there?", "خوش به نظر می‌رسه. اونجا چیکار کردید؟"),
                DialogueLine("B", "We hiked, took photos, and had a picnic.", "کوه‌نوردی کردیم، عکس گرفتیم و پیک‌نیک داشتیم."),
                DialogueLine("A", "Did you see any animals?", "حیوونی دیدید؟"),
                DialogueLine("B", "Yes, we saw some birds and a fox!", "بله، چند تا پرنده و یه روباه دیدیم!"),
                DialogueLine("A", "Wow, cool! What did you eat?", "واو، باحال! چی خوردید؟"),
                DialogueLine("B", "We ate sandwiches and fruit. It was simple but nice.", "ساندویچ و میوه خوردیم. ساده بود ولی خوب."),
                DialogueLine("A", "Did you stay overnight?", "شب موندید؟"),
                DialogueLine("B", "No, we came back in the evening. What about you?", "نه، عصر برگشتیم. تو چطور؟"),
                DialogueLine("A", "I stayed home. I wasn't feeling well.", "من خونه موندم. حالم خوب نبود."),
                DialogueLine("B", "Oh, I'm sorry to hear that. Are you better now?", "اوه، متأسفم. الان بهتری؟"),
                DialogueLine("A", "Yes, thanks. I rested all weekend.", "بله، ممنون. تمام آخر هفته استراحت کردم."),
                DialogueLine("B", "Good. Do you have plans for next weekend?", "خوبه. برای آخر هفته بعد برنامه‌ای داری؟"),
                DialogueLine("A", "I might go shopping. I need new clothes.", "شاید برم خرید. لباس جدید لازم دارم."),
                DialogueLine("B", "Nice. Where did you buy your last clothes?", "خوبه. آخرین بار لباسات رو از کجا خریدی؟"),
                DialogueLine("A", "From a shop downtown. They had a sale.", "از یه مغازه مرکز شهر. حراج داشتن."),
                DialogueLine("B", "Sounds great. Maybe I'll come too.", "خوبه. شاید منم بیام."),
                DialogueLine("A", "Sure! The more the merrier.", "حتماً! هر چی بیشتر بهتر.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B آخر هفته کجا رفت؟", "به کوه با دوستانش."),
                ComprehensionQuestion("B چه کارهایی انجام داد؟", "کوه‌نوردی، عکس‌گرفتن و پیک‌نیک."),
                ComprehensionQuestion("A آخر هفته چیکار کرد؟", "خونه موند چون حالش خوب نبود."),
                ComprehensionQuestion("B چه حیواناتی دید؟", "چند پرنده و یک روباه."),
                ComprehensionQuestion("A برای آخر هفته بعد چه برنامه‌ای دارد؟", "شاید برود خرید لباس.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your last weekend.",
                    "درباره آخر هفته گذشته‌ات صحبت کن.",
                    "I went... / I saw... / I had..."),
                SpeakingTask("Tell a story about a trip.",
                    "داستانی از یک سفر تعریف کن.",
                    "Last year I went..."),
                SpeakingTask("Ask a friend about their past week.",
                    "از یک دوست درباره هفته گذشته‌اش بپرس.",
                    "Did you...? / What did you...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about your last weekend.",
                    "درباره آخر هفته گذشته‌ات بنویس.",
                    100,
                    "Use past simple and time expressions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ to the park yesterday.",
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
                QuizQuestion("Complete: Where ___ you go last night?",
                    listOf("do", "does", "did", "are"), 2),
                QuizQuestion("Complete: She ___ late yesterday.",
                    listOf("come", "came", "comes", "coming"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 2 — People
    // ═══════════════════════════════════════════════════════════
    private fun chapter2(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 2,
            title = "People",
            titlePersian = "مردم",
            objectives = listOf(
                "Describe people's appearance and personality",
                "Use comparatives and superlatives",
                "Compare friends and family members",
                "Talk about relationships"
            ),
            vocabulary = listOf(
                VocabWord("friendly", "خوش‌برخورد", "/ˈfrendli/", "adjective",
                    "She's very friendly.", "او خیلی خوش‌برخرده."),
                VocabWord("shy", "خجالتی", "/ʃaɪ/", "adjective",
                    "He's a bit shy.", "او یه کم خجالتیه."),
                VocabWord("funny", "بامزه", "/ˈfʌni/", "adjective",
                    "My friend is very funny.", "دوست من خیلی بامزه‌ست."),
                VocabWord("serious", "جدی", "/ˈsɪriəs/", "adjective",
                    "He's a serious person.", "او آدم جدی‌ایه."),
                VocabWord("kind", "مهربان", "/kaɪnd/", "adjective",
                    "She's very kind to everyone.", "او با همه خیلی مهربونه."),
                VocabWord("outgoing", "اجتماعی", "/ˈaʊtɡoʊɪŋ/", "adjective",
                    "He has an outgoing personality.", "او شخصیت اجتماعی داره."),
                VocabWord("tall", "قدبلند", "/tɔːl/", "adjective",
                    "My brother is tall.", "برادرم قدبلنده."),
                VocabWord("short", "کوتاه قد", "/ʃɔːrt/", "adjective",
                    "She's shorter than her sister.", "او از خواهرش کوتاه‌تره."),
                VocabWord("young", "جوان", "/jʌŋ/", "adjective",
                    "He looks young.", "او جوان به نظر می‌رسه."),
                VocabWord("old", "مسن", "/oʊld/", "adjective",
                    "My grandfather is old.", "پدربزرگم مسنه."),
                VocabWord("polite", "مؤدب", "/pəˈlaɪt/", "adjective",
                    "Be polite to elders.", "با بزرگ‌ترها مؤدب باش."),
                VocabWord("honest", "صادق", "/ˈɑːnɪst/", "adjective",
                    "Honest people are trusted.", "افراد صادق مورد اعتمادند.")
            ),
            idioms = listOf(
                IdiomExpression("look like", "شبیه بودن",
                    "She looks like her mother.", "او شبیه مادرشه.", "neutral"),
                IdiomExpression("take after", "شبیه بودن به",
                    "He takes after his father.", "او شبیه پدرشه.", "neutral"),
                IdiomExpression("get along with", "کنار آمدن با",
                    "I get along with my sister.", "من با خواهرم کنار میام.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Comparatives",
                    "صفت کوتاه + er: taller, shorter, older."),
                PronunciationTip("Superlatives",
                    "the + صفت کوتاه + est: the tallest, the oldest."),
                PronunciationTip("th sound",
                    "th در friendly نیست، ولی در brother و mother هست.")
            ),
            culturalNotes = listOf(
                CulturalNote("Comparing people",
                    "در غرب، مقایسه افراد مرسومه ولی باید محتاطانه باشه."),
                CulturalNote("Compliments",
                    "تعریف کردن درباره ظاهر یا شخصیت در غرب عادیه.")
            ),
            grammar = listOf(
                GrammarSection("Comparatives",
                    """
                        صفت کوتاه: -er + than
                        taller than, shorter than

                        صفت بلند: more + adjective + than
                        more serious than, more outgoing than
                    """.trimIndent()),
                GrammarSection("Superlatives",
                    """
                        the + -est (کوتاه)
                        the tallest, the oldest

                        the most + adjective (بلند)
                        the most outgoing, the most serious
                    """.trimIndent()),
                GrammarSection("as...as",
                    """
                        She is as tall as her mother.
                        He's not as funny as his brother.
                    """.trimIndent()),
                GrammarSection("Questions about people",
                    """
                        What does she look like?
                        What is she like?
                        Who do you look like?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She is more tall.", "She is taller.", "صفت کوتاه: -er."),
                CommonMistake("He is the most tall.", "He is the tallest.", "صفت کوتاه: -est."),
                CommonMistake("She looks like friendly.", "She looks friendly.", "look + adjective، بدون like.")
            ),
            conversation = listOf(
                DialogueLine("A", "Who's your best friend?", "بهترین دوستت کیه؟"),
                DialogueLine("B", "Her name is Maryam. We've known each other for years.", "اسمش مریمه. سال‌هاست همدیگه رو می‌شناسیم."),
                DialogueLine("A", "What's she like?", "چه جوریه؟"),
                DialogueLine("B", "She's really kind and funny. Very outgoing too.", "خیلی مهربون و بامزه‌ست. خیلی هم اجتماعیه."),
                DialogueLine("A", "What does she look like?", "ظاهرش چطوره؟"),
                DialogueLine("B", "She's tall with long dark hair and brown eyes.", "قدبلنده با موهای بلند تیره و چشمای قهوه‌ای."),
                DialogueLine("A", "How is she different from you?", "چطور با تو فرق داره؟"),
                DialogueLine("B", "She's more outgoing than me. I'm quieter.", "او از من اجتماعی‌تره. من ساکت‌ترم."),
                DialogueLine("A", "Do you get along well?", "خوب کنار میاید؟"),
                DialogueLine("B", "Yes, we rarely argue.", "بله، به‌ندرت بحث می‌کنیم."),
                DialogueLine("A", "That's nice. Who do you look like in your family?", "خوبه. در خانواده‌ات شبیه کی هستی؟"),
                DialogueLine("B", "My mother, I think. We have similar personalities.", "مادرم، فکر کنم. شخصیت‌های مشابهی داریم."),
                DialogueLine("A", "What about your siblings?", "خواهر و برادرات چطور؟"),
                DialogueLine("B", "My brother takes after my father.", "برادرم شبیه پدرمه."),
                DialogueLine("A", "Interesting. Is he like your father in personality too?", "جالب. از نظر شخصیتی هم شبیه پدرته؟"),
                DialogueLine("B", "Yes, they're both very serious and hardworking.", "بله، هر دو خیلی جدی و سخت‌کوشن."),
                DialogueLine("A", "It's amazing how family traits pass down.", "شگفت‌انگیزه که ویژگی‌های خانوادگی منتقل می‌شن."),
                DialogueLine("B", "Yes, and I love that about my family.", "بله، و این رو در خانواده‌ام دوست دارم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("دوست B چه ویژگی‌هایی دارد؟", "مهربان، بامزه و اجتماعی."),
                ComprehensionQuestion("تفاوت B و دوستش چیست؟", "دوستش از B اجتماعی‌تر است."),
                ComprehensionQuestion("B شبیه کی است؟", "شبیه مادرش."),
                ComprehensionQuestion("برادر B شبیه کیست؟", "شبیه پدرش.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your best friend.",
                    "بهترین دوستت رو توصیف کن.",
                    "She's... / She looks... / She's more... than me."),
                SpeakingTask("Compare two family members.",
                    "دو عضو خانواده رو مقایسه کن.",
                    "X is taller than Y. / X is more serious.")
            ),
            writingTasks = listOf(
                WritingTask("Write about a person you admire.",
                    "درباره شخصی که تحسینش می‌کنی بنویس.",
                    120,
                    "Use comparatives and superlatives.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: She is ___ than me.",
                    listOf("tall", "taller", "tallest", "more tall"), 1),
                QuizQuestion("Complete: He is the ___ in the class.",
                    listOf("tall", "taller", "tallest", "more tall"), 2),
                QuizQuestion("Complete: She's more outgoing ___ me.",
                    listOf("that", "than", "then", "as"), 1),
                QuizQuestion("What does 'take after' mean?",
                    listOf("مراقبت کردن", "شبیه بودن", "دنبال کردن", "بعد از"), 1),
                QuizQuestion("Complete: He's ___ serious as his father.",
                    listOf("as", "than", "more", "most"), 0),
                QuizQuestion("Complete: She looks ___ her mother.",
                    listOf("like", "as", "than", "more"), 0),
                QuizQuestion("Complete: My friend is very ___.",
                    listOf("friend", "friendly", "friendless", "friends"), 1),
                QuizQuestion("Complete: They get ___ well.",
                    listOf("on", "along", "at", "in"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 3 — Home and Neighborhood
    // ═══════════════════════════════════════════════════════════
    private fun chapter3(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 3,
            title = "Home and Neighborhood",
            titlePersian = "خانه و محله",
            objectives = listOf(
                "Describe homes and rooms",
                "Use there is / there are",
                "Talk about neighborhoods",
                "Use prepositions of place"
            ),
            vocabulary = listOf(
                VocabWord("apartment", "آپارتمان", "/əˈpɑːrtmənt/", "noun",
                    "I live in a small apartment.", "در آپارتمان کوچکی زندگی می‌کنم."),
                VocabWord("house", "خانه", "/haʊs/", "noun",
                    "They have a big house.", "آن‌ها خانه بزرگی دارند."),
                VocabWord("kitchen", "آشپزخانه", "/ˈkɪtʃɪn/", "noun",
                    "The kitchen is small.", "آشپزخانه کوچک است."),
                VocabWord("bedroom", "اتاق خواب", "/ˈbedruːm/", "noun",
                    "My bedroom is upstairs.", "اتاق خوابم بالا است."),
                VocabWord("bathroom", "حمام", "/ˈbæθruːm/", "noun",
                    "The bathroom is next to my room.", "حمام کنار اتاق منه."),
                VocabWord("living room", "اتاق نشیمن", "/ˈlɪvɪŋ ruːm/", "noun",
                    "We watch TV in the living room.", "در اتاق نشیمن تلویزیون می‌بینیم."),
                VocabWord("neighbor", "همسایه", "/ˈneɪbər/", "noun",
                    "Our neighbors are friendly.", "همسایه‌های ما خوش‌برخوردند."),
                VocabWord("neighborhood", "محله", "/ˈneɪbərhʊd/", "noun",
                    "It's a quiet neighborhood.", "محله ساکتی است."),
                VocabWord("quiet", "ساکت", "/ˈkwaɪət/", "adjective",
                    "The street is quiet.", "خیابان ساکت است."),
                VocabWord("busy", "شلوغ", "/ˈbɪzi/", "adjective",
                    "It's a busy street.", "خیابان شلوغی است."),
                VocabWord("near", "نزدیک", "/nɪr/", "preposition",
                    "The bank is near here.", "بانک نزدیک اینجاست."),
                VocabWord("far", "دور", "/fɑːr/", "adjective",
                    "The airport is far.", "فرودگاه دور است.")
            ),
            idioms = listOf(
                IdiomExpression("feel at home", "احساس راحتی کردن",
                    "Make yourself at home.", "راحت باش.", "neutral"),
                IdiomExpression("around the corner", "نزدیک / سر کوچه",
                    "The bakery is around the corner.", "نانوایی سر کوچه‌ست.", "neutral"),
                IdiomExpression("move in", "اسباب‌کشی کردن",
                    "We moved in last week.", "هفته پیش اسباب‌کشی کردیم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("there is / there are",
                    "there is /ðer ɪz/، there are /ðer ər/."),
                PronunciationTip("Compound nouns",
                    "در bedroom، bathroom، استرس روی کلمه اول.")
            ),
            culturalNotes = listOf(
                CulturalNote("Types of homes",
                    "در غرب، آپارتمان و خانه هر دو رایجند."),
                CulturalNote("Neighborhoods",
                    "محله‌ها اغلب شامل مغازه، پارک و مدرسه هستند.")
            ),
            grammar = listOf(
                GrammarSection("There is / There are",
                    """
                        There is + مفرد: There is a sofa.
                        There are + جمع: There are two beds.

                        منفی: There isn't / There aren't
                        سوال: Is there...? / Are there...?
                    """.trimIndent()),
                GrammarSection("Prepositions of place",
                    """
                        in, on, under, next to, between, behind, in front of

                        The book is on the table.
                        The cat is under the chair.
                    """.trimIndent()),
                GrammarSection("Articles a/an/the",
                    """
                        a/an: اسم مفرد نامشخص
                        the: اسم مشخص
                        بدون حرف تعریف: جمع کلی
                    """.trimIndent()),
                GrammarSection("Possessive 's and of",
                    """
                        Ali's house
                        The door of the house
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("There is two beds.", "There are two beds.", "جمع = there are."),
                CommonMistake("There have a table.", "There is a table.", "there is/are، نه have."),
                CommonMistake("The book is in the table.", "The book is on the table.", "برای سطح from on.")
            ),
            conversation = listOf(
                DialogueLine("A", "Where do you live?", "کجا زندگی می‌کنی؟"),
                DialogueLine("B", "I live in an apartment in the city center.", "در آپارتمانی در مرکز شهر زندگی می‌کنم."),
                DialogueLine("A", "How many rooms are there?", "چند تا اتاق داره؟"),
                DialogueLine("B", "There are three: a bedroom, a living room, and a kitchen.", "سه تا: اتاق خواب، نشیمن و آشپزخانه."),
                DialogueLine("A", "Is there a balcony?", "بالکن داره؟"),
                DialogueLine("B", "Yes, there is. It's small but nice.", "بله. کوچیکه ولی خوبه."),
                DialogueLine("A", "What's your neighborhood like?", "محله‌ات چطوره؟"),
                DialogueLine("B", "It's quiet and safe. There are shops nearby.", "ساکت و امنه. مغازه نزدیک هست."),
                DialogueLine("A", "Is there a park?", "پارک هست؟"),
                DialogueLine("B", "Yes, there's a small park next to my building.", "بله، یه پارک کوچیک کنار ساختمونمه."),
                DialogueLine("A", "Do you like living there?", "دوست داری اونجا زندگی کنی؟"),
                DialogueLine("B", "Yes, I do. It feels like home now.", "بله. الان حس خونه رو داره."),
                DialogueLine("A", "Where do your parents live?", "والدینت کجا زندگی می‌کنن؟"),
                DialogueLine("B", "They live in a house in the suburbs.", "در خانه‌ای در حومه شهر."),
                DialogueLine("A", "Is their house big?", "خونشون بزرگه؟"),
                DialogueLine("B", "Yes, it's quite big. It has a garden too.", "بله، نسبتاً بزرگه. باغ هم داره."),
                DialogueLine("A", "That sounds lovely.", "قشنگ به نظر می‌رسه."),
                DialogueLine("B", "Yes, it is. I visit them on weekends.", "بله. آخر هفته‌ها می‌رم دیدنشون.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B در چه نوع خانه‌ای زندگی می‌کند؟", "آپارتمان در مرکز شهر."),
                ComprehensionQuestion("آپارتمان B چند اتاق دارد؟", "سه اتاق."),
                ComprehensionQuestion("محله B چطور است؟", "ساکت و امن، با مغازه و پارک نزدیک."),
                ComprehensionQuestion("والدین B کجا زندگی می‌کنند؟", "خانه‌ای در حومه شهر.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your home.",
                    "خونت رو توصیف کن.",
                    "There is... / There are..."),
                SpeakingTask("Talk about your neighborhood.",
                    "درباره محله‌ات صحبت کن.",
                    "It's... / There are shops...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your home.",
                    "خونت رو توصیف کن.",
                    100,
                    "Use there is/are and prepositions.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: There ___ two beds.",
                    listOf("is", "are", "have", "has"), 1),
                QuizQuestion("Complete: The book is ___ the table.",
                    listOf("in", "on", "at", "from"), 1),
                QuizQuestion("Complete: ___ there a park near here?",
                    listOf("Are", "Is", "Have", "Has"), 1),
                QuizQuestion("Complete: I live in ___ apartment.",
                    listOf("a", "an", "the", "-"), 1),
                QuizQuestion("What does 'feel at home' mean?",
                    listOf("دلتنگی", "احساس راحتی", "خرید خانه", "اسباب‌کشی"), 1),
                QuizQuestion("Complete: There ___ a sofa in the room.",
                    listOf("are", "is", "have", "has"), 1),
                QuizQuestion("Complete: The cat is ___ the bed.",
                    listOf("on", "in", "of", "from"), 0),
                QuizQuestion("Complete: ___ is a small park nearby.",
                    listOf("There", "They", "It", "He"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 4 — Daily Routines
    // ═══════════════════════════════════════════════════════════
    private fun chapter4(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 4,
            title = "Daily Routines",
            titlePersian = "روتین روزانه",
            objectives = listOf(
                "Talk about daily routines",
                "Tell the time",
                "Use the present simple",
                "Use adverbs of frequency"
            ),
            vocabulary = listOf(
                VocabWord("wake up", "بیدار شدن", "/weɪk ʌp/", "phrasal verb",
                    "I wake up at 7.", "ساعت ۷ بیدار می‌شم."),
                VocabWord("get up", "بلند شدن", "/ɡet ʌp/", "phrasal verb",
                    "I get up at 7:30.", "ساعت ۷:۳۰ بلند می‌شم."),
                VocabWord("breakfast", "صبحانه", "/ˈbrekfəst/", "noun",
                    "I have breakfast at 8.", "ساعت ۸ صبحانه می‌خورم."),
                VocabWord("lunch", "ناهار", "/lʌntʃ/", "noun",
                    "We have lunch at noon.", "ظهر ناهار می‌خوریم."),
                VocabWord("dinner", "شام", "/ˈdɪnər/", "noun",
                    "We have dinner at 7.", "ساعت ۷ شام می‌خوریم."),
                VocabWord("work", "کار", "/wɜːrk/", "noun/verb",
                    "I start work at 9.", "ساعت ۹ کارم شروع می‌شه."),
                VocabWord("study", "درس خواندن", "/ˈstʌdi/", "verb",
                    "I study every evening.", "هر عصر درس می‌خونم."),
                VocabWord("usually", "معمولاً", "/ˈjuːʒuəli/", "adverb",
                    "I usually walk to work.", "معمولاً پیاده سر کار می‌رم."),
                VocabWord("sometimes", "گاهی", "/ˈsʌmtaɪmz/", "adverb",
                    "I sometimes work late.", "گاهی دیر کار می‌کنم."),
                VocabWord("never", "هرگز", "/ˈnevər/", "adverb",
                    "I never drink coffee.", "هرگز قهوه نمی‌خورم."),
                VocabWord("often", "غالباً", "/ˈɔːfən/", "adverb",
                    "I often read at night.", "غالباً شب‌ها می‌خونم."),
                VocabWord("always", "همیشه", "/ˈɔːlweɪz/", "adverb",
                    "She always gets up early.", "او همیشه زود بلند می‌شه.")
            ),
            idioms = listOf(
                IdiomExpression("early bird", "سحرخیز",
                    "My dad is an early bird.", "بابام سحرخیزه.", "informal"),
                IdiomExpression("night owl", "شب‌زنده‌دار",
                    "I'm a night owl.", "من شب‌زنده‌دارم.", "informal"),
                IdiomExpression("on time", "سر وقت",
                    "I always arrive on time.", "من همیشه سر وقت می‌رسم.", "neutral")
            ),
            pronunciationTips = listOf(
                PronunciationTip("Third-person -s",
                    "در he/she/it، فعل +s: works, gets, studies."),
                PronunciationTip("usually",
                    "usually /ˈjuːʒuəli/ — سه سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Breakfast culture",
                    "در غرب، صبحانه‌های مختلفی رایجه."),
                CulturalNote("Work schedules",
                    "9 to 5 ساعت کاری رایج در غربه.")
            ),
            grammar = listOf(
                GrammarSection("Present simple",
                    """
                        I/You/We/They + verb
                        He/She/It + verb + s

                        I work every day.
                        She works at a hospital.
                    """.trimIndent()),
                GrammarSection("Adverbs of frequency",
                    """
                        always → usually → often → sometimes → never

                        قبل از فعل اصلی، بعد از be:
                        I usually get up early.
                        She is always late.
                    """.trimIndent()),
                GrammarSection("Telling time",
                    """
                        It's 7 o'clock.
                        It's half past seven. (7:30)
                        It's quarter past seven. (7:15)
                        It's quarter to eight. (7:45)
                    """.trimIndent()),
                GrammarSection("Prepositions of time",
                    """
                        at + ساعت: at 7
                        in the + بخش روز: in the morning
                        on + روز: on Monday
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("She work every day.", "She works every day.", "سوم شخص مفرد +s."),
                CommonMistake("I always am tired.", "I am always tired.", "با be، قید بعد از be."),
                CommonMistake("I go to work in 8.", "I go to work at 8.", "برای ساعت از at.")
            ),
            conversation = listOf(
                DialogueLine("A", "What time do you usually get up?", "معمولاً چه ساعتی بیدار می‌شی؟"),
                DialogueLine("B", "I usually wake up at 6:30 and get up at 7.", "معمولاً ساعت ۶:۳۰ بیدار می‌شم و ساعت ۷ بلند می‌شم."),
                DialogueLine("A", "Do you have breakfast?", "صبحانه می‌خوری؟"),
                DialogueLine("B", "Yes, I always have breakfast at 7:30.", "بله، همیشه ساعت ۷:۳۰ صبحانه می‌خورم."),
                DialogueLine("A", "What do you usually eat?", "معمولاً چی می‌خوری؟"),
                DialogueLine("B", "I usually have eggs and toast.", "معمولاً تخم‌مرغ و نان تست می‌خورم."),
                DialogueLine("A", "What time do you start work?", "چه ساعتی کارت شروع می‌شه؟"),
                DialogueLine("B", "I start at 9 and finish at 5.", "ساعت ۹ شروع می‌شه و ۵ تموم می‌شه."),
                DialogueLine("A", "Do you work on weekends?", "آخر هفته‌ها کار می‌کنی؟"),
                DialogueLine("B", "Sometimes. But I usually rest on Sundays.", "گاهی. ولی معمولاً یکشنبه‌ها استراحت می‌کنم."),
                DialogueLine("A", "What do you do after work?", "بعد از کار چیکار می‌کنی؟"),
                DialogueLine("B", "I often go for a walk or read.", "غالباً پیاده‌روی می‌رم یا کتاب می‌خونم."),
                DialogueLine("A", "What time do you go to bed?", "چه ساعتی می‌خوابی؟"),
                DialogueLine("B", "Around 11. I never stay up late.", "حدود ۱۱. هرگز دیر بیدار نمی‌مونم."),
                DialogueLine("A", "That's a healthy routine.", "روتین سالمیه."),
                DialogueLine("B", "Thanks! It took a while to build.", "ممنون! ساختنش یه کم طول کشید.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چه ساعتی بیدار می‌شود؟", "ساعت ۶:۳۰."),
                ComprehensionQuestion("B صبحانه چه می‌خورد؟", "تخم‌مرغ و نان تست."),
                ComprehensionQuestion("B چه ساعتی کارش تمام می‌شود؟", "ساعت ۵."),
                ComprehensionQuestion("B بعد از کار چیکار می‌کند؟", "پیاده‌روی یا کتاب خواندن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your daily routine.",
                    "روتین روزانه‌ات رو توصیف کن.",
                    "I wake up at... / I usually..."),
                SpeakingTask("Talk about your weekend routine.",
                    "درباره روتین آخر هفته‌ات صحبت کن.",
                    "I often... / I sometimes...")
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
                QuizQuestion("Complete: They ___ work on Sundays.",
                    listOf("doesn't", "don't", "isn't", "aren't"), 1),
                QuizQuestion("Complete: What time ___ you get up?",
                    listOf("does", "do", "is", "are"), 1),
                QuizQuestion("Complete: I have breakfast ___ the morning.",
                    listOf("on", "at", "in", "from"), 2),
                QuizQuestion("Complete: ___ she work here?",
                    listOf("Do", "Does", "Is", "Are"), 1),
                QuizQuestion("What does 'night owl' mean?",
                    listOf("آدم شب‌زنده‌دار", "صبح‌خیز", "خسته", "خواب‌آلود"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 5 — Food
    // ═══════════════════════════════════════════════════════════
    private fun chapter5(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 5,
            title = "Food",
            titlePersian = "غذا",
            objectives = listOf(
                "Talk about food and meals",
                "Use countable and uncountable nouns",
                "Use some and any",
                "Order food at a restaurant"
            ),
            vocabulary = listOf(
                VocabWord("food", "غذا", "/fuːd/", "noun",
                    "I love Italian food.", "عاشق غذای ایتالیایی‌ام."),
                VocabWord("meal", "وعده غذایی", "/miːl/", "noun",
                    "We have three meals a day.", "روزی سه وعده غذا داریم."),
                VocabWord("rice", "برنج", "/raɪs/", "noun",
                    "We eat rice every day.", "هر روز برنج می‌خوریم."),
                VocabWord("bread", "نان", "/bred/", "noun",
                    "We need some bread.", "کمی نان لازم داریم."),
                VocabWord("meat", "گوشت", "/miːt/", "noun",
                    "She doesn't eat meat.", "او گوشت نمی‌خوره."),
                VocabWord("fruit", "میوه", "/fruːt/", "noun",
                    "Eat more fruit!", "میوه بیشتر بخور!"),
                VocabWord("vegetable", "سبزیجات", "/ˈvedʒtəbəl/", "noun",
                    "I like green vegetables.", "سبزیجات سبز دوست دارم."),
                VocabWord("water", "آب", "/ˈwɔːtər/", "noun",
                    "Can I have some water?", "می‌تونم کمی آب داشته باشم؟"),
                VocabWord("coffee", "قهوه", "/ˈkɔːfi/", "noun",
                    "I drink coffee every morning.", "هر صبح قهوه می‌خورم."),
                VocabWord("menu", "منو", "/ˈmenjuː/", "noun",
                    "Can I see the menu?", "می‌تونم منو رو ببینم؟"),
                VocabWord("order", "سفارش", "/ˈɔːrdər/", "verb",
                    "Are you ready to order?", "آماده سفارش هستید؟"),
                VocabWord("bill", "صورت‌حساب", "/bɪl/", "noun",
                    "Can we have the bill?", "می‌تونیم صورت‌حساب بگیریم؟")
            ),
            idioms = listOf(
                IdiomExpression("eat out", "بیرون غذا خوردن",
                    "We eat out every Friday.", "هر جمعه بیرون غذا می‌خوریم.", "neutral"),
                IdiomExpression("have a sweet tooth", "شیرینی‌دوست بودن",
                    "She has a sweet tooth.", "او شیرینی‌دوست است.", "idiom"),
                IdiomExpression("piece of cake", "خیلی راحت",
                    "The test was a piece of cake!", "امتحان خیلی راحت بود!", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th sound",
                    "th در thank و three صدای /θ/ دارد."),
                PronunciationTip("vegetable",
                    "vegetable /ˈvedʒtəbəl/ — سه سیلاب.")
            ),
            culturalNotes = listOf(
                CulturalNote("Eating out",
                    "در غرب، بیرون غذا خوردن رایجه."),
                CulturalNote("Tipping",
                    "در آمریکا، انعام ۱۵-۲۰٪ رایجه.")
            ),
            grammar = listOf(
                GrammarSection("Countable vs uncountable",
                    """
                        قابل شمارش: apple, egg, sandwich
                        غیرقابل شمارش: water, rice, bread

                        a / an + قابل شمارش مفرد: an apple
                        some + غیرقابل شمارش یا جمع: some water
                    """.trimIndent()),
                GrammarSection("some / any",
                    """
                        some در مثبت: I have some bread.
                        any در منفی و سوال: I don't have any milk.
                    """.trimIndent()),
                GrammarSection("Ordering food",
                    """
                        I'd like... please.
                        Can I have...?
                        I'll have...

                        I'd like a coffee, please.
                    """.trimIndent()),
                GrammarSection("How much / How many",
                    """
                        How much + غیرقابل شمارش: How much water?
                        How many + قابل شمارش: How many apples?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have some milks.", "I have some milk.", "milk غیرقابل شمارش."),
                CommonMistake("I'd like a water.", "I'd like some water.", "water غیرقابل شمارش."),
                CommonMistake("How many water?", "How much water?", "water غیرقابل شمارش.")
            ),
            conversation = listOf(
                DialogueLine("Waiter", "Good evening. Are you ready to order?", "عصر بخیر. آماده سفارش هستید؟"),
                DialogueLine("Customer", "Yes, I'd like a chicken sandwich, please.", "بله، یه ساندویچ مرغ می‌خوام، لطفاً."),
                DialogueLine("Waiter", "Would you like anything to drink?", "نوشیدنی چیزی میل دارید؟"),
                DialogueLine("Customer", "Yes, some water, please.", "بله، کمی آب، لطفاً."),
                DialogueLine("Waiter", "Anything else?", "چیز دیگه‌ای؟"),
                DialogueLine("Customer", "No, thanks. That's all.", "نه، ممنون. همین."),
                DialogueLine("Waiter", "Great. Your food will be ready soon.", "عالی. غذاتون به‌زودی آماده می‌شه."),
                DialogueLine("Customer", "Thank you. Could I have the bill after?", "ممنون. می‌تونم بعدش صورت‌حساب بگیرم؟"),
                DialogueLine("Waiter", "Of course. Cash or card?", "البته. نقد یا کارت؟"),
                DialogueLine("Customer", "Card, please.", "کارت، لطفاً."),
                DialogueLine("Waiter", "Here's your bill. Have a nice meal!", "اینم صورت‌حساب. غذای خوبی داشته باشید!"),
                DialogueLine("Customer", "Thanks. Do you have dessert?", "ممنون. دسر دارید؟"),
                DialogueLine("Waiter", "Yes, we have cake and ice cream.", "بله، کیک و بستنی داریم."),
                DialogueLine("Customer", "I'll have some chocolate cake.", "یه کم کیک شکلاتی می‌خورم."),
                DialogueLine("Waiter", "Excellent choice!", "انتخاب عالی!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("مشتری چه غذایی سفارش داد؟", "ساندویچ مرغ."),
                ComprehensionQuestion("چه نوشیدنی سفارش داد؟", "آب."),
                ComprehensionQuestion("چطور پرداخت کرد؟", "با کارت."),
                ComprehensionQuestion("چه دسری سفارش داد؟", "کیک شکلاتی.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Order food at a restaurant.",
                    "نقش‌بازی: در رستوران غذا سفارش بده.",
                    "I'd like... / Can I have...?"),
                SpeakingTask("Talk about your favorite food.",
                    "درباره غذای مورد علاقه‌ات صحبت کن.",
                    "I love... / My favorite is...")
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
                QuizQuestion("Complete: How ___ water?",
                    listOf("many", "much", "some", "any"), 1),
                QuizQuestion("Complete: I have ___ apple.",
                    listOf("a", "an", "some", "any"), 1),
                QuizQuestion("Complete: I'd like ___ coffee, please.",
                    listOf("a", "an", "some", "any"), 0),
                QuizQuestion("Complete: ___ you like some tea?",
                    listOf("Do", "Does", "Would", "Are"), 2),
                QuizQuestion("Complete: She ___ eat meat.",
                    listOf("don't", "doesn't", "isn't", "aren't"), 1),
                QuizQuestion("What does 'eat out' mean?",
                    listOf("بیرون غذا خوردن", "داخل غذا خوردن", "آشپزی کردن", "خرید کردن"), 0)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 6 — Shopping
    // ═══════════════════════════════════════════════════════════
    private fun chapter6(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 6,
            title = "Shopping",
            titlePersian = "خرید",
            objectives = listOf(
                "Talk about shopping",
                "Ask about prices",
                "Use this/that/these/those",
                "Use the present continuous"
            ),
            vocabulary = listOf(
                VocabWord("shop", "مغازه", "/ʃɑːp/", "noun",
                    "The shop is open.", "مغازه بازه."),
                VocabWord("price", "قیمت", "/praɪs/", "noun",
                    "What's the price?", "قیمتش چنده؟"),
                VocabWord("cheap", "ارزان", "/tʃiːp/", "adjective",
                    "This shirt is cheap.", "این پیراهن ارزونه."),
                VocabWord("expensive", "گران", "/ɪkˈspensɪv/", "adjective",
                    "That's too expensive.", "اون خیلی گرونه."),
                VocabWord("clothes", "لباس", "/kloʊðz/", "noun",
                    "I need new clothes.", "لباس جدید لازم دارم."),
                VocabWord("shirt", "پیراهن", "/ʃɜːrt/", "noun",
                    "This shirt is nice.", "این پیراهن قشنگه."),
                VocabWord("shoes", "کفش", "/ʃuːz/", "noun",
                    "These shoes are new.", "این کفش‌ها نو هستن."),
                VocabWord("color", "رنگ", "/ˈkʌlər/", "noun",
                    "What color is it?", "چه رنگیه؟"),
                VocabWord("size", "سایز", "/saɪz/", "noun",
                    "What size are you?", "چه سایزی هستی؟"),
                VocabWord("buy", "خریدن", "/baɪ/", "verb",
                    "I want to buy this.", "می‌خوام اینو بخرم."),
                VocabWord("pay", "پرداخت کردن", "/peɪ/", "verb",
                    "How much did you pay?", "چقدر پرداخت کردی؟"),
                VocabWord("cash", "نقد", "/kæʃ/", "noun",
                    "Do you take cash?", "نقد می‌گیرید؟")
            ),
            idioms = listOf(
                IdiomExpression("on sale", "حراج",
                    "The shoes are on sale.", "کفش‌ها حراج هستن.", "neutral"),
                IdiomExpression("window shopping", "ویترین‌گردی",
                    "We went window shopping.", "رفتیم ویترین‌گردی.", "informal"),
                IdiomExpression("cost an arm and a leg", "خیلی گران بودن",
                    "That bag cost an arm and a leg.", "اون کیف خیلی گرون بود.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("this / that",
                    "this /ðɪs/، that /ðæt/ — صدای /ð/."),
                PronunciationTip("clothes",
                    "clothes /kloʊðz/ — th صدادار.")
            ),
            culturalNotes = listOf(
                CulturalNote("Shopping in the West",
                    "در غرب، خرید در مال‌ها رایجه."),
                CulturalNote("Black Friday",
                    "در آمریکا، روز تخفیف بزرگه.")
            ),
            grammar = listOf(
                GrammarSection("this / that / these / those",
                    """
                        این: this / these
                        آن: that / those

                        this shirt / these shirts
                    """.trimIndent()),
                GrammarSection("Present continuous",
                    """
                        am/is/are + verb-ing

                        I'm wearing a blue shirt.
                        She's buying shoes.
                    """.trimIndent()),
                GrammarSection("How much is/are...?",
                    """
                        How much is + مفرد؟
                        How much are + جمع؟
                    """.trimIndent()),
                GrammarSection("Colors as adjectives",
                    """
                        color + noun:
                        a red car / a blue shirt
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("How much are this shirt?", "How much is this shirt?", "برای مفرد از is."),
                CommonMistake("This shoes are nice.", "These shoes are nice.", "برای جمع از these."),
                CommonMistake("a shirt red", "a red shirt", "ترتیب صفت + اسم.")
            ),
            conversation = listOf(
                DialogueLine("A", "Excuse me, how much is this shirt?", "ببخشید، این پیراهن چنده؟"),
                DialogueLine("B", "It's 25 dollars.", "۲۵ دلاره."),
                DialogueLine("A", "And these shoes?", "و این کفش‌ها؟"),
                DialogueLine("B", "Those are 40 dollars.", "اون‌ها ۴۰ دلارن."),
                DialogueLine("A", "That's a bit expensive. Do you have anything cheaper?", "یه کم گرونه. چیز ارزون‌تری دارید؟"),
                DialogueLine("B", "Yes, these are on sale for 30 dollars.", "بله، اینا ۳۰ دلار حراج هستن."),
                DialogueLine("A", "That's better. What sizes do you have?", "این بهتره. چه سایزهایی دارید؟"),
                DialogueLine("B", "We have small, medium, and large.", "اسمال، مدیوم و لارج داریم."),
                DialogueLine("A", "I'll take the medium. Can I try them on?", "مدیوم می‌خوام. می‌تونم امتحانشون کنم؟"),
                DialogueLine("B", "Of course. The fitting room is over there.", "البته. اتاق پرو اونجاست."),
                DialogueLine("A", "Thanks. They fit well. I'll take them.", "ممنون. اندازه هستن. اینا رو می‌خرم."),
                DialogueLine("B", "Great! Cash or card?", "عالی! نقد یا کارت؟"),
                DialogueLine("A", "Card, please. And could I have a bag?", "کارت، لطفاً. و می‌تونم یه کیسه بگیرم؟"),
                DialogueLine("B", "Of course. Here you go.", "البته. بفرمایید."),
                DialogueLine("A", "Thank you. Do you have a return policy?", "ممنون. سیاست بازگشت دارید؟"),
                DialogueLine("B", "Yes, 30 days with the receipt.", "بله، ۳۰ روز با رسید.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("پیراهن چقدر بود؟", "۲۵ دلار."),
                ComprehensionQuestion("کفش‌های حراج چقدر بودند؟", "۳۰ دلار."),
                ComprehensionQuestion("مشتری چه سایزی خرید؟", "مدیوم."),
                ComprehensionQuestion("سیاست بازگشت چقدر است؟", "۳۰ روز با رسید.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Role-play shopping for clothes.",
                    "نقش‌بازی: خرید لباس.",
                    "How much is...? / Can I try...?"),
                SpeakingTask("Describe what you're wearing today.",
                    "توصیف کن امروز چی پوشیدی.",
                    "I'm wearing...")
            ),
            writingTasks = listOf(
                WritingTask("Describe your favorite clothes.",
                    "لباس‌های مورد علاقه‌ات رو توصیف کن.",
                    100,
                    "Use colors and sizes.")
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
    // CHAPTER 7 — Weather and Seasons
    // ═══════════════════════════════════════════════════════════
    private fun chapter7(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 7,
            title = "Weather and Seasons",
            titlePersian = "آب و هوا و فصل‌ها",
            objectives = listOf(
                "Talk about weather and seasons",
                "Use future with going to",
                "Describe weather conditions",
                "Talk about seasonal activities"
            ),
            vocabulary = listOf(
                VocabWord("weather", "آب و هوا", "/ˈweðər/", "noun",
                    "The weather is nice today.", "امروز هوا خوبه."),
                VocabWord("sunny", "آفتابی", "/ˈsʌni/", "adjective",
                    "It's sunny today.", "امروز آفتابیه."),
                VocabWord("rainy", "بارانی", "/ˈreɪni/", "adjective",
                    "It's rainy in spring.", "بهار بارونیه."),
                VocabWord("cloudy", "ابری", "/ˈklaʊdi/", "adjective",
                    "The sky is cloudy.", "آسمون ابریه."),
                VocabWord("snowy", "برفی", "/ˈsnoʊi/", "adjective",
                    "It's snowy in winter.", "زمستون برفیه."),
                VocabWord("windy", "بادی", "/ˈwɪndi/", "adjective",
                    "It's windy today.", "امروز بادیه."),
                VocabWord("hot", "گرم", "/hɑːt/", "adjective",
                    "Summer is hot.", "تابستون گرمه."),
                VocabWord("cold", "سرد", "/koʊld/", "adjective",
                    "Winter is cold.", "زمستون سرده."),
                VocabWord("warm", "ملایم", "/wɔːrm/", "adjective",
                    "Spring is warm.", "بهار ملایمه."),
                VocabWord("cool", "خنک", "/kuːl/", "adjective",
                    "Autumn is cool.", "پاییز خنکه."),
                VocabWord("spring", "بهار", "/sprɪŋ/", "noun",
                    "Flowers bloom in spring.", "در بهار گل‌ها شکوفه می‌دن."),
                VocabWord("winter", "زمستان", "/ˈwɪntər/", "noun",
                    "We ski in winter.", "در زمستان اسکی می‌ریم.")
            ),
            idioms = listOf(
                IdiomExpression("under the weather", "حالش خوب نبودن",
                    "I'm feeling under the weather.", "حالم خوب نیست.", "informal"),
                IdiomExpression("rain or shine", "در هر شرایطی",
                    "We'll go, rain or shine.", "در هر شرایطی می‌ریم.", "idiom"),
                IdiomExpression("save for a rainy day", "برای روز مبادا پس‌انداز کردن",
                    "Save money for a rainy day.", "برای روز مبادا پول پس‌انداز کن.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in weather",
                    "weather /ˈweðər/ — th صدادار."),
                PronunciationTip("seasons",
                    "spring /sprɪŋ/، summer /ˈsʌmər/، autumn /ˈɔːtəm/، winter /ˈwɪntər/.")
            ),
            culturalNotes = listOf(
                CulturalNote("Small talk about weather",
                    "آب و هوا موضوع رایج Small Talk در غربه."),
                CulturalNote("Seasonal activities",
                    "فصل‌ها فعالیت‌های خاصی دارن.")
            ),
            grammar = listOf(
                GrammarSection("Future with going to",
                    """
                        am/is/are + going to + verb

                        It's going to rain.
                        We're going to travel in summer.
                    """.trimIndent()),
                GrammarSection("will for predictions",
                    """
                        It will be cold tomorrow.
                        I'll bring an umbrella.
                    """.trimIndent()),
                GrammarSection("Present continuous for weather",
                    """
                        It's raining now.
                        The sun is shining.
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
                CommonMistake("It will rain tomorrow.", "It's going to rain tomorrow.", "برای پیش‌بینی نزدیک: going to."),
                CommonMistake("Weather is nice.", "The weather is nice.", "the لازم داره.")
            ),
            conversation = listOf(
                DialogueLine("A", "What's the weather like today?", "امروز هوا چطوره؟"),
                DialogueLine("B", "It's sunny and warm. Perfect for a walk.", "آفتابی و ملایمه. عالی برای پیاده‌روی."),
                DialogueLine("A", "Nice! What's your favorite season?", "خوبه! فصل مورد علاقه‌ات چیه؟"),
                DialogueLine("B", "I love spring. The flowers bloom everywhere.", "عاشق بهارم. گل‌ها همه‌جا شکوفه می‌دن."),
                DialogueLine("A", "Me too! What about summer?", "منم! تابستون چطور؟"),
                DialogueLine("B", "It's too hot for me. I prefer cooler weather.", "برام خیلی گرمه. هوای خنک‌تر رو ترجیح می‌دم."),
                DialogueLine("A", "Do you like winter?", "زمستون دوست داری؟"),
                DialogueLine("B", "Yes, especially when it snows.", "بله، خصوصاً وقتی برف میاد."),
                DialogueLine("A", "Do you do any winter sports?", "ورزش زمستانی می‌کنی؟"),
                DialogueLine("B", "Yes, I ski sometimes. What about you?", "بله، گاهی اسکی می‌رم. تو چطور؟"),
                DialogueLine("A", "I mostly stay indoors in winter.", "من زمستون بیشتر خونه می‌مونم."),
                DialogueLine("B", "That's understandable. It's cold outside.", "قابل درکه. بیرون سرده."),
                DialogueLine("A", "What are you going to do this weekend?", "این آخر هفته چیکار می‌کنی؟"),
                DialogueLine("B", "I'm going to visit my grandparents if the weather is good.", "اگه هوا خوب باشه، می‌رم دیدن پدربزرگ و مادربزرگم."),
                DialogueLine("A", "The forecast says it's going to be sunny.", "پیش‌بینی می‌گه آفتابی می‌شه."),
                DialogueLine("B", "Perfect! I'll definitely go.", "عالی! حتماً می‌رم.")
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
    // CHAPTER 8 — Free Time
    // ═══════════════════════════════════════════════════════════
    private fun chapter8(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 8,
            title = "Free Time",
            titlePersian = "وقت آزاد",
            objectives = listOf(
                "Talk about hobbies",
                "Use like/love/enjoy + verb-ing",
                "Talk about sports",
                "Invite someone out"
            ),
            vocabulary = listOf(
                VocabWord("hobby", "سرگرمی", "/ˈhɑːbi/", "noun",
                    "My hobby is reading.", "سرگرمی من کتاب خواندنه."),
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
                VocabWord("travel", "سفر کردن", "/ˈtrævəl/", "verb",
                    "We travel every summer.", "هر تابستان سفر می‌کنیم."),
                VocabWord("meet friends", "دیدن دوستان", "/miːt frendz/", "phrase",
                    "I meet friends on Fridays.", "جمعه‌ها دوستام رو می‌بینم."),
                VocabWord("go shopping", "خرید رفتن", "/ɡoʊ ˈʃɑːpɪŋ/", "phrase",
                    "I go shopping on weekends.", "آخر هفته‌ها خرید می‌رم."),
                VocabWord("relax", "استراحت کردن", "/rɪˈlæks/", "verb",
                    "I relax on weekends.", "آخر هفته‌ها استراحت می‌کنم.")
            ),
            idioms = listOf(
                IdiomExpression("kill time", "وقت کشتن",
                    "I read magazines to kill time.", "برای کشتن وقت مجله می‌خونم.", "informal"),
                IdiomExpression("have a blast", "خیلی خوش گذروندن",
                    "We had a blast at the party.", "توی مهمونی خیلی خوش گذروندیم.", "informal"),
                IdiomExpression("hang out", "وقت گذراندن",
                    "I hang out with friends on weekends.", "آخر هفته‌ها با دوستام وقت می‌گذرونم.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("-ing",
                    "swimming /ˈswɪmɪŋ/ — صدای /ɪŋ/."),
                PronunciationTip("can / can't",
                    "can't /kænt/ در آمریکا، /kɑːnt/ در بریتانیا.")
            ),
            culturalNotes = listOf(
                CulturalNote("Weekend activities",
                    "در غرب، آخر هفته‌ها برای ورزش و تفریح."),
                CulturalNote("Outdoor hobbies",
                    "پیاده‌روی و پیک‌نیک رایجند.")
            ),
            grammar = listOf(
                GrammarSection("Like + verb-ing",
                    """
                        I like reading.
                        I love cooking.
                        I enjoy swimming.

                        Do you like reading?
                    """.trimIndent()),
                GrammarSection("can / can't",
                    """
                        I can swim.
                        She can cook.
                        They can't speak French.
                    """.trimIndent()),
                GrammarSection("Present simple questions",
                    """
                        Do you + verb...?
                        Does he/she + verb...?

                        Do you play sports?
                    """.trimIndent()),
                GrammarSection("go + verb-ing",
                    """
                        go swimming
                        go shopping
                        go dancing

                        I go swimming every Sunday.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I like read books.", "I like reading books.", "بعد از like فعل +ing."),
                CommonMistake("I can to swim.", "I can swim.", "بعد از can فعل ساده."),
                CommonMistake("I go to swimming.", "I go swimming.", "go + verb-ing بدون to.")
            ),
            conversation = listOf(
                DialogueLine("A", "What do you do in your free time?", "وقت آزادت چیکار می‌کنی؟"),
                DialogueLine("B", "I love reading and watching movies. What about you?", "عاشق کتاب خواندن و فیلم دیدنم. تو چطور؟"),
                DialogueLine("A", "I enjoy cooking. I try new recipes every weekend.", "از آشپزی لذت می‌برم. هر آخر هفته دستور پخت جدید امتحان می‌کنم."),
                DialogueLine("B", "That's cool! Can you cook Persian food?", "باحاله! می‌تونی غذای ایرانی بپزی؟"),
                DialogueLine("A", "Yes, I can! My mother taught me.", "بله! مادرم یادم داد."),
                DialogueLine("B", "What's your favorite dish to cook?", "غذای مورد علاقه‌ات برای پختن چیه؟"),
                DialogueLine("A", "I love making ghormeh sabzi.", "عاشق درست کردن قرمه سبزی هستم."),
                DialogueLine("B", "I've never tried it. Maybe you can teach me!", "تا حالا امتحانش نکردم. شاید بتونی یادم بدی!"),
                DialogueLine("A", "Sure! What sports do you play?", "حتماً! چه ورزشی می‌کنی؟"),
                DialogueLine("B", "I play tennis. I go swimming too.", "تنیس بازی می‌کنم. شنا هم می‌رم."),
                DialogueLine("A", "Can you swim well?", "خوب شنا می‌کنی؟"),
                DialogueLine("B", "Yes, I can. I learned when I was five.", "بله. پنج سالگی یاد گرفتم."),
                DialogueLine("A", "Do you play any instruments?", "ساز هم می‌زنی؟"),
                DialogueLine("B", "I play the guitar, but not very well.", "گیتار می‌زنم، ولی نه خیلی خوب."),
                DialogueLine("A", "That's still impressive! I can't play anything.", "این هم قابل تحسینه! من هیچی نمی‌تونم بزنم."),
                DialogueLine("B", "You could learn! It's never too late.", "می‌تونی یاد بگیری! هیچ‌وقت دیر نیست.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B وقت آزادش چیکار می‌کنه؟", "کتاب خواندن و فیلم دیدن."),
                ComprehensionQuestion("A چه غذایی دوست داره بپزه؟", "قرمه سبزی."),
                ComprehensionQuestion("B چه ورزش‌هایی می‌کنه؟", "تنیس و شنا."),
                ComprehensionQuestion("B چه سازی می‌زنه؟", "گیتار.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your hobbies.",
                    "درباره سرگرمی‌هات صحبت کن.",
                    "I like... / I love..."),
                SpeakingTask("Invite a friend out.",
                    "یه دوست رو دعوت کن.",
                    "Do you want to...? / Let's...")
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
    // CHAPTER 9 — Future Plans
    // ═══════════════════════════════════════════════════════════
    private fun chapter9(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 9,
            title = "Future Plans",
            titlePersian = "برنامه‌های آینده",
            objectives = listOf(
                "Talk about future plans",
                "Use going to",
                "Use will for predictions",
                "Make arrangements"
            ),
            vocabulary = listOf(
                VocabWord("plan", "برنامه", "/plæn/", "noun",
                    "What's your plan?", "برنامه‌ات چیه؟"),
                VocabWord("tomorrow", "فردا", "/təˈmɑːroʊ/", "adverb",
                    "See you tomorrow!", "فردا می‌بینمت!"),
                VocabWord("soon", "به‌زودی", "/suːn/", "adverb",
                    "I'll see you soon.", "به‌زودی می‌بینمت."),
                VocabWord("visit", "دیدن کردن", "/ˈvɪzɪt/", "verb",
                    "I'll visit my family.", "خانواده‌ام رو می‌بینم."),
                VocabWord("start", "شروع کردن", "/stɑːrt/", "verb",
                    "I'll start a new job.", "یه شغل جدید شروع می‌کنم."),
                VocabWord("learn", "یاد گرفتن", "/lɜːrn/", "verb",
                    "I'm going to learn English.", "می‌خوام انگلیسی یاد بگیرم."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "My goal is to travel.", "هدفم سفر کردنه."),
                VocabWord("trip", "سفر", "/trɪp/", "noun",
                    "We're planning a trip.", "داریم یه سفر برنامه‌ریزی می‌کنیم."),
                VocabWord("book", "رزرو کردن", "/bʊk/", "verb",
                    "I'll book a hotel.", "هتل رزرو می‌کنم."),
                VocabWord("buy", "خریدن", "/baɪ/", "verb",
                    "I'm going to buy a ticket.", "می‌خوام یه بلیط بخرم."),
                VocabWord("meet", "ملاقات کردن", "/miːt/", "verb",
                    "I'm going to meet friends.", "دوستام رو می‌بینم."),
                VocabWord("opportunity", "فرصت", "/ˌɑːpərˈtuːnəti/", "noun",
                    "It's a great opportunity.", "فرصت عالیه.")
            ),
            idioms = listOf(
                IdiomExpression("look forward to", "بی‌صبرانه منتظر بودن",
                    "I'm looking forward to the trip.", "بی‌صبرانه منتظر سفرم.", "neutral"),
                IdiomExpression("on the horizon", "در پیش رو",
                    "Big changes are on the horizon.", "تغییرات بزرگی در پیشه.", "idiom"),
                IdiomExpression("up in the air", "نامعلوم",
                    "The plan is still up in the air.", "برنامه هنوز نامعلومه.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("going to → gonna",
                    "در مکالمه سریع going to → gonna."),
                PronunciationTip("will contraction",
                    "I'll /aɪl/، you'll /juːl/.")
            ),
            culturalNotes = listOf(
                CulturalNote("New Year's resolutions",
                    "در غرب، ابتدای سال اهداف تعیین می‌کنند."),
                CulturalNote("Bucket list",
                    "لیست کارهایی که می‌خواهند انجام دهند.")
            ),
            grammar = listOf(
                GrammarSection("going to",
                    """
                        am/is/are + going to + verb

                        I'm going to travel to Japan.
                        She's going to start a new job.
                    """.trimIndent()),
                GrammarSection("will",
                    """
                        will + verb

                        I'll help you.
                        It will rain tomorrow.

                        منفی: won't
                        سوال: Will you...?
                    """.trimIndent()),
                GrammarSection("Present continuous for future",
                    """
                        برای قرار قطعی:
                        I'm meeting Ali tomorrow at 5.
                    """.trimIndent()),
                GrammarSection("Time expressions",
                    """
                        tomorrow, next week, this weekend, soon

                        I'll see you next week.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I will to travel.", "I will travel.", "بعد از will فعل ساده."),
                CommonMistake("I'm go to travel.", "I'm going to travel.", "شکل درست going to."),
                CommonMistake("She will travels.", "She will travel.", "بعد از will فعل ساده.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you have any plans for the summer?", "برای تابستون برنامه‌ای داری؟"),
                DialogueLine("B", "Yes! I'm going to travel to Turkey.", "بله! می‌خوام برم ترکیه."),
                DialogueLine("A", "That sounds amazing! How long will you stay?", "فوق‌العاده به نظر می‌رسه! چقدر می‌مونی؟"),
                DialogueLine("B", "About two weeks. I'll visit Istanbul and Antalya.", "حدود دو هفته. استانبول و آنتالیا رو می‌بینم."),
                DialogueLine("A", "Have you booked your tickets yet?", "بلیط‌ها رو رزرو کردی؟"),
                DialogueLine("B", "Not yet. I'm going to book them next week.", "هنوز نه. می‌خوام هفته بعد رزرو کنم."),
                DialogueLine("A", "Who are you going with?", "با کی می‌ری؟"),
                DialogueLine("B", "With my brother. He's never been abroad.", "با برادرم. او هرگز خارج نبوده."),
                DialogueLine("A", "That's exciting. Will you stay in hotels?", "هیجان‌انگیزه. در هتل می‌مونید؟"),
                DialogueLine("B", "Yes, but we might try Airbnb for a few nights.", "بله، ولی ممکنه چند شب Airbnb امتحان کنیم."),
                DialogueLine("A", "Nice. What will you do there?", "خوبه. اونجا چیکار می‌کنید؟"),
                DialogueLine("B", "We'll visit historical sites and relax on the beach.", "از جاهای تاریخی بازدید می‌کنیم و در ساحل استراحت می‌کنیم."),
                DialogueLine("A", "Sounds perfect. Any plans for after the trip?", "بی‌نقص به نظر می‌رسه. بعد از سفر برنامه‌ای داری؟"),
                DialogueLine("B", "Actually, I'm going to start a new job.", "در واقع، می‌خوام یه شغل جدید شروع کنم."),
                DialogueLine("A", "Wow, big change! When do you start?", "واو، تغییر بزرگیه! کِی شروع می‌کنی؟"),
                DialogueLine("B", "Next month. I'm a little nervous but excited.", "ماه بعد. کمی مضطربم ولی هیجان‌زده.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B برای تابستان چه برنامه‌ای دارد؟", "به ترکیه سفر می‌کند."),
                ComprehensionQuestion("B با کی سفر می‌کند؟", "با برادرش."),
                ComprehensionQuestion("A چه برنامه‌ای دارد؟", "شروع یک شغل جدید."),
                ComprehensionQuestion("B چه کارهایی در ترکیه انجام می‌دهد؟", "بازدید تاریخی و استراحت در ساحل.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your summer plans.",
                    "درباره برنامه‌های تابستانی‌ات صحبت کن.",
                    "I'm going to... / I'll..."),
                SpeakingTask("Make plans with a friend.",
                    "با یک دوست برنامه بذار.",
                    "Are you free...? / Let's...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your future plans.",
                    "درباره برنامه‌های آینده‌ات بنویس.",
                    120,
                    "Use going to and will.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: I ___ going to travel.",
                    listOf("is", "am", "are", "be"), 1),
                QuizQuestion("Complete: She ___ help you.",
                    listOf("will", "wills", "is will", "to will"), 0),
                QuizQuestion("Complete: I'm ___ Ali tomorrow.",
                    listOf("meet", "meeting", "meets", "met"), 1),
                QuizQuestion("What does 'look forward to' mean?",
                    listOf("منتظر بودن", "ترسیدن", "فراموش کردن", "لغو کردن"), 0),
                QuizQuestion("Complete: They ___ going to visit us.",
                    listOf("is", "am", "are", "be"), 2),
                QuizQuestion("Complete: I ___ call you tonight.",
                    listOf("will", "wills", "am will", "to will"), 0),
                QuizQuestion("Complete: What ___ you do tomorrow?",
                    listOf("are", "will", "is", "do"), 1),
                QuizQuestion("Complete: She ___ travel next week.",
                    listOf("going to", "is going to", "are going to", "will to"), 1)
            )
        )
    }

    // ═══════════════════════════════════════════════════════════
    // CHAPTER 10 — Health
    // ═══════════════════════════════════════════════════════════
    private fun chapter10(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 10,
            title = "Health",
            titlePersian = "سلامتی",
            objectives = listOf(
                "Talk about health and illness",
                "Name parts of the body",
                "Use should/shouldn't for advice",
                "Make an appointment"
            ),
            vocabulary = listOf(
                VocabWord("head", "سر", "/hed/", "noun",
                    "My head hurts.", "سرم درد می‌کنه."),
                VocabWord("stomach", "شکم", "/ˈstʌmək/", "noun",
                    "I have a stomachache.", "دل‌درد دارم."),
                VocabWord("arm", "بازو", "/ɑːrm/", "noun",
                    "My arm hurts.", "بازوم درد می‌کنه."),
                VocabWord("leg", "پا", "/leɡ/", "noun",
                    "I broke my leg.", "پام شکست."),
                VocabWord("fever", "تب", "/ˈfiːvər/", "noun",
                    "She has a fever.", "او تب داره."),
                VocabWord("headache", "سردرد", "/ˈhedeɪk/", "noun",
                    "I have a headache.", "سردرد دارم."),
                VocabWord("cold", "سرماخوردگی", "/koʊld/", "noun",
                    "I have a cold.", "سرماخورده‌ام."),
                VocabWord("medicine", "دارو", "/ˈmedɪsɪn/", "noun",
                    "Take this medicine.", "این دارو رو بخور."),
                VocabWord("doctor", "دکتر", "/ˈdɑːktər/", "noun",
                    "You should see a doctor.", "باید دکتر بری."),
                VocabWord("hospital", "بیمارستان", "/ˈhɑːspɪtəl/", "noun",
                    "She's in the hospital.", "او در بیمارستانه."),
                VocabWord("pain", "درد", "/peɪn/", "noun",
                    "I have pain in my back.", "کمرم درد می‌کنه."),
                VocabWord("healthy", "سالم", "/ˈhelθi/", "adjective",
                    "Eat healthy food.", "غذای سالم بخور.")
            ),
            idioms = listOf(
                IdiomExpression("under the weather", "حالش خوب نبودن",
                    "I'm feeling under the weather today.", "امروز حالم خوب نیست.", "informal"),
                IdiomExpression("as fit as a fiddle", "خیلی سالم",
                    "My grandfather is as fit as a fiddle.", "پدربزرگم خیلی سالمه.", "idiom"),
                IdiomExpression("take it easy", "سخت نگیر",
                    "You should take it easy for a few days.", "باید چند روز سخت نگیری.", "informal")
            ),
            pronunciationTips = listOf(
                PronunciationTip("th in health",
                    "health /helθ/ — صدای /θ/."),
                PronunciationTip("silent h in hour",
                    "hour /ˈaʊər/ — h تلفظ نمی‌شود.")
            ),
            culturalNotes = listOf(
                CulturalNote("Health systems",
                    "در غرب، بیمه درمانی مهم است."),
                CulturalNote("Doctor visits",
                    "اول به GP مراجعه می‌کنند.")
            ),
            grammar = listOf(
                GrammarSection("should / shouldn't",
                    """
                        You should rest.
                        You shouldn't eat too much sugar.
                        You should see a doctor.
                    """.trimIndent()),
                GrammarSection("have + illness",
                    """
                        I have a headache.
                        She has a cold.
                        They have the flu.

                        My head hurts.
                    """.trimIndent()),
                GrammarSection("Questions about health",
                    """
                        What's the matter?
                        What's wrong?
                        Are you OK?
                    """.trimIndent()),
                GrammarSection("Imperatives for advice",
                    """
                        Take this medicine.
                        Drink more water.
                        Get some rest.
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have headache.", "I have a headache.", "قبل از headache از a."),
                CommonMistake("You should to rest.", "You should rest.", "بعد از should فعل ساده."),
                CommonMistake("My head is pain.", "My head hurts.", "برای درد از hurt.")
            ),
            conversation = listOf(
                DialogueLine("A", "Hi Sara, you don't look well. Are you OK?", "سلام سارا، خوب به نظر نمی‌رسی. حالت خوبه؟"),
                DialogueLine("B", "Not really. I have a terrible headache and a fever.", "نه واقعاً. سردرد وحشتناک و تب دارم."),
                DialogueLine("A", "Oh no. How long have you felt like this?", "اوه نه. چقدره این‌طوری؟"),
                DialogueLine("B", "Since yesterday evening. I think I have the flu.", "از دیشب. فکر کنم آنفلوانزا گرفتم."),
                DialogueLine("A", "You should see a doctor.", "باید دکتر بری."),
                DialogueLine("B", "I know. Can you take me to the clinic?", "می‌دونم. می‌تونی منو ببری کلینیک؟"),
                DialogueLine("A", "Of course. Let me make an appointment first.", "البته. بذار اول وقت بگیرم."),
                DialogueLine("B", "Thank you so much. I really appreciate it.", "خیلی ممنون. واقعاً قدردانی می‌کنم."),
                DialogueLine("A", "That's what friends are for. Rest until we go.", "دوست برای همین است. تا وقتی بریم استراحت کن."),
                DialogueLine("B", "I will. Thanks again.", "می‌کنم. بازم ممنون."),
                DialogueLine("A", "No problem. See you soon.", "مشکلی نیست. به‌زودی می‌بینمت."),
                DialogueLine("B", "See you. Take care.", "می‌بینمت. مراقب خودت باش.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("Sara چه علائمی دارد؟", "سردرد شدید و تب."),
                ComprehensionQuestion("Sara چه بیماری‌ای فکر می‌کند دارد؟", "آنفلوانزا."),
                ComprehensionQuestion("دوستم چه کاری می‌کند؟", "قرار ملاقات با دکتر می‌گیرد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your symptoms to a doctor.",
                    "علائم‌ت رو به دکتر بگو.",
                    "I have... / My ... hurts."),
                SpeakingTask("Give advice to a sick friend.",
                    "به یه دوست بیمار توصیه کن.",
                    "You should... / You shouldn't...")
            ),
            writingTasks = listOf(
                WritingTask("Write about what you do to stay healthy.",
                    "درباره کارهایی که برای سالم موندن انجام می‌دی بنویس.",
                    120,
                    "Use should/shouldn't.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: You ___ rest.",
                    listOf("should", "should to", "shoulds", "shoulding"), 0),
                QuizQuestion("Complete: I have ___ headache.",
                    listOf("a", "an", "the", "-"), 0),
                QuizQuestion("Complete: My back ___.",
                    listOf("hurt", "hurts", "is hurt", "hurting"), 1),
                QuizQuestion("Complete: You should ___ more water.",
                    listOf("drink", "drinks", "drinking", "drank"), 0),
                QuizQuestion("Complete: She ___ a cold.",
                    listOf("have", "has", "haves", "having"), 1),
                QuizQuestion("What does 'under the weather' mean?",
                    listOf("زیر بارون", "حالش خوب نیست", "خوشحال", "سلامت"), 1),
                QuizQuestion("Complete: You shouldn't ___ junk food.",
                    listOf("eat", "eats", "eating", "ate"), 0),
                QuizQuestion("What does 'take it easy' mean?",
                    listOf("سخت بگیر", "سخت نگیر", "سریع برو", "بخواب"), 1)
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
                "Talk about travel experiences",
                "Use present perfect with ever/never",
                "Book hotels and tickets",
                "Ask for directions"
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
                VocabWord("reservation", "رزرو", "/ˌrezərˈveɪʃən/", "noun",
                    "I have a reservation.", "رزرو دارم."),
                VocabWord("map", "نقشه", "/mæp/", "noun",
                    "Check the map.", "نقشه رو چک کن."),
                VocabWord("guide", "راهنما", "/ɡaɪd/", "noun",
                    "The guide was helpful.", "راهنما کمک‌کننده بود.")
            ),
            idioms = listOf(
                IdiomExpression("catch a flight", "به پرواز رسیدن",
                    "We need to catch a flight at 6.", "باید ساعت ۶ به پرواز برسیم.", "neutral"),
                IdiomExpression("hit the road", "راه افتادن",
                    "Let's hit the road early.", "بیا زود راه بیفتیم.", "informal"),
                IdiomExpression("off the beaten track", "دور از مسیر معمول",
                    "We visited a village off the beaten track.", "از یه دهکده دور از مسیر معمول بازدید کردیم.", "idiom")
            ),
            pronunciationTips = listOf(
                PronunciationTip("travel vs trip",
                    "travel /ˈtrævəl/، trip /trɪp/."),
                PronunciationTip("passport",
                    "passport /ˈpæspɔːrt/ — استرس روی pass.")
            ),
            culturalNotes = listOf(
                CulturalNote("Travel tips",
                    "خرید بیمه سفر رایجه."),
                CulturalNote("Airport customs",
                    "customs و immigration جدا هستند.")
            ),
            grammar = listOf(
                GrammarSection("Present perfect with ever/never",
                    """
                        Have you ever been to Paris?
                        Yes, I have. / No, I haven't.

                        I've never been to Japan.
                    """.trimIndent()),
                GrammarSection("Past simple vs present perfect",
                    """
                        Past: I went to Paris in 2020.
                        Present perfect: I've been to Paris.
                    """.trimIndent()),
                GrammarSection("Booking a hotel",
                    """
                        I'd like to book a room.
                        Do you have any vacancies?
                        How much is it per night?
                    """.trimIndent()),
                GrammarSection("Directions",
                    """
                        Go straight.
                        Turn left / right.
                        It's on the corner.

                        How do I get to...?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I have been to Paris last year.", "I went to Paris last year.", "با زمان مشخص: past simple."),
                CommonMistake("Have you ever go to Paris?", "Have you ever been to Paris?", "past participle."),
                CommonMistake("next the week", "next week", "بدون the.")
            ),
            conversation = listOf(
                DialogueLine("A", "Have you ever been abroad?", "تا حالا خارج بودی؟"),
                DialogueLine("B", "Yes, I have. I've been to Turkey twice.", "بله. دو بار ترکیه بودم."),
                DialogueLine("A", "Nice! When did you go?", "خوبه! کی رفتی؟"),
                DialogueLine("B", "I went last summer with my family.", "تابستان گذشته با خانواده‌ام رفتم."),
                DialogueLine("A", "How was it?", "چطور بود؟"),
                DialogueLine("B", "Amazing. The food was delicious.", "فوق‌العاده. غذا خوشمزه بود."),
                DialogueLine("A", "Did you go sightseeing?", "بازدید کردی؟"),
                DialogueLine("B", "Yes, we visited the Blue Mosque.", "بله، مسجد آبی رو دیدیم."),
                DialogueLine("A", "Sounds great. Where did you stay?", "عالی. کجا موندی؟"),
                DialogueLine("B", "In a small hotel near the center.", "در هتل کوچکی نزدیک مرکز."),
                DialogueLine("A", "Have you ever traveled alone?", "تا حالا تنها سفر کردی؟"),
                DialogueLine("B", "No, I haven't. But I'd like to try.", "نه. ولی دوست دارم امتحان کنم."),
                DialogueLine("A", "It's fun but sometimes lonely.", "سرگرم‌کننده‌ست ولی گاهی تنهار."),
                DialogueLine("B", "That makes sense. What about you?", "منطقیه. تو چطور؟"),
                DialogueLine("A", "I've been to Italy and France.", "من ایتالیا و فرانسه بودم."),
                DialogueLine("B", "Wow! Which did you prefer?", "واو! کدوم رو ترجیح دادی؟"),
                DialogueLine("A", "Italy, I think. The art was incredible.", "ایتالیا، فکر کنم. هنرش باورنکردنی بود.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چند بار ترکیه بوده؟", "دو بار."),
                ComprehensionQuestion("B کجا اقامت داشته؟", "هتل کوچک نزدیک مرکز."),
                ComprehensionQuestion("A کجاها بوده؟", "ایتالیا و فرانسه."),
                ComprehensionQuestion("A کدوم کشور رو ترجیح داد؟", "ایتالیا.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your travel experiences.",
                    "درباره تجربه‌های سفرت صحبت کن.",
                    "I've been to... / I went to..."),
                SpeakingTask("Ask for directions.",
                    "نقش‌بازی: مسیر بپرس.",
                    "How do I get to...? / Where is...?")
            ),
            writingTasks = listOf(
                WritingTask("Write about a memorable trip.",
                    "درباره یه سفر به‌یادماندنی بنویس.",
                    150,
                    "Use past simple and present perfect.")
            ),
            quiz = listOf(
                QuizQuestion("Complete: Have you ever ___ to Paris?",
                    listOf("go", "went", "been", "going"), 2),
                QuizQuestion("Complete: I ___ to Paris in 2020.",
                    listOf("have been", "went", "go", "going"), 1),
                QuizQuestion("Complete: I've ___ been to Japan.",
                    listOf("ever", "never", "already", "yet"), 1),
                QuizQuestion("Complete: I'd like to ___ a room.",
                    listOf("book", "books", "booking", "booked"), 0),
                QuizQuestion("Complete: Where ___ the station?",
                    listOf("are", "is", "have", "has"), 1),
                QuizQuestion("Complete: Have you ever ___ abroad?",
                    listOf("be", "being", "been", "was"), 2),
                QuizQuestion("Complete: I ___ a ticket yesterday.",
                    listOf("buy", "bought", "buying", "buys"), 1),
                QuizQuestion("What does 'hit the road' mean?",
                    listOf("زمین خوردن", "راه افتادن", "برگشتن", "توقف"), 1)
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
                "Review all tenses",
                "Practice everyday conversations",
                "Use all grammar structures",
                "Prepare for real-life English"
            ),
            vocabulary = listOf(
                VocabWord("review", "مرور", "/rɪˈvjuː/", "noun",
                    "Let's review the lesson.", "بیا درس رو مرور کنیم."),
                VocabWord("practice", "تمرین", "/ˈpræktɪs/", "noun",
                    "Practice makes perfect.", "تمرین باعث پیشرفت."),
                VocabWord("improve", "بهتر کردن", "/ɪmˈpruːv/", "verb",
                    "I want to improve my English.", "می‌خوام انگلیسی‌ام رو بهتر کنم."),
                VocabWord("confident", "با اعتماد به نفس", "/ˈkɑːnfɪdənt/", "adjective",
                    "I feel more confident now.", "الان با اعتماد به نفس‌ترم."),
                VocabWord("progress", "پیشرفت", "/ˈprɑːɡres/", "noun",
                    "You're making great progress.", "داری پیشرفت خوبی می‌کنی."),
                VocabWord("challenge", "چالش", "/ˈtʃælɪndʒ/", "noun",
                    "English is a fun challenge.", "انگلیسی چالش سرگرم‌کننده."),
                VocabWord("fluent", "روان", "/ˈfluːənt/", "adjective",
                    "I want to be fluent.", "می‌خوام روان بشم."),
                VocabWord("mistake", "اشتباه", "/mɪˈsteɪk/", "noun",
                    "It's OK to make mistakes.", "اشتباه کردن اشکالی نداره."),
                VocabWord("continue", "ادامه دادن", "/kənˈtɪnjuː/", "verb",
                    "Continue practicing every day.", "هر روز تمرین رو ادامه بده."),
                VocabWord("succeed", "موفق شدن", "/səkˈsiːd/", "verb",
                    "You will succeed if you try.", "اگه تلاش کنی موفق می‌شی."),
                VocabWord("journey", "سفر", "/ˈdʒɜːrni/", "noun",
                    "Learning is a journey.", "یادگیری یه سفره."),
                VocabWord("goal", "هدف", "/ɡoʊl/", "noun",
                    "My goal is to be fluent.", "هدفم روان شدنه.")
            ),
            idioms = listOf(
                IdiomExpression("practice makes perfect", "تمرین باعث پیشرفت",
                    "Practice makes perfect — keep going!", "تمرین باعث پیشرفت — ادامه بده!", "idiom"),
                IdiomExpression("Rome wasn't built in a day", "رم در یک روز ساخته نشد",
                    "Don't give up. Rome wasn't built in a day.", "تسلیم نشو. رم در یک روز ساخته نشد.", "idiom"),
                IdiomExpression("break a leg", "موفق باشی",
                    "Break a leg on your exam!", "در امتحانت موفق باشی!", "idiom")
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
                GrammarSection("Review: Future",
                    """
                        I'll help you.
                        I'm going to travel.
                    """.trimIndent()),
                GrammarSection("Review: Present perfect",
                    """
                        I've been to London.
                        Have you ever eaten sushi?
                    """.trimIndent())
            ),
            commonMistakes = listOf(
                CommonMistake("I am agree.", "I agree.", "agree فعل است."),
                CommonMistake("I didn't went.", "I didn't go.", "بعد از didn't فعل ساده."),
                CommonMistake("He don't like it.", "He doesn't like it.", "برای he/she/it از doesn't.")
            ),
            conversation = listOf(
                DialogueLine("A", "How's your English going?", "انگلیسی‌ت چطور پیش می‌ره؟"),
                DialogueLine("B", "Pretty well! I've been practicing every day.", "خیلی خوب! هر روز تمرین کرده‌ام."),
                DialogueLine("A", "That's great. Do you feel more confident?", "عالیه. با اعتماد به نفس‌تری؟"),
                DialogueLine("B", "Yes, much more. I can have basic conversations.", "بله، خیلی بیشتر. می‌تونم مکالمات پایه داشته باشم."),
                DialogueLine("A", "Awesome! What was the hardest part?", "عالی! سخت‌ترین قسمت چی بود؟"),
                DialogueLine("B", "Probably the grammar, especially the tenses.", "احتمالاً گرامر، خصوصاً زمان‌ها."),
                DialogueLine("A", "Yeah, tenses are tricky. What helped you most?", "آره، زمان‌ها پیچیدن. چی بیشتر کمک کرد؟"),
                DialogueLine("B", "Watching movies and talking to native speakers.", "فیلم دیدن و صحبت با نیتیوها."),
                DialogueLine("A", "That makes sense. What's your next goal?", "منطقیه. هدف بعدی‌ت چیه؟"),
                DialogueLine("B", "I want to be fluent in two years.", "می‌خوام در دو سال روان بشم."),
                DialogueLine("A", "That's a great goal. How will you get there?", "هدف عالیه. چطور بهش می‌رسی؟"),
                DialogueLine("B", "Practice every day, take more classes, and read books.", "هر روز تمرین، کلاس بیشتر، و کتاب خوندن."),
                DialogueLine("A", "Sounds like a good plan. Good luck!", "برنامه خوبی به نظر می‌رسه. موفق باشی!"),
                DialogueLine("B", "Thanks! Practice makes perfect.", "ممنون! تمرین باعث پیشرفت."),
                DialogueLine("A", "Exactly. Rome wasn't built in a day.", "دقیقاً. رم در یک روز ساخته نشد."),
                DialogueLine("B", "True. I'll be patient and consistent.", "درسته. صبور و پیوسته خواهم بود.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("B چطور انگلیسی‌اش را تقویت کرده؟", "تمرین روزانه، فیلم دیدن، صحبت با نیتیوها."),
                ComprehensionQuestion("سخت‌ترین بخش برای B چه بود؟", "گرامر، خصوصاً زمان‌ها."),
                ComprehensionQuestion("هدف B چیست؟", "روان شدن در دو سال."),
                ComprehensionQuestion("B چطور به هدفش می‌رسد؟", "تمرین روزانه، کلاس، کتاب خواندن.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Talk about your English learning journey.",
                    "درباره مسیر یادگیری انگلیسی‌ات صحبت کن.",
                    "I started... / I've learned... / My goal is..."),
                SpeakingTask("Give advice to a beginner.",
                    "به یک مبتدی توصیه کن.",
                    "You should... / Don't give up...")
            ),
            writingTasks = listOf(
                WritingTask("Write about your English learning goals.",
                    "درباره اهداف یادگیری انگلیسی‌ات بنویس.",
                    150,
                    "Use all tenses you've learned.")
            ),
            quiz = listOf(
                QuizQuestion("What does 'practice makes perfect' mean?",
                    listOf("تمرین سخت است", "تمرین باعث پیشرفت", "تمرین بی‌فایده", "تمرین طولانی"), 1),
                QuizQuestion("Complete: I ___ him yesterday.",
                    listOf("see", "saw", "seen", "seeing"), 1),
                QuizQuestion("Complete: She ___ English every day.",
                    listOf("study", "studies", "studying", "studied"), 1),
                QuizQuestion("Complete: I ___ to London twice.",
                    listOf("was", "have been", "go", "going"), 1),
                QuizQuestion("What does 'break a leg' mean?",
                    listOf("شکستن پا", "موفق باشی", "شکست خوردن", "دویدن"), 1),
                QuizQuestion("Complete: I ___ help you tomorrow.",
                    listOf("will", "am", "do", "have"), 0),
                QuizQuestion("Complete: If you practice, you ___ improve.",
                    listOf("will", "are", "do", "have"), 0),
                QuizQuestion("Complete: ___ you ever been to Paris?",
                    listOf("Do", "Did", "Have", "Are"), 2)
            )
        )
    }
}