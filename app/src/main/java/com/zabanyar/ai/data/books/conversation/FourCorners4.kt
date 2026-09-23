package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCorners4 {

    const val BOOK_ID = "four_corners_4"

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
            title = "Getting Along",
            titlePersian = "خوب کنار آمدن با دیگران",

            objectives = listOf(
                "Discuss relationships and communication",
                "Describe habits and personality traits",
                "Talk about problems in relationships",
                "Give advice and suggestions",
                "Use should, ought to, and had better",
                "Use gerunds and infinitives after common verbs",
                "Explain opinions with reasons and examples"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "communication",
                    persian = "ارتباط",
                    pronunciation = "/kəˌmjuːnɪˈkeɪʃən/",
                    partOfSpeech = "noun",
                    example = "Good communication is important in every relationship.",
                    examplePersian = "ارتباط خوب در هر رابطه‌ای مهم است.",
                    collocations = "effective communication, communication skills"
                ),
                VocabWord(
                    english = "misunderstanding",
                    persian = "سوءتفاهم",
                    pronunciation = "/ˌmɪsʌndərˈstændɪŋ/",
                    partOfSpeech = "noun",
                    example = "A simple misunderstanding caused an argument.",
                    examplePersian = "یک سوءتفاهم ساده باعث یک بحث شد."
                ),
                VocabWord(
                    english = "argument",
                    persian = "بحث / مشاجره",
                    pronunciation = "/ˈɑːrɡjumənt/",
                    partOfSpeech = "noun",
                    example = "They had an argument about money.",
                    examplePersian = "آنها درباره پول بحث کردند."
                ),
                VocabWord(
                    english = "compromise",
                    persian = "سازش / مصالحه",
                    pronunciation = "/ˈkɑːmprəmaɪz/",
                    partOfSpeech = "noun/verb",
                    example = "Sometimes both people need to compromise.",
                    examplePersian = "گاهی هر دو نفر باید سازش کنند."
                ),
                VocabWord(
                    english = "respectful",
                    persian = "محترمانه",
                    pronunciation = "/rɪˈspektfəl/",
                    partOfSpeech = "adjective",
                    example = "Try to remain respectful during a disagreement.",
                    examplePersian = "هنگام اختلاف نظر سعی کن محترمانه رفتار کنی."
                ),
                VocabWord(
                    english = "patient",
                    persian = "صبور",
                    pronunciation = "/ˈpeɪʃənt/",
                    partOfSpeech = "adjective",
                    example = "You need to be patient when solving a problem.",
                    examplePersian = "هنگام حل یک مشکل باید صبور باشی."
                ),
                VocabWord(
                    english = "considerate",
                    persian = "ملاحظه‌کار",
                    pronunciation = "/kənˈsɪdərət/",
                    partOfSpeech = "adjective",
                    example = "She is very considerate of other people's feelings.",
                    examplePersian = "او نسبت به احساسات دیگران بسیار ملاحظه‌کار است."
                ),
                VocabWord(
                    english = "reliable",
                    persian = "قابل اعتماد",
                    pronunciation = "/rɪˈlaɪəbəl/",
                    partOfSpeech = "adjective",
                    example = "A reliable friend keeps their promises.",
                    examplePersian = "یک دوست قابل اعتماد به قول‌هایش عمل می‌کند."
                ),
                VocabWord(
                    english = "conflict",
                    persian = "تعارض / اختلاف",
                    pronunciation = "/ˈkɑːnflɪkt/",
                    partOfSpeech = "noun",
                    example = "They are trying to resolve the conflict.",
                    examplePersian = "آنها سعی دارند اختلاف را حل کنند."
                ),
                VocabWord(
                    english = "apologize",
                    persian = "عذرخواهی کردن",
                    pronunciation = "/əˈpɑːlədʒaɪz/",
                    partOfSpeech = "verb",
                    example = "He apologized for his mistake.",
                    examplePersian = "او بابت اشتباهش عذرخواهی کرد."
                ),
                VocabWord(
                    english = "appreciate",
                    persian = "قدردانی کردن",
                    pronunciation = "/əˈpriːʃieɪt/",
                    partOfSpeech = "verb",
                    example = "I really appreciate your help.",
                    examplePersian = "واقعاً از کمکت قدردانی می‌کنم."
                ),
                VocabWord(
                    english = "boundary",
                    persian = "مرز شخصی",
                    pronunciation = "/ˈbaʊndəri/",
                    partOfSpeech = "noun",
                    example = "Healthy relationships require clear boundaries.",
                    examplePersian = "روابط سالم به مرزهای مشخص نیاز دارند."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "see eye to eye",
                    persian = "هم‌نظر بودن",
                    example = "We don't always see eye to eye, but we respect each other.",
                    examplePersian = "ما همیشه هم‌نظر نیستیم، اما به هم احترام می‌گذاریم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "give someone a hand",
                    persian = "به کسی کمک کردن",
                    example = "Can you give me a hand with this problem?",
                    examplePersian = "می‌توانی در حل این مشکل به من کمک کنی؟",
                    register = "informal"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "work out",
                    meaning = "to find a solution or reach a good result",
                    persian = "حل شدن / به نتیجه رسیدن",
                    example = "I hope we can work out our differences.",
                    examplePersian = "امیدوارم بتوانیم اختلافاتمان را حل کنیم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "calm down",
                    meaning = "to become less angry or excited",
                    persian = "آرام شدن",
                    example = "Let's calm down and talk about the problem.",
                    examplePersian = "بیایید آرام شویم و درباره مشکل صحبت کنیم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "bring up",
                    meaning = "to introduce a subject in conversation",
                    persian = "مطرح کردن یک موضوع",
                    example = "She brought up an important issue.",
                    examplePersian = "او یک موضوع مهم را مطرح کرد.",
                    separable = "Yes"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Communication",
                    content = "در communication استرس اصلی روی بخش -ca- قرار می‌گیرد: /kəˌmjuːnɪˈkeɪʃən/."
                ),
                PronunciationTip(
                    title = "Could you",
                    content = "در مکالمه طبیعی could you اغلب به صورت پیوسته و سریع تلفظ می‌شود."
                ),
                PronunciationTip(
                    title = "Linking",
                    content = "در عبارت‌هایی مانند talk_about و get_along کلمات در گفتار طبیعی به هم متصل می‌شوند."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Disagreement",
                    content = "در بسیاری از موقعیت‌های انگلیسی‌زبان، مخالفت مستقیم ممکن است با عباراتی مانند I see your point, but... نرم‌تر و محترمانه‌تر بیان شود."
                ),
                CulturalNote(
                    title = "Personal boundaries",
                    content = "میزان حریم شخصی در فرهنگ‌ها و میان افراد مختلف متفاوت است. پرسیدن و احترام گذاشتن به مرزهای دیگران بخشی از ارتباط مؤثر است."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Should, Ought To, and Had Better",
                    content = """
                        برای توصیه می‌توانیم از should استفاده کنیم:

                        You should talk to him.
                        You shouldn't ignore the problem.

                        ought to نیز برای توصیه استفاده می‌شود:

                        You ought to apologize.

                        had better معمولاً توصیه‌ای قوی‌تر است:

                        You'd better talk to her before the situation gets worse.

                        بعد از should و had better فعل به شکل ساده می‌آید.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Gerunds After Verbs",
                    content = """
                        بعضی فعل‌ها معمولاً با gerund یعنی verb + ing می‌آیند:

                        enjoy + ing
                        avoid + ing
                        consider + ing
                        suggest + ing

                        مثال:

                        I enjoy talking to my friends.
                        Try to avoid making assumptions.
                        She suggested taking a break.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Infinitives After Verbs",
                    content = """
                        بعضی فعل‌ها با to + verb می‌آیند:

                        want to
                        need to
                        decide to
                        hope to
                        plan to

                        مثال:

                        I want to solve the problem.
                        We need to talk.
                        They decided to compromise.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Giving Reasons",
                    content = """
                        برای توضیح دلیل می‌توانیم از because و so استفاده کنیم:

                        We talked because we wanted to solve the problem.

                        برای نتیجه:

                        The conversation was difficult, so we took a break.

                        همچنین می‌توانیم از that's why استفاده کنیم:

                        We had a misunderstanding. That's why we talked about it.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "You should to talk to him.",
                    correct = "You should talk to him.",
                    explanation = "بعد از should از to استفاده نمی‌کنیم."
                ),
                CommonMistake(
                    wrong = "I enjoy to talk with my friends.",
                    correct = "I enjoy talking