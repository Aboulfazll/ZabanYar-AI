package com.zabanyar.ai.data

enum class BookCategory(
    val displayName: String,
    val persianName: String,
    val emoji: String,
    val color: Long
) {
    CONVERSATION("Conversation", "مکالمه", "💬", 0xFF6200EE),
    GRAMMAR("Grammar", "گرامر", "📝", 0xFF00695C),
    VOCABULARY("Vocabulary", "واژگان", "📚", 0xFFE91E63),
    IELTS("IELTS & TOEFL", "آیلتس و تافل", "🎯", 0xFFF57C00),
    LISTENING("Listening", "مهارت شنیداری", "🎧", 0xFF0288D1),
    READING("Reading", "مهارت خواندن", "📖", 0xFF7B1FA2),
    STORY("Story", "داستان", "📕", 0xFFC62828),
    IDIOMS("Idioms", "اصطلاحات", "💡", 0xFFFFA000)
}

data class Book(
    val id: String,
    val title: String,
    val titlePersian: String,
    val author: String,
    val category: BookCategory,
    val level: String,
    // ✅ مقادیر پیش‌فرض اضافه شد
    val levelEmoji: String = "📕",
    val totalChapters: Int = 6,
    val gradientStart: Long = 0xFF1A237E,
    val gradientEnd: Long = 0xFF3949AB,
    val chapterTitles: List<String> = emptyList(),
    val views: String = "0",
    val isNew: Boolean = false
)

object BookRepository {
    fun getAllBooks(): List<Book> = listOf(
        // ... همه کتاب‌های قبلی که داشتی، بدون تغییر
        // (چون الان مقادیر پیش‌فرض دارن، فایل‌های SimpleStories/IntermediateStories/AdvancedStories هم بدون مشکل کار می‌کنن)
    )

    fun getBooksByCategory(category: BookCategory): List<Book> =
        getAllBooks().filter { it.category == category }

    fun getBooksByLevel(level: String): List<Book> =
        getAllBooks().filter { it.level == level }

    fun getBookById(id: String): Book? =
        getAllBooks().firstOrNull { it.id == id }

    fun getCountByCategory(category: BookCategory): Int =
        getAllBooks().count { it.category == category }

    fun getStoriesByLevel(level: String): List<Book> =
        getAllBooks().filter { it.category == BookCategory.STORY && it.level == level }

    fun getAllStories(): List<Book> =
        getAllBooks().filter { it.category == BookCategory.STORY }
}