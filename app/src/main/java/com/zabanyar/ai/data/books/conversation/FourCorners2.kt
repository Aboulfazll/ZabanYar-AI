package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

/**
 * Four Corners 2 — Complete Course Content
 * 12 Units | Elementary (A2)
 * Original educational content (no copyrighted material reproduced)
 * Unit titles and grammar points match the official Cambridge Scope & Sequence
 */
object FourCorners2 {
    const val BOOK_ID = "four_corners_2"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> unit1()
        2 -> unit2()
        3 -> unit3()
        4 -> unit4()
        5 -> unit5()
        6 -> unit6()
        7 -> unit7()
        8 -> unit8()
        9 -> unit9()
        10 -> unit10()
        11 -> unit11()
        12 -> unit12()
        else -> LessonContent(
            BOOK_ID, chapterNumber, "Coming Soon", "به‌زودی...",
            vocabulary = emptyList(), grammar = emptyList(),
            conversation = emptyList(), quiz = emptyList()
        )
    }

    private fun base(
        n: Int, title: String, fa: String,
        objectives: List<String>, vocab: List<VocabWord>,
        grammar: List<GrammarSection>, dialogue: List<DialogueLine>,
        quiz: List<QuizQuestion>,
        idioms: List<IdiomExpression> = emptyList(),
        phrasal: List<PhrasalVerb> = emptyList(),
        pronunciation: List<PronunciationTip> = emptyList(),
        culture: List<CulturalNote> = emptyList(),
        mistakes: List<CommonMistake> = emptyList(),
        comprehension: List<ComprehensionQuestion> = emptyList(),
        speaking: List<SpeakingTask> = emptyList(),
        writing: List<WritingTask> = emptyList()
    ) = LessonContent(
        bookId = BOOK_ID, chapterNumber = n, title = title, titlePersian = fa,
        objectives = objectives, vocabulary = vocab, idioms = idioms,
        phrasalVerbs = phrasal, pronunciationTips = pronunciation,
        culturalNotes = culture, grammar = grammar, commonMistakes = mistakes,
        conversation = dialogue, comprehensionQuestions = comprehension,
        speakingTasks = speaking, writingTasks = writing, quiz = quiz
    )

    private fun v(e: String, p: String, ex: String, ep: String, pos: String = "noun") =
        VocabWord(e, p, partOfSpeech = pos, example = ex, examplePersian = ep)

    private fun d(s: String, e: String, p: String) = DialogueLine(s, e, p)

    private fun q(question: String, options: List<String>, correct: Int) =
        QuizQuestion(question, options, correct)

    // ═══════════════════════════════════════════════════════════════
    // UNIT 1 — My interests | علایق من
    // ═══════════════════════════════════════════════════════════════
    private fun unit1() = base(
        1, "My interests", "علایق من",
        listOf(
            "Talk about interests and hobbies",
            "Ask and answer about free time activities",
            "Use present simple and present continuous",
            "Use object pronouns correctly"
        ),
        listOf(
            v("interest", "علاقه", "What are your interests?", "علایق تو چیست؟"),
            v("interested in", "علاقه‌مند به", "I'm interested in fashion.", "به مد علاقه‌مندم."),
            v("fashion", "مد", "She works in fashion.", "او در حوزه مد کار می‌کند."),
            v("sports", "ورزش", "I love sports.", "عاشق ورزش هستم."),
            v("music", "موسیقی", "Music is my passion.", "موسیقی علاقه من است."),
            v("reading", "خواندن", "Reading is my favorite hobby.", "خواندن سرگرمی مورد علاقه من است."),
            v("traveling", "سفر کردن", "Traveling is fun.", "سفر کردن سرگرم‌کننده است."),
            v("cooking", "آشپزی", "I'm not interested in cooking.", "به آشپزی علاقه ندارم."),
            v("photography", "عکاسی", "She's into photography.", "او به عکاسی علاقه دارد."),
            v("hiking", "کوه‌پیمایی", "We go hiking on weekends.", "آخر هفته‌ها کوه‌پیمایی می‌رویم."),
            v("volunteer", "داوطلب", "I volunteer at a shelter.", "در یک سرپناه داوطلبم.", "verb"),
            v("fan", "طرفدار", "I'm a big fan of soccer.", "طرفدار بزرگ فوتبالم."),
            v("collect", "جمع‌آوری کردن", "I collect stamps.", "تمبر جمع‌آوری می‌کنم.", "verb"),
            v("spend time", "وقت گذراندن", "I spend time with friends.", "با دوستان وقت می‌گذرانم.", "verb"),
            v("hobby", "سرگرمی", "What's your hobby?", "سرگرمی‌ات چیست؟")
        ),
        listOf(
            GrammarSection("Present simple vs. Present continuous", "Use present simple for facts and routines (I play soccer). Use present continuous for actions happening now (I'm playing soccer right now)."),
            GrammarSection("Be interested in + noun/verb-ing", "I'm interested in music. She's interested in learning languages."),
            GrammarSection("Object pronouns", "me, you, him, her, it, us, them. I like him. Can you help us?"),
            GrammarSection("Like + verb-ing", "I like reading. She loves dancing. He enjoys cooking.")
        ),
        listOf(
            d("A", "Hi, Ali! What are your interests?", "سلام، علی! علایق تو چیست؟"),
            d("B", "I'm really interested in music. I play the guitar.", "واقعاً به موسیقی علاقه‌مندم. گیتار می‌زنم."),
            d("A", "Cool! How long have you been playing?", "باحاله! چند سال است می‌زنی؟"),
            d("B", "About five years now. I play every day.", "حدود پنج سال. هر روز می‌زنم."),
            d("A", "That's great. What kind of music do you like?", "عالی است. چه نوع موسیقی دوست داری؟"),
            d("B", "Rock and blues. What about you?", "راک و بلوز. تو چطور؟"),
            d("A", "I'm into photography. I take pictures everywhere.", "من به عکاسی علاقه دارم. همه‌جا عکس می‌گیرم."),
            d("B", "Really? What do you photograph?", "واقعاً؟ از چه چیزی عکس می‌گیری؟"),
            d("A", "Mostly landscapes and people. I love nature.", "بیشتر منظره و مردم. عاشق طبیعتم."),
            d("B", "That sounds amazing. Do you have a website?", "شگفت‌انگیز به نظر می‌رسد. وب‌سایت داری؟"),
            d("A", "Yes, I post my photos there.", "بله، عکس‌هایم را آنجا منتشر می‌کنم."),
            d("B", "I'd love to see them.", "دوست دارم ببینمشان."),
            d("A", "I'll send you the link. What else do you enjoy?", "لینک را می‌فرستم. دیگر از چه لذت می‌بری؟"),
            d("B", "I like reading and hiking. Nature is important to me.", "خواندن و کوه‌پیمایی دوست دارم. طبیعت برایم مهم است."),
            d("A", "Me too! Do you have any other hobbies?", "من هم! سرگرمی دیگری داری؟"),
            d("B", "I volunteer at an animal shelter on Sundays.", "یکشنبه‌ها در سرپناه حیوانات داوطلبم."),
            d("A", "That's wonderful. I love animals.", "شگفت‌انگیز است. عاشق حیواناتم."),
            d("B", "You should come with me sometime.", "باید یک وقت با من بیایی."),
            d("A", "I'd like that. Are you free this Sunday?", "دوست دارم. این یکشنبه آزادی؟"),
            d("B", "Yes, I am. Let's meet at 10 AM.", "بله، هستم. بیایید ساعت ۱۰ صبح ملاقات کنیم."),
            d("A", "Perfect. Where is the shelter?", "عالی. سرپناه کجاست؟"),
            d("B", "On Main Street, near the park.", "در خیابان اصلی، نزدیک پارک."),
            d("A", "Great. See you Sunday!", "عالی. یکشنبه می‌بینمت!"),
            d("B", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is Ali interested in?", listOf("photography", "music", "cooking", "reading"), 1),
            q("What does Maria photograph?", listOf("buildings", "landscapes and people", "animals", "food"), 1),
            q("What does Ali do on Sundays?", listOf("plays guitar", "volunteers at an animal shelter", "reads books", "goes hiking"), 1),
            q("When are they meeting?", listOf("Saturday", "Sunday", "Monday", "Friday"), 1),
            q("I ___ reading.", listOf("like", "likes", "liking", "liked"), 0),
            q("She ___ interested in fashion.", listOf("is", "am", "are", "be"), 0),
            q("I'm interested in ___.", listOf("dance", "dancing", "to dance", "danced"), 1),
            q("I like ___.", listOf("he", "him", "his", "he's"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Into something", "علاقه‌مند به چیزی", "I'm into photography.", "به عکاسی علاقه دارم."),
            IdiomExpression("Big fan", "طرفدار بزرگ", "I'm a big fan of soccer.", "طرفدار بزرگ فوتبالم."),
            IdiomExpression("Spend time", "وقت گذراندن", "I spend time with friends.", "با دوستان وقت می‌گذرانم."),
            IdiomExpression("Hang out", "وقت گذراندن", "We hang out on weekends.", "آخر هفته‌ها وقت می‌گذرانیم.")
        ),
        phrasal = listOf(
            PhrasalVerb("be into", "علاقه‌مند بودن به", "be interested in", "I'm into photography.", "به عکاسی علاقه دارم.", "No"),
            PhrasalVerb("take up", "شروع کردن", "begin", "She took up yoga.", "یوگا را شروع کرد.", "Yes"),
            PhrasalVerb("give up", "رها کردن", "quit", "I gave up smoking.", "سیگار را ترک کردم.", "Yes"),
            PhrasalVerb("hang out", "وقت گذراندن", "spend time", "We hang out on weekends.", "آخر هفته‌ها وقت می‌گذرانیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Interests stress", "FOtography, MUSic, READing, TRAveling."),
            PronunciationTip("-ing endings", "playing /ˈpleɪɪŋ/, reading /ˈriːdɪŋ/, dancing /ˈdænsɪŋ/."),
            PronunciationTip("Interested in linking", "interested in → /ˈɪntrəstɪd ɪn/.")
        ),
        culture = listOf(
            CulturalNote("Hobbies", "Hobbies vary across cultures. Popular ones include sports, music, and reading."),
            CulturalNote("Volunteering", "Volunteering is a common way to give back to the community."),
            CulturalNote("Photography", "Photography is a popular hobby with the rise of social media.")
        ),
        mistakes = listOf(
            CommonMistake("I like read.", "I like reading.", "Use verb-ing after 'like'."),
            CommonMistake("I'm interested in dance.", "I'm interested in dancing.", "Use verb-ing after prepositions."),
            CommonMistake("She interested in music.", "She is interested in music.", "Use 'is' before 'interested'."),
            CommonMistake("I like him.", "I like him.", "Correct.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What are Ali's interests?", "Music (guitar), reading, hiking, volunteering."),
            ComprehensionQuestion("What are Maria's interests?", "Photography, nature, reading."),
            ComprehensionQuestion("What are they doing Sunday?", "Volunteering together at an animal shelter.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your interests.", "درباره علایقت صحبت کن.", "I'm interested in... / I like... / I enjoy..."),
            SpeakingTask("Ask someone about their hobbies.", "درباره سرگرمی‌های کسی بپرس.", "What do you like? / Are you interested in...? / What's your hobby?"),
            SpeakingTask("Invite a friend to an activity.", "دوستت را به فعالیتی دعوت کن.", "Would you like to...? / Let's... / Do you want to...?")
        ),
        writing = listOf(
            WritingTask("Write about your interests and hobbies.", "درباره علایق و سرگرمی‌هایت بنویس.", 120, "Use present simple and like + verb-ing.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 2 — Descriptions | توصیفات
    // ═══════════════════════════════════════════════════════════════
    private fun unit2() = base(
        2, "Descriptions", "توصیفات",
        listOf(
            "Describe people's appearance and personality",
            "Use adjectives for descriptions",
            "Ask about and describe people",
            "Use 'have' and 'be' for descriptions"
        ),
        listOf(
            v("appearance", "ظاهر", "Appearance isn't everything.", "ظاهر همه چیز نیست."),
            v("tall", "قدبلند", "She's very tall.", "او خیلی قدبلند است.", "adjective"),
            v("short", "کوتاه قد", "He's short but strong.", "او کوتاه قد ولی قوی است.", "adjective"),
            v("slim", "لاغر", "My sister is slim.", "خواهرم لاغر است.", "adjective"),
            v("chubby", "چاق", "The baby is chubby.", "بچه تپل است.", "adjective"),
            v("curly", "فر", "He has curly hair.", "او موهای فر دارد.", "adjective"),
            v("straight", "صاف", "She has straight hair.", "او موهای صاف دارد.", "adjective"),
            v("talkative", "پرگو", "He's very talkative.", "او خیلی پرگوست.", "adjective"),
            v("quiet", "ساکت", "She's quiet and shy.", "او ساکت و خجالتی است.", "adjective"),
            v("friendly", "دوستانه", "She's friendly with everyone.", "او با همه دوستانه است.", "adjective"),
            v("shy", "خجالتی", "He's a bit shy.", "او کمی خجالتی است.", "adjective"),
            v("outgoing", "برون‌گرا", "She's very outgoing.", "او خیلی برون‌گراست.", "adjective"),
            v("serious", "جدی", "My boss is serious.", "رئیسم جدی است.", "adjective"),
            v("funny", "خنده‌دار", "He's a funny guy.", "او مرد خنده‌داری است.", "adjective"),
            v("hardworking", "سختکوش", "She's very hardworking.", "او خیلی سختکوش است.", "adjective")
        ),
        listOf(
            GrammarSection("Be + adjective for description", "She is tall. He is friendly. They are quiet."),
            GrammarSection("Have/has + noun for description", "She has long hair. He has blue eyes. They have dark skin."),
            GrammarSection("Adjective order", "Opinion, size, age, shape, color, origin, material. A beautiful big old round brown Italian wooden table."),
            GrammarSection("Questions about description", "What does he look like? What's she like? What color is her hair?")
        ),
        listOf(
            d("A", "Hi, Ali! Have you met the new student?", "سلام، علی! دانشجوی جدید را دیده‌ای؟"),
            d("B", "No, I haven't. What does he look like?", "نه، ندیده‌ام. چه شکلی است؟"),
            d("A", "He's tall and slim with curly dark hair.", "قدبلند و لاغر با موهای فر تیره."),
            d("B", "Is he from here?", "اهل اینجاست؟"),
            d("A", "No, he's from Brazil. He speaks Portuguese.", "نه، اهل برزیل است. پرتغالی صحبت می‌کند."),
            d("B", "Interesting. What's he like?", "جالب است. چطور آدمی است؟"),
            d("A", "He's really friendly and outgoing. Very easy to talk to.", "خیلی دوستانه و برون‌گراست. صحبت با او راحت است."),
            d("B", "That's nice. Is he in our class?", "خوبه. در کلاس ماست؟"),
            d("A", "Yes, he joined yesterday. His name is Rafael.", "بله، دیروز آمد. نامش رافائل است."),
            d("B", "Nice name. Does he play any sports?", "نام قشنگی. ورزشی انجام می‌دهد؟"),
            d("A", "Yes, he loves soccer. He plays every weekend.", "بله، عاشق فوتبال است. هر آخر هفته بازی می‌کند."),
            d("B", "Great. We need more players for our team.", "عالی. به بازیکنان بیشتری برای تیممان نیاز داریم."),
            d("A", "Definitely. He's very good, I heard.", "قطعاً. شنیده‌ام خیلی خوب است."),
            d("B", "Does he like it here?", "اینجا را دوست دارد؟"),
            d("A", "So far, yes. He says everyone is nice.", "تا حالا بله. می‌گوید همه خوبند."),
            d("B", "That's good. What about his family?", "خوبه. خانواده‌اش چطور؟"),
            d("A", "They live in Brazil. He's here alone for a year.", "در برزیل زندگی می‌کنند. یک سال تنهایی اینجاست."),
            d("B", "That must be hard. He's brave.", "باید سخت باشد. شجاع است."),
            d("A", "Yes. But he's excited about the experience.", "بله. ولی درباره تجربه هیجان‌زده است."),
            d("B", "I'd like to meet him.", "دوست دارم ببینمش."),
            d("A", "You should. He's really interesting.", "باید ببینی. خیلی جالب است."),
            d("B", "Maybe I'll see him in class tomorrow.", "شاید فردا در کلاس ببینمش."),
            d("A", "Yes, he sits in the front row.", "بله، ردیف جلو می‌نشیند."),
            d("B", "Great. See you tomorrow!", "عالی. فردا می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Where is the new student from?", listOf("Italy", "Brazil", "Spain", "Mexico"), 1),
            q("What does Rafael look like?", listOf("short and chubby", "tall and slim with curly hair", "tall with straight hair", "short with blonde hair"), 1),
            q("What sport does he love?", listOf("basketball", "tennis", "soccer", "swimming"), 2),
            q("How long will he stay?", listOf("six months", "one year", "two years", "forever"), 1),
            q("She ___ tall.", listOf("is", "has", "have", "are"), 0),
            q("She ___ long hair.", listOf("is", "has", "have", "are"), 1),
            q("He's very ___.", listOf("talk", "talkative", "talking", "talked"), 1),
            q("What does she look ___?", listOf("like", "as", "for", "at"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Easy to talk to", "راحت صحبت کردن با", "He's easy to talk to.", "صحبت با او راحت است."),
            IdiomExpression("So far", "تا حالا", "So far, yes.", "تا حالا، بله."),
            IdiomExpression("Front row", "ردیف جلو", "He sits in the front row.", "ردیف جلو می‌نشیند."),
            IdiomExpression("Excited about", "هیجان‌زده درباره", "He's excited about the experience.", "درباره تجربه هیجان‌زده است.")
        ),
        phrasal = listOf(
            PhrasalVerb("look like", "شبیه بودن", "resemble", "He looks like his father.", "شبیه پدرش است.", "No"),
            PhrasalVerb("get along with", "کنار آمدن با", "have a good relationship", "I get along with him.", "با او کنار می‌آیم.", "No"),
            PhrasalVerb("find out", "فهمیدن", "discover", "I found out he's from Brazil.", "فهمیدم اهل برزیل است.", "Yes"),
            PhrasalVerb("hang out with", "وقت گذراندن با", "spend time with", "I hang out with him.", "با او وقت می‌گذرانم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Adjective stress", "TALL, SHORT, FRIENDly, OUTgoing, SERious."),
            PronunciationTip("'Has' vs 'Is'", "He's /hiːz/ tall. He has /hiː hæz/ long hair."),
            PronunciationTip("Adjective order", "a BEAUtiful BIG OLD ROUND BROWN ITalian WOODen table.")
        ),
        culture = listOf(
            CulturalNote("Describing appearance", "In English, describe appearance briefly — too much detail can sound rude."),
            CulturalNote("Personality", "Personality adjectives are common when describing friends."),
            CulturalNote("Descriptions", "Asking 'What does he look like?' is common for identification.")
        ),
        mistakes = listOf(
            CommonMistake("He has tall.", "He is tall.", "Use 'be' with adjectives."),
            CommonMistake("She is long hair.", "She has long hair.", "Use 'have' with nouns like hair."),
            CommonMistake("How does he look like?", "What does he look like?", "Use 'what' with 'look like'."),
            CommonMistake("She is a beautiful tall young woman.", "She is a beautiful tall young woman.", "Correct order.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does Rafael look like?", "Tall, slim, curly dark hair."),
            ComprehensionQuestion("What's Rafael like as a person?", "Friendly, outgoing, easy to talk to."),
            ComprehensionQuestion("Why is Rafael in town?", "He's studying here for a year, alone.")
        ),
        speaking = listOf(
            SpeakingTask("Describe a friend's appearance.", "ظاهر یک دوست را توصیف کن.", "He/She is... / He/She has... / He/She looks..."),
            SpeakingTask("Describe someone's personality.", "شخصیت کسی را توصیف کن.", "He/She is very... / He/She's a bit... / He/She can be..."),
            SpeakingTask("Ask about a new person.", "درباره فرد جدیدی بپرس.", "What does he look like? / What's she like? / Is he...?")
        ),
        writing = listOf(
            WritingTask("Write a description of a family member.", "توصیفی از یک عضو خانواده بنویس.", 120, "Use be + adjective and have + noun.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 3 — Rain or shine | باران و آفتاب
    // ═══════════════════════════════════════════════════════════════
    private fun unit3() = base(
        3, "Rain or shine", "باران و آفتاب",
        listOf(
            "Talk about weather and seasons",
            "Use comparative adjectives",
            "Make suggestions with 'would like to'",
            "Discuss outdoor activities"
        ),
        listOf(
            v("weather", "هوا", "What's the weather like?", "هوا چطور است؟"),
            v("sunny", "آفتابی", "It's sunny today.", "امروز آفتابی است.", "adjective"),
            v("rainy", "بارانی", "It's rainy in spring.", "بهار بارانی است.", "adjective"),
            v("cloudy", "ابری", "The sky is cloudy.", "آسمان ابری است.", "adjective"),
            v("snowy", "برفی", "It's snowy in winter.", "زمستان برفی است.", "adjective"),
            v("windy", "بادی", "It's very windy at the beach.", "ساحل خیلی بادی است.", "adjective"),
            v("hot", "گرم", "It's very hot in summer.", "تابستان خیلی گرم است.", "adjective"),
            v("cold", "سرد", "It's freezing cold!", "خیلی سرد است!", "adjective"),
            v("freezing", "یخبندان", "It's freezing outside.", "بیرون یخبندان است.", "adjective"),
            v("season", "فصل", "Which season do you like?", "کدام فصل را دوست داری؟"),
            v("spring", "بهار", "Spring is my favorite.", "بهار مورد علاقه‌ام است."),
            v("summer", "تابستان", "We go to the beach in summer.", "تابستان به ساحل می‌رویم."),
            v("autumn", "پاییز", "Autumn is beautiful here.", "پاییز اینجا زیباست."),
            v("winter", "زمستان", "Winter is cold here.", "زمستان اینجا سرد است."),
            v("forecast", "پیش‌بینی", "The forecast says rain.", "پیش‌بینی می‌گوید باران.")
        ),
        listOf(
            GrammarSection("Comparatives", "Add -er or use 'more'. colder, hotter, more beautiful, better, worse. Winter is colder than autumn."),
            GrammarSection("Would like to + base verb", "Use for polite suggestions and wishes. I'd like to go to the beach. Would you like to come?"),
            GrammarSection("Suggestions with 'How about' and 'Let's'", "How about going for a walk? Let's stay inside."),
            GrammarSection("Weather questions and answers", "What's the weather like? It's sunny. How's the weather? It's raining.")
        ),
        listOf(
            d("A", "Hi, Maria! What's the weather like today?", "سلام، ماریا! امروز هوا چطور است؟"),
            d("B", "It's beautiful! Sunny and warm. Perfect for a walk.", "عالی است! آفتابی و گرم. عالی برای پیاده‌روی."),
            d("A", "Great. I love this weather. It's not too hot.", "عالی. عاشق این هوا هستم. خیلی گرم نیست."),
            d("B", "Me too. Spring is my favorite season.", "من هم. بهار فصل مورد علاقه‌ام است."),
            d("A", "Really? I like autumn better.", "واقعاً؟ من پاییز را بیشتر دوست دارم."),
            d("B", "Why autumn?", "چرا پاییز؟"),
            d("A", "The colors are beautiful. And it's cooler than summer.", "رنگ‌ها زیبا هستند. و از تابستان خنک‌تر است."),
            d("B", "That's true. Autumn is lovely too.", "درست است. پاییز هم زیباست."),
            d("A", "What's summer like here?", "تابستان اینجا چطور است؟"),
            d("B", "Very hot. Sometimes 40 degrees!", "خیلی گرم. گاهی ۴۰ درجه!"),
            d("A", "Wow. How do you handle that?", "واو. چطور تحملش می‌کنی؟"),
            d("B", "Air conditioning. And we go to the pool a lot.", "کولر. و زیاد به استخر می‌رویم."),
            d("A", "That makes sense. What about winter?", "منطقی است. زمستان چطور؟"),
            d("B", "Cold and snowy. Sometimes below zero.", "سرد و برفی. گاهی زیر صفر."),
            d("A", "I'd like to see snow someday.", "دوست دارم روزی برف ببینم."),
            d("B", "You've never seen snow?", "هیچ‌وقت برف ندیده‌ای؟"),
            d("A", "No, never. I'm from a hot country.", "نه، هرگز. اهل کشور گرمی هستم."),
            d("B", "You should visit in January. The snow is beautiful.", "باید ژانویه بیایی. برف زیباست."),
            d("A", "I'd love to. Would you like to go for a walk now?", "دوست دارم. می‌خواهی الان پیاده‌روی برویم؟"),
            d("B", "Sure! Where should we go?", "حتماً! کجا برویم؟"),
            d("A", "How about the park? The trees are beautiful now.", "پارک چطور؟ درخت‌ها الان زیبا هستند."),
            d("B", "Perfect. Let's go.", "عالی. بیایید برویم."),
            d("A", "Great. Oh, the forecast says rain tomorrow.", "عالی. اوه، پیش‌بینی می‌گوید فردا باران."),
            d("B", "Really? Then we'll stay inside.", "واقعاً؟ پس داخل می‌مانیم."),
            d("A", "Maybe we can watch a movie.", "شاید بتوانیم فیلم تماشا کنیم."),
            d("B", "Good idea. Well, let's enjoy today's sunshine!", "فکر خوبی. خب، بیایید از آفتاب امروز لذت ببریم!"),
            d("A", "Yes, let's go!", "بله، بیایید برویم!"),
            d("B", "Bye!", "خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What's the weather like today?", listOf("rainy", "sunny and warm", "snowy", "cloudy"), 1),
            q("What's Maria's favorite season?", listOf("spring", "summer", "autumn", "winter"), 2),
            q("How hot does it get in summer?", listOf("30 degrees", "35 degrees", "40 degrees", "45 degrees"), 2),
            q("What's the forecast for tomorrow?", listOf("snow", "rain", "sun", "wind"), 1),
            q("Winter is ___ than autumn.", listOf("cold", "colder", "coldest", "more cold"), 1),
            q("She's ___ than me.", listOf("tall", "taller", "tallest", "more tall"), 1),
            q("I'd like ___ to the beach.", listOf("go", "going", "to go", "gone"), 2),
            q("How about ___ for a walk?", listOf("go", "going", "to go", "gone"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Make sense", "منطقی بودن", "That makes sense.", "منطقی است."),
            IdiomExpression("Below zero", "زیر صفر", "Sometimes below zero.", "گاهی زیر صفر."),
            IdiomExpression("Rain or shine", "در هر آب و هوایی", "We go rain or shine.", "در هر آب و هوایی می‌رویم."),
            IdiomExpression("Enjoy the sunshine", "از آفتاب لذت ببر", "Let's enjoy today's sunshine!", "بیایید از آفتاب امروز لذت ببریم!")
        ),
        phrasal = listOf(
            PhrasalVerb("warm up", "گرم شدن", "become warmer", "It's warming up in spring.", "بهار دارد گرم می‌شود.", "No"),
            PhrasalVerb("cool down", "خنک شدن", "become cooler", "It cools down in autumn.", "پاییز خنک می‌شود.", "No"),
            PhrasalVerb("stay in", "داخل ماندن", "remain indoors", "We'll stay in tomorrow.", "فردا داخل می‌مانیم.", "No"),
            PhrasalVerb("go out", "بیرون رفتن", "leave home", "Let's go out today.", "بیایید امروز بیرون برویم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Weather words", "SUNny, RAINy, CLOUDy, SNOWy, WINdy, FREEzing."),
            PronunciationTip("Comparative stress", "COLDer, HOTter, BETter, MORE beautiful."),
            PronunciationTip("'Would like to' reduction", "'d like to → /d laɪk tə/. I'd like to go.")
        ),
        culture = listOf(
            CulturalNote("Weather small talk", "Weather is a safe topic for small talk in English."),
            CulturalNote("Seasons", "Many countries have four distinct seasons affecting lifestyle."),
            CulturalNote("Weather forecast", "Checking the forecast is a common daily habit.")
        ),
        mistakes = listOf(
            CommonMistake("How is the weather like?", "What is the weather like?", "Use 'What's the weather like?'"),
            CommonMistake("It's more hot today.", "It's hotter today.", "Use -er for short adjectives."),
            CommonMistake("I'd like going.", "I'd like to go.", "Use 'to + base verb' after 'would like'."),
            CommonMistake("Winter is more cold.", "Winter is colder.", "Use -er for one-syllable adjectives.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's today's weather?", "Sunny and warm."),
            ComprehensionQuestion("What does Maria say about winter?", "Cold and snowy, sometimes below zero."),
            ComprehensionQuestion("What will they do tomorrow if it rains?", "Stay inside and maybe watch a movie.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about the weather in your city.", "درباره هوای شهرت صحبت کن.", "It's usually... / In summer... / In winter..."),
            SpeakingTask("Discuss your favorite season.", "درباره فصل مورد علاقه‌ات صحبت کن.", "I love... / The weather is... / I usually..."),
            SpeakingTask("Make plans based on the weather.", "براساس هوا برنامه‌ریزی کن.", "If it's sunny... / If it rains... / Let's meet if...")
        ),
        writing = listOf(
            WritingTask("Write about the seasons in your country.", "درباره فصل‌های کشورت بنویس.", 120, "Use comparatives and weather vocabulary.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 4 — Life at home | زندگی در خانه
    // ═══════════════════════════════════════════════════════════════
    private fun unit4() = base(
        4, "Life at home", "زندگی در خانه",
        listOf(
            "Talk about homes and furniture",
            "Use there is / there are with quantifiers",
            "Make requests with 'Can you...?'",
            "Describe your home"
        ),
        listOf(
            v("home", "خانه", "Welcome to my home.", "به خانه من خوش آمدید."),
            v("apartment", "آپارتمان", "I live in a small apartment.", "در آپارتمان کوچکی زندگی می‌کنم."),
            v("furniture", "مبلمان", "The furniture is new.", "مبلمان جدید است."),
            v("sofa", "مبل", "We have a comfortable sofa.", "مبل راحتی داریم."),
            v("lamp", "لامپ", "The lamp is on the table.", "لامپ روی میز است."),
            v("curtain", "پرده", "The curtains are blue.", "پرده‌ها آبی هستند."),
            v("shelf", "قفسه", "Books are on the shelf.", "کتاب‌ها روی قفسه هستند."),
            v("cabinet", "کابینت", "Plates are in the cabinet.", "بشقاب‌ها در کابینت هستند."),
            v("wall", "دیوار", "There's a picture on the wall.", "تصویری روی دیوار است."),
            v("rug", "فرش کوچک", "The rug is soft.", "فرش کوچک نرم است."),
            v("closet", "کمد دیواری", "My clothes are in the closet.", "لباس‌هایم در کمد دیواری هستند."),
            v("hallway", "راهرو", "The bathroom is at the end of the hallway.", "حمام آخر راهرو است."),
            v("garage", "گاراژ", "The car is in the garage.", "ماشین در گاراژ است."),
            v("yard", "حیاط", "We have a small yard.", "حیاط کوچکی داریم."),
            v("cozy", "دنج", "The apartment is small but cozy.", "آپارتمان کوچک ولی دنج است.", "adjective")
        ),
        listOf(
            GrammarSection("There is / There are with quantifiers", "There is a sofa. There are two chairs. There isn't any milk. There are some books."),
            GrammarSection("Some / Any", "Use 'some' in positive statements: There are some chairs. Use 'any' in negatives and questions: Are there any books?"),
            GrammarSection("Prepositions of place", "on, in, under, next to, between, behind, in front of. The lamp is on the table."),
            GrammarSection("Polite requests with 'Can you...?'", "Can you turn off the light? Can you close the door? Can you help me?")
        ),
        listOf(
            d("A", "Hi, Ali! Welcome to my new apartment.", "سلام، علی! به آپارتمان جدیدم خوش آمدی."),
            d("B", "Thanks! It looks nice. How many rooms are there?", "ممنون! خوب به نظر می‌رسد. چند اتاق دارد؟"),
            d("A", "Two bedrooms, a living room, a kitchen, and a bathroom.", "دو اتاق خواب، یک اتاق نشیمن، آشپزخانه، و حمام."),
            d("B", "That's a good size. Is there a balcony?", "اندازه خوبی است. بالکن دارد؟"),
            d("A", "Yes, there's a small balcony off the living room.", "بله، بالکن کوچکی از اتاق نشیمن."),
            d("B", "Nice. What's your favorite room?", "خوبه. اتاق مورد علاقه‌ات کدام است؟"),
            d("A", "The living room. It's bright and spacious.", "اتاق نشیمن. روشن و جادار است."),
            d("B", "I can see that. Where did you get the sofa?", "می‌بینم. مبل را از کجا گرفتی؟"),
            d("A", "At a furniture store downtown. It was on sale.", "از فروشگاه مبلمان مرکز شهر. حراج بود."),
            d("B", "Good deal. Is there a dining table?", "معامله خوبی. میز غذاخوری هست؟"),
            d("A", "Not yet. I need to buy one. And some chairs.", "هنوز نه. باید یکی بخرم. و چند صندلی."),
            d("B", "I know a good store. Do you want the address?", "فروشگاه خوبی می‌شناسم. آدرس را می‌خواهی؟"),
            d("A", "Yes, please. That would help.", "بله، لطفاً. کمک می‌کند."),
            d("B", "Can you pass me a pen? I'll write it down.", "می‌توانی یک خودکار به من بدهی؟ می‌نویسمش."),
            d("A", "Here you are.", "بفرما."),
            d("B", "Thanks. Oh, are there any pictures on the walls?", "ممنون. اوه، تصویری روی دیوارها هست؟"),
            d("A", "Not yet. I'm going to hang some this weekend.", "هنوز نه. قرار است این آخر هفته چند تا آویزان کنم."),
            d("B", "Good idea. It makes a home feel warmer.", "فکر خوبی. خانه را گرم‌تر حس می‌کند."),
            d("A", "Exactly. Do you like the rug?", "دقیقاً. فرش کوچک را دوست داری؟"),
            d("B", "Yes, it's beautiful. Where is it from?", "بله، زیباست. از کجاست؟"),
            d("A", "My grandmother gave it to me. It's traditional.", "مادربزرگم داد. سنتی است."),
            d("B", "That makes it special.", "این خاصش می‌کند."),
            d("A", "Definitely. Can you stay for tea?", "قطعاً. می‌توانی برای چای بمانی؟"),
            d("B", "Sure, I'd love to. Thanks!", "حتماً، دوست دارم. ممنون!"),
            d("A", "Great. Make yourself at home.", "عالی. خودت را در خانه حس کن."),
            d("B", "Thank you. Your place is really nice.", "ممنون. جای تو واقعاً قشنگ است."),
            d("A", "Thanks! It's small but I love it.", "ممنون! کوچک است ولی دوستش دارم."),
            d("B", "Small is cozy. See you soon!", "کوچک دنج است. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("How many bedrooms does the apartment have?", listOf("one", "two", "three", "four"), 1),
            q("What's Ali's favorite room?", listOf("kitchen", "bedroom", "living room", "balcony"), 2),
            q("What does Ali need to buy?", listOf("sofa", "dining table and chairs", "bed", "lamp"), 1),
            q("Where is the rug from?", listOf("a store", "his grandmother", "a friend", "Italy"), 1),
            q("There ___ a sofa.", listOf("is", "are", "have", "has"), 0),
            q("There ___ two chairs.", listOf("is", "are", "have", "has"), 1),
            q("There aren't ___ pictures.", listOf("some", "any", "many", "a lot"), 1),
            q("The lamp is ___ the table.", listOf("on", "in", "at", "by"), 0)
        ),
        idioms = listOf(
            IdiomExpression("On sale", "حراج", "It was on sale.", "حراج بود."),
            IdiomExpression("Good deal", "معامله خوب", "Good deal.", "معامله خوبی."),
            IdiomExpression("Make yourself at home", "خودت را در خانه حس کن", "Make yourself at home.", "خودت را در خانه حس کن."),
            IdiomExpression("Feel warmer", "گرم‌تر حس شدن", "It makes a home feel warmer.", "خانه را گرم‌تر حس می‌کند.")
        ),
        phrasal = listOf(
            PhrasalVerb("move in", "اسباب‌کشی کردن به", "start living", "I moved in last week.", "هفته پیش اسباب‌کشی کردم.", "No"),
            PhrasalVerb("put up", "آویزان کردن", "hang", "I'm going to put up pictures.", "قرار است تصاویر آویزان کنم.", "Yes"),
            PhrasalVerb("turn on", "روشن کردن", "switch on", "Can you turn on the light?", "می‌توانی لامپ را روشن کنی؟", "Yes"),
            PhrasalVerb("turn off", "خاموش کردن", "switch off", "Can you turn off the TV?", "می‌توانی تلویزیون را خاموش کنی؟", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Furniture stress", "SOfa, LAMP, CURtain, SHELF, CABinet, RUG."),
            PronunciationTip("There's reduction", "There's → /ðerz/. There's a sofa."),
            PronunciationTip("Polite requests intonation", "Can you close the door? ↗ (rising, polite)")
        ),
        culture = listOf(
            CulturalNote("Homes", "In many Western cultures, homes are personal spaces shown to close friends."),
            CulturalNote("Furniture styles", "Furniture styles vary — modern, traditional, and antique."),
            CulturalNote("Home tours", "Showing a new home to friends is a common social activity.")
        ),
        mistakes = listOf(
            CommonMistake("There have a sofa.", "There is a sofa.", "Use 'there is/are'."),
            CommonMistake("There is two chairs.", "There are two chairs.", "Use 'are' with plural nouns."),
            CommonMistake("There aren't some books.", "There aren't any books.", "Use 'any' in negatives."),
            CommonMistake("The lamp is in the table.", "The lamp is on the table.", "Use 'on' for surfaces.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("How many rooms are in the apartment?", "Two bedrooms, living room, kitchen, bathroom, small balcony."),
            ComprehensionQuestion("What furniture does Ali need?", "A dining table and chairs."),
            ComprehensionQuestion("What is special about the rug?", "It was a gift from Ali's grandmother, and it's traditional.")
        ),
        speaking = listOf(
            SpeakingTask("Describe your home.", "خانه‌ات را توصیف کن.", "There is/are... / It has... / My favorite room is..."),
            SpeakingTask("Make polite requests.", "درخواست مؤدبانه کن.", "Can you...? / Could you...? / Would you...?"),
            SpeakingTask("Talk about your furniture.", "درباره مبلمان خانه‌ات صحبت کن.", "We have... / It's made of... / I bought it...")
        ),
        writing = listOf(
            WritingTask("Write about your dream home.", "درباره خانه رویایی‌ات بنویس.", 130, "Use there is/are and prepositions of place.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 5 — Health | سلامت
    // ═══════════════════════════════════════════════════════════════
    private fun unit5() = base(
        5, "Health", "سلامت",
        listOf(
            "Talk about health and lifestyle",
            "Use imperatives for advice",
            "Talk about healthy habits",
            "Discuss stress and relaxation"
        ),
        listOf(
            v("health", "سلامت", "Health is very important.", "سلامت خیلی مهم است."),
            v("healthy", "سالم", "She lives a healthy life.", "او زندگی سالمی دارد.", "adjective"),
            v("exercise", "ورزش", "Exercise every day.", "هر روز ورزش کن.", "verb"),
            v("breathe", "نفس کشیدن", "Breathe deeply and relax.", "عمیق نفس بکش و آرام شو.", "verb"),
            v("relax", "آرام شدن", "Try to relax.", "سعی کن آرام شوی.", "verb"),
            v("stress", "استرس", "Stress is bad for you.", "استرس برایت بد است."),
            v("stressed out", "پراسترس", "I'm stressed out about work.", "درباره کار پراسترسم.", "adjective"),
            v("diet", "رژیم", "A balanced diet is important.", "رژیم متعادل مهم است."),
            v("sleep", "خواب", "Get enough sleep.", "خواب کافی داشته باش.", "verb"),
            v("water", "آب", "Drink lots of water.", "آب زیاد بنوش."),
            v("junk food", "غذای بی‌ارزش", "Don't eat too much junk food.", "زیاد غذای بی‌ارزش نخور."),
            v("vegetables", "سبزیجات", "Eat more vegetables.", "سبزیجات بیشتری بخور."),
            v("stress out", "استرس گرفتن", "Don't stress out.", "استرس نگیر.", "verb"),
            v("take a break", "استراحت کردن", "Take a break every hour.", "هر ساعت استراحت کن.", "verb"),
            v("well-being", "سلامتی/خوشبختی", "It improves your well-being.", "سلامتی‌ات را بهبود می‌بخشد.")
        ),
        listOf(
            GrammarSection("Imperatives for advice", "Breathe deeply. Exercise every day. Don't eat junk food. Take a break."),
            GrammarSection("Should / Shouldn't for advice", "You should exercise more. You shouldn't skip breakfast."),
            GrammarSection("How healthy are you?", "Questions with 'How often...' and 'Do you...?' How often do you exercise? Do you eat vegetables?"),
            GrammarSection("Frequency expressions", "every day, twice a week, once a month, three times a week.")
        ),
        listOf(
            d("A", "Hi, Ali. You look tired today.", "سلام، علی. امروز خسته به نظر می‌رسی."),
            d("B", "I am. I've been working late all week.", "هستم. تمام هفته تا دیر وقت کار کرده‌ام."),
            d("A", "That's not good. You should take a break.", "خوب نیست. باید استراحت کنی."),
            d("B", "I know. But I have so much to do.", "می‌دانم. ولی کارهای زیادی دارم."),
            d("A", "How often do you exercise?", "چند وقت یک بار ورزش می‌کنی؟"),
            d("B", "Honestly? Almost never. I don't have time.", "راستش؟ تقریباً هرگز. وقت ندارم."),
            d("A", "You need to make time. Even 20 minutes a day helps.", "باید وقت بسازی. حتی ۲۰ دقیقه در روز کمک می‌کند."),
            d("B", "You're right. I've been stressed out lately.", "حق داری. اخیراً پراسترس بوده‌ام."),
            d("A", "What's causing the stress?", "علت استرس چیست؟"),
            d("B", "Work, mostly. And some family stuff.", "کار، بیشتر. و برخی مسائل خانوادگی."),
            d("A", "Breathe deeply and try to relax. Stress causes many health problems.", "عمیق نفس بکش و سعی کن آرام شوی. استرس مشکلات سلامتی زیادی ایجاد می‌کند."),
            d("B", "I know. My doctor said the same thing.", "می‌دانم. دکترم همین را گفت."),
            d("A", "What else did the doctor say?", "دکتر دیگر چه گفت؟"),
            d("B", "Eat better and sleep more. I don't sleep well.", "بهتر بخور و بیشتر بخواب. خوب نمی‌خوابم."),
            d("A", "How much do you sleep?", "چقدر می‌خوابی؟"),
            d("B", "Maybe five hours a night.", "شاید پنج ساعت در شب."),
            d("A", "That's not enough. You should sleep 7 to 8 hours.", "کافی نیست. باید ۷ تا ۸ ساعت بخوابی."),
            d("B", "I know. But my mind is always racing.", "می‌دانم. ولی ذهنم همیشه می‌دود."),
            d("A", "Try reading before bed. And don't use your phone.", "سعی کن قبل از خواب بخوانی. و از گوشی استفاده نکن."),
            d("B", "Good idea. What about diet?", "فکر خوبی. رژیم چطور؟"),
            d("A", "Eat more vegetables and fruit. And drink lots of water.", "سبزیجات و میوه بیشتری بخور. و آب زیاد بنوش."),
            d("B", "I drink a lot of coffee, not water.", "قهوه زیاد می‌نوشم، نه آب."),
            d("A", "Coffee is fine, but water is better. Try both.", "قهوه اشکالی ندارد، ولی آب بهتر است. هر دو را امتحان کن."),
            d("B", "Okay. I'll try. Thanks for the advice.", "باشه. تلاش می‌کنم. ممنون برای توصیه."),
            d("A", "You should start small. Small changes, big results.", "باید کوچک شروع کنی. تغییرات کوچک، نتایج بزرگ."),
            d("B", "You're right. Well, I should go home and rest.", "حق داری. خب، باید بروم خانه و استراحت کنم."),
            d("A", "Good idea. Take care!", "فکر خوبی. مراقب باش!"),
            d("B", "Thanks. See you soon!", "ممنون. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Why does Ali look tired?", listOf("sick", "working late", "studying", "traveling"), 1),
            q("How often does Ali exercise?", listOf("every day", "twice a week", "almost never", "once a month"), 2),
            q("How much does Ali sleep?", listOf("5 hours", "6 hours", "7 hours", "8 hours"), 0),
            q("What does Maria suggest?", listOf("drink more coffee", "read before bed", "work less", "travel more"), 1),
            q("___ deeply and relax.", listOf("Breathe", "Breathing", "Breathed", "Breathes"), 0),
            q("___ eat junk food.", listOf("Do", "Don't", "Not", "Doesn't"), 1),
            q("You ___ exercise more.", listOf("should", "shouldn't", "mustn't", "can't"), 0),
            q("How often ___ you exercise?", listOf("do", "does", "is", "are"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Take a break", "استراحت کردن", "Take a break.", "استراحت کن."),
            IdiomExpression("Make time", "وقت ساختن", "You need to make time.", "باید وقت بسازی."),
            IdiomExpression("Stress out", "استرس گرفتن", "Don't stress out.", "استرس نگیر."),
            IdiomExpression("Race (my mind is racing)", "ذهنم می‌دود", "My mind is always racing.", "ذهنم همیشه می‌دود.")
        ),
        phrasal = listOf(
            PhrasalVerb("take a break", "استراحت کردن", "pause", "Take a break.", "استراحت کن.", "No"),
            PhrasalVerb("work out", "ورزش کردن", "exercise", "I work out three times a week.", "هفته‌ای سه بار ورزش می‌کنم.", "No"),
            PhrasalVerb("stress out", "استرس گرفتن", "become stressed", "Don't stress out.", "استرس نگیر.", "No"),
            PhrasalVerb("calm down", "آرام شدن", "become calm", "Try to calm down.", "سعی کن آرام شوی.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Health vocabulary", "HEALTH, EXercise, STREss, SLEEP, DIet."),
            PronunciationTip("Imperatives stress", "BREATHE deeply. EXercise every day. DON'T eat junk food."),
            PronunciationTip("'Should' reduction", "should → /ʃəd/ in fast speech.")
        ),
        culture = listOf(
            CulturalNote("Health and lifestyle", "Modern lifestyles can lead to stress and poor health."),
            CulturalNote("Wellness", "Wellness is a growing trend focusing on healthy habits."),
            CulturalNote("Work-life balance", "Many cultures now value work-life balance.")
        ),
        mistakes = listOf(
            CommonMistake("You should to rest.", "You should rest.", "After 'should', use base verb."),
            CommonMistake("Don't eating junk food.", "Don't eat junk food.", "After 'don't', use base verb."),
            CommonMistake("How often you exercise?", "How often do you exercise?", "Use 'do' in questions."),
            CommonMistake("I have stress.", "I'm stressed out.", "Use 'stressed out' as adjective.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's Ali's main problem?", "Stressed out, doesn't exercise, sleeps only 5 hours."),
            ComprehensionQuestion("What does Maria advise?", "Exercise, sleep more, eat better, drink water, read before bed."),
            ComprehensionQuestion("What's the key advice at the end?", "Start small — small changes, big results.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your healthy habits.", "درباره عادات سالمت صحبت کن.", "I usually... / I try to... / I should..."),
            SpeakingTask("Give health advice to a friend.", "به دوستی توصیه سلامتی بده.", "You should... / Don't... / Try to..."),
            SpeakingTask("Discuss how you deal with stress.", "درباره اینکه چطور با استرس کنار می‌آیی صحبت کن.", "When I'm stressed, I... / It helps to... / I try to...")
        ),
        writing = listOf(
            WritingTask("Write a health plan for yourself.", "یک برنامه سلامتی برای خودت بنویس.", 130, "Use imperatives and should/shouldn't.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 6 — What's on TV? | تلویزیون چه برنامه‌ای دارد؟
    // ═══════════════════════════════════════════════════════════════
    private fun unit6() = base(
        6, "What's on TV?", "تلویزیون چه برنامه‌ای دارد؟",
        listOf(
            "Talk about TV shows and movies",
            "Express likes and dislikes",
            "Use adverbs of frequency",
            "Agree and disagree politely"
        ),
        listOf(
            v("TV show", "برنامه تلویزیونی", "What's your favorite TV show?", "برنامه مورد علاقه‌ات چیست؟"),
            v("game show", "مسابقه تلویزیونی", "I love game shows.", "عاشق مسابقات تلویزیونی‌ام."),
            v("documentary", "مستند", "We watched a documentary.", "مستندی تماشا کردیم."),
            v("series", "سریال", "The series has 10 episodes.", "سریال ۱۰ قسمت دارد."),
            v("sitcom", "سریال کمدی", "Sitcoms make me laugh.", "سریال‌های کمدی مرا می‌خندانند."),
            v("news", "اخبار", "I watch the news every night.", "هر شب اخبار تماشا می‌کنم."),
            v("channel", "شبکه", "Change the channel, please.", "لطفاً شبکه را عوض کن."),
            v("episode", "قسمت", "The new episode is tonight.", "قسمت جدید امشب است."),
            v("agree", "موافق بودن", "I agree with you.", "با تو موافقم.", "verb"),
            v("disagree", "مخالف بودن", "I disagree.", "مخالفم.", "verb"),
            v("opinion", "نظر", "In my opinion, it's boring.", "به نظر من، کسل‌کننده است."),
            v("boring", "کسل‌کننده", "The movie was boring.", "فیلم کسل‌کننده بود.", "adjective"),
            v("exciting", "هیجان‌انگیز", "The finale was exciting.", "پایان هیجان‌انگیز بود.", "adjective"),
            v("funny", "خنده‌دار", "The show is really funny.", "برنامه واقعاً خنده‌دار است.", "adjective"),
            v("popular", "محبوب", "It's a popular show.", "برنامه محبوبی است.", "adjective")
        ),
        listOf(
            GrammarSection("Adverbs of frequency", "always, usually, often, sometimes, rarely, never. I always watch the news."),
            GrammarSection("Expressing opinions", "I think... In my opinion... I agree. I disagree. You're right."),
            GrammarSection("Questions about preferences", "Do you like...? What do you think of...? How often do you watch...?"),
            GrammarSection("Agreeing and disagreeing", "I agree with you. I don't agree. That's true. That's not how I see it.")
        ),
        listOf(
            d("A", "Hey, Ali! What are you watching?", "هی، علی! چه تماشا می‌کنی؟"),
            d("B", "A game show. It's really exciting!", "یک مسابقه تلویزیونی. واقعاً هیجان‌انگیز است!"),
            d("A", "Game shows? I don't like them much.", "مسابقات تلویزیونی؟ زیاد دوستشان ندارم."),
            d("B", "Really? Why not?", "واقعاً؟ چرا نه؟"),
            d("A", "They're a bit boring, in my opinion.", "به نظر من کمی کسل‌کننده هستند."),
            d("B", "I disagree. They're fun and competitive.", "مخالفم. سرگرم‌کننده و رقابتی هستند."),
            d("A", "What else do you watch?", "دیگر چه تماشا می‌کنی؟"),
            d("B", "I usually watch documentaries and the news.", "معمولاً مستند و اخبار تماشا می‌کنم."),
            d("A", "I love documentaries! What's your favorite?", "عاشق مستندم! مورد علاقه‌ات چیست؟"),
            d("B", "Nature documentaries. I learn a lot from them.", "مستندهای طبیعت. چیزهای زیادی از آن‌ها یاد می‌گیرم."),
            d("A", "Me too. What about series?", "من هم. سریال چطور؟"),
            d("B", "I'm watching a new series now. It's really good.", "الان یک سریال جدید تماشا می‌کنم. واقعاً خوب است."),
            d("A", "What's it about?", "درباره چیست؟"),
            d("B", "It's about a detective in London. Very interesting.", "درباره یک کارآگاه در لندن است. خیلی جالب."),
            d("A", "Oh, I love detective shows.", "اوه، عاشق برنامه‌های کارآگاهی‌ام."),
            d("B", "You should watch it. There are 10 episodes.", "باید تماشا کنی. ۱۰ قسمت دارد."),
            d("A", "What channel is it on?", "روی چه شبکه‌ای است؟"),
            d("B", "It's on Netflix. Not on TV.", "روی نتفلیکس است. نه تلویزیون."),
            d("A", "Ah. I don't have Netflix. Just regular TV.", "آه. نتفلیکس ندارم. فقط تلویزیون معمولی."),
            d("B", "Really? What shows are popular on TV now?", "واقعاً؟ چه برنامه‌هایی الان روی تلویزیون محبوبند؟"),
            d("A", "Sitcoms, mostly. And reality shows.", "بیشتر سریال‌های کمدی. و برنامه‌های واقعیت‌نما."),
            d("B", "Do you like reality shows?", "برنامه‌های واقعیت‌نما دوست داری؟"),
            d("A", "Sometimes. They can be funny.", "گاهی. می‌توانند خنده‌دار باشند."),
            d("B", "How often do you watch TV?", "چند وقت یک بار تلویزیون تماشا می‌کنی؟"),
            d("A", "About an hour a day. Usually in the evening.", "حدود یک ساعت در روز. معمولاً عصر."),
            d("B", "Same here. It helps me relax.", "من هم. به آرامشم کمک می‌کند."),
            d("A", "Exactly. What's on tonight?", "دقیقاً. امشب چه روی آنتن است؟"),
            d("B", "There's a new episode of my series.", "قسمت جدید سریالم هست."),
            d("A", "Sounds good. Well, enjoy your show!", "خوبه به نظر می‌رسد. خب، از برنامه‌ات لذت ببر!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is Ali watching?", listOf("a documentary", "a game show", "the news", "a series"), 1),
            q("What does Maria think of game shows?", listOf("loves them", "boring", "exciting", "funny"), 1),
            q("What's Ali's new series about?", listOf("a family", "a detective", "a chef", "a singer"), 1),
            q("How often does Ali watch TV?", listOf("3 hours a day", "1 hour a day", "every other day", "never"), 1),
            q("I ___ watch the news.", listOf("always", "am always", "always am", "be always"), 0),
            q("I ___ with you.", listOf("agree", "agrees", "agreeing", "agreed"), 0),
            q("___ my opinion, it's boring.", listOf("In", "On", "At", "By"), 0),
            q("Do you ___ reality shows?", listOf("like", "likes", "liking", "liked"), 0)
        ),
        idioms = listOf(
            IdiomExpression("In my opinion", "به نظر من", "In my opinion, it's boring.", "به نظر من، کسل‌کننده است."),
            IdiomExpression("Same here", "من هم", "Same here.", "من هم."),
            IdiomExpression("What's on", "چه روی آنتن است", "What's on tonight?", "امشب چه روی آنتن است؟"),
            IdiomExpression("I disagree", "مخالفم", "I disagree.", "مخالفم.")
        ),
        phrasal = listOf(
            PhrasalVerb("turn on", "روشن کردن", "switch on", "Turn on the TV.", "تلویزیون را روشن کن.", "Yes"),
            PhrasalVerb("turn off", "خاموش کردن", "switch off", "Turn off the TV.", "تلویزیون را خاموش کن.", "Yes"),
            PhrasalVerb("turn up", "بلندتر کردن", "increase volume", "Turn up the volume.", "صدا را بلند کن.", "Yes"),
            PhrasalVerb("turn down", "کم کردن", "decrease volume", "Turn down the music.", "موسیقی را کم کن.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Frequency stress", "ALways, USually, OFten, SOMEtimes, NEver."),
            PronunciationTip("Opinion intonation", "In my OPIion, it's BORing."),
            PronunciationTip("Agree/disagree", "I aGREE. I disaGREE.")
        ),
        culture = listOf(
            CulturalNote("TV culture", "TV watching habits vary. In some countries, TV is a family activity."),
            CulturalNote("Streaming", "Streaming services have changed how people watch shows."),
            CulturalNote("Reality shows", "Reality shows are popular worldwide, but opinions vary.")
        ),
        mistakes = listOf(
            CommonMistake("I am agree.", "I agree.", "Use 'agree' as a verb, not adjective."),
            CommonMistake("In my opinion, I think it's boring.", "In my opinion, it's boring.", "Don't use both 'opinion' and 'I think'."),
            CommonMistake("I don't agree of you.", "I don't agree with you.", "Use 'agree with' + person."),
            CommonMistake("I always am watching TV.", "I always watch TV.", "Adverbs of frequency go before the main verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does Ali like watching?", "Game shows, documentaries, news, and a new detective series."),
            ComprehensionQuestion("What does Maria think of game shows?", "She finds them boring."),
            ComprehensionQuestion("How do they differ in their TV habits?", "Ali watches Netflix; Maria watches regular TV.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your favorite TV show.", "درباره برنامه تلویزیونی مورد علاقه‌ات صحبت کن.", "I love... / It's about... / It's really..."),
            SpeakingTask("Agree and disagree politely.", "مؤدبانه موافقت و مخالفت کن.", "I agree. / I don't agree. / That's true, but..."),
            SpeakingTask("Discuss TV habits.", "درباره عادات تلویزیونی صحبت کن.", "I usually watch... / How often...? / In my opinion...")
        ),
        writing = listOf(
            WritingTask("Write a review of a TV show.", "نقد یک برنامه تلویزیونی بنویس.", 130, "Use adverbs of frequency and opinion expressions.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 7 — Shopping | خرید
    // ═══════════════════════════════════════════════════════════════
    private fun unit7() = base(
        7, "Shopping", "خرید",
        listOf(
            "Talk about shopping and clothes",
            "Use comparatives and superlatives",
            "Ask about prices and sizes",
            "Return and exchange items"
        ),
        listOf(
            v("shopping", "خرید", "I go shopping every weekend.", "هر آخر هفته خرید می‌روم."),
            v("clothes", "لباس", "I need new clothes.", "به لباس جدید نیاز دارم."),
            v("price", "قیمت", "What's the price of this?", "قیمت این چقدر است؟"),
            v("expensive", "گران", "This jacket is too expensive.", "این کاپشن خیلی گران است.", "adjective"),
            v("cheap", "ارزان", "I like cheap shoes.", "کفش‌های ارزان دوست دارم.", "adjective"),
            v("discount", "تخفیف", "Is there a discount?", "تخفیفی هست؟"),
            v("size", "سایز", "What size do you wear?", "چه سایزی می‌پوشی؟"),
            v("try on", "پرو کردن", "Can I try this on?", "می‌توانم این را پرو کنم؟", "verb"),
            v("return", "برگرداندن", "I'd like to return this.", "می‌خواهم این را برگردانم.", "verb"),
            v("exchange", "تعویض کردن", "Can I exchange it?", "می‌توانم تعویضش کنم؟", "verb"),
            v("receipt", "رسید", "Keep the receipt.", "رسید را نگه دار."),
            v("cashier", "صندوق‌دار", "The cashier was very helpful.", "صندوق‌دار خیلی کمک‌کننده بود."),
            v("cash", "نقد", "I'll pay in cash.", "نقد پرداخت می‌کنم."),
            v("credit card", "کارت اعتباری", "Can I pay by credit card?", "می‌توانم با کارت اعتباری پرداخت کنم؟"),
            v("window shopping", "ویترین‌گردی", "We went window shopping.", "ویترین‌گردی رفتیم.")
        ),
        listOf(
            GrammarSection("Comparatives and superlatives", "cheap → cheaper → cheapest. expensive → more expensive → most expensive."),
            GrammarSection("Questions about shopping", "How much is it? What size? Do you have this in blue? Can I try it on?"),
            GrammarSection("Polite requests in stores", "I'd like to... Can I...? Could you...? I'm just looking."),
            GrammarSection("Demonstratives for shopping", "this one, that one, these, those. I'll take this one. How much are those?"),
            GrammarSection("Making returns and exchanges", "I'd like to return this. Can I exchange it for a different size? Here's my receipt.")
        ),
        listOf(
            d("A", "Hi, Maria! Are you going shopping?", "سلام، ماریا! داری خرید می‌روی؟"),
            d("B", "Yes! I need a new dress for a wedding.", "بله! به یک لباس جدید برای عروسی نیاز دارم."),
            d("A", "Fun! Which store are you going to?", "سرگرم‌کننده! به کدام فروشگاه می‌روی؟"),
            d("B", "The mall downtown. They have a lot of stores.", "مال مرکز شهر. فروشگاه‌های زیادی دارند."),
            d("A", "Can I come with you? I need a new shirt too.", "می‌توانم با تو بیایم؟ من هم به یک پیراهن جدید نیاز دارم."),
            d("B", "Sure! Let's go.", "حتماً! بیایید برویم."),
            d("A", "Look at this dress. What do you think?", "این لباس را ببین. چه فکری می‌کنی؟"),
            d("B", "It's beautiful! But it's too expensive.", "زیباست! ولی خیلی گران است."),
            d("A", "Yes, $200 is a lot. Let's look for something cheaper.", "بله، ۲۰۰ دلار زیاد است. بیایید ارزان‌تر بگردیم."),
            d("B", "Good idea. What about that one?", "فکر خوبی. آن یکی چطور؟"),
            d("A", "That one is $80. Much better.", "آن یکی ۸۰ دلار است. خیلی بهتر."),
            d("B", "Do you like the color?", "رنگش را دوست داری؟"),
            d("A", "Yes, I love it. Can I try it on?", "بله، عاشقش هستم. می‌توانم پرو کنم؟"),
            d("C", "Sure. The fitting rooms are in the back.", "حتماً. اتاق‌های پرو در عقب هستند."),
            d("A", "Thanks. I'll be right back.", "ممنون. الان برمی‌گردم."),
            d("B", "Take your time.", "عجله نکن."),
            d("A", "Okay, I'm back. What do you think?", "باشه، برگشتم. چه فکری می‌کنی؟"),
            d("B", "You look amazing! It fits perfectly.", "شگفت‌انگیز به نظر می‌رسی! کاملاً اندازه‌ات است."),
            d("A", "Really? I wasn't sure about the size.", "واقعاً؟ درباره سایز مطمئن نبودم."),
            d("B", "It's perfect. Are you going to buy it?", "کامل است. می‌خواهی بخری‌اش؟"),
            d("A", "Yes. Now let's find your shirt.", "بله. حالا بیایید پیراهن تو را پیدا کنیم."),
            d("B", "Good. I want something simple. Not too expensive.", "خوبه. چیزی ساده می‌خواهم. خیلی گران نه."),
            d("A", "How about this white one?", "این سفید چطور؟"),
            d("B", "I like it! And it's only $30.", "دوستش دارم! و فقط ۳۰ دلار است."),
            d("A", "Great price. Let's pay for both.", "قیمت عالی. بیایید برای هر دو پرداخت کنیم."),
            d("B", "Perfect. Let's go to the cashier.", "عالی. بیایید به صندوق برویم."),
            d("A", "Cash or credit card?", "نقد یا کارت اعتباری؟"),
            d("B", "Credit card. I don't have much cash.", "کارت اعتباری. پول نقد زیاد ندارم."),
            d("A", "Me too. Well, that was a successful shopping trip!", "من هم. خب، سفر خرید موفقی بود!"),
            d("B", "Yes it was. See you soon!", "بله بود. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What is Maria looking for?", listOf("a shirt", "a dress", "shoes", "a bag"), 1),
            q("How much is the first dress?", listOf("$50", "$80", "$150", "$200"), 3),
            q("How much is Ali's shirt?", listOf("$20", "$30", "$40", "$50"), 1),
            q("How does Ali pay?", listOf("cash", "credit card", "check", "mobile"), 1),
            q("This shirt is ___ than that one.", listOf("cheap", "cheaper", "cheapest", "more cheap"), 1),
            q("This is the ___ store.", listOf("good", "better", "best", "bestest"), 2),
            q("How much ___ this dress?", listOf("is", "are", "has", "have"), 0),
            q("Can I ___ it on?", listOf("try", "trying", "tried", "tries"), 0)
        ),
        idioms = listOf(
            IdiomExpression("On sale", "حراج", "It's on sale.", "حراج است."),
            IdiomExpression("Take your time", "عجله نکن", "Take your time.", "عجله نکن."),
            IdiomExpression("Fits perfectly", "کاملاً اندازه", "It fits perfectly.", "کاملاً اندازه‌ات است."),
            IdiomExpression("Window shopping", "ویترین‌گردی", "We went window shopping.", "ویترین‌گردی رفتیم.")
        ),
        phrasal = listOf(
            PhrasalVerb("try on", "پرو کردن", "test clothes", "Can I try this on?", "می‌توانم این را پرو کنم؟", "Yes"),
            PhrasalVerb("look for", "دنبال گشتن", "search for", "I'm looking for a shirt.", "دنبال پیراهن می‌گردم.", "No"),
            PhrasalVerb("pay back", "پس دادن", "return money", "I'll pay you back.", "پولت را پس می‌دهم.", "Yes"),
            PhrasalVerb("pick out", "انتخاب کردن", "choose", "I picked out a blue shirt.", "یک پیراهن آبی انتخاب کردم.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Shopping stress", "EXpensive, CHEAP, DIScount, SIZE, REceipt."),
            PronunciationTip("Comparative stress", "CHEAper, MORE exPENsive, BEST."),
            PronunciationTip("Prices", "$30 → THIRty dollars /ˈθɜːrti ˈdɑːlərz/.")
        ),
        culture = listOf(
            CulturalNote("Shopping malls", "Shopping malls are common in many countries as social spaces."),
            CulturalNote("Sales", "Seasonal sales attract many shoppers."),
            CulturalNote("Return policies", "Most stores allow returns with a receipt.")
        ),
        mistakes = listOf(
            CommonMistake("This is more cheaper.", "This is cheaper.", "Don't use 'more' with -er."),
            CommonMistake("How much are this shirt?", "How much is this shirt?", "Use 'is' with singular."),
            CommonMistake("I'll pay with cash.", "I'll pay in cash.", "Use 'in cash'."),
            CommonMistake("I'd like to return back.", "I'd like to return this.", "'Return' doesn't need 'back'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did they buy?", "Maria bought a dress ($80), Ali bought a shirt ($30)."),
            ComprehensionQuestion("Why didn't Maria buy the first dress?", "It was too expensive ($200)."),
            ComprehensionQuestion("How did they pay?", "By credit card.")
        ),
        speaking = listOf(
            SpeakingTask("Role-play a shopping conversation.", "نقش‌بازی مکالمه خرید.", "How much is...? / Can I try...? / I'll take it."),
            SpeakingTask("Compare two items.", "دو کالا را مقایسه کن.", "This is cheaper... / That is better... / The best is..."),
            SpeakingTask("Talk about your shopping habits.", "درباره عادات خریدت صحبت کن.", "I usually shop... / I like... / I don't like...")
        ),
        writing = listOf(
            WritingTask("Write about a recent shopping trip.", "درباره یک سفر خرید اخیر بنویس.", 140, "Use comparatives and superlatives.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 8 — Fun in the city | تفریح در شهر
    // ═══════════════════════════════════════════════════════════════
    private fun unit8() = base(
        8, "Fun in the city", "تفریح در شهر",
        listOf(
            "Talk about city activities and entertainment",
            "Use present perfect for experiences",
            "Ask about and give recommendations",
            "Discuss places in the city"
        ),
        listOf(
            v("city", "شهر", "The city is lively.", "شهر پرجنب‌وجوش است."),
            v("museum", "موزه", "We visited the art museum.", "از موزه هنر بازدید کردیم."),
            v("park", "پارک", "We had a picnic in the park.", "در پارک پیکنیک داشتیم."),
            v("concert", "کنسرت", "The concert was amazing.", "کنسرت شگفت‌انگیز بود."),
            v("theater", "تئاتر", "We watched a play at the theater.", "در تئاتر نمایش دیدیم."),
            v("festival", "فستیوال", "The music festival is in June.", "فستیوال موسیقی ژوئن است."),
            v("market", "بازار", "The night market is fun.", "بازار شبانه سرگرم‌کننده است."),
            v("gallery", "گالری", "She showed her work at a gallery.", "کارش را در گالری نمایش داد."),
            v("tourist", "گردشگر", "Many tourists visit the city.", "گردشگران زیادی از شهر بازدید می‌کنند."),
            v("attraction", "جاذبه", "What are the main attractions?", "جاذبه‌های اصلی چیست؟"),
            v("neighborhood", "محله", "The old neighborhood is charming.", "محله قدیمی جذاب است."),
            v("recommend", "توصیه کردن", "I recommend the museum.", "موزه را توصیه می‌کنم.", "verb"),
            v("experience", "تجربه", "It's an amazing experience.", "تجربه شگفت‌انگیزی است."),
            v("exciting", "هیجان‌انگیز", "The city is exciting.", "شهر هیجان‌انگیز است.", "adjective"),
            v("lively", "پرجنب‌وجوش", "It's a lively place.", "جای پرجنب‌وجوشی است.", "adjective")
        ),
        listOf(
            GrammarSection("Present perfect for experiences", "Have you ever been to...? I've been to... I've never been to..."),
            GrammarSection("Ever / never with present perfect", "Have you ever visited the museum? Yes, I have. No, I've never been."),
            GrammarSection("Recommendations", "You should visit... I recommend... Don't miss... It's worth seeing."),
            GrammarSection("Adjectives for places", "exciting, lively, crowded, quiet, beautiful, interesting, boring.")
        ),
        listOf(
            d("A", "Hey, Ali! Have you ever been to the new art museum?", "هی، علی! هیچ‌وقت به موزه هنر جدید رفته‌ای؟"),
            d("B", "No, I haven't. Is it good?", "نه، نرفته‌ام. خوب است؟"),
            d("A", "It's amazing! I went last weekend.", "شگفت‌انگیز است! آخر هفته گذشته رفتم."),
            d("B", "What did you see there?", "چه چیزی دیدی؟"),
            d("A", "Modern art from local artists. Very interesting.", "هنر مدرن از هنرمندان محلی. خیلی جالب."),
            d("B", "I'd like to go. When is it open?", "دوست دارم بروم. کی باز است؟"),
            d("A", "Every day from 10 to 6. Except Mondays.", "هر روز از ۱۰ تا ۶. به جز دوشنبه‌ها."),
            d("B", "Perfect. What else is there to do in the city?", "عالی. دیگر در شهر چه کاری هست؟"),
            d("A", "Lots! Have you been to the night market?", "زیاد! به بازار شبانه رفته‌ای؟"),
            d("B", "No, I haven't. What's it like?", "نه، نرفته‌ام. چطور است؟"),
            d("A", "It's lively and colorful. Great food and music.", "پرجنب‌وجوش و رنگارنگ است. غذای عالی و موسیقی."),
            d("B", "Sounds fun. Have you ever been to a concert here?", "سرگرم‌کننده به نظر می‌رسد. هیچ‌وقت به کنسرتی اینجا رفته‌ای؟"),
            d("A", "Yes, many times. The city has great music venues.", "بله، بارها. شهر مکان‌های موسیقی عالی دارد."),
            d("B", "I love live music. Where should I go?", "عاشق موسیقی زنده‌ام. کجا باید بروم؟"),
            d("A", "The Blue Note is the best jazz club. You should try it.", "بلو نوت بهترین کلوب جاز است. باید امتحان کنی."),
            d("B", "Jazz! I've never listened to live jazz.", "جاز! هرگز جاز زنده گوش نداده‌ام."),
            d("A", "You'll love it. The atmosphere is incredible.", "عاشقش می‌شوی. فضا باورنکردنی است."),
            d("B", "Great. What about parks?", "عالی. پارک‌ها چطور؟"),
            d("A", "There are many. The central park is the biggest.", "زیاد هستند. پارک مرکزی بزرگ‌ترین است."),
            d("B", "Have you ever had a picnic there?", "هیچ‌وقت آنجا پیکنیک کرده‌ای؟"),
            d("A", "Yes, many times. It's relaxing on weekends.", "بله، بارها. آخر هفته‌ها آرام‌بخش است."),
            d("B", "I'll try it this weekend.", "این آخر هفته امتحان می‌کنم."),
            d("A", "You should. And don't miss the old town.", "باید بکنی. و شهر قدیمی را از دست نده."),
            d("B", "Why?", "چرا؟"),
            d("A", "It has beautiful historic buildings and small cafés.", "ساختمان‌های تاریخی زیبا و کافه‌های کوچک دارد."),
            d("B", "That sounds perfect. Thanks for all the recommendations.", "عالی به نظر می‌رسد. ممنون برای همه توصیه‌ها."),
            d("A", "Anytime. Enjoy the city!", "هر وقت. از شهر لذت ببر!"),
            d("B", "I will. See you soon!", "می‌برم. به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did Maria see at the museum?", listOf("classic art", "modern art", "photos", "sculptures"), 1),
            q("What does Maria recommend for jazz?", listOf("the central park", "the Blue Note", "the old town", "the night market"), 1),
            q("Has Maria ever had a picnic at the park?", listOf("never", "once", "many times", "not mentioned"), 2),
            q("What's special about the old town?", listOf("modern buildings", "historic buildings and cafés", "night life", "shopping"), 1),
            q("Have you ever ___ to the museum?", listOf("go", "went", "been", "going"), 2),
            q("I've ___ been there.", listOf("ever", "never", "already", "still"), 1),
            q("You ___ visit the old town.", listOf("should", "shouldn't", "mustn't", "can't"), 0),
            q("It's ___ seeing.", listOf("worth", "worthy", "worthing", "worthed"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Worth seeing", "ارزش دیدن دارد", "It's worth seeing.", "ارزش دیدن دارد."),
            IdiomExpression("Don't miss", "از دست نده", "Don't miss the old town.", "شهر قدیمی را از دست نده."),
            IdiomExpression("Lively place", "جای پرجنب‌وجوش", "It's a lively place.", "جای پرجنب‌وجوشی است."),
            IdiomExpression("Historic buildings", "ساختمان‌های تاریخی", "It has historic buildings.", "ساختمان‌های تاریخی دارد.")
        ),
        phrasal = listOf(
            PhrasalVerb("check out", "بررسی کردن", "examine", "Check out the museum.", "موزه را بررسی کن.", "Yes"),
            PhrasalVerb("look around", "گشتن", "explore", "Let's look around the city.", "بیایید شهر را بگردیم.", "No"),
            PhrasalVerb("come along", "همراه آمدن", "join", "Come along with us.", "با ما بیا.", "No"),
            PhrasalVerb("hang out", "وقت گذراندن", "spend time", "We hang out downtown.", "مرکز شهر وقت می‌گذرانیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("City places stress", "MUseum, CONcert, THEater, FESTival, MARket."),
            PronunciationTip("Present perfect", "Have you EVER been? I've NEVER been."),
            PronunciationTip("Recommendations", "You SHOULD visit... Don't MISS... It's WORTH seeing.")
        ),
        culture = listOf(
            CulturalNote("City life", "Cities offer cultural activities like museums, theaters, and concerts."),
            CulturalNote("Night markets", "Night markets are popular in many Asian and European cities."),
            CulturalNote("Historic districts", "Many cities preserve historic areas with old architecture.")
        ),
        mistakes = listOf(
            CommonMistake("Have you ever went?", "Have you ever been?", "Use past participle 'been'."),
            CommonMistake("I've never went there.", "I've never been there.", "Use 'been'."),
            CommonMistake("It's worth to see.", "It's worth seeing.", "Use -ing after 'worth'."),
            CommonMistake("You should to visit.", "You should visit.", "After 'should', use base verb.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What does Maria recommend?", "The new art museum, night market, Blue Note jazz club, central park, old town."),
            ComprehensionQuestion("What's special about the night market?", "Lively, colorful, great food and music."),
            ComprehensionQuestion("What's the old town like?", "Historic buildings and small cafés.")
        ),
        speaking = listOf(
            SpeakingTask("Recommend places in your city.", "مکان‌هایی در شهرت توصیه کن.", "You should visit... / Don't miss... / It's worth seeing."),
            SpeakingTask("Talk about experiences in a city.", "درباره تجربیات در یک شهر صحبت کن.", "I've been to... / I've never been... / Have you ever...?"),
            SpeakingTask("Describe an interesting place.", "یک مکان جالب توصیف کن.", "It's a... place. / You can... / It's worth...")
        ),
        writing = listOf(
            WritingTask("Write about your favorite place in the city.", "درباره مکان مورد علاقه‌ات در شهر بنویس.", 140, "Use present perfect and recommendations.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 9 — People | مردم
    // ═══════════════════════════════════════════════════════════════
    private fun unit9() = base(
        9, "People", "مردم",
        listOf(
            "Describe people's personalities and behavior",
            "Use relative clauses with who/that",
            "Talk about people you know",
            "Discuss what makes people special"
        ),
        listOf(
            v("personality", "شخصیت", "She has a strong personality.", "او شخصیت قوی‌ای دارد."),
            v("kind", "مهربان", "He's very kind to everyone.", "او با همه خیلی مهربان است.", "adjective"),
            v("generous", "سخاوتمند", "She's very generous.", "او خیلی سخاوتمند است.", "adjective"),
            v("patient", "صبور", "Teachers need to be patient.", "معلمان باید صبور باشند.", "adjective"),
            v("honest", "صادق", "He's an honest man.", "او مرد صادقی است.", "adjective"),
            v("polite", "مؤدب", "She's always polite.", "او همیشه مؤدب است.", "adjective"),
            v("creative", "خلاق", "He's very creative.", "او خیلی خلاق است.", "adjective"),
            v("confident", "با اعتماد به نفس", "She's a confident speaker.", "او سخنران با اعتماد به نفسی است.", "adjective"),
            v("responsible", "مسئول", "He's responsible for the team.", "او مسئول تیم است.", "adjective"),
            v("independent", "مستقل", "She's a very independent person.", "او فرد خیلی مستقلی است.", "adjective"),
            v("who", "که (برای اشخاص)", "He's the man who helped me.", "او مردی است که به من کمک کرد."),
            v("that", "که", "She's the person that I admire.", "او شخصی است که تحسینش می‌کنم."),
            v("relative clause", "جمله وصفی", "Add information about a person.", "اطلاعاتی درباره یک شخص اضافه کن."),
            v("admire", "تحسین کردن", "I admire my mother.", "مادرم را تحسین می‌کنم.", "verb"),
            v("respect", "احترام گذاشتن", "I respect him a lot.", "او را خیلی احترام می‌گذارم.", "verb")
        ),
        listOf(
            GrammarSection("Relative clauses with who/that", "Use 'who' or 'that' for people. He's the man who helped me. She's the person that I admire."),
            GrammarSection("Omitting the relative pronoun", "When the relative pronoun is the object, it can be omitted. She's the person (that) I admire."),
            GrammarSection("Adjectives for people", "kind, generous, patient, honest, polite, creative, confident, responsible, independent."),
            GrammarSection("Describing special people", "She's the kind of person who always helps. He's someone who never gives up.")
        ),
        listOf(
            d("A", "Maria, who's your role model?", "ماریا، الگوی تو کیست؟"),
            d("B", "My grandmother. She's the most amazing person I know.", "مادربزرگم. او شگفت‌انگیزترین فردی است که می‌شناسم."),
            d("A", "Why?", "چرا؟"),
            d("B", "She's the kind of person who always helps others.", "او از آن نوع آدمی است که همیشه به دیگران کمک می‌کند."),
            d("A", "What did she do?", "چه کار کرد؟"),
            d("B", "She raised three children alone and still volunteers.", "سه فرزند را تنها بزرگ کرد و هنوز داوطلب است."),
            d("A", "Wow. She sounds very strong.", "واو. خیلی قوی به نظر می‌رسد."),
            d("B", "She is. She's the reason I became a nurse.", "هست. دلیل اینکه پرستار شدم اوست."),
            d("A", "That's inspiring. What about you?", "الهام‌بخش است. تو چطور؟"),
            d("B", "What do you mean?", "منظورت چیست؟"),
            d("A", "Who's your hero?", "قهرمان تو کیست؟"),
            d("B", "My older brother. He's someone who never gives up.", "برادرم. کسی است که هرگز تسلیم نمی‌شود."),
            d("A", "Really? Tell me more.", "واقعاً؟ بیشتر بگو."),
            d("B", "He started his own business at 22. It was really hard.", "کسب‌وکار خودش را در ۲۲ سالگی راه انداخت. خیلی سخت بود."),
            d("A", "Did it succeed?", "موفق شد؟"),
            d("B", "Yes. Now he has 20 employees.", "بله. الان ۲۰ کارمند دارد."),
            d("A", "That's impressive. What's he like?", "تحسین‌برانگیز است. چطور آدمی است؟"),
            d("B", "He's creative and independent. Very hardworking too.", "خلاق و مستقل است. خیلی سختکوش هم."),
            d("A", "Sounds like a great person.", "فرد عالی‌ای به نظر می‌رسد."),
            d("B", "He is. What about you? Who do you admire?", "هست. تو چطور؟ کی را تحسین می‌کنی؟"),
            d("A", "My English teacher. She's the person who inspired me to learn languages.", "معلم انگلیسی‌ام. کسی است که مرا به یادگیری زبان‌ها تشویق کرد."),
            d("B", "That's wonderful. Why her?", "شگفت‌انگیز است. چرا او؟"),
            d("A", "She was patient and kind. And she made learning fun.", "صبور و مهربان بود. و یادگیری را سرگرم‌کننده می‌کرد."),
            d("B", "Good teachers are special.", "معلمان خوب خاص هستند."),
            d("A", "Definitely. I still keep in touch with her.", "قطعاً. هنوز با او در تماسم."),
            d("B", "That's nice. Well, I should go. I'm meeting my brother.", "خوبه. خب، باید بروم. با برادرم قرار دارم."),
            d("A", "Say hi to him for me. See you soon!", "از طرف من سلام برسان. به‌زودی می‌بینمت!"),
            d("B", "I will. Bye!", "می‌رسانم. خداحافظ!"),
            d("A", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Who is Maria's role model?", listOf("her mother", "her grandmother", "her brother", "her teacher"), 1),
            q("What did Maria's grandmother do?", listOf("started a business", "raised three children alone", "taught English", "wrote books"), 1),
            q("What's Ali's brother like?", listOf("kind and generous", "creative and independent", "patient and polite", "honest and confident"), 1),
            q("Who does Maria admire?", listOf("her English teacher", "her brother", "her grandmother", "her friend"), 1),
            q("He's the man ___ helped me.", listOf("who", "which", "whose", "where"), 0),
            q("She's the person ___ I admire.", listOf("who", "which", "whose", "that"), 3),
            q("I ___ my mother a lot.", listOf("admire", "respect", "know", "like"), 0),
            q("He's very ___.", listOf("kindness", "kind", "kindly", "kinder"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Role model", "الگو", "She's my role model.", "او الگوی من است."),
            IdiomExpression("Never give up", "هرگز تسلیم نشو", "He never gives up.", "هرگز تسلیم نمی‌شود."),
            IdiomExpression("Keep in touch", "در تماس بودن", "I still keep in touch.", "هنوز در تماسم."),
            IdiomExpression("The kind of person who", "از آن نوع آدمی که", "She's the kind of person who helps.", "از آن نوع آدمی است که کمک می‌کند.")
        ),
        phrasal = listOf(
            PhrasalVerb("look up to", "تحسین کردن", "admire", "I look up to my brother.", "برادرم را تحسین می‌کنم.", "No"),
            PhrasalVerb("keep in touch", "در تماس بودن", "maintain contact", "We keep in touch.", "در تماس هستیم.", "No"),
            PhrasalVerb("grow up", "بزرگ شدن", "spend childhood", "She grew up in a small town.", "او در شهر کوچکی بزرگ شد.", "Yes"),
            PhrasalVerb("take after", "شبیه بودن", "resemble", "He takes after his father.", "او شبیه پدرش است.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Personality stress", "KIND, GENerous, PAtient, HOnest, poLITE."),
            PronunciationTip("Relative clauses", "He's the man WHO helped me. (stress 'who')"),
            PronunciationTip("Rhythm in clauses", "She's the PERson who INSPIRED me.")
        ),
        culture = listOf(
            CulturalNote("Role models", "Role models can be family members, teachers, or public figures."),
            CulturalNote("Admiration", "Admiring someone often involves their personality and actions."),
            CulturalNote("Relationships", "Keeping in touch with important people shows respect.")
        ),
        mistakes = listOf(
            CommonMistake("He's the man which helped me.", "He's the man who helped me.", "Use 'who' for people."),
            CommonMistake("She's the person who I admire her.", "She's the person who I admire.", "Don't repeat the object."),
            CommonMistake("I look up my brother.", "I look up to my brother.", "Use 'look up to'."),
            CommonMistake("He takes after from his father.", "He takes after his father.", "Don't use 'from' after 'take after'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("Why is Maria's grandmother her role model?", "She raised 3 children alone, still volunteers, inspired Maria."),
            ComprehensionQuestion("What's Ali's brother like?", "Creative, independent, hardworking — started his own business at 22."),
            ComprehensionQuestion("Who does Ali admire?", "His English teacher who inspired him to learn languages.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a person you admire.", "درباره کسی که تحسین می‌کنی صحبت کن.", "I admire... / She's the kind of person who... / He's someone who..."),
            SpeakingTask("Describe someone's personality.", "شخصیت کسی را توصیف کن.", "He's very... / She's a... person. / He's someone who..."),
            SpeakingTask("Talk about your role model.", "درباره الگوی خودت صحبت کن.", "My role model is... / She taught me... / She's the reason I...")
        ),
        writing = listOf(
            WritingTask("Write about a person you admire.", "درباره کسی که تحسین می‌کنی بنویس.", 150, "Use relative clauses with who/that.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 10 — In a restaurant | در رستوران
    // ═══════════════════════════════════════════════════════════════
    private fun unit10() = base(
        10, "In a restaurant", "در رستوران",
        listOf(
            "Order food and drinks in a restaurant",
            "Read a menu and understand prices",
            "Use polite requests",
            "Talk about food preferences"
        ),
        listOf(
            v("restaurant", "رستوران", "This restaurant is great.", "این رستوران عالی است."),
            v("menu", "منو", "Can I see the menu?", "می‌توانم منو را ببینم؟"),
            v("order", "سفارش دادن", "Are you ready to order?", "آماده سفارش هستید؟", "verb"),
            v("waiter", "پیشخدمت", "The waiter is friendly.", "پیشخدمت دوستانه است."),
            v("appetizer", "پیش‌غذا", "I'll start with an appetizer.", "با یک پیش‌غذا شروع می‌کنم."),
            v("main course", "غذای اصلی", "For the main course, I'll have pasta.", "برای غذای اصلی، پاستا می‌خورم."),
            v("dessert", "دسر", "Do you want dessert?", "دسر می‌خواهی؟"),
            v("bill", "صورت‌حساب", "Can I have the bill?", "می‌توانم صورت‌حساب بگیرم؟"),
            v("tip", "انعام", "Leave a 15% tip.", "۱۵٪ انعام بگذار."),
            v("recommend", "توصیه کردن", "What do you recommend?", "چه توصیه می‌کنی؟", "verb"),
            v("delicious", "خوشمزه", "The pasta was delicious.", "پاستا خوشمزه بود.", "adjective"),
            v("vegetarian", "گیاه‌خوار", "Do you have vegetarian dishes?", "غذای گیاهی دارید؟", "adjective"),
            v("spicy", "تند", "I don't like spicy food.", "غذای تند دوست ندارم.", "adjective"),
            v("reservation", "رزرو", "I have a reservation.", "رزرو دارم."),
            v("table for two", "میز برای دو نفر", "A table for two, please.", "میز برای دو نفر، لطفاً.")
        ),
        listOf(
            GrammarSection("Polite requests with 'I'd like'", "I'd like a table for two. I'd like the chicken. I'd like the bill."),
            GrammarSection("Questions with 'Can I...?'", "Can I see the menu? Can I have the bill? Can I get you something?"),
            GrammarSection("Recommending and asking for recommendations", "What do you recommend? I recommend the pasta. The salmon is excellent."),
            GrammarSection("Quantities and descriptions", "a glass of water, a cup of coffee, a piece of cake, a bowl of soup.")
        ),
        listOf(
            d("A", "Good evening! Do you have a reservation?", "عصر بخیر! رزرو دارید؟"),
            d("B", "No, we don't. A table for two, please.", "نه، نداریم. میز برای دو نفر، لطفاً."),
            d("A", "Of course. Right this way.", "البته. از این طرف."),
            d("B", "Thank you.", "ممنون."),
            d("A", "Here are your menus. Can I get you something to drink?", "این هم منوها. نوشیدنی چیزی بیاورم؟"),
            d("B", "Yes, please. A glass of water and a cup of tea.", "بله، لطفاً. یک لیوان آب و یک فنجان چای."),
            d("A", "Are you ready to order, or do you need a few minutes?", "آماده سفارش هستید، یا چند دقیقه لازم دارید؟"),
            d("B", "We need a few minutes, please.", "چند دقیقه لازم داریم، لطفاً."),
            d("A", "No problem. I'll be right back.", "مشکلی نیست. الان برمی‌گردم."),
            d("B", "Okay, we're ready. What do you recommend?", "باشه، آماده‌ایم. چه توصیه می‌کنی؟"),
            d("A", "The grilled salmon is excellent tonight.", "سالمون کبابی امشب عالی است."),
            d("B", "That sounds good. I'll have that.", "خوب به نظر می‌رسد. همان را می‌خورم."),
            d("A", "And for you, madam?", "و برای شما، خانم؟"),
            d("C", "I'd like the vegetarian pasta, please.", "پاستای گیاهی می‌خواهم، لطفاً."),
            d("A", "Would you like any appetizers?", "پیش‌غذا می‌خواهید؟"),
            d("B", "Yes, the soup of the day, please.", "بله، سوپ روز، لطفاً."),
            d("C", "And I'd like a salad.", "و من سالاد می‌خواهم."),
            d("A", "Perfect. Anything else?", "عالی. چیز دیگری؟"),
            d("B", "No, that's all for now. Thank you.", "نه، فعلاً همین. ممنون."),
            d("A", "I'll be back with your appetizers soon.", "به‌زودی با پیش‌غذاها برمی‌گردم."),
            d("B", "Thanks.", "ممنون."),
            d("A", "How is everything?", "همه چیز چطور است؟"),
            d("B", "Delicious! The salmon is perfect.", "خوشمزه! سالمون عالی است."),
            d("C", "My pasta is great too.", "پاستای من هم عالی است."),
            d("A", "Wonderful. Would you like some dessert?", "عالی. دسر می‌خواهید؟"),
            d("B", "Yes! What do you have?", "بله! چه دارید؟"),
            d("A", "Chocolate cake, cheesecake, and ice cream.", "کیک شکلاتی، چیزکیک، و بستنی."),
            d("B", "We'll share a chocolate cake.", "یک کیک شکلاتی را تقسیم می‌کنیم."),
            d("A", "Excellent choice. Anything else?", "انتخاب عالی. چیز دیگری؟"),
            d("B", "No, just the bill, please.", "نه، فقط صورت‌حساب، لطفاً."),
            d("A", "Here you are. That's $65.50.", "بفرمایید. ۶۵.۵۰ دلار می‌شود."),
            d("B", "Here's $75. Keep the change.", "۷۵ دلار. بقیه‌اش مال شما."),
            d("A", "Thank you very much! Have a great evening!", "خیلی ممنون! شب خوبی داشته باشید!"),
            d("B", "You too. Goodbye!", "شما هم. خداحافظ!"),
            d("C", "That was a wonderful dinner.", "شام شگفت‌انگیزی بود."),
            d("B", "Yes. Let's come back soon.", "بله. بیایید به‌زودی برگردیم."),
            d("C", "Definitely! Bye!", "قطعاً! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What did the guests order to drink?", listOf("coffee and juice", "water and tea", "soda", "wine"), 1),
            q("What did the man order?", listOf("vegetarian pasta", "salmon", "steak", "chicken"), 1),
            q("What dessert did they share?", listOf("cheesecake", "ice cream", "chocolate cake", "fruit"), 2),
            q("How much did they leave for the waiter?", listOf("$5.00", "$9.50", "$10.00", "$15.00"), 1),
            q("I'd like ___ water.", listOf("a glass of", "a glass", "glass", "the glass"), 0),
            q("___ I see the menu?", listOf("Can", "Am", "Is", "Are"), 0),
            q("What do you ___?", listOf("recommend", "recommends", "recommending", "recommended"), 0),
            q("The bill, ___.", listOf("please", "thank", "welcome", "sorry"), 0)
        ),
        idioms = listOf(
            IdiomExpression("Right this way", "از این طرف", "Right this way.", "از این طرف."),
            IdiomExpression("Ready to order", "آماده سفارش", "Are you ready to order?", "آماده سفارش هستید؟"),
            IdiomExpression("Keep the change", "بقیه‌اش مال شما", "Keep the change.", "بقیه‌اش مال شما."),
            IdiomExpression("Soup of the day", "سوپ روز", "The soup of the day, please.", "سوپ روز، لطفاً.")
        ),
        phrasal = listOf(
            PhrasalVerb("eat out", "بیرون غذا خوردن", "eat at restaurant", "We eat out every Friday.", "هر جمعه بیرون غذا می‌خوریم.", "No"),
            PhrasalVerb("order in", "سفارش دادن (خانگی)", "order delivery", "Let's order in tonight.", "بیایید امشب سفارش بدهیم.", "No"),
            PhrasalVerb("try out", "امتحان کردن", "test", "Let's try out the new place.", "بیایید جای جدید را امتحان کنیم.", "No"),
            PhrasalVerb("check in", "رزرو را تأیید کردن", "confirm reservation", "Let's check in.", "بیایید رزرو را تأیید کنیم.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("Food items", "SALmon, PASta, SAlad, CHOColet cake."),
            PronunciationTip("Polite requests", "I'd LIKE... (rising, polite intonation)"),
            PronunciationTip("Money stress", "$65.50 → sixty-FIVE FIFty.")
        ),
        culture = listOf(
            CulturalNote("Tipping", "In the US, tip 15-20% for good service."),
            CulturalNote("Restaurant etiquette", "Waiters often introduce themselves by name and describe specials."),
            CulturalNote("Menu language", "Menus often have sections: appetizers, main courses, desserts.")
        ),
        mistakes = listOf(
            CommonMistake("I want water.", "I'd like some water, please.", "'I'd like' is more polite."),
            CommonMistake("Give me the menu.", "Can I see the menu, please?", "Use polite request."),
            CommonMistake("The check, please.", "The bill, please. / The check, please.", "Both are correct; 'check' is American, 'bill' is British."),
            CommonMistake("How much cost?", "How much does it cost?", "Use 'how much does'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What did the guests order?", "Water, tea, salmon, vegetarian pasta, soup, salad, and chocolate cake."),
            ComprehensionQuestion("How much was the bill?", "$65.50, they left $75."),
            ComprehensionQuestion("How was the food?", "Delicious — both guests enjoyed their meals.")
        ),
        speaking = listOf(
            SpeakingTask("Role-play ordering in a restaurant.", "نقش‌بازی سفارش در رستوران.", "I'd like... / Can I have...? / The bill, please."),
            SpeakingTask("Talk about your favorite food.", "درباره غذای مورد علاقه‌ات صحبت کن.", "I love... / My favorite is... / I don't like..."),
            SpeakingTask("Discuss eating out habits.", "درباره عادات بیرون غذا خوردن صحبت کن.", "I usually eat out... / I prefer... / My favorite restaurant is...")
        ),
        writing = listOf(
            WritingTask("Write a review of a restaurant.", "نقد یک رستوران بنویس.", 140, "Use food vocabulary and opinion expressions.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 11 — Entertainment | سرگرمی
    // ═══════════════════════════════════════════════════════════════
    private fun unit11() = base(
        11, "Entertainment", "سرگرمی",
        listOf(
            "Talk about entertainment preferences",
            "Express opinions with 'I'm a fan of' / 'I'm not a fan of'",
            "Discuss movies, music, and shows",
            "Use comparatives to compare entertainment"
        ),
        listOf(
            v("entertainment", "سرگرمی", "What do you do for entertainment?", "برای سرگرمی چه می‌کنی؟"),
            v("fan", "طرفدار", "I'm a fan of rock music.", "طرفدار موسیقی راکم."),
            v("drama", "درام", "I love watching dramas.", "عاشق تماشای درام‌ام."),
            v("comedy", "کمدی", "Comedies make me laugh.", "کمدی‌ها مرا می‌خندانند."),
            v("musical", "موزیکال", "The musical was amazing.", "موزیکال شگفت‌انگیز بود."),
            v("thriller", "دلهره‌آور", "I enjoy thrillers.", "از دلهره‌آورها لذت می‌برم."),
            v("horror", "ترسناک", "I don't like horror movies.", "فیلم‌های ترسناک دوست ندارم."),
            v("suggest", "پیشنهاد دادن", "Can you suggest a movie?", "می‌توانی فیلمی پیشنهاد دهی؟", "verb"),
            v("popular", "محبوب", "It's very popular.", "خیلی محبوب است.", "adjective"),
            v("boring", "کسل‌کننده", "The show was boring.", "برنامه کسل‌کننده بود.", "adjective"),
            v("exciting", "هیجان‌انگیز", "The finale was exciting.", "پایان هیجان‌انگیز بود.", "adjective"),
            v("plot", "خط داستانی", "The plot was interesting.", "خط داستانی جالب بود."),
            v("acting", "بازیگری", "The acting was excellent.", "بازیگری عالی بود."),
            v("recommendation", "توصیه", "Thanks for the recommendation.", "ممنون برای توصیه."),
            v("genre", "ژانر", "What's your favorite genre?", "ژانر مورد علاقه‌ات چیست؟")
        ),
        listOf(
            GrammarSection("I'm a fan of / I'm not a fan of", "Express preferences. I'm a fan of comedies. I'm not a fan of horror movies."),
            GrammarSection("Comparatives for entertainment", "better, funnier, more interesting, less exciting. This movie is funnier than that one."),
            GrammarSection("Suggestions with 'How about' and 'What about'", "How about watching a comedy? What about that new series?"),
            GrammarSection("Opinions with adjectives", "The acting was amazing. The plot was boring. The music was beautiful.")
        ),
        listOf(
            d("A", "Hey, Ali! Any plans for the weekend?", "هی، علی! برنامه‌ای برای آخر هفته داری؟"),
            d("B", "Not really. Maybe watch a movie. Any suggestions?", "نه واقعاً. شاید فیلم ببینم. پیشنهادی داری؟"),
            d("A", "What kind of movies do you like?", "چه نوع فیلمی دوست داری؟"),
            d("B", "I'm a fan of thrillers. And some comedies.", "طرفدار دلهره‌آورها هستم. و برخی کمدی‌ها."),
            d("A", "Have you seen the new detective movie?", "فیلم کارآگاهی جدید را دیده‌ای؟"),
            d("B", "No, I haven't. Is it good?", "نه، ندیده‌ام. خوب است؟"),
            d("A", "It's excellent. The plot is clever and the acting is amazing.", "عالی است. خط داستانی هوشمندانه است و بازیگری شگفت‌انگیز."),
            d("B", "Sounds perfect. Who's in it?", "عالی به نظر می‌رسد. بازیگرانش کیست؟"),
            d("A", "Some great actors. I can't remember their names.", "بازیگران عالی. نام‌هایشان را یادم نمی‌آید."),
            d("B", "That's okay. How long is it?", "اشکالی ندارد. چقدر طولانی است؟"),
            d("A", "About two hours.", "حدود دو ساعت."),
            d("B", "Perfect. I'll watch it this weekend.", "عالی. این آخر هفته تماشا می‌کنم."),
            d("A", "You should. And let me know what you think.", "باید بکنی. و بگو چه فکری می‌کنی."),
            d("B", "I will. What about music? Are you a fan of jazz?", "می‌گویم. موسیقی چطور؟ طرفدار جازی؟"),
            d("A", "Not really. I prefer rock and pop.", "نه واقعاً. راک و پاپ ترجیح می‌دهم."),
            d("B", "I love jazz. It's relaxing.", "عاشق جازم. آرام‌بخش است."),
            d("A", "I understand. Different tastes.", "می‌فهمم. سلیقه‌های متفاوت."),
            d("B", "Exactly. What about live shows?", "دقیقاً. نمایش‌های زنده چطور؟"),
            d("A", "I love musicals! Have you seen any?", "عاشق موزیکال‌هایم! دیده‌ای؟"),
            d("B", "Yes, one. It was fantastic.", "بله، یکی. فوق‌العاده بود."),
            d("A", "Which one?", "کدام یکی؟"),
            d("B", "Les Misérables. The music was unforgettable.", "بینوایان. موسیقی فراموش‌نشدنی بود."),
            d("A", "I love that one! The story is so moving.", "عاشق آن هستم! داستان خیلی تأثیرگذار است."),
            d("B", "Yes. I cried at the end.", "بله. آخرش گریه کردم."),
            d("A", "Me too. It's one of the best musicals.", "من هم. یکی از بهترین موزیکال‌هاست."),
            d("B", "Agreed. What about you? What's your favorite entertainment?", "موافقم. تو چطور؟ سرگرمی مورد علاقه‌ات چیست؟"),
            d("A", "Probably movies. I watch at least one a week.", "احتمالاً فیلم‌ها. هفته‌ای حداقل یکی می‌بینم."),
            d("B", "That's a lot. What's the best movie you've seen recently?", "زیاد است. بهترین فیلمی که اخیراً دیده‌ای چیست؟"),
            d("A", "A French film about a chef. Beautiful story.", "یک فیلم فرانسوی درباره یک سرآشپز. داستان زیبا."),
            d("B", "Interesting. I'll add it to my list.", "جالب است. به لیستم اضافه می‌کنم."),
            d("A", "You should. Well, I should go. Enjoy your movie!", "باید بکنی. خب، باید بروم. از فیلمت لذت ببر!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("What kind of movies does Ali like?", listOf("comedy", "horror", "thrillers", "romance"), 2),
            q("How long is the detective movie?", listOf("1 hour", "1.5 hours", "2 hours", "3 hours"), 2),
            q("What music does Maria prefer?", listOf("rock and pop", "jazz", "classical", "hip-hop"), 0),
            q("What musical did Ali see?", listOf("Hamilton", "Les Misérables", "Cats", "The Lion King"), 1),
            q("I'm a fan ___ jazz.", listOf("of", "for", "at", "in"), 0),
            q("I'm not a fan ___ horror.", listOf("of", "for", "at", "in"), 0),
            q("This movie is ___ than that one.", listOf("funny", "funnier", "funniest", "more funny"), 1),
            q("How about ___ a comedy?", listOf("watch", "watching", "to watch", "watched"), 1)
        ),
        idioms = listOf(
            IdiomExpression("I'm a fan of", "طرفدار ... هستم", "I'm a fan of jazz.", "طرفدار جازم."),
            IdiomExpression("Different tastes", "سلیقه‌های متفاوت", "Different tastes.", "سلیقه‌های متفاوت."),
            IdiomExpression("Add to my list", "به لیستم اضافه کن", "I'll add it to my list.", "به لیستم اضافه می‌کنم."),
            IdiomExpression("Moving story", "داستان تأثیرگذار", "The story is so moving.", "داستان خیلی تأثیرگذار است.")
        ),
        phrasal = listOf(
            PhrasalVerb("watch out", "مواظب بودن", "be careful", "Watch out for the ending!", "مواظب پایانش باش!", "No"),
            PhrasalVerb("put on", "پخش کردن", "play", "Let's put on some music.", "بیایید موسیقی پخش کنیم.", "Yes"),
            PhrasalVerb("turn up", "بلند کردن", "increase volume", "Turn up the music.", "موسیقی را بلند کن.", "Yes"),
            PhrasalVerb("turn off", "خاموش کردن", "switch off", "Turn off the TV.", "تلویزیون را خاموش کن.", "Yes")
        ),
        pronunciation = listOf(
            PronunciationTip("Entertainment stress", "EnterTAINment, COMedy, THRILler, HORror, MUZical."),
            PronunciationTip("'Fan of' linking", "fan of → /fæn əv/."),
            PronunciationTip("Comparative stress", "FUNnier, MORE inTRESting, BETter.")
        ),
        culture = listOf(
            CulturalNote("Musicals", "Musicals are popular worldwide, especially in the US and UK."),
            CulturalNote("Movie genres", "Different cultures prefer different movie genres."),
            CulturalNote("Live entertainment", "Concerts, theater, and live shows are popular entertainment.")
        ),
        mistakes = listOf(
            CommonMistake("I'm a fan for jazz.", "I'm a fan of jazz.", "Use 'fan of'."),
            CommonMistake("I don't like horror movies too.", "I don't like horror movies either.", "Use 'either' in negatives."),
            CommonMistake("This movie is more funnier.", "This movie is funnier.", "Don't use 'more' with -er."),
            CommonMistake("How about to watch a movie?", "How about watching a movie?", "Use -ing after 'How about'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What movie does Maria recommend?", "The new detective movie — clever plot, amazing acting."),
            ComprehensionQuestion("What's Maria's favorite entertainment?", "Musicals and movies."),
            ComprehensionQuestion("What music do they prefer?", "Ali prefers rock and pop; Maria prefers jazz.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about your favorite entertainment.", "درباره سرگرمی مورد علاقه‌ات صحبت کن.", "I'm a fan of... / I love... / My favorite is..."),
            SpeakingTask("Recommend a movie or show.", "فیلم یا برنامه‌ای توصیه کن.", "You should watch... / It's really... / The plot is..."),
            SpeakingTask("Discuss different tastes.", "درباره سلیقه‌های مختلف صحبت کن.", "I prefer... / I'm not a fan of... / Different tastes...")
        ),
        writing = listOf(
            WritingTask("Write a review of a movie or show.", "نقد یک فیلم یا برنامه بنویس.", 150, "Use opinion adjectives and comparatives.")
        )
    )

    // ═══════════════════════════════════════════════════════════════
    // UNIT 12 — Time for a Change | زمانی برای تغییر
    // ═══════════════════════════════════════════════════════════════
    private fun unit12() = base(
        12, "Time for a Change", "زمانی برای تغییر",
        listOf(
            "Talk about future plans and changes",
            "Use 'going to' and 'will' for the future",
            "Discuss goals and aspirations",
            "Use 'I'd like to' for wishes"
        ),
        listOf(
            v("change", "تغییر", "I need a change.", "به تغییر نیاز دارم."),
            v("plan", "برنامه", "What are your plans?", "برنامه‌هایت چیست؟"),
            v("goal", "هدف", "My goal is to learn English.", "هدفم یادگیری انگلیسی است."),
            v("dream", "رویا", "It's my dream to travel.", "سفر رویای من است."),
            v("future", "آینده", "In the future...", "در آینده..."),
            v("aspiration", "آرزو", "Tell me about your aspirations.", "از آرزوهایت بگو."),
            v("decide", "تصمیم گرفتن", "I decided to change jobs.", "تصمیم گرفتم شغل عوض کنم.", "verb"),
            v("apply", "درخواست دادن", "I'll apply for a new job.", "برای شغل جدیدی درخواست می‌دهم.", "verb"),
            v("move", "نقل مکان کردن", "I'm going to move to a new city.", "قرار است به شهر جدیدی نقل مکان کنم.", "verb"),
            v("learn", "یاد گرفتن", "I'll learn a new language.", "زبان جدیدی یاد می‌گیرم.", "verb"),
            v("career", "حرفه", "I want a better career.", "حرفه بهتری می‌خواهم."),
            v("excited", "هیجان‌زده", "I'm excited about the change.", "درباره تغییر هیجان‌زده‌ام.", "adjective"),
            v("nervous", "مضطرب", "I'm a bit nervous too.", "کمی هم مضطربم.", "adjective"),
            v("prepare", "آماده کردن", "I'm preparing for the move.", "دارم برای نقل مکان آماده می‌شوم.", "verb"),
            v("someday", "روزی", "Someday I'll travel the world.", "روزی دور دنیا سفر می‌کنم.", "adverb")
        ),
        listOf(
            GrammarSection("Be going to for plans", "I'm going to change jobs. She's going to move. We're going to travel."),
            GrammarSection("Will for predictions and intentions", "I'll try harder. It will be great. I think it will work."),
            GrammarSection("I'd like to + base verb", "Polite way to express wishes. I'd like to learn a new language. She'd like to travel."),
            GrammarSection("Talking about future plans", "What are you going to do? I'm going to... What will you do? I'll...")
        ),
        listOf(
            d("A", "Hi, Maria! You look excited. What's going on?", "سلام، ماریا! هیجان‌زده به نظر می‌رسی. چه خبر است؟"),
            d("B", "Big news! I decided to make a change.", "خبر بزرگ! تصمیم گرفتم تغییری بدهم."),
            d("A", "Really? What kind of change?", "واقعاً؟ چه نوع تغییری؟"),
            d("B", "I'm going to move to a new city.", "قرار است به شهر جدیدی نقل مکان کنم."),
            d("A", "Wow! Which city?", "واو! کدام شهر؟"),
            d("B", "Barcelona. I've been offered a job there.", "بارسلونا. پیشنهاد کاری آنجا به من شده."),
            d("A", "That's amazing! When are you going?", "شگفت‌انگیز است! کی می‌روی؟"),
            d("B", "In two months. I'm preparing everything now.", "در دو ماه. الان دارم همه چیز را آماده می‌کنم."),
            d("A", "How do you feel about the change?", "درباره تغییر چه حسی داری؟"),
            d("B", "Excited and nervous at the same time.", "هیجان‌زده و مضطرب همزمان."),
            d("A", "That's normal. Have you told your family?", "طبیعی است. به خانواده‌ات گفته‌ای؟"),
            d("B", "Yes. My parents are supportive.", "بله. والدینم حمایتگر هستند."),
            d("A", "That's wonderful. What will you do there?", "شگفت‌انگیز است. آنجا چه کار می‌کنی؟"),
            d("B", "I'll work as a nurse in a big hospital.", "به عنوان پرستار در بیمارستان بزرگی کار می‌کنم."),
            d("A", "Perfect. You're a great nurse.", "عالی. پرستار عالی‌ای هستی."),
            d("B", "Thanks. I'd like to also learn Spanish.", "ممنون. دوست دارم اسپانیایی هم یاد بگیرم."),
            d("A", "That's a good idea. It will help you a lot.", "فکر خوبی. خیلی کمکت می‌کند."),
            d("B", "I agree. I'm going to take classes when I arrive.", "موافقم. قرار است وقتی رسیدم کلاس بگیرم."),
            d("A", "You're very organized. What about your apartment?", "خیلی منظمی. آپارتمانت چطور؟"),
            d("B", "I'm going to sell my furniture and rent a new place there.", "قرار است مبلمانم را بفروشم و آنجا جای جدیدی اجاره کنم."),
            d("A", "That's a lot of work.", "کار زیادی است."),
            d("B", "It is. But it's worth it.", "هست. ولی ارزشش را دارد."),
            d("A", "Do you have any other plans?", "برنامه دیگری داری؟"),
            d("B", "Yes. I'd like to travel around Europe while I'm there.", "بله. دوست دارم وقتی آنجا هستم دور اروپا سفر کنم."),
            d("A", "That sounds amazing. Which countries?", "شگفت‌انگیز به نظر می‌رسد. کدام کشورها؟"),
            d("B", "France, Italy, and maybe Portugal.", "فرانسه، ایتالیا، و شاید پرتغال."),
            d("A", "You'll have a great time.", "خوش می‌گذرانی."),
            d("B", "I hope so. What about you? Any changes planned?", "امیدوارم. تو چطور؟ تغییری برنامه‌ریزی کرده‌ای؟"),
            d("A", "I'm thinking about starting a small business.", "به راه‌اندازی کسب‌وکار کوچکی فکر می‌کنم."),
            d("B", "Really? What kind?", "واقعاً؟ چه نوعی؟"),
            d("A", "A small café. It's been my dream for years.", "یک کافه کوچک. سال‌ها رویای من بوده."),
            d("B", "That's exciting! When will you start?", "هیجان‌انگیز است! کی شروع می‌کنی؟"),
            d("A", "Maybe next year. I'm saving money now.", "شاید سال بعد. الان دارم پول پس‌انداز می‌کنم."),
            d("B", "Good plan. Dreams take time.", "برنامه خوبی. رویاها زمان می‌برند."),
            d("A", "Exactly. Well, I should go. Let's keep in touch!", "دقیقاً. خب، باید بروم. بیایید در تماس باشیم!"),
            d("B", "Definitely. I'll send you photos from Barcelona!", "قطعاً. از بارسلونا برایت عکس می‌فرستم!"),
            d("A", "Please do. Good luck with everything!", "لطفاً بفرست. در همه چیز موفق باشی!"),
            d("B", "Thanks! See you soon!", "ممنون! به‌زودی می‌بینمت!"),
            d("A", "See you! Bye!", "می‌بینمت! خداحافظ!"),
            d("B", "Bye!", "خداحافظ!")
        ),
        listOf(
            q("Where is Maria moving?", listOf("Madrid", "Barcelona", "Lisbon", "Paris"), 1),
            q("When is she going?", listOf("in one month", "in two months", "next year", "in a week"), 1),
            q("What will Maria do in Barcelona?", listOf("teach", "study", "work as a nurse", "open a café"), 2),
            q("What is Ali's dream?", listOf("travel", "move abroad", "open a café", "write a book"), 2),
            q("I ___ going to move.", listOf("am", "is", "are", "be"), 0),
            q("She ___ going to study.", listOf("am", "is", "are", "be"), 1),
            q("I ___ help you.", listOf("will", "going to", "am", "was"), 0),
            q("I'd like ___ travel.", listOf("travel", "to travel", "traveling", "traveled"), 1)
        ),
        idioms = listOf(
            IdiomExpression("Big news", "خبر بزرگ", "Big news!", "خبر بزرگ!"),
            IdiomExpression("Same time", "همزمان", "Excited and nervous at the same time.", "هیجان‌زده و مضطرب همزمان."),
            IdiomExpression("Worth it", "ارزشش را دارد", "It's worth it.", "ارزشش را دارد."),
            IdiomExpression("Dreams take time", "رویاها زمان می‌برند", "Dreams take time.", "رویاها زمان می‌برند.")
        ),
        phrasal = listOf(
            PhrasalVerb("move to", "نقل مکان به", "relocate to", "She's moving to Barcelona.", "او به بارسلونا نقل مکان می‌کند.", "No"),
            PhrasalVerb("look forward to", "منتظر بودن", "anticipate", "I'm looking forward to it.", "منتظرش هستم.", "No"),
            PhrasalVerb("save up", "پول پس‌انداز کردن", "accumulate money", "I'm saving up for a café.", "برای یک کافه پول پس‌انداز می‌کنم.", "No"),
            PhrasalVerb("take time", "زمان بردن", "require time", "Dreams take time.", "رویاها زمان می‌برند.", "No")
        ),
        pronunciation = listOf(
            PronunciationTip("'Going to' reduction", "gonna /ˈɡənə/. I'm gonna move."),
            PronunciationTip("'Will' contraction", "I'll /aɪl/, she'll /ʃiːl/, we'll /wiːl/."),
            PronunciationTip("'Would like to' reduction", "I'd like to → /aɪd laɪk tə/.")
        ),
        culture = listOf(
            CulturalNote("Career changes", "Changing careers or moving abroad for work is increasingly common."),
            CulturalNote("Dreams and goals", "Setting goals is important for personal growth."),
            CulturalNote("Support systems", "Family support makes big changes easier.")
        ),
        mistakes = listOf(
            CommonMistake("I going to move.", "I am going to move.", "Use 'am/is/are' + going to."),
            CommonMistake("She are going to study.", "She is going to study.", "Use 'is' with she/he/it."),
            CommonMistake("I will to travel.", "I will travel.", "After 'will', use base verb."),
            CommonMistake("I'd like going.", "I'd like to go.", "Use 'to + base verb' after 'would like'.")
        ),
        comprehension = listOf(
            ComprehensionQuestion("What's Maria's big change?", "Moving to Barcelona for a nursing job."),
            ComprehensionQuestion("What other plans does she have?", "Learn Spanish and travel around Europe."),
            ComprehensionQuestion("What's Ali's dream?", "Opening a small café — saving money now.")
        ),
        speaking = listOf(
            SpeakingTask("Talk about a change you're planning.", "درباره تغییری که برنامه‌ریزی می‌کنی صحبت کن.", "I'm going to... / I'd like to... / My plan is..."),
            SpeakingTask("Discuss your dreams and goals.", "درباره رویاها و اهدافت صحبت کن.", "My dream is... / Someday I'll... / I hope to..."),
            SpeakingTask("Talk about future plans.", "درباره برنامه‌های آینده صحبت کن.", "I'm going to... / I'll probably... / I hope to...")
        ),
        writing = listOf(
            WritingTask("Write about a change you want to make in your life.", "درباره تغییری که می‌خواهی در زندگی‌ات بدهی بنویس.", 150, "Use going to, will, and would like to.")
        )
    )
}