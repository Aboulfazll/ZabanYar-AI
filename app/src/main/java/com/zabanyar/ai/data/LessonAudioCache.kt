package com.zabanyar.ai.data.audio

import android.content.Context
import java.io.File

object LessonAudioCache {
    private val cache = mutableMapOf<String, File>()
    private var cacheDir: File? = null

    fun init(context: Context) {
        cacheDir = File(context.cacheDir, "lesson_audio").apply {
            if (!exists()) mkdirs()
        }
    }

    fun get(key: String): File? {
        cache[key]?.let { if (it.exists()) return it }
        val dir = cacheDir ?: return null
        val f = File(dir, key)
        return if (f.exists()) f else null
    }

    fun put(key: String, file: File) {
        cache[key] = file
    }

    fun getOrCreate(key: String): File {
        val dir = cacheDir ?: error("LessonAudioCache not initialized")
        return File(dir, key)
    }

    fun has(key: String): Boolean = get(key) != null

    fun clear() {
        cache.clear()
        cacheDir?.listFiles()?.forEach { it.delete() }
    }
}