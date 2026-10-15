package com.zabanyar.ai.data.books.story.content.advanced

import com.zabanyar.ai.data.books.story.StoryContent

/**
 * 📚 گروه ۱۲ — پیشرفته — ادبیات معاصر
 *  ۳۴. بادبادک‌باز (خالد حسینی)
 *  ۳۵. هزار خورشید تابان (خالد حسینی)
 *  ۳۶. زندگی پی (یان مارتل)
 */
object Group12 {

    fun getAll(): List<StoryContent> = listOf(
        Story34.get(),
        Story35.get(),
        Story36.get(),
    )
}