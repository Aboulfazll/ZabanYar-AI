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
        )// ادامه‌ی فایل TopNotchRepository.kt - این بخش را قبل از else در تابع getTopNotch1 اضافه کن.

        4 -> LessonContent("top_notch_1", 4, "Family", "خانواده",
            objectives = listOf(
                "یادگیری ۱۵ اسم اعضای خانواده",
                "استفاده از ساختار مالکیت ('s) در انگلیسی",
                "تفاوت have و has در توصیف خانواده",
                "معرفی اعضای خانواده به دیگران",
                "استفاده از صفات ملکی (my, your, his, her)",
                "صحبت درباره شجره‌نامه (Family Tree)"
            ),
            vocabulary = listOf(
                VocabWord("Father", "پدر", "ˈfɑːðər", "n",
                    "My father works as an engineer at a large company.",
                    "پدرم به عنوان مهندس در یک شرکت بزرگ کار می‌کند.",
                    "a loving father / father figure / father-in-law",
                    "dad, daddy (غیررسمی)", "mother",
                    "father (n) / fatherly (adj) / fatherhood (n)", "neutral",
                    "💡 father-in-law یعنی پدرزن یا پدرشوهر."),
                VocabWord("Mother", "مادر", "ˈmʌðər", "n",
                    "My mother is a teacher and she loves her job.",
                    "مادرم معلم است و عاشق کارش است.",
                    "a single mother / mother tongue / mother-in-law",
                    "mom, mum (غیررسمی)", "father",
                    "mother (n) / motherly (adj) / motherhood (n)", "neutral",
                    "💡 mother tongue یعنی زبان مادری."),
                VocabWord("Brother", "برادر", "ˈbrʌðər", "n",
                    "I have two brothers — one older and one younger.",
                    "من دو برادر دارم — یکی بزرگ‌تر و یکی کوچک‌تر.",
                    "older brother / younger brother / brother-in-law",
                    "sibling (برادر یا خواهر)", "sister",
                    "brother (n) / brotherly (adj) / brotherhood (n)", "neutral",
                    "💡 brother-in-law یعنی برادرزن یا برادرشوهر."),
                VocabWord("Sister", "خواهر", "ˈsɪstər", "n",
                    "My sister is studying medicine at university.",
                    "خواهرم در دانشگاه پزشکی می‌خواند.",
                    "older sister / younger sister / sister-in-law",
                    "sibling", "brother",
                    "sister (n) / sisterly (adj) / sisterhood (n)", "neutral",
                    "💡 sister-in-law یعنی خواهرزن یا خواهرشوهر."),
                VocabWord("Son", "پسر (فرزند مذکر)", "sʌn", "n",
                    "Their son is only five years old.",
                    "پسرشان فقط پنج سالشه.",
                    "the only son / a son of / like father like son",
                    "boy, child", "daughter",
                    "son (n) / sonny (n: خطاب محبت‌آمیز)", "neutral",
                    "💡 son با sun (خورشید) هم‌آواست، ولی معنی متفاوت."),
                VocabWord("Daughter", "دختر (فرزند مؤنث)", "ˈdɔːtər", "n",
                    "His daughter is a talented pianist.",
                    "دخترش پیانیست بااستعدادی است.",
                    "the only daughter / a daughter of / mother-daughter",
                    "girl, child", "son",
                    "daughter (n) / daughterly (adj)", "neutral",
                    "💡 تلفظش /ˈdɔːtər/ (در آمریکا /ˈdɑːtər/)."),
                VocabWord("Grandfather", "پدربزرگ", "ˈɡrænfɑːðər", "n",
                    "My grandfather tells the best stories.",
                    "پدربزرگم بهترین داستان‌ها را تعریف می‌کند.",
                    "maternal grandfather / paternal grandfather",
                    "grandpa, granddad (غیررسمی)", "grandmother",
                    "grandfather (n) / grandparent (n)", "neutral",
                    "💡 maternal = مادری، paternal = پدری."),
                VocabWord("Grandmother", "مادربزرگ", "ˈɡrænmʌðər", "n",
                    "My grandmother makes amazing cookies.",
                    "مادربزرگم کلوچه‌های فوق‌العاده درست می‌کند.",
                    "maternal grandmother / paternal grandmother",
                    "grandma, granny (غیررسمی)", "grandfather",
                    "grandmother (n) / grandparent (n)", "neutral",
                    "💡 grandma در آمریکا رایجه، granny در بریتانیا."),
                VocabWord("Uncle", "عمو / دایی", "ˈʌŋkəl", "n",
                    "My uncle lives in Canada with his family.",
                    "عمویم با خانواده‌اش در کانادا زندگی می‌کند.",
                    "Uncle Sam / uncle-in-law",
                    "aunt's husband", "aunt",
                    "uncle (n) / unclehood (غیررایج)", "neutral",
                    "💡 در انگلیسی، uncle هم عمو هم دایی، هم شوهرخاله/شوهرعمه."),
                VocabWord("Aunt", "عمه / خاله", "ænt", "n",
                    "My aunt is a nurse at a big hospital.",
                    "خاله‌ام پرستار یه بیمارستان بزرگه.",
                    "Aunt + اسم / aunt-in-law",
                    "uncle's wife", "uncle",
                    "aunt (n) / auntie (n: محبت‌آمیز)", "neutral",
                    "💡 تلفظ /ænt/ در آمریکا و /ɑːnt/ در بریتانیا."),
                VocabWord("Cousin", "پسرعمو/دخترعمو/پسرخاله/دخترخاله", "ˈkʌzən", "n",
                    "I have ten cousins — we're a big family!",
                    "من ده تا پسرعمو و دخترعمو دارم — خانواده بزرگی هستیم!",
                    "first cousin / second cousin / distant cousin",
                    "relative, kin", "",
                    "cousin (n) / cousinhood (غیررایج)", "neutral",
                    "💡 cousin در انگلیسی برای هر جنسیت و نسبت عمو/دایی/خاله/عمه یکسانه."),
                VocabWord("Nephew", "برادرزاده / خواهرزاده (مذکر)", "ˈnefjuː", "n",
                    "My nephew just started elementary school.",
                    "برادرزاده‌ام تازه دبستان رو شروع کرده.",
                    "a young nephew / my favorite nephew",
                    "niece's brother", "niece",
                    "nephew (n) / nephew-in-law", "neutral",
                    "💡 تلفظش /ˈnefjuː/ یا /ˈnevjuː/."),
                VocabWord("Niece", "برادرزاده / خواهرزاده (مؤنث)", "niːs", "n",
                    "My niece loves painting and dancing.",
                    "خواهرزاده‌ام عاشق نقاشی و رقصه.",
                    "a young niece / my only niece",
                    "nephew's sister", "nephew",
                    "niece (n) / niece-in-law", "neutral",
                    "💡 niece هم‌آوا با Nice (شهر فرانسه)."),
                VocabWord("Husband", "شوهر", "ˈhʌzbənd", "n",
                    "Her husband is a chef at a fancy restaurant.",
                    "شوهرش سرآشپز یه رستوران شیکه.",
                    "ex-husband / common-law husband",
                    "spouse, partner", "wife",
                    "husband (n) / husbandry (n: کشاورزی)", "neutral",
                    "💡 husband هم اسم، و husbandry یعنی کشاورزی/مدیریت."),
                VocabWord("Wife", "همسر (زن)", "waɪf", "n",
                    "His wife works from home as a translator.",
                    "همسرش از خانه به عنوان مترجم کار می‌کند.",
                    "ex-wife / housewife / wife-to-be",
                    "spouse, partner", "husband",
                    "wife (n) / wifely (adj) / wifey (غیررسمی)", "neutral",
                    "💡 wife جمعش wives هست (f → ves)."),
                VocabWord("In-laws", "خویشاوندان همسر (خانواده همسر)", "ˈɪn lɔːz", "n",
                    "We're visiting my in-laws this weekend.",
                    "این آخر هفته داریم می‌ریم خونه خانواده همسرم.",
                    "mother-in-law / father-in-law / brother-in-law / sister-in-law",
                    "relatives by marriage", "",
                    "in-law (n) / in-laws (جمع)", "neutral",
                    "💡 mother-in-law = مادرزن/مادرشوهر، father-in-law = پدرزن/پدرشوهر.")
            ),
            idioms = listOf(
                IdiomExpression("Like father, like son", "پسر رو از پدرش بشناس",
                    "He's just as stubborn as his dad — like father, like son!",
                    "اونم دقیقاً مثل باباش لجبازه — پسر رو از پدرش بشناس!", "idiom"),
                IdiomExpression("The apple doesn't fall far from the tree", "از پدر و مادر یاد گرفته",
                    "She's a great cook, just like her mom — the apple doesn't fall far from the tree.",
                    "اونم مثل مامانش آشپز خوبیه — از پدر و مادر یاد گرفته.", "idiom"),
                IdiomExpression("Blood is thicker than water", "خون از آب غلیظ‌تره",
                    "In the end, family comes first — blood is thicker than water.",
                    "در نهایت، خانواده اوله — خون از آب غلیظ‌تره.", "idiom"),
                IdiomExpression("Black sheep (of the family)", "گوسفند سیاه (عضو متفاوت خانواده)",
                    "He's the black sheep of the family — he dropped out and became an artist.",
                    "اون گوسفند سیاه خانواده‌ست — ترک تحصیل کرد و هنرمند شد.", "idiom"),
                IdiomExpression("The spitting image of", "دقیقاً شبیه به",
                    "She's the spitting image of her mother.",
                    "اون دقیقاً شبیه مامانشه.", "informal"),
                IdiomExpression("Runs in the family", "ارثی بودن / در خانواده رایج بودن",
                    "Diabetes runs in the family.",
                    "دیابت در خانواده‌شون ارثیه.", "neutral"),
                IdiomExpression("Family ties", "روابط خانوادگی",
                    "Family ties are strong in our culture.",
                    "روابط خانوادگی در فرهنگ ما قویه.", "formal"),
                IdiomExpression("Bring up", "بزرگ کردن بچه",
                    "She was brought up by her grandparents.",
                    "او توسط پدربزرگ و مادربزرگش بزرگ شد.", "neutral"),
                IdiomExpression("Settle down", "سر و سامان گرفتن",
                    "When are you going to settle down and start a family?",
                    "کی می‌خوای سر و سامان بگیری و خانواده تشکیل بدی؟", "neutral"),
                IdiomExpression("A chip off the old block", "کاملاً شبیه پدر یا مادر بودن",
                    "He's a chip off the old block — just like his dad!",
                    "اون کاملاً شبیه باباشه!", "idiom")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("bring up", "بزرگ کردن (بچه) / بزرگ کردن موضوع",
                    "بزرگ کردن بچه",
                    "She was brought up by a single mother.",
                    "او توسط یه مادر مجرد بزرگ شد.", "جدا شدنی"),
                PhrasalVerb("grow up", "بزرگ شدن، بزرگ شدن در جایی",
                    "بزرگ شدن",
                    "I grew up in a small town in Iran.",
                    "من در یه شهر کوچیک در ایران بزرگ شدم.", "غیرقابل جدا شدن"),
                PhrasalVerb("look after", "مراقبت کردن",
                    "مراقبت کردن",
                    "Can you look after the kids tonight?",
                    "می‌تونی امشب از بچه‌ها مراقبت کنی؟", "غیرقابل جدا شدن"),
                PhrasalVerb("take after", "شبیه بودن به",
                    "شبیه بودن به",
                    "She takes after her father in personality.",
                    "او از نظر شخصیتی شبیه پدرشه.", "غیرقابل جدا شدن"),
                PhrasalVerb("get along (with)", "کنار آمدن با",
                    "کنار آمدن با",
                    "Do you get along with your in-laws?",
                    "با خانواده همسرت خوب کنار میای؟", "غیرقابل جدا شدن"),
                PhrasalVerb("look forward to", "بی‌صبرانه منتظر بودن",
                    "بی‌صبرانه منتظر بودن",
                    "I'm looking forward to seeing my family.",
                    "بی‌صبرانه منتظر دیدن خانواده‌ام هستم.", "غیرقابل جدا شدن"),
                PhrasalVerb("name after", "اسم کسی را روی کسی گذاشتن",
                    "اسم گذاشتن",
                    "She was named after her grandmother.",
                    "او به اسم مادربزرگش نام‌گذاری شد.", "جدا شدنی"),
                PhrasalVerb("pass away", "فوت کردن (مؤدبانه)",
                    "فوت کردن",
                    "His grandfather passed away last year.",
                    "پدربزرگش سال گذشته فوت کرد.", "غیرقابل جدا شدن")
            ),
            pronunciationTips = listOf(
                PronunciationTip("تلفظ 's مالکیت",
                    "🔊 's مالکیت سه تلفظ داره:\n" +
                    "• /s/ بعد از صداهای بی‌صدا: cat's /kæts/\n" +
                    "• /z/ بعد از صداهای صدا‌دار: dog's /dɔːɡz/\n" +
                    "• /ɪz/ بعد از s, z, sh, ch: James's /ˈdʒeɪmzɪz/\n\n" +
                    "💡 تمرین: Ali's, Mom's, brother's رو با هم بگو."),
                PronunciationTip("استرس در اسامی خانواده",
                    "🔊 در اسامی مرکب خانوادگی، استرس روی کلمه اول:\n" +
                    "• GRAND-father /ˈɡræn.fɑː.ðər/\n" +
                    "• GRAND-mother /ˈɡræn.mʌð.ər/\n" +
                    "• GRAND-parent /ˈɡræn.peə.rənt/\n\n" +
                    "🔸 در ترکیب‌های with in-law، استرس روی in است:\n" +
                    "• MOTHER-in-law /ˈmʌð.ər.ɪn.lɔː/"),
                PronunciationTip("تفاوت /ʌ/ و /æ/ در اسم‌های خانواده",
                    "🔊 این دو صدا در اسامی خانواده مهم هستن:\n" +
                    "• /ʌ/: uncle /ˈʌŋ.kəl/, husband /ˈhʌz.bənd/\n" +
                    "• /æ/: aunt /ænt/ (آمریکا), granddad /ˈɡræn.dæd/\n\n" +
                    "💡 در بریتانیا aunt رو /ɑːnt/ تلفظ می‌کنن.")
            ),
            culturalNotes = listOf(
                CulturalNote("شجره‌نامه خانوادگی در فرهنگ غرب",
                    "🌍 در غرب، مردم اغلب شجره‌نامه خانوادگی رو حفظ می‌کنن:\n" +
                    "• family tree = شجره‌نامه\n" +
                    "• ancestor = نیاکان\n" +
                    "• descendant = نسل بعد\n\n" +
                    "💡 سایت‌هایی مثل Ancestry.com خیلی رایجن برای کشف ریشه‌ها."),
                CulturalNote("خانواده هسته‌ای vs گسترده",
                    "🌍 در غرب، خانواده هسته‌ای (nuclear family) رایجه:\n" +
                    "• parents + children = nuclear family\n" +
                    "• grandparents + aunts + uncles = extended family\n\n" +
                    "💡 در ایران و خاورمیانه، خانواده گسترده نقش پررنگ‌تری داره."),
                CulturalNote("نام‌گذاری فرزندان",
                    "🌍 در غرب، بچه‌ها معمولاً نام خانوادگی پدر رو می‌گیرن:\n" +
                    "• John Smith + Mary Johnson → their son is Smith\n\n" +
                    "🔸 در بعضی فرهنگ‌ها، نام خانوادگی ترکیبی می‌شه:\n" +
                    "• Smith-Johnson (hyphenated)\n\n" +
                    "💡 در اسپانیا و آمریکای لاتین، بچه‌ها نام خانوادگی هر دو والد رو می‌گیرن.")
            ),
            grammar = listOf(
                GrammarSection("📌 مالکیت با 's",
                    "🔹 فرمول:\n• مفرد: Ali's book / My father's car / Sara's mother\n" +
                    "• جمع (پایان به s): The students' classroom / My parents' house\n" +
                    "• جمع (بدون s): The children's toys / The men's room\n\n" +
                    "🔸 's با اسم‌های اشیا:\n" +
                    "• the car's door / the book's cover (کمتر رایج، بیشتر of استفاده می‌شه)\n" +
                    "• the door of the car / the cover of the book\n\n" +
                    "⚠️ اشتباهات رایج:\n" +
                    "❌ Ali book → ✅ Ali's book\n" +
                    "❌ My parents's house → ✅ My parents' house"),
                GrammarSection("📌 have / has",
                    "🔹 فرمول:\n" +
                    "• I/You/We/They + have: I have two brothers.\n" +
                    "• He/She/It + has: She has one sister.\n\n" +
                    "🔸 سوال:\n" +
                    "• Do you have any siblings?\n" +
                    "• Does she have any children?\n\n" +
                    "🔸 منفی:\n" +
                    "• I don't have any brothers.\n" +
                    "• He doesn't have any sisters.\n\n" +
                    "⚠️ ❌ She have a brother. → ✅ She has a brother."),
                GrammarSection("📌 صفات ملکی (Possessive Adjectives)",
                    "🔹 این صفات قبل از اسم میاد:\n" +
                    "• I → my: my brother\n" +
                    "• You → your: your sister\n" +
                    "• He → his: his father\n" +
                    "• She → her: her mother\n" +
                    "• It → its: its tail\n" +
                    "• We → our: our family\n" +
                    "• They → their: their children\n\n" +
                    "⚠️ اشتباهات:\n" +
                    "❌ its vs it's: its = مالکیت، it's = it is\n" +
                    "❌ their vs there vs they're"),
                GrammarSection("📌 ضمایر ملکی (Possessive Pronouns)",
                    "🔹 این ضمایر جایگزین صفت+اسم می‌شن:\n" +
                    "• my book = mine\n" +
                    "• your car = yours\n" +
                    "• his dog = his\n" +
                    "• her bag = hers\n" +
                    "• our house = ours\n" +
                    "• their children = theirs\n\n" +
                    "💡 مقایسه:\n" +
                    "• This is my book. / This book is mine.\n" +
                    "• That's her car. / That car is hers.\n\n" +
                    "⚠️ ❌ This is mine book. → ✅ This is my book."),
                GrammarSection("📌 خانواده با افعال مختلف",
                    "🔹 برای توصیف خانواده از این فعل‌ها استفاده کن:\n" +
                    "• have (داشتن): I have two siblings.\n" +
                    "• be (بودن): My father is a doctor.\n" +
                    "• look like (شبیه بودن): I look like my mother.\n" +
                    "• take after (شبیه بودن رفتاری): She takes after her dad.\n" +
                    "• get along with (کنار آمدن): I get along with my brother.\n" +
                    "• live with (زندگی کردن با): I live with my parents.\n\n" +
                    "💡 این فعل‌ها برای مکالمه درباره خانواده ضروری هستن."),
                GrammarSection("📌 سوالات درباره خانواده",
                    "🔹 سوالات رایج:\n" +
                    "• Do you have any siblings?\n" +
                    "• How many brothers and sisters do you have?\n" +
                    "• What does your father do?\n" +
                    "• Where do your parents live?\n" +
                    "• Are you the oldest or the youngest?\n" +
                    "• Do you get along with your family?\n\n" +
                    "💡 siblings = برادرها و خواهرها (رسمی، هم برای مرد هم زن)."),
                GrammarSection("📌 تفاوت family / relatives / parents",
                    "🔹 این سه کلمه با هم اشتباه می‌شن:\n" +
                    "• Family = خانواده (هسته‌ای یا گسترده): My family is big.\n" +
                    "• Parents = پدر و مادر: My parents live in Tehran.\n" +
                    "• Relatives = فامیل، اقوام: We have many relatives in Isfahan.\n\n" +
                    "⚠️ ❌ My family are big. → ✅ My family is big. (در آمریکا family مفرده)\n" +
                    "💡 در بریتانیا family می‌تونه جمع هم باشه: My family are coming."),
                GrammarSection("📌 ترتیب سن در خانواده",
                    "🔹 واژه‌های مربوط به ترتیب:\n" +
                    "• the oldest / the eldest (بزرگ‌ترین)\n" +
                    "• the middle child (فرزند وسط)\n" +
                    "• the youngest (کوچک‌ترین)\n" +
                    "• the baby of the family (کوچک‌ترین بچه)\n\n" +
                    "💡 مثال:\n" +
                    "• I'm the oldest of three children.\n" +
                    "• She's the middle child — she often feels ignored.")
            ),
            commonMistakes = listOf(
                CommonMistake("Ali book", "Ali's book", "برای مالکیت از 's استفاده کن."),
                CommonMistake("She have a brother.", "She has a brother.", "برای سوم شخص مفرد has."),
                CommonMistake("My parents's house.", "My parents' house.", "جمع پایانی به s، فقط ' می‌گیره."),
                CommonMistake("I has a sister.", "I have a sister.", "I با have میاد."),
                CommonMistake("This is mine book.", "This is my book.", "mine ضمیره، my صفته."),
                CommonMistake("Their going to the party.", "They're going to the party.", "their مالکیت، they're = they are."),
                CommonMistake("Its a big house.", "It's a big house.", "its مالکیت، it's = it is."),
                CommonMistake("I have 2 brother.", "I have 2 brothers.", "بعد از عدد جمع میاد."),
                CommonMistake("My family are big.", "My family is big.", "در آمریکا family مفرده."),
                CommonMistake("He is a friend of my father's.", "He is a friend of my father. / He is my father's friend.",
                    "ساختار double possessive گیج‌کننده‌ست."),
                CommonMistake("I look like my mother.", "I look like my mother.", "این درسته، فقط یادت باشه look like + اسم."),
                CommonMistake("My father is doctor.", "My father is a doctor.", "قبل از شغل a/an لازمه.")
            ),
            conversation = listOf(
                DialogueLine("A", "Do you have a big family?",
                    "خانواده بزرگی داری؟"),
                DialogueLine("B", "Yes, I do! I have two brothers and one sister.",
                    "بله! دو برادر و یه خواهر دارم."),
                DialogueLine("A", "Wow, that's a lot. Are you the oldest?",
                    "واو، خیلی زیاده. تو بزرگ‌ترین هستی؟"),
                DialogueLine("B", "No, actually I'm the middle child. My older brother is 30, and my sister is 18.",
                    "نه، راستش من فرزند وسطم. برادر بزرگم ۳۰ سالشه، و خواهرم ۱۸."),
                DialogueLine("A", "Interesting! What does your older brother do?",
                    "جالبه! برادر بزرگت چیکار می‌کنه؟"),
                DialogueLine("B", "He's a lawyer. He works at a big firm downtown.",
                    "وکیله. در یه شرکت بزرگ مرکز شهر کار می‌کنه."),
                DialogueLine("A", "And what about your sister?",
                    "خواهرت چطور؟"),
                DialogueLine("B", "She's still a student. She's studying medicine at university.",
                    "هنوز دانش‌آموزه. داره در دانشگاه پزشکی می‌خونه."),
                DialogueLine("A", "That's impressive! Do you all live together?",
                    "تحسین‌برانگیزه! همه با هم زندگی می‌کنید؟"),
                DialogueLine("B", "No, my brother moved out last year. He lives with his wife now.",
                    "نه، برادرم سال پیش اسباب‌کشی کرد. الان با زنش زندگی می‌کنه."),
                DialogueLine("A", "Do you get along well with your siblings?",
                    "با خواهر و برادرات خوب کنار میای؟"),
                DialogueLine("B", "Mostly yes. We argue sometimes, but we're very close.",
                    "بیشتر وقت‌ها بله. گاهی بحث می‌کنیم، ولی خیلی صمیمی هستیم."),
                DialogueLine("A", "That's nice. What about your parents?",
                    "چه خوب. والدینت چطور؟"),
                DialogueLine("B", "My father is a retired engineer, and my mother is a teacher.",
                    "پدرم مهندس بازنشسته‌ست، و مادرم معلمه."),
                DialogueLine("A", "What about your grandparents?",
                    "پدربزرگ و مادربزرگت چطور؟"),
                DialogueLine("B", "My grandmother lives with us. She's amazing — she tells the best stories.",
                    "مادربزرگم با ما زندگی می‌کنه. فوق‌العاده‌ست — بهترین داستان‌ها رو تعریف می‌کنه."),
                DialogueLine("A", "That sounds wonderful! Do you look like her?",
                    "چه عالی! شبیه اون هستی؟"),
                DialogueLine("B", "Everyone says I take after my mother, but I think I look like my grandmother!",
                    "همه می‌گن شبیه مادرمم، ولی فکر می‌کنم شبیه مادربزرگمم!"),
                DialogueLine("A", "Well, either way, you come from a great family!",
                    "خب، در هر صورت، از خانواده خوبی اومدی!"),
                DialogueLine("B", "Thanks! Family is everything to me.",
                    "ممنون! خانواده برای من همه چیزه.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("راوی چند برادر و خواهر دارد؟",
                    "دو برادر و یک خواهر دارد."),
                ComprehensionQuestion("راوی فرزند چندم خانواده است؟",
                    "راوی فرزند وسطی است (middle child)."),
                ComprehensionQuestion("برادر بزرگ راوی چه شغلی دارد؟",
                    "او وکیل است و در یک شرکت بزرگ مرکز شهر کار می‌کند."),
                ComprehensionQuestion("خواهر راوی چه می‌خواند؟",
                    "او در دانشگاه پزشکی می‌خواند."),
                ComprehensionQuestion("راوی شبیه چه کسی است؟",
                    "همه می‌گویند شبیه مادرش است، ولی خودش فکر می‌کند شبیه مادربزرگش است.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your family.",
                    "خانواده‌ات رو توصیف کن.",
                    "از have/has، تعداد اعضا، شغل‌ها استفاده کن."),
                SpeakingTask("Talk about your siblings.",
                    "درباره خواهر و برادرات صحبت کن.",
                    "از older/younger brother/sister و ترتیب سنی استفاده کن."),
                SpeakingTask("Describe a family member you look like.",
                    "یکی از اعضای خانواده که شبیهش هستی رو توصیف کن.",
                    "از look like / take after استفاده کن."),
                SpeakingTask("Talk about your grandparents.",
                    "درباره پدربزرگ و مادربزرگت صحبت کن.",
                    "از live with / tell stories استفاده کن."),
                SpeakingTask("Compare your family with a friend's family.",
                    "خانواده‌ات رو با خانواده یه دوست مقایسه کن.",
                    "از bigger than, smaller than, more... استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Write about your family members.",
                    "درباره اعضای خانواده‌ات بنویس.",
                    120,
                    "شامل: تعداد، شغل‌ها، ویژگی‌های شخصیتی"),
                WritingTask("Write a paragraph about your favorite family member.",
                    "یک پاراگراف درباره عضو مورد علاقه‌ات در خانواده بنویس.",
                    150,
                    "شامل: چه کسی، چرا، چه ویژگی‌هایی داره"),
                WritingTask("Describe your family tree.",
                    "شجره‌نامه‌ات رو توصیف کن.",
                    180,
                    "شامل: پدربزرگ، مادربزرگ، والدین، خواهر و برادر")
            ),
            quiz = listOf(
                QuizQuestion("کدام درست است؟",
                    listOf("Ali book", "Ali's book", "Alis book", "Book Ali"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("She have a brother.", "She has a brother.", "She haves a brother.", "She having a brother."), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I has a sister.", "I have a sister.", "I having a sister.", "I haves a sister."), 1),
                QuizQuestion("جمع «child» چیست؟",
                    listOf("childs", "childes", "children", "childrens"), 2),
                QuizQuestion("«The students' classroom» یعنی؟",
                    listOf("کلاس یک دانش‌آموز", "کلاس دانش‌آموزان", "دانش‌آموز کلاس", "معلم کلاس"), 1),
                QuizQuestion("معنی «Uncle» چیست؟",
                    listOf("عمو/دایی", "عمه/خاله", "پدربزرگ", "پسرعمو"), 0),
                QuizQuestion("معنی «Wife» چیست؟",
                    listOf("شوهر", "همسر (زن)", "خواهر", "مادر"), 1),
                QuizQuestion("«خواهرزاده (مؤنث)» به انگلیسی؟",
                    listOf("nephew", "niece", "cousin", "aunt"), 1),
                QuizQuestion("تفاوت their و they're؟",
                    listOf("هیچ فرقی ندارند", "their مالکیت، they're = they are", "they're مالکیت، their = they are", "هر دو یکسان"), 1),
                QuizQuestion("«پدرزن / پدرشوهر» به انگلیسی؟",
                    listOf("father", "father-in-law", "stepfather", "grandfather"), 1),
                QuizQuestion("کدام جمله درست است؟",
                    listOf("Its a big house.", "It's a big house.", "Its' a big house.", "It is a big house its."), 1),
                QuizQuestion("«همسر خانواده» یعنی چه کسی؟",
                    listOf("خانواده همسر", "خانواده پدری", "خانواده مادری", "خانواده خودی"), 0),
                QuizQuestion("«She takes after her dad» یعنی؟",
                    listOf("از پدرش مراقبت می‌کنه", "شبیه پدرشه", "با پدرش راه می‌ره", "پدرش رو ترک کرده"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("My family are big.", "My family is big.", "My family have big.", "My family be big."), 1),
                QuizQuestion("«Blood is thicker than water» یعنی؟",
                    listOf("خون از آب غلیظ‌تره", "خون رقیقه", "خانواده مهم نیست", "دوستان مهم‌ترن"), 0)
            )
        )// ادامه‌ی فایل TopNotchRepository.kt - این بخش را قبل از else در تابع getTopNotch1 اضافه کن.

        5 -> LessonContent("top_notch_1", 5, "Events and Times", "رویدادها و زمان‌ها",
            objectives = listOf(
                "یادگیری واژگان مربوط به زمان و تاریخ",
                "استفاده صحیح از حروف اضافه زمان (at, on, in)",
                "بیان ساعت و تاریخ به انگلیسی",
                "صحبت درباره برنامه‌های روزانه و هفتگی",
                "پرسیدن و گفتن زمان رویدادها",
                "استفاده از قیود زمان (today, tomorrow, yesterday)"
            ),
            vocabulary = listOf(
                VocabWord("Today", "امروز", "təˈdeɪ", "adv",
                    "I have three meetings today.",
                    "امروز سه جلسه دارم.",
                    "today's news / later today / earlier today",
                    "this day", "yesterday, tomorrow",
                    "today (adv/n)", "neutral",
                    "💡 today هم قید هم اسم: Today is Monday."),
                VocabWord("Tomorrow", "فردا", "təˈmɑːroʊ", "adv",
                    "We're having a party tomorrow evening.",
                    "فردا شب مهمونی داریم.",
                    "tomorrow morning / the day after tomorrow",
                    "the next day", "yesterday, today",
                    "tomorrow (adv/n)", "neutral",
                    "💡 the day after tomorrow یعنی پس‌فردا."),
                VocabWord("Yesterday", "دیروز", "ˈjestərdeɪ", "adv",
                    "I saw her yesterday at the coffee shop.",
                    "دیروز توی کافه دیدمش.",
                    "yesterday morning / the day before yesterday",
                    "the previous day", "today, tomorrow",
                    "yesterday (adv/n)", "neutral",
                    "💡 the day before yesterday یعنی پریروز."),
                VocabWord("Morning", "صبح", "ˈmɔːrnɪŋ", "n",
                    "I usually go for a run in the morning.",
                    "من معمولاً صبح‌ها می‌رم دویدنی.",
                    "early morning / good morning / in the morning",
                    "dawn (سپیده‌دم)", "afternoon, evening",
                    "morning (n) / mornings (adv: صبح‌ها)", "neutral",
                    "💡 in the morning (نه at the morning)."),
                VocabWord("Afternoon", "بعدازظهر", "ˌæftərˈnuːn", "n",
                    "Let's meet for coffee this afternoon.",
                    "بیا این بعدازظهر برای قهوه ببینیم.",
                    "early afternoon / late afternoon / in the afternoon",
                    "midday, noon", "morning, evening",
                    "afternoon (n) / afternoons (adv)", "neutral",
                    "💡 afternoon از ۱۲ تا ۵ عصر رو شامل می‌شه."),
                VocabWord("Evening", "عصر / شب (اول شب)", "ˈiːvnɪŋ", "n",
                    "We usually watch TV in the evening.",
                    "ما معمولاً عصرها تلویزیون تماشا می‌کنیم.",
                    "good evening / in the evening / evening class",
                    "night, dusk", "morning, afternoon",
                    "evening (n) / evenings (adv)", "neutral",
                    "💡 evening از عصر تا قبل خوابه، night زمان خوابه."),
                VocabWord("Night", "شب", "naɪt", "n",
                    "I can't sleep well at night.",
                    "شب‌ها خوب نمی‌تونم بخوابم.",
                    "at night / good night / late at night",
                    "evening, midnight", "day, morning",
                    "night (n) / nightly (adj/adv)", "neutral",
                    "💡 at night (نه in the night)."),
                VocabWord("Week", "هفته", "wiːk", "n",
                    "I have three exams next week.",
                    "هفته بعد سه تا امتحان دارم.",
                    "last week / next week / every week",
                    "seven days", "",
                    "week (n) / weekly (adj) / weekend (n)", "neutral",
                    "💡 on weekdays (روزهای کاری) / on the weekend (آخر هفته)."),
                VocabWord("Month", "ماه", "mʌnθ", "n",
                    "We moved here two months ago.",
                    "دو ماه پیش اومدیم اینجا.",
                    "last month / next month / every month",
                    "four weeks", "",
                    "month (n) / monthly (adj/adv)", "neutral",
                    "💡 تلفظش /mʌnθ/ با th بی‌صدا."),
                VocabWord("Year", "سال", "jɪr", "n",
                    "I've been learning English for three years.",
                    "سه ساله دارم انگلیسی یاد می‌گیرم.",
                    "last year / next year / every year",
                    "twelve months", "",
                    "year (n) / yearly (adj) / yearlong (adj)", "neutral",
                    "💡 Happy New Year! / year-round (در تمام سال)."),
                VocabWord("Hour", "ساعت (واحد زمان)", "ˈaʊər", "n",
                    "The meeting lasted about two hours.",
                    "جلسه حدود دو ساعت طول کشید.",
                    "an hour ago / a half hour / rush hour",
                    "60 minutes", "minute",
                    "hour (n) / hourly (adj/adv)", "neutral",
                    "💡 an hour (h سایلنته). فرق داره با o'clock که ساعتِ زمانه."),
                VocabWord("Minute", "دقیقه", "ˈmɪnɪt", "n",
                    "I'll be there in five minutes.",
                    "پنج دقیقه دیگه اونجا هستم.",
                    "a minute ago / just a minute / in a minute",
                    "60 seconds", "hour",
                    "minute (n) / minutes (جمع)", "neutral",
                    "💡 just a minute = یه لحظه صبر کن."),
                VocabWord("Weekend", "آخر هفته", "ˈwiːkend", "n",
                    "What are you doing this weekend?",
                    "این آخر هفته چیکار می‌کنی؟",
                    "on the weekend / long weekend / weekend trip",
                    "Saturday-Sunday", "weekday",
                    "weekend (n) / weekender (n)", "neutral",
                    "💡 در آمریکا on the weekend، در بریتانیا at the weekend."),
                VocabWord("Date", "تاریخ / قرار", "deɪt", "n",
                    "What's the date today?",
                    "امروز چندمه؟",
                    "set a date / a blind date / up to date",
                    "appointment, day", "",
                    "date (n/v) / dated (adj)", "neutral",
                    "💡 date هم تاریخ، هم قرار ملاقات عاشقانه."),
                VocabWord("Calendar", "تقویم", "ˈkælɪndər", "n",
                    "I marked the meeting on my calendar.",
                    "جلسه رو روی تقویمم علامت زدم.",
                    "mark on the calendar / a wall calendar",
                    "schedule, planner", "",
                    "calendar (n) / calendrical (adj)", "neutral",
                    "💡 تلفظش /ˈkælɪndər/، نه /ˈkæləndər/.")
            ),
            idioms = listOf(
                IdiomExpression("In the nick of time", "درست سر وقت / آخرین لحظه",
                    "We arrived at the airport in the nick of time.",
                    "درست سر وقت به فرودگاه رسیدیم.", "idiom"),
                IdiomExpression("Around the clock", "شبانه‌روزی",
                    "The team worked around the clock to finish the project.",
                    "تیم شبانه‌روزی کار کرد تا پروژه رو تموم کنه.", "neutral"),
                IdiomExpression("Once in a blue moon", "خیلی به ندرت",
                    "I eat fast food once in a blue moon.",
                    "من خیلی به ندرت فست‌فود می‌خورم.", "idiom"),
                IdiomExpression("Beat the clock", "قبل از تموم شدن وقت انجام دادن",
                    "We managed to beat the clock and submit on time.",
                    "موفق شدیم قبل از تموم شدن وقت تحویل بدیم.", "idiom"),
                IdiomExpression("Time flies", "زمان زود می‌گذره",
                    "Time flies when you're having fun.",
                    "وقتی خوش می‌گذرونی، زمان زود می‌گذره.", "idiom"),
                IdiomExpression("Kill time", "وقت کشتن",
                    "We walked around the mall to kill time.",
                    "توی پاساژ قدم زدیم تا وقت بکشیم.", "informal"),
                IdiomExpression("On time vs In time", "سر وقت vs قبل از موعد",
                    "The train arrived on time. / We got there just in time.",
                    "قطار سر وقت رسید. / درست قبل از موعد رسیدیم.", "neutral"),
                IdiomExpression("Better late than never", "دیر رسیدن بهتر از هرگز نرسیدن",
                    "You finally came! Well, better late than never.",
                    "بالاخره اومدی! خب، دیر رسیدن بهتر از هرگز نرسیدنه.", "idiom"),
                IdiomExpression("The other day", "چند روز پیش",
                    "I ran into him the other day at the market.",
                    "چند روز پیش توی بازار تصادفاً دیدمش.", "informal"),
                IdiomExpression("From time to time", "هر چند وقت یه بار",
                    "We meet up from time to time.",
                    "هر چند وقت یه بار همدیگه رو می‌بینیم.", "neutral")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("show up", "سر و کله پیدا کردن / حاضر شدن",
                    "حاضر شدن",
                    "He showed up late to the meeting.",
                    "او دیر به جلسه رسید.", "غیرقابل جدا شدن"),
                PhrasalVerb("put off", "به تعویق انداختن",
                    "به تعویق انداختن",
                    "Let's put off the meeting until next week.",
                    "بیا جلسه رو به هفته بعد موکول کنیم.", "جدا شدنی"),
                PhrasalVerb("turn up", "سر و کله پیدا کردن / زیاد کردن صدا",
                    "سر و کله پیدا کردن",
                    "Guess who turned up at the party?",
                    "حدس بزن کی اومد به مهمونی؟", "غیرقابل جدا شدن"),
                PhrasalVerb("set up", "تنظیم کردن / چیدن",
                    "تنظیم کردن",
                    "We set up the meeting for 3 PM.",
                    "جلسه رو برای ۳ بعدازظهر تنظیم کردیم.", "جدا شدنی"),
                PhrasalVerb("hold on", "صبر کردن",
                    "صبر کردن",
                    "Hold on a moment — I'll check the schedule.",
                    "یه لحظه صبر کن — برنامه رو چک می‌کنم.", "غیرقابل جدا شدن"),
                PhrasalVerb("go on", "ادامه دادن / اتفاق افتادن",
                    "ادامه دادن",
                    "What's going on here?",
                    "اینجا چه خبره؟", "غیرقابل جدا شدن"),
                PhrasalVerb("catch up (on)", "رسیدن به / جبران کردن",
                    "رسیدن به",
                    "I need to catch up on my work.",
                    "باید به کارهام برسم.", "غیرقابل جدا شدن"),
                PhrasalVerb("run out of", "تمام کردن",
                    "تمام شدن",
                    "We ran out of time during the exam.",
                    "توی امتحان وقت‌مون تموم شد.", "غیرقابل جدا شدن")
            ),
            pronunciationTips = listOf(
                PronunciationTip("تلفظ at, on, in در گفتار سریع",
                    "🔊 در گفتار سریع، این حروف ضعیف تلفظ می‌شن:\n" +
                    "• at → /ət/: at 5 → /ət faɪv/\n" +
                    "• on → /ən/: on Monday → /ən ˈmʌn.deɪ/\n" +
                    "• in → /ɪn/ (اما سریع‌تر): in the morning → /ɪn ðə ˈmɔːr.nɪŋ/\n\n" +
                    "💡 ولی وقتی تأکید می‌کنی، واضح تلفظ می‌شن."),
                PronunciationTip("استرس در واژه‌های زمان",
                    "🔊 استرس در واژه‌های زمان:\n" +
                    "• toDAY /təˈdeɪ/ (استرس روی آخر)\n" +
                    "• toMORrow /təˈmɑː.roʊ/ (استرس روی وسط)\n" +
                    "• YESterday /ˈjes.tər.deɪ/ (استرس روی اول)\n" +
                    "• AFTERnoon /ˌæf.tərˈnuːn/ (استرس روی noon)\n\n" +
                    "💡 دقت کن! این واژه‌ها الگوی استرس متفاوتی دارن."),
                PronunciationTip("تلفظ ساعت‌ها",
                    "🔊 روش‌های گفتن ساعت:\n" +
                    "• 3:00 → three o'clock /θriː əˈklɑːk/\n" +
                    "• 3:15 → three fifteen / a quarter past three\n" +
                    "• 3:30 → three thirty / half past three\n" +
                    "• 3:45 → three forty-five / a quarter to four\n\n" +
                    "💡 در آمریکا معمولاً مستقیم می‌گن (three fifteen)، در بریتانیا از past/to استفاده می‌کنن.")
            ),
            culturalNotes = listOf(
                CulturalNote("ساعت رسمی vs غیررسمی در آمریکا و اروپا",
                    "🌍 در آمریکا و بریتانیا معمولاً از ۱۲ ساعته استفاده می‌شه:\n" +
                    "• 3 PM / 3 in the afternoon\n" +
                    "• 9 AM / 9 in the morning\n\n" +
                    "🔸 در اروپا و ارتش، از ۲۴ ساعته استفاده می‌شه:\n" +
                    "• 15:00 (پانزده)\n" +
                    "• 21:30 (بیست و یک و نیم)\n\n" +
                    "💡 AM = قبل از ظهر، PM = بعد از ظهر."),
                CulturalNote("نظم زمانی در فرهنگ غربی",
                    "🌍 در فرهنگ غربی، وقت‌شناسی خیلی مهمه:\n" +
                    "• on time = سر وقت (انتظار می‌ره)\n" +
                    "• 5 minutes late = قابل قبول در برخی موارد\n" +
                    "• 15+ minutes late = بی‌ادبی\n\n" +
                    "💡 در بعضی فرهنگ‌ها (مثل آمریکای لاتین و خاورمیانه) انعطاف بیشتری هست."),
                CulturalNote("پنج‌شنبه شب vs آخر هفته",
                    "🌍 در غرب، پنجشنبه شب (Thursday night) شروع غیررسمی آخر هفته‌ست:\n" +
                    "• Thursday night out\n" +
                    "• Friday = last day of work\n" +
                    "• Saturday & Sunday = weekend\n\n" +
                    "💡 در ایران پنجشنبه و جمعه آخر هفته‌ست.")
            ),
            grammar = listOf(
                GrammarSection("📌 حروف اضافه زمان (at, on, in) - پایه",
                    "🔹 قاعده طلایی:\n" +
                    "• at + ساعت: at 7 AM, at 3 PM, at noon, at midnight\n" +
                    "• on + روز/تاریخ: on Monday, on July 5th, on my birthday\n" +
                    "• in + ماه/سال/فصل: in May, in 2024, in summer, in the morning\n\n" +
                    "⚠️ اشتباهات رایج:\n" +
                    "❌ in Monday → ✅ on Monday\n" +
                    "❌ at the morning → ✅ in the morning\n" +
                    "❌ on 2024 → ✅ in 2024\n" +
                    "❌ at night → ✅ at night (این استثناست!)"),
                GrammarSection("📌 at / on / in - سطح پیشرفته",
                    "🔹 استثناها و نکات ظریف:\n" +
                    "• at night (نه in the night)\n" +
                    "• at noon / at midnight\n" +
                    "• at Christmas / at Easter (مناسبت‌ها)\n" +
                    "• on Christmas Day (روز مشخص)\n" +
                    "• in the morning/afternoon/evening\n\n" +
                    "🔸 تفاوت on the weekend (AmE) و at the weekend (BrE):\n" +
                    "• I'll see you on the weekend. (آمریکا)\n" +
                    "• I'll see you at the weekend. (بریتانیا)\n\n" +
                    "💡 قاعده: at برای زمان دقیق، on برای روز، in برای بازه‌های طولانی‌تر."),
                GrammarSection("📌 زمان‌های روز",
                    "🔹 ترتیب زمانی:\n" +
                    "• dawn / sunrise (سپیده‌دم / طلوع)\n" +
                    "• morning (صبح)\n" +
                    "• noon / midday (ظهر)\n" +
                    "• afternoon (بعدازظهر)\n" +
                    "• evening (عصر)\n" +
                    "• dusk / sunset (غروب)\n" +
                    "• night (شب)\n" +
                    "• midnight (نصف‌شب)\n\n" +
                    "💡 at dawn, in the morning, at noon, in the afternoon, in the evening, at dusk, at night."),
                GrammarSection("📌 قیدهای زمان (Adverbs of Time)",
                    "🔹 این قیدها زمان فعل رو مشخص می‌کنن:\n" +
                    "• Definite: today, tomorrow, yesterday, last week, next month\n" +
                    "• Frequency: always, usually, often, sometimes, rarely, never\n" +
                    "• Duration: for two hours, since 2020, all day\n\n" +
                    "🔸 جای قید:\n" +
                    "• بعد از فعل be: I am always happy.\n" +
                    "• قبل از فعل اصلی: I always go to work at 8.\n" +
                    "• ابتدا یا انتهای جمله: Yesterday, I went to the park.\n\n" +
                    "💡 Frequency adverbs قبل از فعل اصلی، بعد از be."),
                GrammarSection("📌 Present Continuous برای برنامه‌های آینده",
                    "🔹 برای قرار ملاقات و برنامه‌های قطعی از Present Continuous استفاده کن:\n" +
                    "• I'm meeting Sara tomorrow at 5.\n" +
                    "• We're having dinner tonight.\n" +
                    "• She's flying to London next week.\n\n" +
                    "🔸 تفاوت با Present Simple:\n" +
                    "• Present Simple = عادت: I go to work at 8 every day.\n" +
                    "• Present Continuous = ترتیب آینده: I'm going to work at 8 tomorrow.\n\n" +
                    "💡 این ساختار برای برنامه‌های قطعی و رزرو شده استفاده می‌شه."),
                GrammarSection("📌 گفتن ساعت (Telling Time)",
                    "🔹 روش‌ها:\n" +
                    "• 3:00 → three o'clock\n" +
                    "• 3:05 → three oh five / five past three\n" +
                    "• 3:15 → three fifteen / a quarter past three\n" +
                    "• 3:30 → three thirty / half past three\n" +
                    "• 3:45 → three forty-five / a quarter to four\n" +
                    "• 3:50 → three fifty / ten to four\n\n" +
                    "🔸 سوال کردن:\n" +
                    "• What time is it? / What's the time?\n" +
                    "• Do you have the time?\n\n" +
                    "💡 در آمریکا اعداد مستقیم رایج‌تره، در بریتانیا past/to."),
                GrammarSection("📌 گفتن تاریخ",
                    "🔹 روش‌های گفتن تاریخ:\n" +
                    "• July 5, 2024 → July fifth, twenty twenty-four\n" +
                    "• 5th July 2024 → the fifth of July, twenty twenty-four\n" +
                    "• 2024 → twenty twenty-four (رایج) / two thousand twenty-four (رسمی)\n\n" +
                    "🔸 نوشتن تاریخ:\n" +
                    "• AmE: Month Day, Year → July 5, 2024\n" +
                    "• BrE: Day Month Year → 5 July 2024\n\n" +
                    "💡 سوال: What's the date today? / What day is it today?"),
                GrammarSection("📌 زمان‌های گذشته و آینده",
                    "🔹 برای اشاره به گذشته و آینده:\n" +
                    "• last night / last week / last month / last year\n" +
                    "• next week / next month / next year\n" +
                    "• the day before yesterday (پریروز)\n" +
                    "• the day after tomorrow (پس‌فردا)\n" +
                    "• two days ago\n" +
                    "• in two weeks\n\n" +
                    "⚠️ ago فقط با گذشته ساده:\n" +
                    "❌ I have seen him two days ago. → ✅ I saw him two days ago.\n" +
                    "💡 ago با گذشته ساده، in با آینده.")
            ),
            commonMistakes = listOf(
                CommonMistake("in Monday", "on Monday", "برای روزها از on استفاده کن."),
                CommonMistake("at the morning", "in the morning", "برای صبح از in the morning."),
                CommonMistake("on 2024", "in 2024", "برای سال از in استفاده کن."),
                CommonMistake("in night", "at night", "at night استثناست."),
                CommonMistake("I have seen him two days ago.", "I saw him two days ago.", "ago با گذشته ساده میاد."),
                CommonMistake("at next week", "next week", "next week بدون حرف اضافه."),
                CommonMistake("in last year", "last year", "last year بدون حرف اضافه."),
                CommonMistake("I am born in 1990.", "I was born in 1990.", "برای تولد از گذشته استفاده کن."),
                CommonMistake("on the morning", "in the morning", "برای صبح in the morning."),
                CommonMistake("at weekend", "on/at the weekend", "حرف تعریف the لازمه."),
                CommonMistake("two hours ago in", "in two hours", "in + مدت = آینده."),
                CommonMistake("What time is it now?", "What time is it?", "now اضافی است (خودش مفهوم زمان حال داره).")
            ),
            conversation = listOf(
                DialogueLine("A", "Hey, do you have a minute? I wanted to ask about the meeting.",
                    "هی، یه دقیقه وقت داری؟ می‌خواستم درباره جلسه بپرسم."),
                DialogueLine("B", "Sure, what's up?",
                    "حتماً، چی شده؟"),
                DialogueLine("A", "When is it exactly?",
                    "دقیقاً کِیه؟"),
                DialogueLine("B", "It's at 3 PM on Tuesday.",
                    "ساعت ۳ بعدازظهر سه‌شنبه."),
                DialogueLine("A", "And where?",
                    "و کجا؟"),
                DialogueLine("B", "In the main conference room, on the second floor.",
                    "در اتاق کنفرانس اصلی، طبقه دوم."),
                DialogueLine("A", "How long will it take?",
                    "چقدر طول می‌کشه؟"),
                DialogueLine("B", "About an hour, I think. Maybe a bit more.",
                    "حدود یه ساعت، فکر کنم. شاید یه کم بیشتر."),
                DialogueLine("A", "Do I need to prepare anything?",
                    "باید چیزی آماده کنم؟"),
                DialogueLine("B", "Yes, please bring your monthly report.",
                    "بله، لطفاً گزارش ماهانه‌ات رو بیار."),
                DialogueLine("A", "Got it. Should I come earlier?",
                    "فهمیدم. باید زودتر بیام؟"),
                DialogueLine("B", "No, 5 minutes early is enough. Don't be late though — the boss hates that.",
                    "نه، ۵ دقیقه زودتر کافیه. ولی دیر نکن — رئیس از این کار بدم میاد."),
                DialogueLine("A", "Understood. Anything else?",
                    "فهمیدم. چیز دیگه‌ای هست؟"),
                DialogueLine("B", "Actually, yes. Are you free this evening for a quick chat?",
                    "راستش، بله. این عصر برای یه گپ کوتاه آزادی؟"),
                DialogueLine("A", "Hmm, I have a class until 6, but I'm free after that.",
                    "هوم، تا ۶ کلاس دارم، ولی بعدش آزادم."),
                DialogueLine("B", "Perfect. Let's meet at the coffee shop at 6:30.",
                    "عالی. بیا ساعت ۶:۳۰ توی کافه ببینیم."),
                DialogueLine("A", "Sounds good. See you then!",
                    "خوبه. پس می‌بینمت!"),
                DialogueLine("B", "By the way, what day is it today?",
                    "راستی، امروز چندمه؟"),
                DialogueLine("A", "It's Wednesday, the 15th.",
                    "چهارشنبه، پانزدهم."),
                DialogueLine("B", "Thanks! See you at 6:30.",
                    "ممنون! ساعت ۶:۳۰ می‌بینمت."),
                DialogueLine("A", "See you! Don't be late.",
                    "می‌بینمت! دیر نکن.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("جلسه چه روز و ساعتی است؟",
                    "سه‌شنبه ساعت ۳ بعدازظهر."),
                ComprehensionQuestion("جلسه کجاست؟",
                    "در اتاق کنفرانس اصلی، طبقه دوم."),
                ComprehensionQuestion("جلسه چقدر طول می‌کشد؟",
                    "حدود یک ساعت، شاید کمی بیشتر."),
                ComprehensionQuestion("چرا نباید دیر رسید؟",
                    "چون رئیس از دیر رسیدن بدش می‌آید."),
                ComprehensionQuestion("قرار ملاقات بعدی چه ساعتی است؟",
                    "ساعت ۶:۳۰ عصر در کافه.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your daily routine.",
                    "برنامه روزانه‌ات رو توصیف کن.",
                    "از at, in the morning, every day استفاده کن."),
                SpeakingTask("Talk about your plans for next week.",
                    "درباره برنامه‌های هفته بعدت صحبت کن.",
                    "از Present Continuous برای ترتیب آینده استفاده کن."),
                SpeakingTask("Ask a friend about their schedule.",
                    "از یه دوست درباره برنامه‌اش بپرس.",
                    "از What time...? When...? How long...? استفاده کن."),
                SpeakingTask("Describe your favorite time of day.",
                    "زمان مورد علاقه‌ات در روز رو توصیف کن.",
                    "از in the morning / at night / in the evening استفاده کن."),
                SpeakingTask("Make an appointment with someone.",
                    "با کسی قرار بذار.",
                    "از Are you free...? Let's meet at... استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Write about your typical day.",
                    "درباره یه روز معمولی‌ت بنویس.",
                    120,
                    "شامل: ساعت بیدار شدن، کارها، زمان‌ها"),
                WritingTask("Write an email to schedule a meeting.",
                    "یک ایمیل بنویس و برای جلسه قرار بذار.",
                    150,
                    "شامل: زمان پیشنهادی، مکان، مدت زمان"),
                WritingTask("Describe your weekly schedule.",
                    "برنامه هفتگی‌ت رو توصیف کن.",
                    180,
                    "شامل: روزها، فعالیت‌ها، زمان‌ها")
            ),
            quiz = listOf(
                QuizQuestion("کدام درست است؟",
                    listOf("in Monday", "on Monday", "at Monday", "Monday in"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("at the morning", "in the morning", "on the morning", "the morning"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("on 2024", "at 2024", "in 2024", "2024 in"), 2),
                QuizQuestion("«at» با کدام می‌آید؟",
                    listOf("Monday", "May", "7 PM", "2024"), 2),
                QuizQuestion("«in» با کدام می‌آید؟",
                    listOf("noon", "May", "Monday", "midnight"), 1),
                QuizQuestion("کدام استثناست؟",
                    listOf("in the morning", "at night", "in the afternoon", "in the evening"), 1),
                QuizQuestion("«دیروز» به انگلیسی؟",
                    listOf("today", "tomorrow", "yesterday", "the day after tomorrow"), 2),
                QuizQuestion("«پس‌فردا» به انگلیسی؟",
                    listOf("yesterday", "the day after tomorrow", "the day before yesterday", "next day"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I have seen him two days ago.", "I saw him two days ago.", "I see him two days ago.", "I seen him two days ago."), 1),
                QuizQuestion("«ساعت ۳:۳۰» کدام است؟",
                    listOf("half past three", "quarter past three", "quarter to three", "half to three"), 0),
                QuizQuestion("«پنج‌شنبه شب» کدام است؟",
                    listOf("on Thursday night", "in Thursday night", "at Thursday night", "Thursday night in"), 0),
                QuizQuestion("کدام درست است؟",
                    listOf("at next week", "in next week", "next week", "on next week"), 2),
                QuizQuestion("معنی «Time flies» چیست؟",
                    listOf("زمان پرواز می‌کنه", "زمان زود می‌گذره", "زمان می‌ایسته", "زمان برمی‌گرده"), 1),
                QuizQuestion("معنی «once in a blue moon» چیست؟",
                    listOf("هر شب", "خیلی به ندرت", "هر ماه", "همیشه"), 1),
                QuizQuestion("«in two hours» یعنی؟",
                    listOf("دو ساعت پیش", "دو ساعت دیگه", "دو ساعت طول کشید", "دو ساعته"), 1)
            )
        )// ادامه‌ی فایل TopNotchRepository.kt - این بخش را قبل از else در تابع getTopNotch1 اضافه کن.

        6 -> LessonContent("top_notch_1", 6, "Cities and Countries", "شهرها و کشورها",
            objectives = listOf(
                "یادگیری نام کشورها، ملیت‌ها و زبان‌ها",
                "پرسیدن و پاسخ دادن درباره ملیت و اهل کجا بودن",
                "استفاده از ساختار Where are you from?",
                "شناخت پایتخت‌ها و قاره‌ها",
                "توصیف کشور و شهر خود",
                "استفاده از صفات مربوط به کشورها"
            ),
            vocabulary = listOf(
                VocabWord("Country", "کشور", "ˈkʌntri", "n",
                    "Iran is a beautiful country with a rich history.",
                    "ایران کشوری زیبا با تاریخی غنی است.",
                    "a foreign country / a developing country / across the country",
                    "nation, state", "",
                    "country (n) / countryside (n)", "neutral",
                    "💡 country هم معنی کشور، هم روستا (منطقه غیرشهری)."),
                VocabWord("City", "شهر", "ˈsɪti", "n",
                    "Tehran is the largest city in Iran.",
                    "تهران بزرگ‌ترین شهر ایرانه.",
                    "a big city / a capital city / the city center",
                    "town, metropolis", "village, countryside",
                    "city (n) / citizen (n) / citywide (adj)", "neutral",
                    "💡 city بزرگ‌تر از town، village کوچک‌تر از town."),
                VocabWord("Capital", "پایتخت", "ˈkæpɪtəl", "n",
                    "Paris is the capital of France.",
                    "پاریس پایتخت فرانسه است.",
                    "the capital city / the capital of",
                    "main city, seat of government", "",
                    "capital (n/adj) / capitalize (v)", "neutral",
                    "💡 capital هم پایتخت، هم سرمایه، هم حرف بزرگ."),
                VocabWord("Language", "زبان", "ˈlæŋɡwɪdʒ", "n",
                    "How many languages do you speak?",
                    "چند زبان صحبت می‌کنی؟",
                    "native language / foreign language / body language",
                    "tongue, speech", "",
                    "language (n) / linguist (n) / linguistic (adj)", "neutral",
                    "💡 mother tongue = زبان مادری، native language."),
                VocabWord("Nationality", "ملیت", "ˌnæʃəˈnæləti", "n",
                    "What's your nationality? — I'm Iranian.",
                    "ملیتت چیه؟ — من ایرانی‌ام.",
                    "dual nationality / of Iranian nationality",
                    "citizenship", "",
                    "nation (n) / national (adj) / nationality (n)", "formal",
                    "💡 nationality در فرم‌ها رسمیه، در مکالمه معمولاً از I'm + ملیت استفاده می‌کنن."),
                VocabWord("Continent", "قاره", "ˈkɑːntɪnənt", "n",
                    "Asia is the largest continent in the world.",
                    "آسیا بزرگ‌ترین قاره جهانه.",
                    "the seven continents / on the continent",
                    "landmass", "",
                    "continent (n) / continental (adj)", "neutral",
                    "💡 هفت قاره: Asia, Africa, North America, South America, Antarctica, Europe, Australia."),
                VocabWord("World", "جهان", "wɜːrld", "n",
                    "She has traveled around the world.",
                    "او دور دنیا سفر کرده.",
                    "around the world / the whole world / world peace",
                    "globe, earth", "",
                    "world (n) / worldly (adj) / worldwide (adj)", "neutral",
                    "💡 worldwide = در سراسر جهان."),
                VocabWord("Flag", "پرچم", "flæɡ", "n",
                    "The Iranian flag has three colors: green, white, and red.",
                    "پرچم ایران سه رنگ داره: سبز، سفید و قرمز.",
                    "raise the flag / national flag / flagpole",
                    "banner, standard", "",
                    "flag (n/v) / flagship (n)", "neutral",
                    "💡 flag هم پرچم، هم فعل (علامت زدن/خسته شدن)."),
                VocabWord("Tourist", "توریست / گردشگر", "ˈtʊrɪst", "n",
                    "Millions of tourists visit Paris every year.",
                    "میلیون‌ها توریست هر سال از پاریس بازدید می‌کنن.",
                    "a tourist attraction / tourist destination / touristy",
                    "traveler, visitor, sightseer", "local",
                    "tourist (n) / tourism (n) / touristic (adj)", "neutral",
                    "💡 tourist attraction = جاذبه گردشگری."),
                VocabWord("Citizen", "شهروند", "ˈsɪtɪzən", "n",
                    "He became an American citizen last year.",
                    "او سال گذشته شهروند آمریکایی شد.",
                    "a senior citizen / a fellow citizen / citizenship",
                    "national, resident", "foreigner, alien",
                    "citizen (n) / citizenship (n)", "formal",
                    "💡 senior citizen = شهروند سالمند (مؤدبانه برای elderly)."),
                VocabWord("Border", "مرز", "ˈbɔːrdər", "n",
                    "The border between Iran and Turkey is mountainous.",
                    "مرز بین ایران و ترکیه کوهستانیه.",
                    "cross the border / border control / on the border",
                    "boundary, frontier", "",
                    "border (n/v) / borderline (n/adj)", "neutral",
                    "💡 cross-border = فرامرزی."),
                VocabWord("Population", "جمعیت", "ˌpɑːpjuˈleɪʃən", "n",
                    "The population of Tokyo is over 13 million.",
                    "جمعیت توکیو بیش از ۱۳ میلیونه.",
                    "population growth / dense population / population density",
                    "inhabitants, residents", "",
                    "populate (v) / population (n) / populous (adj)", "formal",
                    "💡 populous = پرجمعیت (صفت)."),
                VocabWord("Currency", "واحد پول", "ˈkɜːrənsi", "n",
                    "The currency of Japan is the yen.",
                    "واحد پول ژاپن ینه.",
                    "foreign currency / exchange currency / local currency",
                    "money, cash", "",
                    "currency (n) / current (adj: جاری)", "formal",
                    "💡 currency فقط پول نیست: current یعنی جاری/فعلی."),
                VocabWord("Climate", "آب و هوا / اقلیم", "ˈklaɪmət", "n",
                    "Iran has a diverse climate.",
                    "ایران آب و هوای متنوعی داره.",
                    "mild climate / tropical climate / climate change",
                    "weather (کوتاه‌مدت)", "",
                    "climate (n) / climatic (adj)", "neutral",
                    "💡 climate = بلندمدت، weather = کوتاه‌مدت."),
                VocabWord("Culture", "فرهنگ", "ˈkʌltʃər", "n",
                    "Japanese culture is very unique.",
                    "فرهنگ ژاپنی خیلی منحصربه‌فرده.",
                    "pop culture / culture shock / cultural diversity",
                    "tradition, custom", "",
                    "culture (n) / cultural (adj) / culturally (adv)", "neutral",
                    "💡 culture shock = شوک فرهنگی."),
                VocabWord("Tradition", "سنت", "trəˈdɪʃən", "n",
                    "It's a family tradition to eat together on Fridays.",
                    "این یه سنت خانوادگیه که جمعه‌ها با هم غذا بخوریم.",
                    "by tradition / an old tradition / break with tradition",
                    "custom, convention", "",
                    "tradition (n) / traditional (adj) / traditionally (adv)", "neutral",
                    "💡 traditional = سنتی، traditionally = به‌طور سنتی.")
            ),
            idioms = listOf(
                IdiomExpression("When in Rome, do as the Romans do", "خواهی بلد شو، با مردم شهر هم‌رنگ شو",
                    "Just try the local food — when in Rome, do as the Romans do!",
                    "فقط غذای محلی رو امتحان کن — خواهی بلد شو، با مردم شهر هم‌رنگ شو!", "idiom"),
                IdiomExpression("Around the world", "در سراسر جهان",
                    "She's traveled around the world twice.",
                    "او دو بار دور دنیا سفر کرده.", "neutral"),
                IdiomExpression("Culture shock", "شوک فرهنگی",
                    "Moving to Japan gave me serious culture shock.",
                    "رفتن به ژاپن شوک فرهنگی شدیدی بهم داد.", "neutral"),
                IdiomExpression("A melting pot", "دیگ ذوب (جامعه چندفرهنگی)",
                    "New York is a melting pot of cultures.",
                    "نیویورک یه دیگ ذوب فرهنگ‌هاست.", "idiom"),
                IdiomExpression("East meets West", "شرق و غرب به هم می‌رسن",
                    "Istanbul is where East meets West.",
                    "استانبول جاییه که شرق و غرب به هم می‌رسن.", "idiom"),
                IdiomExpression("A citizen of the world", "شهروند جهان",
                    "He's lived in 10 countries — he's a true citizen of the world.",
                    "او در ۱۰ کشور زندگی کرده — واقعاً شهروند جهانه.", "idiom"),
                IdiomExpression("The land of opportunity", "سرزمین فرصت‌ها",
                    "Many immigrants see America as the land of opportunity.",
                    "بسیاری از مهاجران آمریکا رو سرزمین فرصت‌ها می‌بینن.", "idiom"),
                IdiomExpression("Motherland / Fatherland", "سرزمین مادری / پدری",
                    "They returned to their motherland after 20 years.",
                    "بعد از ۲۰ سال به سرزمین مادریشون برگشتن.", "formal"),
                IdiomExpression("Home country", "کشور مادری",
                    "I miss my home country sometimes.",
                    "بعضی وقتا دلم برای کشورم تنگ می‌شه.", "neutral"),
                IdiomExpression("Go abroad", "خارج رفتن",
                    "She went abroad to study medicine.",
                    "او برای تحصیل پزشکی به خارج رفت.", "neutral")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("come from", "اهل جایی بودن",
                    "اهل جایی بودن",
                    "Where do you come from?",
                    "اهل کجایی؟", "غیرقابل جدا شدن"),
                PhrasalVerb("grow up", "بزرگ شدن در جایی",
                    "بزرگ شدن",
                    "I grew up in a small town near Tehran.",
                    "من در یه شهر کوچیک نزدیک تهران بزرگ شدم.", "غیرقابل جدا شدن"),
                PhrasalVerb("travel around", "سفر کردن در",
                    "سفر کردن",
                    "We traveled around Europe for a month.",
                    "یه ماه در اروپا سفر کردیم.", "غیرقابل جدا شدن"),
                PhrasalVerb("settle in", "خو گرفتن در جای جدید",
                    "خو گرفتن",
                    "It took me a while to settle in my new country.",
                    "یه کم طول کشید تا در کشور جدیدم خو بگیرم.", "غیرقابل جدا شدن"),
                PhrasalVerb("move to", "نقل مکان کردن به",
                    "نقل مکان کردن",
                    "They moved to Canada last year.",
                    "سال پیش به کانادا نقل مکان کردن.", "غیرقابل جدا شدن"),
                PhrasalVerb("check out", "بررسی/بازدید کردن",
                    "بازدید کردن",
                    "Let's check out the new museum downtown.",
                    "بیا موزه جدید مرکز شهر رو بازدید کنیم.", "جدا شدنی"),
                PhrasalVerb("take in", "جذب کردن (فرهنگ/مکان)",
                    "جذب کردن",
                    "It took me a while to take in the local culture.",
                    "یه کم طول کشید تا فرهنگ محلی رو جذب کنم.", "جدا شدنی"),
                PhrasalVerb("look around", "گشتن اطراف",
                    "گشتن",
                    "Let's look around the old town first.",
                    "بیا اول شهر قدیمی رو بگردیم.", "غیرقابل جدا شدن")
            ),
            pronunciationTips = listOf(
                PronunciationTip("استرس در نام کشورها و ملیت‌ها",
                    "🔊 الگوهای استرس:\n" +
                    "• IRAN /ɪˈrɑːn/ (استرس روی آخر)\n" +
                    "• iRAinian /ɪˈreɪ.ni.ən/ (استرس روی RA)\n" +
                    "• JAPan /dʒəˈpæn/ (استرس روی آخر)\n" +
                    "• JapaNESE /ˌdʒæp.əˈniːz/ (استرس روی nese)\n" +
                    "• AMErica /əˈmer.ɪ.kə/ (استرس روی mer)\n" +
                    "• aMERican /əˈmer.ɪ.kən/ (همون استرس)\n\n" +
                    "💡 در ملیت‌های -ese، استرس روی آخر: Chinese, Japanese, Portuguese."),
                PronunciationTip("تفاوت /ɪ/ و /iː/ در ملیت‌ها",
                    "🔊 دقت کن:\n" +
                    "• IRANian /ɪˈreɪ.ni.ən/ (صدای /i/ کوتاه)\n" +
                    "• IraNI /ɪˈrɑː.niː/ (صدای /iː/ بلند)\n\n" +
                    "💡 در انتهای کلمات -i، صدا بلنده (/iː/)؛ در وسط، کوتاه."),
                PronunciationTip("تلفظ حروف صدادار در کشورها",
                    "🔊 کشورها:\n" +
                    "• France /fræns/ (نه /frɑːns/)\n" +
                    "• Germany /ˈdʒɜːr.mə.ni/\n" +
                    "• Italy /ˈɪt.əl.i/\n" +
                    "• Canada /ˈkæn.ə.də/\n" +
                    "• China /ˈtʃaɪ.nə/\n\n" +
                    "💡 اسم کشورها همیشه با حرف بزرگ نوشته می‌شن.")
            ),
            culturalNotes = listOf(
                CulturalNote("ملیت vs تابعیت",
                    "🌍 فرق بین nationality و citizenship:\n" +
                    "• Nationality = ملیت فرهنگی/قومی (Iranian)\n" +
                    "• Citizenship = تابعیت قانونی (Iranian citizen)\n\n" +
                    "💡 در فرم‌ها معمولاً nationality می‌خوان، ولی در مکالمات روزمره از «I'm + ملیت» استفاده می‌کنن."),
                CulturalNote("صحبت درباره کشور در Small Talk",
                    "🌍 در Small Talk، صحبت درباره کشورها رایجه:\n" +
                    "• Where are you from?\n" +
                    "• How long have you been here?\n" +
                    "• What's your country like?\n\n" +
                    "💡 در آمریکا و اروپا این سوالات نشونه علاقه‌ست، نه فضولی."),
                CulturalNote("قاره‌ها و مناطق",
                    "🌍 هفت قاره:\n" +
                    "• Asia (بزرگ‌ترین)\n• Africa\n• North America\n• South America\n" +
                    "• Antarctica\n• Europe\n• Australia (Oceania)\n\n" +
                    "💡 در انگلیسی آمریکایی، Antarctica و Oceania گاهی هفتمین و هشتمین قاره حساب می‌شن."),
                CulturalNote("کارت‌های ملیت در آمریکا و اروپا",
                    "🌍 در آمریکا و اروپا، وقتی به کسی معرفی می‌شی، ممکنه بپرسن:\n" +
                    "• What's your background? (پیشینه‌ات چیه؟)\n" +
                    "• Where are your parents from?\n" +
                    "• Are you a first-generation American?\n\n" +
                    "💡 این سوالات معمولاً برای آشنایی فرهنگیه، نه تبعیض.")
            ),
            grammar = listOf(
                GrammarSection("📌 Where are you from?",
                    "🔹 فرمول سوال:\n" +
                    "• Where are you from? — I'm from Iran.\n" +
                    "• Where is she from? — She's from France.\n" +
                    "• Where do you come from? (رایج در بریتانیا)\n\n" +
                    "🔸 پاسخ کامل:\n" +
                    "• I'm from Tehran, the capital of Iran.\n" +
                    "• I'm originally from Iran, but I live in Canada now.\n\n" +
                    "⚠️ اشتباهات:\n" +
                    "❌ Where you from? → ✅ Where are you from?\n" +
                    "❌ I from Iran. → ✅ I'm from Iran."),
                GrammarSection("📌 ملیت‌ها (Nationalities)",
                    "🔹 قاعده‌های ساخت ملیت:\n" +
                    "• -an: Iran → Iranian / America → American / Mexico → Mexican\n" +
                    "• -ish: England → English / Spain → Spanish / Poland → Polish\n" +
                    "• -ese: Japan → Japanese / China → Chinese / Portugal → Portuguese\n" +
                    "• -i: Iraq → Iraqi / Pakistan → Pakistani\n" +
                    "• بی‌قاعده: France → French / Germany → German / Greece → Greek\n\n" +
                    "💡 ملیت همیشه با حرف بزرگ نوشته می‌شه."),
                GrammarSection("📌 حرف تعریف با کشورها",
                    "🔹 بیشتر کشورها بدون the:\n" +
                    "• Iran, France, Japan, China, Brazil\n\n" +
                    "🔸 کشورهایی که the می‌گیرن:\n" +
                    "• the USA, the UK, the Netherlands, the Philippines, the UAE\n\n" +
                    "⚠️ ❌ I live in the Iran. → ✅ I live in Iran.\n" +
                    "✅ I live in the United States.\n\n" +
                    "💡 کشورهای جمع یا با اسم مرکب، the می‌گیرن."),
                GrammarSection("📌 زبان‌ها (Languages)",
                    "🔹 نکات مهم:\n" +
                    "• زبان‌ها با حرف بزرگ: English, Persian, Arabic\n" +
                    "• بدون the: I speak English. (نه the English)\n" +
                    "• صحبت کردن: speak / talk in\n" +
                    "• یاد گرفتن: learn / study\n\n" +
                    "🔸 مثال:\n" +
                    "• I speak Persian and English.\n" +
                    "• She's learning Japanese.\n" +
                    "• Can you speak Arabic?\n\n" +
                    "⚠️ ❌ I speak the English. → ✅ I speak English."),
                GrammarSection("📌 صفات مربوط به کشورها",
                    "🔹 فرق بین اسم کشور و صفت:\n" +
                    "• Iran → Iranian (ملیت/صفت) / Persian (زبان/فرهنگ)\n" +
                    "• Japan → Japanese\n" +
                    "• France → French\n" +
                    "• Germany → German\n\n" +
                    "🔸 در جمله:\n" +
                    "• I'm Iranian. / I speak Persian.\n" +
                    "• This is French cheese. / She's Japanese.\n\n" +
                    "💡 در بعضی موارد، اسم کشور با صفت یکیه (German, French)."),
                GrammarSection("📌 The capital of + کشور",
                    "🔹 فرمول:\n" +
                    "• What's the capital of Japan? — Tokyo.\n" +
                    "• The capital of Iran is Tehran.\n\n" +
                    "🔸 ساختارهای جایگزین:\n" +
                    "• Tehran is the capital city of Iran.\n" +
                    "• Iran's capital is Tehran.\n\n" +
                    "💡 همیشه قبل از capital حرف تعریف the میاد."),
                GrammarSection("📌 تفاوت country / nation / state",
                    "🔹 این کلمات نزدیک ولی متفاوت:\n" +
                    "• Country = کشور (جغرافیایی)\n" +
                    "• Nation = ملت (مردم با فرهنگ مشترک)\n" +
                    "• State = ایالت (در آمریکا) یا کشور (سیاسی)\n\n" +
                    "🔸 مثال:\n" +
                    "• Iran is a country in the Middle East.\n" +
                    "• The Iranian nation is proud of its history.\n" +
                    "• California is a state in the USA.\n\n" +
                    "💡 در آمریکا state = ایالت، در سیاست بین‌الملل state = کشور."),
                GrammarSection("📌 سوال درباره شهر و کشور",
                    "🔹 سوالات رایج:\n" +
                    "• Where are you from?\n" +
                    "• What's your hometown?\n" +
                    "• What's the capital of your country?\n" +
                    "• What language do people speak there?\n" +
                    "• How big is your city?\n" +
                    "• What's the weather like there?\n\n" +
                    "🔸 جواب‌های کامل:\n" +
                    "• I'm from Shiraz, a city in southern Iran.\n" +
                    "• About 1.5 million people live there.")
            ),
            commonMistakes = listOf(
                CommonMistake("Where you from?", "Where are you from?", "فعل are لازمه."),
                CommonMistake("I from Iran.", "I'm from Iran.", "فعل am لازمه."),
                CommonMistake("I speak the English.", "I speak English.", "زبان‌ها بدون the."),
                CommonMistake("I live in the Iran.", "I live in Iran.", "بیشتر کشورها بدون the."),
                CommonMistake("France's capital is Paris.", "The capital of France is Paris.",
                    "در انگلیسی رسمی، ساختار of رایج‌تره."),
                CommonMistake("I am Iranian nationality.", "I'm Iranian.", "نیازی به nationality نیست."),
                CommonMistake("What's your country?", "Where are you from? / What country are you from?",
                    "What's your country درست نیست."),
                CommonMistake("I speak Persian language.", "I speak Persian.", "زبان بدون کلمه language."),
                CommonMistake("Japan is in Asia continent.", "Japan is in Asia.", "نیازی به continent نیست."),
                CommonMistake("I'm from Tehran city.", "I'm from Tehran.", "نیازی به city نیست."),
                CommonMistake("The Iran is beautiful.", "Iran is beautiful.", "اسم کشور بدون the."),
                CommonMistake("I like French's food.", "I like French food.", "صفت ملکی برای کشور درست نیست.")
            ),
            conversation = listOf(
                DialogueLine("A", "Hi! I don't think we've met. Where are you from?",
                    "سلام! فکر نمی‌کنم دیده باشیم. اهل کجایی؟"),
                DialogueLine("B", "I'm from Japan, originally. But I've been living in Canada for five years.",
                    "من اصالتاً اهل ژاپنم. ولی پنج ساله در کانادا زندگی می‌کنم."),
                DialogueLine("A", "Oh nice! What part of Japan?",
                    "اوه چه خوب! کجای ژاپن؟"),
                DialogueLine("B", "Osaka. It's a big city in the south. Have you been to Japan?",
                    "اوساکا. شهر بزرگیه در جنوب. ژاپن بودی؟"),
                DialogueLine("A", "No, but I'd love to visit. What's it like?",
                    "نه، ولی دوست دارم برم. چه جور جاییه؟"),
                DialogueLine("B", "It's amazing! The culture is very unique, and the food is incredible.",
                    "فوق‌العاده‌ست! فرهنگش خیلی منحصربه‌فرده، و غذاش باورنکردنیه."),
                DialogueLine("A", "What language do people speak there?",
                    "مردم اونجا چه زبانی صحبت می‌کنن؟"),
                DialogueLine("B", "Japanese, of course. But many people speak some English too.",
                    "ژاپنی، البته. ولی خیلی‌ها یه کم انگلیسی هم صحبت می‌کنن."),
                DialogueLine("A", "What's the capital of Japan?",
                    "پایتخت ژاپن کجاست؟"),
                DialogueLine("B", "Tokyo. It's one of the biggest cities in the world — over 13 million people.",
                    "توکیو. یکی از بزرگ‌ترین شهرهای جهانه — بیش از ۱۳ میلیون نفر."),
                DialogueLine("A", "Wow, that's massive! What about your country's traditions?",
                    "واو، خیلی بزرگه! سنت‌های کشورت چطور؟"),
                DialogueLine("B", "We have so many. Tea ceremonies, cherry blossom festivals, and we bow when we greet.",
                    "خیلی زیاد. مراسم چای، جشنواره شکوفه‌های گیلاس، و موقع سلام تعظیم می‌کنیم."),
                DialogueLine("A", "That's fascinating! I'm from Brazil, by the way.",
                    "چه جالب! راستی، من اهل برزیلم."),
                DialogueLine("B", "Brazil! I've always wanted to go. What's it like?",
                    "برزیل! همیشه می‌خواستم برم. چه جور جاییه؟"),
                DialogueLine("A", "It's beautiful. The people are warm, and we have amazing beaches.",
                    "زیباست. مردمش گرم‌ان، و ساحل‌های فوق‌العاده‌ای داریم."),
                DialogueLine("B", "What language do you speak?",
                    "چه زبانی صحبت می‌کنی؟"),
                DialogueLine("A", "Portuguese. Not Spanish — people always confuse that!",
                    "پرتغالی. نه اسپانیایی — مردم همیشه اشتباه می‌گیرن!"),
                DialogueLine("B", "Good to know. What's the capital of Brazil?",
                    "خوبه که می‌دونم. پایتخت برزیل کجاست؟"),
                DialogueLine("A", "Brasília. Rio is more famous, but Brasília is the capital.",
                    "برازیلیا. ریو معروف‌تره، ولی برازیلیا پایتخته."),
                DialogueLine("B", "Interesting! Well, nice meeting you.",
                    "جالب بود! خب، از آشنایی خوشحال شدم."),
                DialogueLine("A", "You too! Let's grab a coffee sometime.",
                    "من هم همینطور! یه وقت با هم قهوه بخوریم.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("راوی اهل کجاست و الان کجا زندگی می‌کند؟",
                    "او اصالتاً اهل ژاپن (اوساکا) است و پنج سال است در کانادا زندگی می‌کند."),
                ComprehensionQuestion("پایتخت ژاپن کجاست؟",
                    "توکیو، با بیش از ۱۳ میلیون نفر جمعیت."),
                ComprehensionQuestion("مردم ژاپن چه زبانی صحبت می‌کنند؟",
                    "ژاپنی، ولی بسیاری از مردم کمی انگلیسی هم صحبت می‌کنند."),
                ComprehensionQuestion("راوی از کدام کشور است؟",
                    "راوی از برزیل است."),
                ComprehensionQuestion("پایتخت برزیل کجاست و چه تفاوتی با ریو دارد؟",
                    "پایتخت برازیلیا است، اما ریو معروف‌تر است.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Introduce yourself and your country.",
                    "خودت و کشورت رو معرفی کن.",
                    "از I'm from... / I speak... استفاده کن."),
                SpeakingTask("Describe your capital city.",
                    "پایتخت کشورت رو توصیف کن.",
                    "از population, landmarks, culture استفاده کن."),
                SpeakingTask("Talk about a country you want to visit.",
                    "درباره کشوری که می‌خوای بری صحبت کن.",
                    "از I'd love to visit... because... استفاده کن."),
                SpeakingTask("Compare your country with another country.",
                    "کشورت رو با یه کشور دیگه مقایسه کن.",
                    "از bigger than, more traditional than استفاده کن."),
                SpeakingTask("Talk about languages you speak and want to learn.",
                    "درباره زبان‌هایی که صحبت می‌کنی و می‌خوای یاد بگیری صحبت کن.",
                    "از I speak... / I'd like to learn... استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Write about your country.",
                    "درباره کشورت بنویس.",
                    120,
                    "شامل: پایتخت، زبان، جمعیت، فرهنگ"),
                WritingTask("Write about a country you'd like to visit.",
                    "درباره کشوری که دوست داری بری بنویس.",
                    150,
                    "شامل: کدوم کشور، چرا، چه چیزی می‌خوای ببینی"),
                WritingTask("Describe your hometown.",
                    "شهرت رو توصیف کن.",
                    180,
                    "شامل: کجاست، چه ویژگی‌هایی داره، چرا دوستش داری")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Capital» چیست؟",
                    listOf("شهر", "پایتخت", "کشور", "استان"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("Where you from?", "Where are you from?", "From where you?", "You from?"), 1),
                QuizQuestion("ملیت France؟",
                    listOf("Francian", "French", "Francean", "Franish"), 1),
                QuizQuestion("ملیت Japan؟",
                    listOf("Japanian", "Japanish", "Japanese", "Japanes"), 2),
                QuizQuestion("معنی «Flag» چیست؟",
                    listOf("نقشه", "پرچم", "مرز", "کشور"), 1),
                QuizQuestion("پایتخت ایران؟",
                    listOf("Tehran", "Isfahan", "Shiraz", "Tabriz"), 0),
                QuizQuestion("معنی «Tourist» چیست؟",
                    listOf("شهروند", "توریست", "بومی", "خارجی"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I from Iran.", "I'm from Iran.", "I is from Iran.", "From Iran I."), 1),
                QuizQuestion("کدام کشور با «the» می‌آید؟",
                    listOf("Iran", "France", "USA", "Japan"), 2),
                QuizQuestion("معنی «Climate» چیست؟",
                    listOf("آب و هوای امروز", "اقلیم بلندمدت", "فصل", "دما"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I speak the English.", "I speak English.", "I speak an English.", "I speak English language."), 1),
                QuizQuestion("معنی «culture shock» چیست؟",
                    listOf("شوک برقی", "شوک فرهنگی", "فرهنگ غنی", "تغییر عادت"), 1),
                QuizQuestion("«When in Rome, do as the Romans do» یعنی؟",
                    listOf("با مردم شهر هم‌رنگ شو", "روم رو ببین", "رومی‌ها رو بشناس", "در رم مثل رومی‌ها باش"), 0),
                QuizQuestion("کدام درست است؟",
                    listOf("What's your country?", "Where are you from?", "What are you country?", "Where is your from?"), 1),
                QuizQuestion("تفاوت climate و weather؟",
                    listOf("هیچ فرقی ندارند", "climate بلندمدت، weather کوتاه‌مدت", "weather بلندمدت، climate کوتاه‌مدت", "هر دو یکسان"), 1)
            )
        )// ادامه‌ی فایل TopNotchRepository.kt - این بخش را قبل از else در تابع getTopNotch1 اضافه کن.

        7 -> LessonContent("top_notch_1", 7, "Clothes", "لباس‌ها",
            objectives = listOf(
                "یادگیری ۱۵ اسم لباس و اکسسوری رایج",
                "استفاده صحیح از This/These و That/Those",
                "ترتیب صفات (رنگ + اسم) در توصیف لباس",
                "صحبت درباره خرید لباس و سایز",
                "استفاده از افعال wear, put on, take off",
                "بیان سلیقه شخصی در انتخاب لباس"
            ),
            vocabulary = listOf(
                VocabWord("Shirt", "پیراهن (مردانه)", "ʃɜːrt", "n",
                    "He wore a white shirt and a blue tie to the meeting.",
                    "او یه پیراهن سفید و کراوات آبی به جلسه پوشید.",
                    "a dress shirt / an ironed shirt / a striped shirt",
                    "blouse (زنانه)", "",
                    "shirt (n) / shirtsleeve (n)", "neutral",
                    "💡 shirt مردانه، blouse زنانه. در آمریکا shirt برای هر دو."),
                VocabWord("Pants", "شلوار", "pænts", "n",
                    "These pants are too tight — I need a bigger size.",
                    "این شلوار خیلی تنگه — سایز بزرگ‌تر لازم دارم.",
                    "a pair of pants / dress pants / sweatpants",
                    "trousers (BrE)", "",
                    "pants (n) / pant (adj: در ترکیب)", "neutral",
                    "💡 در آمریکا pants، در بریتانیا trousers. در بریتانیا pants = لباس زیر!"),
                VocabWord("Dress", "لباس زنانه / پیراهن زنانه", "dres", "n",
                    "She wore a beautiful red dress to the party.",
                    "او یه لباس قرمز زیبا به مهمونی پوشید.",
                    "an evening dress / a wedding dress / a summer dress",
                    "gown, frock", "",
                    "dress (n/v) / dressy (adj) / dressed (adj)", "neutral",
                    "💡 dress هم اسم (لباس)، هم فعل (لباس پوشیدن: get dressed)."),
                VocabWord("Jacket", "کاپشن / ژاکت", "ˈdʒækɪt", "n",
                    "Take a jacket — it's cold outside.",
                    "یه کاپشن بردار — بیرون سرده.",
                    "a leather jacket / a denim jacket / a suit jacket",
                    "coat (کاپشن بلندتر)", "",
                    "jacket (n) / jacket potato (n)", "neutral",
                    "💡 jacket کوتاه، coat بلندتر و گرم‌تر."),
                VocabWord("Shoes", "کفش", "ʃuːz", "n",
                    "These shoes are really comfortable.",
                    "این کفش‌ها واقعاً راحتن.",
                    "a pair of shoes / running shoes / high heels",
                    "footwear, sneakers", "",
                    "shoe (n) / shoelace (n) / shoemaker (n)", "neutral",
                    "💡 همیشه جمع میاد: a pair of shoes (نه a shoes)."),
                VocabWord("Hat", "کلاه", "hæt", "n",
                    "He always wears a hat in the sun.",
                    "او همیشه زیر آفتاب کلاه می‌ذاره.",
                    "a sun hat / a baseball cap / take off your hat",
                    "cap, beanie", "",
                    "hat (n) / hatter (n) / hatless (adj)", "neutral",
                    "💡 hat کلاه لبه‌دار، cap کلاه نقاب‌دار."),
                VocabWord("Socks", "جوراب", "sɑːks", "n",
                    "I need to buy new socks — mine have holes.",
                    "باید جوراب جدید بخرم — مال خودم سوراخ شده.",
                    "a pair of socks / wool socks / ankle socks",
                    "stockings (جوراب زنانه)", "",
                    "sock (n) / sock (v: ضربه زدن)", "neutral",
                    "💡 همیشه جمع میاد: a pair of socks."),
                VocabWord("Coat", "پالتو / کت", "koʊt", "n",
                    "Wear a warm coat — it's freezing outside.",
                    "یه پالتوی گرم بپوش — بیرون یخبندونه.",
                    "a winter coat / a raincoat / a fur coat",
                    "jacket, overcoat", "",
                    "coat (n) / coating (n) / coated (adj)", "neutral",
                    "💡 coat هم پالتو، هم لایه (a coat of paint)."),
                VocabWord("Skirt", "دامن", "skɜːrt", "n",
                    "She wore a long skirt and a white blouse.",
                    "او یه دامن بلند و بلوز سفید پوشید.",
                    "a mini skirt / a pencil skirt / a long skirt",
                    "dress", "",
                    "skirt (n) / skirt (v: دور زدن)", "neutral",
                    "💡 skirt هم اسم (دامن)، هم فعل (دور زدن، از کنار چیزی رد شدن)."),
                VocabWord("Sweater", "پلیور / بافت", "ˈswetər", "n",
                    "I love wearing cozy sweaters in winter.",
                    "عاشق پوشیدن پلیورهای دنج در زمستانم.",
                    "a wool sweater / a cashmere sweater / a turtleneck sweater",
                    "pullover, jumper (BrE)", "",
                    "sweater (n) / sweat (v/n)", "neutral",
                    "💡 در بریتانیا jumper، در آمریکا sweater."),
                VocabWord("T-shirt", "تی‌شرت", "ˈtiː ʃɜːrt", "n",
                    "He wore a plain black T-shirt and jeans.",
                    "او یه تی‌شرت مشکی ساده و شلوار جین پوشید.",
                    "a cotton T-shirt / a graphic T-shirt",
                    "tee", "",
                    "T-shirt (n)", "neutral",
                    "💡 T-shirt با خط تیره نوشته می‌شه."),
                VocabWord("Jeans", "شلوار جین", "dʒiːnz", "n",
                    "Blue jeans are popular all over the world.",
                    "شلوار جین آبی در سراسر جهان محبوبه.",
                    "a pair of jeans / skinny jeans / ripped jeans",
                    "denim", "",
                    "jeans (n) / jean (adj)", "neutral",
                    "💡 همیشه جمع: a pair of jeans."),
                VocabWord("Suit", "کت و شلوار", "suːt", "n",
                    "He wore a black suit to the interview.",
                    "او یه کت و شلوار مشکی به مصاحبه پوشید.",
                    "a business suit / a formal suit / a three-piece suit",
                    "outfit, ensemble", "",
                    "suit (n/v) / suitable (adj) / suiting (n)", "formal",
                    "💡 suit هم کت و شلوار، هم فعل (مناسب بودن: This suits you)."),
                VocabWord("Scarf", "شال / روسری", "skɑːrf", "n",
                    "She wrapped a silk scarf around her neck.",
                    "او یه شال ابریشمی دور گردنش پیچید.",
                    "a wool scarf / a silk scarf / a winter scarf",
                    "shawl, wrap", "",
                    "scarf (n) / scarves (جمع)", "neutral",
                    "💡 جمعش scarves هست (f → ves)."),
                VocabWord("Belt", "کمربند", "belt", "n",
                    "He needs a belt with those loose pants.",
                    "او با اون شلوار گشاد کمربند لازم داره.",
                    "a leather belt / tighten your belt / a seat belt",
                    "strap, band", "",
                    "belt (n/v) / belted (adj)", "neutral",
                    "💡 tighten your belt = صرفه‌جویی کردن (اصطلاح).")
            ),
            idioms = listOf(
                IdiomExpression("Dressed to kill", "خیلی شیک و جذاب پوشیده",
                    "She was dressed to kill at the party.",
                    "او در مهمونی خیلی شیک پوشیده بود.", "informal"),
                IdiomExpression("Dress to impress", "برای تحت تأثیر قرار دادن لباس پوشیدن",
                    "For a job interview, you should dress to impress.",
                    "برای مصاحبه کاری، باید شیک و حرفه‌ای لباس بپوشی.", "neutral"),
                IdiomExpression("Fit like a glove", "دقیقاً اندازه بودن",
                    "This dress fits like a glove!",
                    "این لباس دقیقاً اندازه‌امه!", "idiom"),
                IdiomExpression("In style / out of style", "مد روز / از مد افتاده",
                    "Bell-bottom jeans are back in style.",
                    "شلوارهای جین دم‌پا دوباره مد شدن.", "neutral"),
                IdiomExpression("Hand-me-downs", "لباس‌های دست دوم (از خواهر/برادر بزرگ‌تر)",
                    "I wore a lot of hand-me-downs as a kid.",
                    "بچه که بودم، خیلی لباس دست دوم (از بزرگ‌ترها) می‌پوشیدم.", "neutral"),
                IdiomExpression("Off the rack", "آماده (نه دوخت سفارشی)",
                    "He buys his suits off the rack.",
                    "او کت و شلوارهاش رو آماده می‌خره.", "neutral"),
                IdiomExpression("The emperor's new clothes", "چیزی که وجود نداره ولی همه تأییدش می‌کنن",
                    "The whole project feels like the emperor's new clothes.",
                    "کل پروژه مثل لباس جدید امپراتوره (پوچ و توخالی).", "idiom"),
                IdiomExpression("Put on / Take off", "پوشیدن / درآوردن",
                    "Put on your jacket — we're leaving.",
                    "کاپشنت رو بپوش — داریم می‌ریم.", "neutral"),
                IdiomExpression("Try on", "پرو کردن لباس",
                    "Can I try on these shoes?",
                    "می‌تونم این کفش‌ها رو پرو کنم؟", "neutral"),
                IdiomExpression("Wear out", "فرسوده شدن (از پوشیدن زیاد)",
                    "I wore out my favorite shoes.",
                    "کفش مورد علاقه‌ام رو از پوشیدن زیاد فرسوده کردم.", "neutral")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("put on", "پوشیدن",
                    "پوشیدن",
                    "Put on your coat — it's cold.",
                    "پالتوت رو بپوش — سرده.", "جدا شدنی"),
                PhrasalVerb("take off", "درآوردن / بلند شدن (هواپیما)",
                    "درآوردن",
                    "Take off your shoes before entering.",
                    "قبل از وارد شدن کفش‌هات رو دربیار.", "جدا شدنی"),
                PhrasalVerb("try on", "پرو کردن",
                    "پرو کردن",
                    "Can I try on this shirt?",
                    "می‌تونم این پیراهن رو پرو کنم؟", "جدا شدنی"),
                PhrasalVerb("dress up", "شیک پوشیدن",
                    "شیک پوشیدن",
                    "You don't need to dress up — it's casual.",
                    "لازم نیست شیک بپوشی — غیررسمیه.", "غیرقابل جدا شدن"),
                PhrasalVerb("wear out", "فرسوده شدن / خسته کردن",
                    "فرسوده شدن",
                    "Kids wear out their shoes so fast.",
                    "بچه‌ها کفش‌هاشون رو خیلی زود فرسوده می‌کنن.", "جدا شدنی"),
                PhrasalVerb("zip up", "زیپ رو بستن",
                    "زیپ رو بستن",
                    "Zip up your jacket — it's freezing.",
                    "زیپ کاپشنت رو ببند — یخبندونه.", "جدا شدنی"),
                PhrasalVerb("hang up", "آویزون کردن (لباس)",
                    "آویزون کردن",
                    "Hang up your coat, please.",
                    "لطفاً پالتوت رو آویزون کن.", "جدا شدنی"),
                PhrasalVerb("pick out", "انتخاب کردن",
                    "انتخاب کردن",
                    "She picked out a beautiful dress.",
                    "او یه لباس زیبا انتخاب کرد.", "جدا شدنی")
            ),
            pronunciationTips = listOf(
                PronunciationTip("تلفظ کلماتی که با -clothes مشکل دارن",
                    "🔊 clothes /kloʊðz/ (th صدا‌دار)\n" +
                    "• close (فعل) /kloʊz/ — فرق داره!\n" +
                    "• cloth /klɔːθ/ (پارچه)\n" +
                    "• clothing /ˈkloʊ.ðɪŋ/\n\n" +
                    "💡 clothes یک سیلابیه: /kloʊðz/. خیلی‌ها اشتباهاً close می‌گن."),
                PronunciationTip("تلفظ /ʃ/ در کلمات لباس",
                    "🔊 صدای /ʃ/ (ش):\n" +
                    "• shirt /ʃɜːrt/\n• shoes /ʃuːz/\n" +
                    "• shorts /ʃɔːrts/\n• shirt /ʃɜːrt/\n\n" +
                    "🔸 دقت کن با /tʃ/ (چ) اشتباه نگیری:\n" +
                    "• cheese /tʃiːz/ / watch /wɑːtʃ/"),
                PronunciationTip("تلفظ واژه‌های سایز",
                    "🔊 سایزها:\n" +
                    "• small /smɔːl/\n• medium /ˈmiː.di.əm/\n" +
                    "• large /lɑːrdʒ/\n• extra large /ˈek.strə lɑːrdʒ/\n\n" +
                    "💡 در بریتانیا معمولاً از S, M, L استفاده می‌کنن، در آمریکا XS, S, M, L, XL.")
            ),
            culturalNotes = listOf(
                CulturalNote("درآوردن کفش در خانه",
                    "🌍 در فرهنگ‌های شرقی (ژاپن، ایران، ترکیه)، درآوردن کفش در خانه رایجه.\n\n" +
                    "🔸 در آمریکا و اروپا، بستگی به خانواده داره. مهمونی رسمی = کفش بمونه، غیررسمی = اختیاری.\n\n" +
                    "💡 اگه مطمئن نیستی، بپرس: Should I take off my shoes?"),
                CulturalNote("لباس رسمی vs غیررسمی در محیط کار",
                    "🌍 Dress code در محیط‌های کاری:\n" +
                    "• Business formal = کت و شلوار، کراوات\n" +
                    "• Business casual = پیراهن، شلوار پارچه‌ای\n" +
                    "• Smart casual = بلوز، شلوار جین تیره\n" +
                    "• Casual = تی‌شرت، جین\n\n" +
                    "💡 در آمریکا، Casual خیلی رایجه؛ در اروپا رسمی‌تر."),
                CulturalNote("سایز لباس در کشورها",
                    "🌍 سایز لباس در آمریکا و اروپا فرق داره:\n" +
                    "• American: 6, 8, 10 (زنانه)\n" +
                    "• European: 36, 38, 40\n" +
                    "• British: 8, 10, 12\n\n" +
                    "💡 سایز کفش هم فرق داره: American 8 = European 39."),
                CulturalNote("Culture of Fashion",
                    "🌍 فرهنگ مد:\n" +
                    "• Fast fashion = لباس ارزان و پرتغییر (Zara, H&M)\n" +
                    "• Sustainable fashion = لباس پایدار و اخلاقی\n" +
                    "• Vintage = لباس قدیمی و خاص\n\n" +
                    "💡 در غرب، صحبت درباره برند لباس رایجه، ولی در بعضی فرهنگ‌ها ممکنه خودنمایی باشه.")
            ),
            grammar = listOf(
                GrammarSection("📌 ترتیب رنگ + اسم (Adjective Order)",
                    "🔹 در انگلیسی، صفت رنگ **قبل** از اسم میاد:\n" +
                    "• a red shirt (نه a shirt red)\n" +
                    "• blue pants (نه pants blue)\n" +
                    "• black shoes (نه shoes black)\n\n" +
                    "🔸 اگه چند صفت داشته باشی، ترتیب زیر:\n" +
                    "1️⃣ نظر: beautiful, nice\n" +
                    "2️⃣ اندازه: big, small\n" +
                    "3️⃣ سن: old, new\n" +
                    "4️⃣ رنگ: red, blue\n" +
                    "5️⃣ منشأ: Italian, French\n" +
                    "6️⃣ جنس: silk, leather\n\n" +
                    "💡 مثال: a beautiful long red silk dress.\n" +
                    "⚠️ ❌ a shirt red → ✅ a red shirt"),
                GrammarSection("📌 This / These / That / Those",
                    "🔹 انتخاب بین این چهار:\n" +
                    "• This (این - نزدیک، مفرد): This shirt is nice.\n" +
                    "• These (این‌ها - نزدیک، جمع): These shoes are comfortable.\n" +
                    "• That (آن - دور، مفرد): That jacket is expensive.\n" +
                    "• Those (آنها - دور، جمع): Those pants are too long.\n\n" +
                    "⚠️ اشتباهات رایج:\n" +
                    "❌ This shoes → ✅ These shoes\n" +
                    "❌ These is nice → ✅ These are nice\n" +
                    "❌ That shirts → ✅ Those shirts"),
                GrammarSection("📌 افعال wear / put on / take off",
                    "🔹 این سه فعل فرق دارن:\n" +
                    "• wear = پوشیدن (حالت، ادامه‌دار):\n" +
                    "  I'm wearing a blue shirt today.\n\n" +
                    "• put on = پوشیدن (عمل، لحظه‌ای):\n" +
                    "  Put on your jacket — it's cold.\n\n" +
                    "• take off = درآوردن:\n" +
                    "  Take off your shoes at the door.\n\n" +
                    "💡 wear حالت پایدار، put on عمل لحظه‌ای."),
                GrammarSection("📌 افعال get dressed / dress up",
                    "🔹 تفاوت‌ها:\n" +
                    "• get dressed = لباس پوشیدن (معمولی):\n" +
                    "  I get dressed after breakfast.\n\n" +
                    "• dress up = شیک پوشیدن:\n" +
                    "  We dressed up for the wedding.\n\n" +
                    "• undress = لباس درآوردن:\n" +
                    "  The doctor asked him to undress.\n\n" +
                    "💡 get dressed معمولی، dress up رسمی."),
                GrammarSection("📌 تفاوت fit / suit / match",
                    "🔹 این سه فعل خیلی اشتباه می‌شن:\n" +
                    "• fit = اندازه بودن:\n" +
                    "  This shirt fits me perfectly.\n\n" +
                    "• suit = به کسی آمدن (استایل):\n" +
                    "  Red really suits you!\n\n" +
                    "• match = هماهنگ بودن (با چیز دیگه):\n" +
                    "  Your shoes match your bag.\n\n" +
                    "💡 fit برای اندازه، suit برای استایل، match برای هماهنگی."),
                GrammarSection("📌 Present Continuous برای پوشش",
                    "🔹 وقتی می‌خوای بگی الان چی پوشیدی:\n" +
                    "• I'm wearing a black shirt.\n" +
                    "• She's wearing high heels.\n" +
                    "• What are you wearing today?\n\n" +
                    "🔸 Present Simple برای عادت:\n" +
                    "• I usually wear jeans to work.\n" +
                    "• He never wears a tie.\n\n" +
                    "💡 الان پوشیده = Continuous، عادت = Simple."),
                GrammarSection("📌 جملات پرسشی درباره لباس",
                    "🔹 سوالات رایج:\n" +
                    "• What size are you? / What size do you wear?\n" +
                    "• Do you have this in a smaller size?\n" +
                    "• How does it fit?\n" +
                    "• Can I try it on?\n" +
                    "• Does this come in other colors?\n\n" +
                    "🔸 جواب:\n" +
                    "• I'm a medium. / I wear size 8.\n" +
                    "• It fits perfectly. / It's too tight.\n" +
                    "• Yes, it comes in blue, red, and black."),
                GrammarSection("📌 a pair of",
                    "🔹 برای لباس‌هایی که دو تکه هستن:\n" +
                    "• a pair of shoes / a pair of socks / a pair of pants / a pair of jeans / a pair of glasses\n\n" +
                    "⚠️ اشتباهات:\n" +
                    "❌ a shoes → ✅ a pair of shoes / some shoes\n" +
                    "❌ two pants → ✅ two pairs of pants\n\n" +
                    "💡 این اسامی در انگلیسی همیشه جمع هستن.")
            ),
            commonMistakes = listOf(
                CommonMistake("a shirt red", "a red shirt", "صفت رنگ قبل از اسم میاد."),
                CommonMistake("This shoes", "These shoes", "shoes جمع است، با These میاد."),
                CommonMistake("These is nice", "These are nice", "These با are میاد."),
                CommonMistake("a shoes", "a pair of shoes", "shoes همیشه جمع میاد."),
                CommonMistake("two pants", "two pairs of pants", "برای شمردن، pair of لازمه."),
                CommonMistake("I wear a jacket now.", "I'm wearing a jacket now.", "الان پوشیده = Continuous."),
                CommonMistake("Take off you the shoes.", "Take off your shoes.", "ترتیب صحیح: take off + مفعول."),
                CommonMistake("This dress fits me good.", "This dress fits me well.", "fit با well میاد (قید)، نه good."),
                CommonMistake("She's wearing a red dress today.", "She's wearing a red dress today.", "این درسته."),
                CommonMistake("I put on my clothes every morning.", "I get dressed every morning.",
                    "برای لباس پوشیدن روزانه، از get dressed استفاده می‌شه."),
                CommonMistake("The pants are too much tight.", "The pants are too tight.", "too + صفت، بدون much."),
                CommonMistake("I like this shirt very much much.", "I like this shirt very much.", "much تکراری نمیاد.")
            ),
            conversation = listOf(
                DialogueLine("A", "What are you wearing to the party tonight?",
                    "امشب چی می‌پوشی به مهمونی؟"),
                DialogueLine("B", "I'm not sure yet. Maybe my black dress. What about you?",
                    "هنوز مطمئن نیستم. شاید لباس مشکی‌ام. تو چطور؟"),
                DialogueLine("A", "I'm thinking about wearing a blue shirt and gray pants.",
                    "دارم فکر می‌کنم پیراهن آبی و شلوار خاکستری بپوشم."),
                DialogueLine("B", "Sounds nice! Is it a formal party?",
                    "خوبه! مهمونی رسمیه؟"),
                DialogueLine("A", "Semi-formal, I think. Should I wear a tie?",
                    "نیمه‌رسمی، فکر کنم. کراوات بزنم؟"),
                DialogueLine("B", "Maybe not. Just a nice shirt is fine.",
                    "شاید نه. یه پیراهن شیک کافیه."),
                DialogueLine("A", "OK. Where did you buy that dress? It's beautiful!",
                    "باشه. اون لباس رو از کجا خریدی؟ قشنگه!"),
                DialogueLine("B", "Thanks! I got it at the mall last week. It was on sale.",
                    "ممنون! هفته پیش از پاساژ خریدم. حراج بود."),
                DialogueLine("A", "Really? How much did it cost?",
                    "واقعاً؟ چقدر شد؟"),
                DialogueLine("B", "Only 40 dollars — 50% off!",
                    "فقط ۴۰ دلار — ۵۰٪ تخفیف!"),
                DialogueLine("A", "Wow, that's a great deal. What size are you?",
                    "واو، معامله خوبیه. سایزت چیه؟"),
                DialogueLine("B", "I'm a medium, but sometimes a small. It depends on the brand.",
                    "من مدیومم، ولی بعضی وقتا اسمال. بستگی به برند داره."),
                DialogueLine("A", "I know what you mean. Sizes are so confusing!",
                    "می‌دونم چی می‌گی. سایزها خیلی گیج‌کننده‌ست!"),
                DialogueLine("B", "Totally! Are you going to buy something new for tonight?",
                    "کاملاً! می‌خوای برای امشب چیز جدیدی بخری؟"),
                DialogueLine("A", "No, I'll just wear something from my closet. Do these shoes match my outfit?",
                    "نه، از کمد خودم چیزی می‌پوشم. این کفش‌ها با ست لباسم هماهنگه؟"),
                DialogueLine("B", "Yes, they match perfectly. But try them on first — they might be tight.",
                    "بله، عالی هماهنگه. ولی اول پرو کن — ممکنه تنگ باشه."),
                DialogueLine("A", "Good point. Hey, what time should we leave?",
                    "نکته خوبیه. هی، چه ساعتی باید راه بیفتیم؟"),
                DialogueLine("B", "Around 8 PM. I'll pick you up at 7:30.",
                    "حدود ۸ شب. ساعت ۷:۳۰ میام دنبالت."),
                DialogueLine("A", "Perfect. See you then!",
                    "عالی. پس می‌بینمت!"),
                DialogueLine("B", "See you! Wear something warm — it's cold outside.",
                    "می‌بینمت! یه چیز گرم بپوش — بیرون سرده.")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("راوی قصد دارد چه بپوشد؟",
                    "او قصد دارد پیراهن آبی و شلوار خاکستری بپوشد."),
                ComprehensionQuestion("دوست راوی لباسش را از کجا خریده است؟",
                    "از پاساژ، هفته پیش، در حراج (۵۰٪ تخفیف)."),
                ComprehensionQuestion("سایز دوست راوی چیست؟",
                    "او مدیوم است، اما گاهی اسمال، بسته به برند."),
                ComprehensionQuestion("کفش‌های راوی با ست لباسش هماهنگ است؟",
                    "بله، کاملاً هماهنگ است، اما دوستش توصیه می‌کند اول پرو کند."),
                ComprehensionQuestion("چه ساعتی قرار است راه بیفتند؟",
                    "حدود ساعت ۸ شب، دوستش ساعت ۷:۳۰ می‌آید دنبالش.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe what you're wearing today.",
                    "توصیف کن امروز چی پوشیدی.",
                    "از I'm wearing... + رنگ و نوع لباس استفاده کن."),
                SpeakingTask("Talk about your favorite outfit.",
                    "درباره ست لباس مورد علاقه‌ات صحبت کن.",
                    "از This is my favorite... because... استفاده کن."),
                SpeakingTask("Go shopping for clothes.",
                    "برای خرید لباس برو (نقش‌بازی).",
                    "از How much is this? / Can I try it on? / Do you have a larger size? استفاده کن."),
                SpeakingTask("Compare two types of clothing.",
                    "دو نوع لباس رو مقایسه کن.",
                    "از more comfortable than / cheaper than استفاده کن."),
                SpeakingTask("Describe your style.",
                    "استایل خودت رو توصیف کن.",
                    "از casual, formal, sporty, elegant استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Describe your favorite outfit.",
                    "ست لباس مورد علاقه‌ات رو توصیف کن.",
                    120,
                    "شامل: چه لباسی، رنگ‌ها، کجا می‌پوشی، چرا دوستش داری"),
                WritingTask("Write about fashion in your country.",
                    "درباره مد در کشورت بنویس.",
                    150,
                    "شامل: نوع لباس رایج، تغییرات مد، نظر شخصی"),
                WritingTask("Write a shopping dialogue.",
                    "یک دیالوگ خرید بنویس.",
                    180,
                    "شامل: فروشنده و مشتری، سوال درباره سایز و قیمت، پرداخت")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Jacket» چیست؟",
                    listOf("پیراهن", "کاپشن", "شلوار", "کفش"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("a shirt blue", "blue a shirt", "a blue shirt", "shirt blue"), 2),
                QuizQuestion("کدام درست است؟",
                    listOf("This shoes", "These shoes", "This shoe are", "These shoe"), 1),
                QuizQuestion("معنی «Skirt» چیست؟",
                    listOf("شلوار", "دامن", "پیراهن", "کاپشن"), 1),
                QuizQuestion("«این پیراهن من است.»",
                    listOf("This is my shirt.", "These is my shirt.", "This are my shirt.", "My shirt this is."), 0),
                QuizQuestion("معنی «Socks» چیست؟",
                    listOf("جوراب", "دستکش", "کلاه", "شال"), 0),
                QuizQuestion("کدام درست است؟",
                    listOf("These are my shoes.", "This are my shoes.", "These is my shoes.", "This is my shoes."), 0),
                QuizQuestion("معنی «Sweater» چیست؟",
                    listOf("پالتو", "پلیور", "کاپشن", "جلیقه"), 1),
                QuizQuestion("تفاوت wear و put on؟",
                    listOf("هیچ فرقی ندارند", "wear حالت، put on عمل", "put on حالت، wear عمل", "هر دو عمل"), 1),
                QuizQuestion("«a pair of shoes» یعنی؟",
                    listOf("یک کفش", "یک جفت کفش", "دو کفش", "چند کفش"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("This dress fits me good.", "This dress fits me well.", "This dress fit me well.", "This dress fitting me good."), 1),
                QuizQuestion("معنی «fit like a glove» چیست؟",
                    listOf("مثل دستکش بودن", "دقیقاً اندازه بودن", "خیلی تنگ بودن", "خیلی گشاد بودن"), 1),
                QuizQuestion("«dressed to kill» یعنی؟",
                    listOf("کشتن کسی با لباس", "خیلی شیک پوشیدن", "لباس تیره پوشیدن", "لباس نپوشیدن"), 1),
                QuizQuestion("کدام همیشه جمع میاد؟",
                    listOf("shirt", "jeans", "hat", "scarf"), 1),
                QuizQuestion("تفاوت fit و suit و match؟",
                    listOf("هیچ فرقی ندارند", "fit اندازه، suit استایل، match هماهنگی", "suit اندازه، fit استایل", "match فقط برای رنگ"), 1)
            )
        )// ادامه‌ی فایل TopNotchRepository.kt - این بخش را قبل از else در تابع getTopNotch1 اضافه کن.

        8 -> LessonContent("top_notch_1", 8, "Daily Life", "زندگی روزمره",
            objectives = listOf(
                "یادگیری ۱۵ فعل عبارتی مربوط به روتین روزانه",
                "استفاده از Present Simple برای بیان عادت‌ها",
                "بیان ساعت و ترتیب کارهای روزانه",
                "استفاده از قیدهای تکرار (always, usually, sometimes, never)",
                "صحبت درباره روتین هفتگی و برنامه‌های ثابت",
                "توضیح ترتیب وقایع با first, then, after that, finally"
            ),
            vocabulary = listOf(
                VocabWord("Wake up", "بیدار شدن", "weɪk ʌp", "phrasal v",
                    "I usually wake up at 7 AM on weekdays.",
                    "من معمولاً روزهای کاری ساعت ۷ صبح بیدار می‌شم.",
                    "wake up early / wake up late / wake up to",
                    "get up, arise", "fall asleep",
                    "wake (v) / wake-up (n) / awake (adj)", "neutral",
                    "💡 wake up = بیدار شدن از خواب، get up = از تخت بلند شدن."),
                VocabWord("Get dressed", "لباس پوشیدن", "ɡet drest", "phrase",
                    "I get dressed right after breakfast.",
                    "بلافاصله بعد از صبحانه لباس می‌پوشم.",
                    "get dressed quickly / get dressed for work",
                    "put on clothes", "undress",
                    "dress (n/v) / dressed (adj)", "neutral",
                    "💡 get dressed = عمل پوشیدن، wear = حالت پوشیدن."),
                VocabWord("Brush teeth", "مسواک زدن", "brʌʃ tiːθ", "phrase",
                    "I brush my teeth twice a day.",
                    "روزی دو بار مسواک می‌زنم.",
                    "brush your teeth / electric toothbrush",
                    "clean teeth", "",
                    "brush (n/v) / toothbrush (n) / toothpaste (n)", "neutral",
                    "💡 همیشه brush my teeth (با ضمیر ملکی)."),
                VocabWord("Have breakfast", "صبحانه خوردن", "hæv ˈbrekfəst", "phrase",
                    "I usually have breakfast at 7:30.",
                    "معمولاً ساعت ۷:۳۰ صبحانه می‌خورم.",
                    "have breakfast / skip breakfast / have a big breakfast",
                    "eat breakfast", "skip breakfast",
                    "breakfast (n) / break (v) / fast (n)", "neutral",
                    "💡 در انگلیسی، have breakfast (نه eat breakfast، اگرچه eat هم درسته)."),
                VocabWord("Go to work", "به سر کار رفتن", "ɡoʊ tə wɜːrk", "phrase",
                    "I go to work by subway every morning.",
                    "هر صبح با مترو می‌رم سر کار.",
                    "go to work / go to the office / commute to work",
                    "head to work", "leave work",
                    "work (n/v) / worker (n) / workplace (n)", "neutral",
                    "💡 go to work (بدون the)، اما go to the office."),
                VocabWord("Come home", "به خانه آمدن", "kʌm hoʊm", "phrase",
                    "I usually come home around 6 PM.",
                    "معمولاً حدود ۶ عصر میام خونه.",
                    "come home late / come home from work",
                    "return home, get home", "leave home",
                    "home (n/adv)", "neutral",
                    "💡 come home (بدون to)، چون home قیده."),
                VocabWord("Watch TV", "تلویزیون تماشا کردن", "wɑːtʃ ˌtiːˈviː", "phrase",
                    "We watch TV together after dinner.",
                    "بعد از شام با هم تلویزیون تماشا می‌کنیم.",
                    "watch TV / watch a movie / binge-watch",
                    "view, stream", "",
                    "watch (v) / TV (n) / viewer (n)", "neutral",
                    "💡 watch TV (بدون the)، اما watch the news."),
                VocabWord("Go to bed", "به رختخواب رفتن", "ɡoʊ tə bed", "phrase",
                    "I usually go to bed around 11 PM.",
                    "معمولاً حدود ۱۱ شب می‌رم بخوابم.",
                    "go to bed early / go to bed late",
                    "hit the sack (غیررسمی)", "get up",
                    "bed (n) / bedtime (n)", "neutral",
                    "💡 go to bed (بدون the)، یعنی به رختخواب رفتن."),
                VocabWord("Take a shower", "دوش گرفتن", "teɪk ə ˈʃaʊər", "phrase",
                    "I take a shower every morning before work.",
                    "هر صبح قبل از کار دوش می‌گیرم.",
                    "take a shower / take a quick shower / take a cold shower",
                    "have a shower (BrE)", "",
                    "shower (n/v) / showerhead (n)", "neutral",
                    "💡 در آمریکا take a shower، در بریتانیا have a shower."),
                VocabWord("Have lunch", "ناهار خوردن", "hæv lʌntʃ", "phrase",
                    "I usually have lunch at noon with colleagues.",
                    "معمولاً ظهر با همکارها ناهار می‌خورم.",
                    "have lunch / grab lunch / have a light lunch",
                    "eat lunch", "",
                    "lunch (n) / luncheon (n: رسمی)", "neutral",
                    "💡 have lunch، نه eat lunch (اگرچه درسته، ولی have رایج‌تره)."),
                VocabWord("Have dinner", "شام خوردن", "hæv ˈdɪnər", "phrase",
                    "We have dinner together as a family every night.",
                    "هر شب به عنوان خانواده با هم شام می‌خوریم.",
                    "have dinner / have dinner out / have a romantic dinner",
                    "eat dinner, dine", "",
                    "dinner (n) / diner (n) / dining room (n)", "neutral",
                    "💡 dine رسمی‌تر از have dinner."),
                VocabWord("Exercise", "ورزش کردن", "ˈeksərsaɪz", "v/n",
                    "I try to exercise three times a week.",
                    "سعی می‌کنم هفته‌ای سه بار ورزش کنم.",
                    "exercise regularly / do exercise / get exercise",
                    "work out, train", "rest",
                    "exercise (n/v) / exerciser (n)", "neutral",
                    "💡 exercise هم اسم، هم فعل. در آمریکا work out رایج‌تره در مکالمه."),
                VocabWord("Relax", "استراحت کردن", "rɪˈlæks", "v",
                    "I like to relax with a good book on weekends.",
                    "آخر هفته‌ها دوست دارم با یه کتاب خوب استراحت کنم.",
                    "relax at home / relax by the pool / just relax",
                    "unwind, chill (غیررسمی)", "stress out",
                    "relax (v) / relaxation (n) / relaxed (adj)", "neutral",
                    "💡 chill out = relax (غیررسمی)."),
                VocabWord("Hang out", "وقت گذراندن", "hæŋ aʊt", "phrasal v",
                    "I hang out with friends on Friday evenings.",
                    "جمعه شب‌ها با دوستام وقت می‌گذرونم.",
                    "hang out with friends / hang out at the mall",
                    "spend time, chill", "",
                    "hang (v) / hangout (n)", "informal",
                    "💡 hang out = وقت گذراندن بدون برنامه خاص. غیررسمیه."),
                VocabWord("Run errands", "کارهای روزمره انجام دادن", "rʌn ˈerəndz", "phrase",
                    "I have to run some errands this afternoon.",
                    "باید این بعدازظهر چند تا کار روزمره انجام بدم.",
                    "run errands / do errands / run an errand",
                    "do chores", "",
                    "errand (n) / runner (n)", "neutral",
                    "💡 errands = کارهای بیرون از خانه (خرید، بانک، پست).")
            ),
            idioms = listOf(
                IdiomExpression("Early bird catches the worm", "سحرخیز باش تا کامروا باشی",
                    "He's always up at 5 AM — the early bird catches the worm!",
                    "او همیشه ساعت ۵ صبح بیداره — سحرخیز باش تا کامروا باشی!", "idiom"),
                IdiomExpression("A creature of habit", "عادت‌مند به روتین",
                    "I'm a creature of habit — I do the same thing every day.",
                    "من آدم روتینی هستم — هر روز یه کار رو انجام می‌دم.", "idiom"),
                IdiomExpression("Hit the sack", "رفتن به رختخواب",
                    "I'm exhausted. Time to hit the sack.",
                    "خسته‌ام. وقتشه برم بخوابم.", "informal"),
                IdiomExpression("Rise and shine", "پاشو، روز شروع شد",
                    "Rise and shine! Breakfast is ready.",
                    "پاشو، روز شروع شد! صبحانه آماده‌ست.", "informal"),
                IdiomExpression("On the go", "مشغول و در حرکت",
                    "I've been on the go all day.",
                    "تمام روز مشغول و در حرکتم.", "informal"),
                IdiomExpression("Run like clockwork", "مثل ساعت کار کردن",
                    "Our morning routine runs like clockwork.",
                    "روتین صبحگاهی‌مون مثل ساعت کار می‌کنه.", "idiom"),
                IdiomExpression("Take a breather", "نفس تازه کردن",
                    "Let's take a breather before we continue.",
                    "بیا قبل از ادامه یه نفس تازه کنیم.", "informal"),
                IdiomExpression("Burning the midnight oil", "تا دیروقت کار کردن",
                    "She's been burning the midnight oil to finish her project.",
                    "او تا دیروقت کار کرده تا پروژه‌اش رو تموم کنه.", "idiom"),
                IdiomExpression("Take it easy", "سخت نگیر / آروم باش",
                    "Take it easy — you've done enough for today.",
                    "سخت نگیر — برای امروز کافی کار کردی.", "informal"),
                IdiomExpression("Just my luck", "بدشانسی آوردم",
                    "Just my luck — the bus left right before I arrived.",
                    "بدشانسی آوردم — اتوبوس دقیقاً قبل از رسیدنم رفت.", "informal")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("wake up", "بیدار شدن",
                    "بیدار شدن",
                    "I wake up at 6 every day.",
                    "هر روز ساعت ۶ بیدار می‌شم.", "غیرقابل جدا شدن"),
                PhrasalVerb("get up", "از تخت بلند شدن",
                    "از تخت بلند شدن",
                    "He gets up as soon as his alarm rings.",
                    "به محض زنگ ساعتش، از تخت بلند می‌شه.", "غیرقابل جدا شدن"),
                PhrasalVerb("get ready", "آماده شدن",
                    "آماده شدن",
                    "It takes me 30 minutes to get ready.",
                    "۳۰ دقیقه طول می‌کشه تا آماده بشم.", "غیرقابل جدا شدن"),
                PhrasalVerb("head out", "راه افتادن",
                    "راه افتادن",
                    "I usually head out the door at 8.",
                    "معمولاً ساعت ۸ از خونه راه می‌افتم.", "غیرقابل جدا شدن"),
                PhrasalVerb("wind down", "آروم شدن",
                    "آروم شدن",
                    "I like to wind down with a cup of tea.",
                    "دوست دارم با یه فنجون چای آروم بشم.", "غیرقابل جدا شدن"),
                PhrasalVerb("turn in", "به رختخواب رفتن",
                    "به رختخواب رفتن",
                    "I usually turn in around 11 PM.",
                    "معمولاً حدود ۱۱ شب می‌رم بخوابم.", "غیرقابل جدا شدن"),
                PhrasalVerb("catch up on", "جبران کردن / رسیدن به",
                    "جبران کردن",
                    "I need to catch up on my sleep.",
                    "باید کم‌خوابی‌ام رو جبران کنم.", "جدا شدنی"),
                PhrasalVerb("pencil in", "برنامه‌ریزی موقت کردن",
                    "برنامه‌ریزی موقت",
                    "Let's pencil in a meeting for next week.",
                    "بیا یه جلسه برای هفته بعد برنامه‌ریزی موقت کنیم.", "جدا شدنی")
            ),
            pronunciationTips = listOf(
                PronunciationTip("استرس در افعال عبارتی روزمره",
                    "🔊 در افعال عبارتی، استرس معمولاً روی ذره (up, out, in) است:\n" +
                    "• wake UP /weɪk ʌp/\n" +
                    "• get UP /ɡet ʌp/\n" +
                    "• hang OUT /hæŋ aʊt/\n" +
                    "• head OUT /hed aʊt/\n\n" +
                    "💡 این الگو توی مکالمه طبیعی خیلی مهمه."),
                PronunciationTip("تلفظ ساعات و زمان‌های روتین",
                    "🔊 ساعات:\n" +
                    "• 7 AM → /ˈsev.ən eɪ em/\n" +
                    "• 6 PM → /sɪks piː em/\n" +
                    "• 7:30 → /ˈsev.ən ˈθɜːr.ti/ یا /ˈhæf pæst ˈsev.ən/\n\n" +
                    "💡 AM و PM معمولاً سریع تلفظ می‌شن."),
                PronunciationTip("تلفظ معمولاً در گفتار سریع",
                    "🔊 واژه‌هایی که در گفتار سریع ضعیف می‌شن:\n" +
                    "• usually → /ˈjuːʒ.li/ (نه /ˈjuː.ʒu.ə.li/)\n" +
                    "• often → /ˈɔː.fən/ (t سایلنته)\n" +
                    "• every → /ˈev.ri/\n" +
                    "• probably → /ˈprɑː.bə.bli/\n\n" +
                    "💡 در مکالمه طبیعی، این واژه‌ها کوتاه‌تر تلفظ می‌شن.")
            ),
            culturalNotes = listOf(
                CulturalNote("فرهنگ صبحانه در کشورهای مختلف",
                    "🌍 صبحانه در فرهنگ‌ها:\n" +
                    "• American: تخم‌مرغ، بیکن، نان تست، قهوه\n" +
                    "• British: تخم‌مرغ، لوبیا، سوسیس، نان تست (Full English)\n" +
                    "• French: کروسان، قهوه، آب‌پرتقال\n" +
                    "• Japanese: برنج، سوپ میسو، ماهی\n\n" +
                    "💡 در آمریکا skip breakfast (نخوردن صبحانه) رایجه، در اروپا مهم‌تره."),
                CulturalNote("فرهنگ کار در غرب",
                    "🌍 در غرب، تعادل کار و زندگی (work-life balance) خیلی مهمه:\n" +
                    "• 9 to 5 = ساعت کاری رایج (9 AM تا 5 PM)\n" +
                    "• Lunch break = 30 دقیقه تا ۱ ساعت\n" +
                    "• Happy hour = بعد از کار، نوشیدنی با همکارها\n\n" +
                    "💡 در آمریکا، overtime (اضافه‌کاری) رایجه، ولی در اروپا محدودتره."),
                CulturalNote("روتین آخر هفته",
                    "🌍 آخر هفته در غرب:\n" +
                    "• Saturday: خرید (errands)، ورزش، تفریح\n" +
                    "• Sunday: استراحت، خانواده، آماده شدن برای هفته\n\n" +
                    "💡 در آمریکا Sunday brunch رایجه (صبحانه-ناهار دیروقت)."),
                CulturalNote("فرهنگ خواب در غرب",
                    "🌍 میانگین خواب:\n" +
                    "• آمریکا: ۶.۸ ساعت\n" +
                    "• اروپا: ۷.۵ ساعت\n" +
                    "• ژاپن: ۶.۵ ساعت\n\n" +
                    "💡 sleep hygiene = عادات خواب سالم (نور کم، ساعت منظم).")
            ),
            grammar = listOf(
                GrammarSection("📌 Present Simple برای عادت‌ها",
                    "🔹 فرمول:\n" +
                    "• I/You/We/They + verb: I wake up at 7.\n" +
                    "• He/She/It + verb+s: She wakes up at 7.\n\n" +
                    "🔸 سوال:\n" +
                    "• Do you wake up early? / Does she wake up early?\n\n" +
                    "🔸 منفی:\n" +
                    "• I don't wake up early. / She doesn't wake up early.\n\n" +
                    "⚠️ اشتباهات:\n" +
                    "❌ She wake up early. → ✅ She wakes up early.\n" +
                    "❌ I wakes up early. → ✅ I wake up early."),
                GrammarSection("📌 سوم شخص مفرد: قواعد +s",
                    "🔹 قاعده‌ها:\n" +
                    "• +s: wake → wakes, work → works\n" +
                    "• +es (بعد از s, x, ch, sh, o): go → goes, watch → watches, brush → brushes\n" +
                    "• y → ies (بعد از حرف بی‌صدا): study → studies, fly → flies\n" +
                    "• بی‌قاعده: have → has, be → is, do → does\n\n" +
                    "💡 مثال:\n" +
                    "• I go → She goes\n" +
                    "• I brush → He brushes"),
                GrammarSection("📌 قیدهای تکرار (Frequency Adverbs)",
                    "🔹 ترتیب از بیشترین به کمترین:\n" +
                    "• always (۱۰۰٪)\n" +
                    "• usually (۹۰٪)\n" +
                    "• often (۷۰٪)\n" +
                    "• sometimes (۵۰٪)\n" +
                    "• occasionally (۳۰٪)\n" +
                    "• rarely / seldom (۱۰٪)\n" +
                    "• never (۰٪)\n\n" +
                    "🔸 جای قید:\n" +
                    "• بعد از فعل be: I am always busy.\n" +
                    "• قبل از فعل اصلی: I always wake up early.\n\n" +
                    "⚠️ ❌ I wake always up early. → ✅ I always wake up early."),
                GrammarSection("📌 ترتیب وقایع با First, Then, After that, Finally",
                    "🔹 برای توضیح روتین به ترتیب:\n" +
                    "• First, I wake up at 7.\n" +
                    "• Then, I brush my teeth.\n" +
                    "• After that, I have breakfast.\n" +
                    "• Next, I get dressed.\n" +
                    "• Finally, I leave for work.\n\n" +
                    "💡 این کلمات ترتیب رو واضح می‌کنن و در Writing ضروری هستن."),
                GrammarSection("📌 حروف اضافه زمان در روتین",
                    "🔹 قاعده:\n" +
                    "• at + ساعت: at 7 AM, at noon\n" +
                    "• in the + بخش روز: in the morning, in the evening\n" +
                    "• on + روز: on Monday, on weekends\n" +
                    "• every + واحد: every day, every morning\n\n" +
                    "💡 مثال:\n" +
                    "• I wake up at 7 in the morning.\n" +
                    "• I exercise every day.\n" +
                    "• I relax on weekends."),
                GrammarSection("📌 Present Continuous برای کارهای موقت",
                    "🔹 Present Continuous برای:\n" +
                    "• کاری که الان در حال انجامه: I'm having lunch right now.\n" +
                    "• برنامه آینده: I'm meeting a friend tomorrow.\n\n" +
                    "🔸 تفاوت با Present Simple:\n" +
                    "• I have lunch at noon. (روتین)\n" +
                    "• I'm having lunch right now. (الان)\n\n" +
                    "💡 Simple = عادت، Continuous = لحظه یا برنامه قطعی."),
                GrammarSection("📌 افعال have / take با اسم‌های روزمره",
                    "🔹 ترکیب‌های رایج:\n" +
                    "• have + breakfast / lunch / dinner / coffee / a shower\n" +
                    "• take + a shower / a nap / a break / a walk\n\n" +
                    "⚠️ فرق آمریکا و بریتانیا:\n" +
                    "• AmE: take a shower\n" +
                    "• BrE: have a shower\n\n" +
                    "💡 در آمریکا هم take a shower هم have a shower رایجه."),
                GrammarSection("📌 تفاوت wake up و get up",
                    "🔹 این دو فعل عبارتی فرق دارن:\n" +
                    "• wake up = بیدار شدن از خواب:\n" +
                    "  I woke up at 6 but stayed in bed.\n\n" +
                    "• get up = بلند شدن از تخت:\n" +
                    "  I finally got up at 6:30.\n\n" +
                    "💡 می‌تونی بیدار بشی (wake up) ولی بلند نشی (not get up).")
            ),
            commonMistakes = listOf(
                CommonMistake("I wake up 7.", "I wake up at 7.", "قبل از ساعت at میاد."),
                CommonMistake("She wake up early.", "She wakes up early.", "سوم شخص مفرد +s."),
                CommonMistake("I go to the bed.", "I go to bed.", "go to bed بدون the."),
                CommonMistake("I wake always up early.", "I always wake up early.", "قید قبل از فعل اصلی."),
                CommonMistake("I have a breakfast.", "I have breakfast.", "breakfast بدون a (معمولاً)."),
                CommonMistake("I eat breakfast", "I have breakfast", "have breakfast رایج‌تره (اگرچه eat هم درسته)."),
                CommonMistake("I go to the work.", "I go to work.", "go to work بدون the."),
                CommonMistake("I sleep at 11 PM.", "I go to bed at 11 PM.", "برای رفتن به رختخواب از go to bed."),
                CommonMistake("I watch the TV.", "I watch TV.", "watch TV بدون the."),
                CommonMistake("I brush the teeth.", "I brush my teeth.", "با ضمیر ملکی (my)."),
                CommonMistake("I get up to work.", "I go to work.", "get up برای بلند شدن از تخت."),
                CommonMistake("He get dressed fast.", "He gets dressed fast.", "سوم شخص مفرد gets.")
            ),
            conversation = listOf(
                DialogueLine("A", "So, what does a typical day look like for you?",
                    "خب، یه روز معمولی‌ت چطوره؟"),
                DialogueLine("B", "Well, I usually wake up around 6:30 in the morning.",
                    "خب، معمولاً حدود ۶:۳۰ صبح بیدار می‌شم."),
                DialogueLine("A", "That's early! Do you get up right away?",
                    "زوده! بلافاصله بلند می‌شی؟"),
                DialogueLine("B", "No, I usually stay in bed for 10 minutes checking my phone.",
                    "نه، معمولاً ۱۰ دقیقه تو تخت می‌مونم و گوشیم رو چک می‌کنم."),
                DialogueLine("A", "I do the same! Then what?",
                    "منم همین کار رو می‌کنم! بعدش چی؟"),
                DialogueLine("B", "Then I get up, brush my teeth, and take a quick shower.",
                    "بعد بلند می‌شم، مسواک می‌زنم، و یه دوش سریع می‌گیرم."),
                DialogueLine("A", "Do you have breakfast at home?",
                    "صبحانه خونه می‌خوری؟"),
                DialogueLine("B", "Sometimes. If I'm in a hurry, I just grab a coffee on the way.",
                    "بعضی وقتا. اگه عجله داشته باشم، فقط یه قهوه تو راه می‌گیرم."),
                DialogueLine("A", "How do you go to work?",
                    "چطور می‌ری سر کار؟"),
                DialogueLine("B", "I take the subway. It's faster than driving during rush hour.",
                    "مترو می‌گیرم. توی ساعت شلوغی از رانندگی سریع‌تره."),
                DialogueLine("A", "What time do you usually get home?",
                    "معمولاً چه ساعتی میای خونه؟"),
                DialogueLine("B", "Around 6 PM. Then I have dinner with my family.",
                    "حدود ۶ عصر. بعدش با خانواده شام می‌خورم."),
                DialogueLine("A", "Do you do anything else in the evening?",
                    "عصرها کار دیگه‌ای هم می‌کنی؟"),
                DialogueLine("B", "Yes, I usually go for a walk or watch TV with my wife.",
                    "بله، معمولاً می‌رم پیاده‌روی یا با زنم تلویزیون می‌بینم."),
                DialogueLine("A", "What time do you go to bed?",
                    "چه ساعتی می‌ری بخوابی؟"),
                DialogueLine("B", "Around 11. I read a book before sleeping — it helps me relax.",
                    "حدود ۱۱. قبل خواب کتاب می‌خونم — کمکم می‌کنه آروم بشم."),
                DialogueLine("A", "That sounds like a healthy routine!",
                    "روتین سالمی به نظر می‌رسه!"),
                DialogueLine("B", "Yeah, it works for me. What about your daily routine?",
                    "آره، برای من جواب می‌ده. روتین روزانه تو چطوره؟"),
                DialogueLine("A", "Mine is a bit different. I work from home, so I wake up later.",
                    "مال من یه کم فرق داره. از خونه کار می‌کنم، پس دیرتر بیدار می‌شم."),
                DialogueLine("B", "Working from home sounds nice. Do you ever miss the office?",
                    "کار از خونه خوب به نظر می‌رسه. دلت برای دفتر تنگ نمی‌شه؟")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("راوی چه ساعتی بیدار می‌شود؟",
                    "حدود ساعت ۶:۳۰ صبح."),
                ComprehensionQuestion("بعد از بیدار شدن چه کاری انجام می‌دهد؟",
                    "۱۰ دقیقه در تخت می‌ماند و گوشی‌اش را چک می‌کند."),
                ComprehensionQuestion("چرا با مترو به سر کار می‌رود؟",
                    "چون در ساعت شلوغی از رانندگی سریع‌تر است."),
                ComprehensionQuestion("شب‌ها چه کارهایی انجام می‌دهد؟",
                    "پیاده‌روی می‌رود یا با همسرش تلویزیون تماشا می‌کند."),
                ComprehensionQuestion("قبل از خواب چه کاری انجام می‌دهد؟",
                    "کتاب می‌خواند چون به آرامش او کمک می‌کند.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your daily routine.",
                    "روتین روزانه‌ات رو توصیف کن.",
                    "از First, Then, After that, Finally و قیدهای تکرار استفاده کن."),
                SpeakingTask("Talk about your morning habits.",
                    "درباره عادت‌های صبحگاهی‌ت صحبت کن.",
                    "از wake up, get dressed, have breakfast استفاده کن."),
                SpeakingTask("Describe your ideal weekend.",
                    "آخر هفته ایده‌آلت رو توصیف کن.",
                    "از I usually... / I like to... استفاده کن."),
                SpeakingTask("Compare your routine on weekdays vs weekends.",
                    "روتین روزهای کاری و آخر هفته‌ات رو مقایسه کن.",
                    "از On weekdays... but on weekends... استفاده کن."),
                SpeakingTask("Talk about a habit you want to change.",
                    "درباره عادتی که می‌خوای تغییر بدی صحبت کن.",
                    "از I'd like to... / I want to stop... استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Write about your typical weekday.",
                    "درباره یه روز کاری معمولی‌ت بنویس.",
                    120,
                    "شامل: صبح، بعدازظهر، عصر، شب — با زمان‌ها"),
                WritingTask("Write about your weekend routine.",
                    "درباره روتین آخر هفته‌ات بنویس.",
                    150,
                    "شامل: شنبه، یکشنبه — با فعالیت‌ها"),
                WritingTask("Write about a habit you want to build.",
                    "درباره عادتی که می‌خوای بسازی بنویس.",
                    180,
                    "شامل: چه عادتی، چرا، چطور می‌خوای شروع کنی")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Brush teeth» چیست؟",
                    listOf("شستن دست", "مسواک زدن", "شام خوردن", "خوابیدن"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I wake up 7.", "I wake up at 7.", "I wake at 7 up.", "Wake I up 7."), 1),
                QuizQuestion("سوم شخص مفرد درست؟",
                    listOf("She wake up early.", "She wakes up early.", "She waking up early.", "She wake ups early."), 1),
                QuizQuestion("معنی «Have dinner» چیست؟",
                    listOf("صبحانه خوردن", "ناهار خوردن", "شام خوردن", "میان‌وعده"), 2),
                QuizQuestion("«همیشه» به انگلیسی؟",
                    listOf("never", "always", "sometimes", "rarely"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("He go to work.", "He goes to work.", "He going to work.", "He go work."), 1),
                QuizQuestion("معنی «Exercise» چیست؟",
                    listOf("خوابیدن", "ورزش کردن", "درس خواندن", "استراحت"), 1),
                QuizQuestion("«هرگز» به انگلیسی؟",
                    listOf("always", "usually", "never", "often"), 2),
                QuizQuestion("تفاوت wake up و get up؟",
                    listOf("هیچ فرقی ندارند", "wake up بیدار شدن، get up بلند شدن", "get up بیدار شدن", "wake up بلند شدن"), 1),
                QuizQuestion("کدام بدون the میاد؟",
                    listOf("the TV", "TV", "the bed", "the work"), 1),
                QuizQuestion("«I go to bed at 11 PM» یعنی؟",
                    listOf("ساعت ۱۱ می‌خوابم", "ساعت ۱۱ بیدار می‌شم", "ساعت ۱۱ کار می‌کنم", "ساعت ۱۱ غذا می‌خورم"), 0),
                QuizQuestion("کدام درست است؟",
                    listOf("I have a breakfast.", "I have breakfast.", "I have the breakfast.", "I have an breakfast."), 1),
                QuizQuestion("«usually» چه نسبتی از تکرار؟",
                    listOf("۱۰٪", "۳۰٪", "۹۰٪", "۱۰۰٪"), 2),
                QuizQuestion("معنی «hang out» چیست؟",
                    listOf("آویزون شدن", "وقت گذراندن", "بیرون رفتن", "خرید کردن"), 1),
                QuizQuestion("«a creature of habit» یعنی چه کسی؟",
                    listOf("آدم عادت‌مند به روتین", "آدم بی‌نظم", "آدم پرکار", "آدم خسته"), 0)
            )
        )// ادامه‌ی فایل TopNotchRepository.kt - این بخش را قبل از else در تابع getTopNotch1 اضافه کن.

        9 -> LessonContent("top_notch_1", 9, "Shopping", "خرید",
            objectives = listOf(
                "یادگیری ۱۵ واژه مربوط به خرید و پرداخت",
                "پرسیدن قیمت با How much",
                "استفاده صحیح از This/That/These/Those در خرید",
                "مکالمه با فروشنده و چانه‌زنی (اختیاری)",
                "درخواست سایز، رنگ و پرو کردن لباس",
                "انواع روش‌های پرداخت (نقد، کارت، آنلاین)"
            ),
            vocabulary = listOf(
                VocabWord("Store", "فروشگاه", "stɔːr", "n",
                    "I usually buy my clothes at a store downtown.",
                    "من معمولاً لباس‌هام رو از یه فروشگاه مرکز شهر می‌خرم.",
                    "a clothing store / a department store / a convenience store",
                    "shop, outlet, boutique", "",
                    "store (n/v) / storage (n)", "neutral",
                    "💡 در آمریکا store، در بریتانیا shop رایج‌تره."),
                VocabWord("Price", "قیمت", "praɪs", "n",
                    "What's the price of this jacket?",
                    "قیمت این کاپشن چنده؟",
                    "a good price / half price / at any price",
                    "cost, charge, rate", "",
                    "price (n/v) / priceless (adj) / pricing (n)", "neutral",
                    "💡 priceless یعنی بی‌قیمت (ارزشمند)، نه بدون قیمت."),
                VocabWord("Dollar", "دلار", "ˈdɑːlər", "n",
                    "The shirt costs about thirty dollars.",
                    "این پیراهن حدود سی دلار قیمت داره.",
                    "US dollar / a dollar bill / a million-dollar idea",
                    "buck (غیررسمی)", "",
                    "dollar (n) / dollarize (v)", "neutral",
                    "💡 dollar رایج‌ترین واحد پوله در آمریکا، ولی در کانادا و استرالیا هم dollar دارن."),
                VocabWord("Cash", "پول نقد", "kæʃ", "n",
                    "Do you take cash or card?",
                    "نقد می‌گیرید یا کارت؟",
                    "pay in cash / cash only / cash register",
                    "money, bills", "credit",
                    "cash (n/v) / cashier (n)", "neutral",
                    "💡 in cash = نقد، با cash = با پول نقد."),
                VocabWord("Credit card", "کارت اعتباری", "ˈkredɪt kɑːrd", "n",
                    "Can I pay with a credit card?",
                    "می‌تونم با کارت اعتباری پرداخت کنم؟",
                    "a credit card / a debit card / swipe a card",
                    "plastic (غیررسمی)", "cash",
                    "credit (n) / creditor (n)", "neutral",
                    "💡 credit card = اعتباری، debit card = نقدی (از حساب خودت)."),
                VocabWord("Discount", "تخفیف", "ˈdɪskaʊnt", "n",
                    "There's a 20% discount on all shoes today.",
                    "امروز ۲۰٪ تخفیف روی همه کفش‌ها هست.",
                    "a big discount / at a discount / a student discount",
                    "reduction, markdown", "",
                    "discount (n/v) / discounted (adj)", "neutral",
                    "💡 at a discount = با تخفیف، on sale = حراج."),
                VocabWord("Receipt", "رسید", "rɪˈsiːt", "n",
                    "Keep the receipt in case you want to return it.",
                    "رسید رو نگه دار، شاید بخوای پسش بدی.",
                    "a receipt / on the receipt / ask for a receipt",
                    "proof of purchase", "",
                    "receipt (n) / receive (v)", "neutral",
                    "💡 تلفظش /rɪˈsiːt/ (p سایلنته)."),
                VocabWord("Customer", "مشتری", "ˈkʌstəmər", "n",
                    "The customer is always right.",
                    "مشتری همیشه حق داره.",
                    "a loyal customer / customer service / customer satisfaction",
                    "client, buyer, shopper", "seller",
                    "customer (n) / custom (n)", "neutral",
                    "💡 customer service = خدمات مشتریان."),
                VocabWord("Sale", "حراج / فروش", "seɪl", "n",
                    "I bought this jacket on sale — 40% off!",
                    "این کاپشن رو تو حراج خریدم — ۴۰٪ تخفیف!",
                    "on sale / for sale / a big sale",
                    "discount, markdown", "",
                    "sale (n) / sell (v) / seller (n)", "neutral",
                    "💡 on sale = حراج شده، for sale = برای فروش."),
                VocabWord("Expensive", "گران", "ɪkˈspensɪv", "adj",
                    "That watch is too expensive for me.",
                    "اون ساعت برای من خیلی گرونه.",
                    "too expensive / ridiculously expensive",
                    "costly, pricey", "cheap, affordable",
                    "expense (n) / expensive (adj) / expend (v)", "neutral",
                    "💡 expensive خنثی، pricey غیررسمی، costly می‌تونه مجازی هم باشه."),
                VocabWord("Cheap", "ارزان", "tʃiːp", "adj",
                    "This shirt is cheap but good quality.",
                    "این پیراهن ارزونه ولی کیفیت خوبی داره.",
                    "dirt cheap / cheap and cheerful",
                    "inexpensive, affordable", "expensive",
                    "cheap (adj) / cheaply (adv) / cheapness (n)", "neutral",
                    "⚠️ cheap می‌تونه معنی «بی‌کیفیت» یا «خساست» هم بده."),
                VocabWord("Bargain", "معامله خوب / چانه زدن", "ˈbɑːrɡɪn", "n/v",
                    "This jacket was a real bargain — only $20!",
                    "این کاپشن یه معامله واقعی بود — فقط ۲۰ دلار!",
                    "a good bargain / bargain hunter / into the bargain",
                    "deal, steal (غیررسمی)", "rip-off",
                    "bargain (n/v) / bargainer (n)", "neutral",
                    "💡 bargain هم اسم (معامله خوب)، هم فعل (چانه زدن)."),
                VocabWord("Refund", "بازپرداخت", "ˈriːfʌnd", "n/v",
                    "I asked for a refund because the item was broken.",
                    "درخواست بازپرداخت کردم چون جنس شکسته بود.",
                    "a full refund / ask for a refund / get a refund",
                    "money back, reimbursement", "",
                    "refund (n/v) / fund (n)", "formal",
                    "💡 refund = پول رو پس دادن، return = جنس رو پس دادن."),
                VocabWord("Queue", "صف", "kjuː", "n/v",
                    "There was a long queue at the checkout.",
                    "صف طولانی‌ای دم صندوق بود.",
                    "stand in a queue / jump the queue / a queue of people",
                    "line (AmE)", "",
                    "queue (n/v)", "neutral",
                    "💡 در بریتانیا queue، در آمریکا line."),
                VocabWord("Cashier", "صندوقدار", "kæˈʃɪr", "n",
                    "The cashier asked if I needed a bag.",
                    "صندوقدار پرسید که کیسه لازم دارم یا نه.",
                    "a cashier / the cashier's desk",
                    "checkout clerk", "",
                    "cash (n) / cashier (n)", "neutral",
                    "💡 تلفظش /kæˈʃɪr/ با استرس روی سیلاب دوم.")
            ),
            idioms = listOf(
                IdiomExpression("Shop till you drop", "تا از پا افتادن خرید کردن",
                    "We went shopping and shopped till we dropped!",
                    "رفتیم خرید و تا از پا افتادیم خرید کردیم!", "informal"),
                IdiomExpression("Cost an arm and a leg", "خیلی گران بودن",
                    "That designer bag costs an arm and a leg.",
                    "اون کیف برند خیلی گرونه.", "idiom"),
                IdiomExpression("A rip-off", "سرکیسه کردن / گران‌فروشی",
                    "Ten dollars for a coffee? That's a rip-off!",
                    "ده دلار برای یه قهوه؟ این سرکیسه کردنه!", "informal"),
                IdiomExpression("Window shopping", "ویترین‌گردی",
                    "We went window shopping but didn't buy anything.",
                    "رفتیم ویترین‌گردی ولی چیزی نخریدیم.", "neutral"),
                IdiomExpression("For a song", "به قیمت خیلی ارزان",
                    "I got this antique vase for a song.",
                    "این گلدون عتیقه رو به قیمت خیلی ارزون گرفتم.", "idiom"),
                IdiomExpression("Buyer's remorse", "پشیمانی بعد از خرید",
                    "I felt buyer's remorse after buying that expensive coat.",
                    "بعد از خرید اون پالتوی گرون، احساس پشیمانی کردم.", "formal"),
                IdiomExpression("Shop around", "قیمت‌ها رو مقایسه کردن",
                    "Before buying a car, it's smart to shop around.",
                    "قبل از خرید ماشین، عاقلانه‌ست که قیمت‌ها رو مقایسه کنی.", "neutral"),
                IdiomExpression("Save for a rainy day", "برای روز مبادا پس‌انداز کردن",
                    "My grandmother always told me to save for a rainy day.",
                    "مادربزرگم همیشه می‌گفت برای روز مبادا پس‌انداز کن.", "idiom"),
                IdiomExpression("Pay through the nose", "خیلی زیاد پرداخت کردن",
                    "We paid through the nose for those concert tickets.",
                    "برای اون بلیط‌های کنسرت خیلی زیاد پرداخت کردیم.", "idiom"),
                IdiomExpression("The best things in life are free", "بهترین چیزهای زندگی رایگانند",
                    "Health, love, and friendship — the best things in life are free.",
                    "سلامتی، عشق و دوستی — بهترین چیزهای زندگی رایگانند.", "idiom")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("try on", "پرو کردن",
                    "پرو کردن",
                    "Can I try on this dress?",
                    "می‌تونم این لباس رو پرو کنم؟", "جدا شدنی"),
                PhrasalVerb("pick out", "انتخاب کردن",
                    "انتخاب کردن",
                    "She picked out a red handbag.",
                    "او یه کیف دستی قرمز انتخاب کرد.", "جدا شدنی"),
                PhrasalVerb("pay for", "پرداخت کردن برای",
                    "پرداخت کردن",
                    "Who's going to pay for dinner?",
                    "کی می‌خواد شام رو حساب کنه؟", "غیرقابل جدا شدن"),
                PhrasalVerb("shop around", "قیمت‌ها رو مقایسه کردن",
                    "قیمت‌ها رو مقایسه کردن",
                    "Let's shop around before we buy.",
                    "بیا قبل از خرید قیمت‌ها رو مقایسه کنیم.", "غیرقابل جدا شدن"),
                PhrasalVerb("run out of", "تمام کردن",
                    "تمام کردن",
                    "We ran out of milk — I need to buy some.",
                    "شیرمون تموم شد — باید بخرم.", "غیرقابل جدا شدن"),
                PhrasalVerb("stock up on", "ذخیره کردن",
                    "ذخیره کردن",
                    "We stocked up on snacks for the trip.",
                    "برای سفر تنقلات ذخیره کردیم.", "غیرقابل جدا شدن"),
                PhrasalVerb("hand in", "تحویل دادن",
                    "تحویل دادن",
                    "I handed in the broken item for a refund.",
                    "جنس شکسته رو برای بازپرداخت تحویل دادم.", "جدا شدنی"),
                PhrasalVerb("throw in", "اضافه کردن (رایگان)",
                    "اضافه کردن",
                    "The seller threw in a free case.",
                    "فروشنده یه قاب رایگان هم اضافه کرد.", "جدا شدنی")
            ),
            pronunciationTips = listOf(
                PronunciationTip("تلفظ How much",
                    "🔊 در گفتار سریع:\n" +
                    "• How much is this? → /haʊ mʌtʃ ɪz ðɪs/\n" +
                    "• How much are these? → /haʊ mʌtʃ ər ðiːz/\n\n" +
                    "💡 are در گفتار سریع به /ər/ تبدیل می‌شه."),
                PronunciationTip("تلفظ اعداد قیمت",
                    "🔊 قیمت‌ها:\n" +
                    "• $5.99 → five ninety-nine (نه five dollars and ninety-nine cents)\n" +
                    "• $20 → twenty dollars\n" +
                    "• $1.50 → a dollar fifty / one fifty\n\n" +
                    "💡 در آمریکا معمولاً سنت‌ها رو کوتاه می‌گن."),
                PronunciationTip("استرس در واژه‌های خرید",
                    "🔊 استرس:\n" +
                    "• disCOUNT /ˈdɪs.kaʊnt/ (اسم)\n" +
                    "• disCOUNT /dɪsˈkaʊnt/ (فعل)\n" +
                    "• reCEIPT /rɪˈsiːt/\n" +
                    "• exPENsive /ɪkˈspen.sɪv/\n\n" +
                    "💡 اسم و فعل گاهی استرس متفاوت دارن.")
            ),
            culturalNotes = listOf(
                CulturalNote("چانه‌زنی در فرهنگ‌های مختلف",
                    "🌍 در غرب، چانه‌زنی در فروشگاه‌های معمولی رایج نیست:\n" +
                    "• در فروشگاه‌های زنجیره‌ای: قیمت ثابت\n" +
                    "• در بازارهای محلی (flea market): چانه‌زنی قابل قبول\n" +
                    "• در کشورهای خاورمیانه و آسیا: چانه‌زنی رایجه\n\n" +
                    "💡 در غرب، جمله «Can you give me a discount?» می‌تونه مؤدبانه باشه، ولی همیشه جواب نمی‌ده."),
                CulturalNote("حق بازگشت کالا (Return Policy)",
                    "🌍 در آمریکا و اروپا، برگرداندن کالا خیلی رایجه:\n" +
                    "• Most stores: 30-day return policy\n" +
                    "• Bring the receipt\n" +
                    "• Some items (underwear, electronics) may be final sale\n\n" +
                    "💡 در بعضی فروشگاه‌ها، حتی بدون رسید هم قبول می‌کنن (اگر تگ داشته باشه)."),
                CulturalNote("تیپ‌های فروشگاه در غرب",
                    "🌍 انواع فروشگاه‌ها:\n" +
                    "• Department store = فروشگاه بزرگ چندطبقه (Macy's)\n" +
                    "• Supermarket = سوپرمارکت (Whole Foods)\n" +
                    "• Convenience store = فروشگاه کوچک ۲۴ ساعته (7-Eleven)\n" +
                    "• Outlet = فروشگاه تخفیفی برندها\n" +
                    "• Thrift store = فروشگاه اجناس دست دوم\n\n" +
                    "💡 Thrift store در آمریکا خیلی رایجه و ارزونه."),
                CulturalNote("تیپ کردن (Tipping) در آمریکا",
                    "🌍 در آمریکا، تیپ دادن (انعام) خیلی مهمه:\n" +
                    "• Restaurants: 15-20%\n" +
                    "• Coffee shops: $1 per drink\n" +
                    "• Taxis: 10-15%\n" +
                    "• Hotels: $2-5 per night\n\n" +
                    "💡 در اروپا معمولاً سرویس charge در صورت‌حساب هست، ولی تیپ اختیاریه.")
            ),
            grammar = listOf(
                GrammarSection("📌 How much? / How many?",
                    "🔹 قاعده:\n" +
                    "• How much + غیرقابل شمارش: How much is this? / How much water?\n" +
                    "• How many + قابل شمارش جمع: How many apples? / How many shirts?\n\n" +
                    "🔸 در خرید:\n" +
                    "• How much is this jacket? — It's $60.\n" +
                    "• How much are these shoes? — They're $40.\n" +
                    "• How many would you like? — Three, please.\n\n" +
                    "⚠️ ❌ How much are this? → ✅ How much is this?"),
                GrammarSection("📌 This / That / These / Those در خرید",
                    "🔹 انتخاب:\n" +
                    "• This shirt (این پیراهن - نزدیک، مفرد)\n" +
                    "• That shirt (اون پیراهن - دور، مفرد)\n" +
                    "• These shoes (این کفش‌ها - نزدیک، جمع)\n" +
                    "• Those shoes (اون کفش‌ها - دور، جمع)\n\n" +
                    "⚠️ اشتباهات:\n" +
                    "❌ This shoes → ✅ These shoes\n" +
                    "❌ That shoes → ✅ Those shoes\n" +
                    "❌ How much are this? → ✅ How much is this?"),
                GrammarSection("📌 درخواست مؤدبانه در خرید",
                    "🔹 ساختارهای مؤدبانه:\n" +
                    "• Can I try this on? (می‌تونم امتحانش کنم؟)\n" +
                    "• Could you show me...? (می‌تونید نشونم بدید؟)\n" +
                    "• Do you have this in a larger size?\n" +
                    "• Would you happen to have...? (رسمی‌تر)\n" +
                    "• I'd like to... (می‌خوام...)\n\n" +
                    "🔸 مثال:\n" +
                    "• I'd like to return this, please.\n" +
                    "• Could you gift-wrap it for me?"),
                GrammarSection("📌 تفاوت buy / pay / cost / spend",
                    "🔹 این چهار فعل خیلی اشتباه می‌شن:\n" +
                    "• Buy = خریدن: I bought a shirt. (فاعل: خریدار)\n" +
                    "• Pay = پرداخت کردن: I paid $30 for it. (فاعل: پرداخت‌کننده)\n" +
                    "• Cost = قیمت داشتن: It cost me $30. (فاعل: جنس)\n" +
                    "• Spend = خرج کردن: I spent $30 on it. (فاعل: خرج‌کننده)\n\n" +
                    "💡 buy با کالا، pay با پول، cost با جنس، spend با پول/زمان."),
                GrammarSection("📌 Present Continuous برای خرید",
                    "🔹 وقتی در حال خرید هستی:\n" +
                    "• I'm just looking, thanks. (فقط دارم نگاه می‌کنم)\n" +
                    "• I'm trying to find a gift for my mom.\n" +
                    "• She's looking at the dresses.\n\n" +
                    "💡 Present Continuous برای لحظه فعلی، Present Simple برای عادت."),
                GrammarSection("📌 a / an / the در خرید",
                    "🔹 حرف تعریف:\n" +
                    "• a/an + مفرد نامشخص: I'm looking for a gift.\n" +
                    "• the + مشخص: The shirt you showed me is nice.\n" +
                    "• بدون حرف تعریف: I need shoes. (جمع کلی)\n\n" +
                    "💡 اگه جنس خاصی مدنظرت باشه، the میاد."),
                GrammarSection("📌 درخواست تخفیف و چانه‌زنی مؤدبانه",
                    "🔹 جملات مؤدبانه:\n" +
                    "• Is there any discount on this?\n" +
                    "• Could you do better on the price?\n" +
                    "• Can you give me a better deal?\n" +
                    "• Would you take $50 for it?\n\n" +
                    "🔸 پاسخ فروشنده:\n" +
                    "• I can give you 10% off.\n" +
                    "• That's the best I can do.\n" +
                    "• Sorry, the price is fixed."),
                GrammarSection("📌 روش‌های پرداخت",
                    "🔹 جملات رایج:\n" +
                    "• Do you take cash?\n" +
                    "• Can I pay by card?\n" +
                    "• Do you accept Apple Pay?\n" +
                    "• I'll pay in cash.\n" +
                    "• Can I pay in installments?\n\n" +
                    "💡 pay in cash = نقد، pay by card = کارت، pay online = آنلاین.")
            ),
            commonMistakes = listOf(
                CommonMistake("How much these?", "How much are these?", "برای جمع از are استفاده کن."),
                CommonMistake("How much is these shoes?", "How much are these shoes?", "shoes جمع است، are."),
                CommonMistake("How many is this?", "How much is this?", "برای قیمت از how much."),
                CommonMistake("This shoes are nice.", "These shoes are nice.", "shoes جمع است، These."),
                CommonMistake("It costs me 30 dollars.", "It cost me 30 dollars.", "cost در گذشته هم cost."),
                CommonMistake("I paid 30 dollars for it.", "I paid 30 dollars for it.", "این درسته."),
                CommonMistake("I spent 30 dollars for it.", "I spent 30 dollars on it.", "spend با on میاد."),
                CommonMistake("Can I try this in?", "Can I try this on?", "try on (پرو کردن)، نه try in."),
                CommonMistake("I want to refund this.", "I want a refund for this. / I want to return this.", "refund اسمه."),
                CommonMistake("Where is the box?", "Where is the checkout?", "در خرید از checkout استفاده کن."),
                CommonMistake("Cash please", "In cash, please.", "pay in cash، نه cash به تنهایی."),
                CommonMistake("How much cost this?", "How much does this cost?", "ساختار صحیح: How much does it cost?")
            ),
            conversation = listOf(
                DialogueLine("A", "Excuse me, how much is this jacket?",
                    "ببخشید، این کاپشن چنده؟"),
                DialogueLine("B", "It's seventy-five dollars.",
                    "هفتاد و پنج دلار."),
                DialogueLine("A", "Wow, that's a bit expensive. Is there any discount?",
                    "واو، یه کم گرونه. تخفیف دارید؟"),
                DialogueLine("B", "Yes, actually. It's 20% off today — so it's sixty dollars.",
                    "بله، راستش. امروز ۲۰٪ تخفیف داره — پس شصت دلار می‌شه."),
                DialogueLine("A", "That's better. Can I try it on?",
                    "این بهتره. می‌تونم امتحانش کنم؟"),
                DialogueLine("B", "Of course. The fitting room is over there.",
                    "البته. اتاق پرو اونجاست."),
                DialogueLine("A", "Thanks. (چند لحظه بعد) It fits well, but do you have it in blue?",
                    "ممنون. (چند لحظه بعد) اندازه‌ست، ولی آبی‌اش رو دارید؟"),
                DialogueLine("B", "Let me check. Yes, we have it in blue. Same size?",
                    "بذار چک کنم. بله، آبی‌اش رو داریم. همون سایز؟"),
                DialogueLine("A", "Yes, please. Medium.",
                    "بله، لطفاً. مدیوم."),
                DialogueLine("B", "Here you go. Would you like to try this one on too?",
                    "بفرما. می‌خواید این رو هم امتحان کنید؟"),
                DialogueLine("A", "Sure. (بعد از پرو) This one is perfect. I'll take it.",
                    "حتماً. (بعد از پرو) این عالیه. این رو می‌خرم."),
                DialogueLine("B", "Great choice. How would you like to pay?",
                    "انتخاب خوبیه. چطور می‌خواید پرداخت کنید؟"),
                DialogueLine("A", "Can I pay by card?",
                    "می‌تونم با کارت پرداخت کنم؟"),
                DialogueLine("B", "Of course. Please insert your card here.",
                    "البته. لطفاً کارتتون رو اینجا وارد کنید."),
                DialogueLine("A", "Done. Can I have the receipt, please?",
                    "انجام شد. می‌تونم رسید بگیرم، لطفاً؟"),
                DialogueLine("B", "Here's your receipt. You have 30 days to return it if needed.",
                    "اینم رسیدتون. اگه لازم شد، ۳۰ روز وقت دارید که پسش بدید."),
                DialogueLine("A", "Perfect. Thanks for your help!",
                    "عالی. ممنون از کمکتون!"),
                DialogueLine("B", "You're welcome. Have a great day!",
                    "خواهش می‌کنم. روز خوبی داشته باشید!"),
                DialogueLine("A", "You too!",
                    "شما هم!"),
                DialogueLine("B", "Come back soon!",
                    "به‌زودی برگردید!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("قیمت اولیه کاپشن چقدر بود؟",
                    "هفتاد و پنج دلار."),
                ComprehensionQuestion("چقدر تخفیف داشت و قیمت نهایی چقدر شد؟",
                    "۲۰٪ تخفیف داشت و قیمت نهایی شصت دلار شد."),
                ComprehensionQuestion("مشتری چه رنگی رو درخواست کرد؟",
                    "آبی."),
                ComprehensionQuestion("چطور پرداخت کرد؟",
                    "با کارت اعتباری."),
                ComprehensionQuestion("چند روز فرصت بازگشت کالا داشت؟",
                    "۳۰ روز.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Buy a shirt at a store.",
                    "نقش‌بازی: در یک فروشگاه یک پیراهن بخر.",
                    "از How much is this? / Can I try it on? استفاده کن."),
                SpeakingTask("Ask for a discount.",
                    "درخواست تخفیف کن.",
                    "از Is there any discount? / Could you do better on the price? استفاده کن."),
                SpeakingTask("Return a broken item.",
                    "نقش‌بازی: یه جنس شکسته رو پس بده.",
                    "از I'd like a refund because... استفاده کن."),
                SpeakingTask("Compare prices at two stores.",
                    "قیمت‌ها رو در دو فروشگاه مقایسه کن.",
                    "از cheaper than, more expensive than استفاده کن."),
                SpeakingTask("Describe a recent purchase.",
                    "خرید اخیرت رو توصیف کن.",
                    "از I bought... / It cost me... / It was on sale استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Write about your last shopping trip.",
                    "درباره آخرین خریدت بنویس.",
                    120,
                    "شامل: کجا، چی خریدی، چقدر، چرا"),
                WritingTask("Write a complaint email to a store.",
                    "یک ایمیل شکایت به یک فروشگاه بنویس.",
                    150,
                    "شامل: مشکل، درخواست، اطلاعات خرید"),
                WritingTask("Compare two products you want to buy.",
                    "دو محصولی که می‌خوای بخری رو مقایسه کن.",
                    180,
                    "شامل: قیمت، کیفیت، مزایا و معایب")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Discount» چیست؟",
                    listOf("افزایش", "تخفیف", "رسید", "مالیات"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("How much these?", "How much are these?", "How many are these?", "How these much?"), 1),
                QuizQuestion("معنی «Receipt» چیست؟",
                    listOf("قیمت", "رسید", "پول خرد", "کیسه"), 1),
                QuizQuestion("معنی «Expensive» چیست؟",
                    listOf("ارزان", "گران", "متوسط", "رایگان"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("How much is this?", "How much are this?", "How many is this?", "How is this much?"), 0),
                QuizQuestion("معنی «Cash» چیست؟",
                    listOf("کارت", "چک", "پول نقد", "وام"), 2),
                QuizQuestion("«How much are these?» جواب؟",
                    listOf("It's 10 dollars.", "They're 10 dollars.", "Is 10 dollars.", "Are 10 dollars."), 1),
                QuizQuestion("معنی «Customer» چیست؟",
                    listOf("فروشنده", "مشتری", "مدیر", "کارمند"), 1),
                QuizQuestion("تفاوت cost و pay؟",
                    listOf("هیچ فرقی ندارند", "cost قیمت داشتن، pay پرداخت کردن", "pay قیمت داشتن", "cost فقط برای اشیا"), 1),
                QuizQuestion("«try on» یعنی؟",
                    listOf("تلاش کردن", "پرو کردن", "پوشیدن", "خریدن"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("I spent 30 dollars for it.", "I spent 30 dollars on it.", "I spent 30 dollars in it.", "I spent 30 dollars at it."), 1),
                QuizQuestion("«on sale» یعنی؟",
                    listOf("برای فروش", "حراج شده", "در فروشگاه", "گران"), 1),
                QuizQuestion("معنی «bargain» چیست؟",
                    listOf("چانه زدن / معامله خوب", "گران", "ارزان", "حراج"), 0),
                QuizQuestion("کدام مؤدبانه‌تره؟",
                    listOf("Give me the shirt.", "Could you show me the shirt?", "I want the shirt.", "Shirt!"), 1),
                QuizQuestion("معنی «Shop around» چیست؟",
                    listOf("خرید کردن", "قیمت‌ها رو مقایسه کردن", "فروشگاه رفتن", "فروشگاه باز کردن"), 1)
            )
        )// ادامه‌ی فایل TopNotchRepository.kt - این دو فصل را قبل از else اضافه کن.

        10 -> LessonContent("top_notch_1", 10, "Food", "غذا",
            objectives = listOf(
                "یادگیری ۱۵ واژه مربوط به غذا و نوشیدنی",
                "استفاده از some / any در جملات مثبت، منفی و سوال",
                "تفاوت اسم‌های قابل شمارش و غیرقابل شمارش",
                "سفارش غذا در رستوران",
                "صحبت درباره رژیم غذایی و ترجیحات",
                "بیان مقدار با a lot of, a few, a little"
            ),
            vocabulary = listOf(
                VocabWord("Bread", "نان", "bred", "n",
                    "I usually buy fresh bread from the bakery.",
                    "معمولاً نان تازه از نانوایی می‌خرم.",
                    "a slice of bread / fresh bread / bread and butter",
                    "loaf", "",
                    "bread (n) / breadwinner (n)", "neutral",
                    "💡 bread غیرقابل شمارشه: a loaf of bread، نه a bread."),
                VocabWord("Cheese", "پنیر", "tʃiːz", "n",
                    "Would you like some cheese with your bread?",
                    "با نانت پنیر می‌خوای؟",
                    "a slice of cheese / melted cheese / cheese and crackers",
                    "dairy product", "",
                    "cheese (n) / cheesy (adj)", "neutral",
                    "💡 cheese غیرقابل شمارشه: a piece of cheese."),
                VocabWord("Egg", "تخم‌مرغ", "eɡ", "n",
                    "I eat two boiled eggs for breakfast.",
                    "صبحانه دو تا تخم‌مرغ آب‌پز می‌خورم.",
                    "a boiled egg / a fried egg / scrambled eggs",
                    "ovum", "",
                    "egg (n) / eggplant (n)", "neutral",
                    "💡 egg قابل شمارشه: two eggs / an egg."),
                VocabWord("Milk", "شیر", "mɪlk", "n",
                    "Do you want milk in your coffee?",
                    "توی قهوه‌ات شیر می‌خوای؟",
                    "a glass of milk / skim milk / whole milk",
                    "dairy drink", "",
                    "milk (n/v) / milky (adj) / milkshake (n)", "neutral",
                    "💡 milk غیرقابل شمارشه: a glass of milk."),
                VocabWord("Meat", "گوشت", "miːt", "n",
                    "I don't eat much red meat these days.",
                    "این روزها گوشت قرمز زیاد نمی‌خورم.",
                    "red meat / white meat / raw meat",
                    "beef, pork, chicken", "",
                    "meat (n) / meaty (adj) / meatball (n)", "neutral",
                    "💡 meat غیرقابل شمارشه: a piece of meat."),
                VocabWord("Rice", "برنج", "raɪs", "n",
                    "We eat rice with almost every meal.",
                    "ما با تقریباً هر وعده برنج می‌خوریم.",
                    "a bowl of rice / fried rice / brown rice",
                    "grain", "",
                    "rice (n) / rice paddy (n)", "neutral",
                    "💡 rice غیرقابل شمارشه: a bowl of rice."),
                VocabWord("Fruit", "میوه", "fruːt", "n",
                    "You should eat more fruit and vegetables.",
                    "باید میوه و سبزیجات بیشتری بخوری.",
                    "fresh fruit / tropical fruit / a piece of fruit",
                    "produce", "",
                    "fruit (n) / fruitful (adj) / fruity (adj)", "neutral",
                    "💡 fruit غیرقابل شمارشه: some fruit، نه some fruits (در انگلیسی آمریکایی)."),
                VocabWord("Vegetable", "سبزیجات", "ˈvedʒtəbəl", "n",
                    "I try to eat vegetables with every meal.",
                    "سعی می‌کنم با هر وعده سبزیجات بخورم.",
                    "green vegetables / fresh vegetables / steamed vegetables",
                    "veggies (غیررسمی)", "",
                    "vegetable (n) / vegetarian (n/adj)", "neutral",
                    "💡 تلفظش /ˈvedʒ.tə.bəl/ (سه سیلاب، نه چهار)."),
                VocabWord("Chicken", "مرغ", "ˈtʃɪkɪn", "n",
                    "Grilled chicken is my favorite dish.",
                    "مرغ گریل غذای مورد علاقه‌مه.",
                    "fried chicken / grilled chicken / roast chicken",
                    "poultry", "",
                    "chicken (n) / chick (n)", "neutral",
                    "💡 chicken هم پرنده، هم گوشت. قابل شمارش: a chicken."),
                VocabWord("Fish", "ماهی", "fɪʃ", "n",
                    "We eat fish on Fridays.",
                    "جمعه‌ها ماهی می‌خوریم.",
                    "fresh fish / fried fish / fish and chips",
                    "seafood", "",
                    "fish (n/v) / fishing (n) / fisherman (n)", "neutral",
                    "💡 جمعش هم fish (چند تا ماهی) یا fishes (گونه‌ها)."),
                VocabWord("Water", "آب", "ˈwɔːtər", "n",
                    "Can I have a glass of water, please?",
                    "می‌تونم یه لیوان آب داشته باشم، لطفاً؟",
                    "a bottle of water / sparkling water / tap water",
                    "H2O", "",
                    "water (n/v) / watery (adj)", "neutral",
                    "💡 water غیرقابل شمارشه: a glass/bottle of water."),
                VocabWord("Juice", "آبمیوه", "dʒuːs", "n",
                    "I drink orange juice every morning.",
                    "هر صبح آب‌پرتقال می‌خورم.",
                    "a glass of juice / fresh juice / orange juice",
                    "beverage", "",
                    "juice (n) / juicy (adj)", "neutral",
                    "💡 juice غیرقابل شمارشه: a glass of juice."),
                VocabWord("Coffee", "قهوه", "ˈkɔːfi", "n",
                    "Would you like a cup of coffee?",
                    "یه فنجون قهوه می‌خوای؟",
                    "a cup of coffee / black coffee / iced coffee",
                    "espresso, latte", "",
                    "coffee (n) / caffeine (n) / café (n)", "neutral",
                    "💡 coffee غیرقابل شمارشه: a cup of coffee، ولی دو تا قهوه = two coffees."),
                VocabWord("Tea", "چای", "tiː", "n",
                    "I prefer tea to coffee in the evening.",
                    "عصرها چای رو به قهوه ترجیح می‌دم.",
                    "a cup of tea / green tea / herbal tea",
                    "chai", "",
                    "tea (n) / teapot (n)", "neutral",
                    "💡 tea غیرقابل شمارشه، ولی a cup of tea."),
                VocabWord("Salt", "نمک", "sɔːlt", "n",
                    "Can you pass me the salt, please?",
                    "می‌تونی نمک رو بدی، لطفاً؟",
                    "a pinch of salt / table salt / sea salt",
                    "seasoning", "",
                    "salt (n/v) / salty (adj)", "neutral",
                    "💡 salt غیرقابل شمارشه: a pinch of salt.")
            ),
            idioms = listOf(
                IdiomExpression("Piece of cake", "خیلی راحت",
                    "The exam was a piece of cake!",
                    "امتحان خیلی راحت بود!", "informal"),
                IdiomExpression("Spill the beans", "لو دادن راز",
                    "Don't spill the beans about the surprise party!",
                    "راز مهمونی سورپرایز رو لو نده!", "idiom"),
                IdiomExpression("Apple of my eye", "نور چشم",
                    "My daughter is the apple of my eye.",
                    "دخترم نور چشممه.", "idiom"),
                IdiomExpression("Butter someone up", "چاپلوسی کردن",
                    "He tried to butter up the boss before the review.",
                    "قبل از ارزیابی سعی کرد از رئیس چاپلوسی کنه.", "informal"),
                IdiomExpression("You are what you eat", "تو همون چیزی هستی که می‌خوری",
                    "You are what you eat — eat healthy!",
                    "تو همون چیزی هستی که می‌خوری — سالم بخور!", "idiom"),
                IdiomExpression("A recipe for disaster", "نقشه‌ای برای فاجعه",
                    "Driving in the rain without brakes is a recipe for disaster.",
                    "رانندگی زیر بارون بدون ترمز، نقشه‌ایه برای فاجعه.", "idiom"),
                IdiomExpression("Food for thought", "مایه‌ای برای تفکر",
                    "His speech gave me food for thought.",
                    "سخنرانی‌اش به من مایه‌ای برای تفکر داد.", "idiom"),
                IdiomExpression("Out to lunch", "حواس‌پرت / دیوانه",
                    "He seems out to lunch today.",
                    "امروز به نظر می‌رسه حواسش پرته.", "informal"),
                IdiomExpression("Not my cup of tea", "به سلیقه‌ام نمی‌خوره",
                    "Horror movies are not my cup of tea.",
                    "فیلم‌های ترسناک به سلیقه‌ام نمی‌خورن.", "informal"),
                IdiomExpression("Eat like a horse", "مثل اسب خوردن",
                    "He eats like a horse but never gains weight.",
                    "مثل اسب می‌خوره ولی هیچ‌وقت وزن اضافه نمی‌کنه.", "idiom")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("eat out", "بیرون غذا خوردن",
                    "بیرون غذا خوردن",
                    "We eat out every Friday night.",
                    "هر جمعه شب بیرون غذا می‌خوریم.", "غیرقابل جدا شدن"),
                PhrasalVerb("cut down on", "کم کردن",
                    "کم کردن",
                    "I'm trying to cut down on sugar.",
                    "سعی می‌کنم شکر رو کم کنم.", "غیرقابل جدا شدن"),
                PhrasalVerb("live on", "زندگی کردن با",
                    "زندگی کردن با",
                    "You can't live on junk food alone.",
                    "نمی‌تونی فقط با فست‌فود زندگی کنی.", "غیرقابل جدا شدن"),
                PhrasalVerb("whip up", "سریع درست کردن",
                    "سریع درست کردن",
                    "I'll whip up something quick for dinner.",
                    "یه چیز سریع برای شام درست می‌کنم.", "جدا شدنی"),
                PhrasalVerb("pig out", "پرخوری کردن",
                    "پرخوری کردن",
                    "We pigged out on pizza last night.",
                    "دیشب روی پیتزا پرخوری کردیم.", "غیرقابل جدا شدن"),
                PhrasalVerb("go off", "خراب شدن (غذا)",
                    "خراب شدن",
                    "The milk has gone off — throw it away.",
                    "شیر خراب شده — دورش بریز.", "غیرقابل جدا شدن"),
                PhrasalVerb("pick at", "کم‌کم خوردن",
                    "کم‌کم خوردن",
                    "She just picked at her food.",
                    "فقط یه کم غذا خورد.", "غیرقابل جدا شدن"),
                PhrasalVerb("dish out", "کشیدن غذا / پخش کردن",
                    "کشیدن غذا",
                    "He dished out the rice for everyone.",
                    "برای همه برنج کشید.", "جدا شدنی")
            ),
            pronunciationTips = listOf(
                PronunciationTip("تلفظ vegetables",
                    "🔊 در گفتار سریع:\n" +
                    "• vegetables → /ˈvedʒ.tə.bəlz/ (سه سیلاب)\n" +
                    "• گاهی حتی → /ˈvedʒ.tə.bəlz/\n\n" +
                    "💡 خیلی‌ها اشتباهاً چهار سیلاب می‌گن: ve-ge-ta-bles."),
                PronunciationTip("تلفظ food و drink",
                    "🔊 فرق بین:\n" +
                    "• food /fuːd/ (او بلند)\n" +
                    "• foot /fʊt/ (او کوتاه)\n" +
                    "• drink /drɪŋk/ (i کوتاه)\n" +
                    "• drank /dræŋk/ (a باز)\n\n" +
                    "💡 food و foot اشتباه نشن!"),
                PronunciationTip("استرس در واژه‌های غذایی",
                    "🔊 استرس:\n" +
                    "• RESTaurant /ˈres.tə.rɑːnt/ (نه restau-RANT)\n" +
                    "• VEgetable /ˈvedʒ.tə.bəl/\n" +
                    "• CHOColate /ˈtʃɑːk.lət/ (سه سیلاب)\n" +
                    "• ESPECIALLY /ɪˈspeʃ.ə.li/ (چهار سیلاب)\n\n" +
                    "💡 دقت کن این واژه‌ها رو درست استرس بذاری.")
            ),
            culturalNotes = listOf(
                CulturalNote("تیپ کردن در رستوران‌های آمریکایی",
                    "🌍 در آمریکا، تیپ دادن در رستوران اجباریه:\n" +
                    "• 15% = سرویس معمولی\n" +
                    "• 18-20% = سرویس خوب\n" +
                    "• 20%+ = سرویس عالی\n\n" +
                    "💡 در اروپا، سرویس charge گاهی در صورت‌حساب هست، تیپ اختیاریه."),
                CulturalNote("سفارش قهوه در آمریکا",
                    "🌍 در آمریکا، سفارش قهوه پیچیده‌ست:\n" +
                    "• Black coffee = بدون شیر\n" +
                    "• With cream/sugar = با خامه/شکر\n" +
                    "• Latte, Cappuccino, Americano, Espresso\n" +
                    "• Iced coffee = قهوه سرد\n" +
                    "• Tall / Grande / Venti (استارباکس)\n\n" +
                    "💡 در آمریکا، دوباره پر کردن (refill) قهوه معمولاً رایگانه."),
                CulturalNote("وعده‌های غذایی در غرب",
                    "🌍 وعده‌ها:\n" +
                    "• Breakfast = صبحانه (۷-۹ صبح)\n" +
                    "• Brunch = صبحانه-ناهار (۱۰-۱۲، آخر هفته)\n" +
                    "• Lunch = ناهار (۱۲-۲)\n" +
                    "• Afternoon tea = عصرانه (۴-۵، در بریتانیا)\n" +
                    "• Dinner = شام (۷-۹)\n" +
                    "• Supper = شام سبک (اواخر شب)\n\n" +
                    "💡 در آمریکا dinner = شام اصلی، در بریتانیا گاهی tea = شام."),
                CulturalNote("فرهنگ رژیم غذایی",
                    "🌍 رژیم‌های رایج در غرب:\n" +
                    "• Vegetarian = گیاه‌خوار (گوشت نمی‌خوره)\n" +
                    "• Vegan = وگان (هیچ محصول حیوانی)\n" +
                    "• Keto = کتوژنیک (کم کربوهیدرات)\n" +
                    "• Gluten-free = بدون گلوتن\n" +
                    "• Paleo = پالئو (غذای اجدادی)\n\n" +
                    "💡 در رستوران‌های غربی معمولاً گزینه‌های ویژه این رژیم‌ها هست.")
            ),
            grammar = listOf(
                GrammarSection("📌 Some / Any",
                    "🔹 قاعده:\n" +
                    "• Some در جملات مثبت: I have some bread.\n" +
                    "• Any در جملات منفی و سوال: I don't have any milk. / Do you have any eggs?\n\n" +
                    "🔸 استثنا (سوال مؤدبانه):\n" +
                    "• Would you like some coffee? (پیشنهاد)\n" +
                    "• Can I have some water? (درخواست)\n\n" +
                    "⚠️ اشتباهات:\n" +
                    "❌ I have any bread. → ✅ I have some bread.\n" +
                    "❌ I don't have some milk. → ✅ I don't have any milk."),
                GrammarSection("📌 Countable / Uncountable",
                    "🔹 اسم‌های قابل شمارش (Countable):\n" +
                    "• egg → eggs / apple → apples / sandwich → sandwiches\n" +
                    "• می‌تونن با a/an بیان: an egg / a sandwich\n" +
                    "• جمع بسته می‌شن: two eggs\n\n" +
                    "🔸 غیرقابل شمارش (Uncountable):\n" +
                    "• milk, water, rice, bread, meat, cheese, sugar, salt, coffee, tea\n" +
                    "• بدون a/an: ❌ a milk → ✅ some milk\n" +
                    "• جمع بسته نمی‌شن: ❌ two milks\n\n" +
                    "💡 برای شمردنشون از واحد استفاده کن: a glass of milk / a slice of bread."),
                GrammarSection("📌 Quantifiers (کمیت‌نماها)",
                    "🔹 برای اسم‌های غیرقابل شمارش:\n" +
                    "• a little = کمی: a little sugar\n" +
                    "• much = زیاد (در منفی/سوال): I don't have much time.\n" +
                    "• a lot of = زیاد: a lot of water\n\n" +
                    "🔸 برای اسم‌های قابل شمارش:\n" +
                    "• a few = چند تا: a few apples\n" +
                    "• many = زیاد (در منفی/سوال): How many eggs?\n" +
                    "• a lot of = زیاد: a lot of eggs\n\n" +
                    "⚠️ ❌ a little apples → ✅ a few apples\n" +
                    "❌ many milk → ✅ much milk"),
                GrammarSection("📌 سفارش در رستوران",
                    "🔹 جملات رایج:\n" +
                    "• I'd like... / I'll have...\n" +
                    "• Can I have the menu, please?\n" +
                    "• Could we have the bill, please?\n" +
                    "• What do you recommend?\n" +
                    "• Is this dish spicy?\n\n" +
                    "🔸 پاسخ:\n" +
                    "• I'd like a coffee, please. / I'll have the steak.\n" +
                    "• Here's your bill. / Enjoy your meal!"),
                GrammarSection("📌 Would like vs Do you want",
                    "🔹 فرق بین مؤدبانه و غیررسمی:\n" +
                    "• Would you like some tea? (مؤدبانه)\n" +
                    "• Do you want some tea? (غیررسمی)\n" +
                    "• I'd like a coffee, please. (مؤدبانه)\n" +
                    "• I want a coffee. (غیررسمی، گاهی بی‌ادب)\n\n" +
                    "💡 would like همیشه مؤدبانه‌تره."),
                GrammarSection("📌 How much / How many با غذا",
                    "🔹 در سفارش غذا:\n" +
                    "• How much + غیرقابل شمارش: How much sugar do you want?\n" +
                    "• How many + قابل شمارش جمع: How many eggs?\n\n" +
                    "💡 How much = مقدار، How many = تعداد."),
                GrammarSection("📌 افعال رایج در آشپزی",
                    "🔹 افعال مهم:\n" +
                    "• cook = پختن\n" +
                    "• bake = در فر پختن\n" +
                    "• fry = سرخ کردن\n" +
                    "• boil = آب‌پز کردن\n" +
                    "• grill = گریل کردن\n" +
                    "• roast = تنوری کردن\n" +
                    "• steam = بخارپز کردن\n\n" +
                    "💡 I baked a cake. / She fried some eggs."),
                GrammarSection("📌 رژیم غذایی و عادت‌ها",
                    "🔹 ساختارها:\n" +
                    "• I'm on a diet. (رژیم دارم)\n" +
                    "• I'm trying to lose weight. (دارم سعی می‌کنم وزن کم کنم)\n" +
                    "• I don't eat meat. (گوشت نمی‌خورم)\n" +
                    "• I'm allergic to nuts. (به آجیل حساسیت دارم)\n" +
                    "• I'm a vegetarian. (گیاه‌خوارم)\n\n" +
                    "💡 این جملات در رستوران‌های خارجی خیلی مهمن.")
            ),
            commonMistakes = listOf(
                CommonMistake("I have any bread.", "I have some bread.", "در مثبت از some."),
                CommonMistake("I don't have some milk.", "I don't have any milk.", "در منفی از any."),
                CommonMistake("a bread", "a loaf of bread / some bread", "bread غیرقابل شمارشه."),
                CommonMistake("two milks", "two glasses of milk", "برای شمارش، واحد لازمه."),
                CommonMistake("a little apples", "a few apples", "apples قابل شمارشه."),
                CommonMistake("many milk", "much milk", "milk غیرقابل شمارشه."),
                CommonMistake("I want a coffee.", "I'd like a coffee, please.", "مؤدبانه‌تره."),
                CommonMistake("How much eggs?", "How many eggs?", "eggs قابل شمارشه."),
                CommonMistake("Two breads, please.", "Two loaves of bread, please.", "bread غیرقابل شمارشه."),
                CommonMistake("I like coffee very much.", "I like coffee very much.", "این درسته."),
                CommonMistake("Do you have some water?", "Do you have any water?", "در سوال معمولی any."),
                CommonMistake("I eat much fruit.", "I eat a lot of fruit.", "در مثبت از a lot of استفاده کن.")
            ),
            conversation = listOf(
                DialogueLine("A", "Good evening. Do you have a reservation?",
                    "شب بخیر. رزرو دارید؟"),
                DialogueLine("B", "Yes, a table for two under the name Sara.",
                    "بله، میزی برای دو نفر به نام سارا."),
                DialogueLine("A", "This way, please. Here's your menu.",
                    "از این طرف، لطفاً. بفرمایید منو."),
                DialogueLine("B", "Thank you. What do you recommend?",
                    "ممنون. چی پیشنهاد می‌کنید؟"),
                DialogueLine("A", "The grilled chicken is excellent tonight.",
                    "مرغ گریل امشب عالیه."),
                DialogueLine("B", "Sounds good. I'd like that, please.",
                    "خوبه. اون رو می‌خوام، لطفاً."),
                DialogueLine("A", "Would you like an appetizer?",
                    "پیش‌غذا می‌خواید؟"),
                DialogueLine("B", "Yes, a garden salad, please.",
                    "بله، سالاد باغ، لطفاً."),
                DialogueLine("A", "And to drink?",
                    "و برای نوشیدن؟"),
                DialogueLine("B", "Just water, please. And the bill later.",
                    "فقط آب، لطفاً. و بعداً صورت‌حساب."),
                DialogueLine("A", "Is everything OK with your meal?",
                    "همه چیز با غذاتون خوبه؟"),
                DialogueLine("B", "Yes, it's delicious, thank you.",
                    "بله، خوشمزه‌ست، ممنون."),
                DialogueLine("A", "Would you like some dessert?",
                    "دسر می‌خواید؟"),
                DialogueLine("B", "No, thanks. Just the bill, please.",
                    "نه، ممنون. فقط صورت‌حساب، لطفاً."),
                DialogueLine("A", "Here's your bill. Cash or card?",
                    "اینم صورت‌حساب. نقد یا کارت؟"),
                DialogueLine("B", "Card, please. And here's your tip.",
                    "کارت، لطفاً. و اینم انعامتون."),
                DialogueLine("A", "Thank you so much! Have a great evening!",
                    "خیلی ممنون! شب خوبی داشته باشید!"),
                DialogueLine("B", "You too. The food was amazing!",
                    "شما هم. غذا فوق‌العاده بود!"),
                DialogueLine("A", "Come back soon!",
                    "به‌زودی برگردید!"),
                DialogueLine("B", "We will!",
                    "حتماً!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("مشتری چه چیزی سفارش داد؟",
                    "مرغ گریل و سالاد باغ."),
                ComprehensionQuestion("چه نوشیدنی سفارش داد؟",
                    "فقط آب."),
                ComprehensionQuestion("دسر خواست؟",
                    "نه، فقط صورت‌حساب خواست."),
                ComprehensionQuestion("چطور پرداخت کرد؟",
                    "با کارت."),
                ComprehensionQuestion("انعام داد؟",
                    "بله، انعام داد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Order food at a restaurant.",
                    "نقش‌بازی: در رستوران غذا سفارش بده.",
                    "از I'd like... / I'll have... استفاده کن."),
                SpeakingTask("Talk about your favorite food.",
                    "درباره غذای مورد علاقه‌ات صحبت کن.",
                    "از My favorite food is... because... استفاده کن."),
                SpeakingTask("Describe your diet.",
                    "رژیم غذایی‌ت رو توصیف کن.",
                    "از I usually eat... / I don't eat... استفاده کن."),
                SpeakingTask("Ask for the bill and pay.",
                    "صورت‌حساب بخواه و پرداخت کن.",
                    "از Could we have the bill? / Can I pay by card? استفاده کن."),
                SpeakingTask("Talk about a food you dislike.",
                    "درباره غذایی که دوست نداری صحبت کن.",
                    "از I don't like... / I can't stand... استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Describe your favorite meal.",
                    "غذای مورد علاقه‌ات رو توصیف کن.",
                    120,
                    "شامل: چه غذایی، مواد لازم، چرا دوستش داری"),
                WritingTask("Write a restaurant review.",
                    "یک نقد رستوران بنویس.",
                    150,
                    "شامل: غذا، خدمات، قیمت، نظر کلی"),
                WritingTask("Write about healthy eating.",
                    "درباره تغذیه سالم بنویس.",
                    180,
                    "شامل: عادات سالم، چرا مهمه، چطور شروع کنیم")
            ),
            quiz = listOf(
                QuizQuestion("کدام درست است؟",
                    listOf("I have some bread.", "I have any bread.", "I have a bread.", "I have breads."), 0),
                QuizQuestion("معنی «Vegetable» چیست؟",
                    listOf("میوه", "گوشت", "سبزیجات", "نان"), 2),
                QuizQuestion("کدام غیرقابل شمارش است؟",
                    listOf("apple", "egg", "milk", "book"), 2),
                QuizQuestion("در سوال از کدام استفاده می‌کنیم؟",
                    listOf("some", "any", "a", "the"), 1),
                QuizQuestion("«I don't have ___ milk.»",
                    listOf("some", "any", "a", "an"), 1),
                QuizQuestion("معنی «Chicken» چیست؟",
                    listOf("گوشت", "مرغ", "ماهی", "تخم‌مرغ"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("two breads", "two bread", "two loaves of bread", "two breads"), 2),
                QuizQuestion("معنی «Juice» چیست؟",
                    listOf("آب", "چای", "آبمیوه", "شیر"), 2),
                QuizQuestion("کدام قابل شمارشه؟",
                    listOf("water", "rice", "egg", "milk"), 2),
                QuizQuestion("«How ___ eggs do you want?»",
                    listOf("much", "many", "some", "any"), 1),
                QuizQuestion("کدام مؤدبانه‌تره؟",
                    listOf("I want coffee.", "I'd like a coffee, please.", "Give me coffee.", "Coffee!"), 1),
                QuizQuestion("معنی «cut down on» چیست؟",
                    listOf("افزودن", "کم کردن", "خوردن", "خریدن"), 1),
                QuizQuestion("«a few» با کدام میاد؟",
                    listOf("milk", "apples", "water", "bread"), 1),
                QuizQuestion("«a little» با کدام میاد؟",
                    listOf("eggs", "sugar", "apples", "books"), 1),
                QuizQuestion("معنی «Piece of cake» چیست؟",
                    listOf("تکه کیک", "خیلی راحت", "شیرینی", "دسر"), 1)
            )
        )

        11 -> LessonContent("top_notch_1", 11, "Health", "سلامتی",
            objectives = listOf(
                "یادگیری ۱۵ واژه مربوط به سلامت و بیماری",
                "استفاده از Should / Shouldn't برای توصیه",
                "بیان درد و علائم بیماری",
                "مکالمه با پزشک و داروساز",
                "توصیه کردن به دوست بیمار",
                "صحبت درباره عادات سالم"
            ),
            vocabulary = listOf(
                VocabWord("Headache", "سردرد", "ˈhedeɪk", "n",
                    "I have a terrible headache today.",
                    "امروز سردرد وحشتناکی دارم.",
                    "a splitting headache / get a headache / have a headache",
                    "migraine", "",
                    "head (n) / headache (n) / headachy (adj)", "neutral",
                    "💡 I have a headache (نه my head hurts — این هم درسته)."),
                VocabWord("Stomachache", "دل‌درد", "ˈstʌməkeɪk", "n",
                    "She stayed home because of a stomachache.",
                    "او به خاطر دل‌درد خونه موند.",
                    "have a stomachache / a bad stomachache",
                    "bellyache, tummy ache", "",
                    "stomach (n) / stomachache (n)", "neutral",
                    "💡 در آمریکا stomachache، در بریتانیا tummy ache برای بچه‌ها."),
                VocabWord("Fever", "تب", "ˈfiːvər", "n",
                    "He has a high fever — 39 degrees.",
                    "او تب بالایی داره — ۳۹ درجه.",
                    "a high fever / have a fever / run a fever",
                    "temperature", "",
                    "fever (n) / feverish (adj)", "neutral",
                    "💡 have a fever یا run a fever = تب داشتن."),
                VocabWord("Cough", "سرفه", "kɔːf", "n/v",
                    "I have a bad cough that won't go away.",
                    "سرفه بدی دارم که خوب نمی‌شه.",
                    "a dry cough / a bad cough / cough medicine",
                    "hack", "",
                    "cough (n/v) / coughing (n)", "neutral",
                    "💡 cough هم اسم، هم فعل: I'm coughing a lot."),
                VocabWord("Cold", "سرماخوردگی", "koʊld", "n",
                    "I caught a cold last week.",
                    "هفته پیش سرما خوردم.",
                    "catch a cold / have a cold / a bad cold",
                    "flu (شدیدتر)", "",
                    "cold (n/adj) / coldly (adv)", "neutral",
                    "💡 catch a cold = سرما خوردن، have a cold = سرماخوردگی داشتن."),
                VocabWord("Flu", "آنفلوآنزا", "fluː", "n",
                    "The flu is worse than a common cold.",
                    "آنفلوآنزا از سرماخوردگی معمولی بدتره.",
                    "have the flu / catch the flu / flu shot",
                    "influenza", "",
                    "flu (n)", "neutral",
                    "💡 flu با the میاد: have the flu."),
                VocabWord("Medicine", "دارو", "ˈmedɪsɪn", "n",
                    "Take this medicine three times a day.",
                    "این دارو رو روزی سه بار بخور.",
                    "take medicine / prescribe medicine / over-the-counter medicine",
                    "medication, drug", "",
                    "medicine (n) / medical (adj) / medic (n)", "neutral",
                    "💡 take medicine (نه eat/drink)."),
                VocabWord("Pharmacy", "داروخانه", "ˈfɑːrməsi", "n",
                    "The pharmacy is open 24 hours.",
                    "داروخانه ۲۴ ساعته بازه.",
                    "go to the pharmacy / a pharmacy chain",
                    "drugstore (AmE), chemist (BrE)", "",
                    "pharmacy (n) / pharmacist (n) / pharmaceutical (adj)", "neutral",
                    "💡 در آمریکا drugstore، در بریتانیا chemist."),
                VocabWord("Rest", "استراحت", "rest", "n/v",
                    "You need to rest for a few days.",
                    "باید چند روز استراحت کنی.",
                    "get some rest / have a rest / a good rest",
                    "relaxation, sleep", "work",
                    "rest (n/v) / restful (adj) / restless (adj)", "neutral",
                    "💡 rest هم اسم، هم فعل: I need to rest."),
                VocabWord("Doctor", "پزشک", "ˈdɑːktər", "n",
                    "You should see a doctor about that cough.",
                    "باید درباره اون سرفه یه دکتر ببینی.",
                    "see a doctor / go to the doctor / family doctor",
                    "physician, GP", "",
                    "doctor (n) / doctorate (n) / doctoral (adj)", "neutral",
                    "💡 در بریتانیا GP (General Practitioner) رایجه."),
                VocabWord("Sore throat", "گلودرد", "sɔːr θroʊt", "n",
                    "I have a sore throat and it hurts to swallow.",
                    "گلودرد دارم و قورت دادن دردناکه.",
                    "have a sore throat / a bad sore throat",
                    "throat pain", "",
                    "sore (adj) / throat (n)", "neutral",
                    "💡 sore = دردناک، فقط برای گلو، عضله یا چشم."),
                VocabWord("Pain", "درد", "peɪn", "n",
                    "I have a sharp pain in my back.",
                    "یه درد تیز توی کمرم دارم.",
                    "a sharp pain / back pain / in pain",
                    "ache, hurt", "",
                    "pain (n) / painful (adj) / painless (adj)", "neutral",
                    "💡 pain اسم، hurt فعل: My leg hurts."),
                VocabWord("Allergy", "حساسیت", "ˈælərdʒi", "n",
                    "I have a peanut allergy.",
                    "من به بادام‌زمینی حساسیت دارم.",
                    "an allergy to / food allergy / seasonal allergies",
                    "sensitivity", "",
                    "allergy (n) / allergic (adj)", "neutral",
                    "💡 allergic to (نه allergic of)."),
                VocabWord("Prescription", "نسخه", "prɪˈskrɪpʃən", "n",
                    "The doctor gave me a prescription for antibiotics.",
                    "دکتر برام نسخه آنتی‌بیوتیک نوشت.",
                    "write a prescription / fill a prescription",
                    "script (غیررسمی)", "",
                    "prescription (n) / prescribe (v)", "formal",
                    "💡 prescription از فعل prescribe میاد، نه proscribe."),
                VocabWord("Symptom", "نشانه / علامت", "ˈsɪmptəm", "n",
                    "Common symptoms include fever and cough.",
                    "نشانه‌های رایج شامل تب و سرفه هستن.",
                    "flu symptoms / common symptoms / show symptoms",
                    "sign, indication", "",
                    "symptom (n) / symptomatic (adj)", "formal",
                    "💡 تلفظش /ˈsɪmp.təm/ (p سایلنته).")
            ),
            idioms = listOf(
                IdiomExpression("Under the weather", "حالش خوب نبودن",
                    "I'm feeling a bit under the weather today.",
                    "امروز یه کم حالم خوب نیست.", "informal"),
                IdiomExpression("A clean bill of health", "تأیید سلامتی کامل",
                    "After the tests, the doctor gave me a clean bill of health.",
                    "بعد از آزمایش‌ها، دکتر تأیید سلامتی کامل بهم داد.", "formal"),
                IdiomExpression("On the mend", "در حال بهبودی",
                    "She's been sick, but she's on the mend now.",
                    "او مریض بود، ولی الان داره بهتر می‌شه.", "informal"),
                IdiomExpression("Fit as a fiddle", "کاملاً سالم",
                    "My grandfather is 90 and fit as a fiddle.",
                    "پدربزرگم ۹۰ سالشه و کاملاً سالمه.", "idiom"),
                IdiomExpression("Take a turn for the worse", "بدتر شدن",
                    "His condition took a turn for the worse last night.",
                    "وضعیتش دیشب بدتر شد.", "formal"),
                IdiomExpression("Fight off", "مقاومت کردن در برابر بیماری",
                    "She's trying to fight off a cold.",
                    "او داره سعی می‌کنه با سرماخوردگی مقابله کنه.", "neutral"),
                IdiomExpression("Bounce back", "بهبود سریع پیدا کردن",
                    "He bounced back quickly after the surgery.",
                    "بعد از جراحی سریع بهبود پیدا کرد.", "informal"),
                IdiomExpression("A bitter pill to swallow", "چیز سختی برای پذیرفتن",
                    "Losing the match was a bitter pill to swallow.",
                    "باختن مسابقه، پذیرفتنش سخت بود.", "idiom"),
                IdiomExpression("Prevention is better than cure", "پیشگیری بهتر از درمانه",
                    "Eat well and exercise — prevention is better than cure.",
                    "خوب بخور و ورزش کن — پیشگیری بهتر از درمانه.", "idiom"),
                IdiomExpression("Out of sorts", "حالش یه کم بد بودن",
                    "I've been feeling out of sorts lately.",
                    "اخیراً حالم یه کم بد بوده.", "informal")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("come down with", "مریض شدن",
                    "مریض شدن",
                    "I think I'm coming down with a cold.",
                    "فکر می‌کنم دارم سرما می‌خورم.", "غیرقابل جدا شدن"),
                PhrasalVerb("get over", "بهبود پیدا کردن",
                    "بهبود پیدا کردن",
                    "It took her a week to get over the flu.",
                    "یه هفته طول کشید تا آنفلوآنزا خوب بشه.", "غیرقابل جدا شدن"),
                PhrasalVerb("throw up", "استفراغ کردن",
                    "استفراغ کردن",
                    "He threw up after eating bad seafood.",
                    "بعد از خوردن غذای دریایی فاسد استفراغ کرد.", "غیرقابل جدا شدن"),
                PhrasalVerb("pass out", "از حال رفتن",
                    "از حال رفتن",
                    "She passed out from the heat.",
                    "از گرما از حال رفت.", "غیرقابل جدا شدن"),
                PhrasalVerb("work out", "ورزش کردن",
                    "ورزش کردن",
                    "I work out three times a week.",
                    "هفته‌ای سه بار ورزش می‌کنم.", "غیرقابل جدا شدن"),
                PhrasalVerb("cut back on", "کم کردن",
                    "کم کردن",
                    "The doctor told him to cut back on salt.",
                    "دکتر بهش گفت نمک رو کم کنه.", "غیرقابل جدا شدن"),
                PhrasalVerb("put on", "اضافه وزن پیدا کردن",
                    "اضافه وزن پیدا کردن",
                    "I've put on a few pounds recently.",
                    "اخیراً چند کیلو اضافه کردم.", "جدا شدنی"),
                PhrasalVerb("lay off", "کنار گذاشتن (غذا/سیگار)",
                    "کنار گذاشتن",
                    "He's trying to lay off junk food.",
                    "داره سعی می‌کنه فست‌فود رو کنار بذاره.", "جدا شدنی")
            ),
            pronunciationTips = listOf(
                PronunciationTip("تلفظ cough و laugh",
                    "🔊 این دو کلمه با -gh میان:\n" +
                    "• cough /kɔːf/ (ف با ف)\n" +
                    "• laugh /læf/ (ف)\n" +
                    "• enough /ɪˈnʌf/ (ف)\n\n" +
                    "💡 در این سه کلمه، gh صدای /f/ می‌ده."),
                PronunciationTip("استرس در واژه‌های پزشکی",
                    "🔊 استرس:\n" +
                    "• HEADache /ˈhed.eɪk/ (استرس روی اول)\n" +
                    "• STOPlach /ˈstʌm.ək/ (استرس روی اول)\n" +
                    "• PREscription /prɪˈskrɪp.ʃən/ (استرس روی وسط)\n" +
                    "• SYMptom /ˈsɪmp.təm/ (استرس روی اول)\n" +
                    "• allerGY /ˈæl.ər.dʒi/ (استرس روی اول)\n\n" +
                    "💡 دقت کن این واژه‌ها رو درست استرس بذاری."),
                PronunciationTip("تلفظ should / shouldn't",
                    "🔊 در گفتار سریع:\n" +
                    "• should /ʃʊd/ → /ʃəd/ (در گفتار سریع)\n" +
                    "• shouldn't /ˈʃʊd.ənt/\n\n" +
                    "💡 You should rest. → /jə ʃəd rest/\n" +
                    "💡 You shouldn't smoke. → /jə ˈʃʊd.ənt smoʊk/")
            ),
            culturalNotes = listOf(
                CulturalNote("دسترسی به پزشک در غرب",
                    "🌍 در کشورهای غربی، سیستم سلامت متفاوته:\n" +
                    "• آمریکا: بیمه خصوصی گران، ولی کیفیت بالا\n" +
                    "• کانادا/بریتانیا: سیستم دولتی (NHS)، رایگان\n" +
                    "• اورژانس (ER) برای موارد جدی\n" +
                    "• Walk-in clinic = درمانگاه بدون نوبت\n\n" +
                    "💡 در بریتانیا GP دروازه‌بان سیستمه — اول باید GP ببینی."),
                CulturalNote("صحبت درباره بیماری",
                    "🌍 در فرهنگ غربی، صحبت درباره بیماری:\n" +
                    "• با دوستان نزدیک: معمولاً آزاد\n" +
                    "• در محیط کار: مختصر و مؤدبانه\n" +
                    "• در اولین آشنایی: معمولاً خودداری می‌کنن\n\n" +
                    "💡 جمله «How are you?» معمولاً سوال واقعی نیست، فقط سلامه."),
                CulturalNote("عادات سالم در غرب",
                    "🌍 عادات سالم رایج:\n" +
                    "• Gym membership = عضویت در باشگاه\n" +
                    "• Morning run = دویدن صبحگاهی\n" +
                    "• Yoga / Pilates = یوگا / پیلاتس\n" +
                    "• Meal prep = آماده‌سازی وعده‌ها\n" +
                    "• Wellness trend = ترند سلامتی\n\n" +
                    "💡 در غرب، سلامت جسمانی بخشی از هویته."),
                CulturalNote("سلامت روان",
                    "🌍 در غرب، سلامت روان (mental health) خیلی مهمه:\n" +
                    "• Therapy = تراپی\n" +
                    "• Self-care = مراقبت از خود\n" +
                    "• Mindfulness = ذهن‌آگاهی\n" +
                    "• Burnout = فرسودگی شغلی\n\n" +
                    "💡 صحبت درباره تراپی در آمریکا خیلی عادیه.")
            ),
            grammar = listOf(
                GrammarSection("📌 Should / Shouldn't",
                    "🔹 فرمول:\n" +
                    "• Subject + should + verb: You should rest.\n" +
                    "• Subject + shouldn't + verb: You shouldn't smoke.\n\n" +
                    "🔸 سوال:\n" +
                    "• Should I see a doctor?\n" +
                    "• Should he take this medicine?\n\n" +
                    "⚠️ اشتباهات:\n" +
                    "❌ You should to rest. → ✅ You should rest.\n" +
                    "❌ You should resting. → ✅ You should rest.\n" +
                    "💡 should بدون to میاد."),
                GrammarSection("📌 Should برای توصیه",
                    "🔹 کاربردها:\n" +
                    "• توصیه: You should drink more water.\n" +
                    "• نظر دادن: I think you should rest.\n" +
                    "• پیشنهاد: Should we call the doctor?\n\n" +
                    "🔸 شدت‌ها:\n" +
                    "• You should... (توصیه)\n" +
                    "• You must... (اجبار، قوی‌تر)\n" +
                    "• You could... (پیشنهاد، ضعیف‌تر)\n\n" +
                    "💡 should مؤدبانه‌تر از must هست."),
                GrammarSection("📌 Must برای اجبار",
                    "🔹 فرمول:\n" +
                    "• Subject + must + verb: You must take this medicine.\n\n" +
                    "🔸 تفاوت با should:\n" +
                    "• You should rest. (توصیه)\n" +
                    "• You must rest. (اجبار)\n\n" +
                    "⚠️ must برای خودت هم میاد: I must go now."),
                GrammarSection("📌 Have to / Don't have to",
                    "🔹 فرمول:\n" +
                    "• Subject + have to + verb: I have to see a doctor.\n" +
                    "• Subject + don't have to + verb: You don't have to come.\n\n" +
                    "🔸 تفاوت have to و must:\n" +
                    "• Must = اجبار درونی: I must stop smoking.\n" +
                    "• Have to = اجبار بیرونی: I have to take medicine.\n\n" +
                    "⚠️ don't have to = لازم نیست (نه ممنوع)."),
                GrammarSection("📌 Present Continuous برای درد و حال",
                    "🔹 وقتی می‌خوای بگی الان چه حسی داری:\n" +
                    "• My head is hurting. (سرم درد می‌کنه)\n" +
                    "• I'm feeling sick.\n" +
                    "• She's not feeling well today.\n\n" +
                    "🔸 Present Simple برای حالت پایدار:\n" +
                    "• I have a headache. / My back hurts.\n\n" +
                    "💡 hurt با ضمیر میاد: My leg hurts."),
                GrammarSection("📌 Take medicine / Have a cold",
                    "🔹 ترکیب‌های رایج:\n" +
                    "• Take medicine / take pills / take vitamins\n" +
                    "• Have a cold / have a headache / have a fever\n" +
                    "• Catch a cold / catch the flu\n" +
                    "• Get better / get worse\n\n" +
                    "⚠️ ❌ eat medicine → ✅ take medicine\n" +
                    "💡 take medicine، نه eat."),
                GrammarSection("📌 حروف اضافه با درد و بیماری",
                    "🔹 حروف اضافه:\n" +
                    "• a pain in my back (نه of)\n" +
                    "• allergic to nuts\n" +
                    "• suffer from asthma\n" +
                    "• recover from an illness\n" +
                    "• die of cancer\n\n" +
                    "💡 این حروف اضافه رو حفظ کن."),
                GrammarSection("📌 توصیه به دیگران",
                    "🔹 ساختارهای توصیه:\n" +
                    "• You should... / You shouldn't...\n" +
                    "• Why don't you...? (غیررسمی)\n" +
                    "• Have you tried...? (تجربه)\n" +
                    "• If I were you, I would... (شرطی)\n" +
                    "• It might be a good idea to... (مؤدبانه)\n\n" +
                    "💡 If I were you ساختار شرطی نوع دومه.")
            ),
            commonMistakes = listOf(
                CommonMistake("You should to rest.", "You should rest.", "should بدون to میاد."),
                CommonMistake("You should resting.", "You should rest.", "بعد از should فعل ساده."),
                CommonMistake("I eat medicine.", "I take medicine.", "take medicine درسته."),
                CommonMistake("I have cold.", "I have a cold.", "cold با a میاد."),
                CommonMistake("I am allergy to nuts.", "I am allergic to nuts.", "صفت allergic."),
                CommonMistake("My head is pain.", "My head hurts. / I have a headache.", "pain اسمه، hurt فعل."),
                CommonMistake("I feel me sick.", "I feel sick.", "feel بدون me."),
                CommonMistake("You must to see a doctor.", "You must see a doctor.", "must بدون to."),
                CommonMistake("You don't have to smoke.", "You mustn't smoke.", "don't have to = لازم نیست، mustn't = ممنوع."),
                CommonMistake("Take a rest.", "Get some rest.", "get some rest رایج‌تره."),
                CommonMistake("I have fever.", "I have a fever.", "fever با a میاد."),
                CommonMistake("I'm feeling good today.", "I'm feeling well today.", "well برای سلامتی، good برای کیفیت.")
            ),
            conversation = listOf(
                DialogueLine("A", "Good morning. How can I help you today?",
                    "صبح بخیر. چطور می‌تونم کمکتون کنم؟"),
                DialogueLine("B", "Good morning, doctor. I've been feeling terrible for a few days.",
                    "صبح بخیر دکتر. چند روزه حالم خیلی بده."),
                DialogueLine("A", "I'm sorry to hear that. What symptoms do you have?",
                    "متأسفم. چه علائمی دارید؟"),
                DialogueLine("B", "I have a bad cough, a sore throat, and a headache.",
                    "سرفه بد، گلودرد و سردرد دارم."),
                DialogueLine("A", "Do you have a fever?",
                    "تب هم دارید؟"),
                DialogueLine("B", "Yes, 38.5 degrees last night.",
                    "بله، دیشب ۳۸.۵ درجه."),
                DialogueLine("A", "Any other symptoms? Body aches?",
                    "علائم دیگه‌ای هم دارید؟ درد بدن؟"),
                DialogueLine("B", "Yes, my whole body hurts.",
                    "بله، کل بدنم درد می‌کنه."),
                DialogueLine("A", "Sounds like the flu. Are you allergic to any medicine?",
                    "به نظر آنفلوآنزاست. به هیچ دارویی حساسیت دارید؟"),
                DialogueLine("B", "No, not that I know of.",
                    "نه، تا اونجا که می‌دونم نه."),
                DialogueLine("A", "I'll prescribe you some medicine. Take it three times a day after meals.",
                    "براتون یه دارو تجویز می‌کنم. روزی سه بار بعد از غذا بخورید."),
                DialogueLine("B", "Should I stay home from work?",
                    "باید از کار خونه بمونم؟"),
                DialogueLine("A", "Yes, you should rest for at least three days. And drink lots of fluids.",
                    "بله، باید حداقل سه روز استراحت کنید. و مایعات زیاد بنوشید."),
                DialogueLine("B", "Should I see you again?",
                    "باید دوباره ببینمتون؟"),
                DialogueLine("A", "Only if it doesn't get better in a week.",
                    "فقط اگه تا یه هفته بهتر نشد."),
                DialogueLine("B", "Thank you so much, doctor. How much do I owe?",
                    "خیلی ممنون دکتر. چقدر بدهکارم؟"),
                DialogueLine("A", "The receptionist will handle the payment. Get well soon!",
                    "منشی پرداخت رو رسیدگی می‌کنه. زود خوب بشید!"),
                DialogueLine("B", "Thank you! Goodbye.",
                    "ممنون! خداحافظ."),
                DialogueLine("A", "Goodbye, take care of yourself!",
                    "خداحافظ، از خودتون مراقبت کنید!"),
                DialogueLine("B", "I will. Thanks again!",
                    "حتماً. بازم ممنون!")
            ),
            comprehensionQuestions = listOf(
                ComprehensionQuestion("بیمار چه علائمی دارد؟",
                    "سرفه بد، گلودرد، سردرد، تب و درد بدن."),
                ComprehensionQuestion("دکتر چه تشخیصی داد؟",
                    "آنفلوآنزا (the flu)."),
                ComprehensionQuestion("بیمار به چه چیزی حساسیت دارد؟",
                    "به هیچ دارویی حساسیت ندارد."),
                ComprehensionQuestion("دکتر چه توصیه‌ای کرد؟",
                    "دارو روزی سه بار بعد از غذا، استراحت حداقل سه روز، و نوشیدن مایعات زیاد."),
                ComprehensionQuestion("چه زمانی باید دوباره پیش دکتر برگردد؟",
                    "اگر تا یک هفته بهتر نشد.")
            ),
            speakingTasks = listOf(
                SpeakingTask("Describe your symptoms to a doctor.",
                    "نقش‌بازی: علائم بیماری‌ت رو به پزشک بگو.",
                    "از I have a... / I've been feeling... استفاده کن."),
                SpeakingTask("Give advice to a sick friend.",
                    "به یه دوست بیمار توصیه کن.",
                    "از You should... / You shouldn't... استفاده کن."),
                SpeakingTask("Talk about healthy habits.",
                    "درباره عادات سالمت صحبت کن.",
                    "از I try to... / I usually... استفاده کن."),
                SpeakingTask("Describe your last visit to the doctor.",
                    "آخرین باری که پیش دکتر رفتی رو توصیف کن.",
                    "از I went to... / The doctor said... استفاده کن."),
                SpeakingTask("Talk about a time you were very sick.",
                    "درباره زمانی که خیلی مریض بودی صحبت کن.",
                    "از I was sick with... / It lasted... استفاده کن.")
            ),
            writingTasks = listOf(
                WritingTask("Write an email to your boss explaining you're sick.",
                    "ایمیل به رئیست بنویس و توضیح بده که مریضی.",
                    120,
                    "شامل: علائم، مدت، درخواست مرخصی"),
                WritingTask("Write a paragraph about healthy habits.",
                    "یک پاراگراف درباره عادات سالم بنویس.",
                    150,
                    "شامل: ورزش، تغذیه، خواب، استرس"),
                WritingTask("Describe a time you visited the doctor.",
                    "زمانی که پیش دکتر رفتی رو توصیف کن.",
                    180,
                    "شامل: چرا رفتی، دکتر چی گفت، چطور خوب شدی")
            ),
            quiz = listOf(
                QuizQuestion("معنی «Fever» چیست؟",
                    listOf("سردرد", "تب", "سرفه", "دل‌درد"), 1),
                QuizQuestion("کدام درست است؟",
                    listOf("You should rest.", "You should to rest.", "You should resting.", "Should you rest."), 0),
                QuizQuestion("معنی «Sore throat» چیست؟",
                    listOf("سردرد", "گلودرد", "دل‌درد", "دندان‌درد"), 1),
                QuizQuestion("«You ___ eat too much.»",
                    listOf("should", "shouldn't", "must", "can"), 1),
                QuizQuestion("معنی «Medicine» چیست؟",
                    listOf("دارو", "دکتر", "بیمار", "بیماری"), 0),
                QuizQuestion("کدام درست است؟",
                    listOf("You should take medicine.", "You should takes medicine.", "You should taking medicine.", "You should to take."), 0),
                QuizQuestion("معنی «Pharmacy» چیست؟",
                    listOf("بیمارستان", "داروخانه", "مطب", "آزمایشگاه"), 1),
                QuizQuestion("معنی «Healthy» چیست؟",
                    listOf("بیمار", "سالم", "خسته", "ضعیف"), 1),
                QuizQuestion("کدام درسته؟",
                    listOf("I eat medicine.", "I take medicine.", "I drink medicine.", "I have medicine."), 1),
                QuizQuestion("«under the weather» یعنی؟",
                    listOf("زیر بارون", "حالش خوب نیست", "خوشحال", "هواشناسی"), 1),
                QuizQuestion("تفاوت must و should؟",
                    listOf("هیچ فرقی ندارند", "must قوی‌تر از should", "should قوی‌تر از must", "هر دو یکسان"), 1),
                QuizQuestion("«I'm allergic ___ nuts.»",
                    listOf("of", "to", "with", "for"), 1),
                QuizQuestion("معنی «prescription» چیست؟",
                    listOf("نسخه", "دارو", "بیماری", "درمان"), 0),
                QuizQuestion("«take a turn for the worse» یعنی؟",
                    listOf("بهتر شدن", "بدتر شدن", "تغییر کردن", "خوب شدن"), 1),
                QuizQuestion("کدام درسته؟",
                    listOf("My head is pain.", "My head hurts.", "My head is hurt.", "My head pain."), 1)
            )
        )12 -> LessonContent("top_notch_1", 12, "Weekend Activities", "آخر هفته",
    objectives = listOf(
        "یادگیری ۱۵ فعالیت رایج آخر هفته",
        "استفاده از Going to برای برنامه‌های آینده",
        "پیشنهاد دادن و پاسخ دادن به پیشنهاد",
        "صحبت درباره برنامه‌های آخر هفته",
        "استفاده از افعال تفریحی (go, play, watch)",
        "بیان علاقه و عدم علاقه به فعالیت‌ها"
    ),
    vocabulary = listOf(
        VocabWord("Go out", "بیرون رفتن", "ɡoʊ aʊt", "phrasal v",
            "We usually go out for dinner on Friday nights.",
            "ما معمولاً جمعه شب‌ها برای شام بیرون می‌ریم.",
            "go out with friends / go out for a drink / go out on a date",
            "head out, hang out", "stay in",
            "out (adv) / outing (n)", "neutral",
            "💡 go out با دوستان، date, dinner."),
        VocabWord("Stay home", "خونه موندن", "steɪ hoʊm", "phrase",
            "I prefer to stay home and relax on Sundays.",
            "ترجیح می‌دم یکشنبه‌ها خونه بمونم و استراحت کنم.",
            "stay home / stay in / stay at home",
            "stay in", "go out",
            "home (n/adv)", "neutral",
            "💡 stay home (آمریکا)، stay at home (بریتانیا)."),
        VocabWord("Visit friends", "دیدن دوستان", "ˈvɪzɪt frendz", "phrase",
            "We're going to visit friends this weekend.",
            "این آخر هفته می‌ریم دوستامون رو ببینیم.",
            "visit friends / visit family / visit relatives",
            "see friends, catch up with", "",
            "visit (n/v) / visitor (n) / visitation (n)", "neutral",
            "💡 visit با ضمیر یا اسم میاد: visit my friends."),
        VocabWord("Play sports", "ورزش کردن", "pleɪ spɔːrts", "phrase",
            "He plays sports with his friends every Saturday.",
            "او هر شنبه با دوستاش ورزش می‌کنه.",
            "play sports / play soccer / play tennis / play basketball",
            "do sports, exercise", "",
            "play (v) / player (n) / playful (adj)", "neutral",
            "💡 play + اسم ورزش (بدون the)."),
        VocabWord("Watch movies", "فیلم دیدن", "wɑːtʃ ˈmuːviz", "phrase",
            "Let's watch movies at home tonight.",
            "بیا امشب خونه فیلم ببینیم.",
            "watch a movie / watch movies / watch a film (BrE)",
            "see a movie", "",
            "watch (v) / watcher (n) / movie (n)", "neutral",
            "💡 watch a movie (تماشا کردن)، see a movie (رفتن سینما)."),
        VocabWord("Go shopping", "خرید رفتن", "ɡoʊ ˈʃɑːpɪŋ", "phrase",
            "She loves to go shopping on Saturdays.",
            "او عاشق خرید رفتن در شنبه‌هاست.",
            "go shopping / go window shopping / go grocery shopping",
            "shop, hit the stores", "",
            "shop (n/v) / shopper (n) / shopping (n)", "neutral",
            "💡 go shopping بدون the."),
        VocabWord("Read books", "کتاب خواندن", "riːd bʊks", "phrase",
            "I like to read books in the evening.",
            "دوست دارم عصرها کتاب بخونم.",
            "read books / read a novel / read the news",
            "browse, peruse", "",
            "read (v) / reader (n) / reading (n)", "neutral",
            "💡 read (حال) / read (گذشته، تلفظ /red/)."),
        VocabWord("Relax", "استراحت کردن", "rɪˈlæks", "v",
            "I need to relax this weekend — work was crazy.",
            "این آخر هفته باید استراحت کنم — کار دیوانه‌کننده بود.",
            "relax at home / relax on the beach / just relax",
            "unwind, chill out", "stress out",
            "relax (v) / relaxation (n) / relaxed (adj)", "neutral",
            "💡 chill out = relax (غیررسمی)."),
        VocabWord("Go hiking", "کوه‌پیمایی رفتن", "ɡoʊ ˈhaɪkɪŋ", "phrase",
            "We're going hiking in the mountains this Sunday.",
            "این یکشنبه داریم می‌ریم کوه‌پیمایی در کوه‌ها.",
            "go hiking / go for a hike / hiking trail",
            "trek, walk", "",
            "hike (n/v) / hiker (n) / hiking (n)", "neutral",
            "💡 go + فعل-ing برای فعالیت‌های ورزشی: go hiking, go swimming."),
        VocabWord("Have a picnic", "پیک‌نیک رفتن", "hæv ə ˈpɪknɪk", "phrase",
            "Let's have a picnic in the park on Saturday.",
            "بیا شنبه در پارک پیک‌نیک بریم.",
            "have a picnic / go on a picnic / picnic basket",
            "outdoor meal", "",
            "picnic (n/v) / picnicker (n)", "neutral",
            "💡 have a picnic (آمریکا)، go on a picnic (بریتانیا)."),
        VocabWord("Play video games", "بازی ویدیویی کردن", "pleɪ ˈvɪdioʊ ɡeɪmz", "phrase",
            "He plays video games all weekend.",
            "او کل آخر هفته بازی ویدیویی می‌کنه.",
            "play video games / play online / console games",
            "gaming", "",
            "play (v) / game (n) / gamer (n)", "neutral",
            "💡 play video games (بدون the)."),
        VocabWord("Go to the gym", "باشگاه رفتن", "ɡoʊ tə ðə dʒɪm", "phrase",
            "I go to the gym three times a week.",
            "هفته‌ای سه بار می‌رم باشگاه.",
            "go to the gym / hit the gym / join a gym",
            "work out", "",
            "gym (n) / gymnast (n) / gymnastics (n)", "neutral",
            "💡 go to the gym (با the)."),
        VocabWord("Take a nap", "چرت زدن", "teɪk ə næp", "phrase",
            "I usually take a nap on Sunday afternoons.",
            "معمولاً یکشنبه بعدازظهرها چرت می‌زنم.",
            "take a nap / have a nap (BrE) / power nap",
            "doze, snooze", "",
            "nap (n/v) / napper (n)", "neutral",
            "💡 take a nap (آمریکا)، have a nap (بریتانیا)."),
        VocabWord("Go to a concert", "کنسرت رفتن", "ɡoʊ tə ə ˈkɑːnsərt", "phrase",
            "We're going to a concert on Saturday night.",
            "شنبه شب داریم می‌ریم کنسرت.",
            "go to a concert / live concert / rock concert",
            "show, gig (غیررسمی)", "",
            "concert (n) / concertgoer (n)", "neutral",
            "💡 go to a concert (با a)."),
        VocabWord("Do nothing", "هیچ کاری نکردن", "duː ˈnʌθɪŋ", "phrase",
            "Sometimes it's nice to just do nothing.",
            "بعضی وقتا خوبه که فقط هیچ کاری نکنی.",
            "do nothing / sit around / take it easy",
            "laze around", "",
            "nothing (pron)", "neutral",
            "💡 do nothing = استراحت مطلق.")
    ),
    idioms = listOf(
        IdiomExpression("Sleep in", "تا دیروقت خوابیدن",
            "I love to sleep in on weekends.",
            "عاشق اینم که آخر هفته‌ها تا دیروقت بخوابم.", "informal"),
        IdiomExpression("Hit the town", "برو بیرون شهر بگردیم",
            "Let's hit the town this Friday night!",
            "بیا این جمعه شب بریم شهر بگردیم!", "informal"),
        IdiomExpression("Netflix and chill", "خونه موندن و فیلم دیدن",
            "We're just going to Netflix and chill tonight.",
            "امشب فقط می‌خوایم خونه بمونیم و فیلم ببینیم.", "informal"),
        IdiomExpression("Take it easy", "سخت نگیر / آروم باش",
            "Take it easy this weekend — you deserve a break.",
            "این آخر هفته سخت نگیر — استراحت حقته.", "informal"),
        IdiomExpression("Have a blast", "خیلی خوش گذروندن",
            "We had a blast at the party!",
            "توی مهمونی خیلی خوش گذروندیم!", "informal"),
        IdiomExpression("Painting the town red", "شب‌گردی و خوش‌گذرانی",
            "They were painting the town red last night.",
            "دیشب مشغول شب‌گردی و خوش‌گذرانی بودن.", "idiom"),
        IdiomExpression("Couch potato", "آدم تنبل که فقط تلویزیون می‌بینه",
            "Don't be a couch potato — let's go out!",
            "تنبل نباش — بیا بریم بیرون!", "informal"),
        IdiomExpression("Sunday blues", "افسردگی آخر هفته",
            "I always get the Sunday blues.",
            "من همیشه افسردگی یکشنبه‌ها رو می‌گیرم.", "informal"),
        IdiomExpression("Chill out", "آروم شدن / استراحت کردن",
            "Let's just chill out at home tonight.",
            "بیا امشب فقط خونه آروم باشیم.", "informal"),
        IdiomExpression("Lazy Sunday", "یکشنبه تنبل",
            "It was a lazy Sunday — we did nothing.",
            "یه یکشنبه تنبل بود — هیچ کاری نکردیم.", "informal")
    ),
    phrasalVerbs = listOf(
        PhrasalVerb("hang out", "وقت گذراندن",
            "وقت گذراندن",
            "Let's hang out this weekend.",
            "بیا این آخر هفته با هم وقت بگذرونیم.", "غیرقابل جدا شدن"),
        PhrasalVerb("sleep in", "تا دیروقت خوابیدن",
            "تا دیروقت خوابیدن",
            "I love to sleep in on Saturdays.",
            "عاشق اینم که شنبه‌ها تا دیروقت بخوابم.", "غیرقابل جدا شدن"),
        PhrasalVerb("catch up on", "جبران کردن / رسیدن به",
            "جبران کردن",
            "I need to catch up on my sleep.",
            "باید کم‌خوابی‌ام رو جبران کنم.", "جدا شدنی"),
        PhrasalVerb("wind down", "آروم شدن",
            "آروم شدن",
            "I like to wind down with a movie.",
            "دوست دارم با یه فیلم آروم بشم.", "غیرقابل جدا شدن"),
        PhrasalVerb("go out", "بیرون رفتن",
            "بیرون رفتن",
            "Are you going out tonight?",
            "امشب می‌ری بیرون؟", "غیرقابل جدا شدن"),
        PhrasalVerb("come over", "خونه کسی رفتن",
            "خونه کسی رفتن",
            "Why don't you come over for dinner?",
            "چرا برای شام نمیای خونه ما؟", "غیرقابل جدا شدن"),
        PhrasalVerb("put off", "به تعویق انداختن",
            "به تعویق انداختن",
            "Let's put off the trip until next weekend.",
            "بیا سفر رو به آخر هفته بعد موکول کنیم.", "جدا شدنی"),
        PhrasalVerb("laze around", "تنبلی کردن",
            "تنبلی کردن",
            "We just lazed around all Sunday.",
            "همه یکشنبه رو فقط تنبلی کردیم.", "غیرقابل جدا شدن")
    ),
    pronunciationTips = listOf(
        PronunciationTip("تلفظ going to در گفتار سریع",
            "🔊 در گفتار سریع:\n" +
            "• going to → gonna /ˈɡʌn.ə/\n" +
            "• I'm going to stay home → I'm gonna stay home.\n\n" +
            "💡 gonna در مکالمه غیررسمی رایجه، ولی در نوشتار رسمی استفاده نکن."),
        PronunciationTip("تلفظ weekends",
            "🔊 تلفظ:\n" +
            "• weekend /ˈwiːk.end/\n" +
            "• weekends /ˈwiːk.endz/ (با z)\n" +
            "• on weekends /ɑːn ˈwiːk.endz/\n\n" +
            "💡 در آمریکا on the weekend، در بریتانیا at the weekend."),
        PronunciationTip("استرس در افعال تفریحی",
            "🔊 استرس:\n" +
            "• RELAX /rɪˈlæks/\n" +
            "• PICnic /ˈpɪk.nɪk/\n" +
            "• CONcert /ˈkɑːn.sərt/\n" +
            "• HIKing /ˈhaɪ.kɪŋ/\n\n" +
            "💡 go hiking (استرس روی hike).")
    ),
    culturalNotes = listOf(
        CulturalNote("آخر هفته در غرب",
            "🌍 در غرب، آخر هفته (Saturday & Sunday):\n" +
            "• Friday night = شروع آخر هفته، بیرون رفتن\n" +
            "• Saturday = خرید، ورزش، تفریح\n" +
            "• Sunday = استراحت، خانواده، آماده شدن برای هفته\n\n" +
            "💡 در بعضی کشورهای اسلامی، جمعه آخر هفته‌ست."),
        CulturalNote("Brunch در آخر هفته",
            "🌍 در آمریکا و اروپا، Sunday brunch رایجه:\n" +
            "• صبحانه-ناهار ترکیبی (۱۰ صبح تا ۲ بعدازظهر)\n" +
            "• Eggs Benedict, pancakes, mimosas\n\n" +
            "💡 brunch = breakfast + lunch."),
        CulturalNote("Netflix و فرهنگ خانه‌نشینی",
            "🌍 در غرب، Netflix and chill اصطلاح رایجه:\n" +
            "• خونه موندن و فیلم دیدن\n" +
            "• Streaming services: Netflix, Amazon Prime, Disney+\n\n" +
            "💡 این ترند بعد از پاندمی خیلی رایج شد."),
        CulturalNote("فرهنگ پیاده‌روی و طبیعت‌گردی",
            "🌍 در غرب، پیاده‌روی و طبیعت‌گردی رایجه:\n" +
            "• Hiking trails\n" +
            "• National parks\n" +
            "• Camping\n\n" +
            "💡 در آمریکا، hiking یک سرگرمی رایج خانوادگیه.")
    ),
    grammar = listOf(
        GrammarSection("📌 Going to برای برنامه‌های آینده",
            "🔹 فرمول:\n" +
            "• Subject + am/is/are + going to + verb\n" +
            "• I'm going to stay home this weekend.\n" +
            "• She's going to visit her parents.\n" +
            "• They're going to travel to Spain.\n\n" +
            "🔸 سوال:\n" +
            "• What are you going to do this weekend?\n" +
            "• Is she going to come to the party?\n\n" +
            "⚠️ اشتباهات:\n" +
            "❌ I going to stay home. → ✅ I'm going to stay home.\n" +
            "❌ I'm go to stay home. → ✅ I'm going to stay home."),
        GrammarSection("📌 تفاوت Going to و Will",
            "🔹 Going to = برنامه قبلی:\n" +
            "• I'm going to visit my grandma. (قبلاً تصمیم گرفتم)\n\n" +
            "🔸 Will = تصمیم لحظه‌ای / پیش‌بینی:\n" +
            "• I'll help you. (همین الان تصمیم گرفتم)\n" +
            "• It will rain tomorrow. (پیش‌بینی)\n\n" +
            "💡 Going to برای برنامه، Will برای تصمیم لحظه‌ای."),
        GrammarSection("📌 پیشنهاد دادن (Making Suggestions)",
            "🔹 ساختارها:\n" +
            "• Let's + verb: Let's go to the beach!\n" +
            "• How about + verb-ing? How about going hiking?\n" +
            "• What about + verb-ing? What about watching a movie?\n" +
            "• Why don't we + verb? Why don't we have a picnic?\n" +
            "• Shall we + verb? Shall we go out tonight?\n\n" +
            "🔸 پاسخ:\n" +
            "• Sounds great! / Good idea! / Sure!\n" +
            "• Sorry, I can't. / Maybe another time."),
        GrammarSection("📌 افعال go / play / do با فعالیت‌ها",
            "🔹 go + verb-ing (فعالیت‌های حرکتی):\n" +
            "• go hiking, go swimming, go shopping, go skiing, go dancing\n\n" +
            "🔸 play + ورزش/بازی (با توپ یا رقابتی):\n" +
            "• play soccer, play tennis, play chess, play video games\n\n" +
            "🔹 do + فعالیت عمومی:\n" +
            "• do yoga, do exercise, do homework, do the dishes\n\n" +
            "💡 قاعده ساده: go-ing، play با توپ، do برای کار روزمره."),
        GrammarSection("📌 Present Continuous برای برنامه‌های قطعی",
            "🔹 برای برنامه‌های قطعی آینده:\n" +
            "• I'm meeting Sara tomorrow at 5.\n" +
            "• We're having dinner at 8.\n" +
            "• She's flying to Paris next week.\n\n" +
            "🔸 تفاوت با Going to:\n" +
            "• Going to = برنامه (قصد)\n" +
            "• Present Continuous = ترتیب قطعی (رزرو شده)\n\n" +
            "💡 برای برنامه‌های رزرو شده، Present Continuous بهتره."),
        GrammarSection("📌 قیدهای تکرار آخر هفته",
            "🔹 قیدهای رایج:\n" +
            "• always / usually / often / sometimes / rarely / never\n" +
            "• every weekend / most weekends / on weekends\n\n" +
            "🔸 جای قید:\n" +
            "• بعد از be: I am always busy on weekends.\n" +
            "• قبل از فعل: I usually go hiking on Saturdays.\n\n" +
            "💡 every weekend (بدون on)."),
        GrammarSection("📌 سوال درباره برنامه‌ها",
            "🔹 سوالات رایج:\n" +
            "• What are you doing this weekend?\n" +
            "• What are your plans for the weekend?\n" +
            "• Do you have any plans for Saturday?\n" +
            "• Are you free this Sunday?\n\n" +
            "🔸 پاسخ:\n" +
            "• I'm going to... / I'm planning to...\n" +
            "• Nothing special. / Not much.\n" +
            "• I have to work, unfortunately."),
        GrammarSection("📌 بیان علاقه و عدم علاقه",
            "🔹 علاقه:\n" +
            "• I love / like / enjoy + verb-ing\n" +
            "• I'm into + noun/verb-ing\n" +
            "• I'm a big fan of...\n\n" +
            "🔸 عدم علاقه:\n" +
            "• I don't like / don't enjoy + verb-ing\n" +
            "• I'm not into...\n" +
            "• I can't stand + verb-ing\n\n" +
            "💡 can't stand = اصلاً تحمل نمی‌کنم.")
    ),
    commonMistakes = listOf(
        CommonMistake("I going to stay home.", "I'm going to stay home.", "am/is/are لازمه."),
        CommonMistake("I'm go to stay home.", "I'm going to stay home.", "going نه go."),
        CommonMistake("What you going to do?", "What are you going to do?", "are لازمه."),
        CommonMistake("Let's to go out.", "Let's go out.", "بعد از Let's فعل ساده."),
        CommonMistake("How about go hiking?", "How about going hiking?", "بعد از How about فعل+ing."),
        CommonMistake("I play swimming.", "I go swimming.", "برای ورزش‌های حرکتی go + ing."),
        CommonMistake("I go tennis.", "I play tennis.", "برای ورزش‌های با توپ play."),
        CommonMistake("I do hiking.", "I go hiking.", "hiking با go میاد."),
        CommonMistake("on weekend", "on the weekend", "the لازمه."),
        CommonMistake("every weekends", "every weekend", "every + مفرد."),
        CommonMistake("I stay in home.", "I stay home.", "بدون in."),
        CommonMistake("What are you doing on weekend?", "What are you doing this weekend?", "this weekend رایج‌تره.")
    ),
    conversation = listOf(
        DialogueLine("A", "Hey! Do you have any plans for the weekend?",
            "هی! برای آخر هفته برنامه‌ای داری؟"),
        DialogueLine("B", "Not yet. I was thinking about going hiking on Saturday.",
            "هنوز نه. داشتم فکر می‌کردم شنبه برم کوه‌پیمایی."),
        DialogueLine("A", "That sounds fun! Where are you going to go?",
            "خوب به نظر می‌رسه! کجا می‌خوای بری؟"),
        DialogueLine("B", "Probably to the mountains north of the city. Want to come?",
            "احتمالاً کوه‌های شمال شهر. می‌خوای بیای؟"),
        DialogueLine("A", "I'd love to! What time are we going to leave?",
            "دوست دارم! چه ساعتی می‌خوایم راه بیفتیم؟"),
        DialogueLine("B", "How about 7 AM? We can have breakfast on the way.",
            "ساعت ۷ صبح چطوره؟ می‌تونیم تو راه صبحانه بخوریم."),
        DialogueLine("A", "Sounds good. What should I bring?",
            "خوبه. چی بیارم؟"),
        DialogueLine("B", "Just comfortable shoes and a jacket. It might be cold up there.",
            "فقط کفش راحت و کاپشن. ممکنه اون بالا سرد باشه."),
        DialogueLine("A", "Got it. What about Sunday?",
            "فهمیدم. یکشنبه چطور؟"),
        DialogueLine("B", "I'm going to relax at home. Maybe watch a movie or read a book.",
            "می‌خوام خونه استراحت کنم. شاید فیلم ببینم یا کتاب بخونم."),
        DialogueLine("A", "Nice. I might go shopping with my sister.",
            "خوبه. منم شاید با خواهرم برم خرید."),
        DialogueLine("B", "That sounds fun too. What are you going to buy?",
            "اونم خوبه. چی می‌خوای بخری؟"),
        DialogueLine("A", "Just some new clothes for summer. Nothing special.",
            "فقط چند تا لباس جدید برای تابستون. چیز خاصی نه."),
        DialogueLine("B", "Cool. Hey, are you free Friday night?",
            "باحال. هی، جمعه شب آزادی؟"),
        DialogueLine("A", "Yes, why?",
            "بله، چطور؟"),
        DialogueLine("B", "Some friends are going to a concert. Want to join us?",
            "چند تا دوست دارن برن کنسرت. می‌خوای بیای؟"),
        DialogueLine("A", "Definitely! What kind of music?",
            "قطعاً! چه نوع موسیقی؟"),
        DialogueLine("B", "Rock. I think you'll like it.",
            "راک. فکر می‌کنم خوشت بیاد."),
        DialogueLine("A", "Awesome. Let's meet before the concert.",
            "عالیه. بیا قبل کنسرت ببینیم."),
        DialogueLine("B", "Perfect. I'll text you the details.",
            "عالی. جزئیات رو برات پیام می‌کنم.")
    ),
    comprehensionQuestions = listOf(
        ComprehensionQuestion("راوی برای شنبه چه برنامه‌ای دارد؟",
            "او قصد دارد به کوه‌پیمایی برود، احتمالاً کوه‌های شمال شهر."),
        ComprehensionQuestion("چه ساعتی می‌خواهند راه بیفتند؟",
            "ساعت ۷ صبح."),
        ComprehensionQuestion("راوی چه چیزی باید بیاورد؟",
            "کفش راحت و کاپشن."),
        ComprehensionQuestion("برنامه یکشنبه چیست؟",
            "استراحت در خانه، شاید فیلم دیدن یا کتاب خواندن."),
        ComprehensionQuestion("جمعه شب چه برنامه‌ای دارند؟",
            "می‌خواهند با چند دوست به کنسرت راک بروند.")
    ),
    speakingTasks = listOf(
        SpeakingTask("Talk about your plans for this weekend.",
            "درباره برنامه‌های این آخر هفته‌ات صحبت کن.",
            "از I'm going to... / I'm planning to... استفاده کن."),
        SpeakingTask("Suggest an activity to a friend.",
            "به یه دوست یه فعالیت پیشنهاد بده.",
            "از Let's... / How about... / Why don't we... استفاده کن."),
        SpeakingTask("Describe your ideal weekend.",
            "آخر هفته ایده‌آلت رو توصیف کن.",
            "از I love to... / I enjoy... استفاده کن."),
        SpeakingTask("Compare your weekend vs a friend's weekend.",
            "آخر هفته‌ات رو با آخر هفته یه دوست مقایسه کن.",
            "از always, usually, sometimes استفاده کن."),
        SpeakingTask("Invite someone to do something.",
            "کسی رو برای انجام کاری دعوت کن.",
            "از Do you want to...? / Are you free...? استفاده کن.")
    ),
    writingTasks = listOf(
        WritingTask("Write about your typical weekend.",
            "درباره آخر هفته معمولی‌ت بنویس.",
            120,
            "شامل: شنبه، یکشنبه — با فعالیت‌ها"),
        WritingTask("Write an email inviting a friend for the weekend.",
            "یک ایمیل بنویس و دوستت رو برای آخر هفته دعوت کن.",
            150,
            "شامل: برنامه، زمان، مکان، چیزهایی که بیاره"),
        WritingTask("Describe your ideal weekend.",
            "آخر هفته ایده‌آلت رو توصیف کن.",
            180,
            "شامل: چه کارهایی، با کی، کجا")
    ),
    quiz = listOf(
        QuizQuestion("معنی «Relax» چیست؟",
            listOf("خسته شدن", "استراحت کردن", "کار کردن", "دویدن"), 1),
        QuizQuestion("کدام درست است؟",
            listOf("I going to stay.", "I'm going to stay.", "I'm go to stay.", "I going stay."), 1),
        QuizQuestion("معنی «Picnic» چیست؟",
            listOf("سفر", "پیک‌نیک", "مهمانی", "کمپینگ"), 1),
        QuizQuestion("«او می‌خواهد سفر کند.»",
            listOf("She going to travel.", "She's going to travel.", "She go to travel.", "She going travel."), 1),
        QuizQuestion("معنی «Hiking» چیست؟",
            listOf("شنا", "کوه‌پیمایی", "سفر", "پیک‌نیک"), 1),
        QuizQuestion("کدام درست است؟",
            listOf("We going to watch.", "We're going to watch.", "We're go to watch.", "We going watch."), 1),
        QuizQuestion("معنی «Sightseeing» چیست؟",
            listOf("خرید", "گردش", "ورزش", "استراحت"), 1),
        QuizQuestion("«What are you going to do?» یعنی؟",
            listOf("چیکار کردی؟", "چیکار می‌کنی؟", "چیکار می‌خوای بکنی؟", "چیکار نمی‌کنی؟"), 2),
        QuizQuestion("«go swimming» یعنی؟",
            listOf("شنا رفتن", "شنا کردن", "شنا یاد گرفتن", "شنا تماشا کردن"), 0),
        QuizQuestion("«play tennis» یعنی؟",
            listOf("تنیس رفتن", "تنیس بازی کردن", "تنیس تماشا کردن", "تنیس یاد گرفتن"), 1),
        QuizQuestion("«Let's go out» یعنی؟",
            listOf("بیا بریم بیرون", "بیا بیرون باشیم", "بیرون نرو", "بیرون می‌ری"), 0),
        QuizQuestion("کدام درست است؟",
            listOf("How about go hiking?", "How about going hiking?", "How about to go hiking?", "How about went hiking?"), 1),
        QuizQuestion("معنی «sleep in» چیست؟",
            listOf("زود خوابیدن", "تا دیروقت خوابیدن", "خواب دیدن", "خواب بدیدن"), 1),
        QuizQuestion("«on weekends» یعنی؟",
            listOf("آخر هفته‌ها", "روزهای کاری", "هر روز", "بعضی روزها"), 0),
        QuizQuestion("معنی «couch potato» چیست؟",
            listOf("سیب‌زمینی", "آدم تنبل", "آدم پرکار", "آدم ورزشکار"), 1)
    )
)

13 -> LessonContent("top_notch_1", 13, "Home and Neighborhood", "خانه و محله",
    objectives = listOf(
        "یادگیری ۱۵ واژه مربوط به خانه و وسایل",
        "استفاده از There is / There are برای توصیف خانه",
        "بیان مکان با حروف اضافه (in, on, under, next to, between)",
        "توصیف محله و امکانات آن",
        "صحبت درباره اجاره و خرید خانه",
        "سوال پرسیدن درباره آدرس و مسیر"
    ),
    vocabulary = listOf(
        VocabWord("House", "خانه", "haʊs", "n",
            "They live in a big house in the suburbs.",
            "آن‌ها در یه خانه بزرگ در حومه شهر زندگی می‌کنند.",
            "a big house / a family house / a country house",
            "home, residence", "",
            "house (n/v) / housing (n) / household (n)", "neutral",
            "💡 house (ساختمان) ≠ home (مفهوم عاطفی)."),
        VocabWord("Apartment", "آپارتمان", "əˈpɑːrtmənt", "n",
            "I rent a small apartment downtown.",
            "من یه آپارتمان کوچیک در مرکز شهر اجاره کردم.",
            "a furnished apartment / a studio apartment / rent an apartment",
            "flat (BrE)", "house",
            "apartment (n) / apartment complex (n)", "neutral",
            "💡 apartment (آمریکا)، flat (بریتانیا)."),
        VocabWord("Kitchen", "آشپزخانه", "ˈkɪtʃɪn", "n",
            "The kitchen is my favorite room in the house.",
            "آشپزخانه اتاق مورد علاقه‌ام در خانه‌ست.",
            "a modern kitchen / a fully-equipped kitchen / a kitchen table",
            "galley", "",
            "kitchen (n) / kitchenette (n)", "neutral",
            "💡 kitchen همیشه برای پخت و پز و غذا."),
        VocabWord("Bedroom", "اتاق خواب", "ˈbedruːm", "n",
            "The house has three bedrooms and two bathrooms.",
            "این خانه سه اتاق خواب و دو حمام داره.",
            "a master bedroom / a guest bedroom / a spare bedroom",
            "sleeping room", "",
            "bed (n) / bedroom (n)", "neutral",
            "💡 master bedroom = اتاق خواب اصلی."),
        VocabWord("Bathroom", "حمام / دستشویی", "ˈbæθruːm", "n",
            "Can I use your bathroom, please?",
            "می‌تونم از دستشویی‌تون استفاده کنم، لطفاً؟",
            "a guest bathroom / use the bathroom",
            "restroom (AmE), toilet (BrE), loo (informal)", "",
            "bath (n) / bathroom (n)", "neutral",
            "💡 در آمریکا bathroom = دستشویی، restroom در مکان عمومی."),
        VocabWord("Living room", "اتاق نشیمن", "ˈlɪvɪŋ ruːm", "n",
            "We watch TV together in the living room.",
            "ما با هم در اتاق نشیمن تلویزیون تماشا می‌کنیم.",
            "a cozy living room / a spacious living room",
            "lounge (BrE), sitting room", "",
            "live (v) / living room (n)", "neutral",
            "💡 در بریتانیا lounge یا sitting room."),
        VocabWord("Garden", "باغ / حیاط", "ˈɡɑːrdən", "n",
            "She grows flowers and vegetables in her garden.",
            "او در باغش گل و سبزیجات پرورش می‌ده.",
            "a vegetable garden / a flower garden / a garden party",
            "yard (AmE)", "",
            "garden (n/v) / gardener (n) / gardening (n)", "neutral",
            "💡 در آمریکا yard، در بریتانیا garden."),
        VocabWord("Balcony", "بالکن", "ˈbælkəni", "n",
            "Our apartment has a small balcony with a great view.",
            "آپارتمان ما یه بالکن کوچیک با منظره عالی داره.",
            "a small balcony / a balcony with a view",
            "terrace, porch", "",
            "balcony (n) / balconies (جمع)", "neutral",
            "💡 جمعش balconies هست (y → ies)."),
        VocabWord("Garage", "پارکینگ / گاراژ", "ɡəˈrɑːʒ", "n",
            "He parks his car in the garage.",
            "او ماشینش رو در پارکینگ پارک می‌کنه.",
            "a two-car garage / park in the garage",
            "carport", "",
            "garage (n) / garage sale (n)", "neutral",
            "💡 تلفظش /ɡəˈrɑːʒ/ (فرانسوی) یا /ˈɡær.ɪdʒ/ (آمریکایی)."),
        VocabWord("Neighbor", "همسایه", "ˈneɪbər", "n",
            "Our neighbors are very friendly.",
            "همسایه‌های ما خیلی خوش‌برخورد هستن.",
            "a next-door neighbor / a good neighbor / neighborly",
            "resident", "",
            "neighbor (n) / neighborhood (n) / neighboring (adj)", "neutral",
            "💡 neighbor (آمریکا)، neighbour (بریتانیا)."),
        VocabWord("Neighborhood", "محله", "ˈneɪbərhʊd", "n",
            "It's a quiet, safe neighborhood.",
            "محله‌ای ساکت و امنه.",
            "a nice neighborhood / in the neighborhood / a friendly neighborhood",
            "area, district, community", "",
            "neighbor (n) / neighborhood (n)", "neutral",
            "💡 in the neighborhood = در محله / نزدیک."),
        VocabWord("Rent", "اجاره", "rent", "n/v",
            "The rent is $1,200 per month.",
            "اجاره ماهی ۱۲۰۰ دلاره.",
            "pay rent / high rent / rent an apartment",
            "lease", "",
            "rent (n/v) / rental (n) / renter (n)", "neutral",
            "💡 rent هم اسم، هم فعل."),
        VocabWord("Landlord", "صاحب‌خانه", "ˈlændlɔːrd", "n",
            "Our landlord is very nice and helpful.",
            "صاحب‌خانه ما خیلی خوب و کمک‌کننده‌ست.",
            "a strict landlord / a landlord's responsibilities",
            "property owner", "tenant",
            "landlord (n) / landlady (n: زن)", "formal",
            "💡 landlady = صاحب‌خانه زن (کمتر رایجه)."),
        VocabWord("Address", "آدرس", "əˈdres", "n",
            "What's your address? — 123 Main Street.",
            "آدرست چیه؟ — خیابان اصلی، پلاک ۱۲۳.",
            "home address / email address / street address",
            "location", "",
            "address (n/v) / addressee (n)", "neutral",
            "💡 address در بریتانیا /əˈdres/، در آمریکا /ˈæd.res/."),
        VocabWord("Convenient", "راحت / مناسب", "kənˈviːniənt", "adj",
            "The location is very convenient — close to the metro.",
            "موقعیت خیلی مناسبه — نزدیک مترو.",
            "convenient location / convenient time / very convenient",
            "handy, suitable", "inconvenient",
            "convenience (n) / convenient (adj) / conveniently (adv)", "neutral",
            "💡 convenient برای مکان، زمان یا شرایط."),
        VocabWord("Quiet", "ساکت / آرام", "ˈkwaɪət", "adj",
            "I love the neighborhood because it's so quiet.",
            "محله رو دوست دارم چون خیلی ساکته.",
            "a quiet street / a quiet neighborhood / keep quiet",
            "peaceful, calm", "noisy, loud",
            "quiet (adj) / quietly (adv) / quietness (n)", "neutral",
            "💡 quiet برای مکان، people, یا صدا.")
    ),
    idioms = listOf(
        IdiomExpression("Home sweet home", "خونه‌ی خود آدم خوبه",
            "After the long trip, home sweet home!",
            "بعد از سفر طولانی، خونه خود آدم خوبه!", "idiom"),
        IdiomExpression("Feel at home", "احساس راحتی کردن",
            "Please feel at home — make yourself comfortable.",
            "لطفاً راحت باش — احساس غریبی نکن.", "neutral"),
        IdiomExpression("Home away from home", "جای دوم مثل خونه",
            "This cafe is my home away from home.",
            "این کافه برام مثل خونه دومه.", "idiom"),
        IdiomExpression("Not in my backyard", "تو حیاط من نه (مخالف چیزی در محله)",
            "They don't want a factory — not in my backyard!",
            "اونا کارخونه نمی‌خوان — تو حیاط من نه!", "idiom"),
        IdiomExpression("Location, location, location", "موقعیت مهم‌ترین چیزه",
            "For real estate, it's always location, location, location.",
            "برای املاک، همیشه موقعیت مهم‌ترینه.", "idiom"),
        IdiomExpression("The neighborhood watch", "گروه نگهبان محله",
            "Our neighborhood watch keeps the area safe.",
            "گروه نگهبان محله ما، منطقه رو امن نگه می‌داره.", "neutral"),
        IdiomExpression("Across the street", "اون طرف خیابون",
            "The bakery is just across the street.",
            "نانوایی دقیقاً اون طرف خیابونه.", "neutral"),
        IdiomExpression("Next door", "همسایه دیوار به دیوار",
            "A young couple lives next door.",
            "یه زوج جوون همسایه دیوار به دیوارمون زندگی می‌کنن.", "neutral"),
        IdiomExpression("Upstairs / Downstairs", "طبقه بالا / پایین",
            "The bedrooms are upstairs, and the kitchen is downstairs.",
            "اتاق‌های خواب بالا هستن، آشپزخانه پایین.", "neutral"),
        IdiomExpression("On the corner", "سر خیابان",
            "The pharmacy is on the corner of Main and 5th.",
            "داروخانه سر خیابون اصلی و پنجمه.", "neutral")
    ),
    phrasalVerbs = listOf(
        PhrasalVerb("move in", "اسباب‌کشی کردن به",
            "اسباب‌کشی کردن",
            "We moved in last weekend.",
            "آخر هفته پیش اسباب‌کشی کردیم.", "غیرقابل جدا شدن"),
        PhrasalVerb("move out", "اسباب‌کشی کردن از",
            "اسباب‌کشی کردن",
            "They're moving out at the end of the month.",
            "آخر ماه دارن اسباب‌کشی می‌کنن.", "غیرقابل جدا شدن"),
        PhrasalVerb("settle in", "خو گرفتن",
            "خو گرفتن",
            "It took a few weeks to settle in.",
            "چند هفته طول کشید تا خو بگیریم.", "غیرقابل جدا شدن"),
        PhrasalVerb("tidy up", "مرتب کردن",
            "مرتب کردن",
            "Let's tidy up the living room.",
            "بیا اتاق نشیمن رو مرتب کنیم.", "جدا شدنی"),
        PhrasalVerb("put up", "نصب کردن / آویزون کردن",
            "نصب کردن",
            "We put up new curtains yesterday.",
            "دیروز پرده‌های جدید نصب کردیم.", "جدا شدنی"),
        PhrasalVerb("fix up", "تعمیر کردن",
            "تعمیر کردن",
            "They're fixing up the old house.",
            "دارن خونه قدیمی رو تعمیر می‌کنن.", "جدا شدنی"),
        PhrasalVerb("drop by", "سر زدن",
            "سر زدن",
            "Feel free to drop by anytime.",
            "هر وقت خواستی سر بزن.", "غیرقابل جدا شدن"),
        PhrasalVerb("lock up", "قفل کردن",
            "قفل کردن",
            "Don't forget to lock up before you leave.",
            "فراموش نکن قبل از رفتن قفل کنی.", "جدا شدنی")
    ),
    pronunciationTips = listOf(
        PronunciationTip("تلفظ neighborhood",
            "🔊 تلفظ:\n" +
            "• neighborhood /ˈneɪ.bər.hʊd/\n" +
            "• همیشه سه سیلاب: NEIGH-bor-hood\n\n" +
            "💡 خیلی‌ها اشتباهاً «نِیبورخود» می‌گن."),
        PronunciationTip("تلفظ /aʊ/ در house و apartment",
            "🔊 صدای /aʊ/:\n" +
            "• house /haʊs/\n" +
            "• out /aʊt/\n" +
            "• about /əˈbaʊt/\n\n" +
            "🔸 دقت کن با /oʊ/ اشتباه نگیری:\n" +
            "• home /hoʊm/ ≠ house /haʊs/"),
        PronunciationTip("استرس در واژه‌های خانه",
            "🔊 استرس:\n" +
            "• aPARTment /əˈpɑːrt.mənt/\n" +
            "• BATHroom /ˈbæθ.ruːm/\n" +
            "• BEDroom /ˈbed.ruːm/\n" +
            "• KITchen /ˈkɪtʃ.ɪn/\n" +
            "• NEIGHborhood /ˈneɪ.bər.hʊd/\n\n" +
            "💡 در اسامی مرکب، استرس روی کلمه اول.")
    ),
    culturalNotes = listOf(
        CulturalNote("فرهنگ اجاره در غرب",
            "🌍 در آمریکا و اروپا، اجاره کردن رایجه:\n" +
            "• rent = اجاره\n" +
            "• lease = قرارداد اجاره\n" +
            "• deposit = ودیعه (یک ماه یا بیشتر)\n" +
            "• utilities = قبض‌ها (آب، برق، گاز، اینترنت)\n\n" +
            "💡 در آمریکا، معمولاً ودیعه = یک ماه اجاره."),
        CulturalNote("انواع خانه در غرب",
            "🌍 انواع خانه:\n" +
            "• Studio apartment = یک اتاقه (آشپزخانه+اتاق)\n" +
            "• One-bedroom = یک خوابه\n" +
            "• Loft = آپارتمان با سقف بلند\n" +
            "• Townhouse = خانه ردیفی\n" +
            "• Duplex = خانه دو خانواری\n\n" +
            "💡 در آمریکا، square footage (متراژ) مهمه."),
        CulturalNote("فرهنگ همسایگی",
            "🌍 در غرب، روابط با همسایه‌ها متفاوته:\n" +
            "• سلام کردن و احوال‌پرسی کوتاه رایجه\n" +
            "• دعوت به مهمونی (باربیکیو، پیک‌نیک) رایجه\n" +
            "• حفظ حریم خصوصی مهمه\n\n" +
            "💡 در آمریکا، neighborhood watch گروه‌های داوطلب امنیت محله‌ست."),
        CulturalNote("همسایه‌ها در ایران vs غرب",
            "🌍 در ایران، روابط همسایگی صمیمی‌تره:\n" +
            "• رفت و آمد بیشتر\n" +
            "• کمک به همسایه رایجه\n\n" +
            "🔸 در غرب:\n" +
            "• فاصله بیشتر حفظ می‌شه\n" +
            "• ولی همسایه‌های خوب کمک می‌کنن\n\n" +
            "💡 در غرب، «good fences make good neighbors» (حیاط خوب = همسایه خوب).")
    ),
    grammar = listOf(
        GrammarSection("📌 There is / There are + مکان",
            "🔹 فرمول:\n" +
            "• There is + مفرد: There is a sofa in the living room.\n" +
            "• There are + جمع: There are two bedrooms upstairs.\n\n" +
            "🔸 سوال:\n" +
            "• Is there a balcony?\n" +
            "• Are there any parks nearby?\n\n" +
            "🔸 منفی:\n" +
            "• There isn't a garage.\n" +
            "• There aren't any elevators.\n\n" +
            "⚠️ ❌ There is two beds. → ✅ There are two beds."),
        GrammarSection("📌 حروف اضافه مکان",
            "🔹 رایج‌ترین‌ها:\n" +
            "• in (داخل): in the kitchen\n" +
            "• on (روی): on the table\n" +
            "• under (زیر): under the bed\n" +
            "• next to (کنار): next to the door\n" +
            "• between (بین): between the two rooms\n" +
            "• in front of (جلوی): in front of the house\n" +
            "• behind (پشت): behind the garage\n" +
            "• across from (روبرو): across from the park\n" +
            "• near (نزدیک): near the metro\n" +
            "• on the corner (سر خیابان)\n\n" +
            "⚠️ ❌ It's in your right. → ✅ It's on your right."),
        GrammarSection("📌 تفاوت in / on / at برای مکان",
            "🔹 قاعده:\n" +
            "• in + فضای بسته / شهر / کشور: in the room, in Tehran, in Iran\n" +
            "• on + سطح: on the wall, on the street, on the second floor\n" +
            "• at + نقطه خاص: at the bus stop, at the corner, at home\n\n" +
            "🔸 مثال:\n" +
            "• I live in Tehran. / I live on Valiasr Street.\n" +
            "• I live at 123 Valiasr Street.\n\n" +
            "💡 at برای نقطه، in برای فضا، on برای سطح."),
        GrammarSection("📌 حرف تعریف با مکان‌های خانه",
            "🔹 با the:\n" +
            "• the kitchen, the bathroom, the living room, the garage\n\n" +
            "🔸 بدون the:\n" +
            "• home, bed (go to bed)\n" +
            "• I go home. (نه to the home)\n" +
            "• I go to bed. (نه to the bed)\n\n" +
            "💡 at home (بدون the) = خونه بودن."),
        GrammarSection("📌 توصیف خانه با صفات",
            "🔹 صفات رایج:\n" +
            "• big / small / spacious / cozy / modern / old-fashioned\n" +
            "• bright / dark / clean / messy / furnished / unfurnished\n" +
            "• quiet / noisy / safe / convenient\n\n" +
            "🔸 مثال:\n" +
            "• It's a cozy, bright apartment.\n" +
            "• The neighborhood is quiet and safe.\n\n" +
            "💡 ترتیب صفات: opinion + size + age + origin."),
        GrammarSection("📌 سوال درباره آدرس و مسیر",
            "🔹 سوالات رایج:\n" +
            "• Where do you live?\n" +
            "• What's your address?\n" +
            "• How do I get to your place?\n" +
            "• Is it far from here?\n" +
            "• What's the neighborhood like?\n\n" +
            "🔸 پاسخ:\n" +
            "• I live on Main Street, near the park.\n" +
            "• It's about 10 minutes on foot.\n" +
            "• Take the metro to Central Station, then walk 5 minutes."),
        GrammarSection("📌 توصیف محله با There is / There are",
            "🔹 مثال:\n" +
            "• There's a supermarket on the corner.\n" +
            "• There are two schools in the neighborhood.\n" +
            "• There isn't a hospital nearby.\n\n" +
            "🔸 سوال:\n" +
            "• Is there a bank near your house?\n" +
            "• Are there any good restaurants around?\n\n" +
            "💡 any در سوال و منفی."),
        GrammarSection("📌 تفاوت house / home / apartment",
            "🔹 این کلمات با هم اشتباه می‌شن:\n" +
            "• House = خانه مستقل (ویلایی)\n" +
            "• Home = مفهوم خانه (جایی که زندگی می‌کنی)\n" +
            "• Apartment = آپارتمان (AmE)\n" +
            "• Flat = آپارتمان (BrE)\n\n" +
            "🔸 مثال:\n" +
            "• I live in an apartment. (AmE)\n" +
            "• I live in a flat. (BrE)\n" +
            "• There's no place like home. (اصطلاح)\n\n" +
            "💡 home مفهوم عاطفی داره، house فقط ساختمان.")
    ),
    commonMistakes = listOf(
        CommonMistake("There is two beds.", "There are two beds.", "با جمع از there are."),
        CommonMistake("I go to the home.", "I go home.", "home بدون the."),
        CommonMistake("I go to the bed.", "I go to bed.", "go to bed بدون the."),
        CommonMistake("I live in Valiasr Street.", "I live on Valiasr Street.", "برای اسم خیابان از on."),
        CommonMistake("It's in your right.", "It's on your right.", "برای جهت از on."),
        CommonMistake("There have two parks.", "There are two parks.", "there are، نه there have."),
        CommonMistake("I live in the Iran.", "I live in Iran.", "کشورها معمولاً بدون the."),
        CommonMistake("in the second floor", "on the second floor", "برای طبقه از on."),
        CommonMistake("in the corner", "on the corner / at the corner", "برای گوشه خیابان on/at."),
        CommonMistake("near to my house", "near my house", "near بدون to."),
        CommonMistake("I live in Tehran city.", "I live in Tehran.", "city اضافی است."),
        CommonMistake("next the bank", "next to the bank", "next to لازمه.")
    ),
    conversation = listOf(
        DialogueLine("A", "Hi, I heard you moved to a new place. How is it?",
            "سلام، شنیدم اسباب‌کشی کردی به یه جای جدید. چطوره؟"),
        DialogueLine("B", "It's great! It's a small apartment, but very cozy.",
            "عالیه! یه آپارتمان کوچیکه، ولی خیلی دنج."),
        DialogueLine("A", "Nice! Where is it exactly?",
            "خوبه! دقیقاً کجاست؟"),
        DialogueLine("B", "On Elm Street, near the big park. It's a quiet neighborhood.",
            "خیابان الم، نزدیک پارک بزرگ. محله ساکتیه."),
        DialogueLine("A", "Sounds lovely. How many rooms does it have?",
            "قشنگ به نظر می‌رسه. چند تا اتاق داره؟"),
        DialogueLine("B", "Two — one bedroom and a living room. Oh, and a small kitchen.",
            "دو تا — یه اتاق خواب و یه نشیمن. اوه، و یه آشپزخانه کوچیک."),
        DialogueLine("A", "Is there a balcony?",
            "بالکن داره؟"),
        DialogueLine("B", "Yes! It has a small balcony with a nice view.",
            "بله! یه بالکن کوچیک با منظره خوب داره."),
        DialogueLine("A", "That's nice. Is it furnished?",
            "خوبه. مبله‌ست؟"),
        DialogueLine("B", "Partially. It has a sofa and a bed, but I need to buy more stuff.",
            "تا حدی. یه مبل و یه تخت داره، ولی باید چیزهای بیشتری بخرم."),
        DialogueLine("A", "How much is the rent, if you don't mind me asking?",
            "اجاره‌اش چقدره، اگه اشکالی نداره بپرسم؟"),
        DialogueLine("B", "It's $1,200 a month, utilities not included.",
            "ماهی ۱۲۰۰ دلاره، قبض‌ها جدا."),
        DialogueLine("A", "Not bad for that area. Do you have neighbors?",
            "برای اون منطقه بد نیست. همسایه داری؟"),
        DialogueLine("B", "Yes, a young couple next door. They're really friendly.",
            "بله، یه زوج جوون دیوار به دیوار. خیلی خوش‌برخوردن."),
        DialogueLine("A", "That's good. Is there a supermarket nearby?",
            "خوبه. سوپرمارکتی نزدیک هست؟"),
        DialogueLine("B", "Yes, there's one on the corner. And a pharmacy across the street.",
            "بله، یکی سر خیابون هست. و یه داروخانه اون طرف خیابون."),
        DialogueLine("A", "Perfect location! Are there any good restaurants?",
            "موقعیت عالی! رستوران خوب هم هست؟"),
        DialogueLine("B", "A few. There's a great Italian place just two blocks away.",
            "چند تا. یه رستوران ایتالیایی عالی فقط دو بلوک اون‌طرف‌تره."),
        DialogueLine("A", "Sounds like a great move!",
            "به نظر می‌رسه اسباب‌کشی خوبی بوده!"),
        DialogueLine("B", "It really is. You should come visit sometime!",
            "واقعاً همینطوره. یه وقت باید بیای ببینish!")
    ),
    comprehensionQuestions = listOf(
        ComprehensionQuestion("راوی به چه نوع خانه‌ای اسباب‌کشی کرده؟",
            "به یک آپارتمان کوچک ولی دنج."),
        ComprehensionQuestion("آپارتمان چند اتاق دارد؟",
            "دو اتاق — یک اتاق خواب و یک اتاق نشیمن، به‌علاوه آشپزخانه کوچک."),
        ComprehensionQuestion("آپارتمان بالکن دارد؟",
            "بله، بالکن کوچکی با منظره خوب دارد."),
        ComprehensionQuestion("اجاره آپارتمان چقدر است؟",
            "ماهی ۱۲۰۰ دلار، بدون احتساب قبض‌ها."),
        ComprehensionQuestion("محله چه امکاناتی دارد؟",
            "سوپرمارکت سر خیابان، داروخانه آن طرف خیابان، و رستوران ایتالیایی دو بلوک آن‌طرف‌تر.")
    ),
    speakingTasks = listOf(
        SpeakingTask("Describe your home.",
            "خونت رو توصیف کن.",
            "از There is / There are و صفاتی مثل cozy, bright استفاده کن."),
        SpeakingTask("Talk about your neighborhood.",
            "درباره محله‌ات صحبت کن.",
            "از حروف اضافه مکان (near, next to, across from) استفاده کن."),
        SpeakingTask("Describe your dream house.",
            "خانه رویایی‌ت رو توصیف کن.",
            "از اتاق‌ها، وسایل، و مکان (in the city, near the beach) استفاده کن."),
        SpeakingTask("Give directions from your home to a nearby place.",
            "از خونت به یه جای نزدیک مسیر بده.",
            "از Go straight, Turn left/right, It's across from... استفاده کن."),
        SpeakingTask("Ask a friend about their apartment.",
            "از یه دوست درباره آپارتمانش بپرس.",
            "از How many rooms? / Is there a...? / How much is the rent? استفاده کن.")
    ),
    writingTasks = listOf(
        WritingTask("Describe your home in detail.",
            "خونت رو با جزئیات توصیف کن.",
            120,
            "شامل: نوع خانه، اتاق‌ها، وسایل، محله، چرا دوستش داری"),
        WritingTask("Write about your neighborhood.",
            "درباره محله‌ات بنویس.",
            150,
            "شامل: چه امکاناتی داره، چه جور جاییه، چرا خوبه"),
        WritingTask("Write an email inviting a friend to visit your new home.",
            "ایمیل بنویس و دوستت رو به دیدن خونه جدیدت دعوت کن.",
            180,
            "شامل: آدرس، ویژگی‌های خونه، برنامه پیشنهادی")
    ),
    quiz = listOf(
        QuizQuestion("معنی «Kitchen» چیست؟",
            listOf("اتاق خواب", "آشپزخانه", "حمام", "نشیمن"), 1),
        QuizQuestion("کدام درست است؟",
            listOf("There is two beds.", "There are two beds.", "There have two beds.", "There has two."), 1),
        QuizQuestion("معنی «Balcony» چیست؟",
            listOf("حیاط", "بالکن", "گاراژ", "پشت‌بام"), 1),
        QuizQuestion("«زیر میز» کدام است؟",
            listOf("on the table", "in the table", "under the table", "next to the table"), 2),
        QuizQuestion("کدام درست است؟",
            listOf("There are a sofa.", "There is a sofa.", "There have a sofa.", "There has a sofa."), 1),
        QuizQuestion("معنی «Neighbor» چیست؟",
            listOf("دوست", "همسایه", "فامیل", "همکار"), 1),
        QuizQuestion("«کنار در» کدام است؟",
            listOf("on the door", "under the door", "next to the door", "in the door"), 2),
        QuizQuestion("معنی «Elevator» چیست؟",
            listOf("پله", "آسانسور", "راهرو", "بالکن"), 1),
        QuizQuestion("کدام بدون the میاد؟",
            listOf("the home", "home", "the house", "the kitchen"), 1),
        QuizQuestion("کدام درست است؟",
            listOf("I live in Valiasr Street.", "I live on Valiasr Street.", "I live at Valiasr Street.", "I live Valiasr Street."), 1),
        QuizQuestion("«روبروی موزه» کدام است؟",
            listOf("next to the museum", "across from the museum", "under the museum", "in the museum"), 1),
        QuizQuestion("معنی «Landlord» چیست؟",
            listOf("همسایه", "صاحب‌خانه", "مستأجر", "هم‌اتاقی"), 1),
        QuizQuestion("«on the corner» یعنی؟",
            listOf("سر خیابان", "توی خیابان", "وسط خیابان", "آخر خیابان"), 0),
        QuizQuestion("تفاوت house و home؟",
            listOf("هیچ فرقی ندارند", "house ساختمان، home مفهوم عاطفی", "home ساختمان، house مفهوم عاطفی", "house فقط برای اجاره"), 1),
        QuizQuestion("«at home» یعنی؟",
            listOf("در خانه (مفهوم عاطفی)", "در خانه (ساختمان)", "در خانه کسی", "در خانه اجاره‌ای"), 0)
    )
)