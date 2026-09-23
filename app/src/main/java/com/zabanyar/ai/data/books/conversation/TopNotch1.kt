package com.zabanyar.ai.data.books.conversation

import com.zabanyar.ai.data.*

object TopNotch1 {
    const val BOOK_ID = "top_notch_1"

    fun getContent(chapterNumber: Int): LessonContent = when (chapterNumber) {
        1 -> lesson1()
        2 -> lesson2()
        3 -> lesson3()
        4 -> lesson4()
        5 -> lesson5()
        6 -> lesson6()
        7 -> lesson7()
        8 -> lesson8()
        9 -> lesson9()
        10 -> lesson10()
        11 -> lesson11()
        12 -> lesson12()
        13 -> lesson13()
        14 -> lesson14()
        else -> LessonContent(BOOK_ID, chapterNumber, "Coming Soon", "به‌زودی...", vocabulary=emptyList(), grammar=emptyList(), conversation=emptyList(), quiz=emptyList())
    }

    private fun base(
        n: Int, title: String, fa: String, objectives: List<String>, vocab: List<VocabWord>,
        grammar: List<GrammarSection>, dialogue: List<DialogueLine>, quiz: List<QuizQuestion>,
        idioms: List<IdiomExpression> = emptyList(), phrasal: List<PhrasalVerb> = emptyList(),
        pronunciation: List<PronunciationTip> = emptyList(), culture: List<CulturalNote> = emptyList(),
        mistakes: List<CommonMistake> = emptyList(), comprehension: List<ComprehensionQuestion> = emptyList(),
        speaking: List<SpeakingTask> = emptyList(), writing: List<WritingTask> = emptyList()
    ) = LessonContent(
        bookId=BOOK_ID, chapterNumber=n, title=title, titlePersian=fa, objectives=objectives,
        vocabulary=vocab, idioms=idioms, phrasalVerbs=phrasal, pronunciationTips=pronunciation,
        culturalNotes=culture, grammar=grammar, commonMistakes=mistakes, conversation=dialogue,
        comprehensionQuestions=comprehension, speakingTasks=speaking, writingTasks=writing, quiz=quiz
    )

    private fun v(e:String,p:String,ex:String,ep:String,pos:String="noun")=VocabWord(e,p,partOfSpeech=pos,example=ex,examplePersian=ep)
    private fun d(s:String,e:String,p:String)=DialogueLine(s,e,p)
    private fun q(question:String, options:List<String>, correct:Int)=QuizQuestion(question,options,correct)

    private fun lesson1() = base(1,"Names and Occupations","نام‌ها و شغل‌ها",
        listOf("Talk about your occupation","Ask someone what they do","Use a/an with occupations","Introduce yourself"),
        listOf(
            v("teacher","معلم","I'm a teacher.","من معلم هستم."), v("student","دانش‌آموز / دانشجو","I'm a student.","من دانش‌آموز/دانشجو هستم."),
            v("architect","معمار","She's an architect.","او معمار است."), v("actor","بازیگر","He's an actor.","او بازیگر است."),
            v("athlete","ورزشکار","He's an athlete.","او ورزشکار است."), v("musician","موسیقی‌دان","She's a musician.","او موسیقی‌دان است."),
            v("artist","هنرمند","I'm an artist.","من هنرمند هستم."), v("banker","بانکدار","He's a banker.","او بانکدار است."),
            v("singer","خواننده","She's a singer.","او خواننده است."), v("flight attendant","مهماندار پرواز","She's a flight attendant.","او مهماندار پرواز است.")
        ),
        listOf(GrammarSection("Be: singular statements","I am, you are, he is, and she is are used to identify people."),GrammarSection("A / An","Use a before consonant sounds and an before vowel sounds."),GrammarSection("Contractions","I'm, you're, he's, and she's are common short forms.")),
        listOf(d("A","Hi, I'm Daniel. What's your name?","سلام، من دنیل هستم. اسمت چیست؟"),d("B","I'm Emma. Nice to meet you.","من اِما هستم. از آشنایی با تو خوشحالم."),d("A","Nice to meet you, too. What do you do?","من هم خوشحالم. شغلت چیست؟"),d("B","I'm an architect. And you?","من معمار هستم. و تو؟"),d("A","I'm a banker.","من بانکدار هستم."),d("B","That's interesting.","جالب است."),d("A","Do you work in an office?","در دفتر کار می‌کنی؟"),d("B","Yes, I do. What about you?","بله. تو چطور؟"),d("A","I work in a bank.","من در یک بانک کار می‌کنم."),d("B","Nice talking to you.","از صحبت با تو خوشحال شدم.") ),
        listOf(q("Choose: I'm ___ artist.",listOf("a","an","the","am"),1),q("What do you do?",listOf("I'm a teacher.","I'm do teacher.","I teacher.","I am do."),0),q("Choose: He is ___ actor.",listOf("a","an","are","am"),1),q("Choose the correct contraction.",listOf("She're","She's","Sheam","She isn't"),1)),
        idioms=listOf(IdiomExpression("Nice to meet you","از آشنایی با شما خوشحالم","Nice to meet you, Sara.","سارا، از آشنایی با تو خوشحالم."),IdiomExpression("And you?","و تو؟","I'm a student. And you?","من دانشجو هستم. و تو؟")),
        pronunciation=listOf(PronunciationTip("A / An","Focus on the sound, not only the spelling."),PronunciationTip("Question rhythm","Stress the important words in What do you do?")),
        culture=listOf(CulturalNote("Asking about work","What do you do? commonly asks about someone's occupation.")),
        mistakes=listOf(CommonMistake("I'm teacher.","I'm a teacher.","A singular occupation normally needs a/an."),CommonMistake("I'm a architect.","I'm an architect.","Architect starts with a vowel sound.")),
        comprehension=listOf(ComprehensionQuestion("What is Emma's job?","She is an architect."),ComprehensionQuestion("Where does Daniel work?","He works in a bank.")),
        speaking=listOf(SpeakingTask("Tell a partner your name and occupation.","نام و شغلت را به یک دوست بگو.","I'm... / I'm a... / I'm an..."),SpeakingTask("Ask three people what they do.","از سه نفر بپرس چه‌کاره هستند.","What do you do?")),
        writing=listOf(WritingTask("Write a short self-introduction.","یک معرفی کوتاه از خودت بنویس.",70,"Name, occupation or student status, and one interest."))
    )

