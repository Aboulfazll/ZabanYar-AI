package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.ChatMessageDto
import com.zabanyar.ai.data.GroqClient
import com.zabanyar.ai.data.UserManager
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

data class ChatMessage(
    val text: String,
    val isUser: Boolean,
    val timestamp: Long = System.currentTimeMillis()
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AIChatScreen(
    onBack: () -> Unit,
    onOpenSettings: () -> Unit = {}
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val user = remember { UserManager.getLoggedInUser(context) }

    var messages by remember {
        mutableStateOf(
            listOf(
                ChatMessage(
                    "سلام! 👋 من معلم هوشمند زبان انگلیسی هستم.\n\nمی‌تونم بهت در یادگیری گرامر، لغات، مکالمه و تلفظ کمک کنم.\n\nچه چیزی دوست داری یاد بگیری؟",
                    isUser = false
                )
            )
        )
    }
    var inputText by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }

    val listState = rememberLazyListState()

    LaunchedEffect(messages.size) {
        if (messages.isNotEmpty()) {
            listState.animateScrollToItem(messages.size - 1)
        }
    }

    fun sendMessage() {
        val userMessage = inputText.trim()
        if (userMessage.isBlank() || isLoading) return

        inputText = ""
        messages = messages + ChatMessage(userMessage, isUser = true)
        isLoading = true

        scope.launch {
            // ساخت تاریخچه از پیام‌های قبلی
            val history = messages.dropLast(1)
                .filter { it.text.isNotBlank() }
                .filter {
                    !it.text.startsWith("❌") &&
                    !it.text.startsWith("🌐") &&
                    !it.text.startsWith("🔌") &&
                    !it.text.startsWith("⏳")
                }
                .map {
                    ChatMessageDto(
                        role = if (it.isUser) "user" else "assistant",
                        content = it.text
                    )
                }

            val apiKey = user?.apiKey ?: ""
            val response = GroqClient.askAI(
                apiKey = apiKey,
                userMessage = userMessage,
                history = history
            )

            messages = messages + ChatMessage(response, isUser = false)
            isLoading = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.25f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🤖", fontSize = 20.sp)
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                "معلم هوشمند",
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 15.sp
                            )
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Box(
                                    modifier = Modifier
                                        .size(8.dp)
                                        .clip(CircleShape)
                                        .background(
                                            if (user?.apiKey.isNullOrBlank()) Color(0xFFFFA726)
                                            else Color(0xFF4CAF50)
                                        )
                                )
                                Spacer(Modifier.width(4.dp))
                                Text(
                                    if (user?.apiKey.isNullOrBlank()) "کلید API وارد نشده"
                                    else "آنلاین",
                                    fontSize = 10.sp,
                                    color = Color.White.copy(alpha = 0.9f)
                                )
                            }
                        }
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            "Back",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    IconButton(onClick = {
                        messages = listOf(
                            ChatMessage(
                                "سلام! 👋 من معلم هوشمند زبان انگلیسی هستم.",
                                isUser = false
                            )
                        )
                    }) {
                        Icon(Icons.Filled.Clear, "Clear", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = PrimaryColor
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {
            // هشدار اگه کلید API وارد نشده
            if (user?.apiKey.isNullOrBlank()) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .clickable { onOpenSettings() },
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFF3E0)
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("⚠️", fontSize = 22.sp)
                        Spacer(Modifier.width(10.dp))
                        Column(modifier = Modifier.weight(1f)) {
                            Text(
                                "کلید API وارد نشده",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFE65100)
                            )
                            Text(
                                "برای استفاده از AI، ضربه بزن و کلید Groq خودت رو وارد کن",
                                fontSize = 11.sp,
                                color = Color(0xFF5D4037)
                            )
                        }
                        Text("←", fontSize = 20.sp, color = Color(0xFFE65100))
                    }
                }
            }

            // لیست پیام‌ها
            LazyColumn(
                state = listState,
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(messages) { message ->
                    ChatBubble(message)
                }

                if (isLoading) {
                    item {
                        TypingIndicator()
                    }
                }
            }

            // پیشنهادات سریع
            if (messages.size == 1) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Text(
                        "💡 پیشنهادات:",
                        fontSize = 11.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(Modifier.height(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(6.dp)
                    ) {
                        listOf("گرامر", "لغات", "مکالمه").forEach { suggestion ->
                            SuggestionChip(
                                onClick = {
                                    inputText = "درباره $suggestion بهم توضیح بده"
                                },
                                label = {
                                    Text(suggestion, fontSize = 11.sp)
                                },
                                colors = SuggestionChipDefaults.suggestionChipColors(
                                    containerColor = PrimaryColor.copy(alpha = 0.1f),
                                    labelColor = PrimaryColor
                                )
                            )
                        }
                    }
                }
            }

            // نوار ارسال پیام
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    verticalAlignment = Alignment.Bottom
                ) {
                    OutlinedTextField(
                        value = inputText,
                        onValueChange = { inputText = it },
                        modifier = Modifier.weight(1f),
                        placeholder = {
                            Text("سوالت رو بنویس...", fontSize = 13.sp)
                        },
                        shape = RoundedCornerShape(24.dp),
                        maxLines = 4,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = PrimaryColor,
                            unfocusedBorderColor = Color.LightGray
                        )
                    )

                    Spacer(Modifier.width(8.dp))

                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(CircleShape)
                            .background(
                                if (inputText.isBlank() || isLoading)
                                    Color.Gray.copy(alpha = 0.4f)
                                else
                                    PrimaryColor
                            )
                            .clickable(enabled = inputText.isNotBlank() && !isLoading) {
                                sendMessage()
                            },
                        contentAlignment = Alignment.Center
                    ) {
                        if (isLoading) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(22.dp),
                                color = Color.White,
                                strokeWidth = 2.dp
                            )
                        } else {
                            Icon(
                                Icons.AutoMirrored.Filled.Send,
                                "Send",
                                tint = Color.White,
                                modifier = Modifier.size(22.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ChatBubble(message: ChatMessage) {
    val isUser = message.isUser

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (isUser) Arrangement.End else Arrangement.Start
    ) {
        if (!isUser) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape)
                    .background(
                        Brush.linearGradient(listOf(PrimaryColor, SecondaryColor))
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text("🤖", fontSize = 16.sp)
            }
            Spacer(Modifier.width(8.dp))
        }

        Card(
            modifier = Modifier.widthIn(max = 300.dp),
            shape = RoundedCornerShape(
                topStart = 18.dp,
                topEnd = 18.dp,
                bottomStart = if (isUser) 18.dp else 4.dp,
                bottomEnd = if (isUser) 4.dp else 18.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = if (isUser) PrimaryColor else Color.White
            ),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Text(
                message.text,
                fontSize = 14.sp,
                color = if (isUser) Color.White else Color(0xFF333333),
                modifier = Modifier.padding(12.dp),
                lineHeight = 22.sp
            )
        }
    }
}

@Composable
private fun TypingIndicator() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(32.dp)
                .clip(CircleShape)
                .background(
                    Brush.linearGradient(listOf(PrimaryColor, SecondaryColor))
                ),
            contentAlignment = Alignment.Center
        ) {
            Text("🤖", fontSize = 16.sp)
        }
        Spacer(Modifier.width(8.dp))
        Card(
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Row(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                repeat(3) { index ->
                    TypingDot(delayMillis = index * 150L)
                }
            }
        }
    }
}

@Composable
private fun TypingDot(delayMillis: Long) {
    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(delayMillis)
        while (true) {
            visible = !visible
            delay(500)
        }
    }

    Box(
        modifier = Modifier
            .padding(horizontal = 2.dp)
            .size(8.dp)
            .clip(CircleShape)
            .background(
                if (visible) PrimaryColor else PrimaryColor.copy(alpha = 0.3f)
            )
    )
}