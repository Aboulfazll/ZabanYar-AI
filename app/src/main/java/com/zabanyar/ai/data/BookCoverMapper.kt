package com.zabanyar.ai.data

import com.zabanyar.ai.R

/**
 * 🖼️ نگاشت شناسه کتاب به عکس محلی (drawable)
 */
object BookCoverMapper {

    private val localCovers: Map<String, Int> = mapOf(
        // ─── 💬 مکالمه: Top Notch ───
        "top_notch_1" to R.drawable.top_notch_1,
        "top_notch_2" to R.drawable.top_notch_2,
        "top_notch_3" to R.drawable.top_notch_3,

        // ─── 💬 مکالمه: Four Corners ───
        "four_corners_intro" to R.drawable.four_corners_intro,
        "four_corners_1" to R.drawable.four_corners_1,
        "four_corners_2" to R.drawable.four_corners_2,
        "four_corners_3" to R.drawable.four_corners_3,
        "four_corners_4" to R.drawable.four_corners_4,

        // ─── 💬 مکالمه: English File ───
        "english_file_1" to R.drawable.english_file_1,
        "english_file_2" to R.drawable.english_file_2,
        "english_file_3" to R.drawable.english_file_3,
        "english_file_4" to R.drawable.english_file_4,
        "english_file_5" to R.drawable.english_file_5,

        // ─── 💬 مکالمه: Evolve ───
        "evolve_1" to R.drawable.evolve_1,
        "evolve_2" to R.drawable.evolve_2,
        "evolve_3" to R.drawable.evolve_3,
        "evolve_4" to R.drawable.evolve_4,
        "evolve_5" to R.drawable.evolve_5,

        // ─── 📝 گرامر ───
        "basic_grammar" to R.drawable.basic_grammar,
        "understanding_grammar" to R.drawable.understanding_grammar,
        "advanced_grammar" to R.drawable.advanced_grammar,

        // ─── 📕 داستان‌ها ───
        "alice_wonderland" to R.drawable.alice_wonderland,
        "peter_pan" to R.drawable.peter_pan,
        "little_prince" to R.drawable.little_prince,
        "curse_of_mummy" to R.drawable.curse_of_mummy,
        "sherlock_top_secret" to R.drawable.sherlock_top_secret,
        "sherlock_blue_diamond" to R.drawable.sherlock_blue_diamond,
        "halloween_horror" to R.drawable.halloween_horror,
        "gift_of_magi" to R.drawable.gift_of_magi,
        "secret_garden" to R.drawable.secret_garden,
        "black_beauty" to R.drawable.black_beauty
    )

    fun getLocalCover(bookId: String): Int? = localCovers[bookId]

    fun hasLocalCover(bookId: String): Boolean = localCovers.containsKey(bookId)
}