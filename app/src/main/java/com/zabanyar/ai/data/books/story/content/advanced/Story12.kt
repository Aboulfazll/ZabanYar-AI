package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۱۲ — پیشرفته — ادبیات معاصر
 *  ۱۲. هرگز رهایم مکن (کازوئو ایشی‌گورو)
 *  ۱۳. ...
 *  ۱۴. ...
 */
object Group12 {

    fun getAll(): List<StoryContent> = listOf(
        Story12.get(),
        Story13.get(),
        Story14.get(),
    )
}