    private fun lesson2() = base(2,"About People","درباره افراد",
        listOf("Identify people","Describe simple personal information","Use possessive adjectives","Ask basic personal questions"),
        listOf(v("friend","دوست","Mina is my friend.","مینا دوست من است."),v("classmate","همکلاسی","Ali is my classmate.","علی همکلاسی من است."),v("name","نام","Her name is Sara.","نام او سارا است."),v("first name","نام کوچک","My first name is Leo.","نام کوچک من لئو است."),v("last name","نام خانوادگی","My last name is Brown.","نام خانوادگی من براون است."),v("nationality","ملیت","What's your nationality?","ملیتت چیست؟"),v("country","کشور","I'm from Canada.","من اهل کانادا هستم."),v("city","شهر","I live in Baku.","من در باکو زندگی می‌کنم."),v("friendly","دوستانه","She is very friendly.","او خیلی خوش‌برخورد است."),v("new","جدید","He's a new student.","او دانش‌آموز جدید است.")),
        listOf(GrammarSection("Possessive adjectives","my, your, his, her show who something belongs to."),GrammarSection("Be questions","Use Is he...? / Is she...? and Are you...? for simple questions."),GrammarSection("Wh- questions","Use What's your name? and Where are you from? for basic information.")),
        listOf(d("A","Is that your classmate?","آیا او همکلاسی توست؟"),d("B","Yes, her name is Lina.","بله، اسمش لینا است."),d("A","Where is she from?","او اهل کجاست؟"),d("B","She's from Turkey.","او اهل ترکیه است."),d("A","Is her first name Lina?","آیا نام کوچکش لینا است؟"),d("B","Yes, it is.","بله."),d("A","And what's her last name?","و نام خانوادگی‌اش چیست؟"),d("B","Her last name is Demir.","نام خانوادگی‌اش دمیر است."),d("A","She's very friendly.","او خیلی خوش‌برخورد است."),d("B","Yes, she is.","بله، همین‌طور است.") ),
        listOf(q("___ name is Tom.",listOf("My","I","Me","Mine"),0),q("Where ___ she from?",listOf("am","is","are","be"),1),q("Choose the possessive adjective for he.",listOf("her","his","your","my"),1),q("What's your last name?",listOf("A city","A family name","A job","A country"),1)),
        pronunciation=listOf(PronunciationTip("His / Her","Keep the final sound clear: his, her."),PronunciationTip("Wh- questions","Give the main information word a little more stress.")),
        culture=listOf(CulturalNote("Names","In many English-speaking settings, first name means given name and last name means family name.")),
        mistakes=listOf(CommonMistake("Her name is Lina? Yes, he is.","Her name is Lina? Yes, she is.","Use she for a female person.")),
        comprehension=listOf(ComprehensionQuestion("Where is Lina from?","She is from Turkey."),ComprehensionQuestion("What is Lina's last name?","Demir.")),
        speaking=listOf(SpeakingTask("Introduce a classmate.","یک همکلاسی را معرفی کن.","This is... / His name is... / Her name is...")),
        writing=listOf(WritingTask("Describe a friend in 70–90 words.","یک دوست را در ۷۰ تا ۹۰ کلمه توصیف کن.",80,"Name, city, nationality, and two simple details."))
    )

    private fun lesson3() = base(3,"Places and How to Get There","مکان‌ها و مسیر رسیدن به آن‌ها",
        listOf("Talk about locations","Ask for simple directions","Name common places","Talk about transportation"),
        listOf(v("bank","بانک","The bank is near the hotel.","بانک نزدیک هتل است."),v("school","مدرسه","The school is on King Street.","مدرسه در خیابان کینگ است."),v("station","ایستگاه","The station is downtown.","ایستگاه در مرکز شهر است."),v("hotel","هتل","The hotel is near the station.","هتل نزدیک ایستگاه است."),v("museum","موزه","The museum is across from the park.","موزه روبه‌روی پارک است."),v("park","پارک","The park is next to the museum.","پارک کنار موزه است."),v("street","خیابان","This street is busy.","این خیابان شلوغ است."),v("near","نزدیک","The café is near here.","کافه نزدیک اینجاست."),v("far","دور","The airport is far from here.","فرودگاه از اینجا دور است."),v("bus","اتوبوس","I take the bus.","من با اتوبوس می‌روم.")),
        listOf(GrammarSection("There is / There are","Use there is for one thing and there are for more than one."),GrammarSection("Prepositions of place","Use near, next to, across from, and between to describe locations."),GrammarSection("Imperatives","Go straight, turn left, and turn right give simple directions.")),
        listOf(d("A","Excuse me. Where is the museum?","ببخشید. موزه کجاست؟"),d("B","It's near the park.","نزدیک پارک است."),d("A","Is it far from here?","از اینجا دور است؟"),d("B","No, it isn't. Go straight.","نه. مستقیم بروید."),d("A","Then what?","بعدش چه؟"),d("B","Turn left at the bank.","کنار بانک به چپ بپیچید."),d("A","Is the museum across from the park?","موزه روبه‌روی پارک است؟"),d("B","Yes, it is.","بله."),d("A","Thank you very much.","خیلی ممنون."),d("B","You're welcome.","خواهش می‌کنم.") ),
        listOf(q("Where is the museum?",listOf("It's near the park.","It's a teacher.","I'm fine.","It's Tuesday."),0),q("___ is a bank near here.",listOf("There","They","He","It"),0),q("Turn ___ at the corner.",listOf("left","name","student","food"),0),q("Which word means نزدیک?",listOf("far","near","between","right"),1)),
        idioms=listOf(IdiomExpression("Excuse me","ببخشید","Excuse me, where is the station?","ببخشید، ایستگاه کجاست.")),
        phrasal=listOf(PhrasalVerb("get to","رسیدن به","رسیدن به یک مکان","How do I get to the station?","چطور به ایستگاه برسم؟","No")),
        pronunciation=listOf(PronunciationTip("Directions","Say turn left and turn right clearly.")),
        culture=listOf(CulturalNote("Polite directions","Excuse me is a common polite opener when asking a stranger for directions.")),
        speaking=listOf(SpeakingTask("Give directions from a school to a café.","از مدرسه تا کافه مسیر بده.","Go straight / turn left / next to / across from.")),
        writing=listOf(WritingTask("Describe how to get from your home to a familiar place.","مسیر خانه تا یک مکان آشنا را توضیح بده.",90,"Use at least four location or direction expressions."))
    )

