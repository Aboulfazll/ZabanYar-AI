package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object Evolve4 {

    const val BOOK_ID = "evolve_4"

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
            title = "Plans, Goals, and Possibilities",
            titlePersian = "برنامه‌ها، هدف‌ها و احتمالات",

            objectives = listOf(
                "Talk about future plans and intentions",
                "Distinguish between will, be going to, and present continuous for future meaning",
                "Make predictions and discuss possibilities",
                "Use the first conditional for realistic future situations",
                "Ask follow-up questions about someone's plans and goals",
                "Give reasons and explain future decisions clearly"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "intention",
                    persian = "قصد، نیت",
                    pronunciation = "/ɪnˈtenʃən/",
                    partOfSpeech = "noun",
                    example = "My intention is to improve my English this year.",
                    examplePersian = "قصد من این است که امسال انگلیسی‌ام را بهتر کنم."
                ),
                VocabWord(
                    english = "goal",
                    persian = "هدف",
                    pronunciation = "/ɡoʊl/",
                    partOfSpeech = "noun",
                    example = "My main goal is to speak English more confidently.",
                    examplePersian = "هدف اصلی من این است که با اعتمادبه‌نفس بیشتری انگلیسی صحبت کنم."
                ),
                VocabWord(
                    english = "opportunity",
                    persian = "فرصت",
                    pronunciation = "/ˌɑːpərˈtuːnəti/",
                    partOfSpeech = "noun",
                    example = "This course could give me a good opportunity to practice.",
                    examplePersian = "این دوره می‌تواند فرصت خوبی برای تمرین به من بدهد."
                ),
                VocabWord(
                    english = "likely",
                    persian = "محتمل",
                    pronunciation = "/ˈlaɪkli/",
                    partOfSpeech = "adjective",
                    example = "It's likely that I'll stay here for another year.",
                    examplePersian = "احتمال دارد که یک سال دیگر اینجا بمانم."
                ),
                VocabWord(
                    english = "schedule",
                    persian = "برنامه زمانی",
                    pronunciation = "/ˈskedʒuːl/",
                    partOfSpeech = "noun",
                    example = "My schedule is very busy this week.",
                    examplePersian = "برنامه من این هفته خیلی شلوغ است."
                ),
                VocabWord(
                    english = "flexible",
                    persian = "انعطاف‌پذیر",
                    pronunciation = "/ˈfleksəbəl/",
                    partOfSpeech = "adjective",
                    example = "My work hours are flexible.",
                    examplePersian = "ساعات کاری من انعطاف‌پذیر است."
                ),
                VocabWord(
                    english = "priority",
                    persian = "اولویت",
                    pronunciation = "/praɪˈɔːrəti/",
                    partOfSpeech = "noun",
                    example = "My family is my top priority.",
                    examplePersian = "خانواده‌ام اولویت اصلی من است."
                ),
                VocabWord(
                    english = "commit",
                    persian = "متعهد شدن",
                    pronunciation = "/kəˈmɪt/",
                    partOfSpeech = "verb",
                    example = "I can't commit to that plan right now.",
                    examplePersian = "الان نمی‌توانم به آن برنامه متعهد شوم."
                ),
                VocabWord(
                    english = "expect",
                    persian = "انتظار داشتن",
                    pronunciation = "/ɪkˈspekt/",
                    partOfSpeech = "verb",
                    example = "I expect to finish the project by Friday.",
                    examplePersian = "انتظار دارم پروژه را تا جمعه تمام کنم."
                ),
                VocabWord(
                    english = "possibility",
                    persian = "احتمال",
                    pronunciation = "/ˌpɑːsəˈbɪləti/",
                    partOfSpeech = "noun",
                    example = "There's a possibility of moving abroad.",
                    examplePersian = "احتمال نقل مکان به خارج وجود دارد."
                ),
                VocabWord(
                    english = "deadline",
                    persian = "مهلت، ضرب‌الاجل",
                    pronunciation = "/ˈdedlaɪn/",
                    partOfSpeech = "noun",
                    example = "The deadline for applications is next month.",
                    examplePersian = "مهلت درخواست‌ها ماه آینده است."
                ),
                VocabWord(
                    english = "prepare",
                    persian = "آماده شدن / آماده کردن",
                    pronunciation = "/prɪˈper/",
                    partOfSpeech = "verb",
                    example = "I need to prepare for the exam.",
                    examplePersian = "باید برای امتحان آماده شوم."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "Have something in mind",
                    persian = "چیزی در ذهن داشتن",
                    example = "Do you have anything in mind for the weekend?",
                    examplePersian = "برای آخر هفته چیزی در ذهن داری؟",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "Take the next step",
                    persian = "قدم بعدی را برداشتن",
                    example = "I think it's time to take the next step in my career.",
                    examplePersian = "فکر می‌کنم وقتش است که قدم بعدی را در حرفه‌ام بردارم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "Play it by ear",
                    persian = "بی‌برنامه پیش رفتن",
                    example = "We don't have a fixed plan — we'll play it by ear.",
                    examplePersian = "برنامه مشخصی نداریم — بی‌برنامه پیش می‌رویم.",
                    register = "informal"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Reduction of 'going to'",
                    content = "در گفتار طبیعی، going to اغلب به gonna کاهش می‌یابد. اما در مکالمه رسمی، شکل کامل آن استفاده می‌شود."
                ),
                PronunciationTip(
                    title = "Contractions with will",
                    content = "شکل کوتاه will با ضمایر: I'll, you'll, he'll, she'll, we'll, they'll. روی این شکل‌های کوتاه تمرین کنید."
                ),
                PronunciationTip(
                    title = "Stress in future sentences",
                    content = "در جملات آینده، روی فعل اصلی تأکید می‌شود: I'm GOING to study. I WILL call you."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Talking about plans",
                    content = "در فرهنگ‌های انگلیسی‌زبان، پرسیدن درباره برنامه‌های آینده یک روش رایج برای شروع مکالمه است. سؤالاتی مانند 'What are your plans for the weekend?' کاملاً طبیعی هستند."
                ),
                CulturalNote(
                    title = "Personal goals",
                    content = "بحث درباره اهداف شخصی مثل یادگیری زبان، تغییر شغل، یا سفر، موضوعات رایجی در مکالمات دوستانه هستند."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Will for Future",
                    content = """
                        از will برای تصمیم‌های لحظه‌ای، پیش‌بینی‌ها و وعده‌ها استفاده می‌کنیم:

                        I'll help you with that.
                        It will rain tomorrow.
                        I promise I'll call you.

                        شکل منفی: won't
                        I won't be late.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Be Going To for Plans",
                    content = """
                        از be going to برای برنامه‌ها و قصدهای از قبل تعیین‌شده استفاده می‌کنیم:

                        I'm going to study abroad next year.
                        She's going to start a new job.
                        They're going to visit us next month.

                        ساختار: am/is/are + going to + base verb
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present Continuous for Arrangements",
                    content = """
                        از حال استمراری برای قرارهای مشخص آینده استفاده می‌کنیم:

                        I'm meeting Sara at six.
                        We're having dinner with my parents tomorrow.
                        She's flying to London on Friday.

                        این ساختار برای برنامه‌های قطعی و هماهنگ‌شده استفاده می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "First Conditional",
                    content = """
                        از شرطی نوع اول برای موقعیت‌های واقعی آینده استفاده می‌کنیم:

                        If + present simple, will + base verb

                        If I save enough money, I'll travel to Japan.
                        If it rains tomorrow, we'll stay home.
                        She'll be happy if you call her.

                        نکته: در if-clause از will استفاده نمی‌کنیم.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I will to study tomorrow.",
                    correct = "I will study tomorrow.",
                    explanation = "بعد از will از فعل ساده بدون to استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "If I will have time, I will help.",
                    correct = "If I have time, I will help.",
                    explanation = "در if-clause شرطی نوع اول، از زمان حال ساده استفاده می‌کنیم، نه will."
                ),
                CommonMistake(
                    wrong = "I'm go to travel next week.",
                    correct = "I'm going to travel next week.",
                    explanation = "ساختار صحیح be going to است، نه go to."
                ),
                CommonMistake(
                    wrong = "She going to study medicine.",
                    correct = "She is going to study medicine.",
                    explanation = "در ساختار going to حتماً باید فعل be (am/is/are) حضور داشته باشد."
                ),
                CommonMistake(
                    wrong = "I'm meet my friend tomorrow.",
                    correct = "I'm meeting my friend tomorrow.",
                    explanation = "برای حال استمراری باید از verb-ing استفاده کنیم: meeting نه meet."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Sara",
                    english = "Hey, Mark! I haven't seen you in a while. How are you?",
                    persian = "سلام مارک! مدتی است ندیدمت. چطوری؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "I'm good, thanks! Busy with work, but things are going well.",
                    persian = "خوبم، ممنون! با کار مشغولم، ولی همه چیز خوب پیش می‌رود."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "That's great to hear. Any plans for the summer?",
                    persian = "خوشحالم می‌شنوم. برای تابستان برنامه‌ای داری؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Actually, yes. I'm going to visit my brother in Canada.",
                    persian = "در واقع، بله. می‌خواهم به دیدن برادرم در کانادا بروم."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Really? That sounds exciting! How long are you staying?",
                    persian = "واقعاً؟ هیجان‌انگیز به نظر می‌رسد! چقدر می‌مانی؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "About three weeks. I've never been there before.",
                    persian = "حدود سه هفته. تا حالا آنجا نبوده‌ام."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "You'll love it. I went there two years ago.",
                    persian = "عاشقش می‌شوی. من دو سال پیش رفتم."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Oh, great! What do you recommend I see?",
                    persian = "اوه، عالی! توصیه می‌کنی چه چیزی ببینم؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Definitely Vancouver and the Rocky Mountains. They're amazing.",
                    persian = "قطعاً ونکوور و کوه‌های راکی. فوق‌العاده هستند."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "I'll add those to my list. What about you? Any plans?",
                    persian = "آن‌ها را به لیستم اضافه می‌کنم. تو چطور؟ برنامه‌ای داری؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Yes, I'm starting a new job next month.",
                    persian = "بله، ماه آینده یک شغل جدید شروع می‌کنم."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Congratulations! What kind of job?",
                    persian = "تبریک! چه نوع شغلی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "It's a marketing position at a tech company.",
                    persian = "یک موقعیت بازاریابی در یک شرکت فناوری است."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "That sounds like a great opportunity.",
                    persian = "فرصت خوبی به نظر می‌رسد."
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Thanks! I'm a bit nervous, but also excited.",
                    persian = "ممنون! کمی مضطربم، ولی هیجان‌زده هم هستم."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "You'll do great. What are your goals for the new job?",
                    persian = "عالی عمل می‌کنی. اهدافت برای شغل جدید چیست؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "My main goal is to learn as much as possible in the first year.",
                    persian = "هدف اصلی من یادگیری هر چه بیشتر در سال اول است."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "That's a smart approach. Are you moving to a new city?",
                    persian = "رویکرد هوشمندانه‌ای است. به شهر جدیدی نقل مکان می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "No, luckily the office is close to my apartment.",
                    persian = "نه، خوشبختانه دفتر نزدیک آپارتمانم است."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "That's convenient. Will you have time for a vacation?",
                    persian = "این راحت است. برای تعطیلات وقت خواهی داشت؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "I hope so. If I get some time off, I'll visit my parents.",
                    persian = "امیدوارم. اگر کمی مرخصی بگیرم، به دیدن والدینم می‌روم."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Where do they live?",
                    persian = "کجا زندگی می‌کنند؟"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "They live in a small town near the coast. It's very peaceful.",
                    persian = "در یک شهر کوچک نزدیک ساحل زندگی می‌کنند. خیلی آرام است."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Sounds nice. Well, I have to go now. Let's keep in touch!",
                    persian = "خوب به نظر می‌رسد. خب، باید الان بروم. در تماس باشیم!"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Definitely. Good luck with your trip planning!",
                    persian = "قطعاً. برای برنامه‌ریزی سفرت موفق باشی!"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Thanks! And good luck with your new job!",
                    persian = "ممنون! و برای شغل جدیدت موفق باشی!"
                ),
                DialogueLine(
                    speaker = "Sara",
                    english = "Thank you! See you soon.",
                    persian = "ممنون! به‌زودی می‌بینمت."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "See you. Take care!",
                    persian = "می‌بینمت. مراقب خودت باش!"
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What is Mark going to do this summer?",
                    answer = "He is going to visit his brother in Canada."
                ),
                ComprehensionQuestion(
                    question = "How long is Mark staying in Canada?",
                    answer = "About three weeks."
                ),
                ComprehensionQuestion(
                    question = "What places does Sara recommend?",
                    answer = "Vancouver and the Rocky Mountains."
                ),
                ComprehensionQuestion(
                    question = "What is Sara starting next month?",
                    answer = "She is starting a new job."
                ),
                ComprehensionQuestion(
                    question = "What is Sara's main goal for her new job?",
                    answer = "To learn as much as possible in the first year."
                ),
                ComprehensionQuestion(
                    question = "Where do Sara's parents live?",
                    answer = "They live in a small town near the coast."
                )
            ),

            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Talk about your plans for the next six months.",
                    promptPersian = "درباره برنامه‌هایت برای شش ماه آینده صحبت کن.",
                    hints = "I'm going to... / I'll... / I'm planning to... / If I..., I'll..."
                ),
                SpeakingTask(
                    prompt = "Ask your partner about their future goals and give them advice.",
                    promptPersian = "درباره اهداف آینده دوستت سؤال بپرس و به او توصیه کن.",
                    hints = "What are your goals? / What are you going to do? / If I were you, I'd..."
                ),
                SpeakingTask(
                    prompt = "Make predictions about your life in five years.",
                    promptPersian = "درباره زندگی‌ات در پنج سال آینده پیش‌بینی کن.",
                    hints = "I'll probably... / It's likely that... / I might..."
                )
            ),

            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your plans and goals for the next year.",
                    promptPersian = "درباره برنامه‌ها و اهداف خودت برای سال آینده بنویس.",
                    wordCount = 150,
                    hints = "Use will, be going to, present continuous for future, and first conditional."
                )
            ),

            quiz = listOf(
                QuizQuestion(
                    question = "I ___ visit my brother in Canada this summer.",
                    options = listOf("am going to", "go", "going to", "will to"),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "If I ___ enough money, I'll travel to Japan.",
                    options = listOf("will save", "save", "saved", "am saving"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "I'm ___ Sara at six tomorrow.",
                    options = listOf("meet", "meeting", "meets", "met"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "She going to study medicine.",
                        "She is going to study medicine.",
                        "She is go to study medicine.",
                        "She will to study medicine."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What's the difference between 'will' and 'be going to'?",
                    options = listOf(
                        "No difference at all",
                        "Will is for spontaneous decisions; going to is for plans",
                        "Will is for past; going to is for present",
                        "Will is informal; going to is formal"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "I promise I ___ call you tonight.",
                    options = listOf("am", "will", "going to", "do"),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'flexible' mean?",
                    options = listOf(
                        "Strict and fixed",
                        "Able to change easily",
                        "Very expensive",
                        "Slow and difficult"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct question.",
                    options = listOf(
                        "What you are going to do?",
                        "What are you going to do?",
                        "What going you to do?",
                        "What do you going to do?"
                    ),
                    correctIndex = 1
                )
            )
        )
    }
}