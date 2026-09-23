package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile4 {

    const val BOOK_ID = "english_file_4"

    fun getChapter(chapterNumber: Int): LessonContent {
        return when (chapterNumber) {
            1 -> chapter1()
            else -> getDefaultContent(BOOK_ID, chapterNumber)
        }
    }

    private fun chapter1(): LessonContent {
        return LessonContent(
            bookId = BOOK_ID,
            chapterNumber = 1,
            title = "Unexpected Moments",
            titlePersian = "لحظه‌های غیرمنتظره",

            objectives = listOf(
                "Tell a story about something that happened in the past",
                "Describe background actions and interrupted events",
                "Use the past simple and past continuous together",
                "Use the past perfect to show the earlier of two past events",
                "Talk about habits in the past with used to",
                "Ask follow-up questions about past events",
                "Organize a short personal story clearly"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "unexpected",
                    persian = "غیرمنتظره",
                    pronunciation = "/ˌʌnɪkˈspektɪd/",
                    partOfSpeech = "adjective",
                    example = "We had an unexpected problem during the trip.",
                    examplePersian = "در طول سفر با یک مشکل غیرمنتظره روبه‌رو شدیم."
                ),
                VocabWord(
                    english = "incident",
                    persian = "اتفاق / رویداد",
                    pronunciation = "/ˈɪnsɪdənt/",
                    partOfSpeech = "noun",
                    example = "There was a strange incident at the station.",
                    examplePersian = "یک اتفاق عجیب در ایستگاه رخ داد."
                ),
                VocabWord(
                    english = "suddenly",
                    persian = "ناگهان",
                    pronunciation = "/ˈsʌdənli/",
                    partOfSpeech = "adverb",
                    example = "Suddenly, the lights went out.",
                    examplePersian = "ناگهان چراغ‌ها خاموش شدند."
                ),
                VocabWord(
                    english = "realize",
                    persian = "متوجه شدن",
                    pronunciation = "/ˈriːəlaɪz/",
                    partOfSpeech = "verb",
                    example = "I suddenly realized that I had lost my phone.",
                    examplePersian = "ناگهان متوجه شدم که تلفنم را گم کرده‌ام."
                ),
                VocabWord(
                    english = "notice",
                    persian = "متوجه شدن / توجه کردن",
                    pronunciation = "/ˈnoʊtɪs/",
                    partOfSpeech = "verb",
                    example = "Did you notice anything unusual?",
                    examplePersian = "متوجه چیز غیرعادی‌ای شدی؟"
                ),
                VocabWord(
                    english = "fortunately",
                    persian = "خوشبختانه",
                    pronunciation = "/ˈfɔːrtʃənətli/",
                    partOfSpeech = "adverb",
                    example = "Fortunately, nobody was hurt.",
                    examplePersian = "خوشبختانه کسی آسیب ندید."
                ),
                VocabWord(
                    english = "fortunately",
                    persian = "خوشبختانه",
                    pronunciation = "/ˈfɔːrtʃənətli/",
                    partOfSpeech = "adverb",
                    example = "Fortunately, we found another way home.",
                    examplePersian = "خوشبختانه راه دیگری برای برگشتن به خانه پیدا کردیم."
                ),
                VocabWord(
                    english = "eventually",
                    persian = "در نهایت",
                    pronunciation = "/ɪˈventʃuəli/",
                    partOfSpeech = "adverb",
                    example = "Eventually, we found the right address.",
                    examplePersian = "در نهایت آدرس درست را پیدا کردیم."
                ),
                VocabWord(
                    english = "delay",
                    persian = "تأخیر",
                    pronunciation = "/dɪˈleɪ/",
                    partOfSpeech = "noun/verb",
                    example = "Our flight was delayed for two hours.",
                    examplePersian = "پرواز ما دو ساعت تأخیر داشت."
                ),
                VocabWord(
                    english = "destination",
                    persian = "مقصد",
                    pronunciation = "/ˌdestɪˈneɪʃən/",
                    partOfSpeech = "noun",
                    example = "We finally reached our destination.",
                    examplePersian = "بالاخره به مقصد خود رسیدیم."
                ),
                VocabWord(
                    english = "embarrassed",
                    persian = "خجالت‌زده",
                    pronunciation = "/ɪmˈbærəst/",
                    partOfSpeech = "adjective",
                    example = "I felt embarrassed when I forgot his name.",
                    examplePersian = "وقتی اسم او را فراموش کردم خجالت کشیدم."
                ),
                VocabWord(
                    english = "memorable",
                    persian = "به‌یادماندنی",
                    pronunciation = "/ˈmemərəbəl/",
                    partOfSpeech = "adjective",
                    example = "It was one of the most memorable days of my life.",
                    examplePersian = "آن یکی از به‌یادماندنی‌ترین روزهای زندگی‌ام بود."
                ),
                VocabWord(
                    english = "escape",
                    persian = "فرار کردن / رهایی یافتن",
                    pronunciation = "/ɪˈskeɪp/",
                    partOfSpeech = "verb",
                    example = "We escaped the rain by finding a small café.",
                    examplePersian = "با پیدا کردن یک کافه کوچک از باران در امان ماندیم."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "out of the blue",
                    persian = "ناگهان و بدون مقدمه",
                    example = "She called me out of the blue after several years.",
                    examplePersian = "او بعد از چند سال ناگهان با من تماس گرفت.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "by accident",
                    persian = "اتفاقی / تصادفی",
                    example = "I found the old photo by accident.",
                    examplePersian = "عکس قدیمی را اتفاقی پیدا کردم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "in the end",
                    persian = "در پایان / در نهایت",
                    example = "In the end, everything worked out.",
                    examplePersian = "در نهایت همه چیز خوب پیش رفت.",
                    register = "neutral"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "run into",
                    meaning = "to meet someone unexpectedly",
                    persian = "اتفاقی کسی را دیدن",
                    example = "I ran into an old friend at the airport.",
                    examplePersian = "در فرودگاه اتفاقی یک دوست قدیمی را دیدم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "find out",
                    meaning = "to discover information",
                    persian = "متوجه شدن / فهمیدن",
                    example = "We found out that the train had been canceled.",
                    examplePersian = "فهمیدیم که قطار لغو شده است.",
                    separable = "Sometimes"
                ),
                PhrasalVerb(
                    verb = "end up",
                    meaning = "to finally be in a particular situation or place",
                    persian = "در نهایت سر از جایی درآوردن / به نتیجه‌ای رسیدن",
                    example = "We ended up staying at a small hotel.",
                    examplePersian = "در نهایت در یک هتل کوچک ماندیم.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Past -ed endings",
                    content = "پایان -ed در افعال گذشته همیشه یکسان تلفظ نمی‌شود؛ در بعضی افعال /t/، در بعضی /d/ و در بعضی /ɪd/ شنیده می‌شود."
                ),
                PronunciationTip(
                    title = "Was and were",
                    content = "was و were در گفتار طبیعی معمولاً کوتاه و بدون تأکید تلفظ می‌شوند."
                ),
                PronunciationTip(
                    title = "Story rhythm",
                    content = "در داستان‌گویی، کلمات اصلی مانند suddenly، then و finally معمولاً برای برجسته کردن ترتیب اتفاق‌ها تأکید بیشتری می‌گیرند."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Telling stories",
                    content = "در گفت‌وگوهای روزمره، تعریف یک اتفاق غیرمنتظره می‌تواند راهی طبیعی برای ادامه دادن conversation باشد. گوینده معمولاً ابتدا زمینه را توضیح می‌دهد و سپس اتفاق اصلی را تعریف می‌کند."
                ),
                CulturalNote(
                    title = "Follow-up questions",
                    content = "عبارت‌هایی مانند What happened next?، How did you feel? و What did you do? برای نشان دادن علاقه به داستان طرف مقابل رایج هستند."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Past Simple and Past Continuous",
                    content = """
                        از past continuous برای توصیف کاری که در یک لحظه مشخص در گذشته در حال انجام بوده استفاده می‌کنیم:

                        I was walking home at eight.

                        از past simple برای اتفاق کامل‌شده استفاده می‌کنیم:

                        I was walking home when I saw an old friend.

                        الگوی رایج:

                        Past continuous + when + past simple

                        مثال:

                        We were having dinner when the phone rang.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "When and While",
                    content = """
                        while معمولاً قبل از یک فعالیت در حال انجام می‌آید:

                        While I was driving, it started to rain.

                        when اغلب برای معرفی اتفاقی که فعالیت دیگری را قطع می‌کند استفاده می‌شود:

                        I was driving when it started to rain.

                        هر دو ساختار می‌توانند یک موقعیت مشابه را توصیف کنند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Past Perfect",
                    content = """
                        ساختار past perfect:

                        had + past participle

                        از آن برای نشان دادن اتفاقی استفاده می‌کنیم که قبل از اتفاق دیگری در گذشته رخ داده است.

                        When I arrived, the movie had already started.

                        ابتدا فیلم شروع شده بود و بعد من رسیدم.

                        مثال دیگر:

                        She was tired because she had worked all day.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Used To",
                    content = """
                        used to برای عادت‌ها یا وضعیت‌هایی در گذشته استفاده می‌شود که اکنون دیگر ادامه ندارند.

                        I used to live in a small town.
                        We used to play outside every afternoon.

                        شکل منفی:

                        I didn't use to like coffee.

                        سؤال:

                        Did you use to live here?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Story Sequence",
                    content = """
                        برای مرتب کردن اتفاق‌های یک داستان می‌توانیم از این کلمات استفاده کنیم:

                        first
                        then
                        suddenly
                        after that
                        eventually
                        finally
                        in the end

                        مثال:

                        First, we missed the bus. Then, it started raining. Eventually, we found a taxi.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I was walk home when I saw him.",
                    correct = "I was walking home when I saw him.",
                    explanation = "بعد از was/were در past continuous از verb + ing استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "When I arrived, the movie already started.",
                    correct = "When I arrived, the movie had already started.",
                    explanation = "برای اتفاقی که قبل از یک اتفاق دیگر در گذشته رخ داده، past perfect مناسب است."
                ),
                CommonMistake(
                    wrong = "I use to live there.",
                    correct = "I used to live there.",
                    explanation = "در جمله مثبت از used to استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "Did you used to play football?",
                    correct = "Did you use to play football?",
                    explanation = "بعد از did، شکل ساده use می‌آید."
                ),
                CommonMistake(
                    wrong = "While I was walked, it started raining.",
                    correct = "While I was walking, it started raining.",
                    explanation = "بعد از was باید شکل ing فعل بیاید."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Daniel",
                    english = "You won't believe what happened to me yesterday.",
                    persian = "باورت نمی‌شود دیروز چه اتفاقی برایم افتاد."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Really? What happened?",
                    persian = "واقعاً؟ چه اتفاقی افتاد؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "I was walking home from work when I suddenly heard someone calling my name.",
                    persian = "داشتم از محل کار به خانه می‌رفتم که ناگهان شنیدم کسی اسمم را صدا می‌زند."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Who was it?",
                    persian = "چه کسی بود؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "It was an old classmate I hadn't seen for almost ten years.",
                    persian = "یک همکلاسی قدیمی بود که تقریباً ده سال بود ندیده بودمش."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "No way! Where did you meet?",
                    persian = "باورکردنی نیست! کجا همدیگر را دیدید؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Right outside a small bookstore near my apartment.",
                    persian = "دقیقاً جلوی یک کتاب‌فروشی کوچک نزدیک آپارتمانم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "What was he doing there?",
                    persian = "او آنجا چه کار می‌کرد؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "He was looking for a birthday present for his sister.",
                    persian = "داشت دنبال هدیه تولد برای خواهرش می‌گشت."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Did you recognize him immediately?",
                    persian = "فوراً او را شناختی؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Not at first. He had changed a lot since school.",
                    persian = "نه در ابتدا. از زمان مدرسه خیلی تغییر کرده بود."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "What made you realize who he was?",
                    persian = "چه چیزی باعث شد بفهمی او چه کسی است؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "He mentioned our old science teacher, and then I remembered him.",
                    persian = "او اسم معلم علوم قدیمی‌مان را آورد و بعد من او را به یاد آوردم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "That must have been a strange feeling.",
                    persian = "حتماً حس عجیبی بوده است."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "It was. We hadn't spoken since we finished school.",
                    persian = "همین‌طور بود. از وقتی مدرسه را تمام کردیم با هم صحبت نکرده بودیم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Did you stay and talk for a while?",
                    persian = "مدتی ماندید و صحبت کردید؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Yes. We talked for almost an hour.",
                    persian = "بله. تقریباً یک ساعت صحبت کردیم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "What have you both been doing since school?",
                    persian = "از زمان مدرسه هر کدام چه کار کرده‌اید؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "He's become a doctor, and I've been working in software.",
                    persian = "او پزشک شده و من در زمینه نرم‌افزار کار کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Did you used to have the same interests?",
                    persian = "قبلاً علایق مشابهی داشتید؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Actually, yes. We used to spend hours talking about technology and science.",
                    persian = "در واقع بله. قبلاً ساعت‌ها درباره فناوری و علوم صحبت می‌کردیم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "And you still remember all that after ten years?",
                    persian = "و بعد از ده سال هنوز همه آن‌ها را یادتان هست؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Apparently! We even remembered some of the same jokes.",
                    persian = "ظاهراً! حتی بعضی از شوخی‌های مشترکمان را هم یادمان بود."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "So what happened in the end?",
                    persian = "خب در نهایت چه شد؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "We exchanged numbers and decided to meet for coffee next week.",
                    persian = "شماره‌هایمان را رد و بدل کردیم و تصمیم گرفتیم هفته آینده برای قهوه همدیگر را ببینیم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "That's a great story. Sometimes life brings people back together unexpectedly.",
                    persian = "داستان جالبی است. گاهی زندگی آدم‌ها را به شکل غیرمنتظره دوباره به هم می‌رساند."
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "Where was Daniel going when he heard someone calling his name?",
                    answer = "He was walking home from work."
                ),
                ComprehensionQuestion(
                    question = "Who did Daniel meet?",
                    answer = "He met an old classmate."
                ),
                ComprehensionQuestion(
                    question = "How long had Daniel not seen his classmate?",
                    answer = "Almost ten years."
                ),
                ComprehensionQuestion(
                    question = "Why was the classmate at the bookstore?",
                    answer = "He was looking for a birthday present for his sister."
                ),
                ComprehensionQuestion(
                    question = "What helped Daniel remember his old classmate?",
                    answer = "The classmate mentioned their old science teacher."
                ),
                ComprehensionQuestion(
                    question = "What did they decide to do at the end?",
                    answer = "They decided to meet for coffee the following week."
                )
            ),

            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Tell a short story about an unexpected meeting.",
                    promptPersian = "یک داستان کوتاه درباره یک ملاقات غیرمنتظره تعریف کن.",
                    hints = "I was... when... / Suddenly... / Then... / Eventually..."
                ),
                SpeakingTask(
                    prompt = "Describe something you used to do but don't do anymore.",
                    promptPersian = "درباره کاری صحبت کن که قبلاً انجام می‌دادی ولی دیگر انجام نمی‌دهی.",
                    hints = "I used to... / When I was younger... / Now I..."
                ),
                SpeakingTask(
                    prompt = "Ask your partner detailed questions about a memorable day.",
                    promptPersian = "درباره یک روز به‌یادماندنی از همکلاسی خود سؤال‌های جزئی بپرس.",
                    hints = "What happened? / Where were you? / What were you doing? / What happened next?"
                )
            ),

            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a story about an unexpected event that happened to you or someone you know.",
                    promptPersian = "داستانی درباره یک اتفاق غیرمنتظره که برای تو یا فردی که می‌شناسی رخ داده بنویس.",
                    wordCount = 220,
                    hints = "First... / While... / Suddenly... / After that... / Eventually... / In the end..."
                )
            ),

            quiz = listOf(
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "I was walk home when he called.",
                        "I was walking home when he called.",
                        "I walking home when he called.",
                        "I were walking home when he called."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: When I arrived, the movie ___ already started.",
                    options = listOf(
                        "has",
                        "had",
                        "was",
                        "did"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "I used to live there.",
                        "I use to lived there.",
                        "I used live there.",
                        "I was use to live there."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: Did you ___ to play football?",
                    options = listOf(
                        "used",
                        "use",
                        "using",
                        "uses"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which word means 'unexpectedly'?",
                    options = listOf(
                        "suddenly",
                        "usually",
                        "carefully",
                        "regularly"
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "While I was driving, it started to rain.",
                        "While I drove, it was started raining.",
                        "While I driving, it started rain.",
                        "While I was drive, it raining."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Which phrase means 'to meet someone unexpectedly'?",
                    options = listOf(
                        "give up",
                        "run into",
                        "take up",
                        "look after"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: She was tired because she ___ all day.",
                    options = listOf(
                        "worked",
                        "has worked",
                        "had worked",
                        "was work"
                    ),
                    correctIndex = 2
                )
            )
        )
    }
}