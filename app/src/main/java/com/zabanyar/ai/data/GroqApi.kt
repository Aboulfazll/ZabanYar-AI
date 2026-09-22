package com.zabanyar.ai.data

import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Url
import java.util.concurrent.TimeUnit

// ============ مدل درخواست ============
data class ChatRequest(
    @SerializedName("model") val model: String,
    @SerializedName("messages") val messages: List<ChatMessageDto>,
    @SerializedName("temperature") val temperature: Float = 0.7f,
    @SerializedName("max_tokens") val maxTokens: Int = 1024
)

data class ChatMessageDto(
    @SerializedName("role") val role: String,
    @SerializedName("content") val content: String
)

// ============ مدل پاسخ ============
data class ChatResponse(
    @SerializedName("choices") val choices: List<Choice>
)

data class Choice(
    @SerializedName("message") val message: ChatMessageDto
)

// ============ API Interface ============
interface GroqApiService {
    @POST
    suspend fun chatCompletion(
        @Url url: String = "https://api.groq.com/openai/v1/chat/completions",
        @Header("Authorization") auth: String,
        @Header("Content-Type") contentType: String = "application/json",
        @Body request: ChatRequest
    ): ChatResponse
}

// ============ Client ============
object GroqClient {

    private const val BASE_URL = "https://api.groq.com/"

    const val MODEL_LLAMA_31 = "llama-3.1-8b-instant"
    const val MODEL_LLAMA_33 = "llama-3.3-70b-versatile"
    const val MODEL_MIXTRAL = "mixtral-8x7b-32768"

    private const val DEFAULT_SYSTEM_PROMPT =
        "You are an English teacher for Persian speakers. " +
        "Answer questions about English grammar, vocabulary, and pronunciation. " +
        "Keep answers short, friendly, and helpful. " +
        "You can use Persian to explain. " +
        "Always provide clear examples when teaching grammar."

    // =========================================================
    // ⚙️ تنظیمات پروکسی (برای اتصال به VPN محلی)
    // =========================================================
    // اگه از VPN معمولی (با آیکون کلید) استفاده می‌کنی، این رو false بذار
    // اگه از V2RayNG, Clash یا Hiddify در حالت Proxy Mode استفاده می‌کنی، true بذار
    var useProxy: Boolean = true

    var proxyHost: String = "127.0.0.1"
    var proxyPort: Int = 10808  // V2RayNG: 10808, Clash: 7890, NekoBox: 2080

    // =========================================================

    private val okHttpClient: OkHttpClient by lazy {
        val builder = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)

        if (useProxy) {
            val proxy = java.net.Proxy(
                java.net.Proxy.Type.HTTP,
                java.net.InetSocketAddress(proxyHost, proxyPort)
            )
            builder.proxy(proxy)
        }
        builder.build()
    }

    private val api: GroqApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GroqApiService::class.java)
    }

    suspend fun askAI(
        apiKey: String,
        userMessage: String,
        history: List<ChatMessageDto> = emptyList(),
        systemPrompt: String = DEFAULT_SYSTEM_PROMPT,
        model: String = MODEL_LLAMA_31
    ): String = withContext(Dispatchers.IO) {

        if (apiKey.isBlank()) {
            return@withContext "❌ کلید API تنظیم نشده است.\n\nلطفاً از تنظیمات، یک کلید رایگان از console.groq.com وارد کنید."
        }

        val system = ChatMessageDto(role = "system", content = systemPrompt)
        val allMessages = listOf(system) + history + ChatMessageDto(role = "user", content = userMessage)

        val request = ChatRequest(
            model = model,
            messages = allMessages,
            temperature = 0.7f,
            maxTokens = 1024
        )

        try {
            val response = api.chatCompletion(
                auth = "Bearer $apiKey",
                request = request
            )
            response.choices.firstOrNull()?.message?.content
                ?: "متأسفانه پاسخی دریافت نشد."
        } catch (e: Exception) {
            val errorMsg = e.message ?: "خطای نامشخص"
            when {
                errorMsg.contains("401") || errorMsg.contains("Unauthorized") ->
                    "❌ کلید API نامعتبر است.\n\nلطفاً از تنظیمات، کلید صحیح را وارد کنید."
                errorMsg.contains("429") ->
                    "⏳ تعداد درخواست‌ها زیاد شده. چند لحظه صبر کن و دوباره امتحان کن."
                errorMsg.contains("timeout") || errorMsg.contains("Unable to resolve host") ->
                    "🌐 اتصال به اینترنت برقرار نیست.\n\nاتصال VPN خود را بررسی کنید."
                errorMsg.contains("Failed to connect") || errorMsg.contains("Connection refused") ->
                    "🔌 اتصال به پروکسی برقرار نشد!\n\nلطفاً مطمئن شوید VPN روشن است و پورت پروکسی صحیح است."
                errorMsg.contains("model") ->
                    "🤖 مدل انتخابی در دسترس نیست."
                else ->
                    "خطا در ارتباط با AI: $errorMsg"
            }
        }
    }
}