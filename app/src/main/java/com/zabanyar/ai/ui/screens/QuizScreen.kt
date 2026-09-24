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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zabanyar.ai.data.LessonContentRepository
import com.zabanyar.ai.data.ProgressManager
import com.zabanyar.ai.data.QuizQuestion
import com.zabanyar.ai.ui.theme.PrimaryColor      // 👈 اضافه شد
import com.zabanyar.ai.ui.theme.SecondaryColor    // 👈 اضافه شد
import kotlinx.coroutines.delay

// ============================================================
// Quiz Screen - Advanced
// ============================================================
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuizScreen(
    bookId: String,
    quizIndex: Int,
    totalChapters: Int,
    bookTitle: String,
    onBack: () -> Unit = {},
    onQuizCompleted: (passed: Boolean) -> Unit = {}
) {
    val context = LocalContext.current

    var quizQuestions by remember { mutableStateOf<List<QuizQuestion>>(emptyList()) }
    var currentQuestionIndex by remember { mutableIntStateOf(0) }
    var selectedAnswer by remember { mutableIntStateOf(-1) }
    var userAnswers by remember { mutableStateOf<List<Int>>(emptyList()) }
    var showResult by remember { mutableStateOf(false) }
    var quizResult by remember { mutableStateOf<ProgressManager.QuizResult?>(null) }
    var timeElapsed by remember { mutableIntStateOf(0) }
    var isLoading by remember { mutableStateOf(true) }
    var errorMessage by remember { mutableStateOf<String?>(null) }
    var showExitDialog by remember { mutableStateOf(false) }

    fun loadQuestions() {
        isLoading = true
        errorMessage = null
        try {
            val firstCh = quizIndex * ProgressManager.CHAPTERS_PER_GROUP + 1
            val lastCh = minOf(
                firstCh + ProgressManager.CHAPTERS_PER_GROUP - 1,
                totalChapters
            )

            val allQuestions = mutableListOf<QuizQuestion>()
            for (ch in firstCh..lastCh) {
                val content = LessonContentRepository.getLessonContent(bookId, ch)
                allQuestions.addAll(content.quiz)
            }

            if (allQuestions.size < ProgressManager.QUESTIONS_PER_QUIZ) {
                errorMessage = "سوالات کافی برای آزمون وجود ندارد (${allQuestions.size} سوال)"
                isLoading = false
                return
            }

            quizQuestions = allQuestions
                .shuffled()
                .take(ProgressManager.QUESTIONS_PER_QUIZ)

            isLoading = false
        } catch (e: Exception) {
            errorMessage = "خطا در بارگذاری سوالات: ${e.message}"
            isLoading = false
        }
    }

    LaunchedEffect(quizIndex) {
        loadQuestions()
    }

    LaunchedEffect(showResult, isLoading) {
        if (!showResult && !isLoading && errorMessage == null) {
            while (true) {
                delay(1000)
                timeElapsed++
            }
        }
    }

    LaunchedEffect(currentQuestionIndex, userAnswers) {
        if (quizQuestions.isNotEmpty() &&
            currentQuestionIndex >= quizQuestions.size &&
            !showResult
        ) {
            val score = userAnswers.indices.count { idx ->
                idx < quizQuestions.size &&
                        userAnswers[idx] == quizQuestions[idx].correctIndex
            }
            val result = ProgressManager.saveQuizResult(
                context = context,
                bookId = bookId,
                quizIndex = quizIndex,
                score = score,
                total = quizQuestions.size
            )
            quizResult = result
            showResult = true
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Column {
                        Text(
                            "📝 آزمون ${quizIndex + 1}",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 16.sp
                        )
                        Text(
                            bookTitle,
                            fontSize = 11.sp,
                            color = Color.White.copy(alpha = 0.85f),
                            maxLines = 1
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = {
                        if (!showResult && currentQuestionIndex > 0) {
                            showExitDialog = true
                        } else {
                            onBack()
                        }
                    }) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            "Back",
                            tint = Color.White
                        )
                    }
                },
                actions = {
                    if (!showResult && !isLoading && errorMessage == null) {
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
                                formatTime(timeElapsed),
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
            when {
                isLoading -> LoadingView()
                errorMessage != null -> ErrorView(errorMessage!!, onBack)
                showResult && quizResult != null -> ResultView(
                    result = quizResult!!,
                    timeElapsed = timeElapsed,
                    onRetry = {
                        currentQuestionIndex = 0
                        selectedAnswer = -1
                        userAnswers = emptyList()
                        showResult = false
                        quizResult = null
                        timeElapsed = 0
                        loadQuestions()
                    },
                    onBack = onBack,
                    onContinue = {
                        onQuizCompleted(true)
                        onBack()
                    }
                )
                quizQuestions.isNotEmpty() &&
                        currentQuestionIndex < quizQuestions.size -> QuestionView(
                    question = quizQuestions[currentQuestionIndex],
                    questionNumber = currentQuestionIndex + 1,
                    totalQuestions = quizQuestions.size,
                    selectedAnswer = selectedAnswer,
                    onSelectAnswer = { selectedAnswer = it },
                    onNext = {
                        userAnswers = userAnswers + selectedAnswer
                        selectedAnswer = -1
                        currentQuestionIndex++
                    },
                    onSkip = {
                        userAnswers = userAnswers + (-1)
                        selectedAnswer = -1
                        currentQuestionIndex++
                    }
                )
            }
        }
    }

    if (showExitDialog) {
        AlertDialog(
            onDismissRequest = { showExitDialog = false },
            title = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("⚠️", fontSize = 24.sp)
                    Spacer(Modifier.width(8.dp))
                    Text("خروج از آزمون", fontWeight = FontWeight.Bold, fontSize = 16.sp)
                }
            },
            text = {
                Text(
                    "اگر الان خارج بشی، پیشرفت این آزمون از بین می‌ره.\n\nمطمئنی؟",
                    fontSize = 13.sp,
                    lineHeight = 20.sp
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        showExitDialog = false
                        onBack()
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFC62828))
                ) {
                    Text("بله، خارج شو", color = Color.White, fontWeight = FontWeight.Bold)
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { showExitDialog = false }) {
                    Text("ادامه آزمون", color = PrimaryColor)
                }
            }
        )
    }
}

