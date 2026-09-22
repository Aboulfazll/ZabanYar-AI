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
import androidx.compose.material.icons.automirrored.filled.VolumeUp
import androidx.compose.material.icons.filled.Headphones
import androidx.compose.material.icons.filled.PlayArrow
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
import com.zabanyar.ai.data.BookRepository
import com.zabanyar.ai.data.LessonContentRepository
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.SpeechHelper

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LessonDetailScreen(
    bookId: String,
    chapterNumber: Int,
    onBack: () -> Unit,
    onNavigateToReadingMode: (String, String) -> Unit = { _, _ -> }
) {
    val context = LocalContext.current
    val book = BookRepository.getBookById(bookId)
    val lessonContent = remember(bookId, chapterNumber) {
        LessonContentRepository.getLessonContent(bookId, chapterNumber)
    }

    if (book == null) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("درس پیدا نشد")
        }
        return
    }

    val accent = Color(book.gradientStart)
    val speechHelper = remember { SpeechHelper(context) }

    DisposableEffect(Unit) {
        onDispose { speechHelper.shutdown() }
    }

    var selectedTab by remember { mutableIntStateOf(0) }
    val tabs = listOf("لغات", "گرامر", "مکالمه", "کوییز")

    var voiceSpeed by remember { mutableFloatStateOf(ProgressManager.getVoiceSpeed(context)) }

    LaunchedEffect(voiceSpeed) {
        speechHelper.setSpeed(voiceSpeed)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "فصل $chapterNumber",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 15.sp
                        )
                        Text(
                            lessonContent.titlePersian,
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "Back", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = accent)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {
            ScrollableTabRow(
                selectedTabIndex = selectedTab,
                containerColor = Color.White,
                contentColor = accent,
                edgePadding = 8.dp,
                divider = {}
            ) {
                tabs.forEachIndexed { index, title ->
                    Tab(
                        selected = selectedTab == index,
                        onClick = { selectedTab = index },
                        text = {
                            Text(
                                title,
                                fontWeight = if (selectedTab == index) FontWeight.Bold else FontWeight.Normal,
                                fontSize = 12.sp
                            )
                        }
                    )
                }
            }

            when (selectedTab) {
                0 -> VocabularyTabContent(
                    words = lessonContent.vocabulary,
                    speechHelper = speechHelper,
                    accent = accent,
                    voiceSpeed = voiceSpeed,
                    onSpeedChange = {
                        voiceSpeed = it
                        speechHelper.setSpeed(it)
                        ProgressManager.setVoiceSpeed(context, it)
                    }
                )
                1 -> GrammarTabContent(lessonContent.grammar, accent)
                2 -> ConversationTabContent(
                    lines = lessonContent.conversation,
                    speechHelper = speechHelper,
                    accent = accent,
                    bookTitle = lessonContent.title,
                    onNavigateToReadingMode = onNavigateToReadingMode
                )
                3 -> QuizTabContent(
                    questions = lessonContent.quiz,
                    accent = accent,
                    bookId = bookId,
                    chapterNumber = chapterNumber,
                    onComplete = {
                        ProgressManager.markLessonCompleted(context, "${bookId}_$chapterNumber")
                        ProgressManager.addStars(context, 50)
                    }
                )
            }
        }
    }
}

