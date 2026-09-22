package com.zabanyar.ai.data

import android.speech.tts.TextToSpeech
import java.util.Locale

class SpeechHelper : TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null
    private var isReady = false
    private var currentSpeed = 1.0f
    private var currentPitch = 1.0f

    init {
        tts = TextToSpeech(com.zabanyar.ai.data.AppContextProvider.context, this)
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
            }
        }
    }

    fun speak(text: String) {
        if (isReady && text.isNotBlank()) {
            tts?.setSpeechRate(currentSpeed)
            tts?.setPitch(currentPitch)
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
        }
    }

    fun stop() {
        tts?.stop()
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

    fun shutdown() {
        tts?.stop()
        tts?.shutdown()
    }
}