package com.zabanyar.ai.data

import android.content.Context
import android.speech.tts.TextToSpeech
import android.speech.tts.UtteranceProgressListener
import android.util.Log
import java.util.Locale

class SpeechHelper(context: Context) : TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null
    private var isReady = false
    private var currentSpeed = 1.0f
    private var currentPitch = 1.0f
    private var pendingText: String? = null
    private var pendingCallback: (() -> Unit)? = null
    private var onDoneCallback: (() -> Unit)? = null

    companion object {
        private const val TAG = "SpeechHelper"
        private const val UTTERANCE_ID = "zabanyar_tts"
    }

    init {
        tts = TextToSpeech(context.applicationContext, this)
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts?.setLanguage(Locale.US)
            if (result != TextToSpeech.LANG_MISSING_DATA &&
                result != TextToSpeech.LANG_NOT_SUPPORTED
            ) {
                isReady = true
                tts?.setSpeechRate(currentSpeed)
                tts?.setPitch(currentPitch)

                tts?.setOnUtteranceProgressListener(object : UtteranceProgressListener() {
                    override fun onStart(utteranceId: String?) {
                        Log.d(TAG, "TTS Started: $utteranceId")
                    }

                    override fun onDone(utteranceId: String?) {
                        Log.d(TAG, "TTS Done: $utteranceId")
                        onDoneCallback?.invoke()
                    }

                    @Deprecated("Deprecated in Java")
                    override fun onError(utteranceId: String?) {
                        Log.e(TAG, "TTS Error: $utteranceId")
                        // ✅ اگه خطا داد، خط بعدی خونده بشه
                        onDoneCallback?.invoke()
                    }

                    override fun onError(utteranceId: String?, errorCode: Int) {
                        Log.e(TAG, "TTS Error: $utteranceId, code: $errorCode")
                        // ✅ اگه خطا داد، خط بعدی خونده بشه
                        onDoneCallback?.invoke()
                    }
                })

                // اگه قبلاً speak صدا زده شده بود و منتظر بود، الان پخش کن
                pendingText?.let { text ->
                    val cb = pendingCallback
                    pendingText = null
                    pendingCallback = null
                    speak(text, cb)
                }
            } else {
                Log.e(TAG, "TTS Language not supported")
            }
        } else {
            Log.e(TAG, "TTS Init failed: $status")
        }
    }

    fun speak(text: String, onDone: (() -> Unit)? = null) {
        if (text.isBlank()) {
            // اگه متن خالی بود، فوراً callback رو صدا بزن
            onDone?.invoke()
            return
        }

        // اگه TTS آماده نیست، متن رو ذخیره کن تا بعداً پخش بشه
        if (!isReady) {
            Log.d(TAG, "TTS not ready yet, saving text for later")
            pendingText = text
            pendingCallback = onDone
            return
        }

        onDoneCallback = onDone
        tts?.setSpeechRate(currentSpeed)
        tts?.setPitch(currentPitch)
        tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, UTTERANCE_ID)
    }

    fun stop() {
        tts?.stop()
        onDoneCallback = null
    }

    fun setSpeed(speed: Float) {
        currentSpeed = speed
        if (isReady) {
            tts?.setSpeechRate(speed)
        }
    }

    fun setPitch(pitch: Float) {
        currentPitch = pitch
        if (isReady) {
            tts?.setPitch(pitch)
        }
    }

    fun isInitialized(): Boolean = isReady

    fun shutdown() {
        tts?.stop()
        tts?.shutdown()
        isReady = false
        onDoneCallback = null
        pendingText = null
        pendingCallback = null
    }
}