    private fun lesson4() = base(4,"Family","خانواده",
        listOf("Identify family members","Talk about relatives","Use possessive forms","Describe a simple family"),
        listOf(v("mother","مادر","My mother is a doctor.","مادرم پزشک است."),v("father","پدر","My father works at home.","پدرم در خانه کار می‌کند."),v("sister","خواهر","I have one sister.","من یک خواهر دارم."),v("brother","برادر","My brother is twelve.","برادرم دوازده ساله است."),v("parents","والدین","My parents live nearby.","والدینم نزدیک زندگی می‌کنند."),v("son","پسر","Their son is a student.","پسرشان دانش‌آموز است."),v("daughter","دختر","Their daughter is five.","دخترشان پنج ساله است."),v("husband","شوهر","Her husband is a teacher.","شوهرش معلم است."),v("wife","همسر / زن","His wife is an artist.","همسرش هنرمند است."),v("relative","فامیل","We visit relatives on holidays.","در تعطیلات به دیدن فامیل می‌رویم.")),
        listOf(GrammarSection("Have / has","Use have with I, you, we, they and has with he and she."),GrammarSection("Possessive 's","Use 's to show possession: Sara's brother."),GrammarSection("Family questions","Use Who is...? and How many...? to ask about family.")),
        listOf(d("A","Do you have brothers or sisters?","خواهر یا برادر داری؟"),d("B","Yes, I have one brother and one sister.","بله، یک برادر و یک خواهر دارم."),d("A","How old is your brother?","برادرت چند ساله است؟"),d("B","He's fifteen.","پانزده ساله است."),d("A","And your sister?","و خواهرت؟"),d("B","She's ten.","ده ساله است."),d("A","What does your mother do?","مادرت چه‌کاره است؟"),d("B","She's a teacher.","او معلم است."),d("A","Does your father work nearby?","پدرت نزدیک کار می‌کند؟"),d("B","Yes, he does.","بله.") ),
        listOf(q("I ___ two brothers.",listOf("has","have","am","is"),1),q("Sara's brother means...",listOf("the brother of Sara","Sara is a brother","a brother's Sara","Sara has brother"),0),q("She ___ one sister.",listOf("have","has","are","do"),1),q("___ old is your brother?",listOf("What","Who","How","Where"),2)),
        pronunciation=listOf(PronunciationTip("Family words","Practice the difference between sister and brother.")),
        culture=listOf(CulturalNote("Family terms","English has different everyday words for immediate family and relatives.")),
        mistakes=listOf(CommonMistake("She have two brothers.","She has two brothers.","Use has with he and she.")),
        speaking=listOf(SpeakingTask("Describe your family in five sentences.","خانواده‌ات را در پنج جمله توصیف کن.","I have... / My ... is... / His/Her name is...")),
        writing=listOf(WritingTask("Write about your family.","درباره خانواده‌ات بنویس.",100,"Mention three family members and one detail about each."))
    )

    private fun lesson5() = base(5,"Events and Times","رویدادها و زمان‌ها",
        listOf("Tell the time","Talk about schedules","Ask when an event starts","Talk about birthdays and dates"),
        listOf(v("time","زمان","What time is it?","ساعت چند است؟"),v("morning","صبح","The class is in the morning.","کلاس صبح است."),v("afternoon","بعدازظهر","The meeting is in the afternoon.","جلسه بعدازظهر است."),v("evening","عصر / شب","The movie is in the evening.","فیلم عصر است."),v("today","امروز","The event is today.","رویداد امروز است."),v("tomorrow","فردا","The class is tomorrow.","کلاس فرداست."),v("birthday","تولد","My birthday is in May.","تولد من در ماه مه است."),v("meeting","جلسه","The meeting starts at nine.","جلسه ساعت نه شروع می‌شود."),v("start","شروع شدن","The class starts at eight.","کلاس ساعت هشت شروع می‌شود."),v("finish","تمام شدن","The movie finishes at ten.","فیلم ساعت ده تمام می‌شود.")),
        listOf(GrammarSection("Telling time","Use It's + time: It's three o'clock. It's half past four."),GrammarSection("At / on / in","Use at for clock times, on for days/dates, and in for months and parts of the day."),GrammarSection("Present simple schedules","Use the present simple for fixed schedules: The class starts at nine.")),
        listOf(d("A","What time is the meeting?","جلسه چه ساعتی است؟"),d("B","It's at ten thirty.","ساعت ده و نیم است."),d("A","Is it today?","امروز است؟"),d("B","No, it's tomorrow.","نه، فرداست."),d("A","What time does it start?","چه ساعتی شروع می‌شود؟"),d("B","It starts at ten thirty.","ساعت ده و نیم شروع می‌شود."),d("A","When does it finish?","کی تمام می‌شود؟"),d("B","It finishes at noon.","ظهر تمام می‌شود."),d("A","Great. See you tomorrow.","عالیه. فردا می‌بینمت."),d("B","See you!","می‌بینمت!") ),
        listOf(q("The class starts ___ eight.",listOf("in","on","at","to"),2),q("My birthday is ___ May.",listOf("at","in","on","from"),1),q("What time is it?",listOf("It's Tuesday.","It's three thirty.","It's May.","It's a meeting."),1),q("The meeting is ___ Monday.",listOf("on","in","at","from"),0)),
        pronunciation=listOf(PronunciationTip("Numbers and times","Keep the final sound of thirteen and thirty distinct.")),
        culture=listOf(CulturalNote("Time expressions","English speakers commonly use both digital-style times and expressions such as half past four.")),
        speaking=listOf(SpeakingTask("Ask and answer about three events on a schedule.","درباره سه رویداد در یک برنامه زمانی سؤال و جواب کن.","What time...? / When...? / It starts...")),
        writing=listOf(WritingTask("Write your schedule for one day.","برنامه یک روزت را بنویس.",90,"Include at least five times."))
    )

