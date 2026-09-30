// ============================================
// AEF4_Lessons.kt
// American English File 4 — Third Edition (B1+)
// شامل ۳۶ درس کامل: 1A تا 12C
// ============================================

// ---------- Data Classes ----------
data class VocabItem(val word: String, val meaning: String, val example: String)
data class GrammarSection(val title: String, val explanation: String, val examples: List<String>)
data class QuizQuestion(val question: String, val options: List<String>, val correctIndex: Int)
data class DialogueLine(val speaker: String, val text: String)

data class Lesson(
    val code: String,
    val title: String,
    val grammarFocus: String,
    val vocabFocus: String,
    val pronunciationFocus: String,
    val vocab: List<VocabItem>,
    val grammar: List<GrammarSection>,
    val dialogue: List<DialogueLine>,
    val quiz: List<QuizQuestion>,
    val idioms: List<String>,
    val phrasalVerbs: List<String>,
    val pronunciation: List<String>,
    val culture: List<String>,
    val commonMistakes: List<String>,
    val comprehension: List<String>,
    val speaking: List<String>,
    val writing: String
)

// ============================================
// FILE 1
// ============================================

val lesson1A = Lesson(
    code = "1A",
    title = "Q and A",
    grammarFocus = "review: question formation",
    vocabFocus = "guessing meaning from context",
    pronunciationFocus = "intonation, stress, and rhythm in questions",

    vocab = listOf(
        VocabItem("interview", "مصاحبه", "She gave a very interesting interview about her new book."),
        VocabItem("curious", "کنجکاو", "I'm curious to know how you got started in this field."),
        VocabItem("awkward", "مضطرب، ناراحت", "There was an awkward silence after he asked the question."),
        VocabItem("relevant", "مرتبط", "Try to keep your questions relevant to the main topic."),
        VocabItem("vague", "مبهم", "His answer was too vague — I needed more details."),
        VocabItem("insight", "بینش، درک عمیق", "The interview gave us real insight into her creative process."),
        VocabItem("perspective", "دیدگاه", "From my perspective, the most important question is 'why?'"),
        VocabItem("clarify", "روشن کردن", "Could you clarify what you mean by 'creative freedom'?"),
        VocabItem("paraphrase", "بازگو کردن", "Can you paraphrase that last answer for our listeners?"),
        VocabItem("follow-up", "سوال پیگیری", "That was a great follow-up question — very sharp.")
    ),

    grammar = listOf(
        GrammarSection(
            title = "Direct questions: word order",
            explanation = "In direct questions, the auxiliary verb comes before the subject. With modal verbs and be, the same rule applies. If there is no auxiliary, use do/does/did.",
            examples = listOf(
                "Where do you usually go on vacation? (NOT Where you usually go?)",
                "What happened at the meeting yesterday? (no auxiliary needed — 'what' is the subject)",
                "Who wrote this article? (NOT Who did write this article?)",
                "How long have you been working here?",
                "Could you tell me more about that?"
            )
        ),
        GrammarSection(
            title = "Questions ending with a preposition",
            explanation = "In everyday spoken English, prepositions usually come at the end of the question, not at the beginning.",
            examples = listOf(
                "Who are you waiting for? (NOT For whom are you waiting?)",
                "What are you looking at?",
                "Which company does she work for?",
                "Who did you go to the party with?"
            )
        ),
        GrammarSection(
            title = "Indirect questions",
            explanation = "Indirect questions are more polite and formal. The word order is subject + verb (no inversion). Use phrases like: Do you know...? Could you tell me...? Can I ask...?",
            examples = listOf(
                "Direct: What time does the library close? → Indirect: Do you know what time the library closes?",
                "Direct: Is it going to rain? → Indirect: Do you think it's going to rain?",
                "Direct: Why did you leave your job? → Indirect: Could you tell me why you left your job?",
                "Direct: Has Thomas arrived? → Indirect: Do you know if Thomas has arrived?"
            )
        )
    ),

    dialogue = listOf(
        DialogueLine("Nadia", "So, Daniel — first of all, thank you for agreeing to do this interview."),
        DialogueLine("Daniel", "No problem at all. I'm happy to be here."),
        DialogueLine("Nadia", "I've been following your work for years. Can I start by asking how you got into photography?"),
        DialogueLine("Daniel", "Of course. It started when I was about sixteen. My grandfather gave me an old film camera."),
        DialogueLine("Nadia", "What kind of camera was it?"),
        DialogueLine("Daniel", "It was a Canon AE-1. Fully manual. I had no idea how to use it at first."),
        DialogueLine("Nadia", "So how did you learn?"),
        DialogueLine("Daniel", "I read every book I could find. And I made a lot of mistakes. A lot."),
        DialogueLine("Nadia", "What was the first photo you remember being proud of?"),
        DialogueLine("Daniel", "It was a portrait of my grandmother in her garden. The light was perfect."),
        DialogueLine("Nadia", "Do you still have it?"),
        DialogueLine("Daniel", "I do. It's framed in my studio. It reminds me why I started."),
        DialogueLine("Nadia", "That's lovely. Now, your new exhibition — can you tell us what it's about?"),
        DialogueLine("Daniel", "It's about silence. Moments of quiet in a noisy world."),
        DialogueLine("Nadia", "Interesting. What inspired that theme?"),
        DialogueLine("Daniel", "I spent a year travelling alone. No phone, no music, no conversation for weeks."),
        DialogueLine("Nadia", "That sounds intense. Was it difficult?"),
        DialogueLine("Daniel", "The first month was unbearable. After that, it became addictive."),
        DialogueLine("Nadia", "Could you describe what you were looking for in those photographs?"),
        DialogueLine("Daniel", "I was looking for moments when nothing was happening — and yet everything was happening."),
        DialogueLine("Nadia", "That's a beautiful way to put it. Who is the exhibition for?"),
        DialogueLine("Daniel", "Honestly? For anyone who feels overwhelmed by modern life."),
        DialogueLine("Nadia", "Do you think people will understand it without an explanation?"),
        DialogueLine("Daniel", "I hope so. Good art doesn't need a manual."),
        DialogueLine("Nadia", "How long did the whole project take?"),
        DialogueLine("Daniel", "About three years from the first idea to the final print."),
        DialogueLine("Nadia", "Three years! And how many photos did you take in total?"),
        DialogueLine("Daniel", "I have no idea. Tens of thousands, probably."),
        DialogueLine("Nadia", "How many made it into the exhibition?"),
        DialogueLine("Daniel", "Forty-two. That's it."),
        DialogueLine("Nadia", "Wow. So how do you decide which ones to keep?"),
        DialogueLine("Daniel", "It's instinct. I look at a photo and ask: does this make me feel something?"),
        DialogueLine("Nadia", "What's the most difficult part of your job?"),
        DialogueLine("Daniel", "The business side. Invoicing, emails, contracts. I'm terrible at it."),
        DialogueLine("Nadia", "Really? I assumed you had a manager."),
        DialogueLine("Daniel", "I did for two years. Then I realized I wanted to make those decisions myself."),
        DialogueLine("Nadia", "Was that a difficult decision?"),
        DialogueLine("Daniel", "Very. But I've never regretted it."),
        DialogueLine("Nadia", "Let me ask you something more personal. What does success mean to you?"),
        DialogueLine("Daniel", "Being able to wake up and choose what I work on. That's it."),
        DialogueLine("Nadia", "Not money or fame?"),
        DialogueLine("Daniel", "Those things are nice. But they're not why I do this."),
        DialogueLine("Nadia", "What advice would you give to a young photographer starting today?"),
        DialogueLine("Daniel", "Shoot every day. Even when you don't feel like it. Especially then."),
        DialogueLine("Nadia", "Is there anything you wish you'd known at the beginning?"),
        DialogueLine("Daniel", "That comparison is poison. Your only competition is yesterday's version of you."),
        DialogueLine("Nadia", "That's powerful. Do you ever doubt yourself?"),
        DialogueLine("Daniel", "Every single day. But I've learned to keep working anyway."),
        DialogueLine("Nadia", "What keeps you going on the hard days?"),
        DialogueLine("Daniel", "Looking at that first photo of my grandmother. It grounds me."),
        DialogueLine("Nadia", "You mentioned your grandmother earlier. How did she influence you?"),
        DialogueLine("Daniel", "She taught me patience. And the importance of paying attention."),
        DialogueLine("Nadia", "Do you think patience is something you can learn?"),
        DialogueLine("Daniel", "Absolutely. It's like a muscle. You have to exercise it."),
        DialogueLine("Nadia", "Let's talk about the future. What's next for you?"),
        DialogueLine("Daniel", "I want to teach. I've been thinking about it for a while."),
        DialogueLine("Nadia", "What would you teach?"),
        DialogueLine("Daniel", "Not technique. I'd teach people how to see."),
        DialogueLine("Nadia", "How do you teach someone to see?"),
        DialogueLine("Daniel", "You ask them questions. That's all. Questions change how we look at things."),
        DialogueLine("Nadia", "Speaking of questions — do you have a favourite question?"),
        DialogueLine("Daniel", "Hmm. 'What would this look like if it were easy?'"),
        DialogueLine("Nadia", "Who asks you that?"),
        DialogueLine("Daniel", "I ask myself. Usually when I'm overcomplicating everything."),
        DialogueLine("Nadia", "And does it help?"),
        DialogueLine("Daniel", "Almost always. It strips away the noise."),
        DialogueLine("Nadia", "Can I ask you something about the exhibition opening?"),
        DialogueLine("Daniel", "Go ahead."),
        DialogueLine("Nadia", "What should people expect when they walk in?"),
        DialogueLine("Daniel", "Quiet. That's the first thing. The rooms are designed to be silent."),
        DialogueLine("Nadia", "No music? No talking?"),
        DialogueLine("Daniel", "No music. Talking is allowed, but quietly."),
        DialogueLine("Nadia", "That's quite unusual. Why silence?"),
        DialogueLine("Daniel", "Because we've forgotten how to be still. I want to give people that back."),
        DialogueLine("Nadia", "Do you think it will work?"),
        DialogueLine("Daniel", "I don't know. But I'd rather fail trying than not try at all."),
        DialogueLine("Nadia", "What's been the most surprising reaction so far?"),
        DialogueLine("Daniel", "A man came up to me and cried. He said he hadn't felt that calm in years."),
        DialogueLine("Nadia", "That must have been incredibly moving."),
        DialogueLine("Daniel", "It was. It reminded me why art matters."),
        DialogueLine("Nadia", "Do you ever get tired of talking about yourself in interviews?"),
        DialogueLine("Daniel", "Ha! Sometimes. But I know it's part of the job."),
        DialogueLine("Nadia", "What's the strangest question you've ever been asked?"),
        DialogueLine("Daniel", "Someone once asked me what my camera smells like."),
        DialogueLine("Nadia", "What did you say?"),
        DialogueLine("Daniel", "I said 'possibility.' I think they were satisfied."),
        DialogueLine("Nadia", "Ha! That's a great answer. OK, last question — what do you hope people take away from your work?"),
        DialogueLine("Daniel", "A sense that slowing down is not the same as falling behind."),
        DialogueLine("Nadia", "That's a perfect note to end on. Thank you so much for your time, Daniel."),
        DialogueLine("Daniel", "Thank you, Nadia. This was actually fun."),
        DialogueLine("Nadia", "For me too. And good luck with the exhibition."),
        DialogueLine("Daniel", "Thanks. If you ever want to visit, just let me know."),
        DialogueLine("Nadia", "I'd love that. I'll bring my quietest shoes."),
        DialogueLine("Daniel", "Ha! You'll fit right in."),
        DialogueLine("Nadia", "Before we finish — is there anything you want to add?"),
        DialogueLine("Daniel", "Just one thing. Whoever is listening right now — put down your phone for five minutes today."),
        DialogueLine("Nadia", "Just five minutes?"),
        DialogueLine("Daniel", "Start small. Five minutes of silence can change your whole day."),
        DialogueLine("Nadia", "I'll try that. Thank you, Daniel."),
        DialogueLine("Daniel", "Thank you. And remember — the best questions are the ones you ask yourself."),
        DialogueLine("Nadia", "I won't forget that. Bye, everyone."),
        DialogueLine("Daniel", "Goodbye, everyone. Stay curious."),
        DialogueLine("Nadia", "And that's a wrap. Daniel, one more thing before you go —"),
        DialogueLine("Daniel", "Yes?"),
        DialogueLine("Nadia", "Your grandmother's photo — what was she doing in the garden?"),
        DialogueLine("Daniel", "She was picking tomatoes. She always wore that blue apron."),
        DialogueLine("Nadia", "And what was the light like?"),
        DialogueLine("Daniel", "Golden. Late afternoon. The kind of light you can't plan for."),
        DialogueLine("Nadia", "Thank you for sharing that. It feels like we're there."),
        DialogueLine("Daniel", "That's the whole point of photography, isn't it? Making people feel like they're there.")
    ),

    quiz = listOf(
        QuizQuestion("___ you tell me where the nearest station is?", listOf("Could", "Are", "Do", "Have"), 0),
        QuizQuestion("What ___ at the meeting yesterday?", listOf("did happen", "happened", "was happened", "has happened"), 1),
        QuizQuestion("Who ___ that beautiful painting?", listOf("did paint", "painted", "was painted", "has painted"), 1),
        QuizQuestion("Which of these is an indirect question?", listOf("Where does she live?", "Do you know where she lives?", "Where she lives?", "Does she live where?"), 1),
        QuizQuestion("Who are you waiting ___?", listOf("for", "at", "on", "with"), 0),
        QuizQuestion("Do you know if Thomas ___ yet?", listOf("arrived", "has arrived", "did arrive", "is arriving"), 1),
        QuizQuestion("What does 'vague' mean?", listOf("clear and detailed", "unclear and general", "funny and clever", "long and boring"), 1),
        QuizQuestion("How long ___ you ___ in this city?", listOf("do / live", "have / been living", "are / living", "did / live"), 1)
    ),

    idioms = listOf(
        "ask away — بپرس، در خدمتم",
        "fire away — شروع کن به پرسیدن",
        "that's a good question — سوال خوبی است",
        "to be honest with you — صادقانه بگویم",
        "off the top of my head — بدون فکر کردن، همین الان"
    ),

    phrasalVerbs = listOf(
        "find out — فهمیدن، کشف کردن",
        "bring up — مطرح کردن (موضوع)",
        "come up with — به ذهن رسیدن، ابداع کردن",
        "point out — اشاره کردن به",
        "go ahead — ادامه دادن، شروع کردن"
    ),

    pronunciation = listOf(
        "Rising intonation in yes/no questions: 'Do you know him?' ↗",
        "Falling intonation in wh-questions: 'Where do you live?' ↘",
        "Stress on the auxiliary in negative questions: 'Why DIDN'T you tell me?'",
        "Weak form of 'do' in questions: /də/ — 'What d'you mean?'",
        "Linking in indirect questions: 'Do you know if he's coming?' → /dʒənoʊwɪfizˈkʌmɪŋ/"
    ),

    culture = listOf(
        "In American English, direct questions are common even with strangers; in British English, indirect questions are more polite.",
        "In job interviews in the US, asking questions at the end is expected — it shows interest.",
        "In many Asian cultures, asking personal questions (age, salary) is normal; in Western cultures it can be rude.",
        "Podcast interviews often use indirect questions to make guests feel comfortable and not defensive."
    ),

    commonMistakes = listOf(
        "❌ Where you are going? → ✅ Where are you going?",
        "❌ What means this word? → ✅ What does this word mean?",
        "❌ Who did write this? → ✅ Who wrote this?",
        "❌ Could you tell me where is the station? → ✅ Could you tell me where the station is?",
        "❌ For who are you waiting? → ✅ Who are you waiting for?"
    ),

    comprehension = listOf(
        "How did Daniel first become interested in photography?",
        "What is the theme of his new exhibition, and why did he choose it?",
        "What does Daniel say is the most difficult part of his job?",
        "What advice does Daniel give to young photographers?",
        "What is the one thing Daniel wants listeners to do after the interview?"
    ),

    speaking = listOf(
        "Interview a partner using at least five indirect questions (Do you know...? Could you tell me...?).",
        "Talk about a time someone asked you a question that changed how you think.",
        "What's the best question anyone has ever asked you? Why was it powerful?",
        "Practice asking follow-up questions after a partner's answer.",
        "Discuss: Are direct questions always better than indirect ones? When would you use each?"
    ),

    writing = "Write a short interview (10–12 questions and answers) with a fictional artist or creator. Use a mix of direct questions, indirect questions, and questions ending with prepositions. Aim for 200–250 words."
)// ============================================
// AEF4_File3A.kt
// File 3A: The one place a burglar won't look
// Grammar: the passive (all forms); it is said that..., he is thought to...
// Vocabulary: crime and punishment
// Pronunciation: the letter u
// ============================================

