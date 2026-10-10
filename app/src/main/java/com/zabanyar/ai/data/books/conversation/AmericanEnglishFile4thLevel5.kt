package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * American English File 4th Edition — Level 5
 * 10 Files × 3 Lessons (A/B/C) + 5 PE + 5 R&C = 40 Lessons | C1 Advanced
 * مکالمه: ۱۸-۲۰ خط
 */
object AmericanEnglishFile4thLevel5 {
    const val BOOK_ID = "american_english_file_4th_level5"

    fun getContent(n: Int): LessonContent = when (n) {
        1 -> f1A(); 2 -> f1B(); 3 -> f1C()
        4 -> pe1(); 5 -> rc12()
        6 -> f2A(); 7 -> f2B(); 8 -> f2C()
        9 -> pe2(); 10 -> rc34()
        11 -> f3A(); 12 -> f3B(); 13 -> f3C()
        14 -> pe3(); 15 -> rc56()
        16 -> f4A(); 17 -> f4B(); 18 -> f4C()
        19 -> pe4(); 20 -> rc78()
        21 -> f5A(); 22 -> f5B(); 23 -> f5C()
        24 -> pe5(); 25 -> rc910()
        26 -> f6A(); 27 -> f6B(); 28 -> f6C()
        29 -> f7A(); 30 -> f7B(); 31 -> f7C()
        32 -> f8A(); 33 -> f8B(); 34 -> f8C()
        35 -> f9A(); 36 -> f9B(); 37 -> f9C()
        38 -> f10A(); 39 -> f10B(); 40 -> f10C()
        else -> LessonContent(BOOK_ID, n, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList())
    }

    private fun base(n: Int, title: String, fa: String,
        obj: List<String>, vocab: List<VocabWord>, gr: List<GrammarSection>,
        dlg: List<DialogueLine>, qz: List<QuizQuestion>,
        idioms: List<IdiomExpression> = emptyList(),
        pron: List<PronunciationTip> = emptyList(),
        cult: List<CulturalNote> = emptyList(),
        mis: List<CommonMistake> = emptyList()
    ) = LessonContent(bookId = BOOK_ID, chapterNumber = n, title = title, titlePersian = fa,
        objectives = obj, vocabulary = vocab, idioms = idioms,
        pronunciationTips = pron, culturalNotes = cult,
        grammar = gr, commonMistakes = mis, conversation = dlg, quiz = qz)

    private fun v(e: String, p: String, ex: String, ep: String, pos: String = "noun") =
        VocabWord(e, p, partOfSpeech = pos, example = ex, examplePersian = ep)
    private fun d(s: String, e: String, p: String) = DialogueLine(s, e, p)
    private fun q(x: String, o: List<String>, c: Int) = QuizQuestion(x, o, c)

    // ═══════════ FILE 1 — Language and identity ═══════════

    private fun f1A() = base(1, "1A The language of communication", "۱A زبان ارتباط",
        listOf(
            "Master subjunctive mood in formal contexts",
            "Discuss language and thought",
            "Analyse linguistic relativity"
        ),
        listOf(
            v("linguistic", "زبانی", "Linguistic diversity.", "تنوع زبانی.", "adjective"),
            v("relativity", "نسبیت", "Linguistic relativity.", "نسبیت زبانی."),
            v("cognitive", "شناختی", "Cognitive linguistics.", "زبان‌شناسی شناختی.", "adjective"),
            v("articulate", "بیان کردن", "Articulate complex ideas.", "ایده‌های پیچیده را بیان کن.", "verb"),
            v("discourse", "گفتمان", "Political discourse.", "گفتمان سیاسی."),
            v("pragmatic", "عمل‌گرایانه", "Pragmatic meaning.", "معنای عمل‌گرایانه.", "adjective"),
            v("connotation", "بار معنایی", "Cultural connotations.", "بار معنایی فرهنگی."),
            v("denotation", "معنای لفظی", "The denotation of a word.", "معنای لفظی یک کلمه."),
            v("semantic", "معنایی", "Semantic shift.", "تغییر معنایی.", "adjective"),
            v("syntax", "نحو", "Complex syntax.", "نحو پیچیده."),
            v("morphology", "صرف", "Word morphology.", "صرف کلمه."),
            v("code-switch", "تغییر زبان", "Code-switching in bilinguals.", "تغییر زبان در دوزبانه‌ها.", "verb")
        ),
        listOf(
            GrammarSection("Subjunctive mood", "I suggest that he be present. It is essential that she attend. The committee recommends that the policy be revised."),
            GrammarSection("Formal alternatives", "I would suggest... It would be advisable... One might argue..."),
            GrammarSection("Impersonal formal structures", "It is imperative that... It is vital that... It should be noted that...")
        ),
        listOf(
            d("A", "Do you subscribe to the Sapir-Whorf hypothesis — that language shapes thought?", "آیا به فرضیه ساپیر-ورف اعتقاد داری — اینکه زبان اندیشه را شکل می‌دهد؟"),
            d("B", "To some extent, though it's been heavily revised. The strong version — that language determines thought — is now largely rejected.", "تا حدی، هرچند به شدت بازنگری شده. نسخه قوی — اینکه زبان اندیشه را تعیین می‌کند — الان تا حد زیادی رد شده."),
            d("A", "And the weak version?", "و نسخه ضعیف؟"),
            d("B", "The weak version — that language influences certain cognitive processes — has considerable empirical support.", "نسخه ضعیف — اینکه زبان بر فرآیندهای شناختی خاصی تأثیر می‌گذارد — پشتیبانی تجربی قابل توجهی دارد."),
            d("A", "Could you give a concrete example?", "مثال مشخصی می‌زنی؟"),
            d("B", "Certainly. Some languages have no distinct words for blue and green. Speakers of those languages tend to perceive them as shades of the same colour.", "قطعاً. بعضی زبان‌ها کلمات متمایزی برای آبی و سبز ندارند. گویشوران آن زبان‌ها تمایل دارند آنها را به عنوان سایه‌های یک رنگ درک کنند."),
            d("A", "Fascinating. So our vocabulary constrains what we notice?", "جذاب. پس واژگان‌مان محدود می‌کند چه چیزی را متوجه می‌شویم؟"),
            d("B", "Precisely. It is essential that we recognise how profoundly language shapes perception.", "دقیقاً. ضروری است که تشخیص دهیم زبان چقدر عمیقاً ادراک را شکل می‌دهد."),
            d("A", "Do you think this has political implications?", "فکر می‌کنی پیامدهای سیاسی دارد؟"),
            d("B", "Undoubtedly. I would argue that whoever controls the discourse controls the debate. Framing is everything.", "بدون شک. استدلال می‌کنم هر کس گفتمان را کنترل کند، بحث را کنترل می‌کند. چارچوب‌بندی همه چیز است."),
            d("A", "Could you elaborate?", "می‌توانی توضیح دهی؟"),
            d("B", "Consider the phrase 'tax relief'. It presupposes that taxation is a burden from which one needs relief. The framing has already done the persuasion.", "عبارت 'کاهش مالیات' را در نظر بگیر. پیش‌فرض می‌گیرد که مالیات باری‌ست که نیاز به تسکین دارد. چارچوب‌بندی قبلاً متقاعدسازی را انجام داده."),
            d("A", "That's a compelling point. Do you think linguists have a responsibility to expose this?", "نکته قانع‌کننده‌ای‌ست. فکر می‌کنی زبان‌شناسان مسئولیت افشای این را دارند؟"),
            d("B", "I would suggest that all of us do. It is crucial that citizens develop critical language awareness.", "پیشنهاد می‌کنم همه ما داریم. حیاتی‌ست که شهروندان آگاهی زبانی انتقادی را توسعه دهند."),
            d("A", "How might that be achieved?", "چطور می‌توان به آن دست یافت؟"),
            d("B", "It is vital that media literacy be taught from an early age. Critical discourse analysis should be a core component.", "حیاتی‌ست که سواد رسانه‌ای از سنین پایین آموزش داده شود. تحلیل انتقادی گفتمان باید جزء اصلی باشد."),
            d("A", "Do you think our own conversation is being shaped by such dynamics?", "فکر می‌کنی مکالمه خودمان هم توسط چنین پویایی‌هایی شکل می‌گیرد؟"),
            d("B", "Inevitably. It's turtles all the way down. The moment we discuss the phenomenon, we're enacting it.", "اجتناب‌ناپذیر. تا بی‌نهایت ادامه دارد. لحظه‌ای که درباره پدیده بحث می‌کنیم، در حال اجرای آن هستیم."),
            d("A", "A fitting paradox to end on.", "پارادوکس مناسبی برای پایان.")
        ),
        listOf(
            q("Which version of Sapir-Whorf is largely rejected?", listOf("weak", "strong", "both"), 1),
            q("What does 'tax relief' presuppose?", listOf("taxes are good", "taxes are a burden", "taxes are optional"), 1),
            q("It is essential that he ___ present.", listOf("is", "be", "was"), 1),
            q("I suggest that she ___ the meeting.", listOf("attends", "attend", "attended"), 1)
        ),
        idioms = listOf(
            IdiomExpression("To some extent", "تا حدی", "To some extent, yes.", "تا حدی، بله."),
            IdiomExpression("Turtles all the way down", "تا بی‌نهایت ادامه دارد", "Turtles all the way down.", "تا بی‌نهایت ادامه دارد."),
            IdiomExpression("Fitting paradox", "پارادوکس مناسب", "A fitting paradox.", "پارادوکس مناسب.")
        ),
        pron = listOf(
            PronunciationTip("Subjunctive", "The subjunctive 'be' is unstressed: It is essential that he be PRESent. The stress is on the main verb.")
        ),
        cult = listOf(
            CulturalNote("Linguistic relativism", "The Sapir-Whorf hypothesis has been revived by cognitive scientists studying colour perception, time, and spatial reasoning.")
        ),
        mis = listOf(
            CommonMistake("It is essential that he is present.", "It is essential that he be present.", "Subjunctive after 'essential that'."),
            CommonMistake("I suggest that she attends.", "I suggest that she attend.", "Base form in subjunctive.")
        )
    )

    private fun f1B() = base(2, "1B Bilingualism and identity", "۱B دوزبانگی و هویت",
        listOf(
            "Use inversion for rhetorical effect",
            "Discuss bilingual identity",
            "Analyse cultural hybridity"
        ),
        listOf(
            v("bilingual", "دوزبانه", "Bilingual education.", "آموزش دوزبانه.", "adjective"),
            v("bicultural", "دوفرهنگی", "Bicultural identity.", "هویت دوفرهنگی.", "adjective"),
            v("hybridity", "ترکیبی‌بودن", "Cultural hybridity.", "ترکیبی‌بودن فرهنگی."),
            v("assimilate", "جذب شدن", "Assimilation pressure.", "فشار جذب.", "verb"),
            v("heritage speaker", "گویشور میراثی", "A heritage speaker of Spanish.", "گویشور میراثی اسپانیایی."),
            v("code-switch", "تغییر زبان", "Rapid code-switching.", "تغییر زبان سریع.", "verb"),
            v("acculturation", "فرهنگ‌پذیری", "Acculturation stress.", "استرس فرهنگ‌پذیری."),
            v("intergenerational", "بین‌نسلی", "Intergenerational transmission.", "انتقال بین‌نسلی.", "adjective"),
            v("linguistic", "زبانی", "Linguistic heritage.", "میراث زبانی.", "adjective"),
            v("roots", "ریشه‌ها", "Cultural roots.", "ریشه‌های فرهنگی."),
            v("authenticity", "اصالت", "A question of authenticity.", "سؤال اصالت."),
            v("negotiate", "مذاکره کردن", "Negotiate identity.", "هویت را مذاکره کن.", "verb")
        ),
        listOf(
            GrammarSection("Inversion for rhetorical effect", "Rarely does one encounter such linguistic dexterity. Not only does she speak three languages, but she also thinks in them."),
            GrammarSection("Inversion with conditionals", "Were I bilingual, I would perceive the world differently. Had I been raised bilingually, my cognition would differ."),
            GrammarSection("Negative inversion", "Never have I felt entirely at home in either language. Under no circumstances should one abandon one's mother tongue.")
        ),
        listOf(
            d("A", "You mentioned you're bilingual. How does that shape your sense of self?", "گفتی دوزبانه‌ای. چطور حس خودت را شکل می‌دهد؟"),
            d("B", "Profoundly. Rarely does one feel entirely at home in a single linguistic identity.", "عمیقاً. به ندرت کسی در یک هویت زبانی واحد کاملاً احساس خانه بودن می‌کند."),
            d("A", "Do you feel you have two distinct selves?", "حس می‌کنی دو خودِ متمایز داری؟"),
            d("B", "Not two, exactly, but a continuum. Were I speaking Mandarin, I would be more reserved. In English, more direct.", "دقیقاً دو تا نه، ولی یک پیوستار. اگر ماندارین صحبت کنم، محتاط‌تر می‌شوم. به انگلیسی، مستقیم‌تر."),
            d("A", "That's fascinating. Do others notice?", "جذابه. دیگران متوجه می‌شوند؟"),
            d("B", "Constantly. My closest friends have remarked that I have different personalities in each language.", "مدام. نزدیک‌ترین دوستانم اشاره کرده‌اند که در هر زبان شخصیت‌های متفاوتی دارم."),
            d("A", "Do you consider one language more authentic to you?", "یکی از زبان‌ها را اصیل‌تر به خودت می‌دانی؟"),
            d("B", "Seldom do I think in those terms. Both are authentic, in different ways. My Mandarin holds my childhood. My English holds my ambitions.", "به ندرت به آن صورت فکر می‌کنم. هر دو اصیلند، به روش‌های متفاوت. ماندارین‌ام کودکی‌ام را نگه می‌دارد. انگلیسی‌ام جاه‌طلبی‌هایم را."),
            d("A", "Have you ever felt pressured to abandon one?", "هرگز تحت فشار بوده‌ای یکی را رها کنی؟"),
            d("B", "As a child, occasionally. Assimilation pressure can be intense. Under no circumstances should one yield to it, in my view.", "در کودکی، گاهی. فشار جذب می‌تواند شدید باشد. به نظر من تحت هیچ شرایطی نباید تسلیمش شد."),
            d("A", "What advice would you give to heritage speakers?", "چه توصیه‌ای به گویشوران میراثی می‌دادی؟"),
            d("B", "I would advise them that their language is not a burden but an asset. Rarely do monolinguals appreciate what we have.", "توصیه می‌کنم زبانشان بار نیست بلکه سرمایه است. به ندرت تک‌زبانه‌ها آنچه ما داریم را درک می‌کنند."),
            d("A", "Do you plan to pass it on?", "قصد داری منتقلش کنی؟"),
            d("B", "Absolutely. Not only will my children learn Mandarin, but they will also learn why it matters.", "قطعاً. نه تنها فرزندانم ماندارین یاد خواهند گرفت، بلکه یاد خواهند گرفت چرا مهم است."),
            d("A", "What about code-switching? Is it a sign of linguistic deficiency?", "تغییر زبان چطور؟ نشانه نقص زبانی‌ست؟"),
            d("B", "Absolutely not. It is a sophisticated skill, requiring mastery of both systems.", "قطعاً نه. مهارت پیچیده‌ای‌ست که مستلزم تسلط بر هر دو سیستم است."),
            d("A", "Some linguists argue it reflects a hybrid identity.", "بعضی زبان‌شناسان استدلال می‌کنند بازتاب هویت ترکیبی‌ست."),
            d("B", "I concur. Bilinguals do not inhabit two monocultures but a unique third space.", "موافقم. دوزبانه‌ها در دو تک‌فرهنگ ساکن نیستند، بلکه در یک فضای سوم منحصربه‌فرد."),
            d("A", "Do you consider yourself bicultural as well?", "خودت را دوفرهنگی هم می‌دانی؟"),
            d("B", "Increasingly so. Not only do I navigate two cultures, but I also blend them creatively.", "بیشتر و بیشتر. نه تنها در دو فرهنگ حرکت می‌کنم، بلکه خلاقانه ترکیبشان می‌کنم."),
            d("A", "A beautiful synthesis.", "سنتز زیبایی.")
        ),
        listOf(
            q("How does B describe their sense of self?", listOf("two selves", "a continuum", "monolingual"), 1),
            q("What pressure did B face as a child?", listOf("to learn", "assimilation", "bilingualism"), 1),
            q("Rarely ___ one feel entirely at home.", listOf("do", "does", "did"), 1),
            q("Were I bilingual, I ___ perceive differently.", listOf("will", "would", "am"), 1)
        ),
        idioms = listOf(
            IdiomExpression("In those terms", "به آن صورت", "Seldom do I think in those terms.", "به ندرت به آن صورت فکر می‌کنم."),
            IdiomExpression("Third space", "فضای سوم", "A unique third space.", "فضای سوم منحصربه‌فرد."),
            IdiomExpression("I concur", "موافقم", "I concur.", "موافقم.")
        ),
        pron = listOf(
            PronunciationTip("Inversion stress", "The auxiliary is stressed in inversion: RARELY do one feel. NOT ONLY does she speak, but...")
        ),
        cult = listOf(
            CulturalNote("Bilingual identity", "Research shows bilinguals often report feeling different in each language. This is called 'language-dependent personality shift'.")
        ),
        mis = listOf(
            CommonMistake("Rarely one feels at home.", "Rarely does one feel at home.", "Inversion after negative."),
            CommonMistake("Were I am bilingual.", "Were I bilingual.", "No 'am' in inversion.")
        )
    )