// ==================== تب لغات ====================
@Composable
private fun VocabularyTabContent(
    words: List<com.zabanyar.ai.data.VocabWord>,
    speechHelper: SpeechHelper,
    accent: Color,
    voiceSpeed: Float,
    onSpeedChange: (Float) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // کنترل سرعت
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("🎙️", fontSize = 18.sp)
                Spacer(Modifier.width(8.dp))
                Text("سرعت:", fontSize = 11.sp, color = Color.Gray, fontWeight = FontWeight.SemiBold)
                Spacer(Modifier.width(6.dp))
                listOf(0.75f to "آهسته", 1.0f to "معمولی", 1.25f to "سریع").forEach { (speed, label) ->
                    FilterChip(
                        selected = voiceSpeed == speed,
                        onClick = { onSpeedChange(speed) },
                        label = { Text(label, fontSize = 10.sp, fontWeight = FontWeight.Bold) },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = accent,
                            selectedLabelColor = Color.White
                        ),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                }
            }
        }

        Spacer(Modifier.height(12.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                "📖 ${words.size} لغت این درس",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = accent
            )
            Spacer(Modifier.weight(1f))
            Text("👆 برای شنیدن بزن", fontSize = 10.sp, color = Color.Gray)
        }
        Spacer(Modifier.height(12.dp))

        words.forEach { word ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp)
                    .clickable { speechHelper.speak(word.english) },
                shape = RoundedCornerShape(14.dp),
                elevation = CardDefaults.cardElevation(3.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(44.dp)
                            .clip(CircleShape)
                            .background(accent.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            word.english.first().uppercase(),
                            color = accent,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            word.english,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Color(0xFF1A237E)
                        )
                        if (word.pronunciation.isNotEmpty()) {
                            Text("/${word.pronunciation}/", fontSize = 11.sp, color = Color.Gray)
                        }
                        Spacer(Modifier.height(3.dp))
                        Text(
                            word.persian,
                            color = accent,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    IconButton(
                        onClick = { speechHelper.speak(word.english) },
                        modifier = Modifier
                            .size(42.dp)
                            .clip(CircleShape)
                            .background(accent.copy(alpha = 0.12f))
                    ) {
                        Icon(
                            Icons.AutoMirrored.Filled.VolumeUp,
                            "Play",
                            tint = accent,
                            modifier = Modifier.size(22.dp)
                        )
                    }
                }
            }
        }
    }
}

// ==================== تب گرامر ====================
@Composable
private fun GrammarTabContent(
    grammar: List<com.zabanyar.ai.data.GrammarSection>,
    accent: Color
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.linearGradient(listOf(accent, accent.copy(alpha = 0.7f))))
                    .padding(20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("📝", fontSize = 28.sp)
                    }
                    Spacer(Modifier.width(14.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "درس گرامر",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.9f),
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            "نکات کلیدی این فصل",
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        grammar.forEach { section ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        section.title,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = accent
                    )
                    Spacer(Modifier.height(10.dp))
                    Text(
                        section.content,
                        fontSize = 13.sp,
                        color = Color(0xFF424242),
                        lineHeight = 22.sp
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9))
        ) {
            Row(modifier = Modifier.padding(14.dp), verticalAlignment = Alignment.Top) {
                Text("💡", fontSize = 20.sp)
                Spacer(Modifier.width(10.dp))
                Column {
                    Text(
                        "نکته یادگیری",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF2E7D32)
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        "هر روز ۱۰ دقیقه این گرامر رو مرور کن. مثال‌ها رو با صدای بلند بخون.",
                        fontSize = 11.sp,
                        color = Color(0xFF424242),
                        lineHeight = 18.sp
                    )
                }
            }
        }
    }
}

