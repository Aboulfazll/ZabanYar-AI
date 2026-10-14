package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۱۳ — پیشرفته — ادبیات مدرن
 *  ۳۷. قلب تاریکی (جوزف کنراد)
 *  ۳۸. لرد جیم (جوزف کنراد)
 *  ۳۹. دنیای قشنگ نو (آلدوس هاکسلی)
 */
object Group13 {

    fun getAll(): List<StoryContent> = listOf(
        Story37.get(),
        Story38.get(),
        Story39.get(),
    )
}