val lesson3A = Lesson(
    code = "3A",
    title = "The one place a burglar won't look",
    grammarFocus = "the passive (all forms); it is said that..., he is thought to...",
    vocabFocus = "crime and punishment",
    pronunciationFocus = "the letter u",

    vocab = listOf(
        VocabItem("burglar", "دزد (خانه)", "The burglar entered through an open window."),
        VocabItem("theft", "سرقت", "He was arrested for theft."),
        VocabItem("witness", "شاهد", "The witness described the suspect to the police."),
        VocabItem("suspect", "مظنون", "The police arrested a suspect this morning."),
        VocabItem("evidence", "مدرک", "There wasn't enough evidence to convict him."),
        VocabItem("sentence", "حکم", "He received a five-year sentence."),
        VocabItem("court", "دادگاه", "She has to appear in court next week."),
        VocabItem("fine", "جریمه", "He had to pay a $500 fine."),
        VocabItem("guilty", "مجرم", "The jury found her guilty."),
        VocabItem("innocent", "بی‌گناه", "He insists he is innocent.")
    ),

    grammar = listOf(
        GrammarSection(
            title = "The passive (all forms)",
            explanation = "Passive voice: be + past participle. Use it when the action is more important than the doer, or when the doer is unknown/obvious. Can be used in any tense.",
            examples = listOf(
                "Present: The house is cleaned every Friday.",
                "Past: The money was stolen last night.",
                "Present perfect: The thief has been arrested.",
                "Future: The trial will be held next month.",
                "Modal: The evidence must be examined carefully.",
                "Continuous: The building is being renovated."
            )
        ),
        GrammarSection(
            title = "Passive with 'by'",
            explanation = "Use 'by' to say who did the action when it's important information. Often omitted when the doer is unknown or obvious.",
            examples = listOf(
                "The novel was written by Orwell.",
                "The suspect was questioned by detectives.",
                "My car was repaired by a local mechanic.",
                "The window was broken (by someone) during the night."
            )
        ),
        GrammarSection(
            title = "Impersonal passive: it is said that... / he is thought to...",
            explanation = "For general beliefs or reports, use: 'It is said that + clause' OR 'Subject + is said/thought/believed + to + infinitive'. Both mean the same. Common verbs: say, think, believe, report, know, consider.",
            examples = listOf(
                "It is said that he stole millions. = He is said to have stolen millions.",
                "It is thought that she left the country. = She is thought to have left the country.",
                "It is believed that the painting is a fake. = The painting is believed to be a fake.",
                "It is reported that crime is falling. = Crime is reported to be falling."
            )
        )
    ),

    dialogue = listOf(
        DialogueLine("Detective Harris", "Mr. Coleman, thank you for coming in. I'm Detective Harris. This is my partner, Detective Ross."),
        DialogueLine("Mr. Coleman", "Of course. I want to help in any way I can. My house was broken into — I'm the victim here."),
        DialogueLine("Detective Harris", "We understand. Can you tell us what happened last Tuesday night?"),
        DialogueLine("Mr. Coleman", "I was out at a work dinner. I came home around eleven and the front door was open."),
        DialogueLine("Detective Ross", "Was anything taken?"),
        DialogueLine("Mr. Coleman", "Yes. My laptop, a camera, and some jewellery that belonged to my wife."),
        DialogueLine("Detective Harris", "Was the jewellery insured?"),
        DialogueLine("Mr. Coleman", "Some of it. The rest was inherited from her grandmother. It can't be replaced."),
        DialogueLine("Detective Ross", "I'm sorry to hear that. Now, was the alarm system on?"),
        DialogueLine("Mr. Coleman", "It should have been. But it wasn't. I must have forgotten to set it."),
        DialogueLine("Detective Harris", "Have there been any similar break-ins in your neighbourhood recently?"),
        DialogueLine("Mr. Coleman", "Apparently, yes. My neighbour's house was burgled two weeks ago."),
        DialogueLine("Detective Ross", "Interesting. Same method of entry?"),
        DialogueLine("Mr. Coleman", "I don't know the details. But I've heard that the same man is suspected."),
        DialogueLine("Detective Harris", "We're investigating a suspect now. He's been seen in the area multiple times."),
        DialogueLine("Mr. Coleman", "Have any fingerprints been found?"),
        DialogueLine("Detective Ross", "The scene is still being examined. Results will be ready by Friday."),
        DialogueLine("Mr. Coleman", "What about the stolen items? Can they be recovered?"),
        DialogueLine("Detective Harris", "Sometimes. It depends on how quickly they're sold. Pawn shops are being checked."),
        DialogueLine("Mr. Coleman", "I see. Is there anything else I can do?"),
        DialogueLine("Detective Ross", "Yes. Please write down a full list of everything that was taken, with estimated values."),
        DialogueLine("Mr. Coleman", "I'll do that tonight. Should I send it by email?"),
        DialogueLine("Detective Harris", "That works. Also, if you remember anything unusual from that evening, call us immediately."),
        DialogueLine("Mr. Coleman", "There is one thing. I thought I saw a van parked across the street when I left for dinner."),
        DialogueLine("Detective Ross", "A van? Can you describe it?"),
        DialogueLine("Mr. Coleman", "White, maybe. It had a logo on the side, but I couldn't read it from that distance."),
        DialogueLine("Detective Harris", "That's useful. Vans are often used in these kinds of burglaries."),
        DialogueLine("Mr. Coleman", "Do you think it's the same person who broke into my neighbour's house?"),
        DialogueLine("Detective Ross", "It's very likely. The pattern matches."),
        DialogueLine("Mr. Coleman", "Will he be caught?"),
        DialogueLine("Detective Harris", "We're doing everything we can. He's thought to be operating in three different neighbourhoods."),
        DialogueLine("Mr. Coleman", "That's frightening. How many houses has he hit?"),
        DialogueLine("Detective Ross", "At least seven that we know of. Probably more."),
        DialogueLine("Mr. Coleman", "And he hasn't been arrested yet?"),
        DialogueLine("Detective Harris", "Not yet. But he's being watched. It's only a matter of time."),
        DialogueLine("Mr. Coleman", "What happens when he's caught?"),
        DialogueLine("Detective Ross", "He'll be charged. Then there'll be a trial. Then, if found guilty, a sentence."),
        DialogueLine("Mr. Coleman", "Will I have to go to court?"),
        DialogueLine("Detective Harris", "You may be called as a witness. It depends on the evidence."),
        DialogueLine("Mr. Coleman", "I've never been to court before. To be honest, the idea makes me nervous."),
        DialogueLine("Detective Ross", "That's completely normal. You'll be guided through the process."),
        DialogueLine("Mr. Coleman", "What kind of sentence would he get?"),
        DialogueLine("Detective Harris", "For multiple burglaries? Probably several years. Plus a fine."),
        DialogueLine("Mr. Coleman", "It doesn't feel like enough."),
        DialogueLine("Detective Ross", "I understand. But the law is the law."),
        DialogueLine("Mr. Coleman", "Do you think he'll do it again after he gets out?"),
        DialogueLine("Detective Harris", "Some do. Some don't. It depends on the person."),
        DialogueLine("Mr. Coleman", "Is there anything I can do to prevent this from happening again?"),
        DialogueLine("Detective Ross", "Better locks. Motion-sensor lights. And always set the alarm."),
        DialogueLine("Mr. Coleman", "I've already ordered a new alarm system. It's being installed tomorrow."),
        DialogueLine("Detective Harris", "Good. That's a smart move."),
        DialogueLine("Mr. Coleman", "My wife is terrified. She doesn't want to stay in the house anymore."),
        DialogueLine("Detective Ross", "That's very common after a break-in. It gets better with time."),
        DialogueLine("Mr. Coleman", "I hope so. She's been crying every night."),
        DialogueLine("Detective Harris", "Have you considered counselling? It can really help."),
        DialogueLine("Mr. Coleman", "Maybe. We'll see. First, I want this man caught."),
        DialogueLine("Detective Ross", "We're working on it. I promise you."),
        DialogueLine("Mr. Coleman", "Thank you. I appreciate everything you're doing."),
        DialogueLine("Detective Harris", "It's our job. And Mr. Coleman — one more thing."),
        DialogueLine("Mr. Coleman", "Yes?"),
        DialogueLine("Detective Harris", "Don't confront him if you see him. Call us. Immediately."),
        DialogueLine("Mr. Coleman", "I won't. I promise."),
        DialogueLine("Detective Ross", "Good. We'll be in touch by Friday."),
        DialogueLine("Mr. Coleman", "Thank you, detectives. Goodbye."),
        DialogueLine("Detective Harris", "Goodbye. And try to get some rest."),
        DialogueLine("Mr. Coleman", "I'll try.")
    ),

    quiz = listOf(
        QuizQuestion("The house ___ every Friday.", listOf("cleans", "is cleaned", "was cleaned", "cleaned"), 1),
        QuizQuestion("The money ___ last night.", listOf("steals", "is stolen", "was stolen", "stole"), 1),
        QuizQuestion("The thief ___ already ___.", listOf("has / been arrested", "is / arrested", "was / arrested", "has / arrested"), 0),
        QuizQuestion("The trial ___ next month.", listOf("holds", "is held", "will be held", "was held"), 2),
        QuizQuestion("It ___ that he stole millions.", listOf("says", "is said", "said", "was saying"), 1),
        QuizQuestion("He is thought ___ left the country.", listOf("to have", "having", "have", "to has"), 0),
        QuizQuestion("The evidence must ___ carefully.", listOf("examine", "be examined", "examining", "to examine"), 1),
        QuizQuestion("Which word means 'مجرم'?", listOf("innocent", "suspect", "guilty", "witness"), 2)
    ),

    idioms = listOf(
        "break into — وارد شدن با زور",
        "get away with — فرار کردن از مجازات",
        "be caught red-handed — در حال انجام جرم گرفته شدن",
        "behind bars — در زندان",
        "a matter of time — فقط مسئله زمان است"
    ),

    phrasalVerbs = listOf(
        "break in — وارد شدن با زور",
        "break out — فرار کردن از زندان",
        "turn in — تحویل دادن به پلیس",
        "get away — فرار کردن",
        "lock up — قفل کردن"
    ),

    pronunciation = listOf(
        "The letter 'u' as /ʌ/: burglar, suspect, punish",
        "The letter 'u' as /juː/: guilty, use",
        "The letter 'u' as /ʊ/: put, full",
        "Stress in 'evidence' — /ˈevɪdəns/",
        "Silent 'b' in 'climb' (similar pattern in 'bomb')"
    ),

    culture = listOf(
        "In the UK, burglary carries a maximum sentence of 14 years.",
        "In some countries, community service is used instead of prison for minor theft.",
        "In Japan, the crime rate is very low; in the US, it varies by state.",
        "Restorative justice programs bring victims and offenders together to talk."
    ),

    commonMistakes = listOf(
        "❌ The money was stole. → ✅ The money was stolen.",
        "❌ It is said he is steal. → ✅ It is said that he stole. / He is said to have stolen.",
        "❌ He is thought to left. → ✅ He is thought to have left.",
        "❌ The house was broke into. → ✅ The house was broken into.",
        "❌ I've been burgled my house. → ✅ My house has been burgled."
    ),

    comprehension = listOf(
        "What was stolen from Mr. Coleman's house?",
        "Why wasn't the alarm system on?",
        "What did Mr. Coleman see outside before the burglary?",
        "What will happen if the burglar is caught?",
        "What advice do the detectives give to prevent future break-ins?"
    ),

    speaking = listOf(
        "Describe a time something was stolen from you (or someone you know).",
        "Discuss: Is prison the best punishment for burglary? What alternatives exist?",
        "Role-play a police interview with a witness to a crime.",
        "Talk about crime in your city. Is it common? What can be done?",
        "Practice using passive voice and impersonal passive to describe news stories."
    ),

    writing = "Write a 200–250 word news report about a burglary. Use passive voice in at least six different tenses and two impersonal passive structures (it is said/reported that...)."
)