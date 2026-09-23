package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object Evolve6 {

    const val BOOK_ID = "evolve_6"

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
            title = "Ideas That Shape Our Future",
            titlePersian = "ایده‌هایی که آینده ما را شکل می‌دهند",

            objectives = listOf(
                "Discuss complex social and technological issues.",
                "Express nuanced opinions and qualify statements.",
                "Evaluate evidence and distinguish facts from assumptions.",
                "Use advanced modal structures to express certainty and possibility.",
                "Use inversion and emphasis for more sophisticated communication.",
                "Participate in an extended discussion while responding to opposing viewpoints."
            ),

            vocabulary = listOf(
                VocabWord(
                    english = "innovation",
                    persian = "نوآوری",
                    pronunciation = "ˌɪnəˈveɪʃən",
                    partOfSpeech = "noun",
                    example = "Technological innovation can change the way people work.",
                    examplePersian = "نوآوری فناوری می‌تواند شیوه کار مردم را تغییر دهد.",
                    collocations = "technological innovation, encourage innovation, major innovation",
                    synonyms = "advancement, development",
                    wordFamily = "innovate, innovative",
                    usageTip = "Common in discussions about technology, business, and society."
                ),
                VocabWord(
                    english = "implication",
                    persian = "پیامد، مفهوم ضمنی",
                    pronunciation = "ˌɪmplɪˈkeɪʃən",
                    partOfSpeech = "noun",
                    example = "We need to consider the wider implications of this decision.",
                    examplePersian = "باید پیامدهای گسترده‌تر این تصمیم را در نظر بگیریم.",
                    collocations = "wider implications, long-term implications",
                    synonyms = "consequence, significance",
                    usageTip = "Often refers to consequences that are not immediately obvious."
                ),
                VocabWord(
                    english = "sustainable",
                    persian = "پایدار",
                    pronunciation = "səˈsteɪnəbəl",
                    partOfSpeech = "adjective",
                    example = "Cities need to find more sustainable ways to grow.",
                    examplePersian = "شهرها باید راه‌های پایدارتری برای رشد پیدا کنند.",
                    collocations = "sustainable development, sustainable solution",
                    synonyms = "environmentally responsible",
                    antonyms = "unsustainable",
                    wordFamily = "sustainability",
                    usageTip = "Used frequently when discussing long-term environmental or social solutions."
                ),
                VocabWord(
                    english = "inevitable",
                    persian = "اجتناب‌ناپذیر",
                    pronunciation = "ɪnˈevətəbəl",
                    partOfSpeech = "adjective",
                    example = "Change is inevitable in a rapidly developing industry.",
                    examplePersian = "تغییر در یک صنعت به‌سرعت در حال توسعه اجتناب‌ناپذیر است.",
                    synonyms = "unavoidable",
                    antonyms = "avoidable",
                    usageTip = "Use when you believe something cannot be prevented."
                ),
                VocabWord(
                    english = "controversial",
                    persian = "بحث‌برانگیز",
                    pronunciation = "ˌkɑːntrəˈvɜːrʃəl",
                    partOfSpeech = "adjective",
                    example = "The proposal is controversial because people disagree about its effects.",
                    examplePersian = "این پیشنهاد بحث‌برانگیز است چون مردم درباره آثار آن اختلاف نظر دارند.",
                    synonyms = "debatable, disputed",
                    wordFamily = "controversy",
                    usageTip = "Describes an issue that causes significant disagreement."
                ),
                VocabWord(
                    english = "evidence",
                    persian = "شواهد",
                    pronunciation = "ˈevɪdəns",
                    partOfSpeech = "noun",
                    example = "There is not enough evidence to support that claim.",
                    examplePersian = "شواهد کافی برای حمایت از آن ادعا وجود ندارد.",
                    collocations = "strong evidence, scientific evidence, evidence suggests",
                    synonyms = "proof, indication",
                    usageTip = "Evidence is normally uncountable when referring to proof in general."
                ),
                VocabWord(
                    english = "assumption",
                    persian = "پیش‌فرض",
                    pronunciation = "əˈsʌmpʃən",
                    partOfSpeech = "noun",
                    example = "That conclusion is based on an assumption.",
                    examplePersian = "آن نتیجه‌گیری بر اساس یک پیش‌فرض است.",
                    synonyms = "supposition, belief",
                    wordFamily = "assume",
                    usageTip = "An assumption is something accepted without complete evidence."
                ),
                VocabWord(
                    english = "perspective",
                    persian = "دیدگاه",
                    pronunciation = "pərˈspektɪv",
                    partOfSpeech = "noun",
                    example = "The issue looks different from a global perspective.",
                    examplePersian = "این موضوع از دیدگاه جهانی متفاوت به نظر می‌رسد.",
                    collocations = "global perspective, different perspective",
                    synonyms = "viewpoint, outlook",
                    usageTip = "Useful for presenting different ways of looking at an issue."
                ),
                VocabWord(
                    english = "regulate",
                    persian = "تنظیم و قانون‌گذاری کردن",
                    pronunciation = "ˈreɡjəleɪt",
                    partOfSpeech = "verb",
                    example = "Governments may need to regulate new technologies.",
                    examplePersian = "دولت‌ها ممکن است نیاز داشته باشند فناوری‌های جدید را قانون‌گذاری کنند.",
                    collocations = "strictly regulate, regulate an industry",
                    synonyms = "control, govern",
                    wordFamily = "regulation, regulatory",
                    usageTip = "Often used when discussing rules and standards."
                ),
                VocabWord(
                    english = "adapt",
                    persian = "سازگار شدن",
                    pronunciation = "əˈdæpt",
                    partOfSpeech = "verb",
                    example = "Organizations have to adapt to changing conditions.",
                    examplePersian = "سازمان‌ها باید با شرایط در حال تغییر سازگار شوند.",
                    collocations = "adapt to change, adapt quickly",
                    synonyms = "adjust, modify",
                    wordFamily = "adaptation, adaptable",
                    usageTip = "Usually followed by 'to' when describing what you adapt to."
                ),
                VocabWord(
                    english = "ethical",
                    persian = "اخلاقی",
                    pronunciation = "ˈeθɪkəl",
                    partOfSpeech = "adjective",
                    example = "The company needs to consider the ethical consequences of its actions.",
                    examplePersian = "شرکت باید پیامدهای اخلاقی اقدامات خود را در نظر بگیرد.",
                    collocations = "ethical issue, ethical concern, ethical responsibility",
                    synonyms = "moral",
                    wordFamily = "ethics, ethically",
                    usageTip = "Common in discussions about responsibility and social impact."
                ),
                VocabWord(
                    english = "inequality",
                    persian = "نابرابری",
                    pronunciation = "ˌɪnɪˈkwɑːləti",
                    partOfSpeech = "noun",
                    example = "Technology can reduce inequality, but it can also create new gaps.",
                    examplePersian = "فناوری می‌تواند نابرابری را کاهش دهد، اما می‌تواند شکاف‌های جدیدی هم ایجاد کند.",
                    synonyms = "imbalance, disparity",
                    antonyms = "equality",
                    wordFamily = "unequal",
                    usageTip = "Often used when discussing differences in access, income, or opportunity."
                ),
                VocabWord(
                    english = "transform",
                    persian = "دگرگون کردن",
                    pronunciation = "trænsˈfɔːrm",
                    partOfSpeech = "verb",
                    example = "Digital tools have transformed the way we communicate.",
                    examplePersian = "ابزارهای دیجیتال شیوه ارتباط ما را دگرگون کرده‌اند.",
                    synonyms = "change, revolutionize",
                    wordFamily = "transformation, transformative",
                    usageTip = "Stronger than simply 'change'; it suggests a significant change."
                ),
                VocabWord(
                    english = "constraint",
                    persian = "محدودیت",
                    pronunciation = "kənˈstreɪnt",
                    partOfSpeech = "noun",
                    example = "Budget constraints can limit what a project can achieve.",
                    examplePersian = "محدودیت‌های بودجه می‌توانند دستاوردهای یک پروژه را محدود کنند.",
                    collocations = "financial constraint, practical constraint",
                    synonyms = "limitation, restriction",
                    usageTip = "Often used in formal academic and professional discussions."
                )
            ),

            idioms = listOf(
                IdiomExpression(
                    english = "the bigger picture",
                    persian = "تصویر کلی",
                    example = "We need to look at the bigger picture before judging the proposal.",
                    examplePersian = "قبل از قضاوت درباره پیشنهاد باید تصویر کلی را ببینیم."
                ),
                IdiomExpression(
                    english = "a double-edged sword",
                    persian = "چیزی که هم مزیت و هم ضرر دارد",
                    example = "Social media can be a double-edged sword.",
                    examplePersian = "شبکه‌های اجتماعی می‌توانند هم مزایا و هم معایب جدی داشته باشند."
                ),
                IdiomExpression(
                    english = "raise a red flag",
                    persian = "باعث نگرانی شدن",
                    example = "The lack of evidence raises a red flag.",
                    examplePersian = "نبود شواهد کافی باعث نگرانی می‌شود."
                )
            ),

            phrasalVerbs = listOf(
                PhrasalVerb(
                    verb = "point out",
                    meaning = "اشاره کردن به",
                    persian = "به نکته‌ای اشاره کردن",
                    example = "She pointed out several weaknesses in the proposal.",
                    examplePersian = "او به چند ضعف در پیشنهاد اشاره کرد."
                ),
                PhrasalVerb(
                    verb = "bring up",
                    meaning = "مطرح کردن",
                    persian = "موضوعی را مطرح کردن",
                    example = "I'd like to bring up another important issue.",
                    examplePersian = "می‌خواهم موضوع مهم دیگری را مطرح کنم."
                ),
                PhrasalVerb(
                    verb = "carry out",
                    meaning = "انجام دادن",
                    persian = "انجام دادن، اجرا کردن",
                    example = "The researchers carried out a detailed study.",
                    examplePersian = "پژوهشگران یک مطالعه دقیق انجام دادند."
                ),
                PhrasalVerb(
                    verb = "rule out",
                    meaning = "منتفی کردن",
                    persian = "یک احتمال را کنار گذاشتن",
                    example = "We can't rule out the possibility of unexpected effects.",
                    examplePersian = "نمی‌توانیم احتمال آثار غیرمنتظره را منتفی بدانیم."
                )
            ),

            pronunciationTips = listOf(
                PronunciationTip(
                    title = "Emphasis",
                    content = "Advanced speakers often use stress to highlight contrast or correct an assumption. Practice stressing the key word rather than every word."
                ),
                PronunciationTip(
                    title = "Could have / should have",
                    content = "In connected speech, these combinations are commonly reduced. Focus on producing them smoothly rather than separating each word."
                ),
                PronunciationTip(
                    title = "Academic vocabulary",
                    content = "Long words such as implication, inequality, and sustainability usually have one clearly stressed syllable. Learning the stress pattern improves comprehension."
                ),
                PronunciationTip(
                    title = "Pausing",
                    content = "When presenting a complex argument, short pauses between ideas make speech easier to follow and give important points more emphasis."
                )
            ),

            culturalNotes = listOf(
                CulturalNote(
                    title = "Nuanced disagreement",
                    content = "In academic and professional English, disagreement is often expressed indirectly. Phrases such as 'I understand your point, although...' allow speakers to challenge an idea without rejecting the person."
                ),
                CulturalNote(
                    title = "Evidence and opinion",
                    content = "When discussing complex issues, speakers often distinguish between what they know, what they believe, and what the evidence suggests. Expressions such as 'It appears that...' and 'There is evidence to suggest...' help show this distinction."
                ),
                CulturalNote(
                    title = "Hedging",
                    content = "Advanced English frequently uses words such as perhaps, relatively, potentially, arguably, and to some extent to avoid making unnecessarily absolute claims."
                )
            ),

            grammar = listOf(
                GrammarSection(
                    title = "Advanced modal meanings",
                    content = "Modal verbs can express different degrees of certainty. 'Must have' suggests a strong conclusion about the past, while 'may have' and 'might have' express weaker possibilities. Example: 'They must have misunderstood the instructions.'"
                ),
                GrammarSection(
                    title = "Perfect modal structures",
                    content = "Use modal + have + past participle to discuss possibilities, criticism, or conclusions about the past. Examples: 'We should have considered the risk.' 'The decision might have had unexpected consequences.'"
                ),
                GrammarSection(
                    title = "Inversion for emphasis",
                    content = "Formal English can use inversion after negative or restrictive expressions. Example: 'Not only did the technology reduce costs, but it also improved access.'"
                ),
                GrammarSection(
                    title = "Cleft sentences",
                    content = "Cleft structures place emphasis on a particular part of a sentence. Example: 'What concerns me most is the lack of evidence.' Another pattern is: 'It was the cost that caused the problem.'"
                ),
                GrammarSection(
                    title = "Participle clauses",
                    content = "Participle clauses can make formal writing more concise. Example: 'Having considered all the alternatives, the committee changed its recommendation.'"
                ),
                GrammarSection(
                    title = "Hedging and qualification",
                    content = "Use may, might, could, appear to, tend to, arguably, relatively, and to some extent when a statement needs to be cautious rather than absolute. Example: 'This approach could potentially reduce costs.'"
                )
            ),

            commonMistakes = listOf(
                CommonMistake(
                    wrong = "He must to be tired.",
                    correct = "He must be tired.",
                    explanation = "Modal verbs are followed directly by the base form of the verb."
                ),
                CommonMistake(
                    wrong = "They should have went earlier.",
                    correct = "They should have gone earlier.",
                    explanation = "After a modal perfect, use have + past participle."
                ),
                CommonMistake(
                    wrong = "Not only the project failed, but it also cost more.",
                    correct = "Not only did the project fail, but it also cost more.",
                    explanation = "Negative inversion after 'not only' requires auxiliary inversion when the clause is in the simple past."
                ),
                CommonMistake(
                    wrong = "Having finished the report, the meeting started.",
                    correct = "Having finished the report, I went to the meeting.",
                    explanation = "The subject of the participle clause should logically be the same as the subject of the main clause."
                ),
                CommonMistake(
                    wrong = "This evidence proves that he is definitely wrong.",
                    correct = "This evidence strongly suggests that his conclusion may be incorrect.",
                    explanation = "Academic and professional communication often benefits from appropriately cautious language when the evidence is not conclusive."
                )
            ),

            conversation = listOf(
                DialogueLine(
                    speaker = "Leila",
                    english = "I've been thinking about how quickly technology is changing the way we work.",
                    persian = "داشتم فکر می‌کردم فناوری با چه سرعتی شیوه کار ما را تغییر می‌دهد."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "It certainly is. The bigger question is whether society is adapting quickly enough.",
                    persian = "قطعاً همین‌طور است. سؤال بزرگ‌تر این است که آیا جامعه به اندازه کافی سریع سازگار می‌شود یا نه."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "I'm not sure it is. Technological progress seems to be moving faster than education systems can respond.",
                    persian = "مطمئن نیستم که این‌طور باشد. به نظر می‌رسد پیشرفت فناوری سریع‌تر از آن چیزی است که نظام‌های آموزشی می‌توانند واکنش نشان دهند."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "That's a fair point, although I'd argue that education isn't the only issue.",
                    persian = "نکته قابل قبولی است، هرچند من می‌گویم آموزش تنها مسئله نیست."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "What else do you think matters?",
                    persian = "فکر می‌کنی چه چیز دیگری اهمیت دارد؟"
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "Regulation, for one. New technologies can have consequences that aren't obvious at first.",
                    persian = "مثلاً قانون‌گذاری. فناوری‌های جدید می‌توانند پیامدهایی داشته باشند که در ابتدا واضح نیستند."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "True, but excessive regulation could slow down innovation.",
                    persian = "درست است، اما قانون‌گذاری بیش از حد می‌تواند نوآوری را کند کند."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "Absolutely. That's why I don't think the solution is simply to introduce more rules.",
                    persian = "کاملاً. به همین دلیل فکر نمی‌کنم راه‌حل صرفاً وضع قوانین بیشتر باشد."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "So what would you suggest?",
                    persian = "پس چه پیشنهادی داری؟"
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "I'd focus on flexible regulations that can adapt as the technology develops.",
                    persian = "من روی قوانین انعطاف‌پذیری تمرکز می‌کردم که بتوانند هم‌زمان با پیشرفت فناوری سازگار شوند."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "That sounds reasonable, but how would you prevent companies from exploiting those rules?",
                    persian = "منطقی به نظر می‌رسد، اما چطور مانع سوءاستفاده شرکت‌ها از این قوانین می‌شوی؟"
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "There would have to be independent oversight and clear standards.",
                    persian = "باید نظارت مستقل و استانداردهای مشخصی وجود داشته باشد."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "What concerns me most is inequality. New technology isn't equally accessible to everyone.",
                    persian = "چیزی که بیش از همه نگرانم می‌کند نابرابری است. فناوری جدید برای همه به یک اندازه قابل دسترسی نیست."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "That's an important point. If access remains unequal, technological progress could actually widen existing gaps.",
                    persian = "این نکته مهمی است. اگر دسترسی نابرابر باقی بماند، پیشرفت فناوری ممکن است در واقع شکاف‌های موجود را بیشتر کند."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "Exactly. People sometimes assume that innovation automatically benefits everyone.",
                    persian = "دقیقاً. مردم گاهی فرض می‌کنند که نوآوری به‌طور خودکار برای همه مفید است."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "And that's where evidence becomes important. We shouldn't rely entirely on assumptions.",
                    persian = "و اینجاست که شواهد اهمیت پیدا می‌کنند. نباید کاملاً به پیش‌فرض‌ها تکیه کنیم."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "Could technology actually reduce inequality in the long run?",
                    persian = "آیا فناوری می‌تواند در بلندمدت واقعاً نابرابری را کاهش دهد؟"
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "It could, provided that access becomes more affordable and education keeps pace.",
                    persian = "می‌تواند، به شرطی که دسترسی مقرون‌به‌صرفه‌تر شود و آموزش همگام با آن پیش برود."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "So the technology itself isn't necessarily the problem.",
                    persian = "پس خود فناوری لزوماً مشکل نیست."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "Right. The real issue may be how we choose to implement it.",
                    persian = "درست است. مسئله واقعی ممکن است این باشد که ما چگونه تصمیم می‌گیریم آن را اجرا کنیم."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "That distinction is important. The same innovation could have completely different effects in different communities.",
                    persian = "این تفاوت مهم است. یک نوآوری یکسان می‌تواند در جوامع مختلف آثار کاملاً متفاوتی داشته باشد."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "And that's why long-term planning matters. We have to consider the wider implications, not just the immediate benefits.",
                    persian = "و به همین دلیل برنامه‌ریزی بلندمدت اهمیت دارد. باید پیامدهای گسترده‌تر را در نظر بگیریم، نه فقط مزایای فوری را."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "Perhaps the most difficult part is accepting that there won't always be a perfect solution.",
                    persian = "شاید سخت‌ترین بخش این باشد که بپذیریم همیشه راه‌حل کاملی وجود نخواهد داشت."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "I agree. Sometimes the goal is to find the most sustainable compromise rather than a perfect answer.",
                    persian = "موافقم. گاهی هدف پیدا کردن پایدارترین سازش است، نه یک پاسخ کامل."
                ),
                DialogueLine(
                    speaker = "Leila",
                    english = "And we may have to revise our approach when new evidence appears.",
                    persian = "و ممکن است وقتی شواهد جدید ظاهر می‌شوند، مجبور شویم رویکردمان را اصلاح کنیم."
                ),
                DialogueLine(
                    speaker = "Marcus",
                    english = "Exactly. Being willing to reconsider an idea isn't a weakness; it can be a sign that we're taking the evidence seriously.",
                    persian = "دقیقاً. آمادگی برای تجدیدنظر در یک ایده ضعف نیست؛ می‌تواند نشانه این باشد که شواهد را جدی می‌گیریم."
                )
            ),

            comprehensionQuestions = listOf(
                ComprehensionQuestion(
                    question = "What concern does Leila raise about technological progress?",
                    answer = "She is concerned that technology may develop faster than education systems and society can adapt."
                ),
                ComprehensionQuestion(
                    question = "Why does Marcus think regulation is important?",
                    answer = "Because new technologies can have consequences that are not immediately obvious."
                ),
                ComprehensionQuestion(
                    question = "What risk does Leila associate with unequal access?",
                    answer = "She believes it could widen existing social and economic gaps."
                ),
                ComprehensionQuestion(
                    question = "What condition does Marcus mention for technology to reduce inequality?",
                    answer = "Access needs to become more affordable and education needs to keep pace."
                ),
                ComprehensionQuestion(
                    question = "What does Marcus say about assumptions?",
                    answer = "He says decisions should not rely entirely on assumptions and that evidence is important."
                ),
                ComprehensionQuestion(
                    question = "Why does Marcus think reconsidering an idea can be positive?",
                    answer = "Because new evidence may justify changing an earlier position."
                )
            ),

            speakingTasks = listOf(
                SpeakingTask(
                    prompt = "Discuss one technology that has significantly changed everyday life. Explain both its benefits and possible drawbacks.",
                    promptPersian = "درباره یک فناوری که زندگی روزمره را به شکل قابل توجهی تغییر داده صحبت کن و هم مزایا و هم معایب احتمالی آن را توضیح بده.",
                    hints = "Use: on the one hand, however, nevertheless, implication, drawback, perspective."
                ),
                SpeakingTask(
                    prompt = "Imagine you are advising a company that wants to introduce a new technology. What ethical and practical issues should it consider?",
                    promptPersian = "فرض کن به شرکتی مشاوره می‌دهی که می‌خواهد فناوری جدیدی معرفی کند. چه مسائل اخلاقی و عملی را باید در نظر بگیرد؟",
                    hints = "Use modal verbs, hedging, and vocabulary such as ethical, sustainable, evidence, regulation."
                ),
                SpeakingTask(
                    prompt = "Present an opinion that you have changed because of new evidence or information.",
                    promptPersian = "یک دیدگاه را بیان کن که به دلیل شواهد یا اطلاعات جدید آن را تغییر داده‌ای.",
                    hints = "Use: I used to think..., however..., after I learned..., I reconsidered..."
                )
            ),

            writingTasks = listOf(
                WritingTask(
                    prompt = "Write a 280-word opinion essay about whether technological progress is always beneficial for society. Present different perspectives, discuss possible advantages and disadvantages, use evidence-based reasoning, and reach a balanced conclusion.",
                    promptPersian = "یک مقاله ۲۸۰ کلمه‌ای درباره این موضوع بنویس که آیا پیشرفت فناوری همیشه برای جامعه مفید است یا نه. دیدگاه‌های مختلف را مطرح کن، مزایا و معایب احتمالی را بررسی کن، از استدلال مبتنی بر شواهد استفاده کن و به یک نتیجه متعادل برس.",
                    wordCount = 280,
                    hints = "Use hedging expressions, advanced linking words, modal perfect structures, and at least eight vocabulary items from this lesson."
                )
            ),

            quiz = listOf(
                QuizQuestion(
                    question = "Which sentence expresses a strong conclusion about the past?",
                    options = listOf(
                        "They must have misunderstood the instructions.",
                        "They may misunderstand the instructions.",
                        "They should misunderstand the instructions.",
                        "They can misunderstand the instructions."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Choose the correct sentence.",
                    options = listOf(
                        "They should have considered the risks.",
                        "They should have consider the risks.",
                        "They should considered the risks.",
                        "They should to have considered the risks."
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "Which sentence uses inversion correctly?",
                    options = listOf(
                        "Not only the plan failed, but it also cost more.",
                        "Not only did the plan fail, but it also cost more.",
                        "Not only the plan did fail, but it cost more.",
                        "Not only failed the plan, but it cost more."
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "What does 'sustainable' usually mean?",
                    options = listOf(
                        "Able to continue without causing unacceptable long-term damage",
                        "Very expensive",
                        "Impossible to regulate",
                        "Extremely fast"
                    ),
                    correctIndex = 0
                ),
                QuizQuestion(
                    question = "What does 'point out' mean?",
                    options = listOf(
                        "Ignore something",
                        "Mention or draw attention to something",
                        "Remove a possibility",
                        "Finish a project"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which expression is useful for cautious academic language?",
                    options = listOf(
                        "Definitely impossible",
                        "It could potentially",
                        "Everyone knows",
                        "There is no doubt whatsoever"
                    ),
                    correctIndex = 1
                ),
                QuizQuestion(
                    question = "Which sentence contains a cleft structure?",
                    options = listOf(
                        "Technology changes quickly.",
                        "Technology may change society.",
                        "What concerns me most is the lack of evidence.",
                        "People use technology every day."
                    ),
                    correctIndex = 2
                ),
                QuizQuestion(
                    question = "What is a 'double-edged sword'?",
                    options = listOf(
                        "Something that has both advantages and disadvantages",
                        "Something that is completely safe",
                        "A difficult deadline",
                        "A scientific experiment"
                    ),
                    correctIndex = 0
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