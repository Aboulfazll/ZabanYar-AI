package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object Evolve3 {

    const val BOOK_ID = "evolve_3"

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
            title = "Life Changes",
            titlePersian = "تغییرات زندگی",

            objectives = listOf(
                "Talk about changes in your life",
                "Describe past and present situations",
                "Discuss plans and future possibilities",
                "Use present perfect and simple past appropriately",
                "Ask follow-up questions in conversations",
                "Explain reasons for personal decisions",
                "Understand a longer conversation about life changes"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "change",
                    persian = "تغییر",
                    pronunciation = "/tʃeɪndʒ/",
                    partOfSpeech = "noun/verb",
                    example = "Moving to a new city was a big change.",
                    examplePersian = "نقل مکان به یک شهر جدید تغییر بزرگی بود.",
                    collocations = "make a change, major change, change your mind"
                ),
                VocabWord(
                    english = "experience",
                    persian = "تجربه",
                    pronunciation = "/ɪkˈspɪəriəns/",
                    partOfSpeech = "noun",
                    example = "It was an interesting experience.",
                    examplePersian = "تجربه جالبی بود.",
                    collocations = "gain experience, work experience"
                ),
                VocabWord(
                    english = "opportunity",
                    persian = "فرصت",
                    pronunciation = "/ˌɑːpərˈtuːnəti/",
                    partOfSpeech = "noun",
                    example = "The new job gave me a great opportunity.",
                    examplePersian = "شغل جدید فرصت بزرگی به من داد.",
                    collocations = "great opportunity, career opportunity"
                ),
                VocabWord(
                    english = "challenge",
                    persian = "چالش",
                    pronunciation = "/ˈtʃælɪndʒ/",
                    partOfSpeech = "noun",
                    example = "Learning a new language can be a challenge.",
                    examplePersian = "یادگیری یک زبان جدید می‌تواند چالش باشد."
                ),
                VocabWord(
                    english = "decision",
                    persian = "تصمیم",
                    pronunciation = "/dɪˈsɪʒən/",
                    partOfSpeech = "noun",
                    example = "It was a difficult decision.",
                    examplePersian = "تصمیم سختی بود.",
                    collocations = "make a decision, difficult decision"
                ),
                VocabWord(
                    english = "improve",
                    persian = "بهبود دادن / بهتر شدن",
                    pronunciation = "/ɪmˈpruːv/",
                    partOfSpeech = "verb",
                    example = "My English has improved a lot.",
                    examplePersian = "انگلیسی من خیلی بهتر شده است."
                ),
                VocabWord(
                    english = "adjust",
                    persian = "سازگار شدن / تنظیم کردن",
                    pronunciation = "/əˈdʒʌst/",
                    partOfSpeech = "verb",
                    example = "It took me time to adjust to my new school.",
                    examplePersian = "زمان برد تا با مدرسه جدیدم سازگار شوم."
                ),
                VocabWord(
                    english = "independent",
                    persian = "مستقل",
                    pronunciation = "/ˌɪndɪˈpendənt/",
                    partOfSpeech = "adjective",
                    example = "Living alone made me more independent.",
                    examplePersian = "تنها زندگی کردن من را مستقل‌تر کرد."
                ),
                VocabWord(
                    english = "comfortable",
                    persian = "راحت",
                    pronunciation = "/ˈkʌmftərbəl/",
                    partOfSpeech = "adjective",
                    example = "I feel comfortable speaking English now.",
                    examplePersian = "الان هنگام صحبت کردن انگلیسی احساس راحتی می‌کنم."
                ),
                VocabWord(
                    english = "recently",
                    persian = "اخیراً",
                    pronunciation = "/ˈriːsəntli/",
                    partOfSpeech = "adverb",
                    example = "I recently started a new course.",
                    examplePersian = "اخیراً یک دوره جدید را شروع کرده‌ام."
                ),
                VocabWord(
                    english = "goal",
                    persian = "هدف",
                    pronunciation = "/ɡoʊl/",
                    partOfSpeech = "noun",
                    example = "My goal is to speak English fluently.",
                    examplePersian = "هدف من این است که روان انگلیسی صحبت کنم."
                ),
                VocabWord(
                    english = "progress",
                    persian = "پیشرفت",
                    pronunciation = "/ˈprɑːɡres/",
                    partOfSpeech = "noun",
                    example = "I'm happy with my progress.",
                    examplePersian = "از پیشرفتم خوشحالم."
                ),
                VocabWord(
                    english = "settle",
                    persian = "جا افتادن / مستقر شدن",
                    pronunciation = "/ˈsetəl/",
                    partOfSpeech = "verb",
                    example = "It took a few months to settle into my new life.",
                    examplePersian = "چند ماه طول کشید تا با زندگی جدیدم جا بیفتم."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "turning point",
                    persian = "نقطه عطف",
                    example = "Moving abroad was a turning point in her life.",
                    examplePersian = "مهاجرت به خارج نقطه عطفی در زندگی او بود.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "step out of your comfort zone",
                    persian = "از محدوده امن خود خارج شدن",
                    example = "Learning a new language helps you step out of your comfort zone.",
                    examplePersian = "یادگیری یک زبان جدید به تو کمک می‌کند از محدوده امن خود خارج شوی.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "a fresh start",
                    persian = "یک شروع تازه",
                    example = "The new city gave him a fresh start.",
                    examplePersian = "شهر جدید به او یک شروع تازه داد.",
                    register = "neutral"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "settle in",
                    meaning = "to become comfortable in a new place",
                    persian = "در مکان جدید جا افتادن",
                    example = "It took me a month to settle in.",
                    examplePersian = "یک ماه طول کشید تا در آنجا جا بیفتم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "take up",
                    meaning = "to start a new activity or hobby",
                    persian = "شروع کردن یک فعالیت یا سرگرمی جدید",
                    example = "I recently took up photography.",
                    examplePersian = "اخیراً عکاسی را شروع کرده‌ام.",
                    separable = "Yes"
                ),
                PhrasalVerb(
                    verb = "give up",
                    meaning = "to stop doing something",
                    persian = "دست کشیدن از چیزی",
                    example = "I don't want to give up my English studies.",
                    examplePersian = "نمی‌خواهم از یادگیری انگلیسی دست بکشم.",
                    separable = "Yes"
                ),
                PhrasalVerb(
                    verb = "catch up",
                    meaning = "to reach the same level or learn recent information",
                    persian = "به‌روز شدن / خود را رساندن",
                    example = "Let's meet and catch up soon.",
                    examplePersian = "بیایید به‌زودی همدیگر را ببینیم و از حال هم باخبر شویم.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Present Perfect Contractions",
                    content = "در گفتار طبیعی، شکل کوتاه have و has بسیار رایج است: I've, you've, he's, she's."
                ),
                PronunciationTip(
                    title = "Have you...?",
                    content = "در سؤال Have you ever...؟ کلمات را به صورت پیوسته و طبیعی تلفظ کن."
                ),
                PronunciationTip(
                    title = "Past Participles",
                    content = "در زمان حال کامل، شکل سوم فعل را واضح تلفظ کن؛ مخصوصاً افعال بی‌قاعده مانند been، gone و seen."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Talking about personal change",
                    content = "در مکالمات دوستانه، پرسیدن درباره تغییرات اخیر زندگی می‌تواند موضوع طبیعی برای ادامه گفت‌وگو باشد."
                ),
                CulturalNote(
                    title = "Follow-up questions",
                    content = "پس از شنیدن یک تجربه، پرسیدن سؤال‌های تکمیلی مانند What happened next? یا How did you feel? گفت‌وگو را طبیعی‌تر می‌کند."
                ),
                CulturalNote(
                    title = "Sharing experiences",
                    content = "در بسیاری از گفت‌وگوهای روزمره، افراد ابتدا تجربه کلی را با present perfect بیان می‌کنند و سپس جزئیات مشخص را با simple past توضیح می‌دهند."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Present Perfect for Life Experiences",
                    content = """
                        از present perfect برای صحبت درباره تجربه‌هایی استفاده می‌کنیم که زمان دقیق آنها مهم نیست یا گفته نمی‌شود.

                        I have visited several countries.
                        She has tried Japanese food.
                        Have you ever lived abroad?

                        ساختار:

                        subject + have/has + past participle
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present Perfect vs. Simple Past",
                    content = """
                        Present perfect:
                        تجربه کلی یا اتفاقی مرتبط با زمان حال.

                        I've visited London.

                        Simple past:
                        وقتی زمان مشخص گذشته را بیان می‌کنیم.

                        I visited London in 2023.

                        بنابراین:
                        I've seen that movie.
                        I saw it last weekend.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "For and Since",
                    content = """
                        for برای بیان مدت زمان استفاده می‌شود:

                        I've lived here for three years.

                        since برای بیان نقطه شروع استفاده می‌شود:

                        I've lived here since 2023.

                        for + period
                        since + starting point
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Recently and Lately",
                    content = """
                        recently و lately برای صحبت درباره اتفاق‌ها یا تغییرات نزدیک به زمان حال استفاده می‌شوند.

                        I've recently started a new course.
                        I've been very busy lately.

                        این کلمات به‌خصوص در گفت‌وگو درباره تغییرات اخیر زندگی مفید هستند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Follow-up Questions",
                    content = """
                        برای ادامه دادن مکالمه از سؤال‌های تکمیلی استفاده کن:

                        What happened?
                        When did that happen?
                        How did you feel?
                        What was it like?
                        What happened next?
                        Would you do it again?

                        این سؤال‌ها کمک می‌کنند گفت‌وگو فقط به جواب‌های کوتاه محدود نشود.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I have visited London last year.",
                    correct = "I visited London last year.",
                    explanation = "وقتی زمان مشخصی مثل last year داریم، از simple past استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I have lived here since three years.",
                    correct = "I have lived here for three years.",
                    explanation = "برای مدت زمان از for استفاده می‌کنیم و since برای نقطه شروع است."
                ),
                CommonMistake(
                    wrong = "She has went to Canada.",
                    correct = "She has gone to Canada.",
                    explanation = "بعد از has باید شکل سوم فعل استفاده شود؛ شکل سوم go، gone است."
                ),
                CommonMistake(
                    wrong = "Did you ever visit Spain?",
                    correct = "Have you ever visited Spain?",
                    explanation = "برای پرسیدن درباره تجربه زندگی بدون زمان مشخص، present perfect طبیعی‌تر است."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Maya",
                    english = "You seem really busy these days. What's new?",
                    persian = "این روزها خیلی سرت شلوغ به نظر می‌رسد. چه خبر؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "A lot has changed recently. I've started a new job.",
                    persian = "اخیراً خیلی چیزها تغییر کرده. یک شغل جدید شروع کرده‌ام."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Really? How long have you been there?",
                    persian = "واقعاً؟ چه مدتی است آنجا کار می‌کنی؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "I've been there for about three months.",
                    persian = "حدود سه ماه است که آنجا هستم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "How do you like it?",
                    persian = "چطور است؟ راضی هستی؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "I like it a lot. The work is challenging, but I'm learning something new every day.",
                    persian = "خیلی دوستش دارم. کار چالش‌برانگیز است، اما هر روز چیز جدیدی یاد می‌گیرم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Have you worked in that field before?",
                    persian = "قبلاً در آن زمینه کار کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "No, I haven't. This is my first job in this field.",
                    persian = "نه. این اولین شغلم در این زمینه است."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "That must have been a big change.",
                    persian = "حتماً تغییر بزرگی بوده."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "It was. I also moved to a new apartment.",
                    persian = "همین‌طور بود. به یک آپارتمان جدید هم نقل مکان کردم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Wow. Have you settled in yet?",
                    persian = "وای. هنوز در خانه جدید جا افتاده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Mostly. I still have a few boxes to unpack.",
                    persian = "تقریباً. هنوز چند جعبه دارم که باید بازشان کنم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Do you like the new neighborhood?",
                    persian = "محله جدید را دوست داری؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Yes. It's quieter than my old neighborhood, and there are some nice cafés nearby.",
                    persian = "بله. از محله قبلی‌ام آرام‌تر است و چند کافه خوب هم نزدیک آن هست."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Have you met many people there?",
                    persian = "آنجا با افراد زیادی آشنا شده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "I've met a few neighbors, but I haven't made close friends yet.",
                    persian = "با چند همسایه آشنا شده‌ام، اما هنوز دوستان صمیمی پیدا نکرده‌ام."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Maybe you should take up a new hobby.",
                    persian = "شاید بهتر باشد یک سرگرمی جدید شروع کنی."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "That's actually a good idea. I've always wanted to learn photography.",
                    persian = "اتفاقاً ایده خوبی است. همیشه می‌خواستم عکاسی یاد بگیرم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "You should try it. There's a photography club near my house.",
                    persian = "باید امتحانش کنی. نزدیک خانه من یک باشگاه عکاسی هست."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Have you ever joined a club like that?",
                    persian = "تا حالا عضو چنین باشگاهی شده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "Yes, I joined a book club last year.",
                    persian = "بله، سال گذشته عضو یک باشگاه کتاب شدم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Did you enjoy it?",
                    persian = "از آن لذت بردی؟"
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "I did. I met some interesting people and made two good friends.",
                    persian = "بله. با افراد جالبی آشنا شدم و دو دوست خوب پیدا کردم."
                ),
                DialogueLine(
                    speaker = "Daniel",
                    english = "Then maybe a new hobby is exactly what I need.",
                    persian = "پس شاید یک سرگرمی جدید دقیقاً همان چیزی باشد که لازم دارم."
                ),
                DialogueLine(
                    speaker = "Maya",
                    english = "I think so. Sometimes a small change can make a big difference.",
                    persian = "فکر می‌کنم همین‌طور باشد. گاهی یک تغییر کوچک می‌تواند تفاوت بزرگی ایجاد کند."
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What has Daniel recently started?",
                    answer = "He has recently started a new job."
                ),
                ComprehensionQuestion(
                    question = "How long has Daniel been at his new job?",
                    answer = "He has been there for about three months."
                ),
                ComprehensionQuestion