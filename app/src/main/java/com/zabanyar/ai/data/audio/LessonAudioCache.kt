package com.zabanyar.ai.data

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import java.net.HttpURLConnection
import java.net.URL
import java.util.zip.ZipInputStream

/**
 * LessonAudioCache
 * مدیریت دانلود، کش و یافتن فایل‌های صوتی درس‌ها
 */
object LessonAudioCache {

    private const val AUDIO_DIR = "lesson_audio"
    private const val MARKER_FILE = ".ready"

    // ⚠️ آدرس ZIP فایل‌های صوتی رو اینجا بذارید
    // اگه خالی بذارید، اپ به‌صورت خودکار از TTS استفاده می‌کنه
    private const val AUDIO_ZIP_URL = ""

    /**
     * آیا فایل‌های صوتی قبلاً دانلود و آماده شده‌اند؟
     */
    fun isReady(context: Context): Boolean {
        val dir = File(context.filesDir, AUDIO_DIR)
        return File(dir, MARKER_FILE).exists()
    }

    /**
     * دانلود و استخراج ZIP صداها با نمایش درصد پیشرفت
     * خروجی: true اگه موفق، false اگه ناموفق (اپ به TTS می‌رود)
     */
    suspend fun ensureDownloaded(
        context: Context,
        onProgress: (Float) -> Unit = {}
    ): Boolean = withContext(Dispatchers.IO) {
        try {
            val dir = File(context.filesDir, AUDIO_DIR)
            if (!dir.exists()) dir.mkdirs()

            // اگه قبلاً آماده شده
            if (File(dir, MARKER_FILE).exists()) {
                onProgress(1f)
                return@withContext true
            }

            // اگه URL تنظیم نشده، از TTS استفاده می‌شود
            if (AUDIO_ZIP_URL.isBlank()) {
                return@withContext false
            }

            val conn = URL(AUDIO_ZIP_URL).openConnection() as HttpURLConnection
            conn.connectTimeout = 15000
            conn.readTimeout = 30000
            conn.connect()

            if (conn.responseCode !in 200..299) {
                return@withContext false
            }

            val total = conn.contentLength.toLong()
            val input = conn.inputStream
            val zipFile = File(dir, "audio.zip")

            FileOutputStream(zipFile).use { out ->
                val buffer = ByteArray(8192)
                var read: Int
                var totalRead = 0L
                while (input.read(buffer).also { read = it } != -1) {
                    out.write(buffer, 0, read)
                    totalRead += read
                    if (total > 0) onProgress((totalRead.toFloat() / total).coerceIn(0f, 1f))
                }
            }
            input.close()

            // استخراج ZIP
            ZipInputStream(zipFile.inputStream()).use { zis ->
                var entry = zis.nextEntry
                while (entry != null) {
                    val outFile = File(dir, entry.name)
                    // جلوگیری از path traversal
                    if (!outFile.canonicalPath.startsWith(dir.canonicalPath)) {
                        zis.closeEntry()
                        entry = zis.nextEntry
                        continue
                    }
                    if (entry.isDirectory) {
                        outFile.mkdirs()
                    } else {
                        outFile.parentFile?.mkdirs()
                        FileOutputStream(outFile).use { out -> zis.copyTo(out) }
                    }
                    zis.closeEntry()
                    entry = zis.nextEntry
                }
            }
            zipFile.delete()
            File(dir, MARKER_FILE).createNewFile()
            onProgress(1f)
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    /**
     * پیدا کردن فایل صوتی یک فصل خاص
     */
    fun findLessonAudio(context: Context, bookId: String, chapterNumber: Int): File? {
        val dir = File(context.filesDir, AUDIO_DIR)
        if (!dir.exists()) return null

        // الگوهای رایج نام‌گذاری
        val candidates = listOf(
            "$bookId/$chapterNumber.mp3",
            "$bookId/chapter_$chapterNumber.mp3",
            "$bookId/chapter$chapterNumber.mp3",
            "$bookId/${chapterNumber}_lesson.mp3",
            "$bookId/lesson_$chapterNumber.mp3",
            "$bookId/lesson$chapterNumber.mp3",
            "$bookId/${bookId}_${chapterNumber}.mp3",
            "$bookId/$bookId-$chapterNumber.mp3"
        )
        for (c in candidates) {
            val f = File(dir, c)
            if (f.exists() && f.isFile) return f
        }

        // جستجوی بازگشتی برای اطمینان
        return dir.walkTopDown()
            .firstOrNull {
                it.isFile &&
                it.extension.equals("mp3", ignoreCase = true) &&
                it.nameWithoutExtension == chapterNumber.toString()
            }
    }

    /**
     * پاک کردن کل کش صداها
     */
    fun clear(context: Context) {
        File(context.filesDir, AUDIO_DIR).deleteRecursively()
    }
}