    private fun lesson6() = base(6,"Clothes","لباس‌ها",
        listOf("Name common clothes","Describe what people are wearing","Use this/that and these/those","Ask about clothing"),
        listOf(v("shirt","پیراهن","He's wearing a blue shirt.","او پیراهن آبی پوشیده است."),v("T-shirt","تی‌شرت","I like this T-shirt.","این تی‌شرت را دوست دارم."),v("jacket","ژاکت / کت","Her jacket is black.","ژاکتش مشکی است."),v("pants","شلوار","These pants are comfortable.","این شلوار راحت است."),v("shoes","کفش","My shoes are new.","کفش‌هایم جدیدند."),v("dress","لباس / پیراهن زنانه","The dress is beautiful.","لباس زیباست."),v("skirt","دامن","She is wearing a skirt.","او دامن پوشیده است."),v("hat","کلاه","His hat is brown.","کلاهش قهوه‌ای است."),v("size","سایز","What size is it?","چه سایزی است؟"),v("color","رنگ","What color is it?","چه رنگی است؟")),
        listOf(GrammarSection("This / That / These / Those","Use this/that for one item and these/those for more than one."),GrammarSection("Present progressive","Use be + verb-ing for clothes and actions happening now: She's wearing a jacket."),GrammarSection("Adjectives","Put common adjectives before nouns: a blue shirt, black shoes.")),
        listOf(d("A","What are you wearing today?","امروز چه پوشیده‌ای؟"),d("B","I'm wearing a blue shirt and black pants.","پیراهن آبی و شلوار مشکی پوشیده‌ام."),d("A","I like that jacket.","آن کت را دوست دارم."),d("B","Thanks. It's my new jacket.","ممنون. کت جدیدم است."),d("A","What color are your shoes?","کفش‌هایت چه رنگی هستند؟"),d("B","They're white.","سفید هستند."),d("A","Are they comfortable?","راحت هستند؟"),d("B","Yes, they are.","بله."),d("A","Where did you get them?","آن‌ها را از کجا گرفتی؟"),d("B","I got them at a small store.","از یک فروشگاه کوچک گرفتم.") ),
        listOf(q("___ shirt is blue.",listOf("These","This","Those","They"),1),q("These ___ are comfortable.",listOf("shoe","shoes","shirt","hat"),1),q("She is ___ a jacket.",listOf("wear","wearing","wears","wore"),1),q("What color ___ your shoes?",listOf("is","am","are","be"),2)),
        pronunciation=listOf(PronunciationTip("Plural clothing words","Shoes and pants are normally plural in everyday English.")),
        culture=listOf(CulturalNote("Clothing questions","What are you wearing? is natural for asking about someone's current clothes.")),
        speaking=listOf(SpeakingTask("Describe your clothes today.","لباس‌های امروزت را توصیف کن.","I'm wearing... / My ... is...")),
        writing=listOf(WritingTask("Describe an outfit you like.","یک لباس یا ست لباسی که دوست داری توصیف کن.",80,"Mention color, type, and why you like it."))
    )

    private fun lesson7() = base(7,"Activities","فعالیت‌ها",
        listOf("Talk about everyday activities","Say what you like to do","Use simple present questions","Talk about free time"),
        listOf(v("exercise","ورزش کردن","I exercise after school.","بعد از مدرسه ورزش می‌کنم.","verb"),v("read","خواندن","I read in the evening.","عصر کتاب می‌خوانم.","verb"),v("watch","تماشا کردن","We watch movies on Fridays.","جمعه‌ها فیلم می‌بینیم.","verb"),v("listen","گوش دادن","I listen to music.","به موسیقی گوش می‌دهم.","verb"),v("cook","آشپزی کردن","My father cooks at home.","پدرم در خانه آشپزی می‌کند.","verb"),v("walk","پیاده‌روی کردن","I walk to school.","پیاده به مدرسه می‌روم.","verb"),v("play","بازی کردن","They play soccer.","آن‌ها فوتبال بازی می‌کنند.","verb"),v("study","درس خواندن","She studies English.","او انگلیسی می‌خواند.","verb"),v("relax","استراحت کردن","I relax on weekends.","آخر هفته استراحت می‌کنم.","verb"),v("weekend","آخر هفته","What do you do on weekends?","آخر هفته‌ها چه کار می‌کنی؟")),
        listOf(GrammarSection("Simple present","Use the simple present for routines and repeated activities."),GrammarSection("Do / Does questions","Use Do with I/you/we/they and Does with he/she/it."),GrammarSection("Frequency words","Use usually, sometimes, and never to describe how often you do something.")),
        listOf(d("A","What do you do after school?","بعد از مدرسه چه کار می‌کنی؟"),d("B","I usually study and exercise.","معمولاً درس می‌خوانم و ورزش می‌کنم."),d("A","Do you watch TV?","تلویزیون تماشا می‌کنی؟"),d("B","Sometimes. I usually watch movies.","گاهی. معمولاً فیلم می‌بینم."),d("A","What about weekends?","آخر هفته‌ها چطور؟"),d("B","I play soccer with my friends.","با دوستانم فوتبال بازی می‌کنم."),d("A","Does your brother play too?","برادرت هم بازی می‌کند؟"),d("B","Yes, he does.","بله."),d("A","Do you cook at home?","در خانه آشپزی می‌کنی؟"),d("B","Yes, sometimes.","بله، گاهی.") ),
        listOf(q("___ you exercise?",listOf("Does","Do","Are","Is"),1),q("She ___ English every day.",listOf("study","studies","studying","studied"),1),q("He ___ watch TV every night.",listOf("don't","doesn't","isn't","not"),1),q("Which word means گاهی؟",listOf("never","usually","sometimes","always"),2)),
        phrasal=listOf(PhrasalVerb("hang out","وقت گذراندن","spend relaxed time with people","I hang out with my friends.","با دوستانم وقت می‌گذرانم.","No")),
        pronunciation=listOf(PronunciationTip("Third-person -s","Listen for the final sound in works, reads, and plays.")),
        culture=listOf(CulturalNote("Free time","People may talk about hobbies and weekend activities as easy conversation topics.")),
        speaking=listOf(SpeakingTask("Talk about your weekday and weekend activities.","درباره فعالیت‌های روزهای عادی و آخر هفته‌ات صحبت کن.","usually / sometimes / never")),
        writing=listOf(WritingTask("Write about your typical day.","درباره یک روز معمولی خودت بنویس.",100,"Use at least five simple-present verbs."))
    )

