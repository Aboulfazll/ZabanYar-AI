package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object TopNotch3 {

    const val BOOK_ID = "top_notch_3"

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
            title = "Cultural Literacy",
            titlePersian = "سواد فرهنگی",

            objectives = listOf(
                "Discuss cultural differences and similarities",
                "Talk about social customs and expectations",
                "Express opinions politely",
                "Use comparative and superlative structures",
                "Use modal verbs for advice and social expectations",
                "Support opinions with examples"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "custom",
                    persian = "رسم و سنت",
                    pronunciation = "/ˈkʌstəm/",
                    partOfSpeech = "noun",
                    example = "Every country has its own customs.",
                    examplePersian = "هر کشوری رسوم خاص خودش را دارد.",
                    collocations = "local customs, cultural customs"
                ),
                VocabWord(
                    english = "etiquette",
                    persian = "آداب معاشرت",
                    pronunciation = "/ˈetɪket/",
                    partOfSpeech = "noun",
                    example = "It's important to understand local etiquette.",
                    examplePersian = "درک آداب معاشرت محلی مهم است.",
                    collocations = "social etiquette, business etiquette"
                ),
                VocabWord(
                    english = "tradition",
                    persian = "سنت",
                    pronunciation = "/trəˈdɪʃən/",
                    partOfSpeech = "noun",
                    example = "This tradition has existed for generations.",
                    examplePersian = "این سنت نسل‌هاست که وجود دارد.",
                    collocations = "cultural tradition, family tradition"
                ),
                VocabWord(
                    english = "gesture",
                    persian = "حرکت / اشاره",
                    pronunciation = "/ˈdʒestʃər/",
                    partOfSpeech = "noun",
                    example = "A simple gesture can have different meanings in different cultures.",
                    examplePersian = "یک حرکت ساده می‌تواند در فرهنگ‌های مختلف معانی متفاوتی داشته باشد."
                ),
                VocabWord(
                    english = "appropriate",
                    persian = "مناسب",
                    pronunciation = "/əˈproʊpriət/",
                    partOfSpeech = "adjective",
                    example = "What is appropriate in one culture may seem unusual in another.",
                    examplePersian = "چیزی که در یک فرهنگ مناسب است ممکن است در فرهنگ دیگری غیرعادی به نظر برسد.",
                    synonyms = "suitable, proper"
                ),
                VocabWord(
                    english = "respectful",
                    persian = "محترمانه",
                    pronunciation = "/rɪˈspektfəl/",
                    partOfSpeech = "adjective",
                    example = "Try to be respectful when discussing cultural differences.",
                    examplePersian = "هنگام صحبت درباره تفاوت‌های فرهنگی سعی کن محترمانه رفتار کنی."
                ),
                VocabWord(
                    english = "misunderstanding",
                    persian = "سوءتفاهم",
                    pronunciation = "/ˌmɪsʌndərˈstændɪŋ/",
                    partOfSpeech = "noun",
                    example = "A cultural misunderstanding can easily happen.",
                    examplePersian = "ممکن است به‌راحتی یک سوءتفاهم فرهنگی اتفاق بیفتد."
                ),
                VocabWord(
                    english = "hospitality",
                    persian = "مهمان‌نوازی",
                    pronunciation = "/ˌhɑːspɪˈtæləti/",
                    partOfSpeech = "noun",
                    example = "The region is famous for its hospitality.",
                    examplePersian = "این منطقه به مهمان‌نوازی‌اش مشهور است.",
                    collocations = "warm hospitality, traditional hospitality"
                ),
                VocabWord(
                    english = "perspective",
                    persian = "دیدگاه",
                    pronunciation = "/pərˈspektɪv/",
                    partOfSpeech = "noun",
                    example = "Travel can change your perspective.",
                    examplePersian = "سفر می‌تواند دیدگاه تو را تغییر دهد."
                ),
                VocabWord(
                    english = "adapt",
                    persian = "سازگار شدن",
                    pronunciation = "/əˈdæpt/",
                    partOfSpeech = "verb",
                    example = "Visitors sometimes need time to adapt to local customs.",
                    examplePersian = "بازدیدکنندگان گاهی برای سازگار شدن با رسوم محلی به زمان نیاز دارند."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "When in Rome, do as the Romans do.",
                    persian = "هر جا هستی، مطابق رسم همان‌جا رفتار کن.",
                    example = "I tried the local food because when in Rome, do as the Romans do.",
                    examplePersian = "غذای محلی را امتحان کردم چون هر جا هستی باید مطابق رسم همان‌جا رفتار کنی.",
                    register = "common"
                ),
                IdiomExpression(
                    english = "break the ice",
                    persian = "یخ جمع را شکستن و فضا را صمیمی کردن",
                    example = "A simple question can help break the ice.",
                    examplePersian = "یک سؤال ساده می‌تواند به صمیمی شدن فضا کمک کند.",
                    register = "informal"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "fit in",
                    meaning = "to become comfortable in a new group or place",
                    persian = "جا افتادن / سازگار شدن",
                    example = "It took me a few weeks to fit in at my new school.",
                    examplePersian = "چند هفته طول کشید تا در مدرسه جدیدم جا بیفتم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "find out",
                    meaning = "to discover information",
                    persian = "متوجه شدن / فهمیدن",
                    example = "I found out that the gesture had a different meaning.",
                    examplePersian = "فهمیدم که آن حرکت معنای متفاوتی داشت.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "استرس در etiquette",
                    content = "در etiquette استرس روی بخش اول واژه قرار می‌گیرد. تلفظ را روان و کوتاه نگه دارید."
                ),
                PronunciationTip(
                    title = "صدای th در thoughtful",
                    content = "در صدای /θ/ زبان به‌آرامی بین دندان‌ها قرار می‌گیرد و هوا بدون لرزش از بین آن عبور می‌کند."
                ),
                PronunciationTip(
                    title = "ریتم جمله‌های طولانی",
                    content = "در جمله‌های طولانی، روی کلمات مهم مانند nouns و main verbs تأکید کنید و کلمات دستوری کوتاه را سریع‌تر بیان کنید."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Cultural differences",
                    content = "رفتارهایی مانند تماس چشمی، فاصله هنگام صحبت، شیوه سلام کردن و زمان‌بندی می‌توانند از فرهنگی به فرهنگ دیگر متفاوت باشند."
                ),
                CulturalNote(
                    title = "Avoiding assumptions",
                    content = "بهتر است درباره رفتار یک فرد بر اساس فرهنگ او سریع نتیجه‌گیری نکنیم؛ افراد یک فرهنگ نیز می‌توانند دیدگاه‌ها و عادت‌های متفاوتی داشته باشند."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Comparatives",
                    content = """
                        برای مقایسه دو چیز یا دو موقعیت از comparative استفاده می‌کنیم.

                        This custom is more common in my country.
                        City life is busier than village life.

                        برای بسیاری از صفت‌های کوتاه از -er استفاده می‌کنیم:

                        small → smaller
                        fast → faster

                        برای بسیاری از صفت‌های بلند از more استفاده می‌کنیم:

                        more interesting
                        more complicated
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Superlatives",
                    content = """
                        برای بیان بالاترین درجه از یک ویژگی در یک گروه از superlative استفاده می‌کنیم.

                        This is the most interesting tradition.
                        It is one of the oldest customs.

                        صفت‌های کوتاه معمولاً -est می‌گیرند:

                        small → the smallest
                        old → the oldest

                        صفت‌های بلند معمولاً با the most می‌آیند:

                        the most interesting
                        the most important
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Should and Shouldn't",
                    content = """
                        از should برای توصیه و بیان رفتار مناسب استفاده می‌کنیم.

                        You should learn about local customs.
                        Visitors should be respectful.

                        برای توصیه منفی از shouldn't استفاده می‌کنیم:

                        You shouldn't make assumptions.
                        Visitors shouldn't laugh at unfamiliar customs.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Giving Opinions",
                    content = """
                        برای بیان نظر می‌توانیم از ساختارهای زیر استفاده کنیم:

                        I think...
                        In my opinion...
                        From my perspective...
                        I believe...

                        برای بیان مخالفت محترمانه:

                        I see your point, but...
                        I understand what you mean, but...
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "This custom is more easier.",
                    correct = "This custom is easier.",
                    explanation = "برای comparative نباید هم‌زمان more و شکل -er را استفاده کنیم."
                ),
                CommonMistake(
                    wrong = "It is the most old tradition.",
                    correct = "It is the oldest tradition.",
                    explanation = "برای صفت old از شکل oldest استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "People should to respect local customs.",
                    correct = "People should respect local customs.",
                    explanation = "بعد از should فعل بدون to می‌آید."
                ),
                CommonMistake(
                    wrong = "In my opinion, people should to learn.",
                    correct = "In my opinion, people should learn.",
                    explanation = "بعد از should شکل ساده فعل استفاده می‌شود."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Nora",
                    english = "Have you ever noticed how different everyday customs can be from one country to another?",
                    persian = "تا حالا متوجه شده‌ای که رسوم روزمره چقدر می‌توانند از کشوری به کشور دیگر متفاوت باشند؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Yes, especially when you travel. Sometimes you don't realize that a simple gesture can have a completely different meaning.",
                    persian = "بله، مخصوصاً وقتی سفر می‌کنی. گاهی متوجه نمی‌شوی که یک حرکت ساده می‌تواند معنای کاملاً متفاوتی داشته باشد."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "Exactly. I had that experience when I visited another country for the first time.",
                    persian = "دقیقاً. وقتی برای اولین بار به کشور دیگری سفر کردم، چنین تجربه‌ای داشتم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "What happened?",
                    persian = "چه اتفاقی افتاد؟"
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "I was having dinner with a local family, and I finished everything on my plate because I wanted to be polite.",
                    persian = "با یک خانواده محلی شام می‌خوردم و همه غذای داخل بشقابم را تمام کردم چون می‌خواستم مؤدب باشم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "That sounds perfectly normal. Why was it a problem?",
                    persian = "کاملاً عادی به نظر می‌رسد. چرا مشکل بود؟"
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "The host immediately offered me more food. I