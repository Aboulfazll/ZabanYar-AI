package com.zabanyar.ai.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.DictionaryEntry
import com.zabanyar.ai.data.DictionaryRepository
import com.zabanyar.ai.data.SpeechHelper
import com.zabanyar.ai.data.books.story.StoryRepository
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReadingModeScreen(
    storyId: String,
    title: String,
    onBack: () -> Unit
) {
    val context = LocalContext.current
    val speechHelper = remember { SpeechHelper(context) }

    // ═══════════════════════════════════════════════════════
    //  📖 گرفتن محتوای داستان از Repository
    // ═══════════════════════════════════════════════════════
    val isBilingual = remember(storyId) { StoryRepository.hasContent(storyId) }
    val isEnglishOnly = remember(storyId) { StoryRepository.hasEnContent(storyId) }

    val bilingualText = remember(storyId) {
        if (isBilingual) {
            val chapters = StoryRepository.getChapters(storyId)
            chapters.joinToString("\n\n") { chapter ->
                chapter.paragraphs.joinToString("\n") { p ->
                    "${p.english}\n${p.persian}"
                }
            }
        } else ""
    }

    val englishOnlyText = remember(storyId) {
        if (isEnglishOnly) {
            val enStory = StoryRepository.getEnStory(storyId)
            enStory?.chapters?.joinToString("\n\n") { ch ->
                ch.lines.joinToString("\n")
            } ?: ""
        } else ""
    }

    var showBilingual by remember(storyId) { mutableStateOf(isBilingual) }

    val displayText = remember(showBilingual, bilingualText, englishOnlyText) {
        if (showBilingual) bilingualText else englishOnlyText
    }

    // ═══════════════════════════════════════════════════════
    //  🎙️ منطق پخش و هایلایت
    // ═══════════════════════════════════════════════════════
    val words = remember(displayText) {
        displayText.split(" ").filter { it.isNotBlank() }
    }

    var currentWordIndex by remember { mutableIntStateOf(-1) }
    var isPlaying by remember { mutableStateOf(false) }
    var isPaused by remember { mutableStateOf(false) }
    var playbackSpeed by remember { mutableFloatStateOf(1.0f) }
    var ttsReady by remember { mutableStateOf(false) }

    // 🆕 state دیکشنری
    var tappedWord by remember { mutableStateOf<String?>(null) }
    var tappedEntry by remember { mutableStateOf<DictionaryEntry?>(null) }

    LaunchedEffect(Unit) {
        while (!speechHelper.isInitialized()) delay(100)
        ttsReady = true
    }

    LaunchedEffect(isPlaying, displayText) {
        if (isPlaying && ttsReady && displayText.isNotBlank()) {
            speechHelper.speak(displayText) {
                isPlaying = false
                isPaused = false
                currentWordIndex = -1
            }
            val wordsPerSecond = 2.5f * playbackSpeed
            val delayPerWord = (1000 / wordsPerSecond).toLong()
            for (i in words.indices) {
                if (!isPlaying) break
                currentWordIndex = i
                delay(delayPerWord)
            }
        }
    }

    // 🆕 annotated text با کلمات قابل کلیک
    val annotatedText = remember(currentWordIndex, words) {
        buildAnnotatedString {
            words.forEachIndexed { index, word ->
                val cleanWord = word.trim(
                    '.', ',', '!', '?', ';', ':', '"', '\'',
                    '(', ')', '[', ']', '-', '—', '…'
                )

                pushStringAnnotation(tag = "WORD", annotation = cleanWord)
                if (index == currentWordIndex) {
                    withStyle(SpanStyle(
                        background = Color(0xFFFFEB3B),
                        color = Color(0xFF000000),
                        fontWeight = FontWeight.Bold
                    )) { append(word) }
                } else {
                    withStyle(SpanStyle(
                        color = Color(0xFF1A237E),
                        fontWeight = FontWeight.Normal
                    )) { append(word) }
                }
                pop()

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
                    Text("📖 حالت خوانش", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 17.sp)
                },
                navigationIcon = {
                    IconButton(onClick = {
                        speechHelper.stop()
                        onBack()
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                actions = {
                    if (isBilingual && isEnglishOnly) {
                        TextButton(onClick = { showBilingual = !showBilingual }) {
                            Text(
                                if (showBilingual) "🇮🇷 فارسی" else "🇬🇧 انگلیسی",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.sp
                            )
                        }
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
            // نوار پیشرفت
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
                            fontSize = 12.sp, fontWeight = FontWeight.Bold, color = PrimaryColor
                        )
                        Text(
                            "${(((currentWordIndex + 1).coerceAtLeast(1)) * 100 / words.size.coerceAtLeast(1))}%",
                            fontSize = 12.sp, fontWeight = FontWeight.Bold, color = PrimaryColor
                        )
                    }
                    Spacer(Modifier.height(8.dp))
                    LinearProgressIndicator(
                        progress = { ((currentWordIndex + 1).coerceAtLeast(0)).toFloat() / words.size.coerceAtLeast(1) },
                        modifier = Modifier.fillMaxWidth().height(6.dp).clip(RoundedCornerShape(3.dp)),
                        color = PrimaryColor, trackColor = Color.White
                    )
                }
            }

            // کارت متن
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
                        Text(title, fontSize = 18.sp, fontWeight = FontWeight.Bold, color = PrimaryColor)
                        Spacer(Modifier.height(4.dp))
                        Box(
                            modifier = Modifier
                                .width(40.dp).height(3.dp)
                                .clip(RoundedCornerShape(2.dp))
                                .background(SecondaryColor)
                        )
                        Spacer(Modifier.height(16.dp))

                        if (displayText.isBlank()) {
                            Text(
                                "⚠️ محتوای این داستان هنوز اضافه نشده است.",
                                color = Color.Red, fontSize = 14.sp
                            )
                        } else {
                            // ✅ کلمات قابل کلیک با pointerInput
                            Text(
                                text = annotatedText,
                                fontSize = 18.sp,
                                lineHeight = 34.sp,
                                color = Color(0xFF1A237E),
                                modifier = Modifier.pointerInput(annotatedText) {
                                    detectTapGestures { offset ->
                                        annotatedText
                                            .getStringAnnotations("WORD", offset, offset)
                                            .firstOrNull()
                                            ?.let { annotation ->
                                                val word = annotation.item
                                                if (word.isNotEmpty()) {
                                                    tappedWord = word
                                                    tappedEntry = DictionaryRepository.lookup(context, word)
                                                }
                                            }
                                    }
                                }
                            )
                        }
                    }
                }

                Spacer(Modifier.height(12.dp))

                // راهنما
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE3F2FD))
                ) {
                    Row(
                        modifier = Modifier.padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("💡", fontSize = 16.sp)
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "روی هر کلمه بزن تا معنی و تلفظش را ببینی",
                            fontSize = 11.sp,
                            color = Color(0xFF1565C0)
                        )
                    }
                }
            }

            // نوار کنترل
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp),
                elevation = CardDefaults.cardElevation(12.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text("🎙️ سرعت:", fontSize = 12.sp, color = Color.Gray, fontWeight = FontWeight.SemiBold)
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
                                label = { Text(label, fontSize = 10.sp, fontWeight = FontWeight.Bold) },
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
                            modifier = Modifier.size(50.dp).clip(CircleShape)
                                .background(PrimaryColor.copy(alpha = 0.1f))
                        ) {
                            Icon(Icons.Filled.Replay, "Restart", tint = PrimaryColor, modifier = Modifier.size(24.dp))
                        }

                        Box(
                            modifier = Modifier
                                .size(70.dp).clip(CircleShape)
                                .background(Brush.linearGradient(listOf(PrimaryColor, SecondaryColor)))
                                .pointerInput(isPlaying) {
                                    detectTapGestures {
                                        if (isPlaying) {
                                            speechHelper.stop()
                                            isPlaying = false
                                            isPaused = true
                                        } else {
                                            if (currentWordIndex < 0) currentWordIndex = 0
                                            isPlaying = true
                                            isPaused = false
                                        }
                                    }
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
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
                            modifier = Modifier.size(50.dp).clip(CircleShape)
                                .background(Color(0xFFFFEBEE))
                        ) {
                            Icon(Icons.Filled.Stop, "Stop", tint = Color(0xFFC62828), modifier = Modifier.size(24.dp))
                        }
                    }

                    Spacer(Modifier.height(12.dp))
                    Text(
                        text = when {
                            !ttsReady -> "⏳ در حال آماده‌سازی..."
                            isPlaying -> "🔊 در حال پخش..."
                            isPaused -> "⏸️ متوقف شده"
                            else -> "👆 برای شروع، دکمه پخش را بزن"
                        },
                        fontSize = 12.sp, color = Color.Gray, fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

    // 🆕 پاپ‌آپ دیکشنری
    tappedWord?.let { word ->
        WordPopupDialog(
            word = word,
            entry = tappedEntry,
            speechHelper = speechHelper,
            onDismiss = {
                tappedWord = null
                tappedEntry = null
            }
        )
    }
}