    private fun lesson8() = base(8,"Home and Neighborhood","خانه و محله",
        listOf("Describe a home","Name rooms and furniture","Describe a neighborhood","Use there is/are"),
        listOf(v("apartment","آپارتمان","I live in an apartment.","من در آپارتمان زندگی می‌کنم."),v("house","خانه","Their house is small.","خانه‌شان کوچک است."),v("kitchen","آشپزخانه","The kitchen is next to the living room.","آشپزخانه کنار اتاق نشیمن است."),v("bedroom","اتاق خواب","My bedroom is upstairs.","اتاق خوابم طبقه بالاست."),v("bathroom","حمام / سرویس","The bathroom is clean.","حمام تمیز است."),v("living room","اتاق نشیمن","We watch TV in the living room.","در اتاق نشیمن تلویزیون می‌بینیم."),v("neighbor","همسایه","Our neighbor is friendly.","همسایه‌مان خوش‌برخورد است."),v("building","ساختمان","The building is new.","ساختمان جدید است."),v("quiet","ساکت","The neighborhood is quiet.","محله ساکت است."),v("busy","شلوغ","The street is busy.","خیابان شلوغ است.")),
        listOf(GrammarSection("There is / There are","Use there is for one item and there are for two or more."),GrammarSection("Prepositions","Use in, on, under, next to, and between to describe where things are."),GrammarSection("Have / has","Use have/has to describe features of a home.")),
        listOf(d("A","Do you live in a house or an apartment?","در خانه زندگی می‌کنی یا آپارتمان؟"),d("B","I live in an apartment.","در آپارتمان زندگی می‌کنم."),d("A","How many bedrooms are there?","چند اتاق خواب وجود دارد؟"),d("B","There are two bedrooms.","دو اتاق خواب وجود دارد."),d("A","Is there a balcony?","بالکن دارد؟"),d("B","Yes, there is.","بله."),d("A","What's your neighborhood like?","محله‌تان چطور است؟"),d("B","It's quiet and friendly.","ساکت و دوستانه است."),d("A","Are there stores nearby?","فروشگاه نزدیک هست؟"),d("B","Yes, there are several stores.","بله، چند فروشگاه هست.") ),
        listOf(q("There ___ two bedrooms.",listOf("is","are","am","be"),1),q("There ___ a balcony.",listOf("are","is","have","do"),1),q("The lamp is ___ the table.",listOf("on","between","at","from"),0),q("A person who lives next to you is your...",listOf("neighbor","student","athlete","customer"),0)),
        pronunciation=listOf(PronunciationTip("There is / There are","Keep the words connected in natural speech.")),
        culture=listOf(CulturalNote("Neighborhood talk","Describing whether an area is quiet, busy, safe, or convenient is common in everyday conversation.")),
        speaking=listOf(SpeakingTask("Describe your home and neighborhood.","خانه و محله‌ات را توصیف کن.","There is... / There are... / next to...")),
        writing=listOf(WritingTask("Describe your home in 100 words.","خانه‌ات را در ۱۰۰ کلمه توصیف کن.",100,"Mention rooms, furniture, and the neighborhood."))
    )

    private fun lesson9() = base(9,"Activities and Plans","فعالیت‌ها و برنامه‌ها",
        listOf("Talk about plans","Make simple arrangements","Use going to for intentions","Use present progressive for arrangements"),
        listOf(v("plan","برنامه","I have a plan for Saturday.","برای شنبه برنامه دارم."),v("visit","دیدار کردن","I'm going to visit my aunt.","می‌خواهم به دیدن خاله‌ام بروم."),v("travel","سفر کردن","We are going to travel next week.","هفته بعد سفر می‌کنیم."),v("meet","ملاقات کردن","I'm meeting Sara at six.","ساعت شش سارا را می‌بینم."),v("tomorrow","فردا","I'm free tomorrow.","فردا آزادم."),v("next week","هفته بعد","We are busy next week.","هفته بعد مشغولیم."),v("free","آزاد","Are you free tonight?","امشب آزادی؟"),v("busy","مشغول","I'm busy on Friday.","جمعه مشغولم."),v("party","مهمانی","There's a party on Saturday.","شنبه مهمانی هست."),v("appointment","قرار","I have an appointment at three.","ساعت سه قرار دارم.")),
        listOf(GrammarSection("Be going to","Use be going to + verb for plans and intentions."),GrammarSection("Present progressive for arrangements","Use am/is/are + verb-ing for planned arrangements: I'm meeting Ali at six."),GrammarSection("Future time expressions","Use tonight, tomorrow, this weekend, and next week.")),
        listOf(d("A","Are you free this weekend?","این آخر هفته آزادی؟"),d("B","Yes. Why?","بله. چرا؟"),d("A","I'm going to visit the new museum.","می‌خواهم از موزه جدید دیدن کنم."),d("B","That sounds good.","خوب به نظر می‌رسد."),d("A","Do you want to come?","می‌خواهی بیایی؟"),d("B","Sure. What time?","حتماً. چه ساعتی؟"),d("A","I'm meeting my sister at two.","ساعت دو خواهرم را می‌بینم."),d("B","How about four?","ساعت چهار چطور؟"),d("A","Four is perfect.","چهار عالی است."),d("B","Great. See you Saturday.","عالیه. شنبه می‌بینمت.") ),
        listOf(q("I'm ___ visit my aunt.",listOf("going to","go","going","to going"),0),q("I'm ___ Sara at six.",listOf("meet","meeting","meets","met"),1),q("Are you free tomorrow?",listOf("Yes, I am.","Yes, I do.","Yes, I can.","Yes, I have."),0),q("Which is a future time expression?",listOf("yesterday","last year","next week","two days ago"),2)),
        idioms=listOf(IdiomExpression("Sounds good","خوب به نظر می‌رسد","Let's meet at six. Sounds good.","ساعت شش همدیگر را ببینیم. خوبه.")),
        pronunciation=listOf(PronunciationTip("Going to","In natural speech, going to is often reduced, but beginners should first practice the full form clearly.")),
        culture=listOf(CulturalNote("Making plans","It is common to suggest a time and then confirm whether the other person is available.")),
        speaking=listOf(SpeakingTask("Make a weekend plan with a partner.","با یک دوست برای آخر هفته برنامه بگذار.","Are you free...? / I'm going to... / How about...?")),
        writing=listOf(WritingTask("Write your plan for next weekend.","برنامه آخر هفته آینده‌ات را بنویس.",100,"Include three planned activities and times."))
    )

