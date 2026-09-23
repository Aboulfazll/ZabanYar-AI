package com.zabanyar.ai.data

data class DailySentence(
    val id: Int,
    val english: String,
    val persian: String,
    val category: String,
    val categoryEmoji: String = "💬"
)

object DailySentencesRepository {

    private val sentences = listOf(
        DailySentence(1, "How are you doing?", "حالت چطوره؟", "احوال‌پرسی", "👋"),
        DailySentence(2, "What's up?", "چه خبر؟", "احوال‌پرسی", "👋"),
        DailySentence(3, "Long time no see!", "خیلی وقته ندیدمت!", "احوال‌پرسی", "👋"),
        DailySentence(4, "How's it going?", "چطور پیش می‌ره؟", "احوال‌پرسی", "👋"),
        DailySentence(5, "Nice to meet you.", "از آشنایی با شما خوشحالم.", "معرفی", "🤝"),
        DailySentence(6, "What do you do?", "شغلت چیه؟", "معرفی", "🤝"),
        DailySentence(7, "Where are you from?", "اهل کجایی؟", "معرفی", "🤝"),
        DailySentence(8, "See you later.", "بعداً می‌بینمت.", "خداحافظی", "👋"),
        DailySentence(9, "Take care.", "مراقب خودت باش.", "خداحافظی", "👋"),
        DailySentence(10, "Have a nice day.", "روز خوبی داشته باشی.", "خداحافظی", "👋"),
        DailySentence(11, "Thanks a lot.", "خیلی ممنون.", "تشکر", "🙏"),
        DailySentence(12, "I really appreciate it.", "واقعاً قدردانی می‌کنم.", "تشکر", "🙏"),
        DailySentence(13, "You're welcome.", "خواهش می‌کنم.", "تشکر", "🙏"),
        DailySentence(14, "No problem.", "مشکلی نیست.", "تشکر", "🙏"),
        DailySentence(15, "I'm sorry.", "متأسفم.", "عذرخواهی", "😔"),
        DailySentence(16, "Excuse me.", "ببخشید.", "عذرخواهی", "😔"),
        DailySentence(17, "It was my fault.", "تقصیر من بود.", "عذرخواهی", "😔"),
        DailySentence(18, "Could you help me?", "می‌تونی کمکم کنی؟", "درخواست", "🙋"),
        DailySentence(19, "Can I ask you something?", "می‌تونم چیزی بپرسم؟", "درخواست", "🙋"),
        DailySentence(20, "Would you mind...?", "اشکالی نداره اگه...؟", "درخواست", "🙋"),
        DailySentence(21, "What do you think?", "نظرت چیه؟", "نظر", "💭"),
        DailySentence(22, "I agree with you.", "موافقم.", "نظر", "💭"),
        DailySentence(23, "I don't think so.", "فکر نمی‌کنم.", "نظر", "💭"),
        DailySentence(24, "That's a good point.", "نکته خوبیه.", "نظر", "💭"),
        DailySentence(25, "Let me think about it.", "بگذار فکر کنم.", "نظر", "💭"),
        DailySentence(26, "I'm not sure.", "مطمئن نیستم.", "نظر", "💭"),
        DailySentence(27, "Sounds good to me.", "خوبه به نظر من.", "نظر", "💭"),
        DailySentence(28, "I'll let you know.", "خبرت می‌کنم.", "نظر", "💭"),
        DailySentence(29, "That makes sense.", "منطقیه.", "نظر", "💭"),
        DailySentence(30, "Let's do it.", "بیا انجامش بدیم.", "پیشنهاد", "✨"),
        DailySentence(31, "How about we...?", "چطوره که...؟", "پیشنهاد", "✨"),
        DailySentence(32, "Sounds like a plan.", "به نظر برنامه خوبی میاد.", "پیشنهاد", "✨"),
        DailySentence(33, "I'd love to.", "خیلی دوست دارم.", "پیشنهاد", "✨"),
        DailySentence(34, "Maybe another time.", "شاید یه وقت دیگه.", "پیشنهاد", "✨"),
        DailySentence(35, "I'm on my way.", "دارم میام.", "روزمره", "🚶"),
        DailySentence(36, "I'm running late.", "دارم دیر می‌کنم.", "روزمره", "🚶"),
        DailySentence(37, "Give me a minute.", "یه دقیقه صبر کن.", "روزمره", "🚶"),
        DailySentence(38, "I'm starving.", "دارم از گشنگی می‌میرم.", "روزمره", "🍽️"),
        DailySentence(39, "I'm exhausted.", "خیلی خسته‌ام.", "روزمره", "😴"),
        DailySentence(40, "I could use a break.", "به یه استراحت نیاز دارم.", "روزمره", "☕")
    )

    fun getAllSentences(): List<DailySentence> = sentences

    fun getCategories(): List<String> {
        return listOf("همه") + sentences.map { it.category }.distinct()
    }

    fun getSentencesByCategory(category: String): List<DailySentence> {
        return if (category == "همه") sentences
        else sentences.filter { it.category == category }
    }

    fun searchSentences(query: String): List<DailySentence> {
        if (query.isEmpty()) return sentences
        return sentences.filter {
            it.english.contains(query, ignoreCase = true) ||
            it.persian.contains(query)
        }
    }
}