// ============================================================
// Loading View
// ============================================================
@Composable
private fun LoadingView() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            CircularProgressIndicator(color = PrimaryColor, strokeWidth = 4.dp)
            Spacer(Modifier.height(16.dp))
            Text(
                "در حال آماده‌سازی سوالات...",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

// ============================================================
// Error View
// ============================================================
@Composable
private fun ErrorView(message: String, onBack: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(32.dp)
        ) {
            Text("😞", fontSize = 64.sp)
            Spacer(Modifier.height(16.dp))
            Text(
                message,
                fontSize = 14.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
            Spacer(Modifier.height(20.dp))
            Button(
                onClick = onBack,
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
            ) {
                Text("بازگشت", color = Color.White, fontWeight = FontWeight.Bold)
            }
        }
    }
}

// ============================================================
// Question View
// ============================================================
@Composable
private fun QuestionView(
    question: QuizQuestion,
    questionNumber: Int,
    totalQuestions: Int,
    selectedAnswer: Int,
    onSelectAnswer: (Int) -> Unit,
    onNext: () -> Unit,
    onSkip: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(14.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(modifier = Modifier.padding(14.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "سوال $questionNumber از $totalQuestions",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryColor
                    )
                    Text(
                        "${((questionNumber - 1) * 100) / totalQuestions}%",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                }
                Spacer(Modifier.height(8.dp))
                LinearProgressIndicator(
                    progress = { (questionNumber - 1).toFloat() / totalQuestions },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(6.dp)
                        .clip(RoundedCornerShape(3.dp)),
                    color = PrimaryColor,
                    trackColor = Color(0xFFE0E0E0)
                )
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(18.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Box(
                    modifier = Modifier
                        .size(42.dp)
                        .clip(CircleShape)
                        .background(
                            Brush.linearGradient(listOf(PrimaryColor, SecondaryColor))
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "$questionNumber",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Spacer(Modifier.height(16.dp))

                Text(
                    question.question,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF1A1A2E),
                    lineHeight = 24.sp
                )
            }
        }

        Spacer(Modifier.height(16.dp))

        Column(
            modifier = Modifier.padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            question.options.forEachIndexed { index, option ->
                OptionCard(
                    label = optionLabel(index),
                    text = option,
                    selected = selectedAnswer == index,
                    onClick = { onSelectAnswer(index) }
                )
            }
        }

        Spacer(Modifier.height(24.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            OutlinedButton(
                onClick = onSkip,
                modifier = Modifier
                    .weight(1f)
                    .height(52.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Gray)
            ) {
                Icon(Icons.Filled.SkipNext, null, modifier = Modifier.size(18.dp))
                Spacer(Modifier.width(6.dp))
                Text("رد کردن", fontSize = 13.sp, fontWeight = FontWeight.Bold)
            }

            Button(
                onClick = onNext,
                enabled = selectedAnswer >= 0,
                modifier = Modifier
                    .weight(2f)
                    .height(52.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryColor,
                    disabledContainerColor = Color(0xFFBDBDBD)
                )
            ) {
                Text(
                    if (questionNumber == totalQuestions) "پایان آزمون" else "سوال بعدی",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.width(6.dp))
                Icon(
                    if (questionNumber == totalQuestions) Icons.Filled.Check
                    else Icons.Filled.ArrowForward,
                    null,
                    modifier = Modifier.size(18.dp)
                )
            }
        }

        Spacer(Modifier.height(30.dp))
    }
}

// ============================================================
// Option Card
// ============================================================
@Composable
private fun OptionCard(
    label: String,
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val scale by animateFloatAsState(
        targetValue = if (selected) 1.02f else 1f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy),
        label = "scale"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .scale(scale)
            .clickable { onClick() },
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selected) PrimaryColor.copy(alpha = 0.12f)
            else Color.White
        ),
        border = if (selected) BorderStroke(2.dp, PrimaryColor) else null,
        elevation = CardDefaults.cardElevation(
            if (selected) 4.dp else 2.dp
        )
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
                        if (selected) PrimaryColor
                        else PrimaryColor.copy(alpha = 0.1f)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    label,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = if (selected) Color.White else PrimaryColor
                )
            }

            Spacer(Modifier.width(12.dp))

            Text(
                text,
                fontSize = 14.sp,
                color = Color(0xFF1A1A2E),
                fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Normal,
                modifier = Modifier.weight(1f),
                lineHeight = 20.sp
            )

            if (selected) {
                Icon(
                    Icons.Filled.CheckCircle,
                    null,
                    tint = PrimaryColor,
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    }
}

