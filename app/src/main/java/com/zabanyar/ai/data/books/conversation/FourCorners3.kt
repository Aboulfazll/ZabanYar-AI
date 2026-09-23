package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object FourCorners3 {

    const val BOOK_ID = "four_corners_3"

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
            title = "New Friends",
            titlePersian = "دوستان جدید",

            objectives = listOf(
                "Talk about relationships and first impressions",
                "Describe people's personalities",
                "Talk about experiences and recent events",
                "Use present perfect for life experiences",
                "Distinguish present perfect from simple past",
                "Give reasons and examples when describing people"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "personality",
                    persian = "شخصیت",
                    pronunciation = "/ˌpɜːrsəˈnæləti/",
                    partOfSpeech = "noun",
                    example = "Her personality is very friendly.",
                    examplePersian = "شخصیت او بسیار دوستانه است.",
                    collocations = "strong personality, friendly personality"
                ),
                VocabWord(
                    english = "outgoing",
                    persian = "برون‌گرا و اجتماعی",
                    pronunciation = "/ˈaʊtɡoʊɪŋ/",
                    partOfSpeech = "adjective",
                    example = "He's very outgoing and enjoys meeting new people.",
                    examplePersian = "او خیلی اجتماعی است و از آشنا شدن با افراد جدید لذت می‌برد."
                ),
                VocabWord(
                    english = "reliable",
                    persian = "قابل اعتماد",
                    pronunciation = "/rɪˈlaɪəbəl/",
                    partOfSpeech = "adjective",
                    example = "A good friend should be reliable.",
                    examplePersian = "یک دوست خوب باید قابل اعتماد باشد."
                ),
                VocabWord(
                    english = "patient",
                    persian = "صبور",
                    pronunciation = "/ˈpeɪʃənt/",
                    partOfSpeech = "adjective",
                    example = "My sister is patient with children.",
                    examplePersian = "خواهرم با بچه‌ها صبور است."
                ),
                VocabWord(
                    english = "confident",
                    persian = "بااعتمادبه‌نفس",
                    pronunciation = "/ˈkɑːnfɪdənt/",
                    partOfSpeech = "adjective",
                    example = "She sounds confident when she speaks English.",
                    examplePersian = "وقتی انگلیسی صحبت می‌کند بااعتمادبه‌نفس به نظر می‌رسد."
                ),
                VocabWord(
                    english = "impression",
                    persian = "برداشت",
                    pronunciation = "/ɪmˈpreʃən/",
                    partOfSpeech = "noun",
                    example = "He made a good first impression.",
                    examplePersian = "او در اولین دیدار برداشت خوبی ایجاد کرد."
                ),
                VocabWord(
                    english = "similar",
                    persian = "مشابه",
                    pronunciation = "/ˈsɪmələr/",
                    partOfSpeech = "adjective",
                    example = "We have similar interests.",
                    examplePersian = "ما علایق مشابهی داریم."
                ),
                VocabWord(
                    english = "different",
                    persian = "متفاوت",
                    pronunciation = "/ˈdɪfrənt/",
                    partOfSpeech = "adjective",
                    example = "Our personalities are quite different.",
                    examplePersian = "شخصیت‌های ما کاملاً متفاوت هستند."
                ),
                VocabWord(
                    english = "relationship",
                    persian = "رابطه",
                    pronunciation = "/rɪˈleɪʃənʃɪp/",
                    partOfSpeech = "noun",
                    example = "Trust is important in any relationship.",
                    examplePersian = "اعتماد در هر رابطه‌ای مهم است."
                ),
                VocabWord(
                    english = "trust",
                    persian = "اعتماد",
                    pronunciation = "/trʌst/",
                    partOfSpeech = "noun/verb",
                    example = "It takes time to trust someone.",
                    examplePersian = "اعتماد کردن به یک نفر زمان می‌برد."
                ),
                VocabWord(
                    english = "supportive",
                    persian = "حمایتگر",
                    pronunciation = "/səˈpɔːrtɪv/",
                    partOfSpeech = "adjective",
                    example = "My friends have always been supportive.",
                    examplePersian = "دوستانم همیشه حمایتگر بوده‌اند."
                ),
                VocabWord(
                    english = "acquaintance",
                    persian = "آشنا",
                    pronunciation = "/əˈkweɪntəns/",
                    partOfSpeech = "noun",
                    example = "He's an old acquaintance from university.",
                    examplePersian = "او یکی از آشنایان قدیمی من از دانشگاه است."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "get along",
                    persian = "خوب کنار آمدن",
                    example = "We get along very well.",
                    examplePersian = "ما خیلی خوب با هم کنار می‌آییم.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "hit it off",
                    persian = "از همان اول با کسی جور شدن",
                    example = "We met at a conference and immediately hit it off.",
                    examplePersian = "در یک کنفرانس با هم آشنا شدیم و از همان اول با هم جور شدیم.",
                    register = "informal"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "get to know",
                    meaning = "to gradually learn about someone",
                    persian = "به‌تدریج کسی را شناختن",
                    example = "It takes time to get to know someone.",
                    examplePersian = "شناختن تدریجی یک نفر زمان می‌برد.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "open up",
                    meaning = "to become more willing to talk about personal feelings",
                    persian = "درد دل کردن / راحت‌تر صحبت کردن",
                    example = "She slowly opened up about her experience.",
                    examplePersian = "او کم‌کم درباره تجربه‌اش راحت‌تر صحبت کرد.",
                    separable = "No"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Present Perfect",
                    content = "در present perfect معمولاً have و has به شکل کوتاه 've و 's در مکالمه شنیده می‌شوند."
                ),
                PronunciationTip(
                    title = "Reliable",
                    content = "در reliable بخش میانی کلمه را واضح تلفظ کنید: /rɪˈlaɪəbəl/."
                ),
                PronunciationTip(
                    title = "Word stress",
                    content = "در personality استرس اصلی روی بخش سوم یعنی NAL قرار می‌گیرد."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "First impressions",
                    content = "اولین برداشت می‌تواند روی شروع یک رابطه تأثیر بگذارد، اما معمولاً برای شناخت واقعی یک فرد به زمان بیشتری نیاز داریم."
                ),
                CulturalNote(
                    title = "Friendship and privacy",
                    content = "میزان اطلاعات شخصی که افراد در اولین دیدار به اشتراک می‌گذارند در فرهنگ‌ها و افراد مختلف متفاوت است."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Present Perfect: Life Experiences",
                    content = """
                        از present perfect برای صحبت درباره تجربه‌هایی استفاده می‌کنیم که در گذشته اتفاق افتاده‌اند اما زمان دقیق آنها مهم نیست.

                        I have visited Italy.
                        She has met many interesting people.
                        We have tried that restaurant.

                        ساختار:

                        have/has + past participle

                        I/you/we/they → have
                        he/she/it → has
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Ever and Never",
                    content = """
                        برای پرسیدن درباره تجربه‌ها:

                        Have you ever traveled alone?
                        Has she ever worked abroad?

                        برای گفتن اینکه تجربه‌ای نداشته‌ایم:

                        I've never traveled alone.
                        He has never tried sushi.

                        ever معمولاً در سؤال و never برای بیان تجربه منفی استفاده می‌شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Present Perfect vs. Simple Past",
                    content = """
                        اگر زمان مشخص گذشته را بیان کنیم، معمولاً از simple past استفاده می‌کنیم:

                        I visited Paris last year.

                        اگر فقط درباره تجربه صحبت کنیم و زمان دقیق مهم نباشد:

                        I have visited Paris.

                        مقایسه:

                        Have you ever been to London?
                        Yes, I have.

                        When did you go?
                        I went there in 2023.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "For and Since",
                    content = """
                        for برای بیان مدت زمان:

                        I've known her for five years.

                        since برای بیان نقطه شروع:

                        I've known her since 2021.

                        مثال:

                        We have been friends for a long time.
                        We have been friends since high school.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "I have visited Paris last year.",
                    correct = "I visited Paris last year.",
                    explanation = "وقتی زمان مشخصی مثل last year داریم، از simple past استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "Did you ever visit London?",
                    correct = "Have you ever visited London?",
                    explanation = "برای پرسیدن درباره تجربه کلی زندگی معمولاً present perfect مناسب‌تر است."
                ),
                CommonMistake(
                    wrong = "She have met him.",
                    correct = "She has met him.",
                    explanation = "با he/she/it از has استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "I know him since 2020.",
                    correct = "I've known him since 2020.",
                    explanation = "برای موقعیتی که از گذشته شروع شده و تا اکنون ادامه دارد می‌توان از present perfect استفاده کرد."
                ),
                CommonMistake(
                    wrong = "I have never went there.",
                    correct = "I have never been there.",
                    explanation = "بعد از have/has باید past participle بیاید؛ شکل سوم go، gone است و برای تجربه حضور معمولاً been به کار می‌رود."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Mina",
                    english = "You seem to know everyone at this event. Have you been here before?",
                    persian = "به نظر می‌رسد همه را در این برنامه می‌شناسی. قبلاً اینجا بوده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Adam",
                    english = "Yes, I've been here a few times. I used to work with one of the organizers.",
                    persian = "بله، چند بار اینجا بوده‌ام. قبلاً با یکی از برگزارکنندگان کار می‌کردم."
                ),
                DialogueLine(
                    speaker = "Mina",
                    english = "That's probably why you look so comfortable. I'm still trying to recognize people.",
                    persian = "احتمالاً به همین دلیل این‌قدر راحت به نظر می‌رسی. من هنوز دارم سعی می‌کنم آدم‌ها را بشناسم."
                ),
                DialogueLine(
                    speaker = "Adam",
                    english = "Don't worry. Most people here are meeting each other for the first time.",
                    persian = "نگران نباش. بیشتر افراد اینجا برای اولین بار با هم آشنا می‌شوند."
                ),
                DialogueLine(
                    speaker = "Mina",
                    english = "Actually, I've already met two people who seem really interesting.",
                    persian = "در واقع، من تا الان با دو نفر آشنا شده‌ام که واقعاً جالب به نظر می‌رسند."
                ),
                DialogueLine(
                    speaker = "Adam",
                    english = "Really? Who are they?",
                    persian = "واقعاً؟ چه کسانی هستند؟"
                ),
                DialogueLine(
                    speaker = "Mina",
                    english = "One of them is a photographer, and the other one works for a technology company.",
                    persian = "یکی از آنها عکاس است و دیگری برای یک شرکت فناوری کار می‌کند."
                ),
                DialogueLine(
                    speaker = "Adam",
                    english = "Have you talked to them about their work?",
                    persian = "درباره کارشان با آنها صحبت کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Mina",
                    english = "Yes. The photographer has traveled to more than twenty countries.",
                    persian = "بله. آن عکاس به بیش از بیست کشور سفر کرده است."
                ),
                DialogueLine(
                    speaker = "Adam",
                    english = "That's impressive. Have you ever traveled for work?",
                    persian = "این واقعاً جالب است. تو تا حالا برای کار سفر کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "Mina",
                    english = "A few times, but I've never traveled outside my region for work.",
                    persian = "چند بار، اما هیچ‌وقت برای کار خارج از منطقه‌ام سفر نکرده‌ام."
                ),
                DialogueLine(
                    speaker = "Adam",
                    english = "I think traveling for work can change the way you see people and places.",
                    persian = "فکر می‌کنم سفر کاری می‌تواند نگاه آدم به مردم و مکان‌ها را تغییر دهد."
                ),
                DialogueLine(
                    speaker = "Mina",
                    english = "I agree. I've noticed that people often have very different ideas about what makes a good workplace.",
                    persian = "موافقم. متوجه شده‌ام که مردم اغلب دیدگاه‌های بسیار متفاوتی درباره اینکه چه چیزی یک محیط کاری خوب می‌سازد دارند."
                ),
                DialogueLine(
                    speaker = "Adam",
                    english = "That's true. Some people prefer a quiet environment, while others enjoy working with a large team.",
                    persian = "درست است. بعضی افراد محیط آرام را ترجیح می‌دهند، در حالی که دیگران از کار کردن با یک تیم بزرگ لذت می‌برند."
                ),
                DialogueLine(
                    speaker = "Mina",
                    english = "What about you? What kind of people do you usually get along with?",
                    persian = "تو چطور؟ معمولاً با چه نوع آدم‌هایی خوب کنار می‌آیی؟"
                ),
                DialogueLine(
                    speaker = "Adam",
                    english = "I usually get along with people who are open-minded and reliable. I don't expect my friends to agree with me about everything.",
                    