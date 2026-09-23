package com.zabanyar.ai.data

object TopNotch1Repository {

    fun getContent(chapter: Int): LessonContent {
        return when (chapter) {
            1 -> getChapter1()
            2 -> getChapter2()
            3 -> getChapter3()
            4 -> getChapter4()
            5 -> getChapter5()
            6 -> getChapter6()
            7 -> getChapter7()
            8 -> getChapter8()
            9 -> getChapter9()
            10 -> getChapter10()
            11 -> getChapter11()
            12 -> getChapter12()
            13 -> getChapter13()
            else -> getDefaultContent("top_notch_1", chapter)
        }
    }

    private fun getChapter1(): LessonContent {
        return LessonContent("top_notch_1", 1, "Names and Occupations", "نام‌ها و شغل‌ها",
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
                    "💡 در آمریکا attorney رایج‌تره."),
                VocabWord("Photographer", "عکاس", "fəˈtɑːɡrəfər", "n",
                    "The photographer captured the wedding beautifully.",
                    "عکاس مراسم عروسی را زیبا ثبت کرد.",
                    "a professional photographer / a wildlife photographer",
                    "shutterbug (غیررسمی)", "",
                    "photograph (n/v) / photography (n)", "neutral",
                    "💡 wedding photographer تخصص رایجه."),
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
                    "💡 cook عمومی‌تره، chef رئیس آشپزخانه‌ست."),
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
                    "💡 electrician برای برق ساختمان."),
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
                    "My dad is a jack of all trades — he can fix anything!", "بابام همه‌فن‌حریفه.", "idiom")
            ),
            phrasalVerbs = listOf(
                PhrasalVerb("work out", "حل شدن / ورزش کردن", "حل شدن / ورزش کردن",
                    "Everything will work out in the end.", "در نهایت همه چیز حل می‌شود.", "غیرقابل جدا شدن"),
                PhrasalVerb("take on", "به عهده گرفتن / استخدام کردن", "به عهده گرفتن",
                    "She took on a new project at work.", "او یک پروژه جدید در محل کار به عهده گرفت.", "جدا شدنی"),
                PhrasalVerb("take up", "شروع کردن (سرگرمی/کار)", "شروع کردن",
                    "He took up photography last year.", "او سال گذشته عکاسی را شروع کرد.", "جدا شدنی"),
                PhrasalVerb("fill in for", "جای کسی را پر کردن", "جای کسی رو گرفتن",
                    "Can you fill in for me while I'm on vacation?", "می‌تونی جای من رو پر کنی؟", "غیرقابل جدا شدن"),
                PhrasalVerb("get ahead", "پیشرفت کردن", "پیشرفت کردن",
                    "To get ahead in your career, you need to network.", "برای پیشرفت باید شبکه‌سازی کنی.", "غیرقابل جدا شدن"),
                PhrasalVerb("burn out", "فرسوده شدن", "فرسوده شدن",
                    "Many doctors burn out after years of long hours.", "بسیاری از پزشکان فرسوده می‌شوند.", "غیرقابل جدا شدن"),
                PhrasalVerb("call in sick", "مرخصی استعلاجی گرفتن", "مرخصی مریضی گرفتن",
                    "I had to call in sick today.", "امروز مجبور شدم مرخصی مریضی بگیرم.", "غیرقابل جدا شدن"),
                PhrasalVerb("hand in", "تحویل دادن", "تحویل دادن",
                    "She handed in her resignation yesterday.", "او دیروز استعفایش را تحویل داد.", "جدا شدنی")
            ),
            pronunciationTips = listOf(
                PronunciationTip("استرس کلمه در اسامی شغل‌ها",
                    "🔊 بیشتر اسامی شغل‌های دو سیلابی روی سیلاب اول استرس دارند:\n" +
                    "• TEACH-er /ˈtiː.tʃər/\n• DOC-tor /ˈdɑːk.tər/\n\n" +
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
                    "• RTO = Return To Office."),
                CulturalNote("عنوان‌های شغلی در مکالمات رسمی",
                    "🌍 در مکالمات رسمی از عنوان کامل استفاده می‌کنن:\n" +
                    "• Dr. Smith\n• Professor Johnson\n• Mr./Ms./Mrs. + فامیل")
            ),
            grammar = listOf(
                GrammarSection("📌 a / an + شغل‌ها - پایه",
                    "🔹 فرمول: Subject + be + a/an + شغل\n• I am a teacher. / She is an architect.\n\n" +
                    "🔸 a قبل از حروف بی‌صدا، an قبل از صدادار:\n" +
                    "• a teacher, a doctor\n• an engineer, an actor\n• an hour (استثنا)\n\n" +
                    "⚠️ ❌ They are a doctors. → ✅ They are doctors."),
                GrammarSection("📌 a / an + شغل‌ها - پیشرفته",
                    "🔹 a/an فقط برای مفرد نامشخص:\n" +
                    "• I'm a teacher. (یک معلم)\n• The teacher is late. (همون معلم مشخص)\n\n" +
                    "🔸 ساختارهای رسمی:\n" +
                    "• I hold a position as a senior engineer.\n• I serve as the head of the department."),
                GrammarSection("📌 do / does در سوال",
                    "🔹 فرمول:\n• What do + I/you/we/they + do?\n• What does + he/she/it + do?\n\n" +
                    "🔸 سوال‌های جایگزین:\n• What's your job?\n• What do you do for a living?\n" +
                    "• What line of work are you in?\n• What's your occupation?\n\n" +
                    "⚠️ ❌ What do he do? → ✅ What does he do?"),
                GrammarSection("📌 پاسخ کوتاه (Short Answers)",
                    "🔹 با فعل be:\n• Are you a teacher? → Yes, I am. / No, I'm not.\n\n" +
                    "🔸 با do/does:\n• Do you work here? → Yes, I do. / No, I don't.\n\n" +
                    "⚠️ ❌ Yes, I'm. → ✅ Yes, I am."),
                GrammarSection("📌 ساختارهای جایگزین",
                    "🔹 به جای «I am a teacher»:\n" +
                    "1️⃣ work as + شغل: I work as a teacher.\n" +
                    "2️⃣ work for + شرکت: I work for Google.\n" +
                    "3️⃣ work at + مکان: I work at a hospital.\n" +
                    "4️⃣ work in + حوزه: I work in education.\n" +
                    "5️⃣ be in + حوزه: She's in marketing."),
                GrammarSection("📌 Present Simple برای شغل",
                    "🔹 برای عادت‌های کاری از حال ساده استفاده کن:\n" +
                    "• I teach English. / She manages a team.\n\n" +
                    "🔸 سوم شخص مفرد → فعل + s:\n• teach → teaches / work → works\n\n" +
                    "⚠️ ❌ She work as a nurse. → ✅ She works as a nurse."),
                GrammarSection("📌 تفاوت job / work / career",
                    "🔹 این کلمات با هم اشتباه می‌شن:\n\n" +
                    "• Job = موقعیت شغلی خاص، قابل شمارش\n• Work = فعالیت کاری، غیرقابل شمارش\n" +
                    "• Career = مسیر شغلی بلندمدت\n• Profession = شغل تخصصی\n\n" +
                    "⚠️ ❌ I have a lot of works. → ✅ I have a lot of work."),
                GrammarSection("📌 Formal vs Informal",
                    "🔹 در موقعیت‌های رسمی:\n" +
                    "❌ Informal: What do you do? / I'm a teacher.\n" +
                    "✅ Formal: May I ask what your occupation is?")
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
                CommonMistake("I work as a nurse at hospital.", "I work as a nurse at a hospital.", "a/an لازمه."),
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
    }

    private fun getChapter2(): LessonContent {
        return getDefaultContent("top_notch_1", 2)
    }

    private fun getChapter3(): LessonContent {
        return getDefaultContent("top_notch_1", 3)
    }

    private fun getChapter4(): LessonContent {
        return getDefaultContent("top_notch_1", 4)
    }

    private fun getChapter5(): LessonContent {
        return getDefaultContent("top_notch_1", 5)
    }

    private fun getChapter6(): LessonContent {
        return getDefaultContent("top_notch_1", 6)
    }

    private fun getChapter7(): LessonContent {
        return getDefaultContent("top_notch_1", 7)
    }

    private fun getChapter8(): LessonContent {
        return getDefaultContent("top_notch_1", 8)
    }

    private fun getChapter9(): LessonContent {
        return getDefaultContent("top_notch_1", 9)
    }

    private fun getChapter10(): LessonContent {
        return getDefaultContent("top_notch_1", 10)
    }

    private fun getChapter11(): LessonContent {
        return getDefaultContent("top_notch_1", 11)
    }

    private fun getChapter12(): LessonContent {
        return getDefaultContent("top_notch_1", 12)
    }

    private fun getChapter13(): LessonContent {
        return getDefaultContent("top_notch_1", 13)
    }
}