// ==================== تب مکالمه ====================
@Composable
private fun ConversationTabContent(
    lines: List<com.zabanyar.ai.data.DialogueLine>,
    speechHelper: SpeechHelper,
    accent: Color,
    bookTitle: String,
    onNavigateToReadingMode: (String, String) -> Unit
) {
    val fullText = lines.joinToString(" ") { it.english }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // دکمه حالت خوانش
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onNavigateToReadingMode("$bookTitle - مکالمه", fullText)
                },
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.linearGradient(listOf(accent, accent.copy(alpha = 0.7f))))
                    .padding(16.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .size(46.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.25f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Filled.Headphones, null, tint = Color.White, modifier = Modifier.size(24.dp))
                    }
                    Spacer(Modifier.width(12.dp))
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            "🎧 حالت خوانش تعاملی",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "کلمه‌به‌کلمه با هایلایت گوش کن",
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.9f)
                        )
                    }
                    Text("→", color = Color.White, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        Button(
            onClick = { speechHelper.speak(fullText) },
            modifier = Modifier.fillMaxWidth().height(50.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
        ) {
            Icon(Icons.Filled.PlayArrow, null, modifier = Modifier.size(20.dp))
            Spacer(Modifier.width(8.dp))
            Text("پخش کل مکالمه", color = Color.White, fontWeight = FontWeight.Bold)
        }

        Spacer(Modifier.height(16.dp))

        lines.forEachIndexed { index, line ->
            val isA = index % 2 == 0
            val bubbleAccent = if (isA) accent else Color(0xFF7B1FA2)

            Row(
                modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp),
                horizontalArrangement = if (isA) Arrangement.Start else Arrangement.End
            ) {
                Card(
                    modifier = Modifier
                        .widthIn(max = 300.dp)
                        .clickable { speechHelper.speak(line.english) },
                    shape = RoundedCornerShape(
                        topStart = 18.dp, topEnd = 18.dp,
                        bottomStart = if (isA) 4.dp else 18.dp,
                        bottomEnd = if (isA) 18.dp else 4.dp
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = if (isA) accent.copy(alpha = 0.12f)
                        else Color(0xFFF3E5F5)
                    ),
                    elevation = CardDefaults.cardElevation(2.dp)
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                line.speaker,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = bubbleAccent
                            )
                            Spacer(Modifier.weight(1f))
                            Icon(
                                Icons.AutoMirrored.Filled.VolumeUp,
                                null,
                                tint = bubbleAccent,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                        Spacer(Modifier.height(6.dp))
                        Text(
                            line.english,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF1A237E),
                            lineHeight = 20.sp
                        )
                        Spacer(Modifier.height(6.dp))
                        Divider(color = bubbleAccent.copy(alpha = 0.2f))
                        Spacer(Modifier.height(6.dp))
                        Text(
                            line.persian,
                            fontSize = 12.sp,
                            color = Color(0xFF616161),
                            lineHeight = 18.sp
                        )
                    }
                }
            }
        }
    }
}

