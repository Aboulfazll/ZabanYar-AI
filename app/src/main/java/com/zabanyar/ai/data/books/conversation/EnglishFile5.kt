package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object EnglishFile5 {

    const val BOOK_ID = "english_file_5"

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
            title = "Choices and Consequences",
            titlePersian = "انتخاب‌ها و پیامدها",

            objectives = listOf(
                "Discuss difficult decisions and their consequences",
                "Express opinions and support them with reasons",
                "Talk about hypothetical situations",
                "Use first, second, and third conditionals",
                "Use mixed conditionals in appropriate contexts",
                "Report what other people have said",
                "Use advanced connectors to organize an argument",
                "Participate in a longer discussion"
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "consequence",
                    persian = "پیامد",
                    pronunciation = "/ˈkɑːnsəkwens/",
                    partOfSpeech = "noun",
                    example = "Every decision has consequences.",
                    examplePersian = "هر تصمیمی پیامدهایی دارد.",
                    collocations = "serious consequences, possible consequences"
                ),
                VocabWord(
                    english = "decision",
                    persian = "تصمیم",
                    pronunciation = "/dɪˈsɪʒən/",
                    partOfSpeech = "noun",
                    example = "It was a difficult decision to make.",
                    examplePersian = "تصمیم سختی برای گرفتن بود.",
                    collocations = "make a decision, difficult decision"
                ),
                VocabWord(
                    english = "consider",
                    persian = "در نظر گرفتن",
                    pronunciation = "/kənˈsɪdər/",
                    partOfSpeech = "verb",
                    example = "We need to consider all the possibilities.",
                    examplePersian = "باید همه احتمالات را در نظر بگیریم."
                ),
                VocabWord(
                    english = "alternative",
                    persian = "گزینه جایگزین",
                    pronunciation = "/ɔːlˈtɜːrnətɪv/",
                    partOfSpeech = "noun",
                    example = "We need to find an alternative solution.",
                    examplePersian = "باید یک راه‌حل جایگزین پیدا کنیم."
                ),
                VocabWord(
                    english = "priority",
                    persian = "اولویت",
                    pronunciation = "/praɪˈɔːrəti/",
                    partOfSpeech = "noun",
                    example = "Safety should always be a priority.",
                    examplePersian = "ایمنی همیشه باید یک اولویت باشد."
                ),
                VocabWord(
                    english = "risk",
                    persian = "خطر / ریسک",
                    pronunciation = "/rɪsk/",
                    partOfSpeech = "noun/verb",
                    example = "You need to consider the risks.",
                    examplePersian = "باید خطرات را در نظر بگیری."
                ),
                VocabWord(
                    english = "benefit",
                    persian = "مزیت / سود",
                    pronunciation = "/ˈbenɪfɪt/",
                    partOfSpeech = "noun/verb",
                    example = "One benefit of the plan is its flexibility.",
                    examplePersian = "یکی از مزایای این برنامه انعطاف‌پذیری آن است."
                ),
                VocabWord(
                    english = "drawback",
                    persian = "نقطه ضعف / عیب",
                    pronunciation = "/ˈdrɔːbæk/",
                    partOfSpeech = "noun",
                    example = "The main drawback is the high cost.",
                    examplePersian = "نقطه ضعف اصلی هزینه بالاست."
                ),
                VocabWord(
                    english = "perspective",
                    persian = "دیدگاه",
                    pronunciation = "/pərˈspektɪv/",
                    partOfSpeech = "noun",
                    example = "Try to look at the problem from another perspective.",
                    examplePersian = "سعی کن مشکل را از دیدگاه دیگری ببینی."
                ),
                VocabWord(
                    english = "assumption",
                    persian = "فرض",
                    pronunciation = "/əˈsʌmpʃən/",
                    partOfSpeech = "noun",
                    example = "That conclusion is based on an incorrect assumption.",
                    examplePersian = "آن نتیجه بر اساس یک فرض اشتباه است."
                ),
                VocabWord(
                    english = "regret",
                    persian = "پشیمانی / پشیمان شدن",
                    pronunciation = "/rɪˈɡret/",
                    partOfSpeech = "noun/verb",
                    example = "I don't regret making that decision.",
                    examplePersian = "از گرفتن آن تصمیم پشیمان نیستم."
                ),
                VocabWord(
                    english = "reconsider",
                    persian = "دوباره بررسی کردن",
                    pronunciation = "/ˌriːkənˈsɪdər/",
                    partOfSpeech = "verb",
                    example = "We may need to reconsider our plan.",
                    examplePersian = "ممکن است لازم باشد برنامه‌مان را دوباره بررسی کنیم."
                ),
                VocabWord(
                    english = "justify",
                    persian = "توجیه کردن",
                    pronunciation = "/ˈdʒʌstɪfaɪ/",
                    partOfSpeech = "verb",
                    example = "How would you justify that decision?",
                    examplePersian = "چطور آن تصمیم را توجیه می‌کنی؟"
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "weigh the pros and cons",
                    persian = "مزایا و معایب را سنجیدن",
                    example = "Before deciding, we should weigh the pros and cons.",
                    examplePersian = "قبل از تصمیم‌گیری باید مزایا و معایب را بسنجیم.",
                    register = "neutral"
                ),
                IdiomExpression(
                    english = "go with your gut",
                    persian = "به حس درونی خود اعتماد کردن",
                    example = "Sometimes you have to go with your gut.",
                    examplePersian = "گاهی باید به حس درونی خود اعتماد کنی.",
                    register = "informal"
                ),
                IdiomExpression(
                    english = "a tough call",
                    persian = "تصمیم بسیار سخت",
                    example = "Choosing between the two options was a tough call.",
                    examplePersian = "انتخاب بین آن دو گزینه تصمیم بسیار سختی بود.",
                    register = "informal"
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "think through",
                    meaning = "to consider something carefully before deciding",
                    persian = "با دقت بررسی و فکر کردن",
                    example = "You should think through the consequences first.",
                    examplePersian = "اول باید پیامدها را با دقت بررسی کنی.",
                    separable = "Yes"
                ),
                PhrasalVerb(
                    verb = "come up with",
                    meaning = "to produce an idea or solution",
                    persian = "ارائه دادن / پیدا کردن",
                    example = "We need to come up with a better solution.",
                    examplePersian = "باید یک راه‌حل بهتر پیدا کنیم.",
                    separable = "No"
                ),
                PhrasalVerb(
                    verb = "rule out",
                    meaning = "to decide that something is not possible",
                    persian = "رد کردن یک احتمال",
                    example = "We can't rule out that possibility yet.",
                    examplePersian = "هنوز نمی‌توانیم آن احتمال را رد کنیم.",
                    separable = "Yes"
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Conditionals",
                    content = "در جملات شرطی، because of ریتم گفتار طبیعی، بخش if ممکن است سریع‌تر و کم‌تأکیدتر تلفظ شود."
                ),
                PronunciationTip(
                    title = "Would have",
                    content = "در گفتار طبیعی would have معمولاً به صورت کوتاه‌شده would've شنیده می‌شود."
                ),
                PronunciationTip(
                    title = "Thought and though",
                    content = "thought و though املای مشابهی دارند اما تلفظشان متفاوت است؛ تفاوت صدای پایانی را تمرین کن."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Disagreeing politely",
                    content = "در بحث‌های انگلیسی، مخالفت معمولاً با عباراتی مانند I see your point, but... یا I understand what you mean; however... نرم‌تر بیان می‌شود."
                ),
                CulturalNote(
                    title = "Supporting an opinion",
                    content = "در گفت‌وگوهای رسمی و آموزشی، بیان یک نظر همراه با دلیل، مثال یا شواهد معمولاً باعث واضح‌تر شدن استدلال می‌شود."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "First Conditional",
                    content = """
                        First conditional برای موقعیت‌های واقعی یا محتمل در آینده استفاده می‌شود:

                        If + present simple, will + verb

                        If we leave now, we'll arrive on time.

                        برای نتیجه‌های دیگر نیز می‌توان از may، might یا can استفاده کرد:

                        If you hurry, you might catch the train.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Second Conditional",
                    content = """
                        Second conditional برای موقعیت‌های فرضی، غیرواقعی یا بعید در زمان حال یا آینده استفاده می‌شود:

                        If + past simple, would + verb

                        If I had more time, I would learn another language.

                        برای پیشنهاد:

                        If I were you, I'd think about it carefully.

                        در حالت رسمی‌تر، were می‌تواند با همه فاعل‌ها استفاده شود:
                        If I were...
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Third Conditional",
                    content = """
                        Third conditional درباره شرایط گذشته‌ای صحبت می‌کند که دیگر قابل تغییر نیستند:

                        If + past perfect, would have + past participle

                        If I had known about the problem, I would have acted differently.

                        این ساختار می‌تواند برای صحبت درباره نتیجه فرضی یک اتفاق گذشته استفاده شود.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Mixed Conditionals",
                    content = """
                        گاهی شرط مربوط به گذشته است اما نتیجه به زمان حال مربوط می‌شود:

                        If I had accepted that job, I would live in London now.

                        گذشته:
                        I didn't accept the job.

                        نتیجه فعلی:
                        I don't live in London.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Reported Speech",
                    content = """
                        برای گزارش کردن گفته شخص دیگری می‌توانیم از reported speech استفاده کنیم.

                        Direct:
                        "I'm tired," she said.

                        Reported:
                        She said that she was tired.

                        مثال دیگر:

                        "I will call you tomorrow."

                        He said that he would call me the next day.

                        در بسیاری از موقعیت‌ها، زمان فعل هنگام گزارش کردن یک جمله به گذشته تغییر می‌کند.
                    """.trimIndent()
                ),
                GrammarSection(
                    title = "Advanced Connectors",
                    content = """
                        برای سازمان‌دهی بهتر استدلال می‌توان از این کلمات استفاده کرد:

                        however
                        therefore
                        although
                        whereas
                        in addition
                        as a result
                        on the other hand

                        مثال:

                        The plan is expensive. However, it could save money in the long term.

                        The road was closed. Therefore, we had to find another route.
                    """.trimIndent()
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "If I will have time, I'll help you.",
                    correct = "If I have time, I'll help you.",
                    explanation = "در first conditional معمولاً بعد از if از present simple استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "If I would be you, I'd wait.",
                    correct = "If I were you, I'd wait.",
                    explanation = "در عبارت رایج If I were you از were استفاده می‌شود."
                ),
                CommonMistake(
                    wrong = "If I knew earlier, I would have told you.",
                    correct = "If I had known earlier, I would have told you.",
                    explanation = "برای شرط خلاف واقع در گذشته از past perfect استفاده می‌کنیم."
                ),
                CommonMistake(
                    wrong = "She said she is tired.",
                    correct = "She said she was tired.",
                    explanation = "در reported speech معمولاً زمان فعل به گذشته منتقل می‌شود."
                ),
                CommonMistake(
                    wrong = "Although it was expensive, but we bought it.",
                    correct = "Although it was expensive, we bought it.",
                    explanation = "although و but معمولاً با هم در یک ساختار استفاده نمی‌شوند."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Nora",
                    english = "Have you decided whether you're going to accept the new job?",
                    persian = "تصمیم گرفته‌ای که شغل جدید را قبول کنی یا نه؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Not yet. It's a tough call.",
                    persian = "هنوز نه. تصمیم خیلی سختی است."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "What's making the decision so difficult?",
                    persian = "چه چیزی تصمیم‌گیری را این‌قدر سخت کرده؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "The salary is much better, but I'd have to move to another city.",
                    persian = "حقوق خیلی بهتر است، اما باید به شهر دیگری نقل مکان کنم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "Would you actually like living there?",
                    persian = "واقعاً دوست داری آنجا زندگی کنی؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "I'm not sure. I've visited the city, but I've never lived there.",
                    persian = "مطمئن نیستم. از آن شهر دیدن کرده‌ام، اما هیچ‌وقت آنجا زندگی نکرده‌ام."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "What are the main benefits of the new position?",
                    persian = "مزایای اصلی موقعیت شغلی جدید چیست؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "I'd have more responsibility, and I'd be working on larger projects.",
                    persian = "مسئولیت بیشتری خواهم داشت و روی پروژه‌های بزرگ‌تری کار خواهم کرد."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "And what are the drawbacks?",
                    persian = "و معایبش چیست؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "I'd have less free time, and I'd be farther away from my family.",
                    persian = "وقت آزاد کمتری خواهم داشت و از خانواده‌ام دورتر خواهم بود."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "Have you talked to your family about it?",
                    persian = "درباره‌اش با خانواده‌ات صحبت کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Yes. My parents think I should take the opportunity.",
                    persian = "بله. والدینم فکر می‌کنند باید از این فرصت استفاده کنم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "What did they say exactly?",
                    persian = "دقیقاً چه گفتند؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "My father said that I would regret it if I turned it down without giving it serious thought.",
                    persian = "پدرم گفت اگر بدون فکر جدی این پیشنهاد را رد کنم، ممکن است پشیمان شوم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english