package com.zabanyar.ai.data

object TopNotchRepository {

    fun getContent(bookId: String, chapter: Int): LessonContent {
        return when (bookId) {
            "top_notch_1" -> getTopNotch1(chapter)
            "top_notch_2" -> getTopNotch2(chapter)
            "top_notch_3" -> getTopNotch3(chapter)
            else -> getDefaultContent(bookId, chapter)
        }
    }

    // ==================== Top Notch 1 ====================
    private fun getTopNotch1(chapter: Int): LessonContent {
        return when (chapter) {
            1 -> LessonContent("top_notch_1", 1, "Names and Occupations", "نام‌ها و شغل‌ها",
                objectives = listOf(
                    "یادگیری ۱۵ شغل رایج به انگلیسی",
                    "معرفی خود با استفاده از a/an + شغل",
                    "پرسیدن درباره شغل دیگران با do/does",
                    "استفاده از ساختارهای جایگزین (work as, work for)",
                    "تفاوت job و work و career",
                    "بیان مکالمه‌های روزمره در محیط کار"
                ),
                vocabulary = listOf(
                    VocabWord("Teacher", "معلم", "ˈtiːtʃər", "n",
                        "She teaches English at a public high school.",
                        "او دبیرستان دولتی انگلیسی درس می‌دهد.",
                        "work as a teacher / a strict teacher / a math teacher",
                        "instructor, educator, tutor", "student",
                        "teach (v) / teaching (n) / taught (past)", "neutral",
                        "⚠️ teacher برای همه سطوح استفاده می‌شود، اما professor مخصوص دانشگاه است."),
                    VocabWord("Engineer", "مهندس", "ˌendʒɪˈnɪr", "n",
                        "He is a software engineer at a major tech company.",
                        "او مهندس نرم‌افزار در یک شرکت فناوری بزرگ است.",
                        "a software engineer / a civil engineer / a chief engineer",
                        "developer, technician", "designer",
                        "engine (n) / engineering (n) / engineered (adj)", "neutral",
                        "💡 engineer فقط برای شغل مهندسی، نه هر تعمیرکار (technician)."),
                    VocabWord("Accountant", "حسابدار", "əˈkaʊntənt", "n",
                        "The accountant is reviewing the company's annual report.",
                        "حسابدار در حال بررسی گزارش سالانه شرکت است.",
                        "a certified accountant / a tax accountant",
                        "bookkeeper, auditor", "",
                        "account (n) / accounting (n) / accountable (adj)", "formal",
                        "💡 در آمریکا CPA معادل حسابدار رسمی است."),
                    VocabWord("Lawyer", "وکیل", "ˈlɔːjər", "n",
                        "My sister is a lawyer specializing in corporate law.",
                        "خواهرم وکیلی است که در حوزه حقوق شرکتی تخصص دارد.",
                        "a defense lawyer / a corporate lawyer / hire a lawyer",
                        "attorney, counsel", "",
                        "law (n) / lawful (adj) / lawsuit (n)", "formal",
                        "💡 در آمریکا attorney رایج‌تره، در بریتانیا solicitor و barrister."),
                    VocabWord("Photographer", "عکاس", "fəˈtɑːɡrəfər", "n",
                        "The photographer captured the wedding beautifully.",
                        "عکاس مراسم عروسی را زیبا ثبت کرد.",
                        "a professional photographer / a wildlife photographer",
                        "shutterbug (غیررسمی)", "",
                        "photograph (n/v) / photography (n)", "neutral",
                        "💡 wedding photographer و portrait photographer تخصص‌های رایج هستن."),
                    VocabWord("Nurse", "پرستار", "nɜːrs", "n",
                        "The nurse checked his blood pressure every hour.",
                        "پرستار هر ساعت فشار خون او را چک می‌کرد.",
                        "a registered nurse / a head nurse",
                        "caregiver, medic", "doctor",
                        "nurse (v) / nursing (n)", "neutral",
                        "💡 registered nurse (RN) پرستار دارای مجوز رسمی است."),
                    VocabWord("Architect", "معمار", "ˈɑːrkɪtekt", "n",
                        "The architect designed a stunning modern museum.",
                        "معمار یک موزه مدرن خیره‌کننده طراحی کرد.",
                        "a chief architect / a landscape architect",
                        "designer, planner", "",
                        "architecture (n) / architectural (adj)", "formal",
                        "💡 در IT هم software architect داریم."),
                    VocabWord("Chef", "سرآشپز", "ʃef", "n",
                        "The chef prepared an exquisite five-course meal.",
                        "سرآشپز یک وعده غذایی پنج‌مرحله‌ای عالی آماده کرد.",
                        "a head chef / a pastry chef / a celebrity chef",
                        "cook (غیرتخصصی)", "",
                        "chef (n) / chef's kiss (اصطلاح)", "neutral",
                        "💡 cook عمومی‌تره، chef آموزش‌دیده و رئیس آشپزخانه‌ست."),
                    VocabWord("Entrepreneur", "کارآفرین", "ˌɑːntrəprəˈnɜːr", "n",
                        "The young entrepreneur launched three startups by age 25.",
                        "کارآفرین جوان تا ۲۵ سالگی سه استارتاپ راه‌اندازی کرد.",
                        "a serial entrepreneur / a tech entrepreneur",
                        "businessman, founder", "employee",
                        "entrepreneurship (n) / entrepreneurial (adj)", "formal",
                        "💡 از فرانسه اومده و تلفظش /ˌɑːntrəprəˈnɜːr/ هست."),
                    VocabWord("Dentist", "دندان‌پزشک", "ˈdentɪst", "n",
                        "I have an appointment with the dentist tomorrow morning.",
                        "فردا صبح با دندان‌پزشک قرار دارم.",
                        "go to the dentist / a family dentist",
                        "orthodontist (متخصص ارتودنسی)", "",
                        "dental (adj) / dentistry (n)", "neutral",
                        "💡 dentist عمومی، orthodontist فقط برای braces."),
                    VocabWord("Journalist", "روزنامه‌نگار", "ˈdʒɜːrnəlɪst", "n",
                        "The journalist interviewed the prime minister.",
                        "روزنامه‌نگار با نخست‌وزیر مصاحبه کرد.",
                        "an investigative journalist / a freelance journalist",
                        "reporter, correspondent", "",
                        "journal (n) / journalism (n)", "neutral",
                        "💡 reporter خبر می‌ده، journalist تحلیل هم می‌نویسه."),
                    VocabWord("Translator", "مترجم (نوشتاری)", "trænzˈleɪtər", "n",
                        "The translator worked on a 500-page novel.",
                        "مترجم روی یک رمان ۵۰۰ صفحه‌ای کار کرد.",
                        "a freelance translator / a literary translator",
                        "interpreter (مترجم شفاهی)", "",
                        "translate (v) / translation (n)", "neutral",
                        "⚠️ translator = نوشتاری، interpreter = شفاهی."),
                    VocabWord("Pharmacist", "داروساز", "ˈfɑːrməsɪst", "n",
                        "The pharmacist explained how to take the medicine.",
                        "داروساز توضیح داد که چگونه دارو را مصرف کند.",
                        "a licensed pharmacist / a hospital pharmacist",
                        "chemist (BrE)", "",
                        "pharmacy (n) / pharmaceutical (adj)", "formal",
                        "💡 در بریتانیا chemist هم می‌گن."),
                    VocabWord("Receptionist", "منشی / پذیرش", "rɪˈsepʃənɪst", "n",
                        "The receptionist greeted us with a warm smile.",
                        "منشی با لبخند گرمی از ما استقبال کرد.",
                        "a hotel receptionist / a front-desk receptionist",
                        "front-desk clerk", "",
                        "reception (n) / receive (v)", "neutral",
                        "💡 در هتل، مطب و شرکت استفاده می‌شه."),
                    VocabWord("Electrician", "برق‌کار", "ɪˌlekˈtrɪʃən", "n",
                        "We called an electrician to fix the wiring.",
                        "ما یک برق‌کار برای تعمیر سیم‌کشی صدا زدیم.",
                        "a licensed electrician", "technician", "",
                        "electric (adj) / electricity (n)", "neutral",
                        "💡 electrician برای برق ساختمان، engineer برای طراحی سیستم."),
                    VocabWord("Plumber", "لوله‌کش", "ˈplʌmər", "n",
                        "The plumber fixed the leaky pipe in the kitchen.",
                        "لوله‌کش لوله نشتی آشپزخانه را تعمیر کرد.",
                        "call a plumber / a master plumber",
                        "pipefitter", "",
                        "plumb (v) / plumbing (n)", "neutral",
                        "💡 تلفظ: /ˈplʌmər/ (b سایلنته).")
                ),
                idioms = listOf(
                    IdiomExpression("What do you do for a living?", "شغلت چیه؟",
                        "So, what do you do for a living? — I'm a graphic designer.",
                        "خب، شغلت چیه؟ — من طراح گرافیکم.", "neutral"),
                    IdiomExpression("Work as + شغل", "به عنوان ... کار کردن",
                        "I work as a freelance translator.", "من به عنوان مترجم آزاد کار می‌کنم.", "neutral"),
                    IdiomExpression("Work for + شرکت", "برای ... کار کردن",
                        "She works for a multinational corporation.", "او برای یک شرکت چندملیتی کار می‌کند.", "neutral"),
                    IdiomExpression("Make a living (as)", "(به عنوان ...) امرار معاش کردن",
                        "He makes a living as a street musician.", "او به عنوان نوازنده خیابانی امرار معاش می‌کند.", "neutral"),
                    IdiomExpression("Land a job", "شغلی پیدا کردن",
                        "She finally landed a job at a top law firm.", "او بالاخره در یک شرکت حقوقی برتر استخدام شد.", "informal"),
                    IdiomExpression("Climb the corporate ladder", "در سلسله‌مراتب سازمانی بالا رفتن",
                        "He's been climbing the corporate ladder for ten years.", "ده سال است که در سلسله‌مراتب سازمانی بالا می‌رود.", "informal"),
                    IdiomExpression("Burn the candle at both ends", "خود را خیلی خسته کردن",
                        "Working two jobs, she's burning the candle at both ends.", "با دو شغل، دارد خودش را خیلی خسته می‌کند.", "informal"),
                    IdiomExpression("Get paid peanuts", "حقوق ناچیز گرفتن",
                        "I love my job, but I get paid peanuts.", "شغلم رو دوست دارم، ولی حقوق ناچیزی می‌گیرم.", "informal"),
                    IdiomExpression("A dead-end job", "شغلی بدون آینده",
                        "He's stuck in a dead-end job.", "او در یک شغل بی‌آینده گیر افتاده.", "informal"),
                    IdiomExpression("Jack of all trades", "همه‌فن‌حریف",
                        "My dad is a jack of all trades — he can fix anything!", "بابام همه‌فن‌حریفه — هر چیزی رو می‌تونه درست کنه!", "idiom")
                ),
                phrasalVerbs = listOf(
                    PhrasalVerb("work out", "حل شدن / ورزش کردن", "حل شدن / ورزش کردن",
                        "Everything will work out in the end.", "در نهایت همه چیز حل می‌شود.", "غیرقابل جدا شدن"),
                    PhrasalVerb("take on", "به عهده گرفتن / استخدام کردن", "به عهده گرفتن",
                        "She took on a new project at work.", "او یک پروژه جدید در محل کار به عهده گرفت.", "جدا شدنی"),
                    PhrasalVerb("take up", "شروع کردن (سرگرمی/کار)", "شروع کردن",
                        "He took up photography last year.", "او سال گذشته عکاسی را شروع کرد.", "جدا شدنی"),
                    PhrasalVerb("fill in for", "جای کسی را پر کردن", "جای کسی رو گرفتن",
                        "Can you fill in for me while I'm on vacation?", "می‌تونی وقتی من در تعطیلاتم جای من رو پر کنی؟", "غیرقابل جدا شدن"),
                    PhrasalVerb("get ahead", "پیشرفت کردن", "پیشرفت کردن",
                        "To get ahead in your career, you need to network.", "برای پیشرفت در حرفه‌ات، باید شبکه‌سازی کنی.", "غیرقابل جدا شدن"),
                    PhrasalVerb("burn out", "فرسوده شدن", "فرسوده شدن",
                        "Many doctors burn out after years of long hours.", "بسیاری از پزشکان بعد از سال‌ها کار طولانی فرسوده می‌شوند.", "غیرقابل جدا شدن"),
                    PhrasalVerb("call in sick", "مرخصی استعلاجی گرفتن", "مرخصی مریضی گرفتن",
                        "I had to call in sick today.", "امروز مجبور شدم مرخصی مریضی بگیرم.", "غیرقابل جدا شدن"),
                    PhrasalVerb("hand in", "تحویل دادن", "تحویل دادن",
                        "She handed in her resignation yesterday.", "او دیروز استعفایش را تحویل داد.", "جدا شدنی")
                ),
                pronunciationTips = listOf(
                    PronunciationTip("استرس کلمه در اسامی شغل‌ها",
                        "🔊 بیشتر اسامی شغل‌های دو سیلابی روی سیلاب اول استرس دارند:\n" +
                        "• TEACH-er /ˈtiː.tʃər/\n• DOC-tor /ˈdɑːk.tər/\n" +
                        "• AC-coun-tant /əˈkaʊn.tənt/\n\n" +
                        "🔸 کلماتی که با -eer/-ier تمام می‌شن، روی سیلاب آخر استرس دارند:\n" +
                        "• engi-NEER /ˌen.dʒɪˈnɪr/"),
                    PronunciationTip("تلفظ a و an در گفتار سریع",
                        "🔊 در گفتار سریع، a و an ضعیف تلفظ می‌شن:\n" +
                        "• a teacher → /ə ˈtiː.tʃər/\n• an engineer → /ən ˌen.dʒɪˈnɪr/\n\n" +
                        "💡 an فقط قبل از صدای vowel، نه حرف vowel:\n" +
                        "• an hour /ən ˈaʊ.ər/\n• a university /ə ˌjuː.nɪˈvɜːr.sə.ti/"),
                    PronunciationTip("تفاوت /ɪ/ و /iː/",
                        "🔊 این دو صدا اشتباه گرفتنشون معنی رو عوض می‌کنه:\n" +
                        "• /ɪ/ کوتاه: sit, ship, live, this\n" +
                        "• /iː/ بلند: seat, sheep, leave, these\n\n" +
                        "💡 تمرین: ship و sheep رو پشت سر هم بگو.")
                ),
                culturalNotes = listOf(
                    CulturalNote("معرفی شغل در آمریکا و بریتانیا",
                        "🌍 در آمریکا جواب کوتاه و مستقیم رایج‌تره:\n• I'm a software engineer. / I work in tech.\n\n" +
                        "🔸 در بریتانیا محافظه‌کارانه‌تر:\n• I work in IT. / I'm in the tech industry."),
                    CulturalNote("کار از خانه (WFH)",
                        "🌍 از زمان پاندمی رایج شد:\n" +
                        "• I work from home / remotely.\n• I'm on a hybrid schedule.\n" +
                        "• RTO = Return To Office (برگشت اجباری به دفتر)"),
                    CulturalNote("عنوان‌های شغلی در مکالمات رسمی",
                        "🌍 در مکالمات رسمی از عنوان کامل استفاده می‌کنن:\n" +
                        "• Dr. Smith (دکتر و PhD)\n• Professor Johnson\n• Mr./Ms./Mrs. + فامیل")
                ),
                grammar = listOf(
                    GrammarSection("📌 a / an + شغل‌ها - پایه",
                        "🔹 فرمول: Subject + be + a/an + شغل\n• I am a teacher. / She is an architect.\n\n" +
                        "🔸 a قبل از حروف بی‌صدا، an قبل از صدادار:\n" +
                        "• a teacher, a doctor\n• an engineer, an actor\n• an hour (استثنا)\n\n" +
                        "⚠️ قبل از شغل جمع از a/an استفاده نمی‌کنیم:\n❌ They are a doctors. → ✅ They are doctors."),
                    GrammarSection("📌 a / an + شغل‌ها - پیشرفته",
                        "🔹 در انگلیسی، a/an فقط برای مفرد نامشخص:\n" +
                        "• I'm a teacher. (یک معلم، نامشخص)\n• The teacher is late. (همون معلم مشخص)\n\n" +
                        "🔸 ساختارهای رسمی:\n" +
                        "• I hold a position as a senior engineer.\n• I serve as the head of the department."),
                    GrammarSection("📌 do / does در سوال",
                        "🔹 فرمول:\n• What do + I/you/we/they + do?\n• What does + he/she/it + do?\n\n" +
                        "🔸 سوال‌های جایگزین:\n• What's your job?\n• What do you do for a living?\n" +
                        "• What line of work are you in? (رسمی)\n• What's your occupation? (فرم‌ها)\n\n" +
                        "⚠️ ❌ What do he do? → ✅ What does he do?"),
                    GrammarSection("📌 پاسخ کوتاه (Short Answers)",
                        "🔹 با فعل be:\n• Are you a teacher? → Yes, I am. / No, I'm not.\n\n" +
                        "🔸 با do/does:\n• Do you work here? → Yes, I do. / No, I don't.\n\n" +
                        "⚠️ ❌ Yes, I'm. → ✅ Yes, I am.\n❌ No, I amn't. → ✅ No, I'm not."),
                    GrammarSection("📌 ساختارهای جایگزین",
                        "🔹 به جای «I am a teacher»:\n" +
                        "1️⃣ work as + شغل: I work as a teacher.\n" +
                        "2️⃣ work for + شرکت: I work for Google.\n" +
                        "3️⃣ work at + مکان: I work at a hospital.\n" +
                        "4️⃣ work in + حوزه: I work in education.\n" +
                        "5️⃣ be in + حوزه: She's in marketing.\n" +
                        "6️⃣ be responsible for: I'm responsible for the team."),
                    GrammarSection("📌 Present Simple برای شغل",
                        "🔹 برای عادت‌های کاری از حال ساده استفاده کن:\n" +
                        "• I teach English. / She manages a team.\n\n" +
                        "🔸 سوم شخص مفرد → فعل + s:\n• teach → teaches / work → works\n\n" +
                        "⚠️ ❌ She work as a nurse. → ✅ She works as a nurse."),
                    GrammarSection("📌 تفاوت job / work / career / profession",
                        "🔹 این چهار کلمه با هم اشتباه می‌شن:\n\n" +
                        "• Job = موقعیت شغلی خاص، قابل شمارش\n• Work = فعالیت کاری، غیرقابل شمارش\n" +
                        "• Career = مسیر شغلی بلندمدت\n• Profession = شغل تخصصی\n\n" +
                        "⚠️ ❌ I have a lot of works. → ✅ I have a lot of work."),
                    GrammarSection("📌 Formal vs Informal",
                        "🔹 در موقعیت‌های رسمی:\n" +
                        "❌ Informal: What do you do? / I'm a teacher.\n" +
                        "✅ Formal: May I ask what your occupation is? / I'm employed as a teacher.\n\n" +
                        "💡 در رزومه و مصاحبه از ساختارهای رسمی استفاده کن.")
                ),
                commonMistakes = listOf(
                    CommonMistake("She's a engineer.", "She's an engineer.", "قبل از حروف صدادار از an."),
                    CommonMistake("What do he do?", "What does he do?", "برای سوم شخص از does."),
                    CommonMistake("They are a doctors.", "They are doctors.", "قبل از اسم جمع a/an نمیاد."),
                    CommonMistake("Yes, I'm.", "Yes, I am.", "در پاسخ کوتاه فعل be خلاصه نمی‌شه."),
                    CommonMistake("No, I amn't.", "No, I'm not.", "amn't وجود نداره."),
                    CommonMistake("She work as a nurse.", "She works as a nurse.", "سوم شخص مفرد فعل +s."),
                    CommonMistake("I have a lot of works.", "I have a lot of work.", "work غیرقابل شمارشه."),
                    CommonMistake("I am work at a hospital.", "I work at a hospital.", "برای شغل فعل ساده work."),
                    CommonMistake("What does they do?", "What do they do?", "they جمع با do."),
                    CommonMistake("I work as a nurse at hospital.", "I work as a nurse at a hospital.", "قبل از اسم مفرد a/an لازمه."),
                    CommonMistake("She's teacher.", "She's a teacher.", "قبل از شغل مفرد a/an."),
                    CommonMistake("He is engineer.", "He is an engineer.", "قبل از شغل مفرد a/an.")
                ),
                conversation = listOf(
                    DialogueLine("Sara", "Hi there! I don't think we've met before. I'm Sara.",
                        "سلام! فکر نمی‌کنم قبلاً دیده باشیم. من سارا هستم."),
                    DialogueLine("Ali", "Nice to meet you, Sara. I'm Ali. I just moved here last week.",
                        "از آشنایی خوشحالم سارا. من علی هستم. هفته پیش اومدم."),
                    DialogueLine("Sara", "Oh, welcome to the neighborhood! How are you finding it so far?",
                        "اوه، به محله خوش اومدی! تا حالا چطور پیداش کردی؟"),
                    DialogueLine("Ali", "It's really nice. The people are friendly and it's quiet at night.",
                        "واقعاً خوبه. مردم خوش‌برخوردن و شب‌ها ساکته."),
                    DialogueLine("Sara", "That's good to hear. So, what do you do for a living?",
                        "خوبه که این رو می‌شنوم. خب، شغلت چیه؟"),
                    DialogueLine("Ali", "I'm a software engineer. I work for a startup downtown.",
                        "من مهندس نرم‌افزارم. برای یک استارتاپ در مرکز شهر کار می‌کنم."),
                    DialogueLine("Sara", "That sounds interesting! What kind of products do you build?",
                        "جالبه به نظر می‌رسه! چه نوع محصولاتی می‌سازید؟"),
                    DialogueLine("Ali", "Mostly mobile apps for language learning. It's a lot of fun.",
                        "بیشتر اپلیکیشن‌های موبایل برای یادگیری زبان. خیلی سرگرم‌کننده‌ست."),
                    DialogueLine("Sara", "Wow, that's cool! My cousin is actually looking for an app like that.",
                        "واو، باحاله! پسرخالم دقیقاً دنبال یه اپ مثل این می‌گرده."),
                    DialogueLine("Ali", "Really? I can send you the link if you want.",
                        "واقعاً؟ اگه بخوای می‌تونم لینکش رو بفرستم."),
                    DialogueLine("Sara", "That would be great, thanks! And what about your wife? Does she work too?",
                        "عالی می‌شه، ممنون! زنت چطور؟ اون هم کار می‌کنه؟"),
                    DialogueLine("Ali", "Yes, she's a pediatrician at the children's hospital.",
                        "بله، اون متخصص اطفال در بیمارستان کودکان است."),
                    DialogueLine("Sara", "A pediatrician! That must be a rewarding job.",
                        "متخصص اطفال! حتماً شغل ارزشمندیه."),
                    DialogueLine("Ali", "It is, but it can be exhausting too. She works long hours.",
                        "هست، ولی می‌تونه خسته‌کننده هم باشه. ساعت‌های طولانی کار می‌کنه."),
                    DialogueLine("Sara", "I can imagine. Well, I'm a graphic designer. I work from home.",
                        "می‌تونم تصور کنم. خب، من طراح گرافیکم. از خونه کار می‌کنم."),
                    DialogueLine("Ali", "Working from home sounds nice. Do you enjoy it?",
                        "کار از خونه خوب به نظر می‌رسه. ازش لذت می‌بری؟"),
                    DialogueLine("Sara", "Most days, yes. But sometimes I miss having colleagues around.",
                        "بیشتر روزها، بله. ولی بعضی وقتا دلم برای همکارها تنگ می‌شه."),
                    DialogueLine("Ali", "I get that. Well, I should get going. It was nice meeting you, Sara.",
                        "می‌فهمم. خب، باید برم. از آشناییت خوشحال شدم سارا."),
                    DialogueLine("Sara", "You too, Ali! Let's grab a coffee sometime.",
                        "من هم همینطور علی! یه وقت با هم قهوه بخوریم."),
                    DialogueLine("Ali", "Sounds like a plan. See you around!",
                        "حتماً. می‌بینمت!")
                ),
                comprehensionQuestions = listOf(
                    ComprehensionQuestion("علی چه شغلی دارد و کجا کار می‌کند؟",
                        "او مهندس نرم‌افزار است و برای یک استارتاپ در مرکز شهر کار می‌کند."),
                    ComprehensionQuestion("همسر علی چه شغلی دارد؟",
                        "او متخصص اطفال (pediatrician) در بیمارستان کودکان است."),
                    ComprehensionQuestion("سارا چرا کار از خانه را دوست دارد؟",
                        "چون راحته، ولی گاهی دلش برای همکارهاش تنگ می‌شه."),
                    ComprehensionQuestion("علی از چه چیزی در محله جدید خوشش آمده؟",
                        "مردم خوش‌برخورد هستن و شب‌ها ساکته."),
                    ComprehensionQuestion("سارا چه پیشنهادی در آخر مکالمه می‌دهد؟",
                        "پیشنهاد می‌ده یه وقت با هم قهوه بخورن.")
                ),
                speakingTasks = listOf(
                    SpeakingTask("Introduce yourself with your job.",
                        "خودت رو با شغلت معرفی کن.",
                        "از «I'm a/an...» یا «I work as...» استفاده کن."),
                    SpeakingTask("Describe a typical day at your job.",
                        "یک روز معمولی کاری‌ت رو توصیف کن.",
                        "از Present Simple و قیدهای تکرار استفاده کن."),
                    SpeakingTask("Ask a friend about their job.",
                        "از یک دوست درباره شغلش بپرس.",
                        "از What do you do? / Where do you work? استفاده کن."),
                    SpeakingTask("Talk about your dream job.",
                        "درباره شغل رویایی‌ت صحبت کن.",
                        "از I wish I... / I'd love to... استفاده کن."),
                    SpeakingTask("Compare two jobs you know.",
                        "دو شغلی که می‌شناسی رو مقایسه کن.",
                        "از more stressful than / higher salary استفاده کن.")
                ),
                writingTasks = listOf(
                    WritingTask("Write a short paragraph introducing yourself and your job.",
                        "یک پاراگراف کوتاه بنویس که خودت و شغلت رو معرفی کنی.",
                        80,
                        "شامل: نام، شغل، محل کار، وظایف اصلی"),
                    WritingTask("Write an email to a new colleague introducing yourself.",
                        "یک ایمیل به یک همکار جدید بنویس و خودت رو معرفی کن.",
                        120,
                        "شامل: سلام، معرفی خود، شغل، درخواست همکاری"),
                    WritingTask("Describe your dream job in detail.",
                        "شغل رویایی‌ت رو با جزئیات توصیف کن.",
                        150,
                        "شامل: چه شغلی، چرا، چه مهارت‌هایی لازمه")
                ),
                quiz = listOf(
                    QuizQuestion("کدام گزینه درست است؟",
                        listOf("She is a engineer.", "She is an engineer.", "She is engineer.", "She engineer is."), 1),
                    QuizQuestion("«شغل تو چیه؟» به انگلیسی؟",
                        listOf("What you do?", "What do you do?", "What does you do?", "What are you do?"), 1),
                    QuizQuestion("با کدام گزینه «an» می‌آید؟",
                        listOf("teacher", "doctor", "accountant", "nurse"), 2),
                    QuizQuestion("پاسخ مناسب به «Is she a doctor?»؟",
                        listOf("Yes, she does.", "Yes, she is.", "Yes, she do.", "Yes, she are."), 1),
                    QuizQuestion("کدام جمله درست است؟",
                        listOf("They are a teachers.", "They are teachers.", "They is teachers.", "They teachers are."), 1),
                    QuizQuestion("«او برای یک شرکت فناوری کار می‌کند.»",
                        listOf("She work for a tech company.", "She works for a tech company.", "She working for a tech company.", "She is work for a tech company."), 1),
                    QuizQuestion("«What does he do?» یعنی؟",
                        listOf("او کجاست؟", "او چیکار می‌کنه؟", "شغل او چیه؟", "او چطوره؟"), 2),
                    QuizQuestion("کدام گزینه اشتباه است؟",
                        listOf("I am a teacher.", "She is an architect.", "He is a engineer.", "They are doctors."), 2),
                    QuizQuestion("«من به عنوان پرستار کار می‌کنم.»",
                        listOf("I work a nurse.", "I work as a nurse.", "I working as nurse.", "I am work nurse."), 1),
                    QuizQuestion("«What do they do?» یعنی؟",
                        listOf("آنها چه کار می‌کنند؟", "آنها کجا هستند؟", "آنها چه می‌خورند؟", "آنها چه می‌گویند؟"), 0),
                    QuizQuestion("تفاوت «job» و «work»؟",
                        listOf("هیچ فرقی ندارند", "job قابل شمارش، work غیرقابل شمارش", "work قابل شمارش، job غیرقابل شمارش", "job فقط برای افراد"), 1),
                    QuizQuestion("کدام جمله درست است؟",
                        listOf("I have a lot of works.", "I have a lot of work.", "I have many work.", "I have works a lot."), 1),
                    QuizQuestion("معنی «land a job»؟",
                        listOf("شغل رو از دست دادن", "شغلی پیدا کردن", "شغل عوض کردن", "شغل ساختن"), 1),
                    QuizQuestion("«He works for Google.» یعنی؟",
                        listOf("او برای گوگل کار می‌کند", "او در گوگل است", "او گوگل دارد", "او به گوگل می‌رود"), 0),
                    QuizQuestion("کدام فعل عبارتی به معنی «فرسوده شدن»؟",
                        listOf("take on", "burn out", "fill in", "get ahead"), 1)
                )
            )
            else -> getDefaultContent("top_notch_1", chapter)
        }
    }