    private fun lesson10() = base(10,"Food","غذا",
        listOf("Name common foods","Order simple food","Talk about likes and dislikes","Use count and non-count food words"),
        listOf(v("bread","نان","I eat bread for breakfast.","برای صبحانه نان می‌خورم."),v("rice","برنج","We have rice for lunch.","برای ناهار برنج داریم."),v("chicken","مرغ","I'd like chicken.","مرغ می‌خواهم."),v("salad","سالاد","The salad is fresh.","سالاد تازه است."),v("soup","سوپ","I'd like some soup.","کمی سوپ می‌خواهم."),v("water","آب","Can I have some water?","می‌توانم کمی آب داشته باشم؟"),v("coffee","قهوه","I drink coffee in the morning.","صبح قهوه می‌نوشم."),v("sandwich","ساندویچ","I'll have a sandwich.","یک ساندویچ می‌خواهم."),v("menu","منو","Can I see the menu?","می‌توانم منو را ببینم؟"),v("order","سفارش","Are you ready to order?","آماده سفارش دادن هستید؟")),
        listOf(GrammarSection("Count / non-count nouns","Use a/an with singular count nouns and some with many non-count foods."),GrammarSection("Would like","Use I'd like as a polite way to order or request food."),GrammarSection("Some / any","Use some in many affirmative offers and requests, and any in many questions and negatives.")),
        listOf(d("A","Are you ready to order?","آماده سفارش دادن هستید؟"),d("B","Yes. I'd like a sandwich, please.","بله. لطفاً یک ساندویچ می‌خواهم."),d("A","Would you like soup?","سوپ می‌خواهید؟"),d("B","Yes, some soup, please.","بله، لطفاً کمی سوپ."),d("A","Anything to drink?","نوشیدنی هم می‌خواهید؟"),d("B","Some water, please.","لطفاً کمی آب."),d("A","Would you like coffee?","قهوه می‌خواهید؟"),d("B","No, thank you.","نه، ممنون."),d("A","Anything else?","چیز دیگری؟"),d("B","No, that's all. Thank you.","نه، همین. ممنون.") ),
        listOf(q("I'd like ___ sandwich.",listOf("a","some","any","an"),0),q("I'd like ___ water.",listOf("a","an","some","many"),2),q("A polite way to order is...",listOf("Give food.","I'd like...","Food now.","I want food."),1),q("Can I see the ___?",listOf("menu","neighbor","street","schedule"),0)),
        pronunciation=listOf(PronunciationTip("I'd like","Practice the contraction smoothly: I'd like...")),
        culture=listOf(CulturalNote("Ordering politely","I'd like..., please is a common polite pattern in cafés and restaurants.")),
        speaking=listOf(SpeakingTask("Role-play a restaurant order.","نقش مشتری و گارسون را بازی کنید.","I'd like... / Would you like...? / Anything else?")),
        writing=listOf(WritingTask("Write a short restaurant dialogue.","یک گفت‌وگوی کوتاه در رستوران بنویس.",100,"Include an order, a drink, and a polite response."))
    )

    private fun lesson11() = base(11,"Past Events","رویدادهای گذشته",
        listOf("Talk about yesterday","Describe simple past events","Use was/were","Use common past verbs"),
        listOf(v("yesterday","دیروز","I was busy yesterday.","دیروز مشغول بودم."),v("last night","دیشب","We watched a movie last night.","دیشب فیلم دیدیم."),v("visited","دیدار کرد","I visited my aunt.","به دیدن خاله‌ام رفتم."),v("watched","تماشا کرد","She watched TV.","او تلویزیون تماشا کرد."),v("played","بازی کرد","They played soccer.","آن‌ها فوتبال بازی کردند."),v("went","رفت","We went to the park.","به پارک رفتیم."),v("ate","خورد","I ate lunch at one.","ساعت یک ناهار خوردم."),v("saw","دید","I saw an old friend.","یک دوست قدیمی را دیدم."),v("had","داشت","We had a good time.","اوقات خوبی داشتیم."),v("stayed","ماند","I stayed home.","در خانه ماندم.")),
        listOf(GrammarSection("Was / were","Use was with I/he/she/it and were with you/we/they."),GrammarSection("Simple past regular verbs","Many regular verbs form the past with -ed: watched, visited, played."),GrammarSection("Common irregular verbs","Learn useful forms such as go/went, eat/ate, see/saw, have/had.")),
        listOf(d("A","What did you do yesterday?","دیروز چه کار کردی؟"),d("B","I visited my aunt.","به دیدن خاله‌ام رفتم."),d("A","Did you go anywhere after that?","بعد از آن جایی رفتی؟"),d("B","Yes. We went to a café.","بله. به یک کافه رفتیم."),d("A","What did you have?","چه چیزی خوردید؟"),d("B","I had coffee and a sandwich.","قهوه و ساندویچ خوردم."),d("A","Was it good?","خوب بود؟"),d("B","Yes, it was great.","بله، عالی بود."),d("A","What time did you go home?","چه ساعتی به خانه رفتی؟"),d("B","We went home at nine.","ساعت نه به خانه رفتیم.") ),
        listOf(q("Yesterday I ___ to the park.",listOf("go","went","going","goes"),1),q("She ___ TV last night.",listOf("watch","watches","watched","watching"),2),q("___ you go out yesterday?",listOf("Did","Do","Are","Were"),0),q("I ___ at home yesterday.",listOf("was","were","am","be"),0)),
        idioms=listOf(IdiomExpression("Have a good time","خوش گذراندن","We had a good time yesterday.","دیروز خیلی خوش گذشت.")),
        pronunciation=listOf(PronunciationTip("-ed endings","The -ed ending can have different sounds; focus first on saying regular past verbs clearly.")),
        culture=listOf(CulturalNote("Talking about yesterday","Simple past questions are common in casual conversations about recent experiences.")),
        mistakes=listOf(CommonMistake("Did you went?","Did you go?","After did, use the base form of the verb.")),
        speaking=listOf(SpeakingTask("Tell a partner three things you did yesterday.","سه کاری را که دیروز انجام دادی تعریف کن.","I went... / I watched... / I had...")),
        writing=listOf(WritingTask("Write about yesterday.","درباره روز گذشته‌ات بنویس.",120,"Use at least five past-tense verbs."))
    )