// ============================================================
// Result View
// ============================================================
@Composable
private fun ResultView(
    result: ProgressManager.QuizResult,
    timeElapsed: Int,
    onRetry: () -> Unit,
    onBack: () -> Unit,
    onContinue: () -> Unit
) {
    val infiniteTransition = rememberInfiniteTransition(label = "result")
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 1.1f,
        animationSpec = infiniteRepeatable(
            animation = tween(800, easing = FastOutSlowInEasing),
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

        Box(
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(
                    Brush.linearGradient(
                        if (result.passed) listOf(
                            Color(0xFF4CAF50), Color(0xFF66BB6A)
                        ) else listOf(
                            Color(0xFFF44336), Color(0xFFEF5350)
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                if (result.passed) "🎉" else "😔",
                fontSize = 56.sp,
                modifier = Modifier.scale(scale)
            )
        }

        Spacer(Modifier.height(20.dp))

        Text(
            if (result.passed) "آفرین! قبول شدی" else "متأسفانه قبول نشدی",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = if (result.passed) Color(0xFF2E7D32) else Color(0xFFC62828)
        )

        Spacer(Modifier.height(8.dp))

        Text(
            if (result.passed) "درس‌های بعدی برات باز شد! 🎁" else "برای ادامه باید قبول بشی",
            fontSize = 13.sp,
            color = Color.Gray,
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(24.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(
                            Brush.linearGradient(
                                if (result.passed) listOf(
                                    Color(0xFF4CAF50), Color(0xFF81C784)
                                ) else listOf(
                                    Color(0xFFF44336), Color(0xFFE57373)
                                )
                            )
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            "${result.percent}%",
                            fontSize = 48.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            "${result.score} از ${result.total} درست",
                            fontSize = 14.sp,
                            color = Color.White.copy(alpha = 0.95f)
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))

                StatRow("🎯 حد قبولی", "${ProgressManager.PASS_THRESHOLD_PERCENT}%")
                Spacer(Modifier.height(8.dp))
                StatRow("🏆 بهترین نمره", "${result.bestScore}%")
                Spacer(Modifier.height(8.dp))
                StatRow("🔁 تعداد تلاش‌ها", "${result.attempts}")
                Spacer(Modifier.height(8.dp))
                StatRow("⏱️ زمان صرف‌شده", formatTime(timeElapsed))

                if (!result.passed) {
                    Spacer(Modifier.height(16.dp))
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF3E0)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("💡", fontSize = 20.sp)
                            Spacer(Modifier.width(8.dp))
                            Text(
                                "نگران نباش! سوالات جدید برات آماده‌ست. موفق می‌شی!",
                                fontSize = 12.sp,
                                color = Color(0xFFE65100),
                                lineHeight = 18.sp
                            )
                        }
                    }
                }

                if (result.passed) {
                    Spacer(Modifier.height(16.dp))
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFE8F5E9)),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text("🎁", fontSize = 20.sp)
                            Spacer(Modifier.width(8.dp))
                            Text(
                                "درس‌های بعدی باز شدند + ۲۰ ستاره جایزه!",
                                fontSize = 12.sp,
                                color = Color(0xFF2E7D32),
                                lineHeight = 18.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }
            }
        }

        Spacer(Modifier.height(20.dp))

        if (result.passed) {
            Button(
                onClick = onContinue,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
            ) {
                Icon(Icons.Filled.Check, null, modifier = Modifier.size(22.dp))
                Spacer(Modifier.width(8.dp))
                Text(
                    "ادامه یادگیری",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        } else {
            Button(
                onClick = onRetry,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
            ) {
                Icon(Icons.Filled.Refresh, null, modifier = Modifier.size(22.dp))
                Spacer(Modifier.width(8.dp))
                Text(
                    "تلاش دوباره (سوالات جدید)",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }
        }

        Spacer(Modifier.height(10.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            shape = RoundedCornerShape(14.dp)
        ) {
            Text(
                "بازگشت به فصل‌ها",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryColor
            )
        }

        Spacer(Modifier.height(30.dp))
    }
}

// ============================================================
// Stat Row
// ============================================================
@Composable
private fun StatRow(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(label, fontSize = 13.sp, color = Color.Gray)
        Text(
            value,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = PrimaryColor
        )
    }
}

// ============================================================
// Helpers
// ============================================================
private fun optionLabel(index: Int): String = when (index) {
    0 -> "A"
    1 -> "B"
    2 -> "C"
    3 -> "D"
    else -> "${index + 1}"
}

private fun formatTime(seconds: Int): String {
    val m = seconds / 60
    val s = seconds % 60
    return "%02d:%02d".format(m, s)
}