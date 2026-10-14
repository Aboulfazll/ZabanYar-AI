package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۱۳ — پیشرفته — ادبیات مدرن
 *  ۳۷. قلب تاریکی (جوزف کنراد)        → Story37
 *  ۳۸. لرد جیم (جوزف کنراد)            → Story38
 *  ۳۹. دنیای قشنگ نو (آلدوس هاکسلی)   → Story39
 *
 *  ساختار: هر داستان ۶ فصل | هر فصل ۴۰ پاراگراف طولانی
 */
object Group13 {

    /**
     * همه داستان‌های گروه ۱۳
     */
    fun getAll(): List<StoryContent> = listOf(
        story37(),
        story38(),
        story39(),
    )

    /**
     * دسترسی به هر داستان با شناسه
     */
    fun getById(storyId: String): StoryContent? = getAll().firstOrNull { it.storyId == storyId }

    /**
     * لیست شناسه‌های داستان‌های این گروه
     */
    fun getStoryIds(): List<String> = listOf(
        "adv_heart_of_darkness",
        "adv_lord_jim",
        "adv_brave_new_world",
    )

    // ─── اتصال به Story37 ───
    private fun story37(): StoryContent = Story37.get()

    // ─── اتصال به Story38 ───
    private fun story38(): StoryContent = Story38.get()

    // ─── اتصال به Story39 ───
    private fun story39(): StoryContent = Story39.get()
}