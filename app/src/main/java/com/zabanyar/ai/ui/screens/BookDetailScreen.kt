package com.zabanyar.ai.ui.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.LevelTestRepository
import com.zabanyar.ai.data.UserManager
import kotlinx.coroutines.delay

// ============================================================
// States
// ============================================================
enum class TestPhase { WELCOME, TESTING, REVIEW, RESULT }

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelTestScreen(
    onBack: () -> Unit,
    onTestComplete: () -> Unit = {}
) {
    val context = LocalContext.current

    // ============ Phase ============
    var phase by remember { mutableStateOf(TestPhase.WELCOME) }

    // ============ Questions ============
    var questions by remember { mutableStateOf(LevelTestRepository.getRandomQuestions(20)) }

    // ============ Test State ============
    var currentQuestion by remember { mutableIntStateOf(0) }
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableIntStateOf(0) }
    var wrongAnswers by remember { mutableStateOf(mutableListOf<Int>()) }
    var flaggedQuestions by remember { mutableStateOf(mutableSetOf<Int>()) }
    var userAnswers by remember { mutableStateOf<MutableMap<Int, Int?>>(mutableMapOf()) }

    // ============ Timer ============
    var questionTime by remember { mutableIntStateOf(0) }
    var totalTime by remember { mutableIntStateOf(0) }

    // ============ Per-Question Timer ============
    LaunchedEffect(phase, currentQuestion) {
        if (phase == TestPhase.TESTING) {
            questionTime = 0
            while (phase == TestPhase.TESTING) {
                delay(1000)
                questionTime++
                totalTime++
            }
        }
    }

    // ============ Save Level on Result ============
    LaunchedEffect(phase) {
        if (phase == TestPhase.RESULT) {
            val level = LevelTestRepository.calculateLevel(score, questions.size)
            UserManager.updateLevel(context, level)
        }
    }

    // ============ Back Handling ============
    fun handleBack() {
        when (phase) {
            TestPhase.WELCOME -> onBack()
            TestPhase.TESTING -> {
                if (currentQuestion > 0) {
                    currentQuestion--
                    selectedOption = userAnswers[currentQuestion]
                } else {
                    phase = TestPhase.WELCOME
                }
            }
            TestPhase.REVIEW -> phase = TestPhase.TESTING
            TestPhase.RESULT -> onBack()
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            when (phase) {
                                TestPhase.WELCOME -> "🎯 تست سطح"
                                TestPhase.TESTING -> "🎯 تست سطح"
                                TestPhase.REVIEW -> "📋 مرور"
                                TestPhase.RESULT -> "📊 نتیجه"
                            },
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 17.sp
                        )
                        if (phase == TestPhase.TESTING) {
                            Text(
                                "سوال ${currentQuestion + 1} از ${questions.size}",
                                fontSize = 11.sp,
                                color = Color.White.copy(alpha = 0.85f)
                            )
                        }
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { handleBack() }) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            "Back",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    if (phase == TestPhase.TESTING) {
                        // Flag
                        IconButton(onClick = {
                            if (flaggedQuestions.contains(currentQuestion)) {
                                flaggedQuestions.remove(currentQuestion)
                            } else {
                                flaggedQuestions.add(currentQuestion)
                            }
                        }) {
                            Icon(
                                if (flaggedQuestions.contains(currentQuestion))
                                    Icons.Filled.Flag
                                else Icons.Filled.OutlinedFlag,
                                "Flag",
                                tint = Color.White
                            )
                        }
                        // Timer
                        Row(
                            modifier = Modifier
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.White.copy(alpha = 0.15f))
                                .padding(horizontal = 10.dp, vertical = 4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                Icons.Filled.Timer,
                                null,
                                tint = Color.White,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(Modifier.width(4.dp))
                            Text(
                                formatTime(questionTime),
                                fontSize = 12.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = PrimaryColor)
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
        ) {
            when (phase) {
                TestPhase.WELCOME -> WelcomeView(
                    onStart = {
                        questions = LevelTestRepository.getRandomQuestions(20)
                        currentQuestion = 0
                        selectedOption = null
                        score = 0
                        wrongAnswers = mutableListOf()
                        flaggedQuestions = mutableSetOf()
                        userAnswers = mutableMapOf()
                        questionTime = 0
                        totalTime = 0
                        phase = TestPhase.TESTING
                    }
                )

                TestPhase.TESTING -> TestView(
                    questions = questions,
                    currentQuestion = currentQuestion,
                    selectedOption = selectedOption,
                    score = score,
                    userAnswers = userAnswers,
                    flaggedQuestions = flaggedQuestions,
                    onSelectOption = { index ->
                        if (selectedOption == null) {
                            selectedOption = index
                            userAnswers[currentQuestion] = index
                            val isCorrect = index == questions[currentQuestion].correctIndex
                            if (isCorrect) {
                                score++
                            } else {
                                wrongAnswers.add(currentQuestion)
                            }
                        }
                    },
                    onNext = {
                        if (currentQuestion < questions.size - 1) {
                            currentQuestion++
                            selectedOption = userAnswers[currentQuestion]
                        } else {
                            phase = TestPhase.REVIEW
                        }
                    },
                    onPrevious = {
                        if (currentQuestion > 0) {
                            currentQuestion--
                            selectedOption = userAnswers[currentQuestion]
                        }
                    },
                    onJumpTo = { index ->
                        currentQuestion = index
                        selectedOption = userAnswers[index]
                    },
                    onFinish = { phase = TestPhase.REVIEW }
                )

                TestPhase.REVIEW -> ReviewView(
                    questions = questions,
                    userAnswers = userAnswers,
                    flaggedQuestions = flaggedQuestions,
                    onJumpTo = { index ->
                        currentQuestion = index
                        selectedOption = userAnswers[index]
                        phase = TestPhase.TESTING
                    },
                    onFinish = { phase = TestPhase.RESULT }
                )

                TestPhase.RESULT -> ResultView(
                    score = score,
                    total = questions.size,
                    totalTime = totalTime,
                    wrongAnswers = wrongAnswers,
                    questions = questions,
                    onRetry = {
                        questions = LevelTestRepository.getRandomQuestions(20)
                        currentQuestion = 0
                        selectedOption = null
                        score = 0
                        wrongAnswers = mutableListOf()
                        flaggedQuestions = mutableSetOf()
                        userAnswers = mutableMapOf()
                        questionTime = 0
                        totalTime = 0
                        phase = TestPhase.TESTING
                    },
                    onBack = {
                        onTestComplete()
                        onBack()
                    }
                )
            }
        }
    }
}

