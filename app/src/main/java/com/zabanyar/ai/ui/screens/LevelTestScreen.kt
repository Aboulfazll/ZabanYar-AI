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
import androidx.compose.material.icons.filled.Refresh
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
import com.zabanyar.ai.data.LevelTestRepository
import com.zabanyar.ai.data.UserManager

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelTestScreen(
    onBack: () -> Unit,
    onTestComplete: () -> Unit = {}
) {
    val context = LocalContext.current

    var questions by remember { mutableStateOf(LevelTestRepository.getRandomQuestions(20)) }

    var currentQuestion by remember { mutableIntStateOf(0) }
    var selectedOption by remember { mutableStateOf<Int?>(null) }
    var score by remember { mutableIntStateOf(0) }
    var showResult by remember { mutableStateOf(false) }
    var wrongAnswers by remember { mutableStateOf(mutableListOf<Int>()) }

    if (showResult) {
        val percentage = if (questions.isNotEmpty()) (score.toFloat() / questions.size * 100).toInt() else 0
        val level = LevelTestRepository.calculateLevel(score, questions.size)
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
            "BEGINNER" -> "تو تازه شروع کردی! از کتاب‌های مبتدی شروع کن."
            "INTERMEDIATE" -> "سطح تو متوسطه! می‌تونی کتاب‌های متوسط رو بخونی."
            else -> "عالی! سطح تو پیشرفته‌ست. کتاب‌های چالشی رو امتحان کن."
        }

        LaunchedEffect(Unit) {
            UserManager.updateLevel(context, level)
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
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
                        Text(levelEmoji, fontSize = 80.sp)
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
                                .size(130.dp)
                                .clip(CircleShape)
                                .background(Color.White.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                Text(
                                    "$percentage%",
                                    fontSize = 36.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.White
                                )
                                Text(
                                    "$score از ${questions.size}",
                                    fontSize = 12.sp,
                                    color = Color.White.copy(alpha = 0.9f)
                                )
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(16.dp))

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
                                        modifier = Modifier.padding(top = 3.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }

            Spacer(Modifier.height(20.dp))

            Button(
                onClick = {
                    questions = LevelTestRepository.getRandomQuestions(20)
                    currentQuestion = 0
                    selectedOption = null
                    score = 0
                    showResult = false
                    wrongAnswers = mutableListOf()
                },
                modifier = Modifier.fillMaxWidth().height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
            ) {
                Icon(Icons.Filled.Refresh, null, modifier = Modifier.size(20.dp))
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
                onClick = {
                    onTestComplete()
                    onBack()
                },
                modifier = Modifier.fillMaxWidth().height(54.dp),
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
        return
    }

    if (questions.isEmpty() || currentQuestion >= questions.size) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text("سوالی موجود نیست")
        }
        return
    }

    val q = questions[currentQuestion]
    val progress = (currentQuestion + 1).toFloat() / questions.size

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "🎯 تست سطح",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 17.sp
                    )
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
                colors = TopAppBarDefaults.topAppBarColors(containerColor = PrimaryColor)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F7FA))
                .padding(padding)
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
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

                    Spacer(Modifier.height(12.dp))

                    LinearProgressIndicator(
                        progress = { progress },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(6.dp)
                            .clip(RoundedCornerShape(3.dp)),
                        color = PrimaryColor,
                        trackColor = PrimaryColor.copy(alpha = 0.15f)
                    )
                }
            }

            Spacer(Modifier.height(20.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
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
                                else wrongAnswers.add(currentQuestion)
                            }
                        },
                    shape = RoundedCornerShape(14.dp),
                    colors = CardDefaults.cardColors(containerColor = bgColor),
                    border = androidx.compose.foundation.BorderStroke(2.dp, borderColor),
                    elevation = CardDefaults.cardElevation(2.dp)
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
                                .background(PrimaryColor.copy(alpha = 0.15f)),
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
                            modifier = Modifier.weight(1f)
                        )
                    }
                }
            }

            Spacer(Modifier.height(24.dp))

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
                    colors = ButtonDefaults.buttonColors(containerColor = PrimaryColor)
                ) {
                    Text(
                        if (currentQuestion < questions.size - 1) "سوال بعدی ←"
                        else "دیدن نتیجه 🎉",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                }
            }

            Spacer(Modifier.height(20.dp))
        }
    }
}