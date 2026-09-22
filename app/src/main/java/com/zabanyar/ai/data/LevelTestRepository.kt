package com.zabanyar.ai.data

data class LevelQuestion(
    val id: Int,
    val question: String,
    val options: List<String>,
    val correctIndex: Int,
    val level: String
)

object LevelTestRepository {

    // بانک سوالات (۳۰ سوال - هر بار ۲۰ تاش به صورت تصادفی انتخاب میشه)
    private val allQuestionsBank: List<LevelQuestion> = listOf(
        // ==================== مبتدی ====================
        LevelQuestion(1, "کدام درست است؟",
            listOf("I'm a engineer.", "I'm an engineer.", "I'm engineer.", "I engineer."),
            1, "مبتدی"),
        LevelQuestion(2, "معنی «What do you do?» چیست؟",
            listOf("کجایی؟", "چیکار می‌کنی؟", "شغلت چیه؟", "چطوری؟"),
            2, "مبتدی"),
        LevelQuestion(3, "جمع «child» کدام است؟",
            listOf("childs", "childes", "children", "childrens"),
            2, "مبتدی"),
        LevelQuestion(4, "کدام درست است؟",
            listOf("She is a doctor.", "She are a doctor.", "She a doctor.", "She doctor."),
            0, "مبتدی"),
        LevelQuestion(5, "معنی «Brother» چیست؟",
            listOf("خواهر", "برادر", "پدر", "پسر"),
            1, "مبتدی"),
        LevelQuestion(6, "«in the morning» یعنی چه؟",
            listOf("صبح", "عصر", "شب", "بعدازظهر"),
            0, "مبتدی"),
        LevelQuestion(7, "کدام درست است؟",
            listOf("There is two books.", "There are two books.", "There have two books.", "There has two."),
            1, "مبتدی"),
        LevelQuestion(8, "معنی «What time is it?» چیست؟",
            listOf("چه روزیه؟", "کجایی؟", "ساعت چنده؟", "چطوری؟"),
            2, "مبتدی"),
        LevelQuestion(9, "کدام درست است؟",
            listOf("He is a teacher.", "He are a teacher.", "He am a teacher.", "He be a teacher."),
            0, "مبتدی"),
        LevelQuestion(10, "معنی «Thank you» چیست؟",
            listOf("لطفاً", "ممنون", "ببخشید", "خداحافظ"),
            1, "مبتدی"),

        // ==================== متوسط ====================
        LevelQuestion(11, "کدام درست است؟",
            listOf("I've known him since 2 years.", "I've known him for 2 years.", "I know him since 2 years.", "I knowing him for 2 years."),
            1, "متوسط"),
        LevelQuestion(12, "صفت تفضیلی «good» کدام است؟",
            listOf("gooder", "more good", "better", "best"),
            2, "متوسط"),
        LevelQuestion(13, "کدام درست است؟",
            listOf("I'm interested in watch.", "I'm interested in watching.", "I'm interested to watching.", "I'm interested watching."),
            1, "متوسط"),
        LevelQuestion(14, "معنی «Luggage» چیست؟",
            listOf("پاسپورت", "چمدان", "بلیط", "مقصد"),
            1, "متوسط"),
        LevelQuestion(15, "«Should have» یعنی چه؟",
            listOf("باید بکنم", "باید می‌کردم", "می‌توانستم", "می‌خواهم"),
            1, "متوسط"),
        LevelQuestion(16, "کدام درست است؟",
            listOf("This shirt is too small.", "This shirt is small too.", "This shirt is very too small.", "This shirt is much small."),
            0, "متوسط"),
        LevelQuestion(17, "پاسخ مؤدبانه به «Would you like coffee?» کدام است؟",
            listOf("Yes, I want.", "Yes, I'd like to.", "Yes, please.", "Give me."),
            2, "متوسط"),
        LevelQuestion(18, "معنی «Work-life balance» چیست؟",
            listOf("کار تمام وقت", "تعادل کار و زندگی", "استراحت", "تعطیلات"),
            1, "متوسط"),
        LevelQuestion(19, "کدام درست است؟",
            listOf("If I was you, I would go.", "If I were you, I would go.", "If I am you, I would go.", "If I be you, I would go."),
            1, "متوسط"),
        LevelQuestion(20, "معنی «Achieve» چیست؟",
            listOf("شکست خوردن", "دست یافتن", "خسته شدن", "شروع کردن"),
            1, "متوسط"),

        // ==================== پیشرفته ====================
        LevelQuestion(21, "ساختار شرطی نوع سوم کدام است؟",
            listOf("If + present, will + verb", "If + past, would + verb", "If + had + p.p., would have + p.p.", "If + present, would + verb"),
            2, "پیشرفته"),
        LevelQuestion(22, "کدام مجهول درست است؟",
            listOf("Nowruz celebrated in Iran.", "Nowruz is celebrated in Iran.", "Nowruz is celebrate in Iran.", "Nowruz celebrating in Iran."),
            1, "پیشرفته"),
        LevelQuestion(23, "«I wish I had studied harder» یعنی چه؟",
            listOf("کاش سخت‌تر درس می‌خوندم (گذشته)", "کاش سخت‌تر درس بخونم (حال)", "سخت درس می‌خونم", "درس نمی‌خونم"),
            0, "پیشرفته"),
        LevelQuestion(24, "معنی «Entrepreneur» چیست؟",
            listOf("کارمند", "کارآفرین", "مدیر", "فریلنسر"),
            1, "پیشرفته"),
        LevelQuestion(25, "کدام cleft sentence درست است؟",
            listOf("It challenges that make us stronger.", "It is challenges that make us stronger.", "Challenges is that make us stronger.", "It that challenges make us stronger."),
            1, "پیشرفته"),
        LevelQuestion(26, "«can't be» یعنی چه؟",
            listOf("قطعاً هست", "ممکنه باشه", "غیرممکنه باشه", "باید باشه"),
            2, "پیشرفته"),
        LevelQuestion(27, "معنی «Resilience» چیست؟",
            listOf("ضعف", "تاب‌آوری", "ترس", "خستگی"),
            1, "پیشرفته"),
        LevelQuestion(28, "«whose» برای چه استفاده می‌شود؟",
            listOf("افراد", "اشیا", "مالکیت", "زمان"),
            2, "پیشرفته"),
        LevelQuestion(29, "کدام درست است؟",
            listOf("Hardly had I arrived when the phone rang.", "Hardly I had arrived when the phone rang.", "Hardly had I arrived than the phone rang.", "Hardly I arrived when the phone rang."),
            0, "پیشرفته"),
        LevelQuestion(30, "معنی «Sophisticated» چیست؟",
            listOf("ساده", "پیچیده", "ارزان", "قدیمی"),
            1, "پیشرفته")
    )

    // ==================== گرفتن ۲۰ سوال تصادفی ====================
    fun getRandomQuestions(count: Int = 20): List<LevelQuestion> {
        return allQuestionsBank.shuffled().take(count)
    }

    // ==================== گرفتن همه سوالات (برای دیباگ) ====================
    fun getAllQuestions(): List<LevelQuestion> = allQuestionsBank

    fun getQuestionsByLevel(level: String): List<LevelQuestion> =
        allQuestionsBank.filter { it.level == level }

    // ==================== محاسبه سطح ====================
    fun calculateLevel(score: Int, total: Int): String {
        val percentage = if (total > 0) (score.toFloat() / total * 100).toInt() else 0
        return when {
            percentage >= 75 -> "ADVANCED"
            percentage >= 45 -> "INTERMEDIATE"
            else -> "BEGINNER"
        }
    }

    fun getLevelPersian(level: String): String = when (level) {
        "BEGINNER" -> "🌱 مبتدی"
        "INTERMEDIATE" -> "🚀 متوسط"
        "ADVANCED" -> "🏆 پیشرفته"
        else -> "🌱 مبتدی"
    }
}