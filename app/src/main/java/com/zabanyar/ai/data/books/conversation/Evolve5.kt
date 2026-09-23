package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object Evolve5 {

    const val BOOK_ID = "evolve_5"

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
                "Discuss difficult choices and competing priorities.",
                "Express nuanced opinions and justify them with evidence.",
                "Use advanced conditional structures to discuss hypothetical situations.",
                "Report what other people said or believed accurately.",
                "Use linking expressions to organize a complex argument.",
                "Participate in a longer discussion and respond to different viewpoints."
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "consequence",
                    persian = "پیامد",
                    pronunciation = "ˈkɑːnsəkwens",
                    partOfSpeech = "noun",
                    example = "Every major decision has consequences.",
                    examplePersian = "هر تصمیم مهمی پیامدهایی دارد.",
                    collocations = "serious consequence, unintended consequence, long-term consequence",
                    synonyms = "result, outcome",
                    usageTip = "Often used when discussing the results of an action or decision."
                ),
                VocabWord(
                    english = "alternative",
                    persian = "گزینه جایگزین",
                    pronunciation = "ɔːlˈtɜːrnətɪv",
                    partOfSpeech = "noun",
                    example = "We need to consider every alternative before deciding.",
                    examplePersian = "قبل از تصمیم‌گیری باید هر گزینه جایگزینی را بررسی کنیم.",
                    collocations = "possible alternative, alternative solution",
                    synonyms = "option, substitute",
                    usageTip = "Alternative usually refers to another possible choice."
                ),
                VocabWord(
                    english = "priority",
                    persian = "اولویت",
                    pronunciation = "praɪˈɔːrəti",
                    partOfSpeech = "noun",
                    example = "Financial security is one of her main priorities.",
                    examplePersian = "امنیت مالی یکی از اولویت‌های اصلی اوست.",
                    collocations = "top priority, main priority, set priorities",
                    synonyms = "importance",
                    usageTip = "Useful when explaining why one concern is more important than another."
                ),
                VocabWord(
                    english = "drawback",
                    persian = "نقطه ضعف، عیب",
                    pronunciation = "ˈdrɔːbæk",
                    partOfSpeech = "noun",
                    example = "The main drawback is the amount of time it requires.",
                    examplePersian = "نقطه ضعف اصلی مقدار زمانی است که نیاز دارد.",
                    collocations = "major drawback, potential drawback",
                    synonyms = "disadvantage",
                    antonyms = "benefit, advantage",
                    usageTip = "Often used when evaluating advantages and disadvantages."
                ),
                VocabWord(
                    english = "perspective",
                    persian = "دیدگاه",
                    pronunciation = "pərˈspektɪv",
                    partOfSpeech = "noun",
                    example = "Try to look at the problem from another perspective.",
                    examplePersian = "سعی کن مشکل را از دیدگاه دیگری ببینی.",
                    collocations = "different perspective, personal perspective",
                    synonyms = "viewpoint, outlook",
                    usageTip = "Perspective often refers to the way someone understands or interprets an issue."
                ),
                VocabWord(
                    english = "assumption",
                    persian = "فرض، پیش‌فرض",
                    pronunciation = "əˈsʌmpʃən",
                    partOfSpeech = "noun",
                    example = "We shouldn't make decisions based on assumptions.",
                    examplePersian = "نباید بر اساس پیش‌فرض‌ها تصمیم بگیریم.",
                    collocations = "false assumption, reasonable assumption",
                    synonyms = "belief, supposition",
                    wordFamily = "assume",
                    usageTip = "An assumption is something accepted as true without complete proof."
                ),
                VocabWord(
                    english = "justify",
                    persian = "توجیه کردن، دلیل آوردن برای",
                    pronunciation = "ˈdʒʌstəfaɪ",
                    partOfSpeech = "verb",
                    example = "How would you justify such an expensive decision?",
                    examplePersian = "چطور چنین تصمیم گرانی را توجیه می‌کنی؟",
                    collocations = "justify a decision, justify an action",
                    synonyms = "defend, explain",
                    wordFamily = "justification, justified",
                    usageTip = "Use justify when giving reasons that support a decision or action."
                ),
                VocabWord(
                    english = "reconsider",
                    persian = "دوباره بررسی کردن",
                    pronunciation = "ˌriːkənˈsɪdər",
                    partOfSpeech = "verb",
                    example = "After hearing the new information, she reconsidered her decision.",
                    examplePersian = "بعد از شنیدن اطلاعات جدید، او در تصمیمش تجدیدنظر کرد.",
                    synonyms = "rethink, review",
                    wordFamily = "consideration",
                    usageTip = "Reconsider means to think about a decision again, often because new information has appeared."
                ),
                VocabWord(
                    english = "regret",
                    persian = "پشیمان شدن، تأسف خوردن",
                    pronunciation = "rɪˈɡret",
                    partOfSpeech = "verb",
                    example = "He regrets not taking the opportunity earlier.",
                    examplePersian = "او از اینکه زودتر از فرصت استفاده نکرده پشیمان است.",
                    collocations = "deeply regret, regret doing something",
                    synonyms = "be sorry about",
                    wordFamily = "regretful",
                    usageTip = "Regret is commonly followed by a gerund when referring to a past action."
                ),
                VocabWord(
                    english = "trade-off",
                    persian = "موازنه بین دو انتخاب",
                    pronunciation = "ˈtreɪd ɔːf",
                    partOfSpeech = "noun",
                    example = "There is always a trade-off between cost and convenience.",
                    examplePersian = "همیشه بین هزینه و راحتی نوعی موازنه وجود دارد.",
                    collocations = "make a trade-off, difficult trade-off",
                    synonyms = "compromise",
                    usageTip = "A trade-off happens when you gain one benefit but give up another."
                ),
                VocabWord(
                    english = "uncertainty",
                    persian = "عدم اطمینان",
                    pronunciation = "ʌnˈsɜːrtənti",
                    partOfSpeech = "noun",
                    example = "The uncertainty made the decision more difficult.",
                    examplePersian = "عدم اطمینان تصمیم‌گیری را دشوارتر کرد.",
                    synonyms = "doubt, unpredictability",
                    antonyms = "certainty",
                    wordFamily = "uncertain",
                    usageTip = "Useful for discussing situations where the outcome is unknown."
                ),
                VocabWord(
                    english = "feasible",
                    persian = "عملی، شدنی",
                    pronunciation = "ˈfiːzəbəl",
                    partOfSpeech = "adjective",
                    example = "We need to decide whether the plan is financially feasible.",
                    examplePersian = "باید تصمیم بگیریم که آیا این برنامه از نظر مالی عملی است یا نه.",
                    synonyms = "practical, workable",
                    antonyms = "impractical",
                    wordFamily = "feasibility",
                    usageTip = "More formal than 'possible' and common in professional discussions."
                ),
                VocabWord(
                    english = "implication",
                    persian = "پیامد یا مفهوم ضمنی",
                    pronunciation = "ˌɪmplɪˈkeɪʃən",
                    partOfSpeech = "noun",
                    example = "We need to consider the long-term implications.",
                    examplePersian = "باید پیامدهای بلندمدت را در نظر بگیریم.",
                    collocations = "long-term implications, political implications",
                    synonyms = "consequence, significance",
                    usageTip = "Implication often refers to a result that is not immediately obvious."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "weigh the pros and cons",
                    persian = "مزایا و معایب را سنجیدن",
                    example = "I need some time to weigh the pros and cons.",
                    examplePersian = "به کمی زمان نیاز دارم تا مزایا و معایب را بسنجم."
                ),
                IdiomExpression(
                    english = "a tough call",
                    persian = "تصمیم بسیار سخت",
                    example = "Choosing between the two offers was a tough call.",
                    examplePersian = "انتخاب بین آن دو پیشنهاد تصمیم بسیار سختی بود."
                ),
                IdiomExpression(
                    english = "go with your gut",
                    persian = "به حس درونی خود اعتماد کردن",
                    example = "Sometimes you have to stop analyzing and go with your gut.",
                    examplePersian = "گاهی باید دست از تحلیل کردن برداری و به حس درونی‌ات اعتماد کنی."
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "think through",
                    meaning = "با دقت بررسی کردن",
                    persian = "یک موضوع را کاملاً بررسی کردن",
                    example = "You should think through all the consequences first.",
                    examplePersian = "باید ابتدا همه پیامدها را با دقت بررسی کنی."
                ),
                PhrasalVerb(
                    verb = "come up with",
                    meaning = "ارائه دادن / پیدا کردن",
                    persian = "ایده یا راه‌حلی پیدا کردن",
                    example = "We need to come up with another solution.",
                    examplePersian = "باید راه‌حل دیگری پیدا کنیم."
                ),
                PhrasalVerb(
                    verb = "rule out",
                    meaning = "منتفی کردن",
                    persian = "یک گزینه را کنار گذاشتن",
                    example = "We can't rule out the possibility of delays.",
                    examplePersian = "نمی‌توانیم احتمال تأخیر را منتفی بدانیم."
                ),
                PhrasalVerb(
                    verb = "end up",
                    meaning = "در نهایت به جایی یا وضعیتی رسیدن",
                    persian = "در نهایت به چیزی ختم شدن",
                    example = "If we aren't careful, we could end up spending more than expected.",
                    examplePersian = "اگر مراقب نباشیم، ممکن است در نهایت بیشتر از انتظار هزینه کنیم."
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Would have",
                    content = "In natural speech, 'would have' is commonly contracted to 'would've'. Practice keeping the two sounds connected."
                ),
                PronunciationTip(
                    title = "Could have",
                    content = "The expression 'could have' is frequently reduced in connected speech. Focus on the meaning rather than pronouncing every word separately."
                ),
                PronunciationTip(
                    title = "Conditionals",
                    content = "In conditional sentences, the important information is often stressed in both clauses. Avoid giving every word equal stress."
                ),
                PronunciationTip(
                    title = "Contrastive stress",
                    content = "When correcting or contrasting an idea, English speakers often stress the key contrasting word: 'I said the PLAN was risky, not the IDEA.'"
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Disagreeing politely",
                    content = "In many English-speaking professional and academic settings, disagreement is often softened with expressions such as 'I see your point, but...' or 'That's a fair argument; however...'"
                ),
                CulturalNote(
                    title = "Explaining decisions",
                    content = "Giving a reason is often valued when discussing decisions. Instead of simply saying 'I don't want to,' speakers may explain priorities, constraints, or expected consequences."
                ),
                CulturalNote(
                    title = "Personal choices and privacy",
                    content = "Questions about money, relationships, or major personal decisions can be sensitive. Context and tone matter, and indirect questions can sound more respectful."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "First conditional",
                    content = "Use the first conditional for realistic future possibilities: if + present simple, will + base verb. Example: 'If the offer is good, I'll accept it.'"
                ),
                GrammarSection(
                    title = "Second conditional",
                    content = "Use the second conditional for hypothetical or unlikely present/future situations: if + past simple, would + base verb. Example: 'If I were in your position, I'd ask for more information.'"
                ),
                GrammarSection(
                    title = "Third conditional",
                    content = "Use the third conditional to discuss unreal situations in the past and their imagined consequences: if + past perfect, would have + past participle. Example: 'If I had known about the problem, I would have acted differently.'"
                ),
                GrammarSection(
                    title = "Mixed conditionals",
                    content = "Mixed conditionals connect different times. For example, a past condition can have a present result: 'If I had accepted that job, I would be living abroad now.'"
                ),
                GrammarSection(
                    title = "Reported speech",
                    content = "When reporting what someone said, tense and pronouns may change depending on the context. Example: Direct: 'I can't accept the offer.' Reported: 'She said she couldn't accept the offer.'"
                ),
                GrammarSection(
                    title = "Advanced linking expressions",
                    content = "Use expressions such as however, nevertheless, whereas, on the other hand, therefore, consequently, and provided that to connect ideas and show logical relationships."
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "If I would have known, I would have changed it.",
                    correct = "If I had known, I would have changed it.",
                    explanation = "In the third conditional, the if-clause normally uses the past perfect, not would have."
                ),
                CommonMistake(
                    wrong = "If I was you, I would wait.",
                    correct = "If I were you, I would wait.",
                    explanation = "In the fixed expression 'If I were you', were is traditionally preferred for hypothetical advice."
                ),
                CommonMistake(
                    wrong = "She said me that she was busy.",
                    correct = "She told me that she was busy.",
                    explanation = "Use tell + object, but say can be used without an indirect object: 'She said that she was busy.'"
                ),
                CommonMistake(
                    wrong = "I regret to not taking the opportunity.",
                    correct = "I regret not taking the opportunity.",
                    explanation = "When expressing regret about a past action, regret is commonly followed by a gerund."
                ),
                CommonMistake(
                    wrong = "Despite of the risk, they continued.",
                    correct = "Despite the risk, they continued.",
                    explanation = "Despite is followed directly by a noun or gerund. Do not use 'of' after despite."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Nora",
                    english = "You look thoughtful. Is something on your mind?",
                    persian = "به نظر می‌رسد ذهنت درگیر چیزی است. چیزی فکرت را مشغول کرده؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Actually, yes. I've been offered a position in another city.",
                    persian = "راستش بله. به من یک موقعیت شغلی در شهر دیگری پیشنهاد شده."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "That's a big opportunity. Why haven't you accepted it yet?",
                    persian = "این فرصت بزرگی است. چرا هنوز قبولش نکرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Because there are several things I need to think through first.",
                    persian = "چون چند چیز هست که باید اول با دقت بررسی کنم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "Such as?",
                    persian = "مثلاً چه چیزهایی؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "The salary is higher, but I'd have to move and my commute would actually be longer.",
                    persian = "حقوق بیشتر است، اما باید نقل مکان کنم و رفت‌وآمدم در واقع طولانی‌تر می‌شود."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "Would you be able to work remotely?",
                    persian = "می‌توانی دورکاری کنی؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Only two days a week. The rest of the time I'd have to be in the office.",
                    persian = "فقط دو روز در هفته. بقیه زمان باید در دفتر باشم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "What about the long-term opportunities?",
                    persian = "فرصت‌های بلندمدت چطور؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "That's probably the strongest argument in favor of accepting it.",
                    persian = "احتمالاً این قوی‌ترین دلیل برای قبول کردن آن است."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "Could the new position help you move into management?",
                    persian = "آیا موقعیت جدید می‌تواند به تو کمک کند وارد مدیریت شوی؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Possibly. If everything goes well, I could be leading a small team within a couple of years.",
                    persian = "احتمالش هست. اگر همه‌چیز خوب پیش برود، ممکن است طی یکی دو سال یک تیم کوچک را مدیریت کنم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "That sounds like a significant career step.",
                    persian = "این یک قدم مهم در مسیر شغلی به نظر می‌رسد."
                ),
                DialogueLine(
                    speaker = "David",
                    english = "It would be. But I'd also be giving up some things I value now.",
                    persian = "همین‌طور است. اما در عوض باید از بعضی چیزهایی که الان برایم ارزشمند هستند بگذرم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "Like what?",
                    persian = "مثل چه چیزهایی؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "I'd see my family less often, and I'd probably have less time for my friends.",
                    persian = "خانواده‌ام را کمتر می‌بینم و احتمالاً زمان کمتری برای دوستانم خواهم داشت."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "So there's a trade-off between career growth and your personal life.",
                    persian = "پس بین پیشرفت شغلی و زندگی شخصی‌ات یک موازنه وجود دارد."
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Exactly. And that's what makes it difficult.",
                    persian = "دقیقاً. و همین موضوع تصمیم را سخت می‌کند."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "Have you talked to the company about negotiating the conditions?",
                    persian = "با شرکت درباره مذاکره روی شرایط صحبت کرده‌ای؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "Not yet. I was thinking that they might withdraw the offer if I ask for too much.",
                    persian = "هنوز نه. فکر می‌کردم شاید اگر درخواست زیادی داشته باشم، پیشنهادشان را پس بگیرند."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "That's an assumption. You don't know how they'll react.",
                    persian = "این یک پیش‌فرض است. نمی‌دانی آنها چه واکنشی نشان خواهند داد."
                ),
                DialogueLine(
                    speaker = "David",
                    english = "You're right. If I were more confident, I'd probably negotiate before making a decision.",
                    persian = "حق با توست. اگر اعتمادبه‌نفس بیشتری داشتم، احتمالاً قبل از تصمیم‌گیری مذاکره می‌کردم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "What would you have done if you'd received this offer five years ago?",
                    persian = "اگر پنج سال پیش این پیشنهاد را دریافت می‌کردی، چه کار می‌کردی؟"
                ),
                DialogueLine(
                    speaker = "David",
                    english = "I would have accepted immediately. My priorities were completely different back then.",
                    persian = "فوراً قبولش می‌کردم. آن زمان اولویت‌هایم کاملاً متفاوت بودند."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "That tells you something. Maybe the real question isn't whether the job is good, but whether it's right for you now.",
                    persian = "این خودش چیزهایی را به تو نشان می‌دهد. شاید سؤال اصلی این نباشد که آیا شغل خوبی است، بلکه این باشد که آیا الان برای تو مناسب است یا نه."
                ),
                DialogueLine(
                    speaker = "David",
                    english = "That's a useful perspective. I hadn't thought about it that way.",
                    persian = "این دیدگاه مفیدی است. از این زاویه به آن فکر نکرده بودم."
                ),
                DialogueLine(
                    speaker = "Nora",
                    english = "You don't have to decide tonight. Ask questions, compare the alternatives, and then reconsider your priorities.",
                    persian = "لازم نیست امشب تصمیم بگیری. سؤال بپرس، گزینه‌ها را مقایسه کن و بعد اولویت‌هایت را دوباره بررسی کن."
                ),
                DialogueLine(
                    speaker = "David",
                    english = "You're right. I'll talk to them tomorrow before I make a final decision.",
                    persian = "حق با توست. فردا قبل از تصمیم نهایی با آنها صحبت می‌کنم."
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What opportunity has David received?",
                    answer = "He has been offered a position in another city."
                ),
                ComprehensionQuestion(
                    question = "What is one major advantage of the new position?",
                    answer = "It offers a higher salary and potentially better long-term career opportunities."
                ),
                ComprehensionQuestion(
                    question = "What would David have to give up?",
                    answer = "He would see his family and friends less often and would have less personal time."
                ),
                ComprehensionQuestion(
                    question = "What assumption has David made?",
                    answer = "He assumes that the company might withdraw the offer if he negotiates."
                ),
                ComprehensionQuestion(
                    question = "How have David's priorities changed?",
                    answer = "He now values his personal life more than he did five years ago."
                ),
                ComprehensionQuestion(
                    question = "What does Nora suggest David should do?",
                    answer = "She suggests that he ask questions, compare alternatives, negotiate if appropriate, and reconsider his priorities."
                )
            ),

            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Describe a difficult decision someone might have to make between career and personal life.",
                    promptPersian = "یک تصمیم دشوار را توضیح بده که ممکن است فرد بین شغل و زندگی شخصی مجبور به گرفتن آن شود.",
                    hints = "Use: on the one hand, on the other hand, whereas, however, consequently."
                ),
                SpeakingTask(
                    prompt = "Imagine you had to choose between a high-paying job and a lower-paying job with much more free time. Explain your choice.",
                    promptPersian = "فرض کن باید بین یک شغل پردرآمد و شغلی با درآمد کمتر اما زمان آزاد بیشتر انتخاب کنی. انتخابت را توضیح بده.",
                    hints = "Use second conditional structures and vocabulary such as priority, trade-off, drawback, and benefit."
                ),
                SpeakingTask(
                    prompt = "Describe a past decision you would have made differently if you had known what you know now.",
                    promptPersian = "یک تصمیم گذشته را توضیح بده که اگر اطلاعات امروزت را آن زمان داشتی، متفاوت می‌گرفتی.",
                    hints = "Use the third conditional: If I had..., I would have..."
                )
            ),

            writingTasks = listOf(
                WritingTask(
                    prompt = "Write an argumentative paragraph about a difficult life or career decision. Present at least two alternatives, explain the benefits and drawbacks of each, state your priorities, and reach a reasoned conclusion.",
                    promptPersian = "درباره یک تصمیم دشوار در زندگی یا شغل یک متن استدلالی بنویس. حداقل دو گزینه را مطرح کن، مزایا و معایب هرکدام را توضیح بده، اولویت‌هایت را مشخص کن و در پایان به یک نتیجه منطقی برس.",
                    wordCount = 250,
                    hints = "Use at least one second conditional, one third conditional, and several advanced linking expressions."
                )
            ),

            quiz = listOf(
                QuizQuestion(
                    question = "Which sentence correctly uses the third conditional?",
                    options = listOf(
                        "If I knew earlier, I would act differently.",
                        "If I had known earlier, I would have acted differently.",
                        "If I know earlier, I will act differently.",
                        "If I would know earlier, I acted differently."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which sentence expresses a hypothetical present situation?",
                    options = listOf(
                        "If I were you, I would wait.",
                        "If I had called, I would have arrived.",
                        "If I finish, I will leave.",
                        "If I am free, I will come."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'trade-off' mean?",
                    options = listOf(
                        "A situation where one benefit involves giving up another",
                        "A guaranteed success",
                        "A final deadline",
                        "An unexpected opportunity"
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Choose the correct reported speech:",
                    options = listOf(
                        "She told me that she was busy.",
                        "She told that she is busy.",
                        "She said me that she was busy.",
                        "She told me she busy."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'rule out' mean?",
                    options = listOf(
                        "To make something more likely",
                        "To eliminate a possibility",
                        "To discuss an advantage",
                        "To delay a decision"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which word means 'a disadvantage'?",
                    options = listOf(
                        "priority",
                        "perspective",
                        "drawback",
                        "assumption"
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "Which sentence is grammatically correct?",
                    options = listOf(
                        "If I would be you, I'd wait.",
                        "If I were you, I'd wait.",
                        "If I was being you, I'd wait.",
                        "If I am you, I'd wait."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which expression means 'to carefully consider all sides of a problem'?",
                    options = listOf(
                        "come up with",
                        "go with your gut",
                        "think through",
                        "end up"
                    ),
                    correctIndex = 2
                )
            )
        )
    }

    private fun getDefaultContent(
        bookId: String,
        chapterNumber: Int
    ): LessonContent {
        return LessonContent(
            bookId = bookId,
            chapterNumber = chapterNumber,
            title = "Coming Soon",
            titlePersian = "به زودی...",
            vocabulary = emptyList(),
            grammar = emptyList(),
            conversation = emptyList(),
            quiz = emptyList()
        )
    }
}