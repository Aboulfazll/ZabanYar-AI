package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object TopNotch2 {

    const val BOOK_ID = "top_notch_2"

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
            title = "Getting Acquainted",
            titlePersian = "آشنایی با افراد",

            objectives = listOf(
                "Introduce yourself in more detail",
                "Ask and answer questions about personal information",
                "Talk about work, study, interests, and daily life",
                "Use the present simple for routines and facts",
                "Use question words accurately",
                "Continue a conversation with follow-up questions"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "acquaintance",
                    persian = "آشنا",
                    pronunciation = "/əˈkweɪntəns/",
                    partOfSpeech = "noun",
                    example = "She's an old acquaintance of mine.",
                    examplePersian = "او یکی از آشنایان قدیمی من است.",
                    collocations = "old acquaintance, casual acquaintance",
                    synonyms = "contact",
                    usageTip = "An acquaintance is someone you know but who is not necessarily a close friend."
                ),
                VocabWord(
                    english = "profession",
                    persian = "حرفه",
                    pronunciation = "/prəˈfeʃən/",
                    partOfSpeech = "noun",
                    example = "Teaching is a rewarding profession.",
                    examplePersian = "معلمی حرفه‌ای رضایت‌بخش است.",
                    collocations = "professional career, medical profession"
                ),
                VocabWord(
                    english = "occupation",
                    persian = "شغل",
                    pronunciation = "/ˌɑːkjəˈpeɪʃən/",
                    partOfSpeech = "noun",
                    example = "Please write your occupation on the form.",
                    examplePersian = "لطفاً شغلتان را در فرم بنویسید.",
                    synonyms = "job, profession",
                    usageTip = "Occupation is common in forms and official contexts."
                ),
                VocabWord(
                    english = "colleague",
                    persian = "همکار",
                    pronunciation = "/ˈkɑːliːɡ/",
                    partOfSpeech = "noun",
                    example = "One of my colleagues works from home.",
                    examplePersian = "یکی از همکارانم از خانه کار می‌کند.",
                    collocations = "close colleague, former colleague"
                ),
                VocabWord(
                    english = "department",
                    persian = "بخش / دپارتمان",
                    pronunciation = "/dɪˈpɑːrtmənt/",
                    partOfSpeech = "noun",
                    example = "She works in the marketing department.",
                    examplePersian = "او در بخش بازاریابی کار می‌کند."
                ),
                VocabWord(
                    english = "background",
                    persian = "پیشینه / سابقه",
                    pronunciation = "/ˈbækɡraʊnd/",
                    partOfSpeech = "noun",
                    example = "He has a background in engineering.",
                    examplePersian = "او سابقه مهندسی دارد.",
                    collocations = "educational background, professional background"
                ),
                VocabWord(
                    english = "hometown",
                    persian = "شهر زادگاه",
                    pronunciation = "/ˈhoʊmtaʊn/",
                    partOfSpeech = "noun",
                    example = "My hometown is a small city near the coast.",
                    examplePersian = "زادگاه من شهری کوچک نزدیک ساحل است."
                ),
                VocabWord(
                    english = "currently",
                    persian = "در حال حاضر",
                    pronunciation = "/ˈkɜːrəntli/",
                    partOfSpeech = "adverb",
                    example = "I'm currently studying business.",
                    examplePersian = "در حال حاضر در رشته کسب‌وکار تحصیل می‌کنم.",
                    synonyms = "now, at present"
                ),
                VocabWord(
                    english = "interest",
                    persian = "علاقه",
                    pronunciation = "/ˈɪntrəst/",
                    partOfSpeech = "noun",
                    example = "We have several interests in common.",
                    examplePersian = "ما چند علاقه مشترک داریم.",
                    collocations = "common interest, personal interest"
                ),
                VocabWord(
                    english = "experience",
                    persian = "تجربه",
                    pronunciation = "/ɪkˈspɪriəns/",
                    partOfSpeech = "noun",
                    example = "She has several years of experience.",
                    examplePersian = "او چندین سال تجربه دارد.",
                    collocations = "work experience, previous experience"
                ),
                VocabWord(
                    english = "available",
                    persian = "در دسترس / آزاد",
                    pronunciation = "/əˈveɪləbəl/",
                    partOfSpeech = "adjective",
                    example = "Are you available this afternoon?",
                    examplePersian = "امروز بعدازظهر وقت داری؟"
                ),
                VocabWord(
                    english = "socialize",
                    persian = "اجتماعی شدن / معاشرت کردن",
                    pronunciation = "/ˈsoʊʃəlaɪz/",
                    partOfSpeech = "verb",
                    example = "I like to socialize with my coworkers.",
                    examplePersian = "دوست دارم با همکارانم معاشرت کنم."
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "استرس در occupation",
                    content = "در occupation استرس اصلی روی بخش میانی واژه قرار می‌گیرد. واژه را بخش‌بندی کنید و استرس را روی هجای اصلی نگه دارید."
                ),
                PronunciationTip(
                    title = "صدای /ər/ در currently",
                    content = "در لهجه آمریکایی صدای پایانی currently به شکل /li/ شنیده می‌شود و بخش پایانی باید کوتاه و روان باشد."
                ),
                PronunciationTip(
                    title = "اتصال کلمات در مکالمه",
                    content = "در گفتار طبیعی کلمات پشت سر هم به هم متصل می‌شوند. هنگام تمرین، جمله‌ها را کلمه‌به‌کلمه و بیش از حد جدا تلفظ نکنید."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Small talk",
                    content = "در بسیاری از موقعیت‌های انگلیسی‌زبان، گفت‌وگو با سؤال‌های ساده درباره کار، محل زندگی، علایق و برنامه‌های روزمره شروع می‌شود."
                ),
                CulturalNote(
                    title = "Follow-up questions",
                    content = "برای ادامه دادن مکالمه، فقط جواب دادن کافی نیست. پرسیدن یک سؤال مرتبط بعد از پاسخ طرف مقابل باعث طبیعی‌تر شدن گفت‌وگو می‌شود."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Present Simple for Facts and Routines",
                    content = """
                        از زمان حال ساده برای بیان عادت‌ها، برنامه‌های معمول و واقعیت‌ها استفاده می‌کنیم.

                        I work in a bank.
                        She studies architecture.
                        They live near the university.

                        در سوم شخص مفرد معمولاً به فعل s یا es اضافه می‌شود:

                        He works.
                        She studies.
                        It starts.
                    """.trimIndent()
                ),

                GrammarSection(
                    title = "Wh- Questions",
                    content = """
                        برای گرفتن اطلاعات از کلمات پرسشی استفاده می‌کنیم:

                        What do you do?
                        Where do you work?
                        Where are you from?
                        What do you study?
                        Who do you work with?
                        Why do you like your job?

                        در سؤال‌هایی که فعل اصلی دارند، معمولاً از do یا does استفاده می‌شود.
                    """.trimIndent()
                ),

                GrammarSection(
                    title = "Do and Does",
                    content = """
                        برای I, you, we و they از do استفاده می‌کنیم:

                        Do you work here?
                        Where do they live?

                        برای he, she و it از does استفاده می‌کنیم:

                        Does she work here?
                        Where does he live?

                        بعد از does، فعل اصلی بدون s می‌آید:

                        Does she work here?

                        نه:

                        Does she works here?
                    """.trimIndent()
                ),

                GrammarSection(
                    title = "Adverbs of Frequency",
                    content = """
                        برای بیان میزان تکرار یک فعالیت می‌توانیم از قیدهایی مانند always, usually, often, sometimes و never استفاده کنیم.

                        I usually work from home.
                        She often studies at night.
                        They sometimes eat together.
                        He never drinks coffee.

                        این قیدها معمولاً قبل از فعل اصلی قرار می‌گیرند.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "What you do?",
                    correct = "What do you do?",
                    explanation = "در سؤال حال ساده با فعل اصلی باید از do یا does استفاده کنیم."
                ),
                CommonMistake(
                    wrong = "Where does she works?",
                    correct = "Where does she work?",
                    explanation = "بعد از does، فعل اصلی به شکل ساده می‌آید."
                ),
                CommonMistake(
                    wrong = "He work in a bank.",
                    correct = "He works in a bank.",
                    explanation = "برای سوم شخص مفرد در جمله مثبت حال ساده معمولاً s به فعل اضافه می‌شود."
                ),
                CommonMistake(
                    wrong = "I am usually work at home.",
                    correct = "I usually work at home.",
                    explanation = "در این ساختار از am قبل از فعل اصلی استفاده نمی‌کنیم."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Maya",
                    english = "Hi. I don't think we've met before. I'm Maya.",
                    persian = "سلام. فکر نمی‌کنم قبلاً همدیگر را دیده باشیم. من مایا هستم."
                ),
                DialogueLine(
                    speaker = "Ryan",
                    english = "Hi, Maya. I'm Ryan. Nice to meet you.",
                    persian = "سلام مایا. من رایان هستم. از آشنایی با تو خوشحالم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Nice to meet you, too. Are you new to the company?",
                    persian = "من هم از آشنایی با تو