// ==================== تب کوییز ====================
@Composable
private fun QuizTabContent(
    questions: List<com.zabanyar.ai.data.QuizQuestion>,
    accent: Color,
    bookId: String,
    chapterNumber: Int,
    onComplete: () -> Unit
) {
    var currentQuestion by remember { mutableIntStateOf(0) }
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }
    var completed by remember { mutableStateOf(false) }

    if (showResult) {
        val percentage = if (questions.isNotEmpty())
            (score.toFloat() / questions.size * 100).toInt() else 0
        val resultColor = when {
            percentage >= 90 -> Color(0xFF11998E)
            percentage >= 70 -> Color(0xFFFF9800)
            else -> Color(0xFFE53935)
        }

        LaunchedEffect(Unit) {
            if (!completed && percentage >= 50) {
                onComplete()
                completed = true
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(20.dp))
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                elevation = CardDefaults.cardElevation(12.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Brush.verticalGradient(listOf(resultColor, resultColor.copy(alpha = 0.75f))))
                        .padding(28.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            when {
                                percentage >= 90 -> "🏆"
                                percentage >= 70 -> "🎯"
                                else -> "💪"
                            },
                            fontSize = 72.sp
                        )
                        Spacer(Modifier.height(12.dp))
                        Text(
                            when {
                                percentage >= 90 -> "عالی! فوق‌العاده!"
                                percentage >= 70 -> "خوب بود!"
                                else -> "نیاز به تمرین بیشتر"
                            },
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Spacer(Modifier.height(16.dp))
                        Box(
                            modifier = Modifier
                                .size(130.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text("$percentage%", fontSize = 36.sp, fontWeight = FontWeight.Bold, color = Color.White)
                                Text("$score از ${questions.size}", fontSize = 12.sp, color = Color.White.copy(alpha = 0.9f))
                            }
                        }
                    }
                }
            }

            if (percentage >= 50) {
                Spacer(Modifier.height(16.dp))
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9))
                ) {
                    Row(modifier = Modifier.padding(14.dp), verticalAlignment = Alignment.CenterVertically) {
                        Text("⭐", fontSize = 22.sp)
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text("+۵۰ امتیاز گرفتی!", fontSize = 14.sp, fontWeight = FontWeight.Bold, color = Color(0xFF2E7D32))
                            Text("درس تکمیل شد", fontSize = 11.sp, color = Color(0xFF5D4037))
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            Button(
                onClick = {
                    currentQuestion = 0
                    selectedOption = null
                    score = 0
                    showResult = false
                },
                modifier = Modifier.fillMaxWidth().height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = accent)
            ) {
                Text("🔄 تلاش مجدد", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }
        return
    }

    if (questions.isEmpty()) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("کوییز موجود نیست")
        }
        return
    }

    val q = questions[currentQuestion]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("سوال ${currentQuestion + 1} از ${questions.size}", fontSize = 13.sp, color = Color.Gray, fontWeight = FontWeight.SemiBold)
            Text("امتیاز: $score", fontSize = 13.sp, color = accent, fontWeight = FontWeight.Bold)
        }

        Spacer(Modifier.height(8.dp))
        LinearProgressIndicator(
            progress = { (currentQuestion + 1).toFloat() / questions.size },
            modifier = Modifier.fillMaxWidth().height(8.dp).clip(RoundedCornerShape(4.dp)),
            color = accent,
            trackColor = accent.copy(alpha = 0.15f)
        )

        Spacer(Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Brush.verticalGradient(listOf(accent.copy(alpha = 0.1f), Color.White)))
                    .padding(20.dp)
            ) {
                Text(
                    q.question,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 26.sp,
                    color = Color(0xFF1A237E)
                )
            }
        }

        Spacer(Modifier.height(20.dp))

        q.options.forEachIndexed { index, option ->
            val isSelected = selectedOption == index
            val isCorrect = index == q.correctIndex
            val showFeedback = selectedOption != null

            val bgColor = when {
                !showFeedback -> Color.White
                isCorrect -> Color(0xFFE8F5E9)
                isSelected -> Color(0xFFFFEBEE)
                else -> Color.White
            }

            val borderColor = when {
                !showFeedback -> Color(0xFFE0E0E0)
                isCorrect -> Color(0xFF43A047)
                isSelected -> Color(0xFFE53935)
                else -> Color(0xFFE0E0E0)
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp)
                    .clickable {
                        if (selectedOption == null) {
                            selectedOption = index
                            if (isCorrect) score++
                        }
                    },
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = bgColor),
                border = androidx.compose.foundation.BorderStroke(2.dp, borderColor),
                elevation = CardDefaults.cardElevation(2.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(accent.copy(alpha = 0.15f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            when {
                                showFeedback && isCorrect -> "✓"
                                showFeedback && isSelected -> "✗"
                                else -> listOf("A", "B", "C", "D")[index]
                            },
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = when {
                                showFeedback && isCorrect -> Color(0xFF43A047)
                                showFeedback && isSelected -> Color(0xFFE53935)
                                else -> accent
                            }
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Text(
                        option,
                        fontSize = 14.sp,
                        color = Color(0xFF333333),
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        if (selectedOption != null) {
            Button(
                onClick = {
                    if (currentQuestion < questions.size - 1) {
                        currentQuestion++
                        selectedOption = null
                    } else {
                        showResult = true
                    }
                },
                modifier = Modifier.fillMaxWidth().height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = accent)
            ) {
                Text(
                    if (currentQuestion < questions.size - 1) "سوال بعدی ←" else "دیدن نتیجه 🎉",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }
        }
    }
}