// ============================================================
// Welcome View
// ============================================================
@Composable
private fun WelcomeView(onStart: () -> Unit) {
    val infiniteTransition = rememberInfiniteTransition(label = "welcome")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.1f,
        animationSpec = infiniteRepeatable(
            animation = tween(1500, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "scale"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(30.dp))

        Box(
            modifier = Modifier
                .size(140.dp)
                .clip(CircleShape)
                .background(
                    Brush.linearGradient(
                        listOf(PrimaryColor, SecondaryColor)
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text("🎯", fontSize = 70.sp, modifier = Modifier.scale(scale))
        }

        Spacer(Modifier.height(24.dp))

        Text(
            "تست سطح زبان",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            color = PrimaryColor
        )

        Spacer(Modifier.height(8.dp))

        Text(
            "سطح انگلیسی خودت رو دقیق بسنج",
            fontSize = 14.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(30.dp))

        // Info Cards
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(modifier = Modifier.padding(18.dp)) {
                InfoRow("📝", "۲۰ سوال", "از سطوح مختلف")
                Spacer(Modifier.height(12.dp))
                Divider(color = Color.LightGray.copy(alpha = 0.3f))
                Spacer(Modifier.height(12.dp))
                InfoRow("⏱️", "بدون محدودیت", "با زمان‌بندی دقیق")
                Spacer(Modifier.height(12.dp))
                Divider(color = Color.LightGray.copy(alpha = 0.3f))
                Spacer(Modifier.height(12.dp))
                InfoRow("🎯", "۳ سطح", "مبتدی • متوسط • پیشرفته")
                Spacer(Modifier.height(12.dp))
                Divider(color = Color.LightGray.copy(alpha = 0.3f))
                Spacer(Modifier.height(12.dp))
                InfoRow("🔁", "دوباره‌پذیر", "سوالات جدید در هر تلاش")
            }
        }

        Spacer(Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(14.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0))
        ) {
            Row(
                modifier = Modifier.padding(14.dp),
                verticalAlignment = Alignment.Top
            ) {
                Text("💡", fontSize = 22.sp)
                Spacer(Modifier.width(10.dp))
                Column {
                    Text(
                        "نکته",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFE65100)
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(
                        "سعی کن بدون تقلب جواب بدی تا نتیجه دقیق‌تر بشه.",
                        fontSize = 12.sp,
                        color = Color(0xFF6D4C41),
                        lineHeight = 18.sp
                    )
                }
            }
        }

        Spacer(Modifier.height(30.dp))

        Button(
            onClick = onStart,
            modifier = Modifier
                .fillMaxWidth()
                .height(58.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
        ) {
            Icon(Icons.Filled.PlayArrow, null, modifier = Modifier.size(22.dp))
            Spacer(Modifier.width(8.dp))
            Text(
                "شروع تست",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(Modifier.height(30.dp))
    }
}

@Composable
private fun InfoRow(emoji: String, title: String, subtitle: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(PrimaryColor.copy(alpha = 0.1f)),
            contentAlignment = Alignment.Center
        ) {
            Text(emoji, fontSize = 20.sp)
        }
        Spacer(Modifier.width(12.dp))
        Column {
            Text(
                title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor
            )
            Text(
                subtitle,
                fontSize = 11.sp,
                color = Color.Gray
            )
        }
    }
}

// ============================================================
// Test View
// ============================================================
@Composable
private fun TestView(
    questions: List<LevelTestRepository.Question>,
    currentQuestion: Int,
    selectedOption: Int?,
    score: Int,
    userAnswers: Map<Int, Int?>,
    flaggedQuestions: Set<Int>,
    onSelectOption: (Int) -> Unit,
    onNext: () -> Unit,
    onPrevious: () -> Unit,
    onJumpTo: (Int) -> Unit,
    onFinish: () -> Unit
) {
    if (questions.isEmpty()) return

    val q = questions[currentQuestion]
    val progress = (currentQuestion + 1).toFloat() / questions.size

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        // Progress Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(3.dp)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .background(PrimaryColor.copy(alpha = 0.15f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Text("🎯", fontSize = 18.sp)
                        }
                        Spacer(Modifier.width(10.dp))
                        Column {
                            Text(
                                "سوال ${currentQuestion + 1} از ${questions.size}",
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                color = PrimaryColor
                            )
                            Text(
                                "سطح: ${q.level}",
                                fontSize = 10.sp,
                                color = Color.Gray
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .background(PrimaryColor.copy(alpha = 0.1f))
                            .padding(horizontal = 10.dp, vertical = 4.dp)
                    ) {
                        Text(
                            "امتیاز: $score",
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                    }
                }

                Spacer(Modifier.height(10.dp))

                LinearProgressIndicator(
                    progress = { progress },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = PrimaryColor,
                    trackColor = PrimaryColor.copy(alpha = 0.15f)
                )

                Spacer(Modifier.height(10.dp))

                // Question Dots
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState()),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    questions.indices.forEach { idx ->
                        val answered = userAnswers[idx] != null
                        val flagged = flaggedQuestions.contains(idx)
                        val isCurrent = idx == currentQuestion

                        Box(
                            modifier = Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .background(
                                    when {
                                        isCurrent -> PrimaryColor
                                        flagged -> Color(0xFFFFC107)
                                        answered -> Color(0xFF4CAF50)
                                        else -> Color(0xFFE0E0E0)
                                    }
                                )
                                .clickable { onJumpTo(idx) },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "${idx + 1}",
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                                color = if (isCurrent || flagged || answered) Color.White
                                else Color.Gray
                            )
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(8.dp))

        // Question Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(5.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            listOf(PrimaryColor.copy(alpha = 0.08f), Color.White)
                        )
                    )
                    .padding(20.dp)
            ) {
                Column {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                            modifier = Modifier
                                .size(26.dp)
                                .clip(CircleShape)
                                .background(PrimaryColor),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "?",
                                color = Color.White,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Spacer(Modifier.width(10.dp))
                        Text(
                            "کدام گزینه درست است؟",
                            fontSize = 11.sp,
                            color = PrimaryColor,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Spacer(Modifier.height(14.dp))
                    Text(
                        q.question,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 26.sp,
                        color = Color(0xFF1A237E)
                    )
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        // Options
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

            val scale by animateFloatAsState(
                targetValue = if (isSelected) 1.02f else 1f,
                animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy),
                label = "scale"
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 5.dp)
                    .scale(scale)
                    .clickable(enabled = selectedOption == null) { onSelectOption(index) },
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = bgColor),
                border = BorderStroke(2.dp, borderColor),
                elevation = CardDefaults.cardElevation(if (isSelected) 4.dp else 2.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .size(36.dp)
                            .clip(CircleShape)
                            .background(
                                when {
                                    showFeedback && isCorrect -> Color(0xFF43A047).copy(alpha = 0.15f)
                                    showFeedback && isSelected -> Color(0xFFE53935).copy(alpha = 0.15f)
                                    else -> PrimaryColor.copy(alpha = 0.15f)
                                }
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            when {
                                showFeedback && isCorrect -> "✓"
                                showFeedback && isSelected -> "✗"
                                else -> listOf("A", "B", "C", "D").getOrElse(index) { "${index + 1}" }
                            },
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = when {
                                showFeedback && isCorrect -> Color(0xFF43A047)
                                showFeedback && isSelected -> Color(0xFFE53935)
                                else -> PrimaryColor
                            }
                        )
                    }
                    Spacer(Modifier.width(12.dp))
                    Text(
                        option,
                        fontSize = 14.sp,
                        color = Color(0xFF333333),
                        fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal,
                        modifier = Modifier.weight(1f),
                        lineHeight = 20.sp
                    )
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        // Navigation Buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            if (currentQuestion > 0) {
                OutlinedButton(
                    onClick = onPrevious,
                    modifier = Modifier
                        .weight(1f)
                        .height(54.dp),
                    shape = RoundedCornerShape(14.dp)
                ) {
                    Text(
                        "قبلی",
                        color = PrimaryColor,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Button(
                onClick = {
                    if (selectedOption != null) onNext()
                },
                enabled = selectedOption != null,
                modifier = Modifier
                    .weight(if (currentQuestion > 0) 2f else 1f)
                    .height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryColor,
                    disabledContainerColor = Color(0xFFBDBDBD)
                )
            ) {
                Text(
                    if (currentQuestion < questions.size - 1) "سوال بعدی"
                    else "مرور و پایان",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.width(6.dp))
                Icon(
                    if (currentQuestion < questions.size - 1) Icons.Filled.ArrowForward
                    else Icons.Filled.CheckCircle,
                    null,
                    modifier = Modifier.size(18.dp)
                )
            }
        }

        Spacer(Modifier.height(30.dp))
    }
}

