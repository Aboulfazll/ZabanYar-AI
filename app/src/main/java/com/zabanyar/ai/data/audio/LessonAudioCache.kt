package com.zabanyar.ai.data.audio

import android.content.Context
import android.media.MediaPlayer
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import java.io.File
import java.io.FileOutputStream
import java.io.InputStream

/**
 * LessonAudioCache
 * مدیریت کش و پخش فایل‌های صوتی درس‌ها
 */
object LessonAudioCache {

    private const val CACHE_DIR = "lesson_audio_cache"
    private val mediaPlayers = mutableMapOf<String, MediaPlayer>()

    // ─── state های Compose ───
    private val _isPlaying = mutableStateOf(false)
    val isPlaying: State<Boolean> get() = _isPlaying

    private val _currentTrack = mutableStateOf<String?>(null)
    val currentTrack: State<String?> get() = _currentTrack

    private val _progress = mutableStateOf(0f)
    val progress: State<Float> get() = _progress

    private val _duration = mutableStateOf(0)
    val duration: State<Int> get() = _duration

    private val _currentPosition = mutableStateOf(0)
    val currentPosition: State<Int> get() = _currentPosition

    // ─── پخش از res/raw ───
    fun playFromRaw(context: Context, resId: Int, tag: String = "default") {
        stop()
        try {
            val player = MediaPlayer.create(context, resId) ?: return
            player.setOnCompletionListener {
                _isPlaying.value = false
                _currentTrack.value = null
                _progress.value = 0f
            }
            player.setOnPreparedListener {
                _duration.value = it.duration
            }
            player.start()
            mediaPlayers[tag] = player
            _isPlaying.value = true
            _currentTrack.value = tag
        } catch (e: Exception) {
            e.printStackTrace()
            _isPlaying.value = false
        }
    }

    // ─── پخش از assets ───
    fun playFromAssets(context: Context, assetPath: String, tag: String = "default") {
        stop()
        try {
            val afd = context.assets.openFd(assetPath)
            val player = MediaPlayer()
            player.setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
            player.prepare()
            player.setOnCompletionListener {
                _isPlaying.value = false
                _currentTrack.value = null
                _progress.value = 0f
            }
            player.setOnPreparedListener {
                _duration.value = it.duration
            }
            player.start()
            mediaPlayers[tag] = player
            _isPlaying.value = true
            _currentTrack.value = tag
            afd.close()
        } catch (e: Exception) {
            e.printStackTrace()
            _isPlaying.value = false
        }
    }

    // ─── پخش از فایل کش‌شده ───
    fun playFromFile(context: Context, fileName: String, tag: String = "default") {
        val file = getCachedFile(context, fileName) ?: return
        stop()
        try {
            val player = MediaPlayer()
            player.setDataSource(file.absolutePath)
            player.prepare()
            player.setOnCompletionListener {
                _isPlaying.value = false
                _currentTrack.value = null
            }
            player.start()
            mediaPlayers[tag] = player
            _isPlaying.value = true
            _currentTrack.value = tag
        } catch (e: Exception) {
            e.printStackTrace()
            _isPlaying.value = false
        }
    }

    // ─── توقف کامل ───
    fun stop() {
        mediaPlayers.values.forEach { player ->
            try {
                if (player.isPlaying) player.stop()
                player.release()
            } catch (_: Exception) { }
        }
        mediaPlayers.clear()
        _isPlaying.value = false
        _currentTrack.value = null
        _progress.value = 0f
    }

    // ─── توقف یک ترک خاص ───
    fun stop(tag: String) {
        mediaPlayers.remove(tag)?.let { player ->
            try {
                if (player.isPlaying) player.stop()
                player.release()
            } catch (_: Exception) { }
        }
        if (_currentTrack.value == tag) {
            _isPlaying.value = false
            _currentTrack.value = null
        }
    }

    // ─── pause / resume ───
    fun pause() {
        mediaPlayers.values.forEach { player ->
            try { if (player.isPlaying) player.pause() } catch (_: Exception) { }
        }
    }

    fun resume() {
        mediaPlayers.values.forEach { player ->
            try { if (!player.isPlaying) player.start() } catch (_: Exception) { }
        }
    }

    // ─── مدیریت کش ───
    fun isCached(context: Context, fileName: String): Boolean {
        val dir = File(context.cacheDir, CACHE_DIR)
        return File(dir, fileName).exists()
    }

    fun cacheFile(context: Context, fileName: String, input: InputStream) {
        val dir = File(context.cacheDir, CACHE_DIR).apply { if (!exists()) mkdirs() }
        val outFile = File(dir, fileName)
        FileOutputStream(outFile).use { out -> input.copyTo(out) }
    }

    fun getCachedFile(context: Context, fileName: String): File? {
        val file = File(File(context.cacheDir, CACHE_DIR), fileName)
        return if (file.exists()) file else null
    }

    fun clear(context: Context) {
        stop()
        File(context.cacheDir, CACHE_DIR).deleteRecursively()
    }

    fun clearCache(context: Context) = clear(context)
}