    private fun lesson12() = base(12,"Appearance and Health","ظاهر و سلامتی",
        listOf("Describe simple appearance","Talk about basic health","Use have/has for symptoms","Give simple advice"),
        listOf(v("tall","قدبلند","He is tall.","او قدبلند است.","adjective"),v("short","کوتاه قد","She is short.","او کوتاه قد است.","adjective"),v("young","جوان","He looks young.","او جوان به نظر می‌رسد.","adjective"),v("old","پیر / مسن","My grandfather is old.","پدربزرگم مسن است.","adjective"),v("hair","مو","She has long hair.","او موهای بلندی دارد."),v("eyes","چشم‌ها","He has brown eyes.","او چشم‌های قهوه‌ای دارد."),v("headache","سردرد","I have a headache.","سردرد دارم."),v("cough","سرفه","He has a cough.","او سرفه دارد."),v("tired","خسته","I'm tired today.","امروز خسته‌ام.","adjective"),v("healthy","سالم","She is healthy.","او سالم است.","adjective")),
        listOf(GrammarSection("Have / has for symptoms","Use I have, he has, and she has for common symptoms: I have a headache."),GrammarSection("Be + adjective","Use be with adjectives: I'm tired. He's tall."),GrammarSection("Simple advice","Use You should... for basic health advice.")),
        listOf(d("A","You look tired. Are you okay?","خسته به نظر می‌رسی. خوبی؟"),d("B","I have a headache.","سردرد دارم."),d("A","Do you have a cough?","سرفه هم داری؟"),d("B","No, I don't.","نه."),d("A","You should get some rest.","باید کمی استراحت کنی."),d("B","Good idea.","فکر خوبی است."),d("A","By the way, your brother is tall.","راستی، برادرت قدبلند است."),d("B","Yes, and he has brown eyes.","بله، چشم‌های قهوه‌ای دارد."),d("A","Does he play sports?","ورزش می‌کند؟"),d("B","Yes, he does.","بله.") ),
        listOf(q("I have a ___.",listOf("headache","tall","young","eyes"),0),q("He ___ brown eyes.",listOf("have","has","is","are"),1),q("You look ___.",listOf("tired","headache","eyes","cough"),0),q("For simple advice: You ___ rest.",listOf("should","are","has","do"),0)),
        pronunciation=listOf(PronunciationTip("Health words","Practice the /θ/ sound in healthy and headache carefully.")),
        culture=listOf(CulturalNote("Showing concern","You look tired. Are you okay? is a common friendly way to show concern.")),
        speaking=listOf(SpeakingTask("Describe someone's appearance using three adjectives and two details.","ظاهر یک نفر را با سه صفت و دو جزئیات توصیف کن.","He/She is... / has..."),SpeakingTask("Practice a short health conversation.","یک گفت‌وگوی کوتاه درباره حال جسمی تمرین کن.","I have... / You should...")),
        writing=listOf(WritingTask("Write a short dialogue between two friends about feeling tired.","یک گفت‌وگوی کوتاه بین دو دوست درباره خستگی بنویس.",100,"Include a symptom and one piece of advice."))
    )

    private fun lesson13() = base(13,"Abilities and Requests","توانایی‌ها و درخواست‌ها",
        listOf("Talk about abilities","Ask for help","Make simple requests","Use can and can't"),
        listOf(v("can","توانستن","I can swim.","می‌توانم شنا کنم.","modal"),v("can't","نمی‌توانستن","I can't drive.","نمی‌توانم رانندگی کنم.","modal"),v("swim","شنا کردن","Can you swim?","می‌توانی شنا کنی؟","verb"),v("drive","رانندگی کردن","She can drive.","او می‌تواند رانندگی کند.","verb"),v("cook","آشپزی کردن","I can cook.","می‌توانم آشپزی کنم.","verb"),v("help","کمک کردن","Can you help me?","می‌توانی کمکم کنی؟","verb"),v("open","باز کردن","Can you open the door?","می‌توانی در را باز کنی؟","verb"),v("carry","حمل کردن","Can you carry this box?","می‌توانی این جعبه را حمل کنی؟","verb"),v("repeat","تکرار کردن","Can you repeat that?","می‌توانی آن را تکرار کنی؟","verb"),v("understand","متوجه شدن","I don't understand.","متوجه نمی‌شوم.","verb")),
        listOf(GrammarSection("Can for ability","Use can + base verb: I can swim. She can cook."),GrammarSection("Can for requests","Can you help me? is a common simple request."),GrammarSection("Can't","Use can't + base verb to say you are unable to do something.")),
        listOf(d("A","Can you help me with this box?","می‌توانی در مورد این جعبه کمکم کنی؟"),d("B","Sure. What do you need?","حتماً. چه کمکی لازم داری؟"),d("A","Can you carry it to the door?","می‌توانی آن را تا در ببری؟"),d("B","Yes, I can.","بله، می‌توانم."),d("A","Thanks a lot.","خیلی ممنون."),d("B","You're welcome.","خواهش می‌کنم."),d("A","By the way, can you drive?","راستی، می‌توانی رانندگی کنی؟"),d("B","Yes, I can, but I can't drive at night.","بله، ولی شب نمی‌توانم رانندگی کنم."),d("A","Can you show me how to do this?","می‌توانی نشانم بدهی چطور این کار را انجام دهم؟"),d("B","Of course.","حتماً.") ),
        listOf(q("I ___ swim.",listOf("can","am","do","have"),0),q("___ you help me?",listOf("Are","Can","Do","Have"),1),q("After can, use...",listOf("to + verb","verb-ing","base verb","past verb"),2),q("I can't drive means...",listOf("I drive well","I am not able to drive","I want to drive","I drove yesterday"),1)),
        idioms=listOf(IdiomExpression("Sure","حتماً","Can you help me? Sure.","می‌توانی کمکم کنی؟ حتماً."),IdiomExpression("Of course","البته / حتماً","Can you repeat that? Of course.","می‌توانی تکرار کنی؟ حتماً.")),
        pronunciation=listOf(PronunciationTip("Can / can't","In short answers, make the difference between can and can't clear.")),
        culture=listOf(CulturalNote("Polite requests","Adding please can make a simple request sound more polite: Can you help me, please?")),
        speaking=listOf(SpeakingTask("Tell a partner three things you can do and two things you can't do.","سه کاری که می‌توانی و دو کاری که نمی‌توانی انجام دهی بگو.","I can... / I can't..."),SpeakingTask("Practice asking for help politely.","درخواست کمک مؤدبانه را تمرین کن.","Can you..., please?")),
        writing=listOf(WritingTask("Write a short list of abilities and requests.","یک متن کوتاه درباره توانایی‌ها و درخواست‌هایت بنویس.",90,"Use can, can't, and at least two requests."))
    )