// ============================================================
// Review View
// ============================================================
@Composable
private fun ReviewView(
    questions: List<LevelTestRepository.Question>,
    userAnswers: Map<Int, Int?>,
    flaggedQuestions: Set<Int>,
    onJumpTo: (Int) -> Unit,
    onFinish: () -> Unit
) {
    val answeredCount = userAnswers.count { it.value != null }
    val unansweredCount = questions.size - answeredCount

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("📋", fontSize = 28.sp)
                    Spacer(Modifier.width(12.dp))
                    Column {
                        Text(
                            "مرور پاسخ‌ها",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = PrimaryColor
                        )
                        Text(
                            "قبل از پایان، جواب‌هات رو چک کن",
                            fontSize = 11.sp,
                            color = Color.Gray
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))
                Divider(color = Color.LightGray.copy(alpha = 0.3f))
                Spacer(Modifier.height(16.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ReviewStat("✅", "$answeredCount", "پاسخ داده", Color(0xFF43A047))
                    ReviewStat("⭕", "$unansweredCount", "بدون پاسخ", Color(0xFFE53935))
                    ReviewStat("🚩", "${flaggedQuestions.size}", "علامت‌گذاری", Color(0xFFFFC107))
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        // Grid of questions
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(3.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    "لیست سوالات",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryColor
                )
                Spacer(Modifier.height(12.dp))

                // Grid 5 columns
                val rows = (questions.size + 4) / 5
                for (row in 0 until rows) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        for (col in 0 until 5) {
                            val idx = row * 5 + col
                            if (idx < questions.size) {
                                val answered = userAnswers[idx] != null
                                val flagged = flaggedQuestions.contains(idx)

                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .aspectRatio(1f)
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(
                                            when {
                                                flagged -> Color(0xFFFFC107).copy(alpha = 0.2f)
                                                answered -> Color(0xFF43A047).copy(alpha = 0.15f)
                                                else -> Color(0xFFE0E0E0).copy(alpha = 0.5f)
                                            }
                                        )
                                        .clickable { onJumpTo(idx) },
                                    contentAlignment = Alignment.Center
                                ) {
                                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                        Text(
                                            "${idx + 1}",
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = when {
                                                flagged -> Color(0xFFFF8F00)
                                                answered -> Color(0xFF2E7D32)
                                                else -> Color.Gray
                                            }
                                        )
                                        if (flagged) {
                                            Text("🚩", fontSize = 8.sp)
                                        }
                                    }
                                }
                            } else {
                                Spacer(Modifier.weight(1f))
                            }
                        }
                    }
                    if (row < rows - 1) Spacer(Modifier.height(8.dp))
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        if (unansweredCount > 0) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0))
            ) {
                Row(
                    modifier = Modifier.padding(14.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("⚠️", fontSize = 22.sp)
                    Spacer(Modifier.width(10.dp))
                    Text(
                        "$unansweredCount سوال بدون پاسخ داری. مطمئنی می‌خوای تموم کنی؟",
                        fontSize = 12.sp,
                        color = Color(0xFFE65100),
                        lineHeight = 18.sp
                    )
                }
            }
            Spacer(Modifier.height(16.dp))
        }

        Button(
            onClick = onFinish,
            modifier = Modifier
                .fillMaxWidth()
                .height(58.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
        ) {
            Icon(Icons.Filled.Check, null, modifier = Modifier.size(22.dp))
            Spacer(Modifier.width(8.dp))
            Text(
                "دیدن نتیجه نهایی",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(Modifier.height(30.dp))
    }
}

@Composable
private fun ReviewStat(emoji: String, value: String, label: String, color: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(46.dp)
                .clip(CircleShape)
                .background(color.copy(alpha = 0.15f)),
            contentAlignment = Alignment.Center
        ) {
            Text(emoji, fontSize = 22.sp)
        }
        Spacer(Modifier.height(4.dp))
        Text(
            value,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = color
        )
        Text(
            label,
            fontSize = 10.sp,
            color = Color.Gray
        )
    }
}

