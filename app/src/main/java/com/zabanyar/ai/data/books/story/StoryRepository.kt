package com.zabanyar.ai.data.books.story

import com.zabanyar.ai.data.Book
import com.zabanyar.ai.data.books.story.content.SimpleStoryContent
import com.zabanyar.ai.data.books.story.content.IntermediateStoryContent
import com.zabanyar.ai.data.books.story.content.advanced.AdvancedStoryContent
import com.zabanyar.ai.data.books.story.content.advanced.en.EnStoryContent
import com.zabanyar.ai.data.books.story.content.advanced.en.EnStory
import com.zabanyar.ai.data.books.story.content.advanced.en.EnChapter
import com.zabanyar.ai.data.books.story.content.advanced.en.toStoryChapters
import com.zabanyar.ai.data.books.story.content.advanced.en.toStoryChapter

// ⚠️ این سه خط رو اضافه کردم. اگر فایل‌ها توی همین پوشه story هستن، این خطوط رو پاک کنید.
import com.zabanyar.ai.data.books.story.SimpleStories
import com.zabanyar.ai.data.books.story.IntermediateStories
import com.zabanyar.ai.data.books.story.AdvancedStories

object StoryRepository {

    // ═══════════════════════════════════════════════════════
    //  📖 متادیتا (لیست کتاب‌ها)
    // ═══════════════════════════════════════════════════════

    fun getAllStories(): List<Book> =
        SimpleStories.getAll() +
        IntermediateStories.getAll() +
        AdvancedStories.getAll()

    fun getStoriesByLevel(level: String): List<Book> =
        getAllStories().filter { it.level == level }

    fun getSimpleStories(): List<Book> = SimpleStories.getAll()
    fun getIntermediateStories(): List<Book> = IntermediateStories.getAll()
    fun getAdvancedStories(): List<Book> = AdvancedStories.getAll()

    fun getStoryById(id: String): Book? =
        getAllStories().firstOrNull { it.id == id }

    fun getCount(): Int = getAllStories().size

    // ═══════════════════════════════════════════════════════
    //  📚 محتوای دوزبانه (فارسی + انگلیسی)
    // ═══════════════════════════════════════════════════════

    private val bilingualContents: List<StoryContent>
        get() = SimpleStoryContent.getAll() +
                IntermediateStoryContent.getAll() +
                AdvancedStoryContent.getAll()

    fun getContent(storyId: String): StoryContent? =
        bilingualContents.firstOrNull { it.storyId == storyId }

    fun getChapters(storyId: String): List<StoryChapter> =
        getContent(storyId)?.chapters ?: emptyList()

    fun getChapter(storyId: String, chapterNumber: Int): StoryChapter? =
        getChapters(storyId).firstOrNull { it.number == chapterNumber }

    fun hasContent(storyId: String): Boolean =
        getContent(storyId) != null

    // ═══════════════════════════════════════════════════════
    //  🇬🇧 محتوای انگلیسی تک‌زبانه (پیشرفته)
    // ═══════════════════════════════════════════════════════

    fun getEnStory(storyId: String): EnStory? =
        EnStoryContent.getStory(storyId)

    fun getEnChapter(storyId: String, chapterNumber: Int): EnChapter? =
        EnStoryContent.getChapter(storyId, chapterNumber)

    fun hasEnContent(storyId: String): Boolean =
        EnStoryContent.hasContent(storyId)

    fun getEnStoriesCount(): Int =
        EnStoryContent.getCount()

    // ═══════════════════════════════════════════════════════
    //  🔄 تبدیل En به StoryChapter
    // ═══════════════════════════════════════════════════════

    fun getEnChaptersAsStoryChapters(storyId: String): List<StoryChapter> {
        val enStory = getEnStory(storyId) ?: return emptyList()
        return enStory.toStoryChapters()
    }

    fun getEnChapterAsStoryChapter(storyId: String, chapterNumber: Int): StoryChapter? {
        val enChapter = getEnChapter(storyId, chapterNumber) ?: return null
        return enChapter.toStoryChapter()
    }

    // ═══════════════════════════════════════════════════════
    //  🔍 جستجو
    // ═══════════════════════════════════════════════════════

    fun searchStories(query: String): List<Book> {
        val q = query.trim().lowercase()
        if (q.isEmpty()) return emptyList()
        return getAllStories().filter {
            it.title.lowercase().contains(q) ||
            it.titlePersian.contains(q) ||
            it.author.lowercase().contains(q)
        }
    }

    fun getStoriesByCategory(category: String): List<Book> =
        getAllStories().filter { it.category.name == category }
}