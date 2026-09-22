package com.zabanyar.ai.data

data class DailySentence(
    val id: Int,
    val english: String,
    val persian: String,
    val category: String,
    val categoryEmoji: String,
    val pronunciation: String = ""
)

object DailySentencesRepository {

    fun getAllSentences(): List<DailySentence> = listOf(
        DailySentence(1, "How are you doing today?", "امروز حالت چطوره؟", "مکالمه", "💬"),
        DailySentence(2, "What's up?", "چه خبر؟", "مکالمه", "💬"),
        DailySentence(3, "Long time no see!", "خیلی وقت‌ه ندیدمت!", "مکالمه", "💬"),
        DailySentence(4, "Could you please help me?", "می‌تونی لطفاً کمکم کنی؟", "مکالمه", "💬"),
        DailySentence(5, "I'm just kidding.", "شوخی می‌کنم.", "مکالمه", "💬"),
        DailySentence(6, "That sounds great!", "به نظر عالی میاد!", "مکالمه", "💬"),
        DailySentence(7, "I couldn't agree more.", "کاملاً موافقم.", "مکالمه", "💬"),
        DailySentence(8, "Let me think about it.", "بذار در موردش فکر کنم.", "مکالمه", "💬"),

        DailySentence(9, "How much does this cost?", "این چقدر هزینه داره؟", "خرید", "🛒"),
        DailySentence(10, "Can I try it on?", "می‌تونم امتحانش کنم؟", "خرید", "🛒"),
        DailySentence(11, "Do you accept credit cards?", "کارت اعتباری قبول می‌کنید؟", "خرید", "🛒"),
        DailySentence(12, "I'd like to order, please.", "می‌خوام سفارش بدم، لطفاً.", "رستوران", "🍽️"),
        DailySentence(13, "Could I have the bill, please?", "می‌تونم صورت‌حساب رو بگیرم؟", "رستوران", "🍽️"),
        DailySentence(14, "What do you recommend?", "چی پیشنهاد می‌کنید؟", "رستوران", "🍽️"),

        DailySentence(15, "Where is the nearest metro station?", "نزدیک‌ترین ایستگاه مترو کجاست؟", "سفر", "✈️"),
        DailySentence(16, "I'd like to book a room.", "می‌خوام یه اتاق رزرو کنم.", "سفر", "✈️"),
        DailySentence(17, "How long does it take?", "چقدر طول می‌کشه؟", "سفر", "✈️"),
        DailySentence(18, "Can you take a photo of us?", "می‌تونی از ما عکس بگیری؟", "سفر", "✈️"),

        DailySentence(19, "Could we schedule a meeting?", "می‌تونیم یه جلسه بذاریم؟", "کار", "💼"),
        DailySentence(20, "I'll send you the report by tomorrow.", "گزارش رو تا فردا برات می‌فرستم.", "کار", "💼"),
        DailySentence(21, "I'm running a bit late.", "یه کم دیر می‌رسم.", "کار", "💼"),
        DailySentence(22, "Let me get back to you on that.", "بذار در موردش بهت خبر بدم.", "کار", "💼"),

        DailySentence(23, "I'm so happy for you!", "خیلی برات خوشحالم!", "احساسات", "❤️"),
        DailySentence(24, "I'm feeling a bit under the weather.", "یه کم حالم خوب نیست.", "احساسات", "❤️"),
        DailySentence(25, "That's amazing!", "فوق‌العاده‌ست!", "احساسات", "❤️"),
        DailySentence(26, "Don't worry, everything will be fine.", "نگران نباش، همه چی خوب میشه.", "احساسات", "❤️"),

        DailySentence(27, "Can you explain this again?", "می‌تونی این رو دوباره توضیح بدی؟", "درسی", "🎓"),
        DailySentence(28, "I have a question about this topic.", "یه سؤال در مورد این موضوع دارم.", "درسی", "🎓"),
        DailySentence(29, "I didn't understand that part.", "اون بخش رو متوجه نشدم.", "درسی", "🎓"),
        DailySentence(30, "Could you speak more slowly, please?", "می‌تونی آهسته‌تر صحبت کنی؟", "درسی", "🎓")
    )

    fun getSentencesByCategory(category: String): List<DailySentence> =
        getAllSentences().filter { it.category == category }

    fun getCategories(): List<String> =
        listOf("همه") + getAllSentences().map { it.category }.distinct()
}