// ============================================================
// Result View
// ============================================================
@Composable
private fun ResultView(
    score: Int,
    total: Int,
    totalTime: Int,
    wrongAnswers: List<Int>,
    questions: List<LevelTestRepository.Question>,
    onRetry: () -> Unit,
    onBack: () -> Unit
) {
    val percentage = if (total > 0) (score.toFloat() / total * 100).toInt() else 0
    val level = LevelTestRepository.calculateLevel(score, total)
    val levelPersian = LevelTestRepository.getLevelPersian(level)
    val levelEmoji = when (level) {
        "BEGINNER" -> "🌱"
        "INTERMEDIATE" -> "🚀"
        else -> "🏆"
    }
    val levelColor = when (level) {
        "BEGINNER" -> Color(0xFF43A047)
        "INTERMEDIATE" -> Color(0xFFFF9800)
        else -> Color(0xFFE53935)
    }
    val levelMessage = when (level) {
        "BEGINNER" -> "تو تازه شروع کردی! از کتاب‌های مبتدی شروع کن و کم‌کم پیشرفت کن."
        "INTERMEDIATE" -> "سطح تو متوسطه! می‌تونی کتاب‌های متوسط رو بخونی و مهارت‌هات رو تقویت کنی."
        else -> "عالی! سطح تو پیشرفته‌ست. کتاب‌های چالشی و متن‌های پیشرفته رو امتحان کن."
    }

    val infiniteTransition = rememberInfiniteTransition(label = "result")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.1f,
        animationSpec = infiniteRepeatable(
            animation = tween(1000, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "scale"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(20.dp))

        // Level Card
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Brush.verticalGradient(
                            listOf(levelColor, levelColor.copy(alpha = 0.75f))
                        )
                    )
                    .padding(28.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        levelEmoji,
                        fontSize = 80.sp,
                        modifier = Modifier.scale(scale)
                    )
                    Spacer(Modifier.height(12.dp))
                    Text(
                        "سطح تو:",
                        fontSize = 14.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )
                    Text(
                        levelPersian,
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Spacer(Modifier.height(16.dp))
                    Box(
                        modifier = Modifier
                            .size(140.dp)
                            .clip(CircleShape)
                            .background(Color.White.copy(alpha = 0.2f)),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Text(
                                "$percentage%",
                                fontSize = 40.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )
                            Text(
                                "$score از $total",
                                fontSize = 12.sp,
                                color = Color.White.copy(alpha = 0.9f)
                            )
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        // Stats Row
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(3.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ReviewStat("✅", "$score", "درست", Color(0xFF43A047))
                ReviewStat("❌", "${total - score}", "غلط", Color(0xFFE53935))
                ReviewStat("⏱️", formatTime(totalTime), "زمان", PrimaryColor)
            }
        }

        Spacer(Modifier.height(16.dp))

        // Suggestion
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.Top
            ) {
                Text("💡", fontSize = 24.sp)
                Spacer(Modifier.width(12.dp))
                Column {
                    Text(
                        "پیشنهاد ما",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor
                    )
                    Spacer(Modifier.height(6.dp))
                    Text(
                        levelMessage,
                        fontSize = 13.sp,
                        color = Color(0xFF424242),
                        lineHeight = 20.sp
                    )
                }
            }
        }

        // Wrong Answers
        if (wrongAnswers.isNotEmpty()) {
            Spacer(Modifier.height(16.dp))
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                elevation = CardDefaults.cardElevation(3.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text("📋", fontSize = 20.sp)
                        Spacer(Modifier.width(8.dp))
                        Text(
                            "مرور اشتباهات (${wrongAnswers.size})",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFC62828)
                        )
                    }
                    Spacer(Modifier.height(10.dp))
                    Divider(color = Color.LightGray.copy(alpha = 0.3f))
                    Spacer(Modifier.height(8.dp))

                    wrongAnswers.take(5).forEach { idx ->
                        if (idx < questions.size) {
                            val q = questions[idx]
                            Column(modifier = Modifier.padding(vertical = 6.dp)) {
                                Text(
                                    "❌ ${q.question}",
                                    fontSize = 12.sp,
                                    color = Color(0xFF424242),
                                    fontWeight = FontWeight.SemiBold,
                                    lineHeight = 18.sp
                                )
                                Text(
                                    "✅ پاسخ درست: ${q.options[q.correctIndex]}",
                                    fontSize = 11.sp,
                                    color = Color(0xFF2E7D32),
                                    modifier = Modifier.padding(top = 3.dp),
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                    if (wrongAnswers.size > 5) {
                        Text(
                            "و ${wrongAnswers.size - 5} سوال دیگر...",
                            fontSize = 11.sp,
                            color = Color.Gray,
                            modifier = Modifier.padding(top = 6.dp)
                        )
                    }
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        // Retry
        Button(
            onClick = onRetry,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(16.dp),
            colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
        ) {
            Icon(Icons.Filled.Refresh, null, modifier = Modifier.size(22.dp))
            Spacer(Modifier.width(8.dp))
            Text(
                "تست مجدد (۲۰ سوال جدید)",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }

        Spacer(Modifier.height(10.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp),
            shape = RoundedCornerShape(14.dp)
        ) {
            Text(
                "بازگشت به صفحه اصلی",
                color = PrimaryColor,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }

        Spacer(Modifier.height(30.dp))
    }
}

// ============================================================
// Helpers
// ============================================================
private fun formatTime(seconds: Int): String {
    val m = seconds / 60
    val s = seconds % 60
    return "%02d:%02d".format(m, s)
}