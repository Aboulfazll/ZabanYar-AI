package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material.icons.filled.Stop
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.SpeechHelper
import com.zabanyar.ai.ui.theme.PrimaryColor    // 👈 ایمپورت جدید
import com.zabanyar.ai.ui.theme.SecondaryColor // 👈 ایمپورت جدید
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingModeScreen(
    title: String,
    text: String,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    val words = remember(text) { text.split(" ").filter { it.isNotBlank() } }

    var currentWordIndex by remember { mutableIntStateOf(-1) }
    var isPlaying by remember { mutableStateOf(false) }
    var isPaused by remember { mutableStateOf(false) }
    var playbackSpeed by remember { mutableFloatStateOf(1.0f) }
    var ttsReady by remember { mutableStateOf(false) }

    // ✅ چک کردن آماده بودن TTS
    LaunchedEffect(Unit) {
        while (!speechHelper.isInitialized()) {
            delay(100)
        }
        ttsReady = true
    }

    // ✅ پخش متن با TTS + هایلایت
    LaunchedEffect(isPlaying) {
        if (isPlaying && ttsReady) {
            speechHelper.speak(text) {
                isPlaying = false
                isPaused = false
                currentWordIndex = -1
            }

            val wordsPerSecond = 2.5f * playbackSpeed
            val delayPerWord = (1000 / wordsPerSecond).toLong()

            for (i in 0 until words.size) {
                if (!isPlaying) break
                currentWordIndex = i
                delay(delayPerWord)
            }
        }
    }

    // ساخت متن با هایلایت
    val annotatedText = remember(currentWordIndex, words) {
        buildAnnotatedString {
            words.forEachIndexed { index, word ->
                if (index == currentWordIndex) {
                    withStyle(
                        SpanStyle(
                            background = Color(0xFFFFEB3B),
                            color = Color(0xFF000000),
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append(word)
                    }
                } else {
                    withStyle(
                        SpanStyle(
                            color = Color(0xFF1A237E),
                            fontWeight = FontWeight.Normal
                        )
                    ) {
                        append(word)
                    }
                }
                if (index < words.size - 1) append(" ")
            }
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            speechHelper.stop()
            speechHelper.shutdown()
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "📖 حالت خوانش",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 17.sp
                    )
                },
                navigationIcon = {
                    IconButton(onClick = {
                        speechHelper.stop()
                        onBack()
                    }) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = PrimaryColor)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {
            // ==================== نوار پیشرفت ====================
            if (isPlaying || isPaused) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(PrimaryColor.copy(alpha = 0.1f))
                        .padding(16.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            "کلمه ${(currentWordIndex + 1).coerceAtLeast(1)} از ${words.size}",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                        Text(
                            "${(((currentWordIndex + 1).coerceAtLeast(1)) * 100 / words.size)}%",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                    }
                    Spacer(Modifier.height(8.dp))
                    LinearProgressIndicator(
                        progress = { ((currentWordIndex + 1).coerceAtLeast(0)).toFloat() / words.size },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(6.dp)
                            .clip(RoundedCornerShape(3.dp)),
                        color = PrimaryColor,
                        trackColor = Color.White
                    )
                }
            }

            // ==================== کارت متن ====================
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
                    .padding(20.dp)
            ) {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(6.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Text(
                            title,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                        Spacer(Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(40.dp)
                                .height(3.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(SecondaryColor)
                        )
                        Spacer(Modifier.height(16.dp))

                        Text(
                            text = annotatedText,
                            fontSize = 18.sp,
                            lineHeight = 34.sp,
                            color = Color(0xFF1A237E)
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFE3F2FD)
                    )
                ) {
                    Row(
                        modifier = Modifier.padding(14.dp),
                        verticalAlignment = Alignment.Top
                    ) {
                        Text("💡", fontSize = 20.sp)
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                "نکته یادگیری",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF1565C0)
                            )
                            Spacer(Modifier.height(4.dp))
                            Text(
                                "با دکمه پخش، کلمه‌به‌کلمه بخون و تکرار کن. " +
                                "می‌تونی سرعت پخش رو هم تغییر بدی.",
                                fontSize = 11.sp,
                                color = Color(0xFF424242),
                                lineHeight = 18.sp
                            )
                        }
                    }
                }
            }

            // ==================== نوار کنترل ====================
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
                elevation = CardDefaults.cardElevation(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "🎙️ سرعت:",
                            fontSize = 12.sp,
                            color = Color.Gray,
                            fontWeight = FontWeight.SemiBold
                        )
                        Spacer(Modifier.width(8.dp))
                        listOf(
                            0.75f to "آهسته",
                            1.0f to "معمولی",
                            1.25f to "سریع",
                            1.5f to "خیلی سریع"
                        ).forEach { (speed, label) ->
                            FilterChip(
                                selected = playbackSpeed == speed,
                                onClick = {
                                    playbackSpeed = speed
                                    speechHelper.setSpeed(speed)
                                },
                                label = {
                                    Text(
                                        label,
                                        fontSize = 10.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                },
                                colors = FilterChipDefaults.filterChipColors(
                                    selectedContainerColor = PrimaryColor,
                                    selectedLabelColor = Color.White
                                ),
                                modifier = Modifier.padding(end = 4.dp)
                            )
                        }
                    }

                    Spacer(Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = {
                                speechHelper.stop()
                                currentWordIndex = 0
                                isPlaying = true
                                isPaused = false
                            },
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .background(PrimaryColor.copy(alpha = 0.1f))
                        ) {
                            Icon(
                                Icons.Filled.Replay,
                                "Restart",
                                tint = PrimaryColor,
                                modifier = Modifier.size(24.dp)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .size(70.dp)
                                .clip(CircleShape)
                                .background(
                                    Brush.linearGradient(
                                        listOf(PrimaryColor, SecondaryColor)
                                    )
                                )
                                .clickable {
                                    if (isPlaying) {
                                        speechHelper.stop()
                                        isPlaying = false
                                        isPaused = true
                                    } else {
                                        if (currentWordIndex < 0) {
                                            currentWordIndex = 0
                                        }
                                        isPlaying = true
                                        isPaused = false
                                    }
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = if (isPlaying) Icons.Filled.Pause
                                else Icons.Filled.PlayArrow,
                                contentDescription = "Play/Pause",
                                tint = Color.White,
                                modifier = Modifier.size(36.dp)
                            )
                        }

                        IconButton(
                            onClick = {
                                speechHelper.stop()
                                isPlaying = false
                                isPaused = false
                                currentWordIndex = -1
                            },
                            modifier = Modifier
                                .size(50.dp)
                                .clip(CircleShape)
                                .background(Color(0xFFFFEBEE))
                        ) {
                            Icon(
                                Icons.Filled.Stop,
                                "Stop",
                                tint = Color(0xFFC62828),
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }

                    Spacer(Modifier.height(12.dp))

                    Text(
                        text = when {
                            !ttsReady -> "⏳ در حال آماده‌سازی..."
                            isPlaying -> "🔊 در حال پخش..."
                            isPaused -> "⏸️ متوقف شده - برای ادامه دکمه پخش را بزن"
                            else -> "👆 برای شروع، دکمه پخش را بزن"
                        },
                        fontSize = 12.sp,
                        color = Color.Gray,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = androidx.compose.ui.text.style.TextAlign.Center
                    )
                }
            }
        }
    }
}