    private fun f1C() = base(3, "1C Language death and revival", "۱C مرگ و احیای زبان",
        listOf(
            "Use participle clauses for concision",
            "Discuss language endangerment",
            "Analyse revitalization efforts"
        ),
        listOf(
            v("endangered", "در خطر", "Endangered languages.", "زبان‌های در خطر.", "adjective"),
            v("moribund", "مرده", "A moribund dialect.", "گویش مرده.", "adjective"),
            v("revitalization", "احیاء", "Language revitalization.", "احیای زبان."),
            v("documentation", "مستندسازی", "Language documentation.", "مستندسازی زبان."),
            v("speaker", "گویشور", "Native speakers.", "گویشوران بومی."),
            v("transmission", "انتقال", "Intergenerational transmission.", "انتقال بین‌نسلی."),
            v("reclaim", "بازپس گرفتن", "Reclaim the language.", "زبان را بازپس بگیر.", "verb"),
            v("immersion", "غوطه‌وری", "Immersion programs.", "برنامه‌های غوطه‌وری."),
            v("revive", "احیا کردن", "Revive a language.", "زبانی را احیا کن.", "verb"),
            v("extinct", "منقرض", "Extinct languages.", "زبان‌های منقرض.", "adjective"),
            v("narrative", "روایت", "Oral narratives.", "روایت‌های شفاهی."),
            v("archive", "بایگانی", "Digital archives.", "بایگانی‌های دیجیتال.")
        ),
        listOf(
            GrammarSection("Participle clauses", "Having been suppressed for decades, the language is now being revived. Facing extinction, communities have launched immersion programs."),
            GrammarSection("Perfect participle", "Having lost most of its speakers, the language survives only in written records."),
            GrammarSection("Reduced relatives", "The elders preserving these traditions are the last generation. Languages spoken by fewer than 100 people...")
        ),
        listOf(
            d("A", "How severe is the language extinction crisis?", "بحران انقراض زبان چقدر شدید است؟"),
            d("B", "Dire. Having documented the situation extensively, linguists estimate that half of the world's 7,000 languages will disappear this century.", "وخیم. زبان‌شناسان با مستندسازی گسترده وضعیت، تخمین می‌زنند نیمی از ۷۰۰۰ زبان جهان در این قرن ناپدید شوند."),
            d("A", "What drives the loss?", "چه چیزی این از دست رفتن را هدایت می‌کند؟"),
            d("B", "Multiple forces. Urbanization, economic pressure, and — crucially — the decision of parents to raise children in dominant languages.", "نیروهای متعدد. شهرنشینی، فشار اقتصادی، و — حیاتی‌تر از همه — تصمیم والدین به بزرگ کردن فرزندان به زبان‌های غالب."),
            d("A", "Is it reversible?", "قابل برگشت است؟"),
            d("B", "In some cases. Hebrew is the classic example. Having been liturgical-only for centuries, it was successfully revived as a spoken vernacular.", "در بعضی موارد. عبری مثال کلاسیک است. با وجود اینکه قرن‌ها فقط در عبادت به کار می‌رفت، به عنوان زبان گفتاری روزمره با موفقیت احیا شد."),
            d("A", "What lessons does that offer?", "چه درس‌هایی می‌دهد؟"),
            d("B", "The key lesson, having analysed the Israeli case, is that political will and educational infrastructure are paramount.", "درس کلیدی، با تحلیل مورد اسرائیل، این است که اراده سیاسی و زیرساخت آموزشی حیاتی‌اند."),
            d("A", "What about Welsh and Māori?", "ولزی و مائوری چطور؟"),
            d("B", "Both are remarkable success stories. Having faced near-certain extinction, they've been partially revitalized through immersion schools.", "هر دو داستان‌های موفقیت قابل توجهی هستند. با مواجهه با انقراض تقریباً قطعی، از طریق مدارس غوطه‌وری تا حدی احیا شده‌اند."),
            d("A", "What obstacles remain?", "چه موانعی باقی مانده؟"),
            d("B", "Generational transmission. Having taught the language in schools, communities still struggle to make it the language of the home.", "انتقال نسلی. با آموزش زبان در مدارس، جوامع هنوز برای تبدیل آن به زبان خانه تلاش می‌کنند."),
            d("A", "Do you think digital technology helps?", "فکر می‌کنی فناوری دیجیتال کمک می‌کند؟"),
            d("B", "Immensely. Having been limited to oral transmission for millennia, endangered languages can now be archived, taught, and used online.", "بی‌نهایت. با محدود بودن به انتقال شفاهی برای هزاران سال، زبان‌های در خطر الان می‌توانند بایگانی، آموزش داده و آنلاین استفاده شوند."),
            d("A", "Is there a risk of tokenism?", "خطر نمادین بودن هست؟"),
            d("B", "Always. Having an app is not the same as having a community. Unless the language is used daily, digital tools are insufficient.", "همیشه. داشتن اپ همانند داشتن جامعه نیست. مگر اینکه زبان روزانه استفاده شود، ابزارهای دیجیتال ناکافی‌اند."),
            d("A", "What is lost when a language dies?", "وقتی زبانی می‌میرد چه از دست می‌رود؟"),
            d("B", "Having asked that question myself for years, I've come to believe that we lose an entire way of perceiving reality.", "با پرسیدن آن سؤال برای سال‌ها، به این باور رسیده‌ام که کل یک روش درک واقعیت را از دست می‌دهیم."),
            d("A", "Could you give a specific example?", "مثال مشخصی می‌زنی؟"),
            d("B", "Consider the Guugu Yimithirr of Australia. Having no words for 'left' or 'right', they use absolute compass directions for everything.", "قبیله گوگو ییمیثیر استرالیا را در نظر بگیر. چون کلمه‌ای برای 'چپ' یا 'راست' ندارند، برای همه چیز از جهت‌های مطلق قطب‌نما استفاده می‌کنند."),
            d("A", "Extraordinary. What does that reveal?", "فوق‌العاده. چه چیزی را آشکار می‌کند؟"),
            d("B", "That human cognition is far more malleable than we assume. Having studied such cases, one cannot help but be humbled.", "اینکه شناخت انسان بسیار انعطاف‌پذیرتر از آنچه فرض می‌کنیم است. با مطالعه چنین مواردی، آدم نمی‌تواند متواضع نباشد."),
            d("A", "A profound observation to conclude on.", "مشاهده عمیقی برای نتیجه‌گیری.")
        ),
        listOf(
            q("How many languages will disappear this century?", listOf("quarter", "half", "most"), 1),
            q("Which language was successfully revived?", listOf("Welsh", "Hebrew", "Māori"), 1),
            q("___ documented the situation, linguists estimate...", listOf("Having", "Have", "Has"), 0),
            q("Languages ___ by fewer than 100 people...", listOf("speaking", "spoken", "speak"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Dire", "وخیم", "The situation is dire.", "وضعیت وخیم است."),
            IdiomExpression("Come to believe", "به این باور رسیدن", "I've come to believe...", "به این باور رسیده‌ام..."),
            IdiomExpression("Cannot help but", "نمی‌تواند جز", "Cannot help but be humbled.", "نمی‌تواند جز متواضع بودن.")
        ),
        pron = listOf(
            PronunciationTip("Participle clauses", "Perfect participle is common in academic speech: HAVing been documented... The 'having' is unstressed.")
        ),
        cult = listOf(
            CulturalNote("Language revitalization", "Māori immersion schools (Kōhanga Reo) have become a model worldwide. Welsh is now co-official in Wales.")
        ),
        mis = listOf(
            CommonMistake("Having document the situation.", "Having documented the situation.", "Past participle after having."),
            CommonMistake("Languages speaking by few people.", "Languages spoken by few people.", "Passive participle.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 1 ═══════════

    private fun pe1() = base(4, "PE1 An academic conference", "انگلیسی کاربردی ۱ — کنفرانس دانشگاهی",
        listOf(
            "Participate in academic discussions",
            "Present research formally",
            "Handle scholarly criticism"
        ),
        listOf(
            v("abstract", "چکیده", "Submit an abstract.", "چکیده ارسال کن."),
            v("peer review", "داوری همتا", "Peer-reviewed journal.", "مجله داوری‌شده."),
            v("methodology", "روش‌شناسی", "Rigorous methodology.", "روش‌شناسی دقیق."),
            v("empirical", "تجربی", "Empirical evidence.", "شواهد تجربی.", "adjective"),
            v("correlation", "همبستگی", "Positive correlation.", "همبستگی مثبت."),
            v("causation", "علیت", "Correlation is not causation.", "همبستگی علیت نیست."),
            v("paradigm", "پارادایم", "A paradigm shift.", "تغییر پارادایم."),
            v("replicate", "تکرار کردن", "Replicate the study.", "مطالعه را تکرار کن.", "verb"),
            v("rigorous", "دقیق", "Rigorous analysis.", "تحلیل دقیق.", "adjective"),
            v("novel", "نو", "A novel approach.", "رویکرد نو.", "adjective"),
            v("plausible", "محتمل", "A plausible explanation.", "توضیح محتمل.", "adjective")
        ),
        listOf(
            GrammarSection("Academic hedging", "The data suggest... It would appear that... There is reason to believe..."),
            GrammarSection("Formal criticism", "One might question whether... It could be argued that... The findings are not without limitations."),
            GrammarSection("Response to criticism", "That is a fair point. I would concede that... However, one should note that...")
        ),
        listOf(
            d("A", "Thank you for your presentation. I have a question regarding your methodology.", "ممنون از ارائه‌تان. سؤالی درباره روش‌شناسی‌تان دارم."),
            d("B", "Certainly. I welcome the scrutiny.", "قطعاً. از بررسی استقبال می‌کنم."),
            d("A", "You report a strong correlation between language exposure and cognitive flexibility. But correlation, as we know, is not causation.", "شما همبستگی قوی بین مواجهه زبانی و انعطاف شناختی گزارش می‌دهید. ولی همبستگی، همانطور که می‌دانیم، علیت نیست."),
            d("B", "That is a fair point, and I anticipated it. We controlled for confounding variables — socioeconomic status, parental education, and prior cognitive testing.", "نکته منصفانه‌ای‌ست، و پیش‌بینی‌اش را کرده بودم. متغیرهای مخدوش را کنترل کردیم — وضعیت اقتصادی-اجتماعی، تحصیلات والدین، و آزمون شناختی قبلی."),
            d("A", "Nevertheless, one might question whether the sample is representative.", "با این حال، ممکن است کسی زیر سؤال ببرد که آیا نمونه معرف است."),
            d("B", "I would concede that the sample skews urban and middle-class. It's a limitation we acknowledge explicitly in the paper.", "می‌پذیرم که نمونه به سمت شهری و طبقه متوسط متمایل است. محدودیتی‌ست که صریحاً در مقاله تصدیق می‌کنیم."),
            d("A", "Could the findings be replicated?", "یافته‌ها قابل تکرارند؟"),
            d("B", "Preliminary attempts suggest so. It would appear the effect is robust across similar populations.", "تلاش‌های اولیه چنین نشان می‌دهند. به نظر می‌رسد اثر در جمعیت‌های مشابه قوی است."),
            d("A", "What of the theoretical framework? Are you working within a Chomskyan paradigm?", "درباره چارچوب نظری چطور؟ در پارادایم چامسکیایی کار می‌کنید؟"),
            d("B", "Not strictly. I draw on both generative and usage-based approaches. Rigid adherence to a single paradigm would be limiting.", "دقیقاً نه. از رویکردهای زایشی و کاربرد-بنیاد هر دو استفاده می‌کنم. پایبندی سخت به یک پارادایم واحد محدودکننده خواهد بود."),
            d("A", "Some would argue that eclecticism sacrifices theoretical coherence.", "بعضی استدلال می‌کنند التقاط، انسجام نظری را قربانی می‌کند."),
            d("B", "One could argue that, yes. But I would counter that the phenomena resist simple categorization.", "می‌توان استدلال کرد، بله. ولی پاسخ می‌دهم که پدیده‌ها در برابر دسته‌بندی ساده مقاومت می‌کنند."),
            d("A", "Have you submitted to a peer-reviewed journal?", "به مجله داوری‌شده ارسال کرده‌اید؟"),
            d("B", "Yes. It's currently under review. We expect feedback within the quarter.", "بله. الان در حال بررسی است. انتظار بازخورد در این فصل را داریم."),
            d("A", "I look forward to reading it. Would you be willing to share the data?", "منتظر خواندنش هستم. مایل به اشتراک داده‌ها هستید؟"),
            d("B", "Under certain conditions, yes. One must be careful with participant confidentiality.", "تحت شرایط خاصی، بله. باید با محرمانگی شرکت‌کنندگان مراقب بود."),
            d("A", "Of course. Thank you for a stimulating discussion.", "البته. ممنون از بحث برانگیزنده."),
            d("B", "The pleasure is mine. Such exchanges are, after all, how knowledge progresses.", "باعث افتخار من است. چنین تبادلاتی، بعد از همه، نحوه پیشرفت دانش است.")
        ),
        listOf(
            q("What did A question?", listOf("grammar", "methodology", "vocabulary"), 1),
            q("What did B acknowledge?", listOf("no limitations", "sample skews urban", "perfect data"), 1),
            q("One might question ___ the sample is representative.", listOf("that", "whether", "if"), 1),
            q("I would ___ that it's a limitation.", listOf("concede", "conceding", "conceded"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Fair point", "نکته منصفانه", "That's a fair point.", "نکته منصفانه‌ای‌ست."),
            IdiomExpression("Under review", "در حال بررسی", "Currently under review.", "الان در حال بررسی."),
            IdiomExpression("The pleasure is mine", "باعث افتخار من است", "The pleasure is mine.", "باعث افتخار من است.")
        ),
        pron = listOf(
            PronunciationTip("Academic hedging", "Hedging phrases are usually unstressed: it would APpear that... The stress is on the main content.")
        ),
        cult = listOf(
            CulturalNote("Academic discourse", "Peer review is the cornerstone of scholarly publishing. In some fields, preprints (arXiv, bioRxiv) are common before peer review.")
        ),
        mis = listOf(
            CommonMistake("One might question that the sample.", "One might question whether the sample...", "Whether for yes/no alternatives."),
            CommonMistake("I would concede that.", "I would concede that the sample is limited.", "Complete the clause.")
        )
    )

    // ═══════════ REVIEW 1 ═══════════

    private fun rc12() = base(5, "R&C 1&2", "مرور ۱ و ۲",
        listOf("Review subjunctive", "Review inversion", "Review participle clauses"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("synthesize", "ترکیب کردن", "Synthesize grammar.", "گرامر را ترکیب کن.", "verb"),
            v("consolidate", "تثبیت کردن", "Consolidate learning.", "یادگیری را تثبیت کن.", "verb"),
            v("mastery", "تسلط", "Toward mastery.", "به سمت تسلط."),
            v("precision", "دقت", "Linguistic precision.", "دقت زبانی."),
            v("register", "لحن", "Formal register.", "لحن رسمی.")
        ),
        listOf(
            GrammarSection("Subjunctive mood", "It is essential that he be. I suggest that she attend."),
            GrammarSection("Inversion", "Rarely do we... Never have I... Were I... Had I..."),
            GrammarSection("Participle clauses", "Having studied... Facing extinction... The elders preserving...")
        ),
        listOf(
            d("T", "Let us review. The subjunctive is often neglected, yet it is essential that it be mastered.", "بیایید مرور کنیم. وجه شرطی اغلب نادیده گرفته می‌شود، ولی ضروری‌ست که تسلط یابد."),
            d("A", "It is crucial that learners recognize its use in formal registers.", "حیاتی‌ست که زبان‌آموزان کاربردش را در لحن‌های رسمی تشخیص دهند."),
            d("B", "I would recommend that they practice it with verbs like 'suggest', 'recommend', 'insist'.", "توصیه می‌کنم با افعالی مثل 'suggest'، 'recommend'، 'insist' تمرینش کنند."),
            d("T", "Excellent. Inversion?", "عالی. وارونگی؟"),
            d("A", "Rarely do we encounter such sophisticated structures in everyday speech.", "به ندرت در گفتار روزمره با چنین ساختارهای پیچیده‌ای مواجه می‌شویم."),
            d("B", "Never have I seen a class progress so rapidly.", "هرگز ندیده‌ام کلاسی اینقدر سریع پیشرفت کند."),
            d("T", "Very good. Participle clauses?", "خیلی خوب. بندهای وجه وصفی؟"),
            d("A", "Having studied English for years, they now think in it.", "با مطالعه انگلیسی برای سال‌ها، الان به آن فکر می‌کنند."),
            d("B", "Facing a challenging exam, they prepared meticulously.", "با مواجهه با امتحانی چالش‌برانگیز، دقیق آماده شدند."),
            d("T", "You have grasped these structures admirably. It is vital that such mastery be maintained.", "این ساختارها را ستودنی درک کرده‌اید. حیاتی‌ست که چنین تسلطی حفظ شود."),
            d("A", "We shall continue to refine our usage.", "به پالایش کاربردمان ادامه خواهیم داد."),
            d("B", "Not only will we refine it, but we will also teach it.", "نه تنها پالایشش می‌کنیم، بلکه آموزشش هم می‌دهیم."),
            d("T", "That is the mark of true mastery.", "این نشانه تسلط واقعی‌ست."),
            d("A", "Thank you for your guidance.", "ممنون از راهنمایی‌تان."),
            d("T", "You are most welcome.", "خواهش می‌کنم.")
        ),
        listOf(
            q("Which verb takes subjunctive?", listOf("is", "be", "was"), 1),
            q("Inversion after which word?", listOf("often", "rarely", "usually"), 1),
            q("It is essential that he ___ present.", listOf("is", "be", "was"), 1),
            q("Rarely ___ we encounter such structures.", listOf("do", "does", "did"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Mark of true mastery", "نشانه تسلط واقعی", "That is the mark of true mastery.", "این نشانه تسلط واقعی‌ست.")
        ),
        pron = listOf(
            PronunciationTip("Formal register", "Formal English uses full forms: 'It is' not 'it's' in academic speech.")
        ),
        cult = listOf(
            CulturalNote("Subjunctive usage", "The English subjunctive survives mostly in formal, academic, and legal registers. American English retains it more than British.")
        ),
        mis = listOf(
            CommonMistake("It is essential that he is present.", "It is essential that he be present.", "Subjunctive after 'essential that'."),
            CommonMistake("Rarely we encounter.", "Rarely do we encounter.", "Inversion required.")
        )
    )

    // ═══════════ FILE 2 — Ethics and morality ═══════════

    private fun f2A() = base(6, "2A Moral dilemmas", "۲A دوراهی‌های اخلاقی",
        listOf(
            "Use unreal past for hypotheticals",
            "Discuss ethical philosophy",
            "Analyse moral frameworks"
        ),
        listOf(
            v("dilemma", "دوراهی", "A moral dilemma.", "دوراهی اخلاقی."),
            v("utilitarian", "فایده‌گرا", "Utilitarian ethics.", "اخلاق فایده‌گرایانه.", "adjective"),
            v("deontological", "وظیفه‌گرا", "Deontological reasoning.", "استدلال وظیفه‌گرایانه.", "adjective"),
            v("consequentialist", "پیامدگرا", "Consequentialist approach.", "رویکرد پیامدگرا.", "adjective"),
            v("virtue", "فضیلت", "Virtue ethics.", "اخلاق فضیلت."),
            v("autonomy", "استقلال", "Personal autonomy.", "استقلال شخصی."),
            v("beneficence", "احسان", "The principle of beneficence.", "اصل احسان."),
            v("dignity", "کرامت", "Human dignity.", "کرامت انسانی."),
            v("integrity", "صداقت", "Personal integrity.", "صداقت شخصی."),
            v("moral hazard", "خطر اخلاقی", "Moral hazard.", "خطر اخلاقی."),
            v("principle", "اصل", "Moral principles.", "اصول اخلاقی."),
            v("imperative", "حکم", "The categorical imperative.", "حکم مقوله‌ای.")
        ),
        listOf(
            GrammarSection("Unreal past", "If I were in his position, I would have acted differently. Were it not for the consequences, I'd have intervened."),
            GrammarSection("Third conditional with counterfactual", "Had I known the outcome, I would never have consented."),
            GrammarSection("Wishes and regrets", "I wish I had had the courage to object. If only one could know in advance.")
        ),
        listOf(
            d("A", "Consider the classic trolley problem. Would you divert the trolley to save five, killing one?", "مسئله کلاسیک ترالی را در نظر بگیر. واگن را منحرف می‌کردی تا پنج نفر را نجات دهی، و یک نفر کشته شود؟"),
            d("B", "Utilitarian calculus would say yes. But I find the framing troubling.", "محاسبه فایده‌گرایانه می‌گوید بله. ولی چارچوب‌بندی را نگران‌کننده می‌یابم."),
            d("A", "In what way?", "از چه نظر؟"),
            d("B", "It presumes we can quantify human worth. If one accepted that premise, one would be endorsing a very dangerous logic.", "فرض می‌گیرد می‌توانیم ارزش انسانی را کمّی کنیم. اگر آن مقدمه را بپذیریم، منطق بسیار خطرناکی را تأیید می‌کنیم."),
            d("A", "So you'd lean toward a deontological approach?", "پس به سمت رویکرد وظیفه‌گرا متمایل می‌شوی؟"),
            d("B", "Not entirely. Pure deontology, in my view, ignores consequences in a way that is morally irresponsible.", "کاملاً نه. به نظر من، وظیفه‌گرایی محض، پیامدها را به شیوه‌ای غیرمسئولانه نادیده می‌گیرد."),
            d("A", "So where do you stand?", "پس موضعت چیه؟"),
            d("B", "I would characterize myself as a rule consequentialist. Rules matter, but their justification is ultimately grounded in outcomes.", "خودم را پیامدگرای قاعده‌محور توصیف می‌کنم. قواعد مهم‌اند، ولی توجیه‌شان نهایتاً بر پیامدها استوار است."),
            d("A", "How would that apply to the trolley problem?", "چطور به مسئله ترالی اعمال می‌شود؟"),
            d("B", "Were it a one-off, I would divert the trolley. But in a real-world policy context, I would worry about slippery slopes.", "اگر یک بار بود، واگن را منحرف می‌کردم. ولی در زمینه سیاست واقعی، نگران دامنه لغزشی می‌شوم."),
            d("A", "That's a sophisticated position. What about moral autonomy?", "موضع پیچیده‌ای‌ست. استقلال اخلاقی چطور؟"),
            d("B", "I hold autonomy sacred. Had I been in a position to advise, I would have insisted on informed consent.", "استقلال را مقدس می‌دانم. اگر در موقعیتی برای مشاوره بودم، بر رضایت آگاهانه اصرار می‌کردم."),
            d("A", "But what if the person is not competent to consent?", "ولی اگر فرد صلاحیت رضایت نداشته باشد؟"),
            d("B", "Then we have a genuine dilemma, one that cannot be resolved by appeal to a single principle.", "پس دوراهی واقعی داریم، که با توسل به یک اصل واحد نمی‌توان حلش کرد."),
            d("A", "How do ethics committees handle such cases?", "کمیته‌های اخلاق چطور چنین مواردی را مدیریت می‌کنند؟"),
            d("B", "Through deliberation, precedent, and often, tradition. If only there were a formula — but there isn't.", "از طریق مشورت، رویه، و اغلب، سنت. کاش فرمولی بود — ولی نیست."),
            d("A", "Do you think our moral intuitions are reliable?", "فکر می‌کنی شهودهای اخلاقی ما قابل اعتمادند؟"),
            d("B", "Only partially. Empirical moral psychology, having studied this extensively, reveals our intuitions are often inconsistent.", "فقط تا حدی. روانشناسی اخلاقی تجربی، با مطالعه گسترده این موضوع، نشان می‌دهد شهودهای ما اغلب ناسازگارند."),
            d("A", "So philosophy is essential?", "پس فلسفه ضروری‌ست؟"),
            d("B", "Absolutely. It is essential that we think rigorously about these matters. Otherwise we default to cultural habit.", "قطعاً. حیاتی‌ست که به طور دقیق درباره این مسائل فکر کنیم. وگرنه به عادت فرهنگی برمی‌گردیم."),
            d("A", "A fitting conclusion.", "نتیجه‌گیری مناسبی.")
        ),
        listOf(
            q("What is the trolley problem about?", listOf("trains", "moral choice", "physics"), 1),
            q("What does B identify as?", listOf("utilitarian", "rule consequentialist", "deontologist"), 1),
            q("Had I known, I ___ never have consented.", listOf("would", "will", "am"), 0),
            q("Were it a one-off, I ___ divert.", listOf("will", "would", "am"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Slippery slope", "دامنه لغزشی", "I would worry about slippery slopes.", "نگران دامنه لغزشی می‌شوم."),
            IdiomExpression("One-off", "یک بار", "Were it a one-off...", "اگر یک بار بود..."),
            IdiomExpression("Where do you stand?", "موضعت چیه؟", "Where do you stand?", "موضعت چیه؟")
        ),
        pron = listOf(
            PronunciationTip("Counterfactual conditionals", "Inversion in formal conditional: WERE it a one-off... HAD I known... The auxiliary is stressed.")
        ),
        cult = listOf(
            CulturalNote("Moral philosophy", "The trolley problem, introduced by Philippa Foot in 1967, remains a central thought experiment in ethics.")
        ),
        mis = listOf(
            CommonMistake("If I would have known.", "Had I known. / If I had known.", "No 'would have' in if-clause."),
            CommonMistake("Were it not for consequences, I would have intervene.", "Were it not for consequences, I would have intervened.", "Past participle.")
        )
    )

    private fun f2B() = base(7, "2B Ethical business", "۲B کسب و کار اخلاقی",
        listOf(
            "Use formal passive constructions",
            "Analyse corporate ethics",
            "Debate stakeholder capitalism"
        ),
        listOf(
            v("stakeholder", "ذی‌نفع", "Stakeholder capitalism.", "سرمایه‌داری ذی‌نفعان."),
            v("shareholder", "سهامدار", "Shareholder primacy.", "اولویت سهامداران."),
            v("fiduciary", "امانی", "Fiduciary duty.", "وظیفه امانی.", "adjective"),
            v("accountability", "پاسخگویی", "Corporate accountability.", "پاسخگویی شرکتی."),
            v("transparency", "شفافیت", "Radical transparency.", "شفافیت رادیکال."),
            v("externalities", "هزینه‌های خارجی", "Environmental externalities.", "هزینه‌های خارجی زیست‌محیطی."),
            v("governance", "حکمرانی", "Corporate governance.", "حکمرانی شرکتی."),
            v("exploitation", "بهره‌کشی", "Labour exploitation.", "بهره‌کشی از نیروی کار."),
            v("sustainability", "پایداری", "Corporate sustainability.", "پایداری شرکتی."),
            v("greenwashing", "سبزشویی", "Accusations of greenwashing.", "اتهامات سبزشویی."),
            v("due diligence", "بررسی دقیق", "Human rights due diligence.", "بررسی دقیق حقوق بشر."),
            v("compliance", "انطباق", "Regulatory compliance.", "انطباق قانونی.")
        ),
        listOf(
            GrammarSection("Formal passive", "Shareholder value has been prioritized. Concerns have been raised. Ethics has been subordinated."),
            GrammarSection("Passive with complex structures", "It has been argued that firms should be held accountable. The practice is widely considered unethical."),
            GrammarSection("Impersonal constructions", "It is claimed that... It is widely held that... There is a growing consensus that...")
        ),
        listOf(
            d("A", "Do you believe corporations can be genuinely ethical?", "معتقدی شرکت‌ها می‌توانند واقعاً اخلاقی باشند؟"),
            d("B", "That's the central question. It has been argued that their fiduciary duty to shareholders precludes it.", "این سؤال اصلی‌ست. استدلال شده که وظیفه امانی‌شان به سهامداران مانع آن می‌شود."),
            d("A", "Do you accept that argument?", "آن استدلال را می‌پذیری؟"),
            d("B", "Only partially. The shareholder primacy doctrine, formulated by Milton Friedman, has been widely criticized as outdated.", "فقط تا حدی. دکترین اولویت سهامداران، که توسط میلتون فریدمن فرموله شد، به طور گسترده به عنوان قدیمی نقد شده."),
            d("A", "What's the alternative?", "جایگزین چیه؟"),
            d("B", "Stakeholder capitalism. It is claimed that firms should serve employees, customers, communities, and the environment — not just shareholders.", "سرمایه‌داری ذی‌نفعان. ادعا می‌شود شرکت‌ها باید به کارمندان، مشتریان، جوامع، و محیط زیست خدمت کنند — نه فقط سهامداران."),
            d("A", "But isn't that just PR? Many accuse companies of greenwashing.", "ولی این فقط روابط عمومی نیست؟ بسیاری شرکت‌ها را به سبزشویی متهم می‌کنند."),
            d("B", "Often it is. Greenwashing has been extensively documented. But there are genuine examples too.", "اغلب هست. سبزشویی به طور گسترده مستند شده. ولی مثال‌های واقعی هم هستند."),
            d("A", "Can you name one?", "یکی را می‌توانی نام ببری؟"),
            d("B", "Patagonia is often cited. It has been structured so that profits are directed toward environmental causes.", "پاتاگونیا اغلب ذکر می‌شود. ساختارش طوری چیده شده که سودها به سمت اهداف زیست‌محیطی هدایت شوند."),
            d("A", "But it's a private company. Could a public one do the same?", "ولی شرکت خصوصی‌ست. شرکت عمومی می‌تواند همین کار را بکند؟"),
            d("B", "It's been tried. Unilever's Sustainable Living Plan has been praised, though critics argue it's been insufficient.", "امتحان شده. طرح زندگی پایدار یونیلیور تحسین شده، هرچند منتقدان استدلال می‌کنند ناکافی بوده."),
            d("A", "What's the fundamental obstacle?", "مانع اساسی چیه؟"),
            d("B", "Quarterly earnings pressure. It is widely held that short-termism undermines long-term ethical commitments.", "فشار درآمد فصلی. به طور گسترده معتقدند کوتاه‌مدت‌نگری تعهدات اخلاقی بلندمدت را تضعیف می‌کند."),
            d("A", "Can regulation help?", "تنظیمات می‌تواند کمک کند؟"),
            d("B", "It's essential. Voluntary ethics are often insufficient. Firms must be held accountable by law.", "ضروری‌ست. اخلاق داوطلبانه اغلب ناکافی‌ست. شرکت‌ها باید توسط قانون پاسخگو باشند."),
            d("A", "What form should that take?", "چه شکلی باید بگیرد؟"),
            d("B", "Mandatory due diligence. Environmental externalities should be priced. Tax havens should be eliminated.", "بررسی دقیق اجباری. هزینه‌های خارجی زیست‌محیطی باید قیمت‌گذاری شوند. پناهگاه‌های مالیاتی باید حذف شوند."),
            d("A", "Those are ambitious proposals.", "پیشنهادات جاه‌طلبانه‌ای هستند."),
            d("B", "They are. But it is imperative that we recognize the current model is unsustainable.", "هستند. ولی ضروری‌ست که تشخیص دهیم مدل فعلی ناپایدار است."),
            d("A", "Do you see change coming?", "تغییری در راه می‌بینی؟"),
            d("B", "Gradually. Public pressure, having mounted over decades, is now forcing some reform.", "به تدریج. فشار عمومی، که دهه‌ها انباشته شده، الان برخی اصلاحات را تحمیل می‌کند.")
        ),
        listOf(
            q("What doctrine does B criticize?", listOf("stakeholder", "shareholder primacy", "Marxism"), 1),
            q("What's a genuine ethical company example?", listOf("Nike", "Patagonia", "Amazon"), 1),
            q("It ___ been argued that firms should be accountable.", listOf("has", "have", "is"), 0),
            q("Greenwashing ___ been extensively documented.", listOf("has", "have", "is"), 0)
        ),
        idioms = listOf(
            IdiomExpression("PR", "روابط عمومی", "Just PR.", "فقط روابط عمومی."),
            IdiomExpression("Short-termism", "کوتاه‌مدت‌نگری", "Short-termism undermines ethics.", "کوتاه‌مدت‌نگری اخلاق را تضعیف می‌کند."),
            IdiomExpression("Mounting pressure", "فشار انباشته", "Mounting public pressure.", "فشار عمومی انباشته.")
        ),
        pron = listOf(
            PronunciationTip("Impersonal passive", "Focus stress on the participle: It has been ARgued. Greenwashing has been DOCumented.")
        ),
        cult = listOf(
            CulturalNote("Stakeholder capitalism", "The 2019 Business Roundtable statement redefined corporate purpose. Critics argue it's symbolic without enforcement.")
        ),
        mis = listOf(
            CommonMistake("It have been argued.", "It has been argued.", "Singular 'has'."),
            CommonMistake("Greenwashing have been documented.", "Greenwashing has been documented.", "Singular.")
        )
    )

    private fun f2C() = base(8, "2C Bioethics", "۲C اخلاق زیستی",
        listOf(
            "Use modal perfect for regret and speculation",
            "Analyse bioethical dilemmas",
            "Discuss medical ethics"
        ),
        listOf(
            v("euthanasia", "اتانازی", "Debate on euthanasia.", "بحث درباره اتانازی."),
            v("autonomy", "استقلال", "Patient autonomy.", "استقلال بیمار."),
            v("paternalism", "پدرسالاری", "Medical paternalism.", "پدرسالاری پزشکی."),
            v("consent", "رضایت", "Informed consent.", "رضایت آگاهانه."),
            v("palliative", "تسکینی", "Palliative care.", "مراقبت تسکینی.", "adjective"),
            v("genetic", "ژنتیکی", "Genetic engineering.", "مهندسی ژنتیک.", "adjective"),
            v("designer", "طراح", "Designer babies.", "نوزادان طراح.", "adjective"),
            v("cloning", "شبیه‌سازی", "Human cloning.", "شبیه‌سازی انسان."),
            v("abortion", "سقط جنین", "Abortion rights.", "حقوق سقط جنین."),
            v("surrogate", "رحم جایگزین", "Surrogate motherhood.", "مادر رحم جایگزین."),
            v("vulnerable", "آسیب‌پذیر", "Vulnerable populations.", "جمعیت‌های آسیب‌پذیر.", "adjective"),
            v("dignity", "کرامت", "Dying with dignity.", "مرگ با کرامت.")
        ),
        listOf(
            GrammarSection("Modal perfect for regret", "We should have consulted the patient. They might have proceeded more cautiously. He could have refused."),
            GrammarSection("Modal perfect for speculation", "The doctors must have faced a terrible decision. She may have been pressured."),
            GrammarSection("Perfect infinitive in formal contexts", "The patient is said to have been misinformed. He is thought to have consented under duress.")
        ),
        listOf(
            d("A", "What's your view on assisted dying?", "نظرت درباره مرگ یاری‌شده چیه؟"),
            d("B", "It's the most contentious ethical issue in modern medicine. One must approach it with humility.", "بحث‌برانگیزترین مسئله اخلاقی در پزشکی مدرن است. باید با فروتنی به آن نزدیک شد."),
            d("A", "Do you support it?", "حمایتش می‌کنی؟"),
            d("B", "In principle, yes — under extremely strict conditions. But I recognize the slippery slope risks.", "در اصل، بله — تحت شرایط بسیار سختگیرانه. ولی خطرات دامنه لغزشی را تشخیص می‌دهم."),
            d("A", "What conditions?", "چه شرایطی؟"),
            d("B", "Terminal illness, unbearable suffering, repeated requests over time, and rigorous psychiatric evaluation.", "بیماری لاعلاج، رنج غیرقابل تحمل، درخواست‌های مکرر در طول زمان، و ارزیابی روان‌پزشکی دقیق."),
            d("A", "What about the vulnerable?", "آسیب‌پذیرها چطور؟"),
            d("B", "That's the crux. The disabled community, in particular, has raised legitimate concerns about coercion.", "این نکته اصلی‌ست. جامعه معلولان، به ویژه، نگرانی‌های موجهی درباره اجبار مطرح کرده‌اند."),
            d("A", "Do you think they've been listened to?", "فکر می‌کنی به آن‌ها گوش داده شده؟"),
            d("B", "Insufficiently. The medical establishment should have consulted them far more extensively.", "به اندازه کافی نه. جامعه پزشکی باید بسیار گسترده‌تر با آن‌ها مشورت می‌کرد."),
            d("A", "What about palliative care?", "مراقبت تسکینی چطور؟"),
            d("B", "It should have been prioritized decades ago. Had we invested more in it, the demand for assisted dying might be lower.", "باید دهه‌ها پیش اولویت می‌یافت. اگر بیشتر رویش سرمایه‌گذاری کرده بودیم، تقاضا برای مرگ یاری‌شده ممکن بود کمتر باشد."),
            d("A", "That's a compelling argument. What about genetic engineering?", "استدلال قانع‌کننده‌ای‌ست. مهندسی ژنتیک چطور؟"),
            d("B", "Far more troubling. Therapeutic editing, perhaps. But designer babies raise insurmountable ethical concerns.", "بسیار نگران‌کننده‌تر. ویرایش درمانی، شاید. ولی نوزادان طراح نگرانی‌های اخلاقی غیرقابل حلی ایجاد می‌کنند."),
            d("A", "Why insurmountable?", "چرا غیرقابل حل؟"),
            d("B", "Because they commodify children. The child would be treated as a product, not a person.", "چون کودکان را کالایی می‌کنند. کودک به عنوان محصول رفتار می‌شود، نه فرد."),
            d("A", "What about eliminating genetic diseases?", "حذف بیماری‌های ژنتیکی چطور؟"),
            d("B", "That's more defensible. But the line between therapy and enhancement is notoriously blurry.", "قابل دفاع‌تر است. ولی خط بین درمان و بهبود به طور بدنامی مبهم است."),
            d("A", "Where would you draw it?", "کجا می‌کشی‌اش؟"),
            d("B", "At prevention of severe suffering. Beyond that, extreme caution. The unintended consequences could be catastrophic.", "در پیشگیری از رنج شدید. فراتر از آن، احتیاط شدید. پیامدهای ناخواسته می‌توانند فاجعه‌بار باشند."),
            d("A", "Do you think regulation can keep pace?", "فکر می‌کنی تنظیمات می‌توانند همگام بمانند؟"),
            d("B", "Rarely. Technology outpaces legislation. That's precisely why precaution is warranted.", "به ندرت. فناوری از قانون‌گذاری جلو می‌زند. دقیقاً به همین دلیل احتیاط لازم است."),
            d("A", "A sobering thought.", "اندیشه‌ای هوشیارکننده."),
            d("B", "Indeed. The decisions we make now will echo for generations.", "به راستی. تصمیماتی که الان می‌گیریم نسل‌ها طنین خواهد داشت.")
        ),
        listOf(
            q("What does B say is the crux?", listOf("cost", "vulnerable people", "technology"), 1),
            q("What troubles B about designer babies?", listOf("cost", "commodifying children", "law"), 1),
            q("The doctors ___ have faced a terrible decision.", listOf("must", "can", "will"), 0),
            q("The medical establishment ___ have consulted them more.", listOf("should", "would", "can"), 0)
        ),
        idioms = listOf(
            IdiomExpression("The crux", "نکته اصلی", "That's the crux.", "این نکته اصلی‌ست."),
            IdiomExpression("Keep pace", "همگام ماندن", "Regulation can't keep pace.", "تنظیمات نمی‌تواند همگام بماند."),
            IdiomExpression("Echo for generations", "نسل‌ها طنین داشتن", "Echo for generations.", "نسل‌ها طنین خواهد داشت.")
        ),
        pron = listOf(
            PronunciationTip("Modal perfect", "Stress the participle: They SHOULD have conSULTED. He MUST have FACED.")
        ),
        cult = listOf(
            CulturalNote("Assisted dying", "As of 2024, it's legal in Switzerland, Netherlands, Belgium, Canada, and several US states. Regulations vary widely.")
        ),
        mis = listOf(
            CommonMistake("They should have consult.", "They should have consulted.", "Past participle."),
            CommonMistake("He must have face it.", "He must have faced it.", "Past participle.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 2 ═══════════

    private fun pe2() = base(9, "PE2 A policy debate", "انگلیسی کاربردی ۲ — مناظره سیاستی",
        listOf(
            "Argue persuasively in formal debates",
            "Rebuttal and cross-examination",
            "Deliver closing statements"
        ),
        listOf(
            v("premise", "مقدمه", "The premise is flawed.", "مقدمه معیوب است."),
            v("rebuttal", "ردیه", "A strong rebuttal.", "ردیه قوی."),
            v("assert", "ادعا کردن", "Assert your position.", "موضعت را ادعا کن.", "verb"),
            v("substantiate", "اثبات کردن", "Substantiate the claim.", "ادعا را اثبات کن.", "verb"),
            v("concede", "پذیرفتن", "Concede the point.", "نکته را بپذیر.", "verb"),
            v("fallacy", "مغالطه", "A logical fallacy.", "مغالطه منطقی."),
            v("straw man", "آدم حصیری", "A straw man argument.", "استدلال آدم حصیری."),
            v("counterargument", "استدلال متقابل", "Anticipate counterarguments.", "استدلال‌های متقابل را پیش‌بینی کن."),
            v("burden of proof", "بار اثبات", "The burden of proof lies with...", "بار اثبات بر دوش..."),
            v("empirical", "تجربی", "Empirical evidence.", "شواهد تجربی.", "adjective"),
            v("normative", "هنجاری", "Normative claims.", "ادعاهای هنجاری.", "adjective"),
            v("sound", "محکم", "Sound reasoning.", "استدلال محکم.", "adjective")
        ),
        listOf(
            GrammarSection("Rhetorical structures", "Not only... but also. On the contrary. It follows that. By the same token."),
            GrammarSection("Concession and rebuttal", "While I concede that..., I would nevertheless argue... Admittedly... However..."),
            GrammarSection("Formal emphasis", "It is precisely this that... What is at stake is... The crux of the matter is...")
        ),
        listOf(
            d("Moderator", "Our motion is: 'This house believes that universal basic income should be implemented.' Speaking for the motion, Ms. Chen.", "موضوع ما: 'این مجلس معتقد است درآمد پایه جهانی باید اجرا شود.' خانم چن به نفع موضوع صحبت می‌کنند."),
            d("A", "Thank you. The premise of our argument is simple: automation will displace millions of workers. It follows that we must provide a floor below which no citizen falls.", "ممنون. مقدمه استدلال ما ساده است: اتوماسیون میلیون‌ها کارگر را جابجا خواهد کرد. نتیجه می‌شود که باید کف را فراهم کنیم تا هیچ شهروندی زیر آن نیفتد."),
            d("Moderator", "Speaking against, Mr. Okafor.", "آقای اوکافور مخالف صحبت می‌کنند."),
            d("B", "While I concede the disruption is real, I would argue that UBI is a superficially attractive but deeply flawed solution.", "هرچند می‌پذیرم اختلال واقعی‌ست، استدلال می‌کنم UBI راه‌حلی ظاهراً جذاب ولی عمیقاً معیوب است."),
            d("A", "Could you substantiate that claim?", "می‌توانید آن ادعا را اثبات کنید؟"),
            d("B", "Gladly. The Finnish pilot, often cited by proponents, showed only marginal employment effects. By the same token, it failed to demonstrate significant wellbeing gains.", "با کمال میل. آزمایش فنلاندی، که اغلب توسط طرفداران ذکر می‌شود، فقط اثرات اشتغالی حاشیه‌ای نشان داد. به همین ترتیب، نتوانست دستاوردهای قابل توجه در رفاه نشان دهد."),
            d("A", "That's a straw man. The Finnish study was deliberately limited in scope. Its authors have consistently said so.", "این آدم حصیری‌ست. مطالعه فنلاندی عمداً محدود بود. نویسندگانش مدام گفته‌اند."),
            d("B", "I'll grant you that. But the burden of proof lies with proponents. A policy of this magnitude requires robust empirical support.", "این را می‌پذیرم. ولی بار اثبات بر دوش طرفداران است. سیاستی با این بزرگی نیازمند پشتیبانی تجربی محکم است."),
            d("A", "What would you propose instead?", "به جایش چه پیشنهاد می‌کنید؟"),
            d("B", "Targeted interventions. Negative income tax, expanded child benefits, retraining programs. These are more efficient and more politically feasible.", "مداخلات هدفمند. مالیات بر درآمد منفی، مزایای گسترده کودکان، برنامه‌های بازآموزی. اینها کارآمدتر و از نظر سیاسی عملی‌ترند."),
            d("A", "But they leave gaps. Admittedly, targeted programs miss people. UBI is universal by design precisely for that reason.", "ولی شکاف‌ها را باقی می‌گذارند. می‌پذیرم، برنامه‌های هدفمند افراد را از قلم می‌اندازند. UBI دقیقاً به همین دلیل جهانی طراحی شده."),
            d("B", "At enormous cost. Not only would it require massive tax increases, but it would also create a disincentive to work.", "با هزینه عظیم. نه تنها افزایش مالیات عظیم لازم دارد، بلکه انگیزه‌زدایی از کار ایجاد می‌کند."),
            d("A", "The evidence on that is mixed. What is at stake is not merely economics but human dignity.", "شواهد در این مورد ترکیبی‌ست. آنچه در گرو است صرفاً اقتصاد نیست بلکه کرامت انسانی‌ست."),
            d("Moderator", "Closing statements, please.", "لطفاً بیانیه‌های پایانی."),
            d("A", "In closing, I return to the moral case. We stand at a technological precipice. If we do not provide a floor, we abandon millions. It is precisely this moment for which our institutions were designed.", "در پایان، به استدلال اخلاقی برمی‌گردم. در پرتگاه فناوری ایستاده‌ایم. اگر کفی فراهم نکنیم، میلیون‌ها را رها می‌کنیم. دقیقاً این لحظه‌ای‌ست که مؤسسات ما برای آن طراحی شده‌اند."),
            d("B", "In closing, I urge caution. Sound policy requires evidence, not aspiration. We would not build a bridge on hope; we should not build a welfare state on it either.", "در پایان، به احتیاط فرامی‌خوانم. سیاست محکم نیازمند شواهد است، نه آرزو. پلی را بر امید نمی‌سازیم؛ دولت رفاه را هم نباید بر آن بسازیم."),
            d("Moderator", "Thank you both. The motion has been thoroughly debated.", "ممنون از هر دو. موضوع به طور کامل مناظره شد.")
        ),
        listOf(
            q("What is the motion?", listOf("UBI", "tax cut", "minimum wage"), 0),
            q("What does B propose?", listOf("UBI", "targeted interventions", "status quo"), 1),
            q("Not only ___ it require increases, but it would disincentivize work.", listOf("would", "will", "does"), 0),
            q("It is precisely this moment ___ our institutions were designed for.", listOf("that", "which", "what"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Straw man", "آدم حصیری", "That's a straw man.", "این آدم حصیری‌ست."),
            IdiomExpression("Burden of proof", "بار اثبات", "Burden of proof lies with proponents.", "بار اثبات بر دوش طرفداران است."),
            IdiomExpression("What is at stake", "آنچه در گرو است", "What is at stake is dignity.", "آنچه در گرو است کرامت است.")
        ),
        pron = listOf(
            PronunciationTip("Debate emphasis", "Contrastive stress is crucial: I CONCEDE the disruption, BUT I ARGUE that...")
        ),
        cult = listOf(
            CulturalNote("Oxford-style debate", "Popular in UK and US universities. Involves a motion, a proposition, and an opposition. Audience votes before and after.")
        ),
        mis = listOf(
            CommonMistake("Not only it would require.", "Not only would it require.", "Inversion after 'not only'."),
            CommonMistake("It is this that our institutions were designed.", "It is precisely this that our institutions were designed for.", "Don't drop the preposition.")
        )
    )

    // ═══════════ REVIEW 2 ═══════════

    private fun rc34() = base(10, "R&C 3&4", "مرور ۳ و ۴",
        listOf("Review unreal past", "Review formal passive", "Review modal perfect"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("consolidate", "تثبیت کردن", "Consolidate grammar.", "گرامر را تثبیت کن.", "verb"),
            v("refine", "پالایش کردن", "Refine usage.", "کاربرد را پالایش کن.", "verb"),
            v("sophistication", "پیچیدگی", "Linguistic sophistication.", "پیچیدگی زبانی."),
            v("register", "لحن", "Formal register.", "لحن رسمی."),
            v("mastery", "تسلط", "True mastery.", "تسلط واقعی.")
        ),
        listOf(
            GrammarSection("Unreal past", "Were I in his position... Had I known... If only I had..."),
            GrammarSection("Formal passive", "It has been argued... Concerns have been raised..."),
            GrammarSection("Modal perfect", "They should have... He must have... She might have...")
        ),
        listOf(
            d("T", "Let us review Files 3 and 4. Beginning with the unreal past.", "بیایید فایل‌های ۳ و ۴ را مرور کنیم. شروع با گذشته غیرواقعی."),
            d("A", "Were I to choose again, I would have studied philosophy.", "اگر دوباره انتخاب می‌کردم، فلسفه می‌خواندم."),
            d("B", "Had I known the consequences, I would never have agreed.", "اگر پیامدها را می‌دانستم، هرگز موافقت نمی‌کردم."),
            d("T", "Excellent. Formal passive?", "عالی. مجهول رسمی؟"),
            d("A", "It has been argued that the proposal lacks empirical grounding.", "استدلال شده که پیشنهاد فاقد پشتوانه تجربی‌ست."),
            d("B", "Concerns have been raised regarding its feasibility.", "نگرانی‌هایی درباره امکان‌سنجی‌اش مطرح شده."),
            d("T", "And modal perfect?", "و modal perfect؟"),
            d("A", "The committee should have consulted stakeholders more extensively.", "کمیته باید با ذی‌نفعان گسترده‌تر مشورت می‌کرد."),
            d("B", "They must have anticipated the criticism.", "باید انتقاد را پیش‌بینی کرده باشند."),
            d("T", "You have demonstrated genuine sophistication. It is vital that such precision be maintained.", "پیچیدگی واقعی نشان داده‌اید. حیاتی‌ست که چنین دقتی حفظ شود."),
            d("A", "We shall endeavor to do so.", "تلاش خواهیم کرد."),
            d("B", "The journey toward mastery, after all, is endless.", "سفر به سمت تسلط، بعد از همه، بی‌پایان است."),
            d("T", "Well said. You are prepared for File 5.", "خوب گفتی. برای فایل ۵ آماده‌اید."),
            d("A", "We look forward to the challenge.", "منتظر چالش هستیم.")
        ),
        listOf(
            q("Which is unreal past?", listOf("Were I to choose", "I choose", "I will choose"), 0),
            q("Formal passive example?", listOf("It argued", "It has been argued", "It argues"), 1),
            q("Had I known, I ___ never have agreed.", listOf("would", "will", "am"), 0),
            q("It has been ___ that the proposal lacks grounding.", listOf("argue", "argued", "arguing"), 1)
        ),
        idioms = listOf(IdiomExpression("Endeavor to", "تلاش کردن برای", "We shall endeavor to.", "تلاش خواهیم کرد.")),
        pron = listOf(
            PronunciationTip("Formal register", "Formal speech avoids contractions and uses full forms: It IS, they HAVE, we SHALL.")
        ),
        cult = listOf(
            CulturalNote("C1 mastery", "At C1, learners can use language flexibly and effectively for social, academic, and professional purposes.")
        ),
        mis = listOf(
            CommonMistake("Were I to chose.", "Were I to choose.", "Base form after 'to'."),
            CommonMistake("It has been argue.", "It has been argued.", "Past participle.")
        )
    )

    // ═══════════ FILE 3 — Memory and perception ═══════════

    private fun f3A() = base(11, "3A The nature of memory", "۳A ماهیت حافظه",
        listOf(
            "Use advanced passive structures",
            "Discuss memory and perception",
            "Express epistemic uncertainty"
        ),
        listOf(
            v("ephemeral", "زودگذر", "Memories are ephemeral.", "خاطرات زودگذرند.", "adjective"),
            v("reconstruct", "بازسازی کردن", "Memory is reconstructed.", "حافظه بازسازی می‌شود.", "verb"),
            v("fallible", "خطاپذیر", "Human memory is fallible.", "حافظه انسانی خطاپذیر است.", "adjective"),
            v("subjective", "ذهنی", "Subjective experience.", "تجربه ذهنی.", "adjective"),
            v("distort", "تحریف کردن", "Distort the past.", "گذشته را تحریف کن.", "verb"),
            v("vivid", "زنده", "A vivid recollection.", "یادآوری زنده.", "adjective"),
            v("implicit", "ضمنی", "Implicit memory.", "حافظه ضمنی.", "adjective"),
            v("consolidate", "تثبیت کردن", "Consolidate memories.", "خاطرات را تثبیت کن.", "verb"),
            v("retrieval", "بازیابی", "Memory retrieval.", "بازیابی حافظه."),
            v("facade", "ظاهر", "A facade of certainty.", "ظاهری از قطعیت."),
            v("fabricate", "جعل کردن", "The mind fabricates memories.", "ذهن خاطرات را جعل می‌کند.", "verb"),
            v("malleable", "شکل‌پذیر", "Memory is malleable.", "حافظه شکل‌پذیر است.", "adjective")
        ),
        listOf(
            GrammarSection("Advanced passive", "Memories are said to be reconstructed. It is widely held that... The past is constantly being reinterpreted."),
            GrammarSection("Passive with perfect infinitive", "The event is believed to have occurred. She is thought to have witnessed it."),
            GrammarSection("Epistemic modality", "It may well be that... It's conceivable that... There's every likelihood that...")
        ),
        listOf(
            d("A", "I've been reading about the neuroscience of memory. It's rather unsettling.", "درباره عصب‌شناسی حافظه می‌خواندم. نسبتاً نگران‌کننده است."),
            d("B", "In what sense?", "از چه نظر؟"),
            d("A", "Well, it appears that memories aren't stored like files. Rather, they're reconstructed every time we recall them.", "خب، به نظر می‌رسد خاطرات مثل فایل ذخیره نمی‌شوند. بلکه، هر بار که به یاد می‌آوریم بازسازی می‌شوند."),
            d("B", "So each recollection subtly alters the original?", "پس هر یادآوری به طور ظریف اصل را تغییر می‌دهد؟"),
            d("A", "Precisely. Which means what you 'remember' isn't what happened — it's what you last remembered.", "دقیقاً. یعنی آنچه 'به یاد می‌آوری' آنچه اتفاق افتاده نیست — آن چیزی‌ست که آخرین بار به یاد آوردی."),
            d("B", "That's a rather disturbing thought. It suggests we can't truly trust our own pasts.", "فکر نسبتاً نگران‌کننده‌ای‌ست. نشان می‌دهد نمی‌توانیم واقعاً به گذشته خودمان اعتماد کنیم."),
            d("A", "Indeed. And worse still, the mind seems to fabricate details to fill in gaps, without our being aware of it.", "همینطور. و بدتر اینکه، به نظر می‌رسد ذهن جزئیات را برای پر کردن شکاف‌ها جعل می‌کند، بدون اینکه ما آگاه باشیم."),
            d("B", "So our sense of a coherent self is, in a sense, a fiction?", "پس حس ما از خودِ منسجم، به یک معنا، داستان است؟"),
            d("A", "Not a fiction exactly, but a construction. The self is arguably a narrative we tell ourselves, and it's continually being revised.", "دقیقاً داستان نه، ولی ساختاری. خود قابل استدلال روایتی‌ست که به خودمان می‌گوییم، و مدام بازنگری می‌شود."),
            d("B", "That's a profound idea. Does it trouble you?", "ایده عمیقی‌ست. نگرانت می‌کند؟"),
            d("A", "In some ways, yes. But in others, it's liberating. If the past is revisable, so too is our relationship to it.", "از بعضی جهات، بله. ولی از جهات دیگر، آزادی‌بخش است. اگر گذشته بازنگری‌پذیر است، رابطه ما با آن هم همینطور."),
            d("B", "You mean we can, in effect, rewrite our own histories?", "منظورت این است که در واقع می‌توانیم تاریخ‌های خودمان را بازنویسی کنیم؟"),
            d("A", "Not the events themselves, but their meaning. And meaning, arguably, is what matters most.", "نه خود رویدادها، بلکه معنایشان. و معنا، قابل استدلال، چیزی‌ست که بیشترین اهمیت را دارد."),
            d("B", "Hmm. I'm not sure I find that entirely comforting.", "هوم. مطمئن نیستم کاملاً آرامش‌بخش بیابمش."),
            d("A", "Nor am I, to be honest. But it does make one more forgiving of others' recollections.", "من هم، راستش. ولی باعث می‌شود انسان بخشنده‌تر با یادآوری‌های دیگران باشد."),
            d("B", "How so?", "چطور؟"),
            d("A", "Because if everyone's memory is fallible, then disagreements about the past are less about honesty and more about the nature of the mind itself.", "چون اگر حافظه همه خطاپذیر باشد، اختلافات درباره گذشته کمتر درباره صداقت و بیشتر درباره ماهیت خود ذهن است."),
            d("B", "That's rather magnanimous of you.", "نسبتاً بزرگ‌منشانه‌ست از طرف تو."),
            d("A", "Merely pragmatic, I'd say.", "فقط عمل‌گرایانه، می‌گویم.")
        ),
        listOf(
            q("How are memories stored according to A?", listOf("like files", "reconstructed", "permanently"), 1),
            q("What does A find liberating?", listOf("past is revisable", "memory is perfect", "forgetting"), 0),
            q("Memories ___ to be reconstructed.", listOf("are said", "is said", "was said"), 0),
            q("The event is believed ___ occurred.", listOf("to have", "have", "having"), 0)
        ),
        idioms = listOf(
            IdiomExpression("In a sense", "به یک معنا", "In a sense, it's a fiction.", "به یک معنا، داستان است."),
            IdiomExpression("To be honest", "راستش", "To be honest, nor am I.", "راستش، من هم نه."),
            IdiomExpression("So to speak", "به اصطلاح", "As it were, so to speak.", "به اصطلاح.")
        ),
        pron = listOf(
            PronunciationTip("Advanced passive", "Stress the past participle: Memories are RECONstructed. It's widely HELD that...")
        ),
        cult = listOf(
            CulturalNote("Memory research", "Elizabeth Loftus's work on false memories has profound implications for eyewitness testimony in criminal trials.")
        ),
        mis = listOf(
            CommonMistake("Memories are said to reconstructed.", "Memories are said to be reconstructed.", "Don't drop 'be'."),
            CommonMistake("It's believed that the event to have occurred.", "The event is believed to have occurred.", "Different structure.")
        )
    )

    private fun f3B() = base(12, "3B Perception and reality", "۳B ادراک و واقعیت",
        listOf(
            "Use complex nominalization",
            "Discuss perception and consciousness",
            "Express philosophical positions"
        ),
        listOf(
            v("perception", "ادراک", "Human perception is limited.", "ادراک انسانی محدود است."),
            v("phenomenon", "پدیده", "A puzzling phenomenon.", "پدیده معماگونه."),
            v("subjective", "ذهنی", "Subjective experience.", "تجربه ذهنی.", "adjective"),
            v("consensus", "اجماع", "The consensus reality.", "واقعیت اجماعی."),
            v("qualia", "کیفیات ذهنی", "Qualia are private.", "کیفیات ذهنی خصوصی‌اند."),
            v("manifestation", "تجلی", "A manifestation of consciousness.", "تجلی آگاهی."),
            v("perceive", "درک کردن", "Perceive reality.", "واقعیت را درک کن.", "verb"),
            v("neurological", "عصبی", "Neurological processes.", "فرآیندهای عصبی.", "adjective"),
            v("elusive", "گریزان", "An elusive concept.", "مفهوم گریزان.", "adjective"),
            v("predisposition", "استعداد", "A genetic predisposition.", "استعداد ژنتیکی."),
            v("paradigm", "پارادایم", "A paradigm shift in thinking.", "تغییر پارادایم در تفکر."),
            v("phenomenological", "پدیدارشناختی", "Phenomenological experience.", "تجربه پدیدارشناختی.", "adjective")
        ),
        listOf(
            GrammarSection("Nominalization", "The perception of reality. The manifestation of consciousness. The elusiveness of subjective experience."),
            GrammarSection("Complex subjects", "What we perceive as reality may in fact be a construction of the brain."),
            GrammarSection("Concessive nominal clauses", "Whatever we perceive, however we interpret it, our experience remains private.")
        ),
        listOf(
            d("A", "Do you ever wonder whether we all perceive the same reality?", "هرگز فکر می‌کنی آیا همه ما واقعیت یکسانی را درک می‌کنیم؟"),
            d("B", "Constantly. It's one of those questions that seems simple but becomes more perplexing the deeper one goes.", "مدام. یکی از آن سؤالاتی‌ست که ساده به نظر می‌رسد ولی هرچه عمیق‌تر می‌روی معماگونه‌تر می‌شود."),
            d("A", "Take colour, for instance. Is my red the same as your red?", "مثلاً رنگ را در نظر بگیر. آیا قرمز من همان قرمز توست؟"),
            d("B", "Nobody can know, in principle. We can both call it 'red', but the quality of the experience remains entirely private.", "در اصل هیچ‌کس نمی‌تواند بداند. هر دو می‌توانیم آن را 'قرمز' بنامیم، ولی کیفیت تجربه کاملاً خصوصی می‌ماند."),
            d("A", "That's what philosophers call qualia, isn't it?", "این همان چیزی‌ست که فیلسوفان آن را qualia می‌نامند، نه؟"),
            d("B", "Precisely. The subjective, ineffable aspects of conscious experience. And their existence poses a formidable challenge to materialist accounts of mind.", "دقیقاً. جنبه‌های ذهنی و ناگفتنی تجربه آگاهانه. و وجودشان چالش مهیبی برای روایت‌های مادی‌گرا از ذهن ایجاد می‌کند."),
            d("A", "So you'd say consciousness can't be reduced to physical processes?", "پس می‌گویی آگاهی نمی‌تواند به فرآیندهای فیزیکی فروکاسته شود؟"),
            d("B", "I wouldn't go that far. But I do think the hard problem of consciousness remains genuinely unsolved, however much progress neuroscience makes.", "اینقدر پیش نمی‌روم. ولی فکر می‌کنم مسئله سخت آگاهی واقعاً حل‌نشده می‌ماند، هرچقدر هم که علوم اعصاب پیشرفت کند."),
            d("A", "And yet we must operate as though reality is shared. Otherwise, language itself would break down.", "و با این حال باید طوری عمل کنیم که گویی واقعیت مشترک است. وگرنه، خود زبان فرو می‌پاشد."),
            d("B", "An excellent point. The very possibility of communication presupposes a shared world — or at least the fiction of one.", "نکته عالی‌ای‌ست. خود امکان ارتباط، جهانی مشترک را پیش‌فرض می‌گیرد — یا حداقل داستان آن را."),
            d("A", "So we live, in effect, in a kind of pragmatic consensus?", "پس در واقع در نوعی اجماع عمل‌گرایانه زندگی می‌کنیم؟"),
            d("B", "Something like that. We agree to treat certain perceptions as 'the real world' because doing so is useful, and perhaps necessary for survival.", "چیزی شبیه این. توافق می‌کنیم ادراکات خاصی را 'جهان واقعی' در نظر بگیریم چون این کار مفید است، و شاید برای بقا ضروری."),
            d("A", "That's a rather deflationary view of truth.", "دیدگاه نسبتاً کاهنده‌ای درباره حقیقت است."),
            d("B", "Perhaps. But it has the merit of humility. It acknowledges the limits of what we can know.", "شاید. ولی مزیت فروتنی را دارد. محدودیت‌های آنچه می‌توانیم بدانیم را به رسمیت می‌شناسد."),
            d("A", "Does that trouble you?", "نگرانت می‌کند؟"),
            d("B", "Not especially. I find it liberating, in fact. It means we should hold our convictions with a certain lightness.", "نه به خصوص. در واقع آزادی‌بخش می‌یابمش. یعنی باید اعتقاداتمان را با سبکی خاص نگه داریم."),
            d("A", "That's a mature position.", "موضع بالغانه‌ای‌ست."),
            d("B", "Merely an honest one, I'd like to think.", "فقط صادقانه، دوست دارم فکر کنم."),
            d("A", "Well put.", "خوب گفتی.")
        ),
        listOf(
            q("What is qualia?", listOf("physical processes", "subjective experience", "language"), 1),
            q("What does B think of the hard problem?", listOf("solved", "unsolved", "irrelevant"), 1),
            q("Memories ___ reconstructed each time.", listOf("are", "is", "was"), 0),
            q("___ we perceive, our experience remains private.", listOf("Whatever", "However", "Whichever"), 0)
        ),
        idioms = listOf(
            IdiomExpression("In principle", "در اصل", "Nobody can know, in principle.", "در اصل هیچ‌کس نمی‌تواند بداند."),
            IdiomExpression("Go that far", "اینقدر پیش رفتن", "I wouldn't go that far.", "اینقدر پیش نمی‌روم."),
            IdiomExpression("Well put", "خوب گفتی", "Well put.", "خوب گفتی.")
        ),
        pron = listOf(
            PronunciationTip("Philosophical discourse", "Speak with measured pauses. Emphasise key concepts: The HARD problem. QUALia.")
        ),
        cult = listOf(
            CulturalNote("Philosophy of mind", "The 'hard problem of consciousness' was articulated by David Chalmers. It remains one of philosophy's deepest mysteries.")
        ),
        mis = listOf(
            CommonMistake("Whatever we perceive, however we interpret it, our experience remain private.", "Whatever we perceive, however we interpret it, our experience remains private.", "Subject-verb agreement."),
            CommonMistake("The qualia is subjective.", "Qualia are subjective.", "Qualia is plural.")
        )
    )

    private fun f3C() = base(13, "3C Nostalgia and the past", "۳C نوستالژی و گذشته",
        listOf(
            "Use conditional inversion and formal structures",
            "Discuss nostalgia and memory",
            "Express complex emotions"
        ),
        listOf(
            v("nostalgia", "نوستالژی", "A wave of nostalgia.", "موجی از نوستالژی."),
            v("idealize", "آرمانی کردن", "Idealize the past.", "گذشته را آرمانی کن.", "verb"),
            v("rose-tinted", "گلگون", "Rose-tinted glasses.", "عینک گلگون.", "adjective"),
            v("sentimental", "احساسی", "A sentimental attachment.", "وابستگی احساسی.", "adjective"),
            v("bittersweet", "تلخ و شیرین", "A bittersweet memory.", "خاطره تلخ و شیرین.", "adjective"),
            v("reminisce", "خاطره گفتن", "Reminisce about childhood.", "از کودکی خاطره گفتن.", "verb"),
            v("bygone", "سپری‌شده", "A bygone era.", "دوره سپری‌شده.", "adjective"),
            v("longing", "اشتیاق", "A deep longing.", "اشتیاق عمیق."),
            v("melancholy", "مالیخولیا", "A sense of melancholy.", "حسی از مالیخولیا."),
            v("wistful", "حسرت‌آمیز", "A wistful smile.", "لبخند حسرت‌آمیز.", "adjective"),
            v("evoke", "برانگیختن", "Evoke memories.", "خاطرات را برانگیز.", "verb"),
            v("sublime", "والا", "A sublime experience.", "تجربه والا.", "adjective")
        ),
        listOf(
            GrammarSection("Conditional inversion", "Had I known then what I know now... Were I to return... Should you ever visit..."),
            GrammarSection("Formal concession", "Much as I loved that time... However much I miss it..."),
            GrammarSection("Emotional intensification", "There's something profoundly... It's a curious thing, the way...")
        ),
        listOf(
            d("A", "Do you ever find yourself nostalgic for times that were, in truth, not particularly happy?", "هرگز خودت را نوستالژیک برای زمان‌هایی می‌یابی که در حقیقت چندان شاد نبودند؟"),
            d("B", "Frequently. And it's a curious phenomenon, isn't it? The mind has a remarkable capacity to soften the edges of the past.", "اغلب. و پدیده عجیبی‌ست، نه؟ ذهن ظرفیت قابل توجهی برای نرم کردن لبه‌های گذشته دارد."),
            d("A", "Rose-tinted glasses, as they say.", "عینک گلگون، به قول معروف."),
            d("B", "Precisely. Had I known at the time how difficult those years were, I'd be astonished at my own fondness for them.", "دقیقاً. اگر در آن زمان می‌دانستم آن سال‌ها چقدر سخت بودند، از دلبستگی خودم به آن‌ها شگفت‌زده می‌شدم."),
            d("A", "What do you think is the psychological function of nostalgia?", "فکر می‌کنی کارکرد روانشناختی نوستالژی چیه؟"),
            d("B", "Some argue it serves to bolster our sense of continuity. By idealising the past, we reassure ourselves that our lives have been meaningful.", "بعضی استدلال می‌کنند به تقویت حس تداوم ما خدمت می‌کند. با آرمانی کردن گذشته، به خودمان اطمینان می‌دهیم که زندگی‌هایمان معنا داشته‌اند."),
            d("A", "So it's a kind of psychological comfort?", "پس نوعی آرامش روانشناختی‌ست؟"),
            d("B", "In part. But it can also be a source of sorrow — a longing for something we know we can never return to.", "تا حدی. ولی می‌تواند منبع غم هم باشد — اشتیاقی برای چیزی که می‌دانیم هرگز نمی‌توانیم به آن بازگردیم."),
            d("A", "A bittersweet sensation.", "احساسی تلخ و شیرین."),
            d("B", "Exactly. There's something profoundly human about it. Were we incapable of nostalgia, we'd be poorer for it.", "دقیقاً. چیزی عمیقاً انسانی در آن هست. اگر ناتوان از نوستالژی بودیم، فقیرتر می‌بودیم."),
            d("A", "Do you think we idealise childhood especially?", "فکر می‌کنی مخصوصاً کودکی را آرمانی می‌کنیم؟"),
            d("B", "Inevitably. Whatever our childhoods were actually like, they take on a golden hue in recollection.", "ناگزیر. هرچه کودکی‌هایمان واقعاً بوده باشند، رنگی طلایی در یادآوری می‌گیرند."),
            d("A", "Much as we might try to remember them objectively, we can't.", "هرچقدر هم که تلاش کنیم عیناً به یادشان آوریم، نمی‌توانیم."),
            d("B", "No, indeed. Memory is not a recording; it's a narrative we continually reconstruct.", "نه، همینطور است. حافظه ضبط نیست؛ روایتی‌ست که مدام بازسازی می‌کنیم."),
            d("A", "And perhaps that's for the best.", "و شاید این برای بهترین باشد."),
            d("B", "Perhaps. Were we to see the past in all its starkness, we might find it unbearable.", "شاید. اگر گذشته را در تمام تلخی‌اش می‌دیدیم، ممکن بود غیرقابل تحمل بیابیمش."),
            d("A", "That's a rather consoling thought.", "فکر نسبتاً تسلی‌بخشی‌ست."),
            d("B", "I find it so. There's a certain mercy in forgetting, or at least in softening.", "من همینطور می‌یابمش. رحمتی در فراموشی هست، یا حداقل در نرم کردن."),
            d("A", "Well, on that note, shall we open another bottle of wine?", "خب، بر این اساس، یک بطری شراب دیگر باز کنیم؟"),
            d("B", "An excellent suggestion.", "پیشنهاد عالی‌ای‌ست.")
        ),
        listOf(
            q("What does B say about past years?", listOf("accurately remembered", "softened", "forgotten"), 1),
            q("What function does nostalgia serve?", listOf("bolster continuity", "cause depression", "nothing"), 0),
            q("___ I known, I'd have been astonished.", listOf("Had", "Have", "Has"), 0),
            q("___ we incapable of nostalgia, we'd be poorer.", listOf("Were", "Was", "Had"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Rose-tinted glasses", "عینک گلگون", "Rose-tinted glasses.", "عینک گلگون."),
            IdiomExpression("For the best", "برای بهترین", "Perhaps that's for the best.", "شاید برای بهترین باشد."),
            IdiomExpression("On that note", "بر این اساس", "On that note, shall we?", "بر این اساس، بیایید؟")
        ),
        pron = listOf(
            PronunciationTip("Conditional inversion", "Invert formally: HAD I known. WERE we incapable. SHOULD you ever visit.")
        ),
        cult = listOf(
            CulturalNote("Nostalgia", "Originally considered a medical condition (17th century), nostalgia is now studied as a complex emotion with both positive and negative aspects.")
        ),
        mis = listOf(
            CommonMistake("If I had known at the time, I would be astonished.", "Had I known at the time, I'd be astonished.", "Formal inversion."),
            CommonMistake("Were we incapable of nostalgia, we would poorer.", "Were we incapable of nostalgia, we'd be poorer.", "Don't drop 'be'.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 3 ═══════════

    private fun pe3() = base(14, "PE3 A philosophical debate", "انگلیسی کاربردی ۳ — مناظره فلسفی",
        listOf(
            "Argue abstract positions persuasively",
            "Use rhetorical devices effectively",
            "Respond to counterarguments"
        ),
        listOf(
            v("premise", "مقدمه", "A flawed premise.", "مقدمه معیوب."),
            v("inference", "استنتاج", "A logical inference.", "استنتاج منطقی."),
            v("fallacy", "مغالطه", "A common fallacy.", "مغالطه رایج."),
            v("cogent", "متقن", "A cogent argument.", "استدلال متقن.", "adjective"),
            v("tenable", "قابل دفاع", "A tenable position.", "موضع قابل دفاع.", "adjective"),
            v("refute", "رد کردن", "Refute the claim.", "ادعا را رد کن.", "verb"),
            v("counterargument", "استدلال متقابل", "Address the counterargument.", "به استدلال متقابل بپرداز."),
            v("concede", "اقرار کردن", "Concede the point.", "نکته را بپذیر.", "verb"),
            v("rhetoric", "سخنوری", "Rhetorical skill.", "مهارت سخنوری."),
            v("syllogism", "قیاس", "A classic syllogism.", "قیاس کلاسیک."),
            v("empirical", "تجربی", "Empirical evidence.", "شواهد تجربی.", "adjective")
        ),
        listOf(
            GrammarSection("Arguing from first principles", "If we accept that... it follows that... Given that... we can infer that..."),
            GrammarSection("Concession and rebuttal", "Granted, ... Nonetheless, ... While I concede that..., I would maintain that..."),
            GrammarSection("Hypothetical reasoning", "Suppose, for the sake of argument, that... Let us imagine that...")
        ),
        listOf(
            d("A", "I'd like to propose that free will is, in fact, an illusion.", "می‌خواهم پیشنهاد کنم که اراده آزاد، در واقع، توهم است."),
            d("B", "A bold claim. On what grounds?", "ادعای جسورانه‌ای‌ست. بر چه اساسی؟"),
            d("A", "On the grounds that our decisions are determined by prior causes — genetics, environment, and neurochemistry — none of which we chose.", "بر این اساس که تصمیمات ما توسط علل قبلی تعیین می‌شوند — ژنتیک، محیط، و عصب‌شیمی — که هیچ‌کدام را انتخاب نکردیم."),
            d("B", "Granted, we don't choose our initial conditions. But surely the capacity for deliberation and self-reflection introduces a kind of freedom?", "پذیرفته، شرایط اولیه‌مان را انتخاب نمی‌کنیم. ولی قطعاً ظرفیت تأمل و خوداندیشی نوعی آزادی معرفی می‌کند؟"),
            d("A", "Does it, though? The deliberation itself is a process governed by physical laws. It's not as though some immaterial 'will' intervenes.", "آیا واقعاً؟ خود تأمل فرآیندی‌ست که قوانین فیزیکی بر آن حاکم است. گویی نوعی 'اراده' غیرمادی مداخله نمی‌کند."),
            d("B", "Let me put a counterargument to you. If free will is an illusion, then moral responsibility collapses. We don't punish the rain for falling.", "بگذار استدلال متقابلی مطرح کنم. اگر اراده آزاد توهم باشد، مسئولیت اخلاقی فرو می‌پاشد. باران را برای باریدن مجازات نمی‌کنیم."),
            d("A", "That's a strong point, and one I anticipated. I'd maintain that we can retain a notion of responsibility without invoking contra-causal freedom.", "نکته قوی‌ای‌ست، و یکی که پیش‌بینی کردم. استدلال می‌کنم که می‌توانیم مفهوم مسئولیت را بدون توسل به آزادی ضد-علّی حفظ کنیم."),
            d("B", "How so?", "چطور؟"),
            d("A", "Responsibility, on my view, is a social practice rather than a metaphysical fact. We hold people accountable because it shapes future behaviour, not because they could have done otherwise in some absolute sense.", "مسئولیت، به نظر من، عملی اجتماعی‌ست تا واقعیتی متافیزیکی. مردم را پاسخگو می‌دانیم چون رفتار آینده را شکل می‌دهد، نه چون می‌توانستند به معنای مطلق کار دیگری انجام دهند."),
            d("B", "That's a sophisticated position, but I'm not entirely persuaded. It seems to me you're smuggling in a notion of agency under another name.", "موضع پیچیده‌ای‌ست، ولی کاملاً متقاعد نشده‌ام. به نظر من نوعی مفهوم عاملیت را زیر نام دیگری قاچاق می‌کنی."),
            d("A", "A fair charge. Let me concede that the compatibilist position I'm defending is not without its difficulties.", "اتهام منصفانه‌ای‌ست. اقرار می‌کنم موضع سازگارگرایانه‌ای که دفاع می‌کنم بی مشکل نیست."),
            d("B", "Well, at least you're not dogmatic about it.", "خب، حداقل جزم‌اندیش نیستی در موردش."),
            d("A", "Dogmatism is the enemy of philosophy. But let me ask you something in return. Suppose, for the sake of argument, that we do have free will. How would we know?", "جزم‌اندیشی دشمن فلسفه است. ولی بگذار چیزی در عوض بپرسم. فرض کن، برای بحث، که اراده آزاد داریم. چطور می‌فهمیدیم؟"),
            d("B", "An intriguing question. Perhaps we wouldn't — perhaps the experience of choosing is all we can ever have access to.", "سؤال جذابی‌ست. شاید نمی‌فهمیدیم — شاید تجربه انتخاب تنها چیزی‌ست که می‌توانیم به آن دسترسی داشته باشیم."),
            d("A", "In which case, the debate may be, in principle, unresolvable.", "در آن صورت، بحث ممکن است، در اصل، حل‌نشدنی باشد."),
            d("B", "That's rather unsatisfying, isn't it?", "نسبتاً نارضایت‌بخش است، نه؟"),
            d("A", "Philosophy often is. It raises better questions rather than supplying final answers.", "فلسفه اغلب همینطور است. سؤالات بهتری مطرح می‌کند به جای ارائه پاسخ‌های نهایی."),
            d("B", "On that we can agree.", "بر این می‌توانیم توافق کنیم.")
        ),
        listOf(
            q("What does A propose?", listOf("free will is real", "free will is illusion", "no morality"), 1),
            q("What's B's counterargument?", listOf("morality collapses", "nothing matters", "we're robots"), 0),
            q("___ I known, I would have conceded.", listOf("Had", "Have", "Has"), 0),
            q("___ we accept the premise, it follows that...", listOf("If", "Unless", "Though"), 0)
        ),
        idioms = listOf(
            IdiomExpression("On what grounds?", "بر چه اساسی؟", "On what grounds?", "بر چه اساسی؟"),
            IdiomExpression("For the sake of argument", "برای بحث", "Suppose, for the sake of argument.", "فرض کن، برای بحث."),
            IdiomExpression("Smuggle in", "قاچاق کردن", "You're smuggling in agency.", "داری عاملیت را قاچاق می‌کنی.")
        ),
        pron = listOf(
            PronunciationTip("Philosophical discourse", "Pause before key concepts. Stress abstract nouns: FREE WILL, MORAL REsponsibility, COMPATibilism.")
        ),
        cult = listOf(
            CulturalNote("Free will debate", "Compatibilism (defended by Daniel Dennett) holds that free will and determinism are compatible. Hard determinists disagree.")
        ),
        mis = listOf(
            CommonMistake("On what grounds you say that?", "On what grounds do you say that?", "Use auxiliary."),
            CommonMistake("Suppose we have free will — how we would know?", "Suppose we have free will — how would we know?", "Inversion in question.")
        )
    )

    // ═══════════ REVIEW 3 ═══════════

    private fun rc56() = base(15, "R&C 5&6", "مرور ۵ و ۶",
        listOf("Review advanced passive", "Review conditional inversion", "Review nominalization"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("synthesize", "ترکیب کردن", "Synthesize your understanding.", "درکت را ترکیب کن.", "verb"),
            v("consolidate", "تثبیت کردن", "Consolidate structures.", "ساختارها را تثبیت کن.", "verb"),
            v("mastery", "تسلط", "Toward mastery.", "به سمت تسلط."),
            v("nuance", "ظرافت", "Appreciate nuance.", "ظرافت را درک کن."),
            v("precision", "دقت", "Express with precision.", "با دقت بیان کن.")
        ),
        listOf(
            GrammarSection("Advanced passive", "Memories are said to be reconstructed. The event is believed to have occurred."),
            GrammarSection("Conditional inversion", "Had I known... Were I to return... Should you ever visit..."),
            GrammarSection("Nominalization", "The perception of reality. The manifestation of consciousness.")
        ),
        listOf(
            d("T", "Let's review the advanced structures we've covered.", "بیایید ساختارهای پیشرفته‌ای که پوشش دادیم را مرور کنیم."),
            d("A", "We studied advanced passive with perfect infinitive. The event is believed to have occurred.", "مجهول پیشرفته با مصدر کامل مطالعه کردیم. The event is believed to have occurred."),
            d("B", "And conditional inversion. Had I known, I would have acted differently.", "و وارونگی شرطی. Had I known, I would have acted differently."),
            d("T", "Why is inversion used here?", "چرا وارونگی اینجا استفاده می‌شود؟"),
            d("A", "For formality and emphasis. It's common in academic writing and formal speech.", "برای رسمیت و تأکید. در نوشتار دانشگاهی و گفتار رسمی رایج است."),
            d("T", "Nominalization?", "اسم‌سازی؟"),
            d("B", "Turning verbs and adjectives into nouns. 'The perception of reality' instead of 'how we perceive reality'.", "تبدیل فعل و صفت به اسم. 'The perception of reality' به جای 'how we perceive reality'."),
            d("T", "When is nominalization useful?", "کِی اسم‌سازی مفید است؟"),
            d("A", "In formal and academic contexts. It allows for denser, more abstract expression.", "در بافت‌های رسمی و دانشگاهی. بیان متراکم‌تر و انتزاعی‌تر را ممکن می‌کند."),
            d("T", "Excellent. You're ready for File 7.", "عالی. برای فایل ۷ آماده‌اید."),
            d("B", "Level 5 is genuinely challenging.", "سطح ۵ واقعاً چالش‌برانگیز است."),
            d("T", "It is. But you're handling it admirably.", "هست. ولی عالی مدیریتش می‌کنید."),
            d("A", "Thank you. We're committed to reaching C1.", "ممنون. متعهد به رسیدن به C1 هستیم."),
            d("T", "And you will. Perseverance is everything.", "و خواهید رسید. پشتکار همه چیز است."),
            d("B", "Onward, then.", "پس به جلو.")
        ),
        listOf(
            q("When is inversion used?", listOf("informally", "formally", "never"), 1),
            q("What does nominalization do?", listOf("makes denser", "shortens", "changes meaning"), 0),
            q("The event ___ to have occurred.", listOf("is believed", "believes", "believing"), 0),
            q("___ I known, I would have acted.", listOf("Had", "Have", "Has"), 0)
        ),
        idioms = listOf(IdiomExpression("Onward", "به جلو", "Onward, then.", "پس به جلو.")),
        pron = listOf(PronunciationTip("Advanced discourse", "Speak with measured pace. Pause before complex structures.")),
        cult = listOf(CulturalNote("Advanced English", "C1 mastery involves not just accuracy but register awareness and stylistic control.")),
        mis = listOf(
            CommonMistake("The event believes to have occurred.", "The event is believed to have occurred.", "Passive needed."),
            CommonMistake("Have I known, I would have acted.", "Had I known, I would have acted.", "Had, not have, in inversion.")
        )
    )

    // ═══════════ FILE 4 — Time and existence ═══════════

    private fun f4A() = base(16, "4A The philosophy of time", "۴A فلسفه زمان",
        listOf(
            "Use future in the past and complex tense structures",
            "Discuss philosophical concepts of time",
            "Express temporal relationships"
        ),
        listOf(
            v("temporal", "زمانی", "Temporal experience.", "تجربه زمانی.", "adjective"),
            v("simultaneous", "همزمان", "Simultaneous events.", "رویدادهای همزمان.", "adjective"),
            v("sequential", "متوالی", "Sequential order.", "ترتیب متوالی.", "adjective"),
            v("chronological", "گاه‌شمارانه", "Chronological narrative.", "روایت گاه‌شمارانه.", "adjective"),
            v("eternal", "ابدی", "Eternal recurrence.", "عود ابدی.", "adjective"),
            v("fleeting", "گذرا", "Fleeting moments.", "لحظات گذرا.", "adjective"),
            v("duration", "مدت", "Subjective duration.", "مدت ذهنی."),
            v("instantaneous", "آنی", "Instantaneous experience.", "تجربه آنی.", "adjective"),
            v("anachronistic", "زمان‌ناهمگون", "Anachronistic thinking.", "تفکر زمان‌ناهمگون.", "adjective"),
            v("precede", "مقدم بودن", "Events preceding the war.", "رویدادهای مقدم بر جنگ.", "verb"),
            v("succeed", "پیرو بودن", "The years succeeding the war.", "سال‌های پیرو جنگ.", "verb"),
            v("temporal paradox", "پارادوکس زمانی", "A temporal paradox.", "پارادوکس زمانی.")
        ),
        listOf(
            GrammarSection("Future in the past", "He said he would arrive by noon. I thought I would have finished by then."),
            GrammarSection("Complex tense sequencing", "By the time you read this, I will have left."),
            GrammarSection("Time clause combinations", "Whenever I think of it, I remember that I had been warned."),
            GrammarSection("Habitual past", "I would sit for hours, contemplating."),
            GrammarSection("Narrative present for timeless truths", "Time flows, unceasing, indifferent to our experience of it.")
        ),
        listOf(
            d("A", "Do you think time is real, or is it merely a feature of human perception?", "فکر می‌کنی زمان واقعی‌ست، یا صرفاً ویژگی ادراک انسانی‌ست؟"),
            d("B", "A classic question. Physicists tend to say it's real — or at least, that it's woven into the fabric of the universe.", "سؤال کلاسیک. فیزیکدانان تمایل دارند بگویند واقعی‌ست — یا حداقل، در بافت جهان تنیده شده."),
            d("A", "But our experience of it seems so subjective. An hour can feel like a moment, or an eternity.", "ولی تجربه ما از آن خیلی ذهنی به نظر می‌رسد. یک ساعت می‌تواند مثل یک لحظه، یا یک ابدیت حس شود."),
            d("B", "Indeed. Which suggests that what we call 'time' may be two things: physical time, and psychological time. They don't always align.", "همینطور. که نشان می‌دهد آنچه 'زمان' می‌نامیم ممکن است دو چیز باشد: زمان فیزیکی، و زمان روانشناختی. همیشه هم‌راستا نیستند."),
            d("A", "That's a useful distinction. Do you think one is more fundamental?", "تمایز مفیدی‌ست. فکر می‌کنی یکی بنیادین‌تر است؟"),
            d("B", "Physical time, I'd argue, is more fundamental in the sense that it exists independently of observers. But psychological time is what we actually live.", "استدلال می‌کنم زمان فیزیکی بنیادین‌تر است از این نظر که مستقل از ناظران وجود دارد. ولی زمان روانشناختی چیزی‌ست که واقعاً زندگی می‌کنیم."),
            d("A", "Would you say we're trapped in the present?", "می‌گویی در حال گیر افتاده‌ایم؟"),
            d("B", "In a manner of speaking. We can remember the past and anticipate the future, but we can only ever inhabit the now.", "به نوعی. می‌توانیم گذشته را به یاد آوریم و آینده را پیش‌بینی کنیم، ولی فقط می‌توانیم در اکنون ساکن باشیم."),
            d("A", "And yet we spend so much of our lives either regretting or worrying — as though we could escape the present.", "و با این حال اینقدر از زندگی‌مان را یا پشیمان یا نگران می‌گذرانیم — گویی می‌توانیم از حال فرار کنیم."),
            d("B", "A tragic irony, when you think about it. If we had been wiser, we might have understood that the present is all we ever truly have.", "طنز غم‌انگیزی‌ست، وقتی فکر می‌کنی. اگر عاقل‌تر بودیم، ممکن بود بفهمیم که حال تمام چیزی‌ست که واقعاً داریم."),
            d("A", "Do you think that's why mindfulness has become so popular?", "فکر می‌کنی برای همین ذهن‌آگاهی اینقدر محبوب شده؟"),
            d("B", "Partly. It's an attempt to reclaim the present from the tyranny of past and future.", "تا حدی. تلاشی‌ست برای بازپس‌گیری حال از استبداد گذشته و آینده."),
            d("A", "Do you practise it?", "تمرینش می‌کنی؟"),
            d("B", "I try. When I'm walking, I remind myself to notice the present. Otherwise, my mind drifts, and I've arrived at my destination without any memory of the journey.", "سعی می‌کنم. وقتی قدم می‌زنم، به خودم یادآوری می‌کنم که حال را متوجه شوم. وگرنه، ذهنم می‌رود، و بدون هیچ خاطره‌ای از سفر به مقصد رسیده‌ام."),
            d("A", "A common experience.", "تجربه رایجی‌ست."),
            d("B", "And a poignant one. We miss so much of our own lives.", "و تکان‌دهنده. اینقدر از زندگی‌های خودمان را از دست می‌دهیم."),
            d("A", "Well, on that philosophical note...", "خب، بر این اساس فلسفی..."),
            d("B", "Shall we take a walk, and try to be present?", "قدم بزنیم و سعی کنیم حاضر باشیم؟"),
            d("A", "An excellent suggestion.", "پیشنهاد عالی‌ای‌ست.")
        ),
        listOf(
            q("How does B distinguish time?", listOf("real/imaginary", "physical/psychological", "fast/slow"), 1),
            q("What does B say we can inhabit?", listOf("past", "future", "present"), 2),
            q("I thought I ___ have finished by then.", listOf("would", "will", "was"), 0),
            q("By the time you read this, I ___ have left.", listOf("will", "would", "am"), 0)
        ),
        idioms = listOf(
            IdiomExpression("In a manner of speaking", "به نوعی", "In a manner of speaking.", "به نوعی."),
            IdiomExpression("When you think about it", "وقتی فکر می‌کنی", "When you think about it.", "وقتی فکر می‌کنی."),
            IdiomExpression("Drift", "پرسه زدن ذهن", "My mind drifts.", "ذهنم پرسه می‌زند.")
        ),
        pron = listOf(
            PronunciationTip("Complex tense", "Stress the auxiliary: I thought I WOULD have finished. By the time you read this, I WILL have left.")
        ),
        cult = listOf(
            CulturalNote("Philosophy of time", "Aristotle, Augustine, Kant, and Heidegger all grappled with time. Modern physics complicates the picture further.")
        ),
        mis = listOf(
            CommonMistake("I thought I would finished by then.", "I thought I would have finished by then.", "Would have + past participle."),
            CommonMistake("By the time you read this, I will left.", "By the time you read this, I will have left.", "Future perfect needed.")
        )
    )

    private fun f4B() = base(17, "4B Life and death", "۴B زندگی و مرگ",
        listOf(
            "Use philosophical registers",
            "Discuss mortality and meaning",
            "Express existential themes"
        ),
        listOf(
            v("mortality", "مرگ‌ومیر", "Awareness of mortality.", "آگاهی از مرگ‌ومیر."),
            v("existential", "اگزیستانسیال", "An existential crisis.", "بحران اگزیستانسیال.", "adjective"),
            v("finitude", "محدودیت", "The finitude of life.", "محدودیت زندگی."),
            v("transient", "گذرا", "Transient existence.", "وجود گذرا.", "adjective"),
            v("ephemeral", "زودگذر", "Ephemeral pleasures.", "لذت‌های زودگذر.", "adjective"),
            v("legacy", "میراث", "Leave a legacy.", "میراثی بگذار."),
            v("mortality", "فناپذیری", "Confront mortality.", "با فناپذیری روبرو شو."),
            v("meaning", "معنا", "The meaning of life.", "معنای زندگی."),
            v("absurd", "پوچ", "The absurdity of existence.", "پوچی وجود.", "adjective"),
            v("authentic", "اصیل", "An authentic existence.", "وجود اصیل.", "adjective"),
            v("contemplate", "تعمق کردن", "Contemplate existence.", "در وجود تعمق کن.", "verb"),
            v("sublime", "والا", "The sublime in nature.", "والایی در طبیعت.", "adjective")
        ),
        listOf(
            GrammarSection("Philosophical register", "It could be contended that... One might argue... It is perhaps the case that..."),
            GrammarSection("Concessive and adversative", "Though we may fear death, we cannot avoid it. Whereas some find meaning, others find absurdity."),
            GrammarSection("Existential emphasis", "It is death, above all, that gives life its urgency.")
        ),
        listOf(
            d("A", "Do you ever think about your own mortality?", "هرگز به فناپذیری خودت فکر می‌کنی؟"),
            d("B", "More than I'd like to admit. It's something of a preoccupation, actually.", "بیشتر از آنچه دوست دارم اعتراف کنم. در واقع تا حدی دغدغه‌ام است."),
            d("A", "Does it frighten you?", "می‌ترساندت؟"),
            d("B", "Not the fact of it, so much as the finality. That there will come a moment after which I will never again think, feel, or love.", "خود واقعیت را نه، بیشتر قطعیت را. اینکه لحظه‌ای خواهد آمد که بعد از آن هرگز دیگر فکر نخواهم کرد، احساس نخواهم کرد، عشق نخواهم ورزید."),
            d("A", "That's a heavy thought.", "فکر سنگینی‌ست."),
            d("B", "It is. And yet, paradoxically, it's precisely that finitude which makes life meaningful. Were we to live forever, nothing would matter.", "هست. و با این حال، به طور پارادوکسیکال، دقیقاً همین محدودیت است که به زندگی معنا می‌دهد. اگر تا ابد زندگی می‌کردیم، هیچ چیز مهم نبود."),
            d("A", "A common existentialist argument. Do you find it consoling?", "استدلال اگزیستانسیالیستی رایجی‌ست. تسلی‌بخش می‌یابیش؟"),
            d("B", "Sometimes. Other times, I find the whole thing absurd. We strive, we love, we create — and then it all vanishes.", "گاهی. زمان‌های دیگر، کل موضوع را پوچ می‌یابم. تلاش می‌کنیم، عشق می‌ورزیم، خلق می‌کنیم — و بعد همه ناپدید می‌شود."),
            d("A", "Yet the striving itself has value, doesn't it? The process, not just the outcome?", "و با این حال خود تلاش ارزش دارد، نه؟ فرآیند، نه فقط نتیجه؟"),
            d("B", "I'd like to think so. Though I'm not sure the universe cares one way or the other.", "دوست دارم فکر کنم. هرچند مطمئن نیستم جهان یکی از این دو را اهمیت دهد."),
            d("A", "Perhaps the universe's indifference is precisely what frees us. We create our own meaning, unburdened by cosmic demands.", "شاید بی‌تفاوتی جهان دقیقاً چیزی‌ست که ما را آزاد می‌کند. معنای خودمان را خلق می‌کنیم، بدون بار خواسته‌های کیهانی."),
            d("B", "That's Camus's position, more or less. Embrace the absurd, and live fully nonetheless.", "این موضع کامو است، کمابیش. پوچی را بپذیر، و با این حال کاملاً زندگی کن."),
            d("A", "Do you find that satisfying?", "رضایت‌بخش می‌یابیش؟"),
            d("B", "On good days, yes. On bad days, it feels like whistling in the dark.", "در روزهای خوب، بله. در روزهای بد، مثل سوت زدن در تاریکی حس می‌شود."),
            d("A", "That's honest.", "صادقانه است."),
            d("B", "I've always thought that a philosophy that can't survive a bad day isn't much of a philosophy at all.", "همیشه فکر کرده‌ام فلسفه‌ای که نتواند یک روز بد را تحمل کند، اصلاً چندان فلسفه‌ای نیست."),
            d("A", "What does survive, for you?", "چه چیزی برایت می‌ماند؟"),
            d("B", "Connection, I think. Love, friendship, the moments of genuine presence with another person. Those are the things that redeem existence.", "ارتباط، فکر می‌کنم. عشق، دوستی، لحظات حضور واقعی با شخص دیگر. این‌ها چیزهایی هستند که وجود را نجات می‌دهند."),
            d("A", "That's beautiful.", "قشنگه."),
            d("B", "It's the only thing I've found that holds up.", "تنها چیزی‌ست که یافته‌ام دوام می‌آورد.")
        ),
        listOf(
            q("What frightens B?", listOf("death itself", "finality", "pain"), 1),
            q("What redeems existence for B?", listOf("success", "connection", "money"), 1),
            q("It is death, above all, ___ gives life urgency.", listOf("that", "which", "what"), 0),
            q("___ we may fear death, we cannot avoid it.", listOf("Though", "Because", "Since"), 0)
        ),
        idioms = listOf(
            IdiomExpression("More than I'd like to admit", "بیشتر از آنچه دوست دارم اعتراف کنم", "More than I'd like to admit.", "بیشتر از آنچه دوست دارم اعتراف کنم."),
            IdiomExpression("Whistling in the dark", "سوت زدن در تاریکی", "Like whistling in the dark.", "مثل سوت زدن در تاریکی."),
            IdiomExpression("Hold up", "دوام آوردن", "It's the only thing that holds up.", "تنها چیزی‌ست که دوام می‌آورد.")
        ),
        pron = listOf(
            PronunciationTip("Philosophical register", "Slow, measured speech. Pause for emphasis. Let gravity settle.")
        ),
        cult = listOf(
            CulturalNote("Existentialism", "Kierkegaard, Nietzsche, Sartre, Camus. Existentialist thought emphasises individual freedom, choice, and the creation of meaning in an indifferent universe.")
        ),
        mis = listOf(
            CommonMistake("It is death, above all, which gives life urgency.", "It is death, above all, that gives life urgency.", "Use 'that' in cleft sentences (though 'which' is sometimes accepted)."),
            CommonMistake("Though we may fear death, but we cannot avoid it.", "Though we may fear death, we cannot avoid it.", "Don't use 'but' with 'though'.")
        )
    )

    private fun f4C() = base(18, "4C The meaning of life", "۴C معنای زندگی",
        listOf(
            "Use rhetorical and philosophical structures",
            "Explore ultimate questions",
            "Express nuanced philosophical positions"
        ),
        listOf(
            v("teleology", "غایت‌شناسی", "Teleological arguments.", "استدلال‌های غایت‌شناختی."),
            v("purpose", "هدف", "A sense of purpose.", "حس هدف."),
            v("absurdity", "پوچی", "The absurdity of existence.", "پوچی وجود."),
            v("authenticity", "اصالت", "Live with authenticity.", "با اصالت زندگی کن."),
            v("transcendence", "تعالی", "Moments of transcendence.", "لحظات تعالی."),
            v("immanence", "حلول", "The immanence of being.", "حلول وجود."),
            v("existentialism", "اگزیستانسیالیسم", "Existentialist philosophy.", "فلسفه اگزیستانسیالیستی."),
            v("nihilism", "نیهیلیسم", "Nihilism rejects meaning.", "نیهیلیسم معنا را رد می‌کند."),
            v("sublimation", "تعالی بخشیدن", "Sublimation of desire.", "تعالی بخشیدن به میل."),
            v("flourish", "شکوفا شدن", "Human flourishing.", "شکوفایی انسانی.", "verb"),
            v("contemplation", "تعمق", "Deep contemplation.", "تعمق عمیق."),
            v("reverence", "احترام", "Reverence for life.", "احترام به زندگی.")
        ),
        listOf(
            GrammarSection("Philosophical questions", "What is the meaning of life? Is there any purpose to existence?"),
            GrammarSection("Nominal clauses as subjects", "What matters most is how we treat others. Whether we find meaning is up to us."),
            GrammarSection("Rhetorical structures", "Is it not the case that...? Who among us has not wondered...?")
        ),
        listOf(
            d("A", "Do you think life has an inherent meaning, or do we create our own?", "فکر می‌کنی زندگی معنای ذاتی دارد، یا ما خودمان معنایمان را خلق می‌کنیم؟"),
            d("B", "A question that has occupied philosophers for millennia, and to which no definitive answer has ever been given.", "سؤالی که هزاران سال فیلسوفان را مشغول کرده، و هیچ پاسخ قطعی به آن داده نشده."),
            d("A", "Which side do you lean toward?", "به کدام سمت تمایل داری؟"),
            d("B", "I lean toward the view that meaning is constructed, not discovered. It's something we forge in the living of our lives.", "به این دیدگاه تمایل دارم که معنا ساخته می‌شود، نه کشف. چیزی‌ست که در زیستن زندگی‌هایمان می‌سازیم."),
            d("A", "That's a very existentialist position.", "موضع خیلی اگزیستانسیالیستی‌ست."),
            d("B", "It is, though I wouldn't call myself an existentialist in any orthodox sense. There are elements of other traditions I find compelling too.", "هست، هرچند خودم را اگزیستانسیالیست به معنای ارتدکس نمی‌نامم. عناصری از سنت‌های دیگر هم هست که قانع‌کننده می‌یابم."),
            d("A", "Such as?", "مثل چه؟"),
            d("B", "Virtue ethics, for instance. The idea that we flourish by cultivating character rather than by maximising pleasure or following rules.", "مثلاً اخلاق فضیلت. ایده اینکه با پرورش شخصیت شکوفا می‌شویم نه با حداکثر کردن لذت یا پیروی از قوانین."),
            d("A", "And yet you maintain that meaning is constructed?", "و با این حال حفظ می‌کنی که معنا ساخته می‌شود؟"),
            d("B", "I see no contradiction. Virtues are dispositions we cultivate. What matters is that we choose to cultivate them.", "تناقضی نمی‌بینم. فضیلت‌ها تمایلاتی هستند که پرورش می‌دهیم. مهم این است که انتخاب می‌کنیم پرورششان دهیم."),
            d("A", "Some would say that's an illusion — that we're determined by forces beyond our control.", "بعضی می‌گویند این توهم است — که توسط نیروهای فراتر از کنترل ما تعیین می‌شویم."),
            d("B", "Perhaps. But even if determinism is true, the experience of choosing remains. And that experience is what we live.", "شاید. ولی حتی اگر جبرگرایی درست باشد، تجربه انتخاب می‌ماند. و آن تجربه چیزی‌ست که زندگی می‌کنیم."),
            d("A", "Do you think most people find meaning, or just get by?", "فکر می‌کنی بیشتر مردم معنا پیدا می‌کنند، یا فقط سر می‌کنند؟"),
            d("B", "I suspect most people find fragments of meaning without ever articulating them. A child's laugh, a sunset, a moment of genuine kindness.", "گمان می‌کنم بیشتر مردم تکه‌هایی از معنا را می‌یابند بدون اینکه هرگز بیانش کنند. خنده کودکی، غروبی، لحظه‌ای از مهربانی واقعی."),
            d("A", "And that's enough?", "و این کافیه؟"),
            d("B", "It has to be. We are, after all, transient beings. To demand eternal meaning from an ephemeral existence is to set ourselves up for despair.", "باید باشد. ما، بعد از همه، موجوداتی گذرا هستیم. خواستن معنای ابدی از وجودی زودگذر، آماده کردن خودمان برای ناامیدی‌ست."),
            d("A", "That's a sobering but strangely consoling thought.", "فکر هوشیارکننده ولی به طور عجیبی تسلی‌بخشی‌ست."),
            d("B", "I find it so. Were we to demand more, we'd only be disappointed.", "من همینطور می‌یابمش. اگر بیشتر می‌خواستیم، فقط ناامید می‌شدیم."),
            d("A", "Well, on that profound note, shall we have another coffee?", "خب، بر این اساس عمیق، یک قهوه دیگر بخوریم؟"),
            d("B", "A consummation devoutly to be wished.", "اتمامی که مؤمنانه آرزو می‌شود.")
        ),
        listOf(
            q("What does B think of meaning?", listOf("inherent", "constructed", "impossible"), 1),
            q("Which tradition does B also value?", listOf("nihilism", "virtue ethics", "materialism"), 1),
            q("___ matters most is how we treat others.", listOf("What", "That", "Which"), 0),
            q("Is it not the case ___ we all seek meaning?", listOf("that", "which", "what"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Get by", "سر کردن", "Just get by.", "فقط سر کردن."),
            IdiomExpression("Set ourselves up", "خودمان را آماده کردن", "Set ourselves up for despair.", "خودمان را برای ناامیدی آماده کردن."),
            IdiomExpression("On that note", "بر این اساس", "On that note, shall we?", "بر این اساس، بیایید؟")
        ),
        pron = listOf(
            PronunciationTip("Philosophical register", "A measured, contemplative tone. Pause to let ideas resonate. Avoid rushing.")
        ),
        cult = listOf(
            CulturalNote("Meaning of life", "From Aristotle's eudaimonia to Viktor Frankl's logotherapy, humans have sought frameworks for meaning across cultures and eras.")
        ),
        mis = listOf(
            CommonMistake("What matters most it's how we treat others.", "What matters most is how we treat others.", "Use 'is', not 'it's'."),
            CommonMistake("We are, after all, transient beings, aren't we?", "We are, after all, transient beings.", "Fine in context; avoid unnecessary tag in formal register.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 4 ═══════════

    private fun pe4() = base(19, "PE4 An academic seminar", "انگلیسی کاربردی ۴ — سمینار دانشگاهی",
        listOf(
            "Participate in academic discussion",
            "Present research findings",
            "Respond to critical questions"
        ),
        listOf(
            v("methodology", "روش‌شناسی", "Rigorous methodology.", "روش‌شناسی دقیق."),
            v("hypothesis", "فرضیه", "Test the hypothesis.", "فرضیه را آزمایش کن."),
            v("empirical", "تجربی", "Empirical evidence.", "شواهد تجربی.", "adjective"),
            v("correlation", "همبستگی", "A strong correlation.", "همبستگی قوی."),
            v("causation", "علیت", "Correlation vs causation.", "همبستگی در برابر علیت."),
            v("paradigm", "پارادایم", "A new paradigm.", "پارادایم جدید."),
            v("substantiate", "اثبات کردن", "Substantiate the claim.", "ادعا را اثبات کن.", "verb"),
            v("controversial", "بحث‌برانگیز", "A controversial thesis.", "پایان‌نامه بحث‌برانگیز.", "adjective"),
            v("rigorous", "دقیق", "Rigorous analysis.", "تحلیل دقیق.", "adjective"),
            v("replicate", "تکرار کردن", "Replicate the study.", "مطالعه را تکرار کن.", "verb"),
            v("peer-reviewed", "داوری‌شده", "Peer-reviewed journal.", "مجله داوری‌شده.", "adjective"),
            v("dissertation", "رساله", "Doctoral dissertation.", "رساله دکتری.")
        ),
        listOf(
            GrammarSection("Academic hedging", "It would appear that... The evidence suggests... One might reasonably infer..."),
            GrammarSection("Reporting findings", "The study demonstrated that... It has been shown that... Our findings indicate..."),
            GrammarSection("Responding to criticism", "That's a valid concern, however... While I acknowledge that..., I would argue...")
        ),
        listOf(
            d("A", "Thank you for that presentation. I have a few questions, if I may.", "ممنون از آن ارائه. چند سؤال دارم، اگر اجازه بدهید."),
            d("B", "Of course. I welcome the scrutiny.", "البته. استقبال می‌کنم از بررسی دقیق."),
            d("A", "You claim a strong correlation between social media use and declining attention spans. But how do you rule out reverse causation?", "شما همبستگی قوی بین استفاده از شبکه‌های اجتماعی و کاهش دامنه توجه ادعا می‌کنید. ولی چطور علّیت معکوس را رد می‌کنید؟"),
            d("B", "An excellent question. We controlled for that by tracking participants longitudinally over five years. Those who initially had shorter attention spans didn't subsequently increase their social media use more than others.", "سؤال عالی‌ای‌ست. با ردیابی طولی شرکت‌کنندگان در طول پنج سال آن را کنترل کردیم. کسانی که در ابتدا دامنه توجه کوتاه‌تری داشتند، بعداً استفاده‌شان از شبکه‌های اجتماعی بیشتر از دیگران افزایش نیافت."),
            d("A", "But longitudinal studies are notoriously subject to attrition bias. How did you address that?", "ولی مطالعات طولی به طور بدنامی در معرض سوگیری ریزش هستند. چطور به آن پرداختید؟"),
            d("B", "We used multiple imputation for missing data. That's a standard technique. Nonetheless, I concede it's not a perfect solution.", "از imputation چندگانه برای داده‌های گمشده استفاده کردیم. تکنیک استانداردی‌ست. با این حال، اقرار می‌کنم راه‌حل کاملی نیست."),
            d("A", "And you're confident in the effect size?", "و به اندازه اثر مطمئن هستید؟"),
            d("B", "Reasonably. The effect was modest but statistically significant, with a p-value below 0.01.", "نسبتاً. اثر متوسط ولی از نظر آماری معنادار بود، با p-value زیر ۰٫۰۱."),
            d("A", "Has the study been peer-reviewed?", "مطالعه داوری شده است؟"),
            d("B", "It has. It was published in the Journal of Applied Psychology last month.", "بله. ماه پیش در مجله روانشناسی کاربردی منتشر شد."),
            d("A", "Have others attempted to replicate it?", "دیگران تلاش کرده‌اند تکرارش کنند؟"),
            d("B", "Two independent groups have, with broadly similar findings. That gives me more confidence.", "دو گروه مستقل، با یافته‌های تقریباً مشابه. این به من اعتماد بیشتری می‌دهد."),
            d("A", "One final question. You've argued for policy intervention. But isn't that a leap from empirical findings to normative claims?", "یک سؤال نهایی. شما برای مداخله سیاستی استدلال کرده‌اید. ولی این جهشی از یافته‌های تجربی به ادعاهای هنجاری نیست؟"),
            d("B", "That's a fair critique, and a classic philosophical problem. I'd maintain that if we accept harm prevention as a legitimate goal, then the inference is defensible.", "انتقاد منصفانه‌ای‌ست، و یک مسئله فلسفی کلاسیک. استدلال می‌کنم اگر جلوگیری از آسیب را به عنوان هدف مشروع بپذیریم، آنگاه استنتاج قابل دفاع است."),
            d("A", "But that premise itself is contested.", "ولی خود آن مقدمه مورد مناقشه است."),
            d("B", "It is. But so is every foundational premise. At some point, we must simply choose what we stand for.", "هست. ولی هر مقدمه بنیادین همینطور است. در نقطه‌ای، باید فقط انتخاب کنیم برای چه ایستاده‌ایم."),
            d("A", "Thank you. I found that very illuminating.", "ممنون. بسیار روشنگر یافتم."),
            d("B", "And I appreciate the challenge. It sharpens the thinking.", "و من چالش را قدردانی می‌کنم. تفکر را تیز می‌کند.")
        ),
        listOf(
            q("What's A's main concern?", listOf("sample size", "reverse causation", "funding"), 1),
            q("How does B address attrition?", listOf("imputation", "ignore", "add subjects"), 0),
            q("The evidence ___ that social media affects attention.", listOf("suggests", "suggest", "suggesting"), 0),
            q("While I ___ that, I would argue...", listOf("acknowledge", "acknowledging", "acknowledged"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Rule out", "رد کردن", "How do you rule out reverse causation?", "چطور علّیت معکوس را رد می‌کنید؟"),
            IdiomExpression("Leap from", "جهش کردن از", "A leap from findings to claims.", "جهشی از یافته‌ها به ادعاها."),
            IdiomExpression("At some point", "در نقطه‌ای", "At some point, we must choose.", "در نقطه‌ای، باید انتخاب کنیم.")
        ),
        pron = listOf(
            PronunciationTip("Academic register", "Measured pace. Precise articulation. Pause before technical terms: reverse causation, peer-reviewed.")
        ),
        cult = listOf(
            CulturalNote("Academic culture", "In Western academia, critical questioning is a sign of respect and engagement. In some cultures, it may be perceived as confrontational.")
        ),
        mis = listOf(
            CommonMistake("The evidence suggest...", "The evidence suggests...", "Subject-verb agreement (evidence is singular)."),
            CommonMistake("While I acknowledge that, but I would argue...", "While I acknowledge that, I would argue...", "No 'but' with 'while'.")
        )
    )

    // ═══════════ REVIEW 4 ═══════════

    private fun rc78() = base(20, "R&C 7&8", "مرور ۷ و ۸",
        listOf("Review future in the past", "Review philosophical register", "Review nominal clauses"),
        listOf(
            v("review", "مرور", "Let's review.", "بیایید مرور کنیم.", "verb"),
            v("synthesize", "ترکیب کردن", "Synthesize concepts.", "مفاهیم را ترکیب کن.", "verb"),
            v("consolidate", "تثبیت کردن", "Consolidate mastery.", "تسلط را تثبیت کن.", "verb"),
            v("nuance", "ظرافت", "Express with nuance.", "با ظرافت بیان کن."),
            v("precision", "دقت", "Verbal precision.", "دقت کلامی."),
            v("fluency", "روانی", "Sophisticated fluency.", "روانی پیچیده.")
        ),
        listOf(
            GrammarSection("Future in the past", "He said he would arrive. I thought I would have finished."),
            GrammarSection("Philosophical register", "It could be contended that... One might argue that..."),
            GrammarSection("Nominal clauses", "What matters is... Whether we find meaning is...")
        ),
        listOf(
            d("T", "Let's review the philosophical structures from Files 7 and 8.", "بیایید ساختارهای فلسفی فایل‌های ۷ و ۸ را مرور کنیم."),
            d("A", "We studied future in the past. I thought I would have finished by then.", "آینده در گذشته مطالعه کردیم. I thought I would have finished by then."),
            d("B", "And philosophical register. It could be contended that existence precedes essence.", "و لحن فلسفی. It could be contended that existence precedes essence."),
            d("T", "Why use the passive here?", "چرا اینجا مجهول استفاده می‌شود؟"),
            d("A", "To create distance and formality. It's common in academic and philosophical writing.", "برای ایجاد فاصله و رسمیت. در نوشتار دانشگاهی و فلسفی رایج است."),
            d("T", "Nominal clauses?", "جملات اسمی؟"),
            d("B", "What matters most is how we live. Whether we find meaning is up to us.", "What matters most is how we live. Whether we find meaning is up to us."),
            d("T", "Excellent. How would you describe your level now?", "عالی. سطحتان را الان چطور توصیف می‌کنید؟"),
            d("A", "Substantially more sophisticated. We can discuss abstract concepts with precision.", "به طور قابل توجهی پیچیده‌تر. می‌توانیم مفاهیم انتزاعی را با دقت بحث کنیم."),
            d("B", "I feel we've moved from fluency to mastery.", "احساس می‌کنم از روانی به تسلط حرکت کرده‌ایم."),
            d("T", "That's exactly right. You're operating at C1 level now.", "دقیقاً درست است. الان در سطح C1 کار می‌کنید."),
            d("A", "It's been quite a journey.", "سفر قابل توجهی بوده."),
            d("B", "Indeed. Onward to File 9.", "همینطور. به جلو به فایل ۹."),
            d("T", "Excellent attitude. Let's continue.", "نگرش عالی. بیایید ادامه دهیم.")
        ),
        listOf(
            q("Why use passive in philosophy?", listOf("informal", "formality", "clarity"), 1),
            q("What does B say about level?", listOf("fluency to mastery", "beginner", "intermediate"), 0),
            q("I thought I ___ have finished.", listOf("would", "will", "was"), 0),
            q("___ matters most is how we live.", listOf("What", "That", "Which"), 0)
        ),
        idioms = listOf(IdiomExpression("Onward", "به جلو", "Onward to File 9.", "به جلو به فایل ۹.")),
        pron = listOf(PronunciationTip("Formal register", "Precise articulation. Avoid contractions in the most formal contexts.")),
        cult = listOf(CulturalNote("C1 level", "C1 users can understand a wide range of demanding texts, express ideas fluently and spontaneously, and use language flexibly.")),
        mis = listOf(
            CommonMistake("I thought I will have finished.", "I thought I would have finished.", "Would, not will, in reported past."),
            CommonMistake("That matters most is how we live.", "What matters most is how we live.", "Use 'what' as subject nominal.")
        )
    )

    // ═══════════ FILE 5 — Art and aesthetics ═══════════

    private fun f5A() = base(21, "5A What is art?", "۵A هنر چیست؟",
        listOf("Use aesthetic vocabulary", "Discuss the nature of art", "Express subjective judgments"),
        listOf(
            v("aesthetic", "زیبایی‌شناختی", "Aesthetic judgment.", "قضاوت زیبایی‌شناختی.", "adjective"),
            v("provocative", "تحریک‌کننده", "A provocative piece.", "اثر تحریک‌کننده.", "adjective"),
            v("subjective", "ذهنی", "Subjective taste.", "سلیقه ذهنی.", "adjective"),
            v("objective", "عینی", "Objective criteria.", "معیارهای عینی.", "adjective"),
            v("canon", "کانن", "The Western canon.", "کانن غربی."),
            v("avant-garde", "آوانگارد", "Avant-garde movements.", "جنبش‌های آوانگارد."),
            v("transcend", "فراتر رفتن", "Transcend boundaries.", "از مرزها فراتر رو.", "verb"),
            v("evoke", "برانگیختن", "Evoke emotion.", "احساس را برانگیز.", "verb"),
            v("interpretation", "تفسیر", "Multiple interpretations.", "تفسیرهای متعدد."),
            v("intention", "قصد", "The artist's intention.", "قصد هنرمند."),
            v("craft", "صنعت", "Mastery of craft.", "تسلط بر صنعت."),
            v("profound", "عمیق", "A profound work.", "اثر عمیق.", "adjective")
        ),
        listOf(
            GrammarSection("Subjective vs objective language", "It seems to me... In my view... Arguably... It's debatable whether..."),
            GrammarSection("Aesthetic evaluation", "There's something deeply moving about... What strikes me is..."),
            GrammarSection("Qualifying judgments", "To some extent, ... In certain respects, ... While I wouldn't go so far as to say...")
        ),
        listOf(
            d("A", "Do you think there are objective standards for what makes good art?", "فکر می‌کنی معیارهای عینی برای هنر خوب وجود دارد؟"),
            d("B", "That's a question that has divided critics for centuries. To some extent, yes; but ultimately, I suspect it's largely subjective.", "سؤالی که قرن‌ها منتقدان را تقسیم کرده. تا حدی، بله؛ ولی در نهایت، گمان می‌کنم عمدتاً ذهنی‌ست."),
            d("A", "But surely some works are universally admired?", "ولی قطعاً بعضی آثار جهانی تحسین می‌شوند؟"),
            d("B", "They are, but that could simply reflect shared cultural conditioning rather than objective merit. What one culture reveres, another may find banal.", "می‌شوند، ولی این می‌تواند صرفاً بازتاب شرطی‌سازی فرهنگی مشترک باشد نه ارزش عینی. آنچه یک فرهنگ می‌پرستد، دیگری ممکن است پیش‌پاافتاده بیابد."),
            d("A", "So you'd say the Western canon is arbitrary?", "پس می‌گویی کانن غربی دلبخواهی‌ست؟"),
            d("B", "Not arbitrary exactly, but contingent — shaped by power, history, and chance as much as by intrinsic quality.", "دقیقاً دلبخواهی نه، ولی وابسته — به اندازه کیفیت درونی، توسط قدرت، تاریخ، و شانس شکل گرفته."),
            d("A", "What about technical skill? Surely that's objective?", "مهارت فنی چطور؟ قطعاً این عینی‌ست؟"),
            d("B", "Skill can be measured, yes. But skill alone doesn't make great art. Some of the most technically accomplished works are deeply boring.", "مهارت قابل اندازه‌گیری‌ست، بله. ولی مهارت به تنهایی هنر بزرگ نمی‌سازد. بعضی از فنی‌ترین آثار عمیقاً کسل‌کننده‌اند."),
            d("A", "Then what distinguishes great art?", "پس چه چیزی هنر بزرگ را متمایز می‌کند؟"),
            d("B", "For me, it's the capacity to evoke something ineffable — a sense of recognition, or of being moved in a way you can't quite articulate.", "برای من، ظرفیت برانگیختن چیزی ناگفتنی‌ست — حسی از بازشناسی، یا تکان خوردن به روشی که نمی‌توانی کاملاً بیانش کنی."),
            d("A", "That sounds rather mystical.", "نسبتاً عرفانی به نظر می‌رسد."),
            d("B", "Perhaps. But I'd argue that's precisely what separates art from mere craft.", "شاید. ولی استدلال می‌کنم دقیقاً همین چیزی‌ست که هنر را از صنعت محض جدا می‌کند."),
            d("A", "What do you make of contemporary art — the sort that seems to require no skill at all?", "نظرت درباره هنر معاصر چیست — نوعی که به نظر می‌رسد هیچ مهارتی لازم ندارد؟"),
            d("B", "Much of it I find pretentious, I'll admit. But some is genuinely provocative, forcing us to reconsider what we mean by 'art'.", "بسیاری از آن را متظاهر می‌یابم، اعتراف می‌کنم. ولی بعضی واقعاً تحریک‌کننده‌اند، ما را مجبور می‌کنند بازنگری کنیم منظورمان از 'هنر' چیست."),
            d("A", "Do you think intention matters? If the artist didn't intend to create art, is it still art?", "فکر می‌کنی قصد مهم است؟ اگر هنرمند قصد خلق هنر نداشت، هنوز هنر است؟"),
            d("B", "A fascinating question. I'd say intention informs but doesn't determine interpretation. Once a work is made, it takes on a life of its own.", "سؤال جذابی‌ست. می‌گویم قصد اطلاع می‌دهد ولی تفسیر را تعیین نمی‌کند. وقتی اثری ساخته می‌شود، زندگی خودش را پیدا می‌کند."),
            d("A", "So the artist's intention is, in a sense, irrelevant?", "پس قصد هنرمند، به یک معنا، بی‌ربط است؟"),
            d("B", "Not irrelevant — informative. But not authoritative. There's something deeply collaborative about interpretation.", "بی‌ربط نه — آگاهی‌بخش. ولی نه معتبر. چیزی عمیقاً مشارکتی در تفسیر هست."),
            d("A", "That's a lovely way to put it.", "بیان قشنگی‌ست."),
            d("B", "Thank you. I find it endlessly fascinating.", "ممنون. بی‌نهایت جذاب می‌یابمش.")
        ),
        listOf(
            q("What does B think of objective standards?", listOf("fully objective", "largely subjective", "irrelevant"), 1),
            q("What distinguishes great art?", listOf("technical skill", "evoking the ineffable", "price"), 1),
            q("To some ___, yes; but ultimately, it's subjective.", listOf("extent", "degree", "point"), 0),
            q("___ I wouldn't go so far as to say it's worthless.", listOf("While", "Because", "Since"), 0)
        ),
        idioms = listOf(
            IdiomExpression("A life of its own", "زندگی خودش", "It takes on a life of its own.", "زندگی خودش را پیدا می‌کند."),
            IdiomExpression("What do you make of?", "نظرت چیه درباره؟", "What do you make of it?", "نظرت چیه درباره‌اش؟"),
            IdiomExpression("For me", "برای من", "For me, it's the capacity to evoke.", "برای من، ظرفیت برانگیختن است.")
        ),
        pron = listOf(PronunciationTip("Aesthetic vocabulary", "Stress key nouns: aesTHETic, proVOcative, AVant-garde, INTention.")),
        cult = listOf(CulturalNote("Art theory", "The debate between objective and subjective aesthetics goes back to Plato and Kant. Modern criticism often emphasises context and reception over intrinsic quality.")),
        mis = listOf(
            CommonMistake("I wouldn't go so far than to say...", "I wouldn't go so far as to say...", "Use 'as' with 'so far'."),
            CommonMistake("The intention of the artist it matters.", "The artist's intention matters.", "Avoid double subject.")
        )
    )

    private fun f5B() = base(22, "5B The role of literature", "۵B نقش ادبیات",
        listOf("Use narrative and analytical structures", "Discuss literature's function", "Express interpretive insights"),
        listOf(
            v("protagonist", "قهرمان", "The protagonist's journey.", "سفر قهرمان."),
            v("narrative", "روایت", "Narrative structure.", "ساختار روایت."),
            v("metaphor", "استعاره", "Extended metaphor.", "استعاره گسترده."),
            v("symbolism", "نمادگرایی", "Rich symbolism.", "نمادگرایی غنی."),
            v("ambiguity", "ابهام", "Productive ambiguity.", "ابهام ثمربخش."),
            v("allegory", "تمثیل", "A political allegory.", "تمثیل سیاسی."),
            v("canonical", "کانونی", "Canonical literature.", "ادبیات کانونی.", "adjective"),
            v("subversive", "براندازانه", "A subversive text.", "متنی براندازانه.", "adjective"),
            v("universal", "جهان‌شمول", "Universal themes.", "مضامین جهان‌شمول.", "adjective"),
            v("contextual", "بافتی", "Contextual meaning.", "معنای بافتی.", "adjective"),
            v("evocative", "برانگیزنده", "Evocative prose.", "نثر برانگیزنده.", "adjective"),
            v("resonance", "طنین", "Emotional resonance.", "طنین احساسی.")
        ),
        listOf(
            GrammarSection("Analytical structures", "What the author seems to suggest is... The novel can be read as..."),
            GrammarSection("Interpretive hedging", "One reading might be... It's tempting to see this as... A plausible interpretation is..."),
            GrammarSection("Textual evidence", "This is borne out by... As evidenced by... Which is underscored by...")
        ),
        listOf(
            d("A", "Why do you think literature matters in an age of instant information?", "چرا فکر می‌کنی ادبیات در عصر اطلاعات آنی مهم است؟"),
            d("B", "Precisely because of that age. Literature offers something that information cannot: depth, ambiguity, the slow unfolding of meaning.", "دقیقاً به خاطر همان عصر. ادبیات چیزی ارائه می‌دهد که اطلاعات نمی‌تواند: عمق، ابهام، گشودگی آهسته معنا."),
            d("A", "Could you elaborate?", "می‌توانی بسط دهی؟"),
            d("B", "Consider how a novel works. It doesn't tell you what to think; it invites you into a world and lets you draw your own conclusions.", "در نظر بگیر رمان چطور کار می‌کند. نمی‌گوید چه فکر کن؛ تو را به جهانی دعوت می‌کند و می‌گذارد نتیجه‌گیری خودت را بکنی."),
            d("A", "But surely some novels are didactic?", "ولی قطعاً بعضی رمان‌ها تعلیمی‌اند؟"),
            d("B", "They can be, and usually they're the worse for it. The greatest works tend to be those that resist easy moralising.", "می‌توانند باشند، و معمولاً به همین دلیل بدتر می‌شوند. بزرگ‌ترین آثار تمایل دارند آن‌هایی باشند که در برابر اخلاقی‌سازی آسان مقاومت می‌کنند."),
            d("A", "Give me an example.", "مثالی بزن."),
            d("B", "Take Dostoevsky. Crime and Punishment is not a simple morality tale. It's a profound exploration of guilt, redemption, and the limits of rationalism.", "داستایوفسکی را در نظر بگیر. جنایت و مکافات حکایت اخلاقی ساده‌ای نیست. کاوش عمیقی‌ست در گناه، رستگاری، و محدودیت‌های عقل‌گرایی."),
            d("A", "So literature's value lies in its complexity?", "پس ارزش ادبیات در پیچیدگی‌اش است؟"),
            d("B", "Partly. But also in its capacity to develop empathy. When you inhabit a character's consciousness, you see the world through eyes not your own.", "تا حدی. ولی همچنین در ظرفیتش برای پرورش همدلی. وقتی در آگاهی شخصیتی ساکن می‌شوی، جهان را از چشمانی غیر از خودت می‌بینی."),
            d("A", "That's a compelling argument.", "استدلال قانع‌کننده‌ای‌ست."),
            d("B", "It's backed by research, in fact. Studies suggest that readers of literary fiction score higher on empathy tests.", "در واقع، توسط پژوهش پشتیبانی می‌شود. مطالعات پیشنهاد می‌کنند خوانندگان داستان ادبی در آزمون‌های همدلی نمره بالاتری می‌گیرند."),
            d("A", "So literature is not merely aesthetic — it's ethical?", "پس ادبیات نه تنها زیبایی‌شناختی است — اخلاقی هم هست؟"),
            d("B", "I'd argue it's both, and that the two are inseparable. The beauty of the form is what allows the ethical content to land.", "استدلال می‌کنم هر دو است، و این دو جدانشدنی‌اند. زیبایی فرم همان چیزی‌ست که اجازه می‌دهد محتوای اخلاقی فرود آید."),
            d("A", "What would you say to someone who claims literature is a luxury?", "به کسی که ادعا می‌کند ادبیات لوکس است چه می‌گویی؟"),
            d("B", "I'd say they've likely never been transformed by a book. That transformation is not a luxury — it's a form of education that no other medium provides.", "می‌گویم احتمالاً هرگز توسط کتابی متحول نشده‌اند. آن تحول لوکس نیست — نوعی آموزش است که هیچ رسانه دیگری فراهم نمی‌کند."),
            d("A", "Beautifully put.", "زیبا بیان شد."),
            d("B", "It's a conviction I hold deeply.", "عقیده‌ای‌ست که عمیقاً دارم."),
            d("A", "Would you say certain books changed your life?", "می‌گویی کتاب‌های خاصی زندگی‌ات را تغییر داده‌اند؟"),
            d("B", "Several. And not always the ones I expected. Sometimes it's a single sentence, encountered at the right moment, that reorients everything.", "چندین. و نه همیشه آن‌هایی که انتظار داشتم. گاهی یک جمله واحد است، در لحظه درست مواجه شده، که همه چیز را بازسازماندهی می‌کند."),
            d("A", "I know that feeling well.", "آن حس را خوب می‌شناسم.")
        ),
        listOf(
            q("Why does B value literature?", listOf("entertainment", "depth and empathy", "information"), 1),
            q("What does research suggest?", listOf("readers are smarter", "readers score higher on empathy", "readers live longer"), 1),
            q("What the author ___ to suggest is that guilt is universal.", listOf("seems", "seem", "seeming"), 0),
            q("It's tempting to ___ this as an allegory.", listOf("see", "seeing", "saw"), 0)
        ),
        idioms = listOf(
            IdiomExpression("The worse for it", "به دلیل آن بدتر", "Usually the worse for it.", "معمولاً به همین دلیل بدتر."),
            IdiomExpression("Backed by", "پشتیبانی‌شده توسط", "Backed by research.", "توسط پژوهش پشتیبانی‌شده."),
            IdiomExpression("Land", "فرود آمدن", "Allow it to land.", "اجازه فرود آمدنش را بده.")
        ),
        pron = listOf(PronunciationTip("Interpretive language", "Stress modal hedges: It SEEMS to suggest. One READING might be. It's TEMPTING to see.")),
        cult = listOf(CulturalNote("Literary criticism", "The 'death of the author' thesis (Roland Barthes) argues that a text's meaning is created by the reader, not determined by authorial intention.")),
        mis = listOf(
            CommonMistake("It suggests that readers are more empathetically.", "It suggests that readers are more empathetic.", "Adjective not adverb here."),
            CommonMistake("The novel can be read like an allegory.", "The novel can be read as an allegory.", "Read as, not read like.")
        )
    )

    private fun f5C() = base(23, "5C Music and emotion", "۵C موسیقی و احساس",
        listOf("Use abstract and aesthetic vocabulary", "Discuss music's emotional power", "Express personal responses to art"),
        listOf(
            v("harmony", "هماهنگی", "Complex harmonies.", "هارمونی‌های پیچیده."),
            v("dissonance", "ناهماهنگی", "Productive dissonance.", "ناهماهنگی ثمربخش."),
            v("melancholy", "مالیخولیا", "A melancholy melody.", "ملودی مالیخولیایی."),
            v("euphoric", "سرخوشانه", "A euphoric climax.", "اوج سرخوشانه.", "adjective"),
            v("transcendent", "والا", "A transcendent experience.", "تجربه والا.", "adjective"),
            v("catharsis", "پالایش", "Emotional catharsis.", "پالایش احساسی."),
            v("aesthetic", "زیبایی‌شناختی", "Aesthetic experience.", "تجربه زیبایی‌شناختی.", "adjective"),
            v("haunting", "فراموش‌نشدنی", "A haunting melody.", "ملودی فراموش‌نشدنی.", "adjective"),
            v("crescendo", "اوج", "A dramatic crescendo.", "اوج دراماتیک."),
            v("timbre", "رنگ صدا", "Distinctive timbre.", "رنگ صدای متمایز."),
            v("improvisation", "بداهه‌نوازی", "Jazz improvisation.", "بداهه‌نوازی جاز."),
            v("resonance", "طنین", "Deep resonance.", "طنین عمیق.")
        ),
        listOf(
            GrammarSection("Emotional description", "There's something about... that... What moves me is... It never fails to..."),
            GrammarSection("Causative and experiential", "It makes me feel... It leaves me with... It moves me to..."),
            GrammarSection("Comparative aesthetic", "More than anything else, ... Nothing quite like it... The closest thing to...")
        ),
        listOf(
            d("A", "Why do you think music affects us so profoundly?", "چرا فکر می‌کنی موسیقی اینقدر عمیق بر ما تأثیر می‌گذارد؟"),
            d("B", "Because it bypasses reason altogether. It speaks directly to something pre-linguistic in us, something older than thought.", "چون کاملاً عقل را دور می‌زند. مستقیم با چیزی پیشازبانی در ما صحبت می‌کند، چیزی قدیمی‌تر از فکر."),
            d("A", "Can you give an example?", "مثالی می‌زنی؟"),
            d("B", "Consider a piece in a minor key. Without any words, it can evoke a profound sadness. How? Nobody fully knows.", "یک قطعه در گام مینور را در نظر بگیر. بدون هیچ کلمه‌ای، می‌تواند غم عمیقی برانگیزد. چطور؟ هیچ‌کس کاملاً نمی‌داند."),
            d("A", "Some say it's cultural conditioning.", "بعضی می‌گویند شرطی‌سازی فرهنگی‌ست."),
            d("B", "Partly, perhaps. But there's evidence that even infants respond to major and minor modes differently. That suggests something more fundamental.", "شاید تا حدی. ولی شواهدی هست که حتی نوزادان به حالت‌های ماژور و مینور متفاوت پاسخ می‌دهند. این نشان می‌دهد چیزی بنیادین‌تر است."),
            d("A", "What does music do for you personally?", "موسیقی شخصاً برایت چه می‌کند؟"),
            d("B", "It's difficult to put into words, which is precisely the point. It creates a kind of emotional catharsis that nothing else quite achieves.", "سخت است به کلمات درآید، که دقیقاً همین نکته است. نوعی پالایش احساسی ایجاد می‌کند که هیچ چیز دیگری کاملاً به آن نمی‌رسد."),
            d("A", "Are there particular pieces that move you?", "قطعات خاصی هستند که تکانت می‌دهند؟"),
            d("B", "Several. But there's one — the second movement of Rachmaninoff's Second Piano Concerto — that never fails to leave me in a strange state of melancholy and gratitude at once.", "چندین. ولی یکی هست — موومان دوم کنسرتو پیانوی دوم راخمانینوف — که هرگز نتوانسته مرا در حالت عجیبی از مالیخولیا و سپاسگزاری همزمان رها کند."),
            d("A", "That's a powerful description.", "توصیف قدرتمندی‌ست."),
            d("B", "Language strains against such experiences. Sometimes the most accurate thing one can say is simply: listen.", "زبان در برابر چنین تجربیاتی کشیده می‌شود. گاهی دقیق‌ترین چیزی که می‌توان گفت فقط این است: گوش کن."),
            d("A", "Do you play an instrument?", "سازی می‌نوازی؟"),
            d("B", "I used to play piano, though I was never more than competent. Now I mostly listen, which has its own rewards.", "قبلاً پیانو می‌نواختم، هرچند هرگز بیش از شایسته نبودم. الان بیشتر گوش می‌دهم، که پاداش‌های خودش را دارد."),
            d("A", "Do you think performing gives a deeper appreciation?", "فکر می‌کنی اجرا درک عمیق‌تری می‌دهد؟"),
            d("B", "Absolutely. When you've struggled with a passage, you hear it differently. You notice things a passive listener misses.", "قطعاً. وقتی با قطعه‌ای کشتی گرفته‌ای، آن را متفاوت می‌شنوی. چیزهایی را متوجه می‌شوی که شنونده منفعل از دست می‌دهد."),
            d("A", "What about music that seems merely pleasant?", "موسیقی‌ای که فقط خوشایند به نظر می‌رسد چطور؟"),
            d("B", "I have nothing against it. But the music that endures, for me, is music that takes risks — that embraces dissonance as well as harmony.", "مخالفتی با آن ندارم. ولی موسیقی‌ای که برای من دوام می‌آورد، موسیقی‌ای‌ست که ریسک می‌کند — که ناهماهنگی را هم به اندازه هارمونی در آغوش می‌گیرد."),
            d("A", "So discomfort has its place in art?", "پس ناراحتی جای خودش را در هنر دارد؟"),
            d("B", "Without question. The most moving works are often those that unsettle as much as they soothe.", "بدون شک. تکان‌دهنده‌ترین آثار اغلب آن‌هایی هستند که به همان اندازه که آرام می‌کنند، مضطرب می‌کنند."),
            d("A", "I hadn't thought of it that way.", "این‌طور فکر نکرده بودم."),
            d("B", "Nor had I, until a teacher pointed it out many years ago. It changed how I listen.", "من هم، تا اینکه معلمی سال‌ها پیش اشاره کرد. نحوه شنیدنم را تغییر داد.")
        ),
        listOf(
            q("Why does music affect us deeply?", listOf("lyrics", "pre-linguistic", "volume"), 1),
            q("What does B say about pleasant music?", listOf("nothing against it", "hates it", "prefers it"), 0),
            q("There's something ___ music that bypasses reason.", listOf("about", "in", "of"), 0),
            q("It never fails ___ move me.", listOf("to", "for", "of"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Put into words", "به کلمات درآوردن", "Difficult to put into words.", "سخت به کلمات درآید."),
            IdiomExpression("Strain against", "کشیده شدن در برابر", "Language strains against such experiences.", "زبان در برابر چنین تجربیاتی کشیده می‌شود."),
            IdiomExpression("Without question", "بدون شک", "Without question.", "بدون شک.")
        ),
        pron = listOf(PronunciationTip("Aesthetic expression", "Speak slowly. Let emotional words resonate: proFOUND, TRANSscendent, CAtharsis.")),
        cult = listOf(CulturalNote("Music and emotion", "Studies show that music activates the same brain regions as food, sex, and drugs — the nucleus accumbens and the amygdala.")),
        mis = listOf(
            CommonMistake("It never fails to moving me.", "It never fails to move me.", "Base verb after 'to'."),
            CommonMistake("I have nothing against to it.", "I have nothing against it.", "No 'to' with 'against'.")
        )
    )

    // ═══════════ PRACTICAL ENGLISH 5 ═══════════

    private fun pe5() = base(24, "PE5 A doctoral defense", "انگلیسی کاربردی ۵ — دفاع دکتری",
        listOf("Defend a thesis before experts", "Respond to critical examination", "Articulate research contributions"),
        listOf(
            v("thesis", "پایان‌نامه", "Doctoral thesis.", "پایان‌نامه دکتری."),
            v("contribution", "سهم علمی", "Original contribution.", "سهم علمی اصیل."),
            v("defense", "دفاع", "Thesis defense.", "دفاع پایان‌نامه."),
            v("committee", "کمیته", "Examination committee.", "کمیته آزمون."),
            v("methodology", "روش‌شناسی", "Rigorous methodology.", "روش‌شناسی دقیق."),
            v("limitation", "محدودیت", "Acknowledge limitations.", "محدودیت‌ها را بپذیر."),
            v("implication", "پیامد", "Theoretical implications.", "پیامدهای نظری."),
            v("novel", "بدیع", "A novel approach.", "رویکرد بدیع.", "adjective"),
            v("robust", "قوی", "Robust evidence.", "شواهد قوی.", "adjective"),
            v("paradigm", "پارادایم", "A paradigm shift.", "تغییر پارادایم."),
            v("empirical", "تجربی", "Empirical support.", "پشتیبانی تجربی.", "adjective"),
            v("scholarship", "دانش‌پژوهی", "Contemporary scholarship.", "دانش‌پژوهی معاصر.")
        ),
        listOf(
            GrammarSection("Formal academic register", "It is my contention that... I would argue that... The evidence would suggest..."),
            GrammarSection("Conceding and countering", "I take the examiner's point, however... That's a fair critique, though I would maintain..."),
            GrammarSection("Articulating contribution", "What this thesis offers is... The original contribution lies in...")
        ),
        listOf(
            d("E", "Thank you for that presentation. Let me begin with a fundamental question. What, in your own words, is the original contribution of this thesis?", "ممنون از آن ارائه. بگذارید با یک سؤال بنیادین شروع کنم. به زبان خودت، سهم علمی اصیل این پایان‌نامه چیست؟"),
            d("C", "Thank you, Professor. The thesis makes three contributions. First, it proposes a novel theoretical framework integrating two previously disparate traditions.", "ممنون استاد. پایان‌نامه سه سهم دارد. اول، یک چارچوب نظری بدیع پیشنهاد می‌کند که دو سنت پیش‌تر ناپیوسته را ادغام می‌کند."),
            d("E", "And the second?", "و دوم؟"),
            d("C", "Second, it provides empirical support for this framework through an original dataset of unprecedented scope.", "دوم، از طریق مجموعه داده اصلی با دامنه بی‌سابقه، پشتیبانی تجربی برای این چارچوب فراهم می‌کند."),
            d("E", "And the third?", "و سوم؟"),
            d("C", "Third, it demonstrates the practical implications of this framework for policy design.", "سوم، پیامدهای عملی این چارچوب را برای طراحی سیاست نشان می‌دهد."),
            d("E", "Let me press you on the first. You claim your framework is 'novel'. But hasn't similar work been done by Kovacs and his collaborators?", "بگذارید روی اولی فشار بیاورم. ادعا می‌کنی چارچوبت 'بدیع' است. ولی آیا کار مشابهی توسط کوواچ و همکارانش انجام نشده؟"),
            d("C", "An excellent point, and one I take seriously. Kovacs's work is foundational. However, his approach privileges the structural dimension while neglecting agency. My framework integrates both.", "نکته عالی‌ای‌ست، و یکی که جدی می‌گیرم. کار کوواچ بنیادین است. با این حال، رویکرد او بُعد ساختاری را ممتاز می‌کند در حالی که عاملیت را نادیده می‌گیرد. چارچوب من هر دو را ادغام می‌کند."),
            d("E", "But is this integration genuinely original, or merely a synthesis of existing positions?", "ولی آیا این ادغام واقعاً اصیل است، یا صرفاً ترکیبی از مواضع موجود؟"),
            d("C", "That's a fair critique. I would maintain that the integration itself constitutes an original contribution, as it resolves tensions that neither tradition could address alone.", "انتقاد منصفانه‌ای‌ست. استدلال می‌کنم خود ادغام سهم اصیلی‌ست، چون تنش‌هایی را حل می‌کند که هیچ‌کدام از سنت‌ها به تنهایی نمی‌توانستند."),
            d("E", "Let's turn to your methodology. You employed mixed methods. How did you ensure reliability across the quantitative and qualitative strands?", "بگذارید به روش‌شناسی‌ات بپردازیم. از روش‌های ترکیبی استفاده کردی. چطور پایایی در بخش‌های کمّی و کیفی را تضمین کردی؟"),
            d("C", "Through triangulation. Each strand was designed to corroborate the other. Where discrepancies emerged, they were subjected to further analysis rather than dismissed.", "از طریق سه‌گوش‌سازی. هر بخش طراحی شد تا دیگری را تأیید کند. جایی که ناهماهنگی‌ها ظاهر شد، به تحلیل بیشتر فرستاده شدند نه رد."),
            d("E", "What about the limitations?", "محدودیت‌ها چطور؟"),
            d("C", "The most significant limitation is the sample's geographic concentration. This constrains generalisability, though the theoretical framework is not itself geographically bound.", "مهم‌ترین محدودیت، تمرکز جغرافیایی نمونه است. این تعمیم‌پذیری را محدود می‌کند، هرچند خود چارچوب نظری به لحاظ جغرافیایی مقید نیست."),
            d("E", "What would you do differently if you started again?", "اگر از نو شروع می‌کردی، چه کار متفاوتی می‌کردی؟"),
            d("C", "I would expand the sample to include East Asian contexts. Early on, I underestimated the importance of cross-cultural validation.", "نمونه را گسترش می‌دادم تا زمینه‌های شرق آسیا را شامل شود. زودتر، اهمیت اعتبارسنجی بین‌فرهنگی را دست‌کم گرفته بودم."),
            d("E", "Final question. What do you see as the main implication for the field?", "سؤال نهایی. اصلی‌ترین پیامد برای این حوزه را چه می‌بینی؟"),
            d("C", "I would contend that it shifts the debate from an either/or to a both/and. That is, structure and agency are not competing explanations but complementary aspects of a single phenomenon.", "استدلال می‌کنم بحث را از یا/یا به هر دو/و تغییر می‌دهد. یعنی ساختار و عاملیت توضیحاتی رقیب نیستند بلکه جنبه‌های مکمل یک پدیده واحدند."),
            d("E", "Thank you. The committee will deliberate and inform you of our decision.", "ممنون. کمیته تعمق خواهد کرد و تصمیم را به شما اطلاع می‌دهد."),
            d("C", "Thank you for your time and for the rigour of your questions.", "ممنون از وقتتان و از دقت سؤالاتتان.")
        ),
        listOf(
            q("How many contributions does the thesis make?", listOf("one", "two", "three"), 2),
            q("What does C acknowledge as limitation?", listOf("no data", "geographic concentration", "no theory"), 1),
            q("It is my ___ that the framework is novel.", listOf("contention", "content", "contest"), 0),
            q("I would ___ that structure and agency are complementary.", listOf("maintain", "maintaining", "maintained"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Press on", "فشار آوردن روی", "Let me press you on the first.", "بگذارید روی اولی فشار بیاورم."),
            IdiomExpression("Take the point", "پذیرفتن نکته", "I take the point.", "نکته را می‌پذیرم."),
            IdiomExpression("Either/or vs both/and", "یا/یا در برابر هر دو/و", "From either/or to both/and.", "از یا/یا به هر دو/و.")
        ),
        pron = listOf(PronunciationTip("Formal academic defense", "Precise articulation. Pause before key claims. Emphasise theoretical terms: TRIangulation, generaLISability.")),
        cult = listOf(CulturalNote("Doctoral defense", "In many European countries, defenses are public events. In the US, they're usually private, attended only by the committee.")),
        mis = listOf(
            CommonMistake("I would maintaining that...", "I would maintain that...", "Base verb after would."),
            CommonMistake("It is my contention that the framework is novel, isn't it?", "It is my contention that the framework is novel.", "Avoid rhetorical tags in formal defense.")
        )
    )

    // ═══════════ FILE 6 — Politics and power ═══════════

    private fun f6A() = base(26, "6A The nature of power", "۶A ماهیت قدرت",
        listOf("Use advanced structures for argumentation", "Analyse political concepts", "Express critical perspectives"),
        listOf(
            v("hegemony", "هژمونی", "Cultural hegemony.", "هژمونی فرهنگی."),
            v("legitimacy", "مشروعیت", "Political legitimacy.", "مشروعیت سیاسی."),
            v("coercion", "اجبار", "Rule by coercion.", "حکومت با اجبار."),
            v("consensus", "اجماع", "Manufactured consensus.", "اجماع ساختگی."),
            v("sovereignty", "حاکمیت", "National sovereignty.", "حاکمیت ملی."),
            v("ideology", "ایدئولوژی", "Dominant ideology.", "ایدئولوژی غالب."),
            v("institutional", "نهادی", "Institutional power.", "قدرت نهادی.", "adjective"),
            v("discursive", "گفتمانی", "Discursive formations.", "شکل‌بندی‌های گفتمانی.", "adjective"),
            v("subjugate", "تحت سلطه درآوردن", "Subjugate populations.", "جمعیت‌ها را تحت سلطه درآور.", "verb"),
            v("autonomy", "استقلال", "Individual autonomy.", "استقلال فردی."),
            v("structural", "ساختاری", "Structural inequality.", "نابرابری ساختاری.", "adjective"),
            v("agency", "عاملیت", "Human agency.", "عاملیت انسانی.")
        ),
        listOf(
            GrammarSection("Critical argumentation", "It could be argued that... What is at stake here is... The crux of the matter is..."),
            GrammarSection("Nominalization for abstraction", "The exercise of power. The construction of consent. The maintenance of order."),
            GrammarSection("Contrastive structures", "Whereas X maintains..., Y contends that... While it is true that..., we must also consider...")
        ),
        listOf(
            d("A", "Do you think power is ultimately about coercion or consent?", "فکر می‌کنی قدرت در نهایت درباره اجبار است یا رضایت؟"),
            d("B", "A foundational question in political theory. Gramsci would say that sustainable power requires both, but that hegemony — the manufacture of consent — is what truly sustains it.", "سؤال بنیادین در نظریه سیاسی. گرامشی می‌گوید قدرت پایدار به هر دو نیاز دارد، ولی هژمونی — ساخت رضایت — چیزی‌ست که واقعاً حفظش می‌کند."),
            d("A", "So naked coercion is unstable?", "پس اجبار آشکار ناپایدار است؟"),
            d("B", "Precisely. Regimes that rely solely on force tend to collapse. The most durable forms of power make themselves appear natural, inevitable, even desirable.", "دقیقاً. رژیم‌هایی که فقط بر زور تکیه می‌کنند فرو می‌پاشند. پایدارترین اشکال قدرت خود را طبیعی، ناگزیر، حتی مطلوب جلوه می‌دهند."),
            d("A", "That's a chilling thought.", "فکر تکان‌دهنده‌ای‌ست."),
            d("B", "It is. Foucault took this further, arguing that power isn't merely held by institutions but circulates through discourse, shaping what we can even think.", "هست. فوکو این را جلوتر برد، استدلال کرد قدرت صرفاً توسط نهادها نگه داشته نمی‌شود بلکه از طریق گفتمان گردش می‌کند، شکل دادن به آنچه حتی می‌توانیم فکر کنیم."),
            d("A", "So we're all complicit?", "پس همه ما شریکیم؟"),
            d("B", "In a sense, yes. But complicity isn't the same as culpability. The point is to become conscious of the structures that shape us.", "به یک معنا، بله. ولی شریک بودن همان گناهکاری نیست. نکته این است که آگاه شویم از ساختارهایی که ما را شکل می‌دهند."),
            d("A", "How does one do that?", "چطور کسی این کار را می‌کند؟"),
            d("B", "Through critique. By interrogating what is presented as natural. By asking whose interests are served by particular arrangements.", "از طریق نقد. با بازپرسی آنچه طبیعی ارائه می‌شود. با پرسیدن اینکه منافع چه کسی توسط ترتیبات خاص خدمت می‌شود."),
            d("A", "Is that not a recipe for perpetual suspicion?", "این دستور دائمی برای بدگمانی نیست؟"),
            d("B", "It can be, if taken to an extreme. But healthy scepticism is different from paranoid cynicism.", "می‌تواند باشد، اگر تا حد افراط برده شود. ولی شک‌گرایی سالم متفاوت از بدبینی پارانویایی‌ست."),
            d("A", "Where do you draw the line?", "کجا خط می‌کشی؟"),
            d("B", "I'd say: question everything, but be willing to be persuaded. The aim is not to reject all authority, but to demand that it justify itself.", "می‌گویم: همه چیز را زیر سؤال ببر، ولی مایل باش متقاعد شوی. هدف رد همه اقتدار نیست، بلکه مطالبه این است که خودش را توجیه کند."),
            d("A", "What role does individual agency play in all this?", "نقش عاملیت فردی در همه این‌ها چیست؟"),
            d("B", "Considerable. We are shaped by structures, yes, but we're not merely passive products of them. Resistance is possible, and history bears witness to it.", "قابل توجه. ما توسط ساختارها شکل می‌گیریم، بله، ولی صرفاً محصولات منفعل آن‌ها نیستیم. مقاومت ممکن است، و تاریخ شاهدش است."),
            d("A", "What sustains that resistance?", "چه چیزی آن مقاومت را حفظ می‌کند؟"),
            d("B", "Solidarity, I'd argue. Isolated individuals are easily crushed. Collective action, when sustained, can alter structures.", "استدلال می‌کنم، همبستگی. افراد منزوی به راحتی خرد می‌شوند. کنش جمعی، وقتی پایدار باشد، می‌تواند ساختارها را تغییر دهد."),
            d("A", "Is that not naive?", "این ساده‌لوحانه نیست؟"),
            d("B", "It would be, if it ignored how formidable power is. But I'd maintain that the arc of history, however unevenly, bends toward greater inclusion.", "خواهد بود، اگر عظمت قدرت را نادیده بگیرد. ولی استدلال می‌کنم که قوس تاریخ، هرچند به طور نامتوازن، به سمت شمول بیشتر خم می‌شود."),
            d("A", "You sound almost optimistic.", "تقریباً خوش‌بین به نظر می‌رسی."),
            d("B", "Not optimistic, exactly. Hopeful, perhaps — which is different.", "دقیقاً خوش‌بین نه. شاید امیدوار — که متفاوت است."),
            d("A", "Well put.", "خوب گفتی.")
        ),
        listOf(
            q("What does Gramsci say sustains power?", listOf("violence", "hegemony", "money"), 1),
            q("What does B say about resistance?", listOf("impossible", "possible with solidarity", "pointless"), 1),
            q("The crux of the ___ is how power sustains itself.", listOf("matter", "thing", "case"), 0),
            q("___ it is true that structures shape us, we retain agency.", listOf("While", "Because", "Since"), 0)
        ),
        idioms = listOf(
            IdiomExpression("At stake", "در خطر", "What is at stake here is freedom.", "آنچه در خطر است آزادی‌ست."),
            IdiomExpression("Bear witness", "شاهد بودن", "History bears witness to it.", "تاریخ شاهدش است."),
            IdiomExpression("Arc of history", "قوس تاریخ", "The arc of history bends.", "قوس تاریخ خم می‌شود.")
        ),
        pron = listOf(PronunciationTip("Critical discourse", "Precise articulation. Emphasise abstract terms: heGEMony, legiTIMacy, SOcialStructure.")),
        cult = listOf(CulturalNote("Critical theory", "The Frankfurt School and post-structuralists (Foucault, Derrida) shaped modern critical approaches to power and knowledge.")),
        mis = listOf(
            CommonMistake("Power is not only hold by institutions.", "Power is not only held by institutions.", "Past participle in passive."),
            CommonMistake("While it's true that structures shape us, but we have agency.", "While it's true that structures shape us, we have agency.", "No 'but' with 'while'.")
        )
    )

    private fun f6B() = base(27, "6B Democracy in crisis?", "۶B دموکراسی در بحران؟",
        listOf("Use rhetorical and analytical structures", "Debate contemporary political issues", "Maintain nuance in polarized debates"),
        listOf(
            v("polarization", "قطب‌بندی", "Political polarization.", "قطب‌بندی سیاسی."),
            v("populism", "پوپولیسم", "Rising populism.", "پوپولیسم در حال افزایش."),
            v("disinformation", "اطلاعات نادرست", "State disinformation.", "اطلاعات نادرست دولتی."),
            v("accountability", "پاسخگویی", "Democratic accountability.", "پاسخگویی دموکراتیک."),
            v("institution", "نهاد", "Democratic institutions.", "نهادهای دموکراتیک."),
            v("erode", "فرسایش دادن", "Erode trust.", "اعتماد را فرسایش بده.", "verb"),
            v("autocratic", "استبدادی", "Autocratic tendencies.", "تمایلات استبدادی.", "adjective"),
            v("contestation", "مناقشه", "Legitimate contestation.", "مناقشه مشروع."),
            v("deliberative", "مشورتی", "Deliberative democracy.", "دموکراسی مشورتی.", "adjective"),
            v("technocratic", "تکنوکراتیک", "Technocratic governance.", "حکمرانی تکنوکراتیک.", "adjective"),
            v("sovereignty", "حاکمیت", "Popular sovereignty.", "حاکمیت مردمی."),
            v("legitimacy", "مشروعیت", "Legitimacy crisis.", "بحران مشروعیت.")
        ),
        listOf(
            GrammarSection("Rhetorical questions", "Is it not the case that...? Who among us has not...? How are we to reconcile...?"),
            GrammarSection("Balanced argumentation", "On the one hand... On the other... A case can be made for both positions..."),
            GrammarSection("Concessive nominal clauses", "Whatever one's political persuasion, ... However one interprets the data, ...")
        ),
        listOf(
            d("A", "Do you think democracy is genuinely in crisis?", "فکر می‌کنی دموکراسی واقعاً در بحران است؟"),
            d("B", "In certain respects, yes. But I'd caution against overstatement. Democracy has always been in some form of crisis.", "از جهات خاص، بله. ولی هشدار می‌دهم در برابر اغراق. دموکراسی همیشه به نوعی در بحران بوده."),
            d("A", "That's a fair point. What's different now?", "نکته منصفانه‌ای‌ست. الان چه چیزی متفاوت است؟"),
            d("B", "The speed and scale of disinformation. In the past, lies took time to spread. Now they can circle the globe in minutes.", "سرعت و مقیاس اطلاعات نادرست. در گذشته، دروغ‌ها زمان می‌بردند تا پخش شوند. الان می‌توانند در چند دقیقه دور جهان بچرخند."),
            d("A", "Is that the main threat?", "این تهدید اصلی است؟"),
            d("B", "One of several. Polarization is arguably more corrosive. When citizens no longer share basic facts, deliberation becomes impossible.", "یکی از چندین. قابل استدلال قطب‌بندی بیشتر فرسایشی‌ست. وقتی شهروندان دیگر حقایق پایه‌ای مشترک ندارند، تأمل غیرممکن می‌شود."),
            d("A", "And what's driving the polarization?", "و چه چیزی قطب‌بندی را هدایت می‌کند؟"),
            d("B", "Many factors. Economic inequality, media fragmentation, algorithmic amplification of outrage. It's a perfect storm.", "عوامل زیادی. نابرابری اقتصادی، تکه‌تکه شدن رسانه، تقویت الگوریتمی خشم. طوفان کاملی‌ست."),
            d("A", "So what's the solution?", "پس راه‌حل چیست؟"),
            d("B", "There isn't a single one. But strengthening institutions, regulating platforms, and rebuilding civic education would all help.", "یکی نیست. ولی تقویت نهادها، تنظیم پلتفرم‌ها، و بازسازی آموزش مدنی همه کمک می‌کنند."),
            d("A", "Some would say that's technocratic — that it takes power away from the people.", "بعضی می‌گویند این تکنوکراتیک است — قدرتی از مردم می‌گیرد."),
            d("B", "That's a real tension. Deliberative democracy aims to resolve it by deepening participation, not limiting it.", "تنش واقعی‌ای‌ست. دموکراسی مشورتی هدفش حل آن با تعمیق مشارکت است، نه محدود کردنش."),
            d("A", "What does that look like in practice?", "در عمل چه شکلی دارد؟"),
            d("B", "Citizens' assemblies, for instance. Randomly selected groups deliberate on complex issues and make recommendations.", "مثلاً مجامع شهروندی. گروه‌های تصادفی انتخاب‌شده روی مسائل پیچیده تعمق می‌کنند و توصیه می‌دهند."),
            d("A", "Have those been tried?", "آیا امتحان شده‌اند؟"),
            d("B", "Yes, in Ireland, France, and elsewhere. Notably, Ireland's citizens' assembly paved the way for the abortion referendum.", "بله، در ایرلند، فرانسه، و جاهای دیگر. به ویژه، مجمع شهروندی ایرلند راه را برای همه‌پرسی سقط جنین هموار کرد."),
            d("A", "Interesting. Do you think democracy will survive?", "جالب. فکر می‌کنی دموکراسی زنده می‌ماند؟"),
            d("B", "I'm cautiously optimistic. Whatever its flaws, no better system has been devised. As Churchill famously said, it's the worst form of government — except for all the others.", "با احتیاط خوش‌بینم. هرچه نقص‌هایش، سیستم بهتری طراحی نشده. همانطور که چرچیل معروف گفت، بدترین شکل حکومت است — به جز تمام بقیه."),
            d("A", "So the task is to improve it, not abandon it?", "پس وظیفه بهبودش است، نه رها کردنش؟"),
            d("B", "Precisely. Democracy is not a destination but a practice — one that must be renewed by each generation.", "دقیقاً. دموکراسی مقصد نیست بلکه تمرین است — یکی که باید توسط هر نسل تجدید شود."),
            d("A", "That's a hopeful note to end on.", "یادداشت امیدوارکننده‌ای برای پایان است.")
        ),
        listOf(
            q("What's the main threat to democracy per B?", listOf("disinformation", "polarization", "money"), 1),
            q("What example does B give?", listOf("Brexit", "Irish citizens' assembly", "US election"), 1),
            q("Who among us ___ not wondered at democracy's future?", listOf("has", "have", "having"), 0),
            q("___ one's political persuasion, democracy matters.", listOf("Whatever", "However", "Whichever"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Perfect storm", "طوفان کامل", "A perfect storm of factors.", "طوفان کاملی از عوامل."),
            IdiomExpression("Pave the way", "راه را هموار کردن", "It paved the way for reform.", "راه را برای اصلاحات هموار کرد."),
            IdiomExpression("Worst form — except for all others", "بدترین شکل — به جز بقیه", "Worst form of government — except for all others.", "بدترین شکل حکومت — به جز تمام بقیه.")
        ),
        pron = listOf(PronunciationTip("Rhetorical questions", "Rhetorical questions often have a slight rise then fall. Who among us has not wondered? ↗↘")),
        cult = listOf(CulturalNote("Democratic theory", "Deliberative democracy emphasises reasoned discussion over mere aggregation of preferences. Jürgen Habermas is a key theorist.")),
        mis = listOf(
            CommonMistake("Who among us have not wondered?", "Who among us has not wondered?", "Subject-verb agreement (who = singular here)."),
            CommonMistake("Whatever is one's political persuasion.", "Whatever one's political persuasion.", "No 'is'.")
        )
    )

    private fun f6C() = base(28, "6C Activism and change", "۶C کنش‌گری و تغییر",
        listOf("Use motivational and persuasive language", "Discuss social change", "Express conviction and commitment"),
        listOf(
            v("grassroots", "مردمی", "Grassroots movements.", "جنبش‌های مردمی.", "adjective"),
            v("mobilize", "بسیج کردن", "Mobilize support.", "حمایت را بسیج کن.", "verb"),
            v("advocacy", "حمایت‌گری", "Advocacy work.", "کار حمایت‌گری."),
            v("resilience", "تاب‌آوری", "Community resilience.", "تاب‌آوری جامعه."),
            v("solidarity", "همبستگی", "International solidarity.", "همبستگی بین‌المللی."),
            v("empower", "توانمند کردن", "Empower communities.", "جوامع را توانمند کن.", "verb"),
            v("sustainable", "پایدار", "Sustainable change.", "تغییر پایدار.", "adjective"),
            v("systemic", "سیستمی", "Systemic change.", "تغییر سیستمی.", "adjective"),
            v("collective", "جمعی", "Collective action.", "کنش جمعی.", "adjective"),
            v("transformative", "تحول‌آفرین", "Transformative justice.", "عدالت تحول‌آفرین.", "adjective"),
            v("perseverance", "پشتکار", "Relentless perseverance.", "پشتکار بی‌امان.")
        ),
        listOf(
            GrammarSection("Motivational register", "It's incumbent upon us to... We have it within our power to... History will judge us by..."),
            GrammarSection("Rhetorical repetition", "Not because it is easy, but because it is hard. Not for ourselves alone, but for those who come after."),
            GrammarSection("Future-oriented commitment", "We will not rest until... Generations to come will look back and...")
        ),
        listOf(
            d("A", "Do you think individual action can really make a difference?", "فکر می‌کنی کنش فردی واقعاً می‌تواند تفاوتی ایجاد کند؟"),
            d("B", "On its own, rarely. But individual action, multiplied across millions, becomes collective power. And collective power changes systems.", "به تنهایی، به ندرت. ولی کنش فردی، ضرب‌شده در میلیون‌ها، به قدرت جمعی تبدیل می‌شود. و قدرت جمعی سیستم‌ها را تغییر می‌دهد."),
            d("A", "That sounds idealistic.", "آرمان‌گرایانه به نظر می‌رسد."),
            d("B", "Is it, though? Every major social advance — the abolition of slavery, women's suffrage, civil rights, environmental protection — began with individuals who refused to accept the status quo.", "آیا واقعاً؟ هر پیشرفت اجتماعی بزرگ — لغو برده‌داری، حق رأی زنان، حقوق مدنی، حمایت محیطی — با افرادی آغاز شد که از پذیرش وضع موجود سر باز زدند."),
            d("A", "True. But those movements took decades.", "درسته. ولی آن جنبش‌ها دهه‌ها طول کشیدند."),
            d("B", "They did. Change is rarely swift. But that's not an argument for inaction — it's an argument for perseverance.", "همینطور. تغییر به ندرت سریع است. ولی این استدلالی برای بی‌عملی نیست — استدلالی برای پشتکار است."),
            d("A", "What would you say to someone who feels powerless?", "به کسی که احساس بی‌قدرتی می‌کند چه می‌گویی؟"),
            d("B", "I'd say: start small. Volunteer. Organize locally. Support organizations doing the work. No one has to do everything — but everyone can do something.", "می‌گویم: کوچک شروع کن. داوطلب شو. محلی سازماندهی کن. از سازمان‌هایی که این کار را می‌کنند حمایت کن. هیچ‌کس نباید همه کار را بکند — ولی همه می‌توانند کاری بکنند."),
            d("A", "Is there a risk of burnout?", "خطر فرسودگی هست؟"),
            d("B", "Considerable. That's why community matters. You can't sustain activism alone. It must be collective, or it exhausts the individual.", "قابل توجه. برای همین جامعه مهم است. نمی‌توانی کنش‌گری را تنها حفظ کنی. باید جمعی باشد، وگرنه فرد را فرسوده می‌کند."),
            d("A", "What sustains you personally?", "چه چیزی شخصاً تو را حفظ می‌کند؟"),
            d("B", "A sense of solidarity. Knowing that others are working alongside me. That we're part of something larger than ourselves.", "حس همبستگی. دانستن اینکه دیگران کنار من کار می‌کنند. اینکه بخشی از چیزی بزرگ‌تر از خودمان هستیم."),
            d("A", "That's beautiful.", "قشنگه."),
            d("B", "It's also practical. Movements that endure are those that build community, not just campaigns.", "همچنین عملی‌ست. جنبش‌هایی که دوام می‌آورند آن‌هایی هستند که جامعه می‌سازند، نه فقط کمپین."),
            d("A", "What would you say is the greatest obstacle?", "به نظرت بزرگ‌ترین مانع چیست؟"),
            d("B", "Cynicism, I'd argue. Not opposition, but despair. When people believe nothing can change, change becomes impossible.", "استدلال می‌کنم، بدبینی. نه مخالفت، بلکه ناامیدی. وقتی مردم باور کنند هیچ چیز نمی‌تواند تغییر کند، تغییر غیرممکن می‌شود."),
            d("A", "How do you combat cynicism?", "چطور با بدبینی مقابله می‌کنی؟"),
            d("B", "By celebrating wins, however small. By telling stories of success. By refusing to accept that the future is already written.", "با جشن گرفتن پیروزی‌ها، هرچقدر کوچک. با گفتن داستان‌های موفقیت. با سر باز زدن از پذیرش اینکه آینده قبلاً نوشته شده."),
            d("A", "What keeps you hopeful?", "چه چیزی تو را امیدوار نگه می‌دارد؟"),
            d("B", "Young people, mostly. Each generation seems more aware, more engaged, more insistent on change. That gives me hope.", "بیشتر جوانان. هر نسل به نظر می‌رسد آگاه‌تر، درگیرتر، مصمم‌تر برای تغییر است. این به من امید می‌دهد."),
            d("A", "That's encouraging to hear.", "شنیدنش تشویق‌کننده‌ست."),
            d("B", "It is. Which is why I'll keep going, however long it takes.", "هست. برای همین ادامه می‌دهم، هرچقدر طول بکشد.")
        ),
        listOf(
            q("What does B say about individual action?", listOf("pointless", "multiplies into collective power", "sufficient"), 1),
            q("What's the greatest obstacle per B?", listOf("opposition", "cynicism", "money"), 1),
            q("It's incumbent ___ us to act.", listOf("on", "for", "to"), 0),
            q("We will not rest ___ justice is achieved.", listOf("until", "when", "since"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Status quo", "وضع موجود", "Refused the status quo.", "از پذیرش وضع موجود سر باز زدند."),
            IdiomExpression("Make a difference", "تفاوت ایجاد کردن", "Can really make a difference.", "واقعاً می‌تواند تفاوت ایجاد کند."),
            IdiomExpression("Keep going", "ادامه دادن", "I'll keep going.", "ادامه می‌دهم.")
        ),
        pron = listOf(PronunciationTip("Motivational rhetoric", "Measured, deliberate pace. Emphasise key phrases: Not BECAUSE it's easy, but BECAUSE it's HARD.")),
        cult = listOf(CulturalNote("Activist history", "Most major social movements began with small groups of committed individuals. Persistence over decades, not months, is typical.")),
        mis = listOf(
            CommonMistake("It's incumbent upon us acting.", "It's incumbent upon us to act.", "To-infinitive after incumbent upon us."),
            CommonMistake("We will not rest until justice will be achieved.", "We will not rest until justice is achieved.", "No 'will' after 'until'.")
        )
    )

    // ═══════════ FILE 7 — Science and truth ═══════════

    private fun f7A() = base(29, "7A The nature of truth", "۷A ماهیت حقیقت",
        listOf("Use epistemological vocabulary", "Discuss theories of truth", "Express philosophical sophistication"),
        listOf(
            v("epistemology", "معرفت‌شناسی", "Epistemological questions.", "سؤالات معرفت‌شناختی."),
            v("correspondence", "مطابقت", "Correspondence theory.", "نظریه مطابقت."),
            v("coherence", "انسجام", "Coherence theory.", "نظریه انسجام."),
            v("pragmatic", "عمل‌گرایانه", "Pragmatic truth.", "حقیقت عمل‌گرایانه.", "adjective"),
            v("verification", "تحقق", "Verification principle.", "اصل تحقق."),
            v("falsification", "ابطال", "Falsifiability criterion.", "معیار ابطال‌پذیری."),
            v("objective", "عینی", "Objective reality.", "واقعیت عینی.", "adjective"),
            v("subjective", "ذهنی", "Subjective experience.", "تجربه ذهنی.", "adjective"),
            v("construct", "برساخته", "Social construct.", "برساخته اجتماعی.", "adjective"),
            v("foundational", "بنیادین", "Foundational beliefs.", "باورهای بنیادین.", "adjective"),
            v("relativism", "نسبی‌گرایی", "Epistemic relativism.", "نسبی‌گرایی معرفتی."),
            v("absolutism", "مطلق‌گرایی", "Moral absolutism.", "مطلق‌گرایی اخلاقی.")
        ),
        listOf(
            GrammarSection("Epistemological structures", "It can be known that... It is conceivable that... There is no way of ascertaining whether..."),
            GrammarSection("Distinguishing theories", "On the correspondence view... By contrast, the coherence theory holds..."),
            GrammarSection("Philosophical qualification", "Insofar as... To the extent that... In principle, though not always in practice.")
        ),
        listOf(
            d("A", "What does it mean to say that something is true?", "یعنی چه که چیزی درست است؟"),
            d("B", "That's the central question of epistemology. And, remarkably, philosophers still disagree.", "سؤال مرکزی معرفت‌شناسی‌ست. و به طور قابل توجه، فیلسوفان هنوز اختلاف دارند."),
            d("A", "What are the main positions?", "مواضع اصلی چیست؟"),
            d("B", "Roughly, three. Correspondence theory holds that truth is a matter of matching reality. Coherence theory says truth is a matter of consistency within a system of beliefs.", "تقریباً سه. نظریه مطابقت معتقد است حقیقت مطابقت با واقعیت است. نظریه انسجام می‌گوید حقیقت انسجام درون یک سیستم باورهاست."),
            d("A", "And the third?", "و سوم؟"),
            d("B", "Pragmatism — the view that truth is what works, what proves useful in practice.", "عمل‌گرایی — دیدگاهی که حقیقت چیزی‌ست که کار می‌کند، چیزی که در عمل مفید ثابت می‌شود."),
            d("A", "Which do you find most compelling?", "کدام را قانع‌کننده‌تر می‌یابی؟"),
            d("B", "Each has merits and difficulties. Correspondence seems intuitive, but defining 'reality' independently of our beliefs is notoriously difficult.", "هرکدام مزایا و دشواری‌هایی دارند. مطابقت شهودی به نظر می‌رسد، ولی تعریف 'واقعیت' مستقل از باورهایمان به طور بدنامی سخت است."),
            d("A", "So you lean toward coherence?", "پس به سمت انسجام تمایل داری؟"),
            d("B", "Not entirely. Coherence has the problem of allowing multiple, equally consistent systems — including false ones. A coherent fairy tale is still a fairy tale.", "کاملاً نه. انسجام مشکل اجازه دادن چندین سیستم به همان اندازه منسجم را دارد — شامل سیستم‌های دروغین. داستان پریان منسجم هنوز داستان پریان است."),
            d("A", "So pragmatism?", "پس عمل‌گرایی؟"),
            d("B", "It has the appeal of practicality. But 'what works' depends on what you're trying to achieve, which brings us back to values.", "جذابیت عملی دارد. ولی 'آنچه کار می‌کند' بستگی به این دارد چه چیزی می‌خواهی به دست آوری، که ما را به ارزش‌ها برمی‌گرداند."),
            d("A", "Is there a way out of the impasse?", "راهی از این بن‌بست هست؟"),
            d("B", "Some philosophers advocate pluralism — accepting that 'truth' may operate differently in different domains. Scientific truth, moral truth, aesthetic truth.", "بعضی فیلسوفان از کثرت‌گرایی دفاع می‌کنند — پذیرش اینکه 'حقیقت' ممکن است در حوزه‌های مختلف متفاوت عمل کند. حقیقت علمی، حقیقت اخلاقی، حقیقت زیبایی‌شناختی."),
            d("A", "That seems evasive.", "فرار به نظر می‌رسد."),
            d("B", "It can be. But so is insisting on a single criterion for everything.", "می‌تواند باشد. ولی اصرار بر معیار واحدی برای همه چیز هم همینطور."),
            d("A", "What about scientific truth in particular?", "حقیقت علمی به طور خاص چطور؟"),
            d("B", "Science operates on falsifiability — a claim is scientific only if it can, in principle, be disproven. That's a remarkably productive criterion.", "علم بر ابطال‌پذیری عمل می‌کند — ادعایی علمی است فقط اگر در اصل بتوان ردش کرد. این معیار فوق‌العاده پرباری‌ست."),
            d("A", "But scientific theories have been overturned before.", "ولی نظریه‌های علمی قبلاً واژگون شده‌اند."),
            d("B", "Many times. That's not a flaw, though — it's a feature. Science progresses by correcting itself.", "بارها. این نقص نیست، هرچند — ویژگی‌ست. علم با تصحیح خود پیشرفت می‌کند."),
            d("A", "So scientific truth is provisional?", "پس حقیقت علمی موقتی است؟"),
            d("B", "Precisely. It's the best we can do, given our limitations. And that's no small thing.", "دقیقاً. بهترین کاری‌ست که می‌توانیم بکنیم، با توجه به محدودیت‌هایمان. و این چیز کمی نیست."),
            d("A", "Do you think we'll ever reach absolute certainty?", "فکر می‌کنی هرگز به قطعیت مطلق خواهیم رسید؟"),
            d("B", "I doubt it. But the pursuit is worthwhile even without final arrival.", "شک دارم. ولی جستجو ارزشمند است حتی بدون رسیدن نهایی.")
        ),
        listOf(
            q("How many theories of truth does B mention?", listOf("two", "three", "four"), 1),
            q("What is the criterion for scientific truth?", listOf("coherence", "falsifiability", "consensus"), 1),
            q("It can ___ known that truth is provisional.", listOf("be", "been", "being"), 0),
            q("___ that we accept the premise, the conclusion follows.", listOf("Insofar", "Because", "Since"), 0)
        ),
        idioms = listOf(
            IdiomExpression("No small thing", "چیز کمی", "That's no small thing.", "این چیز کمی نیست."),
            IdiomExpression("Way out", "راه خروج", "Is there a way out?", "راهی از این بن‌بست هست؟"),
            IdiomExpression("Best we can do", "بهترین کاری که می‌توانیم بکنیم", "It's the best we can do.", "بهترین کاری‌ست که می‌توانیم بکنیم.")
        ),
        pron = listOf(PronunciationTip("Philosophical precision", "Enunciate key terms: correSPONdence, coHErence, PRAGmatism, falSIFIability.")),
        cult = listOf(CulturalNote("Philosophy of science", "Karl Popper's falsifiability criterion and Thomas Kuhn's paradigm shifts reshaped how we understand scientific progress.")),
        mis = listOf(
            CommonMistake("Theories of truth is complicated.", "Theories of truth are complicated.", "Plural subject."),
            CommonMistake("Insofar that we accept...", "Insofar as we accept...", "Use 'as', not 'that', with 'insofar'.")
        )
    )

    private fun f7B() = base(30, "7B Science and society", "۷B علم و جامعه",
        listOf("Use advanced argumentative structures", "Discuss science-society relations", "Balance expertise and democracy"),
        listOf(
            v("paradigm", "پارادایم", "A scientific paradigm.", "پارادایم علمی."),
            v("consensus", "اجماع", "Scientific consensus.", "اجماع علمی."),
            v("expertise", "تخصص", "Specialised expertise.", "تخصص ویژه."),
            v("democratic", "دموکراتیک", "Democratic deliberation.", "تأمل دموکراتیک.", "adjective"),
            v("technocratic", "تکنوکراتیک", "Technocratic decision-making.", "تصمیم‌گیری تکنوکراتیک.", "adjective"),
            v("transparency", "شفافیت", "Scientific transparency.", "شفافیت علمی."),
            v("trust", "اعتماد", "Public trust in science.", "اعتماد عمومی به علم."),
            v("misinformation", "اطلاعات نادرست", "Spread of misinformation.", "پخش اطلاعات نادرست."),
            v("intervention", "مداخله", "Government intervention.", "مداخله دولتی."),
            v("precautionary", "احتیاطی", "Precautionary principle.", "اصل احتیاط.", "adjective"),
            v("stakeholder", "ذی‌نفع", "Involve stakeholders.", "ذی‌نفعان را درگیر کن."),
            v("accountability", "پاسخگویی", "Scientific accountability.", "پاسخگویی علمی.")
        ),
        listOf(
            GrammarSection("Weighing arguments", "The case for X rests on... Those who defend Y argue that... Neither position is without difficulty."),
            GrammarSection("Concessive structures", "Granted that... It does not follow that... Even assuming that..., we must still ask..."),
            GrammarSection("Conditional critique", "Were we to accept this, we would be committed to... If that were the case, then...")
        ),
        listOf(
            d("A", "Should scientific expertise override democratic preferences?", "آیا تخصص علمی باید بر ترجیحات دموکراتیک اولویت داشته باشد؟"),
            d("B", "A genuinely difficult question. There's a real tension between epistemic authority and popular sovereignty.", "سؤال واقعاً دشواری‌ست. تنش واقعی بین اقتدار معرفتی و حاکمیت مردمی هست."),
            d("A", "Where do you stand?", "موضعت چیست؟"),
            d("B", "Neither extreme. Technocracy, where experts rule unchecked, is undemocratic. But populism, which dismisses expertise entirely, is dangerous.", "هیچ‌کدام از دو افراط. تکنوکراسی، جایی که متخصصان بدون کنترل حکومت می‌کنند، غیردموکراتیک است. ولی پوپولیسم، که تخصص را کاملاً رد می‌کند، خطرناک است."),
            d("A", "So what's the middle ground?", "پس راه میانه چیست؟"),
            d("B", "Informed deliberation. Experts inform the debate, but citizens make the final call on matters of value.", "تأمل آگاهانه. متخصصان بحث را آگاه می‌کنند، ولی شهروندان در مسائل ارزشی تصمیم نهایی را می‌گیرند."),
            d("A", "Where do you draw the line between facts and values?", "خط بین حقایق و ارزش‌ها را کجا می‌کشی؟"),
            d("B", "Facts: what the science says. Values: what we choose to do about it. Experts own the first, citizens the second.", "حقایق: آنچه علم می‌گوید. ارزش‌ها: آنچه انتخاب می‌کنیم درباره‌اش بکنیم. متخصصان مالک اولی، شهروندان دومی."),
            d("A", "But the line is often blurry.", "ولی خط اغلب محو است."),
            d("B", "Invariably. Take climate policy. The science is clear on the cause. But how much economic pain we're willing to accept — that's a value judgment.", "همیشه. سیاست اقلیمی را در نظر بگیر. علم در مورد علت روشن است. ولی چقدر درد اقتصادی حاضریم تحمل کنیم — آن قضاوت ارزشی‌ست."),
            d("A", "So should scientists stay out of politics?", "پس دانشمندان باید از سیاست دور بمانند؟"),
            d("B", "Not entirely. They have a duty to inform, and often a duty to warn. But they must be transparent about where expertise ends and advocacy begins.", "کاملاً نه. وظیفه دارند آگاه کنند، و اغلب وظیفه دارند هشدار دهند. ولی باید شفاف باشند درباره اینکه کجا تخصص تمام می‌شود و حمایت‌گری شروع."),
            d("A", "What about the erosion of public trust in science?", "فرسایش اعتماد عمومی به علم چطور؟"),
            d("B", "It's a serious concern. Some of it is deliberate — disinformation campaigns. Some is a failure of science communication.", "نگرانی جدی‌ای‌ست. بعضی از آن عمدی‌ست — کمپین‌های اطلاعات نادرست. بعضی شکست ارتباطات علمی‌ست."),
            d("A", "How can trust be rebuilt?", "چطور اعتماد بازسازی می‌شود؟"),
            d("B", "Transparency, humility, and engagement. Scientists must admit uncertainty, acknowledge mistakes, and speak to the public, not down to it.", "شفافیت، فروتنی، و درگیر شدن. دانشمندان باید عدم قطعیت را بپذیرند، اشتباهات را اعتراف کنند، و با مردم صحبت کنند، نه از بالا به پایین."),
            d("A", "That sounds wise.", "عاقلانه به نظر می‌رسد."),
            d("B", "It's also essential. In a crisis — a pandemic, say — a trusting public is the difference between effective response and catastrophe.", "همچنین ضروری‌ست. در بحران — مثلاً پاندمی — عموم معتمد تفاوت بین پاسخ مؤثر و فاجعه است."),
            d("A", "What role does education play?", "نقش آموزش چیست؟"),
            d("B", "A vital one. Scientific literacy isn't about memorising facts — it's about understanding how science works, and why it's trustworthy despite its fallibility.", "حیاتی. سواد علمی درباره حفظ کردن حقایق نیست — درباره فهم چگونگی کار علم است، و چرا قابل اعتماد است با وجود خطاپذیری‌اش."),
            d("A", "Beautifully put.", "زیبا بیان شد.")
        ),
        listOf(
            q("What position does B take?", listOf("technocracy", "populism", "neither extreme"), 2),
            q("What's the role of experts?", listOf("make all decisions", "inform the debate", "stay out"), 1),
            q("Were we to accept this, we ___ be committed to technocracy.", listOf("would", "will", "are"), 0),
            q("Granted that science is fallible, it doesn't ___ that it's unreliable.", listOf("follow", "following", "followed"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Middle ground", "راه میانه", "What's the middle ground?", "راه میانه چیست؟"),
            IdiomExpression("Speak down to", "از بالا به پایین صحبت کردن", "Speak to, not down to.", "صحبت کن، نه از بالا به پایین."),
            IdiomExpression("Difference between", "تفاوت بین", "The difference between response and catastrophe.", "تفاوت بین پاسخ و فاجعه.")
        ),
        pron = listOf(PronunciationTip("Argumentative balance", "Give equal weight to both sides. Stress key contrasts: TECHnocracy versus POPulism.")),
        cult = listOf(CulturalNote("Science-society relations", "The COVID-19 pandemic highlighted tensions between scientific advice and public compliance, varying widely across cultures.")),
        mis = listOf(
            CommonMistake("Granted that science is fallible, but it's still valuable.", "Granted that science is fallible, it's still valuable.", "No 'but' with 'granted'."),
            CommonMistake("Were we to accept this, we will be committed.", "Were we to accept this, we would be committed.", "Would, not will, in hypothetical.")
        )
    )

    private fun f7C() = base(31, "7C Knowledge and wisdom", "۷C دانش و خرد",
        listOf("Use philosophical distinctions", "Distinguish knowledge from wisdom", "Express intellectual humility"),
        listOf(
            v("wisdom", "خرد", "Ancient wisdom.", "خرد باستانی."),
            v("erudition", "دانش‌آموزی", "Impressive erudition.", "دانش‌آموزی چشمگیر."),
            v("humility", "فروتنی", "Intellectual humility.", "فروتنی فکری."),
            v("insight", "بینش", "Deep insight.", "بینش عمیق."),
            v("discernment", "تمییز", "Keen discernment.", "تمییز دقیق."),
            v("sophisticated", "پیچیده", "Sophisticated understanding.", "فهم پیچیده.", "adjective"),
            v("sagacious", "خردمند", "A sagacious mentor.", "منتور خردمند.", "adjective"),
            v("profound", "عمیق", "Profound wisdom.", "خرد عمیق.", "adjective"),
            v("nuanced", "ظریف", "Nuanced appreciation.", "درک ظریف.", "adjective"),
            v("reflective", "تأملی", "A reflective disposition.", "خلق تأملی.", "adjective"),
            v("pragmatic", "عمل‌گرایانه", "Pragmatic wisdom.", "خرد عمل‌گرایانه.", "adjective"),
            v("existential", "اگزیستانسیال", "Existential wisdom.", "خرد اگزیستانسیال.", "adjective")
        ),
        listOf(
            GrammarSection("Philosophical distinctions", "Knowledge is a matter of... whereas wisdom involves... The one concerns facts, the other, judgment."),
            GrammarSection("Intellectual humility", "For all our learning, we remain ignorant of... The more we know, the more we realise..."),
            GrammarSection("Paradoxical constructions", "It is precisely because... that... Only by acknowledging our limits can we...")
        ),
        listOf(
            d("A", "Do you think knowledge and wisdom are the same thing?", "فکر می‌کنی دانش و خرد یک چیز هستند؟"),
            d("B", "Far from it. Knowledge is the accumulation of facts; wisdom is the capacity to use them well — and to know when not to.", "اصلاً. دانش انباشت حقایق است؛ خرد ظرفیت استفاده خوب از آن‌هاست — و دانستن اینکه کی نه."),
            d("A", "Can someone be extremely knowledgeable yet unwise?", "کسی می‌تواند بسیار دانا ولی بی‌خرد باشد؟"),
            d("B", "Absolutely. History is replete with brilliant minds who made disastrous choices. Intelligence and wisdom are not merely distinct — they can even pull in opposite directions.", "قطعاً. تاریخ پر از ذهن‌های درخشان است که انتخاب‌های فاجعه‌بار کردند. هوش و خرد نه فقط متمایزند — می‌توانند حتی در جهت مخالف هم بکشند."),
            d("A", "That's a provocative claim.", "ادعای تحریک‌کننده‌ای‌ست."),
            d("B", "Is it? Consider a scientist of genius who neglects every relationship in his life. Or a brilliant financier who destroys his family for profit.", "آیا؟ دانشمند نابغه‌ای را در نظر بگیر که هر رابطه‌ای در زندگی‌اش را نادیده می‌گیرد. یا سرمایه‌دار درخشانی که خانواده‌اش را برای سود نابود می‌کند."),
            d("A", "So what distinguishes the wise from the merely clever?", "پس چه چیزی خردمند را از صرفاً زیرک متمایز می‌کند؟"),
            d("B", "Perspective. The wise see the whole, not just the parts. They understand that life is more than any single domain.", "دیدگاه. خردمند کل را می‌بیند، نه فقط اجزا. می‌فهمد که زندگی بیش از هر حوزه واحدی‌ست."),
            d("A", "Is wisdom something that can be taught?", "خرد چیزی‌ست که می‌توان آموزش داد؟"),
            d("B", "Not directly. It's cultivated through experience, reflection, and — crucially — failure. No one becomes wise by reading about wisdom.", "مستقیم نه. از طریق تجربه، تأمل، و — به طور حیاتی — شکست پرورش می‌یابد. هیچ‌کس با خواندن درباره خرد خردمند نمی‌شود."),
            d("A", "So the young cannot be wise?", "پس جوانان نمی‌توانند خردمند باشند؟"),
            d("B", "They can be — occasionally. But it's rare, and usually the result of unusual hardship. Wisdom is typically the fruit of time.", "می‌توانند — گاهی. ولی نادر است، و معمولاً نتیجه سختی غیرعادی‌ست. خرد معمولاً میوه زمان است."),
            d("A", "What about intellectual humility?", "فروتنی فکری چطور؟"),
            d("B", "It's essential to wisdom. Only by acknowledging our ignorance can we begin to learn. The wisest are often those most aware of how much they don't know.", "برای خرد ضروری‌ست. فقط با پذیرش جهلمان می‌توانیم شروع به یادگیری کنیم. خردمندترین‌ها اغلب آن‌هایی هستند که بیشتر از جهل‌شان آگاهند."),
            d("A", "That's the Socratic paradox, isn't it?", "این پارادوکس سقراطی‌ست، نه؟"),
            d("B", "Precisely. 'I know that I know nothing.' It's not false modesty — it's the beginning of genuine inquiry.", "دقیقاً. 'می‌دانم که هیچ نمی‌دانم.' این فروتنی دروغین نیست — آغاز کاوش اصیل است."),
            d("A", "Do you consider yourself wise?", "خودت را خردمند می‌دانی؟"),
            d("B", "Not at all. But I aspire to be. And perhaps that aspiration is itself a form of wisdom.", "اصلاً. ولی آرزو دارم باشم. و شاید خود آن آرزو نوعی خرد است."),
            d("A", "That's a beautiful way to see it.", "روش قشنگی برای دیدنش."),
            d("B", "It's the only honest way I can see it. Wisdom, after all, is a journey, not a destination.", "تنها راه صادقانه‌ای‌ست که می‌توانم ببینم. خرد، بعد از همه، سفر است نه مقصد."),
            d("A", "On that note, I think we've both learned something.", "بر این اساس، فکر می‌کنم هر دو چیزی یاد گرفتیم.")
        ),
        listOf(
            q("What's the difference between knowledge and wisdom?", listOf("same thing", "facts vs judgment", "knowledge is better"), 1),
            q("How is wisdom cultivated?", listOf("reading", "experience and failure", "memorising"), 1),
            q("Only by acknowledging our limits ___ we begin to learn.", listOf("can", "do", "are"), 0),
            q("The wisest are often ___ most aware of their ignorance.", listOf("those", "that", "which"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Far from it", "اصلاً", "Far from it.", "اصلاً."),
            IdiomExpression("Socratic paradox", "پارادوکس سقراطی", "The Socratic paradox.", "پارادوکس سقراطی."),
            IdiomExpression("Aspire to be", "آرزو داشتن بودن", "I aspire to be.", "آرزو دارم باشم.")
        ),
        pron = listOf(PronunciationTip("Philosophical paradox", "Emphasise the paradox: I know that I know NOTHing. Stress NOthing.")),
        cult = listOf(CulturalNote("Wisdom traditions", "Every culture has wisdom traditions. Ancient Greece, China, India, and Africa all developed sophisticated reflections on wise living.")),
        mis = listOf(
            CommonMistake("Wisdom, after all, it's a journey.", "Wisdom, after all, is a journey.", "Subject-verb-object without double subject."),
            CommonMistake("Only by acknowledging our limits we can begin.", "Only by acknowledging our limits can we begin.", "Inversion after 'only by'.")
        )
    )

    // ═══════════ FILE 8 — Ethics and morality ═══════════

    private fun f8A() = base(32, "8A The foundations of ethics", "۸A مبانی اخلاق",
        listOf("Use ethical vocabulary", "Discuss moral philosophy", "Argue for ethical positions"),
        listOf(
            v("utilitarian", "سودگرا", "A utilitarian argument.", "استدلال سودگرایانه.", "adjective"),
            v("deontological", "وظیفه‌گرا", "Deontological ethics.", "اخلاق وظیفه‌گرا.", "adjective"),
            v("virtue", "فضیلت", "Virtue ethics.", "اخلاق فضیلت."),
            v("consequentialist", "نتیجه‌گرا", "Consequentialist reasoning.", "استدلال نتیجه‌گرا.", "adjective"),
            v("moral", "اخلاقی", "Moral obligation.", "تعهد اخلاقی.", "adjective"),
            v("obligation", "تعهد", "A binding obligation.", "تعهد الزام‌آور."),
            v("autonomy", "استقلال", "Respect for autonomy.", "احترام به استقلال."),
            v("dignity", "کرامت", "Human dignity.", "کرامت انسانی."),
            v("consent", "رضایت", "Informed consent.", "رضایت آگاهانه."),
            v("harm", "آسیب", "The harm principle.", "اصل آسیب."),
            v("beneficence", "احسان", "Principle of beneficence.", "اصل احسان."),
            v("integrity", "صداقت", "Moral integrity.", "صداقت اخلاقی.")
        ),
        listOf(
            GrammarSection("Ethical argumentation", "From a utilitarian perspective, ... On a deontological view, ... The virtue ethicist would ask..."),
            GrammarSection("Hypothetical moral scenarios", "Suppose you were faced with... Imagine, for the sake of argument, that..."),
            GrammarSection("Moral reasoning", "If we accept that X is a moral principle, it follows that... That reasoning, however, leads to...")
        ),
        listOf(
            d("A", "Which ethical framework do you find most persuasive?", "کدام چارچوب اخلاقی را قانع‌کننده‌تر می‌یابی؟"),
            d("B", "Each has its strengths. Utilitarianism has the appeal of simplicity — maximise overall wellbeing.", "هرکدام نقاط قوت خودش را دارند. سودگرایی جذابیت سادگی دارد — حداکثرسازی رفاه کلی."),
            d("A", "What's the problem with it?", "مشکلش چیه؟"),
            d("B", "It can justify monstrous acts. If sacrificing one person saved ten, a strict utilitarian would do it. That troubles most people.", "می‌تواند اعمال هیولایی را توجیه کند. اگر فدا کردن یک نفر ده نفر را نجات دهد، سودگرای سختگیر این کار را می‌کند. این بیشتر مردم را نگران می‌کند."),
            d("A", "So you prefer deontology?", "پس وظیفه‌گرایی را ترجیح می‌دهی؟"),
            d("B", "Not entirely. Deontology — Kant's version, especially — says we must never treat people as mere means. That has strong intuitive appeal.", "کاملاً نه. وظیفه‌گرایی — مخصوصاً نسخه کانت — می‌گوید هرگز نباید با مردم صرفاً به عنوان ابزار رفتار کنیم. جذابیت شهودی قوی دارد."),
            d("A", "But it has problems too?", "ولی مشکل هم دارد؟"),
            d("B", "Yes. Absolutist deontology can lead to absurd conclusions. Kant argued one should never lie, even to a murderer asking where your friend is hiding.", "بله. وظیفه‌گرایی مطلق می‌تواند به نتایج پوچ منجر شود. کانت استدلال کرد هرگز نباید دروغ گفت، حتی به قاتلی که می‌پرسد دوستت کجا پنهان شده."),
            d("A", "That's famously troubling.", "به طور بدنامی نگران‌کننده‌ست."),
            d("B", "Indeed. Which is why many philosophers today favour a hybrid approach — or virtue ethics, which focuses on character rather than rules or outcomes.", "همینطور. برای همین بسیاری از فیلسوفان امروز رویکرد ترکیبی را ترجیح می‌دهند — یا اخلاق فضیلت، که بر شخصیت متمرکز است نه قواعد یا نتایج."),
            d("A", "What's the appeal of virtue ethics?", "جذابیت اخلاق فضیلت چیه؟"),
            d("B", "It asks a different question. Not 'what should I do?' but 'what kind of person should I be?' That resonates with how we actually experience moral life.", "سؤال متفاوتی می‌پرسد. نه 'چه کاری باید بکنم؟' بلکه 'چه نوع آدمی باید باشم؟' این با نحوه واقعی تجربه ما از زندگی اخلاقی همخوانی دارد."),
            d("A", "But it lacks clear guidance.", "ولی راهنمایی روشنی ندارد."),
            d("B", "A fair critique. Virtue ethics tells you the kind of person to become, but not always what to do in a specific dilemma.", "انتقاد منصفانه‌ای‌ست. اخلاق فضیلت به تو می‌گوید چه نوع آدمی شوی، ولی همیشه نمی‌گوید در دوراهی خاصی چیکار کنی."),
            d("A", "So which framework do you actually use?", "پس کدام چارچوب را واقعاً استفاده می‌کنی؟"),
            d("B", "A mixture. Utilitarian reasoning for policy questions, deontological constraints for individual rights, virtue considerations for personal life.", "ترکیبی. استدلال سودگرایانه برای سؤالات سیاستی، محدودیت‌های وظیفه‌گرایانه برای حقوق فردی، ملاحظات فضیلت برای زندگی شخصی."),
            d("A", "Isn't that inconsistent?", "ناسازگار نیست؟"),
            d("B", "It might seem so. But I'd argue moral life is irreducibly plural. No single framework captures its full complexity.", "ممکن است چنین به نظر برسد. ولی استدلال می‌کنم زندگی اخلاقی به طور تحویل‌ناپذیر پلورال است. هیچ چارچوب واحدی پیچیدگی کاملش را نمی‌گیرد."),
            d("A", "That's a sophisticated position.", "موضع پیچیده‌ای‌ست."),
            d("B", "It's the most honest one I can defend.", "صادقانه‌ترین چیزی‌ست که می‌توانم از آن دفاع کنم.")
        ),
        listOf(
            q("What's the problem with utilitarianism?", listOf("too complex", "justifies monstrous acts", "no math"), 1),
            q("What does virtue ethics focus on?", listOf("rules", "character", "outcomes"), 1),
            q("Suppose you ___ faced with a dilemma.", listOf("were", "was", "are"), 0),
            q("If we accept this principle, it ___ that we must act.", listOf("follows", "follow", "following"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Means to an end", "ابزار برای هدف", "Never treat people as means to an end.", "هرگز با مردم به عنوان ابزار برای هدف رفتار نکن."),
            IdiomExpression("Intuitive appeal", "جذابیت شهودی", "It has intuitive appeal.", "جذابیت شهودی دارد."),
            IdiomExpression("All things considered", "با در نظر گرفتن همه چیز", "All things considered, it's a hybrid.", "با در نظر گرفتن همه چیز، ترکیبی‌ست.")
        ),
        pron = listOf(PronunciationTip("Philosophical terms", "Emphasise: utilitaRIan, deontoLOGical, consequenTIAList, BENEficence.")),
        cult = listOf(CulturalNote("Ethics", "Western moral philosophy has three main traditions: virtue ethics (Aristotle), deontology (Kant), and consequentialism (Bentham, Mill).")),
        mis = listOf(
            CommonMistake("If we accept this principle, it follow that...", "If we accept this principle, it follows that...", "Third person singular."),
            CommonMistake("Suppose you was faced with...", "Suppose you were faced with...", "Subjunctive 'were'.")
        )
    )

    private fun f8B() = base(33, "8B Bioethics", "۸B اخلاق زیستی",
        listOf("Use bioethical vocabulary", "Discuss medical ethics", "Argue about life-and-death issues"),
        listOf(
            v("euthanasia", "اتانازی", "Debate on euthanasia.", "بحث در مورد اتانازی."),
            v("autonomy", "استقلال", "Patient autonomy.", "استقلال بیمار."),
            v("beneficence", "احسان", "Principle of beneficence.", "اصل احسان."),
            v("non-maleficence", "عدم اضرار", "Non-maleficence in medicine.", "عدم اضرار در پزشکی."),
            v("justice", "عدالت", "Distributive justice.", "عدالت توزیعی."),
            v("consent", "رضایت", "Informed consent.", "رضایت آگاهانه."),
            v("dignity", "کرامت", "Death with dignity.", "مرگ با کرامت."),
            v("gene editing", "ویرایش ژن", "Ethics of gene editing.", "اخلاق ویرایش ژن."),
            v("reproductive", "باروری", "Reproductive rights.", "حقوق باروری.", "adjective"),
            v("surrogate", "جانشین", "Surrogate motherhood.", "مادر جانشین."),
            v("viability", "قابلیت حیات", "Foetal viability.", "قابلیت حیات جنین."),
            v("palliative", "تسکینی", "Palliative care.", "مراقبت تسکینی.", "adjective")
        ),
        listOf(
            GrammarSection("Moral dilemma structures", "On the one hand, one might argue... On the other, it could be countered that..."),
            GrammarSection("Weighing principles", "Balancing autonomy against beneficence, we might conclude..."),
            GrammarSection("Moral calculus", "If we privilege X over Y, we would be forced to accept...")
        ),
        listOf(
            d("A", "Where do you stand on assisted dying?", "موضعت درباره مرگ کمکی چیست؟"),
            d("B", "I lean toward permitting it, in tightly regulated circumstances. But I hold that position with considerable unease.", "به سمت اجازه دادن در شرایط به شدت تنظیم‌شده تمایل دارم. ولی آن موضع را با ناراحتی قابل توجه نگه می‌دارم."),
            d("A", "Why the unease?", "چرا ناراحتی؟"),
            d("B", "Because the arguments cut both ways. Autonomy suggests we should respect a competent person's wish to die with dignity. But the potential for abuse — coercion, subtle pressure on the vulnerable — is real.", "چون استدلال‌ها دو طرفه برش می‌زنند. استقلال پیشنهاد می‌کند باید خواسته فرد صالح برای مرگ با کرامت را محترم بشماریم. ولی پتانسیل سوءاستفاده — اجبار، فشار ظریف بر آسیب‌پذیران — واقعی‌ست."),
            d("A", "So how do you weigh it?", "پس چطور وزنش می‌کنی؟"),
            d("B", "Balancing the two, I'd argue for strict safeguards: multiple independent assessments, waiting periods, psychiatric evaluation.", "با وزن کردن هر دو، استدلال می‌کنم برای محافظ‌های سخت: ارزیابی‌های مستقل متعدد، دوره‌های انتظار، ارزیابی روانپزشکی."),
            d("A", "Do those actually prevent abuse?", "آیا واقعاً از سوءاستفاده جلوگیری می‌کنند؟"),
            d("B", "In jurisdictions like the Netherlands, where the practice has been studied, evidence suggests they mostly do. But no system is perfect.", "در حوزه‌هایی مثل هلند، جایی که این عمل مطالعه شده، شواهد پیشنهاد می‌کنند عمدتاً می‌کنند. ولی هیچ سیستمی کامل نیست."),
            d("A", "What about those who can't consent — dementia patients, for example?", "درباره کسانی که نمی‌توانند رضایت دهند — مثلاً بیماران دمانس؟"),
            d("B", "That's where it becomes genuinely fraught. Advance directives help, but they can't cover every circumstance.", "اینجا جایی‌ست که واقعاً پرتنش می‌شود. دستورالعمل‌های پیشاپیش کمک می‌کنند، ولی نمی‌توانند هر شرایطی را پوشش دهند."),
            d("A", "What about the role of doctors?", "نقش پزشکان چطور؟"),
            d("B", "Some welcome it; others consider it a betrayal of their vocation. In many places, doctors may conscientiously object.", "بعضی استقبال می‌کنند؛ دیگران آن را خیانت به حرفه‌شان می‌دانند. در بسیاری از جاها، پزشکان می‌توانند وجداناً اعتراض کنند."),
            d("A", "Does that create problems?", "آیا آن مشکلات ایجاد می‌کند؟"),
            d("B", "Potentially. If too many object, access becomes unequal. That raises distributive justice concerns.", "بالقوه. اگر تعداد زیادی اعتراض کنند، دسترسی نابرابر می‌شود. این نگرانی‌های عدالت توزیعی را مطرح می‌کند."),
            d("A", "What about the slippery slope argument?", "استدلال سراشیبی لغزنده چطور؟"),
            d("B", "It's been made, and in some jurisdictions, expansions have followed initial legalisation. Whether that's a moral tragedy or a sign of evolving ethics is contested.", "مطرح شده، و در بعضی حوزه‌ها، گسترش‌ها به دنبال قانونی‌سازی اولیه آمده‌اند. اینکه فاجعه اخلاقی‌ست یا نشانه اخلاق در حال تحول، مورد مناقشه است."),
            d("A", "So you don't find the slippery slope conclusive?", "پس سراشیبی لغزنده را قطعی نمی‌یابی؟"),
            d("B", "Not conclusive, but not negligible either. It counsels caution, not prohibition.", "قطعی نه، ولی ناچیز هم نه. توصیه به احتیاط می‌کند، نه ممنوعیت."),
            d("A", "What about non-Western perspectives?", "دیدگاه‌های غیرغربی چطور؟"),
            d("B", "Vital to consider. Different traditions weigh autonomy differently. In some cultures, family and community play a larger role in such decisions.", "حیاتی برای در نظر گرفتن. سنت‌های مختلف استقلال را متفاوت وزن می‌کنند. در بعضی فرهنگ‌ها، خانواده و جامعه نقش بزرگ‌تری در چنین تصمیماتی دارند."),
            d("A", "That's a good reminder.", "یادآوری خوبی‌ست."),
            d("B", "It is. We must beware of assuming our intuitions are universal.", "هست. باید مراقب باشیم فرض نکنیم شهودهایمان جهانی‌اند.")
        ),
        listOf(
            q("What does B argue for?", listOf("full legalisation", "strict safeguards", "total ban"), 1),
            q("What's the slippery slope concern?", listOf("costs", "expansion of eligibility", "doctors"), 1),
            q("___ we privilege autonomy over beneficence, we would accept...", listOf("If", "Unless", "Though"), 0),
            q("Balancing autonomy against beneficence, we ___ conclude...", listOf("might", "may", "should"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Cut both ways", "دو طرفه برش زدن", "Arguments cut both ways.", "استدلال‌ها دو طرفه برش می‌زنند."),
            IdiomExpression("Slippery slope", "سراشیبی لغزنده", "The slippery slope argument.", "استدلال سراشیبی لغزنده."),
            IdiomExpression("Conscientiously object", "وجداناً اعتراض کردن", "Doctors may conscientiously object.", "پزشکان می‌توانند وجداناً اعتراض کنند.")
        ),
        pron = listOf(PronunciationTip("Ethical vocabulary", "Emphasise technical terms: euthaNASia, beneficence, non-maleficence, distriBUTive justice.")),
        cult = listOf(CulturalNote("Medical ethics", "The four principles of biomedical ethics — autonomy, beneficence, non-maleficence, and justice — were formulated by Beauchamp and Childress.")),
        mis = listOf(
            CommonMistake("I hold that position with considerable unease, don't I?", "I hold that position with considerable unease.", "Avoid tag questions in formal argument."),
            CommonMistake("Whether that is a tragedy or a sign of evolving ethics are contested.", "Whether that is a tragedy or a sign of evolving ethics is contested.", "Singular subject 'whether clause'.")
        )
    )

    private fun f8C() = base(34, "8C Environmental ethics", "۸C اخلاق زیست‌محیطی",
        listOf("Use ecological and ethical vocabulary", "Discuss environmental responsibility", "Argue for intergenerational justice"),
        listOf(
            v("anthropocentric", "انسان‌محور", "Anthropocentric worldview.", "جهان‌بینی انسان‌محور.", "adjective"),
            v("biocentric", "زیست‌محور", "Biocentric ethics.", "اخلاق زیست‌محور.", "adjective"),
            v("stewardship", "سرپرستی", "Environmental stewardship.", "سرپرستی زیست‌محیطی."),
            v("intergenerational", "بین‌نسلی", "Intergenerational justice.", "عدالت بین‌نسلی.", "adjective"),
            v("sustainability", "پایداری", "Environmental sustainability.", "پایداری زیست‌محیطی."),
            v("intrinsic", "ذاتی", "Intrinsic value of nature.", "ارزش ذاتی طبیعت.", "adjective"),
            v("instrumental", "ابزاری", "Instrumental value.", "ارزش ابزاری.", "adjective"),
            v("precautionary", "احتیاطی", "Precautionary principle.", "اصل احتیاط.", "adjective"),
            v("accountability", "پاسخگویی", "Environmental accountability.", "پاسخگویی زیست‌محیطی."),
            v("restoration", "بازسازی", "Ecological restoration.", "بازسازی اکولوژیک."),
            v("extinction", "انقراض", "Mass extinction.", "انقراض دسته‌جمعی."),
            v("steward", "سرپرست", "Stewards of the Earth.", "سرپرستان زمین.")
        ),
        listOf(
            GrammarSection("Intergenerational argumentation", "Future generations will inherit... We hold the Earth in trust for..."),
            GrammarSection("Moral extension", "If we extend moral consideration to... then it follows that..."),
            GrammarSection("Principle-based reasoning", "On the precautionary principle, we should act even amid uncertainty.")
        ),
        listOf(
            d("A", "Do we have moral obligations to future generations?", "آیا تعهدات اخلاقی به نسل‌های آینده داریم؟"),
            d("B", "I'd argue we do — emphatically. The fact that they cannot yet speak doesn't diminish our duty to them.", "استدلال می‌کنم داریم — به شدت. اینکه هنوز نمی‌توانند صحبت کنند، وظیفه ما نسبت به آن‌ها را کم نمی‌کند."),
            d("A", "But they don't exist yet. How can we owe anything to non-existent people?", "ولی هنوز وجود ندارند. چطور می‌توانیم به افراد ناموجود مدیون باشیم؟"),
            d("B", "A philosophical puzzle. But they will exist — that's certain. And the actions we take now will profoundly shape their lives.", "معمای فلسفی. ولی وجود خواهند داشت — این قطعی‌ست. و اقداماتی که الان می‌کنیم زندگی‌هایشان را عمیقاً شکل می‌دهد."),
            d("A", "What makes our obligations to them distinctive?", "چه چیزی تعهدات ما را نسبت به آن‌ها متمایز می‌کند؟"),
            d("B", "Their vulnerability. They cannot negotiate with us, protest our decisions, or hold us accountable. Their very existence depends on our choices.", "آسیب‌پذیری‌شان. نمی‌توانند با ما مذاکره کنند، به تصمیماتمان اعتراض کنند، یا ما را پاسخگو کنند. خود وجودشان به انتخاب‌های ما بستگی دارد."),
            d("A", "That's a compelling argument.", "استدلال قانع‌کننده‌ای‌ست."),
            d("B", "It's why some philosophers argue for a principle of intergenerational neutrality — that we should not privilege our own generation's interests over theirs.", "برای همین بعضی فیلسوفان از اصل بی‌طرفی بین‌نسلی دفاع می‌کنند — اینکه نباید منافع نسل خودمان را بر منافع آن‌ها ترجیح دهیم."),
            d("A", "What about the natural world itself? Does it have moral standing?", "دنیای طبیعی خودش چطور؟ جایگاه اخلاقی دارد؟"),
            d("B", "That's where anthropocentric and biocentric views diverge. On the anthropocentric view, nature matters only for human benefit. On the biocentric, it has intrinsic value.", "اینجا جایی‌ست که دیدگاه‌های انسان‌محور و زیست‌محور واگرا می‌شوند. در دیدگاه انسان‌محور، طبیعت فقط به خاطر نفع انسانی اهمیت دارد. در زیست‌محور، ارزش ذاتی دارد."),
            d("A", "Which do you hold?", "کدام را داری؟"),
            d("B", "Something between. I find the biocentric view admirable, but I can't fully escape an anthropocentric framework — I am, after all, human.", "چیزی بین. دیدگاه زیست‌محور را تحسین‌برانگیز می‌یابم، ولی نمی‌توانم کاملاً از چارچوب انسان‌محور خارج شوم — بعد از همه، من انسانم."),
            d("A", "Is that a failure?", "این شکست است؟"),
            d("B", "Not a failure, but a limitation — one that honesty requires us to acknowledge.", "شکست نه، بلکه محدودیت — یکی که صداقت ما را ملزم به پذیرشش می‌کند."),
            d("A", "What role does uncertainty play in environmental ethics?", "عدم قطعیت چه نقشی در اخلاق زیست‌محیطی دارد؟"),
            d("B", "A central one. The precautionary principle holds that where there's a risk of serious harm, we should act even without full scientific certainty.", "نقش مرکزی. اصل احتیاط می‌گوید جایی که خطر آسیب جدی هست، باید عمل کنیم حتی بدون قطعیت علمی کامل."),
            d("A", "Isn't that potentially paralysing?", "بالقوه فلج‌کننده نیست؟"),
            d("B", "It can be, if applied indiscriminately. But on matters of existential risk, caution is warranted.", "می‌تواند باشد، اگر بی‌تمایز اعمال شود. ولی در مسائل خطر وجودی، احتیاط موجه است."),
            d("A", "What would you say to climate sceptics?", "به شک‌گرایان اقلیمی چه می‌گویی؟"),
            d("B", "That the burden of proof has shifted. The overwhelming scientific consensus supports urgent action. Demanding absolute certainty before acting is itself a form of irresponsibility.", "اینکه بار اثبات تغییر کرده. اجماع علمی قوی از اقدام فوری حمایت می‌کند. مطالبه قطعیت مطلق قبل از اقدام خودش نوعی بی‌مسئولیتی‌ست."),
            d("A", "On that note, what gives you hope?", "بر این اساس، چه چیزی بهت امید می‌دهد؟"),
            d("B", "The passion of the young. They understand that this isn't an abstraction — it's their future we're deciding.", "شور جوانان. آن‌ها می‌فهمند این انتزاعی نیست — آینده آن‌هاست که تصمیم می‌گیریم.")
        ),
        listOf(
            q("What principle does B invoke for future generations?", listOf("utilitarian", "intergenerational neutrality", "slippery slope"), 1),
            q("What's the precautionary principle?", listOf("wait for certainty", "act despite uncertainty", "do nothing"), 1),
            q("If we extend consideration to future people, it ___ that we owe them something.", listOf("follows", "follow", "following"), 0),
            q("Future generations ___ inherit our choices.", listOf("will", "would", "are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Hold in trust", "به امانت نگه داشتن", "We hold the Earth in trust.", "زمین را به امانت نگه داشته‌ایم."),
            IdiomExpression("Burden of proof", "بار اثبات", "The burden of proof has shifted.", "بار اثبات تغییر کرده."),
            IdiomExpression("On that note", "بر این اساس", "On that note, what gives you hope?", "بر این اساس، چه چیزی بهت امید می‌دهد؟")
        ),
        pron = listOf(PronunciationTip("Ethical discourse", "Slow, deliberate. Emphasise key concepts: anthropoCENtric, intergenerA Tional, PREcautionary principle.")),
        cult = listOf(CulturalNote("Environmental ethics", "The field emerged in the 1970s. Key figures include Peter Singer (animal liberation), Arne Naess (deep ecology), and Hans Jonas (responsibility to future generations).")),
        mis = listOf(
            CommonMistake("We should act even without full certainty, isn't it?", "We should act even without full certainty.", "Avoid tag questions in formal argument."),
            CommonMistake("The overwhelming scientific consensus support urgent action.", "The overwhelming scientific consensus supports urgent action.", "Subject-verb agreement (consensus is singular).")
        )
    )

    // ═══════════ FILE 9 — Language and power ═══════════

    private fun f9A() = base(35, "9A Language and power", "۹A زبان و قدرت",
        listOf("Use critical discourse analysis", "Discuss language and ideology", "Express meta-linguistic insights"),
        listOf(
            v("discourse", "گفتمان", "Political discourse.", "گفتمان سیاسی."),
            v("ideology", "ایدئولوژی", "Embedded ideology.", "ایدئولوژی نهفته."),
            v("hegemony", "هژمونی", "Linguistic hegemony.", "هژمونی زبانی."),
            v("framing", "قاب‌بندی", "Media framing.", "قاب‌بندی رسانه‌ای."),
            v("rhetoric", "سخنوری", "Political rhetoric.", "سخنوری سیاسی."),
            v("euphemism", "به‌گویی", "A convenient euphemism.", "به‌گویی راحت."),
            v("loaded", "باردار", "Loaded language.", "زبان باردار.", "adjective"),
            v("code-switching", "تغییر کد", "Code-switching in bilinguals.", "تغییر کد در دوزبانه‌ها."),
            v("register", "لحن", "Formal register.", "لحن رسمی."),
            v("subtext", "زیرمتن", "A political subtext.", "زیرمتن سیاسی."),
            v("lexical", "واژگانی", "Lexical choices.", "انتخاب‌های واژگانی.", "adjective"),
            v("agency", "عاملیت", "Attributing agency.", "نسبت دادن عاملیت.")
        ),
        listOf(
            GrammarSection("Critical analysis", "Note how the passive obscures agency. Observe that the choice of lexis implies..."),
            GrammarSection("Metalanguage", "The term 'X' carries connotations of... The framing suggests a particular interpretation."),
            GrammarSection("Discursive positioning", "By positioning the reader as..., the text invites...")
        ),
        listOf(
            d("A", "Do you think language can be a tool of power?", "فکر می‌کنی زبان می‌تواند ابزار قدرت باشد؟"),
            d("B", "Without question. Indeed, I'd argue it's one of the most insidious forms. It operates subtly, often invisibly.", "بدون شک. در واقع، استدلال می‌کنم یکی از موذی‌ترین اشکال است. ظریف، اغلب نامرئی عمل می‌کند."),
            d("A", "Can you give an example?", "مثالی می‌زنی؟"),
            d("B", "Consider how governments describe military action. 'Collateral damage' for civilian deaths. 'Enhanced interrogation' for torture.", "در نظر بگیر دولت‌ها چطور اقدام نظامی را توصیف می‌کنند. 'خسارت جانبی' برای مرگ غیرنظامیان. 'بازجویی پیشرفته' برای شکنجه."),
            d("A", "So euphemism is a form of power?", "پس به‌گویی نوعی قدرت است؟"),
            d("B", "Absolutely. By renaming, we reshape how people perceive. Language doesn't merely describe reality — it constructs it.", "قطعاً. با نام‌گذاری مجدد، درک مردم را بازشکل می‌دهیم. زبان صرفاً واقعیت را توصیف نمی‌کند — آن را می‌سازد."),
            d("A", "That's a strong claim.", "ادعای قوی‌ای‌ست."),
            d("B", "It's one made by critical discourse analysts. Consider how the passive voice can obscure responsibility. 'Mistakes were made' — by whom?", "یکی‌ست که تحلیل‌گران گفتمان انتقادی می‌کنند. در نظر بگیر صدای مجهول چطور می‌تواند مسئولیت را پنهان کند. 'اشتباهاتی رخ داد' — توسط کی؟"),
            d("A", "Clever.", "هوشمندانه."),
            d("B", "And pervasive. Politicians of all stripes use these techniques. The choice of frame determines what's even thinkable.", "و فراگیر. سیاستمداران از هر نوع از این تکنیک‌ها استفاده می‌کنند. انتخاب قاب تعیین می‌کند چه چیزی حتی قابل فکر است."),
            d("A", "Is there any way to resist this?", "راهی برای مقاومت هست؟"),
            d("B", "Critical awareness. Reading widely. Interrogating the language we encounter — asking who benefits from a particular framing.", "آگاهی انتقادی. خواندن گسترده. بازپرسی زبانی که با آن مواجهیم — پرسیدن چه کسی از قاب خاص سود می‌برد."),
            d("A", "What about the way news outlets frame stories?", "نحوه قاب‌بندی داستان‌ها توسط رسانه‌ها چطور؟"),
            d("B", "A classic example. Two papers can report the same event with completely different framings, leading readers to opposite conclusions.", "مثال کلاسیک. دو روزنامه می‌توانند یک رویداد را با قاب‌بندی‌های کاملاً متفاوت گزارش کنند، خوانندگان را به نتیجه‌گیری‌های متضاد هدایت کنند."),
            d("A", "Do you think this is deliberate?", "فکر می‌کنی این عمدی‌ست؟"),
            d("B", "Sometimes. But often it's unconscious — journalists embedded in particular worldviews, unaware of their own assumptions.", "گاهی. ولی اغلب ناخودآگاه است — روزنامه‌نگاران جای‌گرفته در جهان‌بینی‌های خاص، بی‌خبر از فرض‌های خودشان."),
            d("A", "So what can we do?", "پس چیکار می‌توانیم بکنیم؟"),
            d("B", "Read across the spectrum. Notice the language. Ask whose interests are served. There's no neutral ground — only more or less reflective positions.", "در طیف بخوان. زبان را متوجه شو. بپرس منافع چه کسی خدمت می‌شود. زمین بی‌طرفی نیست — فقط مواضعی کمابیش تأملی."),
            d("A", "That's sobering.", "هوشیارکننده‌ست."),
            d("B", "It is. But awareness itself is a form of power.", "هست. ولی خود آگاهی نوعی قدرت است.")
        ),
        listOf(
            q("What's B's example of euphemism?", listOf("politician", "collateral damage", "sports"), 1),
            q("What does passive voice do?", listOf("clarifies", "obscures agency", "simplifies"), 1),
            q("Note how the passive ___ agency.", listOf("obscures", "obscure", "obscuring"), 0),
            q("By positioning the reader, the text ___ a particular view.", listOf("invites", "invite", "inviting"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Of all stripes", "از هر نوع", "Politicians of all stripes.", "سیاستمداران از هر نوع."),
            IdiomExpression("Whose interests are served?", "منافع چه کسی خدمت می‌شود؟", "Ask whose interests are served.", "بپرس منافع چه کسی خدمت می‌شود."),
            IdiomExpression("Neutral ground", "زمین بی‌طرف", "There's no neutral ground.", "زمین بی‌طرفی نیست.")
        ),
        pron = listOf(PronunciationTip("Critical analysis", "Precise articulation. Emphasise analytical terms: DIScourse, IDeology, EUPHeMism, FRAMing.")),
        cult = listOf(CulturalNote("Critical discourse analysis", "Pioneered by Norman Fairclough and Ruth Wodak. It examines how language reproduces power relations and ideologies.")),
        mis = listOf(
            CommonMistake("Note how the passive obscure agency.", "Note how the passive obscures agency.", "Third person singular."),
            CommonMistake("Politicians of all stripes uses these techniques.", "Politicians of all stripes use these techniques.", "Plural subject.")
        )
    )

    private fun f9B() = base(36, "9B Rhetoric and persuasion", "۹B سخنوری و متقاعدسازی",
        listOf("Analyse rhetorical devices", "Discuss persuasion in public discourse", "Craft persuasive arguments"),
        listOf(
            v("anaphora", "تکرار آغازین", "Anaphora in speeches.", "تکرار آغازین در سخنرانی‌ها."),
            v("antithesis", "تضاد", "A classic antithesis.", "تضاد کلاسیک."),
            v("pathos", "پاتوس", "Appeal to pathos.", "توسل به پاتوس."),
            v("ethos", "اتوس", "Establishing ethos.", "برقراری اتوس."),
            v("logos", "لوگوس", "Grounding in logos.", "مبتنی بر لوگوس."),
            v("tricolon", "ترکیب سه‌گانه", "A memorable tricolon.", "ترکیب سه‌گانه به‌یادماندنی."),
            v("metaphor", "استعاره", "Sustained metaphor.", "استعاره پایدار."),
            v("hyperbole", "اغراق", "Rhetorical hyperbole.", "اغراق سخنورانه."),
            v("understatement", "کم‌گویی", "British understatement.", "کم‌گویی بریتانیایی."),
            v("allusion", "تلمیح", "Literary allusion.", "تلمیح ادبی."),
            v("rhetorical", "سخنورانه", "A rhetorical question.", "سؤال سخنورانه.", "adjective"),
            v("cadence", "آهنگ", "Speech cadence.", "آهنگ گفتار.")
        ),
        listOf(
            GrammarSection("Analytical metalanguage", "The speaker employs anaphora to... The tricolon lends a sense of..."),
            GrammarSection("Evaluation of rhetoric", "Effective though it is, the argument relies on... The persuasion is achieved less by logic than by..."),
            GrammarSection("Rhetorical questions", "Can we really accept...? Have we forgotten...? Is it not time to...?")
        ),
        listOf(
            d("A", "What makes a speech memorable?", "چه چیزی سخنرانی را به‌یادماندنی می‌کند؟"),
            d("B", "Rhetorical craft. The greatest speeches combine substance with form — they're not just well-argued, they're beautifully constructed.", "صنعت سخنوری. بزرگ‌ترین سخنرانی‌ها محتوا را با فرم ترکیب می‌کنند — فقط خوب استدلال‌شده نیستند، زیبا ساخته شده‌اند."),
            d("A", "Can you illustrate?", "می‌توانی مثال بزنی؟"),
            d("B", "Consider Churchill's wartime speeches. Their power lies partly in their cadence — the rhythmic rise and fall that stirs something primal in the listener.", "سخنرانی‌های جنگی چرچیل را در نظر بگیر. قدرتش تا حدی در آهنگشان است — فراز و فرود ریتمیک که چیزی بدوی در شنونده برمی‌انگیزد."),
            d("A", "Is that rhetoric or manipulation?", "این سخنوری است یا دستکاری؟"),
            d("B", "A fine line. Rhetoric becomes manipulation when it deceives; it remains rhetoric when it clarifies and moves simultaneously.", "خط باریکی‌ست. سخنوری وقتی دستکاری می‌شود که فریب دهد؛ وقتی روشن می‌کند و همزمان تکان می‌دهد، سخنوری می‌ماند."),
            d("A", "What about the classical appeals?", "توسل‌های کلاسیک چطور؟"),
            d("B", "Ethos, pathos, logos. The most effective speeches employ all three. Ethos establishes the speaker's credibility. Pathos engages emotion. Logos provides logical structure.", "اتوس، پاتوس، لوگوس. مؤثرترین سخنرانی‌ها هر سه را به کار می‌گیرند. اتوس اعتبار سخنران را برقرار می‌کند. پاتوس احساس را درگیر می‌کند. لوگوس ساختار منطقی فراهم می‌کند."),
            d("A", "Give me an example of each.", "برای هرکدام مثالی بزن."),
            d("B", "In 'I Have a Dream', ethos appears in King's references to Lincoln. Pathos, in the vivid imagery of injustice. Logos, in the carefully reasoned argument for civil rights.", "در 'رؤیایی دارم'، اتوس در ارجاعات کینگ به لینکلن ظاهر می‌شود. پاتوس، در تصویرسازی زنده از بی‌عدالتی. لوگوس، در استدلال دقیق برای حقوق مدنی."),
            d("A", "That speech is often called the greatest of the 20th century.", "آن سخنرانی اغلب بزرگ‌ترین قرن بیستم نامیده می‌شود."),
            d("B", "With good reason. Its anaphora — 'I have a dream' repeated — creates a hypnotic, incantatory effect. It's unforgettable.", "به دلیل خوبی. تکرار آغازینش — 'رؤیایی دارم' تکرارشده — اثری هیپنوتیکی، وردگونه ایجاد می‌کند. فراموش‌نشدنی‌ست."),
            d("A", "Do modern politicians use these techniques?", "سیاستمداران مدرن این تکنیک‌ها را استفاده می‌کنند؟"),
            d("B", "Some do. But our age seems to favour authenticity over eloquence — plain speaking over rhetorical flourish. Whether that's progress is debatable.", "بعضی می‌کنند. ولی عصر ما به نظر می‌رسد اصالت را بر فصاحت ترجیح می‌دهد — ساده‌گویی بر شکوه سخنورانه. اینکه پیشرفت است قابل بحث است."),
            d("A", "Why might that be?", "چرا ممکن است باشد؟"),
            d("B", "Suspicion of elites, perhaps. Or a reaction against perceived manipulation. When rhetoric is abused, it discredits the art itself.", "احتمالاً بدگمانی به نخبگان. یا واکنشی در برابر دستکاری درک‌شده. وقتی سخنوری مورد سوءاستفاده قرار می‌گیرد، خود هنر را بی‌اعتبار می‌کند."),
            d("A", "So we've become a culture of understatement?", "پس ما فرهنگ کم‌گویی شده‌ایم؟"),
            d("B", "Something like that. Or perhaps of genuine feeling over polished form. There's merit in both, of course.", "چیزی شبیه این. یا شاید احساس اصیل بر فرم صیقلی. فضیلت در هر دو هست، البته."),
            d("A", "Which do you prefer?", "کدام را ترجیح می‌دهی؟"),
            d("B", "I admire eloquence — when it's genuinely in service of substance. But I distrust it too, for that very reason.", "فصاحت را تحسین می‌کنم — وقتی واقعاً در خدمت محتوا باشد. ولی به آن هم بی‌اعتمادم، دقیقاً به همین دلیل."),
            d("A", "You sound conflicted.", "متناقض به نظر می‌رسی."),
            d("B", "I am. And I think that's the appropriate response to power — including the power of words.", "هستم. و فکر می‌کنم پاسخ مناسب به قدرت همین است — شامل قدرت کلمات.")
        ),
        listOf(
            q("What does B say about Churchill's speeches?", listOf("dull", "rhythmic", "logical only"), 1),
            q("What are the three classical appeals?", listOf("ethos, pathos, logos", "logos, mythos, ethos", "pathos, humor, logos"), 0),
            q("The speaker ___ anaphora to create rhythm.", listOf("employs", "employ", "employing"), 0),
            q("___ we really accept this without question?", listOf("Can", "Do", "Are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Fine line", "خط باریک", "A fine line between rhetoric and manipulation.", "خط باریکی بین سخنوری و دستکاری."),
            IdiomExpression("For that very reason", "دقیقاً به همین دلیل", "I distrust it for that very reason.", "دقیقاً به همین دلیل بی‌اعتمادم."),
            IdiomExpression("Appropriate response", "پاسخ مناسب", "That's the appropriate response.", "پاسخ مناسبی‌ست.")
        ),
        pron = listOf(PronunciationTip("Rhetorical analysis", "Emphasise Greek terms: EEthos, PAYthos, LOGos, aNAphora, TRIcolon.")),
        cult = listOf(CulturalNote("Rhetoric", "Western rhetorical tradition begins with Aristotle's 'Rhetoric'. Its three appeals — ethos, pathos, logos — remain foundational.")),
        mis = listOf(
            CommonMistake("The speaker employ anaphora.", "The speaker employs anaphora.", "Third person singular."),
            CommonMistake("Can we really accept this? No, isn't it?", "Can we really accept this?", "Avoid tag questions in rhetorical analysis.")
        )
    )

    private fun f9C() = base(37, "9C Censorship and free speech", "۹C سانسور و آزادی بیان",
        listOf("Debate free speech limits", "Analyse censorship arguments", "Express principled positions"),
        listOf(
            v("censorship", "سانسور", "Government censorship.", "سانسور دولتی."),
            v("incitement", "تحریک", "Incitement to violence.", "تحریک به خشونت."),
            v("blasphemy", "کفرگویی", "Blasphemy laws.", "قوانین کفرگویی."),
            v("defamation", "افترا", "Defamation lawsuit.", "دعوای افترا."),
            v("prior restraint", "ممانعت پیشینی", "Prior restraint doctrine.", "دکترین ممانعت پیشینی."),
            v("hate speech", "گفتار نفرت‌آمیز", "Laws against hate speech.", "قوانین علیه گفتار نفرت‌آمیز."),
            v("chilling effect", "اثر بازدارنده", "A chilling effect on speech.", "اثر بازدارنده بر گفتار."),
            v("marketplace", "بازار", "Marketplace of ideas.", "بازار ایده‌ها."),
            v("absolutist", "مطلق‌گرا", "An absolutist view.", "دیدگاه مطلق‌گرا.", "adjective"),
            v("harm principle", "اصل آسیب", "Mill's harm principle.", "اصل آسیب میل."),
            v("regulated", "تنظیم‌شده", "A regulated space.", "فضای تنظیم‌شده.", "adjective")
        ),
        listOf(
            GrammarSection("Principle-based argument", "On the harm principle, speech should only be restricted when it directly harms."),
            GrammarSection("Concessive argument", "While it's true that... we must also consider... Granted that..., it does not follow that..."),
            GrammarSection("Balancing rights", "Weighing free expression against other goods, one might argue...")
        ),
        listOf(
            d("A", "Should there be limits to free speech?", "آیا باید محدودیت‌هایی برای آزادی بیان باشد؟"),
            d("B", "Of course. Even the most passionate defender of free expression accepts that some speech — direct incitement to violence, say — must be restricted.", "قطعاً. حتی پرشورترین مدافع آزادی بیان می‌پذیرد که بعضی گفتار — مثلاً تحریک مستقیم به خشونت — باید محدود شود."),
            d("A", "So the debate is about where the line falls?", "پس بحث درباره جایی‌ست که خط می‌افتد؟"),
            d("B", "Precisely. The absolutist position — that all speech must be protected — is untenable. But so is the view that any speech someone finds offensive can be banned.", "دقیقاً. موضع مطلق‌گرا — اینکه همه گفتار باید محافظت شود — غیرقابل دفاع است. ولی دیدگاهی هم که هر گفتاری که کسی توهین‌آمیز می‌یابد می‌تواند ممنوع شود، همینطور."),
            d("A", "Where would you draw it?", "کجا می‌کشی‌اش؟"),
            d("B", "I'm drawn to Mill's harm principle — speech should be restricted only when it directly causes harm to others. But defining 'harm' is notoriously difficult.", "به اصل آسیب میل کشیده می‌شوم — گفتار باید فقط وقتی محدود شود که مستقیماً به دیگران آسیب می‌زند. ولی تعریف 'آسیب' به طور بدنامی سخت است."),
            d("A", "What about hate speech?", "گفتار نفرت‌آمیز چطور؟"),
            d("B", "That's the hardest case. The US permits most hate speech; many European countries prohibit it. Both positions have principled defenders.", "سخت‌ترین مورد. آمریکا بیشتر گفتار نفرت‌آمیز را مجاز می‌داند؛ بسیاری از کشورهای اروپایی آن را ممنوع می‌کنند. هر دو موضع مدافعان اصولی دارند."),
            d("A", "Which do you prefer?", "کدام را ترجیح می‌دهی؟"),
            d("B", "I lean toward the American approach, though with reservations. The marketplace of ideas works imperfectly, but censorship tends to backfire.", "به رویکرد آمریکایی تمایل دارم، هرچند با تحفظ. بازار ایده‌ها ناقص کار می‌کند، ولی سانسور تمایل دارد نتیجه معکوس بدهد."),
            d("A", "How so?", "چطور؟"),
            d("B", "By driving ideas underground. By creating martyrs. By lending legitimacy to the very views one seeks to suppress.", "با راندن ایده‌ها به زیرزمین. با ساختن شهدا. با اعطای مشروعیت به همان دیدگاه‌هایی که کسی می‌خواهد سرکوب کند."),
            d("A", "But doesn't allowing hate speech cause real harm?", "ولی اجازه دادن به گفتار نفرت‌آمیز آسیب واقعی وارد نمی‌کند؟"),
            d("B", "It can. And that's the tragedy of the situation — either choice has costs. Restricting it infringes liberty; permitting it inflicts harm.", "می‌تواند. و این تراژدی وضعیت است — هر انتخاب هزینه دارد. محدود کردنش آزادی را نقض می‌کند؛ اجازه دادنش آسیب وارد می‌کند."),
            d("A", "So what tips the balance for you?", "پس چه چیزی تعادل را برایت متمایل می‌کند؟"),
            d("B", "The chilling effect. Once we start restricting speech, the boundaries tend to expand. What's offensive today may be criminalized tomorrow.", "اثر بازدارنده. وقتی شروع به محدود کردن گفتار می‌کنیم، مرزها تمایل به گسترش دارند. آنچه امروز توهین‌آمیز است، فردا ممکن است جرم شود."),
            d("A", "But the same could be said of harm.", "ولی همین را می‌توان درباره آسیب گفت."),
            d("B", "True. There's no clean resolution. We're left with a tragic choice — and the responsibility of choosing wisely.", "درسته. راه‌حل تمیزی نیست. با یک انتخاب تراژیک رها می‌شویم — و مسئولیت انتخاب عاقلانه."),
            d("A", "Do you think societies are becoming more or less tolerant?", "فکر می‌کنی جوامع در حال تحمل‌پذیرتر شدن هستند یا کمتر؟"),
            d("B", "In some ways more — diverse voices have platforms they never had before. In others, less — polarization has made people less willing to hear opposing views.", "از بعضی جهات بیشتر — صداهای متنوع پلتفرم‌هایی دارند که هرگز نداشتند. از جهات دیگر کمتر — قطب‌بندی باعث شده مردم کمتر مایل به شنیدن دیدگاه‌های مخالف باشند."),
            d("A", "That's concerning.", "نگران‌کننده‌ست."),
            d("B", "It is. The health of a democracy depends on its capacity to tolerate discomfort.", "هست. سلامت دموکراسی به ظرفیتش برای تحمل ناراحتی بستگی دارد."),
            d("A", "Beautifully put.", "زیبا بیان شد.")
        ),
        listOf(
            q("What principle does B lean toward?", listOf("absolutism", "harm principle", "total censorship"), 1),
            q("What's the 'chilling effect'?", listOf("cold weather", "restriction expands", "silence"), 1),
            q("___ it's true that harm occurs, we must also weigh liberty.", listOf("While", "Because", "Since"), 0),
            q("On the harm principle, speech ___ restricted only when it directly harms.", listOf("should be", "should", "is"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Marketplace of ideas", "بازار ایده‌ها", "The marketplace of ideas.", "بازار ایده‌ها."),
            IdiomExpression("Backfire", "نتیجه معکوس دادن", "Censorship tends to backfire.", "سانسور تمایل به نتیجه معکوس دارد."),
            IdiomExpression("Tips the balance", "تعادل را متمایل می‌کند", "What tips the balance?", "چه چیزی تعادل را متمایل می‌کند؟")
        ),
        pron = listOf(PronunciationTip("Ethical debate", "Balanced tone. Emphasise contrasting terms: LIBerty versus HARM.")),
        cult = listOf(CulturalNote("Free speech", "The US First Amendment is unusually protective. Germany, France, and many other democracies restrict hate speech more actively.")),
        mis = listOf(
            CommonMistake("Speech should be restricted only when it directly harms, isn't it?", "Speech should be restricted only when it directly harms.", "Avoid tag in formal argument."),
            CommonMistake("The health of a democracy depend on tolerance.", "The health of a democracy depends on tolerance.", "Singular subject.")
        )
    )

    // ═══════════ FILE 10 — The future of humanity ═══════════

    private fun f10A() = base(38, "10A The future of humanity", "۱۰A آینده بشریت",
        listOf("Use speculative language", "Discuss long-term futures", "Express epistemic caution"),
        listOf(
            v("existential", "وجودی", "Existential risk.", "خطر وجودی.", "adjective"),
            v("trajectory", "مسیر", "Civilizational trajectory.", "مسیر تمدنی."),
            v("existential risk", "خطر وجودی", "Existential risk of AI.", "خطر وجودی هوش مصنوعی."),
            v("extinction", "انقراض", "Human extinction.", "انقراض بشر."),
            v("flourishing", "شکوفایی", "Human flourishing.", "شکوفایی بشر."),
            v("post-scarcity", "پس از کمبود", "A post-scarcity economy.", "اقتصاد پس از کمبود.", "adjective"),
            v("singularity", "تکینگی", "The technological singularity.", "تکینگی فناوری."),
            v("irreversible", "برگشت‌ناپذیر", "Irreversible change.", "تغییر برگشت‌ناپذیر.", "adjective"),
            v("indefinite", "نامحدود", "Indefinite lifespans.", "طول عمر نامحدود.", "adjective"),
            v("flourish", "شکوفا شدن", "Humanity could flourish.", "بشریت می‌تواند شکوفا شود.", "verb")
        ),
        listOf(
            GrammarSection("Speculative structures", "It's conceivable that... One scenario is that... It's not beyond the realm of possibility that..."),
            GrammarSection("Hedged prediction", "The trajectory suggests... but we cannot be certain that..."),
            GrammarSection("Existential stakes", "Should we fail, the consequences would be... Were we to succeed, ...")
        ),
        listOf(
            d("A", "Do you think humanity has a long-term future?", "فکر می‌کنی بشریت آینده بلندمدتی دارد؟"),
            d("B", "That depends entirely on choices we make in the next century. It's the most consequential question we face, and yet we devote remarkably little attention to it.", "کاملاً بستگی به انتخاب‌هایی دارد که در قرن بعد می‌کنیم. مهم‌ترین سؤالی‌ست که با آن مواجهیم، و با این حال توجه قابل توجه کمی به آن اختصاص می‌دهیم."),
            d("A", "Why so little attention?", "چرا اینقدر کم توجه؟"),
            d("B", "Because our psychology is calibrated for immediate threats, not abstract, distant ones. The brain evolved for survival on the savannah, not for contemplating civilizational collapse.", "چون روانشناسی ما برای تهدیدهای فوری کالیبره شده، نه تهدیدهای انتزاعی و دوردست. مغز برای بقا در ساوانا تکامل یافته، نه برای تعمق در فروپاشی تمدن."),
            d("A", "What are the greatest risks?", "بزرگ‌ترین خطرات چیست؟"),
            d("B", "Unaligned AI, engineered pandemics, nuclear war — those are the most-cited. Each could end human civilization, or worse.", "هوش مصنوعی ناهم‌راستا، پاندمی‌های مهندسی‌شده، جنگ هسته‌ای — این‌ها بیشترین اشاره را دارند. هرکدام می‌تواند تمدن بشری را پایان دهد، یا بدتر."),
            d("A", "'Or worse'?", "'یا بدتر'؟"),
            d("B", "Some philosophers argue there are fates worse than extinction — permanent dystopia, for instance. Locked into a state of suffering from which escape is impossible.", "بعضی فیلسوفان استدلال می‌کنند سرنوشت‌هایی بدتر از انقراض وجود دارد — مثلاً دیستوپی پایدار. قفل شدن در حالتی از رنج که فرار از آن غیرممکن است."),
            d("A", "That's a chilling thought.", "فکر تکان‌دهنده‌ای‌ست."),
            d("B", "It is. Which is precisely why these questions deserve more attention, not less.", "هست. برای همین دقیقاً این سؤالات توجه بیشتری می‌طلبند، نه کمتر."),
            d("A", "Do you think we'll rise to the challenge?", "فکر می‌کنی به چالش پاسخ می‌دهیم؟"),
            d("B", "I'm uncertain. Our record is mixed. We've avoided nuclear war for eighty years, but often through luck as much as wisdom.", "نامطمئنم. سابقه‌مان ترکیبی‌ست. هشتاد سال از جنگ هسته‌ای اجتناب کرده‌ایم، ولی اغلب به همان اندازه که از خرد، از شانس."),
            d("A", "What would increase our chances?", "چه چیزی شانس‌هایمان را افزایش می‌دهد؟"),
            d("B", "Better institutions for global coordination. Improved forecasting. A deeper appreciation of the stakes.", "نهادهای بهتر برای هماهنگی جهانی. پیش‌بینی بهتر. درک عمیق‌تر از آنچه در خطر است."),
            d("A", "What role does technology play?", "فناوری چه نقشی دارد؟"),
            d("B", "Ambivalent. It's both the source of the risks and the potential solution. AI could help us solve alignment, or it could be the very thing that destroys us.", "دووجهی. هم منبع خطرات است و هم راه‌حل بالقوه. هوش مصنوعی می‌تواند به ما کمک کند هم‌راستایی را حل کنیم، یا می‌تواند همان چیزی باشد که ما را نابود می‌کند."),
            d("A", "That's not comforting.", "تسلی‌بخش نیست."),
            d("B", "Comfort isn't the point. Clarity is. And the clarity is: we're in a perilous moment, and our actions now matter enormously.", "تسلی نکته نیست. وضوح است. و وضوح این است: در لحظه‌ای خطرناک هستیم، و اقداماتمان الان بسیار مهم است."),
            d("A", "What would you say to someone who finds this all too much?", "به کسی که این همه را بیش از حد می‌یابد چه می‌گویی؟"),
            d("B", "I'd say: choose your sphere. You needn't carry the whole weight of civilization. But each of us can contribute something — through work, through advocacy, through how we raise our children.", "می‌گویم: حوزه‌ات را انتخاب کن. لازم نیست کل وزن تمدن را حمل کنی. ولی هر یک از ما می‌تواند چیزی کمک کند — از طریق کار، از طریق حمایت‌گری، از طریق نحوه تربیت فرزندانمان."),
            d("A", "Do you think it will be enough?", "فکر می‌کنی کافی خواهد بود؟"),
            d("B", "Enough is not given in advance. We make it so, or we don't. That's what it means to be a moral agent at a hinge of history.", "کافی از پیش داده نشده. ما آن را می‌سازیم، یا نمی‌سازیم. این معنای عامل اخلاقی بودن در لولای تاریخ است.")
        ),
        listOf(
            q("What's the greatest risk according to B?", listOf("climate", "unaligned AI", "poverty"), 1),
            q("What's worse than extinction for some philosophers?", listOf("nothing", "permanent dystopia", "anarchy"), 1),
            q("It's conceivable ___ humanity has a long future.", listOf("that", "which", "what"), 0),
            q("___ we fail, the consequences would be catastrophic.", listOf("Should", "Would", "Could"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Hinge of history", "لولای تاریخ", "At a hinge of history.", "در لولای تاریخ."),
            IdiomExpression("Rise to the challenge", "به چالش پاسخ دادن", "Will we rise to the challenge?", "به چالش پاسخ می‌دهیم؟"),
            IdiomExpression("Perilous moment", "لحظه خطرناک", "A perilous moment.", "لحظه‌ای خطرناک.")
        ),
        pron = listOf(PronunciationTip("Existential discourse", "Slow, weighty delivery. Emphasise stakes: CIVilizational collapse. IRREversible change.")),
        cult = listOf(CulturalNote("Existential risk", "The field was pioneered by Nick Bostrom and the Future of Humanity Institute. It examines risks that could permanently derail humanity's potential.")),
        mis = listOf(
            CommonMistake("Should we fail, the consequences would be catastrophic, would they?", "Should we fail, the consequences would be catastrophic.", "Avoid tag in serious discussion."),
            CommonMistake("It's conceivable that humanity have a long future.", "It's conceivable that humanity has a long future.", "Singular subject.")
        )
    )

    private fun f10B() = base(39, "10B Transhumanism", "۱۰B فراانسان‌گرایی",
        listOf("Debate technological enhancement", "Discuss human nature", "Express philosophical reservations"),
        listOf(
            v("enhancement", "بهبود", "Human enhancement.", "بهبود انسانی."),
            v("augmentation", "افزایش", "Cognitive augmentation.", "افزایش شناختی."),
            v("enhance", "بهبود دادن", "Enhance human capacities.", "ظرفیت‌های انسانی را بهبود بده.", "verb"),
            v("cybernetic", "سایبرنتیک", "Cybernetic implants.", "ایمپلنت‌های سایبرنتیک.", "adjective"),
            v("posthuman", "پساانسان", "A posthuman future.", "آینده پساانسان.", "adjective"),
            v("longevity", "طول عمر", "Extreme longevity.", "طول عمر شدید."),
            v("mortality", "مرگ‌ومیر", "Overcoming mortality.", "غلبه بر مرگ‌ومیر."),
            v("consciousness", "آگاهی", "Uploaded consciousness.", "آگاهی بارگذاری‌شده."),
            v("biological", "زیستی", "Biological limits.", "محدودیت‌های زیستی.", "adjective"),
            v("dignity", "کرامت", "Human dignity.", "کرامت انسانی."),
            v("hubris", "تکبر", "Technological hubris.", "تکبر فناورانه.")
        ),
        listOf(
            GrammarSection("Concessive argument", "Granted that enhancement offers benefits, we must still ask..."),
            GrammarSection("Philosophical reservations", "One might object that... It could be countered, however, that..."),
            GrammarSection("Distinguishing concepts", "There is an important distinction between therapy and enhancement.")
        ),
        listOf(
            d("A", "What do you make of transhumanism?", "نظرت درباره فراانسان‌گرایی چیه؟"),
            d("B", "It's a fascinating movement, but one I approach with considerable caution. The aims are admirable; the risks are profound.", "جنبش جذابی‌ست، ولی با احتیاط قابل توجه به آن نزدیک می‌شوم. اهداف قابل تحسین‌اند؛ خطرات عمیق."),
            d("A", "What are the aims?", "اهداف چیست؟"),
            d("B", "To transcend biological limits — to enhance cognition, extend lifespan indefinitely, perhaps upload consciousness. In short, to become something more than human.", "فراتر رفتن از محدودیت‌های زیستی — افزایش شناخت، گسترش طول عمر به طور نامحدود، شاید بارگذاری آگاهی. به طور خلاصه، چیزی بیش از انسان شدن."),
            d("A", "Sounds ambitious.", "جاه‌طلبانه به نظر می‌رسد."),
            d("B", "It is. And there's a certain nobility to the ambition — a refusal to accept suffering and death as inevitable.", "هست. و نجابت خاصی در جاه‌طلبی هست — سر باز زدن از پذیرش رنج و مرگ به عنوان ناگزیر."),
            d("A", "So why the caution?", "پس چرا احتیاط؟"),
            d("B", "Because we're playing with forces we don't fully understand. And because the consequences would be irreversible.", "چون با نیروهایی بازی می‌کنیم که کاملاً نمی‌فهمیم. و چون پیامدها برگشت‌ناپذیر خواهند بود."),
            d("A", "Such as?", "مثل چه؟"),
            d("B", "Genetic enhancement, for instance. If we allow parents to enhance their children's intelligence, we create a class of enhanced individuals. How long before we have two species?", "مثلاً ارتقاء ژنتیکی. اگر به والدین اجازه دهیم هوش فرزندانشان را ارتقا دهند، طبقه‌ای از افراد ارتقاءیافته ایجاد می‌کنیم. چقدر طول می‌کشد تا دو گونه داشته باشیم؟"),
            d("A", "That's a striking point.", "نکته قابل توجهی‌ست."),
            d("B", "And it raises the question of justice. If enhancement is available only to the wealthy, inequality becomes biological, not merely economic.", "و سؤال عدالت را مطرح می‌کند. اگر ارتقاء فقط برای ثروتمندان در دسترس باشد، نابرابری زیستی می‌شود، نه صرفاً اقتصادی."),
            d("A", "What about the therapeutic distinction?", "تمایز درمانی چطور؟"),
            d("B", "Crucial, though blurry at the edges. Curing disease is one thing; enhancing beyond normal human function is another.", "حیاتی، هرچند در لبه‌ها محو است. درمان بیماری یک چیز است؛ ارتقاء فراتر از عملکرد طبیعی انسانی چیز دیگری‌ست."),
            d("A", "But where does normal end?", "ولی طبیعی کجا تمام می‌شود؟"),
            d("B", "That's precisely the difficulty. Is a cochlear implant for a deaf child therapy or enhancement? The boundary is contested.", "دقیقاً همین دشواری‌ست. آیا کاشت حلزون برای کودک ناشنوا درمان است یا ارتقاء؟ مرز مورد مناقشه است."),
            d("A", "Do you think we'll ever accept these technologies?", "فکر می‌کنی هرگز این فناوری‌ها را می‌پذیریم؟"),
            d("B", "Some, certainly. The question is which, and on what terms. Regulation will be crucial, but international coordination is difficult.", "بعضی را قطعاً. سؤال این است کدام، و با چه شرایطی. مقررات حیاتی خواهد بود، ولی هماهنگی بین‌المللی سخت است."),
            d("A", "What would you personally choose?", "شخصاً چه را انتخاب می‌کردی؟"),
            d("B", "I'd be cautious. Some enhancements — cognitive ones, say — I'd likely decline. The value of being ordinary, of shared human experience, matters to me.", "محتاط می‌بودم. بعضی ارتقاءها — مثلاً شناختی — احتمالاً رد می‌کردم. ارزش معمولی بودن، تجربه انسانی مشترک، برایم مهم است."),
            d("A", "Does that mean you oppose transhumanism?", "آیا یعنی مخالف فراانسان‌گرایی هستی؟"),
            d("B", "Not oppose — hesitate before. There's a difference between rejection and caution.", "مخالف نه — قبلش تأمل. تفاوتی هست بین رد کردن و احتیاط."),
            d("A", "That's a nuanced position.", "موضع ظریفی‌ست.")
        ),
        listOf(
            q("What's the transhumanist aim?", listOf("equality", "transcend limits", "safety"), 1),
            q("What's B's concern?", listOf("cost", "two species", "slow progress"), 1),
            q("Granted that enhancement offers benefits, we must still ask about risks.", listOf("Granted", "Because", "Since"), 0),
            q("There is an important distinction ___ therapy and enhancement.", listOf("between", "among", "of"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Playing with forces", "بازی با نیروها", "Playing with forces we don't understand.", "بازی با نیروهایی که نمی‌فهمیم."),
            IdiomExpression("Blurry at the edges", "در لبه‌ها محو", "Blurry at the edges.", "در لبه‌ها محو."),
            IdiomExpression("Hesitate before", "قبلش تأمل کردن", "I hesitate before endorsing.", "قبل از تأیید تأمل می‌کنم.")
        ),
        pron = listOf(PronunciationTip("Bioethical discourse", "Precise articulation. Emphasise key distinctions: THERapy versus enHANCEment.")),
        cult = listOf(CulturalNote("Transhumanism", "Advocates include Ray Kurzweil and Nick Bostrom. Critics include Francis Fukuyama, who called it 'the world's most dangerous idea'.")),
        mis = listOf(
            CommonMistake("There is an important distinction between therapy and enhancement, isn't there?", "There is an important distinction between therapy and enhancement.", "Avoid tag."),
            CommonMistake("I'd hesitate before to endorse.", "I'd hesitate before endorsing.", "Before + gerund.")
        )
    )

    private fun f10C() = base(40, "10C Conclusion and reflection", "۱۰C نتیجه‌گیری و بازنگری",
        listOf("Synthesize C1-level skills", "Reflect on the journey", "Prepare for continued mastery"),
        listOf(
            v("synthesis", "ترکیب", "A synthesis of ideas.", "ترکیبی از ایده‌ها."),
            v("reflection", "بازنگری", "Deep reflection.", "بازنگری عمیق."),
            v("mastery", "تسلط", "Toward mastery.", "به سمت تسلط."),
            v("nuance", "ظرافت", "Express nuance.", "ظرافت را بیان کن."),
            v("precision", "دقت", "Verbal precision.", "دقت کلامی."),
            v("eloquence", "فصاحت", "Natural eloquence.", "فصاحت طبیعی."),
            v("register", "لحن", "Register awareness.", "آگاهی از لحن."),
            v("fluency", "روانی", "Sophisticated fluency.", "روانی پیچیده."),
            v("journey", "سفر", "A profound journey.", "سفر عمیق."),
            v("milestone", "نقطه عطف", "A milestone achievement.", "دستاورد نقطه عطف."),
            v("humility", "فروتنی", "Intellectual humility.", "فروتنی فکری."),
            v("lifelong", "مادام‌العمر", "Lifelong learning.", "یادگیری مادام‌العمر.", "adjective")
        ),
        listOf(
            GrammarSection("Synthesis and reflection", "Looking back, it becomes clear that... What began as... has become..."),
            GrammarSection("Future-oriented commitment", "The journey continues. What lies ahead is..."),
            GrammarSection("Philosophical closure", "If there's one thing I've learned, it's that...")
        ),
        listOf(
            d("A", "We've reached the end of Level 5. How does it feel?", "به پایان سطح ۵ رسیده‌ایم. چه حسی داره؟"),
            d("B", "Remarkable. Looking back, I barely recognize the person who began this journey. The transformation has been profound.", "قابل توجه. به عقب نگاه می‌کنم، به سختی شخصی که این سفر را آغاز کرد می‌شناسم. تحول عمیق بوده."),
            d("A", "What's changed most?", "بیشتر چه چیزی تغییر کرده؟"),
            d("B", "The ability to think in English, rather than translating. And the capacity to express complex ideas with nuance and precision.", "توانایی فکر کردن به انگلیسی، به جای ترجمه. و ظرفیت بیان ایده‌های پیچیده با ظرافت و دقت."),
            d("A", "Give me an example.", "مثالی بزن."),
            d("B", "A year ago, I could say something was good or bad. Now I can articulate why, qualify my judgments, acknowledge counterarguments, and express reservations — all in real time.", "یک سال پیش، می‌توانستم بگویم چیزی خوب یا بد است. الان می‌توانم توضیح دهم چرا، قضاوت‌هایم را مشروط کنم، استدلال‌های متقابل را بپذیرم، و تحفظ بیان کنم — همه در زمان واقعی."),
            d("A", "That's a substantial development.", "تحول قابل توجهی‌ست."),
            d("B", "It is. But what strikes me most is the humility it's instilled. The more I learn, the more I realize how much I don't know.", "هست. ولی چیزی که بیشتر متوجهام می‌کند فروتنی‌ای‌ست که القا کرده. هرچی بیشتر یاد می‌گیرم، بیشتر می‌فهمم چقدر نمی‌دانم."),
            d("A", "That's the mark of true mastery, isn't it?", "این نشانه تسلط واقعی است، نه؟"),
            d("B", "I believe so. Expertise without humility becomes arrogance. And arrogance is the enemy of growth.", "باور دارم. تخصص بدون فروتنی به تکبر تبدیل می‌شود. و تکبر دشمن رشد است."),
            d("A", "What will you do next?", "بعدش چیکار می‌کنی؟"),
            d("B", "Continue. Read widely. Write. Speak with people who challenge me. The journey of mastery is lifelong.", "ادامه می‌دهم. گسترده می‌خوانم. می‌نویسم. با افرادی که به چالش می‌کشندم صحبت می‌کنم. سفر تسلط مادام‌العمر است."),
            d("A", "Any advice for others on this path?", "توصیه‌ای برای دیگران در این مسیر؟"),
            d("B", "Be patient with yourself. Be curious rather than anxious. And remember that every mistake is a step forward, not a setback.", "با خودت صبور باش. کنجکاو باش نه مضطرب. و به یاد داشته باش هر اشتباه یک قدم به جلو است، نه یک عقب‌نشینی."),
            d("A", "What would you say to someone just starting?", "به کسی که تازه شروع کرده چه می‌گویی؟"),
            d("B", "That they're embarking on one of the most rewarding journeys available to a human being. It will change how they think, how they see the world.", "که در حال آغاز یکی از پرارزش‌ترین سفرهای در دسترس یک انسان است. نحوه فکر کردنشان، نحوه دیدن جهانشان را تغییر خواهد داد."),
            d("A", "Do you feel you've achieved C1?", "حس می‌کنی به C1 رسیده‌ای؟"),
            d("B", "In many respects, yes. But C1 isn't a destination — it's a plateau, from which further peaks become visible.", "از بسیاری جهات، بله. ولی C1 مقصد نیست — فلاتی‌ست، که از آن قله‌های بیشتر قابل مشاهده می‌شوند."),
            d("A", "Beautifully put.", "زیبا بیان شد."),
            d("B", "Thank you. And thank you for guiding me through this. A good teacher is a rare gift.", "ممنون. و ممنون که مرا در این مسیر هدایت کردی. معلم خوب هدیه کمیابی‌ست."),
            d("A", "The pleasure has been mine. And now — the journey continues.", "لذت از آن من بوده. و الان — سفر ادامه دارد."),
            d("B", "Indeed. Onward.", "همینطور. به جلو."),
            d("A", "Onward.", "به جلو.")
        ),
        listOf(
            q("What changed most for B?", listOf("vocabulary", "thinking in English", "pronunciation"), 1),
            q("What's the mark of true mastery?", listOf("confidence", "humility", "speed"), 1),
            q("Looking back, it ___ clear how much I've grown.", listOf("becomes", "become", "becoming"), 0),
            q("___ there's one thing I've learned, it's the value of persistence.", listOf("If", "Unless", "Though"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Onward", "به جلو", "Onward.", "به جلو."),
            IdiomExpression("The pleasure has been mine", "لذت از آن من بوده", "The pleasure has been mine.", "لذت از آن من بوده."),
            IdiomExpression("Rare gift", "هدیه کمیاب", "A good teacher is a rare gift.", "معلم خوب هدیه کمیابی‌ست.")
        ),
        pron = listOf(PronunciationTip("Reflective register", "Warm, measured tone. Allow pauses for reflection. Let the sense of closure settle.")),
        cult = listOf(CulturalNote("Language learning", "Reaching C1 typically requires 800-1200 hours of study beyond B2. The journey from C1 to C2 is one of refinement and stylistic mastery.")),
        mis = listOf(
            CommonMistake("If there's one thing I've learned, it's the value of persistence, isn't it?", "If there's one thing I've learned, it's the value of persistence.", "Avoid tag in reflective register."),
            CommonMistake("A good teacher is a rare gift, no?", "A good teacher is a rare gift.", "Avoid 'no?' as tag in formal contexts.")
        )
    )
}