    private fun lesson14() = base(14,"Life Events and Plans","رویدادهای زندگی و برنامه‌ها",
        listOf("Talk about important life events","Describe past and future plans","Use simple past and future expressions","Talk about goals"),
        listOf(v("graduate","فارغ‌التحصیل شدن","I graduated last year.","سال گذشته فارغ‌التحصیل شدم.","verb"),v("start","شروع کردن","I started a new job.","یک شغل جدید شروع کردم.","verb"),v("move","اسباب‌کشی کردن","We moved to a new city.","به شهر جدیدی نقل مکان کردیم.","verb"),v("learn","یاد گرفتن","I want to learn English.","می‌خواهم انگلیسی یاد بگیرم.","verb"),v("travel","سفر کردن","I'd like to travel next year.","دوست دارم سال آینده سفر کنم.","verb"),v("goal","هدف","My goal is to speak English well.","هدفم این است که خوب انگلیسی صحبت کنم."),v("dream","رویا","My dream is to study abroad.","رویای من تحصیل در خارج است."),v("future","آینده","What are your plans for the future?","برنامه‌هایت برای آینده چیست؟"),v("next year","سال آینده","I'm going to study next year.","سال آینده می‌خواهم درس بخوانم."),v("plan","برنامه","I have a plan for next year.","برای سال آینده برنامه دارم.")),
        listOf(GrammarSection("Past and future together","Use past forms for completed events and going to/will for future plans or predictions."),GrammarSection("Want / would like + to","Use want to and would like to before a base verb: I want to travel."),GrammarSection("Because","Use because to give a simple reason: I want to study because I enjoy learning.")),
        listOf(d("A","What did you do after school?","بعد از مدرسه چه کار کردی؟"),d("B","I started working at a small company.","در یک شرکت کوچک شروع به کار کردم."),d("A","That's great. What are your plans now?","عالیه. حالا برنامه‌هایت چیست؟"),d("B","I'm going to improve my English.","می‌خواهم انگلیسی‌ام را بهتر کنم."),d("A","Why do you want to improve it?","چرا می‌خواهی بهترش کنی؟"),d("B","Because I want to travel and meet new people.","چون می‌خواهم سفر کنم و افراد جدیدی ببینم."),d("A","What's your goal for next year?","هدفت برای سال آینده چیست؟"),d("B","I'd like to take an English course.","دوست دارم در یک دوره انگلیسی شرکت کنم."),d("A","That sounds like a good plan.","به نظر برنامه خوبی می‌آید."),d("B","Thanks. I hope it works out.","ممنون. امیدوارم خوب پیش برود.") ),
        listOf(q("I ___ a new job last year.",listOf("start","started","starting","am start"),1),q("I'm ___ improve my English.",listOf("going to","go","going","to going"),0),q("I want ___ travel.",listOf("to","for","at","on"),0),q("Why? — ___ I want to learn.",listOf("But","Because","And","Or"),1)),
        idioms=listOf(IdiomExpression("work out","خوب پیش رفتن","I hope your plan works out.","امیدوارم برنامه‌ات خوب پیش برود."),IdiomExpression("Sounds like a good plan","به نظر برنامه خوبی می‌آید","Let's study together. Sounds like a good plan.","با هم درس بخوانیم. به نظر برنامه خوبی می‌آید.")),
        phrasal=listOf(PhrasalVerb("work out","خوب پیش رفتن","end successfully","I hope everything works out.","امیدوارم همه چیز خوب پیش برود.","No")),
        pronunciation=listOf(PronunciationTip("Future rhythm","Stress the main future verb: I'm GOING to study.")),
        culture=listOf(CulturalNote("Talking about goals","Simple questions about plans and goals are common when people get to know each other.")),
        mistakes=listOf(CommonMistake("I want travel.","I want to travel.","Use to before the base verb after want.")),
        comprehension=listOf(ComprehensionQuestion("What did the speaker start?","A new job."),ComprehensionQuestion("What is the future goal?","To improve English and take an English course.")),
        speaking=listOf(SpeakingTask("Talk about one past event and two future plans.","درباره یک رویداد گذشته و دو برنامه آینده صحبت کن.","Last year... / I'm going to... / I'd like to..."),SpeakingTask("Ask a partner about a future goal.","درباره هدف آینده یک دوست سؤال کن.","What's your goal? / Why?")),
        writing=listOf(WritingTask("Write about one important past event and your plans for next year.","درباره یک رویداد مهم گذشته و برنامه‌هایت برای سال آینده بنویس.",130,"Use past verbs, going to/would like to, and because."))
    )
}
