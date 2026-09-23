package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile3 {

    const val BOOK_ID = "english_file_3"

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
            title = "Experiences and Changes",
            titlePersian = "تجربه‌ها و تغییرات",

            objectives = listOf(
                "Talk about life experiences",
                "Describe recent changes",
                "Compare the present with the past",
                "Use the present perfect accurately",
                "Distinguish the present perfect from the simple past",
                "Use for and since with time expressions",
                "Ask follow-up questions in natural conversation"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "experience",
                    persian = "تجربه",
                    pronunciation = "/ɪkˈspɪəriəns/",
                    partOfSpeech = "noun",
                    example = "Traveling alone was a valuable experience.",
                    examplePersian = "تنها سفر کردن تجربه ارزشمندی بود.",
                    collocations = "valuable experience, work experience, life experience"
                ),
                VocabWord(
                    english = "recently",
                    persian = "اخیراً",
                    pronunciation = "/ˈriːsəntli/",
                    partOfSpeech = "adverb",
                    example = "I've recently started a new course.",
                    examplePersian = "اخیراً یک دوره جدید را شروع کرده‌ام."
                ),
                VocabWord(
                    english = "achievement",
                    persian = "دستاورد",
                    pronunciation = "/əˈtʃiːvmənt/",
                    partOfSpeech = "noun",
                    example = "Finishing the project was a major achievement.",
                    examplePersian = "تمام کردن پروژه یک دستاورد مهم بود."
                ),
                VocabWord(
                    english = "opportunity",
                    persian = "فرصت",
                    pronunciation = "/ˌɑːpərˈtuːnəti/",
                    partOfSpeech = "noun",
                    example = "I've had several opportunities to practice English.",
                    examplePersian = "چندین فرصت برای تمرین انگلیسی داشته‌ام."
                ),
                VocabWord(
                    english = "challenge",
                    persian = "چالش",
                    pronunciation = "/ˈtʃælɪndʒ/",
                    partOfSpeech = "noun",
                    example = "Learning a language can be a challenge.",
                    examplePersian = "یادگیری زبان می‌تواند یک چالش باشد."
                ),
                VocabWord(
                    english = "improve",
                    persian = "بهبود دادن / بهتر شدن",
                    pronunciation = "/ɪmˈpruːv/",
                    partOfSpeech = "verb",
                    example = "My speaking has improved a lot.",
                    examplePersian = "مهارت صحبت کردنم خیلی بهتر شده است."
                ),
                VocabWord(
                    english = "move",
                    persian = "نقل مکان کردن",
                    pronunciation = "/muːv/",
                    partOfSpeech = "verb",
                    example = "My family has moved to another city.",
                    examplePersian = "خانواده‌ام به شهر دیگری نقل مکان کرده‌اند."
                ),
                VocabWord(
                    english = "settle",
                    persian = "ساکن شدن / جا افتادن",
                    pronunciation = "/ˈsetl/",
                    partOfSpeech = "verb",
                    example = "It took me a few months to settle into my new job.",
                    examplePersian = "چند ماه طول کشید تا در شغل جدیدم جا بیفتم."
                ),
                VocabWord(
                    english = "adapt",
                    persian = "سازگار شدن",
                    pronunciation = "/əˈdæpt/",
                    partOfSpeech = "verb",
                    example = "It took time to adapt to the new environment.",
                    examplePersian = "سازگار شدن با محیط جدید زمان برد."
                ),
                VocabWord(
                    english = "recent",
                    persian = "اخیر",
                    pronunciation = "/ˈriːsənt/",
                    partOfSpeech = "adjective",
                    example = "Have you heard about the recent changes?",
                    examplePersian = "درباره تغییرات اخیر شنیده‌ای؟"
                ),
                VocabWord(
                    english = "lately",
                    persian = "اخیراً / این اواخر",
                    pronunciation = "/ˈleɪtli/",
                    partOfSpeech = "adverb",
                    example = "I've been very busy lately.",
                    examplePersian = "این اواخر خیلی مشغول بوده‌ام."
                ),
                VocabWord(
                    english = "progress",
                    persian = "پیشرفت",
                    pronunciation = "/ˈprɑːɡres/",
                    partOfSpeech = "noun",
                    example = "I've made good progress this year.",
                    examplePersian = "امسال پیشرفت خوبی داشته‌ام."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "step out of your comfort zone",
                    persian = "از محدوده امن خود خارج شدن",
                    example = "Learning a new language helped me step out of my comfort zone.",
                    examplePersian = "یادگیری یک زبان جدید به من کمک کرد از محدوده امن خود خارج شوم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "turning point",
                    persian = "نقطه عطف",
                    example = "Moving abroad was a turning point in my life.",
                    examplePersian = "مهاجرت به خارج از کشور نقطه عطفی در زندگی من بود.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "come a long way",
                    persian = "پیشرفت زیادی کردن",
                    example = "You've come a long way since you started learning English.",
                    examplePersian = "از وقتی یادگیری انگلیسی را شروع کردی، خیلی پیشرفت کرده‌ای.",
                    register = "informal"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "take up",
                    meaning = "to start a new activity or hobby",
                    persian = "شروع کردن یک فعالیت یا سرگرمی",
                    example = "I've taken up photography recently.",
                    examplePersian = "اخیراً عکاسی را شروع کرده‌ام.",
                    separable = "Sometimes"
                ),
                PhrasalVerb(
                    verb = "give up",
                    meaning = "to stop doing something",
                    persian = "دست کشیدن / رها کردن",
                    example = "I've never given up learning English.",
                    examplePersian = "هیچ‌وقت یادگیری انگلیسی را رها نکرده‌ام.",
                    separable = "Sometimes"
                ),
                PhrasalVerb(
                    verb = "catch up",
                    meaning = "to reach the same level or get updated",
                    persian = "خود را به سطح دیگران رساندن / باخبر شدن",
                    example = "Let's meet and catch up soon.",
                    examplePersian = "بیا به‌زودی همدیگر را ببینیم و با هم صحبت کنیم.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Present Perfect Contractions",
                    content = "در گفتار طبیعی، have و has معمولاً کوتاه می‌شوند: I've, you've, he's, she's, we've, they've."
                ),
                PronunciationTip(
                    title = "Have you...?",
                    content = "در گفتار سریع، Have you می‌تواند به شکل بسیار پیوسته و کوتاه شنیده شود."
                ),
                PronunciationTip(
                    title = "Past Participles",
                    content = "به تلفظ شکل سوم افعال توجه کن: been، seen، written، taken و forgotten."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Talking about experience",
                    content = "در مکالمات روزمره، سؤال‌هایی مانند Have you ever...? راه رایجی برای شروع صحبت درباره تجربه‌های شخصی هستند."
                ),
                CulturalNote(
                    title = "Follow-up questions",
                    content = "بعد از یک پاسخ کوتاه، پرسیدن سؤال تکمیلی مثل When did you go? یا What was it like? باعث طبیعی‌تر شدن مکالمه می‌شود."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Present Perfect",
                    content = """
                        ساختار present perfect:

                        have/has + past participle

                        I have visited London.
                        She has started a new job.
                        They have moved to another city.

                        از این زمان برای تجربه‌ها، اتفاق‌های گذشته با ارتباط با حال و بعضی تغییرات اخیر استفاده می‌کنیم.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Have You Ever...?",
                    content = """
                        برای پرسیدن درباره تجربه‌های زندگی از Have you ever...? استفاده می‌کنیم.

                        Have you ever traveled alone?
                        Have you ever worked abroad?
                        Have you ever tried sushi?

                        پاسخ:

                        Yes, I have.
                        No, I haven't.

                        برای توضیح بیشتر می‌توانیم از simple past استفاده کنیم:

                        Yes, I have. I went to Japan in 2024.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present Perfect vs Simple Past",
                    content = """
                        Present perfect برای تجربه یا زمان نامشخص:

                        I've visited Rome.

                        Simple past برای اتفاقی که زمان مشخصی در گذشته دارد:

                        I visited Rome last summer.

                        اگر زمان مشخصی مانند yesterday, last year, in 2023 یا two weeks ago داریم، معمولاً simple past مناسب است.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "For and Since",
                    content = """
                        از for برای بیان مدت استفاده می‌کنیم:

                        I've lived here for three years.

                        از since برای بیان نقطه شروع استفاده می‌کنیم:

                        I've lived here since 2023.

                        مثال‌های دیگر:

                        for two weeks
                        for a long time
                        since Monday
                        since I was a child
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present Perfect with Recently and Lately",
                    content = """
                        recently و lately اغلب برای اتفاق‌ها و تغییرات نزدیک به زمان حال استفاده می‌شوند:

                        I've recently changed my job.
                        She's been very busy lately.
                        We've recently moved to a new apartment.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I have visited London last year.",
                    correct = "I visited London last year.",
                    explanation = "وقتی زمان مشخص گذشته مانند last year داریم، simple past استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I am here since 2022.",
                    correct = "I have been here since 2022.",
                    explanation = "برای موقعیتی که از گذشته شروع شده و هنوز ادامه دارد، present perfect مناسب است."
                ),
                CommonMistake(
                    wrong = "Have you ever went abroad?",
                    correct = "Have you ever gone abroad?",
                    explanation = "بعد از have/has باید past participle بیاید؛ go → gone."
                ),
                CommonMistake(
                    wrong = "I have lived here since three years.",
                    correct = "I have lived here for three years.",
                    explanation = "for برای مدت و since برای نقطه شروع استفاده می‌شود."
                ),
                CommonMistake(
                    wrong = "She has seen him yesterday.",
                    correct = "She saw him yesterday.",
                    explanation = "yesterday زمان مشخص گذشته است و با simple past استفاده می‌شود."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Alex",
                    english = "You look different. Have you changed your hairstyle?",
                    persian = "متفاوت به نظر می‌رسی. مدل موهایت را عوض کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Yes, I have. I changed it a few weeks ago.",
                    persian = "بله. چند هفته پیش آن را