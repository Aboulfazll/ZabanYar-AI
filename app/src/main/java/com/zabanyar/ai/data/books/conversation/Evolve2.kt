package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object Evolve2 {

    const val BOOK_ID = "evolve_2"

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
            title = "Everyday Life",
            titlePersian = "زندگی روزمره",

            objectives = listOf(
                "Talk about daily routines",
                "Describe regular activities",
                "Ask and answer questions about everyday life",
                "Use the present simple correctly",
                "Use frequency adverbs",
                "Talk about free-time activities",
                "Understand a conversation about someone's routine"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "routine",
                    persian = "روال روزمره",
                    pronunciation = "/ruːˈtiːn/",
                    partOfSpeech = "noun",
                    example = "My morning routine is simple.",
                    examplePersian = "روال صبحگاهی من ساده است.",
                    collocations = "daily routine, morning routine"
                ),
                VocabWord(
                    english = "wake up",
                    persian = "بیدار شدن",
                    pronunciation = "/weɪk ʌp/",
                    partOfSpeech = "verb",
                    example = "I wake up at seven.",
                    examplePersian = "من ساعت هفت بیدار می‌شوم."
                ),
                VocabWord(
                    english = "get ready",
                    persian = "آماده شدن",
                    pronunciation = "/ɡet ˈredi/",
                    partOfSpeech = "verb",
                    example = "I get ready for school.",
                    examplePersian = "برای مدرسه آماده می‌شوم."
                ),
                VocabWord(
                    english = "have breakfast",
                    persian = "صبحانه خوردن",
                    pronunciation = "/hæv ˈbrekfəst/",
                    partOfSpeech = "verb phrase",
                    example = "I have breakfast at home.",
                    examplePersian = "من در خانه صبحانه می‌خورم."
                ),
                VocabWord(
                    english = "commute",
                    persian = "رفت‌وآمد روزانه",
                    pronunciation = "/kəˈmjuːt/",
                    partOfSpeech = "verb",
                    example = "I commute to work by bus.",
                    examplePersian = "من با اتوبوس به محل کار رفت‌وآمد می‌کنم."
                ),
                VocabWord(
                    english = "usually",
                    persian = "معمولاً",
                    pronunciation = "/ˈjuːʒuəli/",
                    partOfSpeech = "adverb",
                    example = "I usually walk to class.",
                    examplePersian = "من معمولاً پیاده به کلاس می‌روم."
                ),
                VocabWord(
                    english = "sometimes",
                    persian = "گاهی اوقات",
                    pronunciation = "/ˈsʌmtaɪmz/",
                    partOfSpeech = "adverb",
                    example = "I sometimes study at night.",
                    examplePersian = "گاهی شب‌ها درس می‌خوانم."
                ),
                VocabWord(
                    english = "often",
                    persian = "اغلب",
                    pronunciation = "/ˈɔːfən/",
                    partOfSpeech = "adverb",
                    example = "She often meets her friends.",
                    examplePersian = "او اغلب دوستانش را می‌بیند."
                ),
                VocabWord(
                    english = "rarely",
                    persian = "به‌ندرت",
                    pronunciation = "/ˈrerli/",
                    partOfSpeech = "adverb",
                    example = "I rarely watch TV.",
                    examplePersian = "من به‌ندرت تلویزیون تماشا می‌کنم."
                ),
                VocabWord(
                    english = "free time",
                    persian = "اوقات فراغت",
                    pronunciation = "/friː taɪm/",
                    partOfSpeech = "noun",
                    example = "What do you do in your free time?",
                    examplePersian = "در اوقات فراغت چه کار می‌کنی؟"
                ),
                VocabWord(
                    english = "exercise",
                    persian = "ورزش کردن",
                    pronunciation = "/ˈeksərsaɪz/",
                    partOfSpeech = "verb",
                    example = "I exercise three times a week.",
                    examplePersian = "من سه بار در هفته ورزش می‌کنم."
                ),
                VocabWord(
                    english = "relax",
                    persian = "استراحت کردن",
                    pronunciation = "/rɪˈlæks/",
                    partOfSpeech = "verb",
                    example = "I relax after work.",
                    examplePersian = "بعد از کار استراحت می‌کنم."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "take it easy",
                    persian = "آرام باش / سخت نگیر",
                    example = "You worked all day. Take it easy tonight.",
                    examplePersian = "تمام روز کار کردی. امشب کمی استراحت کن.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "once in a while",
                    persian = "هر از گاهی",
                    example = "I eat out once in a while.",
                    examplePersian = "هر از گاهی بیرون غذا می‌خورم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "early bird",
                    persian = "کسی که صبح زود بیدار می‌شود",
                    example = "My sister is an early bird.",
                    examplePersian = "خواهرم کسی است که صبح خیلی زود بیدار می‌شود.",
                    register = "informal"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "get up",
                    meaning = "to leave your bed after sleeping",
                    persian = "از خواب بیدار شدن و از تخت بلند شدن",
                    example = "I get up at 6:30.",
                    examplePersian = "من ساعت ۶:۳۰ از خواب بیدار می‌شوم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "go out",
                    meaning = "to leave home for an activity",
                    persian = "بیرون رفتن",
                    example = "We go out on Friday evenings.",
                    examplePersian = "ما عصرهای جمعه بیرون می‌رویم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "hang out",
                    meaning = "to spend relaxed time with people",
                    persian = "وقت گذراندن با دوستان",
                    example = "I hang out with my friends after class.",
                    examplePersian = "بعد از کلاس با دوستانم وقت می‌گذرانم.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Third-person -s",
                    content = "در زمان حال ساده، برای he، she و it معمولاً به فعل s یا es اضافه می‌شود: works, watches, studies."
                ),
                PronunciationTip(
                    title = "Do you...?",
                    content = "در سؤال‌های Do you، کلمه do معمولاً بدون تأکید شدید و به شکل طبیعی در جمله تلفظ می‌شود."
                ),
                PronunciationTip(
                    title = "Frequency words",
                    content = "کلمات usually، often و sometimes را با ریتم طبیعی جمله تمرین کن."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Talking about routines",
                    content = "صحبت درباره برنامه روزانه یکی از موضوعات رایج در گفت‌وگوهای ابتدایی است و می‌تواند راهی طبیعی برای پیدا کردن علایق مشترک باشد."
                ),
                CulturalNote(
                    title = "Time and schedules",
                    content = "در بسیاری از محیط‌های آموزشی و کاری انگلیسی‌زبان، صحبت درباره زمان‌بندی روزانه و ساعت شروع فعالیت‌ها بسیار رایج است."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Present Simple",
                    content = """
                        از زمان حال ساده برای عادت‌ها، برنامه‌های معمول و واقعیت‌های عمومی استفاده می‌کنیم.

                        I work every day.
                        You study English.
                        We live in a city.

                        برای he، she و it معمولاً s یا es به فعل اضافه می‌شود:

                        He works.
                        She studies.
                        It starts at eight.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Negative Sentences",
                    content = """
                        برای منفی کردن از don't و doesn't استفاده می‌کنیم.

                        I don't work on Fridays.
                        You don't study at night.
                        He doesn't play tennis.
                        She doesn't drink coffee.

                        بعد از doesn't، فعل به شکل ساده می‌آید:

                        She doesn't work.

                        نه:
                        She doesn't works.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Questions with Do and Does",
                    content = """
                        برای سؤال:

                        Do you work here?
                        Do they study English?
                        Does he live nearby?
                        Does she exercise?

                        پاسخ کوتاه:

                        Yes, I do.
                        No, I don't.

                        Yes, she does.
                        No, she doesn't.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Adverbs of Frequency",
                    content = """
                        کلمات frequency میزان تکرار یک فعالیت را نشان می‌دهند.

                        always
                        usually
                        often
                        sometimes
                        rarely
                        never

                        معمولاً قبل از فعل اصلی می‌آیند:

                        I usually wake up early.
                        She often studies at night.

                        اما با فعل be بعد از be قرار می‌گیرند:

                        He is usually tired.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Time Expressions",
                    content = """
                        عبارت‌هایی مانند every day، every week، on Mondays و in the morning برای صحبت درباره زمان عادت‌ها استفاده می‌شوند.

                        I exercise every morning.
                        We study English on Mondays.
                        She works in the evening.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "She work every day.",
                    correct = "She works every day.",
                    explanation = "در زمان حال ساده، برای he، she و it باید شکل سوم‌شخص فعل را استفاده کنیم."
                ),
                CommonMistake(
                    wrong = "He doesn't works here.",
                    correct = "He doesn't work here.",
                    explanation = "بعد از doesn't، فعل اصلی به شکل ساده می‌آید."
                ),
                CommonMistake(
                    wrong = "Do she study English?",
                    correct = "Does she study English?",
                    explanation = "برای he، she و it از does استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I am usually go to school by bus.",
                    correct = "I usually go to school by bus.",
                    explanation = "برای عادت‌های روزانه با فعل اصلی، نیازی به am نداریم."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Lina",
                    english = "What time do you usually get up?",
                    persian = "معمولاً چه ساعتی بیدار می‌شوی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I usually get up at seven.",
                    persian = "معمولاً ساعت هفت بیدار می‌شوم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "That's early. Do you have breakfast at home?",
                    persian = "زوده. در خانه صبحانه می‌خوری؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Yes, I do. I usually have bread, cheese, and fruit.",
                    persian = "بله. معمولاً نان، پنیر و میوه می‌خورم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "Do you drink coffee in the morning?",
                    persian = "صبح‌ها قهوه می‌نوشی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "No, I don't. I usually drink tea.",
                    persian = "نه. معمولاً چای می‌نوشم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "How do you get to school?",
                    persian = "چطور به مدرسه می‌روی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I take the bus. It takes about twenty minutes.",
                    persian = "با اتوبوس می‌روم. حدود بیست دقیقه طول می‌کشد."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "Do you like your school?",
                    persian = "مدرسه‌ات را دوست داری؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Yes. I really like my English class.",
                    persian = "بله. واقعاً کلاس انگلیسی‌ام را دوست دارم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "What time does your class start?",
                    persian = "کلاست چه ساعتی شروع می‌شود؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "It starts at nine.",
                    persian = "ساعت نه شروع می‌شود."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "What do you do after school?",
                    persian = "بعد از مدرسه چه کار می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I usually go home and have lunch.",
                    persian = "معمولاً به خانه می‌روم و ناهار می‌خورم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "Do you study in the afternoon?",
                    persian = "بعدازظهر درس می‌خوانی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Yes, I do. I study for about two hours.",
                    persian = "بله. حدود دو ساعت درس می‌خوانم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "And what do you do in your free time?",
                    persian = "و در اوقات فراغت چه کار می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I often play football with my friends.",
                    persian = "اغلب با دوستانم فوتبال بازی می‌کنم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "Do you exercise every day?",
                    persian = "هر روز ورزش می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Not every day. I exercise three or four times a week.",
                    persian = "نه هر روز. سه یا چهار بار در هفته ورزش می‌کنم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "What about weekends?",
                    persian = "آخر هفته‌ها چطور؟"
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "I usually sleep a little later and hang out with my friends.",
                    persian = "معمولاً کمی دیرتر بیدار می‌شوم و با دوستانم وقت می‌گذرانم."
                ),
                DialogueLine(
                    speaker = "Lina",
                    english = "That sounds nice. I like relaxing on weekends, too.",
                    persian = "خوبه. من هم دوست دارم آخر هفته‌ها استراحت کنم."
                ),
                DialogueLine(
                    speaker = "Sam",
                    english = "Maybe we can play football this weekend.",
                    persian = "شاید بتوانیم این آخر هفته فوتبال بازی کنیم."
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What time does Sam usually get up?",
                    answer = "He usually gets up at seven."
                ),
                ComprehensionQuestion(
                    question = "What does Sam usually drink in the morning?",
                    answer = "He usually drinks tea."
                ),
                ComprehensionQuestion(
                    question = "How does Sam get to school?",
                    answer = "He takes the bus."
                ),
                ComprehensionQuestion(
                    question = "What time does his class start?",
                    answer = "It starts at nine."
                ),
                ComprehensionQuestion(
                    question = "What does Sam often do in his free time?",
                    answer = "He often plays football with his friends."
                ),
                ComprehensionQuestion(
                    question = "What does Sam usually do on weekends?",
                    answer = "He sleeps a little later and hangs out with his friends."
                )
            ),

            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe your morning routine.",
                    promptPersian = "روال صبحگاهی خودت را توضیح بده.",
                    hints = "I usually wake up... / Then I... / After that..."
                ),
                SpeakingTask(
                    prompt = "Ask a partner six questions about their daily routine.",
                    promptPersian = "شش سؤال درباره برنامه روزانه یک دوست بپرس.",
                    hints = "What time do you...? / Do you...? / How often do you...?"
                ),
                SpeakingTask(
                    prompt = "Talk about what you usually do in your free time.",
                    promptPersian = "درباره کارهایی که معمولاً در اوقات فراغت انجام می‌دهی صحبت کن.",
                    hints = "I often... / I sometimes... / I rarely..."
                )
            ),

            writingTasks = listOf(
                WritingTask(
                    prompt = "Write about your typical weekday from morning to evening.",
                    promptPersian = "درباره یک روز معمولی خودت از صبح تا شب بنویس.",
                    wordCount = 100,
                    hints = "Use present simple and at least four frequency expressions."
                )
            ),

            quiz = listOf(
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "She work every day.",
                        "She works every day.",
                        "She working every day.",
                        "She is work every day."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Complete: I ___ coffee every morning.",
                    options = listOf(
                        "drink",
                        "drinks",
                        "drinking",
                        "am drink"
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: He ___ play tennis.",
                    options = listOf(
                        "don't",
                        "doesn't",
                        "isn't",
                        "aren't"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Choose the correct question.",
                    options = listOf(
                        "Does you work here?",
                        "Do you work here?",
                        "Are you work here?",
                        "You do work here?"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which word means 'هرگز'?",
                    options = listOf(
                        "usually",
                        "often",
                        "never",
                        "sometimes"
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "I usually go by bus.",
                        "I go usually by bus.",
                        "I am usually go by bus.",
                        "I usually going by bus."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Complete: ___ she study English?",
                    options = listOf(
                        "Do",
                        "Does",
                        "Is",
                        "Are"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'hang out' mean?",
                    options = listOf(
                        "To sleep",
                        "To study",
                        "To spend relaxed time with people",
                        "To travel"
                    ),
                    correctIndex = 2
                )
            )
        )
    }
}