    private fun getTopNotch2(chapter: Int): LessonContent {
        return getDefaultContent("top_notch_2", chapter)
    }

    private fun getTopNotch3(chapter: Int): LessonContent {
        return getDefaultContent("top_notch_3", chapter)
    }
}// ادامه‌ی فایل TopNotchRepository.kt - این بخش را جایگزین تابع getTopNotch1 فعلی نکن،
// بلکه کد زیر را به عنوان یک case جدید (2) قبل از else در تابع getTopNotch1 اضافه کن.

        2 -> LessonContent("top_notch_1", 2, "About People", "درباره مردم",
            objectives = listOf(
                "یادگیری ۱۵ صفت توصیف ظاهر و شخصیت",
                "تفاوت بین What is he like? و What does he look like?",
                "استفاده از صفات قبل از اسم و بعد از فعل be",
                "بیان شخصیت و ظاهر افراد در مکالمات روزمره",
                "استفاده از قیدهای تشدیدکننده (very, really, quite)",
                "توصیف دوست و اعضای خانواده"
            ),
            vocabulary = listOf(
                VocabWord("Tall", "قدبلند", "tɔːl", "adj",
                    "My brother is very tall — he's almost 2 meters.",
                    "برادرم خیلی قدبلنده — تقریباً ۲ متره.",
                    "tall and thin / tall and handsome / a tall building",
                    "high (برای اشیا)", "short",
                    "tall (adj) / tallness (n) / tall (adv: talk tall)", "neutral",
                    "💡 tall برای افراد و ساختمان‌ها، high برای کوه و قیمت."),
                VocabWord("Short", "کوتاه / قدکوتاه", "ʃɔːrt", "adj",
                    "She's quite short, but she has a big personality.",
                    "او نسبتاً کوتاهه، ولی شخصیت بزرگی داره.",
                    "short and sweet / short hair / a short break",
                    "brief, petite", "tall, long",
                    "short (adj) / shorten (v) / shortly (adv)", "neutral",
                    "⚠️ short هم برای قد، هم برای طول و هم برای مدت زمان استفاده می‌شه."),
                VocabWord("Young", "جوان", "jʌŋ", "adj",
                    "He looks young for his age.",
                    "او نسبت به سنش جوان به نظر می‌رسه.",
                    "young at heart / young and energetic",
                    "youthful, juvenile", "old",
                    "young (adj) / youth (n) / younger (comp)", "neutral",
                    "💡 young at heart یعنی روحیه جوان داشتن، حتی در سن بالا."),
                VocabWord("Old", "پیر / قدیمی", "oʊld", "adj",
                    "My grandfather is 85 years old, but he's still very active.",
                    "پدربزرگم ۸۵ سالشه، ولی هنوز خیلی فعالمه.",
                    "old friend / old-fashioned / growing old",
                    "elderly, aged", "young, new",
                    "old (adj) / older (comp) / eldest (super)", "neutral",
                    "⚠️ برای افراد مسن، elderly مؤدبانه‌تر از old هست."),
                VocabWord("Nice", "مهربان / خوشایند", "naɪs", "adj",
                    "She's such a nice person — always helping others.",
                    "او خیلی آدم مهربونیه — همیشه به دیگران کمک می‌کنه.",
                    "nice to meet you / a nice person / nice weather",
                    "kind, pleasant, friendly", "mean, unpleasant",
                    "nice (adj) / nicely (adv) / niceness (n)", "neutral",
                    "⚠️ nice خیلی کلیشه‌ایه؛ برای تنوع از kind, friendly, pleasant استفاده کن."),
                VocabWord("Funny", "بامزه / خنده‌دار", "ˈfʌni", "adj",
                    "He's really funny — he makes everyone laugh.",
                    "او واقعاً بامزه‌ست — همه رو می‌خندونه.",
                    "funny joke / a funny guy / funny story",
                    "amusing, hilarious, witty", "serious, boring",
                    "fun (n/adj) / funny (adj) / funnily (adv)", "neutral",
                    "💡 funny یعنی خنده‌دار، fun یعنی سرگرم‌کننده. این دو رو قاطی نکن!"),
                VocabWord("Serious", "جدی", "ˈsɪriəs", "adj",
                    "He's a serious person — he doesn't joke around much.",
                    "او آدم جدی‌ایه — زیاد شوخی نمی‌کنه.",
                    "serious about / a serious student / deadly serious",
                    "grave, solemn", "funny, playful",
                    "serious (adj) / seriously (adv) / seriousness (n)", "neutral",
                    "💡 serious می‌تونه به معنی «شدید» هم باشه: a serious problem."),
                VocabWord("Friendly", "خوش‌برخورد / دوستانه", "ˈfrendli", "adj",
                    "The staff at the hotel were very friendly.",
                    "کارکنان هتل خیلی خوش‌برخورد بودن.",
                    "user-friendly / environmentally friendly / a friendly smile",
                    "amiable, warm, welcoming", "unfriendly, hostile",
                    "friend (n) / friendly (adj) / friendliness (n)", "neutral",
                    "💡 friendly در ترکیب با اسم‌ها معنی خاصی می‌ده: user-friendly (کاربرپسند)."),
                VocabWord("Quiet", "ساکت / آرام", "ˈkwaɪət", "adj",
                    "She's a quiet person, but very thoughtful.",
                    "او آدم ساکتیه، ولی خیلی متفکر.",
                    "quiet neighborhood / keep quiet / a quiet voice",
                    "silent, calm, reserved", "loud, noisy, talkative",
                    "quiet (adj) / quietly (adv) / quietness (n)", "neutral",
                    "💡 quiet می‌تونه به معنی آرام (مکان) هم باشه."),
                VocabWord("Talkative", "پرحرف", "ˈtɔːkətɪv", "adj",
                    "My aunt is very talkative — she can talk for hours.",
                    "خاله‌ام خیلی پرحرفه — ساعت‌ها می‌تونه حرف بزنه.",
                    "a talkative child / extremely talkative",
                    "chatty, gabby", "quiet, reserved",
                    "talk (v/n) / talkative (adj) / talkatively (adv)", "neutral",
                    "⚠️ talkative معمولاً خنثیه، ولی می‌تونه منفی هم باشه."),
                VocabWord("Generous", "بخشنده / دست‌ودل‌باز", "ˈdʒenərəs", "adj",
                    "My grandmother is very generous — she always gives gifts.",
                    "مادربزرگم خیلی دست‌ودل‌بازه — همیشه هدیه می‌ده.",
                    "generous with money / a generous offer",
                    "giving, charitable", "stingy, selfish",
                    "generous (adj) / generosity (n) / generously (adv)", "neutral",
                    "💡 generous فقط برای پول نیست: generous with time (وقت‌گذار)."),
                VocabWord("Shy", "خجالتی", "ʃaɪ", "adj",
                    "He's a bit shy at first, but he warms up quickly.",
                    "اولش یه کم خجالتیه، ولی زود گرم می‌گیره.",
                    "shy around strangers / a shy smile",
                    "timid, reserved, bashful", "confident, outgoing",
                    "shy (adj) / shyly (adv) / shyness (n)", "neutral",
                    "💡 shy با embarrassed فرق داره: shy = خجالتی، embarrassed = خجالت‌زده."),
                VocabWord("Confident", "با اعتماد به نفس", "ˈkɑːnfɪdənt", "adj",
                    "She's very confident when she speaks in public.",
                    "او وقتی جلوی جمع صحبت می‌کنه خیلی با اعتماد به نفسه.",
                    "self-confident / confident about",
                    "self-assured, poised", "shy, insecure",
                    "confident (adj) / confidence (n) / confidently (adv)", "neutral",
                    "💡 self-confident تأکیدی‌تر از confident هست."),
                VocabWord("Polite", "مؤدب", "pəˈlaɪt", "adj",
                    "Always be polite to your elders.",
                    "همیشه با بزرگ‌ترها مؤدب باش.",
                    "polite conversation / a polite refusal",
                    "courteous, respectful", "rude, impolite",
                    "polite (adj) / politely (adv) / politeness (n)", "neutral",
                    "💡 polite ≠ friendly؛ polite فقط رعایت ادب، friendly صمیمیت هم داره."),
                VocabWord("Honest", "صادق / راستگو", "ˈɑːnɪst", "adj",
                    "I appreciate your honest opinion.",
                    "نظر صادقانه‌ات رو قدردانی می‌کنم.",
                    "to be honest / an honest answer / brutally honest",
                    "truthful, sincere", "dishonest, deceitful",
                    "honest (adj) / honestly (adv) / honesty (n)", "neutral",
                    "💡 to be honest یک اصطلاح رایجه: «راستش رو بخوای».")
            ),
            idioms = listOf(
                IdiomExpression("What is he like?", "چه جوریه؟ (شخصیت)",
                    "What's your new boss like? — She's strict but fair.",
                    "رئیس جدیدت چه جوریه؟ — سختگیره ولی منصف.", "neutral"),
                IdiomExpression("What does he look like?", "ظاهرش چطوره؟",
                    "What does your brother look like? — He's tall with dark hair.",
                    "برادرت ظاهرش چطوره؟ — قدبلنده با موی تیره.", "neutral"),
                IdiomExpression("A people person", "کسی که با مردم خوب کنار میاد",
                    "She's a real people person — everyone loves her.",
                    "او واقعاً با مردم خوب کنار میاد — همه دوستش دارن.", "informal"),
                IdiomExpression("Wear your heart on your sleeve", "احساساتت رو نشون دادن",
                    "He wears his heart on his sleeve — you always know how he feels.",
                    "او احساساتش رو بروز می‌ده — همیشه می‌دونی چه حسی داره.", "idiom"),
                IdiomExpression("A shoulder to cry on", "کسی که بتونی باهاش درد دل کنی",
                    "She's always been a shoulder to cry on for me.",
                    "او همیشه کسی بوده که باهاش درد دل کنم.", "idiom"),
                IdiomExpression("Painfully shy", "خیلی خجالتی",
                    "He's painfully shy around new people.",
                    "او دور و بر آدم‌های جدید خیلی خجالتیه.", "informal"),
                IdiomExpression("Outgoing personality", "شخصیت برون‌گرا / اجتماعی",
                    "She has a very outgoing personality.",
                    "او شخصیت خیلی اجتماعی داره.", "neutral"),
                IdiomExpression("Talk someone's ear off", "کسی رو با حرف زدن خسته کردن",
                    "My aunt will talk your ear off if you let her.",
                    "خاله‌ام اگه اجازه بدی، با حرف زدن خسته‌ات می‌کنه.", "informal"),
                IdiomExpression("Keep to oneself", "گوشه‌گیر بودن",
                    "He keeps to himself and doesn't socialize much.",
                    "او گوشه‌گیره و زیاد معاشرت نمی‌کنه.", "neutral"),
                IdiomExpression("The life of the party", "شادی‌آور مجلس",
                    "My cousin is always the life of the party.",
                    "پسرخالم همیشه شادی‌آور مجلسه.", "informal")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("get along (with)", "کنار آمدن با کسی",
                    "کنار آمدن با کسی",
                    "I get along really well with my new roommate.",
                    "من با هم‌اتاقی جدیدم خیلی خوب کنار میام.", "غیرقابل جدا شدن"),
                PhrasalVerb("look up to", "الگو قرار دادن / تحسین کردن",
                    "الگو قرار دادن",
                    "I've always looked up to my older sister.",
                    "من همیشه خواهر بزرگ‌ترم رو الگو قرار داده‌ام.", "غیرقابل جدا شدن"),
                PhrasalVerb("warm up (to)", "گرم گرفتن با کسی",
                    "گرم گرفتن",
                    "He's shy at first, but he warms up quickly.",
                    "اولش خجالتیه، ولی زود گرم می‌گیره.", "غیرقابل جدا شدن"),
                PhrasalVerb("hang out (with)", "وقت گذراندن با کسی",
                    "وقت گذراندن با کسی",
                    "We usually hang out with friends on weekends.",
                    "ما معمولاً آخر هفته‌ها با دوستامون وقت می‌گذرونیم.", "غیرقابل جدا شدن"),
                PhrasalVerb("put up with", "تحمل کردن",
                    "تحمل کردن",
                    "I can't put up with his rude behavior anymore.",
                    "من دیگه نمی‌تونم رفتار بی‌ادبانه‌اش رو تحمل کنم.", "غیرقابل جدا شدن"),
                PhrasalVerb("take after", "شبیه بودن به",
                    "شبیه بودن به",
                    "She takes after her mother in looks.",
                    "او از نظر ظاهر شبیه مادرشه.", "غیرقابل جدا شدن"),
                PhrasalVerb("cheer up", "روحیه دادن / شاد کردن",
                    "روحیه دادن",
                    "I tried to cheer her up with a joke.",
                    "سعی کردم با یه جوک روحیه‌اش رو بهتر کنم.", "جدا شدنی"),
                PhrasalVerb("open up (to)", "باز شدن / اعتماد کردن",
                    "باز شدن",
                    "It took a while for him to open up to us.",
                    "یه کم طول کشید تا به ما اعتماد کنه.", "غیرقابل جدا شدن")
            ),
            pronunciationTips = listOf(
                PronunciationTip("استرس در صفات دو سیلابی",
                    "🔊 بیشتر صفات دو سیلابی روی سیلاب اول استرس دارند:\n" +
                    "• HAP-py /ˈhæp.i/\n• FRIEND-ly /ˈfrend.li/\n" +
                    "• QUI-et /ˈkwaɪ.ət/\n\n" +
                    "🔸 اما صفاتی که با پیشوندهای منفی شروع می‌شن، روی ریشه استرس دارن:\n" +
                    "• un-HAP-py /ʌnˈhæp.i/\n• im-PO-lite /ˌɪm.pəˈlaɪt/"),
                PronunciationTip("تفاوت /æ/ و /e/",
                    "🔊 این دو صدا در انگلیسی خیلی مهم هستن:\n" +
                    "• /æ/ (دهان بازتر): bad, sad, happy, family\n" +
                    "• /e/ (دهان نیمه‌باز): bed, said, friend, many\n\n" +
                    "💡 تمرین: bad و bed رو با هم بگو تا تفاوت رو حس کنی."),
                PronunciationTip("تلفظ th در صفات",
                    "🔊 دو نوع th داریم:\n" +
                    "• /θ/ بی‌صدا: thin, thoughtful, healthy\n" +
                    "• /ð/ صدا‌دار: this, that, the, they\n\n" +
                    "💡 برای /θ/ زبان بین دندون‌ها بدون لرزش. برای /ð/ با لرزش.")
            ),
            culturalNotes = listOf(
                CulturalNote("توصیف ظاهر در فرهنگ غرب",
                    "🌍 در فرهنگ غربی، توصیف ظاهر افراد حساسیت داره:\n" +
                    "✅ مؤدبانه: She's tall and has beautiful eyes.\n" +
                    "❌ بی‌ادبانه: She's fat. / He's ugly.\n\n" +
                    "💡 به‌جای fat از overweight یا heavyset استفاده کن.\n" +
                    "💡 به‌جای ugly از not very attractive یا plain استفاده کن."),
                CulturalNote("شخصیت و برچسب زدن",
                    "🌍 در انگلیسی، برچسب زدن به شخصیت افراد با احتیاط انجام می‌شه:\n" +
                    "• He's a bit shy. (مؤدبانه)\n" +
                    "• He's socially awkward. (منفی‌تر)\n" +
                    "• He's an introvert. (خنثی، خودشناسی)\n\n" +
                    "💡 در محیط کاری، صفاتی مثل reliable, proactive, team-player ارزشمند هستن."),
                CulturalNote("Small Talk درباره افراد",
                    "🌍 در Small Talk، صحبت درباره خانواده و دوستان رایجه:\n" +
                    "• What's your family like?\n" +
                    "• Do you have any siblings?\n" +
                    "• What does your best friend do?\n\n" +
                    "💡 در آمریکا این سوالات رایجن، ولی در بعضی فرهنگ‌ها شخصی تلقی می‌شن.")
            ),
            grammar = listOf(
                GrammarSection("📌 جای صفت در جمله",
                    "🔹 صفت می‌تونه دو جا بیاد:\n" +
                    "1️⃣ بعد از فعل be (خبری):\n• She is tall. / He is friendly.\n\n" +
                    "2️⃣ قبل از اسم (وصفی):\n• She is a tall girl. / He is a friendly guy.\n\n" +
                    "⚠️ اشتباه رایج:\n❌ She tall is. → ✅ She is tall.\n❌ He is a man tall. → ✅ He is a tall man.\n\n" +
                    "💡 نکته: در انگلیسی، صفت هیچ‌وقت بعد از اسم نمیاد (برخلاف فارسی)."),
                GrammarSection("📌 ترتیب صفات",
                    "🔹 وقتی چند صفت پشت‌سرهم میاد، ترتیب خاصی دارن:\n" +
                    "1️⃣ نظر (opinion): nice, beautiful, ugly\n" +
                    "2️⃣ اندازه (size): big, small, tall\n" +
                    "3️⃣ سن (age): old, young, new\n" +
                    "4️⃣ شکل (shape): round, square\n" +
                    "5️⃣ رنگ (color): red, blue\n" +
                    "6️⃣ منشأ (origin): Iranian, French\n" +
                    "7️⃣ جنس (material): wooden, silk\n\n" +
                    "💡 مثال:\n• A beautiful big old round red Italian wooden table.\n" +
                    "• A nice tall young man.\n\n" +
                    "⚠️ نگران نباش اگه ترتیب رو دقیق حفظ نکنی — حتی نیتیوها هم گاهی اشتباه می‌کنن!"),
                GrammarSection("📌 سوال درباره شخصیت و ظاهر",
                    "🔹 دو سوال کلیدی:\n" +
                    "• What is he like? → شخصیت (He's kind and funny)\n" +
                    "• What does he look like? → ظاهر (He's tall and thin)\n\n" +
                    "🔸 سوالات مشابه:\n" +
                    "• How would you describe him? (رسمی)\n" +
                    "• What kind of person is he? (شخصیت)\n" +
                    "• How does he look? (ظاهر)\n\n" +
                    "⚠️ اشتباه رایج:\n❌ What is he like? = How does he look? (این دوتا فرق دارن!)"),
                GrammarSection("📌 قیدهای تشدیدکننده",
                    "🔹 برای تأکید روی صفات از این قیدها استفاده کن:\n" +
                    "• very + صفت: very tall, very kind\n" +
                    "• really + صفت: really funny, really nice\n" +
                    "• quite + صفت: quite shy, quite tall (نسبتاً)\n" +
                    "• so + صفت: so funny! so kind!\n" +
                    "• extremely + صفت: extremely generous\n" +
                    "• absolutely + صفت: absolutely wonderful\n\n" +
                    "⚠️ ❌ She very nice. → ✅ She is very nice.\n\n" +
                    "💡 قیدهای تشدیدکننده قبل از صفت میاد، نه بعدش."),
                GrammarSection("📌 صفات متضاد رایج",
                    "🔹 این جفت‌های متضاد رو حفظ کن:\n" +
                    "• tall ↔ short\n• young ↔ old\n• nice ↔ mean\n" +
                    "• quiet ↔ talkative\n• friendly ↔ unfriendly\n" +
                    "• generous ↔ stingy\n• shy ↔ confident\n" +
                    "• polite ↔ rude\n• honest ↔ dishonest\n" +
                    "• serious ↔ funny\n\n" +
                    "💡 یادگیری متضادها باعث می‌شه لغات سریع‌تر توی ذهن بمونن."),
                GrammarSection("📌 تفاوت funny و fun",
                    "🔹 این دو کلمه خیلی اشتباه می‌شن:\n" +
                    "• Funny = خنده‌دار (شخص یا چیزی که می‌خندونه):\n" +
                    "  He's a funny guy. / A funny joke.\n\n" +
                    "• Fun = سرگرم‌کننده / لذت‌بخش (تجربه):\n" +
                    "  The party was fun. / We had a lot of fun.\n\n" +
                    "⚠️ ❌ The party was funny. → ✅ The party was fun.\n" +
                    "💡 funny = بامزه، fun = باحال / سرگرم‌کننده."),
                GrammarSection("📌 تفاوت shy / embarrassed / ashamed",
                    "🔹 سه کلمه شبیه ولی متفاوت:\n" +
                    "• Shy = خجالتی (ویژگی شخصیتی)\n  She's shy around strangers.\n\n" +
                    "• Embarrassed = خجالت‌زده (احساس لحظه‌ای)\n  I was so embarrassed when I fell.\n\n" +
                    "• Ashamed = شرمنده (احساس گناه)\n  He felt ashamed of his behavior.\n\n" +
                    "💡 shy دائمی، embarrassed لحظه‌ای، ashamed اخلاقی."),
                GrammarSection("📌 Formal vs Informal: توصیف شخصیت",
                    "🔹 Informal:\n• He's a nice guy. / She's really cool.\n• He's kind of weird. (غیررسمی)\n\n" +
                    "🔸 Formal:\n• He's a pleasant individual. / She's quite agreeable.\n• He has an eccentric personality. (مؤدبانه)\n\n" +
                    "💡 در مکاتبات رسمی و مصاحبه، از ساختارهای مؤدبانه استفاده کن.")
            ),
            commonMistakes = listOf(
                CommonMistake("She tall.", "She is tall.", "صفت بعد از فاعل نیاز به فعل be داره."),
                CommonMistake("He is a man tall.", "He is a tall man.", "صفت قبل از اسم میاد، نه بعدش."),
                CommonMistake("She very nice.", "She is very nice.", "قبل از very باید فعل be بیاد."),
                CommonMistake("What is he like? = How does he look?", "What is he like? = personality / What does he look like? = appearance",
                    "این دو سوال دو معنی کاملاً متفاوت دارن."),
                CommonMistake("The party was funny.", "The party was fun.", "funny = خنده‌دار، fun = سرگرم‌کننده."),
                CommonMistake("He's a very tall young man nice.", "He's a very nice tall young man.",
                    "ترتیب صفات: opinion + size + age."),
                CommonMistake("I very like him.", "I really like him.", "very قبل از فعل نمیاد، از really استفاده کن."),
                CommonMistake("She is more tall than me.", "She is taller than me.", "صفت‌های کوتاه با -er مقایسه می‌شن."),
                CommonMistake("He is a bit very shy.", "He is a bit shy. / He is very shy.",
                    "a bit و very با هم نمیان."),
                CommonMistake("My friend is a friendly person very.", "My friend is a very friendly person.",
                    "ترتیب: very قبل از صفت."),
                CommonMistake("She looks like friendly.", "She looks friendly.", "look like + اسم، look + صفت."),
                CommonMistake("He is more funny than his brother.", "He is funnier than his brother.",
                    "funny → funnier (y به i تبدیل می‌شه).")
            ),
            conversation = listOf(
                DialogueLine("Anna", "Hey Mike! I heard you met someone new. Who is it?",
                    "هی مایک! شنیدم با یه نفر جدید آشنا شدی. کیه؟"),
                DialogueLine("Mike", "Yeah, her name is Sara. She's my new classmate.",
                    "آره، اسمش ساراست. همکلاسی جدیدمه."),
                DialogueLine("Anna", "Oh nice! What is she like?",
                    "اوه چه خوب! چه جوریه؟"),
                DialogueLine("Mike", "She's really friendly and quite smart. She's also very funny — she makes everyone laugh.",
                    "خیلی خوش‌برخوره و نسبتاً باهوش. خیلی هم بامزه‌ست — همه رو می‌خندونه."),
                DialogueLine("Anna", "Sounds great! Is she talkative?",
                    "عالی به نظر می‌رسه! پرحرفه؟"),
                DialogueLine("Mike", "Not really. She's actually quite quiet, but when she speaks, she's really interesting.",
                    "نه زیاد. در واقع خیلی ساکته، ولی وقتی حرف می‌زنه، خیلی جالبه."),
                DialogueLine("Anna", "What does she look like?",
                    "ظاهرش چطوره؟"),
                DialogueLine("Mike", "She's tall with long black hair and brown eyes. She usually wears glasses.",
                    "قدبلنده با موهای بلند مشکی و چشم‌های قهوه‌ای. معمولاً عینک می‌زنه."),
                DialogueLine("Anna", "Sounds like a nice person. Is she shy?",
                    "آدم خوبی به نظر می‌رسه. خجالتیه؟"),
                DialogueLine("Mike", "A little bit at first, but she warms up quickly once she gets to know you.",
                    "اولش یه کم، ولی زود گرم می‌گیره وقتی که بشناسه‌ات."),
                DialogueLine("Anna", "Do you get along well with her?",
                    "با اون خوب کنار میای؟"),
                DialogueLine("Mike", "Yeah, we get along really well. She's honestly one of the nicest people I've met.",
                    "آره، خیلی خوب کنار میایم. راستش یکی از مهربون‌ترین آدم‌هایی هسته که دیدم."),
                DialogueLine("Anna", "That's great! I'd love to meet her sometime.",
                    "چه عالی! دوست دارم یه وقت ببینمش."),
                DialogueLine("Mike", "Sure! Maybe we can all hang out this weekend.",
                    "حتماً! شاید این آخر هفته همه با هم وقت بگذرونیم."),
                DialogueLine("Anna", "Sounds like a plan. What about her family?",
                    "برنامه خوبیه. خانواده‌اش چطور؟"),
                DialogueLine("Mike", "She has one older brother. She really looks up to him — he's a doctor.",
                    "یه برادر بزرگ‌تر داره. خیلی هم الگوش می‌دونه — اون دکتره."),
                DialogueLine("Anna", "That's sweet. Does she take after her mom or dad?",
                    "چه باحال. شبیه مامانشه یا باباش؟"),
                DialogueLine("Mike", "Her mom, I think. They have the same personality — both quiet and thoughtful.",
                    "مامانش، فکر کنم. شخصیتشون یکیه — هر دو ساکت و متفکر."),
                DialogueLine("Anna", "Nice! Can't wait to meet her.",
                    "چه خوب! بی‌صبرانه منتظر دیدارشم."),
                DialogueLine("Mike", "I'll text you the details. See you soon!",
                    "جزئیات رو برات پیام می‌کنم. به زودی می‌بینمت!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("سارا چه ویژگی‌های شخصیتی دارد؟",
                    "خوش‌برخورد، باهوش، بامزه، ساکت (ولی وقتی حرف می‌زند جالبه)، و اولش یه کم خجالتی."),
                ComprehensionQuestion("سارا چه ویژگی‌های ظاهری دارد؟",
                    "قدبلند، موهای بلند مشکی، چشم‌های قهوه‌ای، معمولاً عینک می‌زند."),
                ComprehensionQuestion("سارا چرا الگویش برادر بزرگ‌ترش است؟",
                    "چون برادرش دکتره و سارا تحسینش می‌کنه."),
                ComprehensionQuestion("سارا شبیه کدام یک از والدینش است؟",
                    "شبیه مادرش — هر دو ساکت و متفکر."),
                ComprehensionQuestion("مایک و آنا چه برنامه‌ای برای آخر هفته دارند؟",
                    "می‌خوان همه با هم وقت بگذرونن تا آنا با سارا آشنا بشه.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your best friend's personality.",
                    "شخصیت بهترین دوستت رو توصیف کن.",
                    "از صفاتی مثل friendly, funny, honest, generous استفاده کن."),
                SpeakingTask("Describe a family member's appearance.",
                    "ظاهر یکی از اعضای خانواده‌ت رو توصیف کن.",
                    "از ترتیب صفات استفاده کن: opinion + size + age + color."),
                SpeakingTask("Talk about someone you look up to.",
                    "درباره کسی که الگوت هست صحبت کن.",
                    "از look up to و take after استفاده کن."),
                SpeakingTask("Compare two people you know.",
                    "دو نفر که می‌شناسی رو مقایسه کن.",
                    "از taller than, more outgoing than, funnier than استفاده کن."),
                SpeakingTask("Describe your ideal friend.",
                    "دوست ایده‌آلت رو توصیف کن.",
                    "از I'd like someone who... / A person who... استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Write a paragraph describing your best friend.",
                    "یک پاراگراف درباره بهترین دوستت بنویس.",
                    100,
                    "شامل: نام، ظاهر، شخصیت، چرا دوستش داری"),
                WritingTask("Write a short essay about what makes a good friend.",
                    "یک متن کوتاه بنویس درباره اینکه چه چیزی یک دوست خوب رو می‌سازه.",
                    150,
                    "شامل: ۳ ویژگی مهم + مثال"),
                WritingTask("Describe a person you admire (famous or personal).",
                    "فردی که تحسینش می‌کنی رو توصیف کن (مشهور یا شخصی).",
                    180,
                    "شامل: چه کسی، چرا، ویژگی‌های خاص")
            ),
            quiz = listOf(
                QuizQuestion("«What is she like?» درباره چیست؟",
                    listOf("ظاهر", "شخصیت", "شغل", "سن"), 1),
                QuizQuestion("«What does she look like?» درباره چیست؟",
                    listOf("ظاهر", "شخصیت", "شغل", "سن"), 0),
                QuizQuestion("کدام جمله درست است؟",
                    listOf("She tall is.", "She is tall.", "Tall she is.", "Is she tall."), 1),
                QuizQuestion("کدام جمله درست است؟",
                    listOf("He is a man tall.", "He is a tall man.", "He tall man is.", "Tall man he is."), 1),
                QuizQuestion("متضاد «generous» چیست؟",
                    listOf("kind", "stingy", "shy", "polite"), 1),
                QuizQuestion("تفاوت funny و fun؟",
                    listOf("هیچ فرقی ندارند", "funny خنده‌دار، fun سرگرم‌کننده", "fun خنده‌دار، funny سرگرم‌کننده", "funny فقط برای افراد"), 1),
                QuizQuestion("کدام جمله درست است؟",
                    listOf("She very nice.", "She is very nice.", "She be nice.", "Nice she is."), 1),
                QuizQuestion("معنی «shy» چیست؟",
                    listOf("پررو", "خجالتی", "مهربان", "باهوش"), 1),
                QuizQuestion("ترتیب صفات درست کدام است؟",
                    listOf("a red big car", "a big red car", "a car big red", "red a big car"), 1),
                QuizQuestion("«او شبیه مادرش است.»",
                    listOf("She takes after her mother.", "She takes her mother after.", "She look after her mother.", "She looks like her mother after."), 0),
                QuizQuestion("معنی «look up to» چیست؟",
                    listOf("تحقیر کردن", "الگو قرار دادن", "نگاه کردن", "بالا رفتن"), 1),
                QuizQuestion("«He's talkative» یعنی؟",
                    listOf("ساکته", "پرحرفه", "خجالتیه", "باهوشه"), 1),
                QuizQuestion("کدام جمله اشتباه است؟",
                    listOf("She's funny.", "She's fun.", "She's a fun person.", "She's a funny person."), 3),
                QuizQuestion("تفاوت shy و embarrassed؟",
                    listOf("هیچ فرقی ندارند", "shy دائمی، embarrassed لحظه‌ای", "embarrassed دائمی، shy لحظه‌ای", "shy فقط برای زنان"), 1),
                QuizQuestion("«a people person» یعنی چه کسی؟",
                    listOf("کسی که از مردم بدش میاد", "کسی که با مردم خوب کنار میاد", "کسی که تنهاست", "کسی که پرحرفه"), 1)
            )
        )// ادامه‌ی فایل TopNotchRepository.kt - این بخش را قبل از else در تابع getTopNotch1 اضافه کن.

        3 -> LessonContent("top_notch_1", 3, "Places and Things", "مکان‌ها و اشیا",
            objectives = listOf(
                "یادگیری ۱۵ اسم مکان و شیء رایج",
                "استفاده از There is / There are برای توصیف مکان",
                "جمع بستن اسم‌ها (s, es, ies, بی‌قاعده)",
                "استفاده از حروف اضافه مکان (in, on, under, next to, between)",
                "پرسیدن آدرس و توصیف مکان‌ها",
                "توصیف خانه، محله و شهر"
            ),
            vocabulary = listOf(
                VocabWord("Book", "کتاب", "bʊk", "n",
                    "I borrowed three books from the library.",
                    "من سه کتاب از کتابخانه امانت گرفتم.",
                    "read a book / a book about / by the book",
                    "volume, novel, textbook", "",
                    "book (n/v) / bookshelf (n) / bookstore (n)", "neutral",
                    "💡 book هم اسم و هم فعل: I booked a hotel room."),
                VocabWord("Table", "میز", "ˈteɪbəl", "n",
                    "We sat around the table and talked for hours.",
                    "دور میز نشستیم و ساعت‌ها صحبت کردیم.",
                    "set the table / clear the table / a coffee table",
                    "desk, counter", "",
                    "table (n) / tablecloth (n) / tablespoon (n)", "neutral",
                    "💡 table (میز) با desk (میز کار) فرق داره."),
                VocabWord("Chair", "صندلی", "tʃer", "n",
                    "Please pull up a chair and join us.",
                    "لطفاً یه صندلی بکش و بیا پیش ما.",
                    "take a chair / a comfortable chair / sit on a chair",
                    "seat, stool, armchair", "",
                    "chair (n) / chairman (n) / chairperson (n)", "neutral",
                    "💡 chair فقط صندلی نیست، chairman هم رئیس جلسه است."),
                VocabWord("Window", "پنجره", "ˈwɪndoʊ", "n",
                    "The sun was shining through the window.",
                    "خورشید از پنجره می‌تابید.",
                    "look out the window / open the window / a shop window",
                    "pane, glass", "",
                    "window (n) / windowsill (n) / window shopping (n)", "neutral",
                    "💡 window shopping یعنی ویترین‌گردی بدون خرید."),
                VocabWord("Door", "در", "dɔːr", "n",
                    "Someone is knocking at the door.",
                    "یکی داره در می‌زنه.",
                    "open the door / answer the door / next door",
                    "entrance, doorway, gate", "",
                    "door (n) / doorknob (n) / doorstep (n)", "neutral",
                    "💡 next door یعنی همسایه دیوار به دیوار."),
                VocabWord("Street", "خیابان", "striːt", "n",
                    "I live on a quiet street near the park.",
                    "من در خیابان آرامی نزدیک پارک زندگی می‌کنم.",
                    "on the street / across the street / a main street",
                    "road, avenue, lane", "",
                    "street (n) / streetlight (n) / streetwise (adj)", "neutral",
                    "💡 street در بریتانیا رایج‌تره، avenue و boulevard در آمریکا."),
                VocabWord("City", "شهر", "ˈsɪti", "n",
                    "Tehran is a huge city with a rich history.",
                    "تهران شهر بزرگی با تاریخ غنی است.",
                    "a big city / in the city center / city life",
                    "town, metropolis, municipality", "village, countryside",
                    "city (n) / citizen (n) / citywide (adj)", "neutral",
                    "💡 city بزرگ‌تر از town، village کوچک‌تر از town."),
                VocabWord("Country", "کشور / روستا", "ˈkʌntri", "n",
                    "Iran is a beautiful country with a long history.",
                    "ایران کشور زیبایی با تاریخ طولانی است.",
                    "a foreign country / in the country / a developing country",
                    "nation, state, land", "",
                    "country (n) / countryside (n) / countryman (n)", "neutral",
                    "⚠️ country هم معنی کشور داره، هم روستا (منطقه غیرشهری)."),
                VocabWord("Park", "پارک", "pɑːrk", "n",
                    "Let's go for a walk in the park this afternoon.",
                    "بیا این بعدازظهر بریم پارک پیاده‌روی.",
                    "walk in the park / a national park / park a car",
                    "garden, green, recreation area", "",
                    "park (n/v) / parking (n) / parkway (n)", "neutral",
                    "💡 park هم اسم و هم فعل (پارک کردن ماشین) هست."),
                VocabWord("Hospital", "بیمارستان", "ˈhɑːspɪtəl", "n",
                    "She works as a nurse at a children's hospital.",
                    "او به عنوان پرستار در یک بیمارستان کودکان کار می‌کند.",
                    "go to the hospital / be in hospital / a general hospital",
                    "clinic, medical center", "",
                    "hospital (n) / hospitality (n) / hospitalize (v)", "neutral",
                    "⚠️ در آمریکا the hospital می‌گن، در بریتانیا hospital (بدون the)."),
                VocabWord("Restaurant", "رستوران", "ˈrestərɑːnt", "n",
                    "We had dinner at an Italian restaurant last night.",
                    "دیشب شام رو در یه رستوران ایتالیایی خوردیم.",
                    "a fancy restaurant / eat at a restaurant / a fast-food restaurant",
                    "cafe, diner, bistro", "",
                    "restaurant (n) / restaurateur (n)", "neutral",
                    "💡 تلفظش /ˈrestərɑːnt/ یا /ˈrestərɒnt/، نه /ˈrestərənt/."),
                VocabWord("Bank", "بانک", "bæŋk", "n",
                    "I need to go to the bank to deposit a check.",
                    "باید برم بانک تا یه چک واریز کنم.",
                    "go to the bank / a bank account / bank on",
                    "credit union, financial institution", "",
                    "bank (n/v) / banking (n) / banker (n)", "neutral",
                    "💡 bank هم اسم (بانک) هم فعل (روی کسی حساب کردن)."),
                VocabWord("Library", "کتابخانه", "ˈlaɪbreri", "n",
                    "The library is a great place to study quietly.",
                    "کتابخانه جای عالی برای مطالعه آرومه.",
                    "a public library / go to the library / borrow from the library",
                    "archive, reading room", "",
                    "library (n) / librarian (n)", "neutral",
                    "💡 تلفظش /ˈlaɪbreri/ در آمریکا و /ˈlaɪbrəri/ در بریتانیا."),
                VocabWord("Market", "بازار / فروشگاه", "ˈmɑːrkɪt", "n",
                    "I buy fresh fruit at the local market every Saturday.",
                    "من هر شنبه میوه تازه از بازار محلی می‌خرم.",
                    "a farmers' market / go to the market / market price",
                    "bazaar, supermarket, store", "",
                    "market (n/v) / marketing (n) / marketplace (n)", "neutral",
                    "💡 market در انگلیسی آمریکایی می‌تونه معنی سوپرمارکت کوچک بده."),
                VocabWord("Beach", "ساحل", "biːtʃ", "n",
                    "We spent the whole day relaxing on the beach.",
                    "کل روز رو در ساحل استراحت کردیم.",
                    "on the beach / go to the beach / a sandy beach",
                    "seaside, shore, coast", "",
                    "beach (n) / beachfront (n) / beachwear (n)", "neutral",
                    "💡 beach (ساحل شنی) با coast (خط ساحلی) فرق داره.")
            ),
            idioms = listOf(
                IdiomExpression("On the house", "مهمون خونه (رایگان)",
                    "The dessert is on the house tonight.",
                    "دسر امشب مهمون ما.", "informal"),
                IdiomExpression("Around the corner", "نزدیک / در شرف اتفاق",
                    "The bank is just around the corner.",
                    "بانک همون نزدیکی سر کوچه‌ست.", "neutral"),
                IdiomExpression("In the middle of nowhere", "در جای دورافتاده",
                    "Our hotel was in the middle of nowhere.",
                    "هتل ما در یه جای دورافتاده بود.", "informal"),
                IdiomExpression("A stone's throw away", "خیلی نزدیک",
                    "The supermarket is a stone's throw from my house.",
                    "سوپرمارکت خیلی نزدیک خونمه.", "idiom"),
                IdiomExpression("Go window shopping", "ویترین‌گردی کردن",
                    "We went window shopping downtown yesterday.",
                    "دیروز رفتیم مرکز شهر ویترین‌گردی.", "neutral"),
                IdiomExpression("Hit the town", "رفتن به شهر برای تفریح",
                    "Let's hit the town this Friday night!",
                    "بیا این جمعه شب بریم شهر برای تفریح!", "informal"),
                IdiomExpression("The best of both worlds", "بهترین حالت ممکن (از هر دو)",
                    "Living in the suburbs gives you the best of both worlds.",
                    "زندگی در حومه شهر بهترین حالت رو بهت می‌ده.", "idiom"),
                IdiomExpression("Not my cup of tea", "به سلیقه‌ام نمی‌خوره",
                    "Big cities are not really my cup of tea.",
                    "شهرهای بزرگ واقعاً به سلیقه‌ام نمی‌خورن.", "informal"),
                IdiomExpression("Home away from home", "جایی که احساس خانه بودن داری",
                    "This cafe has become my home away from home.",
                    "این کافه برام مثل خانه دوم شده.", "idiom"),
                IdiomExpression("Right up my alley", "دقیقاً به سلیقه‌ام می‌خوره",
                    "A quiet bookshop? That's right up my alley.",
                    "یه کتابفروشی دنج؟ دقیقاً به سلیقه‌ام می‌خوره.", "informal")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("look for", "دنبال چیزی گشتن",
                    "دنبال چیزی گشتن",
                    "I'm looking for a new apartment near the park.",
                    "من دنبال یه آپارتمان جدید نزدیک پارک می‌گردم.", "غیرقابل جدا شدن"),
                PhrasalVerb("move in / move out", "اسباب‌کشی کردن / تخلیه کردن",
                    "اسباب‌کشی کردن",
                    "We're moving in next weekend.",
                    "آخر هفته بعد اسباب‌کشی می‌کنیم.", "غیرقابل جدا شدن"),
                PhrasalVerb("drop by", "سر زدن",
                    "سر زدن",
                    "Feel free to drop by anytime.",
                    "هر وقت خواستی سر بزن.", "غیرقابل جدا شدن"),
                PhrasalVerb("run into", "تصادفاً دیدن",
                    "تصادفاً دیدن",
                    "I ran into an old friend at the mall.",
                    "توی پاساژ تصادفاً یه دوست قدیمی دیدم.", "غیرقابل جدا شدن"),
                PhrasalVerb("get around", "جابه‌جا شدن / رفت و آمد",
                    "جابه‌جا شدن",
                    "It's easy to get around the city by metro.",
                    "با مترو رفت و آمد در شهر راحته.", "غیرقابل جدا شدن"),
                PhrasalVerb("hang around", "پرسه زدن",
                    "پرسه زدن",
                    "Teenagers often hang around the shopping center.",
                    "نوجوان‌ها اغلب توی مرکز خرید پرسه می‌زنن.", "غیرقابل جدا شدن"),
                PhrasalVerb("set up", "راه‌اندازی کردن / چیدن",
                    "راه‌اندازی کردن",
                    "We set up the new furniture yesterday.",
                    "دیروز مبلمان جدید رو چیدیم.", "جدا شدنی"),
                PhrasalVerb("check out", "بررسی کردن / تسویه کردن",
                    "بررسی کردن",
                    "Let's check out that new cafe downtown.",
                    "بیا اون کافه جدید مرکز شهر رو امتحان کنیم.", "جدا شدنی")
            ),
            pronunciationTips = listOf(
                PronunciationTip("تلفظ /θ/ و /ð/ در اسم مکان‌ها",
                    "🔊 دو نوع th داریم:\n" +
                    "• /θ/ بی‌صدا: bath, north, south, month\n" +
                    "• /ð/ صدا‌دار: the, this, that, those\n\n" +
                    "💡 تمرین: bath و bathe رو با هم بگو تا تفاوت رو حس کنی."),
                PronunciationTip("استرس در اسم‌های مرکب مکان",
                    "🔊 در اسم‌های مرکب، استرس معمولاً روی کلمه اول است:\n" +
                    "• BATH-room /ˈbæθ.ruːm/\n• BED-room /ˈbed.ruːm/\n" +
                    "• LIV-ing room /ˈlɪv.ɪŋ ruːm/\n• KITCH-en /ˈkɪtʃ.ɪn/\n\n" +
                    "🔸 استثنا: hotel /hoʊˈtel/ (استرس روی هتل)"),
                PronunciationTip("صدای /æ/ در کلمات مکان",
                    "🔊 این صدا در انگلیسی آمریکایی رایجه:\n" +
                    "• park /pɑːrk/ (آمریکا) / /pɑːk/ (بریتانیا)\n" +
                    "• bank /bæŋk/\n• market /ˈmɑːrkɪt/\n" +
                    "• balcony /ˈbælkəni/\n\n" +
                    "💡 در آمریکا a بیشتر به /æ/، در بریتانیا به /ɑː/ تمایل داره.")
            ),
            culturalNotes = listOf(
                CulturalNote("آدرس دادن در آمریکا و بریتانیا",
                    "🌍 در آمریکا معمولاً شماره ساختمان + اسم خیابان:\n" +
                    "• 123 Main Street, Apt 4B\n\n" +
                    "🔸 در بریتانیا گاهی اسم خیابان اول میاد:\n" +
                    "• 10 Downing Street\n\n" +
                    "💡 در آمریکا از ZIP code، در بریتانیا از postcode استفاده می‌شه."),
                CulturalNote("فرهنگ زندگی در آپارتمان",
                    "🌍 در غرب، خیلی از افراد در آپارتمان زندگی می‌کنن:\n" +
                    "• studio apartment = آپارتمان یک‌اتاقه\n" +
                    "• one-bedroom = یک‌خوابه\n" +
                    "• loft = آپارتمان با سقف بلند\n\n" +
                    "💡 در آمریکا، آپارتمان‌ها معمولاً مبله یا غیرمبله اجاره داده می‌شن."),
                CulturalNote("اهمیت پارک‌ها و فضاهای سبز",
                    "🌍 پارک‌ها در فرهنگ غربی نقش مهمی دارن:\n" +
                    "• Central Park در نیویورک = ۳.۴ کیلومتر مربع\n" +
                    "• Hyde Park در لندن = محل سخنرانی‌های آزاد\n" +
                    "• picnic, jogging, walking dog = فعالیت‌های رایج\n\n" +
                    "💡 در غرب، بردن سگ به پارک خیلی رایجه.")
            ),
            grammar = listOf(
                GrammarSection("📌 جمع اسم‌ها (Plural Nouns)",
                    "🔹 قاعده‌های اصلی:\n" +
                    "• +s: book → books, table → tables\n" +
                    "• +es (بعد از s, x, ch, sh, o): box → boxes, watch → watches\n" +
                    "• y → ies (بعد از حرف بی‌صدا): city → cities, baby → babies\n" +
                    "• y → ys (بعد از حرف صدادار): boy → boys, key → keys\n" +
                    "• f/fe → ves: knife → knives, leaf → leaves\n\n" +
                    "🔸 بی‌قاعده:\n" +
                    "• man → men / woman → women / child → children\n" +
                    "• foot → feet / tooth → teeth / mouse → mice\n" +
                    "• sheep → sheep / fish → fish / deer → deer\n\n" +
                    "💡 اسم‌های غیرقابل شمارش (water, milk, information) جمع بسته نمی‌شن."),
                GrammarSection("📌 There is / There are",
                    "🔹 فرمول:\n" +
                    "• There is + مفرد: There is a book on the table.\n" +
                    "• There are + جمع: There are two books.\n\n" +
                    "🔸 سوال:\n" +
                    "• Is there a bank near here?\n" +
                    "• Are there any parks in this area?\n\n" +
                    "🔸 منفی:\n" +
                    "• There isn't a hospital nearby.\n" +
                    "• There aren't any restaurants here.\n\n" +
                    "⚠️ ❌ There is two books. → ✅ There are two books.\n" +
                    "💡 any در سوال و منفی، some در مثبت."),
                GrammarSection("📌 حروف اضافه مکان (Prepositions of Place)",
                    "🔹 رایج‌ترین‌ها:\n" +
                    "• in (داخل): in the room, in the city\n" +
                    "• on (روی): on the table, on the wall\n" +
                    "• under (زیر): under the bed\n" +
                    "• next to (کنار): next to the bank\n" +
                    "• between (بین): between the bank and the park\n" +
                    "• in front of (جلوی): in front of the school\n" +
                    "• behind (پشت): behind the house\n" +
                    "• across from (روبرو): across from the museum\n" +
                    "• near (نزدیک): near the station\n" +
                    "• on the corner (سر خیابان): on the corner of Main and 5th\n\n" +
                    "⚠️ ❌ It's in your right. → ✅ It's on your right."),
                GrammarSection("📌 تفاوت in / on / at برای مکان",
                    "🔹 قاعده‌ها:\n" +
                    "• in + فضای بسته یا شهر/کشور: in the room, in Tehran, in Iran\n" +
                    "• on + سطح: on the table, on the wall, on the street\n" +
                    "• at + نقطه خاص: at the bus stop, at the corner, at home\n\n" +
                    "🔸 مثال‌های کاربردی:\n" +
                    "• I live in Tehran. / I live on Valiasr Street. / I live at 123 Valiasr.\n" +
                    "• He's at the bank. / He's in the bank. (فرق ظریف)\n\n" +
                    "💡 at برای نقطه، in برای فضای بسته، on برای سطح."),
                GrammarSection("📌 حرف تعریف the در مکان‌ها",
                    "🔹 بعضی مکان‌ها حتماً the می‌گیرن:\n" +
                    "• the bank, the hospital, the supermarket, the park\n\n" +
                    "🔸 بعضی مکان‌ها بدون the:\n" +
                    "• home, work, school, church, bed, prison\n" +
                    "• I go to work. / I go to school. / I go home.\n\n" +
                    "⚠️ ❌ I go to the home. → ✅ I go home.\n" +
                    "❌ I go to the work. → ✅ I go to work.\n\n" +
                    "💡 اما با home وقتی صفت اضافه می‌شه، the میاد: I go to the new home."),
                GrammarSection("📌 توصیف مکان با صفات",
                    "🔹 برای توصیف مکان از صفات رایج استفاده کن:\n" +
                    "• crowded / quiet / safe / dangerous\n" +
                    "• modern / old-fashioned / historic\n" +
                    "• clean / dirty / polluted\n" +
                    "• expensive / affordable / cheap\n\n" +
                    "🔸 مثال:\n" +
                    "• It's a quiet, safe neighborhood.\n" +
                    "• The city center is always crowded.\n\n" +
                    "💡 ترتیب صفات: opinion + size + age + origin."),
                GrammarSection("📌 تفاوت house / home / apartment / flat",
                    "🔹 این کلمات با هم اشتباه می‌شن:\n" +
                    "• House = خانه مستقل (ویلایی)\n" +
                    "• Home = مفهوم خانه (جایی که زندگی می‌کنی)\n" +
                    "• Apartment (AmE) = آپارتمان\n" +
                    "• Flat (BrE) = آپارتمان\n\n" +
                    "🔸 مثال:\n" +
                    "• I live in an apartment. (AmE)\n" +
                    "• I live in a flat. (BrE)\n" +
                    "• There's no place like home. (اصطلاح)\n\n" +
                    "💡 home مفهوم عاطفی داره، house فقط ساختمان."),
                GrammarSection("📌 سوال پرسیدن درباره مکان",
                    "🔹 سوالات رایج:\n" +
                    "• Where do you live?\n" +
                    "• What's your neighborhood like?\n" +
                    "• Is there a park near your house?\n" +
                    "• How far is it from here?\n" +
                    "• How do I get to the station?\n\n" +
                    "🔸 جواب‌های رایج:\n" +
                    "• It's about 10 minutes on foot / by car.\n" +
                    "• Go straight and turn left at the traffic light.\n" +
                    "• It's across from the museum.\n\n" +
                    "💡 for direction از imperative (Go, Turn, Take) استفاده کن.")
            ),
            commonMistakes = listOf(
                CommonMistake("There is two books.", "There are two books.", "با جمع از there are استفاده کن."),
                CommonMistake("two childs", "two children", "child جمع بی‌قاعده داره."),
                CommonMistake("two citys", "two cities", "y بعد از حرف بی‌صدا → ies."),
                CommonMistake("I go to the home.", "I go home.", "home بدون the میاد."),
                CommonMistake("I go to the work.", "I go to work.", "work بدون the میاد."),
                CommonMistake("It's in your right.", "It's on your right.", "برای جهت از on استفاده کن."),
                CommonMistake("I live in Valiasr Street.", "I live on Valiasr Street.", "برای اسم خیابان از on استفاده کن."),
                CommonMistake("There is a parks here.", "There is a park here.", "a با اسم مفرد میاد، نه جمع."),
                CommonMistake("I live in the Iran.", "I live in Iran.", "کشورها معمولاً بدون the."),
                CommonMistake("I go to the school.", "I go to school.", "school بدون the میاد."),
                CommonMistake("He is at the home.", "He is at home.", "at home بدون the."),
                CommonMistake("The Tehran is big.", "Tehran is big.", "اسم شهرها بدون the."),
                CommonMistake("There have many parks.", "There are many parks.", "از there are استفاده کن، نه there have."),
                CommonMistake("I live on Tehran.", "I live in Tehran.", "برای شهر از in استفاده کن.")
            ),
            conversation = listOf(
                DialogueLine("David", "Hi Lisa! Where are you from?",
                    "سلام لیزا! اهل کجایی؟"),
                DialogueLine("Lisa", "I'm from Tehran, the capital of Iran. And you?",
                    "من اهل تهرانم، پایتخت ایران. تو چطور؟"),
                DialogueLine("David", "I'm from Manchester, a city in the north of England.",
                    "من اهل منچسترم، شهری در شمال انگلستان."),
                DialogueLine("Lisa", "Oh nice! Is it a big city?",
                    "اوه چه خوب! شهر بزرگیه؟"),
                DialogueLine("David", "It's medium-sized — about 550,000 people. It's very vibrant.",
                    "متوسطه — حدود ۵۵۰ هزار نفر. خیلی پرجنب‌وجوشه."),
                DialogueLine("Lisa", "Sounds interesting! What's the neighborhood like where you live?",
                    "جالب به نظر می‌رسه! محله‌ای که توش زندگی می‌کنی چطوره؟"),
                DialogueLine("David", "It's quite quiet and safe. There are lots of parks and cafes nearby.",
                    "نسبتاً ساکت و امنه. پارک‌ها و کافه‌های زیادی اون اطراف هست."),
                DialogueLine("Lisa", "That's nice. Is there a good transport system?",
                    "چه خوب. سیستم حمل و نقل خوبی داره؟"),
                DialogueLine("David", "Yes, there's a great bus and tram network. I can get around easily.",
                    "بله، شبکه اتوبوس و تراموا عالیه. راحت می‌تونم رفت و آمد کنم."),
                DialogueLine("Lisa", "What about Tehran? What's it like?",
                    "تهران چطور؟ چه جور جاییه؟"),
                DialogueLine("David", "It's huge! Around 9 million people in the city itself. Very crowded but exciting.",
                    "خیلی بزرگه! حدود ۹ میلیون نفر در خود شهر. خیلی شلوغ ولی هیجان‌انگیز."),
                DialogueLine("Lisa", "Wow, that's massive. Is there a metro?",
                    "واو، خیلی بزرگه. مترو داره؟"),
                DialogueLine("David", "Yes, there's a metro with several lines. It's the fastest way to get around.",
                    "بله، مترویی با چند خط داره. سریع‌ترین راه رفت و آمده."),
                DialogueLine("Lisa", "Do you live in an apartment or a house?",
                    "آپارتمان زندگی می‌کنی یا خانه؟"),
                DialogueLine("David", "An apartment on the fifth floor. It has a small balcony with a view.",
                    "آپارتمان در طبقه پنجم. یه بالکن کوچیک با منظره داره."),
                DialogueLine("Lisa", "Sounds lovely! Is there a park near your place?",
                    "قشنگ به نظر می‌رسه! نزدیک خونت پارک هست؟"),
                DialogueLine("David", "Yes, there's a big park just around the corner. I go jogging there every morning.",
                    "بله، یه پارک بزرگ دقیقاً سر کوچه‌ست. هر روز صبح می‌رم اونجا دویدنی."),
                DialogueLine("Lisa", "That's really nice. I wish I had a park near my house!",
                    "واقعاً خوبه. کاش منم نزدیک خونمون پارک داشتم!"),
                DialogueLine("David", "Well, you're welcome to visit anytime and we can go together!",
                    "خب، هر وقت خواستی می‌تونی بیای و با هم بریم!"),
                DialogueLine("Lisa", "That sounds great. I'd love to!",
                    "عالی می‌شه. دوست دارم!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("دیوید اهل کجاست؟",
                    "او اهل منچستر است، شهری در شمال انگلستان."),
                ComprehensionQuestion("منچستر چه ویژگی‌هایی دارد؟",
                    "شهری متوسط (حدود ۵۵۰,۰۰۰ نفر)، پرجنب‌وجوش، ساکت، امن، با پارک‌ها و کافه‌های زیاد."),
                ComprehensionQuestion("تهران چقدر بزرگ است؟",
                    "حدود ۹ میلیون نفر در خود شهر تهران زندگی می‌کنند."),
                ComprehensionQuestion("دیوید در چه نوع خانه‌ای زندگی می‌کند؟",
                    "او در یک آپارتمان در طبقه پنجم با بالکن کوچک و منظره زندگی می‌کند."),
                ComprehensionQuestion("دیوید هر روز صبح چه کار می‌کند؟",
                    "او هر روز صبح در پارک نزدیک خانه‌اش می‌دود (jogging).")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your city or town.",
                    "شهر یا شهرت رو توصیف کن.",
                    "از There is / There are و صفاتی مثل crowded, quiet, modern استفاده کن."),
                SpeakingTask("Talk about your neighborhood.",
                    "درباره محله‌ات صحبت کن.",
                    "از حروف اضافه مکان (near, next to, across from) استفاده کن."),
                SpeakingTask("Describe your dream house.",
                    "خانه رویایی‌ت رو توصیف کن.",
                    "از اتاق‌ها، وسایل و مکان (in the city, near the beach) استفاده کن."),
                SpeakingTask("Give directions to a place near your home.",
                    "مسیر رسیدن به جایی نزدیک خونت رو توضیح بده.",
                    "از Go straight, Turn left/right, It's across from... استفاده کن."),
                SpeakingTask("Compare life in a big city vs a small town.",
                    "زندگی در شهر بزرگ رو با شهر کوچک مقایسه کن.",
                    "از There are more... / It's quieter... استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Describe your home in detail.",
                    "خونت رو با جزئیات توصیف کن.",
                    120,
                    "شامل: نوع خانه، اتاق‌ها، وسایل، محله، چرا دوستش داری"),
                WritingTask("Write about your favorite place in your city.",
                    "درباره مکان مورد علاقه‌ات در شهرت بنویس.",
                    150,
                    "شامل: کجاست، چرا دوستش داری، چه کارهایی می‌تونی بکنی"),
                WritingTask("Write an email inviting a friend to visit your city.",
                    "یک ایمیل بنویس و دوستت رو به دیدن شهرت دعوت کن.",
                    180,
                    "شامل: معرفی شهر، جاهای دیدنی، برنامه پیشنهادی")
            ),
            quiz = listOf(
                QuizQuestion("جمع «book» چیست؟",
                    listOf("bookes", "books", "book", "bookies"), 1),
                QuizQuestion("جمع «child» چیست؟",
                    listOf("childs", "childes", "children", "childrens"), 2),
                QuizQuestion("جمع «city» چیست؟",
                    listOf("citys", "cities", "cityes", "city"), 1),
                QuizQuestion("جمع «man» چیست؟",
                    listOf("mans", "mens", "men", "manes"), 2),
                QuizQuestion("کدام درست است؟",
                    listOf("There is two books.", "There are two books.", "There have two books.", "There has two books."), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I live in Valiasr Street.", "I live on Valiasr Street.", "I live at Valiasr Street.", "I live Valiasr Street."), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I go to the home.", "I go home.", "I go to home.", "I go at home."), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I live in the Iran.", "I live in Iran.", "I live on Iran.", "I live at Iran."), 1),
                QuizQuestion("«زیر میز» کدام است؟",
                    listOf("on the table", "in the table", "under the table", "next to the table"), 2),
                QuizQuestion("«روبروی موزه» کدام است؟",
                    listOf("next to the museum", "across from the museum", "under the museum", "in the museum"), 1),
                QuizQuestion("«سر خیابان» کدام است؟",
                    listOf("in the corner", "on the corner", "at the corner", "under the corner"), 1),
                QuizQuestion("«There ___ a park near my house.»",
                    listOf("are", "is", "have", "has"), 1),
                QuizQuestion("«Are there ___ parks here?»",
                    listOf("some", "any", "a", "the"), 1),
                QuizQuestion("معنی «around the corner» چیست؟",
                    listOf("دور", "نزدیک", "بالا", "پایین"), 1),
                QuizQuestion("تفاوت house و home؟",
                    listOf("هیچ فرقی ندارند", "house ساختمان، home مفهوم عاطفی", "home ساختمان، house مفهوم عاطفی", "house فقط برای اجاره"), 1)
            )
        )