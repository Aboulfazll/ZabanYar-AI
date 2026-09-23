package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile2 {

    const val BOOK_ID = "english_file_2"

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
                "Describe habits and regular activities",
                "Ask and answer questions about everyday life",
                "Use the present simple correctly",
                "Use frequency adverbs",
                "Talk about likes and dislikes",
                "Tell the time and describe schedules"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "routine",
                    persian = "روتین / برنامه روزانه",
                    pronunciation = "/ruːˈtiːn/",
                    partOfSpeech = "noun",
                    example = "I have a simple morning routine.",
                    examplePersian = "من یک برنامه ساده صبحگاهی دارم.",
                    collocations = "daily routine, morning routine"
                ),
                VocabWord(
                    english = "wake up",
                    persian = "از خواب بیدار شدن",
                    pronunciation = "/weɪk ʌp/",
                    partOfSpeech = "phrasal verb",
                    example = "I wake up at seven every morning.",
                    examplePersian = "من هر روز صبح ساعت هفت بیدار می‌شوم."
                ),
                VocabWord(
                    english = "get ready",
                    persian = "آماده شدن",
                    pronunciation = "/ɡet ˈredi/",
                    partOfSpeech = "phrase",
                    example = "I get ready for school after breakfast.",
                    examplePersian = "بعد از صبحانه برای مدرسه آماده می‌شوم."
                ),
                VocabWord(
                    english = "commute",
                    persian = "رفت‌وآمد روزانه",
                    pronunciation = "/kəˈmjuːt/",
                    partOfSpeech = "verb/noun",
                    example = "She commutes to work by bus.",
                    examplePersian = "او با اتوبوس به محل کارش رفت‌وآمد می‌کند."
                ),
                VocabWord(
                    english = "schedule",
                    persian = "برنامه زمانی",
                    pronunciation = "/ˈskedʒuːl/",
                    partOfSpeech = "noun",
                    example = "My schedule is busy on Mondays.",
                    examplePersian = "برنامه من دوشنبه‌ها شلوغ است."
                ),
                VocabWord(
                    english = "usually",
                    persian = "معمولاً",
                    pronunciation = "/ˈjuːʒuəli/",
                    partOfSpeech = "adverb",
                    example = "I usually have coffee in the morning.",
                    examplePersian = "من معمولاً صبح قهوه می‌خورم."
                ),
                VocabWord(
                    english = "sometimes",
                    persian = "گاهی",
                    pronunciation = "/ˈsʌmtaɪmz/",
                    partOfSpeech = "adverb",
                    example = "I sometimes walk to school.",
                    examplePersian = "گاهی پیاده به مدرسه می‌روم."
                ),
                VocabWord(
                    english = "hardly ever",
                    persian = "تقریباً هیچ‌وقت",
                    pronunciation = "/ˈhɑːrdli ˈevər/",
                    partOfSpeech = "adverb",
                    example = "I hardly ever watch television.",
                    examplePersian = "من تقریباً هیچ‌وقت تلویزیون تماشا نمی‌کنم."
                ),
                VocabWord(
                    english = "free time",
                    persian = "وقت آزاد",
                    pronunciation = "/friː taɪm/",
                    partOfSpeech = "noun",
                    example = "What do you do in your free time?",
                    examplePersian = "در وقت آزادت چه کار می‌کنی؟"
                ),
                VocabWord(
                    english = "exercise",
                    persian = "ورزش کردن",
                    pronunciation = "/ˈeksərsaɪz/",
                    partOfSpeech = "verb/noun",
                    example = "I exercise three times a week.",
                    examplePersian = "من سه بار در هفته ورزش می‌کنم."
                ),
                VocabWord(
                    english = "relax",
                    persian = "استراحت کردن",
                    pronunciation = "/rɪˈlæks/",
                    partOfSpeech = "verb",
                    example = "I relax at home after work.",
                    examplePersian = "بعد از کار در خانه استراحت می‌کنم."
                ),
                VocabWord(
                    english = "prefer",
                    persian = "ترجیح دادن",
                    pronunciation = "/prɪˈfɜːr/",
                    partOfSpeech = "verb",
                    example = "I prefer tea to coffee.",
                    examplePersian = "من چای را به قهوه ترجیح می‌دهم."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "early bird",
                    persian = "فرد سحرخیز",
                    example = "My sister is an early bird and gets up before six.",
                    examplePersian = "خواهرم سحرخیز است و قبل از ساعت شش بیدار می‌شود.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "take it easy",
                    persian = "آرام گرفتن / سخت نگرفتن",
                    example = "You worked all day. Take it easy tonight.",
                    examplePersian = "تمام روز کار کردی. امشب کمی استراحت کن.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "on time",
                    persian = "به‌موقع",
                    example = "I always try to arrive on time.",
                    examplePersian = "همیشه سعی می‌کنم به‌موقع برسم.",
                    register = "neutral"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "get up",
                    meaning = "to leave your bed after sleeping",
                    persian = "از تخت بلند شدن",
                    example = "I get up at seven.",
                    examplePersian = "ساعت هفت از تخت بلند می‌شوم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "go out",
                    meaning = "to leave home, especially for entertainment",
                    persian = "بیرون رفتن",
                    example = "We usually go out on Friday evenings.",
                    examplePersian = "ما معمولاً عصرهای جمعه بیرون می‌رویم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "come back",
                    meaning = "to return",
                    persian = "برگشتن",
                    example = "I come back home at six.",
                    examplePersian = "ساعت شش به خانه برمی‌گردم.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Third-person -s",
                    content = "در زمان حال ساده، برای he, she و it معمولاً s یا es به فعل اضافه می‌شود: works, watches, studies."
                ),
                PronunciationTip(
                    title = "Usually",
                    content = "در گفتار طبیعی usually معمولاً به صورت /ˈjuːʒuəli/ یا شکل کوتاه‌تر شنیده می‌شود."
                ),
                PronunciationTip(
                    title = "Time expressions",
                    content = "در عبارت‌هایی مانند at seven و at night، صدای t ممکن است در گفتار سریع بسیار ضعیف شنیده شود."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Schedules",
                    content = "در محیط‌های آموزشی و کاری انگلیسی‌زبان، صحبت درباره schedule و زمان‌بندی روزانه بسیار رایج است."
                ),
                CulturalNote(
                    title = "Small talk",
                    content = "پرسیدن درباره برنامه روزانه، آخر هفته یا علایق می‌تواند بخشی از گفت‌وگوی کوتاه و دوستانه باشد."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Present Simple: Affirmative",
                    content = """
                        از present simple برای عادت‌ها، برنامه‌های معمول و واقعیت‌های عمومی استفاده می‌کنیم.

                        I work every day.
                        You study English.
                        We live in a city.

                        برای he, she و it معمولاً s یا es اضافه می‌شود:

                        He works.
                        She studies.
                        It starts at eight.

                        اگر فعل به consonant + y ختم شود، y به ies تبدیل می‌شود:

                        study → studies
                        try → tries
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present Simple: Questions",
                    content = """
                        برای سؤال در زمان حال ساده از do و does استفاده می‌کنیم.

                        Do you work here?
                        Do they study English?
                        Does she live nearby?
                        Does he play football?

                        بعد از does، فعل به شکل ساده می‌آید:

                        Does she work here?

                        نه:

                        Does she works here?
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present Simple: Negatives",
                    content = """
                        برای منفی کردن از don't و doesn't استفاده می‌کنیم.

                        I don't work on Fridays.
                        We don't watch TV every night.
                        She doesn't drive to work.
                        He doesn't like coffee.

                        بعد از doesn't فعل به شکل ساده می‌آید.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Frequency Adverbs",
                    content = """
                        قیدهای تکرار میزان انجام یک کار را نشان می‌دهند:

                        always
                        usually
                        often
                        sometimes
                        hardly ever
                        never

                        معمولاً قبل از فعل اصلی قرار می‌گیرند:

                        I usually walk to work.
                        She often studies at night.

                        اما با فعل be معمولاً بعد از be می‌آیند:

                        He is usually tired after work.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Telling the Time",
                    content = """
                        برای گفتن زمان می‌توانیم از ساختارهای زیر استفاده کنیم:

                        It's seven o'clock.
                        It's half past seven.
                        It's quarter past seven.
                        It's quarter to eight.

                        برای زمان دقیق از at استفاده می‌کنیم:

                        The class starts at nine.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "She work every day.",
                    correct = "She works every day.",
                    explanation = "در سوم شخص مفرد در زمان حال ساده معمولاً s به فعل اضافه می‌شود."
                ),
                CommonMistake(
                    wrong = "Does he works here?",
                    correct = "Does he work here?",
                    explanation = "بعد از does، فعل به شکل ساده می‌آید."
                ),
                CommonMistake(
                    wrong = "He don't like coffee.",
                    correct = "He doesn't like coffee.",
                    explanation = "برای he, she و it از doesn't استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I always am tired.",
                    correct = "I am always tired.",
                    explanation = "با فعل be، قید تکرار معمولاً بعد از فعل be قرار می‌گیرد."
                ),
                CommonMistake(
                    wrong = "I go to work in 8 o'clock.",
                    correct = "I go to work at 8 o'clock.",
                    explanation = "برای ساعت مشخص از at استفاده می‌کنیم."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Lena",
                    english = "What time do you usually get up?",
                    persian = "معمولاً چه ساعتی بیدار می‌شوی؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "I usually get up at seven, but I get up earlier on Mondays.",
                    persian = "معمولاً ساعت هفت بیدار می‌شوم، اما دوشنبه‌ها زودتر بیدار می‌شوم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Why do you get up earlier on Mondays?",
                    persian = "چرا دوشنبه‌ها زودتر بیدار می‌شوی؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "I have an early class at eight.",
                    persian = "یک کلاس زودهنگام ساعت هشت دارم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Do you have breakfast before class?",
                    persian = "قبل از کلاس صبحانه می‌خوری؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Yes, I do. I usually have some fruit and toast.",
                    persian = "بله. معمولاً کمی میوه و نان تست می‌خورم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Do you drink coffee in the morning?",
                    persian = "صبح‌ها قهوه می‌خوری؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Sometimes. I prefer tea, though.",
                    persian = "گاهی. البته چای را ترجیح می‌دهم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "How do you get to school?",
                    persian = "چطور به مدرسه می‌روی؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "I usually take the bus. It takes about twenty minutes.",
                    persian = "معمولاً با اتوبوس می‌روم. حدود بیست دقیقه طول می‌کشد."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "What time do your classes finish?",
                    persian = "کلاس‌هایت چه ساعتی تمام می‌شوند؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "They usually finish at three.",
                    persian = "معمولاً ساعت سه تمام می‌شوند."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "What do you do after school?",
                    persian = "بعد از مدرسه چه کار می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "I go home, have something to eat, and do my homework.",
                    persian = "به خانه می‌روم، چیزی می‌خورم و تکالیفم را انجام می‌دهم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Do you exercise during the week?",
                    persian = "در طول هفته ورزش می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Yes. I usually play basketball twice a week.",
                    persian = "بله. معمولاً هفته‌ای دو بار بسکتبال بازی می‌کنم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "What do you do at the weekend?",
                    persian = "آخر هفته چه کار می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "I like meeting friends and watching movies.",
                    persian = "دوست دارم دوستانم را ببینم و فیلم تماشا کنم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Do you often go out on Saturday night?",
                    persian = "شنبه شب‌ها زیاد بیرون می‌روی؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Not really. I hardly ever go out on Saturday because I'm usually tired.",
                    persian = "نه خیلی. شنبه‌ها تقریباً هیچ‌وقت بیرون نمی‌روم چون معمولاً خسته‌ام."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "I understand. My schedule is busy, too.",
                    persian = "می‌فهمم. برنامه من هم شلوغ است."
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "Maybe we can meet for coffee sometime.",
                    persian = "شاید یک روز بتوانیم برای قهوه همدیگر را ببینیم."
                ),
                DialogueLine(
                    speaker = "Lena",
                    english = "Sure. How about Saturday afternoon?",
                    persian = "حتماً. شنبه بعدازظهر چطور است؟"
                ),
                DialogueLine(
                    speaker = "Mark",
                    english = "That works