package com.zabanyar.ai.data

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

/**
 * 📖 دیکشنری آفلاین — خواندن از assets/dictionary.json
 */
data class DictionaryEntry(
    val us: String = "",
    val uk: String = "",
    val persian: List<String> = emptyList()
)

object DictionaryRepository {

    private var cache: Map<String, DictionaryEntry>? = null

    @Synchronized
    private fun loadDictionary(context: Context): Map<String, DictionaryEntry> {
        cache?.let { return it }

        return try {
            val json = context.assets.open("dictionary.json")
                .bufferedReader()
                .use { it.readText() }

            val type = object : TypeToken<Map<String, DictionaryEntry>>() {}.type
            val map: Map<String, DictionaryEntry> = Gson().fromJson(json, type) ?: emptyMap()

            val lowercased = map.mapKeys { it.key.lowercase().trim() }
            cache = lowercased
            lowercased
        } catch (e: Exception) {
            e.printStackTrace()
            emptyMap()
        }
    }

    fun lookup(context: Context, rawWord: String): DictionaryEntry? {
        val word = cleanWord(rawWord)
        if (word.isEmpty()) return null
        return loadDictionary(context)[word]
    }

    private fun cleanWord(raw: String): String {
        return raw
            .trim()
            .lowercase()
            .trim(
                '.', ',', '!', '?', ';', ':', '"', '\'',
                '(', ')', '[', ']', '{', '}', '-', '—', '…',
                '،', '؛', '؟', '«', '»'
            )
    }
}